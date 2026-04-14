public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalario();

        double saludPension = salarioBruto * 0.04;
        double arl = salarioBruto * 0.01;

        double salarioNeto = salarioBruto - saludPension - arl;

        if (salarioNeto < 0) {
            throw new IllegalArgumentException("Salario negativo no permitido");
        }

        return salarioNeto;
    }
}