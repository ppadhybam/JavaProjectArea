package creational.builder;

/**
 * Created by PriyabratP on 04-07-2017.
 */
public class UserAccount {

    private String userFullName; // Required Field
    private String userEmail; // Required Field
    private int age; // Optional Field
    private String city; // Optional Field
    private String mobile; // Optional Field

    public UserAccount(Builder builder) {
        this.userFullName = builder.userFullName;
        this.userEmail = builder.userEmail;
        this.age = builder.age;
        this.city = builder.city;
        this.mobile = builder.mobile;
    }

    // Dont create Setters method here as we want to make it as immutable
    public String getUserFullName() {
        return userFullName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        String rData = "UserAccount{" +
                "userFullName='" + userFullName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
        System.out.println(rData);
        return rData;
    }

    public static class Builder {
        private String userFullName;
        private String userEmail;
        private int age;
        private String city;
        private String mobile;

        public Builder(String userFullName,String userEmail){
            this.userFullName = userFullName;
            this.userEmail = userEmail;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder mobile(String mobile){
            this.mobile = mobile;
            return this;
        }

        public UserAccount build(){
            UserAccount userAccount = new UserAccount(this);
            try {
                userAccountValidation();
                return userAccount;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private void userAccountValidation() throws Exception {
            if(userFullName == null || userEmail == null){
                throw new Exception("Validation Error");
            }
        }
    }
}
