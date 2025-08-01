package aHeap.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//GET NPE, use @postConstruct или
// @Autowired
// public void setPhone(Phone phone) {
//  this.phone = phone;
//  this.init(); //phone.call
// }

public class postconstruct {
    @Component
    class Phone{
        public void call(){}
        //...
    }

    @Component
    class Caller{
        @Autowired
        private Phone phone;

        public Caller(){
            phone.call();
        }
    }


}
