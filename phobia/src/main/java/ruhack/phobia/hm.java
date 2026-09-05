/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import ruhack.phobia.aw;
import ruhack.phobia.bl;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kg;

public class hm
extends ds {
    public static final int b;
    private static long[] cvsd;
    private static final long gn = 4315926380888273922L;
    private static int[] cvro;
    public static final boolean a;
    private static int[] cvrp;
    private static long[] cvsc;
    private final kg yExpandSetting;
    private final kg xzExpandSetting;
    public static final boolean c;

    private static /* synthetic */ void cvvl() {
        hm.cvrp[0] = -1993483298;
        hm.cvrp[1] = 1531409596;
        hm.cvrp[2] = 466063601;
        hm.cvrp[3] = 1039429738;
        hm.cvrp[4] = 324934846;
        hm.cvrp[5] = 409670934;
        hm.cvrp[6] = 757530300;
        hm.cvrp[7] = 1847030957;
        hm.cvrp[8] = 1682218022;
        hm.cvrp[9] = -234993503;
        hm.cvrp[10] = 1926360130;
        hm.cvrp[11] = 1039628556;
        hm.cvrp[12] = -1685040292;
        hm.cvrp[13] = -1470917354;
        hm.cvrp[14] = -922138751;
        hm.cvrp[15] = -1808324287;
        hm.cvrp[16] = 1200914531;
        hm.cvrp[17] = 1985654387;
        hm.cvrp[18] = 475577835;
        hm.cvrp[19] = -922901307;
        hm.cvrp[20] = -1035576095;
        hm.cvrp[21] = -1870595751;
        hm.cvrp[22] = -475231057;
        hm.cvrp[23] = 1832087270;
        hm.cvrp[24] = -1998386574;
        hm.cvrp[25] = 1238658632;
        hm.cvrp[26] = -719519009;
        hm.cvrp[27] = -1300995847;
        hm.cvrp[28] = -923752091;
        hm.cvrp[29] = 1824581194;
        hm.cvrp[30] = -1686142166;
        hm.cvrp[31] = 2137338068;
        hm.cvrp[32] = -1814223635;
        hm.cvrp[33] = -785646992;
        hm.cvrp[34] = 348322168;
        hm.cvrp[35] = -1910576884;
        hm.cvrp[36] = 358952397;
        hm.cvrp[37] = -412279371;
        hm.cvrp[38] = -597288737;
        hm.cvrp[39] = -1931693508;
        hm.cvrp[40] = -1073279334;
        hm.cvrp[41] = 1457341964;
        hm.cvrp[42] = 996420189;
        hm.cvrp[43] = -785610547;
        hm.cvrp[44] = 1474936421;
        hm.cvrp[45] = 1662705238;
        hm.cvrp[46] = 542432684;
        hm.cvrp[47] = 1288030555;
        hm.cvrp[48] = -1534425690;
        hm.cvrp[49] = -1530622234;
        hm.cvrp[50] = -267049656;
        hm.cvrp[51] = 1808148463;
        hm.cvrp[52] = 1440956672;
        hm.cvrp[53] = 420809609;
        hm.cvrp[54] = -1925423228;
        hm.cvrp[55] = 1454830451;
        hm.cvrp[56] = -1573760603;
    }

    public static /* synthetic */ CallSite cvrq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float cvrn(int n2) {
        return Float.intBitsToFloat(cvro[n2] ^ cvrp[n2]);
    }

    private static /* synthetic */ long cvsb(int n2) {
        return cvsc[n2] ^ cvsd[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hm() {
        var2_1 /* !! */  = hm.b;
        super("HitBox", "\u0420\u0430\u0441\u0448\u0438\u0440\u044f\u0435\u0442 \u0445\u0438\u0442\u0431\u043e\u043a\u0441\u044b \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439", du.RAGE);
        this.xzExpandSetting = new kg("\u0420\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u0435 XZ", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0440\u0430\u0441\u0448\u0438\u0440\u0438\u0442\u044c \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u043f\u043e \u043e\u0441\u044f\u043c XZ", (float)hm.cvrq("cvrr", cvrn(int ), (int)0)).range(0.0f, (float)hm.cvrq("cvrs", cvrn(int ), (int)1));
        this.yExpandSetting = new kg("\u0420\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u0435 Y", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0440\u0430\u0441\u0448\u0438\u0440\u0438\u0442\u044c \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u043f\u043e \u043e\u0441\u0438 Y", 0.0f).range(0.0f, (float)hm.cvrq("cvrt", cvrn(int ), (int)2));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.xzExpandSetting, this.yExpandSetting});
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)hm.cvrq("cvrv", cvru(int ), (int)3);
                ** GOTO lbl16
            }
            case 1: {
                var2_1 /* !! */  = (int)hm.cvrq("cvrw", cvru(int ), (int)4);
                ** GOTO lbl23
            }
lbl16:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)hm.cvrq("cvrx", cvru(int ), (int)5);
                break;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hm.cvrq("cvry", cvru(int ), (int)6);
                    ** GOTO lbl10
                    break;
                }
            }
lbl23:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)hm.cvrq("cvrz", cvru(int ), (int)7);
                ** GOTO lbl10
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)hm.cvrq("cvsa", cvru(int ), (int)8);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onBoundingBoxControl(bl var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hm.gn - hm.cvrq("cvse", cvsb(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hm.cvrq("cvsf", cvru(int ), (int)9)) break;
            v0 /* !! */  = (long)hm.cvrq("cvsg", cvru(int ), (int)10);
        }
        var9_2 = hm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hm.gn - hm.cvrq("cvsh", cvsb(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hm.cvrq("cvsi", cvru(int ), (int)11)) break;
            v1 /* !! */  = (long)hm.cvrq("cvsj", cvru(int ), (int)12);
        }
        var8_3 /* !! */  = hm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hm.gn - hm.cvrq("cvsk", cvsb(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hm.cvrq("cvsl", cvru(int ), (int)13)) break;
            v2 /* !! */  = (long)hm.cvrq("cvsm", cvru(int ), (int)14);
        }
        var7_4 = hm.a;
        if (var9_2) {
            throw null;
lbl24:
            // 12 sources

            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl24
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = hm.gn - hm.cvrq("cvsn", cvsb(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hm.cvrq("cvso", cvru(int ), (int)15)) break;
            v3 /* !! */  = (long)hm.cvrq("cvsp", cvru(int ), (int)16);
        }
        var3_5 = var1_1.getEntity();
        if (var7_4) ** GOTO lbl24
        if (!(var3_5 instanceof class_1309)) ** GOTO lbl213
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl24
                var2_6 = (class_1309)var3_5;
                if (var7_4 || var7_4) ** GOTO lbl24
                v4 /* !! */  = hm.gn;
                if (true) ** GOTO lbl46
                block68: while (true) {
                    v4 /* !! */  = (long)(hm.cvrq("cvsr", cvsb(int ), (int)5) - hm.cvrq("cvsq", cvsb(int ), (int)4));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -178875221: {
                            continue block68;
                        }
                        case 966079490: {
                            break block68;
                        }
                    }
                    break;
                }
                var3_5 = var1_1.getBox();
                if (var7_4 || var7_4) ** GOTO lbl24
                v5 /* !! */  = hm.gn;
                if (true) ** GOTO lbl57
                block69: while (true) {
                    v5 /* !! */  = (long)(v6 - hm.cvrq("cvss", cvsb(int ), (int)6));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1435547741: {
                            v6 = hm.cvrq("cvst", cvsb(int ), (int)7);
                            continue block69;
                        }
                        case 817813453: {
                            v6 = hm.cvrq("cvsu", cvsb(int ), (int)8);
                            continue block69;
                        }
                        case 966079490: {
                            break block69;
                        }
                        case 2143046540: {
                            v6 = hm.cvrq("cvsv", cvsb(int ), (int)9);
                            continue block69;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = hm.gn - hm.cvrq("cvsw", cvsb(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == hm.cvrq("cvsx", cvru(int ), (int)17)) break;
                    v7 /* !! */  = (long)hm.cvrq("cvsy", cvru(int ), (int)18);
                }
                var4_7 = this.xzExpandSetting.getValue();
                if (var7_4 || var7_4) ** GOTO lbl24
                v8 /* !! */  = hm.gn;
                if (true) ** GOTO lbl81
                block71: while (true) {
                    v8 /* !! */  = (long)(hm.cvrq("cvta", cvsb(int ), (int)12) - hm.cvrq("cvsz", cvsb(int ), (int)11));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 348842677: {
                            continue block71;
                        }
                        case 966079490: {
                            break block71;
                        }
                    }
                    break;
                }
                v9 /* !! */  = hm.gn;
                if (true) ** GOTO lbl90
                block72: while (true) {
                    v9 /* !! */  = (long)(hm.cvrq("cvtc", cvsb(int ), (int)14) - hm.cvrq("cvtb", cvsb(int ), (int)13));
lbl90:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 966079490: {
                            break block72;
                        }
                        case 1974191155: {
                            continue block72;
                        }
                    }
                    break;
                }
                var5_8 = this.yExpandSetting.getValue();
                if (var7_4 || var7_4) ** GOTO lbl24
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = hm.gn - hm.cvrq("cvtd", cvsb(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hm.cvrq("cvte", cvru(int ), (int)19)) break;
                    v10 /* !! */  = (long)hm.cvrq("cvtf", cvru(int ), (int)20);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = hm.gn - hm.cvrq("cvtg", cvsb(int ), (int)16)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == hm.cvrq("cvth", cvru(int ), (int)21)) break;
                    v11 /* !! */  = (long)hm.cvrq("cvti", cvru(int ), (int)22);
                }
                v12 = var3_5.field_1323 - (double)(var4_7 / 2.0f);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_7 = hm.gn - hm.cvrq("cvtj", cvsb(int ), (int)17)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == hm.cvrq("cvtk", cvru(int ), (int)23)) break;
                    v13 /* !! */  = (long)hm.cvrq("cvtl", cvru(int ), (int)24);
                }
                v14 = var3_5.field_1322 - (double)(var5_8 / 2.0f);
                v15 /* !! */  = hm.gn;
                if (true) ** GOTO lbl121
                block76: while (true) {
                    v15 /* !! */  = (long)(v16 - hm.cvrq("cvtm", cvsb(int ), (int)18));
lbl121:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1655811511: {
                            v16 = hm.cvrq("cvtn", cvsb(int ), (int)19);
                            continue block76;
                        }
                        case -1137998537: {
                            v16 = hm.cvrq("cvto", cvsb(int ), (int)20);
                            continue block76;
                        }
                        case -612943987: {
                            v16 = hm.cvrq("cvtp", cvsb(int ), (int)21);
                            continue block76;
                        }
                        case 966079490: {
                            break block76;
                        }
                    }
                    break;
                }
                v17 = var3_5.field_1321 - (double)(var4_7 / 2.0f);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_8 = hm.gn - hm.cvrq("cvtq", cvsb(int ), (int)22)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 /* !! */  == hm.cvrq("cvtr", cvru(int ), (int)25)) break;
                    v18 /* !! */  = (long)hm.cvrq("cvts", cvru(int ), (int)26);
                }
                v19 = var3_5.field_1320 + (double)(var4_7 / 2.0f);
                v20 /* !! */  = hm.gn;
                if (true) ** GOTO lbl145
                block78: while (true) {
                    v20 /* !! */  = (long)(hm.cvrq("cvtu", cvsb(int ), (int)24) - hm.cvrq("cvtt", cvsb(int ), (int)23));
lbl145:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1534364546: {
                            continue block78;
                        }
                        case 966079490: {
                            break block78;
                        }
                    }
                    break;
                }
                v21 = var3_5.field_1325 + (double)(var5_8 / 2.0f);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_9 = hm.gn - hm.cvrq("cvtv", cvsb(int ), (int)25)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v22 /* !! */  == hm.cvrq("cvtw", cvru(int ), (int)27)) break;
                    v22 /* !! */  = (long)hm.cvrq("cvtx", cvru(int ), (int)28);
                }
                v23 = var3_5.field_1324 + (double)(var4_7 / 2.0f);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_10 = hm.gn - hm.cvrq("cvty", cvsb(int ), (int)26)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v24 /* !! */  == hm.cvrq("cvtz", cvru(int ), (int)29)) break;
                    v24 /* !! */  = (long)hm.cvrq("cvua", cvru(int ), (int)30);
                }
                var6_9 = new class_238(v12, v14, v17, v19, v21, v23);
                if (var7_4 || var7_4) ** GOTO lbl24
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_11 = hm.gn - hm.cvrq("cvub", cvsb(int ), (int)27)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v25 /* !! */  == hm.cvrq("cvuc", cvru(int ), (int)31)) break;
                    v25 /* !! */  = (long)hm.cvrq("cvud", cvru(int ), (int)32);
                }
                v26 /* !! */  = hm.gn;
                if (true) ** GOTO lbl176
                block82: while (true) {
                    v26 /* !! */  = (long)(v27 - hm.cvrq("cvue", cvsb(int ), (int)28));
lbl176:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2133454082: {
                            v27 = hm.cvrq("cvuf", cvsb(int ), (int)29);
                            continue block82;
                        }
                        case -367146719: {
                            v27 = hm.cvrq("cvug", cvsb(int ), (int)30);
                            continue block82;
                        }
                        case 966079490: {
                            break block82;
                        }
                    }
                    break;
                }
                if (var2_6 == hm.mc.field_1724) ** GOTO lbl213
                if (var7_4) ** GOTO lbl24
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_12 = hm.gn - hm.cvrq("cvuh", cvsb(int ), (int)31)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v28 /* !! */  == hm.cvrq("cvui", cvru(int ), (int)33)) break;
                    v28 /* !! */  = (long)hm.cvrq("cvuj", cvru(int ), (int)34);
                }
                if (dl.isFriend((class_1297)var2_6)) ** GOTO lbl213
                if (var7_4 || var7_4) ** GOTO lbl24
                v29 /* !! */  = hm.gn;
                if (true) ** GOTO lbl199
                block84: while (true) {
                    v29 /* !! */  = (long)(v30 - hm.cvrq("cvuk", cvsb(int ), (int)32));
lbl199:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1626771405: {
                            v30 = hm.cvrq("cvul", cvsb(int ), (int)33);
                            continue block84;
                        }
                        case -627696519: {
                            v30 = hm.cvrq("cvum", cvsb(int ), (int)34);
                            continue block84;
                        }
                        case 966079490: {
                            break block84;
                        }
                        case 1903421483: {
                            v30 = hm.cvrq("cvun", cvsb(int ), (int)35);
                            continue block84;
                        }
                    }
                    break;
                }
                var1_1.setBox(var6_9);
                if (var7_4) ** GOTO lbl24
