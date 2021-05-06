package management_traffic.myFileIO;

import java.io.*;

public class FileCSV {
    public void reader(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        fileReader.read();
        fileReader.close();
    }

    public void writer(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        String str = "";
        fileWriter.write(str);
        fileWriter.close();
    }
}
