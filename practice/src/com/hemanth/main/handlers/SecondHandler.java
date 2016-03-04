
package com.hemanth.main.handlers;

import com.hemanth.main.Handle;
import com.hemanth.main.HandlerBase;

public class SecondHandler implements Handle {

    @Override
    public void invoke(Object obj) {
        System.out.println("second handler");
        //HandlerBase.getHandle(HandlerBase.FIRST_HANDLE).invoke(new Object());        
    }

}
