package money;

public class Sum implements Expression{
    Expression augened;
    Expression addend;
    Sum(Expression augened, Expression addend){
        this.augened = augened;
        this.addend = addend;
    }

    public Expression plus(Expression addednd){
        return null;
    }

    public Money reduce(Bank bank, String to){
        int amount = augened.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
