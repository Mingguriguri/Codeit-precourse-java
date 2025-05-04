public class Main {
    public static void main(String[] args) {
        // 사람 1
        Person p1 = new Person("김신의",-10);
        p1.setCashAmount(30000);

        // 은행 계좌 1
        BankAccount a1 = new BankAccount(p1);
        p1.setAccount(a1);
//        a1.setOwner(p1);
        a1.setBalance(100000);

        // 사람 2
        Person p2 = new Person("문종모", 24, 100000);

        // 은행계좌 2
        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);
//        a2.setOwner(p2);

        // 입출금 테스트
//        a2.deposit(30000);
//        a2.withdraw(170000);
//        a2.deposit(620000);
//        a2.withdraw(890000);

        // 계좌 이제 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}