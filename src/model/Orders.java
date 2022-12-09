package model;

import java.util.ArrayList;

public class Orders {
    ArrayList<Items> items;

    public Orders(ArrayList<Items> items, String order_amount, int order_id, String ordered_item, String order_store, int order_code) {
        this.items = items;
        this.order_amount = order_amount;
        this.order_id = order_id;
        this.ordered_item = ordered_item;
        this.order_store = order_store;
        this.order_code = order_code;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public String getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(String order_amount) {
        this.order_amount = order_amount;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrdered_item() {
        return ordered_item;
    }

    public void setOrdered_item(String ordered_item) {
        this.ordered_item = ordered_item;
    }

    public String getOrder_store() {
        return order_store;
    }

    public void setOrder_store(String order_store) {
        this.order_store = order_store;
    }

    public int getOrder_code() {
        return order_code;
    }

    public void setOrder_code(int order_code) {
        this.order_code = order_code;
    }

    String order_amount;
    int order_id;
    String ordered_item;
    String order_store;
    int order_code;
}
