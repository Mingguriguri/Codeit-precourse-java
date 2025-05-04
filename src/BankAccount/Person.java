package BankAccount;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName, int pAge) {
        if (pAge < 0) {
            pAge = 12;
        }
        name = pName;
        age = pAge;
        cashAmount = 0; // 정수형의 기본 값은 0이므로, 이 부분은 없어도 됨
    }

    public Person(String pName, int pAge, int pCashAmount) {
        if (pAge < 0) {
            pAge = 12;
        }
        if (pCashAmount < 0) {
            pCashAmount = 0;
        }
        name = pName;
        age = pAge;
        cashAmount = pCashAmount;
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
