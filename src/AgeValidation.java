import java.util.Scanner;
public class AgeValidation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AGE_VALIDATION = 18;
        // Se crea una constante la cual será la edad fija para tener acceso al programa
            System.out.println("Ingresa tu edad");
            int age = scanner.nextInt();
        
        
        if (age >= AGE_VALIDATION) {
            System.out.println("Access granted");
            //si el dato ingresado es mayor o igual a 18 se ejecutará este comando
        } else {
            System.out.println("Access denied");
            //si el dato ingresado es menor a 18 se ejecutará este comando
        }
    }

}
