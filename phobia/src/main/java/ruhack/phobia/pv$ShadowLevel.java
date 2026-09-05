/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ruhack.phobia.system.screensystem.clickgui.ClickGuiTheme
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.system.screensystem.clickgui.ClickGuiTheme;

public final class pv$ShadowLevel
extends Enum<pv$ShadowLevel> {
    private final int steps;
    public static final boolean a;
    private static final /* synthetic */ pv$ShadowLevel[] $VALUES;
    private final int color;
    private static int[] kfno;
    public static final /* enum */ pv$ShadowLevel CARD;
    public static final /* enum */ pv$ShadowLevel FLOATING;
    private static long[] kfni;
    public static final boolean c;
    private final float spreadPx;
    public static final int b;
    private static long[] kfnh;
    public static final /* enum */ pv$ShadowLevel WINDOW;
    private static int[] kfnn;
    private final float offsetYPx;
    static final long sh = -5677737812485244283L;

    private static /* synthetic */ float kfqu(int n2) {
        return Float.intBitsToFloat(kfnn[n2] ^ kfno[n2]);
    }

    static {
        kfnn = new int[50];
        kfno = new int[50];
        pv$ShadowLevel.kfrj();
        pv$ShadowLevel.kfrl();
        kfnh = new long[27];
        kfni = new long[27];
        pv$ShadowLevel.kfrm();
        pv$ShadowLevel.kfro();
        WINDOW = new pv$ShadowLevel((float)pv$ShadowLevel.kfnj("kfqw", kfqu(int ), (int)40), (float)pv$ShadowLevel.kfnj("kfqy", kfqu(int ), (int)41), (int)pv$ShadowLevel.kfnj("kfqz", kfnm(int ), (int)42), ClickGuiTheme.SHADOW_WINDOW);
        FLOATING = new pv$ShadowLevel((float)pv$ShadowLevel.kfnj("kfrb", kfqu(int ), (int)44), (float)pv$ShadowLevel.kfnj("kfrc", kfqu(int ), (int)45), (int)pv$ShadowLevel.kfnj("kfrd", kfnm(int ), (int)46), ClickGuiTheme.SHADOW_FLOATING);
        CARD = new pv$ShadowLevel((float)pv$ShadowLevel.kfnj("kfrg", kfqu(int ), (int)48), 2.0f, (int)pv$ShadowLevel.kfnj("kfrh", kfnm(int ), (int)49), ClickGuiTheme.SHADOW_CARD);
        $VALUES = pv$ShadowLevel.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pv$ShadowLevel valueOf(String var0) {
        v0 /* !! */  = pv$ShadowLevel.sh;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - pv$ShadowLevel.kfnj("kfoo", kfng(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1627161979: {
                    break block16;
                }
                case -456214163: {
                    v1 = pv$ShadowLevel.kfnj("kfop", kfng(int ), (int)9);
                    continue block16;
                }
                case 467322398: {
                    v1 = pv$ShadowLevel.kfnj("kfoq", kfng(int ), (int)10);
                    continue block16;
                }
                case 1501390872: {
                    v1 = pv$ShadowLevel.kfnj("kfor", kfng(int ), (int)11);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = pv$ShadowLevel.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfot", kfng(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pv$ShadowLevel.kfnj("kfou", kfnm(int ), (int)12)) break;
            v2 /* !! */  = (long)pv$ShadowLevel.kfnj("kfov", kfnm(int ), (int)13);
        }
        var2_2 /* !! */  = pv$ShadowLevel.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = pv$ShadowLevel.sh;
                if (true) ** GOTO lbl32
                block18: while (true) {
                    v3 /* !! */  = (long)(pv$ShadowLevel.kfnj("kfoy", kfng(int ), (int)14) - pv$ShadowLevel.kfnj("kfow", kfng(int ), (int)13));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1627161979: {
                            break block18;
                        }
                        case -287310317: {
                            continue block18;
                        }
                    }
                    break;
                }
                var1_3 = pv$ShadowLevel.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfoz", kfng(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pv$ShadowLevel.kfnj("kfpa", kfnm(int ), (int)14)) break;
                    v4 /* !! */  = (long)pv$ShadowLevel.kfnj("kfpc", kfnm(int ), (int)15);
                }
                return Enum.valueOf(pv$ShadowLevel.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpd", kfnm(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpe", kfnm(int ), (int)17);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpf", kfnm(int ), (int)18);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pv$ShadowLevel.kfnj("kfph", kfnm(int ), (int)19);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long kfng(int n2) {
        return kfnh[n2] ^ kfni[n2];
    }

    public static /* synthetic */ CallSite kfnj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pv$ShadowLevel[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfnl", kfng(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pv$ShadowLevel.kfnj("kfnp", kfnm(int ), (int)0)) break;
            v0 /* !! */  = (long)pv$ShadowLevel.kfnj("kfnr", kfnm(int ), (int)1);
        }
        var2 = pv$ShadowLevel.c;
        v1 /* !! */  = pv$ShadowLevel.sh;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - pv$ShadowLevel.kfnj("kfns", kfng(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1627161979: {
                    break block13;
                }
                case -1523933614: {
                    v2 = pv$ShadowLevel.kfnj("kfnt", kfng(int ), (int)2);
                    continue block13;
                }
                case -888553618: {
                    v2 = pv$ShadowLevel.kfnj("kfnu", kfng(int ), (int)3);
                    continue block13;
                }
                case 1368594702: {
                    v2 = pv$ShadowLevel.kfnj("kfnv", kfng(int ), (int)4);
                    continue block13;
                }
            }
            break;
        }
        var1_1 /* !! */  = pv$ShadowLevel.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfnx", kfng(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pv$ShadowLevel.kfnj("kfny", kfnm(int ), (int)2)) break;
            v3 /* !! */  = (long)pv$ShadowLevel.kfnj("kfnz", kfnm(int ), (int)3);
        }
        var0_2 = pv$ShadowLevel.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfob", kfng(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pv$ShadowLevel.kfnj("kfoc", kfnm(int ), (int)4)) break;
                    v4 /* !! */  = (long)pv$ShadowLevel.kfnj("kfod", kfnm(int ), (int)5);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfoe", kfng(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == pv$ShadowLevel.kfnj("kfog", kfnm(int ), (int)6)) break;
                    v5 /* !! */  = (long)pv$ShadowLevel.kfnj("kfoh", kfnm(int ), (int)7);
                }
                return (pv$ShadowLevel[])pv$ShadowLevel.$VALUES.clone();
            }
