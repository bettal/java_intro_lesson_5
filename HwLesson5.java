/**
 * Java.1.Lesson.5.Homework
 *
 * @autor Stanislav Lyashov
 */
public class HwLesson5{
    static int ageLimit = 40;
    public static void main(String[] args){
        Employee[] employeeArray = new Employee[5];
        employeeArray [0] = new Employee("Андрей Андреевич Андреев", "Директор", "Andreev.A@Contora.ru", "89485432534", 400000,39 );
        employeeArray [1] = new Employee("Антон Антонович Антонов", "Заместитель директора", "Antonov.A@Contora.ru", "89485432535", 350000,43 );
        employeeArray [2] = new Employee("Ангилина Андреевна Андреева", "Главный бухгалтер", "ndreeva.A@Contora.ru", "89485432533", 300000,35 );
        employeeArray [3] = new Employee("Борис Борисович Борисов", "Менеджер", " Borisov.B@Contora.ru", "89485432525", 270000,29 );
        employeeArray [4] = new Employee("Валентин Валентинович Валентинов", "Ведущий специалист", "Valentinov.V@Contora.ru", "89485432511", 200000,49 );
        for (int i = 0; i < employeeArray.length;i++ ) {
            if (employeeArray[i].getAge() > ageLimit ) {
                System.out.println(employeeArray[i].getFullName());
            }
        }
    }
}
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return (fullName + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }
}