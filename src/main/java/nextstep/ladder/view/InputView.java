package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public String receiveGamers() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return scanner.nextLine();
    }

    public int receiveMaxHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = 0;

        try {
            height = scanner.nextInt();
            scanner.nextLine();
            System.out.println("최대 사다리 높이는 " + height + "입니다.");
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("유효한 숫자를 입력해 주세요.");
            return receiveMaxHeight();
        }
        return height;
    }
}
