package UrlDecoded;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Decode {
    public static void main(String[] args) throws Exception {
        String url =  "%D0%A2%D0%B5%D1%80%D0%BC%D0%B8%D0%BD%D0%B0%D1%82%D0%BE%D1%80";
        String result = java.net.URLDecoder.decode(url,"UTF-8");
        //String decResult = java.net.URLEncoder.encode(query, "UTF-8");
        //System.out.println(result);
        //System.out.println("Терминатор".length());
        System.out.println(url.length());

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Code\\fl1.txt"));
        writer.write(result);
        writer.close();
        System.out.println("fin");

    }
}
