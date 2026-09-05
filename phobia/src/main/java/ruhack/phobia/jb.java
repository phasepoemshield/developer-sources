/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import ruhack.phobia.aw;
import ruhack.phobia.dj;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.ls;
import ruhack.phobia.lv;
import ruhack.phobia.nd;
import ruhack.phobia.nj;

public class jb
extends ds {
    private static final String DASHED = "\u041f\u0443\u043d\u043a\u0442\u0438\u0440";
    private final kb fill;
    private static long[] alkx;
    private static final double DASH_GAP = 0.08;
    public static final boolean a;
    private static final String LINE = "\u041b\u0438\u043d\u0438\u044f";
    private static final double DASH_LENGTH = 0.12;
    private final kf mode;
    public static final int b;
    private static int[] aljw;
    private static final double CORNER_PART = 0.24;
    private final kb throughWalls;
    private static int[] aljv;
    public static final boolean c;
    private static final String CORNERS = "\u0423\u0433\u043b\u044b";
    private static final long cd = 7004037310882466712L;
    private final kb self;
    private static long[] alkz;

    private static /* synthetic */ void amjl() {
        jb.aljw[100] = -1253327038;
        jb.aljw[101] = 2094294524;
        jb.aljw[102] = 1620017071;
        jb.aljw[103] = 1746067102;
        jb.aljw[104] = 1094221383;
        jb.aljw[105] = -559504620;
        jb.aljw[106] = 1284613521;
        jb.aljw[107] = 678462578;
        jb.aljw[108] = -1412820773;
        jb.aljw[109] = -1637580849;
        jb.aljw[110] = 1138108763;
        jb.aljw[111] = -1362132955;
        jb.aljw[112] = 2124589339;
        jb.aljw[113] = -1263846024;
        jb.aljw[114] = -879346088;
        jb.aljw[115] = 3611255;
        jb.aljw[116] = -1174256602;
        jb.aljw[117] = -2122736349;
        jb.aljw[118] = 1147658150;
        jb.aljw[119] = 1730041047;
        jb.aljw[120] = -635374750;
        jb.aljw[121] = 72259525;
        jb.aljw[122] = -770980128;
        jb.aljw[123] = 594991407;
        jb.aljw[124] = -1528849549;
        jb.aljw[125] = -232418264;
        jb.aljw[126] = -1746454613;
        jb.aljw[127] = -1316120206;
        jb.aljw[128] = 1251234816;
        jb.aljw[129] = -884404395;
        jb.aljw[130] = -866624077;
        jb.aljw[131] = -1459824797;
        jb.aljw[132] = 155808622;
        jb.aljw[133] = 2020814448;
        jb.aljw[134] = 798489425;
        jb.aljw[135] = 943898966;
        jb.aljw[136] = 410106874;
        jb.aljw[137] = -989735571;
        jb.aljw[138] = 1657639256;
        jb.aljw[139] = 303219178;
        jb.aljw[140] = -1969965240;
        jb.aljw[141] = -908370037;
        jb.aljw[142] = 2062059333;
        jb.aljw[143] = 903501350;
        jb.aljw[144] = -1841486768;
        jb.aljw[145] = -942280816;
        jb.aljw[146] = 1918186568;
        jb.aljw[147] = -1828708462;
        jb.aljw[148] = -1381863209;
        jb.aljw[149] = 1652934885;
        jb.aljw[150] = -62885279;
        jb.aljw[151] = -1050044476;
        jb.aljw[152] = -203204094;
        jb.aljw[153] = 1004635123;
        jb.aljw[154] = -667713744;
        jb.aljw[155] = -611863464;
        jb.aljw[156] = -1891462935;
        jb.aljw[157] = -1353805727;
        jb.aljw[158] = 1487797986;
        jb.aljw[159] = -1457142238;
        jb.aljw[160] = 92523378;
        jb.aljw[161] = 1680009808;
        jb.aljw[162] = 1708918866;
        jb.aljw[163] = 1426521992;
        jb.aljw[164] = -48733329;
        jb.aljw[165] = 1262990474;
        jb.aljw[166] = -121561514;
        jb.aljw[167] = 732173636;
        jb.aljw[168] = -16981489;
        jb.aljw[169] = 1556599017;
        jb.aljw[170] = 571009622;
        jb.aljw[171] = 1645979496;
        jb.aljw[172] = 1897877142;
        jb.aljw[173] = -972743943;
        jb.aljw[174] = -795833315;
        jb.aljw[175] = 1808905890;
        jb.aljw[176] = 1632580688;
        jb.aljw[177] = 204744924;
        jb.aljw[178] = 966038259;
        jb.aljw[179] = -1707431487;
        jb.aljw[180] = -2091674685;
        jb.aljw[181] = 1717089902;
        jb.aljw[182] = -291703829;
        jb.aljw[183] = 1595058040;
        jb.aljw[184] = -707644637;
        jb.aljw[185] = -1996808536;
        jb.aljw[186] = 1157730680;
        jb.aljw[187] = -972404640;
        jb.aljw[188] = 745996810;
        jb.aljw[189] = -562985143;
        jb.aljw[190] = 2104961094;
        jb.aljw[191] = 335406403;
        jb.aljw[192] = -914258840;
        jb.aljw[193] = 656253618;
        jb.aljw[194] = -1414891031;
        jb.aljw[195] = 1622398262;
        jb.aljw[196] = -1968289564;
        jb.aljw[197] = -230468346;
        jb.aljw[198] = 231087078;
        jb.aljw[199] = -164279764;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_238 interpolatedHitbox(class_1657 var1_1, float var2_2) {
        v0 /* !! */  = jb.cd;
        block39: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 315508258: {
                    v0 /* !! */  = (long)(jb.aljx("alwq", alkw(int ), (int)30) - jb.aljx("alwp", alkw(int ), (int)29));
                    continue block39;
                }
                case 1153125272: {
                    break block39;
                }
            }
            break;
        }
        var6_3 = jb.c;
        v1 /* !! */  = jb.cd;
        if (true) ** GOTO lbl14
        block40: while (true) {
            v1 /* !! */  = (long)(v2 - jb.aljx("alwr", alkw(int ), (int)31));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1586877891: {
                    v2 = jb.aljx("alws", alkw(int ), (int)32);
                    continue block40;
                }
                case 1041790007: {
                    v2 = jb.aljx("alwt", alkw(int ), (int)33);
                    continue block40;
                }
                case 1153125272: {
                    break block40;
                }
            }
            break;
        }
        var5_4 /* !! */  = jb.b;
        v3 /* !! */  = jb.cd;
        if (true) ** GOTO lbl28
        block41: while (true) {
            v3 /* !! */  = (long)(v4 - jb.aljx("alwu", alkw(int ), (int)34));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1149413977: {
                    v4 = jb.aljx("alwy", alkw(int ), (int)35);
                    continue block41;
                }
                case -575827737: {
                    v4 = jb.aljx("alwz", alkw(int ), (int)36);
                    continue block41;
                }
                case 1153125272: {
                    break block41;
                }
                case 2053693961: {
                    v4 = jb.aljx("alxb", alkw(int ), (int)37);
                    continue block41;
                }
            }
            break;
        }
        var4_5 = jb.a;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block42: while (true) {
            block58: {
                switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_3) {
                            throw null;
                        }
                        if (var4_5 != false) return null;
                        if (var4_5 != false) return null;
                        v5 /* !! */  = jb.cd;
                        block43: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1920083686: {
                                    v6 = jb.aljx("alxe", alkw(int ), (int)39);
                                    ** GOTO lbl60
                                }
                                case 1153125272: {
                                    break block43;
                                }
                                case 1386856192: {
                                    v6 = jb.aljx("alxg", alkw(int ), (int)40);
lbl60:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - jb.aljx("alxd", alkw(int ), (int)38));
                                    continue block43;
                                }
                            }
                            break;
                        }
                        var3_6 = var1_1.method_30950(var2_2);
                        if (var4_5 != false) return null;
                        if (var4_5 != false) return null;
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_1 = jb.cd - jb.aljx("alxj", alkw(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v7 /* !! */  != jb.aljx("alxl", alju(int ), (int)144)) ** GOTO lbl72
                            v8 = var1_1.method_5829();
                            v9 /* !! */  = jb.cd;
                            if (true) ** GOTO lbl97
lbl72:
                            // 1 sources

                            v7 /* !! */  = (long)jb.aljx("alxm", alju(int ), (int)145);
                        }
                    }
                    case 1: {
                        var5_4 /* !! */  = (int)jb.aljx("alyi", alju(int ), (int)149);
                        cfr_temp_0 = 0;
                        if (var6_3) {
                            throw null;
                        }
                        break block58;
                    }
                    case 2: {
                        ** GOTO lbl86
                    }
                    case 5: {
                        var5_4 /* !! */  = (int)jb.aljx("alyp", alju(int ), (int)153);
                        if (var6_3) {
                            throw null;
                        }
lbl86:
                        // 3 sources

                        var5_4 /* !! */  = (int)jb.aljx("alyk", alju(int ), (int)150);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 4: {
                        var5_4 /* !! */  = (int)jb.aljx("alyn", alju(int ), (int)152);
                        cfr_temp_0 = 3;
                        if (var6_3) {
                            throw null;
                        }
                        break block58;
                    }
                    block45: while (true) {
                        v9 /* !! */  = (long)(v10 - jb.aljx("alxn", alkw(int ), (int)42));
lbl97:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -2139570358: {
                                v10 = jb.aljx("alxp", alkw(int ), (int)43);
                                continue block45;
                            }
                            case -388301401: {
                                v10 = jb.aljx("alxr", alkw(int ), (int)44);
                                continue block45;
                            }
                            case -80299434: {
                                v10 = jb.aljx("alxs", alkw(int ), (int)45);
                                continue block45;
                            }
                            case 1153125272: {
                                break block45;
                            }
                        }
                        break;
                    }
                    v11 = var1_1.method_73189();
                    v12 /* !! */  = jb.cd;
                    if (true) ** GOTO lbl114
                    block46: while (true) {
                        v12 /* !! */  = (long)(v13 - jb.aljx("alxw", alkw(int ), (int)46));
lbl114:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case 934142146: {
                                v13 = jb.aljx("alxx", alkw(int ), (int)47);
                                continue block46;
                            }
                            case 1153125272: {
                                break block46;
                            }
                            case 2143515897: {
                                v13 = jb.aljx("alxy", alkw(int ), (int)48);
                                continue block46;
                            }
                        }
                        break;
                    }
                    v14 = var3_6.method_1020(v11);
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_2 = jb.cd - jb.aljx("alxz", alkw(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v15 /* !! */  == jb.aljx("alya", alju(int ), (int)146)) {
                            return v8.method_997(v14);
                        }
                        v15 /* !! */  = (long)jb.aljx("alyb", alju(int ), (int)147);
                    }
                    case 0: {
                        var5_4 /* !! */  = (int)jb.aljx("alyg", alju(int ), (int)148);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl140
            }
            do {
                if (true) continue block42;
lbl140:
                // 2 sources

                var5_4 /* !! */  = (int)jb.aljx("alym", alju(int ), (int)151);
                cfr_temp_0 = 0;
            } while (!var6_3);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block163: {
            block162: {
                block161: {
                    var21_2 = jb.c;
                    var20_3 /* !! */  = jb.b;
                    var19_4 = jb.a;
                    if (var21_2) {
                        throw null;
lbl6:
                        // 43 sources

                        return;
                    }
                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (jb.mc.field_1724 == null) break block161;
                    if (var19_4) ** GOTO lbl6
                    if (jb.mc.field_1687 != null) break block162;
                    if (var19_4) ** GOTO lbl6
                }
                if (var19_4 || var19_4) ** GOTO lbl6
                return;
            }
            if (var19_4 || var19_4) ** GOTO lbl6
            var2_5 = this.fill.isValue();
            if (var19_4 || var19_4) ** GOTO lbl6
            var3_6 = this.throughWalls.isValue();
            if (var19_4 || var19_4) ** GOTO lbl6
            var4_7 = this.mode.isSelected("\u0423\u0433\u043b\u044b");
            if (var19_4 || var19_4) ** GOTO lbl6
            var5_8 = this.mode.isSelected("\u041f\u0443\u043d\u043a\u0442\u0438\u0440");
            if (var19_4 || var19_4) ** GOTO lbl6
            var6_9 = nd.getClientColor();
            if (var19_4 || var19_4) ** GOTO lbl6
            var7_10 = 1.0f;
            if (var19_4 || var19_4) ** GOTO lbl6
            var8_11 = jb.aljx("almp", alju(int ), (int)19);
            if (var19_4 || var19_4) ** GOTO lbl6
            var9_12 = 1.0f;
            if (var19_4 || var19_4) ** GOTO lbl6
            var10_13 = lv.getCameraPos();
            if (var19_4 || var19_4) ** GOTO lbl6
            if (!var2_5) break block163;
            if (var19_4 || var19_4) ** GOTO lbl6
            ls.begin(var3_6);
            if (var19_4) ** GOTO lbl6
        }
        if (var19_4 || var19_4) ** GOTO lbl6
        lv.begin(var3_6);
        if (var19_4 || var19_4) ** GOTO lbl6
        var11_14 = jb.mc.field_1687.method_18456().iterator();
        if (var19_4) ** GOTO lbl6
        block84: while (true) lbl-1000:
        // 3 sources

        {
            block164: {
                if (var19_4 || var19_4) ** GOTO lbl6
                if (!var11_14.hasNext()) ** GOTO lbl96
                if (var19_4) ** GOTO lbl6
                var12_15 = (class_1657)var11_14.next();
                if (var19_4 || var19_4) ** GOTO lbl6
                if (this.shouldRender(var12_15)) break block164;
                if (var19_4) ** GOTO lbl6
                if (!var21_2) ** GOTO lbl-1000
                throw null;
            }
            if (var19_4 || var19_4) ** GOTO lbl6
            var13_16 = this.interpolatedHitbox(var12_15, var1_1.getPartialTicks());
            if (var19_4 || var19_4) ** GOTO lbl6
            if (var20_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var20_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var14_17 = dl.isFriend((class_1297)var12_15);
                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (!var14_17) ** GOTO lbl71
                    if (var19_4) ** GOTO lbl6
                    v0 /* !! */  = var8_11;
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl73
lbl71:
                    // 1 sources

                    if (var19_4 || var19_4) ** GOTO lbl6
                    v0 /* !! */  = var15_18 /* !! */  = (CallSite)var6_9;
lbl73:
                    // 2 sources

                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (!var14_17) ** GOTO lbl80
                    if (var19_4) ** GOTO lbl6
                    v1 = var9_12;
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl82
lbl80:
                    // 1 sources

                    if (var19_4 || var19_4) ** GOTO lbl6
                    v1 = var16_19 = var7_10;
lbl82:
                    // 2 sources

                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (!var2_5) ** GOTO lbl91
                    if (var19_4 || var19_4) ** GOTO lbl6
                    var17_20 = var16_19;
                    if (var19_4 || var19_4) ** GOTO lbl6
                    var18_21 = var17_20 * jb.aljx("almy", almx(int ), (int)20);
                    if (var19_4 || var19_4) ** GOTO lbl6
                    ls.gradientBox(var13_16, (int)var15_18 /* !! */ , var17_20, var18_21);
                    if (var19_4) ** GOTO lbl6
lbl91:
                    // 2 sources

                    if (var19_4 || var19_4) ** GOTO lbl6
                    this.drawHitbox(var13_16, var10_13, (int)var15_18 /* !! */ , var16_19, var4_7, var5_8);
                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (!var21_2) continue block84;
                    throw null;
                }
lbl96:
                // 1 sources

                if (var19_4 || var19_4) ** GOTO lbl6
                if (!var2_5) ** GOTO lbl101
                if (var19_4 || var19_4) ** GOTO lbl6
                ls.end();
                if (var19_4) ** GOTO lbl6
lbl101:
                // 2 sources

                if (var19_4 || var19_4) ** GOTO lbl6
                lv.end();
                if (!var19_4 && !var19_4) ** break;
                ** continue;
                return;
lbl106:
                // 2 sources

                case 0: {
                    var20_3 /* !! */  = (int)jb.aljx("alne", alju(int ), (int)21);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
                case 1: {
                    var20_3 /* !! */  = (int)jb.aljx("alnf", alju(int ), (int)22);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl350
                }
lbl116:
                // 2 sources

                case 2: {
                    var20_3 /* !! */  = (int)jb.aljx("alnh", alju(int ), (int)23);
                    if (var21_2) {
                        throw null;
                    }
                }
lbl120:
                // 4 sources

                case 3: {
                    var20_3 /* !! */  = (int)jb.aljx("alnj", alju(int ), (int)24);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl402
                }
lbl125:
                // 2 sources

                case 4: {
                    var20_3 /* !! */  = (int)jb.aljx("alnl", alju(int ), (int)25);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl447
                }
lbl130:
                // 2 sources

                case 5: {
                    var20_3 /* !! */  = (int)jb.aljx("alnn", alju(int ), (int)26);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl135:
                // 2 sources

                case 6: {
                    var20_3 /* !! */  = (int)jb.aljx("alnp", alju(int ), (int)27);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
lbl140:
                // 5 sources

                case 7: {
                    var20_3 /* !! */  = (int)jb.aljx("alnq", alju(int ), (int)28);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl402
                }
                case 8: {
                    var20_3 /* !! */  = (int)jb.aljx("alnr", alju(int ), (int)29);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
                case 9: {
                    var20_3 /* !! */  = (int)jb.aljx("alnv", alju(int ), (int)30);
                    if (var21_2) {
                        throw null;
                    }
                }
lbl154:
                // 4 sources

                case 10: {
                    var20_3 /* !! */  = (int)jb.aljx("alnw", alju(int ), (int)31);
                    if (!var21_2) ** GOTO lbl140
                    throw null;
                }
lbl158:
                // 3 sources

                case 11: {
                    var20_3 /* !! */  = (int)jb.aljx("alny", alju(int ), (int)32);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl341
                }
                case 12: {
                    var20_3 /* !! */  = (int)jb.aljx("aloa", alju(int ), (int)33);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl337
                }
lbl168:
                // 2 sources

                case 13: {
                    var20_3 /* !! */  = (int)jb.aljx("alob", alju(int ), (int)34);
                    if (!var21_2) ** GOTO lbl116
                    throw null;
                }
lbl172:
                // 2 sources

                case 14: {
                    var20_3 /* !! */  = (int)jb.aljx("alod", alju(int ), (int)35);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl377
                }
lbl177:
                // 2 sources

                case 15: {
                    var20_3 /* !! */  = (int)jb.aljx("alol", alju(int ), (int)36);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl359
                }
lbl182:
                // 2 sources

                case 16: {
                    var20_3 /* !! */  = (int)jb.aljx("alom", alju(int ), (int)37);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl350
                }
                case 17: {
                    var20_3 /* !! */  = (int)jb.aljx("aloo", alju(int ), (int)38);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl398
                }
                case 18: {
                    var20_3 /* !! */  = (int)jb.aljx("alor", alju(int ), (int)39);
                    if (!var21_2) ** GOTO lbl135
                    throw null;
                }
lbl196:
                // 2 sources

                case 19: {
                    var20_3 /* !! */  = (int)jb.aljx("alot", alju(int ), (int)40);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
lbl201:
                // 4 sources

                case 20: {
                    var20_3 /* !! */  = (int)jb.aljx("alow", alju(int ), (int)41);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
lbl206:
                // 2 sources

                case 21: {
                    var20_3 /* !! */  = (int)jb.aljx("aloy", alju(int ), (int)42);
                    if (!var21_2) ** GOTO lbl201
                    throw null;
                }
                case 22: {
                    var20_3 /* !! */  = (int)jb.aljx("aloz", alju(int ), (int)43);
                    if (!var21_2) ** GOTO lbl154
                    throw null;
                }
                case 23: {
                    var20_3 /* !! */  = (int)jb.aljx("alpb", alju(int ), (int)44);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl354
                }
lbl219:
                // 2 sources

                case 24: {
                    var20_3 /* !! */  = (int)jb.aljx("alpc", alju(int ), (int)45);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl402
                }
                case 25: {
                    var20_3 /* !! */  = (int)jb.aljx("alpd", alju(int ), (int)46);
                    if (!var21_2) ** GOTO lbl168
                    throw null;
                }
lbl228:
                // 2 sources

                case 26: {
                    var20_3 /* !! */  = (int)jb.aljx("alpf", alju(int ), (int)47);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl381
                }
lbl233:
                // 2 sources

                case 27: {
                    var20_3 /* !! */  = (int)jb.aljx("alpg", alju(int ), (int)48);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl238:
                // 3 sources

                case 28: {
                    var20_3 /* !! */  = (int)jb.aljx("alph", alju(int ), (int)49);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl389
                }
lbl243:
                // 2 sources

                case 29: {
                    var20_3 /* !! */  = (int)jb.aljx("alpi", alju(int ), (int)50);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl443
                }
lbl248:
                // 3 sources

                case 30: {
                    var20_3 /* !! */  = (int)jb.aljx("alpj", alju(int ), (int)51);
                    if (!var21_2) ** GOTO lbl140
                    throw null;
                }
                case 31: {
                    var20_3 /* !! */  = (int)jb.aljx("alpk", alju(int ), (int)52);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl262
                }
lbl257:
                // 2 sources

                case 32: {
                    var20_3 /* !! */  = (int)jb.aljx("alpl", alju(int ), (int)53);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl394
                }
lbl262:
                // 2 sources

                case 33: {
                    var20_3 /* !! */  = (int)jb.aljx("alpm", alju(int ), (int)54);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl328
                }
lbl267:
                // 3 sources

                case 34: {
                    var20_3 /* !! */  = (int)jb.aljx("alpn", alju(int ), (int)55);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
lbl272:
                // 3 sources

                case 35: {
                    var20_3 /* !! */  = (int)jb.aljx("alpp", alju(int ), (int)56);
                    if (!var21_2) ** GOTO lbl172
                    throw null;
                }
lbl276:
                // 3 sources

                case 36: {
                    var20_3 /* !! */  = (int)jb.aljx("alpr", alju(int ), (int)57);
                    if (!var21_2) ** GOTO lbl125
                    throw null;
                }
lbl280:
                // 2 sources

                case 37: {
                    var20_3 /* !! */  = (int)jb.aljx("alps", alju(int ), (int)58);
                    if (!var21_2) ** GOTO lbl238
                    throw null;
                }
                case 38: {
                    var20_3 /* !! */  = (int)jb.aljx("alpt", alju(int ), (int)59);
                    if (!var21_2) ** GOTO lbl219
                    throw null;
                }
                case 39: {
                    var20_3 /* !! */  = (int)jb.aljx("alpv", alju(int ), (int)60);
                    if (!var21_2) ** GOTO lbl158
                    throw null;
                }
lbl292:
                // 2 sources

                case 40: {
                    var20_3 /* !! */  = (int)jb.aljx("alpw", alju(int ), (int)61);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl451
                }
lbl297:
                // 3 sources

                case 41: {
                    var20_3 /* !! */  = (int)jb.aljx("alpy", alju(int ), (int)62);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
                case 42: {
                    var20_3 /* !! */  = (int)jb.aljx("alqa", alju(int ), (int)63);
                    if (!var21_2) ** GOTO lbl106
                    throw null;
                }
lbl306:
                // 2 sources

                case 43: {
                    var20_3 /* !! */  = (int)jb.aljx("alqc", alju(int ), (int)64);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl385
                }
lbl311:
                // 3 sources

                case 44: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var20_3 /* !! */  = (int)jb.aljx("alqd", alju(int ), (int)65);
                        if (!var21_2) ** GOTO lbl292
                        throw null;
                    }
                }
                case 45: {
                    var20_3 /* !! */  = (int)jb.aljx("alqe", alju(int ), (int)66);
                    if (!var21_2) ** GOTO lbl311
                    throw null;
                }
                case 46: {
                    var20_3 /* !! */  = (int)jb.aljx("alqf", alju(int ), (int)67);
                    if (!var21_2) ** GOTO lbl297
                    throw null;
                }
                case 47: {
                    var20_3 /* !! */  = (int)jb.aljx("alqg", alju(int ), (int)68);
                    if (!var21_2) ** GOTO lbl248
                    throw null;
                }
lbl328:
                // 2 sources

                case 48: {
                    var20_3 /* !! */  = (int)jb.aljx("alqh", alju(int ), (int)69);
                    if (!var21_2) ** GOTO lbl140
                    throw null;
                }
lbl332:
                // 2 sources

                case 49: {
                    var20_3 /* !! */  = (int)jb.aljx("alqj", alju(int ), (int)70);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl389
                }
lbl337:
                // 2 sources

                case 50: {
                    var20_3 /* !! */  = (int)jb.aljx("alql", alju(int ), (int)71);
                    if (!var21_2) ** GOTO lbl306
                    throw null;
                }
lbl341:
                // 2 sources

                case 51: {
                    var20_3 /* !! */  = (int)jb.aljx("alqm", alju(int ), (int)72);
                    if (!var21_2) ** GOTO lbl272
                    throw null;
                }
lbl345:
                // 2 sources

                case 52: {
                    var20_3 /* !! */  = (int)jb.aljx("alqo", alju(int ), (int)73);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl435
                }
lbl350:
                // 4 sources

                case 53: {
                    var20_3 /* !! */  = (int)jb.aljx("alqp", alju(int ), (int)74);
                    if (!var21_2) ** GOTO lbl257
                    throw null;
                }
lbl354:
                // 2 sources

                case 54: {
                    var20_3 /* !! */  = (int)jb.aljx("alqq", alju(int ), (int)75);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl402
                }
lbl359:
                // 4 sources

                case 55: {
                    var20_3 /* !! */  = (int)jb.aljx("alqs", alju(int ), (int)76);
                    if (!var21_2) ** GOTO lbl196
                    throw null;
                }
lbl363:
                // 2 sources

                case 56: {
                    var20_3 /* !! */  = (int)jb.aljx("alqt", alju(int ), (int)77);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl447
                }
                case 57: {
                    var20_3 /* !! */  = (int)jb.aljx("alqu", alju(int ), (int)78);
                    if (!var21_2) ** GOTO lbl206
                    throw null;
                }
                case 58: {
                    var20_3 /* !! */  = (int)jb.aljx("alqv", alju(int ), (int)79);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
lbl377:
                // 2 sources

                case 59: {
                    var20_3 /* !! */  = (int)jb.aljx("alqw", alju(int ), (int)80);
                    if (!var21_2) ** GOTO lbl248
                    throw null;
                }
lbl381:
                // 2 sources

                case 60: {
                    var20_3 /* !! */  = (int)jb.aljx("alqx", alju(int ), (int)81);
                    if (!var21_2) ** GOTO lbl280
                    throw null;
                }
lbl385:
                // 2 sources

                case 61: {
                    var20_3 /* !! */  = (int)jb.aljx("alqy", alju(int ), (int)82);
                    if (!var21_2) ** GOTO lbl233
                    throw null;
                }
lbl389:
                // 3 sources

                case 62: {
                    var20_3 /* !! */  = (int)jb.aljx("alra", alju(int ), (int)83);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl418
                }
lbl394:
                // 2 sources

                case 63: {
                    var20_3 /* !! */  = (int)jb.aljx("alrb", alju(int ), (int)84);
                    if (!var21_2) ** GOTO lbl359
                    throw null;
                }
lbl398:
                // 2 sources

                case 64: {
                    var20_3 /* !! */  = (int)jb.aljx("alrd", alju(int ), (int)85);
                    if (!var21_2) ** GOTO lbl359
                    throw null;
                }
lbl402:
                // 5 sources

                case 65: {
                    var20_3 /* !! */  = (int)jb.aljx("alre", alju(int ), (int)86);
                    if (!var21_2) ** GOTO lbl140
                    throw null;
                }
                case 66: {
                    var20_3 /* !! */  = (int)jb.aljx("alrf", alju(int ), (int)87);
                    if (!var21_2) ** GOTO lbl332
                    throw null;
                }
                case 67: {
                    var20_3 /* !! */  = (int)jb.aljx("alrg", alju(int ), (int)88);
                    if (!var21_2) ** GOTO lbl297
                    throw null;
                }
lbl414:
                // 3 sources

                case 68: {
                    var20_3 /* !! */  = (int)jb.aljx("alrh", alju(int ), (int)89);
                    if (!var21_2) ** GOTO lbl201
                    throw null;
                }
lbl418:
                // 2 sources

                case 69: {
                    var20_3 /* !! */  = (int)jb.aljx("alri", alju(int ), (int)90);
                    if (!var21_2) ** GOTO lbl276
                    throw null;
                }
                case 70: {
                    var20_3 /* !! */  = (int)jb.aljx("alrj", alju(int ), (int)91);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl443
                }
                case 71: {
                    var20_3 /* !! */  = (int)jb.aljx("alrl", alju(int ), (int)92);
                    if (!var21_2) ** GOTO lbl177
                    throw null;
                }
                case 72: {
                    var20_3 /* !! */  = (int)jb.aljx("alrm", alju(int ), (int)93);
                    if (!var21_2) ** GOTO lbl130
                    throw null;
                }
lbl435:
                // 2 sources

                case 73: {
                    var20_3 /* !! */  = (int)jb.aljx("alrn", alju(int ), (int)94);
                    if (!var21_2) ** GOTO lbl201
                    throw null;
                }
                case 74: {
                    var20_3 /* !! */  = (int)jb.aljx("alro", alju(int ), (int)95);
                    if (!var21_2) ** GOTO lbl182
                    throw null;
                }
lbl443:
                // 3 sources

                case 75: {
                    var20_3 /* !! */  = (int)jb.aljx("alrp", alju(int ), (int)96);
                    if (!var21_2) ** GOTO lbl363
                    throw null;
                }
lbl447:
                // 3 sources

                case 76: {
                    var20_3 /* !! */  = (int)jb.aljx("alrq", alju(int ), (int)97);
                    if (!var21_2) ** GOTO lbl120
                    throw null;
                }
lbl451:
                // 2 sources

                case 77: {
                    var20_3 /* !! */  = (int)jb.aljx("alrr", alju(int ), (int)98);
                    if (!var21_2) ** GOTO lbl345
                    throw null;
                }
                case 78: {
                    var20_3 /* !! */  = (int)jb.aljx("alrt", alju(int ), (int)99);
                    if (!var21_2) ** GOTO lbl350
                    throw null;
                }
                case 79: {
                    var20_3 /* !! */  = (int)jb.aljx("alru", alju(int ), (int)100);
                    if (!var21_2) ** GOTO lbl267
                    throw null;
                }
                case 80: 
            }
            break;
        }
        var20_3 /* !! */  = (int)jb.aljx("alrv", alju(int ), (int)101);
        ** while (!var21_2)
lbl466:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void amjj() {
        jb.aljv[200] = 1823616955;
        jb.aljv[201] = -2074533418;
        jb.aljv[202] = -1563564806;
        jb.aljv[203] = -642289316;
        jb.aljv[204] = 1064190205;
        jb.aljv[205] = 798289185;
        jb.aljv[206] = 1964546985;
        jb.aljv[207] = -1531533147;
        jb.aljv[208] = -680518572;
        jb.aljv[209] = 1406198768;
        jb.aljv[210] = 1103168492;
        jb.aljv[211] = 141184679;
        jb.aljv[212] = -817741098;
        jb.aljv[213] = -2090251863;
        jb.aljv[214] = -1076291001;
        jb.aljv[215] = 1151753908;
        jb.aljv[216] = -1081075592;
        jb.aljv[217] = 322369568;
        jb.aljv[218] = -217490934;
        jb.aljv[219] = -871642264;
        jb.aljv[220] = -627114313;
        jb.aljv[221] = -1621056452;
        jb.aljv[222] = -155195307;
        jb.aljv[223] = 269395962;
        jb.aljv[224] = 300587278;
        jb.aljv[225] = 1493240939;
        jb.aljv[226] = 159186852;
        jb.aljv[227] = -713628360;
        jb.aljv[228] = -1541164388;
        jb.aljv[229] = -1344375117;
        jb.aljv[230] = -87348361;
        jb.aljv[231] = 1359521950;
        jb.aljv[232] = 1372877982;
        jb.aljv[233] = -1202577362;
        jb.aljv[234] = -1605949469;
        jb.aljv[235] = 726498682;
        jb.aljv[236] = 199485030;
        jb.aljv[237] = 1044677215;
        jb.aljv[238] = -1207665266;
        jb.aljv[239] = -1438127946;
        jb.aljv[240] = -1805785501;
        jb.aljv[241] = -1525836580;
        jb.aljv[242] = 232335168;
        jb.aljv[243] = -1536221542;
        jb.aljv[244] = -1903946501;
        jb.aljv[245] = -1847008743;
        jb.aljv[246] = 409161306;
        jb.aljv[247] = 424367661;
        jb.aljv[248] = -2029948502;
        jb.aljv[249] = 1316087275;
        jb.aljv[250] = 574470412;
        jb.aljv[251] = -26320614;
        jb.aljv[252] = 1390956236;
        jb.aljv[253] = 1108803320;
        jb.aljv[254] = 2036871355;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawHitbox(class_238 var1_1, class_243 var2_2, int var3_3, float var4_4, boolean var5_5, boolean var6_6) {
        var21_7 = jb.c;
        var20_8 /* !! */  = jb.b;
        var19_9 = jb.a;
        if (var21_7) {
            throw null;
lbl6:
            // 19 sources

            return;
        }
        if (var19_9 || var19_9) ** GOTO lbl6
        var7_10 = var1_1.field_1323 - var2_2.field_1352;
        if (var19_9 || var19_9) ** GOTO lbl6
        var9_11 = var1_1.field_1322 - var2_2.field_1351;
        if (var19_9 || var19_9) ** GOTO lbl6
        var11_12 = var1_1.field_1321 - var2_2.field_1350;
        if (var19_9 || var19_9) ** GOTO lbl6
        var13_13 = var1_1.field_1320 - var2_2.field_1352;
        if (var20_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_9 || var19_9) ** GOTO lbl6
                var15_14 = var1_1.field_1325 - var2_2.field_1351;
                if (var19_9 || var19_9) ** GOTO lbl6
                var17_15 = var1_1.field_1324 - var2_2.field_1350;
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var7_10, var9_11, var11_12, var13_13, var9_11, var11_12, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var13_13, var9_11, var11_12, var13_13, var9_11, var17_15, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var13_13, var9_11, var17_15, var7_10, var9_11, var17_15, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var7_10, var9_11, var17_15, var7_10, var9_11, var11_12, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var7_10, var15_14, var11_12, var13_13, var15_14, var11_12, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var13_13, var15_14, var11_12, var13_13, var15_14, var17_15, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var13_13, var15_14, var17_15, var7_10, var15_14, var17_15, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var7_10, var15_14, var17_15, var7_10, var15_14, var11_12, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var7_10, var9_11, var11_12, var7_10, var15_14, var11_12, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var13_13, var9_11, var11_12, var13_13, var15_14, var11_12, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var13_13, var9_11, var17_15, var13_13, var15_14, var17_15, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** GOTO lbl6
                this.drawEdge(var7_10, var9_11, var17_15, var7_10, var15_14, var17_15, var3_3, var4_4, var5_5, var6_6);
                if (var19_9 || var19_9) ** continue;
                return;
            }
lbl49:
            // 2 sources

            case 0: {
                var20_8 /* !! */  = (int)jb.aljx("alzd", alju(int ), (int)154);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl54:
            // 2 sources

            case 1: {
                var20_8 /* !! */  = (int)jb.aljx("alze", alju(int ), (int)155);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl59:
            // 2 sources

            case 2: {
                var20_8 /* !! */  = (int)jb.aljx("alzf", alju(int ), (int)156);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 3: {
                var20_8 /* !! */  = (int)jb.aljx("alzg", alju(int ), (int)157);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl69:
            // 2 sources

            case 4: {
                var20_8 /* !! */  = (int)jb.aljx("alzk", alju(int ), (int)158);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl74:
            // 2 sources

            case 5: {
                var20_8 /* !! */  = (int)jb.aljx("alzm", alju(int ), (int)159);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl79:
            // 2 sources

            case 6: {
                var20_8 /* !! */  = (int)jb.aljx("alzn", alju(int ), (int)160);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl84:
            // 3 sources

            case 7: {
                var20_8 /* !! */  = (int)jb.aljx("alzo", alju(int ), (int)161);
                if (var21_7) {
                    throw null;
                }
            }
lbl88:
            // 4 sources

            case 8: {
                var20_8 /* !! */  = (int)jb.aljx("alzr", alju(int ), (int)162);
                if (!var21_7) ** GOTO lbl84
                throw null;
            }
            case 9: {
                var20_8 /* !! */  = (int)jb.aljx("alzt", alju(int ), (int)163);
                if (!var21_7) ** GOTO lbl88
                throw null;
            }
            case 10: {
                var20_8 /* !! */  = (int)jb.aljx("alzv", alju(int ), (int)164);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 11: {
                var20_8 /* !! */  = (int)jb.aljx("alzw", alju(int ), (int)165);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl106:
            // 2 sources

            case 12: {
                var20_8 /* !! */  = (int)jb.aljx("alzy", alju(int ), (int)166);
                if (!var21_7) ** GOTO lbl54
                throw null;
            }
lbl110:
            // 3 sources

            case 13: {
                var20_8 /* !! */  = (int)jb.aljx("alzz", alju(int ), (int)167);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 14: {
                var20_8 /* !! */  = (int)jb.aljx("amab", alju(int ), (int)168);
                if (!var21_7) ** GOTO lbl74
                throw null;
            }
            case 15: {
                var20_8 /* !! */  = (int)jb.aljx("amad", alju(int ), (int)169);
                if (var21_7) {
                    throw null;
                }
            }
            case 16: {
                var20_8 /* !! */  = (int)jb.aljx("amaf", alju(int ), (int)170);
                if (!var21_7) ** GOTO lbl110
                throw null;
            }
lbl127:
            // 2 sources

            case 17: {
                var20_8 /* !! */  = (int)jb.aljx("amah", alju(int ), (int)171);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl132:
            // 5 sources

            case 18: {
                var20_8 /* !! */  = (int)jb.aljx("amai", alju(int ), (int)172);
                if (!var21_7) ** GOTO lbl49
                throw null;
            }
lbl136:
            // 2 sources

            case 19: {
                var20_8 /* !! */  = (int)jb.aljx("amak", alju(int ), (int)173);
                if (!var21_7) ** GOTO lbl132
                throw null;
            }
lbl140:
            // 2 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_8 /* !! */  = (int)jb.aljx("amam", alju(int ), (int)174);
                    if (var21_7) {
                        throw null;
                    }
                    ** GOTO lbl184
                    break;
                }
            }
lbl146:
            // 2 sources

            case 21: {
                var20_8 /* !! */  = (int)jb.aljx("aman", alju(int ), (int)175);
                if (!var21_7) ** GOTO lbl127
                throw null;
            }
lbl150:
            // 2 sources

            case 22: {
                var20_8 /* !! */  = (int)jb.aljx("amar", alju(int ), (int)176);
                if (!var21_7) ** GOTO lbl132
                throw null;
            }
lbl154:
            // 5 sources

            case 23: {
                var20_8 /* !! */  = (int)jb.aljx("amas", alju(int ), (int)177);
                if (!var21_7) ** GOTO lbl84
                throw null;
            }
            case 24: {
                var20_8 /* !! */  = (int)jb.aljx("amat", alju(int ), (int)178);
                if (!var21_7) ** GOTO lbl154
                throw null;
            }
            case 25: {
                var20_8 /* !! */  = (int)jb.aljx("amav", alju(int ), (int)179);
                if (!var21_7) ** GOTO lbl150
                throw null;
            }
lbl166:
            // 2 sources

            case 26: {
                var20_8 /* !! */  = (int)jb.aljx("amaw", alju(int ), (int)180);
                if (!var21_7) ** GOTO lbl154
                throw null;
            }
lbl170:
            // 2 sources

            case 27: {
                var20_8 /* !! */  = (int)jb.aljx("amax", alju(int ), (int)181);
                if (!var21_7) ** GOTO lbl69
                throw null;
            }
lbl174:
            // 2 sources

            case 28: {
                var20_8 /* !! */  = (int)jb.aljx("amay", alju(int ), (int)182);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl179:
            // 2 sources

            case 29: {
                var20_8 /* !! */  = (int)jb.aljx("amba", alju(int ), (int)183);
                if (var21_7) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl184:
            // 3 sources

            case 30: {
                var20_8 /* !! */  = (int)jb.aljx("ambc", alju(int ), (int)184);
                if (!var21_7) ** GOTO lbl59
                throw null;
            }
            case 31: {
                var20_8 /* !! */  = (int)jb.aljx("ambd", alju(int ), (int)185);
                if (!var21_7) ** GOTO lbl132
                throw null;
            }
            case 32: {
                var20_8 /* !! */  = (int)jb.aljx("ambe", alju(int ), (int)186);
                if (!var21_7) ** GOTO lbl140
                throw null;
            }
lbl196:
            // 2 sources

            case 33: {
                var20_8 /* !! */  = (int)jb.aljx("ambg", alju(int ), (int)187);
                if (!var21_7) ** GOTO lbl106
                throw null;
            }
lbl200:
            // 2 sources

            case 34: {
                var20_8 /* !! */  = (int)jb.aljx("ambi", alju(int ), (int)188);
                if (!var21_7) ** GOTO lbl136
                throw null;
            }
lbl204:
            // 3 sources

            case 35: {
                var20_8 /* !! */  = (int)jb.aljx("ambj", alju(int ), (int)189);
                if (!var21_7) ** GOTO lbl170
                throw null;
            }
lbl208:
            // 2 sources

            case 36: {
                var20_8 /* !! */  = (int)jb.aljx("ambp", alju(int ), (int)190);
                if (!var21_7) ** GOTO lbl154
                throw null;
            }
            case 37: {
                var20_8 /* !! */  = (int)jb.aljx("ambq", alju(int ), (int)191);
                if (!var21_7) ** GOTO lbl204
                throw null;
            }
lbl216:
            // 2 sources

            case 38: {
                var20_8 /* !! */  = (int)jb.aljx("ambt", alju(int ), (int)192);
                if (!var21_7) ** GOTO lbl154
                throw null;
            }
            case 39: 
        }
        var20_8 /* !! */  = (int)jb.aljx("ambx", alju(int ), (int)193);
        ** while (!var21_7)
lbl223:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawLine(double var1_1, double var3_2, double var5_3, double var7_4, double var9_5, double var11_6, int var13_7, float var14_8) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jb.cd - jb.aljx("amgj", alkw(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jb.aljx("amgk", alju(int ), (int)245)) break;
            v0 /* !! */  = (long)jb.aljx("amgl", alju(int ), (int)246);
        }
        var17_9 = jb.c;
        v1 /* !! */  = jb.cd;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(jb.aljx("amgn", alkw(int ), (int)62) - jb.aljx("amgm", alkw(int ), (int)61));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 63756674: {
                    continue block19;
                }
                case 1153125272: {
                    break block19;
                }
            }
            break;
        }
        var16_10 /* !! */  = jb.b;
        v2 /* !! */  = jb.cd;
        if (true) ** GOTO lbl21
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - jb.aljx("amgo", alkw(int ), (int)63));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1942817353: {
                    v3 = jb.aljx("amgp", alkw(int ), (int)64);
                    continue block20;
                }
                case -1327831402: {
                    v3 = jb.aljx("amgs", alkw(int ), (int)65);
                    continue block20;
                }
                case 147847991: {
                    v3 = jb.aljx("amgu", alkw(int ), (int)66);
                    continue block20;
                }
                case 1153125272: {
                    break block20;
                }
            }
            break;
        }
        var15_11 = jb.a;
        if (var17_9) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var15_11 || var15_11) ** GOTO lbl36
        v4 = (float)var1_1;
        v5 = (float)var3_2;
        v6 = (float)var5_3;
        v7 = (float)var7_4;
        v8 = (float)var9_5;
        v9 = (float)var11_6;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = jb.cd - jb.aljx("amgw", alkw(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == jb.aljx("amgx", alju(int ), (int)247)) break;
            v10 /* !! */  = (long)jb.aljx("amgy", alju(int ), (int)248);
        }
        lv.line(v4, v5, v6, v7, v8, v9, var13_7, var14_8);
        if (var15_11) ** GOTO lbl36
        if (var16_10 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var16_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var15_11) ** break;
                ** continue;
                return;
            }
lbl58:
            // 4 sources

            case 0: {
                var16_10 /* !! */  = (int)jb.aljx("amgz", alju(int ), (int)249);
                if (!var17_9) break;
                throw null;
            }
            case 1: {
                var16_10 /* !! */  = (int)jb.aljx("amha", alju(int ), (int)250);
                if (!var17_9) ** GOTO lbl58
                throw null;
            }
            case 2: {
                var16_10 /* !! */  = (int)jb.aljx("amhc", alju(int ), (int)251);
                if (!var17_9) ** GOTO lbl58
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_10 /* !! */  = (int)jb.aljx("amhe", alju(int ), (int)252);
                    if (!var17_9) break block10;
                    throw null;
                }
            }
            case 4: {
                var16_10 /* !! */  = (int)jb.aljx("amhg", alju(int ), (int)253);
                if (!var17_9) ** GOTO lbl58
                throw null;
            }
            case 5: 
        }
        var16_10 /* !! */  = (int)jb.aljx("amhi", alju(int ), (int)254);
        ** while (!var17_9)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long alkw(int n2) {
        return alkx[n2] ^ alkz[n2];
    }

    private static /* synthetic */ void amjk() {
        jb.aljw[0] = -2002332523;
        jb.aljw[1] = -1957216229;
        jb.aljw[2] = 34510073;
        jb.aljw[3] = -1429423250;
        jb.aljw[4] = 826761806;
        jb.aljw[5] = -770368137;
        jb.aljw[6] = 725064153;
        jb.aljw[7] = -460249012;
        jb.aljw[8] = -401509691;
        jb.aljw[9] = 318156303;
        jb.aljw[10] = -1283332849;
        jb.aljw[11] = -411539844;
        jb.aljw[12] = 1574450634;
        jb.aljw[13] = -1149288753;
        jb.aljw[14] = 1088900905;
        jb.aljw[15] = -1867737133;
        jb.aljw[16] = 169989095;
        jb.aljw[17] = -756597994;
        jb.aljw[18] = -1444544598;
        jb.aljw[19] = -1714140786;
        jb.aljw[20] = 1069214476;
        jb.aljw[21] = -324380763;
        jb.aljw[22] = 1947819890;
        jb.aljw[23] = 950558161;
        jb.aljw[24] = 1322457839;
        jb.aljw[25] = -1371518822;
        jb.aljw[26] = -1553957567;
        jb.aljw[27] = -2138548231;
        jb.aljw[28] = -945130568;
        jb.aljw[29] = 221316158;
        jb.aljw[30] = 1277108999;
        jb.aljw[31] = 1416408792;
        jb.aljw[32] = 62503239;
        jb.aljw[33] = -128249936;
        jb.aljw[34] = -1372074052;
        jb.aljw[35] = -1589992449;
        jb.aljw[36] = -1183046881;
        jb.aljw[37] = 339702212;
        jb.aljw[38] = 1070266992;
        jb.aljw[39] = -169358528;
        jb.aljw[40] = 352364450;
        jb.aljw[41] = 643788840;
        jb.aljw[42] = 826208929;
        jb.aljw[43] = 1943012974;
        jb.aljw[44] = 1567114878;
        jb.aljw[45] = 1037466312;
        jb.aljw[46] = -1200295476;
        jb.aljw[47] = 243857766;
        jb.aljw[48] = -2015754649;
        jb.aljw[49] = 1964829043;
        jb.aljw[50] = -1840958906;
        jb.aljw[51] = 229259859;
        jb.aljw[52] = -875783674;
        jb.aljw[53] = -393842754;
        jb.aljw[54] = 547692363;
        jb.aljw[55] = -592330196;
        jb.aljw[56] = -1777278928;
        jb.aljw[57] = -388404440;
        jb.aljw[58] = 645395031;
        jb.aljw[59] = 1369465217;
        jb.aljw[60] = -955796645;
        jb.aljw[61] = -1484099714;
        jb.aljw[62] = -1053077068;
        jb.aljw[63] = -1704837769;
        jb.aljw[64] = 1612758093;
        jb.aljw[65] = 1559868801;
        jb.aljw[66] = 432456788;
        jb.aljw[67] = 533960977;
        jb.aljw[68] = -60343275;
        jb.aljw[69] = -557428795;
        jb.aljw[70] = -1586622752;
        jb.aljw[71] = -1821217104;
        jb.aljw[72] = 851247423;
        jb.aljw[73] = -1893381669;
        jb.aljw[74] = 759418384;
        jb.aljw[75] = 2127666652;
        jb.aljw[76] = 1303575618;
        jb.aljw[77] = -1402399310;
        jb.aljw[78] = 255517245;
        jb.aljw[79] = -2115325628;
        jb.aljw[80] = 1341269821;
        jb.aljw[81] = 600304442;
        jb.aljw[82] = 1908047923;
        jb.aljw[83] = -1279819517;
        jb.aljw[84] = -1407273758;
        jb.aljw[85] = -633995703;
        jb.aljw[86] = -819856564;
        jb.aljw[87] = -1890765532;
        jb.aljw[88] = 1196079794;
        jb.aljw[89] = -1139626302;
        jb.aljw[90] = -789144391;
        jb.aljw[91] = -2092536728;
        jb.aljw[92] = -1666397590;
        jb.aljw[93] = 246814451;
        jb.aljw[94] = 860298274;
        jb.aljw[95] = -1578988730;
        jb.aljw[96] = 732049085;
        jb.aljw[97] = 1474206783;
        jb.aljw[98] = 1299549554;
        jb.aljw[99] = 1646032690;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawEdge(double var1_2, double var3_3, double var5_4, double var7_5, double var9_6, double var11_7, int var13_8, float var14_9, boolean var15_10, boolean var16_1) {
        block94: {
            block93: {
                var37_11 = jb.c;
                var36_12 /* !! */  = jb.b;
                var35_13 = jb.a;
                if (var37_11) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var35_13 || var35_13) ** GOTO lbl6
                var17_14 = var7_5 - var1_2;
                if (var35_13 || var35_13) ** GOTO lbl6
                var19_15 = var9_6 - var3_3;
                if (var35_13 || var35_13) ** GOTO lbl6
                var21_16 = var11_7 - var5_4;
                if (var35_13 || var35_13) ** GOTO lbl6
                if (!var15_10) break block93;
                if (var35_13 || var35_13) ** GOTO lbl6
                this.drawLine(var1_2, var3_3, var5_4, var1_2 + var17_14 * jb.aljx("amck", amce(int ), (int)50), var3_3 + var19_15 * jb.aljx("amcl", amce(int ), (int)51), var5_4 + var21_16 * jb.aljx("amcn", amce(int ), (int)52), var13_8, var14_9);
                if (var35_13 || var35_13) ** GOTO lbl6
                this.drawLine(var1_2 + var17_14 * jb.aljx("amcp", amce(int ), (int)53), var3_3 + var19_15 * jb.aljx("amcq", amce(int ), (int)54), var5_4 + var21_16 * jb.aljx("amcr", amce(int ), (int)55), var7_5, var9_6, var11_7, var13_8, var14_9);
                if (var35_13 || var35_13) ** GOTO lbl6
                return;
            }
            if (var35_13 || var35_13) ** GOTO lbl6
            if (var16_1) break block94;
            if (var35_13 || var35_13) ** GOTO lbl6
            this.drawLine(var1_2, var3_3, var5_4, var7_5, var9_6, var11_7, var13_8, var14_9);
            if (var35_13 || var35_13) ** GOTO lbl6
            return;
        }
        if (var35_13 || var35_13) ** GOTO lbl6
        var23_17 = Math.sqrt(var17_14 * var17_14 + var19_15 * var19_15 + var21_16 * var21_16);
        if (var35_13 || var35_13) ** GOTO lbl6
        var25_18 = Math.max((int)jb.aljx("amcw", alju(int ), (int)194), (int)Math.round((var23_17 + jb.aljx("amcy", amce(int ), (int)56)) / jb.aljx("amcz", amce(int ), (int)57)));
        if (var35_13 || var35_13) ** GOTO lbl6
        var26_19 = (var23_17 - jb.aljx("amda", amce(int ), (int)58) * (double)(var25_18 - jb.aljx("amdb", alju(int ), (int)195))) / (double)var25_18;
        if (var35_13 || var35_13) ** GOTO lbl6
        if (var36_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var36_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var28_20 = jb.aljx("amdd", alju(int ), (int)196);
                if (var35_13) ** GOTO lbl6
                do {
                    if (var35_13 || var35_13) ** GOTO lbl6
                    if (var28_20 >= var25_18) ** GOTO lbl58
                    if (var35_13 || var35_13) ** GOTO lbl6
                    var29_22 = (double)var28_20 * (var26_19 + jb.aljx("amdf", amce(int ), (int)59));
                    if (var35_13 || var35_13) ** GOTO lbl6
                    var31_23 = var29_22 / var23_17;
                    if (var35_13 || var35_13) ** GOTO lbl6
                    var33_21 = (var29_22 + var26_19) / var23_17;
                    if (var35_13 || var35_13) ** GOTO lbl6
                    this.drawLine(var1_2 + var17_14 * var31_23, var3_3 + var19_15 * var31_23, var5_4 + var21_16 * var31_23, var1_2 + var17_14 * var33_21, var3_3 + var19_15 * var33_21, var5_4 + var21_16 * var33_21, var13_8, var14_9);
                    if (var35_13 || var35_13) ** GOTO lbl6
                    ++var28_20;
                    if (var35_13) ** GOTO lbl6
                } while (!var37_11);
                throw null;
lbl58:
                // 1 sources

                if (!var35_13 && !var35_13) ** break;
                ** continue;
                return;
            }
lbl61:
            // 2 sources

            case 0: {
                var36_12 /* !! */  = (int)jb.aljx("amdn", alju(int ), (int)197);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 1: {
                var36_12 /* !! */  = (int)jb.aljx("amdo", alju(int ), (int)198);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl71:
            // 2 sources

            case 2: {
                var36_12 /* !! */  = (int)jb.aljx("amdp", alju(int ), (int)199);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl76:
            // 2 sources

            case 3: {
                var36_12 /* !! */  = (int)jb.aljx("amdq", alju(int ), (int)200);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl81:
            // 4 sources

            case 4: {
                var36_12 /* !! */  = (int)jb.aljx("amdr", alju(int ), (int)201);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl86:
            // 3 sources

            case 5: {
                var36_12 /* !! */  = (int)jb.aljx("amds", alju(int ), (int)202);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl91:
            // 2 sources

            case 6: {
                var36_12 /* !! */  = (int)jb.aljx("amdu", alju(int ), (int)203);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl96:
            // 2 sources

            case 7: {
                var36_12 /* !! */  = (int)jb.aljx("amdv", alju(int ), (int)204);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl101:
            // 3 sources

            case 8: {
                var36_12 /* !! */  = (int)jb.aljx("amdx", alju(int ), (int)205);
                if (!var37_11) break;
                throw null;
            }
lbl105:
            // 2 sources

            case 9: {
                var36_12 /* !! */  = (int)jb.aljx("amdz", alju(int ), (int)206);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl110:
            // 2 sources

            case 10: {
                var36_12 /* !! */  = (int)jb.aljx("amea", alju(int ), (int)207);
                if (!var37_11) ** GOTO lbl96
                throw null;
            }
            case 11: {
                var36_12 /* !! */  = (int)jb.aljx("amec", alju(int ), (int)208);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl119:
            // 3 sources

            case 12: {
                var36_12 /* !! */  = (int)jb.aljx("amed", alju(int ), (int)209);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 13: {
                var36_12 /* !! */  = (int)jb.aljx("amee", alju(int ), (int)210);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 14: {
                var36_12 /* !! */  = (int)jb.aljx("amef", alju(int ), (int)211);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl134:
            // 2 sources

            case 15: {
                var36_12 /* !! */  = (int)jb.aljx("ameg", alju(int ), (int)212);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 16: {
                var36_12 /* !! */  = (int)jb.aljx("ameh", alju(int ), (int)213);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl144:
            // 2 sources

            case 17: {
                var36_12 /* !! */  = (int)jb.aljx("amei", alju(int ), (int)214);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl149:
            // 2 sources

            case 18: {
                var36_12 /* !! */  = (int)jb.aljx("amej", alju(int ), (int)215);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl154:
            // 2 sources

            case 19: {
                var36_12 /* !! */  = (int)jb.aljx("amek", alju(int ), (int)216);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 20: {
                var36_12 /* !! */  = (int)jb.aljx("amel", alju(int ), (int)217);
                if (!var37_11) ** GOTO lbl81
                throw null;
            }
lbl163:
            // 3 sources

            case 21: {
                var36_12 /* !! */  = (int)jb.aljx("amem", alju(int ), (int)218);
                if (!var37_11) break;
                throw null;
            }
lbl167:
            // 3 sources

            case 22: {
                var36_12 /* !! */  = (int)jb.aljx("amen", alju(int ), (int)219);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl172:
            // 3 sources

            case 23: {
                var36_12 /* !! */  = (int)jb.aljx("ameo", alju(int ), (int)220);
                if (!var37_11) ** GOTO lbl105
                throw null;
            }
lbl176:
            // 2 sources

            case 24: {
                var36_12 /* !! */  = (int)jb.aljx("amep", alju(int ), (int)221);
                if (!var37_11) ** GOTO lbl86
                throw null;
            }
            case 25: {
                var36_12 /* !! */  = (int)jb.aljx("ameq", alju(int ), (int)222);
                if (!var37_11) ** GOTO lbl119
                throw null;
            }
lbl184:
            // 2 sources

            case 26: {
                var36_12 /* !! */  = (int)jb.aljx("ames", alju(int ), (int)223);
                if (!var37_11) ** GOTO lbl101
                throw null;
            }
lbl188:
            // 3 sources

            case 27: {
                var36_12 /* !! */  = (int)jb.aljx("ameu", alju(int ), (int)224);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 28: {
                var36_12 /* !! */  = (int)jb.aljx("amev", alju(int ), (int)225);
                if (!var37_11) ** GOTO lbl144
                throw null;
            }
            case 29: {
                var36_12 /* !! */  = (int)jb.aljx("amex", alju(int ), (int)226);
                if (!var37_11) ** GOTO lbl184
                throw null;
            }
lbl201:
            // 3 sources

            case 30: {
                var36_12 /* !! */  = (int)jb.aljx("amey", alju(int ), (int)227);
                if (!var37_11) ** GOTO lbl154
                throw null;
            }
            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var36_12 /* !! */  = (int)jb.aljx("amez", alju(int ), (int)228);
                    if (!var37_11) ** GOTO lbl76
                    throw null;
                }
            }
            case 32: {
                var36_12 /* !! */  = (int)jb.aljx("amfb", alju(int ), (int)229);
                if (!var37_11) ** GOTO lbl81
                throw null;
            }
            case 33: {
                var36_12 /* !! */  = (int)jb.aljx("amff", alju(int ), (int)230);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl219:
            // 2 sources

            case 34: {
                var36_12 /* !! */  = (int)jb.aljx("amfh", alju(int ), (int)231);
                if (!var37_11) ** GOTO lbl86
                throw null;
            }
lbl223:
            // 3 sources

            case 35: {
                var36_12 /* !! */  = (int)jb.aljx("amfj", alju(int ), (int)232);
                if (!var37_11) ** GOTO lbl61
                throw null;
            }
lbl227:
            // 3 sources

            case 36: {
                var36_12 /* !! */  = (int)jb.aljx("amfk", alju(int ), (int)233);
                if (var37_11) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl232:
            // 2 sources

            case 37: {
                var36_12 /* !! */  = (int)jb.aljx("amfm", alju(int ), (int)234);
                if (!var37_11) ** GOTO lbl81
                throw null;
            }
lbl236:
            // 4 sources

            case 38: {
                var36_12 /* !! */  = (int)jb.aljx("amfn", alju(int ), (int)235);
                if (!var37_11) ** GOTO lbl223
                throw null;
            }
            case 39: {
                var36_12 /* !! */  = (int)jb.aljx("amfo", alju(int ), (int)236);
                if (!var37_11) ** GOTO lbl167
                throw null;
            }
            case 40: {
                var36_12 /* !! */  = (int)jb.aljx("amfs", alju(int ), (int)237);
                if (!var37_11) ** GOTO lbl163
                throw null;
            }
            case 41: {
                var36_12 /* !! */  = (int)jb.aljx("amft", alju(int ), (int)238);
                if (!var37_11) ** GOTO lbl188
                throw null;
            }
            case 42: {
                var36_12 /* !! */  = (int)jb.aljx("amfv", alju(int ), (int)239);
                if (!var37_11) ** GOTO lbl101
                throw null;
            }
lbl256:
            // 2 sources

            case 43: {
                var36_12 /* !! */  = (int)jb.aljx("amfx", alju(int ), (int)240);
                if (!var37_11) ** GOTO lbl119
                throw null;
            }
            case 44: {
                var36_12 /* !! */  = (int)jb.aljx("amfy", alju(int ), (int)241);
                if (!var37_11) ** GOTO lbl236
                throw null;
            }
lbl264:
            // 3 sources

            case 45: {
                var36_12 /* !! */  = (int)jb.aljx("amga", alju(int ), (int)242);
                if (!var37_11) ** GOTO lbl188
                throw null;
            }
lbl268:
            // 2 sources

            case 46: {
                var36_12 /* !! */  = (int)jb.aljx("amgd", alju(int ), (int)243);
                if (!var37_11) ** GOTO lbl172
                throw null;
            }
            case 47: 
        }
        var36_12 /* !! */  = (int)jb.aljx("amge", alju(int ), (int)244);
        ** while (!var37_11)
lbl275:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int alju(int n2) {
        return aljv[n2] ^ aljw[n2];
    }

    private static /* synthetic */ double amce(int n2) {
        return Double.longBitsToDouble(alkx[n2] ^ alkz[n2]);
    }

    private static /* synthetic */ void amjo() {
        jb.alkz[0] = -6560271836538554149L;
        jb.alkz[1] = -4384901118372603597L;
        jb.alkz[2] = 7025842601731641475L;
        jb.alkz[3] = -2203675543577120189L;
        jb.alkz[4] = -3448276591964359496L;
        jb.alkz[5] = -5855803825227223372L;
        jb.alkz[6] = -4052124726895828815L;
        jb.alkz[7] = -7104413324686127021L;
        jb.alkz[8] = -8984162378696670686L;
        jb.alkz[9] = 6736270688291883597L;
        jb.alkz[10] = 3433749948206191157L;
        jb.alkz[11] = 3064792896506918218L;
        jb.alkz[12] = -2833297974343772517L;
        jb.alkz[13] = 1289666047051770064L;
        jb.alkz[14] = 5857864754415435662L;
        jb.alkz[15] = 7877513976466025739L;
        jb.alkz[16] = -8701066911707096589L;
        jb.alkz[17] = 8160800142064998316L;
        jb.alkz[18] = -3311939795251535118L;
        jb.alkz[19] = -5416188259194229924L;
        jb.alkz[20] = 6142142464988056885L;
        jb.alkz[21] = 3918821074037286026L;
        jb.alkz[22] = 5241681199946205412L;
        jb.alkz[23] = -8165771547347217388L;
        jb.alkz[24] = -6604615469382330621L;
        jb.alkz[25] = 4285645011580751215L;
        jb.alkz[26] = 1660584281796592611L;
        jb.alkz[27] = 5681778630938475129L;
        jb.alkz[28] = 4633122802993641184L;
        jb.alkz[29] = -6380972047789990880L;
        jb.alkz[30] = 7775221442835816926L;
        jb.alkz[31] = 957141384494240668L;
        jb.alkz[32] = -986004544496572837L;
        jb.alkz[33] = -3433090911376647993L;
        jb.alkz[34] = 5391387790400962362L;
        jb.alkz[35] = 2482839914294307405L;
        jb.alkz[36] = -1928075523236869740L;
        jb.alkz[37] = 7423491155210659964L;
        jb.alkz[38] = -3452967432747574945L;
        jb.alkz[39] = -5978409601905548469L;
        jb.alkz[40] = 1089647970976669971L;
        jb.alkz[41] = -2654509962927717219L;
        jb.alkz[42] = 437103107211664071L;
        jb.alkz[43] = 7789107864734197822L;
        jb.alkz[44] = 6447394753910277967L;
        jb.alkz[45] = 766141932400957813L;
        jb.alkz[46] = 3747242866890446326L;
        jb.alkz[47] = 1153649098944288031L;
        jb.alkz[48] = -1672023725929857031L;
        jb.alkz[49] = 8753668612665307036L;
        jb.alkz[50] = -1099523417740343913L;
        jb.alkz[51] = -2825594562353157103L;
        jb.alkz[52] = -7600201457308290489L;
        jb.alkz[53] = 1273161292653363650L;
        jb.alkz[54] = 5060493832896884921L;
        jb.alkz[55] = -4080479203426237967L;
        jb.alkz[56] = 3618618162729749902L;
        jb.alkz[57] = -2431084518678670934L;
        jb.alkz[58] = -3905603147258721166L;
        jb.alkz[59] = -7666703417300211596L;
        jb.alkz[60] = -4659420491802748028L;
        jb.alkz[61] = -7778895950855681533L;
        jb.alkz[62] = 6616861251275400990L;
        jb.alkz[63] = 6073059172115669721L;
        jb.alkz[64] = 4455356989792201660L;
        jb.alkz[65] = -8929962253445170488L;
        jb.alkz[66] = -4594520591861760438L;
        jb.alkz[67] = -3227050294748946222L;
    }

    private static /* synthetic */ void amjm() {
        jb.aljw[200] = 1823616920;
        jb.aljw[201] = -2074533422;
        jb.aljw[202] = -1563564844;
        jb.aljw[203] = -642289336;
        jb.aljw[204] = 1064190168;
        jb.aljw[205] = 798289215;
        jb.aljw[206] = 1964547002;
        jb.aljw[207] = -1531533126;
        jb.aljw[208] = -680518569;
        jb.aljw[209] = 1406198748;
        jb.aljw[210] = 1103168483;
        jb.aljw[211] = 141184672;
        jb.aljw[212] = -817741092;
        jb.aljw[213] = -2090251897;
        jb.aljw[214] = -1076290965;
        jb.aljw[215] = 1151753905;
        jb.aljw[216] = -1081075587;
        jb.aljw[217] = 322369550;
        jb.aljw[218] = -217490925;
        jb.aljw[219] = -871642242;
        jb.aljw[220] = -627114342;
        jb.aljw[221] = -1621056488;
        jb.aljw[222] = -155195308;
        jb.aljw[223] = 269395962;
        jb.aljw[224] = 300587277;
        jb.aljw[225] = 1493240902;
        jb.aljw[226] = 159186870;
        jb.aljw[227] = -713628356;
        jb.aljw[228] = -1541164385;
        jb.aljw[229] = -1344375148;
        jb.aljw[230] = -87348383;
        jb.aljw[231] = 1359521922;
        jb.aljw[232] = 1372878013;
        jb.aljw[233] = -1202577403;
        jb.aljw[234] = -1605949452;
        jb.aljw[235] = 726498681;
        jb.aljw[236] = 199485035;
        jb.aljw[237] = 1044677247;
        jb.aljw[238] = -1207665259;
        jb.aljw[239] = -1438127942;
        jb.aljw[240] = -1805785481;
        jb.aljw[241] = -1525836557;
        jb.aljw[242] = 232335176;
        jb.aljw[243] = -1536221544;
        jb.aljw[244] = -1903946510;
        jb.aljw[245] = -1847008744;
        jb.aljw[246] = -494968868;
        jb.aljw[247] = 424367660;
        jb.aljw[248] = 1225973919;
        jb.aljw[249] = 1316087274;
        jb.aljw[250] = 574470414;
        jb.aljw[251] = -26320610;
        jb.aljw[252] = 1390956232;
        jb.aljw[253] = 1108803321;
        jb.aljw[254] = 2036871359;
    }

    static {
        aljv = new int[255];
        aljw = new int[255];
        jb.amhn();
        jb.amiv();
        jb.amjj();
        jb.amjk();
        jb.amjl();
        jb.amjm();
        alkx = new long[68];
        alkz = new long[68];
        jb.amjn();
        jb.amjo();
    }

    private static /* synthetic */ void amiv() {
        jb.aljv[100] = -1253326998;
        jb.aljv[101] = 2094294502;
        jb.aljv[102] = 1620017070;
        jb.aljv[103] = -644922788;
        jb.aljv[104] = 1094221382;
        jb.aljv[105] = 462716464;
        jb.aljv[106] = 1284613520;
        jb.aljv[107] = -1499435859;
        jb.aljv[108] = -1412820773;
        jb.aljv[109] = -1637580850;
        jb.aljv[110] = 3689988;
        jb.aljv[111] = -1362132955;
        jb.aljv[112] = 2124589338;
        jb.aljv[113] = -1325784311;
        jb.aljv[114] = -879346087;
        jb.aljv[115] = 3611254;
        jb.aljv[116] = 196945262;
        jb.aljv[117] = -2122736350;
        jb.aljv[118] = -32504910;
        jb.aljv[119] = 1730041046;
        jb.aljv[120] = -697588926;
        jb.aljv[121] = 72259524;
        jb.aljv[122] = 1185814579;
        jb.aljv[123] = 594991406;
        jb.aljv[124] = -1528849549;
        jb.aljv[125] = -232418247;
        jb.aljv[126] = -1746454615;
        jb.aljv[127] = -1316120196;
        jb.aljv[128] = 1251234825;
        jb.aljv[129] = -884404411;
        jb.aljv[130] = -866624079;
        jb.aljv[131] = -1459824794;
        jb.aljv[132] = 155808616;
        jb.aljv[133] = 2020814434;
        jb.aljv[134] = 798489437;
        jb.aljv[135] = 943898948;
        jb.aljv[136] = 410106867;
        jb.aljv[137] = -989735572;
        jb.aljv[138] = 1657639250;
        jb.aljv[139] = 303219175;
        jb.aljv[140] = -1969965234;
        jb.aljv[141] = -908370048;
        jb.aljv[142] = 2062059328;
        jb.aljv[143] = 903501364;
        jb.aljv[144] = -1841486767;
        jb.aljv[145] = -814284926;
        jb.aljv[146] = 1918186569;
        jb.aljv[147] = -316196031;
        jb.aljv[148] = -1381863211;
        jb.aljv[149] = 1652934880;
        jb.aljv[150] = -62885278;
        jb.aljv[151] = -1050044479;
        jb.aljv[152] = -203204095;
        jb.aljv[153] = 1004635120;
        jb.aljv[154] = -667713750;
        jb.aljv[155] = -611863472;
        jb.aljv[156] = -1891462964;
        jb.aljv[157] = -1353805701;
        jb.aljv[158] = 1487797987;
        jb.aljv[159] = -1457142209;
        jb.aljv[160] = 92523351;
        jb.aljv[161] = 1680009842;
        jb.aljv[162] = 1708918848;
        jb.aljv[163] = 1426522028;
        jb.aljv[164] = -48733366;
        jb.aljv[165] = 1262990467;
        jb.aljv[166] = -121561513;
        jb.aljv[167] = 732173654;
        jb.aljv[168] = -16981474;
        jb.aljv[169] = 1556599021;
        jb.aljv[170] = 571009626;
        jb.aljv[171] = 1645979466;
        jb.aljv[172] = 1897877132;
        jb.aljv[173] = -972743945;
        jb.aljv[174] = -795833322;
        jb.aljv[175] = 1808905919;
        jb.aljv[176] = 1632580692;
        jb.aljv[177] = 204744913;
        jb.aljv[178] = 966038257;
        jb.aljv[179] = -1707431486;
        jb.aljv[180] = -2091674667;
        jb.aljv[181] = 1717089869;
        jb.aljv[182] = -291703821;
        jb.aljv[183] = 1595058037;
        jb.aljv[184] = -707644666;
        jb.aljv[185] = -1996808518;
        jb.aljv[186] = 1157730648;
        jb.aljv[187] = -972404621;
        jb.aljv[188] = 745996840;
        jb.aljv[189] = -562985124;
        jb.aljv[190] = 2104961102;
        jb.aljv[191] = 335406416;
        jb.aljv[192] = -914258845;
        jb.aljv[193] = 656253601;
        jb.aljv[194] = -1414891032;
        jb.aljv[195] = 1622398263;
        jb.aljv[196] = -1968289564;
        jb.aljv[197] = -230468350;
        jb.aljv[198] = 231087048;
        jb.aljv[199] = -164279749;
    }

    private static /* synthetic */ float almx(int n2) {
        return Float.intBitsToFloat(aljv[n2] ^ aljw[n2]);
    }

    public static /* synthetic */ CallSite aljx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jb getInstance() {
        v0 /* !! */  = jb.cd;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(jb.aljx("allg", alkw(int ), (int)1) - jb.aljx("alld", alkw(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1712688994: {
                    continue block16;
                }
                case 1153125272: {
                    break block16;
                }
            }
            break;
        }
        var2 = jb.c;
        v1 /* !! */  = jb.cd;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - jb.aljx("alli", alkw(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1307518322: {
                    v2 = jb.aljx("allj", alkw(int ), (int)3);
                    continue block17;
                }
                case -817119498: {
                    v2 = jb.aljx("alll", alkw(int ), (int)4);
                    continue block17;
                }
                case 1127445462: {
                    v2 = jb.aljx("alln", alkw(int ), (int)5);
                    continue block17;
                }
                case 1153125272: {
                    break block17;
                }
            }
            break;
        }
        var1_1 /* !! */  = jb.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = jb.cd - jb.aljx("allo", alkw(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jb.aljx("allu", alju(int ), (int)11)) break;
                    v3 /* !! */  = (long)jb.aljx("allw", alju(int ), (int)12);
                }
                var0_2 = jb.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = jb.cd - jb.aljx("ally", alkw(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jb.aljx("allz", alju(int ), (int)13)) break;
                    v4 /* !! */  = (long)jb.aljx("alma", alju(int ), (int)14);
                }
                return nj.get(jb.class);
            }
lbl50:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)jb.aljx("almb", alju(int ), (int)15);
                } while (!var2);
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)jb.aljx("almc", alju(int ), (int)16);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)jb.aljx("almi", alju(int ), (int)17);
                if (!var2) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)jb.aljx("almj", alju(int ), (int)18);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void amhn() {
        jb.aljv[0] = -2002332523;
        jb.aljv[1] = -1957216230;
        jb.aljv[2] = 34510073;
        jb.aljv[3] = -1429423251;
        jb.aljv[4] = 826761806;
        jb.aljv[5] = -770368144;
        jb.aljv[6] = 725064152;
        jb.aljv[7] = -460249015;
        jb.aljv[8] = -401509689;
        jb.aljv[9] = 318156300;
        jb.aljv[10] = -1283332849;
        jb.aljv[11] = -411539843;
        jb.aljv[12] = 1620742535;
        jb.aljv[13] = -1149288754;
        jb.aljv[14] = 186649063;
        jb.aljv[15] = -1867737134;
        jb.aljv[16] = 169989092;
        jb.aljv[17] = -756597994;
        jb.aljv[18] = -1444544600;
        jb.aljv[19] = 1719776987;
        jb.aljv[20] = 35877526;
        jb.aljv[21] = -324380779;
        jb.aljv[22] = 1947819858;
        jb.aljv[23] = 950558172;
        jb.aljv[24] = 1322457772;
        jb.aljv[25] = -1371518793;
        jb.aljv[26] = -1553957544;
        jb.aljv[27] = -2138548235;
        jb.aljv[28] = -945130571;
        jb.aljv[29] = 221316111;
        jb.aljv[30] = 1277108997;
        jb.aljv[31] = 1416408803;
        jb.aljv[32] = 62503270;
        jb.aljv[33] = -128249954;
        jb.aljv[34] = -1372074110;
        jb.aljv[35] = -1589992452;
        jb.aljv[36] = -1183046853;
        jb.aljv[37] = 339702224;
        jb.aljv[38] = 1070267007;
        jb.aljv[39] = -169358513;
        jb.aljv[40] = 352364474;
        jb.aljv[41] = 643788848;
        jb.aljv[42] = 826209002;
        jb.aljv[43] = 1943012938;
        jb.aljv[44] = 1567114873;
        jb.aljv[45] = 1037466246;
        jb.aljv[46] = -1200295429;
        jb.aljv[47] = 243857755;
        jb.aljv[48] = -2015754674;
        jb.aljv[49] = 1964829014;
        jb.aljv[50] = -1840958976;
        jb.aljv[51] = 229259806;
        jb.aljv[52] = -875783626;
        jb.aljv[53] = -393842784;
        jb.aljv[54] = 547692289;
        jb.aljv[55] = -592330195;
        jb.aljv[56] = -1777278919;
        jb.aljv[57] = -388404422;
        jb.aljv[58] = 645395052;
        jb.aljv[59] = 1369465262;
        jb.aljv[60] = -955796712;
        jb.aljv[61] = -1484099791;
        jb.aljv[62] = -1053077103;
        jb.aljv[63] = -1704837814;
        jb.aljv[64] = 1612758091;
        jb.aljv[65] = 1559868831;
        jb.aljv[66] = 432456779;
        jb.aljv[67] = 533960973;
        jb.aljv[68] = -60343295;
        jb.aljv[69] = -557428786;
        jb.aljv[70] = -1586622738;
        jb.aljv[71] = -1821217089;
        jb.aljv[72] = 851247477;
        jb.aljv[73] = -1893381637;
        jb.aljv[74] = 759418462;
        jb.aljv[75] = 2127666630;
        jb.aljv[76] = 1303575616;
        jb.aljv[77] = -1402399328;
        jb.aljv[78] = 255517239;
        jb.aljv[79] = -2115325576;
        jb.aljv[80] = 1341269815;
        jb.aljv[81] = 600304500;
        jb.aljv[82] = 1908047894;
        jb.aljv[83] = -1279819443;
        jb.aljv[84] = -1407273815;
        jb.aljv[85] = -633995769;
        jb.aljv[86] = -819856546;
        jb.aljv[87] = -1890765471;
        jb.aljv[88] = 1196079801;
        jb.aljv[89] = -1139626273;
        jb.aljv[90] = -789144387;
        jb.aljv[91] = -2092536765;
        jb.aljv[92] = -1666397578;
        jb.aljv[93] = 246814458;
        jb.aljv[94] = 860298343;
        jb.aljv[95] = -1578988700;
        jb.aljv[96] = 732049062;
        jb.aljv[97] = 1474206754;
        jb.aljv[98] = 1299549515;
        jb.aljv[99] = 1646032691;
    }

    private static /* synthetic */ void amjn() {
        jb.alkx[0] = -2562749066144885736L;
        jb.alkx[1] = -6106934656439767829L;
        jb.alkx[2] = 9147117437926189315L;
        jb.alkx[3] = -7515340924267481161L;
        jb.alkx[4] = -4406164706351931689L;
        jb.alkx[5] = -4529576283833810279L;
        jb.alkx[6] = 7966604807911309590L;
        jb.alkx[7] = -7120173443228748970L;
        jb.alkx[8] = 4573398879398086218L;
        jb.alkx[9] = 8227684568243194298L;
        jb.alkx[10] = 5705207549485156463L;
        jb.alkx[11] = -3480150176049270886L;
        jb.alkx[12] = 4291282383802611266L;
        jb.alkx[13] = 5588299608195973221L;
        jb.alkx[14] = -6186652104545392941L;
        jb.alkx[15] = 8056992165146907849L;
        jb.alkx[16] = -1128941909713009284L;
        jb.alkx[17] = -5163887672685301819L;
        jb.alkx[18] = 270902916707801961L;
        jb.alkx[19] = 1801043257037145218L;
        jb.alkx[20] = -5854412986971572232L;
        jb.alkx[21] = -650747866449915537L;
        jb.alkx[22] = -1611406754861331427L;
        jb.alkx[23] = -2020387970265429590L;
        jb.alkx[24] = -8874922128360672157L;
        jb.alkx[25] = -2438799921329332201L;
        jb.alkx[26] = 2814860657847378743L;
        jb.alkx[27] = -5919086005598392270L;
        jb.alkx[28] = 6946061602077242492L;
        jb.alkx[29] = 2083299129433784409L;
        jb.alkx[30] = -2172636613908422259L;
        jb.alkx[31] = -3063427803333434902L;
        jb.alkx[32] = 6990567931124292707L;
        jb.alkx[33] = -8005866285565299435L;
        jb.alkx[34] = -5528798212846312401L;
        jb.alkx[35] = -3410482001496797528L;
        jb.alkx[36] = -8164962103898392284L;
        jb.alkx[37] = -7532036555841919634L;
        jb.alkx[38] = -4346814970067332348L;
        jb.alkx[39] = 9171393724637019395L;
        jb.alkx[40] = -7092866262304666091L;
        jb.alkx[41] = 1288993734905690189L;
        jb.alkx[42] = -649328838877463713L;
        jb.alkx[43] = 8286905144226856793L;
        jb.alkx[44] = -3529877891705172519L;
        jb.alkx[45] = -5399884670342113270L;
        jb.alkx[46] = 3034512727302539373L;
        jb.alkx[47] = -3637633598254581988L;
        jb.alkx[48] = -3602245087205594241L;
        jb.alkx[49] = 3288247459685393820L;
        jb.alkx[50] = -3498438093020062929L;
        jb.alkx[51] = -1799257428879002967L;
        jb.alkx[52] = -6248725399895888641L;
        jb.alkx[53] = 3333645144606849424L;
        jb.alkx[54] = 8778128925629941995L;
        jb.alkx[55] = -524836331437180509L;
        jb.alkx[56] = 973781282106808821L;
        jb.alkx[57] = -2194779024089331664L;
        jb.alkx[58] = -686525988970883063L;
        jb.alkx[59] = -6183970887685751793L;
        jb.alkx[60] = 5784301251577665101L;
        jb.alkx[61] = -7176650010906835495L;
        jb.alkx[62] = -3368799968864257049L;
        jb.alkx[63] = 131150775051530709L;
        jb.alkx[64] = -8975126417944316771L;
        jb.alkx[65] = -8772647700965405602L;
        jb.alkx[66] = 7897450627474901222L;
        jb.alkx[67] = 6720206818199629164L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldRender(class_1657 var1_1) {
        block83: {
            block82: {
                block81: {
                    block80: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = jb.cd - jb.aljx("alrx", alkw(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v0 /* !! */  == jb.aljx("alry", alju(int ), (int)102)) break;
                            v0 /* !! */  = (long)jb.aljx("alrz", alju(int ), (int)103);
                        }
                        var4_2 = jb.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = jb.cd - jb.aljx("alsa", alkw(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v1 /* !! */  == jb.aljx("alsb", alju(int ), (int)104)) break;
                            v1 /* !! */  = (long)jb.aljx("alsf", alju(int ), (int)105);
                        }
                        var3_3 /* !! */  = jb.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = jb.cd - jb.aljx("alsg", alkw(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v2 /* !! */  == jb.aljx("alsh", alju(int ), (int)106)) break;
                            v2 /* !! */  = (long)jb.aljx("alsi", alju(int ), (int)107);
                        }
                        var2_4 = jb.a;
                        if (var4_2) {
                            throw null;
lbl24:
                            // 10 sources

                            return (boolean)jb.aljx("alsj", alju(int ), (int)108);
                        }
                        if (var2_4 || var2_4) ** GOTO lbl24
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = jb.cd - jb.aljx("also", alkw(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == jb.aljx("alsq", alju(int ), (int)109)) break;
                            v3 /* !! */  = (long)jb.aljx("alsr", alju(int ), (int)110);
                        }
                        if (!var1_1.method_5805()) break block80;
                        if (var2_4) ** GOTO lbl24
                        v4 /* !! */  = jb.cd;
                        if (true) ** GOTO lbl39
                        block46: while (true) {
                            v4 /* !! */  = (long)(v5 - jb.aljx("alss", alkw(int ), (int)12));
lbl39:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case 983891749: {
                                    v5 = jb.aljx("alsu", alkw(int ), (int)13);
                                    continue block46;
                                }
                                case 1089015595: {
                                    v5 = jb.aljx("alsv", alkw(int ), (int)14);
                                    continue block46;
                                }
                                case 1153125272: {
                                    break block46;
                                }
                            }
                            break;
                        }
                        if (!var1_1.method_7325()) break block81;
                        if (var2_4) ** GOTO lbl24
                    }
                    if (var2_4 || var2_4) ** GOTO lbl24
                    return (boolean)jb.aljx("alsz", alju(int ), (int)111);
                }
                if (var2_4 || var2_4) ** GOTO lbl24
                v6 /* !! */  = jb.cd;
                if (true) ** GOTO lbl59
                block47: while (true) {
                    v6 /* !! */  = (long)(v7 - jb.aljx("altb", alkw(int ), (int)15));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1479531406: {
                            v7 = jb.aljx("altd", alkw(int ), (int)16);
                            continue block47;
                        }
                        case -1228093267: {
                            v7 = jb.aljx("alte", alkw(int ), (int)17);
                            continue block47;
                        }
                        case -1050979088: {
                            v7 = jb.aljx("altf", alkw(int ), (int)18);
                            continue block47;
                        }
                        case 1153125272: {
                            break block47;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = jb.cd - jb.aljx("alth", alkw(int ), (int)19)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == jb.aljx("altj", alju(int ), (int)112)) break;
                    v8 /* !! */  = (long)jb.aljx("altm", alju(int ), (int)113);
                }
                if (var1_1 == jb.mc.field_1724) break block82;
                if (var2_4) ** GOTO lbl24
                return (boolean)jb.aljx("altn", alju(int ), (int)114);
            }
            if (var2_4 || var2_4) ** GOTO lbl24
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_5 = jb.cd - jb.aljx("altp", alkw(int ), (int)20)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == jb.aljx("altr", alju(int ), (int)115)) break;
                v9 /* !! */  = (long)jb.aljx("altt", alju(int ), (int)116);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_6 = jb.cd - jb.aljx("altu", alkw(int ), (int)21)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == jb.aljx("altw", alju(int ), (int)117)) break;
                v10 /* !! */  = (long)jb.aljx("altz", alju(int ), (int)118);
            }
            if (!this.self.isValue()) break block83;
            if (var2_4) ** GOTO lbl24
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_7 = jb.cd - jb.aljx("alub", alkw(int ), (int)22)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v11 /* !! */  == jb.aljx("aluc", alju(int ), (int)119)) break;
                v11 /* !! */  = (long)jb.aljx("alue", alju(int ), (int)120);
            }
            v12 /* !! */  = jb.cd;
            if (true) ** GOTO lbl106
            block52: while (true) {
                v12 /* !! */  = (long)(jb.aljx("aluh", alkw(int ), (int)24) - jb.aljx("aluf", alkw(int ), (int)23));
lbl106:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -302149084: {
                        continue block52;
                    }
                    case 1153125272: {
                        break block52;
                    }
                }
                break;
            }
            v13 = jb.mc.field_1690;
            v14 /* !! */  = jb.cd;
            if (true) ** GOTO lbl116
            block53: while (true) {
                v14 /* !! */  = (long)(v15 - jb.aljx("alul", alkw(int ), (int)25));
lbl116:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -693857705: {
                        v15 = jb.aljx("alum", alkw(int ), (int)26);
                        continue block53;
                    }
                    case 1153125272: {
                        break block53;
                    }
                    case 0x7177D7D7: {
                        v15 = jb.aljx("aluo", alkw(int ), (int)27);
                        continue block53;
                    }
                }
                break;
            }
            v16 = v13.method_31044();
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_8 = jb.cd - jb.aljx("aluq", alkw(int ), (int)28)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v17 /* !! */  == jb.aljx("alur", alju(int ), (int)121)) break;
                v17 /* !! */  = (long)jb.aljx("alut", alju(int ), (int)122);
            }
            if (v16.method_31034()) break block83;
            if (var2_4) ** GOTO lbl24
            v18 = jb.aljx("aluu", alju(int ), (int)123);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl145
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v18 = jb.aljx("alva", alju(int ), (int)124);
lbl145:
                // 2 sources

                return (boolean)v18;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)jb.aljx("alvb", alju(int ), (int)125);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)jb.aljx("alvc", alju(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl156:
            // 5 sources

            case 2: {
                var3_3 /* !! */  = (int)jb.aljx("alvd", alju(int ), (int)127);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl161:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)jb.aljx("alvf", alju(int ), (int)128);
                } while (!var4_2);
                throw null;
            }
lbl166:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)jb.aljx("alvh", alju(int ), (int)129);
                if (!var4_2) ** GOTO lbl161
                throw null;
            }
lbl170:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)jb.aljx("alvj", alju(int ), (int)130);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl175:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jb.aljx("alvo", alju(int ), (int)131);
                    if (!var4_2) ** GOTO lbl170
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)jb.aljx("alvp", alju(int ), (int)132);
                if (!var4_2) ** GOTO lbl175
                throw null;
            }
lbl184:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)jb.aljx("alvq", alju(int ), (int)133);
                if (!var4_2) break;
                throw null;
            }
lbl188:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)jb.aljx("alvr", alju(int ), (int)134);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl193:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)jb.aljx("alvt", alju(int ), (int)135);
                if (!var4_2) ** GOTO lbl156
                throw null;
            }
lbl197:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)jb.aljx("alvv", alju(int ), (int)136);
                if (!var4_2) ** GOTO lbl184
                throw null;
            }
lbl201:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)jb.aljx("alvx", alju(int ), (int)137);
                if (!var4_2) ** GOTO lbl156
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)jb.aljx("alwc", alju(int ), (int)138);
                if (!var4_2) ** GOTO lbl188
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)jb.aljx("alwd", alju(int ), (int)139);
                if (!var4_2) ** GOTO lbl156
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)jb.aljx("alwe", alju(int ), (int)140);
                if (!var4_2) ** GOTO lbl156
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)jb.aljx("alwf", alju(int ), (int)141);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)jb.aljx("alwh", alju(int ), (int)142);
                if (!var4_2) ** GOTO lbl175
                throw null;
            }
            case 18: 
        }
        var3_3 /* !! */  = (int)jb.aljx("alwj", alju(int ), (int)143);
        ** while (!var4_2)
