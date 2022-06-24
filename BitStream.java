package IOsystems;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class BitStream {

    public static void main(String[] args) {

        try {

            System.out.println(Readtext(new FileInputStream("Hello.txt"), "UTF-8"));

        } catch (FileNotFoundException e) {

            System.err.println("File not Found");

        } catch (UnsupportedEncodingException e) {

            System.err.println("Encoding is wrong");

        } catch (IOException e) {

            System.err.println("Error occured during reading the file!");

        }

    }

    public static String Readtext(InputStream is, String encoding) throws IOException {

        InputStreamReader x = new InputStreamReader(is, encoding);
        BufferedReader xbf = new BufferedReader(x);

        String txt = "";
        String ans = "";

        txt = xbf.readLine();


        do {
            if (txt != null) {
                ans += txt;
                txt = xbf.readLine();
            }

            if (txt != null) {
                ans += System.getProperty("line.separator");

            }
        }
            while (txt != null) ;


            xbf.close();

            return ans;


        }
    }

