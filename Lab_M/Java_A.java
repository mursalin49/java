package lab_mid;

public class Java_A {

        public static void main(String[] args) {
            SignUp signUp = new SignUp();

            signUp.setAccount_name("Nirob");
            signUp.setPassword("Pass@1234");
            signUp.sendOtp("1234567890");
            signUp.verifyOtp("123456");
        }
    }


