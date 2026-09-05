/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import ruhack.phobia.ke;

final class mo$MultiDropdown
extends Record {
    private final float open;
    private final ke setting;
    private static long[] evkc;
    private static int[] evjs;
    protected static final long lh = 8438212872107169378L;
    public static final boolean c;
    public static final boolean a;
    private final float width;
    private static int[] evjr;
    private final float previewX;
    private final boolean interactive;
    private final float previewY;
    private static long[] evkb;
    public static final int b;
    private final float cardX;

    private static /* synthetic */ long evka(int n2) {
        return evkb[n2] ^ evkc[n2];
    }

    public static /* synthetic */ CallSite evjt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     */
    public float width() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = lh - mo$MultiDropdown.evjt("evod", evka(int ), (int)57)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$MultiDropdown.evjt("evoe", evjq(int ), (int)52)) break;
            object = mo$MultiDropdown.evjt("evof", evjq(int ), (int)53);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = lh - mo$MultiDropdown.evjt("evog", evka(int ), (int)58)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$MultiDropdown.evjt("evoh", evjq(int ), (int)54)) break;
            object = mo$MultiDropdown.evjt("evoi", evjq(int ), (int)55);
        }
        int n2 = b;
        Object object = lh;
        block10: while (true) {
            switch ((int)object) {
                case 1293129314: {
                    break block10;
                }
                case 1592727733: {
                    object = mo$MultiDropdown.evjt("evok", evka(int ), (int)60) - mo$MultiDropdown.evjt("evoj", evka(int ), (int)59);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (float)mo$MultiDropdown.evjt("evol", evnc(int ), (int)56);
        if (bl3) return (float)mo$MultiDropdown.evjt("evol", evnc(int ), (int)56);
        Object object2 = lh;
        block11: while (true) {
            switch ((int)object2) {
                case -1313495238: {
                    object2 = mo$MultiDropdown.evjt("evon", evka(int ), (int)62) - mo$MultiDropdown.evjt("evom", evka(int ), (int)61);
                    continue block11;
                }
                case 1293129314: {
                    return this.width;
                }
            }
            break;
        }
        return this.width;
    }

    private static /* synthetic */ void evqq() {
        mo$MultiDropdown.evjr[0] = -571371767;
        mo$MultiDropdown.evjr[1] = -470914653;
        mo$MultiDropdown.evjr[2] = 176897105;
        mo$MultiDropdown.evjr[3] = 1195739371;
        mo$MultiDropdown.evjr[4] = 361553135;
        mo$MultiDropdown.evjr[5] = 1568003217;
        mo$MultiDropdown.evjr[6] = -1165641586;
        mo$MultiDropdown.evjr[7] = -874909023;
        mo$MultiDropdown.evjr[8] = -510729987;
        mo$MultiDropdown.evjr[9] = 2006278332;
        mo$MultiDropdown.evjr[10] = 45688685;
        mo$MultiDropdown.evjr[11] = 296016388;
        mo$MultiDropdown.evjr[12] = -28410299;
        mo$MultiDropdown.evjr[13] = 2094419382;
        mo$MultiDropdown.evjr[14] = 1220327768;
        mo$MultiDropdown.evjr[15] = -421604138;
        mo$MultiDropdown.evjr[16] = 8939971;
        mo$MultiDropdown.evjr[17] = -1515678918;
        mo$MultiDropdown.evjr[18] = 727879871;
        mo$MultiDropdown.evjr[19] = -1412287625;
        mo$MultiDropdown.evjr[20] = 1597755067;
        mo$MultiDropdown.evjr[21] = -347435197;
        mo$MultiDropdown.evjr[22] = 775827334;
        mo$MultiDropdown.evjr[23] = 1642688212;
        mo$MultiDropdown.evjr[24] = 935587836;
        mo$MultiDropdown.evjr[25] = -1591820225;
        mo$MultiDropdown.evjr[26] = 863855451;
        mo$MultiDropdown.evjr[27] = -1602893597;
        mo$MultiDropdown.evjr[28] = -1608988604;
        mo$MultiDropdown.evjr[29] = 1367491478;
        mo$MultiDropdown.evjr[30] = 1402747315;
        mo$MultiDropdown.evjr[31] = -328601181;
        mo$MultiDropdown.evjr[32] = 1884747735;
        mo$MultiDropdown.evjr[33] = -500398485;
        mo$MultiDropdown.evjr[34] = 177907747;
        mo$MultiDropdown.evjr[35] = 1170541663;
        mo$MultiDropdown.evjr[36] = -401596402;
        mo$MultiDropdown.evjr[37] = 1412014171;
        mo$MultiDropdown.evjr[38] = -1190069282;
        mo$MultiDropdown.evjr[39] = 216702751;
        mo$MultiDropdown.evjr[40] = 596157587;
        mo$MultiDropdown.evjr[41] = -397649742;
        mo$MultiDropdown.evjr[42] = -1608911612;
        mo$MultiDropdown.evjr[43] = -279498061;
        mo$MultiDropdown.evjr[44] = 1423156271;
        mo$MultiDropdown.evjr[45] = -268619122;
        mo$MultiDropdown.evjr[46] = 1612220962;
        mo$MultiDropdown.evjr[47] = -697088505;
        mo$MultiDropdown.evjr[48] = 1345523973;
        mo$MultiDropdown.evjr[49] = -1346030364;
        mo$MultiDropdown.evjr[50] = -556381011;
        mo$MultiDropdown.evjr[51] = -414750396;
        mo$MultiDropdown.evjr[52] = 278119868;
        mo$MultiDropdown.evjr[53] = 1484100977;
        mo$MultiDropdown.evjr[54] = 942821016;
        mo$MultiDropdown.evjr[55] = -2089196393;
        mo$MultiDropdown.evjr[56] = -1445091937;
        mo$MultiDropdown.evjr[57] = -1514518354;
        mo$MultiDropdown.evjr[58] = -595899520;
        mo$MultiDropdown.evjr[59] = -6612220;
        mo$MultiDropdown.evjr[60] = 1391630407;
        mo$MultiDropdown.evjr[61] = -1818968934;
        mo$MultiDropdown.evjr[62] = 1334949761;
        mo$MultiDropdown.evjr[63] = -416858406;
        mo$MultiDropdown.evjr[64] = 223055604;
        mo$MultiDropdown.evjr[65] = -2055598037;
        mo$MultiDropdown.evjr[66] = 686208919;
        mo$MultiDropdown.evjr[67] = -1805155401;
        mo$MultiDropdown.evjr[68] = 1465135524;
        mo$MultiDropdown.evjr[69] = -382178130;
        mo$MultiDropdown.evjr[70] = -1460754820;
        mo$MultiDropdown.evjr[71] = 1916074685;
        mo$MultiDropdown.evjr[72] = -439715849;
        mo$MultiDropdown.evjr[73] = -796156267;
        mo$MultiDropdown.evjr[74] = 776133241;
        mo$MultiDropdown.evjr[75] = 1020220691;
        mo$MultiDropdown.evjr[76] = -2023965121;
        mo$MultiDropdown.evjr[77] = 1730390596;
        mo$MultiDropdown.evjr[78] = 939422023;
        mo$MultiDropdown.evjr[79] = 2131671101;
        mo$MultiDropdown.evjr[80] = -1053953539;
        mo$MultiDropdown.evjr[81] = 408642361;
        mo$MultiDropdown.evjr[82] = -1497915048;
        mo$MultiDropdown.evjr[83] = -683892183;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mo$MultiDropdown(ke var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7) {
        var9_8 /* !! */  = mo$MultiDropdown.b;
        super();
        this.setting = var1_1;
        this.previewX = var2_2;
        this.previewY = var3_3;
        this.width = var4_4;
        this.cardX = var5_5;
        this.open = var6_6;
        this.interactive = var7_7;
        if (var9_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl14:
            // 2 sources

            case 0: {
                var9_8 /* !! */  = (int)mo$MultiDropdown.evjt("evju", evjq(int ), (int)0);
                ** GOTO lbl25
            }
lbl17:
            // 2 sources

            case 1: {
                var9_8 /* !! */  = (int)mo$MultiDropdown.evjt("evjv", evjq(int ), (int)1);
            }
            case 2: {
                var9_8 /* !! */  = (int)mo$MultiDropdown.evjt("evjw", evjq(int ), (int)2);
                break;
            }
            case 3: {
                var9_8 /* !! */  = (int)mo$MultiDropdown.evjt("evjx", evjq(int ), (int)3);
                ** GOTO lbl17
            }
lbl25:
            // 2 sources

            case 4: {
                var9_8 /* !! */  = (int)mo$MultiDropdown.evjt("evjy", evjq(int ), (int)4);
                ** GOTO lbl14
            }
            case 5: 
        }
        while (true) {
            var9_8 /* !! */  = (int)mo$MultiDropdown.evjt("evjz", evjq(int ), (int)5);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiDropdown.evjt("evkt", evka(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -232361399: {
                    v1 = mo$MultiDropdown.evjt("evku", evka(int ), (int)11);
                    continue block21;
                }
                case 1031080438: {
                    v1 = mo$MultiDropdown.evjt("evkv", evka(int ), (int)12);
                    continue block21;
                }
                case 1293129314: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = mo$MultiDropdown.c;
        v2 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(mo$MultiDropdown.evjt("evkx", evka(int ), (int)14) - mo$MultiDropdown.evjt("evkw", evka(int ), (int)13));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -813613899: {
                    continue block22;
                }
                case 1293129314: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$MultiDropdown.b;
        v3 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - mo$MultiDropdown.evjt("evky", evka(int ), (int)15));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1654604519: {
                    v4 = mo$MultiDropdown.evjt("evkz", evka(int ), (int)16);
                    continue block23;
                }
                case 977712382: {
                    v4 = mo$MultiDropdown.evjt("evla", evka(int ), (int)17);
                    continue block23;
                }
                case 1158147271: {
                    v4 = mo$MultiDropdown.evjt("evlb", evka(int ), (int)18);
                    continue block23;
                }
                case 1293129314: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = mo$MultiDropdown.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (int)mo$MultiDropdown.evjt("evlc", evjq(int ), (int)12);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evld", evka(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$MultiDropdown.evjt("evle", evjq(int ), (int)13)) break;
                    v5 /* !! */  = (long)mo$MultiDropdown.evjt("evlf", evjq(int ), (int)14);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$MultiDropdown.class, "setting;previewX;previewY;width;cardX;open;interactive", "setting", "previewX", "previewY", "width", "cardX", "open", "interactive"}, this);
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evlg", evjq(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evlh", evjq(int ), (int)16);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evli", evjq(int ), (int)17);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evlj", evjq(int ), (int)18);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float previewX() {
        v0 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(mo$MultiDropdown.evjt("evmu", evka(int ), (int)35) - mo$MultiDropdown.evjt("evmt", evka(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -847041535: {
                    continue block22;
                }
                case 1293129314: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = mo$MultiDropdown.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evmv", evka(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$MultiDropdown.evjt("evmw", evjq(int ), (int)40)) break;
            v1 /* !! */  = (long)mo$MultiDropdown.evjt("evmx", evjq(int ), (int)41);
        }
        var2_2 /* !! */  = mo$MultiDropdown.b;
        v2 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - mo$MultiDropdown.evjt("evmy", evka(int ), (int)37));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -937579603: {
                    v3 = mo$MultiDropdown.evjt("evmz", evka(int ), (int)38);
                    continue block24;
                }
                case -717102231: {
                    v3 = mo$MultiDropdown.evjt("evna", evka(int ), (int)39);
                    continue block24;
                }
                case 1293129314: {
                    break block24;
                }
                case 1544202396: {
                    v3 = mo$MultiDropdown.evjt("evnb", evka(int ), (int)40);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = mo$MultiDropdown.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (float)mo$MultiDropdown.evjt("evnd", evnc(int ), (int)42);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mo$MultiDropdown.lh;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$MultiDropdown.evjt("evne", evka(int ), (int)41));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1312396511: {
                            v5 = mo$MultiDropdown.evjt("evnf", evka(int ), (int)42);
                            continue block26;
                        }
                        case -802332212: {
                            v5 = mo$MultiDropdown.evjt("evng", evka(int ), (int)43);
                            continue block26;
                        }
                        case -290474021: {
                            v5 = mo$MultiDropdown.evjt("evnh", evka(int ), (int)44);
                            continue block26;
                        }
                        case 1293129314: {
                            break block26;
                        }
                    }
                    break;
                }
                return this.previewX;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evni", evjq(int ), (int)43);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl71
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evnj", evjq(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
            }
lbl71:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evnk", evjq(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evnl", evjq(int ), (int)46);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean interactive() {
        v0 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiDropdown.evjt("evpz", evka(int ), (int)82));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1248138214: {
                    v1 = mo$MultiDropdown.evjt("evqa", evka(int ), (int)83);
                    continue block16;
                }
                case -527208473: {
                    v1 = mo$MultiDropdown.evjt("evqb", evka(int ), (int)84);
                    continue block16;
                }
                case 628307845: {
                    v1 = mo$MultiDropdown.evjt("evqc", evka(int ), (int)85);
                    continue block16;
                }
                case 1293129314: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = mo$MultiDropdown.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evqd", evka(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiDropdown.evjt("evqe", evjq(int ), (int)75)) break;
            v2 /* !! */  = (long)mo$MultiDropdown.evjt("evqf", evjq(int ), (int)76);
        }
        var2_2 /* !! */  = mo$MultiDropdown.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evqg", evka(int ), (int)87)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$MultiDropdown.evjt("evqh", evjq(int ), (int)77)) break;
            v3 /* !! */  = (long)mo$MultiDropdown.evjt("evqi", evjq(int ), (int)78);
        }
        var1_3 = mo$MultiDropdown.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)mo$MultiDropdown.evjt("evqj", evjq(int ), (int)79);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = mo$MultiDropdown.lh;
                if (true) ** GOTO lbl44
                block20: while (true) {
                    v4 /* !! */  = (long)(mo$MultiDropdown.evjt("evql", evka(int ), (int)89) - mo$MultiDropdown.evjt("evqk", evka(int ), (int)88));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2007865710: {
                            continue block20;
                        }
                        case 1293129314: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.interactive;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evqm", evjq(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evqn", evjq(int ), (int)81);
                if (!var3_1) break;
                throw null;
            }
