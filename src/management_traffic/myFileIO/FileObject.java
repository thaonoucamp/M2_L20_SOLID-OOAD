package management_traffic.myFileIO;

import management_traffic.creat.Vehicle;

import java.io.*;
import java.util.List;

public class FileObject {
    String filePath = "/Users/thaodangxuan/IdeaProjects/M2_L20_SOLID_OOAD/src/management_traffic/myFileIO/FileObject.java";

    public void writer(File file) {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            ObjectOutputStream objectInputStream = new ObjectOutputStream(outputStream);
            Vehicle vehicle = null;
            while (vehicle != null){
                objectInputStream.writeObject(vehicle);
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void reader(File file) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Vehicle obj = (Vehicle) objectInputStream.readObject();
    }
}
