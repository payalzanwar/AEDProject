/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Item.Item;
import Business.Medicine.Medicine;
import java.util.ArrayList;

/**
 *
 * @author Payal Zanwar
 */
public class OrderDirectory {
     private ArrayList<Order> OrderList;

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Order> OrderList) {
        this.OrderList = OrderList;
    }
    
    public OrderDirectory()
    {
        OrderList= new ArrayList<>();
    }
     public Order AddOrder(String medname,float Price, int units){
        Order o = new Order();
        o.setItem(new Item());
        o.getItem().setProduct_name(medname);
        o.getItem().setQuantity(units);
        o.getItem().setSalesPrice(Price);
     
        OrderList.add(o);
        return o;
    }
}

