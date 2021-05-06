package management_traffic.behavioral;

import management_traffic.creat.Carry;
import management_traffic.creat.Motor;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementCarry implements IManagementVehicle<Carry> {
    transient Scanner sc = new Scanner(System.in);
    ArrayList<Carry> listCarries = new ArrayList<>();

    public Carry input() {
        Carry newCarry = new Carry();

        System.out.println("Enter the name");
        newCarry.setBrand(sc.nextLine());

        System.out.println("Enter the bornYear");
        newCarry.setBornYear(sc.nextLine());

        System.out.println("Enter the price");
        newCarry.setPrice(sc.nextLine());

        System.out.println("Enter the color");
        newCarry.setColor(sc.nextLine());

        System.out.println("Enter the id");
        newCarry.setId(sc.nextLine());

        System.out.println("Enter the payload");
        newCarry.setPayload(Float.parseFloat(sc.nextLine()));

        return newCarry;
    }

    @Override
    public void add(ArrayList<Carry> list) {
        System.out.println("Enter quantity want to add");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter add index " + (i + 1));
            list.add(i, input());
        }
        show(list);
    }

    @Override
    public void edit(ArrayList<Carry> list) {
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
    public void delete(ArrayList<Carry> list) {
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
    public void find(ArrayList<Carry> list) {

    }

    @Override
    public void sort(ArrayList<Carry> list) {

    }

    @Override
    public void show(ArrayList<Carry> list) {
        for (Carry motor :
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
                    this.add(listCarries);
                    break;
                case 2:
                    this.edit(listCarries);
                    break;
                case 3:
                    this.delete(listCarries);
                    break;
                case 4:
                    this.find(listCarries);
                    break;
                case 5:
                    System.exit(5);
            }
        } while (choice != 5);
    }
}
