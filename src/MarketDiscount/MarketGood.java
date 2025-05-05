package MarketDiscount;

public class MarketGood {
    // 변수 안전하게 만들기 예시
    // : name과 retailPrice를 변경할 수 없도록 public final로 변경 & getter와 setter 제거
    public final String name;
    public final int retailPrice;
    private int discountRate;

    // 생성자 1
    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        }
        else {
            this.discountRate = discountRate;
        }
    }

    // 생성자 2
    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }

    // Getter / Setter

    public int getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    // getDiscountedPrice 메소드
    // 파라미터: X
    // 반환값: 할인가
    public int getDiscountedPrice() {
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}