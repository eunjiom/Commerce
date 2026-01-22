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

        // 터미널 출력
        Scanner sc = new Scanner(System.in);

        //제목
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        // 상품 목록 출력(List > size 이용)
        for (int i = 0; i < products.size(); i++){
            Product a = products.get(i);
            System.out.println(
                    (i+1) + ". " + a.getName() + " | " + a.getPrice() + "원" + " | " +a.getDescription()
            );
        }

        // 종료
        System.out.println("0. 종료       | 프로그램 종료");
        String exit = sc.nextLine();

        if(exit.equals("0")){
            System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }
}