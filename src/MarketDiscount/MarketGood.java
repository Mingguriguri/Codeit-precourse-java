package MarketDiscount;

public class MarketGood {
    private String name;
    private int retailPrice;
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
    public String getName() {
        return name;
    }
    public int getRetailPrice() {
        return retailPrice;
    }
    public int getDiscountRate() {
        return discountRate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
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