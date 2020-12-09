package altimetrik.raj;

public class userInLotterySystem {
    private String UserName;
    private long UserLotteryNumber;

    public userInLotterySystem(String userName,long userLotteryNumber) {
        UserName = userName;
        UserLotteryNumber=userLotteryNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public long getUserLotteryNumber() {
        return UserLotteryNumber;
    }

    public void setUserLotteryNumber(long userLotteryNumber) {
        UserLotteryNumber=userLotteryNumber;
    }

    @Override
    public String toString() {
        return "userInLotterySystem{" +
                "UserName='" + UserName + '\'' +
                ", UserLotteryNumber=" + UserLotteryNumber +
                '}';
    }
}
