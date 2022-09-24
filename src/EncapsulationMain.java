public class EncapsulationMain {

    public static void main(String[] args) {

        Encapsulation emp1 = new Encapsulation();
        Encapsulation emp2 = new Encapsulation();

        emp1.setFirstname("Ejaz");
        emp1.setLastName("Ulhaq");
        emp1.setId(001);

        emp2.setFirstname("Hamdan");
        emp2.setLastName("Khan");
        emp2.setId(002);

        System.out.println("Employee 1 Details:");
        System.out.println("ID : " + emp1.getId() + "\n" +
                "Name : " +emp1.getFirstname() + emp1.getLastName());

    }
}
