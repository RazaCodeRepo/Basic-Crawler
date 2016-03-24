import edu.duke.*;
import java.io.*;

public class FindWebLink {
    public void findLink(String input){
        URLResource ur = new URLResource(input);
        for(String line : ur.words()){
            String lineLowerCase = line.toLowerCase();
            if(lineLowerCase.indexOf("youtube.com") != -1){
                int pos = lineLowerCase.indexOf("youtube.com");
                int beg = lineLowerCase.lastIndexOf("\"", pos);
                int end = lineLowerCase.indexOf("\"", pos + 1);
                System.out.println(lineLowerCase.substring(beg + 1, end));
            }
        }
    }
}
