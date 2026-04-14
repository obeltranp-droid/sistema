public class EmpleadoAsalariado extends Empleado {
    private int años;

    public EmpleadoAsalariado(String nombre, double salarioBase, int años) {
        super(nombre, salarioBase);
        this.años = años;
    }

    @Override
    public double calcularSalario() {
        double salario = salarioBase;

        if (años > 5) {
            salario *= 1.10;
        }

        salario += 1000000; // bono alimentación

        return salario;
    }
}