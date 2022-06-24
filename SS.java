package IOsystems;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class SS {

    public static void main(String[] args){

        String readyText = "cow" + System.getProperty("line.separator");
        readyText += "корова " + System.getProperty("line.separator");
        readyText += "ძროხა";

        try {

            WriteIT(new PrintStream(System.out), readyText, "UTF-8" );

        }catch(UnsupportedEncodingException e) {

            System.err.println("Encoding is wrong");

        }catch(IOException e) {

            System.err.println("System failure accured");

        }

    }

    public static void WriteIT(OutputStream os, String text, String  encoding) throws IOException {

        if(text != null && text != "") {

            OutputStreamWriter x = new OutputStreamWriter(os, encoding);
            BufferedWriter xbf = new BufferedWriter(x);

            xbf.write(text);

            xbf.close();
        }else {
            System.err.println("Text is empty");
        }

    }

}