/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class12018;
import java.util.Arrays;
import java.util.Objects;

public class class11106
extends Enum<class11106> {
    public static final /* enum */ class11106 AUTO;
    public static final /* enum */ class11106 HELPER;
    public static final /* enum */ class11106 INTERFACE;
    public static final /* enum */ class11106 TRACKERS;
    public static final /* enum */ class11106 CLIENT;
    public static final /* enum */ class11106 BASE;
    private static final /* synthetic */ class11106[] $VALUES;
    public class12018 fields_0558c6655b04e3482a1b2216879a231f8_0;
    public static final /* enum */ class11106 FIGHTING;
    public static final /* enum */ class11106 TOOLS;
    public static final /* enum */ class11106 OTHER;
    public static final /* enum */ class11106 WORLD;
    public static final /* enum */ class11106 SCREEN;

    private class11106(String string2) {
        this.y();
        this.fields_0558c6655b04e3482a1b2216879a231f8_0 = new class12018("sub").N(string2);
    }

    static {
        class11106.R();
        FIGHTING = new class11106("fighting");
        TOOLS = new class11106("tools");
        OTHER = new class11106("other");
        WORLD = new class11106("world");
        SCREEN = new class11106("screen");
        AUTO = new class11106("auto");
        HELPER = new class11106("helper");
        INTERFACE = new class11106("interface");
        TRACKERS = new class11106("trackers");
        CLIENT = new class11106("client");
        BASE = new class11106("base");
        $VALUES = class11106.i();
    }

    public static class11106[] values() {
        return (class11106[])$VALUES.clone();
    }

    public static class11106 valueOf(String string) {
        return Enum.valueOf(class11106.class, string);
    }

    private static /* synthetic */ class11106[] i() {
        return new class11106[]{FIGHTING, TOOLS, OTHER, WORLD, SCREEN, AUTO, HELPER, INTERFACE, TRACKERS, CLIENT, BASE};
    }

    private void y() {
    }

    public class12018 N() {
        return this.fields_0558c6655b04e3482a1b2216879a231f8_0;
    }

    public static class11106 N(String string) {
        return Arrays.stream(class11106.values()).filter(class111062 -> Objects.equals(class111062.fields_0558c6655b04e3482a1b2216879a231f8_0.N(), string)).findFirst().orElse(null);
    }

    private static void R() {
    }
}

