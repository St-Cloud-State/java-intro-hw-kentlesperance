import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) 
    {
        var personList = new PersonList();
        try { 
            FileInputStream fileInput = new FileInputStream("data.txt");
            personList.store(fileInput); //store method called
            fileInput.close();
        } catch(IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }
        
        System.out.println("All Persons:");
        personList.display(System.out);

        System.out.println(personList.find("1793"));
        System.out.println(personList.find("0"));
        // LinkedList<Person> personList = new LinkedList<>();
        
        // try { 
        //     FileInputStream fileInput = new FileInputStream("data.txt");
        //     store(fileInput, personList); //store method called
        //     fileInput.close();
        // } catch(IOException e) {
        //     System.err.println("Error reading file: " + e.getMessage());
        //     return;
        // }
        


        // System.out.println("All Persons:");
        // display(System.out, personList); //display method called

        // System.out.println(find("1793", personList));
        // System.out.println(find("0", personList));
        // System.out.println(find("999", personList));
        // System.out.println(find("1542", personList));
    }

    // //Reads the data for several persons from the input stream and stores the data in the linked list.
    // public static void store(InputStream input, LinkedList<Person> list) 
    // {
    //     Scanner scanner = new Scanner(input);
    //     while (scanner.hasNextLine()) {
    //         String[] data = scanner.nextLine().split(", ");
    //         if (data.length == 3) {
    //             list.add(new Person(data[0], data[1], data[2]));
    //         }
    //     }
    //     scanner.close();
    // }

    // //Writes the data for all person objects in the linked list, one per line
    // public static void display(PrintStream output, LinkedList<Person> list) 
    // {
    //     for (Person person : list) {
    //         output.println(person);
    //     }
    // }

    // //Returns the index of the person object in the linked list, that has the same id value as sid (returns -1 is no such person exists).
    // public static int find(String sid, LinkedList<Person> list) 
    // {
    //     for (int i = 0; i < list.size(); i++) {
    //         if (list.get(i).getId().equals(sid)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}