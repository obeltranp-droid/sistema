/**
 * Representa a un empleado que se paga según las horas trabajadas.
 * Reglas:
 * - Hasta 40 horas: tarifa normal.
 * - Más de 40 horas: horas extras se pagan a 1.5x la tarifa.
 * - Si lleva más de 1 año y acepta el fondo: +2% de su salario al fondo de ahorro.
 */
public class EmpleadoPorHoras extends Empleado {

    private double horasTrabajadas;
    private double tarifaPorHora;
    private int años;           // Años de antigüedad
    private boolean aceptaFondo; // Si el empleado acepta el fondo de ahorro

    /**
     * Constructor del empleado por horas.
     * @param nombre          Nombre del empleado
     * @param tarifaPorHora   Valor de cada hora trabajada
     * @param horasTrabajadas Total de horas trabajadas en el mes
     * @param años            Años de antigüedad en la empresa
     * @param aceptaFondo     Si acepta el fondo de ahorro (true/false)
     */
    public EmpleadoPorHoras(String nombre, double tarifaPorHora, double horasTrabajadas,
                            int años, boolean aceptaFondo) {
        super(nombre, 0); // No tiene salario base fijo
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.años = años;
        this.aceptaFondo = aceptaFondo;
    }

    /**
     * Calcula el salario bruto según horas trabajadas.
     * Incluye pago de horas extras y fondo de ahorro si aplica.
     * @return Salario bruto calculado
     */
    @Override
    public double calcularSalario() {
        // Validación: las horas no pueden ser negativas
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }

        double salario;

        if (horasTrabajadas <= 40) {
            // Pago normal sin horas extras
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            // Pago normal + horas extras al 1.5x
            double horasExtras = horasTrabajadas - 40;
            salario = (40 * tarifaPorHora) + (horasExtras * tarifaPorHora * 1.5);
        }

        // Fondo de ahorro: +2% si lleva más de 1 año y acepta el beneficio
        if (años > 1 && aceptaFondo) {
            salario += salario * 0.02;
        }

        return salario;
    }
}
