/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

final class hd$MiningHit
extends Record {
    private static long[] gdrh;
    private final class_2350 side;
    private static int[] gdqz;
    private static int[] gdqy;
    private static long[] gdrg;
    public static final boolean a;
    private final class_243 hitVec;
    public static final boolean c;
    public static final int b;
    public static final long ng = 8404814908799833590L;
    private final class_2338 pos;

    private static /* synthetic */ void gduy() {
        hd$MiningHit.gdqz[0] = 725685616;
        hd$MiningHit.gdqz[1] = -841466157;
        hd$MiningHit.gdqz[2] = 1244862215;
        hd$MiningHit.gdqz[3] = -603194253;
        hd$MiningHit.gdqz[4] = 1354800906;
        hd$MiningHit.gdqz[5] = 1346881351;
        hd$MiningHit.gdqz[6] = -568116375;
        hd$MiningHit.gdqz[7] = -2001676275;
        hd$MiningHit.gdqz[8] = -1995391126;
        hd$MiningHit.gdqz[9] = -253724106;
        hd$MiningHit.gdqz[10] = 2061903884;
        hd$MiningHit.gdqz[11] = 1752363908;
        hd$MiningHit.gdqz[12] = -654580612;
        hd$MiningHit.gdqz[13] = 831418160;
        hd$MiningHit.gdqz[14] = -420944672;
        hd$MiningHit.gdqz[15] = 2088739164;
        hd$MiningHit.gdqz[16] = -1161935292;
        hd$MiningHit.gdqz[17] = -1230092879;
        hd$MiningHit.gdqz[18] = -1601750968;
        hd$MiningHit.gdqz[19] = 1086866924;
        hd$MiningHit.gdqz[20] = 2038385756;
        hd$MiningHit.gdqz[21] = -1109532804;
        hd$MiningHit.gdqz[22] = -1082848119;
        hd$MiningHit.gdqz[23] = 1856910644;
        hd$MiningHit.gdqz[24] = 1910675158;
        hd$MiningHit.gdqz[25] = -1649569107;
        hd$MiningHit.gdqz[26] = -2098055178;
        hd$MiningHit.gdqz[27] = -856444774;
        hd$MiningHit.gdqz[28] = -1408267230;
        hd$MiningHit.gdqz[29] = -269628636;
        hd$MiningHit.gdqz[30] = -381961597;
        hd$MiningHit.gdqz[31] = -555586690;
        hd$MiningHit.gdqz[32] = -311146953;
        hd$MiningHit.gdqz[33] = -2035930534;
        hd$MiningHit.gdqz[34] = -237505959;
        hd$MiningHit.gdqz[35] = -1383872343;
        hd$MiningHit.gdqz[36] = 237564855;
        hd$MiningHit.gdqz[37] = -262053811;
        hd$MiningHit.gdqz[38] = 1900373229;
        hd$MiningHit.gdqz[39] = -1106610343;
        hd$MiningHit.gdqz[40] = 1051951052;
        hd$MiningHit.gdqz[41] = -1534659788;
        hd$MiningHit.gdqz[42] = -1159679395;
        hd$MiningHit.gdqz[43] = 1805641579;
        hd$MiningHit.gdqz[44] = 1191114533;
        hd$MiningHit.gdqz[45] = 1541256652;
        hd$MiningHit.gdqz[46] = -1166045397;
        hd$MiningHit.gdqz[47] = -1578287967;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 hitVec() {
        v0 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(hd$MiningHit.gdra("gduj", gdrf(int ), (int)41) - hd$MiningHit.gdra("gdui", gdrf(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1556047200: {
                    continue block20;
                }
                case 32232950: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = hd$MiningHit.c;
        v1 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(hd$MiningHit.gdra("gdul", gdrf(int ), (int)43) - hd$MiningHit.gdra("gduk", gdrf(int ), (int)42));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1532696266: {
                    continue block21;
                }
                case 32232950: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = hd$MiningHit.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hd$MiningHit.ng - hd$MiningHit.gdra("gdum", gdrf(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hd$MiningHit.gdra("gdun", gdqx(int ), (int)42)) break;
            v2 /* !! */  = (long)hd$MiningHit.gdra("gduo", gdqx(int ), (int)43);
        }
        var1_3 = hd$MiningHit.a;
        if (var3_1) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl33:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = hd$MiningHit.ng;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - hd$MiningHit.gdra("gdup", gdrf(int ), (int)45));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1079039262: {
                            v4 = hd$MiningHit.gdra("gduq", gdrf(int ), (int)46);
                            continue block24;
                        }
                        case -163505978: {
                            v4 = hd$MiningHit.gdra("gdur", gdrf(int ), (int)47);
                            continue block24;
                        }
                        case -77683555: {
                            v4 = hd$MiningHit.gdra("gdus", gdrf(int ), (int)48);
                            continue block24;
                        }
                        case 32232950: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.hitVec;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdut", gdqx(int ), (int)44);
                } while (!var3_1);
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gduu", gdqx(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gduv", gdqx(int ), (int)46);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hd$MiningHit.gdra("gduw", gdqx(int ), (int)47);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long gdrf(int n2) {
        return gdrg[n2] ^ gdrh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(hd$MiningHit.gdra("gdrx", gdrf(int ), (int)11) - hd$MiningHit.gdra("gdrw", gdrf(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1950109102: {
                    continue block15;
                }
                case 32232950: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = hd$MiningHit.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hd$MiningHit.ng - hd$MiningHit.gdra("gdry", gdrf(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hd$MiningHit.gdra("gdrz", gdqx(int ), (int)8)) break;
            v1 /* !! */  = (long)hd$MiningHit.gdra("gdsa", gdqx(int ), (int)9);
        }
        var2_2 /* !! */  = hd$MiningHit.b;
        v2 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - hd$MiningHit.gdra("gdsb", gdrf(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1961918115: {
                    v3 = hd$MiningHit.gdra("gdsc", gdrf(int ), (int)14);
                    continue block17;
                }
                case 32232950: {
                    break block17;
                }
                case 622775229: {
                    v3 = hd$MiningHit.gdra("gdsd", gdrf(int ), (int)15);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = hd$MiningHit.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)hd$MiningHit.gdra("gdse", gdqx(int ), (int)10);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hd$MiningHit.ng - hd$MiningHit.gdra("gdsf", gdrf(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hd$MiningHit.gdra("gdsg", gdqx(int ), (int)11)) break;
                    v4 /* !! */  = (long)hd$MiningHit.gdra("gdsh", gdqx(int ), (int)12);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hd$MiningHit.class, "pos;side;hitVec", "pos", "side", "hitVec"}, this);
                case 0: {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdsi", gdqx(int ), (int)13);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdsj", gdqx(int ), (int)14);
                    if (!var3_1) break block18;
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdsk", gdqx(int ), (int)15);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdsl", gdqx(int ), (int)16);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void gdux() {
        hd$MiningHit.gdqy[0] = 725685617;
        hd$MiningHit.gdqy[1] = -841466160;
        hd$MiningHit.gdqy[2] = 1244862212;
        hd$MiningHit.gdqy[3] = -603194256;
        hd$MiningHit.gdqy[4] = 1354800905;
        hd$MiningHit.gdqy[5] = 1346881350;
        hd$MiningHit.gdqy[6] = -568116376;
        hd$MiningHit.gdqy[7] = -2001676276;
        hd$MiningHit.gdqy[8] = -1995391125;
        hd$MiningHit.gdqy[9] = 1042563019;
        hd$MiningHit.gdqy[10] = 69413376;
        hd$MiningHit.gdqy[11] = 1752363909;
        hd$MiningHit.gdqy[12] = -851110502;
        hd$MiningHit.gdqy[13] = 831418160;
        hd$MiningHit.gdqy[14] = -420944670;
        hd$MiningHit.gdqy[15] = 2088739164;
        hd$MiningHit.gdqy[16] = -1161935290;
        hd$MiningHit.gdqy[17] = -1230092880;
        hd$MiningHit.gdqy[18] = 2122344894;
        hd$MiningHit.gdqy[19] = 1086866924;
        hd$MiningHit.gdqy[20] = 2038385757;
        hd$MiningHit.gdqy[21] = -893664187;
        hd$MiningHit.gdqy[22] = -1082848117;
        hd$MiningHit.gdqy[23] = 1856910645;
        hd$MiningHit.gdqy[24] = 1910675159;
        hd$MiningHit.gdqy[25] = -1649569106;
        hd$MiningHit.gdqy[26] = -2098055177;
        hd$MiningHit.gdqy[27] = -1105997016;
        hd$MiningHit.gdqy[28] = -1408267232;
        hd$MiningHit.gdqy[29] = -269628634;
        hd$MiningHit.gdqy[30] = -381961600;
        hd$MiningHit.gdqy[31] = -555586689;
        hd$MiningHit.gdqy[32] = -311146954;
        hd$MiningHit.gdqy[33] = -1609311848;
        hd$MiningHit.gdqy[34] = -237505960;
        hd$MiningHit.gdqy[35] = 695866344;
        hd$MiningHit.gdqy[36] = 237564854;
        hd$MiningHit.gdqy[37] = -1731765276;
        hd$MiningHit.gdqy[38] = 1900373230;
        hd$MiningHit.gdqy[39] = -1106610341;
        hd$MiningHit.gdqy[40] = 1051951055;
        hd$MiningHit.gdqy[41] = -1534659788;
        hd$MiningHit.gdqy[42] = -1159679396;
        hd$MiningHit.gdqy[43] = 794400791;
        hd$MiningHit.gdqy[44] = 1191114533;
        hd$MiningHit.gdqy[45] = 1541256654;
        hd$MiningHit.gdqy[46] = -1166045399;
        hd$MiningHit.gdqy[47] = -1578287968;
    }

    public static /* synthetic */ CallSite gdra(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void gdva() {
        hd$MiningHit.gdrh[0] = 6232142366861286615L;
        hd$MiningHit.gdrh[1] = -3348424623826356712L;
        hd$MiningHit.gdrh[2] = -7413869414219799968L;
        hd$MiningHit.gdrh[3] = -7982363767685932629L;
        hd$MiningHit.gdrh[4] = -3264820228494892919L;
        hd$MiningHit.gdrh[5] = 8023183585598890327L;
        hd$MiningHit.gdrh[6] = -5740132946798504768L;
        hd$MiningHit.gdrh[7] = 4832310700557361037L;
        hd$MiningHit.gdrh[8] = 6351721004424957697L;
        hd$MiningHit.gdrh[9] = -4903334576584314273L;
        hd$MiningHit.gdrh[10] = -731162363123657154L;
        hd$MiningHit.gdrh[11] = -1331038695887505184L;
        hd$MiningHit.gdrh[12] = 8583121149095822652L;
        hd$MiningHit.gdrh[13] = -3386006036308711054L;
        hd$MiningHit.gdrh[14] = -3994442388433555746L;
        hd$MiningHit.gdrh[15] = -4968480505144820130L;
        hd$MiningHit.gdrh[16] = -7239896334210101068L;
        hd$MiningHit.gdrh[17] = -7235208671535605031L;
        hd$MiningHit.gdrh[18] = 1863040596825877877L;
        hd$MiningHit.gdrh[19] = -6334950578504568769L;
        hd$MiningHit.gdrh[20] = -8717835987851523734L;
        hd$MiningHit.gdrh[21] = 5517064978122479477L;
        hd$MiningHit.gdrh[22] = -1868125962015755004L;
        hd$MiningHit.gdrh[23] = 2584619186629486523L;
        hd$MiningHit.gdrh[24] = 3924465859120197625L;
        hd$MiningHit.gdrh[25] = 6629708385713046548L;
        hd$MiningHit.gdrh[26] = 2478184490506131869L;
        hd$MiningHit.gdrh[27] = 7755537674854767899L;
        hd$MiningHit.gdrh[28] = 836847370047541747L;
        hd$MiningHit.gdrh[29] = -5715799072790059980L;
        hd$MiningHit.gdrh[30] = -6474466444028590051L;
        hd$MiningHit.gdrh[31] = -4797884053219275690L;
        hd$MiningHit.gdrh[32] = 7652566068584452905L;
        hd$MiningHit.gdrh[33] = 203940424243500946L;
        hd$MiningHit.gdrh[34] = -5070049748314119532L;
        hd$MiningHit.gdrh[35] = 8237757743537714060L;
        hd$MiningHit.gdrh[36] = -6552695760603520670L;
        hd$MiningHit.gdrh[37] = -8154435030994606077L;
        hd$MiningHit.gdrh[38] = -6596302935595753051L;
        hd$MiningHit.gdrh[39] = -597334474437162199L;
        hd$MiningHit.gdrh[40] = 2271360477050001124L;
        hd$MiningHit.gdrh[41] = 396053454033703109L;
        hd$MiningHit.gdrh[42] = 1698705025275638013L;
        hd$MiningHit.gdrh[43] = 5966317157506121202L;
        hd$MiningHit.gdrh[44] = 1291625214018980562L;
        hd$MiningHit.gdrh[45] = -2784631490879371808L;
        hd$MiningHit.gdrh[46] = 8858876289383225868L;
        hd$MiningHit.gdrh[47] = 1312889571207384963L;
        hd$MiningHit.gdrh[48] = -1899363126240866666L;
    }

    private static /* synthetic */ int gdqx(int n2) {
        return gdqy[n2] ^ gdqz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2338 pos() {
        v0 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - hd$MiningHit.gdra("gdtd", gdrf(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 32232950: {
                    break block20;
                }
                case 88136046: {
                    v1 = hd$MiningHit.gdra("gdte", gdrf(int ), (int)26);
                    continue block20;
                }
                case 1498242840: {
                    v1 = hd$MiningHit.gdra("gdtf", gdrf(int ), (int)27);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = hd$MiningHit.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hd$MiningHit.ng - hd$MiningHit.gdra("gdtg", gdrf(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hd$MiningHit.gdra("gdth", gdqx(int ), (int)26)) break;
            v2 /* !! */  = (long)hd$MiningHit.gdra("gdti", gdqx(int ), (int)27);
        }
        var2_2 /* !! */  = hd$MiningHit.b;
        v3 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(hd$MiningHit.gdra("gdtk", gdrf(int ), (int)30) - hd$MiningHit.gdra("gdtj", gdrf(int ), (int)29));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2013026059: {
                    continue block22;
                }
                case 32232950: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = hd$MiningHit.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hd$MiningHit.ng;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - hd$MiningHit.gdra("gdtl", gdrf(int ), (int)31));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1883000786: {
                            v5 = hd$MiningHit.gdra("gdtm", gdrf(int ), (int)32);
                            continue block24;
                        }
                        case -1317345237: {
                            v5 = hd$MiningHit.gdra("gdtn", gdrf(int ), (int)33);
                            continue block24;
                        }
                        case 32232950: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.pos;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdto", gdqx(int ), (int)28);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdtp", gdqx(int ), (int)29);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdtq", gdqx(int ), (int)30);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdtr", gdqx(int ), (int)31);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - hd$MiningHit.gdra("gdri", gdrf(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 32232950: {
                    break block24;
                }
                case 86525813: {
                    v1 = hd$MiningHit.gdra("gdrj", gdrf(int ), (int)1);
                    continue block24;
                }
                case 880594693: {
                    v1 = hd$MiningHit.gdra("gdrk", gdrf(int ), (int)2);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = hd$MiningHit.c;
        v2 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(hd$MiningHit.gdra("gdrm", gdrf(int ), (int)4) - hd$MiningHit.gdra("gdrl", gdrf(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -107304511: {
                    continue block25;
                }
                case 32232950: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = hd$MiningHit.b;
        v3 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(hd$MiningHit.gdra("gdro", gdrf(int ), (int)6) - hd$MiningHit.gdra("gdrn", gdrf(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 32232950: {
                    break block26;
                }
                case 1782999093: {
                    continue block26;
                }
            }
            break;
        }
        var1_3 = hd$MiningHit.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hd$MiningHit.ng;
                if (true) ** GOTO lbl47
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - hd$MiningHit.gdra("gdrp", gdrf(int ), (int)7));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1985973848: {
                            v5 = hd$MiningHit.gdra("gdrq", gdrf(int ), (int)8);
                            continue block28;
                        }
                        case -1578865365: {
                            v5 = hd$MiningHit.gdra("gdrr", gdrf(int ), (int)9);
                            continue block28;
                        }
                        case 32232950: {
                            break block28;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{hd$MiningHit.class, "pos;side;hitVec", "pos", "side", "hitVec"}, this);
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdrs", gdqx(int ), (int)4);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdrt", gdqx(int ), (int)5);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdru", gdqx(int ), (int)6);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hd$MiningHit.gdra("gdrv", gdqx(int ), (int)7);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void gduz() {
        hd$MiningHit.gdrg[0] = -3848302528455473410L;
        hd$MiningHit.gdrg[1] = -8522584096395614097L;
        hd$MiningHit.gdrg[2] = -3072999739408677672L;
        hd$MiningHit.gdrg[3] = 910700967112202263L;
        hd$MiningHit.gdrg[4] = -3897640024228521024L;
        hd$MiningHit.gdrg[5] = -3418911852057665815L;
        hd$MiningHit.gdrg[6] = -882078960823832L;
        hd$MiningHit.gdrg[7] = -2808269168095492808L;
        hd$MiningHit.gdrg[8] = -2862423514695628307L;
        hd$MiningHit.gdrg[9] = -5734910572738783638L;
        hd$MiningHit.gdrg[10] = -1052116007929374228L;
        hd$MiningHit.gdrg[11] = 8177111659267553973L;
        hd$MiningHit.gdrg[12] = 5676672229059400550L;
        hd$MiningHit.gdrg[13] = 4727735599934046195L;
        hd$MiningHit.gdrg[14] = 608813962344233120L;
        hd$MiningHit.gdrg[15] = -484082603514489354L;
        hd$MiningHit.gdrg[16] = -940133455037938666L;
        hd$MiningHit.gdrg[17] = 7197904530843499464L;
        hd$MiningHit.gdrg[18] = -2032554792545226275L;
        hd$MiningHit.gdrg[19] = -4810309759098363770L;
        hd$MiningHit.gdrg[20] = -6622526330658907683L;
        hd$MiningHit.gdrg[21] = 6174153563994310388L;
        hd$MiningHit.gdrg[22] = -1837194969135662314L;
        hd$MiningHit.gdrg[23] = 4887065276911849324L;
        hd$MiningHit.gdrg[24] = 6616712093359280774L;
        hd$MiningHit.gdrg[25] = 1389660573729414528L;
        hd$MiningHit.gdrg[26] = -1245353099832242892L;
        hd$MiningHit.gdrg[27] = -4347399233532625270L;
        hd$MiningHit.gdrg[28] = -6609366347984901673L;
        hd$MiningHit.gdrg[29] = -7021014907783687517L;
        hd$MiningHit.gdrg[30] = 3534210176681971030L;
        hd$MiningHit.gdrg[31] = -4944295013968849298L;
        hd$MiningHit.gdrg[32] = 6586151818497401356L;
        hd$MiningHit.gdrg[33] = -7654869922698231129L;
        hd$MiningHit.gdrg[34] = 1089419206162880611L;
        hd$MiningHit.gdrg[35] = -1770814065719894833L;
        hd$MiningHit.gdrg[36] = -9076680353503432241L;
        hd$MiningHit.gdrg[37] = 4822428122071726612L;
        hd$MiningHit.gdrg[38] = -7973831317404469229L;
        hd$MiningHit.gdrg[39] = -6527142693944615814L;
        hd$MiningHit.gdrg[40] = -1454960598484758162L;
        hd$MiningHit.gdrg[41] = 2212523300664883970L;
        hd$MiningHit.gdrg[42] = -4146533897744769912L;
        hd$MiningHit.gdrg[43] = -2648503305256246527L;
        hd$MiningHit.gdrg[44] = 4019365088880351914L;
        hd$MiningHit.gdrg[45] = -6059246786582005018L;
        hd$MiningHit.gdrg[46] = -661145027399797231L;
        hd$MiningHit.gdrg[47] = 6676979628637078509L;
        hd$MiningHit.gdrg[48] = 1268817153920907032L;
    }

    static {
        gdqy = new int[48];
        gdqz = new int[48];
        hd$MiningHit.gdux();
        hd$MiningHit.gduy();
        gdrg = new long[49];
        gdrh = new long[49];
        hd$MiningHit.gduz();
        hd$MiningHit.gdva();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hd$MiningHit(class_2338 var1_1, class_2350 var2_2, class_243 var3_3) {
        var5_4 /* !! */  = hd$MiningHit.b;
        super();
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.pos = var1_1;
                this.side = var2_2;
                this.hitVec = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)hd$MiningHit.gdra("gdrb", gdqx(int ), (int)0);
                ** GOTO lbl15
            }
            case 1: {
                var5_4 /* !! */  = (int)hd$MiningHit.gdra("gdrc", gdqx(int ), (int)1);
            }
lbl15:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)hd$MiningHit.gdra("gdrd", gdqx(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)hd$MiningHit.gdra("gdre", gdqx(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - hd$MiningHit.gdra("gdsm", gdrf(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1066942569: {
                    v1 = hd$MiningHit.gdra("gdsn", gdrf(int ), (int)18);
                    continue block16;
                }
                case 32232950: {
                    break block16;
                }
                case 1391801024: {
                    v1 = hd$MiningHit.gdra("gdso", gdrf(int ), (int)19);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = hd$MiningHit.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hd$MiningHit.ng - hd$MiningHit.gdra("gdsp", gdrf(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hd$MiningHit.gdra("gdsq", gdqx(int ), (int)17)) break;
            v2 /* !! */  = (long)hd$MiningHit.gdra("gdsr", gdqx(int ), (int)18);
        }
        var3_3 /* !! */  = hd$MiningHit.b;
        v3 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - hd$MiningHit.gdra("gdss", gdrf(int ), (int)21));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 32232950: {
                    break block18;
                }
                case 217155665: {
                    v4 = hd$MiningHit.gdra("gdst", gdrf(int ), (int)22);
                    continue block18;
                }
                case 2050850639: {
                    v4 = hd$MiningHit.gdra("gdsu", gdrf(int ), (int)23);
                    continue block18;
                }
            }
            break;
        }
        var2_4 = hd$MiningHit.a;
        if (var4_2) {
            throw null;
            return (boolean)hd$MiningHit.gdra("gdsv", gdqx(int ), (int)19);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hd$MiningHit.ng - hd$MiningHit.gdra("gdsw", gdrf(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hd$MiningHit.gdra("gdsx", gdqx(int ), (int)20)) break;
                    v5 /* !! */  = (long)hd$MiningHit.gdra("gdsy", gdqx(int ), (int)21);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hd$MiningHit.class, "pos;side;hitVec", "pos", "side", "hitVec"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)hd$MiningHit.gdra("gdsz", gdqx(int ), (int)22);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                var3_3 /* !! */  = (int)hd$MiningHit.gdra("gdta", gdqx(int ), (int)23);
                if (var4_2) {
                    throw null;
                }
            }
lbl60:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hd$MiningHit.gdra("gdtb", gdqx(int ), (int)24);
                    if (!var4_2) break block10;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)hd$MiningHit.gdra("gdtc", gdqx(int ), (int)25);
        ** while (!var4_2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2350 side() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hd$MiningHit.ng - hd$MiningHit.gdra("gdts", gdrf(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hd$MiningHit.gdra("gdtt", gdqx(int ), (int)32)) break;
            v0 /* !! */  = (long)hd$MiningHit.gdra("gdtu", gdqx(int ), (int)33);
        }
        var3_1 = hd$MiningHit.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hd$MiningHit.ng - hd$MiningHit.gdra("gdtv", gdrf(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hd$MiningHit.gdra("gdtw", gdqx(int ), (int)34)) break;
            v1 /* !! */  = (long)hd$MiningHit.gdra("gdtx", gdqx(int ), (int)35);
        }
        var2_2 = hd$MiningHit.b;
        v2 /* !! */  = hd$MiningHit.ng;
        if (true) ** GOTO lbl19
        block7: while (true) {
            v2 /* !! */  = (long)(v3 - hd$MiningHit.gdra("gdty", gdrf(int ), (int)36));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 32232950: {
                    break block7;
                }
                case 946195886: {
                    v3 = hd$MiningHit.gdra("gdtz", gdrf(int ), (int)37);
                    continue block7;
                }
                case 1642247750: {
                    v3 = hd$MiningHit.gdra("gdua", gdrf(int ), (int)38);
                    continue block7;
                }
            }
            break;
        }
        var1_3 = hd$MiningHit.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hd$MiningHit.ng - hd$MiningHit.gdra("gdub", gdrf(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hd$MiningHit.gdra("gduc", gdqx(int ), (int)36)) break;
            v4 /* !! */  = (long)hd$MiningHit.gdra("gdud", gdqx(int ), (int)37);
        }
        return this.side;
    }
}

