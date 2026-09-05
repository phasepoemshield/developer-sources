/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderPass
 *  net.minecraft.class_310
 *  org.lwjgl.opengl.GL11
 */
package ruhack.phobia;

import com.mojang.blaze3d.systems.RenderPass;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Stack;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;
import ruhack.phobia.ki;
import ruhack.phobia.oq$Rectangle;

public class oq {
    public static final int b;
    private static long[] kpis;
    public static final boolean c;
    private static long[] kpir;
    private static final Stack<oq$Rectangle> verticalStack;
    protected static final long su = 1774410054624136760L;
    private static int[] kpjc;
    private static final Stack<oq$Rectangle> stack;
    public static final boolean a;
    private static int[] kpjb;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void push(double var0, double var2_2, double var4_3, double var6_4, boolean var8_1) {
        block89: {
            block88: {
                var23_5 = oq.c;
                var22_6 /* !! */  = oq.b;
                var21_7 = oq.a;
                if (var23_5) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var21_7 || var21_7) ** GOTO lbl6
                if (!var8_1) ** GOTO lbl31
                if (var21_7 || var21_7) ** GOTO lbl6
                if (!ki.hasViewTransform()) break block88;
                if (var21_7 || var21_7) ** GOTO lbl6
                var9_8 = ki.transformRect((float)var0, (float)var2_2, (float)var4_3, (float)var6_4);
                if (var21_7 || var21_7) ** GOTO lbl6
                ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$push$0(float[] ), ()V)((float[])var9_8));
                if (var21_7 || var21_7) ** GOTO lbl6
                if (var23_5) {
                    throw null;
                }
                break block89;
            }
            if (var21_7 || var21_7) ** GOTO lbl6
            ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$push$1(double double double double ), ()V)((double)var0, (double)var2_2, (double)var4_3, (double)var6_4));
            if (var21_7) ** GOTO lbl6
        }
        if (var21_7) ** GOTO lbl6
        if (var22_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_7) ** GOTO lbl6
                return;
            }
lbl31:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            var9_9 = class_310.method_1551();
            if (var21_7 || var21_7) ** GOTO lbl6
            var10_10 = (float)var9_9.method_22683().method_4480() / (float)ki.getFixedScaledWidth() * ki.getContextScale();
            if (var21_7 || var21_7) ** GOTO lbl6
            var11_11 = new oq$Rectangle(var0, var2_2, var4_3, var6_4);
            if (var21_7 || var21_7) ** GOTO lbl6
            if (oq.stack.isEmpty()) ** GOTO lbl52
            if (var21_7 || var21_7) ** GOTO lbl6
            var12_12 = oq.stack.peek();
            if (var21_7 || var21_7) ** GOTO lbl6
            var13_13 = Math.max(var11_11.x, var12_12.x);
            if (var21_7 || var21_7) ** GOTO lbl6
            var15_14 = Math.max(var11_11.y, var12_12.y);
            if (var21_7 || var21_7) ** GOTO lbl6
            var17_15 = Math.min(var11_11.x + var11_11.w, var12_12.x + var12_12.w) - var13_13;
            if (var21_7 || var21_7) ** GOTO lbl6
            var19_16 = Math.min(var11_11.y + var11_11.h, var12_12.y + var12_12.h) - var15_14;
            if (var21_7 || var21_7) ** GOTO lbl6
            var11_11 = new oq$Rectangle(var13_13, var15_14, Math.max(0.0, var17_15), Math.max(0.0, var19_16));
            if (var21_7) ** GOTO lbl6
lbl52:
            // 2 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            oq.stack.push(var11_11);
            if (var21_7 || var21_7) ** GOTO lbl6
            oq.apply(var11_11, var10_10, var9_9);
            if (!var21_7 && !var21_7) ** break;
            ** continue;
            return;
lbl60:
            // 3 sources

            case 0: {
                do {
                    var22_6 /* !! */  = (int)oq.kpit("kpjp", kpja(int ), (int)11);
                } while (!var23_5);
                throw null;
            }
lbl65:
            // 2 sources

            case 1: {
                var22_6 /* !! */  = (int)oq.kpit("kpjq", kpja(int ), (int)12);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 2: {
                var22_6 /* !! */  = (int)oq.kpit("kpjr", kpja(int ), (int)13);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl75:
            // 2 sources

            case 3: {
                var22_6 /* !! */  = (int)oq.kpit("kpjs", kpja(int ), (int)14);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 4: {
                var22_6 /* !! */  = (int)oq.kpit("kpjt", kpja(int ), (int)15);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 5: {
                var22_6 /* !! */  = (int)oq.kpit("kpju", kpja(int ), (int)16);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl90:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_6 /* !! */  = (int)oq.kpit("kpjv", kpja(int ), (int)17);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl173
                    break;
                }
            }
lbl96:
            // 3 sources

            case 7: {
                var22_6 /* !! */  = (int)oq.kpit("kpjw", kpja(int ), (int)18);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 8: {
                var22_6 /* !! */  = (int)oq.kpit("kpjx", kpja(int ), (int)19);
                if (!var23_5) ** GOTO lbl96
                throw null;
            }
lbl105:
            // 4 sources

            case 9: {
                var22_6 /* !! */  = (int)oq.kpit("kpjy", kpja(int ), (int)20);
                if (!var23_5) ** GOTO lbl65
                throw null;
            }
            case 10: {
                var22_6 /* !! */  = (int)oq.kpit("kpjz", kpja(int ), (int)21);
                if (!var23_5) ** GOTO lbl96
                throw null;
            }
lbl113:
            // 2 sources

            case 11: {
                var22_6 /* !! */  = (int)oq.kpit("kpka", kpja(int ), (int)22);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 12: {
                var22_6 /* !! */  = (int)oq.kpit("kpkb", kpja(int ), (int)23);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl123:
            // 2 sources

            case 13: {
                var22_6 /* !! */  = (int)oq.kpit("kpkc", kpja(int ), (int)24);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl128:
            // 3 sources

            case 14: {
                var22_6 /* !! */  = (int)oq.kpit("kpkd", kpja(int ), (int)25);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl133:
            // 2 sources

            case 15: {
                var22_6 /* !! */  = (int)oq.kpit("kpke", kpja(int ), (int)26);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl138:
            // 5 sources

            case 16: {
                do {
                    var22_6 /* !! */  = (int)oq.kpit("kpkf", kpja(int ), (int)27);
                } while (!var23_5);
                throw null;
            }
lbl143:
            // 3 sources

            case 17: {
                var22_6 /* !! */  = (int)oq.kpit("kpkg", kpja(int ), (int)28);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 18: {
                var22_6 /* !! */  = (int)oq.kpit("kpkh", kpja(int ), (int)29);
                if (!var23_5) ** GOTO lbl105
                throw null;
            }
lbl152:
            // 3 sources

            case 19: {
                var22_6 /* !! */  = (int)oq.kpit("kpki", kpja(int ), (int)30);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl157:
            // 2 sources

            case 20: {
                var22_6 /* !! */  = (int)oq.kpit("kpkj", kpja(int ), (int)31);
                if (!var23_5) ** GOTO lbl75
                throw null;
            }
lbl161:
            // 3 sources

            case 21: {
                var22_6 /* !! */  = (int)oq.kpit("kpkk", kpja(int ), (int)32);
                if (!var23_5) ** GOTO lbl128
                throw null;
            }
lbl165:
            // 2 sources

            case 22: {
                var22_6 /* !! */  = (int)oq.kpit("kpkl", kpja(int ), (int)33);
                if (!var23_5) ** GOTO lbl161
                throw null;
            }
lbl169:
            // 2 sources

            case 23: {
                var22_6 /* !! */  = (int)oq.kpit("kpkm", kpja(int ), (int)34);
                if (!var23_5) ** GOTO lbl105
                throw null;
            }
lbl173:
            // 2 sources

            case 24: {
                var22_6 /* !! */  = (int)oq.kpit("kpkn", kpja(int ), (int)35);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl178:
            // 2 sources

            case 25: {
                var22_6 /* !! */  = (int)oq.kpit("kpko", kpja(int ), (int)36);
                if (!var23_5) ** GOTO lbl113
                throw null;
            }
            case 26: {
                var22_6 /* !! */  = (int)oq.kpit("kpkp", kpja(int ), (int)37);
                if (!var23_5) ** GOTO lbl157
                throw null;
            }
lbl186:
            // 2 sources

            case 27: {
                var22_6 /* !! */  = (int)oq.kpit("kpkq", kpja(int ), (int)38);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 28: {
                var22_6 /* !! */  = (int)oq.kpit("kpkr", kpja(int ), (int)39);
                if (!var23_5) ** GOTO lbl178
                throw null;
            }
            case 29: {
                var22_6 /* !! */  = (int)oq.kpit("kpks", kpja(int ), (int)40);
                if (!var23_5) ** GOTO lbl138
                throw null;
            }
lbl199:
            // 2 sources

            case 30: {
                var22_6 /* !! */  = (int)oq.kpit("kpkt", kpja(int ), (int)41);
                if (!var23_5) ** GOTO lbl128
                throw null;
            }
lbl203:
            // 2 sources

            case 31: {
                do {
                    var22_6 /* !! */  = (int)oq.kpit("kpku", kpja(int ), (int)42);
                } while (!var23_5);
                throw null;
            }
            case 32: {
                var22_6 /* !! */  = (int)oq.kpit("kpkv", kpja(int ), (int)43);
                if (!var23_5) ** GOTO lbl138
                throw null;
            }
lbl212:
            // 2 sources

            case 33: {
                var22_6 /* !! */  = (int)oq.kpit("kpkw", kpja(int ), (int)44);
                if (!var23_5) ** GOTO lbl186
                throw null;
            }
lbl216:
            // 2 sources

            case 34: {
                var22_6 /* !! */  = (int)oq.kpit("kpkx", kpja(int ), (int)45);
                if (!var23_5) ** GOTO lbl60
                throw null;
            }
            case 35: {
                var22_6 /* !! */  = (int)oq.kpit("kpky", kpja(int ), (int)46);
                if (!var23_5) ** GOTO lbl152
                throw null;
            }
lbl224:
            // 3 sources

            case 36: {
                var22_6 /* !! */  = (int)oq.kpit("kpkz", kpja(int ), (int)47);
                if (!var23_5) ** GOTO lbl216
                throw null;
            }
lbl228:
            // 2 sources

            case 37: {
                var22_6 /* !! */  = (int)oq.kpit("kpla", kpja(int ), (int)48);
                if (!var23_5) ** GOTO lbl138
                throw null;
            }
            case 38: {
                var22_6 /* !! */  = (int)oq.kpit("kplb", kpja(int ), (int)49);
                if (!var23_5) ** GOTO lbl60
                throw null;
            }
            case 39: {
                var22_6 /* !! */  = (int)oq.kpit("kplc", kpja(int ), (int)50);
                if (!var23_5) ** GOTO lbl133
                throw null;
            }
lbl240:
            // 2 sources

            case 40: {
                var22_6 /* !! */  = (int)oq.kpit("kpld", kpja(int ), (int)51);
                if (!var23_5) ** GOTO lbl161
                throw null;
            }
lbl244:
            // 2 sources

            case 41: {
                var22_6 /* !! */  = (int)oq.kpit("kple", kpja(int ), (int)52);
                if (!var23_5) ** GOTO lbl123
                throw null;
            }
lbl248:
            // 2 sources

            case 42: {
                var22_6 /* !! */  = (int)oq.kpit("kplf", kpja(int ), (int)53);
                if (!var23_5) ** GOTO lbl203
                throw null;
            }
            case 43: {
                var22_6 /* !! */  = (int)oq.kpit("kplg", kpja(int ), (int)54);
                if (!var23_5) ** GOTO lbl90
                throw null;
            }
            case 44: 
        }
        var22_6 /* !! */  = (int)oq.kpit("kplh", kpja(int ), (int)55);
        ** while (!var23_5)
lbl259:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$pushVertical$2(double var0, double var2_1) {
        v0 /* !! */  = oq.su;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - oq.kpit("kqcz", kpiq(int ), (int)210));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1282598980: {
                    v1 = oq.kpit("kqda", kpiq(int ), (int)211);
                    continue block17;
                }
                case 532729400: {
                    break block17;
                }
                case 2136804176: {
                    v1 = oq.kpit("kqdb", kpiq(int ), (int)212);
                    continue block17;
                }
            }
            break;
        }
        var6_2 = oq.c;
        v2 /* !! */  = oq.su;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - oq.kpit("kqdc", kpiq(int ), (int)213));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2056561440: {
                    v3 = oq.kpit("kqdd", kpiq(int ), (int)214);
                    continue block18;
                }
                case -996750879: {
                    v3 = oq.kpit("kqde", kpiq(int ), (int)215);
                    continue block18;
                }
                case 532729400: {
                    break block18;
                }
            }
            break;
        }
        var5_3 /* !! */  = oq.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kqdf", kpiq(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == oq.kpit("kqdg", kpja(int ), (int)312)) break;
            v4 /* !! */  = (long)oq.kpit("kqdh", kpja(int ), (int)313);
        }
        var4_4 = oq.a;
        if (var6_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl37
        v5 = oq.kpit("kqdi", kpja(int ), (int)314);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kqdj", kpiq(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == oq.kpit("kqdk", kpja(int ), (int)315)) break;
            v6 /* !! */  = (long)oq.kpit("kqdl", kpja(int ), (int)316);
        }
        oq.pushVertical(var0, var2_1, (boolean)v5);
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)oq.kpit("kqdm", kpja(int ), (int)317);
                if (!var6_2) break;
                throw null;
            }
            case 1: {
                var5_3 /* !! */  = (int)oq.kpit("kqdn", kpja(int ), (int)318);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl62:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)oq.kpit("kqdo", kpja(int ), (int)319);
                if (!var6_2) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)oq.kpit("kqdp", kpja(int ), (int)320);
                    if (!var6_2) ** GOTO lbl62
                    throw null;
                }
            }
            case 4: 
        }
        var5_3 /* !! */  = (int)oq.kpit("kqdq", kpja(int ), (int)321);
        ** while (!var6_2)
lbl74:
        // 1 sources

        throw null;
    }

    static {
        kpjb = new int[346];
        kpjc = new int[346];
        oq.kqez();
        oq.kqfa();
        oq.kqfb();
        oq.kqfc();
        oq.kqfd();
        oq.kqfe();
        oq.kqff();
        oq.kqfg();
        kpir = new long[228];
        kpis = new long[228];
        oq.kqfh();
        oq.kqfi();
        oq.kqfj();
        oq.kqfk();
        oq.kqfl();
        oq.kqfm();
        stack = new Stack();
        verticalStack = new Stack();
    }

    private static /* synthetic */ void kqfa() {
        oq.kpjb[100] = 662460864;
        oq.kpjb[101] = -752414896;
        oq.kpjb[102] = 1759689108;
        oq.kpjb[103] = -299349803;
        oq.kpjb[104] = 1194871629;
        oq.kpjb[105] = -1866166376;
        oq.kpjb[106] = 625480576;
        oq.kpjb[107] = -1823893914;
        oq.kpjb[108] = 1286766824;
        oq.kpjb[109] = -1916082688;
        oq.kpjb[110] = -439215917;
        oq.kpjb[111] = 331049974;
        oq.kpjb[112] = 49325527;
        oq.kpjb[113] = 969387895;
        oq.kpjb[114] = -764365006;
        oq.kpjb[115] = -1493734350;
        oq.kpjb[116] = 255595787;
        oq.kpjb[117] = -2021734094;
        oq.kpjb[118] = 1089139540;
        oq.kpjb[119] = 588627963;
        oq.kpjb[120] = -856264786;
        oq.kpjb[121] = -796223384;
        oq.kpjb[122] = 678504249;
        oq.kpjb[123] = -1311488525;
        oq.kpjb[124] = -1837324767;
        oq.kpjb[125] = 783213624;
        oq.kpjb[126] = 1956447199;
        oq.kpjb[127] = -1651360075;
        oq.kpjb[128] = 1846645198;
        oq.kpjb[129] = -854488723;
        oq.kpjb[130] = -2045952056;
        oq.kpjb[131] = 1619387823;
        oq.kpjb[132] = 1801456952;
        oq.kpjb[133] = 1626953956;
        oq.kpjb[134] = 1977827078;
        oq.kpjb[135] = 875366281;
        oq.kpjb[136] = -1658396090;
        oq.kpjb[137] = -2117423104;
        oq.kpjb[138] = -2087105355;
        oq.kpjb[139] = 1688426590;
        oq.kpjb[140] = 973053319;
        oq.kpjb[141] = 2021559854;
        oq.kpjb[142] = -692012299;
        oq.kpjb[143] = 139297726;
        oq.kpjb[144] = -1320279874;
        oq.kpjb[145] = 1754140143;
        oq.kpjb[146] = 362172958;
        oq.kpjb[147] = 1760983105;
        oq.kpjb[148] = -596279321;
        oq.kpjb[149] = 1808690230;
        oq.kpjb[150] = 718632236;
        oq.kpjb[151] = 1531626084;
        oq.kpjb[152] = -491567541;
        oq.kpjb[153] = -56004497;
        oq.kpjb[154] = 1255523809;
        oq.kpjb[155] = 947746303;
        oq.kpjb[156] = 1973532529;
        oq.kpjb[157] = -1155873363;
        oq.kpjb[158] = -127534260;
        oq.kpjb[159] = -891041045;
        oq.kpjb[160] = 100433200;
        oq.kpjb[161] = -1607558336;
        oq.kpjb[162] = 1027337052;
        oq.kpjb[163] = -1337764317;
        oq.kpjb[164] = -1399177388;
        oq.kpjb[165] = 268590246;
        oq.kpjb[166] = -1011787210;
        oq.kpjb[167] = -981865189;
        oq.kpjb[168] = 1186716970;
        oq.kpjb[169] = 745540179;
        oq.kpjb[170] = 1441843444;
        oq.kpjb[171] = 1324427768;
        oq.kpjb[172] = 1511982034;
        oq.kpjb[173] = -606656129;
        oq.kpjb[174] = -671220498;
        oq.kpjb[175] = 721530638;
        oq.kpjb[176] = 2065233480;
        oq.kpjb[177] = 299021582;
        oq.kpjb[178] = 1180958958;
        oq.kpjb[179] = 624233970;
        oq.kpjb[180] = 949913899;
        oq.kpjb[181] = 304319192;
        oq.kpjb[182] = 1946051572;
        oq.kpjb[183] = -1669100431;
        oq.kpjb[184] = 836679859;
        oq.kpjb[185] = 272225397;
        oq.kpjb[186] = 841683971;
        oq.kpjb[187] = 1726935932;
        oq.kpjb[188] = 1461271403;
        oq.kpjb[189] = -490036664;
        oq.kpjb[190] = 504064385;
        oq.kpjb[191] = -1154080613;
        oq.kpjb[192] = -691829661;
        oq.kpjb[193] = -1893355244;
        oq.kpjb[194] = 1931777115;
        oq.kpjb[195] = 1146349281;
        oq.kpjb[196] = -305744198;
        oq.kpjb[197] = 2016530031;
        oq.kpjb[198] = -561457709;
        oq.kpjb[199] = -1677873239;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void popVertical() {
        v0 /* !! */  = oq.su;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(oq.kpit("kpwf", kpiq(int ), (int)137) - oq.kpit("kpwe", kpiq(int ), (int)136));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 532729400: {
                    break block18;
                }
                case 1490652059: {
                    continue block18;
                }
            }
            break;
        }
        var2 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl15
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - oq.kpit("kpwg", kpiq(int ), (int)138));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -665172004: {
                    v2 = oq.kpit("kpwh", kpiq(int ), (int)139);
                    continue block19;
                }
                case -622239420: {
                    v2 = oq.kpit("kpwi", kpiq(int ), (int)140);
                    continue block19;
                }
                case -192218310: {
                    v2 = oq.kpit("kpwj", kpiq(int ), (int)141);
                    continue block19;
                }
                case 532729400: {
                    break block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = oq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kpwk", kpiq(int ), (int)142)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oq.kpit("kpwl", kpja(int ), (int)209)) break;
            v3 /* !! */  = (long)oq.kpit("kpwm", kpja(int ), (int)210);
        }
        var0_2 = oq.a;
        if (var2) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var0_2) ** GOTO lbl36
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl36
                v4 = oq.kpit("kpwn", kpja(int ), (int)211);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kpwo", kpiq(int ), (int)143)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oq.kpit("kpwp", kpja(int ), (int)212)) break;
                    v5 /* !! */  = (long)oq.kpit("kpwq", kpja(int ), (int)213);
                }
                oq.popVertical((boolean)v4);
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl53:
            // 4 sources

            case 0: {
                var1_1 /* !! */  = (int)oq.kpit("kpwr", kpja(int ), (int)214);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)oq.kpit("kpws", kpja(int ), (int)215);
                if (!var2) ** GOTO lbl53
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)oq.kpit("kpwt", kpja(int ), (int)216);
                if (!var2) ** GOTO lbl53
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)oq.kpit("kpwu", kpja(int ), (int)217);
                if (!var2) ** GOTO lbl53
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)oq.kpit("kpwv", kpja(int ), (int)218);
                    if (!var2) break block10;
                    throw null;
                }
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)oq.kpit("kpww", kpja(int ), (int)219);
        ** while (!var2)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$popVertical$4() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kqbq", kpiq(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oq.kpit("kqbr", kpja(int ), (int)294)) break;
            v0 /* !! */  = (long)oq.kpit("kqbs", kpja(int ), (int)295);
        }
        var2 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - oq.kpit("kqbt", kpiq(int ), (int)194));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1537575882: {
                    v2 = oq.kpit("kqbu", kpiq(int ), (int)195);
                    continue block18;
                }
                case 443668589: {
                    v2 = oq.kpit("kqbv", kpiq(int ), (int)196);
                    continue block18;
                }
                case 532729400: {
                    break block18;
                }
                case 959467256: {
                    v2 = oq.kpit("kqbw", kpiq(int ), (int)197);
                    continue block18;
                }
            }
            break;
        }
        var1_1 /* !! */  = oq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kqbx", kpiq(int ), (int)198)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oq.kpit("kqby", kpja(int ), (int)296)) break;
            v3 /* !! */  = (long)oq.kpit("kqbz", kpja(int ), (int)297);
        }
        var0_2 = oq.a;
        if (var2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl34
                v4 = oq.kpit("kqca", kpja(int ), (int)298);
                v5 /* !! */  = oq.su;
                if (true) ** GOTO lbl46
                block21: while (true) {
                    v5 /* !! */  = (long)(oq.kpit("kqcc", kpiq(int ), (int)200) - oq.kpit("kqcb", kpiq(int ), (int)199));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1504976039: {
                            continue block21;
                        }
                        case 532729400: {
                            break block21;
                        }
                    }
                    break;
                }
                oq.popVertical((boolean)v4);
                if (var0_2) ** continue;
                return;
            }
