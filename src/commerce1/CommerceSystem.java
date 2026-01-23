package commerce1;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 카테고리 목록 관리
    private List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    // start() 메서드로 관리
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // 카테고리 출력
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");

            for (int i = 0; i < categories.size(); i++) {
                System.out.println((i + 1) + ". " + categories.get(i).getName());
            }
            // 종료
            System.out.println("0. 종료       | 프로그램 종료");

            // 카테고리 숫자 입력받기
            int categoryChoice = Integer.parseInt(sc.nextLine());

            if (categoryChoice == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }

            // 선택한 카테고리
            Category selecCategory = categories.get(categoryChoice - 1);

            // 카테고리 내 제품 보여주기
            List<Product> products = selecCategory.getProducts();
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.println((i + 1) + ". " + p.getName() + " | " + p.getPrice() + "원" + " | " + p.getDescription());
            }
            System.out.println("0. 뒤로가기");

            // 제품 숫자 입력받기
            int productChoice = Integer.parseInt(sc.nextLine());

            if (productChoice == 0) {
                continue;
            }

            Product selecProduct = products.get(productChoice -1);
            System.out.println("선택한 상품: "+ selecProduct.getName()+" | "+selecProduct.getPrice()+"원"+" | "
                    +selecProduct.getDescription()+" | "+selecProduct.getStock()+"개");

        }

    }

}
