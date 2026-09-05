/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09166
 */
package Nursultan;

import Nursultan.class09166;

public class class11085
extends Enum<class11085> {
    public static final /* enum */ class11085 MID_CHEST;
    public static final /* enum */ class11085 UPPER_CHEST;
    public static final /* enum */ class11085 SHOULDER;
    public static final /* enum */ class11085 HEAD_LINE;
    private static final /* synthetic */ class11085[] $VALUES;

    static {
        class11085.u();
        MID_CHEST = new class11085();
        UPPER_CHEST = new class11085();
        SHOULDER = new class11085();
        HEAD_LINE = new class11085();
        $VALUES = class11085.i();
    }

    public static class11085[] values() {
        return (class11085[])$VALUES.clone();
    }

    public static class11085 valueOf(String string) {
        return Enum.valueOf(class11085.class, string);
    }

    private static /* synthetic */ class11085[] i() {
        return new class11085[]{MID_CHEST, UPPER_CHEST, SHOULDER, HEAD_LINE};
    }

    private static void u() {
    }

    public class11085 N(class09166 class091662) {
        class11085[] class11085Array = class11085.values();
        class11085 class110852 = class11085Array[class091662.N(0, class11085Array.length - 1)];
        return class110852 == this ? class11085Array[(this.ordinal() + 1) % class11085Array.length] : class110852;
    }
}

