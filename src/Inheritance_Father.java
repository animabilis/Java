public class Inheritance_Father extends Inheritance_Human {

    //생성자를 만들겠어 리턴타입은 안적겠어
    public Inheritance_Father(){
        //자바가 기본으로 생성해주
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
     public void work(){
        System.out.println("일..");
     }

     @Override
    public  void eat(){
         //변경할 거를 여기에 적으셈
         super.eat();
         System.out.println( "많이먹는당");
         //this키워드는 자기자신 곧 자기 클래스를 의미했던 것처럼 super키워드는 부모클래스를 의미 곧 휴먼.eat이지
     }
}
