package Enums.servicios;
import java.util.Arrays;
import java.util.Scanner;

import Enums.enums.EstadoPedido;
import Enums.modelos.*;

public class PedidoServicio {
    private Pedido[] listaDePedidos={};
    public Pedido[] getListaDePedidos() {
        return listaDePedidos;
    }
    public void setListaDePedidos(Pedido[] listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }
    public static Pedido crearPedido(Scanner sc){
        System.out.println("Ingrese el número de pedido, el cliente, el estado y la lista de productos: ");
        int numPed = Integer.valueOf(sc.nextLine());
        String client = sc.nextLine();
        String[] products={};
        boolean flag = true;
        do {
            products = Arrays.copyOf(products, products.length);
            System.out.print("\033\143");
            System.out.println("Escribe el producto: ");
            products[products.length] = sc.nextLine();
            System.out.println("¿Quieres continuar?\n1. Sí\n2. No");
            flag = Integer.valueOf(sc.nextLine())!=2;
        } while (flag);
        EstadoPedido status;
        System.out.println("Ingrese el estado del pedido: \n1. PENDIENTE\n2. ENVIADO\n3. ENTREGADO.");
        switch (Integer.valueOf(sc.nextLine())) {
            case 1:
                status = EstadoPedido.PENDIENTE;
                break;
            case 2:
                status = EstadoPedido.ENVIADO;
                break;
            case 3:
                status = EstadoPedido.ENTREGADO;
                break;  
            default:
                status = EstadoPedido.PENDIENTE;
                break;
        }
        return new Pedido(numPed, client,status , products);
    }
    public static Pedido actualizarEstadoPedido(Pedido input,EstadoPedido status){
        input.setStatus(status);
        return input;
    }
    public static Pedido[] buscarPedido(Pedido[] pedidos,EstadoPedido status){
        Pedido[] output = {};
        for (Pedido pedido : pedidos) {
            if(pedido.getStatus().equals(status)){
                output = Arrays.copyOf(output,output.length+1);
                output[output.length] = pedido;
            }
        }
        return output;
    }
    public static void listaPedidos(){

    }
}
