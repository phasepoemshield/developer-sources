/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class11988
extends Enum<class11988> {
    public Integer fields_0ac290bb05b2c38d3be8b91c5c024efad_0;
    public boolean fields_0ac290bb05b2c38d3be8b91c5c024efad_init;
    public static final /* enum */ class11988 REQUEST_LIST = new class11988(1);
    public static final /* enum */ class11988 REQUEST_CREATE = new class11988(2);
    public static final /* enum */ class11988 REQUEST_DELETE = new class11988(3);
    public static final /* enum */ class11988 REQUEST_ACTIVATE = new class11988(4);
    public static final /* enum */ class11988 REQUEST_REFRESH = new class11988(5);
    public static Map staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5;
    private static final /* synthetic */ class11988[] $VALUES;

    private static void L() {
        REQUEST_LIST = null;
        REQUEST_CREATE = null;
        REQUEST_DELETE = null;
        REQUEST_ACTIVATE = null;
        REQUEST_REFRESH = null;
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5 = null;
        $VALUES = null;
    }

    private class11988(int n2) {
        this.B();
        this.fields_0ac290bb05b2c38d3be8b91c5c024efad_0 = n2;
    }

    static {
        $VALUES = class11988.u();
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5 = new HashMap();
        class11988[] class11988Array = class11988.values();
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(Integer.valueOf(class11988Array[0].fields_0ac290bb05b2c38d3be8b91c5c024efad_0), (Object)((Object)class11988Array[0]));
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(Integer.valueOf(class11988Array[1].fields_0ac290bb05b2c38d3be8b91c5c024efad_0), (Object)((Object)class11988Array[1]));
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(Integer.valueOf(class11988Array[2].fields_0ac290bb05b2c38d3be8b91c5c024efad_0), (Object)((Object)class11988Array[2]));
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(Integer.valueOf(class11988Array[3].fields_0ac290bb05b2c38d3be8b91c5c024efad_0), (Object)((Object)class11988Array[3]));
        staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(Integer.valueOf(class11988Array[4].fields_0ac290bb05b2c38d3be8b91c5c024efad_0), (Object)((Object)class11988Array[4]));
    }

    public static class11988[] values() {
        return (class11988[])$VALUES.clone();
    }

    public static class11988 valueOf(String string) {
        return Enum.valueOf(class11988.class, string);
    }

    private void B() {
        if (!this.fields_0ac290bb05b2c38d3be8b91c5c024efad_init) {
            this.fields_0ac290bb05b2c38d3be8b91c5c024efad_init = true;
            this.fields_0ac290bb05b2c38d3be8b91c5c024efad_0 = 0;
        }
    }

    private static /* synthetic */ class11988[] u() {
        return new class11988[]{REQUEST_LIST, REQUEST_CREATE, REQUEST_DELETE, REQUEST_ACTIVATE, REQUEST_REFRESH};
    }

    public static class11988 N(int n) {
        return (class11988)((Object)staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.get(n));
    }

    public int N() {
        return this.fields_0ac290bb05b2c38d3be8b91c5c024efad_0;
    }
}

