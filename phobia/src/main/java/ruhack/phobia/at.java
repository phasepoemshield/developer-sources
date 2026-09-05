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
import ruhack.phobia.dy;
import ruhack.phobia.dz;
import ruhack.phobia.ki;
import ruhack.phobia.nd;

public final class at {
    public static final float BLUR_STRENGTH = 7.75f;
    public static final boolean c;
    private static final int INNER_SHADOW_COLOR;
    public static final boolean a;
    public static final int PANEL_ALPHA = 166;
    private static final long hh = 2641900228214771827L;
    private static int[] dftf;
    private static long[] dfxt;
    public static final float SHADOW_CLIP_PADDING = 11.0f;
    private static long[] dfxr;
    public static final int b;
    public static final long OUTLINE_APPEAR_MS = 900L;
    private static int[] dfsz;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void panelOutline(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, int var7_7, float var8_8, long var9_9) {
        block55: {
            var22_10 = at.c;
            var21_11 /* !! */  = at.b;
            var20_12 = at.a;
            if (var22_10) {
                throw null;
lbl6:
                // 13 sources

                return;
            }
            if (var20_12 || var20_12) ** GOTO lbl6
            if (var9_9 >= at.dftg("dgdj", dfxk(int ), (int)47)) break block55;
            if (var20_12 || var20_12) ** GOTO lbl6
            ki.outline(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, nd.multAlpha(var7_7, var8_8), (boolean)at.dftg("dgdk", dfsy(int ), (int)122));
            if (var20_12 || var20_12) ** GOTO lbl6
            return;
        }
        if (var20_12 || var20_12) ** GOTO lbl6
        var11_13 = System.currentTimeMillis();
        if (var20_12 || var20_12) ** GOTO lbl6
        var13_14 = var9_9;
        if (var20_12 || var20_12) ** GOTO lbl6
        var15_15 = Math.min(1.0f, (float)(var11_13 - var13_14) / at.dftg("dgdl", dftx(int ), (int)123));
        if (var20_12 || var20_12) ** GOTO lbl6
        var16_16 = at.smootherstep(var15_15);
        if (var20_12 || var20_12) ** GOTO lbl6
        var17_17 = at.smootherstep(Math.max(0.0f, (var15_15 - at.dftg("dgdm", dftx(int ), (int)124)) / at.dftg("dgdn", dftx(int ), (int)125)));
        if (var20_12 || var20_12) ** GOTO lbl6
        var18_18 = var6_6 * (1.0f + (1.0f - var17_17) * at.dftg("dgdo", dftx(int ), (int)126));
        if (var20_12) ** GOTO lbl6
        if (var21_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var21_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var20_12) ** GOTO lbl6
                var19_19 = nd.interpolateColor(nd.multAlpha(dz.color((int)at.dftg("dgdp", dfsy(int ), (int)127)), var8_8), nd.multAlpha(var7_7, var8_8), var17_17);
                if (var20_12 || var20_12) ** GOTO lbl6
                ki.outline(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var18_18, var19_19, Math.max((float)at.dftg("dgdq", dftx(int ), (int)128), var16_16), (boolean)at.dftg("dgdr", dfsy(int ), (int)129));
                if (!var20_12 && !var20_12) ** break;
                ** continue;
                return;
            }
lbl38:
            // 2 sources

