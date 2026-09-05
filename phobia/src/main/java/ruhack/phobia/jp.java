/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  net.minecraft.class_10799
 *  net.minecraft.class_11580
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_2371
 *  net.minecraft.class_2480
 *  net.minecraft.class_2509
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_746
 *  net.minecraft.class_9288
 *  net.minecraft.class_9334
 *  org.joml.Vector2f
 *  org.lwjgl.glfw.GLFW
 */
package ruhack.phobia;

import com.mojang.serialization.DynamicOps;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;
import net.minecraft.class_10799;
import net.minecraft.class_11580;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2371;
import net.minecraft.class_2480;
import net.minecraft.class_2509;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_746;
import net.minecraft.class_9288;
import net.minecraft.class_9334;
import org.joml.Vector2f;
import org.lwjgl.glfw.GLFW;
import ruhack.phobia.aw;
import ruhack.phobia.bu;
import ruhack.phobia.ce;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jp$WorldPreview;
import ruhack.phobia.jp$WorldShulker;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.nj;
import ruhack.phobia.op;

public class jp
extends ds {
    private static final int SLOT_COUNT = 27;
    private final kb world;
    public static final int b;
    private final List<jp$WorldPreview> worldPreviews;
    private static final int SCREEN_MARGIN = 4;
    static final long sm = -4421159352796098554L;
    private static final class_2960 SHULKER_TEXTURE;
    private static final float WORLD_OFFSET = 18.0f;
    private static long[] kkgg;
    private static final int SLOT_COLUMNS = 9;
    private static final float WORLD_SCALE = 0.5f;
    public static final boolean c;
    private final Vector2f projected;
    private final List<jp$WorldShulker> worldShulkers;
    private static final int PANEL_HEIGHT = 67;
    private static final int SLOT_SIZE = 18;
    private static final double WORLD_RANGE_SQUARED = 4096.0;
    private static final int SLOT_Y = 7;
    private static int[] kkfs;
    private int lastWorldScanAge;
    private static final int SLOT_X = 8;
    private static long[] kkgh;
    private static final int PANEL_WIDTH = 176;
    private static int[] kkfr;
    public static final boolean a;
    private Object lastScannedWorld;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDraw(bu var1_1) {
        block159: {
            block158: {
                block157: {
                    var12_2 = jp.c;
                    var11_3 /* !! */  = jp.b;
                    var10_4 = jp.a;
                    if (var12_2) {
                        throw null;
lbl6:
                        // 45 sources

                        return;
                    }
                    if (var10_4 || var10_4) ** GOTO lbl6
                    this.worldPreviews.clear();
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (!this.world.isValue()) break block157;
                    if (var10_4) ** GOTO lbl6
                    if (jp.mc.field_1724 == null) break block157;
                    if (var10_4) ** GOTO lbl6
                    if (jp.mc.field_1687 != null) break block158;
                    if (var10_4) ** GOTO lbl6
                }
                if (var10_4 || var10_4) ** GOTO lbl6
                return;
            }
            if (var10_4 || var10_4) ** GOTO lbl6
            if (this.lastWorldScanAge != jp.mc.field_1724.field_6012) break block159;
            if (var10_4) ** GOTO lbl6
            if (this.lastScannedWorld == jp.mc.field_1687) ** GOTO lbl69
            if (var10_4) ** GOTO lbl6
        }
        if (var10_4 || var10_4) ** GOTO lbl6
        this.lastWorldScanAge = jp.mc.field_1724.field_6012;
        if (var10_4 || var10_4) ** GOTO lbl6
        this.lastScannedWorld = jp.mc.field_1687;
        if (var10_4 || var10_4) ** GOTO lbl6
        this.worldShulkers.clear();
        if (var10_4 || var10_4) ** GOTO lbl6
        var2_5 = jp.mc.field_1687.method_18112().iterator();
        if (var10_4) ** GOTO lbl6
        block83: while (true) {
            block160: {
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl66
                if (var10_4) ** GOTO lbl6
                var3_7 = (class_1297)var2_5.next();
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!(var3_7 instanceof class_1542)) continue;
                if (var10_4) ** GOTO lbl6
                var4_9 = (class_1542)var3_7;
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!(var4_9.method_5858((class_1297)jp.mc.field_1724) > jp.kkft("kkku", kkkt(int ), (int)29))) break block160;
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!var12_2) continue;
                throw null;
            }
            if (var10_4 || var10_4) ** GOTO lbl6
            var5_10 /* !! */  = this.contents(var4_9.method_6983());
            if (var10_4 || var10_4) ** GOTO lbl6
            if (var5_10 /* !! */  == null) ** GOTO lbl62
            if (var11_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var11_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var10_4) ** GOTO lbl6
                    this.worldShulkers.add(new jp$WorldShulker(var4_9, (List<class_1799>)var5_10 /* !! */ ));
                    if (var10_4) ** GOTO lbl6
lbl62:
                    // 2 sources

                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (var12_2) ** break;
                    continue block83;
                    throw null;
                }
lbl66:
                // 1 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                this.worldShulkers.sort(Comparator.comparingDouble((ToDoubleFunction<jp$WorldShulker>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$onDraw$0(ruhack.phobia.jp$WorldShulker ), (Lruhack/phobia/jp$WorldShulker;)D)()));
                if (var10_4) ** GOTO lbl6
lbl69:
                // 2 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                var2_6 = op.getTickDelta();
                if (var10_4 || var10_4) ** GOTO lbl6
                var3_8 = 2.0f / Math.max(1.0f, (float)jp.mc.method_22683().method_4495());
                if (var10_4 || var10_4) ** GOTO lbl6
                var4_9 = this.worldShulkers.iterator();
                if (var10_4) ** GOTO lbl6
                while (true) {
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (!var4_9.hasNext()) ** GOTO lbl108
                    if (var10_4) ** GOTO lbl6
                    var5_10 /* !! */  = var4_9.next();
                    if (var10_4 || var10_4) ** GOTO lbl6
                    var6_11 = var5_10 /* !! */ .item;
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (!var6_11.method_5805()) continue;
                    if (var10_4) ** GOTO lbl6
                    if (!var6_11.method_31481()) ** GOTO lbl90
                    if (var10_4) ** GOTO lbl6
                    if (!var12_2) continue;
                    throw null;
lbl90:
                    // 1 sources

                    if (var10_4 || var10_4) ** GOTO lbl6
                    var7_12 = var6_11.method_30950(var2_6).method_1031(0.0, (double)jp.kkft("kkkv", kkkt(int ), (int)30), 0.0);
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (op.project(var7_12.field_1352, var7_12.field_1351, var7_12.field_1350, this.projected)) ** GOTO lbl97
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (!var12_2) continue;
                    throw null;
lbl97:
                    // 1 sources

                    if (var10_4 || var10_4) ** GOTO lbl6
                    var8_13 = Math.round(this.projected.x * var3_8);
                    if (var10_4 || var10_4) ** GOTO lbl6
                    var9_14 = Math.round((this.projected.y + jp.kkft("kkkx", kkkw(int ), (int)97)) * var3_8);
                    if (var10_4 || var10_4) ** GOTO lbl6
                    this.worldPreviews.add(new jp$WorldPreview(var8_13, var9_14, var5_10 /* !! */ .contents));
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (var12_2) break;
                }
                throw null;
lbl108:
                // 1 sources

                if (!var10_4 && !var10_4) ** break;
                ** continue;
                return;
                case 0: {
                    var11_3 /* !! */  = (int)jp.kkft("kkky", kkfq(int ), (int)98);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl130
                }
                case 1: {
                    var11_3 /* !! */  = (int)jp.kkft("kkkz", kkfq(int ), (int)99);
                    if (!var12_2) break block83;
                    throw null;
                }
                case 2: {
                    var11_3 /* !! */  = (int)jp.kkft("kkla", kkfq(int ), (int)100);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl125:
                // 4 sources

                case 3: {
                    var11_3 /* !! */  = (int)jp.kkft("kklb", kkfq(int ), (int)101);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl406
                }
lbl130:
                // 3 sources

                case 4: {
                    var11_3 /* !! */  = (int)jp.kkft("kklc", kkfq(int ), (int)102);
                    if (!var12_2) ** GOTO lbl125
                    throw null;
                }
lbl134:
                // 2 sources

                case 5: {
                    var11_3 /* !! */  = (int)jp.kkft("kkld", kkfq(int ), (int)103);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl262
                }
lbl139:
                // 2 sources

                case 6: {
                    var11_3 /* !! */  = (int)jp.kkft("kkle", kkfq(int ), (int)104);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
lbl144:
                // 3 sources

                case 7: {
                    var11_3 /* !! */  = (int)jp.kkft("kklf", kkfq(int ), (int)105);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl304
                }
lbl149:
                // 3 sources

                case 8: {
                    var11_3 /* !! */  = (int)jp.kkft("kklg", kkfq(int ), (int)106);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
lbl154:
                // 3 sources

                case 9: {
                    var11_3 /* !! */  = (int)jp.kkft("kklh", kkfq(int ), (int)107);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
lbl159:
                // 3 sources

                case 10: {
                    var11_3 /* !! */  = (int)jp.kkft("kkli", kkfq(int ), (int)108);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl174
                }
lbl164:
                // 2 sources

                case 11: {
                    var11_3 /* !! */  = (int)jp.kkft("kklj", kkfq(int ), (int)109);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
lbl169:
                // 2 sources

                case 12: {
                    var11_3 /* !! */  = (int)jp.kkft("kklk", kkfq(int ), (int)110);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl375
                }
lbl174:
                // 2 sources

                case 13: {
                    var11_3 /* !! */  = (int)jp.kkft("kkll", kkfq(int ), (int)111);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl353
                }
lbl179:
                // 2 sources

                case 14: {
                    var11_3 /* !! */  = (int)jp.kkft("kklm", kkfq(int ), (int)112);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl344
                }
lbl184:
                // 2 sources

                case 15: {
                    var11_3 /* !! */  = (int)jp.kkft("kkln", kkfq(int ), (int)113);
                    if (var12_2) {
                        throw null;
                    }
                }
                case 16: {
                    var11_3 /* !! */  = (int)jp.kkft("kklo", kkfq(int ), (int)114);
                    if (!var12_2) ** GOTO lbl179
                    throw null;
                }
lbl192:
                // 2 sources

                case 17: {
                    var11_3 /* !! */  = (int)jp.kkft("kklp", kkfq(int ), (int)115);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
lbl197:
                // 2 sources

                case 18: {
                    var11_3 /* !! */  = (int)jp.kkft("kklq", kkfq(int ), (int)116);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl389
                }
lbl202:
                // 2 sources

                case 19: {
                    var11_3 /* !! */  = (int)jp.kkft("kklr", kkfq(int ), (int)117);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl446
                }
                case 20: {
                    var11_3 /* !! */  = (int)jp.kkft("kkls", kkfq(int ), (int)118);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl442
                }
lbl212:
                // 2 sources

                case 21: {
                    var11_3 /* !! */  = (int)jp.kkft("kklt", kkfq(int ), (int)119);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl380
                }
                case 22: {
                    var11_3 /* !! */  = (int)jp.kkft("kklu", kkfq(int ), (int)120);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
                case 23: {
                    var11_3 /* !! */  = (int)jp.kkft("kklv", kkfq(int ), (int)121);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl459
                }
lbl227:
                // 3 sources

                case 24: {
                    var11_3 /* !! */  = (int)jp.kkft("kklw", kkfq(int ), (int)122);
                    if (!var12_2) break block83;
                    throw null;
                }
lbl231:
                // 3 sources

                case 25: {
                    var11_3 /* !! */  = (int)jp.kkft("kklx", kkfq(int ), (int)123);
                    if (!var12_2) ** GOTO lbl134
                    throw null;
                }
                case 26: {
                    var11_3 /* !! */  = (int)jp.kkft("kkly", kkfq(int ), (int)124);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl308
                }
lbl240:
                // 2 sources

                case 27: {
                    var11_3 /* !! */  = (int)jp.kkft("kklz", kkfq(int ), (int)125);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl272
                }
                case 28: {
                    var11_3 /* !! */  = (int)jp.kkft("kkma", kkfq(int ), (int)126);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl418
                }
lbl250:
                // 2 sources

                case 29: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmb", kkfq(int ), (int)127);
                    if (!var12_2) ** GOTO lbl202
                    throw null;
                }
lbl254:
                // 2 sources

                case 30: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmc", kkfq(int ), (int)128);
                    if (!var12_2) ** GOTO lbl169
                    throw null;
                }
                case 31: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmd", kkfq(int ), (int)129);
                    if (!var12_2) ** GOTO lbl197
                    throw null;
                }
lbl262:
                // 3 sources

                case 32: {
                    var11_3 /* !! */  = (int)jp.kkft("kkme", kkfq(int ), (int)130);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
                case 33: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmf", kkfq(int ), (int)131);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
lbl272:
                // 3 sources

                case 34: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmg", kkfq(int ), (int)132);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl385
                }
lbl277:
                // 3 sources

                case 35: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmh", kkfq(int ), (int)133);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl321
                }
lbl282:
                // 3 sources

                case 36: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmi", kkfq(int ), (int)134);
                    if (!var12_2) ** GOTO lbl125
                    throw null;
                }
lbl286:
                // 2 sources

                case 37: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmj", kkfq(int ), (int)135);
                    if (!var12_2) ** GOTO lbl277
                    throw null;
                }
                case 38: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmk", kkfq(int ), (int)136);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
lbl295:
                // 2 sources

                case 39: {
                    var11_3 /* !! */  = (int)jp.kkft("kkml", kkfq(int ), (int)137);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl438
                }
                case 40: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmm", kkfq(int ), (int)138);
                    if (!var12_2) ** GOTO lbl282
                    throw null;
                }
lbl304:
                // 2 sources

                case 41: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmn", kkfq(int ), (int)139);
                    if (!var12_2) ** GOTO lbl295
                    throw null;
                }
lbl308:
                // 2 sources

                case 42: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmo", kkfq(int ), (int)140);
                    if (!var12_2) ** GOTO lbl231
                    throw null;
                }
                case 43: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmp", kkfq(int ), (int)141);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl371
                }
lbl317:
                // 2 sources

                case 44: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmq", kkfq(int ), (int)142);
                    if (!var12_2) ** GOTO lbl227
                    throw null;
                }
lbl321:
                // 2 sources

                case 45: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmr", kkfq(int ), (int)143);
                    if (!var12_2) ** GOTO lbl192
                    throw null;
                }
lbl325:
                // 2 sources

                case 46: {
                    var11_3 /* !! */  = (int)jp.kkft("kkms", kkfq(int ), (int)144);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl446
                }
lbl330:
                // 3 sources

                case 47: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmt", kkfq(int ), (int)145);
                    if (!var12_2) ** GOTO lbl130
                    throw null;
                }
                case 48: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmu", kkfq(int ), (int)146);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl385
                }
                case 49: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmv", kkfq(int ), (int)147);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl375
                }
lbl344:
                // 2 sources

                case 50: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmw", kkfq(int ), (int)148);
                    if (!var12_2) ** GOTO lbl231
                    throw null;
                }
                case 51: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmx", kkfq(int ), (int)149);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl426
                }
lbl353:
                // 2 sources

                case 52: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmy", kkfq(int ), (int)150);
                    if (!var12_2) ** GOTO lbl164
                    throw null;
                }
lbl357:
                // 2 sources

                case 53: {
                    var11_3 /* !! */  = (int)jp.kkft("kkmz", kkfq(int ), (int)151);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl389
                }
                case 54: {
                    var11_3 /* !! */  = (int)jp.kkft("kkna", kkfq(int ), (int)152);
                    if (!var12_2) ** GOTO lbl277
                    throw null;
                }
                case 55: {
                    var11_3 /* !! */  = (int)jp.kkft("kknb", kkfq(int ), (int)153);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl375
                }
lbl371:
                // 2 sources

                case 56: {
                    var11_3 /* !! */  = (int)jp.kkft("kknc", kkfq(int ), (int)154);
                    if (!var12_2) ** GOTO lbl144
                    throw null;
                }
lbl375:
                // 4 sources

                case 57: {
                    var11_3 /* !! */  = (int)jp.kkft("kknd", kkfq(int ), (int)155);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl418
                }
lbl380:
                // 2 sources

                case 58: {
                    var11_3 /* !! */  = (int)jp.kkft("kkne", kkfq(int ), (int)156);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl446
                }
lbl385:
                // 3 sources

                case 59: {
                    var11_3 /* !! */  = (int)jp.kkft("kknf", kkfq(int ), (int)157);
                    if (!var12_2) ** GOTO lbl330
                    throw null;
                }
lbl389:
                // 3 sources

                case 60: {
                    var11_3 /* !! */  = (int)jp.kkft("kkng", kkfq(int ), (int)158);
                    if (!var12_2) ** GOTO lbl149
                    throw null;
                }
                case 61: {
                    var11_3 /* !! */  = (int)jp.kkft("kknh", kkfq(int ), (int)159);
                    if (!var12_2) ** GOTO lbl325
                    throw null;
                }
                case 62: {
                    var11_3 /* !! */  = (int)jp.kkft("kkni", kkfq(int ), (int)160);
                    if (!var12_2) ** GOTO lbl330
                    throw null;
                }
                case 63: {
                    var11_3 /* !! */  = (int)jp.kkft("kknj", kkfq(int ), (int)161);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl463
                }
lbl406:
                // 2 sources

                case 64: {
                    var11_3 /* !! */  = (int)jp.kkft("kknk", kkfq(int ), (int)162);
                    if (!var12_2) ** GOTO lbl262
                    throw null;
                }
lbl410:
                // 2 sources

                case 65: {
                    var11_3 /* !! */  = (int)jp.kkft("kknn", kkfq(int ), (int)163);
                    if (!var12_2) ** GOTO lbl212
                    throw null;
                }
lbl414:
                // 3 sources

                case 66: {
                    var11_3 /* !! */  = (int)jp.kkft("kknq", kkfq(int ), (int)164);
                    if (!var12_2) ** GOTO lbl317
                    throw null;
                }
lbl418:
                // 3 sources

                case 67: {
                    var11_3 /* !! */  = (int)jp.kkft("kknu", kkfq(int ), (int)165);
                    if (!var12_2) ** GOTO lbl144
                    throw null;
                }
                case 68: {
                    var11_3 /* !! */  = (int)jp.kkft("kkny", kkfq(int ), (int)166);
                    if (!var12_2) ** GOTO lbl184
                    throw null;
                }
lbl426:
                // 3 sources

                case 69: {
                    var11_3 /* !! */  = (int)jp.kkft("kkoc", kkfq(int ), (int)167);
                    if (!var12_2) ** GOTO lbl139
                    throw null;
                }
                case 70: {
                    var11_3 /* !! */  = (int)jp.kkft("kkog", kkfq(int ), (int)168);
                    if (!var12_2) ** GOTO lbl154
                    throw null;
                }
                case 71: {
                    var11_3 /* !! */  = (int)jp.kkft("kkoi", kkfq(int ), (int)169);
                    if (!var12_2) ** GOTO lbl426
                    throw null;
                }
lbl438:
                // 2 sources

                case 72: {
                    var11_3 /* !! */  = (int)jp.kkft("kkol", kkfq(int ), (int)170);
                    if (!var12_2) ** GOTO lbl357
                    throw null;
                }
lbl442:
                // 2 sources

                case 73: {
                    var11_3 /* !! */  = (int)jp.kkft("kkoo", kkfq(int ), (int)171);
                    if (!var12_2) ** GOTO lbl410
                    throw null;
                }
lbl446:
                // 4 sources

                case 74: {
                    do {
                        var11_3 /* !! */  = (int)jp.kkft("kkos", kkfq(int ), (int)172);
                    } while (!var12_2);
                    throw null;
                }
                case 75: {
                    var11_3 /* !! */  = (int)jp.kkft("kkov", kkfq(int ), (int)173);
                    if (!var12_2) ** GOTO lbl154
                    throw null;
                }
                case 76: {
                    var11_3 /* !! */  = (int)jp.kkft("kkoy", kkfq(int ), (int)174);
                    if (!var12_2) ** GOTO lbl240
                    throw null;
                }
lbl459:
                // 2 sources

                case 77: {
                    var11_3 /* !! */  = (int)jp.kkft("kkpb", kkfq(int ), (int)175);
                    if (!var12_2) ** GOTO lbl125
                    throw null;
                }