lbl213:
                // 4 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
lbl216:
            // 4 sources

            case 0: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuo", cvru(int ), (int)35);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl221:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)hm.cvrq("cvup", cvru(int ), (int)36);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl226:
            // 2 sources

            case 2: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuq", cvru(int ), (int)37);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 3: {
                var8_3 /* !! */  = (int)hm.cvrq("cvur", cvru(int ), (int)38);
                if (!var9_2) ** GOTO lbl216
                throw null;
            }
lbl235:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)hm.cvrq("cvus", cvru(int ), (int)39);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl240:
            // 3 sources

            case 5: {
                var8_3 /* !! */  = (int)hm.cvrq("cvut", cvru(int ), (int)40);
                if (!var9_2) ** GOTO lbl221
                throw null;
            }
            case 6: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuu", cvru(int ), (int)41);
                if (!var9_2) ** GOTO lbl240
                throw null;
            }
lbl248:
            // 2 sources

            case 7: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuv", cvru(int ), (int)42);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl253:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuw", cvru(int ), (int)43);
                if (!var9_2) ** GOTO lbl240
                throw null;
            }
            case 9: {
                var8_3 /* !! */  = (int)hm.cvrq("cvux", cvru(int ), (int)44);
                if (!var9_2) ** GOTO lbl253
                throw null;
            }
