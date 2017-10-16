import java.io.*;
import java.util.Arrays;

public class ShowBikes {

    public static void main(String[] args) throws IOException {

        LinkedList linkedList = new LinkedList();

        //1 upload file to file stream
        File file1 = new File("./bicycle.txt");
        FileReader fr1 = new FileReader(file1);
        BufferedReader bf1 = new BufferedReader(fr1);

        File file2 = new File("./bicycle2.txt");
        FileReader fr2 = new FileReader(file2);
        BufferedReader bf2 = new BufferedReader(fr2);

        File file3 = new File("./bicycle3.txt");
        FileReader fr3 = new FileReader(file3);
        BufferedReader bf3 = new BufferedReader(fr3);

        //String  s = null;


        int i = 0;


        try {
            while (bf1.readLine() != null) {
                //2 create Bicycle ohbject for eacb line
                String s = bf1.readLine();
                String[] splitStr = s.split("\\s+");
                System.out.println(Arrays.toString(splitStr));
                Bicycle bicycle = new Bicycle(
                        splitStr[1],
                        Integer.parseInt(splitStr[3]),
                        Integer.parseInt(splitStr[5]),
                        Integer.parseInt(splitStr[7]),
                        splitStr[9],
                        splitStr[11]
                );

                linkedList.insertFirst(i, bicycle);
                i++;
            }//end while
            while (bf2.readLine() != null) {
                //2 create Bicycle ohbject for eacb line
                String s = bf1.readLine();
                String[] splitStr = s.split("\\s+");
                Bicycle bicycle = new Bicycle(
                        splitStr[1],
                        Integer.parseInt(splitStr[3]),
                        Integer.parseInt(splitStr[5]),
                        Integer.parseInt(splitStr[7]),
                        splitStr[9],
                        splitStr[11]
                );

                linkedList.insertFirst(i, bicycle);
                i++;
            }//end while
            while (bf3.readLine() != null) {
                //2 create Bicycle ohbject for eacb line
                String s = bf1.readLine();
                String[] splitStr = s.split("\\s+");
                Bicycle bicycle = new Bicycle(
                        splitStr[1],
                        Integer.parseInt(splitStr[3]),
                        Integer.parseInt(splitStr[5]),
                        Integer.parseInt(splitStr[7]),
                        splitStr[9],
                        splitStr[11]
                );

                linkedList.insertFirst(i, bicycle);
                i++;
            }//end while
            System.out.print("counter: " + i);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

        //linked list changes or sorting below
        System.out.println("size " + linkedList.size());

        //want 2 attributes

    }
}
