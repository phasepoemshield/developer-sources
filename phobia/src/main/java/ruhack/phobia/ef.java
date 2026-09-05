/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  net.minecraft.class_742
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_742;
import ruhack.phobia.ar;
import ruhack.phobia.at;
import ruhack.phobia.dv;
import ruhack.phobia.dy;
import ruhack.phobia.dz;
import ruhack.phobia.ef$HeadParticle;
import ruhack.phobia.fb;
import ruhack.phobia.fk;
import ruhack.phobia.hn;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.nd;
import ruhack.phobia.np;

public final class ef
extends ar {
    private static final float MAIN_H = 35.07395f;
    private float lastHurtTime;
    private static final float EMPTY_ICON_W = 6.803999f;
    private float animatedHealth;
    private static final int EMPTY;
    public static final boolean a;
    private static int[] ajfc;
    private static final float HEALTH_BG_H = 8.138117f;
    private static final float CONTENT_W = 89.352516f;
    private static final float DURABILITY_H = 0.9672352f;
    private static final float HANDS_W = 33.599747f;
    private float health;
    private static final float SLOT_GAP = 1.4675293f;
    private static final float ARMOR_SLOT = 14.3551035f;
    private static final float DURABILITY_BOTTOM = 1.8010587f;
    private static int[] ajfb;
    private static final String EMPTY_ICON = "a";
    private int pendingParticleCount;
    private static final float BUBBLE_RADIUS = 0.86717635f;
    private static long[] ajfh;
    private static final float BAR_H = 1.3267797f;
    public static final int b;
    private static final int TEXT;
    private static final float BAR_W = 77.058624f;
    private static final float DURABILITY_W = 7.3376465f;
    private static final float HAND_SLOT = 14.431815f;
    private static final float HP_SUFFIX_SIZE = 6.6705875f;
    private static final float CONTENT_BORDER = 0.66705877f;
    private static final float NAME_BG_Y = 2.7149293f;
    private final class_1799[] armor;
    private static final long ca = -8239506867866866583L;
    private static final float TOP_RADIUS = 5.369823f;
    private static final float DESIGN_SCALE = 1.4991183f;
    private static final float MAIN_BORDER = 0.66705877f;
    private final Map<class_1304, Float> animatedDurability;
    private static final int ABSORPTION;
    private long lastFrame;
    private float baseHealth;
    private static final float HEAD_SIZE = 20.345291f;
    private static final int MAX_HEAD_PARTICLES = 64;
    private static final float HEAD_BG_RADIUS = 5.33647f;
    private float absorptionHealth;
    private float animatedBaseHealth;
    private static final float NAME_SIZE = 8.004705f;
    private static final class_1304[] ARMOR;
    private final ArrayList<ef$HeadParticle> headParticles;
    private static final float ARMOR_W = 65.09159f;
    private static final float SLOT_PAD = 1.6342939f;
    private class_1309 trackedTarget;
    private static final float MAIN_RADIUS = 7.3376465f;
    private static final int DANGER;
    private static final float CONTENT_RADIUS = 5.33647f;
    public static final boolean c;
    private final String[] queuedCounts;
    private static final float INNER_THICKNESS = 0.76711756f;
    private static ef instance;
    private static final float TOP_BORDER = 0.4869529f;
    private static final float NAME_BG_H = 19.057869f;
    private static final float HEAD_BG_BORDER = 0.66705877f;
    private static final float HEAD_BG_SIZE = 29.544033f;
    private final float[] queuedCountY;
    private static final float CONTENT_X = 34.60701f;
    private static final int BORDER;
    private static final float SLOT_BORDER = 0.4869529f;
    private static final int BLACK;
    private final float[] queuedCountX;
    private static final float HEAD_BG_Y = 2.7682939f;
    private float queuedCountOpacity;
    private float maxHealth;
    private final class_1799[] hands;
    private static final float HEAD_BG_X = 2.7149293f;
    private static final float TOP_H = 17.917198f;
    private static final int WARNING;
    private static final float ARMOR_ITEM = 7.8712935f;
    private static final float HAND_ITEM = 8.538352f;
    private float animatedAbsorption;
    private static final float TOP_GAP_Y = 2.4681175f;
    private static final float HP_SIZE = 8.004705f;
    private static final float HEAD_BORDER = 0.8f;
    private static final float HP_PAD = 6.0035286f;
    private class_2960 skin;
    private static final float HEAD_GLOW_SIZE = 26.015291f;
    private static final float MAIN_W = 126.77452f;
    private static long[] ajfi;
    private static final float COUNT_SIZE = 5.0029407f;
    private boolean scoreboardHealthActive;
    private static final float COUNT_PAD = 1.0005882f;
    private static final int SUB_BORDER;
    private float visibility;
    private static final float ANIMATION_SPEED = 10.0f;
    private static final float HEAD_RADIUS = 2.668235f;
    private static final float BUBBLE_SIZE = 3.0684702f;
    private static final class_1304[] HANDS;
    private String targetName;
    private static final float INNER_BLUR = 10.806353f;
    private static final float SLOT_RADIUS = 4.669411f;
    private static final float HEALTH_BG_Y = 24.207563f;
    private static final float NAME_PAD = 6.0035286f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawEquipmentPanel(class_332 var1_1, float var2_2, float var3_3, float var4_4, class_1799[] var5_5, class_1304[] var6_6, float var7_7, float var8_8, float var9_9, float var10_10, boolean var11_11) {
        block156: {
            block155: {
                var23_12 = ef.c;
                var22_13 /* !! */  = ef.b;
                var21_14 = ef.a;
                if (var23_12) {
                    throw null;
lbl6:
                    // 42 sources

                    return;
                }
                if (var21_14 || var21_14) ** GOTO lbl6
                ef.panel(var1_1, var2_2, var3_3, var4_4, (float)ef.ajfd("aklf", ajfn(int ), (int)541), (float)ef.ajfd("aklg", ajfn(int ), (int)542), var9_9, (boolean)ef.ajfd("aklh", ajfa(int ), (int)543));
                if (var21_14 || var21_14) ** GOTO lbl6
                var12_15 = var3_3 + (ef.ajfd("akli", ajfn(int ), (int)544) - var7_7) * ef.ajfd("aklj", ajfn(int ), (int)545);
                if (var21_14 || var21_14) ** GOTO lbl6
                if (kv.PHOBIA_NEW == null) break block155;
                if (var21_14 || var21_14) ** GOTO lbl6
                v0 = kv.PHOBIA_NEW;
                if (var23_12) {
                    throw null;
                }
                break block156;
            }
            if (var21_14 || var21_14) ** GOTO lbl6
            v0 = var13_16 = kv.getDefault();
        }
        if (var21_14 || var21_14) ** GOTO lbl6
        var14_17 = ef.ajfd("aklk", ajfa(int ), (int)546);
        if (var21_14) ** GOTO lbl6
        block82: while (true) {
            block160: {
                block159: {
                    block158: {
                        block157: {
                            if (var21_14 || var21_14) ** GOTO lbl6
                            if (var14_17 >= var5_5.length) ** GOTO lbl104
                            if (var21_14 || var21_14) ** GOTO lbl6
                            var15_18 = var2_2 + ef.ajfd("akll", ajfn(int ), (int)547) + (float)var14_17 * (var7_7 + ef.ajfd("aklm", ajfn(int ), (int)548));
                            if (var21_14 || var21_14) ** GOTO lbl6
                            ef.subPanel(var1_1, var15_18, var12_15, var7_7, var7_7, (float)ef.ajfd("akln", ajfn(int ), (int)549), (float)ef.ajfd("aklo", ajfn(int ), (int)550), var9_9);
                            if (var21_14 || var21_14) ** GOTO lbl6
                            var16_19 = var5_5[var14_17];
                            if (var21_14 || var21_14) ** GOTO lbl6
                            if (var16_19 == null) break block157;
                            if (var21_14) ** GOTO lbl6
                            if (!var16_19.method_7960()) break block158;
                            if (var21_14) ** GOTO lbl6
                        }
                        if (var21_14 || var21_14) ** GOTO lbl6
                        ef.drawEmpty(var1_1, var13_16, var15_18, var12_15, var7_7, var9_9);
                        if (var21_14 || var21_14) ** GOTO lbl6
                        this.animatedDurability.remove(var6_6[var14_17]);
                        if (var21_14 || var21_14) ** GOTO lbl6
                        if (var23_12) {
                            throw null;
                        }
                        ** GOTO lbl99
                    }
                    if (var21_14 || var21_14) ** GOTO lbl6
                    var17_20 = var15_18 + (var7_7 - var8_8) * ef.ajfd("aklp", ajfn(int ), (int)551);
                    if (var21_14 || var21_14) ** GOTO lbl6
                    var18_21 = var12_15 + (var7_7 - var8_8) * ef.ajfd("aklq", ajfn(int ), (int)552);
                    if (var21_14 || var21_14) ** GOTO lbl6
                    this.drawItem(var1_1, var16_19, var17_20, var18_21, var8_8);
                    if (var21_14 || var21_14) ** GOTO lbl6
                    if (var11_11) ** GOTO lbl85
                    if (var21_14) ** GOTO lbl6
                    if (var16_19.method_7947() <= ef.ajfd("aklr", ajfa(int ), (int)553)) ** GOTO lbl85
                    if (var21_14 || var21_14) ** GOTO lbl6
                    var19_22 = Integer.toString(var16_19.method_7947());
                    if (var21_14 || var21_14) ** GOTO lbl6
                    if (kv.INTER_SEMIBOLD == null) break block159;
                    if (var21_14 || var21_14) ** GOTO lbl6
                    v1 = kv.INTER_SEMIBOLD;
                    if (var23_12) {
                        throw null;
                    }
                    break block160;
                }
                if (var21_14 || var21_14) ** GOTO lbl6
                v1 = var20_24 = kv.getDefault();
            }
            if (var21_14 || var21_14) ** GOTO lbl6
            this.queuedCounts[var14_17] = var19_22;
            if (var21_14) ** GOTO lbl6
            if (var22_13 /* !! */  == 0) ** GOTO lbl-1000
            switch (var22_13 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var21_14) ** GOTO lbl6
                    this.queuedCountX[var14_17] = var15_18 + var7_7 - ef.ajfd("akls", ajfn(int ), (int)554) - kq.width(var20_24, var19_22, (float)ef.ajfd("aklt", ajfn(int ), (int)555));
                    if (var21_14 || var21_14) ** GOTO lbl6
                    this.queuedCountY[var14_17] = ef.centeredY(var20_24, var19_22, (float)ef.ajfd("aklu", ajfn(int ), (int)556), var12_15 + var7_7 - ef.ajfd("aklv", ajfn(int ), (int)557) - ef.ajfd("aklw", ajfn(int ), (int)558));
                    if (var21_14) ** GOTO lbl6
lbl85:
                    // 3 sources

                    if (var21_14 || var21_14) ** GOTO lbl6
                    if (!var11_11) ** GOTO lbl99
                    if (var21_14 || var21_14) ** GOTO lbl6
                    var19_23 = ef.durability(var16_19);
                    if (var21_14 || var21_14) ** GOTO lbl6
                    var20_25 = this.animatedDurability.getOrDefault(var6_6[var14_17], Float.valueOf(var19_23)).floatValue();
                    if (var21_14 || var21_14) ** GOTO lbl6
                    var20_25 += (var19_23 - var20_25) * var10_10;
                    if (var21_14 || var21_14) ** GOTO lbl6
                    this.animatedDurability.put(var6_6[var14_17], Float.valueOf(var20_25));
                    if (var21_14 || var21_14) ** GOTO lbl6
                    ef.drawDurability(var1_1, var15_18, var12_15, var7_7, var20_25, var9_9);
                    if (var21_14) ** GOTO lbl6
lbl99:
                    // 3 sources

                    if (var21_14 || var21_14) ** GOTO lbl6
                    ++var14_17;
                    if (var21_14) ** GOTO lbl6
                    if (!var23_12) continue block82;
                    throw null;
                }
lbl104:
                // 1 sources

                if (var21_14 || var21_14) ** GOTO lbl6
                this.drawPanelOutline(var1_1, var2_2, var3_3, var4_4, (float)ef.ajfd("aklx", ajfn(int ), (int)559), (float)ef.ajfd("akly", ajfn(int ), (int)560), (float)ef.ajfd("aklz", ajfn(int ), (int)561), ef.BORDER, var9_9);
                if (!var21_14 && !var21_14) ** break;
                ** continue;
                return;
lbl109:
                // 3 sources

                case 0: {
                    var22_13 /* !! */  = (int)ef.ajfd("akma", ajfa(int ), (int)562);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl192
                }
lbl114:
                // 3 sources

                case 1: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmb", ajfa(int ), (int)563);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl391
                }
                case 2: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmc", ajfa(int ), (int)564);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl124:
                // 2 sources

                case 3: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmd", ajfa(int ), (int)565);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
                case 4: {
                    var22_13 /* !! */  = (int)ef.ajfd("akme", ajfa(int ), (int)566);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl134:
                // 3 sources

                case 5: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmf", ajfa(int ), (int)567);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl320
                }
lbl139:
                // 2 sources

                case 6: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmg", ajfa(int ), (int)568);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl376
                }
                case 7: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmh", ajfa(int ), (int)569);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
lbl149:
                // 2 sources

                case 8: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmi", ajfa(int ), (int)570);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl262
                }
lbl154:
                // 2 sources

                case 9: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmj", ajfa(int ), (int)571);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl350
                }
                case 10: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmk", ajfa(int ), (int)572);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl433
                }
lbl164:
                // 3 sources

                case 11: {
                    var22_13 /* !! */  = (int)ef.ajfd("akml", ajfa(int ), (int)573);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl457
                }
                case 12: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmm", ajfa(int ), (int)574);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl174:
                // 2 sources

                case 13: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmn", ajfa(int ), (int)575);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl306
                }
lbl179:
                // 3 sources

                case 14: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmo", ajfa(int ), (int)576);
                    if (!var23_12) ** GOTO lbl164
                    throw null;
                }
                case 15: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmp", ajfa(int ), (int)577);
                    if (!var23_12) ** GOTO lbl109
                    throw null;
                }
lbl187:
                // 2 sources

                case 16: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmq", ajfa(int ), (int)578);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl192:
                // 2 sources

                case 17: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmr", ajfa(int ), (int)579);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
lbl197:
                // 2 sources

                case 18: {
                    var22_13 /* !! */  = (int)ef.ajfd("akms", ajfa(int ), (int)580);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl253
                }
                case 19: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmt", ajfa(int ), (int)581);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl207:
                // 5 sources

                case 20: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmu", ajfa(int ), (int)582);
                    if (!var23_12) ** GOTO lbl197
                    throw null;
                }
lbl211:
                // 3 sources

                case 21: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmv", ajfa(int ), (int)583);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl424
                }
lbl216:
                // 3 sources

                case 22: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmw", ajfa(int ), (int)584);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl367
                }
lbl221:
                // 3 sources

                case 23: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmx", ajfa(int ), (int)585);
                    if (!var23_12) ** GOTO lbl211
                    throw null;
                }
lbl225:
                // 4 sources

                case 24: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmy", ajfa(int ), (int)586);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl363
                }
                case 25: {
                    var22_13 /* !! */  = (int)ef.ajfd("akmz", ajfa(int ), (int)587);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl415
                }
lbl235:
                // 2 sources

                case 26: {
                    var22_13 /* !! */  = (int)ef.ajfd("akna", ajfa(int ), (int)588);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl457
                }
lbl240:
                // 2 sources

                case 27: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknb", ajfa(int ), (int)589);
                    if (!var23_12) ** GOTO lbl216
                    throw null;
                }
                case 28: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknc", ajfa(int ), (int)590);
                    if (!var23_12) ** GOTO lbl221
                    throw null;
                }
                case 29: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknd", ajfa(int ), (int)591);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
lbl253:
                // 2 sources

                case 30: {
                    var22_13 /* !! */  = (int)ef.ajfd("akne", ajfa(int ), (int)592);
                    if (!var23_12) ** GOTO lbl149
                    throw null;
                }
                case 31: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknf", ajfa(int ), (int)593);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl363
                }
lbl262:
                // 2 sources

                case 32: {
                    var22_13 /* !! */  = (int)ef.ajfd("akng", ajfa(int ), (int)594);
                    if (!var23_12) ** GOTO lbl154
                    throw null;
                }
                case 33: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknh", ajfa(int ), (int)595);
                    if (!var23_12) ** GOTO lbl207
                    throw null;
                }
                case 34: {
                    var22_13 /* !! */  = (int)ef.ajfd("akni", ajfa(int ), (int)596);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl275:
                // 3 sources

                case 35: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknj", ajfa(int ), (int)597);
                    if (!var23_12) ** GOTO lbl114
                    throw null;
                }
lbl279:
                // 5 sources

                case 36: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknk", ajfa(int ), (int)598);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl298
                }
                case 37: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknl", ajfa(int ), (int)599);
                    if (!var23_12) ** GOTO lbl179
                    throw null;
                }
                case 38: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknm", ajfa(int ), (int)600);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl342
                }
                case 39: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknn", ajfa(int ), (int)601);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl350
                }
lbl298:
                // 2 sources

                case 40: {
                    var22_13 /* !! */  = (int)ef.ajfd("akno", ajfa(int ), (int)602);
                    if (!var23_12) ** GOTO lbl221
                    throw null;
                }
lbl302:
                // 2 sources

                case 41: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknp", ajfa(int ), (int)603);
                    if (!var23_12) ** GOTO lbl275
                    throw null;
                }
lbl306:
                // 2 sources

                case 42: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknq", ajfa(int ), (int)604);
                    if (!var23_12) ** GOTO lbl207
                    throw null;
                }
                case 43: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknr", ajfa(int ), (int)605);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl407
                }
                case 44: {
                    var22_13 /* !! */  = (int)ef.ajfd("akns", ajfa(int ), (int)606);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl424
                }
lbl320:
                // 2 sources

                case 45: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknt", ajfa(int ), (int)607);
                    if (!var23_12) ** GOTO lbl114
                    throw null;
                }
lbl324:
                // 5 sources

                case 46: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknu", ajfa(int ), (int)608);
                    if (!var23_12) ** GOTO lbl109
                    throw null;
                }
                case 47: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknv", ajfa(int ), (int)609);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl367
                }
                case 48: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknw", ajfa(int ), (int)610);
                    if (var23_12) {
                        throw null;
                    }
                }
                case 49: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknx", ajfa(int ), (int)611);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl424
                }
lbl342:
                // 2 sources

                case 50: {
                    var22_13 /* !! */  = (int)ef.ajfd("akny", ajfa(int ), (int)612);
                    if (!var23_12) ** GOTO lbl275
                    throw null;
                }
                case 51: {
                    var22_13 /* !! */  = (int)ef.ajfd("aknz", ajfa(int ), (int)613);
                    if (!var23_12) ** GOTO lbl164
                    throw null;
                }
lbl350:
                // 3 sources

                case 52: {
                    var22_13 /* !! */  = (int)ef.ajfd("akoa", ajfa(int ), (int)614);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl386
                }
                case 53: {
                    var22_13 /* !! */  = (int)ef.ajfd("akob", ajfa(int ), (int)615);
                    if (!var23_12) ** GOTO lbl324
                    throw null;
                }
lbl359:
                // 2 sources

                case 54: {
                    var22_13 /* !! */  = (int)ef.ajfd("akoc", ajfa(int ), (int)616);
                    if (!var23_12) ** GOTO lbl124
                    throw null;
                }
lbl363:
                // 3 sources

                case 55: {
                    var22_13 /* !! */  = (int)ef.ajfd("akod", ajfa(int ), (int)617);
                    if (!var23_12) ** GOTO lbl359
                    throw null;
                }
lbl367:
                // 3 sources

                case 56: {
                    do {
                        var22_13 /* !! */  = (int)ef.ajfd("akoe", ajfa(int ), (int)618);
                    } while (!var23_12);
                    throw null;
                }
lbl372:
                // 2 sources

                case 57: {
                    var22_13 /* !! */  = (int)ef.ajfd("akof", ajfa(int ), (int)619);
                    if (!var23_12) ** GOTO lbl235
                    throw null;
                }
lbl376:
                // 2 sources

                case 58: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var22_13 /* !! */  = (int)ef.ajfd("akog", ajfa(int ), (int)620);
                        if (!var23_12) ** GOTO lbl279
                        throw null;
                    }
                }
lbl381:
                // 2 sources

                case 59: {
                    var22_13 /* !! */  = (int)ef.ajfd("akoh", ajfa(int ), (int)621);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl411
                }
lbl386:
                // 2 sources

                case 60: {
                    var22_13 /* !! */  = (int)ef.ajfd("akoi", ajfa(int ), (int)622);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl403
                }
lbl391:
                // 2 sources

                case 61: {
                    var22_13 /* !! */  = (int)ef.ajfd("akoj", ajfa(int ), (int)623);
                    if (!var23_12) ** GOTO lbl240
                    throw null;
                }
lbl395:
                // 2 sources

                case 62: {
                    var22_13 /* !! */  = (int)ef.ajfd("akok", ajfa(int ), (int)624);
                    if (!var23_12) ** GOTO lbl134
                    throw null;
                }
                case 63: {
                    var22_13 /* !! */  = (int)ef.ajfd("akol", ajfa(int ), (int)625);
                    if (!var23_12) ** GOTO lbl381
                    throw null;
                }
lbl403:
                // 2 sources

                case 64: {
                    var22_13 /* !! */  = (int)ef.ajfd("akom", ajfa(int ), (int)626);
                    if (!var23_12) ** GOTO lbl187
                    throw null;
                }
lbl407:
                // 2 sources

                case 65: {
                    var22_13 /* !! */  = (int)ef.ajfd("akon", ajfa(int ), (int)627);
                    if (!var23_12) ** GOTO lbl216
                    throw null;
                }
lbl411:
                // 2 sources

                case 66: {
                    var22_13 /* !! */  = (int)ef.ajfd("akoo", ajfa(int ), (int)628);
                    if (!var23_12) ** GOTO lbl207
                    throw null;
                }
lbl415:
                // 2 sources

                case 67: {
                    do {
                        var22_13 /* !! */  = (int)ef.ajfd("akop", ajfa(int ), (int)629);
                    } while (!var23_12);
                    throw null;
                }
                case 68: {
                    var22_13 /* !! */  = (int)ef.ajfd("alpo", ajfa(int ), (int)630);
                    if (!var23_12) ** GOTO lbl211
                    throw null;
                }
lbl424:
                // 4 sources

                case 69: {
                    var22_13 /* !! */  = (int)ef.ajfd("alpq", ajfa(int ), (int)631);
                    if (var23_12) {
                        throw null;
                    }
                    ** GOTO lbl441
                }
lbl429:
                // 2 sources

                case 70: {
                    var22_13 /* !! */  = (int)ef.ajfd("alpu", ajfa(int ), (int)632);
                    if (!var23_12) ** GOTO lbl139
                    throw null;
                }
lbl433:
                // 2 sources

                case 71: {
                    var22_13 /* !! */  = (int)ef.ajfd("alpx", ajfa(int ), (int)633);
                    if (!var23_12) ** GOTO lbl372
                    throw null;
                }
                case 72: {
                    var22_13 /* !! */  = (int)ef.ajfd("alpz", ajfa(int ), (int)634);
                    if (!var23_12) ** GOTO lbl429
                    throw null;
                }
lbl441:
                // 2 sources

                case 73: {
                    var22_13 /* !! */  = (int)ef.ajfd("alqb", ajfa(int ), (int)635);
                    if (!var23_12) ** GOTO lbl179
                    throw null;
                }
                case 74: {
                    var22_13 /* !! */  = (int)ef.ajfd("alqe", ajfa(int ), (int)636);
                    if (!var23_12) ** GOTO lbl134
                    throw null;
                }
                case 75: {
                    var22_13 /* !! */  = (int)ef.ajfd("alqi", ajfa(int ), (int)637);
                    if (!var23_12) ** GOTO lbl174
                    throw null;
                }
                case 76: {
                    var22_13 /* !! */  = (int)ef.ajfd("alqk", ajfa(int ), (int)638);
                    if (!var23_12) ** GOTO lbl395
                    throw null;
                }
lbl457:
                // 3 sources

                case 77: {
                    var22_13 /* !! */  = (int)ef.ajfd("alqn", ajfa(int ), (int)639);
                    if (!var23_12) ** GOTO lbl225
                    throw null;
                }
                case 78: 
            }
            break;
        }
        var22_13 /* !! */  = (int)ef.ajfd("alqr", ajfa(int ), (int)640);
        ** while (!var23_12)
lbl464:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ansg() {
        ef.ajfi[200] = -72629509904849602L;
        ef.ajfi[201] = -311900489337238819L;
        ef.ajfi[202] = 1786599338488434677L;
        ef.ajfi[203] = 2475213019731660562L;
        ef.ajfi[204] = 6029006709976251822L;
        ef.ajfi[205] = -2497433071262190353L;
        ef.ajfi[206] = 5606970112287801716L;
        ef.ajfi[207] = -1992870480901153448L;
        ef.ajfi[208] = 5039418154377585318L;
        ef.ajfi[209] = 7438432415986846177L;
        ef.ajfi[210] = 3067329967433139699L;
        ef.ajfi[211] = 336999058506377072L;
        ef.ajfi[212] = -138399682137450668L;
        ef.ajfi[213] = 7137051695253211382L;
        ef.ajfi[214] = -4774036536101847490L;
        ef.ajfi[215] = 4994809637517488580L;
        ef.ajfi[216] = -3474930033668617057L;
        ef.ajfi[217] = 8376694735681274228L;
        ef.ajfi[218] = -694467520396428209L;
        ef.ajfi[219] = -5482938786851942354L;
        ef.ajfi[220] = 4651190304651363048L;
        ef.ajfi[221] = 1339763132276511577L;
        ef.ajfi[222] = -1551592541562004571L;
        ef.ajfi[223] = 294735950078005987L;
        ef.ajfi[224] = -6041270779714960468L;
        ef.ajfi[225] = -6474880336535949322L;
        ef.ajfi[226] = -2090066722223035359L;
        ef.ajfi[227] = -7835165414960634048L;
        ef.ajfi[228] = -4930809925419848778L;
        ef.ajfi[229] = 8795804583985641895L;
        ef.ajfi[230] = 5275364268408109461L;
        ef.ajfi[231] = -8649841954797795764L;
        ef.ajfi[232] = 5874608625655213722L;
        ef.ajfi[233] = 8020443734131299644L;
        ef.ajfi[234] = -6188746900349029248L;
        ef.ajfi[235] = 5696818880274341203L;
        ef.ajfi[236] = -8231025564000076758L;
        ef.ajfi[237] = 2579051058779915074L;
        ef.ajfi[238] = 4968043484440285922L;
        ef.ajfi[239] = -2691282882137638398L;
        ef.ajfi[240] = -849445669525973467L;
        ef.ajfi[241] = 6088211236547203047L;
        ef.ajfi[242] = -6314391563930661748L;
        ef.ajfi[243] = 6427210484326463126L;
        ef.ajfi[244] = 781394688891568477L;
        ef.ajfi[245] = -4481861226515049551L;
        ef.ajfi[246] = -8847821907878446590L;
        ef.ajfi[247] = -6778484339773149472L;
        ef.ajfi[248] = 7045385415452198347L;
        ef.ajfi[249] = 3319234709802389287L;
        ef.ajfi[250] = 6285269268399246288L;
        ef.ajfi[251] = -4513164067460273494L;
        ef.ajfi[252] = 6851079828230577134L;
        ef.ajfi[253] = -3682241725374077179L;
        ef.ajfi[254] = 5711402133956357593L;
        ef.ajfi[255] = 2028361610257293567L;
        ef.ajfi[256] = 2443334181218291881L;
        ef.ajfi[257] = -2251055180048850331L;
        ef.ajfi[258] = 4272068202333363252L;
        ef.ajfi[259] = 9012670544606383349L;
        ef.ajfi[260] = -7772686510018397322L;
        ef.ajfi[261] = -1958341447378538866L;
        ef.ajfi[262] = -4947057872562856343L;
        ef.ajfi[263] = 5658779594410683077L;
        ef.ajfi[264] = 6927128137600922358L;
        ef.ajfi[265] = -8733184858416958208L;
        ef.ajfi[266] = 313003669835487928L;
        ef.ajfi[267] = -2456757207655162399L;
        ef.ajfi[268] = -5836760487103279964L;
        ef.ajfi[269] = 2285109598312303840L;
        ef.ajfi[270] = 7166470080706988131L;
        ef.ajfi[271] = -8872162297006990917L;
        ef.ajfi[272] = 1674164702056003524L;
        ef.ajfi[273] = -2429371840628175708L;
        ef.ajfi[274] = -5865174746619057569L;
        ef.ajfi[275] = 6024472581884775976L;
        ef.ajfi[276] = -7630479119177350999L;
        ef.ajfi[277] = 2056857329110194451L;
        ef.ajfi[278] = -2588136695575025574L;
        ef.ajfi[279] = -8793373954121005451L;
        ef.ajfi[280] = -4893054335656186878L;
        ef.ajfi[281] = 323043083696587664L;
        ef.ajfi[282] = -6529065540056246725L;
        ef.ajfi[283] = 7182815883361646720L;
        ef.ajfi[284] = -6214414686927587306L;
        ef.ajfi[285] = -7770744830834451774L;
        ef.ajfi[286] = -7651199043056910453L;
        ef.ajfi[287] = -4853525997380280196L;
        ef.ajfi[288] = -6287362418025421777L;
        ef.ajfi[289] = -5168488681660515330L;
        ef.ajfi[290] = 1370414439440427919L;
        ef.ajfi[291] = -5464095709486396538L;
        ef.ajfi[292] = 235316960220993921L;
        ef.ajfi[293] = -1663791940518678299L;
        ef.ajfi[294] = -397774549158609227L;
        ef.ajfi[295] = -287488702695834865L;
        ef.ajfi[296] = -7367995212266732455L;
        ef.ajfi[297] = 23065023937311822L;
        ef.ajfi[298] = 6474441779531343980L;
        ef.ajfi[299] = -4120634686055342671L;
    }

    private static /* synthetic */ void andl() {
        ef.ajfb[500] = -165110852;
        ef.ajfb[501] = 1061404401;
        ef.ajfb[502] = 1595618471;
        ef.ajfb[503] = -1961907176;
        ef.ajfb[504] = 859061225;
        ef.ajfb[505] = 503975293;
        ef.ajfb[506] = -968491648;
        ef.ajfb[507] = 2005569752;
        ef.ajfb[508] = -938231356;
        ef.ajfb[509] = -1941455345;
        ef.ajfb[510] = -255879274;
        ef.ajfb[511] = -1208564822;
        ef.ajfb[512] = -1124682684;
        ef.ajfb[513] = 1801438090;
        ef.ajfb[514] = -1146717144;
        ef.ajfb[515] = -1629001046;
        ef.ajfb[516] = -1743054683;
        ef.ajfb[517] = -316833613;
        ef.ajfb[518] = -878971406;
        ef.ajfb[519] = -1830886969;
        ef.ajfb[520] = 585532950;
        ef.ajfb[521] = -403283247;
        ef.ajfb[522] = 329299649;
        ef.ajfb[523] = -1061013913;
        ef.ajfb[524] = 633504256;
        ef.ajfb[525] = 180221096;
        ef.ajfb[526] = -976112405;
        ef.ajfb[527] = -1528296627;
        ef.ajfb[528] = -1414269410;
        ef.ajfb[529] = -1607165424;
        ef.ajfb[530] = 1494970904;
        ef.ajfb[531] = 1468546135;
        ef.ajfb[532] = 1462421609;
        ef.ajfb[533] = 883453453;
        ef.ajfb[534] = 1740116200;
        ef.ajfb[535] = -2961053;
        ef.ajfb[536] = -435255132;
        ef.ajfb[537] = 392360331;
        ef.ajfb[538] = 1756290092;
        ef.ajfb[539] = -1505093845;
        ef.ajfb[540] = 1876523627;
        ef.ajfb[541] = -946154241;
        ef.ajfb[542] = -1602621327;
        ef.ajfb[543] = 1818554823;
        ef.ajfb[544] = -1402197692;
        ef.ajfb[545] = -1843278275;
        ef.ajfb[546] = -131949111;
        ef.ajfb[547] = -571831332;
        ef.ajfb[548] = -5669242;
        ef.ajfb[549] = 456120690;
        ef.ajfb[550] = 464836923;
        ef.ajfb[551] = 1934837004;
        ef.ajfb[552] = -1713157301;
        ef.ajfb[553] = -642956479;
        ef.ajfb[554] = 65891063;
        ef.ajfb[555] = -1071721280;
        ef.ajfb[556] = -1504269889;
        ef.ajfb[557] = 317257651;
        ef.ajfb[558] = -1498712233;
        ef.ajfb[559] = -1132090647;
        ef.ajfb[560] = 2056221617;
        ef.ajfb[561] = -1071520550;
        ef.ajfb[562] = -958890468;
        ef.ajfb[563] = -1292810726;
        ef.ajfb[564] = 366361028;
        ef.ajfb[565] = 1041215662;
        ef.ajfb[566] = 662071272;
        ef.ajfb[567] = 435433771;
        ef.ajfb[568] = 1927890987;
        ef.ajfb[569] = -1628681140;
        ef.ajfb[570] = 1680327908;
        ef.ajfb[571] = 2096787006;
        ef.ajfb[572] = 1601047402;
        ef.ajfb[573] = -1678805042;
        ef.ajfb[574] = -1012489267;
        ef.ajfb[575] = 1980219940;
        ef.ajfb[576] = -890398261;
        ef.ajfb[577] = 97400647;
        ef.ajfb[578] = -2098543508;
        ef.ajfb[579] = -1534058504;
        ef.ajfb[580] = 33367532;
        ef.ajfb[581] = -1710992929;
        ef.ajfb[582] = 1586941448;
        ef.ajfb[583] = 97682137;
        ef.ajfb[584] = -977402130;
        ef.ajfb[585] = -735986366;
        ef.ajfb[586] = 1750478361;
        ef.ajfb[587] = -412197039;
        ef.ajfb[588] = -949563530;
        ef.ajfb[589] = 1123272318;
        ef.ajfb[590] = -697600820;
        ef.ajfb[591] = 1010809459;
        ef.ajfb[592] = -17698344;
        ef.ajfb[593] = 1732649125;
        ef.ajfb[594] = 1162437360;
        ef.ajfb[595] = -2017771188;
        ef.ajfb[596] = 181582357;
        ef.ajfb[597] = 1158109041;
        ef.ajfb[598] = -2079391284;
        ef.ajfb[599] = -1916473200;
    }

    private static /* synthetic */ void anpb() {
        ef.ajfc[800] = -383663315;
        ef.ajfc[801] = 57832648;
        ef.ajfc[802] = -979066341;
        ef.ajfc[803] = -1413226000;
        ef.ajfc[804] = 1579933056;
        ef.ajfc[805] = -1384776822;
        ef.ajfc[806] = 752380051;
        ef.ajfc[807] = -1101869599;
        ef.ajfc[808] = -784590428;
        ef.ajfc[809] = 569342128;
        ef.ajfc[810] = -1614608787;
        ef.ajfc[811] = -1905938627;
        ef.ajfc[812] = -887298;
        ef.ajfc[813] = 550697329;
        ef.ajfc[814] = 2033105194;
        ef.ajfc[815] = 978176704;
        ef.ajfc[816] = 2066676843;
        ef.ajfc[817] = -339131456;
        ef.ajfc[818] = -1943753094;
        ef.ajfc[819] = -1637199595;
        ef.ajfc[820] = 1967286574;
        ef.ajfc[821] = 1548912923;
        ef.ajfc[822] = 1046876726;
        ef.ajfc[823] = -1861617044;
        ef.ajfc[824] = -1480347355;
        ef.ajfc[825] = -2141077397;
        ef.ajfc[826] = -1471186334;
        ef.ajfc[827] = 1484564597;
        ef.ajfc[828] = -1526334719;
        ef.ajfc[829] = 33212791;
        ef.ajfc[830] = 234370958;
        ef.ajfc[831] = 869431535;
        ef.ajfc[832] = 882147404;
        ef.ajfc[833] = -1144335459;
        ef.ajfc[834] = -699676802;
        ef.ajfc[835] = 1424027006;
        ef.ajfc[836] = -123929939;
        ef.ajfc[837] = 2018769854;
        ef.ajfc[838] = 1433751053;
        ef.ajfc[839] = 805295005;
        ef.ajfc[840] = -955814413;
        ef.ajfc[841] = 310460717;
        ef.ajfc[842] = 836732869;
        ef.ajfc[843] = 2031276982;
        ef.ajfc[844] = 946956401;
        ef.ajfc[845] = 239627798;
        ef.ajfc[846] = 1463725802;
        ef.ajfc[847] = -1193021563;
        ef.ajfc[848] = 2120162087;
        ef.ajfc[849] = -1391101706;
        ef.ajfc[850] = 1404617078;
        ef.ajfc[851] = 1076803758;
        ef.ajfc[852] = 1969354365;
        ef.ajfc[853] = -1761537329;
        ef.ajfc[854] = 1499487727;
        ef.ajfc[855] = -1046637975;
        ef.ajfc[856] = -1036711092;
        ef.ajfc[857] = -555377048;
        ef.ajfc[858] = 149164370;
        ef.ajfc[859] = 244286141;
        ef.ajfc[860] = 2035663135;
        ef.ajfc[861] = 1783391782;
        ef.ajfc[862] = -1122506850;
        ef.ajfc[863] = 93908017;
        ef.ajfc[864] = 1403495790;
        ef.ajfc[865] = -1348294044;
        ef.ajfc[866] = -1972594554;
        ef.ajfc[867] = 1411300753;
        ef.ajfc[868] = -1615984340;
        ef.ajfc[869] = -311030848;
        ef.ajfc[870] = -656399166;
        ef.ajfc[871] = -321924307;
        ef.ajfc[872] = -1197898947;
        ef.ajfc[873] = 527209771;
        ef.ajfc[874] = 1513093776;
        ef.ajfc[875] = 50215431;
        ef.ajfc[876] = 262256441;
        ef.ajfc[877] = 2046775926;
        ef.ajfc[878] = 157504893;
        ef.ajfc[879] = -2133399630;
        ef.ajfc[880] = -1715433700;
        ef.ajfc[881] = -1621739228;
        ef.ajfc[882] = -1031239512;
        ef.ajfc[883] = -1270868070;
        ef.ajfc[884] = 1079697891;
        ef.ajfc[885] = 1204379983;
        ef.ajfc[886] = -605872436;
        ef.ajfc[887] = 158353239;
        ef.ajfc[888] = 1873632078;
        ef.ajfc[889] = 1596574756;
        ef.ajfc[890] = -1960537695;
        ef.ajfc[891] = -519560123;
        ef.ajfc[892] = -407266330;
        ef.ajfc[893] = 2858385;
        ef.ajfc[894] = -1418816638;
        ef.ajfc[895] = 140852820;
        ef.ajfc[896] = -141109951;
        ef.ajfc[897] = 684571964;
        ef.ajfc[898] = -1593979057;
        ef.ajfc[899] = -1343450085;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static float easeOutCubic(float var0) {
        v0 /* !! */  = ef.ca;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ef.ajfd("amwz", ajgj(int ), (int)269));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1872270231: {
                    break block17;
                }
                case -436218162: {
                    v1 = ef.ajfd("amxa", ajgj(int ), (int)270);
                    continue block17;
                }
                case 538839361: {
                    v1 = ef.ajfd("amxb", ajgj(int ), (int)271);
                    continue block17;
                }
            }
            break;
        }
        var4_1 = ef.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amxc", ajgj(int ), (int)272)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ef.ajfd("amxd", ajfa(int ), (int)1065)) break;
            v2 /* !! */  = (long)ef.ajfd("amxe", ajfa(int ), (int)1066);
        }
        var3_2 /* !! */  = ef.b;
        v3 /* !! */  = ef.ca;
        block19: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -1872270231: {
                    break block19;
                }
                case -627651259: {
                    v3 /* !! */  = (long)(ef.ajfd("amxg", ajgj(int ), (int)274) - ef.ajfd("amxf", ajgj(int ), (int)273));
                    continue block19;
                }
            }
            break;
        }
        var2_3 = ef.a;
        if (var4_1) {
            throw null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block20: while (true) {
            block34: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_3 || var2_3) return (float)ef.ajfd("amxh", ajfn(int ), (int)1067);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amxi", ajgj(int ), (int)275)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == ef.ajfd("amxj", ajfa(int ), (int)1068)) {
                                var1_4 = 1.0f - class_3532.method_15363((float)var0, (float)0.0f, (float)1.0f);
                                if (var2_3) return (float)ef.ajfd("amxh", ajfn(int ), (int)1067);
                                break;
                            }
                            v4 /* !! */  = (long)ef.ajfd("amxk", ajfa(int ), (int)1069);
                        }
                        if (!var2_3) return 1.0f - var1_4 * var1_4 * var1_4;
                        return (float)ef.ajfd("amxh", ajfn(int ), (int)1067);
                    }
                    case 0: {
                        ** GOTO lbl60
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)ef.ajfd("amxp", ajfa(int ), (int)1074);
                        cfr_temp_0 = 1;
                        if (var4_1) {
                            throw null;
                        }
                        break block34;
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)ef.ajfd("amxq", ajfa(int ), (int)1075);
                        if (var4_1) {
                            throw null;
                        }
lbl60:
                        // 3 sources

                        var3_2 /* !! */  = (int)ef.ajfd("amxl", ajfa(int ), (int)1070);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)ef.ajfd("amxo", ajfa(int ), (int)1073);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)ef.ajfd("amxm", ajfa(int ), (int)1071);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl76
            }
            do {
                if (true) continue block20;
lbl76:
                // 2 sources

                var3_2 /* !! */  = (int)ef.ajfd("amxn", ajfa(int ), (int)1072);
                cfr_temp_0 = 1;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ancz() {
        ef.ajfb[200] = -1794336;
        ef.ajfb[201] = -1196801668;
        ef.ajfb[202] = 972856070;
        ef.ajfb[203] = -1677195411;
        ef.ajfb[204] = -421619095;
        ef.ajfb[205] = -1189737466;
        ef.ajfb[206] = -1545469634;
        ef.ajfb[207] = 1934897101;
        ef.ajfb[208] = -1024855789;
        ef.ajfb[209] = 1426419440;
        ef.ajfb[210] = -2099290248;
        ef.ajfb[211] = -382537227;
        ef.ajfb[212] = -1929205013;
        ef.ajfb[213] = 759958474;
        ef.ajfb[214] = -133477516;
        ef.ajfb[215] = -1015820584;
        ef.ajfb[216] = 563319193;
        ef.ajfb[217] = -1550347380;
        ef.ajfb[218] = 625498016;
        ef.ajfb[219] = -609800913;
        ef.ajfb[220] = 1886366568;
        ef.ajfb[221] = -1321852406;
        ef.ajfb[222] = -1045819824;
        ef.ajfb[223] = 2016013387;
        ef.ajfb[224] = 1939497352;
        ef.ajfb[225] = 1126028250;
        ef.ajfb[226] = 1289707754;
        ef.ajfb[227] = -228501731;
        ef.ajfb[228] = -1397925323;
        ef.ajfb[229] = 618559354;
        ef.ajfb[230] = 1928658965;
        ef.ajfb[231] = 742882070;
        ef.ajfb[232] = -190431141;
        ef.ajfb[233] = 750201403;
        ef.ajfb[234] = -563337733;
        ef.ajfb[235] = 201057379;
        ef.ajfb[236] = 778511636;
        ef.ajfb[237] = 1222650803;
        ef.ajfb[238] = 47806727;
        ef.ajfb[239] = 739479794;
        ef.ajfb[240] = -1629923510;
        ef.ajfb[241] = 1997260550;
        ef.ajfb[242] = -1433528911;
        ef.ajfb[243] = 667337595;
        ef.ajfb[244] = 2098667244;
        ef.ajfb[245] = -351216684;
        ef.ajfb[246] = -866610581;
        ef.ajfb[247] = 1355856926;
        ef.ajfb[248] = 1268281643;
        ef.ajfb[249] = -372052354;
        ef.ajfb[250] = -753542921;
        ef.ajfb[251] = -1515849298;
        ef.ajfb[252] = -1462217094;
        ef.ajfb[253] = 1093306440;
        ef.ajfb[254] = 1468397470;
        ef.ajfb[255] = 1267836086;
        ef.ajfb[256] = -671229585;
        ef.ajfb[257] = -1398637261;
        ef.ajfb[258] = 1647829948;
        ef.ajfb[259] = -157251929;
        ef.ajfb[260] = -99281204;
        ef.ajfb[261] = 1520916036;
        ef.ajfb[262] = -1053333606;
        ef.ajfb[263] = 1889342878;
        ef.ajfb[264] = 1051909974;
        ef.ajfb[265] = -1690672187;
        ef.ajfb[266] = -454393702;
        ef.ajfb[267] = -1716532136;
        ef.ajfb[268] = -496709751;
        ef.ajfb[269] = 1241532064;
        ef.ajfb[270] = -1430057298;
        ef.ajfb[271] = -203644811;
        ef.ajfb[272] = 1762339277;
        ef.ajfb[273] = 630715181;
        ef.ajfb[274] = -836644498;
        ef.ajfb[275] = -21473265;
        ef.ajfb[276] = 1369668620;
        ef.ajfb[277] = 306844333;
        ef.ajfb[278] = 432496544;
        ef.ajfb[279] = -1908119133;
        ef.ajfb[280] = -1495960088;
        ef.ajfb[281] = -2131577383;
        ef.ajfb[282] = 1522026465;
        ef.ajfb[283] = 1946839109;
        ef.ajfb[284] = 75938665;
        ef.ajfb[285] = -511996132;
        ef.ajfb[286] = 1713409291;
        ef.ajfb[287] = -2017184236;
        ef.ajfb[288] = 606259484;
        ef.ajfb[289] = 1281863659;
        ef.ajfb[290] = -1252813276;
        ef.ajfb[291] = 1760671748;
        ef.ajfb[292] = -680275406;
        ef.ajfb[293] = -1715371799;
        ef.ajfb[294] = 1172877221;
        ef.ajfb[295] = 143383298;
        ef.ajfb[296] = -1320938050;
        ef.ajfb[297] = 643500697;
        ef.ajfb[298] = 1867156263;
        ef.ajfb[299] = -972137792;
    }

    private static /* synthetic */ void ankp() {
        ef.ajfc[200] = -1102684728;
        ef.ajfc[201] = -125795039;
        ef.ajfc[202] = 115120902;
        ef.ajfc[203] = -1576532115;
        ef.ajfc[204] = -643917207;
        ef.ajfc[205] = -2020209658;
        ef.ajfc[206] = -1545469633;
        ef.ajfc[207] = 1934897101;
        ef.ajfc[208] = -2132566905;
        ef.ajfc[209] = 354987927;
        ef.ajfc[210] = -1066538235;
        ef.ajfc[211] = -1465219215;
        ef.ajfc[212] = -844599626;
        ef.ajfc[213] = 308727703;
        ef.ajfc[214] = -1177886109;
        ef.ajfc[215] = -2118026587;
        ef.ajfc[216] = 1620157475;
        ef.ajfc[217] = -482519087;
        ef.ajfc[218] = 442668029;
        ef.ajfc[219] = -609800913;
        ef.ajfc[220] = 817552924;
        ef.ajfc[221] = -264883892;
        ef.ajfc[222] = -2095531475;
        ef.ajfc[223] = 954855587;
        ef.ajfc[224] = 1286645205;
        ef.ajfc[225] = 53482173;
        ef.ajfc[226] = 231151214;
        ef.ajfc[227] = -1298052107;
        ef.ajfc[228] = -326656408;
        ef.ajfc[229] = 1709073468;
        ef.ajfc[230] = 842341629;
        ef.ajfc[231] = 1833396304;
        ef.ajfc[232] = -1247390947;
        ef.ajfc[233] = 750201403;
        ef.ajfc[234] = -1620298051;
        ef.ajfc[235] = 1258026789;
        ef.ajfc[236] = 778511851;
        ef.ajfc[237] = 1222650803;
        ef.ajfc[238] = 1039383898;
        ef.ajfc[239] = 1824974214;
        ef.ajfc[240] = -569630146;
        ef.ajfc[241] = 1997260703;
        ef.ajfc[242] = -1433528911;
        ef.ajfc[243] = 1728213171;
        ef.ajfc[244] = 1020704763;
        ef.ajfc[245] = -1421267539;
        ef.ajfc[246] = -1899852689;
        ef.ajfc[247] = 1870229493;
        ef.ajfc[248] = 1957798592;
        ef.ajfc[249] = -372052429;
        ef.ajfc[250] = -753542921;
        ef.ajfc[251] = -415242326;
        ef.ajfc[252] = -1795456656;
        ef.ajfc[253] = 2116162911;
        ef.ajfc[254] = 1754098313;
        ef.ajfc[255] = 1947810209;
        ef.ajfc[256] = -1746607634;
        ef.ajfc[257] = -1824832078;
        ef.ajfc[258] = 1647829920;
        ef.ajfc[259] = -157251929;
        ef.ajfc[260] = -977484505;
        ef.ajfc[261] = 1703839151;
        ef.ajfc[262] = -29923430;
        ef.ajfc[263] = 1889342817;
        ef.ajfc[264] = 1051909974;
        ef.ajfc[265] = -1491487537;
        ef.ajfc[266] = -1502568802;
        ef.ajfc[267] = -617229732;
        ef.ajfc[268] = -565766013;
        ef.ajfc[269] = 1963514807;
        ef.ajfc[270] = -1781820487;
        ef.ajfc[271] = -866894494;
        ef.ajfc[272] = 689049932;
        ef.ajfc[273] = 437177260;
        ef.ajfc[274] = -836644534;
        ef.ajfc[275] = -21473265;
        ef.ajfc[276] = 1846194151;
        ef.ajfc[277] = 761512262;
        ef.ajfc[278] = 650600352;
        ef.ajfc[279] = -1908119133;
        ef.ajfc[280] = -467076762;
        ef.ajfc[281] = -1023476125;
        ef.ajfc[282] = 441616865;
        ef.ajfc[283] = 1260432408;
        ef.ajfc[284] = 75938621;
        ef.ajfc[285] = -511996066;
        ef.ajfc[286] = 1713409325;
        ef.ajfc[287] = -2017184137;
        ef.ajfc[288] = 606259457;
        ef.ajfc[289] = 1281863553;
        ef.ajfc[290] = -1252813310;
        ef.ajfc[291] = 1760671846;
        ef.ajfc[292] = -680275342;
        ef.ajfc[293] = -1715371849;
        ef.ajfc[294] = 1172877281;
        ef.ajfc[295] = 143383302;
        ef.ajfc[296] = -1320938053;
        ef.ajfc[297] = 643500678;
        ef.ajfc[298] = 1867156273;
        ef.ajfc[299] = -972137733;
    }

    private static /* synthetic */ void anjr() {
        ef.ajfc[100] = 1672649017;
        ef.ajfc[101] = 482593581;
        ef.ajfc[102] = -1344899449;
        ef.ajfc[103] = 9048479;
        ef.ajfc[104] = -1310178734;
        ef.ajfc[105] = 2062043687;
        ef.ajfc[106] = -1241991278;
        ef.ajfc[107] = 1406686768;
        ef.ajfc[108] = -2061361008;
        ef.ajfc[109] = -512808576;
        ef.ajfc[110] = 31280178;
        ef.ajfc[111] = 1194267502;
        ef.ajfc[112] = -271911785;
        ef.ajfc[113] = 2144354571;
        ef.ajfc[114] = 806165819;
        ef.ajfc[115] = 1772062514;
        ef.ajfc[116] = -256377086;
        ef.ajfc[117] = 1580199630;
        ef.ajfc[118] = -2015935790;
        ef.ajfc[119] = 1114897116;
        ef.ajfc[120] = -474406999;
        ef.ajfc[121] = -1853653259;
        ef.ajfc[122] = 1361477459;
        ef.ajfc[123] = -1414664605;
        ef.ajfc[124] = 0x72752527;
        ef.ajfc[125] = 2122293001;
        ef.ajfc[126] = -612825995;
        ef.ajfc[127] = 1507025069;
        ef.ajfc[128] = 1530728598;
        ef.ajfc[129] = -1054977951;
        ef.ajfc[130] = -2069043540;
        ef.ajfc[131] = -1999124192;
        ef.ajfc[132] = -857124452;
        ef.ajfc[133] = -647164456;
        ef.ajfc[134] = 1553326798;
        ef.ajfc[135] = -1650289032;
        ef.ajfc[136] = -964673877;
        ef.ajfc[137] = 1277892799;
        ef.ajfc[138] = -898147847;
        ef.ajfc[139] = 561923802;
        ef.ajfc[140] = 2140491139;
        ef.ajfc[141] = 835395861;
        ef.ajfc[142] = 365406131;
        ef.ajfc[143] = 500722985;
        ef.ajfc[144] = -1086009349;
        ef.ajfc[145] = 1743437045;
        ef.ajfc[146] = -2108672431;
        ef.ajfc[147] = 1819031449;
        ef.ajfc[148] = -1683474175;
        ef.ajfc[149] = -1551539377;
        ef.ajfc[150] = 319813021;
        ef.ajfc[151] = -1082766463;
        ef.ajfc[152] = 249245151;
        ef.ajfc[153] = 1414520282;
        ef.ajfc[154] = 628889523;
        ef.ajfc[155] = -1070986636;
        ef.ajfc[156] = 1365895103;
        ef.ajfc[157] = -1358666167;
        ef.ajfc[158] = 974469163;
        ef.ajfc[159] = -997354351;
        ef.ajfc[160] = -259675791;
        ef.ajfc[161] = -868818244;
        ef.ajfc[162] = 369447292;
        ef.ajfc[163] = -94168038;
        ef.ajfc[164] = 417615210;
        ef.ajfc[165] = -959711879;
        ef.ajfc[166] = 1172120735;
        ef.ajfc[167] = 1793603;
        ef.ajfc[168] = -906219505;
        ef.ajfc[169] = 1336202203;
        ef.ajfc[170] = 567146226;
        ef.ajfc[171] = 1479955788;
        ef.ajfc[172] = 1486748212;
        ef.ajfc[173] = -1631774582;
        ef.ajfc[174] = 572967519;
        ef.ajfc[175] = -600541231;
        ef.ajfc[176] = 1476530142;
        ef.ajfc[177] = -736688916;
        ef.ajfc[178] = 1437234109;
        ef.ajfc[179] = -745793184;
        ef.ajfc[180] = 897034064;
        ef.ajfc[181] = 1067836890;
        ef.ajfc[182] = -2067385483;
        ef.ajfc[183] = -298074036;
        ef.ajfc[184] = 1497353285;
        ef.ajfc[185] = 506302358;
        ef.ajfc[186] = 1124512872;
        ef.ajfc[187] = -2100591424;
        ef.ajfc[188] = -956378247;
        ef.ajfc[189] = -855038723;
        ef.ajfc[190] = 1302566160;
        ef.ajfc[191] = -769864426;
        ef.ajfc[192] = 366150254;
        ef.ajfc[193] = 1731894776;
        ef.ajfc[194] = -388505883;
        ef.ajfc[195] = 159972201;
        ef.ajfc[196] = 1137143660;
        ef.ajfc[197] = -28851912;
        ef.ajfc[198] = -398454783;
        ef.ajfc[199] = 1791287400;
    }

    private static /* synthetic */ void anim() {
        ef.ajfb[1100] = -201371426;
        ef.ajfb[1101] = -1540250581;
        ef.ajfb[1102] = 1009010015;
        ef.ajfb[1103] = -374886352;
        ef.ajfb[1104] = -809496457;
        ef.ajfb[1105] = -2037718936;
        ef.ajfb[1106] = -771403311;
        ef.ajfb[1107] = 525331948;
        ef.ajfb[1108] = 1451216853;
        ef.ajfb[1109] = 688413938;
        ef.ajfb[1110] = 1117443175;
        ef.ajfb[1111] = 1026789635;
        ef.ajfb[1112] = 1193855569;
        ef.ajfb[1113] = -1049226486;
        ef.ajfb[1114] = 1523169615;
        ef.ajfb[1115] = -565860380;
        ef.ajfb[1116] = 2100471733;
        ef.ajfb[1117] = 1839016588;
        ef.ajfb[1118] = 1855333308;
        ef.ajfb[1119] = 1769221728;
        ef.ajfb[1120] = 430535370;
        ef.ajfb[1121] = 825055901;
        ef.ajfb[1122] = -1833890335;
        ef.ajfb[1123] = 710901598;
        ef.ajfb[1124] = -1157865030;
        ef.ajfb[1125] = -320110794;
        ef.ajfb[1126] = -922568067;
        ef.ajfb[1127] = 213886580;
        ef.ajfb[1128] = 1941107433;
        ef.ajfb[1129] = 2079571665;
        ef.ajfb[1130] = 1771337237;
        ef.ajfb[1131] = 695754004;
        ef.ajfb[1132] = 1432122484;
        ef.ajfb[1133] = -598709092;
        ef.ajfb[1134] = 2006346934;
        ef.ajfb[1135] = 1087579983;
        ef.ajfb[1136] = -2083628565;
        ef.ajfb[1137] = -781436062;
        ef.ajfb[1138] = 1254529176;
        ef.ajfb[1139] = 953828255;
        ef.ajfb[1140] = -953679840;
        ef.ajfb[1141] = -1204054254;
        ef.ajfb[1142] = -968226266;
        ef.ajfb[1143] = 524705931;
        ef.ajfb[1144] = 827904888;
        ef.ajfb[1145] = -966641580;
        ef.ajfb[1146] = -10872641;
        ef.ajfb[1147] = 1595691501;
        ef.ajfb[1148] = 5234611;
        ef.ajfb[1149] = -1806221396;
        ef.ajfb[1150] = 1010509562;
        ef.ajfb[1151] = -1573442435;
        ef.ajfb[1152] = 785008872;
        ef.ajfb[1153] = 534476972;
        ef.ajfb[1154] = 520823151;
        ef.ajfb[1155] = -1177644235;
        ef.ajfb[1156] = -2060958170;
        ef.ajfb[1157] = -1120235486;
        ef.ajfb[1158] = 1817306350;
        ef.ajfb[1159] = 1573915771;
        ef.ajfb[1160] = -1207533473;
        ef.ajfb[1161] = 470373633;
        ef.ajfb[1162] = 2065565198;
        ef.ajfb[1163] = 1155377525;
        ef.ajfb[1164] = -1512835075;
    }

    public static /* synthetic */ CallSite ajfd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String fit(ks var0, String var1_1, float var2_2, float var3_3) {
        block34: {
            block33: {
                block31: {
                    block32: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amsq", ajgj(int ), (int)232)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == ef.ajfd("amsr", ajfa(int ), (int)989)) break;
                            v0 /* !! */  = (long)ef.ajfd("amss", ajfa(int ), (int)990);
                        }
                        var8_4 = ef.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amst", ajgj(int ), (int)233)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  == ef.ajfd("amsu", ajfa(int ), (int)991)) break;
                            v1 /* !! */  = (long)ef.ajfd("amsv", ajfa(int ), (int)992);
                        }
                        var7_5 = ef.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amsw", ajgj(int ), (int)234)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == ef.ajfd("amsx", ajfa(int ), (int)993)) break;
                            v2 /* !! */  = (long)ef.ajfd("amsy", ajfa(int ), (int)994);
                        }
                        var6_6 = ef.a;
                        if (var8_4) {
                            throw null;
lbl21:
                            // 12 sources

                            return null;
                        }
                        if (var6_6 || var6_6) ** GOTO lbl21
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amsz", ajgj(int ), (int)235)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == ef.ajfd("amta", ajfa(int ), (int)995)) break;
                            v3 /* !! */  = (long)ef.ajfd("amtb", ajfa(int ), (int)996);
                        }
                        if (!(kq.width(var0, var1_1, var3_3) <= var2_2)) break block32;
                        if (var6_6) ** GOTO lbl21
                        return var1_1;
                    }
                    if (var6_6 || var6_6) ** GOTO lbl21
                    var4_7 = "\u2026";
                    if (var6_6 || var6_6) ** GOTO lbl21
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("amtc", ajgj(int ), (int)236)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == ef.ajfd("amtd", ajfa(int ), (int)997)) break;
                        v4 /* !! */  = (long)ef.ajfd("amte", ajfa(int ), (int)998);
                    }
                    var5_8 = var1_1.length();
                    if (var6_6) ** GOTO lbl21
                    do {
                        if (var6_6 || var6_6) ** GOTO lbl21
                        if (var5_8 <= 0) break block31;
                        if (var6_6) ** GOTO lbl21
                        v5 = ef.ajfd("amtf", ajfa(int ), (int)999);
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("amtg", ajgj(int ), (int)237)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == ef.ajfd("amth", ajfa(int ), (int)1000)) break;
                            v6 /* !! */  = (long)ef.ajfd("amti", ajfa(int ), (int)1001);
                        }
                        v7 = var1_1.substring((int)v5, var5_8);
                        v8 /* !! */  = ef.ca;
                        if (true) ** GOTO lbl58
                        block24: while (true) {
                            v8 /* !! */  = (long)(v9 - ef.ajfd("amtj", ajgj(int ), (int)238));
lbl58:
                            // 2 sources

                            switch ((int)v8 /* !! */ ) {
                                case -1872270231: {
                                    break block24;
                                }
                                case -1731236190: {
                                    v9 = ef.ajfd("amtk", ajgj(int ), (int)239);
                                    continue block24;
                                }
                                case -1313600775: {
                                    v9 = ef.ajfd("amtl", ajgj(int ), (int)240);
                                    continue block24;
                                }
                                case 1416732095: {
                                    v9 = ef.ajfd("amtm", ajgj(int ), (int)241);
                                    continue block24;
                                }
                            }
                            break;
                        }
                        v10 = v7 + var4_7;
                        v11 /* !! */  = ef.ca;
                        if (true) ** GOTO lbl75
                        block25: while (true) {
                            v11 /* !! */  = (long)(v12 - ef.ajfd("amtn", ajgj(int ), (int)242));
lbl75:
                            // 2 sources

                            switch ((int)v11 /* !! */ ) {
                                case -1984736309: {
                                    v12 = ef.ajfd("amto", ajgj(int ), (int)243);
                                    continue block25;
                                }
                                case -1872270231: {
                                    break block25;
                                }
                                case -1286389728: {
                                    v12 = ef.ajfd("amtp", ajgj(int ), (int)244);
                                    continue block25;
                                }
                                case 1347510785: {
                                    v12 = ef.ajfd("amtq", ajgj(int ), (int)245);
                                    continue block25;
                                }
                            }
                            break;
                        }
                        if (!(kq.width(var0, v10, var3_3) > var2_2)) break block31;
                        if (var6_6) ** GOTO lbl21
                        --var5_8;
                        if (var6_6) ** GOTO lbl21
                    } while (!var8_4);
                    throw null;
                }
                if (var6_6 || var6_6) ** GOTO lbl21
                if (var5_8 > 0) break block33;
                if (var6_6) ** GOTO lbl21
                v13 = var4_7;
                if (var8_4) {
                    throw null;
                }
                break block34;
            }
            if (!var6_6 && !var6_6) ** break;
            ** while (true)
            v14 = ef.ajfd("amtr", ajfa(int ), (int)1002);
            v15 /* !! */  = ef.ca;
            if (true) ** GOTO lbl109
            block26: while (true) {
                v15 /* !! */  = (long)(ef.ajfd("amtt", ajgj(int ), (int)247) - ef.ajfd("amts", ajgj(int ), (int)246));
lbl109:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2127114477: {
                        continue block26;
                    }
                    case -1872270231: {
                        break block26;
                    }
                }
                break;
            }
            v16 = var1_1.substring((int)v14, var5_8);
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("amtu", ajgj(int ), (int)248)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == ef.ajfd("amtv", ajfa(int ), (int)1003)) {
                    v13 = v16 + var4_7;
                    break;
                }
                v17 /* !! */  = (long)ef.ajfd("amtw", ajfa(int ), (int)1004);
            }
        }
        return v13;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void panel(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7) {
        block44: {
            block43: {
                v0 /* !! */  = ef.ca;
                if (true) ** GOTO lbl5
                block27: while (true) {
                    v0 /* !! */  = (long)(ef.ajfd("amkk", ajgj(int ), (int)168) - ef.ajfd("amkj", ajgj(int ), (int)167));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1872270231: {
                            break block27;
                        }
                        case 885219857: {
                            continue block27;
                        }
                    }
                    break;
                }
                var10_8 = ef.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amkl", ajgj(int ), (int)169)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == ef.ajfd("amkm", ajfa(int ), (int)839)) break;
                    v1 /* !! */  = (long)ef.ajfd("amkn", ajfa(int ), (int)840);
                }
                var9_9 /* !! */  = ef.b;
                v2 /* !! */  = ef.ca;
                if (true) ** GOTO lbl21
                block29: while (true) {
                    v2 /* !! */  = (long)(ef.ajfd("amkp", ajgj(int ), (int)171) - ef.ajfd("amko", ajgj(int ), (int)170));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1872270231: {
                            break block29;
                        }
                        case -778380439: {
                            continue block29;
                        }
                    }
                    break;
                }
                var8_10 = ef.a;
                if (var10_8) {
                    throw null;
lbl29:
                    // 6 sources

                    return;
                }
                if (var8_10 || var8_10) ** GOTO lbl29
                if (!var7_7) break block43;
                if (var8_10 || var8_10) ** GOTO lbl29
                v3 = ef.ajfd("amkq", ajfn(int ), (int)841);
                v4 = ef.ajfd("amkr", ajfn(int ), (int)842);
                v5 /* !! */  = ef.ca;
                if (true) ** GOTO lbl40
                block31: while (true) {
                    v5 /* !! */  = (long)(ef.ajfd("amkt", ajgj(int ), (int)173) - ef.ajfd("amks", ajgj(int ), (int)172));
lbl40:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1872270231: {
                            break block31;
                        }
                        case 1563397568: {
                            continue block31;
                        }
                    }
                    break;
                }
                at.panelWithInnerShadow(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, (float)v3, (float)v4);
                if (var8_10) ** GOTO lbl29
                if (var10_8) {
                    throw null;
                }
                break block44;
            }
            if (var8_10 || var8_10) ** GOTO lbl29
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amku", ajgj(int ), (int)174)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ef.ajfd("amkv", ajfa(int ), (int)843)) break;
                v6 /* !! */  = (long)ef.ajfd("amkw", ajfa(int ), (int)844);
            }
            at.panel(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
            if (var8_10) ** GOTO lbl29
        }
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_10 && !var8_10) ** break;
                ** continue;
                return;
            }
lbl66:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_9 /* !! */  = (int)ef.ajfd("amkx", ajfa(int ), (int)845);
                    if (!var10_8) break block12;
                    throw null;
                }
            }
lbl71:
            // 3 sources

            case 1: {
                var9_9 /* !! */  = (int)ef.ajfd("amky", ajfa(int ), (int)846);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 2: {
                var9_9 /* !! */  = (int)ef.ajfd("amkz", ajfa(int ), (int)847);
                if (!var10_8) ** GOTO lbl66
                throw null;
            }
            case 3: {
                var9_9 /* !! */  = (int)ef.ajfd("amla", ajfa(int ), (int)848);
                if (!var10_8) break;
                throw null;
            }
            case 4: {
                var9_9 /* !! */  = (int)ef.ajfd("amlb", ajfa(int ), (int)849);
                if (!var10_8) ** GOTO lbl66
                throw null;
            }
            case 5: {
                var9_9 /* !! */  = (int)ef.ajfd("amlc", ajfa(int ), (int)850);
                if (var10_8) {
                    throw null;
                }
            }
            case 6: {
                do {
                    var9_9 /* !! */  = (int)ef.ajfd("amld", ajfa(int ), (int)851);
                } while (!var10_8);
                throw null;
            }
            case 7: {
                var9_9 /* !! */  = (int)ef.ajfd("amle", ajfa(int ), (int)852);
                if (!var10_8) break;
                throw null;
            }
lbl101:
            // 3 sources

            case 8: {
                var9_9 /* !! */  = (int)ef.ajfd("amlf", ajfa(int ), (int)853);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 9: {
                var9_9 /* !! */  = (int)ef.ajfd("amlg", ajfa(int ), (int)854);
                if (!var10_8) ** GOTO lbl101
                throw null;
            }
lbl110:
            // 2 sources

            case 10: {
                var9_9 /* !! */  = (int)ef.ajfd("amlh", ajfa(int ), (int)855);
                if (!var10_8) ** GOTO lbl71
                throw null;
            }
            case 11: {
                var9_9 /* !! */  = (int)ef.ajfd("amli", ajfa(int ), (int)856);
                if (!var10_8) ** GOTO lbl71
                throw null;
            }
            case 12: 
        }
        var9_9 /* !! */  = (int)ef.ajfd("amlj", ajfa(int ), (int)857);
        ** while (!var10_8)
lbl121:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void anhr() {
        ef.ajfb[1000] = 469320030;
        ef.ajfb[1001] = -1624019038;
        ef.ajfb[1002] = -320347741;
        ef.ajfb[1003] = 1803544309;
        ef.ajfb[1004] = -748836764;
        ef.ajfb[1005] = 1619885006;
        ef.ajfb[1006] = -1511466872;
        ef.ajfb[1007] = -1946309172;
        ef.ajfb[1008] = 1153482528;
        ef.ajfb[1009] = 267776236;
        ef.ajfb[1010] = -1960397259;
        ef.ajfb[1011] = -1783145161;
        ef.ajfb[1012] = 965351440;
        ef.ajfb[1013] = 69256572;
        ef.ajfb[1014] = -2137345135;
        ef.ajfb[1015] = -2077837641;
        ef.ajfb[1016] = -1212894241;
        ef.ajfb[1017] = -600432068;
        ef.ajfb[1018] = 519478808;
        ef.ajfb[1019] = 1448716294;
        ef.ajfb[1020] = 1934016921;
        ef.ajfb[1021] = 660350140;
        ef.ajfb[1022] = -479468684;
        ef.ajfb[1023] = 441180798;
        ef.ajfb[1024] = -524483892;
        ef.ajfb[1025] = -119805221;
        ef.ajfb[1026] = 689889490;
        ef.ajfb[1027] = 134813241;
        ef.ajfb[1028] = 1784448933;
        ef.ajfb[1029] = -1499404362;
        ef.ajfb[1030] = -681479975;
        ef.ajfb[1031] = -586259654;
        ef.ajfb[1032] = 80675252;
        ef.ajfb[1033] = -634344844;
        ef.ajfb[1034] = -1831577116;
        ef.ajfb[1035] = 728585433;
        ef.ajfb[1036] = 1228533600;
        ef.ajfb[1037] = -648917367;
        ef.ajfb[1038] = 650071632;
        ef.ajfb[1039] = 1292643958;
        ef.ajfb[1040] = -243043540;
        ef.ajfb[1041] = -324543504;
        ef.ajfb[1042] = 1678474016;
        ef.ajfb[1043] = 924276927;
        ef.ajfb[1044] = -198755846;
        ef.ajfb[1045] = 589378231;
        ef.ajfb[1046] = -110569565;
        ef.ajfb[1047] = 1166047535;
        ef.ajfb[1048] = 157214555;
        ef.ajfb[1049] = -785662070;
        ef.ajfb[1050] = -934283420;
        ef.ajfb[1051] = -311661868;
        ef.ajfb[1052] = 724076147;
        ef.ajfb[1053] = 1726214495;
        ef.ajfb[1054] = 1769961287;
        ef.ajfb[1055] = 1148951721;
        ef.ajfb[1056] = 2085590266;
        ef.ajfb[1057] = 8087102;
        ef.ajfb[1058] = -755993063;
        ef.ajfb[1059] = 1854930359;
        ef.ajfb[1060] = 1579888798;
        ef.ajfb[1061] = -1132902128;
        ef.ajfb[1062] = -432469895;
        ef.ajfb[1063] = 106722160;
        ef.ajfb[1064] = 1088825206;
        ef.ajfb[1065] = 901033249;
        ef.ajfb[1066] = -273545838;
        ef.ajfb[1067] = -1395743182;
        ef.ajfb[1068] = -857657663;
        ef.ajfb[1069] = 632696080;
        ef.ajfb[1070] = 1336903631;
        ef.ajfb[1071] = -1654271919;
        ef.ajfb[1072] = -1374496067;
        ef.ajfb[1073] = 517585020;
        ef.ajfb[1074] = -1449123400;
        ef.ajfb[1075] = 453295096;
        ef.ajfb[1076] = -30047301;
        ef.ajfb[1077] = 1953579710;
        ef.ajfb[1078] = 765943508;
        ef.ajfb[1079] = 1852487522;
        ef.ajfb[1080] = 2056567747;
        ef.ajfb[1081] = 2081628856;
        ef.ajfb[1082] = -82484841;
        ef.ajfb[1083] = -34953503;
        ef.ajfb[1084] = -1525987492;
        ef.ajfb[1085] = -554720739;
        ef.ajfb[1086] = -1887654084;
        ef.ajfb[1087] = 1008161092;
        ef.ajfb[1088] = 1757944032;
        ef.ajfb[1089] = 586029765;
        ef.ajfb[1090] = 577514674;
        ef.ajfb[1091] = -2087529392;
        ef.ajfb[1092] = 252358892;
        ef.ajfb[1093] = 301046224;
        ef.ajfb[1094] = 2028060356;
        ef.ajfb[1095] = -1385716206;
        ef.ajfb[1096] = -1346679109;
        ef.ajfb[1097] = -622968857;
        ef.ajfb[1098] = 1717642678;
        ef.ajfb[1099] = -8375066;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void drawQueuedItemCounts(class_332 var1_1) {
        block111: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amhb", ajgj(int ), (int)138)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ef.ajfd("amhd", ajfa(int ), (int)794)) break;
                v0 /* !! */  = (long)ef.ajfd("amhf", ajfa(int ), (int)795);
            }
            var6_2 = ef.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amhh", ajgj(int ), (int)139)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ef.ajfd("amhj", ajfa(int ), (int)796)) break;
                v1 /* !! */  = (long)ef.ajfd("amhk", ajfa(int ), (int)797);
            }
            var5_3 /* !! */  = ef.b;
            v2 /* !! */  = ef.ca;
            if (true) ** GOTO lbl17
            block72: while (true) {
                v2 /* !! */  = (long)(ef.ajfd("amhm", ajgj(int ), (int)141) - ef.ajfd("amhl", ajgj(int ), (int)140));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1971332240: {
                        continue block72;
                    }
                    case -1872270231: {
                        break block72;
                    }
                }
                break;
            }
            var4_4 = ef.a;
            if (var6_2) {
                throw null;
lbl25:
                // 16 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl25
            v3 /* !! */  = ef.ca;
            if (true) ** GOTO lbl32
            block74: while (true) {
                v3 /* !! */  = (long)(ef.ajfd("amhp", ajgj(int ), (int)143) - ef.ajfd("amho", ajgj(int ), (int)142));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2142867864: {
                        continue block74;
                    }
                    case -1872270231: {
                        break block74;
                    }
                }
                break;
            }
            if (!(this.queuedCountOpacity <= ef.ajfd("amhq", ajfn(int ), (int)798))) break block111;
            if (var4_4) ** GOTO lbl25
            return;
        }
        if (var4_4) ** GOTO lbl25
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl25
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amhr", ajgj(int ), (int)144)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ef.ajfd("amhs", ajfa(int ), (int)799)) break;
                    v4 /* !! */  = (long)ef.ajfd("amht", ajfa(int ), (int)800);
                }
                var2_5 = dy.getInstance();
                if (var4_4 || var4_4) ** GOTO lbl25
                if (var2_5 == null) ** GOTO lbl76
                if (var4_4) ** GOTO lbl25
                v5 /* !! */  = ef.ca;
                if (true) ** GOTO lbl59
                block76: while (true) {
                    v5 /* !! */  = (long)(v6 - ef.ajfd("amhu", ajgj(int ), (int)145));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2069600099: {
                            v6 = ef.ajfd("amhv", ajgj(int ), (int)146);
                            continue block76;
                        }
                        case -1872270231: {
                            break block76;
                        }
                        case 1380411983: {
                            v6 = ef.ajfd("amhw", ajgj(int ), (int)147);
                            continue block76;
                        }
                    }
                    break;
                }
                v7 = var2_5.interfaceSettings;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amhx", ajgj(int ), (int)148)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ef.ajfd("amhy", ajfa(int ), (int)801)) break;
                    v8 /* !! */  = (long)ef.ajfd("amhz", ajfa(int ), (int)802);
                }
                if (v7.isSelected("TargetHUD")) ** GOTO lbl78
                if (var4_4) ** GOTO lbl25
lbl76:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl25
                return;
lbl78:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl25
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("amia", ajgj(int ), (int)149)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ef.ajfd("amib", ajfa(int ), (int)803)) break;
                    v9 /* !! */  = (long)ef.ajfd("amic", ajfa(int ), (int)804);
                }
                if (kv.INTER_SEMIBOLD == null) ** GOTO lbl95
                if (var4_4 || var4_4) ** GOTO lbl25
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("amid", ajgj(int ), (int)150)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ef.ajfd("amie", ajfa(int ), (int)805)) break;
                    v10 /* !! */  = (long)ef.ajfd("amif", ajfa(int ), (int)806);
                }
                v11 = kv.INTER_SEMIBOLD;
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl103
lbl95:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl25
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("amig", ajgj(int ), (int)151)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ef.ajfd("amih", ajfa(int ), (int)807)) {
                        v11 = kv.getDefault();
                        break;
                    }
                    v12 /* !! */  = (long)ef.ajfd("amii", ajfa(int ), (int)808);
                }
lbl103:
                // 2 sources

                var3_6 = v11;
                if (var4_4 || var4_4) ** GOTO lbl25
                if (var3_6 != null) ** GOTO lbl108
                if (var4_4) ** GOTO lbl25
                return;
lbl108:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl25
                v13 /* !! */  = ef.ca;
                if (true) ** GOTO lbl113
                block81: while (true) {
                    v13 /* !! */  = (long)(v14 - ef.ajfd("amij", ajgj(int ), (int)152));
lbl113:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1872270231: {
                            break block81;
                        }
                        case -237721386: {
                            v14 = ef.ajfd("amik", ajgj(int ), (int)153);
                            continue block81;
                        }
                        case 292250937: {
                            v14 = ef.ajfd("amil", ajgj(int ), (int)154);
                            continue block81;
                        }
                        case 974429964: {
                            v14 = ef.ajfd("amim", ajgj(int ), (int)155);
                            continue block81;
                        }
                    }
                    break;
                }
                v15 = var2_5.getInterfaceScale();
                v16 /* !! */  = ef.ca;
                if (true) ** GOTO lbl130
                block82: while (true) {
                    v16 /* !! */  = (long)(ef.ajfd("amio", ajgj(int ), (int)157) - ef.ajfd("amin", ajgj(int ), (int)156));
lbl130:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1872270231: {
                            break block82;
                        }
                        case -1834282691: {
                            continue block82;
                        }
                    }
                    break;
                }
                v17 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$drawQueuedItemCounts$0(net.minecraft.class_332 ruhack.phobia.ks ), ()V)((ef)this, (class_332)var1_1, (ks)var3_6);
                v18 /* !! */  = ef.ca;
                if (true) ** GOTO lbl140
                block83: while (true) {
                    v18 /* !! */  = (long)(ef.ajfd("amiq", ajgj(int ), (int)159) - ef.ajfd("amip", ajgj(int ), (int)158));
lbl140:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1872270231: {
                            break block83;
                        }
                        case -1478845901: {
                            continue block83;
                        }
                    }
                    break;
                }
                ki.withContextScale(v15, v17);
                if (var4_4 || var4_4) ** GOTO lbl25
                v19 /* !! */  = ef.ca;
                if (true) ** GOTO lbl151
                block84: while (true) {
                    v19 /* !! */  = (long)(v20 - ef.ajfd("amir", ajgj(int ), (int)160));
lbl151:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1872270231: {
                            break block84;
                        }
                        case -14331496: {
                            v20 = ef.ajfd("amis", ajgj(int ), (int)161);
                            continue block84;
                        }
                        case 1631421513: {
                            v20 = ef.ajfd("amit", ajgj(int ), (int)162);
                            continue block84;
                        }
                        case 1635289301: {
                            v20 = ef.ajfd("amiu", ajgj(int ), (int)163);
                            continue block84;
                        }
                    }
                    break;
                }
                v21 /* !! */  = ef.ca;
                if (true) ** GOTO lbl167
                block85: while (true) {
                    v21 /* !! */  = (long)(v22 - ef.ajfd("amiw", ajgj(int ), (int)164));
lbl167:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1872270231: {
                            break block85;
                        }
                        case -1540742188: {
                            v22 = ef.ajfd("amix", ajgj(int ), (int)165);
                            continue block85;
                        }
                        case 724817187: {
                            v22 = ef.ajfd("amiy", ajgj(int ), (int)166);
                            continue block85;
                        }
                    }
                    break;
                }
                Arrays.fill(this.queuedCounts, null);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl180:
            // 5 sources

            case 0: {
                do {
                    var5_3 /* !! */  = (int)ef.ajfd("amiz", ajfa(int ), (int)809);
                } while (!var6_2);
                throw null;
            }
lbl185:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ef.ajfd("amja", ajfa(int ), (int)810);
                if (!var6_2) ** GOTO lbl180
                throw null;
            }
lbl189:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)ef.ajfd("amjb", ajfa(int ), (int)811);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 3: {
                var5_3 /* !! */  = (int)ef.ajfd("amjc", ajfa(int ), (int)812);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl199:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)ef.ajfd("amjd", ajfa(int ), (int)813);
                if (!var6_2) ** GOTO lbl180
                throw null;
            }
lbl203:
            // 4 sources

            case 5: {
                var5_3 /* !! */  = (int)ef.ajfd("amje", ajfa(int ), (int)814);
                if (!var6_2) ** GOTO lbl180
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)ef.ajfd("amjf", ajfa(int ), (int)815);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 7: {
                var5_3 /* !! */  = (int)ef.ajfd("amjg", ajfa(int ), (int)816);
                if (!var6_2) ** GOTO lbl203
                throw null;
            }
lbl216:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)ef.ajfd("amjh", ajfa(int ), (int)817);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl221:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ef.ajfd("amji", ajfa(int ), (int)818);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl226:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ef.ajfd("amjp", ajfa(int ), (int)819);
                if (!var6_2) ** GOTO lbl216
                throw null;
            }
lbl230:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)ef.ajfd("amjq", ajfa(int ), (int)820);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl235:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)ef.ajfd("amjr", ajfa(int ), (int)821);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl240:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)ef.ajfd("amjs", ajfa(int ), (int)822);
                if (!var6_2) ** GOTO lbl189
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)ef.ajfd("amjt", ajfa(int ), (int)823);
                if (!var6_2) break;
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)ef.ajfd("amju", ajfa(int ), (int)824);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 16: {
                var5_3 /* !! */  = (int)ef.ajfd("amjv", ajfa(int ), (int)825);
                if (!var6_2) ** GOTO lbl235
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)ef.ajfd("amjw", ajfa(int ), (int)826);
                if (!var6_2) ** GOTO lbl185
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)ef.ajfd("amjx", ajfa(int ), (int)827);
                if (!var6_2) ** GOTO lbl221
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)ef.ajfd("amjy", ajfa(int ), (int)828);
                if (!var6_2) ** GOTO lbl199
                throw null;
            }
lbl269:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)ef.ajfd("amjz", ajfa(int ), (int)829);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 21: {
                var5_3 /* !! */  = (int)ef.ajfd("amka", ajfa(int ), (int)830);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 22: {
                var5_3 /* !! */  = (int)ef.ajfd("amkb", ajfa(int ), (int)831);
                if (!var6_2) ** GOTO lbl240
                throw null;
            }
lbl283:
            // 5 sources

            case 23: {
                var5_3 /* !! */  = (int)ef.ajfd("amkc", ajfa(int ), (int)832);
                if (!var6_2) ** GOTO lbl203
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)ef.ajfd("amkd", ajfa(int ), (int)833);
                if (!var6_2) ** GOTO lbl180
                throw null;
            }
lbl291:
            // 3 sources

            case 25: {
                var5_3 /* !! */  = (int)ef.ajfd("amke", ajfa(int ), (int)834);
                if (!var6_2) ** GOTO lbl283
                throw null;
            }
            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ef.ajfd("amkf", ajfa(int ), (int)835);
                    if (!var6_2) ** GOTO lbl203
                    throw null;
                }
            }
lbl300:
            // 3 sources

            case 27: {
                var5_3 /* !! */  = (int)ef.ajfd("amkg", ajfa(int ), (int)836);
                if (!var6_2) ** GOTO lbl240
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)ef.ajfd("amkh", ajfa(int ), (int)837);
                if (!var6_2) break;
                throw null;
            }
            case 29: 
        }
        var5_3 /* !! */  = (int)ef.ajfd("amki", ajfa(int ), (int)838);
        ** while (!var6_2)
lbl311:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void anqu() {
        ef.ajfc[1100] = -1285601079;
        ef.ajfc[1101] = 1540250580;
        ef.ajfc[1102] = -414946662;
        ef.ajfc[1103] = 374886351;
        ef.ajfc[1104] = 1209240722;
        ef.ajfc[1105] = -2037718936;
        ef.ajfc[1106] = -771403323;
        ef.ajfc[1107] = 525331944;
        ef.ajfc[1108] = 1451216849;
        ef.ajfc[1109] = 688413939;
        ef.ajfc[1110] = 1117443185;
        ef.ajfc[1111] = 1026789649;
        ef.ajfc[1112] = 1193855560;
        ef.ajfc[1113] = -1049226470;
        ef.ajfc[1114] = 1523169629;
        ef.ajfc[1115] = -565860377;
        ef.ajfc[1116] = 2100471733;
        ef.ajfc[1117] = 1839016604;
        ef.ajfc[1118] = 1855333311;
        ef.ajfc[1119] = 1769221733;
        ef.ajfc[1120] = 430535372;
        ef.ajfc[1121] = 825055884;
        ef.ajfc[1122] = -1833890332;
        ef.ajfc[1123] = 710901595;
        ef.ajfc[1124] = -1157865035;
        ef.ajfc[1125] = -320110813;
        ef.ajfc[1126] = -922568073;
        ef.ajfc[1127] = 213886560;
        ef.ajfc[1128] = 1941107440;
        ef.ajfc[1129] = 2079571667;
        ef.ajfc[1130] = 1771337219;
        ef.ajfc[1131] = 695753990;
        ef.ajfc[1132] = 1432122482;
        ef.ajfc[1133] = -598709092;
        ef.ajfc[1134] = 2006346934;
        ef.ajfc[1135] = 1087579983;
        ef.ajfc[1136] = -2083628780;
        ef.ajfc[1137] = -781436003;
        ef.ajfc[1138] = 1254529127;
        ef.ajfc[1139] = 953828192;
        ef.ajfc[1140] = -953679827;
        ef.ajfc[1141] = -1204054035;
        ef.ajfc[1142] = -968226087;
        ef.ajfc[1143] = 524705908;
        ef.ajfc[1144] = 827904893;
        ef.ajfc[1145] = -966641493;
        ef.ajfc[1146] = -10872768;
        ef.ajfc[1147] = 1595691282;
        ef.ajfc[1148] = 5234508;
        ef.ajfc[1149] = -1806221485;
        ef.ajfc[1150] = 1010509317;
        ef.ajfc[1151] = -1573442430;
        ef.ajfc[1152] = 785008850;
        ef.ajfc[1153] = 534476883;
        ef.ajfc[1154] = 520823238;
        ef.ajfc[1155] = -1177644163;
        ef.ajfc[1156] = -2060957991;
        ef.ajfc[1157] = -1120235299;
        ef.ajfc[1158] = 1817306272;
        ef.ajfc[1159] = 1573915683;
        ef.ajfc[1160] = -1207533408;
        ef.ajfc[1161] = 470373886;
        ef.ajfc[1162] = 2065565360;
        ef.ajfc[1163] = 1155377457;
        ef.ajfc[1164] = -1512835326;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawDurability(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block89: {
            v0 /* !! */  = ef.ca;
            if (true) ** GOTO lbl5
            block54: while (true) {
                v0 /* !! */  = (long)(v1 - ef.ajfd("ampn", ajgj(int ), (int)209));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1872270231: {
                        break block54;
                    }
                    case -59778787: {
                        v1 = ef.ajfd("ampo", ajgj(int ), (int)210);
                        continue block54;
                    }
                    case 801190817: {
                        v1 = ef.ajfd("ampp", ajgj(int ), (int)211);
                        continue block54;
                    }
                }
                break;
            }
            var12_6 = ef.c;
            v2 /* !! */  = ef.ca;
            if (true) ** GOTO lbl19
            block55: while (true) {
                v2 /* !! */  = (long)(v3 - ef.ajfd("ampq", ajgj(int ), (int)212));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1872270231: {
                        break block55;
                    }
                    case 198531937: {
                        v3 = ef.ajfd("ampr", ajgj(int ), (int)213);
                        continue block55;
                    }
                    case 1982731746: {
                        v3 = ef.ajfd("amps", ajgj(int ), (int)214);
                        continue block55;
                    }
                }
                break;
            }
            var11_7 /* !! */  = ef.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("ampt", ajgj(int ), (int)215)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ef.ajfd("ampu", ajfa(int ), (int)931)) break;
                v4 /* !! */  = (long)ef.ajfd("ampv", ajfa(int ), (int)932);
            }
            var10_8 = ef.a;
            if (var12_6) {
                throw null;
lbl37:
                // 13 sources

                return;
            }
            if (var10_8 || var10_8) ** GOTO lbl37
            if (!(var4_4 <= ef.ajfd("ampw", ajfn(int ), (int)933))) break block89;
            if (var10_8) ** GOTO lbl37
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("ampx", ajgj(int ), (int)216)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ef.ajfd("ampy", ajfa(int ), (int)934)) break;
                v5 /* !! */  = (long)ef.ajfd("ampz", ajfa(int ), (int)935);
            }
            v6 = ef.DANGER;
            if (var12_6) {
                throw null;
            }
            ** GOTO lbl86
        }
        if (var10_8 || var10_8) ** GOTO lbl37
        if (var11_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!(var4_4 <= ef.ajfd("amqa", ajfn(int ), (int)936))) ** GOTO lbl67
                if (var10_8) ** GOTO lbl37
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amqb", ajgj(int ), (int)217)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ef.ajfd("amqc", ajfa(int ), (int)937)) break;
                    v7 /* !! */  = (long)ef.ajfd("amqd", ajfa(int ), (int)938);
                }
                v6 = ef.WARNING;
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl86
lbl67:
                // 1 sources

                if (var10_8 || var10_8) ** GOTO lbl37
                v8 = ef.ajfd("amqe", ajfa(int ), (int)939);
                v9 /* !! */  = ef.ca;
                if (true) ** GOTO lbl73
                block60: while (true) {
                    v9 /* !! */  = (long)(v10 - ef.ajfd("amqf", ajgj(int ), (int)218));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2116445273: {
                            v10 = ef.ajfd("amqg", ajgj(int ), (int)219);
                            continue block60;
                        }
                        case -1872270231: {
                            break block60;
                        }
                        case -422673956: {
                            v10 = ef.ajfd("amqh", ajgj(int ), (int)220);
                            continue block60;
                        }
                        case 116952198: {
                            v10 = ef.ajfd("amqi", ajgj(int ), (int)221);
                            continue block60;
                        }
                    }
                    break;
                }
                v6 = var6_9 = dz.color((int)v8);
lbl86:
                // 3 sources

                if (var10_8 || var10_8) ** GOTO lbl37
                var7_10 = var1_1 + (var3_3 - ef.ajfd("amqj", ajfn(int ), (int)940)) * ef.ajfd("amqk", ajfn(int ), (int)941);
                if (var10_8 || var10_8) ** GOTO lbl37
                var8_11 = var2_2 + var3_3 - ef.ajfd("amql", ajfn(int ), (int)942) - ef.ajfd("amqm", ajfn(int ), (int)943);
                if (var10_8 || var10_8) ** GOTO lbl37
                v11 = ef.ajfd("amqn", ajfn(int ), (int)944);
                v12 = ef.ajfd("amqo", ajfn(int ), (int)945);
                v13 = ef.ajfd("amqp", ajfn(int ), (int)946);
                v14 = ef.ajfd("amqq", ajfa(int ), (int)947);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amqr", ajgj(int ), (int)222)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ef.ajfd("amqs", ajfa(int ), (int)948)) break;
                    v15 /* !! */  = (long)ef.ajfd("amqt", ajfa(int ), (int)949);
                }
                v16 = nd.withAlpha(var6_9, (int)v14);
                v17 /* !! */  = ef.ca;
                if (true) ** GOTO lbl105
                block62: while (true) {
                    v17 /* !! */  = (long)(v18 - ef.ajfd("amqu", ajgj(int ), (int)223));
lbl105:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1872270231: {
                            break block62;
                        }
                        case 838525248: {
                            v18 = ef.ajfd("amqv", ajgj(int ), (int)224);
                            continue block62;
                        }
                        case 2024710063: {
                            v18 = ef.ajfd("amqw", ajgj(int ), (int)225);
                            continue block62;
                        }
                    }
                    break;
                }
                v19 = nd.multAlpha(v16, var5_5);
                v20 = ef.ajfd("amqx", ajfa(int ), (int)950);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("amqy", ajgj(int ), (int)226)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ef.ajfd("amqz", ajfa(int ), (int)951)) break;
                    v21 /* !! */  = (long)ef.ajfd("amra", ajfa(int ), (int)952);
                }
                ki.rect(var0, var7_10, var8_11, (float)v11, (float)v12, (float)v13, v19, (boolean)v20);
                if (var10_8 || var10_8) ** GOTO lbl37
                var9_12 = ef.ajfd("amrb", ajfn(int ), (int)953) * var4_4;
                if (var10_8 || var10_8) ** GOTO lbl37
                if (!(var9_12 > ef.ajfd("amrc", ajfn(int ), (int)954))) ** GOTO lbl158
                if (var10_8 || var10_8) ** GOTO lbl37
                v22 = ef.ajfd("amrd", ajfn(int ), (int)955);
                v23 = ef.ajfd("amre", ajfn(int ), (int)956);
                v24 = var9_12 * ef.ajfd("amrf", ajfn(int ), (int)957);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("amrg", ajgj(int ), (int)227)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ef.ajfd("amrh", ajfa(int ), (int)958)) break;
                    v25 /* !! */  = (long)ef.ajfd("amri", ajfa(int ), (int)959);
                }
                v26 = Math.min((float)v23, (float)v24);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("amrj", ajgj(int ), (int)228)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ef.ajfd("amrk", ajfa(int ), (int)960)) break;
                    v27 /* !! */  = (long)ef.ajfd("amrl", ajfa(int ), (int)961);
                }
                v28 = nd.multAlpha(var6_9, var5_5);
                v29 = ef.ajfd("amrm", ajfa(int ), (int)962);
                v30 /* !! */  = ef.ca;
                if (true) ** GOTO lbl147
                block66: while (true) {
                    v30 /* !! */  = (long)(v31 - ef.ajfd("amrn", ajgj(int ), (int)229));
lbl147:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -2038469748: {
                            v31 = ef.ajfd("amro", ajgj(int ), (int)230);
                            continue block66;
                        }
                        case -1872270231: {
                            break block66;
                        }
                        case 1604959825: {
                            v31 = ef.ajfd("amrp", ajgj(int ), (int)231);
                            continue block66;
                        }
                    }
                    break;
                }
                ki.rect(var0, var7_10, var8_11, (float)var9_12, (float)v22, v26, v28, (boolean)v29);
                if (var10_8) ** GOTO lbl37
lbl158:
                // 2 sources

                if (!var10_8 && !var10_8) ** break;
                ** continue;
                return;
            }
lbl161:
            // 4 sources

            case 0: {
                var11_7 /* !! */  = (int)ef.ajfd("amrq", ajfa(int ), (int)963);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl166:
            // 2 sources

            case 1: {
                var11_7 /* !! */  = (int)ef.ajfd("amrr", ajfa(int ), (int)964);
                if (!var12_6) break;
                throw null;
            }
lbl170:
            // 2 sources

            case 2: {
                var11_7 /* !! */  = (int)ef.ajfd("amrs", ajfa(int ), (int)965);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 3: {
                var11_7 /* !! */  = (int)ef.ajfd("amrt", ajfa(int ), (int)966);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl180:
            // 3 sources

            case 4: {
                var11_7 /* !! */  = (int)ef.ajfd("amru", ajfa(int ), (int)967);
                if (!var12_6) break;
                throw null;
            }
lbl184:
            // 2 sources

            case 5: {
                var11_7 /* !! */  = (int)ef.ajfd("amrv", ajfa(int ), (int)968);
                if (!var12_6) ** GOTO lbl161
                throw null;
            }
lbl188:
            // 2 sources

            case 6: {
                var11_7 /* !! */  = (int)ef.ajfd("amrw", ajfa(int ), (int)969);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 7: {
                var11_7 /* !! */  = (int)ef.ajfd("amrx", ajfa(int ), (int)970);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl198:
            // 2 sources

            case 8: {
                var11_7 /* !! */  = (int)ef.ajfd("amry", ajfa(int ), (int)971);
                if (!var12_6) ** GOTO lbl184
                throw null;
            }
lbl202:
            // 3 sources

            case 9: {
                var11_7 /* !! */  = (int)ef.ajfd("amrz", ajfa(int ), (int)972);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 10: {
                var11_7 /* !! */  = (int)ef.ajfd("amsa", ajfa(int ), (int)973);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 11: {
                var11_7 /* !! */  = (int)ef.ajfd("amsb", ajfa(int ), (int)974);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 12: {
                var11_7 /* !! */  = (int)ef.ajfd("amsc", ajfa(int ), (int)975);
                if (!var12_6) ** GOTO lbl166
                throw null;
            }
            case 13: {
                var11_7 /* !! */  = (int)ef.ajfd("amsd", ajfa(int ), (int)976);
                if (var12_6) {
                    throw null;
                }
            }
lbl225:
            // 4 sources

            case 14: {
                var11_7 /* !! */  = (int)ef.ajfd("amse", ajfa(int ), (int)977);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl230:
            // 2 sources

            case 15: {
                var11_7 /* !! */  = (int)ef.ajfd("amsf", ajfa(int ), (int)978);
                if (!var12_6) ** GOTO lbl202
                throw null;
            }
            case 16: {
                var11_7 /* !! */  = (int)ef.ajfd("amsg", ajfa(int ), (int)979);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 17: {
                var11_7 /* !! */  = (int)ef.ajfd("amsh", ajfa(int ), (int)980);
                if (!var12_6) ** GOTO lbl161
                throw null;
            }
            case 18: {
                var11_7 /* !! */  = (int)ef.ajfd("amsi", ajfa(int ), (int)981);
                if (!var12_6) ** GOTO lbl188
                throw null;
            }
lbl247:
            // 3 sources

            case 19: {
                var11_7 /* !! */  = (int)ef.ajfd("amsj", ajfa(int ), (int)982);
                if (!var12_6) ** GOTO lbl202
                throw null;
            }
            case 20: {
                var11_7 /* !! */  = (int)ef.ajfd("amsk", ajfa(int ), (int)983);
                if (!var12_6) ** GOTO lbl161
                throw null;
            }
lbl255:
            // 4 sources

            case 21: {
                var11_7 /* !! */  = (int)ef.ajfd("amsl", ajfa(int ), (int)984);
                if (!var12_6) ** GOTO lbl170
                throw null;
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_7 /* !! */  = (int)ef.ajfd("amsm", ajfa(int ), (int)985);
                    if (!var12_6) ** GOTO lbl198
                    throw null;
                }
            }
            case 23: {
                var11_7 /* !! */  = (int)ef.ajfd("amsn", ajfa(int ), (int)986);
                if (!var12_6) break;
                throw null;
            }
lbl268:
            // 2 sources

            case 24: {
                var11_7 /* !! */  = (int)ef.ajfd("amso", ajfa(int ), (int)987);
                if (!var12_6) break;
                throw null;
            }
            case 25: 
        }
        var11_7 /* !! */  = (int)ef.ajfd("amsp", ajfa(int ), (int)988);
        ** while (!var12_6)
lbl275:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1309 currentTarget() {
        v0 /* !! */  = ef.ca;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - ef.ajfd("alyc", ajgj(int ), (int)99));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1872270231: {
                    break block36;
                }
                case -1128260211: {
                    v1 = ef.ajfd("alyd", ajgj(int ), (int)100);
                    continue block36;
                }
                case -615522431: {
                    v1 = ef.ajfd("alye", ajgj(int ), (int)101);
                    continue block36;
                }
            }
            break;
        }
        var5_1 = ef.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("alyf", ajgj(int ), (int)102)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ef.ajfd("alyh", ajfa(int ), (int)721)) break;
            v2 /* !! */  = (long)ef.ajfd("alyj", ajfa(int ), (int)722);
        }
        var4_2 /* !! */  = ef.b;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ef.ca;
                if (true) ** GOTO lbl29
                block38: while (true) {
                    v3 /* !! */  = (long)(v4 - ef.ajfd("alyl", ajgj(int ), (int)103));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1872270231: {
                            break block38;
                        }
                        case -891607349: {
                            v4 = ef.ajfd("alyo", ajgj(int ), (int)104);
                            continue block38;
                        }
                        case -418566407: {
                            v4 = ef.ajfd("alyq", ajgj(int ), (int)105);
                            continue block38;
                        }
                    }
                    break;
                }
                var3_3 = ef.a;
                if (var5_1) {
                    throw null;
lbl41:
                    // 10 sources

                    return null;
                }
                if (var3_3 || var3_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("alyr", ajgj(int ), (int)106)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ef.ajfd("alys", ajfa(int ), (int)723)) break;
                    v5 /* !! */  = (long)ef.ajfd("alyt", ajfa(int ), (int)724);
                }
                var1_4 = hn.getInstance();
                if (var3_3 || var3_3) ** GOTO lbl41
                if (var1_4 == null) ** GOTO lbl69
                if (var3_3) ** GOTO lbl41
                v6 /* !! */  = ef.ca;
                if (true) ** GOTO lbl58
                block41: while (true) {
                    v6 /* !! */  = (long)(v7 - ef.ajfd("alyu", ajgj(int ), (int)107));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1872270231: {
                            break block41;
                        }
                        case -1723089956: {
                            v7 = ef.ajfd("alyv", ajgj(int ), (int)108);
                            continue block41;
                        }
                        case 1055469932: {
                            v7 = ef.ajfd("alyw", ajgj(int ), (int)109);
                            continue block41;
                        }
                    }
                    break;
                }
                if (var1_4.isState()) ** GOTO lbl71
                if (var3_3) ** GOTO lbl41
lbl69:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl41
                return null;
lbl71:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl41
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("alyx", ajgj(int ), (int)110)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ef.ajfd("alyy", ajfa(int ), (int)725)) break;
                    v8 /* !! */  = (long)ef.ajfd("alyz", ajfa(int ), (int)726);
                }
                var2_5 = var1_4.getTarget();
                if (var3_3 || var3_3) ** GOTO lbl41
                if (var2_5 == null) ** GOTO lbl94
                if (var3_3) ** GOTO lbl41
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("alza", ajgj(int ), (int)111)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ef.ajfd("alzb", ajfa(int ), (int)727)) break;
                    v9 /* !! */  = (long)ef.ajfd("alzc", ajfa(int ), (int)728);
                }
                if (!var2_5.method_5805()) ** GOTO lbl94
                if (var3_3) ** GOTO lbl41
                v10 = var2_5;
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl97
lbl94:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v10 = null;
lbl97:
                // 2 sources

                return v10;
            }
            case 0: {
                var4_2 /* !! */  = (int)ef.ajfd("alzh", ajfa(int ), (int)729);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: {
                var4_2 /* !! */  = (int)ef.ajfd("alzi", ajfa(int ), (int)730);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 2: {
                var4_2 /* !! */  = (int)ef.ajfd("alzj", ajfa(int ), (int)731);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl113:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)ef.ajfd("alzl", ajfa(int ), (int)732);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl118:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ef.ajfd("alzp", ajfa(int ), (int)733);
                if (var5_1) {
                    throw null;
                }
            }
            case 5: {
                var4_2 /* !! */  = (int)ef.ajfd("alzq", ajfa(int ), (int)734);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 6: {
                var4_2 /* !! */  = (int)ef.ajfd("alzs", ajfa(int ), (int)735);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 7: {
                var4_2 /* !! */  = (int)ef.ajfd("alzu", ajfa(int ), (int)736);
                if (!var5_1) break;
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)ef.ajfd("alzx", ajfa(int ), (int)737);
                if (!var5_1) ** GOTO lbl118
                throw null;
            }
lbl140:
            // 4 sources

            case 9: {
                var4_2 /* !! */  = (int)ef.ajfd("amaa", ajfa(int ), (int)738);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 10: {
                var4_2 /* !! */  = (int)ef.ajfd("amac", ajfa(int ), (int)739);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl150:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)ef.ajfd("amae", ajfa(int ), (int)740);
                if (var5_1) {
                    throw null;
                }
            }
            case 12: {
                var4_2 /* !! */  = (int)ef.ajfd("amag", ajfa(int ), (int)741);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 13: {
                var4_2 /* !! */  = (int)ef.ajfd("amaj", ajfa(int ), (int)742);
                if (!var5_1) ** GOTO lbl113
                throw null;
            }
lbl163:
            // 3 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ef.ajfd("amal", ajfa(int ), (int)743);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                    break;
                }
            }
lbl169:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)ef.ajfd("amao", ajfa(int ), (int)744);
                if (var5_1) {
                    throw null;
                }
            }
lbl173:
            // 4 sources

            case 16: {
                var4_2 /* !! */  = (int)ef.ajfd("amap", ajfa(int ), (int)745);
                if (!var5_1) ** GOTO lbl140
                throw null;
            }
lbl177:
            // 4 sources

            case 17: {
                var4_2 /* !! */  = (int)ef.ajfd("amaq", ajfa(int ), (int)746);
                if (!var5_1) ** GOTO lbl150
                throw null;
            }
            case 18: 
        }
        var4_2 /* !! */  = (int)ef.ajfd("amau", ajfa(int ), (int)747);
        ** while (!var5_1)
lbl184:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void anfe() {
        ef.ajfb[700] = -613329340;
        ef.ajfb[701] = 272191571;
        ef.ajfb[702] = -829743449;
        ef.ajfb[703] = 1014532957;
        ef.ajfb[704] = -1889256236;
        ef.ajfb[705] = 484465868;
        ef.ajfb[706] = -1278575360;
        ef.ajfb[707] = 105294862;
        ef.ajfb[708] = -970751620;
        ef.ajfb[709] = 17413115;
        ef.ajfb[710] = -240503417;
        ef.ajfb[711] = 2042322067;
        ef.ajfb[712] = 290109107;
        ef.ajfb[713] = -470599271;
        ef.ajfb[714] = -1119300367;
        ef.ajfb[715] = 1494555105;
        ef.ajfb[716] = -24242382;
        ef.ajfb[717] = 923294552;
        ef.ajfb[718] = 805342329;
        ef.ajfb[719] = -431183275;
        ef.ajfb[720] = -1713147602;
        ef.ajfb[721] = -1265541248;
        ef.ajfb[722] = -1147319207;
        ef.ajfb[723] = 882083321;
        ef.ajfb[724] = -339107156;
        ef.ajfb[725] = 1314356149;
        ef.ajfb[726] = 1953770783;
        ef.ajfb[727] = -107784739;
        ef.ajfb[728] = -1925158273;
        ef.ajfb[729] = 263424316;
        ef.ajfb[730] = 1429429011;
        ef.ajfb[731] = -910904419;
        ef.ajfb[732] = 913213926;
        ef.ajfb[733] = -109588786;
        ef.ajfb[734] = 1375125823;
        ef.ajfb[735] = -2050846370;
        ef.ajfb[736] = 124462726;
        ef.ajfb[737] = 1784942869;
        ef.ajfb[738] = -1479433224;
        ef.ajfb[739] = -1177196116;
        ef.ajfb[740] = -368626369;
        ef.ajfb[741] = 1126765761;
        ef.ajfb[742] = -1217653073;
        ef.ajfb[743] = -2146226012;
        ef.ajfb[744] = -1353277773;
        ef.ajfb[745] = 2053286400;
        ef.ajfb[746] = -1828375526;
        ef.ajfb[747] = -1770582190;
        ef.ajfb[748] = 2067852670;
        ef.ajfb[749] = -1407185684;
        ef.ajfb[750] = -575047194;
        ef.ajfb[751] = -1008667292;
        ef.ajfb[752] = -1554315549;
        ef.ajfb[753] = -819497410;
        ef.ajfb[754] = 548068597;
        ef.ajfb[755] = -57001145;
        ef.ajfb[756] = 1116207670;
        ef.ajfb[757] = 1557868420;
        ef.ajfb[758] = -2011476392;
        ef.ajfb[759] = 212051763;
        ef.ajfb[760] = 2015498525;
        ef.ajfb[761] = -1213203964;
        ef.ajfb[762] = -2035483985;
        ef.ajfb[763] = 1584252775;
        ef.ajfb[764] = -675946136;
        ef.ajfb[765] = -526225426;
        ef.ajfb[766] = -518052887;
        ef.ajfb[767] = -2014927236;
        ef.ajfb[768] = 1212009247;
        ef.ajfb[769] = 1788226065;
        ef.ajfb[770] = 632977984;
        ef.ajfb[771] = 888530569;
        ef.ajfb[772] = 537261875;
        ef.ajfb[773] = -122332200;
        ef.ajfb[774] = 553668361;
        ef.ajfb[775] = -1538264122;
        ef.ajfb[776] = 965975741;
        ef.ajfb[777] = -427787988;
        ef.ajfb[778] = -902868073;
        ef.ajfb[779] = -334014285;
        ef.ajfb[780] = -742933046;
        ef.ajfb[781] = -1649650182;
        ef.ajfb[782] = 166037815;
        ef.ajfb[783] = -1889932817;
        ef.ajfb[784] = -1604427873;
        ef.ajfb[785] = -53554707;
        ef.ajfb[786] = 29865907;
        ef.ajfb[787] = -746137047;
        ef.ajfb[788] = 59470575;
        ef.ajfb[789] = -817594447;
        ef.ajfb[790] = 1862597425;
        ef.ajfb[791] = 1786692457;
        ef.ajfb[792] = -52161292;
        ef.ajfb[793] = -508876556;
        ef.ajfb[794] = 510157461;
        ef.ajfb[795] = 929777349;
        ef.ajfb[796] = 1732619795;
        ef.ajfb[797] = -1260402114;
        ef.ajfb[798] = -1872977414;
        ef.ajfb[799] = 1129878300;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawHeadParticles(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var16_6 = ef.c;
        var15_7 /* !! */  = ef.b;
        var14_8 = ef.a;
        if (var16_6) {
            throw null;
lbl6:
            // 23 sources

            return;
        }
        if (var14_8 || var14_8) ** GOTO lbl6
        var6_9 = this.headParticles.size() - ef.ajfd("akjd", ajfa(int ), (int)487);
        if (var14_8) ** GOTO lbl6
        block47: while (true) {
            block88: {
                if (var14_8 || var14_8) ** GOTO lbl6
                if (var6_9 < 0) ** GOTO lbl58
                if (var14_8 || var14_8) ** GOTO lbl6
                var7_10 = this.headParticles.get(var6_9);
                if (var14_8 || var14_8) ** GOTO lbl6
                var7_10.age += var5_5;
                if (var14_8 || var14_8) ** GOTO lbl6
                if (!(var7_10.age >= var7_10.lifetime)) break block88;
                if (var14_8 || var14_8) ** GOTO lbl6
                this.headParticles.remove(var6_9);
                if (var14_8 || var14_8) ** GOTO lbl6
                if (var16_6) {
                    throw null;
                }
                ** GOTO lbl53
            }
            if (var14_8 || var14_8) ** GOTO lbl6
            var8_11 = Math.min(1.0f, var5_5 * ef.ajfd("akje", ajfn(int ), (int)488));
            if (var14_8 || var14_8) ** GOTO lbl6
            var7_10.x += (var7_10.endX - var7_10.x) * var8_11;
            if (var14_8) ** GOTO lbl6
            if (var15_7 /* !! */  == 0) ** GOTO lbl-1000
            switch (var15_7 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var14_8) ** GOTO lbl6
                    var7_10.y += (var7_10.endY - var7_10.y) * var8_11;
                    if (var14_8 || var14_8) ** GOTO lbl6
                    var7_10.alpha += (1.0f - var7_10.alpha) * Math.min(1.0f, var5_5 * ef.ajfd("akjf", ajfn(int ), (int)489));
                    if (var14_8 || var14_8) ** GOTO lbl6
                    var9_12 = var7_10.age / var7_10.lifetime;
                    if (var14_8 || var14_8) ** GOTO lbl6
                    var10_13 = var7_10.alpha * (1.0f - var9_12) * var4_4;
                    if (var14_8 || var14_8) ** GOTO lbl6
                    var11_14 = var2_2 + var7_10.x;
                    if (var14_8 || var14_8) ** GOTO lbl6
                    var12_15 = var3_3 + var7_10.y;
                    if (var14_8 || var14_8) ** GOTO lbl6
                    var13_16 = nd.multAlpha(dz.color((int)ef.ajfd("akjg", ajfa(int ), (int)490)), var10_13);
                    if (var14_8 || var14_8) ** GOTO lbl6
                    ki.rect(var1_1, var11_14 - ef.ajfd("akjh", ajfn(int ), (int)491), var12_15 - ef.ajfd("akji", ajfn(int ), (int)492), (float)ef.ajfd("akjj", ajfn(int ), (int)493), (float)ef.ajfd("akjk", ajfn(int ), (int)494), (float)ef.ajfd("akjl", ajfn(int ), (int)495), var13_16, (boolean)ef.ajfd("akjm", ajfa(int ), (int)496));
                    if (var14_8) ** GOTO lbl6
lbl53:
                    // 2 sources

                    if (var14_8 || var14_8) ** GOTO lbl6
                    --var6_9;
                    if (var14_8) ** GOTO lbl6
                    if (!var16_6) continue block47;
                    throw null;
                }
lbl58:
                // 1 sources

                if (!var14_8 && !var14_8) ** break;
                ** continue;
                return;
                case 0: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjn", ajfa(int ), (int)497);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl231
                }
lbl66:
                // 2 sources

                case 1: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjo", ajfa(int ), (int)498);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl134
                }
                case 2: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjp", ajfa(int ), (int)499);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl134
                }
lbl76:
                // 2 sources

                case 3: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjq", ajfa(int ), (int)500);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
lbl81:
                // 4 sources

                case 4: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjr", ajfa(int ), (int)501);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 5: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjs", ajfa(int ), (int)502);
                    if (!var16_6) ** GOTO lbl81
                    throw null;
                }
lbl90:
                // 3 sources

                case 6: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var15_7 /* !! */  = (int)ef.ajfd("akjt", ajfa(int ), (int)503);
                        if (var16_6) {
                            throw null;
                        }
                        ** GOTO lbl163
                        break;
                    }
                }
                case 7: {
                    var15_7 /* !! */  = (int)ef.ajfd("akju", ajfa(int ), (int)504);
                    if (!var16_6) break block47;
                    throw null;
                }
                case 8: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjv", ajfa(int ), (int)505);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl192
                }
                case 9: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjw", ajfa(int ), (int)506);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl223
                }
lbl110:
                // 2 sources

                case 10: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjx", ajfa(int ), (int)507);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
                case 11: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjy", ajfa(int ), (int)508);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl120:
                // 2 sources

                case 12: {
                    var15_7 /* !! */  = (int)ef.ajfd("akjz", ajfa(int ), (int)509);
                    if (!var16_6) ** GOTO lbl66
                    throw null;
                }
lbl124:
                // 2 sources

                case 13: {
                    var15_7 /* !! */  = (int)ef.ajfd("akka", ajfa(int ), (int)510);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
lbl129:
                // 2 sources

                case 14: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkb", ajfa(int ), (int)511);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
lbl134:
                // 5 sources

                case 15: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkc", ajfa(int ), (int)512);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
                case 16: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkd", ajfa(int ), (int)513);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 17: {
                    var15_7 /* !! */  = (int)ef.ajfd("akke", ajfa(int ), (int)514);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
lbl149:
                // 3 sources

                case 18: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkf", ajfa(int ), (int)515);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
                case 19: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkg", ajfa(int ), (int)516);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl219
                }
lbl159:
                // 2 sources

                case 20: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkh", ajfa(int ), (int)517);
                    if (!var16_6) ** GOTO lbl81
                    throw null;
                }
lbl163:
                // 2 sources

                case 21: {
                    var15_7 /* !! */  = (int)ef.ajfd("akki", ajfa(int ), (int)518);
                    if (!var16_6) ** GOTO lbl120
                    throw null;
                }
lbl167:
                // 2 sources

                case 22: {
                    do {
                        var15_7 /* !! */  = (int)ef.ajfd("akkj", ajfa(int ), (int)519);
                    } while (!var16_6);
                    throw null;
                }
lbl172:
                // 2 sources

                case 23: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkk", ajfa(int ), (int)520);
                    if (!var16_6) ** GOTO lbl149
                    throw null;
                }
lbl176:
                // 3 sources

                case 24: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkl", ajfa(int ), (int)521);
                    if (!var16_6) ** GOTO lbl90
                    throw null;
                }
lbl180:
                // 2 sources

                case 25: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkm", ajfa(int ), (int)522);
                    if (!var16_6) ** GOTO lbl167
                    throw null;
                }
lbl184:
                // 2 sources

                case 26: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkn", ajfa(int ), (int)523);
                    if (!var16_6) ** GOTO lbl159
                    throw null;
                }
lbl188:
                // 2 sources

                case 27: {
                    var15_7 /* !! */  = (int)ef.ajfd("akko", ajfa(int ), (int)524);
                    if (!var16_6) ** GOTO lbl124
                    throw null;
                }
lbl192:
                // 4 sources

                case 28: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkp", ajfa(int ), (int)525);
                    if (!var16_6) ** GOTO lbl134
                    throw null;
                }
lbl196:
                // 2 sources

                case 29: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkq", ajfa(int ), (int)526);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl223
                }
                case 30: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkr", ajfa(int ), (int)527);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
                case 31: {
                    var15_7 /* !! */  = (int)ef.ajfd("akks", ajfa(int ), (int)528);
                    if (!var16_6) ** GOTO lbl110
                    throw null;
                }
                case 32: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkt", ajfa(int ), (int)529);
                    if (!var16_6) ** GOTO lbl192
                    throw null;
                }
                case 33: {
                    var15_7 /* !! */  = (int)ef.ajfd("akku", ajfa(int ), (int)530);
                    if (var16_6) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
lbl219:
                // 2 sources

                case 34: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkv", ajfa(int ), (int)531);
                    if (!var16_6) ** GOTO lbl134
                    throw null;
                }
lbl223:
                // 4 sources

                case 35: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkw", ajfa(int ), (int)532);
                    if (!var16_6) ** GOTO lbl76
                    throw null;
                }
lbl227:
                // 3 sources

                case 36: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkx", ajfa(int ), (int)533);
                    if (!var16_6) ** GOTO lbl129
                    throw null;
                }
lbl231:
                // 2 sources

                case 37: {
                    var15_7 /* !! */  = (int)ef.ajfd("akky", ajfa(int ), (int)534);
                    if (!var16_6) ** GOTO lbl192
                    throw null;
                }
                case 38: {
                    var15_7 /* !! */  = (int)ef.ajfd("akkz", ajfa(int ), (int)535);
                    if (!var16_6) ** GOTO lbl184
                    throw null;
                }
lbl239:
                // 3 sources

                case 39: {
                    var15_7 /* !! */  = (int)ef.ajfd("akla", ajfa(int ), (int)536);
                    if (!var16_6) ** GOTO lbl176
                    throw null;
                }
lbl243:
                // 2 sources

                case 40: {
                    var15_7 /* !! */  = (int)ef.ajfd("aklb", ajfa(int ), (int)537);
                    if (!var16_6) ** GOTO lbl223
                    throw null;
                }
lbl247:
                // 2 sources

                case 41: {
                    var15_7 /* !! */  = (int)ef.ajfd("aklc", ajfa(int ), (int)538);
                    if (!var16_6) ** GOTO lbl90
                    throw null;
                }
                case 42: {
                    var15_7 /* !! */  = (int)ef.ajfd("akld", ajfa(int ), (int)539);
                    if (!var16_6) ** GOTO lbl81
                    throw null;
                }
                case 43: 
            }
            break;
        }
        var15_7 /* !! */  = (int)ef.ajfd("akle", ajfa(int ), (int)540);
        ** while (!var16_6)
lbl258:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void anqp() {
        ef.ajfc[1000] = -469320031;
        ef.ajfc[1001] = -403641218;
        ef.ajfc[1002] = -320347741;
        ef.ajfc[1003] = -1803544310;
        ef.ajfc[1004] = 2093758802;
        ef.ajfc[1005] = 1619884994;
        ef.ajfc[1006] = -1511466853;
        ef.ajfc[1007] = -1946309153;
        ef.ajfc[1008] = 1153482541;
        ef.ajfc[1009] = 267776238;
        ef.ajfc[1010] = -1960397279;
        ef.ajfc[1011] = -1783145164;
        ef.ajfc[1012] = 965351444;
        ef.ajfc[1013] = 69256559;
        ef.ajfc[1014] = -2137345131;
        ef.ajfc[1015] = -2077837642;
        ef.ajfc[1016] = -1212894241;
        ef.ajfc[1017] = -600432068;
        ef.ajfc[1018] = 519478815;
        ef.ajfc[1019] = 1448716291;
        ef.ajfc[1020] = 1934016925;
        ef.ajfc[1021] = 660350143;
        ef.ajfc[1022] = -479468679;
        ef.ajfc[1023] = 441180798;
        ef.ajfc[1024] = -524483876;
        ef.ajfc[1025] = -119805239;
        ef.ajfc[1026] = 689889490;
        ef.ajfc[1027] = -134813242;
        ef.ajfc[1028] = 256228341;
        ef.ajfc[1029] = 1499404361;
        ef.ajfc[1030] = -1958753188;
        ef.ajfc[1031] = -500062400;
        ef.ajfc[1032] = 1003422132;
        ef.ajfc[1033] = -634344892;
        ef.ajfc[1034] = 1831577115;
        ef.ajfc[1035] = 1613998920;
        ef.ajfc[1036] = 1983508320;
        ef.ajfc[1037] = 648917366;
        ef.ajfc[1038] = 1235580650;
        ef.ajfc[1039] = -1292643959;
        ef.ajfc[1040] = 824781613;
        ef.ajfc[1041] = -324543503;
        ef.ajfc[1042] = -354004607;
        ef.ajfc[1043] = 135747775;
        ef.ajfc[1044] = -198755843;
        ef.ajfc[1045] = 589378212;
        ef.ajfc[1046] = -110569552;
        ef.ajfc[1047] = 1166047520;
        ef.ajfc[1048] = 157214557;
        ef.ajfc[1049] = -785662073;
        ef.ajfc[1050] = -934283410;
        ef.ajfc[1051] = -311661867;
        ef.ajfc[1052] = 724076147;
        ef.ajfc[1053] = 1726214490;
        ef.ajfc[1054] = 1769961291;
        ef.ajfc[1055] = 1148951741;
        ef.ajfc[1056] = 2085590261;
        ef.ajfc[1057] = 8087085;
        ef.ajfc[1058] = -755993070;
        ef.ajfc[1059] = 1854930358;
        ef.ajfc[1060] = 1579888799;
        ef.ajfc[1061] = -1132902126;
        ef.ajfc[1062] = -432469902;
        ef.ajfc[1063] = 106722163;
        ef.ajfc[1064] = 1088825211;
        ef.ajfc[1065] = -901033250;
        ef.ajfc[1066] = 1106684336;
        ef.ajfc[1067] = -1831853398;
        ef.ajfc[1068] = 857657662;
        ef.ajfc[1069] = -557469592;
        ef.ajfc[1070] = 1336903626;
        ef.ajfc[1071] = -1654271918;
        ef.ajfc[1072] = -1374496067;
        ef.ajfc[1073] = 517585023;
        ef.ajfc[1074] = -1449123398;
        ef.ajfc[1075] = 453295099;
        ef.ajfc[1076] = 30047300;
        ef.ajfc[1077] = 788668322;
        ef.ajfc[1078] = 290559188;
        ef.ajfc[1079] = 780171618;
        ef.ajfc[1080] = 2056567745;
        ef.ajfc[1081] = 2081628857;
        ef.ajfc[1082] = -82484844;
        ef.ajfc[1083] = -34953503;
        ef.ajfc[1084] = 1525987491;
        ef.ajfc[1085] = -127230563;
        ef.ajfc[1086] = -1887654084;
        ef.ajfc[1087] = -1008161093;
        ef.ajfc[1088] = -1970720058;
        ef.ajfc[1089] = -586029766;
        ef.ajfc[1090] = -1311045138;
        ef.ajfc[1091] = -1116425674;
        ef.ajfc[1092] = 837605002;
        ef.ajfc[1093] = 1364296135;
        ef.ajfc[1094] = -1193165116;
        ef.ajfc[1095] = 1385716205;
        ef.ajfc[1096] = -1773348076;
        ef.ajfc[1097] = 622968856;
        ef.ajfc[1098] = -1411615729;
        ef.ajfc[1099] = -8375066;
    }

    private static /* synthetic */ void anmr() {
        ef.ajfc[500] = -165110852;
        ef.ajfc[501] = 1061404405;
        ef.ajfc[502] = 1595618480;
        ef.ajfc[503] = -1961907140;
        ef.ajfc[504] = 859061231;
        ef.ajfc[505] = 503975266;
        ef.ajfc[506] = -968491627;
        ef.ajfc[507] = 2005569788;
        ef.ajfc[508] = -938231331;
        ef.ajfc[509] = -1941455349;
        ef.ajfc[510] = -255879293;
        ef.ajfc[511] = -1208564832;
        ef.ajfc[512] = -1124682649;
        ef.ajfc[513] = 1801438091;
        ef.ajfc[514] = -1146717149;
        ef.ajfc[515] = -1629001046;
        ef.ajfc[516] = -1743054718;
        ef.ajfc[517] = -316833632;
        ef.ajfc[518] = -878971414;
        ef.ajfc[519] = -1830886929;
        ef.ajfc[520] = 585532989;
        ef.ajfc[521] = -403283240;
        ef.ajfc[522] = 329299648;
        ef.ajfc[523] = -1061013913;
        ef.ajfc[524] = 633504258;
        ef.ajfc[525] = 180221068;
        ef.ajfc[526] = -976112414;
        ef.ajfc[527] = -1528296636;
        ef.ajfc[528] = -1414269413;
        ef.ajfc[529] = -1607165427;
        ef.ajfc[530] = 1494970888;
        ef.ajfc[531] = 1468546117;
        ef.ajfc[532] = 1462421624;
        ef.ajfc[533] = 883453469;
        ef.ajfc[534] = 1740116169;
        ef.ajfc[535] = -2961077;
        ef.ajfc[536] = -435255122;
        ef.ajfc[537] = 392360353;
        ef.ajfc[538] = 1756290110;
        ef.ajfc[539] = -1505093844;
        ef.ajfc[540] = 1876523587;
        ef.ajfc[541] = -2045410669;
        ef.ajfc[542] = -523098650;
        ef.ajfc[543] = 1818554822;
        ef.ajfc[544] = -303857880;
        ef.ajfc[545] = -1390293443;
        ef.ajfc[546] = -131949111;
        ef.ajfc[547] = -499401897;
        ef.ajfc[548] = -1072519546;
        ef.ajfc[549] = 1538962083;
        ef.ajfc[550] = 625838303;
        ef.ajfc[551] = 1280525580;
        ef.ajfc[552] = -1489017923;
        ef.ajfc[553] = -642956480;
        ef.ajfc[554] = 1013807537;
        ef.ajfc[555] = -2134979369;
        ef.ajfc[556] = -420040280;
        ef.ajfc[557] = 761849077;
        ef.ajfc[558] = -427069632;
        ef.ajfc[559] = -49611643;
        ef.ajfc[560] = 975480358;
        ef.ajfc[561] = -19352258;
        ef.ajfc[562] = -958890458;
        ef.ajfc[563] = -1292810737;
        ef.ajfc[564] = 366361046;
        ef.ajfc[565] = 1041215654;
        ef.ajfc[566] = 662071291;
        ef.ajfc[567] = 435433775;
        ef.ajfc[568] = 1927890977;
        ef.ajfc[569] = -1628681092;
        ef.ajfc[570] = 1680327929;
        ef.ajfc[571] = 2096786998;
        ef.ajfc[572] = 1601047420;
        ef.ajfc[573] = -1678805049;
        ef.ajfc[574] = -1012489245;
        ef.ajfc[575] = 1980219932;
        ef.ajfc[576] = -890398226;
        ef.ajfc[577] = 97400694;
        ef.ajfc[578] = -2098543583;
        ef.ajfc[579] = -1534058536;
        ef.ajfc[580] = 33367504;
        ef.ajfc[581] = -1710992933;
        ef.ajfc[582] = 1586941487;
        ef.ajfc[583] = 97682162;
        ef.ajfc[584] = -977402157;
        ef.ajfc[585] = -735986342;
        ef.ajfc[586] = 1750478392;
        ef.ajfc[587] = -412197035;
        ef.ajfc[588] = -949563577;
        ef.ajfc[589] = 1123272285;
        ef.ajfc[590] = -697600770;
        ef.ajfc[591] = 1010809449;
        ef.ajfc[592] = -17698406;
        ef.ajfc[593] = 1732649098;
        ef.ajfc[594] = 1162437372;
        ef.ajfc[595] = -2017771167;
        ef.ajfc[596] = 181582366;
        ef.ajfc[597] = 1158108984;
        ef.ajfc[598] = -2079391283;
        ef.ajfc[599] = -1916473135;
    }

    private static /* synthetic */ void anrv() {
        ef.ajfh[100] = 1546908960259867370L;
        ef.ajfh[101] = 4431817794292623998L;
        ef.ajfh[102] = 4558422236148823506L;
        ef.ajfh[103] = -8416330965238626833L;
        ef.ajfh[104] = -2485801459933057358L;
        ef.ajfh[105] = -4063014965129192724L;
        ef.ajfh[106] = -5608267767180794675L;
        ef.ajfh[107] = 3009804565104794290L;
        ef.ajfh[108] = 8937716082929022681L;
        ef.ajfh[109] = -5689896157202638795L;
        ef.ajfh[110] = 3057531212655427703L;
        ef.ajfh[111] = 8035254701419270466L;
        ef.ajfh[112] = -3200833277787037689L;
        ef.ajfh[113] = -1581716861499010639L;
        ef.ajfh[114] = -8006510266334146088L;
        ef.ajfh[115] = -1509509002935312918L;
        ef.ajfh[116] = 2045838210862732249L;
        ef.ajfh[117] = -5265427280414591248L;
        ef.ajfh[118] = -2698116447117205496L;
        ef.ajfh[119] = -7767877578363166991L;
        ef.ajfh[120] = -9068922992517829270L;
        ef.ajfh[121] = 8556136968227796196L;
        ef.ajfh[122] = -5370633201208331125L;
        ef.ajfh[123] = 9181248837724467778L;
        ef.ajfh[124] = -4284877953406427012L;
        ef.ajfh[125] = -3811379662279727390L;
        ef.ajfh[126] = -7812948775201052536L;
        ef.ajfh[127] = 4494356345030703310L;
        ef.ajfh[128] = 8088926792601746377L;
        ef.ajfh[129] = 6984918214367331357L;
        ef.ajfh[130] = -8283931982805246542L;
        ef.ajfh[131] = 8413689358526866002L;
        ef.ajfh[132] = -4962497850820123488L;
        ef.ajfh[133] = 141411585290484019L;
        ef.ajfh[134] = -3341463000117991166L;
        ef.ajfh[135] = -8029998404847753870L;
        ef.ajfh[136] = -4448391154371068552L;
        ef.ajfh[137] = -1685052644520433053L;
        ef.ajfh[138] = 4793263724974840773L;
        ef.ajfh[139] = -2709869918142160008L;
        ef.ajfh[140] = 5872274896276197503L;
        ef.ajfh[141] = -8580888947099219837L;
        ef.ajfh[142] = -7067777375250004772L;
        ef.ajfh[143] = -5888848446110898327L;
        ef.ajfh[144] = -8932380379848721388L;
        ef.ajfh[145] = 8416782968329827939L;
        ef.ajfh[146] = 8301930293113827235L;
        ef.ajfh[147] = 7231988824378098093L;
        ef.ajfh[148] = 3827115815720556715L;
        ef.ajfh[149] = -6445475415121730377L;
        ef.ajfh[150] = -3050456756250314870L;
        ef.ajfh[151] = -3837645227245197210L;
        ef.ajfh[152] = -7825791675914025698L;
        ef.ajfh[153] = 6758465439181187704L;
        ef.ajfh[154] = -9135675361161005725L;
        ef.ajfh[155] = 8407354114927232059L;
        ef.ajfh[156] = 4930779492213116018L;
        ef.ajfh[157] = 1588945430546521783L;
        ef.ajfh[158] = 7394382183856944806L;
        ef.ajfh[159] = -7372209491131520977L;
        ef.ajfh[160] = -2862161904715088840L;
        ef.ajfh[161] = -704033801098345477L;
        ef.ajfh[162] = -3705480719436571640L;
        ef.ajfh[163] = 4602164245730770L;
        ef.ajfh[164] = -6076455993578366790L;
        ef.ajfh[165] = -5404977685736686025L;
        ef.ajfh[166] = -3133973272425415451L;
        ef.ajfh[167] = 3539235751308173016L;
        ef.ajfh[168] = 1604574982274094670L;
        ef.ajfh[169] = -1796780203849566496L;
        ef.ajfh[170] = -6046743873862223676L;
        ef.ajfh[171] = -4472484477061091464L;
        ef.ajfh[172] = 4724523664828835792L;
        ef.ajfh[173] = -7974030037873207742L;
        ef.ajfh[174] = 3987373070836279966L;
        ef.ajfh[175] = 6199333516805568544L;
        ef.ajfh[176] = -3937519478023968641L;
        ef.ajfh[177] = -7723172216041473057L;
        ef.ajfh[178] = -2334544578350196746L;
        ef.ajfh[179] = 3477232815387404499L;
        ef.ajfh[180] = 4901185135031545936L;
        ef.ajfh[181] = 3660678277176851605L;
        ef.ajfh[182] = -8485913522951018359L;
        ef.ajfh[183] = 903203224337433637L;
        ef.ajfh[184] = -1226238392249093135L;
        ef.ajfh[185] = 8249233872015131086L;
        ef.ajfh[186] = -2292417809282820753L;
        ef.ajfh[187] = -4117833372256350266L;
        ef.ajfh[188] = -4110836997518136364L;
        ef.ajfh[189] = -8140275088074188320L;
        ef.ajfh[190] = -6544244695246725799L;
        ef.ajfh[191] = -8972500658841345594L;
        ef.ajfh[192] = 3207539025048933047L;
        ef.ajfh[193] = 7875394974677538208L;
        ef.ajfh[194] = -6818020008962616118L;
        ef.ajfh[195] = -2008384841184838900L;
        ef.ajfh[196] = -2099739789678391542L;
        ef.ajfh[197] = 4523629211232002741L;
        ef.ajfh[198] = 669252194977588354L;
        ef.ajfh[199] = 3278265524191451735L;
    }

    private static /* synthetic */ void anda() {
        ef.ajfb[300] = -1239453221;
        ef.ajfb[301] = -1442139023;
        ef.ajfb[302] = 145767741;
        ef.ajfb[303] = 1454780414;
        ef.ajfb[304] = 1781636571;
        ef.ajfb[305] = 959229487;
        ef.ajfb[306] = 551903038;
        ef.ajfb[307] = -1925950430;
        ef.ajfb[308] = -1190492333;
        ef.ajfb[309] = 1884094377;
        ef.ajfb[310] = 722152886;
        ef.ajfb[311] = 980157739;
        ef.ajfb[312] = 1771773291;
        ef.ajfb[313] = 1343825963;
        ef.ajfb[314] = 2058916129;
        ef.ajfb[315] = -545880570;
        ef.ajfb[316] = 756878672;
        ef.ajfb[317] = 506696002;
        ef.ajfb[318] = -1881592539;
        ef.ajfb[319] = 1781778889;
        ef.ajfb[320] = 834416925;
        ef.ajfb[321] = 309476592;
        ef.ajfb[322] = -1777737349;
        ef.ajfb[323] = -1303346673;
        ef.ajfb[324] = 302037288;
        ef.ajfb[325] = 45442162;
        ef.ajfb[326] = -1909237265;
        ef.ajfb[327] = -1977646876;
        ef.ajfb[328] = -597340771;
        ef.ajfb[329] = -384170732;
        ef.ajfb[330] = -1307993846;
        ef.ajfb[331] = -1372756231;
        ef.ajfb[332] = 594851352;
        ef.ajfb[333] = -2078834393;
        ef.ajfb[334] = -1172203651;
        ef.ajfb[335] = -1118631616;
        ef.ajfb[336] = -1300315963;
        ef.ajfb[337] = 1565972030;
        ef.ajfb[338] = 649880907;
        ef.ajfb[339] = 1249644792;
        ef.ajfb[340] = -844336481;
        ef.ajfb[341] = -570093111;
        ef.ajfb[342] = -2089193994;
        ef.ajfb[343] = 2124198825;
        ef.ajfb[344] = 976734134;
        ef.ajfb[345] = 1430912706;
        ef.ajfb[346] = -1122517624;
        ef.ajfb[347] = 766154276;
        ef.ajfb[348] = -1660191478;
        ef.ajfb[349] = -1029226002;
        ef.ajfb[350] = 277379363;
        ef.ajfb[351] = -1843779248;
        ef.ajfb[352] = -1085033155;
        ef.ajfb[353] = 294866525;
        ef.ajfb[354] = 1242750029;
        ef.ajfb[355] = -2002577221;
        ef.ajfb[356] = -1311739965;
        ef.ajfb[357] = 820442152;
        ef.ajfb[358] = 208432584;
        ef.ajfb[359] = 1730388450;
        ef.ajfb[360] = -1790500247;
        ef.ajfb[361] = -152342051;
        ef.ajfb[362] = -1599190833;
        ef.ajfb[363] = -1096556525;
        ef.ajfb[364] = -2139034495;
        ef.ajfb[365] = 759317253;
        ef.ajfb[366] = 2067440362;
        ef.ajfb[367] = 787966411;
        ef.ajfb[368] = -686344869;
        ef.ajfb[369] = -37806388;
        ef.ajfb[370] = -1389105995;
        ef.ajfb[371] = 730647510;
        ef.ajfb[372] = -1339511983;
        ef.ajfb[373] = -1914710786;
        ef.ajfb[374] = 140064883;
        ef.ajfb[375] = 1105181409;
        ef.ajfb[376] = 892139090;
        ef.ajfb[377] = 420809244;
        ef.ajfb[378] = -768491077;
        ef.ajfb[379] = 1140592760;
        ef.ajfb[380] = 935171357;
        ef.ajfb[381] = -1245054337;
        ef.ajfb[382] = -1381251764;
        ef.ajfb[383] = 701292664;
        ef.ajfb[384] = 1972286184;
        ef.ajfb[385] = 88651971;
        ef.ajfb[386] = 1844511709;
        ef.ajfb[387] = -1680587477;
        ef.ajfb[388] = -197463751;
        ef.ajfb[389] = -293886263;
        ef.ajfb[390] = 74815136;
        ef.ajfb[391] = -828527236;
        ef.ajfb[392] = -1489931580;
        ef.ajfb[393] = -1578777459;
        ef.ajfb[394] = -793751674;
        ef.ajfb[395] = -1407204269;
        ef.ajfb[396] = 1655358293;
        ef.ajfb[397] = 1816159825;
        ef.ajfb[398] = -807634339;
        ef.ajfb[399] = -1067144732;
    }

    private static /* synthetic */ double ajfg(int n2) {
        return Double.longBitsToDouble(ajfh[n2] ^ ajfi[n2]);
    }

    private static /* synthetic */ void anlf() {
        ef.ajfc[300] = -1239453193;
        ef.ajfc[301] = -1442139077;
        ef.ajfc[302] = 145767780;
        ef.ajfc[303] = 1454780363;
        ef.ajfc[304] = 1781636599;
        ef.ajfc[305] = 959229542;
        ef.ajfc[306] = 551903064;
        ef.ajfc[307] = -1925950356;
        ef.ajfc[308] = -1190492350;
        ef.ajfc[309] = 1884094344;
        ef.ajfc[310] = 722152959;
        ef.ajfc[311] = 980157719;
        ef.ajfc[312] = 1771773276;
        ef.ajfc[313] = 1343825931;
        ef.ajfc[314] = 2058916161;
        ef.ajfc[315] = -545880478;
        ef.ajfc[316] = 756878667;
        ef.ajfc[317] = 506696049;
        ef.ajfc[318] = -1881592544;
        ef.ajfc[319] = 1781778829;
        ef.ajfc[320] = 834416982;
        ef.ajfc[321] = 309476560;
        ef.ajfc[322] = -1777737443;
        ef.ajfc[323] = -1303346661;
        ef.ajfc[324] = 302037263;
        ef.ajfc[325] = 45442173;
        ef.ajfc[326] = -1909237286;
        ef.ajfc[327] = -1977646940;
        ef.ajfc[328] = -597340780;
        ef.ajfc[329] = -384170745;
        ef.ajfc[330] = -1307993856;
        ef.ajfc[331] = -1372756247;
        ef.ajfc[332] = 594851345;
        ef.ajfc[333] = -2078834329;
        ef.ajfc[334] = -1172203678;
        ef.ajfc[335] = -1118631640;
        ef.ajfc[336] = -1300316024;
        ef.ajfc[337] = 1565972085;
        ef.ajfc[338] = 649880930;
        ef.ajfc[339] = 1249644722;
        ef.ajfc[340] = -844336428;
        ef.ajfc[341] = -570093156;
        ef.ajfc[342] = -2089194093;
        ef.ajfc[343] = 2124198842;
        ef.ajfc[344] = 976734186;
        ef.ajfc[345] = 1430912721;
        ef.ajfc[346] = -1122517601;
        ef.ajfc[347] = 766154350;
        ef.ajfc[348] = -1660191390;
        ef.ajfc[349] = -1029226048;
        ef.ajfc[350] = 277379435;
        ef.ajfc[351] = -1843779253;
        ef.ajfc[352] = -1085033163;
        ef.ajfc[353] = 294866504;
        ef.ajfc[354] = 1242750072;
        ef.ajfc[355] = -2002577235;
        ef.ajfc[356] = -1311739960;
        ef.ajfc[357] = 820442153;
        ef.ajfc[358] = 208432524;
        ef.ajfc[359] = 1730388389;
        ef.ajfc[360] = -1790500311;
        ef.ajfc[361] = -152342020;
        ef.ajfc[362] = -1599190895;
        ef.ajfc[363] = -1096556530;
        ef.ajfc[364] = -2139034473;
        ef.ajfc[365] = 759317346;
        ef.ajfc[366] = 2067440316;
        ef.ajfc[367] = 787966434;
        ef.ajfc[368] = -686344889;
        ef.ajfc[369] = -37806464;
        ef.ajfc[370] = -1389105935;
        ef.ajfc[371] = 730647497;
        ef.ajfc[372] = -1339511963;
        ef.ajfc[373] = -1914710870;
        ef.ajfc[374] = 140064869;
        ef.ajfc[375] = 1105181427;
        ef.ajfc[376] = 892139096;
        ef.ajfc[377] = 420809310;
        ef.ajfc[378] = -768491132;
        ef.ajfc[379] = 1140592678;
        ef.ajfc[380] = 935171402;
        ef.ajfc[381] = -1245054349;
        ef.ajfc[382] = -1381251819;
        ef.ajfc[383] = 701292570;
        ef.ajfc[384] = 1972286183;
        ef.ajfc[385] = 88651921;
        ef.ajfc[386] = 1844511644;
        ef.ajfc[387] = -1680587516;
        ef.ajfc[388] = -197463708;
        ef.ajfc[389] = -293886237;
        ef.ajfc[390] = 74815231;
        ef.ajfc[391] = -828527248;
        ef.ajfc[392] = -1489931582;
        ef.ajfc[393] = 1578777458;
        ef.ajfc[394] = 1531929291;
        ef.ajfc[395] = -1407204269;
        ef.ajfc[396] = -1655358294;
        ef.ajfc[397] = -441735213;
        ef.ajfc[398] = 807634338;
        ef.ajfc[399] = -1998264566;
    }

    private static /* synthetic */ void anrt() {
        ef.ajfh[0] = -5622963065825492259L;
        ef.ajfh[1] = 5691530976562416339L;
        ef.ajfh[2] = -9049643471122148215L;
        ef.ajfh[3] = -3099160062025547112L;
        ef.ajfh[4] = 7754917038226700614L;
        ef.ajfh[5] = 8301455616098711259L;
        ef.ajfh[6] = -283363831336169595L;
        ef.ajfh[7] = 3281701702079815949L;
        ef.ajfh[8] = -2870264266431764129L;
        ef.ajfh[9] = -7228095351381999775L;
        ef.ajfh[10] = -4264646963052696004L;
        ef.ajfh[11] = 8981087807052702422L;
        ef.ajfh[12] = 387043690060139335L;
        ef.ajfh[13] = 8452558703379926062L;
        ef.ajfh[14] = 4088875036999668116L;
        ef.ajfh[15] = -6461166897687008245L;
        ef.ajfh[16] = -4131877832479731615L;
        ef.ajfh[17] = -6588503300034325376L;
        ef.ajfh[18] = 3368655858834482134L;
        ef.ajfh[19] = 8768547886309251570L;
        ef.ajfh[20] = -1169398901726446372L;
        ef.ajfh[21] = 303616792814516672L;
        ef.ajfh[22] = 2947829654543093249L;
        ef.ajfh[23] = -5208393647578326297L;
        ef.ajfh[24] = 2575324304043343326L;
        ef.ajfh[25] = -7167715230748300911L;
        ef.ajfh[26] = -4992193173258024357L;
        ef.ajfh[27] = 721495967942367288L;
        ef.ajfh[28] = -8307988415355465607L;
        ef.ajfh[29] = 2891566948350052550L;
        ef.ajfh[30] = -2896429688962593500L;
        ef.ajfh[31] = 2723657122096734029L;
        ef.ajfh[32] = -3165074693904990090L;
        ef.ajfh[33] = -4647794556322060305L;
        ef.ajfh[34] = -4078471955077360223L;
        ef.ajfh[35] = -417343715337375035L;
        ef.ajfh[36] = -4748438573112482691L;
        ef.ajfh[37] = 5549784336452111876L;
        ef.ajfh[38] = 4935385276537753726L;
        ef.ajfh[39] = -5870041142018992492L;
        ef.ajfh[40] = 5928374966261315792L;
        ef.ajfh[41] = -8395414245939813201L;
        ef.ajfh[42] = -596132163806990571L;
        ef.ajfh[43] = 6482406004916324164L;
        ef.ajfh[44] = 7070626035537359902L;
        ef.ajfh[45] = -513711531265096902L;
        ef.ajfh[46] = -161556028501681834L;
        ef.ajfh[47] = 6267779449392695475L;
        ef.ajfh[48] = -1614683844744748594L;
        ef.ajfh[49] = -2378849799888533692L;
        ef.ajfh[50] = -3175906222389414810L;
        ef.ajfh[51] = 7616639955841363715L;
        ef.ajfh[52] = -8528057054063501495L;
        ef.ajfh[53] = 8254787027008490595L;
        ef.ajfh[54] = 1094080267535038023L;
        ef.ajfh[55] = -467003955591513843L;
        ef.ajfh[56] = -7782769302715432649L;
        ef.ajfh[57] = 1989838307332685522L;
        ef.ajfh[58] = 4229744968390613900L;
        ef.ajfh[59] = 4324891961655651426L;
        ef.ajfh[60] = 4020867877120427314L;
        ef.ajfh[61] = 2351605223665238662L;
        ef.ajfh[62] = 2152252039633452858L;
        ef.ajfh[63] = -4989319104684370864L;
        ef.ajfh[64] = -3690108382109780280L;
        ef.ajfh[65] = -7155385016876632288L;
        ef.ajfh[66] = -6660901767407808692L;
        ef.ajfh[67] = -8007013048133317203L;
        ef.ajfh[68] = 2181738862660747365L;
        ef.ajfh[69] = 329521210351131732L;
        ef.ajfh[70] = 7133220683052465617L;
        ef.ajfh[71] = -3526892027181741327L;
        ef.ajfh[72] = 932265218342096122L;
        ef.ajfh[73] = -7539870540646000736L;
        ef.ajfh[74] = -6563871612476186843L;
        ef.ajfh[75] = -5675565309692006045L;
        ef.ajfh[76] = 5494268985883592771L;
        ef.ajfh[77] = 6512481877740560173L;
        ef.ajfh[78] = -8327931225324922907L;
        ef.ajfh[79] = -8401017552429012583L;
        ef.ajfh[80] = 6394188280398136851L;
        ef.ajfh[81] = 473048667224082409L;
        ef.ajfh[82] = 3536575033566344056L;
        ef.ajfh[83] = -3879773480974359652L;
        ef.ajfh[84] = 7202628447108923984L;
        ef.ajfh[85] = -4652889068151098671L;
        ef.ajfh[86] = -2414437342538684322L;
        ef.ajfh[87] = 3948988004054461449L;
        ef.ajfh[88] = -5528033258773537753L;
        ef.ajfh[89] = -7256220109659410677L;
        ef.ajfh[90] = -4678978830645996946L;
        ef.ajfh[91] = -2284569270666003602L;
        ef.ajfh[92] = 7637882081854942603L;
        ef.ajfh[93] = 805405719368718194L;
        ef.ajfh[94] = 7484193325774209701L;
        ef.ajfh[95] = 441515492588088253L;
        ef.ajfh[96] = -5799694824405086480L;
        ef.ajfh[97] = 7169204840024742085L;
        ef.ajfh[98] = 4185220851826501230L;
        ef.ajfh[99] = -7453707573841897314L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float durability(class_1799 var0) {
        block57: {
            block56: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amod", ajgj(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == ef.ajfd("amoe", ajfa(int ), (int)911)) break;
                    v0 /* !! */  = (long)ef.ajfd("amof", ajfa(int ), (int)912);
                }
                var3_1 = ef.c;
                v1 /* !! */  = ef.ca;
                if (true) ** GOTO lbl12
                block34: while (true) {
                    v1 /* !! */  = (long)(v2 - ef.ajfd("amog", ajgj(int ), (int)194));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1872270231: {
                            break block34;
                        }
                        case -965483237: {
                            v2 = ef.ajfd("amoh", ajgj(int ), (int)195);
                            continue block34;
                        }
                        case -658755458: {
                            v2 = ef.ajfd("amoi", ajgj(int ), (int)196);
                            continue block34;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = ef.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amoj", ajgj(int ), (int)197)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ef.ajfd("amok", ajfa(int ), (int)913)) break;
                    v3 /* !! */  = (long)ef.ajfd("amol", ajfa(int ), (int)914);
                }
                var1_3 = ef.a;
                if (var3_1) {
                    throw null;
lbl31:
                    // 5 sources

                    return (float)ef.ajfd("amom", ajfn(int ), (int)915);
                }
                if (var1_3 || var1_3) ** GOTO lbl31
                v4 /* !! */  = ef.ca;
                if (true) ** GOTO lbl38
                block37: while (true) {
                    v4 /* !! */  = (long)(v5 - ef.ajfd("amon", ajgj(int ), (int)198));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1872270231: {
                            break block37;
                        }
                        case -924685442: {
                            v5 = ef.ajfd("amoo", ajgj(int ), (int)199);
                            continue block37;
                        }
                        case 632229944: {
                            v5 = ef.ajfd("amop", ajgj(int ), (int)200);
                            continue block37;
                        }
                    }
                    break;
                }
                if (!var0.method_7963()) break block56;
                if (var1_3) ** GOTO lbl31
                v6 /* !! */  = ef.ca;
                if (true) ** GOTO lbl53
                block38: while (true) {
                    v6 /* !! */  = (long)(v7 - ef.ajfd("amoq", ajgj(int ), (int)201));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1872270231: {
                            break block38;
                        }
                        case -1116696005: {
                            v7 = ef.ajfd("amor", ajgj(int ), (int)202);
                            continue block38;
                        }
                        case 1927130463: {
                            v7 = ef.ajfd("amos", ajgj(int ), (int)203);
                            continue block38;
                        }
                    }
                    break;
                }
                if (var0.method_7936() > 0) break block57;
                if (var1_3) ** GOTO lbl31
            }
            if (var1_3 || var1_3) ** GOTO lbl31
            return 1.0f;
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amot", ajgj(int ), (int)204)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ef.ajfd("amou", ajfa(int ), (int)916)) break;
                    v8 /* !! */  = (long)ef.ajfd("amov", ajfa(int ), (int)917);
                }
                v9 = var0.method_7919();
                v10 /* !! */  = ef.ca;
                if (true) ** GOTO lbl84
                block40: while (true) {
                    v10 /* !! */  = (long)(v11 - ef.ajfd("amow", ajgj(int ), (int)205));
lbl84:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1872270231: {
                            break block40;
                        }
                        case -1692723679: {
                            v11 = ef.ajfd("amox", ajgj(int ), (int)206);
                            continue block40;
                        }
                        case -888737986: {
                            v11 = ef.ajfd("amoy", ajgj(int ), (int)207);
                            continue block40;
                        }
                    }
                    break;
                }
                v12 = 1.0f - v9 / (float)var0.method_7936();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amoz", ajgj(int ), (int)208)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == ef.ajfd("ampa", ajfa(int ), (int)918)) break;
                    v13 /* !! */  = (long)ef.ajfd("ampb", ajfa(int ), (int)919);
                }
                return class_3532.method_15363((float)v12, (float)0.0f, (float)1.0f);
            }
lbl101:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ef.ajfd("ampc", ajfa(int ), (int)920);
                if (!var3_1) break;
                throw null;
            }
lbl105:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ef.ajfd("ampd", ajfa(int ), (int)921);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl109:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ef.ajfd("ampe", ajfa(int ), (int)922);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl140
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ef.ajfd("ampf", ajfa(int ), (int)923);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 4: {
                var2_2 /* !! */  = (int)ef.ajfd("ampg", ajfa(int ), (int)924);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ef.ajfd("amph", ajfa(int ), (int)925);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
lbl128:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ef.ajfd("ampi", ajfa(int ), (int)926);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ef.ajfd("ampj", ajfa(int ), (int)927);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
lbl136:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ef.ajfd("ampk", ajfa(int ), (int)928);
                if (var3_1) {
                    throw null;
                }
            }
lbl140:
            // 5 sources

            case 9: {
                var2_2 /* !! */  = (int)ef.ajfd("ampl", ajfa(int ), (int)929);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ef.ajfd("ampm", ajfa(int ), (int)930);
        ** while (!var3_1)
lbl147:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ange() {
        ef.ajfb[800] = -1854045854;
        ef.ajfb[801] = -57832649;
        ef.ajfb[802] = 1253498879;
        ef.ajfb[803] = 1413225999;
        ef.ajfb[804] = -913667591;
        ef.ajfb[805] = 1384776821;
        ef.ajfb[806] = 70630041;
        ef.ajfb[807] = 1101869598;
        ef.ajfb[808] = 1548934388;
        ef.ajfb[809] = 569342123;
        ef.ajfb[810] = -1614608799;
        ef.ajfb[811] = -1905938633;
        ef.ajfb[812] = -887308;
        ef.ajfb[813] = 550697341;
        ef.ajfb[814] = 2033105189;
        ef.ajfb[815] = 978176719;
        ef.ajfb[816] = 2066676848;
        ef.ajfb[817] = -339131437;
        ef.ajfb[818] = -1943753089;
        ef.ajfb[819] = -1637199594;
        ef.ajfb[820] = 1967286566;
        ef.ajfb[821] = 1548912903;
        ef.ajfb[822] = 1046876723;
        ef.ajfb[823] = -1861617026;
        ef.ajfb[824] = -1480347356;
        ef.ajfb[825] = -2141077394;
        ef.ajfb[826] = -1471186322;
        ef.ajfb[827] = 1484564601;
        ef.ajfb[828] = -1526334694;
        ef.ajfb[829] = 33212770;
        ef.ajfb[830] = 234370959;
        ef.ajfb[831] = 869431529;
        ef.ajfb[832] = 882147397;
        ef.ajfb[833] = -1144335483;
        ef.ajfb[834] = -699676810;
        ef.ajfb[835] = 1424026995;
        ef.ajfb[836] = -123929923;
        ef.ajfb[837] = 2018769841;
        ef.ajfb[838] = 1433751052;
        ef.ajfb[839] = -805295006;
        ef.ajfb[840] = -578278678;
        ef.ajfb[841] = 1403889663;
        ef.ajfb[842] = 245098004;
        ef.ajfb[843] = -2031276983;
        ef.ajfb[844] = 674960166;
        ef.ajfb[845] = 239627797;
        ef.ajfb[846] = 1463725807;
        ef.ajfb[847] = -1193021563;
        ef.ajfb[848] = 2120162080;
        ef.ajfb[849] = -1391101698;
        ef.ajfb[850] = 1404617077;
        ef.ajfb[851] = 1076803758;
        ef.ajfb[852] = 1969354365;
        ef.ajfb[853] = -1761537336;
        ef.ajfb[854] = 1499487722;
        ef.ajfb[855] = -1046637976;
        ef.ajfb[856] = -1036711098;
        ef.ajfb[857] = -555377046;
        ef.ajfb[858] = -149164371;
        ef.ajfb[859] = 1029623078;
        ef.ajfb[860] = -2035663136;
        ef.ajfb[861] = 1981865922;
        ef.ajfb[862] = -1122506868;
        ef.ajfb[863] = 93908017;
        ef.ajfb[864] = -1403495791;
        ef.ajfb[865] = -1144577937;
        ef.ajfb[866] = -1972594554;
        ef.ajfb[867] = -1411300754;
        ef.ajfb[868] = 17742967;
        ef.ajfb[869] = -311030842;
        ef.ajfb[870] = -656399167;
        ef.ajfb[871] = -321924310;
        ef.ajfb[872] = -1197898947;
        ef.ajfb[873] = 527209773;
        ef.ajfb[874] = 1513093778;
        ef.ajfb[875] = 50215429;
        ef.ajfb[876] = 262256447;
        ef.ajfb[877] = 2046775926;
        ef.ajfb[878] = 1236987681;
        ef.ajfb[879] = -1072734738;
        ef.ajfb[880] = -1497329892;
        ef.ajfb[881] = -1582916877;
        ef.ajfb[882] = -1031239512;
        ef.ajfb[883] = -1270868087;
        ef.ajfb[884] = 1079697889;
        ef.ajfb[885] = 1204379970;
        ef.ajfb[886] = -605872428;
        ef.ajfb[887] = 158353236;
        ef.ajfb[888] = 1873632078;
        ef.ajfb[889] = 1596574765;
        ef.ajfb[890] = -1960537693;
        ef.ajfb[891] = -519560106;
        ef.ajfb[892] = -407266330;
        ef.ajfb[893] = 2858391;
        ef.ajfb[894] = -1418816622;
        ef.ajfb[895] = 140852823;
        ef.ajfb[896] = -141109939;
        ef.ajfb[897] = 684571959;
        ef.ajfb[898] = -1593979052;
        ef.ajfb[899] = -1343450094;
    }

    private static /* synthetic */ void andb() {
        ef.ajfb[400] = -915998044;
        ef.ajfb[401] = 490834887;
        ef.ajfb[402] = -411976667;
        ef.ajfb[403] = 1971707767;
        ef.ajfb[404] = -350332472;
        ef.ajfb[405] = 1521510051;
        ef.ajfb[406] = 1977098266;
        ef.ajfb[407] = -1003760080;
        ef.ajfb[408] = -408901921;
        ef.ajfb[409] = -1871456366;
        ef.ajfb[410] = -877676682;
        ef.ajfb[411] = 801648222;
        ef.ajfb[412] = 715330360;
        ef.ajfb[413] = -565122996;
        ef.ajfb[414] = -1250273428;
        ef.ajfb[415] = 2016939291;
        ef.ajfb[416] = 2054604830;
        ef.ajfb[417] = 1732056850;
        ef.ajfb[418] = -714762502;
        ef.ajfb[419] = 480277311;
        ef.ajfb[420] = -133071734;
        ef.ajfb[421] = -949615065;
        ef.ajfb[422] = 1378580897;
        ef.ajfb[423] = -1025703363;
        ef.ajfb[424] = -376950861;
        ef.ajfb[425] = 910568055;
        ef.ajfb[426] = -748623440;
        ef.ajfb[427] = -1290999705;
        ef.ajfb[428] = -2074935648;
        ef.ajfb[429] = -44408084;
        ef.ajfb[430] = -1974619737;
        ef.ajfb[431] = 242296562;
        ef.ajfb[432] = 1202269955;
        ef.ajfb[433] = 32625072;
        ef.ajfb[434] = -1349894328;
        ef.ajfb[435] = 1536672997;
        ef.ajfb[436] = 1028254255;
        ef.ajfb[437] = -429189217;
        ef.ajfb[438] = -1708588686;
        ef.ajfb[439] = 1817840487;
        ef.ajfb[440] = -1236095670;
        ef.ajfb[441] = 1004790613;
        ef.ajfb[442] = -490333405;
        ef.ajfb[443] = 1447910669;
        ef.ajfb[444] = 2115365018;
        ef.ajfb[445] = -769711581;
        ef.ajfb[446] = 2121871592;
        ef.ajfb[447] = 1754381035;
        ef.ajfb[448] = -904052274;
        ef.ajfb[449] = -887719322;
        ef.ajfb[450] = 624806279;
        ef.ajfb[451] = -1754660572;
        ef.ajfb[452] = -854561705;
        ef.ajfb[453] = -2080944692;
        ef.ajfb[454] = -603472364;
        ef.ajfb[455] = -1923626895;
        ef.ajfb[456] = 1049357400;
        ef.ajfb[457] = -53957490;
        ef.ajfb[458] = 451972245;
        ef.ajfb[459] = -80200296;
        ef.ajfb[460] = 1668501834;
        ef.ajfb[461] = -894487576;
        ef.ajfb[462] = 152907936;
        ef.ajfb[463] = 330523399;
        ef.ajfb[464] = -842001104;
        ef.ajfb[465] = 633220959;
        ef.ajfb[466] = 42175428;
        ef.ajfb[467] = -926828609;
        ef.ajfb[468] = -1496273574;
        ef.ajfb[469] = -1471723892;
        ef.ajfb[470] = -255365073;
        ef.ajfb[471] = 1488728334;
        ef.ajfb[472] = 515260188;
        ef.ajfb[473] = 1449074837;
        ef.ajfb[474] = -230746883;
        ef.ajfb[475] = 389948479;
        ef.ajfb[476] = -1762770153;
        ef.ajfb[477] = -1446256508;
        ef.ajfb[478] = -82793418;
        ef.ajfb[479] = 1651798473;
        ef.ajfb[480] = 1467778537;
        ef.ajfb[481] = 234085179;
        ef.ajfb[482] = -244526534;
        ef.ajfb[483] = -1569918623;
        ef.ajfb[484] = 1739150200;
        ef.ajfb[485] = 18998571;
        ef.ajfb[486] = 875151325;
        ef.ajfb[487] = 882949813;
        ef.ajfb[488] = 912329100;
        ef.ajfb[489] = -1617132806;
        ef.ajfb[490] = 1207222179;
        ef.ajfb[491] = 1748654924;
        ef.ajfb[492] = -2104543526;
        ef.ajfb[493] = -1833529173;
        ef.ajfb[494] = -1168660856;
        ef.ajfb[495] = 1408051707;
        ef.ajfb[496] = 2084613041;
        ef.ajfb[497] = 152975556;
        ef.ajfb[498] = 585850776;
        ef.ajfb[499] = -2009989753;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void trackHit(class_1309 var1_1) {
        block104: {
            v0 /* !! */  = ef.ca;
            if (true) ** GOTO lbl5
            block61: while (true) {
                v0 /* !! */  = (long)(ef.ajfd("akcw", ajgj(int ), (int)30) - ef.ajfd("akcv", ajgj(int ), (int)29));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1872270231: {
                        break block61;
                    }
                    case 1328399222: {
                        continue block61;
                    }
                }
                break;
            }
            var5_2 = ef.c;
            v1 /* !! */  = ef.ca;
            if (true) ** GOTO lbl15
            block62: while (true) {
                v1 /* !! */  = (long)(ef.ajfd("akcy", ajgj(int ), (int)32) - ef.ajfd("akcx", ajgj(int ), (int)31));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1872270231: {
                        break block62;
                    }
                    case 945584072: {
                        continue block62;
                    }
                }
                break;
            }
            var4_3 /* !! */  = ef.b;
            v2 /* !! */  = ef.ca;
            if (true) ** GOTO lbl25
            block63: while (true) {
                v2 /* !! */  = (long)(v3 - ef.ajfd("akcz", ajgj(int ), (int)33));
lbl25:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1887376477: {
                        v3 = ef.ajfd("akda", ajgj(int ), (int)34);
                        continue block63;
                    }
                    case -1872270231: {
                        break block63;
                    }
                    case -1108075987: {
                        v3 = ef.ajfd("akdb", ajgj(int ), (int)35);
                        continue block63;
                    }
                    case -174609619: {
                        v3 = ef.ajfd("akdc", ajgj(int ), (int)36);
                        continue block63;
                    }
                }
                break;
            }
            var3_4 = ef.a;
            if (var5_2) {
                throw null;
lbl40:
                // 14 sources

                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl40
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("akdd", ajgj(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ef.ajfd("akde", ajfa(int ), (int)393)) break;
                v4 /* !! */  = (long)ef.ajfd("akdf", ajfa(int ), (int)394);
            }
            if (var1_1 == this.trackedTarget) break block104;
            if (var3_4 || var3_4) ** GOTO lbl40
            v5 /* !! */  = ef.ca;
            if (true) ** GOTO lbl54
            block66: while (true) {
                v5 /* !! */  = (long)(ef.ajfd("akdh", ajgj(int ), (int)39) - ef.ajfd("akdg", ajgj(int ), (int)38));
lbl54:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1872270231: {
                        break block66;
                    }
                    case -647637881: {
                        continue block66;
                    }
                }
                break;
            }
            this.trackedTarget = var1_1;
            if (var3_4 || var3_4) ** GOTO lbl40
            v6 = ef.ajfd("akdi", ajfa(int ), (int)395);
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("akdj", ajgj(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ef.ajfd("akdk", ajfa(int ), (int)396)) break;
                v7 /* !! */  = (long)ef.ajfd("akdl", ajfa(int ), (int)397);
            }
            this.pendingParticleCount = (int)v6;
            if (var3_4 || var3_4) ** GOTO lbl40
            v8 /* !! */  = ef.ca;
            if (true) ** GOTO lbl73
            block68: while (true) {
                v8 /* !! */  = (long)(v9 - ef.ajfd("akdm", ajgj(int ), (int)41));
lbl73:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1872270231: {
                        break block68;
                    }
                    case 583846156: {
                        v9 = ef.ajfd("akdn", ajgj(int ), (int)42);
                        continue block68;
                    }
                    case 2018354188: {
                        v9 = ef.ajfd("akdo", ajgj(int ), (int)43);
                        continue block68;
                    }
                }
                break;
            }
            this.lastHurtTime = 0.0f;
            if (var3_4) ** GOTO lbl40
        }
        if (var3_4 || var3_4) ** GOTO lbl40
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("akdp", ajgj(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ef.ajfd("akdq", ajfa(int ), (int)398)) break;
                    v10 /* !! */  = (long)ef.ajfd("akdr", ajfa(int ), (int)399);
                }
                if (var1_1.field_6235 <= 0) ** GOTO lbl133
                if (var3_4) ** GOTO lbl40
                v11 /* !! */  = ef.ca;
                if (true) ** GOTO lbl100
                block70: while (true) {
                    v11 /* !! */  = (long)(ef.ajfd("akdt", ajgj(int ), (int)46) - ef.ajfd("akds", ajgj(int ), (int)45));
lbl100:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1872270231: {
                            break block70;
                        }
                        case -70811898: {
                            continue block70;
                        }
                    }
                    break;
                }
                if (var1_1.field_6254 <= 0) ** GOTO lbl133
                if (var3_4 || var3_4) ** GOTO lbl40
                v12 = ef.ajfd("akdu", ajfn(int ), (int)400);
                v13 /* !! */  = ef.ca;
                if (true) ** GOTO lbl112
                block71: while (true) {
                    v13 /* !! */  = (long)(ef.ajfd("akdw", ajgj(int ), (int)48) - ef.ajfd("akdv", ajgj(int ), (int)47));
lbl112:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1872270231: {
                            break block71;
                        }
                        case -627577829: {
                            continue block71;
                        }
                    }
                    break;
                }
                v14 = var1_1.field_6235;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("akdx", ajgj(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ef.ajfd("akdy", ajfa(int ), (int)401)) break;
                    v15 /* !! */  = (long)ef.ajfd("akdz", ajfa(int ), (int)402);
                }
                v16 = v14 / (float)var1_1.field_6254;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("akea", ajgj(int ), (int)50)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ef.ajfd("akeb", ajfa(int ), (int)403)) break;
                    v17 /* !! */  = (long)ef.ajfd("akec", ajfa(int ), (int)404);
                }
                v18 = Math.min((float)v12, v16);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl135
lbl133:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl40
                v18 = var2_5 = 0.0f;
lbl135:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl40
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("aked", ajgj(int ), (int)51)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ef.ajfd("akee", ajfa(int ), (int)405)) break;
                    v19 /* !! */  = (long)ef.ajfd("akef", ajfa(int ), (int)406);
                }
                if (!(var2_5 > this.lastHurtTime)) ** GOTO lbl151
                if (var3_4 || var3_4) ** GOTO lbl40
                v20 = ef.ajfd("akeg", ajfa(int ), (int)407);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("akeh", ajgj(int ), (int)52)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ef.ajfd("akei", ajfa(int ), (int)408)) break;
                    v21 /* !! */  = (long)ef.ajfd("akej", ajfa(int ), (int)409);
                }
                this.pendingParticleCount = (int)v20;
                if (var3_4) ** GOTO lbl40
lbl151:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl40
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = ef.ca - ef.ajfd("akek", ajgj(int ), (int)53)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ef.ajfd("akel", ajfa(int ), (int)410)) break;
                    v22 /* !! */  = (long)ef.ajfd("akem", ajfa(int ), (int)411);
                }
                this.lastHurtTime = var2_5;
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)ef.ajfd("aken", ajfa(int ), (int)412);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 1: {
                var4_3 /* !! */  = (int)ef.ajfd("akeo", ajfa(int ), (int)413);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl171:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)ef.ajfd("akep", ajfa(int ), (int)414);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl176:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)ef.ajfd("akeq", ajfa(int ), (int)415);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl181:
            // 2 sources

            case 4: {
                do {
                    var4_3 /* !! */  = (int)ef.ajfd("aker", ajfa(int ), (int)416);
                } while (!var5_2);
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)ef.ajfd("akes", ajfa(int ), (int)417);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 6: {
                var4_3 /* !! */  = (int)ef.ajfd("aket", ajfa(int ), (int)418);
                if (!var5_2) ** GOTO lbl181
                throw null;
            }
lbl195:
            // 4 sources

            case 7: {
                var4_3 /* !! */  = (int)ef.ajfd("akeu", ajfa(int ), (int)419);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl200:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ef.ajfd("akev", ajfa(int ), (int)420);
                if (!var5_2) ** GOTO lbl195
                throw null;
            }
lbl204:
            // 4 sources

            case 9: {
                var4_3 /* !! */  = (int)ef.ajfd("akew", ajfa(int ), (int)421);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 10: {
                var4_3 /* !! */  = (int)ef.ajfd("akex", ajfa(int ), (int)422);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 11: {
                var4_3 /* !! */  = (int)ef.ajfd("akey", ajfa(int ), (int)423);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl219:
            // 4 sources

            case 12: {
                var4_3 /* !! */  = (int)ef.ajfd("akez", ajfa(int ), (int)424);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)ef.ajfd("akfa", ajfa(int ), (int)425);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl228:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)ef.ajfd("akfb", ajfa(int ), (int)426);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl233:
            // 3 sources

            case 15: {
                var4_3 /* !! */  = (int)ef.ajfd("akfc", ajfa(int ), (int)427);
                if (!var5_2) ** GOTO lbl195
                throw null;
            }
lbl237:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)ef.ajfd("akfd", ajfa(int ), (int)428);
                if (!var5_2) ** GOTO lbl171
                throw null;
            }
lbl241:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)ef.ajfd("akfe", ajfa(int ), (int)429);
                if (!var5_2) ** GOTO lbl195
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)ef.ajfd("akff", ajfa(int ), (int)430);
                if (!var5_2) ** GOTO lbl176
                throw null;
            }
lbl249:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)ef.ajfd("akfg", ajfa(int ), (int)431);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)ef.ajfd("akfh", ajfa(int ), (int)432);
                if (!var5_2) ** GOTO lbl241
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)ef.ajfd("akfi", ajfa(int ), (int)433);
                if (!var5_2) ** GOTO lbl228
                throw null;
            }
            case 22: {
                var4_3 /* !! */  = (int)ef.ajfd("akfj", ajfa(int ), (int)434);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl266:
            // 4 sources

            case 23: {
                var4_3 /* !! */  = (int)ef.ajfd("akfk", ajfa(int ), (int)435);
                if (!var5_2) ** GOTO lbl233
                throw null;
            }
lbl270:
            // 2 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ef.ajfd("akfl", ajfa(int ), (int)436);
                    if (!var5_2) ** GOTO lbl266
                    throw null;
                }
            }
lbl275:
            // 2 sources

            case 25: {
                var4_3 /* !! */  = (int)ef.ajfd("akfm", ajfa(int ), (int)437);
                if (!var5_2) ** GOTO lbl219
                throw null;
            }
            case 26: {
                var4_3 /* !! */  = (int)ef.ajfd("akfn", ajfa(int ), (int)438);
                if (!var5_2) ** GOTO lbl200
                throw null;
            }
            case 27: 
        }
        var4_3 /* !! */  = (int)ef.ajfd("akfo", ajfa(int ), (int)439);
        ** while (!var5_2)
lbl286:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ef() {
        var2_1 /* !! */  = ef.b;
        super("TargetHUD", (int)ef.ajfd("ajfe", ajfa(int ), (int)0), (int)ef.ajfd("ajff", ajfa(int ), (int)1), (int)Math.ceil((double)ef.ajfd("ajfj", ajfg(int ), (int)0)), (int)Math.ceil((double)ef.ajfd("ajfk", ajfg(int ), (int)1)), (boolean)ef.ajfd("ajfl", ajfa(int ), (int)2));
        this.armor = new class_1799[ef.ARMOR.length];
        this.hands = new class_1799[ef.HANDS.length];
        this.queuedCounts = new String[ef.HANDS.length];
        this.queuedCountX = new float[ef.HANDS.length];
        this.queuedCountY = new float[ef.HANDS.length];
        this.animatedDurability = new EnumMap<class_1304, Float>(class_1304.class);
        this.headParticles = new ArrayList<E>((int)ef.ajfd("ajfm", ajfa(int ), (int)3));
        this.targetName = "";
        this.maxHealth = (float)ef.ajfd("ajfo", ajfn(int ), (int)4);
        this.animatedHealth = (float)ef.ajfd("ajfp", ajfn(int ), (int)5);
        this.animatedBaseHealth = (float)ef.ajfd("ajfq", ajfn(int ), (int)6);
        this.lastFrame = System.nanoTime();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                ef.instance = this;
                Arrays.fill(this.armor, class_1799.field_8037);
                Arrays.fill(this.hands, class_1799.field_8037);
                return;
            }
lbl22:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ef.ajfd("ajfr", ajfa(int ), (int)7);
                    ** GOTO lbl53
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfs", ajfa(int ), (int)8);
                ** GOTO lbl53
            }
lbl29:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ef.ajfd("ajft", ajfa(int ), (int)9);
                ** GOTO lbl38
            }
            case 3: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfu", ajfa(int ), (int)10);
                ** GOTO lbl70
            }
            case 4: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfv", ajfa(int ), (int)11);
                ** GOTO lbl58
            }
lbl38:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfw", ajfa(int ), (int)12);
                ** GOTO lbl61
            }
lbl41:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfx", ajfa(int ), (int)13);
                ** GOTO lbl50
            }
            case 7: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfy", ajfa(int ), (int)14);
                ** GOTO lbl38
            }
lbl47:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)ef.ajfd("ajfz", ajfa(int ), (int)15);
                ** GOTO lbl70
            }
lbl50:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)ef.ajfd("ajga", ajfa(int ), (int)16);
                ** GOTO lbl41
            }
lbl53:
            // 3 sources

            case 10: {
                var2_1 /* !! */  = (int)ef.ajfd("ajgb", ajfa(int ), (int)17);
            }
lbl55:
            // 3 sources

            case 11: {
                var2_1 /* !! */  = (int)ef.ajfd("ajgc", ajfa(int ), (int)18);
                ** GOTO lbl47
            }
lbl58:
            // 2 sources

            case 12: {
                var2_1 /* !! */  = (int)ef.ajfd("ajgd", ajfa(int ), (int)19);
                ** GOTO lbl22
            }
lbl61:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)ef.ajfd("ajge", ajfa(int ), (int)20);
                ** GOTO lbl67
            }
            case 14: {
                var2_1 /* !! */  = (int)ef.ajfd("ajgf", ajfa(int ), (int)21);
                ** GOTO lbl47
            }
lbl67:
            // 2 sources

            case 15: {
                var2_1 /* !! */  = (int)ef.ajfd("ajgg", ajfa(int ), (int)22);
                ** GOTO lbl29
            }
lbl70:
            // 3 sources

            case 16: {
                var2_1 /* !! */  = (int)ef.ajfd("ajgh", ajfa(int ), (int)23);
                ** GOTO lbl55
            }
            case 17: 
        }
        var2_1 /* !! */  = (int)ef.ajfd("ajgi", ajfa(int ), (int)24);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawMain(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block210: {
            block209: {
                var28_6 = ef.c;
                var27_7 /* !! */  = ef.b;
                var26_8 = ef.a;
                if (var28_6) {
                    throw null;
lbl6:
                    // 57 sources

                    return;
                }
                if (var26_8 || var26_8) ** GOTO lbl6
                ef.panel(var1_1, var2_2, var3_3, (float)ef.ajfd("ajms", ajfn(int ), (int)162), (float)ef.ajfd("ajmt", ajfn(int ), (int)163), (float)ef.ajfd("ajmu", ajfn(int ), (int)164), var4_4, (boolean)ef.ajfd("ajmv", ajfa(int ), (int)165));
                if (var26_8 || var26_8) ** GOTO lbl6
                var6_9 = var2_2 + ef.ajfd("ajmw", ajfn(int ), (int)166);
                if (var26_8 || var26_8) ** GOTO lbl6
                var7_10 = var3_3 + ef.ajfd("ajmx", ajfn(int ), (int)167);
                if (var26_8 || var26_8) ** GOTO lbl6
                var8_11 = var6_9 + ef.ajfd("ajmy", ajfn(int ), (int)168);
                if (var26_8 || var26_8) ** GOTO lbl6
                var9_12 = var7_10 + ef.ajfd("ajmz", ajfn(int ), (int)169);
                if (var26_8 || var26_8) ** GOTO lbl6
                if (this.pendingParticleCount <= 0) break block209;
                if (var26_8 || var26_8) ** GOTO lbl6
                this.spawnHeadParticles(var8_11 - var2_2 + ef.ajfd("ajna", ajfn(int ), (int)170), var9_12 - var3_3 + ef.ajfd("ajnb", ajfn(int ), (int)171), this.pendingParticleCount);
                if (var26_8 || var26_8) ** GOTO lbl6
                this.pendingParticleCount = (int)ef.ajfd("ajnc", ajfa(int ), (int)172);
                if (var26_8) ** GOTO lbl6
            }
            if (var26_8 || var26_8) ** GOTO lbl6
            this.drawHeadParticles(var1_1, var2_2, var3_3, var4_4, var5_5);
            if (var26_8 || var26_8) ** GOTO lbl6
            ef.subPanel(var1_1, var6_9, var7_10, (float)ef.ajfd("ajnd", ajfn(int ), (int)173), (float)ef.ajfd("ajne", ajfn(int ), (int)174), (float)ef.ajfd("ajnf", ajfn(int ), (int)175), (float)ef.ajfd("ajng", ajfn(int ), (int)176), var4_4);
            if (var26_8 || var26_8) ** GOTO lbl6
            ki.glow(var1_1, var8_11 + ef.ajfd("ajnh", ajfn(int ), (int)177), var9_12 + ef.ajfd("ajni", ajfn(int ), (int)178), (float)ef.ajfd("ajnj", ajfn(int ), (int)179), nd.multAlpha(dz.color((int)ef.ajfd("ajnk", ajfa(int ), (int)180)), var4_4), (boolean)ef.ajfd("ajnl", ajfa(int ), (int)181));
            if (var26_8 || var26_8) ** GOTO lbl6
            ki.rect(var1_1, var8_11 - ef.ajfd("ajnm", ajfn(int ), (int)182), var9_12 - ef.ajfd("ajnn", ajfn(int ), (int)183), (float)ef.ajfd("ajno", ajfn(int ), (int)184), (float)ef.ajfd("ajnp", ajfn(int ), (int)185), (float)ef.ajfd("ajnq", ajfn(int ), (int)186), nd.multAlpha(dz.color((int)ef.ajfd("ajnr", ajfa(int ), (int)187)), var4_4), (boolean)ef.ajfd("ajns", ajfa(int ), (int)188));
            if (var26_8 || var26_8) ** GOTO lbl6
            if (this.skin == null) break block210;
            if (var26_8 || var26_8) ** GOTO lbl6
            var10_13 = nd.multAlpha((int)ef.ajfd("ajnt", ajfa(int ), (int)189), var4_4);
            if (var26_8 || var26_8) ** GOTO lbl6
            ki.imageRegion(var1_1, var8_11, var9_12, (float)ef.ajfd("ajnu", ajfn(int ), (int)190), (float)ef.ajfd("ajnv", ajfn(int ), (int)191), this.skin, var10_13, (float)ef.ajfd("ajnw", ajfn(int ), (int)192), (float)ef.ajfd("ajnx", ajfn(int ), (int)193), (float)ef.ajfd("ajny", ajfn(int ), (int)194), (float)ef.ajfd("ajnz", ajfn(int ), (int)195), (float)ef.ajfd("ajoa", ajfn(int ), (int)196), (boolean)ef.ajfd("ajob", ajfa(int ), (int)197), (boolean)ef.ajfd("ajoc", ajfa(int ), (int)198));
            if (var26_8 || var26_8) ** GOTO lbl6
            ki.imageRegion(var1_1, var8_11, var9_12, (float)ef.ajfd("ajod", ajfn(int ), (int)199), (float)ef.ajfd("ajoe", ajfn(int ), (int)200), this.skin, var10_13, (float)ef.ajfd("ajof", ajfn(int ), (int)201), (float)ef.ajfd("ajog", ajfn(int ), (int)202), (float)ef.ajfd("ajoh", ajfn(int ), (int)203), (float)ef.ajfd("ajoi", ajfn(int ), (int)204), (float)ef.ajfd("ajoj", ajfn(int ), (int)205), (boolean)ef.ajfd("ajok", ajfa(int ), (int)206), (boolean)ef.ajfd("ajol", ajfa(int ), (int)207));
            if (var26_8) ** GOTO lbl6
        }
        if (var26_8 || var26_8) ** GOTO lbl6
        var10_14 = var2_2 + ef.ajfd("ajom", ajfn(int ), (int)208);
        if (var26_8 || var26_8) ** GOTO lbl6
        ef.subPanel(var1_1, var10_14, var3_3 + ef.ajfd("ajon", ajfn(int ), (int)209), (float)ef.ajfd("ajoo", ajfn(int ), (int)210), (float)ef.ajfd("ajop", ajfn(int ), (int)211), (float)ef.ajfd("ajoq", ajfn(int ), (int)212), (float)ef.ajfd("ajor", ajfn(int ), (int)213), var4_4);
        if (var26_8 || var26_8) ** GOTO lbl6
        ef.subPanel(var1_1, var10_14, var3_3 + ef.ajfd("ajos", ajfn(int ), (int)214), (float)ef.ajfd("ajot", ajfn(int ), (int)215), (float)ef.ajfd("ajou", ajfn(int ), (int)216), (float)ef.ajfd("ajov", ajfn(int ), (int)217), (float)ef.ajfd("ajow", ajfn(int ), (int)218), var4_4);
        if (var26_8) ** GOTO lbl6
        if (var27_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var27_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var26_8) ** GOTO lbl6
                if (kv.INTER_SEMIBOLD == null) ** GOTO lbl61
                if (var26_8 || var26_8) ** GOTO lbl6
                v0 = kv.INTER_SEMIBOLD;
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl63
lbl61:
                // 1 sources

                if (var26_8 || var26_8) ** GOTO lbl6
                v0 = var11_15 = kv.getDefault();
lbl63:
                // 2 sources

                if (var26_8 || var26_8) ** GOTO lbl6
                v1 = new Object[1];
                v1[ef.ajfd("ajox", ajfa(int ), (int)219)] = Float.valueOf(Math.max(0.0f, this.animatedHealth));
                var12_16 = String.format(Locale.ROOT, "%.1f", v1);
                if (var26_8 || var26_8) ** GOTO lbl6
                var13_17 = kq.width(var11_15, "hp", (float)ef.ajfd("ajoy", ajfn(int ), (int)220));
                if (var26_8 || var26_8) ** GOTO lbl6
                var14_18 = kq.width(var11_15, var12_16, (float)ef.ajfd("ajoz", ajfn(int ), (int)221));
                if (var26_8 || var26_8) ** GOTO lbl6
                var15_19 = var10_14 + ef.ajfd("ajpa", ajfn(int ), (int)222) - ef.ajfd("ajpb", ajfn(int ), (int)223) - var13_17 - ef.ajfd("ajpc", ajfn(int ), (int)224) - var14_18;
                if (var26_8 || var26_8) ** GOTO lbl6
                var16_20 = var3_3 + ef.ajfd("ajpd", ajfn(int ), (int)225) + ef.ajfd("ajpe", ajfn(int ), (int)226);
                if (var26_8 || var26_8) ** GOTO lbl6
                var17_21 = ef.fit(var11_15, this.targetName, Math.max(0.0f, var15_19 - (var10_14 + ef.ajfd("ajpf", ajfn(int ), (int)227)) - ef.ajfd("ajpg", ajfn(int ), (int)228)), (float)ef.ajfd("ajph", ajfn(int ), (int)229));
                if (var26_8 || var26_8) ** GOTO lbl6
                kq.text(var1_1, var11_15, var17_21, var10_14 + ef.ajfd("ajpi", ajfn(int ), (int)230), ef.centeredY(var11_15, var17_21, (float)ef.ajfd("ajpj", ajfn(int ), (int)231), var16_20), (float)ef.ajfd("ajpk", ajfn(int ), (int)232), nd.multAlpha(ef.TEXT, var4_4), (boolean)ef.ajfd("ajpl", ajfa(int ), (int)233));
                if (var26_8 || var26_8) ** GOTO lbl6
                kq.text(var1_1, var11_15, var12_16, var15_19, ef.centeredY(var11_15, var12_16, (float)ef.ajfd("ajpm", ajfn(int ), (int)234), var16_20), (float)ef.ajfd("ajpn", ajfn(int ), (int)235), nd.multAlpha(dz.color((int)ef.ajfd("ajpo", ajfa(int ), (int)236)), var4_4), (boolean)ef.ajfd("ajpp", ajfa(int ), (int)237));
                if (var26_8 || var26_8) ** GOTO lbl6
                kq.text(var1_1, var11_15, "hp", var15_19 + var14_18 + ef.ajfd("ajpq", ajfn(int ), (int)238), ef.centeredY(var11_15, "hp", (float)ef.ajfd("ajpr", ajfn(int ), (int)239), var16_20), (float)ef.ajfd("ajps", ajfn(int ), (int)240), nd.multAlpha(dz.color((int)ef.ajfd("ajpt", ajfa(int ), (int)241)), var4_4), (boolean)ef.ajfd("ajpu", ajfa(int ), (int)242));
                if (var26_8 || var26_8) ** GOTO lbl6
                var18_22 = var10_14 + ef.ajfd("ajpv", ajfn(int ), (int)243);
                if (var26_8 || var26_8) ** GOTO lbl6
                var19_23 = var3_3 + ef.ajfd("ajpw", ajfn(int ), (int)244) + ef.ajfd("ajpx", ajfn(int ), (int)245);
                if (var26_8 || var26_8) ** GOTO lbl6
                ki.rect(var1_1, var18_22, var19_23, (float)ef.ajfd("ajpy", ajfn(int ), (int)246), (float)ef.ajfd("ajpz", ajfn(int ), (int)247), (float)ef.ajfd("ajqa", ajfn(int ), (int)248), nd.multAlpha(dz.color((int)ef.ajfd("ajqb", ajfa(int ), (int)249)), var4_4), (boolean)ef.ajfd("ajqc", ajfa(int ), (int)250));
                if (var26_8 || var26_8) ** GOTO lbl6
                if (!(this.maxHealth <= 0.0f)) ** GOTO lbl96
                if (var26_8) ** GOTO lbl6
                v2 = 0.0f;
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl98
lbl96:
                // 1 sources

                if (var26_8 || var26_8) ** GOTO lbl6
                v2 = var20_24 = class_3532.method_15363((float)(this.animatedBaseHealth / this.maxHealth), (float)0.0f, (float)1.0f);
lbl98:
                // 2 sources

                if (var26_8 || var26_8) ** GOTO lbl6
                var21_25 = ef.ajfd("ajqd", ajfn(int ), (int)251) * var20_24;
                if (var26_8 || var26_8) ** GOTO lbl6
                if (!(var21_25 > ef.ajfd("ajqe", ajfn(int ), (int)252))) ** GOTO lbl107
                if (var26_8 || var26_8) ** GOTO lbl6
                ki.rect(var1_1, var18_22 - ef.ajfd("ajqf", ajfn(int ), (int)253), var19_23 - ef.ajfd("ajqg", ajfn(int ), (int)254), (float)(var21_25 + ef.ajfd("ajqh", ajfn(int ), (int)255)), (float)ef.ajfd("ajqi", ajfn(int ), (int)256), (float)ef.ajfd("ajqj", ajfn(int ), (int)257), nd.multAlpha(dz.color((int)ef.ajfd("ajqk", ajfa(int ), (int)258)), var4_4), (boolean)ef.ajfd("ajql", ajfa(int ), (int)259));
                if (var26_8 || var26_8) ** GOTO lbl6
                ki.rect(var1_1, var18_22, var19_23, (float)var21_25, (float)ef.ajfd("ajqm", ajfn(int ), (int)260), Math.min((float)ef.ajfd("ajqn", ajfn(int ), (int)261), (float)(var21_25 * ef.ajfd("ajqo", ajfn(int ), (int)262))), nd.multAlpha(dz.color((int)ef.ajfd("ajqp", ajfa(int ), (int)263)), var4_4), (boolean)ef.ajfd("ajqq", ajfa(int ), (int)264));
                if (var26_8) ** GOTO lbl6
lbl107:
                // 2 sources

                if (var26_8 || var26_8) ** GOTO lbl6
                if (!(this.animatedAbsorption > ef.ajfd("ajqr", ajfn(int ), (int)265))) ** GOTO lbl126
                if (var26_8) ** GOTO lbl6
                if (!(this.maxHealth > 0.0f)) ** GOTO lbl126
                if (var26_8 || var26_8) ** GOTO lbl6
                var22_26 = ef.ajfd("ajqs", ajfn(int ), (int)266) * class_3532.method_15363((float)(this.animatedAbsorption / this.maxHealth), (float)0.0f, (float)1.0f);
                if (var26_8 || var26_8) ** GOTO lbl6
                var23_27 = ef.ajfd("ajqt", ajfn(int ), (int)267) * class_3532.method_15363((float)((this.animatedBaseHealth + this.animatedAbsorption) / this.maxHealth), (float)0.0f, (float)1.0f);
                if (var26_8 || var26_8) ** GOTO lbl6
                var24_28 = Math.max(0.0f, (float)(var23_27 - var22_26));
                if (var26_8 || var26_8) ** GOTO lbl6
                var25_29 = Math.max(0.0f, (float)(var23_27 - var24_28));
                if (var26_8 || var26_8) ** GOTO lbl6
                if (!(var25_29 > ef.ajfd("ajqu", ajfn(int ), (int)268))) ** GOTO lbl126
                if (var26_8 || var26_8) ** GOTO lbl6
                ki.rect(var1_1, var18_22 + var24_28 - ef.ajfd("ajqv", ajfn(int ), (int)269), var19_23 - ef.ajfd("ajqw", ajfn(int ), (int)270), var25_29 + ef.ajfd("ajqx", ajfn(int ), (int)271), (float)ef.ajfd("ajqy", ajfn(int ), (int)272), (float)ef.ajfd("ajqz", ajfn(int ), (int)273), nd.multAlpha(nd.withAlpha(ef.ABSORPTION, (int)ef.ajfd("ajra", ajfa(int ), (int)274)), var4_4), (boolean)ef.ajfd("ajrb", ajfa(int ), (int)275));
                if (var26_8 || var26_8) ** GOTO lbl6
                ki.rect(var1_1, var18_22 + var24_28, var19_23, var25_29, (float)ef.ajfd("ajrc", ajfn(int ), (int)276), Math.min((float)ef.ajfd("ajrd", ajfn(int ), (int)277), var25_29 * ef.ajfd("ajre", ajfn(int ), (int)278)), nd.multAlpha(ef.ABSORPTION, var4_4), (boolean)ef.ajfd("ajrf", ajfa(int ), (int)279));
                if (var26_8) ** GOTO lbl6
lbl126:
                // 4 sources

                if (var26_8 || var26_8) ** GOTO lbl6
                this.drawPanelOutline(var1_1, var2_2, var3_3, (float)ef.ajfd("ajrg", ajfn(int ), (int)280), (float)ef.ajfd("ajrh", ajfn(int ), (int)281), (float)ef.ajfd("ajri", ajfn(int ), (int)282), (float)ef.ajfd("ajrj", ajfn(int ), (int)283), ef.BORDER, var4_4);
                if (!var26_8 && !var26_8) ** break;
                ** continue;
                return;
            }
lbl131:
            // 3 sources

            case 0: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrk", ajfa(int ), (int)284);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl136:
            // 2 sources

            case 1: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrl", ajfa(int ), (int)285);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 2: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrm", ajfa(int ), (int)286);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl497
            }
lbl146:
            // 2 sources

            case 3: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrn", ajfa(int ), (int)287);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl519
            }
lbl151:
            // 2 sources

            case 4: {
                var27_7 /* !! */  = (int)ef.ajfd("ajro", ajfa(int ), (int)288);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl480
            }
lbl156:
            // 2 sources

            case 5: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrp", ajfa(int ), (int)289);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl161:
            // 2 sources

            case 6: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrq", ajfa(int ), (int)290);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl166:
            // 2 sources

            case 7: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrr", ajfa(int ), (int)291);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl171:
            // 2 sources

            case 8: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrs", ajfa(int ), (int)292);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl501
            }
            case 9: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrt", ajfa(int ), (int)293);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl488
            }
lbl181:
            // 3 sources

            case 10: {
                var27_7 /* !! */  = (int)ef.ajfd("ajru", ajfa(int ), (int)294);
                if (!var28_6) ** GOTO lbl131
                throw null;
            }
            case 11: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrv", ajfa(int ), (int)295);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 12: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrw", ajfa(int ), (int)296);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl195:
            // 2 sources

            case 13: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrx", ajfa(int ), (int)297);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl200:
            // 2 sources

            case 14: {
                var27_7 /* !! */  = (int)ef.ajfd("ajry", ajfa(int ), (int)298);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl532
            }
lbl205:
            // 2 sources

            case 15: {
                var27_7 /* !! */  = (int)ef.ajfd("ajrz", ajfa(int ), (int)299);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 16: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsa", ajfa(int ), (int)300);
                if (!var28_6) ** GOTO lbl166
                throw null;
            }
            case 17: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsc", ajfa(int ), (int)301);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 18: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsd", ajfa(int ), (int)302);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 19: {
                var27_7 /* !! */  = (int)ef.ajfd("ajse", ajfa(int ), (int)303);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl229:
            // 3 sources

            case 20: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsg", ajfa(int ), (int)304);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl234:
            // 2 sources

            case 21: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsj", ajfa(int ), (int)305);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl239:
            // 2 sources

            case 22: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsl", ajfa(int ), (int)306);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl446
            }
            case 23: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsp", ajfa(int ), (int)307);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 24: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsq", ajfa(int ), (int)308);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 25: {
                var27_7 /* !! */  = (int)ef.ajfd("ajst", ajfa(int ), (int)309);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl540
            }
lbl259:
            // 3 sources

            case 26: {
                var27_7 /* !! */  = (int)ef.ajfd("ajsw", ajfa(int ), (int)310);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl264:
            // 4 sources

            case 27: {
                var27_7 /* !! */  = (int)ef.ajfd("ajta", ajfa(int ), (int)311);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl514
            }
lbl269:
            // 4 sources

            case 28: {
                var27_7 /* !! */  = (int)ef.ajfd("ajtd", ajfa(int ), (int)312);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 29: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzt", ajfa(int ), (int)313);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl279:
            // 2 sources

            case 30: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzu", ajfa(int ), (int)314);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl524
            }
lbl284:
            // 2 sources

            case 31: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzv", ajfa(int ), (int)315);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl577
            }
            case 32: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzw", ajfa(int ), (int)316);
                if (!var28_6) ** GOTO lbl205
                throw null;
            }
lbl293:
            // 2 sources

            case 33: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzx", ajfa(int ), (int)317);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl565
            }
lbl298:
            // 3 sources

            case 34: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzy", ajfa(int ), (int)318);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl303:
            // 3 sources

            case 35: {
                var27_7 /* !! */  = (int)ef.ajfd("ajzz", ajfa(int ), (int)319);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl472
            }
lbl308:
            // 2 sources

            case 36: {
                var27_7 /* !! */  = (int)ef.ajfd("akaa", ajfa(int ), (int)320);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl313:
            // 3 sources

            case 37: {
                do {
                    var27_7 /* !! */  = (int)ef.ajfd("akab", ajfa(int ), (int)321);
                } while (!var28_6);
                throw null;
            }
lbl318:
            // 2 sources

            case 38: {
                var27_7 /* !! */  = (int)ef.ajfd("akac", ajfa(int ), (int)322);
                if (!var28_6) ** GOTO lbl171
                throw null;
            }
lbl322:
            // 4 sources

            case 39: {
                var27_7 /* !! */  = (int)ef.ajfd("akad", ajfa(int ), (int)323);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl327:
            // 2 sources

            case 40: {
                var27_7 /* !! */  = (int)ef.ajfd("akae", ajfa(int ), (int)324);
                if (!var28_6) ** GOTO lbl322
                throw null;
            }
lbl331:
            // 2 sources

            case 41: {
                var27_7 /* !! */  = (int)ef.ajfd("akaf", ajfa(int ), (int)325);
                if (!var28_6) ** GOTO lbl131
                throw null;
            }
lbl335:
            // 2 sources

            case 42: {
                var27_7 /* !! */  = (int)ef.ajfd("akag", ajfa(int ), (int)326);
                if (!var28_6) ** GOTO lbl195
                throw null;
            }
            case 43: {
                var27_7 /* !! */  = (int)ef.ajfd("akah", ajfa(int ), (int)327);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl601
            }
lbl344:
            // 5 sources

            case 44: {
                var27_7 /* !! */  = (int)ef.ajfd("akai", ajfa(int ), (int)328);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl577
            }
lbl349:
            // 3 sources

            case 45: {
                var27_7 /* !! */  = (int)ef.ajfd("akaj", ajfa(int ), (int)329);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl549
            }
lbl354:
            // 2 sources

            case 46: {
                var27_7 /* !! */  = (int)ef.ajfd("akak", ajfa(int ), (int)330);
                if (!var28_6) ** GOTO lbl298
                throw null;
            }
lbl358:
            // 4 sources

            case 47: {
                var27_7 /* !! */  = (int)ef.ajfd("akal", ajfa(int ), (int)331);
                if (!var28_6) ** GOTO lbl303
                throw null;
            }
lbl362:
            // 4 sources

            case 48: {
                var27_7 /* !! */  = (int)ef.ajfd("akam", ajfa(int ), (int)332);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl367:
            // 3 sources

            case 49: {
                var27_7 /* !! */  = (int)ef.ajfd("akan", ajfa(int ), (int)333);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl544
            }
lbl372:
            // 4 sources

            case 50: {
                var27_7 /* !! */  = (int)ef.ajfd("akao", ajfa(int ), (int)334);
                if (!var28_6) ** GOTO lbl234
                throw null;
            }
lbl376:
            // 2 sources

            case 51: {
                var27_7 /* !! */  = (int)ef.ajfd("akap", ajfa(int ), (int)335);
                if (!var28_6) ** GOTO lbl156
                throw null;
            }
lbl380:
            // 3 sources

            case 52: {
                var27_7 /* !! */  = (int)ef.ajfd("akaq", ajfa(int ), (int)336);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl385:
            // 2 sources

            case 53: {
                var27_7 /* !! */  = (int)ef.ajfd("akar", ajfa(int ), (int)337);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl505
            }
            case 54: {
                var27_7 /* !! */  = (int)ef.ajfd("akas", ajfa(int ), (int)338);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl497
            }
            case 55: {
                var27_7 /* !! */  = (int)ef.ajfd("akat", ajfa(int ), (int)339);
                if (!var28_6) ** GOTO lbl136
                throw null;
            }
lbl399:
            // 3 sources

            case 56: {
                var27_7 /* !! */  = (int)ef.ajfd("akau", ajfa(int ), (int)340);
                if (!var28_6) ** GOTO lbl269
                throw null;
            }
            case 57: {
                var27_7 /* !! */  = (int)ef.ajfd("akav", ajfa(int ), (int)341);
                if (!var28_6) ** GOTO lbl344
                throw null;
            }
            case 58: {
                var27_7 /* !! */  = (int)ef.ajfd("akaw", ajfa(int ), (int)342);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl581
            }
            case 59: {
                var27_7 /* !! */  = (int)ef.ajfd("akax", ajfa(int ), (int)343);
                if (!var28_6) ** GOTO lbl161
                throw null;
            }
            case 60: {
                var27_7 /* !! */  = (int)ef.ajfd("akay", ajfa(int ), (int)344);
                if (!var28_6) ** GOTO lbl269
                throw null;
            }
lbl420:
            // 2 sources

            case 61: {
                var27_7 /* !! */  = (int)ef.ajfd("akaz", ajfa(int ), (int)345);
                if (!var28_6) ** GOTO lbl279
                throw null;
            }
            case 62: {
                var27_7 /* !! */  = (int)ef.ajfd("akba", ajfa(int ), (int)346);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl497
            }
            case 63: {
                var27_7 /* !! */  = (int)ef.ajfd("akbb", ajfa(int ), (int)347);
                if (!var28_6) ** GOTO lbl264
                throw null;
            }
lbl433:
            // 2 sources

            case 64: {
                var27_7 /* !! */  = (int)ef.ajfd("akbc", ajfa(int ), (int)348);
                if (!var28_6) ** GOTO lbl264
                throw null;
            }
            case 65: {
                var27_7 /* !! */  = (int)ef.ajfd("akbd", ajfa(int ), (int)349);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl557
            }
            case 66: {
                var27_7 /* !! */  = (int)ef.ajfd("akbe", ajfa(int ), (int)350);
                if (!var28_6) ** GOTO lbl313
                throw null;
            }
lbl446:
            // 3 sources

            case 67: {
                var27_7 /* !! */  = (int)ef.ajfd("akbf", ajfa(int ), (int)351);
                if (!var28_6) ** GOTO lbl318
                throw null;
            }
            case 68: {
                var27_7 /* !! */  = (int)ef.ajfd("akbg", ajfa(int ), (int)352);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl524
            }
lbl455:
            // 3 sources

            case 69: {
                var27_7 /* !! */  = (int)ef.ajfd("akbh", ajfa(int ), (int)353);
                if (!var28_6) ** GOTO lbl284
                throw null;
            }
            case 70: {
                var27_7 /* !! */  = (int)ef.ajfd("akbi", ajfa(int ), (int)354);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl609
            }
lbl464:
            // 2 sources

            case 71: {
                var27_7 /* !! */  = (int)ef.ajfd("akbj", ajfa(int ), (int)355);
                if (!var28_6) ** GOTO lbl181
                throw null;
            }
            case 72: {
                var27_7 /* !! */  = (int)ef.ajfd("akbk", ajfa(int ), (int)356);
                if (!var28_6) ** GOTO lbl298
                throw null;
            }
lbl472:
            // 2 sources

            case 73: {
                var27_7 /* !! */  = (int)ef.ajfd("akbl", ajfa(int ), (int)357);
                if (!var28_6) ** GOTO lbl229
                throw null;
            }
            case 74: {
                var27_7 /* !! */  = (int)ef.ajfd("akbm", ajfa(int ), (int)358);
                if (!var28_6) ** GOTO lbl362
                throw null;
            }
lbl480:
            // 2 sources

            case 75: {
                var27_7 /* !! */  = (int)ef.ajfd("akbn", ajfa(int ), (int)359);
                if (!var28_6) ** GOTO lbl229
                throw null;
            }
lbl484:
            // 3 sources

            case 76: {
                var27_7 /* !! */  = (int)ef.ajfd("akbo", ajfa(int ), (int)360);
                if (!var28_6) ** GOTO lbl335
                throw null;
            }
lbl488:
            // 2 sources

            case 77: {
                var27_7 /* !! */  = (int)ef.ajfd("akbp", ajfa(int ), (int)361);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl585
            }
lbl493:
            // 2 sources

            case 78: {
                var27_7 /* !! */  = (int)ef.ajfd("akbq", ajfa(int ), (int)362);
                if (!var28_6) ** GOTO lbl372
                throw null;
            }
lbl497:
            // 4 sources

            case 79: {
                var27_7 /* !! */  = (int)ef.ajfd("akbr", ajfa(int ), (int)363);
                if (!var28_6) ** GOTO lbl385
                throw null;
            }
lbl501:
            // 3 sources

            case 80: {
                var27_7 /* !! */  = (int)ef.ajfd("akbs", ajfa(int ), (int)364);
                if (!var28_6) ** GOTO lbl399
                throw null;
            }
lbl505:
            // 2 sources

            case 81: {
                var27_7 /* !! */  = (int)ef.ajfd("akbt", ajfa(int ), (int)365);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl514
            }
            case 82: {
                var27_7 /* !! */  = (int)ef.ajfd("akbu", ajfa(int ), (int)366);
                if (!var28_6) ** GOTO lbl344
                throw null;
            }
lbl514:
            // 4 sources

            case 83: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var27_7 /* !! */  = (int)ef.ajfd("akbv", ajfa(int ), (int)367);
                    if (!var28_6) ** GOTO lbl367
                    throw null;
                }
            }
lbl519:
            // 2 sources

            case 84: {
                var27_7 /* !! */  = (int)ef.ajfd("akbw", ajfa(int ), (int)368);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl605
            }
lbl524:
            // 3 sources

            case 85: {
                var27_7 /* !! */  = (int)ef.ajfd("akbx", ajfa(int ), (int)369);
                if (!var28_6) ** GOTO lbl322
                throw null;
            }
            case 86: {
                var27_7 /* !! */  = (int)ef.ajfd("akby", ajfa(int ), (int)370);
                if (!var28_6) ** GOTO lbl259
                throw null;
            }
lbl532:
            // 2 sources

            case 87: {
                var27_7 /* !! */  = (int)ef.ajfd("akbz", ajfa(int ), (int)371);
                if (!var28_6) ** GOTO lbl259
                throw null;
            }
            case 88: {
                var27_7 /* !! */  = (int)ef.ajfd("akca", ajfa(int ), (int)372);
                if (!var28_6) ** GOTO lbl344
                throw null;
            }
lbl540:
            // 2 sources

            case 89: {
                var27_7 /* !! */  = (int)ef.ajfd("akcb", ajfa(int ), (int)373);
                if (!var28_6) ** GOTO lbl313
                throw null;
            }
lbl544:
            // 2 sources

            case 90: {
                var27_7 /* !! */  = (int)ef.ajfd("akcc", ajfa(int ), (int)374);
                if (var28_6) {
                    throw null;
                }
                ** GOTO lbl601
            }
lbl549:
            // 2 sources

            case 91: {
                var27_7 /* !! */  = (int)ef.ajfd("akcd", ajfa(int ), (int)375);
                if (!var28_6) ** GOTO lbl269
                throw null;
            }
            case 92: {
                var27_7 /* !! */  = (int)ef.ajfd("akce", ajfa(int ), (int)376);
                if (!var28_6) ** GOTO lbl501
                throw null;
            }
lbl557:
            // 2 sources

            case 93: {
                var27_7 /* !! */  = (int)ef.ajfd("akcf", ajfa(int ), (int)377);
                if (!var28_6) ** GOTO lbl362
                throw null;
            }
            case 94: {
                var27_7 /* !! */  = (int)ef.ajfd("akcg", ajfa(int ), (int)378);
                if (!var28_6) ** GOTO lbl358
                throw null;
            }
lbl565:
            // 2 sources

            case 95: {
                var27_7 /* !! */  = (int)ef.ajfd("akch", ajfa(int ), (int)379);
                if (!var28_6) ** GOTO lbl446
                throw null;
            }
            case 96: {
                var27_7 /* !! */  = (int)ef.ajfd("akci", ajfa(int ), (int)380);
                if (!var28_6) ** GOTO lbl372
                throw null;
            }
            case 97: {
                var27_7 /* !! */  = (int)ef.ajfd("akcj", ajfa(int ), (int)381);
                if (!var28_6) ** GOTO lbl420
                throw null;
            }
lbl577:
            // 3 sources

            case 98: {
                var27_7 /* !! */  = (int)ef.ajfd("akck", ajfa(int ), (int)382);
                if (!var28_6) ** GOTO lbl327
                throw null;
            }
lbl581:
            // 2 sources

            case 99: {
                var27_7 /* !! */  = (int)ef.ajfd("akcl", ajfa(int ), (int)383);
                if (!var28_6) ** GOTO lbl151
                throw null;
            }
lbl585:
            // 2 sources

            case 100: {
                var27_7 /* !! */  = (int)ef.ajfd("akcm", ajfa(int ), (int)384);
                if (!var28_6) ** GOTO lbl146
                throw null;
            }
            case 101: {
                var27_7 /* !! */  = (int)ef.ajfd("akcn", ajfa(int ), (int)385);
                if (!var28_6) ** GOTO lbl200
                throw null;
            }
            case 102: {
                var27_7 /* !! */  = (int)ef.ajfd("akco", ajfa(int ), (int)386);
                if (!var28_6) ** GOTO lbl362
                throw null;
            }
            case 103: {
                var27_7 /* !! */  = (int)ef.ajfd("akcp", ajfa(int ), (int)387);
                if (!var28_6) ** GOTO lbl484
                throw null;
            }
lbl601:
            // 3 sources

            case 104: {
                var27_7 /* !! */  = (int)ef.ajfd("akcq", ajfa(int ), (int)388);
                if (!var28_6) ** GOTO lbl514
                throw null;
            }
lbl605:
            // 3 sources

            case 105: {
                var27_7 /* !! */  = (int)ef.ajfd("akcr", ajfa(int ), (int)389);
                if (!var28_6) ** GOTO lbl464
                throw null;
            }
lbl609:
            // 2 sources

            case 106: {
                var27_7 /* !! */  = (int)ef.ajfd("akcs", ajfa(int ), (int)390);
                if (!var28_6) ** GOTO lbl303
                throw null;
            }
            case 107: {
                var27_7 /* !! */  = (int)ef.ajfd("akct", ajfa(int ), (int)391);
                if (!var28_6) ** GOTO lbl605
                throw null;
            }
            case 108: 
        }
        var27_7 /* !! */  = (int)ef.ajfd("akcu", ajfa(int ), (int)392);
        ** while (!var28_6)
lbl620:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ancl() {
        ef.ajfb[100] = 1672649006;
        ef.ajfb[101] = 482593663;
        ef.ajfb[102] = -1344899446;
        ef.ajfb[103] = 9048452;
        ef.ajfb[104] = -1310178694;
        ef.ajfb[105] = 2062043692;
        ef.ajfb[106] = -1241991266;
        ef.ajfb[107] = 1406686733;
        ef.ajfb[108] = -2061360986;
        ef.ajfb[109] = -512808524;
        ef.ajfb[110] = 31280180;
        ef.ajfb[111] = 1194267513;
        ef.ajfb[112] = -271911784;
        ef.ajfb[113] = 2144354578;
        ef.ajfb[114] = 806165768;
        ef.ajfb[115] = 1772062472;
        ef.ajfb[116] = -256377042;
        ef.ajfb[117] = 1580199638;
        ef.ajfb[118] = -2015935807;
        ef.ajfb[119] = 1114897129;
        ef.ajfb[120] = -474407005;
        ef.ajfb[121] = -1853653313;
        ef.ajfb[122] = 1361477444;
        ef.ajfb[123] = -1414664630;
        ef.ajfb[124] = 1920279854;
        ef.ajfb[125] = 2122293024;
        ef.ajfb[126] = -612825990;
        ef.ajfb[127] = 1507025060;
        ef.ajfb[128] = 1530728623;
        ef.ajfb[129] = -1054977948;
        ef.ajfb[130] = -2069043571;
        ef.ajfb[131] = -1999124201;
        ef.ajfb[132] = -857124418;
        ef.ajfb[133] = -647164445;
        ef.ajfb[134] = 1553326790;
        ef.ajfb[135] = -1650289083;
        ef.ajfb[136] = -964673914;
        ef.ajfb[137] = 1277892861;
        ef.ajfb[138] = -898147870;
        ef.ajfb[139] = 561923833;
        ef.ajfb[140] = 2140491178;
        ef.ajfb[141] = 835395935;
        ef.ajfb[142] = 365406205;
        ef.ajfb[143] = 500723005;
        ef.ajfb[144] = -1086009368;
        ef.ajfb[145] = 1743436985;
        ef.ajfb[146] = -2108672410;
        ef.ajfb[147] = 1819031438;
        ef.ajfb[148] = -1683474167;
        ef.ajfb[149] = -1551539385;
        ef.ajfb[150] = 319813080;
        ef.ajfb[151] = -1082766382;
        ef.ajfb[152] = 249245123;
        ef.ajfb[153] = 1414520275;
        ef.ajfb[154] = 628889507;
        ef.ajfb[155] = -1070986681;
        ef.ajfb[156] = 1365895041;
        ef.ajfb[157] = -1358666147;
        ef.ajfb[158] = 974469221;
        ef.ajfb[159] = -997354334;
        ef.ajfb[160] = -259675803;
        ef.ajfb[161] = -868818198;
        ef.ajfb[162] = 1425595890;
        ef.ajfb[163] = -1200662624;
        ef.ajfb[164] = 1477346154;
        ef.ajfb[165] = -959711880;
        ef.ajfb[166] = 99673592;
        ef.ajfb[167] = 1076524537;
        ef.ajfb[168] = -1989206525;
        ef.ajfb[169] = 255327703;
        ef.ajfb[170] = 1626289626;
        ef.ajfb[171] = 420779620;
        ef.ajfb[172] = 1486748212;
        ef.ajfb[173] = -548322652;
        ef.ajfb[174] = 1674219633;
        ef.ajfb[175] = -1667320948;
        ef.ajfb[176] = 1730726787;
        ef.ajfb[177] = -1791637564;
        ef.ajfb[178] = 344502421;
        ef.ajfb[179] = -1839462863;
        ef.ajfb[180] = 897034088;
        ef.ajfb[181] = 1067836890;
        ef.ajfb[182] = -1148518472;
        ef.ajfb[183] = -780727167;
        ef.ajfb[184] = 412107696;
        ef.ajfb[185] = 1602355299;
        ef.ajfb[186] = 56312824;
        ef.ajfb[187] = -2100591553;
        ef.ajfb[188] = -956378247;
        ef.ajfb[189] = 855038722;
        ef.ajfb[190] = 201414200;
        ef.ajfb[191] = -1816261058;
        ef.ajfb[192] = 1442432563;
        ef.ajfb[193] = 1497013752;
        ef.ajfb[194] = -690495771;
        ef.ajfb[195] = 923335529;
        ef.ajfb[196] = 2101833580;
        ef.ajfb[197] = -28851911;
        ef.ajfb[198] = -398454783;
        ef.ajfb[199] = 728113984;
    }

    private static /* synthetic */ void anog() {
        ef.ajfc[700] = -613329332;
        ef.ajfc[701] = 272191585;
        ef.ajfc[702] = -829743488;
        ef.ajfc[703] = 1014532972;
        ef.ajfc[704] = -1889256230;
        ef.ajfc[705] = 484465867;
        ef.ajfc[706] = -1278575319;
        ef.ajfc[707] = 105294919;
        ef.ajfc[708] = -970751660;
        ef.ajfc[709] = 17413101;
        ef.ajfc[710] = -240503375;
        ef.ajfc[711] = 2042322054;
        ef.ajfc[712] = 290109109;
        ef.ajfc[713] = -470599213;
        ef.ajfc[714] = -1119300404;
        ef.ajfc[715] = 1494555134;
        ef.ajfc[716] = -24242413;
        ef.ajfc[717] = 923294480;
        ef.ajfc[718] = 805342276;
        ef.ajfc[719] = -431183236;
        ef.ajfc[720] = -1713147612;
        ef.ajfc[721] = 1265541247;
        ef.ajfc[722] = -1217758015;
        ef.ajfc[723] = -882083322;
        ef.ajfc[724] = -1754931403;
        ef.ajfc[725] = -1314356150;
        ef.ajfc[726] = -134373166;
        ef.ajfc[727] = 107784738;
        ef.ajfc[728] = 1382671361;
        ef.ajfc[729] = 263424304;
        ef.ajfc[730] = 1429429013;
        ef.ajfc[731] = -910904435;
        ef.ajfc[732] = 913213928;
        ef.ajfc[733] = -109588792;
        ef.ajfc[734] = 1375125823;
        ef.ajfc[735] = -2050846378;
        ef.ajfc[736] = 124462734;
        ef.ajfc[737] = 1784942876;
        ef.ajfc[738] = -1479433220;
        ef.ajfc[739] = -1177196098;
        ef.ajfc[740] = -368626370;
        ef.ajfc[741] = 1126765760;
        ef.ajfc[742] = -1217653058;
        ef.ajfc[743] = -2146225996;
        ef.ajfc[744] = -1353277774;
        ef.ajfc[745] = 2053286409;
        ef.ajfc[746] = -1828375541;
        ef.ajfc[747] = -1770582205;
        ef.ajfc[748] = -2067852671;
        ef.ajfc[749] = 586829387;
        ef.ajfc[750] = 575047193;
        ef.ajfc[751] = -329992077;
        ef.ajfc[752] = -1554315550;
        ef.ajfc[753] = 819497409;
        ef.ajfc[754] = 993680264;
        ef.ajfc[755] = 57001144;
        ef.ajfc[756] = 1429537824;
        ef.ajfc[757] = -1557868421;
        ef.ajfc[758] = -2119829152;
        ef.ajfc[759] = 1294182195;
        ef.ajfc[760] = -2015498526;
        ef.ajfc[761] = 198492109;
        ef.ajfc[762] = 2035483984;
        ef.ajfc[763] = -262048437;
        ef.ajfc[764] = 675946135;
        ef.ajfc[765] = -1066662116;
        ef.ajfc[766] = -518052887;
        ef.ajfc[767] = -2014927236;
        ef.ajfc[768] = -1212009248;
        ef.ajfc[769] = 969208881;
        ef.ajfc[770] = -632977985;
        ef.ajfc[771] = 34220440;
        ef.ajfc[772] = 537261881;
        ef.ajfc[773] = -122332194;
        ef.ajfc[774] = 553668360;
        ef.ajfc[775] = -1538264125;
        ef.ajfc[776] = 965975731;
        ef.ajfc[777] = -427787972;
        ef.ajfc[778] = -902868089;
        ef.ajfc[779] = -334014275;
        ef.ajfc[780] = -742933043;
        ef.ajfc[781] = -1649650182;
        ef.ajfc[782] = 166037811;
        ef.ajfc[783] = -1889932828;
        ef.ajfc[784] = -1604427877;
        ef.ajfc[785] = -53554695;
        ef.ajfc[786] = 29865907;
        ef.ajfc[787] = -746137052;
        ef.ajfc[788] = 59470586;
        ef.ajfc[789] = -817594437;
        ef.ajfc[790] = 1862597411;
        ef.ajfc[791] = 1786692455;
        ef.ajfc[792] = -52161291;
        ef.ajfc[793] = -508876558;
        ef.ajfc[794] = -510157462;
        ef.ajfc[795] = 1789364307;
        ef.ajfc[796] = -1732619796;
        ef.ajfc[797] = -596882258;
        ef.ajfc[798] = -1400932624;
        ef.ajfc[799] = -1129878301;
    }

    private static /* synthetic */ long ajgj(int n2) {
        return ajfh[n2] ^ ajfi[n2];
    }

    static {
        ajfb = new int[1165];
        ajfc = new int[1165];
        ef.anck();
        ef.ancl();
        ef.ancz();
        ef.anda();
        ef.andb();
        ef.andl();
        ef.anee();
        ef.anfe();
        ef.ange();
        ef.angw();
        ef.anhr();
        ef.anim();
        ef.aniq();
        ef.anjr();
        ef.ankp();
        ef.anlf();
        ef.anmc();
        ef.anmr();
        ef.annh();
        ef.anog();
        ef.anpb();
        ef.anpx();
        ef.anqp();
        ef.anqu();
        ajfh = new long[310];
        ajfi = new long[310];
        ef.anrt();
        ef.anrv();
        ef.anrx();
        ef.anrz();
        ef.ansb();
        ef.ansd();
        ef.ansg();
        ef.ansh();
        BLACK = nd.rgba((int)ef.ajfd("anbe", ajfa(int ), (int)1133), (int)ef.ajfd("anbf", ajfa(int ), (int)1134), (int)ef.ajfd("anbg", ajfa(int ), (int)1135), (int)ef.ajfd("anbh", ajfa(int ), (int)1136));
        BORDER = nd.rgba((int)ef.ajfd("anbi", ajfa(int ), (int)1137), (int)ef.ajfd("anbj", ajfa(int ), (int)1138), (int)ef.ajfd("anbk", ajfa(int ), (int)1139), (int)ef.ajfd("anbl", ajfa(int ), (int)1140));
        SUB_BORDER = nd.rgba((int)ef.ajfd("anbm", ajfa(int ), (int)1141), (int)ef.ajfd("anbn", ajfa(int ), (int)1142), (int)ef.ajfd("anbo", ajfa(int ), (int)1143), (int)ef.ajfd("anbp", ajfa(int ), (int)1144));
        TEXT = nd.rgba((int)ef.ajfd("anbq", ajfa(int ), (int)1145), (int)ef.ajfd("anbr", ajfa(int ), (int)1146), (int)ef.ajfd("anbs", ajfa(int ), (int)1147), (int)ef.ajfd("anbt", ajfa(int ), (int)1148));
        EMPTY = nd.rgba((int)ef.ajfd("anbu", ajfa(int ), (int)1149), (int)ef.ajfd("anbv", ajfa(int ), (int)1150), (int)ef.ajfd("anbw", ajfa(int ), (int)1151), (int)ef.ajfd("anbx", ajfa(int ), (int)1152));
        WARNING = nd.rgba((int)ef.ajfd("anby", ajfa(int ), (int)1153), (int)ef.ajfd("anbz", ajfa(int ), (int)1154), (int)ef.ajfd("anca", ajfa(int ), (int)1155), (int)ef.ajfd("ancb", ajfa(int ), (int)1156));
        DANGER = nd.rgba((int)ef.ajfd("ancc", ajfa(int ), (int)1157), (int)ef.ajfd("ancd", ajfa(int ), (int)1158), (int)ef.ajfd("ance", ajfa(int ), (int)1159), (int)ef.ajfd("ancf", ajfa(int ), (int)1160));
        ABSORPTION = nd.rgba((int)ef.ajfd("ancg", ajfa(int ), (int)1161), (int)ef.ajfd("anch", ajfa(int ), (int)1162), (int)ef.ajfd("anci", ajfa(int ), (int)1163), (int)ef.ajfd("ancj", ajfa(int ), (int)1164));
        ARMOR = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
        HANDS = new class_1304[]{class_1304.field_6173, class_1304.field_6171};
    }

    private static /* synthetic */ void anrx() {
        ef.ajfh[200] = 185324865900701561L;
        ef.ajfh[201] = -1831431137471199926L;
        ef.ajfh[202] = -5399745502898253545L;
        ef.ajfh[203] = -3844850003155538738L;
        ef.ajfh[204] = 3694323241382731367L;
        ef.ajfh[205] = 6860395860517350347L;
        ef.ajfh[206] = 314386716261268885L;
        ef.ajfh[207] = -8768786897254295961L;
        ef.ajfh[208] = 1509577644849968219L;
        ef.ajfh[209] = -7497773698987725525L;
        ef.ajfh[210] = 6612560222659141970L;
        ef.ajfh[211] = 1825450389397173001L;
        ef.ajfh[212] = -5999479209819411895L;
        ef.ajfh[213] = 7315499010625481110L;
        ef.ajfh[214] = 32271601250864379L;
        ef.ajfh[215] = -5465534435534358402L;
        ef.ajfh[216] = -8829930966497449030L;
        ef.ajfh[217] = 6459279914002452956L;
        ef.ajfh[218] = 7922165129801438201L;
        ef.ajfh[219] = 4630544765759139819L;
        ef.ajfh[220] = 7170187721986055110L;
        ef.ajfh[221] = -4014927205939649136L;
        ef.ajfh[222] = -13363988703970301L;
        ef.ajfh[223] = 247592565066659211L;
        ef.ajfh[224] = -1749295347380083613L;
        ef.ajfh[225] = -4625735173725852356L;
        ef.ajfh[226] = 1585393576071619153L;
        ef.ajfh[227] = 8229422841081369949L;
        ef.ajfh[228] = -6741361009292480722L;
        ef.ajfh[229] = -2616794744432003010L;
        ef.ajfh[230] = 6038209790104280198L;
        ef.ajfh[231] = -5086522471987112533L;
        ef.ajfh[232] = 8941215723041134917L;
        ef.ajfh[233] = -373668685459327359L;
        ef.ajfh[234] = -2703021717131388647L;
        ef.ajfh[235] = 1793285833127216504L;
        ef.ajfh[236] = -7210012740296784972L;
        ef.ajfh[237] = 616471514194144937L;
        ef.ajfh[238] = 5472648902979170681L;
        ef.ajfh[239] = 7389361887888059437L;
        ef.ajfh[240] = -5058574297649866365L;
        ef.ajfh[241] = 6058992938398838652L;
        ef.ajfh[242] = 2170108045140780891L;
        ef.ajfh[243] = -5495263741673903509L;
        ef.ajfh[244] = 458025375723656629L;
        ef.ajfh[245] = -7631977570231209779L;
        ef.ajfh[246] = 3253429076460206658L;
        ef.ajfh[247] = 8005664090370048802L;
        ef.ajfh[248] = 376021023641636583L;
        ef.ajfh[249] = -1264748475304746277L;
        ef.ajfh[250] = 3400668768704308366L;
        ef.ajfh[251] = 3629693592687303097L;
        ef.ajfh[252] = 1102103282278090652L;
        ef.ajfh[253] = 7725753553103867997L;
        ef.ajfh[254] = 6302020897878399716L;
        ef.ajfh[255] = -773425238594287144L;
        ef.ajfh[256] = -5205417755636185686L;
        ef.ajfh[257] = 5076491370888650575L;
        ef.ajfh[258] = -141387477511497388L;
        ef.ajfh[259] = -336918707427373834L;
        ef.ajfh[260] = -8191874258905697676L;
        ef.ajfh[261] = -2175067527967582144L;
        ef.ajfh[262] = -5545712239065049108L;
        ef.ajfh[263] = 3213138432482472936L;
        ef.ajfh[264] = -3379096371930945308L;
        ef.ajfh[265] = -4251383687883756784L;
        ef.ajfh[266] = -140573286944973209L;
        ef.ajfh[267] = -6813485055342240021L;
        ef.ajfh[268] = 3355984274266788093L;
        ef.ajfh[269] = 4288030787003069065L;
        ef.ajfh[270] = -6058391650920569177L;
        ef.ajfh[271] = 7813076885172213534L;
        ef.ajfh[272] = -5862843333095203192L;
        ef.ajfh[273] = -7565832629942164311L;
        ef.ajfh[274] = 7266788668160130517L;
        ef.ajfh[275] = -6102757678182649497L;
        ef.ajfh[276] = 2341028219832542724L;
        ef.ajfh[277] = 3625564758989830791L;
        ef.ajfh[278] = 7780553301535809305L;
        ef.ajfh[279] = 2180261116310535593L;
        ef.ajfh[280] = -4586571556234430077L;
        ef.ajfh[281] = 7679743778620295137L;
        ef.ajfh[282] = 1031801037837154519L;
        ef.ajfh[283] = 7384785043533474899L;
        ef.ajfh[284] = -4534628812732367606L;
        ef.ajfh[285] = 4388379499886114684L;
        ef.ajfh[286] = 2759414372003775537L;
        ef.ajfh[287] = 5068383888397530939L;
        ef.ajfh[288] = -2338930454341905157L;
        ef.ajfh[289] = -8951974979345069489L;
        ef.ajfh[290] = 5036439890212890459L;
        ef.ajfh[291] = 1902934907587495584L;
        ef.ajfh[292] = 6390531434673804089L;
        ef.ajfh[293] = -133319798495156212L;
        ef.ajfh[294] = 1726772069022776070L;
        ef.ajfh[295] = -7506873324440724395L;
        ef.ajfh[296] = -4678387846405817243L;
        ef.ajfh[297] = 4054323612151158398L;
        ef.ajfh[298] = 5965770956145182917L;
        ef.ajfh[299] = -7683929777727095556L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static void subPanel(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        boolean bl2;
        Object object = ca;
        block24: while (true) {
            switch ((int)object) {
                case -1872270231: {
                    break block24;
                }
                case 1031664657: {
                    object = ef.ajfd("amll", ajgj(int ), (int)176) - ef.ajfd("amlk", ajgj(int ), (int)175);
                    continue block24;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ca - ef.ajfd("amlm", ajgj(int ), (int)177)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ef.ajfd("amln", ajfa(int ), (int)858)) break;
            object2 = ef.ajfd("amlo", ajfa(int ), (int)859);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ca - ef.ajfd("amlp", ajgj(int ), (int)178)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ef.ajfd("amlq", ajfa(int ), (int)860)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = ef.ajfd("amlr", ajfa(int ), (int)861);
        }
        if (bl2 || bl2) return;
        CallSite callSite = ef.ajfd("amls", ajfa(int ), (int)862);
        Object object4 = ca;
        block27: while (true) {
            switch ((int)object4) {
                case -1872270231: {
                    break block27;
                }
                case 118544586: {
                    object4 = ef.ajfd("amlu", ajgj(int ), (int)180) - ef.ajfd("amlt", ajgj(int ), (int)179);
                    continue block27;
                }
            }
            break;
        }
        int n3 = dz.color((int)callSite);
        Object object5 = ca;
        boolean bl4 = true;
        block28: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object5 = callSite2 - ef.ajfd("amlv", ajgj(int ), (int)181);
            }
            switch ((int)object5) {
                case -1872270231: {
                    break block28;
                }
                case -1323316058: {
                    callSite2 = ef.ajfd("amlw", ajgj(int ), (int)182);
                    continue block28;
                }
                case 520592804: {
                    callSite2 = ef.ajfd("amlx", ajgj(int ), (int)183);
                    continue block28;
                }
            }
            break;
        }
        int n4 = nd.multAlpha(n3, f8);
        CallSite callSite3 = ef.ajfd("amly", ajfa(int ), (int)863);
        Object object6 = ca;
        boolean bl5 = true;
        block29: while (true) {
            CallSite callSite4;
            if (!bl5 || (bl5 = false) || !true) {
                object6 = callSite4 - ef.ajfd("amlz", ajgj(int ), (int)184);
            }
            switch ((int)object6) {
                case -1872270231: {
                    break block29;
                }
                case 634963751: {
                    callSite4 = ef.ajfd("amma", ajgj(int ), (int)185);
                    continue block29;
                }
                case 1636336788: {
                    callSite4 = ef.ajfd("ammb", ajgj(int ), (int)186);
                    continue block29;
                }
                case 1786262668: {
                    callSite4 = ef.ajfd("ammc", ajgj(int ), (int)187);
                    continue block29;
                }
            }
            break;
        }
        ki.rect(class_3322, f2, f3, f4, f5, f6, n4, (boolean)callSite3);
        if (bl2 || bl2) return;
        Object object7 = ca;
        boolean bl6 = true;
        block30: while (true) {
            CallSite callSite5;
            if (!bl6 || (bl6 = false) || !true) {
                object7 = callSite5 - ef.ajfd("ammd", ajgj(int ), (int)188);
            }
            switch ((int)object7) {
                case -1872270231: {
                    break block30;
                }
                case 1402389127: {
                    callSite5 = ef.ajfd("amme", ajgj(int ), (int)189);
                    continue block30;
                }
                case 1661324159: {
                    callSite5 = ef.ajfd("ammf", ajgj(int ), (int)190);
                    continue block30;
                }
            }
            break;
        }
        while (true) {
            long l4;
            Object object8;
            if ((object8 = (l4 = ca - ef.ajfd("ammg", ajgj(int ), (int)191)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object8 == ef.ajfd("ammh", ajfa(int ), (int)864)) break;
            object8 = ef.ajfd("ammi", ajfa(int ), (int)865);
        }
        int n5 = nd.multAlpha(SUB_BORDER, f8);
        CallSite callSite6 = ef.ajfd("ammj", ajfa(int ), (int)866);
        while (true) {
            long l5;
            Object object9;
            if ((object9 = (l5 = ca - ef.ajfd("ammk", ajgj(int ), (int)192)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object9 == ef.ajfd("amml", ajfa(int ), (int)867)) {
                ki.outline(class_3322, f2, f3, f4, f5, f6, f7, n5, (boolean)callSite6);
                if (bl2) return;
                break;
            }
            object9 = ef.ajfd("ammm", ajfa(int ), (int)868);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void anpx() {
        ef.ajfc[900] = -814127485;
        ef.ajfc[901] = 1072042678;
        ef.ajfc[902] = -874102124;
        ef.ajfc[903] = -815182797;
        ef.ajfc[904] = 150551848;
        ef.ajfc[905] = -2101817104;
        ef.ajfc[906] = 1178113514;
        ef.ajfc[907] = -577949758;
        ef.ajfc[908] = -1890124287;
        ef.ajfc[909] = 1425310957;
        ef.ajfc[910] = 226105245;
        ef.ajfc[911] = 1288952761;
        ef.ajfc[912] = -1714471793;
        ef.ajfc[913] = 97139452;
        ef.ajfc[914] = -628824380;
        ef.ajfc[915] = -1713230896;
        ef.ajfc[916] = 1140268968;
        ef.ajfc[917] = 1041240254;
        ef.ajfc[918] = 505717801;
        ef.ajfc[919] = 301559798;
        ef.ajfc[920] = -954906798;
        ef.ajfc[921] = -1313054701;
        ef.ajfc[922] = 1657593984;
        ef.ajfc[923] = 1991481559;
        ef.ajfc[924] = 96125541;
        ef.ajfc[925] = -491102852;
        ef.ajfc[926] = 1374040959;
        ef.ajfc[927] = 1242963425;
        ef.ajfc[928] = 888467410;
        ef.ajfc[929] = -512840803;
        ef.ajfc[930] = 1629732235;
        ef.ajfc[931] = -1315285505;
        ef.ajfc[932] = -722399721;
        ef.ajfc[933] = -122999120;
        ef.ajfc[934] = 517738559;
        ef.ajfc[935] = -1490280874;
        ef.ajfc[936] = -1160527321;
        ef.ajfc[937] = -2019439935;
        ef.ajfc[938] = 1093180818;
        ef.ajfc[939] = -552333889;
        ef.ajfc[940] = 756644239;
        ef.ajfc[941] = -1267835569;
        ef.ajfc[942] = -239174562;
        ef.ajfc[943] = 881459469;
        ef.ajfc[944] = 2034375795;
        ef.ajfc[945] = 1148010939;
        ef.ajfc[946] = 1503177395;
        ef.ajfc[947] = -30479092;
        ef.ajfc[948] = -1923046340;
        ef.ajfc[949] = 84441344;
        ef.ajfc[950] = -631453890;
        ef.ajfc[951] = 1292038559;
        ef.ajfc[952] = -1222448366;
        ef.ajfc[953] = -1268528193;
        ef.ajfc[954] = 1632334370;
        ef.ajfc[955] = 1648355255;
        ef.ajfc[956] = 659790612;
        ef.ajfc[957] = -1488548214;
        ef.ajfc[958] = 1486336179;
        ef.ajfc[959] = -581859329;
        ef.ajfc[960] = 1862529073;
        ef.ajfc[961] = 608702006;
        ef.ajfc[962] = -857798001;
        ef.ajfc[963] = 1716977184;
        ef.ajfc[964] = -256482951;
        ef.ajfc[965] = -538973734;
        ef.ajfc[966] = 940881397;
        ef.ajfc[967] = 1924935157;
        ef.ajfc[968] = -1976307103;
        ef.ajfc[969] = -725050562;
        ef.ajfc[970] = 1569419487;
        ef.ajfc[971] = 1245644918;
        ef.ajfc[972] = -1337395185;
        ef.ajfc[973] = 867156571;
        ef.ajfc[974] = 1750540716;
        ef.ajfc[975] = 1973213861;
        ef.ajfc[976] = -881078906;
        ef.ajfc[977] = 1443855234;
        ef.ajfc[978] = 1546570667;
        ef.ajfc[979] = 348517464;
        ef.ajfc[980] = 25650932;
        ef.ajfc[981] = 19035599;
        ef.ajfc[982] = 951042396;
        ef.ajfc[983] = -1948600716;
        ef.ajfc[984] = 1741493707;
        ef.ajfc[985] = 532467322;
        ef.ajfc[986] = -114262222;
        ef.ajfc[987] = -2060529573;
        ef.ajfc[988] = 115075888;
        ef.ajfc[989] = -1019322206;
        ef.ajfc[990] = -1188995943;
        ef.ajfc[991] = 1409805575;
        ef.ajfc[992] = 166530736;
        ef.ajfc[993] = 1727620514;
        ef.ajfc[994] = 1210837630;
        ef.ajfc[995] = 785229657;
        ef.ajfc[996] = -1881349947;
        ef.ajfc[997] = 1822110104;
        ef.ajfc[998] = -796655700;
        ef.ajfc[999] = -938989801;
    }

    private static /* synthetic */ void anck() {
        ef.ajfb[0] = -1659521257;
        ef.ajfb[1] = -701822263;
        ef.ajfb[2] = 675610509;
        ef.ajfb[3] = 408096804;
        ef.ajfb[4] = 1294040611;
        ef.ajfb[5] = -1736104346;
        ef.ajfb[6] = -1703123671;
        ef.ajfb[7] = -944969407;
        ef.ajfb[8] = 1275406119;
        ef.ajfb[9] = -888601560;
        ef.ajfb[10] = 1393622594;
        ef.ajfb[11] = 1694925421;
        ef.ajfb[12] = -1834332258;
        ef.ajfb[13] = -903746391;
        ef.ajfb[14] = 2136653446;
        ef.ajfb[15] = -1659799788;
        ef.ajfb[16] = -1296985607;
        ef.ajfb[17] = 719778521;
        ef.ajfb[18] = 2020097743;
        ef.ajfb[19] = -1395021033;
        ef.ajfb[20] = 1238402459;
        ef.ajfb[21] = 1862343272;
        ef.ajfb[22] = -881129861;
        ef.ajfb[23] = -1658402107;
        ef.ajfb[24] = -1509054476;
        ef.ajfb[25] = -1653661435;
        ef.ajfb[26] = -1603784474;
        ef.ajfb[27] = 1567051274;
        ef.ajfb[28] = 1443453326;
        ef.ajfb[29] = 931955113;
        ef.ajfb[30] = -1762616556;
        ef.ajfb[31] = 403227841;
        ef.ajfb[32] = -1619147017;
        ef.ajfb[33] = -805677859;
        ef.ajfb[34] = 1898359026;
        ef.ajfb[35] = -346601071;
        ef.ajfb[36] = 173410732;
        ef.ajfb[37] = 2033735627;
        ef.ajfb[38] = 1008477182;
        ef.ajfb[39] = -877816176;
        ef.ajfb[40] = 1993639019;
        ef.ajfb[41] = 1017230363;
        ef.ajfb[42] = -1184705153;
        ef.ajfb[43] = -1550641372;
        ef.ajfb[44] = 1054957477;
        ef.ajfb[45] = 790958045;
        ef.ajfb[46] = 302228575;
        ef.ajfb[47] = 1812863641;
        ef.ajfb[48] = -1289090368;
        ef.ajfb[49] = 39275857;
        ef.ajfb[50] = 1390242456;
        ef.ajfb[51] = -3398372;
        ef.ajfb[52] = -1724211669;
        ef.ajfb[53] = -1019177292;
        ef.ajfb[54] = -1449200148;
        ef.ajfb[55] = -2130431252;
        ef.ajfb[56] = -704468793;
        ef.ajfb[57] = 443502410;
        ef.ajfb[58] = -365046136;
        ef.ajfb[59] = 157159245;
        ef.ajfb[60] = -891985234;
        ef.ajfb[61] = 1333639173;
        ef.ajfb[62] = 2043794809;
        ef.ajfb[63] = 352864072;
        ef.ajfb[64] = 1939357573;
        ef.ajfb[65] = 535398728;
        ef.ajfb[66] = -440016841;
        ef.ajfb[67] = 1155529007;
        ef.ajfb[68] = 1679508856;
        ef.ajfb[69] = 1231564481;
        ef.ajfb[70] = -1311913499;
        ef.ajfb[71] = -1453766027;
        ef.ajfb[72] = -824975607;
        ef.ajfb[73] = -2021798018;
        ef.ajfb[74] = -2095519947;
        ef.ajfb[75] = -500952708;
        ef.ajfb[76] = 2050851734;
        ef.ajfb[77] = 803695091;
        ef.ajfb[78] = 204574402;
        ef.ajfb[79] = 49005168;
        ef.ajfb[80] = 1220761918;
        ef.ajfb[81] = -641569140;
        ef.ajfb[82] = 44988124;
        ef.ajfb[83] = 1689272697;
        ef.ajfb[84] = 904714414;
        ef.ajfb[85] = 412214041;
        ef.ajfb[86] = 947706139;
        ef.ajfb[87] = -323845892;
        ef.ajfb[88] = 1089682524;
        ef.ajfb[89] = -934239362;
        ef.ajfb[90] = 1183944942;
        ef.ajfb[91] = 303461615;
        ef.ajfb[92] = -992077328;
        ef.ajfb[93] = 395750715;
        ef.ajfb[94] = -971211024;
        ef.ajfb[95] = 17211167;
        ef.ajfb[96] = 1844867545;
        ef.ajfb[97] = -1002583516;
        ef.ajfb[98] = -185828623;
        ef.ajfb[99] = -1538149955;
    }

    private static /* synthetic */ void anmc() {
        ef.ajfc[400] = -161023324;
        ef.ajfc[401] = -490834888;
        ef.ajfc[402] = 924809133;
        ef.ajfc[403] = -1971707768;
        ef.ajfc[404] = -1648465696;
        ef.ajfc[405] = 1521510050;
        ef.ajfc[406] = -826059676;
        ef.ajfc[407] = -1003760096;
        ef.ajfc[408] = 408901920;
        ef.ajfc[409] = 1591327770;
        ef.ajfc[410] = 877676681;
        ef.ajfc[411] = -312978492;
        ef.ajfc[412] = 715330366;
        ef.ajfc[413] = -565122999;
        ef.ajfc[414] = -1250273430;
        ef.ajfc[415] = 2016939295;
        ef.ajfc[416] = 2054604808;
        ef.ajfc[417] = 1732056839;
        ef.ajfc[418] = -714762525;
        ef.ajfc[419] = 480277310;
        ef.ajfc[420] = -133071716;
        ef.ajfc[421] = -949615053;
        ef.ajfc[422] = 1378580915;
        ef.ajfc[423] = -1025703363;
        ef.ajfc[424] = -376950869;
        ef.ajfc[425] = 910568034;
        ef.ajfc[426] = -748623431;
        ef.ajfc[427] = -1290999695;
        ef.ajfc[428] = -2074935646;
        ef.ajfc[429] = -44408072;
        ef.ajfc[430] = -1974619721;
        ef.ajfc[431] = 242296544;
        ef.ajfc[432] = 1202269963;
        ef.ajfc[433] = 32625081;
        ef.ajfc[434] = -1349894311;
        ef.ajfc[435] = 1536673011;
        ef.ajfc[436] = 1028254260;
        ef.ajfc[437] = -429189217;
        ef.ajfc[438] = -1708588682;
        ef.ajfc[439] = 1817840490;
        ef.ajfc[440] = 1236095669;
        ef.ajfc[441] = 1508333635;
        ef.ajfc[442] = -490333341;
        ef.ajfc[443] = -1447910670;
        ef.ajfc[444] = 518274034;
        ef.ajfc[445] = -769711581;
        ef.ajfc[446] = -2121871593;
        ef.ajfc[447] = 910521146;
        ef.ajfc[448] = 904052273;
        ef.ajfc[449] = 385123606;
        ef.ajfc[450] = -624806280;
        ef.ajfc[451] = -1840893312;
        ef.ajfc[452] = 854561704;
        ef.ajfc[453] = -2072323841;
        ef.ajfc[454] = -603472364;
        ef.ajfc[455] = 1923626894;
        ef.ajfc[456] = -211855542;
        ef.ajfc[457] = -1015591022;
        ef.ajfc[458] = -451972246;
        ef.ajfc[459] = 380395552;
        ef.ajfc[460] = 1556918870;
        ef.ajfc[461] = 894487575;
        ef.ajfc[462] = -1905325024;
        ef.ajfc[463] = 330523403;
        ef.ajfc[464] = -842001119;
        ef.ajfc[465] = 633220959;
        ef.ajfc[466] = 42175442;
        ef.ajfc[467] = -926828630;
        ef.ajfc[468] = -1496273574;
        ef.ajfc[469] = -1471723898;
        ef.ajfc[470] = -255365080;
        ef.ajfc[471] = 1488728346;
        ef.ajfc[472] = 515260187;
        ef.ajfc[473] = 1449074842;
        ef.ajfc[474] = -230746892;
        ef.ajfc[475] = 389948478;
        ef.ajfc[476] = -1762770173;
        ef.ajfc[477] = -1446256507;
        ef.ajfc[478] = -82793421;
        ef.ajfc[479] = 1651798465;
        ef.ajfc[480] = 1467778530;
        ef.ajfc[481] = 234085177;
        ef.ajfc[482] = -244526551;
        ef.ajfc[483] = -1569918614;
        ef.ajfc[484] = 1739150204;
        ef.ajfc[485] = 18998569;
        ef.ajfc[486] = 875151306;
        ef.ajfc[487] = 882949812;
        ef.ajfc[488] = 153160076;
        ef.ajfc[489] = -558071046;
        ef.ajfc[490] = 1207222108;
        ef.ajfc[491] = 1476278941;
        ef.ajfc[492] = -1119135989;
        ef.ajfc[493] = -755830406;
        ef.ajfc[494] = -99367079;
        ef.ajfc[495] = 1823528638;
        ef.ajfc[496] = 2084613041;
        ef.ajfc[497] = 152975568;
        ef.ajfc[498] = 585850777;
        ef.ajfc[499] = -2009989733;
    }

    private static /* synthetic */ void ansd() {
        ef.ajfi[100] = -358570406576264702L;
        ef.ajfi[101] = 3032896132268508667L;
        ef.ajfi[102] = -3430956919483951310L;
        ef.ajfi[103] = -5680049121184959262L;
        ef.ajfi[104] = -7953104322044300678L;
        ef.ajfi[105] = 6915799799347313778L;
        ef.ajfi[106] = -3909052994410124677L;
        ef.ajfi[107] = 6172716576296248776L;
        ef.ajfi[108] = -165173091121583753L;
        ef.ajfi[109] = 7222728981108877239L;
        ef.ajfi[110] = 2267080671467590082L;
        ef.ajfi[111] = 1301560257561884765L;
        ef.ajfi[112] = -3873661457964293224L;
        ef.ajfi[113] = 985237625919775288L;
        ef.ajfi[114] = -7821156132742805014L;
        ef.ajfi[115] = -5809870367584639139L;
        ef.ajfi[116] = 141310114467591228L;
        ef.ajfi[117] = 171326730993020956L;
        ef.ajfi[118] = 2332567353648821217L;
        ef.ajfi[119] = -4955717203786456350L;
        ef.ajfi[120] = -7424088724624392834L;
        ef.ajfi[121] = -2349522220421714091L;
        ef.ajfi[122] = -121645549286710573L;
        ef.ajfi[123] = -1109797228479295963L;
        ef.ajfi[124] = 783448625214550681L;
        ef.ajfi[125] = -8813038004789670683L;
        ef.ajfi[126] = 8845747113049779621L;
        ef.ajfi[127] = -4239559027601502807L;
        ef.ajfi[128] = 462182718484130576L;
        ef.ajfi[129] = -7175682671656078259L;
        ef.ajfi[130] = -1545507577324124677L;
        ef.ajfi[131] = -1788768135339243481L;
        ef.ajfi[132] = 2041834080444719154L;
        ef.ajfi[133] = -2240373988239422004L;
        ef.ajfi[134] = -8681517884272501968L;
        ef.ajfi[135] = -5014953314490974742L;
        ef.ajfi[136] = 9201143455550101003L;
        ef.ajfi[137] = 6166962758447246660L;
        ef.ajfi[138] = 436337991502384972L;
        ef.ajfi[139] = -2654161838714177770L;
        ef.ajfi[140] = 1452358152875953894L;
        ef.ajfi[141] = 62455467661965635L;
        ef.ajfi[142] = -4158730987665584083L;
        ef.ajfi[143] = -8948064141981092019L;
        ef.ajfi[144] = 8396776080072657136L;
        ef.ajfi[145] = 974827954419440346L;
        ef.ajfi[146] = -6713269452201327964L;
        ef.ajfi[147] = -4138085386745674482L;
        ef.ajfi[148] = -6879577323321753951L;
        ef.ajfi[149] = 8443522029304652044L;
        ef.ajfi[150] = -6995197739428053594L;
        ef.ajfi[151] = 2116590447516134290L;
        ef.ajfi[152] = -5961195527601442025L;
        ef.ajfi[153] = 4774276498575071586L;
        ef.ajfi[154] = 899895481142383524L;
        ef.ajfi[155] = -6704264113705581956L;
        ef.ajfi[156] = 3942582748777031188L;
        ef.ajfi[157] = 8192868740871280523L;
        ef.ajfi[158] = 2022348430142955314L;
        ef.ajfi[159] = 4034843334565753646L;
        ef.ajfi[160] = -9144701634579712386L;
        ef.ajfi[161] = 4012624347123177078L;
        ef.ajfi[162] = -8900987629532203727L;
        ef.ajfi[163] = -8564004823598433915L;
        ef.ajfi[164] = -8692953729298075266L;
        ef.ajfi[165] = -91266935694228879L;
        ef.ajfi[166] = -3242417436905932262L;
        ef.ajfi[167] = -3976048720109297301L;
        ef.ajfi[168] = 7304932577583773774L;
        ef.ajfi[169] = 6066384581293767471L;
        ef.ajfi[170] = -7738110013750638579L;
        ef.ajfi[171] = -461685105974659854L;
        ef.ajfi[172] = 5458874789346159461L;
        ef.ajfi[173] = -6258898882232033211L;
        ef.ajfi[174] = -422277601922909263L;
        ef.ajfi[175] = 6168069251006616282L;
        ef.ajfi[176] = 8581469390078273113L;
        ef.ajfi[177] = -5157163335896367960L;
        ef.ajfi[178] = 4001767038545886671L;
        ef.ajfi[179] = 8121265239207008346L;
        ef.ajfi[180] = 7361069615255518244L;
        ef.ajfi[181] = -8230657645606904040L;
        ef.ajfi[182] = 9153514675496913427L;
        ef.ajfi[183] = 3033857791071265416L;
        ef.ajfi[184] = 8924451601805068189L;
        ef.ajfi[185] = -6029327918501830130L;
        ef.ajfi[186] = 1846801994556884835L;
        ef.ajfi[187] = 1970506838100132258L;
        ef.ajfi[188] = 7680989720427824200L;
        ef.ajfi[189] = -1632122142318503346L;
        ef.ajfi[190] = -345958416016581684L;
        ef.ajfi[191] = -774488283775136872L;
        ef.ajfi[192] = 2970084493680111465L;
        ef.ajfi[193] = -8474162251220370820L;
        ef.ajfi[194] = -2994380335762688472L;
        ef.ajfi[195] = -305871383880873125L;
        ef.ajfi[196] = -4165404771721215881L;
        ef.ajfi[197] = -6852142706897840708L;
        ef.ajfi[198] = 2290331304638514437L;
        ef.ajfi[199] = -3322387040353024209L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean visible() {
        v0 /* !! */  = ef.ca;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(ef.ajfd("ajgz", ajgj(int ), (int)11) - ef.ajfd("ajgy", ajgj(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1872270231: {
                    break block35;
                }
                case 510757429: {
                    continue block35;
                }
            }
            break;
        }
        var3_1 = ef.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("ajha", ajgj(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ef.ajfd("ajhb", ajfa(int ), (int)31)) break;
            v1 /* !! */  = (long)ef.ajfd("ajhc", ajfa(int ), (int)32);
        }
        var2_2 /* !! */  = ef.b;
        v2 /* !! */  = ef.ca;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - ef.ajfd("ajhd", ajgj(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2115701668: {
                    v3 = ef.ajfd("ajhe", ajgj(int ), (int)14);
                    continue block37;
                }
                case -1872270231: {
                    break block37;
                }
                case -946407077: {
                    v3 = ef.ajfd("ajhf", ajgj(int ), (int)15);
                    continue block37;
                }
                case 1428861245: {
                    v3 = ef.ajfd("ajhg", ajgj(int ), (int)16);
                    continue block37;
                }
            }
            break;
        }
        var1_3 = ef.a;
        if (var3_1) {
            throw null;
lbl37:
            // 7 sources

            return (boolean)ef.ajfd("ajhh", ajfa(int ), (int)33);
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        v4 /* !! */  = ef.ca;
        if (true) ** GOTO lbl44
        block39: while (true) {
            v4 /* !! */  = (long)(v5 - ef.ajfd("ajhi", ajgj(int ), (int)17));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1872270231: {
                    break block39;
                }
                case 68986304: {
                    v5 = ef.ajfd("ajhj", ajgj(int ), (int)18);
                    continue block39;
                }
                case 129308129: {
                    v5 = ef.ajfd("ajhk", ajgj(int ), (int)19);
                    continue block39;
                }
                case 1017129974: {
                    v5 = ef.ajfd("ajhl", ajgj(int ), (int)20);
                    continue block39;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("ajhm", ajgj(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ef.ajfd("ajhn", ajfa(int ), (int)34)) break;
            v6 /* !! */  = (long)ef.ajfd("ajho", ajfa(int ), (int)35);
        }
        if (this.mc.field_1724 == null) ** GOTO lbl105
        if (var1_3) ** GOTO lbl37
        v7 /* !! */  = ef.ca;
        if (true) ** GOTO lbl68
        block41: while (true) {
            v7 /* !! */  = (long)(ef.ajfd("ajhq", ajgj(int ), (int)23) - ef.ajfd("ajhp", ajgj(int ), (int)22));
lbl68:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1872270231: {
                    break block41;
                }
                case 447482634: {
                    continue block41;
                }
            }
            break;
        }
        if (this.currentTarget() != null) ** GOTO lbl100
        if (var1_3) ** GOTO lbl37
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("ajhr", ajgj(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ef.ajfd("ajhs", ajfa(int ), (int)36)) break;
            v8 /* !! */  = (long)ef.ajfd("ajht", ajfa(int ), (int)37);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("ajhu", ajgj(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == ef.ajfd("ajhv", ajfa(int ), (int)38)) break;
            v9 /* !! */  = (long)ef.ajfd("ajhw", ajfa(int ), (int)39);
        }
        if (this.mc.field_1755 instanceof class_408) ** GOTO lbl100
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("ajhx", ajgj(int ), (int)26)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ef.ajfd("ajhy", ajfa(int ), (int)40)) break;
                    v10 /* !! */  = (long)ef.ajfd("ajhz", ajfa(int ), (int)41);
                }
                if (!(this.visibility > ef.ajfd("ajia", ajfn(int ), (int)42))) ** GOTO lbl105
                if (var1_3) ** GOTO lbl37
lbl100:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                v11 = ef.ajfd("ajib", ajfa(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
lbl105:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v11 = ef.ajfd("ajic", ajfa(int ), (int)44);
lbl108:
                // 2 sources

                return (boolean)v11;
            }
lbl109:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ef.ajfd("ajid", ajfa(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl114:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ef.ajfd("ajie", ajfa(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl119:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ef.ajfd("ajif", ajfa(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ef.ajfd("ajig", ajfa(int ), (int)48);
                    if (!var3_1) ** GOTO lbl114
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ef.ajfd("ajih", ajfa(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl134:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)ef.ajfd("ajii", ajfa(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 6: {
                var2_2 /* !! */  = (int)ef.ajfd("ajij", ajfa(int ), (int)51);
                if (var3_1) {
                    throw null;
                }
            }
lbl143:
            // 5 sources

            case 7: {
                var2_2 /* !! */  = (int)ef.ajfd("ajik", ajfa(int ), (int)52);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
lbl147:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ef.ajfd("ajil", ajfa(int ), (int)53);
                if (!var3_1) ** GOTO lbl143
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ef.ajfd("ajim", ajfa(int ), (int)54);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
lbl155:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ef.ajfd("ajin", ajfa(int ), (int)55);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
lbl159:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ef.ajfd("ajio", ajfa(int ), (int)56);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)ef.ajfd("ajip", ajfa(int ), (int)57);
        ** while (!var3_1)
lbl166:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void spawnHeadParticles(float var1_1, float var2_2, int var3_3) {
        block119: {
            v0 /* !! */  = ef.ca;
            if (true) ** GOTO lbl5
            block76: while (true) {
                v0 /* !! */  = (long)(ef.ajfd("akfq", ajgj(int ), (int)55) - ef.ajfd("akfp", ajgj(int ), (int)54));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1872270231: {
                        break block76;
                    }
                    case -620541609: {
                        continue block76;
                    }
                }
                break;
            }
            var9_4 = ef.c;
            v1 /* !! */  = ef.ca;
            if (true) ** GOTO lbl15
            block77: while (true) {
                v1 /* !! */  = (long)(ef.ajfd("akfs", ajgj(int ), (int)57) - ef.ajfd("akfr", ajgj(int ), (int)56));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1872270231: {
                        break block77;
                    }
                    case -1276119631: {
                        continue block77;
                    }
                }
                break;
            }
            var8_5 /* !! */  = ef.b;
            v2 /* !! */  = ef.ca;
            if (true) ** GOTO lbl25
            block78: while (true) {
                v2 /* !! */  = (long)(v3 - ef.ajfd("akft", ajgj(int ), (int)58));
lbl25:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1872270231: {
                        break block78;
                    }
                    case -1779217151: {
                        v3 = ef.ajfd("akfu", ajgj(int ), (int)59);
                        continue block78;
                    }
                    case 1631741894: {
                        v3 = ef.ajfd("akfv", ajgj(int ), (int)60);
                        continue block78;
                    }
                    case 1741087418: {
                        v3 = ef.ajfd("akfw", ajgj(int ), (int)61);
                        continue block78;
                    }
                }
                break;
            }
            var7_6 = ef.a;
            if (var9_4) {
                throw null;
lbl40:
                // 12 sources

                return;
            }
            if (var7_6 || var7_6) ** GOTO lbl40
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("akfx", ajgj(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ef.ajfd("akfy", ajfa(int ), (int)440)) break;
                v4 /* !! */  = (long)ef.ajfd("akfz", ajfa(int ), (int)441);
            }
            var4_7 = ThreadLocalRandom.current();
            if (var7_6 || var7_6) ** GOTO lbl40
            v5 /* !! */  = ef.ca;
            if (true) ** GOTO lbl54
            block81: while (true) {
                v5 /* !! */  = (long)(v6 - ef.ajfd("akga", ajgj(int ), (int)63));
lbl54:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1872270231: {
                        break block81;
                    }
                    case -438134737: {
                        v6 = ef.ajfd("akgb", ajgj(int ), (int)64);
                        continue block81;
                    }
                    case 1925229287: {
                        v6 = ef.ajfd("akgc", ajgj(int ), (int)65);
                        continue block81;
                    }
                }
                break;
            }
            v7 /* !! */  = ef.ca;
            if (true) ** GOTO lbl67
            block82: while (true) {
                v7 /* !! */  = (long)(v8 - ef.ajfd("akgd", ajgj(int ), (int)66));
lbl67:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1872270231: {
                        break block82;
                    }
                    case -1406410531: {
                        v8 = ef.ajfd("akge", ajgj(int ), (int)67);
                        continue block82;
                    }
                    case 980717003: {
                        v8 = ef.ajfd("akgf", ajgj(int ), (int)68);
                        continue block82;
                    }
                }
                break;
            }
            var5_8 = this.headParticles.size() + var3_3 - ef.ajfd("akgg", ajfa(int ), (int)442);
            if (var7_6 || var7_6) ** GOTO lbl40
            if (var5_8 <= 0) break block119;
            if (var7_6 || var7_6) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("akgh", ajgj(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == ef.ajfd("akgi", ajfa(int ), (int)443)) break;
                v9 /* !! */  = (long)ef.ajfd("akgj", ajfa(int ), (int)444);
            }
            v10 = ef.ajfd("akgk", ajfa(int ), (int)445);
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("akgl", ajgj(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ef.ajfd("akgm", ajfa(int ), (int)446)) break;
                v11 /* !! */  = (long)ef.ajfd("akgn", ajfa(int ), (int)447);
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("akgo", ajgj(int ), (int)71)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ef.ajfd("akgp", ajfa(int ), (int)448)) break;
                v12 /* !! */  = (long)ef.ajfd("akgq", ajfa(int ), (int)449);
            }
            v13 = this.headParticles.size();
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("akgr", ajgj(int ), (int)72)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == ef.ajfd("akgs", ajfa(int ), (int)450)) break;
                v14 /* !! */  = (long)ef.ajfd("akgt", ajfa(int ), (int)451);
            }
            v15 = Math.min(var5_8, v13);
            v16 /* !! */  = ef.ca;
            if (true) ** GOTO lbl107
            block87: while (true) {
                v16 /* !! */  = (long)(ef.ajfd("akgv", ajgj(int ), (int)74) - ef.ajfd("akgu", ajgj(int ), (int)73));
lbl107:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1872270231: {
                        break block87;
                    }
                    case 763194976: {
                        continue block87;
                    }
                }
                break;
            }
            v17 = this.headParticles.subList((int)v10, v15);
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("akgw", ajgj(int ), (int)75)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == ef.ajfd("akgx", ajfa(int ), (int)452)) break;
                v18 /* !! */  = (long)ef.ajfd("akgy", ajfa(int ), (int)453);
            }
            v17.clear();
            if (var7_6) ** GOTO lbl40
        }
        if (var7_6 || var7_6) ** GOTO lbl40
        var6_9 = ef.ajfd("akgz", ajfa(int ), (int)454);
        if (var7_6) ** GOTO lbl40
        block89: while (true) {
            if (var7_6 || var7_6) ** GOTO lbl40
            if (var6_9 >= var3_3) ** GOTO lbl219
            if (var7_6 || var7_6) ** GOTO lbl40
            v19 /* !! */  = ef.ca;
            if (true) ** GOTO lbl132
            block90: while (true) {
                v19 /* !! */  = (long)(v20 - ef.ajfd("akha", ajgj(int ), (int)76));
lbl132:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1872270231: {
                        break block90;
                    }
                    case -1070784285: {
                        v20 = ef.ajfd("akhb", ajgj(int ), (int)77);
                        continue block90;
                    }
                    case -499201532: {
                        v20 = ef.ajfd("akhc", ajgj(int ), (int)78);
                        continue block90;
                    }
                    case -372745833: {
                        v20 = ef.ajfd("akhd", ajgj(int ), (int)79);
                        continue block90;
                    }
                }
                break;
            }
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("akhe", ajgj(int ), (int)80)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == ef.ajfd("akhf", ajfa(int ), (int)455)) break;
                v21 /* !! */  = (long)ef.ajfd("akhg", ajfa(int ), (int)456);
            }
            v22 = ef.ajfd("akhh", ajfg(int ), (int)81);
            v23 = ef.ajfd("akhi", ajfg(int ), (int)82);
            v24 /* !! */  = ef.ca;
            if (true) ** GOTO lbl155
            block92: while (true) {
                v24 /* !! */  = (long)(v25 - ef.ajfd("akhj", ajgj(int ), (int)83));
lbl155:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1960242450: {
                        v25 = ef.ajfd("akhk", ajgj(int ), (int)84);
                        continue block92;
                    }
                    case -1872270231: {
                        break block92;
                    }
                    case -1476065886: {
                        v25 = ef.ajfd("akhl", ajgj(int ), (int)85);
                        continue block92;
                    }
                    case 1301557699: {
                        v25 = ef.ajfd("akhm", ajgj(int ), (int)86);
                        continue block92;
                    }
                }
                break;
            }
            v26 = var1_1 + (float)var4_7.nextDouble((double)v22, (double)v23) / ef.ajfd("akhn", ajfn(int ), (int)457);
            v27 = ef.ajfd("akho", ajfg(int ), (int)87);
            v28 = ef.ajfd("akhp", ajfg(int ), (int)88);
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_7 = ef.ca - ef.ajfd("akhq", ajgj(int ), (int)89)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == ef.ajfd("akhr", ajfa(int ), (int)458)) break;
                v29 /* !! */  = (long)ef.ajfd("akhs", ajfa(int ), (int)459);
            }
            v30 = var2_2 + (float)var4_7.nextDouble((double)v27, (double)v28) / ef.ajfd("akht", ajfn(int ), (int)460);
            v31 = ef.ajfd("akhu", ajfg(int ), (int)90);
            v32 = ef.ajfd("akhv", ajfg(int ), (int)91);
            v33 /* !! */  = ef.ca;
            if (true) ** GOTO lbl182
            block94: while (true) {
                v33 /* !! */  = (long)(ef.ajfd("akhx", ajgj(int ), (int)93) - ef.ajfd("akhw", ajgj(int ), (int)92));
lbl182:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case -1872270231: {
                        break block94;
                    }
                    case 1844316203: {
                        continue block94;
                    }
                }
                break;
            }
            v34 = (float)var4_7.nextDouble((double)v31, (double)v32);
            v35 /* !! */  = ef.ca;
            if (true) ** GOTO lbl192
            block95: while (true) {
                v35 /* !! */  = (long)(v36 - ef.ajfd("akhy", ajgj(int ), (int)94));
lbl192:
                // 2 sources

                switch ((int)v35 /* !! */ ) {
                    case -1872270231: {
                        break block95;
                    }
                    case -1638045941: {
                        v36 = ef.ajfd("akhz", ajgj(int ), (int)95);
                        continue block95;
                    }
                    case -509937077: {
                        v36 = ef.ajfd("akia", ajgj(int ), (int)96);
                        continue block95;
                    }
                    case 1713861541: {
                        v36 = ef.ajfd("akib", ajgj(int ), (int)97);
                        continue block95;
                    }
                }
                break;
            }
            v37 = new ef$HeadParticle(var1_1, var2_2, v26, v30, v34);
            while (true) {
                if ((v38 /* !! */  = (cfr_temp_8 = ef.ca - ef.ajfd("akic", ajgj(int ), (int)98)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v38 /* !! */  == ef.ajfd("akid", ajfa(int ), (int)461)) break;
                v38 /* !! */  = (long)ef.ajfd("akie", ajfa(int ), (int)462);
            }
            this.headParticles.add(v37);
            if (var7_6 || var7_6) ** GOTO lbl40
            if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_5 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    ++var6_9;
                    if (var7_6) ** GOTO lbl40
                    if (!var9_4) continue block89;
                    throw null;
                }
lbl219:
                // 1 sources

                if (!var7_6 && !var7_6) ** break;
                ** continue;
                return;
                case 0: {
                    do {
                        var8_5 /* !! */  = (int)ef.ajfd("akif", ajfa(int ), (int)463);
                    } while (!var9_4);
                    throw null;
                }
lbl227:
                // 3 sources

                case 1: {
                    var8_5 /* !! */  = (int)ef.ajfd("akig", ajfa(int ), (int)464);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl283
                }
lbl232:
                // 3 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_5 /* !! */  = (int)ef.ajfd("akih", ajfa(int ), (int)465);
                        if (var9_4) {
                            throw null;
                        }
                        ** GOTO lbl248
                        break;
                    }
                }
lbl238:
                // 3 sources

                case 3: {
                    var8_5 /* !! */  = (int)ef.ajfd("akii", ajfa(int ), (int)466);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl253
                }
                case 4: {
                    var8_5 /* !! */  = (int)ef.ajfd("akij", ajfa(int ), (int)467);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl287
                }
lbl248:
                // 2 sources

                case 5: {
                    var8_5 /* !! */  = (int)ef.ajfd("akik", ajfa(int ), (int)468);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl278
                }
lbl253:
                // 2 sources

                case 6: {
                    var8_5 /* !! */  = (int)ef.ajfd("akil", ajfa(int ), (int)469);
                    if (var9_4) {
                        throw null;
                    }
                }
lbl257:
                // 4 sources

                case 7: {
                    var8_5 /* !! */  = (int)ef.ajfd("akim", ajfa(int ), (int)470);
                    if (var9_4) {
                        throw null;
                    }
                }
                case 8: {
                    var8_5 /* !! */  = (int)ef.ajfd("akin", ajfa(int ), (int)471);
                    if (!var9_4) ** GOTO lbl232
                    throw null;
                }
lbl265:
                // 2 sources

                case 9: {
                    var8_5 /* !! */  = (int)ef.ajfd("akio", ajfa(int ), (int)472);
                    if (!var9_4) ** GOTO lbl238
                    throw null;
                }
                case 10: {
                    var8_5 /* !! */  = (int)ef.ajfd("akip", ajfa(int ), (int)473);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl308
                }
lbl274:
                // 2 sources

                case 11: {
                    var8_5 /* !! */  = (int)ef.ajfd("akiq", ajfa(int ), (int)474);
                    if (!var9_4) ** GOTO lbl265
                    throw null;
                }
lbl278:
                // 3 sources

                case 12: {
                    var8_5 /* !! */  = (int)ef.ajfd("akir", ajfa(int ), (int)475);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl304
                }
lbl283:
                // 2 sources

                case 13: {
                    var8_5 /* !! */  = (int)ef.ajfd("akis", ajfa(int ), (int)476);
                    if (!var9_4) ** GOTO lbl227
                    throw null;
                }
lbl287:
                // 3 sources

                case 14: {
                    var8_5 /* !! */  = (int)ef.ajfd("akit", ajfa(int ), (int)477);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl312
                }
lbl292:
                // 2 sources

                case 15: {
                    var8_5 /* !! */  = (int)ef.ajfd("akiu", ajfa(int ), (int)478);
                    if (!var9_4) ** GOTO lbl287
                    throw null;
                }
                case 16: {
                    var8_5 /* !! */  = (int)ef.ajfd("akiv", ajfa(int ), (int)479);
                    if (!var9_4) ** GOTO lbl238
                    throw null;
                }
                case 17: {
                    var8_5 /* !! */  = (int)ef.ajfd("akiw", ajfa(int ), (int)480);
                    if (!var9_4) ** GOTO lbl278
                    throw null;
                }
lbl304:
                // 2 sources

                case 18: {
                    var8_5 /* !! */  = (int)ef.ajfd("akix", ajfa(int ), (int)481);
                    if (!var9_4) ** GOTO lbl257
                    throw null;
                }
lbl308:
                // 2 sources

                case 19: {
                    var8_5 /* !! */  = (int)ef.ajfd("akiy", ajfa(int ), (int)482);
                    if (!var9_4) ** GOTO lbl227
                    throw null;
                }
lbl312:
                // 2 sources

                case 20: {
                    var8_5 /* !! */  = (int)ef.ajfd("akiz", ajfa(int ), (int)483);
                    if (!var9_4) ** GOTO lbl292
                    throw null;
                }
                case 21: {
                    var8_5 /* !! */  = (int)ef.ajfd("akja", ajfa(int ), (int)484);
                    if (!var9_4) ** GOTO lbl232
                    throw null;
                }
                case 22: {
                    var8_5 /* !! */  = (int)ef.ajfd("akjb", ajfa(int ), (int)485);
                    if (!var9_4) ** GOTO lbl274
                    throw null;
                }
                case 23: 
            }
            break;
        }
        var8_5 /* !! */  = (int)ef.ajfd("akjc", ajfa(int ), (int)486);
        ** while (!var9_4)
lbl327:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ansb() {
        ef.ajfi[0] = -1033424983636540707L;
        ef.ajfi[1] = 1060557639766936275L;
        ef.ajfi[2] = 8695764261484899899L;
        ef.ajfi[3] = 8391124833688264136L;
        ef.ajfi[4] = -5720161138623895280L;
        ef.ajfi[5] = 4887816477933333126L;
        ef.ajfi[6] = 660255400366411074L;
        ef.ajfi[7] = -4555855445180212656L;
        ef.ajfi[8] = 5167986968211956109L;
        ef.ajfi[9] = -5243644317680873863L;
        ef.ajfi[10] = -2506443804165827944L;
        ef.ajfi[11] = -7858875558330069394L;
        ef.ajfi[12] = 4946796753860055259L;
        ef.ajfi[13] = -486618987795207487L;
        ef.ajfi[14] = 3570882181654275266L;
        ef.ajfi[15] = -3160412728963725669L;
        ef.ajfi[16] = -5476141079626629439L;
        ef.ajfi[17] = -6555114065579595826L;
        ef.ajfi[18] = -6817941495335783312L;
        ef.ajfi[19] = -7284855636442072138L;
        ef.ajfi[20] = -1519641018553303285L;
        ef.ajfi[21] = 1901839150466907447L;
        ef.ajfi[22] = 1950635278250213316L;
        ef.ajfi[23] = -4824563182948779330L;
        ef.ajfi[24] = -2084116676007502716L;
        ef.ajfi[25] = 4492136266321743025L;
        ef.ajfi[26] = 2693441196699735330L;
        ef.ajfi[27] = 5358427395040008248L;
        ef.ajfi[28] = -3675040355676499847L;
        ef.ajfi[29] = -5304093524152811924L;
        ef.ajfi[30] = -7420308951045660333L;
        ef.ajfi[31] = 732167361512309881L;
        ef.ajfi[32] = -3634327522544157571L;
        ef.ajfi[33] = 946271800738997132L;
        ef.ajfi[34] = -5065044786278601283L;
        ef.ajfi[35] = 2048814409432648828L;
        ef.ajfi[36] = -390348438977844754L;
        ef.ajfi[37] = -8006619102938647688L;
        ef.ajfi[38] = 7083961762970502951L;
        ef.ajfi[39] = 7457622751361584306L;
        ef.ajfi[40] = -4759400934697769976L;
        ef.ajfi[41] = -2315089639703648403L;
        ef.ajfi[42] = -6596257608470716963L;
        ef.ajfi[43] = 3020511386771137951L;
        ef.ajfi[44] = 8186950437880965737L;
        ef.ajfi[45] = 5187542520171576621L;
        ef.ajfi[46] = 2779735525633826316L;
        ef.ajfi[47] = -4581455690809209887L;
        ef.ajfi[48] = 7380850890233358325L;
        ef.ajfi[49] = -7310852459388039678L;
        ef.ajfi[50] = -4695862828539815255L;
        ef.ajfi[51] = -1693584131709552802L;
        ef.ajfi[52] = 9082088414702364421L;
        ef.ajfi[53] = 5155076906236193242L;
        ef.ajfi[54] = 4657442250539141869L;
        ef.ajfi[55] = 8295884034958883471L;
        ef.ajfi[56] = -5138748023096701L;
        ef.ajfi[57] = -4682969895301648466L;
        ef.ajfi[58] = 7418700691016503924L;
        ef.ajfi[59] = -1703614925712871996L;
        ef.ajfi[60] = 3012143664345232853L;
        ef.ajfi[61] = -6142368446258791051L;
        ef.ajfi[62] = -4788915224465055272L;
        ef.ajfi[63] = -2340651231870554600L;
        ef.ajfi[64] = 3682138551072150269L;
        ef.ajfi[65] = -1726382091627479499L;
        ef.ajfi[66] = 7269381893569362804L;
        ef.ajfi[67] = 4397469255137081507L;
        ef.ajfi[68] = 4677915027164634484L;
        ef.ajfi[69] = -5554320707717735948L;
        ef.ajfi[70] = 2941874816837813121L;
        ef.ajfi[71] = -776549312536217846L;
        ef.ajfi[72] = 149412049101496252L;
        ef.ajfi[73] = -5866272308221665471L;
        ef.ajfi[74] = 2348741671487434832L;
        ef.ajfi[75] = 4990910343416040241L;
        ef.ajfi[76] = 6673970483272092081L;
        ef.ajfi[77] = -5583657072054998828L;
        ef.ajfi[78] = -2320910845644308309L;
        ef.ajfi[79] = -7234558669620460943L;
        ef.ajfi[80] = -1436783435744123623L;
        ef.ajfi[81] = -4124633971111950359L;
        ef.ajfi[82] = 8162405169573442424L;
        ef.ajfi[83] = 1710211423978180381L;
        ef.ajfi[84] = -8520052530705875442L;
        ef.ajfi[85] = 7628931443045354669L;
        ef.ajfi[86] = 7284511117420397729L;
        ef.ajfi[87] = -675716232045794295L;
        ef.ajfi[88] = -929224720530662361L;
        ef.ajfi[89] = -1890733767699307778L;
        ef.ajfi[90] = -9158934559972797842L;
        ef.ajfi[91] = -6896255289093391506L;
        ef.ajfi[92] = 4331418585466782675L;
        ef.ajfi[93] = -7604032067730589997L;
        ef.ajfi[94] = 8361609105927828268L;
        ef.ajfi[95] = 3903351588128683255L;
        ef.ajfi[96] = -1325795030396007197L;
        ef.ajfi[97] = 3251808379198247293L;
        ef.ajfi[98] = 1662756328108886909L;
        ef.ajfi[99] = 6080921569968244254L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$drawQueuedItemCounts$0(class_332 var1_1, ks var2_2) {
        v0 /* !! */  = ef.ca;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(v1 - ef.ajfd("amye", ajgj(int ), (int)281));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1872270231: {
                    break block65;
                }
                case 50533891: {
                    v1 = ef.ajfd("amyf", ajgj(int ), (int)282);
                    continue block65;
                }
                case 1459345542: {
                    v1 = ef.ajfd("amyg", ajgj(int ), (int)283);
                    continue block65;
                }
            }
            break;
        }
        var9_3 = ef.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amyh", ajgj(int ), (int)284)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ef.ajfd("amyi", ajfa(int ), (int)1084)) break;
            v2 /* !! */  = (long)ef.ajfd("amyj", ajfa(int ), (int)1085);
        }
        var8_4 /* !! */  = ef.b;
        v3 /* !! */  = ef.ca;
        if (true) ** GOTO lbl25
        block67: while (true) {
            v3 /* !! */  = (long)(ef.ajfd("amyl", ajgj(int ), (int)286) - ef.ajfd("amyk", ajgj(int ), (int)285));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1872270231: {
                    break block67;
                }
                case 599073491: {
                    continue block67;
                }
            }
            break;
        }
        var7_5 = ef.a;
        if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_3) {
                    throw null;
lbl36:
                    // 14 sources

                    return;
                }
                if (var7_5 || var7_5) ** GOTO lbl36
                var3_6 = ef.ajfd("amym", ajfa(int ), (int)1086);
                if (var7_5) ** GOTO lbl36
                do {
                    if (var7_5 || var7_5) ** GOTO lbl36
                    v4 /* !! */  = ef.ca;
                    if (true) ** GOTO lbl47
                    block70: while (true) {
                        v4 /* !! */  = (long)(v5 - ef.ajfd("amyn", ajgj(int ), (int)287));
lbl47:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1920630205: {
                                v5 = ef.ajfd("amyo", ajgj(int ), (int)288);
                                continue block70;
                            }
                            case -1872270231: {
                                break block70;
                            }
                            case 339317648: {
                                v5 = ef.ajfd("amyp", ajgj(int ), (int)289);
                                continue block70;
                            }
                            case 1346067329: {
                                v5 = ef.ajfd("amyq", ajgj(int ), (int)290);
                                continue block70;
                            }
                        }
                        break;
                    }
                    if (var3_6 >= this.queuedCounts.length) ** GOTO lbl175
                    if (var7_5 || var7_5) ** GOTO lbl36
                    v6 /* !! */  = ef.ca;
                    if (true) ** GOTO lbl65
                    block71: while (true) {
                        v6 /* !! */  = (long)(v7 - ef.ajfd("amyr", ajgj(int ), (int)291));
lbl65:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1872270231: {
                                break block71;
                            }
                            case -12673305: {
                                v7 = ef.ajfd("amys", ajgj(int ), (int)292);
                                continue block71;
                            }
                            case 993981018: {
                                v7 = ef.ajfd("amyt", ajgj(int ), (int)293);
                                continue block71;
                            }
                        }
                        break;
                    }
                    var4_7 = this.queuedCounts[var3_6];
                    if (var7_5 || var7_5) ** GOTO lbl36
                    if (var4_7 != null) ** GOTO lbl81
                    if (var7_5) ** GOTO lbl36
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl170
lbl81:
                    // 1 sources

                    if (var7_5 || var7_5) ** GOTO lbl36
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amyu", ajgj(int ), (int)294)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == ef.ajfd("amyv", ajfa(int ), (int)1087)) break;
                        v8 /* !! */  = (long)ef.ajfd("amyw", ajfa(int ), (int)1088);
                    }
                    var5_8 = this.queuedCountX[var3_6];
                    if (var7_5 || var7_5) ** GOTO lbl36
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amyx", ajgj(int ), (int)295)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == ef.ajfd("amyy", ajfa(int ), (int)1089)) break;
                        v9 /* !! */  = (long)ef.ajfd("amyz", ajfa(int ), (int)1090);
                    }
                    var6_9 = this.queuedCountY[var3_6];
                    if (var7_5 || var7_5) ** GOTO lbl36
                    v10 = var5_8 + ef.ajfd("amza", ajfn(int ), (int)1091);
                    v11 = var6_9 + ef.ajfd("amzb", ajfn(int ), (int)1092);
                    v12 = ef.ajfd("amzc", ajfn(int ), (int)1093);
                    v13 = ef.ajfd("amzd", ajfa(int ), (int)1094);
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amze", ajgj(int ), (int)296)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == ef.ajfd("amzf", ajfa(int ), (int)1095)) break;
                        v14 /* !! */  = (long)ef.ajfd("amzg", ajfa(int ), (int)1096);
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("amzh", ajgj(int ), (int)297)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == ef.ajfd("amzi", ajfa(int ), (int)1097)) break;
                        v15 /* !! */  = (long)ef.ajfd("amzj", ajfa(int ), (int)1098);
                    }
                    v16 = nd.multAlpha((int)v13, this.queuedCountOpacity);
                    v17 = ef.ajfd("amzk", ajfa(int ), (int)1099);
                    v18 /* !! */  = ef.ca;
                    if (true) ** GOTO lbl116
                    block76: while (true) {
                        v18 /* !! */  = (long)(v19 - ef.ajfd("amzl", ajgj(int ), (int)298));
lbl116:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -1872270231: {
                                break block76;
                            }
                            case -1345956055: {
                                v19 = ef.ajfd("amzm", ajgj(int ), (int)299);
                                continue block76;
                            }
                            case -549256111: {
                                v19 = ef.ajfd("amzn", ajgj(int ), (int)300);
                                continue block76;
                            }
                            case 1859918663: {
                                v19 = ef.ajfd("amzo", ajgj(int ), (int)301);
                                continue block76;
                            }
                        }
                        break;
                    }
                    kq.text(var1_1, var2_2, var4_7, v10, v11, (float)v12, v16, (boolean)v17);
                    if (var7_5 || var7_5) ** GOTO lbl36
                    v20 = ef.ajfd("amzp", ajfn(int ), (int)1100);
                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("amzq", ajgj(int ), (int)302)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == ef.ajfd("amzr", ajfa(int ), (int)1101)) break;
                        v21 /* !! */  = (long)ef.ajfd("amzs", ajfa(int ), (int)1102);
                    }
                    v22 /* !! */  = ef.ca;
                    if (true) ** GOTO lbl140
                    block78: while (true) {
                        v22 /* !! */  = (long)(v23 - ef.ajfd("amzt", ajgj(int ), (int)303));
lbl140:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case -1872270231: {
                                break block78;
                            }
                            case 1092304846: {
                                v23 = ef.ajfd("amzu", ajgj(int ), (int)304);
                                continue block78;
                            }
                            case 1459517080: {
                                v23 = ef.ajfd("amzv", ajgj(int ), (int)305);
                                continue block78;
                            }
                            case 1650913716: {
                                v23 = ef.ajfd("amzw", ajgj(int ), (int)306);
                                continue block78;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("amzx", ajgj(int ), (int)307)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == ef.ajfd("amzy", ajfa(int ), (int)1103)) break;
                        v24 /* !! */  = (long)ef.ajfd("amzz", ajfa(int ), (int)1104);
                    }
                    v25 = nd.multAlpha(ef.TEXT, this.queuedCountOpacity);
                    v26 = ef.ajfd("anaa", ajfa(int ), (int)1105);
                    v27 /* !! */  = ef.ca;
                    if (true) ** GOTO lbl163
                    block80: while (true) {
                        v27 /* !! */  = (long)(ef.ajfd("anac", ajgj(int ), (int)309) - ef.ajfd("anab", ajgj(int ), (int)308));
lbl163:
                        // 2 sources

                        switch ((int)v27 /* !! */ ) {
                            case -1872270231: {
                                break block80;
                            }
                            case -629682829: {
                                continue block80;
                            }
                        }
                        break;
                    }
                    kq.text(var1_1, var2_2, var4_7, var5_8, var6_9, (float)v20, v25, (boolean)v26);
                    if (var7_5) ** GOTO lbl36
lbl170:
                    // 2 sources

                    if (var7_5 || var7_5) ** GOTO lbl36
                    ++var3_6;
                    if (var7_5) ** GOTO lbl36
                } while (!var9_3);
                throw null;
lbl175:
                // 1 sources

                if (!var7_5 && !var7_5) ** break;
                ** continue;
                return;
            }
lbl178:
            // 2 sources

            case 0: {
                var8_4 /* !! */  = (int)ef.ajfd("anad", ajfa(int ), (int)1106);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl183:
            // 3 sources

            case 1: {
                var8_4 /* !! */  = (int)ef.ajfd("anae", ajfa(int ), (int)1107);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 2: {
                var8_4 /* !! */  = (int)ef.ajfd("anaf", ajfa(int ), (int)1108);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl193:
            // 4 sources

            case 3: {
                var8_4 /* !! */  = (int)ef.ajfd("anag", ajfa(int ), (int)1109);
                if (!var9_3) ** GOTO lbl183
                throw null;
            }
lbl197:
            // 3 sources

            case 4: {
                var8_4 /* !! */  = (int)ef.ajfd("anah", ajfa(int ), (int)1110);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl202:
            // 2 sources

            case 5: {
                var8_4 /* !! */  = (int)ef.ajfd("anai", ajfa(int ), (int)1111);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 6: {
                var8_4 /* !! */  = (int)ef.ajfd("anaj", ajfa(int ), (int)1112);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 7: {
                var8_4 /* !! */  = (int)ef.ajfd("anak", ajfa(int ), (int)1113);
                if (!var9_3) ** GOTO lbl193
                throw null;
            }
lbl216:
            // 2 sources

            case 8: {
                var8_4 /* !! */  = (int)ef.ajfd("anal", ajfa(int ), (int)1114);
                if (!var9_3) ** GOTO lbl202
                throw null;
            }
            case 9: {
                var8_4 /* !! */  = (int)ef.ajfd("anam", ajfa(int ), (int)1115);
                if (!var9_3) ** GOTO lbl216
                throw null;
            }
            case 10: {
                var8_4 /* !! */  = (int)ef.ajfd("anan", ajfa(int ), (int)1116);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl229:
            // 2 sources

            case 11: {
                var8_4 /* !! */  = (int)ef.ajfd("anao", ajfa(int ), (int)1117);
                if (!var9_3) ** GOTO lbl183
                throw null;
            }
lbl233:
            // 4 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_4 /* !! */  = (int)ef.ajfd("anap", ajfa(int ), (int)1118);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl285
                    break;
                }
            }
            case 13: {
                var8_4 /* !! */  = (int)ef.ajfd("anaq", ajfa(int ), (int)1119);
                if (!var9_3) ** GOTO lbl233
                throw null;
            }
lbl243:
            // 2 sources

            case 14: {
                var8_4 /* !! */  = (int)ef.ajfd("anar", ajfa(int ), (int)1120);
                if (!var9_3) ** GOTO lbl178
                throw null;
            }
            case 15: {
                var8_4 /* !! */  = (int)ef.ajfd("anas", ajfa(int ), (int)1121);
                if (!var9_3) ** GOTO lbl193
                throw null;
            }
lbl251:
            // 3 sources

            case 16: {
                var8_4 /* !! */  = (int)ef.ajfd("anat", ajfa(int ), (int)1122);
                if (!var9_3) ** GOTO lbl197
                throw null;
            }
            case 17: {
                var8_4 /* !! */  = (int)ef.ajfd("anau", ajfa(int ), (int)1123);
                if (!var9_3) ** GOTO lbl193
                throw null;
            }
lbl259:
            // 2 sources

            case 18: {
                var8_4 /* !! */  = (int)ef.ajfd("anav", ajfa(int ), (int)1124);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 19: {
                var8_4 /* !! */  = (int)ef.ajfd("anaw", ajfa(int ), (int)1125);
                if (!var9_3) ** GOTO lbl229
                throw null;
            }
lbl268:
            // 3 sources

            case 20: {
                var8_4 /* !! */  = (int)ef.ajfd("anax", ajfa(int ), (int)1126);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl273:
            // 2 sources

            case 21: {
                var8_4 /* !! */  = (int)ef.ajfd("anay", ajfa(int ), (int)1127);
                if (!var9_3) ** GOTO lbl251
                throw null;
            }
lbl277:
            // 2 sources

            case 22: {
                var8_4 /* !! */  = (int)ef.ajfd("anaz", ajfa(int ), (int)1128);
                if (!var9_3) ** GOTO lbl251
                throw null;
            }
lbl281:
            // 3 sources

            case 23: {
                var8_4 /* !! */  = (int)ef.ajfd("anba", ajfa(int ), (int)1129);
                if (!var9_3) ** GOTO lbl197
                throw null;
            }
lbl285:
            // 3 sources

            case 24: {
                var8_4 /* !! */  = (int)ef.ajfd("anbb", ajfa(int ), (int)1130);
                if (!var9_3) ** GOTO lbl233
                throw null;
            }
            case 25: {
                var8_4 /* !! */  = (int)ef.ajfd("anbc", ajfa(int ), (int)1131);
                if (!var9_3) ** GOTO lbl243
                throw null;
            }
            case 26: 
        }
        var8_4 /* !! */  = (int)ef.ajfd("anbd", ajfa(int ), (int)1132);
        ** while (!var9_3)
lbl296:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ajfa(int n2) {
        return ajfb[n2] ^ ajfc[n2];
    }

    private static /* synthetic */ void angw() {
        ef.ajfb[900] = -814127479;
        ef.ajfb[901] = 1072042683;
        ef.ajfb[902] = -874102127;
        ef.ajfb[903] = -815182792;
        ef.ajfb[904] = 150551857;
        ef.ajfb[905] = -2101817089;
        ef.ajfb[906] = 1178113531;
        ef.ajfb[907] = -577949752;
        ef.ajfb[908] = -1890124269;
        ef.ajfb[909] = 1425310974;
        ef.ajfb[910] = 226105234;
        ef.ajfb[911] = -1288952762;
        ef.ajfb[912] = 1267254172;
        ef.ajfb[913] = -97139453;
        ef.ajfb[914] = -2070345059;
        ef.ajfb[915] = -1476705636;
        ef.ajfb[916] = -1140268969;
        ef.ajfb[917] = -2133243584;
        ef.ajfb[918] = -505717802;
        ef.ajfb[919] = 1769822569;
        ef.ajfb[920] = -954906789;
        ef.ajfb[921] = -1313054694;
        ef.ajfb[922] = 1657593994;
        ef.ajfb[923] = 1991481552;
        ef.ajfb[924] = 96125548;
        ef.ajfb[925] = -491102852;
        ef.ajfb[926] = 1374040955;
        ef.ajfb[927] = 1242963429;
        ef.ajfb[928] = 888467419;
        ef.ajfb[929] = -512840804;
        ef.ajfb[930] = 1629732225;
        ef.ajfb[931] = 1315285504;
        ef.ajfb[932] = 1897170403;
        ef.ajfb[933] = -970248528;
        ef.ajfb[934] = -517738560;
        ef.ajfb[935] = 1973109624;
        ef.ajfb[936] = -2049719769;
        ef.ajfb[937] = 2019439934;
        ef.ajfb[938] = -1142501926;
        ef.ajfb[939] = -552334016;
        ef.ajfb[940] = 1844688783;
        ef.ajfb[941] = -1955701425;
        ef.ajfb[942] = -833030839;
        ef.ajfb[943] = 201170359;
        ef.ajfb[944] = 967365235;
        ef.ajfb[945] = 2065358081;
        ef.ajfb[946] = 1735341577;
        ef.ajfb[947] = -30479039;
        ef.ajfb[948] = 1923046339;
        ef.ajfb[949] = 1114276659;
        ef.ajfb[950] = -631453890;
        ef.ajfb[951] = -1292038560;
        ef.ajfb[952] = 255786427;
        ef.ajfb[953] = -192346689;
        ef.ajfb[954] = 1567139112;
        ef.ajfb[955] = 1565031181;
        ef.ajfb[956] = 430180270;
        ef.ajfb[957] = -1740206454;
        ef.ajfb[958] = -1486336180;
        ef.ajfb[959] = 649389486;
        ef.ajfb[960] = -1862529074;
        ef.ajfb[961] = 1297250868;
        ef.ajfb[962] = -857798001;
        ef.ajfb[963] = 1716977189;
        ef.ajfb[964] = -256482964;
        ef.ajfb[965] = -538973746;
        ef.ajfb[966] = 940881380;
        ef.ajfb[967] = 1924935164;
        ef.ajfb[968] = -1976307097;
        ef.ajfb[969] = -725050562;
        ef.ajfb[970] = 1569419480;
        ef.ajfb[971] = 1245644913;
        ef.ajfb[972] = -1337395193;
        ef.ajfb[973] = 867156547;
        ef.ajfb[974] = 1750540712;
        ef.ajfb[975] = 1973213879;
        ef.ajfb[976] = -881078894;
        ef.ajfb[977] = 1443855232;
        ef.ajfb[978] = 1546570657;
        ef.ajfb[979] = 348517461;
        ef.ajfb[980] = 25650943;
        ef.ajfb[981] = 19035609;
        ef.ajfb[982] = 951042393;
        ef.ajfb[983] = -1948600723;
        ef.ajfb[984] = 1741493723;
        ef.ajfb[985] = 532467326;
        ef.ajfb[986] = -114262235;
        ef.ajfb[987] = -2060529572;
        ef.ajfb[988] = 115075890;
        ef.ajfb[989] = 1019322205;
        ef.ajfb[990] = -1078095017;
        ef.ajfb[991] = -1409805576;
        ef.ajfb[992] = -2100505036;
        ef.ajfb[993] = -1727620515;
        ef.ajfb[994] = 441058324;
        ef.ajfb[995] = -785229658;
        ef.ajfb[996] = -2062654889;
        ef.ajfb[997] = -1822110105;
        ef.ajfb[998] = 2094616378;
        ef.ajfb[999] = -938989801;
    }

    private static /* synthetic */ void anrz() {
        ef.ajfh[300] = 616824644608054845L;
        ef.ajfh[301] = 4788389824447601078L;
        ef.ajfh[302] = -7970285126102426505L;
        ef.ajfh[303] = 8332040065287895340L;
        ef.ajfh[304] = -3488521958558183954L;
        ef.ajfh[305] = -7233261247561457458L;
        ef.ajfh[306] = -4252195458043839693L;
        ef.ajfh[307] = 4000566960018784990L;
        ef.ajfh[308] = -999555640065731839L;
        ef.ajfh[309] = -4804793759819934688L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float centeredY(ks var0, String var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amut", ajgj(int ), (int)249)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ef.ajfd("amuu", ajfa(int ), (int)1027)) break;
            v0 /* !! */  = (long)ef.ajfd("amuv", ajfa(int ), (int)1028);
        }
        var8_4 = ef.c;
        v1 /* !! */  = ef.ca;
        if (true) ** GOTO lbl12
        block48: while (true) {
            v1 /* !! */  = (long)(ef.ajfd("amux", ajgj(int ), (int)251) - ef.ajfd("amuw", ajgj(int ), (int)250));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1872270231: {
                    break block48;
                }
                case 245059266: {
                    continue block48;
                }
            }
            break;
        }
        var7_5 /* !! */  = ef.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("amuy", ajgj(int ), (int)252)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ef.ajfd("amuz", ajfa(int ), (int)1029)) break;
            v2 /* !! */  = (long)ef.ajfd("amva", ajfa(int ), (int)1030);
        }
        var6_6 = ef.a;
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_4) {
                    throw null;
lbl30:
                    // 11 sources

                    return (float)ef.ajfd("amvb", ajfn(int ), (int)1031);
                }
                if (var6_6 || var6_6) ** GOTO lbl30
                if (var0 == null) ** GOTO lbl46
                if (var6_6) ** GOTO lbl30
                v3 /* !! */  = ef.ca;
                if (true) ** GOTO lbl39
                block51: while (true) {
                    v3 /* !! */  = (long)(ef.ajfd("amvd", ajgj(int ), (int)254) - ef.ajfd("amvc", ajgj(int ), (int)253));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1872270231: {
                            break block51;
                        }
                        case 1301408881: {
                            continue block51;
                        }
                    }
                    break;
                }
                if (!var1_1.isEmpty()) ** GOTO lbl48
                if (var6_6) ** GOTO lbl30
lbl46:
                // 2 sources

                if (var6_6 || var6_6) ** GOTO lbl30
                return var3_3 - var2_2 * ef.ajfd("amve", ajfn(int ), (int)1032);
lbl48:
                // 1 sources

                if (var6_6 || var6_6) ** GOTO lbl30
                v4 = ef.ajfd("amvf", ajfa(int ), (int)1033);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amvg", ajgj(int ), (int)255)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ef.ajfd("amvh", ajfa(int ), (int)1034)) break;
                    v5 /* !! */  = (long)ef.ajfd("amvi", ajfa(int ), (int)1035);
                }
                var4_7 = var0.getGlyph((int)v4);
                if (var6_6 || var6_6) ** GOTO lbl30
                if (var4_7 == null) ** GOTO lbl71
                if (var6_6) ** GOTO lbl30
                v6 /* !! */  = ef.ca;
                if (true) ** GOTO lbl64
                block53: while (true) {
                    v6 /* !! */  = (long)(ef.ajfd("amvk", ajgj(int ), (int)257) - ef.ajfd("amvj", ajgj(int ), (int)256));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1872270231: {
                            break block53;
                        }
                        case 1191023496: {
                            continue block53;
                        }
                    }
                    break;
                }
                if (!(var4_7.height <= 0.0f)) ** GOTO lbl89
                if (var6_6) ** GOTO lbl30
lbl71:
                // 2 sources

                if (var6_6 || var6_6) ** GOTO lbl30
                v7 /* !! */  = ef.ca;
                if (true) ** GOTO lbl76
                block54: while (true) {
                    v7 /* !! */  = (long)(v8 - ef.ajfd("amvl", ajgj(int ), (int)258));
lbl76:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1872270231: {
                            break block54;
                        }
                        case -639062555: {
                            v8 = ef.ajfd("amvm", ajgj(int ), (int)259);
                            continue block54;
                        }
                        case -270405383: {
                            v8 = ef.ajfd("amvn", ajgj(int ), (int)260);
                            continue block54;
                        }
                        case 465709484: {
                            v8 = ef.ajfd("amvo", ajgj(int ), (int)261);
                            continue block54;
                        }
                    }
                    break;
                }
                return var3_3 - var0.getLineHeight() * var2_2 * ef.ajfd("amvp", ajfn(int ), (int)1036);
lbl89:
                // 1 sources

                if (var6_6 || var6_6) ** GOTO lbl30
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amvq", ajgj(int ), (int)262)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ef.ajfd("amvr", ajfa(int ), (int)1037)) break;
                    v9 /* !! */  = (long)ef.ajfd("amvs", ajfa(int ), (int)1038);
                }
                var5_8 = var2_2 / var0.getEmSize();
                if (!var6_6 && !var6_6) ** break;
                ** continue;
                v10 /* !! */  = ef.ca;
                if (true) ** GOTO lbl103
                block56: while (true) {
                    v10 /* !! */  = (long)(v11 - ef.ajfd("amvt", ajgj(int ), (int)263));
lbl103:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1941169609: {
                            v11 = ef.ajfd("amvu", ajgj(int ), (int)264);
                            continue block56;
                        }
                        case -1872270231: {
                            break block56;
                        }
                        case -929694340: {
                            v11 = ef.ajfd("amvv", ajgj(int ), (int)265);
                            continue block56;
                        }
                        case -64411945: {
                            v11 = ef.ajfd("amvw", ajgj(int ), (int)266);
                            continue block56;
                        }
                    }
                    break;
                }
                v12 = var0.getAscender();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("amvx", ajgj(int ), (int)267)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == ef.ajfd("amvy", ajfa(int ), (int)1039)) break;
                    v13 /* !! */  = (long)ef.ajfd("amvz", ajfa(int ), (int)1040);
                }
                v14 = v12 - var4_7.bearingY;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("amwa", ajgj(int ), (int)268)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == ef.ajfd("amwb", ajfa(int ), (int)1041)) break;
                    v15 /* !! */  = (long)ef.ajfd("amwc", ajfa(int ), (int)1042);
                }
                return var3_3 - (v14 + var4_7.height * ef.ajfd("amwd", ajfn(int ), (int)1043)) * var5_8;
            }
lbl130:
            // 3 sources

            case 0: {
                var7_5 /* !! */  = (int)ef.ajfd("amwe", ajfa(int ), (int)1044);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl135:
            // 4 sources

            case 1: {
                var7_5 /* !! */  = (int)ef.ajfd("amwf", ajfa(int ), (int)1045);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl140:
            // 2 sources

            case 2: {
                var7_5 /* !! */  = (int)ef.ajfd("amwg", ajfa(int ), (int)1046);
                if (!var8_4) ** GOTO lbl135
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)ef.ajfd("amwh", ajfa(int ), (int)1047);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl190
                    break;
                }
            }
            case 4: {
                var7_5 /* !! */  = (int)ef.ajfd("amwi", ajfa(int ), (int)1048);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 5: {
                var7_5 /* !! */  = (int)ef.ajfd("amwj", ajfa(int ), (int)1049);
                if (!var8_4) ** GOTO lbl130
                throw null;
            }
            case 6: {
                var7_5 /* !! */  = (int)ef.ajfd("amwk", ajfa(int ), (int)1050);
                if (!var8_4) ** GOTO lbl140
                throw null;
            }
            case 7: {
                var7_5 /* !! */  = (int)ef.ajfd("amwl", ajfa(int ), (int)1051);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl168:
            // 2 sources

            case 8: {
                var7_5 /* !! */  = (int)ef.ajfd("amwm", ajfa(int ), (int)1052);
                if (!var8_4) ** GOTO lbl135
                throw null;
            }
            case 9: {
                var7_5 /* !! */  = (int)ef.ajfd("amwn", ajfa(int ), (int)1053);
                if (!var8_4) ** GOTO lbl168
                throw null;
            }
lbl176:
            // 2 sources

            case 10: {
                var7_5 /* !! */  = (int)ef.ajfd("amwo", ajfa(int ), (int)1054);
                if (!var8_4) ** GOTO lbl135
                throw null;
            }
            case 11: {
                var7_5 /* !! */  = (int)ef.ajfd("amwp", ajfa(int ), (int)1055);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl185:
            // 2 sources

            case 12: {
                var7_5 /* !! */  = (int)ef.ajfd("amwq", ajfa(int ), (int)1056);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl190:
            // 2 sources

            case 13: {
                var7_5 /* !! */  = (int)ef.ajfd("amwr", ajfa(int ), (int)1057);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl195:
            // 2 sources

            case 14: {
                var7_5 /* !! */  = (int)ef.ajfd("amws", ajfa(int ), (int)1058);
                if (!var8_4) break;
                throw null;
            }
lbl199:
            // 2 sources

            case 15: {
                var7_5 /* !! */  = (int)ef.ajfd("amwt", ajfa(int ), (int)1059);
                if (!var8_4) ** GOTO lbl130
                throw null;
            }
            case 16: {
                var7_5 /* !! */  = (int)ef.ajfd("amwu", ajfa(int ), (int)1060);
                if (!var8_4) ** GOTO lbl185
                throw null;
            }
lbl207:
            // 2 sources

            case 17: {
                var7_5 /* !! */  = (int)ef.ajfd("amwv", ajfa(int ), (int)1061);
                if (var8_4) {
                    throw null;
                }
            }
lbl211:
            // 6 sources

            case 18: {
                var7_5 /* !! */  = (int)ef.ajfd("amww", ajfa(int ), (int)1062);
                if (!var8_4) ** GOTO lbl176
                throw null;
            }
lbl215:
            // 3 sources

            case 19: {
                var7_5 /* !! */  = (int)ef.ajfd("amwx", ajfa(int ), (int)1063);
                if (!var8_4) ** GOTO lbl211
                throw null;
            }
            case 20: 
        }
        var7_5 /* !! */  = (int)ef.ajfd("amwy", ajfa(int ), (int)1064);
        ** while (!var8_4)
lbl222:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void annh() {
        ef.ajfc[600] = -1118199538;
        ef.ajfc[601] = -866168546;
        ef.ajfc[602] = 258043854;
        ef.ajfc[603] = 1100030338;
        ef.ajfc[604] = -1350747950;
        ef.ajfc[605] = 2113788749;
        ef.ajfc[606] = 1218724354;
        ef.ajfc[607] = -423031159;
        ef.ajfc[608] = 541932674;
        ef.ajfc[609] = -942510240;
        ef.ajfc[610] = -600072138;
        ef.ajfc[611] = 707340437;
        ef.ajfc[612] = 1487504040;
        ef.ajfc[613] = -1665292047;
        ef.ajfc[614] = -1500414107;
        ef.ajfc[615] = -480195959;
        ef.ajfc[616] = 70178889;
        ef.ajfc[617] = 2111839822;
        ef.ajfc[618] = 1598660189;
        ef.ajfc[619] = -832560310;
        ef.ajfc[620] = 2129135654;
        ef.ajfc[621] = 1177653356;
        ef.ajfc[622] = -358209375;
        ef.ajfc[623] = 2142922969;
        ef.ajfc[624] = -1955491265;
        ef.ajfc[625] = 1950787099;
        ef.ajfc[626] = 349774737;
        ef.ajfc[627] = 596617379;
        ef.ajfc[628] = -1826433128;
        ef.ajfc[629] = -908417413;
        ef.ajfc[630] = -1206056504;
        ef.ajfc[631] = -908932841;
        ef.ajfc[632] = -776487362;
        ef.ajfc[633] = -132782418;
        ef.ajfc[634] = -1758381883;
        ef.ajfc[635] = -2097835911;
        ef.ajfc[636] = 1008865676;
        ef.ajfc[637] = -1176445234;
        ef.ajfc[638] = 545068236;
        ef.ajfc[639] = -699546378;
        ef.ajfc[640] = -1361435990;
        ef.ajfc[641] = 1847532065;
        ef.ajfc[642] = -1796798706;
        ef.ajfc[643] = -182208009;
        ef.ajfc[644] = -545624746;
        ef.ajfc[645] = -1448315253;
        ef.ajfc[646] = -828720633;
        ef.ajfc[647] = -611590471;
        ef.ajfc[648] = -1746254618;
        ef.ajfc[649] = -1213569213;
        ef.ajfc[650] = -506709977;
        ef.ajfc[651] = -2009980387;
        ef.ajfc[652] = 320327053;
        ef.ajfc[653] = -313381175;
        ef.ajfc[654] = -1304702796;
        ef.ajfc[655] = -547930180;
        ef.ajfc[656] = -1669216803;
        ef.ajfc[657] = -1604565993;
        ef.ajfc[658] = 639166190;
        ef.ajfc[659] = 1219316286;
        ef.ajfc[660] = 1221977228;
        ef.ajfc[661] = 1935431446;
        ef.ajfc[662] = 136318835;
        ef.ajfc[663] = -725481748;
        ef.ajfc[664] = 921751162;
        ef.ajfc[665] = 1031055443;
        ef.ajfc[666] = -1045225499;
        ef.ajfc[667] = -1166348670;
        ef.ajfc[668] = 30992626;
        ef.ajfc[669] = -1178949646;
        ef.ajfc[670] = -1871702839;
        ef.ajfc[671] = 1628432201;
        ef.ajfc[672] = 639470639;
        ef.ajfc[673] = 1104285666;
        ef.ajfc[674] = -1816792655;
        ef.ajfc[675] = 1546587237;
        ef.ajfc[676] = 462969378;
        ef.ajfc[677] = 1843588433;
        ef.ajfc[678] = 1138032541;
        ef.ajfc[679] = -1077602709;
        ef.ajfc[680] = -802767502;
        ef.ajfc[681] = -1922937502;
        ef.ajfc[682] = 2023361951;
        ef.ajfc[683] = -729073354;
        ef.ajfc[684] = 1422775492;
        ef.ajfc[685] = 2137817373;
        ef.ajfc[686] = -574974019;
        ef.ajfc[687] = 1731496698;
        ef.ajfc[688] = -1122283972;
        ef.ajfc[689] = -1444205401;
        ef.ajfc[690] = 2074212378;
        ef.ajfc[691] = -417183591;
        ef.ajfc[692] = -54921406;
        ef.ajfc[693] = 1269863858;
        ef.ajfc[694] = 545130071;
        ef.ajfc[695] = 539462453;
        ef.ajfc[696] = -1856437112;
        ef.ajfc[697] = 2052384054;
        ef.ajfc[698] = -362034890;
        ef.ajfc[699] = 844776198;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static ef getInstance() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ca - ef.ajfd("ajgk", ajgj(int ), (int)2)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ef.ajfd("ajgl", ajfa(int ), (int)25)) break;
            object = ef.ajfd("ajgm", ajfa(int ), (int)26);
        }
        boolean bl2 = c;
        Object object = ca;
        block14: while (true) {
            switch ((int)object) {
                case -1872270231: {
                    break block14;
                }
                case -571786385: {
                    object = ef.ajfd("ajgo", ajgj(int ), (int)4) - ef.ajfd("ajgn", ajgj(int ), (int)3);
                    continue block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = ca;
        block15: while (true) {
            switch ((int)object2) {
                case -1872270231: {
                    break block15;
                }
                case 1106822854: {
                    object2 = ef.ajfd("ajgq", ajgj(int ), (int)6) - ef.ajfd("ajgp", ajgj(int ), (int)5);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        Object object3 = ca;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - ef.ajfd("ajgr", ajgj(int ), (int)7);
            }
            switch ((int)object3) {
                case -1872270231: {
                    return instance;
                }
                case -1567032560: {
                    callSite = ef.ajfd("ajgs", ajgj(int ), (int)8);
                    continue block16;
                }
                case -732927933: {
                    callSite = ef.ajfd("ajgt", ajgj(int ), (int)9);
                    continue block16;
                }
            }
            break;
        }
        return instance;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawEmpty(class_332 var0, ks var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        block57: {
            var14_6 = ef.c;
            var13_7 /* !! */  = ef.b;
            var12_8 = ef.a;
            if (var14_6) {
                throw null;
lbl6:
                // 14 sources

                return;
            }
            if (var12_8 || var12_8) ** GOTO lbl6
            if (var1_1 != null) break block57;
            if (var12_8) ** GOTO lbl6
            return;
        }
        if (var12_8 || var12_8) ** GOTO lbl6
        var6_9 = var1_1.getGlyph("a".charAt((int)ef.ajfd("ammv", ajfa(int ), (int)877)));
        if (var12_8 || var12_8) ** GOTO lbl6
        if (var6_9 == null) ** GOTO lbl23
        if (var12_8) ** GOTO lbl6
        if (!(var6_9.width <= 0.0f)) ** GOTO lbl25
        if (var13_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_8) ** GOTO lbl6
lbl23:
                // 2 sources

                if (var12_8 || var12_8) ** GOTO lbl6
                return;
            }
lbl25:
            // 1 sources

            if (var12_8 || var12_8) ** GOTO lbl6
            var7_10 = ef.ajfd("ammw", ajfn(int ), (int)878) * var1_1.getEmSize() / var6_9.width;
            if (var12_8 || var12_8) ** GOTO lbl6
            var8_11 = var7_10 / var1_1.getEmSize();
            if (var12_8 || var12_8) ** GOTO lbl6
            var9_12 = var2_2 + (var4_4 - ef.ajfd("ammx", ajfn(int ), (int)879)) * ef.ajfd("ammy", ajfn(int ), (int)880) - var6_9.bearingX * var8_11;
            if (var12_8 || var12_8) ** GOTO lbl6
            var10_13 = var3_3 + (var4_4 - var6_9.height * var8_11) * ef.ajfd("ammz", ajfn(int ), (int)881);
            if (var12_8 || var12_8) ** GOTO lbl6
            var11_14 = var10_13 - var1_1.getAscender() * var8_11 + var6_9.bearingY * var8_11;
            if (var12_8 || var12_8) ** GOTO lbl6
            kq.text(var0, var1_1, "a", var9_12, var11_14, (float)var7_10, nd.multAlpha(ef.EMPTY, var5_5), (boolean)ef.ajfd("amna", ajfa(int ), (int)882));
            if (!var12_8 && !var12_8) ** break;
            ** continue;
            return;
lbl40:
            // 2 sources

            case 0: {
                var13_7 /* !! */  = (int)ef.ajfd("amnb", ajfa(int ), (int)883);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl69
            }
lbl45:
            // 2 sources

            case 1: {
                var13_7 /* !! */  = (int)ef.ajfd("amnc", ajfa(int ), (int)884);
                if (!var14_6) ** GOTO lbl40
                throw null;
            }
lbl49:
            // 2 sources

            case 2: {
                var13_7 /* !! */  = (int)ef.ajfd("amnd", ajfa(int ), (int)885);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 3: {
                var13_7 /* !! */  = (int)ef.ajfd("amne", ajfa(int ), (int)886);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 4: {
                var13_7 /* !! */  = (int)ef.ajfd("amnf", ajfa(int ), (int)887);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl64:
            // 3 sources

            case 5: {
                var13_7 /* !! */  = (int)ef.ajfd("amng", ajfa(int ), (int)888);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl69:
            // 3 sources

            case 6: {
                var13_7 /* !! */  = (int)ef.ajfd("amnh", ajfa(int ), (int)889);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 7: {
                var13_7 /* !! */  = (int)ef.ajfd("amni", ajfa(int ), (int)890);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 8: {
                var13_7 /* !! */  = (int)ef.ajfd("amnj", ajfa(int ), (int)891);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl84:
            // 4 sources

            case 9: {
                var13_7 /* !! */  = (int)ef.ajfd("amnk", ajfa(int ), (int)892);
                if (!var14_6) ** GOTO lbl49
                throw null;
            }
lbl88:
            // 2 sources

            case 10: {
                var13_7 /* !! */  = (int)ef.ajfd("amnl", ajfa(int ), (int)893);
                if (!var14_6) ** GOTO lbl69
                throw null;
            }
            case 11: {
                var13_7 /* !! */  = (int)ef.ajfd("amnm", ajfa(int ), (int)894);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl97:
            // 2 sources

            case 12: {
                var13_7 /* !! */  = (int)ef.ajfd("amnn", ajfa(int ), (int)895);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl102:
            // 2 sources

            case 13: {
                var13_7 /* !! */  = (int)ef.ajfd("amno", ajfa(int ), (int)896);
                if (!var14_6) ** GOTO lbl84
                throw null;
            }
lbl106:
            // 2 sources

            case 14: {
                var13_7 /* !! */  = (int)ef.ajfd("amnp", ajfa(int ), (int)897);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 15: {
                var13_7 /* !! */  = (int)ef.ajfd("amnq", ajfa(int ), (int)898);
                if (!var14_6) ** GOTO lbl88
                throw null;
            }
lbl115:
            // 3 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_7 /* !! */  = (int)ef.ajfd("amnr", ajfa(int ), (int)899);
                    if (!var14_6) ** GOTO lbl45
                    throw null;
                }
            }
lbl120:
            // 4 sources

            case 17: {
                var13_7 /* !! */  = (int)ef.ajfd("amns", ajfa(int ), (int)900);
                if (!var14_6) ** GOTO lbl84
                throw null;
            }
lbl124:
            // 3 sources

            case 18: {
                var13_7 /* !! */  = (int)ef.ajfd("amnt", ajfa(int ), (int)901);
                if (!var14_6) ** GOTO lbl115
                throw null;
            }
lbl128:
            // 2 sources

            case 19: {
                var13_7 /* !! */  = (int)ef.ajfd("amnu", ajfa(int ), (int)902);
                if (!var14_6) ** GOTO lbl64
                throw null;
            }
lbl132:
            // 2 sources

            case 20: {
                var13_7 /* !! */  = (int)ef.ajfd("amnv", ajfa(int ), (int)903);
                if (!var14_6) ** GOTO lbl97
                throw null;
            }
            case 21: {
                var13_7 /* !! */  = (int)ef.ajfd("amnw", ajfa(int ), (int)904);
                if (!var14_6) ** GOTO lbl132
                throw null;
            }
            case 22: {
                var13_7 /* !! */  = (int)ef.ajfd("amnx", ajfa(int ), (int)905);
                if (!var14_6) ** GOTO lbl120
                throw null;
            }
            case 23: {
                var13_7 /* !! */  = (int)ef.ajfd("amny", ajfa(int ), (int)906);
                if (!var14_6) ** GOTO lbl84
                throw null;
            }
lbl148:
            // 3 sources

            case 24: {
                var13_7 /* !! */  = (int)ef.ajfd("amnz", ajfa(int ), (int)907);
                if (!var14_6) ** GOTO lbl64
                throw null;
            }
lbl152:
            // 2 sources

            case 25: {
                var13_7 /* !! */  = (int)ef.ajfd("amoa", ajfa(int ), (int)908);
                if (!var14_6) ** GOTO lbl124
                throw null;
            }
lbl156:
            // 2 sources

            case 26: {
                var13_7 /* !! */  = (int)ef.ajfd("amob", ajfa(int ), (int)909);
                if (!var14_6) ** GOTO lbl152
                throw null;
            }
            case 27: 
        }
        var13_7 /* !! */  = (int)ef.ajfd("amoc", ajfa(int ), (int)910);
        ** while (!var14_6)
lbl163:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public float getRoundingRadius() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amxr", ajgj(int ), (int)276)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ef.ajfd("amxs", ajfa(int ), (int)1076)) break;
            v0 /* !! */  = (long)ef.ajfd("amxt", ajfa(int ), (int)1077);
        }
        var3_1 = ef.c;
        v1 /* !! */  = ef.ca;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(ef.ajfd("amxv", ajgj(int ), (int)278) - ef.ajfd("amxu", ajgj(int ), (int)277));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2139373481: {
                    continue block15;
                }
                case -1872270231: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = ef.b;
        v2 /* !! */  = ef.ca;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(ef.ajfd("amxx", ajgj(int ), (int)280) - ef.ajfd("amxw", ajgj(int ), (int)279));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1872270231: {
                    break block16;
                }
                case -782726500: {
                    continue block16;
                }
            }
            break;
        }
        var1_3 = ef.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return (float)ef.ajfd("amxy", ajfn(int ), (int)1078);
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return (float)ef.ajfd("amxz", ajfn(int ), (int)1079);
            }
            case 0: {
                var2_2 /* !! */  = (int)ef.ajfd("amya", ajfa(int ), (int)1080);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ef.ajfd("amyb", ajfa(int ), (int)1081);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ef.ajfd("amyc", ajfa(int ), (int)1082);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ef.ajfd("amyd", ajfa(int ), (int)1083);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ansh() {
        ef.ajfi[300] = -351363071158696239L;
        ef.ajfi[301] = -5912610898851043813L;
        ef.ajfi[302] = -2808211717098065033L;
        ef.ajfi[303] = 7797870222360097745L;
        ef.ajfi[304] = 3165274907535984928L;
        ef.ajfi[305] = 8015269413021384191L;
        ef.ajfi[306] = -6266650079972244715L;
        ef.ajfi[307] = -7236544203225906185L;
        ef.ajfi[308] = -5598466678804429171L;
        ef.ajfi[309] = 5601917635010148964L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void drawDraggable(class_332 var1_1, int var2_2) {
        block165: {
            var15_3 = ef.c;
            var14_4 /* !! */  = ef.b;
            var13_5 = ef.a;
            if (var15_3) {
                throw null;
lbl6:
                // 47 sources

                return;
            }
            if (var13_5 || var13_5) ** GOTO lbl6
            if (this.mc.field_1724 != null) break block165;
            if (var13_5) ** GOTO lbl6
            return;
        }
        if (var13_5 || var13_5) ** GOTO lbl6
        kq.hasFonts();
        if (var13_5 || var13_5) ** GOTO lbl6
        var3_6 = System.nanoTime();
        if (var13_5 || var13_5) ** GOTO lbl6
        var5_7 = Math.min((float)ef.ajfd("ajiq", ajfn(int ), (int)58), (float)(var3_6 - this.lastFrame) / ef.ajfd("ajir", ajfn(int ), (int)59));
        if (var13_5 || var13_5) ** GOTO lbl6
        this.lastFrame = var3_6;
        if (var13_5 || var13_5) ** GOTO lbl6
        if (var14_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var6_8 = 1.0f - (float)Math.exp((double)(ef.ajfd("ajis", ajfn(int ), (int)60) * var5_7));
                if (var13_5 || var13_5) ** GOTO lbl6
                var7_9 = this.currentTarget();
                if (var13_5 || var13_5) ** GOTO lbl6
                var8_10 = var7_9;
                if (var13_5 || var13_5) ** GOTO lbl6
                if (var8_10 != null) ** GOTO lbl38
                if (var13_5) ** GOTO lbl6
                if (!(this.mc.field_1755 instanceof class_408)) ** GOTO lbl38
                if (var13_5) ** GOTO lbl6
                var8_10 = this.mc.field_1724;
                if (var13_5) ** GOTO lbl6
lbl38:
                // 3 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                if (var8_10 == null) ** GOTO lbl48
                if (var13_5 || var13_5) ** GOTO lbl6
                this.snapshot(var8_10);
                if (var13_5 || var13_5) ** GOTO lbl6
                this.trackHit(var8_10);
                if (var13_5) ** GOTO lbl6
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl53
lbl48:
                // 1 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                this.trackedTarget = null;
                if (var13_5 || var13_5) ** GOTO lbl6
                this.lastHurtTime = 0.0f;
                if (var13_5) ** GOTO lbl6
lbl53:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                if (var8_10 == null) {
                    v0 = 0.0f;
                    if (var15_3) {
                        throw null;
                    }
                } else {
                    v0 = 1.0f;
                }
                this.visibility += (v0 - this.visibility) * var6_8;
                if (var13_5 || var13_5) ** GOTO lbl6
                this.visibility = class_3532.method_15363((float)this.visibility, (float)0.0f, (float)1.0f);
                if (var13_5 || var13_5) ** GOTO lbl6
                if (var8_10 != null) ** GOTO lbl71
                if (var13_5) ** GOTO lbl6
                if (!(this.visibility <= ef.ajfd("ajit", ajfn(int ), (int)61))) ** GOTO lbl71
                if (var13_5 || var13_5) ** GOTO lbl6
                this.headParticles.clear();
                if (var13_5 || var13_5) ** GOTO lbl6
                return;
lbl71:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                if (!(this.animatedHealth < 0.0f)) ** GOTO lbl76
                if (var13_5) ** GOTO lbl6
                this.animatedHealth = this.health;
                if (var13_5) ** GOTO lbl6
lbl76:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                if (!(this.animatedBaseHealth < 0.0f)) ** GOTO lbl81
                if (var13_5) ** GOTO lbl6
                this.animatedBaseHealth = this.baseHealth;
                if (var13_5) ** GOTO lbl6
lbl81:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                this.animatedHealth += (this.health - this.animatedHealth) * var6_8;
                if (var13_5 || var13_5) ** GOTO lbl6
                this.animatedBaseHealth += (this.baseHealth - this.animatedBaseHealth) * var6_8;
                if (var13_5 || var13_5) ** GOTO lbl6
                this.animatedAbsorption += (this.absorptionHealth - this.animatedAbsorption) * var6_8;
                if (var13_5 || var13_5) ** GOTO lbl6
                var9_11 = (float)var2_2 / ef.ajfd("ajiu", ajfn(int ), (int)62) * ef.easeOutCubic(this.visibility);
                if (var13_5 || var13_5) ** GOTO lbl6
                Arrays.fill(this.queuedCounts, null);
                if (var13_5 || var13_5) ** GOTO lbl6
                this.queuedCountOpacity = var9_11;
                if (var13_5 || var13_5) ** GOTO lbl6
                this.setWidth((int)Math.ceil((double)ef.ajfd("ajiv", ajfg(int ), (int)27)));
                if (var13_5 || var13_5) ** GOTO lbl6
                this.setHeight((int)Math.ceil((double)ef.ajfd("ajiw", ajfg(int ), (int)28)));
                if (var13_5 || var13_5) ** GOTO lbl6
                var10_12 = this.getX();
                if (var13_5 || var13_5) ** GOTO lbl6
                var11_13 = this.getY();
                if (var13_5 || var13_5) ** GOTO lbl6
                var12_14 = var11_13 + ef.ajfd("ajix", ajfn(int ), (int)63) + ef.ajfd("ajiy", ajfn(int ), (int)64);
                if (var13_5 || var13_5) ** GOTO lbl6
                this.drawEquipmentPanel(var1_1, var10_12, var11_13, (float)ef.ajfd("ajiz", ajfn(int ), (int)65), this.armor, ef.ARMOR, (float)ef.ajfd("ajja", ajfn(int ), (int)66), (float)ef.ajfd("ajjb", ajfn(int ), (int)67), var9_11, var6_8, (boolean)ef.ajfd("ajjc", ajfa(int ), (int)68));
                if (var13_5 || var13_5) ** GOTO lbl6
                this.drawEquipmentPanel(var1_1, var10_12 + ef.ajfd("ajjd", ajfn(int ), (int)69) - ef.ajfd("ajje", ajfn(int ), (int)70), var11_13, (float)ef.ajfd("ajjf", ajfn(int ), (int)71), this.hands, ef.HANDS, (float)ef.ajfd("ajjg", ajfn(int ), (int)72), (float)ef.ajfd("ajjh", ajfn(int ), (int)73), var9_11, var6_8, (boolean)ef.ajfd("ajji", ajfa(int ), (int)74));
                if (var13_5 || var13_5) ** GOTO lbl6
                this.drawMain(var1_1, var10_12, var12_14, var9_11, var5_7);
                if (!var13_5 && !var13_5) ** break;
                ** continue;
                return;
            }
lbl112:
            // 2 sources

            case 0: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjj", ajfa(int ), (int)75);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 1: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjk", ajfa(int ), (int)76);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 2: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjl", ajfa(int ), (int)77);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl127:
            // 4 sources

            case 3: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjm", ajfa(int ), (int)78);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl132:
            // 3 sources

            case 4: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjn", ajfa(int ), (int)79);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 5: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjo", ajfa(int ), (int)80);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl444
            }
            case 6: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjp", ajfa(int ), (int)81);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl147:
            // 2 sources

            case 7: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjq", ajfa(int ), (int)82);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 8: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjr", ajfa(int ), (int)83);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl432
            }
            case 9: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjs", ajfa(int ), (int)84);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl162:
            // 2 sources

            case 10: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjt", ajfa(int ), (int)85);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 11: {
                var14_4 /* !! */  = (int)ef.ajfd("ajju", ajfa(int ), (int)86);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl172:
            // 3 sources

            case 12: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjv", ajfa(int ), (int)87);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl177:
            // 4 sources

            case 13: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjw", ajfa(int ), (int)88);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl182:
            // 2 sources

            case 14: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjx", ajfa(int ), (int)89);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl187:
            // 3 sources

            case 15: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjy", ajfa(int ), (int)90);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl479
            }
lbl192:
            // 10 sources

            case 16: {
                var14_4 /* !! */  = (int)ef.ajfd("ajjz", ajfa(int ), (int)91);
                if (!var15_3) ** GOTO lbl172
                throw null;
            }
lbl196:
            // 2 sources

            case 17: {
                var14_4 /* !! */  = (int)ef.ajfd("ajka", ajfa(int ), (int)92);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl201:
            // 3 sources

            case 18: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkb", ajfa(int ), (int)93);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
lbl205:
            // 2 sources

            case 19: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkc", ajfa(int ), (int)94);
                if (!var15_3) ** GOTO lbl127
                throw null;
            }
lbl209:
            // 3 sources

            case 20: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkd", ajfa(int ), (int)95);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl214:
            // 2 sources

            case 21: {
                var14_4 /* !! */  = (int)ef.ajfd("ajke", ajfa(int ), (int)96);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 22: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkf", ajfa(int ), (int)97);
                if (!var15_3) ** GOTO lbl201
                throw null;
            }
lbl223:
            // 2 sources

            case 23: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkg", ajfa(int ), (int)98);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 24: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkh", ajfa(int ), (int)99);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 25: {
                var14_4 /* !! */  = (int)ef.ajfd("ajki", ajfa(int ), (int)100);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
lbl237:
            // 2 sources

            case 26: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkj", ajfa(int ), (int)101);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl432
            }
            case 27: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkk", ajfa(int ), (int)102);
                if (!var15_3) ** GOTO lbl214
                throw null;
            }
lbl246:
            // 2 sources

            case 28: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkl", ajfa(int ), (int)103);
                if (!var15_3) ** GOTO lbl132
                throw null;
            }
            case 29: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkm", ajfa(int ), (int)104);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl458
            }
lbl255:
            // 3 sources

            case 30: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkn", ajfa(int ), (int)105);
                if (!var15_3) ** GOTO lbl132
                throw null;
            }
lbl259:
            // 2 sources

            case 31: {
                var14_4 /* !! */  = (int)ef.ajfd("ajko", ajfa(int ), (int)106);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 32: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkp", ajfa(int ), (int)107);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
lbl268:
            // 3 sources

            case 33: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkq", ajfa(int ), (int)108);
                if (!var15_3) ** GOTO lbl196
                throw null;
            }
lbl272:
            // 2 sources

            case 34: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkr", ajfa(int ), (int)109);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl479
            }
            case 35: {
                var14_4 /* !! */  = (int)ef.ajfd("ajks", ajfa(int ), (int)110);
                if (!var15_3) ** GOTO lbl259
                throw null;
            }
lbl281:
            // 2 sources

            case 36: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkt", ajfa(int ), (int)111);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
lbl285:
            // 3 sources

            case 37: {
                var14_4 /* !! */  = (int)ef.ajfd("ajku", ajfa(int ), (int)112);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl411
            }
lbl290:
            // 2 sources

            case 38: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkv", ajfa(int ), (int)113);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
lbl294:
            // 2 sources

            case 39: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkw", ajfa(int ), (int)114);
                if (!var15_3) ** GOTO lbl187
                throw null;
            }
lbl298:
            // 2 sources

            case 40: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkx", ajfa(int ), (int)115);
                if (!var15_3) ** GOTO lbl246
                throw null;
            }
            case 41: {
                var14_4 /* !! */  = (int)ef.ajfd("ajky", ajfa(int ), (int)116);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl444
            }
lbl307:
            // 2 sources

            case 42: {
                var14_4 /* !! */  = (int)ef.ajfd("ajkz", ajfa(int ), (int)117);
                if (!var15_3) ** GOTO lbl112
                throw null;
            }
            case 43: {
                var14_4 /* !! */  = (int)ef.ajfd("ajla", ajfa(int ), (int)118);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl432
            }
lbl316:
            // 2 sources

            case 44: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlb", ajfa(int ), (int)119);
                if (!var15_3) ** GOTO lbl162
                throw null;
            }
lbl320:
            // 2 sources

            case 45: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlc", ajfa(int ), (int)120);
                if (!var15_3) ** GOTO lbl187
                throw null;
            }
lbl324:
            // 2 sources

            case 46: {
                var14_4 /* !! */  = (int)ef.ajfd("ajld", ajfa(int ), (int)121);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl397
            }
            case 47: {
                var14_4 /* !! */  = (int)ef.ajfd("ajle", ajfa(int ), (int)122);
                if (!var15_3) ** GOTO lbl127
                throw null;
            }
            case 48: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlf", ajfa(int ), (int)123);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl370
            }
            case 49: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlg", ajfa(int ), (int)124);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
            case 50: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlh", ajfa(int ), (int)125);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl347:
            // 2 sources

            case 51: {
                var14_4 /* !! */  = (int)ef.ajfd("ajli", ajfa(int ), (int)126);
                if (!var15_3) ** GOTO lbl209
                throw null;
            }
lbl351:
            // 3 sources

            case 52: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlj", ajfa(int ), (int)127);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl428
            }
            case 53: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlk", ajfa(int ), (int)128);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl361:
            // 2 sources

            case 54: {
                var14_4 /* !! */  = (int)ef.ajfd("ajll", ajfa(int ), (int)129);
                if (!var15_3) ** GOTO lbl209
                throw null;
            }
lbl365:
            // 2 sources

            case 55: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlm", ajfa(int ), (int)130);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl444
            }
lbl370:
            // 3 sources

            case 56: {
                var14_4 /* !! */  = (int)ef.ajfd("ajln", ajfa(int ), (int)131);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl479
            }
            case 57: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlo", ajfa(int ), (int)132);
                if (!var15_3) ** GOTO lbl147
                throw null;
            }
            case 58: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlp", ajfa(int ), (int)133);
                if (!var15_3) ** GOTO lbl290
                throw null;
            }
            case 59: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlq", ajfa(int ), (int)134);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl388:
            // 2 sources

            case 60: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlr", ajfa(int ), (int)135);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
            case 61: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_4 /* !! */  = (int)ef.ajfd("ajls", ajfa(int ), (int)136);
                    if (!var15_3) ** GOTO lbl351
                    throw null;
                }
            }
lbl397:
            // 2 sources

            case 62: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlt", ajfa(int ), (int)137);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl453
            }
            case 63: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlu", ajfa(int ), (int)138);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl462
            }
            case 64: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlv", ajfa(int ), (int)139);
                if (!var15_3) ** GOTO lbl285
                throw null;
            }
lbl411:
            // 2 sources

            case 65: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlw", ajfa(int ), (int)140);
                if (!var15_3) ** GOTO lbl272
                throw null;
            }
            case 66: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlx", ajfa(int ), (int)141);
                if (!var15_3) ** GOTO lbl351
                throw null;
            }
            case 67: {
                var14_4 /* !! */  = (int)ef.ajfd("ajly", ajfa(int ), (int)142);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl492
            }
            case 68: {
                var14_4 /* !! */  = (int)ef.ajfd("ajlz", ajfa(int ), (int)143);
                if (!var15_3) ** GOTO lbl192
                throw null;
            }
lbl428:
            // 3 sources

            case 69: {
                var14_4 /* !! */  = (int)ef.ajfd("ajma", ajfa(int ), (int)144);
                if (!var15_3) ** GOTO lbl177
                throw null;
            }
lbl432:
            // 4 sources

            case 70: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmb", ajfa(int ), (int)145);
                if (!var15_3) ** GOTO lbl361
                throw null;
            }
            case 71: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmc", ajfa(int ), (int)146);
                if (!var15_3) ** GOTO lbl294
                throw null;
            }
lbl440:
            // 2 sources

            case 72: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmd", ajfa(int ), (int)147);
                if (!var15_3) ** GOTO lbl428
                throw null;
            }
lbl444:
            // 4 sources

            case 73: {
                var14_4 /* !! */  = (int)ef.ajfd("ajme", ajfa(int ), (int)148);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl475
            }
            case 74: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmf", ajfa(int ), (int)149);
                if (!var15_3) ** GOTO lbl370
                throw null;
            }
lbl453:
            // 2 sources

            case 75: {
                do {
                    var14_4 /* !! */  = (int)ef.ajfd("ajmg", ajfa(int ), (int)150);
                } while (!var15_3);
                throw null;
            }
lbl458:
            // 2 sources

            case 76: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmh", ajfa(int ), (int)151);
                if (!var15_3) ** GOTO lbl127
                throw null;
            }
lbl462:
            // 4 sources

            case 77: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmi", ajfa(int ), (int)152);
                if (!var15_3) ** GOTO lbl347
                throw null;
            }
lbl466:
            // 3 sources

            case 78: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmj", ajfa(int ), (int)153);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl479
            }
lbl471:
            // 2 sources

            case 79: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmk", ajfa(int ), (int)154);
                if (!var15_3) ** GOTO lbl285
                throw null;
            }
lbl475:
            // 2 sources

            case 80: {
                var14_4 /* !! */  = (int)ef.ajfd("ajml", ajfa(int ), (int)155);
                if (!var15_3) ** GOTO lbl177
                throw null;
            }
lbl479:
            // 5 sources

            case 81: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmm", ajfa(int ), (int)156);
                if (!var15_3) ** GOTO lbl316
                throw null;
            }
            case 82: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmn", ajfa(int ), (int)157);
                if (!var15_3) ** GOTO lbl172
                throw null;
            }
            case 83: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmo", ajfa(int ), (int)158);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl496
            }
lbl492:
            // 2 sources

            case 84: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmp", ajfa(int ), (int)159);
                if (!var15_3) ** GOTO lbl177
                throw null;
            }
lbl496:
            // 2 sources

            case 85: {
                var14_4 /* !! */  = (int)ef.ajfd("ajmq", ajfa(int ), (int)160);
                if (!var15_3) ** GOTO lbl182
                throw null;
            }
            case 86: 
        }
        var14_4 /* !! */  = (int)ef.ajfd("ajmr", ajfa(int ), (int)161);
        ** while (!var15_3)
lbl503:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawItem(class_332 var1_1, class_1799 var2_2, float var3_3, float var4_4, float var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ef.ca - ef.ajfd("amaz", ajgj(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ef.ajfd("ambb", ajfa(int ), (int)748)) break;
            v0 /* !! */  = (long)ef.ajfd("ambf", ajfa(int ), (int)749);
        }
        var11_6 = ef.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ef.ca - ef.ajfd("ambh", ajgj(int ), (int)113)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ef.ajfd("ambk", ajfa(int ), (int)750)) break;
            v1 /* !! */  = (long)ef.ajfd("ambl", ajfa(int ), (int)751);
        }
        var10_7 /* !! */  = ef.b;
        v2 /* !! */  = ef.ca;
        if (true) ** GOTO lbl17
        block52: while (true) {
            v2 /* !! */  = (long)(v3 - ef.ajfd("ambm", ajgj(int ), (int)114));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2121768278: {
                    v3 = ef.ajfd("ambn", ajgj(int ), (int)115);
                    continue block52;
                }
                case -1950111587: {
                    v3 = ef.ajfd("ambo", ajgj(int ), (int)116);
                    continue block52;
                }
                case -1872270231: {
                    break block52;
                }
                case -859534709: {
                    v3 = ef.ajfd("ambr", ajgj(int ), (int)117);
                    continue block52;
                }
            }
            break;
        }
        var9_8 = ef.a;
        if (var11_6) {
            throw null;
lbl32:
            // 10 sources

            return;
        }
        if (var9_8 || var9_8) ** GOTO lbl32
        if (var10_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ef.ca;
                if (true) ** GOTO lbl42
                block54: while (true) {
                    v4 /* !! */  = (long)(v5 - ef.ajfd("ambs", ajgj(int ), (int)118));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1872270231: {
                            break block54;
                        }
                        case -530410376: {
                            v5 = ef.ajfd("ambu", ajgj(int ), (int)119);
                            continue block54;
                        }
                        case 1517027373: {
                            v5 = ef.ajfd("ambv", ajgj(int ), (int)120);
                            continue block54;
                        }
                    }
                    break;
                }
                v6 = 2.0f * ki.getContextScale();
                v7 = ef.ajfd("ambw", ajfa(int ), (int)752);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ef.ca - ef.ajfd("amby", ajgj(int ), (int)121)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ef.ajfd("ambz", ajfa(int ), (int)753)) break;
                    v8 /* !! */  = (long)ef.ajfd("amca", ajfa(int ), (int)754);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ef.ca - ef.ajfd("amcb", ajgj(int ), (int)122)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ef.ajfd("amcc", ajfa(int ), (int)755)) break;
                    v9 /* !! */  = (long)ef.ajfd("amcd", ajfa(int ), (int)756);
                }
                v10 = this.mc.method_22683();
                v11 /* !! */  = ef.ca;
                if (true) ** GOTO lbl68
                block57: while (true) {
                    v11 /* !! */  = (long)(ef.ajfd("amcg", ajgj(int ), (int)124) - ef.ajfd("amcf", ajgj(int ), (int)123));
lbl68:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1872270231: {
                            break block57;
                        }
                        case -1256033690: {
                            continue block57;
                        }
                    }
                    break;
                }
                v12 = v10.method_4495();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ef.ca - ef.ajfd("amch", ajgj(int ), (int)125)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ef.ajfd("amci", ajfa(int ), (int)757)) break;
                    v13 /* !! */  = (long)ef.ajfd("amcj", ajfa(int ), (int)758);
                }
                var6_9 = v6 / (float)Math.max((int)v7, v12);
                if (var9_8 || var9_8) ** GOTO lbl32
                var7_10 = var5_5 * var6_9 / ef.ajfd("amcm", ajfn(int ), (int)759);
                if (var9_8 || var9_8) ** GOTO lbl32
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = ef.ca - ef.ajfd("amco", ajgj(int ), (int)126)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ef.ajfd("amcs", ajfa(int ), (int)760)) break;
                    v14 /* !! */  = (long)ef.ajfd("amct", ajfa(int ), (int)761);
                }
                var8_11 = var1_1.method_51448();
                if (var9_8 || var9_8) ** GOTO lbl32
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = ef.ca - ef.ajfd("amcu", ajgj(int ), (int)127)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ef.ajfd("amcv", ajfa(int ), (int)762)) break;
                    v15 /* !! */  = (long)ef.ajfd("amcx", ajfa(int ), (int)763);
                }
                var8_11.pushMatrix();
                if (var9_8 || var9_8) ** GOTO lbl32
                v16 /* !! */  = ef.ca;
                if (true) ** GOTO lbl101
                block61: while (true) {
                    v16 /* !! */  = (long)(v17 - ef.ajfd("amdc", ajgj(int ), (int)128));
lbl101:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1872270231: {
                            break block61;
                        }
                        case 275238629: {
                            v17 = ef.ajfd("amde", ajgj(int ), (int)129);
                            continue block61;
                        }
                        case 654394368: {
                            v17 = ef.ajfd("amdg", ajgj(int ), (int)130);
                            continue block61;
                        }
                        case 1019974565: {
                            v17 = ef.ajfd("amdh", ajgj(int ), (int)131);
                            continue block61;
                        }
                    }
                    break;
                }
                var8_11.translate(var3_3 * var6_9, var4_4 * var6_9);
                if (var9_8 || var9_8) ** GOTO lbl32
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = ef.ca - ef.ajfd("amdi", ajgj(int ), (int)132)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ef.ajfd("amdj", ajfa(int ), (int)764)) break;
                    v18 /* !! */  = (long)ef.ajfd("amdk", ajfa(int ), (int)765);
                }
                var8_11.scale(var7_10, var7_10);
                if (var9_8 || var9_8) ** GOTO lbl32
                v19 = ef.ajfd("amdl", ajfa(int ), (int)766);
                v20 = ef.ajfd("amdm", ajfa(int ), (int)767);
                v21 /* !! */  = ef.ca;
                if (true) ** GOTO lbl129
                block63: while (true) {
                    v21 /* !! */  = (long)(v22 - ef.ajfd("amdt", ajgj(int ), (int)133));
lbl129:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1872270231: {
                            break block63;
                        }
                        case -1825691807: {
                            v22 = ef.ajfd("amdw", ajgj(int ), (int)134);
                            continue block63;
                        }
                        case 1525679283: {
                            v22 = ef.ajfd("amdy", ajgj(int ), (int)135);
                            continue block63;
                        }
                    }
                    break;
                }
                var1_1.method_51427(var2_2, (int)v19, (int)v20);
                if (var9_8 || var9_8) ** GOTO lbl32
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = ef.ca - ef.ajfd("ameb", ajgj(int ), (int)136)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ef.ajfd("amer", ajfa(int ), (int)768)) break;
                    v23 /* !! */  = (long)ef.ajfd("amet", ajfa(int ), (int)769);
                }
                var8_11.popMatrix();
                if (var9_8 || var9_8) ** GOTO lbl32
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_9 = ef.ca - ef.ajfd("amew", ajgj(int ), (int)137)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ef.ajfd("amfa", ajfa(int ), (int)770)) break;
                    v24 /* !! */  = (long)ef.ajfd("amfc", ajfa(int ), (int)771);
                }
                dv.markItemModelQueued();
                if (var9_8 || var9_8) ** continue;
                return;
            }
            case 0: {
                var10_7 /* !! */  = (int)ef.ajfd("amfd", ajfa(int ), (int)772);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl160:
            // 2 sources

            case 1: {
                var10_7 /* !! */  = (int)ef.ajfd("amfe", ajfa(int ), (int)773);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 2: {
                var10_7 /* !! */  = (int)ef.ajfd("amfg", ajfa(int ), (int)774);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl170:
            // 2 sources

            case 3: {
                var10_7 /* !! */  = (int)ef.ajfd("amfi", ajfa(int ), (int)775);
                if (!var11_6) ** GOTO lbl160
                throw null;
            }
            case 4: {
                var10_7 /* !! */  = (int)ef.ajfd("amfl", ajfa(int ), (int)776);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 5: {
                var10_7 /* !! */  = (int)ef.ajfd("amfp", ajfa(int ), (int)777);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl184:
            // 4 sources

            case 6: {
                var10_7 /* !! */  = (int)ef.ajfd("amfq", ajfa(int ), (int)778);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 7: {
                var10_7 /* !! */  = (int)ef.ajfd("amfr", ajfa(int ), (int)779);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl194:
            // 2 sources

            case 8: {
                var10_7 /* !! */  = (int)ef.ajfd("amfu", ajfa(int ), (int)780);
                if (var11_6) {
                    throw null;
                }
            }
            case 9: {
                var10_7 /* !! */  = (int)ef.ajfd("amfw", ajfa(int ), (int)781);
                if (!var11_6) ** GOTO lbl184
                throw null;
            }
lbl202:
            // 4 sources

            case 10: {
                var10_7 /* !! */  = (int)ef.ajfd("amfz", ajfa(int ), (int)782);
                if (!var11_6) break;
                throw null;
            }
lbl206:
            // 2 sources

            case 11: {
                var10_7 /* !! */  = (int)ef.ajfd("amgb", ajfa(int ), (int)783);
                if (!var11_6) ** GOTO lbl194
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_7 /* !! */  = (int)ef.ajfd("amgc", ajfa(int ), (int)784);
                    if (!var11_6) ** GOTO lbl170
                    throw null;
                }
            }
            case 13: {
                var10_7 /* !! */  = (int)ef.ajfd("amgf", ajfa(int ), (int)785);
                if (!var11_6) ** GOTO lbl202
                throw null;
            }
lbl219:
            // 2 sources

            case 14: {
                do {
                    var10_7 /* !! */  = (int)ef.ajfd("amgg", ajfa(int ), (int)786);
                } while (!var11_6);
                throw null;
            }
lbl224:
            // 3 sources

            case 15: {
                var10_7 /* !! */  = (int)ef.ajfd("amgh", ajfa(int ), (int)787);
                if (!var11_6) ** GOTO lbl184
                throw null;
            }
            case 16: {
                var10_7 /* !! */  = (int)ef.ajfd("amgi", ajfa(int ), (int)788);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl233:
            // 3 sources

            case 17: {
                var10_7 /* !! */  = (int)ef.ajfd("amgl", ajfa(int ), (int)789);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl238:
            // 2 sources

            case 18: {
                var10_7 /* !! */  = (int)ef.ajfd("amgq", ajfa(int ), (int)790);
                if (!var11_6) ** GOTO lbl219
                throw null;
            }
lbl242:
            // 3 sources

            case 19: {
                var10_7 /* !! */  = (int)ef.ajfd("amgr", ajfa(int ), (int)791);
                if (!var11_6) ** GOTO lbl224
                throw null;
            }
            case 20: {
                var10_7 /* !! */  = (int)ef.ajfd("amgt", ajfa(int ), (int)792);
                if (!var11_6) ** GOTO lbl184
                throw null;
            }
            case 21: 
        }
        var10_7 /* !! */  = (int)ef.ajfd("amgv", ajfa(int ), (int)793);
        ** while (!var11_6)
lbl253:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aniq() {
        ef.ajfc[0] = -1659521253;
        ef.ajfc[1] = -701822369;
        ef.ajfc[2] = 675610508;
        ef.ajfc[3] = 408096828;
        ef.ajfc[4] = 209813027;
        ef.ajfc[5] = 654648934;
        ef.ajfc[6] = 637297961;
        ef.ajfc[7] = -944969405;
        ef.ajfc[8] = 1275406117;
        ef.ajfc[9] = -888601553;
        ef.ajfc[10] = 1393622605;
        ef.ajfc[11] = 1694925411;
        ef.ajfc[12] = -1834332273;
        ef.ajfc[13] = -903746389;
        ef.ajfc[14] = 2136653462;
        ef.ajfc[15] = -1659799783;
        ef.ajfc[16] = -1296985614;
        ef.ajfc[17] = 719778512;
        ef.ajfc[18] = 2020097731;
        ef.ajfc[19] = -1395021029;
        ef.ajfc[20] = 1238402459;
        ef.ajfc[21] = 1862343267;
        ef.ajfc[22] = -881129866;
        ef.ajfc[23] = -1658402099;
        ef.ajfc[24] = -1509054476;
        ef.ajfc[25] = 1653661434;
        ef.ajfc[26] = 757528618;
        ef.ajfc[27] = 1567051275;
        ef.ajfc[28] = 1443453326;
        ef.ajfc[29] = 931955112;
        ef.ajfc[30] = -1762616556;
        ef.ajfc[31] = -403227842;
        ef.ajfc[32] = -1619252001;
        ef.ajfc[33] = -805677859;
        ef.ajfc[34] = -1898359027;
        ef.ajfc[35] = 494532085;
        ef.ajfc[36] = -173410733;
        ef.ajfc[37] = 1205912688;
        ef.ajfc[38] = -1008477183;
        ef.ajfc[39] = 1698542596;
        ef.ajfc[40] = -1993639020;
        ef.ajfc[41] = 2037038103;
        ef.ajfc[42] = -2059337099;
        ef.ajfc[43] = -1550641371;
        ef.ajfc[44] = 1054957477;
        ef.ajfc[45] = 790958045;
        ef.ajfc[46] = 302228572;
        ef.ajfc[47] = 1812863634;
        ef.ajfc[48] = -1289090367;
        ef.ajfc[49] = 39275862;
        ef.ajfc[50] = 1390242451;
        ef.ajfc[51] = -3398372;
        ef.ajfc[52] = -1724211673;
        ef.ajfc[53] = -1019177282;
        ef.ajfc[54] = -1449200149;
        ef.ajfc[55] = -2130431254;
        ef.ajfc[56] = -704468785;
        ef.ajfc[57] = 443502409;
        ef.ajfc[58] = -672064955;
        ef.ajfc[59] = 1194353765;
        ef.ajfc[60] = 200630958;
        ef.ajfc[61] = 1935568655;
        ef.ajfc[62] = 984536441;
        ef.ajfc[63] = 1418137892;
        ef.ajfc[64] = 864406054;
        ef.ajfc[65] = 1567336365;
        ef.ajfc[66] = -1532997962;
        ef.ajfc[67] = 69474444;
        ef.ajfc[68] = 1679508857;
        ef.ajfc[69] = 194355791;
        ef.ajfc[70] = -204755007;
        ef.ajfc[71] = -346084271;
        ef.ajfc[72] = -1883949122;
        ef.ajfc[73] = -965389719;
        ef.ajfc[74] = -2095519947;
        ef.ajfc[75] = -500952731;
        ef.ajfc[76] = 2050851730;
        ef.ajfc[77] = 803695011;
        ef.ajfc[78] = 204574421;
        ef.ajfc[79] = 49005111;
        ef.ajfc[80] = 1220761960;
        ef.ajfc[81] = -641569146;
        ef.ajfc[82] = 44988144;
        ef.ajfc[83] = 1689272645;
        ef.ajfc[84] = 904714377;
        ef.ajfc[85] = 412214063;
        ef.ajfc[86] = 947706125;
        ef.ajfc[87] = -323845899;
        ef.ajfc[88] = 1089682524;
        ef.ajfc[89] = -934239425;
        ef.ajfc[90] = 1183944899;
        ef.ajfc[91] = 303461541;
        ef.ajfc[92] = -992077337;
        ef.ajfc[93] = 395750677;
        ef.ajfc[94] = -971211033;
        ef.ajfc[95] = 17211136;
        ef.ajfc[96] = 1844867477;
        ef.ajfc[97] = -1002583489;
        ef.ajfc[98] = -185828627;
        ef.ajfc[99] = -1538149997;
    }

    private static /* synthetic */ void anee() {
        ef.ajfb[600] = -1118199485;
        ef.ajfb[601] = -866168557;
        ef.ajfb[602] = 258043885;
        ef.ajfb[603] = 1100030372;
        ef.ajfb[604] = -1350747949;
        ef.ajfb[605] = 2113788686;
        ef.ajfb[606] = 1218724353;
        ef.ajfb[607] = -423031135;
        ef.ajfb[608] = 541932673;
        ef.ajfb[609] = -942510272;
        ef.ajfb[610] = -600072184;
        ef.ajfb[611] = 707340437;
        ef.ajfb[612] = 1487504039;
        ef.ajfb[613] = -1665292078;
        ef.ajfb[614] = -1500414092;
        ef.ajfb[615] = -480195947;
        ef.ajfb[616] = 70178937;
        ef.ajfb[617] = 2111839744;
        ef.ajfb[618] = 1598660194;
        ef.ajfb[619] = -832560285;
        ef.ajfb[620] = 2129135715;
        ef.ajfb[621] = 1177653344;
        ef.ajfb[622] = -358209307;
        ef.ajfb[623] = 2142922959;
        ef.ajfb[624] = -1955491312;
        ef.ajfb[625] = 1950787093;
        ef.ajfb[626] = 349774747;
        ef.ajfb[627] = 596617375;
        ef.ajfb[628] = -1826433143;
        ef.ajfb[629] = -908417422;
        ef.ajfb[630] = -1206056563;
        ef.ajfb[631] = -908932818;
        ef.ajfb[632] = -776487363;
        ef.ajfb[633] = -132782460;
        ef.ajfb[634] = -1758381882;
        ef.ajfb[635] = -2097835924;
        ef.ajfb[636] = 1008865737;
        ef.ajfb[637] = -1176445222;
        ef.ajfb[638] = 545068272;
        ef.ajfb[639] = -699546404;
        ef.ajfb[640] = -1361435984;
        ef.ajfb[641] = 1847532064;
        ef.ajfb[642] = -1796798706;
        ef.ajfb[643] = -1258046985;
        ef.ajfb[644] = -545624746;
        ef.ajfb[645] = -1448315253;
        ef.ajfb[646] = -828720608;
        ef.ajfb[647] = -611590481;
        ef.ajfb[648] = -1746254674;
        ef.ajfb[649] = -1213569201;
        ef.ajfb[650] = -506709987;
        ef.ajfb[651] = -2009980413;
        ef.ajfb[652] = 320327043;
        ef.ajfb[653] = -313381126;
        ef.ajfb[654] = -1304702734;
        ef.ajfb[655] = -547930120;
        ef.ajfb[656] = -1669216867;
        ef.ajfb[657] = -1604565994;
        ef.ajfb[658] = 639166121;
        ef.ajfb[659] = 1219316343;
        ef.ajfb[660] = 1221977231;
        ef.ajfb[661] = 1935431486;
        ef.ajfb[662] = 136318772;
        ef.ajfb[663] = -725481732;
        ef.ajfb[664] = 921751120;
        ef.ajfb[665] = 1031055450;
        ef.ajfb[666] = -1045225476;
        ef.ajfb[667] = -1166348623;
        ef.ajfb[668] = 30992616;
        ef.ajfb[669] = -1178949664;
        ef.ajfb[670] = -1871702818;
        ef.ajfb[671] = 1628432235;
        ef.ajfb[672] = 639470695;
        ef.ajfb[673] = 1104285662;
        ef.ajfb[674] = -1816792696;
        ef.ajfb[675] = 1546587238;
        ef.ajfb[676] = 462969361;
        ef.ajfb[677] = 1843588479;
        ef.ajfb[678] = 1138032530;
        ef.ajfb[679] = -1077602742;
        ef.ajfb[680] = -802767568;
        ef.ajfb[681] = -1922937505;
        ef.ajfb[682] = 2023361924;
        ef.ajfb[683] = -729073347;
        ef.ajfb[684] = 1422775514;
        ef.ajfb[685] = 2137817362;
        ef.ajfb[686] = -574974050;
        ef.ajfb[687] = 1731496641;
        ef.ajfb[688] = -1122284001;
        ef.ajfb[689] = -1444205405;
        ef.ajfb[690] = 2074212413;
        ef.ajfb[691] = -417183583;
        ef.ajfb[692] = -54921347;
        ef.ajfb[693] = 1269863816;
        ef.ajfb[694] = 545130073;
        ef.ajfb[695] = 539462454;
        ef.ajfb[696] = -1856437099;
        ef.ajfb[697] = 2052384062;
        ef.ajfb[698] = -362034906;
        ef.ajfb[699] = 844776201;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void snapshot(class_1309 var1_1) {
        block162: {
            block161: {
                block160: {
                    var9_2 = ef.c;
                    var8_3 /* !! */  = ef.b;
                    var7_4 = ef.a;
                    if (var9_2) {
                        throw null;
lbl6:
                        // 41 sources

                        return;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    this.targetName = fb.protect(var1_1.method_5477().getString());
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var1_1 instanceof class_742) {
                        var2_5 = (class_742)var1_1;
                        v0 = var2_5.method_52814().comp_1626().comp_3627();
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        v0 = this.skin = null;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    this.maxHealth = Math.max(1.0f, var1_1.method_6063());
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (!fk.enabled()) break block160;
                    if (var7_4) ** GOTO lbl6
                    if (!(var1_1 instanceof class_1657)) break block160;
                    if (var7_4) ** GOTO lbl6
                    v1 = ef.ajfd("alqz", ajfa(int ), (int)641);
                    if (var9_2) {
                        throw null;
                    }
                    break block161;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                v1 = var2_6 = ef.ajfd("alrc", ajfa(int ), (int)642);
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            if (var2_6 == false) break block162;
            if (var7_4 || var7_4) ** GOTO lbl6
            this.health = Math.max(0.0f, np.scoreboardTotal(var1_1));
            if (var7_4 || var7_4) ** GOTO lbl6
            this.baseHealth = class_3532.method_15363((float)this.health, (float)0.0f, (float)this.maxHealth);
            if (var7_4 || var7_4) ** GOTO lbl6
            this.absorptionHealth = 0.0f;
            if (var7_4) ** GOTO lbl6
            if (var9_2) {
                throw null;
            }
            ** GOTO lbl64
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        this.health = var1_1.method_6032() + var1_1.method_6067();
        if (var7_4 || var7_4) ** GOTO lbl6
        var3_7 = var1_1.method_6032();
        if (var7_4 || var7_4) ** GOTO lbl6
        if (var3_7 > this.maxHealth * ef.ajfd("alrk", ajfn(int ), (int)643)) {
            v2 = class_3532.method_15363((float)this.health, (float)0.0f, (float)this.maxHealth);
            if (var9_2) {
                throw null;
            }
        } else {
            v2 = this.baseHealth = class_3532.method_15363((float)var3_7, (float)0.0f, (float)this.maxHealth);
        }
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                this.absorptionHealth = Math.max(var1_1.method_6067(), this.health - this.baseHealth);
                if (var7_4) ** GOTO lbl6
lbl64:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.scoreboardHealthActive == var2_6) ** GOTO lbl75
                if (var7_4 || var7_4) ** GOTO lbl6
                this.scoreboardHealthActive = var2_6;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.animatedHealth = this.health;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.animatedBaseHealth = this.baseHealth;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.animatedAbsorption = this.absorptionHealth;
                if (var7_4) ** GOTO lbl6
lbl75:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var3_8 = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
                if (var7_4 || var7_4) ** GOTO lbl6
                var4_9 = ef.ajfd("alrs", ajfa(int ), (int)644);
                if (var7_4) ** GOTO lbl6
                do {
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var4_9 >= ef.ARMOR.length) ** GOTO lbl99
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var5_10 = var3_8[var4_9];
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var6_11 = var1_1.method_6118(var5_10);
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var6_11 == null) {
                        v3 = class_1799.field_8037;
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        v3 = this.armor[var4_9] = var6_11;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    ++var4_9;
                    if (var7_4) ** GOTO lbl6
                } while (!var9_2);
                throw null;
lbl99:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var4_9 = ef.ajfd("alrw", ajfa(int ), (int)645);
                if (var7_4) ** GOTO lbl6
                do {
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var4_9 >= ef.HANDS.length) ** GOTO lbl119
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var5_10 = var1_1.method_6118(ef.HANDS[var4_9]);
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var5_10 == null) {
                        v4 = class_1799.field_8037;
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        v4 = this.hands[var4_9] = var5_10;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    ++var4_9;
                    if (var7_4) ** GOTO lbl6
                } while (!var9_2);
                throw null;
lbl119:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_3 /* !! */  = (int)ef.ajfd("alsc", ajfa(int ), (int)646);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl127:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)ef.ajfd("alsd", ajfa(int ), (int)647);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl132:
            // 2 sources

            case 2: {
                var8_3 /* !! */  = (int)ef.ajfd("alse", ajfa(int ), (int)648);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 3: {
                var8_3 /* !! */  = (int)ef.ajfd("alsf", ajfa(int ), (int)649);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 4: {
                var8_3 /* !! */  = (int)ef.ajfd("alsk", ajfa(int ), (int)650);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl147:
            // 4 sources

            case 5: {
                var8_3 /* !! */  = (int)ef.ajfd("alsl", ajfa(int ), (int)651);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 6: {
                var8_3 /* !! */  = (int)ef.ajfd("alsm", ajfa(int ), (int)652);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl157:
            // 4 sources

            case 7: {
                var8_3 /* !! */  = (int)ef.ajfd("alsn", ajfa(int ), (int)653);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl162:
            // 3 sources

            case 8: {
                var8_3 /* !! */  = (int)ef.ajfd("alsp", ajfa(int ), (int)654);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl167:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)ef.ajfd("alsr", ajfa(int ), (int)655);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 10: {
                var8_3 /* !! */  = (int)ef.ajfd("alst", ajfa(int ), (int)656);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl177:
            // 3 sources

            case 11: {
                var8_3 /* !! */  = (int)ef.ajfd("alsw", ajfa(int ), (int)657);
                if (!var9_2) ** GOTO lbl167
                throw null;
            }
            case 12: {
                var8_3 /* !! */  = (int)ef.ajfd("alsx", ajfa(int ), (int)658);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl186:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)ef.ajfd("alsy", ajfa(int ), (int)659);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 14: {
                var8_3 /* !! */  = (int)ef.ajfd("alta", ajfa(int ), (int)660);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 15: {
                var8_3 /* !! */  = (int)ef.ajfd("altc", ajfa(int ), (int)661);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl201:
            // 3 sources

            case 16: {
                var8_3 /* !! */  = (int)ef.ajfd("altg", ajfa(int ), (int)662);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 17: {
                var8_3 /* !! */  = (int)ef.ajfd("alti", ajfa(int ), (int)663);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl211:
            // 2 sources

            case 18: {
                var8_3 /* !! */  = (int)ef.ajfd("altk", ajfa(int ), (int)664);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl216:
            // 2 sources

            case 19: {
                var8_3 /* !! */  = (int)ef.ajfd("altl", ajfa(int ), (int)665);
                if (!var9_2) ** GOTO lbl132
                throw null;
            }
lbl220:
            // 3 sources

            case 20: {
                var8_3 /* !! */  = (int)ef.ajfd("alto", ajfa(int ), (int)666);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl225:
            // 2 sources

            case 21: {
                var8_3 /* !! */  = (int)ef.ajfd("altq", ajfa(int ), (int)667);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl417
            }
            case 22: {
                var8_3 /* !! */  = (int)ef.ajfd("alts", ajfa(int ), (int)668);
                if (!var9_2) ** GOTO lbl201
                throw null;
            }
            case 23: {
                var8_3 /* !! */  = (int)ef.ajfd("altv", ajfa(int ), (int)669);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl239:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)ef.ajfd("altx", ajfa(int ), (int)670);
                if (!var9_2) ** GOTO lbl186
                throw null;
            }
lbl243:
            // 3 sources

            case 25: {
                var8_3 /* !! */  = (int)ef.ajfd("alty", ajfa(int ), (int)671);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl248:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)ef.ajfd("alua", ajfa(int ), (int)672);
                if (!var9_2) ** GOTO lbl157
                throw null;
            }
            case 27: {
                var8_3 /* !! */  = (int)ef.ajfd("alud", ajfa(int ), (int)673);
                if (!var9_2) ** GOTO lbl211
                throw null;
            }
lbl256:
            // 3 sources

            case 28: {
                var8_3 /* !! */  = (int)ef.ajfd("alug", ajfa(int ), (int)674);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl261:
            // 2 sources

            case 29: {
                var8_3 /* !! */  = (int)ef.ajfd("alui", ajfa(int ), (int)675);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 30: {
                var8_3 /* !! */  = (int)ef.ajfd("aluj", ajfa(int ), (int)676);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl271:
            // 3 sources

            case 31: {
                var8_3 /* !! */  = (int)ef.ajfd("aluk", ajfa(int ), (int)677);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl276:
            // 5 sources

            case 32: {
                var8_3 /* !! */  = (int)ef.ajfd("alun", ajfa(int ), (int)678);
                if (!var9_2) ** GOTO lbl201
                throw null;
            }
            case 33: {
                var8_3 /* !! */  = (int)ef.ajfd("alup", ajfa(int ), (int)679);
                if (!var9_2) ** GOTO lbl162
                throw null;
            }
lbl284:
            // 2 sources

            case 34: {
                var8_3 /* !! */  = (int)ef.ajfd("alus", ajfa(int ), (int)680);
                if (!var9_2) ** GOTO lbl177
                throw null;
            }
lbl288:
            // 2 sources

            case 35: {
                var8_3 /* !! */  = (int)ef.ajfd("aluv", ajfa(int ), (int)681);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 36: {
                var8_3 /* !! */  = (int)ef.ajfd("aluw", ajfa(int ), (int)682);
                if (!var9_2) ** GOTO lbl256
                throw null;
            }
lbl297:
            // 3 sources

            case 37: {
                var8_3 /* !! */  = (int)ef.ajfd("alux", ajfa(int ), (int)683);
                if (!var9_2) ** GOTO lbl162
                throw null;
            }
lbl301:
            // 2 sources

            case 38: {
                var8_3 /* !! */  = (int)ef.ajfd("aluy", ajfa(int ), (int)684);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl450
            }
            case 39: {
                var8_3 /* !! */  = (int)ef.ajfd("aluz", ajfa(int ), (int)685);
                if (!var9_2) ** GOTO lbl276
                throw null;
            }
            case 40: {
                var8_3 /* !! */  = (int)ef.ajfd("alve", ajfa(int ), (int)686);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl315:
            // 2 sources

            case 41: {
                var8_3 /* !! */  = (int)ef.ajfd("alvg", ajfa(int ), (int)687);
                if (!var9_2) ** GOTO lbl147
                throw null;
            }
lbl319:
            // 2 sources

            case 42: {
                var8_3 /* !! */  = (int)ef.ajfd("alvi", ajfa(int ), (int)688);
                if (!var9_2) ** GOTO lbl261
                throw null;
            }
lbl323:
            // 2 sources

            case 43: {
                var8_3 /* !! */  = (int)ef.ajfd("alvk", ajfa(int ), (int)689);
                if (!var9_2) ** GOTO lbl157
                throw null;
            }
lbl327:
            // 2 sources

            case 44: {
                var8_3 /* !! */  = (int)ef.ajfd("alvl", ajfa(int ), (int)690);
                if (!var9_2) ** GOTO lbl157
                throw null;
            }
            case 45: {
                var8_3 /* !! */  = (int)ef.ajfd("alvm", ajfa(int ), (int)691);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 46: {
                var8_3 /* !! */  = (int)ef.ajfd("alvn", ajfa(int ), (int)692);
                if (!var9_2) ** GOTO lbl288
                throw null;
            }
lbl340:
            // 4 sources

            case 47: {
                do {
                    var8_3 /* !! */  = (int)ef.ajfd("alvs", ajfa(int ), (int)693);
                } while (!var9_2);
                throw null;
            }
lbl345:
            // 2 sources

            case 48: {
                var8_3 /* !! */  = (int)ef.ajfd("alvu", ajfa(int ), (int)694);
                if (var9_2) {
                    throw null;
                }
            }
            case 49: {
                var8_3 /* !! */  = (int)ef.ajfd("alvw", ajfa(int ), (int)695);
                if (!var9_2) ** GOTO lbl271
                throw null;
            }
lbl353:
            // 2 sources

            case 50: {
                var8_3 /* !! */  = (int)ef.ajfd("alvy", ajfa(int ), (int)696);
                if (!var9_2) ** GOTO lbl239
                throw null;
            }
lbl357:
            // 2 sources

            case 51: {
                var8_3 /* !! */  = (int)ef.ajfd("alvz", ajfa(int ), (int)697);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl445
            }
lbl362:
            // 2 sources

            case 52: {
                var8_3 /* !! */  = (int)ef.ajfd("alwa", ajfa(int ), (int)698);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl367:
            // 3 sources

            case 53: {
                var8_3 /* !! */  = (int)ef.ajfd("alwb", ajfa(int ), (int)699);
                if (!var9_2) ** GOTO lbl177
                throw null;
            }
lbl371:
            // 7 sources

            case 54: {
                var8_3 /* !! */  = (int)ef.ajfd("alwg", ajfa(int ), (int)700);
                if (!var9_2) ** GOTO lbl147
                throw null;
            }
lbl375:
            // 3 sources

            case 55: {
                var8_3 /* !! */  = (int)ef.ajfd("alwi", ajfa(int ), (int)701);
                if (!var9_2) ** GOTO lbl147
                throw null;
            }
            case 56: {
                var8_3 /* !! */  = (int)ef.ajfd("alwk", ajfa(int ), (int)702);
                if (!var9_2) ** GOTO lbl276
                throw null;
            }
            case 57: {
                var8_3 /* !! */  = (int)ef.ajfd("alwl", ajfa(int ), (int)703);
                if (var9_2) {
                    throw null;
                }
            }
            case 58: {
                var8_3 /* !! */  = (int)ef.ajfd("alwm", ajfa(int ), (int)704);
                if (!var9_2) ** GOTO lbl367
                throw null;
            }
            case 59: {
                var8_3 /* !! */  = (int)ef.ajfd("alwn", ajfa(int ), (int)705);
                if (!var9_2) ** GOTO lbl375
                throw null;
            }
            case 60: {
                var8_3 /* !! */  = (int)ef.ajfd("alwo", ajfa(int ), (int)706);
                if (!var9_2) break;
                throw null;
            }
lbl399:
            // 3 sources

            case 61: {
                var8_3 /* !! */  = (int)ef.ajfd("alwv", ajfa(int ), (int)707);
                if (!var9_2) ** GOTO lbl327
                throw null;
            }
            case 62: {
                var8_3 /* !! */  = (int)ef.ajfd("alww", ajfa(int ), (int)708);
                if (!var9_2) ** GOTO lbl357
                throw null;
            }
            case 63: {
                var8_3 /* !! */  = (int)ef.ajfd("alwx", ajfa(int ), (int)709);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl421
            }
lbl412:
            // 2 sources

            case 64: {
                do {
                    var8_3 /* !! */  = (int)ef.ajfd("alxa", ajfa(int ), (int)710);
                } while (!var9_2);
                throw null;
            }
lbl417:
            // 2 sources

            case 65: {
                var8_3 /* !! */  = (int)ef.ajfd("alxc", ajfa(int ), (int)711);
                if (!var9_2) ** GOTO lbl216
                throw null;
            }
lbl421:
            // 2 sources

            case 66: {
                var8_3 /* !! */  = (int)ef.ajfd("alxf", ajfa(int ), (int)712);
                if (!var9_2) ** GOTO lbl399
                throw null;
            }
lbl425:
            // 2 sources

            case 67: {
                var8_3 /* !! */  = (int)ef.ajfd("alxh", ajfa(int ), (int)713);
                if (!var9_2) ** GOTO lbl220
                throw null;
            }
            case 68: {
                var8_3 /* !! */  = (int)ef.ajfd("alxi", ajfa(int ), (int)714);
                if (!var9_2) ** GOTO lbl256
                throw null;
            }
            case 69: {
                var8_3 /* !! */  = (int)ef.ajfd("alxk", ajfa(int ), (int)715);
                if (!var9_2) ** GOTO lbl127
                throw null;
            }
            case 70: {
                var8_3 /* !! */  = (int)ef.ajfd("alxo", ajfa(int ), (int)716);
                if (!var9_2) ** GOTO lbl301
                throw null;
            }
            case 71: {
                var8_3 /* !! */  = (int)ef.ajfd("alxq", ajfa(int ), (int)717);
                if (!var9_2) ** GOTO lbl353
                throw null;
            }
lbl445:
            // 2 sources

            case 72: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)ef.ajfd("alxt", ajfa(int ), (int)718);
                    if (!var9_2) ** GOTO lbl315
                    throw null;
                }
            }
lbl450:
            // 3 sources

            case 73: {
                var8_3 /* !! */  = (int)ef.ajfd("alxu", ajfa(int ), (int)719);
                if (!var9_2) ** GOTO lbl412
                throw null;
            }
            case 74: 
        }
        var8_3 /* !! */  = (int)ef.ajfd("alxv", ajfa(int ), (int)720);
        ** while (!var9_2)
lbl457:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float ajfn(int n2) {
        return Float.intBitsToFloat(ajfb[n2] ^ ajfc[n2]);
    }
}