lbl54:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)oq.kpit("kqcd", kpja(int ), (int)299);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                var1_1 /* !! */  = (int)oq.kpit("kqce", kpja(int ), (int)300);
                if (!var2) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)oq.kpit("kqcf", kpja(int ), (int)301);
                } while (!var2);
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)oq.kpit("kqcg", kpja(int ), (int)302);
                if (!var2) ** GOTO lbl54
                throw null;
            }
            case 4: 
        }
        do {
            var1_1 /* !! */  = (int)oq.kpit("kqch", kpja(int ), (int)303);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void kqfb() {
        oq.kpjb[200] = -908928997;
        oq.kpjb[201] = -602946302;
        oq.kpjb[202] = -1380451346;
        oq.kpjb[203] = 1764480305;
        oq.kpjb[204] = 62493686;
        oq.kpjb[205] = 1125761254;
        oq.kpjb[206] = 820547199;
        oq.kpjb[207] = 843174049;
        oq.kpjb[208] = 2126184787;
        oq.kpjb[209] = -1264444835;
        oq.kpjb[210] = -1306523835;
        oq.kpjb[211] = 1157973361;
        oq.kpjb[212] = -1427595034;
        oq.kpjb[213] = 1171050222;
        oq.kpjb[214] = 1238320727;
        oq.kpjb[215] = -1179420144;
        oq.kpjb[216] = -328200537;
        oq.kpjb[217] = -944618814;
        oq.kpjb[218] = 547316076;
        oq.kpjb[219] = 302744776;
        oq.kpjb[220] = -1783517848;
        oq.kpjb[221] = -945901034;
        oq.kpjb[222] = 291019063;
        oq.kpjb[223] = 740183844;
        oq.kpjb[224] = -432933250;
        oq.kpjb[225] = -1513675111;
        oq.kpjb[226] = -1533890929;
        oq.kpjb[227] = 49726245;
        oq.kpjb[228] = 1358508486;
        oq.kpjb[229] = 1404766725;
        oq.kpjb[230] = 1936658986;
        oq.kpjb[231] = 285716806;
        oq.kpjb[232] = 746237948;
        oq.kpjb[233] = -1880421698;
        oq.kpjb[234] = -594763303;
        oq.kpjb[235] = -429913826;
        oq.kpjb[236] = 1257716243;
        oq.kpjb[237] = 2000931314;
        oq.kpjb[238] = -1261066257;
        oq.kpjb[239] = 332966134;
        oq.kpjb[240] = 1129988863;
        oq.kpjb[241] = -603380805;
        oq.kpjb[242] = 355384140;
        oq.kpjb[243] = -1823951492;
        oq.kpjb[244] = 795189237;
        oq.kpjb[245] = -789135496;
        oq.kpjb[246] = 902164800;
        oq.kpjb[247] = -1413460482;
        oq.kpjb[248] = -1806463900;
        oq.kpjb[249] = 681273017;
        oq.kpjb[250] = -1044532885;
        oq.kpjb[251] = -1390320145;
        oq.kpjb[252] = 1386968399;
        oq.kpjb[253] = 2029814703;
        oq.kpjb[254] = 1246622395;
        oq.kpjb[255] = 2048969231;
        oq.kpjb[256] = 1663600231;
        oq.kpjb[257] = 206509333;
        oq.kpjb[258] = 1248024180;
        oq.kpjb[259] = -1197760528;
        oq.kpjb[260] = -1215833842;
        oq.kpjb[261] = 728390419;
        oq.kpjb[262] = -1246311030;
        oq.kpjb[263] = -85903323;
        oq.kpjb[264] = -1092402753;
        oq.kpjb[265] = 1354624563;
        oq.kpjb[266] = 1368377962;
        oq.kpjb[267] = 1091171318;
        oq.kpjb[268] = 1389313038;
        oq.kpjb[269] = -1821399874;
        oq.kpjb[270] = 1556530301;
        oq.kpjb[271] = -408514360;
        oq.kpjb[272] = 349882422;
        oq.kpjb[273] = -197440168;
        oq.kpjb[274] = -1309988534;
        oq.kpjb[275] = -646245942;
        oq.kpjb[276] = 1336440007;
        oq.kpjb[277] = 534887449;
        oq.kpjb[278] = -1361754674;
        oq.kpjb[279] = 677467258;
        oq.kpjb[280] = 739004857;
        oq.kpjb[281] = 748215376;
        oq.kpjb[282] = -1822271240;
        oq.kpjb[283] = -561481396;
        oq.kpjb[284] = -1293033275;
        oq.kpjb[285] = 9956048;
        oq.kpjb[286] = 1268729379;
        oq.kpjb[287] = 1366620756;
        oq.kpjb[288] = -1992902493;
        oq.kpjb[289] = -564465197;
        oq.kpjb[290] = -1377526303;
        oq.kpjb[291] = 1617427828;
        oq.kpjb[292] = -2020887074;
        oq.kpjb[293] = 522653691;
        oq.kpjb[294] = -1579078735;
        oq.kpjb[295] = -182288367;
        oq.kpjb[296] = -1185608185;
        oq.kpjb[297] = 46087303;
        oq.kpjb[298] = -1451504376;
        oq.kpjb[299] = 873299853;
    }

    private static /* synthetic */ void kqfg() {
        oq.kpjc[300] = -1300282249;
        oq.kpjc[301] = 1511160931;
        oq.kpjc[302] = -2146318887;
        oq.kpjc[303] = 1259737897;
        oq.kpjc[304] = 1367463035;
        oq.kpjc[305] = 545461770;
        oq.kpjc[306] = 1709056049;
        oq.kpjc[307] = -1645212812;
        oq.kpjc[308] = -1971248029;
        oq.kpjc[309] = -1077432416;
        oq.kpjc[310] = 2026586313;
        oq.kpjc[311] = -906635798;
        oq.kpjc[312] = 505247352;
        oq.kpjc[313] = 2093873163;
        oq.kpjc[314] = -414549268;
        oq.kpjc[315] = -895762068;
        oq.kpjc[316] = -1741110327;
        oq.kpjc[317] = 251177338;
        oq.kpjc[318] = 898536139;
        oq.kpjc[319] = 2133665398;
        oq.kpjc[320] = 500612057;
        oq.kpjc[321] = -1582666876;
        oq.kpjc[322] = -71816106;
        oq.kpjc[323] = 1188352834;
        oq.kpjc[324] = 803695127;
        oq.kpjc[325] = 1561920997;
        oq.kpjc[326] = -1936333206;
        oq.kpjc[327] = -454582778;
        oq.kpjc[328] = 457491754;
        oq.kpjc[329] = -2109055508;
        oq.kpjc[330] = -1747077119;
        oq.kpjc[331] = 600565672;
        oq.kpjc[332] = -334313301;
        oq.kpjc[333] = 1886725588;
        oq.kpjc[334] = -1868066042;
        oq.kpjc[335] = 318619582;
        oq.kpjc[336] = -1380314724;
        oq.kpjc[337] = -2017871486;
        oq.kpjc[338] = -2082003127;
        oq.kpjc[339] = -487175457;
        oq.kpjc[340] = -753316863;
        oq.kpjc[341] = -1265021878;
        oq.kpjc[342] = 302665548;
        oq.kpjc[343] = 1713415546;
        oq.kpjc[344] = -488898026;
        oq.kpjc[345] = -7914849;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void pop(boolean var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kpss", kpiq(int ), (int)83)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oq.kpit("kpst", kpja(int ), (int)172)) break;
            v0 /* !! */  = (long)oq.kpit("kpsu", kpja(int ), (int)173);
        }
        var5_1 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl11
        block112: while (true) {
            v1 /* !! */  = (long)(oq.kpit("kpsw", kpiq(int ), (int)85) - oq.kpit("kpsv", kpiq(int ), (int)84));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 532729400: {
                    break block112;
                }
                case 978471503: {
                    continue block112;
                }
            }
            break;
        }
        var4_2 /* !! */  = oq.b;
        v2 /* !! */  = oq.su;
        if (true) ** GOTO lbl21
        block113: while (true) {
            v2 /* !! */  = (long)(v3 - oq.kpit("kpsx", kpiq(int ), (int)86));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1279999954: {
                    v3 = oq.kpit("kpsy", kpiq(int ), (int)87);
                    continue block113;
                }
                case -1197204005: {
                    v3 = oq.kpit("kpsz", kpiq(int ), (int)88);
                    continue block113;
                }
                case -201039520: {
                    v3 = oq.kpit("kpta", kpiq(int ), (int)89);
                    continue block113;
                }
                case 532729400: {
                    break block113;
                }
            }
            break;
        }
        var3_3 = oq.a;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_1) {
                    throw null;
lbl39:
                    // 14 sources

                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl39
                if (!var0) ** GOTO lbl74
                if (var3_3 || var3_3) ** GOTO lbl39
                v4 /* !! */  = oq.su;
                if (true) ** GOTO lbl48
                block115: while (true) {
                    v4 /* !! */  = (long)(v5 - oq.kpit("kptb", kpiq(int ), (int)90));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 532729400: {
                            break block115;
                        }
                        case 931233034: {
                            v5 = oq.kpit("kptc", kpiq(int ), (int)91);
                            continue block115;
                        }
                        case 1643913923: {
                            v5 = oq.kpit("kptd", kpiq(int ), (int)92);
                            continue block115;
                        }
                    }
                    break;
                }
                v6 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$pop$3(), ()V)();
                v7 /* !! */  = oq.su;
                if (true) ** GOTO lbl62
                block116: while (true) {
                    v7 /* !! */  = (long)(v8 - oq.kpit("kpte", kpiq(int ), (int)93));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -112280728: {
                            v8 = oq.kpit("kptf", kpiq(int ), (int)94);
                            continue block116;
                        }
                        case 532729400: {
                            break block116;
                        }
                        case 1265804461: {
                            v8 = oq.kpit("kptg", kpiq(int ), (int)95);
                            continue block116;
                        }
                    }
                    break;
                }
                ki.addOverrideTask(v6);
                if (var3_3 || var3_3) ** GOTO lbl39
                return;
lbl74:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl39
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kpth", kpiq(int ), (int)96)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == oq.kpit("kpti", kpja(int ), (int)174)) break;
                    v9 /* !! */  = (long)oq.kpit("kptj", kpja(int ), (int)175);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = oq.su - oq.kpit("kptk", kpiq(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == oq.kpit("kptl", kpja(int ), (int)176)) break;
                    v10 /* !! */  = (long)oq.kpit("kptm", kpja(int ), (int)177);
                }
                if (oq.stack.isEmpty()) ** GOTO lbl110
                if (var3_3 || var3_3) ** GOTO lbl39
                v11 /* !! */  = oq.su;
                if (true) ** GOTO lbl91
                block119: while (true) {
                    v11 /* !! */  = (long)(v12 - oq.kpit("kptn", kpiq(int ), (int)98));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1773410658: {
                            v12 = oq.kpit("kpto", kpiq(int ), (int)99);
                            continue block119;
                        }
                        case 524479071: {
                            v12 = oq.kpit("kptp", kpiq(int ), (int)100);
                            continue block119;
                        }
                        case 532729400: {
                            break block119;
                        }
                        case 1418371772: {
                            v12 = oq.kpit("kptq", kpiq(int ), (int)101);
                            continue block119;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = oq.su - oq.kpit("kptr", kpiq(int ), (int)102)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == oq.kpit("kpts", kpja(int ), (int)178)) break;
                    v13 /* !! */  = (long)oq.kpit("kptt", kpja(int ), (int)179);
                }
                oq.stack.pop();
                if (var3_3) ** GOTO lbl39
