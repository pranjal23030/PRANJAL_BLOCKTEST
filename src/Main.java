import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Items List
        ArrayList<Items> AruneshItems = new ArrayList<Items>();
        Items i1 = new Items("Nerd", 5666, "Levis", 12345, "Arunesh Store");
        AruneshItems.add(i1);
        Items i2 = new Items("t-shirt", 5667, "Essentials",45678, "Sashwat Store");
        ArrayList<Items> SashItems = new ArrayList<Items>();
        SashItems.add(i2);
        ArrayList<Items> BiksItems = new ArrayList<Items>();
        Items i3 = new Items("Nerd1", 5668, "Liffy", 91011, "Bikarsha Store");
        BiksItems.add(i3);
        ArrayList<Items> BzuleeItems = new ArrayList<Items>();
        Items i4 = new Items("Nerd2", 91011, "Shangri-la", 1011, "Biplov Store");
        BzuleeItems.add(i4);
        ArrayList<Items> PranjalItems = new ArrayList<Items>();
        Items i5 = new Items("Nerd3", 121314, "Nyptra", 1213, "Pranjal Store");
        PranjalItems.add(i5);

        //Orders List
        ArrayList<Orders> AruneshkoOrder = new ArrayList<Orders>();
        Orders o1 = new Orders(AruneshItems, "Rs 500", 1, "Nerd", "Mero store", 5666);
        AruneshkoOrder.add(o1);
        ArrayList<Orders> PranjalkoOrder = new ArrayList<Orders>();
        Orders o2 = new Orders(PranjalItems, "Rs 600", 2,"Nerd3", "Mero afnai store", 1213);
        PranjalkoOrder.add(o2);

        //Users List
        Users u1 = new Users(AruneshkoOrder, 1, "Arunesh", "Red", "T-shirt", 18);
        Users u2 = new Users(PranjalkoOrder,2, "Pranjal", "Yellow", "Jacket", 18);

        i1.getItem();
    }
}