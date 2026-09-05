/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1713
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.IntFunction;
import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import ruhack.phobia.io$SwapSettingsProvider;
import ruhack.phobia.it$FireworkPhase;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public class io {
    private boolean fromInventory;
    private static long[] ivi;
    public static final boolean c;
    private static int[] ivb;
    private static long[] ivh;
    private static int[] iva;
    private it$FireworkPhase phase;
    private final nx movement;
    public static final int b;
    private static final long ak = -9047639124296920208L;
    private int slot;
    public static final boolean a;
    private static final class_310 mc;
    private long phaseStartTime;
    private int currentDelay;
    private final io$SwapSettingsProvider settingsProvider;
    private int savedSlot;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPhase(it$FireworkPhase var1_1) {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - io.ivc("kfw", ivg(int ), (int)201));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 95351562: {
                    v1 = io.ivc("kfx", ivg(int ), (int)202);
                    continue block18;
                }
                case 491926358: {
                    v1 = io.ivc("kfy", ivg(int ), (int)203);
                    continue block18;
                }
                case 609948528: {
                    break block18;
                }
            }
            break;
        }
        var4_2 = io.c;
        v2 /* !! */  = io.ak;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("kfz", ivg(int ), (int)204));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1812629707: {
                    v3 = io.ivc("kga", ivg(int ), (int)205);
                    continue block19;
                }
                case 609948528: {
                    break block19;
                }
                case 1520980784: {
                    v3 = io.ivc("kgb", ivg(int ), (int)206);
                    continue block19;
                }
                case 1635415193: {
                    v3 = io.ivc("kgc", ivg(int ), (int)207);
                    continue block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = io.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("kgd", ivg(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == io.ivc("kge", iuz(int ), (int)565)) break;
            v4 /* !! */  = (long)io.ivc("kgf", iuz(int ), (int)566);
        }
        var2_4 = io.a;
        if (var4_2) {
            throw null;
lbl40:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("kgg", ivg(int ), (int)209)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == io.ivc("kgh", iuz(int ), (int)567)) break;
                    v5 /* !! */  = (long)io.ivc("kgi", iuz(int ), (int)568);
                }
                this.phase = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl55:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)io.ivc("kgj", iuz(int ), (int)569);
                    if (!var4_2) break block11;
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)io.ivc("kgk", iuz(int ), (int)570);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)io.ivc("kgl", iuz(int ), (int)571);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)io.ivc("kgm", iuz(int ), (int)572);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)io.ivc("kgn", iuz(int ), (int)573);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_2596 lambda$processTick$2(ov var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("kgo", ivg(int ), (int)210)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == io.ivc("kgp", iuz(int ), (int)574)) break;
            v0 /* !! */  = (long)io.ivc("kgq", iuz(int ), (int)575);
        }
        var4_2 = io.c;
        v1 /* !! */  = io.ak;
        if (true) ** GOTO lbl11
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - io.ivc("kgr", ivg(int ), (int)211));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1104405067: {
                    v2 = io.ivc("kgs", ivg(int ), (int)212);
                    continue block16;
                }
                case 609948528: {
                    break block16;
                }
                case 2090707902: {
                    v2 = io.ivc("kgt", ivg(int ), (int)213);
                    continue block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = io.b;
        v3 /* !! */  = io.ak;
        if (true) ** GOTO lbl25
        block17: while (true) {
            v3 /* !! */  = (long)(io.ivc("kgv", ivg(int ), (int)215) - io.ivc("kgu", ivg(int ), (int)214));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 609948528: {
                    break block17;
                }
                case 626296247: {
                    continue block17;
                }
            }
            break;
        }
        var2_4 = io.a;
        if (var4_2) {
            throw null;
            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("kgw", ivg(int ), (int)216)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == io.ivc("kgx", iuz(int ), (int)576)) break;
                    v4 /* !! */  = (long)io.ivc("kgy", iuz(int ), (int)577);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("kgz", ivg(int ), (int)217)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == io.ivc("kha", iuz(int ), (int)578)) break;
                    v5 /* !! */  = (long)io.ivc("khb", iuz(int ), (int)579);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = io.ak - io.ivc("khc", ivg(int ), (int)218)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == io.ivc("khd", iuz(int ), (int)580)) break;
                    v6 /* !! */  = (long)io.ivc("khe", iuz(int ), (int)581);
                }
                v7 = var0.getYaw();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = io.ak - io.ivc("khf", ivg(int ), (int)219)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == io.ivc("khg", iuz(int ), (int)582)) break;
                    v8 /* !! */  = (long)io.ivc("khh", iuz(int ), (int)583);
                }
                v9 = var0.getPitch();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = io.ak - io.ivc("khi", ivg(int ), (int)220)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == io.ivc("khj", iuz(int ), (int)584)) break;
                    v10 /* !! */  = (long)io.ivc("khk", iuz(int ), (int)585);
                }
                return new class_2886(class_1268.field_5808, var1_1, v7, v9);
            }
lbl67:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)io.ivc("khl", iuz(int ), (int)586);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)io.ivc("khm", iuz(int ), (int)587);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)io.ivc("khn", iuz(int ), (int)588);
                    if (!var4_2) ** GOTO lbl67
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)io.ivc("kho", iuz(int ), (int)589);
        ** while (!var4_2)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_2596 lambda$useSilent$0(ov var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("kiq", ivg(int ), (int)240)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == io.ivc("kir", iuz(int ), (int)598)) break;
            v0 /* !! */  = (long)io.ivc("kis", iuz(int ), (int)599);
        }
        var4_2 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("kit", ivg(int ), (int)241)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == io.ivc("kiu", iuz(int ), (int)600)) break;
            v1 /* !! */  = (long)io.ivc("kiv", iuz(int ), (int)601);
        }
        var3_3 /* !! */  = io.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("kiw", ivg(int ), (int)242)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == io.ivc("kix", iuz(int ), (int)602)) break;
            v2 /* !! */  = (long)io.ivc("kiy", iuz(int ), (int)603);
        }
        var2_4 = io.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return null;
                }
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = io.ak;
                if (true) ** GOTO lbl31
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - io.ivc("kiz", ivg(int ), (int)243));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -614292698: {
                            v4 = io.ivc("kja", ivg(int ), (int)244);
                            continue block20;
                        }
                        case -46938322: {
                            v4 = io.ivc("kjb", ivg(int ), (int)245);
                            continue block20;
                        }
                        case 609948528: {
                            break block20;
                        }
                    }
                    break;
                }
                v5 /* !! */  = io.ak;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v5 /* !! */  = (long)(v6 - io.ivc("kjc", ivg(int ), (int)246));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1280036653: {
                            v6 = io.ivc("kjd", ivg(int ), (int)247);
                            continue block21;
                        }
                        case -1215932164: {
                            v6 = io.ivc("kje", ivg(int ), (int)248);
                            continue block21;
                        }
                        case 609948528: {
                            break block21;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = io.ak - io.ivc("kjf", ivg(int ), (int)249)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == io.ivc("kjg", iuz(int ), (int)604)) break;
                    v7 /* !! */  = (long)io.ivc("kjh", iuz(int ), (int)605);
                }
                v8 = var0.getYaw();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = io.ak - io.ivc("kji", ivg(int ), (int)250)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == io.ivc("kjj", iuz(int ), (int)606)) break;
                    v9 /* !! */  = (long)io.ivc("kjk", iuz(int ), (int)607);
                }
                v10 = var0.getPitch();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = io.ak - io.ivc("kjl", ivg(int ), (int)251)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == io.ivc("kjm", iuz(int ), (int)608)) break;
                    v11 /* !! */  = (long)io.ivc("kjn", iuz(int ), (int)609);
                }
                return new class_2886(class_1268.field_5808, var1_1, v8, v10);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)io.ivc("kjo", iuz(int ), (int)610);
                } while (!var4_2);
                throw null;
            }
lbl76:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)io.ivc("kjp", iuz(int ), (int)611);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)io.ivc("kjq", iuz(int ), (int)612);
                if (!var4_2) ** GOTO lbl76
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)io.ivc("kjr", iuz(int ), (int)613);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isActive() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - io.ivc("ivw", ivg(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1776180135: {
                    v1 = io.ivc("ivx", ivg(int ), (int)2);
                    continue block25;
                }
                case 609948528: {
                    break block25;
                }
                case 1026466742: {
                    v1 = io.ivc("ivy", ivg(int ), (int)3);
                    continue block25;
                }
                case 1953588679: {
                    v1 = io.ivc("ivz", ivg(int ), (int)4);
                    continue block25;
                }
            }
            break;
        }
        var3_1 = io.c;
        v2 /* !! */  = io.ak;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("iwa", ivg(int ), (int)5));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1536284689: {
                    v3 = io.ivc("iwb", ivg(int ), (int)6);
                    continue block26;
                }
                case -1248699451: {
                    v3 = io.ivc("iwc", ivg(int ), (int)7);
                    continue block26;
                }
                case 609948528: {
                    break block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = io.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("iwd", ivg(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == io.ivc("iwe", iuz(int ), (int)15)) break;
            v4 /* !! */  = (long)io.ivc("iwf", iuz(int ), (int)16);
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl41:
            // 3 sources

            return (boolean)io.ivc("iwg", iuz(int ), (int)17);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl41
                v5 /* !! */  = io.ak;
                if (true) ** GOTO lbl51
                block29: while (true) {
                    v5 /* !! */  = (long)(io.ivc("iwi", ivg(int ), (int)10) - io.ivc("iwh", ivg(int ), (int)9));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -611859446: {
                            continue block29;
                        }
                        case 609948528: {
                            break block29;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("iwj", ivg(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == io.ivc("iwk", iuz(int ), (int)18)) break;
                    v6 /* !! */  = (long)io.ivc("iwl", iuz(int ), (int)19);
                }
                if (this.phase == it$FireworkPhase.IDLE) ** GOTO lbl68
                if (var1_3) ** GOTO lbl41
                v7 = io.ivc("iwm", iuz(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
lbl68:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = io.ivc("iwn", iuz(int ), (int)21);
lbl71:
                // 2 sources

                return (boolean)v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)io.ivc("iwo", iuz(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 1: {
                var2_2 /* !! */  = (int)io.ivc("iwp", iuz(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl82:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)io.ivc("iwq", iuz(int ), (int)24);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl87:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)io.ivc("iwr", iuz(int ), (int)25);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl97
                    break;
                }
            }
lbl93:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)io.ivc("iws", iuz(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
            }
lbl97:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)io.ivc("iwt", iuz(int ), (int)27);
                if (!var3_1) break;
                throw null;
            }
lbl101:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)io.ivc("iwu", iuz(int ), (int)28);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)io.ivc("iwv", iuz(int ), (int)29);
        ** while (!var3_1)
lbl108:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjv() {
        io.iva[300] = 394511251;
        io.iva[301] = 60361878;
        io.iva[302] = -575597152;
        io.iva[303] = -1920937651;
        io.iva[304] = -1733873388;
        io.iva[305] = 385162150;
        io.iva[306] = -929399463;
        io.iva[307] = -1831039506;
        io.iva[308] = 1756954173;
        io.iva[309] = -2059410852;
        io.iva[310] = 1248157352;
        io.iva[311] = -308213084;
        io.iva[312] = -1615651465;
        io.iva[313] = -87252519;
        io.iva[314] = 1035345875;
        io.iva[315] = -899317775;
        io.iva[316] = 2087223280;
        io.iva[317] = 764911874;
        io.iva[318] = 813795657;
        io.iva[319] = 1802188886;
        io.iva[320] = 683224962;
        io.iva[321] = -504141501;
        io.iva[322] = 372330594;
        io.iva[323] = 293649653;
        io.iva[324] = -1284004326;
        io.iva[325] = -454592141;
        io.iva[326] = 1667389221;
        io.iva[327] = -1318989293;
        io.iva[328] = -1822874789;
        io.iva[329] = -1644710173;
        io.iva[330] = -983789857;
        io.iva[331] = 1919364749;
        io.iva[332] = 26483107;
        io.iva[333] = -1480843714;
        io.iva[334] = -1796229487;
        io.iva[335] = 857932720;
        io.iva[336] = 1500319529;
        io.iva[337] = -282822934;
        io.iva[338] = -1755352865;
        io.iva[339] = -1699361053;
        io.iva[340] = -853312726;
        io.iva[341] = 347869543;
        io.iva[342] = -71544880;
        io.iva[343] = 1417217459;
        io.iva[344] = 1572173852;
        io.iva[345] = 1576914872;
        io.iva[346] = 514777831;
        io.iva[347] = -1655468805;
        io.iva[348] = 1661625060;
        io.iva[349] = 520683440;
        io.iva[350] = 93645434;
        io.iva[351] = 283513865;
        io.iva[352] = -1300122540;
        io.iva[353] = -1693726581;
        io.iva[354] = -1289736457;
        io.iva[355] = -688142561;
        io.iva[356] = -1008423442;
        io.iva[357] = 1673539477;
        io.iva[358] = 648651370;
        io.iva[359] = -1047663741;
        io.iva[360] = 495888165;
        io.iva[361] = -89850807;
        io.iva[362] = -1419585523;
        io.iva[363] = 1332696611;
        io.iva[364] = 1997847405;
        io.iva[365] = 434404346;
        io.iva[366] = 2053621500;
        io.iva[367] = -1400327005;
        io.iva[368] = 117403416;
        io.iva[369] = -1282851583;
        io.iva[370] = 1467690988;
        io.iva[371] = -1819269544;
        io.iva[372] = -775584907;
        io.iva[373] = 100566820;
        io.iva[374] = 497700714;
        io.iva[375] = -954951712;
        io.iva[376] = 1427143686;
        io.iva[377] = -433770451;
        io.iva[378] = 1335761134;
        io.iva[379] = 1966455701;
        io.iva[380] = 338215239;
        io.iva[381] = 966974222;
        io.iva[382] = -508664744;
        io.iva[383] = 18484662;
        io.iva[384] = -240095398;
        io.iva[385] = -1767696616;
        io.iva[386] = -624162330;
        io.iva[387] = 543088957;
        io.iva[388] = -470095567;
        io.iva[389] = 993644911;
        io.iva[390] = 985153759;
        io.iva[391] = 1490693604;
        io.iva[392] = -894962729;
        io.iva[393] = -2016508782;
        io.iva[394] = 41634305;
        io.iva[395] = 1613925948;
        io.iva[396] = 1315666338;
        io.iva[397] = -779568192;
        io.iva[398] = 618766895;
        io.iva[399] = -1347311595;
    }

    private static /* synthetic */ void kkh() {
        io.ivh[100] = 2308784120757427209L;
        io.ivh[101] = 920824662836186782L;
        io.ivh[102] = -4841207190263806022L;
        io.ivh[103] = -615466239437096242L;
        io.ivh[104] = -282773244772486871L;
        io.ivh[105] = -7133500352681667119L;
        io.ivh[106] = 5849173892914704130L;
        io.ivh[107] = 5996622775238459479L;
        io.ivh[108] = -8840251342707013987L;
        io.ivh[109] = 8314046572308518646L;
        io.ivh[110] = -2689117724469864261L;
        io.ivh[111] = 9126950806282946719L;
        io.ivh[112] = 5321929095171593199L;
        io.ivh[113] = -1715352465775177758L;
        io.ivh[114] = 408154494617623210L;
        io.ivh[115] = 3279478337090234243L;
        io.ivh[116] = 5980280680174292824L;
        io.ivh[117] = 4023927778624321866L;
        io.ivh[118] = -1867133159782876449L;
        io.ivh[119] = 6235443596727674194L;
        io.ivh[120] = -6534378433245704749L;
        io.ivh[121] = 2221346247982533197L;
        io.ivh[122] = 4433762515948883254L;
        io.ivh[123] = -7244664380320788606L;
        io.ivh[124] = -459033713706704958L;
        io.ivh[125] = -987827908141654381L;
        io.ivh[126] = 5577271477089036746L;
        io.ivh[127] = -8919524548786437698L;
        io.ivh[128] = 4816890555738237906L;
        io.ivh[129] = 1370472803059965004L;
        io.ivh[130] = -8881798899631814521L;
        io.ivh[131] = 4232008870990822804L;
        io.ivh[132] = -6046799997819104664L;
        io.ivh[133] = -7200271016649909820L;
        io.ivh[134] = 436524020762019794L;
        io.ivh[135] = 1145800949408987411L;
        io.ivh[136] = 8855794876019746337L;
        io.ivh[137] = -2051832375042719400L;
        io.ivh[138] = -1782708005328436080L;
        io.ivh[139] = 7278923349541247989L;
        io.ivh[140] = 9078072729600609196L;
        io.ivh[141] = 8306378083161369359L;
        io.ivh[142] = 1769715896024794144L;
        io.ivh[143] = 6503465512371138436L;
        io.ivh[144] = -6675092943086735844L;
        io.ivh[145] = 8008409154464598710L;
        io.ivh[146] = 882032502826139424L;
        io.ivh[147] = -1781003285132472624L;
        io.ivh[148] = 6837412146183212262L;
        io.ivh[149] = -6236094706770240787L;
        io.ivh[150] = -5519294779867217114L;
        io.ivh[151] = -7391204459348122657L;
        io.ivh[152] = -3430068817063049977L;
        io.ivh[153] = 5180312907161923372L;
        io.ivh[154] = 4856462594608546239L;
        io.ivh[155] = 3194466041963599744L;
        io.ivh[156] = -6642673340783633499L;
        io.ivh[157] = -9144317937911863733L;
        io.ivh[158] = 6391246520920715962L;
        io.ivh[159] = -5399855687447453316L;
        io.ivh[160] = 6108014505991398886L;
        io.ivh[161] = -2792950693293072635L;
        io.ivh[162] = 906895005275857931L;
        io.ivh[163] = 841407932512779225L;
        io.ivh[164] = 9078159913500007649L;
        io.ivh[165] = 1565573252970249739L;
        io.ivh[166] = 207774550869503257L;
        io.ivh[167] = 3333296548391881077L;
        io.ivh[168] = -2633517321196287737L;
        io.ivh[169] = 7871803615835086152L;
        io.ivh[170] = -8953928592240449108L;
        io.ivh[171] = 6580107930549314157L;
        io.ivh[172] = 540689280394500041L;
        io.ivh[173] = 6627653749154677823L;
        io.ivh[174] = -9200357462607497682L;
        io.ivh[175] = 5403508360490880015L;
        io.ivh[176] = 5559813849586133058L;
        io.ivh[177] = -6221810982096486018L;
        io.ivh[178] = 2570658640427284806L;
        io.ivh[179] = -8609939635819946104L;
        io.ivh[180] = -4522128582691227117L;
        io.ivh[181] = -646151292731513036L;
        io.ivh[182] = 7512318290042924363L;
        io.ivh[183] = -8531182730092516646L;
        io.ivh[184] = -5430634200942338451L;
        io.ivh[185] = 1504792007371024462L;
        io.ivh[186] = -6588049529359356340L;
        io.ivh[187] = 9034812524561045373L;
        io.ivh[188] = 7847148992956685545L;
        io.ivh[189] = 3235224165169287520L;
        io.ivh[190] = -8397271029588128647L;
        io.ivh[191] = -8908756076438983300L;
        io.ivh[192] = 118467613667680009L;
        io.ivh[193] = -9123198827169108271L;
        io.ivh[194] = 7333310231020874091L;
        io.ivh[195] = 2132817826413062835L;
        io.ivh[196] = 7905201404961176154L;
        io.ivh[197] = 8769517633059253396L;
        io.ivh[198] = 8942502308775151482L;
        io.ivh[199] = 254696854784947498L;
    }

    private static /* synthetic */ long ivg(int n2) {
        return ivh[n2] ^ ivi[n2];
    }

    private static /* synthetic */ void kjt() {
        io.iva[100] = 298558751;
        io.iva[101] = 1826005199;
        io.iva[102] = 1004941935;
        io.iva[103] = 1552791838;
        io.iva[104] = -782034446;
        io.iva[105] = -290727122;
        io.iva[106] = -1547545168;
        io.iva[107] = -1731340377;
        io.iva[108] = 2078720794;
        io.iva[109] = 184798712;
        io.iva[110] = 661409648;
        io.iva[111] = -65852049;
        io.iva[112] = -1948548437;
        io.iva[113] = 194187285;
        io.iva[114] = 122287387;
        io.iva[115] = -1611598833;
        io.iva[116] = 413621697;
        io.iva[117] = -1088347674;
        io.iva[118] = 733567106;
        io.iva[119] = -1630961872;
        io.iva[120] = -1916055291;
        io.iva[121] = -1487809987;
        io.iva[122] = 999030824;
        io.iva[123] = -2050458285;
        io.iva[124] = -1959597307;
        io.iva[125] = 1057267489;
        io.iva[126] = 473116533;
        io.iva[127] = 1229115163;
        io.iva[128] = 27710752;
        io.iva[129] = 1300722797;
        io.iva[130] = 832098286;
        io.iva[131] = 360088972;
        io.iva[132] = 593101134;
        io.iva[133] = 1993108284;
        io.iva[134] = -549073566;
        io.iva[135] = 463293997;
        io.iva[136] = 466644187;
        io.iva[137] = 430469741;
        io.iva[138] = 87031582;
        io.iva[139] = 295947579;
        io.iva[140] = 47820927;
        io.iva[141] = -48562556;
        io.iva[142] = -1248400866;
        io.iva[143] = -822301003;
        io.iva[144] = -1018638764;
        io.iva[145] = -1694684753;
        io.iva[146] = -526274;
        io.iva[147] = -617714228;
        io.iva[148] = 179696612;
        io.iva[149] = 648964029;
        io.iva[150] = -864934829;
        io.iva[151] = -2048668124;
        io.iva[152] = 310115454;
        io.iva[153] = -1398300612;
        io.iva[154] = 1067025470;
        io.iva[155] = -886581904;
        io.iva[156] = -2022156247;
        io.iva[157] = -960732889;
        io.iva[158] = -55157065;
        io.iva[159] = -1674733700;
        io.iva[160] = -1959418369;
        io.iva[161] = -1713435283;
        io.iva[162] = -1224271201;
        io.iva[163] = 796653047;
        io.iva[164] = 1366546531;
        io.iva[165] = 1750777450;
        io.iva[166] = 320338570;
        io.iva[167] = -1735476092;
        io.iva[168] = 344039224;
        io.iva[169] = -1726267611;
        io.iva[170] = -1610550276;
        io.iva[171] = -104733643;
        io.iva[172] = -1040665520;
        io.iva[173] = -414712793;
        io.iva[174] = 2118437281;
        io.iva[175] = 2093591261;
        io.iva[176] = -1797645865;
        io.iva[177] = 91628883;
        io.iva[178] = 1334954733;
        io.iva[179] = -1980861470;
        io.iva[180] = -1623692655;
        io.iva[181] = -1060164257;
        io.iva[182] = 2134692901;
        io.iva[183] = -453128902;
        io.iva[184] = 640822234;
        io.iva[185] = 1469716818;
        io.iva[186] = -2103499007;
        io.iva[187] = 305437160;
        io.iva[188] = 1046407304;
        io.iva[189] = 1752432642;
        io.iva[190] = 2087013740;
        io.iva[191] = 1256621907;
        io.iva[192] = -1618318984;
        io.iva[193] = 319978938;
        io.iva[194] = -1811121099;
        io.iva[195] = -1085984612;
        io.iva[196] = -394617087;
        io.iva[197] = 1339236426;
        io.iva[198] = 615458976;
        io.iva[199] = 1810601034;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public io(io$SwapSettingsProvider var1_1) {
        var3_2 /* !! */  = io.b;
        super();
        this.movement = new nx();
        this.phase = it$FireworkPhase.IDLE;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.slot = (int)io.ivc("ivd", iuz(int ), (int)0);
                this.savedSlot = (int)io.ivc("ive", iuz(int ), (int)1);
                this.fromInventory = io.ivc("ivf", iuz(int ), (int)2);
                this.phaseStartTime = (long)io.ivc("ivj", ivg(int ), (int)0);
                this.currentDelay = (int)io.ivc("ivk", iuz(int ), (int)3);
                this.settingsProvider = var1_1;
                return;
            }
lbl15:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)io.ivc("ivl", iuz(int ), (int)4);
                ** GOTO lbl32
            }
lbl18:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)io.ivc("ivm", iuz(int ), (int)5);
            }