lbl110:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl39
                v14 /* !! */  = oq.su;
                if (true) ** GOTO lbl115
                block121: while (true) {
                    v14 /* !! */  = (long)(oq.kpit("kptv", kpiq(int ), (int)104) - oq.kpit("kptu", kpiq(int ), (int)103));
lbl115:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 532729400: {
                            break block121;
                        }
                        case 846498895: {
                            continue block121;
                        }
                    }
                    break;
                }
                v15 /* !! */  = oq.su;
                if (true) ** GOTO lbl124
                block122: while (true) {
                    v15 /* !! */  = (long)(v16 - oq.kpit("kptw", kpiq(int ), (int)105));
lbl124:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 532729400: {
                            break block122;
                        }
                        case 1375810745: {
                            v16 = oq.kpit("kptx", kpiq(int ), (int)106);
                            continue block122;
                        }
                        case 1595435219: {
                            v16 = oq.kpit("kpty", kpiq(int ), (int)107);
                            continue block122;
                        }
                    }
                    break;
                }
                if (!oq.stack.isEmpty()) ** GOTO lbl157
                if (var3_3 || var3_3) ** GOTO lbl39
                v17 = oq.kpit("kptz", kpja(int ), (int)180);
                v18 /* !! */  = oq.su;
                if (true) ** GOTO lbl140
                block123: while (true) {
                    v18 /* !! */  = (long)(v19 - oq.kpit("kpua", kpiq(int ), (int)108));
lbl140:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1638086327: {
                            v19 = oq.kpit("kpub", kpiq(int ), (int)109);
                            continue block123;
                        }
                        case -255387328: {
                            v19 = oq.kpit("kpuc", kpiq(int ), (int)110);
                            continue block123;
                        }
                        case -829436: {
                            v19 = oq.kpit("kpud", kpiq(int ), (int)111);
                            continue block123;
                        }
                        case 532729400: {
                            break block123;
                        }
                    }
                    break;
                }
                GL11.glDisable((int)v17);
                if (var3_3) ** GOTO lbl39
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl268
lbl157:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl39
                v20 /* !! */  = oq.su;
                if (true) ** GOTO lbl162
                block124: while (true) {
                    v20 /* !! */  = (long)(oq.kpit("kpuf", kpiq(int ), (int)113) - oq.kpit("kpue", kpiq(int ), (int)112));
lbl162:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 532729400: {
                            break block124;
                        }
                        case 542201759: {
                            continue block124;
                        }
                    }
                    break;
                }
                var1_4 = class_310.method_1551();
                if (var3_3 || var3_3) ** GOTO lbl39
                v21 /* !! */  = oq.su;
                if (true) ** GOTO lbl173
                block125: while (true) {
                    v21 /* !! */  = (long)(v22 - oq.kpit("kpug", kpiq(int ), (int)114));
lbl173:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -791735792: {
                            v22 = oq.kpit("kpuh", kpiq(int ), (int)115);
                            continue block125;
                        }
                        case -666878074: {
                            v22 = oq.kpit("kpui", kpiq(int ), (int)116);
                            continue block125;
                        }
                        case 532729400: {
                            break block125;
                        }
                        case 1202492151: {
                            v22 = oq.kpit("kpuj", kpiq(int ), (int)117);
                            continue block125;
                        }
                    }
                    break;
                }
                v23 = var1_4.method_22683();
                v24 /* !! */  = oq.su;
                if (true) ** GOTO lbl190
                block126: while (true) {
                    v24 /* !! */  = (long)(oq.kpit("kpul", kpiq(int ), (int)119) - oq.kpit("kpuk", kpiq(int ), (int)118));
lbl190:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 491289921: {
                            continue block126;
                        }
                        case 532729400: {
                            break block126;
                        }
                    }
                    break;
                }
                v25 = v23.method_4480();
                v26 /* !! */  = oq.su;
                if (true) ** GOTO lbl200
                block127: while (true) {
                    v26 /* !! */  = (long)(v27 - oq.kpit("kpum", kpiq(int ), (int)120));
lbl200:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1181419312: {
                            v27 = oq.kpit("kpun", kpiq(int ), (int)121);
                            continue block127;
                        }
                        case 44531521: {
                            v27 = oq.kpit("kpuo", kpiq(int ), (int)122);
                            continue block127;
                        }
                        case 285277919: {
                            v27 = oq.kpit("kpup", kpiq(int ), (int)123);
                            continue block127;
                        }
                        case 532729400: {
                            break block127;
                        }
                    }
                    break;
                }
                v28 = v25 / (float)ki.getFixedScaledWidth();
                v29 /* !! */  = oq.su;
                if (true) ** GOTO lbl217
                block128: while (true) {
                    v29 /* !! */  = (long)(v30 - oq.kpit("kpuq", kpiq(int ), (int)124));
lbl217:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1571205414: {
                            v30 = oq.kpit("kpur", kpiq(int ), (int)125);
                            continue block128;
                        }
                        case -441010626: {
                            v30 = oq.kpit("kpus", kpiq(int ), (int)126);
                            continue block128;
                        }
                        case 532729400: {
                            break block128;
                        }
                        case 1916804040: {
                            v30 = oq.kpit("kput", kpiq(int ), (int)127);
                            continue block128;
                        }
                    }
                    break;
                }
                var2_5 = v28 * ki.getContextScale();
                if (var3_3 || var3_3) ** GOTO lbl39
                v31 /* !! */  = oq.su;
                if (true) ** GOTO lbl235
                block129: while (true) {
                    v31 /* !! */  = (long)(v32 - oq.kpit("kpuu", kpiq(int ), (int)128));
lbl235:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -582934366: {
                            v32 = oq.kpit("kpuv", kpiq(int ), (int)129);
                            continue block129;
                        }
                        case -507002510: {
                            v32 = oq.kpit("kpuw", kpiq(int ), (int)130);
                            continue block129;
                        }
                        case 532729400: {
                            break block129;
                        }
                    }
                    break;
                }
                v33 /* !! */  = oq.su;
                if (true) ** GOTO lbl248
                block130: while (true) {
                    v33 /* !! */  = (long)(v34 - oq.kpit("kpux", kpiq(int ), (int)131));
lbl248:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1651577304: {
                            v34 = oq.kpit("kpuy", kpiq(int ), (int)132);
                            continue block130;
                        }
                        case -1068794929: {
                            v34 = oq.kpit("kpuz", kpiq(int ), (int)133);
                            continue block130;
                        }
                        case 532729400: {
                            break block130;
                        }
                    }
                    break;
                }
                v35 /* !! */  = oq.su;
                if (true) ** GOTO lbl261
                block131: while (true) {
                    v35 /* !! */  = (long)(oq.kpit("kpvb", kpiq(int ), (int)135) - oq.kpit("kpva", kpiq(int ), (int)134));
lbl261:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case 532729400: {
                            break block131;
                        }
                        case 1716699799: {
                            continue block131;
                        }
                    }
                    break;
                }
                oq.apply(oq.stack.peek(), var2_5, var1_4);
                if (var3_3) ** GOTO lbl39
lbl268:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl271:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)oq.kpit("kpvc", kpja(int ), (int)181);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl276:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)oq.kpit("kpvd", kpja(int ), (int)182);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 2: {
                do {
                    var4_2 /* !! */  = (int)oq.kpit("kpve", kpja(int ), (int)183);
                } while (!var5_1);
                throw null;
            }
            case 3: {
                var4_2 /* !! */  = (int)oq.kpit("kpvf", kpja(int ), (int)184);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl291:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)oq.kpit("kpvg", kpja(int ), (int)185);
                if (!var5_1) ** GOTO lbl276
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)oq.kpit("kpvh", kpja(int ), (int)186);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 6: {
                do {
                    var4_2 /* !! */  = (int)oq.kpit("kpvi", kpja(int ), (int)187);
                } while (!var5_1);
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)oq.kpit("kpvj", kpja(int ), (int)188);
                if (!var5_1) ** GOTO lbl291
                throw null;
            }
lbl309:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)oq.kpit("kpvk", kpja(int ), (int)189);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl314:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)oq.kpit("kpvl", kpja(int ), (int)190);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl319:
            // 5 sources

            case 10: {
                var4_2 /* !! */  = (int)oq.kpit("kpvm", kpja(int ), (int)191);
                if (!var5_1) ** GOTO lbl309
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)oq.kpit("kpvn", kpja(int ), (int)192);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl328:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)oq.kpit("kpvo", kpja(int ), (int)193);
                if (!var5_1) ** GOTO lbl271
                throw null;
            }
lbl332:
            // 4 sources

            case 13: {
                var4_2 /* !! */  = (int)oq.kpit("kpvp", kpja(int ), (int)194);
                if (!var5_1) ** GOTO lbl319
                throw null;
            }
lbl336:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)oq.kpit("kpvq", kpja(int ), (int)195);
                if (!var5_1) ** GOTO lbl319
                throw null;
            }
lbl340:
            // 3 sources

            case 15: {
                var4_2 /* !! */  = (int)oq.kpit("kpvr", kpja(int ), (int)196);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl345:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)oq.kpit("kpvs", kpja(int ), (int)197);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 17: {
                var4_2 /* !! */  = (int)oq.kpit("kpvt", kpja(int ), (int)198);
                if (!var5_1) ** GOTO lbl332
                throw null;
            }
lbl354:
            // 3 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)oq.kpit("kpvu", kpja(int ), (int)199);
                    if (!var5_1) ** GOTO lbl345
                    throw null;
                }
            }
            case 19: {
                var4_2 /* !! */  = (int)oq.kpit("kpvv", kpja(int ), (int)200);
                if (var5_1) {
                    throw null;
                }
            }
            case 20: {
                var4_2 /* !! */  = (int)oq.kpit("kpvw", kpja(int ), (int)201);
                if (var5_1) {
                    throw null;
                }
            }
lbl367:
            // 6 sources

            case 21: {
                var4_2 /* !! */  = (int)oq.kpit("kpvx", kpja(int ), (int)202);
                if (!var5_1) ** GOTO lbl319
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)oq.kpit("kpvy", kpja(int ), (int)203);
                if (!var5_1) ** GOTO lbl328
                throw null;
            }
            case 23: {
                var4_2 /* !! */  = (int)oq.kpit("kpvz", kpja(int ), (int)204);
                if (!var5_1) ** GOTO lbl354
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)oq.kpit("kpwa", kpja(int ), (int)205);
                if (!var5_1) ** GOTO lbl340
                throw null;
            }
lbl383:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)oq.kpit("kpwb", kpja(int ), (int)206);
                if (!var5_1) ** GOTO lbl354
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)oq.kpit("kpwc", kpja(int ), (int)207);
                if (!var5_1) ** GOTO lbl319
                throw null;
            }
            case 27: 
        }
        var4_2 /* !! */  = (int)oq.kpit("kpwd", kpja(int ), (int)208);
        ** while (!var5_1)
lbl394:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kqez() {
        oq.kpjb[0] = -861006994;
        oq.kpjb[1] = 1760695236;
        oq.kpjb[2] = -604086015;
        oq.kpjb[3] = -1649943391;
        oq.kpjb[4] = 654721882;
        oq.kpjb[5] = -993617917;
        oq.kpjb[6] = -2114905871;
        oq.kpjb[7] = -760226738;
        oq.kpjb[8] = -1797263148;
        oq.kpjb[9] = -510096011;
        oq.kpjb[10] = 509689482;
        oq.kpjb[11] = 1727300469;
        oq.kpjb[12] = 1453166758;
        oq.kpjb[13] = -1905063789;
        oq.kpjb[14] = -794501310;
        oq.kpjb[15] = -41267689;
        oq.kpjb[16] = -2135947929;
        oq.kpjb[17] = 1639354765;
        oq.kpjb[18] = -746201973;
        oq.kpjb[19] = 162170677;
        oq.kpjb[20] = -726553928;
        oq.kpjb[21] = 26804689;
        oq.kpjb[22] = 598750405;
        oq.kpjb[23] = -1718684783;
        oq.kpjb[24] = 1603693957;
        oq.kpjb[25] = -547428780;
        oq.kpjb[26] = 1987912979;
        oq.kpjb[27] = 2085649164;
        oq.kpjb[28] = 835306108;
        oq.kpjb[29] = -1949933858;
        oq.kpjb[30] = -985756759;
        oq.kpjb[31] = -2080302767;
        oq.kpjb[32] = 2054412538;
        oq.kpjb[33] = 143991264;
        oq.kpjb[34] = 1145397029;
        oq.kpjb[35] = -763012404;
        oq.kpjb[36] = 424610758;
        oq.kpjb[37] = -1775139700;
        oq.kpjb[38] = 1429688452;
        oq.kpjb[39] = -852366544;
        oq.kpjb[40] = -745424473;
        oq.kpjb[41] = -1471631675;
        oq.kpjb[42] = 1626663205;
        oq.kpjb[43] = 1886778899;
        oq.kpjb[44] = 0x1FFFFD1F;
        oq.kpjb[45] = 1476549596;
        oq.kpjb[46] = -141379051;
        oq.kpjb[47] = 35873120;
        oq.kpjb[48] = -411305867;
        oq.kpjb[49] = -412824047;
        oq.kpjb[50] = 1643999556;
        oq.kpjb[51] = -1972231068;
        oq.kpjb[52] = -1985828601;
        oq.kpjb[53] = -1366173393;
        oq.kpjb[54] = 1376380713;
        oq.kpjb[55] = -1981006684;
        oq.kpjb[56] = 898015614;
        oq.kpjb[57] = 1089091888;
        oq.kpjb[58] = -425429786;
        oq.kpjb[59] = 864544431;
        oq.kpjb[60] = 1584146793;
        oq.kpjb[61] = 459120456;
        oq.kpjb[62] = -181599284;
        oq.kpjb[63] = 1400263774;
        oq.kpjb[64] = -904747294;
        oq.kpjb[65] = 1457989074;
        oq.kpjb[66] = 834619250;
        oq.kpjb[67] = -1728017782;
        oq.kpjb[68] = 1521230243;
        oq.kpjb[69] = -2006148215;
        oq.kpjb[70] = -1037582727;
        oq.kpjb[71] = 1792828047;
        oq.kpjb[72] = -276386572;
        oq.kpjb[73] = 1727597286;
        oq.kpjb[74] = 1013416525;
        oq.kpjb[75] = -481559684;
        oq.kpjb[76] = -947978839;
        oq.kpjb[77] = 519385163;
        oq.kpjb[78] = 847924500;
        oq.kpjb[79] = 684727243;
        oq.kpjb[80] = 721874089;
        oq.kpjb[81] = -190969895;
        oq.kpjb[82] = 2078625234;
        oq.kpjb[83] = -674700425;
        oq.kpjb[84] = -490888274;
        oq.kpjb[85] = 1063044031;
        oq.kpjb[86] = 1321581348;
        oq.kpjb[87] = -2035183590;
        oq.kpjb[88] = -2126452261;
        oq.kpjb[89] = -175861198;
        oq.kpjb[90] = -272255192;
        oq.kpjb[91] = -701735786;
        oq.kpjb[92] = 90325923;
        oq.kpjb[93] = -916662951;
        oq.kpjb[94] = -1068279922;
        oq.kpjb[95] = -304104753;
        oq.kpjb[96] = 1969346895;
        oq.kpjb[97] = -1381715955;
        oq.kpjb[98] = 1650386882;
        oq.kpjb[99] = 2138467764;
    }

    private static /* synthetic */ void kqfe() {
        oq.kpjc[100] = 662460864;
        oq.kpjc[101] = -752414905;
        oq.kpjc[102] = 1759689091;
        oq.kpjc[103] = -299349822;
        oq.kpjc[104] = 1194871627;
        oq.kpjc[105] = -1866166399;
        oq.kpjc[106] = 625480586;
        oq.kpjc[107] = -1823893892;
        oq.kpjc[108] = 1286766820;
        oq.kpjc[109] = -1916082686;
        oq.kpjc[110] = -439215914;
        oq.kpjc[111] = 331049966;
        oq.kpjc[112] = 49325531;
        oq.kpjc[113] = 969387899;
        oq.kpjc[114] = -764365020;
        oq.kpjc[115] = -1493734363;
        oq.kpjc[116] = 255595805;
        oq.kpjc[117] = -2021734090;
        oq.kpjc[118] = 1089139548;
        oq.kpjc[119] = 588627953;
        oq.kpjc[120] = -856264794;
        oq.kpjc[121] = -796223366;
        oq.kpjc[122] = 678504235;
        oq.kpjc[123] = -1311488533;
        oq.kpjc[124] = -1837324748;
        oq.kpjc[125] = 783213619;
        oq.kpjc[126] = 1956447182;
        oq.kpjc[127] = -1651360071;
        oq.kpjc[128] = -1846645199;
        oq.kpjc[129] = -1968965232;
        oq.kpjc[130] = -2045952055;
        oq.kpjc[131] = 1602422212;
        oq.kpjc[132] = 1801456953;
        oq.kpjc[133] = 529023130;
        oq.kpjc[134] = 1977824023;
        oq.kpjc[135] = -875366282;
        oq.kpjc[136] = 256362563;
        oq.kpjc[137] = -2117423104;
        oq.kpjc[138] = -2087105355;
        oq.kpjc[139] = 1688426578;
        oq.kpjc[140] = 973053332;
        oq.kpjc[141] = 2021559871;
        oq.kpjc[142] = -692012299;
        oq.kpjc[143] = 139297716;
        oq.kpjc[144] = -1320279885;
        oq.kpjc[145] = 1754140131;
        oq.kpjc[146] = 362172958;
        oq.kpjc[147] = 1760983120;
        oq.kpjc[148] = -596279316;
        oq.kpjc[149] = 1808690213;
        oq.kpjc[150] = 718632238;
        oq.kpjc[151] = 1531626092;
        oq.kpjc[152] = -491567548;
        oq.kpjc[153] = -56004481;
        oq.kpjc[154] = 1255523813;
        oq.kpjc[155] = 947746286;
        oq.kpjc[156] = 1973532536;
        oq.kpjc[157] = -1155873371;
        oq.kpjc[158] = -127534260;
        oq.kpjc[159] = -891041046;
        oq.kpjc[160] = 1865146705;
        oq.kpjc[161] = 1607558335;
        oq.kpjc[162] = 826116532;
        oq.kpjc[163] = -1337764317;
        oq.kpjc[164] = 1399177387;
        oq.kpjc[165] = -726499292;
        oq.kpjc[166] = -1011787210;
        oq.kpjc[167] = -981865192;
        oq.kpjc[168] = 1186716975;
        oq.kpjc[169] = 745540177;
        oq.kpjc[170] = 1441843440;
        oq.kpjc[171] = 1324427769;
        oq.kpjc[172] = -1511982035;
        oq.kpjc[173] = -1713067427;
        oq.kpjc[174] = -671220497;
        oq.kpjc[175] = -371341331;
        oq.kpjc[176] = 2065233481;
        oq.kpjc[177] = -1904682588;
        oq.kpjc[178] = 1180958959;
        oq.kpjc[179] = -1298873779;
        oq.kpjc[180] = 949912890;
        oq.kpjc[181] = 304319190;
        oq.kpjc[182] = 1946051571;
        oq.kpjc[183] = -1669100440;
        oq.kpjc[184] = 836679851;
        oq.kpjc[185] = 272225382;
        oq.kpjc[186] = 841683979;
        oq.kpjc[187] = 1726935926;
        oq.kpjc[188] = 1461271395;
        oq.kpjc[189] = -490036659;
        oq.kpjc[190] = 504064410;
        oq.kpjc[191] = -1154080630;
        oq.kpjc[192] = -691829644;
        oq.kpjc[193] = -1893355252;
        oq.kpjc[194] = 1931777111;
        oq.kpjc[195] = 1146349286;
        oq.kpjc[196] = -305744224;
        oq.kpjc[197] = 2016530018;
        oq.kpjc[198] = -561457711;
        oq.kpjc[199] = -1677873238;
    }

    private static /* synthetic */ void kqfj() {
        oq.kpir[200] = -4417101542608395948L;
        oq.kpir[201] = -7959272177153408468L;
        oq.kpir[202] = -2502618800096205591L;
        oq.kpir[203] = -610562241375296837L;
        oq.kpir[204] = -3069629671108533708L;
        oq.kpir[205] = 6611264197918040581L;
        oq.kpir[206] = 9028132378444648678L;
        oq.kpir[207] = -4107157729808048314L;
        oq.kpir[208] = -2086816074213376238L;
        oq.kpir[209] = -3893326075754612593L;
        oq.kpir[210] = -7346729030663003865L;
        oq.kpir[211] = 3188465863970818L;
        oq.kpir[212] = 5961327970823001479L;
        oq.kpir[213] = 1722782625000297171L;
        oq.kpir[214] = -5242662164715755147L;
        oq.kpir[215] = 4089648338998735206L;
        oq.kpir[216] = 4025212186142047758L;
        oq.kpir[217] = -4104245398990612947L;
        oq.kpir[218] = -5709445098568649195L;
        oq.kpir[219] = -6906377011198559920L;
        oq.kpir[220] = 158521592260483206L;
        oq.kpir[221] = -6301097498526023781L;
        oq.kpir[222] = -8556565626742996985L;
        oq.kpir[223] = 6690701003021865342L;
        oq.kpir[224] = -420184562586500943L;
        oq.kpir[225] = -4307492560177545800L;
        oq.kpir[226] = -4264030182106967602L;
        oq.kpir[227] = -7833305394458060616L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void popVertical(boolean var0) {
        block122: {
            block121: {
                block120: {
                    block119: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kpwx", kpiq(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == oq.kpit("kpwy", kpja(int ), (int)220)) break;
                            v0 /* !! */  = (long)oq.kpit("kpwz", kpja(int ), (int)221);
                        }
                        var5_1 = oq.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kpxa", kpiq(int ), (int)145)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  == oq.kpit("kpxb", kpja(int ), (int)222)) break;
                            v1 /* !! */  = (long)oq.kpit("kpxc", kpja(int ), (int)223);
                        }
                        var4_2 /* !! */  = oq.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = oq.su - oq.kpit("kpxd", kpiq(int ), (int)146)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == oq.kpit("kpxe", kpja(int ), (int)224)) break;
                            v2 /* !! */  = (long)oq.kpit("kpxf", kpja(int ), (int)225);
                        }
                        var3_3 = oq.a;
                        if (var5_1) {
                            throw null;
lbl21:
                            // 14 sources

                            return;
                        }
                        if (var3_3 || var3_3) ** GOTO lbl21
                        if (!var0) break block119;
                        if (var3_3 || var3_3) ** GOTO lbl21
                        v3 /* !! */  = oq.su;
                        if (true) ** GOTO lbl30
                        block80: while (true) {
                            v3 /* !! */  = (long)(v4 - oq.kpit("kpxg", kpiq(int ), (int)147));
lbl30:
                            // 2 sources

                            switch ((int)v3 /* !! */ ) {
                                case -2080783661: {
                                    v4 = oq.kpit("kpxh", kpiq(int ), (int)148);
                                    continue block80;
                                }
                                case -160408587: {
                                    v4 = oq.kpit("kpxi", kpiq(int ), (int)149);
                                    continue block80;
                                }
                                case 15414277: {
                                    v4 = oq.kpit("kpxj", kpiq(int ), (int)150);
                                    continue block80;
                                }
                                case 532729400: {
                                    break block80;
                                }
                            }
                            break;
                        }
                        v5 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$popVertical$4(), ()V)();
                        v6 /* !! */  = oq.su;
                        if (true) ** GOTO lbl47
                        block81: while (true) {
                            v6 /* !! */  = (long)(v7 - oq.kpit("kpxk", kpiq(int ), (int)151));
lbl47:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -487371203: {
                                    v7 = oq.kpit("kpxl", kpiq(int ), (int)152);
                                    continue block81;
                                }
                                case 196325185: {
                                    v7 = oq.kpit("kpxm", kpiq(int ), (int)153);
                                    continue block81;
                                }
                                case 532729400: {
                                    break block81;
                                }
                                case 1963672664: {
                                    v7 = oq.kpit("kpxn", kpiq(int ), (int)154);
                                    continue block81;
                                }
                            }
                            break;
                        }
                        ki.addOverrideTask(v5);
                        if (var3_3 || var3_3) ** GOTO lbl21
                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl21
                    v8 /* !! */  = oq.su;
                    if (true) ** GOTO lbl68
                    block82: while (true) {
                        v8 /* !! */  = (long)(v9 - oq.kpit("kpxo", kpiq(int ), (int)155));
lbl68:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -725570287: {
                                v9 = oq.kpit("kpxp", kpiq(int ), (int)156);
                                continue block82;
                            }
                            case 531218214: {
                                v9 = oq.kpit("kpxq", kpiq(int ), (int)157);
                                continue block82;
                            }
                            case 532729400: {
                                break block82;
                            }
                        }
                        break;
                    }
                    v10 /* !! */  = oq.su;
                    if (true) ** GOTO lbl81
                    block83: while (true) {
                        v10 /* !! */  = (long)(v11 - oq.kpit("kpxr", kpiq(int ), (int)158));
lbl81:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -780521283: {
                                v11 = oq.kpit("kpxs", kpiq(int ), (int)159);
                                continue block83;
                            }
                            case -677319283: {
                                v11 = oq.kpit("kpxt", kpiq(int ), (int)160);
                                continue block83;
                            }
                            case 532729400: {
                                break block83;
                            }
                        }
                        break;
                    }
                    if (oq.verticalStack.isEmpty()) break block120;
                    if (var3_3 || var3_3) ** GOTO lbl21
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_3 = oq.su - oq.kpit("kpxu", kpiq(int ), (int)161)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == oq.kpit("kpxv", kpja(int ), (int)226)) break;
                        v12 /* !! */  = (long)oq.kpit("kpxw", kpja(int ), (int)227);
                    }
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_4 = oq.su - oq.kpit("kpxx", kpiq(int ), (int)162)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == oq.kpit("kpxy", kpja(int ), (int)228)) break;
                        v13 /* !! */  = (long)oq.kpit("kpxz", kpja(int ), (int)229);
                    }
                    oq.verticalStack.pop();
                    if (var3_3) ** GOTO lbl21
                }
                if (var3_3 || var3_3) ** GOTO lbl21
                v14 /* !! */  = oq.su;
                if (true) ** GOTO lbl110
                block86: while (true) {
                    v14 /* !! */  = (long)(v15 - oq.kpit("kpya", kpiq(int ), (int)163));
lbl110:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2076188570: {
                            v15 = oq.kpit("kpyb", kpiq(int ), (int)164);
                            continue block86;
                        }
                        case -658339006: {
                            v15 = oq.kpit("kpyc", kpiq(int ), (int)165);
                            continue block86;
                        }
                        case 532729400: {
                            break block86;
                        }
                    }
                    break;
                }
                v16 /* !! */  = oq.su;
                if (true) ** GOTO lbl123
                block87: while (true) {
                    v16 /* !! */  = (long)(oq.kpit("kpye", kpiq(int ), (int)167) - oq.kpit("kpyd", kpiq(int ), (int)166));
lbl123:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 532729400: {
                            break block87;
                        }
                        case 1532924003: {
                            continue block87;
                        }
                    }
                    break;
                }
                if (!oq.verticalStack.isEmpty()) break block121;
                if (var3_3 || var3_3) ** GOTO lbl21
                v17 = oq.kpit("kpyf", kpja(int ), (int)230);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = oq.su - oq.kpit("kpyg", kpiq(int ), (int)168)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == oq.kpit("kpyh", kpja(int ), (int)231)) break;
                    v18 /* !! */  = (long)oq.kpit("kpyi", kpja(int ), (int)232);
                }
                GL11.glDisable((int)v17);
                if (var3_3) ** GOTO lbl21
                if (var5_1) {
                    throw null;
                }
                break block122;
            }
            if (var3_3 || var3_3) ** GOTO lbl21
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_6 = oq.su - oq.kpit("kpyj", kpiq(int ), (int)169)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == oq.kpit("kpyk", kpja(int ), (int)233)) break;
                v19 /* !! */  = (long)oq.kpit("kpyl", kpja(int ), (int)234);
            }
            var1_4 = class_310.method_1551();
            if (var3_3 || var3_3) ** GOTO lbl21
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_7 = oq.su - oq.kpit("kpym", kpiq(int ), (int)170)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == oq.kpit("kpyn", kpja(int ), (int)235)) break;
                v20 /* !! */  = (long)oq.kpit("kpyo", kpja(int ), (int)236);
            }
            v21 = var1_4.method_22683();
            v22 /* !! */  = oq.su;
            if (true) ** GOTO lbl160
            block91: while (true) {
                v22 /* !! */  = (long)(v23 - oq.kpit("kpyp", kpiq(int ), (int)171));
lbl160:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -2109536108: {
                        v23 = oq.kpit("kpyq", kpiq(int ), (int)172);
                        continue block91;
                    }
                    case -33024797: {
                        v23 = oq.kpit("kpyr", kpiq(int ), (int)173);
                        continue block91;
                    }
                    case 532729400: {
                        break block91;
                    }
                    case 1588821829: {
                        v23 = oq.kpit("kpys", kpiq(int ), (int)174);
                        continue block91;
                    }
                }
                break;
            }
            v24 = v21.method_4480();
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_8 = oq.su - oq.kpit("kpyt", kpiq(int ), (int)175)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == oq.kpit("kpyu", kpja(int ), (int)237)) break;
                v25 /* !! */  = (long)oq.kpit("kpyv", kpja(int ), (int)238);
            }
            v26 = v24 / (float)ki.getFixedScaledWidth();
            v27 /* !! */  = oq.su;
            if (true) ** GOTO lbl183
            block93: while (true) {
                v27 /* !! */  = (long)(v28 - oq.kpit("kpyw", kpiq(int ), (int)176));
lbl183:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -1787334783: {
                        v28 = oq.kpit("kpyx", kpiq(int ), (int)177);
                        continue block93;
                    }
                    case -1697032336: {
                        v28 = oq.kpit("kpyy", kpiq(int ), (int)178);
                        continue block93;
                    }
                    case 532729400: {
                        break block93;
                    }
                }
                break;
            }
            var2_5 = v26 * ki.getContextScale();
            if (var3_3 || var3_3) ** GOTO lbl21
            v29 /* !! */  = oq.su;
            if (true) ** GOTO lbl198
            block94: while (true) {
                v29 /* !! */  = (long)(oq.kpit("kpza", kpiq(int ), (int)180) - oq.kpit("kpyz", kpiq(int ), (int)179));
lbl198:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case 195221444: {
                        continue block94;
                    }
                    case 532729400: {
                        break block94;
                    }
                }
                break;
            }
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_9 = oq.su - oq.kpit("kpzb", kpiq(int ), (int)181)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == oq.kpit("kpzc", kpja(int ), (int)239)) break;
                v30 /* !! */  = (long)oq.kpit("kpzd", kpja(int ), (int)240);
            }
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_10 = oq.su - oq.kpit("kpze", kpiq(int ), (int)182)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == oq.kpit("kpzf", kpja(int ), (int)241)) break;
                v31 /* !! */  = (long)oq.kpit("kpzg", kpja(int ), (int)242);
            }
            oq.apply(oq.verticalStack.peek(), var2_5, var1_4);
            if (var3_3) ** GOTO lbl21
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)oq.kpit("kpzh", kpja(int ), (int)243);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 1: {
                var4_2 /* !! */  = (int)oq.kpit("kpzi", kpja(int ), (int)244);
                if (!var5_1) break;
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)oq.kpit("kpzj", kpja(int ), (int)245);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl236:
            // 4 sources

            case 3: {
                var4_2 /* !! */  = (int)oq.kpit("kpzk", kpja(int ), (int)246);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl316
            }
            case 4: {
                var4_2 /* !! */  = (int)oq.kpit("kpzl", kpja(int ), (int)247);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 5: {
                var4_2 /* !! */  = (int)oq.kpit("kpzm", kpja(int ), (int)248);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl312
            }
            case 6: {
                var4_2 /* !! */  = (int)oq.kpit("kpzn", kpja(int ), (int)249);
                if (!var5_1) ** GOTO lbl236
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)oq.kpit("kpzo", kpja(int ), (int)250);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl260:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)oq.kpit("kpzp", kpja(int ), (int)251);
                if (!var5_1) break;
                throw null;
            }
