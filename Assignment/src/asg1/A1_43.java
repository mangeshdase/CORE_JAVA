package asg1;

class OneBHK1{
    int roomArea;
    int hallArea;
    int price;

    OneBHK1(){
        roomArea = 100;
        hallArea = 100;
        price = 10000;
    }

    OneBHK1(int roomArea , int hallArea , int price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    void show(){
        System.out.println("\n\nRoom area : "+roomArea);
        System.out.println("Hall area : "+hallArea);
        System.out.println("Price  ; "+price);
    }
}

class TwoBHK1  extends OneBHK1{
    int room2Area;

    TwoBHK1(int roomArea , int hallArea , int price , int room2Area ){
        super(roomArea,hallArea,price);
        this.room2Area = room2Area;
    }
    void show(){
        super.show();
        System.out.println("Room 2 Area : "+room2Area);
    }

}

class A1_43{
    public static void main(String[] agrs){
        TwoBHK1 t1 = new TwoBHK1(100,100,10000,100);
        TwoBHK1 t2 = new TwoBHK1(200,200,20000,200);
        TwoBHK1 t3 = new TwoBHK1(300,300,30000,300);
        TwoBHK1 arr[] = {t1,t2,t3};
        for(TwoBHK1 i : arr) i.show();
    }
}