lbl59:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evqo", evjq(int ), (int)82);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evqp", evjq(int ), (int)83);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void evqr() {
        mo$MultiDropdown.evjs[0] = -571371765;
        mo$MultiDropdown.evjs[1] = -470914653;
        mo$MultiDropdown.evjs[2] = 176897109;
        mo$MultiDropdown.evjs[3] = 1195739375;
        mo$MultiDropdown.evjs[4] = 361553134;
        mo$MultiDropdown.evjs[5] = 1568003219;
        mo$MultiDropdown.evjs[6] = -1165641585;
        mo$MultiDropdown.evjs[7] = 621828077;
        mo$MultiDropdown.evjs[8] = -510729988;
        mo$MultiDropdown.evjs[9] = 2006278332;
        mo$MultiDropdown.evjs[10] = 45688685;
        mo$MultiDropdown.evjs[11] = 296016388;
        mo$MultiDropdown.evjs[12] = 947279669;
        mo$MultiDropdown.evjs[13] = 2094419383;
        mo$MultiDropdown.evjs[14] = 879844316;
        mo$MultiDropdown.evjs[15] = -421604137;
        mo$MultiDropdown.evjs[16] = 8939969;
        mo$MultiDropdown.evjs[17] = -1515678918;
        mo$MultiDropdown.evjs[18] = 727879869;
        mo$MultiDropdown.evjs[19] = -1412287626;
        mo$MultiDropdown.evjs[20] = -466719237;
        mo$MultiDropdown.evjs[21] = -347435198;
        mo$MultiDropdown.evjs[22] = 1268683079;
        mo$MultiDropdown.evjs[23] = 1642688212;
        mo$MultiDropdown.evjs[24] = 935587837;
        mo$MultiDropdown.evjs[25] = -904710403;
        mo$MultiDropdown.evjs[26] = 863855448;
        mo$MultiDropdown.evjs[27] = -1602893599;
        mo$MultiDropdown.evjs[28] = -1608988604;
        mo$MultiDropdown.evjs[29] = 1367491476;
        mo$MultiDropdown.evjs[30] = 1402747314;
        mo$MultiDropdown.evjs[31] = 732018205;
        mo$MultiDropdown.evjs[32] = 1884747734;
        mo$MultiDropdown.evjs[33] = -1650645520;
        mo$MultiDropdown.evjs[34] = 177907746;
        mo$MultiDropdown.evjs[35] = 2081216950;
        mo$MultiDropdown.evjs[36] = -401596404;
        mo$MultiDropdown.evjs[37] = 1412014169;
        mo$MultiDropdown.evjs[38] = -1190069281;
        mo$MultiDropdown.evjs[39] = 216702750;
        mo$MultiDropdown.evjs[40] = -596157588;
        mo$MultiDropdown.evjs[41] = 1969738954;
        mo$MultiDropdown.evjs[42] = -1624325658;
        mo$MultiDropdown.evjs[43] = -279498061;
        mo$MultiDropdown.evjs[44] = 1423156269;
        mo$MultiDropdown.evjs[45] = -268619122;
        mo$MultiDropdown.evjs[46] = 1612220963;
        mo$MultiDropdown.evjs[47] = -401059125;
        mo$MultiDropdown.evjs[48] = 1345523974;
        mo$MultiDropdown.evjs[49] = -1346030361;
        mo$MultiDropdown.evjs[50] = -556381009;
        mo$MultiDropdown.evjs[51] = -414750393;
        mo$MultiDropdown.evjs[52] = 278119869;
        mo$MultiDropdown.evjs[53] = -851729803;
        mo$MultiDropdown.evjs[54] = 942821017;
        mo$MultiDropdown.evjs[55] = -1776377277;
        mo$MultiDropdown.evjs[56] = -1769510483;
        mo$MultiDropdown.evjs[57] = -1514518355;
        mo$MultiDropdown.evjs[58] = -595899519;
        mo$MultiDropdown.evjs[59] = -6612218;
        mo$MultiDropdown.evjs[60] = 1391630404;
        mo$MultiDropdown.evjs[61] = -1818968933;
        mo$MultiDropdown.evjs[62] = 734648483;
        mo$MultiDropdown.evjs[63] = -614111654;
        mo$MultiDropdown.evjs[64] = 223055605;
        mo$MultiDropdown.evjs[65] = -2055598039;
        mo$MultiDropdown.evjs[66] = 686208916;
        mo$MultiDropdown.evjs[67] = -1805155403;
        mo$MultiDropdown.evjs[68] = 1772826290;
        mo$MultiDropdown.evjs[69] = -382178129;
        mo$MultiDropdown.evjs[70] = -1591599580;
        mo$MultiDropdown.evjs[71] = 1916074685;
        mo$MultiDropdown.evjs[72] = -439715850;
        mo$MultiDropdown.evjs[73] = -796156268;
        mo$MultiDropdown.evjs[74] = 776133240;
        mo$MultiDropdown.evjs[75] = 1020220690;
        mo$MultiDropdown.evjs[76] = 2091875889;
        mo$MultiDropdown.evjs[77] = 1730390597;
        mo$MultiDropdown.evjs[78] = 1737869021;
        mo$MultiDropdown.evjs[79] = 2131671100;
        mo$MultiDropdown.evjs[80] = -1053953540;
        mo$MultiDropdown.evjs[81] = 408642363;
        mo$MultiDropdown.evjs[82] = -1497915046;
        mo$MultiDropdown.evjs[83] = -683892182;
    }

    private static /* synthetic */ void evqt() {
        mo$MultiDropdown.evkc[0] = -6009609821653947901L;
        mo$MultiDropdown.evkc[1] = 4995804033745375708L;
        mo$MultiDropdown.evkc[2] = 6387765425047119517L;
        mo$MultiDropdown.evkc[3] = 2628398112240807073L;
        mo$MultiDropdown.evkc[4] = 1175379167687813056L;
        mo$MultiDropdown.evkc[5] = -1526823007070906L;
        mo$MultiDropdown.evkc[6] = 4981175635856012572L;
        mo$MultiDropdown.evkc[7] = -6659282723400365226L;
        mo$MultiDropdown.evkc[8] = -7335689833231119473L;
        mo$MultiDropdown.evkc[9] = -7000123501101956697L;
        mo$MultiDropdown.evkc[10] = 4697412475802241898L;
        mo$MultiDropdown.evkc[11] = 4590337759010993114L;
        mo$MultiDropdown.evkc[12] = 2156581779045239229L;
        mo$MultiDropdown.evkc[13] = -8658937957113304776L;
        mo$MultiDropdown.evkc[14] = 8871048691491585563L;
        mo$MultiDropdown.evkc[15] = -5296695991571786901L;
        mo$MultiDropdown.evkc[16] = 6156554595707209898L;
        mo$MultiDropdown.evkc[17] = 7186470638772784457L;
        mo$MultiDropdown.evkc[18] = 7138838729676307695L;
        mo$MultiDropdown.evkc[19] = -7350829576797672914L;
        mo$MultiDropdown.evkc[20] = 1985189683034373445L;
        mo$MultiDropdown.evkc[21] = 8292340209152432639L;
        mo$MultiDropdown.evkc[22] = -3888764229296530661L;
        mo$MultiDropdown.evkc[23] = 4597072364756599272L;
        mo$MultiDropdown.evkc[24] = -6091779935290109080L;
        mo$MultiDropdown.evkc[25] = -6238883488648127152L;
        mo$MultiDropdown.evkc[26] = 6180983108610836099L;
        mo$MultiDropdown.evkc[27] = -1150963305228253846L;
        mo$MultiDropdown.evkc[28] = 3519479860754839197L;
        mo$MultiDropdown.evkc[29] = -1933578756925320521L;
        mo$MultiDropdown.evkc[30] = -2918374782125879216L;
        mo$MultiDropdown.evkc[31] = -5533363345149528751L;
        mo$MultiDropdown.evkc[32] = -5520860925271381936L;
        mo$MultiDropdown.evkc[33] = -7676280336574690235L;
        mo$MultiDropdown.evkc[34] = -6755597767571199562L;
        mo$MultiDropdown.evkc[35] = 2337191288759084963L;
        mo$MultiDropdown.evkc[36] = -2544783863199945435L;
        mo$MultiDropdown.evkc[37] = -8781804117571297545L;
        mo$MultiDropdown.evkc[38] = -6477913335449860952L;
        mo$MultiDropdown.evkc[39] = -19750795884303063L;
        mo$MultiDropdown.evkc[40] = -8175881017798319449L;
        mo$MultiDropdown.evkc[41] = 4701977646592541038L;
        mo$MultiDropdown.evkc[42] = 6402571142859922001L;
        mo$MultiDropdown.evkc[43] = -1992407979561972973L;
        mo$MultiDropdown.evkc[44] = 1659642069285503038L;
        mo$MultiDropdown.evkc[45] = -5318486835015360192L;
        mo$MultiDropdown.evkc[46] = 3024535016468972324L;
        mo$MultiDropdown.evkc[47] = -66188643509302480L;
        mo$MultiDropdown.evkc[48] = 1795922522707934923L;
        mo$MultiDropdown.evkc[49] = 3508939362023324695L;
        mo$MultiDropdown.evkc[50] = -5761728604909440009L;
        mo$MultiDropdown.evkc[51] = -478601028336536232L;
        mo$MultiDropdown.evkc[52] = 7469667209721697045L;
        mo$MultiDropdown.evkc[53] = -8053716418398944524L;
        mo$MultiDropdown.evkc[54] = 1123168229928509528L;
        mo$MultiDropdown.evkc[55] = -8654651727688614509L;
        mo$MultiDropdown.evkc[56] = 2096201876096379021L;
        mo$MultiDropdown.evkc[57] = 7273636672560753879L;
        mo$MultiDropdown.evkc[58] = 758535278361389945L;
        mo$MultiDropdown.evkc[59] = 9015869102136327402L;
        mo$MultiDropdown.evkc[60] = 3800564423777551041L;
        mo$MultiDropdown.evkc[61] = -4736199582617249925L;
        mo$MultiDropdown.evkc[62] = -7905332739718355509L;
        mo$MultiDropdown.evkc[63] = -2554190772578515206L;
        mo$MultiDropdown.evkc[64] = 3644672158185219567L;
        mo$MultiDropdown.evkc[65] = 1991591036914086680L;
        mo$MultiDropdown.evkc[66] = -9170838566842773329L;
        mo$MultiDropdown.evkc[67] = -7406918860596378227L;
        mo$MultiDropdown.evkc[68] = 319879836071558538L;
        mo$MultiDropdown.evkc[69] = 4953354832830965786L;
        mo$MultiDropdown.evkc[70] = 7937742395292922543L;
        mo$MultiDropdown.evkc[71] = -138465932152734950L;
        mo$MultiDropdown.evkc[72] = -2248787286090346481L;
        mo$MultiDropdown.evkc[73] = -8876868207798044105L;
        mo$MultiDropdown.evkc[74] = -1327094951401948030L;
        mo$MultiDropdown.evkc[75] = -6288846004080651873L;
        mo$MultiDropdown.evkc[76] = 1053357238931799570L;
        mo$MultiDropdown.evkc[77] = -6103853131301206363L;
        mo$MultiDropdown.evkc[78] = 4387213888143895648L;
        mo$MultiDropdown.evkc[79] = 3998755218813180669L;
        mo$MultiDropdown.evkc[80] = 8934028843593581827L;
        mo$MultiDropdown.evkc[81] = 881158365345963550L;
        mo$MultiDropdown.evkc[82] = 2390341976279148338L;
        mo$MultiDropdown.evkc[83] = 8023917014312668470L;
        mo$MultiDropdown.evkc[84] = -2008444854851943725L;
        mo$MultiDropdown.evkc[85] = -7087963953197232113L;
        mo$MultiDropdown.evkc[86] = 8381848879150120768L;
        mo$MultiDropdown.evkc[87] = 5214760297625473474L;
        mo$MultiDropdown.evkc[88] = 4186684320163896117L;
        mo$MultiDropdown.evkc[89] = 6402030929280136809L;
    }

    private static /* synthetic */ int evjq(int n2) {
        return evjr[n2] ^ evjs[n2];
    }

    static {
        evjr = new int[84];
        evjs = new int[84];
        mo$MultiDropdown.evqq();
        mo$MultiDropdown.evqr();
        evkb = new long[90];
        evkc = new long[90];
        mo$MultiDropdown.evqs();
        mo$MultiDropdown.evqt();
    }

    private static /* synthetic */ void evqs() {
        mo$MultiDropdown.evkb[0] = 2120626671265304523L;
        mo$MultiDropdown.evkb[1] = -8506788124576091915L;
        mo$MultiDropdown.evkb[2] = 4725950743080513590L;
        mo$MultiDropdown.evkb[3] = 3589361096350558554L;
        mo$MultiDropdown.evkb[4] = -1278442844076811534L;
        mo$MultiDropdown.evkb[5] = 7869385997712958872L;
        mo$MultiDropdown.evkb[6] = -5190328800186061789L;
        mo$MultiDropdown.evkb[7] = -4530856400239896720L;
        mo$MultiDropdown.evkb[8] = 7063522217062890251L;
        mo$MultiDropdown.evkb[9] = -8354442628523277641L;
        mo$MultiDropdown.evkb[10] = 7902604900208031578L;
        mo$MultiDropdown.evkb[11] = -3879417392049845224L;
        mo$MultiDropdown.evkb[12] = -2634574673310377415L;
        mo$MultiDropdown.evkb[13] = 1115858392057086750L;
        mo$MultiDropdown.evkb[14] = -1997830346017069265L;
        mo$MultiDropdown.evkb[15] = 9067951709388080771L;
        mo$MultiDropdown.evkb[16] = -1610142110979194364L;
        mo$MultiDropdown.evkb[17] = -3191889197813064975L;
        mo$MultiDropdown.evkb[18] = -6020016405135686371L;
        mo$MultiDropdown.evkb[19] = -7832451731158472437L;
        mo$MultiDropdown.evkb[20] = -5412774295454913288L;
        mo$MultiDropdown.evkb[21] = 4450155771198605626L;
        mo$MultiDropdown.evkb[22] = -8104466808261086668L;
        mo$MultiDropdown.evkb[23] = 4727978575110572203L;
        mo$MultiDropdown.evkb[24] = 6609420525738594296L;
        mo$MultiDropdown.evkb[25] = 2273814190441739270L;
        mo$MultiDropdown.evkb[26] = 5255801356848828878L;
        mo$MultiDropdown.evkb[27] = 8701246776788516787L;
        mo$MultiDropdown.evkb[28] = 1843507728348248736L;
        mo$MultiDropdown.evkb[29] = 5110930224520401980L;
        mo$MultiDropdown.evkb[30] = 2515039889184673456L;
        mo$MultiDropdown.evkb[31] = 9197154390141487704L;
        mo$MultiDropdown.evkb[32] = -6798164842033680636L;
        mo$MultiDropdown.evkb[33] = 4326337505680985077L;
        mo$MultiDropdown.evkb[34] = -234390152553096150L;
        mo$MultiDropdown.evkb[35] = -7401508229565754448L;
        mo$MultiDropdown.evkb[36] = -6788464395876231345L;
        mo$MultiDropdown.evkb[37] = 8109803675617589177L;
        mo$MultiDropdown.evkb[38] = -6795447750361687058L;
        mo$MultiDropdown.evkb[39] = 5686827139953929686L;
        mo$MultiDropdown.evkb[40] = -9148579592085732902L;
        mo$MultiDropdown.evkb[41] = 368697924249495186L;
        mo$MultiDropdown.evkb[42] = -6122183090524060956L;
        mo$MultiDropdown.evkb[43] = -4719680779781131741L;
        mo$MultiDropdown.evkb[44] = 5081328757966534258L;
        mo$MultiDropdown.evkb[45] = 812088636341629426L;
        mo$MultiDropdown.evkb[46] = 5190044726609924097L;
        mo$MultiDropdown.evkb[47] = 1687776628227975279L;
        mo$MultiDropdown.evkb[48] = 5644404054140891014L;
        mo$MultiDropdown.evkb[49] = 2117528897565860037L;
        mo$MultiDropdown.evkb[50] = 7978813965160393669L;
        mo$MultiDropdown.evkb[51] = -5287743298308808300L;
        mo$MultiDropdown.evkb[52] = -2305548336005166926L;
        mo$MultiDropdown.evkb[53] = 1554444746258424090L;
        mo$MultiDropdown.evkb[54] = -2942802874199876250L;
        mo$MultiDropdown.evkb[55] = -3828668258363252743L;
        mo$MultiDropdown.evkb[56] = 2728546299631501055L;
        mo$MultiDropdown.evkb[57] = 8966230764083237943L;
        mo$MultiDropdown.evkb[58] = -38454086331242355L;
        mo$MultiDropdown.evkb[59] = -4946460458297579578L;
        mo$MultiDropdown.evkb[60] = -1492425152095401815L;
        mo$MultiDropdown.evkb[61] = 5299065764598334734L;
        mo$MultiDropdown.evkb[62] = 3693571816985470322L;
        mo$MultiDropdown.evkb[63] = -2913739185828977925L;
        mo$MultiDropdown.evkb[64] = -6553277166229477179L;
        mo$MultiDropdown.evkb[65] = 4042484893185552874L;
        mo$MultiDropdown.evkb[66] = -287384229473566576L;
        mo$MultiDropdown.evkb[67] = -4809171089606290514L;
        mo$MultiDropdown.evkb[68] = -2345630555397914444L;
        mo$MultiDropdown.evkb[69] = 4855111865342789302L;
        mo$MultiDropdown.evkb[70] = 6117869042325996137L;
        mo$MultiDropdown.evkb[71] = 5848978295566347529L;
        mo$MultiDropdown.evkb[72] = -4931688004695029889L;
        mo$MultiDropdown.evkb[73] = 3783173209396518643L;
        mo$MultiDropdown.evkb[74] = 1506832063995413124L;
        mo$MultiDropdown.evkb[75] = 7246720662664164188L;
        mo$MultiDropdown.evkb[76] = -3240898799497735593L;
        mo$MultiDropdown.evkb[77] = -4695236008166668277L;
        mo$MultiDropdown.evkb[78] = 7380595493119409001L;
        mo$MultiDropdown.evkb[79] = -4937345429577102721L;
        mo$MultiDropdown.evkb[80] = -755210104079108764L;
        mo$MultiDropdown.evkb[81] = -7640743900798436373L;
        mo$MultiDropdown.evkb[82] = -8285683069764514485L;
        mo$MultiDropdown.evkb[83] = -3861623508566509568L;
        mo$MultiDropdown.evkb[84] = 1306536927247560821L;
        mo$MultiDropdown.evkb[85] = 3204077383965825114L;
        mo$MultiDropdown.evkb[86] = -4491655738310291449L;
        mo$MultiDropdown.evkb[87] = -4960575387832302292L;
        mo$MultiDropdown.evkb[88] = 5677537754828483528L;
        mo$MultiDropdown.evkb[89] = 89192223877484042L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final String toString() {
        Object object = lh;
        block15: while (true) {
            switch ((int)object) {
                case 466970617: {
                    object = mo$MultiDropdown.evjt("evke", evka(int ), (int)1) - mo$MultiDropdown.evjt("evkd", evka(int ), (int)0);
                    continue block15;
                }
                case 1293129314: {
                    break block15;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = lh;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - mo$MultiDropdown.evjt("evkf", evka(int ), (int)2);
            }
            switch ((int)object2) {
                case -1140496914: {
                    callSite = mo$MultiDropdown.evjt("evkg", evka(int ), (int)3);
                    continue block16;
                }
                case 558705702: {
                    callSite = mo$MultiDropdown.evjt("evkh", evka(int ), (int)4);
                    continue block16;
                }
                case 1293129314: {
                    break block16;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = lh;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - mo$MultiDropdown.evjt("evki", evka(int ), (int)5);
            }
            switch ((int)object3) {
                case -1260454704: {
                    callSite = mo$MultiDropdown.evjt("evkj", evka(int ), (int)6);
                    continue block17;
                }
                case 1060512822: {
                    callSite = mo$MultiDropdown.evjt("evkk", evka(int ), (int)7);
                    continue block17;
                }
                case 1293129314: {
                    break block17;
                }
                case 1711923691: {
                    callSite = mo$MultiDropdown.evjt("evkl", evka(int ), (int)8);
                    continue block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl2) {
            throw null;
        }
        if (bl5) return null;
        if (bl5) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = lh - mo$MultiDropdown.evjt("evkm", evka(int ), (int)9)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == mo$MultiDropdown.evjt("evkn", evjq(int ), (int)6)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$MultiDropdown.class, "setting;previewX;previewY;width;cardX;open;interactive", "setting", "previewX", "previewY", "width", "cardX", "open", "interactive"}, this);
            }
            object4 = mo$MultiDropdown.evjt("evko", evjq(int ), (int)7);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float previewY() {
        Object object = lh;
        boolean bl2 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - mo$MultiDropdown.evjt("evnm", evka(int ), (int)45);
            }
            switch ((int)object) {
                case -1949222906: {
                    callSite = mo$MultiDropdown.evjt("evnn", evka(int ), (int)46);
                    continue block20;
                }
                case 1293129314: {
                    break block20;
                }
                case 1931936346: {
                    callSite = mo$MultiDropdown.evjt("evno", evka(int ), (int)47);
                    continue block20;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = lh;
        boolean bl4 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - mo$MultiDropdown.evjt("evnp", evka(int ), (int)48);
            }
            switch ((int)object2) {
                case -207160095: {
                    callSite = mo$MultiDropdown.evjt("evnq", evka(int ), (int)49);
                    continue block21;
                }
                case 1293129314: {
                    break block21;
                }
                case 1571968904: {
                    callSite = mo$MultiDropdown.evjt("evnr", evka(int ), (int)50);
                    continue block21;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = lh;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - mo$MultiDropdown.evjt("evns", evka(int ), (int)51);
            }
            switch ((int)object3) {
                case -1456790449: {
                    callSite = mo$MultiDropdown.evjt("evnt", evka(int ), (int)52);
                    continue block22;
                }
                case -755099269: {
                    callSite = mo$MultiDropdown.evjt("evnu", evka(int ), (int)53);
                    continue block22;
                }
                case 1293129314: {
                    break block22;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return (float)mo$MultiDropdown.evjt("evnv", evnc(int ), (int)47);
        if (bl6) return (float)mo$MultiDropdown.evjt("evnv", evnc(int ), (int)47);
        Object object4 = lh;
        boolean bl7 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object4 = callSite - mo$MultiDropdown.evjt("evnw", evka(int ), (int)54);
            }
            switch ((int)object4) {
                case -693174413: {
                    callSite = mo$MultiDropdown.evjt("evnx", evka(int ), (int)55);
                    continue block23;
                }
                case 429030655: {
                    callSite = mo$MultiDropdown.evjt("evny", evka(int ), (int)56);
                    continue block23;
                }
                case 1293129314: {
                    return this.previewY;
                }
            }
            break;
        }
        return this.previewY;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float cardX() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evos", evka(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$MultiDropdown.evjt("evot", evjq(int ), (int)61)) break;
            v0 /* !! */  = (long)mo$MultiDropdown.evjt("evou", evjq(int ), (int)62);
        }
        var3_1 = mo$MultiDropdown.c;
        v1 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(mo$MultiDropdown.evjt("evow", evka(int ), (int)65) - mo$MultiDropdown.evjt("evov", evka(int ), (int)64));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1293129314: {
                    break block21;
                }
                case 1965894434: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$MultiDropdown.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = mo$MultiDropdown.lh;
                if (true) ** GOTO lbl25
                block22: while (true) {
                    v2 /* !! */  = (long)(mo$MultiDropdown.evjt("evoy", evka(int ), (int)67) - mo$MultiDropdown.evjt("evox", evka(int ), (int)66));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1738770510: {
                            continue block22;
                        }
                        case 1293129314: {
                            break block22;
                        }
                    }
                    break;
                }
                var1_3 = mo$MultiDropdown.a;
                if (var3_1) {
                    throw null;
                    return (float)mo$MultiDropdown.evjt("evoz", evnc(int ), (int)63);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = mo$MultiDropdown.lh;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - mo$MultiDropdown.evjt("evpa", evka(int ), (int)68));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1486591924: {
                            v4 = mo$MultiDropdown.evjt("evpb", evka(int ), (int)69);
                            continue block24;
                        }
                        case -1475288749: {
                            v4 = mo$MultiDropdown.evjt("evpc", evka(int ), (int)70);
                            continue block24;
                        }
                        case -1379633981: {
                            v4 = mo$MultiDropdown.evjt("evpd", evka(int ), (int)71);
                            continue block24;
                        }
                        case 1293129314: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.cardX;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpe", evjq(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpf", evjq(int ), (int)65);
                if (!var3_1) break;
                throw null;
            }
lbl62:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpg", evjq(int ), (int)66);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evph", evjq(int ), (int)67);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiDropdown.evjt("evlk", evka(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1662361968: {
                    v1 = mo$MultiDropdown.evjt("evll", evka(int ), (int)21);
                    continue block12;
                }
                case 834955909: {
                    v1 = mo$MultiDropdown.evjt("evlm", evka(int ), (int)22);
                    continue block12;
                }
                case 1059630737: {
                    v1 = mo$MultiDropdown.evjt("evln", evka(int ), (int)23);
                    continue block12;
                }
                case 1293129314: {
                    break block12;
                }
            }
            break;
        }
        var4_2 = mo$MultiDropdown.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evlo", evka(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiDropdown.evjt("evlp", evjq(int ), (int)19)) break;
            v2 /* !! */  = (long)mo$MultiDropdown.evjt("evlq", evjq(int ), (int)20);
        }
        var3_3 /* !! */  = mo$MultiDropdown.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evlr", evka(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$MultiDropdown.evjt("evls", evjq(int ), (int)21)) break;
            v3 /* !! */  = (long)mo$MultiDropdown.evjt("evlt", evjq(int ), (int)22);
        }
        var2_4 = mo$MultiDropdown.a;
        if (var4_2) {
            throw null;
            return (boolean)mo$MultiDropdown.evjt("evlu", evjq(int ), (int)23);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evlv", evka(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$MultiDropdown.evjt("evlw", evjq(int ), (int)24)) break;
                    v4 /* !! */  = (long)mo$MultiDropdown.evjt("evlx", evjq(int ), (int)25);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$MultiDropdown.class, "setting;previewX;previewY;width;cardX;open;interactive", "setting", "previewX", "previewY", "width", "cardX", "open", "interactive"}, this, var1_1);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mo$MultiDropdown.evjt("evly", evjq(int ), (int)26);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl57
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)mo$MultiDropdown.evjt("evlz", evjq(int ), (int)27);
                if (var4_2) {
                    throw null;
                }
            }
