package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputNumber() {
        System.out.print("숫자를 입력해주세요: ");
        return Console.readLine();
    }
}