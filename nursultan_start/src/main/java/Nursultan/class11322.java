/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11281
 *  Nursultan.class11938
 *  minecraft.class02419
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class08044
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11281;
import Nursultan.class11938;
import java.util.Objects;
import minecraft.class02419;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class08044;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11322 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;

    public static void L(int n) {
        Objects.requireNonNull((class04453)((class06202)class11322.N_1).T_4);
        class08044 class080442 = ((class04453)((class06202)class11322.N_1).T_4).method_31548();
        class080442.N(class02419.N((double)n, (int)class080442.N(), (int)class08044.L()));
    }

    public static void L() {
        class11322.y();
        class11322.u();
    }

    public static void M() {
        N_2 = -1;
    }

    private class11322() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11322.U();
        N_0 = LogManager.getLogger(String.class);
        N_1 = class06202.Nq();
        N_2 = -1;
    }

    public static void i(int n) {
        class11322.y(n);
        class11322.u();
    }

    public static void i() {
        if (class11281.y((int)((Integer)N_2))) {
            return;
        }
        N_3 = true;
    }

    private static void U() {
        N_0 = null;
        N_1 = null;
        N_2 = -1;
        N_3 = false;
        N_4 = false;
    }

    private static boolean z(int n) {
        if (!class11281.u((int)n)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid slot");
            ((Logger)N_0).error((Object)illegalArgumentException, (Throwable)illegalArgumentException);
            return true;
        }
        return false;
    }

    public static void u() {
        Objects.requireNonNull((class03443)((class06202)class11322.N_1).T_2);
        ((class03443)((class06202)class11322.N_1).T_2).i();
    }

    public static void u(int n) {
        Objects.requireNonNull((class04453)((class06202)class11322.N_1).T_4);
        if (class11322.z(n)) {
            return;
        }
        class08044 class080442 = ((class04453)((class06202)class11322.N_1).T_4).method_31548();
        if (class11281.y((int)((Integer)N_2))) {
            N_2 = class080442.N();
        }
        class080442.N(n);
        N_4 = true;
    }

    public static void y() {
        Objects.requireNonNull((class04453)((class06202)class11322.N_1).T_4);
        if (class11281.y((int)((Integer)N_2))) {
            return;
        }
        ((class04453)((class06202)class11322.N_1).T_4).method_31548().N(((Integer)N_2).intValue());
        class11322.M();
    }

    public static void y(int n) {
        Objects.requireNonNull((class04453)((class06202)class11322.N_1).T_4);
        if (class11322.z(n)) {
            return;
        }
        ((class04453)((class06202)class11322.N_1).T_4).method_31548().N(n);
        N_4 = true;
    }

    public static void N(int n) {
        class11322.u(n);
        class11322.u();
    }

    public static void N() {
        class11938.Z().N(class11322::u);
    }

    public static void R() {
        if (((Boolean)N_4).booleanValue()) {
            N_4 = false;
            return;
        }
        if (!((Boolean)N_3).booleanValue()) {
            return;
        }
        N_3 = false;
        if ((class04453)((class06202)class11322.N_1).T_4 == null || class11281.y((int)((Integer)N_2))) {
            return;
        }
        ((class04453)((class06202)class11322.N_1).T_4).method_31548().N(((Integer)N_2).intValue());
        class11322.M();
    }

    public static void R(int n) {
        class11322.L(n);
        class11322.u();
    }
}

