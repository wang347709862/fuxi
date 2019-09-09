package io0;

//import sun.security.mscapi.KeyStore;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    private Reader r;

    public MyBufferedReader(Reader r){
        this.r=r;
    }

    public String readLine() throws IOException{
        StringBuilder sbr=new StringBuilder();

        int ch=0;
        while((ch=r.read())!=-1){
            if(ch=='\r'){
                continue;
            }else if(ch=='\n'){
                return sbr.toString();
            }else{
                sbr.append((char)ch);
            }
        }

        if (sbr.length() > 0) {
            return sbr.toString();
        }
        return null;

    }

    public void close() throws IOException{
        r.close();
    }
}
