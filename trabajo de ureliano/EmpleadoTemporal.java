/**
 * Representa a un empleado temporal con contrato por tiempo definido.
 * Reglas:
 * - Salario fijo mensual sin bonos ni beneficios adicionales.
 */
public class EmpleadoTemporal extends Empleado {

    /**
     * Constructor del empleado temporal.
     * @param nombre      Nombre del empleado
     * @param salarioBase Salario fijo mensual
     */
    public EmpleadoTemporal(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    /**
     * Retorna el salario base sin ningún bono ni beneficio.
     * @return Salario bruto (igual al salario base)
     */
    @Override
    public double calcularSalario() {
        // Empleado temporal no tiene bonos ni beneficios adicionales
        return salarioBase;
    }
}


