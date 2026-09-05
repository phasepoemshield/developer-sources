/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_332;
import ruhack.phobia.az;

public class bu
implements az {
    public static final int b;
    private float partialTicks;
    private static int[] dzvq;
    private static int[] dzvr;
    static final long jx = 1898839896022776442L;
    private static long[] dzve;
    public static final boolean c;
    public static final boolean a;
    private static long[] dzvd;
    private class_332 drawContext;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float getPartialTicks() {
        boolean bl2;
        Object object = jx;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - bu.dzvf("dzvy", dzvc(int ), (int)9);
            }
            switch ((int)object) {
                case -1781123194: {
                    callSite = bu.dzvf("dzvz", dzvc(int ), (int)10);
                    continue block10;
                }
                case -632135023: {
                    callSite = bu.dzvf("dzwa", dzvc(int ), (int)11);
                    continue block10;
                }
                case -49634491: {
                    callSite = bu.dzvf("dzwb", dzvc(int ), (int)12);
                    continue block10;
                }
                case 801569402: {
                    break block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = jx;
        block11: while (true) {
            switch ((int)object2) {
                case 791102194: {
                    object2 = bu.dzvf("dzwd", dzvc(int ), (int)14) - bu.dzvf("dzwc", dzvc(int ), (int)13);
                    continue block11;
                }
                case 801569402: {
                    break block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = jx - bu.dzvf("dzwe", dzvc(int ), (int)15)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == bu.dzvf("dzwf", dzvp(int ), (int)6)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = bu.dzvf("dzwg", dzvp(int ), (int)7);
        }
        if (bl2) return (float)bu.dzvf("dzwi", dzwh(int ), (int)8);
        if (bl2) return (float)bu.dzvf("dzwi", dzwh(int ), (int)8);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = jx - bu.dzvf("dzwj", dzvc(int ), (int)16)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == bu.dzvf("dzwk", dzvp(int ), (int)9)) {
                return this.partialTicks;
            }
            object4 = bu.dzvf("dzwl", dzvp(int ), (int)10);
        }
    }

    private static /* synthetic */ void dzwx() {
        bu.dzve[0] = -7375462099230565863L;
        bu.dzve[1] = 6929286264631635677L;
        bu.dzve[2] = -7339845710188632661L;
        bu.dzve[3] = 9210618107306299441L;
        bu.dzve[4] = -7739434900784285404L;
        bu.dzve[5] = 1534776278440474617L;
        bu.dzve[6] = 1370543240213851319L;
        bu.dzve[7] = -7783484156026945942L;
        bu.dzve[8] = -4154748369240470029L;
        bu.dzve[9] = 7501282819130124799L;
        bu.dzve[10] = 5195893247083819155L;
        bu.dzve[11] = 604058794707892064L;
        bu.dzve[12] = -531271161790203888L;
        bu.dzve[13] = 8977649904943798581L;
        bu.dzve[14] = -4654384757685198055L;
        bu.dzve[15] = 7401239061914812790L;
        bu.dzve[16] = 933578229191705095L;
    }

    private static /* synthetic */ int dzvp(int n2) {
        return dzvq[n2] ^ dzvr[n2];
    }

    private static /* synthetic */ void dzwu() {
        bu.dzvq[0] = -547939941;
        bu.dzvq[1] = 1946189200;
        bu.dzvq[2] = 133472913;
        bu.dzvq[3] = 1381355134;
        bu.dzvq[4] = 1131612909;
        bu.dzvq[5] = 1631078094;
        bu.dzvq[6] = 587412501;
        bu.dzvq[7] = -665713492;
        bu.dzvq[8] = 1158933943;
        bu.dzvq[9] = -617450943;
        bu.dzvq[10] = 1569155591;
        bu.dzvq[11] = 1769535243;
        bu.dzvq[12] = -344149604;
        bu.dzvq[13] = 1599535267;
        bu.dzvq[14] = 1456810024;
        bu.dzvq[15] = 203944979;
        bu.dzvq[16] = 255389203;
        bu.dzvq[17] = 1228173054;
        bu.dzvq[18] = 206798363;
    }

    private static /* synthetic */ void dzwv() {
        bu.dzvr[0] = -547939942;
        bu.dzvr[1] = 1203165261;
        bu.dzvr[2] = 133472915;
        bu.dzvr[3] = 1381355133;
        bu.dzvr[4] = 1131612909;
        bu.dzvr[5] = 1631078094;
        bu.dzvr[6] = 587412500;
        bu.dzvr[7] = 1806297016;
        bu.dzvr[8] = 2048849663;
        bu.dzvr[9] = -617450944;
        bu.dzvr[10] = 90909239;
        bu.dzvr[11] = 1769535242;
        bu.dzvr[12] = -344149603;
        bu.dzvr[13] = 1599535265;
        bu.dzvr[14] = 1456810025;
        bu.dzvr[15] = 203944979;
        bu.dzvr[16] = 255389202;
        bu.dzvr[17] = 1228173054;
        bu.dzvr[18] = 206798363;
    }

    static {
        dzvq = new int[19];
        dzvr = new int[19];
        bu.dzwu();
        bu.dzwv();
        dzvd = new long[17];
        dzve = new long[17];
        bu.dzww();
        bu.dzwx();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_332 getDrawContext() {
        v0 /* !! */  = bu.jx;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - bu.dzvf("dzvg", dzvc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 669952679: {
                    v1 = bu.dzvf("dzvh", dzvc(int ), (int)1);
                    continue block20;
                }
                case 801569402: {
                    break block20;
                }
                case 2119520086: {
                    v1 = bu.dzvf("dzvi", dzvc(int ), (int)2);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = bu.c;
        v2 /* !! */  = bu.jx;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - bu.dzvf("dzvj", dzvc(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2144065201: {
                    v3 = bu.dzvf("dzvk", dzvc(int ), (int)4);
                    continue block21;
                }
                case 547070218: {
                    v3 = bu.dzvf("dzvl", dzvc(int ), (int)5);
                    continue block21;
                }
                case 801569402: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = bu.b;
        v4 /* !! */  = bu.jx;
        if (true) ** GOTO lbl33
        block22: while (true) {
            v4 /* !! */  = (long)(bu.dzvf("dzvn", dzvc(int ), (int)7) - bu.dzvf("dzvm", dzvc(int ), (int)6));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 801569402: {
                    break block22;
                }
                case 852802179: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = bu.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block23;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = bu.jx - bu.dzvf("dzvo", dzvc(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == bu.dzvf("dzvs", dzvp(int ), (int)0)) break;
                    v5 /* !! */  = (long)bu.dzvf("dzvt", dzvp(int ), (int)1);
                }
                return this.drawContext;
                case 0: {
                    var2_2 /* !! */  = (int)bu.dzvf("dzvu", dzvp(int ), (int)2);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl57:
                // 4 sources

                case 1: {
                    var2_2 /* !! */  = (int)bu.dzvf("dzvv", dzvp(int ), (int)3);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)bu.dzvf("dzvw", dzvp(int ), (int)4);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)bu.dzvf("dzvx", dzvp(int ), (int)5);
        } while (!var3_1);
        throw null;
    }

    public bu(class_332 class_3322, float f2) {
        int n2 = b;
        boolean bl2 = a;
        this.drawContext = class_3322;
        this.partialTicks = f2;
    }

    private static /* synthetic */ float dzwh(int n2) {
        return Float.intBitsToFloat(dzvq[n2] ^ dzvr[n2]);
    }

    private static /* synthetic */ void dzww() {
        bu.dzvd[0] = -6979891470636312937L;
        bu.dzvd[1] = -9124687919481415868L;
        bu.dzvd[2] = -1693833959693221283L;
        bu.dzvd[3] = 6441989972932503475L;
        bu.dzvd[4] = 152427199269411903L;
        bu.dzvd[5] = 4214241648126925793L;
        bu.dzvd[6] = 2183969916651067483L;
        bu.dzvd[7] = -6627080801048789774L;
        bu.dzvd[8] = 8308176764971711741L;
        bu.dzvd[9] = 5846780750819184243L;
        bu.dzvd[10] = 6620577883498087385L;
        bu.dzvd[11] = -6973816269068868311L;
        bu.dzvd[12] = -4009614153330595237L;
        bu.dzvd[13] = 3168253442466509313L;
        bu.dzvd[14] = 5088436053323986257L;
        bu.dzvd[15] = -2261239465167419151L;
        bu.dzvd[16] = -2389545707376716848L;
    }

    private static /* synthetic */ long dzvc(int n2) {
        return dzvd[n2] ^ dzve[n2];
    }

    public static /* synthetic */ CallSite dzvf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

