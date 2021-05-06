package management_traffic.behavioral;

import management_traffic.creat.Motor;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementMotor implements IManagementVehicle<Motor> {
    ArrayList<Motor> listMotor = new ArrayList<>();
    transient Scanner sc = new Scanner(System.in);

    public Motor input() {
        Motor motor = new Motor();
        System.out.println("Enter the brand");
        motor.setBrand(sc.nextLine());

        System.out.println("Enter the bornYear");
        motor.setBornYear(sc.nextLine());

        System.out.println("Enter the price");
        motor.setPrice(sc.nextLine());

        System.out.println("Enter the color");
        motor.setColor(sc.nextLine());

        System.out.println("Enter the id");
        motor.setId(sc.nextLine());

        System.out.println("Enter the horse");
        motor.setHorse(Integer.parseInt(sc.nextLine()));

        return motor;
    }

    @Override
    public void add(ArrayList<Motor> list) {
        System.out.println("Enter quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter add index " + (i + 1));
            list.add(i, input());
        }
        show(list);
    }

    @Override
    public void edit(ArrayList<Motor> list) {
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
    public void delete(ArrayList<Motor> list) {
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
    public void find(ArrayList<Motor> list) {

    }

    @Override
    public void sort(ArrayList<Motor> list) {

    }

    @Override
    public void show(ArrayList<Motor> list) {
        for (Motor motor :
                list) {
            System.out.println(motor);
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
                    this.add(listMotor);
                    break;
                case 2:
                    this.edit(listMotor);
                    break;
                case 3:
                    this.delete(listMotor);
                    break;
                case 4:
                    this.find(listMotor);
                    break;
                case 5:
                    System.exit(5);
            }
        } while (choice != 5);
    }
}
