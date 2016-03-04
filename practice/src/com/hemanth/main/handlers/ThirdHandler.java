
package com.hemanth.main.handlers;

import com.hemanth.main.Handle;
import com.hemanth.main.HandlerBase;

public class ThirdHandler implements Handle {

    @Override
    public void invoke(Object obj) {
        System.out.println("Third handler");
        //HandlerBase.getHandle(HandlerBase.FIRST_HANDLE).invoke(new Object());        
    }

}
