package Lab7;

public class Food {
    private int id;
    private String name;

    private String type;
    private int size;
    private double price;

    public void showInformation(){
        System.out.printf("[id] %d [type] %-10s [name] %-10s [size] %5d (Inches) %5.2f$\n" , id , type , name , size , price);
    }

    public double getprice(){
        return price;
    }

    public void setter(int id,String name,String type,int size,double price){
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

}
