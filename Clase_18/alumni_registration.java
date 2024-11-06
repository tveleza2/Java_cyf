package Clase_18;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class alumni_registration {
    private static String[] alumni={};
    private static float[] grades={};
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear); // Limpia la consola
        Scanner scanner = new Scanner(System.in);
        
        int op;
        do {
            // System.out.println(phrase.isEmpty() ? "___ No hay oración cargada ___" : ("___ La oración es: "+phrase+" ___"));
            System.out.println("Opciones");
            System.out.println("1 - Registrar alumno");
            System.out.println("2 - Mostrar todos los alumnos y notas.");
            System.out.println("3 - Mostrar promedio de notas.");
            System.out.println("4 - Buscar por nombre.");
            System.out.println("5 - Modificar por nombre.");
            System.out.println("6 - Eliminar por nombre.");
            System.out.println("7 - Cerrar sesión.");
            
            System.out.print("Seleccione una opcion del menu : ");
            op = scanner.nextInt();
            scanner.nextLine();
            if(alumni.length == 0 && op!=1){
                System.out.print(clear);
                System.out.println("Primero tienes que registrar algún alumno.");
                continue;}
            System.out.print(clear);
            switch (op) {
                case 1:
                    System.out.print("¿Cuántos alumnos extra quiere agregar?: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    alumni = Arrays.copyOf(alumni, alumni.length+size);
                    grades = Arrays.copyOf(grades, grades.length+size);
                    System.out.print(clear);
                    System.out.println("Ingrese los nombres de cada uno de los alumnos: ");
                    String name="";
                    float grade;
                    for (int i = 0; i < size; i++) {
                        name = "";
                        do{
                            name = scanner.nextLine();
                            if (name.isEmpty()) {
                                System.out.print(clear);
                                System.out.println("El nombre no puede ser vacío.");
                            }
                        }while(name.isEmpty());
                        alumni[i+alumni.length-size]=name;
                    }
                    System.out.println("Ingrese las notas correspondientes: ");
                    for (int i = 0; i < size; i++) {
                        do{
                            grade = -1;
                            try {
                                grade = scanner.nextFloat();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                scanner.nextLine();
                                grade = -2;
                                System.out.print(clear);
                                System.out.println("Las notas deben ser números.");
                            }
                            if ((grade<0 || grade>10) && grade!=-2) {
                                System.out.print(clear);
                                System.out.println("La nota debe estar entre 0 y 10.");
                            }
                        }while(grade<0 || grade>10);
                        grades[i+alumni.length-size] = grade;
                    }
                    break;
                case 2:
                    System.out.println("Alumnos | Notas");
                    for (int i = 0; i < alumni.length; i++) {
                        System.out.print(alumni[i]+"  |  ");
                        System.out.printf("%.2f.\n",grades[i]);
                    }
                    break;
                case 3:
                    float sum = 0;
                    for (float gr: grades) {
                        sum = sum+gr;
                    }
                    System.out.printf("La nota promedio del curso es: %.3f. \n",sum/grades.length);
                    break;
                case 4:
                    System.out.print("Ingresa el nombre del estudiante a buscar: ");
                    String searchName = scanner.nextLine();
                    int location = -1;
                    for (int i = 0; i < alumni.length; i++) {
                        if(alumni[i].equals(searchName)){
                            location = i;
                            break;
                        }   
                    }
                    String message = location!=-1?"La nota del estudiante %s es %.2f. \n":"El estudiante %s no aparece en la base de datos. \n";
                    float gradeLocal = location!=-1?grades[location]:-1;
                    System.out.printf(message,searchName,gradeLocal);
                    break;
                case 5:
                    System.out.print("Ingresa el nombre del estudiante a modificar: ");
                    String searchName5 = scanner.nextLine();
                    int location5 = -1;
                    for (int i = 0; i < alumni.length; i++) {
                        if(alumni[i].equals(searchName5)){
                            location5 = i;
                            break;
                        }   
                    }
                    if (location5!=-1) {
                        float grade5;
                        do{
                            grade5 = -1;
                            System.out.printf("Ingrese la nota que desea añadirle a \"%s\" :",searchName5);
                            try {
                                grade5 = scanner.nextFloat();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                grade5 = -2;
                                System.out.println("La nota tiene que ser un número");
                                scanner.nextLine();
                            }
                            if ((grade5<0 || grade5>10) && grade5!=-2) {
                                System.out.print(clear);
                                System.out.println("La nota debe estar entre 0 y 10.");
                            }
                        }while(grade5<0 || grade5>10);
                        grades[location5] = grade5;
                    }else{
                        System.out.println("El estudiante no está en el sistema.");
                    }
                    break;
                case 6:
                    System.out.print("Ingresa el nombre del estudiante a eliminar: ");
                    String searchName6 = scanner.nextLine();
                    int location6 = -1;
                    for (int i = 0; i < alumni.length; i++) {
                        if(alumni[i].equals(searchName6)){
                            location6 = i;
                            break;
                        }   
                    }
                    if (location6!=-1) {
                        String[] auxAlu = new String[alumni.length-1];
                        float[] auxGrades = new float[grades.length-1];
                        for (int i = 0; i < auxAlu.length; i++) {
                            auxAlu[i] = i<location6?alumni[i]:alumni[i+1];
                            auxGrades[i] = i<location6?grades[i]:grades[i+1];
                        }
                        alumni = auxAlu.clone();
                        grades = auxGrades.clone();
                        System.out.println("El estudiante ha sido borrado.");
                        
                    }else{
                        System.out.println("El estudiante no está en el sistema.");
                    }
                    break;
                case 7:
                    System.out.println("Eligio salir!");
                    break;
                default:
                    System.out.println("Ingreso una opcion que es invalida/incorrecta");
                    break;
            }

            System.out.println("Presione enter para continuar.");
            scanner.nextLine();
            System.out.print(clear); // Limpia la consola
        } while (op != 7);
        
        scanner.close();
    }
}
