package commerce1;

import java.util.ArrayList;
import java.util.List;

public class Category {

    // 카테고리 이름 필드(전자제품 등)
    private String name;

    // 카테고리에 속한 상품들
    private List<Product> products = new ArrayList<>();

    // 카테고리 이름 필드
    public Category(String name){
        this.name = name;
        this.products = new ArrayList<>();
    }

    // 카테고리 이름 반환
    public String getName(){
        return name;
    }

    // 카테고리 상품들 반환
    public List<Product> getProducts(){
        return products;
    }


}