lbl20:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)io.ivc("ivn", iuz(int ), (int)6);
                ** GOTO lbl32
            }
            case 3: {
                var3_2 /* !! */  = (int)io.ivc("ivo", iuz(int ), (int)7);
                ** GOTO lbl15
            }
            case 4: {
                var3_2 /* !! */  = (int)io.ivc("ivp", iuz(int ), (int)8);
                ** GOTO lbl18
            }
            case 5: {
                var3_2 /* !! */  = (int)io.ivc("ivq", iuz(int ), (int)9);
                ** GOTO lbl20
            }
lbl32:
            // 4 sources

            case 6: {
                while (true) {
                    var3_2 /* !! */  = (int)io.ivc("ivr", iuz(int ), (int)10);
                }
            }
            case 7: {
                var3_2 /* !! */  = (int)io.ivc("ivs", iuz(int ), (int)11);
                ** GOTO lbl32
            }
            case 8: {
                var3_2 /* !! */  = (int)io.ivc("ivt", iuz(int ), (int)12);
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)io.ivc("ivu", iuz(int ), (int)13);
                    ** GOTO lbl15
                    break;
                }
            }
            case 10: 
        }
        var3_2 /* !! */  = (int)io.ivc("ivv", iuz(int ), (int)14);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getCurrentDelay() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("ken", ivg(int ), (int)181)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == io.ivc("keo", iuz(int ), (int)550)) break;
            v0 /* !! */  = (long)io.ivc("kep", iuz(int ), (int)551);
        }
        var3_1 = io.c;
        v1 /* !! */  = io.ak;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - io.ivc("keq", ivg(int ), (int)182));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1706610928: {
                    v2 = io.ivc("ker", ivg(int ), (int)183);
                    continue block18;
                }
                case -1340853901: {
                    v2 = io.ivc("kes", ivg(int ), (int)184);
                    continue block18;
                }
                case 609948528: {
                    break block18;
                }
                case 1120840788: {
                    v2 = io.ivc("ket", ivg(int ), (int)185);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = io.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("keu", ivg(int ), (int)186)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == io.ivc("kev", iuz(int ), (int)552)) break;
                    v3 /* !! */  = (long)io.ivc("kew", iuz(int ), (int)553);
                }
                var1_3 = io.a;
                if (var3_1) {
                    throw null;
                    return (int)io.ivc("kex", iuz(int ), (int)554);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = io.ak;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - io.ivc("key", ivg(int ), (int)187));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1667763334: {
                            v5 = io.ivc("kez", ivg(int ), (int)188);
                            continue block21;
                        }
                        case -489704212: {
                            v5 = io.ivc("kfa", ivg(int ), (int)189);
                            continue block21;
                        }
                        case 609948528: {
                            break block21;
                        }
                    }
                    break;
                }
                return this.currentDelay;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)io.ivc("kfb", iuz(int ), (int)555);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)io.ivc("kfc", iuz(int ), (int)556);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)io.ivc("kfd", iuz(int ), (int)557);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)io.ivc("kfe", iuz(int ), (int)558);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjz() {
        io.ivb[0] = -2006180012;
        io.ivb[1] = 1007694939;
        io.ivb[2] = -1273548146;
        io.ivb[3] = 397210775;
        io.ivb[4] = -36002398;
        io.ivb[5] = 1337651411;
        io.ivb[6] = -1680953679;
        io.ivb[7] = 1572501463;
        io.ivb[8] = 1847646167;
        io.ivb[9] = -1529149106;
        io.ivb[10] = -1977698108;
        io.ivb[11] = 978037137;
        io.ivb[12] = -854816664;
        io.ivb[13] = 401148439;
        io.ivb[14] = -635311335;
        io.ivb[15] = -1211211026;
        io.ivb[16] = -87312880;
        io.ivb[17] = 1540151888;
        io.ivb[18] = -781081011;
        io.ivb[19] = -541942425;
        io.ivb[20] = 1579613397;
        io.ivb[21] = -1010978519;
        io.ivb[22] = 846886512;
        io.ivb[23] = -585743680;
        io.ivb[24] = 1208718298;
        io.ivb[25] = -463115098;
        io.ivb[26] = -1237540334;
        io.ivb[27] = 1107771261;
        io.ivb[28] = 1180425597;
        io.ivb[29] = -1824405824;
        io.ivb[30] = -2088877044;
        io.ivb[31] = 1021889492;
        io.ivb[32] = -227371634;
        io.ivb[33] = 176010846;
        io.ivb[34] = -1676961419;
        io.ivb[35] = 1359849479;
        io.ivb[36] = -967276945;
        io.ivb[37] = -27178248;
        io.ivb[38] = -1034113568;
        io.ivb[39] = 1259607667;
        io.ivb[40] = 961963647;
        io.ivb[41] = 752639248;
        io.ivb[42] = -230704620;
        io.ivb[43] = -1488922980;
        io.ivb[44] = 788900865;
        io.ivb[45] = -190945016;
        io.ivb[46] = 1740182452;
        io.ivb[47] = 1909306335;
        io.ivb[48] = -1454580021;
        io.ivb[49] = -633865476;
        io.ivb[50] = 1900038101;
        io.ivb[51] = 1202892021;
        io.ivb[52] = 1652501013;
        io.ivb[53] = 1950702536;
        io.ivb[54] = 1316341695;
        io.ivb[55] = -1064248;
        io.ivb[56] = -1667799183;
        io.ivb[57] = 1683583726;
        io.ivb[58] = 692580102;
        io.ivb[59] = -164198674;
        io.ivb[60] = 455369976;
        io.ivb[61] = -677748035;
        io.ivb[62] = -1239820581;
        io.ivb[63] = -960524685;
        io.ivb[64] = -1493771579;
        io.ivb[65] = -1052163410;
        io.ivb[66] = -1657566561;
        io.ivb[67] = -759313189;
        io.ivb[68] = 1991558055;
        io.ivb[69] = -1591698416;
        io.ivb[70] = -198676040;
        io.ivb[71] = 1534991206;
        io.ivb[72] = -1182986991;
        io.ivb[73] = 1745587432;
        io.ivb[74] = 190448296;
        io.ivb[75] = -564039531;
        io.ivb[76] = 872534613;
        io.ivb[77] = -1720601326;
        io.ivb[78] = -1484123301;
        io.ivb[79] = -238777363;
        io.ivb[80] = -1003579631;
        io.ivb[81] = 745689515;
        io.ivb[82] = -86943041;
        io.ivb[83] = -1966073350;
        io.ivb[84] = -959236887;
        io.ivb[85] = -1591006542;
        io.ivb[86] = -1199310950;
        io.ivb[87] = -363293546;
        io.ivb[88] = -853315466;
        io.ivb[89] = -791791892;
        io.ivb[90] = -304672617;
        io.ivb[91] = -1817877654;
        io.ivb[92] = 140929405;
        io.ivb[93] = -300738039;
        io.ivb[94] = -1430789727;
        io.ivb[95] = -2023030603;
        io.ivb[96] = 3168867;
        io.ivb[97] = 348119300;
        io.ivb[98] = 1551223411;
        io.ivb[99] = 1874601548;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSlot() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(io.ivc("jzp", ivg(int ), (int)148) - io.ivc("jzn", ivg(int ), (int)147));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1065092764: {
                    continue block16;
                }
                case 609948528: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("jzr", ivg(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == io.ivc("jzt", iuz(int ), (int)515)) break;
            v1 /* !! */  = (long)io.ivc("jzv", iuz(int ), (int)516);
        }
        var2_2 /* !! */  = io.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("jzx", ivg(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == io.ivc("jzz", iuz(int ), (int)517)) break;
            v2 /* !! */  = (long)io.ivc("kaa", iuz(int ), (int)518);
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (int)io.ivc("kab", iuz(int ), (int)519);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = io.ak;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - io.ivc("kae", ivg(int ), (int)151));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1974340998: {
                            v4 = io.ivc("kag", ivg(int ), (int)152);
                            continue block20;
                        }
                        case -1394059381: {
                            v4 = io.ivc("kai", ivg(int ), (int)153);
                            continue block20;
                        }
                        case 609948528: {
                            break block20;
                        }
                        case 1701065817: {
                            v4 = io.ivc("kak", ivg(int ), (int)154);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.slot;
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)io.ivc("kam", iuz(int ), (int)520);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                var2_2 /* !! */  = (int)io.ivc("kao", iuz(int ), (int)521);
                if (var3_1) {
                    throw null;
                }
            }
lbl60:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)io.ivc("kaq", iuz(int ), (int)522);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)io.ivc("kas", iuz(int ), (int)523);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkb() {
        io.ivb[200] = -2110648372;
        io.ivb[201] = 1711738710;
        io.ivb[202] = 723043702;
        io.ivb[203] = 2096676911;
        io.ivb[204] = -152444687;
        io.ivb[205] = 1645901007;
        io.ivb[206] = -836510944;
        io.ivb[207] = 1338955644;
        io.ivb[208] = 823905090;
        io.ivb[209] = -525637190;
        io.ivb[210] = -1394282708;
        io.ivb[211] = 1043978042;
        io.ivb[212] = -1817865758;
        io.ivb[213] = -627283146;
        io.ivb[214] = -1353191688;
        io.ivb[215] = -1139557153;
        io.ivb[216] = -359346661;
        io.ivb[217] = 74095549;
        io.ivb[218] = 1064112557;
        io.ivb[219] = 431092537;
        io.ivb[220] = -1648155539;
        io.ivb[221] = -120564567;
        io.ivb[222] = 481125740;
        io.ivb[223] = -1144903279;
        io.ivb[224] = 1884829416;
        io.ivb[225] = -1069495302;
        io.ivb[226] = -344032314;
        io.ivb[227] = 2063268109;
        io.ivb[228] = 600303805;
        io.ivb[229] = 1280430678;
        io.ivb[230] = 1703930226;
        io.ivb[231] = 1969683542;
        io.ivb[232] = 255379218;
        io.ivb[233] = 1811213648;
        io.ivb[234] = -764113607;
        io.ivb[235] = 509033849;
        io.ivb[236] = -1096307946;
        io.ivb[237] = 1404129772;
        io.ivb[238] = -1995124172;
        io.ivb[239] = 594812434;
        io.ivb[240] = -455415466;
        io.ivb[241] = -1742437534;
        io.ivb[242] = 2076598586;
        io.ivb[243] = -1959649881;
        io.ivb[244] = -645356978;
        io.ivb[245] = -249062878;
        io.ivb[246] = -1129777773;
        io.ivb[247] = -1520295343;
        io.ivb[248] = -684128191;
        io.ivb[249] = 357791512;
        io.ivb[250] = -173061904;
        io.ivb[251] = 1206593440;
        io.ivb[252] = -1683575220;
        io.ivb[253] = -931240143;
        io.ivb[254] = -1430893921;
        io.ivb[255] = -902465600;
        io.ivb[256] = -1360251720;
        io.ivb[257] = -395183332;
        io.ivb[258] = -478407174;
        io.ivb[259] = 263049943;
        io.ivb[260] = -1158682992;
        io.ivb[261] = -239069355;
        io.ivb[262] = 1651203104;
        io.ivb[263] = 659105969;
        io.ivb[264] = 712186995;
        io.ivb[265] = 2139783262;
        io.ivb[266] = -1689832217;
        io.ivb[267] = -380122977;
        io.ivb[268] = -147556181;
        io.ivb[269] = -1937742001;
        io.ivb[270] = 755927824;
        io.ivb[271] = 142683035;
        io.ivb[272] = -1376694147;
        io.ivb[273] = 1569307281;
        io.ivb[274] = 606967740;
        io.ivb[275] = 481279152;
        io.ivb[276] = 1594087106;
        io.ivb[277] = -1479524634;
        io.ivb[278] = -528015073;
        io.ivb[279] = -918142056;
        io.ivb[280] = 1746983862;
        io.ivb[281] = -1605192533;
        io.ivb[282] = 1028026483;
        io.ivb[283] = -1452354138;
        io.ivb[284] = -930007537;
        io.ivb[285] = -1557230239;
        io.ivb[286] = -771345618;
        io.ivb[287] = -1343393562;
        io.ivb[288] = 1651517777;
        io.ivb[289] = 949024105;
        io.ivb[290] = -1796752522;
        io.ivb[291] = 299804034;
        io.ivb[292] = 439967072;
        io.ivb[293] = -1526188530;
        io.ivb[294] = 1056527316;
        io.ivb[295] = 929886567;
        io.ivb[296] = -142197930;
        io.ivb[297] = 1727706057;
        io.ivb[298] = -16672216;
        io.ivb[299] = 17674791;
    }

    private static /* synthetic */ int iuz(int n2) {
        return iva[n2] ^ ivb[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void processLoop() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(io.ivc("jdd", ivg(int ), (int)24) - io.ivc("jdc", ivg(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 609948528: {
                    break block27;
                }
                case 1100359523: {
                    continue block27;
                }
            }
            break;
        }
        var5_1 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("jde", ivg(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == io.ivc("jdf", iuz(int ), (int)149)) break;
            v1 /* !! */  = (long)io.ivc("jdg", iuz(int ), (int)150);
        }
        var4_2 /* !! */  = io.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("jdh", ivg(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == io.ivc("jdi", iuz(int ), (int)151)) break;
            v2 /* !! */  = (long)io.ivc("jdj", iuz(int ), (int)152);
        }
        var3_3 = io.a;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_1) {
                    throw null;
lbl30:
                    // 11 sources

                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("jdk", ivg(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == io.ivc("jdl", iuz(int ), (int)153)) break;
                    v3 /* !! */  = (long)io.ivc("jdm", iuz(int ), (int)154);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = io.ak - io.ivc("jdn", ivg(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == io.ivc("jdo", iuz(int ), (int)155)) break;
                    v4 /* !! */  = (long)io.ivc("jdp", iuz(int ), (int)156);
                }
                if (this.phase != it$FireworkPhase.IDLE) ** GOTO lbl48
                if (var3_3) ** GOTO lbl30
                return;
lbl48:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl30
                var1_4 /* !! */  = io.ivc("jdq", iuz(int ), (int)157);
                if (var3_3 || var3_3) ** GOTO lbl30
                var2_5 = io.ivc("jdr", iuz(int ), (int)158);
                if (var3_3) ** GOTO lbl30
                do {
                    if (var3_3 || var3_3) ** GOTO lbl30
                    if (var1_4 /* !! */  == false) ** GOTO lbl71
                    if (var3_3) ** GOTO lbl30
                    if (var2_5 >= io.ivc("jds", iuz(int ), (int)159)) ** GOTO lbl71
                    if (var3_3 || var3_3) ** GOTO lbl30
                    ++var2_5;
                    if (var3_3 || var3_3) ** GOTO lbl30
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_4 = io.ak - io.ivc("jdt", ivg(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == io.ivc("jdu", iuz(int ), (int)160)) break;
                        v5 /* !! */  = (long)io.ivc("jdv", iuz(int ), (int)161);
                    }
                    var1_4 /* !! */  = (CallSite)this.processTick();
                    if (var3_3) ** GOTO lbl30
                } while (!var5_1);
                throw null;
lbl71:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)io.ivc("jdw", iuz(int ), (int)162);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 1: {
                var4_2 /* !! */  = (int)io.ivc("jdx", iuz(int ), (int)163);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 2: {
                var4_2 /* !! */  = (int)io.ivc("jdy", iuz(int ), (int)164);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl89:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)io.ivc("jdz", iuz(int ), (int)165);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl94:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)io.ivc("jea", iuz(int ), (int)166);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl99:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)io.ivc("jeb", iuz(int ), (int)167);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl104:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)io.ivc("jec", iuz(int ), (int)168);
                if (var5_1) {
                    throw null;
                }
            }
            case 7: {
                var4_2 /* !! */  = (int)io.ivc("jed", iuz(int ), (int)169);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl113:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)io.ivc("jee", iuz(int ), (int)170);
                if (!var5_1) ** GOTO lbl99
                throw null;
            }
