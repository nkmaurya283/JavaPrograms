package java.io;

abstract class Plan {
    protected  double rate;
    abstract void getRate();
    public void calculateBill(int unit){
        System.out.println(unit*rate);
    }
}
class  DomesticPlan extends Plan{

    void getRate() {
        rate=3.50;
    }
}
class  CommercialPlan extends Plan {
    //@override
    public void getRate() {
        rate = 7.50;
    }
}
class  InstitutionalPlan extends Plan {
    //@override
    public void getRate() {
        rate = 5.50;
    }
}
