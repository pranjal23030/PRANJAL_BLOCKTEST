package model;

import java.util.ArrayList;

public class Users {

    ArrayList<Orders> orders;
    int id;
    String username;

    public Users(ArrayList<Orders> orders, int id, String username, String fav_color, String fav_dress, int age) {
        this.orders = orders;
        this.id = id;
        this.username = username;
        this.fav_color = fav_color;
        this.fav_dress = fav_dress;
        this.age = age;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFav_color() {
        return fav_color;
    }

    public void setFav_color(String fav_color) {
        this.fav_color = fav_color;
    }

    public String getFav_dress() {
        return fav_dress;
    }

    public void setFav_dress(String fav_dress) {
        this.fav_dress = fav_dress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String fav_color;
    String fav_dress;
    int age;


}