lbl117:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)io.ivc("jef", iuz(int ), (int)171);
                if (!var5_1) ** GOTO lbl89
                throw null;
            }
lbl121:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)io.ivc("jeg", iuz(int ), (int)172);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl126:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)io.ivc("jeh", iuz(int ), (int)173);
                if (!var5_1) ** GOTO lbl113
                throw null;
            }
lbl130:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)io.ivc("jei", iuz(int ), (int)174);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl135:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)io.ivc("jej", iuz(int ), (int)175);
                if (!var5_1) ** GOTO lbl130
                throw null;
            }
lbl139:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)io.ivc("jek", iuz(int ), (int)176);
                if (!var5_1) ** GOTO lbl126
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)io.ivc("jel", iuz(int ), (int)177);
                if (!var5_1) ** GOTO lbl104
                throw null;
            }
lbl147:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)io.ivc("jem", iuz(int ), (int)178);
                if (!var5_1) ** GOTO lbl117
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)io.ivc("jen", iuz(int ), (int)179);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
lbl155:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)io.ivc("jeo", iuz(int ), (int)180);
                if (var5_1) {
                    throw null;
                }
            }
lbl159:
            // 5 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_2 /* !! */  = (int)io.ivc("jep", iuz(int ), (int)181);
                    if (!var5_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 20: 
        }
        var4_2 /* !! */  = (int)io.ivc("jeq", iuz(int ), (int)182);
        ** while (!var5_1)
lbl167:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public it$FireworkPhase getPhase() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("jym", ivg(int ), (int)140)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == io.ivc("jyn", iuz(int ), (int)505)) break;
            v0 /* !! */  = (long)io.ivc("jyo", iuz(int ), (int)506);
        }
        var3_1 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("jyp", ivg(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == io.ivc("jyq", iuz(int ), (int)507)) break;
            v1 /* !! */  = (long)io.ivc("jyr", iuz(int ), (int)508);
        }
        var2_2 /* !! */  = io.b;
        v2 /* !! */  = io.ak;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("jys", ivg(int ), (int)142));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1990587451: {
                    v3 = io.ivc("jyt", ivg(int ), (int)143);
                    continue block14;
                }
                case -312692176: {
                    v3 = io.ivc("jyu", ivg(int ), (int)144);
                    continue block14;
                }
                case 73057957: {
                    v3 = io.ivc("jyv", ivg(int ), (int)145);
                    continue block14;
                }
                case 609948528: {
                    break block14;
                }
            }
            break;
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("jyw", ivg(int ), (int)146)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == io.ivc("jyy", iuz(int ), (int)509)) break;
                    v4 /* !! */  = (long)io.ivc("jza", iuz(int ), (int)510);
                }
                return this.phase;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)io.ivc("jzc", iuz(int ), (int)511);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)io.ivc("jze", iuz(int ), (int)512);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)io.ivc("jzh", iuz(int ), (int)513);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)io.ivc("jzj", iuz(int ), (int)514);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public io$SwapSettingsProvider getSettingsProvider() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - io.ivc("kff", ivg(int ), (int)190));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1738740792: {
                    v1 = io.ivc("kfg", ivg(int ), (int)191);
                    continue block22;
                }
                case 609948528: {
                    break block22;
                }
                case 1417708316: {
                    v1 = io.ivc("kfh", ivg(int ), (int)192);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = io.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("kfi", ivg(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == io.ivc("kfj", iuz(int ), (int)559)) break;
            v2 /* !! */  = (long)io.ivc("kfk", iuz(int ), (int)560);
        }
        var2_2 /* !! */  = io.b;
        v3 /* !! */  = io.ak;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - io.ivc("kfl", ivg(int ), (int)194));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1794633206: {
                    v4 = io.ivc("kfm", ivg(int ), (int)195);
                    continue block24;
                }
                case -543511833: {
                    v4 = io.ivc("kfn", ivg(int ), (int)196);
                    continue block24;
                }
                case 90403423: {
                    v4 = io.ivc("kfo", ivg(int ), (int)197);
                    continue block24;
                }
                case 609948528: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = io.ak;
                if (true) ** GOTO lbl52
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - io.ivc("kfp", ivg(int ), (int)198));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -640244843: {
                            v6 = io.ivc("kfq", ivg(int ), (int)199);
                            continue block26;
                        }
                        case 271381169: {
                            v6 = io.ivc("kfr", ivg(int ), (int)200);
                            continue block26;
                        }
                        case 609948528: {
                            break block26;
                        }
                    }
                    break;
                }
                return this.settingsProvider;
            }
            case 0: {
                var2_2 /* !! */  = (int)io.ivc("kfs", iuz(int ), (int)561);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)io.ivc("kft", iuz(int ), (int)562);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)io.ivc("kfu", iuz(int ), (int)563);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)io.ivc("kfv", iuz(int ), (int)564);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public nx getMovement() {
        Object object = ak;
        block14: while (true) {
            switch ((int)object) {
                case -1126979284: {
                    object = io.ivc("jxy", ivg(int ), (int)132) - io.ivc("jxx", ivg(int ), (int)131);
                    continue block14;
                }
                case 609948528: {
                    break block14;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = ak;
        boolean bl3 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - io.ivc("jxz", ivg(int ), (int)133);
            }
            switch ((int)object2) {
                case -1172824350: {
                    callSite = io.ivc("jya", ivg(int ), (int)134);
                    continue block15;
                }
                case 261343314: {
                    callSite = io.ivc("jyb", ivg(int ), (int)135);
                    continue block15;
                }
                case 609948528: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ak;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - io.ivc("jyc", ivg(int ), (int)136);
            }
            switch ((int)object3) {
                case -470963076: {
                    callSite = io.ivc("jyd", ivg(int ), (int)137);
                    continue block16;
                }
                case 609948528: {
                    break block16;
                }
                case 1937304736: {
                    callSite = io.ivc("jye", ivg(int ), (int)138);
                    continue block16;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl2) {
            throw null;
        }
        if (bl5) return null;
        if (bl5) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = ak - io.ivc("jyf", ivg(int ), (int)139)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == io.ivc("jyg", iuz(int ), (int)499)) {
                return this.movement;
            }
            object4 = io.ivc("jyh", iuz(int ), (int)500);
        }
    }

    private static /* synthetic */ void kki() {
        io.ivh[200] = 2826616799434881136L;
        io.ivh[201] = -7315861201542643881L;
        io.ivh[202] = -4938532525055258074L;
        io.ivh[203] = -431991137702652087L;
        io.ivh[204] = -6470448466304398536L;
        io.ivh[205] = -2689152311839255514L;
        io.ivh[206] = 3332796443709442893L;
        io.ivh[207] = 7984127951733147258L;
        io.ivh[208] = -3692729378564757859L;
        io.ivh[209] = 1282829292606547933L;
        io.ivh[210] = -7329918924658295276L;
        io.ivh[211] = -6874199342490588501L;
        io.ivh[212] = -4264735784998159204L;
        io.ivh[213] = 4790197311862919854L;
        io.ivh[214] = 1325370450941025939L;
        io.ivh[215] = 1150350315884411669L;
        io.ivh[216] = 1985534289834412715L;
        io.ivh[217] = 7961667329021065055L;
        io.ivh[218] = -5525791851117878362L;
        io.ivh[219] = 6380730461288657087L;
        io.ivh[220] = -7354241233538443280L;
        io.ivh[221] = -8562505466579598271L;
        io.ivh[222] = -5847527634568841741L;
        io.ivh[223] = -6484362401193266836L;
        io.ivh[224] = -217845546595703080L;
        io.ivh[225] = -3633499561129789398L;
        io.ivh[226] = -8969236778433652553L;
        io.ivh[227] = 8860655757970027849L;
        io.ivh[228] = 8139198195385035932L;
        io.ivh[229] = 300697375904160684L;
        io.ivh[230] = -9217943744053062040L;
        io.ivh[231] = -4167240962753017853L;
        io.ivh[232] = 5029133477795048295L;
        io.ivh[233] = 8114804620178987635L;
        io.ivh[234] = 3319699529700275273L;
        io.ivh[235] = -8242590519024837412L;
        io.ivh[236] = -7609213448718900070L;
        io.ivh[237] = -8093433054125833152L;
        io.ivh[238] = 7948975835785641179L;
        io.ivh[239] = 9135671120825120422L;
        io.ivh[240] = -289585707616648871L;
        io.ivh[241] = -6651031384982991301L;
        io.ivh[242] = -3045324405054213262L;
        io.ivh[243] = -8559837031226800694L;
        io.ivh[244] = 9219881301223478103L;
        io.ivh[245] = 5154173440302262704L;
        io.ivh[246] = -8632424833704508905L;
        io.ivh[247] = -6790009232587954277L;
        io.ivh[248] = -6217578271594353391L;
        io.ivh[249] = 4266493038447275100L;
        io.ivh[250] = 371833630934018229L;
        io.ivh[251] = -4479867656171833910L;
    }

    private static /* synthetic */ void kju() {
        io.iva[200] = -2110648372;
        io.iva[201] = 1711738710;
        io.iva[202] = 723043703;
        io.iva[203] = 2096676910;
        io.iva[204] = -152444687;
        io.iva[205] = 1645901006;
        io.iva[206] = -836510944;
        io.iva[207] = 1338955644;
        io.iva[208] = 823905090;
        io.iva[209] = -525637140;
        io.iva[210] = -1394282710;
        io.iva[211] = 1043978044;
        io.iva[212] = -1817865866;
        io.iva[213] = -627283188;
        io.iva[214] = -1353191694;
        io.iva[215] = -1139557282;
        io.iva[216] = -359346652;
        io.iva[217] = 74095584;
        io.iva[218] = 1064112559;
        io.iva[219] = 431092519;
        io.iva[220] = -1648155595;
        io.iva[221] = -120564545;
        io.iva[222] = 481125756;
        io.iva[223] = -1144903278;
        io.iva[224] = 1884829380;
        io.iva[225] = -1069495348;
        io.iva[226] = -344032446;
        io.iva[227] = 2063268176;
        io.iva[228] = 600303826;
        io.iva[229] = 1280430804;
        io.iva[230] = 1703930231;
        io.iva[231] = 1969683667;
        io.iva[232] = 255379220;
        io.iva[233] = 1811213632;
        io.iva[234] = -764113493;
        io.iva[235] = 509033737;
        io.iva[236] = -1096307900;
        io.iva[237] = 1404129712;
        io.iva[238] = -1995124133;
        io.iva[239] = 594812534;
        io.iva[240] = -455415511;
        io.iva[241] = -1742437590;
        io.iva[242] = 2076598716;
        io.iva[243] = -1959649912;
        io.iva[244] = -645357032;
        io.iva[245] = -249062745;
        io.iva[246] = -1129777766;
        io.iva[247] = -1520295411;
        io.iva[248] = -684128254;
        io.iva[249] = 357791646;
        io.iva[250] = -173061942;
        io.iva[251] = 1206593489;
        io.iva[252] = -1683575094;
        io.iva[253] = -931240158;
        io.iva[254] = -1430893945;
        io.iva[255] = -902465602;
        io.iva[256] = -1360251653;
        io.iva[257] = -395183354;
        io.iva[258] = -478407242;
        io.iva[259] = 263049862;
        io.iva[260] = -1158682902;
        io.iva[261] = -239069338;
        io.iva[262] = 1651203142;
        io.iva[263] = 659105850;
        io.iva[264] = 712186966;
        io.iva[265] = 2139783198;
        io.iva[266] = -1689832252;
        io.iva[267] = -380122975;
        io.iva[268] = -147556103;
        io.iva[269] = -1937741879;
        io.iva[270] = 755927820;
        io.iva[271] = 142683116;
        io.iva[272] = -1376694246;
        io.iva[273] = 1569307291;
        io.iva[274] = 606967749;
        io.iva[275] = 481279025;
        io.iva[276] = 1594087078;
        io.iva[277] = -1479524610;
        io.iva[278] = -528015083;
        io.iva[279] = -918142068;
        io.iva[280] = 1746983933;
        io.iva[281] = -1605192497;
        io.iva[282] = 1028026426;
        io.iva[283] = -1452354100;
        io.iva[284] = -930007484;
        io.iva[285] = -1557230088;
        io.iva[286] = -771345576;
        io.iva[287] = -1343393551;
        io.iva[288] = 1651517709;
        io.iva[289] = 949024249;
        io.iva[290] = -1796752530;
        io.iva[291] = 299804092;
        io.iva[292] = 439966983;
        io.iva[293] = -1526188517;
        io.iva[294] = 1056527281;
        io.iva[295] = 929886545;
        io.iva[296] = -142197821;
        io.iva[297] = 1727706097;
        io.iva[298] = -16672088;
        io.iva[299] = 17674873;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSavedSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("kau", ivg(int ), (int)155)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == io.ivc("kaw", iuz(int ), (int)524)) break;
            v0 /* !! */  = (long)io.ivc("kaz", iuz(int ), (int)525);
        }
        var3_1 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("kbd", ivg(int ), (int)156)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == io.ivc("kbf", iuz(int ), (int)526)) break;
            v1 /* !! */  = (long)io.ivc("kbh", iuz(int ), (int)527);
        }
        var2_2 /* !! */  = io.b;
        v2 /* !! */  = io.ak;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("kbi", ivg(int ), (int)157));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 609948528: {
                    break block18;
                }
                case 642182188: {
                    v3 = io.ivc("kbk", ivg(int ), (int)158);
                    continue block18;
                }
                case 1031950688: {
                    v3 = io.ivc("kbm", ivg(int ), (int)159);
                    continue block18;
                }
                case 2140040625: {
                    v3 = io.ivc("kbp", ivg(int ), (int)160);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = io.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)io.ivc("kbt", iuz(int ), (int)528);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                v4 /* !! */  = io.ak;
                if (true) ** GOTO lbl43
                block20: while (true) {
                    v4 /* !! */  = (long)(io.ivc("kby", ivg(int ), (int)162) - io.ivc("kbv", ivg(int ), (int)161));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 609948528: {
                            break block20;
                        }
                        case 821825528: {
                            continue block20;
                        }
                    }
                    break;
                }
                return this.savedSlot;
