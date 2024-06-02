package uz.pdp;


public class MyBean2 {

    final MyBean myBean;

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public void sayHello() {
        System.out.println("Hello from myBean2");
        myBean.sayHello();
    }

}