            case 0: {
                var21_11 /* !! */  = (int)at.dftg("dgds", dfsy(int ), (int)130);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl43:
            // 2 sources

            case 1: {
                var21_11 /* !! */  = (int)at.dftg("dgdt", dfsy(int ), (int)131);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl53
            }
lbl48:
            // 3 sources

            case 2: {
                var21_11 /* !! */  = (int)at.dftg("dgdu", dfsy(int ), (int)132);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl53:
            // 3 sources

            case 3: {
                var21_11 /* !! */  = (int)at.dftg("dgdv", dfsy(int ), (int)133);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 4: {
                var21_11 /* !! */  = (int)at.dftg("dgdw", dfsy(int ), (int)134);
                if (!var22_10) ** GOTO lbl38
                throw null;
            }
lbl62:
            // 2 sources

            case 5: {
                var21_11 /* !! */  = (int)at.dftg("dgdx", dfsy(int ), (int)135);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl67:
            // 3 sources

            case 6: {
                do {
                    var21_11 /* !! */  = (int)at.dftg("dgdy", dfsy(int ), (int)136);
                } while (!var22_10);
                throw null;
            }
            case 7: {
                var21_11 /* !! */  = (int)at.dftg("dgdz", dfsy(int ), (int)137);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl77:
            // 2 sources

            case 8: {
                var21_11 /* !! */  = (int)at.dftg("dgea", dfsy(int ), (int)138);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 9: {
                var21_11 /* !! */  = (int)at.dftg("dgeb", dfsy(int ), (int)139);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl87:
            // 2 sources

            case 10: {
                var21_11 /* !! */  = (int)at.dftg("dgec", dfsy(int ), (int)140);
                if (!var22_10) ** GOTO lbl48
                throw null;
            }
            case 11: {
                var21_11 /* !! */  = (int)at.dftg("dged", dfsy(int ), (int)141);
                if (!var22_10) ** GOTO lbl48
                throw null;
            }
            case 12: {
                var21_11 /* !! */  = (int)at.dftg("dgee", dfsy(int ), (int)142);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl100:
            // 2 sources

            case 13: {
                var21_11 /* !! */  = (int)at.dftg("dgef", dfsy(int ), (int)143);
                if (!var22_10) ** GOTO lbl53
                throw null;
            }
            case 14: {
                var21_11 /* !! */  = (int)at.dftg("dgeg", dfsy(int ), (int)144);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 15: {
                var21_11 /* !! */  = (int)at.dftg("dgeh", dfsy(int ), (int)145);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl114:
            // 2 sources

            case 16: {
                var21_11 /* !! */  = (int)at.dftg("dgei", dfsy(int ), (int)146);
                if (!var22_10) ** GOTO lbl87
                throw null;
            }
            case 17: {
                var21_11 /* !! */  = (int)at.dftg("dgej", dfsy(int ), (int)147);
                if (!var22_10) break;
                throw null;
            }
lbl122:
            // 4 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var21_11 /* !! */  = (int)at.dftg("dgek", dfsy(int ), (int)148);
                    if (!var22_10) ** GOTO lbl77
                    throw null;
                }
            }
lbl127:
            // 3 sources

            case 19: {
                var21_11 /* !! */  = (int)at.dftg("dgel", dfsy(int ), (int)149);
                if (!var22_10) break;
                throw null;
            }
            case 20: {
                var21_11 /* !! */  = (int)at.dftg("dgem", dfsy(int ), (int)150);
                if (!var22_10) ** GOTO lbl62
                throw null;
            }
lbl135:
            // 3 sources

            case 21: {
                var21_11 /* !! */  = (int)at.dftg("dgen", dfsy(int ), (int)151);
                if (var22_10) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl140:
            // 2 sources

            case 22: {
                do {
                    var21_11 /* !! */  = (int)at.dftg("dgeo", dfsy(int ), (int)152);
                } while (!var22_10);
                throw null;
            }
lbl145:
            // 2 sources

            case 23: {
                var21_11 /* !! */  = (int)at.dftg("dgep", dfsy(int ), (int)153);
                if (!var22_10) ** GOTO lbl67
                throw null;
            }
            case 24: {
                var21_11 /* !! */  = (int)at.dftg("dgeq", dfsy(int ), (int)154);
                if (!var22_10) ** GOTO lbl135
                throw null;
            }
            case 25: {
                var21_11 /* !! */  = (int)at.dftg("dger", dfsy(int ), (int)155);
                if (!var22_10) ** GOTO lbl43
                throw null;
            }
            case 26: 
        }
        var21_11 /* !! */  = (int)at.dftg("dges", dfsy(int ), (int)156);
        ** while (!var22_10)
lbl160:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite dftg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        dfsz = new int[173];
        dftf = new int[173];
        at.dgfs();
        at.dgft();
        at.dgfu();
        at.dgfv();
        dfxr = new long[57];
        dfxt = new long[57];
        at.dgfw();
        at.dgfx();
        INNER_SHADOW_COLOR = nd.rgba(0, 0, 0, 46);
    }

    private static /* synthetic */ void dgfw() {
        at.dfxr[0] = -4746087114233784973L;
        at.dfxr[1] = -4600165292971223283L;
        at.dfxr[2] = 6469495029359538049L;
        at.dfxr[3] = -1557986948468452825L;
        at.dfxr[4] = 8709188453037024985L;
        at.dfxr[5] = -4562693352709197512L;
        at.dfxr[6] = 2460291637433906862L;
        at.dfxr[7] = -787074341783951771L;
        at.dfxr[8] = -3261942055586737618L;
        at.dfxr[9] = -6993048841691571254L;
        at.dfxr[10] = -1590182537490071592L;
        at.dfxr[11] = -5941516990840534699L;
        at.dfxr[12] = -1544934188398946795L;
        at.dfxr[13] = 6660998332975110100L;
        at.dfxr[14] = -8783082709110316989L;
        at.dfxr[15] = 6199241703365132745L;
        at.dfxr[16] = -6635984795181697989L;
        at.dfxr[17] = 8626820337950194100L;
        at.dfxr[18] = -7874090385885948572L;
        at.dfxr[19] = 3293600891189793040L;
        at.dfxr[20] = 2591721908020093741L;
        at.dfxr[21] = 8571356287134691433L;
        at.dfxr[22] = -8242130914162235077L;
        at.dfxr[23] = -3036141232350714822L;
        at.dfxr[24] = -6885847892595750952L;
        at.dfxr[25] = 6962714736023769845L;
        at.dfxr[26] = -5593926791444768159L;
        at.dfxr[27] = -6841344023489499340L;
        at.dfxr[28] = -1087275692376840892L;
        at.dfxr[29] = 2405724810902497829L;
        at.dfxr[30] = -7356299769818347781L;
        at.dfxr[31] = -4788996911981062151L;
        at.dfxr[32] = -8572686121856953285L;
        at.dfxr[33] = -1321006256067769817L;
        at.dfxr[34] = 4831034636281996330L;
        at.dfxr[35] = -6612893489053849173L;
        at.dfxr[36] = 541418605097917455L;
        at.dfxr[37] = -1874464020987568765L;
        at.dfxr[38] = 3227104275418887685L;
        at.dfxr[39] = 5135704720674769897L;
        at.dfxr[40] = -1183286953786324028L;
        at.dfxr[41] = -5573009637977095609L;
        at.dfxr[42] = 258826887126192507L;
        at.dfxr[43] = 4922858266478848312L;
        at.dfxr[44] = 8162233105351165043L;
        at.dfxr[45] = 3028293478317268627L;
        at.dfxr[46] = -4622449173419742992L;
        at.dfxr[47] = 5694466348605241444L;
        at.dfxr[48] = 4309639067533413078L;
        at.dfxr[49] = -7415580041687103000L;
        at.dfxr[50] = 8656122553027114739L;
        at.dfxr[51] = -8910873764934129433L;
        at.dfxr[52] = -1196555484503646496L;
        at.dfxr[53] = -4460309080240007086L;
        at.dfxr[54] = 8481627352106318179L;
        at.dfxr[55] = 7266760230043958241L;
        at.dfxr[56] = -8192558351055464212L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float smootherstep(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = at.hh - at.dftg("dget", dfxk(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == at.dftg("dgeu", dfsy(int ), (int)157)) break;
            v0 /* !! */  = (long)at.dftg("dgev", dfsy(int ), (int)158);
        }
        var4_1 = at.c;
        v1 /* !! */  = at.hh;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - at.dftg("dgew", dfxk(int ), (int)49));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1698443149: {
                    break block19;
                }
                case -645089174: {
                    v2 = at.dftg("dgex", dfxk(int ), (int)50);
                    continue block19;
                }
                case 1153660781: {
                    v2 = at.dftg("dgey", dfxk(int ), (int)51);
                    continue block19;
                }
                case 1196610716: {
                    v2 = at.dftg("dgez", dfxk(int ), (int)52);
                    continue block19;
                }
            }
            break;
        }
        var3_2 /* !! */  = at.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = at.hh - at.dftg("dgfa", dfxk(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == at.dftg("dgfb", dfsy(int ), (int)159)) break;
            v3 /* !! */  = (long)at.dftg("dgfc", dfsy(int ), (int)160);
        }
        var2_3 = at.a;
        if (!var4_1) ** GOTO lbl38
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)at.dftg("dgfd", dftx(int ), (int)161);
                }
lbl38:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl-1000
                v4 /* !! */  = at.hh;
                if (true) ** GOTO lbl43
                block22: while (true) {
                    v4 /* !! */  = (long)(at.dftg("dgff", dfxk(int ), (int)55) - at.dftg("dgfe", dfxk(int ), (int)54));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1698443149: {
                            break block22;
                        }
                        case 90602238: {
                            continue block22;
                        }
                    }
                    break;
                }
                v5 = Math.min(1.0f, var0);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = at.hh - at.dftg("dgfg", dfxk(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == at.dftg("dgfh", dfsy(int ), (int)162)) break;
                    v6 /* !! */  = (long)at.dftg("dgfi", dfsy(int ), (int)163);
                }
                var1_4 = Math.max(0.0f, v5);
                if (var2_3 || var2_3) continue block21;
                return var1_4 * var1_4 * var1_4 * (var1_4 * (var1_4 * at.dftg("dgfj", dftx(int ), (int)164) - at.dftg("dgfk", dftx(int ), (int)165)) + at.dftg("dgfl", dftx(int ), (int)166));
                case 0: {
                    var3_2 /* !! */  = (int)at.dftg("dgfm", dfsy(int ), (int)167);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl71
                }
lbl63:
                // 2 sources

                case 1: {
                    var3_2 /* !! */  = (int)at.dftg("dgfn", dfsy(int ), (int)168);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl67:
                // 4 sources

                case 2: {
                    var3_2 /* !! */  = (int)at.dftg("dgfo", dfsy(int ), (int)169);
                    if (!var4_1) ** GOTO lbl63
                    throw null;
                }
lbl71:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)at.dftg("dgfp", dfsy(int ), (int)170);
                        if (!var4_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 4: {
                    var3_2 /* !! */  = (int)at.dftg("dgfq", dfsy(int ), (int)171);
                    if (!var4_1) ** GOTO lbl67
                    throw null;
                }
                case 5: 
            }
        }
        var3_2 /* !! */  = (int)at.dftg("dgfr", dfsy(int ), (int)172);
        ** while (!var4_1)
lbl83:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dftx(int n2) {
        return Float.intBitsToFloat(dfsz[n2] ^ dftf[n2]);
    }

    private static /* synthetic */ int dfsy(int n2) {
        return dfsz[n2] ^ dftf[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void blur(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block62: {
            block61: {
                var11_7 = at.c;
                var10_8 /* !! */  = at.b;
                var9_9 = at.a;
                if (var11_7) {
                    throw null;
lbl6:
                    // 16 sources

                    return;
                }
                if (var9_9 || var9_9) ** GOTO lbl6
                var7_10 = Math.max(0.0f, Math.min(1.0f, var6_6)) * ki.getColorMul();
                if (var9_9 || var9_9) ** GOTO lbl6
                if (var7_10 < at.dftg("dfty", dftx(int ), (int)3)) break block61;
                if (var9_9) ** GOTO lbl6
                if (!ki.hasViewTransform()) break block62;
                if (var9_9) ** GOTO lbl6
            }
            if (var9_9 || var9_9) ** GOTO lbl6
            return;
        }
        if (var9_9 || var9_9) ** GOTO lbl6
        var8_11 = dy.getInstance();
        if (var9_9 || var9_9) ** GOTO lbl6
        if (var10_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_11 == null) ** GOTO lbl39
                if (var9_9) ** GOTO lbl6
                if (var8_11.isNewBackground()) ** GOTO lbl39
                if (var9_9 || var9_9) ** GOTO lbl6
                if (!var8_11.blurEnabled.isValue()) ** GOTO lbl33
                if (var9_9) ** GOTO lbl6
                if (!(var8_11.blurStrength.getValue() <= 0.0f)) ** GOTO lbl35
                if (var9_9) ** GOTO lbl6
lbl33:
                // 2 sources

                if (var9_9 || var9_9) ** GOTO lbl6
                return;
lbl35:
                // 1 sources

                if (var9_9 || var9_9) ** GOTO lbl6
                ki.blurForced(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var8_11.blurStrength.getValue(), (boolean)at.dftg("dfuf", dfsy(int ), (int)4));
                if (var9_9 || var9_9) ** GOTO lbl6
                return;
lbl39:
                // 2 sources

                if (var9_9 || var9_9) ** GOTO lbl6
                ki.blurForced(var0, var1_1, var2_2, var3_3, var4_4, var5_5, (float)at.dftg("dfug", dftx(int ), (int)5), (boolean)at.dftg("dfuh", dfsy(int ), (int)6));
                if (!var9_9 && !var9_9) ** break;
                ** continue;
                return;
            }
lbl44:
            // 4 sources

            case 0: {
                var10_8 /* !! */  = (int)at.dftg("dfui", dfsy(int ), (int)7);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                var10_8 /* !! */  = (int)at.dftg("dfup", dfsy(int ), (int)8);
                if (!var11_7) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var10_8 /* !! */  = (int)at.dftg("dfuq", dfsy(int ), (int)9);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl58:
            // 4 sources

            case 3: {
                var10_8 /* !! */  = (int)at.dftg("dfur", dfsy(int ), (int)10);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl63:
            // 2 sources

            case 4: {
                var10_8 /* !! */  = (int)at.dftg("dfus", dfsy(int ), (int)11);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 5: {
                var10_8 /* !! */  = (int)at.dftg("dfut", dfsy(int ), (int)12);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 6: {
                var10_8 /* !! */  = (int)at.dftg("dfuw", dfsy(int ), (int)13);
                if (!var11_7) ** GOTO lbl58
                throw null;
            }
lbl77:
            // 3 sources

            case 7: {
                var10_8 /* !! */  = (int)at.dftg("dfuy", dfsy(int ), (int)14);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl82:
            // 3 sources

            case 8: {
                var10_8 /* !! */  = (int)at.dftg("dfvm", dfsy(int ), (int)15);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl87:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_8 /* !! */  = (int)at.dftg("dfvn", dfsy(int ), (int)16);
                    if (!var11_7) ** GOTO lbl44
                    throw null;
                }
            }
lbl92:
            // 2 sources

            case 10: {
                var10_8 /* !! */  = (int)at.dftg("dfvo", dfsy(int ), (int)17);
                if (!var11_7) ** GOTO lbl58
                throw null;
            }
lbl96:
            // 3 sources

            case 11: {
                var10_8 /* !! */  = (int)at.dftg("dfvp", dfsy(int ), (int)18);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 12: {
                var10_8 /* !! */  = (int)at.dftg("dfvq", dfsy(int ), (int)19);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl106:
            // 2 sources

            case 13: {
                var10_8 /* !! */  = (int)at.dftg("dfvr", dfsy(int ), (int)20);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 14: {
                var10_8 /* !! */  = (int)at.dftg("dfvs", dfsy(int ), (int)21);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl116:
            // 2 sources

            case 15: {
                var10_8 /* !! */  = (int)at.dftg("dfvv", dfsy(int ), (int)22);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl121:
            // 2 sources

            case 16: {
                var10_8 /* !! */  = (int)at.dftg("dfvy", dfsy(int ), (int)23);
                if (!var11_7) ** GOTO lbl44
                throw null;
            }
lbl125:
            // 2 sources

            case 17: {
                var10_8 /* !! */  = (int)at.dftg("dfvz", dfsy(int ), (int)24);
                if (!var11_7) ** GOTO lbl77
                throw null;
            }
lbl129:
            // 2 sources

            case 18: {
                var10_8 /* !! */  = (int)at.dftg("dfwa", dfsy(int ), (int)25);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 19: {
                var10_8 /* !! */  = (int)at.dftg("dfwb", dfsy(int ), (int)26);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 20: {
                var10_8 /* !! */  = (int)at.dftg("dfwc", dfsy(int ), (int)27);
                if (!var11_7) ** GOTO lbl58
                throw null;
            }
lbl143:
            // 2 sources

            case 21: {
                var10_8 /* !! */  = (int)at.dftg("dfwd", dfsy(int ), (int)28);
                if (!var11_7) ** GOTO lbl77
                throw null;
            }
lbl147:
            // 2 sources

            case 22: {
                var10_8 /* !! */  = (int)at.dftg("dfwk", dfsy(int ), (int)29);
                if (!var11_7) ** GOTO lbl82
                throw null;
            }
            case 23: {
                var10_8 /* !! */  = (int)at.dftg("dfwl", dfsy(int ), (int)30);
                if (!var11_7) ** GOTO lbl96
                throw null;
            }
            case 24: {
                var10_8 /* !! */  = (int)at.dftg("dfwm", dfsy(int ), (int)31);
                if (!var11_7) ** GOTO lbl87
                throw null;
            }
lbl159:
            // 4 sources

            case 25: {
                do {
                    var10_8 /* !! */  = (int)at.dftg("dfwn", dfsy(int ), (int)32);
                } while (!var11_7);
                throw null;
            }
            case 26: {
                var10_8 /* !! */  = (int)at.dftg("dfwo", dfsy(int ), (int)33);
                if (!var11_7) ** GOTO lbl121
                throw null;
            }
            case 27: {
                var10_8 /* !! */  = (int)at.dftg("dfwp", dfsy(int ), (int)34);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl173:
            // 2 sources

            case 28: {
                var10_8 /* !! */  = (int)at.dftg("dfxc", dfsy(int ), (int)35);
                if (var11_7) {
                    throw null;
                }
            }
lbl177:
            // 5 sources

            case 29: {
                var10_8 /* !! */  = (int)at.dftg("dfxe", dfsy(int ), (int)36);
                if (!var11_7) ** GOTO lbl159
                throw null;
            }
            case 30: 
        }
        var10_8 /* !! */  = (int)at.dftg("dfxg", dfsy(int ), (int)37);
        ** while (!var11_7)
lbl184:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dgfs() {
        at.dfsz[0] = -1704921621;
        at.dfsz[1] = -1793595880;
        at.dfsz[2] = -213817732;
        at.dfsz[3] = 1419776374;
        at.dfsz[4] = 1514356847;
        at.dfsz[5] = -199815456;
        at.dfsz[6] = 2002946725;
        at.dfsz[7] = 148485371;
        at.dfsz[8] = -1143730677;
        at.dfsz[9] = -864953896;
        at.dfsz[10] = -1930848787;
        at.dfsz[11] = -106234112;
        at.dfsz[12] = -1882066203;
        at.dfsz[13] = 1224484513;
        at.dfsz[14] = 74273198;
        at.dfsz[15] = -848425757;
        at.dfsz[16] = -1724970657;
        at.dfsz[17] = -1898033309;
        at.dfsz[18] = 24773312;
        at.dfsz[19] = 1394126613;
        at.dfsz[20] = 515503182;
        at.dfsz[21] = 381225314;
        at.dfsz[22] = 1149357654;
        at.dfsz[23] = 241049298;
        at.dfsz[24] = -1339715692;
        at.dfsz[25] = -1008067246;
        at.dfsz[26] = -782482224;
        at.dfsz[27] = 1962277044;
        at.dfsz[28] = -783954451;
        at.dfsz[29] = 66595279;
        at.dfsz[30] = 762918646;
        at.dfsz[31] = -890284626;
        at.dfsz[32] = -1229156828;
        at.dfsz[33] = -1692735871;
        at.dfsz[34] = -1131857576;
        at.dfsz[35] = -726887454;
        at.dfsz[36] = 1907975840;
        at.dfsz[37] = 568367520;
        at.dfsz[38] = 249844418;
        at.dfsz[39] = 329147880;
        at.dfsz[40] = 1352084703;
        at.dfsz[41] = 1966532784;
        at.dfsz[42] = -246506485;
        at.dfsz[43] = 571264040;
        at.dfsz[44] = -40398172;
        at.dfsz[45] = 753271946;
        at.dfsz[46] = -883726506;
        at.dfsz[47] = -818047484;
        at.dfsz[48] = 112076434;
        at.dfsz[49] = 224133686;
        at.dfsz[50] = 1366889572;
        at.dfsz[51] = 5100862;
        at.dfsz[52] = -725927965;
        at.dfsz[53] = 1149070105;
        at.dfsz[54] = 2022768225;
        at.dfsz[55] = -447165227;
        at.dfsz[56] = -1960496061;
        at.dfsz[57] = 125917605;
        at.dfsz[58] = 602906844;
        at.dfsz[59] = -1378254252;
        at.dfsz[60] = 935149526;
        at.dfsz[61] = -56157342;
        at.dfsz[62] = 1482084207;
        at.dfsz[63] = 1526053812;
        at.dfsz[64] = -1101810534;
        at.dfsz[65] = 1960698953;
        at.dfsz[66] = -1690949958;
        at.dfsz[67] = -71316607;
        at.dfsz[68] = 384014797;
        at.dfsz[69] = 402628693;
        at.dfsz[70] = 1543279678;
        at.dfsz[71] = 2136069164;
        at.dfsz[72] = 160228701;
        at.dfsz[73] = 1563155453;
        at.dfsz[74] = -1786233605;
        at.dfsz[75] = 1949136699;
        at.dfsz[76] = 1750353795;
        at.dfsz[77] = 187300325;
        at.dfsz[78] = -1482390905;
        at.dfsz[79] = -926244827;
        at.dfsz[80] = -832111165;
        at.dfsz[81] = 103751517;
        at.dfsz[82] = 1548879828;
        at.dfsz[83] = 824622024;
        at.dfsz[84] = 149797618;
        at.dfsz[85] = 1190651506;
        at.dfsz[86] = 943737896;
        at.dfsz[87] = 1954120262;
        at.dfsz[88] = 1661482673;
        at.dfsz[89] = 1184810996;
        at.dfsz[90] = 1984933485;
        at.dfsz[91] = -1507010252;
        at.dfsz[92] = -336112840;
        at.dfsz[93] = 1192670138;
        at.dfsz[94] = -1357848662;
        at.dfsz[95] = 1449244316;
        at.dfsz[96] = -926950742;
        at.dfsz[97] = 1834830666;
        at.dfsz[98] = 32450316;
        at.dfsz[99] = -1499965771;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private at() {
        var2_1 /* !! */  = at.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
lbl7:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)at.dftg("dftk", dfsy(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)at.dftg("dftm", dfsy(int ), (int)1);
                    ** GOTO lbl7
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)at.dftg("dftp", dfsy(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void dgfv() {
        at.dftf[100] = 297937962;
        at.dftf[101] = 1036598153;
        at.dftf[102] = 1573869304;
        at.dftf[103] = 1397512132;
        at.dftf[104] = -881559414;
        at.dftf[105] = -1391181958;
        at.dftf[106] = 373185648;
        at.dftf[107] = 1079487612;
        at.dftf[108] = 1830419416;
        at.dftf[109] = -395687684;
        at.dftf[110] = -1242592127;
        at.dftf[111] = 976765203;
        at.dftf[112] = -948970022;
        at.dftf[113] = 1561149782;
        at.dftf[114] = 1934191374;
        at.dftf[115] = 1420636388;
        at.dftf[116] = -111361154;
        at.dftf[117] = 80258638;
        at.dftf[118] = -1452509137;
        at.dftf[119] = -1925297727;
        at.dftf[120] = 336045766;
        at.dftf[121] = 1267569645;
        at.dftf[122] = -112071254;
        at.dftf[123] = 1278172056;
        at.dftf[124] = -523472640;
        at.dftf[125] = -193198176;
        at.dftf[126] = 1537313596;
        at.dftf[127] = 409598049;
        at.dftf[128] = -299219427;
        at.dftf[129] = 1007853273;
        at.dftf[130] = 717852429;
        at.dftf[131] = -253037414;
        at.dftf[132] = -272444303;
        at.dftf[133] = -899140682;
        at.dftf[134] = 1038206671;
        at.dftf[135] = -1937075029;
        at.dftf[136] = 1253045417;
        at.dftf[137] = 953967380;
        at.dftf[138] = -1547413957;
        at.dftf[139] = -227779803;
        at.dftf[140] = -2123037053;
        at.dftf[141] = 1351673149;
        at.dftf[142] = -1376622283;
        at.dftf[143] = 110836246;
        at.dftf[144] = -1203672689;
        at.dftf[145] = 1608978777;
        at.dftf[146] = -502307796;
        at.dftf[147] = 1562838430;
        at.dftf[148] = 98254394;
        at.dftf[149] = -7494620;
        at.dftf[150] = -2026621241;
        at.dftf[151] = -1441924158;
        at.dftf[152] = -108612856;
        at.dftf[153] = 404209121;
        at.dftf[154] = 1683141821;
        at.dftf[155] = -1114212992;
        at.dftf[156] = 952001056;
        at.dftf[157] = 1248466210;
        at.dftf[158] = -774536435;
        at.dftf[159] = -1074918971;
        at.dftf[160] = 1983975730;
        at.dftf[161] = 593190775;
        at.dftf[162] = 1848735619;
        at.dftf[163] = -1292470080;
        at.dftf[164] = 1974829637;
        at.dftf[165] = 917882733;
        at.dftf[166] = 561014070;
        at.dftf[167] = -1831611036;
        at.dftf[168] = 957106071;
        at.dftf[169] = 363690066;
        at.dftf[170] = 757573969;
        at.dftf[171] = 195315999;
        at.dftf[172] = -867590549;
    }

    private static /* synthetic */ void dgft() {
        at.dfsz[100] = -1185171774;
        at.dfsz[101] = 1036598152;
        at.dfsz[102] = -880206968;
        at.dfsz[103] = 1397512132;
        at.dfsz[104] = -881559413;
        at.dfsz[105] = -1391181968;
        at.dfsz[106] = 373185661;
        at.dfsz[107] = 1079487605;
        at.dfsz[108] = 1830419411;
        at.dfsz[109] = -395687689;
        at.dfsz[110] = -1242592125;
        at.dfsz[111] = 976765187;
        at.dfsz[112] = -948970023;
        at.dfsz[113] = 1561149776;
        at.dfsz[114] = 1934191366;
        at.dfsz[115] = 1420636395;
        at.dfsz[116] = -111361156;
        at.dfsz[117] = 80258634;
        at.dfsz[118] = -1452509151;
        at.dfsz[119] = -1925297712;
        at.dfsz[120] = 336045774;
        at.dfsz[121] = 1267569641;
        at.dfsz[122] = -112071254;
        at.dfsz[123] = 139352984;
        at.dfsz[124] = -539834030;
        at.dfsz[125] = -893482756;
        at.dfsz[126] = 1678591985;
        at.dfsz[127] = 409598110;
        at.dfsz[128] = -762736361;
        at.dfsz[129] = 1007853273;
        at.dfsz[130] = 717852424;
        at.dfsz[131] = -253037410;
        at.dfsz[132] = -272444291;
        at.dfsz[133] = -899140686;
        at.dfsz[134] = 1038206685;
        at.dfsz[135] = -1937075015;
        at.dfsz[136] = 1253045414;
        at.dfsz[137] = 953967363;
        at.dfsz[138] = -1547413966;
        at.dfsz[139] = -227779798;
        at.dfsz[140] = -2123037048;
        at.dfsz[141] = 1351673145;
        at.dfsz[142] = -1376622285;
        at.dfsz[143] = 110836229;
        at.dfsz[144] = -1203672699;
        at.dfsz[145] = 1608978783;
        at.dfsz[146] = -502307795;
        at.dfsz[147] = 1562838422;
        at.dfsz[148] = 98254370;
        at.dfsz[149] = -7494594;
        at.dfsz[150] = -2026621243;
        at.dfsz[151] = -1441924144;
        at.dfsz[152] = -108612854;
        at.dfsz[153] = 404209147;
        at.dfsz[154] = 1683141799;
        at.dfsz[155] = -1114212979;
        at.dfsz[156] = 952001078;
        at.dfsz[157] = -1248466211;
        at.dfsz[158] = 890995858;
        at.dfsz[159] = 1074918970;
        at.dfsz[160] = -1380399061;
        at.dfsz[161] = 477322777;
        at.dfsz[162] = -1848735620;
        at.dfsz[163] = 784486608;
        at.dfsz[164] = 896893509;
        at.dfsz[165] = 2009450349;
        at.dfsz[166] = 1615881526;
        at.dfsz[167] = -1831611039;
        at.dfsz[168] = 957106068;
        at.dfsz[169] = 363690065;
        at.dfsz[170] = 757573973;
        at.dfsz[171] = 195315995;
        at.dfsz[172] = -867590546;
    }

    private static /* synthetic */ void dgfx() {
        at.dfxt[0] = -9106144613049457200L;
        at.dfxt[1] = -3170873365066417545L;
        at.dfxt[2] = -4794574103095358028L;
        at.dfxt[3] = -6633224896426519928L;
        at.dfxt[4] = 6626568567020852998L;
        at.dfxt[5] = 8987710771178450624L;
        at.dfxt[6] = 9117906903536305434L;
        at.dfxt[7] = -8872168531759146141L;
        at.dfxt[8] = 26280893575545638L;
        at.dfxt[9] = 5976692977165087513L;
        at.dfxt[10] = -2435850816737651475L;
        at.dfxt[11] = 1488646119795526135L;
        at.dfxt[12] = -4346642390067739933L;
        at.dfxt[13] = 1245645873277600691L;
        at.dfxt[14] = -7307307754714847279L;
        at.dfxt[15] = 4124672287722384604L;
        at.dfxt[16] = 6670619438999165656L;
        at.dfxt[17] = 4541511336442768141L;
        at.dfxt[18] = 2684850768609917234L;
        at.dfxt[19] = -2997673618482689951L;
        at.dfxt[20] = -6351507643057227673L;
        at.dfxt[21] = 1101283758569259755L;
        at.dfxt[22] = -8097989768188498619L;
        at.dfxt[23] = -2772600819354007367L;
        at.dfxt[24] = 6468566206934754125L;
        at.dfxt[25] = 6303359841798670525L;
        at.dfxt[26] = -1350668970849290139L;
        at.dfxt[27] = -3196096255820616115L;
        at.dfxt[28] = -2796878081310557936L;
        at.dfxt[29] = -4515449379409509622L;
        at.dfxt[30] = 1569351761933643302L;
        at.dfxt[31] = -2120561985880082209L;
        at.dfxt[32] = -8180405304751053076L;
        at.dfxt[33] = 702119348577040401L;
        at.dfxt[34] = 4425907395326998895L;
        at.dfxt[35] = 1959963144593190603L;
        at.dfxt[36] = 3717171972015383940L;
        at.dfxt[37] = -2407939333681445136L;
        at.dfxt[38] = -286177508455648565L;
        at.dfxt[39] = 5207327418153741060L;
        at.dfxt[40] = -6534654725840909156L;
        at.dfxt[41] = -1682397439285553093L;
        at.dfxt[42] = -1561435676163925053L;
        at.dfxt[43] = -371162937977921578L;
        at.dfxt[44] = 8966529622609920524L;
        at.dfxt[45] = -1063179993303271557L;
        at.dfxt[46] = -7062037313849765823L;
        at.dfxt[47] = 5694466348605241444L;
        at.dfxt[48] = 6571116402520561924L;
        at.dfxt[49] = 293947114832271149L;
        at.dfxt[50] = 2739602367470433474L;
        at.dfxt[51] = -8852462440135778546L;
        at.dfxt[52] = -7917010942876949537L;
        at.dfxt[53] = -5487678619143588191L;
        at.dfxt[54] = 3761365690848943474L;
        at.dfxt[55] = -1528975924978530549L;
        at.dfxt[56] = -2841997175409001728L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void panelWithInnerShadow(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = at.hh - at.dftg("dgbf", dfxk(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == at.dftg("dgbg", dfsy(int ), (int)86)) break;
            v0 /* !! */  = (long)at.dftg("dgbh", dfsy(int ), (int)87);
        }
        var12_9 = at.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = at.hh - at.dftg("dgbi", dfxk(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == at.dftg("dgbj", dfsy(int ), (int)88)) break;
            v1 /* !! */  = (long)at.dftg("dgbk", dfsy(int ), (int)89);
        }
        var11_10 /* !! */  = at.b;
        v2 /* !! */  = at.hh;
        if (true) ** GOTO lbl17
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - at.dftg("dgbl", dfxk(int ), (int)29));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1698443149: {
                    break block45;
                }
                case -1475470849: {
                    v3 = at.dftg("dgbm", dfxk(int ), (int)30);
                    continue block45;
                }
                case -161616896: {
                    v3 = at.dftg("dgbn", dfxk(int ), (int)31);
                    continue block45;
                }
                case 822195168: {
                    v3 = at.dftg("dgbo", dfxk(int ), (int)32);
                    continue block45;
                }
            }
            break;
        }
        var10_11 = at.a;
        if (var12_9) {
            throw null;
lbl32:
            // 9 sources

            return;
        }
        if (var10_11 || var10_11) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = at.hh - at.dftg("dgbp", dfxk(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == at.dftg("dgbq", dfsy(int ), (int)90)) break;
            v4 /* !! */  = (long)at.dftg("dgbr", dfsy(int ), (int)91);
        }
        at.panel(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
        if (var10_11 || var10_11) ** GOTO lbl32
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = at.hh - at.dftg("dgbs", dfxk(int ), (int)34)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == at.dftg("dgbt", dfsy(int ), (int)92)) break;
            v5 /* !! */  = (long)at.dftg("dgbu", dfsy(int ), (int)93);
        }
        var9_12 = dy.getInstance();
        if (var10_11) ** GOTO lbl32
        if (var11_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_11) ** GOTO lbl32
                if (var9_12 == null) ** GOTO lbl101
                if (var10_11) ** GOTO lbl32
                v6 /* !! */  = at.hh;
                if (true) ** GOTO lbl59
                block49: while (true) {
                    v6 /* !! */  = (long)(at.dftg("dgbw", dfxk(int ), (int)36) - at.dftg("dgbv", dfxk(int ), (int)35));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1698443149: {
                            break block49;
                        }
                        case -920093569: {
                            continue block49;
                        }
                    }
                    break;
                }
                if (var9_12.isNewBackground()) ** GOTO lbl101
                if (var10_11 || var10_11) ** GOTO lbl32
                v7 = at.dftg("dgbx", dfsy(int ), (int)94);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = at.hh - at.dftg("dgby", dfxk(int ), (int)37)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == at.dftg("dgbz", dfsy(int ), (int)95)) break;
                    v8 /* !! */  = (long)at.dftg("dgca", dfsy(int ), (int)96);
                }
                v9 = dz.color((int)v7);
                v10 = var6_6 * at.dftg("dgcb", dftx(int ), (int)97);
                v11 /* !! */  = at.hh;
                if (true) ** GOTO lbl78
                block51: while (true) {
                    v11 /* !! */  = (long)(at.dftg("dgcd", dfxk(int ), (int)39) - at.dftg("dgcc", dfxk(int ), (int)38));
lbl78:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1698443149: {
                            break block51;
                        }
                        case 1072095789: {
                            continue block51;
                        }
                    }
                    break;
                }
                v12 = nd.multAlpha(v9, v10);
                v13 = at.dftg("dgce", dfsy(int ), (int)98);
                v14 /* !! */  = at.hh;
                if (true) ** GOTO lbl89
                block52: while (true) {
                    v14 /* !! */  = (long)(v15 - at.dftg("dgcf", dfxk(int ), (int)40));
lbl89:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1698443149: {
                            break block52;
                        }
                        case -104562060: {
                            v15 = at.dftg("dgcg", dfxk(int ), (int)41);
                            continue block52;
                        }
                        case 1824370489: {
                            v15 = at.dftg("dgch", dfxk(int ), (int)42);
                            continue block52;
                        }
                    }
                    break;
                }
                ki.innerShadow(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var7_7, var8_8, v12, (boolean)v13);
                if (var10_11 || var10_11) ** GOTO lbl32
                return;
lbl101:
                // 2 sources

                if (var10_11 || var10_11) ** GOTO lbl32
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = at.hh - at.dftg("dgci", dfxk(int ), (int)43)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == at.dftg("dgcj", dfsy(int ), (int)99)) break;
                    v16 /* !! */  = (long)at.dftg("dgck", dfsy(int ), (int)100);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = at.hh - at.dftg("dgcl", dfxk(int ), (int)44)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == at.dftg("dgcm", dfsy(int ), (int)101)) break;
                    v17 /* !! */  = (long)at.dftg("dgcn", dfsy(int ), (int)102);
                }
                v18 = nd.multAlpha(at.INNER_SHADOW_COLOR, var6_6);
                v19 = at.dftg("dgco", dfsy(int ), (int)103);
                v20 /* !! */  = at.hh;
                if (true) ** GOTO lbl118
                block55: while (true) {
                    v20 /* !! */  = (long)(at.dftg("dgcq", dfxk(int ), (int)46) - at.dftg("dgcp", dfxk(int ), (int)45));
lbl118:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1698443149: {
                            break block55;
                        }
                        case 762586725: {
                            continue block55;
                        }
                    }
                    break;
                }
                ki.innerShadow(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var7_7, var8_8, v18, (boolean)v19);
                if (!var10_11 && !var10_11) ** break;
                ** continue;
                return;
            }
lbl127:
            // 3 sources

            case 0: {
                var11_10 /* !! */  = (int)at.dftg("dgcr", dfsy(int ), (int)104);
                if (var12_9) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl132:
            // 3 sources

            case 1: {
                do {
                    var11_10 /* !! */  = (int)at.dftg("dgcs", dfsy(int ), (int)105);
                } while (!var12_9);
                throw null;
            }
lbl137:
            // 2 sources

            case 2: {
                do {
                    var11_10 /* !! */  = (int)at.dftg("dgct", dfsy(int ), (int)106);
                } while (!var12_9);
                throw null;
            }
lbl142:
            // 2 sources

            case 3: {
                var11_10 /* !! */  = (int)at.dftg("dgcu", dfsy(int ), (int)107);
                if (var12_9) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl147:
            // 2 sources

            case 4: {
                var11_10 /* !! */  = (int)at.dftg("dgcv", dfsy(int ), (int)108);
                if (var12_9) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl152:
            // 2 sources

            case 5: {
                var11_10 /* !! */  = (int)at.dftg("dgcw", dfsy(int ), (int)109);
                if (var12_9) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_10 /* !! */  = (int)at.dftg("dgcx", dfsy(int ), (int)110);
                    if (!var12_9) ** GOTO lbl137
                    throw null;
                }
            }
lbl162:
            // 3 sources

            case 7: {
                var11_10 /* !! */  = (int)at.dftg("dgcy", dfsy(int ), (int)111);
                if (!var12_9) ** GOTO lbl147
                throw null;
            }
lbl166:
            // 2 sources

            case 8: {
                var11_10 /* !! */  = (int)at.dftg("dgcz", dfsy(int ), (int)112);
                if (!var12_9) ** GOTO lbl127
                throw null;
            }
            case 9: {
                var11_10 /* !! */  = (int)at.dftg("dgda", dfsy(int ), (int)113);
                if (!var12_9) ** GOTO lbl127
                throw null;
            }
            case 10: {
                var11_10 /* !! */  = (int)at.dftg("dgdb", dfsy(int ), (int)114);
                if (!var12_9) ** GOTO lbl162
                throw null;
            }
lbl178:
            // 2 sources

            case 11: {
                var11_10 /* !! */  = (int)at.dftg("dgdc", dfsy(int ), (int)115);
                if (!var12_9) ** GOTO lbl132
                throw null;
            }
lbl182:
            // 3 sources

            case 12: {
                var11_10 /* !! */  = (int)at.dftg("dgdd", dfsy(int ), (int)116);
                if (!var12_9) ** GOTO lbl152
                throw null;
            }
lbl186:
            // 2 sources

            case 13: {
                var11_10 /* !! */  = (int)at.dftg("dgde", dfsy(int ), (int)117);
                if (!var12_9) ** GOTO lbl178
                throw null;
            }
            case 14: {
                var11_10 /* !! */  = (int)at.dftg("dgdf", dfsy(int ), (int)118);
                if (!var12_9) ** GOTO lbl132
                throw null;
            }
            case 15: {
                var11_10 /* !! */  = (int)at.dftg("dgdg", dfsy(int ), (int)119);
                if (!var12_9) ** GOTO lbl186
                throw null;
            }
            case 16: {
                var11_10 /* !! */  = (int)at.dftg("dgdh", dfsy(int ), (int)120);
                if (!var12_9) ** GOTO lbl142
                throw null;
            }
            case 17: 
        }
        var11_10 /* !! */  = (int)at.dftg("dgdi", dfsy(int ), (int)121);
        ** while (!var12_9)
lbl205:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dfxk(int n2) {
        return dfxr[n2] ^ dfxt[n2];
    }

    private static /* synthetic */ void dgfu() {
        at.dftf[0] = -1704921623;
        at.dftf[1] = -1793595878;
        at.dftf[2] = -213817731;
        at.dftf[3] = 1808503913;
        at.dftf[4] = 1514356847;
        at.dftf[5] = -1259401504;
        at.dftf[6] = 2002946725;
        at.dftf[7] = 148485349;
        at.dftf[8] = -1143730684;
        at.dftf[9] = -864953898;
        at.dftf[10] = -1930848770;
        at.dftf[11] = -106234093;
        at.dftf[12] = -1882066201;
        at.dftf[13] = 1224484513;
        at.dftf[14] = 74273213;
        at.dftf[15] = -848425750;
        at.dftf[16] = -1724970677;
        at.dftf[17] = -1898033310;
        at.dftf[18] = 24773318;
        at.dftf[19] = 1394126613;
        at.dftf[20] = 515503196;
        at.dftf[21] = 381225328;
        at.dftf[22] = 1149357646;
        at.dftf[23] = 241049283;
        at.dftf[24] = -1339715708;
        at.dftf[25] = -1008067256;
        at.dftf[26] = -782482238;
        at.dftf[27] = 1962277051;
        at.dftf[28] = -783954455;
        at.dftf[29] = 66595265;
        at.dftf[30] = 762918631;
        at.dftf[31] = -890284622;
        at.dftf[32] = -1229156806;
        at.dftf[33] = -1692735869;
        at.dftf[34] = -1131857599;
        at.dftf[35] = -726887456;
        at.dftf[36] = 1907975851;
        at.dftf[37] = 568367545;
        at.dftf[38] = -249844419;
        at.dftf[39] = -1429687035;
        at.dftf[40] = -1352084704;
        at.dftf[41] = -442473422;
        at.dftf[42] = -246506486;
        at.dftf[43] = 1832418591;
        at.dftf[44] = -40398171;
        at.dftf[45] = -966453147;
        at.dftf[46] = -883726506;
        at.dftf[47] = -818047484;
        at.dftf[48] = 112076434;
        at.dftf[49] = 224133833;
        at.dftf[50] = -1366889573;
        at.dftf[51] = -1053714969;
        at.dftf[52] = -725927965;
        at.dftf[53] = 1149070169;
        at.dftf[54] = 2022768224;
        at.dftf[55] = -1804777066;
        at.dftf[56] = -1960496061;
        at.dftf[57] = 125917605;
        at.dftf[58] = 602906844;
        at.dftf[59] = -1378254252;
        at.dftf[60] = 935149424;
        at.dftf[61] = -56157341;
        at.dftf[62] = -135708897;
        at.dftf[63] = 1526053812;
        at.dftf[64] = 1101810533;
        at.dftf[65] = -1692409501;
        at.dftf[66] = -1690949954;
        at.dftf[67] = -71316601;
        at.dftf[68] = 384014792;
        at.dftf[69] = 402628695;
        at.dftf[70] = 1543279672;
        at.dftf[71] = 2136069152;
        at.dftf[72] = 160228691;
        at.dftf[73] = 1563155440;
        at.dftf[74] = -1786233622;
        at.dftf[75] = 1949136691;
        at.dftf[76] = 1750353809;
        at.dftf[77] = 187300341;
        at.dftf[78] = -1482390912;
        at.dftf[79] = -926244822;
        at.dftf[80] = -832111155;
        at.dftf[81] = 103751519;
        at.dftf[82] = 1548879825;
        at.dftf[83] = 824622020;
        at.dftf[84] = 149797627;
        at.dftf[85] = 1190651505;
        at.dftf[86] = -943737897;
        at.dftf[87] = 1562173964;
        at.dftf[88] = -1661482674;
        at.dftf[89] = 299598400;
        at.dftf[90] = 1984933484;
        at.dftf[91] = 597362736;
        at.dftf[92] = 336112839;
        at.dftf[93] = -1129645678;
        at.dftf[94] = -1357848598;
        at.dftf[95] = -1449244317;
        at.dftf[96] = -124093596;
        at.dftf[97] = 1405407952;
        at.dftf[98] = 32450316;
        at.dftf[99] = -1499965772;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void panel(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = at.hh - at.dftg("dfxu", dfxk(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == at.dftg("dfxv", dfsy(int ), (int)38)) break;
            v0 /* !! */  = (long)at.dftg("dfxw", dfsy(int ), (int)39);
        }
        var10_7 = at.c;
        v1 /* !! */  = at.hh;
        if (true) ** GOTO lbl11
        block56: while (true) {
            v1 /* !! */  = (long)(at.dftg("dfxy", dfxk(int ), (int)2) - at.dftg("dfxx", dfxk(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1698443149: {
                    break block56;
                }
                case 379513867: {
                    continue block56;
                }
            }
            break;
        }
        var9_8 /* !! */  = at.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = at.hh - at.dftg("dfyb", dfxk(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == at.dftg("dfyc", dfsy(int ), (int)40)) break;
            v2 /* !! */  = (long)at.dftg("dfye", dfsy(int ), (int)41);
        }
        var8_9 = at.a;
        if (var10_7) {
            throw null;
lbl25:
            // 9 sources

            return;
        }
        if (var8_9 || var8_9) ** GOTO lbl25
        if (var9_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = at.hh;
                if (true) ** GOTO lbl35
                block59: while (true) {
                    v3 /* !! */  = (long)(v4 - at.dftg("dfyh", dfxk(int ), (int)4));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1698443149: {
                            break block59;
                        }
                        case -1520167438: {
                            v4 = at.dftg("dfyi", dfxk(int ), (int)5);
                            continue block59;
                        }
                        case 129097316: {
                            v4 = at.dftg("dfyj", dfxk(int ), (int)6);
                            continue block59;
                        }
                        case 1912621978: {
                            v4 = at.dftg("dfyn", dfxk(int ), (int)7);
                            continue block59;
                        }
                    }
                    break;
                }
                at.blur(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                if (var8_9 || var8_9) ** GOTO lbl25
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = at.hh - at.dftg("dfyp", dfxk(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == at.dftg("dfyr", dfsy(int ), (int)42)) break;
                    v5 /* !! */  = (long)at.dftg("dfyt", dfsy(int ), (int)43);
                }
                var7_10 = dy.getInstance();
                if (var8_9 || var8_9) ** GOTO lbl25
                if (var7_10 == null) ** GOTO lbl138
                if (var8_9) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = at.hh - at.dftg("dfyu", dfxk(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == at.dftg("dfyv", dfsy(int ), (int)44)) break;
                    v6 /* !! */  = (long)at.dftg("dfyw", dfsy(int ), (int)45);
                }
                if (var7_10.isNewBackground()) ** GOTO lbl138
                if (var8_9 || var8_9) ** GOTO lbl25
                v7 = at.dftg("dfyx", dfsy(int ), (int)46);
                v8 = at.dftg("dfyz", dfsy(int ), (int)47);
                v9 = at.dftg("dfza", dfsy(int ), (int)48);
                v10 = at.dftg("dfzb", dfsy(int ), (int)49);
                v11 /* !! */  = at.hh;
                if (true) ** GOTO lbl73
                block62: while (true) {
                    v11 /* !! */  = (long)(at.dftg("dfzf", dfxk(int ), (int)11) - at.dftg("dfzd", dfxk(int ), (int)10));
lbl73:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1698443149: {
                            break block62;
                        }
                        case -539740627: {
                            continue block62;
                        }
                    }
                    break;
                }
                v12 = nd.rgba((int)v7, (int)v8, (int)v9, (int)v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = at.hh - at.dftg("dfzg", dfxk(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == at.dftg("dfzh", dfsy(int ), (int)50)) break;
                    v13 /* !! */  = (long)at.dftg("dfzi", dfsy(int ), (int)51);
                }
                v14 = nd.multAlpha(v12, var6_6);
                v15 = at.dftg("dfzj", dfsy(int ), (int)52);
                v16 /* !! */  = at.hh;
                if (true) ** GOTO lbl90
                block64: while (true) {
                    v16 /* !! */  = (long)(v17 - at.dftg("dfzk", dfxk(int ), (int)13));
lbl90:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1698443149: {
                            break block64;
                        }
                        case -1220435590: {
                            v17 = at.dftg("dfzl", dfxk(int ), (int)14);
                            continue block64;
                        }
                        case -178129242: {
                            v17 = at.dftg("dfzm", dfxk(int ), (int)15);
                            continue block64;
                        }
                    }
                    break;
                }
                ki.rect(var0, var1_1, var2_2, var3_3, var4_4, var5_5, v14, (boolean)v15);
                if (var8_9 || var8_9) ** GOTO lbl25
                v18 = at.dftg("dfzn", dfsy(int ), (int)53);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = at.hh - at.dftg("dfzo", dfxk(int ), (int)16)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == at.dftg("dfzp", dfsy(int ), (int)54)) break;
                    v19 /* !! */  = (long)at.dftg("dfzq", dfsy(int ), (int)55);
                }
                v20 = dz.color((int)v18);
                v21 /* !! */  = at.hh;
                if (true) ** GOTO lbl112
                block66: while (true) {
                    v21 /* !! */  = (long)(v22 - at.dftg("dfzr", dfxk(int ), (int)17));
lbl112:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1698443149: {
                            break block66;
                        }
                        case -310230296: {
                            v22 = at.dftg("dfzs", dfxk(int ), (int)18);
                            continue block66;
                        }
                        case 200973088: {
                            v22 = at.dftg("dfzt", dfxk(int ), (int)19);
                            continue block66;
                        }
                        case 1014622510: {
                            v22 = at.dftg("dfzu", dfxk(int ), (int)20);
                            continue block66;
                        }
                    }
                    break;
                }
                v23 = nd.multAlpha(v20, var6_6);
                v24 = at.dftg("dfzv", dfsy(int ), (int)56);
                v25 /* !! */  = at.hh;
                if (true) ** GOTO lbl130
                block67: while (true) {
                    v25 /* !! */  = (long)(at.dftg("dfzx", dfxk(int ), (int)22) - at.dftg("dfzw", dfxk(int ), (int)21));
lbl130:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1698443149: {
                            break block67;
                        }
                        case 817201190: {
                            continue block67;
                        }
                    }
                    break;
                }
                ki.rect(var0, var1_1, var2_2, var3_3, var4_4, var5_5, v23, (boolean)v24);
                if (var8_9 || var8_9) ** GOTO lbl25
                return;
lbl138:
                // 2 sources

                if (var8_9 || var8_9) ** GOTO lbl25
                v26 = at.dftg("dfzy", dfsy(int ), (int)57);
                v27 = at.dftg("dfzz", dfsy(int ), (int)58);
                v28 = at.dftg("dgaa", dfsy(int ), (int)59);
                v29 = at.dftg("dgab", dfsy(int ), (int)60);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_6 = at.hh - at.dftg("dgac", dfxk(int ), (int)23)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == at.dftg("dgad", dfsy(int ), (int)61)) break;
                    v30 /* !! */  = (long)at.dftg("dgae", dfsy(int ), (int)62);
                }
                v31 = nd.rgba((int)v26, (int)v27, (int)v28, (int)v29);
                v32 /* !! */  = at.hh;
                if (true) ** GOTO lbl153
                block69: while (true) {
                    v32 /* !! */  = (long)(at.dftg("dgag", dfxk(int ), (int)25) - at.dftg("dgaf", dfxk(int ), (int)24));
lbl153:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1698443149: {
                            break block69;
                        }
                        case 770729985: {
                            continue block69;
                        }
                    }
                    break;
                }
                v33 = nd.multAlpha(v31, var6_6);
                v34 = at.dftg("dgah", dfsy(int ), (int)63);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_7 = at.hh - at.dftg("dgai", dfxk(int ), (int)26)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == at.dftg("dgaj", dfsy(int ), (int)64)) break;
                    v35 /* !! */  = (long)at.dftg("dgak", dfsy(int ), (int)65);
                }
                ki.rect(var0, var1_1, var2_2, var3_3, var4_4, var5_5, v33, (boolean)v34);
                if (!var8_9 && !var8_9) ** break;
                ** continue;
                return;
            }
lbl169:
            // 5 sources

            case 0: {
                var9_8 /* !! */  = (int)at.dftg("dgal", dfsy(int ), (int)66);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 1: {
                var9_8 /* !! */  = (int)at.dftg("dgam", dfsy(int ), (int)67);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl179:
            // 3 sources

            case 2: {
                var9_8 /* !! */  = (int)at.dftg("dgan", dfsy(int ), (int)68);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 3: {
                var9_8 /* !! */  = (int)at.dftg("dgao", dfsy(int ), (int)69);
                if (!var10_7) ** GOTO lbl169
                throw null;
            }
            case 4: {
                var9_8 /* !! */  = (int)at.dftg("dgap", dfsy(int ), (int)70);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 5: {
                var9_8 /* !! */  = (int)at.dftg("dgaq", dfsy(int ), (int)71);
                if (var10_7) {
                    throw null;
                }
            }
lbl197:
            // 4 sources

            case 6: {
                var9_8 /* !! */  = (int)at.dftg("dgar", dfsy(int ), (int)72);
                if (!var10_7) ** GOTO lbl169
                throw null;
            }
lbl201:
            // 2 sources

            case 7: {
                var9_8 /* !! */  = (int)at.dftg("dgas", dfsy(int ), (int)73);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl206:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_8 /* !! */  = (int)at.dftg("dgat", dfsy(int ), (int)74);
                    if (!var10_7) ** GOTO lbl179
                    throw null;
                }
            }
            case 9: {
                var9_8 /* !! */  = (int)at.dftg("dgau", dfsy(int ), (int)75);
                if (!var10_7) ** GOTO lbl169
                throw null;
            }
lbl215:
            // 2 sources

            case 10: {
                var9_8 /* !! */  = (int)at.dftg("dgav", dfsy(int ), (int)76);
                if (!var10_7) ** GOTO lbl179
                throw null;
            }
            case 11: {
                var9_8 /* !! */  = (int)at.dftg("dgaw", dfsy(int ), (int)77);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl224:
            // 2 sources

            case 12: {
                var9_8 /* !! */  = (int)at.dftg("dgax", dfsy(int ), (int)78);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl229:
            // 2 sources

            case 13: {
                var9_8 /* !! */  = (int)at.dftg("dgay", dfsy(int ), (int)79);
                if (var10_7) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl234:
            // 2 sources

            case 14: {
                var9_8 /* !! */  = (int)at.dftg("dgaz", dfsy(int ), (int)80);
                if (!var10_7) ** GOTO lbl215
                throw null;
            }
            case 15: {
                var9_8 /* !! */  = (int)at.dftg("dgba", dfsy(int ), (int)81);
                if (!var10_7) break;
                throw null;
            }
lbl242:
            // 4 sources

            case 16: {
                var9_8 /* !! */  = (int)at.dftg("dgbb", dfsy(int ), (int)82);
                if (!var10_7) ** GOTO lbl206
                throw null;
            }
            case 17: {
                var9_8 /* !! */  = (int)at.dftg("dgbc", dfsy(int ), (int)83);
                if (!var10_7) ** GOTO lbl169
                throw null;
            }
lbl250:
            // 2 sources

            case 18: {
                var9_8 /* !! */  = (int)at.dftg("dgbd", dfsy(int ), (int)84);
                if (!var10_7) ** GOTO lbl201
                throw null;
            }
            case 19: 
        }
        var9_8 /* !! */  = (int)at.dftg("dgbe", dfsy(int ), (int)85);
        ** while (!var10_7)
lbl257:
        // 1 sources

        throw null;
    }
}