lbl49:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)io.ivc("kca", iuz(int ), (int)529);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)io.ivc("kcd", iuz(int ), (int)530);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)io.ivc("kci", iuz(int ), (int)531);
                    if (!var3_1) ** GOTO lbl49
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)io.ivc("kcl", iuz(int ), (int)532);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private boolean processTick() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 12[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ CallSite ivc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void startPhase(it$FireworkPhase var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("jtj", ivg(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == io.ivc("jtk", iuz(int ), (int)436)) break;
            v0 /* !! */  = (long)io.ivc("jtl", iuz(int ), (int)437);
        }
        var5_3 = io.c;
        while (true) {
            block46: {
                if ((v1 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("jtm", ivg(int ), (int)77)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != io.ivc("jtn", iuz(int ), (int)438)) break block46;
                var4_4 /* !! */  = io.b;
                v2 /* !! */  = io.ak;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)io.ivc("jto", iuz(int ), (int)439);
        }
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("jtp", ivg(int ), (int)78));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 609948528: {
                    break block23;
                }
                case 742772313: {
                    v3 = io.ivc("jtq", ivg(int ), (int)79);
                    continue block23;
                }
                case 1729118612: {
                    v3 = io.ivc("jtr", ivg(int ), (int)80);
                    continue block23;
                }
            }
            break;
        }
        var3_5 = io.a;
        if (var5_3) {
            throw null;
        }
        if (var3_5 || var3_5) return;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = io.ak - io.ivc("jts", ivg(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == io.ivc("jtt", iuz(int ), (int)440)) {
                this.phase = var1_1;
                if (var3_5) return;
                break;
            }
            v4 /* !! */  = (long)io.ivc("jtu", iuz(int ), (int)441);
        }
        if (var3_5) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = io.ak - io.ivc("jtv", ivg(int ), (int)82)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == io.ivc("jtw", iuz(int ), (int)442)) break;
            v5 /* !! */  = (long)io.ivc("jtx", iuz(int ), (int)443);
        }
        v6 = System.currentTimeMillis();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = io.ak - io.ivc("jty", ivg(int ), (int)83)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == io.ivc("jtz", iuz(int ), (int)444)) {
                this.phaseStartTime = v6;
                if (var3_5) return;
                break;
            }
            v7 /* !! */  = (long)io.ivc("jua", iuz(int ), (int)445);
        }
        if (var3_5) return;
        v8 /* !! */  = io.ak;
        block27: while (true) {
            switch ((int)v8 /* !! */ ) {
                case 609948528: {
                    break block27;
                }
                case 1408839963: {
                    v8 /* !! */  = (long)(io.ivc("juc", ivg(int ), (int)85) - io.ivc("jub", ivg(int ), (int)84));
                    continue block27;
                }
            }
            break;
        }
        this.currentDelay = var2_2;
        if (var3_5) return;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block28: while (true) {
            block47: {
                switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var3_5) return;
                        return;
                    }
                    case 0: {
                        var4_4 /* !! */  = (int)io.ivc("jud", iuz(int ), (int)446);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var4_4 /* !! */  = (int)io.ivc("jue", iuz(int ), (int)447);
                        cfr_temp_0 = 8;
                        if (var5_3) {
                            throw null;
                        }
                        break block47;
                    }
                    case 2: {
                        var4_4 /* !! */  = (int)io.ivc("juf", iuz(int ), (int)448);
                        if (!var5_3) ** break;
                        throw null;
                    }
                    case 3: {
                        var4_4 /* !! */  = (int)io.ivc("jug", iuz(int ), (int)449);
                        cfr_temp_0 = 6;
                        if (var5_3) {
                            throw null;
                        }
                        break block47;
                    }
                    case 4: {
                        var4_4 /* !! */  = (int)io.ivc("juh", iuz(int ), (int)450);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_4 /* !! */  = (int)io.ivc("juk", iuz(int ), (int)453);
                        cfr_temp_0 = 6;
                        if (var5_3) {
                            throw null;
                        }
                        break block47;
                    }
                    case 8: {
                        do {
                            var4_4 /* !! */  = (int)io.ivc("jul", iuz(int ), (int)454);
                        } while (!var5_3);
                        throw null;
                    }
                    case 9: {
                        var4_4 /* !! */  = (int)io.ivc("jum", iuz(int ), (int)455);
                        if (var5_3) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 5: lbl-1000:
                    // 2 sources

                    {
                        var4_4 /* !! */  = (int)io.ivc("jui", iuz(int ), (int)451);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl121
            }
            do {
                if (true) continue block28;
lbl121:
                // 2 sources

                var4_4 /* !! */  = (int)io.ivc("juj", iuz(int ), (int)452);
                cfr_temp_0 = 5;
            } while (!var5_3);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void kkd() {
        io.ivb[400] = 1778927129;
        io.ivb[401] = -741024338;
        io.ivb[402] = -1654056073;
        io.ivb[403] = -22823123;
        io.ivb[404] = 869683206;
        io.ivb[405] = 1900452769;
        io.ivb[406] = -768648469;
        io.ivb[407] = -1518903375;
        io.ivb[408] = -125766891;
        io.ivb[409] = -160662173;
        io.ivb[410] = -1967471224;
        io.ivb[411] = 183712393;
        io.ivb[412] = -44906855;
        io.ivb[413] = -214502028;
        io.ivb[414] = 854370050;
        io.ivb[415] = 1143927238;
        io.ivb[416] = 1091096929;
        io.ivb[417] = -1926877999;
        io.ivb[418] = 2040683074;
        io.ivb[419] = 112798373;
        io.ivb[420] = -1432168057;
        io.ivb[421] = 625847738;
        io.ivb[422] = -1273979661;
        io.ivb[423] = -921329316;
        io.ivb[424] = 1778834661;
        io.ivb[425] = 948264761;
        io.ivb[426] = -444688508;
        io.ivb[427] = -1458965817;
        io.ivb[428] = 520897516;
        io.ivb[429] = -1035427486;
        io.ivb[430] = 1381629468;
        io.ivb[431] = 431676487;
        io.ivb[432] = -511251020;
        io.ivb[433] = 280259036;
        io.ivb[434] = -759706422;
        io.ivb[435] = 1166218727;
        io.ivb[436] = -1750592767;
        io.ivb[437] = -2107954497;
        io.ivb[438] = 1110868546;
        io.ivb[439] = 1128002461;
        io.ivb[440] = -76952830;
        io.ivb[441] = -1510747273;
        io.ivb[442] = 1460218944;
        io.ivb[443] = -1866719253;
        io.ivb[444] = 118434178;
        io.ivb[445] = 98749901;
        io.ivb[446] = -1550349131;
        io.ivb[447] = 1835647080;
        io.ivb[448] = 675431547;
        io.ivb[449] = 1622830636;
        io.ivb[450] = -442904281;
        io.ivb[451] = 1067385906;
        io.ivb[452] = -448387068;
        io.ivb[453] = 1934233977;
        io.ivb[454] = 1994328663;
        io.ivb[455] = 1869984462;
        io.ivb[456] = -320312544;
        io.ivb[457] = -732349206;
        io.ivb[458] = -1116835607;
        io.ivb[459] = 137323427;
        io.ivb[460] = 1632021696;
        io.ivb[461] = -1801256990;
        io.ivb[462] = 266362746;
        io.ivb[463] = 791157848;
        io.ivb[464] = -580929175;
        io.ivb[465] = 1782029940;
        io.ivb[466] = 1669711742;
        io.ivb[467] = -1322402716;
        io.ivb[468] = 544466265;
        io.ivb[469] = 134983724;
        io.ivb[470] = -602472932;
        io.ivb[471] = -1438519580;
        io.ivb[472] = -1342046994;
        io.ivb[473] = -1216329033;
        io.ivb[474] = -2143733446;
        io.ivb[475] = 193412219;
        io.ivb[476] = -1635654737;
        io.ivb[477] = -374151091;
        io.ivb[478] = 1747216309;
        io.ivb[479] = -735954949;
        io.ivb[480] = -424726461;
        io.ivb[481] = 190941868;
        io.ivb[482] = -1365944113;
        io.ivb[483] = -1167760971;
        io.ivb[484] = -384106814;
        io.ivb[485] = -1298694856;
        io.ivb[486] = -1724058400;
        io.ivb[487] = -634257530;
        io.ivb[488] = -2040034950;
        io.ivb[489] = 1648266329;
        io.ivb[490] = -1966001582;
        io.ivb[491] = 1760751547;
        io.ivb[492] = -1097482420;
        io.ivb[493] = -1260445348;
        io.ivb[494] = 1978779475;
        io.ivb[495] = 132886028;
        io.ivb[496] = 2122737661;
        io.ivb[497] = 709139207;
        io.ivb[498] = -174706661;
        io.ivb[499] = 1654502533;
    }

    /*
     * Exception decompiling
     */
    private void sendSequencedPacket(IntFunction<class_2596<?>> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 53[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov getRotation() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(io.ivc("jow", ivg(int ), (int)31) - io.ivc("jov", ivg(int ), (int)30));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -147848331: {
                    continue block30;
                }
                case 609948528: {
                    break block30;
                }
            }
            break;
        }
        var4_1 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("jox", ivg(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == io.ivc("joy", iuz(int ), (int)364)) break;
            v1 /* !! */  = (long)io.ivc("joz", iuz(int ), (int)365);
        }
        var3_2 /* !! */  = io.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = io.ak;
                if (true) ** GOTO lbl25
                block32: while (true) {
                    v2 /* !! */  = (long)(io.ivc("jpb", ivg(int ), (int)34) - io.ivc("jpa", ivg(int ), (int)33));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2129424163: {
                            continue block32;
                        }
                        case 609948528: {
                            break block32;
                        }
                    }
                    break;
                }
                var2_3 = io.a;
                if (var4_1) {
                    throw null;
lbl33:
                    // 4 sources

                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl33
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("jpc", ivg(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == io.ivc("jpd", iuz(int ), (int)366)) break;
                    v3 /* !! */  = (long)io.ivc("jpe", iuz(int ), (int)367);
                }
                v4 /* !! */  = io.ak;
                if (true) ** GOTO lbl46
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - io.ivc("jpf", ivg(int ), (int)36));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1883381156: {
                            v5 = io.ivc("jpg", ivg(int ), (int)37);
                            continue block35;
                        }
                        case 311266595: {
                            v5 = io.ivc("jph", ivg(int ), (int)38);
                            continue block35;
                        }
                        case 609948528: {
                            break block35;
                        }
                        case 1187794955: {
                            v5 = io.ivc("jpi", ivg(int ), (int)39);
                            continue block35;
                        }
                    }
                    break;
                }
                var1_4 = ot.INSTANCE.getRotation();
                if (var2_3 || var2_3) ** GOTO lbl33
                if (var1_4 == null) ** GOTO lbl66
                if (var2_3) ** GOTO lbl33
                v6 = var1_4;
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl78
lbl66:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v7 /* !! */  = io.ak;
                if (true) ** GOTO lbl72
                block36: while (true) {
                    v7 /* !! */  = (long)(io.ivc("jpk", ivg(int ), (int)41) - io.ivc("jpj", ivg(int ), (int)40));
lbl72:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1221365478: {
                            continue block36;
                        }
                        case 609948528: {
                            break block36;
                        }
                    }
                    break;
                }
                v6 = ow.cameraAngle();
lbl78:
                // 2 sources

                return v6;
            }
lbl79:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)io.ivc("jpl", iuz(int ), (int)368);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl84:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)io.ivc("jpm", iuz(int ), (int)369);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var3_2 /* !! */  = (int)io.ivc("jpn", iuz(int ), (int)370);
                if (!var4_1) ** GOTO lbl79
                throw null;
            }
            case 3: {
                do {
                    var3_2 /* !! */  = (int)io.ivc("jpo", iuz(int ), (int)371);
                } while (!var4_1);
                throw null;
            }
lbl98:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)io.ivc("jpp", iuz(int ), (int)372);
                if (!var4_1) ** GOTO lbl84
                throw null;
            }
lbl102:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)io.ivc("jpq", iuz(int ), (int)373);
                if (!var4_1) ** GOTO lbl98
                throw null;
            }
lbl106:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)io.ivc("jpr", iuz(int ), (int)374);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 7: {
                var3_2 /* !! */  = (int)io.ivc("jps", iuz(int ), (int)375);
                if (!var4_1) ** GOTO lbl106
                throw null;
            }
lbl115:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)io.ivc("jpt", iuz(int ), (int)376);
                    if (!var4_1) ** GOTO lbl98
                    throw null;
                }
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)io.ivc("jpu", iuz(int ), (int)377);
        ** while (!var4_1)
