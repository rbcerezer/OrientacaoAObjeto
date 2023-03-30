package edu.dio.estruturaBasicaPOO;

public class RodarApp {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Branco");
        carro1.setModelo("Lamborghini V12");
        carro1.setCapacidadeTanque(63);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.8));

        Carro carro2 = new Carro("Preto","Audi A3", 68);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.8));

    }
}
