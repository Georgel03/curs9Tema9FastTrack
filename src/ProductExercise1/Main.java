package ProductExercise1;

import java.sql.SQLOutput;

public class Main {
    
    public static void main(String[] args) {

        //EX 1

       Product product = new Product(24.32, "Becuri faruri", "Led", 8);
        System.out.println(String.format("Produsul %s cu descierea %s, costa %.2f lei si este valabil in %d cantitati",
                product.name, product.description, product.price, product.quantity));
        product.setPrice(29.99d);
        System.out.println(String.format("Produsul %s costa acuma %.2f lei", product.name, product.price));
        Cosmetics cosmetics = new Cosmetics(45.50, "Strugurel", "Cu Visine", 10, "Visiniu", 1);
        System.out.println(String.format("Ati cumparat %s %s, valabil in %d cantitate, cantarind un %.2f gram si de culoare %s", cosmetics.name, cosmetics.description, cosmetics.quantity, cosmetics.weight, cosmetics.color));
        Elecronics elecronics = new Elecronics(200, "Placa sunet", "ASUS", 12, "USB", 8.2, 4.1, 1.02, 3.6);
        System.out.println(String.format("%s %s %s costa %.2f avand dimensiunile %.2f, %.2f, %.2f ",
                elecronics.name, elecronics.description, elecronics.type, elecronics.price, elecronics.height, elecronics.length, elecronics.width));

        System.out.println("------------------------------------------------------------------------------------");


        //EX 2





    }
}