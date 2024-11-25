package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        double num1 = 10;
        double num2 = 3;

        double resultadoSuma = Utilidades.suma(num1, num2);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        double resultadoResta = Utilidades.resta(num1, num2);
        System.out.println("Resultado de la resta: " + resultadoResta);

        double resultadoMultiplicacion = Utilidades.multiplicacion(num1, num2);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);
        
        double resultadoDivision = Utilidades.multiplicacion(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0");
        } 
        System.out.println("Resultado de la division: "+resultadoDivision);
    }
    
}