lbl123:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkf() {
        io.ivb[600] = -1612236449;
        io.ivb[601] = 2028171906;
        io.ivb[602] = 722306955;
        io.ivb[603] = 1129921358;
        io.ivb[604] = -1069983531;
        io.ivb[605] = -281767812;
        io.ivb[606] = -376162640;
        io.ivb[607] = 191336301;
        io.ivb[608] = 242555640;
        io.ivb[609] = -351691960;
        io.ivb[610] = -962146706;
        io.ivb[611] = -1991030825;
        io.ivb[612] = -771231073;
        io.ivb[613] = -1780832992;
    }

    private static /* synthetic */ void kke() {
        io.ivb[500] = 2016870779;
        io.ivb[501] = -515168104;
        io.ivb[502] = -1940773298;
        io.ivb[503] = -121204502;
        io.ivb[504] = -1315682191;
        io.ivb[505] = -2098986598;
        io.ivb[506] = -2058989383;
        io.ivb[507] = -1137396352;
        io.ivb[508] = 19759220;
        io.ivb[509] = 239095181;
        io.ivb[510] = 851604915;
        io.ivb[511] = 1072703195;
        io.ivb[512] = -2050149270;
        io.ivb[513] = -1812199547;
        io.ivb[514] = -1431314231;
        io.ivb[515] = -128640800;
        io.ivb[516] = 949900849;
        io.ivb[517] = -49637339;
        io.ivb[518] = 1260382340;
        io.ivb[519] = 140693972;
        io.ivb[520] = 583370272;
        io.ivb[521] = -1905133563;
        io.ivb[522] = -1682169202;
        io.ivb[523] = 1365763554;
        io.ivb[524] = 772332537;
        io.ivb[525] = -1192056469;
        io.ivb[526] = -1733637998;
        io.ivb[527] = -1560461395;
        io.ivb[528] = 261421530;
        io.ivb[529] = 1303098303;
        io.ivb[530] = -556788095;
        io.ivb[531] = 2140889015;
        io.ivb[532] = -561089436;
        io.ivb[533] = 255254026;
        io.ivb[534] = -926451351;
        io.ivb[535] = 1988249645;
        io.ivb[536] = 1697913217;
        io.ivb[537] = -427605868;
        io.ivb[538] = 2110137894;
        io.ivb[539] = 26195370;
        io.ivb[540] = -1395337163;
        io.ivb[541] = 1561979503;
        io.ivb[542] = -440920483;
        io.ivb[543] = 1736352835;
        io.ivb[544] = -1769074398;
        io.ivb[545] = -168611946;
        io.ivb[546] = 807908598;
        io.ivb[547] = 316832003;
        io.ivb[548] = 1359478551;
        io.ivb[549] = 214917517;
        io.ivb[550] = 1002805410;
        io.ivb[551] = -1637346841;
        io.ivb[552] = -1358985226;
        io.ivb[553] = 1472700706;
        io.ivb[554] = -1679395243;
        io.ivb[555] = -962122962;
        io.ivb[556] = -1544801638;
        io.ivb[557] = -1629892106;
        io.ivb[558] = 199211395;
        io.ivb[559] = -454089224;
        io.ivb[560] = -624009262;
        io.ivb[561] = -488413468;
        io.ivb[562] = 263934775;
        io.ivb[563] = 1937502480;
        io.ivb[564] = 602046396;
        io.ivb[565] = -1519298484;
        io.ivb[566] = 1392382306;
        io.ivb[567] = 1744473877;
        io.ivb[568] = -1883911376;
        io.ivb[569] = -1312153339;
        io.ivb[570] = 751110535;
        io.ivb[571] = 655953197;
        io.ivb[572] = -722356980;
        io.ivb[573] = -178102489;
        io.ivb[574] = -1907811432;
        io.ivb[575] = 475053244;
        io.ivb[576] = -1833248372;
        io.ivb[577] = -1937097341;
        io.ivb[578] = -310277623;
        io.ivb[579] = 667703564;
        io.ivb[580] = 127622522;
        io.ivb[581] = -346965310;
        io.ivb[582] = 860012436;
        io.ivb[583] = -25689604;
        io.ivb[584] = -624567405;
        io.ivb[585] = 630473839;
        io.ivb[586] = 915048708;
        io.ivb[587] = -1815359061;
        io.ivb[588] = 52644137;
        io.ivb[589] = 721152536;
        io.ivb[590] = 1116738739;
        io.ivb[591] = -379264161;
        io.ivb[592] = 650812321;
        io.ivb[593] = 1265935663;
        io.ivb[594] = 69737166;
        io.ivb[595] = 1077431077;
        io.ivb[596] = -1604895228;
        io.ivb[597] = -1802658760;
        io.ivb[598] = 1493795333;
        io.ivb[599] = 1932162782;
    }

    private static /* synthetic */ void kjs() {
        io.iva[0] = 2006180011;
        io.iva[1] = -1007694940;
        io.iva[2] = -1273548146;
        io.iva[3] = 397210775;
        io.iva[4] = -36002399;
        io.iva[5] = 1337651409;
        io.iva[6] = -1680953679;
        io.iva[7] = 1572501456;
        io.iva[8] = 1847646167;
        io.iva[9] = -1529149112;
        io.iva[10] = -1977698105;
        io.iva[11] = 978037147;
        io.iva[12] = -854816670;
        io.iva[13] = 401148436;
        io.iva[14] = -635311335;
        io.iva[15] = 1211211025;
        io.iva[16] = -1411043508;
        io.iva[17] = 1540151889;
        io.iva[18] = 781081010;
        io.iva[19] = -302795279;
        io.iva[20] = 1579613396;
        io.iva[21] = -1010978519;
        io.iva[22] = 846886513;
        io.iva[23] = -585743679;
        io.iva[24] = 1208718299;
        io.iva[25] = -463115100;
        io.iva[26] = -1237540329;
        io.iva[27] = 1107771263;
        io.iva[28] = 1180425598;
        io.iva[29] = -1824405821;
        io.iva[30] = 2088877043;
        io.iva[31] = -1606057138;
        io.iva[32] = -227371633;
        io.iva[33] = -791645456;
        io.iva[34] = 1676961418;
        io.iva[35] = -631149302;
        io.iva[36] = -967276951;
        io.iva[37] = -27178256;
        io.iva[38] = -1034113562;
        io.iva[39] = 1259607671;
        io.iva[40] = 961963645;
        io.iva[41] = 752639251;
        io.iva[42] = -230704624;
        io.iva[43] = -1488922986;
        io.iva[44] = 788900873;
        io.iva[45] = -190945015;
        io.iva[46] = 1740182462;
        io.iva[47] = 1909306334;
        io.iva[48] = -1454580029;
        io.iva[49] = 633865475;
        io.iva[50] = -1900038102;
        io.iva[51] = 1202892003;
        io.iva[52] = 1652501018;
        io.iva[53] = 1950702540;
        io.iva[54] = 1316341686;
        io.iva[55] = -1064238;
        io.iva[56] = -1667799194;
        io.iva[57] = 1683583693;
        io.iva[58] = 692580143;
        io.iva[59] = -164198716;
        io.iva[60] = 455369954;
        io.iva[61] = -677748051;
        io.iva[62] = -1239820554;
        io.iva[63] = -960524698;
        io.iva[64] = -1493771546;
        io.iva[65] = -1052163406;
        io.iva[66] = -1657566591;
        io.iva[67] = -759313216;
        io.iva[68] = 1991558020;
        io.iva[69] = -1591698376;
        io.iva[70] = -198676052;
        io.iva[71] = 1534991226;
        io.iva[72] = -1182986949;
        io.iva[73] = 1745587406;
        io.iva[74] = 190448306;
        io.iva[75] = -564039539;
        io.iva[76] = 872534641;
        io.iva[77] = -1720601343;
        io.iva[78] = -1484123316;
        io.iva[79] = -238777393;
        io.iva[80] = -1003579600;
        io.iva[81] = 745689518;
        io.iva[82] = -86943047;
        io.iva[83] = -1966073369;
        io.iva[84] = -959236882;
        io.iva[85] = -1591006533;
        io.iva[86] = -1199310918;
        io.iva[87] = -363293506;
        io.iva[88] = -853315499;
        io.iva[89] = -791791890;
        io.iva[90] = -304672601;
        io.iva[91] = -1817877648;
        io.iva[92] = 140929374;
        io.iva[93] = -300738002;
        io.iva[94] = -1430789728;
        io.iva[95] = -2023030607;
        io.iva[96] = 3168872;
        io.iva[97] = 348119333;
        io.iva[98] = 1551223404;
        io.iva[99] = 1874601581;
    }

    private static /* synthetic */ void kka() {
        io.ivb[100] = -298558752;
        io.ivb[101] = 1826005199;
        io.ivb[102] = 1004941935;
        io.ivb[103] = -1552791839;
        io.ivb[104] = -782034445;
        io.ivb[105] = -290727122;
        io.ivb[106] = -1547545169;
        io.ivb[107] = -1731340409;
        io.ivb[108] = 2078720789;
        io.ivb[109] = 184798690;
        io.ivb[110] = 661409626;
        io.ivb[111] = -65852043;
        io.ivb[112] = -1948548431;
        io.ivb[113] = 194187274;
        io.ivb[114] = 122287416;
        io.ivb[115] = -1611598839;
        io.ivb[116] = 413621714;
        io.ivb[117] = -1088347706;
        io.ivb[118] = 733567111;
        io.ivb[119] = -1630961904;
        io.ivb[120] = -1916055266;
        io.ivb[121] = -1487810019;
        io.ivb[122] = 999030798;
        io.ivb[123] = -2050458300;
        io.ivb[124] = -1959597310;
        io.ivb[125] = 1057267488;
        io.ivb[126] = 473116531;
        io.ivb[127] = 1229115157;
        io.ivb[128] = 27710766;
        io.ivb[129] = 1300722767;
        io.ivb[130] = 832098249;
        io.ivb[131] = 360089004;
        io.ivb[132] = 593101124;
        io.ivb[133] = 1993108282;
        io.ivb[134] = -549073555;
        io.ivb[135] = 463293996;
        io.ivb[136] = 466644171;
        io.ivb[137] = 430469739;
        io.ivb[138] = 87031569;
        io.ivb[139] = 295947578;
        io.ivb[140] = 47820905;
        io.ivb[141] = -48562557;
        io.ivb[142] = -1248400871;
        io.ivb[143] = -822300993;
        io.ivb[144] = -1018638767;
        io.ivb[145] = -1694684766;
        io.ivb[146] = -526299;
        io.ivb[147] = -617714196;
        io.ivb[148] = 179696633;
        io.ivb[149] = -648964030;
        io.ivb[150] = -1384122961;
        io.ivb[151] = 2048668123;
        io.ivb[152] = 1377038798;
        io.ivb[153] = 1398300611;
        io.ivb[154] = -902684679;
        io.ivb[155] = 886581903;
        io.ivb[156] = -746727102;
        io.ivb[157] = -960732890;
        io.ivb[158] = -55157065;
        io.ivb[159] = -1674733706;
        io.ivb[160] = 1959418368;
        io.ivb[161] = 2025122323;
        io.ivb[162] = -1224271206;
        io.ivb[163] = 796653051;
        io.ivb[164] = 1366546544;
        io.ivb[165] = 1750777449;
        io.ivb[166] = 320338566;
        io.ivb[167] = -1735476085;
        io.ivb[168] = 344039224;
        io.ivb[169] = -1726267608;
        io.ivb[170] = -1610550282;
        io.ivb[171] = -104733642;
        io.ivb[172] = -1040665516;
        io.ivb[173] = -414712786;
        io.ivb[174] = 2118437292;
        io.ivb[175] = 2093591250;
        io.ivb[176] = -1797645860;
        io.ivb[177] = 91628880;
        io.ivb[178] = 1334954730;
        io.ivb[179] = -1980861471;
        io.ivb[180] = -1623692647;
        io.ivb[181] = -1060164263;
        io.ivb[182] = 2134692903;
        io.ivb[183] = -453128902;
        io.ivb[184] = 640822234;
        io.ivb[185] = 1469716818;
        io.ivb[186] = -2103499008;
        io.ivb[187] = 305437161;
        io.ivb[188] = 1046407304;
        io.ivb[189] = 1752432643;
        io.ivb[190] = 2087013740;
        io.ivb[191] = 1256621906;
        io.ivb[192] = -1618318984;
        io.ivb[193] = 319978938;
        io.ivb[194] = -1811121100;
        io.ivb[195] = -1085984612;
        io.ivb[196] = -394617088;
        io.ivb[197] = 1339236426;
        io.ivb[198] = 615458977;
        io.ivb[199] = 1810601035;
    }

    private static /* synthetic */ void kjy() {
        io.iva[600] = 1612236448;
        io.iva[601] = 2048778814;
        io.iva[602] = -722306956;
        io.iva[603] = 1541843537;
        io.iva[604] = 1069983530;
        io.iva[605] = -1028529198;
        io.iva[606] = 376162639;
        io.iva[607] = -2034877824;
        io.iva[608] = -242555641;
        io.iva[609] = 1012596617;
        io.iva[610] = -962146705;
        io.iva[611] = -1991030827;
        io.iva[612] = -771231075;
        io.iva[613] = -1780832990;
    }

    private static /* synthetic */ void kkc() {
        io.ivb[300] = 394511254;
        io.ivb[301] = 60361919;
        io.ivb[302] = -575597092;
        io.ivb[303] = -1920937696;
        io.ivb[304] = -1733873375;
        io.ivb[305] = 385162126;
        io.ivb[306] = -929399460;
        io.ivb[307] = -1831039522;
        io.ivb[308] = 1756954152;
        io.ivb[309] = -2059410872;
        io.ivb[310] = 1248157381;
        io.ivb[311] = -308213059;
        io.ivb[312] = -1615651359;
        io.ivb[313] = -87252545;
        io.ivb[314] = 1035345884;
        io.ivb[315] = -899317805;
        io.ivb[316] = 2087223197;
        io.ivb[317] = 764911874;
        io.ivb[318] = 813795649;
        io.ivb[319] = 1802188812;
        io.ivb[320] = 683224858;
        io.ivb[321] = -504141528;
        io.ivb[322] = 372330723;
        io.ivb[323] = 293649557;
        io.ivb[324] = -1284004331;
        io.ivb[325] = -454592181;
        io.ivb[326] = 1667389366;
        io.ivb[327] = -1318989187;
        io.ivb[328] = -1822874844;
        io.ivb[329] = -1644710185;
        io.ivb[330] = -983789917;
        io.ivb[331] = 1919364762;
        io.ivb[332] = 26483137;
        io.ivb[333] = -1480843772;
        io.ivb[334] = -1796229440;
        io.ivb[335] = 857932713;
        io.ivb[336] = 1500319657;
        io.ivb[337] = -282823008;
        io.ivb[338] = -1755352895;
        io.ivb[339] = -1699361096;
        io.ivb[340] = -853312665;
        io.ivb[341] = 347869457;
        io.ivb[342] = -71544915;
        io.ivb[343] = 1417217480;
        io.ivb[344] = 1572173867;
        io.ivb[345] = 1576914842;
        io.ivb[346] = 514777812;
        io.ivb[347] = -1655468883;
        io.ivb[348] = 1661625055;
        io.ivb[349] = 520683485;
        io.ivb[350] = 93645567;
        io.ivb[351] = 283513913;
        io.ivb[352] = -1300122501;
        io.ivb[353] = -1693726560;
        io.ivb[354] = -1289736471;
        io.ivb[355] = -688142439;
        io.ivb[356] = -1008423528;
        io.ivb[357] = 1673539539;
        io.ivb[358] = 648651502;
        io.ivb[359] = -1047663618;
        io.ivb[360] = 495888195;
        io.ivb[361] = -89850671;
        io.ivb[362] = -1419585534;
        io.ivb[363] = 1332696703;
        io.ivb[364] = -1997847406;
        io.ivb[365] = 1871585480;
        io.ivb[366] = -2053621501;
        io.ivb[367] = -354728257;
        io.ivb[368] = 117403421;
        io.ivb[369] = -1282851584;
        io.ivb[370] = 1467690987;
        io.ivb[371] = -1819269537;
        io.ivb[372] = -775584907;
        io.ivb[373] = 100566829;
        io.ivb[374] = 497700719;
        io.ivb[375] = -954951707;
        io.ivb[376] = 1427143686;
        io.ivb[377] = -433770456;
        io.ivb[378] = -1335761135;
        io.ivb[379] = 1290295290;
        io.ivb[380] = -338215240;
        io.ivb[381] = -664959287;
        io.ivb[382] = 508664743;
        io.ivb[383] = -85727264;
        io.ivb[384] = 240095397;
        io.ivb[385] = 1007437284;
        io.ivb[386] = 624162329;
        io.ivb[387] = 1182823082;
        io.ivb[388] = 470095566;
        io.ivb[389] = -72406367;
        io.ivb[390] = -985153760;
        io.ivb[391] = 1787516824;
        io.ivb[392] = 894962728;
        io.ivb[393] = 95971145;
        io.ivb[394] = -41634306;
        io.ivb[395] = -1507187666;
        io.ivb[396] = -1315666339;
        io.ivb[397] = -498573169;
        io.ivb[398] = -618766896;
        io.ivb[399] = 1012715482;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void forceRestore() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(io.ivc("jwv", ivg(int ), (int)112) - io.ivc("jwu", ivg(int ), (int)111));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 609948528: {
                    break block45;
                }
                case 1306910849: {
                    continue block45;
                }
            }
            break;
        }
        var3_1 = io.c;
        v1 /* !! */  = io.ak;
        if (true) ** GOTO lbl15
        block46: while (true) {
            v1 /* !! */  = (long)(v2 - io.ivc("jww", ivg(int ), (int)113));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -35302554: {
                    v2 = io.ivc("jwx", ivg(int ), (int)114);
                    continue block46;
                }
                case 609948528: {
                    break block46;
                }
                case 2009379063: {
                    v2 = io.ivc("jwy", ivg(int ), (int)115);
                    continue block46;
                }
            }
            break;
        }
        var2_2 /* !! */  = io.b;
        v3 /* !! */  = io.ak;
        if (true) ** GOTO lbl29
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - io.ivc("jwz", ivg(int ), (int)116));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2039962388: {
                    v4 = io.ivc("jxa", ivg(int ), (int)117);
                    continue block47;
                }
                case 609948528: {
                    break block47;
                }
                case 1146510244: {
                    v4 = io.ivc("jxb", ivg(int ), (int)118);
                    continue block47;
                }
            }
            break;
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl41:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl41
        v5 /* !! */  = io.ak;
        if (true) ** GOTO lbl48
        block49: while (true) {
            v5 /* !! */  = (long)(v6 - io.ivc("jxc", ivg(int ), (int)119));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1770356299: {
                    v6 = io.ivc("jxd", ivg(int ), (int)120);
                    continue block49;
                }
                case -1095177553: {
                    v6 = io.ivc("jxe", ivg(int ), (int)121);
                    continue block49;
                }
                case 609948528: {
                    break block49;
                }
                case 745811276: {
                    v6 = io.ivc("jxf", ivg(int ), (int)122);
                    continue block49;
                }
            }
            break;
        }
        v7 /* !! */  = io.ak;
        if (true) ** GOTO lbl64
        block50: while (true) {
            v7 /* !! */  = (long)(v8 - io.ivc("jxg", ivg(int ), (int)123));
lbl64:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1946334149: {
                    v8 = io.ivc("jxh", ivg(int ), (int)124);
                    continue block50;
                }
                case 350917960: {
                    v8 = io.ivc("jxi", ivg(int ), (int)125);
                    continue block50;
                }
                case 609948528: {
                    break block50;
                }
            }
            break;
        }
        if (!this.movement.isBlocked()) ** GOTO lbl-1000
        if (var1_3 || var1_3) ** GOTO lbl41
        v9 /* !! */  = io.ak;
        if (true) ** GOTO lbl79
        block51: while (true) {
            v9 /* !! */  = (long)(io.ivc("jxk", ivg(int ), (int)127) - io.ivc("jxj", ivg(int ), (int)126));
lbl79:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1673098849: {
                    continue block51;
                }
                case 609948528: {
                    break block51;
                }
            }
            break;
        }
        v10 /* !! */  = io.ak;
        if (true) ** GOTO lbl88
        block52: while (true) {
            v10 /* !! */  = (long)(v11 - io.ivc("jxl", ivg(int ), (int)128));
lbl88:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1986684555: {
                    v11 = io.ivc("jxm", ivg(int ), (int)129);
                    continue block52;
                }
                case -1244501612: {
                    v11 = io.ivc("jxn", ivg(int ), (int)130);
                    continue block52;
                }
                case 609948528: {
                    break block52;
                }
            }
            break;
        }
        this.movement.restoreFromCurrent();
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)io.ivc("jxo", iuz(int ), (int)490);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl115
                    break;
                }
            }
lbl111:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)io.ivc("jxp", iuz(int ), (int)491);
                if (!var3_1) break;
                throw null;
            }
lbl115:
            // 3 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)io.ivc("jxq", iuz(int ), (int)492);
                } while (!var3_1);
                throw null;
            }
lbl120:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)io.ivc("jxr", iuz(int ), (int)493);
                if (!var3_1) ** GOTO lbl111
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)io.ivc("jxs", iuz(int ), (int)494);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)io.ivc("jxt", iuz(int ), (int)495);
                if (!var3_1) break;
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)io.ivc("jxu", iuz(int ), (int)496);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)io.ivc("jxv", iuz(int ), (int)497);
                } while (!var3_1);
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)io.ivc("jxw", iuz(int ), (int)498);
        ** while (!var3_1)
lbl144:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkk() {
        io.ivi[100] = -7116628083741898786L;
        io.ivi[101] = 659172272846546000L;
        io.ivi[102] = 212350150057237836L;
        io.ivi[103] = 5598417771728089185L;
        io.ivi[104] = 896518254078141588L;
        io.ivi[105] = -6617960938231414374L;
        io.ivi[106] = 1216562908067610093L;
        io.ivi[107] = 4825767306252892857L;
        io.ivi[108] = -8840251342707013987L;
        io.ivi[109] = -2549360021417641686L;
        io.ivi[110] = -563172955094081622L;
        io.ivi[111] = -3623232310950854308L;
        io.ivi[112] = 1931917945533589410L;
        io.ivi[113] = -1621381180519601672L;
        io.ivi[114] = -3079551381486730699L;
        io.ivi[115] = 4165597576492482548L;
        io.ivi[116] = 188155300895135076L;
        io.ivi[117] = -5643609647012164856L;
        io.ivi[118] = 9174734667307821467L;
        io.ivi[119] = 7259152052925768072L;
        io.ivi[120] = -8415428101039863426L;
        io.ivi[121] = -7347674050261759440L;
        io.ivi[122] = -991741515355602098L;
        io.ivi[123] = 7803869743847372324L;
        io.ivi[124] = -2971398374172418928L;
        io.ivi[125] = 3057996438959822641L;
        io.ivi[126] = 5461541214168128496L;
        io.ivi[127] = -7224212387974064552L;
        io.ivi[128] = 8370163505955278178L;
        io.ivi[129] = -7039279534782157171L;
        io.ivi[130] = -7672789612377201527L;
        io.ivi[131] = -6072997006203738836L;
        io.ivi[132] = -3569361029855370978L;
        io.ivi[133] = 6726892643134476352L;
        io.ivi[134] = 2781890551693086804L;
        io.ivi[135] = -588167850204844764L;
        io.ivi[136] = 1073154865678369800L;
        io.ivi[137] = -5130745803029231815L;
        io.ivi[138] = -43860821837808913L;
        io.ivi[139] = 5963078759230155150L;
        io.ivi[140] = 596230290324857209L;
        io.ivi[141] = 2270615997183660759L;
        io.ivi[142] = -4318518983996263640L;
        io.ivi[143] = 5236492323180688723L;
        io.ivi[144] = 8347887385069897888L;
        io.ivi[145] = 7134098121439520806L;
        io.ivi[146] = -1175378541402601839L;
        io.ivi[147] = 2298352833020661727L;
        io.ivi[148] = -8950862390483672684L;
        io.ivi[149] = -3931470531551060375L;
        io.ivi[150] = 2621559420814385649L;
        io.ivi[151] = 2459428045359772560L;
        io.ivi[152] = 340159523768478902L;
        io.ivi[153] = 2104255076659424110L;
        io.ivi[154] = 9202613706271619804L;
        io.ivi[155] = -425127971163135166L;
        io.ivi[156] = 440152112864024724L;
        io.ivi[157] = -1747930502090698986L;
        io.ivi[158] = 3678580252957135409L;
        io.ivi[159] = 8192018555240018419L;
        io.ivi[160] = 4051786640215306971L;
        io.ivi[161] = 3448186135518236702L;
        io.ivi[162] = 1467576616838267254L;
        io.ivi[163] = -3414343914154440505L;
        io.ivi[164] = 4432695393055507571L;
        io.ivi[165] = 7604321977284549038L;
        io.ivi[166] = 7021170987219771969L;
        io.ivi[167] = -4365500048383312974L;
        io.ivi[168] = -5308846188679500749L;
        io.ivi[169] = -2456747780197837233L;
        io.ivi[170] = -6457004159029963651L;
        io.ivi[171] = 1730227288288934037L;
        io.ivi[172] = -2951177154345059159L;
        io.ivi[173] = 8162431224016393132L;
        io.ivi[174] = 6332809656832769834L;
        io.ivi[175] = 1201131941414393557L;
        io.ivi[176] = -3303418097069850566L;
        io.ivi[177] = -8249136919674142400L;
        io.ivi[178] = 2595841346301230181L;
        io.ivi[179] = -252618180064672800L;
        io.ivi[180] = 9144164951231666435L;
        io.ivi[181] = 166912774778542569L;
        io.ivi[182] = -300131092558529255L;
        io.ivi[183] = -2303329860068595560L;
        io.ivi[184] = 8834164414921859413L;
        io.ivi[185] = -6080798825355510638L;
        io.ivi[186] = -1886569562121777021L;
        io.ivi[187] = -8954134953957909630L;
        io.ivi[188] = -4893541866852474760L;
        io.ivi[189] = 3397384692261248486L;
        io.ivi[190] = -3037267679593069104L;
        io.ivi[191] = -3408716307674463498L;
        io.ivi[192] = -3894110484950450273L;
        io.ivi[193] = -4287969920895871535L;
        io.ivi[194] = -9029030860035651443L;
        io.ivi[195] = 6050742585664411533L;
        io.ivi[196] = 1635773688368475071L;
        io.ivi[197] = -212383829758149215L;
        io.ivi[198] = 2011429386197420170L;
        io.ivi[199] = -2662951843719220190L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getPhaseStartTime() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - io.ivc("kdw", ivg(int ), (int)170));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1477476757: {
                    v1 = io.ivc("kdx", ivg(int ), (int)171);
                    continue block21;
                }
                case 609948528: {
                    break block21;
                }
                case 1384525440: {
                    v1 = io.ivc("kdy", ivg(int ), (int)172);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = io.c;
        v2 /* !! */  = io.ak;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("kdz", ivg(int ), (int)173));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -901539993: {
                    v3 = io.ivc("kea", ivg(int ), (int)174);
                    continue block22;
                }
                case 537703693: {
                    v3 = io.ivc("keb", ivg(int ), (int)175);
                    continue block22;
                }
                case 609948528: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = io.b;
        v4 /* !! */  = io.ak;
        if (true) ** GOTO lbl33
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - io.ivc("kec", ivg(int ), (int)176));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1038763283: {
                    v5 = io.ivc("ked", ivg(int ), (int)177);
                    continue block23;
                }
                case 609948528: {
                    break block23;
                }
                case 1927028333: {
                    v5 = io.ivc("kee", ivg(int ), (int)178);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
            return (long)io.ivc("kef", ivg(int ), (int)179);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("keg", ivg(int ), (int)180)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == io.ivc("keh", iuz(int ), (int)544)) break;
                    v6 /* !! */  = (long)io.ivc("kei", iuz(int ), (int)545);
                }
                return this.phaseStartTime;
            }
