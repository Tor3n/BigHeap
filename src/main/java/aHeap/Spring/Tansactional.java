package aHeap.Spring;

import org.springframework.stereotype.Component;

//second transactional is ignored by proxy
// only works outside of class

@Component
public class Tansactional {

    @Transactional
    public void external(){
        //...
        internal();
    }

    @Transactional
    private void internal() {
        //..
    }

}
