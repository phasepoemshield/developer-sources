/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1641
 *  net.minecraft.class_1646
 *  net.minecraft.class_1923
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2480
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import net.minecraft.class_1297;
import net.minecraft.class_1641;
import net.minecraft.class_1646;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import ruhack.phobia.aw;
import ruhack.phobia.di;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.iy$EntityType;
import ruhack.phobia.iy$FoundEntity;
import ruhack.phobia.iy$StorageType;
import ruhack.phobia.ke;
import ruhack.phobia.kg;
import ruhack.phobia.ls;
import ruhack.phobia.lv;
import ruhack.phobia.pp;

public final class iy
extends ds {
    private static final int CHEST_COLOR = 3532378;
    private static int[] appv;
    private final Map<UUID, iy$FoundEntity> foundEntities;
    private static int[] appu;
    private final List<class_1923> candidateBuffer;
    private final Set<UUID> announcedEntities;
    private static final String ZOMBIE_VILLAGERS = "\u0417\u043e\u043c\u0431\u0438-\u0436\u0438\u0442\u0435\u043b\u0438";
    private final Map<class_2338, iy$StorageType> found;
    private static final String CHESTS = "\u0421\u0443\u043d\u0434\u0443\u043a\u0438";
    private static long[] apqv;
    private final ke targets;
    private static final int MAX_CHUNKS_PER_PASS = 2;
    public static final boolean c;
    private int lastMaintenanceAge;
    private static final int VILLAGER_COLOR = 0x55FFFF;
    private final Set<class_1923> scannedChunks;
    private static final long SCAN_INTERVAL_MS = 50L;
    static final long ci = -4463365986025487739L;
    public static final boolean a;
    private static final String BREWING_STANDS = "\u0417\u0435\u043b\u044c\u0435\u0432\u0430\u0440\u043a\u0438";
    private int lastRadius;
    private static final int MAX_BLOCK_ENTITY_CHUNKS_PER_PASS = 16;
    private class_1923 lastPlayerChunk;
    private final Set<class_2338> announced;
    private static final String VILLAGERS = "\u0416\u0438\u0442\u0435\u043b\u0438";
    private static long[] apqw;
    private long lastScanTime;
    private static final String SHULKERS = "\u0428\u0430\u043b\u043a\u0435\u0440\u044b";
    private int lastTargetMask;
    private static final int BREWING_COLOR = 0xFFAA33;
    public static final int b;
    private final Set<UUID> currentEntityIds;
    private final kg distance;
    private static final int SHULKER_COLOR = 0xFF55CC;
    private static final int ZOMBIE_VILLAGER_COLOR = 0xFF5555;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanBlocks(class_2818 var1_1, class_2338 var2_2, int var3_3, int var4_4) {
        var23_5 = iy.c;
        var22_6 /* !! */  = iy.b;
        var21_7 = iy.a;
        if (var23_5) {
            throw null;
lbl6:
            // 36 sources

            return;
        }
        if (var21_7 || var21_7) ** GOTO lbl6
        var5_8 = var1_1.method_12004().method_8326();
        if (var21_7 || var21_7) ** GOTO lbl6
        var6_9 = var1_1.method_12004().method_8328();
        if (var21_7 || var21_7) ** GOTO lbl6
        var7_10 = Math.max(iy.mc.field_1687.method_31607(), var2_2.method_10264() - var3_3);
        if (var21_7 || var21_7) ** GOTO lbl6
        var8_11 = Math.min(iy.mc.field_1687.method_31600(), var2_2.method_10264() + var3_3);
        if (var21_7 || var21_7) ** GOTO lbl6
        var9_12 = var3_3 * var3_3;
        if (var21_7 || var21_7) ** GOTO lbl6
        var10_13 = new class_2338.class_2339();
        if (var21_7 || var21_7) ** GOTO lbl6
        var11_14 = var5_8;
        if (var21_7) ** GOTO lbl6
        block68: while (true) {
            block133: {
                if (var21_7 || var21_7) ** GOTO lbl6
                if (var11_14 > var5_8 + iy.appw("aqcb", apqa(int ), (int)253)) ** GOTO lbl89
                if (var21_7 || var21_7) ** GOTO lbl6
                var12_15 = var6_9;
                if (var21_7) ** GOTO lbl6
                do {
                    block134: {
                        block135: {
                            if (var21_7 || var21_7) ** GOTO lbl6
                            if (var12_15 > var6_9 + iy.appw("aqcc", apqa(int ), (int)254)) break block133;
                            if (var21_7 || var21_7) ** GOTO lbl6
                            var13_16 = var11_14 - var2_2.method_10263();
                            if (var21_7 || var21_7) ** GOTO lbl6
                            var14_17 = var12_15 - var2_2.method_10260();
                            if (var21_7 || var21_7) ** GOTO lbl6
                            var15_18 = var13_16 * var13_16 + var14_17 * var14_17;
                            if (var21_7 || var21_7) ** GOTO lbl6
                            if (var15_18 <= var9_12) break block135;
                            if (var21_7) ** GOTO lbl6
                            if (var23_5) {
                                throw null;
                            }
                            break block134;
                        }
                        if (var21_7 || var21_7) ** GOTO lbl6
                        var16_19 = (int)Math.sqrt(var9_12 - var15_18);
                        if (var21_7 || var21_7) ** GOTO lbl6
                        var17_20 = Math.max(var7_10, var2_2.method_10264() - var16_19);
                        if (var21_7 || var21_7) ** GOTO lbl6
                        var18_21 = Math.min(var8_11, var2_2.method_10264() + var16_19);
                        if (var21_7 || var21_7) ** GOTO lbl6
                        var19_22 = var17_20;
                        if (var21_7) ** GOTO lbl6
                        do {
                            block136: {
                                if (var21_7 || var21_7) ** GOTO lbl6
                                if (var19_22 > var18_21) break block134;
                                if (var21_7 || var21_7) ** GOTO lbl6
                                var10_13.method_10103(var11_14, var19_22, var12_15);
                                if (var21_7 || var21_7) ** GOTO lbl6
                                var20_23 = this.storageType(var1_1.method_8320((class_2338)var10_13), var4_4);
                                if (var21_7 || var21_7) ** GOTO lbl6
                                if (var20_23 == null) break block136;
                                if (var21_7) ** GOTO lbl6
                                this.addFound(var10_13.method_10062(), var20_23);
                                if (var21_7) ** GOTO lbl6
                            }
                            if (var21_7 || var21_7) ** GOTO lbl6
                            ++var19_22;
                            if (var21_7) ** GOTO lbl6
                        } while (!var23_5);
                        throw null;
                    }
                    if (var21_7 || var21_7) ** GOTO lbl6
                    ++var12_15;
                    if (var21_7) ** GOTO lbl6
                } while (!var23_5);
                throw null;
            }
            if (var21_7) ** GOTO lbl6
            if (var22_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var22_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var21_7) ** GOTO lbl6
                    ++var11_14;
                    if (var21_7) ** GOTO lbl6
                    if (!var23_5) continue block68;
                    throw null;
                }
lbl89:
                // 1 sources

                if (!var21_7 && !var21_7) ** break;
                ** continue;
                return;
                case 0: {
                    var22_6 /* !! */  = (int)iy.appw("aqcd", apqa(int ), (int)255);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
                case 1: {
                    var22_6 /* !! */  = (int)iy.appw("aqce", apqa(int ), (int)256);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
                case 2: {
                    var22_6 /* !! */  = (int)iy.appw("aqcf", apqa(int ), (int)257);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
lbl107:
                // 2 sources

                case 3: {
                    var22_6 /* !! */  = (int)iy.appw("aqcg", apqa(int ), (int)258);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl308
                }
lbl112:
                // 2 sources

                case 4: {
                    var22_6 /* !! */  = (int)iy.appw("aqch", apqa(int ), (int)259);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl313
                }
lbl117:
                // 2 sources

                case 5: {
                    var22_6 /* !! */  = (int)iy.appw("aqci", apqa(int ), (int)260);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
                case 6: {
                    var22_6 /* !! */  = (int)iy.appw("aqcj", apqa(int ), (int)261);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl361
                }
lbl127:
                // 3 sources

                case 7: {
                    var22_6 /* !! */  = (int)iy.appw("aqck", apqa(int ), (int)262);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
lbl132:
                // 2 sources

                case 8: {
                    var22_6 /* !! */  = (int)iy.appw("aqcl", apqa(int ), (int)263);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
lbl137:
                // 2 sources

                case 9: {
                    var22_6 /* !! */  = (int)iy.appw("aqcm", apqa(int ), (int)264);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
lbl142:
                // 2 sources

                case 10: {
                    var22_6 /* !! */  = (int)iy.appw("aqcn", apqa(int ), (int)265);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
lbl147:
                // 2 sources

                case 11: {
                    var22_6 /* !! */  = (int)iy.appw("aqco", apqa(int ), (int)266);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl373
                }
                case 12: {
                    var22_6 /* !! */  = (int)iy.appw("aqcp", apqa(int ), (int)267);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
lbl157:
                // 3 sources

                case 13: {
                    var22_6 /* !! */  = (int)iy.appw("aqcq", apqa(int ), (int)268);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl258
                }
lbl162:
                // 2 sources

                case 14: {
                    var22_6 /* !! */  = (int)iy.appw("aqcr", apqa(int ), (int)269);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
lbl167:
                // 2 sources

                case 15: {
                    var22_6 /* !! */  = (int)iy.appw("aqcs", apqa(int ), (int)270);
                    if (!var23_5) break block68;
                    throw null;
                }
lbl171:
                // 2 sources

                case 16: {
                    var22_6 /* !! */  = (int)iy.appw("aqct", apqa(int ), (int)271);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl295
                }
lbl176:
                // 2 sources

                case 17: {
                    var22_6 /* !! */  = (int)iy.appw("aqcu", apqa(int ), (int)272);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
lbl181:
                // 4 sources

                case 18: {
                    var22_6 /* !! */  = (int)iy.appw("aqcv", apqa(int ), (int)273);
                    if (!var23_5) ** GOTO lbl132
                    throw null;
                }
lbl185:
                // 2 sources

                case 19: {
                    var22_6 /* !! */  = (int)iy.appw("aqcw", apqa(int ), (int)274);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl323
                }
lbl190:
                // 2 sources

                case 20: {
                    var22_6 /* !! */  = (int)iy.appw("aqcx", apqa(int ), (int)275);
                    if (!var23_5) ** GOTO lbl162
                    throw null;
                }
                case 21: {
                    var22_6 /* !! */  = (int)iy.appw("aqcy", apqa(int ), (int)276);
                    if (!var23_5) ** GOTO lbl176
                    throw null;
                }
                case 22: {
                    var22_6 /* !! */  = (int)iy.appw("aqcz", apqa(int ), (int)277);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 23: {
                    var22_6 /* !! */  = (int)iy.appw("aqda", apqa(int ), (int)278);
                    if (!var23_5) ** GOTO lbl185
                    throw null;
                }
lbl207:
                // 2 sources

                case 24: {
                    var22_6 /* !! */  = (int)iy.appw("aqdb", apqa(int ), (int)279);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl317
                }
lbl212:
                // 2 sources

                case 25: {
                    var22_6 /* !! */  = (int)iy.appw("aqdc", apqa(int ), (int)280);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl217:
                // 2 sources

                case 26: {
                    var22_6 /* !! */  = (int)iy.appw("aqdd", apqa(int ), (int)281);
                    if (!var23_5) ** GOTO lbl117
                    throw null;
                }
lbl221:
                // 4 sources

                case 27: {
                    var22_6 /* !! */  = (int)iy.appw("aqde", apqa(int ), (int)282);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl317
                }
                case 28: {
                    var22_6 /* !! */  = (int)iy.appw("aqdf", apqa(int ), (int)283);
                    if (!var23_5) ** GOTO lbl137
                    throw null;
                }
lbl230:
                // 3 sources

                case 29: {
                    var22_6 /* !! */  = (int)iy.appw("aqdg", apqa(int ), (int)284);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl323
                }
lbl235:
                // 2 sources

                case 30: {
                    var22_6 /* !! */  = (int)iy.appw("aqdh", apqa(int ), (int)285);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl365
                }
lbl240:
                // 3 sources

                case 31: {
                    var22_6 /* !! */  = (int)iy.appw("aqdi", apqa(int ), (int)286);
                    if (!var23_5) ** GOTO lbl171
                    throw null;
                }
lbl244:
                // 2 sources

                case 32: {
                    var22_6 /* !! */  = (int)iy.appw("aqdj", apqa(int ), (int)287);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
lbl249:
                // 2 sources

                case 33: {
                    var22_6 /* !! */  = (int)iy.appw("aqdk", apqa(int ), (int)288);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl278
                }
lbl254:
                // 3 sources

                case 34: {
                    var22_6 /* !! */  = (int)iy.appw("aqdl", apqa(int ), (int)289);
                    if (!var23_5) ** GOTO lbl207
                    throw null;
                }
lbl258:
                // 2 sources

                case 35: {
                    var22_6 /* !! */  = (int)iy.appw("aqdm", apqa(int ), (int)290);
                    if (var23_5) {
                        throw null;
                    }
                }
lbl262:
                // 4 sources

                case 36: {
                    var22_6 /* !! */  = (int)iy.appw("aqdn", apqa(int ), (int)291);
                    if (!var23_5) ** GOTO lbl244
                    throw null;
                }
lbl266:
                // 2 sources

                case 37: {
                    var22_6 /* !! */  = (int)iy.appw("aqdo", apqa(int ), (int)292);
                    if (!var23_5) ** GOTO lbl254
                    throw null;
                }
                case 38: {
                    var22_6 /* !! */  = (int)iy.appw("aqdp", apqa(int ), (int)293);
                    if (!var23_5) ** GOTO lbl235
                    throw null;
                }
                case 39: {
                    var22_6 /* !! */  = (int)iy.appw("aqdq", apqa(int ), (int)294);
                    if (!var23_5) ** GOTO lbl217
                    throw null;
                }
lbl278:
                // 3 sources

                case 40: {
                    var22_6 /* !! */  = (int)iy.appw("aqdr", apqa(int ), (int)295);
                    if (!var23_5) ** GOTO lbl112
                    throw null;
                }
                case 41: {
                    var22_6 /* !! */  = (int)iy.appw("aqds", apqa(int ), (int)296);
                    if (!var23_5) break block68;
                    throw null;
                }
lbl286:
                // 2 sources

                case 42: {
                    var22_6 /* !! */  = (int)iy.appw("aqdt", apqa(int ), (int)297);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl361
                }
                case 43: {
                    var22_6 /* !! */  = (int)iy.appw("aqdu", apqa(int ), (int)298);
                    if (!var23_5) ** GOTO lbl266
                    throw null;
                }
lbl295:
                // 2 sources

                case 44: {
                    var22_6 /* !! */  = (int)iy.appw("aqdv", apqa(int ), (int)299);
                    if (!var23_5) ** GOTO lbl221
                    throw null;
                }
                case 45: {
                    var22_6 /* !! */  = (int)iy.appw("aqdw", apqa(int ), (int)300);
                    if (!var23_5) ** GOTO lbl147
                    throw null;
                }
                case 46: {
                    var22_6 /* !! */  = (int)iy.appw("aqdx", apqa(int ), (int)301);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl361
                }
lbl308:
                // 4 sources

                case 47: {
                    var22_6 /* !! */  = (int)iy.appw("aqdy", apqa(int ), (int)302);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl369
                }
lbl313:
                // 2 sources

                case 48: {
                    var22_6 /* !! */  = (int)iy.appw("aqdz", apqa(int ), (int)303);
                    if (var23_5) {
                        throw null;
                    }
                }
lbl317:
                // 5 sources

                case 49: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var22_6 /* !! */  = (int)iy.appw("aqea", apqa(int ), (int)304);
                        if (var23_5) {
                            throw null;
                        }
                        ** GOTO lbl333
                        break;
                    }
                }
lbl323:
                // 3 sources

                case 50: {
                    var22_6 /* !! */  = (int)iy.appw("aqeb", apqa(int ), (int)305);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl345
                }
                case 51: {
                    var22_6 /* !! */  = (int)iy.appw("aqec", apqa(int ), (int)306);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl365
                }
lbl333:
                // 3 sources

                case 52: {
                    var22_6 /* !! */  = (int)iy.appw("aqed", apqa(int ), (int)307);
                    if (!var23_5) ** GOTO lbl278
                    throw null;
                }
                case 53: {
                    var22_6 /* !! */  = (int)iy.appw("aqee", apqa(int ), (int)308);
                    if (!var23_5) ** GOTO lbl127
                    throw null;
                }
                case 54: {
                    var22_6 /* !! */  = (int)iy.appw("aqef", apqa(int ), (int)309);
                    if (!var23_5) ** GOTO lbl308
                    throw null;
                }
lbl345:
                // 2 sources

                case 55: {
                    var22_6 /* !! */  = (int)iy.appw("aqeg", apqa(int ), (int)310);
                    if (!var23_5) ** GOTO lbl221
                    throw null;
                }
                case 56: {
                    var22_6 /* !! */  = (int)iy.appw("aqeh", apqa(int ), (int)311);
                    if (!var23_5) ** GOTO lbl262
                    throw null;
                }
                case 57: {
                    var22_6 /* !! */  = (int)iy.appw("aqei", apqa(int ), (int)312);
                    if (!var23_5) ** GOTO lbl107
                    throw null;
                }
                case 58: {
                    var22_6 /* !! */  = (int)iy.appw("aqej", apqa(int ), (int)313);
                    if (!var23_5) ** GOTO lbl142
                    throw null;
                }
lbl361:
                // 4 sources

                case 59: {
                    var22_6 /* !! */  = (int)iy.appw("aqek", apqa(int ), (int)314);
                    if (!var23_5) ** GOTO lbl127
                    throw null;
                }
lbl365:
                // 3 sources

                case 60: {
                    var22_6 /* !! */  = (int)iy.appw("aqel", apqa(int ), (int)315);
                    if (!var23_5) ** GOTO lbl308
                    throw null;
                }
lbl369:
                // 2 sources

                case 61: {
                    var22_6 /* !! */  = (int)iy.appw("aqem", apqa(int ), (int)316);
                    if (!var23_5) ** GOTO lbl181
                    throw null;
                }
lbl373:
                // 2 sources

                case 62: {
                    var22_6 /* !! */  = (int)iy.appw("aqen", apqa(int ), (int)317);
                    if (!var23_5) ** GOTO lbl167
                    throw null;
                }
                case 63: {
                    var22_6 /* !! */  = (int)iy.appw("aqeo", apqa(int ), (int)318);
                    if (!var23_5) ** GOTO lbl230
                    throw null;
                }
                case 64: 
            }
            break;
        }
        var22_6 /* !! */  = (int)iy.appw("aqep", apqa(int ), (int)319);
        ** while (!var23_5)
lbl384:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ardz() {
        iy.appu[200] = -721919553;
        iy.appu[201] = -1781347183;
        iy.appu[202] = -1797348333;
        iy.appu[203] = 31404568;
        iy.appu[204] = 34235718;
        iy.appu[205] = 97668583;
        iy.appu[206] = -1267588873;
        iy.appu[207] = 246748016;
        iy.appu[208] = 1887289664;
        iy.appu[209] = -1931572751;
        iy.appu[210] = -1292730273;
        iy.appu[211] = 409593740;
        iy.appu[212] = -1142482732;
        iy.appu[213] = -390119072;
        iy.appu[214] = -349946561;
        iy.appu[215] = -35030999;
        iy.appu[216] = -1423961221;
        iy.appu[217] = -522725593;
        iy.appu[218] = 162080824;
        iy.appu[219] = 1972728631;
        iy.appu[220] = -506727799;
        iy.appu[221] = -1488651770;
        iy.appu[222] = -662330319;
        iy.appu[223] = 957689816;
        iy.appu[224] = 474721621;
        iy.appu[225] = 719007476;
        iy.appu[226] = 124499920;
        iy.appu[227] = 1688133709;
        iy.appu[228] = 1830194104;
        iy.appu[229] = -649177269;
        iy.appu[230] = -886164835;
        iy.appu[231] = -1461107648;
        iy.appu[232] = 2139168404;
        iy.appu[233] = -369684152;
        iy.appu[234] = 1260213310;
        iy.appu[235] = -1802681967;
        iy.appu[236] = -2017943940;
        iy.appu[237] = -1154198546;
        iy.appu[238] = -2104148969;
        iy.appu[239] = -1219732733;
        iy.appu[240] = 416520675;
        iy.appu[241] = -25789750;
        iy.appu[242] = -130049045;
        iy.appu[243] = 641178512;
        iy.appu[244] = 19687550;
        iy.appu[245] = -2087442092;
        iy.appu[246] = 1395968827;
        iy.appu[247] = -542883356;
        iy.appu[248] = 361978380;
        iy.appu[249] = 717196276;
        iy.appu[250] = 1998460025;
        iy.appu[251] = -1612568944;
        iy.appu[252] = 386277327;
        iy.appu[253] = -2134295808;
        iy.appu[254] = 369281044;
        iy.appu[255] = -820982131;
        iy.appu[256] = -33233612;
        iy.appu[257] = 868685840;
        iy.appu[258] = -1867546096;
        iy.appu[259] = 799527303;
        iy.appu[260] = -1054413041;
        iy.appu[261] = 1786668413;
        iy.appu[262] = -681601237;
        iy.appu[263] = -949127892;
        iy.appu[264] = -2074487814;
        iy.appu[265] = -1189044788;
        iy.appu[266] = 1515969618;
        iy.appu[267] = -1562336498;
        iy.appu[268] = 559128739;
        iy.appu[269] = 148820784;
        iy.appu[270] = -2050933139;
        iy.appu[271] = 734633768;
        iy.appu[272] = 158433038;
        iy.appu[273] = -1244687914;
        iy.appu[274] = -1613439465;
        iy.appu[275] = 418847538;
        iy.appu[276] = 1388426125;
        iy.appu[277] = 333419269;
        iy.appu[278] = 91398065;
        iy.appu[279] = -1520200201;
        iy.appu[280] = 512819006;
        iy.appu[281] = -1471824548;
        iy.appu[282] = -1216451982;
        iy.appu[283] = 173613451;
        iy.appu[284] = -1933523854;
        iy.appu[285] = -1518912744;
        iy.appu[286] = 1980728119;
        iy.appu[287] = -655885923;
        iy.appu[288] = -844334782;
        iy.appu[289] = -1809799080;
        iy.appu[290] = 1972420018;
        iy.appu[291] = 359041307;
        iy.appu[292] = 565854651;
        iy.appu[293] = -931816099;
        iy.appu[294] = 914846222;
        iy.appu[295] = 435669725;
        iy.appu[296] = 1260109749;
        iy.appu[297] = 276306078;
        iy.appu[298] = -1923190641;
        iy.appu[299] = -1652613564;
    }

    private static /* synthetic */ void ardx() {
        iy.appu[0] = -904541188;
        iy.appu[1] = 635233051;
        iy.appu[2] = -443253424;
        iy.appu[3] = -1109947602;
        iy.appu[4] = 1588639203;
        iy.appu[5] = -2133927995;
        iy.appu[6] = -384069523;
        iy.appu[7] = -1898569346;
        iy.appu[8] = -236947956;
        iy.appu[9] = -1544313292;
        iy.appu[10] = 1365844696;
        iy.appu[11] = 1909914958;
        iy.appu[12] = 542239788;
        iy.appu[13] = 1674846759;
        iy.appu[14] = -1672704761;
        iy.appu[15] = -812395958;
        iy.appu[16] = -1598342338;
        iy.appu[17] = -955246300;
        iy.appu[18] = -781751165;
        iy.appu[19] = 1392359524;
        iy.appu[20] = -1638086361;
        iy.appu[21] = -539701213;
        iy.appu[22] = 2105825845;
        iy.appu[23] = -814179376;
        iy.appu[24] = -1399699329;
        iy.appu[25] = 263614066;
        iy.appu[26] = 404721561;
        iy.appu[27] = 1738127874;
        iy.appu[28] = -1246938823;
        iy.appu[29] = 348158442;
        iy.appu[30] = -96699930;
        iy.appu[31] = -1276836526;
        iy.appu[32] = -710573845;
        iy.appu[33] = 990583163;
        iy.appu[34] = -110737008;
        iy.appu[35] = 842444636;
        iy.appu[36] = 1423572343;
        iy.appu[37] = -1112934229;
        iy.appu[38] = -477399417;
        iy.appu[39] = -817420180;
        iy.appu[40] = 982154518;
        iy.appu[41] = -232013735;
        iy.appu[42] = -1567794637;
        iy.appu[43] = 201944914;
        iy.appu[44] = 1576484450;
        iy.appu[45] = -1314271097;
        iy.appu[46] = 739886092;
        iy.appu[47] = -1919968401;
        iy.appu[48] = 1651217956;
        iy.appu[49] = 211606158;
        iy.appu[50] = -1148665743;
        iy.appu[51] = -1141455492;
        iy.appu[52] = 1784748119;
        iy.appu[53] = -1892937985;
        iy.appu[54] = -113050724;
        iy.appu[55] = 800243770;
        iy.appu[56] = -1238054347;
        iy.appu[57] = 823750211;
        iy.appu[58] = -241849001;
        iy.appu[59] = -456246898;
        iy.appu[60] = -1531295214;
        iy.appu[61] = -700814867;
        iy.appu[62] = -1310863085;
        iy.appu[63] = 204171271;
        iy.appu[64] = -279076681;
        iy.appu[65] = 901900533;
        iy.appu[66] = -335048641;
        iy.appu[67] = -1210215749;
        iy.appu[68] = 663871844;
        iy.appu[69] = -641882528;
        iy.appu[70] = -57700965;
        iy.appu[71] = -19735247;
        iy.appu[72] = 818246480;
        iy.appu[73] = -80030326;
        iy.appu[74] = -704725633;
        iy.appu[75] = -1412981433;
        iy.appu[76] = 873388893;
        iy.appu[77] = 1994794884;
        iy.appu[78] = 1177849478;
        iy.appu[79] = -1599374104;
        iy.appu[80] = 1892613612;
        iy.appu[81] = -833414829;
        iy.appu[82] = 721912458;
        iy.appu[83] = 1264642521;
        iy.appu[84] = 266407029;
        iy.appu[85] = -428824173;
        iy.appu[86] = 1941011934;
        iy.appu[87] = 1346608446;
        iy.appu[88] = -473984518;
        iy.appu[89] = 862969827;
        iy.appu[90] = -1644270776;
        iy.appu[91] = -496289699;
        iy.appu[92] = -91663828;
        iy.appu[93] = -1748843997;
        iy.appu[94] = 1049167709;
        iy.appu[95] = 1567309710;
        iy.appu[96] = 1044902398;
        iy.appu[97] = -1658805002;
        iy.appu[98] = -1413816599;
        iy.appu[99] = 1487009107;
    }

    public iy() {
        int n2 = b;
        super("BaseFinder", "\u0418\u0449\u0435\u0442 \u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0430, \u0437\u0435\u043b\u044c\u0435\u0432\u0430\u0440\u043a\u0438 \u0438 \u0436\u0438\u0442\u0435\u043b\u0435\u0439 \u0438 \u043e\u0442\u043c\u0435\u0447\u0430\u0435\u0442 \u0438\u0445 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b", du.MISC);
        this.targets = new ke("\u0418\u0441\u043a\u0430\u0442\u044c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0431\u043b\u043e\u043a\u0438 \u0438 \u043c\u043e\u0431\u043e\u0432 \u0434\u043b\u044f \u043f\u043e\u0438\u0441\u043a\u0430").value(CHESTS, SHULKERS, BREWING_STANDS, VILLAGERS, ZOMBIE_VILLAGERS).selected(CHESTS, SHULKERS, BREWING_STANDS, VILLAGERS, ZOMBIE_VILLAGERS);
        this.distance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", "\u0420\u0430\u0434\u0438\u0443\u0441 \u043f\u043e\u0438\u0441\u043a\u0430 \u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449", (float)iy.appw("appx", appt(int ), (int)0)).range((float)iy.appw("appy", appt(int ), (int)1), (float)iy.appw("appz", appt(int ), (int)2)).step(1.0f);
        this.found = new ConcurrentHashMap<class_2338, iy$StorageType>();
        this.announced = ConcurrentHashMap.newKeySet();
        this.foundEntities = new ConcurrentHashMap<UUID, iy$FoundEntity>();
        this.announcedEntities = ConcurrentHashMap.newKeySet();
        this.scannedChunks = ConcurrentHashMap.newKeySet();
        this.candidateBuffer = new ArrayList<class_1923>();
        this.currentEntityIds = new HashSet<UUID>();
        this.lastRadius = (int)iy.appw("apqb", apqa(int ), (int)3);
        this.lastTargetMask = (int)iy.appw("apqc", apqa(int ), (int)4);
        this.lastMaintenanceAge = (int)iy.appw("apqd", apqa(int ), (int)5);
        this.settings(this.targets, this.distance);
    }

    private static /* synthetic */ float appt(int n2) {
        return Float.intBitsToFloat(appu[n2] ^ appv[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void line(double var1_1, double var3_2, double var5_3, double var7_4, double var9_5, double var11_6, int var13_7) {
        v0 /* !! */  = iy.ci;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - iy.appw("aqon", apqu(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1671183739: {
                    break block29;
                }
                case -1648146568: {
                    v1 = iy.appw("aqoo", apqu(int ), (int)115);
                    continue block29;
                }
                case 698982717: {
                    v1 = iy.appw("aqop", apqu(int ), (int)116);
                    continue block29;
                }
                case 1219269915: {
                    v1 = iy.appw("aqoq", apqu(int ), (int)117);
                    continue block29;
                }
            }
            break;
        }
        var16_8 = iy.c;
        v2 /* !! */  = iy.ci;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - iy.appw("aqor", apqu(int ), (int)118));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1671183739: {
                    break block30;
                }
                case -1553110453: {
                    v3 = iy.appw("aqos", apqu(int ), (int)119);
                    continue block30;
                }
                case 534418192: {
                    v3 = iy.appw("aqot", apqu(int ), (int)120);
                    continue block30;
                }
            }
            break;
        }
        var15_9 /* !! */  = iy.b;
        v4 /* !! */  = iy.ci;
        if (true) ** GOTO lbl36
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - iy.appw("aqou", apqu(int ), (int)121));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1813731050: {
                    v5 = iy.appw("aqov", apqu(int ), (int)122);
                    continue block31;
                }
                case -1721827476: {
                    v5 = iy.appw("aqow", apqu(int ), (int)123);
                    continue block31;
                }
                case -1671183739: {
                    break block31;
                }
                case 2140969806: {
                    v5 = iy.appw("aqox", apqu(int ), (int)124);
                    continue block31;
                }
            }
            break;
        }
        var14_10 = iy.a;
        if (var16_8) {
            throw null;
        }
        if (var14_10 || var14_10) ** GOTO lbl73
        if (var15_9 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block32: while (true) {
            block45: {
                switch (cfr_temp_0 == -2147483648 ? var15_9 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v6 = (float)var1_1;
                        v7 = (float)var3_2;
                        v8 = (float)var5_3;
                        v9 = (float)var7_4;
                        v10 = (float)var9_5;
                        v11 = (float)var11_6;
                        v12 /* !! */  = iy.ci;
                        block33: while (true) {
                            switch ((int)v12 /* !! */ ) {
                                case -1671183739: {
                                    break block33;
                                }
                                case 1007161052: {
                                    v12 /* !! */  = (long)(iy.appw("aqoz", apqu(int ), (int)126) - iy.appw("aqoy", apqu(int ), (int)125));
                                    continue block33;
                                }
                            }
                            break;
                        }
                        lv.line(v6, v7, v8, v9, v10, v11, var13_7, 1.0f);
                        if (!var14_10 && !var14_10) ** GOTO lbl74
lbl73:
                        // 2 sources

                        return;
lbl74:
                        // 1 sources

                        return;
                    }
                    case 4: {
                        var15_9 /* !! */  = (int)iy.appw("aqpe", apqa(int ), (int)525);
                        cfr_temp_0 = 1;
                        if (var16_8) {
                            throw null;
                        }
                        break block45;
                    }
                    case 5: {
                        var15_9 /* !! */  = (int)iy.appw("aqpf", apqa(int ), (int)526);
                        if (var16_8) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var15_9 /* !! */  = (int)iy.appw("aqpa", apqa(int ), (int)521);
                        if (var16_8) {
                            throw null;
                        }
                    }
                    case 1: {
                        var15_9 /* !! */  = (int)iy.appw("aqpb", apqa(int ), (int)522);
                        if (var16_8) {
                            throw null;
                        }
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var15_9 /* !! */  = (int)iy.appw("aqpc", apqa(int ), (int)523);
                        if (var16_8) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl103
            }
            do {
                if (true) continue block32;
lbl103:
                // 2 sources

                var15_9 /* !! */  = (int)iy.appw("aqpd", apqa(int ), (int)524);
                cfr_temp_0 = 0;
            } while (!var16_8);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void arem() {
        iy.appv[700] = 197608543;
        iy.appv[701] = -925254033;
        iy.appv[702] = 729852578;
        iy.appv[703] = 768742376;
        iy.appv[704] = 1025547309;
        iy.appv[705] = -877882383;
        iy.appv[706] = -1432326215;
        iy.appv[707] = 44404768;
        iy.appv[708] = 339884429;
        iy.appv[709] = 115926455;
        iy.appv[710] = -628174297;
        iy.appv[711] = -766984430;
        iy.appv[712] = 1313543333;
        iy.appv[713] = -1397185608;
        iy.appv[714] = 1559265794;
        iy.appv[715] = -106429617;
        iy.appv[716] = -1486533734;
        iy.appv[717] = 1787674720;
        iy.appv[718] = -1068373770;
        iy.appv[719] = 305081682;
        iy.appv[720] = 1779768089;
        iy.appv[721] = 278103620;
        iy.appv[722] = -1855689781;
        iy.appv[723] = -1097203011;
        iy.appv[724] = 779189498;
        iy.appv[725] = -1043161623;
        iy.appv[726] = 974073710;
        iy.appv[727] = 10716107;
        iy.appv[728] = 339424939;
        iy.appv[729] = 318950101;
        iy.appv[730] = -1321301113;
        iy.appv[731] = 308256410;
        iy.appv[732] = -415086339;
        iy.appv[733] = -1463061397;
        iy.appv[734] = 1386905092;
        iy.appv[735] = 1663766818;
        iy.appv[736] = 856993913;
        iy.appv[737] = 1881644909;
        iy.appv[738] = 826572881;
        iy.appv[739] = -1252951102;
        iy.appv[740] = 596704197;
        iy.appv[741] = -1934456200;
        iy.appv[742] = -1212214945;
        iy.appv[743] = 1302437899;
        iy.appv[744] = 994617521;
        iy.appv[745] = -946024582;
        iy.appv[746] = -1757872829;
        iy.appv[747] = -342014421;
        iy.appv[748] = -1769011140;
        iy.appv[749] = -1692843117;
        iy.appv[750] = 1429335664;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void addFound(class_2338 var1_1, iy$StorageType var2_2) {
        block53: {
            block52: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("aqeq", apqu(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == iy.appw("aqer", apqa(int ), (int)320)) break;
                    v0 /* !! */  = (long)iy.appw("aqes", apqa(int ), (int)321);
                }
                var6_3 = iy.c;
                v1 /* !! */  = iy.ci;
                if (true) ** GOTO lbl11
                block37: while (true) {
                    v1 /* !! */  = (long)(v2 - iy.appw("aqet", apqu(int ), (int)60));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1671183739: {
                            break block37;
                        }
                        case -1430985644: {
                            v2 = iy.appw("aqeu", apqu(int ), (int)61);
                            continue block37;
                        }
                        case -797634650: {
                            v2 = iy.appw("aqev", apqu(int ), (int)62);
                            continue block37;
                        }
                        case 435065465: {
                            v2 = iy.appw("aqew", apqu(int ), (int)63);
                            continue block37;
                        }
                    }
                    break;
                }
                var5_4 = iy.b;
                v3 /* !! */  = iy.ci;
                if (true) ** GOTO lbl28
                block38: while (true) {
                    v3 /* !! */  = (long)(iy.appw("aqey", apqu(int ), (int)65) - iy.appw("aqex", apqu(int ), (int)64));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1671183739: {
                            break block38;
                        }
                        case 70658782: {
                            continue block38;
                        }
                    }
                    break;
                }
                var4_5 = iy.a;
                if (var6_3) {
                    throw null;
lbl36:
                    // 8 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl36
                if (var2_2 != null) break block52;
                if (var4_5) ** GOTO lbl36
                return;
            }
            if (var4_5 || var4_5) ** GOTO lbl36
            v4 /* !! */  = iy.ci;
            if (true) ** GOTO lbl48
            block40: while (true) {
                v4 /* !! */  = (long)(iy.appw("aqfa", apqu(int ), (int)67) - iy.appw("aqez", apqu(int ), (int)66));
lbl48:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1671183739: {
                        break block40;
                    }
                    case 2116543578: {
                        continue block40;
                    }
                }
                break;
            }
            var3_6 = var1_1.method_10062();
            if (var4_5 || var4_5) ** GOTO lbl36
            v5 /* !! */  = iy.ci;
            if (true) ** GOTO lbl59
            block41: while (true) {
                v5 /* !! */  = (long)(v6 - iy.appw("aqfb", apqu(int ), (int)68));
lbl59:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1671183739: {
                        break block41;
                    }
                    case -768524292: {
                        v6 = iy.appw("aqfc", apqu(int ), (int)69);
                        continue block41;
                    }
                    case 783053310: {
                        v6 = iy.appw("aqfd", apqu(int ), (int)70);
                        continue block41;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aqfe", apqu(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == iy.appw("aqff", apqa(int ), (int)322)) break;
                v7 /* !! */  = (long)iy.appw("aqfg", apqa(int ), (int)323);
            }
            this.found.put(var3_6, var2_2);
            if (var4_5 || var4_5) ** GOTO lbl36
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqfh", apqu(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == iy.appw("aqfi", apqa(int ), (int)324)) break;
                v8 /* !! */  = (long)iy.appw("aqfj", apqa(int ), (int)325);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqfk", apqu(int ), (int)73)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == iy.appw("aqfl", apqa(int ), (int)326)) break;
                v9 /* !! */  = (long)iy.appw("aqfm", apqa(int ), (int)327);
            }
            if (!this.announced.add(var3_6)) break block53;
            if (var4_5 || var4_5) ** GOTO lbl36
            v10 /* !! */  = iy.ci;
            if (true) ** GOTO lbl91
            block45: while (true) {
                v10 /* !! */  = (long)(v11 - iy.appw("aqfn", apqu(int ), (int)74));
lbl91:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1915430242: {
                        v11 = iy.appw("aqfo", apqu(int ), (int)75);
                        continue block45;
                    }
                    case -1752836332: {
                        v11 = iy.appw("aqfp", apqu(int ), (int)76);
                        continue block45;
                    }
                    case -1671183739: {
                        break block45;
                    }
                }
                break;
            }
            v12 = var3_6.method_10263();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("aqfq", apqu(int ), (int)77)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == iy.appw("aqfr", apqa(int ), (int)328)) break;
                v13 /* !! */  = (long)iy.appw("aqfs", apqa(int ), (int)329);
            }
            v14 = var3_6.method_10264();
            v15 /* !! */  = iy.ci;
            if (true) ** GOTO lbl111
            block47: while (true) {
                v15 /* !! */  = (long)(v16 - iy.appw("aqft", apqu(int ), (int)78));
lbl111:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1671183739: {
                        break block47;
                    }
                    case -68024524: {
                        v16 = iy.appw("aqfu", apqu(int ), (int)79);
                        continue block47;
                    }
                    case 1141689225: {
                        v16 = iy.appw("aqfv", apqu(int ), (int)80);
                        continue block47;
                    }
                    case 1846512605: {
                        v16 = iy.appw("aqfw", apqu(int ), (int)81);
                        continue block47;
                    }
                }
                break;
            }
            v17 = var3_6.method_10260();
            v18 /* !! */  = iy.ci;
            if (true) ** GOTO lbl128
            block48: while (true) {
                v18 /* !! */  = (long)(v19 - iy.appw("aqfx", apqu(int ), (int)82));
lbl128:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1671183739: {
                        break block48;
                    }
                    case -685505025: {
                        v19 = iy.appw("aqfy", apqu(int ), (int)83);
                        continue block48;
                    }
                    case 694001610: {
                        v19 = iy.appw("aqfz", apqu(int ), (int)84);
                        continue block48;
                    }
                    case 1263321060: {
                        v19 = iy.appw("aqga", apqu(int ), (int)85);
                        continue block48;
                    }
                }
                break;
            }
            v20 = var2_2.blockName;
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_5 = iy.ci - iy.appw("aqgb", apqu(int ), (int)86)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == iy.appw("aqgc", apqa(int ), (int)330)) break;
                v21 /* !! */  = (long)iy.appw("aqgd", apqa(int ), (int)331);
            }
            v22 = "\u041d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 " + v12 + " " + v14 + " " + v17 + " \u043d\u0430\u0439\u0434\u0435\u043d " + v20;
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_6 = iy.ci - iy.appw("aqge", apqu(int ), (int)87)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == iy.appw("aqgf", apqa(int ), (int)332)) break;
                v23 /* !! */  = (long)iy.appw("aqgg", apqa(int ), (int)333);
            }
            pp.brandmessage(v22);
            if (var4_5) ** GOTO lbl36
        }
        if (!var4_5 && !var4_5) ** break;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetSearchState() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("aqyb", apqu(int ), (int)222)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == iy.appw("aqyc", apqa(int ), (int)661)) break;
            v0 /* !! */  = (long)iy.appw("aqyd", apqa(int ), (int)662);
        }
        var3_1 = iy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aqye", apqu(int ), (int)223)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == iy.appw("aqyf", apqa(int ), (int)663)) break;
            v1 /* !! */  = (long)iy.appw("aqyg", apqa(int ), (int)664);
        }
        var2_2 = iy.b;
        v2 /* !! */  = iy.ci;
        if (true) ** GOTO lbl17
        block48: while (true) {
            v2 /* !! */  = (long)(iy.appw("aqyi", apqu(int ), (int)225) - iy.appw("aqyh", apqu(int ), (int)224));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1671183739: {
                    break block48;
                }
                case 1311753360: {
                    continue block48;
                }
            }
            break;
        }
        var1_3 = iy.a;
        if (var3_1) {
            throw null;
lbl25:
            // 10 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqyj", apqu(int ), (int)226)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == iy.appw("aqyk", apqa(int ), (int)665)) break;
            v3 /* !! */  = (long)iy.appw("aqyl", apqa(int ), (int)666);
        }
        v4 /* !! */  = iy.ci;
        if (true) ** GOTO lbl37
        block51: while (true) {
            v4 /* !! */  = (long)(v5 - iy.appw("aqym", apqu(int ), (int)227));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1671183739: {
                    break block51;
                }
                case -1172644698: {
                    v5 = iy.appw("aqyn", apqu(int ), (int)228);
                    continue block51;
                }
                case 29111793: {
                    v5 = iy.appw("aqyo", apqu(int ), (int)229);
                    continue block51;
                }
            }
            break;
        }
        this.found.clear();
        if (var1_3 || var1_3) ** GOTO lbl25
        v6 /* !! */  = iy.ci;
        if (true) ** GOTO lbl52
        block52: while (true) {
            v6 /* !! */  = (long)(iy.appw("aqyq", apqu(int ), (int)231) - iy.appw("aqyp", apqu(int ), (int)230));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1671183739: {
                    break block52;
                }
                case -369154458: {
                    continue block52;
                }
            }
            break;
        }
        v7 /* !! */  = iy.ci;
        if (true) ** GOTO lbl61
        block53: while (true) {
            v7 /* !! */  = (long)(v8 - iy.appw("aqyr", apqu(int ), (int)232));
lbl61:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1671183739: {
                    break block53;
                }
                case -1373175755: {
                    v8 = iy.appw("aqys", apqu(int ), (int)233);
                    continue block53;
                }
                case 1233711187: {
                    v8 = iy.appw("aqyt", apqu(int ), (int)234);
                    continue block53;
                }
                case 1978134415: {
                    v8 = iy.appw("aqyu", apqu(int ), (int)235);
                    continue block53;
                }
            }
            break;
        }
        this.announced.clear();
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqyv", apqu(int ), (int)236)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == iy.appw("aqyw", apqa(int ), (int)667)) break;
            v9 /* !! */  = (long)iy.appw("aqyx", apqa(int ), (int)668);
        }
        v10 /* !! */  = iy.ci;
        if (true) ** GOTO lbl84
        block55: while (true) {
            v10 /* !! */  = (long)(v11 - iy.appw("aqyy", apqu(int ), (int)237));
lbl84:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1671183739: {
                    break block55;
                }
                case -998904274: {
                    v11 = iy.appw("aqyz", apqu(int ), (int)238);
                    continue block55;
                }
                case 1286667025: {
                    v11 = iy.appw("aqza", apqu(int ), (int)239);
                    continue block55;
                }
            }
            break;
        }
        this.foundEntities.clear();
        if (var1_3 || var1_3) ** GOTO lbl25
        v12 /* !! */  = iy.ci;
        if (true) ** GOTO lbl99
        block56: while (true) {
            v12 /* !! */  = (long)(v13 - iy.appw("aqzb", apqu(int ), (int)240));
lbl99:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1671183739: {
                    break block56;
                }
                case 445455202: {
                    v13 = iy.appw("aqzc", apqu(int ), (int)241);
                    continue block56;
                }
                case 1550732401: {
                    v13 = iy.appw("aqzd", apqu(int ), (int)242);
                    continue block56;
                }
            }
            break;
        }
        v14 /* !! */  = iy.ci;
        if (true) ** GOTO lbl112
        block57: while (true) {
            v14 /* !! */  = (long)(iy.appw("aqzf", apqu(int ), (int)244) - iy.appw("aqze", apqu(int ), (int)243));
lbl112:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1671183739: {
                    break block57;
                }
                case -716599496: {
                    continue block57;
                }
            }
            break;
        }
        this.announcedEntities.clear();
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("aqzg", apqu(int ), (int)245)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == iy.appw("aqzh", apqa(int ), (int)669)) break;
            v15 /* !! */  = (long)iy.appw("aqzi", apqa(int ), (int)670);
        }
        v16 /* !! */  = iy.ci;
        if (true) ** GOTO lbl128
        block59: while (true) {
            v16 /* !! */  = (long)(v17 - iy.appw("aqzj", apqu(int ), (int)246));
lbl128:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1671183739: {
                    break block59;
                }
                case 725129356: {
                    v17 = iy.appw("aqzk", apqu(int ), (int)247);
                    continue block59;
                }
                case 1348026630: {
                    v17 = iy.appw("aqzl", apqu(int ), (int)248);
                    continue block59;
                }
            }
            break;
        }
        this.scannedChunks.clear();
        if (var1_3 || var1_3) ** GOTO lbl25
        v18 /* !! */  = iy.ci;
        if (true) ** GOTO lbl143
        block60: while (true) {
            v18 /* !! */  = (long)(iy.appw("aqzn", apqu(int ), (int)250) - iy.appw("aqzm", apqu(int ), (int)249));
lbl143:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -2109035813: {
                    continue block60;
                }
                case -1671183739: {
                    break block60;
                }
            }
            break;
        }
        this.lastPlayerChunk = null;
        if (var1_3 || var1_3) ** GOTO lbl25
        v19 = iy.appw("aqzo", apqa(int ), (int)671);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_5 = iy.ci - iy.appw("aqzp", apqu(int ), (int)251)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == iy.appw("aqzq", apqa(int ), (int)672)) break;
            v20 /* !! */  = (long)iy.appw("aqzr", apqa(int ), (int)673);
        }
        this.lastRadius = (int)v19;
        if (var1_3 || var1_3) ** GOTO lbl25
        v21 = iy.appw("aqzs", apqu(int ), (int)252);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_6 = iy.ci - iy.appw("aqzt", apqu(int ), (int)253)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == iy.appw("aqzu", apqa(int ), (int)674)) break;
            v22 /* !! */  = (long)iy.appw("aqzv", apqa(int ), (int)675);
        }
        this.lastScanTime = (long)v21;
        if (var1_3 || var1_3) ** GOTO lbl25
        v23 = iy.appw("aqzw", apqa(int ), (int)676);
        v24 /* !! */  = iy.ci;
        if (true) ** GOTO lbl171
        block63: while (true) {
            v24 /* !! */  = (long)(iy.appw("aqzy", apqu(int ), (int)255) - iy.appw("aqzx", apqu(int ), (int)254));
lbl171:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1671183739: {
                    break block63;
                }
                case -1622013576: {
                    continue block63;
                }
            }
            break;
        }
        this.lastMaintenanceAge = (int)v23;
        ** while (var1_3 || var1_3)
