package Administracion_empleados;
import java.util.Arrays;
import java.util.Scanner;
import Administracion_empleados.modelos.*;

public class Application {
    public static String clear = "\033\143";
    private static String[] attributes = {"FILA","Nombre","Edad","Salario","Departamento"}; 
    private static Empleado[] employeeList = {};
    private static Empleado[] temporalList = {};
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        System.out.print(clear); // Limpia la consola
        boolean continuar;
        do {
            continuar = menu(tScan);
        } while (continuar);
        System.out.print(clear);
        System.out.println("¡Hasta pronto!");
    }

    public static void showEmployees(Empleado[] empleados){
        System.out.printf("%s\n",Arrays.toString(attributes));
        int rows = 0;
        for (Empleado employee : empleados) {
            rows++;
            System.out.printf("| %d | %s | %d | %f | %s |\n",rows,employee.getName(),employee.getAge(),employee.getSalary(),employee.getDepartment());
        }
    }

    public static Empleado[] filterEmployees(int attribute,Empleado[] empleados, Scanner sc){
        Empleado[] newArray={};
        System.out.printf("%s\nIngrese el atribute que está buscando: ",clear);
        switch (attribute) {
            case 1:
                String searchName = sc.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getName().equals(searchName)){
                        int len = newArray.length;
                        newArray = Arrays.copyOf(newArray,len+1);
                        newArray[len] = empleado;
                    }
                }
                break;
            case 2:
                int searchAge = Integer.valueOf(sc.nextLine());
                for (Empleado empleado : empleados) {
                    if (empleado.getAge()==searchAge){
                        int len = newArray.length;
                        newArray = Arrays.copyOf(newArray,len+1);
                        newArray[len] = empleado;
                    }
                }
                break;
            case 3:
                float searchSal = Float.valueOf(sc.nextLine());
                for (Empleado empleado : empleados) {
                    if (empleado.getSalary()==searchSal){
                        int len = newArray.length;
                        newArray = Arrays.copyOf(newArray,len+1);
                        newArray[len] = empleado;
                    }
                }
                break;
            case 4:
                String searchDep = sc.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getDepartment().equals(searchDep)){
                        int len = newArray.length;
                        newArray = Arrays.copyOf(newArray,len+1);
                        newArray[len] = empleado;
                    }
                }
                break;
            default:
                System.out.print(clear);
                System.out.println("La opción ingresada no es válida");
                newArray = Arrays.copyOf(empleados,empleados.length);
                break;
        }
        return newArray;
    }

    public static Empleado[] sortEmployees(int attribute, Empleado[] empleados){
        int n = empleados.length;
        switch (attribute) {
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (empleados[j].getName().compareToIgnoreCase(empleados[j+1].getName()) > 0) {
                            Empleado temp = empleados[j];
                            empleados[j] = empleados[j + 1];
                            empleados[j + 1] = temp;
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (empleados[j].getAge()>empleados[j+1].getAge()) {
                            Empleado temp = empleados[j];
                            empleados[j] = empleados[j + 1];
                            empleados[j + 1] = temp;
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (empleados[j].getSalary()>empleados[j+1].getSalary()) {
                            Empleado temp = empleados[j];
                            empleados[j] = empleados[j + 1];
                            empleados[j + 1] = temp;
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (empleados[j].getDepartment().compareToIgnoreCase(empleados[j+1].getDepartment()) > 0) {
                            Empleado temp = empleados[j];
                            empleados[j] = empleados[j + 1];
                            empleados[j + 1] = temp;
                        }
                    }
                }
                break;
            default:
                System.out.print(clear);
                System.out.println("La opción ingresada no es válida");
                break;
        }
        return empleados;
    }
 
    public static int searchName(String name, Empleado[] empleados){
        for (int i = 0;i<empleados.length;i++) {
            if (empleados[i].getName().equals(name)){
                return i;
            }
        }
        System.out.println("The name was not found.");
        return -1;
    }

    public static boolean menu(Scanner sc) {
        System.out.print(clear); // Limpia la consola
        boolean output = true;
        System.out.println("___GESTOR DE EMPLEADOS___\nSeleccione la opción que desea ejectar\n1. Mostrar empleados\n2. Crear nuevo empleado\n3. Filtrar empleados\n4. Ordenar empleados\n5. Incrementar salario.\n6. Limpiar filtros.\n7. Salir.");
        int option = Integer.valueOf(sc.nextLine());
        if (employeeList.length==0&&option!=2) {
            System.out.println("Para poder hacer cualquier operación debes ingresar primero un empleado al sistema.");
        }else{
            switch (option) {
                case 1:
                    showEmployees(temporalList);
                    break;
                case 2:
                    System.out.print(clear); // Limpia la consola
                    temporalList = Arrays.copyOf(employeeList,employeeList.length+1);
                    System.out.print("Ingrese el nómbre, edad, salario, y departamento: ");
                    String name = sc.nextLine();
                    int age = Integer.valueOf(sc.nextLine());
                    float salary = Float.valueOf(sc.nextLine());
                    String dep = sc.nextLine();
                    temporalList[employeeList.length] = new Empleado(name, age, salary,dep);
                    employeeList = Arrays.copyOf(temporalList,temporalList.length);
                    break;
                case 3:
                    System.out.print(clear); // Limpia la consola
                    System.out.print("Ingrese el atributo por el que desea filtrar:\n1. nómbre.\n2. edad.\n3. salario.\n4. departamento.\n ");
                    int att = Integer.valueOf(sc.nextLine());
                    temporalList = filterEmployees(att, temporalList, sc);
                    System.out.println("__Lista filtrada__ ");
                    showEmployees(temporalList);
                    break;
                case 4:
                    System.out.print(clear); // Limpia la consola
                    System.out.print("Ingrese el atributo por el que desea filtrar:\n1. nómbre.\n2. edad.\n3. salario.\n4. departamento.\n ");
                    int atr = Integer.valueOf(sc.nextLine());
                    temporalList = sortEmployees(atr, temporalList);
                    System.out.println("__Lista Ordenada__ ");
                    showEmployees(temporalList);
                    break;
                case 5:
                    System.out.print(clear); // Limpia la consola
                    System.out.print("Ingrese el nombre del empleado a incrementarle : ");
                    String sName = sc.nextLine();
                    System.out.print("Ingrese el porcentaje de incremento deseado: ");
                    float percentage = Float.valueOf(sc.nextLine());
                    int pos = searchName(sName, employeeList);
                    employeeList[pos].increaseSalary(percentage);
                    pos = searchName(sName, temporalList);
                    temporalList[pos].increaseSalary(percentage);
                    break;
                case 6:
                    temporalList = Arrays.copyOf(employeeList, employeeList.length);
                    break;
                case 7:
                    output = false;
                    break;
    
                default:
                System.out.println("Opción no válida");
                    break;
            }
        }
        
        System.out.print("Presiona enter para continuar: ");
        sc.nextLine();
        return output;
    }


}
