package View;

import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);

    public Double inputX(String msg){
        System.out.println(msg);
        return scan.nextDouble();
    }
    public Double inputY(String msg){
        System.out.println(msg);
        return scan.nextDouble();
    }

    public int getChoise(){
        System.out.println("Choice operation:");
        System.out.println("\t1. Summarize");
        System.out.println("\t2. Subtract");
        System.out.println("\t3. Multiply");
        System.out.println("\t4. Divide");
        System.out.print(" >>> ");
        return scan.nextInt();
    }
}
