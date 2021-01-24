package bean;

import java.io.Serializable;

public class Card implements Serializable{
    /** 初始化方法 */
    public  void  initCard() {
        suit = "红桃";
        point = "K";
    }
    /** 销毁方法 */
    public  void  destroy() {
        System.out.println("吃了这顿饭 就送你上路");
    }
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public Card(String suit, String point) {
        super();
        this.suit = suit;
        this.point = point;
    }
    public Card() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Card [suit=" + suit + ", point=" + point + "]";
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getPoint() {
        return point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    private  String suit;
    private  String point;
}
