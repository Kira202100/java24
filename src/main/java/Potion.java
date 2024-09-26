import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public boolean prepare (){
        Scanner scanner = new Scanner(System.in);

        String[] ingredients = {"a", "b", "c"};
        System.out.println("Добро пожаловать в лабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую):");

        String input = scanner.nextLine();

//        System.out.println(input);

        String[] UserIngredients = input.split(",");
        System.out.println(Arrays.toString(UserIngredients));
        int count = 0;
        for (int i=0; i<UserIngredients.length; i++) {
            for (int j=0; j<ingredients.length; j++){
                if (UserIngredients[i].equals(ingredients[j])) {
                    count+=1;
                };
            }

        }
return ingredients.length==count;
    }

}