lbl463:
                // 2 sources

                case 78: {
                    var11_3 /* !! */  = (int)jp.kkft("kkpe", kkfq(int ), (int)176);
                    if (!var12_2) ** GOTO lbl254
                    throw null;
                }
                case 79: 
            }
            break;
        }
        do {
            var11_3 /* !! */  = (int)jp.kkft("kkph", kkfq(int ), (int)177);
        } while (!var12_2);
        throw null;
    }

    private static /* synthetic */ void kllk() {
        jp.kkfs[100] = 641685499;
        jp.kkfs[101] = 1831504321;
        jp.kkfs[102] = 684558993;
        jp.kkfs[103] = -1219256379;
        jp.kkfs[104] = 1716708214;
        jp.kkfs[105] = 694165282;
        jp.kkfs[106] = -1998340101;
        jp.kkfs[107] = 603864423;
        jp.kkfs[108] = -360659816;
        jp.kkfs[109] = 1247469090;
        jp.kkfs[110] = 876007294;
        jp.kkfs[111] = 1348071579;
        jp.kkfs[112] = 2044660869;
        jp.kkfs[113] = 370787198;
        jp.kkfs[114] = 1052421525;
        jp.kkfs[115] = 1496402168;
        jp.kkfs[116] = -579775051;
        jp.kkfs[117] = 408883172;
        jp.kkfs[118] = -697965982;
        jp.kkfs[119] = 1759849198;
        jp.kkfs[120] = 839269862;
        jp.kkfs[121] = -25269029;
        jp.kkfs[122] = -917760322;
        jp.kkfs[123] = 300603730;
        jp.kkfs[124] = -367129773;
        jp.kkfs[125] = 49150947;
        jp.kkfs[126] = -752099694;
        jp.kkfs[127] = 358781722;
        jp.kkfs[128] = 377090342;
        jp.kkfs[129] = 1018606555;
        jp.kkfs[130] = 878597220;
        jp.kkfs[131] = -1319909020;
        jp.kkfs[132] = 301377322;
        jp.kkfs[133] = 566407330;
        jp.kkfs[134] = 736909876;
        jp.kkfs[135] = 1332228540;
        jp.kkfs[136] = -934524732;
        jp.kkfs[137] = 701389057;
        jp.kkfs[138] = -1502178423;
        jp.kkfs[139] = 1255094430;
        jp.kkfs[140] = 1517858595;
        jp.kkfs[141] = -1666482488;
        jp.kkfs[142] = 953838790;
        jp.kkfs[143] = -2037934023;
        jp.kkfs[144] = 775469750;
        jp.kkfs[145] = 1876155702;
        jp.kkfs[146] = 1364181953;
        jp.kkfs[147] = -1125836938;
        jp.kkfs[148] = -2092417058;
        jp.kkfs[149] = -1891984995;
        jp.kkfs[150] = 1096811925;
        jp.kkfs[151] = 436516151;
        jp.kkfs[152] = 1885833957;
        jp.kkfs[153] = -903697850;
        jp.kkfs[154] = 1204868535;
        jp.kkfs[155] = -1522416669;
        jp.kkfs[156] = -694112467;
        jp.kkfs[157] = -927316079;
        jp.kkfs[158] = 1353290311;
        jp.kkfs[159] = -840779486;
        jp.kkfs[160] = 171316652;
        jp.kkfs[161] = 949603169;
        jp.kkfs[162] = -1944303192;
        jp.kkfs[163] = -1252215323;
        jp.kkfs[164] = -112787817;
        jp.kkfs[165] = -1220107594;
        jp.kkfs[166] = -393218734;
        jp.kkfs[167] = 1777928872;
        jp.kkfs[168] = -1077024163;
        jp.kkfs[169] = -1061079654;
        jp.kkfs[170] = -1584198170;
        jp.kkfs[171] = -1885848581;
        jp.kkfs[172] = 1516772822;
        jp.kkfs[173] = 120514881;
        jp.kkfs[174] = -2107978622;
        jp.kkfs[175] = 369249085;
        jp.kkfs[176] = 1955902908;
        jp.kkfs[177] = 1981784171;
        jp.kkfs[178] = -807097002;
        jp.kkfs[179] = -1125365845;
        jp.kkfs[180] = -955450023;
        jp.kkfs[181] = -1040163315;
        jp.kkfs[182] = -2112551049;
        jp.kkfs[183] = -1311282280;
        jp.kkfs[184] = -1228997502;
        jp.kkfs[185] = -1455231441;
        jp.kkfs[186] = 226938355;
        jp.kkfs[187] = 2070825469;
        jp.kkfs[188] = -1341230909;
        jp.kkfs[189] = 48019735;
        jp.kkfs[190] = 1584254500;
        jp.kkfs[191] = 1565052980;
        jp.kkfs[192] = 1401923035;
        jp.kkfs[193] = -885185369;
        jp.kkfs[194] = 959315785;
        jp.kkfs[195] = 508043264;
        jp.kkfs[196] = -458038934;
        jp.kkfs[197] = -1476515837;
        jp.kkfs[198] = 1147123538;
        jp.kkfs[199] = -1622702640;
    }

    private static /* synthetic */ int kkfq(int n2) {
        return kkfr[n2] ^ kkfs[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderWorldPanel(class_332 var1_1, List<class_1799> var2_2, int var3_3, int var4_4) {
        var13_5 = jp.c;
        var12_6 /* !! */  = jp.b;
        var11_7 = jp.a;
        if (var13_5) {
            throw null;
lbl6:
            // 21 sources

            return;
        }
        if (var11_7 || var11_7) ** GOTO lbl6
        var5_8 = var1_1.method_51448();
        if (var11_7 || var11_7) ** GOTO lbl6
        var5_8.pushMatrix();
        if (var11_7 || var11_7) ** GOTO lbl6
        var5_8.translate((float)var3_3, (float)var4_4);
        if (var11_7 || var11_7) ** GOTO lbl6
        var5_8.scale((float)jp.kkft("kkym", kkkw(int ), (int)280), (float)jp.kkft("kkyn", kkkw(int ), (int)281));
        if (var11_7 || var11_7) ** GOTO lbl6
        var1_1.method_25290(class_10799.field_56883, jp.SHULKER_TEXTURE, (int)jp.kkft("kkyp", kkfq(int ), (int)282), (int)jp.kkft("kkyr", kkfq(int ), (int)283), 0.0f, 0.0f, (int)jp.kkft("kkys", kkfq(int ), (int)284), (int)jp.kkft("kkyt", kkfq(int ), (int)285), (int)jp.kkft("kkyv", kkfq(int ), (int)286), (int)jp.kkft("kkyw", kkfq(int ), (int)287));
        if (var11_7 || var11_7) ** GOTO lbl6
        var5_8.popMatrix();
        if (var11_7 || var11_7) ** GOTO lbl6
        var6_9 = jp.kkft("kkyx", kkkw(int ), (int)288);
        if (var11_7 || var11_7) ** GOTO lbl6
        var7_10 = jp.kkft("kkyz", kkfq(int ), (int)289);
        if (var11_7) ** GOTO lbl6
        block43: while (true) {
            block81: {
                if (var11_7 || var11_7) ** GOTO lbl6
                if (var7_10 >= Math.min((int)jp.kkft("kkzb", kkfq(int ), (int)290), var2_2.size())) ** GOTO lbl57
                if (var11_7 || var11_7) ** GOTO lbl6
                var8_11 = var2_2.get((int)var7_10);
                if (var11_7 || var11_7) ** GOTO lbl6
                if (!var8_11.method_7960()) break block81;
                if (var11_7 || var11_7) ** GOTO lbl6
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl52
            }
            if (var11_7) ** GOTO lbl6
            if (var12_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var12_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var11_7) ** GOTO lbl6
                    var9_12 = (float)var3_3 + (float)(jp.kkft("kkzg", kkfq(int ), (int)291) + var7_10 % jp.kkft("kkzi", kkfq(int ), (int)292) * jp.kkft("kkzj", kkfq(int ), (int)293)) * jp.kkft("kkzm", kkkw(int ), (int)294);
                    if (var11_7 || var11_7) ** GOTO lbl6
                    var10_13 = (float)var4_4 + (float)(jp.kkft("kkzo", kkfq(int ), (int)295) + var7_10 / jp.kkft("kkzp", kkfq(int ), (int)296) * jp.kkft("kkzr", kkfq(int ), (int)297)) * jp.kkft("kkzt", kkkw(int ), (int)298);
                    if (var11_7 || var11_7) ** GOTO lbl6
                    this.queueWorldItem(var1_1, var8_11, var9_12, var10_13, (float)var6_9);
                    if (var11_7) ** GOTO lbl6
lbl52:
                    // 2 sources

                    if (var11_7 || var11_7) ** GOTO lbl6
                    ++var7_10;
                    if (var11_7) ** GOTO lbl6
                    if (!var13_5) continue block43;
                    throw null;
                }
lbl57:
                // 1 sources

                if (!var11_7 && !var11_7) ** break;
                ** continue;
                return;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var12_6 /* !! */  = (int)jp.kkft("kkzv", kkfq(int ), (int)299);
                        if (var13_5) {
                            throw null;
                        }
                        ** GOTO lbl202
                        break;
                    }
                }
                case 1: {
                    var12_6 /* !! */  = (int)jp.kkft("kkzw", kkfq(int ), (int)300);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl75
                }
lbl71:
                // 4 sources

                case 2: {
                    var12_6 /* !! */  = (int)jp.kkft("kkzy", kkfq(int ), (int)301);
                    if (var13_5) {
                        throw null;
                    }
                }
lbl75:
                // 4 sources

                case 3: {
                    var12_6 /* !! */  = (int)jp.kkft("klaa", kkfq(int ), (int)302);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl95
                }
lbl80:
                // 3 sources

                case 4: {
                    var12_6 /* !! */  = (int)jp.kkft("klac", kkfq(int ), (int)303);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
lbl85:
                // 3 sources

                case 5: {
                    do {
                        var12_6 /* !! */  = (int)jp.kkft("klae", kkfq(int ), (int)304);
                    } while (!var13_5);
                    throw null;
                }
                case 6: {
                    var12_6 /* !! */  = (int)jp.kkft("klaf", kkfq(int ), (int)305);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
lbl95:
                // 2 sources

                case 7: {
                    var12_6 /* !! */  = (int)jp.kkft("klag", kkfq(int ), (int)306);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 8: {
                    var12_6 /* !! */  = (int)jp.kkft("klah", kkfq(int ), (int)307);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl105:
                // 2 sources

                case 9: {
                    var12_6 /* !! */  = (int)jp.kkft("klai", kkfq(int ), (int)308);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl119
                }
                case 10: {
                    var12_6 /* !! */  = (int)jp.kkft("klak", kkfq(int ), (int)309);
                    if (!var13_5) ** GOTO lbl85
                    throw null;
                }
                case 11: {
                    do {
                        var12_6 /* !! */  = (int)jp.kkft("klam", kkfq(int ), (int)310);
                    } while (!var13_5);
                    throw null;
                }
lbl119:
                // 3 sources

                case 12: {
                    do {
                        var12_6 /* !! */  = (int)jp.kkft("klan", kkfq(int ), (int)311);
                    } while (!var13_5);
                    throw null;
                }
                case 13: {
                    var12_6 /* !! */  = (int)jp.kkft("klap", kkfq(int ), (int)312);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl129:
                // 2 sources

                case 14: {
                    var12_6 /* !! */  = (int)jp.kkft("klaq", kkfq(int ), (int)313);
                    if (!var13_5) ** GOTO lbl85
                    throw null;
                }
lbl133:
                // 2 sources

                case 15: {
                    var12_6 /* !! */  = (int)jp.kkft("klar", kkfq(int ), (int)314);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl179
                }
                case 16: {
                    var12_6 /* !! */  = (int)jp.kkft("klas", kkfq(int ), (int)315);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
                case 17: {
                    var12_6 /* !! */  = (int)jp.kkft("klat", kkfq(int ), (int)316);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
lbl148:
                // 2 sources

                case 18: {
                    var12_6 /* !! */  = (int)jp.kkft("klau", kkfq(int ), (int)317);
                    if (!var13_5) ** GOTO lbl133
                    throw null;
                }
lbl152:
                // 2 sources

                case 19: {
                    var12_6 /* !! */  = (int)jp.kkft("klav", kkfq(int ), (int)318);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl198
                }
                case 20: {
                    var12_6 /* !! */  = (int)jp.kkft("klaw", kkfq(int ), (int)319);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl162:
                // 2 sources

                case 21: {
                    var12_6 /* !! */  = (int)jp.kkft("klax", kkfq(int ), (int)320);
                    if (!var13_5) ** GOTO lbl71
                    throw null;
                }
lbl166:
                // 2 sources

                case 22: {
                    var12_6 /* !! */  = (int)jp.kkft("klaz", kkfq(int ), (int)321);
                    if (!var13_5) ** GOTO lbl162
                    throw null;
                }
lbl170:
                // 3 sources

                case 23: {
                    var12_6 /* !! */  = (int)jp.kkft("klba", kkfq(int ), (int)322);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
                case 24: {
                    var12_6 /* !! */  = (int)jp.kkft("klbb", kkfq(int ), (int)323);
                    if (!var13_5) ** GOTO lbl80
                    throw null;
                }
lbl179:
                // 2 sources

                case 25: {
                    var12_6 /* !! */  = (int)jp.kkft("klbc", kkfq(int ), (int)324);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl194
                }
                case 26: {
                    var12_6 /* !! */  = (int)jp.kkft("klbd", kkfq(int ), (int)325);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl194
                }
lbl189:
                // 3 sources

                case 27: {
                    var12_6 /* !! */  = (int)jp.kkft("klbf", kkfq(int ), (int)326);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
lbl194:
                // 4 sources

                case 28: {
                    var12_6 /* !! */  = (int)jp.kkft("klbg", kkfq(int ), (int)327);
                    if (!var13_5) ** GOTO lbl170
                    throw null;
                }
lbl198:
                // 2 sources

                case 29: {
                    var12_6 /* !! */  = (int)jp.kkft("klbh", kkfq(int ), (int)328);
                    if (!var13_5) ** GOTO lbl152
                    throw null;
                }
lbl202:
                // 3 sources

                case 30: {
                    var12_6 /* !! */  = (int)jp.kkft("klbi", kkfq(int ), (int)329);
                    if (!var13_5) ** GOTO lbl194
                    throw null;
                }
                case 31: {
                    var12_6 /* !! */  = (int)jp.kkft("klbj", kkfq(int ), (int)330);
                    if (!var13_5) ** GOTO lbl71
                    throw null;
                }
lbl210:
                // 2 sources

                case 32: {
                    var12_6 /* !! */  = (int)jp.kkft("klbk", kkfq(int ), (int)331);
                    if (!var13_5) ** GOTO lbl80
                    throw null;
                }
lbl214:
                // 3 sources

                case 33: {
                    var12_6 /* !! */  = (int)jp.kkft("klbl", kkfq(int ), (int)332);
                    if (!var13_5) ** GOTO lbl71
                    throw null;
                }
lbl218:
                // 2 sources

                case 34: {
                    var12_6 /* !! */  = (int)jp.kkft("klbm", kkfq(int ), (int)333);
                    if (!var13_5) ** GOTO lbl210
                    throw null;
                }
                case 35: {
                    do {
                        var12_6 /* !! */  = (int)jp.kkft("klbo", kkfq(int ), (int)334);
                    } while (!var13_5);
                    throw null;
                }
                case 36: {
                    var12_6 /* !! */  = (int)jp.kkft("klbp", kkfq(int ), (int)335);
                    if (!var13_5) ** GOTO lbl170
                    throw null;
                }
                case 37: {
                    var12_6 /* !! */  = (int)jp.kkft("klbq", kkfq(int ), (int)336);
                    if (!var13_5) ** GOTO lbl119
                    throw null;
                }
lbl235:
                // 2 sources

                case 38: {
                    var12_6 /* !! */  = (int)jp.kkft("klbr", kkfq(int ), (int)337);
                    if (!var13_5) ** GOTO lbl105
                    throw null;
                }
                case 39: 
            }
            break;
        }
        var12_6 /* !! */  = (int)jp.kkft("klbs", kkfq(int ), (int)338);
        ** while (!var13_5)
lbl242:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kllp() {
        jp.kkgg[0] = -3684620683338241002L;
        jp.kkgg[1] = 4401251219587502072L;
        jp.kkgg[2] = 624413103161507797L;
        jp.kkgg[3] = 4444013582203381397L;
        jp.kkgg[4] = -822772734299152081L;
        jp.kkgg[5] = 4147445739902888186L;
        jp.kkgg[6] = 3322026998085531124L;
        jp.kkgg[7] = 6474811043158959204L;
        jp.kkgg[8] = 222219864520256167L;
        jp.kkgg[9] = 1531420124841925721L;
        jp.kkgg[10] = -5949626270994856237L;
        jp.kkgg[11] = 4234627303830985913L;
        jp.kkgg[12] = 6120666434180340321L;
        jp.kkgg[13] = -2534618933014093208L;
        jp.kkgg[14] = 4762580505389019070L;
        jp.kkgg[15] = -6524879144043088189L;
        jp.kkgg[16] = 6416393786810632409L;
        jp.kkgg[17] = -8927280763948762177L;
        jp.kkgg[18] = -4164021884837708944L;
        jp.kkgg[19] = -214399917583897484L;
        jp.kkgg[20] = 650232589746635469L;
        jp.kkgg[21] = -567832334543592933L;
        jp.kkgg[22] = -7050177112523657486L;
        jp.kkgg[23] = -2114457846084681229L;
        jp.kkgg[24] = -2378070674690254938L;
        jp.kkgg[25] = 8489646703980939616L;
        jp.kkgg[26] = -8307424331124183793L;
        jp.kkgg[27] = 867746552043712682L;
        jp.kkgg[28] = -3631572209817191739L;
        jp.kkgg[29] = -6126048862330241891L;
        jp.kkgg[30] = -5211173976033057645L;
        jp.kkgg[31] = -2523099126565185787L;
        jp.kkgg[32] = -1860454213339708206L;
        jp.kkgg[33] = 9164942538001749977L;
        jp.kkgg[34] = 5685290495823039005L;
        jp.kkgg[35] = 6767361225769062895L;
        jp.kkgg[36] = -7488190257253537329L;
        jp.kkgg[37] = 8144062876470096991L;
        jp.kkgg[38] = -1797077495805014189L;
        jp.kkgg[39] = -5682925011979504238L;
        jp.kkgg[40] = 392753513794191258L;
        jp.kkgg[41] = -3585071234678021443L;
        jp.kkgg[42] = 6766371234005887997L;
        jp.kkgg[43] = 7180400846325352696L;
        jp.kkgg[44] = 4655262548367233298L;
        jp.kkgg[45] = 1669276507398275508L;
        jp.kkgg[46] = -5488076146661638663L;
        jp.kkgg[47] = 599936693782816391L;
        jp.kkgg[48] = 447925378842862720L;
        jp.kkgg[49] = 1861678371168416293L;
        jp.kkgg[50] = 3887897442566935736L;
        jp.kkgg[51] = -9060836921381940991L;
        jp.kkgg[52] = -7591963487087425056L;
        jp.kkgg[53] = -7040208027662515767L;
        jp.kkgg[54] = 2227224769040902120L;
        jp.kkgg[55] = 484009741702415877L;
        jp.kkgg[56] = -1711652567280698995L;
        jp.kkgg[57] = -4459767387902849599L;
        jp.kkgg[58] = -7350662217441654876L;
        jp.kkgg[59] = 3921708950063115424L;
        jp.kkgg[60] = 7036584175943846004L;
        jp.kkgg[61] = -3708714510573541685L;
        jp.kkgg[62] = -14409559078833333L;
        jp.kkgg[63] = 4386872354346848083L;
        jp.kkgg[64] = -2074534631843301156L;
        jp.kkgg[65] = -6430467605115688376L;
        jp.kkgg[66] = 1451389138179895328L;
        jp.kkgg[67] = -4873020717042180023L;
        jp.kkgg[68] = 6940943544763423576L;
        jp.kkgg[69] = -8173703592913665223L;
        jp.kkgg[70] = -685600489649473678L;
        jp.kkgg[71] = -4190708032594790699L;
        jp.kkgg[72] = 3114975575764092885L;
        jp.kkgg[73] = -6458104268548696583L;
        jp.kkgg[74] = 2899444524853238886L;
        jp.kkgg[75] = -2483787807978116285L;
        jp.kkgg[76] = -8689180163671623935L;
        jp.kkgg[77] = -6145367942440504746L;
        jp.kkgg[78] = -4066533893691455323L;
        jp.kkgg[79] = -7437618914953869823L;
        jp.kkgg[80] = 3864090418726592309L;
        jp.kkgg[81] = -7632106041126782488L;
        jp.kkgg[82] = 6406897015569549440L;
        jp.kkgg[83] = 5814286932955586721L;
        jp.kkgg[84] = -5903932329513259508L;
        jp.kkgg[85] = 2128957463780189534L;
        jp.kkgg[86] = 6186250770687939289L;
        jp.kkgg[87] = -4506460713470939672L;
        jp.kkgg[88] = -4969122283629576106L;
        jp.kkgg[89] = 8303660888036244575L;
        jp.kkgg[90] = 7211654788408221667L;
        jp.kkgg[91] = -1962919939309106262L;
        jp.kkgg[92] = -6980814970051149784L;
        jp.kkgg[93] = 7133068868968073285L;
        jp.kkgg[94] = -7432216920072622423L;
        jp.kkgg[95] = -7499449569226320836L;
        jp.kkgg[96] = 5944996295378030756L;
        jp.kkgg[97] = -754328795489843608L;
        jp.kkgg[98] = 6898742779221562155L;
        jp.kkgg[99] = -6872007927718399821L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ double lambda$onDraw$0(jp$WorldShulker jp$WorldShulker) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = sm - jp.kkft("klkg", kkgf(int ), (int)89)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == jp.kkft("klkh", kkfq(int ), (int)502)) break;
            object = jp.kkft("klki", kkfq(int ), (int)503);
        }
        boolean bl2 = c;
        Object object = sm;
        block13: while (true) {
            switch ((int)object) {
                case 260192591: {
                    object = jp.kkft("klkk", kkgf(int ), (int)91) - jp.kkft("klkj", kkgf(int ), (int)90);
                    continue block13;
                }
                case 825315334: {
                    break block13;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = sm;
        block14: while (true) {
            switch ((int)object2) {
                case -1469120331: {
                    object2 = jp.kkft("klkm", kkgf(int ), (int)93) - jp.kkft("klkl", kkgf(int ), (int)92);
                    continue block14;
                }
                case 825315334: {
                    break block14;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (double)jp.kkft("klkn", kkkt(int ), (int)94);
        if (bl3) return (double)jp.kkft("klkn", kkkt(int ), (int)94);
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = sm - jp.kkft("klko", kkgf(int ), (int)95)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == jp.kkft("klkp", kkfq(int ), (int)504)) break;
            object3 = jp.kkft("klkq", kkfq(int ), (int)505);
        }
        class_1542 class_15422 = jp$WorldShulker.item;
        Object object4 = sm;
        block16: while (true) {
            switch ((int)object4) {
                case -86820505: {
                    object4 = jp.kkft("klks", kkgf(int ), (int)97) - jp.kkft("klkr", kkgf(int ), (int)96);
                    continue block16;
                }
                case 825315334: {
                    break block16;
                }
            }
            break;
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = sm - jp.kkft("klkt", kkgf(int ), (int)98)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == jp.kkft("klku", kkfq(int ), (int)506)) break;
            object5 = jp.kkft("klkv", kkfq(int ), (int)507);
        }
        class_746 class_7462 = jp.mc.field_1724;
        while (true) {
            long l5;
            Object object6;
            if ((object6 = (l5 = sm - jp.kkft("klkw", kkgf(int ), (int)99)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object6 == jp.kkft("klkx", kkfq(int ), (int)508)) {
                return -class_15422.method_5858((class_1297)class_7462);
            }
            object6 = jp.kkft("klky", kkfq(int ), (int)509);
        }
    }

    private static /* synthetic */ long kkgf(int n2) {
        return kkgg[n2] ^ kkgh[n2];
    }

    private static /* synthetic */ void klle() {
        jp.kkfr[100] = 641685424;
        jp.kkfr[101] = 1831504271;
        jp.kkfr[102] = 684559014;
        jp.kkfr[103] = -1219256354;
        jp.kkfr[104] = 1716708177;
        jp.kkfr[105] = 694165308;
        jp.kkfr[106] = -1998340120;
        jp.kkfr[107] = 603864418;
        jp.kkfr[108] = -360659790;
        jp.kkfr[109] = 1247469089;
        jp.kkfr[110] = 876007287;
        jp.kkfr[111] = 1348071644;
        jp.kkfr[112] = 2044660890;
        jp.kkfr[113] = 370787128;
        jp.kkfr[114] = 1052421523;
        jp.kkfr[115] = 1496402166;
        jp.kkfr[116] = -579775101;
        jp.kkfr[117] = 408883140;
        jp.kkfr[118] = -697966045;
        jp.kkfr[119] = 1759849208;
        jp.kkfr[120] = 839269880;
        jp.kkfr[121] = -25268999;
        jp.kkfr[122] = -917760360;
        jp.kkfr[123] = 300603670;
        jp.kkfr[124] = -367129789;
        jp.kkfr[125] = 49150964;
        jp.kkfr[126] = -752099619;
        jp.kkfr[127] = 358781754;
        jp.kkfr[128] = 377090326;
        jp.kkfr[129] = 1018606545;
        jp.kkfr[130] = 878597186;
        jp.kkfr[131] = -1319909039;
        jp.kkfr[132] = 301377340;
        jp.kkfr[133] = 566407330;
        jp.kkfr[134] = 736909829;
        jp.kkfr[135] = 1332228592;
        jp.kkfr[136] = -934524689;
        jp.kkfr[137] = 701389121;
        jp.kkfr[138] = -1502178355;
        jp.kkfr[139] = 1255094410;
        jp.kkfr[140] = 1517858573;
        jp.kkfr[141] = -1666482437;
        jp.kkfr[142] = 953838835;
        jp.kkfr[143] = -2037934029;
        jp.kkfr[144] = 775469720;
        jp.kkfr[145] = 1876155686;
        jp.kkfr[146] = 1364182000;
        jp.kkfr[147] = -1125836934;
        jp.kkfr[148] = -2092417053;
        jp.kkfr[149] = -1891984994;
        jp.kkfr[150] = 1096811947;
        jp.kkfr[151] = 436516218;
        jp.kkfr[152] = 1885833964;
        jp.kkfr[153] = -903697825;
        jp.kkfr[154] = 1204868495;
        jp.kkfr[155] = -1522416672;
        jp.kkfr[156] = -694112512;
        jp.kkfr[157] = -927316016;
        jp.kkfr[158] = 1353290366;
        jp.kkfr[159] = -840779484;
        jp.kkfr[160] = 171316714;
        jp.kkfr[161] = 949603157;
        jp.kkfr[162] = -1944303169;
        jp.kkfr[163] = -1252215335;
        jp.kkfr[164] = -112787815;
        jp.kkfr[165] = -1220107642;
        jp.kkfr[166] = -393218729;
        jp.kkfr[167] = 1777928930;
        jp.kkfr[168] = -1077024154;
        jp.kkfr[169] = -1061079671;
        jp.kkfr[170] = -1584198184;
        jp.kkfr[171] = -1885848628;
        jp.kkfr[172] = 1516772823;
        jp.kkfr[173] = 120514882;
        jp.kkfr[174] = -2107978579;
        jp.kkfr[175] = 369249079;
        jp.kkfr[176] = 1955902881;
        jp.kkfr[177] = 1981784152;
        jp.kkfr[178] = -807097002;
        jp.kkfr[179] = -1125365845;
        jp.kkfr[180] = -2051211943;
        jp.kkfr[181] = -2147066355;
        jp.kkfr[182] = -2112551049;
        jp.kkfr[183] = -1311282278;
        jp.kkfr[184] = -1228997498;
        jp.kkfr[185] = -1455231445;
        jp.kkfr[186] = 226938359;
        jp.kkfr[187] = 2070825465;
        jp.kkfr[188] = -1341230910;
        jp.kkfr[189] = 48019717;
        jp.kkfr[190] = 1584254516;
        jp.kkfr[191] = 1565052967;
        jp.kkfr[192] = 1401923016;
        jp.kkfr[193] = -885185402;
        jp.kkfr[194] = 959315818;
        jp.kkfr[195] = 508043297;
        jp.kkfr[196] = -458038921;
        jp.kkfr[197] = -1476515830;
        jp.kkfr[198] = 1147123574;
        jp.kkfr[199] = -1622702644;
    }

    private static /* synthetic */ void klln() {
        jp.kkfs[400] = 1415597614;
        jp.kkfs[401] = 1920594027;
        jp.kkfs[402] = -1599924973;
        jp.kkfs[403] = -1391971772;
        jp.kkfs[404] = 1895653347;
        jp.kkfs[405] = -1987927741;
        jp.kkfs[406] = -264960215;
        jp.kkfs[407] = 695603569;
        jp.kkfs[408] = 1163851812;
        jp.kkfs[409] = 1692251304;
        jp.kkfs[410] = -2061623577;
        jp.kkfs[411] = 394064860;
        jp.kkfs[412] = -454900837;
        jp.kkfs[413] = 882006461;
        jp.kkfs[414] = -1816641377;
        jp.kkfs[415] = -987753257;
        jp.kkfs[416] = 1674453151;
        jp.kkfs[417] = 2044372894;
        jp.kkfs[418] = -3268906;
        jp.kkfs[419] = 1433110281;
        jp.kkfs[420] = -1880030959;
        jp.kkfs[421] = 47332516;
        jp.kkfs[422] = 867967546;
        jp.kkfs[423] = 1456222029;
        jp.kkfs[424] = 28611945;
        jp.kkfs[425] = 1775832552;
        jp.kkfs[426] = -375169838;
        jp.kkfs[427] = -2144204327;
        jp.kkfs[428] = 1661015307;
        jp.kkfs[429] = 1020603142;
        jp.kkfs[430] = 1761344631;
        jp.kkfs[431] = -1775297118;
        jp.kkfs[432] = -465094689;
        jp.kkfs[433] = -1041860062;
        jp.kkfs[434] = -1917325182;
        jp.kkfs[435] = 1871167999;
        jp.kkfs[436] = 934229280;
        jp.kkfs[437] = -422858704;
        jp.kkfs[438] = 1140700870;
        jp.kkfs[439] = 13572748;
        jp.kkfs[440] = 137911154;
        jp.kkfs[441] = -429389457;
        jp.kkfs[442] = -1215396928;
        jp.kkfs[443] = 2062871888;
        jp.kkfs[444] = 196187706;
        jp.kkfs[445] = 1660109664;
        jp.kkfs[446] = 829822238;
        jp.kkfs[447] = 1066352770;
        jp.kkfs[448] = -1182743852;
        jp.kkfs[449] = -1226472971;
        jp.kkfs[450] = 895172349;
        jp.kkfs[451] = 1444839749;
        jp.kkfs[452] = -549105842;
        jp.kkfs[453] = 1543081512;
        jp.kkfs[454] = -80337690;
        jp.kkfs[455] = -1260550087;
        jp.kkfs[456] = 1554382472;
        jp.kkfs[457] = -931375117;
        jp.kkfs[458] = 2034817657;
        jp.kkfs[459] = 1894496241;
        jp.kkfs[460] = -311075898;
        jp.kkfs[461] = -657575636;
        jp.kkfs[462] = -605089401;
        jp.kkfs[463] = -1940175415;
        jp.kkfs[464] = -995388146;
        jp.kkfs[465] = 1820273244;
        jp.kkfs[466] = -1020512451;
        jp.kkfs[467] = -2143866106;
        jp.kkfs[468] = -2467024;
        jp.kkfs[469] = -310483199;
        jp.kkfs[470] = -1669390534;
        jp.kkfs[471] = -2045402940;
        jp.kkfs[472] = 1669861542;
        jp.kkfs[473] = -1306592195;
        jp.kkfs[474] = 16527434;
        jp.kkfs[475] = -886853554;
        jp.kkfs[476] = 1736477419;
        jp.kkfs[477] = 285435500;
        jp.kkfs[478] = -1024108370;
        jp.kkfs[479] = 111855745;
        jp.kkfs[480] = 2139170911;
        jp.kkfs[481] = -95353344;
        jp.kkfs[482] = -1207534304;
        jp.kkfs[483] = -278554902;
        jp.kkfs[484] = 1108229427;
        jp.kkfs[485] = -319020406;
        jp.kkfs[486] = 576455715;
        jp.kkfs[487] = 308156510;
        jp.kkfs[488] = 1798592333;
        jp.kkfs[489] = 1878501228;
        jp.kkfs[490] = -339660887;
        jp.kkfs[491] = -1815202477;
        jp.kkfs[492] = -182681046;
        jp.kkfs[493] = 129591220;
        jp.kkfs[494] = -1306777277;
        jp.kkfs[495] = -171215106;
        jp.kkfs[496] = -143736983;
        jp.kkfs[497] = -1195919205;
        jp.kkfs[498] = -1471084135;
        jp.kkfs[499] = -1763893461;
    }

    static {
        kkfr = new int[514];
        kkfs = new int[514];
        jp.klld();
        jp.klle();
        jp.kllf();
        jp.kllg();
        jp.kllh();
        jp.klli();
        jp.kllj();
        jp.kllk();
        jp.klll();
        jp.kllm();
        jp.klln();
        jp.kllo();
        kkgg = new long[100];
        kkgh = new long[100];
        jp.kllp();
        jp.kllq();
        SHULKER_TEXTURE = class_2960.method_60655((String)"phobia", (String)"images/hud/container.png");
    }

    private static /* synthetic */ void kllf() {
        jp.kkfr[200] = 1863210489;
        jp.kkfr[201] = -912788121;
        jp.kkfr[202] = -484321028;
        jp.kkfr[203] = 2012221277;
        jp.kkfr[204] = -547368707;
        jp.kkfr[205] = -1014309232;
        jp.kkfr[206] = 1796755208;
        jp.kkfr[207] = 542148077;
        jp.kkfr[208] = 1765709852;
        jp.kkfr[209] = 1694553776;
        jp.kkfr[210] = 1753639222;
        jp.kkfr[211] = 1337184851;
        jp.kkfr[212] = 1158228842;
        jp.kkfr[213] = -266717389;
        jp.kkfr[214] = -1579553440;
        jp.kkfr[215] = -1202975930;
        jp.kkfr[216] = 1377950323;
        jp.kkfr[217] = 1261415225;
        jp.kkfr[218] = -1946881157;
        jp.kkfr[219] = 870888830;
        jp.kkfr[220] = -481793486;
        jp.kkfr[221] = 395141993;
        jp.kkfr[222] = 1590811786;
        jp.kkfr[223] = -1538066797;
        jp.kkfr[224] = -854706599;
        jp.kkfr[225] = -1966474458;
        jp.kkfr[226] = 134086191;
        jp.kkfr[227] = 307413631;
        jp.kkfr[228] = 1279624827;
        jp.kkfr[229] = -1390564143;
        jp.kkfr[230] = -1155739860;
        jp.kkfr[231] = 353124926;
        jp.kkfr[232] = 186912015;
        jp.kkfr[233] = 1313127686;
        jp.kkfr[234] = -781274458;
        jp.kkfr[235] = -527106486;
        jp.kkfr[236] = 719043649;
        jp.kkfr[237] = -708688951;
        jp.kkfr[238] = 1433643262;
        jp.kkfr[239] = -359364470;
        jp.kkfr[240] = -202608410;
        jp.kkfr[241] = -1459180188;
        jp.kkfr[242] = -529298852;
        jp.kkfr[243] = 1186772056;
        jp.kkfr[244] = -1935402272;
        jp.kkfr[245] = 2085593866;
        jp.kkfr[246] = 171610308;
        jp.kkfr[247] = 1596036558;
        jp.kkfr[248] = -1435869129;
        jp.kkfr[249] = -1471334509;
        jp.kkfr[250] = 1626492400;
        jp.kkfr[251] = -1371941913;
        jp.kkfr[252] = -1429214758;
        jp.kkfr[253] = -655196734;
        jp.kkfr[254] = -856925220;
        jp.kkfr[255] = -1781264739;
        jp.kkfr[256] = 1546178521;
        jp.kkfr[257] = -946475341;
        jp.kkfr[258] = 464872291;
        jp.kkfr[259] = 1339448353;
        jp.kkfr[260] = 771545597;
        jp.kkfr[261] = -2048376714;
        jp.kkfr[262] = -1273216622;
        jp.kkfr[263] = 2137596881;
        jp.kkfr[264] = -1357937281;
        jp.kkfr[265] = 1586402568;
        jp.kkfr[266] = -1019056918;
        jp.kkfr[267] = -612443993;
        jp.kkfr[268] = -2073229239;
        jp.kkfr[269] = -711515676;
        jp.kkfr[270] = 1988616845;
        jp.kkfr[271] = 1253988203;
        jp.kkfr[272] = 839434816;
        jp.kkfr[273] = -1664240048;
        jp.kkfr[274] = -1871300677;
        jp.kkfr[275] = 485355130;
        jp.kkfr[276] = -1521692349;
        jp.kkfr[277] = -1066941452;
        jp.kkfr[278] = 754163523;
        jp.kkfr[279] = -1554427894;
        jp.kkfr[280] = -725500510;
        jp.kkfr[281] = 316001843;
        jp.kkfr[282] = 1145043274;
        jp.kkfr[283] = -1869809838;
        jp.kkfr[284] = -2031062581;
        jp.kkfr[285] = 1795318596;
        jp.kkfr[286] = 701185550;
        jp.kkfr[287] = 1415953979;
        jp.kkfr[288] = -1022365971;
        jp.kkfr[289] = -1373306290;
        jp.kkfr[290] = 890625904;
        jp.kkfr[291] = 874229709;
        jp.kkfr[292] = -1590461985;
        jp.kkfr[293] = -137259130;
        jp.kkfr[294] = 599844015;
        jp.kkfr[295] = -2099555962;
        jp.kkfr[296] = 2076518597;
        jp.kkfr[297] = -1336710661;
        jp.kkfr[298] = -1191383661;
        jp.kkfr[299] = -17763688;
    }

    private static /* synthetic */ void kllh() {
        jp.kkfr[400] = 1415597591;
        jp.kkfr[401] = 1920594015;
        jp.kkfr[402] = -1599924958;
        jp.kkfr[403] = -1391971761;
        jp.kkfr[404] = 1895653361;
        jp.kkfr[405] = -1987927716;
        jp.kkfr[406] = -264960246;
        jp.kkfr[407] = 695603522;
        jp.kkfr[408] = 1163851776;
        jp.kkfr[409] = 1692251270;
        jp.kkfr[410] = -2061623593;
        jp.kkfr[411] = 394064841;
        jp.kkfr[412] = -454900825;
        jp.kkfr[413] = 882006454;
        jp.kkfr[414] = -1816641390;
        jp.kkfr[415] = -987753232;
        jp.kkfr[416] = 1674453153;
        jp.kkfr[417] = 2044372901;
        jp.kkfr[418] = -3268875;
        jp.kkfr[419] = 1433110330;
        jp.kkfr[420] = -1880030928;
        jp.kkfr[421] = 47332538;
        jp.kkfr[422] = 867967525;
        jp.kkfr[423] = 1456222016;
        jp.kkfr[424] = 28611933;
        jp.kkfr[425] = 1775832570;
        jp.kkfr[426] = -375169823;
        jp.kkfr[427] = -2144204329;
        jp.kkfr[428] = 1661015304;
        jp.kkfr[429] = 1020603186;
        jp.kkfr[430] = 1761344596;
        jp.kkfr[431] = -1775297119;
        jp.kkfr[432] = -465094719;
        jp.kkfr[433] = -1041860035;
        jp.kkfr[434] = -1917325144;
        jp.kkfr[435] = 1871167973;
        jp.kkfr[436] = 934229281;
        jp.kkfr[437] = -422858710;
        jp.kkfr[438] = 1140700880;
        jp.kkfr[439] = 13572793;
        jp.kkfr[440] = 137911090;
        jp.kkfr[441] = -429389480;
        jp.kkfr[442] = -1215396881;
        jp.kkfr[443] = 2062871903;
        jp.kkfr[444] = 196187693;
        jp.kkfr[445] = 1660109665;
        jp.kkfr[446] = 1459861372;
        jp.kkfr[447] = 1066352771;
        jp.kkfr[448] = -320182160;
        jp.kkfr[449] = 1800069633;
        jp.kkfr[450] = -895172350;
        jp.kkfr[451] = 1595634422;
        jp.kkfr[452] = 549105841;
        jp.kkfr[453] = 2117407442;
        jp.kkfr[454] = -80337693;
        jp.kkfr[455] = -1260550082;
        jp.kkfr[456] = 1554382479;
        jp.kkfr[457] = -931375118;
        jp.kkfr[458] = 2034817662;
        jp.kkfr[459] = 1894496247;
        jp.kkfr[460] = -311075903;
        jp.kkfr[461] = -657575639;
        jp.kkfr[462] = -605089401;
        jp.kkfr[463] = -1940175416;
        jp.kkfr[464] = -703779424;
        jp.kkfr[465] = 1820273245;
        jp.kkfr[466] = -546397263;
        jp.kkfr[467] = -2143866106;
        jp.kkfr[468] = -2467023;
        jp.kkfr[469] = -1401259269;
        jp.kkfr[470] = 1669390533;
        jp.kkfr[471] = 1033807532;
        jp.kkfr[472] = 1669861875;
        jp.kkfr[473] = 1306592194;
        jp.kkfr[474] = -138641092;
        jp.kkfr[475] = -886853553;
        jp.kkfr[476] = 1736477618;
        jp.kkfr[477] = 285435501;
        jp.kkfr[478] = -1024108369;
        jp.kkfr[479] = 111855745;
        jp.kkfr[480] = 2139170905;
        jp.kkfr[481] = -95353339;
        jp.kkfr[482] = -1207534297;
        jp.kkfr[483] = -278554903;
        jp.kkfr[484] = 1108229426;
        jp.kkfr[485] = -319020405;
        jp.kkfr[486] = 576455717;
        jp.kkfr[487] = 308156508;
        jp.kkfr[488] = 1798592335;
        jp.kkfr[489] = 1878501231;
        jp.kkfr[490] = -339660882;
        jp.kkfr[491] = -1815202474;
        jp.kkfr[492] = -182681055;
        jp.kkfr[493] = -129591221;
        jp.kkfr[494] = 1676709661;
        jp.kkfr[495] = 171215105;
        jp.kkfr[496] = 279563676;
        jp.kkfr[497] = -1195919206;
        jp.kkfr[498] = -1471084131;
        jp.kkfr[499] = -1763893462;
    }

    private static /* synthetic */ void kllo() {
        jp.kkfs[500] = 669387493;
        jp.kkfs[501] = 423239169;
        jp.kkfs[502] = -781228174;
        jp.kkfs[503] = -1340754649;
        jp.kkfs[504] = 1825478994;
        jp.kkfs[505] = -886685662;
        jp.kkfs[506] = 1527742425;
        jp.kkfs[507] = 1984853916;
        jp.kkfs[508] = 1107765665;
        jp.kkfs[509] = -222975452;
        jp.kkfs[510] = 1626561440;
        jp.kkfs[511] = 555975497;
        jp.kkfs[512] = 6138567;
        jp.kkfs[513] = 1922898695;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int clamp(int var0, int var1_1, int var2_2) {
        v0 /* !! */  = jp.sm;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - jp.kkft("klgu", kkgf(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 612099122: {
                    v1 = jp.kkft("klgv", kkgf(int ), (int)57);
                    continue block17;
                }
                case 825315334: {
                    break block17;
                }
                case 1618831288: {
                    v1 = jp.kkft("klgw", kkgf(int ), (int)58);
                    continue block17;
                }
                case 1903620348: {
                    v1 = jp.kkft("klgx", kkgf(int ), (int)59);
                    continue block17;
                }
            }
            break;
        }
        var5_3 = jp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jp.sm - jp.kkft("klgy", kkgf(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jp.kkft("klgz", kkfq(int ), (int)445)) break;
            v2 /* !! */  = (long)jp.kkft("klha", kkfq(int ), (int)446);
        }
        var4_4 /* !! */  = jp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jp.sm - jp.kkft("klhb", kkgf(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jp.kkft("klhc", kkfq(int ), (int)447)) break;
            v3 /* !! */  = (long)jp.kkft("klhd", kkfq(int ), (int)448);
        }
        var3_5 = jp.a;
        if (!var5_3) ** GOTO lbl36
        throw null;
lbl-1000:
        // 3 sources

        {
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)jp.kkft("klhe", kkfq(int ), (int)449);
                }
lbl36:
                // 1 sources

                if (var3_5 || var3_5) ** GOTO lbl-1000
                if (var2_2 >= var1_1) continue block20;
                if (var3_5 || var3_5) ** GOTO lbl-1000
                return var1_1;
                if (var3_5 || var3_5) continue block20;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jp.sm - jp.kkft("klhf", kkgf(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jp.kkft("klhg", kkfq(int ), (int)450)) break;
                    v4 /* !! */  = (long)jp.kkft("klhh", kkfq(int ), (int)451);
                }
                v5 = Math.min(var2_2, var0);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = jp.sm - jp.kkft("klhi", kkgf(int ), (int)63)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jp.kkft("klhj", kkfq(int ), (int)452)) break;
                    v6 /* !! */  = (long)jp.kkft("klhk", kkfq(int ), (int)453);
                }
                return Math.max(var1_1, v5);
lbl53:
                // 2 sources

                case 0: {
                    var4_4 /* !! */  = (int)jp.kkft("klhl", kkfq(int ), (int)454);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl85
                }
                case 1: {
                    var4_4 /* !! */  = (int)jp.kkft("klhm", kkfq(int ), (int)455);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl75
                }
lbl63:
                // 2 sources

                case 2: {
                    var4_4 /* !! */  = (int)jp.kkft("klhn", kkfq(int ), (int)456);
                    if (!var5_3) ** GOTO lbl53
                    throw null;
                }
                case 3: {
                    var4_4 /* !! */  = (int)jp.kkft("klho", kkfq(int ), (int)457);
                    if (!var5_3) ** GOTO lbl63
                    throw null;
                }
                case 4: {
                    var4_4 /* !! */  = (int)jp.kkft("klhp", kkfq(int ), (int)458);
                    if (!var5_3) break block20;
                    throw null;
                }
lbl75:
                // 2 sources

                case 5: {
                    var4_4 /* !! */  = (int)jp.kkft("klhq", kkfq(int ), (int)459);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl85
                }
                case 6: {
                    do {
                        var4_4 /* !! */  = (int)jp.kkft("klhr", kkfq(int ), (int)460);
                    } while (!var5_3);
                    throw null;
                }
lbl85:
                // 3 sources

                case 7: {
                    do {
                        var4_4 /* !! */  = (int)jp.kkft("klhs", kkfq(int ), (int)461);
                    } while (!var5_3);
                    throw null;
                }
                case 8: 
            }
        }
        do {
            var4_4 /* !! */  = (int)jp.kkft("klht", kkfq(int ), (int)462);
        } while (!var5_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean queueWorldPreviews(class_332 var1_1) {
        var13_2 = jp.c;
        var12_3 /* !! */  = jp.b;
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var11_4 = jp.a;
                if (var13_2) {
                    throw null;
lbl9:
                    // 19 sources

                    return (boolean)jp.kkft("kkpn", kkfq(int ), (int)178);
                }
                if (var11_4 || var11_4) ** GOTO lbl9
                if (!this.isState()) ** GOTO lbl16
                if (var11_4) ** GOTO lbl9
                if (!this.worldPreviews.isEmpty()) ** GOTO lbl18
                if (var11_4) ** GOTO lbl9
lbl16:
                // 2 sources

                if (var11_4 || var11_4) ** GOTO lbl9
                return (boolean)jp.kkft("kkpr", kkfq(int ), (int)179);
lbl18:
                // 1 sources

                if (var11_4 || var11_4) ** GOTO lbl9
                var2_5 = var1_1.method_51421();
                if (var11_4 || var11_4) ** GOTO lbl9
                var3_6 = var1_1.method_51443();
                if (var11_4 || var11_4) ** GOTO lbl9
                var4_7 = Math.round((float)jp.kkft("kkpu", kkkw(int ), (int)180));
                if (var11_4 || var11_4) ** GOTO lbl9
                var5_8 = Math.round((float)jp.kkft("kkpw", kkkw(int ), (int)181));
                if (var11_4 || var11_4) ** GOTO lbl9
                var6_9 = jp.kkft("kkpy", kkfq(int ), (int)182);
                if (var11_4 || var11_4) ** GOTO lbl9
                var7_10 = this.worldPreviews.iterator();
                if (var11_4) ** GOTO lbl9
                do {
                    if (var11_4 || var11_4) ** GOTO lbl9
                    if (!var7_10.hasNext()) ** GOTO lbl47
                    if (var11_4) ** GOTO lbl9
                    var8_11 = var7_10.next();
                    if (var11_4 || var11_4) ** GOTO lbl9
                    var9_12 = jp.clamp(var8_11.anchorX - var4_7 / jp.kkft("kkqb", kkfq(int ), (int)183), (int)jp.kkft("kkqd", kkfq(int ), (int)184), var2_5 - var4_7 - jp.kkft("kkqe", kkfq(int ), (int)185));
                    if (var11_4 || var11_4) ** GOTO lbl9
                    var10_13 = jp.clamp(var8_11.anchorY, (int)jp.kkft("kkqg", kkfq(int ), (int)186), var3_6 - var5_8 - jp.kkft("kkqi", kkfq(int ), (int)187));
                    if (var11_4 || var11_4) ** GOTO lbl9
                    this.renderWorldPanel(var1_1, var8_11.contents, var9_12, var10_13);
                    if (var11_4 || var11_4) ** GOTO lbl9
                    var6_9 = jp.kkft("kkqk", kkfq(int ), (int)188);
                    if (var11_4 || var11_4) ** GOTO lbl9
                } while (!var13_2);
                throw null;
lbl47:
                // 1 sources

                if (!var11_4 && !var11_4) ** break;
                ** continue;
                return (boolean)var6_9;
            }
lbl50:
            // 5 sources

            case 0: {
                var12_3 /* !! */  = (int)jp.kkft("kkqm", kkfq(int ), (int)189);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var12_3 /* !! */  = (int)jp.kkft("kkqo", kkfq(int ), (int)190);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl60:
            // 3 sources

            case 2: {
                var12_3 /* !! */  = (int)jp.kkft("kkqr", kkfq(int ), (int)191);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl65:
            // 2 sources

            case 3: {
                var12_3 /* !! */  = (int)jp.kkft("kkra", kkfq(int ), (int)192);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl70:
            // 2 sources

            case 4: {
                var12_3 /* !! */  = (int)jp.kkft("kkrd", kkfq(int ), (int)193);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl75:
            // 2 sources

            case 5: {
                var12_3 /* !! */  = (int)jp.kkft("kkrf", kkfq(int ), (int)194);
                if (!var13_2) ** GOTO lbl50
                throw null;
            }
lbl79:
            // 3 sources

            case 6: {
                var12_3 /* !! */  = (int)jp.kkft("kkrh", kkfq(int ), (int)195);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 7: {
                var12_3 /* !! */  = (int)jp.kkft("kkrj", kkfq(int ), (int)196);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl89:
            // 2 sources

            case 8: {
                var12_3 /* !! */  = (int)jp.kkft("kkrk", kkfq(int ), (int)197);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl94:
            // 4 sources

            case 9: {
                var12_3 /* !! */  = (int)jp.kkft("kkrl", kkfq(int ), (int)198);
                if (!var13_2) ** GOTO lbl50
                throw null;
            }
lbl98:
            // 2 sources

            case 10: {
                var12_3 /* !! */  = (int)jp.kkft("kkrm", kkfq(int ), (int)199);
                if (!var13_2) ** GOTO lbl79
                throw null;
            }
            case 11: {
                do {
                    var12_3 /* !! */  = (int)jp.kkft("kkrp", kkfq(int ), (int)200);
                } while (!var13_2);
                throw null;
            }
lbl107:
            // 2 sources

            case 12: {
                var12_3 /* !! */  = (int)jp.kkft("kkrr", kkfq(int ), (int)201);
                if (!var13_2) ** GOTO lbl70
                throw null;
            }
            case 13: {
                var12_3 /* !! */  = (int)jp.kkft("kkrt", kkfq(int ), (int)202);
                if (!var13_2) ** GOTO lbl94
                throw null;
            }
lbl115:
            // 2 sources

            case 14: {
                var12_3 /* !! */  = (int)jp.kkft("kkrw", kkfq(int ), (int)203);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl120:
            // 2 sources

            case 15: {
                var12_3 /* !! */  = (int)jp.kkft("kkry", kkfq(int ), (int)204);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl125:
            // 2 sources

            case 16: {
                var12_3 /* !! */  = (int)jp.kkft("kksb", kkfq(int ), (int)205);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl130:
            // 2 sources

            case 17: {
                var12_3 /* !! */  = (int)jp.kkft("kksc", kkfq(int ), (int)206);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 18: {
                var12_3 /* !! */  = (int)jp.kkft("kkse", kkfq(int ), (int)207);
                if (!var13_2) ** GOTO lbl50
                throw null;
            }
            case 19: {
                var12_3 /* !! */  = (int)jp.kkft("kksh", kkfq(int ), (int)208);
                if (!var13_2) ** GOTO lbl130
                throw null;
            }
lbl143:
            // 4 sources

            case 20: {
                var12_3 /* !! */  = (int)jp.kkft("kksj", kkfq(int ), (int)209);
                if (!var13_2) ** GOTO lbl60
                throw null;
            }
lbl147:
            // 2 sources

            case 21: {
                var12_3 /* !! */  = (int)jp.kkft("kksl", kkfq(int ), (int)210);
                if (!var13_2) ** GOTO lbl115
                throw null;
            }
            case 22: {
                var12_3 /* !! */  = (int)jp.kkft("kksn", kkfq(int ), (int)211);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl156:
            // 2 sources

            case 23: {
                var12_3 /* !! */  = (int)jp.kkft("kksp", kkfq(int ), (int)212);
                if (!var13_2) ** GOTO lbl50
                throw null;
            }
lbl160:
            // 2 sources

            case 24: {
                var12_3 /* !! */  = (int)jp.kkft("kksq", kkfq(int ), (int)213);
                if (!var13_2) break;
                throw null;
            }
            case 25: {
                var12_3 /* !! */  = (int)jp.kkft("kksr", kkfq(int ), (int)214);
                if (!var13_2) ** GOTO lbl79
                throw null;
            }
lbl168:
            // 2 sources

            case 26: {
                var12_3 /* !! */  = (int)jp.kkft("kksu", kkfq(int ), (int)215);
                if (!var13_2) ** GOTO lbl94
                throw null;
            }
            case 27: {
                do {
                    var12_3 /* !! */  = (int)jp.kkft("kksw", kkfq(int ), (int)216);
                } while (!var13_2);
                throw null;
            }
            case 28: {
                var12_3 /* !! */  = (int)jp.kkft("kksz", kkfq(int ), (int)217);
                if (!var13_2) ** GOTO lbl98
                throw null;
            }
            case 29: {
                var12_3 /* !! */  = (int)jp.kkft("kktb", kkfq(int ), (int)218);
                if (var13_2) {
                    throw null;
                }
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_3 /* !! */  = (int)jp.kkft("kkte", kkfq(int ), (int)219);
                    if (!var13_2) ** GOTO lbl60
                    throw null;
                }
            }
lbl190:
            // 4 sources

            case 31: {
                var12_3 /* !! */  = (int)jp.kkft("kktg", kkfq(int ), (int)220);
                if (!var13_2) ** GOTO lbl65
                throw null;
            }
            case 32: {
                var12_3 /* !! */  = (int)jp.kkft("kkti", kkfq(int ), (int)221);
                if (!var13_2) ** GOTO lbl160
                throw null;
            }
lbl198:
            // 2 sources

            case 33: {
                var12_3 /* !! */  = (int)jp.kkft("kktl", kkfq(int ), (int)222);
                if (!var13_2) ** GOTO lbl107
                throw null;
            }
            case 34: {
                var12_3 /* !! */  = (int)jp.kkft("kkto", kkfq(int ), (int)223);
                if (!var13_2) ** GOTO lbl75
                throw null;
            }
            case 35: {
                var12_3 /* !! */  = (int)jp.kkft("kktq", kkfq(int ), (int)224);
                if (!var13_2) ** GOTO lbl147
                throw null;
            }
            case 36: 
        }
        var12_3 /* !! */  = (int)jp.kkft("kkts", kkfq(int ), (int)225);
        ** while (!var13_2)
lbl213:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void queueWorldItem(class_332 var1_1, class_1799 var2_2, float var3_3, float var4_4, float var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp.sm - jp.kkft("klbt", kkgf(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jp.kkft("klbu", kkfq(int ), (int)339)) break;
            v0 /* !! */  = (long)jp.kkft("klbv", kkfq(int ), (int)340);
        }
        var10_6 = jp.c;
        v1 /* !! */  = jp.sm;
        if (true) ** GOTO lbl11
        block54: while (true) {
            v1 /* !! */  = (long)(v2 - jp.kkft("klbw", kkgf(int ), (int)32));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2023902156: {
                    v2 = jp.kkft("klbx", kkgf(int ), (int)33);
                    continue block54;
                }
                case 168714025: {
                    v2 = jp.kkft("klby", kkgf(int ), (int)34);
                    continue block54;
                }
                case 825315334: {
                    break block54;
                }
                case 1067591905: {
                    v2 = jp.kkft("klbz", kkgf(int ), (int)35);
                    continue block54;
                }
            }
            break;
        }
        var9_7 /* !! */  = jp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jp.sm - jp.kkft("klca", kkgf(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jp.kkft("klcb", kkfq(int ), (int)341)) break;
            v3 /* !! */  = (long)jp.kkft("klcc", kkfq(int ), (int)342);
        }
        var8_8 = jp.a;
        if (var10_6) {
            throw null;
lbl32:
            // 10 sources

            return;
        }
        if (var8_8 || var8_8) ** GOTO lbl32
        var6_9 = var5_5 / jp.kkft("klcd", kkkw(int ), (int)343);
        if (var8_8) ** GOTO lbl32
        if (var9_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_8) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jp.sm - jp.kkft("klce", kkgf(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jp.kkft("klcf", kkfq(int ), (int)344)) break;
                    v4 /* !! */  = (long)jp.kkft("klcg", kkfq(int ), (int)345);
                }
                var7_10 = var1_1.method_51448();
                if (var8_8 || var8_8) ** GOTO lbl32
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = jp.sm - jp.kkft("klch", kkgf(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == jp.kkft("klci", kkfq(int ), (int)346)) break;
                    v5 /* !! */  = (long)jp.kkft("klcj", kkfq(int ), (int)347);
                }
                var7_10.pushMatrix();
                if (var8_8 || var8_8) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = jp.sm - jp.kkft("klck", kkgf(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jp.kkft("klcl", kkfq(int ), (int)348)) break;
                    v6 /* !! */  = (long)jp.kkft("klcm", kkfq(int ), (int)349);
                }
                var7_10.translate(var3_3, var4_4);
                if (var8_8 || var8_8) ** GOTO lbl32
                v7 /* !! */  = jp.sm;
                if (true) ** GOTO lbl66
                block60: while (true) {
                    v7 /* !! */  = (long)(v8 - jp.kkft("klcn", kkgf(int ), (int)40));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1604724376: {
                            v8 = jp.kkft("klco", kkgf(int ), (int)41);
                            continue block60;
                        }
                        case 320505309: {
                            v8 = jp.kkft("klcp", kkgf(int ), (int)42);
                            continue block60;
                        }
                        case 825315334: {
                            break block60;
                        }
                    }
                    break;
                }
                var7_10.scale(var6_9, var6_9);
                if (var8_8 || var8_8) ** GOTO lbl32
                v9 = jp.kkft("klcq", kkfq(int ), (int)350);
                v10 = jp.kkft("klcr", kkfq(int ), (int)351);
                v11 /* !! */  = jp.sm;
                if (true) ** GOTO lbl84
                block61: while (true) {
                    v11 /* !! */  = (long)(v12 - jp.kkft("klcs", kkgf(int ), (int)43));
lbl84:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 513608019: {
                            v12 = jp.kkft("klct", kkgf(int ), (int)44);
                            continue block61;
                        }
                        case 825315334: {
                            break block61;
                        }
                        case 1729589357: {
                            v12 = jp.kkft("klcu", kkgf(int ), (int)45);
                            continue block61;
                        }
                    }
                    break;
                }
                var1_1.method_51445(var2_2, (int)v9, (int)v10);
                if (var8_8 || var8_8) ** GOTO lbl32
                v13 /* !! */  = jp.sm;
                if (true) ** GOTO lbl99
                block62: while (true) {
                    v13 /* !! */  = (long)(v14 - jp.kkft("klcv", kkgf(int ), (int)46));
lbl99:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -409809210: {
                            v14 = jp.kkft("klcw", kkgf(int ), (int)47);
                            continue block62;
                        }
                        case -378190341: {
                            v14 = jp.kkft("klcx", kkgf(int ), (int)48);
                            continue block62;
                        }
                        case 825315334: {
                            break block62;
                        }
                        case 1584256560: {
                            v14 = jp.kkft("klcy", kkgf(int ), (int)49);
                            continue block62;
                        }
                    }
                    break;
                }
                v15 /* !! */  = jp.sm;
                if (true) ** GOTO lbl115
                block63: while (true) {
                    v15 /* !! */  = (long)(jp.kkft("klda", kkgf(int ), (int)51) - jp.kkft("klcz", kkgf(int ), (int)50));
lbl115:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 825315334: {
                            break block63;
                        }
                        case 1304520852: {
                            continue block63;
                        }
                    }
                    break;
                }
                v16 = jp.mc.field_1772;
                v17 = jp.kkft("kldb", kkfq(int ), (int)352);
                v18 = jp.kkft("kldc", kkfq(int ), (int)353);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = jp.sm - jp.kkft("kldd", kkgf(int ), (int)52)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == jp.kkft("klde", kkfq(int ), (int)354)) break;
                    v19 /* !! */  = (long)jp.kkft("kldf", kkfq(int ), (int)355);
                }
                var1_1.method_51431(v16, var2_2, (int)v17, (int)v18);
                if (var8_8 || var8_8) ** GOTO lbl32
                v20 /* !! */  = jp.sm;
                if (true) ** GOTO lbl134
                block65: while (true) {
                    v20 /* !! */  = (long)(v21 - jp.kkft("kldg", kkgf(int ), (int)53));
lbl134:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 415515066: {
                            v21 = jp.kkft("kldh", kkgf(int ), (int)54);
                            continue block65;
                        }
                        case 825315334: {
                            break block65;
                        }
                        case 1209620966: {
                            v21 = jp.kkft("kldi", kkgf(int ), (int)55);
                            continue block65;
                        }
                    }
                    break;
                }
                var7_10.popMatrix();
                if (!var8_8 && !var8_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_7 /* !! */  = (int)jp.kkft("kldj", kkfq(int ), (int)356);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl153:
            // 2 sources

            case 1: {
                do {
                    var9_7 /* !! */  = (int)jp.kkft("kldk", kkfq(int ), (int)357);
                } while (!var10_6);
                throw null;
            }
lbl158:
            // 3 sources

            case 2: {
                var9_7 /* !! */  = (int)jp.kkft("kldl", kkfq(int ), (int)358);
                if (!var10_6) ** GOTO lbl153
                throw null;
            }
            case 3: {
                var9_7 /* !! */  = (int)jp.kkft("kldm", kkfq(int ), (int)359);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl167:
            // 2 sources

            case 4: {
                var9_7 /* !! */  = (int)jp.kkft("kldn", kkfq(int ), (int)360);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 5: {
                var9_7 /* !! */  = (int)jp.kkft("kldo", kkfq(int ), (int)361);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_7 /* !! */  = (int)jp.kkft("kldp", kkfq(int ), (int)362);
                    if (!var10_6) ** GOTO lbl158
                    throw null;
                }
            }
            case 7: {
                var9_7 /* !! */  = (int)jp.kkft("kldq", kkfq(int ), (int)363);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 8: {
                var9_7 /* !! */  = (int)jp.kkft("kldr", kkfq(int ), (int)364);
                if (var10_6) {
                    throw null;
                }
            }
lbl191:
            // 4 sources

            case 9: {
                var9_7 /* !! */  = (int)jp.kkft("klds", kkfq(int ), (int)365);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 10: {
                var9_7 /* !! */  = (int)jp.kkft("kldt", kkfq(int ), (int)366);
                if (!var10_6) break;
                throw null;
            }
lbl200:
            // 2 sources

            case 11: {
                var9_7 /* !! */  = (int)jp.kkft("kldu", kkfq(int ), (int)367);
                if (!var10_6) ** GOTO lbl191
                throw null;
            }
            case 12: {
                var9_7 /* !! */  = (int)jp.kkft("kldv", kkfq(int ), (int)368);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl209:
            // 2 sources

            case 13: {
                var9_7 /* !! */  = (int)jp.kkft("kldw", kkfq(int ), (int)369);
                if (!var10_6) ** GOTO lbl158
                throw null;
            }
lbl213:
            // 5 sources

            case 14: {
                var9_7 /* !! */  = (int)jp.kkft("kldx", kkfq(int ), (int)370);
                if (!var10_6) break;
                throw null;
            }
            case 15: {
                do {
                    var9_7 /* !! */  = (int)jp.kkft("kldy", kkfq(int ), (int)371);
                } while (!var10_6);
                throw null;
            }
lbl222:
            // 2 sources

            case 16: {
                var9_7 /* !! */  = (int)jp.kkft("kldz", kkfq(int ), (int)372);
                if (!var10_6) ** GOTO lbl209
                throw null;
            }
lbl226:
            // 3 sources

            case 17: {
                var9_7 /* !! */  = (int)jp.kkft("klea", kkfq(int ), (int)373);
                if (!var10_6) ** GOTO lbl167
                throw null;
            }
            case 18: {
                var9_7 /* !! */  = (int)jp.kkft("kleb", kkfq(int ), (int)374);
                if (!var10_6) ** GOTO lbl213
                throw null;
            }
            case 19: 
        }
        var9_7 /* !! */  = (int)jp.kkft("klec", kkfq(int ), (int)375);
        ** while (!var10_6)
lbl237:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isControlDown() {
        v0 /* !! */  = jp.sm;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - jp.kkft("klhu", kkgf(int ), (int)64));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1884017356: {
                    v1 = jp.kkft("klhv", kkgf(int ), (int)65);
                    continue block31;
                }
                case 727224211: {
                    v1 = jp.kkft("klhw", kkgf(int ), (int)66);
                    continue block31;
                }
                case 825315334: {
                    break block31;
                }
            }
            break;
        }
        var5_1 = jp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jp.sm - jp.kkft("klhx", kkgf(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jp.kkft("klhy", kkfq(int ), (int)463)) break;
            v2 /* !! */  = (long)jp.kkft("klhz", kkfq(int ), (int)464);
        }
        var4_2 /* !! */  = jp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jp.sm - jp.kkft("klia", kkgf(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jp.kkft("klib", kkfq(int ), (int)465)) break;
            v3 /* !! */  = (long)jp.kkft("klic", kkfq(int ), (int)466);
        }
        var3_3 = jp.a;
        if (var5_1) {
            throw null;
lbl29:
            // 6 sources

            return (boolean)jp.kkft("klid", kkfq(int ), (int)467);
        }
        if (var3_3 || var3_3) ** GOTO lbl29
        v4 /* !! */  = jp.sm;
        if (true) ** GOTO lbl36
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - jp.kkft("klie", kkgf(int ), (int)69));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -420024949: {
                    v5 = jp.kkft("klif", kkgf(int ), (int)70);
                    continue block35;
                }
                case 825315334: {
                    break block35;
                }
                case 1946699836: {
                    v5 = jp.kkft("klig", kkgf(int ), (int)71);
                    continue block35;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = jp.sm - jp.kkft("klih", kkgf(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jp.kkft("klii", kkfq(int ), (int)468)) break;
            v6 /* !! */  = (long)jp.kkft("klij", kkfq(int ), (int)469);
        }
        v7 = jp.mc.method_22683();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = jp.sm - jp.kkft("klik", kkgf(int ), (int)73)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == jp.kkft("klil", kkfq(int ), (int)470)) break;
            v8 /* !! */  = (long)jp.kkft("klim", kkfq(int ), (int)471);
        }
        var1_4 = v7.method_4490();
        if (var3_3 || var3_3) ** GOTO lbl29
        v9 = jp.kkft("klin", kkfq(int ), (int)472);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = jp.sm - jp.kkft("klio", kkgf(int ), (int)74)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == jp.kkft("klip", kkfq(int ), (int)473)) break;
            v10 /* !! */  = (long)jp.kkft("kliq", kkfq(int ), (int)474);
        }
        if (GLFW.glfwGetKey((long)var1_4, (int)v9) == jp.kkft("klir", kkfq(int ), (int)475)) ** GOTO lbl-1000
        if (var3_3) ** GOTO lbl29
        v11 = jp.kkft("klis", kkfq(int ), (int)476);
        v12 /* !! */  = jp.sm;
        if (true) ** GOTO lbl71
        block39: while (true) {
            v12 /* !! */  = (long)(v13 - jp.kkft("klit", kkgf(int ), (int)75));
lbl71:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -213275812: {
                    v13 = jp.kkft("kliu", kkgf(int ), (int)76);
                    continue block39;
                }
                case 465440820: {
                    v13 = jp.kkft("kliv", kkgf(int ), (int)77);
                    continue block39;
                }
                case 825315334: {
                    break block39;
                }
                case 1345887730: {
                    v13 = jp.kkft("kliw", kkgf(int ), (int)78);
                    continue block39;
                }
            }
            break;
        }
        if (GLFW.glfwGetKey((long)var1_4, (int)v11) != jp.kkft("klix", kkfq(int ), (int)477)) ** GOTO lbl93
        if (var3_3) ** GOTO lbl29
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl29
                v14 = jp.kkft("kliy", kkfq(int ), (int)478);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl93:
            // 1 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            v14 = jp.kkft("kliz", kkfq(int ), (int)479);
lbl96:
            // 2 sources

            return (boolean)v14;
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)jp.kkft("klja", kkfq(int ), (int)480);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl130
                    break;
                }
            }
lbl103:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)jp.kkft("kljb", kkfq(int ), (int)481);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 2: {
                var4_2 /* !! */  = (int)jp.kkft("kljc", kkfq(int ), (int)482);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
lbl112:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)jp.kkft("kljd", kkfq(int ), (int)483);
                if (var5_1) {
                    throw null;
                }
            }
            case 4: {
                do {
                    var4_2 /* !! */  = (int)jp.kkft("klje", kkfq(int ), (int)484);
                } while (!var5_1);
                throw null;
            }
lbl121:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)jp.kkft("kljf", kkfq(int ), (int)485);
                if (!var5_1) break;
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)jp.kkft("kljg", kkfq(int ), (int)486);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl130:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)jp.kkft("kljh", kkfq(int ), (int)487);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl135:
            // 2 sources

            case 8: {
                do {
                    var4_2 /* !! */  = (int)jp.kkft("klji", kkfq(int ), (int)488);
                } while (!var5_1);
                throw null;
            }
lbl140:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)jp.kkft("kljj", kkfq(int ), (int)489);
                if (!var5_1) ** GOTO lbl130
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)jp.kkft("kljk", kkfq(int ), (int)490);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)jp.kkft("kljl", kkfq(int ), (int)491);
                if (!var5_1) ** GOTO lbl112
                throw null;
            }
            case 12: 
        }
        var4_2 /* !! */  = (int)jp.kkft("kljm", kkfq(int ), (int)492);
        ** while (!var5_1)
