/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener
 *  net.minecraft.class_2960
 *  net.minecraft.class_3300
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.class_2960;
import net.minecraft.class_3300;
import ruhack.phobia.d;
import ruhack.phobia.lc;

class d$1
implements SimpleSynchronousResourceReloadListener {
    protected static final long pc = 6941247640000559105L;
    private static long[] hwdg;
    public static final boolean c;
    private static long[] hwdh;
    public static final boolean a;
    private static int[] hwdq;
    public static final int b;
    private static int[] hwdp;

    public static /* synthetic */ CallSite hwdi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        hwdp = new int[18];
        hwdq = new int[18];
        d$1.hwfj();
        d$1.hwfm();
        hwdg = new long[13];
        hwdh = new long[13];
        d$1.hwfp();
        d$1.hwfr();
    }

    private static /* synthetic */ long hwdf(int n2) {
        return hwdg[n2] ^ hwdh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_14491(class_3300 var1_1) {
        v0 /* !! */  = d$1.pc;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(d$1.hwdi("hwen", hwdf(int ), (int)6) - d$1.hwdi("hwel", hwdf(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -935299071: {
                    break block21;
                }
                case 998022327: {
                    continue block21;
                }
            }
            break;
        }
        var4_2 = d$1.c;
        v1 /* !! */  = d$1.pc;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - d$1.hwdi("hwep", hwdf(int ), (int)7));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -935299071: {
                    break block22;
                }
                case 1478590473: {
                    v2 = d$1.hwdi("hweq", hwdf(int ), (int)8);
                    continue block22;
                }
                case 1909136359: {
                    v2 = d$1.hwdi("hwes", hwdf(int ), (int)9);
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = d$1.b;
        v3 /* !! */  = d$1.pc;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(d$1.hwdi("hwev", hwdf(int ), (int)11) - d$1.hwdi("hwet", hwdf(int ), (int)10));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -935299071: {
                    break block23;
                }
                case 105165757: {
                    continue block23;
                }
            }
            break;
        }
        var2_4 = d$1.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block13 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = d$1.pc - d$1.hwdi("hwey", hwdf(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == d$1.hwdi("hwez", hwdo(int ), (int)10)) break;
                    v4 /* !! */  = (long)d$1.hwdi("hwfb", hwdo(int ), (int)11);
                }
                lc.reload();
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)d$1.hwdi("hwfc", hwdo(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)d$1.hwdi("hwfd", hwdo(int ), (int)13);
                    if (!var4_2) break block13;
                    throw null;
                }
            }
