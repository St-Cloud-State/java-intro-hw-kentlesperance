public class Person {
    //String fields
    private String firstName;
    private String lastName;
    private String id; //id is kept unique by the data class

    public Person(String firstName, String lastName, String id) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //Accessor methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getId()
    {
        return id;
    }

    public String toString() 
    {
        return firstName + " " + lastName + " , ID: " + id;
    }
}