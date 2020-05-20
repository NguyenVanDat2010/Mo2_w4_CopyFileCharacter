import java.io.*;

public class CopyFileCharacter {
    public static void main(String[] args) {
        try {
            //Tao file

            BufferedWriter bufferedWriter=new BufferedWriter(new  FileWriter("input.txt"));
            bufferedWriter.write("Hello world");
            bufferedWriter.close();

            //Đọc và copy file
            FileReader fileReader = new FileReader("input.txt");
            FileWriter fileWriter = new FileWriter("output.txt");
//            File file=new File(String.valueOf(fileReader));
//            if (file.exists()) {
//                throw new Exist
//            }
            int copy;
            int count=0;
            while ((copy = fileReader.read()) != -1) {
                fileWriter.write(copy);
                count++;
            }
            System.out.println("Sô ký tự trong file: "+count);
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
