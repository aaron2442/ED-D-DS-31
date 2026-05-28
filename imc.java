import java.util.Scanner;

public class imc {
public static void main(String[] args) {    

Scanner scanner = new Scanner(System.in);


// Entrada de datos

System.out.println("--- Calculadora de IMC ---");

System.out.print("Ingrese su peso en kg (ej. 70.5): ");

double peso = scanner.nextDouble();



System.out.print("Ingrese su altura en metros (ej. 1.75): ");

double altura = scanner.nextDouble();


// Cálculo del IMC

double imc = peso / (altura * altura);



// Mostrar resultado

System.out.printf("Su IMC es: %.2f\n", imc);

// Clasificación según la OMS

System.out.print("Su clasificación es: ");

if (imc < 18.5) {

System.out.println("Bajo peso");

} else if (imc >= 18.5 && imc < 25) {

    System.out.println("Peso normal");

} else if (imc >= 25 && imc < 30) {

System.out.println("Sobrepeso");

} else {

System.out.println("Obesidad");

}
scanner.close();

}

}