lbl178:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void render() {
        block102: {
            var8_1 = iy.c;
            var7_2 /* !! */  = iy.b;
            var6_3 = iy.a;
            if (var8_1) {
                throw null;
lbl6:
                // 28 sources

                return;
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!this.found.isEmpty()) break block102;
            if (var6_3) ** GOTO lbl6
            if (!this.foundEntities.isEmpty()) break block102;
            if (var6_3) ** GOTO lbl6
            return;
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        ls.begin((boolean)iy.appw("aqkm", apqa(int ), (int)422));
        if (var6_3 || var6_3) ** GOTO lbl6
        lv.begin((boolean)iy.appw("aqkn", apqa(int ), (int)423));
        if (var6_3 || var6_3) ** GOTO lbl6
        var1_4 = this.found.entrySet().iterator();
        if (var6_3) ** GOTO lbl6
        block55: while (true) {
            if (var6_3) ** GOTO lbl6
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_3) ** GOTO lbl6
                    if (!var1_4.hasNext()) ** GOTO lbl42
                    if (var6_3) ** GOTO lbl6
                    var2_5 /* !! */  = var1_4.next();
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var3_6 = var2_5 /* !! */ .getKey();
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var4_7 = var2_5 /* !! */ .getValue().color;
                    if (var6_3 || var6_3) ** GOTO lbl6
                    ls.box(new class_238(var3_6).method_1014((double)iy.appw("aqkp", aqko(int ), (int)109)), var4_7, (float)iy.appw("aqkq", appt(int ), (int)424));
                    if (var6_3 || var6_3) ** GOTO lbl6
                    lv.box((double)var3_6.method_10263() + iy.appw("aqkr", aqko(int ), (int)110), (double)var3_6.method_10264() + iy.appw("aqks", aqko(int ), (int)111), (double)var3_6.method_10260() + iy.appw("aqkt", aqko(int ), (int)112), (float)iy.appw("aqku", appt(int ), (int)425), var4_7, 1.0f);
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (!var8_1) continue block55;
                    throw null;
lbl42:
                    // 1 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    var1_4 = this.foundEntities.values().iterator();
                    if (var6_3) ** GOTO lbl6
                    do {
                        if (var6_3 || var6_3) ** GOTO lbl6
                        if (!var1_4.hasNext()) ** GOTO lbl63
                        if (var6_3) ** GOTO lbl6
                        var2_5 /* !! */  = (iy$FoundEntity)var1_4.next();
                        if (var6_3 || var6_3) ** GOTO lbl6
                        var3_6 = var2_5 /* !! */ .entity;
                        if (var6_3 || var6_3) ** GOTO lbl6
                        var4_7 = var2_5 /* !! */ .type.color;
                        if (var6_3 || var6_3) ** GOTO lbl6
                        var5_8 = var3_6.method_5829().method_1014((double)iy.appw("aqkv", aqko(int ), (int)113));
                        if (var6_3 || var6_3) ** GOTO lbl6
                        ls.box(var5_8, var4_7, (float)iy.appw("aqkw", appt(int ), (int)426));
                        if (var6_3 || var6_3) ** GOTO lbl6
                        this.drawOutlinedBox(var5_8, var4_7);
                        if (var6_3 || var6_3) ** GOTO lbl6
                    } while (!var8_1);
                    throw null;
lbl63:
                    // 1 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    ls.end();
                    if (var6_3 || var6_3) ** GOTO lbl6
                    lv.end();
                    if (!var6_3 && !var6_3) ** break;
                    ** continue;
                    return;
                }
lbl70:
                // 2 sources

                case 0: {
                    var7_2 /* !! */  = (int)iy.appw("aqkx", apqa(int ), (int)427);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 1: {
                    var7_2 /* !! */  = (int)iy.appw("aqky", apqa(int ), (int)428);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
lbl80:
                // 4 sources

                case 2: {
                    var7_2 /* !! */  = (int)iy.appw("aqkz", apqa(int ), (int)429);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl244
                }
                case 3: {
                    var7_2 /* !! */  = (int)iy.appw("aqla", apqa(int ), (int)430);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
                case 4: {
                    var7_2 /* !! */  = (int)iy.appw("aqlb", apqa(int ), (int)431);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
                case 5: {
                    var7_2 /* !! */  = (int)iy.appw("aqlc", apqa(int ), (int)432);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
                case 6: {
                    var7_2 /* !! */  = (int)iy.appw("aqld", apqa(int ), (int)433);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl265
                }
lbl105:
                // 3 sources

                case 7: {
                    var7_2 /* !! */  = (int)iy.appw("aqle", apqa(int ), (int)434);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl110:
                // 2 sources

                case 8: {
                    var7_2 /* !! */  = (int)iy.appw("aqlf", apqa(int ), (int)435);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
lbl115:
                // 2 sources

                case 9: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)iy.appw("aqlg", apqa(int ), (int)436);
                        if (var8_1) {
                            throw null;
                        }
                        ** GOTO lbl257
                        break;
                    }
                }
lbl121:
                // 5 sources

                case 10: {
                    var7_2 /* !! */  = (int)iy.appw("aqlh", apqa(int ), (int)437);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
lbl126:
                // 2 sources

                case 11: {
                    var7_2 /* !! */  = (int)iy.appw("aqli", apqa(int ), (int)438);
                    if (!var8_1) ** GOTO lbl80
                    throw null;
                }
lbl130:
                // 2 sources

                case 12: {
                    var7_2 /* !! */  = (int)iy.appw("aqlj", apqa(int ), (int)439);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
                case 13: {
                    var7_2 /* !! */  = (int)iy.appw("aqlk", apqa(int ), (int)440);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 14: {
                    var7_2 /* !! */  = (int)iy.appw("aqll", apqa(int ), (int)441);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
                case 15: {
                    var7_2 /* !! */  = (int)iy.appw("aqlm", apqa(int ), (int)442);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl150:
                // 2 sources

                case 16: {
                    var7_2 /* !! */  = (int)iy.appw("aqln", apqa(int ), (int)443);
                    if (!var8_1) ** GOTO lbl70
                    throw null;
                }
lbl154:
                // 2 sources

                case 17: {
                    var7_2 /* !! */  = (int)iy.appw("aqlo", apqa(int ), (int)444);
                    if (!var8_1) ** GOTO lbl121
                    throw null;
                }
lbl158:
                // 2 sources

                case 18: {
                    var7_2 /* !! */  = (int)iy.appw("aqlp", apqa(int ), (int)445);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
                case 19: {
                    var7_2 /* !! */  = (int)iy.appw("aqlq", apqa(int ), (int)446);
                    if (!var8_1) ** GOTO lbl80
                    throw null;
                }
lbl167:
                // 2 sources

                case 20: {
                    var7_2 /* !! */  = (int)iy.appw("aqlr", apqa(int ), (int)447);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
lbl172:
                // 2 sources

                case 21: {
                    var7_2 /* !! */  = (int)iy.appw("aqls", apqa(int ), (int)448);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl265
                }
lbl177:
                // 3 sources

                case 22: {
                    var7_2 /* !! */  = (int)iy.appw("aqlt", apqa(int ), (int)449);
                    if (!var8_1) ** GOTO lbl167
                    throw null;
                }
                case 23: {
                    var7_2 /* !! */  = (int)iy.appw("aqlu", apqa(int ), (int)450);
                    if (!var8_1) ** GOTO lbl110
                    throw null;
                }
lbl185:
                // 2 sources

                case 24: {
                    var7_2 /* !! */  = (int)iy.appw("aqlv", apqa(int ), (int)451);
                    if (!var8_1) ** GOTO lbl121
                    throw null;
                }
                case 25: {
                    var7_2 /* !! */  = (int)iy.appw("aqlw", apqa(int ), (int)452);
                    if (!var8_1) ** GOTO lbl105
                    throw null;
                }
lbl193:
                // 2 sources

                case 26: {
                    var7_2 /* !! */  = (int)iy.appw("aqlx", apqa(int ), (int)453);
                    if (!var8_1) ** GOTO lbl158
                    throw null;
                }
                case 27: {
                    var7_2 /* !! */  = (int)iy.appw("aqly", apqa(int ), (int)454);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
lbl202:
                // 3 sources

                case 28: {
                    var7_2 /* !! */  = (int)iy.appw("aqlz", apqa(int ), (int)455);
                    if (!var8_1) break block55;
                    throw null;
                }
                case 29: {
                    var7_2 /* !! */  = (int)iy.appw("aqma", apqa(int ), (int)456);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
lbl211:
                // 2 sources

                case 30: {
                    var7_2 /* !! */  = (int)iy.appw("aqmb", apqa(int ), (int)457);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
lbl216:
                // 2 sources

                case 31: {
                    var7_2 /* !! */  = (int)iy.appw("aqmc", apqa(int ), (int)458);
                    if (!var8_1) ** GOTO lbl121
                    throw null;
                }
lbl220:
                // 3 sources

                case 32: {
                    var7_2 /* !! */  = (int)iy.appw("aqmd", apqa(int ), (int)459);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
                case 33: {
                    var7_2 /* !! */  = (int)iy.appw("aqme", apqa(int ), (int)460);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl230:
                // 2 sources

                case 34: {
                    var7_2 /* !! */  = (int)iy.appw("aqmf", apqa(int ), (int)461);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl261
                }
lbl235:
                // 2 sources

                case 35: {
                    var7_2 /* !! */  = (int)iy.appw("aqmg", apqa(int ), (int)462);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
lbl240:
                // 2 sources

                case 36: {
                    var7_2 /* !! */  = (int)iy.appw("aqmh", apqa(int ), (int)463);
                    if (!var8_1) ** GOTO lbl105
                    throw null;
                }
lbl244:
                // 2 sources

                case 37: {
                    var7_2 /* !! */  = (int)iy.appw("aqmi", apqa(int ), (int)464);
                    if (!var8_1) ** GOTO lbl202
                    throw null;
                }
lbl248:
                // 3 sources

                case 38: {
                    var7_2 /* !! */  = (int)iy.appw("aqmj", apqa(int ), (int)465);
                    if (!var8_1) ** GOTO lbl220
                    throw null;
                }
lbl252:
                // 3 sources

                case 39: {
                    var7_2 /* !! */  = (int)iy.appw("aqmk", apqa(int ), (int)466);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl257:
                // 4 sources

                case 40: {
                    var7_2 /* !! */  = (int)iy.appw("aqml", apqa(int ), (int)467);
                    if (!var8_1) ** GOTO lbl115
                    throw null;
                }
lbl261:
                // 2 sources

                case 41: {
                    var7_2 /* !! */  = (int)iy.appw("aqmm", apqa(int ), (int)468);
                    if (!var8_1) ** GOTO lbl216
                    throw null;
                }
lbl265:
                // 3 sources

                case 42: {
                    var7_2 /* !! */  = (int)iy.appw("aqmn", apqa(int ), (int)469);
                    if (!var8_1) ** GOTO lbl130
                    throw null;
                }
lbl269:
                // 3 sources

                case 43: {
                    var7_2 /* !! */  = (int)iy.appw("aqmo", apqa(int ), (int)470);
                    if (!var8_1) ** GOTO lbl150
                    throw null;
                }
                case 44: {
                    var7_2 /* !! */  = (int)iy.appw("aqmp", apqa(int ), (int)471);
                    if (!var8_1) ** GOTO lbl126
                    throw null;
                }
lbl277:
                // 2 sources

                case 45: {
                    var7_2 /* !! */  = (int)iy.appw("aqmq", apqa(int ), (int)472);
                    if (!var8_1) ** GOTO lbl154
                    throw null;
                }
                case 46: {
                    var7_2 /* !! */  = (int)iy.appw("aqmr", apqa(int ), (int)473);
                    if (!var8_1) ** GOTO lbl80
                    throw null;
                }
                case 47: {
                    var7_2 /* !! */  = (int)iy.appw("aqms", apqa(int ), (int)474);
                    if (!var8_1) ** GOTO lbl121
                    throw null;
                }
lbl289:
                // 3 sources

                case 48: {
                    var7_2 /* !! */  = (int)iy.appw("aqmt", apqa(int ), (int)475);
                    if (!var8_1) ** GOTO lbl202
                    throw null;
                }
lbl293:
                // 3 sources

                case 49: {
                    var7_2 /* !! */  = (int)iy.appw("aqmu", apqa(int ), (int)476);
                    if (!var8_1) ** GOTO lbl230
                    throw null;
                }
                case 50: {
                    var7_2 /* !! */  = (int)iy.appw("aqmv", apqa(int ), (int)477);
                    if (!var8_1) ** GOTO lbl248
                    throw null;
                }
                case 51: 
            }
            break;
        }
        var7_2 /* !! */  = (int)iy.appw("aqmw", apqa(int ), (int)478);
        ** while (!var8_1)
lbl304:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block120: {
            block119: {
                block118: {
                    var9_2 = iy.c;
                    var8_3 /* !! */  = iy.b;
                    var7_4 = iy.a;
                    if (var9_2) {
                        throw null;
lbl6:
                        // 35 sources

                        return;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (iy.mc.field_1687 == null) break block118;
                    if (var7_4) ** GOTO lbl6
                    if (iy.mc.field_1724 != null) break block119;
                    if (var7_4) ** GOTO lbl6
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                return;
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            var2_5 = Math.round(this.distance.getValue());
            if (var7_4 || var7_4) ** GOTO lbl6
            var3_6 = this.targetMask();
            if (var7_4 || var7_4) ** GOTO lbl6
            if (var3_6 == this.lastTargetMask) break block120;
            if (var7_4 || var7_4) ** GOTO lbl6
            this.resetSearchState();
            if (var7_4 || var7_4) ** GOTO lbl6
            this.lastTargetMask = var3_6;
            if (var7_4) ** GOTO lbl6
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var4_7 = new class_1923(iy.mc.field_1724.method_24515());
        if (var7_4 || var7_4) ** GOTO lbl6
        if (var2_5 == this.lastRadius) ** GOTO lbl42
        if (var7_4 || var7_4) ** GOTO lbl6
        this.resetSearchState();
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                this.lastRadius = var2_5;
                if (var7_4) ** GOTO lbl6
lbl42:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.lastPlayerChunk == null) ** GOTO lbl47
                if (var7_4) ** GOTO lbl6
                if (this.lastPlayerChunk.equals((Object)var4_7)) ** GOTO lbl52
                if (var7_4) ** GOTO lbl6
lbl47:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.scannedChunks.clear();
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastPlayerChunk = var4_7;
                if (var7_4) ** GOTO lbl6
lbl52:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var5_8 = System.currentTimeMillis();
                if (var7_4 || var7_4) ** GOTO lbl6
                if ((var3_6 & iy.appw("aptc", apqa(int ), (int)50)) == 0) ** GOTO lbl63
                if (var7_4) ** GOTO lbl6
                if (var5_8 - this.lastScanTime < iy.appw("aptd", apqu(int ), (int)29)) ** GOTO lbl63
                if (var7_4 || var7_4) ** GOTO lbl6
                this.scanNearbyChunks(var2_5, var3_6);
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastScanTime = var5_8;
                if (var7_4) ** GOTO lbl6
lbl63:
                // 3 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.lastMaintenanceAge == iy.mc.field_1724.field_6012) ** GOTO lbl72
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastMaintenanceAge = iy.mc.field_1724.field_6012;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.cleanup(iy.mc.field_1724.method_73189(), var2_5, var3_6);
                if (var7_4 || var7_4) ** GOTO lbl6
                this.scanEntities(var2_5, var3_6);
                if (var7_4) ** GOTO lbl6
lbl72:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.render();
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
lbl77:
            // 2 sources

            case 0: {
                var8_3 /* !! */  = (int)iy.appw("apte", apqa(int ), (int)51);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl82:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)iy.appw("aptf", apqa(int ), (int)52);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 2: {
                var8_3 /* !! */  = (int)iy.appw("aptg", apqa(int ), (int)53);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl92:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)iy.appw("apth", apqa(int ), (int)54);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl97:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)iy.appw("apti", apqa(int ), (int)55);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl102:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)iy.appw("aptj", apqa(int ), (int)56);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl107:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)iy.appw("aptk", apqa(int ), (int)57);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 7: {
                var8_3 /* !! */  = (int)iy.appw("aptl", apqa(int ), (int)58);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl117:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)iy.appw("aptm", apqa(int ), (int)59);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl122:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)iy.appw("aptn", apqa(int ), (int)60);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl127:
            // 2 sources

            case 10: {
                var8_3 /* !! */  = (int)iy.appw("apto", apqa(int ), (int)61);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)iy.appw("aptp", apqa(int ), (int)62);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl182
                    break;
                }
            }
            case 12: {
                var8_3 /* !! */  = (int)iy.appw("aptq", apqa(int ), (int)63);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl143:
            // 3 sources

            case 13: {
                var8_3 /* !! */  = (int)iy.appw("aptr", apqa(int ), (int)64);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl148:
            // 3 sources

            case 14: {
                var8_3 /* !! */  = (int)iy.appw("apts", apqa(int ), (int)65);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 15: {
                var8_3 /* !! */  = (int)iy.appw("aptt", apqa(int ), (int)66);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl158:
            // 4 sources

            case 16: {
                var8_3 /* !! */  = (int)iy.appw("aptu", apqa(int ), (int)67);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl163:
            // 2 sources

            case 17: {
                var8_3 /* !! */  = (int)iy.appw("aptv", apqa(int ), (int)68);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl168:
            // 4 sources

            case 18: {
                var8_3 /* !! */  = (int)iy.appw("aptw", apqa(int ), (int)69);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 19: {
                var8_3 /* !! */  = (int)iy.appw("aptx", apqa(int ), (int)70);
                if (!var9_2) ** GOTO lbl122
                throw null;
            }
            case 20: {
                var8_3 /* !! */  = (int)iy.appw("apty", apqa(int ), (int)71);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl182:
            // 3 sources

            case 21: {
                var8_3 /* !! */  = (int)iy.appw("aptz", apqa(int ), (int)72);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl187:
            // 3 sources

            case 22: {
                var8_3 /* !! */  = (int)iy.appw("apua", apqa(int ), (int)73);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 23: {
                var8_3 /* !! */  = (int)iy.appw("apub", apqa(int ), (int)74);
                if (!var9_2) ** GOTO lbl187
                throw null;
            }
lbl196:
            // 3 sources

            case 24: {
                var8_3 /* !! */  = (int)iy.appw("apuc", apqa(int ), (int)75);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl201:
            // 2 sources

            case 25: {
                var8_3 /* !! */  = (int)iy.appw("apud", apqa(int ), (int)76);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 26: {
                var8_3 /* !! */  = (int)iy.appw("apue", apqa(int ), (int)77);
                if (!var9_2) ** GOTO lbl92
                throw null;
            }
lbl210:
            // 3 sources

            case 27: {
                var8_3 /* !! */  = (int)iy.appw("apuf", apqa(int ), (int)78);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 28: {
                var8_3 /* !! */  = (int)iy.appw("apug", apqa(int ), (int)79);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl220:
            // 3 sources

            case 29: {
                var8_3 /* !! */  = (int)iy.appw("apuh", apqa(int ), (int)80);
                if (!var9_2) ** GOTO lbl82
                throw null;
            }
            case 30: {
                var8_3 /* !! */  = (int)iy.appw("apui", apqa(int ), (int)81);
                if (!var9_2) ** GOTO lbl158
                throw null;
            }
lbl228:
            // 4 sources

            case 31: {
                var8_3 /* !! */  = (int)iy.appw("apuj", apqa(int ), (int)82);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 32: {
                var8_3 /* !! */  = (int)iy.appw("apuk", apqa(int ), (int)83);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 33: {
                var8_3 /* !! */  = (int)iy.appw("apul", apqa(int ), (int)84);
                if (!var9_2) ** GOTO lbl228
                throw null;
            }
lbl242:
            // 4 sources

            case 34: {
                var8_3 /* !! */  = (int)iy.appw("apum", apqa(int ), (int)85);
                if (!var9_2) ** GOTO lbl168
                throw null;
            }
            case 35: {
                var8_3 /* !! */  = (int)iy.appw("apun", apqa(int ), (int)86);
                if (!var9_2) ** GOTO lbl97
                throw null;
            }
            case 36: {
                var8_3 /* !! */  = (int)iy.appw("apuo", apqa(int ), (int)87);
                if (!var9_2) ** GOTO lbl143
                throw null;
            }
lbl254:
            // 3 sources

            case 37: {
                var8_3 /* !! */  = (int)iy.appw("apup", apqa(int ), (int)88);
                if (!var9_2) ** GOTO lbl168
                throw null;
            }
lbl258:
            // 2 sources

            case 38: {
                var8_3 /* !! */  = (int)iy.appw("apuq", apqa(int ), (int)89);
                if (!var9_2) ** GOTO lbl163
                throw null;
            }
            case 39: {
                var8_3 /* !! */  = (int)iy.appw("apur", apqa(int ), (int)90);
                if (!var9_2) ** GOTO lbl254
                throw null;
            }
            case 40: {
                var8_3 /* !! */  = (int)iy.appw("apus", apqa(int ), (int)91);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 41: {
                var8_3 /* !! */  = (int)iy.appw("aput", apqa(int ), (int)92);
                if (!var9_2) ** GOTO lbl158
                throw null;
            }
            case 42: {
                var8_3 /* !! */  = (int)iy.appw("apuu", apqa(int ), (int)93);
                if (!var9_2) ** GOTO lbl242
                throw null;
            }
lbl279:
            // 4 sources

            case 43: {
                var8_3 /* !! */  = (int)iy.appw("apuv", apqa(int ), (int)94);
                if (!var9_2) ** GOTO lbl182
                throw null;
            }
lbl283:
            // 2 sources

            case 44: {
                var8_3 /* !! */  = (int)iy.appw("apuw", apqa(int ), (int)95);
                if (!var9_2) ** GOTO lbl77
                throw null;
            }
            case 45: {
                var8_3 /* !! */  = (int)iy.appw("apux", apqa(int ), (int)96);
                if (!var9_2) ** GOTO lbl148
                throw null;
            }
lbl291:
            // 2 sources

            case 46: {
                var8_3 /* !! */  = (int)iy.appw("apuy", apqa(int ), (int)97);
                if (!var9_2) ** GOTO lbl158
                throw null;
            }
lbl295:
            // 2 sources

            case 47: {
                var8_3 /* !! */  = (int)iy.appw("apuz", apqa(int ), (int)98);
                if (!var9_2) break;
                throw null;
            }
lbl299:
            // 6 sources

            case 48: {
                var8_3 /* !! */  = (int)iy.appw("apva", apqa(int ), (int)99);
                if (!var9_2) ** GOTO lbl187
                throw null;
            }
lbl303:
            // 2 sources

            case 49: {
                var8_3 /* !! */  = (int)iy.appw("apvb", apqa(int ), (int)100);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl308:
            // 2 sources

            case 50: {
                var8_3 /* !! */  = (int)iy.appw("apvc", apqa(int ), (int)101);
                if (!var9_2) ** GOTO lbl168
                throw null;
            }
            case 51: {
                var8_3 /* !! */  = (int)iy.appw("apvd", apqa(int ), (int)102);
                if (!var9_2) ** GOTO lbl299
                throw null;
            }
lbl316:
            // 2 sources

            case 52: {
                var8_3 /* !! */  = (int)iy.appw("apve", apqa(int ), (int)103);
                if (!var9_2) ** GOTO lbl107
                throw null;
            }
lbl320:
            // 2 sources

            case 53: {
                var8_3 /* !! */  = (int)iy.appw("apvf", apqa(int ), (int)104);
                if (!var9_2) ** GOTO lbl127
                throw null;
            }
lbl324:
            // 3 sources

            case 54: {
                var8_3 /* !! */  = (int)iy.appw("apvg", apqa(int ), (int)105);
                if (!var9_2) ** GOTO lbl196
                throw null;
            }
lbl328:
            // 3 sources

            case 55: {
                var8_3 /* !! */  = (int)iy.appw("apvh", apqa(int ), (int)106);
                if (!var9_2) ** GOTO lbl143
                throw null;
            }
            case 56: {
                var8_3 /* !! */  = (int)iy.appw("apvi", apqa(int ), (int)107);
                if (!var9_2) ** GOTO lbl102
                throw null;
            }
            case 57: {
                var8_3 /* !! */  = (int)iy.appw("apvj", apqa(int ), (int)108);
                if (!var9_2) ** GOTO lbl117
                throw null;
            }
            case 58: {
                var8_3 /* !! */  = (int)iy.appw("apvk", apqa(int ), (int)109);
                if (!var9_2) ** GOTO lbl228
                throw null;
            }
            case 59: {
                var8_3 /* !! */  = (int)iy.appw("apvl", apqa(int ), (int)110);
                if (!var9_2) ** GOTO lbl279
                throw null;
            }
            case 60: 
        }
        var8_3 /* !! */  = (int)iy.appw("apvm", apqa(int ), (int)111);
        ** while (!var9_2)
lbl351:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void areg() {
        iy.appv[100] = 1871025970;
        iy.appv[101] = 904327480;
        iy.appv[102] = 16900380;
        iy.appv[103] = 490461001;
        iy.appv[104] = 1566440545;
        iy.appv[105] = -1594110806;
        iy.appv[106] = -469823796;
        iy.appv[107] = -1372993846;
        iy.appv[108] = -536173543;
        iy.appv[109] = -1127595728;
        iy.appv[110] = 362225822;
        iy.appv[111] = 950279087;
        iy.appv[112] = 1051796844;
        iy.appv[113] = 1430637626;
        iy.appv[114] = 1309095437;
        iy.appv[115] = 481634244;
        iy.appv[116] = -97139962;
        iy.appv[117] = 794654673;
        iy.appv[118] = -357768764;
        iy.appv[119] = -605426021;
        iy.appv[120] = -1807498845;
        iy.appv[121] = -1876631042;
        iy.appv[122] = -548264148;
        iy.appv[123] = 955258252;
        iy.appv[124] = -1495256640;
        iy.appv[125] = 830199404;
        iy.appv[126] = 1354972485;
        iy.appv[127] = 164909053;
        iy.appv[128] = 1156784277;
        iy.appv[129] = 1466129996;
        iy.appv[130] = 1954359993;
        iy.appv[131] = -1878733854;
        iy.appv[132] = 578708545;
        iy.appv[133] = -2101777800;
        iy.appv[134] = 1453428526;
        iy.appv[135] = 963601031;
        iy.appv[136] = -621250745;
        iy.appv[137] = -301827109;
        iy.appv[138] = 491597275;
        iy.appv[139] = 625709452;
        iy.appv[140] = -122349767;
        iy.appv[141] = 427486735;
        iy.appv[142] = 1010044254;
        iy.appv[143] = -1852014543;
        iy.appv[144] = 950835890;
        iy.appv[145] = -1826633657;
        iy.appv[146] = -700497717;
        iy.appv[147] = -461925164;
        iy.appv[148] = 898511496;
        iy.appv[149] = 1744386158;
        iy.appv[150] = -1575637497;
        iy.appv[151] = -1981784394;
        iy.appv[152] = -350713278;
        iy.appv[153] = 871308432;
        iy.appv[154] = -80059049;
        iy.appv[155] = -1798121467;
        iy.appv[156] = -763921465;
        iy.appv[157] = 655507065;
        iy.appv[158] = 553672243;
        iy.appv[159] = 1948337174;
        iy.appv[160] = 421317208;
        iy.appv[161] = 147531163;
        iy.appv[162] = -667112096;
        iy.appv[163] = 442183153;
        iy.appv[164] = 1081415872;
        iy.appv[165] = -586570956;
        iy.appv[166] = -509769667;
        iy.appv[167] = 2001160978;
        iy.appv[168] = 1564053194;
        iy.appv[169] = 1402895536;
        iy.appv[170] = -1105352356;
        iy.appv[171] = -640530834;
        iy.appv[172] = -198057486;
        iy.appv[173] = 949672011;
        iy.appv[174] = -1569658284;
        iy.appv[175] = -823085133;
        iy.appv[176] = -817777314;
        iy.appv[177] = 1009209338;
        iy.appv[178] = -356505900;
        iy.appv[179] = -451753260;
        iy.appv[180] = 64455950;
        iy.appv[181] = 1123995275;
        iy.appv[182] = -690504453;
        iy.appv[183] = -1196663868;
        iy.appv[184] = 578981970;
        iy.appv[185] = 349674250;
        iy.appv[186] = 1699561191;
        iy.appv[187] = 758942337;
        iy.appv[188] = 970487676;
        iy.appv[189] = 1573336678;
        iy.appv[190] = 794175884;
        iy.appv[191] = 1399589715;
        iy.appv[192] = 69894359;
        iy.appv[193] = 693366613;
        iy.appv[194] = -1470974778;
        iy.appv[195] = 1485420373;
        iy.appv[196] = 2065021143;
        iy.appv[197] = -72265612;
        iy.appv[198] = -391311184;
        iy.appv[199] = -635363020;
    }

    private static /* synthetic */ void ared() {
        iy.appu[600] = 1010087748;
        iy.appu[601] = 735027360;
        iy.appu[602] = -847486032;
        iy.appu[603] = -889009196;
        iy.appu[604] = 902356230;
        iy.appu[605] = -336527159;
        iy.appu[606] = 1460288279;
        iy.appu[607] = -1953340276;
        iy.appu[608] = 454445123;
        iy.appu[609] = 1575539695;
        iy.appu[610] = 506335934;
        iy.appu[611] = -871496707;
        iy.appu[612] = 806732881;
        iy.appu[613] = -1341415345;
        iy.appu[614] = 361155439;
        iy.appu[615] = 315113708;
        iy.appu[616] = -718614932;
        iy.appu[617] = -1041515961;
        iy.appu[618] = -1311998294;
        iy.appu[619] = 1132466842;
        iy.appu[620] = -1085591065;
        iy.appu[621] = -741627185;
        iy.appu[622] = 990595790;
        iy.appu[623] = 419303342;
        iy.appu[624] = 60153649;
        iy.appu[625] = 339126722;
        iy.appu[626] = 1591426386;
        iy.appu[627] = 763868022;
        iy.appu[628] = -1663087809;
        iy.appu[629] = 829913690;
        iy.appu[630] = -835845757;
        iy.appu[631] = 1052486424;
        iy.appu[632] = -1252011437;
        iy.appu[633] = 2071341391;
        iy.appu[634] = 258109183;
        iy.appu[635] = 415415059;
        iy.appu[636] = -887469156;
        iy.appu[637] = -2027521429;
        iy.appu[638] = -1485005457;
        iy.appu[639] = 833491232;
        iy.appu[640] = 1225045744;
        iy.appu[641] = -763693232;
        iy.appu[642] = -1118060372;
        iy.appu[643] = -1249238706;
        iy.appu[644] = 839736454;
        iy.appu[645] = -672260083;
        iy.appu[646] = -1290637139;
        iy.appu[647] = -585008796;
        iy.appu[648] = 709110872;
        iy.appu[649] = 1535299070;
        iy.appu[650] = -1020548311;
        iy.appu[651] = -362218283;
        iy.appu[652] = -679910445;
        iy.appu[653] = -378967303;
        iy.appu[654] = -2125973784;
        iy.appu[655] = -825678274;
        iy.appu[656] = -1769649340;
        iy.appu[657] = 1027016961;
        iy.appu[658] = 633338994;
        iy.appu[659] = -1890066043;
        iy.appu[660] = 1490339775;
        iy.appu[661] = -1392757426;
        iy.appu[662] = -605183613;
        iy.appu[663] = -491903177;
        iy.appu[664] = 1063455261;
        iy.appu[665] = 1022854440;
        iy.appu[666] = -1343717837;
        iy.appu[667] = 392361954;
        iy.appu[668] = -2004325921;
        iy.appu[669] = -1626999182;
        iy.appu[670] = -1631374832;
        iy.appu[671] = -1173072905;
        iy.appu[672] = -1646963887;
        iy.appu[673] = -753317829;
        iy.appu[674] = 92968704;
        iy.appu[675] = 1875365454;
        iy.appu[676] = 1505790136;
        iy.appu[677] = -838407028;
        iy.appu[678] = 1452784462;
        iy.appu[679] = 85605959;
        iy.appu[680] = -727086828;
        iy.appu[681] = 1154710852;
        iy.appu[682] = 593739999;
        iy.appu[683] = 528494342;
        iy.appu[684] = -1008960442;
        iy.appu[685] = 392252292;
        iy.appu[686] = 2103049915;
        iy.appu[687] = 1304887227;
        iy.appu[688] = -1321979481;
        iy.appu[689] = 118246802;
        iy.appu[690] = 1668947648;
        iy.appu[691] = 1935874573;
        iy.appu[692] = 1992292123;
        iy.appu[693] = -489713204;
        iy.appu[694] = 1794273226;
        iy.appu[695] = 89238932;
        iy.appu[696] = 60308095;
        iy.appu[697] = 2056329211;
        iy.appu[698] = 1462036486;
        iy.appu[699] = 1591155734;
    }

    private static /* synthetic */ void aref() {
        iy.appv[0] = -1999254532;
        iy.appv[1] = 1683809051;
        iy.appv[2] = -1496023728;
        iy.appv[3] = 1109947601;
        iy.appv[4] = -1588639204;
        iy.appv[5] = 13555653;
        iy.appv[6] = -384069525;
        iy.appv[7] = -1898569352;
        iy.appv[8] = -236947960;
        iy.appv[9] = -1544313285;
        iy.appv[10] = 1365844693;
        iy.appv[11] = 1909914957;
        iy.appv[12] = 542239776;
        iy.appv[13] = 1674846756;
        iy.appv[14] = -1672704759;
        iy.appv[15] = -812395968;
        iy.appv[16] = -1598342338;
        iy.appv[17] = -955246303;
        iy.appv[18] = -781751154;
        iy.appv[19] = 1392359528;
        iy.appv[20] = -1638086357;
        iy.appv[21] = -539701202;
        iy.appv[22] = -2105825846;
        iy.appv[23] = 223813046;
        iy.appv[24] = -1399699330;
        iy.appv[25] = -1783281986;
        iy.appv[26] = 404721565;
        iy.appv[27] = 1738127878;
        iy.appv[28] = -1246938821;
        iy.appv[29] = 348158440;
        iy.appv[30] = -96699929;
        iy.appv[31] = -1276836526;
        iy.appv[32] = 710573844;
        iy.appv[33] = -2132669428;
        iy.appv[34] = -110737004;
        iy.appv[35] = 842444632;
        iy.appv[36] = 1423572341;
        iy.appv[37] = -1112934229;
        iy.appv[38] = -477399417;
        iy.appv[39] = -817420179;
        iy.appv[40] = -982154519;
        iy.appv[41] = 1405575609;
        iy.appv[42] = 1567794636;
        iy.appv[43] = 1436639511;
        iy.appv[44] = 1576484449;
        iy.appv[45] = -1314271101;
        iy.appv[46] = 739886088;
        iy.appv[47] = -1919968404;
        iy.appv[48] = 1651217953;
        iy.appv[49] = 211606155;
        iy.appv[50] = -1148665738;
        iy.appv[51] = -1141455527;
        iy.appv[52] = 1784748142;
        iy.appv[53] = -1892937995;
        iy.appv[54] = -113050707;
        iy.appv[55] = 800243738;
        iy.appv[56] = -1238054377;
        iy.appv[57] = 823750261;
        iy.appv[58] = -241848986;
        iy.appv[59] = -456246909;
        iy.appv[60] = -1531295205;
        iy.appv[61] = -700814888;
        iy.appv[62] = -1310863096;
        iy.appv[63] = 204171286;
        iy.appv[64] = -279076706;
        iy.appv[65] = 901900493;
        iy.appv[66] = -335048694;
        iy.appv[67] = -1210215772;
        iy.appv[68] = 663871851;
        iy.appv[69] = -641882517;
        iy.appv[70] = -57700963;
        iy.appv[71] = -19735278;
        iy.appv[72] = 818246512;
        iy.appv[73] = -80030314;
        iy.appv[74] = -704725690;
        iy.appv[75] = -1412981409;
        iy.appv[76] = 873388908;
        iy.appv[77] = 1994794919;
        iy.appv[78] = 1177849516;
        iy.appv[79] = -1599374107;
        iy.appv[80] = 1892613606;
        iy.appv[81] = -833414836;
        iy.appv[82] = 721912499;
        iy.appv[83] = 1264642526;
        iy.appv[84] = 266407008;
        iy.appv[85] = -428824149;
        iy.appv[86] = 1941011912;
        iy.appv[87] = 1346608425;
        iy.appv[88] = -473984564;
        iy.appv[89] = 862969805;
        iy.appv[90] = -1644270722;
        iy.appv[91] = -496289714;
        iy.appv[92] = -91663809;
        iy.appv[93] = -1748843974;
        iy.appv[94] = 1049167706;
        iy.appv[95] = 1567309759;
        iy.appv[96] = 1044902372;
        iy.appv[97] = -1658805025;
        iy.appv[98] = -1413816598;
        iy.appv[99] = 1487009120;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$cleanup$1(class_243 var1_1, int var2_2, int var3_3, Map.Entry var4_4) {
        v0 /* !! */  = iy.ci;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(v1 - iy.appw("arav", apqu(int ), (int)256));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1671183739: {
                    break block42;
                }
                case -1439847331: {
                    v1 = iy.appw("araw", apqu(int ), (int)257);
                    continue block42;
                }
                case 300982979: {
                    v1 = iy.appw("arax", apqu(int ), (int)258);
                    continue block42;
                }
                case 1137907596: {
                    v1 = iy.appw("aray", apqu(int ), (int)259);
                    continue block42;
                }
            }
            break;
        }
        var9_5 = iy.c;
        v2 /* !! */  = iy.ci;
        if (true) ** GOTO lbl22
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - iy.appw("araz", apqu(int ), (int)260));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1671183739: {
                    break block43;
                }
                case -1311198684: {
                    v3 = iy.appw("arba", apqu(int ), (int)261);
                    continue block43;
                }
                case 1749832706: {
                    v3 = iy.appw("arbb", apqu(int ), (int)262);
                    continue block43;
                }
                case 1771227624: {
                    v3 = iy.appw("arbc", apqu(int ), (int)263);
                    continue block43;
                }
            }
            break;
        }
        var8_6 /* !! */  = iy.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("arbd", apqu(int ), (int)264)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == iy.appw("arbe", apqa(int ), (int)699)) break;
            v4 /* !! */  = (long)iy.appw("arbf", apqa(int ), (int)700);
        }
        var7_7 = iy.a;
        if (var8_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_5) {
                    throw null;
lbl46:
                    // 9 sources

                    return (boolean)iy.appw("arbg", apqa(int ), (int)701);
                }
                if (var7_7 || var7_7) ** GOTO lbl46
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("arbh", apqu(int ), (int)265)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == iy.appw("arbi", apqa(int ), (int)702)) break;
                    v5 /* !! */  = (long)iy.appw("arbj", apqa(int ), (int)703);
                }
                var5_8 = (class_2338)var4_4.getKey();
                if (var7_7 || var7_7) ** GOTO lbl46
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("arbk", apqu(int ), (int)266)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == iy.appw("arbl", apqa(int ), (int)704)) break;
                    v6 /* !! */  = (long)iy.appw("arbm", apqa(int ), (int)705);
                }
                if (var5_8.method_19770((class_2374)var1_1) > (double)var2_2) ** GOTO lbl89
                if (var7_7) ** GOTO lbl46
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("arbn", apqu(int ), (int)267)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == iy.appw("arbo", apqa(int ), (int)706)) break;
                    v7 /* !! */  = (long)iy.appw("arbp", apqa(int ), (int)707);
                }
                v8 /* !! */  = iy.ci;
                if (true) ** GOTO lbl72
                block49: while (true) {
                    v8 /* !! */  = (long)(v9 - iy.appw("arbq", apqu(int ), (int)268));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1671183739: {
                            break block49;
                        }
                        case -558884806: {
                            v9 = iy.appw("arbr", apqu(int ), (int)269);
                            continue block49;
                        }
                        case 187424289: {
                            v9 = iy.appw("arbs", apqu(int ), (int)270);
                            continue block49;
                        }
                    }
                    break;
                }
                v10 = iy.mc.field_1687;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("arbt", apqu(int ), (int)271)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == iy.appw("arbu", apqa(int ), (int)708)) break;
                    v11 /* !! */  = (long)iy.appw("arbv", apqa(int ), (int)709);
                }
                if (v10.method_22340(var5_8)) ** GOTO lbl91
                if (var7_7) ** GOTO lbl46
lbl89:
                // 2 sources

                if (var7_7 || var7_7) ** GOTO lbl46
                return (boolean)iy.appw("arbw", apqa(int ), (int)710);
lbl91:
                // 1 sources

                if (var7_7 || var7_7) ** GOTO lbl46
                v12 /* !! */  = iy.ci;
                if (true) ** GOTO lbl96
                block51: while (true) {
                    v12 /* !! */  = (long)(v13 - iy.appw("arbx", apqu(int ), (int)272));
lbl96:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1671183739: {
                            break block51;
                        }
                        case -1476918405: {
                            v13 = iy.appw("arby", apqu(int ), (int)273);
                            continue block51;
                        }
                        case 108901282: {
                            v13 = iy.appw("arbz", apqu(int ), (int)274);
                            continue block51;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = iy.ci - iy.appw("arca", apqu(int ), (int)275)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == iy.appw("arcb", apqa(int ), (int)711)) break;
                    v14 /* !! */  = (long)iy.appw("arcc", apqa(int ), (int)712);
                }
                v15 = iy.mc.field_1687;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = iy.ci - iy.appw("arcd", apqu(int ), (int)276)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == iy.appw("arce", apqa(int ), (int)713)) break;
                    v16 /* !! */  = (long)iy.appw("arcf", apqa(int ), (int)714);
                }
                v17 = v15.method_8320(var5_8);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = iy.ci - iy.appw("arcg", apqu(int ), (int)277)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == iy.appw("arch", apqa(int ), (int)715)) break;
                    v18 /* !! */  = (long)iy.appw("arci", apqa(int ), (int)716);
                }
                var6_9 = this.storageType(v17, var3_3);
                if (var7_7 || var7_7) ** GOTO lbl46
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_8 = iy.ci - iy.appw("arcj", apqu(int ), (int)278)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == iy.appw("arck", apqa(int ), (int)717)) break;
                    v19 /* !! */  = (long)iy.appw("arcl", apqa(int ), (int)718);
                }
                if (var6_9 == var4_4.getValue()) ** GOTO lbl135
                if (var7_7) ** GOTO lbl46
                v20 = iy.appw("arcm", apqa(int ), (int)719);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl138
lbl135:
                // 1 sources

                if (!var7_7 && !var7_7) ** break;
                ** continue;
                v20 = iy.appw("arcn", apqa(int ), (int)720);
lbl138:
                // 2 sources

                return (boolean)v20;
            }
lbl139:
            // 4 sources

            case 0: {
                var8_6 /* !! */  = (int)iy.appw("arco", apqa(int ), (int)721);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl144:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_6 /* !! */  = (int)iy.appw("arcp", apqa(int ), (int)722);
                    if (var9_5) {
                        throw null;
                    }
                    ** GOTO lbl209
                    break;
                }
            }
lbl150:
            // 2 sources

            case 2: {
                var8_6 /* !! */  = (int)iy.appw("arcq", apqa(int ), (int)723);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl155:
            // 3 sources

            case 3: {
                var8_6 /* !! */  = (int)iy.appw("arcr", apqa(int ), (int)724);
                if (!var9_5) ** GOTO lbl139
                throw null;
            }
            case 4: {
                do {
                    var8_6 /* !! */  = (int)iy.appw("arcs", apqa(int ), (int)725);
                } while (!var9_5);
                throw null;
            }
            case 5: {
                var8_6 /* !! */  = (int)iy.appw("arct", apqa(int ), (int)726);
                if (!var9_5) ** GOTO lbl155
                throw null;
            }
            case 6: {
                var8_6 /* !! */  = (int)iy.appw("arcu", apqa(int ), (int)727);
                if (!var9_5) ** GOTO lbl144
                throw null;
            }
lbl172:
            // 2 sources

            case 7: {
                var8_6 /* !! */  = (int)iy.appw("arcv", apqa(int ), (int)728);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 8: {
                var8_6 /* !! */  = (int)iy.appw("arcw", apqa(int ), (int)729);
                if (!var9_5) ** GOTO lbl150
                throw null;
            }
lbl181:
            // 2 sources

            case 9: {
                var8_6 /* !! */  = (int)iy.appw("arcx", apqa(int ), (int)730);
                if (!var9_5) ** GOTO lbl139
                throw null;
            }
            case 10: {
                var8_6 /* !! */  = (int)iy.appw("arcy", apqa(int ), (int)731);
                if (!var9_5) ** GOTO lbl172
                throw null;
            }
lbl189:
            // 2 sources

            case 11: {
                var8_6 /* !! */  = (int)iy.appw("arcz", apqa(int ), (int)732);
                if (!var9_5) ** GOTO lbl139
                throw null;
            }
lbl193:
            // 2 sources

            case 12: {
                var8_6 /* !! */  = (int)iy.appw("arda", apqa(int ), (int)733);
                if (var9_5) {
                    throw null;
                }
            }
lbl197:
            // 4 sources

            case 13: {
                var8_6 /* !! */  = (int)iy.appw("ardb", apqa(int ), (int)734);
                if (!var9_5) ** GOTO lbl189
                throw null;
            }
lbl201:
            // 2 sources

            case 14: {
                var8_6 /* !! */  = (int)iy.appw("ardc", apqa(int ), (int)735);
                if (!var9_5) ** GOTO lbl155
                throw null;
            }
lbl205:
            // 2 sources

            case 15: {
                var8_6 /* !! */  = (int)iy.appw("ardd", apqa(int ), (int)736);
                if (!var9_5) ** GOTO lbl181
                throw null;
            }
lbl209:
            // 2 sources

            case 16: {
                var8_6 /* !! */  = (int)iy.appw("arde", apqa(int ), (int)737);
                if (!var9_5) ** GOTO lbl197
                throw null;
            }
            case 17: 
        }
        var8_6 /* !! */  = (int)iy.appw("ardf", apqa(int ), (int)738);
        ** while (!var9_5)
lbl216:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanup(class_243 var1_1, int var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("aqgy", apqu(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == iy.appw("aqgz", apqa(int ), (int)351)) break;
            v0 /* !! */  = (long)iy.appw("aqha", apqa(int ), (int)352);
        }
        var7_4 = iy.c;
        v1 /* !! */  = iy.ci;
        if (true) ** GOTO lbl11
        block41: while (true) {
            v1 /* !! */  = (long)(v2 - iy.appw("aqhb", apqu(int ), (int)89));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1671183739: {
                    break block41;
                }
                case -594728180: {
                    v2 = iy.appw("aqhc", apqu(int ), (int)90);
                    continue block41;
                }
                case 605347564: {
                    v2 = iy.appw("aqhd", apqu(int ), (int)91);
                    continue block41;
                }
            }
            break;
        }
        var6_5 /* !! */  = iy.b;
        v3 /* !! */  = iy.ci;
        if (true) ** GOTO lbl25
        block42: while (true) {
            v3 /* !! */  = (long)(v4 - iy.appw("aqhe", apqu(int ), (int)92));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1912487041: {
                    v4 = iy.appw("aqhf", apqu(int ), (int)93);
                    continue block42;
                }
                case -1671183739: {
                    break block42;
                }
                case 1918293456: {
                    v4 = iy.appw("aqhg", apqu(int ), (int)94);
                    continue block42;
                }
            }
            break;
        }
        var5_6 = iy.a;
        if (var7_4) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var5_6 || var5_6) ** GOTO lbl37
        var4_7 = var2_2 * var2_2;
        if (var5_6 || var5_6) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aqhh", apqu(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == iy.appw("aqhi", apqa(int ), (int)353)) break;
            v5 /* !! */  = (long)iy.appw("aqhj", apqa(int ), (int)354);
        }
        v6 /* !! */  = iy.ci;
        if (true) ** GOTO lbl51
        block45: while (true) {
            v6 /* !! */  = (long)(iy.appw("aqhl", apqu(int ), (int)97) - iy.appw("aqhk", apqu(int ), (int)96));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1671183739: {
                    break block45;
                }
                case -713043441: {
                    continue block45;
                }
            }
            break;
        }
        v7 = this.found.entrySet();
        v8 /* !! */  = iy.ci;
        if (true) ** GOTO lbl61
        block46: while (true) {
            v8 /* !! */  = (long)(iy.appw("aqhn", apqu(int ), (int)99) - iy.appw("aqhm", apqu(int ), (int)98));
lbl61:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1671183739: {
                    break block46;
                }
                case -255205058: {
                    continue block46;
                }
            }
            break;
        }
        v9 = (Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$cleanup$1(net.minecraft.class_243 int int java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)((iy)this, (class_243)var1_1, (int)var4_7, (int)var3_3);
        v10 /* !! */  = iy.ci;
        if (true) ** GOTO lbl71
        block47: while (true) {
            v10 /* !! */  = (long)(v11 - iy.appw("aqho", apqu(int ), (int)100));
lbl71:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1671183739: {
                    break block47;
                }
                case -1465994928: {
                    v11 = iy.appw("aqhp", apqu(int ), (int)101);
                    continue block47;
                }
                case -833085007: {
                    v11 = iy.appw("aqhq", apqu(int ), (int)102);
                    continue block47;
                }
            }
            break;
        }
        v7.removeIf(v9);
        if (var5_6) ** GOTO lbl37
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_6) ** GOTO lbl37
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqhr", apqu(int ), (int)103)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == iy.appw("aqhs", apqa(int ), (int)355)) break;
                    v12 /* !! */  = (long)iy.appw("aqht", apqa(int ), (int)356);
                }
                v13 /* !! */  = iy.ci;
                if (true) ** GOTO lbl96
                block49: while (true) {
                    v13 /* !! */  = (long)(v14 - iy.appw("aqhu", apqu(int ), (int)104));
lbl96:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1715066048: {
                            v14 = iy.appw("aqhv", apqu(int ), (int)105);
                            continue block49;
                        }
                        case -1671183739: {
                            break block49;
                        }
                        case 1594452836: {
                            v14 = iy.appw("aqhw", apqu(int ), (int)106);
                            continue block49;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqhx", apqu(int ), (int)107)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == iy.appw("aqhy", apqa(int ), (int)357)) break;
                    v15 /* !! */  = (long)iy.appw("aqhz", apqa(int ), (int)358);
                }
                v16 = this.found.keySet();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("aqia", apqu(int ), (int)108)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == iy.appw("aqib", apqa(int ), (int)359)) break;
                    v17 /* !! */  = (long)iy.appw("aqic", apqa(int ), (int)360);
                }
                this.announced.retainAll(v16);
                if (!var5_6 && !var5_6) ** break;
                ** continue;
                return;
            }
lbl120:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)iy.appw("aqid", apqa(int ), (int)361);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl125:
            // 2 sources

            case 1: {
                var6_5 /* !! */  = (int)iy.appw("aqie", apqa(int ), (int)362);
                if (!var7_4) ** GOTO lbl120
                throw null;
            }
            case 2: {
                var6_5 /* !! */  = (int)iy.appw("aqif", apqa(int ), (int)363);
                if (!var7_4) ** GOTO lbl120
                throw null;
            }