lbl155:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kllm() {
        jp.kkfs[300] = 274993488;
        jp.kkfs[301] = 283944457;
        jp.kkfs[302] = -2048632802;
        jp.kkfs[303] = -1782727957;
        jp.kkfs[304] = -839089342;
        jp.kkfs[305] = 797042365;
        jp.kkfs[306] = 373173224;
        jp.kkfs[307] = 1441170758;
        jp.kkfs[308] = 1348732824;
        jp.kkfs[309] = 1506500481;
        jp.kkfs[310] = -1326671380;
        jp.kkfs[311] = 262718381;
        jp.kkfs[312] = 1026168394;
        jp.kkfs[313] = -224686745;
        jp.kkfs[314] = -903666270;
        jp.kkfs[315] = 2135029088;
        jp.kkfs[316] = 317306768;
        jp.kkfs[317] = -1033530821;
        jp.kkfs[318] = 246270797;
        jp.kkfs[319] = 286945410;
        jp.kkfs[320] = 427263055;
        jp.kkfs[321] = -1842635290;
        jp.kkfs[322] = 1850980241;
        jp.kkfs[323] = -1825799139;
        jp.kkfs[324] = 1728756176;
        jp.kkfs[325] = -2019554793;
        jp.kkfs[326] = -940219320;
        jp.kkfs[327] = -148031895;
        jp.kkfs[328] = -2059971406;
        jp.kkfs[329] = -2000024545;
        jp.kkfs[330] = 78589589;
        jp.kkfs[331] = -1517542579;
        jp.kkfs[332] = 1132095266;
        jp.kkfs[333] = -2027347684;
        jp.kkfs[334] = -767116744;
        jp.kkfs[335] = -1900789978;
        jp.kkfs[336] = -1015472568;
        jp.kkfs[337] = -194996135;
        jp.kkfs[338] = -1162168797;
        jp.kkfs[339] = 1864818677;
        jp.kkfs[340] = -1540237746;
        jp.kkfs[341] = -493843224;
        jp.kkfs[342] = -336608100;
        jp.kkfs[343] = -526015496;
        jp.kkfs[344] = 312885195;
        jp.kkfs[345] = -1956085258;
        jp.kkfs[346] = 1714765270;
        jp.kkfs[347] = -1621047568;
        jp.kkfs[348] = 995429686;
        jp.kkfs[349] = -685296522;
        jp.kkfs[350] = 854490573;
        jp.kkfs[351] = 1167478680;
        jp.kkfs[352] = 1750089022;
        jp.kkfs[353] = -738149072;
        jp.kkfs[354] = -1873303167;
        jp.kkfs[355] = 1613868837;
        jp.kkfs[356] = 1667665363;
        jp.kkfs[357] = -1926836607;
        jp.kkfs[358] = -1343835060;
        jp.kkfs[359] = -530494454;
        jp.kkfs[360] = 610319121;
        jp.kkfs[361] = -780655278;
        jp.kkfs[362] = 589834630;
        jp.kkfs[363] = 1444015605;
        jp.kkfs[364] = -544598085;
        jp.kkfs[365] = 1617966702;
        jp.kkfs[366] = -805421893;
        jp.kkfs[367] = 1662551876;
        jp.kkfs[368] = 1373684995;
        jp.kkfs[369] = 1594819927;
        jp.kkfs[370] = -1426586255;
        jp.kkfs[371] = -1144319478;
        jp.kkfs[372] = 1779706929;
        jp.kkfs[373] = -2102764005;
        jp.kkfs[374] = -266076057;
        jp.kkfs[375] = 1931232353;
        jp.kkfs[376] = 834691765;
        jp.kkfs[377] = 1435593173;
        jp.kkfs[378] = -1244339258;
        jp.kkfs[379] = 117482122;
        jp.kkfs[380] = -739034241;
        jp.kkfs[381] = 1555466106;
        jp.kkfs[382] = 1533215382;
        jp.kkfs[383] = -1894772903;
        jp.kkfs[384] = 1944099214;
        jp.kkfs[385] = -48796463;
        jp.kkfs[386] = -1411648653;
        jp.kkfs[387] = 386236111;
        jp.kkfs[388] = 1458624455;
        jp.kkfs[389] = -459811901;
        jp.kkfs[390] = -1384550784;
        jp.kkfs[391] = -189485304;
        jp.kkfs[392] = 1823300103;
        jp.kkfs[393] = -1971111980;
        jp.kkfs[394] = 382965402;
        jp.kkfs[395] = 1881672535;
        jp.kkfs[396] = 1522310011;
        jp.kkfs[397] = -869373967;
        jp.kkfs[398] = -2125323824;
        jp.kkfs[399] = -887677521;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderPanel(class_332 var1_1, List<class_1799> var2_2, int var3_3, int var4_4, float var5_5) {
        block79: {
            var13_6 = jp.c;
            var12_7 /* !! */  = jp.b;
            var11_8 = jp.a;
            if (var13_6) {
                throw null;
lbl6:
                // 20 sources

                return;
            }
            if (var11_8 || var11_8) ** GOTO lbl6
            var6_9 = var1_1.method_51448();
            if (var11_8 || var11_8) ** GOTO lbl6
            var6_9.pushMatrix();
            if (var11_8 || var11_8) ** GOTO lbl6
            var6_9.translate((float)var3_3, (float)var4_4);
            if (var11_8 || var11_8) ** GOTO lbl6
            var6_9.scale(var5_5, var5_5);
            if (var11_8 || var11_8) ** GOTO lbl6
            var1_1.method_25290(class_10799.field_56883, jp.SHULKER_TEXTURE, (int)jp.kkft("kkty", kkfq(int ), (int)226), (int)jp.kkft("kktz", kkfq(int ), (int)227), 0.0f, 0.0f, (int)jp.kkft("kkub", kkfq(int ), (int)228), (int)jp.kkft("kkud", kkfq(int ), (int)229), (int)jp.kkft("kkuf", kkfq(int ), (int)230), (int)jp.kkft("kkug", kkfq(int ), (int)231));
            if (var11_8 || var11_8) ** GOTO lbl6
            var7_10 = jp.kkft("kkui", kkfq(int ), (int)232);
            if (var11_8) ** GOTO lbl6
            do {
                block81: {
                    block80: {
                        if (var11_8 || var11_8) ** GOTO lbl6
                        if (var7_10 >= Math.min((int)jp.kkft("kkuj", kkfq(int ), (int)233), var2_2.size())) break block79;
                        if (var11_8 || var11_8) ** GOTO lbl6
                        var8_11 = var2_2.get((int)var7_10);
                        if (var11_8 || var11_8) ** GOTO lbl6
                        if (!var8_11.method_7960()) break block80;
                        if (var11_8 || var11_8) ** GOTO lbl6
                        if (var13_6) {
                            throw null;
                        }
                        break block81;
                    }
                    if (var11_8 || var11_8) ** GOTO lbl6
                    var9_12 = jp.kkft("kkuo", kkfq(int ), (int)234) + var7_10 % jp.kkft("kkuq", kkfq(int ), (int)235) * jp.kkft("kkus", kkfq(int ), (int)236);
                    if (var11_8 || var11_8) ** GOTO lbl6
                    var10_13 = jp.kkft("kkuu", kkfq(int ), (int)237) + var7_10 / jp.kkft("kkuv", kkfq(int ), (int)238) * jp.kkft("kkuw", kkfq(int ), (int)239);
                    if (var11_8 || var11_8) ** GOTO lbl6
                    var1_1.method_51427(var8_11, (int)var9_12, (int)var10_13);
                    if (var11_8 || var11_8) ** GOTO lbl6
                    var1_1.method_51431(jp.mc.field_1772, var8_11, (int)var9_12, (int)var10_13);
                    if (var11_8) ** GOTO lbl6
                }
                if (var11_8 || var11_8) ** GOTO lbl6
                ++var7_10;
                if (var11_8) ** GOTO lbl6
            } while (!var13_6);
            throw null;
        }
        if (var12_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_8 || var11_8) ** GOTO lbl6
                var6_9.popMatrix();
                if (!var11_8 && !var11_8) ** break;
                ** continue;
                return;
            }
lbl61:
            // 2 sources

            case 0: {
                var12_7 /* !! */  = (int)jp.kkft("kkvb", kkfq(int ), (int)240);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl66:
            // 4 sources

            case 1: {
                var12_7 /* !! */  = (int)jp.kkft("kkve", kkfq(int ), (int)241);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl71:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_7 /* !! */  = (int)jp.kkft("kkvg", kkfq(int ), (int)242);
                    if (!var13_6) ** GOTO lbl66
                    throw null;
                }
            }
lbl76:
            // 2 sources

            case 3: {
                var12_7 /* !! */  = (int)jp.kkft("kkvj", kkfq(int ), (int)243);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl81:
            // 4 sources

            case 4: {
                var12_7 /* !! */  = (int)jp.kkft("kkvl", kkfq(int ), (int)244);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 5: {
                var12_7 /* !! */  = (int)jp.kkft("kkvn", kkfq(int ), (int)245);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl91:
            // 2 sources

            case 6: {
                var12_7 /* !! */  = (int)jp.kkft("kkvt", kkfq(int ), (int)246);
                if (!var13_6) ** GOTO lbl66
                throw null;
            }
lbl95:
            // 3 sources

            case 7: {
                var12_7 /* !! */  = (int)jp.kkft("kkvu", kkfq(int ), (int)247);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl100:
            // 3 sources

            case 8: {
                var12_7 /* !! */  = (int)jp.kkft("kkvv", kkfq(int ), (int)248);
                if (!var13_6) ** GOTO lbl66
                throw null;
            }
lbl104:
            // 2 sources

            case 9: {
                var12_7 /* !! */  = (int)jp.kkft("kkvw", kkfq(int ), (int)249);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl109:
            // 2 sources

            case 10: {
                var12_7 /* !! */  = (int)jp.kkft("kkvx", kkfq(int ), (int)250);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 11: {
                var12_7 /* !! */  = (int)jp.kkft("kkvy", kkfq(int ), (int)251);
                if (!var13_6) break;
                throw null;
            }
            case 12: {
                var12_7 /* !! */  = (int)jp.kkft("kkwa", kkfq(int ), (int)252);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl123:
            // 2 sources

            case 13: {
                var12_7 /* !! */  = (int)jp.kkft("kkwc", kkfq(int ), (int)253);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl128:
            // 2 sources

            case 14: {
                var12_7 /* !! */  = (int)jp.kkft("kkwe", kkfq(int ), (int)254);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 15: {
                var12_7 /* !! */  = (int)jp.kkft("kkwf", kkfq(int ), (int)255);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 16: {
                var12_7 /* !! */  = (int)jp.kkft("kkwg", kkfq(int ), (int)256);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl143:
            // 2 sources

            case 17: {
                var12_7 /* !! */  = (int)jp.kkft("kkwj", kkfq(int ), (int)257);
                if (!var13_6) ** GOTO lbl61
                throw null;
            }
            case 18: {
                var12_7 /* !! */  = (int)jp.kkft("kkwm", kkfq(int ), (int)258);
                if (!var13_6) ** GOTO lbl128
                throw null;
            }
            case 19: {
                var12_7 /* !! */  = (int)jp.kkft("kkwo", kkfq(int ), (int)259);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl156:
            // 2 sources

            case 20: {
                do {
                    var12_7 /* !! */  = (int)jp.kkft("kkwr", kkfq(int ), (int)260);
                } while (!var13_6);
                throw null;
            }
lbl161:
            // 2 sources

            case 21: {
                var12_7 /* !! */  = (int)jp.kkft("kkwt", kkfq(int ), (int)261);
                if (!var13_6) ** GOTO lbl76
                throw null;
            }
            case 22: {
                var12_7 /* !! */  = (int)jp.kkft("kkwv", kkfq(int ), (int)262);
                if (!var13_6) ** GOTO lbl95
                throw null;
            }
            case 23: {
                var12_7 /* !! */  = (int)jp.kkft("kkwx", kkfq(int ), (int)263);
                if (!var13_6) ** GOTO lbl81
                throw null;
            }
lbl173:
            // 2 sources

            case 24: {
                var12_7 /* !! */  = (int)jp.kkft("kkwy", kkfq(int ), (int)264);
                if (var13_6) {
                    throw null;
                }
            }
lbl177:
            // 4 sources

            case 25: {
                var12_7 /* !! */  = (int)jp.kkft("kkwz", kkfq(int ), (int)265);
                if (!var13_6) ** GOTO lbl71
                throw null;
            }
lbl181:
            // 3 sources

            case 26: {
                var12_7 /* !! */  = (int)jp.kkft("kkxb", kkfq(int ), (int)266);
                if (!var13_6) ** GOTO lbl104
                throw null;
            }
            case 27: {
                var12_7 /* !! */  = (int)jp.kkft("kkxc", kkfq(int ), (int)267);
                if (!var13_6) ** GOTO lbl100
                throw null;
            }
lbl189:
            // 2 sources

            case 28: {
                var12_7 /* !! */  = (int)jp.kkft("kkxf", kkfq(int ), (int)268);
                if (!var13_6) ** GOTO lbl81
                throw null;
            }
            case 29: {
                var12_7 /* !! */  = (int)jp.kkft("kkxi", kkfq(int ), (int)269);
                if (!var13_6) ** GOTO lbl81
                throw null;
            }
lbl197:
            // 2 sources

            case 30: {
                var12_7 /* !! */  = (int)jp.kkft("kkxk", kkfq(int ), (int)270);
                if (!var13_6) ** GOTO lbl100
                throw null;
            }
            case 31: {
                var12_7 /* !! */  = (int)jp.kkft("kkxm", kkfq(int ), (int)271);
                if (var13_6) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl206:
            // 4 sources

            case 32: {
                var12_7 /* !! */  = (int)jp.kkft("kkxo", kkfq(int ), (int)272);
                if (var13_6) {
                    throw null;
                }
            }
lbl210:
            // 4 sources

            case 33: {
                do {
                    var12_7 /* !! */  = (int)jp.kkft("kkxp", kkfq(int ), (int)273);
                } while (!var13_6);
                throw null;
            }
            case 34: {
                var12_7 /* !! */  = (int)jp.kkft("kkxr", kkfq(int ), (int)274);
                if (!var13_6) ** GOTO lbl177
                throw null;
            }
            case 35: {
                var12_7 /* !! */  = (int)jp.kkft("kkxv", kkfq(int ), (int)275);
                if (!var13_6) ** GOTO lbl95
                throw null;
            }
lbl223:
            // 2 sources

            case 36: {
                var12_7 /* !! */  = (int)jp.kkft("kkxy", kkfq(int ), (int)276);
                if (!var13_6) ** GOTO lbl206
                throw null;
            }
            case 37: {
                var12_7 /* !! */  = (int)jp.kkft("kkyb", kkfq(int ), (int)277);
                if (!var13_6) ** GOTO lbl109
                throw null;
            }
lbl231:
            // 3 sources

            case 38: {
                var12_7 /* !! */  = (int)jp.kkft("kkyd", kkfq(int ), (int)278);
                if (!var13_6) ** GOTO lbl173
                throw null;
            }
            case 39: 
        }
        var12_7 /* !! */  = (int)jp.kkft("kkyf", kkfq(int ), (int)279);
        ** while (!var13_6)
lbl238:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static jp getInstance() {
        block21: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = jp.sm - jp.kkft("kkgi", kkgf(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == jp.kkft("kkgj", kkfq(int ), (int)11)) break;
                v0 /* !! */  = (long)jp.kkft("kkgk", kkfq(int ), (int)12);
            }
            var2 = jp.c;
            v1 /* !! */  = jp.sm;
            block11: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case 734897959: {
                        v1 /* !! */  = (long)(jp.kkft("kkgm", kkgf(int ), (int)2) - jp.kkft("kkgl", kkgf(int ), (int)1));
                        continue block11;
                    }
                    case 825315334: {
                        break block11;
                    }
                }
                break;
            }
            var1_1 /* !! */  = jp.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = jp.sm - jp.kkft("kkgn", kkgf(int ), (int)3)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == jp.kkft("kkgo", kkfq(int ), (int)13)) {
                    var0_2 = jp.a;
                    if (var2) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)jp.kkft("kkgp", kkfq(int ), (int)14);
            }
            if (var0_2 != false) return null;
            if (var0_2 != false) return null;
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block13: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = jp.sm - jp.kkft("kkgq", kkgf(int ), (int)4)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == jp.kkft("kkgr", kkfq(int ), (int)15)) {
                                return nj.get(jp.class);
                            }
                            v3 /* !! */  = (long)jp.kkft("kkgs", kkfq(int ), (int)16);
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)jp.kkft("kkgv", kkfq(int ), (int)19);
                        if (var2) {
                            throw null;
                        }
                        break block21;
                    }
                    case 3: {
                        break block21;
                    }
lbl47:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)jp.kkft("kkgt", kkfq(int ), (int)17);
                        cfr_temp_0 = 1;
                        if (!var2) continue block13;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)jp.kkft("kkgu", kkfq(int ), (int)18);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)jp.kkft("kkgw", kkfq(int ), (int)20);
        ** while (!var2)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float kkkw(int n2) {
        return Float.intBitsToFloat(kkfr[n2] ^ kkfs[n2]);
    }

    private static /* synthetic */ void klli() {
        jp.kkfr[500] = 669387493;
        jp.kkfr[501] = 423239171;
        jp.kkfr[502] = -781228173;
        jp.kkfr[503] = 143924903;
        jp.kkfr[504] = 1825478995;
        jp.kkfr[505] = -614809673;
        jp.kkfr[506] = -1527742426;
        jp.kkfr[507] = 48913940;
        jp.kkfr[508] = -1107765666;
        jp.kkfr[509] = -1053660323;
        jp.kkfr[510] = 1626561440;
        jp.kkfr[511] = 555975498;
        jp.kkfr[512] = 6138566;
        jp.kkfr[513] = 1922898694;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$contents$1(class_2371 var0, int var1_1, class_1799 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp.sm - jp.kkft("kljn", kkgf(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jp.kkft("kljo", kkfq(int ), (int)493)) break;
            v0 /* !! */  = (long)jp.kkft("kljp", kkfq(int ), (int)494);
        }
        var5_3 = jp.c;
        v1 /* !! */  = jp.sm;
        if (true) ** GOTO lbl11
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - jp.kkft("kljq", kkgf(int ), (int)80));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 825315334: {
                    break block20;
                }
                case 1073017861: {
                    v2 = jp.kkft("kljr", kkgf(int ), (int)81);
                    continue block20;
                }
                case 1411720763: {
                    v2 = jp.kkft("kljs", kkgf(int ), (int)82);
                    continue block20;
                }
                case 1979226439: {
                    v2 = jp.kkft("kljt", kkgf(int ), (int)83);
                    continue block20;
                }
            }
            break;
        }
        var4_4 /* !! */  = jp.b;
        v3 /* !! */  = jp.sm;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - jp.kkft("klju", kkgf(int ), (int)84));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1043844738: {
                    v4 = jp.kkft("kljv", kkgf(int ), (int)85);
                    continue block21;
                }
                case -956087801: {
                    v4 = jp.kkft("kljw", kkgf(int ), (int)86);
                    continue block21;
                }
                case 825315334: {
                    break block21;
                }
                case 1846626541: {
                    v4 = jp.kkft("kljx", kkgf(int ), (int)87);
                    continue block21;
                }
            }
            break;
        }
        var3_5 = jp.a;
        if (var5_3) {
            throw null;
lbl43:
            // 2 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = jp.sm - jp.kkft("kljy", kkgf(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == jp.kkft("kljz", kkfq(int ), (int)495)) break;
            v5 /* !! */  = (long)jp.kkft("klka", kkfq(int ), (int)496);
        }
        var0.set(var1_1, (Object)var2_2);
        if (!var3_5) ** break;
        ** while (true)
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl58:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)jp.kkft("klkb", kkfq(int ), (int)497);
                if (!var5_3) break;
                throw null;
            }
