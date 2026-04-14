/**
 * Representa a un empleado que gana salario base más comisión por ventas.
 * Reglas:
 * - Salario = salarioBase + (ventas * porcentajeComision)
 * - Si ventas > $20.000.000: bono adicional del 3% sobre las ventas.
 * - Bono de alimentación de $1.000.000 por ser empleado permanente.
 */
public class EmpleadoComision extends Empleado {

    private double ventas;
    private double porcentajeComision;

    /**
     * Constructor del empleado por comisión.
     * @param nombre              Nombre del empleado
     * @param salarioBase         Salario base mensual
     * @param ventas              Total de ventas realizadas en el mes
     * @param porcentajeComision  Porcentaje de comisión sobre las ventas (ej: 0.05 = 5%)
     */
    public EmpleadoComision(String nombre, double salarioBase,
                            double ventas, double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    /**
     * Calcula el salario bruto con comisión y bonos.
     * @return Salario bruto total
     */
    @Override
    public double calcularSalario() {
        // Validación: las ventas no pueden ser negativas
        if (ventas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas.");
        }

        double salario = salarioBase + (ventas * porcentajeComision);

        // Bono extra del 3% si supera los $20.000.000 en ventas
        if (ventas > 20_000_000) {
            salario += ventas * 0.03;
        }

        // Bono de alimentación para empleados permanentes
        salario += 1_000_000;

        return salario;
    }
}