lbl133:
            // 3 sources

            case 3: {
                var6_5 /* !! */  = (int)iy.appw("aqig", apqa(int ), (int)364);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl138:
            // 2 sources

            case 4: {
                var6_5 /* !! */  = (int)iy.appw("aqih", apqa(int ), (int)365);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 5: {
                var6_5 /* !! */  = (int)iy.appw("aqii", apqa(int ), (int)366);
                if (!var7_4) ** GOTO lbl133
                throw null;
            }
lbl147:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)iy.appw("aqij", apqa(int ), (int)367);
                    if (!var7_4) ** GOTO lbl125
                    throw null;
                }
            }
lbl152:
            // 2 sources

            case 7: {
                var6_5 /* !! */  = (int)iy.appw("aqik", apqa(int ), (int)368);
                if (!var7_4) ** GOTO lbl133
                throw null;
            }
lbl156:
            // 2 sources

            case 8: {
                var6_5 /* !! */  = (int)iy.appw("aqil", apqa(int ), (int)369);
                if (!var7_4) ** GOTO lbl138
                throw null;
            }
            case 9: 
        }
        var6_5 /* !! */  = (int)iy.appw("aqim", apqa(int ), (int)370);
        ** while (!var7_4)
lbl163:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long apqu(int n2) {
        return apqv[n2] ^ apqw[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private long chunkDistanceSq(class_1923 var1_1, int var2_2, int var3_3) {
        block42: {
            v0 /* !! */  = iy.ci;
            block20: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1671183739: {
                        break block20;
                    }
                    case -1028924985: {
                        v0 /* !! */  = (long)(iy.appw("aqwf", apqu(int ), (int)201) - iy.appw("aqwe", apqu(int ), (int)200));
                        continue block20;
                    }
                }
                break;
            }
            var10_4 = iy.c;
            while (true) {
                block43: {
                    if ((v1 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aqwg", apqu(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != iy.appw("aqwh", apqa(int ), (int)634)) break block43;
                    var9_5 /* !! */  = iy.b;
                    v2 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl22
                }
                v1 /* !! */  = (long)iy.appw("aqwi", apqa(int ), (int)635);
            }
            block22: while (true) {
                v2 /* !! */  = (long)(v3 - iy.appw("aqwj", apqu(int ), (int)203));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2090936397: {
                        v3 = iy.appw("aqwk", apqu(int ), (int)204);
                        continue block22;
                    }
                    case -1772056665: {
                        v3 = iy.appw("aqwl", apqu(int ), (int)205);
                        continue block22;
                    }
                    case -1671183739: {
                        break block22;
                    }
                    case 1396176073: {
                        v3 = iy.appw("aqwm", apqu(int ), (int)206);
                        continue block22;
                    }
                }
                break;
            }
            var8_6 = iy.a;
            if (var10_4) {
                throw null;
            }
            if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block23: do {
                switch (cfr_temp_0 == -2147483648 ? var9_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var8_6 || var8_6) return (long)iy.appw("aqwn", apqu(int ), (int)207);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqwo", apqu(int ), (int)208)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == iy.appw("aqwp", apqa(int ), (int)636)) {
                                var4_7 = var1_1.field_9181 - var2_2;
                                if (var8_6) return (long)iy.appw("aqwn", apqu(int ), (int)207);
                                break;
                            }
                            v4 /* !! */  = (long)iy.appw("aqwq", apqa(int ), (int)637);
                        }
                        if (var8_6) return (long)iy.appw("aqwn", apqu(int ), (int)207);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqwr", apqu(int ), (int)209)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  == iy.appw("aqws", apqa(int ), (int)638)) {
                                var6_8 = var1_1.field_9180 - var3_3;
                                if (var8_6) return (long)iy.appw("aqwn", apqu(int ), (int)207);
                                break;
                            }
                            v5 /* !! */  = (long)iy.appw("aqwt", apqa(int ), (int)639);
                        }
                        if (!var8_6) return var4_7 * var4_7 + var6_8 * var6_8;
                        return (long)iy.appw("aqwn", apqu(int ), (int)207);
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        var9_5 /* !! */  = (int)iy.appw("aqwx", apqa(int ), (int)643);
                        cfr_temp_0 = 5;
                        if (!var10_4) continue block23;
                        throw null;
                    }
                    case 7: {
                        break block42;
                    }
