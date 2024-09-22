package src.AmazonProduct;

public class Main{

    public static void main(String[] args){
        Product laptop = new Product("Dell Inspiron 15", 700, "shorturl.at/beBMN");
        
        laptop.setName("Dell Inspiron 15");
        //laptop.setPrice(700);
        laptop.setImage("shorturl.at/beBMN");
        laptop.addToCart();
        System.out.println("Product's name is: " + laptop.getName());
        System.out.println("Product's price is: $ " + laptop.getPrice());
        System.out.println("Product's image is: " + laptop.getImage());

    }
}
