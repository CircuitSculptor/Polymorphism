package ie.atu.productv4;
public class ProductDB {
    public static Product getProduct(String productCode) {

        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("galway girl")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Popular song in Ireland");
            myMusic.setPrice(12.99);
            myMusic.setArtist("Ed Sheeran");
            myMusic.setLabel("Sony Music Group");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(10.99);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Warner Music Group");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("kdl43")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Bravia Smart TV KDL43WF663");
            myTV.setPrice(819.00);
            myTV.setScreenSize(43);
            myTV.setManufacturer("Sony");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("tlc49")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Mini LED Smart TV tlc49fw45");
            myTV.setPrice(1149.00);
            myTV.setScreenSize(49);
            myTV.setManufacturer("TLC");
            myProduct = myTV;
        }
        return myProduct;
    }
}