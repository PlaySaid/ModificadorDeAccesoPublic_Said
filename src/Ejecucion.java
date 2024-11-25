public class Ejecucion {

    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Said", 20000);
        
        System.out.println(emp1.nombre);
        System.out.println(emp1.getSalario());
        
        /*
        Nos deja llamar correctamente a la propiedad nombre porque es publica.
        Nos deja llamar salario, ya que aunque es private, tiene un getter de acceso publico.
        */
    }
    
}
