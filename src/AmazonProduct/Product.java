package src.AmazonProduct;

public class Product{
    
    private String name;
    private float price;
    private String image; //image URL link as String 

    
public Product(String name, float price, String image){
    this.name = name;
    this.price = price;
    this.image = image;
    }

    public void addToCart(){
        System.out.println("Adding " + name + " to cart...");
    }

    public void buyNow(){
        System.out.println("Buying " + name + " now...");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

    public String getImage(){
        return image;
    }
}
