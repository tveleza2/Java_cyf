package Clase_11;


public class imprimiendo {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        String[] myArray = {"a","e","i","o","u"};
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
