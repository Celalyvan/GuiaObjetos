package dominio;

public class Item {
    private static int idClass;
    private  int idItem;
    private String description;
    private int quantity;
    private double price;
    private double totalPrice;

    public Item(String description, int quantity, double price) {
        this.description=description;
        this.quantity=quantity;
        this.price = price;
        this.updateTotalPrice(quantity, price);
        this.idItem = ++idClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item ");
        sb.append("idItem =  ").append(idItem);
        sb.append("{, description='").append(description).append('\'');
        sb.append(", quantity= ").append(quantity);
        sb.append(", price= $").append(price);
        sb.append(", totalPrice= $").append(totalPrice);
        sb.append('}');
        return sb.toString();
    }

    public void updateTotalPrice(int quantity, double price){
        this.totalPrice = price * quantity;
    }
}