lbl73:
                    // 2 sources

                    while (true) {
                        var9_5 /* !! */  = (int)iy.appw("aqwu", apqa(int ), (int)640);
                        cfr_temp_0 = 4;
                        if (!var10_4) continue block23;
                        throw null;
                    }
                    case 4: {
                        var9_5 /* !! */  = (int)iy.appw("aqwy", apqa(int ), (int)644);
                        if (var10_4) {
                            throw null;
                        }
                    }
                    case 6: {
                        var9_5 /* !! */  = (int)iy.appw("aqxa", apqa(int ), (int)646);
                        if (var10_4) {
                            throw null;
                        }
                    }
                    case 1: {
                        var9_5 /* !! */  = (int)iy.appw("aqwv", apqa(int ), (int)641);
                        if (var10_4) {
                            throw null;
                        }
                    }
                    case 2: {
                        var9_5 /* !! */  = (int)iy.appw("aqww", apqa(int ), (int)642);
                        if (var10_4) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                break;
            } while (true);
            var9_5 /* !! */  = (int)iy.appw("aqwz", apqa(int ), (int)645);
            if (!var10_4) ** break;
            throw null;
        }
        var9_5 /* !! */  = (int)iy.appw("aqxb", apqa(int ), (int)647);
        ** while (!var10_4)
lbl103:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private iy$StorageType storageType(class_2680 var1_1, int var2_2) {
        block109: {
            block108: {
                v0 /* !! */  = iy.ci;
                if (true) ** GOTO lbl5
                block66: while (true) {
                    v0 /* !! */  = (long)(v1 - iy.appw("aqpg", apqu(int ), (int)127));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1671183739: {
                            break block66;
                        }
                        case -66871629: {
                            v1 = iy.appw("aqph", apqu(int ), (int)128);
                            continue block66;
                        }
                        case 496196045: {
                            v1 = iy.appw("aqpi", apqu(int ), (int)129);
                            continue block66;
                        }
                        case 1396235114: {
                            v1 = iy.appw("aqpj", apqu(int ), (int)130);
                            continue block66;
                        }
                    }
                    break;
                }
                var5_3 = iy.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("aqpk", apqu(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == iy.appw("aqpl", apqa(int ), (int)527)) break;
                    v2 /* !! */  = (long)iy.appw("aqpm", apqa(int ), (int)528);
                }
                var4_4 /* !! */  = iy.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aqpn", apqu(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == iy.appw("aqpo", apqa(int ), (int)529)) break;
                    v3 /* !! */  = (long)iy.appw("aqpp", apqa(int ), (int)530);
                }
                var3_5 = iy.a;
                if (var5_3) {
                    throw null;
lbl34:
                    // 13 sources

                    return null;
                }
                if (var3_5 || var3_5) ** GOTO lbl34
                if ((var2_2 & iy.appw("aqpq", apqa(int ), (int)531)) == 0) break block108;
                if (var3_5) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqpr", apqu(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == iy.appw("aqps", apqa(int ), (int)532)) break;
                    v4 /* !! */  = (long)iy.appw("aqpt", apqa(int ), (int)533);
                }
                if (!(var1_1.method_26204() instanceof class_2480)) break block108;
                if (var3_5) ** GOTO lbl34
                v5 /* !! */  = iy.ci;
                if (true) ** GOTO lbl51
                block71: while (true) {
                    v5 /* !! */  = (long)(iy.appw("aqpv", apqu(int ), (int)135) - iy.appw("aqpu", apqu(int ), (int)134));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1671183739: {
                            break block71;
                        }
                        case 1702162223: {
                            continue block71;
                        }
                    }
                    break;
                }
                return iy$StorageType.SHULKER;
            }
            if (var3_5 || var3_5) ** GOTO lbl34
            if ((var2_2 & iy.appw("aqpw", apqa(int ), (int)534)) == 0) break block109;
            if (var3_5) ** GOTO lbl34
            v6 /* !! */  = iy.ci;
            if (true) ** GOTO lbl65
            block72: while (true) {
                v6 /* !! */  = (long)(v7 - iy.appw("aqpx", apqu(int ), (int)136));
lbl65:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1867681017: {
                        v7 = iy.appw("aqpy", apqu(int ), (int)137);
                        continue block72;
                    }
                    case -1671183739: {
                        break block72;
                    }
                    case 49527072: {
                        v7 = iy.appw("aqpz", apqu(int ), (int)138);
                        continue block72;
                    }
                    case 85897238: {
                        v7 = iy.appw("aqqa", apqu(int ), (int)139);
                        continue block72;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqqb", apqu(int ), (int)140)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == iy.appw("aqqc", apqa(int ), (int)535)) break;
                v8 /* !! */  = (long)iy.appw("aqqd", apqa(int ), (int)536);
            }
            if (!var1_1.method_27852(class_2246.field_10333)) break block109;
            if (var3_5) ** GOTO lbl34
            v9 /* !! */  = iy.ci;
            if (true) ** GOTO lbl89
            block74: while (true) {
                v9 /* !! */  = (long)(v10 - iy.appw("aqqe", apqu(int ), (int)141));
lbl89:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1671183739: {
                        break block74;
                    }
                    case 1589686128: {
                        v10 = iy.appw("aqqf", apqu(int ), (int)142);
                        continue block74;
                    }
                    case 1751180189: {
                        v10 = iy.appw("aqqg", apqu(int ), (int)143);
                        continue block74;
                    }
                    case 2132484963: {
                        v10 = iy.appw("aqqh", apqu(int ), (int)144);
                        continue block74;
                    }
                }
                break;
            }
            return iy$StorageType.BREWING_STAND;
        }
        if (var3_5 || var3_5) ** GOTO lbl34
        if ((var2_2 & iy.appw("aqqi", apqa(int ), (int)537)) == 0) ** GOTO lbl186
        if (var3_5) ** GOTO lbl34
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("aqqj", apqu(int ), (int)145)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == iy.appw("aqqk", apqa(int ), (int)538)) break;
            v11 /* !! */  = (long)iy.appw("aqql", apqa(int ), (int)539);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = iy.ci - iy.appw("aqqm", apqu(int ), (int)146)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == iy.appw("aqqn", apqa(int ), (int)540)) break;
            v12 /* !! */  = (long)iy.appw("aqqo", apqa(int ), (int)541);
        }
        if (var1_1.method_27852(class_2246.field_10034)) ** GOTO lbl178
        if (var3_5) ** GOTO lbl34
        v13 /* !! */  = iy.ci;
        if (true) ** GOTO lbl124
        block77: while (true) {
            v13 /* !! */  = (long)(iy.appw("aqqq", apqu(int ), (int)148) - iy.appw("aqqp", apqu(int ), (int)147));
lbl124:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1671183739: {
                    break block77;
                }
                case 1524239768: {
                    continue block77;
                }
            }
            break;
        }
        v14 /* !! */  = iy.ci;
        if (true) ** GOTO lbl133
        block78: while (true) {
            v14 /* !! */  = (long)(v15 - iy.appw("aqqr", apqu(int ), (int)149));
lbl133:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1671183739: {
                    break block78;
                }
                case -1497413849: {
                    v15 = iy.appw("aqqs", apqu(int ), (int)150);
                    continue block78;
                }
                case -1385980114: {
                    v15 = iy.appw("aqqt", apqu(int ), (int)151);
                    continue block78;
                }
                case 929074691: {
                    v15 = iy.appw("aqqu", apqu(int ), (int)152);
                    continue block78;
                }
            }
            break;
        }
        if (var1_1.method_27852(class_2246.field_10380)) ** GOTO lbl178
        if (var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v16 /* !! */  = iy.ci;
                if (true) ** GOTO lbl154
                block79: while (true) {
                    v16 /* !! */  = (long)(v17 - iy.appw("aqqv", apqu(int ), (int)153));
lbl154:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1671183739: {
                            break block79;
                        }
                        case 432703464: {
                            v17 = iy.appw("aqqw", apqu(int ), (int)154);
                            continue block79;
                        }
                        case 1884501053: {
                            v17 = iy.appw("aqqx", apqu(int ), (int)155);
                            continue block79;
                        }
                    }
                    break;
                }
                v18 /* !! */  = iy.ci;
                if (true) ** GOTO lbl167
                block80: while (true) {
                    v18 /* !! */  = (long)(v19 - iy.appw("aqqy", apqu(int ), (int)156));
lbl167:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1671183739: {
                            break block80;
                        }
                        case 893767340: {
                            v19 = iy.appw("aqqz", apqu(int ), (int)157);
                            continue block80;
                        }
                        case 1109184591: {
                            v19 = iy.appw("aqra", apqu(int ), (int)158);
                            continue block80;
                        }
                    }
                    break;
                }
                if (!var1_1.method_27852(class_2246.field_10443)) ** GOTO lbl186
                if (var3_5) ** GOTO lbl34
lbl178:
                // 3 sources

                if (var3_5 || var3_5) ** GOTO lbl34
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = iy.ci - iy.appw("aqrb", apqu(int ), (int)159)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == iy.appw("aqrc", apqa(int ), (int)542)) break;
                    v20 /* !! */  = (long)iy.appw("aqrd", apqa(int ), (int)543);
                }
                return iy$StorageType.CHEST;
lbl186:
                // 2 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return null;
            }
            case 0: {
                var4_4 /* !! */  = (int)iy.appw("aqre", apqa(int ), (int)544);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)iy.appw("aqrf", apqa(int ), (int)545);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl251
                    break;
                }
            }
lbl200:
            // 3 sources

            case 2: {
                var4_4 /* !! */  = (int)iy.appw("aqrg", apqa(int ), (int)546);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 3: {
                var4_4 /* !! */  = (int)iy.appw("aqrh", apqa(int ), (int)547);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 4: {
                var4_4 /* !! */  = (int)iy.appw("aqri", apqa(int ), (int)548);
                if (!var5_3) ** GOTO lbl200
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)iy.appw("aqrj", apqa(int ), (int)549);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl219:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)iy.appw("aqrk", apqa(int ), (int)550);
                if (!var5_3) break;
                throw null;
            }
lbl223:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)iy.appw("aqrl", apqa(int ), (int)551);
                if (!var5_3) ** GOTO lbl219
                throw null;
            }
lbl227:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)iy.appw("aqrm", apqa(int ), (int)552);
                if (!var5_3) ** GOTO lbl223
                throw null;
            }
