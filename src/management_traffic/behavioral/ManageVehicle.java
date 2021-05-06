package management_traffic.behavioral;

import java.util.Scanner;

public class ManageVehicle {
    transient Scanner sc = new Scanner(System.in);

    ManagementMotor motor = new ManagementMotor();
    ManagementCar car = new ManagementCar();
    ManagementCarry carry = new ManagementCarry();

    public void menu() {
        int choice;
        do {
            System.out.println("Menu:" +
                    "\n1. motor" +
                    "\n2. car" +
                    "\n3. carry" +
                    "\n4. exit" +
                    "\nInvite your choice");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    this.motor.menu();
                    break;
                case 2:
                    this.car.menu();
                    break;
                case 3:
                    this.carry.menu();
                    break;
                case 4:
                    System.exit(4);
            }
        } while (choice != 4);
    }
}
