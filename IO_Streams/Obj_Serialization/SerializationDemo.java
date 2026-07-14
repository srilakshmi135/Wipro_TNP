package IO_Streams.Obj_Serialization;


import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {


        Employee emp =
                new Employee(101, "Sri Lakshmi", 50000);


        // Serialization
        try {

            FileOutputStream fos =
                    new FileOutputStream("employee.ser");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);


            oos.writeObject(emp);

            oos.close();
            fos.close();


            System.out.println("Object Serialization Successful");


        } catch(IOException e) {

            e.printStackTrace();
        }



        // Deserialization
        try {

            FileInputStream fis =
                    new FileInputStream("employee.ser");

            ObjectInputStream ois =
                    new ObjectInputStream(fis);


            Employee emp2 =
                    (Employee) ois.readObject();


            System.out.println("Object Deserialization Successful");


            emp2.display();


            ois.close();
            fis.close();


        } catch(IOException | ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}