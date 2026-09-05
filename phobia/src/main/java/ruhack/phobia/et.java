/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_3966
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_3966;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.et$ActionPhase;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kf;
import ruhack.phobia.nu;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.nz;
import ruhack.phobia.od;
import ruhack.phobia.oe;
import ruhack.phobia.pp;

public class et
extends ds {
    private final nx actionMovement;
    static final long dv = 1998775694514543267L;
    public static final int b;
    private String pendingNotFoundMessage;
    public static final boolean a;
    public final kf mode;
    private boolean visibleLegitSwap;
    public static final boolean c;
    private int pearlSlot;
    private final od script;
    private static int[] bqjn;
    private static long[] bqmd;
    private et$ActionPhase actionPhase;
    private final ka friendBind;
    private boolean isFromHotbar;
    private int previousSlot;
    private final ka pearlBind;
    private class_1792 pendingItem;
    private static int[] bqjo;
    private static long[] bqme;
    private int stopTicks;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeItemInstant(class_1792 var1_1, String var2_2) {
        var8_3 = et.c;
        var7_4 /* !! */  = et.b;
        var6_5 = et.a;
        if (var8_3) {
            throw null;
lbl6:
            // 15 sources

            return;
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        var3_6 = this.findInHotbar(var1_1);
        if (var6_5 || var6_5) ** GOTO lbl6
        if (!var3_6.found()) ** GOTO lbl23
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5 || var6_5) ** GOTO lbl6
                nv.selectSlotSilent(var3_6.slot());
                if (var6_5 || var6_5) ** GOTO lbl6
                nv.sendUsePacket(class_1268.field_5808);
                if (var6_5 || var6_5) ** GOTO lbl6
                nv.selectSlotSilent(et.mc.field_1724.method_31548().method_67532());
                if (var6_5 || var6_5) ** GOTO lbl6
                return;
            }
lbl23:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var4_7 = this.findInInventory(var1_1);
            if (var6_5 || var6_5) ** GOTO lbl6
            if (var4_7.found()) ** GOTO lbl31
            if (var6_5 || var6_5) ** GOTO lbl6
            pp.brandmessage(var2_2);
            if (var6_5 || var6_5) ** GOTO lbl6
            return;
lbl31:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var5_8 = et.mc.field_1724.method_31548().method_67532();
            if (var6_5 || var6_5) ** GOTO lbl6
            nv.swapHotbar(var4_7.slot(), var5_8);
            if (var6_5 || var6_5) ** GOTO lbl6
            nv.sendUsePacket(class_1268.field_5808);
            if (var6_5 || var6_5) ** GOTO lbl6
            nv.swapHotbar(var4_7.slot(), var5_8);
            if (var6_5 || var6_5) ** continue;
            return;
            case 0: {
                var7_4 /* !! */  = (int)et.bqjp("bqnp", bqjm(int ), (int)91);
                if (var8_3) {
                    throw null;
                }
            }
lbl45:
            // 4 sources

            case 1: {
                var7_4 /* !! */  = (int)et.bqjp("bqnq", bqjm(int ), (int)92);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 2: {
                var7_4 /* !! */  = (int)et.bqjp("bqnr", bqjm(int ), (int)93);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl55:
            // 3 sources

            case 3: {
                var7_4 /* !! */  = (int)et.bqjp("bqns", bqjm(int ), (int)94);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl60:
            // 3 sources

            case 4: {
                var7_4 /* !! */  = (int)et.bqjp("bqnt", bqjm(int ), (int)95);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl65:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)et.bqjp("bqnu", bqjm(int ), (int)96);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl70:
            // 3 sources

            case 6: {
                var7_4 /* !! */  = (int)et.bqjp("bqnv", bqjm(int ), (int)97);
                if (!var8_3) ** GOTO lbl45
                throw null;
            }
            case 7: {
                var7_4 /* !! */  = (int)et.bqjp("bqnw", bqjm(int ), (int)98);
                if (!var8_3) ** GOTO lbl55
                throw null;
            }
            case 8: {
                var7_4 /* !! */  = (int)et.bqjp("bqnx", bqjm(int ), (int)99);
                if (!var8_3) ** GOTO lbl70
                throw null;
            }
lbl82:
            // 4 sources

            case 9: {
                var7_4 /* !! */  = (int)et.bqjp("bqny", bqjm(int ), (int)100);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl87:
            // 3 sources

            case 10: {
                var7_4 /* !! */  = (int)et.bqjp("bqnz", bqjm(int ), (int)101);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 11: {
                var7_4 /* !! */  = (int)et.bqjp("bqoa", bqjm(int ), (int)102);
                if (!var8_3) ** GOTO lbl82
                throw null;
            }
lbl96:
            // 3 sources

            case 12: {
                var7_4 /* !! */  = (int)et.bqjp("bqob", bqjm(int ), (int)103);
                if (!var8_3) ** GOTO lbl60
                throw null;
            }
lbl100:
            // 2 sources

            case 13: {
                var7_4 /* !! */  = (int)et.bqjp("bqoc", bqjm(int ), (int)104);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 14: {
                var7_4 /* !! */  = (int)et.bqjp("bqod", bqjm(int ), (int)105);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 15: {
                var7_4 /* !! */  = (int)et.bqjp("bqoe", bqjm(int ), (int)106);
                if (!var8_3) ** GOTO lbl100
                throw null;
            }
lbl114:
            // 2 sources

            case 16: {
                var7_4 /* !! */  = (int)et.bqjp("bqof", bqjm(int ), (int)107);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 17: {
                var7_4 /* !! */  = (int)et.bqjp("bqog", bqjm(int ), (int)108);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl124:
            // 3 sources

            case 18: {
                var7_4 /* !! */  = (int)et.bqjp("bqoh", bqjm(int ), (int)109);
                if (!var8_3) ** GOTO lbl55
                throw null;
            }
            case 19: {
                var7_4 /* !! */  = (int)et.bqjp("bqoi", bqjm(int ), (int)110);
                if (!var8_3) ** GOTO lbl82
                throw null;
            }
lbl132:
            // 3 sources

            case 20: {
                var7_4 /* !! */  = (int)et.bqjp("bqoj", bqjm(int ), (int)111);
                if (!var8_3) ** GOTO lbl87
                throw null;
            }
lbl136:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)et.bqjp("bqok", bqjm(int ), (int)112);
                    if (!var8_3) ** GOTO lbl60
                    throw null;
                }
            }
            case 22: {
                var7_4 /* !! */  = (int)et.bqjp("bqol", bqjm(int ), (int)113);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl146:
            // 2 sources

            case 23: {
                var7_4 /* !! */  = (int)et.bqjp("bqom", bqjm(int ), (int)114);
                if (!var8_3) ** GOTO lbl82
                throw null;
            }
lbl150:
            // 3 sources

            case 24: {
                var7_4 /* !! */  = (int)et.bqjp("bqon", bqjm(int ), (int)115);
                if (!var8_3) ** GOTO lbl65
                throw null;
            }
lbl154:
            // 2 sources

            case 25: {
                var7_4 /* !! */  = (int)et.bqjp("bqoo", bqjm(int ), (int)116);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl159:
            // 3 sources

            case 26: {
                var7_4 /* !! */  = (int)et.bqjp("bqop", bqjm(int ), (int)117);
                if (!var8_3) ** GOTO lbl114
                throw null;
            }
            case 27: {
                var7_4 /* !! */  = (int)et.bqjp("bqoq", bqjm(int ), (int)118);
                if (!var8_3) ** GOTO lbl70
                throw null;
            }
            case 28: {
                var7_4 /* !! */  = (int)et.bqjp("bqor", bqjm(int ), (int)119);
                if (!var8_3) ** GOTO lbl96
                throw null;
            }
lbl171:
            // 3 sources

            case 29: {
                var7_4 /* !! */  = (int)et.bqjp("bqos", bqjm(int ), (int)120);
                if (!var8_3) ** GOTO lbl96
                throw null;
            }
            case 30: {
                var7_4 /* !! */  = (int)et.bqjp("bqot", bqjm(int ), (int)121);
                if (!var8_3) ** GOTO lbl87
                throw null;
            }
lbl179:
            // 2 sources

            case 31: {
                var7_4 /* !! */  = (int)et.bqjp("bqou", bqjm(int ), (int)122);
                if (!var8_3) ** GOTO lbl150
                throw null;
            }
            case 32: 
        }
        var7_4 /* !! */  = (int)et.bqjp("bqov", bqjm(int ), (int)123);
        ** while (!var8_3)
lbl186:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bqjm(int n2) {
        return bqjn[n2] ^ bqjo[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findInHotbar(class_1792 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("braz", bqmc(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == et.bqjp("brba", bqjm(int ), (int)339)) break;
            v0 /* !! */  = (long)et.bqjp("brbb", bqjm(int ), (int)340);
        }
        var6_2 = et.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("brbf", bqmc(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == et.bqjp("brbh", bqjm(int ), (int)341)) break;
            v1 /* !! */  = (long)et.bqjp("brbi", bqjm(int ), (int)342);
        }
        var5_3 /* !! */  = et.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("brbj", bqmc(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == et.bqjp("brbl", bqjm(int ), (int)343)) break;
            v2 /* !! */  = (long)et.bqjp("brbn", bqjm(int ), (int)344);
        }
        var4_4 = et.a;
        if (!var6_2) ** GOTO lbl25
        throw null;
        {
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl25:
                // 1 sources

                if (var4_4 || var4_4) continue block57;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("brbo", bqmc(int ), (int)53)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == et.bqjp("brbs", bqjm(int ), (int)345)) break;
                    v3 /* !! */  = (long)et.bqjp("brbu", bqjm(int ), (int)346);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = et.dv - et.bqjp("brbw", bqmc(int ), (int)54)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == et.bqjp("brbx", bqjm(int ), (int)347)) break;
                    v4 /* !! */  = (long)et.bqjp("brby", bqjm(int ), (int)348);
                }
                if (et.mc.field_1724 == null) {
                    if (var4_4 || var4_4) continue block57;
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_5 = et.dv - et.bqjp("brbz", bqmc(int ), (int)55)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == et.bqjp("brcc", bqjm(int ), (int)349)) break;
                        v5 /* !! */  = (long)et.bqjp("brce", bqjm(int ), (int)350);
                    }
                    return nu.notFound();
                }
                if (var4_4 || var4_4) continue block57;
                var2_5 = et.bqjp("brch", bqjm(int ), (int)351);
                if (var4_4) continue block57;
                do {
                    if (var4_4 || var4_4) continue block57;
                    if (var2_5 >= et.bqjp("brcj", bqjm(int ), (int)352)) ** GOTO lbl138
                    if (var4_4 || var4_4) continue block57;
                    v6 /* !! */  = et.dv;
                    if (true) ** GOTO lbl55
                    block62: while (true) {
                        v6 /* !! */  = (long)(v7 - et.bqjp("brcl", bqmc(int ), (int)56));
lbl55:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -730104068: {
                                v7 = et.bqjp("brcm", bqmc(int ), (int)57);
                                continue block62;
                            }
                            case 570539957: {
                                v7 = et.bqjp("brcn", bqmc(int ), (int)58);
                                continue block62;
                            }
                            case 2033801891: {
                                break block62;
                            }
                        }
                        break;
                    }
                    v8 /* !! */  = et.dv;
                    if (true) ** GOTO lbl68
                    block63: while (true) {
                        v8 /* !! */  = (long)(et.bqjp("brcs", bqmc(int ), (int)60) - et.bqjp("brcr", bqmc(int ), (int)59));
lbl68:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1173622203: {
                                continue block63;
                            }
                            case 2033801891: {
                                break block63;
                            }
                        }
                        break;
                    }
                    v9 = et.mc.field_1724;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_6 = et.dv - et.bqjp("brcv", bqmc(int ), (int)61)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == et.bqjp("brcx", bqjm(int ), (int)353)) break;
                        v10 /* !! */  = (long)et.bqjp("brcy", bqjm(int ), (int)354);
                    }
                    v11 = v9.method_31548();
                    v12 /* !! */  = et.dv;
                    if (true) ** GOTO lbl84
                    block65: while (true) {
                        v12 /* !! */  = (long)(v13 - et.bqjp("brcz", bqmc(int ), (int)62));
lbl84:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -479776457: {
                                v13 = et.bqjp("brda", bqmc(int ), (int)63);
                                continue block65;
                            }
                            case 680548498: {
                                v13 = et.bqjp("brdf", bqmc(int ), (int)64);
                                continue block65;
                            }
                            case 2033801891: {
                                break block65;
                            }
                        }
                        break;
                    }
                    var3_6 = v11.method_5438((int)var2_5);
                    if (var4_4 || var4_4) continue block57;
                    v14 /* !! */  = et.dv;
                    if (true) ** GOTO lbl99
                    block66: while (true) {
                        v14 /* !! */  = (long)(v15 - et.bqjp("brdh", bqmc(int ), (int)65));
lbl99:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1533061505: {
                                v15 = et.bqjp("brdj", bqmc(int ), (int)66);
                                continue block66;
                            }
                            case -1188857926: {
                                v15 = et.bqjp("brdk", bqmc(int ), (int)67);
                                continue block66;
                            }
                            case 2033801891: {
                                break block66;
                            }
                        }
                        break;
                    }
                    if (var3_6.method_7960()) ** GOTO lbl133
                    if (var4_4) continue block57;
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_7 = et.dv - et.bqjp("brdl", bqmc(int ), (int)68)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == et.bqjp("brdo", bqjm(int ), (int)355)) break;
                        v16 /* !! */  = (long)et.bqjp("brdt", bqjm(int ), (int)356);
                    }
                    if (var3_6.method_7909() != var1_1) ** GOTO lbl133
                    if (var4_4 || var4_4) continue block57;
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_8 = et.dv - et.bqjp("brdv", bqmc(int ), (int)69)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == et.bqjp("brdw", bqjm(int ), (int)357)) break;
                        v17 /* !! */  = (long)et.bqjp("brdx", bqjm(int ), (int)358);
                    }
                    v18 = et.bqjp("brdy", bqjm(int ), (int)359);
                    v19 /* !! */  = et.dv;
                    if (true) ** GOTO lbl127
                    block69: while (true) {
                        v19 /* !! */  = (long)(et.bqjp("bred", bqmc(int ), (int)71) - et.bqjp("brea", bqmc(int ), (int)70));
lbl127:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case 249756104: {
                                continue block69;
                            }
                            case 2033801891: {
                                break block69;
                            }
                        }
                        break;
                    }
                    return new nu((int)var2_5, (boolean)v18, var3_6);
lbl133:
                    // 2 sources

                    if (var4_4 || var4_4) continue block57;
                    ++var2_5;
                    if (var4_4) continue block57;
                } while (!var6_2);
                throw null;
lbl138:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                continue block57;
                v20 /* !! */  = et.dv;
                if (true) ** GOTO lbl144
                block70: while (true) {
                    v20 /* !! */  = (long)(et.bqjp("brej", bqmc(int ), (int)73) - et.bqjp("breh", bqmc(int ), (int)72));
lbl144:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 1339466949: {
                            continue block70;
                        }
                        case 2033801891: {
                            break block70;
                        }
                    }
                    break;
                }
                return nu.notFound();
                case 0: {
                    var5_3 /* !! */  = (int)et.bqjp("brel", bqjm(int ), (int)360);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl155:
                // 2 sources

                case 1: {
                    var5_3 /* !! */  = (int)et.bqjp("breo", bqjm(int ), (int)361);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
lbl160:
                // 2 sources

                case 2: {
                    var5_3 /* !! */  = (int)et.bqjp("brer", bqjm(int ), (int)362);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
lbl165:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)et.bqjp("bres", bqjm(int ), (int)363);
                    if (!var6_2) ** GOTO lbl160
                    throw null;
                }
lbl169:
                // 2 sources

                case 4: {
                    var5_3 /* !! */  = (int)et.bqjp("breu", bqjm(int ), (int)364);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl213
                }
lbl174:
                // 3 sources

                case 5: {
                    var5_3 /* !! */  = (int)et.bqjp("brez", bqjm(int ), (int)365);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl179:
                // 2 sources

                case 6: {
                    var5_3 /* !! */  = (int)et.bqjp("brfb", bqjm(int ), (int)366);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl184:
                // 3 sources

                case 7: {
                    var5_3 /* !! */  = (int)et.bqjp("brfc", bqjm(int ), (int)367);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
lbl189:
                // 3 sources

                case 8: {
                    var5_3 /* !! */  = (int)et.bqjp("brfd", bqjm(int ), (int)368);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 9: {
                    var5_3 /* !! */  = (int)et.bqjp("brff", bqjm(int ), (int)369);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 10: {
                    var5_3 /* !! */  = (int)et.bqjp("brfh", bqjm(int ), (int)370);
                    if (!var6_2) ** GOTO lbl189
                    throw null;
                }
                case 11: {
                    do {
                        var5_3 /* !! */  = (int)et.bqjp("brfk", bqjm(int ), (int)371);
                    } while (!var6_2);
                    throw null;
                }
lbl208:
                // 2 sources

                case 12: {
                    var5_3 /* !! */  = (int)et.bqjp("brfm", bqjm(int ), (int)372);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl213:
                // 2 sources

                case 13: {
                    var5_3 /* !! */  = (int)et.bqjp("brfo", bqjm(int ), (int)373);
                    if (!var6_2) ** GOTO lbl174
                    throw null;
                }
                case 14: {
                    var5_3 /* !! */  = (int)et.bqjp("brfq", bqjm(int ), (int)374);
                    if (!var6_2) ** GOTO lbl184
                    throw null;
                }
lbl221:
                // 2 sources

                case 15: {
                    var5_3 /* !! */  = (int)et.bqjp("brft", bqjm(int ), (int)375);
                    if (!var6_2) ** GOTO lbl184
                    throw null;
                }
                case 16: {
                    var5_3 /* !! */  = (int)et.bqjp("brfw", bqjm(int ), (int)376);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl230:
                // 2 sources

                case 17: {
                    do {
                        var5_3 /* !! */  = (int)et.bqjp("brfx", bqjm(int ), (int)377);
                    } while (!var6_2);
                    throw null;
                }
lbl235:
                // 2 sources

                case 18: {
                    var5_3 /* !! */  = (int)et.bqjp("brfy", bqjm(int ), (int)378);
                    if (!var6_2) ** GOTO lbl169
                    throw null;
                }
                case 19: {
                    var5_3 /* !! */  = (int)et.bqjp("brgf", bqjm(int ), (int)379);
                    if (!var6_2) ** GOTO lbl221
                    throw null;
                }
                case 20: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)et.bqjp("brgg", bqjm(int ), (int)380);
                        if (!var6_2) ** GOTO lbl155
                        throw null;
                    }
                }
lbl248:
                // 4 sources

                case 21: {
                    var5_3 /* !! */  = (int)et.bqjp("brgh", bqjm(int ), (int)381);
                    if (!var6_2) ** GOTO lbl174
                    throw null;
                }
                case 22: {
                    var5_3 /* !! */  = (int)et.bqjp("brgk", bqjm(int ), (int)382);
                    if (!var6_2) ** GOTO lbl165
                    throw null;
                }
lbl256:
                // 4 sources

                case 23: {
                    var5_3 /* !! */  = (int)et.bqjp("brgn", bqjm(int ), (int)383);
                    if (!var6_2) ** GOTO lbl179
                    throw null;
                }
                case 24: 
            }
        }
        var5_3 /* !! */  = (int)et.bqjp("brgy", bqjm(int ), (int)384);
        ** while (!var6_2)
lbl263:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = et.dv;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - et.bqjp("brln", bqmc(int ), (int)101));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1028921380: {
                    v1 = et.bqjp("brlo", bqmc(int ), (int)102);
                    continue block19;
                }
                case 1433603255: {
                    v1 = et.bqjp("brlp", bqmc(int ), (int)103);
                    continue block19;
                }
                case 2033801891: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = et.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("brlq", bqmc(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == et.bqjp("brlr", bqjm(int ), (int)430)) break;
            v2 /* !! */  = (long)et.bqjp("brls", bqjm(int ), (int)431);
        }
        var2_2 /* !! */  = et.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("brlt", bqmc(int ), (int)105)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == et.bqjp("brlu", bqjm(int ), (int)432)) break;
            v3 /* !! */  = (long)et.bqjp("brlv", bqjm(int ), (int)433);
        }
        var1_3 = et.a;
        if (var3_1) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("brlw", bqmc(int ), (int)106)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == et.bqjp("brlx", bqjm(int ), (int)434)) break;
            v4 /* !! */  = (long)et.bqjp("brly", bqjm(int ), (int)435);
        }
        v5 /* !! */  = et.dv;
        if (true) ** GOTO lbl41
        block24: while (true) {
            v5 /* !! */  = (long)(et.bqjp("brma", bqmc(int ), (int)108) - et.bqjp("brlz", bqmc(int ), (int)107));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -310674651: {
                    continue block24;
                }
                case 2033801891: {
                    break block24;
                }
            }
            break;
        }
        this.script.cleanup();
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("brmb", bqmc(int ), (int)109)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == et.bqjp("brmc", bqjm(int ), (int)436)) break;
            v6 /* !! */  = (long)et.bqjp("brmd", bqjm(int ), (int)437);
        }
        this.finishOneTickAction();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)et.bqjp("brme", bqjm(int ), (int)438);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
