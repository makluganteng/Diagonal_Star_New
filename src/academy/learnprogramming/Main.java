package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
            if (number < 5)
                System.out.println("Invalid Value");
            else {
                for (int i = 1; i <= number; i++) { // for loop for each line
                    for (int j = 1; j <= number; j++) { // for loop what to fill in each line
                        if (i == 1 || i == number || j == 1 || j == number || i == j || j == (number - i + 1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }


       /* if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 ){
                        System.out.print("*");
                    }else if(i == number){
                        System.out.println("-");
                    }else if (j == 1){
                        System.out.println("+");
                    }else if(j == number){
                        System.out.println("=");
                    }else if(i == j){
                        System.out.println("0");
                    }else if(j == (number - i + 1)){
                        System.out.println("1");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    } */
    }
}
