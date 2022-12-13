package Lab9;

import java.io.*;

public class Lab9_Practice1 {
    static BufferedReader in;
    static {
        try {
            in = new BufferedReader(new FileReader("src/Lab9/IN.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static BufferedWriter writer;
    static {
        try {
            writer = new BufferedWriter(new FileWriter("src/Lab9/OUT.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            int temp;
            boolean x=false,y=false;
            while((temp=in.read())!=-1 && !(temp>='A' && temp<='Z')){
                Capital(temp);
                if(temp>='a' && temp<='z') break;
            }
            while ((temp=in.read())!=-1) {
                writer.write(temp);
                if(x){
                    temp = in.read();
                    if (!(temp>='a' && temp<='z')){
                        writer.write(temp);
                        temp = in.read();
                    }
                    Capital(temp);
                }
                x = temp == '.' && !y;
                y= temp >= 'A' && temp <= 'Z';
            }
            in.close();
            writer.close();
        } catch (IOException e)
        {
            System.out.println("There is no such file!");
        }
    }

    private static void Capital(int temp) throws IOException {
        if (temp>='a' && temp<='z') {
            writer.write(temp-'a'+'A');
        }
        else {
            writer.write(temp);
        }
    }
}