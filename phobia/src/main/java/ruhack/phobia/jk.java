/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.nj;

public final class jk
extends ds {
    public static final boolean c;
    private static long[] kqyk;
    private static int[] kqya;
    private static int[] kqyb;
    private static long[] kqyj;
    public final ke modeSetting;
    public static final int b;
    static final long ta = 236095398322759362L;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jk() {
        var2_1 /* !! */  = jk.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Removals", "\u041f\u043e\u0432\u044b\u0448\u0430\u0435\u0442 FPS, \u0441\u043a\u0440\u044b\u0432\u0430\u044f \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u044b", du.RENDER);
                this.modeSetting = new ke("\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b, \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043d\u0443\u0436\u043d\u043e \u0441\u043a\u0440\u044b\u0442\u044c").value(new String[]{"Camera Shake", "Scoreboard", "Fishing Rod", "BossBar", "Destroy Particles", "Rain", "Camera Clip", "Shadows", "Smoke", "Totem Animation", "Vignette", "Arrows", "Holograms", "Health Effect", "Grass", "Bad Effects", "Glowing Players", "Players", "Underwater Blur", "Fire", "Titles", "Block Overlay", "Darkness", "Damage", "Nausea"}).selected(new String[]{"Camera Shake", "Scoreboard", "Fishing Rod", "BossBar", "Destroy Particles", "Rain", "Camera Clip", "Shadows", "Smoke", "Totem Animation", "Vignette", "Arrows", "Holograms", "Health Effect", "Grass", "Bad Effects", "Glowing Players", "Underwater Blur", "Fire", "Titles", "Block Overlay", "Darkness", "Damage", "Nausea"});
                this.settings(new jx[]{this.modeSetting});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)jk.kqyc("kqyd", kqxz(int ), (int)0);
                ** GOTO lbl18
            }
            case 1: {
                var2_1 /* !! */  = (int)jk.kqyc("kqye", kqxz(int ), (int)1);
                ** GOTO lbl18
            }
            case 2: {
                var2_1 /* !! */  = (int)jk.kqyc("kqyf", kqxz(int ), (int)2);
                break;
            }
lbl18:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)jk.kqyc("kqyg", kqxz(int ), (int)3);
            }
            case 4: 
        }
        while (true) {
            var2_1 /* !! */  = (int)jk.kqyc("kqyh", kqxz(int ), (int)4);
        }
    }

    private static /* synthetic */ void kqze() {
        jk.kqyk[0] = -5045685445225527946L;
        jk.kqyk[1] = 8387024396588705626L;
        jk.kqyk[2] = -288524273949310601L;
        jk.kqyk[3] = -8905624331795827997L;
        jk.kqyk[4] = -4949663675210902359L;
        jk.kqyk[5] = 5979692192872484392L;
    }

    private static /* synthetic */ void kqzb() {
        jk.kqya[0] = -2016568231;
        jk.kqya[1] = 2141007417;
        jk.kqya[2] = 1207648874;
        jk.kqya[3] = 1321501191;
        jk.kqya[4] = 1260573239;
        jk.kqya[5] = 250468387;
        jk.kqya[6] = -1126468459;
        jk.kqya[7] = 245294255;
        jk.kqya[8] = 1282464846;
        jk.kqya[9] = 341228214;
        jk.kqya[10] = -1520738567;
        jk.kqya[11] = 261108820;
        jk.kqya[12] = 545171489;
        jk.kqya[13] = 2000636720;
        jk.kqya[14] = 1059412097;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jk getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jk.ta - jk.kqyc("kqyl", kqyi(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jk.kqyc("kqym", kqxz(int ), (int)5)) break;
            v0 /* !! */  = (long)jk.kqyc("kqyn", kqxz(int ), (int)6);
        }
        var2 = jk.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jk.ta - jk.kqyc("kqyo", kqyi(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jk.kqyc("kqyp", kqxz(int ), (int)7)) break;
            v1 /* !! */  = (long)jk.kqyc("kqyq", kqxz(int ), (int)8);
        }
        var1_1 /* !! */  = jk.b;
        v2 /* !! */  = jk.ta;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - jk.kqyc("kqyr", kqyi(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1910380862: {
                    break block13;
                }
                case -60522692: {
                    v3 = jk.kqyc("kqys", kqyi(int ), (int)3);
                    continue block13;
                }
                case 1812818201: {
                    v3 = jk.kqyc("kqyt", kqyi(int ), (int)4);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = jk.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jk.ta - jk.kqyc("kqyu", kqyi(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jk.kqyc("kqyv", kqxz(int ), (int)9)) break;
                    v4 /* !! */  = (long)jk.kqyc("kqyw", kqxz(int ), (int)10);
                }
                return nj.get(jk.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)jk.kqyc("kqyx", kqxz(int ), (int)11);
                if (!var2) break;
                throw null;
            }
lbl48:
            // 2 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)jk.kqyc("kqyy", kqxz(int ), (int)12);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jk.kqyc("kqyz", kqxz(int ), (int)13);
                    if (!var2) ** GOTO lbl48
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jk.kqyc("kqza", kqxz(int ), (int)14);
        ** while (!var2)
lbl61:
        // 1 sources

        throw null;
    }

    static {
        kqya = new int[15];
        kqyb = new int[15];
        jk.kqzb();
        jk.kqzc();
        kqyj = new long[6];
        kqyk = new long[6];
        jk.kqzd();
        jk.kqze();
    }

    private static /* synthetic */ long kqyi(int n2) {
        return kqyj[n2] ^ kqyk[n2];
    }

    private static /* synthetic */ void kqzc() {
        jk.kqyb[0] = -2016568232;
        jk.kqyb[1] = 2141007417;
        jk.kqyb[2] = 1207648875;
        jk.kqyb[3] = 1321501188;
        jk.kqyb[4] = 1260573237;
        jk.kqyb[5] = -250468388;
        jk.kqyb[6] = -1699478610;
        jk.kqyb[7] = -245294256;
        jk.kqyb[8] = 684846010;
        jk.kqyb[9] = -341228215;
        jk.kqyb[10] = 1505500364;
        jk.kqyb[11] = 261108821;
        jk.kqyb[12] = 545171491;
        jk.kqyb[13] = 2000636720;
        jk.kqyb[14] = 1059412098;
    }

    private static /* synthetic */ void kqzd() {
        jk.kqyj[0] = -301659794077812639L;
        jk.kqyj[1] = 3287593854731171479L;
        jk.kqyj[2] = -6996444429234070012L;
        jk.kqyj[3] = -4130779099909342881L;
        jk.kqyj[4] = 4333303687278278034L;
        jk.kqyj[5] = 227395853408366191L;
    }

    private static /* synthetic */ int kqxz(int n2) {
        return kqya[n2] ^ kqyb[n2];
    }

    public static /* synthetic */ CallSite kqyc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