lbl62:
            // 3 sources

            case 1: {
                var4_4 /* !! */  = (int)jp.kkft("klkc", kkfq(int ), (int)498);
                if (!var5_3) ** GOTO lbl58
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)jp.kkft("klkd", kkfq(int ), (int)499);
                    if (!var5_3) ** GOTO lbl62
                    throw null;
                }
            }
            case 3: {
                var4_4 /* !! */  = (int)jp.kkft("klke", kkfq(int ), (int)500);
                if (!var5_3) ** GOTO lbl62
                throw null;
            }
            case 4: 
        }
        var4_4 /* !! */  = (int)jp.kkft("klkf", kkfq(int ), (int)501);
        ** while (!var5_3)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kllq() {
        jp.kkgh[0] = 8166154446914579375L;
        jp.kkgh[1] = 6889658156050956334L;
        jp.kkgh[2] = 3154787905416781882L;
        jp.kkgh[3] = -2218910333978248864L;
        jp.kkgh[4] = 324904134941398558L;
        jp.kkgh[5] = 7786526867406753747L;
        jp.kkgh[6] = -382219245768226169L;
        jp.kkgh[7] = -7688021112809646420L;
        jp.kkgh[8] = -9142509773954288629L;
        jp.kkgh[9] = 2380632137535024061L;
        jp.kkgh[10] = -5829326585652224806L;
        jp.kkgh[11] = 4858562867397125833L;
        jp.kkgh[12] = -6521253494366332174L;
        jp.kkgh[13] = 787281689108759330L;
        jp.kkgh[14] = -2436562345322571708L;
        jp.kkgh[15] = -4374898375343850751L;
        jp.kkgh[16] = 4595063054866908510L;
        jp.kkgh[17] = 5896208934383105570L;
        jp.kkgh[18] = 2798906858732981552L;
        jp.kkgh[19] = 6298798367449600645L;
        jp.kkgh[20] = -1362923101838930724L;
        jp.kkgh[21] = 8597921243974797391L;
        jp.kkgh[22] = 7218887520359398006L;
        jp.kkgh[23] = -2480077374276509507L;
        jp.kkgh[24] = 3146354324275902238L;
        jp.kkgh[25] = 7732235046778873942L;
        jp.kkgh[26] = -5293056848277557680L;
        jp.kkgh[27] = -3668586106524242961L;
        jp.kkgh[28] = -8634821520371619160L;
        jp.kkgh[29] = -1563902439803929443L;
        jp.kkgh[30] = -8616226304012249184L;
        jp.kkgh[31] = -1274657484129817852L;
        jp.kkgh[32] = -6923231378342903335L;
        jp.kkgh[33] = 8415670530866091719L;
        jp.kkgh[34] = -8827292902819781079L;
        jp.kkgh[35] = 4348417227230190604L;
        jp.kkgh[36] = 3111797121655829666L;
        jp.kkgh[37] = -588668662461852676L;
        jp.kkgh[38] = 891812594657275968L;
        jp.kkgh[39] = 8321752759147169843L;
        jp.kkgh[40] = 1207653076475480226L;
        jp.kkgh[41] = 969603471524098221L;
        jp.kkgh[42] = -4929932295650127027L;
        jp.kkgh[43] = -5427105868851547190L;
        jp.kkgh[44] = -4616430831223477096L;
        jp.kkgh[45] = -5177350194424021334L;
        jp.kkgh[46] = -4697923588446070731L;
        jp.kkgh[47] = 8423165677412482777L;
        jp.kkgh[48] = 185056006744104478L;
        jp.kkgh[49] = -8251181148832606902L;
        jp.kkgh[50] = 5565264558639556462L;
        jp.kkgh[51] = -8769492708559393069L;
        jp.kkgh[52] = 357260144625316949L;
        jp.kkgh[53] = -3100498228459218657L;
        jp.kkgh[54] = 3812486263487128260L;
        jp.kkgh[55] = 5144080306543094675L;
        jp.kkgh[56] = -518610817882899955L;
        jp.kkgh[57] = 9176144861615911978L;
        jp.kkgh[58] = 6784584818118550811L;
        jp.kkgh[59] = 8594031676140651290L;
        jp.kkgh[60] = -1144149130070152413L;
        jp.kkgh[61] = 5768712363620592214L;
        jp.kkgh[62] = -1993276772260428122L;
        jp.kkgh[63] = 6823554759539683651L;
        jp.kkgh[64] = 7424227694506826517L;
        jp.kkgh[65] = 7754537288497556330L;
        jp.kkgh[66] = 656279333051935561L;
        jp.kkgh[67] = 3430056712509839587L;
        jp.kkgh[68] = -222013518651203250L;
        jp.kkgh[69] = -4123703969720779709L;
        jp.kkgh[70] = -4338456895985882982L;
        jp.kkgh[71] = 5240478482283074586L;
        jp.kkgh[72] = -7585990486370057611L;
        jp.kkgh[73] = -3285262348389837828L;
        jp.kkgh[74] = 1768299373030759863L;
        jp.kkgh[75] = 4913354582422952711L;
        jp.kkgh[76] = -8529133967416529118L;
        jp.kkgh[77] = -2747911475688184543L;
        jp.kkgh[78] = -3532225803837827103L;
        jp.kkgh[79] = 6321392324576412994L;
        jp.kkgh[80] = 8839772345864676016L;
        jp.kkgh[81] = 376883892092260550L;
        jp.kkgh[82] = 2022730265134516154L;
        jp.kkgh[83] = -626464295781653112L;
        jp.kkgh[84] = -1460024166998087360L;
        jp.kkgh[85] = -5467271536317720519L;
        jp.kkgh[86] = -2107201133741514353L;
        jp.kkgh[87] = 566205254834452440L;
        jp.kkgh[88] = 7516524709909631478L;
        jp.kkgh[89] = -608824308802439234L;
        jp.kkgh[90] = -3984597138779205675L;
        jp.kkgh[91] = 8458027092538727146L;
        jp.kkgh[92] = 5799780004695942183L;
        jp.kkgh[93] = -8417651969999891941L;
        jp.kkgh[94] = -6411020527160526779L;
        jp.kkgh[95] = 3233487483545634910L;
        jp.kkgh[96] = 4645780208562341204L;
        jp.kkgh[97] = 7424993541854698965L;
        jp.kkgh[98] = 6456068582289713148L;
        jp.kkgh[99] = -4718139403978860970L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onScreen(ce var1_1) {
        var8_2 = jp.c;
        var7_3 /* !! */  = jp.b;
        var6_4 = jp.a;
        if (!var8_2) ** GOTO lbl10
        throw null;
        {
            if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl10:
                // 1 sources

                if (var6_4 || var6_4) continue block43;
                if (this.isControlDown()) {
                    if (var6_4) continue block43;
                    if (var1_1.getSlotHover() == null) {
                        if (var6_4) continue block43;
                    }
                } else {
                    if (var6_4 || var6_4) continue block43;
                    return;
                }
                if (var6_4 || var6_4) continue block43;
                var2_5 = var1_1.getSlotHover().method_7677();
                if (var6_4 || var6_4) continue block43;
                var3_6 = this.contents(var2_5);
                if (var6_4 || var6_4) continue block43;
                if (var3_6 == null) {
                    if (var6_4 || var6_4) continue block43;
                    return;
                }
                if (var6_4 || var6_4) continue block43;
                var4_7 = var1_1.getMouseX() + jp.kkft("kkio", kkfq(int ), (int)40);
                if (var6_4 || var6_4) continue block43;
                var5_8 = var1_1.getMouseY() + jp.kkft("kkip", kkfq(int ), (int)41);
                if (var6_4 || var6_4) continue block43;
                if (var4_7 + jp.kkft("kkiq", kkfq(int ), (int)42) > var1_1.getDrawContext().method_51421() - jp.kkft("kkir", kkfq(int ), (int)43)) {
                    if (var6_4 || var6_4) continue block43;
                    var4_7 = var1_1.getMouseX() - jp.kkft("kkis", kkfq(int ), (int)44) - jp.kkft("kkit", kkfq(int ), (int)45);
                    if (var6_4) continue block43;
                }
                if (var6_4 || var6_4) continue block43;
                if (var5_8 + jp.kkft("kkiu", kkfq(int ), (int)46) > var1_1.getDrawContext().method_51443() - jp.kkft("kkiv", kkfq(int ), (int)47)) {
                    if (var6_4 || var6_4) continue block43;
                    var5_8 = var1_1.getMouseY() - jp.kkft("kkiw", kkfq(int ), (int)48) - jp.kkft("kkix", kkfq(int ), (int)49);
                    if (var6_4) continue block43;
                }
                if (var6_4 || var6_4) continue block43;
                var4_7 = jp.clamp(var4_7, (int)jp.kkft("kkiy", kkfq(int ), (int)50), var1_1.getDrawContext().method_51421() - jp.kkft("kkiz", kkfq(int ), (int)51) - jp.kkft("kkja", kkfq(int ), (int)52));
                if (var6_4 || var6_4) continue block43;
                var5_8 = jp.clamp(var5_8, (int)jp.kkft("kkjb", kkfq(int ), (int)53), var1_1.getDrawContext().method_51443() - jp.kkft("kkjc", kkfq(int ), (int)54) - jp.kkft("kkjd", kkfq(int ), (int)55));
                if (var6_4 || var6_4) continue block43;
                this.renderPanel(var1_1.getDrawContext(), var3_6, var4_7, var5_8, 1.0f);
                if (var6_4 || var6_4) continue block43;
                var1_1.cancel();
                if (!var6_4 && !var6_4) ** break;
                continue block43;
                return;
                case 0: {
                    var7_3 /* !! */  = (int)jp.kkft("kkje", kkfq(int ), (int)56);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl56:
                // 2 sources

                case 1: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjf", kkfq(int ), (int)57);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl142
                }
lbl61:
                // 4 sources

                case 2: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjg", kkfq(int ), (int)58);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl165
                }
lbl66:
                // 2 sources

                case 3: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjh", kkfq(int ), (int)59);
                    if (!var8_2) ** GOTO lbl61
                    throw null;
                }
                case 4: {
                    var7_3 /* !! */  = (int)jp.kkft("kkji", kkfq(int ), (int)60);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
                case 5: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjj", kkfq(int ), (int)61);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl80:
                // 2 sources

                case 6: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjk", kkfq(int ), (int)62);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
                case 7: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjl", kkfq(int ), (int)63);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
lbl90:
                // 2 sources

                case 8: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjm", kkfq(int ), (int)64);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
lbl95:
                // 2 sources

                case 9: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjn", kkfq(int ), (int)65);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl169
                }
lbl100:
                // 2 sources

                case 10: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjo", kkfq(int ), (int)66);
                    if (!var8_2) ** GOTO lbl80
                    throw null;
                }
                case 11: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjp", kkfq(int ), (int)67);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
                case 12: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjq", kkfq(int ), (int)68);
                    if (!var8_2) ** GOTO lbl66
                    throw null;
                }
                case 13: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjr", kkfq(int ), (int)69);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
