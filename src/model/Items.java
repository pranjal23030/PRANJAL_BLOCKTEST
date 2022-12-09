package model;

public class Items {

    public Items(String item_name, int code, String brand, int price, String store_name) {
        this.item_name = item_name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.store_name = store_name;
    }

    String item_name;
    int code;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    String brand;
    int price;
    String store_name;

    public void getItem() {
        System.out.println("Item Name: " + this.item_name);
        System.out.println("Code: " + this.code);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

}

