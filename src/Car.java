public class Car {

    int tires;
    String engine;
    Boolean superEngine;
    String break_; //break는 등록되어 잇어서 _해줫어여~
    String handle;

    //생성자 만들어보자! 아 리턴타입없으니까 인트나 보이드 안적어요! 요것이... 몬소리야...?
    public Car(int tires, String engine, String break_, String handle){ //()안에 있는 애들은 파라미터들
        //클래스 변수에 파라미터들을 넣을건데....
        //즉 부품들을 넣어볼텐데 tires가 위에도 아래도 똑같이 있네? 구분해야겟네?
        this.tires = tires;
        //디스는 자기 자신을 의미 즉 여기에서 this는 클래스 Car을 의미하고 this.tires는 Car.tires 가 됨...??
        //디스 키워드.
        this.engine = engine;
        this.break_ = handle;
        this.handle = break_; //ㅎㅎ 바꿔봣어
    }

    public Car(int tires, Boolean superEngine, String engine, String break_, String handle) {

        this.tires = tires;
        this.superEngine = superEngine;
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
    }

    //기능 ㄱㄱ (함수)
    public void goForward(){
        System.out.println("직진합니다");
    }
    public void goBackward(){
        System.out.println("후진합니다");
    }
    public void isSuperCar() {
        if (superEngine) {
            System.out.println("슈퍼카네요");
        } else {
            System.out.println("슈퍼카가...아닙니다");
        }
    }


}