lbl65:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)et.bqjp("brmf", bqjm(int ), (int)439);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl70:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)et.bqjp("brmg", bqjm(int ), (int)440);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)et.bqjp("brmh", bqjm(int ), (int)441);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)et.bqjp("brmi", bqjm(int ), (int)442);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
lbl82:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)et.bqjp("brmj", bqjm(int ), (int)443);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)et.bqjp("brmk", bqjm(int ), (int)444);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)et.bqjp("brml", bqjm(int ), (int)445);
        ** while (!var3_1)
lbl93:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public et() {
        var2_1 /* !! */  = et.b;
        super("ClickAction", "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u043f\u043e \u043e\u0442\u0434\u0435\u043b\u044c\u043d\u044b\u043c \u043a\u043d\u043e\u043f\u043a\u0430\u043c", du.MISC);
        this.pearlBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u043f\u0451\u0440\u043b\u0430", "\u0411\u044b\u0441\u0442\u0440\u043e\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435 \u044d\u043d\u0434\u0435\u0440-\u0436\u0435\u043c\u0447\u0443\u0433\u0430");
        this.friendBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0434\u0440\u0443\u0433\u0430", "\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c/\u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439");
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 = \u043f\u0430\u043a\u0435\u0442\u043d\u044b\u0439, New = \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u0442\u0438\u043a, \u041b\u0435\u0433\u0438\u0442 = \u0432\u0438\u0434\u0438\u043c\u044b\u0439 \u0441\u0432\u0430\u043f", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "New", "\u041b\u0435\u0433\u0438\u0442"});
        this.script = new od();
        this.actionMovement = new nx();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.previousSlot = (int)et.bqjp("bqjq", bqjm(int ), (int)0);
                this.pearlSlot = (int)et.bqjp("bqjr", bqjm(int ), (int)1);
                this.isFromHotbar = et.bqjp("bqjs", bqjm(int ), (int)2);
                this.actionPhase = et$ActionPhase.IDLE;
                this.settings(new jx[]{this.pearlBind, this.friendBind, this.mode});
                return;
            }
lbl17:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)et.bqjp("bqjt", bqjm(int ), (int)3);
            }
lbl19:
            // 3 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)et.bqjp("bqju", bqjm(int ), (int)4);
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)et.bqjp("bqjv", bqjm(int ), (int)5);
                ** GOTO lbl51
            }
lbl26:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)et.bqjp("bqjw", bqjm(int ), (int)6);
                    ** GOTO lbl42
                    break;
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)et.bqjp("bqjx", bqjm(int ), (int)7);
                ** GOTO lbl42
            }
            case 5: {
                var2_1 /* !! */  = (int)et.bqjp("bqjy", bqjm(int ), (int)8);
                ** GOTO lbl45
            }
            case 6: {
                var2_1 /* !! */  = (int)et.bqjp("bqjz", bqjm(int ), (int)9);
                ** GOTO lbl51
            }
            case 7: {
                var2_1 /* !! */  = (int)et.bqjp("bqka", bqjm(int ), (int)10);
                ** GOTO lbl19
            }
lbl42:
            // 5 sources

            case 8: {
                var2_1 /* !! */  = (int)et.bqjp("bqkb", bqjm(int ), (int)11);
                ** GOTO lbl17
            }
lbl45:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)et.bqjp("bqkc", bqjm(int ), (int)12);
                ** GOTO lbl42
            }
            case 10: {
                var2_1 /* !! */  = (int)et.bqjp("bqkd", bqjm(int ), (int)13);
                ** GOTO lbl26
            }