lbl61:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)d$1.hwdi("hwfe", hwdo(int ), (int)14);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)d$1.hwdi("hwff", hwdo(int ), (int)15);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)d$1.hwdi("hwfg", hwdo(int ), (int)16);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)d$1.hwdi("hwfh", hwdo(int ), (int)17);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hwfr() {
        d$1.hwdh[0] = -3325118646496355658L;
        d$1.hwdh[1] = -1147385387279920360L;
        d$1.hwdh[2] = -3066373126993932079L;
        d$1.hwdh[3] = -6569437623425618350L;
        d$1.hwdh[4] = 116172213078014812L;
        d$1.hwdh[5] = -2102634043510234916L;
        d$1.hwdh[6] = 8073739378271666858L;
        d$1.hwdh[7] = 5173675150861503482L;
        d$1.hwdh[8] = -6424641196315148930L;
        d$1.hwdh[9] = 9194047219855344535L;
        d$1.hwdh[10] = 9174716625631610965L;
        d$1.hwdh[11] = 5228497669281538350L;
        d$1.hwdh[12] = -4836438902452261901L;
    }

    private static /* synthetic */ void hwfm() {
        d$1.hwdq[0] = -1147511584;
        d$1.hwdq[1] = 387654346;
        d$1.hwdq[2] = 470209080;
        d$1.hwdq[3] = 642140486;
        d$1.hwdq[4] = -1050112917;
        d$1.hwdq[5] = -1244479586;
        d$1.hwdq[6] = 1101588462;
        d$1.hwdq[7] = -1532945835;
        d$1.hwdq[8] = -2112805142;
        d$1.hwdq[9] = 1141892345;
        d$1.hwdq[10] = 725005696;
        d$1.hwdq[11] = 698985924;
        d$1.hwdq[12] = 1119020337;
        d$1.hwdq[13] = -1083885545;
        d$1.hwdq[14] = 2136034007;
        d$1.hwdq[15] = 2004978453;
        d$1.hwdq[16] = -44943586;
        d$1.hwdq[17] = -668208691;
    }

    private static /* synthetic */ void hwfj() {
        d$1.hwdp[0] = -1147511583;
        d$1.hwdp[1] = -830179566;
        d$1.hwdp[2] = 470209081;
        d$1.hwdp[3] = -2078406246;
        d$1.hwdp[4] = -1050112918;
        d$1.hwdp[5] = 997377754;
        d$1.hwdp[6] = 1101588460;
        d$1.hwdp[7] = -1532945833;
        d$1.hwdp[8] = -2112805141;
        d$1.hwdp[9] = 1141892344;
        d$1.hwdp[10] = -725005697;
        d$1.hwdp[11] = -1773332924;
        d$1.hwdp[12] = 1119020339;
        d$1.hwdp[13] = -1083885550;
        d$1.hwdp[14] = 2136034006;
        d$1.hwdp[15] = 2004978449;
        d$1.hwdp[16] = -44943587;
        d$1.hwdp[17] = -668208692;
    }

    d$1(d d2) {
    }

    private static /* synthetic */ void hwfp() {
        d$1.hwdg[0] = -5593881360716174646L;
        d$1.hwdg[1] = 6461870045046565947L;
        d$1.hwdg[2] = -7696180569128404559L;
        d$1.hwdg[3] = -6680043586257891654L;
        d$1.hwdg[4] = 5925930955260346797L;
        d$1.hwdg[5] = -5296307741219857542L;
        d$1.hwdg[6] = -5069754786492682210L;
        d$1.hwdg[7] = 7594174206582606045L;
        d$1.hwdg[8] = -2843375338870100212L;
        d$1.hwdg[9] = 7553682572794703745L;
        d$1.hwdg[10] = -7968789426622520096L;
        d$1.hwdg[11] = -1697454555637399000L;
        d$1.hwdg[12] = -2634145623924911703L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2960 getFabricId() {
        v0 /* !! */  = d$1.pc;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(d$1.hwdi("hwdl", hwdf(int ), (int)1) - d$1.hwdi("hwdk", hwdf(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -935299071: {
                    break block10;
                }
                case -542468956: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = d$1.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = d$1.pc - d$1.hwdi("hwdn", hwdf(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == d$1.hwdi("hwdr", hwdo(int ), (int)0)) break;
            v1 /* !! */  = (long)d$1.hwdi("hwds", hwdo(int ), (int)1);
        }
        var2_2 /* !! */  = d$1.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = d$1.pc - d$1.hwdi("hwdu", hwdf(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == d$1.hwdi("hwdv", hwdo(int ), (int)2)) break;
            v2 /* !! */  = (long)d$1.hwdi("hwdw", hwdo(int ), (int)3);
        }
        var1_3 = d$1.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = d$1.pc - d$1.hwdi("hwdz", hwdf(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == d$1.hwdi("hweb", hwdo(int ), (int)4)) break;
                    v3 /* !! */  = (long)d$1.hwdi("hwec", hwdo(int ), (int)5);
                }
                return class_2960.method_60655((String)"phobia", (String)"main_menu_render_resources");
            }
lbl41:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)d$1.hwdi("hwee", hwdo(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)d$1.hwdi("hwef", hwdo(int ), (int)7);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)d$1.hwdi("hweh", hwdo(int ), (int)8);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)d$1.hwdi("hwej", hwdo(int ), (int)9);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int hwdo(int n2) {
        return hwdp[n2] ^ hwdq[n2];
    }
}

