public class Encapsulation {

    private String firstName;
    private String lastName;
    private int id;

    public String getFirstname()
    {
        return firstName;
    }

    public void setFirstname(String firstname)
    {
        this.firstName = firstname;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
