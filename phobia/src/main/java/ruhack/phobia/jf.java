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
import ruhack.phobia.kg;
import ruhack.phobia.nj;

public class jf
extends ds {
    private static final long bv = -5276362186958933297L;
    private static long[] agay;
    private static int[] agam;
    public static final int b;
    private static int[] agal;
    private final kg brightness;
    public static final boolean a;
    public static final boolean c;
    private static long[] agaz;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getBrightness() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jf.bv - jf.agan("agbr", agax(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jf.agan("agbs", agar(int ), (int)16)) break;
            v0 /* !! */  = (long)jf.agan("agbt", agar(int ), (int)17);
        }
        var3_1 = jf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jf.bv - jf.agan("agbu", agax(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jf.agan("agbv", agar(int ), (int)18)) break;
            v1 /* !! */  = (long)jf.agan("agbw", agar(int ), (int)19);
        }
        var2_2 /* !! */  = jf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jf.bv - jf.agan("agbx", agax(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jf.agan("agby", agar(int ), (int)20)) break;
            v2 /* !! */  = (long)jf.agan("agbz", agar(int ), (int)21);
        }
        var1_3 = jf.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (double)jf.agan("agcb", agca(int ), (int)12);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = jf.bv;
                if (true) ** GOTO lbl34
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - jf.agan("agcc", agax(int ), (int)13));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1924664512: {
                            v4 = jf.agan("agcd", agax(int ), (int)14);
                            continue block19;
                        }
                        case -603819313: {
                            break block19;
                        }
                        case 595104323: {
                            v4 = jf.agan("agce", agax(int ), (int)15);
                            continue block19;
                        }
                    }
                    break;
                }
                v5 /* !! */  = jf.bv;
                if (true) ** GOTO lbl47
                block20: while (true) {
                    v5 /* !! */  = (long)(jf.agan("agcg", agax(int ), (int)17) - jf.agan("agcf", agax(int ), (int)16));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -603819313: {
                            break block20;
                        }
                        case 1603849548: {
                            continue block20;
                        }
                    }
                    break;
                }
                return this.brightness.getValue();
            }
lbl53:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)jf.agan("agch", agar(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: {
                var2_2 /* !! */  = (int)jf.agan("agci", agar(int ), (int)23);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
lbl62:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jf.agan("agcj", agar(int ), (int)24);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jf.agan("agck", agar(int ), (int)25);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float agak(int n2) {
        return Float.intBitsToFloat(agal[n2] ^ agam[n2]);
    }

    private static /* synthetic */ void agcm() {
        jf.agam[0] = -2003871519;
        jf.agam[1] = -1630245221;
        jf.agam[2] = -1347706674;
        jf.agam[3] = -551625028;
        jf.agam[4] = 2034462311;
        jf.agam[5] = -1162330031;
        jf.agam[6] = 1279630992;
        jf.agam[7] = 258911157;
        jf.agam[8] = 1687045676;
        jf.agam[9] = 1048861347;
        jf.agam[10] = 460036127;
        jf.agam[11] = -633294717;
        jf.agam[12] = 2051815874;
        jf.agam[13] = -1517196257;
        jf.agam[14] = 1121788609;
        jf.agam[15] = -79449748;
        jf.agam[16] = 509250990;
        jf.agam[17] = 1549005981;
        jf.agam[18] = 536052775;
        jf.agam[19] = -1165637241;
        jf.agam[20] = -794226441;
        jf.agam[21] = -1989588631;
        jf.agam[22] = -1375371481;
        jf.agam[23] = -838761228;
        jf.agam[24] = -240388123;
        jf.agam[25] = -966890785;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jf getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jf.bv - jf.agan("agba", agax(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jf.agan("agbb", agar(int ), (int)8)) break;
            v0 /* !! */  = (long)jf.agan("agbc", agar(int ), (int)9);
        }
        var2 = jf.c;
        v1 /* !! */  = jf.bv;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - jf.agan("agbd", agax(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1227669321: {
                    v2 = jf.agan("agbe", agax(int ), (int)2);
                    continue block18;
                }
                case -603819313: {
                    break block18;
                }
                case -171354441: {
                    v2 = jf.agan("agbf", agax(int ), (int)3);
                    continue block18;
                }
            }
            break;
        }
        var1_1 /* !! */  = jf.b;
        v3 /* !! */  = jf.bv;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - jf.agan("agbg", agax(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1515524443: {
                    v4 = jf.agan("agbh", agax(int ), (int)5);
                    continue block19;
                }
                case -603819313: {
                    break block19;
                }
                case -20045280: {
                    v4 = jf.agan("agbi", agax(int ), (int)6);
                    continue block19;
                }
                case 391484707: {
                    v4 = jf.agan("agbj", agax(int ), (int)7);
                    continue block19;
                }
            }
            break;
        }
        var0_2 = jf.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jf.bv - jf.agan("agbk", agax(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jf.agan("agbl", agar(int ), (int)10)) break;
                    v5 /* !! */  = (long)jf.agan("agbm", agar(int ), (int)11);
                }
                return nj.get(jf.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)jf.agan("agbn", agar(int ), (int)12);
                if (var2) {
                    throw null;
                }
            }
lbl58:
            // 4 sources

            case 1: {
                var1_1 /* !! */  = (int)jf.agan("agbo", agar(int ), (int)13);
                if (var2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jf.agan("agbp", agar(int ), (int)14);
                    if (!var2) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jf.agan("agbq", agar(int ), (int)15);
        ** while (!var2)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jf() {
        var2_1 /* !! */  = jf.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("FullBright", "\u041e\u0441\u0432\u0435\u0449\u0430\u0435\u0442 \u0442\u0451\u043c\u043d\u044b\u0435 \u0443\u0447\u0430\u0441\u0442\u043a\u0438 \u043c\u0438\u0440\u0430 \u0441 \u043d\u0430\u0441\u0442\u0440\u0430\u0438\u0432\u0430\u0435\u043c\u043e\u0439 \u044f\u0440\u043a\u043e\u0441\u0442\u044c\u044e", du.RENDER);
                this.brightness = new kg("\u042f\u0440\u043a\u043e\u0441\u0442\u044c", "\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u043e\u0441\u0432\u0435\u0449\u0435\u043d\u0438\u044f \u043c\u0438\u0440\u0430", (float)jf.agan("agao", agak(int ), (int)0)).range(1.0f, (float)jf.agan("agap", agak(int ), (int)1)).step((float)jf.agan("agaq", agak(int ), (int)2));
                this.settings(new jx[]{this.brightness});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)jf.agan("agas", agar(int ), (int)3);
                ** GOTO lbl18
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)jf.agan("agat", agar(int ), (int)4);
                }
            }
lbl16:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)jf.agan("agau", agar(int ), (int)5);
            }
