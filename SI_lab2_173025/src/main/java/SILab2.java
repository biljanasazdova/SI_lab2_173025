import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function(User user, List<String> allUsers) {    //0
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";   //1
        if (user!=null) {   //2
            if (user.getUsername()!=null && user.getPassword()!=null) { //3
                String password = user.getPassword();   //4
                String passwordLower = password.toLowerCase();  //5
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //6
                    boolean digit = false, upper = false, special = false;  //7
                    for (int i=0;i<password.length();i++) { //8
                        if (Character.isDigit(password.charAt(i)))  //9
                            digit = true; //10
                        if (Character.isUpperCase(password.charAt(i)))  //11
                            upper = true; //12
                        if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //13
                            special = true; //14
                    } //15
                    if (digit && upper && special)  //16
                        return true;  //17
                } //18
            } //19
        }  //20
        return false;   //21
    }   //22
}
