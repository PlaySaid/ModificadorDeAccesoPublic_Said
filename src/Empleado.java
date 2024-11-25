public class Empleado {
    public String nombre;
    private Double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(Double salario) {
        if (salario == null || salario < 0) {
            throw new IllegalArgumentException("El salario debe ser un numero mayor a 0");
        }
        this.salario = salario;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario: "+salario);
    }
}