lbl231:
            // 2 sources

            case 9: {
                do {
                    var4_4 /* !! */  = (int)iy.appw("aqrn", apqa(int ), (int)553);
                } while (!var5_3);
                throw null;
            }
            case 10: {
                var4_4 /* !! */  = (int)iy.appw("aqro", apqa(int ), (int)554);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl241:
            // 2 sources

            case 11: {
                var4_4 /* !! */  = (int)iy.appw("aqrp", apqa(int ), (int)555);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 12: {
                var4_4 /* !! */  = (int)iy.appw("aqrq", apqa(int ), (int)556);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl251:
            // 3 sources

            case 13: {
                var4_4 /* !! */  = (int)iy.appw("aqrr", apqa(int ), (int)557);
                if (!var5_3) break;
                throw null;
            }
lbl255:
            // 2 sources

            case 14: {
                var4_4 /* !! */  = (int)iy.appw("aqrs", apqa(int ), (int)558);
                if (var5_3) {
                    throw null;
                }
            }
lbl259:
            // 4 sources

            case 15: {
                var4_4 /* !! */  = (int)iy.appw("aqrt", apqa(int ), (int)559);
                if (var5_3) {
                    throw null;
                }
            }
            case 16: {
                do {
                    var4_4 /* !! */  = (int)iy.appw("aqru", apqa(int ), (int)560);
                } while (!var5_3);
                throw null;
            }
            case 17: {
                var4_4 /* !! */  = (int)iy.appw("aqrv", apqa(int ), (int)561);
                if (!var5_3) break;
                throw null;
            }
lbl272:
            // 3 sources

            case 18: {
                var4_4 /* !! */  = (int)iy.appw("aqrw", apqa(int ), (int)562);
                if (!var5_3) ** GOTO lbl200
                throw null;
            }
            case 19: {
                var4_4 /* !! */  = (int)iy.appw("aqrx", apqa(int ), (int)563);
                if (!var5_3) ** GOTO lbl259
                throw null;
            }
lbl280:
            // 2 sources

            case 20: {
                var4_4 /* !! */  = (int)iy.appw("aqry", apqa(int ), (int)564);
                if (!var5_3) ** GOTO lbl227
                throw null;
            }
            case 21: 
        }
        var4_4 /* !! */  = (int)iy.appw("aqrz", apqa(int ), (int)565);
        ** while (!var5_3)
lbl287:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void areo() {
        iy.apqv[100] = 9099577137379290598L;
        iy.apqv[101] = -4317317030586150440L;
        iy.apqv[102] = -1353646871101120490L;
        iy.apqv[103] = -4315387315940249850L;
        iy.apqv[104] = 7697540087287134341L;
        iy.apqv[105] = 8805600922782412316L;
        iy.apqv[106] = -6995633002015323699L;
        iy.apqv[107] = 1155144727380399215L;
        iy.apqv[108] = -6702123918427455055L;
        iy.apqv[109] = -7414564582626467556L;
        iy.apqv[110] = -1408679217097541244L;
        iy.apqv[111] = 1006970551465526045L;
        iy.apqv[112] = 6555747722559373818L;
        iy.apqv[113] = 7773263126424525944L;
        iy.apqv[114] = -1122242111862095599L;
        iy.apqv[115] = 4745549102184402748L;
        iy.apqv[116] = -4354941430525641043L;
        iy.apqv[117] = -4251231370660866254L;
        iy.apqv[118] = -732639147985518652L;
        iy.apqv[119] = -123977496999292893L;
        iy.apqv[120] = 7498744371409546153L;
        iy.apqv[121] = -7288215948859548996L;
        iy.apqv[122] = -7581026012697286647L;
        iy.apqv[123] = 1111603218426360568L;
        iy.apqv[124] = 8453390481602166091L;
        iy.apqv[125] = 9134039850207983632L;
        iy.apqv[126] = 6237961521320682107L;
        iy.apqv[127] = 796803128723073327L;
        iy.apqv[128] = -7863446009834879540L;
        iy.apqv[129] = 5716973521123822084L;
        iy.apqv[130] = 6271211312333809518L;
        iy.apqv[131] = 4038832754006484982L;
        iy.apqv[132] = 4459384368020636367L;
        iy.apqv[133] = -750108376736700252L;
        iy.apqv[134] = 2424022541690569371L;
        iy.apqv[135] = -2119959045032669128L;
        iy.apqv[136] = -2067181934970918432L;
        iy.apqv[137] = 6772546629068219231L;
        iy.apqv[138] = -7974814363471899523L;
        iy.apqv[139] = 7408147603015525173L;
        iy.apqv[140] = -1551025757293982907L;
        iy.apqv[141] = 6094638780281091438L;
        iy.apqv[142] = -9081821316382505594L;
        iy.apqv[143] = 6864222085284324731L;
        iy.apqv[144] = 3597477009172032452L;
        iy.apqv[145] = 8129118906128271605L;
        iy.apqv[146] = -6886313674562369163L;
        iy.apqv[147] = -7712063919077602844L;
        iy.apqv[148] = -8773770765134440107L;
        iy.apqv[149] = 7703267888031257876L;
        iy.apqv[150] = -8115658385932124952L;
        iy.apqv[151] = 9183885119662432510L;
        iy.apqv[152] = -2615969298052313392L;
        iy.apqv[153] = -5955053235291281799L;
        iy.apqv[154] = -7922213413877150190L;
        iy.apqv[155] = 6997564277315150645L;
        iy.apqv[156] = -777955348431479482L;
        iy.apqv[157] = 8477657355804668673L;
        iy.apqv[158] = -4818832306996641890L;
        iy.apqv[159] = 7905309369768209863L;
        iy.apqv[160] = -6783583214647968125L;
        iy.apqv[161] = 1112546061967141308L;
        iy.apqv[162] = -6747888785880608543L;
        iy.apqv[163] = 2979329871101137940L;
        iy.apqv[164] = 2957998830578253258L;
        iy.apqv[165] = 420418548196552291L;
        iy.apqv[166] = -8314991158925107115L;
        iy.apqv[167] = 7929634169667396808L;
        iy.apqv[168] = 6625023658248401336L;
        iy.apqv[169] = 99254475294402025L;
        iy.apqv[170] = 7475531270609670030L;
        iy.apqv[171] = -3464328738105472922L;
        iy.apqv[172] = 2006447673527351623L;
        iy.apqv[173] = -1254623680970042192L;
        iy.apqv[174] = -5817640513046337431L;
        iy.apqv[175] = 4360609197579905113L;
        iy.apqv[176] = 3997629277015114896L;
        iy.apqv[177] = -5265051325335085963L;
        iy.apqv[178] = -7263026648142279274L;
        iy.apqv[179] = 7764633985007590328L;
        iy.apqv[180] = -1575791096795195385L;
        iy.apqv[181] = 464200457313330222L;
        iy.apqv[182] = 3750177185731007897L;
        iy.apqv[183] = 170569412288410121L;
        iy.apqv[184] = 508248379758825640L;
        iy.apqv[185] = 574142827938735061L;
        iy.apqv[186] = 3108241566180516100L;
        iy.apqv[187] = 2818812477845665486L;
        iy.apqv[188] = 3076005341466790679L;
        iy.apqv[189] = -6966126908517725365L;
        iy.apqv[190] = 4710374281924573469L;
        iy.apqv[191] = -1783305772958353376L;
        iy.apqv[192] = 3091677823911504307L;
        iy.apqv[193] = -172441770968822841L;
        iy.apqv[194] = -5323579561006187666L;
        iy.apqv[195] = 4854716054534367201L;
        iy.apqv[196] = 1555994531783732437L;
        iy.apqv[197] = -5519261315503618789L;
        iy.apqv[198] = -6242209440532526793L;
        iy.apqv[199] = -1540585721439984118L;
    }

    private static /* synthetic */ void areq() {
        iy.apqw[0] = -8991190861726520314L;
        iy.apqw[1] = 9065475924773008206L;
        iy.apqw[2] = -9212001292571672637L;
        iy.apqw[3] = 5098357062727654247L;
        iy.apqw[4] = -3594582828376723652L;
        iy.apqw[5] = -7445797964071678358L;
        iy.apqw[6] = 7579059599294322112L;
        iy.apqw[7] = -8376500852261368489L;
        iy.apqw[8] = -7359264397837390920L;
        iy.apqw[9] = 4712778930244849153L;
        iy.apqw[10] = 1555418000821949485L;
        iy.apqw[11] = 1612845384353632295L;
        iy.apqw[12] = -8545308379073691541L;
        iy.apqw[13] = 4013227971558836576L;
        iy.apqw[14] = 3810295639150336665L;
        iy.apqw[15] = 400931934688861529L;
        iy.apqw[16] = 7909685156282121877L;
        iy.apqw[17] = 1389308585527254436L;
        iy.apqw[18] = -2947276969417564306L;
        iy.apqw[19] = 6779352054407707254L;
        iy.apqw[20] = -5684909393832112985L;
        iy.apqw[21] = 2977487431849570597L;
        iy.apqw[22] = -4292020767480395155L;
        iy.apqw[23] = -4503322572359461276L;
        iy.apqw[24] = 3684289940627708225L;
        iy.apqw[25] = 7787993803566022030L;
        iy.apqw[26] = 6973287671038742500L;
        iy.apqw[27] = -7227249616137478902L;
        iy.apqw[28] = 9073055925751540633L;
        iy.apqw[29] = 8897794497869362899L;
        iy.apqw[30] = 6831987074329865339L;
        iy.apqw[31] = -2361068226099060539L;
        iy.apqw[32] = -3613228545724702713L;
        iy.apqw[33] = 6310280016973673142L;
        iy.apqw[34] = 5197111077660510648L;
        iy.apqw[35] = -8073102551934983469L;
        iy.apqw[36] = -1373233678426455824L;
        iy.apqw[37] = -4174773957485362619L;
        iy.apqw[38] = -4839173433888484015L;
        iy.apqw[39] = 7161187050649532113L;
        iy.apqw[40] = -832813003164029309L;
        iy.apqw[41] = 3009953161272162409L;
        iy.apqw[42] = -3385656460042325868L;
        iy.apqw[43] = 4358510085874920293L;
        iy.apqw[44] = 5462732033904479192L;
        iy.apqw[45] = 3581486101177312400L;
        iy.apqw[46] = -3320520332933325147L;
        iy.apqw[47] = 5204827717530341484L;
        iy.apqw[48] = 3230084363616617827L;
        iy.apqw[49] = 148525716248721294L;
        iy.apqw[50] = -1180712374229366890L;
        iy.apqw[51] = 533946606818205512L;
        iy.apqw[52] = -4606822329078946676L;
        iy.apqw[53] = 584379758182289348L;
        iy.apqw[54] = 3886479132671340041L;
        iy.apqw[55] = -3583902777972470345L;
        iy.apqw[56] = -7016892737217555192L;
        iy.apqw[57] = 3383586328397408318L;
        iy.apqw[58] = 2137364604593008675L;
        iy.apqw[59] = 3106184503074667880L;
        iy.apqw[60] = 1287782197478479993L;
        iy.apqw[61] = -5049722785999384020L;
        iy.apqw[62] = 7333170376265512295L;
        iy.apqw[63] = 429616108407570555L;
        iy.apqw[64] = 1219724936083319565L;
        iy.apqw[65] = -8107187815555147486L;
        iy.apqw[66] = 9017739610775223709L;
        iy.apqw[67] = 5555043853542443211L;
        iy.apqw[68] = -7237239381992573978L;
        iy.apqw[69] = 8338540544590227641L;
        iy.apqw[70] = -467779036792881964L;
        iy.apqw[71] = 420550287400192488L;
        iy.apqw[72] = -6298668660941894030L;
        iy.apqw[73] = 8582112193141798195L;
        iy.apqw[74] = 8188060739777657776L;
        iy.apqw[75] = -9190890694738367490L;
        iy.apqw[76] = 7515913152884292148L;
        iy.apqw[77] = 5611719258755176489L;
        iy.apqw[78] = 1314569577804078999L;
        iy.apqw[79] = -4626397363057989868L;
        iy.apqw[80] = 3286759558808469896L;
        iy.apqw[81] = -4436771363196614463L;
        iy.apqw[82] = 3763261573632031357L;
        iy.apqw[83] = 7227380774374103329L;
        iy.apqw[84] = 1445160865588342779L;
        iy.apqw[85] = -3025262880644699312L;
        iy.apqw[86] = -314026667675478898L;
        iy.apqw[87] = -7225607778015262704L;
        iy.apqw[88] = -8570529178916746442L;
        iy.apqw[89] = 3157331420538470400L;
        iy.apqw[90] = -1258817806332694703L;
        iy.apqw[91] = 4396270033754551599L;
        iy.apqw[92] = -8510108322807706017L;
        iy.apqw[93] = -1858615307250576023L;
        iy.apqw[94] = -35488670611984508L;
        iy.apqw[95] = 8539416105802792219L;
        iy.apqw[96] = 7391645229113328629L;
        iy.apqw[97] = -1744779560857795557L;
        iy.apqw[98] = -3644718557593392744L;
        iy.apqw[99] = -5135976465698215683L;
    }

    private static /* synthetic */ void ares() {
        iy.apqw[200] = -2796624758014775766L;
        iy.apqw[201] = -1956512512373386534L;
        iy.apqw[202] = -5935812337034942193L;
        iy.apqw[203] = 4134496790133160462L;
        iy.apqw[204] = 2836203046268762145L;
        iy.apqw[205] = 8225108281027512230L;
        iy.apqw[206] = 8722379406625589605L;
        iy.apqw[207] = -1673032927425645887L;
        iy.apqw[208] = -45892630193621594L;
        iy.apqw[209] = 7667074702344314645L;
        iy.apqw[210] = -3525869147596705296L;
        iy.apqw[211] = 5208897750230257859L;
        iy.apqw[212] = 8428219243640196540L;
        iy.apqw[213] = 3864343984540347497L;
        iy.apqw[214] = 2718676097083562930L;
        iy.apqw[215] = -4807833330623226573L;
        iy.apqw[216] = -1088996225073335126L;
        iy.apqw[217] = -8525041076391724932L;
        iy.apqw[218] = -316017609533344308L;
        iy.apqw[219] = 2254428462563854093L;
        iy.apqw[220] = -7281582471671220561L;
        iy.apqw[221] = -7448365814845781627L;
        iy.apqw[222] = -2513226171396622978L;
        iy.apqw[223] = -7669381111913338839L;
        iy.apqw[224] = 325101105564485447L;
        iy.apqw[225] = 7315714666934432759L;
        iy.apqw[226] = -4775319251261751182L;
        iy.apqw[227] = 6939313207765555043L;
        iy.apqw[228] = 6037037935955580455L;
        iy.apqw[229] = -3620617198605049212L;
        iy.apqw[230] = 7155450390754621057L;
        iy.apqw[231] = 962824876626443459L;
        iy.apqw[232] = -6681668469762346592L;
        iy.apqw[233] = 672525769076457641L;
        iy.apqw[234] = -9119678135823861219L;
        iy.apqw[235] = 7618165180462293162L;
        iy.apqw[236] = -2486282736611584161L;
        iy.apqw[237] = -1600373491277489327L;
        iy.apqw[238] = -4156867512579902160L;
        iy.apqw[239] = 5031205894517276500L;
        iy.apqw[240] = -7386055660703659339L;
        iy.apqw[241] = -7868673611595834249L;
        iy.apqw[242] = -3421650584887706689L;
        iy.apqw[243] = 609378752951759589L;
        iy.apqw[244] = 8409340252124436243L;
        iy.apqw[245] = -2789585835752065890L;
        iy.apqw[246] = 3287519743887492969L;
        iy.apqw[247] = 5193509405703556466L;
        iy.apqw[248] = 6103900548678234633L;
        iy.apqw[249] = -1783477104597333937L;
        iy.apqw[250] = 8533696593525876910L;
        iy.apqw[251] = 5664018699752686966L;
        iy.apqw[252] = -4751587556811164474L;
        iy.apqw[253] = 7475046791778362470L;
        iy.apqw[254] = 4554673776630803271L;
        iy.apqw[255] = 8543708063531868144L;
        iy.apqw[256] = -5173127420294137345L;
        iy.apqw[257] = -7989630221001621192L;
        iy.apqw[258] = -1451595534254091967L;
        iy.apqw[259] = -6496411828419640732L;
        iy.apqw[260] = 990116509729035248L;
        iy.apqw[261] = -6709088218608268804L;
        iy.apqw[262] = -4081509860800549665L;
        iy.apqw[263] = 6448175384571047390L;
        iy.apqw[264] = -313581697906592791L;
        iy.apqw[265] = 3201759329238244780L;
        iy.apqw[266] = -6664285831258447634L;
        iy.apqw[267] = -8868757911039046725L;
        iy.apqw[268] = -5472242308948935226L;
        iy.apqw[269] = -1568856542719949378L;
        iy.apqw[270] = -6949539961410100085L;
        iy.apqw[271] = 1546829776884072581L;
        iy.apqw[272] = 8580243130215238994L;
        iy.apqw[273] = 8443206718278662174L;
        iy.apqw[274] = 2978404510554965487L;
        iy.apqw[275] = -8571307844562378158L;
        iy.apqw[276] = 1736107124661487136L;
        iy.apqw[277] = -6884274321679859481L;
        iy.apqw[278] = 2824126794325675739L;
        iy.apqw[279] = 138459647615885239L;
        iy.apqw[280] = 3510641087279074031L;
        iy.apqw[281] = -2138570022108981040L;
        iy.apqw[282] = 2859021394831363216L;
        iy.apqw[283] = 4289756601412221467L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ long lambda$scanNearbyChunks$0(int var1_1, int var2_2, class_1923 var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("ardg", apqu(int ), (int)279)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iy.appw("ardh", apqa(int ), (int)739)) break;
            v0 /* !! */  = (long)iy.appw("ardi", apqa(int ), (int)740);
        }
        var6_4 = iy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("ardj", apqu(int ), (int)280)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iy.appw("ardk", apqa(int ), (int)741)) break;
            v1 /* !! */  = (long)iy.appw("ardl", apqa(int ), (int)742);
        }
        var5_5 /* !! */  = iy.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("ardm", apqu(int ), (int)281)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iy.appw("ardn", apqa(int ), (int)743)) break;
            v2 /* !! */  = (long)iy.appw("ardo", apqa(int ), (int)744);
        }
        var4_6 = iy.a;
        if (var6_4) {
            throw null;
lbl24:
            // 2 sources

            return (long)iy.appw("ardp", apqu(int ), (int)282);
        }
        if (var4_6) ** GOTO lbl24
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("ardq", apqu(int ), (int)283)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == iy.appw("ardr", apqa(int ), (int)745)) break;
                    v3 /* !! */  = (long)iy.appw("ards", apqa(int ), (int)746);
                }
                return this.chunkDistanceSq(var3_3, var1_1, var2_2);
            }
            case 0: {
                do {
                    var5_5 /* !! */  = (int)iy.appw("ardt", apqa(int ), (int)747);
                } while (!var6_4);
                throw null;
            }
            case 1: {
                var5_5 /* !! */  = (int)iy.appw("ardu", apqa(int ), (int)748);
                if (!var6_4) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_5 /* !! */  = (int)iy.appw("ardv", apqa(int ), (int)749);
                    if (!var6_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var5_5 /* !! */  = (int)iy.appw("ardw", apqa(int ), (int)750);
        ** while (!var6_4)
lbl55:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int apqa(int n2) {
        return appu[n2] ^ appv[n2];
    }

    private static /* synthetic */ void ardy() {
        iy.appu[100] = 1871025943;
        iy.appu[101] = 904327468;
        iy.appu[102] = 0x101E110;
        iy.appu[103] = 490461028;
        iy.appu[104] = 1566440526;
        iy.appu[105] = -1594110813;
        iy.appu[106] = -469823774;
        iy.appu[107] = -1372993836;
        iy.appu[108] = -536173563;
        iy.appu[109] = -1127595768;
        iy.appu[110] = 362225795;
        iy.appu[111] = 950279082;
        iy.appu[112] = 1051796840;
        iy.appu[113] = 1430637630;
        iy.appu[114] = 1309095433;
        iy.appu[115] = 481634246;
        iy.appu[116] = -97139962;
        iy.appu[117] = 794654657;
        iy.appu[118] = -357768764;
        iy.appu[119] = -605426023;
        iy.appu[120] = -1807498779;
        iy.appu[121] = -1876631089;
        iy.appu[122] = -548264139;
        iy.appu[123] = 955258320;
        iy.appu[124] = -1495256688;
        iy.appu[125] = 830199346;
        iy.appu[126] = 1354972509;
        iy.appu[127] = 164909044;
        iy.appu[128] = 1156784336;
        iy.appu[129] = 1466130019;
        iy.appu[130] = 1954359950;
        iy.appu[131] = -1878733903;
        iy.appu[132] = 578708508;
        iy.appu[133] = -2101777878;
        iy.appu[134] = 1453428540;
        iy.appu[135] = 963601057;
        iy.appu[136] = -621250720;
        iy.appu[137] = -301827183;
        iy.appu[138] = 491597204;
        iy.appu[139] = 625709446;
        iy.appu[140] = -122349790;
        iy.appu[141] = 427486774;
        iy.appu[142] = 1010044279;
        iy.appu[143] = -1852014537;
        iy.appu[144] = 950835860;
        iy.appu[145] = -1826633655;
        iy.appu[146] = -700497788;
        iy.appu[147] = -461925121;
        iy.appu[148] = 898511512;
        iy.appu[149] = 1744386118;
        iy.appu[150] = -1575637422;
        iy.appu[151] = -1981784439;
        iy.appu[152] = -350713273;
        iy.appu[153] = 871308469;
        iy.appu[154] = -80059130;
        iy.appu[155] = -1798121441;
        iy.appu[156] = -763921445;
        iy.appu[157] = 655507060;
        iy.appu[158] = 553672228;
        iy.appu[159] = 1948337230;
        iy.appu[160] = 421317145;
        iy.appu[161] = 147531175;
        iy.appu[162] = -667112069;
        iy.appu[163] = 442183158;
        iy.appu[164] = 1081415909;
        iy.appu[165] = -586570977;
        iy.appu[166] = -509769694;
        iy.appu[167] = 2001161012;
        iy.appu[168] = 1564053192;
        iy.appu[169] = 1402895537;
        iy.appu[170] = -1105352429;
        iy.appu[171] = -640530842;
        iy.appu[172] = -198057499;
        iy.appu[173] = 949672000;
        iy.appu[174] = -1569658273;
        iy.appu[175] = -823085057;
        iy.appu[176] = -817777299;
        iy.appu[177] = 1009209261;
        iy.appu[178] = -356505915;
        iy.appu[179] = -451753256;
        iy.appu[180] = 64455975;
        iy.appu[181] = 1123995326;
        iy.appu[182] = -690504454;
        iy.appu[183] = -1196663865;
        iy.appu[184] = 578982011;
        iy.appu[185] = 349674261;
        iy.appu[186] = 1699561150;
        iy.appu[187] = 758942379;
        iy.appu[188] = 970487662;
        iy.appu[189] = 1573336698;
        iy.appu[190] = 794175945;
        iy.appu[191] = 1399589732;
        iy.appu[192] = 69894293;
        iy.appu[193] = 693366604;
        iy.appu[194] = -1470974839;
        iy.appu[195] = 1485420356;
        iy.appu[196] = 2065021060;
        iy.appu[197] = -72265638;
        iy.appu[198] = -391311135;
        iy.appu[199] = -635362948;
    }

    private static /* synthetic */ void aren() {
        iy.apqv[0] = -4685702851213039943L;
        iy.apqv[1] = 1038910863647961298L;
        iy.apqv[2] = 8291400190587953067L;
        iy.apqv[3] = 3731983374389604721L;
        iy.apqv[4] = -6593062844068739561L;
        iy.apqv[5] = 8443143870132830369L;
        iy.apqv[6] = 1511096698131091659L;
        iy.apqv[7] = 3282901200314523516L;
        iy.apqv[8] = -6630797809347219729L;
        iy.apqv[9] = 2082420250946541288L;
        iy.apqv[10] = -1653468337051785907L;
        iy.apqv[11] = -3395813662610415628L;
        iy.apqv[12] = 4331778474433044919L;
        iy.apqv[13] = -5691057514371449437L;
        iy.apqv[14] = -3796882712374511803L;
        iy.apqv[15] = 7421714625008583280L;
        iy.apqv[16] = 4546903552828755858L;
        iy.apqv[17] = -7547988156656454302L;
        iy.apqv[18] = -1164508495119677811L;
        iy.apqv[19] = 6730182619802221478L;
        iy.apqv[20] = -1102147844059856555L;
        iy.apqv[21] = 383456144561807770L;
        iy.apqv[22] = 8229712943861199235L;
        iy.apqv[23] = -5563230608938267589L;
        iy.apqv[24] = -3443468402505488569L;
        iy.apqv[25] = 4673115020253107497L;
        iy.apqv[26] = 6577191305051437501L;
        iy.apqv[27] = 3885258916925439685L;
        iy.apqv[28] = 3063762465539311107L;
        iy.apqv[29] = 8897794497869362913L;
        iy.apqv[30] = 332724656465118515L;
        iy.apqv[31] = 7404991914796418677L;
        iy.apqv[32] = 332989362337541255L;
        iy.apqv[33] = -1461893482785007661L;
        iy.apqv[34] = -2030624449896380650L;
        iy.apqv[35] = -2389357128617414271L;
        iy.apqv[36] = 661530054127152108L;
        iy.apqv[37] = 8609147060772887606L;
        iy.apqv[38] = 2585382117476681456L;
        iy.apqv[39] = -6566989421986799293L;
        iy.apqv[40] = -723340138431244221L;
        iy.apqv[41] = -4609045069232046042L;
        iy.apqv[42] = 6412571844066261461L;
        iy.apqv[43] = -5019520422513978853L;
        iy.apqv[44] = -242044152555541536L;
        iy.apqv[45] = -8736509485017083770L;
        iy.apqv[46] = 3774148123482317113L;
        iy.apqv[47] = -4085779357899771688L;
        iy.apqv[48] = -8105694316170449927L;
        iy.apqv[49] = -8325393465509321066L;
        iy.apqv[50] = -6211182759611333590L;
        iy.apqv[51] = -4406669161334862665L;
        iy.apqv[52] = 1140862399277181848L;
        iy.apqv[53] = -8354338973779029615L;
        iy.apqv[54] = -1373899142084395402L;
        iy.apqv[55] = 4530660489165222898L;
        iy.apqv[56] = -1235175428921771799L;
        iy.apqv[57] = 5684684757402305144L;
        iy.apqv[58] = 3445390832044588090L;
        iy.apqv[59] = 3249701827590158828L;
        iy.apqv[60] = -7560309647801758376L;
        iy.apqv[61] = 3197832362216885025L;
        iy.apqv[62] = -441979848359410670L;
        iy.apqv[63] = 80828475225753924L;
        iy.apqv[64] = -8399889517178410896L;
        iy.apqv[65] = -1324192305147983658L;
        iy.apqv[66] = -3059164384846809139L;
        iy.apqv[67] = 7721899015144017990L;
        iy.apqv[68] = 7442368569766539014L;
        iy.apqv[69] = -1255777837993914661L;
        iy.apqv[70] = -7381841160163124718L;
        iy.apqv[71] = -3234415017654405306L;
        iy.apqv[72] = -4289188877401970695L;
        iy.apqv[73] = 7389224000964482658L;
        iy.apqv[74] = 4974884560988443997L;
        iy.apqv[75] = -3611455646211597603L;
        iy.apqv[76] = 2776036246541168264L;
        iy.apqv[77] = 1670715549270707056L;
        iy.apqv[78] = -1394197281189152688L;
        iy.apqv[79] = -7710989439750360634L;
        iy.apqv[80] = 4907242862671592551L;
        iy.apqv[81] = 5439374108566031112L;
        iy.apqv[82] = -5008595332676028083L;
        iy.apqv[83] = 7843363352297549799L;
        iy.apqv[84] = 9066106327373184062L;
        iy.apqv[85] = -1418883526095030182L;
        iy.apqv[86] = 5139034909900789811L;
        iy.apqv[87] = 492675982658422218L;
        iy.apqv[88] = -7934021110818358267L;
        iy.apqv[89] = 8222808806490037915L;
        iy.apqv[90] = -6120258649845001195L;
        iy.apqv[91] = -1942098897890164786L;
        iy.apqv[92] = -4081459782852084605L;
        iy.apqv[93] = 1365937169991621879L;
        iy.apqv[94] = 3071626840466403896L;
        iy.apqv[95] = 1887605189497283119L;
        iy.apqv[96] = 7032156969767130832L;
        iy.apqv[97] = 34278618421147839L;
        iy.apqv[98] = -2562280638407338804L;
        iy.apqv[99] = 2219881836786503975L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawOutlinedBox(class_238 var1_1, int var2_2) {
        var18_3 = iy.c;
        var17_4 /* !! */  = iy.b;
        var16_5 = iy.a;
        if (var18_3) {
            throw null;
lbl6:
            // 21 sources

            return;
        }
        if (var16_5 || var16_5) ** GOTO lbl6
        var3_6 = lv.getCameraPos();
        if (var16_5 || var16_5) ** GOTO lbl6
        var4_7 = var1_1.field_1323 - var3_6.field_1352;
        if (var16_5 || var16_5) ** GOTO lbl6
        var6_8 = var1_1.field_1322 - var3_6.field_1351;
        if (var16_5 || var16_5) ** GOTO lbl6
        var8_9 = var1_1.field_1321 - var3_6.field_1350;
        if (var16_5 || var16_5) ** GOTO lbl6
        var10_10 = var1_1.field_1320 - var3_6.field_1352;
        if (var16_5 || var16_5) ** GOTO lbl6
        var12_11 = var1_1.field_1325 - var3_6.field_1351;
        if (var16_5 || var16_5) ** GOTO lbl6
        var14_12 = var1_1.field_1324 - var3_6.field_1350;
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var4_7, var6_8, var8_9, var10_10, var6_8, var8_9, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var10_10, var6_8, var8_9, var10_10, var6_8, var14_12, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var10_10, var6_8, var14_12, var4_7, var6_8, var14_12, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var4_7, var6_8, var14_12, var4_7, var6_8, var8_9, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var4_7, var12_11, var8_9, var10_10, var12_11, var8_9, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var10_10, var12_11, var8_9, var10_10, var12_11, var14_12, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var10_10, var12_11, var14_12, var4_7, var12_11, var14_12, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var4_7, var12_11, var14_12, var4_7, var12_11, var8_9, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var4_7, var6_8, var8_9, var4_7, var12_11, var8_9, var2_2);
        if (var16_5 || var16_5) ** GOTO lbl6
        this.line(var10_10, var6_8, var8_9, var10_10, var12_11, var8_9, var2_2);
        if (var16_5) ** GOTO lbl6
        if (var17_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var16_5) ** GOTO lbl6
                this.line(var10_10, var6_8, var14_12, var10_10, var12_11, var14_12, var2_2);
                if (var16_5 || var16_5) ** GOTO lbl6
                this.line(var4_7, var6_8, var14_12, var4_7, var12_11, var14_12, var2_2);
                if (!var16_5 && !var16_5) ** break;
                ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var17_4 /* !! */  = (int)iy.appw("aqmx", apqa(int ), (int)479);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl58:
            // 2 sources

            case 1: {
                var17_4 /* !! */  = (int)iy.appw("aqmy", apqa(int ), (int)480);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 2: {
                var17_4 /* !! */  = (int)iy.appw("aqmz", apqa(int ), (int)481);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl68:
            // 2 sources

            case 3: {
                var17_4 /* !! */  = (int)iy.appw("aqna", apqa(int ), (int)482);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl73:
            // 2 sources

            case 4: {
                var17_4 /* !! */  = (int)iy.appw("aqnb", apqa(int ), (int)483);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 5: {
                var17_4 /* !! */  = (int)iy.appw("aqnc", apqa(int ), (int)484);
                if (!var18_3) ** GOTO lbl53
                throw null;
            }
            case 6: {
                var17_4 /* !! */  = (int)iy.appw("aqnd", apqa(int ), (int)485);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 7: {
                var17_4 /* !! */  = (int)iy.appw("aqne", apqa(int ), (int)486);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl92:
            // 2 sources

            case 8: {
                var17_4 /* !! */  = (int)iy.appw("aqnf", apqa(int ), (int)487);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl97:
            // 4 sources

            case 9: {
                var17_4 /* !! */  = (int)iy.appw("aqng", apqa(int ), (int)488);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl102:
            // 2 sources

            case 10: {
                var17_4 /* !! */  = (int)iy.appw("aqnh", apqa(int ), (int)489);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl107:
            // 3 sources

            case 11: {
                var17_4 /* !! */  = (int)iy.appw("aqni", apqa(int ), (int)490);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 12: {
                var17_4 /* !! */  = (int)iy.appw("aqnj", apqa(int ), (int)491);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl117:
            // 3 sources

            case 13: {
                do {
                    var17_4 /* !! */  = (int)iy.appw("aqnk", apqa(int ), (int)492);
                } while (!var18_3);
                throw null;
            }
lbl122:
            // 2 sources

            case 14: {
                var17_4 /* !! */  = (int)iy.appw("aqnl", apqa(int ), (int)493);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl127:
            // 3 sources

            case 15: {
                var17_4 /* !! */  = (int)iy.appw("aqnm", apqa(int ), (int)494);
                if (!var18_3) ** GOTO lbl73
                throw null;
            }
lbl131:
            // 2 sources

            case 16: {
                var17_4 /* !! */  = (int)iy.appw("aqnn", apqa(int ), (int)495);
                if (!var18_3) ** GOTO lbl58
                throw null;
            }
            case 17: {
                var17_4 /* !! */  = (int)iy.appw("aqno", apqa(int ), (int)496);
                if (!var18_3) ** GOTO lbl117
                throw null;
            }
lbl139:
            // 5 sources

            case 18: {
                var17_4 /* !! */  = (int)iy.appw("aqnp", apqa(int ), (int)497);
                if (!var18_3) ** GOTO lbl127
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_4 /* !! */  = (int)iy.appw("aqnq", apqa(int ), (int)498);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl207
                    break;
                }
            }
lbl149:
            // 2 sources

            case 20: {
                var17_4 /* !! */  = (int)iy.appw("aqnr", apqa(int ), (int)499);
                if (!var18_3) ** GOTO lbl139
                throw null;
            }
            case 21: {
                var17_4 /* !! */  = (int)iy.appw("aqns", apqa(int ), (int)500);
                if (!var18_3) ** GOTO lbl92
                throw null;
            }
lbl157:
            // 2 sources

            case 22: {
                var17_4 /* !! */  = (int)iy.appw("aqnt", apqa(int ), (int)501);
                if (!var18_3) ** GOTO lbl102
                throw null;
            }
lbl161:
            // 2 sources

            case 23: {
                var17_4 /* !! */  = (int)iy.appw("aqnu", apqa(int ), (int)502);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl166:
            // 2 sources

            case 24: {
                var17_4 /* !! */  = (int)iy.appw("aqnv", apqa(int ), (int)503);
                if (!var18_3) ** GOTO lbl107
                throw null;
            }
lbl170:
            // 2 sources

            case 25: {
                var17_4 /* !! */  = (int)iy.appw("aqnw", apqa(int ), (int)504);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 26: {
                var17_4 /* !! */  = (int)iy.appw("aqnx", apqa(int ), (int)505);
                if (!var18_3) ** GOTO lbl139
                throw null;
            }
            case 27: {
                var17_4 /* !! */  = (int)iy.appw("aqny", apqa(int ), (int)506);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 28: {
                var17_4 /* !! */  = (int)iy.appw("aqnz", apqa(int ), (int)507);
                if (!var18_3) ** GOTO lbl97
                throw null;
            }
lbl188:
            // 3 sources

            case 29: {
                var17_4 /* !! */  = (int)iy.appw("aqoa", apqa(int ), (int)508);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl193:
            // 2 sources

            case 30: {
                var17_4 /* !! */  = (int)iy.appw("aqob", apqa(int ), (int)509);
                if (!var18_3) ** GOTO lbl117
                throw null;
            }
lbl197:
            // 3 sources

            case 31: {
                var17_4 /* !! */  = (int)iy.appw("aqoc", apqa(int ), (int)510);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl202:
            // 2 sources

            case 32: {
                var17_4 /* !! */  = (int)iy.appw("aqod", apqa(int ), (int)511);
                if (var18_3) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl207:
            // 2 sources

            case 33: {
                var17_4 /* !! */  = (int)iy.appw("aqoe", apqa(int ), (int)512);
                if (!var18_3) ** GOTO lbl68
                throw null;
            }
lbl211:
            // 2 sources

            case 34: {
                var17_4 /* !! */  = (int)iy.appw("aqof", apqa(int ), (int)513);
                if (!var18_3) ** GOTO lbl107
                throw null;
            }
lbl215:
            // 3 sources

            case 35: {
                var17_4 /* !! */  = (int)iy.appw("aqog", apqa(int ), (int)514);
                if (!var18_3) ** GOTO lbl139
                throw null;
            }
lbl219:
            // 2 sources

            case 36: {
                var17_4 /* !! */  = (int)iy.appw("aqoh", apqa(int ), (int)515);
                if (!var18_3) ** GOTO lbl188
                throw null;
            }
            case 37: {
                var17_4 /* !! */  = (int)iy.appw("aqoi", apqa(int ), (int)516);
                if (!var18_3) ** GOTO lbl131
                throw null;
            }
            case 38: {
                var17_4 /* !! */  = (int)iy.appw("aqoj", apqa(int ), (int)517);
                if (!var18_3) ** GOTO lbl157
                throw null;
            }
lbl231:
            // 4 sources

            case 39: {
                var17_4 /* !! */  = (int)iy.appw("aqok", apqa(int ), (int)518);
                if (!var18_3) ** GOTO lbl127
                throw null;
            }
            case 40: {
                var17_4 /* !! */  = (int)iy.appw("aqol", apqa(int ), (int)519);
                if (!var18_3) ** GOTO lbl97
                throw null;
            }
            case 41: 
        }
        var17_4 /* !! */  = (int)iy.appw("aqom", apqa(int ), (int)520);
        ** while (!var18_3)
lbl242:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void arec() {
        iy.appu[500] = -921234722;
        iy.appu[501] = 2064446587;
        iy.appu[502] = 864252397;
        iy.appu[503] = -75687933;
        iy.appu[504] = 879861813;
        iy.appu[505] = -371737491;
        iy.appu[506] = -1069195852;
        iy.appu[507] = 853659475;
        iy.appu[508] = -825089092;
        iy.appu[509] = 1133920816;
        iy.appu[510] = -325907788;
        iy.appu[511] = -395437344;
        iy.appu[512] = -70614549;
        iy.appu[513] = 660167397;
        iy.appu[514] = 1135268118;
        iy.appu[515] = -1728675178;
        iy.appu[516] = -1241098583;
        iy.appu[517] = -1343283365;
        iy.appu[518] = 935092736;
        iy.appu[519] = -899404426;
        iy.appu[520] = 832632361;
        iy.appu[521] = -2081659142;
        iy.appu[522] = -777272432;
        iy.appu[523] = 1053523834;
        iy.appu[524] = -624496184;
        iy.appu[525] = 1968618478;
        iy.appu[526] = 521012259;
        iy.appu[527] = -1389189529;
        iy.appu[528] = 1493770363;
        iy.appu[529] = -1399136893;
        iy.appu[530] = 1484768172;
        iy.appu[531] = 589000994;
        iy.appu[532] = 1946482819;
        iy.appu[533] = 944657011;
        iy.appu[534] = 1224052029;
        iy.appu[535] = -1925815398;
        iy.appu[536] = 174561852;
        iy.appu[537] = -37197989;
        iy.appu[538] = 222521050;
        iy.appu[539] = -168038825;
        iy.appu[540] = -275899371;
        iy.appu[541] = -1864416964;
        iy.appu[542] = -340329125;
        iy.appu[543] = 164925544;
        iy.appu[544] = -1418925823;
        iy.appu[545] = 205509978;
        iy.appu[546] = 1946959357;
        iy.appu[547] = -704807640;
        iy.appu[548] = 895673421;
        iy.appu[549] = -677570444;
        iy.appu[550] = -841278477;
        iy.appu[551] = -11885408;
        iy.appu[552] = -364223174;
        iy.appu[553] = 1736314830;
        iy.appu[554] = -1215493186;
        iy.appu[555] = 513942799;
        iy.appu[556] = -2106149950;
        iy.appu[557] = -1744818513;
        iy.appu[558] = 545607419;
        iy.appu[559] = -379794512;
        iy.appu[560] = -1589217968;
        iy.appu[561] = 9872266;
        iy.appu[562] = -55705009;
        iy.appu[563] = -81345395;
        iy.appu[564] = -202547530;
        iy.appu[565] = 1630505853;
        iy.appu[566] = -1555704263;
        iy.appu[567] = -1376821870;
        iy.appu[568] = -227757627;
        iy.appu[569] = 967743184;
        iy.appu[570] = 1110637618;
        iy.appu[571] = 835218674;
        iy.appu[572] = -996587921;
        iy.appu[573] = -2131428100;
        iy.appu[574] = 1053523617;
        iy.appu[575] = 968544200;
        iy.appu[576] = -2147171036;
        iy.appu[577] = -1537712380;
        iy.appu[578] = 2104433390;
        iy.appu[579] = -1114573620;
        iy.appu[580] = 1677355575;
        iy.appu[581] = 1153091572;
        iy.appu[582] = 880444171;
        iy.appu[583] = 911874699;
        iy.appu[584] = 1368995004;
        iy.appu[585] = 748761839;
        iy.appu[586] = -2003854999;
        iy.appu[587] = -391622721;
        iy.appu[588] = -1721595628;
        iy.appu[589] = 965901856;
        iy.appu[590] = -1570599429;
        iy.appu[591] = -1855771781;
        iy.appu[592] = -2082429326;
        iy.appu[593] = 181391132;
        iy.appu[594] = 1712059846;
        iy.appu[595] = -514294214;
        iy.appu[596] = 1470484722;
        iy.appu[597] = -904022365;
        iy.appu[598] = 1705660222;
        iy.appu[599] = 1056207736;
    }

    private static /* synthetic */ void arer() {
        iy.apqw[100] = 5464148025328146830L;
        iy.apqw[101] = -8849407636046121025L;
        iy.apqw[102] = 7703660608837974650L;
        iy.apqw[103] = -6047436058042240059L;
        iy.apqw[104] = -1948836361695664977L;
        iy.apqw[105] = -2098532426752238778L;
        iy.apqw[106] = 2270784011997303094L;
        iy.apqw[107] = -2972166467249371573L;
        iy.apqw[108] = 7411540026525705656L;
        iy.apqw[109] = -6450757178777483040L;
        iy.apqw[110] = -3201111868790998652L;
        iy.apqw[111] = 3610051136085672733L;
        iy.apqw[112] = 7285330862193394170L;
        iy.apqw[113] = 6072074131124455427L;
        iy.apqw[114] = 7162444330562374379L;
        iy.apqw[115] = -3602413049542674702L;
        iy.apqw[116] = -8802754296999307930L;
        iy.apqw[117] = -3725001677648380734L;
        iy.apqw[118] = 7843695750522181951L;
        iy.apqw[119] = 5972372751647159971L;
        iy.apqw[120] = -944191759721868533L;
        iy.apqw[121] = 7790365134265205630L;
        iy.apqw[122] = -2501374610882374585L;
        iy.apqw[123] = 8503447297278964329L;
        iy.apqw[124] = -6374805894455385939L;
        iy.apqw[125] = 6783600293543612952L;
        iy.apqw[126] = -3404705966298100535L;
        iy.apqw[127] = 3777308661872872093L;
        iy.apqw[128] = -5446044965884763488L;
        iy.apqw[129] = 9127403327150624311L;
        iy.apqw[130] = 3013269748825740216L;
        iy.apqw[131] = 1144988450819660594L;
        iy.apqw[132] = 1061082909640968347L;
        iy.apqw[133] = 558991750754022614L;
        iy.apqw[134] = -7996276438689583961L;
        iy.apqw[135] = 1948856703616985653L;
        iy.apqw[136] = 3899835413754212564L;
        iy.apqw[137] = -8251265614063628534L;
        iy.apqw[138] = 7689184462749031749L;
        iy.apqw[139] = 6260791247890532330L;
        iy.apqw[140] = -4373098038366804957L;
        iy.apqw[141] = 8224884676022843375L;
        iy.apqw[142] = 6385850952183272666L;
        iy.apqw[143] = -3612467569843180687L;
        iy.apqw[144] = -3390022588500936219L;
        iy.apqw[145] = -72644020609479376L;
        iy.apqw[146] = 6260723629169516140L;
        iy.apqw[147] = -2086922897040919247L;
        iy.apqw[148] = -5786600700357254842L;
        iy.apqw[149] = 2949268034944585665L;
        iy.apqw[150] = 2232531113022028924L;
        iy.apqw[151] = -7030412299578271112L;
        iy.apqw[152] = 5728792831536901333L;
        iy.apqw[153] = -5429087557746453782L;
        iy.apqw[154] = -4891397090615870082L;
        iy.apqw[155] = -8144854422196930232L;
        iy.apqw[156] = -8402842660785472759L;
        iy.apqw[157] = 2972954902824383495L;
        iy.apqw[158] = -4038072651652089419L;
        iy.apqw[159] = 5596379711419320770L;
        iy.apqw[160] = 4731830657469355474L;
        iy.apqw[161] = -5908130259010684892L;
        iy.apqw[162] = 4288923591837702355L;
        iy.apqw[163] = -7054793599462462625L;
        iy.apqw[164] = 8060776257923887627L;
        iy.apqw[165] = 4884267701601783310L;
        iy.apqw[166] = -2987321923755320668L;
        iy.apqw[167] = -1290004225233974785L;
        iy.apqw[168] = 3714083805166269563L;
        iy.apqw[169] = 7343822691747468420L;
        iy.apqw[170] = -5009923419917605543L;
        iy.apqw[171] = 2108738467144639294L;
        iy.apqw[172] = -3370302484922667747L;
        iy.apqw[173] = -6240064747694369943L;
        iy.apqw[174] = -5658160270005729531L;
        iy.apqw[175] = -9056061276941725873L;
        iy.apqw[176] = 3555172273747381139L;
        iy.apqw[177] = 4073386376035269746L;
        iy.apqw[178] = 6082157070575842991L;
        iy.apqw[179] = 8662103709725216273L;
        iy.apqw[180] = 6170844097266656372L;
        iy.apqw[181] = 9213465976082228375L;
        iy.apqw[182] = 1920895023016755930L;
        iy.apqw[183] = -4075561692170177517L;
        iy.apqw[184] = 8877871594372538105L;
        iy.apqw[185] = -4163236295595066888L;
        iy.apqw[186] = -6640187707506266869L;
        iy.apqw[187] = 3268075524467170138L;
        iy.apqw[188] = 2562409244930221712L;
        iy.apqw[189] = 1210610499139331781L;
        iy.apqw[190] = 7030584678065720277L;
        iy.apqw[191] = -6310304520043858024L;
        iy.apqw[192] = 613467005935187909L;
        iy.apqw[193] = -4881227377619458075L;
        iy.apqw[194] = 1233469448575929056L;
        iy.apqw[195] = 5292003954784199395L;
        iy.apqw[196] = 3994414415659994742L;
        iy.apqw[197] = -6077448465093877426L;
        iy.apqw[198] = -1751395314259483587L;
        iy.apqw[199] = 850016199394818101L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanEntities(int var1_1, int var2_2) {
        var14_3 = iy.c;
        var13_4 /* !! */  = iy.b;
        var12_5 = iy.a;
        if (var14_3) {
            throw null;
lbl6:
            // 29 sources

            return;
        }
        if (var12_5 || var12_5) ** GOTO lbl6
        var3_6 = (double)var1_1 * (double)var1_1;
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_7 = this.currentEntityIds;
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_7.clear();
        if (var12_5 || var12_5) ** GOTO lbl6
        var6_8 = iy.mc.field_1687.method_18112().iterator();
        if (var12_5) ** GOTO lbl6
        block54: while (true) {
            block101: {
                if (var12_5 || var12_5) ** GOTO lbl6
                if (!var6_8.hasNext()) ** GOTO lbl66
                if (var12_5) ** GOTO lbl6
                var7_9 = (class_1297)var6_8.next();
                if (var12_5 || var12_5) ** GOTO lbl6
                var8_10 = this.entityType(var7_9, var2_2);
                if (var12_5 || var12_5) ** GOTO lbl6
                if (var8_10 == null) continue;
                if (var12_5) ** GOTO lbl6
                if (!var7_9.method_5805()) continue;
                if (var12_5) ** GOTO lbl6
                if (!(var7_9.method_5858((class_1297)iy.mc.field_1724) > var3_6)) break block101;
                if (var12_5) ** GOTO lbl6
                if (!var14_3) continue;
                throw null;
            }
            if (var12_5 || var12_5) ** GOTO lbl6
            var9_11 = var7_9.method_5667();
            if (var12_5 || var12_5) ** GOTO lbl6
            var5_7.add(var9_11);
            if (var12_5 || var12_5) ** GOTO lbl6
            if (var13_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var10_12 = this.foundEntities.get(var9_11);
                    if (var12_5 || var12_5) ** GOTO lbl6
                    if (var10_12 == null) ** GOTO lbl51
                    if (var12_5) ** GOTO lbl6
                    if (var10_12.entity != var7_9) ** GOTO lbl51
                    if (var12_5) ** GOTO lbl6
                    if (var10_12.type == var8_10) ** GOTO lbl55
                    if (var12_5) ** GOTO lbl6
lbl51:
                    // 3 sources

                    if (var12_5 || var12_5) ** GOTO lbl6
                    this.foundEntities.put(var9_11, new iy$FoundEntity(var7_9, var8_10));
                    if (var12_5) ** GOTO lbl6
lbl55:
                    // 2 sources

                    if (var12_5 || var12_5) ** GOTO lbl6
                    if (!this.announcedEntities.add(var9_11)) ** GOTO lbl62
                    if (var12_5 || var12_5) ** GOTO lbl6
                    var11_13 = var7_9.method_24515();
                    if (var12_5 || var12_5) ** GOTO lbl6
                    pp.brandmessage("\u041d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 " + var11_13.method_10263() + " " + var11_13.method_10264() + " " + var11_13.method_10260() + " \u043d\u0430\u0439\u0434\u0435\u043d " + var8_10.entityName);
                    if (var12_5) ** GOTO lbl6
lbl62:
                    // 2 sources

                    if (var12_5 || var12_5) ** GOTO lbl6
                    if (var14_3) ** break;
                    continue block54;
                    throw null;
                }
lbl66:
                // 1 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                this.foundEntities.keySet().retainAll(var5_7);
                if (var12_5 || var12_5) ** GOTO lbl6
                this.announcedEntities.retainAll(var5_7);
                if (!var12_5 && !var12_5) ** break;
                ** continue;
                return;
                case 0: {
                    var13_4 /* !! */  = (int)iy.appw("aqin", apqa(int ), (int)371);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 1: {
                    var13_4 /* !! */  = (int)iy.appw("aqio", apqa(int ), (int)372);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
lbl85:
                // 2 sources

                case 2: {
                    var13_4 /* !! */  = (int)iy.appw("aqip", apqa(int ), (int)373);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl192
                }
lbl90:
                // 3 sources

                case 3: {
                    var13_4 /* !! */  = (int)iy.appw("aqiq", apqa(int ), (int)374);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl223
                }
                case 4: {
                    var13_4 /* !! */  = (int)iy.appw("aqir", apqa(int ), (int)375);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl178
                }
lbl100:
                // 2 sources

                case 5: {
                    var13_4 /* !! */  = (int)iy.appw("aqis", apqa(int ), (int)376);
                    if (!var14_3) ** GOTO lbl85
                    throw null;
                }
                case 6: {
                    var13_4 /* !! */  = (int)iy.appw("aqit", apqa(int ), (int)377);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
lbl109:
                // 2 sources

                case 7: {
                    var13_4 /* !! */  = (int)iy.appw("aqiu", apqa(int ), (int)378);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
                case 8: {
                    var13_4 /* !! */  = (int)iy.appw("aqiv", apqa(int ), (int)379);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
lbl119:
                // 2 sources

                case 9: {
                    var13_4 /* !! */  = (int)iy.appw("aqiw", apqa(int ), (int)380);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
                case 10: {
                    var13_4 /* !! */  = (int)iy.appw("aqix", apqa(int ), (int)381);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 11: {
                    var13_4 /* !! */  = (int)iy.appw("aqiy", apqa(int ), (int)382);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
                case 12: {
                    var13_4 /* !! */  = (int)iy.appw("aqiz", apqa(int ), (int)383);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
lbl139:
                // 3 sources

                case 13: {
                    var13_4 /* !! */  = (int)iy.appw("aqja", apqa(int ), (int)384);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
lbl144:
                // 2 sources

                case 14: {
                    var13_4 /* !! */  = (int)iy.appw("aqjb", apqa(int ), (int)385);
                    if (var14_3) {
                        throw null;
                    }
                }
                case 15: {
                    var13_4 /* !! */  = (int)iy.appw("aqjc", apqa(int ), (int)386);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 16: {
                    var13_4 /* !! */  = (int)iy.appw("aqjd", apqa(int ), (int)387);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
                case 17: {
                    var13_4 /* !! */  = (int)iy.appw("aqje", apqa(int ), (int)388);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
                case 18: {
                    var13_4 /* !! */  = (int)iy.appw("aqjf", apqa(int ), (int)389);
                    if (!var14_3) ** GOTO lbl109
                    throw null;
                }
lbl167:
                // 5 sources

                case 19: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_4 /* !! */  = (int)iy.appw("aqjg", apqa(int ), (int)390);
                        if (var14_3) {
                            throw null;
                        }
                        ** GOTO lbl201
                        break;
                    }
                }
                case 20: {
                    var13_4 /* !! */  = (int)iy.appw("aqjh", apqa(int ), (int)391);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl244
                }
lbl178:
                // 3 sources

                case 21: {
                    var13_4 /* !! */  = (int)iy.appw("aqji", apqa(int ), (int)392);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl232
                }
lbl183:
                // 4 sources

                case 22: {
                    var13_4 /* !! */  = (int)iy.appw("aqjj", apqa(int ), (int)393);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
lbl188:
                // 3 sources

                case 23: {
                    var13_4 /* !! */  = (int)iy.appw("aqjk", apqa(int ), (int)394);
                    if (!var14_3) ** GOTO lbl183
                    throw null;
                }
lbl192:
                // 2 sources

                case 24: {
                    var13_4 /* !! */  = (int)iy.appw("aqjl", apqa(int ), (int)395);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl296
                }
lbl197:
                // 3 sources

                case 25: {
                    var13_4 /* !! */  = (int)iy.appw("aqjm", apqa(int ), (int)396);
                    if (!var14_3) ** GOTO lbl119
                    throw null;
                }
lbl201:
                // 3 sources

                case 26: {
                    var13_4 /* !! */  = (int)iy.appw("aqjn", apqa(int ), (int)397);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl232
                }
                case 27: {
                    var13_4 /* !! */  = (int)iy.appw("aqjo", apqa(int ), (int)398);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl211:
                // 7 sources

                case 28: {
                    var13_4 /* !! */  = (int)iy.appw("aqjp", apqa(int ), (int)399);
                    if (!var14_3) ** GOTO lbl90
                    throw null;
                }
                case 29: {
                    var13_4 /* !! */  = (int)iy.appw("aqjq", apqa(int ), (int)400);
                    if (!var14_3) ** GOTO lbl139
                    throw null;
                }
                case 30: {
                    var13_4 /* !! */  = (int)iy.appw("aqjr", apqa(int ), (int)401);
                    if (!var14_3) ** GOTO lbl167
                    throw null;
                }
lbl223:
                // 2 sources

                case 31: {
                    var13_4 /* !! */  = (int)iy.appw("aqjs", apqa(int ), (int)402);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
lbl228:
                // 2 sources

                case 32: {
                    var13_4 /* !! */  = (int)iy.appw("aqjt", apqa(int ), (int)403);
                    if (!var14_3) ** GOTO lbl90
                    throw null;
                }
lbl232:
                // 3 sources

                case 33: {
                    var13_4 /* !! */  = (int)iy.appw("aqju", apqa(int ), (int)404);
                    if (!var14_3) ** GOTO lbl188
                    throw null;
                }
                case 34: {
                    var13_4 /* !! */  = (int)iy.appw("aqjv", apqa(int ), (int)405);
                    if (!var14_3) ** GOTO lbl144
                    throw null;
                }
lbl240:
                // 2 sources

                case 35: {
                    var13_4 /* !! */  = (int)iy.appw("aqjw", apqa(int ), (int)406);
                    if (!var14_3) ** GOTO lbl100
                    throw null;
                }
lbl244:
                // 2 sources

                case 36: {
                    var13_4 /* !! */  = (int)iy.appw("aqjx", apqa(int ), (int)407);
                    if (!var14_3) ** GOTO lbl197
                    throw null;
                }
lbl248:
                // 2 sources

                case 37: {
                    var13_4 /* !! */  = (int)iy.appw("aqjy", apqa(int ), (int)408);
                    if (!var14_3) ** GOTO lbl183
                    throw null;
                }
lbl252:
                // 3 sources

                case 38: {
                    var13_4 /* !! */  = (int)iy.appw("aqjz", apqa(int ), (int)409);
                    if (!var14_3) ** GOTO lbl228
                    throw null;
                }
lbl256:
                // 2 sources

                case 39: {
                    var13_4 /* !! */  = (int)iy.appw("aqka", apqa(int ), (int)410);
                    if (!var14_3) ** GOTO lbl178
                    throw null;
                }
                case 40: {
                    var13_4 /* !! */  = (int)iy.appw("aqkb", apqa(int ), (int)411);
                    if (!var14_3) ** GOTO lbl183
                    throw null;
                }
lbl264:
                // 2 sources

                case 41: {
                    var13_4 /* !! */  = (int)iy.appw("aqkc", apqa(int ), (int)412);
                    if (!var14_3) ** GOTO lbl139
                    throw null;
                }
lbl268:
                // 2 sources

                case 42: {
                    var13_4 /* !! */  = (int)iy.appw("aqkd", apqa(int ), (int)413);
                    if (!var14_3) ** GOTO lbl201
                    throw null;
                }
                case 43: {
                    var13_4 /* !! */  = (int)iy.appw("aqke", apqa(int ), (int)414);
                    if (!var14_3) ** GOTO lbl211
                    throw null;
                }
                case 44: {
                    var13_4 /* !! */  = (int)iy.appw("aqkf", apqa(int ), (int)415);
                    if (!var14_3) ** GOTO lbl211
                    throw null;
                }
                case 45: {
                    var13_4 /* !! */  = (int)iy.appw("aqkg", apqa(int ), (int)416);
                    if (!var14_3) ** GOTO lbl264
                    throw null;
                }
lbl284:
                // 2 sources

                case 46: {
                    var13_4 /* !! */  = (int)iy.appw("aqkh", apqa(int ), (int)417);
                    if (!var14_3) break block54;
                    throw null;
                }
lbl288:
                // 3 sources

                case 47: {
                    var13_4 /* !! */  = (int)iy.appw("aqki", apqa(int ), (int)418);
                    if (!var14_3) ** GOTO lbl252
                    throw null;
                }
                case 48: {
                    var13_4 /* !! */  = (int)iy.appw("aqkj", apqa(int ), (int)419);
                    if (var14_3) {
                        throw null;
                    }
                }
lbl296:
                // 4 sources

                case 49: {
                    var13_4 /* !! */  = (int)iy.appw("aqkk", apqa(int ), (int)420);
                    if (!var14_3) ** GOTO lbl268
                    throw null;
                }
                case 50: 
            }
            break;
        }
        var13_4 /* !! */  = (int)iy.appw("aqkl", apqa(int ), (int)421);
        ** while (!var14_3)
lbl303:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void arei() {
        iy.appv[300] = 285307913;
        iy.appv[301] = 1911393663;
        iy.appv[302] = 1135698295;
        iy.appv[303] = -1992883731;
        iy.appv[304] = 1960066668;
        iy.appv[305] = 1573886978;
        iy.appv[306] = 1936214694;
        iy.appv[307] = -359512032;
        iy.appv[308] = 1999491917;
        iy.appv[309] = 1063433091;
        iy.appv[310] = 1153051542;
        iy.appv[311] = -1889159016;
        iy.appv[312] = 746732282;
        iy.appv[313] = 251471453;
        iy.appv[314] = -1104616383;
        iy.appv[315] = 567425134;
        iy.appv[316] = 637119978;
        iy.appv[317] = -1473416783;
        iy.appv[318] = -134751308;
        iy.appv[319] = -1236934213;
        iy.appv[320] = 381819325;
        iy.appv[321] = 577547578;
        iy.appv[322] = -582745328;
        iy.appv[323] = 99920189;
        iy.appv[324] = 1194837262;
        iy.appv[325] = -1104183846;
        iy.appv[326] = 1752175287;
        iy.appv[327] = 1604247954;
        iy.appv[328] = -294266964;
        iy.appv[329] = 78175803;
        iy.appv[330] = -1399933866;
        iy.appv[331] = 689618254;
        iy.appv[332] = -977875503;
        iy.appv[333] = 1265834974;
        iy.appv[334] = -1954420835;
        iy.appv[335] = -465782741;
        iy.appv[336] = 596825510;
        iy.appv[337] = -250060624;
        iy.appv[338] = -654452955;
        iy.appv[339] = 664503579;
        iy.appv[340] = -2123549638;
        iy.appv[341] = 1337339585;
        iy.appv[342] = -2063497131;
        iy.appv[343] = -1940951368;
        iy.appv[344] = 186912581;
        iy.appv[345] = 1110937858;
        iy.appv[346] = 177676431;
        iy.appv[347] = 609930675;
        iy.appv[348] = 917898182;
        iy.appv[349] = 1572036407;
        iy.appv[350] = 1685748205;
        iy.appv[351] = 1639943458;
        iy.appv[352] = -421778027;
        iy.appv[353] = -387568392;
        iy.appv[354] = 2121831527;
        iy.appv[355] = 2114304045;
        iy.appv[356] = -1315210096;
        iy.appv[357] = -1553447334;
        iy.appv[358] = -1729539269;
        iy.appv[359] = -1210106861;
        iy.appv[360] = -2125358819;
        iy.appv[361] = 1736307618;
        iy.appv[362] = -1024709243;
        iy.appv[363] = -606790605;
        iy.appv[364] = 324937802;
        iy.appv[365] = 41376655;
        iy.appv[366] = 1816491069;
        iy.appv[367] = 1498674159;
        iy.appv[368] = 84292888;
        iy.appv[369] = -1122485567;
        iy.appv[370] = -486375179;
        iy.appv[371] = -1475805808;
        iy.appv[372] = 826287061;
        iy.appv[373] = -1044784018;
        iy.appv[374] = -1720384390;
        iy.appv[375] = -1396329574;
        iy.appv[376] = 1985546012;
        iy.appv[377] = 1944988210;
        iy.appv[378] = 1900229065;
        iy.appv[379] = -581144016;
        iy.appv[380] = -1273680022;
        iy.appv[381] = -1714698738;
        iy.appv[382] = 601778627;
        iy.appv[383] = -1151645002;
        iy.appv[384] = 982622192;
        iy.appv[385] = -1403830094;
        iy.appv[386] = 1795976737;
        iy.appv[387] = -349311560;
        iy.appv[388] = 1913093290;
        iy.appv[389] = -1392840706;
        iy.appv[390] = -908308571;
        iy.appv[391] = -2108043511;
        iy.appv[392] = -1139817041;
        iy.appv[393] = 1933781446;
        iy.appv[394] = -432043119;
        iy.appv[395] = 2098587695;
        iy.appv[396] = -904465461;
        iy.appv[397] = 185394901;
        iy.appv[398] = 1242762332;
        iy.appv[399] = -1011761922;
    }

    private static /* synthetic */ void areb() {
        iy.appu[400] = -141211058;
        iy.appu[401] = -7794135;
        iy.appu[402] = 1458241971;
        iy.appu[403] = -917141866;
        iy.appu[404] = -895880653;
        iy.appu[405] = 1597442219;
        iy.appu[406] = -1515207843;
        iy.appu[407] = -1042307036;
        iy.appu[408] = 260321845;
        iy.appu[409] = -1211298667;
        iy.appu[410] = -783731595;
        iy.appu[411] = 1111610143;
        iy.appu[412] = 648501373;
        iy.appu[413] = 357413305;
        iy.appu[414] = 1568233455;
        iy.appu[415] = 134380431;
        iy.appu[416] = -246732323;
        iy.appu[417] = 1379501443;
        iy.appu[418] = -1881272644;
        iy.appu[419] = -1213364748;
        iy.appu[420] = 1346628009;
        iy.appu[421] = 1610381411;
        iy.appu[422] = 1679634184;
        iy.appu[423] = -649508123;
        iy.appu[424] = 1250245934;
        iy.appu[425] = -1491462563;
        iy.appu[426] = -780550816;
        iy.appu[427] = -1385842432;
        iy.appu[428] = 1026098524;
        iy.appu[429] = 1737999754;
        iy.appu[430] = -1457548545;
        iy.appu[431] = -1573273234;
        iy.appu[432] = -1764815671;
        iy.appu[433] = -829253237;
        iy.appu[434] = 1754397851;
        iy.appu[435] = -1051949756;
        iy.appu[436] = 611094676;
        iy.appu[437] = 1885115598;
        iy.appu[438] = -292261243;
        iy.appu[439] = 644476970;
        iy.appu[440] = 641064289;
        iy.appu[441] = 232167272;
        iy.appu[442] = 1336273994;
        iy.appu[443] = -1267466964;
        iy.appu[444] = 1167961090;
        iy.appu[445] = -1549780801;
        iy.appu[446] = -1068319705;
        iy.appu[447] = 1267291435;
        iy.appu[448] = -1424305180;
        iy.appu[449] = 2074250872;
        iy.appu[450] = 1471733878;
        iy.appu[451] = 472946407;
        iy.appu[452] = 957554108;
        iy.appu[453] = 1813410903;
        iy.appu[454] = -1180153455;
        iy.appu[455] = 1296206164;
        iy.appu[456] = -716033681;
        iy.appu[457] = 336870547;
        iy.appu[458] = -383702894;
        iy.appu[459] = 1429061429;
        iy.appu[460] = 1701760103;
        iy.appu[461] = 1043654367;
        iy.appu[462] = 92249111;
        iy.appu[463] = 2010279745;
        iy.appu[464] = -907036693;
        iy.appu[465] = -810858059;
        iy.appu[466] = -1178252053;
        iy.appu[467] = -388135933;
        iy.appu[468] = -1960496331;
        iy.appu[469] = 1069402722;
        iy.appu[470] = -748236428;
        iy.appu[471] = 2071341046;
        iy.appu[472] = -658324525;
        iy.appu[473] = -688943465;
        iy.appu[474] = 101444208;
        iy.appu[475] = 1803637250;
        iy.appu[476] = -309288237;
        iy.appu[477] = 1622295879;
        iy.appu[478] = -519116116;
        iy.appu[479] = 1324553999;
        iy.appu[480] = 1246443309;
        iy.appu[481] = 1818750869;
        iy.appu[482] = -1955011755;
        iy.appu[483] = 1188938085;
        iy.appu[484] = -1321577173;
        iy.appu[485] = 890129093;
        iy.appu[486] = -251829636;
        iy.appu[487] = 74119071;
        iy.appu[488] = 1852912626;
        iy.appu[489] = 811844344;
        iy.appu[490] = -1353589556;
        iy.appu[491] = -1779732215;
        iy.appu[492] = -1841082643;
        iy.appu[493] = -1460663483;
        iy.appu[494] = -1536551924;
        iy.appu[495] = 1743650888;
        iy.appu[496] = 327788108;
        iy.appu[497] = -1873229228;
        iy.appu[498] = 1826885127;
        iy.appu[499] = -1374227353;
    }

    private static /* synthetic */ void arel() {
        iy.appv[600] = 2003874142;
        iy.appv[601] = 735027361;
        iy.appv[602] = 266670202;
        iy.appv[603] = -889009200;
        iy.appv[604] = 902356238;
        iy.appv[605] = 336527158;
        iy.appv[606] = 1027080652;
        iy.appv[607] = -1953340260;
        iy.appv[608] = 454445137;
        iy.appv[609] = 1575539705;
        iy.appv[610] = 506335929;
        iy.appv[611] = -871496715;
        iy.appv[612] = 806732872;
        iy.appv[613] = -1341415351;
        iy.appv[614] = 361155433;
        iy.appv[615] = 315113717;
        iy.appv[616] = -718614940;
        iy.appv[617] = -1041515960;
        iy.appv[618] = -1311998295;
        iy.appv[619] = 1132466838;
        iy.appv[620] = -1085591072;
        iy.appv[621] = -741627172;
        iy.appv[622] = 990595782;
        iy.appv[623] = 419303330;
        iy.appv[624] = 60153632;
        iy.appv[625] = 339126741;
        iy.appv[626] = 1591426378;
        iy.appv[627] = 763868022;
        iy.appv[628] = -1663087831;
        iy.appv[629] = 829913678;
        iy.appv[630] = -835845744;
        iy.appv[631] = 1052486408;
        iy.appv[632] = -1252011438;
        iy.appv[633] = 2071341401;
        iy.appv[634] = 258109182;
        iy.appv[635] = 777769139;
        iy.appv[636] = 887469155;
        iy.appv[637] = -1292932803;
        iy.appv[638] = 1485005456;
        iy.appv[639] = 1239833767;
        iy.appv[640] = 1225045745;
        iy.appv[641] = -763693230;
        iy.appv[642] = -1118060373;
        iy.appv[643] = -1249238711;
        iy.appv[644] = 839736451;
        iy.appv[645] = -672260082;
        iy.appv[646] = -1290637140;
        iy.appv[647] = -585008794;
        iy.appv[648] = 709110873;
        iy.appv[649] = 1765659305;
        iy.appv[650] = -1020548312;
        iy.appv[651] = -350441632;
        iy.appv[652] = 679910444;
        iy.appv[653] = -378967304;
        iy.appv[654] = -2125973780;
        iy.appv[655] = -825678278;
        iy.appv[656] = -1769649339;
        iy.appv[657] = 1027016965;
        iy.appv[658] = 633338995;
        iy.appv[659] = -1890066048;
        iy.appv[660] = 1490339772;
        iy.appv[661] = -1392757425;
        iy.appv[662] = 1824851592;
        iy.appv[663] = 491903176;
        iy.appv[664] = -1846794455;
        iy.appv[665] = 1022854441;
        iy.appv[666] = -695504811;
        iy.appv[667] = -392361955;
        iy.appv[668] = -1367527234;
        iy.appv[669] = 1626999181;
        iy.appv[670] = 560520089;
        iy.appv[671] = 1173072904;
        iy.appv[672] = 1646963886;
        iy.appv[673] = 1009760536;
        iy.appv[674] = -92968705;
        iy.appv[675] = 961235433;
        iy.appv[676] = -641693512;
        iy.appv[677] = -838407026;
        iy.appv[678] = 1452784451;
        iy.appv[679] = 85605955;
        iy.appv[680] = -727086842;
        iy.appv[681] = 1154710856;
        iy.appv[682] = 593739988;
        iy.appv[683] = 528494358;
        iy.appv[684] = -1008960438;
        iy.appv[685] = 392252298;
        iy.appv[686] = 2103049911;
        iy.appv[687] = 1304887230;
        iy.appv[688] = -1321979479;
        iy.appv[689] = 118246813;
        iy.appv[690] = 1668947669;
        iy.appv[691] = 1935874571;
        iy.appv[692] = 1992292127;
        iy.appv[693] = -489713205;
        iy.appv[694] = 1794273240;
        iy.appv[695] = 89238934;
        iy.appv[696] = 60308074;
        iy.appv[697] = 2056329213;
        iy.appv[698] = 1462036481;
        iy.appv[699] = -1591155735;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int targetMask() {
        block110: {
            block109: {
                block108: {
                    block107: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("aqti", apqu(int ), (int)171)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v0 /* !! */  == iy.appw("aqtj", apqa(int ), (int)589)) break;
                            v0 /* !! */  = (long)iy.appw("aqtk", apqa(int ), (int)590);
                        }
                        var4_1 = iy.c;
                        v1 /* !! */  = iy.ci;
                        if (true) ** GOTO lbl12
                        block66: while (true) {
                            v1 /* !! */  = (long)(v2 - iy.appw("aqtl", apqu(int ), (int)172));
lbl12:
                            // 2 sources

                            switch ((int)v1 /* !! */ ) {
                                case -1671183739: {
                                    break block66;
                                }
                                case -822008120: {
                                    v2 = iy.appw("aqtm", apqu(int ), (int)173);
                                    continue block66;
                                }
                                case 1555122197: {
                                    v2 = iy.appw("aqtn", apqu(int ), (int)174);
                                    continue block66;
                                }
                            }
                            break;
                        }
                        var3_2 /* !! */  = iy.b;
                        v3 /* !! */  = iy.ci;
                        if (true) ** GOTO lbl26
                        block67: while (true) {
                            v3 /* !! */  = (long)(v4 - iy.appw("aqto", apqu(int ), (int)175));
lbl26:
                            // 2 sources

                            switch ((int)v3 /* !! */ ) {
                                case -1671183739: {
                                    break block67;
                                }
                                case -315192783: {
                                    v4 = iy.appw("aqtp", apqu(int ), (int)176);
                                    continue block67;
                                }
                                case -102411541: {
                                    v4 = iy.appw("aqtq", apqu(int ), (int)177);
                                    continue block67;
                                }
                            }
                            break;
                        }
                        var2_3 = iy.a;
                        if (var4_1) {
                            throw null;
lbl38:
                            // 17 sources

                            return (int)iy.appw("aqtr", apqa(int ), (int)591);
                        }
                        if (var2_3 || var2_3) ** GOTO lbl38
                        var1_4 /* !! */  = iy.appw("aqts", apqa(int ), (int)592);
                        if (var2_3 || var2_3) ** GOTO lbl38
                        v5 /* !! */  = iy.ci;
                        if (true) ** GOTO lbl47
                        block69: while (true) {
                            v5 /* !! */  = (long)(v6 - iy.appw("aqtt", apqu(int ), (int)178));
lbl47:
                            // 2 sources

                            switch ((int)v5 /* !! */ ) {
                                case -1932065405: {
                                    v6 = iy.appw("aqtu", apqu(int ), (int)179);
                                    continue block69;
                                }
                                case -1671183739: {
                                    break block69;
                                }
                                case 1087943472: {
                                    v6 = iy.appw("aqtv", apqu(int ), (int)180);
                                    continue block69;
                                }
                                case 1681183410: {
                                    v6 = iy.appw("aqtw", apqu(int ), (int)181);
                                    continue block69;
                                }
                            }
                            break;
                        }
                        v7 /* !! */  = iy.ci;
                        if (true) ** GOTO lbl63
                        block70: while (true) {
                            v7 /* !! */  = (long)(v8 - iy.appw("aqtx", apqu(int ), (int)182));
lbl63:
                            // 2 sources

                            switch ((int)v7 /* !! */ ) {
                                case -1671183739: {
                                    break block70;
                                }
                                case -942286589: {
                                    v8 = iy.appw("aqty", apqu(int ), (int)183);
                                    continue block70;
                                }
                                case -296575288: {
                                    v8 = iy.appw("aqtz", apqu(int ), (int)184);
                                    continue block70;
                                }
                                case 1523625171: {
                                    v8 = iy.appw("aqua", apqu(int ), (int)185);
                                    continue block70;
                                }
                            }
                            break;
                        }
                        if (!this.targets.isSelected("\u0421\u0443\u043d\u0434\u0443\u043a\u0438")) break block107;
                        if (var2_3) ** GOTO lbl38
                        var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | iy.appw("aqub", apqa(int ), (int)593));
                        if (var2_3) ** GOTO lbl38
                    }
                    if (var2_3 || var2_3) ** GOTO lbl38
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aquc", apqu(int ), (int)186)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == iy.appw("aqud", apqa(int ), (int)594)) break;
                        v9 /* !! */  = (long)iy.appw("aque", apqa(int ), (int)595);
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aquf", apqu(int ), (int)187)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v10 /* !! */  == iy.appw("aqug", apqa(int ), (int)596)) break;
                        v10 /* !! */  = (long)iy.appw("aquh", apqa(int ), (int)597);
                    }
                    if (!this.targets.isSelected("\u0428\u0430\u043b\u043a\u0435\u0440\u044b")) break block108;
                    if (var2_3) ** GOTO lbl38
                    var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | iy.appw("aqui", apqa(int ), (int)598));
                    if (var2_3) ** GOTO lbl38
                }
                if (var2_3 || var2_3) ** GOTO lbl38
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aquj", apqu(int ), (int)188)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == iy.appw("aquk", apqa(int ), (int)599)) break;
                    v11 /* !! */  = (long)iy.appw("aqul", apqa(int ), (int)600);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("aqum", apqu(int ), (int)189)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == iy.appw("aqun", apqa(int ), (int)601)) break;
                    v12 /* !! */  = (long)iy.appw("aquo", apqa(int ), (int)602);
                }
                if (!this.targets.isSelected("\u0417\u0435\u043b\u044c\u0435\u0432\u0430\u0440\u043a\u0438")) break block109;
                if (var2_3) ** GOTO lbl38
                var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | iy.appw("aqup", apqa(int ), (int)603));
                if (var2_3) ** GOTO lbl38
            }
            if (var2_3 || var2_3) ** GOTO lbl38
            v13 /* !! */  = iy.ci;
            if (true) ** GOTO lbl121
            block75: while (true) {
                v13 /* !! */  = (long)(iy.appw("aqur", apqu(int ), (int)191) - iy.appw("aquq", apqu(int ), (int)190));
lbl121:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1671183739: {
                        break block75;
                    }
                    case 8610081: {
                        continue block75;
                    }
                }
                break;
            }
            v14 /* !! */  = iy.ci;
            if (true) ** GOTO lbl130
            block76: while (true) {
                v14 /* !! */  = (long)(v15 - iy.appw("aqus", apqu(int ), (int)192));
lbl130:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1671183739: {
                        break block76;
                    }
                    case -1135661196: {
                        v15 = iy.appw("aqut", apqu(int ), (int)193);
                        continue block76;
                    }
                    case -786134146: {
                        v15 = iy.appw("aquu", apqu(int ), (int)194);
                        continue block76;
                    }
                    case -69348616: {
                        v15 = iy.appw("aquv", apqu(int ), (int)195);
                        continue block76;
                    }
                }
                break;
            }
            if (!this.targets.isSelected("\u0416\u0438\u0442\u0435\u043b\u0438")) break block110;
            if (var2_3) ** GOTO lbl38
            var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | iy.appw("aquw", apqa(int ), (int)604));
            if (var2_3) ** GOTO lbl38
        }
        if (var2_3 || var2_3) ** GOTO lbl38
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = iy.ci - iy.appw("aqux", apqu(int ), (int)196)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v16 /* !! */  == iy.appw("aquy", apqa(int ), (int)605)) break;
            v16 /* !! */  = (long)iy.appw("aquz", apqa(int ), (int)606);
        }
        v17 /* !! */  = iy.ci;
        if (true) ** GOTO lbl158
        block78: while (true) {
            v17 /* !! */  = (long)(v18 - iy.appw("aqva", apqu(int ), (int)197));
lbl158:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1671183739: {
                    break block78;
                }
                case -1603220965: {
                    v18 = iy.appw("aqvb", apqu(int ), (int)198);
                    continue block78;
                }
                case 1143644833: {
                    v18 = iy.appw("aqvc", apqu(int ), (int)199);
                    continue block78;
                }
            }
            break;
        }
        if (!this.targets.isSelected("\u0417\u043e\u043c\u0431\u0438-\u0436\u0438\u0442\u0435\u043b\u0438")) ** GOTO lbl174
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl38
                var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | iy.appw("aqvd", apqa(int ), (int)607));
                if (var2_3) ** GOTO lbl38
lbl174:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return (int)var1_4 /* !! */ ;
            }
            case 0: {
                var3_2 /* !! */  = (int)iy.appw("aqve", apqa(int ), (int)608);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl182:
            // 4 sources

            case 1: {
                var3_2 /* !! */  = (int)iy.appw("aqvf", apqa(int ), (int)609);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl187:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)iy.appw("aqvg", apqa(int ), (int)610);
                if (!var4_1) ** GOTO lbl182
                throw null;
            }
lbl191:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)iy.appw("aqvh", apqa(int ), (int)611);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 4: {
                var3_2 /* !! */  = (int)iy.appw("aqvi", apqa(int ), (int)612);
                if (var4_1) {
                    throw null;
                }
            }
            case 5: {
                var3_2 /* !! */  = (int)iy.appw("aqvj", apqa(int ), (int)613);
                if (var4_1) {
                    throw null;
                }
            }
            case 6: {
                var3_2 /* !! */  = (int)iy.appw("aqvk", apqa(int ), (int)614);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl209:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)iy.appw("aqvl", apqa(int ), (int)615);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl248
                    break;
                }
            }
            case 8: {
                var3_2 /* !! */  = (int)iy.appw("aqvm", apqa(int ), (int)616);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl220:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)iy.appw("aqvn", apqa(int ), (int)617);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 10: {
                var3_2 /* !! */  = (int)iy.appw("aqvo", apqa(int ), (int)618);
                if (!var4_1) ** GOTO lbl182
                throw null;
            }
lbl229:
            // 3 sources

            case 11: {
                var3_2 /* !! */  = (int)iy.appw("aqvp", apqa(int ), (int)619);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 12: {
                var3_2 /* !! */  = (int)iy.appw("aqvq", apqa(int ), (int)620);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 13: {
                var3_2 /* !! */  = (int)iy.appw("aqvr", apqa(int ), (int)621);
                if (!var4_1) ** GOTO lbl220
                throw null;
            }
lbl243:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)iy.appw("aqvs", apqa(int ), (int)622);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl248:
            // 4 sources

            case 15: {
                var3_2 /* !! */  = (int)iy.appw("aqvt", apqa(int ), (int)623);
                if (!var4_1) break;
                throw null;
            }
lbl252:
            // 4 sources

            case 16: {
                var3_2 /* !! */  = (int)iy.appw("aqvu", apqa(int ), (int)624);
                if (!var4_1) break;
                throw null;
            }
lbl256:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)iy.appw("aqvv", apqa(int ), (int)625);
                if (!var4_1) ** GOTO lbl191
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)iy.appw("aqvw", apqa(int ), (int)626);
                if (!var4_1) ** GOTO lbl248
                throw null;
            }
lbl264:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)iy.appw("aqvx", apqa(int ), (int)627);
                if (!var4_1) ** GOTO lbl220
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)iy.appw("aqvy", apqa(int ), (int)628);
                if (!var4_1) ** GOTO lbl209
                throw null;
            }
lbl272:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)iy.appw("aqvz", apqa(int ), (int)629);
                if (!var4_1) ** GOTO lbl182
                throw null;
            }
            case 22: {
                var3_2 /* !! */  = (int)iy.appw("aqwa", apqa(int ), (int)630);
                if (!var4_1) ** GOTO lbl243
                throw null;
            }
lbl280:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)iy.appw("aqwb", apqa(int ), (int)631);
                if (!var4_1) ** GOTO lbl187
                throw null;
            }
            case 24: {
                var3_2 /* !! */  = (int)iy.appw("aqwc", apqa(int ), (int)632);
                if (!var4_1) ** GOTO lbl256
                throw null;
            }
            case 25: 
        }
        var3_2 /* !! */  = (int)iy.appw("aqwd", apqa(int ), (int)633);
        ** while (!var4_1)
lbl291:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void area() {
        iy.appu[300] = 285307913;
        iy.appu[301] = 1911393602;
        iy.appu[302] = 1135698257;
        iy.appu[303] = -1992883753;
        iy.appu[304] = 1960066627;
        iy.appu[305] = 1573886977;
        iy.appu[306] = 1936214667;
        iy.appu[307] = -359512052;
        iy.appu[308] = 1999491913;
        iy.appu[309] = 1063433090;
        iy.appu[310] = 1153051558;
        iy.appu[311] = -1889159011;
        iy.appu[312] = 746732247;
        iy.appu[313] = 251471468;
        iy.appu[314] = -1104616356;
        iy.appu[315] = 567425088;
        iy.appu[316] = 637119953;
        iy.appu[317] = -1473416819;
        iy.appu[318] = -134751348;
        iy.appu[319] = -1236934244;
        iy.appu[320] = -381819326;
        iy.appu[321] = 1878672994;
        iy.appu[322] = 582745327;
        iy.appu[323] = 108994467;
        iy.appu[324] = -1194837263;
        iy.appu[325] = 613557979;
        iy.appu[326] = -1752175288;
        iy.appu[327] = -2106227851;
        iy.appu[328] = 294266963;
        iy.appu[329] = 1057512175;
        iy.appu[330] = -1399933865;
        iy.appu[331] = -45130413;
        iy.appu[332] = -977875504;
        iy.appu[333] = -49640282;
        iy.appu[334] = -1954420844;
        iy.appu[335] = -465782750;
        iy.appu[336] = 596825507;
        iy.appu[337] = -250060623;
        iy.appu[338] = -654452949;
        iy.appu[339] = 664503575;
        iy.appu[340] = -2123549645;
        iy.appu[341] = 1337339587;
        iy.appu[342] = -2063497122;
        iy.appu[343] = -1940951373;
        iy.appu[344] = 186912581;
        iy.appu[345] = 1110937866;
        iy.appu[346] = 177676417;
        iy.appu[347] = 609930674;
        iy.appu[348] = 917898177;
        iy.appu[349] = 1572036415;
        iy.appu[350] = 1685748198;
        iy.appu[351] = -1639943459;
        iy.appu[352] = -361587227;
        iy.appu[353] = 387568391;
        iy.appu[354] = -254097780;
        iy.appu[355] = -2114304046;
        iy.appu[356] = 1448019856;
        iy.appu[357] = 1553447333;
        iy.appu[358] = 496356162;
        iy.appu[359] = 1210106860;
        iy.appu[360] = -678072457;
        iy.appu[361] = 1736307618;
        iy.appu[362] = -1024709235;
        iy.appu[363] = -606790607;
        iy.appu[364] = 324937806;
        iy.appu[365] = 41376654;
        iy.appu[366] = 1816491069;
        iy.appu[367] = 1498674153;
        iy.appu[368] = 84292889;
        iy.appu[369] = -1122485559;
        iy.appu[370] = -486375182;
        iy.appu[371] = -1475805817;
        iy.appu[372] = 826287095;
        iy.appu[373] = -1044784011;
        iy.appu[374] = -1720384418;
        iy.appu[375] = -1396329539;
        iy.appu[376] = 1985546001;
        iy.appu[377] = 1944988195;
        iy.appu[378] = 1900229096;
        iy.appu[379] = -581144015;
        iy.appu[380] = -1273680004;
        iy.appu[381] = -1714698712;
        iy.appu[382] = 601778634;
        iy.appu[383] = -1151645001;
        iy.appu[384] = 982622145;
        iy.appu[385] = -1403830102;
        iy.appu[386] = 1795976746;
        iy.appu[387] = -349311582;
        iy.appu[388] = 1913093304;
        iy.appu[389] = -1392840725;
        iy.appu[390] = -908308600;
        iy.appu[391] = -2108043487;
        iy.appu[392] = -1139817028;
        iy.appu[393] = 1933781472;
        iy.appu[394] = -432043101;
        iy.appu[395] = 2098587678;
        iy.appu[396] = -904465447;
        iy.appu[397] = 185394934;
        iy.appu[398] = 1242762355;
        iy.appu[399] = -1011761959;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanBlockEntities(class_2818 var1_1, class_2338 var2_2, int var3_3, int var4_4) {
        v0 /* !! */  = iy.ci;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(iy.appw("apzn", apqu(int ), (int)31) - iy.appw("apzm", apqu(int ), (int)30));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1671183739: {
                    break block59;
                }
                case -1628315132: {
                    continue block59;
                }
            }
            break;
        }
        var11_5 = iy.c;
        v1 /* !! */  = iy.ci;
        if (true) ** GOTO lbl15
        block60: while (true) {
            v1 /* !! */  = (long)(v2 - iy.appw("apzo", apqu(int ), (int)32));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1671183739: {
                    break block60;
                }
                case -991759124: {
                    v2 = iy.appw("apzp", apqu(int ), (int)33);
                    continue block60;
                }
                case -428122633: {
                    v2 = iy.appw("apzq", apqu(int ), (int)34);
                    continue block60;
                }
            }
            break;
        }
        var10_6 /* !! */  = iy.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("apzr", apqu(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == iy.appw("apzs", apqa(int ), (int)215)) break;
            v3 /* !! */  = (long)iy.appw("apzt", apqa(int ), (int)216);
        }
        var9_7 = iy.a;
        if (var11_5) {
            throw null;
lbl33:
            // 12 sources

            return;
        }
        if (var9_7) ** GOTO lbl33
        if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_7) ** GOTO lbl33
                var5_8 = var3_3 * var3_3;
                if (var9_7 || var9_7) ** GOTO lbl33
                v4 /* !! */  = iy.ci;
                if (true) ** GOTO lbl46
                block63: while (true) {
                    v4 /* !! */  = (long)(v5 - iy.appw("apzu", apqu(int ), (int)36));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1671183739: {
                            break block63;
                        }
                        case -901120881: {
                            v5 = iy.appw("apzv", apqu(int ), (int)37);
                            continue block63;
                        }
                        case -733723102: {
                            v5 = iy.appw("apzw", apqu(int ), (int)38);
                            continue block63;
                        }
                        case 1078664065: {
                            v5 = iy.appw("apzx", apqu(int ), (int)39);
                            continue block63;
                        }
                    }
                    break;
                }
                v6 = var1_1.method_12214();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("apzy", apqu(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == iy.appw("apzz", apqa(int ), (int)217)) break;
                    v7 /* !! */  = (long)iy.appw("aqaa", apqa(int ), (int)218);
                }
                v8 = v6.values();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqab", apqu(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == iy.appw("aqac", apqa(int ), (int)219)) break;
                    v9 /* !! */  = (long)iy.appw("aqad", apqa(int ), (int)220);
                }
                var6_9 = v8.iterator();
                if (var9_7) ** GOTO lbl33
                do lbl-1000:
                // 3 sources

                {
                    if (var9_7 || var9_7) ** GOTO lbl33
                    v10 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl78
                    block67: while (true) {
                        v10 /* !! */  = (long)(v11 - iy.appw("aqae", apqu(int ), (int)42));
lbl78:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1671183739: {
                                break block67;
                            }
                            case -1616243950: {
                                v11 = iy.appw("aqaf", apqu(int ), (int)43);
                                continue block67;
                            }
                            case -469632691: {
                                v11 = iy.appw("aqag", apqu(int ), (int)44);
                                continue block67;
                            }
                        }
                        break;
                    }
                    if (!var6_9.hasNext()) ** GOTO lbl168
                    if (var9_7) ** GOTO lbl33
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqah", apqu(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == iy.appw("aqai", apqa(int ), (int)221)) break;
                        v12 /* !! */  = (long)iy.appw("aqaj", apqa(int ), (int)222);
                    }
                    var7_10 = (class_2586)var6_9.next();
                    if (var9_7 || var9_7) ** GOTO lbl33
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_4 = iy.ci - iy.appw("aqak", apqu(int ), (int)46)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == iy.appw("aqal", apqa(int ), (int)223)) break;
                        v13 /* !! */  = (long)iy.appw("aqam", apqa(int ), (int)224);
                    }
                    var8_11 = var7_10.method_11016();
                    if (var9_7 || var9_7) ** GOTO lbl33
                    v14 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl107
                    block70: while (true) {
                        v14 /* !! */  = (long)(iy.appw("aqao", apqu(int ), (int)48) - iy.appw("aqan", apqu(int ), (int)47));
lbl107:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1671183739: {
                                break block70;
                            }
                            case -881200579: {
                                continue block70;
                            }
                        }
                        break;
                    }
                    if (!(var8_11.method_10262((class_2382)var2_2) > (double)var5_8)) ** GOTO lbl116
                    if (var9_7) ** GOTO lbl33
                    if (!var11_5) ** GOTO lbl-1000
                    throw null;
