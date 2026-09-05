/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.bc;

public class bz
extends bc {
    private static int[] dyjw;
    public static final long js = -7768043670821633140L;
    private int fov;
    private static long[] dyiv;
    private static int[] dyjv;
    private static long[] dyiu;
    public static final boolean c;
    public static final int b;
    public static final boolean a;

    static {
        dyjv = new int[14];
        dyjw = new int[14];
        bz.dymb();
        bz.dymf();
        dyiu = new long[24];
        dyiv = new long[24];
        bz.dymh();
        bz.dymo();
    }

    public static /* synthetic */ CallSite dyiw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dyjt(int n2) {
        return dyjv[n2] ^ dyjw[n2];
    }

    private static /* synthetic */ void dymb() {
        bz.dyjv[0] = 637426387;
        bz.dyjv[1] = -52635161;
        bz.dyjv[2] = 646135015;
        bz.dyjv[3] = -1445616912;
        bz.dyjv[4] = -1346780249;
        bz.dyjv[5] = 1404109309;
        bz.dyjv[6] = -1297520776;
        bz.dyjv[7] = 1678051661;
        bz.dyjv[8] = -520194554;
        bz.dyjv[9] = 1162364975;
        bz.dyjv[10] = -2104888788;
        bz.dyjv[11] = -1606609530;
        bz.dyjv[12] = -859781896;
        bz.dyjv[13] = 471984633;
    }

    private static /* synthetic */ void dymo() {
        bz.dyiv[0] = -7383724523903921095L;
        bz.dyiv[1] = 4120252626573155071L;
        bz.dyiv[2] = 8367319039450812730L;
        bz.dyiv[3] = 7576240130598024309L;
        bz.dyiv[4] = 7959724132938014216L;
        bz.dyiv[5] = 8258502519678230237L;
        bz.dyiv[6] = -611040644221802582L;
        bz.dyiv[7] = 6514942849163074598L;
        bz.dyiv[8] = 2118287948138060218L;
        bz.dyiv[9] = 6027590120151497830L;
        bz.dyiv[10] = -6884449666262454031L;
        bz.dyiv[11] = -8344042636520118378L;
        bz.dyiv[12] = -3426626744975939348L;
        bz.dyiv[13] = 8010403424434521856L;
        bz.dyiv[14] = -6142481443173261005L;
        bz.dyiv[15] = -1228794386821186939L;
        bz.dyiv[16] = -2572789461925816691L;
        bz.dyiv[17] = -8446618786178961723L;
        bz.dyiv[18] = -4269608710132049071L;
        bz.dyiv[19] = -6653010079421426317L;
        bz.dyiv[20] = -9066552483371067588L;
        bz.dyiv[21] = -7378377520317244598L;
        bz.dyiv[22] = -4353908157122154363L;
        bz.dyiv[23] = 5264020133612702017L;
    }

    private static /* synthetic */ long dyit(int n2) {
        return dyiu[n2] ^ dyiv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getFov() {
        v0 /* !! */  = bz.js;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - bz.dyiw("dyje", dyit(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -590398643: {
                    v1 = bz.dyiw("dyjf", dyit(int ), (int)1);
                    continue block18;
                }
                case 821330828: {
                    break block18;
                }
                case 1760205934: {
                    v1 = bz.dyiw("dyjg", dyit(int ), (int)2);
                    continue block18;
                }
                case 2011367154: {
                    v1 = bz.dyiw("dyjh", dyit(int ), (int)3);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = bz.c;
        v2 /* !! */  = bz.js;
        if (true) ** GOTO lbl22
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - bz.dyiw("dyji", dyit(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1043325214: {
                    v3 = bz.dyiw("dyjj", dyit(int ), (int)5);
                    continue block19;
                }
                case 821330828: {
                    break block19;
                }
                case 1688318932: {
                    v3 = bz.dyiw("dyjn", dyit(int ), (int)6);
                    continue block19;
                }
                case 1995780170: {
                    v3 = bz.dyiw("dyjp", dyit(int ), (int)7);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = bz.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = bz.js - bz.dyiw("dyjr", dyit(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == bz.dyiw("dyjx", dyjt(int ), (int)0)) break;
            v4 /* !! */  = (long)bz.dyiw("dyka", dyjt(int ), (int)1);
        }
        var1_3 = bz.a;
        if (var3_1) {
            throw null;
            return (int)bz.dyiw("dykb", dyjt(int ), (int)2);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = bz.js - bz.dyiw("dyke", dyit(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == bz.dyiw("dykg", dyjt(int ), (int)3)) break;
                    v5 /* !! */  = (long)bz.dyiw("dyki", dyjt(int ), (int)4);
                }
                return this.fov;
            }
            case 0: {
                var2_2 /* !! */  = (int)bz.dyiw("dykj", dyjt(int ), (int)5);
                if (!var3_1) break;
                throw null;
            }
lbl61:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)bz.dyiw("dykl", dyjt(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)bz.dyiw("dykn", dyjt(int ), (int)7);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)bz.dyiw("dykp", dyjt(int ), (int)8);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dymf() {
        bz.dyjw[0] = -637426388;
        bz.dyjw[1] = -705720643;
        bz.dyjw[2] = -1536832052;
        bz.dyjw[3] = 1445616911;
        bz.dyjw[4] = 618141430;
        bz.dyjw[5] = 1404109308;
        bz.dyjw[6] = -1297520774;
        bz.dyjw[7] = 1678051661;
        bz.dyjw[8] = -520194556;
        bz.dyjw[9] = 1162364974;
        bz.dyjw[10] = -2104888785;
        bz.dyjw[11] = -1606609531;
        bz.dyjw[12] = -859781892;
        bz.dyjw[13] = 471984632;
    }

    public bz() {
    }

    private static /* synthetic */ void dymh() {
        bz.dyiu[0] = 692714015524017861L;
        bz.dyiu[1] = 4539931764132329179L;
        bz.dyiu[2] = 1629673568435792333L;
        bz.dyiu[3] = 516518904580351451L;
        bz.dyiu[4] = -175653997983506459L;
        bz.dyiu[5] = 5441019814647823898L;
        bz.dyiu[6] = -3600886101820581850L;
        bz.dyiu[7] = 4458494727964163841L;
        bz.dyiu[8] = -6195759428062655161L;
        bz.dyiu[9] = 9148541194273263939L;
        bz.dyiu[10] = 2683153675764248533L;
        bz.dyiu[11] = 997644540509193763L;
        bz.dyiu[12] = -4817641308857104186L;
        bz.dyiu[13] = 8635235358999698599L;
        bz.dyiu[14] = 3080703541344546362L;
        bz.dyiu[15] = -2782216837212662680L;
        bz.dyiu[16] = -5563889045332455922L;
        bz.dyiu[17] = -1376533973251693877L;
        bz.dyiu[18] = -5355779807843180350L;
        bz.dyiu[19] = -313284810799428602L;
        bz.dyiu[20] = -5947130203392882161L;
        bz.dyiu[21] = 567882876747003561L;
        bz.dyiu[22] = -1910011704114913143L;
        bz.dyiu[23] = 6981431559838794675L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setFov(int var1_1) {
        v0 /* !! */  = bz.js;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - bz.dyiw("dyks", dyit(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1847990029: {
                    v1 = bz.dyiw("dyku", dyit(int ), (int)11);
                    continue block29;
                }
                case -38164892: {
                    v1 = bz.dyiw("dykw", dyit(int ), (int)12);
                    continue block29;
                }
                case 821330828: {
                    break block29;
                }
                case 2078759555: {
                    v1 = bz.dyiw("dykx", dyit(int ), (int)13);
                    continue block29;
                }
            }
            break;
        }
        var4_2 = bz.c;
        v2 /* !! */  = bz.js;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - bz.dyiw("dykz", dyit(int ), (int)14));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 821330828: {
                    break block30;
                }
                case 950101764: {
                    v3 = bz.dyiw("dyla", dyit(int ), (int)15);
                    continue block30;
                }
                case 1700398560: {
                    v3 = bz.dyiw("dylc", dyit(int ), (int)16);
                    continue block30;
                }
            }
            break;
        }
        var3_3 /* !! */  = bz.b;
        v4 /* !! */  = bz.js;
        if (true) ** GOTO lbl36
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - bz.dyiw("dyle", dyit(int ), (int)17));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -333853579: {
                    v5 = bz.dyiw("dylf", dyit(int ), (int)18);
                    continue block31;
                }
                case 280190850: {
                    v5 = bz.dyiw("dylh", dyit(int ), (int)19);
                    continue block31;
                }
                case 792568862: {
                    v5 = bz.dyiw("dyll", dyit(int ), (int)20);
                    continue block31;
                }
                case 821330828: {
                    break block31;
                }
            }
            break;
        }
        var2_4 = bz.a;
        if (var4_2) {
            throw null;
lbl51:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl51
        v6 /* !! */  = bz.js;
        if (true) ** GOTO lbl58
        block33: while (true) {
            v6 /* !! */  = (long)(v7 - bz.dyiw("dylm", dyit(int ), (int)21));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1417628729: {
                    v7 = bz.dyiw("dyln", dyit(int ), (int)22);
                    continue block33;
                }
                case -705059018: {
                    v7 = bz.dyiw("dylo", dyit(int ), (int)23);
                    continue block33;
                }
                case 821330828: {
                    break block33;
                }
            }
            break;
        }
        this.fov = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl74:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)bz.dyiw("dylq", dyjt(int ), (int)9);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)bz.dyiw("dylr", dyjt(int ), (int)10);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl89
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)bz.dyiw("dylt", dyjt(int ), (int)11);
                if (var4_2) {
                    throw null;
                }
            }
lbl89:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)bz.dyiw("dylz", dyjt(int ), (int)12);
                if (!var4_2) ** GOTO lbl74
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)bz.dyiw("dyma", dyjt(int ), (int)13);
        ** while (!var4_2)
lbl96:
        // 1 sources

        throw null;
    }
}

