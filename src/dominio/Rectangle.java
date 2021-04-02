package dominio;

public class Rectangle {
    private double width = 1.0;
    private double hight =1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return this.hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double calculateArea (){
        return this.width * this.hight;
    }

    public double calculatePerimeter(double width, double hight){
        return 2*width + 2*hight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("width=").append(width);
        sb.append(", hight=").append(hight);
        sb.append('}');
        return sb.toString();
    }
}