lbl116:
                    // 1 sources

                    if (var9_7 || var9_7) ** GOTO lbl33
                    v15 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl121
                    block71: while (true) {
                        v15 /* !! */  = (long)(v16 - iy.appw("aqap", apqu(int ), (int)49));
lbl121:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -1791739142: {
                                v16 = iy.appw("aqaq", apqu(int ), (int)50);
                                continue block71;
                            }
                            case -1671183739: {
                                break block71;
                            }
                            case 376178857: {
                                v16 = iy.appw("aqar", apqu(int ), (int)51);
                                continue block71;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_5 = iy.ci - iy.appw("aqas", apqu(int ), (int)52)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == iy.appw("aqat", apqa(int ), (int)225)) break;
                        v17 /* !! */  = (long)iy.appw("aqau", apqa(int ), (int)226);
                    }
                    v18 = iy.mc.field_1687;
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_6 = iy.ci - iy.appw("aqav", apqu(int ), (int)53)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == iy.appw("aqaw", apqa(int ), (int)227)) break;
                        v19 /* !! */  = (long)iy.appw("aqax", apqa(int ), (int)228);
                    }
                    v20 = v18.method_8320(var8_11);
                    v21 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl146
                    block74: while (true) {
                        v21 /* !! */  = (long)(v22 - iy.appw("aqay", apqu(int ), (int)54));
lbl146:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1671183739: {
                                break block74;
                            }
                            case -1096453708: {
                                v22 = iy.appw("aqaz", apqu(int ), (int)55);
                                continue block74;
                            }
                            case -489351749: {
                                v22 = iy.appw("aqba", apqu(int ), (int)56);
                                continue block74;
                            }
                            case -266224899: {
                                v22 = iy.appw("aqbb", apqu(int ), (int)57);
                                continue block74;
                            }
                        }
                        break;
                    }
                    v23 = this.storageType(v20, var4_4);
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_7 = iy.ci - iy.appw("aqbc", apqu(int ), (int)58)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == iy.appw("aqbd", apqa(int ), (int)229)) break;
                        v24 /* !! */  = (long)iy.appw("aqbe", apqa(int ), (int)230);
                    }
                    this.addFound(var8_11, v23);
                    if (var9_7 || var9_7) ** GOTO lbl33
                } while (!var11_5);
                throw null;
