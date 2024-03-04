public class Customer {

private String name;
private String address;

//Constructor
public Customer (String name, String address){
    this.name = name;
    this.address = address;
}

//Setters
public void setName(String name){
    this.name = name;
}
public void setAddress(String address){
    this.address = address;
}

//Getters
public String getName(){
    return name;
}
public String getAddress(){
    return address;
}
}