lbl51:
            // 3 sources

            case 11: {
                var2_1 /* !! */  = (int)et.bqjp("bqke", bqjm(int ), (int)14);
                ** GOTO lbl42
            }
            case 12: 
        }
        var2_1 /* !! */  = (int)et.bqjp("bqkf", bqjm(int ), (int)15);
        ** while (true)
    }

    private static /* synthetic */ void brro() {
        et.bqjo[100] = -586445361;
        et.bqjo[101] = 772330288;
        et.bqjo[102] = -511306;
        et.bqjo[103] = 357319883;
        et.bqjo[104] = 120645013;
        et.bqjo[105] = 1632725965;
        et.bqjo[106] = 358697677;
        et.bqjo[107] = 479449744;
        et.bqjo[108] = 767821598;
        et.bqjo[109] = 104751889;
        et.bqjo[110] = 856430720;
        et.bqjo[111] = 1638279110;
        et.bqjo[112] = -1659973103;
        et.bqjo[113] = -1174945613;
        et.bqjo[114] = -1003527175;
        et.bqjo[115] = 1151018882;
        et.bqjo[116] = -1174108563;
        et.bqjo[117] = -1588326745;
        et.bqjo[118] = -1265248446;
        et.bqjo[119] = -1280550184;
        et.bqjo[120] = -836056151;
        et.bqjo[121] = 1688910698;
        et.bqjo[122] = 720983050;
        et.bqjo[123] = -1680437943;
        et.bqjo[124] = 32081436;
        et.bqjo[125] = -306590305;
        et.bqjo[126] = -1483251288;
        et.bqjo[127] = 747912313;
        et.bqjo[128] = -986177889;
        et.bqjo[129] = -352666405;
        et.bqjo[130] = -443549856;
        et.bqjo[131] = 1705168676;
        et.bqjo[132] = -1662705552;
        et.bqjo[133] = -718568516;
        et.bqjo[134] = 1592796901;
        et.bqjo[135] = -1905277102;
        et.bqjo[136] = 1998541144;
        et.bqjo[137] = -1836171456;
        et.bqjo[138] = -1319212257;
        et.bqjo[139] = 1995072458;
        et.bqjo[140] = 179677200;
        et.bqjo[141] = 1488121683;
        et.bqjo[142] = -461988050;
        et.bqjo[143] = 1011442884;
        et.bqjo[144] = -1141521184;
        et.bqjo[145] = 1858350249;
        et.bqjo[146] = -2025856595;
        et.bqjo[147] = 958130145;
        et.bqjo[148] = 1449578633;
        et.bqjo[149] = 1485367246;
        et.bqjo[150] = 268888122;
        et.bqjo[151] = 1912049503;
        et.bqjo[152] = 102294885;
        et.bqjo[153] = 2061141370;
        et.bqjo[154] = -175405258;
        et.bqjo[155] = 0x56856888;
        et.bqjo[156] = 740255436;
        et.bqjo[157] = -965743575;
        et.bqjo[158] = -1307020855;
        et.bqjo[159] = -455981717;
        et.bqjo[160] = 1649339064;
        et.bqjo[161] = -1965861141;
        et.bqjo[162] = -1526172120;
        et.bqjo[163] = -371294770;
        et.bqjo[164] = -1732404821;
        et.bqjo[165] = 2053243256;
        et.bqjo[166] = 1974254106;
        et.bqjo[167] = 968117090;
        et.bqjo[168] = 638527695;
        et.bqjo[169] = -1366163065;
        et.bqjo[170] = -675562569;
        et.bqjo[171] = -1173670600;
        et.bqjo[172] = -930885025;
        et.bqjo[173] = 1118560607;
        et.bqjo[174] = 94968434;
        et.bqjo[175] = 535969395;
        et.bqjo[176] = 1934880838;
        et.bqjo[177] = -672477267;
        et.bqjo[178] = -591238054;
        et.bqjo[179] = 1650576447;
        et.bqjo[180] = -1067967227;
        et.bqjo[181] = 298809496;
        et.bqjo[182] = -1309826148;
        et.bqjo[183] = 1815181057;
        et.bqjo[184] = -2087190823;
        et.bqjo[185] = 832494610;
        et.bqjo[186] = -391526324;
        et.bqjo[187] = 1191000783;
        et.bqjo[188] = 995631388;
        et.bqjo[189] = 1573369201;
        et.bqjo[190] = 1220217444;
        et.bqjo[191] = 1095285538;
        et.bqjo[192] = 2111930347;
        et.bqjo[193] = -1703000003;
        et.bqjo[194] = 2113368076;
        et.bqjo[195] = -605647414;
        et.bqjo[196] = -1933334008;
        et.bqjo[197] = -578312629;
        et.bqjo[198] = 423207963;
        et.bqjo[199] = 815055137;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareOneTickAction(class_1792 var1_1, String var2_2, boolean var3_3) {
        block100: {
            block99: {
                block98: {
                    block97: {
                        block96: {
                            var8_4 = et.c;
                            var7_5 /* !! */  = et.b;
                            var6_6 = et.a;
                            if (var8_4) {
                                throw null;
lbl6:
                                // 24 sources

                                return;
                            }
                            if (var6_6 || var6_6) ** GOTO lbl6
                            if (this.actionPhase != et$ActionPhase.IDLE) break block96;
                            if (var6_6) ** GOTO lbl6
                            if (!this.script.isFinished()) break block96;
                            if (var6_6) ** GOTO lbl6
                            if (!nz.anySwapRunning()) break block97;
                            if (var6_6) ** GOTO lbl6
                        }
                        if (var6_6 || var6_6) ** GOTO lbl6
                        return;
                    }
                    if (var6_6 || var6_6) ** GOTO lbl6
                    var4_7 = this.findInHotbar(var1_1);
                    if (var6_6 || var6_6) ** GOTO lbl6
                    if (!var4_7.found()) break block98;
                    if (var6_6) ** GOTO lbl6
                    v0 = nu.notFound();
                    if (var8_4) {
                        throw null;
                    }
                    break block99;
                }
                if (var6_6 || var6_6) ** GOTO lbl6
                v0 = var5_8 = this.findInInventory(var1_1);
            }
            if (var6_6 || var6_6) ** GOTO lbl6
            if (var4_7.found()) break block100;
            if (var6_6) ** GOTO lbl6
            if (var5_8.found()) break block100;
            if (var6_6 || var6_6) ** GOTO lbl6
            pp.brandmessage(var2_2);
            if (var6_6 || var6_6) ** GOTO lbl6
            return;
        }
        if (var6_6 || var6_6) ** GOTO lbl6
        this.previousSlot = et.mc.field_1724.method_31548().method_67532();
        if (var6_6 || var6_6) ** GOTO lbl6
        if (var4_7.found()) {
            v1 = var4_7.slot();
            if (var8_4) {
                throw null;
            }
        } else {
            v1 = this.pearlSlot = var5_8.slot();
        }
        if (var6_6 || var6_6) ** GOTO lbl6
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.isFromHotbar = var4_7.found();
                if (var6_6 || var6_6) ** GOTO lbl6
                this.pendingItem = var1_1;
                if (var6_6 || var6_6) ** GOTO lbl6
                this.pendingNotFoundMessage = var2_2;
                if (var6_6 || var6_6) ** GOTO lbl6
                this.visibleLegitSwap = var3_3;
                if (var6_6 || var6_6) ** GOTO lbl6
                this.stopTicks = (int)et.bqjp("bqqw", bqjm(int ), (int)176);
                if (var6_6 || var6_6) ** GOTO lbl6
                this.actionMovement.saveState();
                if (var6_6 || var6_6) ** GOTO lbl6
                this.actionMovement.block();
                if (var6_6 || var6_6) ** GOTO lbl6
                this.actionPhase = et$ActionPhase.WAIT_STOP;
                if (!var6_6 && !var6_6) ** break;
                ** continue;
                return;
            }
lbl72:
            // 2 sources

            case 0: {
                var7_5 /* !! */  = (int)et.bqjp("bqqx", bqjm(int ), (int)177);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var7_5 /* !! */  = (int)et.bqjp("bqqy", bqjm(int ), (int)178);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 2: {
                var7_5 /* !! */  = (int)et.bqjp("bqqz", bqjm(int ), (int)179);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl87:
            // 3 sources

            case 3: {
                var7_5 /* !! */  = (int)et.bqjp("bqra", bqjm(int ), (int)180);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 4: {
                var7_5 /* !! */  = (int)et.bqjp("bqrb", bqjm(int ), (int)181);
                if (var8_4) {
                    throw null;
                }
            }
lbl96:
            // 4 sources

            case 5: {
                var7_5 /* !! */  = (int)et.bqjp("bqrc", bqjm(int ), (int)182);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 6: {
                var7_5 /* !! */  = (int)et.bqjp("bqrd", bqjm(int ), (int)183);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl106:
            // 2 sources

            case 7: {
                var7_5 /* !! */  = (int)et.bqjp("bqre", bqjm(int ), (int)184);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 8: {
                var7_5 /* !! */  = (int)et.bqjp("bqrf", bqjm(int ), (int)185);
                if (!var8_4) ** GOTO lbl87
                throw null;
            }
lbl115:
            // 2 sources

            case 9: {
                var7_5 /* !! */  = (int)et.bqjp("bqrg", bqjm(int ), (int)186);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl120:
            // 3 sources

            case 10: {
                var7_5 /* !! */  = (int)et.bqjp("bqrh", bqjm(int ), (int)187);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 11: {
                var7_5 /* !! */  = (int)et.bqjp("bqri", bqjm(int ), (int)188);
                if (!var8_4) ** GOTO lbl87
                throw null;
            }
            case 12: {
                var7_5 /* !! */  = (int)et.bqjp("bqrj", bqjm(int ), (int)189);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 13: {
                var7_5 /* !! */  = (int)et.bqjp("bqrk", bqjm(int ), (int)190);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 14: {
                var7_5 /* !! */  = (int)et.bqjp("bqrl", bqjm(int ), (int)191);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl144:
            // 2 sources

            case 15: {
                var7_5 /* !! */  = (int)et.bqjp("bqrm", bqjm(int ), (int)192);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 16: {
                var7_5 /* !! */  = (int)et.bqjp("bqrn", bqjm(int ), (int)193);
                if (!var8_4) ** GOTO lbl120
                throw null;
            }
lbl153:
            // 2 sources

            case 17: {
                var7_5 /* !! */  = (int)et.bqjp("bqro", bqjm(int ), (int)194);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 18: {
                var7_5 /* !! */  = (int)et.bqjp("bqrp", bqjm(int ), (int)195);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl163:
            // 4 sources

            case 19: {
                var7_5 /* !! */  = (int)et.bqjp("bqrq", bqjm(int ), (int)196);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl168:
            // 2 sources

            case 20: {
                var7_5 /* !! */  = (int)et.bqjp("bqrr", bqjm(int ), (int)197);
                if (!var8_4) ** GOTO lbl144
                throw null;
            }
lbl172:
            // 2 sources

            case 21: {
                var7_5 /* !! */  = (int)et.bqjp("bqrs", bqjm(int ), (int)198);
                if (!var8_4) ** GOTO lbl72
                throw null;
            }
            case 22: {
                var7_5 /* !! */  = (int)et.bqjp("bqrt", bqjm(int ), (int)199);
                if (var8_4) {
                    throw null;
                }
            }
lbl180:
            // 7 sources

            case 23: {
                var7_5 /* !! */  = (int)et.bqjp("bqru", bqjm(int ), (int)200);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 24: {
                var7_5 /* !! */  = (int)et.bqjp("bqrv", bqjm(int ), (int)201);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl190:
            // 3 sources

            case 25: {
                var7_5 /* !! */  = (int)et.bqjp("bqrw", bqjm(int ), (int)202);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl195:
            // 7 sources

            case 26: {
                var7_5 /* !! */  = (int)et.bqjp("bqrx", bqjm(int ), (int)203);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl200:
            // 2 sources

            case 27: {
                var7_5 /* !! */  = (int)et.bqjp("bqry", bqjm(int ), (int)204);
                if (!var8_4) ** GOTO lbl195
                throw null;
            }
            case 28: {
                var7_5 /* !! */  = (int)et.bqjp("bqrz", bqjm(int ), (int)205);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 29: {
                var7_5 /* !! */  = (int)et.bqjp("bqsa", bqjm(int ), (int)206);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 30: {
                var7_5 /* !! */  = (int)et.bqjp("bqsb", bqjm(int ), (int)207);
                if (!var8_4) ** GOTO lbl115
                throw null;
            }
lbl218:
            // 2 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)et.bqjp("bqsc", bqjm(int ), (int)208);
                    if (!var8_4) ** GOTO lbl180
                    throw null;
                }
            }
lbl223:
            // 2 sources

            case 32: {
                var7_5 /* !! */  = (int)et.bqjp("bqsd", bqjm(int ), (int)209);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl228:
            // 3 sources

            case 33: {
                var7_5 /* !! */  = (int)et.bqjp("bqse", bqjm(int ), (int)210);
                if (!var8_4) ** GOTO lbl195
                throw null;
            }
            case 34: {
                var7_5 /* !! */  = (int)et.bqjp("bqsf", bqjm(int ), (int)211);
                if (!var8_4) ** GOTO lbl106
                throw null;
            }
lbl236:
            // 2 sources

            case 35: {
                var7_5 /* !! */  = (int)et.bqjp("bqsg", bqjm(int ), (int)212);
                if (!var8_4) ** GOTO lbl153
                throw null;
            }
            case 36: {
                var7_5 /* !! */  = (int)et.bqjp("bqsh", bqjm(int ), (int)213);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl245:
            // 3 sources

            case 37: {
                var7_5 /* !! */  = (int)et.bqjp("bqsi", bqjm(int ), (int)214);
                if (!var8_4) ** GOTO lbl236
                throw null;
            }
lbl249:
            // 3 sources

            case 38: {
                var7_5 /* !! */  = (int)et.bqjp("bqsj", bqjm(int ), (int)215);
                if (!var8_4) ** GOTO lbl200
                throw null;
            }
            case 39: {
                var7_5 /* !! */  = (int)et.bqjp("bqsk", bqjm(int ), (int)216);
                if (!var8_4) ** GOTO lbl180
                throw null;
            }
            case 40: {
                var7_5 /* !! */  = (int)et.bqjp("bqsl", bqjm(int ), (int)217);
                if (!var8_4) ** GOTO lbl249
                throw null;
            }
lbl261:
            // 3 sources

            case 41: {
                var7_5 /* !! */  = (int)et.bqjp("bqsm", bqjm(int ), (int)218);
                if (!var8_4) ** GOTO lbl195
                throw null;
            }
            case 42: {
                var7_5 /* !! */  = (int)et.bqjp("bqsn", bqjm(int ), (int)219);
                if (!var8_4) ** GOTO lbl245
                throw null;
            }
lbl269:
            // 2 sources

            case 43: {
                var7_5 /* !! */  = (int)et.bqjp("bqso", bqjm(int ), (int)220);
                if (!var8_4) ** GOTO lbl120
                throw null;
            }
lbl273:
            // 3 sources

            case 44: {
                var7_5 /* !! */  = (int)et.bqjp("bqsp", bqjm(int ), (int)221);
                if (!var8_4) ** GOTO lbl249
                throw null;
            }
lbl277:
            // 3 sources

            case 45: {
                var7_5 /* !! */  = (int)et.bqjp("bqsq", bqjm(int ), (int)222);
                if (!var8_4) ** GOTO lbl163
                throw null;
            }
            case 46: 
        }
        var7_5 /* !! */  = (int)et.bqjp("bqsr", bqjm(int ), (int)223);
        ** while (!var8_4)
lbl284:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findInInventory(class_1792 var1_1) {
        block45: {
            block46: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("brhh", bqmc(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == et.bqjp("brhi", bqjm(int ), (int)385)) break;
                    v0 /* !! */  = (long)et.bqjp("brhk", bqjm(int ), (int)386);
                }
                var6_2 = et.c;
                v1 /* !! */  = et.dv;
                if (true) ** GOTO lbl11
                block29: while (true) {
                    v1 /* !! */  = (long)(v2 - et.bqjp("brhn", bqmc(int ), (int)75));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 35709633: {
                            v2 = et.bqjp("brhp", bqmc(int ), (int)76);
                            continue block29;
                        }
                        case 256178711: {
                            v2 = et.bqjp("brhr", bqmc(int ), (int)77);
                            continue block29;
                        }
                        case 2033801891: {
                            break block29;
                        }
                    }
                    break;
                }
                var5_3 = et.b;
                v3 /* !! */  = et.dv;
                if (true) ** GOTO lbl25
                block30: while (true) {
                    v3 /* !! */  = (long)(v4 - et.bqjp("brht", bqmc(int ), (int)78));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1661727364: {
                            v4 = et.bqjp("brhv", bqmc(int ), (int)79);
                            continue block30;
                        }
                        case 549239167: {
                            v4 = et.bqjp("brhx", bqmc(int ), (int)80);
                            continue block30;
                        }
                        case 1780986983: {
                            v4 = et.bqjp("bria", bqmc(int ), (int)81);
                            continue block30;
                        }
                        case 2033801891: {
                            break block30;
                        }
                    }
                    break;
                }
                var4_4 = et.a;
                if (var6_2) {
                    throw null;
lbl40:
                    // 12 sources

                    return null;
                }
                if (var4_4 || var4_4) ** GOTO lbl40
                v5 /* !! */  = et.dv;
                if (true) ** GOTO lbl47
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - et.bqjp("brib", bqmc(int ), (int)82));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -266489942: {
                            v6 = et.bqjp("brid", bqmc(int ), (int)83);
                            continue block32;
                        }
                        case 236080259: {
                            v6 = et.bqjp("brif", bqmc(int ), (int)84);
                            continue block32;
                        }
                        case 2033801891: {
                            break block32;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("brih", bqmc(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == et.bqjp("brij", bqjm(int ), (int)387)) break;
                    v7 /* !! */  = (long)et.bqjp("bril", bqjm(int ), (int)388);
                }
                if (et.mc.field_1724 != null) break block46;
                if (var4_4 || var4_4) ** GOTO lbl40
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("brin", bqmc(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == et.bqjp("brio", bqjm(int ), (int)389)) break;
                    v8 /* !! */  = (long)et.bqjp("briq", bqjm(int ), (int)390);
                }
                return nu.notFound();
            }
            if (var4_4 || var4_4) ** GOTO lbl40
            var2_5 = et.bqjp("brir", bqjm(int ), (int)391);
            if (var4_4) ** GOTO lbl40
            do {
                block47: {
                    if (var4_4 || var4_4) ** GOTO lbl40
                    if (var2_5 >= et.bqjp("bris", bqjm(int ), (int)392)) break block45;
                    if (var4_4 || var4_4) ** GOTO lbl40
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("briv", bqmc(int ), (int)87)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == et.bqjp("brix", bqjm(int ), (int)393)) break;
                        v9 /* !! */  = (long)et.bqjp("briz", bqjm(int ), (int)394);
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = et.dv - et.bqjp("brjb", bqmc(int ), (int)88)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == et.bqjp("brjd", bqjm(int ), (int)395)) break;
                        v10 /* !! */  = (long)et.bqjp("brjf", bqjm(int ), (int)396);
                    }
                    v11 = et.mc.field_1724;
                    v12 /* !! */  = et.dv;
                    if (true) ** GOTO lbl92
                    block38: while (true) {
                        v12 /* !! */  = (long)(v13 - et.bqjp("brjh", bqmc(int ), (int)89));
lbl92:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1125378734: {
                                v13 = et.bqjp("brji", bqmc(int ), (int)90);
                                continue block38;
                            }
                            case 958980029: {
                                v13 = et.bqjp("brjk", bqmc(int ), (int)91);
                                continue block38;
                            }
                            case 2033801891: {
                                break block38;
                            }
                            case 2062716215: {
                                v13 = et.bqjp("brjn", bqmc(int ), (int)92);
                                continue block38;
                            }
                        }
                        break;
                    }
                    v14 = v11.method_31548();
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_5 = et.dv - et.bqjp("brjp", bqmc(int ), (int)93)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == et.bqjp("brjr", bqjm(int ), (int)397)) break;
                        v15 /* !! */  = (long)et.bqjp("brju", bqjm(int ), (int)398);
                    }
                    var3_6 = v14.method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl40
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_6 = et.dv - et.bqjp("brjv", bqmc(int ), (int)94)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == et.bqjp("brjw", bqjm(int ), (int)399)) break;
                        v16 /* !! */  = (long)et.bqjp("brjx", bqjm(int ), (int)400);
                    }
                    if (var3_6.method_7960()) break block47;
                    if (var4_4) ** GOTO lbl40
                    v17 /* !! */  = et.dv;
                    if (true) ** GOTO lbl123
                    block41: while (true) {
                        v17 /* !! */  = (long)(v18 - et.bqjp("brjz", bqmc(int ), (int)95));
lbl123:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -914709210: {
                                v18 = et.bqjp("brka", bqmc(int ), (int)96);
                                continue block41;
                            }
                            case 1120277407: {
                                v18 = et.bqjp("brkb", bqmc(int ), (int)97);
                                continue block41;
                            }
                            case 1217113668: {
                                v18 = et.bqjp("brkc", bqmc(int ), (int)98);
                                continue block41;
                            }
                            case 2033801891: {
                                break block41;
                            }
                        }
                        break;
                    }
                    if (var3_6.method_7909() != var1_1) break block47;
                    if (var4_4 || var4_4) ** GOTO lbl40
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_7 = et.dv - et.bqjp("brkd", bqmc(int ), (int)99)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == et.bqjp("brke", bqjm(int ), (int)401)) break;
                        v19 /* !! */  = (long)et.bqjp("brkf", bqjm(int ), (int)402);
                    }
                    return nu.of((int)var2_5, var3_6);
                }
                if (var4_4 || var4_4) ** GOTO lbl40
                ++var2_5;
                if (var4_4) ** GOTO lbl40
            } while (!var6_2);
            throw null;
        }
        if (!var4_4 && !var4_4) ** break;
        ** while (true)
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_8 = et.dv - et.bqjp("brkg", bqmc(int ), (int)100)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == et.bqjp("brkh", bqjm(int ), (int)403)) break;
            v20 /* !! */  = (long)et.bqjp("brkj", bqjm(int ), (int)404);
        }
        return nu.notFound();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void cleanup() {
        boolean bl2;
        Object object = dv;
        boolean bl3 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - et.bqjp("bqyf", bqmc(int ), (int)35);
            }
            switch ((int)object) {
                case -202344002: {
                    callSite = et.bqjp("bqyi", bqmc(int ), (int)36);
                    continue block18;
                }
                case 290465729: {
                    callSite = et.bqjp("bqyk", bqmc(int ), (int)37);
                    continue block18;
                }
                case 988428116: {
                    callSite = et.bqjp("bqym", bqmc(int ), (int)38);
                    continue block18;
                }
                case 2033801891: {
                    break block18;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = dv;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - et.bqjp("bqyp", bqmc(int ), (int)39);
            }
            switch ((int)object2) {
                case -689586557: {
                    callSite = et.bqjp("bqyq", bqmc(int ), (int)40);
                    continue block19;
                }
                case 238228057: {
                    callSite = et.bqjp("bqyr", bqmc(int ), (int)41);
                    continue block19;
                }
                case 1321809899: {
                    callSite = et.bqjp("bqyv", bqmc(int ), (int)42);
                    continue block19;
                }
                case 2033801891: {
                    break block19;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = dv - et.bqjp("bqyy", bqmc(int ), (int)43)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == et.bqjp("bqza", bqjm(int ), (int)320)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = et.bqjp("bqzc", bqjm(int ), (int)321);
        }
        if (bl2 || bl2) return;
        CallSite callSite = et.bqjp("bqze", bqjm(int ), (int)322);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = dv - et.bqjp("bqzg", bqmc(int ), (int)44)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == et.bqjp("bqzh", bqjm(int ), (int)323)) {
                this.previousSlot = (int)callSite;
                if (bl2) return;
                break;
            }
            object4 = et.bqjp("bqzi", bqjm(int ), (int)324);
        }
        if (bl2) return;
        CallSite callSite2 = et.bqjp("bqzj", bqjm(int ), (int)325);
        Object object5 = dv;
        boolean bl6 = true;
        block22: while (true) {
            CallSite callSite3;
            if (!bl6 || (bl6 = false) || !true) {
                object5 = callSite3 - et.bqjp("bqzl", bqmc(int ), (int)45);
            }
            switch ((int)object5) {
                case -816610316: {
                    callSite3 = et.bqjp("bqzn", bqmc(int ), (int)46);
                    continue block22;
                }
                case -349547459: {
                    callSite3 = et.bqjp("bqzo", bqmc(int ), (int)47);
                    continue block22;
                }
                case 1229452139: {
                    callSite3 = et.bqjp("bqzr", bqmc(int ), (int)48);
                    continue block22;
                }
                case 2033801891: {
                    break block22;
                }
            }
            break;
        }
        this.pearlSlot = (int)callSite2;
        if (bl2 || bl2) return;
        CallSite callSite4 = et.bqjp("bqzv", bqjm(int ), (int)326);
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = dv - et.bqjp("bqzx", bqmc(int ), (int)49)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object6 == et.bqjp("bqzz", bqjm(int ), (int)327)) {
                this.isFromHotbar = callSite4;
                if (bl2) return;
                break;
            }
            object6 = et.bqjp("brab", bqjm(int ), (int)328);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void brri() {
        et.bqjn[100] = -586445373;
        et.bqjn[101] = 772330275;
        et.bqjn[102] = -511314;
        et.bqjn[103] = 357319892;
        et.bqjn[104] = 120645010;
        et.bqjn[105] = 1632725952;
        et.bqjn[106] = 358697692;
        et.bqjn[107] = 479449759;
        et.bqjn[108] = 767821587;
        et.bqjn[109] = 104751891;
        et.bqjn[110] = 856430742;
        et.bqjn[111] = 1638279134;
        et.bqjn[112] = -1659973099;
        et.bqjn[113] = -1174945626;
        et.bqjn[114] = -1003527207;
        et.bqjn[115] = 1151018904;
        et.bqjn[116] = -1174108567;
        et.bqjn[117] = -1588326748;
        et.bqjn[118] = -1265248433;
        et.bqjn[119] = -1280550191;
        et.bqjn[120] = -836056139;
        et.bqjn[121] = 1688910714;
        et.bqjn[122] = 720983048;
        et.bqjn[123] = -1680437938;
        et.bqjn[124] = 32081437;
        et.bqjn[125] = -306590305;
        et.bqjn[126] = -1483251288;
        et.bqjn[127] = 747912282;
        et.bqjn[128] = -986177919;
        et.bqjn[129] = -352666430;
        et.bqjn[130] = -443549856;
        et.bqjn[131] = 1705168652;
        et.bqjn[132] = -1662705581;
        et.bqjn[133] = -718568539;
        et.bqjn[134] = 1592796899;
        et.bqjn[135] = -1905277113;
        et.bqjn[136] = 1998541124;
        et.bqjn[137] = -1836171415;
        et.bqjn[138] = -1319212232;
        et.bqjn[139] = 1995072495;
        et.bqjn[140] = 179677214;
        et.bqjn[141] = 1488121672;
        et.bqjn[142] = -461988052;
        et.bqjn[143] = 1011442925;
        et.bqjn[144] = -1141521180;
        et.bqjn[145] = 1858350250;
        et.bqjn[146] = -2025856628;
        et.bqjn[147] = 958130114;
        et.bqjn[148] = 1449578627;
        et.bqjn[149] = 1485367248;
        et.bqjn[150] = 268888090;
        et.bqjn[151] = 1912049496;
        et.bqjn[152] = 102294850;
        et.bqjn[153] = 2061141369;
        et.bqjn[154] = -175405279;
        et.bqjn[155] = 1451583641;
        et.bqjn[156] = 740255466;
        et.bqjn[157] = -965743564;
        et.bqjn[158] = -1307020823;
        et.bqjn[159] = -455981726;
        et.bqjn[160] = 1649339044;
        et.bqjn[161] = -1965861128;
        et.bqjn[162] = -1526172125;
        et.bqjn[163] = -371294743;
        et.bqjn[164] = -1732404816;
        et.bqjn[165] = 2053243254;
        et.bqjn[166] = 1974254089;
        et.bqjn[167] = 968117090;
        et.bqjn[168] = 638527682;
        et.bqjn[169] = -1366163065;
        et.bqjn[170] = -675562585;
        et.bqjn[171] = -1173670625;
        et.bqjn[172] = -930885051;
        et.bqjn[173] = 1118560604;
        et.bqjn[174] = 94968446;
        et.bqjn[175] = 535969394;
        et.bqjn[176] = 1934880839;
        et.bqjn[177] = -672477255;
        et.bqjn[178] = -591238054;
        et.bqjn[179] = 1650576410;
        et.bqjn[180] = -1067967212;
        et.bqjn[181] = 298809503;
        et.bqjn[182] = -1309826161;
        et.bqjn[183] = 1815181085;
        et.bqjn[184] = -2087190789;
        et.bqjn[185] = 832494599;
        et.bqjn[186] = -391526295;
        et.bqjn[187] = 1191000809;
        et.bqjn[188] = 995631391;
        et.bqjn[189] = 1573369210;
        et.bqjn[190] = 1220217415;
        et.bqjn[191] = 1095285511;
        et.bqjn[192] = 2111930350;
        et.bqjn[193] = -1703000027;
        et.bqjn[194] = 2113368080;
        et.bqjn[195] = -605647389;
        et.bqjn[196] = -1933333987;
        et.bqjn[197] = -578312608;
        et.bqjn[198] = 423207986;
        et.bqjn[199] = 815055144;
    }

    private static /* synthetic */ void brrp() {
        et.bqjo[200] = 1979489538;
        et.bqjo[201] = 623559434;
        et.bqjo[202] = -1781290787;
        et.bqjo[203] = 354357635;
        et.bqjo[204] = -1535131758;
        et.bqjo[205] = -758192100;
        et.bqjo[206] = 473133846;
        et.bqjo[207] = 1047167485;
        et.bqjo[208] = 357015112;
        et.bqjo[209] = 1379163944;
        et.bqjo[210] = 84390215;
        et.bqjo[211] = -858436540;
        et.bqjo[212] = 448024167;
        et.bqjo[213] = -139631378;
        et.bqjo[214] = 273892143;
        et.bqjo[215] = -493790232;
        et.bqjo[216] = 1471322892;
        et.bqjo[217] = -141903461;
        et.bqjo[218] = 767698324;
        et.bqjo[219] = -1940993848;
        et.bqjo[220] = 1967546516;
        et.bqjo[221] = -128949666;
        et.bqjo[222] = -277162430;
        et.bqjo[223] = 1877935304;
        et.bqjo[224] = -1177241025;
        et.bqjo[225] = 1836871738;
        et.bqjo[226] = -355240876;
        et.bqjo[227] = 1800450241;
        et.bqjo[228] = -1338972656;
        et.bqjo[229] = 452124702;
        et.bqjo[230] = -2097012559;
        et.bqjo[231] = -909161287;
        et.bqjo[232] = 792265464;
        et.bqjo[233] = -1497438158;
        et.bqjo[234] = -984325415;
        et.bqjo[235] = -1458489517;
        et.bqjo[236] = 1878920499;
        et.bqjo[237] = 1493911155;
        et.bqjo[238] = 82941409;
        et.bqjo[239] = -260984696;
        et.bqjo[240] = 977583344;
        et.bqjo[241] = 1312318593;
        et.bqjo[242] = -236412484;
        et.bqjo[243] = 956027799;
        et.bqjo[244] = 736308023;
        et.bqjo[245] = -1240439625;
        et.bqjo[246] = -1400273733;
        et.bqjo[247] = -1178158022;
        et.bqjo[248] = -1990631161;
        et.bqjo[249] = -494506884;
        et.bqjo[250] = 1192194390;
        et.bqjo[251] = -1127068903;
        et.bqjo[252] = 188822718;
        et.bqjo[253] = 292536280;
        et.bqjo[254] = -1129806804;
        et.bqjo[255] = -24691325;
        et.bqjo[256] = -1894508099;
        et.bqjo[257] = 209355337;
        et.bqjo[258] = 1513379400;
        et.bqjo[259] = 1291095131;
        et.bqjo[260] = 680248907;
        et.bqjo[261] = 177156311;
        et.bqjo[262] = 719515557;
        et.bqjo[263] = -1626388912;
        et.bqjo[264] = -1513303111;
        et.bqjo[265] = 453454182;
        et.bqjo[266] = 896654835;
        et.bqjo[267] = -19310256;
        et.bqjo[268] = 1775811783;
        et.bqjo[269] = -822881461;
        et.bqjo[270] = 1046311835;
        et.bqjo[271] = 111607614;
        et.bqjo[272] = 1891032646;
        et.bqjo[273] = -1537786592;
        et.bqjo[274] = -1539804415;
        et.bqjo[275] = 1359069665;
        et.bqjo[276] = 630873598;
        et.bqjo[277] = -739752997;
        et.bqjo[278] = -1782797816;
        et.bqjo[279] = 1059277344;
        et.bqjo[280] = 1464146897;
        et.bqjo[281] = -2098106772;
        et.bqjo[282] = 1480986912;
        et.bqjo[283] = 973616252;
        et.bqjo[284] = 699646572;
        et.bqjo[285] = 1727380032;
        et.bqjo[286] = 1172940608;
        et.bqjo[287] = -2141900826;
        et.bqjo[288] = -1772097175;
        et.bqjo[289] = 1238222871;
        et.bqjo[290] = 137415032;
        et.bqjo[291] = -1980541499;
        et.bqjo[292] = 105555226;
        et.bqjo[293] = -500235822;
        et.bqjo[294] = 529130384;
        et.bqjo[295] = -44289066;
        et.bqjo[296] = -1216660731;
        et.bqjo[297] = -1079148224;
        et.bqjo[298] = 2031787593;
        et.bqjo[299] = 1327701448;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$prepareItemLegit$4() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = dv - et.bqjp("brni", bqmc(int ), (int)125)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == et.bqjp("brnj", bqjm(int ), (int)453)) break;
            object = et.bqjp("brnk", bqjm(int ), (int)454);
        }
        boolean bl3 = c;
        Object object = dv;
        block9: while (true) {
            switch ((int)object) {
                case -144583594: {
                    object = et.bqjp("brnm", bqmc(int ), (int)127) - et.bqjp("brnl", bqmc(int ), (int)126);
                    continue block9;
                }
                case 2033801891: {
                    break block9;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = dv - et.bqjp("brnn", bqmc(int ), (int)128)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == et.bqjp("brno", bqjm(int ), (int)455)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = et.bqjp("brnp", bqjm(int ), (int)456);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = dv - et.bqjp("brnq", bqmc(int ), (int)129)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == et.bqjp("brnr", bqjm(int ), (int)457)) break;
            object3 = et.bqjp("brns", bqjm(int ), (int)458);
        }
        Object object4 = dv;
        block12: while (true) {
            switch ((int)object4) {
                case -340064821: {
                    object4 = et.bqjp("brnu", bqmc(int ), (int)131) - et.bqjp("brnt", bqmc(int ), (int)130);
                    continue block12;
                }
                case 2033801891: {
                    break block12;
                }
            }
            break;
        }
        nv.use(class_1268.field_5808);
        if (!bl2) return;
    }

    private static /* synthetic */ void brrn() {
        et.bqjo[0] = -1654134769;
        et.bqjo[1] = 301262752;
        et.bqjo[2] = -1845305333;
        et.bqjo[3] = -1389033654;
        et.bqjo[4] = 314945846;
        et.bqjo[5] = -1209560870;
        et.bqjo[6] = 882110219;
        et.bqjo[7] = -2108963765;
        et.bqjo[8] = -575945767;
        et.bqjo[9] = 616552627;
        et.bqjo[10] = -1169092284;
        et.bqjo[11] = 775421022;
        et.bqjo[12] = 849264863;
        et.bqjo[13] = 607798661;
        et.bqjo[14] = -196949757;
        et.bqjo[15] = 1705494715;
        et.bqjo[16] = -1628919210;
        et.bqjo[17] = 1543693643;
        et.bqjo[18] = -1907751783;
        et.bqjo[19] = 1108100369;
        et.bqjo[20] = -56105542;
        et.bqjo[21] = -1059955557;
        et.bqjo[22] = 1759425597;
        et.bqjo[23] = -1734723178;
        et.bqjo[24] = 961912439;
        et.bqjo[25] = 601387218;
        et.bqjo[26] = 126310961;
        et.bqjo[27] = -2015178145;
        et.bqjo[28] = -1376695124;
        et.bqjo[29] = 218661264;
        et.bqjo[30] = -948504286;
        et.bqjo[31] = 426768369;
        et.bqjo[32] = 1721197617;
        et.bqjo[33] = 1731175783;
        et.bqjo[34] = -1867447084;
        et.bqjo[35] = 125115671;
        et.bqjo[36] = -1088065573;
        et.bqjo[37] = -1123852850;
        et.bqjo[38] = -2014758658;
        et.bqjo[39] = 1717474805;
        et.bqjo[40] = -68281090;
        et.bqjo[41] = 366155355;
        et.bqjo[42] = -632325518;
        et.bqjo[43] = 1544997981;
        et.bqjo[44] = -1801192654;
        et.bqjo[45] = -2072648911;
        et.bqjo[46] = 1557538432;
        et.bqjo[47] = 75097440;
        et.bqjo[48] = 1556739162;
        et.bqjo[49] = -2035207498;
        et.bqjo[50] = 1485010076;
        et.bqjo[51] = -924472280;
        et.bqjo[52] = 1818542306;
        et.bqjo[53] = -1377016183;
        et.bqjo[54] = 1397018174;
        et.bqjo[55] = -2124622331;
        et.bqjo[56] = 93903943;
        et.bqjo[57] = 785418163;
        et.bqjo[58] = -356171511;
        et.bqjo[59] = -1114508347;
        et.bqjo[60] = -728449573;
        et.bqjo[61] = -743273957;
        et.bqjo[62] = 1261858607;
        et.bqjo[63] = 882877511;
        et.bqjo[64] = 1896718867;
        et.bqjo[65] = 142138450;
        et.bqjo[66] = 548201263;
        et.bqjo[67] = -814393438;
        et.bqjo[68] = 1544175415;
        et.bqjo[69] = 269190980;
        et.bqjo[70] = -1964664962;
        et.bqjo[71] = 2047512867;
        et.bqjo[72] = -305457855;
        et.bqjo[73] = -679499285;
        et.bqjo[74] = -1908746115;
        et.bqjo[75] = 1508625095;
        et.bqjo[76] = 400497152;
        et.bqjo[77] = -895999569;
        et.bqjo[78] = -1982619231;
        et.bqjo[79] = 1900703313;
        et.bqjo[80] = 1412723151;
        et.bqjo[81] = 563194467;
        et.bqjo[82] = -933852684;
        et.bqjo[83] = 67766138;
        et.bqjo[84] = 757022758;
        et.bqjo[85] = 1048141115;
        et.bqjo[86] = -481838358;
        et.bqjo[87] = -1368997051;
        et.bqjo[88] = -1748544868;
        et.bqjo[89] = -1281894533;
        et.bqjo[90] = 530572416;
        et.bqjo[91] = 2136823915;
        et.bqjo[92] = -844744827;
        et.bqjo[93] = -2012039958;
        et.bqjo[94] = 96416571;
        et.bqjo[95] = 1744301349;
        et.bqjo[96] = 949805975;
        et.bqjo[97] = 455437989;
        et.bqjo[98] = 2085005421;
        et.bqjo[99] = 1171637286;
    }

    private static /* synthetic */ void brrq() {
        et.bqjo[300] = -1761889408;
        et.bqjo[301] = 1355195125;
        et.bqjo[302] = -214996228;
        et.bqjo[303] = -162121847;
        et.bqjo[304] = 1834635643;
        et.bqjo[305] = -1935938688;
        et.bqjo[306] = 769098878;
        et.bqjo[307] = 377046180;
        et.bqjo[308] = -1095852781;
        et.bqjo[309] = -1134250660;
        et.bqjo[310] = 24042694;
        et.bqjo[311] = -1649447197;
        et.bqjo[312] = -1601043824;
        et.bqjo[313] = -630545942;
        et.bqjo[314] = 745738804;
        et.bqjo[315] = 501304296;
        et.bqjo[316] = 449553064;
        et.bqjo[317] = -1151415116;
        et.bqjo[318] = -1962591104;
        et.bqjo[319] = -953811175;
        et.bqjo[320] = -435328331;
        et.bqjo[321] = 893810634;
        et.bqjo[322] = -240540845;
        et.bqjo[323] = 2039712803;
        et.bqjo[324] = 194255175;
        et.bqjo[325] = -338305577;
        et.bqjo[326] = 1957647463;
        et.bqjo[327] = -201188539;
        et.bqjo[328] = -1001374432;
        et.bqjo[329] = -1839816995;
        et.bqjo[330] = -2068150403;
        et.bqjo[331] = 1120167738;
        et.bqjo[332] = 111158713;
        et.bqjo[333] = -204453397;
        et.bqjo[334] = 361135546;
        et.bqjo[335] = 689181408;
        et.bqjo[336] = 500709368;
        et.bqjo[337] = -1594227234;
        et.bqjo[338] = 1663277311;
        et.bqjo[339] = 815127992;
        et.bqjo[340] = 675777927;
        et.bqjo[341] = -688066856;
        et.bqjo[342] = -1127516774;
        et.bqjo[343] = 2122377139;
        et.bqjo[344] = -185304010;
        et.bqjo[345] = 114965955;
        et.bqjo[346] = 2093616619;
        et.bqjo[347] = 326061758;
        et.bqjo[348] = 1210299398;
        et.bqjo[349] = 72343819;
        et.bqjo[350] = -1911095823;
        et.bqjo[351] = 251795213;
        et.bqjo[352] = -755739059;
        et.bqjo[353] = 994050474;
        et.bqjo[354] = 1406955794;
        et.bqjo[355] = 570250282;
        et.bqjo[356] = -1719376433;
        et.bqjo[357] = 1114341925;
        et.bqjo[358] = 1547194714;
        et.bqjo[359] = -499818284;
        et.bqjo[360] = -1335342444;
        et.bqjo[361] = -1144806592;
        et.bqjo[362] = 1283377463;
        et.bqjo[363] = -370233482;
        et.bqjo[364] = 854540151;
        et.bqjo[365] = -1825389595;
        et.bqjo[366] = 158238010;
        et.bqjo[367] = -1784229044;
        et.bqjo[368] = 1792869957;
        et.bqjo[369] = -768994296;
        et.bqjo[370] = -1172101882;
        et.bqjo[371] = -2082006025;
        et.bqjo[372] = 957183457;
        et.bqjo[373] = -727890764;
        et.bqjo[374] = -1997658963;
        et.bqjo[375] = 15797421;
        et.bqjo[376] = -2027777454;
        et.bqjo[377] = 207278306;
        et.bqjo[378] = 1640296092;
        et.bqjo[379] = -832678839;
        et.bqjo[380] = -1163734330;
        et.bqjo[381] = 998729007;
        et.bqjo[382] = 1776794437;
        et.bqjo[383] = 1699438102;
        et.bqjo[384] = 2057782233;
        et.bqjo[385] = -1755735060;
        et.bqjo[386] = -288159209;
        et.bqjo[387] = -1350414462;
        et.bqjo[388] = -1430929349;
        et.bqjo[389] = 969529362;
        et.bqjo[390] = 1237510274;
        et.bqjo[391] = -207140182;
        et.bqjo[392] = -1951788825;
        et.bqjo[393] = -939474850;
        et.bqjo[394] = 1553960568;
        et.bqjo[395] = 1514164572;
        et.bqjo[396] = 1338210726;
        et.bqjo[397] = -776492551;
        et.bqjo[398] = 1341402514;
        et.bqjo[399] = -2067362372;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block95: {
            block94: {
                var7_2 = et.c;
                var6_3 /* !! */  = et.b;
                var5_4 = et.a;
                if (var7_2) {
                    throw null;
lbl6:
                    // 28 sources

                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                if (et.mc.field_1724 == null) break block94;
                if (var5_4) ** GOTO lbl6
                if (et.mc.field_1755 == null) break block95;
                if (var5_4) ** GOTO lbl6
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (!var1_1.isBindReleased(this.pearlBind)) ** GOTO lbl44
        if (var5_4 || var5_4) ** GOTO lbl6
        if (!this.mode.getValue().equals("\u0411\u044b\u0441\u0442\u0440\u044b\u0439")) ** GOTO lbl31
        if (var5_4) ** GOTO lbl6
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl6
                this.executeItemInstant(class_1802.field_8634, "\u0416\u0435\u043c\u0447\u0443\u0433 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
                if (var5_4) ** GOTO lbl6
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl44
            }
lbl31:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            if (!this.mode.getValue().equals("New")) ** GOTO lbl39
            if (var5_4 || var5_4) ** GOTO lbl6
            this.prepareOneTickAction(class_1802.field_8634, "\u0416\u0435\u043c\u0447\u0443\u0433 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d", (boolean)et.bqjp("bqkg", bqjm(int ), (int)16));
            if (var5_4) ** GOTO lbl6
            if (var7_2) {
                throw null;
            }
            ** GOTO lbl44
lbl39:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            if (!this.mode.getValue().equals("\u041b\u0435\u0433\u0438\u0442")) ** GOTO lbl44
            if (var5_4 || var5_4) ** GOTO lbl6
            this.prepareOneTickAction(class_1802.field_8634, "\u0416\u0435\u043c\u0447\u0443\u0433 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d", (boolean)et.bqjp("bqkh", bqjm(int ), (int)17));
            if (var5_4) ** GOTO lbl6
lbl44:
            // 5 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            if (!var1_1.isBindDown(this.friendBind)) ** GOTO lbl69
            if (var5_4) ** GOTO lbl6
            var4_5 = et.mc.field_1765;
            if (var5_4) ** GOTO lbl6
            if (!(var4_5 instanceof class_3966)) ** GOTO lbl69
            if (var5_4) ** GOTO lbl6
            var2_6 = (class_3966)var4_5;
            if (var5_4 || var5_4) ** GOTO lbl6
            var4_5 = var2_6.method_17782();
            if (var5_4) ** GOTO lbl6
            if (!(var4_5 instanceof class_1657)) ** GOTO lbl69
            if (var5_4) ** GOTO lbl6
            var3_7 = (class_1657)var4_5;
            if (var5_4 || var5_4) ** GOTO lbl6
            if (!dl.isFriend((class_1297)var3_7)) ** GOTO lbl66
            if (var5_4 || var5_4) ** GOTO lbl6
            dl.removeFriend(var3_7);
            if (var5_4) ** GOTO lbl6
            if (var7_2) {
                throw null;
            }
            ** GOTO lbl69
lbl66:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            dl.addFriend(var3_7);
            if (var5_4) ** GOTO lbl6
lbl69:
            // 5 sources

            if (!var5_4 && !var5_4) ** break;
            ** continue;
            return;
            case 0: {
                var6_3 /* !! */  = (int)et.bqjp("bqki", bqjm(int ), (int)18);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl77:
            // 4 sources

            case 1: {
                var6_3 /* !! */  = (int)et.bqjp("bqkj", bqjm(int ), (int)19);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 2: {
                var6_3 /* !! */  = (int)et.bqjp("bqkk", bqjm(int ), (int)20);
                if (!var7_2) ** GOTO lbl77
                throw null;
            }
            case 3: {
                var6_3 /* !! */  = (int)et.bqjp("bqkl", bqjm(int ), (int)21);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl91:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)et.bqjp("bqkm", bqjm(int ), (int)22);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 5: {
                var6_3 /* !! */  = (int)et.bqjp("bqkn", bqjm(int ), (int)23);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl101:
            // 3 sources

            case 6: {
                var6_3 /* !! */  = (int)et.bqjp("bqko", bqjm(int ), (int)24);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 7: {
                var6_3 /* !! */  = (int)et.bqjp("bqkp", bqjm(int ), (int)25);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl111:
            // 3 sources

            case 8: {
                var6_3 /* !! */  = (int)et.bqjp("bqkq", bqjm(int ), (int)26);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl116:
            // 2 sources

            case 9: {
                do {
                    var6_3 /* !! */  = (int)et.bqjp("bqkr", bqjm(int ), (int)27);
                } while (!var7_2);
                throw null;
            }
lbl121:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)et.bqjp("bqks", bqjm(int ), (int)28);
                if (!var7_2) ** GOTO lbl91
                throw null;
            }
            case 11: {
                var6_3 /* !! */  = (int)et.bqjp("bqkt", bqjm(int ), (int)29);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 12: {
                var6_3 /* !! */  = (int)et.bqjp("bqku", bqjm(int ), (int)30);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 13: {
                var6_3 /* !! */  = (int)et.bqjp("bqkv", bqjm(int ), (int)31);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 14: {
                var6_3 /* !! */  = (int)et.bqjp("bqkw", bqjm(int ), (int)32);
                if (!var7_2) ** GOTO lbl116
                throw null;
            }
lbl144:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)et.bqjp("bqkx", bqjm(int ), (int)33);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl254
                    break;
                }
            }
            case 16: {
                var6_3 /* !! */  = (int)et.bqjp("bqky", bqjm(int ), (int)34);
                if (!var7_2) ** GOTO lbl111
                throw null;
            }
            case 17: {
                var6_3 /* !! */  = (int)et.bqjp("bqkz", bqjm(int ), (int)35);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl159:
            // 4 sources

            case 18: {
                var6_3 /* !! */  = (int)et.bqjp("bqla", bqjm(int ), (int)36);
                if (var7_2) {
                    throw null;
                }
            }
lbl163:
            // 4 sources

            case 19: {
                var6_3 /* !! */  = (int)et.bqjp("bqlb", bqjm(int ), (int)37);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl168:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)et.bqjp("bqlc", bqjm(int ), (int)38);
                if (!var7_2) ** GOTO lbl111
                throw null;
            }
lbl172:
            // 3 sources

            case 21: {
                var6_3 /* !! */  = (int)et.bqjp("bqld", bqjm(int ), (int)39);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl177:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)et.bqjp("bqle", bqjm(int ), (int)40);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 23: {
                var6_3 /* !! */  = (int)et.bqjp("bqlf", bqjm(int ), (int)41);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl187:
            // 3 sources

            case 24: {
                var6_3 /* !! */  = (int)et.bqjp("bqlg", bqjm(int ), (int)42);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 25: {
                var6_3 /* !! */  = (int)et.bqjp("bqlh", bqjm(int ), (int)43);
                if (var7_2) {
                    throw null;
                }
            }
            case 26: {
                var6_3 /* !! */  = (int)et.bqjp("bqli", bqjm(int ), (int)44);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 27: {
                var6_3 /* !! */  = (int)et.bqjp("bqlj", bqjm(int ), (int)45);
                if (!var7_2) ** GOTO lbl187
                throw null;
            }
lbl205:
            // 2 sources

            case 28: {
                var6_3 /* !! */  = (int)et.bqjp("bqlk", bqjm(int ), (int)46);
                if (!var7_2) ** GOTO lbl187
                throw null;
            }
            case 29: {
                var6_3 /* !! */  = (int)et.bqjp("bqll", bqjm(int ), (int)47);
                if (!var7_2) ** GOTO lbl101
                throw null;
            }
lbl213:
            // 2 sources

            case 30: {
                var6_3 /* !! */  = (int)et.bqjp("bqlm", bqjm(int ), (int)48);
                if (!var7_2) ** GOTO lbl168
                throw null;
            }
            case 31: {
                var6_3 /* !! */  = (int)et.bqjp("bqln", bqjm(int ), (int)49);
                if (!var7_2) ** GOTO lbl205
                throw null;
            }
lbl221:
            // 2 sources

            case 32: {
                var6_3 /* !! */  = (int)et.bqjp("bqlo", bqjm(int ), (int)50);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl226:
            // 2 sources

            case 33: {
                var6_3 /* !! */  = (int)et.bqjp("bqlp", bqjm(int ), (int)51);
                if (!var7_2) ** GOTO lbl77
                throw null;
            }
            case 34: {
                var6_3 /* !! */  = (int)et.bqjp("bqlq", bqjm(int ), (int)52);
                if (!var7_2) ** GOTO lbl221
                throw null;
            }
            case 35: {
                var6_3 /* !! */  = (int)et.bqjp("bqlr", bqjm(int ), (int)53);
                if (!var7_2) ** GOTO lbl159
                throw null;
            }
lbl238:
            // 2 sources

            case 36: {
                var6_3 /* !! */  = (int)et.bqjp("bqls", bqjm(int ), (int)54);
                if (!var7_2) ** GOTO lbl77
                throw null;
            }
lbl242:
            // 2 sources

            case 37: {
                var6_3 /* !! */  = (int)et.bqjp("bqlt", bqjm(int ), (int)55);
                if (var7_2) {
                    throw null;
                }
            }
lbl246:
            // 6 sources

            case 38: {
                var6_3 /* !! */  = (int)et.bqjp("bqlu", bqjm(int ), (int)56);
                if (!var7_2) ** GOTO lbl101
                throw null;
            }
lbl250:
            // 2 sources

            case 39: {
                var6_3 /* !! */  = (int)et.bqjp("bqlv", bqjm(int ), (int)57);
                if (!var7_2) ** GOTO lbl121
                throw null;
            }
lbl254:
            // 4 sources

            case 40: {
                var6_3 /* !! */  = (int)et.bqjp("bqlw", bqjm(int ), (int)58);
                if (var7_2) {
                    throw null;
                }
            }
lbl258:
            // 4 sources

            case 41: {
                do {
                    var6_3 /* !! */  = (int)et.bqjp("bqlx", bqjm(int ), (int)59);
                } while (!var7_2);
                throw null;
            }
lbl263:
            // 3 sources

            case 42: {
                var6_3 /* !! */  = (int)et.bqjp("bqly", bqjm(int ), (int)60);
                if (!var7_2) ** GOTO lbl242
                throw null;
            }
lbl267:
            // 2 sources

            case 43: {
                var6_3 /* !! */  = (int)et.bqjp("bqlz", bqjm(int ), (int)61);
                if (!var7_2) ** GOTO lbl172
                throw null;
            }
lbl271:
            // 2 sources

            case 44: {
                var6_3 /* !! */  = (int)et.bqjp("bqma", bqjm(int ), (int)62);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
            case 45: 
        }
        var6_3 /* !! */  = (int)et.bqjp("bqmb", bqjm(int ), (int)63);
        ** while (!var7_2)
lbl278:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bqmc(int n2) {
        return bqmd[n2] ^ bqme[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$prepareItemLegit$5() {
        v0 /* !! */  = et.dv;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(et.bqjp("brmn", bqmc(int ), (int)111) - et.bqjp("brmm", bqmc(int ), (int)110));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 156300901: {
                    continue block31;
                }
                case 2033801891: {
                    break block31;
                }
            }
            break;
        }
        var3_1 = et.c;
        v1 /* !! */  = et.dv;
        if (true) ** GOTO lbl15
        block32: while (true) {
            v1 /* !! */  = (long)(et.bqjp("brmp", bqmc(int ), (int)113) - et.bqjp("brmo", bqmc(int ), (int)112));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -291366327: {
                    continue block32;
                }
                case 2033801891: {
                    break block32;
                }
            }
            break;
        }
        var2_2 /* !! */  = et.b;
        v2 /* !! */  = et.dv;
        if (true) ** GOTO lbl25
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - et.bqjp("brmq", bqmc(int ), (int)114));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1545881468: {
                    v3 = et.bqjp("brmr", bqmc(int ), (int)115);
                    continue block33;
                }
                case -894822798: {
                    v3 = et.bqjp("brms", bqmc(int ), (int)116);
                    continue block33;
                }
                case 2033801891: {
                    break block33;
                }
            }
            break;
        }
        var1_3 = et.a;
        if (var3_1) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                v4 /* !! */  = et.dv;
                if (true) ** GOTO lbl48
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - et.bqjp("brmt", bqmc(int ), (int)117));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -782609721: {
                            v5 = et.bqjp("brmu", bqmc(int ), (int)118);
                            continue block35;
                        }
                        case 935316560: {
                            v5 = et.bqjp("brmv", bqmc(int ), (int)119);
                            continue block35;
                        }
                        case 2033801891: {
                            break block35;
                        }
                    }
                    break;
                }
                v6 /* !! */  = et.dv;
                if (true) ** GOTO lbl61
                block36: while (true) {
                    v6 /* !! */  = (long)(v7 - et.bqjp("brmw", bqmc(int ), (int)120));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 237361958: {
                            v7 = et.bqjp("brmx", bqmc(int ), (int)121);
                            continue block36;
                        }
                        case 681493030: {
                            v7 = et.bqjp("brmy", bqmc(int ), (int)122);
                            continue block36;
                        }
                        case 1993860786: {
                            v7 = et.bqjp("brmz", bqmc(int ), (int)123);
                            continue block36;
                        }
                        case 2033801891: {
                            break block36;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("brna", bqmc(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == et.bqjp("brnb", bqjm(int ), (int)446)) break;
                    v8 /* !! */  = (long)et.bqjp("brnc", bqjm(int ), (int)447);
                }
                nv.swapHotbar(this.pearlSlot, this.previousSlot);
                if (var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)et.bqjp("brnd", bqjm(int ), (int)448);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl86:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)et.bqjp("brne", bqjm(int ), (int)449);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)et.bqjp("brnf", bqjm(int ), (int)450);
                } while (!var3_1);
                throw null;
            }
lbl96:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)et.bqjp("brng", bqjm(int ), (int)451);
                    if (!var3_1) ** GOTO lbl86
                    throw null;
                }
            }
            case 4: 
        }
        var2_2 /* !! */  = (int)et.bqjp("brnh", bqjm(int ), (int)452);
        ** while (!var3_1)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$prepareItemLegit$2() {
        v0 /* !! */  = et.dv;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(et.bqjp("broy", bqmc(int ), (int)143) - et.bqjp("brox", bqmc(int ), (int)142));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -947773518: {
                    continue block17;
                }
                case 2033801891: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = et.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("broz", bqmc(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == et.bqjp("brpa", bqjm(int ), (int)477)) break;
            v1 /* !! */  = (long)et.bqjp("brpb", bqjm(int ), (int)478);
        }
        var2_2 /* !! */  = et.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("brpc", bqmc(int ), (int)145)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == et.bqjp("brpd", bqjm(int ), (int)479)) break;
            v2 /* !! */  = (long)et.bqjp("brpe", bqjm(int ), (int)480);
        }
        var1_3 = et.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("brpf", bqmc(int ), (int)146)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == et.bqjp("brpg", bqjm(int ), (int)481)) break;
            v3 /* !! */  = (long)et.bqjp("brph", bqjm(int ), (int)482);
        }
        v4 /* !! */  = et.dv;
        if (true) ** GOTO lbl40
        block22: while (true) {
            v4 /* !! */  = (long)(v5 - et.bqjp("brpi", bqmc(int ), (int)147));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1868239109: {
                    v5 = et.bqjp("brpj", bqmc(int ), (int)148);
                    continue block22;
                }
                case -202462526: {
                    v5 = et.bqjp("brpk", bqmc(int ), (int)149);
                    continue block22;
                }
                case 1529112248: {
                    v5 = et.bqjp("brpl", bqmc(int ), (int)150);
                    continue block22;
                }
                case 2033801891: {
                    break block22;
                }
            }
            break;
        }
        nv.selectSlot(this.previousSlot);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl59:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)et.bqjp("brpm", bqjm(int ), (int)483);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl69
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)et.bqjp("brpn", bqjm(int ), (int)484);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
lbl69:
            // 3 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)et.bqjp("brpo", bqjm(int ), (int)485);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)et.bqjp("brpp", bqjm(int ), (int)486);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 4: 
        }
        var2_2 /* !! */  = (int)et.bqjp("brpq", bqjm(int ), (int)487);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    static {
        bqjn = new int[514];
        bqjo = new int[514];
        et.brrh();
        et.brri();
        et.brrj();
        et.brrk();
        et.brrl();
        et.brrm();
        et.brrn();
        et.brro();
        et.brrp();
        et.brrq();
        et.brrr();
        et.brrs();
        bqmd = new long[167];
        bqme = new long[167];
        et.brrt();
        et.brru();
        et.brrv();
        et.brrw();
    }

    private static /* synthetic */ void brrs() {
        et.bqjo[500] = -981788359;
        et.bqjo[501] = -1582274615;
        et.bqjo[502] = 2047548209;
        et.bqjo[503] = 1868655266;
        et.bqjo[504] = 668792709;
        et.bqjo[505] = 409727946;
        et.bqjo[506] = 851726487;
        et.bqjo[507] = 1598189860;
        et.bqjo[508] = 1606854806;
        et.bqjo[509] = -1351189144;
        et.bqjo[510] = -1336361690;
        et.bqjo[511] = 1660349510;
        et.bqjo[512] = 670990133;
        et.bqjo[513] = 1648807411;
    }

    private static /* synthetic */ void brrl() {
        et.bqjn[400] = -940030454;
        et.bqjn[401] = -1729255795;
        et.bqjn[402] = -1053864583;
        et.bqjn[403] = -1694326578;
        et.bqjn[404] = 696764965;
        et.bqjn[405] = -286630672;
        et.bqjn[406] = 2034982424;
        et.bqjn[407] = -533305950;
        et.bqjn[408] = 1447840194;
        et.bqjn[409] = -1474594596;
        et.bqjn[410] = -2094357941;
        et.bqjn[411] = -606216145;
        et.bqjn[412] = -421844332;
        et.bqjn[413] = -1398272186;
        et.bqjn[414] = -1909702288;
        et.bqjn[415] = 1474033196;
        et.bqjn[416] = -1501952216;
        et.bqjn[417] = 469182735;
        et.bqjn[418] = 1097760386;
        et.bqjn[419] = 1356579624;
        et.bqjn[420] = 868943347;
        et.bqjn[421] = -2052855887;
        et.bqjn[422] = -991351946;
        et.bqjn[423] = -481068082;
        et.bqjn[424] = -967502374;
        et.bqjn[425] = 1288569817;
        et.bqjn[426] = 538321034;
        et.bqjn[427] = -872629340;
        et.bqjn[428] = 2144332231;
        et.bqjn[429] = 2012407216;
        et.bqjn[430] = 1506332586;
        et.bqjn[431] = -1606781658;
        et.bqjn[432] = 554422538;
        et.bqjn[433] = -363173541;
        et.bqjn[434] = -2119721588;
        et.bqjn[435] = -1061909474;
        et.bqjn[436] = -244423971;
        et.bqjn[437] = 1386862776;
        et.bqjn[438] = -995990102;
        et.bqjn[439] = -365090703;
        et.bqjn[440] = -2053474685;
        et.bqjn[441] = -1407014903;
        et.bqjn[442] = 1451582934;
        et.bqjn[443] = -1455927840;
        et.bqjn[444] = 18563016;
        et.bqjn[445] = -557966793;
        et.bqjn[446] = 728368526;
        et.bqjn[447] = 406043308;
        et.bqjn[448] = 525103395;
        et.bqjn[449] = 1531798083;
        et.bqjn[450] = -275357710;
        et.bqjn[451] = -493686871;
        et.bqjn[452] = -1595006471;
        et.bqjn[453] = -357865320;
        et.bqjn[454] = 2016402178;
        et.bqjn[455] = 715585679;
        et.bqjn[456] = -1196836427;
        et.bqjn[457] = 1702298490;
        et.bqjn[458] = 944910905;
        et.bqjn[459] = 247850020;
        et.bqjn[460] = 1255275184;
        et.bqjn[461] = 2032802061;
        et.bqjn[462] = -2132034628;
        et.bqjn[463] = 378542940;
        et.bqjn[464] = 67313792;
        et.bqjn[465] = 1650233569;
        et.bqjn[466] = 525110661;
        et.bqjn[467] = -77976994;
        et.bqjn[468] = -1846679764;
        et.bqjn[469] = 1130827632;
        et.bqjn[470] = 1254130392;
        et.bqjn[471] = -692996485;
        et.bqjn[472] = -1741978754;
        et.bqjn[473] = 1744669936;
        et.bqjn[474] = 56711852;
        et.bqjn[475] = -1875457946;
        et.bqjn[476] = -179771699;
        et.bqjn[477] = -361875662;
        et.bqjn[478] = -96014145;
        et.bqjn[479] = -1599134806;
        et.bqjn[480] = 1399954604;
        et.bqjn[481] = -82068982;
        et.bqjn[482] = -2046033793;
        et.bqjn[483] = 1609935949;
        et.bqjn[484] = 1439758640;
        et.bqjn[485] = 1392617591;
        et.bqjn[486] = 1788034667;
        et.bqjn[487] = -2056342537;
        et.bqjn[488] = -2119269838;
        et.bqjn[489] = 597185260;
        et.bqjn[490] = 966155534;
        et.bqjn[491] = -847654268;
        et.bqjn[492] = 1353362365;
        et.bqjn[493] = -592045030;
        et.bqjn[494] = 1386503001;
        et.bqjn[495] = 2041104779;
        et.bqjn[496] = 438994632;
        et.bqjn[497] = -966125679;
        et.bqjn[498] = 1699311699;
        et.bqjn[499] = -1241099167;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishOneTickAction() {
        block87: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("bqux", bqmc(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == et.bqjp("bquy", bqjm(int ), (int)281)) break;
                v0 /* !! */  = (long)et.bqjp("bquz", bqjm(int ), (int)282);
            }
            var3_1 = et.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("bqva", bqmc(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == et.bqjp("bqvb", bqjm(int ), (int)283)) break;
                v1 /* !! */  = (long)et.bqjp("bqvc", bqjm(int ), (int)284);
            }
            var2_2 /* !! */  = et.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("bqvd", bqmc(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == et.bqjp("bqve", bqjm(int ), (int)285)) break;
                v2 /* !! */  = (long)et.bqjp("bqvf", bqjm(int ), (int)286);
            }
            var1_3 = et.a;
            if (var3_1) {
                throw null;
lbl21:
                // 10 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl21
            v3 /* !! */  = et.dv;
            if (true) ** GOTO lbl28
            block57: while (true) {
                v3 /* !! */  = (long)(v4 - et.bqjp("bqvg", bqmc(int ), (int)12));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 225604408: {
                        v4 = et.bqjp("bqvh", bqmc(int ), (int)13);
                        continue block57;
                    }
                    case 1421381444: {
                        v4 = et.bqjp("bqvi", bqmc(int ), (int)14);
                        continue block57;
                    }
                    case 1593342975: {
                        v4 = et.bqjp("bqvj", bqmc(int ), (int)15);
                        continue block57;
                    }
                    case 2033801891: {
                        break block57;
                    }
                }
                break;
            }
            v5 /* !! */  = et.dv;
            if (true) ** GOTO lbl44
            block58: while (true) {
                v5 /* !! */  = (long)(v6 - et.bqjp("bqvk", bqmc(int ), (int)16));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -194896288: {
                        v6 = et.bqjp("bqvl", bqmc(int ), (int)17);
                        continue block58;
                    }
                    case 1670807520: {
                        v6 = et.bqjp("bqvm", bqmc(int ), (int)18);
                        continue block58;
                    }
                    case 2033801891: {
                        break block58;
                    }
                }
                break;
            }
            if (!this.actionMovement.isBlocked()) break block87;
            if (var1_3 || var1_3) ** GOTO lbl21
            v7 /* !! */  = et.dv;
            if (true) ** GOTO lbl59
            block59: while (true) {
                v7 /* !! */  = (long)(et.bqjp("bqvo", bqmc(int ), (int)20) - et.bqjp("bqvn", bqmc(int ), (int)19));
lbl59:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2068091093: {
                        continue block59;
                    }
                    case 2033801891: {
                        break block59;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("bqvp", bqmc(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == et.bqjp("bqvq", bqjm(int ), (int)287)) break;
                v8 /* !! */  = (long)et.bqjp("bqvr", bqjm(int ), (int)288);
            }
            this.actionMovement.restoreFromCurrent();
            if (var1_3) ** GOTO lbl21
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 /* !! */  = et.dv;
                if (true) ** GOTO lbl80
                block61: while (true) {
                    v9 /* !! */  = (long)(v10 - et.bqjp("bqvs", bqmc(int ), (int)22));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -959800999: {
                            v10 = et.bqjp("bqvt", bqmc(int ), (int)23);
                            continue block61;
                        }
                        case 299383706: {
                            v10 = et.bqjp("bqvu", bqmc(int ), (int)24);
                            continue block61;
                        }
                        case 2033801891: {
                            break block61;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = et.dv - et.bqjp("bqvv", bqmc(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == et.bqjp("bqvw", bqjm(int ), (int)289)) break;
                    v11 /* !! */  = (long)et.bqjp("bqvx", bqjm(int ), (int)290);
                }
                this.actionPhase = et$ActionPhase.IDLE;
                if (var1_3 || var1_3) ** GOTO lbl21
                v12 /* !! */  = et.dv;
                if (true) ** GOTO lbl100
                block63: while (true) {
                    v12 /* !! */  = (long)(v13 - et.bqjp("bqvy", bqmc(int ), (int)26));
lbl100:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1650664722: {
                            v13 = et.bqjp("bqvz", bqmc(int ), (int)27);
                            continue block63;
                        }
                        case -845891207: {
                            v13 = et.bqjp("bqwa", bqmc(int ), (int)28);
                            continue block63;
                        }
                        case -227590761: {
                            v13 = et.bqjp("bqwb", bqmc(int ), (int)29);
                            continue block63;
                        }
                        case 2033801891: {
                            break block63;
                        }
                    }
                    break;
                }
                this.pendingItem = null;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = et.dv - et.bqjp("bqwc", bqmc(int ), (int)30)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == et.bqjp("bqwd", bqjm(int ), (int)291)) break;
                    v14 /* !! */  = (long)et.bqjp("bqwe", bqjm(int ), (int)292);
                }
                this.pendingNotFoundMessage = null;
                if (var1_3 || var1_3) ** GOTO lbl21
                v15 = et.bqjp("bqwf", bqjm(int ), (int)293);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = et.dv - et.bqjp("bqwg", bqmc(int ), (int)31)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == et.bqjp("bqwh", bqjm(int ), (int)294)) break;
                    v16 /* !! */  = (long)et.bqjp("bqwi", bqjm(int ), (int)295);
                }
                this.visibleLegitSwap = v15;
                if (var1_3 || var1_3) ** GOTO lbl21
                v17 = et.bqjp("bqwj", bqjm(int ), (int)296);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = et.dv - et.bqjp("bqwk", bqmc(int ), (int)32)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == et.bqjp("bqwl", bqjm(int ), (int)297)) break;
                    v18 /* !! */  = (long)et.bqjp("bqwm", bqjm(int ), (int)298);
                }
                this.stopTicks = (int)v17;
                if (var1_3 || var1_3) ** GOTO lbl21
                v19 /* !! */  = et.dv;
                if (true) ** GOTO lbl141
                block67: while (true) {
                    v19 /* !! */  = (long)(et.bqjp("bqwo", bqmc(int ), (int)34) - et.bqjp("bqwn", bqmc(int ), (int)33));
lbl141:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1316674121: {
                            continue block67;
                        }
                        case 2033801891: {
                            break block67;
                        }
                    }
                    break;
                }
                this.cleanup();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)et.bqjp("bqwp", bqjm(int ), (int)299);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 1: {
                var2_2 /* !! */  = (int)et.bqjp("bqwq", bqjm(int ), (int)300);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl160:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)et.bqjp("bqwr", bqjm(int ), (int)301);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 3: {
                var2_2 /* !! */  = (int)et.bqjp("bqws", bqjm(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 4: {
                var2_2 /* !! */  = (int)et.bqjp("bqwu", bqjm(int ), (int)303);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl175:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)et.bqjp("bqww", bqjm(int ), (int)304);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 6: {
                var2_2 /* !! */  = (int)et.bqjp("bqwx", bqjm(int ), (int)305);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl185:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)et.bqjp("bqwy", bqjm(int ), (int)306);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)et.bqjp("bqwz", bqjm(int ), (int)307);
                if (!var3_1) ** GOTO lbl185
                throw null;
            }
lbl193:
            // 5 sources

            case 9: {
                var2_2 /* !! */  = (int)et.bqjp("bqxb", bqjm(int ), (int)308);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl197:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)et.bqjp("bqxg", bqjm(int ), (int)309);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl202:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)et.bqjp("bqxi", bqjm(int ), (int)310);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 12: {
                var2_2 /* !! */  = (int)et.bqjp("bqxj", bqjm(int ), (int)311);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl211:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)et.bqjp("bqxl", bqjm(int ), (int)312);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl215:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)et.bqjp("bqxo", bqjm(int ), (int)313);
                    if (!var3_1) ** GOTO lbl175
                    throw null;
                }
            }
