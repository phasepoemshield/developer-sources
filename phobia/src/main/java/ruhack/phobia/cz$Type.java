/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class cz$Type
extends Enum<cz$Type> {
    private static int[] bqha = new int[37];
    public static final boolean a;
    private static int[] bqhb;
    private static final /* synthetic */ cz$Type[] $VALUES;
    public static final boolean c;
    public static final /* enum */ cz$Type BLOCK;
    public static final /* enum */ cz$Type COLLISION;
    public static final /* enum */ cz$Type FISHING_ROD;
    public static final /* enum */ cz$Type WATER;
    public static final int b;
    static final long du = 1066164842592644309L;
    private static long[] bqgn;
    private static long[] bqgo;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private cz$Type() {
        var4_3 /* !! */  = cz$Type.b;
        var3_4 = cz$Type.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                ** GOTO lbl12
            }
            case 2: {
                var4_3 /* !! */  = (int)cz$Type.bqgp("bqie", bqgz(int ), (int)20);
lbl12:
                // 2 sources

                var4_3 /* !! */  = (int)cz$Type.bqgp("bqic", bqgz(int ), (int)18);
            }
            case 1: 
        }
        while (true) {
            var4_3 /* !! */  = (int)cz$Type.bqgp("bqid", bqgz(int ), (int)19);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static cz$Type[] values() {
        v0 /* !! */  = cz$Type.du;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(cz$Type.bqgp("bqgr", bqgm(int ), (int)1) - cz$Type.bqgp("bqgq", bqgm(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1967215403: {
                    break block20;
                }
                case -363921718: {
                    continue block20;
                }
            }
            break;
        }
        var2 = cz$Type.c;
        v1 /* !! */  = cz$Type.du;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - cz$Type.bqgp("bqgs", bqgm(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1967215403: {
                    break block21;
                }
                case -602740194: {
                    v2 = cz$Type.bqgp("bqgt", bqgm(int ), (int)3);
                    continue block21;
                }
                case -59634566: {
                    v2 = cz$Type.bqgp("bqgu", bqgm(int ), (int)4);
                    continue block21;
                }
                case 1267661189: {
                    v2 = cz$Type.bqgp("bqgv", bqgm(int ), (int)5);
                    continue block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = cz$Type.b;
        v3 /* !! */  = cz$Type.du;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(cz$Type.bqgp("bqgx", bqgm(int ), (int)7) - cz$Type.bqgp("bqgw", bqgm(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1967215403: {
                    break block22;
                }
                case 2126953295: {
                    continue block22;
                }
            }
            break;
        }
        var0_2 = cz$Type.a;
        if (var2) {
            throw null;
lbl40:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl40
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = cz$Type.du - cz$Type.bqgp("bqgy", bqgm(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == cz$Type.bqgp("bqhc", bqgz(int ), (int)0)) break;
                    v4 /* !! */  = (long)cz$Type.bqgp("bqhd", bqgz(int ), (int)1);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = cz$Type.du - cz$Type.bqgp("bqhe", bqgm(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == cz$Type.bqgp("bqhf", bqgz(int ), (int)2)) break;
                    v5 /* !! */  = (long)cz$Type.bqgp("bqhg", bqgz(int ), (int)3);
                }
                return (cz$Type[])cz$Type.$VALUES.clone();
            }
lbl60:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)cz$Type.bqgp("bqhh", bqgz(int ), (int)4);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)cz$Type.bqgp("bqhi", bqgz(int ), (int)5);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)cz$Type.bqgp("bqhj", bqgz(int ), (int)6);
                if (!var2) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)cz$Type.bqgp("bqhk", bqgz(int ), (int)7);
        ** while (!var2)
lbl77:
        // 1 sources

        throw null;
    }

    static {
        bqhb = new int[37];
        cz$Type.bqji();
        cz$Type.bqjj();
        bqgn = new long[30];
        bqgo = new long[30];
        cz$Type.bqjk();
        cz$Type.bqjl();
        COLLISION = new cz$Type();
        BLOCK = new cz$Type();
        WATER = new cz$Type();
        FISHING_ROD = new cz$Type();
        $VALUES = cz$Type.$values();
    }

    private static /* synthetic */ void bqjk() {
        cz$Type.bqgn[0] = -4872179642872564104L;
        cz$Type.bqgn[1] = 6423010968893650236L;
        cz$Type.bqgn[2] = -3672724806949431598L;
        cz$Type.bqgn[3] = -1830225491495053073L;
        cz$Type.bqgn[4] = -7384605913287533100L;
        cz$Type.bqgn[5] = 1391417680034250863L;
        cz$Type.bqgn[6] = -6243857601825913107L;
        cz$Type.bqgn[7] = -3872730130720301881L;
        cz$Type.bqgn[8] = 1089433824268145332L;
        cz$Type.bqgn[9] = -2772460787708978147L;
        cz$Type.bqgn[10] = 2148877669174227534L;
        cz$Type.bqgn[11] = 5526831239474961013L;
        cz$Type.bqgn[12] = -1365109801834216944L;
        cz$Type.bqgn[13] = 4376266906217856295L;
        cz$Type.bqgn[14] = -674556704386510732L;
        cz$Type.bqgn[15] = 1553747903925911601L;
        cz$Type.bqgn[16] = -4927746994933007361L;
        cz$Type.bqgn[17] = -4238360396531502370L;
        cz$Type.bqgn[18] = -7163461190976492265L;
        cz$Type.bqgn[19] = 76981421476503473L;
        cz$Type.bqgn[20] = 6523724073396182909L;
        cz$Type.bqgn[21] = 8203022692577993622L;
        cz$Type.bqgn[22] = 5858742842439202162L;
        cz$Type.bqgn[23] = 9071160090010543047L;
        cz$Type.bqgn[24] = 6521795910851721146L;
        cz$Type.bqgn[25] = -2603631065890954941L;
        cz$Type.bqgn[26] = 1354456057071591880L;
        cz$Type.bqgn[27] = -5870601495250999080L;
        cz$Type.bqgn[28] = 2153914386274662735L;
        cz$Type.bqgn[29] = -1408574616355741295L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static cz$Type valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cz$Type.du - cz$Type.bqgp("bqhl", bqgm(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cz$Type.bqgp("bqhm", bqgz(int ), (int)8)) break;
            v0 /* !! */  = (long)cz$Type.bqgp("bqhn", bqgz(int ), (int)9);
        }
        var3_1 = cz$Type.c;
        v1 /* !! */  = cz$Type.du;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - cz$Type.bqgp("bqho", bqgm(int ), (int)11));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1967215403: {
                    break block13;
                }
                case -1621328664: {
                    v2 = cz$Type.bqgp("bqhp", bqgm(int ), (int)12);
                    continue block13;
                }
                case -186763929: {
                    v2 = cz$Type.bqgp("bqhq", bqgm(int ), (int)13);
                    continue block13;
                }
                case -69699806: {
                    v2 = cz$Type.bqgp("bqhr", bqgm(int ), (int)14);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = cz$Type.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = cz$Type.du - cz$Type.bqgp("bqhs", bqgm(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == cz$Type.bqgp("bqht", bqgz(int ), (int)10)) break;
            v3 /* !! */  = (long)cz$Type.bqgp("bqhu", bqgz(int ), (int)11);
        }
        var1_3 = cz$Type.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = cz$Type.du - cz$Type.bqgp("bqhv", bqgm(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == cz$Type.bqgp("bqhw", bqgz(int ), (int)12)) break;
                    v4 /* !! */  = (long)cz$Type.bqgp("bqhx", bqgz(int ), (int)13);
                }
                return Enum.valueOf(cz$Type.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)cz$Type.bqgp("bqhy", bqgz(int ), (int)14);
                if (!var3_1) break;
                throw null;
            }
lbl52:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)cz$Type.bqgp("bqhz", bqgz(int ), (int)15);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cz$Type.bqgp("bqia", bqgz(int ), (int)16);
                    if (!var3_1) ** GOTO lbl52
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cz$Type.bqgp("bqib", bqgz(int ), (int)17);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bqgm(int n2) {
        return bqgn[n2] ^ bqgo[n2];
    }

    private static /* synthetic */ void bqji() {
        cz$Type.bqha[0] = -1471140453;
        cz$Type.bqha[1] = -699241342;
        cz$Type.bqha[2] = -1470423257;
        cz$Type.bqha[3] = -1278918223;
        cz$Type.bqha[4] = 374602988;
        cz$Type.bqha[5] = -1629520018;
        cz$Type.bqha[6] = -1969020523;
        cz$Type.bqha[7] = -1295998141;
        cz$Type.bqha[8] = 552231667;
        cz$Type.bqha[9] = 1606599181;
        cz$Type.bqha[10] = -279134721;
        cz$Type.bqha[11] = 1923700375;
        cz$Type.bqha[12] = 1813692273;
        cz$Type.bqha[13] = -1897293674;
        cz$Type.bqha[14] = -1972988349;
        cz$Type.bqha[15] = 497557764;
        cz$Type.bqha[16] = -634120154;
        cz$Type.bqha[17] = 817313601;
        cz$Type.bqha[18] = -1089328999;
        cz$Type.bqha[19] = -1126274215;
        cz$Type.bqha[20] = -504905990;
        cz$Type.bqha[21] = 985535250;
        cz$Type.bqha[22] = -1634499584;
        cz$Type.bqha[23] = 85413400;
        cz$Type.bqha[24] = -1064163095;
        cz$Type.bqha[25] = 383110694;
        cz$Type.bqha[26] = 1645809546;
        cz$Type.bqha[27] = 1726374258;
        cz$Type.bqha[28] = 1890468524;
        cz$Type.bqha[29] = 129506246;
        cz$Type.bqha[30] = 979257594;
        cz$Type.bqha[31] = -248681186;
        cz$Type.bqha[32] = -333427040;
        cz$Type.bqha[33] = -1215980090;
        cz$Type.bqha[34] = -299969116;
        cz$Type.bqha[35] = 1014193069;
        cz$Type.bqha[36] = -350371630;
    }

    private static /* synthetic */ int bqgz(int n2) {
        return bqha[n2] ^ bqhb[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ cz$Type[] $values() {
        block39: {
            v0 /* !! */  = cz$Type.du;
            if (true) ** GOTO lbl5
            block21: while (true) {
                v0 /* !! */  = (long)(v1 - cz$Type.bqgp("bqif", bqgm(int ), (int)17));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1967215403: {
                        break block21;
                    }
                    case -1757126009: {
                        v1 = cz$Type.bqgp("bqig", bqgm(int ), (int)18);
                        continue block21;
                    }
                    case 111230989: {
                        v1 = cz$Type.bqgp("bqih", bqgm(int ), (int)19);
                        continue block21;
                    }
                    case 347661439: {
                        v1 = cz$Type.bqgp("bqii", bqgm(int ), (int)20);
                        continue block21;
                    }
                }
                break;
            }
            var2 = cz$Type.c;
            v2 /* !! */  = cz$Type.du;
            block22: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -1967215403: {
                        break block22;
                    }
                    case 1016282936: {
                        v2 /* !! */  = (long)(cz$Type.bqgp("bqik", bqgm(int ), (int)22) - cz$Type.bqgp("bqij", bqgm(int ), (int)21));
                        continue block22;
                    }
                }
                break;
            }
            var1_1 /* !! */  = cz$Type.b;
            v3 /* !! */  = cz$Type.du;
            if (true) ** GOTO lbl31
            block23: while (true) {
                v3 /* !! */  = (long)(v4 - cz$Type.bqgp("bqil", bqgm(int ), (int)23));
lbl31:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1967215403: {
                        break block23;
                    }
                    case 1694930952: {
                        v4 = cz$Type.bqgp("bqim", bqgm(int ), (int)24);
                        continue block23;
                    }
                    case 1712498118: {
                        v4 = cz$Type.bqgp("bqin", bqgm(int ), (int)25);
                        continue block23;
                    }
                }
                break;
            }
            var0_2 = cz$Type.a;
            if (var2) {
                throw null;
            }
            if (var0_2) ** GOTO lbl48
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var0_2) ** GOTO lbl49
lbl48:
                    // 2 sources

                    return null;
lbl49:
                    // 1 sources

                    v5 = new cz$Type[4];
                    v6 = cz$Type.bqgp("bqio", bqgz(int ), (int)21);
                    while (true) {
                        if ((v7 = (cfr_temp_0 = cz$Type.du - cz$Type.bqgp("bqip", bqgm(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v7 == cz$Type.bqgp("bqiq", bqgz(int ), (int)22)) {
                            v5[v6] = cz$Type.COLLISION;
                            v8 = cz$Type.bqgp("bqir", bqgz(int ), (int)23);
                            break block39;
                        }
                        v7 = 195705057;
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)cz$Type.bqgp("bqjc", bqgz(int ), (int)31);
                    if (var2) {
                        throw null;
                    }
                }
                case 0: {
                    ** GOTO lbl69
                }
                case 3: {
                    var1_1 /* !! */  = (int)cz$Type.bqgp("bqjd", bqgz(int ), (int)32);
                    if (var2) {
                        throw null;
                    }
lbl69:
                    // 3 sources

                    var1_1 /* !! */  = (int)cz$Type.bqgp("bqja", bqgz(int ), (int)29);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            do {
                var1_1 /* !! */  = (int)cz$Type.bqgp("bqjb", bqgz(int ), (int)30);
            } while (!var2);
            throw null;
        }
        while (true) {
            if ((v9 = (cfr_temp_1 = cz$Type.du - cz$Type.bqgp("bqis", bqgm(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 == cz$Type.bqgp("bqit", bqgz(int ), (int)24)) break;
            v9 = -286597268;
        }
        v5[v8] = cz$Type.BLOCK;
        v10 = cz$Type.bqgp("bqiu", bqgz(int ), (int)25);
        while (true) {
            if ((v11 = (cfr_temp_2 = cz$Type.du - cz$Type.bqgp("bqiv", bqgm(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 == cz$Type.bqgp("bqiw", bqgz(int ), (int)26)) break;
            v11 = -905084631;
        }
        v5[v10] = cz$Type.WATER;
        v12 = cz$Type.bqgp("bqix", bqgz(int ), (int)27);
        while (true) {
            if ((v13 = (cfr_temp_3 = cz$Type.du - cz$Type.bqgp("bqiy", bqgm(int ), (int)29)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 == cz$Type.bqgp("bqiz", bqgz(int ), (int)28)) {
                v5[v12] = cz$Type.FISHING_ROD;
                return v5;
            }
            v13 = 1280391696;
        }
    }

    private static /* synthetic */ void bqjj() {
        cz$Type.bqhb[0] = -1471140454;
        cz$Type.bqhb[1] = 599230855;
        cz$Type.bqhb[2] = -1470423258;
        cz$Type.bqhb[3] = -529888601;
        cz$Type.bqhb[4] = 374602990;
        cz$Type.bqhb[5] = -1629520019;
        cz$Type.bqhb[6] = -1969020524;
        cz$Type.bqhb[7] = -1295998141;
        cz$Type.bqhb[8] = 552231666;
        cz$Type.bqhb[9] = -627658634;
        cz$Type.bqhb[10] = 279134720;
        cz$Type.bqhb[11] = 55212564;
        cz$Type.bqhb[12] = 1813692272;
        cz$Type.bqhb[13] = -1319929482;
        cz$Type.bqhb[14] = -1972988351;
        cz$Type.bqhb[15] = 497557764;
        cz$Type.bqhb[16] = -634120154;
        cz$Type.bqhb[17] = 817313602;
        cz$Type.bqhb[18] = -1089328999;
        cz$Type.bqhb[19] = -1126274213;
        cz$Type.bqhb[20] = -504905989;
        cz$Type.bqhb[21] = 985535250;
        cz$Type.bqhb[22] = 1634499583;
        cz$Type.bqhb[23] = 85413401;
        cz$Type.bqhb[24] = -1064163096;
        cz$Type.bqhb[25] = 383110692;
        cz$Type.bqhb[26] = -1645809547;
        cz$Type.bqhb[27] = 1726374257;
        cz$Type.bqhb[28] = 1890468525;
        cz$Type.bqhb[29] = 129506245;
        cz$Type.bqhb[30] = 979257594;
        cz$Type.bqhb[31] = -248681187;
        cz$Type.bqhb[32] = -333427039;
        cz$Type.bqhb[33] = -1215980090;
        cz$Type.bqhb[34] = -299969115;
        cz$Type.bqhb[35] = 1014193071;
        cz$Type.bqhb[36] = -350371631;
    }

    private static /* synthetic */ void bqjl() {
        cz$Type.bqgo[0] = 5069730946679774508L;
        cz$Type.bqgo[1] = -5952720832692466707L;
        cz$Type.bqgo[2] = 7025816846226789222L;
        cz$Type.bqgo[3] = 5374986011540046977L;
        cz$Type.bqgo[4] = 3004806861176922151L;
        cz$Type.bqgo[5] = -8236182673129241128L;
        cz$Type.bqgo[6] = 1395372156318897700L;
        cz$Type.bqgo[7] = -6359449525419705145L;
        cz$Type.bqgo[8] = -5505880025609638031L;
        cz$Type.bqgo[9] = 3376447270366829145L;
        cz$Type.bqgo[10] = 1289809251910046943L;
        cz$Type.bqgo[11] = -3873827266509597936L;
        cz$Type.bqgo[12] = -5310307171205111284L;
        cz$Type.bqgo[13] = 3871005591409008230L;
        cz$Type.bqgo[14] = 422927454898465404L;
        cz$Type.bqgo[15] = 4306522113936505443L;
        cz$Type.bqgo[16] = 4455400778238155251L;
        cz$Type.bqgo[17] = -3625260174081224140L;
        cz$Type.bqgo[18] = -5346497727427009383L;
        cz$Type.bqgo[19] = -7216807640395831358L;
        cz$Type.bqgo[20] = 250299200969006141L;
        cz$Type.bqgo[21] = 6036756976074864446L;
        cz$Type.bqgo[22] = 2862296551371131068L;
        cz$Type.bqgo[23] = -4065090004912953702L;
        cz$Type.bqgo[24] = -3632335321898281526L;
        cz$Type.bqgo[25] = -4248923298880628582L;
        cz$Type.bqgo[26] = 7321728716585520316L;
        cz$Type.bqgo[27] = 4464679112809610621L;
        cz$Type.bqgo[28] = 5336998370534397716L;
        cz$Type.bqgo[29] = 5828814042810751780L;
    }

    public static /* synthetic */ CallSite bqgp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

