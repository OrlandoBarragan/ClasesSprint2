package Repository;

import Entities.*;

public class main {
    public static void main(String args[]){
        System.out.println("Probando");
        Empresa em1 = new Empresa("Mintic","Bogota","12345", 123854);
        System.out.println(em1.getNombre());
        System.out.println(em1.getDireccion());
        System.out.println(em1.getTelefono());
        System.out.println(em1.getNit());

        Empleado ep1 = new Empleado("Orlando Barragan", "orlando.barragan88@outlook.com", "Ministerio", "Administrador");
        System.out.println(ep1.getNombre());
        System.out.println(ep1.getCorreo());
        System.out.println(ep1.getEmpresa());
        System.out.println(ep1.getRol());

        MovimientoDinero mv1 = new MovimientoDinero(1500000, "Pago administracion", "OrlandoBarragan88");
        System.out.println(mv1.getMonto());
        System.out.println(mv1.getConcepto());
        System.out.println(mv1.getUsuario());

    }
}
