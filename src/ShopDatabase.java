import java.util.Random;

//This is basically the specific class
public class ShopDatabase {
    //public is ugly, it's just for the sake of the example
    public String[] customers = {"pippo", "pluto", "paperino", "topolino", "minnie", "grappo", "pizzu", "vicario"};
    public float[] productsPrices = new float[10];
    public ShopDatabase(){
        Random r = new Random();
        for(int i = 0; i < productsPrices.length; i++){
            productsPrices[i] = r.nextInt(10) + r.nextFloat();
        }
    }
}
