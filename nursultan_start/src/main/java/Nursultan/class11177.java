/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11188;
import Nursultan.class11197;
import Nursultan.class11209;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11177 {
    private static String[] E;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object y_0;
    public static Object y_1;

    public static class11209 L(String string) {
        return (class11209)((Map)N_4).get(string);
    }

    public static boolean L() {
        return (Boolean)N_5;
    }

    private static void M() {
        E = new String[3];
        class11177.E[0] = "GpuProfiler.beginFrame() called twice without endFrame()";
        class11177.E[1] = "GpuProfiler.endFrame() with {} unclosed scope(s); auto-closing";
        class11177.E[2] = "GpuProfiler.end() called without matching begin()";
    }

    private class11177() {
    }

    static {
        class11177.M();
        class11177.m();
        N_0 = LogManager.getLogger(String.class);
        N_2 = new LinkedHashMap();
        N_3 = new ArrayDeque();
        N_4 = new LinkedHashMap();
    }

    private static void Z() {
        ((Deque)N_3).clear();
        ((Map)N_2).values().forEach(class11188::N);
        ((Map)N_2).clear();
        ((Map)N_4).clear();
        N_6 = 0L;
        y_0 = 0;
        y_1 = false;
    }

    public static void i() {
        if (!((Boolean)N_5).booleanValue() || !((Boolean)y_1).booleanValue()) {
            return;
        }
        if (!((Deque)N_3).isEmpty()) {
            ((Logger)N_0).warn(E[1], (Object)((Deque)N_3).size());
            class11177.z();
        }
        N_6 = (Long)N_6 + 1L;
        y_1 = false;
    }

    private static void m() {
        N_1 = 3;
        N_5 = false;
        N_6 = 0L;
        y_0 = 0;
        y_1 = false;
    }

    private static void z() {
        while (!((Deque)N_3).isEmpty()) {
            ((class11188)((Deque)N_3).pollFirst()).L((Integer)y_0);
        }
    }

    public static void u() {
        ((Map)N_4).values().forEach(class11209::u);
    }

    public static void y() {
        if (!((Boolean)N_5).booleanValue() || !((Boolean)y_1).booleanValue()) {
            return;
        }
        class11188 class111882 = (class11188)((Deque)N_3).pollFirst();
        if (class111882 == null) {
            ((Logger)N_0).warn(E[2]);
            return;
        }
        class111882.L((Integer)y_0);
    }

    public static class11197 y(String string) {
        if (!((Boolean)N_5).booleanValue() || !((Boolean)y_1).booleanValue()) {
            return (class11197)class11197.y[1];
        }
        class11177.N(string);
        return (class11197)class11197.y[0];
    }

    public static void N(String string2) {
        if (!((Boolean)N_5).booleanValue() || !((Boolean)y_1).booleanValue()) {
            return;
        }
        class11188 class111882 = ((Map)N_2).computeIfAbsent(string2, string -> new class11188(3));
        class111882.y((Integer)y_0);
        ((Deque)N_3).push(class111882);
    }

    public static void N(boolean bl) {
        if (bl == (Boolean)N_5) {
            return;
        }
        N_5 = bl;
        if (!bl) {
            class11177.Z();
        }
    }

    public static void N() {
        if (!((Boolean)N_5).booleanValue()) {
            return;
        }
        if (((Boolean)y_1).booleanValue()) {
            ((Logger)N_0).warn(E[0]);
            class11177.z();
        }
        y_1 = true;
        y_0 = (int)((Long)N_6 % 3L);
        if ((Long)N_6 >= 3L) {
            class11177.R((Integer)y_0);
        }
    }

    public static Map<String, class11209> R() {
        return Collections.unmodifiableMap(new LinkedHashMap((Map)N_4));
    }

    private static void R(int n) {
        for (Map.Entry entry : ((Map)N_2).entrySet()) {
            long l = ((class11188)entry.getValue()).N(n);
            if (l < 0L) continue;
            class11209 class112092 = (class11209)((Map)N_4).get(entry.getKey());
            if (class112092 == null) {
                ((Map)N_4).put((String)entry.getKey(), new class11209((String)entry.getKey(), l));
                continue;
            }
            class112092.N(l);
        }
    }
}