lbl220:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)et.bqjp("bqxp", bqjm(int ), (int)314);
                if (var3_1) {
                    throw null;
                }
            }
lbl224:
            // 4 sources

            case 16: {
                do {
                    var2_2 /* !! */  = (int)et.bqjp("bqxr", bqjm(int ), (int)315);
                } while (!var3_1);
                throw null;
            }
lbl229:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)et.bqjp("bqxv", bqjm(int ), (int)316);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
lbl233:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)et.bqjp("bqxy", bqjm(int ), (int)317);
                if (!var3_1) ** GOTO lbl197
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)et.bqjp("bqxz", bqjm(int ), (int)318);
                if (!var3_1) ** GOTO lbl193
                throw null;
            }
            case 20: 
        }
        var2_2 /* !! */  = (int)et.bqjp("bqya", bqjm(int ), (int)319);
        ** while (!var3_1)
lbl244:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateOneTickAction() {
        block109: {
            block113: {
                block112: {
                    block111: {
                        block110: {
                            block108: {
                                var3_1 = et.c;
                                var2_2 /* !! */  = et.b;
                                var1_3 = et.a;
                                if (var3_1) {
                                    throw null;
lbl6:
                                    // 28 sources

                                    return;
                                }
                                if (var1_3 || var1_3) ** GOTO lbl6
                                if (this.actionPhase != et$ActionPhase.IDLE) break block108;
                                if (var1_3 || var1_3) ** GOTO lbl6
                                return;
                            }
                            if (var1_3 || var1_3) ** GOTO lbl6
                            this.actionMovement.block();
                            if (var1_3 || var1_3) ** GOTO lbl6
                            if (this.actionPhase != et$ActionPhase.WAIT_STOP) break block109;
                            if (var1_3 || var1_3) ** GOTO lbl6
                            v0 = this.stopTicks;
                            this.stopTicks = v0 - et.bqjp("bqss", bqjm(int ), (int)224);
                            if (v0 <= 0) break block110;
                            if (var1_3 || var1_3) ** GOTO lbl6
                            return;
                        }
                        if (var1_3 || var1_3) ** GOTO lbl6
                        if (this.visibleLegitSwap) break block111;
                        if (var1_3 || var1_3) ** GOTO lbl6
                        this.executeItemInstant(this.pendingItem, this.pendingNotFoundMessage);
                        if (var1_3 || var1_3) ** GOTO lbl6
                        this.finishOneTickAction();
                        if (var1_3 || var1_3) ** GOTO lbl6
                        return;
                    }
                    if (var1_3 || var1_3) ** GOTO lbl6
                    if (!this.isFromHotbar) break block112;
                    if (var1_3 || var1_3) ** GOTO lbl6
                    nv.selectSlot(this.pearlSlot);
                    if (var1_3 || var1_3) ** GOTO lbl6
                    nv.use(class_1268.field_5808);
                    if (var1_3) ** GOTO lbl6
                    if (var3_1) {
                        throw null;
                    }
                    break block113;
                }
                if (var1_3 || var1_3) ** GOTO lbl6
                nv.swapHotbar(this.pearlSlot, this.previousSlot);
                if (var1_3 || var1_3) ** GOTO lbl6
                nv.use(class_1268.field_5808);
                if (var1_3) ** GOTO lbl6
            }
            if (var1_3 || var1_3) ** GOTO lbl6
            this.actionPhase = et$ActionPhase.RESTORE;
            if (var1_3 || var1_3) ** GOTO lbl6
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        if (this.actionPhase != et$ActionPhase.RESTORE) ** GOTO lbl74
        if (var1_3 || var1_3) ** GOTO lbl6
        if (!this.isFromHotbar) ** GOTO lbl68
        if (var1_3 || var1_3) ** GOTO lbl6
        nv.selectSlot(this.previousSlot);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
            }
lbl68:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            nv.swapHotbar(this.pearlSlot, this.previousSlot);
            if (var1_3) ** GOTO lbl6
lbl71:
            // 2 sources

            if (var1_3 || var1_3) ** GOTO lbl6
            this.finishOneTickAction();
            if (var1_3) ** GOTO lbl6
lbl74:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl77:
            // 5 sources

            case 0: {
                var2_2 /* !! */  = (int)et.bqjp("bqst", bqjm(int ), (int)225);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 1: {
                var2_2 /* !! */  = (int)et.bqjp("bqsu", bqjm(int ), (int)226);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl87:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)et.bqjp("bqsv", bqjm(int ), (int)227);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl92:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)et.bqjp("bqsw", bqjm(int ), (int)228);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl97:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)et.bqjp("bqsx", bqjm(int ), (int)229);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl102:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)et.bqjp("bqsy", bqjm(int ), (int)230);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl107:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)et.bqjp("bqsz", bqjm(int ), (int)231);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)et.bqjp("bqta", bqjm(int ), (int)232);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl116:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)et.bqjp("bqtb", bqjm(int ), (int)233);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl121:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)et.bqjp("bqtc", bqjm(int ), (int)234);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl126:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)et.bqjp("bqtd", bqjm(int ), (int)235);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 11: {
                var2_2 /* !! */  = (int)et.bqjp("bqte", bqjm(int ), (int)236);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 12: {
                var2_2 /* !! */  = (int)et.bqjp("bqtf", bqjm(int ), (int)237);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl141:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)et.bqjp("bqtg", bqjm(int ), (int)238);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)et.bqjp("bqth", bqjm(int ), (int)239);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl149:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)et.bqjp("bqti", bqjm(int ), (int)240);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 16: {
                var2_2 /* !! */  = (int)et.bqjp("bqtj", bqjm(int ), (int)241);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 17: {
                var2_2 /* !! */  = (int)et.bqjp("bqtk", bqjm(int ), (int)242);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl164:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)et.bqjp("bqtl", bqjm(int ), (int)243);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 19: {
                var2_2 /* !! */  = (int)et.bqjp("bqtm", bqjm(int ), (int)244);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)et.bqjp("bqtn", bqjm(int ), (int)245);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 21: {
                var2_2 /* !! */  = (int)et.bqjp("bqto", bqjm(int ), (int)246);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
lbl182:
            // 3 sources

            case 22: {
                var2_2 /* !! */  = (int)et.bqjp("bqtp", bqjm(int ), (int)247);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 23: {
                var2_2 /* !! */  = (int)et.bqjp("bqtq", bqjm(int ), (int)248);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)et.bqjp("bqtr", bqjm(int ), (int)249);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl249
                    break;
                }
            }
            case 25: {
                var2_2 /* !! */  = (int)et.bqjp("bqts", bqjm(int ), (int)250);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl201:
            // 3 sources

            case 26: {
                var2_2 /* !! */  = (int)et.bqjp("bqtt", bqjm(int ), (int)251);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 27: {
                var2_2 /* !! */  = (int)et.bqjp("bqtu", bqjm(int ), (int)252);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl211:
            // 2 sources

            case 28: {
                var2_2 /* !! */  = (int)et.bqjp("bqtv", bqjm(int ), (int)253);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl215:
            // 3 sources

            case 29: {
                var2_2 /* !! */  = (int)et.bqjp("bqtw", bqjm(int ), (int)254);
                if (var3_1) {
                    throw null;
                }
            }
lbl219:
            // 5 sources

            case 30: {
                var2_2 /* !! */  = (int)et.bqjp("bqtx", bqjm(int ), (int)255);
                if (!var3_1) ** GOTO lbl182
                throw null;
            }
lbl223:
            // 2 sources

            case 31: {
                var2_2 /* !! */  = (int)et.bqjp("bqty", bqjm(int ), (int)256);
                if (!var3_1) ** GOTO lbl201
                throw null;
            }
            case 32: {
                var2_2 /* !! */  = (int)et.bqjp("bqtz", bqjm(int ), (int)257);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
lbl231:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)et.bqjp("bqua", bqjm(int ), (int)258);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl236:
            // 3 sources

            case 34: {
                var2_2 /* !! */  = (int)et.bqjp("bqub", bqjm(int ), (int)259);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl241:
            // 3 sources

            case 35: {
                var2_2 /* !! */  = (int)et.bqjp("bquc", bqjm(int ), (int)260);
                if (var3_1) {
                    throw null;
                }
            }
lbl245:
            // 8 sources

            case 36: {
                var2_2 /* !! */  = (int)et.bqjp("bqud", bqjm(int ), (int)261);
                if (!var3_1) ** GOTO lbl241
                throw null;
            }
lbl249:
            // 3 sources

            case 37: {
                var2_2 /* !! */  = (int)et.bqjp("bque", bqjm(int ), (int)262);
                if (!var3_1) ** GOTO lbl219
                throw null;
            }
            case 38: {
                var2_2 /* !! */  = (int)et.bqjp("bquf", bqjm(int ), (int)263);
                if (!var3_1) ** GOTO lbl249
                throw null;
            }
lbl257:
            // 2 sources

            case 39: {
                var2_2 /* !! */  = (int)et.bqjp("bqug", bqjm(int ), (int)264);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 40: {
                var2_2 /* !! */  = (int)et.bqjp("bquh", bqjm(int ), (int)265);
                if (!var3_1) ** GOTO lbl245
                throw null;
            }
            case 41: {
                var2_2 /* !! */  = (int)et.bqjp("bqui", bqjm(int ), (int)266);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 42: {
                var2_2 /* !! */  = (int)et.bqjp("bquj", bqjm(int ), (int)267);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 43: {
                var2_2 /* !! */  = (int)et.bqjp("bquk", bqjm(int ), (int)268);
                if (!var3_1) ** GOTO lbl236
                throw null;
            }
lbl278:
            // 3 sources

            case 44: {
                var2_2 /* !! */  = (int)et.bqjp("bqul", bqjm(int ), (int)269);
                if (!var3_1) ** GOTO lbl241
                throw null;
            }
lbl282:
            // 2 sources

            case 45: {
                var2_2 /* !! */  = (int)et.bqjp("bqum", bqjm(int ), (int)270);
                if (!var3_1) ** GOTO lbl219
                throw null;
            }
lbl286:
            // 2 sources

            case 46: {
                var2_2 /* !! */  = (int)et.bqjp("bqun", bqjm(int ), (int)271);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 47: {
                var2_2 /* !! */  = (int)et.bqjp("bquo", bqjm(int ), (int)272);
                if (!var3_1) ** GOTO lbl286
                throw null;
            }
            case 48: {
                var2_2 /* !! */  = (int)et.bqjp("bqup", bqjm(int ), (int)273);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
lbl298:
            // 2 sources

            case 49: {
                var2_2 /* !! */  = (int)et.bqjp("bquq", bqjm(int ), (int)274);
                if (!var3_1) ** GOTO lbl164
                throw null;
            }
lbl302:
            // 4 sources

            case 50: {
                var2_2 /* !! */  = (int)et.bqjp("bqur", bqjm(int ), (int)275);
                if (!var3_1) ** GOTO lbl245
                throw null;
            }
            case 51: {
                var2_2 /* !! */  = (int)et.bqjp("bqus", bqjm(int ), (int)276);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
lbl310:
            // 3 sources

            case 52: {
                var2_2 /* !! */  = (int)et.bqjp("bqut", bqjm(int ), (int)277);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 53: {
                var2_2 /* !! */  = (int)et.bqjp("bquu", bqjm(int ), (int)278);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
lbl318:
            // 2 sources

            case 54: {
                var2_2 /* !! */  = (int)et.bqjp("bquv", bqjm(int ), (int)279);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 55: 
        }
        var2_2 /* !! */  = (int)et.bqjp("bquw", bqjm(int ), (int)280);
        ** while (!var3_1)
lbl325:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void brrh() {
        et.bqjn[0] = 1654134768;
        et.bqjn[1] = -301262753;
        et.bqjn[2] = -1845305333;
        et.bqjn[3] = -1389033652;
        et.bqjn[4] = 314945853;
        et.bqjn[5] = -1209560877;
        et.bqjn[6] = 882110223;
        et.bqjn[7] = -2108963769;
        et.bqjn[8] = -575945775;
        et.bqjn[9] = 616552625;
        et.bqjn[10] = -1169092286;
        et.bqjn[11] = 775421018;
        et.bqjn[12] = 849264852;
        et.bqjn[13] = 607798671;
        et.bqjn[14] = -196949750;
        et.bqjn[15] = 1705494707;
        et.bqjn[16] = -1628919210;
        et.bqjn[17] = 1543693642;
        et.bqjn[18] = -1907751747;
        et.bqjn[19] = 1108100379;
        et.bqjn[20] = -56105538;
        et.bqjn[21] = -1059955559;
        et.bqjn[22] = 1759425576;
        et.bqjn[23] = -1734723196;
        et.bqjn[24] = 961912438;
        et.bqjn[25] = 601387231;
        et.bqjn[26] = 126310971;
        et.bqjn[27] = -2015178117;
        et.bqjn[28] = -1376695136;
        et.bqjn[29] = 218661299;
        et.bqjn[30] = -948504310;
        et.bqjn[31] = 426768362;
        et.bqjn[32] = 1721197622;
        et.bqjn[33] = 1731175807;
        et.bqjn[34] = -1867447103;
        et.bqjn[35] = 125115652;
        et.bqjn[36] = -1088065591;
        et.bqjn[37] = -1123852860;
        et.bqjn[38] = -2014758702;
        et.bqjn[39] = 1717474797;
        et.bqjn[40] = -68281112;
        et.bqjn[41] = 366155343;
        et.bqjn[42] = -632325552;
        et.bqjn[43] = 1544998007;
        et.bqjn[44] = -1801192657;
        et.bqjn[45] = -2072648931;
        et.bqjn[46] = 1557538473;
        et.bqjn[47] = 75097464;
        et.bqjn[48] = 1556739196;
        et.bqjn[49] = -2035207521;
        et.bqjn[50] = 1485010068;
        et.bqjn[51] = -924472318;
        et.bqjn[52] = 1818542323;
        et.bqjn[53] = -1377016180;
        et.bqjn[54] = 1397018149;
        et.bqjn[55] = -2124622325;
        et.bqjn[56] = 93903983;
        et.bqjn[57] = 785418168;
        et.bqjn[58] = -356171473;
        et.bqjn[59] = -1114508343;
        et.bqjn[60] = -728449582;
        et.bqjn[61] = -743273962;
        et.bqjn[62] = 1261858595;
        et.bqjn[63] = 882877534;
        et.bqjn[64] = -1896718868;
        et.bqjn[65] = 1531516809;
        et.bqjn[66] = 548201262;
        et.bqjn[67] = 876863075;
        et.bqjn[68] = 1544175414;
        et.bqjn[69] = 1693934938;
        et.bqjn[70] = 1964664961;
        et.bqjn[71] = -1141492966;
        et.bqjn[72] = 305457854;
        et.bqjn[73] = -1924446096;
        et.bqjn[74] = -1908746116;
        et.bqjn[75] = 1030241404;
        et.bqjn[76] = 400497153;
        et.bqjn[77] = -615535629;
        et.bqjn[78] = -1982619229;
        et.bqjn[79] = 1900703317;
        et.bqjn[80] = 1412723143;
        et.bqjn[81] = 563194470;
        et.bqjn[82] = -933852675;
        et.bqjn[83] = 67766129;
        et.bqjn[84] = 757022752;
        et.bqjn[85] = 1048141107;
        et.bqjn[86] = -481838357;
        et.bqjn[87] = -1368997042;
        et.bqjn[88] = -1748544873;
        et.bqjn[89] = -1281894541;
        et.bqjn[90] = 530572421;
        et.bqjn[91] = 2136823911;
        et.bqjn[92] = -844744818;
        et.bqjn[93] = -2012039944;
        et.bqjn[94] = 96416562;
        et.bqjn[95] = 1744301369;
        et.bqjn[96] = 949805956;
        et.bqjn[97] = 455437990;
        et.bqjn[98] = 2085005413;
        et.bqjn[99] = 1171637298;
    }

    private static /* synthetic */ void brrj() {
        et.bqjn[200] = 1979489564;
        et.bqjn[201] = 623559466;
        et.bqjn[202] = -1781290757;
        et.bqjn[203] = 354357642;
        et.bqjn[204] = -1535131770;
        et.bqjn[205] = -758192079;
        et.bqjn[206] = 473133834;
        et.bqjn[207] = 1047167475;
        et.bqjn[208] = 357015104;
        et.bqjn[209] = 1379163937;
        et.bqjn[210] = 84390212;
        et.bqjn[211] = -858436503;
        et.bqjn[212] = 448024129;
        et.bqjn[213] = -139631380;
        et.bqjn[214] = 273892131;
        et.bqjn[215] = -493790237;
        et.bqjn[216] = 1471322898;
        et.bqjn[217] = -141903484;
        et.bqjn[218] = 767698354;
        et.bqjn[219] = -1940993810;
        et.bqjn[220] = 1967546527;
        et.bqjn[221] = -128949675;
        et.bqjn[222] = -277162395;
        et.bqjn[223] = 1877935339;
        et.bqjn[224] = -1177241026;
        et.bqjn[225] = 1836871727;
        et.bqjn[226] = -355240860;
        et.bqjn[227] = 1800450263;
        et.bqjn[228] = -1338972650;
        et.bqjn[229] = 452124727;
        et.bqjn[230] = -2097012546;
        et.bqjn[231] = -909161313;
        et.bqjn[232] = 792265457;
        et.bqjn[233] = -1497438162;
        et.bqjn[234] = -984325438;
        et.bqjn[235] = -1458489482;
        et.bqjn[236] = 1878920455;
        et.bqjn[237] = 1493911130;
        et.bqjn[238] = 82941424;
        et.bqjn[239] = -260984697;
        et.bqjn[240] = 977583299;
        et.bqjn[241] = 1312318604;
        et.bqjn[242] = -236412535;
        et.bqjn[243] = 956027830;
        et.bqjn[244] = 736308012;
        et.bqjn[245] = -1240439631;
        et.bqjn[246] = -1400273758;
        et.bqjn[247] = -1178158034;
        et.bqjn[248] = -1990631164;
        et.bqjn[249] = -494506898;
        et.bqjn[250] = 1192194382;
        et.bqjn[251] = -1127068908;
        et.bqjn[252] = 188822698;
        et.bqjn[253] = 292536280;
        et.bqjn[254] = -1129806800;
        et.bqjn[255] = -24691302;
        et.bqjn[256] = -1894508130;
        et.bqjn[257] = 209355350;
        et.bqjn[258] = 1513379411;
        et.bqjn[259] = 1291095131;
        et.bqjn[260] = 680248941;
        et.bqjn[261] = 177156318;
        et.bqjn[262] = 719515537;
        et.bqjn[263] = -1626388878;
        et.bqjn[264] = -1513303108;
        et.bqjn[265] = 453454158;
        et.bqjn[266] = 896654809;
        et.bqjn[267] = -19310243;
        et.bqjn[268] = 1775811819;
        et.bqjn[269] = -822881416;
        et.bqjn[270] = 1046311821;
        et.bqjn[271] = 111607584;
        et.bqjn[272] = 1891032681;
        et.bqjn[273] = -1537786617;
        et.bqjn[274] = -1539804411;
        et.bqjn[275] = 1359069694;
        et.bqjn[276] = 630873570;
        et.bqjn[277] = -739753021;
        et.bqjn[278] = -1782797763;
        et.bqjn[279] = 1059277335;
        et.bqjn[280] = 1464146882;
        et.bqjn[281] = 2098106771;
        et.bqjn[282] = -2105832845;
        et.bqjn[283] = 973616253;
        et.bqjn[284] = -337326139;
        et.bqjn[285] = -1727380033;
        et.bqjn[286] = -1514848164;
        et.bqjn[287] = 2141900825;
        et.bqjn[288] = 1071935032;
        et.bqjn[289] = 1238222870;
        et.bqjn[290] = 518288046;
        et.bqjn[291] = -1980541500;
        et.bqjn[292] = 1951645477;
        et.bqjn[293] = -500235822;
        et.bqjn[294] = -529130385;
        et.bqjn[295] = 676522444;
        et.bqjn[296] = -1216660731;
        et.bqjn[297] = -1079148223;
        et.bqjn[298] = -610164714;
        et.bqjn[299] = 1327701443;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareItemLegit(class_1792 var1_1, String var2_2) {
        var7_3 = et.c;
        var6_4 /* !! */  = et.b;
        var5_5 = et.a;
        if (var7_3) {
            throw null;
lbl6:
            // 21 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl6
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6 = this.findInHotbar(var1_1);
                if (var5_5 || var5_5) ** GOTO lbl6
                if (!var3_6.found()) ** GOTO lbl25
                if (var5_5 || var5_5) ** GOTO lbl6
                this.previousSlot = et.mc.field_1724.method_31548().method_67532();
                if (var5_5 || var5_5) ** GOTO lbl6
                this.pearlSlot = var3_6.slot();
                if (var5_5 || var5_5) ** GOTO lbl6
                this.isFromHotbar = et.bqjp("bqow", bqjm(int ), (int)124);
                if (var5_5) ** GOTO lbl6
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl40
lbl25:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl6
                var4_7 = this.findInInventory(var1_1);
                if (var5_5 || var5_5) ** GOTO lbl6
                if (var4_7.found()) ** GOTO lbl33
                if (var5_5 || var5_5) ** GOTO lbl6
                pp.brandmessage(var2_2);
                if (var5_5 || var5_5) ** GOTO lbl6
                return;
lbl33:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl6
                this.previousSlot = et.mc.field_1724.method_31548().method_67532();
                if (var5_5 || var5_5) ** GOTO lbl6
                this.pearlSlot = var4_7.slot();
                if (var5_5 || var5_5) ** GOTO lbl6
                this.isFromHotbar = et.bqjp("bqox", bqjm(int ), (int)125);
                if (var5_5) ** GOTO lbl6
lbl40:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl6
                this.script.cleanup();
                if (var5_5 || var5_5) ** GOTO lbl6
                if (!this.isFromHotbar) ** GOTO lbl52
                if (var5_5 || var5_5) ** GOTO lbl6
                this.script.addStep((int)et.bqjp("bqoy", bqjm(int ), (int)126), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prepareItemLegit$0(), ()V)((et)this)).addStep((int)et.bqjp("bqoz", bqjm(int ), (int)127), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prepareItemLegit$1(), ()V)()).addStep((int)et.bqjp("bqpa", bqjm(int ), (int)128), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prepareItemLegit$2(), ()V)((et)this)).addStep((int)et.bqjp("bqpb", bqjm(int ), (int)129), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, cleanup(), ()V)((et)this));
                if (var5_5) ** GOTO lbl6
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl56
lbl52:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl6
                this.script.addStep((int)et.bqjp("bqpc", bqjm(int ), (int)130), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prepareItemLegit$3(), ()V)((et)this)).addStep((int)et.bqjp("bqpd", bqjm(int ), (int)131), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prepareItemLegit$4(), ()V)()).addStep((int)et.bqjp("bqpe", bqjm(int ), (int)132), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$prepareItemLegit$5(), ()V)((et)this)).addStep((int)et.bqjp("bqpf", bqjm(int ), (int)133), (oe)LambdaMetafactory.metafactory(null, null, null, ()V, cleanup(), ()V)((et)this));
                if (var5_5) ** GOTO lbl6
lbl56:
                // 2 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
lbl59:
            // 4 sources

            case 0: {
                var6_4 /* !! */  = (int)et.bqjp("bqpg", bqjm(int ), (int)134);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl64:
            // 2 sources

            case 1: {
                var6_4 /* !! */  = (int)et.bqjp("bqph", bqjm(int ), (int)135);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl69:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)et.bqjp("bqpi", bqjm(int ), (int)136);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl74:
            // 2 sources

            case 3: {
                var6_4 /* !! */  = (int)et.bqjp("bqpj", bqjm(int ), (int)137);
                if (!var7_3) ** GOTO lbl59
                throw null;
            }
            case 4: {
                var6_4 /* !! */  = (int)et.bqjp("bqpk", bqjm(int ), (int)138);
                if (!var7_3) ** GOTO lbl64
                throw null;
            }
lbl82:
            // 2 sources

            case 5: {
                var6_4 /* !! */  = (int)et.bqjp("bqpl", bqjm(int ), (int)139);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 6: {
                var6_4 /* !! */  = (int)et.bqjp("bqpm", bqjm(int ), (int)140);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl92:
            // 2 sources

            case 7: {
                var6_4 /* !! */  = (int)et.bqjp("bqpn", bqjm(int ), (int)141);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 8: {
                var6_4 /* !! */  = (int)et.bqjp("bqpo", bqjm(int ), (int)142);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl102:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)et.bqjp("bqpp", bqjm(int ), (int)143);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl107:
            // 2 sources

            case 10: {
                var6_4 /* !! */  = (int)et.bqjp("bqpq", bqjm(int ), (int)144);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl112:
            // 5 sources

            case 11: {
                var6_4 /* !! */  = (int)et.bqjp("bqpr", bqjm(int ), (int)145);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 12: {
                var6_4 /* !! */  = (int)et.bqjp("bqps", bqjm(int ), (int)146);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl122:
            // 2 sources

            case 13: {
                var6_4 /* !! */  = (int)et.bqjp("bqpt", bqjm(int ), (int)147);
                if (!var7_3) ** GOTO lbl74
                throw null;
            }
lbl126:
            // 3 sources

            case 14: {
                var6_4 /* !! */  = (int)et.bqjp("bqpu", bqjm(int ), (int)148);
                if (!var7_3) ** GOTO lbl59
                throw null;
            }
lbl130:
            // 2 sources

            case 15: {
                var6_4 /* !! */  = (int)et.bqjp("bqpv", bqjm(int ), (int)149);
                if (!var7_3) ** GOTO lbl122
                throw null;
            }
lbl134:
            // 3 sources

            case 16: {
                var6_4 /* !! */  = (int)et.bqjp("bqpw", bqjm(int ), (int)150);
                if (!var7_3) ** GOTO lbl130
                throw null;
            }
lbl138:
            // 2 sources

            case 17: {
                var6_4 /* !! */  = (int)et.bqjp("bqpx", bqjm(int ), (int)151);
                if (!var7_3) ** GOTO lbl82
                throw null;
            }
lbl142:
            // 3 sources

            case 18: {
                var6_4 /* !! */  = (int)et.bqjp("bqpy", bqjm(int ), (int)152);
                if (!var7_3) ** GOTO lbl138
                throw null;
            }
            case 19: {
                var6_4 /* !! */  = (int)et.bqjp("bqpz", bqjm(int ), (int)153);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl151:
            // 2 sources

            case 20: {
                var6_4 /* !! */  = (int)et.bqjp("bqqa", bqjm(int ), (int)154);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl156:
            // 2 sources

            case 21: {
                var6_4 /* !! */  = (int)et.bqjp("bqqb", bqjm(int ), (int)155);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl161:
            // 2 sources

            case 22: {
                var6_4 /* !! */  = (int)et.bqjp("bqqc", bqjm(int ), (int)156);
                if (!var7_3) ** GOTO lbl107
                throw null;
            }
lbl165:
            // 2 sources

            case 23: {
                var6_4 /* !! */  = (int)et.bqjp("bqqd", bqjm(int ), (int)157);
                if (!var7_3) ** GOTO lbl69
                throw null;
            }
lbl169:
            // 4 sources

            case 24: {
                var6_4 /* !! */  = (int)et.bqjp("bqqe", bqjm(int ), (int)158);
                if (!var7_3) ** GOTO lbl112
                throw null;
            }
            case 25: {
                var6_4 /* !! */  = (int)et.bqjp("bqqf", bqjm(int ), (int)159);
                if (!var7_3) ** GOTO lbl169
                throw null;
            }
lbl177:
            // 2 sources

            case 26: {
                var6_4 /* !! */  = (int)et.bqjp("bqqg", bqjm(int ), (int)160);
                if (!var7_3) ** GOTO lbl112
                throw null;
            }
            case 27: {
                var6_4 /* !! */  = (int)et.bqjp("bqqh", bqjm(int ), (int)161);
                if (!var7_3) ** GOTO lbl112
                throw null;
            }
lbl185:
            // 3 sources

            case 28: {
                var6_4 /* !! */  = (int)et.bqjp("bqqi", bqjm(int ), (int)162);
                if (!var7_3) ** GOTO lbl151
                throw null;
            }
lbl189:
            // 2 sources

            case 29: {
                var6_4 /* !! */  = (int)et.bqjp("bqqj", bqjm(int ), (int)163);
                if (!var7_3) ** GOTO lbl185
                throw null;
            }
lbl193:
            // 2 sources

            case 30: {
                var6_4 /* !! */  = (int)et.bqjp("bqqk", bqjm(int ), (int)164);
                if (!var7_3) ** GOTO lbl112
                throw null;
            }
            case 31: {
                var6_4 /* !! */  = (int)et.bqjp("bqql", bqjm(int ), (int)165);
                if (!var7_3) ** GOTO lbl156
                throw null;
            }
            case 32: {
                var6_4 /* !! */  = (int)et.bqjp("bqqm", bqjm(int ), (int)166);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl206:
            // 3 sources

            case 33: {
                var6_4 /* !! */  = (int)et.bqjp("bqqn", bqjm(int ), (int)167);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl211:
            // 2 sources

            case 34: {
                var6_4 /* !! */  = (int)et.bqjp("bqqo", bqjm(int ), (int)168);
                if (!var7_3) ** GOTO lbl102
                throw null;
            }
lbl215:
            // 2 sources

            case 35: {
                var6_4 /* !! */  = (int)et.bqjp("bqqp", bqjm(int ), (int)169);
                if (!var7_3) ** GOTO lbl59
                throw null;
            }
lbl219:
            // 2 sources

            case 36: {
                var6_4 /* !! */  = (int)et.bqjp("bqqq", bqjm(int ), (int)170);
                if (!var7_3) ** GOTO lbl142
                throw null;
            }
            case 37: {
                var6_4 /* !! */  = (int)et.bqjp("bqqr", bqjm(int ), (int)171);
                if (!var7_3) ** GOTO lbl134
                throw null;
            }
            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)et.bqjp("bqqs", bqjm(int ), (int)172);
                    if (!var7_3) ** GOTO lbl177
                    throw null;
                }
            }
            case 39: {
                var6_4 /* !! */  = (int)et.bqjp("bqqt", bqjm(int ), (int)173);
                if (!var7_3) ** GOTO lbl92
                throw null;
            }
lbl236:
            // 2 sources

            case 40: {
                var6_4 /* !! */  = (int)et.bqjp("bqqu", bqjm(int ), (int)174);
                if (!var7_3) ** GOTO lbl126
                throw null;
            }
            case 41: 
        }
        var6_4 /* !! */  = (int)et.bqjp("bqqv", bqjm(int ), (int)175);
        ** while (!var7_3)
lbl243:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void brrw() {
        et.bqme[100] = -8372524365458537393L;
        et.bqme[101] = 5724767308590623857L;
        et.bqme[102] = 5465486993124731390L;
        et.bqme[103] = -5135161014352413077L;
        et.bqme[104] = -8059399174233413353L;
        et.bqme[105] = 8258588669575713353L;
        et.bqme[106] = -5126576267917496026L;
        et.bqme[107] = -8625845782495481906L;
        et.bqme[108] = 8891154604163787994L;
        et.bqme[109] = 4921235758533339776L;
        et.bqme[110] = -3959734780097275018L;
        et.bqme[111] = 2581658487732195761L;
        et.bqme[112] = -1686824961593946449L;
        et.bqme[113] = 605872181372441946L;
        et.bqme[114] = -6469325706522462236L;
        et.bqme[115] = -1037208898345020560L;
        et.bqme[116] = -109742457527379645L;
        et.bqme[117] = -7106914582231095088L;
        et.bqme[118] = -1126718033446051037L;
        et.bqme[119] = 4013337899641808742L;
        et.bqme[120] = 5206830024170381728L;
        et.bqme[121] = -3246874958196895777L;
        et.bqme[122] = 2088446609554386793L;
        et.bqme[123] = 4704731965560812195L;
        et.bqme[124] = -747684440282988073L;
        et.bqme[125] = 5502176705568083072L;
        et.bqme[126] = -1625083625044762513L;
        et.bqme[127] = 953963753992980598L;
        et.bqme[128] = -4045473257179193590L;
        et.bqme[129] = -1554540668170693755L;
        et.bqme[130] = 7114968313990038266L;
        et.bqme[131] = -6493558221694086612L;
        et.bqme[132] = 5895984462500024830L;
        et.bqme[133] = 5465255918646234826L;
        et.bqme[134] = 7929251487024997125L;
        et.bqme[135] = -2620094744076442206L;
        et.bqme[136] = -3332341201064020531L;
        et.bqme[137] = 3133075589055316269L;
        et.bqme[138] = 7436805950983091372L;
        et.bqme[139] = 2955825826805179859L;
        et.bqme[140] = -5452722056630729280L;
        et.bqme[141] = 212721727843226871L;
        et.bqme[142] = 8684682063403805628L;
        et.bqme[143] = 5108776835029289428L;
        et.bqme[144] = -7357005602854120865L;
        et.bqme[145] = 6554551333853612263L;
        et.bqme[146] = 5748178815590132858L;
        et.bqme[147] = -5657715056835990472L;
        et.bqme[148] = 8048122692779946961L;
        et.bqme[149] = -5169808156461037921L;
        et.bqme[150] = -4942324500610865628L;
        et.bqme[151] = 8243072015147813590L;
        et.bqme[152] = 1763569881965772464L;
        et.bqme[153] = -4595165321088784134L;
        et.bqme[154] = 2986706056882196464L;
        et.bqme[155] = -1082316458745290204L;
        et.bqme[156] = 5688111101999287941L;
        et.bqme[157] = -501289089925031207L;
        et.bqme[158] = -8737714772133817474L;
        et.bqme[159] = 1372739051743380184L;
        et.bqme[160] = 8129974327640917879L;
        et.bqme[161] = -8891224019055505872L;
        et.bqme[162] = 1001612278967566046L;
        et.bqme[163] = -2853511212383452422L;
        et.bqme[164] = 6851021091647870582L;
        et.bqme[165] = -289614411331490216L;
        et.bqme[166] = 2542537080251708560L;
    }

    private static /* synthetic */ void brrr() {
        et.bqjo[400] = 391779626;
        et.bqjo[401] = -1729255796;
        et.bqjo[402] = 1116240869;
        et.bqjo[403] = 1694326577;
        et.bqjo[404] = -657964800;
        et.bqjo[405] = -286630687;
        et.bqjo[406] = 2034982428;
        et.bqjo[407] = -533305938;
        et.bqjo[408] = 1447840201;
        et.bqjo[409] = -1474594603;
        et.bqjo[410] = -2094357946;
        et.bqjo[411] = -606216145;
        et.bqjo[412] = -421844323;
        et.bqjo[413] = -1398272186;
        et.bqjo[414] = -1909702299;
        et.bqjo[415] = 1474033213;
        et.bqjo[416] = -1501952208;
        et.bqjo[417] = 469182745;
        et.bqjo[418] = 1097760406;
        et.bqjo[419] = 1356579631;
        et.bqjo[420] = 868943353;
        et.bqjo[421] = -2052855882;
        et.bqjo[422] = -991351938;
        et.bqjo[423] = -481068065;
        et.bqjo[424] = -967502387;
        et.bqjo[425] = 1288569817;
        et.bqjo[426] = 538321039;
        et.bqjo[427] = -872629343;
        et.bqjo[428] = 2144332234;
        et.bqjo[429] = 2012407205;
        et.bqjo[430] = 1506332587;
        et.bqjo[431] = -346561921;
        et.bqjo[432] = 554422539;
        et.bqjo[433] = 369917028;
        et.bqjo[434] = -2119721587;
        et.bqjo[435] = -1536720948;
        et.bqjo[436] = -244423972;
        et.bqjo[437] = 1708203984;
        et.bqjo[438] = -995990098;
        et.bqjo[439] = -365090701;
        et.bqjo[440] = -2053474684;
        et.bqjo[441] = -1407014899;
        et.bqjo[442] = 1451582931;
        et.bqjo[443] = -1455927833;
        et.bqjo[444] = 18563018;
        et.bqjo[445] = -557966795;
        et.bqjo[446] = 728368527;
        et.bqjo[447] = -1805882366;
        et.bqjo[448] = 525103394;
        et.bqjo[449] = 1531798082;
        et.bqjo[450] = -275357712;
        et.bqjo[451] = -493686867;
        et.bqjo[452] = -1595006470;
        et.bqjo[453] = 357865319;
        et.bqjo[454] = -88801398;
        et.bqjo[455] = -715585680;
        et.bqjo[456] = -857118440;
        et.bqjo[457] = 1702298491;
        et.bqjo[458] = 567637227;
        et.bqjo[459] = 247850016;
        et.bqjo[460] = 1255275185;
        et.bqjo[461] = 2032802060;
        et.bqjo[462] = -2132034626;
        et.bqjo[463] = 378542943;
        et.bqjo[464] = 67313793;
        et.bqjo[465] = 1723207629;
        et.bqjo[466] = 525110660;
        et.bqjo[467] = -1574290099;
        et.bqjo[468] = -1846679763;
        et.bqjo[469] = 371872894;
        et.bqjo[470] = 1254130393;
        et.bqjo[471] = -1318459902;
        et.bqjo[472] = -1741978758;
        et.bqjo[473] = 1744669936;
        et.bqjo[474] = 56711855;
        et.bqjo[475] = -1875457945;
        et.bqjo[476] = -179771703;
        et.bqjo[477] = 361875661;
        et.bqjo[478] = -496601903;
        et.bqjo[479] = -1599134805;
        et.bqjo[480] = -1183748398;
        et.bqjo[481] = -82068981;
        et.bqjo[482] = -480303285;
        et.bqjo[483] = 1609935951;
        et.bqjo[484] = 1439758640;
        et.bqjo[485] = 1392617590;
        et.bqjo[486] = 1788034671;
        et.bqjo[487] = -2056342537;
        et.bqjo[488] = 2119269837;
        et.bqjo[489] = 388079399;
        et.bqjo[490] = 966155535;
        et.bqjo[491] = -1061210004;
        et.bqjo[492] = 1353362364;
        et.bqjo[493] = 144162888;
        et.bqjo[494] = 1386503000;
        et.bqjo[495] = 1055297828;
        et.bqjo[496] = 438994634;
        et.bqjo[497] = -966125678;
        et.bqjo[498] = 1699311697;
        et.bqjo[499] = -1241099163;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void lambda$prepareItemLegit$3() {
        block36: {
            v0 /* !! */  = et.dv;
            if (true) ** GOTO lbl5
            block17: while (true) {
                v0 /* !! */  = (long)(v1 - et.bqjp("broa", bqmc(int ), (int)132));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -196404346: {
                        v1 = et.bqjp("brob", bqmc(int ), (int)133);
                        continue block17;
                    }
                    case -52976664: {
                        v1 = et.bqjp("broc", bqmc(int ), (int)134);
                        continue block17;
                    }
                    case 2033801891: {
                        break block17;
                    }
                }
                break;
            }
            var3_1 = et.c;
            v2 /* !! */  = et.dv;
            if (true) ** GOTO lbl19
            block18: while (true) {
                v2 /* !! */  = (long)(v3 - et.bqjp("brod", bqmc(int ), (int)135));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1062368924: {
                        v3 = et.bqjp("broe", bqmc(int ), (int)136);
                        continue block18;
                    }
                    case -225995116: {
                        v3 = et.bqjp("brof", bqmc(int ), (int)137);
                        continue block18;
                    }
                    case 2033801891: {
                        break block18;
                    }
                }
                break;
            }
            var2_2 /* !! */  = et.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("brog", bqmc(int ), (int)138)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == et.bqjp("broh", bqjm(int ), (int)464)) {
                    var1_3 = et.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v4 /* !! */  = (long)et.bqjp("broi", bqjm(int ), (int)465);
            }
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block20: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 || var1_3) return;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("broj", bqmc(int ), (int)139)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  != et.bqjp("brok", bqjm(int ), (int)466)) {
                                v5 /* !! */  = (long)et.bqjp("brol", bqjm(int ), (int)467);
                                continue;
                            }
                            break block36;
                            break;
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)et.bqjp("bros", bqjm(int ), (int)472);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block20;
                        throw null;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)et.bqjp("brov", bqjm(int ), (int)475);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** GOTO lbl67
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)et.bqjp("brow", bqjm(int ), (int)476);
                        if (var3_1) {
                            throw null;
                        }
lbl67:
                        // 3 sources

                        var2_2 /* !! */  = (int)et.bqjp("brot", bqjm(int ), (int)473);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            do {
                var2_2 /* !! */  = (int)et.bqjp("brou", bqjm(int ), (int)474);
            } while (!var3_1);
            throw null;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("brom", bqmc(int ), (int)140)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == et.bqjp("bron", bqjm(int ), (int)468)) break;
            v6 /* !! */  = (long)et.bqjp("broo", bqjm(int ), (int)469);
        }
        while (true) {
            block37: {
                if ((v7 /* !! */  = (cfr_temp_4 = et.dv - et.bqjp("brop", bqmc(int ), (int)141)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == et.bqjp("broq", bqjm(int ), (int)470)) {
                    nv.swapHotbar(this.pearlSlot, this.previousSlot);
                    if (!var1_3) return;
                }
                break block37;
                return;
            }
            v7 /* !! */  = (long)et.bqjp("bror", bqjm(int ), (int)471);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void lambda$prepareItemLegit$0() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = dv - et.bqjp("brqm", bqmc(int ), (int)159)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == et.bqjp("brqn", bqjm(int ), (int)501)) break;
            object = et.bqjp("brqo", bqjm(int ), (int)502);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = dv - et.bqjp("brqp", bqmc(int ), (int)160)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == et.bqjp("brqq", bqjm(int ), (int)503)) break;
            object = et.bqjp("brqr", bqjm(int ), (int)504);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = dv - et.bqjp("brqs", bqmc(int ), (int)161)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == et.bqjp("brqt", bqjm(int ), (int)505)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = et.bqjp("brqu", bqjm(int ), (int)506);
        }
        if (bl2 || bl2) return;
        Object object = dv;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - et.bqjp("brqv", bqmc(int ), (int)162);
            }
            switch ((int)object) {
                case -1892606918: {
                    callSite = et.bqjp("brqw", bqmc(int ), (int)163);
                    continue block9;
                }
                case -1699200569: {
                    callSite = et.bqjp("brqx", bqmc(int ), (int)164);
                    continue block9;
                }
                case 1397019576: {
                    callSite = et.bqjp("brqy", bqmc(int ), (int)165);
                    continue block9;
                }
                case 2033801891: {
                    break block9;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = dv - et.bqjp("brqz", bqmc(int ), (int)166)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == et.bqjp("brra", bqjm(int ), (int)507)) {
                nv.selectSlot(this.pearlSlot);
                if (bl2) return;
                return;
            }
            object2 = et.bqjp("brrb", bqjm(int ), (int)508);
        }
    }

    public static /* synthetic */ CallSite bqjp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void brru() {
        et.bqmd[100] = -4864548052616677092L;
        et.bqmd[101] = -5069011105239688883L;
        et.bqmd[102] = -5817372807629673234L;
        et.bqmd[103] = -800162651866073565L;
        et.bqmd[104] = 742052970958714538L;
        et.bqmd[105] = -8176329940102758420L;
        et.bqmd[106] = 4893682385350735149L;
        et.bqmd[107] = -716961465974643434L;
        et.bqmd[108] = 7055479320383631307L;
        et.bqmd[109] = -5829410733142709134L;
        et.bqmd[110] = 1191123614313810825L;
        et.bqmd[111] = -4332687695247095759L;
        et.bqmd[112] = -7667995711020525447L;
        et.bqmd[113] = -5700320657882543859L;
        et.bqmd[114] = 4133135990726179805L;
        et.bqmd[115] = 1067923700592730752L;
        et.bqmd[116] = -3731623688101643917L;
        et.bqmd[117] = 7661270923598415144L;
        et.bqmd[118] = 2319004903415142050L;
        et.bqmd[119] = -9013151377214784130L;
        et.bqmd[120] = -3063562326658348857L;
        et.bqmd[121] = 766481730025668774L;
        et.bqmd[122] = -7646701396028522809L;
        et.bqmd[123] = 333564304457386312L;
        et.bqmd[124] = 2744066209072240474L;
        et.bqmd[125] = 1290390030835215427L;
        et.bqmd[126] = 742729489709662335L;
        et.bqmd[127] = -434812077972927540L;
        et.bqmd[128] = -8267781524777306370L;
        et.bqmd[129] = 6270083056102094183L;
        et.bqmd[130] = -3647099461069520446L;
        et.bqmd[131] = 8657886749159923060L;
        et.bqmd[132] = -844539845312024589L;
        et.bqmd[133] = -6823433142564825737L;
        et.bqmd[134] = -5167893445855833939L;
        et.bqmd[135] = -9055838806690574008L;
        et.bqmd[136] = -3597070397604129662L;
        et.bqmd[137] = -8064445290142066254L;
        et.bqmd[138] = -4936327373145197833L;
        et.bqmd[139] = -3876643210020375299L;
        et.bqmd[140] = 4697660752028194717L;
        et.bqmd[141] = 762811368342798939L;
        et.bqmd[142] = 8374922453287128763L;
        et.bqmd[143] = -6189513805890199397L;
        et.bqmd[144] = -2116871205131877424L;
        et.bqmd[145] = -7170959988814602058L;
        et.bqmd[146] = -4718982449652856876L;
        et.bqmd[147] = 8094911927172875821L;
        et.bqmd[148] = -1739981531144568887L;
        et.bqmd[149] = -4538815980577594339L;
        et.bqmd[150] = -668596828089078605L;
        et.bqmd[151] = 4824731115390723300L;
        et.bqmd[152] = 251632037389670413L;
        et.bqmd[153] = 4400648363288817037L;
        et.bqmd[154] = -2672337981608712110L;
        et.bqmd[155] = 3946951743618706521L;
        et.bqmd[156] = 3205326490318335094L;
        et.bqmd[157] = 3323053715674221776L;
        et.bqmd[158] = 5743973131712227607L;
        et.bqmd[159] = 2965069985008872563L;
        et.bqmd[160] = 1232730554703812594L;
        et.bqmd[161] = -8944814917493494282L;
        et.bqmd[162] = 3031663730273320102L;
        et.bqmd[163] = -9182852378363834293L;
        et.bqmd[164] = 3685592724575828498L;
        et.bqmd[165] = -888859510113010190L;
        et.bqmd[166] = -5567045244655836561L;
    }

    private static /* synthetic */ void brrk() {
        et.bqjn[300] = -1761889393;
        et.bqjn[301] = 1355195109;
        et.bqjn[302] = -214996243;
        et.bqjn[303] = -162121827;
        et.bqjn[304] = 1834635635;
        et.bqjn[305] = -1935938671;
        et.bqjn[306] = 769098863;
        et.bqjn[307] = 377046180;
        et.bqjn[308] = -1095852781;
        et.bqjn[309] = -1134250675;
        et.bqjn[310] = 24042693;
        et.bqjn[311] = -1649447197;
        et.bqjn[312] = -1601043812;
        et.bqjn[313] = -630545941;
        et.bqjn[314] = 745738815;
        et.bqjn[315] = 501304289;
        et.bqjn[316] = 449553060;
        et.bqjn[317] = -1151415131;
        et.bqjn[318] = -1962591099;
        et.bqjn[319] = -953811184;
        et.bqjn[320] = 435328330;
        et.bqjn[321] = 94638032;
        et.bqjn[322] = 240540844;
        et.bqjn[323] = 2039712802;
        et.bqjn[324] = 550580901;
        et.bqjn[325] = 338305576;
        et.bqjn[326] = 1957647463;
        et.bqjn[327] = -201188540;
        et.bqjn[328] = 1392265456;
        et.bqjn[329] = -1839816994;
        et.bqjn[330] = -2068150404;
        et.bqjn[331] = 1120167730;
        et.bqjn[332] = 111158704;
        et.bqjn[333] = -204453395;
        et.bqjn[334] = 361135538;
        et.bqjn[335] = 689181412;
        et.bqjn[336] = 500709375;
        et.bqjn[337] = -1594227236;
        et.bqjn[338] = 1663277303;
        et.bqjn[339] = 815127993;
        et.bqjn[340] = -1557104746;
        et.bqjn[341] = 688066855;
        et.bqjn[342] = -738368687;
        et.bqjn[343] = 2122377138;
        et.bqjn[344] = 574676244;
        et.bqjn[345] = 114965954;
        et.bqjn[346] = -543935295;
        et.bqjn[347] = -326061759;
        et.bqjn[348] = 1893986672;
        et.bqjn[349] = -72343820;
        et.bqjn[350] = -2079140923;
        et.bqjn[351] = 251795213;
        et.bqjn[352] = -755739068;
        et.bqjn[353] = -994050475;
        et.bqjn[354] = 1215789256;
        et.bqjn[355] = -570250283;
        et.bqjn[356] = 1173281486;
        et.bqjn[357] = 1114341924;
        et.bqjn[358] = 769192633;
        et.bqjn[359] = -499818283;
        et.bqjn[360] = -1335342457;
        et.bqjn[361] = -1144806575;
        et.bqjn[362] = 1283377446;
        et.bqjn[363] = -370233487;
        et.bqjn[364] = 854540144;
        et.bqjn[365] = -1825389587;
        et.bqjn[366] = 158237999;
        et.bqjn[367] = -1784229052;
        et.bqjn[368] = 1792869957;
        et.bqjn[369] = -768994296;
        et.bqjn[370] = -1172101858;
        et.bqjn[371] = -2082006042;
        et.bqjn[372] = 957183457;
        et.bqjn[373] = -727890772;
        et.bqjn[374] = -1997658961;
        et.bqjn[375] = 15797409;
        et.bqjn[376] = -2027777455;
        et.bqjn[377] = 207278320;
        et.bqjn[378] = 1640296091;
        et.bqjn[379] = -832678821;
        et.bqjn[380] = -1163734314;
        et.bqjn[381] = 998729016;
        et.bqjn[382] = 1776794439;
        et.bqjn[383] = 1699438101;
        et.bqjn[384] = 2057782219;
        et.bqjn[385] = 1755735059;
        et.bqjn[386] = 1674972867;
        et.bqjn[387] = -1350414461;
        et.bqjn[388] = 985331654;
        et.bqjn[389] = 969529363;
        et.bqjn[390] = 1013677593;
        et.bqjn[391] = -207140189;
        et.bqjn[392] = -1951788861;
        et.bqjn[393] = -939474849;
        et.bqjn[394] = -1562837360;
        et.bqjn[395] = -1514164573;
        et.bqjn[396] = -1183492623;
        et.bqjn[397] = -776492552;
        et.bqjn[398] = 134059727;
        et.bqjn[399] = -2067362371;
    }

    private static /* synthetic */ void brrm() {
        et.bqjn[500] = -981788357;
        et.bqjn[501] = 1582274614;
        et.bqjn[502] = -1405450519;
        et.bqjn[503] = -1868655267;
        et.bqjn[504] = 165107595;
        et.bqjn[505] = 409727947;
        et.bqjn[506] = -931495931;
        et.bqjn[507] = 1598189861;
        et.bqjn[508] = 1382474089;
        et.bqjn[509] = -1351189143;
        et.bqjn[510] = -1336361694;
        et.bqjn[511] = 1660349506;
        et.bqjn[512] = 670990134;
        et.bqjn[513] = 1648807411;
    }

    private static /* synthetic */ void brrv() {
        et.bqme[0] = -657708296310238401L;
        et.bqme[1] = -6764637164516149215L;
        et.bqme[2] = -509362595348486530L;
        et.bqme[3] = 5950577065105943877L;
        et.bqme[4] = -6284698816027469754L;
        et.bqme[5] = -7476074780085701407L;
        et.bqme[6] = 81770701589549866L;
        et.bqme[7] = -70182086888650845L;
        et.bqme[8] = -7310553335661647133L;
        et.bqme[9] = -3960468246866738726L;
        et.bqme[10] = -8197625790096226584L;
        et.bqme[11] = 8920229889874144560L;
        et.bqme[12] = 3744512605339538621L;
        et.bqme[13] = -5794098558552921010L;
        et.bqme[14] = 8991598345811645044L;
        et.bqme[15] = 7693729407314244568L;
        et.bqme[16] = 8437768280560697612L;
        et.bqme[17] = -2921895777663764399L;
        et.bqme[18] = 7904972306399010398L;
        et.bqme[19] = 7729420278263936323L;
        et.bqme[20] = -2179493443925608226L;
        et.bqme[21] = 5315632674681436787L;
        et.bqme[22] = 7417801764310273346L;
        et.bqme[23] = 7302204251116492096L;
        et.bqme[24] = -8428648489779299243L;
        et.bqme[25] = -4116195229420858284L;
        et.bqme[26] = -2914248280860518461L;
        et.bqme[27] = 2299905769450786239L;
        et.bqme[28] = 1913613757517118626L;
        et.bqme[29] = -2538727887038432274L;
        et.bqme[30] = 2693917966011479804L;
        et.bqme[31] = -4683496104877353478L;
        et.bqme[32] = 4089192900628533236L;
        et.bqme[33] = 5025048185411708077L;
        et.bqme[34] = 4306752576455502331L;
        et.bqme[35] = 2271220943542829180L;
        et.bqme[36] = 1785042032197633752L;
        et.bqme[37] = 5053623022696802706L;
        et.bqme[38] = 134310580707993847L;
        et.bqme[39] = 1900860894075312486L;
        et.bqme[40] = -6086821743368064405L;
        et.bqme[41] = 2074320992861024093L;
        et.bqme[42] = 6791802554957332030L;
        et.bqme[43] = 627205202300320487L;
        et.bqme[44] = 3355510272697579305L;
        et.bqme[45] = 1938680315467742933L;
        et.bqme[46] = -2754985797067528067L;
        et.bqme[47] = -8830444150788827697L;
        et.bqme[48] = 6202023326211974174L;
        et.bqme[49] = -1739426721672568906L;
        et.bqme[50] = 161943483820023346L;
        et.bqme[51] = -5670521927597386735L;
        et.bqme[52] = 9200615226085719959L;
        et.bqme[53] = -25167185660766622L;
        et.bqme[54] = 3035160766999614257L;
        et.bqme[55] = -4277965826502082650L;
        et.bqme[56] = -3205516814367843111L;
        et.bqme[57] = -8223932577704214308L;
        et.bqme[58] = -71446194095254127L;
        et.bqme[59] = 6394048151820924604L;
        et.bqme[60] = 185780723895348406L;
        et.bqme[61] = -3637593072144318520L;
        et.bqme[62] = -5710340348143755436L;
        et.bqme[63] = 2519117111974922309L;
        et.bqme[64] = 2830631530136136560L;
        et.bqme[65] = 6787433289882804642L;
        et.bqme[66] = 4945027103799219308L;
        et.bqme[67] = 113130276663178070L;
        et.bqme[68] = 2164059240761155743L;
        et.bqme[69] = -99288355935641500L;
        et.bqme[70] = 5925011308237308543L;
        et.bqme[71] = 384057273689894744L;
        et.bqme[72] = -9026673687721363828L;
        et.bqme[73] = 8882916954571369802L;
        et.bqme[74] = -6828707392228407555L;
        et.bqme[75] = -1019812699783855578L;
        et.bqme[76] = 2360974173945333951L;
        et.bqme[77] = -2572920688075628656L;
        et.bqme[78] = -679963314235330358L;
        et.bqme[79] = 6322189149010011420L;
        et.bqme[80] = -8606158169659720662L;
        et.bqme[81] = -464137218802326878L;
        et.bqme[82] = -5144233830776645290L;
        et.bqme[83] = 5538491687453782804L;
        et.bqme[84] = 3203796500044548870L;
        et.bqme[85] = 3658510435437587427L;
        et.bqme[86] = 602303362104270497L;
        et.bqme[87] = -7173824570299479944L;
        et.bqme[88] = -3058039340077051248L;
        et.bqme[89] = 5173126497070876691L;
        et.bqme[90] = -9064978873512051212L;
        et.bqme[91] = -403039050326530456L;
        et.bqme[92] = -23169836095698692L;
        et.bqme[93] = 2725653832066835605L;
        et.bqme[94] = -8913964391520811771L;
        et.bqme[95] = -7518539290698498165L;
        et.bqme[96] = -8837218176120134794L;
        et.bqme[97] = -7401162206518229082L;
        et.bqme[98] = -8828001156826714029L;
        et.bqme[99] = 8164114812212163334L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$prepareItemLegit$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("brpr", bqmc(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == et.bqjp("brps", bqjm(int ), (int)488)) break;
            v0 /* !! */  = (long)et.bqjp("brpt", bqjm(int ), (int)489);
        }
        var2 = et.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("brpu", bqmc(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == et.bqjp("brpv", bqjm(int ), (int)490)) break;
            v1 /* !! */  = (long)et.bqjp("brpw", bqjm(int ), (int)491);
        }
        var1_1 = et.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("brpx", bqmc(int ), (int)153)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == et.bqjp("brpy", bqjm(int ), (int)492)) break;
            v2 /* !! */  = (long)et.bqjp("brpz", bqjm(int ), (int)493);
        }
        var0_2 = et.a;
        if (var2) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl24
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("brqa", bqmc(int ), (int)154)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == et.bqjp("brqb", bqjm(int ), (int)494)) break;
            v3 /* !! */  = (long)et.bqjp("brqc", bqjm(int ), (int)495);
        }
        v4 /* !! */  = et.dv;
        if (true) ** GOTO lbl37
        block11: while (true) {
            v4 /* !! */  = (long)(v5 - et.bqjp("brqd", bqmc(int ), (int)155));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1542240010: {
                    v5 = et.bqjp("brqe", bqmc(int ), (int)156);
                    continue block11;
                }
                case 1508821449: {
                    v5 = et.bqjp("brqf", bqmc(int ), (int)157);
                    continue block11;
                }
                case 1674093307: {
                    v5 = et.bqjp("brqg", bqmc(int ), (int)158);
                    continue block11;
                }
                case 2033801891: {
                    break block11;
                }
            }
            break;
        }
        nv.use(class_1268.field_5808);
        if (!var0_2) ** break;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block40: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = et.dv - et.bqjp("bqmf", bqmc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == et.bqjp("bqmg", bqjm(int ), (int)64)) break;
                v0 /* !! */  = (long)et.bqjp("bqmh", bqjm(int ), (int)65);
            }
            var4_2 = et.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = et.dv - et.bqjp("bqmi", bqmc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == et.bqjp("bqmj", bqjm(int ), (int)66)) break;
                v1 /* !! */  = (long)et.bqjp("bqmk", bqjm(int ), (int)67);
            }
            var3_3 /* !! */  = et.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = et.dv - et.bqjp("bqml", bqmc(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == et.bqjp("bqmm", bqjm(int ), (int)68)) break;
                v2 /* !! */  = (long)et.bqjp("bqmn", bqjm(int ), (int)69);
            }
            var2_4 = et.a;
            if (var4_2) {
                throw null;
lbl21:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = et.dv - et.bqjp("bqmo", bqmc(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == et.bqjp("bqmp", bqjm(int ), (int)70)) break;
                v3 /* !! */  = (long)et.bqjp("bqmq", bqjm(int ), (int)71);
            }
            v4 /* !! */  = et.dv;
            if (true) ** GOTO lbl33
            block24: while (true) {
                v4 /* !! */  = (long)(et.bqjp("bqms", bqmc(int ), (int)5) - et.bqjp("bqmr", bqmc(int ), (int)4));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1717824636: {
                        continue block24;
                    }
                    case 2033801891: {
                        break block24;
                    }
                }
                break;
            }
            if (et.mc.field_1724 != null) break block40;
            if (var2_4 || var2_4) ** GOTO lbl21
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = et.dv - et.bqjp("bqmt", bqmc(int ), (int)6)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == et.bqjp("bqmu", bqjm(int ), (int)72)) break;
            v5 /* !! */  = (long)et.bqjp("bqmv", bqjm(int ), (int)73);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_5 = et.dv - et.bqjp("bqmw", bqmc(int ), (int)7)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == et.bqjp("bqmx", bqjm(int ), (int)74)) break;
            v6 /* !! */  = (long)et.bqjp("bqmy", bqjm(int ), (int)75);
        }
        this.script.update();
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_6 = et.dv - et.bqjp("bqmz", bqmc(int ), (int)8)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == et.bqjp("bqna", bqjm(int ), (int)76)) break;
            v7 /* !! */  = (long)et.bqjp("bqnb", bqjm(int ), (int)77);
        }
        this.updateOneTickAction();
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)et.bqjp("bqnc", bqjm(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: {
                var3_3 /* !! */  = (int)et.bqjp("bqnd", bqjm(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl78:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)et.bqjp("bqne", bqjm(int ), (int)80);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 3: {
                var3_3 /* !! */  = (int)et.bqjp("bqnf", bqjm(int ), (int)81);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)et.bqjp("bqng", bqjm(int ), (int)82);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)et.bqjp("bqnh", bqjm(int ), (int)83);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
lbl95:
            // 2 sources

            case 6: {
                do {
                    var3_3 /* !! */  = (int)et.bqjp("bqni", bqjm(int ), (int)84);
                } while (!var4_2);
                throw null;
            }
lbl100:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)et.bqjp("bqnj", bqjm(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)et.bqjp("bqnk", bqjm(int ), (int)86);
                    if (!var4_2) ** GOTO lbl95
                    throw null;
                }
            }
            case 9: {
                var3_3 /* !! */  = (int)et.bqjp("bqnl", bqjm(int ), (int)87);
                if (var4_2) {
                    throw null;
                }
            }
lbl113:
            // 4 sources

            case 10: {
                do {
                    var3_3 /* !! */  = (int)et.bqjp("bqnm", bqjm(int ), (int)88);
                } while (!var4_2);
                throw null;
            }
lbl118:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)et.bqjp("bqnn", bqjm(int ), (int)89);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)et.bqjp("bqno", bqjm(int ), (int)90);
        ** while (!var4_2)
