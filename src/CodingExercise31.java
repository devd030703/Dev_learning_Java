public class CodingExercise31 {

    private String firstname;
    private String lastname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isTeen (){
        return age > 12 && age < 20;
    }

    public String getFullName (){
        if (firstname.isEmpty() && lastname.isEmpty()){
            return "";
        }
        if (lastname.isEmpty()){
            return firstname;
        }
        if (firstname.isEmpty()){
            return lastname;
        }
        return firstname + " " + lastname;
    }

}
