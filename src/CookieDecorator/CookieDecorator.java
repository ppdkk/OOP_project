package CookieDecorator;

public class CookieDecorator extends Cookie{
    protected Cookie cookie;
    public CookieDecorator(Cookie cookie){
        this.cookie = cookie;
    }

}