lbl264:
            // 4 sources

            case 9: {
                do {
                    var4_2 /* !! */  = (int)oq.kpit("kpzq", kpja(int ), (int)252);
                } while (!var5_1);
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)oq.kpit("kpzr", kpja(int ), (int)253);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl274:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)oq.kpit("kpzs", kpja(int ), (int)254);
                if (!var5_1) ** GOTO lbl236
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)oq.kpit("kpzt", kpja(int ), (int)255);
                if (!var5_1) ** GOTO lbl264
                throw null;
            }
lbl282:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)oq.kpit("kpzu", kpja(int ), (int)256);
                if (!var5_1) ** GOTO lbl236
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)oq.kpit("kpzv", kpja(int ), (int)257);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 15: {
                var4_2 /* !! */  = (int)oq.kpit("kpzw", kpja(int ), (int)258);
                if (!var5_1) ** GOTO lbl260
                throw null;
            }
lbl295:
            // 2 sources

            case 16: {
                do {
                    var4_2 /* !! */  = (int)oq.kpit("kpzx", kpja(int ), (int)259);
                } while (!var5_1);
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)oq.kpit("kpzy", kpja(int ), (int)260);
                if (!var5_1) ** GOTO lbl274
                throw null;
            }
lbl304:
            // 4 sources

            case 18: {
                var4_2 /* !! */  = (int)oq.kpit("kpzz", kpja(int ), (int)261);
                if (!var5_1) ** GOTO lbl264
                throw null;
            }
lbl308:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)oq.kpit("kqaa", kpja(int ), (int)262);
                if (!var5_1) break;
                throw null;
            }
lbl312:
            // 3 sources

            case 20: {
                var4_2 /* !! */  = (int)oq.kpit("kqab", kpja(int ), (int)263);
                if (!var5_1) ** GOTO lbl304
                throw null;
            }
lbl316:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)oq.kpit("kqac", kpja(int ), (int)264);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl338
                    break;
                }
            }
            case 22: {
                var4_2 /* !! */  = (int)oq.kpit("kqad", kpja(int ), (int)265);
                if (!var5_1) ** GOTO lbl304
                throw null;
            }
lbl326:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)oq.kpit("kqae", kpja(int ), (int)266);
                if (!var5_1) ** GOTO lbl312
                throw null;
            }
lbl330:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)oq.kpit("kqaf", kpja(int ), (int)267);
                if (!var5_1) ** GOTO lbl326
                throw null;
            }
            case 25: {
                var4_2 /* !! */  = (int)oq.kpit("kqag", kpja(int ), (int)268);
                if (!var5_1) ** GOTO lbl330
                throw null;
            }
lbl338:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)oq.kpit("kqah", kpja(int ), (int)269);
                if (!var5_1) ** GOTO lbl274
                throw null;
            }
            case 27: 
        }
        var4_2 /* !! */  = (int)oq.kpit("kqai", kpja(int ), (int)270);
        ** while (!var5_1)
