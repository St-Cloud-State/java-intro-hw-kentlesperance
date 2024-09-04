import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonList 
{
    private LinkedList<Person> personList;

    public PersonList() 
    {
        personList = new LinkedList<Person>();
    }

    //Accessor method
    public LinkedList<Person> getPersonList()
    {
        return personList;
    }

    public void store(InputStream input) 
    {
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(", ");
            if (data.length == 3) {
                personList.add(new Person(data[0], data[1], data[2]));
            }
        }
        scanner.close();
    }

    public void display(PrintStream output) 
    {
        for (Person person: personList) {
            output.println(person);
        }
    }

    public int find(String sid)
    {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
