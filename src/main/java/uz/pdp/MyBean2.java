package uz.pdp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

    MyBean myBean = new MyBean();

    @Autowired
    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public void sayHi() {
        System.out.println("MyBean2 sayHi");
        myBean.sayHi();
    }
}