lbl345:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kqfm() {
        oq.kpis[200] = -4970203099336890501L;
        oq.kpis[201] = 258965830045603801L;
        oq.kpis[202] = 5949049249539437815L;
        oq.kpis[203] = -5332707366568198245L;
        oq.kpis[204] = 7068117594577795793L;
        oq.kpis[205] = -3303568788790067082L;
        oq.kpis[206] = 7088116916101996039L;
        oq.kpis[207] = 5698213706661374645L;
        oq.kpis[208] = -7285199525373707482L;
        oq.kpis[209] = -3490897607507736883L;
        oq.kpis[210] = 8041046164457108115L;
        oq.kpis[211] = 5903055117468670804L;
        oq.kpis[212] = -220993622961227614L;
        oq.kpis[213] = -3183024958108559930L;
        oq.kpis[214] = 2657642625020634438L;
        oq.kpis[215] = 5298906130576871742L;
        oq.kpis[216] = 1979534463751609229L;
        oq.kpis[217] = -6615300641790109902L;
        oq.kpis[218] = 8397155350888530235L;
        oq.kpis[219] = -1015736878961329624L;
        oq.kpis[220] = -2269982903285454930L;
        oq.kpis[221] = 99928172132596007L;
        oq.kpis[222] = -2709427331772585357L;
        oq.kpis[223] = -3310727236552005280L;
        oq.kpis[224] = 4740477217987623759L;
        oq.kpis[225] = -1789016296297022999L;
        oq.kpis[226] = 3000453579070884882L;
        oq.kpis[227] = 3706592127762968282L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void reset() {
        boolean bl2;
        Object object = su;
        block8: while (true) {
            switch ((int)object) {
                case 532729400: {
                    break block8;
                }
                case 1121107538: {
                    object = oq.kpit("kqak", kpiq(int ), (int)184) - oq.kpit("kqaj", kpiq(int ), (int)183);
                    continue block8;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = su - oq.kpit("kqal", kpiq(int ), (int)185)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == oq.kpit("kqam", kpja(int ), (int)271)) break;
            object2 = oq.kpit("kqan", kpja(int ), (int)272);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = su - oq.kpit("kqao", kpiq(int ), (int)186)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == oq.kpit("kqap", kpja(int ), (int)273)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = oq.kpit("kqaq", kpja(int ), (int)274);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = su - oq.kpit("kqar", kpiq(int ), (int)187)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == oq.kpit("kqas", kpja(int ), (int)275)) break;
            object4 = oq.kpit("kqat", kpja(int ), (int)276);
        }
        while (true) {
            long l5;
            Object object5;
            if ((object5 = (l5 = su - oq.kpit("kqau", kpiq(int ), (int)188)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object5 == oq.kpit("kqav", kpja(int ), (int)277)) {
                stack.clear();
                if (bl2) return;
                break;
            }
            object5 = oq.kpit("kqaw", kpja(int ), (int)278);
        }
        if (bl2) return;
        while (true) {
            long l6;
            Object object6;
            if ((object6 = (l6 = su - oq.kpit("kqax", kpiq(int ), (int)189)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object6 == oq.kpit("kqay", kpja(int ), (int)279)) break;
            object6 = oq.kpit("kqaz", kpja(int ), (int)280);
        }
        Object object7 = su;
        block14: while (true) {
            switch ((int)object7) {
                case -1178222210: {
                    object7 = oq.kpit("kqbb", kpiq(int ), (int)191) - oq.kpit("kqba", kpiq(int ), (int)190);
                    continue block14;
                }
                case 532729400: {
                    break block14;
                }
            }
            break;
        }
        verticalStack.clear();
        if (bl2 || bl2) return;
        CallSite callSite = oq.kpit("kqbc", kpja(int ), (int)281);
        while (true) {
            long l7;
            Object object8;
            if ((object8 = (l7 = su - oq.kpit("kqbd", kpiq(int ), (int)192)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object8 == oq.kpit("kqbe", kpja(int ), (int)282)) {
                GL11.glDisable((int)callSite);
                if (bl2) return;
                break;
            }
            object8 = oq.kpit("kqbf", kpja(int ), (int)283);
        }
        if (!bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void apply(oq$Rectangle var0, float var1_1, class_310 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kpom", kpiq(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oq.kpit("kpon", kpja(int ), (int)128)) break;
            v0 /* !! */  = (long)oq.kpit("kpoo", kpja(int ), (int)129);
        }
        var11_3 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl11
        block113: while (true) {
            v1 /* !! */  = (long)(v2 - oq.kpit("kpop", kpiq(int ), (int)18));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -331465539: {
                    v2 = oq.kpit("kpoq", kpiq(int ), (int)19);
                    continue block113;
                }
                case 532729400: {
                    break block113;
                }
                case 860484606: {
                    v2 = oq.kpit("kpor", kpiq(int ), (int)20);
                    continue block113;
                }
                case 899042252: {
                    v2 = oq.kpit("kpos", kpiq(int ), (int)21);
                    continue block113;
                }
            }
            break;
        }
        var10_4 /* !! */  = oq.b;
        v3 /* !! */  = oq.su;
        if (true) ** GOTO lbl28
        block114: while (true) {
            v3 /* !! */  = (long)(oq.kpit("kpou", kpiq(int ), (int)23) - oq.kpit("kpot", kpiq(int ), (int)22));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 372114320: {
                    continue block114;
                }
                case 532729400: {
                    break block114;
                }
            }
            break;
        }
        var9_5 = oq.a;
        if (var11_3) {
            throw null;
lbl36:
            // 9 sources

            return;
        }
        if (var9_5 || var9_5) ** GOTO lbl36
        v4 /* !! */  = oq.su;
        if (true) ** GOTO lbl43
        block116: while (true) {
            v4 /* !! */  = (long)(v5 - oq.kpit("kpov", kpiq(int ), (int)24));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -848556698: {
                    v5 = oq.kpit("kpow", kpiq(int ), (int)25);
                    continue block116;
                }
                case 494863601: {
                    v5 = oq.kpit("kpox", kpiq(int ), (int)26);
                    continue block116;
                }
                case 532729400: {
                    break block116;
                }
            }
            break;
        }
        v6 = var0.x * (double)var1_1;
        v7 /* !! */  = oq.su;
        if (true) ** GOTO lbl57
        block117: while (true) {
            v7 /* !! */  = (long)(v8 - oq.kpit("kpoy", kpiq(int ), (int)27));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 194330788: {
                    v8 = oq.kpit("kpoz", kpiq(int ), (int)28);
                    continue block117;
                }
                case 532729400: {
                    break block117;
                }
                case 1475755554: {
                    v8 = oq.kpit("kppa", kpiq(int ), (int)29);
                    continue block117;
                }
            }
            break;
        }
        var3_6 = (int)Math.floor(v6);
        if (var9_5 || var9_5) ** GOTO lbl36
        v9 /* !! */  = oq.su;
        if (true) ** GOTO lbl72
        block118: while (true) {
            v9 /* !! */  = (long)(v10 - oq.kpit("kppb", kpiq(int ), (int)30));
lbl72:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -901895184: {
                    v10 = oq.kpit("kppc", kpiq(int ), (int)31);
                    continue block118;
                }
                case 532729400: {
                    break block118;
                }
                case 1540411785: {
                    v10 = oq.kpit("kppd", kpiq(int ), (int)32);
                    continue block118;
                }
            }
            break;
        }
        v11 = var2_2.method_22683();
        v12 /* !! */  = oq.su;
        if (true) ** GOTO lbl86
        block119: while (true) {
            v12 /* !! */  = (long)(v13 - oq.kpit("kppe", kpiq(int ), (int)33));
lbl86:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -656979906: {
                    v13 = oq.kpit("kppf", kpiq(int ), (int)34);
                    continue block119;
                }
                case 106942465: {
                    v13 = oq.kpit("kppg", kpiq(int ), (int)35);
                    continue block119;
                }
                case 325790286: {
                    v13 = oq.kpit("kpph", kpiq(int ), (int)36);
                    continue block119;
                }
                case 532729400: {
                    break block119;
                }
            }
            break;
        }
        v14 = v11.method_4507();
        v15 /* !! */  = oq.su;
        if (true) ** GOTO lbl103
        block120: while (true) {
            v15 /* !! */  = (long)(v16 - oq.kpit("kppi", kpiq(int ), (int)37));
lbl103:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -2085825321: {
                    v16 = oq.kpit("kppj", kpiq(int ), (int)38);
                    continue block120;
                }
                case -1220322653: {
                    v16 = oq.kpit("kppk", kpiq(int ), (int)39);
                    continue block120;
                }
                case 19797224: {
                    v16 = oq.kpit("kppl", kpiq(int ), (int)40);
                    continue block120;
                }
                case 532729400: {
                    break block120;
                }
            }
            break;
        }
        v17 = var0.y;
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kppm", kpiq(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == oq.kpit("kppn", kpja(int ), (int)130)) break;
            v18 /* !! */  = (long)oq.kpit("kppo", kpja(int ), (int)131);
        }
        v19 = v14 - (v17 + var0.h) * (double)var1_1;
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_2 = oq.su - oq.kpit("kppp", kpiq(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == oq.kpit("kppq", kpja(int ), (int)132)) break;
            v20 /* !! */  = (long)oq.kpit("kppr", kpja(int ), (int)133);
        }
        var4_7 = (int)Math.floor(v19);
        if (var9_5 || var9_5) ** GOTO lbl36
        v21 /* !! */  = oq.su;
        if (true) ** GOTO lbl133
        block123: while (true) {
            v21 /* !! */  = (long)(v22 - oq.kpit("kpps", kpiq(int ), (int)43));
lbl133:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -900431426: {
                    v22 = oq.kpit("kppt", kpiq(int ), (int)44);
                    continue block123;
                }
                case 532729400: {
                    break block123;
                }
                case 824109076: {
                    v22 = oq.kpit("kppu", kpiq(int ), (int)45);
                    continue block123;
                }
            }
            break;
        }
        v23 = var0.x;
        v24 /* !! */  = oq.su;
        if (true) ** GOTO lbl147
        block124: while (true) {
            v24 /* !! */  = (long)(oq.kpit("kppw", kpiq(int ), (int)47) - oq.kpit("kppv", kpiq(int ), (int)46));
lbl147:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1945180046: {
                    continue block124;
                }
                case 532729400: {
                    break block124;
                }
            }
            break;
        }
        v25 = (v23 + var0.w) * (double)var1_1;
        v26 /* !! */  = oq.su;
        if (true) ** GOTO lbl157
        block125: while (true) {
            v26 /* !! */  = (long)(v27 - oq.kpit("kppx", kpiq(int ), (int)48));
lbl157:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -2093092711: {
                    v27 = oq.kpit("kppy", kpiq(int ), (int)49);
                    continue block125;
                }
                case 532729400: {
                    break block125;
                }
                case 852230290: {
                    v27 = oq.kpit("kppz", kpiq(int ), (int)50);
                    continue block125;
                }
                case 1084659730: {
                    v27 = oq.kpit("kpqa", kpiq(int ), (int)51);
                    continue block125;
                }
            }
            break;
        }
        var5_8 = (int)Math.ceil(v25);
        if (var10_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_5 || var9_5) ** GOTO lbl36
                v28 /* !! */  = oq.su;
                if (true) ** GOTO lbl178
                block126: while (true) {
                    v28 /* !! */  = (long)(v29 - oq.kpit("kpqb", kpiq(int ), (int)52));
lbl178:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1172451821: {
                            v29 = oq.kpit("kpqc", kpiq(int ), (int)53);
                            continue block126;
                        }
                        case -678495921: {
                            v29 = oq.kpit("kpqd", kpiq(int ), (int)54);
                            continue block126;
                        }
                        case 532729400: {
                            break block126;
                        }
                    }
                    break;
                }
                v30 = var2_2.method_22683();
                v31 /* !! */  = oq.su;
                if (true) ** GOTO lbl192
                block127: while (true) {
                    v31 /* !! */  = (long)(v32 - oq.kpit("kpqe", kpiq(int ), (int)55));
lbl192:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1937723558: {
                            v32 = oq.kpit("kpqf", kpiq(int ), (int)56);
                            continue block127;
                        }
                        case -808069113: {
                            v32 = oq.kpit("kpqg", kpiq(int ), (int)57);
                            continue block127;
                        }
                        case 532729400: {
                            break block127;
                        }
                        case 1820245840: {
                            v32 = oq.kpit("kpqh", kpiq(int ), (int)58);
                            continue block127;
                        }
                    }
                    break;
                }
                v33 = v30.method_4507();
                v34 /* !! */  = oq.su;
                if (true) ** GOTO lbl209
                block128: while (true) {
                    v34 /* !! */  = (long)(v35 - oq.kpit("kpqi", kpiq(int ), (int)59));
lbl209:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1049076159: {
                            v35 = oq.kpit("kpqj", kpiq(int ), (int)60);
                            continue block128;
                        }
                        case -944207709: {
                            v35 = oq.kpit("kpqk", kpiq(int ), (int)61);
                            continue block128;
                        }
                        case 396887643: {
                            v35 = oq.kpit("kpql", kpiq(int ), (int)62);
                            continue block128;
                        }
                        case 532729400: {
                            break block128;
                        }
                    }
                    break;
                }
                v36 = v33 - var0.y * (double)var1_1;
                v37 /* !! */  = oq.su;
                if (true) ** GOTO lbl226
                block129: while (true) {
                    v37 /* !! */  = (long)(v38 - oq.kpit("kpqm", kpiq(int ), (int)63));
lbl226:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -232122236: {
                            v38 = oq.kpit("kpqn", kpiq(int ), (int)64);
                            continue block129;
                        }
                        case 532729400: {
                            break block129;
                        }
                        case 601600176: {
                            v38 = oq.kpit("kpqo", kpiq(int ), (int)65);
                            continue block129;
                        }
                        case 1042884151: {
                            v38 = oq.kpit("kpqp", kpiq(int ), (int)66);
                            continue block129;
                        }
                    }
                    break;
                }
                var6_9 = (int)Math.ceil(v36);
                if (var9_5 || var9_5) ** GOTO lbl36
                var7_10 = var5_8 - var3_6;
                if (var9_5 || var9_5) ** GOTO lbl36
                var8_11 = var6_9 - var4_7;
                if (var9_5 || var9_5) ** GOTO lbl36
                v39 = oq.kpit("kpqq", kpja(int ), (int)134);
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_3 = oq.su - oq.kpit("kpqr", kpiq(int ), (int)67)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == oq.kpit("kpqs", kpja(int ), (int)135)) break;
                    v40 /* !! */  = (long)oq.kpit("kpqt", kpja(int ), (int)136);
                }
                GL11.glEnable((int)v39);
                if (var9_5 || var9_5) ** GOTO lbl36
                v41 = oq.kpit("kpqu", kpja(int ), (int)137);
                v42 /* !! */  = oq.su;
                if (true) ** GOTO lbl257
                block131: while (true) {
                    v42 /* !! */  = (long)(v43 - oq.kpit("kpqv", kpiq(int ), (int)68));
lbl257:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case 504015291: {
                            v43 = oq.kpit("kpqw", kpiq(int ), (int)69);
                            continue block131;
                        }
                        case 532729400: {
                            break block131;
                        }
                        case 841550625: {
                            v43 = oq.kpit("kpqx", kpiq(int ), (int)70);
                            continue block131;
                        }
                    }
                    break;
                }
                v44 = Math.max((int)v41, var7_10);
                v45 = oq.kpit("kpqy", kpja(int ), (int)138);
                v46 /* !! */  = oq.su;
                if (true) ** GOTO lbl272
                block132: while (true) {
                    v46 /* !! */  = (long)(v47 - oq.kpit("kpqz", kpiq(int ), (int)71));
lbl272:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -1174769601: {
                            v47 = oq.kpit("kpra", kpiq(int ), (int)72);
                            continue block132;
                        }
                        case -391845314: {
                            v47 = oq.kpit("kprb", kpiq(int ), (int)73);
                            continue block132;
                        }
                        case -86916983: {
                            v47 = oq.kpit("kprc", kpiq(int ), (int)74);
                            continue block132;
                        }
                        case 532729400: {
                            break block132;
                        }
                    }
                    break;
                }
                v48 = Math.max((int)v45, var8_11);
                v49 /* !! */  = oq.su;
                if (true) ** GOTO lbl289
                block133: while (true) {
                    v49 /* !! */  = (long)(oq.kpit("kpre", kpiq(int ), (int)76) - oq.kpit("kprd", kpiq(int ), (int)75));
lbl289:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1295699396: {
                            continue block133;
                        }
                        case 532729400: {
                            break block133;
                        }
                    }
                    break;
                }
                GL11.glScissor((int)var3_6, (int)var4_7, (int)v44, (int)v48);
                if (var9_5 || var9_5) ** continue;
                return;
            }
            case 0: {
                var10_4 /* !! */  = (int)oq.kpit("kprf", kpja(int ), (int)139);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl302:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_4 /* !! */  = (int)oq.kpit("kprg", kpja(int ), (int)140);
                    if (var11_3) {
                        throw null;
                    }
                    ** GOTO lbl323
                    break;
                }
            }
            case 2: {
                var10_4 /* !! */  = (int)oq.kpit("kprh", kpja(int ), (int)141);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 3: {
                var10_4 /* !! */  = (int)oq.kpit("kpri", kpja(int ), (int)142);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 4: {
                var10_4 /* !! */  = (int)oq.kpit("kprj", kpja(int ), (int)143);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl323:
            // 4 sources

            case 5: {
                var10_4 /* !! */  = (int)oq.kpit("kprk", kpja(int ), (int)144);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl328:
            // 3 sources

            case 6: {
                var10_4 /* !! */  = (int)oq.kpit("kprl", kpja(int ), (int)145);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl342
            }
            case 7: {
                var10_4 /* !! */  = (int)oq.kpit("kprm", kpja(int ), (int)146);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 8: {
                var10_4 /* !! */  = (int)oq.kpit("kprn", kpja(int ), (int)147);
                if (!var11_3) ** GOTO lbl328
                throw null;
            }
lbl342:
            // 2 sources

            case 9: {
                var10_4 /* !! */  = (int)oq.kpit("kpro", kpja(int ), (int)148);
                if (!var11_3) ** GOTO lbl302
                throw null;
            }
            case 10: {
                var10_4 /* !! */  = (int)oq.kpit("kprp", kpja(int ), (int)149);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl351:
            // 2 sources

            case 11: {
                var10_4 /* !! */  = (int)oq.kpit("kprq", kpja(int ), (int)150);
                if (!var11_3) break;
                throw null;
            }
lbl355:
            // 4 sources

            case 12: {
                var10_4 /* !! */  = (int)oq.kpit("kprr", kpja(int ), (int)151);
                if (!var11_3) ** GOTO lbl351
                throw null;
            }
lbl359:
            // 3 sources

            case 13: {
                var10_4 /* !! */  = (int)oq.kpit("kprs", kpja(int ), (int)152);
                if (!var11_3) ** GOTO lbl328
                throw null;
            }
lbl363:
            // 2 sources

            case 14: {
                var10_4 /* !! */  = (int)oq.kpit("kprt", kpja(int ), (int)153);
                if (!var11_3) ** GOTO lbl359
                throw null;
            }
lbl367:
            // 2 sources

            case 15: {
                var10_4 /* !! */  = (int)oq.kpit("kpru", kpja(int ), (int)154);
                if (!var11_3) ** GOTO lbl302
                throw null;
            }
            case 16: {
                var10_4 /* !! */  = (int)oq.kpit("kprv", kpja(int ), (int)155);
                if (!var11_3) ** GOTO lbl323
                throw null;
            }
lbl375:
            // 2 sources

            case 17: {
                var10_4 /* !! */  = (int)oq.kpit("kprw", kpja(int ), (int)156);
                if (!var11_3) ** GOTO lbl355
                throw null;
            }
            case 18: {
                var10_4 /* !! */  = (int)oq.kpit("kprx", kpja(int ), (int)157);
                if (!var11_3) break;
                throw null;
            }
            case 19: 
        }
        var10_4 /* !! */  = (int)oq.kpit("kpry", kpja(int ), (int)158);
        ** while (!var11_3)
lbl386:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kqfi() {
        oq.kpir[100] = -8110345877626752723L;
        oq.kpir[101] = -8984456773078335840L;
        oq.kpir[102] = 457929840388480739L;
        oq.kpir[103] = 9201261508199923142L;
        oq.kpir[104] = 5330667475393101471L;
        oq.kpir[105] = -7679919554358493165L;
        oq.kpir[106] = -3349992709112356544L;
        oq.kpir[107] = 4417847550419942688L;
        oq.kpir[108] = -5632901598208842714L;
        oq.kpir[109] = 6026829802515610533L;
        oq.kpir[110] = -2247779670007742236L;
        oq.kpir[111] = -5554937017092496256L;
        oq.kpir[112] = 7016147283148702956L;
        oq.kpir[113] = -1242741348801192111L;
        oq.kpir[114] = -7440454383239026776L;
        oq.kpir[115] = 8909411162269650015L;
        oq.kpir[116] = 5725099183765572427L;
        oq.kpir[117] = 770275986367136436L;
        oq.kpir[118] = 1614414201291089581L;
        oq.kpir[119] = 4185808218860801394L;
        oq.kpir[120] = 4858286617149735154L;
        oq.kpir[121] = -1802592399545323062L;
        oq.kpir[122] = 7072941746368019215L;
        oq.kpir[123] = 2260634698500980356L;
        oq.kpir[124] = -5962600403454341094L;
        oq.kpir[125] = -2257133373671769747L;
        oq.kpir[126] = 8029286749774902247L;
        oq.kpir[127] = 1511202598551024105L;
        oq.kpir[128] = 8303838781131079177L;
        oq.kpir[129] = 1339132773884482049L;
        oq.kpir[130] = 2545392382987441971L;
        oq.kpir[131] = -4999530883946440049L;
        oq.kpir[132] = 1481678636665506582L;
        oq.kpir[133] = 6086360590772559946L;
        oq.kpir[134] = -3373351048662173847L;
        oq.kpir[135] = -1892067376567674587L;
        oq.kpir[136] = -6044082866760290696L;
        oq.kpir[137] = -7483364595829335100L;
        oq.kpir[138] = 2760717260432117208L;
        oq.kpir[139] = 6625281568613072745L;
        oq.kpir[140] = -6230180182985535463L;
        oq.kpir[141] = -8212962741254584042L;
        oq.kpir[142] = 5874431687155653741L;
        oq.kpir[143] = 2932751784993394760L;
        oq.kpir[144] = 3708406346780403420L;
        oq.kpir[145] = 7842109432823845351L;
        oq.kpir[146] = -2059911086811007850L;
        oq.kpir[147] = 146838997327358118L;
        oq.kpir[148] = 1362665518482338472L;
        oq.kpir[149] = -6790005636869800043L;
        oq.kpir[150] = 8011153786384860606L;
        oq.kpir[151] = 8726467915851205862L;
        oq.kpir[152] = 3654112011990349618L;
        oq.kpir[153] = -9070618131190733961L;
        oq.kpir[154] = -5205978509982725388L;
        oq.kpir[155] = 4324069000379599946L;
        oq.kpir[156] = 3230846647506632958L;
        oq.kpir[157] = -2806332700086163364L;
        oq.kpir[158] = 6856669458276098823L;
        oq.kpir[159] = -2534071282289923119L;
        oq.kpir[160] = 4781101127029804374L;
        oq.kpir[161] = 2606609052614371529L;
        oq.kpir[162] = -4691302849810506383L;
        oq.kpir[163] = -4358782425006846673L;
        oq.kpir[164] = 1323177163964318110L;
        oq.kpir[165] = 7204129586647259453L;
        oq.kpir[166] = 7507400588315329469L;
        oq.kpir[167] = 5256234135814977428L;
        oq.kpir[168] = 1756412769354269229L;
        oq.kpir[169] = -2832609894413947737L;
        oq.kpir[170] = -610123435025028311L;
        oq.kpir[171] = -7502715017325213324L;
        oq.kpir[172] = 3760060959251071334L;
        oq.kpir[173] = 3230952645336015735L;
        oq.kpir[174] = -3321404251145895601L;
        oq.kpir[175] = 688793309780565315L;
        oq.kpir[176] = 6899779993634491873L;
        oq.kpir[177] = -6182200963165030477L;
        oq.kpir[178] = 6379972796357957023L;
        oq.kpir[179] = -2003527150989953631L;
        oq.kpir[180] = -2527919083248252608L;
        oq.kpir[181] = 339247729932456020L;
        oq.kpir[182] = -2750021753640845586L;
        oq.kpir[183] = -5955891139185521845L;
        oq.kpir[184] = -7681350550112866698L;
        oq.kpir[185] = -8634540300830311837L;
        oq.kpir[186] = 65085539958111672L;
        oq.kpir[187] = -2002151678098958163L;
        oq.kpir[188] = 5277032730858822676L;
        oq.kpir[189] = 7603360047990771901L;
        oq.kpir[190] = 1034714378540051047L;
        oq.kpir[191] = -8282703463721852724L;
        oq.kpir[192] = 7599277943034202905L;
        oq.kpir[193] = 8124987021458589379L;
        oq.kpir[194] = 8780398670280372251L;
        oq.kpir[195] = 595589749930829231L;
        oq.kpir[196] = 1812614422768048667L;
        oq.kpir[197] = 3368451204786888216L;
        oq.kpir[198] = -3456819645361910531L;
        oq.kpir[199] = 6232059816741395906L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void pushVertical(double var0, double var2_1) {
        v0 /* !! */  = oq.su;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(oq.kpit("kplj", kpiq(int ), (int)8) - oq.kpit("kpli", kpiq(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 532729400: {
                    break block23;
                }
                case 1881687299: {
                    continue block23;
                }
            }
            break;
        }
        var6_2 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl15
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - oq.kpit("kplk", kpiq(int ), (int)9));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1431554212: {
                    v2 = oq.kpit("kpll", kpiq(int ), (int)10);
                    continue block24;
                }
                case -370966290: {
                    v2 = oq.kpit("kplm", kpiq(int ), (int)11);
                    continue block24;
                }
                case 532729400: {
                    break block24;
                }
            }
            break;
        }
        var5_3 /* !! */  = oq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kpln", kpiq(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oq.kpit("kplo", kpja(int ), (int)56)) break;
            v3 /* !! */  = (long)oq.kpit("kplp", kpja(int ), (int)57);
        }
        var4_4 = oq.a;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_2) {
                    throw null;
lbl37:
                    // 2 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl37
                v4 = oq.kpit("kplq", kpja(int ), (int)58);
                v5 /* !! */  = oq.su;
                if (true) ** GOTO lbl45
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - oq.kpit("kplr", kpiq(int ), (int)13));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1507675179: {
                            v6 = oq.kpit("kpls", kpiq(int ), (int)14);
                            continue block27;
                        }
                        case -1275967984: {
                            v6 = oq.kpit("kplt", kpiq(int ), (int)15);
                            continue block27;
                        }
                        case -595190673: {
                            v6 = oq.kpit("kplu", kpiq(int ), (int)16);
                            continue block27;
                        }
                        case 532729400: {
                            break block27;
                        }
                    }
                    break;
                }
                oq.pushVertical(var0, var2_1, (boolean)v4);
                if (var4_4 || var4_4) ** continue;
                return;
            }
