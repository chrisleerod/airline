public class Account {
    public String name;
    public String password;
    public String pin;
    public String birthday;

    public Account() {
    }

    public void SetName(String Name) {
        name = Name;
    }
    public void SetPassword(String Password) {
        password = Password;
    }
    public void SetPin(String Pin) {
        pin = Pin;
    }
    public void SetBirthday(String Birthday) {
        birthday = Birthday;
    }

    public String GetName() {
        return name;
    }
    public String GetPassword() {
        return password;
    }
    public String GetPin() {
        return pin;
    }
    public String GetBirthday() {
        return birthday;
    }

    public void display(){
        System.out.println("Name: " + GetName() + "Password: " + GetPassword() + "Pin: " + GetPin() + "Birthday: " + GetBirthday());
    }
}
