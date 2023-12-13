package java_basic.oop.ex;

public class Account {
    int balance;
    int deposit(int amount){
        return this.balance = this.balance + amount;
    }

    int withdraw(int amount) {
        if(this.balance - amount < 0){
            System.out.println("잔액 부족");
            return this.balance;
        }
        return this.balance = this.balance - amount;
    }
}