lbl60:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)oq.kpit("kplv", kpja(int ), (int)59);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl69
            }
lbl65:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)oq.kpit("kplw", kpja(int ), (int)60);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
lbl69:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)oq.kpit("kplx", kpja(int ), (int)61);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
            case 3: {
                var5_3 /* !! */  = (int)oq.kpit("kply", kpja(int ), (int)62);
                if (var6_2) {
                    throw null;
                }
            }
            case 4: {
                var5_3 /* !! */  = (int)oq.kpit("kplz", kpja(int ), (int)63);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
            case 5: 
        }
        do {
            var5_3 /* !! */  = (int)oq.kpit("kpma", kpja(int ), (int)64);
        } while (!var6_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$push$0(float[] var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kqei", kpiq(int ), (int)223)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oq.kpit("kqej", kpja(int ), (int)334)) break;
            v0 /* !! */  = (long)oq.kpit("kqek", kpja(int ), (int)335);
        }
        var3_1 = oq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kqel", kpiq(int ), (int)224)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == oq.kpit("kqem", kpja(int ), (int)336)) break;
            v1 /* !! */  = (long)oq.kpit("kqen", kpja(int ), (int)337);
        }
        var2_2 /* !! */  = oq.b;
        v2 /* !! */  = oq.su;
        if (true) ** GOTO lbl17
        block13: while (true) {
            v2 /* !! */  = (long)(oq.kpit("kqep", kpiq(int ), (int)226) - oq.kpit("kqeo", kpiq(int ), (int)225));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 532729400: {
                    break block13;
                }
                case 854734347: {
                    continue block13;
                }
            }
            break;
        }
        var1_3 = oq.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl28:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl28
                v3 = var0[0];
                v4 = var0[1];
                v5 = var0[2];
                v6 = var0[3];
                v7 = oq.kpit("kqeq", kpja(int ), (int)338);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = oq.su - oq.kpit("kqer", kpiq(int ), (int)227)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == oq.kpit("kqes", kpja(int ), (int)339)) break;
                    v8 /* !! */  = (long)oq.kpit("kqet", kpja(int ), (int)340);
                }
                oq.push(v3, v4, v5, v6, (boolean)v7);
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl45:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)oq.kpit("kqeu", kpja(int ), (int)341);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)oq.kpit("kqev", kpja(int ), (int)342);
                    if (!var3_1) ** GOTO lbl45
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)oq.kpit("kqew", kpja(int ), (int)343);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)oq.kpit("kqex", kpja(int ), (int)344);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 4: 
        }
        var2_2 /* !! */  = (int)oq.kpit("kqey", kpja(int ), (int)345);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void push(double var0, double var2_1, double var4_2, double var6_3) {
        v0 /* !! */  = oq.su;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(oq.kpit("kpiv", kpiq(int ), (int)1) - oq.kpit("kpiu", kpiq(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -741071493: {
                    continue block17;
                }
                case 532729400: {
                    break block17;
                }
            }
            break;
        }
        var10_4 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl15
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - oq.kpit("kpiw", kpiq(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1760409356: {
                    v2 = oq.kpit("kpix", kpiq(int ), (int)3);
                    continue block18;
                }
                case 532729400: {
                    break block18;
                }
                case 1239796131: {
                    v2 = oq.kpit("kpiy", kpiq(int ), (int)4);
                    continue block18;
                }
            }
            break;
        }
        var9_5 /* !! */  = oq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kpiz", kpiq(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oq.kpit("kpjd", kpja(int ), (int)0)) break;
            v3 /* !! */  = (long)oq.kpit("kpje", kpja(int ), (int)1);
        }
        var8_6 = oq.a;
        if (var10_4) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_6 || var8_6) ** GOTO lbl33
                v4 = oq.kpit("kpjf", kpja(int ), (int)2);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kpjg", kpiq(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oq.kpit("kpjh", kpja(int ), (int)3)) break;
                    v5 /* !! */  = (long)oq.kpit("kpji", kpja(int ), (int)4);
                }
                oq.push(var0, var2_1, var4_2, var6_3, (boolean)v4);
                if (var8_6 || var8_6) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_5 /* !! */  = (int)oq.kpit("kpjj", kpja(int ), (int)5);
                    if (!var10_4) break block9;
                    throw null;
                }
            }
            case 1: {
                var9_5 /* !! */  = (int)oq.kpit("kpjk", kpja(int ), (int)6);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl58:
            // 2 sources

            case 2: {
                do {
                    var9_5 /* !! */  = (int)oq.kpit("kpjl", kpja(int ), (int)7);
                } while (!var10_4);
                throw null;
            }
lbl63:
            // 2 sources

            case 3: {
                var9_5 /* !! */  = (int)oq.kpit("kpjm", kpja(int ), (int)8);
                if (var10_4) {
                    throw null;
                }
            }
            case 4: {
                var9_5 /* !! */  = (int)oq.kpit("kpjn", kpja(int ), (int)9);
                if (!var10_4) ** GOTO lbl58
                throw null;
            }
            case 5: 
        }
        var9_5 /* !! */  = (int)oq.kpit("kpjo", kpja(int ), (int)10);
        ** while (!var10_4)
lbl74:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite kpit(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kqff() {
        oq.kpjc[200] = -908929005;
        oq.kpjc[201] = -602946283;
        oq.kpjc[202] = -1380451353;
        oq.kpjc[203] = 1764480304;
        oq.kpjc[204] = 62493692;
        oq.kpjc[205] = 1125761265;
        oq.kpjc[206] = 820547197;
        oq.kpjc[207] = 843174073;
        oq.kpjc[208] = 2126184799;
        oq.kpjc[209] = 1264444834;
        oq.kpjc[210] = 1421412221;
        oq.kpjc[211] = 1157973361;
        oq.kpjc[212] = 1427595033;
        oq.kpjc[213] = -1452866850;
        oq.kpjc[214] = 1238320723;
        oq.kpjc[215] = -1179420140;
        oq.kpjc[216] = -328200540;
        oq.kpjc[217] = -944618809;
        oq.kpjc[218] = 547316073;
        oq.kpjc[219] = 302744778;
        oq.kpjc[220] = -1783517847;
        oq.kpjc[221] = -43887961;
        oq.kpjc[222] = 291019062;
        oq.kpjc[223] = -1573988365;
        oq.kpjc[224] = 432933249;
        oq.kpjc[225] = -282539009;
        oq.kpjc[226] = 1533890928;
        oq.kpjc[227] = -1710777084;
        oq.kpjc[228] = -1358508487;
        oq.kpjc[229] = 481570316;
        oq.kpjc[230] = 1936662075;
        oq.kpjc[231] = -285716807;
        oq.kpjc[232] = -1938409450;
        oq.kpjc[233] = -1880421697;
        oq.kpjc[234] = 1299984673;
        oq.kpjc[235] = 429913825;
        oq.kpjc[236] = -1544482990;
        oq.kpjc[237] = 2000931315;
        oq.kpjc[238] = -2037303773;
        oq.kpjc[239] = -332966135;
        oq.kpjc[240] = 317498629;
        oq.kpjc[241] = -603380806;
        oq.kpjc[242] = -806491431;
        oq.kpjc[243] = -1823951495;
        oq.kpjc[244] = 795189237;
        oq.kpjc[245] = -789135502;
        oq.kpjc[246] = 902164811;
        oq.kpjc[247] = -1413460503;
        oq.kpjc[248] = -1806463899;
        oq.kpjc[249] = 681273001;
        oq.kpjc[250] = -1044532884;
        oq.kpjc[251] = -1390320129;
        oq.kpjc[252] = 1386968411;
        oq.kpjc[253] = 2029814692;
        oq.kpjc[254] = 1246622368;
        oq.kpjc[255] = 2048969243;
        oq.kpjc[256] = 1663600246;
        oq.kpjc[257] = 206509338;
        oq.kpjc[258] = 1248024177;
        oq.kpjc[259] = -1197760523;
        oq.kpjc[260] = -1215833828;
        oq.kpjc[261] = 728390426;
        oq.kpjc[262] = -1246311009;
        oq.kpjc[263] = -85903320;
        oq.kpjc[264] = -1092402766;
        oq.kpjc[265] = 1354624555;
        oq.kpjc[266] = 1368377979;
        oq.kpjc[267] = 1091171316;
        oq.kpjc[268] = 1389313031;
        oq.kpjc[269] = -1821399884;
        oq.kpjc[270] = 1556530292;
        oq.kpjc[271] = 408514359;
        oq.kpjc[272] = -954280606;
        oq.kpjc[273] = -197440167;
        oq.kpjc[274] = 1526879889;
        oq.kpjc[275] = -646245941;
        oq.kpjc[276] = -263804611;
        oq.kpjc[277] = -534887450;
        oq.kpjc[278] = 1874601961;
        oq.kpjc[279] = 677467259;
        oq.kpjc[280] = -1680354832;
        oq.kpjc[281] = 748212289;
        oq.kpjc[282] = -1822271239;
        oq.kpjc[283] = 332504584;
        oq.kpjc[284] = -1293033280;
        oq.kpjc[285] = 9956052;
        oq.kpjc[286] = 1268729380;
        oq.kpjc[287] = 1366620757;
        oq.kpjc[288] = -1992902486;
        oq.kpjc[289] = -564465193;
        oq.kpjc[290] = -1377526296;
        oq.kpjc[291] = 1617427837;
        oq.kpjc[292] = -2020887079;
        oq.kpjc[293] = 522653692;
        oq.kpjc[294] = -1579078736;
        oq.kpjc[295] = -361800306;
        oq.kpjc[296] = 1185608184;
        oq.kpjc[297] = -950911052;
        oq.kpjc[298] = -1451504376;
        oq.kpjc[299] = 873299852;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$push$1(double var0, double var2_1, double var4_2, double var6_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kqdr", kpiq(int ), (int)218)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oq.kpit("kqds", kpja(int ), (int)322)) break;
            v0 /* !! */  = (long)oq.kpit("kqdt", kpja(int ), (int)323);
        }
        var10_4 = oq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kqdu", kpiq(int ), (int)219)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oq.kpit("kqdv", kpja(int ), (int)324)) break;
            v1 /* !! */  = (long)oq.kpit("kqdw", kpja(int ), (int)325);
        }
        var9_5 /* !! */  = oq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oq.su - oq.kpit("kqdx", kpiq(int ), (int)220)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oq.kpit("kqdy", kpja(int ), (int)326)) break;
            v2 /* !! */  = (long)oq.kpit("kqdz", kpja(int ), (int)327);
        }
        var8_6 = oq.a;
        if (var10_4) {
            throw null;
lbl24:
            // 3 sources

            return;
        }
        if (var8_6) ** GOTO lbl24
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_6) ** GOTO lbl24
                v3 = oq.kpit("kqea", kpja(int ), (int)328);
                v4 /* !! */  = oq.su;
                if (true) ** GOTO lbl36
                block15: while (true) {
                    v4 /* !! */  = (long)(oq.kpit("kqec", kpiq(int ), (int)222) - oq.kpit("kqeb", kpiq(int ), (int)221));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 260756786: {
                            continue block15;
                        }
                        case 532729400: {
                            break block15;
                        }
                    }
                    break;
                }
                oq.push(var0, var2_1, var4_2, var6_3, (boolean)v3);
                if (var8_6) ** continue;
                return;
            }
            case 0: {
                var9_5 /* !! */  = (int)oq.kpit("kqed", kpja(int ), (int)329);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl54
            }
lbl49:
            // 3 sources

            case 1: {
                do {
                    var9_5 /* !! */  = (int)oq.kpit("kqee", kpja(int ), (int)330);
                } while (!var10_4);
                throw null;
            }
lbl54:
            // 2 sources

            case 2: {
                var9_5 /* !! */  = (int)oq.kpit("kqef", kpja(int ), (int)331);
                if (!var10_4) ** GOTO lbl49
                throw null;
            }
            case 3: {
                var9_5 /* !! */  = (int)oq.kpit("kqeg", kpja(int ), (int)332);
                if (!var10_4) ** GOTO lbl49
                throw null;
            }
            case 4: 
        }
        do {
            var9_5 /* !! */  = (int)oq.kpit("kqeh", kpja(int ), (int)333);
        } while (!var10_4);
        throw null;
    }

    private static /* synthetic */ void kqfh() {
        oq.kpir[0] = -624016559949536917L;
        oq.kpir[1] = -7781495182049309391L;
        oq.kpir[2] = 5205065995111128602L;
        oq.kpir[3] = 5862338163123600966L;
        oq.kpir[4] = -7203594445267482479L;
        oq.kpir[5] = -3305610935520466337L;
        oq.kpir[6] = 4636734552786536730L;
        oq.kpir[7] = 491762889470812457L;
        oq.kpir[8] = 5862682368982496449L;
        oq.kpir[9] = 1578795368022118637L;
        oq.kpir[10] = -4034672231596078632L;
        oq.kpir[11] = 6889127842319768226L;
        oq.kpir[12] = -7349395870766797653L;
        oq.kpir[13] = 6891697421485831330L;
        oq.kpir[14] = -2761071142134764751L;
        oq.kpir[15] = 2510027904654058627L;
        oq.kpir[16] = 190194307843125024L;
        oq.kpir[17] = -7294175155946989946L;
        oq.kpir[18] = 4991813070622418608L;
        oq.kpir[19] = 4201384818248795632L;
        oq.kpir[20] = 8463484284401018833L;
        oq.kpir[21] = -2424247712214275303L;
        oq.kpir[22] = 5597296220029191052L;
        oq.kpir[23] = -2143283105130942607L;
        oq.kpir[24] = -9220504291282789413L;
        oq.kpir[25] = -1371294045457613793L;
        oq.kpir[26] = 8289719976146441275L;
        oq.kpir[27] = -1022904381709470916L;
        oq.kpir[28] = 8322362533923512465L;
        oq.kpir[29] = 4518600537393492863L;
        oq.kpir[30] = -5206201307306605741L;
        oq.kpir[31] = 208758183371781278L;
        oq.kpir[32] = -8052634264086897272L;
        oq.kpir[33] = -2065491390052516425L;
        oq.kpir[34] = -769149654427943505L;
        oq.kpir[35] = -1456440810592859656L;
        oq.kpir[36] = 8676005359492578802L;
        oq.kpir[37] = -7159636991555948122L;
        oq.kpir[38] = -2020714666576917976L;
        oq.kpir[39] = -8186398292901980017L;
        oq.kpir[40] = 3667271046951814905L;
        oq.kpir[41] = 7385067351737064241L;
        oq.kpir[42] = 6133015111318963743L;
        oq.kpir[43] = 1071739396500306406L;
        oq.kpir[44] = -3738988180472298614L;
        oq.kpir[45] = 4526823615832876297L;
        oq.kpir[46] = -3992724020032168351L;
        oq.kpir[47] = 7534311942630226160L;
        oq.kpir[48] = 375140749570196823L;
        oq.kpir[49] = 1730390652913013499L;
        oq.kpir[50] = -6611712818278466804L;
        oq.kpir[51] = 1590422567366108536L;
        oq.kpir[52] = 6241786032819164323L;
        oq.kpir[53] = -5717415458490575915L;
        oq.kpir[54] = 8381420451531503865L;
        oq.kpir[55] = -3865723272350141040L;
        oq.kpir[56] = 9117590672467228149L;
        oq.kpir[57] = 8684114231430402115L;
        oq.kpir[58] = -4415371284405077308L;
        oq.kpir[59] = 8540458728857600140L;
        oq.kpir[60] = 532087862329754689L;
        oq.kpir[61] = -7093052953429691241L;
        oq.kpir[62] = -2370307968067735356L;
        oq.kpir[63] = 6478899197069087552L;
        oq.kpir[64] = -5902086905064896593L;
        oq.kpir[65] = -8078204803463056416L;
        oq.kpir[66] = 2810589758994190717L;
        oq.kpir[67] = -4710160031213190714L;
        oq.kpir[68] = -7596076587416830899L;
        oq.kpir[69] = 5294863059693339571L;
        oq.kpir[70] = -6696339260013302814L;
        oq.kpir[71] = -8992687880287113834L;
        oq.kpir[72] = 4541094972789909728L;
        oq.kpir[73] = 5418694520924108575L;
        oq.kpir[74] = -2291693272188875751L;
        oq.kpir[75] = -8531065719910665078L;
        oq.kpir[76] = -3051134114962212087L;
        oq.kpir[77] = 5353283541866795300L;
        oq.kpir[78] = -5951436323342174196L;
        oq.kpir[79] = 197061682908554276L;
        oq.kpir[80] = -8674619600659199914L;
        oq.kpir[81] = 3058722910155684690L;
        oq.kpir[82] = -4371569503982945918L;
        oq.kpir[83] = 7688544644946275483L;
        oq.kpir[84] = 51720029325744830L;
        oq.kpir[85] = 5647966691598603595L;
        oq.kpir[86] = 1223453593369083720L;
        oq.kpir[87] = 9130977587254232049L;
        oq.kpir[88] = 1465252465665319276L;
        oq.kpir[89] = -8513099435418408109L;
        oq.kpir[90] = 7219693381597026772L;
        oq.kpir[91] = -7623259816831544729L;
        oq.kpir[92] = -3761599921823627076L;
        oq.kpir[93] = 949351830589374644L;
        oq.kpir[94] = -626779265217080322L;
        oq.kpir[95] = -3632245063354870385L;
        oq.kpir[96] = -1192723919242668960L;
        oq.kpir[97] = 5051088589103617161L;
        oq.kpir[98] = 4271716654146394389L;
        oq.kpir[99] = 4756755910958996696L;
    }

    private static /* synthetic */ int kpja(int n2) {
        return kpjb[n2] ^ kpjc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void pop() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kprz", kpiq(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oq.kpit("kpsa", kpja(int ), (int)159)) break;
            v0 /* !! */  = (long)oq.kpit("kpsb", kpja(int ), (int)160);
        }
        var2 = oq.c;
        v1 /* !! */  = oq.su;
        if (true) ** GOTO lbl11
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - oq.kpit("kpsc", kpiq(int ), (int)78));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1851839635: {
                    v2 = oq.kpit("kpsd", kpiq(int ), (int)79);
                    continue block6;
                }
                case -702174539: {
                    v2 = oq.kpit("kpse", kpiq(int ), (int)80);
                    continue block6;
                }
                case 532729400: {
                    break block6;
                }
            }
            break;
        }
        var1_1 = oq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oq.su - oq.kpit("kpsf", kpiq(int ), (int)81)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oq.kpit("kpsg", kpja(int ), (int)161)) break;
            v3 /* !! */  = (long)oq.kpit("kpsh", kpja(int ), (int)162);
        }
        var0_2 = oq.a;
        if (var2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl29
        v4 = oq.kpit("kpsi", kpja(int ), (int)163);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = oq.su - oq.kpit("kpsj", kpiq(int ), (int)82)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == oq.kpit("kpsk", kpja(int ), (int)164)) break;
            v5 /* !! */  = (long)oq.kpit("kpsl", kpja(int ), (int)165);
        }
        oq.pop((boolean)v4);
        ** while (var0_2 || var0_2)
