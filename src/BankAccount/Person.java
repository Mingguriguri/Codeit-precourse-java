package BankAccount;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name) {
        this(name, 12, 0); // 12살을 기본 나이로 설정, 초기 현금 보유액은 0원.
    }

    public Person(String name, int age) {
        this(name, age, 0); // 초기 현금 보유액은 0원.
    }

    public Person(String name, int age, int cashAmount) {
        if (age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }

        if (cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }
        this.name = name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge(){
        return age;
    }

    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            this.cashAmount = newCashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount newAccount){
        this.account = newAccount;
    }

    public BankAccount getAccount(){
        return account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        return account.transfer(to, amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }

}