lbl118:
                // 3 sources

                case 14: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjs", kkfq(int ), (int)70);
                    if (!var8_2) break block43;
                    throw null;
                }
lbl122:
                // 3 sources

                case 15: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjt", kkfq(int ), (int)71);
                    if (!var8_2) ** GOTO lbl61
                    throw null;
                }
                case 16: {
                    var7_3 /* !! */  = (int)jp.kkft("kkju", kkfq(int ), (int)72);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
                case 17: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjv", kkfq(int ), (int)73);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl136:
                // 2 sources

                case 18: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_3 /* !! */  = (int)jp.kkft("kkjw", kkfq(int ), (int)74);
                        if (var8_2) {
                            throw null;
                        }
                        ** GOTO lbl173
                        break;
                    }
                }
lbl142:
                // 4 sources

                case 19: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjx", kkfq(int ), (int)75);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl147:
                // 2 sources

                case 20: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjy", kkfq(int ), (int)76);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl152:
                // 2 sources

                case 21: {
                    var7_3 /* !! */  = (int)jp.kkft("kkjz", kkfq(int ), (int)77);
                    if (!var8_2) ** GOTO lbl142
                    throw null;
                }
                case 22: {
                    var7_3 /* !! */  = (int)jp.kkft("kkka", kkfq(int ), (int)78);
                    if (!var8_2) ** GOTO lbl61
                    throw null;
                }
