# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 시나리오
1. 1부터 9 사이의 서로 다른 수로 이루어진 3자리 수를 생성한다. -> 랜덤 값으로 컴퓨터가 생성하게 한다. (컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.)
2. 숫자3개를 입력한다. -> 예외처리 (숫자가 아닌 경우, 숫자가 3개가 아닌 경우) : 숫자가 아닌 경우에 대해서는 도메인으로 나눠 해당 도메인에서 validation
3. 숫자를 순서대로 분리하여 스트라이크인지, 볼인지 판단한다 -> 스트라이크, 볼 만드는 로직 따로 구현 -> 스트라이크, 볼을 도메인으로 구현
4. 해당 도메인들을 


## 기능 요구 사항
1. 