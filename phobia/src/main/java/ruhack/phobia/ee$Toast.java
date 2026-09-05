/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import ruhack.phobia.ee$TextPart;
import ruhack.phobia.ee$Type;

final class ee$Toast {
    final ee.Type type;
    final long createdAt;
    private static int[] cjdk;
    final boolean sticky;
    private static int[] cjdj;
    final List<ee$TextPart> parts;
    static final long fx = -8091074313267859028L;
    public static final int b;

    private static /* synthetic */ void cjdt() {
        ee$Toast.cjdj[0] = -802631654;
        ee$Toast.cjdj[1] = 1500726012;
        ee$Toast.cjdj[2] = -1698594719;
        ee$Toast.cjdj[3] = 1045851626;
        ee$Toast.cjdj[4] = 961763149;
        ee$Toast.cjdj[5] = 1649962217;
        ee$Toast.cjdj[6] = 1587894242;
    }

    public static /* synthetic */ CallSite cjdl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int cjdi(int n2) {
        return cjdj[n2] ^ cjdk[n2];
    }

    ee$Toast(ee.Type type, List<ee$TextPart> list, boolean bl2) {
        int n2 = b;
        this.createdAt = System.currentTimeMillis();
        this.type = type;
        this.parts = list;
        this.sticky = bl2;
    }

    static {
        cjdj = new int[7];
        cjdk = new int[7];
        ee$Toast.cjdt();
        ee$Toast.cjdu();
    }

    private static /* synthetic */ void cjdu() {
        ee$Toast.cjdk[0] = -802631652;
        ee$Toast.cjdk[1] = 1500726014;
        ee$Toast.cjdk[2] = -1698594718;
        ee$Toast.cjdk[3] = 1045851628;
        ee$Toast.cjdk[4] = 961763144;
        ee$Toast.cjdk[5] = 1649962219;
        ee$Toast.cjdk[6] = 1587894242;
    }
}

