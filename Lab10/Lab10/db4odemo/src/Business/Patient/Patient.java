/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author mantr
 */
public class Patient {
    private String CustomerId;
    private String WalletId;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Gender;
    private String Height;
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String Country;
    private int Zipcode;
    private int Phone;
    private String Email;
    private String InsuranceId;
    private String InsuranceType;
    private String ProviderName;
    private String ProviderAddress;

    public Patient(String CustomerId, String WalletId) {
        this.CustomerId = CustomerId;
        this.WalletId = WalletId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getWalletId() {
        return WalletId;
    }

    public void setWalletId(String WalletId) {
        this.WalletId = WalletId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getZipcode() {
        return Zipcode;
    }

    public void setZipcode(int Zipcode) {
        this.Zipcode = Zipcode;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getInsuranceId() {
        return InsuranceId;
    }

    public void setInsuranceId(String InsuranceId) {
        this.InsuranceId = InsuranceId;
    }

    public String getInsuranceType() {
        return InsuranceType;
    }

    public void setInsuranceType(String InsuranceType) {
        this.InsuranceType = InsuranceType;
    }

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    public String getProviderAddress() {
        return ProviderAddress;
    }

    public void setProviderAddress(String ProviderAddress) {
        this.ProviderAddress = ProviderAddress;
    }
   
    
    
    
}