lbl18:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)jf.agan("agav", agar(int ), (int)6);
                ** GOTO lbl16
            }
            case 4: 
        }
        while (true) {
            var2_1 /* !! */  = (int)jf.agan("agaw", agar(int ), (int)7);
        }
    }

    private static /* synthetic */ int agar(int n2) {
        return agal[n2] ^ agam[n2];
    }

    private static /* synthetic */ double agca(int n2) {
        return Double.longBitsToDouble(agay[n2] ^ agaz[n2]);
    }

    private static /* synthetic */ void agco() {
        jf.agaz[0] = 7145507415528059384L;
        jf.agaz[1] = 1262449595704573037L;
        jf.agaz[2] = 1306570870104739023L;
        jf.agaz[3] = 8190459088654067863L;
        jf.agaz[4] = -4280014908277848099L;
        jf.agaz[5] = 1572541867087600147L;
        jf.agaz[6] = 2509444284380297994L;
        jf.agaz[7] = 4812848128467853331L;
        jf.agaz[8] = 5525949582392054964L;
        jf.agaz[9] = -3872565472251313291L;
        jf.agaz[10] = -1709759557080553970L;
        jf.agaz[11] = -1657056304507672846L;
        jf.agaz[12] = 8435373593104253851L;
        jf.agaz[13] = -5141065787029847636L;
        jf.agaz[14] = -1972537200050458882L;
        jf.agaz[15] = -8399430490901159793L;
        jf.agaz[16] = -3134652132048222004L;
        jf.agaz[17] = -2680627164965189626L;
    }

    private static /* synthetic */ void agcn() {
        jf.agay[0] = 4341562215792892519L;
        jf.agay[1] = 7301464235740071953L;
        jf.agay[2] = 6235210644059519862L;
        jf.agay[3] = 5410019650227427019L;
        jf.agay[4] = 8064850964326447588L;
        jf.agay[5] = -4462312635291087904L;
        jf.agay[6] = 6192277134756795226L;
        jf.agay[7] = 6834766359656098127L;
        jf.agay[8] = -1434816297955270310L;
        jf.agay[9] = -2012608657639659305L;
        jf.agay[10] = 4063392152316232019L;
        jf.agay[11] = 4786289028191036004L;
        jf.agay[12] = 5393616747095993175L;
        jf.agay[13] = 6623410609203652592L;
        jf.agay[14] = 1499590178891766636L;
        jf.agay[15] = -1149425583102777783L;
        jf.agay[16] = 4820354827635500024L;
        jf.agay[17] = -9088492066076557131L;
    }

    private static /* synthetic */ long agax(int n2) {
        return agay[n2] ^ agaz[n2];
    }

    private static /* synthetic */ void agcl() {
        jf.agal[0] = -911255327;
        jf.agal[1] = -537629029;
        jf.agal[2] = -1838715901;
        jf.agal[3] = -551625028;
        jf.agal[4] = 2034462309;
        jf.agal[5] = -1162330030;
        jf.agal[6] = 1279630992;
        jf.agal[7] = 258911158;
        jf.agal[8] = -1687045677;
        jf.agal[9] = -884140597;
        jf.agal[10] = 460036126;
        jf.agal[11] = -154316476;
        jf.agal[12] = 2051815875;
        jf.agal[13] = -1517196260;
        jf.agal[14] = 1121788610;
        jf.agal[15] = -79449745;
        jf.agal[16] = -509250991;
        jf.agal[17] = -1772576318;
        jf.agal[18] = -536052776;
        jf.agal[19] = -771671697;
        jf.agal[20] = -794226442;
        jf.agal[21] = 1877572706;
        jf.agal[22] = -1375371484;
        jf.agal[23] = -838761225;
        jf.agal[24] = -240388123;
        jf.agal[25] = -966890785;
    }

    static {
        agal = new int[26];
        agam = new int[26];
        jf.agcl();
        jf.agcm();
        agay = new long[18];
        agaz = new long[18];
        jf.agcn();
        jf.agco();
    }

    public static /* synthetic */ CallSite agan(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

