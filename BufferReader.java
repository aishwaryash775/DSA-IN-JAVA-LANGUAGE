import java.io.*;

public class BufferReader {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(name);

        int number = Integer.parseInt(br.readLine());
        System.out.println(number);

        //float input 
        float f= Float.parseFloat(br.readLine());
        System.out.println(f);  
        br.close();
    }
    }

   
   
   
   
   
   
   
   
   