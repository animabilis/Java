public class Inheritance_Mother extends Inheritance_Human {//요렇게 extends 해주고 휴먼클래쓰~ 쓰면 상속ㅋ

    public Inheritance_Mother(){
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
    public void cook(){
        System.out.println("요리..");
    }
    @Override
    public void eat(){
        System.out.println("적게먹는당");
    }
}
