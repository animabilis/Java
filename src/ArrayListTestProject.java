import java.util.ArrayList;

public class ArrayListTestProject {

    public static void main(String[] args) {
//과제 1. 리스트1에 0~9넣기, 리스트2에는 리스트1에서 가져온 값이 5보다작으면 true 아니면 false 넣기
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(i);

        }
        System.out.println(list1);

        ArrayList<Boolean> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < 5) {
                list2.add(true);
            } else {
                list2.add(false);
            }
        }
        System.out.println(list2);


//과제 2. 0~9배열 만들고, 배열 안의 홀수 리턴하는 함수 만들기(*함수 만들때 public 다음에 static 넣기!)
        int[] Group = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Group);
        //우째서 배열의 내용이 안뜨는 것이야...?!
        ArrayList<Integer> q2_list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            q2_list1.add(i);
        }
        System.out.println(q2_list1);
        //함수 안에서(메인함수) 함수를 만들 순 없으니 새로 만들어줘야지..!!
        System.out.println(HowManyOdds(q2_list1));
        //그래서 밑에 새로운 함수 만들어놓고 ^이러케 호출했지

//과제 3. 0~9리스트3, 9~0리스트4, 두 리스트의 같은 인덱스 값들의 곱을 출력하는 함수 만들기.
            ArrayList<Integer> q3_list1 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                q3_list1.add(i);
            }
            System.out.println(q3_list1);

            ArrayList<Integer> q3_list2 = new ArrayList<>();
            for (int i = 9; i >= 0; i--) {
                q3_list2.add(i);//강사님은 q3_list2.add(9-i)이렇게 했구나...!
            }
            System.out.println(q3_list2);
            //함수 또 만들어야 겠넹 ㅎㅎ....얍! 아래 또 만들었당
            MultpleArrayList1and2(q3_list1,q3_list2);

    }
//과제 2 에서 필요한 함수 만들었다용
    public static int HowManyOdds(ArrayList<Integer> list) {//왜 static쓰는지는 나중에 알려준대!
        int result=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                result++;
            }
        }
        return result;
    }
//과제 3에서 필요한 함수
    public static void MultpleArrayList1and2(ArrayList<Integer> list1,ArrayList<Integer> list2){

        for (int i=0; i<list1.size();i++ ) {
            int result;
            result = list1.get(i) * list2.get(i);
            System.out.println(result);//리턴안해두댐
        }
    }



}



