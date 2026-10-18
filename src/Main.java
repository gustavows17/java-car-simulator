import Classes.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a marca do seu veículo?");
        String brand = sc.nextLine();
        System.out.println("Qual é o modelo do seu veículo?");
        String model = sc.nextLine();

        Car car = new Car(brand, model);
        System.out.println("Veículo cadastrado: " + car.getBrand() + " " + car.getModel());

        car.options();
        int operation = sc.nextInt();

        while (operation != 0) {
            switch (operation) {
                case 1:
                    car.turnOn();
                    break;
                case 2:
                    car.turnOff();
                    break;
                case 3:
                    car.accelerate();
                    break;
                case 4:
                    car.decelerate();
                    break;
                case 5:
                    car.turnLeft();
                    break;
                case 6:
                    car.turnRight();
                    break;
                case 7:
                    car.checkSpeed();
                    break;
                case 8:
                    car.shiftUp();
                    break;
                case 9:
                    car.shiftDown();
                    break;
                case 10:
                    car.displayInfo();
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
            car.options();
            operation = sc.nextInt();
        }
        System.out.println("Saindo do programa...");

        sc.close();
    }
}