lbl160:
                // 2 sources

                case 23: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkb", kkfq(int ), (int)79);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
lbl165:
                // 2 sources

                case 24: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkc", kkfq(int ), (int)80);
                    if (!var8_2) ** GOTO lbl56
                    throw null;
                }
lbl169:
                // 2 sources

                case 25: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkd", kkfq(int ), (int)81);
                    if (!var8_2) ** GOTO lbl160
                    throw null;
                }
lbl173:
                // 3 sources

                case 26: {
                    var7_3 /* !! */  = (int)jp.kkft("kkke", kkfq(int ), (int)82);
                    if (!var8_2) ** GOTO lbl122
                    throw null;
                }
                case 27: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkf", kkfq(int ), (int)83);
                    if (!var8_2) ** GOTO lbl95
                    throw null;
                }
lbl181:
                // 2 sources

                case 28: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkg", kkfq(int ), (int)84);
                    if (!var8_2) ** GOTO lbl100
                    throw null;
                }
                case 29: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkh", kkfq(int ), (int)85);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl223
                }
lbl190:
                // 5 sources

                case 30: {
                    var7_3 /* !! */  = (int)jp.kkft("kkki", kkfq(int ), (int)86);
                    if (!var8_2) ** GOTO lbl181
                    throw null;
                }
                case 31: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkj", kkfq(int ), (int)87);
                    if (!var8_2) ** GOTO lbl147
                    throw null;
                }
                case 32: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkk", kkfq(int ), (int)88);
                    if (!var8_2) ** GOTO lbl190
                    throw null;
                }
lbl202:
                // 4 sources

                case 33: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkl", kkfq(int ), (int)89);
                    if (!var8_2) break block43;
                    throw null;
                }
                case 34: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkm", kkfq(int ), (int)90);
                    if (!var8_2) ** GOTO lbl90
                    throw null;
                }
                case 35: {
                    var7_3 /* !! */  = (int)jp.kkft("kkkn", kkfq(int ), (int)91);
                    if (!var8_2) ** GOTO lbl118
                    throw null;
                }
                case 36: {
                    var7_3 /* !! */  = (int)jp.kkft("kkko", kkfq(int ), (int)92);
                    if (!var8_2) ** GOTO lbl142
                    throw null;
                }
lbl218:
                // 2 sources

                case 37: {
                    do {
                        var7_3 /* !! */  = (int)jp.kkft("kkkp", kkfq(int ), (int)93);
                    } while (!var8_2);
                    throw null;
                }
lbl223:
                // 2 sources

                case 38: {
                    do {
                        var7_3 /* !! */  = (int)jp.kkft("kkkq", kkfq(int ), (int)94);
                    } while (!var8_2);
                    throw null;
                }
lbl228:
                // 2 sources

                case 39: {
                    do {
                        var7_3 /* !! */  = (int)jp.kkft("kkkr", kkfq(int ), (int)95);
                    } while (!var8_2);
                    throw null;
                }
                case 40: 
            }
        }
        var7_3 /* !! */  = (int)jp.kkft("kkks", kkfq(int ), (int)96);
        ** while (!var8_2)
