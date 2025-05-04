package BankAccount;

public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int balance) {
        if(balance < 0) {
            balance = 0;
        }
        else {
            this.balance = balance;
        }
    }

    public BankAccount(Person owner) {
        this(0, owner);
    }

    public BankAccount(int balance, Person owner) {
        if (balance < 0) {
            this.balance = 0;
        }
        else {
            this.balance = balance;
        }
        this.owner = owner;
    }


    public void setBalance(int newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person newPerson) {
        owner = newPerson;
    }

    public Person getOwner() {
        return owner;
    }

    // 입금 메서드
    // 파라미터: 입금할 액수 (정수)
    // 리턴: 성공여부 (불린)
    boolean deposit(int amount) {
        int cashAmount = owner.getCashAmount();
        if (amount < 0 || cashAmount < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + cashAmount + "원");
            return false;
        }

        balance += amount;
        owner.setCashAmount(cashAmount - amount);
        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;

    }

    // 출금 메서드
    // 파라미터: 출금할 액수 (정수)
    // 리턴: 성공여부 (불린)
    boolean withdraw(int amount) {
        int cashAmount = owner.getCashAmount();
        if (amount < 0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + cashAmount + "원");
            return false;
        }

        balance -= amount;
        owner.setCashAmount(cashAmount - amount);
        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if (amount < 0 || amount > balance) {
            success = false;
        }
        else {
            // "나"의 계좌에서 빠져나가기
            balance -= amount;
            // 상대 계좌에 이채하기
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.getOwner().getName()
                + ", amount: " + amount
                + ", balance: " + balance
        );
        return success;
    }
}
