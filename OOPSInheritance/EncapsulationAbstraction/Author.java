package OOPSInheritance.EncapsulationAbstraction;

public class Author {

    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void displayAuthor() {
        System.out.println("Author Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}