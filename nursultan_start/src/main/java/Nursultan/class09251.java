/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class09251
extends Enum<class09251> {
    public Integer fields_0822dda253458373d948078be7148763e_0;
    public boolean fields_0822dda253458373d948078be7148763e_init;
    public static final /* enum */ class09251 LIST_RESPONSE = new class09251(1);
    public static final /* enum */ class09251 CREATE_RESPONSE = new class09251(2);
    public static final /* enum */ class09251 DELETE_RESPONSE = new class09251(3);
    public static final /* enum */ class09251 NACK = new class09251(4);
    public static final /* enum */ class09251 ACTIVATE_RESPONSE = new class09251(5);
    public static final /* enum */ class09251 REFRESH_RESPONSE = new class09251(6);
    public static Map staticFields_0822dda253458373d948078be7148763e_6;
    private static final /* synthetic */ class09251[] $VALUES;

    private static /* synthetic */ class09251[] L() {
        return new class09251[]{LIST_RESPONSE, CREATE_RESPONSE, DELETE_RESPONSE, NACK, ACTIVATE_RESPONSE, REFRESH_RESPONSE};
    }

    private static void M() {
        LIST_RESPONSE = null;
        CREATE_RESPONSE = null;
        DELETE_RESPONSE = null;
        NACK = null;
        ACTIVATE_RESPONSE = null;
        REFRESH_RESPONSE = null;
        staticFields_0822dda253458373d948078be7148763e_6 = null;
        $VALUES = null;
    }

    private class09251(int n2) {
        this.i();
        this.fields_0822dda253458373d948078be7148763e_0 = n2;
    }

    static {
        $VALUES = class09251.L();
        staticFields_0822dda253458373d948078be7148763e_6 = new HashMap();
        class09251[] class09251Array = class09251.values();
        staticFields_0822dda253458373d948078be7148763e_6.put(Integer.valueOf(class09251Array[0].fields_0822dda253458373d948078be7148763e_0), (Object)((Object)class09251Array[0]));
        staticFields_0822dda253458373d948078be7148763e_6.put(Integer.valueOf(class09251Array[1].fields_0822dda253458373d948078be7148763e_0), (Object)((Object)class09251Array[1]));
        staticFields_0822dda253458373d948078be7148763e_6.put(Integer.valueOf(class09251Array[2].fields_0822dda253458373d948078be7148763e_0), (Object)((Object)class09251Array[2]));
        staticFields_0822dda253458373d948078be7148763e_6.put(Integer.valueOf(class09251Array[3].fields_0822dda253458373d948078be7148763e_0), (Object)((Object)class09251Array[3]));
        staticFields_0822dda253458373d948078be7148763e_6.put(Integer.valueOf(class09251Array[4].fields_0822dda253458373d948078be7148763e_0), (Object)((Object)class09251Array[4]));
        staticFields_0822dda253458373d948078be7148763e_6.put(Integer.valueOf(class09251Array[5].fields_0822dda253458373d948078be7148763e_0), (Object)((Object)class09251Array[5]));
    }

    public static class09251[] values() {
        return (class09251[])$VALUES.clone();
    }

    public static class09251 valueOf(String string) {
        return Enum.valueOf(class09251.class, string);
    }

    private void i() {
        if (!this.fields_0822dda253458373d948078be7148763e_init) {
            this.fields_0822dda253458373d948078be7148763e_init = true;
            this.fields_0822dda253458373d948078be7148763e_0 = 0;
        }
    }

    public int N() {
        return this.fields_0822dda253458373d948078be7148763e_0;
    }

    public static class09251 N(int n) {
        return (class09251)((Object)staticFields_0822dda253458373d948078be7148763e_6.get(n));
    }
}

