package Entity0328;

import java.time.LocalDate;

public class User {

    String userId;
    private String userName;
    private String userGender;
    private int userAge;
    private int userLevel;
    private String userAddress;
    private String userLoginId;
    private String userPassword;

    LocalDate birthDate; // 날짜 등록에 유용함

    public User() {
    }

    public User(String userId, String userName, String userGender, int userAge, int userLevel, String userAddress, String userLoginId, String userPassword, LocalDate birthDate) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userLevel = userLevel;
        this.userAddress = userAddress;
        this.userLoginId = userLoginId;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userLevel=" + userLevel +
                ", userAddress='" + userAddress + '\'' +
                ", userLoginId='" + userLoginId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public void displayUserInfoAll() {
        System.out.println("이름 :" + this.userName);
        System.out.println("성별 :" + this.userGender);
        System.out.println("나이 :"+ this.userAge) ;
        System.out.println("등급 :"+this.userLevel);
        System.out.println("주소 :"+this.userAddress);
        System.out.println("아이디 :"+ this.userLoginId);
    }
}
