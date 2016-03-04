
package com.hemanth.main;

import java.util.HashMap;
import java.util.Map;

import com.hemanth.main.handlers.FirstHandler;
import com.hemanth.main.handlers.SecondHandler;
import com.hemanth.main.handlers.ThirdHandler;

public class HandlerBase {

    private Handle handle;

    private static Map<String, Handle> handlers;

    public static String FIRST_HANDLE = "1";

    public static String SECOND_HANDLE = "2";

    public static String THIRD_HANDLE = "3";

    static {
        handlers = new HashMap<String, Handle>();
        handlers.put(FIRST_HANDLE, new FirstHandler());
        handlers.put(SECOND_HANDLE, new SecondHandler());
        handlers.put(THIRD_HANDLE, new ThirdHandler());
    }

    private HandlerBase() {

    }

    private static HandlerBase _instance = new HandlerBase();

    public static HandlerBase getInstance() {
        return _instance;
    }

    public static Handle getHandle(String handle) {
        return handlers.get(handle);
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public void clearHandle() {
        this.handle = null;
    }

    public void invoke(Object obj) {
        if (handle != null) {
            handle.invoke(obj);
        } else {
            System.out.println("No Handlers avaialble to execute");
        }
    }

}
