import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ShowBikes {

    public static void main(String[] args) throws IOException {

        LinkedList linkedList = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        File file1 = new File("./bicycle.txt");
        FileReader fr1 = new FileReader(file1);
        BufferedReader bf1 = new BufferedReader(fr1);

        int i = 0;
        Stream stream =  bf1.lines();
        Object arr[] = stream.toArray();

        //System.out.println("arr length: " +arr.length);

        //System.out.println("arr: " + arr[0]);



          try{

              for(Object obj: arr){
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

          }
          catch (Exception e){
              System.out.println(e.toString());
          }

        //these should match
        //System.out.println("counter: " + i);
        System.out.println("original size " + linkedList.size());


        //create test bike
        int wheelTest = 54;
        int gearTest =  4;
        int heightTest = 1;
        String typeTestMountain = "mountain"; //had to change from mountain_bike to mountain i think the _ is messing with the comparison
        String typeTestRace =   "race";  //race_bike
        String typeTestStreet = "street"; //street_bike
        String colorTest = "black";
        String constructionMaterial = "steel";

        //find all bikes that match
        try {

            LinkedList sortedList = linkedList.sortByAttr(gearTest, wheelTest, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList.size());
            sortedList.print();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        try {

            LinkedList sortedList1 = linkedList.sortByAttribute1(typeTestMountain, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList1.size());
            sortedList.print();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        try {

            LinkedList sortedList2 = linkedList.sortByAttribute2(typeTestMountain, gearTest, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList2.size());
            sortedList.print();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        try {

            LinkedList sortedList3 = linkedList.sortByAttribute3(typeTestMountain, gearTest, wheelTest, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList3.size());
            sortedList.print();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        try {

            LinkedList sortedList4 = linkedList.sortByAttribute4(typeTestMountain, gearTest, wheelTest, heightTest, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList4.size());
            sortedList.print();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        try {

            LinkedList sortedList6 = linkedList.sortByAttribute5(typeTestMountain, gearTest, wheelTest, heightTest, colorTest, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList6.size());
            sortedList.print();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        try {

            LinkedList sortedList7 = linkedList.sortByAttribute6(typeTestMountain, gearTest, wheelTest, heightTest, colorTest, constructionMaterial, linkedList);
            System.out.println("Sorted List size by gear, wheel: " + sortedList7.size());
            sortedList.print();

        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        }

    
        LinkedList linkedList1 = linkedList.sortByAttr2(typeTestMountain, linkedList);
        System.out.println("Sorted List size by mountain bikes: " + linkedList1.size());

        LinkedList linkedList2 = linkedList.sortByAttr2(typeTestRace, linkedList);
        System.out.println("Sorted List size by race bikes: " + linkedList1.size());

        LinkedList linkedList3 = linkedList.sortByAttr2(typeTestStreet, linkedList);
        System.out.println("Sorted List size by street bikes: " + linkedList1.size());


//        System.out.println("full list");
         // linkedList.print();

        //want 2 attributes from user
//         System.out.println("Enter wheel size integers only");
//         int wheelSize = scanner.nextInt();
//         System.out.println("Enter gear number integers only");
//         int gear = scanner.nextInt();






    }
}