lbl236:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite kkft(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void klld() {
        jp.kkfr[0] = -2018491978;
        jp.kkfr[1] = 1475979353;
        jp.kkfr[2] = 553619765;
        jp.kkfr[3] = 1345007142;
        jp.kkfr[4] = 622715223;
        jp.kkfr[5] = 1556482917;
        jp.kkfr[6] = 105565016;
        jp.kkfr[7] = -1499001825;
        jp.kkfr[8] = 1955766689;
        jp.kkfr[9] = 432445221;
        jp.kkfr[10] = -159129414;
        jp.kkfr[11] = -1215172698;
        jp.kkfr[12] = -1894241727;
        jp.kkfr[13] = 319175660;
        jp.kkfr[14] = 639978653;
        jp.kkfr[15] = 923638994;
        jp.kkfr[16] = -1474130606;
        jp.kkfr[17] = -583796986;
        jp.kkfr[18] = -1126358481;
        jp.kkfr[19] = -26318672;
        jp.kkfr[20] = 462089840;
        jp.kkfr[21] = -1597303002;
        jp.kkfr[22] = 1677536668;
        jp.kkfr[23] = 862248789;
        jp.kkfr[24] = -1224862085;
        jp.kkfr[25] = 905890881;
        jp.kkfr[26] = 1573198129;
        jp.kkfr[27] = -356171853;
        jp.kkfr[28] = -1190481388;
        jp.kkfr[29] = -459948475;
        jp.kkfr[30] = -256977316;
        jp.kkfr[31] = -1053648635;
        jp.kkfr[32] = -834742115;
        jp.kkfr[33] = -1597548143;
        jp.kkfr[34] = -298649519;
        jp.kkfr[35] = -378137495;
        jp.kkfr[36] = 1663043322;
        jp.kkfr[37] = -1906147204;
        jp.kkfr[38] = 1111116219;
        jp.kkfr[39] = -1163795009;
        jp.kkfr[40] = 834750905;
        jp.kkfr[41] = -596528771;
        jp.kkfr[42] = -1993997142;
        jp.kkfr[43] = 306329493;
        jp.kkfr[44] = 1631738795;
        jp.kkfr[45] = -622393991;
        jp.kkfr[46] = -1777612306;
        jp.kkfr[47] = -1337797565;
        jp.kkfr[48] = -716144871;
        jp.kkfr[49] = -1304384962;
        jp.kkfr[50] = 984219311;
        jp.kkfr[51] = 329950913;
        jp.kkfr[52] = 1281126406;
        jp.kkfr[53] = 1492671078;
        jp.kkfr[54] = -1573395558;
        jp.kkfr[55] = -175635963;
        jp.kkfr[56] = -947975498;
        jp.kkfr[57] = 1791457407;
        jp.kkfr[58] = -259766719;
        jp.kkfr[59] = -1972766317;
        jp.kkfr[60] = 7190279;
        jp.kkfr[61] = -1975537855;
        jp.kkfr[62] = -89204514;
        jp.kkfr[63] = 633553802;
        jp.kkfr[64] = -495273957;
        jp.kkfr[65] = 584203750;
        jp.kkfr[66] = -285898226;
        jp.kkfr[67] = -1789430501;
        jp.kkfr[68] = -760423297;
        jp.kkfr[69] = -1503768581;
        jp.kkfr[70] = -1898943658;
        jp.kkfr[71] = -979660288;
        jp.kkfr[72] = -2084748805;
        jp.kkfr[73] = 1342245406;
        jp.kkfr[74] = -13893866;
        jp.kkfr[75] = 1996438865;
        jp.kkfr[76] = -2071912234;
        jp.kkfr[77] = -2073547907;
        jp.kkfr[78] = -12911284;
        jp.kkfr[79] = -6027603;
        jp.kkfr[80] = 1160827393;
        jp.kkfr[81] = -1332581792;
        jp.kkfr[82] = -1135220667;
        jp.kkfr[83] = 157064220;
        jp.kkfr[84] = 157058196;
        jp.kkfr[85] = 150400444;
        jp.kkfr[86] = 972029946;
        jp.kkfr[87] = -1188698245;
        jp.kkfr[88] = -462269011;
        jp.kkfr[89] = 1723828939;
        jp.kkfr[90] = -183604127;
        jp.kkfr[91] = -1075293358;
        jp.kkfr[92] = 750830023;
        jp.kkfr[93] = 1029154626;
        jp.kkfr[94] = -1272467165;
        jp.kkfr[95] = 208651399;
        jp.kkfr[96] = -1340367090;
        jp.kkfr[97] = -1023080819;
        jp.kkfr[98] = 1785604828;
        jp.kkfr[99] = -834952316;
    }

    private static /* synthetic */ double kkkt(int n2) {
        return Double.longBitsToDouble(kkgg[n2] ^ kkgh[n2]);
    }

    private static /* synthetic */ void kllj() {
        jp.kkfs[0] = -2018491977;
        jp.kkfs[1] = -671504295;
        jp.kkfs[2] = 553619765;
        jp.kkfs[3] = 1345007142;
        jp.kkfs[4] = 622715220;
        jp.kkfs[5] = 1556482914;
        jp.kkfs[6] = 105565019;
        jp.kkfs[7] = -1499001825;
        jp.kkfs[8] = 1955766692;
        jp.kkfs[9] = 432445221;
        jp.kkfs[10] = -159129410;
        jp.kkfs[11] = -1215172697;
        jp.kkfs[12] = 1553643793;
        jp.kkfs[13] = -319175661;
        jp.kkfs[14] = 1905380933;
        jp.kkfs[15] = -923638995;
        jp.kkfs[16] = -1447871845;
        jp.kkfs[17] = -583796987;
        jp.kkfs[18] = -1126358483;
        jp.kkfs[19] = -26318672;
        jp.kkfs[20] = 462089843;
        jp.kkfs[21] = 1597303001;
        jp.kkfs[22] = -277354269;
        jp.kkfs[23] = -1285234859;
        jp.kkfs[24] = -1224862086;
        jp.kkfs[25] = -46486536;
        jp.kkfs[26] = -1573198130;
        jp.kkfs[27] = 1061170132;
        jp.kkfs[28] = -1190481388;
        jp.kkfs[29] = -459948479;
        jp.kkfs[30] = -256977319;
        jp.kkfs[31] = -1053648634;
        jp.kkfs[32] = -834742116;
        jp.kkfs[33] = -1597548139;
        jp.kkfs[34] = -298649516;
        jp.kkfs[35] = -378137490;
        jp.kkfs[36] = 1663043320;
        jp.kkfs[37] = -1906147203;
        jp.kkfs[38] = 1111116218;
        jp.kkfs[39] = -1163795019;
        jp.kkfs[40] = 834750901;
        jp.kkfs[41] = -596528783;
        jp.kkfs[42] = -1993997286;
        jp.kkfs[43] = 306329489;
        jp.kkfs[44] = 1631738651;
        jp.kkfs[45] = -622393995;
        jp.kkfs[46] = -1777612371;
        jp.kkfs[47] = -1337797561;
        jp.kkfs[48] = -716144806;
        jp.kkfs[49] = -1304384974;
        jp.kkfs[50] = 984219307;
        jp.kkfs[51] = 329950833;
        jp.kkfs[52] = 1281126402;
        jp.kkfs[53] = 1492671074;
        jp.kkfs[54] = -1573395495;
        jp.kkfs[55] = -175635967;
        jp.kkfs[56] = -947975496;
        jp.kkfs[57] = 1791457393;
        jp.kkfs[58] = -259766682;
        jp.kkfs[59] = -1972766331;
        jp.kkfs[60] = 7190310;
        jp.kkfs[61] = -1975537823;
        jp.kkfs[62] = -89204488;
        jp.kkfs[63] = 633553835;
        jp.kkfs[64] = -495273933;
        jp.kkfs[65] = 584203757;
        jp.kkfs[66] = -285898240;
        jp.kkfs[67] = -1789430520;
        jp.kkfs[68] = -760423308;
        jp.kkfs[69] = -1503768591;
        jp.kkfs[70] = -1898943659;
        jp.kkfs[71] = -979660268;
        jp.kkfs[72] = -2084748831;
        jp.kkfs[73] = 1342245384;
        jp.kkfs[74] = -13893888;
        jp.kkfs[75] = 1996438905;
        jp.kkfs[76] = -2071912245;
        jp.kkfs[77] = -2073547914;
        jp.kkfs[78] = -12911275;
        jp.kkfs[79] = -6027636;
        jp.kkfs[80] = 1160827405;
        jp.kkfs[81] = -1332581816;
        jp.kkfs[82] = -1135220670;
        jp.kkfs[83] = 157064219;
        jp.kkfs[84] = 157058177;
        jp.kkfs[85] = 150400442;
        jp.kkfs[86] = 972029931;
        jp.kkfs[87] = -1188698263;
        jp.kkfs[88] = -462269002;
        jp.kkfs[89] = 1723828952;
        jp.kkfs[90] = -183604107;
        jp.kkfs[91] = -1075293322;
        jp.kkfs[92] = 750830047;
        jp.kkfs[93] = 1029154663;
        jp.kkfs[94] = -1272467167;
        jp.kkfs[95] = 208651394;
        jp.kkfs[96] = -1340367091;
        jp.kkfs[97] = -2104162675;
        jp.kkfs[98] = 1785604758;
        jp.kkfs[99] = -834952265;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public jp() {
        var2_1 /* !! */  = jp.b;
        super("ShulkerPreview", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0435 \u0448\u0430\u043b\u043a\u0435\u0440\u0430 \u043f\u0440\u0438 Ctrl \u0438 \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u0438", du.RENDER);
        this.world = new kb("\u0420\u0435\u043d\u0434\u0435\u0440\u0438\u0442\u044c \u0432 \u043c\u0438\u0440\u0435", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0435 \u0440\u044f\u0434\u043e\u043c \u0441 \u0432\u044b\u0431\u0440\u043e\u0448\u0435\u043d\u043d\u044b\u043c \u0448\u0430\u043b\u043a\u0435\u0440\u043e\u043c").setValue((boolean)jp.kkft("kkfu", kkfq(int ), (int)0));
        this.worldShulkers = new ArrayList<jp$WorldShulker>();
        this.worldPreviews = new ArrayList<jp$WorldPreview>();
        this.projected = new Vector2f();
        this.lastWorldScanAge = (int)jp.kkft("kkfv", kkfq(int ), (int)1);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block11: while (true) {
            block13: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.settings(new jx[]{this.world});
                        return;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)jp.kkft("kkfw", kkfq(int ), (int)2);
                        cfr_temp_0 = 1;
                        break block13;
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)jp.kkft("kkgd", kkfq(int ), (int)9);
                        cfr_temp_0 = 4;
                        break block13;
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)jp.kkft("kkge", kkfq(int ), (int)10);
                        ** GOTO lbl-1000
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)jp.kkft("kkfx", kkfq(int ), (int)3);
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)jp.kkft("kkfy", kkfq(int ), (int)4);
                        cfr_temp_0 = 1;
                        break block13;
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        var2_1 /* !! */  = (int)jp.kkft("kkfz", kkfq(int ), (int)5);
                    }
                    case 5: {
                        var2_1 /* !! */  = (int)jp.kkft("kkgb", kkfq(int ), (int)7);
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)jp.kkft("kkgc", kkfq(int ), (int)8);
                    }
                    case 4: 
                }
                ** GOTO lbl43
            }
            while (true) {
                if (true) continue block11;
lbl43:
                // 2 sources

                var2_1 /* !! */  = (int)jp.kkft("kkga", kkfq(int ), (int)6);
                cfr_temp_0 = 3;
            }
            break;
        }
    }

    private static /* synthetic */ void kllg() {
        jp.kkfr[300] = 274993495;
        jp.kkfr[301] = 283944493;
        jp.kkfr[302] = -2048632817;
        jp.kkfr[303] = -1782727951;
        jp.kkfr[304] = -839089319;
        jp.kkfr[305] = 797042353;
        jp.kkfr[306] = 373173220;
        jp.kkfr[307] = 1441170763;
        jp.kkfr[308] = 1348732820;
        jp.kkfr[309] = 1506500518;
        jp.kkfr[310] = -1326671380;
        jp.kkfr[311] = 262718378;
        jp.kkfr[312] = 1026168404;
        jp.kkfr[313] = -224686749;
        jp.kkfr[314] = -903666302;
        jp.kkfr[315] = 2135029103;
        jp.kkfr[316] = 317306762;
        jp.kkfr[317] = -1033530827;
        jp.kkfr[318] = 246270796;
        jp.kkfr[319] = 286945423;
        jp.kkfr[320] = 427263054;
        jp.kkfr[321] = -1842635323;
        jp.kkfr[322] = 1850980243;
        jp.kkfr[323] = -1825799148;
        jp.kkfr[324] = 1728756184;
        jp.kkfr[325] = -2019554765;
        jp.kkfr[326] = -940219328;
        jp.kkfr[327] = -148031896;
        jp.kkfr[328] = -2059971420;
        jp.kkfr[329] = -2000024567;
        jp.kkfr[330] = 78589570;
        jp.kkfr[331] = -1517542591;
        jp.kkfr[332] = 1132095232;
        jp.kkfr[333] = -2027347651;
        jp.kkfr[334] = -767116770;
        jp.kkfr[335] = -1900789957;
        jp.kkfr[336] = -1015472560;
        jp.kkfr[337] = -194996141;
        jp.kkfr[338] = -1162168775;
        jp.kkfr[339] = -1864818678;
        jp.kkfr[340] = 1597897452;
        jp.kkfr[341] = -493843223;
        jp.kkfr[342] = 834851487;
        jp.kkfr[343] = -1591368712;
        jp.kkfr[344] = 312885194;
        jp.kkfr[345] = -1342361488;
        jp.kkfr[346] = -1714765271;
        jp.kkfr[347] = -1726141131;
        jp.kkfr[348] = 995429687;
        jp.kkfr[349] = 332503353;
        jp.kkfr[350] = 854490573;
        jp.kkfr[351] = 1167478680;
        jp.kkfr[352] = 1750089022;
        jp.kkfr[353] = -738149072;
        jp.kkfr[354] = -1873303168;
        jp.kkfr[355] = 114939377;
        jp.kkfr[356] = 1667665363;
        jp.kkfr[357] = -1926836598;
        jp.kkfr[358] = -1343835059;
        jp.kkfr[359] = -530494450;
        jp.kkfr[360] = 610319104;
        jp.kkfr[361] = -780655266;
        jp.kkfr[362] = 589834624;
        jp.kkfr[363] = 1444015604;
        jp.kkfr[364] = -544598094;
        jp.kkfr[365] = 1617966689;
        jp.kkfr[366] = -805421897;
        jp.kkfr[367] = 1662551895;
        jp.kkfr[368] = 1373685004;
        jp.kkfr[369] = 1594819924;
        jp.kkfr[370] = -1426586251;
        jp.kkfr[371] = -1144319476;
        jp.kkfr[372] = 1779706939;
        jp.kkfr[373] = -2102764013;
        jp.kkfr[374] = -266076055;
        jp.kkfr[375] = 1931232362;
        jp.kkfr[376] = 834691758;
        jp.kkfr[377] = 1435593173;
        jp.kkfr[378] = -1244339235;
        jp.kkfr[379] = 117482126;
        jp.kkfr[380] = -739034249;
        jp.kkfr[381] = 1555466086;
        jp.kkfr[382] = 1533215397;
        jp.kkfr[383] = -1894772911;
        jp.kkfr[384] = 1944099205;
        jp.kkfr[385] = -48796469;
        jp.kkfr[386] = -1411648682;
        jp.kkfr[387] = 386236115;
        jp.kkfr[388] = 1458624472;
        jp.kkfr[389] = -459811841;
        jp.kkfr[390] = -1384550752;
        jp.kkfr[391] = -189485239;
        jp.kkfr[392] = 1823300139;
        jp.kkfr[393] = -1971111975;
        jp.kkfr[394] = 382965417;
        jp.kkfr[395] = 1881672540;
        jp.kkfr[396] = 1522309963;
        jp.kkfr[397] = -869373958;
        jp.kkfr[398] = -2125323788;
        jp.kkfr[399] = -887677543;
    }

    private static /* synthetic */ void klll() {
        jp.kkfs[200] = 1863210472;
        jp.kkfs[201] = -912788106;
        jp.kkfs[202] = -484321030;
        jp.kkfs[203] = 2012221252;
        jp.kkfs[204] = -547368743;
        jp.kkfs[205] = -1014309226;
        jp.kkfs[206] = 1796755227;
        jp.kkfs[207] = 542148080;
        jp.kkfs[208] = 1765709886;
        jp.kkfs[209] = 1694553765;
        jp.kkfs[210] = 1753639229;
        jp.kkfs[211] = 1337184863;
        jp.kkfs[212] = 1158228814;
        jp.kkfs[213] = -266717382;
        jp.kkfs[214] = -1579553425;
        jp.kkfs[215] = -1202975910;
        jp.kkfs[216] = 1377950310;
        jp.kkfs[217] = 1261415200;
        jp.kkfs[218] = -1946881190;
        jp.kkfs[219] = 870888809;
        jp.kkfs[220] = -481793475;
        jp.kkfs[221] = 395142013;
        jp.kkfs[222] = 1590811794;
        jp.kkfs[223] = -1538066791;
        jp.kkfs[224] = -854706597;
        jp.kkfs[225] = -1966474442;
        jp.kkfs[226] = 134086191;
        jp.kkfs[227] = 307413631;
        jp.kkfs[228] = 1279624907;
        jp.kkfs[229] = -1390564206;
        jp.kkfs[230] = -1155739748;
        jp.kkfs[231] = 353124989;
        jp.kkfs[232] = 186912015;
        jp.kkfs[233] = 1313127709;
        jp.kkfs[234] = -781274450;
        jp.kkfs[235] = -527106493;
        jp.kkfs[236] = 719043667;
        jp.kkfs[237] = -708688946;
        jp.kkfs[238] = 1433643255;
        jp.kkfs[239] = -359364456;
        jp.kkfs[240] = -202608411;
        jp.kkfs[241] = -1459180181;
        jp.kkfs[242] = -529298852;
        jp.kkfs[243] = 1186772058;
        jp.kkfs[244] = -1935402267;
        jp.kkfs[245] = 2085593900;
        jp.kkfs[246] = 171610341;
        jp.kkfs[247] = 1596036547;
        jp.kkfs[248] = -1435869128;
        jp.kkfs[249] = -1471334498;
        jp.kkfs[250] = 1626492372;
        jp.kkfs[251] = -1371941907;
        jp.kkfs[252] = -1429214782;
        jp.kkfs[253] = -655196726;
        jp.kkfs[254] = -856925192;
        jp.kkfs[255] = -1781264745;
        jp.kkfs[256] = 1546178515;
        jp.kkfs[257] = -946475370;
        jp.kkfs[258] = 464872258;
        jp.kkfs[259] = 1339448361;
        jp.kkfs[260] = 771545569;
        jp.kkfs[261] = -2048376726;
        jp.kkfs[262] = -1273216616;
        jp.kkfs[263] = 2137596917;
        jp.kkfs[264] = -1357937288;
        jp.kkfs[265] = 1586402581;
        jp.kkfs[266] = -1019056919;
        jp.kkfs[267] = -612443969;
        jp.kkfs[268] = -2073229202;
        jp.kkfs[269] = -711515662;
        jp.kkfs[270] = 1988616833;
        jp.kkfs[271] = 1253988223;
        jp.kkfs[272] = 839434842;
        jp.kkfs[273] = -1664240058;
        jp.kkfs[274] = -1871300707;
        jp.kkfs[275] = 485355108;
        jp.kkfs[276] = -1521692347;
        jp.kkfs[277] = -1066941460;
        jp.kkfs[278] = 754163522;
        jp.kkfs[279] = -1554427876;
        jp.kkfs[280] = -339624542;
        jp.kkfs[281] = 768986675;
        jp.kkfs[282] = 1145043274;
        jp.kkfs[283] = -1869809838;
        jp.kkfs[284] = -2031062661;
        jp.kkfs[285] = 1795318535;
        jp.kkfs[286] = 701185726;
        jp.kkfs[287] = 1415954040;
        jp.kkfs[288] = -2112885011;
        jp.kkfs[289] = -1373306290;
        jp.kkfs[290] = 890625899;
        jp.kkfs[291] = 874229701;
        jp.kkfs[292] = -1590461994;
        jp.kkfs[293] = -137259116;
        jp.kkfs[294] = 482403503;
        jp.kkfs[295] = -2099555967;
        jp.kkfs[296] = 2076518604;
        jp.kkfs[297] = -1336710679;
        jp.kkfs[298] = -2013467245;
        jp.kkfs[299] = -17763712;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = jp.sm;
        if (true) ** GOTO lbl5
        block47: while (true) {
            v0 /* !! */  = (long)(v1 - jp.kkft("kkgx", kkgf(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1385391859: {
                    v1 = jp.kkft("kkgy", kkgf(int ), (int)6);
                    continue block47;
                }
                case 825315334: {
                    break block47;
                }
                case 1118177567: {
                    v1 = jp.kkft("kkgz", kkgf(int ), (int)7);
                    continue block47;
                }
                case 1681079744: {
                    v1 = jp.kkft("kkha", kkgf(int ), (int)8);
                    continue block47;
                }
            }
            break;
        }
        var3_1 = jp.c;
        v2 /* !! */  = jp.sm;
        if (true) ** GOTO lbl22
        block48: while (true) {
            v2 /* !! */  = (long)(v3 - jp.kkft("kkhb", kkgf(int ), (int)9));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -944453083: {
                    v3 = jp.kkft("kkhc", kkgf(int ), (int)10);
                    continue block48;
                }
                case 825315334: {
                    break block48;
                }
                case 1123723427: {
                    v3 = jp.kkft("kkhd", kkgf(int ), (int)11);
                    continue block48;
                }
            }
            break;
        }
        var2_2 /* !! */  = jp.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block49: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_1 = jp.sm - jp.kkft("kkhe", kkgf(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == jp.kkft("kkhf", kkfq(int ), (int)21)) {
                            var1_3 = jp.a;
                            if (var3_1) {
                                throw null;
                            }
                            break;
                        }
                        v4 /* !! */  = (long)jp.kkft("kkhg", kkfq(int ), (int)22);
                    }
                    if (var1_3 || var1_3) return;
                    v5 /* !! */  = jp.sm;
                    block51: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -1191537577: {
                                v6 = jp.kkft("kkhi", kkgf(int ), (int)14);
                                ** GOTO lbl61
                            }
                            case -958599263: {
                                v6 = jp.kkft("kkhj", kkgf(int ), (int)15);
                                ** GOTO lbl61
                            }
                            case 825315334: {
                                break block51;
                            }
                            case 1750506919: {
                                v6 = jp.kkft("kkhk", kkgf(int ), (int)16);
lbl61:
                                // 3 sources

                                v5 /* !! */  = (long)(v6 - jp.kkft("kkhh", kkgf(int ), (int)13));
                                continue block51;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = jp.sm;
                    block52: while (true) {
                        switch ((int)v7 /* !! */ ) {
                            case 729683289: {
                                v8 = jp.kkft("kkhm", kkgf(int ), (int)18);
                                ** GOTO lbl73
                            }
                            case 825315334: {
                                break block52;
                            }
                            case 1070611189: {
                                v8 = jp.kkft("kkhn", kkgf(int ), (int)19);
lbl73:
                                // 2 sources

                                v7 /* !! */  = (long)(v8 - jp.kkft("kkhl", kkgf(int ), (int)17));
                                continue block52;
                            }
                        }
                        break;
                    }
                    this.worldShulkers.clear();
                    if (var1_3 || var1_3) return;
                    v9 /* !! */  = jp.sm;
                    block53: while (true) {
                        switch ((int)v9 /* !! */ ) {
                            case -716739287: {
                                v10 = jp.kkft("kkhp", kkgf(int ), (int)21);
                                ** GOTO lbl85
                            }
                            case -527827650: {
                                v10 = jp.kkft("kkhq", kkgf(int ), (int)22);
lbl85:
                                // 2 sources

                                v9 /* !! */  = (long)(v10 - jp.kkft("kkho", kkgf(int ), (int)20));
                                continue block53;
                            }
                            case 825315334: {
                                break block53;
                            }
                        }
                        break;
                    }
                    v11 /* !! */  = jp.sm;
                    block54: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case -1031639594: {
                                v12 = jp.kkft("kkhs", kkgf(int ), (int)24);
                                ** GOTO lbl100
                            }
                            case -972123593: {
                                v12 = jp.kkft("kkht", kkgf(int ), (int)25);
                                ** GOTO lbl100
                            }
                            case -776620113: {
                                v12 = jp.kkft("kkhu", kkgf(int ), (int)26);
lbl100:
                                // 3 sources

                                v11 /* !! */  = (long)(v12 - jp.kkft("kkhr", kkgf(int ), (int)23));
                                continue block54;
                            }
                            case 825315334: {
                                break block54;
                            }
                        }
                        break;
                    }
                    this.worldPreviews.clear();
                    if (var1_3 || var1_3) return;
                    v13 = jp.kkft("kkhv", kkfq(int ), (int)23);
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_2 = jp.sm - jp.kkft("kkhw", kkgf(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v14 /* !! */  == jp.kkft("kkhx", kkfq(int ), (int)24)) {
                            this.lastWorldScanAge = (int)v13;
                            if (var1_3) return;
                            break;
                        }
                        v14 /* !! */  = (long)jp.kkft("kkhy", kkfq(int ), (int)25);
                    }
                    if (var1_3) return;
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_3 = jp.sm - jp.kkft("kkhz", kkgf(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v15 /* !! */  == jp.kkft("kkia", kkfq(int ), (int)26)) {
                            this.lastScannedWorld = null;
                            if (var1_3) return;
                            break;
                        }
                        v15 /* !! */  = (long)jp.kkft("kkib", kkfq(int ), (int)27);
                    }
                    if (!var1_3) return;
                    return;
                }
                case 2: {
                    var2_2 /* !! */  = (int)jp.kkft("kkie", kkfq(int ), (int)30);
                    cfr_temp_0 = 7;
                    if (!var3_1) continue block49;
                    throw null;
                }
                case 4: {
                    var2_2 /* !! */  = (int)jp.kkft("kkig", kkfq(int ), (int)32);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)jp.kkft("kkif", kkfq(int ), (int)31);
                    cfr_temp_0 = 10;
                    if (!var3_1) continue block49;
                    throw null;
                }
                case 5: {
                    ** GOTO lbl167
                }
                case 8: {
                    var2_2 /* !! */  = (int)jp.kkft("kkik", kkfq(int ), (int)36);
                    cfr_temp_0 = 7;
                    if (!var3_1) continue block49;
                    throw null;
                }
                case 9: {
                    var2_2 /* !! */  = (int)jp.kkft("kkil", kkfq(int ), (int)37);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: {
                    var2_2 /* !! */  = (int)jp.kkft("kkic", kkfq(int ), (int)28);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block49;
                    throw null;
                }
                case 10: {
                    var2_2 /* !! */  = (int)jp.kkft("kkim", kkfq(int ), (int)38);
                    cfr_temp_0 = 7;
                    if (!var3_1) continue block49;
                    throw null;
                }
                case 11: {
                    var2_2 /* !! */  = (int)jp.kkft("kkin", kkfq(int ), (int)39);
                    if (var3_1) {
                        throw null;
                    }
lbl167:
                    // 3 sources

                    var2_2 /* !! */  = (int)jp.kkft("kkih", kkfq(int ), (int)33);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 6: {
                    var2_2 /* !! */  = (int)jp.kkft("kkii", kkfq(int ), (int)34);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 7: {
                    var2_2 /* !! */  = (int)jp.kkft("kkij", kkfq(int ), (int)35);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)jp.kkft("kkid", kkfq(int ), (int)29);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<class_1799> contents(class_1799 var1_1) {
        block138: {
            block137: {
                block133: {
                    block135: {
                        block134: {
                            var13_2 = jp.c;
                            var12_3 /* !! */  = jp.b;
                            var11_4 = jp.a;
                            if (var13_2) {
                                throw null;
lbl6:
                                // 38 sources

                                return null;
                            }
                            if (var11_4 || var11_4) ** GOTO lbl6
                            var3_5 = var1_1.method_7909();
                            if (var11_4) ** GOTO lbl6
                            if (!(var3_5 instanceof class_1747)) break block134;
                            if (var11_4) ** GOTO lbl6
                            var2_6 = (class_1747)var3_5;
                            if (var11_4 || var11_4) ** GOTO lbl6
                            if (var2_6.method_7711() instanceof class_2480) break block135;
                            if (var11_4) ** GOTO lbl6
                        }
                        if (var11_4 || var11_4) ** GOTO lbl6
                        return null;
                    }
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var3_5 = class_2371.method_10213((int)jp.kkft("kled", kkfq(int ), (int)376), (Object)class_1799.field_8037);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var4_7 = (class_9288)var1_1.method_58694(class_9334.field_49622);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var4_7 == null) break block133;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var4_7.method_57492((class_2371)var3_5);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var5_8 = var3_5.iterator();
                    if (var11_4) ** GOTO lbl6
                    do {
                        block136: {
                            if (var11_4 || var11_4) ** GOTO lbl6
                            if (!var5_8.hasNext()) break block133;
                            if (var11_4) ** GOTO lbl6
                            var6_9 = (class_1799)var5_8.next();
                            if (var11_4 || var11_4) ** GOTO lbl6
                            if (var6_9.method_7960()) break block136;
                            if (var11_4) ** GOTO lbl6
                            return var3_5;
                        }
                        if (var11_4 || var11_4) ** GOTO lbl6
                    } while (!var13_2);
                    throw null;
                }
                if (var11_4 || var11_4) ** GOTO lbl6
                var5_8 = (class_11580)var1_1.method_58694(class_9334.field_49611);
                if (var11_4 || var11_4) ** GOTO lbl6
                if (var5_8 == null) break block137;
                if (var11_4) ** GOTO lbl6
                if (jp.mc.field_1687 != null) break block138;
                if (var11_4) ** GOTO lbl6
            }
            if (var11_4 || var11_4) ** GOTO lbl6
            return var3_5;
        }
        if (var11_4 || var11_4) ** GOTO lbl6
        var6_9 = var5_8.method_72540().method_68569("Items");
        if (var11_4 || var11_4) ** GOTO lbl6
        var7_10 = jp.mc.field_1687.method_30349().method_57093((DynamicOps)class_2509.field_11560);
        if (var11_4) ** GOTO lbl6
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_4) ** GOTO lbl6
                var8_11 = jp.kkft("klee", kkfq(int ), (int)377);
                if (var11_4) ** GOTO lbl6
                do {
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var8_11 >= var6_9.size()) ** GOTO lbl91
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var9_12 = var6_9.method_68582((int)var8_11);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var10_13 = Byte.toUnsignedInt(var9_12.method_68562("Slot", (byte)var8_11));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var10_13 < 0) ** GOTO lbl86
                    if (var11_4) ** GOTO lbl6
                    if (var10_13 < jp.kkft("klef", kkfq(int ), (int)378)) ** GOTO lbl83
                    if (var11_4) ** GOTO lbl6
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl86
lbl83:
                    // 1 sources

                    if (var11_4 || var11_4) ** GOTO lbl6
                    class_1799.field_24671.parse((DynamicOps)var7_10, (Object)var9_12).result().ifPresent((Consumer<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$contents$1(net.minecraft.class_2371 int net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)V)((class_2371)var3_5, (int)var10_13));
                    if (var11_4) ** GOTO lbl6
lbl86:
                    // 3 sources

                    if (var11_4 || var11_4) ** GOTO lbl6
                    ++var8_11;
                    if (var11_4) ** GOTO lbl6
                } while (!var13_2);
                throw null;
