/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class11794
extends Enum<class11794> {
    public static final /* enum */ class11794 CREATED = new class11794(1);
    public static final /* enum */ class11794 ALREADY_ACTIVATED = new class11794(2);
    public static final /* enum */ class11794 OWN_LINK = new class11794(3);
    public static final /* enum */ class11794 UPDATED = new class11794(4);
    public static Map staticFields_0f06a2832f8fa3cf9a97efc5703133649_4;
    private static final /* synthetic */ class11794[] $VALUES;
    public Integer fields_0f06a2832f8fa3cf9a97efc5703133649_0;
    public boolean fields_0f06a2832f8fa3cf9a97efc5703133649_init;

    private class11794(int n2) {
        this.i();
        this.fields_0f06a2832f8fa3cf9a97efc5703133649_0 = n2;
    }

    static {
        $VALUES = class11794.y();
        staticFields_0f06a2832f8fa3cf9a97efc5703133649_4 = new HashMap();
        class11794[] class11794Array = class11794.values();
        staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(Integer.valueOf(class11794Array[0].fields_0f06a2832f8fa3cf9a97efc5703133649_0), (Object)((Object)class11794Array[0]));
        staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(Integer.valueOf(class11794Array[1].fields_0f06a2832f8fa3cf9a97efc5703133649_0), (Object)((Object)class11794Array[1]));
        staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(Integer.valueOf(class11794Array[2].fields_0f06a2832f8fa3cf9a97efc5703133649_0), (Object)((Object)class11794Array[2]));
        staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(Integer.valueOf(class11794Array[3].fields_0f06a2832f8fa3cf9a97efc5703133649_0), (Object)((Object)class11794Array[3]));
    }

    public static class11794[] values() {
        return (class11794[])$VALUES.clone();
    }

    public static class11794 valueOf(String string) {
        return Enum.valueOf(class11794.class, string);
    }

    private static void B() {
        CREATED = null;
        ALREADY_ACTIVATED = null;
        OWN_LINK = null;
        UPDATED = null;
        staticFields_0f06a2832f8fa3cf9a97efc5703133649_4 = null;
        $VALUES = null;
    }

    private void i() {
        if (!this.fields_0f06a2832f8fa3cf9a97efc5703133649_init) {
            this.fields_0f06a2832f8fa3cf9a97efc5703133649_init = true;
            this.fields_0f06a2832f8fa3cf9a97efc5703133649_0 = 0;
        }
    }

    private static /* synthetic */ class11794[] y() {
        return new class11794[]{CREATED, ALREADY_ACTIVATED, OWN_LINK, UPDATED};
    }

    public int N() {
        return this.fields_0f06a2832f8fa3cf9a97efc5703133649_0;
    }

    public static class11794 N(int n) {
        return (class11794)((Object)staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.get(n));
    }
}

