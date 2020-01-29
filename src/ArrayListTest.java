import java.util.ArrayList;

public class ArrayListTest {

    public static class MainActivity{

        public static void main(String[ ] args){

            int a;
            Integer a1;
            a1=null;
            //a=null은 불가능!
            //프리머티브타입은 <>안에 못들어가여~

            ArrayList<Integer> ints = new ArrayList<>();
            ArrayList ints2 = new ArrayList();

            ints.add(2);
            //add기능을 쓸거야
            ints.add(3);
            //ints.add(ture); 이미 자료형을 정해버려서(Integer) 불린은 안돼용~

            System.out.println(ints);

            ints2.add(2);
            ints2.add(true);
            ints2.add(3);

            System.out.println(ints2);


            for(int i = 0; i<ints.size(); i++){
                if (ints.get(i)==2){
                    System.out.println("2를 찾았다");
                }
            }

            ints.remove(0);
            System.out.println(ints);



        }
    }

}