lbl91:
                // 1 sources

                if (!var11_4 && !var11_4) ** break;
                ** continue;
                return var3_5;
            }
lbl94:
            // 2 sources

            case 0: {
                var12_3 /* !! */  = (int)jp.kkft("kleg", kkfq(int ), (int)379);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl99:
            // 2 sources

            case 1: {
                var12_3 /* !! */  = (int)jp.kkft("kleh", kkfq(int ), (int)380);
                if (!var13_2) break;
                throw null;
            }
lbl103:
            // 2 sources

            case 2: {
                var12_3 /* !! */  = (int)jp.kkft("klei", kkfq(int ), (int)381);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl108:
            // 2 sources

            case 3: {
                var12_3 /* !! */  = (int)jp.kkft("klej", kkfq(int ), (int)382);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl113:
            // 3 sources

            case 4: {
                var12_3 /* !! */  = (int)jp.kkft("klek", kkfq(int ), (int)383);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl118:
            // 2 sources

            case 5: {
                var12_3 /* !! */  = (int)jp.kkft("klel", kkfq(int ), (int)384);
                if (!var13_2) ** GOTO lbl108
                throw null;
            }
lbl122:
            // 2 sources

            case 6: {
                var12_3 /* !! */  = (int)jp.kkft("klem", kkfq(int ), (int)385);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 7: {
                var12_3 /* !! */  = (int)jp.kkft("klen", kkfq(int ), (int)386);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 8: {
                var12_3 /* !! */  = (int)jp.kkft("kleo", kkfq(int ), (int)387);
                if (!var13_2) ** GOTO lbl94
                throw null;
            }
            case 9: {
                var12_3 /* !! */  = (int)jp.kkft("klep", kkfq(int ), (int)388);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl141:
            // 3 sources

            case 10: {
                var12_3 /* !! */  = (int)jp.kkft("kleq", kkfq(int ), (int)389);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl146:
            // 2 sources

            case 11: {
                var12_3 /* !! */  = (int)jp.kkft("kler", kkfq(int ), (int)390);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl151:
            // 2 sources

            case 12: {
                var12_3 /* !! */  = (int)jp.kkft("kles", kkfq(int ), (int)391);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 13: {
                var12_3 /* !! */  = (int)jp.kkft("klet", kkfq(int ), (int)392);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl161:
            // 3 sources

            case 14: {
                var12_3 /* !! */  = (int)jp.kkft("kleu", kkfq(int ), (int)393);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl166:
            // 4 sources

            case 15: {
                var12_3 /* !! */  = (int)jp.kkft("klev", kkfq(int ), (int)394);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl171:
            // 4 sources

            case 16: {
                var12_3 /* !! */  = (int)jp.kkft("klew", kkfq(int ), (int)395);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 17: {
                var12_3 /* !! */  = (int)jp.kkft("klex", kkfq(int ), (int)396);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 18: {
                var12_3 /* !! */  = (int)jp.kkft("kley", kkfq(int ), (int)397);
                if (!var13_2) ** GOTO lbl146
                throw null;
            }
            case 19: {
                var12_3 /* !! */  = (int)jp.kkft("klez", kkfq(int ), (int)398);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl190:
            // 3 sources

            case 20: {
                var12_3 /* !! */  = (int)jp.kkft("klfa", kkfq(int ), (int)399);
                if (!var13_2) ** GOTO lbl166
                throw null;
            }
lbl194:
            // 2 sources

            case 21: {
                var12_3 /* !! */  = (int)jp.kkft("klfb", kkfq(int ), (int)400);
                if (!var13_2) ** GOTO lbl166
                throw null;
            }
lbl198:
            // 2 sources

            case 22: {
                var12_3 /* !! */  = (int)jp.kkft("klfc", kkfq(int ), (int)401);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl203:
            // 3 sources

            case 23: {
                var12_3 /* !! */  = (int)jp.kkft("klfd", kkfq(int ), (int)402);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl208:
            // 2 sources

            case 24: {
                var12_3 /* !! */  = (int)jp.kkft("klfe", kkfq(int ), (int)403);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl213:
            // 2 sources

            case 25: {
                var12_3 /* !! */  = (int)jp.kkft("klff", kkfq(int ), (int)404);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl218:
            // 2 sources

            case 26: {
                var12_3 /* !! */  = (int)jp.kkft("klfg", kkfq(int ), (int)405);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
            case 27: {
                var12_3 /* !! */  = (int)jp.kkft("klfh", kkfq(int ), (int)406);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl228:
            // 2 sources

            case 28: {
                var12_3 /* !! */  = (int)jp.kkft("klfi", kkfq(int ), (int)407);
                if (!var13_2) ** GOTO lbl141
                throw null;
            }
            case 29: {
                var12_3 /* !! */  = (int)jp.kkft("klfj", kkfq(int ), (int)408);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
            case 30: {
                var12_3 /* !! */  = (int)jp.kkft("klfk", kkfq(int ), (int)409);
                if (!var13_2) ** GOTO lbl103
                throw null;
            }
            case 31: {
                var12_3 /* !! */  = (int)jp.kkft("klfl", kkfq(int ), (int)410);
                if (!var13_2) ** GOTO lbl198
                throw null;
            }
lbl245:
            // 3 sources

            case 32: {
                var12_3 /* !! */  = (int)jp.kkft("klfm", kkfq(int ), (int)411);
                if (!var13_2) ** GOTO lbl161
                throw null;
            }
lbl249:
            // 2 sources

            case 33: {
                var12_3 /* !! */  = (int)jp.kkft("klfn", kkfq(int ), (int)412);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 34: {
                var12_3 /* !! */  = (int)jp.kkft("klfo", kkfq(int ), (int)413);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl259:
            // 2 sources

            case 35: {
                var12_3 /* !! */  = (int)jp.kkft("klfp", kkfq(int ), (int)414);
                if (!var13_2) ** GOTO lbl171
                throw null;
            }
lbl263:
            // 3 sources

            case 36: {
                var12_3 /* !! */  = (int)jp.kkft("klfq", kkfq(int ), (int)415);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 37: {
                var12_3 /* !! */  = (int)jp.kkft("klfr", kkfq(int ), (int)416);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 38: {
                var12_3 /* !! */  = (int)jp.kkft("klfs", kkfq(int ), (int)417);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl278:
            // 2 sources

            case 39: {
                var12_3 /* !! */  = (int)jp.kkft("klft", kkfq(int ), (int)418);
                if (!var13_2) ** GOTO lbl99
                throw null;
            }
            case 40: {
                var12_3 /* !! */  = (int)jp.kkft("klfu", kkfq(int ), (int)419);
                if (!var13_2) ** GOTO lbl118
                throw null;
            }
lbl286:
            // 2 sources

            case 41: {
                var12_3 /* !! */  = (int)jp.kkft("klfv", kkfq(int ), (int)420);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl291:
            // 2 sources

            case 42: {
                var12_3 /* !! */  = (int)jp.kkft("klfw", kkfq(int ), (int)421);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl296:
            // 2 sources

            case 43: {
                var12_3 /* !! */  = (int)jp.kkft("klfx", kkfq(int ), (int)422);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl301:
            // 4 sources

            case 44: {
                var12_3 /* !! */  = (int)jp.kkft("klfy", kkfq(int ), (int)423);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl306:
            // 2 sources

            case 45: {
                var12_3 /* !! */  = (int)jp.kkft("klfz", kkfq(int ), (int)424);
                if (!var13_2) ** GOTO lbl263
                throw null;
            }
            case 46: {
                var12_3 /* !! */  = (int)jp.kkft("klga", kkfq(int ), (int)425);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl315:
            // 2 sources

            case 47: {
                var12_3 /* !! */  = (int)jp.kkft("klgb", kkfq(int ), (int)426);
                if (!var13_2) ** GOTO lbl190
                throw null;
            }
lbl319:
            // 2 sources

            case 48: {
                var12_3 /* !! */  = (int)jp.kkft("klgc", kkfq(int ), (int)427);
                if (!var13_2) ** GOTO lbl249
                throw null;
            }
            case 49: {
                var12_3 /* !! */  = (int)jp.kkft("klgd", kkfq(int ), (int)428);
                if (!var13_2) ** GOTO lbl228
                throw null;
            }
lbl327:
            // 2 sources

            case 50: {
                var12_3 /* !! */  = (int)jp.kkft("klge", kkfq(int ), (int)429);
                if (!var13_2) ** GOTO lbl301
                throw null;
            }
lbl331:
            // 2 sources

            case 51: {
                var12_3 /* !! */  = (int)jp.kkft("klgf", kkfq(int ), (int)430);
                if (!var13_2) ** GOTO lbl161
                throw null;
            }
lbl335:
            // 2 sources

            case 52: {
                var12_3 /* !! */  = (int)jp.kkft("klgg", kkfq(int ), (int)431);
                if (!var13_2) ** GOTO lbl213
                throw null;
            }
            case 53: {
                var12_3 /* !! */  = (int)jp.kkft("klgh", kkfq(int ), (int)432);
                if (!var13_2) ** GOTO lbl122
                throw null;
            }
            case 54: {
                var12_3 /* !! */  = (int)jp.kkft("klgi", kkfq(int ), (int)433);
                if (!var13_2) ** GOTO lbl141
                throw null;
            }
lbl347:
            // 3 sources

            case 55: {
                var12_3 /* !! */  = (int)jp.kkft("klgj", kkfq(int ), (int)434);
                if (!var13_2) ** GOTO lbl208
                throw null;
            }
            case 56: {
                var12_3 /* !! */  = (int)jp.kkft("klgk", kkfq(int ), (int)435);
                if (!var13_2) ** GOTO lbl245
                throw null;
            }
lbl355:
            // 3 sources

            case 57: {
                var12_3 /* !! */  = (int)jp.kkft("klgl", kkfq(int ), (int)436);
                if (!var13_2) ** GOTO lbl291
                throw null;
            }
lbl359:
            // 2 sources

            case 58: {
                var12_3 /* !! */  = (int)jp.kkft("klgm", kkfq(int ), (int)437);
                if (!var13_2) ** GOTO lbl218
                throw null;
            }
lbl363:
            // 3 sources

            case 59: {
                var12_3 /* !! */  = (int)jp.kkft("klgn", kkfq(int ), (int)438);
                if (!var13_2) ** GOTO lbl151
                throw null;
            }
lbl367:
            // 2 sources

            case 60: {
                var12_3 /* !! */  = (int)jp.kkft("klgo", kkfq(int ), (int)439);
                if (!var13_2) ** GOTO lbl113
                throw null;
            }
            case 61: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_3 /* !! */  = (int)jp.kkft("klgp", kkfq(int ), (int)440);
                    if (!var13_2) ** GOTO lbl355
                    throw null;
                }
            }
            case 62: {
                var12_3 /* !! */  = (int)jp.kkft("klgq", kkfq(int ), (int)441);
                if (!var13_2) break;
                throw null;
            }
lbl380:
            // 3 sources

            case 63: {
                var12_3 /* !! */  = (int)jp.kkft("klgr", kkfq(int ), (int)442);
                if (!var13_2) ** GOTO lbl113
                throw null;
            }
lbl384:
            // 5 sources

            case 64: {
                var12_3 /* !! */  = (int)jp.kkft("klgs", kkfq(int ), (int)443);
                if (!var13_2) ** GOTO lbl306
                throw null;
            }
            case 65: 
        }
        var12_3 /* !! */  = (int)jp.kkft("klgt", kkfq(int ), (int)444);
        ** while (!var13_2)
lbl391:
        // 1 sources

        throw null;
    }
}