lbl168:
                // 1 sources

                if (!var9_7 && !var9_7) ** break;
                ** continue;
                return;
            }
lbl171:
            // 3 sources

            case 0: {
                var10_6 /* !! */  = (int)iy.appw("aqbf", apqa(int ), (int)231);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl176:
            // 2 sources

            case 1: {
                var10_6 /* !! */  = (int)iy.appw("aqbg", apqa(int ), (int)232);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl181:
            // 3 sources

            case 2: {
                var10_6 /* !! */  = (int)iy.appw("aqbh", apqa(int ), (int)233);
                if (!var11_5) ** GOTO lbl176
                throw null;
            }
            case 3: {
                var10_6 /* !! */  = (int)iy.appw("aqbi", apqa(int ), (int)234);
                if (!var11_5) ** GOTO lbl171
                throw null;
            }
            case 4: {
                var10_6 /* !! */  = (int)iy.appw("aqbj", apqa(int ), (int)235);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 5: {
                var10_6 /* !! */  = (int)iy.appw("aqbk", apqa(int ), (int)236);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl199:
            // 2 sources

            case 6: {
                var10_6 /* !! */  = (int)iy.appw("aqbl", apqa(int ), (int)237);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl204:
            // 2 sources

            case 7: {
                var10_6 /* !! */  = (int)iy.appw("aqbm", apqa(int ), (int)238);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl209:
            // 3 sources

            case 8: {
                var10_6 /* !! */  = (int)iy.appw("aqbn", apqa(int ), (int)239);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl214:
            // 2 sources

            case 9: {
                var10_6 /* !! */  = (int)iy.appw("aqbo", apqa(int ), (int)240);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 10: {
                var10_6 /* !! */  = (int)iy.appw("aqbp", apqa(int ), (int)241);
                if (!var11_5) ** GOTO lbl181
                throw null;
            }
            case 11: {
                var10_6 /* !! */  = (int)iy.appw("aqbq", apqa(int ), (int)242);
                if (!var11_5) ** GOTO lbl199
                throw null;
            }
            case 12: {
                var10_6 /* !! */  = (int)iy.appw("aqbr", apqa(int ), (int)243);
                if (!var11_5) ** GOTO lbl204
                throw null;
            }
lbl231:
            // 2 sources

            case 13: {
                var10_6 /* !! */  = (int)iy.appw("aqbs", apqa(int ), (int)244);
                if (!var11_5) ** GOTO lbl209
                throw null;
            }
lbl235:
            // 2 sources

            case 14: {
                var10_6 /* !! */  = (int)iy.appw("aqbt", apqa(int ), (int)245);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl240:
            // 2 sources

            case 15: {
                var10_6 /* !! */  = (int)iy.appw("aqbu", apqa(int ), (int)246);
                if (!var11_5) ** GOTO lbl171
                throw null;
            }
lbl244:
            // 2 sources

            case 16: {
                var10_6 /* !! */  = (int)iy.appw("aqbv", apqa(int ), (int)247);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl249:
            // 2 sources

            case 17: {
                var10_6 /* !! */  = (int)iy.appw("aqbw", apqa(int ), (int)248);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl254:
            // 4 sources

            case 18: {
                var10_6 /* !! */  = (int)iy.appw("aqbx", apqa(int ), (int)249);
                if (!var11_5) ** GOTO lbl249
                throw null;
            }
lbl258:
            // 4 sources

            case 19: {
                var10_6 /* !! */  = (int)iy.appw("aqby", apqa(int ), (int)250);
                if (!var11_5) ** GOTO lbl181
                throw null;
            }
            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_6 /* !! */  = (int)iy.appw("aqbz", apqa(int ), (int)251);
                    if (!var11_5) ** GOTO lbl258
                    throw null;
                }
            }
            case 21: 
        }
        var10_6 /* !! */  = (int)iy.appw("aqca", apqa(int ), (int)252);
        ** while (!var11_5)
lbl270:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanNearbyChunks(int var1_1, int var2_2) {
        var16_3 = iy.c;
        var15_4 /* !! */  = iy.b;
        var14_5 = iy.a;
        if (var16_3) {
            throw null;
lbl6:
            // 52 sources

            return;
        }
        if (var14_5 || var14_5) ** GOTO lbl6
        var3_6 = iy.mc.field_1724.method_24515();
        if (var14_5 || var14_5) ** GOTO lbl6
        var4_7 = var3_6.method_10263() >> iy.appw("apvn", apqa(int ), (int)112);
        if (var14_5 || var14_5) ** GOTO lbl6
        var5_8 = var3_6.method_10260() >> iy.appw("apvo", apqa(int ), (int)113);
        if (var14_5 || var14_5) ** GOTO lbl6
        var6_9 = (var1_1 >> iy.appw("apvp", apqa(int ), (int)114)) + iy.appw("apvq", apqa(int ), (int)115);
        if (var14_5 || var14_5) ** GOTO lbl6
        var7_10 = this.candidateBuffer;
        if (var14_5 || var14_5) ** GOTO lbl6
        var7_10.clear();
        if (var14_5 || var14_5) ** GOTO lbl6
        var8_11 /* !! */  = -var6_9;
        if (var14_5) ** GOTO lbl6
        block98: while (true) {
            if (var14_5 || var14_5) ** GOTO lbl6
            if (var8_11 /* !! */  > var6_9) ** GOTO lbl55
            if (var14_5 || var14_5) ** GOTO lbl6
            var9_12 = -var6_9;
            if (var14_5) ** GOTO lbl6
            block99: while (true) {
                block187: {
                    if (var14_5 || var14_5) ** GOTO lbl6
                    if (var9_12 > var6_9) ** GOTO lbl50
                    if (var14_5 || var14_5) ** GOTO lbl6
                    var10_15 = new class_1923(var4_7 + var8_11 /* !! */ , var5_8 + var9_12);
                    if (var14_5 || var14_5) ** GOTO lbl6
                    if (this.scannedChunks.contains(var10_15)) break block187;
                    if (var14_5) ** GOTO lbl6
                    var7_10.add((class_1923)var10_15);
                    if (var14_5) ** GOTO lbl6
                }
                if (var14_5) ** GOTO lbl6
                if (var15_4 /* !! */  == 0) ** GOTO lbl-1000
                switch (var15_4 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var14_5) ** GOTO lbl6
                        ++var9_12;
                        if (var14_5) ** GOTO lbl6
                        if (!var16_3) continue block99;
                        throw null;
                    }
lbl50:
                    // 1 sources

                    if (var14_5 || var14_5) ** GOTO lbl6
                    ++var8_11 /* !! */ ;
                    if (var14_5) ** GOTO lbl6
                    if (!var16_3) continue block98;
                    throw null;
lbl55:
                    // 1 sources

                    if (var14_5 || var14_5) ** GOTO lbl6
                    var7_10.sort(Comparator.comparingLong((ToLongFunction<class_1923>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)J, lambda$scanNearbyChunks$0(int int net.minecraft.class_1923 ), (Lnet/minecraft/class_1923;)J)((iy)this, (int)var4_7, (int)var5_8)));
                    if (var14_5 || var14_5) ** GOTO lbl6
                    var8_11 /* !! */  = (int)iy.appw("apvr", apqa(int ), (int)116);
                    if (var14_5 || var14_5) ** GOTO lbl6
                    var9_13 = var7_10.iterator();
                    if (var14_5) ** GOTO lbl6
                    do {
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (!var9_13.hasNext()) ** GOTO lbl85
                        if (var14_5) ** GOTO lbl6
                        var10_15 = var9_13.next();
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (var8_11 /* !! */  < iy.appw("apvs", apqa(int ), (int)117)) ** GOTO lbl73
                        if (var14_5) ** GOTO lbl6
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl85
lbl73:
                        // 1 sources

                        if (var14_5 || var14_5) ** GOTO lbl6
                        var11_16 = new class_2338(var10_15.method_33940(), var3_6.method_10264(), var10_15.method_33942());
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (!iy.mc.field_1687.method_22340(var11_16)) ** GOTO lbl80
                        if (var14_5 || var14_5) ** GOTO lbl6
                        this.scanBlockEntities(iy.mc.field_1687.method_8497(var10_15.field_9181, var10_15.field_9180), var3_6, var1_1, var2_2);
                        if (var14_5) ** GOTO lbl6
lbl80:
                        // 2 sources

                        if (var14_5 || var14_5) ** GOTO lbl6
                        ++var8_11 /* !! */ ;
                        if (var14_5 || var14_5) ** GOTO lbl6
                    } while (!var16_3);
                    throw null;
lbl85:
                    // 2 sources

                    if (var14_5 || var14_5) ** GOTO lbl6
                    var9_14 = iy.appw("apvt", apqa(int ), (int)118);
                    if (var14_5 || var14_5) ** GOTO lbl6
                    var10_15 = var7_10.iterator();
                    if (var14_5) ** GOTO lbl6
                    do lbl-1000:
                    // 3 sources

                    {
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (!var10_15.hasNext()) ** GOTO lbl122
                        if (var14_5) ** GOTO lbl6
                        var11_16 = (class_1923)var10_15.next();
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (var9_14 < iy.appw("apvu", apqa(int ), (int)119)) ** GOTO lbl101
                        if (var14_5) ** GOTO lbl6
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl122
lbl101:
                        // 1 sources

                        if (var14_5 || var14_5) ** GOTO lbl6
                        var12_17 = new class_2338(var11_16.method_33940(), var3_6.method_10264(), var11_16.method_33942());
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (iy.mc.field_1687.method_22340(var12_17)) ** GOTO lbl110
                        if (var14_5 || var14_5) ** GOTO lbl6
                        ++var9_14;
                        if (var14_5 || var14_5) ** GOTO lbl6
                        if (!var16_3) ** GOTO lbl-1000
                        throw null;
lbl110:
                        // 1 sources

                        if (var14_5 || var14_5) ** GOTO lbl6
                        var13_18 = iy.mc.field_1687.method_8497(var11_16.field_9181, var11_16.field_9180);
                        if (var14_5 || var14_5) ** GOTO lbl6
                        this.scanBlocks(var13_18, var3_6, var1_1, var2_2);
                        if (var14_5 || var14_5) ** GOTO lbl6
                        this.scannedChunks.add((class_1923)var11_16);
                        if (var14_5 || var14_5) ** GOTO lbl6
                        ++var9_14;
                        if (var14_5 || var14_5) ** GOTO lbl6
                    } while (!var16_3);
                    throw null;
lbl122:
                    // 2 sources

                    if (!var14_5 && !var14_5) ** break;
                    ** continue;
                    return;
lbl125:
                    // 2 sources

                    case 0: {
                        var15_4 /* !! */  = (int)iy.appw("apvv", apqa(int ), (int)120);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl538
                    }
lbl130:
                    // 2 sources

                    case 1: {
                        var15_4 /* !! */  = (int)iy.appw("apvw", apqa(int ), (int)121);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl371
                    }
                    case 2: {
                        var15_4 /* !! */  = (int)iy.appw("apvx", apqa(int ), (int)122);
                        if (var16_3) {
                            throw null;
                        }
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var15_4 /* !! */  = (int)iy.appw("apvy", apqa(int ), (int)123);
                            if (var16_3) {
                                throw null;
                            }
                            ** GOTO lbl217
                            break;
                        }
                    }
lbl145:
                    // 2 sources

                    case 4: {
                        var15_4 /* !! */  = (int)iy.appw("apvz", apqa(int ), (int)124);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl283
                    }
lbl150:
                    // 3 sources

                    case 5: {
                        var15_4 /* !! */  = (int)iy.appw("apwa", apqa(int ), (int)125);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl227
                    }
lbl155:
                    // 2 sources

                    case 6: {
                        var15_4 /* !! */  = (int)iy.appw("apwb", apqa(int ), (int)126);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl270
                    }
lbl160:
                    // 2 sources

                    case 7: {
                        var15_4 /* !! */  = (int)iy.appw("apwc", apqa(int ), (int)127);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl424
                    }
                    case 8: {
                        var15_4 /* !! */  = (int)iy.appw("apwd", apqa(int ), (int)128);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl237
                    }
                    case 9: {
                        var15_4 /* !! */  = (int)iy.appw("apwe", apqa(int ), (int)129);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl498
                    }
lbl175:
                    // 2 sources

                    case 10: {
                        var15_4 /* !! */  = (int)iy.appw("apwf", apqa(int ), (int)130);
                        if (!var16_3) ** GOTO lbl125
                        throw null;
                    }
                    case 11: {
                        var15_4 /* !! */  = (int)iy.appw("apwg", apqa(int ), (int)131);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl538
                    }
lbl184:
                    // 2 sources

                    case 12: {
                        var15_4 /* !! */  = (int)iy.appw("apwh", apqa(int ), (int)132);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl498
                    }
                    case 13: {
                        var15_4 /* !! */  = (int)iy.appw("apwi", apqa(int ), (int)133);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl429
                    }
                    case 14: {
                        var15_4 /* !! */  = (int)iy.appw("apwj", apqa(int ), (int)134);
                        if (!var16_3) ** GOTO lbl155
                        throw null;
                    }
                    case 15: {
                        var15_4 /* !! */  = (int)iy.appw("apwk", apqa(int ), (int)135);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl478
                    }
lbl203:
                    // 3 sources

                    case 16: {
                        var15_4 /* !! */  = (int)iy.appw("apwl", apqa(int ), (int)136);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl325
                    }
lbl208:
                    // 5 sources

                    case 17: {
                        var15_4 /* !! */  = (int)iy.appw("apwm", apqa(int ), (int)137);
                        if (!var16_3) ** GOTO lbl203
                        throw null;
                    }
lbl212:
                    // 3 sources

                    case 18: {
                        var15_4 /* !! */  = (int)iy.appw("apwn", apqa(int ), (int)138);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl510
                    }
lbl217:
                    // 2 sources

                    case 19: {
                        var15_4 /* !! */  = (int)iy.appw("apwo", apqa(int ), (int)139);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl301
                    }
lbl222:
                    // 2 sources

                    case 20: {
                        var15_4 /* !! */  = (int)iy.appw("apwp", apqa(int ), (int)140);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl514
                    }
lbl227:
                    // 3 sources

                    case 21: {
                        var15_4 /* !! */  = (int)iy.appw("apwq", apqa(int ), (int)141);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl506
                    }
                    case 22: {
                        var15_4 /* !! */  = (int)iy.appw("apwr", apqa(int ), (int)142);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl502
                    }
lbl237:
                    // 3 sources

                    case 23: {
                        var15_4 /* !! */  = (int)iy.appw("apws", apqa(int ), (int)143);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl526
                    }
                    case 24: {
                        var15_4 /* !! */  = (int)iy.appw("apwt", apqa(int ), (int)144);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl486
                    }
lbl247:
                    // 3 sources

                    case 25: {
                        var15_4 /* !! */  = (int)iy.appw("apwu", apqa(int ), (int)145);
                        if (!var16_3) ** GOTO lbl160
                        throw null;
                    }
                    case 26: {
                        var15_4 /* !! */  = (int)iy.appw("apwv", apqa(int ), (int)146);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl429
                    }
lbl256:
                    // 2 sources

                    case 27: {
                        var15_4 /* !! */  = (int)iy.appw("apww", apqa(int ), (int)147);
                        if (!var16_3) ** GOTO lbl237
                        throw null;
                    }
                    case 28: {
                        var15_4 /* !! */  = (int)iy.appw("apwx", apqa(int ), (int)148);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl526
                    }
                    case 29: {
                        var15_4 /* !! */  = (int)iy.appw("apwy", apqa(int ), (int)149);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl397
                    }
lbl270:
                    // 2 sources

                    case 30: {
                        var15_4 /* !! */  = (int)iy.appw("apwz", apqa(int ), (int)150);
                        if (!var16_3) ** GOTO lbl175
                        throw null;
                    }
lbl274:
                    // 2 sources

                    case 31: {
                        var15_4 /* !! */  = (int)iy.appw("apxa", apqa(int ), (int)151);
                        if (!var16_3) ** GOTO lbl130
                        throw null;
                    }
                    case 32: {
                        var15_4 /* !! */  = (int)iy.appw("apxb", apqa(int ), (int)152);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl437
                    }
lbl283:
                    // 2 sources

                    case 33: {
                        var15_4 /* !! */  = (int)iy.appw("apxc", apqa(int ), (int)153);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl393
                    }
lbl288:
                    // 4 sources

                    case 34: {
                        var15_4 /* !! */  = (int)iy.appw("apxd", apqa(int ), (int)154);
                        if (!var16_3) break block98;
                        throw null;
                    }
                    case 35: {
                        var15_4 /* !! */  = (int)iy.appw("apxe", apqa(int ), (int)155);
                        if (!var16_3) ** GOTO lbl212
                        throw null;
                    }
lbl296:
                    // 3 sources

                    case 36: {
                        var15_4 /* !! */  = (int)iy.appw("apxf", apqa(int ), (int)156);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl482
                    }
lbl301:
                    // 3 sources

                    case 37: {
                        var15_4 /* !! */  = (int)iy.appw("apxg", apqa(int ), (int)157);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl363
                    }
                    case 38: {
                        var15_4 /* !! */  = (int)iy.appw("apxh", apqa(int ), (int)158);
                        if (!var16_3) ** GOTO lbl227
                        throw null;
                    }
                    case 39: {
                        var15_4 /* !! */  = (int)iy.appw("apxi", apqa(int ), (int)159);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl478
                    }
lbl315:
                    // 2 sources

                    case 40: {
                        var15_4 /* !! */  = (int)iy.appw("apxj", apqa(int ), (int)160);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl526
                    }
                    case 41: {
                        var15_4 /* !! */  = (int)iy.appw("apxk", apqa(int ), (int)161);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl445
                    }
lbl325:
                    // 2 sources

                    case 42: {
                        var15_4 /* !! */  = (int)iy.appw("apxl", apqa(int ), (int)162);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl490
                    }
                    case 43: {
                        var15_4 /* !! */  = (int)iy.appw("apxm", apqa(int ), (int)163);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl414
                    }
lbl335:
                    // 2 sources

                    case 44: {
                        var15_4 /* !! */  = (int)iy.appw("apxn", apqa(int ), (int)164);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl389
                    }
lbl340:
                    // 2 sources

                    case 45: {
                        var15_4 /* !! */  = (int)iy.appw("apxo", apqa(int ), (int)165);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl465
                    }
lbl345:
                    // 3 sources

                    case 46: {
                        var15_4 /* !! */  = (int)iy.appw("apxp", apqa(int ), (int)166);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl457
                    }
                    case 47: {
                        var15_4 /* !! */  = (int)iy.appw("apxq", apqa(int ), (int)167);
                        if (!var16_3) ** GOTO lbl345
                        throw null;
                    }
lbl354:
                    // 2 sources

                    case 48: {
                        var15_4 /* !! */  = (int)iy.appw("apxr", apqa(int ), (int)168);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl469
                    }
lbl359:
                    // 2 sources

                    case 49: {
                        var15_4 /* !! */  = (int)iy.appw("apxs", apqa(int ), (int)169);
                        if (!var16_3) ** GOTO lbl212
                        throw null;
                    }
lbl363:
                    // 2 sources

                    case 50: {
                        var15_4 /* !! */  = (int)iy.appw("apxt", apqa(int ), (int)170);
                        if (!var16_3) ** GOTO lbl208
                        throw null;
                    }
lbl367:
                    // 2 sources

                    case 51: {
                        var15_4 /* !! */  = (int)iy.appw("apxu", apqa(int ), (int)171);
                        if (!var16_3) ** GOTO lbl203
                        throw null;
                    }
lbl371:
                    // 3 sources

                    case 52: {
                        var15_4 /* !! */  = (int)iy.appw("apxv", apqa(int ), (int)172);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl514
                    }
lbl376:
                    // 2 sources

                    case 53: {
                        var15_4 /* !! */  = (int)iy.appw("apxw", apqa(int ), (int)173);
                        if (!var16_3) ** GOTO lbl288
                        throw null;
                    }
lbl380:
                    // 2 sources

                    case 54: {
                        var15_4 /* !! */  = (int)iy.appw("apxx", apqa(int ), (int)174);
                        if (!var16_3) ** GOTO lbl301
                        throw null;
                    }
lbl384:
                    // 2 sources

                    case 55: {
                        var15_4 /* !! */  = (int)iy.appw("apxy", apqa(int ), (int)175);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl410
                    }
lbl389:
                    // 2 sources

                    case 56: {
                        var15_4 /* !! */  = (int)iy.appw("apxz", apqa(int ), (int)176);
                        if (!var16_3) ** GOTO lbl340
                        throw null;
                    }
lbl393:
                    // 2 sources

                    case 57: {
                        var15_4 /* !! */  = (int)iy.appw("apya", apqa(int ), (int)177);
                        if (!var16_3) ** GOTO lbl150
                        throw null;
                    }
lbl397:
                    // 2 sources

                    case 58: {
                        var15_4 /* !! */  = (int)iy.appw("apyb", apqa(int ), (int)178);
                        if (!var16_3) ** GOTO lbl384
                        throw null;
                    }
                    case 59: {
                        do {
                            var15_4 /* !! */  = (int)iy.appw("apyc", apqa(int ), (int)179);
                        } while (!var16_3);
                        throw null;
                    }
lbl406:
                    // 2 sources

                    case 60: {
                        var15_4 /* !! */  = (int)iy.appw("apyd", apqa(int ), (int)180);
                        if (!var16_3) ** GOTO lbl150
                        throw null;
                    }
lbl410:
                    // 2 sources

                    case 61: {
                        var15_4 /* !! */  = (int)iy.appw("apye", apqa(int ), (int)181);
                        if (!var16_3) ** GOTO lbl256
                        throw null;
                    }
lbl414:
                    // 2 sources

                    case 62: {
                        var15_4 /* !! */  = (int)iy.appw("apyf", apqa(int ), (int)182);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl437
                    }
                    case 63: {
                        var15_4 /* !! */  = (int)iy.appw("apyg", apqa(int ), (int)183);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl522
                    }
lbl424:
                    // 2 sources

                    case 64: {
                        do {
                            var15_4 /* !! */  = (int)iy.appw("apyh", apqa(int ), (int)184);
                        } while (!var16_3);
                        throw null;
                    }
lbl429:
                    // 4 sources

                    case 65: {
                        var15_4 /* !! */  = (int)iy.appw("apyi", apqa(int ), (int)185);
                        if (!var16_3) ** GOTO lbl274
                        throw null;
                    }
lbl433:
                    // 2 sources

                    case 66: {
                        var15_4 /* !! */  = (int)iy.appw("apyj", apqa(int ), (int)186);
                        if (!var16_3) ** GOTO lbl315
                        throw null;
                    }
lbl437:
                    // 3 sources

                    case 67: {
                        var15_4 /* !! */  = (int)iy.appw("apyk", apqa(int ), (int)187);
                        if (!var16_3) ** GOTO lbl429
                        throw null;
                    }
                    case 68: {
                        var15_4 /* !! */  = (int)iy.appw("apyl", apqa(int ), (int)188);
                        if (!var16_3) ** GOTO lbl288
                        throw null;
                    }
lbl445:
                    // 2 sources

                    case 69: {
                        var15_4 /* !! */  = (int)iy.appw("apym", apqa(int ), (int)189);
                        if (!var16_3) ** GOTO lbl376
                        throw null;
                    }
lbl449:
                    // 3 sources

                    case 70: {
                        var15_4 /* !! */  = (int)iy.appw("apyn", apqa(int ), (int)190);
                        if (!var16_3) ** GOTO lbl354
                        throw null;
                    }
                    case 71: {
                        var15_4 /* !! */  = (int)iy.appw("apyo", apqa(int ), (int)191);
                        if (!var16_3) ** GOTO lbl296
                        throw null;
                    }
lbl457:
                    // 2 sources

                    case 72: {
                        var15_4 /* !! */  = (int)iy.appw("apyp", apqa(int ), (int)192);
                        if (!var16_3) ** GOTO lbl208
                        throw null;
                    }
                    case 73: {
                        var15_4 /* !! */  = (int)iy.appw("apyq", apqa(int ), (int)193);
                        if (!var16_3) ** GOTO lbl433
                        throw null;
                    }
lbl465:
                    // 2 sources

                    case 74: {
                        var15_4 /* !! */  = (int)iy.appw("apyr", apqa(int ), (int)194);
                        if (!var16_3) ** GOTO lbl335
                        throw null;
                    }
lbl469:
                    // 2 sources

                    case 75: {
                        var15_4 /* !! */  = (int)iy.appw("apys", apqa(int ), (int)195);
                        if (!var16_3) ** GOTO lbl247
                        throw null;
                    }
                    case 76: {
                        var15_4 /* !! */  = (int)iy.appw("apyt", apqa(int ), (int)196);
                        if (var16_3) {
                            throw null;
                        }
                        ** GOTO lbl518
                    }
lbl478:
                    // 3 sources

                    case 77: {
                        var15_4 /* !! */  = (int)iy.appw("apyu", apqa(int ), (int)197);
                        if (!var16_3) ** GOTO lbl247
                        throw null;
                    }
lbl482:
                    // 2 sources

                    case 78: {
                        var15_4 /* !! */  = (int)iy.appw("apyv", apqa(int ), (int)198);
                        if (!var16_3) ** GOTO lbl145
                        throw null;
                    }
lbl486:
                    // 2 sources

                    case 79: {
                        var15_4 /* !! */  = (int)iy.appw("apyw", apqa(int ), (int)199);
                        if (!var16_3) ** GOTO lbl449
                        throw null;
                    }
lbl490:
                    // 2 sources

                    case 80: {
                        var15_4 /* !! */  = (int)iy.appw("apyx", apqa(int ), (int)200);
                        if (!var16_3) ** GOTO lbl449
                        throw null;
                    }
                    case 81: {
                        var15_4 /* !! */  = (int)iy.appw("apyy", apqa(int ), (int)201);
                        if (!var16_3) ** GOTO lbl208
                        throw null;
                    }
lbl498:
                    // 3 sources

                    case 82: {
                        var15_4 /* !! */  = (int)iy.appw("apyz", apqa(int ), (int)202);
                        if (!var16_3) ** GOTO lbl371
                        throw null;
                    }
lbl502:
                    // 2 sources

                    case 83: {
                        var15_4 /* !! */  = (int)iy.appw("apza", apqa(int ), (int)203);
                        if (!var16_3) ** GOTO lbl367
                        throw null;
                    }
lbl506:
                    // 3 sources

                    case 84: {
                        var15_4 /* !! */  = (int)iy.appw("apzb", apqa(int ), (int)204);
                        if (!var16_3) ** GOTO lbl222
                        throw null;
                    }
lbl510:
                    // 2 sources

                    case 85: {
                        var15_4 /* !! */  = (int)iy.appw("apzc", apqa(int ), (int)205);
                        if (!var16_3) ** GOTO lbl296
                        throw null;
                    }
lbl514:
                    // 3 sources

                    case 86: {
                        var15_4 /* !! */  = (int)iy.appw("apzd", apqa(int ), (int)206);
                        if (!var16_3) ** GOTO lbl288
                        throw null;
                    }
lbl518:
                    // 2 sources

                    case 87: {
                        var15_4 /* !! */  = (int)iy.appw("apze", apqa(int ), (int)207);
                        if (!var16_3) ** GOTO lbl345
                        throw null;
                    }
lbl522:
                    // 2 sources

                    case 88: {
                        var15_4 /* !! */  = (int)iy.appw("apzf", apqa(int ), (int)208);
                        if (!var16_3) ** GOTO lbl380
                        throw null;
                    }
lbl526:
                    // 4 sources

                    case 89: {
                        var15_4 /* !! */  = (int)iy.appw("apzg", apqa(int ), (int)209);
                        if (!var16_3) ** GOTO lbl406
                        throw null;
                    }
                    case 90: {
                        var15_4 /* !! */  = (int)iy.appw("apzh", apqa(int ), (int)210);
                        if (!var16_3) ** GOTO lbl359
                        throw null;
                    }
                    case 91: {
                        var15_4 /* !! */  = (int)iy.appw("apzi", apqa(int ), (int)211);
                        if (!var16_3) ** GOTO lbl506
                        throw null;
                    }
lbl538:
                    // 3 sources

                    case 92: {
                        var15_4 /* !! */  = (int)iy.appw("apzj", apqa(int ), (int)212);
                        if (!var16_3) ** GOTO lbl184
                        throw null;
                    }
                    case 93: {
                        var15_4 /* !! */  = (int)iy.appw("apzk", apqa(int ), (int)213);
                        if (!var16_3) ** GOTO lbl208
                        throw null;
                    }
                    case 94: 
                }
                break;
            }
            break;
        }
        var15_4 /* !! */  = (int)iy.appw("apzl", apqa(int ), (int)214);
        ** while (!var16_3)
lbl549:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite appw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void arek() {
        iy.appv[500] = -921234735;
        iy.appv[501] = 2064446546;
        iy.appv[502] = 864252366;
        iy.appv[503] = -75687917;
        iy.appv[504] = 879861779;
        iy.appv[505] = -371737496;
        iy.appv[506] = -1069195860;
        iy.appv[507] = 853659471;
        iy.appv[508] = -825089131;
        iy.appv[509] = 1133920792;
        iy.appv[510] = -325907787;
        iy.appv[511] = -395437372;
        iy.appv[512] = -70614589;
        iy.appv[513] = 660167403;
        iy.appv[514] = 1135268122;
        iy.appv[515] = -1728675196;
        iy.appv[516] = -1241098566;
        iy.appv[517] = -1343283391;
        iy.appv[518] = 935092753;
        iy.appv[519] = -899404447;
        iy.appv[520] = 832632383;
        iy.appv[521] = -2081659138;
        iy.appv[522] = -777272430;
        iy.appv[523] = 1053523835;
        iy.appv[524] = -624496182;
        iy.appv[525] = 1968618477;
        iy.appv[526] = 521012263;
        iy.appv[527] = 1389189528;
        iy.appv[528] = 1863539147;
        iy.appv[529] = 1399136892;
        iy.appv[530] = 1868198861;
        iy.appv[531] = 589000992;
        iy.appv[532] = -1946482820;
        iy.appv[533] = 1565197204;
        iy.appv[534] = 1224052025;
        iy.appv[535] = 1925815397;
        iy.appv[536] = -762855159;
        iy.appv[537] = -37197990;
        iy.appv[538] = 222521051;
        iy.appv[539] = -821010227;
        iy.appv[540] = 275899370;
        iy.appv[541] = -196630674;
        iy.appv[542] = 340329124;
        iy.appv[543] = -135840782;
        iy.appv[544] = -1418925821;
        iy.appv[545] = 205509983;
        iy.appv[546] = 1946959359;
        iy.appv[547] = -704807645;
        iy.appv[548] = 895673410;
        iy.appv[549] = -677570447;
        iy.appv[550] = -841278467;
        iy.appv[551] = -11885403;
        iy.appv[552] = -364223180;
        iy.appv[553] = 1736314845;
        iy.appv[554] = -1215493187;
        iy.appv[555] = 513942799;
        iy.appv[556] = -2106149945;
        iy.appv[557] = -1744818497;
        iy.appv[558] = 545607414;
        iy.appv[559] = -379794501;
        iy.appv[560] = -1589217981;
        iy.appv[561] = 9872270;
        iy.appv[562] = -55705011;
        iy.appv[563] = -81345403;
        iy.appv[564] = -202547521;
        iy.appv[565] = 1630505853;
        iy.appv[566] = 1555704262;
        iy.appv[567] = -1995592330;
        iy.appv[568] = 227757626;
        iy.appv[569] = -1342234243;
        iy.appv[570] = 1110637602;
        iy.appv[571] = 835218682;
        iy.appv[572] = 996587920;
        iy.appv[573] = 477872230;
        iy.appv[574] = 1053523624;
        iy.appv[575] = 968544195;
        iy.appv[576] = -2147171038;
        iy.appv[577] = -1537712378;
        iy.appv[578] = 2104433380;
        iy.appv[579] = -1114573621;
        iy.appv[580] = 1677355569;
        iy.appv[581] = 1153091582;
        iy.appv[582] = 880444162;
        iy.appv[583] = 911874703;
        iy.appv[584] = 1368995004;
        iy.appv[585] = 748761825;
        iy.appv[586] = -2003854999;
        iy.appv[587] = -391622728;
        iy.appv[588] = -1721595618;
        iy.appv[589] = -965901857;
        iy.appv[590] = -552155993;
        iy.appv[591] = 877754217;
        iy.appv[592] = -2082429326;
        iy.appv[593] = 181391133;
        iy.appv[594] = 1712059847;
        iy.appv[595] = 1671824496;
        iy.appv[596] = -1470484723;
        iy.appv[597] = -996563318;
        iy.appv[598] = 1705660220;
        iy.appv[599] = -1056207737;
    }

    private static /* synthetic */ void arej() {
        iy.appv[400] = -141211062;
        iy.appv[401] = -7794124;
        iy.appv[402] = 1458241955;
        iy.appv[403] = -917141886;
        iy.appv[404] = -895880682;
        iy.appv[405] = 1597442220;
        iy.appv[406] = -1515207843;
        iy.appv[407] = -1042307038;
        iy.appv[408] = 260321796;
        iy.appv[409] = -1211298680;
        iy.appv[410] = -783731629;
        iy.appv[411] = 1111610113;
        iy.appv[412] = 648501354;
        iy.appv[413] = 357413278;
        iy.appv[414] = 1568233422;
        iy.appv[415] = 134380455;
        iy.appv[416] = -246732300;
        iy.appv[417] = 1379501456;
        iy.appv[418] = -1881272687;
        iy.appv[419] = -1213364768;
        iy.appv[420] = 1346628023;
        iy.appv[421] = 1610381391;
        iy.appv[422] = 1679634185;
        iy.appv[423] = -649508124;
        iy.appv[424] = 1958571202;
        iy.appv[425] = -1734699697;
        iy.appv[426] = -279287190;
        iy.appv[427] = -1385842430;
        iy.appv[428] = 1026098509;
        iy.appv[429] = 1737999761;
        iy.appv[430] = -1457548572;
        iy.appv[431] = -1573273224;
        iy.appv[432] = -1764815659;
        iy.appv[433] = -829253214;
        iy.appv[434] = 1754397847;
        iy.appv[435] = -1051949734;
        iy.appv[436] = 611094671;
        iy.appv[437] = 1885115617;
        iy.appv[438] = -292261206;
        iy.appv[439] = 644476986;
        iy.appv[440] = 641064260;
        iy.appv[441] = 232167259;
        iy.appv[442] = 1336273996;
        iy.appv[443] = -1267466979;
        iy.appv[444] = 1167961101;
        iy.appv[445] = -1549780823;
        iy.appv[446] = -1068319734;
        iy.appv[447] = 1267291449;
        iy.appv[448] = -1424305216;
        iy.appv[449] = 2074250836;
        iy.appv[450] = 1471733855;
        iy.appv[451] = 472946431;
        iy.appv[452] = 957554087;
        iy.appv[453] = 1813410932;
        iy.appv[454] = -1180153455;
        iy.appv[455] = 1296206171;
        iy.appv[456] = -716033677;
        iy.appv[457] = 336870554;
        iy.appv[458] = -383702854;
        iy.appv[459] = 1429061433;
        iy.appv[460] = 1701760112;
        iy.appv[461] = 1043654383;
        iy.appv[462] = 92249124;
        iy.appv[463] = 2010279755;
        iy.appv[464] = -907036679;
        iy.appv[465] = -810858083;
        iy.appv[466] = -1178252070;
        iy.appv[467] = -388135927;
        iy.appv[468] = -1960496339;
        iy.appv[469] = 1069402733;
        iy.appv[470] = -748236421;
        iy.appv[471] = 2071341049;
        iy.appv[472] = -658324510;
        iy.appv[473] = -688943440;
        iy.appv[474] = 101444177;
        iy.appv[475] = 1803637296;
        iy.appv[476] = -309288231;
        iy.appv[477] = 1622295907;
        iy.appv[478] = -519116127;
        iy.appv[479] = 1324554007;
        iy.appv[480] = 1246443315;
        iy.appv[481] = 1818750861;
        iy.appv[482] = -1955011772;
        iy.appv[483] = 1188938098;
        iy.appv[484] = -1321577180;
        iy.appv[485] = 890129132;
        iy.appv[486] = -251829642;
        iy.appv[487] = 74119070;
        iy.appv[488] = 1852912614;
        iy.appv[489] = 811844304;
        iy.appv[490] = -1353589523;
        iy.appv[491] = -1779732199;
        iy.appv[492] = -1841082641;
        iy.appv[493] = -1460663483;
        iy.appv[494] = -1536551891;
        iy.appv[495] = 1743650887;
        iy.appv[496] = 327788133;
        iy.appv[497] = -1873229193;
        iy.appv[498] = 1826885146;
        iy.appv[499] = -1374227341;
    }

    private static /* synthetic */ void areh() {
        iy.appv[200] = -721919599;
        iy.appv[201] = -1781347151;
        iy.appv[202] = -1797348298;
        iy.appv[203] = 31404598;
        iy.appv[204] = 34235757;
        iy.appv[205] = 97668588;
        iy.appv[206] = -1267588888;
        iy.appv[207] = 246748030;
        iy.appv[208] = 1887289625;
        iy.appv[209] = -1931572772;
        iy.appv[210] = -1292730351;
        iy.appv[211] = 409593741;
        iy.appv[212] = -1142482752;
        iy.appv[213] = -390119121;
        iy.appv[214] = -349946616;
        iy.appv[215] = 35030998;
        iy.appv[216] = 862551214;
        iy.appv[217] = 522725592;
        iy.appv[218] = 897908107;
        iy.appv[219] = -1972728632;
        iy.appv[220] = -2052816955;
        iy.appv[221] = -1488651769;
        iy.appv[222] = 178774299;
        iy.appv[223] = -957689817;
        iy.appv[224] = 798682480;
        iy.appv[225] = -719007477;
        iy.appv[226] = 488414811;
        iy.appv[227] = 1688133708;
        iy.appv[228] = 1932755015;
        iy.appv[229] = 649177268;
        iy.appv[230] = 1917644100;
        iy.appv[231] = -1461107631;
        iy.appv[232] = 2139168388;
        iy.appv[233] = -369684145;
        iy.appv[234] = 1260213306;
        iy.appv[235] = -1802681960;
        iy.appv[236] = -2017943949;
        iy.appv[237] = -1154198547;
        iy.appv[238] = -2104148972;
        iy.appv[239] = -1219732719;
        iy.appv[240] = 416520684;
        iy.appv[241] = -25789750;
        iy.appv[242] = -130049032;
        iy.appv[243] = 641178499;
        iy.appv[244] = 19687532;
        iy.appv[245] = -2087442083;
        iy.appv[246] = 1395968819;
        iy.appv[247] = -542883351;
        iy.appv[248] = 361978379;
        iy.appv[249] = 717196256;
        iy.appv[250] = 1998460012;
        iy.appv[251] = -1612568935;
        iy.appv[252] = 386277327;
        iy.appv[253] = -2134295793;
        iy.appv[254] = 369281051;
        iy.appv[255] = -820982103;
        iy.appv[256] = -33233602;
        iy.appv[257] = 868685871;
        iy.appv[258] = -1867546053;
        iy.appv[259] = 799527310;
        iy.appv[260] = -1054413004;
        iy.appv[261] = 1786668369;
        iy.appv[262] = -681601219;
        iy.appv[263] = -949127931;
        iy.appv[264] = -2074487817;
        iy.appv[265] = -1189044777;
        iy.appv[266] = 1515969600;
        iy.appv[267] = -1562336459;
        iy.appv[268] = 559128712;
        iy.appv[269] = 148820791;
        iy.appv[270] = -2050933121;
        iy.appv[271] = 734633749;
        iy.appv[272] = 158433083;
        iy.appv[273] = -1244687873;
        iy.appv[274] = -1613439478;
        iy.appv[275] = 418847499;
        iy.appv[276] = 1388426121;
        iy.appv[277] = 333419288;
        iy.appv[278] = 91398073;
        iy.appv[279] = -1520200235;
        iy.appv[280] = 512818981;
        iy.appv[281] = -1471824562;
        iy.appv[282] = -1216452004;
        iy.appv[283] = 173613484;
        iy.appv[284] = -1933523892;
        iy.appv[285] = -1518912753;
        iy.appv[286] = 1980728119;
        iy.appv[287] = -655885914;
        iy.appv[288] = -844334751;
        iy.appv[289] = -1809799054;
        iy.appv[290] = 1972420013;
        iy.appv[291] = 359041371;
        iy.appv[292] = 565854648;
        iy.appv[293] = -931816069;
        iy.appv[294] = 914846266;
        iy.appv[295] = 435669707;
        iy.appv[296] = 1260109745;
        iy.appv[297] = 276306077;
        iy.appv[298] = -1923190618;
        iy.appv[299] = -1652613505;
    }

    static {
        appu = new int[751];
        appv = new int[751];
        iy.ardx();
        iy.ardy();
        iy.ardz();
        iy.area();
        iy.areb();
        iy.arec();
        iy.ared();
        iy.aree();
        iy.aref();
        iy.areg();
        iy.areh();
        iy.arei();
        iy.arej();
        iy.arek();
        iy.arel();
        iy.arem();
        apqv = new long[284];
        apqw = new long[284];
        iy.aren();
        iy.areo();
        iy.arep();
        iy.areq();
        iy.arer();
        iy.ares();
    }

    private static /* synthetic */ void aree() {
        iy.appu[700] = -1254648316;
        iy.appu[701] = -925254033;
        iy.appu[702] = -729852579;
        iy.appu[703] = 1881525731;
        iy.appu[704] = -1025547310;
        iy.appu[705] = 941689047;
        iy.appu[706] = 1432326214;
        iy.appu[707] = 1637675653;
        iy.appu[708] = -339884430;
        iy.appu[709] = -627666150;
        iy.appu[710] = -628174298;
        iy.appu[711] = 766984429;
        iy.appu[712] = -80403891;
        iy.appu[713] = 1397185607;
        iy.appu[714] = 1297236576;
        iy.appu[715] = -106429618;
        iy.appu[716] = -1544211750;
        iy.appu[717] = 1787674721;
        iy.appu[718] = -625088336;
        iy.appu[719] = 305081683;
        iy.appu[720] = 1779768089;
        iy.appu[721] = 278103623;
        iy.appu[722] = -1855689766;
        iy.appu[723] = -1097203014;
        iy.appu[724] = 779189492;
        iy.appu[725] = -1043161619;
        iy.appu[726] = 974073703;
        iy.appu[727] = 10716098;
        iy.appu[728] = 339424935;
        iy.appu[729] = 318950105;
        iy.appu[730] = -1321301115;
        iy.appu[731] = 308256410;
        iy.appu[732] = -415086350;
        iy.appu[733] = -1463061396;
        iy.appu[734] = 1386905089;
        iy.appu[735] = 1663766819;
        iy.appu[736] = 856993910;
        iy.appu[737] = 1881644903;
        iy.appu[738] = 826572888;
        iy.appu[739] = 1252951101;
        iy.appu[740] = -1383190592;
        iy.appu[741] = 1934456199;
        iy.appu[742] = -848709554;
        iy.appu[743] = 1302437898;
        iy.appu[744] = -976885376;
        iy.appu[745] = 946024581;
        iy.appu[746] = 1244550565;
        iy.appu[747] = -342014422;
        iy.appu[748] = -1769011140;
        iy.appu[749] = -1692843118;
        iy.appu[750] = 1429335664;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void reset() {
        boolean bl2;
        Object object = ci;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - iy.appw("aqxc", apqu(int ), (int)210);
            }
            switch ((int)object) {
                case -1671183739: {
                    break block16;
                }
                case -536821327: {
                    callSite = iy.appw("aqxd", apqu(int ), (int)211);
                    continue block16;
                }
                case -228253471: {
                    callSite = iy.appw("aqxe", apqu(int ), (int)212);
                    continue block16;
                }
                case 1158491286: {
                    callSite = iy.appw("aqxf", apqu(int ), (int)213);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ci - iy.appw("aqxg", apqu(int ), (int)214)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == iy.appw("aqxh", apqa(int ), (int)648)) break;
            object2 = iy.appw("aqxi", apqa(int ), (int)649);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ci - iy.appw("aqxj", apqu(int ), (int)215)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == iy.appw("aqxk", apqa(int ), (int)650)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = iy.appw("aqxl", apqa(int ), (int)651);
        }
        if (bl2 || bl2) return;
        Object object4 = ci;
        block19: while (true) {
            switch ((int)object4) {
                case -1671183739: {
                    break block19;
                }
                case -1486380267: {
                    object4 = iy.appw("aqxn", apqu(int ), (int)217) - iy.appw("aqxm", apqu(int ), (int)216);
                    continue block19;
                }
            }
            break;
        }
        this.resetSearchState();
        if (bl2 || bl2) return;
        CallSite callSite = iy.appw("aqxo", apqa(int ), (int)652);
        Object object5 = ci;
        boolean bl5 = true;
        block20: while (true) {
            CallSite callSite2;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite2 - iy.appw("aqxp", apqu(int ), (int)218);
            }
            switch ((int)object5) {
                case -1671183739: {
                    break block20;
                }
                case -564989046: {
                    callSite2 = iy.appw("aqxq", apqu(int ), (int)219);
                    continue block20;
                }
                case 792825085: {
                    callSite2 = iy.appw("aqxr", apqu(int ), (int)220);
                    continue block20;
                }
                case 1572182605: {
                    callSite2 = iy.appw("aqxs", apqu(int ), (int)221);
                    continue block20;
                }
            }
            break;
        }
        this.lastTargetMask = (int)callSite;
        if (!bl2 && !bl2) return;
    }

    private static /* synthetic */ void arep() {
        iy.apqv[200] = -3393412013390633240L;
        iy.apqv[201] = -5949529502194296510L;
        iy.apqv[202] = 2443997593407719644L;
        iy.apqv[203] = -6751021697592443628L;
        iy.apqv[204] = -7323361237221660607L;
        iy.apqv[205] = 290356740212261882L;
        iy.apqv[206] = 141854969945382202L;
        iy.apqv[207] = -2140275449777274354L;
        iy.apqv[208] = -1932905404552093872L;
        iy.apqv[209] = 4743813436705510608L;
        iy.apqv[210] = -45467709896437724L;
        iy.apqv[211] = -4010073620835930282L;
        iy.apqv[212] = -3101047650764026272L;
        iy.apqv[213] = -8341895674449135218L;
        iy.apqv[214] = -8158642062391838583L;
        iy.apqv[215] = 228250441565788371L;
        iy.apqv[216] = -7091190385535934341L;
        iy.apqv[217] = -8215700356290237117L;
        iy.apqv[218] = 8980083208498736620L;
        iy.apqv[219] = -1553806326058777546L;
        iy.apqv[220] = -82613722912229448L;
        iy.apqv[221] = -5362940199775512838L;
        iy.apqv[222] = 7424001660712064635L;
        iy.apqv[223] = -1544042076760375738L;
        iy.apqv[224] = 3126476947449871554L;
        iy.apqv[225] = -7377477986703782052L;
        iy.apqv[226] = 1215760357406074936L;
        iy.apqv[227] = 2766088871019168764L;
        iy.apqv[228] = -2492395238272116774L;
        iy.apqv[229] = -8696322437931567172L;
        iy.apqv[230] = 7623807178989625242L;
        iy.apqv[231] = -7755891052732160522L;
        iy.apqv[232] = 2260759070727057198L;
        iy.apqv[233] = -3919172067094700832L;
        iy.apqv[234] = 1095736682576817499L;
        iy.apqv[235] = 2664259097312314812L;
        iy.apqv[236] = -2026557333711558404L;
        iy.apqv[237] = -4975957098732371743L;
        iy.apqv[238] = -6891512665288736286L;
        iy.apqv[239] = 7293006896520599894L;
        iy.apqv[240] = 5785731194014390044L;
        iy.apqv[241] = 8031572270464204864L;
        iy.apqv[242] = -8183314011599908211L;
        iy.apqv[243] = 5168226757370463176L;
        iy.apqv[244] = 1562183450296404801L;
        iy.apqv[245] = -6749771693442391287L;
        iy.apqv[246] = -6795890081657547036L;
        iy.apqv[247] = -4426767600276509067L;
        iy.apqv[248] = -7115877976274348077L;
        iy.apqv[249] = 1302473072975020896L;
        iy.apqv[250] = -5844666909356700042L;
        iy.apqv[251] = 2500284841468411404L;
        iy.apqv[252] = -4751587556811164474L;
        iy.apqv[253] = -6157165292937184745L;
        iy.apqv[254] = -6289657449948155912L;
        iy.apqv[255] = -5716355135893406094L;
        iy.apqv[256] = 1961240791203672269L;
        iy.apqv[257] = 588853668856478873L;
        iy.apqv[258] = 8666982897827157249L;
        iy.apqv[259] = -6127538274391670708L;
        iy.apqv[260] = -5772185073510239337L;
        iy.apqv[261] = -2888813973802353384L;
        iy.apqv[262] = -6967133548011427266L;
        iy.apqv[263] = 8499995345117167359L;
        iy.apqv[264] = 3836565737022028116L;
        iy.apqv[265] = 2897013495313541054L;
        iy.apqv[266] = -4072068871571322991L;
        iy.apqv[267] = -6040590702100625975L;
        iy.apqv[268] = 8563681526382068948L;
        iy.apqv[269] = -8666980492816128755L;
        iy.apqv[270] = 6032739012786843508L;
        iy.apqv[271] = -1569646093667610597L;
        iy.apqv[272] = -8754880232207384373L;
        iy.apqv[273] = 122880299841916841L;
        iy.apqv[274] = 5323905857973659284L;
        iy.apqv[275] = 5604699079033852645L;
        iy.apqv[276] = 2855850115108929725L;
        iy.apqv[277] = 206117699834609817L;
        iy.apqv[278] = -4675318960837206491L;
        iy.apqv[279] = 8187195796051970573L;
        iy.apqv[280] = 4712855578460714837L;
        iy.apqv[281] = 5960007572571278622L;
        iy.apqv[282] = 5273394997567586889L;
        iy.apqv[283] = -3853732689782333740L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        boolean bl2;
        Object object = ci;
        boolean bl3 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - iy.appw("aprp", apqu(int ), (int)8);
            }
            switch ((int)object) {
                case -1671183739: {
                    break block17;
                }
                case -40531203: {
                    callSite = iy.appw("aprq", apqu(int ), (int)9);
                    continue block17;
                }
                case 692308508: {
                    callSite = iy.appw("aprr", apqu(int ), (int)10);
                    continue block17;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ci;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - iy.appw("aprs", apqu(int ), (int)11);
            }
            switch ((int)object2) {
                case -1723104710: {
                    callSite = iy.appw("aprt", apqu(int ), (int)12);
                    continue block18;
                }
                case -1671183739: {
                    break block18;
                }
                case 261475398: {
                    callSite = iy.appw("apru", apqu(int ), (int)13);
                    continue block18;
                }
                case 1597355425: {
                    callSite = iy.appw("aprv", apqu(int ), (int)14);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ci - iy.appw("aprw", apqu(int ), (int)15)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == iy.appw("aprx", apqa(int ), (int)32)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = iy.appw("apry", apqa(int ), (int)33);
        }
        if (bl2 || bl2) return;
        Object object4 = ci;
        boolean bl6 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - iy.appw("aprz", apqu(int ), (int)16);
            }
            switch ((int)object4) {
                case -1671183739: {
                    break block20;
                }
                case -1237670711: {
                    callSite = iy.appw("apsa", apqu(int ), (int)17);
                    continue block20;
                }
                case -226296114: {
                    callSite = iy.appw("apsb", apqu(int ), (int)18);
                    continue block20;
                }
                case 1458453601: {
                    callSite = iy.appw("apsc", apqu(int ), (int)19);
                    continue block20;
                }
            }
            break;
        }
        this.reset();
        if (!bl2 && !bl2) return;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private iy$EntityType entityType(class_1297 var1_1, int var2_2) {
        block50: {
            block52: {
                block51: {
                    v0 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl5
                    block29: while (true) {
                        v0 /* !! */  = (long)(v1 - iy.appw("aqsa", apqu(int ), (int)160));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1671183739: {
                                break block29;
                            }
                            case -1343068578: {
                                v1 = iy.appw("aqsb", apqu(int ), (int)161);
                                continue block29;
                            }
                            case 1480226276: {
                                v1 = iy.appw("aqsc", apqu(int ), (int)162);
                                continue block29;
                            }
                            case 1701376228: {
                                v1 = iy.appw("aqsd", apqu(int ), (int)163);
                                continue block29;
                            }
                        }
                        break;
                    }
                    var5_3 = iy.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aqse", apqu(int ), (int)164)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == iy.appw("aqsf", apqa(int ), (int)566)) break;
                        v2 /* !! */  = (long)iy.appw("aqsg", apqa(int ), (int)567);
                    }
                    var4_4 /* !! */  = iy.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_2 = iy.ci - iy.appw("aqsh", apqu(int ), (int)165)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == iy.appw("aqsi", apqa(int ), (int)568)) {
                            var3_5 = iy.a;
                            if (var5_3) {
                                throw null;
                            }
                            break;
                        }
                        v3 /* !! */  = (long)iy.appw("aqsj", apqa(int ), (int)569);
                    }
                    if (var3_5 != false) return null;
                    if (var3_5 != false) return null;
                    if ((var2_2 & iy.appw("aqsk", apqa(int ), (int)570)) == 0) break block51;
                    if (var3_5 != false) return null;
                    if (!(var1_1 instanceof class_1641)) break block51;
                    if (var3_5 != false) return null;
                    if (var3_5 != false) return null;
                    v4 /* !! */  = iy.ci;
                    if (true) ** GOTO lbl107
                }
                if (var3_5 != false) return null;
                if (var3_5 != false) return null;
                if ((var2_2 & iy.appw("aqsp", apqa(int ), (int)571)) == 0) break block52;
                if (var3_5 != false) return null;
                if (!(var1_1 instanceof class_1646)) break block52;
                if (var3_5 != false) return null;
                if (var3_5 != false) return null;
                ** GOTO lbl120
            }
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_5 != false) return null;
                        if (var3_5 != false) return null;
                        return null;
                    }
                    case 2: {
                        do {
                            var4_4 /* !! */  = (int)iy.appw("aqsv", apqa(int ), (int)576);
                        } while (!var5_3);
                        throw null;
                    }
                    case 3: {
                        var4_4 /* !! */  = (int)iy.appw("aqsw", apqa(int ), (int)577);
                        cfr_temp_0 = 11;
                        if (var5_3) {
                            throw null;
                        }
                        break block50;
                    }
                    case 5: {
                        var4_4 /* !! */  = (int)iy.appw("aqsy", apqa(int ), (int)579);
                        if (!var5_3) ** break;
                        throw null;
                    }
                    case 6: {
                        ** GOTO lbl133
                    }
                    case 8: {
                        var4_4 /* !! */  = (int)iy.appw("aqtb", apqa(int ), (int)582);
                        cfr_temp_0 = 13;
                        if (var5_3) {
                            throw null;
                        }
                        break block50;
                    }
                    case 10: {
                        var4_4 /* !! */  = (int)iy.appw("aqtd", apqa(int ), (int)584);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var4_4 /* !! */  = (int)iy.appw("aqsu", apqa(int ), (int)575);
                        cfr_temp_0 = 4;
                        if (var5_3) {
                            throw null;
                        }
                        break block50;
                    }
                    case 12: {
                        var4_4 /* !! */  = (int)iy.appw("aqtf", apqa(int ), (int)586);
                        if (!var5_3) ** break;
                        throw null;
                    }
                    case 13: {
                        var4_4 /* !! */  = (int)iy.appw("aqtg", apqa(int ), (int)587);
                        cfr_temp_0 = 4;
                        if (var5_3) {
                            throw null;
                        }
                        break block50;
                    }
                    case 14: {
                        ** GOTO lbl130
                    }
                    block34: while (true) {
                        v4 /* !! */  = (long)(v5 - iy.appw("aqsl", apqu(int ), (int)166));
lbl107:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1671183739: {
                                return iy$EntityType.ZOMBIE_VILLAGER;
                            }
                            case -1241867518: {
                                v5 = iy.appw("aqsm", apqu(int ), (int)167);
                                continue block34;
                            }
                            case 113915029: {
                                v5 = iy.appw("aqsn", apqu(int ), (int)168);
                                continue block34;
                            }
                            case 643069368: {
                                v5 = iy.appw("aqso", apqu(int ), (int)169);
                                continue block34;
                            }
                        }
                        break;
                    }
                    return iy$EntityType.ZOMBIE_VILLAGER;
