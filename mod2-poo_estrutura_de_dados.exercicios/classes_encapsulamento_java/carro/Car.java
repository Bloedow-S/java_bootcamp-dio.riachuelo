public class Car {
    private int speed = 0;
    private int gear = 0;
    private boolean ignitionActive = false;

    Car() {
    }

    public void start() {
        this.ignitionActive = true;
        System.out.println("Ligado");
    }

    public void turnOff() {
        if (this.gear == 0 && this.speed == 0) {
            this.ignitionActive = false;
            System.out.println("Desligado");
        } else {
            System.out.println("(!) - Para desligar: a marcha deve estar em ponto morto e a velocidade totalmente reduzida! -");
        }
    }

    public void disableFunctionality() {
        System.out.println("(!) - Nenhuma função executada, Carro desligado -");
    }

    public void upshift() {
        if (!ignitionActive) {
            disableFunctionality();
            return;
        }

        if (this.gear < 6) {
            gear += 1;
            System.out.printf("Marcha: %d\n", this.gear);
        } else {
            System.out.println("(!) - Limite máximo da marcha atingido -");
        }
    }

    public void downshift() {
        if (!ignitionActive) {
            disableFunctionality();
            return;
        }

        if (this.gear > 0) {
            if (this.gear > 1) { //decrementa 20km a cada descida de marcha, exceto na 1°
                this.speed -= 20;
            }
            gear -= 1;
            System.out.printf("Marcha: %d\n", this.gear);
        } else {
            System.out.println("(!) - Limite mínimo da marcha atingido -");
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (!ignitionActive) {
            disableFunctionality();
            return;
        }

        if (this.gear == 0) {
            System.out.println("Ação cancelada! Coloque a marcha 1");
            return;
        } else if (this.gear == 1 && this.speed == 20) {
            System.out.println("Limite! Para acelerar troque para a marcha 2.");
            return;
        } else if (this.gear == 2 && this.speed == 40) {
            System.out.println("Limite! Para acelerar troque para a marcha 3.");
            return;
        } else if (this.gear == 3 && this.speed == 60) {
            System.out.println("Limite! Para acelerar troque para a marcha 4.");
            return;
        } else if (this.gear == 4 && this.speed == 80) {
            System.out.println("Limite! Para acelerar troque para a marcha 5.");
            return;
        } else if (this.gear == 5 && this.speed == 100) {
            System.out.println("Limite! Para acelerar troque para a marcha 6.");
            return;
        } else if (this.gear == 6 && this.speed == 120) {
            System.out.println("Limite máximo de velocidade atingido!");
            return;
        }

        var speedNow = this.speed += 1;
        System.out.printf("Velocidade: %dkm\n", speedNow);
    }

    public void slowDown() {
        if (!ignitionActive) {
            disableFunctionality();
            return;
        }
        if (this.speed == 0) {
            System.out.println("Limite mínimo de velocidade atingido!");
            return;
        }

        var speedNow = this.speed -= 1;
        System.out.printf("Velocidade: %dkm\n", speedNow);
    }

    public void toTurn(String lateralDirection) {
        if (!ignitionActive) {
            disableFunctionality();
            return;
        }

        if (this.speed < 1 || this.speed > 40) {
            System.out.println("Mudar a direção exige: velocidade mínima de 1km e máxima de 40km");
            return;
        }

        System.out.printf(" - Seta %s acionada, veículo alterando a direção -\n", lateralDirection);
    }
}
