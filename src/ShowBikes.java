import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;

public class ShowBikes {

    public static void main(String[] args) throws Exception {

        LinkedList linkedList = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        File file1 = new File("./bicycle.txt");
        FileReader fr1 = new FileReader(file1);
        BufferedReader bf1 = new BufferedReader(fr1);

        int i = 0;
        Stream stream = bf1.lines();
        Object arr[] = stream.toArray();

        //System.out.println("arr length: " +arr.length);

        //System.out.println("arr: " + arr[0]);


        try {

            for (Object obj : arr) {
                String st = obj.toString();
                String[] splitStr = st.split("\\s+");
                Bicycle bicycle = new Bicycle(
                        splitStr[1],
                        Integer.parseInt(splitStr[3]),
                        Integer.parseInt(splitStr[5]),
                        Integer.parseInt(splitStr[7]),
                        splitStr[9],
                        splitStr[11]
                );
                i++;
                linkedList.insertFirst(i, bicycle);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //these should match
        //System.out.println("counter: " + i);
        System.out.println("original size " + linkedList.size());


        //create test bike
        int wheelTest = 54;
        int gearTest = 4;
        int heightTest = 1;
        String typeTestMountain = "mountain"; //had to change from mountain_bike to mountain i think the _ is messing with the comparison
        String typeTestRace = "race";  //race_bike
        String typeTestStreet = "street"; //street_bike
        String colorTest = "black";
        String constructionMaterial = "steel";

        //find all bikes that match
//        try {
//
//            LinkedList sortedList = linkedList.sortByAttr(gearTest, wheelTest, linkedList);
//            System.out.println("Sorted List size by gear, wheel: " + sortedList.size());
//            sortedList.print();
//        }
//        catch (Exception e){
//            System.out.println(e.toString());
//        }

        //type of bike the user wants
        System.out.println("What type of bike do you want?");
        String x = scanner.next();

        if (x.equals(typeTestMountain) || x.equals(typeTestRace) || x.equals(typeTestStreet)) {

            System.out.println("Another Attribute?");
            String a = scanner.next();

            if (a.equals("No") || a.equals("no")) {
                try {

                    LinkedList sortedList1 = linkedList.sortByAttribute1(x, linkedList);
                    System.out.println("Sorted List size by type: " + sortedList1.size());
                    sortedList1.print();
                    System.exit(0);

                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            } else if (a.equals("Yes") || a.equals("yes")) {
                System.out.println("How many gears?");
            } else {
                System.out.println("Incorrect response, this code will exit");
                System.exit(0);
            }
        } else {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }

        //the type of bike and the number of gears the user wants

        //int cc = Integer.parseInt(c);



            String cc = scanner.next();

            try {
                int c = Integer.parseInt(cc);
            } catch(NumberFormatException NFE) {
                System.out.println("Incorrect response, this code will exit");
                System.exit(0);
            }

            int c = Integer.parseInt(cc);

            try {


                if (cc.equals("4") || cc.equals("5") || cc.equals("6") || cc.equals("7") || cc.equals("8") || cc.equals("9") || cc.equals("10")) {

                    System.out.println("Another Attribute?");
                    String d = scanner.next();


                    if (d.equals("No") || d.equals("no")) {
                        try {
                            LinkedList sortedList2 = linkedList.sortByAttribute2(x, c, linkedList);
                            System.out.println("Sorted List size by type, gear: " + sortedList2.size());
                            sortedList2.print();
                            System.exit(0);

                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    } else if (d.equals("Yes") || d.equals("yes")) {
                        System.out.println("Wheelbase?");
                    } else {
                        System.out.println("Incorrect response, this code will exit");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Incorrect response, this code will exit");
                    System.exit(0);
                }
            } catch (NumberFormatException NFE) {
                System.out.println("Incorrect response, this code will exit");
            }




        //type of bike, number of gears, and the wheelbase the user wants

        String f = scanner.next();


        try {
            int h = Integer.parseInt(f);
        } catch(NumberFormatException NFE) {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }

        int h = Integer.parseInt(f);



        if (f.equals("36") || f.equals("42") || f.equals("48") || f.equals("54") || f.equals("60")) {

            System.out.println("Another Attribute?");
            String g = scanner.next();

            if (g.equals("No") || g.equals("no")) {
                try {

                    LinkedList sortedList3 = linkedList.sortByAttribute3(x, c, h, linkedList);
                    System.out.println("Sorted List size by type, gear, wheel: " + sortedList3.size());
                    sortedList3.print();
                    System.exit(0);

                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            } else if (g.equals("Yes") || g.equals("yes")) {
                System.out.println("Height?");
            } else {
                System.out.println("Incorrect response, this code will exit");
                System.exit(0);
            }
        } else {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }

        //type of bike, number of gears, the wheelbase, the height the user wants
        String k = scanner.next();


        try {
            int j = Integer.parseInt(k);
        } catch(NumberFormatException NFE) {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }

        int j = Integer.parseInt(k);


        if (k.equals("1") || k.equals("2") || k.equals("3") || k.equals("4")) {

            System.out.println("Another Attribute?");
            String z = scanner.next();

            if (z.equals("No") || z.equals("no")) {
                try {

                    LinkedList sortedList4 = linkedList.sortByAttribute4(x, c, h, j, linkedList);
                    System.out.println("Sorted List size by type, gear, wheel, height: " + sortedList4.size());
                    sortedList4.print();
                    System.exit(0);

                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            } else if (z.equals("Yes") || z.equals("yes")) {
                System.out.println("Color?");
            } else {
                System.out.println("Incorrect response, this code will exit");
                System.exit(0);
            }
        } else {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }

        //type of bike, number of gears, the wheelbase, the height, the color the user wants

        String p = scanner.next();

        if (p.equals("steel") || p.equals("red") || p.equals("blue") || p.equals("black")) {

            System.out.println("Another Attribute?");
            String m = scanner.next();

            if (m.equals("No") || m.equals("no")) {
                try {

                    LinkedList sortedList6 = linkedList.sortByAttribute5(x, c, h, j, p, linkedList);
                    System.out.println("Sorted List size by type, gear, wheel, height, color: " + sortedList6.size());
                    sortedList6.print();
                    System.exit(0);

                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            } else if (m.equals("Yes") || m.equals("yes")) {
                System.out.println("Construction material?");
            } else {
                System.out.println("Incorrect response, this code will exit");
                System.exit(0);
            }
        } else {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }

        //all the attributes the user wants

        String n = scanner.next();

        if (n.equals("carbon") || n.equals("aluminum") || n.equals("steel")) {

            try {

                LinkedList sortedList7 = linkedList.sortByAttribute6(x, c, h, j, p, n, linkedList);
                System.out.println("Sorted List size by type, gear, wheel, height, color, construction material: " + sortedList7.size());
                sortedList7.print();
                System.exit(0);

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } else {
            System.out.println("Incorrect response, this code will exit");
            System.exit(0);
        }



    LinkedList linkedList1 = new LinkedList();
        linkedList.sortByAttr2(typeTestMountain,linkedList);
        System.out.println("Sorted List size by mountain bikes: "+linkedList1.size());

    LinkedList linkedList2 = new LinkedList();
        linkedList.sortByAttr2(typeTestRace,linkedList);
        System.out.println("Sorted List size by race bikes: "+linkedList1.size());

    LinkedList linkedList3 = new LinkedList();
        linkedList.sortByAttribute2(typeTestStreet,gearTest,linkedList);
        System.out.println("Sorted List size by street bikes: "+linkedList1.size());
}
    }

//        System.out.println("full list");
         // linkedList.print();

        //want 2 attributes from user
//         System.out.println("Enter wheel size integers only");
//         int wheelSize = scanner.nextInt();
//         System.out.println("Enter gear number integers only");
//         int gear = scanner.nextInt();










