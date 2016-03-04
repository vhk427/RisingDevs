
package com.hemanth.main.handlers;

import com.hemanth.main.Handle;
import com.hemanth.main.HandlerBase;

public class FirstHandler implements Handle {

    @Override
    public void invoke(Object obj) {
        System.out.println("first handler");

        HandlerBase.getHandle(HandlerBase.SECOND_HANDLE).invoke(new Object());

    }

    public static void main(String[] args) {

        System.out.println("Testing");

        HandlerBase.getHandle(HandlerBase.FIRST_HANDLE).invoke(new Object());

        System.out.println("Done");

    }
}