lbl261:
            // 2 sources

            case 10: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuy", cvru(int ), (int)45);
                if (!var9_2) ** GOTO lbl235
                throw null;
            }
            case 11: {
                var8_3 /* !! */  = (int)hm.cvrq("cvuz", cvru(int ), (int)46);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 12: {
                var8_3 /* !! */  = (int)hm.cvrq("cvva", cvru(int ), (int)47);
                if (!var9_2) ** GOTO lbl226
                throw null;
            }
lbl274:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)hm.cvrq("cvvb", cvru(int ), (int)48);
                if (!var9_2) ** GOTO lbl216
                throw null;
            }
            case 14: {
                var8_3 /* !! */  = (int)hm.cvrq("cvvc", cvru(int ), (int)49);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl283:
            // 2 sources

            case 15: {
                var8_3 /* !! */  = (int)hm.cvrq("cvvd", cvru(int ), (int)50);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 16: {
                var8_3 /* !! */  = (int)hm.cvrq("cvve", cvru(int ), (int)51);
                if (var9_2) {
                    throw null;
                }
            }
lbl292:
            // 5 sources

            case 17: {
                var8_3 /* !! */  = (int)hm.cvrq("cvvf", cvru(int ), (int)52);
                if (!var9_2) ** GOTO lbl248
                throw null;
            }
lbl296:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)hm.cvrq("cvvg", cvru(int ), (int)53);
                    if (!var9_2) ** GOTO lbl216
                    throw null;
                }
            }