lbl120:
                    // 1 sources

                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_3 = iy.ci - iy.appw("aqsq", apqu(int ), (int)170)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == iy.appw("aqsr", apqa(int ), (int)572)) {
                            return iy$EntityType.VILLAGER;
                        }
                        v6 /* !! */  = (long)iy.appw("aqss", apqa(int ), (int)573);
                    }
                    case 0: {
                        var4_4 /* !! */  = (int)iy.appw("aqst", apqa(int ), (int)574);
                        if (!var5_3) ** break;
                        throw null;
lbl130:
                        // 4 sources

                        var4_4 /* !! */  = (int)iy.appw("aqth", apqa(int ), (int)588);
                        if (var5_3) {
                            throw null;
                        }
lbl133:
                        // 3 sources

                        var4_4 /* !! */  = (int)iy.appw("aqsz", apqa(int ), (int)580);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 9: {
                        var4_4 /* !! */  = (int)iy.appw("aqtc", apqa(int ), (int)583);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_4 /* !! */  = (int)iy.appw("aqta", apqa(int ), (int)581);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 11: {
                        var4_4 /* !! */  = (int)iy.appw("aqte", apqa(int ), (int)585);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                break;
            }
            ** GOTO lbl153
        }
        do {
            if (true) ** continue;
lbl153:
            // 2 sources

            var4_4 /* !! */  = (int)iy.appw("aqsx", apqa(int ), (int)578);
            cfr_temp_0 = 0;
        } while (!var5_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = iy.ci;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - iy.appw("apqx", apqu(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1741269446: {
                    v1 = iy.appw("apqy", apqu(int ), (int)1);
                    continue block18;
                }
                case -1671183739: {
                    break block18;
                }
                case 6188310: {
                    v1 = iy.appw("apqz", apqu(int ), (int)2);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = iy.c;
        v2 /* !! */  = iy.ci;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - iy.appw("apra", apqu(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1671183739: {
                    break block19;
                }
                case -627782065: {
                    v3 = iy.appw("aprb", apqu(int ), (int)4);
                    continue block19;
                }
                case 1255490280: {
                    v3 = iy.appw("aprc", apqu(int ), (int)5);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = iy.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("aprd", apqu(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == iy.appw("apre", apqa(int ), (int)22)) break;
            v4 /* !! */  = (long)iy.appw("aprf", apqa(int ), (int)23);
        }
        var1_3 = iy.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("aprg", apqu(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == iy.appw("aprh", apqa(int ), (int)24)) break;
            v5 /* !! */  = (long)iy.appw("apri", apqa(int ), (int)25);
        }
        this.reset();
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)iy.appw("aprj", apqa(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)iy.appw("aprk", apqa(int ), (int)27);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)iy.appw("aprl", apqa(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)iy.appw("aprm", apqa(int ), (int)29);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)iy.appw("aprn", apqa(int ), (int)30);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)iy.appw("apro", apqa(int ), (int)31);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double aqko(int n2) {
        return Double.longBitsToDouble(apqv[n2] ^ apqw[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldLoad(di var1_1) {
        v0 /* !! */  = iy.ci;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - iy.appw("apsj", apqu(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1671183739: {
                    break block19;
                }
                case -590349707: {
                    v1 = iy.appw("apsk", apqu(int ), (int)21);
                    continue block19;
                }
                case 520594833: {
                    v1 = iy.appw("apsl", apqu(int ), (int)22);
                    continue block19;
                }
                case 1995691977: {
                    v1 = iy.appw("apsm", apqu(int ), (int)23);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = iy.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iy.ci - iy.appw("apsn", apqu(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iy.appw("apso", apqa(int ), (int)40)) break;
            v2 /* !! */  = (long)iy.appw("apsp", apqa(int ), (int)41);
        }
        var3_3 /* !! */  = iy.b;
        v3 /* !! */  = iy.ci;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - iy.appw("apsq", apqu(int ), (int)25));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1671183739: {
                    break block21;
                }
                case -1135934481: {
                    v4 = iy.appw("apsr", apqu(int ), (int)26);
                    continue block21;
                }
                case 1534054493: {
                    v4 = iy.appw("apss", apqu(int ), (int)27);
                    continue block21;
                }
            }
            break;
        }
        var2_4 = iy.a;
        if (var4_2) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = iy.ci - iy.appw("apst", apqu(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == iy.appw("apsu", apqa(int ), (int)42)) break;
            v5 /* !! */  = (long)iy.appw("apsv", apqa(int ), (int)43);
        }
        this.reset();
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl54:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)iy.appw("apsw", apqa(int ), (int)44);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl59:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)iy.appw("apsx", apqa(int ), (int)45);
                if (!var4_2) ** GOTO lbl54
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)iy.appw("apsy", apqa(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)iy.appw("apsz", apqa(int ), (int)47);
                } while (!var4_2);
                throw null;
            }
lbl73:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)iy.appw("apta", apqa(int ), (int)48);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)iy.appw("aptb", apqa(int ), (int)49);
        ** while (!var4_2)
lbl80:
        // 1 sources

        throw null;
    }
}

