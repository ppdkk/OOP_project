package CookieDecorator;

public class ChocolateDecorator extends CookieDecorator{
    public ChocolateDecorator(Cookie cookie){
        super(cookie);
        cookie.cost +=5;
    }
    public String print(){
        return cookie.print() + ", Chocolate";
    }
    public double getCost(){
        return cookie.getCost();
    }
}