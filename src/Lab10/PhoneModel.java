package Lab10;

public enum PhoneModel{
    IPHONE(9999),
    HUAWEI(8888),
    PIXEL(6666),
    SAMSUNG(9399),
    LG(5588);

    private int price;

    PhoneModel(int i) {
        this.price = i;
    }

    public int getPrice() {
        return price;
    }
}
