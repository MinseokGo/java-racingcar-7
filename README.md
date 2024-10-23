# 자동차 경주 게임

## 요구 사항
초간단 자동차 경주 게임을 구현한다.

* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
* 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
* 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 기능 구현 목록

### 입력
모든 입력은 `Console.readLine()` 통해 입력 받아야 한다.

- [x] "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)" 메세지를 띄운다.
- [x] 사용자에게 경주할 자동차 이름을 입력 받는다.
- [ ] "시도할 횟수는 몇 회인가요?" 메세지를 띄운다.
- [ ] 사용자에게 게임 시도 횟수를 입력 받는다.

### 비즈니스 로직
- [ ] 입력받은 문자열이 `빈 문자열`인지 검사한다. (자동차 이름, 시도 횟수 모두)
- [x] 자동차는 `이름`을 갖는다.
- [ ] 자동차 이름은 `5글자 이하`이다.
- [x] 입력 받은 자동차 이름 문자열을 `쉼표(,)` 기준으로 분리한다.
- [ ] 분리된 문자열이 `Blank` 인지 검사한다. (Console에 Null이 입력될 가능성은 없다.)
- [ ] 시도 횟수를 입력 받고, `양의 정수`인지 검사한다. 
- [ ] `0에서 9 사이`의 무작위 값을 구한다.
- [ ] 자동차는 무작위 값이 `4 이상`인 경우 `전진`한다.
- [ ] 자동차는 `위치`를 갖는다.
- [ ] `가장 먼 위치`를 찾는다.
- [ ] 자동차들 중에서 `가장 먼 위치`에 있는 자동차를 찾는다.
- [ ] 찾은 자동차를 우승 자동차로 등록한다.

### 예외 처리
* 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException` 을 발생시킨 후 애플리케이션은 종료되어야 한다.
* 이때, `System.exit()` 을 호출하지 않는다.

- [ ] 입력 받은 문자열이 `빈 문자열`인지 검사한다.
- [ ] 자동차 이름을 쉼표를 기준으로 분리한 후, `빈 문자열`일 때
- [ ] 시도 횟수가 `양의 정수`가 아닐 때
- [ ] 자동차 이름이 5글자 초과일 때

### 출력
- [ ] 경주 진행 시, "실행 결과" 메시지를 출력한다.
- [ ] 매 라운드 실행 결과를 출력한다. 
  ```text
  pobi : -
  woni :
  jun : -  
  ```
- [ ] 최종 우승자를 출력한다. 이때 우승자가 여러명일 경우 쉼표를 이용해 구분해서 출력한다.
  ```text
  최종 우승자 : pobi, jun
  ```
- [ ] Console(Scanner)을 닫는다.