lbl125:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void brrt() {
        et.bqmd[0] = -5045940929027700836L;
        et.bqmd[1] = 4176563060719257733L;
        et.bqmd[2] = 157820919884654438L;
        et.bqmd[3] = 2991094944080348808L;
        et.bqmd[4] = 4362390109419950622L;
        et.bqmd[5] = -5459791491803811444L;
        et.bqmd[6] = 5183425154642945153L;
        et.bqmd[7] = 6711620345060571278L;
        et.bqmd[8] = 7339291560390606546L;
        et.bqmd[9] = -1727645349563876708L;
        et.bqmd[10] = -8760423678739993033L;
        et.bqmd[11] = 3757926574831114594L;
        et.bqmd[12] = -20870962351141502L;
        et.bqmd[13] = -5643018736907184843L;
        et.bqmd[14] = -3965289005869516922L;
        et.bqmd[15] = 463581157844891061L;
        et.bqmd[16] = -4923834425051014948L;
        et.bqmd[17] = -1910737904708576803L;
        et.bqmd[18] = 6648945909532704085L;
        et.bqmd[19] = 5639083720720614061L;
        et.bqmd[20] = -6030912053628617357L;
        et.bqmd[21] = 6958972797869344982L;
        et.bqmd[22] = 110010470419257726L;
        et.bqmd[23] = 1444216997265952411L;
        et.bqmd[24] = -6508556684890374615L;
        et.bqmd[25] = 6248576622603884548L;
        et.bqmd[26] = -7894130494475298127L;
        et.bqmd[27] = -2688711590119972683L;
        et.bqmd[28] = -8329112780637894901L;
        et.bqmd[29] = 1228021990419789130L;
        et.bqmd[30] = -6912332098491960608L;
        et.bqmd[31] = -8676796371111463751L;
        et.bqmd[32] = 3162566203252260855L;
        et.bqmd[33] = 225936735448313528L;
        et.bqmd[34] = 872089981852973217L;
        et.bqmd[35] = -3199546268969671881L;
        et.bqmd[36] = 6203364088554408202L;
        et.bqmd[37] = 4849589419466567145L;
        et.bqmd[38] = 2791779104307270616L;
        et.bqmd[39] = 3752532417298698433L;
        et.bqmd[40] = -4256262210635281785L;
        et.bqmd[41] = -2524004006519118655L;
        et.bqmd[42] = -6861685229657802734L;
        et.bqmd[43] = 3679903691066467965L;
        et.bqmd[44] = -5920428317314508841L;
        et.bqmd[45] = -8677923795481049157L;
        et.bqmd[46] = -2846834285168286703L;
        et.bqmd[47] = 3858354244082927349L;
        et.bqmd[48] = 4827099856241123559L;
        et.bqmd[49] = 7543556570276137826L;
        et.bqmd[50] = -4267384551820910569L;
        et.bqmd[51] = -292445175209962563L;
        et.bqmd[52] = -3551211451188136886L;
        et.bqmd[53] = 3341706295531347324L;
        et.bqmd[54] = 7920677759405752777L;
        et.bqmd[55] = -144350812127356634L;
        et.bqmd[56] = 5494940840925311483L;
        et.bqmd[57] = -168835264845802358L;
        et.bqmd[58] = 2080743943991464405L;
        et.bqmd[59] = -3759568412704926856L;
        et.bqmd[60] = -2607920722087695396L;
        et.bqmd[61] = -478120013558696830L;
        et.bqmd[62] = 120834551896583664L;
        et.bqmd[63] = -1942631648883031162L;
        et.bqmd[64] = -3095702960782486628L;
        et.bqmd[65] = -5934408327294103679L;
        et.bqmd[66] = -8868144484033595388L;
        et.bqmd[67] = 5840565184230710431L;
        et.bqmd[68] = 7068297030080905376L;
        et.bqmd[69] = 4940351361366196814L;
        et.bqmd[70] = -8605690766469250144L;
        et.bqmd[71] = 5151773082196266650L;
        et.bqmd[72] = -4062767476561799654L;
        et.bqmd[73] = 8371717750435920342L;
        et.bqmd[74] = -4347451609064008503L;
        et.bqmd[75] = -4804007143167003917L;
        et.bqmd[76] = 247321087445463519L;
        et.bqmd[77] = 6760284711831734662L;
        et.bqmd[78] = 1169908330272264535L;
        et.bqmd[79] = -2248636745850979169L;
        et.bqmd[80] = -3955957280814416858L;
        et.bqmd[81] = 2792075876914701655L;
        et.bqmd[82] = -1441372176875946637L;
        et.bqmd[83] = -964954104894172000L;
        et.bqmd[84] = 1078641065226844830L;
        et.bqmd[85] = 4454155406023318891L;
        et.bqmd[86] = -6402718908699163007L;
        et.bqmd[87] = -7911041744745854455L;
        et.bqmd[88] = -2255449440455346578L;
        et.bqmd[89] = 4242443396863190842L;
        et.bqmd[90] = -1621226453733557972L;
        et.bqmd[91] = -6651697276222248491L;
        et.bqmd[92] = -9103871756684470013L;
        et.bqmd[93] = -4488128813454482324L;
        et.bqmd[94] = 1919058002286746827L;
        et.bqmd[95] = 1839841242055624240L;
        et.bqmd[96] = -2544440599478751294L;
        et.bqmd[97] = 2010933250534539455L;
        et.bqmd[98] = -8672596506700782694L;
        et.bqmd[99] = -2653649947333200424L;
    }
}

