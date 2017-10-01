public class P08EmployeeData {
    public static void main(String[] args) {

        String firstName = "Amanda";
        String lastName = "Jonson";
        byte age = 27;
        char gender = 'f';
        long personalID = 8306112507L;
        int employeeNumber = 27563571;

        System.out.printf("First name: %s%nLast name: %s%nAge: %d%n" +
                "Gender: %s%nPersonal ID: %d%nUnique Employee number: %d", firstName,
                lastName, age, gender, personalID, employeeNumber);

    }
}
