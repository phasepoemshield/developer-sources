/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Arrays;

public class class09378
extends Enum<class09378> {
    public static final /* enum */ class09378 FRIENDS;
    public static final /* enum */ class09378 WAYPOINTS;
    public static final /* enum */ class09378 MACROS;
    public static final /* enum */ class09378 NUKER;
    public static final /* enum */ class09378 CLIENT_SETTINGS;
    private static final /* synthetic */ class09378[] $VALUES;
    public Integer fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0;
    public boolean fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_init;

    private static void L() {
    }

    private static /* synthetic */ class09378[] M() {
        return new class09378[]{FRIENDS, WAYPOINTS, MACROS, NUKER, CLIENT_SETTINGS};
    }

    private class09378(int n2) {
        this.y();
        this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0 = n2;
    }

    static {
        class09378.L();
        FRIENDS = new class09378(0);
        WAYPOINTS = new class09378(1);
        MACROS = new class09378(2);
        NUKER = new class09378(3);
        CLIENT_SETTINGS = new class09378(4);
        $VALUES = class09378.M();
    }

    public static class09378[] values() {
        return (class09378[])$VALUES.clone();
    }

    public static class09378 valueOf(String string) {
        return Enum.valueOf(class09378.class, string);
    }

    private void y() {
        if (!this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_init) {
            this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_init = true;
            this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0 = 0;
        }
    }

    public static class09378 N(int n) {
        return Arrays.stream(class09378.values()).filter(class093782 -> class093782.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0 == n).findFirst().orElse(null);
    }

    public int N() {
        return this.fields_06b7d1c105ca93cc5b92cf0a6ad6a47f1_0;
    }
}

