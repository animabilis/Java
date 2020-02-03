public class Family_Use {

    public static void main(String[] args) {

        Inheritance_Father father = new Inheritance_Father();
        Inheritance_Mother mother = new Inheritance_Mother();
        Inheritance_Son son = new Inheritance_Son();

        father.eat();
        mother.eat();
        son.study();
        son.eat();
        father.wash();
        son.wash("");// ()안엥 ""넣어주면 입력할 수 잇음ㅎㅎ 몰라서 좀 헤멤ㅋㅋ
        son.wash();//()안에 입력안하면 그대롱~
        son.wash("머");
        son.wash("머야 아무거나써도되는거냐????");
    }
}
