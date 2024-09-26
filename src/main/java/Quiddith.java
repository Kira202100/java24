import java.util.Random;

public class Quiddith {
    public void getBalls() {
        for (int i = 1; i < 4; i++) {
            System.out.print("Запущен мяч под названием:");
            if (i == 1) {
                System.out.println("Quaffle");
            } else if (i == 2) {
                System.out.println("Bludger");
            } else if (i == 3) {
                System.out.println("Bludger");
            }
        }
    }

    public void playGame() {

        int i =1;
        int a =new Random().nextInt(1, 100);
        while ( i<=a){
            int control = new Random().nextInt(1, 100);
            if (a==control){
                System.out.println("Snitch");
                i++;
            } else {
                System.out.print("!");
            }

        }
    }
    public void sum() {
        int summ=222;
        for (int i=224; i<=444; i+=2) {
            summ=summ+i;


        }
        System.out.println(summ);
    }
}
