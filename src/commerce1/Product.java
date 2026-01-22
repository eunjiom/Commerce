package commerce1;

public class Product {

    // 상품명, 가격, 설명, 재고수량 필드 만들기
    private String name;
    private int price;
    private String description;
    private int stock;

    // 생성자 만들기
    public Product(String name, int price, String description, int stock){
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // getter로 정보 출력
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public int getStock(){
        return stock;
    }
}
