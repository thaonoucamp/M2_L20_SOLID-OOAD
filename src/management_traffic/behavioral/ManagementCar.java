package management_traffic.behavioral;

import management_traffic.creat.Car;
import management_traffic.creat.Motor;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementCar implements IManagementVehicle<Car> {
    ArrayList<Car> listCars = new ArrayList<>();
    transient Scanner sc = new Scanner(System.in);


    public Car input() {
        Car car = new Car();
        System.out.println("Enter the brand");
        car.setBrand(sc.nextLine());

        System.out.println("Enter the bornYear");
        car.setBornYear(sc.nextLine());

        System.out.println("Enter the price");
        car.setPrice(sc.nextLine());

        System.out.println("Enter the color");
        car.setColor(sc.nextLine());

        System.out.println("Enter the id");
        car.setId(sc.nextLine());

        System.out.println("Enter the horse");
        car.setChair(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the horse");
        car.setEngine(sc.nextLine());

        return car;
    }

    @Override
    public void add(ArrayList<Car> list) {
        System.out.println("Enter quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter add index " + (i + 1));
            list.add(i, input());
        }
        show(list);
    }

    @Override
    public void edit(ArrayList<Car> list) {
        System.out.println("Enter id want to edit");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.set(i, input());
                break;
            }
        }
        show(list);
    }

    @Override
    public void delete(ArrayList<Car> list) {
        System.out.println("Enter id want to delete");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(list.get(i));
                break;
            }
        }
        show(list);
    }

    @Override
    public void find(ArrayList<Car> list) {

    }

    @Override
    public void sort(ArrayList<Car> list) {

    }

    @Override
    public void show(ArrayList<Car> list) {
        for (Car car :
                list) {
            System.out.println(car);
        }
        sort(list);
    }
    public void menu() {
        int choice;
        do {
            System.out.println("Menu:" +
                    "\n1. add" +
                    "\n2. edit" +
                    "\n3. delete" +
                    "\n4. find" +
                    "\n5. exit" +
                    "\n Invite your choice");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    this.add(listCars);
                    break;
                case 2:
                    this.edit(listCars);
                    break;
                case 3:
                    this.delete(listCars);
                    break;
                case 4:
                    this.find(listCars);
                    break;
                case 5:
                    System.exit(5);
            }
        } while (choice != 5);
    }

}
