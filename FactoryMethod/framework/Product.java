package framework;


/**
 * This class express a product.
 * All specific implementation is dependent on the subclass.
 * 
 * @author Yuto Saito
 * @version 08/09/2024
 */
public abstract class Product
{
    /**
     * Product must / can be used.
     * But this class does not know how to be used.
     */
    public abstract void use();
}