lbl40:
        // 1 sources

    }

    private static /* synthetic */ void kqfd() {
        oq.kpjc[0] = 861006993;
        oq.kpjc[1] = 269898914;
        oq.kpjc[2] = -604086015;
        oq.kpjc[3] = 1649943390;
        oq.kpjc[4] = 113113314;
        oq.kpjc[5] = -993617918;
        oq.kpjc[6] = -2114905867;
        oq.kpjc[7] = -760226742;
        oq.kpjc[8] = -1797263148;
        oq.kpjc[9] = -510096011;
        oq.kpjc[10] = 509689481;
        oq.kpjc[11] = 1727300463;
        oq.kpjc[12] = 1453166761;
        oq.kpjc[13] = -1905063807;
        oq.kpjc[14] = -794501300;
        oq.kpjc[15] = -41267682;
        oq.kpjc[16] = -2135947911;
        oq.kpjc[17] = 1639354762;
        oq.kpjc[18] = -746201962;
        oq.kpjc[19] = 162170676;
        oq.kpjc[20] = -726553966;
        oq.kpjc[21] = 26804728;
        oq.kpjc[22] = 598750439;
        oq.kpjc[23] = -1718684769;
        oq.kpjc[24] = 1603693996;
        oq.kpjc[25] = -547428770;
        oq.kpjc[26] = 1987913023;
        oq.kpjc[27] = 2085649184;
        oq.kpjc[28] = 835306080;
        oq.kpjc[29] = -1949933859;
        oq.kpjc[30] = -985756755;
        oq.kpjc[31] = -2080302766;
        oq.kpjc[32] = 2054412507;
        oq.kpjc[33] = 143991242;
        oq.kpjc[34] = 1145397030;
        oq.kpjc[35] = -763012374;
        oq.kpjc[36] = 424610766;
        oq.kpjc[37] = -1775139698;
        oq.kpjc[38] = 1429688472;
        oq.kpjc[39] = -852366529;
        oq.kpjc[40] = -745424472;
        oq.kpjc[41] = -1471631666;
        oq.kpjc[42] = 1626663229;
        oq.kpjc[43] = 1886778893;
        oq.kpjc[44] = 536870151;
        oq.kpjc[45] = 1476549579;
        oq.kpjc[46] = -141379020;
        oq.kpjc[47] = 35873141;
        oq.kpjc[48] = -411305877;
        oq.kpjc[49] = -412824054;
        oq.kpjc[50] = 1643999564;
        oq.kpjc[51] = -1972231097;
        oq.kpjc[52] = -1985828564;
        oq.kpjc[53] = -1366173385;
        oq.kpjc[54] = 1376380707;
        oq.kpjc[55] = -1981006716;
        oq.kpjc[56] = -898015615;
        oq.kpjc[57] = -506398815;
        oq.kpjc[58] = -425429786;
        oq.kpjc[59] = 864544430;
        oq.kpjc[60] = 1584146795;
        oq.kpjc[61] = 459120460;
        oq.kpjc[62] = -181599283;
        oq.kpjc[63] = 1400263774;
        oq.kpjc[64] = -904747295;
        oq.kpjc[65] = 1457989056;
        oq.kpjc[66] = 834619261;
        oq.kpjc[67] = -1728017763;
        oq.kpjc[68] = 1521230247;
        oq.kpjc[69] = -2006148207;
        oq.kpjc[70] = -1037582749;
        oq.kpjc[71] = 1792828049;
        oq.kpjc[72] = -276386584;
        oq.kpjc[73] = 1727597283;
        oq.kpjc[74] = 1013416514;
        oq.kpjc[75] = -481559689;
        oq.kpjc[76] = -947978844;
        oq.kpjc[77] = 519385167;
        oq.kpjc[78] = 847924482;
        oq.kpjc[79] = 684727274;
        oq.kpjc[80] = 721874083;
        oq.kpjc[81] = -190969917;
        oq.kpjc[82] = 2078625223;
        oq.kpjc[83] = -674700443;
        oq.kpjc[84] = -490888283;
        oq.kpjc[85] = 1063044006;
        oq.kpjc[86] = 1321581375;
        oq.kpjc[87] = -2035183611;
        oq.kpjc[88] = -2126452258;
        oq.kpjc[89] = -175861185;
        oq.kpjc[90] = -272255173;
        oq.kpjc[91] = -701735789;
        oq.kpjc[92] = 90325920;
        oq.kpjc[93] = -916662953;
        oq.kpjc[94] = -1068279935;
        oq.kpjc[95] = -304104766;
        oq.kpjc[96] = 1969346906;
        oq.kpjc[97] = -1381715940;
        oq.kpjc[98] = 1650386911;
        oq.kpjc[99] = 2138467764;
    }

    private static /* synthetic */ long kpiq(int n2) {
        return kpir[n2] ^ kpis[n2];
    }

    public oq() {
    }

    private static /* synthetic */ void kqfl() {
        oq.kpis[100] = 8026583145347758184L;
        oq.kpis[101] = -6912634901707589241L;
        oq.kpis[102] = -1208051439065784888L;
        oq.kpis[103] = -2622072176066585512L;
        oq.kpis[104] = 4867573948132755392L;
        oq.kpis[105] = -8238304434554857506L;
        oq.kpis[106] = 4249864777333084872L;
        oq.kpis[107] = 7064177424482043156L;
        oq.kpis[108] = -4894589786982391807L;
        oq.kpis[109] = 6641369372336201365L;
        oq.kpis[110] = 2765985952112008597L;
        oq.kpis[111] = -2609952354993360864L;
        oq.kpis[112] = 1289214271285129448L;
        oq.kpis[113] = -5514981947440208749L;
        oq.kpis[114] = -6535309277046055609L;
        oq.kpis[115] = 6094087755234560104L;
        oq.kpis[116] = 630577167710194368L;
        oq.kpis[117] = 4494491626018512047L;
        oq.kpis[118] = 6510121508825614105L;
        oq.kpis[119] = 8668451831694525218L;
        oq.kpis[120] = -8717418683740708349L;
        oq.kpis[121] = 5538028707334805367L;
        oq.kpis[122] = 3874161451964749967L;
        oq.kpis[123] = 4696514248059079157L;
        oq.kpis[124] = 5162317839352333281L;
        oq.kpis[125] = 198092513550864202L;
        oq.kpis[126] = -1840142460255338718L;
        oq.kpis[127] = -2211671948247615077L;
        oq.kpis[128] = 2807277342765332667L;
        oq.kpis[129] = -1116040558468067621L;
        oq.kpis[130] = 1591439578594009791L;
        oq.kpis[131] = 720349748963962975L;
        oq.kpis[132] = -2602856132470622552L;
        oq.kpis[133] = 3387670040585906098L;
        oq.kpis[134] = -1347241662428168123L;
        oq.kpis[135] = -5805561239568438107L;
        oq.kpis[136] = -5645702964312431508L;
        oq.kpis[137] = 5681605701417796392L;
        oq.kpis[138] = -8743916401408306246L;
        oq.kpis[139] = 7492858169037100418L;
        oq.kpis[140] = -239143428374073077L;
        oq.kpis[141] = 3660125249483545705L;
        oq.kpis[142] = 2980831033061053014L;
        oq.kpis[143] = 8953306528867901735L;
        oq.kpis[144] = 3508585747013160907L;
        oq.kpis[145] = -953253360814337803L;
        oq.kpis[146] = -7936177544831058880L;
        oq.kpis[147] = -3393138624188813988L;
        oq.kpis[148] = -8065909312176216181L;
        oq.kpis[149] = -8608274512408714062L;
        oq.kpis[150] = 3836138049889019240L;
        oq.kpis[151] = 4560446359741952678L;
        oq.kpis[152] = -3609005815577007778L;
        oq.kpis[153] = 3372913468469236507L;
        oq.kpis[154] = -7099717652801048241L;
        oq.kpis[155] = 4868484606987533627L;
        oq.kpis[156] = 6648368492245922971L;
        oq.kpis[157] = 536655982209444727L;
        oq.kpis[158] = -8339995179275184698L;
        oq.kpis[159] = -3821090604639199283L;
        oq.kpis[160] = 8014498908227045976L;
        oq.kpis[161] = 9103554728218257480L;
        oq.kpis[162] = -8032741966891800627L;
        oq.kpis[163] = 8645394929462519571L;
        oq.kpis[164] = -3295309524646652445L;
        oq.kpis[165] = -5492842565537451533L;
        oq.kpis[166] = 3209661828833955347L;
        oq.kpis[167] = -6456624727559928607L;
        oq.kpis[168] = 7119562504721703279L;
        oq.kpis[169] = 7922460862949575107L;
        oq.kpis[170] = -6101002970362311565L;
        oq.kpis[171] = 2536078543546420155L;
        oq.kpis[172] = 6606967837347425199L;
        oq.kpis[173] = 5769444160799304179L;
        oq.kpis[174] = -1573005407222001737L;
        oq.kpis[175] = 667867078858876452L;
        oq.kpis[176] = 2047890006964940254L;
        oq.kpis[177] = -1302172924647103794L;
        oq.kpis[178] = -2395701905439803320L;
        oq.kpis[179] = -8422045796734433808L;
        oq.kpis[180] = -6396160054867706248L;
        oq.kpis[181] = 8776202349647322770L;
        oq.kpis[182] = 6207271360134729789L;
        oq.kpis[183] = 7543603314261666576L;
        oq.kpis[184] = -4204133762529500942L;
        oq.kpis[185] = -4382848112014237734L;
        oq.kpis[186] = -7725745871880086597L;
        oq.kpis[187] = 3920152929488077259L;
        oq.kpis[188] = 9172891607640877970L;
        oq.kpis[189] = -3894323700815276798L;
        oq.kpis[190] = -6496766569175329881L;
        oq.kpis[191] = -7576155236616554531L;
        oq.kpis[192] = -5621814925407934279L;
        oq.kpis[193] = 8834151288061538602L;
        oq.kpis[194] = -2166085307351340706L;
        oq.kpis[195] = 6692734561110254472L;
        oq.kpis[196] = 8818228046450993591L;
        oq.kpis[197] = 9210065911054781563L;
        oq.kpis[198] = -1380365219616089356L;
        oq.kpis[199] = -5452358627189554566L;
    }

    private static /* synthetic */ void kqfc() {
        oq.kpjb[300] = -1300282249;
        oq.kpjb[301] = 1511160928;
        oq.kpjb[302] = -2146318887;
        oq.kpjb[303] = 1259737897;
        oq.kpjb[304] = 1367463034;
        oq.kpjb[305] = -1531586764;
        oq.kpjb[306] = 1709056049;
        oq.kpjb[307] = -1645212812;
        oq.kpjb[308] = -1971248029;
        oq.kpjb[309] = -1077432412;
        oq.kpjb[310] = 2026586312;
        oq.kpjb[311] = -906635798;
        oq.kpjb[312] = -505247353;
        oq.kpjb[313] = -589312609;
        oq.kpjb[314] = -414549268;
        oq.kpjb[315] = 895762067;
        oq.kpjb[316] = -433822641;
        oq.kpjb[317] = 251177337;
        oq.kpjb[318] = 898536143;
        oq.kpjb[319] = 2133665397;
        oq.kpjb[320] = 500612056;
        oq.kpjb[321] = -1582666880;
        oq.kpjb[322] = -71816105;
        oq.kpjb[323] = 1447778456;
        oq.kpjb[324] = -803695128;
        oq.kpjb[325] = 1365565209;
        oq.kpjb[326] = -1936333205;
        oq.kpjb[327] = 1277911033;
        oq.kpjb[328] = 457491754;
        oq.kpjb[329] = -2109055505;
        oq.kpjb[330] = -1747077115;
        oq.kpjb[331] = 600565673;
        oq.kpjb[332] = -334313297;
        oq.kpjb[333] = 1886725589;
        oq.kpjb[334] = -1868066041;
        oq.kpjb[335] = 1452669352;
        oq.kpjb[336] = -1380314723;
        oq.kpjb[337] = -447687100;
        oq.kpjb[338] = -2082003127;
        oq.kpjb[339] = -487175458;
        oq.kpjb[340] = -1050056371;
        oq.kpjb[341] = -1265021878;
        oq.kpjb[342] = 302665550;
        oq.kpjb[343] = 1713415550;
        oq.kpjb[344] = -488898030;
        oq.kpjb[345] = -7914850;
    }

    private static /* synthetic */ void kqfk() {
        oq.kpis[0] = -8504108634442031651L;
        oq.kpis[1] = 3218219313595267963L;
        oq.kpis[2] = 2125895710616822823L;
        oq.kpis[3] = -3752530405035264302L;
        oq.kpis[4] = 8011422615629509969L;
        oq.kpis[5] = -6030771884308957083L;
        oq.kpis[6] = 4578657686537385550L;
        oq.kpis[7] = 823725172890543685L;
        oq.kpis[8] = 4625049960990378525L;
        oq.kpis[9] = 2285553522200155610L;
        oq.kpis[10] = -8413765776171920895L;
        oq.kpis[11] = -432243657104562966L;
        oq.kpis[12] = -6109076177547465386L;
        oq.kpis[13] = 303545494183298529L;
        oq.kpis[14] = -1841287773863830014L;
        oq.kpis[15] = -3450010770305438410L;
        oq.kpis[16] = 488475482131926497L;
        oq.kpis[17] = -2610845078888045358L;
        oq.kpis[18] = 7037782756959678066L;
        oq.kpis[19] = 3977109721480316154L;
        oq.kpis[20] = 4660518229572933948L;
        oq.kpis[21] = 5272443421052741593L;
        oq.kpis[22] = 2463292615342197771L;
        oq.kpis[23] = -5354541946942937429L;
        oq.kpis[24] = -583095400358687406L;
        oq.kpis[25] = 5918188285236386062L;
        oq.kpis[26] = -8314189782626222531L;
        oq.kpis[27] = -8902406165937466490L;
        oq.kpis[28] = -5230808684896279530L;
        oq.kpis[29] = -5279799209885423234L;
        oq.kpis[30] = -3278510247331568662L;
        oq.kpis[31] = 1197522224536292236L;
        oq.kpis[32] = -7256293841607846805L;
        oq.kpis[33] = -8501507088531536391L;
        oq.kpis[34] = 8236541599648631320L;
        oq.kpis[35] = 5400830703265293183L;
        oq.kpis[36] = 2157061045075411354L;
        oq.kpis[37] = 4070911692504561748L;
        oq.kpis[38] = 9098897289041890417L;
        oq.kpis[39] = 1859038111486269799L;
        oq.kpis[40] = -4547760204006677553L;
        oq.kpis[41] = -7723375464997616663L;
        oq.kpis[42] = 6709837704963733774L;
        oq.kpis[43] = -2193250363103800812L;
        oq.kpis[44] = -6466248687837474686L;
        oq.kpis[45] = -806733838956457852L;
        oq.kpis[46] = -3894468110185925777L;
        oq.kpis[47] = -3322767839403446601L;
        oq.kpis[48] = -4869120882286307519L;
        oq.kpis[49] = 5102778479827317915L;
        oq.kpis[50] = -1551007589654690266L;
        oq.kpis[51] = 2029045605724869814L;
        oq.kpis[52] = 6983842692740805949L;
        oq.kpis[53] = 4020127621933258091L;
        oq.kpis[54] = -1827761482065487493L;
        oq.kpis[55] = -4399989152866121092L;
        oq.kpis[56] = 1430879473010878162L;
        oq.kpis[57] = 7361732851619865296L;
        oq.kpis[58] = -5864282290905195121L;
        oq.kpis[59] = -6203933294059385227L;
        oq.kpis[60] = -210046643065173501L;
        oq.kpis[61] = -4828577448006614809L;
        oq.kpis[62] = -1394075233647584667L;
        oq.kpis[63] = 7318643855494878098L;
        oq.kpis[64] = -4994788286982099210L;
        oq.kpis[65] = 2374225891840789653L;
        oq.kpis[66] = -8537574781625612186L;
        oq.kpis[67] = -473847970703972380L;
        oq.kpis[68] = -7980573424688432930L;
        oq.kpis[69] = 4981521628005109393L;
        oq.kpis[70] = 1705992502022425712L;
        oq.kpis[71] = 8880121081321749296L;
        oq.kpis[72] = 8697100126324635359L;
        oq.kpis[73] = 8906485541397925707L;
        oq.kpis[74] = 8746857399913347884L;
        oq.kpis[75] = -4066798849622148332L;
        oq.kpis[76] = -2377120130351745809L;
        oq.kpis[77] = -6894975701611456395L;
        oq.kpis[78] = -576019057815516404L;
        oq.kpis[79] = -3972007869904306794L;
        oq.kpis[80] = 707281821285888229L;
        oq.kpis[81] = 9094762473238277509L;
        oq.kpis[82] = -8820632306501568958L;
        oq.kpis[83] = 6801291737242211046L;
        oq.kpis[84] = 3062566971415725434L;
        oq.kpis[85] = 2431335986463370305L;
        oq.kpis[86] = -5650769819077644703L;
        oq.kpis[87] = -4985876449905030614L;
        oq.kpis[88] = 9003344479277097041L;
        oq.kpis[89] = 6999940761147855722L;
        oq.kpis[90] = 7943719797657112647L;
        oq.kpis[91] = -1699665232500267871L;
        oq.kpis[92] = -5340694060655342677L;
        oq.kpis[93] = 7530663291509425286L;
        oq.kpis[94] = -1011973429873890126L;
        oq.kpis[95] = 2343347656476772583L;
        oq.kpis[96] = 6713231877982728451L;
        oq.kpis[97] = -2474666398299253091L;
        oq.kpis[98] = -4692834162188311817L;
        oq.kpis[99] = 6285862702209150395L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void pushVertical(double var0, double var2_1, boolean var4_2) {
        var17_3 = oq.c;
        var16_4 /* !! */  = oq.b;
        var15_5 = oq.a;
        if (var17_3) {
            throw null;
lbl6:
            // 16 sources

            return;
        }
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_5 || var15_5) ** GOTO lbl6
                if (!var4_2) ** GOTO lbl17
                if (var15_5 || var15_5) ** GOTO lbl6
                ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$pushVertical$2(double double ), ()V)((double)var0, (double)var2_1));
                if (var15_5 || var15_5) ** GOTO lbl6
                return;