lbl58:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)io.ivc("kej", iuz(int ), (int)546);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)io.ivc("kek", iuz(int ), (int)547);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)io.ivc("kel", iuz(int ), (int)548);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)io.ivc("kem", iuz(int ), (int)549);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkl() {
        io.ivi[200] = -9084572167255109036L;
        io.ivi[201] = -981957380616540880L;
        io.ivi[202] = 3888038927164243659L;
        io.ivi[203] = -6991682001297031203L;
        io.ivi[204] = -8671206867022825367L;
        io.ivi[205] = 4589691361585669917L;
        io.ivi[206] = -6690968390147254511L;
        io.ivi[207] = 4752976005214020789L;
        io.ivi[208] = 611371664085288136L;
        io.ivi[209] = 8375442924022109258L;
        io.ivi[210] = -6016750495813784279L;
        io.ivi[211] = 8206500000511970242L;
        io.ivi[212] = 546223349738704723L;
        io.ivi[213] = -9167357266427503617L;
        io.ivi[214] = 5619686973591222130L;
        io.ivi[215] = 538771801194273171L;
        io.ivi[216] = 4720427361207628691L;
        io.ivi[217] = 8285475897679683438L;
        io.ivi[218] = 7319900955110400893L;
        io.ivi[219] = -860431553350854467L;
        io.ivi[220] = 211565810703525041L;
        io.ivi[221] = 1118162284180334414L;
        io.ivi[222] = -1756749968311040178L;
        io.ivi[223] = 8167725067821686137L;
        io.ivi[224] = -6033987638397283719L;
        io.ivi[225] = 3154998483946526989L;
        io.ivi[226] = -7363824757085922821L;
        io.ivi[227] = 1428824125180200730L;
        io.ivi[228] = 7725033138865316061L;
        io.ivi[229] = -5996484133475774441L;
        io.ivi[230] = -8466907319413394994L;
        io.ivi[231] = 2944742113835460955L;
        io.ivi[232] = -9137742238986646234L;
        io.ivi[233] = -4307112162035786561L;
        io.ivi[234] = -5124253179052166361L;
        io.ivi[235] = 8739279126642108033L;
        io.ivi[236] = 2734860762151210629L;
        io.ivi[237] = 5984089436920925546L;
        io.ivi[238] = -6580588840291990744L;
        io.ivi[239] = 3614016446440036659L;
        io.ivi[240] = -6239294999972299522L;
        io.ivi[241] = -4617598768607999461L;
        io.ivi[242] = 6904055064752940755L;
        io.ivi[243] = 6662744321916586528L;
        io.ivi[244] = -3282081128864601993L;
        io.ivi[245] = -7342065167770989180L;
        io.ivi[246] = 830871542369777857L;
        io.ivi[247] = 8598994680112146217L;
        io.ivi[248] = 2441435059464852296L;
        io.ivi[249] = -7318807730090827190L;
        io.ivi[250] = -4030484285047064110L;
        io.ivi[251] = -2724351745577174718L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startLegit() {
        block87: {
            var6_1 = io.c;
            var5_2 /* !! */  = io.b;
            var4_3 = io.a;
            if (var6_1) {
                throw null;
lbl6:
                // 21 sources

                return;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (io.mc.field_1724 != null) break block87;
            if (var4_3) ** GOTO lbl6
            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        this.savedSlot = io.mc.field_1724.method_31548().method_67532();
        if (var4_3 || var4_3) ** GOTO lbl6
        var1_4 = nv.findHotbarItem(class_1802.field_8639);
        if (var4_3 || var4_3) ** GOTO lbl6
        if (var1_4 == io.ivc("jai", iuz(int ), (int)100)) ** GOTO lbl32
        if (var4_3 || var4_3) ** GOTO lbl6
        this.slot = var1_4;
        if (var4_3 || var4_3) ** GOTO lbl6
        this.fromInventory = io.ivc("jak", iuz(int ), (int)101);
        if (var4_3 || var4_3) ** GOTO lbl6
        nv.selectSlot(this.slot);
        if (var4_3 || var4_3) ** GOTO lbl6
        this.startPhase(it$FireworkPhase.AWAIT_ITEM, (int)io.ivc("jan", iuz(int ), (int)102));
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3 || var4_3) ** GOTO lbl6
                return;
            }
lbl32:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5 = nv.findItemInInventory(class_1802.field_8639);
            if (var4_3 || var4_3) ** GOTO lbl6
            if (var2_5 == io.ivc("jar", iuz(int ), (int)103)) ** GOTO lbl53
            if (var4_3 || var4_3) ** GOTO lbl6
            this.slot = var2_5;
            if (var4_3 || var4_3) ** GOTO lbl6
            this.fromInventory = io.ivc("jau", iuz(int ), (int)104);
            if (var4_3 || var4_3) ** GOTO lbl6
            var3_6 = this.settingsProvider.get();
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!var3_6.shouldStopMovement()) ** GOTO lbl50
            if (var4_3 || var4_3) ** GOTO lbl6
            this.startPhase(it$FireworkPhase.PRE_STOP, var3_6.randomPreStopDelay());
            if (var4_3) ** GOTO lbl6
            if (var6_1) {
                throw null;
            }
            ** GOTO lbl53
lbl50:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            this.startPhase(it$FireworkPhase.SWAP_TO_HAND, (int)io.ivc("jax", iuz(int ), (int)105));
            if (var4_3) ** GOTO lbl6
lbl53:
            // 3 sources

            if (!var4_3 && !var4_3) ** break;
            ** continue;
            return;
            case 0: {
                var5_2 /* !! */  = (int)io.ivc("jaz", iuz(int ), (int)106);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 1: {
                var5_2 /* !! */  = (int)io.ivc("jbb", iuz(int ), (int)107);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl66:
            // 3 sources

            case 2: {
                var5_2 /* !! */  = (int)io.ivc("jbd", iuz(int ), (int)108);
                if (var6_1) {
                    throw null;
                }
            }
lbl70:
            // 5 sources

            case 3: {
                var5_2 /* !! */  = (int)io.ivc("jbf", iuz(int ), (int)109);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl75:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)io.ivc("jbh", iuz(int ), (int)110);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 5: {
                var5_2 /* !! */  = (int)io.ivc("jbj", iuz(int ), (int)111);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 6: {
                var5_2 /* !! */  = (int)io.ivc("jbl", iuz(int ), (int)112);
                if (!var6_1) ** GOTO lbl70
                throw null;
            }
lbl89:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)io.ivc("jbn", iuz(int ), (int)113);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 8: {
                var5_2 /* !! */  = (int)io.ivc("jbp", iuz(int ), (int)114);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl99:
            // 4 sources

            case 9: {
                var5_2 /* !! */  = (int)io.ivc("jbq", iuz(int ), (int)115);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 10: {
                var5_2 /* !! */  = (int)io.ivc("jbr", iuz(int ), (int)116);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl109:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)io.ivc("jbt", iuz(int ), (int)117);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl114:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)io.ivc("jbu", iuz(int ), (int)118);
                if (!var6_1) ** GOTO lbl89
                throw null;
            }
            case 13: {
                var5_2 /* !! */  = (int)io.ivc("jbw", iuz(int ), (int)119);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl123:
            // 2 sources

            case 14: {
                var5_2 /* !! */  = (int)io.ivc("jbx", iuz(int ), (int)120);
                if (!var6_1) ** GOTO lbl99
                throw null;
            }
lbl127:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)io.ivc("jby", iuz(int ), (int)121);
                if (!var6_1) ** GOTO lbl109
                throw null;
            }
lbl131:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)io.ivc("jca", iuz(int ), (int)122);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 17: {
                var5_2 /* !! */  = (int)io.ivc("jcc", iuz(int ), (int)123);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 18: {
                var5_2 /* !! */  = (int)io.ivc("jcd", iuz(int ), (int)124);
                if (!var6_1) ** GOTO lbl131
                throw null;
            }
lbl145:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)io.ivc("jce", iuz(int ), (int)125);
                if (!var6_1) ** GOTO lbl66
                throw null;
            }
