package lab_mid;

interface Java_Account {
    String getAccount_name();
    void setAccount_name(String name);
}

interface Java_Password {
    String getPassword();
    void setPassword(String password);
}

interface Java_Verify_me {
    String getNumber();
    void sendOtp(String number);
    boolean verifyOtp(String enteredOtp);
}

class SignUp implements Java_Account, Java_Password, Java_Verify_me {
     String firstName;
   String lastName;
   String password;
    String phoneNumber;
    String otp;

    @Override
    public String getAccount_name() {
        return firstName + " " + lastName;
    }

    @Override
    public void setAccount_name(String name) {
        String[] names = name.split(" ");
        if (names.length == 2) {
            if (Character.isUpperCase(names[0].charAt(0)) && Character.isUpperCase(names[1].charAt(0))) {
                firstName = names[0];
                lastName = names[1];
            } else {
                System.out.println("The first letter of both firstname and lastname must be in uppercase");
            }
        }
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        if (password.length() < 8 ||
                !password.matches(".*[a-z].*") ||
                !password.matches(".*[A-Z].*") ||
                !password.matches(".*\\d.*") ||
                !password.matches(".*[!@#$%^&*()-_=+\\\\|\\[{\\]};:'\",<.>/?`~].*")) {
            System.out.println("Please follow the proper format for password");
        } else {
            this.password = password;
        }
    }

    @Override
    public String getNumber() {
        return phoneNumber;
    }

    @Override
    public void sendOtp(String number) {
        this.phoneNumber = number;

        otp = "123456";
        System.out.println("OTP sent to " + number + " is: " + otp);
    }

    @Override
    public boolean verifyOtp(String enteredOtp) {
        if (enteredOtp.equals(otp)) {
            System.out.println("OTP  successful!");
            return true;
        } else {
            System.out.println("OTP  wrong, try again");
            return false;
        }
    }
}