/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryServices;

import Business.CourierServices.*;

/**
 *
 * @author Vaishali Tripathi
 */
public class DeliveryServices {
    private String deliveryServicesName;
    private String deliveryServicesLocation;
    private int deliveryServicesID;
    private static int count = 1;
    public DeliveryServices(){
        this.deliveryServicesID = this.count;
        count++;
    }

    public String getDeliveryServicesName() {
        return deliveryServicesName;
    }

    public void setDeliveryServicesName(String deliveryServicesName) {
        this.deliveryServicesName = deliveryServicesName;
    }

    public String getDeliveryServicesLocation() {
        return deliveryServicesLocation;
    }

    public void setDeliveryServicesLocation(String deliveryServicesLocation) {
        this.deliveryServicesLocation = deliveryServicesLocation;
    }

    public int getDeliveryServicesID() {
        return deliveryServicesID;
    }

    public void setDeliveryServicesID(int deliveryServicesID) {
        this.deliveryServicesID = deliveryServicesID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DeliveryServices.count = count;
    }

   
    
}
