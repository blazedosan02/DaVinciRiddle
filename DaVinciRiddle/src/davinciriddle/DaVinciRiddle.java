package davinciriddle;

public class DaVinciRiddle {

    public static void main(String[] args) {

        int num = 0;

        String input = null;

        for (int b = 0; b < 99999; b++) {

            num++;

            input = Integer.toString(num);

          //  System.out.println(input);
            //System.out.println("countend");
            int countzero = 0;
            int countone = 0;
            int counttwo = 0;
            int countthree = 0;
            int countfour = 0;
            int countfive = 0;
            int countsix = 0;
            int countseven = 0;
            int counteight = 0;
            int countnine = 0;

            boolean flag = false;

            //int conv = Integer.parseInt(input);
            int arrayone[] = new int[input.length()];

//            for (int i = 0; i < arrayone.length; i++) {
//
//
//                arrayone[i] = input.charAt(i);
//
//                // System.out.println(arrayone[i] - '0');
//            }
           // System.out.println("");
            for (int i = 0; i < arrayone.length; i++) {

                arrayone[i] = input.charAt(i);

                if (arrayone[i] - '0' == 0) {

                    countzero++;

                    // System.out.println("The Count for 0 is " + countzero);
                } else if (arrayone[i] - '0' == 1) {

                    countone++;

                    // System.out.println("The Count for 1 is " + countone);
                } else if (arrayone[i] - '0' == 2) {

                    counttwo++;

                } else if (arrayone[i] - '0' == 3) {

                    countthree++;

                } else if (arrayone[i] - '0' == 4) {

                    countfour++;

                } else if (arrayone[i] - '0' == 5) {

                    countfive++;

                } else if (arrayone[i] - '0' == 6) {

                    countsix++;

                } else if (arrayone[i] - '0' == 7) {

                    countseven++;

                } else if (arrayone[i] - '0' == 8) {

                    counteight++;

                } else if (arrayone[i] - '0' == 9) {

                    countnine++;

                }

               // System.out.println(arrayone[i] - '0');
            }

//            System.out.println("The Count for 0 is " + countzero);
//            System.out.println("The Count for 1 is " + countone);
//            System.out.println("The Count for 2 is " + counttwo);
//            System.out.println("The Count for 3 is " + countthree);
//            System.out.println("The Count for 4 is " + countfour);
//            System.out.println("The Count for 5 is " + countfive);
//            System.out.println("The Count for 6 is " + countsix);
//            System.out.println("The Count for 7 is " + countseven);
//            System.out.println("The Count for 8 is " + counteight);
//            System.out.println("The Count for 9 is " + countnine);
            //int arraycomp[] = new int[]{countzero, countone, counttwo, countthree, countfour, countfive, countsix, countseven, counteight, countnine};
            int arraycomp[] = new int[]{countzero, countone,counttwo,countthree,countfour};

         //   System.out.println("");
//        for (int i = 0; i < arraycomp.length; i++) {
//
//            arrayone[i] = input.charAt(i);
//
//            if (arraycomp[i] == arrayone[i] - '0') {
//
//                // System.out.println("Matches");
//            } else {
//                // System.out.println("Not Matches");
//
//                flag = false;
//
//            }
//
//        }
            StringBuilder s = new StringBuilder();
            StringBuilder t = new StringBuilder();

            for (int i : arraycomp) {
                s.append(i); //add all the ints to a string
            }

            int arr1 = Integer.parseInt(s.toString());

           //  System.out.println("Arrayyy is"+arr1);
            //System.out.println("Arrayyy is"+ b);
            if (arr1 == b + 1) {

                flag = true;

            }

            if (flag) {

                System.out.println("Number is Autobiographical");

                System.out.println("Number is " + input);

            } else {
                // System.out.println("Number is NOT Auto");
            }

        }

    }
}