lbl149:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)io.ivc("jcf", iuz(int ), (int)126);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 21: {
                var5_2 /* !! */  = (int)io.ivc("jcg", iuz(int ), (int)127);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl159:
            // 3 sources

            case 22: {
                var5_2 /* !! */  = (int)io.ivc("jch", iuz(int ), (int)128);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 23: {
                var5_2 /* !! */  = (int)io.ivc("jci", iuz(int ), (int)129);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl169:
            // 5 sources

            case 24: {
                var5_2 /* !! */  = (int)io.ivc("jcj", iuz(int ), (int)130);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl174:
            // 3 sources

            case 25: {
                var5_2 /* !! */  = (int)io.ivc("jck", iuz(int ), (int)131);
                if (!var6_1) ** GOTO lbl70
                throw null;
            }
            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)io.ivc("jcl", iuz(int ), (int)132);
                    if (!var6_1) ** GOTO lbl169
                    throw null;
                }
            }
            case 27: {
                var5_2 /* !! */  = (int)io.ivc("jcm", iuz(int ), (int)133);
                if (!var6_1) ** GOTO lbl66
                throw null;
            }
lbl187:
            // 2 sources

            case 28: {
                var5_2 /* !! */  = (int)io.ivc("jcn", iuz(int ), (int)134);
                if (!var6_1) ** GOTO lbl174
                throw null;
            }
lbl191:
            // 3 sources

            case 29: {
                var5_2 /* !! */  = (int)io.ivc("jco", iuz(int ), (int)135);
                if (!var6_1) ** GOTO lbl99
                throw null;
            }
            case 30: {
                var5_2 /* !! */  = (int)io.ivc("jcp", iuz(int ), (int)136);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 31: {
                var5_2 /* !! */  = (int)io.ivc("jcq", iuz(int ), (int)137);
                if (var6_1) {
                    throw null;
                }
            }
            case 32: {
                var5_2 /* !! */  = (int)io.ivc("jcr", iuz(int ), (int)138);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 33: {
                var5_2 /* !! */  = (int)io.ivc("jcs", iuz(int ), (int)139);
                if (!var6_1) ** GOTO lbl145
                throw null;
            }
            case 34: {
                var5_2 /* !! */  = (int)io.ivc("jct", iuz(int ), (int)140);
                if (var6_1) {
                    throw null;
                }
            }
lbl217:
            // 4 sources

            case 35: {
                var5_2 /* !! */  = (int)io.ivc("jcu", iuz(int ), (int)141);
                if (var6_1) {
                    throw null;
                }
            }
lbl221:
            // 4 sources

            case 36: {
                var5_2 /* !! */  = (int)io.ivc("jcv", iuz(int ), (int)142);
                if (!var6_1) ** GOTO lbl169
                throw null;
            }
            case 37: {
                var5_2 /* !! */  = (int)io.ivc("jcw", iuz(int ), (int)143);
                if (!var6_1) ** GOTO lbl127
                throw null;
            }
lbl229:
            // 3 sources

            case 38: {
                var5_2 /* !! */  = (int)io.ivc("jcx", iuz(int ), (int)144);
                if (!var6_1) ** GOTO lbl75
                throw null;
            }
            case 39: {
                var5_2 /* !! */  = (int)io.ivc("jcy", iuz(int ), (int)145);
                if (!var6_1) ** GOTO lbl191
                throw null;
            }
lbl237:
            // 4 sources

            case 40: {
                var5_2 /* !! */  = (int)io.ivc("jcz", iuz(int ), (int)146);
                if (!var6_1) ** GOTO lbl159
                throw null;
            }
lbl241:
            // 4 sources

            case 41: {
                do {
                    var5_2 /* !! */  = (int)io.ivc("jda", iuz(int ), (int)147);
                } while (!var6_1);
                throw null;
            }
            case 42: 
        }
        var5_2 /* !! */  = (int)io.ivc("jdb", iuz(int ), (int)148);
        ** while (!var6_1)
lbl249:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkg() {
        io.ivh[0] = -5937411503958425460L;
        io.ivh[1] = 1524193683031212919L;
        io.ivh[2] = -3751724188425030906L;
        io.ivh[3] = 5570085732165794652L;
        io.ivh[4] = -3765834432367049300L;
        io.ivh[5] = 4150988551238264539L;
        io.ivh[6] = 4297028493385820419L;
        io.ivh[7] = 3545849879364667785L;
        io.ivh[8] = -5561976466091783801L;
        io.ivh[9] = -6459123269384205847L;
        io.ivh[10] = 2333353938444766817L;
        io.ivh[11] = -2428566153688929931L;
        io.ivh[12] = -6396135628585976139L;
        io.ivh[13] = 5303128717187461874L;
        io.ivh[14] = -2639258610242696586L;
        io.ivh[15] = 1292509428149424473L;
        io.ivh[16] = -3420138139881608440L;
        io.ivh[17] = 4551049812209191277L;
        io.ivh[18] = -472588949532655819L;
        io.ivh[19] = 7040887007578108411L;
        io.ivh[20] = 3646388514605812518L;
        io.ivh[21] = -5585521681048670647L;
        io.ivh[22] = 8686697639480536628L;
        io.ivh[23] = 4990957815758885095L;
        io.ivh[24] = -2977131135798814837L;
        io.ivh[25] = 131641651964815618L;
        io.ivh[26] = 1084896095602189045L;
        io.ivh[27] = -529847372366939782L;
        io.ivh[28] = -8022777474094601438L;
        io.ivh[29] = 1665577943022561555L;
        io.ivh[30] = 2785723971223682463L;
        io.ivh[31] = -3158971245639038093L;
        io.ivh[32] = 2841974548367001071L;
        io.ivh[33] = -4548739228523484075L;
        io.ivh[34] = -4044750811295916251L;
        io.ivh[35] = 9209168455804870029L;
        io.ivh[36] = 1760335953964992844L;
        io.ivh[37] = 6010170270940992707L;
        io.ivh[38] = -8070534811275087056L;
        io.ivh[39] = -4353482953710688789L;
        io.ivh[40] = -3582392512609258379L;
        io.ivh[41] = 6690763821550526961L;
        io.ivh[42] = -6292013843351605637L;
        io.ivh[43] = 6825434097880007656L;
        io.ivh[44] = 987696668747203349L;
        io.ivh[45] = -7811060240869480257L;
        io.ivh[46] = 7903516736282248496L;
        io.ivh[47] = -4646123795426966889L;
        io.ivh[48] = 4852156312304105656L;
        io.ivh[49] = 7318690824712970533L;
        io.ivh[50] = 5481443496611708033L;
        io.ivh[51] = -6073525152936598958L;
        io.ivh[52] = -4159870640384731010L;
        io.ivh[53] = -5825444763964753666L;
        io.ivh[54] = -1602947699404828762L;
        io.ivh[55] = 3085053283998097204L;
        io.ivh[56] = -8296357890057509736L;
        io.ivh[57] = 8579020457103373456L;
        io.ivh[58] = -5660826494619593519L;
        io.ivh[59] = 6415954152471187151L;
        io.ivh[60] = -4591869967848571910L;
        io.ivh[61] = 520999452913054621L;
        io.ivh[62] = -5400803076723919356L;
        io.ivh[63] = -8154123863101810133L;
        io.ivh[64] = -3848073448737499043L;
        io.ivh[65] = 3860803027137750648L;
        io.ivh[66] = -8231907337633727995L;
        io.ivh[67] = 7913298509163419141L;
        io.ivh[68] = 7113956465857108197L;
        io.ivh[69] = -1247807661697636553L;
        io.ivh[70] = 8583484517893204196L;
        io.ivh[71] = -6205997683101808572L;
        io.ivh[72] = -5744144877960627948L;
        io.ivh[73] = -1397558658658250179L;
        io.ivh[74] = -8693234847779983203L;
        io.ivh[75] = -8729100978225424517L;
        io.ivh[76] = -4780912036248660702L;
        io.ivh[77] = 8425653127260451993L;
        io.ivh[78] = -1544142887950600831L;
        io.ivh[79] = 3829352297784560053L;
        io.ivh[80] = -3958015195928595165L;
        io.ivh[81] = -3978235746523884550L;
        io.ivh[82] = 7360256031382056146L;
        io.ivh[83] = 7992223469295416412L;
        io.ivh[84] = -1885696968615768221L;
        io.ivh[85] = -105781846055904341L;
        io.ivh[86] = 5756775216901735832L;
        io.ivh[87] = 2056502225149051898L;
        io.ivh[88] = -4471547167916894431L;
        io.ivh[89] = -3999359409996938194L;
        io.ivh[90] = 8968976430185307121L;
        io.ivh[91] = -968904870780627046L;
        io.ivh[92] = 4955979160477728206L;
        io.ivh[93] = -3184458684258053841L;
        io.ivh[94] = 1044254477203095055L;
        io.ivh[95] = -42736606918725503L;
        io.ivh[96] = 5038320813810548233L;
        io.ivh[97] = 8247053736925765034L;
        io.ivh[98] = 1885088502422760965L;
        io.ivh[99] = -8831424727427680327L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void useSilent() {
        block91: {
            block93: {
                block92: {
                    block90: {
                        var8_1 = io.c;
                        var7_2 /* !! */  = io.b;
                        var6_3 = io.a;
                        if (var8_1) {
                            throw null;
lbl6:
                            // 25 sources

                            return;
                        }
                        if (var6_3 || var6_3) ** GOTO lbl6
                        if (io.mc.field_1724 != null) break block90;
                        if (var6_3) ** GOTO lbl6
                        return;
                    }
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var1_4 = nv.findHotbarItem(class_1802.field_8639);
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var1_4 == io.ivc("iya", iuz(int ), (int)49)) break block91;
                    if (var6_3 || var6_3) ** GOTO lbl6
                    var2_5 = io.mc.field_1724.method_31548().method_67532();
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var1_4 == var2_5) break block92;
                    if (var6_3 || var6_3) ** GOTO lbl6
                    io.mc.method_1562().method_52787((class_2596)new class_2868(var1_4));
                    if (var6_3) ** GOTO lbl6
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                var3_7 = this.getRotation();
                if (var6_3 || var6_3) ** GOTO lbl6
                this.sendSequencedPacket((IntFunction<class_2596<?>>)LambdaMetafactory.metafactory(null, null, null, (I)Ljava/lang/Object;, lambda$useSilent$0(ruhack.phobia.ov int ), (I)Lnet/minecraft/class_2596;)((ov)var3_7));
                if (var6_3 || var6_3) ** GOTO lbl6
                if (var1_4 == var2_5) break block93;
                if (var6_3 || var6_3) ** GOTO lbl6
                io.mc.method_1562().method_52787((class_2596)new class_2868(var2_5));
                if (var6_3) ** GOTO lbl6
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            return;
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        var2_6 = nv.findItemInInventory(class_1802.field_8639);
        if (var6_3 || var6_3) ** GOTO lbl6
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_6 == io.ivc("iyb", iuz(int ), (int)50)) ** GOTO lbl60
                if (var6_3 || var6_3) ** GOTO lbl6
                var3_8 = io.mc.field_1724.method_31548().method_67532();
                if (var6_3 || var6_3) ** GOTO lbl6
                var4_9 = nv.wrapSlot(var2_6);
                if (var6_3 || var6_3) ** GOTO lbl6
                nv.click(var4_9, var3_8, class_1713.field_7791);
                if (var6_3 || var6_3) ** GOTO lbl6
                var5_10 = this.getRotation();
                if (var6_3 || var6_3) ** GOTO lbl6
                this.sendSequencedPacket((IntFunction<class_2596<?>>)LambdaMetafactory.metafactory(null, null, null, (I)Ljava/lang/Object;, lambda$useSilent$1(ruhack.phobia.ov int ), (I)Lnet/minecraft/class_2596;)((ov)var5_10));
                if (var6_3 || var6_3) ** GOTO lbl6
                nv.click(var4_9, var3_8, class_1713.field_7791);
                if (var6_3 || var6_3) ** GOTO lbl6
                nv.closeScreen();
                if (var6_3) ** GOTO lbl6
lbl60:
                // 2 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return;
            }
lbl63:
            // 2 sources

            case 0: {
                var7_2 /* !! */  = (int)io.ivc("iyc", iuz(int ), (int)51);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 1: {
                var7_2 /* !! */  = (int)io.ivc("iyd", iuz(int ), (int)52);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl73:
            // 2 sources

            case 2: {
                var7_2 /* !! */  = (int)io.ivc("iye", iuz(int ), (int)53);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl78:
            // 6 sources

            case 3: {
                do {
                    var7_2 /* !! */  = (int)io.ivc("iyf", iuz(int ), (int)54);
                } while (!var8_1);
                throw null;
            }
            case 4: {
                var7_2 /* !! */  = (int)io.ivc("iyg", iuz(int ), (int)55);
                if (!var8_1) ** GOTO lbl78
                throw null;
            }
            case 5: {
                var7_2 /* !! */  = (int)io.ivc("iyh", iuz(int ), (int)56);
                if (!var8_1) break;
                throw null;
            }
lbl91:
            // 2 sources

            case 6: {
                var7_2 /* !! */  = (int)io.ivc("iyi", iuz(int ), (int)57);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl96:
            // 2 sources

            case 7: {
                var7_2 /* !! */  = (int)io.ivc("iyj", iuz(int ), (int)58);
                if (!var8_1) ** GOTO lbl91
                throw null;
            }
            case 8: {
                var7_2 /* !! */  = (int)io.ivc("iyk", iuz(int ), (int)59);
                if (!var8_1) ** GOTO lbl63
                throw null;
            }
lbl104:
            // 4 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)io.ivc("iyl", iuz(int ), (int)60);
                    if (!var8_1) break block0;
                    throw null;
                }
            }
lbl109:
            // 4 sources

            case 10: {
                var7_2 /* !! */  = (int)io.ivc("iym", iuz(int ), (int)61);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 11: {
                var7_2 /* !! */  = (int)io.ivc("iyn", iuz(int ), (int)62);
                if (!var8_1) ** GOTO lbl78
                throw null;
            }
            case 12: {
                var7_2 /* !! */  = (int)io.ivc("iyo", iuz(int ), (int)63);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl123:
            // 2 sources

            case 13: {
                var7_2 /* !! */  = (int)io.ivc("iyp", iuz(int ), (int)64);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl128:
            // 2 sources

            case 14: {
                var7_2 /* !! */  = (int)io.ivc("iyq", iuz(int ), (int)65);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl133:
            // 2 sources

            case 15: {
                var7_2 /* !! */  = (int)io.ivc("iyr", iuz(int ), (int)66);
                if (!var8_1) ** GOTO lbl104
                throw null;
            }
            case 16: {
                var7_2 /* !! */  = (int)io.ivc("iys", iuz(int ), (int)67);
                if (var8_1) {
                    throw null;
                }
            }
lbl141:
            // 4 sources

            case 17: {
                var7_2 /* !! */  = (int)io.ivc("iyt", iuz(int ), (int)68);
                if (!var8_1) ** GOTO lbl96
                throw null;
            }
lbl145:
            // 2 sources

            case 18: {
                var7_2 /* !! */  = (int)io.ivc("iyu", iuz(int ), (int)69);
                if (!var8_1) ** GOTO lbl133
                throw null;
            }
            case 19: {
                var7_2 /* !! */  = (int)io.ivc("iyv", iuz(int ), (int)70);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl154:
            // 2 sources

            case 20: {
                var7_2 /* !! */  = (int)io.ivc("iyw", iuz(int ), (int)71);
                if (!var8_1) ** GOTO lbl78
                throw null;
            }
lbl158:
            // 2 sources

            case 21: {
                var7_2 /* !! */  = (int)io.ivc("iyx", iuz(int ), (int)72);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl163:
            // 3 sources

            case 22: {
                var7_2 /* !! */  = (int)io.ivc("iyy", iuz(int ), (int)73);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl168:
            // 4 sources

            case 23: {
                var7_2 /* !! */  = (int)io.ivc("iyz", iuz(int ), (int)74);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl173:
            // 2 sources

            case 24: {
                var7_2 /* !! */  = (int)io.ivc("iza", iuz(int ), (int)75);
                if (!var8_1) ** GOTO lbl163
                throw null;
            }
            case 25: {
                var7_2 /* !! */  = (int)io.ivc("izb", iuz(int ), (int)76);
                if (!var8_1) ** GOTO lbl78
                throw null;
            }
            case 26: {
                var7_2 /* !! */  = (int)io.ivc("izc", iuz(int ), (int)77);
                if (!var8_1) ** GOTO lbl104
                throw null;
            }
lbl185:
            // 2 sources

            case 27: {
                var7_2 /* !! */  = (int)io.ivc("izd", iuz(int ), (int)78);
                if (!var8_1) ** GOTO lbl158
                throw null;
            }
            case 28: {
                var7_2 /* !! */  = (int)io.ivc("ize", iuz(int ), (int)79);
                if (!var8_1) ** GOTO lbl185
                throw null;
            }
            case 29: {
                var7_2 /* !! */  = (int)io.ivc("izf", iuz(int ), (int)80);
                if (!var8_1) ** GOTO lbl128
                throw null;
            }
lbl197:
            // 2 sources

            case 30: {
                var7_2 /* !! */  = (int)io.ivc("izg", iuz(int ), (int)81);
                if (!var8_1) ** GOTO lbl109
                throw null;
            }
lbl201:
            // 2 sources

            case 31: {
                var7_2 /* !! */  = (int)io.ivc("izh", iuz(int ), (int)82);
                if (!var8_1) break;
                throw null;
            }
lbl205:
            // 3 sources

            case 32: {
                var7_2 /* !! */  = (int)io.ivc("izi", iuz(int ), (int)83);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 33: {
                var7_2 /* !! */  = (int)io.ivc("izj", iuz(int ), (int)84);
                if (!var8_1) ** GOTO lbl205
                throw null;
            }
lbl214:
            // 2 sources

            case 34: {
                var7_2 /* !! */  = (int)io.ivc("izk", iuz(int ), (int)85);
                if (!var8_1) ** GOTO lbl145
                throw null;
            }
            case 35: {
                var7_2 /* !! */  = (int)io.ivc("izl", iuz(int ), (int)86);
                if (!var8_1) ** GOTO lbl73
                throw null;
            }
            case 36: {
                var7_2 /* !! */  = (int)io.ivc("izm", iuz(int ), (int)87);
                if (!var8_1) ** GOTO lbl123
                throw null;
            }
            case 37: {
                var7_2 /* !! */  = (int)io.ivc("izn", iuz(int ), (int)88);
                if (!var8_1) ** GOTO lbl163
                throw null;
            }
            case 38: {
                var7_2 /* !! */  = (int)io.ivc("izo", iuz(int ), (int)89);
                if (!var8_1) ** GOTO lbl168
                throw null;
            }
lbl234:
            // 4 sources

            case 39: {
                var7_2 /* !! */  = (int)io.ivc("izp", iuz(int ), (int)90);
                if (!var8_1) ** GOTO lbl109
                throw null;
            }
            case 40: {
                var7_2 /* !! */  = (int)io.ivc("izq", iuz(int ), (int)91);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl243:
            // 2 sources

            case 41: {
                var7_2 /* !! */  = (int)io.ivc("izr", iuz(int ), (int)92);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 42: {
                var7_2 /* !! */  = (int)io.ivc("izs", iuz(int ), (int)93);
                if (!var8_1) ** GOTO lbl141
                throw null;
            }
            case 43: {
                var7_2 /* !! */  = (int)io.ivc("izt", iuz(int ), (int)94);
                if (!var8_1) ** GOTO lbl214
                throw null;
            }
            case 44: {
                var7_2 /* !! */  = (int)io.ivc("izu", iuz(int ), (int)95);
                if (!var8_1) ** GOTO lbl205
                throw null;
            }
            case 45: {
                var7_2 /* !! */  = (int)io.ivc("izv", iuz(int ), (int)96);
                if (!var8_1) ** GOTO lbl154
                throw null;
            }
lbl264:
            // 4 sources

            case 46: {
                var7_2 /* !! */  = (int)io.ivc("izw", iuz(int ), (int)97);
                if (!var8_1) ** GOTO lbl168
                throw null;
            }
lbl268:
            // 3 sources

            case 47: {
                var7_2 /* !! */  = (int)io.ivc("izx", iuz(int ), (int)98);
                if (!var8_1) ** GOTO lbl78
                throw null;
            }
            case 48: 
        }
        var7_2 /* !! */  = (int)io.ivc("izy", iuz(int ), (int)99);
        ** while (!var8_1)
lbl275:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjw() {
        io.iva[400] = -1778927130;
        io.iva[401] = 616226987;
        io.iva[402] = 1654056072;
        io.iva[403] = 1231335843;
        io.iva[404] = 869683206;
        io.iva[405] = -1900452770;
        io.iva[406] = 1246130910;
        io.iva[407] = 1518903374;
        io.iva[408] = 1363022746;
        io.iva[409] = -160662150;
        io.iva[410] = -1967471214;
        io.iva[411] = 183712403;
        io.iva[412] = -44906866;
        io.iva[413] = -214502031;
        io.iva[414] = 854370063;
        io.iva[415] = 1143927233;
        io.iva[416] = 1091096948;
        io.iva[417] = -1926877998;
        io.iva[418] = 2040683087;
        io.iva[419] = 112798373;
        io.iva[420] = -1432168035;
        io.iva[421] = 625847723;
        io.iva[422] = -1273979656;
        io.iva[423] = -921329333;
        io.iva[424] = 1778834669;
        io.iva[425] = 948264764;
        io.iva[426] = -444688483;
        io.iva[427] = -1458965813;
        io.iva[428] = 520897505;
        io.iva[429] = -1035427483;
        io.iva[430] = 1381629453;
        io.iva[431] = 431676510;
        io.iva[432] = -511251034;
        io.iva[433] = 280259037;
        io.iva[434] = -759706428;
        io.iva[435] = 1166218735;
        io.iva[436] = 1750592766;
        io.iva[437] = 942858030;
        io.iva[438] = -1110868547;
        io.iva[439] = -333599339;
        io.iva[440] = 76952829;
        io.iva[441] = -1496630216;
        io.iva[442] = -1460218945;
        io.iva[443] = -1103992635;
        io.iva[444] = -118434179;
        io.iva[445] = -1852197422;
        io.iva[446] = -1550349132;
        io.iva[447] = 1835647083;
        io.iva[448] = 675431544;
        io.iva[449] = 1622830638;
        io.iva[450] = -442904285;
        io.iva[451] = 1067385908;
        io.iva[452] = -448387065;
        io.iva[453] = 1934233980;
        io.iva[454] = 1994328657;
        io.iva[455] = 1869984463;
        io.iva[456] = 320312543;
        io.iva[457] = 677481220;
        io.iva[458] = 1116835606;
        io.iva[459] = 1687954362;
        io.iva[460] = -1632021697;
        io.iva[461] = -470341080;
        io.iva[462] = -266362747;
        io.iva[463] = 963775965;
        io.iva[464] = 580929174;
        io.iva[465] = -1782029941;
        io.iva[466] = 1669711742;
        io.iva[467] = 1322402715;
        io.iva[468] = 1894718377;
        io.iva[469] = 134983724;
        io.iva[470] = 602472931;
        io.iva[471] = 875709064;
        io.iva[472] = -1342047003;
        io.iva[473] = -1216329039;
        io.iva[474] = -2143733447;
        io.iva[475] = 193412214;
        io.iva[476] = -1635654746;
        io.iva[477] = -374151075;
        io.iva[478] = 1747216316;
        io.iva[479] = -735954953;
        io.iva[480] = -424726459;
        io.iva[481] = 190941869;
        io.iva[482] = -1365944118;
        io.iva[483] = -1167760967;
        io.iva[484] = -384106812;
        io.iva[485] = -1298694863;
        io.iva[486] = -1724058392;
        io.iva[487] = -634257513;
        io.iva[488] = -2040034960;
        io.iva[489] = 1648266329;
        io.iva[490] = -1966001583;
        io.iva[491] = 1760751549;
        io.iva[492] = -1097482423;
        io.iva[493] = -1260445346;
        io.iva[494] = 1978779477;
        io.iva[495] = 132886020;
        io.iva[496] = 2122737657;
        io.iva[497] = 709139206;
        io.iva[498] = -174706661;
        io.iva[499] = -1654502534;
    }

    private static /* synthetic */ void kjx() {
        io.iva[500] = 113023466;
        io.iva[501] = -515168102;
        io.iva[502] = -1940773298;
        io.iva[503] = -121204504;
        io.iva[504] = -1315682189;
        io.iva[505] = 2098986597;
        io.iva[506] = -1986216378;
        io.iva[507] = 1137396351;
        io.iva[508] = -1694523158;
        io.iva[509] = -239095182;
        io.iva[510] = -75860579;
        io.iva[511] = 1072703194;
        io.iva[512] = -2050149269;
        io.iva[513] = -1812199545;
        io.iva[514] = -1431314229;
        io.iva[515] = 128640799;
        io.iva[516] = 524774098;
        io.iva[517] = 49637338;
        io.iva[518] = -425654511;
        io.iva[519] = -2096471327;
        io.iva[520] = 583370273;
        io.iva[521] = -1905133563;
        io.iva[522] = -1682169201;
        io.iva[523] = 1365763552;
        io.iva[524] = -772332538;
        io.iva[525] = 180621534;
        io.iva[526] = 1733637997;
        io.iva[527] = -1122407846;
        io.iva[528] = 135739122;
        io.iva[529] = 1303098303;
        io.iva[530] = -556788096;
        io.iva[531] = 2140889014;
        io.iva[532] = -561089434;
        io.iva[533] = -255254027;
        io.iva[534] = 1622186754;
        io.iva[535] = -1988249646;
        io.iva[536] = 911190816;
        io.iva[537] = -427605868;
        io.iva[538] = -2110137895;
        io.iva[539] = 1530064193;
        io.iva[540] = -1395337161;
        io.iva[541] = 1561979503;
        io.iva[542] = -440920481;
        io.iva[543] = 1736352834;
        io.iva[544] = 1769074397;
        io.iva[545] = -2035318432;
        io.iva[546] = 807908596;
        io.iva[547] = 316832002;
        io.iva[548] = 1359478549;
        io.iva[549] = 214917519;
        io.iva[550] = -1002805411;
        io.iva[551] = -946817511;
        io.iva[552] = 1358985225;
        io.iva[553] = 1433131727;
        io.iva[554] = -992473268;
        io.iva[555] = -962122962;
        io.iva[556] = -1544801637;
        io.iva[557] = -1629892106;
        io.iva[558] = 199211394;
        io.iva[559] = 454089223;
        io.iva[560] = 1853363422;
        io.iva[561] = -488413467;
        io.iva[562] = 263934773;
        io.iva[563] = 1937502480;
        io.iva[564] = 602046396;
        io.iva[565] = 1519298483;
        io.iva[566] = -416744617;
        io.iva[567] = -1744473878;
        io.iva[568] = 38138320;
        io.iva[569] = -1312153339;
        io.iva[570] = 751110535;
        io.iva[571] = 655953198;
        io.iva[572] = -722356977;
        io.iva[573] = -178102489;
        io.iva[574] = 1907811431;
        io.iva[575] = 1764095651;
        io.iva[576] = 1833248371;
        io.iva[577] = 520673302;
        io.iva[578] = 310277622;
        io.iva[579] = 696239191;
        io.iva[580] = -127622523;
        io.iva[581] = -1655513298;
        io.iva[582] = -860012437;
        io.iva[583] = -737898001;
        io.iva[584] = 624567404;
        io.iva[585] = -8836003;
        io.iva[586] = 915048710;
        io.iva[587] = -1815359061;
        io.iva[588] = 52644138;
        io.iva[589] = 721152536;
        io.iva[590] = -1116738740;
        io.iva[591] = 316144835;
        io.iva[592] = -650812322;
        io.iva[593] = -177207099;
        io.iva[594] = 69737165;
        io.iva[595] = 1077431076;
        io.iva[596] = -1604895227;
        io.iva[597] = -1802658758;
        io.iva[598] = -1493795334;
        io.iva[599] = -426689603;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = io.ak;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(io.ivc("juo", ivg(int ), (int)87) - io.ivc("jun", ivg(int ), (int)86));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1686161815: {
                    continue block50;
                }
                case 609948528: {
                    break block50;
                }
            }
            break;
        }
        var3_1 = io.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("jup", ivg(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == io.ivc("juq", iuz(int ), (int)456)) break;
            v1 /* !! */  = (long)io.ivc("jur", iuz(int ), (int)457);
        }
        var2_2 /* !! */  = io.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("jus", ivg(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == io.ivc("jut", iuz(int ), (int)458)) break;
            v2 /* !! */  = (long)io.ivc("juu", iuz(int ), (int)459);
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl25:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 /* !! */  = io.ak;
        if (true) ** GOTO lbl32
        block54: while (true) {
            v3 /* !! */  = (long)(v4 - io.ivc("juv", ivg(int ), (int)90));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -665222515: {
                    v4 = io.ivc("juw", ivg(int ), (int)91);
                    continue block54;
                }
                case 609948528: {
                    break block54;
                }
                case 726850429: {
                    v4 = io.ivc("jux", ivg(int ), (int)92);
                    continue block54;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("juy", ivg(int ), (int)93)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == io.ivc("juz", iuz(int ), (int)460)) break;
            v5 /* !! */  = (long)io.ivc("jva", iuz(int ), (int)461);
        }
        this.movement.reset();
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v6 /* !! */  = io.ak;
                if (true) ** GOTO lbl56
                block56: while (true) {
                    v6 /* !! */  = (long)(v7 - io.ivc("jvb", ivg(int ), (int)94));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1483294074: {
                            v7 = io.ivc("jvc", ivg(int ), (int)95);
                            continue block56;
                        }
                        case -351009452: {
                            v7 = io.ivc("jvd", ivg(int ), (int)96);
                            continue block56;
                        }
                        case 609948528: {
                            break block56;
                        }
                        case 1710097309: {
                            v7 = io.ivc("jve", ivg(int ), (int)97);
                            continue block56;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = io.ak - io.ivc("jvf", ivg(int ), (int)98)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == io.ivc("jvg", iuz(int ), (int)462)) break;
                    v8 /* !! */  = (long)io.ivc("jvh", iuz(int ), (int)463);
                }
                this.phase = it$FireworkPhase.IDLE;
                if (var1_3 || var1_3) ** GOTO lbl25
                v9 = io.ivc("jvi", iuz(int ), (int)464);
                v10 /* !! */  = io.ak;
                if (true) ** GOTO lbl80
                block58: while (true) {
                    v10 /* !! */  = (long)(io.ivc("jvk", ivg(int ), (int)100) - io.ivc("jvj", ivg(int ), (int)99));
lbl80:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1062426268: {
                            continue block58;
                        }
                        case 609948528: {
                            break block58;
                        }
                    }
                    break;
                }
                this.slot = (int)v9;
                if (var1_3 || var1_3) ** GOTO lbl25
                v11 = io.ivc("jvl", iuz(int ), (int)465);
                v12 /* !! */  = io.ak;
                if (true) ** GOTO lbl92
                block59: while (true) {
                    v12 /* !! */  = (long)(v13 - io.ivc("jvm", ivg(int ), (int)101));
lbl92:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1621217590: {
                            v13 = io.ivc("jvn", ivg(int ), (int)102);
                            continue block59;
                        }
                        case 609948528: {
                            break block59;
                        }
                        case 2018115158: {
                            v13 = io.ivc("jvo", ivg(int ), (int)103);
                            continue block59;
                        }
                    }
                    break;
                }
                this.savedSlot = (int)v11;
                if (var1_3 || var1_3) ** GOTO lbl25
                v14 = io.ivc("jvp", iuz(int ), (int)466);
                v15 /* !! */  = io.ak;
                if (true) ** GOTO lbl108
                block60: while (true) {
                    v15 /* !! */  = (long)(v16 - io.ivc("jvq", ivg(int ), (int)104));
lbl108:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1796220403: {
                            v16 = io.ivc("jvr", ivg(int ), (int)105);
                            continue block60;
                        }
                        case 210293215: {
                            v16 = io.ivc("jvs", ivg(int ), (int)106);
                            continue block60;
                        }
                        case 403681136: {
                            v16 = io.ivc("jvt", ivg(int ), (int)107);
                            continue block60;
                        }
                        case 609948528: {
                            break block60;
                        }
                    }
                    break;
                }
                this.fromInventory = v14;
                if (var1_3 || var1_3) ** GOTO lbl25
                v17 = io.ivc("jvu", ivg(int ), (int)108);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = io.ak - io.ivc("jvv", ivg(int ), (int)109)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == io.ivc("jvw", iuz(int ), (int)467)) break;
                    v18 /* !! */  = (long)io.ivc("jvx", iuz(int ), (int)468);
                }
                this.phaseStartTime = (long)v17;
                if (var1_3 || var1_3) ** GOTO lbl25
                v19 = io.ivc("jvy", iuz(int ), (int)469);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = io.ak - io.ivc("jvz", ivg(int ), (int)110)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == io.ivc("jwa", iuz(int ), (int)470)) break;
                    v20 /* !! */  = (long)io.ivc("jwb", iuz(int ), (int)471);
                }
                this.currentDelay = (int)v19;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)io.ivc("jwc", iuz(int ), (int)472);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl145:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)io.ivc("jwd", iuz(int ), (int)473);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl150:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)io.ivc("jwe", iuz(int ), (int)474);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl155:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)io.ivc("jwf", iuz(int ), (int)475);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
lbl159:
            // 5 sources

            case 4: {
                var2_2 /* !! */  = (int)io.ivc("jwg", iuz(int ), (int)476);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 5: {
                var2_2 /* !! */  = (int)io.ivc("jwh", iuz(int ), (int)477);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl169:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)io.ivc("jwi", iuz(int ), (int)478);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl174:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)io.ivc("jwj", iuz(int ), (int)479);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 8: {
                var2_2 /* !! */  = (int)io.ivc("jwk", iuz(int ), (int)480);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)io.ivc("jwl", iuz(int ), (int)481);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)io.ivc("jwm", iuz(int ), (int)482);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
lbl191:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)io.ivc("jwn", iuz(int ), (int)483);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
lbl195:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)io.ivc("jwo", iuz(int ), (int)484);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)io.ivc("jwp", iuz(int ), (int)485);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl203:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)io.ivc("jwq", iuz(int ), (int)486);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
lbl207:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)io.ivc("jwr", iuz(int ), (int)487);
                    if (!var3_1) ** GOTO lbl159
                    throw null;
                }
            }
            case 16: {
                var2_2 /* !! */  = (int)io.ivc("jws", iuz(int ), (int)488);
                if (!var3_1) ** GOTO lbl195
                throw null;
            }
            case 17: 
        }
        var2_2 /* !! */  = (int)io.ivc("jwt", iuz(int ), (int)489);
        ** while (!var3_1)
