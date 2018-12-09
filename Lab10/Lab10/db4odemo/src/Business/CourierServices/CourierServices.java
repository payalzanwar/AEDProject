/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CourierServices;

/**
 *
 * @author Vaishali Tripathi
 */
public class CourierServices {
    private String courierServicesName;
    private String courierServicesLocation;
    private int courierServicesID;
    private static int count = 1;
    public CourierServices(){
        this.courierServicesID = this.count;
        count++;
    }

    public String getCourierServicesName() {
        return courierServicesName;
    }

    public void setCourierServicesName(String courierServicesName) {
        this.courierServicesName = courierServicesName;
    }

    public String getCourierServicesLocation() {
        return courierServicesLocation;
    }

    public void setCourierServicesLocation(String courierServicesLocation) {
        this.courierServicesLocation = courierServicesLocation;
    }

    public int getCourierServicesID() {
        return courierServicesID;
    }

    public void setCourierServicesID(int courierServicesID) {
        this.courierServicesID = courierServicesID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CourierServices.count = count;
    }
    
}
