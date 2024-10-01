import java.io.IOException;
import java.io.InputStream;
public class Main {
    public static int sumOfStream(InputStream inputStream)throws IOException {
        int sum = 0;
        int currentByte;
        while ((currentByte = inputStream.read()) != -1){
            sum += currentByte;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException{
        String input = "1,2,4,10";
        InputStream inputStream = new java.io.ByteArrayInputStream(input.getBytes());
        Main streamSum = new Main();
        int result = streamSum.sumOfStream(inputStream);
        System.out.println(result);

    }



    }


