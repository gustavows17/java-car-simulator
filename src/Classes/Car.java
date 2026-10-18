package Classes;

public class Car {
    private final String model;
    private final String brand;
    private int gear = 0;
    private int speed = 0;
    private boolean on = false;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void turnOn() {
        if (!on) {
            on = true;
            System.out.printf("%s %s foi ligado(a).\n", brand, model);
        } else {
            System.out.println("Veículo já está ligado.");
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("O veículo já está desligado.");
            return;
        }

        if (gear != 0 || speed != 0) {
            System.out.println("O veículo precisa estar em ponto morto e parado para ser desligado.");
            return;
        }

        on = false;

        System.out.printf("%s %s foi desligado.\n", brand, model);
    }

    public void accelerate() {
        if (!on) {
            System.out.println("O veículo está desligado, por favor ligue-o antes de acelerar.");
            return;
        }

        if (gear == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        int maxSpeed = gear * 20;

        if (speed >= maxSpeed || speed >= 120) {
            System.out.println("Velocidade máxima da marcha atingida.");
            return;
        }

        speed += 5;
        System.out.println("Velocidade atual " + speed + " km/h");
    }

    public void decelerate() {
        if (!on) {
            System.out.println("O veículo está desligado, por favor ligue-o antes de frear.");
            return;
        }

        if (speed > 0) {
            speed -= 5;
            System.out.println("Velocidade atual: " + speed + " km/h");
        } else {
            System.out.println("Veículo já está parado.");
        }
    }

    public void turnLeft() {
        if (!on) {
            System.out.println("O veículo está desligado, por favor ligue-o antes de virar.");
            return;
        }
        if (speed >= 1 && speed <= 40) {
            System.out.println("O veículo está virando à esquerda.");
        }  else {
            System.out.println("Para virar, a velocidade precisa estar entre 1 e 40 km/h");
        }
    }

    public void turnRight() {
        if (!on) {
            System.out.println("O veículo está desligado, por favor ligue-o antes de virar.");
            return;
        }
        if (speed >= 1 && speed <= 40) {
            System.out.println("O veículo está virando à direita.");
        }  else {
            System.out.println("Para virar, a velocidade precisa estar entre 1 e 40 km/h");
        }
    }

    public void checkSpeed() {
        if (!on) {
            System.out.println("O veículo está desligado, por favor ligue-o antes de verificar a velocidade.");
            return;
        }

        System.out.println("Velocidade atual: " + speed + " km/h");
    }

    public void shiftUp() {
        if (!on) {
            System.out.println("O veículo está desligado, por favor ligue-o antes de subir a marcha.");
            return;
        }

        if (gear == 6) {
            System.out.println("O veículo já está na sexta marcha.");
            return;
        }

        int nextGear = gear + 1;
        int minSpeed = (nextGear - 1) * 20 ;
        int maxSpeed = nextGear * 20;

        if (nextGear == 1 || (speed >= minSpeed && speed <= maxSpeed)) {
            gear++;
            System.out.println("Marcha atual: " + gear);
        } else {
            System.out.println("Velocidade incompatível para a próxima marcha.");
        }
    }

    public void shiftDown() {
        if (!on) {
            System.out.println("O veículo está desligado.");
            return;
        }

        if (gear == 0) {
            System.out.println("Veículo já está em ponto morto.");
            return;
        }

        int maxSpeed = (gear - 1) * 20;

        if (speed <= maxSpeed) {
            gear--;
            System.out.println("Marcha atual: " + gear);
        } else {
            System.out.println("Velocidade muito alta para reduzir a marcha.");
        }
    }

    public void displayInfo() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Marcha atual: " + gear);
        System.out.println("Velocidade atual: " + speed + " km/h");
        System.out.println("Status do veículo: " + (on ? "Ligado" : "Desligado"));
    }

    public void options() {
        System.out.println("\n=== MENU DO VEÍCULO ===");
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("1 - Ligar o veículo");
        System.out.println("2 - Desligar o veículo");
        System.out.println("3 - Acelerar o veículo");
        System.out.println("4 - Diminuir a velocidade do veículo");
        System.out.println("5 - Virar para esquerda");
        System.out.println("6 - Virar para direita");
        System.out.println("7 - Verificar velocidade");
        System.out.println("8 - Subir marcha");
        System.out.println("9 - Descer marcha");
        System.out.println("10 - Exibir informações do veículo");
        System.out.println("0 - Sair\n");
        System.out.println("Digite o número da operação desejada: ");
    }


}
