package ExceptionEx;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money) {
//            사용자 정의 예외를 사용함
            throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + " 모자람");
        }
        balance -= money;
    }

//    public void withdraw(int money) {
//        if (balance < money) {
//            try {
//                throw new ExceptionEx.BalanceInsufficientException("잔고 부족 : " + (money - balance) + " 모자람");
//            } catch (ExceptionEx.BalanceInsufficientException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        balance -= money;
//    }

}