lbl57:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)mo$MultiDropdown.evjt("evma", evjq(int ), (int)28);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)mo$MultiDropdown.evjt("evmb", evjq(int ), (int)29);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float open() {
        v0 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiDropdown.evjt("evpi", evka(int ), (int)72));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1750937717: {
                    v1 = mo$MultiDropdown.evjt("evpj", evka(int ), (int)73);
                    continue block21;
                }
                case -1719497117: {
                    v1 = mo$MultiDropdown.evjt("evpk", evka(int ), (int)74);
                    continue block21;
                }
                case 1293129314: {
                    break block21;
                }
                case 1465754189: {
                    v1 = mo$MultiDropdown.evjt("evpl", evka(int ), (int)75);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = mo$MultiDropdown.c;
        v2 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - mo$MultiDropdown.evjt("evpm", evka(int ), (int)76));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1450046654: {
                    v3 = mo$MultiDropdown.evjt("evpn", evka(int ), (int)77);
                    continue block22;
                }
                case 1293129314: {
                    break block22;
                }
                case 1805488276: {
                    v3 = mo$MultiDropdown.evjt("evpo", evka(int ), (int)78);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$MultiDropdown.b;
        v4 /* !! */  = mo$MultiDropdown.lh;
        if (true) ** GOTO lbl36
        block23: while (true) {
            v4 /* !! */  = (long)(mo$MultiDropdown.evjt("evpq", evka(int ), (int)80) - mo$MultiDropdown.evjt("evpp", evka(int ), (int)79));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -131184815: {
                    continue block23;
                }
                case 1293129314: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = mo$MultiDropdown.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (float)mo$MultiDropdown.evjt("evpr", evnc(int ), (int)68);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mo$MultiDropdown.lh - mo$MultiDropdown.evjt("evps", evka(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$MultiDropdown.evjt("evpt", evjq(int ), (int)69)) break;
                    v5 /* !! */  = (long)mo$MultiDropdown.evjt("evpu", evjq(int ), (int)70);
                }
                return this.open;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpv", evjq(int ), (int)71);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpw", evjq(int ), (int)72);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpx", evjq(int ), (int)73);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$MultiDropdown.evjt("evpy", evjq(int ), (int)74);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float evnc(int n2) {
        return Float.intBitsToFloat(evjr[n2] ^ evjs[n2]);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ke setting() {
        boolean bl2;
        Object object = lh;
        boolean bl3 = true;
        block6: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - mo$MultiDropdown.evjt("evmc", evka(int ), (int)27);
            }
            switch ((int)object) {
                case -1291788643: {
                    callSite = mo$MultiDropdown.evjt("evmd", evka(int ), (int)28);
                    continue block6;
                }
                case -816931605: {
                    callSite = mo$MultiDropdown.evjt("evme", evka(int ), (int)29);
                    continue block6;
                }
                case -440398741: {
                    callSite = mo$MultiDropdown.evjt("evmf", evka(int ), (int)30);
                    continue block6;
                }
                case 1293129314: {
                    break block6;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = lh - mo$MultiDropdown.evjt("evmg", evka(int ), (int)31)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$MultiDropdown.evjt("evmh", evjq(int ), (int)30)) break;
            object2 = mo$MultiDropdown.evjt("evmi", evjq(int ), (int)31);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = lh - mo$MultiDropdown.evjt("evmj", evka(int ), (int)32)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == mo$MultiDropdown.evjt("evmk", evjq(int ), (int)32)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = mo$MultiDropdown.evjt("evml", evjq(int ), (int)33);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = lh - mo$MultiDropdown.evjt("evmm", evka(int ), (int)33)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == mo$MultiDropdown.evjt("evmn", evjq(int ), (int)34)) {
                return this.setting;
            }
            object4 = mo$MultiDropdown.evjt("evmo", evjq(int ), (int)35);
        }
    }
}

