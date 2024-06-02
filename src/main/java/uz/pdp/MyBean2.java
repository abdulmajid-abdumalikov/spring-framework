package uz.pdp;

public class MyBean2 {

    MyBean myBean = new MyBean();

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }


    public void sayHello() {
        System.out.println("Hello from MyBean2");
        myBean.sayHello();
    }
}
