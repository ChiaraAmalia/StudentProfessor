public class Person {
   // private instance variables
   private String name, address;
   
   // Constructor
   //ciao come va //ciao
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   // Getters and Setters
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   
   // Describle itself
   public String toString() {
      return name + "(" + address + ")";
   }
}
