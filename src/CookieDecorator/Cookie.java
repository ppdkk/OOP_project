package CookieDecorator;

public class Cookie {
    public double cost;
    protected String name;

    public Cookie(){
        this.cost = Math.random()*15;
        int i = (int)(Math.random()*4);
        switch (i){
            case 0:
                this.name = "Strawberry cookie";
                break;
            case 1:
                this.name = "Chocolate cookie";
                break;
            case 2:
                this.name = "Vanilla cookie";
                break;
            case 3:
                this.name = "Brownie cookie";
                break;
        }

    }
    public String getName(){
        return this.name;
    }
    public double getCost(){
        return this.cost;
    }
    public String print(){
        return this.getName() + ", price: " + this.getCost();

    };
}