lbl219:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isFromInventory() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("kcp", ivg(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == io.ivc("kcr", iuz(int ), (int)533)) break;
            v0 /* !! */  = (long)io.ivc("kcu", iuz(int ), (int)534);
        }
        var3_1 = io.c;
        v1 /* !! */  = io.ak;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - io.ivc("kcx", ivg(int ), (int)164));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1574267525: {
                    v2 = io.ivc("kda", ivg(int ), (int)165);
                    continue block13;
                }
                case -354559391: {
                    v2 = io.ivc("kdc", ivg(int ), (int)166);
                    continue block13;
                }
                case 609948528: {
                    break block13;
                }
                case 835932511: {
                    v2 = io.ivc("kde", ivg(int ), (int)167);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = io.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("kdh", ivg(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == io.ivc("kdj", iuz(int ), (int)535)) break;
            v3 /* !! */  = (long)io.ivc("kdk", iuz(int ), (int)536);
        }
        var1_3 = io.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (boolean)io.ivc("kdl", iuz(int ), (int)537);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("kdn", ivg(int ), (int)169)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == io.ivc("kdo", iuz(int ), (int)538)) break;
                    v4 /* !! */  = (long)io.ivc("kdq", iuz(int ), (int)539);
                }
                return this.fromInventory;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)io.ivc("kdr", iuz(int ), (int)540);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: {
                var2_2 /* !! */  = (int)io.ivc("kdt", iuz(int ), (int)541);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
lbl57:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)io.ivc("kdu", iuz(int ), (int)542);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)io.ivc("kdv", iuz(int ), (int)543);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void useFirework(boolean var1_1) {
        block45: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("iww", ivg(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == io.ivc("iwx", iuz(int ), (int)30)) break;
                v0 /* !! */  = (long)io.ivc("iwy", iuz(int ), (int)31);
            }
            var4_2 = io.c;
            v1 /* !! */  = io.ak;
            if (true) ** GOTO lbl11
            block28: while (true) {
                v1 /* !! */  = (long)(v2 - io.ivc("iwz", ivg(int ), (int)13));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1613268162: {
                        v2 = io.ivc("ixa", ivg(int ), (int)14);
                        continue block28;
                    }
                    case -517085706: {
                        v2 = io.ivc("ixb", ivg(int ), (int)15);
                        continue block28;
                    }
                    case -223226822: {
                        v2 = io.ivc("ixc", ivg(int ), (int)16);
                        continue block28;
                    }
                    case 609948528: {
                        break block28;
                    }
                }
                break;
            }
            var3_3 /* !! */  = io.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("ixd", ivg(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == io.ivc("ixe", iuz(int ), (int)32)) break;
                v3 /* !! */  = (long)io.ivc("ixf", iuz(int ), (int)33);
            }
            var2_4 = io.a;
            if (var4_2) {
                throw null;
lbl32:
                // 7 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl32
            if (!var1_1) break block45;
            if (var2_4 || var2_4) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = io.ak - io.ivc("ixg", ivg(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == io.ivc("ixh", iuz(int ), (int)34)) break;
                v4 /* !! */  = (long)io.ivc("ixi", iuz(int ), (int)35);
            }
            this.useSilent();
            if (var2_4) ** GOTO lbl32
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl71
        }
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                v5 /* !! */  = io.ak;
                if (true) ** GOTO lbl57
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - io.ivc("ixj", ivg(int ), (int)19));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1020046746: {
                            v6 = io.ivc("ixk", ivg(int ), (int)20);
                            continue block32;
                        }
                        case -716696186: {
                            v6 = io.ivc("ixl", ivg(int ), (int)21);
                            continue block32;
                        }
                        case 609948528: {
                            break block32;
                        }
                        case 1250495990: {
                            v6 = io.ivc("ixm", ivg(int ), (int)22);
                            continue block32;
                        }
                    }
                    break;
                }
                this.startLegit();
                if (var2_4) ** GOTO lbl32
lbl71:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)io.ivc("ixn", iuz(int ), (int)36);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl79:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)io.ivc("ixo", iuz(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)io.ivc("ixp", iuz(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 3: {
                var3_3 /* !! */  = (int)io.ivc("ixq", iuz(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)io.ivc("ixr", iuz(int ), (int)40);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)io.ivc("ixs", iuz(int ), (int)41);
                if (!var4_2) break;
                throw null;
            }
lbl102:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)io.ivc("ixt", iuz(int ), (int)42);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)io.ivc("ixu", iuz(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl111:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)io.ivc("ixv", iuz(int ), (int)44);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)io.ivc("ixw", iuz(int ), (int)45);
                if (!var4_2) ** GOTO lbl102
                throw null;
            }
lbl119:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)io.ivc("ixx", iuz(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)io.ivc("ixy", iuz(int ), (int)47);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)io.ivc("ixz", iuz(int ), (int)48);
        ** while (!var4_2)
lbl131:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkj() {
        io.ivi[0] = -5937411503958425460L;
        io.ivi[1] = -4441516451736336026L;
        io.ivi[2] = -1398737571956274391L;
        io.ivi[3] = -5666373827980914266L;
        io.ivi[4] = -5645224147592643417L;
        io.ivi[5] = -8440143217240573444L;
        io.ivi[6] = 4531112898054906832L;
        io.ivi[7] = 604286167430699432L;
        io.ivi[8] = -4257965913972270841L;
        io.ivi[9] = -1420320945711456239L;
        io.ivi[10] = 1623611090509853290L;
        io.ivi[11] = 6459325128767310572L;
        io.ivi[12] = -5508400890249149154L;
        io.ivi[13] = 7579366790552863423L;
        io.ivi[14] = -3453836510973242621L;
        io.ivi[15] = 6346312075465686134L;
        io.ivi[16] = 8987337189862309428L;
        io.ivi[17] = -4619107514363497217L;
        io.ivi[18] = 8976817989501816219L;
        io.ivi[19] = 2219717486975418420L;
        io.ivi[20] = 6179174783304008711L;
        io.ivi[21] = 6221480633357834181L;
        io.ivi[22] = -367121003668567919L;
        io.ivi[23] = -902719885374131730L;
        io.ivi[24] = -4672738059095235824L;
        io.ivi[25] = -7525760135719234731L;
        io.ivi[26] = -288776784375165767L;
        io.ivi[27] = -8699017044520827512L;
        io.ivi[28] = 3433063823626073112L;
        io.ivi[29] = -4716394188816009733L;
        io.ivi[30] = -1618730618765706522L;
        io.ivi[31] = -1100314392704132035L;
        io.ivi[32] = 5446475369394429969L;
        io.ivi[33] = -1949419379603514358L;
        io.ivi[34] = -2237082856660900160L;
        io.ivi[35] = -4952156418209934458L;
        io.ivi[36] = 6766319497075526584L;
        io.ivi[37] = -4729014276286746506L;
        io.ivi[38] = -1971596023258461669L;
        io.ivi[39] = -3342477757657523691L;
        io.ivi[40] = 1079444236818689134L;
        io.ivi[41] = -714061730307636752L;
        io.ivi[42] = 798051344770369939L;
        io.ivi[43] = -6390797116536323154L;
        io.ivi[44] = -6910045683680617329L;
        io.ivi[45] = 4222610753475619421L;
        io.ivi[46] = -2388229278387217462L;
        io.ivi[47] = 251193737079516050L;
        io.ivi[48] = 8764427082162863195L;
        io.ivi[49] = 1905660390542704321L;
        io.ivi[50] = 6820371277085120424L;
        io.ivi[51] = 3396477918059627308L;
        io.ivi[52] = 1827647926562550435L;
        io.ivi[53] = -5650188717070901848L;
        io.ivi[54] = -3471380858086074727L;
        io.ivi[55] = 2532749006593885869L;
        io.ivi[56] = 4299074674767323302L;
        io.ivi[57] = -4718292571211545197L;
        io.ivi[58] = -4032252384592524994L;
        io.ivi[59] = 2617293152106209335L;
        io.ivi[60] = 1615712547197900542L;
        io.ivi[61] = 783216903457725721L;
        io.ivi[62] = -5803252031125663478L;
        io.ivi[63] = -7772569926758188697L;
        io.ivi[64] = 4776358927878498688L;
        io.ivi[65] = -291114396630005282L;
        io.ivi[66] = 9165747727958900106L;
        io.ivi[67] = 15774279633712248L;
        io.ivi[68] = 7641754694797085067L;
        io.ivi[69] = -8688698196247000287L;
        io.ivi[70] = 3547114757248529767L;
        io.ivi[71] = -1105354672848290174L;
        io.ivi[72] = 2867900464021205695L;
        io.ivi[73] = 2690147718850805652L;
        io.ivi[74] = 8592844110505488400L;
        io.ivi[75] = 6693465188443334967L;
        io.ivi[76] = 4822908066492851359L;
        io.ivi[77] = 6858683664669433086L;
        io.ivi[78] = 7275273962728616680L;
        io.ivi[79] = -3289681499814914079L;
        io.ivi[80] = -5787859043242155926L;
        io.ivi[81] = 7108469456640096424L;
        io.ivi[82] = -7293909079060534741L;
        io.ivi[83] = -5673751547950801047L;
        io.ivi[84] = 2675098129641106436L;
        io.ivi[85] = 7398472983294232532L;
        io.ivi[86] = 5465700466348562972L;
        io.ivi[87] = 311969220115258978L;
        io.ivi[88] = 1141567291057364916L;
        io.ivi[89] = 1361900101861012711L;
        io.ivi[90] = -8318178475163718815L;
        io.ivi[91] = 1274395516859176109L;
        io.ivi[92] = -4793057879375424484L;
        io.ivi[93] = 1232620175844852459L;
        io.ivi[94] = -6912792369924689875L;
        io.ivi[95] = 7928042638080656399L;
        io.ivi[96] = 1638996154532448657L;
        io.ivi[97] = 2357243725539198875L;
        io.ivi[98] = 4558380516710819365L;
        io.ivi[99] = 1747902230160086755L;
    }

    static {
        iva = new int[614];
        ivb = new int[614];
        io.kjs();
        io.kjt();
        io.kju();
        io.kjv();
        io.kjw();
        io.kjx();
        io.kjy();
        io.kjz();
        io.kka();
        io.kkb();
        io.kkc();
        io.kkd();
        io.kke();
        io.kkf();
        ivh = new long[252];
        ivi = new long[252];
        io.kkg();
        io.kkh();
        io.kki();
        io.kkj();
        io.kkk();
        io.kkl();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_2596 lambda$useSilent$1(ov var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = io.ak - io.ivc("khp", ivg(int ), (int)221)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == io.ivc("khq", iuz(int ), (int)590)) break;
            v0 /* !! */  = (long)io.ivc("khr", iuz(int ), (int)591);
        }
        var4_2 = io.c;
        v1 /* !! */  = io.ak;
        if (true) ** GOTO lbl12
        block36: while (true) {
            v1 /* !! */  = (long)(io.ivc("kht", ivg(int ), (int)223) - io.ivc("khs", ivg(int ), (int)222));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 609948528: {
                    break block36;
                }
                case 1071957614: {
                    continue block36;
                }
            }
            break;
        }
        var3_3 /* !! */  = io.b;
        v2 /* !! */  = io.ak;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - io.ivc("khu", ivg(int ), (int)224));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -640193382: {
                    v3 = io.ivc("khv", ivg(int ), (int)225);
                    continue block37;
                }
                case 453182137: {
                    v3 = io.ivc("khw", ivg(int ), (int)226);
                    continue block37;
                }
                case 609948528: {
                    break block37;
                }
                case 993813500: {
                    v3 = io.ivc("khx", ivg(int ), (int)227);
                    continue block37;
                }
            }
            break;
        }
        var2_4 = io.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v4 /* !! */  = io.ak;
                if (true) ** GOTO lbl48
                block39: while (true) {
                    v4 /* !! */  = (long)(io.ivc("khz", ivg(int ), (int)229) - io.ivc("khy", ivg(int ), (int)228));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -356473175: {
                            continue block39;
                        }
                        case 609948528: {
                            break block39;
                        }
                    }
                    break;
                }
                v5 /* !! */  = io.ak;
                if (true) ** GOTO lbl57
                block40: while (true) {
                    v5 /* !! */  = (long)(v6 - io.ivc("kia", ivg(int ), (int)230));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -825851573: {
                            v6 = io.ivc("kib", ivg(int ), (int)231);
                            continue block40;
                        }
                        case 121565089: {
                            v6 = io.ivc("kic", ivg(int ), (int)232);
                            continue block40;
                        }
                        case 515082413: {
                            v6 = io.ivc("kid", ivg(int ), (int)233);
                            continue block40;
                        }
                        case 609948528: {
                            break block40;
                        }
                    }
                    break;
                }
                v7 /* !! */  = io.ak;
                if (true) ** GOTO lbl73
                block41: while (true) {
                    v7 /* !! */  = (long)(io.ivc("kif", ivg(int ), (int)235) - io.ivc("kie", ivg(int ), (int)234));
lbl73:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -178851167: {
                            continue block41;
                        }
                        case 609948528: {
                            break block41;
                        }
                    }
                    break;
                }
                v8 = var0.getYaw();
                v9 /* !! */  = io.ak;
                if (true) ** GOTO lbl83
                block42: while (true) {
                    v9 /* !! */  = (long)(v10 - io.ivc("kig", ivg(int ), (int)236));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1792912356: {
                            v10 = io.ivc("kih", ivg(int ), (int)237);
                            continue block42;
                        }
                        case 609948528: {
                            break block42;
                        }
                        case 768628563: {
                            v10 = io.ivc("kii", ivg(int ), (int)238);
                            continue block42;
                        }
                    }
                    break;
                }
                v11 = var0.getPitch();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = io.ak - io.ivc("kij", ivg(int ), (int)239)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == io.ivc("kik", iuz(int ), (int)592)) break;
                    v12 /* !! */  = (long)io.ivc("kil", iuz(int ), (int)593);
                }
                return new class_2886(class_1268.field_5808, var1_1, v8, v11);
            }
lbl100:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)io.ivc("kim", iuz(int ), (int)594);
                    if (!var4_2) break block10;
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)io.ivc("kin", iuz(int ), (int)595);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)io.ivc("kio", iuz(int ), (int)596);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)io.ivc("kip", iuz(int ), (int)597);
        ** while (!var4_2)
lbl117:
        // 1 sources

        throw null;
    }
}

