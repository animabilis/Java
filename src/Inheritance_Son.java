public class Inheritance_Son extends Inheritance_Human{

    public Inheritance_Son(){

    }
    //자 이제 아래애들은 human클래스를 상속하겟어 그러니까 주석하겟어 ㅋ
    /*public void eat(){
        System.out.println("먹어");
    }
    public void sleep(){
        System.out.println("자");
    }
    public void wash(){
        System.out.println("씻어");
    }
    */
    public void study(){
        System.out.println("공부..");
    }
    @Override
    public void eat(){
        System.out.println("무지먹는다");
    }
    //오버로드해볼게여 인제 오버로드는 부모클래스 기능의 파라미터를 바꾸는건뎅
    //왜냐면 달라진 기능을 수핼하려면 다른 파라미커가 잇어야 해서 그렇대요!!
    public void wash(String soap){
        System.out.println("비누로샤워해");
    }

}
