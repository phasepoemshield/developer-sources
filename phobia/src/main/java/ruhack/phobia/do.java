/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class do
extends RuntimeException {
    private static int[] bsuf;
    public static final int b;
    protected static final long ee = 2579537251174689144L;
    private static int[] bsue;

    private static /* synthetic */ void bsuk() {
        do.bsue[0] = -1652595775;
        do.bsue[1] = -25708256;
        do.bsue[2] = -463088586;
    }

    public do(String string) {
        int n2 = b;
        super("Duplicate module registration: " + string);
    }

    public static /* synthetic */ CallSite bsug(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int bsud(int n2) {
        return bsue[n2] ^ bsuf[n2];
    }

    static {
        bsue = new int[3];
        bsuf = new int[3];
        do.bsuk();
        do.bsul();
    }

    private static /* synthetic */ void bsul() {
        do.bsuf[0] = -1652595773;
        do.bsuf[1] = -25708256;
        do.bsuf[2] = -463088586;
    }
}