lbl228:
        // 1 sources

        throw null;
    }

    public jb() {
        int n2 = b;
        super("Box", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0445\u0438\u0442\u0431\u043e\u043a\u0441\u044b \u0438\u0433\u0440\u043e\u043a\u043e\u0432", du.RENDER);
        this.mode = new kf("\u0412\u0438\u0434", "\u0421\u0442\u0438\u043b\u044c \u043b\u0438\u043d\u0438\u0439 \u0445\u0438\u0442\u0431\u043e\u043a\u0441\u0430", LINE, LINE, CORNERS, DASHED);
        this.fill = new kb("\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435", "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0442\u044c \u043f\u043e\u043b\u0443\u043f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0435 \u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0432\u043d\u0443\u0442\u0440\u0438 \u043a\u043e\u043d\u0442\u0443\u0440\u0430").setValue((boolean)jb.aljx("alka", alju(int ), (int)0));
        this.throughWalls = new kb("\u0427\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u0441\u043a\u0432\u043e\u0437\u044c \u0431\u043b\u043e\u043a\u0438").setValue((boolean)jb.aljx("alkb", alju(int ), (int)1));
        this.self = new kb("\u0421\u0435\u0431\u044f", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0441\u0432\u043e\u0439 \u0445\u0438\u0442\u0431\u043e\u043a \u043e\u0442 \u0442\u0440\u0435\u0442\u044c\u0435\u0433\u043e \u043b\u0438\u0446\u0430").setValue((boolean)jb.aljx("alkd", alju(int ), (int)2));
        this.settings(this.mode, this.fill, this.throughWalls, this.self);
    }
}

