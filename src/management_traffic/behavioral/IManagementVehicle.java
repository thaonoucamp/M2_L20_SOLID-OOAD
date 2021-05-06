package management_traffic.behavioral;

import management_traffic.creat.Car;
import management_traffic.creat.Carry;
import management_traffic.creat.Motor;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface IManagementVehicle<T> {

    void add(ArrayList<T> list);

    void edit(ArrayList<T> list);

    void delete(ArrayList<T> list);

    void find(ArrayList<T> list);

    void sort(ArrayList<T> list);

    void show(ArrayList<T> list);
}
