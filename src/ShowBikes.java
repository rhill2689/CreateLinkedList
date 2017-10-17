import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class ShowBikes {

    public static void main(String[] args) throws IOException {

        LinkedList linkedList = new LinkedList();

        //1 upload file to file stream
        File file1 = new File("./bicycle.txt");
        FileReader fr1 = new FileReader(file1);
        BufferedReader bf1 = new BufferedReader(fr1);

        int i = 0;
        Stream stream =  bf1.lines();
        Object arr[] = stream.toArray();

        System.out.println("arr length: " +arr.length);

        System.out.println("arr: " + arr[0]);



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
                  //System.out.println("bike: " + bicycle);
                  linkedList.insertFirst(i, bicycle);
              }

          }
          catch (Exception e){
              System.out.println(e.toString());
          }





//        try {
//            while (bf1.readLine() != null) {
//                //2 create Bicycle ohbject for eacb line
//                String s = bf1.readLine();
//                String[] splitStr = s.split("\\s+");
//                System.out.println(Arrays.toString(splitStr));
//                Bicycle bicycle = new Bicycle(
//                        splitStr[1],
//                        Integer.parseInt(splitStr[3]),
//                        Integer.parseInt(splitStr[5]),
//                        Integer.parseInt(splitStr[7]),
//                        splitStr[9],
//                        splitStr[11]
//                );
//
//                linkedList.insertFirst(i, bicycle);
//                i++;
//            }//end while
////            while (bf2.readLine() != null) {
////                //2 create Bicycle ohbject for eacb line
////                String s = bf1.readLine();
////                String[] splitStr = s.split("\\s+");
////                Bicycle bicycle = new Bicycle(
////                        splitStr[1],
////                        Integer.parseInt(splitStr[3]),
////                        Integer.parseInt(splitStr[5]),
////                        Integer.parseInt(splitStr[7]),
////                        splitStr[9],
////                        splitStr[11]
////                );
////
////                linkedList.insertFirst(i, bicycle);
////                i++;
////            }//end while
////            while (bf3.readLine() != null) {
////                //2 create Bicycle ohbject for eacb line
////                String s = bf1.readLine();
////                String[] splitStr = s.split("\\s+");
////                Bicycle bicycle = new Bicycle(
////                        splitStr[1],
////                        Integer.parseInt(splitStr[3]),
////                        Integer.parseInt(splitStr[5]),
////                        Integer.parseInt(splitStr[7]),
////                        splitStr[9],
////                        splitStr[11]
////                );
////
////                linkedList.insertFirst(i, bicycle);
////                i++;
////            }//end while
//
//        }
//        catch(Exception e){
//            System.out.println(e.toString());
//        }

        //linked list changes or sorting below
        System.out.print("counter: " + i);
        System.out.println("size " + linkedList.size());

        //want 2 attributes

    }
}
