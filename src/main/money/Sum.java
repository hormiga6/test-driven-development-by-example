package money;

public class Sum implements Expression{
    Money augened;
    Money addend;
    Sum(Money augened, Money addend){
        this.augened = augened;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to){
        int amount = augened.amount + addend.amount;
        return new Money(amount, to);
    }
}
