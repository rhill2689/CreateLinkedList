import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class ShowBikes {

    public static void main(String[] args) throws IOException {

        LinkedList linkedList = new LinkedList();

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
                  linkedList.insertFirst(i, bicycle);
              }

          }
          catch (Exception e){
              System.out.println(e.toString());
          }

        //these should match
        System.out.println("counter: " + i);
        System.out.println("size " + linkedList.size());

        //want 2 attributes

        //create test


    }
}
