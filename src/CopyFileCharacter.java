import java.io.*;

public class CopyFileCharacter {
    public static void main(String[] args) {
        try {
            //Tao và thêm dữ liệu cho file

            BufferedWriter bufferedWriter=new BufferedWriter(new  FileWriter("input.txt"));
            bufferedWriter.write("Hello world");
            bufferedWriter.close();

            //check file tồn tại hay ko
            File file=new File("input.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            //Đọc và copy file
//            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
//            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter fileWriter=new BufferedWriter(new FileWriter("output.txt"));

            int copy;
            int count=0;
            while ((copy = bufferedReader.read()) != -1) {
                fileWriter.write(copy);
                count++;
            }
            System.out.println("Sô ký tự trong file: "+count);
            bufferedReader.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại");
        }
    }
}
