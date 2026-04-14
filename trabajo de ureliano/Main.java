public class Main {
    public static void main(String[] args) {

        Empleado e1 = new EmpleadoAsalariado("Juan", 3000000, 6);
        Empleado e2 = new EmpleadoPorHoras("Ana", 20000, 45, 2, true);
        Empleado e3 = new EmpleadoComision("Carlos", 1500000, 25000000, 0.05);
        Empleado e4 = new EmpleadoTemporal("Luis", 1800000);

        System.out.println("----- EMPLEADO ASALARIADO -----");
        System.out.println("Bruto: " + e1.calcularSalario());
        System.out.println("Neto: " + e1.calcularSalarioNeto());

        System.out.println("\n----- EMPLEADO POR HORAS -----");
        System.out.println("Bruto: " + e2.calcularSalario());
        System.out.println("Neto: " + e2.calcularSalarioNeto());

        System.out.println("\n----- EMPLEADO COMISION -----");
        System.out.println("Bruto: " + e3.calcularSalario());
        System.out.println("Neto: " + e3.calcularSalarioNeto());

        System.out.println("\n----- EMPLEADO TEMPORAL -----");
        System.out.println("Bruto: " + e4.calcularSalario());
        System.out.println("Neto: " + e4.calcularSalarioNeto());
    }
}