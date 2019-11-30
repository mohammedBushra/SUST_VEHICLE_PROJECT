
package projectoopinheritance;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ProjectOOPInheritance {

    public static void main(String[] args) throws FileNotFoundException, Exception {
  
      Scanner input = new Scanner(System.in);
      while(true){
          int number = Integer.parseInt(JOptionPane.showInputDialog("Enter \n 1-add the data \n 2-Display the data \n 3-Exit \n:"));
          if((number >3 )||( number <1)){
                       JOptionPane.showInputDialog("null pointer exception, try again");
                   }
          switch(number){
              case 1 :
                int num = Integer.parseInt(JOptionPane.showInputDialog("Enter \n 1-add Sailboat \n 2-add Bicycle \n 3-add Car"));
                if((num >3 )||( num <1)){
                       JOptionPane.showInputDialog("null pointer exception, try again");
                   }
                
                switch(num){
                    case 1:{
                       
                         Sailboat object = new Sailboat("",0,0);
                         object.setPowerSource("");
                         object.setNumberOfWheels(0);
                         object.setLength(0);
                         object.setPrice(0.0);
                         String data = "PowerSource : "+object.getPowerSource()+" , NumberOfWheels :  "+object.getNumberOfWheels()+" , Length : "+object.getLength()+" , price :"+object.getprice();

                         try{
                             FileOutputStream fos = new FileOutputStream(new File("sailboat.txt"),true);
                             PrintWriter pw = new PrintWriter(fos);
                             pw.println(data);
                             pw.close();
                        }catch(IOException e){
                             JOptionPane.showInputDialog(""+e);
                        }
                              //JOptionPane.showInputDialog("Success...");
                    }
                    break;
                    case 2:{
                         Bicycle object = new Bicycle("",0);
                         object.setPowerSource("");
                         object.setNumberOfWheels(0);
                         object.setPrice(0);
                         String data = "PowerSource : "+object.getPowerSource()+" , NumberOfWheels : "+object.getNumberOfWheels()+" , price : "+object.getprice();
                         try{
                             FileOutputStream fos = new FileOutputStream(new File("Bicycle.txt"),true);
                             PrintWriter pw = new PrintWriter(fos);
                             pw.println(data);
                             pw.close();
                        }catch(IOException e){
                             JOptionPane.showInputDialog(""+e);
                        }
                    }
                    break;
                    case 3:{
                      
                         Car object = new Car("",0,0,"");
                         object.setPowerSource("");
                         object.setNumberOfWheels(0);
                         object.setPrice(0);
                         object.setmodel("");
                         String data = "PowerSource : "+object.getPowerSource()+" , NumberOfWheels : "+object.getNumberOfWheels()+" , model : "+object.getmodel()+" , price :"+object.getprice();
                         try{
                             FileOutputStream fos = new FileOutputStream(new File("Car.txt"),true);
                             PrintWriter pw = new PrintWriter(fos);
                             pw.println(data);
                             pw.close();
                        }catch(IOException e){
                             JOptionPane.showInputDialog(""+e);
                        }
                    }
                    break;
                }
              break;
              case 2:  
                  {
                   int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter \n 1-display Sailboat \n 2-display Bicycle \n 3-display Car"));
                   if((num1 >3 )||( num1 <1)){
                       JOptionPane.showInputDialog("null pointer exception, try again");
                   }
                   switch(num1){
                       case 1:                   displayDatainFile("Sailboat.txt"); break;
                       case 2:                   displayDatainFile("Bicycle.txt"); break;
                       case 3:                   displayDatainFile("Car.txt"); break;
                    //   if(num1!=1&&num1!=2&&num1!=3)
                      //    System.out.println("no match choise, enter the number again:");
                    
                   }
              }
              break;
              case 3: System.exit(0);    
          }
      
      }
        
        // TODO code application logic here
    }
  static void displayDatainFile(String filenme) throws Exception{
         Scanner in=new Scanner(new File(filenme));
         String line=null;
                while(in.hasNextLine()){
                    line=in.nextLine();
             Component parentComponent;
                   
                    JOptionPane.showInputDialog(line);

    }}
              
              
              
                   
}
/*
Vehicle []array = new Vehicle[3];
                         array[0] = new Sailboat("",0,0);
                         array[1] = new Bicycle("",0);
                         array[2] = new Car("",0,0,"");
array[0].setPowerSource("");
array[0].setNumberOfWheels(0);
array[0].setPrice(0);
                         String data = array[0].getPowerSource()+"  "+array[0].getNumberOfWheels()+"  "+array[0].getprice();
                         System.out.println(data);

*/

