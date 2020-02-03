public class Car_Use {
    //메인넣어줄게여~
    public static void main(String[] args){
        //타입도 만들어줄개야

            Car normalCar = new Car(4,"일반 엔진","브레이크","핸들");
        //이르케 카를 생성햇네여 실체화 햇구여 인스턴스햇네여
            Car superCar = new Car(4,true,"슈파엔진","브레이크","핸들");

            normalCar.goForward();//기능 써봅시당~
            superCar.isSuperCar();
    }
}