lbl54:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfoi", kfnm(int ), (int)8);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl64
                    break;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfoj", kfnm(int ), (int)9);
                if (!var2) ** GOTO lbl54
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfol", kfnm(int ), (int)10);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfom", kfnm(int ), (int)11);
        ** while (!var2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kfro() {
        pv$ShadowLevel.kfni[0] = -7041652332661159800L;
        pv$ShadowLevel.kfni[1] = -2596455058512514261L;
        pv$ShadowLevel.kfni[2] = -9085183248598264799L;
        pv$ShadowLevel.kfni[3] = 6560020078145849133L;
        pv$ShadowLevel.kfni[4] = 7379955228105121692L;
        pv$ShadowLevel.kfni[5] = 4419988350727644822L;
        pv$ShadowLevel.kfni[6] = -5476675249011415642L;
        pv$ShadowLevel.kfni[7] = -4489646262482334183L;
        pv$ShadowLevel.kfni[8] = 611973712826201822L;
        pv$ShadowLevel.kfni[9] = 835335103473942408L;
        pv$ShadowLevel.kfni[10] = -2954301974329839879L;
        pv$ShadowLevel.kfni[11] = -4792736138604860430L;
        pv$ShadowLevel.kfni[12] = -3716825153769784236L;
        pv$ShadowLevel.kfni[13] = -1831074087459403309L;
        pv$ShadowLevel.kfni[14] = -6447928319690664340L;
        pv$ShadowLevel.kfni[15] = -8840560393932108625L;
        pv$ShadowLevel.kfni[16] = -6853365577270078569L;
        pv$ShadowLevel.kfni[17] = 3505189971394112079L;
        pv$ShadowLevel.kfni[18] = 3841607870139838143L;
        pv$ShadowLevel.kfni[19] = 1928977041487349397L;
        pv$ShadowLevel.kfni[20] = -8000395292900249009L;
        pv$ShadowLevel.kfni[21] = -4926570980806711878L;
        pv$ShadowLevel.kfni[22] = 626119167754904534L;
        pv$ShadowLevel.kfni[23] = -227035369240089668L;
        pv$ShadowLevel.kfni[24] = -7461146059409959202L;
        pv$ShadowLevel.kfni[25] = 5858773494309199369L;
        pv$ShadowLevel.kfni[26] = 3277584230019819096L;
    }

    private static /* synthetic */ void kfrm() {
        pv$ShadowLevel.kfnh[0] = -5933563604300138713L;
        pv$ShadowLevel.kfnh[1] = -5170654309768250225L;
        pv$ShadowLevel.kfnh[2] = -7913093531363812203L;
        pv$ShadowLevel.kfnh[3] = 7312288140415005958L;
        pv$ShadowLevel.kfnh[4] = -7911135505036307630L;
        pv$ShadowLevel.kfnh[5] = 4659609714415933L;
        pv$ShadowLevel.kfnh[6] = 7459991016148465319L;
        pv$ShadowLevel.kfnh[7] = -2549491656970617290L;
        pv$ShadowLevel.kfnh[8] = -7749366494914354303L;
        pv$ShadowLevel.kfnh[9] = 8518430247184082915L;
        pv$ShadowLevel.kfnh[10] = 2030847133068886122L;
        pv$ShadowLevel.kfnh[11] = -930062040220560482L;
        pv$ShadowLevel.kfnh[12] = -5251231748377385706L;
        pv$ShadowLevel.kfnh[13] = 4696185104564653735L;
        pv$ShadowLevel.kfnh[14] = -1629586194397325787L;
        pv$ShadowLevel.kfnh[15] = -557225097943055634L;
        pv$ShadowLevel.kfnh[16] = 5833725106507696118L;
        pv$ShadowLevel.kfnh[17] = 4520700926375685511L;
        pv$ShadowLevel.kfnh[18] = 3833442317517918313L;
        pv$ShadowLevel.kfnh[19] = -5773313629901997128L;
        pv$ShadowLevel.kfnh[20] = -2960525846287811215L;
        pv$ShadowLevel.kfnh[21] = 1894320977480753700L;
        pv$ShadowLevel.kfnh[22] = 6257618862648472539L;
        pv$ShadowLevel.kfnh[23] = -5348504719613798733L;
        pv$ShadowLevel.kfnh[24] = -3500563819358959241L;
        pv$ShadowLevel.kfnh[25] = -4967442748764458848L;
        pv$ShadowLevel.kfnh[26] = 6285253441134528539L;
    }

    private static /* synthetic */ void kfrj() {
        pv$ShadowLevel.kfnn[0] = 445433742;
        pv$ShadowLevel.kfnn[1] = 413809226;
        pv$ShadowLevel.kfnn[2] = -333030519;
        pv$ShadowLevel.kfnn[3] = 968748820;
        pv$ShadowLevel.kfnn[4] = 1825613909;
        pv$ShadowLevel.kfnn[5] = -1401396719;
        pv$ShadowLevel.kfnn[6] = -939192846;
        pv$ShadowLevel.kfnn[7] = -53720164;
        pv$ShadowLevel.kfnn[8] = 1170573068;
        pv$ShadowLevel.kfnn[9] = -2112367959;
        pv$ShadowLevel.kfnn[10] = -835773320;
        pv$ShadowLevel.kfnn[11] = -921685177;
        pv$ShadowLevel.kfnn[12] = 502337039;
        pv$ShadowLevel.kfnn[13] = -952283972;
        pv$ShadowLevel.kfnn[14] = 1920154670;
        pv$ShadowLevel.kfnn[15] = -2048718972;
        pv$ShadowLevel.kfnn[16] = -1813701856;
        pv$ShadowLevel.kfnn[17] = 1863265661;
        pv$ShadowLevel.kfnn[18] = -248098538;
        pv$ShadowLevel.kfnn[19] = -1676223411;
        pv$ShadowLevel.kfnn[20] = -745497585;
        pv$ShadowLevel.kfnn[21] = -1638777500;
        pv$ShadowLevel.kfnn[22] = -1094445826;
        pv$ShadowLevel.kfnn[23] = 659691415;
        pv$ShadowLevel.kfnn[24] = 322060718;
        pv$ShadowLevel.kfnn[25] = 1211087804;
        pv$ShadowLevel.kfnn[26] = -40731015;
        pv$ShadowLevel.kfnn[27] = 1954462438;
        pv$ShadowLevel.kfnn[28] = 1978549832;
        pv$ShadowLevel.kfnn[29] = -299356220;
        pv$ShadowLevel.kfnn[30] = 1016310606;
        pv$ShadowLevel.kfnn[31] = 1370966647;
        pv$ShadowLevel.kfnn[32] = 1946589332;
        pv$ShadowLevel.kfnn[33] = 471266231;
        pv$ShadowLevel.kfnn[34] = -1779877746;
        pv$ShadowLevel.kfnn[35] = -1312017024;
        pv$ShadowLevel.kfnn[36] = 629231677;
        pv$ShadowLevel.kfnn[37] = 2036594845;
        pv$ShadowLevel.kfnn[38] = -661063227;
        pv$ShadowLevel.kfnn[39] = -691668674;
        pv$ShadowLevel.kfnn[40] = -190417419;
        pv$ShadowLevel.kfnn[41] = -1639476702;
        pv$ShadowLevel.kfnn[42] = -1558320727;
        pv$ShadowLevel.kfnn[43] = 1026586004;
        pv$ShadowLevel.kfnn[44] = 1054727095;
        pv$ShadowLevel.kfnn[45] = -1396502677;
        pv$ShadowLevel.kfnn[46] = 2066199191;
        pv$ShadowLevel.kfnn[47] = 568122560;
        pv$ShadowLevel.kfnn[48] = -451148035;
        pv$ShadowLevel.kfnn[49] = 1485031070;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private pv$ShadowLevel(float var3_3, float var4_4, int var5_5, int var6_6) {
        var8_7 /* !! */  = pv$ShadowLevel.b;
        var7_8 = pv$ShadowLevel.a;
        super(var1_1, var2_2);
        this.spreadPx = var3_3;
        this.offsetYPx = var4_4;
        this.steps = var5_5;
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.color = var6_6;
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpj", kfnm(int ), (int)20);
            }
lbl14:
            // 4 sources

            case 1: {
                var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpk", kfnm(int ), (int)21);
                ** GOTO lbl12
            }
            case 2: {
                var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpl", kfnm(int ), (int)22);
                ** GOTO lbl14
            }
            case 3: {
                var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpm", kfnm(int ), (int)23);
            }
lbl22:
            // 3 sources

            case 4: {
                var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpn", kfnm(int ), (int)24);
                ** GOTO lbl14
            }
            case 5: {
                var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpo", kfnm(int ), (int)25);
                ** GOTO lbl22
            }
            case 6: 
        }
        while (true) {
            var8_7 /* !! */  = (int)pv$ShadowLevel.kfnj("kfpq", kfnm(int ), (int)26);
        }
    }

    private static /* synthetic */ int kfnm(int n2) {
        return kfnn[n2] ^ kfno[n2];
    }

    private static /* synthetic */ void kfrl() {
        pv$ShadowLevel.kfno[0] = -445433743;
        pv$ShadowLevel.kfno[1] = -1720168800;
        pv$ShadowLevel.kfno[2] = 333030518;
        pv$ShadowLevel.kfno[3] = 1236218856;
        pv$ShadowLevel.kfno[4] = -1825613910;
        pv$ShadowLevel.kfno[5] = 300244846;
        pv$ShadowLevel.kfno[6] = 939192845;
        pv$ShadowLevel.kfno[7] = 307264271;
        pv$ShadowLevel.kfno[8] = 1170573069;
        pv$ShadowLevel.kfno[9] = -2112367957;
        pv$ShadowLevel.kfno[10] = -835773319;
        pv$ShadowLevel.kfno[11] = -921685179;
        pv$ShadowLevel.kfno[12] = -502337040;
        pv$ShadowLevel.kfno[13] = -1815946971;
        pv$ShadowLevel.kfno[14] = -1920154671;
        pv$ShadowLevel.kfno[15] = 306674208;
        pv$ShadowLevel.kfno[16] = -1813701854;
        pv$ShadowLevel.kfno[17] = 1863265660;
        pv$ShadowLevel.kfno[18] = -248098537;
        pv$ShadowLevel.kfno[19] = -1676223412;
        pv$ShadowLevel.kfno[20] = -745497588;
        pv$ShadowLevel.kfno[21] = -1638777498;
        pv$ShadowLevel.kfno[22] = -1094445832;
        pv$ShadowLevel.kfno[23] = 659691411;
        pv$ShadowLevel.kfno[24] = 322060717;
        pv$ShadowLevel.kfno[25] = 1211087806;
        pv$ShadowLevel.kfno[26] = -40731016;
        pv$ShadowLevel.kfno[27] = -1954462439;
        pv$ShadowLevel.kfno[28] = -792003143;
        pv$ShadowLevel.kfno[29] = -299356219;
        pv$ShadowLevel.kfno[30] = -1039819593;
        pv$ShadowLevel.kfno[31] = 1370966647;
        pv$ShadowLevel.kfno[32] = 1946589333;
        pv$ShadowLevel.kfno[33] = -471266232;
        pv$ShadowLevel.kfno[34] = -1779877748;
        pv$ShadowLevel.kfno[35] = -1312017022;
        pv$ShadowLevel.kfno[36] = 629231676;
        pv$ShadowLevel.kfno[37] = 2036594846;
        pv$ShadowLevel.kfno[38] = -661063228;
        pv$ShadowLevel.kfno[39] = -691668674;
        pv$ShadowLevel.kfno[40] = -1243187723;
        pv$ShadowLevel.kfno[41] = -555249118;
        pv$ShadowLevel.kfno[42] = -1558320735;
        pv$ShadowLevel.kfno[43] = 1026586005;
        pv$ShadowLevel.kfno[44] = 2145246135;
        pv$ShadowLevel.kfno[45] = -331149461;
        pv$ShadowLevel.kfno[46] = 2066199185;
        pv$ShadowLevel.kfno[47] = 568122562;
        pv$ShadowLevel.kfno[48] = -1520695555;
        pv$ShadowLevel.kfno[49] = 1485031069;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ pv$ShadowLevel[] $values() {
        v0 /* !! */  = pv$ShadowLevel.sh;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - pv$ShadowLevel.kfnj("kfps", kfng(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1870913201: {
                    v1 = pv$ShadowLevel.kfnj("kfpt", kfng(int ), (int)17);
                    continue block20;
                }
                case -1627161979: {
                    break block20;
                }
                case -1169090910: {
                    v1 = pv$ShadowLevel.kfnj("kfpu", kfng(int ), (int)18);
                    continue block20;
                }
                case 1564291576: {
                    v1 = pv$ShadowLevel.kfnj("kfpv", kfng(int ), (int)19);
                    continue block20;
                }
            }
            break;
        }
        var2 = pv$ShadowLevel.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfpw", kfng(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == pv$ShadowLevel.kfnj("kfpx", kfnm(int ), (int)27)) break;
            v2 /* !! */  = (long)pv$ShadowLevel.kfnj("kfpz", kfnm(int ), (int)28);
        }
        var1_1 /* !! */  = pv$ShadowLevel.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfqa", kfng(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == pv$ShadowLevel.kfnj("kfqb", kfnm(int ), (int)29)) {
                var0_2 = pv$ShadowLevel.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)pv$ShadowLevel.kfnj("kfqc", kfnm(int ), (int)30);
        }
        if (var0_2) return null;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var0_2) {
                        return null;
                    }
                    v4 = new pv$ShadowLevel[3];
                    v5 = pv$ShadowLevel.kfnj("kfqe", kfnm(int ), (int)31);
                    v6 /* !! */  = pv$ShadowLevel.sh;
                    block24: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -1627161979: {
                                break block24;
                            }
                            case 1654279716: {
                                v6 /* !! */  = (long)(pv$ShadowLevel.kfnj("kfqg", kfng(int ), (int)23) - pv$ShadowLevel.kfnj("kfqf", kfng(int ), (int)22));
                                continue block24;
                            }
                        }
                        break;
                    }
                    v4[v5] = pv$ShadowLevel.WINDOW;
                    v7 = pv$ShadowLevel.kfnj("kfqh", kfnm(int ), (int)32);
                    while (true) {
                        if ((v8 = (cfr_temp_3 = pv$ShadowLevel.sh - pv$ShadowLevel.kfnj("kfqj", kfng(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v8 == pv$ShadowLevel.kfnj("kfqk", kfnm(int ), (int)33)) {
                            v4[v7] = pv$ShadowLevel.FLOATING;
                            v9 = pv$ShadowLevel.kfnj("kfql", kfnm(int ), (int)34);
                            v10 /* !! */  = pv$ShadowLevel.sh;
                            ** break;
                        }
                        v8 = 1293297255;
                    }
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfqr", kfnm(int ), (int)37);
                    } while (!var2);
                    throw null;
                }
                case 3: {
                    var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfqs", kfnm(int ), (int)38);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
lbl72:
                // 1 sources

                block27: while (true) {
                    switch ((int)v10 /* !! */ ) {
                        case -1627161979: {
                            break block27;
                        }
                        case 269912293: {
                            v10 /* !! */  = (long)(pv$ShadowLevel.kfnj("kfqo", kfng(int ), (int)26) - pv$ShadowLevel.kfnj("kfqm", kfng(int ), (int)25));
                            continue block27;
                        }
                    }
                    break;
                }
                v4[v9] = pv$ShadowLevel.CARD;
                return v4;
                case 0: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfqp", kfnm(int ), (int)35);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl89
            break;
        }
        do {
            if (true) ** continue;
lbl89:
            // 2 sources

            var1_1 /* !! */  = (int)pv$ShadowLevel.kfnj("kfqq", kfnm(int ), (int)36);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }
}