----------------------------------------------------------------------------------------------------------------------------

package projectoopinheritance;
import javax.swing.JOptionPane;
public abstract  class Vehicle {
    private static String powerSource;
    private static double numberOfWheels;
    public double price;
    
    public Vehicle(String powerSource,double numberOfWheels,double price){
        this.powerSource=powerSource;
        this.numberOfWheels=numberOfWheels;
        this.price=price;
    }
   
     public Vehicle(String powerSource,double numberOfWheels){
        this.powerSource=powerSource;
        this.numberOfWheels=numberOfWheels;
    }
    
   public void setPowerSource(String s){
       powerSource = JOptionPane.showInputDialog("Enter your power Source :");
       this.powerSource=powerSource;
    }
   
    String getPowerSource(){
      return this.powerSource;
    }
    
    public void setNumberOfWheels(double i){      
        numberOfWheels= Double.parseDouble(JOptionPane.showInputDialog("Enter your number Of Wheels :")); 
        this.numberOfWheels=numberOfWheels
                ;
    }
     
    double getNumberOfWheels(){
      return numberOfWheels;
    }
    
    public abstract void setPrice(double p);
     
    double getprice()
    {
      return price;
    }
    public String toString(){
    return getPowerSource()+"\n"+getNumberOfWheels()+"\n"+getprice();
    }
}

--------------------------------------------------------------------------------------------------------------------------


package projectoopinheritance;
import javax.swing.JOptionPane;
class Sailboat extends Vehicle {
    private double length;
    Sailboat(String powerSource,double numberOfWheels,double length){
    super(powerSource,numberOfWheels);
    }
       
    public void setPrice(double p){
       price= Double.parseDouble(JOptionPane.showInputDialog("Enter Sailboat Price : ")); 
       this.price=price;
    
    }

    public void setLength(double length){
      length= Double.parseDouble(JOptionPane.showInputDialog("Enter Sailboat length in meter : ")); 
      this.length=length;
    }
     
    public double getLength(){
        return length;
    }
   
     public String toString(){
        return getPowerSource()+""+getNumberOfWheels()+""+getprice()+""+length;
    }
   
}

-----------------------------------------------------------------------------------------------------------------------

package projectoopinheritance;
import javax.swing.JOptionPane;
public class Bicycle extends Vehicle {
    Bicycle(String powerSource,double numberOfWheels){
    super(powerSource,numberOfWheels);
    }
     @Override
     public void setPrice(double p){
      price= Double.parseDouble(JOptionPane.showInputDialog("Enter Bicycle Price : ")); 
      this.price=price;
    }
     
    public String toString(){
         return getPowerSource()+""+getNumberOfWheels()+""+getprice();
    }
    
}

-----------------------------------------------------------------------------------------------------------------------


package projectoopinheritance;
import javax.swing.JOptionPane;
public class Car extends Vehicle {
    private String model ;
    public Car(String powerSource,double numberOfWheels,double price,String model){
       super(powerSource,numberOfWheels,price); 
       this.model=model;
    }
        
    public void setPrice(double p){
        price= Double.parseDouble(JOptionPane.showInputDialog("Enter Car Price : "));
        this.price=price;
    }
   
   public void setmodel(String m){
       model= JOptionPane.showInputDialog("Enter Sailboat model in meter : ");
       this.model=model;
   } 
   
   public String getmodel(){
       return model;
   } 
   
   public String toString(){
       return getPowerSource()+""+getNumberOfWheels()+""+model+""+getprice();//
   }
}