lbl17:
                // 1 sources

                if (var15_5 || var15_5) ** GOTO lbl6
                var5_6 = class_310.method_1551();
                if (var15_5 || var15_5) ** GOTO lbl6
                var6_7 = (float)var5_6.method_22683().method_4480() / (float)ki.getFixedScaledWidth() * ki.getContextScale();
                if (var15_5 || var15_5) ** GOTO lbl6
                var7_8 = ki.getFixedScaledWidth();
                if (var15_5 || var15_5) ** GOTO lbl6
                var9_9 = new oq$Rectangle(0.0, var0, var7_8, var2_1);
                if (var15_5 || var15_5) ** GOTO lbl6
                if (oq.verticalStack.isEmpty()) ** GOTO lbl36
                if (var15_5 || var15_5) ** GOTO lbl6
                var10_10 = oq.verticalStack.peek();
                if (var15_5 || var15_5) ** GOTO lbl6
                var11_11 = Math.max(var9_9.y, var10_10.y);
                if (var15_5 || var15_5) ** GOTO lbl6
                var13_12 = Math.min(var9_9.y + var9_9.h, var10_10.y + var10_10.h) - var11_11;
                if (var15_5 || var15_5) ** GOTO lbl6
                var9_9 = new oq$Rectangle(0.0, var11_11, var7_8, Math.max(0.0, var13_12));
                if (var15_5) ** GOTO lbl6
lbl36:
                // 2 sources

                if (var15_5 || var15_5) ** GOTO lbl6
                oq.verticalStack.push(var9_9);
                if (var15_5 || var15_5) ** GOTO lbl6
                oq.apply(var9_9, var6_7, var5_6);
                if (!var15_5 && !var15_5) ** break;
                ** continue;
                return;
            }
lbl44:
            // 3 sources

            case 0: {
                var16_4 /* !! */  = (int)oq.kpit("kpmb", kpja(int ), (int)65);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl49:
            // 2 sources

            case 1: {
                var16_4 /* !! */  = (int)oq.kpit("kpmc", kpja(int ), (int)66);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 2: {
                var16_4 /* !! */  = (int)oq.kpit("kpmd", kpja(int ), (int)67);
                if (!var17_3) ** GOTO lbl44
                throw null;
            }
            case 3: {
                var16_4 /* !! */  = (int)oq.kpit("kpme", kpja(int ), (int)68);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl63:
            // 3 sources

            case 4: {
                var16_4 /* !! */  = (int)oq.kpit("kpmf", kpja(int ), (int)69);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 5: {
                var16_4 /* !! */  = (int)oq.kpit("kpmg", kpja(int ), (int)70);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl73:
            // 2 sources

            case 6: {
                var16_4 /* !! */  = (int)oq.kpit("kpmh", kpja(int ), (int)71);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl78:
            // 2 sources

            case 7: {
                var16_4 /* !! */  = (int)oq.kpit("kpmi", kpja(int ), (int)72);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 8: {
                var16_4 /* !! */  = (int)oq.kpit("kpmj", kpja(int ), (int)73);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 9: {
                var16_4 /* !! */  = (int)oq.kpit("kpmk", kpja(int ), (int)74);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl93:
            // 4 sources

            case 10: {
                var16_4 /* !! */  = (int)oq.kpit("kpml", kpja(int ), (int)75);
                if (!var17_3) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 11: {
                var16_4 /* !! */  = (int)oq.kpit("kpmm", kpja(int ), (int)76);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 12: {
                var16_4 /* !! */  = (int)oq.kpit("kpmn", kpja(int ), (int)77);
                if (!var17_3) ** GOTO lbl93
                throw null;
            }
lbl106:
            // 3 sources

            case 13: {
                var16_4 /* !! */  = (int)oq.kpit("kpmo", kpja(int ), (int)78);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 14: {
                var16_4 /* !! */  = (int)oq.kpit("kpmp", kpja(int ), (int)79);
                if (!var17_3) break;
                throw null;
            }
            case 15: {
                var16_4 /* !! */  = (int)oq.kpit("kpmq", kpja(int ), (int)80);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl120:
            // 3 sources

            case 16: {
                var16_4 /* !! */  = (int)oq.kpit("kpmr", kpja(int ), (int)81);
                if (!var17_3) ** GOTO lbl49
                throw null;
            }
            case 17: {
                var16_4 /* !! */  = (int)oq.kpit("kpms", kpja(int ), (int)82);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl129:
            // 4 sources

            case 18: {
                var16_4 /* !! */  = (int)oq.kpit("kpmt", kpja(int ), (int)83);
                if (!var17_3) ** GOTO lbl63
                throw null;
            }
lbl133:
            // 2 sources

            case 19: {
                var16_4 /* !! */  = (int)oq.kpit("kpmu", kpja(int ), (int)84);
                if (!var17_3) ** GOTO lbl129
                throw null;
            }
lbl137:
            // 2 sources

            case 20: {
                var16_4 /* !! */  = (int)oq.kpit("kpmv", kpja(int ), (int)85);
                if (!var17_3) ** GOTO lbl129
                throw null;
            }
lbl141:
            // 3 sources

            case 21: {
                var16_4 /* !! */  = (int)oq.kpit("kpmw", kpja(int ), (int)86);
                if (!var17_3) break;
                throw null;
            }
            case 22: {
                var16_4 /* !! */  = (int)oq.kpit("kpmx", kpja(int ), (int)87);
                if (!var17_3) ** GOTO lbl106
                throw null;
            }
            case 23: {
                var16_4 /* !! */  = (int)oq.kpit("kpmy", kpja(int ), (int)88);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 24: {
                var16_4 /* !! */  = (int)oq.kpit("kpmz", kpja(int ), (int)89);
                if (!var17_3) ** GOTO lbl78
                throw null;
            }
lbl158:
            // 2 sources

            case 25: {
                var16_4 /* !! */  = (int)oq.kpit("kpna", kpja(int ), (int)90);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 26: {
                var16_4 /* !! */  = (int)oq.kpit("kpnb", kpja(int ), (int)91);
                if (!var17_3) ** GOTO lbl44
                throw null;
            }
lbl167:
            // 2 sources

            case 27: {
                var16_4 /* !! */  = (int)oq.kpit("kpnc", kpja(int ), (int)92);
                if (!var17_3) ** GOTO lbl63
                throw null;
            }
lbl171:
            // 2 sources

            case 28: {
                do {
                    var16_4 /* !! */  = (int)oq.kpit("kpnd", kpja(int ), (int)93);
                } while (!var17_3);
                throw null;
            }
            case 29: {
                var16_4 /* !! */  = (int)oq.kpit("kpne", kpja(int ), (int)94);
                if (!var17_3) ** GOTO lbl137
                throw null;
            }
lbl180:
            // 2 sources

            case 30: {
                var16_4 /* !! */  = (int)oq.kpit("kpnf", kpja(int ), (int)95);
                if (!var17_3) ** GOTO lbl93
                throw null;
            }
            case 31: {
                var16_4 /* !! */  = (int)oq.kpit("kpng", kpja(int ), (int)96);
                if (!var17_3) ** GOTO lbl120
                throw null;
            }
lbl188:
            // 4 sources

            case 32: {
                var16_4 /* !! */  = (int)oq.kpit("kpnh", kpja(int ), (int)97);
                if (!var17_3) ** GOTO lbl167
                throw null;
            }
            case 33: 
        }
        do {
            var16_4 /* !! */  = (int)oq.kpit("kpni", kpja(int ), (int)98);
        } while (!var17_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void applyToPass(RenderPass var0) {
        block57: {
            block56: {
                var10_1 = oq.c;
                var9_2 /* !! */  = oq.b;
                var8_3 = oq.a;
                if (var10_1) {
                    throw null;
lbl6:
                    // 14 sources

                    return;
                }
                if (var8_3 || var8_3) ** GOTO lbl6
                if (oq.stack.isEmpty()) break block56;
                if (var8_3) ** GOTO lbl6
                if (var0 != null) break block57;
                if (var8_3) ** GOTO lbl6
            }
            if (var8_3 || var8_3) ** GOTO lbl6
            return;
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        var1_4 = class_310.method_1551();
        if (var8_3 || var8_3) ** GOTO lbl6
        var2_5 = (float)var1_4.method_22683().method_4480() / (float)ki.getFixedScaledWidth() * ki.getContextScale();
        if (var8_3 || var8_3) ** GOTO lbl6
        var3_6 = oq.stack.peek();
        if (var8_3) ** GOTO lbl6
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_3) ** GOTO lbl6
                var4_7 = (int)Math.floor(var3_6.x * (double)var2_5);
                if (var8_3 || var8_3) ** GOTO lbl6
                var5_8 = (int)Math.floor((double)var1_4.method_22683().method_4507() - (var3_6.y + var3_6.h) * (double)var2_5);
                if (var8_3 || var8_3) ** GOTO lbl6
                var6_9 = (int)Math.ceil((var3_6.x + var3_6.w) * (double)var2_5);
                if (var8_3 || var8_3) ** GOTO lbl6
                var7_10 = (int)Math.ceil((double)var1_4.method_22683().method_4507() - var3_6.y * (double)var2_5);
                if (var8_3 || var8_3) ** GOTO lbl6
                var0.enableScissor(var4_7, var5_8, Math.max((int)oq.kpit("kpnj", kpja(int ), (int)99), var6_9 - var4_7), Math.max((int)oq.kpit("kpnk", kpja(int ), (int)100), var7_10 - var5_8));
                if (!var8_3 && !var8_3) ** break;
                ** continue;
                return;
            }
lbl40:
            // 3 sources

            case 0: {
                var9_2 /* !! */  = (int)oq.kpit("kpnl", kpja(int ), (int)101);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl45:
            // 3 sources

            case 1: {
                var9_2 /* !! */  = (int)oq.kpit("kpnm", kpja(int ), (int)102);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 2: {
                var9_2 /* !! */  = (int)oq.kpit("kpnn", kpja(int ), (int)103);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 3: {
                do {
                    var9_2 /* !! */  = (int)oq.kpit("kpno", kpja(int ), (int)104);
                } while (!var10_1);
                throw null;
            }
            case 4: {
                var9_2 /* !! */  = (int)oq.kpit("kpnp", kpja(int ), (int)105);
                if (!var10_1) ** GOTO lbl40
                throw null;
            }
lbl64:
            // 2 sources

            case 5: {
                var9_2 /* !! */  = (int)oq.kpit("kpnq", kpja(int ), (int)106);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var9_2 /* !! */  = (int)oq.kpit("kpnr", kpja(int ), (int)107);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl74:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)oq.kpit("kpns", kpja(int ), (int)108);
                    if (!var10_1) ** GOTO lbl45
                    throw null;
                }
            }
lbl79:
            // 2 sources

            case 8: {
                var9_2 /* !! */  = (int)oq.kpit("kpnt", kpja(int ), (int)109);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 9: {
                var9_2 /* !! */  = (int)oq.kpit("kpnu", kpja(int ), (int)110);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl89:
            // 2 sources

            case 10: {
                var9_2 /* !! */  = (int)oq.kpit("kpnv", kpja(int ), (int)111);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl94:
            // 2 sources

            case 11: {
                var9_2 /* !! */  = (int)oq.kpit("kpnw", kpja(int ), (int)112);
                if (!var10_1) ** GOTO lbl64
                throw null;
            }
            case 12: {
                var9_2 /* !! */  = (int)oq.kpit("kpnx", kpja(int ), (int)113);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl103:
            // 2 sources

            case 13: {
                var9_2 /* !! */  = (int)oq.kpit("kpny", kpja(int ), (int)114);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl108:
            // 2 sources

            case 14: {
                var9_2 /* !! */  = (int)oq.kpit("kpnz", kpja(int ), (int)115);
                if (!var10_1) ** GOTO lbl74
                throw null;
            }
lbl112:
            // 2 sources

            case 15: {
                var9_2 /* !! */  = (int)oq.kpit("kpoa", kpja(int ), (int)116);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl117:
            // 3 sources

            case 16: {
                var9_2 /* !! */  = (int)oq.kpit("kpob", kpja(int ), (int)117);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 17: {
                do {
                    var9_2 /* !! */  = (int)oq.kpit("kpoc", kpja(int ), (int)118);
                } while (!var10_1);
                throw null;
            }
lbl127:
            // 4 sources

            case 18: {
                var9_2 /* !! */  = (int)oq.kpit("kpod", kpja(int ), (int)119);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 19: {
                var9_2 /* !! */  = (int)oq.kpit("kpoe", kpja(int ), (int)120);
                if (!var10_1) ** GOTO lbl112
                throw null;
            }
            case 20: {
                var9_2 /* !! */  = (int)oq.kpit("kpof", kpja(int ), (int)121);
                if (!var10_1) ** GOTO lbl117
                throw null;
            }
lbl140:
            // 3 sources

            case 21: {
                var9_2 /* !! */  = (int)oq.kpit("kpog", kpja(int ), (int)122);
                if (!var10_1) ** GOTO lbl45
                throw null;
            }
lbl144:
            // 2 sources

            case 22: {
                var9_2 /* !! */  = (int)oq.kpit("kpoh", kpja(int ), (int)123);
                if (!var10_1) ** GOTO lbl40
                throw null;
            }
lbl148:
            // 2 sources

            case 23: {
                var9_2 /* !! */  = (int)oq.kpit("kpoi", kpja(int ), (int)124);
                if (!var10_1) ** GOTO lbl79
                throw null;
            }
lbl152:
            // 3 sources

            case 24: {
                var9_2 /* !! */  = (int)oq.kpit("kpoj", kpja(int ), (int)125);
                if (!var10_1) ** GOTO lbl127
                throw null;
            }
lbl156:
            // 2 sources

            case 25: {
                var9_2 /* !! */  = (int)oq.kpit("kpok", kpja(int ), (int)126);
                if (!var10_1) ** GOTO lbl89
                throw null;
            }
            case 26: 
        }
        var9_2 /* !! */  = (int)oq.kpit("kpol", kpja(int ), (int)127);
        ** while (!var10_1)
lbl163:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$pop$3() {
        v0 /* !! */  = oq.su;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - oq.kpit("kqci", kpiq(int ), (int)201));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1642543321: {
                    v1 = oq.kpit("kqcj", kpiq(int ), (int)202);
                    continue block21;
                }
                case -1111991836: {
                    v1 = oq.kpit("kqck", kpiq(int ), (int)203);
                    continue block21;
                }
                case 532729400: {
                    break block21;
                }
                case 692034976: {
                    v1 = oq.kpit("kqcl", kpiq(int ), (int)204);
                    continue block21;
                }
            }
            break;
        }
        var2 = oq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oq.su - oq.kpit("kqcm", kpiq(int ), (int)205)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oq.kpit("kqcn", kpja(int ), (int)304)) break;
            v2 /* !! */  = (long)oq.kpit("kqco", kpja(int ), (int)305);
        }
        var1_1 /* !! */  = oq.b;
        v3 /* !! */  = oq.su;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(oq.kpit("kqcq", kpiq(int ), (int)207) - oq.kpit("kqcp", kpiq(int ), (int)206));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2051363427: {
                    continue block23;
                }
                case 532729400: {
                    break block23;
                }
            }
            break;
        }
        var0_2 = oq.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl37
                v4 = oq.kpit("kqcr", kpja(int ), (int)306);
                v5 /* !! */  = oq.su;
                if (true) ** GOTO lbl48
                block25: while (true) {
                    v5 /* !! */  = (long)(oq.kpit("kqct", kpiq(int ), (int)209) - oq.kpit("kqcs", kpiq(int ), (int)208));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -93304967: {
                            continue block25;
                        }
                        case 532729400: {
                            break block25;
                        }
                    }
                    break;
                }
                oq.pop((boolean)v4);
                if (!var0_2) ** break;
                ** continue;
                return;
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)oq.kpit("kqcu", kpja(int ), (int)307);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)oq.kpit("kqcv", kpja(int ), (int)308);
                if (!var2) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)oq.kpit("kqcw", kpja(int ), (int)309);
                    if (!var2) ** GOTO lbl57
                    throw null;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)oq.kpit("kqcx", kpja(int ), (int)310);
                if (!var2) ** GOTO lbl66
                throw null;
            }
            case 4: 
        }
        var1_1 /* !! */  = (int)oq.kpit("kqcy", kpja(int ), (int)311);
        ** while (!var2)
lbl78:
        // 1 sources

        throw null;
    }
}

