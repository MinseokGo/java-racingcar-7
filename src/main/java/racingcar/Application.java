package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        final String carNamesInput = Console.readLine();
        if (carNamesInput.isBlank()) {
            throw new IllegalArgumentException("빈 문자열은 입력할 수 없습니다.");
        }
        if (carNamesInput.startsWith(",") || carNamesInput.endsWith(",")) {
            throw new IllegalArgumentException("입력 문자열 앞과 뒤에는 쉼표가 위치할 수 없습니다.");
        }

        // 수정 대상: 컬렉션을 사용하고, Immutable 하게 만든다.
        final String[] carNames = carNamesInput.split(",");
        final List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        final String playTimesInput = Console.readLine();
        if (playTimesInput.isBlank()) {
            throw new IllegalArgumentException("빈 문자열은 입력할 수 없습니다.");
        }
    }
}
