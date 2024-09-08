package idcard;
import framework.Product;

/**
 * This class express a ID card.
 * Determins specific product.
 * 
 * @author Yuto Saito
 * @version 08/09/2024
 */
public class IDCard extends Product
{
    /**
     * Owenr of the card.
     */
    private String owner;

    /**
     * Construcotr.
     */
    public IDCard(String owner) {
        System.out.println("Create ID card of " + owner);
        this.owner = owner;
    }
    
    /**
     * Specific use method of this ID card product.
     */
    public void use() {
        System.out.println("Use ID card of " + owner);
    }
    
    /**
     * Get the owner.
     */
    public String getOwner() {
        return this.owner;
    }
}