lbl301:
            // 3 sources

            case 19: {
                var8_3 /* !! */  = (int)hm.cvrq("cvvh", cvru(int ), (int)54);
                if (var9_2) {
                    throw null;
                }
            }
            case 20: {
                do {
                    var8_3 /* !! */  = (int)hm.cvrq("cvvi", cvru(int ), (int)55);
                } while (!var9_2);
                throw null;
            }
            case 21: 
        }
        var8_3 /* !! */  = (int)hm.cvrq("cvvj", cvru(int ), (int)56);
        ** while (!var9_2)
lbl313:
        // 1 sources

        throw null;
    }

    static {
        cvro = new int[57];
        cvrp = new int[57];
        hm.cvvk();
        hm.cvvl();
        cvsc = new long[36];
        cvsd = new long[36];
        hm.cvvm();
        hm.cvvn();
    }

    private static /* synthetic */ void cvvm() {
        hm.cvsc[0] = 3727775419750568693L;
        hm.cvsc[1] = -6511086029649720474L;
        hm.cvsc[2] = -984995758856835812L;
        hm.cvsc[3] = 7252190961446540800L;
        hm.cvsc[4] = -7232923861517457385L;
        hm.cvsc[5] = 4677931419733860896L;
        hm.cvsc[6] = 2808426085238532477L;
        hm.cvsc[7] = -44469531317783778L;
        hm.cvsc[8] = 3404162033877038221L;
        hm.cvsc[9] = 254407443374015721L;
        hm.cvsc[10] = -6276899812122441971L;
        hm.cvsc[11] = -5223644413101034849L;
        hm.cvsc[12] = -2709388247078456747L;
        hm.cvsc[13] = 5902536427325243401L;
        hm.cvsc[14] = 4987217654506121870L;
        hm.cvsc[15] = -4616547126682684511L;
        hm.cvsc[16] = 6513624299922133130L;
        hm.cvsc[17] = 4735903997116263744L;
        hm.cvsc[18] = -2407830460878211251L;
        hm.cvsc[19] = -7566738374240633372L;
        hm.cvsc[20] = -2989654870385332460L;
        hm.cvsc[21] = 2234782496229767409L;
        hm.cvsc[22] = -3447636947260298821L;
        hm.cvsc[23] = -9094787176083540694L;
        hm.cvsc[24] = 4149464693202013357L;
        hm.cvsc[25] = 4998255970123702432L;
        hm.cvsc[26] = 4068009533116071510L;
        hm.cvsc[27] = -3709344803753248574L;
        hm.cvsc[28] = -818597593188416286L;
        hm.cvsc[29] = 3180656447877302469L;
        hm.cvsc[30] = -392269559967816582L;
        hm.cvsc[31] = -1086923211541728326L;
        hm.cvsc[32] = -9101793883332245662L;
        hm.cvsc[33] = -3386801190891176719L;
        hm.cvsc[34] = 6210220278357893056L;
        hm.cvsc[35] = 1797592472908206547L;
    }

    private static /* synthetic */ void cvvn() {
        hm.cvsd[0] = -5490460180473006423L;
        hm.cvsd[1] = 3538476127351858746L;
        hm.cvsd[2] = 8477381765154458074L;
        hm.cvsd[3] = -2602144005869810910L;
        hm.cvsd[4] = -6712004636603138217L;
        hm.cvsd[5] = -4351333116478241919L;
        hm.cvsd[6] = -8455806252085999049L;
        hm.cvsd[7] = 1767894989274926725L;
        hm.cvsd[8] = -6137400619342386956L;
        hm.cvsd[9] = -6305324672743046164L;
        hm.cvsd[10] = -1541619660852926080L;
        hm.cvsd[11] = 2859965268636324363L;
        hm.cvsd[12] = 6402519846330985361L;
        hm.cvsd[13] = 210955084592544969L;
        hm.cvsd[14] = -1808574076379997144L;
        hm.cvsd[15] = 912436625070353400L;
        hm.cvsd[16] = 700895452798458401L;
        hm.cvsd[17] = -4659335655245395299L;
        hm.cvsd[18] = -1384621306088792486L;
        hm.cvsd[19] = 8516193378215092568L;
        hm.cvsd[20] = 3959698623399473375L;
        hm.cvsd[21] = 2401973939393714048L;
        hm.cvsd[22] = 57899955048857997L;
        hm.cvsd[23] = -4180783943233753817L;
        hm.cvsd[24] = 6291670844980873319L;
        hm.cvsd[25] = 2820689180808559507L;
        hm.cvsd[26] = -6651376782052719135L;
        hm.cvsd[27] = -52177982002530164L;
        hm.cvsd[28] = -6593403862771386880L;
        hm.cvsd[29] = 2527699127287635951L;
        hm.cvsd[30] = 7379165903648922972L;
        hm.cvsd[31] = -3428328587080600096L;
        hm.cvsd[32] = 8707608109900630401L;
        hm.cvsd[33] = -7130682167871988695L;
        hm.cvsd[34] = 8221167000653526410L;
        hm.cvsd[35] = -5306974110706374205L;
    }

    private static /* synthetic */ int cvru(int n2) {
        return cvro[n2] ^ cvrp[n2];
    }

    private static /* synthetic */ void cvvk() {
        hm.cvro[0] = -1218373869;
        hm.cvro[1] = 453473468;
        hm.cvro[2] = 1535611121;
        hm.cvro[3] = 1039429736;
        hm.cvro[4] = 324934846;
        hm.cvro[5] = 409670935;
        hm.cvro[6] = 757530297;
        hm.cvro[7] = 1847030953;
        hm.cvro[8] = 1682218018;
        hm.cvro[9] = -234993504;
        hm.cvro[10] = -514263187;
        hm.cvro[11] = 1039628557;
        hm.cvro[12] = 1660644149;
        hm.cvro[13] = -1470917353;
        hm.cvro[14] = -457120334;
        hm.cvro[15] = -1808324288;
        hm.cvro[16] = -1631051747;
        hm.cvro[17] = -1985654388;
        hm.cvro[18] = -1376554675;
        hm.cvro[19] = -922901308;
        hm.cvro[20] = -672477723;
        hm.cvro[21] = 1870595750;
        hm.cvro[22] = -1089614810;
        hm.cvro[23] = 1832087271;
        hm.cvro[24] = 1209382758;
        hm.cvro[25] = 1238658633;
        hm.cvro[26] = 1347007468;
        hm.cvro[27] = 1300995846;
        hm.cvro[28] = -966942415;
        hm.cvro[29] = 1824581195;
        hm.cvro[30] = 283639889;
        hm.cvro[31] = 2137338069;
        hm.cvro[32] = 1318661374;
        hm.cvro[33] = -785646991;
        hm.cvro[34] = -1419978852;
        hm.cvro[35] = -1910576867;
        hm.cvro[36] = 358952385;
        hm.cvro[37] = -412279362;
        hm.cvro[38] = -597288750;
        hm.cvro[39] = -1931693507;
        hm.cvro[40] = -1073279351;
        hm.cvro[41] = 1457341963;
        hm.cvro[42] = 996420169;
        hm.cvro[43] = -785610530;
        hm.cvro[44] = 1474936432;
        hm.cvro[45] = 1662705237;
        hm.cvro[46] = 542432682;
        hm.cvro[47] = 1288030544;
        hm.cvro[48] = -1534425686;
        hm.cvro[49] = -1530622233;
        hm.cvro[50] = -267049658;
        hm.cvro[51] = 1808148451;
        hm.cvro[52] = 1440956688;
        hm.cvro[53] = 420809607;
        hm.cvro[54] = -1925423210;
        hm.cvro[55] = 1454830451;
        hm.cvro[56] = -1573760606;
    }
}

