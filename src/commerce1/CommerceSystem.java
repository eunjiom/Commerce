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
            String exit = sc.nextLine();

            if (exit.equals("0")) {
                System.out.println("커머스 플랫폼을 종료합니다.");
            }
        }

    }
}