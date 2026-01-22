package commerce1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 리스트 선언, product 추가
        List<Product> products = new ArrayList<>();

        // 제품 세팅
        products.add(new Product(
                "Galaxy S25",
                1200000,
                "최신 안드로이드 스마트폰",
                10
        ));

        products.add(new Product(
                "iPhone 16",
                1350000,
                "Apple의 최신 스마트폰",
                5
        ));

        products.add(new Product(
                "MacBook Pro",
                2400000,
                "M3 칩셋이 탑재된 노트북",
                7
        ));

        products.add(new Product(
                "AirPods Pro",
                350000,
                "노이즈 캔슬링 무선 이어폰",
                13
        ));

        // 카테고리 생성
        Category electronics = new Category("전자제품");
        Category cloth = new Category("의류");
        Category food = new Category("식품");

        // start() 함수
        CommerceSystem system = new CommerceSystem(products);
        system.start();

    }
}
