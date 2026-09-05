/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_9848
 *  org.joml.Matrix3x2fStack
 *  org.joml.Vector3d
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_9848;
import org.joml.Matrix3x2fStack;
import org.joml.Vector3d;
import ruhack.phobia.c;

public final class nm
implements c {
    public static final int b;
    public static final boolean a;
    private static int[] lwqp;
    private static long[] lwqh;
    public static final boolean c;
    static final long uq = 440086776386375699L;
    public static double PI2;
    private static int[] lwqo;
    private static float contextAlpha;
    private static long[] lwqg;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int floorNearestMulN(int var0, int var1_1) {
        v0 /* !! */  = nm.uq;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - nm.lwqi("lxal", lwqf(int ), (int)96));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 788663839: {
                    v1 = nm.lwqi("lxam", lwqf(int ), (int)97);
                    continue block16;
                }
                case 1759203347: {
                    break block16;
                }
                case 1935590047: {
                    v1 = nm.lwqi("lxan", lwqf(int ), (int)98);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = nm.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxao", lwqf(int ), (int)99)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nm.lwqi("lxap", lwqn(int ), (int)161)) break;
            v2 /* !! */  = (long)nm.lwqi("lxaq", lwqn(int ), (int)162);
        }
        var3_3 /* !! */  = nm.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxar", lwqf(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nm.lwqi("lxas", lwqn(int ), (int)163)) break;
                    v3 /* !! */  = (long)nm.lwqi("lxat", lwqn(int ), (int)164);
                }
                var2_4 = nm.a;
                if (var4_2) {
                    throw null;
                    return (int)nm.lwqi("lxau", lwqn(int ), (int)165);
                }
                if (var2_4 || var2_4) ** continue;
                v4 = (double)var0 / (double)var1_1;
                v5 /* !! */  = nm.uq;
                if (true) ** GOTO lbl42
                block20: while (true) {
                    v5 /* !! */  = (long)(v6 - nm.lwqi("lxav", lwqf(int ), (int)101));
lbl42:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1361978346: {
                            v6 = nm.lwqi("lxaw", lwqf(int ), (int)102);
                            continue block20;
                        }
                        case 33398771: {
                            v6 = nm.lwqi("lxax", lwqf(int ), (int)103);
                            continue block20;
                        }
                        case 1759203347: {
                            break block20;
                        }
                    }
                    break;
                }
                return var1_1 * (int)Math.floor(v4);
            }
            case 0: {
                var3_3 /* !! */  = (int)nm.lwqi("lxay", lwqn(int ), (int)166);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 1: {
                var3_3 /* !! */  = (int)nm.lwqi("lxaz", lwqn(int ), (int)167);
                if (var4_2) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)nm.lwqi("lxba", lwqn(int ), (int)168);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)nm.lwqi("lxbb", lwqn(int ), (int)169);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Vector3d interpolate(Vector3d var0, Vector3d var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxij", lwqf(int ), (int)189)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nm.lwqi("lxik", lwqn(int ), (int)274)) break;
            v0 /* !! */  = (long)nm.lwqi("lxil", lwqn(int ), (int)275);
        }
        var4_2 = nm.c;
        v1 /* !! */  = nm.uq;
        if (true) ** GOTO lbl11
        block27: while (true) {
            v1 /* !! */  = (long)(nm.lwqi("lxin", lwqf(int ), (int)191) - nm.lwqi("lxim", lwqf(int ), (int)190));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1759203347: {
                    break block27;
                }
                case 2069218528: {
                    continue block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl21
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - nm.lwqi("lxio", lwqf(int ), (int)192));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2115744112: {
                    v3 = nm.lwqi("lxip", lwqf(int ), (int)193);
                    continue block28;
                }
                case -606682867: {
                    v3 = nm.lwqi("lxiq", lwqf(int ), (int)194);
                    continue block28;
                }
                case 1759203347: {
                    break block28;
                }
            }
            break;
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v4 /* !! */  = nm.uq;
                if (true) ** GOTO lbl44
                block30: while (true) {
                    v4 /* !! */  = (long)(v5 - nm.lwqi("lxir", lwqf(int ), (int)195));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 229867326: {
                            v5 = nm.lwqi("lxis", lwqf(int ), (int)196);
                            continue block30;
                        }
                        case 310951755: {
                            v5 = nm.lwqi("lxit", lwqf(int ), (int)197);
                            continue block30;
                        }
                        case 1578017083: {
                            v5 = nm.lwqi("lxiu", lwqf(int ), (int)198);
                            continue block30;
                        }
                        case 1759203347: {
                            break block30;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxiv", lwqf(int ), (int)199)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nm.lwqi("lxiw", lwqn(int ), (int)276)) break;
                    v6 /* !! */  = (long)nm.lwqi("lxix", lwqn(int ), (int)277);
                }
                v7 = var0.x;
                v8 /* !! */  = nm.uq;
                if (true) ** GOTO lbl66
                block32: while (true) {
                    v8 /* !! */  = (long)(v9 - nm.lwqi("lxiy", lwqf(int ), (int)200));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -931749200: {
                            v9 = nm.lwqi("lxiz", lwqf(int ), (int)201);
                            continue block32;
                        }
                        case 1759203347: {
                            break block32;
                        }
                        case 1952288626: {
                            v9 = nm.lwqi("lxja", lwqf(int ), (int)202);
                            continue block32;
                        }
                    }
                    break;
                }
                v10 = var1_1.x;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxjb", lwqf(int ), (int)203)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nm.lwqi("lxjc", lwqn(int ), (int)278)) break;
                    v11 /* !! */  = (long)nm.lwqi("lxjd", lwqn(int ), (int)279);
                }
                v12 = nm.interpolate(v7, v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxje", lwqf(int ), (int)204)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nm.lwqi("lxjf", lwqn(int ), (int)280)) break;
                    v13 /* !! */  = (long)nm.lwqi("lxjg", lwqn(int ), (int)281);
                }
                v14 = var0.y;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lxjh", lwqf(int ), (int)205)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == nm.lwqi("lxji", lwqn(int ), (int)282)) break;
                    v15 /* !! */  = (long)nm.lwqi("lxjj", lwqn(int ), (int)283);
                }
                v16 = var1_1.y;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = nm.uq - nm.lwqi("lxjk", lwqf(int ), (int)206)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == nm.lwqi("lxjl", lwqn(int ), (int)284)) break;
                    v17 /* !! */  = (long)nm.lwqi("lxjm", lwqn(int ), (int)285);
                }
                v18 = nm.interpolate(v14, v16);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = nm.uq - nm.lwqi("lxjn", lwqf(int ), (int)207)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == nm.lwqi("lxjo", lwqn(int ), (int)286)) break;
                    v19 /* !! */  = (long)nm.lwqi("lxjp", lwqn(int ), (int)287);
                }
                v20 = var0.z;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = nm.uq - nm.lwqi("lxjq", lwqf(int ), (int)208)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == nm.lwqi("lxjr", lwqn(int ), (int)288)) break;
                    v21 /* !! */  = (long)nm.lwqi("lxjs", lwqn(int ), (int)289);
                }
                v22 = var1_1.z;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = nm.uq - nm.lwqi("lxjt", lwqf(int ), (int)209)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == nm.lwqi("lxju", lwqn(int ), (int)290)) break;
                    v23 /* !! */  = (long)nm.lwqi("lxjv", lwqn(int ), (int)291);
                }
                v24 = nm.interpolate(v20, v22);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_9 = nm.uq - nm.lwqi("lxjw", lwqf(int ), (int)210)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == nm.lwqi("lxjx", lwqn(int ), (int)292)) break;
                    v25 /* !! */  = (long)nm.lwqi("lxjy", lwqn(int ), (int)293);
                }
                return new Vector3d(v12, v18, v24);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)nm.lwqi("lxjz", lwqn(int ), (int)294);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)nm.lwqi("lxka", lwqn(int ), (int)295);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)nm.lwqi("lxkb", lwqn(int ), (int)296);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)nm.lwqi("lxkc", lwqn(int ), (int)297);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ long lwqf(int n2) {
        return lwqg[n2] ^ lwqh[n2];
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public static int getBlue(int n2) {
        CallSite callSite;
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = uq - nm.lwqi("lxci", lwqf(int ), (int)116)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == nm.lwqi("lxcj", lwqn(int ), (int)190)) break;
            object = nm.lwqi("lxck", lwqn(int ), (int)191);
        }
        boolean bl3 = c;
        Object object = uq;
        block11: while (true) {
            switch ((int)object) {
                case -1232136397: {
                    object = nm.lwqi("lxcm", lwqf(int ), (int)118) - nm.lwqi("lxcl", lwqf(int ), (int)117);
                    continue block11;
                }
                case 1759203347: {
                    break block11;
                }
            }
            break;
        }
        int n3 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = uq - nm.lwqi("lxcn", lwqf(int ), (int)119)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == nm.lwqi("lxco", lwqn(int ), (int)192)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = nm.lwqi("lxcp", lwqn(int ), (int)193);
        }
        if (!bl2 && !bl2) {
            return n2 & nm.lwqi("lxcr", lwqn(int ), (int)195);
        }
        if (n3 == 0) return (int)nm.lwqi("lxcq", lwqn(int ), (int)194);
        switch (n3) {
            default: {
                return (int)nm.lwqi("lxcq", lwqn(int ), (int)194);
            }
            case 0: {
                CallSite callSite2 = nm.lwqi("lxcs", lwqn(int ), (int)196);
                if (bl3) {
                    throw null;
                }
            }
            case 2: {
                CallSite callSite3 = nm.lwqi("lxcu", lwqn(int ), (int)198);
                if (bl3) {
                    throw null;
                }
            }
            case 1: {
                break;
            }
            case 3: {
                callSite = nm.lwqi("lxcv", lwqn(int ), (int)199);
                if (!bl3) break;
                throw null;
            }
        }
        do {
            callSite = nm.lwqi("lxct", lwqn(int ), (int)197);
            if (bl3) {
                throw null;
            }
            callSite = nm.lwqi("lxcv", lwqn(int ), (int)199);
        } while (!bl3);
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private nm() {
        int n2 = b;
        boolean bl2 = a;
        if (n2 == 0) throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
        switch (n2) {
            default: {
                throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
            }
            case 0: {
                CallSite callSite = nm.lwqi("lxrt", lwqn(int ), (int)391);
            }
            case 1: {
                CallSite callSite = nm.lwqi("lxru", lwqn(int ), (int)392);
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = nm.lwqi("lxrv", lwqn(int ), (int)393);
        }
    }

    private static /* synthetic */ void lxsp() {
        nm.lwqo[300] = 435151103;
        nm.lwqo[301] = 419756837;
        nm.lwqo[302] = 1436811358;
        nm.lwqo[303] = 814874212;
        nm.lwqo[304] = 1600958881;
        nm.lwqo[305] = -1260747435;
        nm.lwqo[306] = 170501600;
        nm.lwqo[307] = -1201500125;
        nm.lwqo[308] = -1308411654;
        nm.lwqo[309] = 1532103996;
        nm.lwqo[310] = -427965775;
        nm.lwqo[311] = 1120029161;
        nm.lwqo[312] = 123205360;
        nm.lwqo[313] = -665752378;
        nm.lwqo[314] = 645816570;
        nm.lwqo[315] = -1250138672;
        nm.lwqo[316] = 128694462;
        nm.lwqo[317] = -102667371;
        nm.lwqo[318] = 1409302033;
        nm.lwqo[319] = -748378913;
        nm.lwqo[320] = -809991506;
        nm.lwqo[321] = -726200878;
        nm.lwqo[322] = 1354867426;
        nm.lwqo[323] = 971513684;
        nm.lwqo[324] = -1300377638;
        nm.lwqo[325] = 622979837;
        nm.lwqo[326] = -2104915594;
        nm.lwqo[327] = -1323849174;
        nm.lwqo[328] = -715861766;
        nm.lwqo[329] = 2132776990;
        nm.lwqo[330] = 800422225;
        nm.lwqo[331] = 541990838;
        nm.lwqo[332] = -9748900;
        nm.lwqo[333] = -562339029;
        nm.lwqo[334] = -495366998;
        nm.lwqo[335] = 1678225791;
        nm.lwqo[336] = -461378980;
        nm.lwqo[337] = 945541323;
        nm.lwqo[338] = -1122981294;
        nm.lwqo[339] = -455944506;
        nm.lwqo[340] = -601115471;
        nm.lwqo[341] = -59265272;
        nm.lwqo[342] = 1980199734;
        nm.lwqo[343] = 1818536530;
        nm.lwqo[344] = -343534367;
        nm.lwqo[345] = -43195651;
        nm.lwqo[346] = 2099125130;
        nm.lwqo[347] = -1635272351;
        nm.lwqo[348] = -178738297;
        nm.lwqo[349] = 1041155019;
        nm.lwqo[350] = -912344253;
        nm.lwqo[351] = -1815465977;
        nm.lwqo[352] = 1510597769;
        nm.lwqo[353] = 1316904312;
        nm.lwqo[354] = -150905;
        nm.lwqo[355] = 1219925339;
        nm.lwqo[356] = 1335919211;
        nm.lwqo[357] = 1689354736;
        nm.lwqo[358] = 1976472544;
        nm.lwqo[359] = 1690588981;
        nm.lwqo[360] = 564153461;
        nm.lwqo[361] = 1385240637;
        nm.lwqo[362] = 425286680;
        nm.lwqo[363] = -282094314;
        nm.lwqo[364] = 1793020687;
        nm.lwqo[365] = -2133833655;
        nm.lwqo[366] = 1366881385;
        nm.lwqo[367] = -1915917935;
        nm.lwqo[368] = 1782917913;
        nm.lwqo[369] = 2104769339;
        nm.lwqo[370] = -1566154222;
        nm.lwqo[371] = 1559620769;
        nm.lwqo[372] = 991645914;
        nm.lwqo[373] = 1161518475;
        nm.lwqo[374] = -475006021;
        nm.lwqo[375] = -1039727436;
        nm.lwqo[376] = -421649387;
        nm.lwqo[377] = 1201238593;
        nm.lwqo[378] = 1381533622;
        nm.lwqo[379] = -1282119716;
        nm.lwqo[380] = 1474230500;
        nm.lwqo[381] = -1248871876;
        nm.lwqo[382] = -535181284;
        nm.lwqo[383] = -63846711;
        nm.lwqo[384] = -1261113745;
        nm.lwqo[385] = -959093305;
        nm.lwqo[386] = 311276932;
        nm.lwqo[387] = -800023086;
        nm.lwqo[388] = 1373206794;
        nm.lwqo[389] = 1248967785;
        nm.lwqo[390] = 1578220837;
        nm.lwqo[391] = 274287884;
        nm.lwqo[392] = 109179459;
        nm.lwqo[393] = -134733577;
        nm.lwqo[394] = 1233522684;
        nm.lwqo[395] = -587505612;
        nm.lwqo[396] = -1760382168;
        nm.lwqo[397] = 1145784861;
        nm.lwqo[398] = -1219172612;
        nm.lwqo[399] = -1951055928;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float clamp(float var0, float var1_1, float var2_2) {
        block18: {
            block17: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwsj", lwqf(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == nm.lwqi("lwsk", lwqn(int ), (int)29)) break;
                    v0 /* !! */  = (long)nm.lwqi("lwsl", lwqn(int ), (int)30);
                }
                var5_3 = nm.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwsm", lwqf(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == nm.lwqi("lwsn", lwqn(int ), (int)31)) break;
                    v1 /* !! */  = (long)nm.lwqi("lwso", lwqn(int ), (int)32);
                }
                var4_4 = nm.b;
                v2 /* !! */  = nm.uq;
                if (true) ** GOTO lbl19
                block8: while (true) {
                    v2 /* !! */  = (long)(v3 - nm.lwqi("lwsp", lwqf(int ), (int)21));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1543440658: {
                            v3 = nm.lwqi("lwsq", lwqf(int ), (int)22);
                            continue block8;
                        }
                        case -830426017: {
                            v3 = nm.lwqi("lwsr", lwqf(int ), (int)23);
                            continue block8;
                        }
                        case 649856856: {
                            v3 = nm.lwqi("lwss", lwqf(int ), (int)24);
                            continue block8;
                        }
                        case 1759203347: {
                            break block8;
                        }
                    }
                    break;
                }
                var3_5 = nm.a;
                if (var5_3) {
                    throw null;
lbl34:
                    // 3 sources

                    return (float)nm.lwqi("lwst", lwrs(int ), (int)33);
                }
                if (var3_5 || var3_5) ** GOTO lbl34
                if (!(var0 < var1_1)) break block17;
                if (var3_5) ** GOTO lbl34
                v4 = var1_1;
                if (var5_3) {
                    throw null;
                }
                break block18;
            }
            if (!var3_5 && !var3_5) ** break;
            ** while (true)
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lwsu", lwqf(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == nm.lwqi("lwsv", lwqn(int ), (int)34)) {
                    v4 = Math.min(var0, var2_2);
                    break;
                }
                v5 /* !! */  = (long)nm.lwqi("lwsw", lwqn(int ), (int)35);
            }
        }
        return v4;
    }

    private static /* synthetic */ void lxtb() {
        nm.lwqh[100] = -2960212474953858942L;
        nm.lwqh[101] = 4027617318220356104L;
        nm.lwqh[102] = -5775439389366807425L;
        nm.lwqh[103] = -6167321119872018234L;
        nm.lwqh[104] = -3742709015552675574L;
        nm.lwqh[105] = 7587558066192820840L;
        nm.lwqh[106] = 8363221677402755970L;
        nm.lwqh[107] = 5286891713040867282L;
        nm.lwqh[108] = 5230290616188548139L;
        nm.lwqh[109] = 7299612538815618479L;
        nm.lwqh[110] = -7931073352852785938L;
        nm.lwqh[111] = 145723612008128219L;
        nm.lwqh[112] = -1532449385165793718L;
        nm.lwqh[113] = -1582043216446601225L;
        nm.lwqh[114] = 178885196897142804L;
        nm.lwqh[115] = 6133291967305993013L;
        nm.lwqh[116] = -48823504081988398L;
        nm.lwqh[117] = 6067192747613486141L;
        nm.lwqh[118] = -6494758547427145993L;
        nm.lwqh[119] = -8310953529448546436L;
        nm.lwqh[120] = -2982235353074285564L;
        nm.lwqh[121] = -454549148918950279L;
        nm.lwqh[122] = -9190017266179354538L;
        nm.lwqh[123] = 6728761580297214646L;
        nm.lwqh[124] = -8524979145309379567L;
        nm.lwqh[125] = 8481601899997337531L;
        nm.lwqh[126] = 2784242222465697335L;
        nm.lwqh[127] = -8416379451702446690L;
        nm.lwqh[128] = -5142113962744015009L;
        nm.lwqh[129] = 1807089418615644671L;
        nm.lwqh[130] = -9147144099512772473L;
        nm.lwqh[131] = -8734076533303800026L;
        nm.lwqh[132] = 5025671902388914013L;
        nm.lwqh[133] = -1587242243083019319L;
        nm.lwqh[134] = -196374272984496743L;
        nm.lwqh[135] = 6655970915627853117L;
        nm.lwqh[136] = -748944337597869744L;
        nm.lwqh[137] = 173672110086609679L;
        nm.lwqh[138] = -2089770552048219881L;
        nm.lwqh[139] = 4503837222080651991L;
        nm.lwqh[140] = 1108563140482145742L;
        nm.lwqh[141] = 4114333279722137747L;
        nm.lwqh[142] = 7400323342554054182L;
        nm.lwqh[143] = -6363545174763245348L;
        nm.lwqh[144] = 1955360970355095768L;
        nm.lwqh[145] = 1319217145157699936L;
        nm.lwqh[146] = -7876697712853812269L;
        nm.lwqh[147] = -5092380149215834069L;
        nm.lwqh[148] = 5445925277122699056L;
        nm.lwqh[149] = 2096868619868081291L;
        nm.lwqh[150] = -6470853659860065172L;
        nm.lwqh[151] = -8702752841770623610L;
        nm.lwqh[152] = -8843299562571585583L;
        nm.lwqh[153] = -6415524929631068663L;
        nm.lwqh[154] = -8899828706638975597L;
        nm.lwqh[155] = -3706673788916325071L;
        nm.lwqh[156] = 8666178493790905463L;
        nm.lwqh[157] = -2053892398483678984L;
        nm.lwqh[158] = 6693104858054562191L;
        nm.lwqh[159] = -8823543179644005036L;
        nm.lwqh[160] = -3947748330630076038L;
        nm.lwqh[161] = 8840892082297165567L;
        nm.lwqh[162] = -7159509820035304153L;
        nm.lwqh[163] = 4970229527334854117L;
        nm.lwqh[164] = 4505605459784759160L;
        nm.lwqh[165] = 2619908282840335582L;
        nm.lwqh[166] = -580711350007261101L;
        nm.lwqh[167] = 7450935611893440664L;
        nm.lwqh[168] = -1987090665424290814L;
        nm.lwqh[169] = -6939943046650316458L;
        nm.lwqh[170] = 6986311104851877840L;
        nm.lwqh[171] = 2925714409040342772L;
        nm.lwqh[172] = 3163033606008640985L;
        nm.lwqh[173] = -5856087122835920627L;
        nm.lwqh[174] = 447075460701840610L;
        nm.lwqh[175] = -2204428265153403944L;
        nm.lwqh[176] = -4996055341735040461L;
        nm.lwqh[177] = 8181667686314803787L;
        nm.lwqh[178] = 5844131118540070096L;
        nm.lwqh[179] = -4725572825139240884L;
        nm.lwqh[180] = 3007648642109887241L;
        nm.lwqh[181] = -4531498981075441615L;
        nm.lwqh[182] = 4238143014624508268L;
        nm.lwqh[183] = -8860967869560992642L;
        nm.lwqh[184] = 4771656102146298434L;
        nm.lwqh[185] = -1944278137007811244L;
        nm.lwqh[186] = 3321683262271060144L;
        nm.lwqh[187] = -4320456135953542199L;
        nm.lwqh[188] = 3629113505696183292L;
        nm.lwqh[189] = 6943587888823810505L;
        nm.lwqh[190] = 4407858653059447904L;
        nm.lwqh[191] = 396840923826158702L;
        nm.lwqh[192] = -720267037272584844L;
        nm.lwqh[193] = 6553910536772044868L;
        nm.lwqh[194] = 8625998655640059071L;
        nm.lwqh[195] = -2795060518362259398L;
        nm.lwqh[196] = -6269594134345114355L;
        nm.lwqh[197] = -6283171695939113909L;
        nm.lwqh[198] = 2397071069342948846L;
        nm.lwqh[199] = -2167066508848103162L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float interpolate(float var0, float var1_1) {
        v0 /* !! */  = nm.uq;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - nm.lwqi("lxon", lwqf(int ), (int)270));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 387209325: {
                    v1 = nm.lwqi("lxoo", lwqf(int ), (int)271);
                    continue block23;
                }
                case 1522484868: {
                    v1 = nm.lwqi("lxop", lwqf(int ), (int)272);
                    continue block23;
                }
                case 1759203347: {
                    break block23;
                }
                case 1766961592: {
                    v1 = nm.lwqi("lxoq", lwqf(int ), (int)273);
                    continue block23;
                }
            }
            break;
        }
        var4_2 = nm.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxor", lwqf(int ), (int)274)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nm.lwqi("lxos", lwqn(int ), (int)353)) break;
            v2 /* !! */  = (long)nm.lwqi("lxot", lwqn(int ), (int)354);
        }
        var3_3 /* !! */  = nm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxou", lwqf(int ), (int)275)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nm.lwqi("lxov", lwqn(int ), (int)355)) break;
            v3 /* !! */  = (long)nm.lwqi("lxow", lwqn(int ), (int)356);
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
            return (float)nm.lwqi("lxox", lwrs(int ), (int)357);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = nm.uq;
                if (true) ** GOTO lbl42
                block27: while (true) {
                    v4 /* !! */  = (long)(v5 - nm.lwqi("lxoy", lwqf(int ), (int)276));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1051734898: {
                            v5 = nm.lwqi("lxoz", lwqf(int ), (int)277);
                            continue block27;
                        }
                        case 1540749990: {
                            v5 = nm.lwqi("lxpa", lwqf(int ), (int)278);
                            continue block27;
                        }
                        case 1759203347: {
                            break block27;
                        }
                        case 1767521234: {
                            v5 = nm.lwqi("lxpb", lwqf(int ), (int)279);
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxpc", lwqf(int ), (int)280)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nm.lwqi("lxpd", lwqn(int ), (int)358)) break;
                    v6 /* !! */  = (long)nm.lwqi("lxpe", lwqn(int ), (int)359);
                }
                v7 = nm.mc.method_61966();
                v8 = nm.lwqi("lxpf", lwqn(int ), (int)360);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxpg", lwqf(int ), (int)281)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nm.lwqi("lxph", lwqn(int ), (int)361)) break;
                    v9 /* !! */  = (long)nm.lwqi("lxpi", lwqn(int ), (int)362);
                }
                v10 = v7.method_60637((boolean)v8);
                v11 /* !! */  = nm.uq;
                if (true) ** GOTO lbl71
                block30: while (true) {
                    v11 /* !! */  = (long)(v12 - nm.lwqi("lxpj", lwqf(int ), (int)282));
lbl71:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1759203347: {
                            break block30;
                        }
                        case 1875885983: {
                            v12 = nm.lwqi("lxpk", lwqf(int ), (int)283);
                            continue block30;
                        }
                        case 1919568196: {
                            v12 = nm.lwqi("lxpl", lwqf(int ), (int)284);
                            continue block30;
                        }
                    }
                    break;
                }
                return class_3532.method_16439((float)v10, (float)var0, (float)var1_1);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nm.lwqi("lxpm", lwqn(int ), (int)363);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)nm.lwqi("lxpn", lwqn(int ), (int)364);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)nm.lwqi("lxpo", lwqn(int ), (int)365);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nm.lwqi("lxpp", lwqn(int ), (int)366);
        ** while (!var4_2)
lbl99:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double absSinAnimation(double var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxhn", lwqf(int ), (int)177)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lxho", lwqn(int ), (int)264)) break;
            v0 /* !! */  = (long)nm.lwqi("lxhp", lwqn(int ), (int)265);
        }
        var4_1 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxhq", lwqf(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nm.lwqi("lxhr", lwqn(int ), (int)266)) break;
            v1 /* !! */  = (long)nm.lwqi("lxhs", lwqn(int ), (int)267);
        }
        var3_2 = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - nm.lwqi("lxht", lwqf(int ), (int)179));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1327224223: {
                    v3 = nm.lwqi("lxhu", lwqf(int ), (int)180);
                    continue block13;
                }
                case 1759203347: {
                    break block13;
                }
                case 1874104318: {
                    v3 = nm.lwqi("lxhv", lwqf(int ), (int)181);
                    continue block13;
                }
                case 2023319387: {
                    v3 = nm.lwqi("lxhw", lwqf(int ), (int)182);
                    continue block13;
                }
            }
            break;
        }
        var2_3 = nm.a;
        if (var4_1) {
            throw null;
lbl34:
            // 1 sources

            return (double)nm.lwqi("lxhx", lwto(int ), (int)183);
        }
        ** while (var2_3 || var2_3)
lbl37:
        // 1 sources

        v4 /* !! */  = nm.uq;
        if (true) ** GOTO lbl41
        block15: while (true) {
            v4 /* !! */  = (long)(v5 - nm.lwqi("lxhy", lwqf(int ), (int)184));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1665820446: {
                    v5 = nm.lwqi("lxhz", lwqf(int ), (int)185);
                    continue block15;
                }
                case 1490969603: {
                    v5 = nm.lwqi("lxia", lwqf(int ), (int)186);
                    continue block15;
                }
                case 1759203347: {
                    break block15;
                }
            }
            break;
        }
        v6 = 1.0 + Math.sin(var0);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxib", lwqf(int ), (int)187)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == nm.lwqi("lxic", lwqn(int ), (int)268)) break;
            v7 /* !! */  = (long)nm.lwqi("lxid", lwqn(int ), (int)269);
        }
        return Math.abs(v6) / nm.lwqi("lxie", lwto(int ), (int)188);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getRandom(int var0, int var1_1) {
        v0 /* !! */  = nm.uq;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - nm.lwqi("lwup", lwqf(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -49521607: {
                    v1 = nm.lwqi("lwuq", lwqf(int ), (int)46);
                    continue block20;
                }
                case 141622250: {
                    v1 = nm.lwqi("lwur", lwqf(int ), (int)47);
                    continue block20;
                }
                case 1563529375: {
                    v1 = nm.lwqi("lwus", lwqf(int ), (int)48);
                    continue block20;
                }
                case 1759203347: {
                    break block20;
                }
            }
            break;
        }
        var4_2 = nm.c;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(nm.lwqi("lwuu", lwqf(int ), (int)50) - nm.lwqi("lwut", lwqf(int ), (int)49));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1464309054: {
                    continue block21;
                }
                case 1759203347: {
                    break block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = nm.b;
        v3 /* !! */  = nm.uq;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(nm.lwqi("lwuw", lwqf(int ), (int)52) - nm.lwqi("lwuv", lwqf(int ), (int)51));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2147337537: {
                    continue block22;
                }
                case 1759203347: {
                    break block22;
                }
            }
            break;
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
lbl40:
            // 2 sources

            return (int)nm.lwqi("lwux", lwqn(int ), (int)60);
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v4 = var0;
                v5 = (float)var1_1 + 1.0f;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwuy", lwqf(int ), (int)53)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == nm.lwqi("lwuz", lwqn(int ), (int)61)) break;
                    v6 /* !! */  = (long)nm.lwqi("lwva", lwqn(int ), (int)62);
                }
                return (int)nm.getRandom(v4, v5);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)nm.lwqi("lwvb", lwqn(int ), (int)63);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)nm.lwqi("lwvc", lwqn(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)nm.lwqi("lwvd", lwqn(int ), (int)65);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)nm.lwqi("lwve", lwqn(int ), (int)66);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void lxsz() {
        nm.lwqg[300] = -6021968591806411733L;
        nm.lwqg[301] = 6910553356558110276L;
        nm.lwqg[302] = -4792954924424531550L;
        nm.lwqg[303] = -4901245154620483355L;
        nm.lwqg[304] = -4717842849840606347L;
        nm.lwqg[305] = -6914362902729559844L;
        nm.lwqg[306] = -7997639401770642766L;
        nm.lwqg[307] = -1672244126401862405L;
        nm.lwqg[308] = -2585044730324921991L;
        nm.lwqg[309] = 2855435884450142410L;
        nm.lwqg[310] = -5488235945752854218L;
        nm.lwqg[311] = -7591076788969620462L;
        nm.lwqg[312] = -8491600745641231193L;
        nm.lwqg[313] = -5978167271714611281L;
        nm.lwqg[314] = 1574735504542164224L;
        nm.lwqg[315] = 2660608297452390977L;
        nm.lwqg[316] = -2325526854143393034L;
        nm.lwqg[317] = 726241324168286453L;
        nm.lwqg[318] = -5806083378816037186L;
        nm.lwqg[319] = 7848127713173525675L;
        nm.lwqg[320] = -5645039769389081400L;
        nm.lwqg[321] = 5596864387628207573L;
        nm.lwqg[322] = 8459466835716150277L;
        nm.lwqg[323] = -3850448922133652608L;
        nm.lwqg[324] = 359880753198594446L;
    }

    private static /* synthetic */ void lxsu() {
        nm.lwqp[300] = 435151102;
        nm.lwqp[301] = -9337540;
        nm.lwqp[302] = 1800258096;
        nm.lwqp[303] = 814874213;
        nm.lwqp[304] = 1600958883;
        nm.lwqp[305] = -1260747433;
        nm.lwqp[306] = 170501602;
        nm.lwqp[307] = -1201500126;
        nm.lwqp[308] = 743038976;
        nm.lwqp[309] = 1532103997;
        nm.lwqp[310] = -7443513;
        nm.lwqp[311] = 1120029160;
        nm.lwqp[312] = 2048979294;
        nm.lwqp[313] = -665752377;
        nm.lwqp[314] = 915819119;
        nm.lwqp[315] = 1250138671;
        nm.lwqp[316] = 466345378;
        nm.lwqp[317] = -102667372;
        nm.lwqp[318] = 1479289317;
        nm.lwqp[319] = -748378915;
        nm.lwqp[320] = -809991507;
        nm.lwqp[321] = -726200877;
        nm.lwqp[322] = 1354867426;
        nm.lwqp[323] = 971513685;
        nm.lwqp[324] = -610870494;
        nm.lwqp[325] = -622979838;
        nm.lwqp[326] = 1002465464;
        nm.lwqp[327] = -1323849173;
        nm.lwqp[328] = 718631730;
        nm.lwqp[329] = 2132776991;
        nm.lwqp[330] = -1752168808;
        nm.lwqp[331] = 541990839;
        nm.lwqp[332] = 900507230;
        nm.lwqp[333] = -562339030;
        nm.lwqp[334] = 1149768474;
        nm.lwqp[335] = -1678225792;
        nm.lwqp[336] = 1745873963;
        nm.lwqp[337] = -945541324;
        nm.lwqp[338] = -872004164;
        nm.lwqp[339] = 455944505;
        nm.lwqp[340] = 1727621296;
        nm.lwqp[341] = -59265271;
        nm.lwqp[342] = -314198015;
        nm.lwqp[343] = -1818536531;
        nm.lwqp[344] = -791214359;
        nm.lwqp[345] = -43195649;
        nm.lwqp[346] = 2099125134;
        nm.lwqp[347] = -1635272345;
        nm.lwqp[348] = -178738302;
        nm.lwqp[349] = 1041155020;
        nm.lwqp[350] = -912344256;
        nm.lwqp[351] = -1815465978;
        nm.lwqp[352] = 1510597771;
        nm.lwqp[353] = -1316904313;
        nm.lwqp[354] = -1853915280;
        nm.lwqp[355] = 1219925338;
        nm.lwqp[356] = -727821745;
        nm.lwqp[357] = 1536073347;
        nm.lwqp[358] = -1976472545;
        nm.lwqp[359] = -1477211043;
        nm.lwqp[360] = 564153461;
        nm.lwqp[361] = -1385240638;
        nm.lwqp[362] = -1387479501;
        nm.lwqp[363] = -282094313;
        nm.lwqp[364] = 1793020684;
        nm.lwqp[365] = -2133833654;
        nm.lwqp[366] = 1366881385;
        nm.lwqp[367] = -1915917936;
        nm.lwqp[368] = 1964280947;
        nm.lwqp[369] = -2104769340;
        nm.lwqp[370] = -430366372;
        nm.lwqp[371] = 1559620768;
        nm.lwqp[372] = -570951717;
        nm.lwqp[373] = 1161518475;
        nm.lwqp[374] = -475006022;
        nm.lwqp[375] = 742857315;
        nm.lwqp[376] = -421649387;
        nm.lwqp[377] = 1201238592;
        nm.lwqp[378] = 1381533621;
        nm.lwqp[379] = -1282119715;
        nm.lwqp[380] = -1474230501;
        nm.lwqp[381] = 268238375;
        nm.lwqp[382] = 535181283;
        nm.lwqp[383] = -1276252256;
        nm.lwqp[384] = -1951634248;
        nm.lwqp[385] = -959093306;
        nm.lwqp[386] = -1850436602;
        nm.lwqp[387] = -800023087;
        nm.lwqp[388] = 1373206793;
        nm.lwqp[389] = 1248967787;
        nm.lwqp[390] = 1578220839;
        nm.lwqp[391] = 274287886;
        nm.lwqp[392] = 109179457;
        nm.lwqp[393] = -134733578;
        nm.lwqp[394] = 1988895044;
        nm.lwqp[395] = 587505611;
        nm.lwqp[396] = 445847121;
        nm.lwqp[397] = 1145784860;
        nm.lwqp[398] = -1219172609;
        nm.lwqp[399] = -1951055928;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double computeGcd() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwtf", lwqf(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nm.lwqi("lwtg", lwqn(int ), (int)44)) break;
            v0 /* !! */  = (long)nm.lwqi("lwth", lwqn(int ), (int)45);
        }
        var2 = nm.c;
        v1 /* !! */  = nm.uq;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - nm.lwqi("lwti", lwqf(int ), (int)27));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1423079769: {
                    v2 = nm.lwqi("lwtj", lwqf(int ), (int)28);
                    continue block21;
                }
                case 1204964562: {
                    v2 = nm.lwqi("lwtk", lwqf(int ), (int)29);
                    continue block21;
                }
                case 1759203347: {
                    break block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = nm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwtl", lwqf(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nm.lwqi("lwtm", lwqn(int ), (int)46)) break;
            v3 /* !! */  = (long)nm.lwqi("lwtn", lwqn(int ), (int)47);
        }
        var0_2 = nm.a;
        if (var2) {
            throw null;
lbl29:
            // 2 sources

            return (double)nm.lwqi("lwtp", lwto(int ), (int)31);
        }
        if (var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lwtq", lwqf(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nm.lwqi("lwtr", lwqn(int ), (int)48)) break;
                    v4 /* !! */  = (long)nm.lwqi("lwts", lwqn(int ), (int)49);
                }
                v5 /* !! */  = nm.uq;
                if (true) ** GOTO lbl45
                block25: while (true) {
                    v5 /* !! */  = (long)(nm.lwqi("lwtu", lwqf(int ), (int)34) - nm.lwqi("lwtt", lwqf(int ), (int)33));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1490036271: {
                            continue block25;
                        }
                        case 1759203347: {
                            break block25;
                        }
                    }
                    break;
                }
                v6 = nm.mc.field_1690;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lwtv", lwqf(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nm.lwqi("lwtw", lwqn(int ), (int)50)) break;
                    v7 /* !! */  = (long)nm.lwqi("lwtx", lwqn(int ), (int)51);
                }
                v8 = v6.method_42495();
                v9 /* !! */  = nm.uq;
                if (true) ** GOTO lbl61
                block27: while (true) {
                    v9 /* !! */  = (long)(v10 - nm.lwqi("lwty", lwqf(int ), (int)36));
lbl61:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -518855380: {
                            v10 = nm.lwqi("lwtz", lwqf(int ), (int)37);
                            continue block27;
                        }
                        case 424329353: {
                            v10 = nm.lwqi("lwua", lwqf(int ), (int)38);
                            continue block27;
                        }
                        case 1759203347: {
                            break block27;
                        }
                    }
                    break;
                }
                v11 = (Double)v8.method_41753();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lwub", lwqf(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nm.lwqi("lwuc", lwqn(int ), (int)52)) break;
                    v12 /* !! */  = (long)nm.lwqi("lwud", lwqn(int ), (int)53);
                }
                v13 = v11 * nm.lwqi("lwue", lwto(int ), (int)40) + nm.lwqi("lwuf", lwto(int ), (int)41);
                v14 = nm.lwqi("lwug", lwto(int ), (int)42);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = nm.uq - nm.lwqi("lwuh", lwqf(int ), (int)43)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == nm.lwqi("lwui", lwqn(int ), (int)54)) break;
                    v15 /* !! */  = (long)nm.lwqi("lwuj", lwqn(int ), (int)55);
                }
                return Math.pow(v13, (double)v14) * nm.lwqi("lwuk", lwto(int ), (int)44);
            }
            case 0: {
                var1_1 /* !! */  = (int)nm.lwqi("lwul", lwqn(int ), (int)56);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)nm.lwqi("lwum", lwqn(int ), (int)57);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)nm.lwqi("lwun", lwqn(int ), (int)58);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)nm.lwqi("lwuo", lwqn(int ), (int)59);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getGreen(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxbs", lwqf(int ), (int)109)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lxbt", lwqn(int ), (int)181)) break;
            v0 /* !! */  = (long)nm.lwqi("lxbu", lwqn(int ), (int)182);
        }
        var3_1 = nm.c;
        v1 /* !! */  = nm.uq;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - nm.lwqi("lxbv", lwqf(int ), (int)110));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1438427140: {
                    v2 = nm.lwqi("lxbw", lwqf(int ), (int)111);
                    continue block17;
                }
                case 1451526373: {
                    v2 = nm.lwqi("lxbx", lwqf(int ), (int)112);
                    continue block17;
                }
                case 1759203347: {
                    break block17;
                }
                case 2060294982: {
                    v2 = nm.lwqi("lxby", lwqf(int ), (int)113);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = nm.b;
        v3 /* !! */  = nm.uq;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(nm.lwqi("lxca", lwqf(int ), (int)115) - nm.lwqi("lxbz", lwqf(int ), (int)114));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1484112387: {
                    continue block18;
                }
                case 1759203347: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = nm.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)nm.lwqi("lxcb", lwqn(int ), (int)183);
                }
                if (var1_3 || var1_3) ** continue;
                return var0 >> nm.lwqi("lxcc", lwqn(int ), (int)184) & nm.lwqi("lxcd", lwqn(int ), (int)185);
            }
lbl44:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nm.lwqi("lxce", lwqn(int ), (int)186);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nm.lwqi("lxcf", lwqn(int ), (int)187);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nm.lwqi("lxcg", lwqn(int ), (int)188);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nm.lwqi("lxch", lwqn(int ), (int)189);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    static {
        lwqo = new int[401];
        lwqp = new int[401];
        nm.lxsm();
        nm.lxsn();
        nm.lxso();
        nm.lxsp();
        nm.lwqo[400] = 1992826688;
        nm.lxsr();
        nm.lxss();
        nm.lxst();
        nm.lxsu();
        nm.lwqp[400] = 1992826691;
        lwqg = new long[325];
        lwqh = new long[325];
        nm.lxsw();
        nm.lxsx();
        nm.lxsy();
        nm.lxsz();
        nm.lxta();
        nm.lxtb();
        nm.lxtc();
        nm.lxtd();
        PI2 = Math.PI * 2;
        contextAlpha = 1.0f;
    }

    private static /* synthetic */ void lxsx() {
        nm.lwqg[100] = -904566708334285717L;
        nm.lwqg[101] = 2065422368675550829L;
        nm.lwqg[102] = 4923135112902945165L;
        nm.lwqg[103] = 3826067666190484688L;
        nm.lwqg[104] = 8749229751075309737L;
        nm.lwqg[105] = 4060326727813410913L;
        nm.lwqg[106] = 3416793075772578228L;
        nm.lwqg[107] = -2582679767249257566L;
        nm.lwqg[108] = -1424508804653668036L;
        nm.lwqg[109] = -5827287891217130511L;
        nm.lwqg[110] = 1899872901624199722L;
        nm.lwqg[111] = -5886559250322020094L;
        nm.lwqg[112] = -7163721646719721964L;
        nm.lwqg[113] = 5360173502162260023L;
        nm.lwqg[114] = -316355068608083319L;
        nm.lwqg[115] = -7026092247184420071L;
        nm.lwqg[116] = 8470657658245124383L;
        nm.lwqg[117] = -6292626725885324046L;
        nm.lwqg[118] = -8607514996985153855L;
        nm.lwqg[119] = -7084099144225623737L;
        nm.lwqg[120] = 8064465017437176359L;
        nm.lwqg[121] = -8072594518175807585L;
        nm.lwqg[122] = 7279543878878631841L;
        nm.lwqg[123] = 7153097196024914632L;
        nm.lwqg[124] = 3179264596856304575L;
        nm.lwqg[125] = 8001488934981363045L;
        nm.lwqg[126] = -6111282055553743943L;
        nm.lwqg[127] = -601628996640066467L;
        nm.lwqg[128] = 7513241682163083464L;
        nm.lwqg[129] = -1359062959511904859L;
        nm.lwqg[130] = 464614976148232608L;
        nm.lwqg[131] = -4938136049082829375L;
        nm.lwqg[132] = 615155982324737245L;
        nm.lwqg[133] = -1434952646011901526L;
        nm.lwqg[134] = 1278196761449073493L;
        nm.lwqg[135] = -4882489537798620493L;
        nm.lwqg[136] = -7932224988877249207L;
        nm.lwqg[137] = -1965484885031471012L;
        nm.lwqg[138] = -7156289769566802384L;
        nm.lwqg[139] = -8629701638485996934L;
        nm.lwqg[140] = 2148578396582921290L;
        nm.lwqg[141] = 8063869256845028974L;
        nm.lwqg[142] = 1435512406705378287L;
        nm.lwqg[143] = -6328117658777819511L;
        nm.lwqg[144] = 5352530891500744888L;
        nm.lwqg[145] = 5633854615999542359L;
        nm.lwqg[146] = -9162947443300737787L;
        nm.lwqg[147] = -3893453514610798386L;
        nm.lwqg[148] = 2830267591689193125L;
        nm.lwqg[149] = 5293630662403614642L;
        nm.lwqg[150] = 5017247092840056439L;
        nm.lwqg[151] = 2121764834493195371L;
        nm.lwqg[152] = 7776724567358410658L;
        nm.lwqg[153] = -3466940797127943983L;
        nm.lwqg[154] = 2179120331549311138L;
        nm.lwqg[155] = 8347497324701540908L;
        nm.lwqg[156] = -2778802705958922431L;
        nm.lwqg[157] = -5180663333975394243L;
        nm.lwqg[158] = -3632329013596286702L;
        nm.lwqg[159] = 4042732007271816027L;
        nm.lwqg[160] = 4439840409839184189L;
        nm.lwqg[161] = 3876634603649937229L;
        nm.lwqg[162] = 2714546080519997710L;
        nm.lwqg[163] = -5224437290864636387L;
        nm.lwqg[164] = 4323655636486595524L;
        nm.lwqg[165] = -3022393183242745235L;
        nm.lwqg[166] = -8268957220590891277L;
        nm.lwqg[167] = 7249261796840860476L;
        nm.lwqg[168] = 1794098860463727413L;
        nm.lwqg[169] = -858651075966041715L;
        nm.lwqg[170] = 699054711967731938L;
        nm.lwqg[171] = -2028941019759472043L;
        nm.lwqg[172] = 4376403337043319968L;
        nm.lwqg[173] = -6678547161158533212L;
        nm.lwqg[174] = -8871595042410413078L;
        nm.lwqg[175] = -2325276792269627099L;
        nm.lwqg[176] = -2263966152331408343L;
        nm.lwqg[177] = 3416339323808941389L;
        nm.lwqg[178] = 6238504403128366166L;
        nm.lwqg[179] = -8898327154480089627L;
        nm.lwqg[180] = -1402642101908599093L;
        nm.lwqg[181] = 2533265760324217298L;
        nm.lwqg[182] = 1439371935292923138L;
        nm.lwqg[183] = -4977309121043951681L;
        nm.lwqg[184] = -6952986355192573754L;
        nm.lwqg[185] = -2101887847760281130L;
        nm.lwqg[186] = -3479627883576795816L;
        nm.lwqg[187] = 3547203943478983699L;
        nm.lwqg[188] = 8240799524123571196L;
        nm.lwqg[189] = 9131720518053069641L;
        nm.lwqg[190] = -2257135283575287777L;
        nm.lwqg[191] = -2276339876596282484L;
        nm.lwqg[192] = 7667985126710757341L;
        nm.lwqg[193] = 5549918869539567498L;
        nm.lwqg[194] = -4762784119372951781L;
        nm.lwqg[195] = 5559442356639548923L;
        nm.lwqg[196] = 1563166017773505462L;
        nm.lwqg[197] = 1710712391590212549L;
        nm.lwqg[198] = -5144627054133165711L;
        nm.lwqg[199] = 7944923214962770502L;
    }

    private static /* synthetic */ double lwto(int n2) {
        return Double.longBitsToDouble(lwqg[n2] ^ lwqh[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 interpolate(class_1297 var0) {
        block37: {
            v0 /* !! */  = nm.uq;
            if (true) ** GOTO lbl5
            block20: while (true) {
                v0 /* !! */  = (long)(nm.lwqi("lxmn", lwqf(int ), (int)248) - nm.lwqi("lxmm", lwqf(int ), (int)247));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 1759203347: {
                        break block20;
                    }
                    case 1983878147: {
                        continue block20;
                    }
                }
                break;
            }
            var3_1 = nm.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxmo", lwqf(int ), (int)249)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == nm.lwqi("lxmp", lwqn(int ), (int)323)) break;
                v1 /* !! */  = (long)nm.lwqi("lxmq", lwqn(int ), (int)324);
            }
            var2_2 = nm.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxmr", lwqf(int ), (int)250)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nm.lwqi("lxms", lwqn(int ), (int)325)) break;
                v2 /* !! */  = (long)nm.lwqi("lxmt", lwqn(int ), (int)326);
            }
            var1_3 = nm.a;
            if (var3_1) {
                throw null;
lbl25:
                // 3 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl25
            if (var0 != null) break block37;
            if (var1_3) ** GOTO lbl25
            v3 /* !! */  = nm.uq;
            if (true) ** GOTO lbl34
            block24: while (true) {
                v3 /* !! */  = (long)(v4 - nm.lwqi("lxmu", lwqf(int ), (int)251));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1794312371: {
                        v4 = nm.lwqi("lxmv", lwqf(int ), (int)252);
                        continue block24;
                    }
                    case -1628198867: {
                        v4 = nm.lwqi("lxmw", lwqf(int ), (int)253);
                        continue block24;
                    }
                    case 1759203347: {
                        break block24;
                    }
                }
                break;
            }
            return class_243.field_1353;
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxmx", lwqf(int ), (int)254)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nm.lwqi("lxmy", lwqn(int ), (int)327)) break;
            v5 /* !! */  = (long)nm.lwqi("lxmz", lwqn(int ), (int)328);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxna", lwqf(int ), (int)255)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nm.lwqi("lxnb", lwqn(int ), (int)329)) break;
            v6 /* !! */  = (long)nm.lwqi("lxnc", lwqn(int ), (int)330);
        }
        v7 = var0.field_6014;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lxnd", lwqf(int ), (int)256)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nm.lwqi("lxne", lwqn(int ), (int)331)) break;
            v8 /* !! */  = (long)nm.lwqi("lxnf", lwqn(int ), (int)332);
        }
        v9 = var0.method_23317();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = nm.uq - nm.lwqi("lxng", lwqf(int ), (int)257)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == nm.lwqi("lxnh", lwqn(int ), (int)333)) break;
            v10 /* !! */  = (long)nm.lwqi("lxni", lwqn(int ), (int)334);
        }
        v11 = nm.interpolate(v7, v9);
        v12 /* !! */  = nm.uq;
        if (true) ** GOTO lbl74
        block29: while (true) {
            v12 /* !! */  = (long)(v13 - nm.lwqi("lxnj", lwqf(int ), (int)258));
lbl74:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -2082717416: {
                    v13 = nm.lwqi("lxnk", lwqf(int ), (int)259);
                    continue block29;
                }
                case -585804026: {
                    v13 = nm.lwqi("lxnl", lwqf(int ), (int)260);
                    continue block29;
                }
                case -327181592: {
                    v13 = nm.lwqi("lxnm", lwqf(int ), (int)261);
                    continue block29;
                }
                case 1759203347: {
                    break block29;
                }
            }
            break;
        }
        v14 = var0.field_6036;
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = nm.uq - nm.lwqi("lxnn", lwqf(int ), (int)262)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == nm.lwqi("lxno", lwqn(int ), (int)335)) break;
            v15 /* !! */  = (long)nm.lwqi("lxnp", lwqn(int ), (int)336);
        }
        v16 = var0.method_23318();
        v17 /* !! */  = nm.uq;
        if (true) ** GOTO lbl97
        block31: while (true) {
            v17 /* !! */  = (long)(v18 - nm.lwqi("lxnq", lwqf(int ), (int)263));
lbl97:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1145603555: {
                    v18 = nm.lwqi("lxnr", lwqf(int ), (int)264);
                    continue block31;
                }
                case 203796839: {
                    v18 = nm.lwqi("lxns", lwqf(int ), (int)265);
                    continue block31;
                }
                case 1759203347: {
                    break block31;
                }
            }
            break;
        }
        v19 = nm.interpolate(v14, v16);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_7 = nm.uq - nm.lwqi("lxnt", lwqf(int ), (int)266)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == nm.lwqi("lxnu", lwqn(int ), (int)337)) break;
            v20 /* !! */  = (long)nm.lwqi("lxnv", lwqn(int ), (int)338);
        }
        v21 = var0.field_5969;
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_8 = nm.uq - nm.lwqi("lxnw", lwqf(int ), (int)267)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == nm.lwqi("lxnx", lwqn(int ), (int)339)) break;
            v22 /* !! */  = (long)nm.lwqi("lxny", lwqn(int ), (int)340);
        }
        v23 = var0.method_23321();
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_9 = nm.uq - nm.lwqi("lxnz", lwqf(int ), (int)268)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == nm.lwqi("lxoa", lwqn(int ), (int)341)) break;
            v24 /* !! */  = (long)nm.lwqi("lxob", lwqn(int ), (int)342);
        }
        v25 = nm.interpolate(v21, v23);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_10 = nm.uq - nm.lwqi("lxoc", lwqf(int ), (int)269)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == nm.lwqi("lxod", lwqn(int ), (int)343)) break;
            v26 /* !! */  = (long)nm.lwqi("lxoe", lwqn(int ), (int)344);
        }
        return new class_243(v11, v19, v25);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static float getContextAlpha() {
        Object object = uq;
        boolean bl2 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - nm.lwqi("lxrw", lwqf(int ), (int)316);
            }
            switch ((int)object) {
                case -1759343773: {
                    callSite = nm.lwqi("lxrx", lwqf(int ), (int)317);
                    continue block14;
                }
                case 1759203347: {
                    break block14;
                }
                case 1849548228: {
                    callSite = nm.lwqi("lxry", lwqf(int ), (int)318);
                    continue block14;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = uq;
        boolean bl4 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - nm.lwqi("lxrz", lwqf(int ), (int)319);
            }
            switch ((int)object2) {
                case -1526902120: {
                    callSite = nm.lwqi("lxsa", lwqf(int ), (int)320);
                    continue block15;
                }
                case -447803311: {
                    callSite = nm.lwqi("lxsb", lwqf(int ), (int)321);
                    continue block15;
                }
                case 1759203347: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = uq;
        block16: while (true) {
            switch ((int)object3) {
                case 399532888: {
                    object3 = nm.lwqi("lxsd", lwqf(int ), (int)323) - nm.lwqi("lxsc", lwqf(int ), (int)322);
                    continue block16;
                }
                case 1759203347: {
                    break block16;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (float)nm.lwqi("lxse", lwrs(int ), (int)394);
        if (bl5) return (float)nm.lwqi("lxse", lwrs(int ), (int)394);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = uq - nm.lwqi("lxsf", lwqf(int ), (int)324)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == nm.lwqi("lxsg", lwqn(int ), (int)395)) {
                return contextAlpha;
            }
            object4 = nm.lwqi("lxsh", lwqn(int ), (int)396);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getAlpha(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxcw", lwqf(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lxcx", lwqn(int ), (int)200)) break;
            v0 /* !! */  = (long)nm.lwqi("lxcy", lwqn(int ), (int)201);
        }
        var3_1 = nm.c;
        v1 /* !! */  = nm.uq;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - nm.lwqi("lxcz", lwqf(int ), (int)121));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -229372156: {
                    v2 = nm.lwqi("lxda", lwqf(int ), (int)122);
                    continue block11;
                }
                case 1064683770: {
                    v2 = nm.lwqi("lxdb", lwqf(int ), (int)123);
                    continue block11;
                }
                case 1759203347: {
                    break block11;
                }
            }
            break;
        }
        var2_2 = nm.b;
        v3 /* !! */  = nm.uq;
        if (true) ** GOTO lbl26
        block12: while (true) {
            v3 /* !! */  = (long)(v4 - nm.lwqi("lxdc", lwqf(int ), (int)124));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -905231521: {
                    v4 = nm.lwqi("lxdd", lwqf(int ), (int)125);
                    continue block12;
                }
                case 1053077444: {
                    v4 = nm.lwqi("lxde", lwqf(int ), (int)126);
                    continue block12;
                }
                case 1759203347: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = nm.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (int)nm.lwqi("lxdf", lwqn(int ), (int)202);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        return var0 >> nm.lwqi("lxdg", lwqn(int ), (int)203) & nm.lwqi("lxdh", lwqn(int ), (int)204);
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int getRed(int n2) {
        CallSite callSite;
        boolean bl2;
        Object object = uq;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite2;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite2 - nm.lwqi("lxbc", lwqf(int ), (int)104);
            }
            switch ((int)object) {
                case -115641747: {
                    callSite2 = nm.lwqi("lxbd", lwqf(int ), (int)105);
                    continue block11;
                }
                case 1759203347: {
                    break block11;
                }
                case 2069761968: {
                    callSite2 = nm.lwqi("lxbe", lwqf(int ), (int)106);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = uq - nm.lwqi("lxbf", lwqf(int ), (int)107)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == nm.lwqi("lxbg", lwqn(int ), (int)170)) break;
            object2 = nm.lwqi("lxbh", lwqn(int ), (int)171);
        }
        int n3 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = uq - nm.lwqi("lxbi", lwqf(int ), (int)108)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == nm.lwqi("lxbj", lwqn(int ), (int)172)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = nm.lwqi("lxbk", lwqn(int ), (int)173);
        }
        if (!bl2 && !bl2) {
            return n2 >> nm.lwqi("lxbm", lwqn(int ), (int)175) & nm.lwqi("lxbn", lwqn(int ), (int)176);
        }
        if (n3 == 0) return (int)nm.lwqi("lxbl", lwqn(int ), (int)174);
        switch (n3) {
            default: {
                return (int)nm.lwqi("lxbl", lwqn(int ), (int)174);
            }
            case 2: {
                CallSite callSite3 = nm.lwqi("lxbq", lwqn(int ), (int)179);
                if (bl4) {
                    throw null;
                }
            }
            case 0: {
                CallSite callSite4 = nm.lwqi("lxbo", lwqn(int ), (int)177);
                if (bl4) {
                    throw null;
                }
            }
            case 1: {
                break;
            }
            case 3: {
                callSite = nm.lwqi("lxbr", lwqn(int ), (int)180);
                if (!bl4) break;
                throw null;
            }
        }
        do {
            callSite = nm.lwqi("lxbp", lwqn(int ), (int)178);
            if (bl4) {
                throw null;
            }
            callSite = nm.lwqi("lxbr", lwqn(int ), (int)180);
        } while (!bl4);
        throw null;
    }

    private static /* synthetic */ float lwrs(int n2) {
        return Float.intBitsToFloat(lwqo[n2] ^ lwqp[n2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void scale(Matrix3x2fStack matrix3x2fStack, float f2, float f3, float f4, float f5, Runnable runnable) {
        block9: {
            block6: {
                boolean bl2;
                block8: {
                    float f6;
                    block7: {
                        boolean bl3 = c;
                        int n2 = b;
                        bl2 = a;
                        if (bl3) {
                            throw null;
                        }
                        if (bl2 || bl2) break block6;
                        f6 = f4 * f5;
                        if (bl2 || bl2) break block6;
                        if (f6 == 1.0f) break block7;
                        if (bl2) break block6;
                        if (!(f6 > 0.0f)) break block7;
                        if (bl2 || bl2) break block6;
                        float f7 = contextAlpha;
                        if (bl2 || bl2) break block6;
                        contextAlpha = f6;
                        if (bl2 || bl2) break block6;
                        matrix3x2fStack.pushMatrix();
                        if (bl2 || bl2) break block6;
                        matrix3x2fStack.translate(f2, f3);
                        if (bl2 || bl2) break block6;
                        matrix3x2fStack.scale(f4, f5);
                        if (bl2 || bl2) break block6;
                        matrix3x2fStack.translate(-f2, -f3);
                        if (bl2 || bl2) break block6;
                        runnable.run();
                        if (bl2 || bl2) break block6;
                        matrix3x2fStack.popMatrix();
                        if (bl2 || bl2) break block6;
                        contextAlpha = f7;
                        if (bl2 || bl2) break block6;
                        if (bl3) {
                            throw null;
                        }
                        break block8;
                    }
                    if (bl2 || bl2) break block6;
                    if (!(f6 >= 1.0f)) break block8;
                    if (bl2 || bl2) break block6;
                    runnable.run();
                    if (bl2) break block6;
                }
                if (!bl2 && !bl2) break block9;
            }
            return;
        }
    }

    private static /* synthetic */ void lxso() {
        nm.lwqo[200] = 161409899;
        nm.lwqo[201] = 1328806542;
        nm.lwqo[202] = -1792686710;
        nm.lwqo[203] = -1733840885;
        nm.lwqo[204] = 1377467460;
        nm.lwqo[205] = 1181045227;
        nm.lwqo[206] = -39041193;
        nm.lwqo[207] = 747538251;
        nm.lwqo[208] = -1435171756;
        nm.lwqo[209] = -658909994;
        nm.lwqo[210] = -251428885;
        nm.lwqo[211] = -1570068182;
        nm.lwqo[212] = 150852391;
        nm.lwqo[213] = -111569176;
        nm.lwqo[214] = 996232897;
        nm.lwqo[215] = 784757594;
        nm.lwqo[216] = 163283048;
        nm.lwqo[217] = 1883578884;
        nm.lwqo[218] = -1230439350;
        nm.lwqo[219] = -719725102;
        nm.lwqo[220] = 567982500;
        nm.lwqo[221] = 634330572;
        nm.lwqo[222] = 564947701;
        nm.lwqo[223] = -1545965517;
        nm.lwqo[224] = 1536014814;
        nm.lwqo[225] = 1004781095;
        nm.lwqo[226] = 1538864967;
        nm.lwqo[227] = 1101767363;
        nm.lwqo[228] = -1082737584;
        nm.lwqo[229] = -131787458;
        nm.lwqo[230] = 1953747067;
        nm.lwqo[231] = -1075415889;
        nm.lwqo[232] = 593803755;
        nm.lwqo[233] = -1199621698;
        nm.lwqo[234] = 27724420;
        nm.lwqo[235] = -1813888861;
        nm.lwqo[236] = -571935470;
        nm.lwqo[237] = 106998998;
        nm.lwqo[238] = -1307747592;
        nm.lwqo[239] = 1877843077;
        nm.lwqo[240] = -1161364307;
        nm.lwqo[241] = 1599850891;
        nm.lwqo[242] = 229214503;
        nm.lwqo[243] = 592662254;
        nm.lwqo[244] = -681273054;
        nm.lwqo[245] = -550396548;
        nm.lwqo[246] = 478362664;
        nm.lwqo[247] = 1252502246;
        nm.lwqo[248] = 515409792;
        nm.lwqo[249] = 219448435;
        nm.lwqo[250] = 593571417;
        nm.lwqo[251] = -129103901;
        nm.lwqo[252] = 861727558;
        nm.lwqo[253] = -908283416;
        nm.lwqo[254] = -829264152;
        nm.lwqo[255] = -1046519017;
        nm.lwqo[256] = 1823094444;
        nm.lwqo[257] = -1017055132;
        nm.lwqo[258] = 1385776338;
        nm.lwqo[259] = 360439535;
        nm.lwqo[260] = -1334910781;
        nm.lwqo[261] = 473321346;
        nm.lwqo[262] = 1231015958;
        nm.lwqo[263] = 1295551549;
        nm.lwqo[264] = 1461562152;
        nm.lwqo[265] = -234657841;
        nm.lwqo[266] = -126549614;
        nm.lwqo[267] = 872570555;
        nm.lwqo[268] = -1385859194;
        nm.lwqo[269] = 154336985;
        nm.lwqo[270] = -858019904;
        nm.lwqo[271] = 255152783;
        nm.lwqo[272] = -2131447542;
        nm.lwqo[273] = -57303957;
        nm.lwqo[274] = -1041649370;
        nm.lwqo[275] = -1996029049;
        nm.lwqo[276] = -2035718134;
        nm.lwqo[277] = 15038172;
        nm.lwqo[278] = 1618567483;
        nm.lwqo[279] = 2049173207;
        nm.lwqo[280] = 1050055814;
        nm.lwqo[281] = -2031334767;
        nm.lwqo[282] = -441174911;
        nm.lwqo[283] = 1594675431;
        nm.lwqo[284] = 1049821291;
        nm.lwqo[285] = -780640395;
        nm.lwqo[286] = -321728399;
        nm.lwqo[287] = 1838462694;
        nm.lwqo[288] = -1126658036;
        nm.lwqo[289] = -1811445871;
        nm.lwqo[290] = 1572407469;
        nm.lwqo[291] = 1698691927;
        nm.lwqo[292] = 885760618;
        nm.lwqo[293] = -977719217;
        nm.lwqo[294] = -995100008;
        nm.lwqo[295] = 1926492826;
        nm.lwqo[296] = -2070696047;
        nm.lwqo[297] = 627778590;
        nm.lwqo[298] = -58238247;
        nm.lwqo[299] = 2081524977;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int applyOpacity(int var0, float var1_1) {
        v0 /* !! */  = nm.uq;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - nm.lwqi("lxdm", lwqf(int ), (int)127));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1394304905: {
                    v1 = nm.lwqi("lxdn", lwqf(int ), (int)128);
                    continue block16;
                }
                case -1148545244: {
                    v1 = nm.lwqi("lxdo", lwqf(int ), (int)129);
                    continue block16;
                }
                case 395526998: {
                    v1 = nm.lwqi("lxdp", lwqf(int ), (int)130);
                    continue block16;
                }
                case 1759203347: {
                    break block16;
                }
            }
            break;
        }
        var4_2 = nm.c;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(nm.lwqi("lxdr", lwqf(int ), (int)132) - nm.lwqi("lxdq", lwqf(int ), (int)131));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2093349691: {
                    continue block17;
                }
                case 1759203347: {
                    break block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = nm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxds", lwqf(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nm.lwqi("lxdt", lwqn(int ), (int)209)) break;
            v3 /* !! */  = (long)nm.lwqi("lxdu", lwqn(int ), (int)210);
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
            return (int)nm.lwqi("lxdv", lwqn(int ), (int)211);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxdw", lwqf(int ), (int)134)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nm.lwqi("lxdx", lwqn(int ), (int)212)) break;
                    v4 /* !! */  = (long)nm.lwqi("lxdy", lwqn(int ), (int)213);
                }
                v5 = (int)((float)nm.getAlpha(var0) * var1_1 / nm.lwqi("lxdz", lwrs(int ), (int)214));
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxea", lwqf(int ), (int)135)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nm.lwqi("lxeb", lwqn(int ), (int)215)) break;
                    v6 /* !! */  = (long)nm.lwqi("lxec", lwqn(int ), (int)216);
                }
                v7 = nm.getRed(var0);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxed", lwqf(int ), (int)136)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nm.lwqi("lxee", lwqn(int ), (int)217)) break;
                    v8 /* !! */  = (long)nm.lwqi("lxef", lwqn(int ), (int)218);
                }
                v9 = nm.getGreen(var0);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lxeg", lwqf(int ), (int)137)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nm.lwqi("lxeh", lwqn(int ), (int)219)) break;
                    v10 /* !! */  = (long)nm.lwqi("lxei", lwqn(int ), (int)220);
                }
                v11 = nm.getBlue(var0);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = nm.uq - nm.lwqi("lxej", lwqf(int ), (int)138)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nm.lwqi("lxek", lwqn(int ), (int)221)) break;
                    v12 /* !! */  = (long)nm.lwqi("lxel", lwqn(int ), (int)222);
                }
                return class_9848.method_61324((int)v5, (int)v7, (int)v9, (int)v11);
            }
            case 0: {
                var3_3 /* !! */  = (int)nm.lwqi("lxem", lwqn(int ), (int)223);
                if (!var4_2) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nm.lwqi("lxen", lwqn(int ), (int)224);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)nm.lwqi("lxeo", lwqn(int ), (int)225);
                if (!var4_2) ** GOTO lbl76
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nm.lwqi("lxep", lwqn(int ), (int)226);
        ** while (!var4_2)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lxtd() {
        nm.lwqh[300] = -666233627041344856L;
        nm.lwqh[301] = 1259395021427266465L;
        nm.lwqh[302] = 2533779591520528059L;
        nm.lwqh[303] = -6822949256992649758L;
        nm.lwqh[304] = -4470240730299703267L;
        nm.lwqh[305] = -654125139867745376L;
        nm.lwqh[306] = -5658986446214610349L;
        nm.lwqh[307] = -4798542815433362615L;
        nm.lwqh[308] = -4703632090831638003L;
        nm.lwqh[309] = -4784406271021881490L;
        nm.lwqh[310] = -2247956726831472717L;
        nm.lwqh[311] = 6508675924906480948L;
        nm.lwqh[312] = -1594554690747887714L;
        nm.lwqh[313] = 4113585388748960154L;
        nm.lwqh[314] = -5461225254765813491L;
        nm.lwqh[315] = 5387994932707955712L;
        nm.lwqh[316] = -5675814265440753900L;
        nm.lwqh[317] = 7592141877134749995L;
        nm.lwqh[318] = 6908028551788400445L;
        nm.lwqh[319] = 2286342898383770251L;
        nm.lwqh[320] = -71551651918717254L;
        nm.lwqh[321] = 6367928059020961491L;
        nm.lwqh[322] = 4385245620916051251L;
        nm.lwqh[323] = -3643406036583446346L;
        nm.lwqh[324] = 4140407379430357055L;
    }

    private static /* synthetic */ void lxsr() {
        nm.lwqp[0] = -181373167;
        nm.lwqp[1] = 1609889533;
        nm.lwqp[2] = 510469090;
        nm.lwqp[3] = -600309567;
        nm.lwqp[4] = 667929284;
        nm.lwqp[5] = 533553172;
        nm.lwqp[6] = -1207943120;
        nm.lwqp[7] = 821034342;
        nm.lwqp[8] = -840548839;
        nm.lwqp[9] = 1498756778;
        nm.lwqp[10] = -1943238691;
        nm.lwqp[11] = -758033123;
        nm.lwqp[12] = 1536444943;
        nm.lwqp[13] = -854367640;
        nm.lwqp[14] = 725713634;
        nm.lwqp[15] = -1892737812;
        nm.lwqp[16] = -1680197248;
        nm.lwqp[17] = -1864502760;
        nm.lwqp[18] = 643500164;
        nm.lwqp[19] = -1205046496;
        nm.lwqp[20] = -1081521911;
        nm.lwqp[21] = -156585833;
        nm.lwqp[22] = -753215171;
        nm.lwqp[23] = -1610228544;
        nm.lwqp[24] = -1840883546;
        nm.lwqp[25] = -1430269607;
        nm.lwqp[26] = 934233322;
        nm.lwqp[27] = 1477315160;
        nm.lwqp[28] = -63877571;
        nm.lwqp[29] = -311579040;
        nm.lwqp[30] = 1852842969;
        nm.lwqp[31] = -1344975508;
        nm.lwqp[32] = 1360231647;
        nm.lwqp[33] = 1233132783;
        nm.lwqp[34] = 641768616;
        nm.lwqp[35] = 611768414;
        nm.lwqp[36] = -686294369;
        nm.lwqp[37] = -1627593434;
        nm.lwqp[38] = -361969153;
        nm.lwqp[39] = 2147467476;
        nm.lwqp[40] = 2142238822;
        nm.lwqp[41] = 1335675172;
        nm.lwqp[42] = -1704486273;
        nm.lwqp[43] = -1126928905;
        nm.lwqp[44] = 2034931774;
        nm.lwqp[45] = -2114178364;
        nm.lwqp[46] = -738468944;
        nm.lwqp[47] = 684211257;
        nm.lwqp[48] = -993855542;
        nm.lwqp[49] = 826565189;
        nm.lwqp[50] = 1748749103;
        nm.lwqp[51] = 275713451;
        nm.lwqp[52] = -840163148;
        nm.lwqp[53] = 1194654232;
        nm.lwqp[54] = 1808775191;
        nm.lwqp[55] = 1094029747;
        nm.lwqp[56] = -865821987;
        nm.lwqp[57] = 1336806594;
        nm.lwqp[58] = -686702866;
        nm.lwqp[59] = 996478965;
        nm.lwqp[60] = 1743250524;
        nm.lwqp[61] = -1269681448;
        nm.lwqp[62] = -2074471974;
        nm.lwqp[63] = -1678652367;
        nm.lwqp[64] = -639109040;
        nm.lwqp[65] = -1957478561;
        nm.lwqp[66] = -1514608135;
        nm.lwqp[67] = -1544767111;
        nm.lwqp[68] = 1805767685;
        nm.lwqp[69] = -1668875470;
        nm.lwqp[70] = 1327099359;
        nm.lwqp[71] = -559471101;
        nm.lwqp[72] = -1404712549;
        nm.lwqp[73] = 1950652209;
        nm.lwqp[74] = -72691883;
        nm.lwqp[75] = -1059211652;
        nm.lwqp[76] = 1255726700;
        nm.lwqp[77] = -1558475809;
        nm.lwqp[78] = 1046378479;
        nm.lwqp[79] = -1293583012;
        nm.lwqp[80] = -308957878;
        nm.lwqp[81] = -1611863345;
        nm.lwqp[82] = 1945811499;
        nm.lwqp[83] = -367220540;
        nm.lwqp[84] = -2097773069;
        nm.lwqp[85] = -511325067;
        nm.lwqp[86] = 611665112;
        nm.lwqp[87] = 451744146;
        nm.lwqp[88] = -979445337;
        nm.lwqp[89] = 1243349096;
        nm.lwqp[90] = -701288648;
        nm.lwqp[91] = 646952653;
        nm.lwqp[92] = 1161264456;
        nm.lwqp[93] = -1063226966;
        nm.lwqp[94] = -703336151;
        nm.lwqp[95] = 843354104;
        nm.lwqp[96] = -1525627790;
        nm.lwqp[97] = 2134266391;
        nm.lwqp[98] = -928809953;
        nm.lwqp[99] = 215294956;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double round(double var0, double var2_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwzo", lwqf(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lwzp", lwqn(int ), (int)149)) break;
            v0 /* !! */  = (long)nm.lwqi("lwzq", lwqn(int ), (int)150);
        }
        var8_2 = nm.c;
        v1 /* !! */  = nm.uq;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - nm.lwqi("lwzr", lwqf(int ), (int)86));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -981972273: {
                    v2 = nm.lwqi("lwzs", lwqf(int ), (int)87);
                    continue block18;
                }
                case 1759203347: {
                    break block18;
                }
                case 1802137328: {
                    v2 = nm.lwqi("lwzt", lwqf(int ), (int)88);
                    continue block18;
                }
            }
            break;
        }
        var7_3 /* !! */  = nm.b;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwzu", lwqf(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nm.lwqi("lwzv", lwqn(int ), (int)151)) break;
                    v3 /* !! */  = (long)nm.lwqi("lwzw", lwqn(int ), (int)152);
                }
                var6_4 = nm.a;
                if (var8_2) {
                    throw null;
lbl34:
                    // 2 sources

                    return (double)nm.lwqi("lwzx", lwto(int ), (int)90);
                }
                if (var6_4 || var6_4) ** GOTO lbl34
                v4 = var0 / var2_1;
                v5 /* !! */  = nm.uq;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v5 /* !! */  = (long)(nm.lwqi("lwzz", lwqf(int ), (int)92) - nm.lwqi("lwzy", lwqf(int ), (int)91));
lbl42:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -706074837: {
                            continue block21;
                        }
                        case 1759203347: {
                            break block21;
                        }
                    }
                    break;
                }
                var4_5 = (double)Math.round(v4) * var2_1;
                if (var6_4 || var6_4) ** continue;
                v6 = var4_5 * nm.lwqi("lxaa", lwto(int ), (int)93);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxab", lwqf(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == nm.lwqi("lxac", lwqn(int ), (int)153)) break;
                    v7 /* !! */  = (long)nm.lwqi("lxad", lwqn(int ), (int)154);
                }
                return (double)Math.round(v6) / nm.lwqi("lxae", lwto(int ), (int)95);
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var7_3 /* !! */  = (int)nm.lwqi("lxaf", lwqn(int ), (int)155);
                } while (!var8_2);
                throw null;
            }
            case 1: {
                var7_3 /* !! */  = (int)nm.lwqi("lxag", lwqn(int ), (int)156);
                if (var8_2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var7_3 /* !! */  = (int)nm.lwqi("lxah", lwqn(int ), (int)157);
                } while (!var8_2);
                throw null;
            }
            case 3: {
                var7_3 /* !! */  = (int)nm.lwqi("lxai", lwqn(int ), (int)158);
                if (!var8_2) ** GOTO lbl57
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var7_3 /* !! */  = (int)nm.lwqi("lxaj", lwqn(int ), (int)159);
                    if (!var8_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: 
        }
        var7_3 /* !! */  = (int)nm.lwqi("lxak", lwqn(int ), (int)160);
        ** while (!var8_2)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 cosSin(int var0, int var1_1, double var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxfy", lwqf(int ), (int)156)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lxfz", lwqn(int ), (int)244)) break;
            v0 /* !! */  = (long)nm.lwqi("lxga", lwqn(int ), (int)245);
        }
        var9_3 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxgb", lwqf(int ), (int)157)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nm.lwqi("lxgc", lwqn(int ), (int)246)) break;
            v1 /* !! */  = (long)nm.lwqi("lxgd", lwqn(int ), (int)247);
        }
        var8_4 /* !! */  = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl19
        block40: while (true) {
            v2 /* !! */  = (long)(v3 - nm.lwqi("lxge", lwqf(int ), (int)158));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -511765626: {
                    v3 = nm.lwqi("lxgf", lwqf(int ), (int)159);
                    continue block40;
                }
                case 857733857: {
                    v3 = nm.lwqi("lxgg", lwqf(int ), (int)160);
                    continue block40;
                }
                case 1564652015: {
                    v3 = nm.lwqi("lxgh", lwqf(int ), (int)161);
                    continue block40;
                }
                case 1759203347: {
                    break block40;
                }
            }
            break;
        }
        var7_5 = nm.a;
        if (var9_3) {
            throw null;
lbl34:
            // 4 sources

            return null;
        }
        if (var7_5 || var7_5) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxgi", lwqf(int ), (int)162)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == nm.lwqi("lxgj", lwqn(int ), (int)248)) break;
            v4 /* !! */  = (long)nm.lwqi("lxgk", lwqn(int ), (int)249);
        }
        var4_6 = Math.min(var0, var1_1);
        if (var7_5 || var7_5) ** GOTO lbl34
        v5 = var4_6;
        v6 /* !! */  = nm.uq;
        if (true) ** GOTO lbl50
        block43: while (true) {
            v6 /* !! */  = (long)(v7 - nm.lwqi("lxgl", lwqf(int ), (int)163));
lbl50:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1851087947: {
                    v7 = nm.lwqi("lxgm", lwqf(int ), (int)164);
                    continue block43;
                }
                case 510288613: {
                    v7 = nm.lwqi("lxgn", lwqf(int ), (int)165);
                    continue block43;
                }
                case 1759203347: {
                    break block43;
                }
            }
            break;
        }
        v8 = v5 * nm.PI2 / (double)var1_1;
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxgo", lwqf(int ), (int)166)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == nm.lwqi("lxgp", lwqn(int ), (int)250)) break;
            v9 /* !! */  = (long)nm.lwqi("lxgq", lwqn(int ), (int)251);
        }
        var5_7 = (float)(Math.cos(v8) * var2_2);
        if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_5 || var7_5) ** GOTO lbl34
                v10 = var4_6;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lxgr", lwqf(int ), (int)167)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == nm.lwqi("lxgs", lwqn(int ), (int)252)) break;
                    v11 /* !! */  = (long)nm.lwqi("lxgt", lwqn(int ), (int)253);
                }
                v12 = v10 * nm.PI2 / (double)var1_1;
                v13 /* !! */  = nm.uq;
                if (true) ** GOTO lbl83
                block46: while (true) {
                    v13 /* !! */  = (long)(nm.lwqi("lxgv", lwqf(int ), (int)169) - nm.lwqi("lxgu", lwqf(int ), (int)168));
lbl83:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1759203347: {
                            break block46;
                        }
                        case 1975470782: {
                            continue block46;
                        }
                    }
                    break;
                }
                var6_8 = (float)(-Math.sin(v12) * var2_2);
                if (var7_5 || var7_5) ** continue;
                v14 /* !! */  = nm.uq;
                if (true) ** GOTO lbl94
                block47: while (true) {
                    v14 /* !! */  = (long)(v15 - nm.lwqi("lxgw", lwqf(int ), (int)170));
lbl94:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 234453155: {
                            v15 = nm.lwqi("lxgx", lwqf(int ), (int)171);
                            continue block47;
                        }
                        case 1707039336: {
                            v15 = nm.lwqi("lxgy", lwqf(int ), (int)172);
                            continue block47;
                        }
                        case 1759203347: {
                            break block47;
                        }
                        case 2054651507: {
                            v15 = nm.lwqi("lxgz", lwqf(int ), (int)173);
                            continue block47;
                        }
                    }
                    break;
                }
                v16 = var5_7;
                v17 = var6_8;
                v18 /* !! */  = nm.uq;
                if (true) ** GOTO lbl112
                block48: while (true) {
                    v18 /* !! */  = (long)(v19 - nm.lwqi("lxha", lwqf(int ), (int)174));
lbl112:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -909837655: {
                            v19 = nm.lwqi("lxhb", lwqf(int ), (int)175);
                            continue block48;
                        }
                        case 221508840: {
                            v19 = nm.lwqi("lxhc", lwqf(int ), (int)176);
                            continue block48;
                        }
                        case 1759203347: {
                            break block48;
                        }
                    }
                    break;
                }
                return new class_243(v16, 0.0, v17);
            }
lbl122:
            // 2 sources

            case 0: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhd", lwqn(int ), (int)254);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 1: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhe", lwqn(int ), (int)255);
                if (!var9_3) ** GOTO lbl122
                throw null;
            }
lbl131:
            // 5 sources

            case 2: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhf", lwqn(int ), (int)256);
                if (!var9_3) break;
                throw null;
            }
            case 3: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhg", lwqn(int ), (int)257);
                if (!var9_3) ** GOTO lbl131
                throw null;
            }
            case 4: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhh", lwqn(int ), (int)258);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl144:
            // 2 sources

            case 5: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhi", lwqn(int ), (int)259);
                if (!var9_3) ** GOTO lbl131
                throw null;
            }
            case 6: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhj", lwqn(int ), (int)260);
                if (var9_3) {
                    throw null;
                }
            }
            case 7: {
                var8_4 /* !! */  = (int)nm.lwqi("lxhk", lwqn(int ), (int)261);
                if (!var9_3) ** GOTO lbl144
                throw null;
            }
lbl156:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_4 /* !! */  = (int)nm.lwqi("lxhl", lwqn(int ), (int)262);
                    if (!var9_3) ** GOTO lbl131
                    throw null;
                }
            }
            case 9: 
        }
        var8_4 /* !! */  = (int)nm.lwqi("lxhm", lwqn(int ), (int)263);
        ** while (!var9_3)
lbl164:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lxsn() {
        nm.lwqo[100] = -518990684;
        nm.lwqo[101] = -247603926;
        nm.lwqo[102] = -1846782858;
        nm.lwqo[103] = -395550006;
        nm.lwqo[104] = -514020752;
        nm.lwqo[105] = -1495251672;
        nm.lwqo[106] = -1518634273;
        nm.lwqo[107] = -1380078786;
        nm.lwqo[108] = -728627181;
        nm.lwqo[109] = 2042944851;
        nm.lwqo[110] = 1224403476;
        nm.lwqo[111] = 226127511;
        nm.lwqo[112] = -2087799995;
        nm.lwqo[113] = -1975642751;
        nm.lwqo[114] = 248491264;
        nm.lwqo[115] = -2129057504;
        nm.lwqo[116] = -626809629;
        nm.lwqo[117] = -904783010;
        nm.lwqo[118] = 1232392604;
        nm.lwqo[119] = 1827119301;
        nm.lwqo[120] = 1893273236;
        nm.lwqo[121] = -672386240;
        nm.lwqo[122] = -1273185890;
        nm.lwqo[123] = 1720557299;
        nm.lwqo[124] = -1059955972;
        nm.lwqo[125] = 1774264715;
        nm.lwqo[126] = 230069084;
        nm.lwqo[127] = -1815831949;
        nm.lwqo[128] = 1311738907;
        nm.lwqo[129] = 1849831682;
        nm.lwqo[130] = -250742865;
        nm.lwqo[131] = 677118976;
        nm.lwqo[132] = -130311100;
        nm.lwqo[133] = 991933020;
        nm.lwqo[134] = 462878005;
        nm.lwqo[135] = 938027624;
        nm.lwqo[136] = 93177003;
        nm.lwqo[137] = -2114131621;
        nm.lwqo[138] = 148633808;
        nm.lwqo[139] = -103827128;
        nm.lwqo[140] = 906194405;
        nm.lwqo[141] = 843332056;
        nm.lwqo[142] = 944867903;
        nm.lwqo[143] = -1849520437;
        nm.lwqo[144] = 979830346;
        nm.lwqo[145] = 1956424979;
        nm.lwqo[146] = 1377549129;
        nm.lwqo[147] = -1341485349;
        nm.lwqo[148] = -2044348671;
        nm.lwqo[149] = 1230294426;
        nm.lwqo[150] = 1986868466;
        nm.lwqo[151] = -301647487;
        nm.lwqo[152] = -1926017202;
        nm.lwqo[153] = -2016394064;
        nm.lwqo[154] = -1766310258;
        nm.lwqo[155] = -1121672240;
        nm.lwqo[156] = -1179754746;
        nm.lwqo[157] = -1569282204;
        nm.lwqo[158] = 523459643;
        nm.lwqo[159] = 912586345;
        nm.lwqo[160] = -1491129585;
        nm.lwqo[161] = -1040114187;
        nm.lwqo[162] = -436034553;
        nm.lwqo[163] = -1723362949;
        nm.lwqo[164] = -1602794989;
        nm.lwqo[165] = -1654990759;
        nm.lwqo[166] = 1600609652;
        nm.lwqo[167] = -1912715825;
        nm.lwqo[168] = -336654851;
        nm.lwqo[169] = -1192186880;
        nm.lwqo[170] = 2014406710;
        nm.lwqo[171] = 1597666553;
        nm.lwqo[172] = -1144014364;
        nm.lwqo[173] = 411918517;
        nm.lwqo[174] = 632938813;
        nm.lwqo[175] = -1769960007;
        nm.lwqo[176] = -1460492820;
        nm.lwqo[177] = 120592526;
        nm.lwqo[178] = -1953781763;
        nm.lwqo[179] = 1501536835;
        nm.lwqo[180] = 2129657829;
        nm.lwqo[181] = -610538398;
        nm.lwqo[182] = 2045593868;
        nm.lwqo[183] = 801582309;
        nm.lwqo[184] = 402808427;
        nm.lwqo[185] = 559566974;
        nm.lwqo[186] = -1349738238;
        nm.lwqo[187] = 194765895;
        nm.lwqo[188] = 1867360092;
        nm.lwqo[189] = 180885736;
        nm.lwqo[190] = 1607767994;
        nm.lwqo[191] = 414102502;
        nm.lwqo[192] = 1885425896;
        nm.lwqo[193] = -305760677;
        nm.lwqo[194] = -1588084984;
        nm.lwqo[195] = -2068176365;
        nm.lwqo[196] = 152462452;
        nm.lwqo[197] = -493518419;
        nm.lwqo[198] = 334077021;
        nm.lwqo[199] = -1100852381;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isHovered(double var0, double var2_1, double var4_2, double var6_3, double var8_4, double var10_5) {
        block40: {
            v0 /* !! */  = nm.uq;
            if (true) ** GOTO lbl5
            block23: while (true) {
                v0 /* !! */  = (long)(v1 - nm.lwqi("lwqj", lwqf(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -428208013: {
                        v1 = nm.lwqi("lwqk", lwqf(int ), (int)1);
                        continue block23;
                    }
                    case 1687909049: {
                        v1 = nm.lwqi("lwql", lwqf(int ), (int)2);
                        continue block23;
                    }
                    case 1759203347: {
                        break block23;
                    }
                }
                break;
            }
            var14_6 = nm.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwqm", lwqf(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == nm.lwqi("lwqq", lwqn(int ), (int)0)) break;
                v2 /* !! */  = (long)nm.lwqi("lwqr", lwqn(int ), (int)1);
            }
            var13_7 /* !! */  = nm.b;
            v3 /* !! */  = nm.uq;
            if (true) ** GOTO lbl26
            block25: while (true) {
                v3 /* !! */  = (long)(v4 - nm.lwqi("lwqs", lwqf(int ), (int)4));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -617359763: {
                        v4 = nm.lwqi("lwqt", lwqf(int ), (int)5);
                        continue block25;
                    }
                    case 1699730342: {
                        v4 = nm.lwqi("lwqu", lwqf(int ), (int)6);
                        continue block25;
                    }
                    case 1759203347: {
                        break block25;
                    }
                }
                break;
            }
            var12_8 = nm.a;
            if (var14_6) {
                throw null;
lbl38:
                // 6 sources

                return (boolean)nm.lwqi("lwqv", lwqn(int ), (int)2);
            }
            if (var12_8 || var12_8) ** GOTO lbl38
            if (!(var0 >= var4_2)) break block40;
            if (var12_8) ** GOTO lbl38
            if (!(var0 <= var4_2 + var8_4)) break block40;
            if (var12_8) ** GOTO lbl38
            if (!(var2_1 >= var6_3)) break block40;
            if (var12_8) ** GOTO lbl38
            if (!(var2_1 <= var6_3 + var10_5)) break block40;
            if (var12_8) ** GOTO lbl38
            v5 = nm.lwqi("lwqw", lwqn(int ), (int)3);
            if (var14_6) {
                throw null;
            }
            ** GOTO lbl60
        }
        if (var13_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var12_8 && !var12_8) ** break;
                ** continue;
                v5 = nm.lwqi("lwqx", lwqn(int ), (int)4);
lbl60:
                // 2 sources

                return (boolean)v5;
            }
            case 0: {
                var13_7 /* !! */  = (int)nm.lwqi("lwqy", lwqn(int ), (int)5);
                if (var14_6) {
                    throw null;
                }
            }
lbl65:
            // 4 sources

            case 1: {
                var13_7 /* !! */  = (int)nm.lwqi("lwqz", lwqn(int ), (int)6);
                if (!var14_6) break;
                throw null;
            }
lbl69:
            // 2 sources

            case 2: {
                var13_7 /* !! */  = (int)nm.lwqi("lwra", lwqn(int ), (int)7);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl74:
            // 2 sources

            case 3: {
                var13_7 /* !! */  = (int)nm.lwqi("lwrb", lwqn(int ), (int)8);
                if (var14_6) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 4: {
                var13_7 /* !! */  = (int)nm.lwqi("lwrc", lwqn(int ), (int)9);
                if (!var14_6) ** GOTO lbl69
                throw null;
            }
lbl83:
            // 2 sources

            case 5: {
                var13_7 /* !! */  = (int)nm.lwqi("lwrd", lwqn(int ), (int)10);
                if (!var14_6) ** GOTO lbl65
                throw null;
            }
lbl87:
            // 2 sources

            case 6: {
                var13_7 /* !! */  = (int)nm.lwqi("lwre", lwqn(int ), (int)11);
                if (var14_6) {
                    throw null;
                }
            }
lbl91:
            // 4 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_7 /* !! */  = (int)nm.lwqi("lwrf", lwqn(int ), (int)12);
                    if (!var14_6) ** GOTO lbl74
                    throw null;
                }
            }
lbl96:
            // 2 sources

            case 8: {
                var13_7 /* !! */  = (int)nm.lwqi("lwrg", lwqn(int ), (int)13);
                if (!var14_6) ** GOTO lbl83
                throw null;
            }
            case 9: {
                var13_7 /* !! */  = (int)nm.lwqi("lwrh", lwqn(int ), (int)14);
                if (!var14_6) ** GOTO lbl96
                throw null;
            }
            case 10: 
        }
        var13_7 /* !! */  = (int)nm.lwqi("lwri", lwqn(int ), (int)15);
        ** while (!var14_6)
lbl107:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double interpolate(double var0, double var2_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxpq", lwqf(int ), (int)285)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nm.lwqi("lxpr", lwqn(int ), (int)367)) break;
            v0 /* !! */  = (long)nm.lwqi("lxps", lwqn(int ), (int)368);
        }
        var6_2 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxpt", lwqf(int ), (int)286)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nm.lwqi("lxpu", lwqn(int ), (int)369)) break;
            v1 /* !! */  = (long)nm.lwqi("lxpv", lwqn(int ), (int)370);
        }
        var5_3 /* !! */  = nm.b;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = nm.uq;
                if (true) ** GOTO lbl20
                block24: while (true) {
                    v2 /* !! */  = (long)(nm.lwqi("lxpx", lwqf(int ), (int)288) - nm.lwqi("lxpw", lwqf(int ), (int)287));
lbl20:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -585917383: {
                            continue block24;
                        }
                        case 1759203347: {
                            break block24;
                        }
                    }
                    break;
                }
                var4_4 = nm.a;
                if (var6_2) {
                    throw null;
                    return (double)nm.lwqi("lxpy", lwto(int ), (int)289);
                }
                if (var4_4 || var4_4) ** continue;
                v3 /* !! */  = nm.uq;
                if (true) ** GOTO lbl35
                block26: while (true) {
                    v3 /* !! */  = (long)(v4 - nm.lwqi("lxpz", lwqf(int ), (int)290));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2138061229: {
                            v4 = nm.lwqi("lxqa", lwqf(int ), (int)291);
                            continue block26;
                        }
                        case -2118870611: {
                            v4 = nm.lwqi("lxqb", lwqf(int ), (int)292);
                            continue block26;
                        }
                        case -263038130: {
                            v4 = nm.lwqi("lxqc", lwqf(int ), (int)293);
                            continue block26;
                        }
                        case 1759203347: {
                            break block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxqd", lwqf(int ), (int)294)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nm.lwqi("lxqe", lwqn(int ), (int)371)) break;
                    v5 /* !! */  = (long)nm.lwqi("lxqf", lwqn(int ), (int)372);
                }
                v6 = nm.mc.method_61966();
                v7 = nm.lwqi("lxqg", lwqn(int ), (int)373);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxqh", lwqf(int ), (int)295)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nm.lwqi("lxqi", lwqn(int ), (int)374)) break;
                    v8 /* !! */  = (long)nm.lwqi("lxqj", lwqn(int ), (int)375);
                }
                v9 = v6.method_60637((boolean)v7);
                v10 /* !! */  = nm.uq;
                if (true) ** GOTO lbl64
                block29: while (true) {
                    v10 /* !! */  = (long)(v11 - nm.lwqi("lxqk", lwqf(int ), (int)296));
lbl64:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1095748660: {
                            v11 = nm.lwqi("lxql", lwqf(int ), (int)297);
                            continue block29;
                        }
                        case 1478558206: {
                            v11 = nm.lwqi("lxqm", lwqf(int ), (int)298);
                            continue block29;
                        }
                        case 1758684085: {
                            v11 = nm.lwqi("lxqn", lwqf(int ), (int)299);
                            continue block29;
                        }
                        case 1759203347: {
                            break block29;
                        }
                    }
                    break;
                }
                return class_3532.method_16436((double)v9, (double)var0, (double)var2_1);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_3 /* !! */  = (int)nm.lwqi("lxqo", lwqn(int ), (int)376);
                    if (!var6_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl82:
            // 2 sources

            case 1: {
                do {
                    var5_3 /* !! */  = (int)nm.lwqi("lxqp", lwqn(int ), (int)377);
                } while (!var6_2);
                throw null;
            }
            case 2: {
                var5_3 /* !! */  = (int)nm.lwqi("lxqq", lwqn(int ), (int)378);
                if (!var6_2) ** GOTO lbl82
                throw null;
            }
            case 3: 
        }
        var5_3 /* !! */  = (int)nm.lwqi("lxqr", lwqn(int ), (int)379);
        ** while (!var6_2)
lbl94:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lxss() {
        nm.lwqp[100] = -518990667;
        nm.lwqp[101] = -247603921;
        nm.lwqp[102] = -1846782866;
        nm.lwqp[103] = -395550008;
        nm.lwqp[104] = -514020745;
        nm.lwqp[105] = -1495251667;
        nm.lwqp[106] = -1518634297;
        nm.lwqp[107] = -1380078811;
        nm.lwqp[108] = -728627176;
        nm.lwqp[109] = 2042944856;
        nm.lwqp[110] = 1224403459;
        nm.lwqp[111] = 226127502;
        nm.lwqp[112] = -2087799977;
        nm.lwqp[113] = -1975642728;
        nm.lwqp[114] = 248491295;
        nm.lwqp[115] = -2129057490;
        nm.lwqp[116] = -626809612;
        nm.lwqp[117] = -904783029;
        nm.lwqp[118] = 1232392583;
        nm.lwqp[119] = 1827119307;
        nm.lwqp[120] = 1893273237;
        nm.lwqp[121] = -672386215;
        nm.lwqp[122] = -1273185897;
        nm.lwqp[123] = 1720557299;
        nm.lwqp[124] = -1059955987;
        nm.lwqp[125] = 1774264709;
        nm.lwqp[126] = 230069086;
        nm.lwqp[127] = -1815831948;
        nm.lwqp[128] = 1311738906;
        nm.lwqp[129] = 1849831686;
        nm.lwqp[130] = -250742876;
        nm.lwqp[131] = 677118992;
        nm.lwqp[132] = -130311090;
        nm.lwqp[133] = 991933014;
        nm.lwqp[134] = 462877998;
        nm.lwqp[135] = 938027633;
        nm.lwqp[136] = 93177009;
        nm.lwqp[137] = -2114131622;
        nm.lwqp[138] = -297939322;
        nm.lwqp[139] = -942607168;
        nm.lwqp[140] = 1955950053;
        nm.lwqp[141] = -843332057;
        nm.lwqp[142] = -1186678591;
        nm.lwqp[143] = -1849520437;
        nm.lwqp[144] = 979830347;
        nm.lwqp[145] = 1956424976;
        nm.lwqp[146] = 1377549131;
        nm.lwqp[147] = -1341485351;
        nm.lwqp[148] = -2044348671;
        nm.lwqp[149] = -1230294427;
        nm.lwqp[150] = -1398718702;
        nm.lwqp[151] = -301647488;
        nm.lwqp[152] = -1856013118;
        nm.lwqp[153] = -2016394063;
        nm.lwqp[154] = -773027309;
        nm.lwqp[155] = -1121672239;
        nm.lwqp[156] = -1179754745;
        nm.lwqp[157] = -1569282204;
        nm.lwqp[158] = 523459647;
        nm.lwqp[159] = 912586347;
        nm.lwqp[160] = -1491129585;
        nm.lwqp[161] = -1040114188;
        nm.lwqp[162] = 550984688;
        nm.lwqp[163] = 1723362948;
        nm.lwqp[164] = 1878211356;
        nm.lwqp[165] = 1446839018;
        nm.lwqp[166] = 1600609655;
        nm.lwqp[167] = -1912715825;
        nm.lwqp[168] = -336654850;
        nm.lwqp[169] = -1192186880;
        nm.lwqp[170] = 2014406711;
        nm.lwqp[171] = -1835968901;
        nm.lwqp[172] = -1144014363;
        nm.lwqp[173] = -450539195;
        nm.lwqp[174] = 1744326995;
        nm.lwqp[175] = -1769960023;
        nm.lwqp[176] = -1460493037;
        nm.lwqp[177] = 120592524;
        nm.lwqp[178] = -1953781761;
        nm.lwqp[179] = 1501536835;
        nm.lwqp[180] = 2129657830;
        nm.lwqp[181] = -610538397;
        nm.lwqp[182] = 424988953;
        nm.lwqp[183] = 321357101;
        nm.lwqp[184] = 402808419;
        nm.lwqp[185] = 559566977;
        nm.lwqp[186] = -1349738240;
        nm.lwqp[187] = 194765893;
        nm.lwqp[188] = 1867360095;
        nm.lwqp[189] = 180885737;
        nm.lwqp[190] = 1607767995;
        nm.lwqp[191] = -205610074;
        nm.lwqp[192] = -1885425897;
        nm.lwqp[193] = 1273403441;
        nm.lwqp[194] = -594414579;
        nm.lwqp[195] = -2068176148;
        nm.lwqp[196] = 152462454;
        nm.lwqp[197] = -493518419;
        nm.lwqp[198] = 334077022;
        nm.lwqp[199] = -1100852381;
    }

    private static /* synthetic */ void lxsw() {
        nm.lwqg[0] = -5757565180823652906L;
        nm.lwqg[1] = -9150629821906660909L;
        nm.lwqg[2] = -2328531224925372598L;
        nm.lwqg[3] = -6293535067752436658L;
        nm.lwqg[4] = -3528722437522751860L;
        nm.lwqg[5] = -3693521242417043144L;
        nm.lwqg[6] = -5834355491463628867L;
        nm.lwqg[7] = 2270308423755468394L;
        nm.lwqg[8] = -45916396295616444L;
        nm.lwqg[9] = 4565981521710193468L;
        nm.lwqg[10] = -7281376214347801252L;
        nm.lwqg[11] = 359325955316087262L;
        nm.lwqg[12] = 4686209598553541843L;
        nm.lwqg[13] = -102356055390645354L;
        nm.lwqg[14] = 7314896498134862779L;
        nm.lwqg[15] = -3334372930077524978L;
        nm.lwqg[16] = -8634557728299218431L;
        nm.lwqg[17] = 3792454939782588507L;
        nm.lwqg[18] = 1090346482116958867L;
        nm.lwqg[19] = 322224081760722728L;
        nm.lwqg[20] = -4297322342797955228L;
        nm.lwqg[21] = 3890944058000818546L;
        nm.lwqg[22] = 7596664692790394648L;
        nm.lwqg[23] = -4464748704342581251L;
        nm.lwqg[24] = -6739400312312168562L;
        nm.lwqg[25] = 5897376960632725395L;
        nm.lwqg[26] = 4881415082210343482L;
        nm.lwqg[27] = 3240647007615447437L;
        nm.lwqg[28] = 7149283673177014813L;
        nm.lwqg[29] = 7122991819192925893L;
        nm.lwqg[30] = -6597472114493744283L;
        nm.lwqg[31] = 8691694692192762405L;
        nm.lwqg[32] = -4778094602776157830L;
        nm.lwqg[33] = 8918838677794984051L;
        nm.lwqg[34] = -2591143547946617414L;
        nm.lwqg[35] = -874446181916901556L;
        nm.lwqg[36] = -7683936615541231744L;
        nm.lwqg[37] = 5999962577406722271L;
        nm.lwqg[38] = -31439792386359216L;
        nm.lwqg[39] = 2202629207316256893L;
        nm.lwqg[40] = 4772309131108997457L;
        nm.lwqg[41] = -3476649501004922077L;
        nm.lwqg[42] = -7179804333308298813L;
        nm.lwqg[43] = -3107381131007545005L;
        nm.lwqg[44] = 626147928912677865L;
        nm.lwqg[45] = 1733821544466925027L;
        nm.lwqg[46] = -2322073212528976246L;
        nm.lwqg[47] = 3472137983218901945L;
        nm.lwqg[48] = 815758475026296420L;
        nm.lwqg[49] = -3273121303580810711L;
        nm.lwqg[50] = 3365094473859466586L;
        nm.lwqg[51] = -483105870260587779L;
        nm.lwqg[52] = -3840284647039054551L;
        nm.lwqg[53] = -7766165151609228426L;
        nm.lwqg[54] = -2754139788829405339L;
        nm.lwqg[55] = 7592405242230123793L;
        nm.lwqg[56] = -2294198299119735144L;
        nm.lwqg[57] = -8769949717231867120L;
        nm.lwqg[58] = -2512556555713430495L;
        nm.lwqg[59] = 8275049176891215141L;
        nm.lwqg[60] = -510592372497447515L;
        nm.lwqg[61] = -2577797895515351149L;
        nm.lwqg[62] = -7514957452677150115L;
        nm.lwqg[63] = 631937251224644194L;
        nm.lwqg[64] = 1509002438929534281L;
        nm.lwqg[65] = -7036754257302367875L;
        nm.lwqg[66] = 6673844238418760070L;
        nm.lwqg[67] = -1485264809744967259L;
        nm.lwqg[68] = -1656777806730997208L;
        nm.lwqg[69] = 3818042351452092278L;
        nm.lwqg[70] = -5581107253119990820L;
        nm.lwqg[71] = -1902399511195594790L;
        nm.lwqg[72] = -8182077603154235645L;
        nm.lwqg[73] = 8511862111250851091L;
        nm.lwqg[74] = 3222773465847471657L;
        nm.lwqg[75] = -4359987771723241212L;
        nm.lwqg[76] = -4487847835728143094L;
        nm.lwqg[77] = -8300799113530604839L;
        nm.lwqg[78] = 2183926825562567777L;
        nm.lwqg[79] = -662332674553672685L;
        nm.lwqg[80] = 2187159978114042596L;
        nm.lwqg[81] = -5006534652512582297L;
        nm.lwqg[82] = -7163555454956012083L;
        nm.lwqg[83] = 2628547821726885022L;
        nm.lwqg[84] = -3106542033646036599L;
        nm.lwqg[85] = -601464054368053071L;
        nm.lwqg[86] = -1146838991896704228L;
        nm.lwqg[87] = -674952820831243318L;
        nm.lwqg[88] = -4463037276835731986L;
        nm.lwqg[89] = -1163415767984746973L;
        nm.lwqg[90] = -5167614494802700619L;
        nm.lwqg[91] = -4954308029778806993L;
        nm.lwqg[92] = 2021407325214854396L;
        nm.lwqg[93] = -6561851767402475842L;
        nm.lwqg[94] = 8277035596276526844L;
        nm.lwqg[95] = -8895887312470048145L;
        nm.lwqg[96] = -983102635284135471L;
        nm.lwqg[97] = 8239746453874157534L;
        nm.lwqg[98] = 8770835860144685172L;
        nm.lwqg[99] = -9215722196327681257L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float getRandom(float var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwvf", lwqf(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lwvg", lwqn(int ), (int)67)) break;
            v0 /* !! */  = (long)nm.lwqi("lwvh", lwqn(int ), (int)68);
        }
        var4_2 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwvi", lwqf(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nm.lwqi("lwvj", lwqn(int ), (int)69)) break;
            v1 /* !! */  = (long)nm.lwqi("lwvk", lwqn(int ), (int)70);
        }
        var3_3 = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - nm.lwqi("lwvl", lwqf(int ), (int)56));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1080778195: {
                    v3 = nm.lwqi("lwvm", lwqf(int ), (int)57);
                    continue block8;
                }
                case -276630534: {
                    v3 = nm.lwqi("lwvn", lwqf(int ), (int)58);
                    continue block8;
                }
                case 757145484: {
                    v3 = nm.lwqi("lwvo", lwqf(int ), (int)59);
                    continue block8;
                }
                case 1759203347: {
                    break block8;
                }
            }
            break;
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
lbl34:
            // 1 sources

            return (float)nm.lwqi("lwvp", lwrs(int ), (int)71);
        }
        ** while (var2_4 || var2_4)
lbl37:
        // 1 sources

        v4 = var0;
        v5 = var1_1;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lwvq", lwqf(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == nm.lwqi("lwvr", lwqn(int ), (int)72)) break;
            v6 /* !! */  = (long)nm.lwqi("lwvs", lwqn(int ), (int)73);
        }
        return (float)nm.getRandom(v4, v5);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float textScrolling(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwyo", lwqf(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lwyp", lwqn(int ), (int)137)) break;
            v0 /* !! */  = (long)nm.lwqi("lwyq", lwqn(int ), (int)138);
        }
        var4_1 = nm.c;
        v1 /* !! */  = nm.uq;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - nm.lwqi("lwyr", lwqf(int ), (int)72));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1240682884: {
                    v2 = nm.lwqi("lwys", lwqf(int ), (int)73);
                    continue block26;
                }
                case 1416459635: {
                    v2 = nm.lwqi("lwyt", lwqf(int ), (int)74);
                    continue block26;
                }
                case 1759203347: {
                    break block26;
                }
            }
            break;
        }
        var3_2 /* !! */  = nm.b;
        v3 /* !! */  = nm.uq;
        if (true) ** GOTO lbl26
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - nm.lwqi("lwyu", lwqf(int ), (int)75));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1079160202: {
                    v4 = nm.lwqi("lwyv", lwqf(int ), (int)76);
                    continue block27;
                }
                case -206238919: {
                    v4 = nm.lwqi("lwyw", lwqf(int ), (int)77);
                    continue block27;
                }
                case 453528233: {
                    v4 = nm.lwqi("lwyx", lwqf(int ), (int)78);
                    continue block27;
                }
                case 1759203347: {
                    break block27;
                }
            }
            break;
        }
        var2_3 = nm.a;
        if (var4_1) {
            throw null;
lbl41:
            // 3 sources

            return (float)nm.lwqi("lwyy", lwrs(int ), (int)139);
        }
        if (var2_3 || var2_3) ** GOTO lbl41
        var1_4 = (int)(var0 * nm.lwqi("lwyz", lwrs(int ), (int)140));
        if (var2_3) ** GOTO lbl41
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                v5 /* !! */  = nm.uq;
                if (true) ** GOTO lbl55
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - nm.lwqi("lwza", lwqf(int ), (int)79));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 200794988: {
                            v6 = nm.lwqi("lwzb", lwqf(int ), (int)80);
                            continue block29;
                        }
                        case 786796067: {
                            v6 = nm.lwqi("lwzc", lwqf(int ), (int)81);
                            continue block29;
                        }
                        case 1480955855: {
                            v6 = nm.lwqi("lwzd", lwqf(int ), (int)82);
                            continue block29;
                        }
                        case 1759203347: {
                            break block29;
                        }
                    }
                    break;
                }
                v7 = (double)(System.currentTimeMillis() % (long)var1_4) * nm.lwqi("lwze", lwto(int ), (int)83) / (double)var1_4;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwzf", lwqf(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == nm.lwqi("lwzg", lwqn(int ), (int)141)) break;
                    v8 /* !! */  = (long)nm.lwqi("lwzh", lwqn(int ), (int)142);
                }
                return (float)class_3532.method_15350((double)v7, (double)0.0, (double)1.0) * var0;
            }
            case 0: {
                do {
                    var3_2 /* !! */  = (int)nm.lwqi("lwzi", lwqn(int ), (int)143);
                } while (!var4_1);
                throw null;
            }
lbl80:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)nm.lwqi("lwzj", lwqn(int ), (int)144);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 2: {
                var3_2 /* !! */  = (int)nm.lwqi("lwzk", lwqn(int ), (int)145);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 3: {
                var3_2 /* !! */  = (int)nm.lwqi("lwzl", lwqn(int ), (int)146);
                if (!var4_1) ** GOTO lbl80
                throw null;
            }
lbl94:
            // 3 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)nm.lwqi("lwzm", lwqn(int ), (int)147);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        do {
            var3_2 /* !! */  = (int)nm.lwqi("lwzn", lwqn(int ), (int)148);
        } while (!var4_1);
        throw null;
    }

    private static /* synthetic */ int lwqn(int n2) {
        return lwqo[n2] ^ lwqp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float interpolateSmooth(double var0, float var2_1, float var3_2) {
        v0 /* !! */  = nm.uq;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - nm.lwqi("lxqs", lwqf(int ), (int)300));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 553737944: {
                    v1 = nm.lwqi("lxqt", lwqf(int ), (int)301);
                    continue block21;
                }
                case 1301060818: {
                    v1 = nm.lwqi("lxqu", lwqf(int ), (int)302);
                    continue block21;
                }
                case 1759203347: {
                    break block21;
                }
            }
            break;
        }
        var6_3 = nm.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxqv", lwqf(int ), (int)303)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nm.lwqi("lxqw", lwqn(int ), (int)380)) break;
            v2 /* !! */  = (long)nm.lwqi("lxqx", lwqn(int ), (int)381);
        }
        var5_4 = nm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxqy", lwqf(int ), (int)304)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nm.lwqi("lxqz", lwqn(int ), (int)382)) break;
            v3 /* !! */  = (long)nm.lwqi("lxra", lwqn(int ), (int)383);
        }
        var4_5 = nm.a;
        if (var6_3) {
            throw null;
lbl31:
            // 1 sources

            return (float)nm.lwqi("lxrb", lwrs(int ), (int)384);
        }
        ** while (var4_5 || var4_5)
lbl34:
        // 1 sources

        v4 /* !! */  = nm.uq;
        if (true) ** GOTO lbl38
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - nm.lwqi("lxrc", lwqf(int ), (int)305));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 365132335: {
                    v5 = nm.lwqi("lxrd", lwqf(int ), (int)306);
                    continue block25;
                }
                case 1199126599: {
                    v5 = nm.lwqi("lxre", lwqf(int ), (int)307);
                    continue block25;
                }
                case 1759203347: {
                    break block25;
                }
            }
            break;
        }
        v6 /* !! */  = nm.uq;
        if (true) ** GOTO lbl51
        block26: while (true) {
            v6 /* !! */  = (long)(v7 - nm.lwqi("lxrf", lwqf(int ), (int)308));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1881473689: {
                    v7 = nm.lwqi("lxrg", lwqf(int ), (int)309);
                    continue block26;
                }
                case 1189082613: {
                    v7 = nm.lwqi("lxrh", lwqf(int ), (int)310);
                    continue block26;
                }
                case 1759203347: {
                    break block26;
                }
            }
            break;
        }
        v8 = nm.mc.method_61966();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxri", lwqf(int ), (int)311)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == nm.lwqi("lxrj", lwqn(int ), (int)385)) break;
            v9 /* !! */  = (long)nm.lwqi("lxrk", lwqn(int ), (int)386);
        }
        v10 = (double)v8.method_60638() / var0;
        v11 = var2_1;
        v12 = var3_2;
        v13 /* !! */  = nm.uq;
        if (true) ** GOTO lbl74
        block28: while (true) {
            v13 /* !! */  = (long)(v14 - nm.lwqi("lxrl", lwqf(int ), (int)312));
lbl74:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1180518751: {
                    v14 = nm.lwqi("lxrm", lwqf(int ), (int)313);
                    continue block28;
                }
                case -1087802183: {
                    v14 = nm.lwqi("lxrn", lwqf(int ), (int)314);
                    continue block28;
                }
                case -48587721: {
                    v14 = nm.lwqi("lxro", lwqf(int ), (int)315);
                    continue block28;
                }
                case 1759203347: {
                    break block28;
                }
            }
            break;
        }
        return (float)class_3532.method_16436((double)v10, (double)v11, (double)v12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float interpolate(float var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxkd", lwqf(int ), (int)211)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nm.lwqi("lxke", lwqn(int ), (int)298)) break;
            v0 /* !! */  = (long)nm.lwqi("lxkf", lwqn(int ), (int)299);
        }
        var5_3 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxkg", lwqf(int ), (int)212)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nm.lwqi("lxkh", lwqn(int ), (int)300)) break;
            v1 /* !! */  = (long)nm.lwqi("lxki", lwqn(int ), (int)301);
        }
        var4_4 /* !! */  = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(nm.lwqi("lxkk", lwqf(int ), (int)214) - nm.lwqi("lxkj", lwqf(int ), (int)213));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1660549676: {
                    continue block12;
                }
                case 1759203347: {
                    break block12;
                }
            }
            break;
        }
        var3_5 = nm.a;
        if (var5_3) {
            throw null;
lbl27:
            // 2 sources

            return (float)nm.lwqi("lxkl", lwrs(int ), (int)302);
        }
        if (var3_5) ** GOTO lbl27
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                return var0 + (var1_1 - var0) * var2_2;
            }
lbl35:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)nm.lwqi("lxkm", lwqn(int ), (int)303);
                if (!var5_3) break;
                throw null;
            }
            case 1: {
                do {
                    var4_4 /* !! */  = (int)nm.lwqi("lxkn", lwqn(int ), (int)304);
                } while (!var5_3);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)nm.lwqi("lxko", lwqn(int ), (int)305);
                    if (!var5_3) ** GOTO lbl35
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)nm.lwqi("lxkp", lwqn(int ), (int)306);
        ** while (!var5_3)
lbl52:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float randomLerp(float var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwrj", lwqf(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nm.lwqi("lwrk", lwqn(int ), (int)16)) break;
            v0 /* !! */  = (long)nm.lwqi("lwrl", lwqn(int ), (int)17);
        }
        var4_2 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwrm", lwqf(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nm.lwqi("lwrn", lwqn(int ), (int)18)) break;
            v1 /* !! */  = (long)nm.lwqi("lwro", lwqn(int ), (int)19);
        }
        var3_3 = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl17
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - nm.lwqi("lwrp", lwqf(int ), (int)9));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 525757643: {
                    v3 = nm.lwqi("lwrq", lwqf(int ), (int)10);
                    continue block16;
                }
                case 1421479439: {
                    v3 = nm.lwqi("lwrr", lwqf(int ), (int)11);
                    continue block16;
                }
                case 1759203347: {
                    break block16;
                }
            }
            break;
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return (float)nm.lwqi("lwrt", lwrs(int ), (int)20);
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        v4 /* !! */  = nm.uq;
        if (true) ** GOTO lbl36
        block18: while (true) {
            v4 /* !! */  = (long)(v5 - nm.lwqi("lwru", lwqf(int ), (int)12));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1946479684: {
                    v5 = nm.lwqi("lwrv", lwqf(int ), (int)13);
                    continue block18;
                }
                case 1759203347: {
                    break block18;
                }
                case 1790777578: {
                    v5 = nm.lwqi("lwrw", lwqf(int ), (int)14);
                    continue block18;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lwrx", lwqf(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nm.lwqi("lwry", lwqn(int ), (int)21)) break;
            v6 /* !! */  = (long)nm.lwqi("lwrz", lwqn(int ), (int)22);
        }
        v7 = new SecureRandom();
        v8 /* !! */  = nm.uq;
        if (true) ** GOTO lbl55
        block20: while (true) {
            v8 /* !! */  = (long)(nm.lwqi("lwsb", lwqf(int ), (int)17) - nm.lwqi("lwsa", lwqf(int ), (int)16));
lbl55:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -277606358: {
                    continue block20;
                }
                case 1759203347: {
                    break block20;
                }
            }
            break;
        }
        v9 = v7.nextFloat();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lwsc", lwqf(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == nm.lwqi("lwsd", lwqn(int ), (int)23)) break;
            v10 /* !! */  = (long)nm.lwqi("lwse", lwqn(int ), (int)24);
        }
        return class_3532.method_16439((float)v9, (float)var0, (float)var1_1);
    }

    private static /* synthetic */ void lxta() {
        nm.lwqh[0] = -8452881633249987201L;
        nm.lwqh[1] = -1501865021470594597L;
        nm.lwqh[2] = 8043241064458835475L;
        nm.lwqh[3] = -8376782242771338144L;
        nm.lwqh[4] = -3445688797067163834L;
        nm.lwqh[5] = 4915770519543496892L;
        nm.lwqh[6] = 4678292081512568564L;
        nm.lwqh[7] = -8943608635753683905L;
        nm.lwqh[8] = 6478866486749511993L;
        nm.lwqh[9] = 1963227639281690245L;
        nm.lwqh[10] = -6790876507159538708L;
        nm.lwqh[11] = 6209946597248842451L;
        nm.lwqh[12] = -9129639469498660483L;
        nm.lwqh[13] = -394222328385082171L;
        nm.lwqh[14] = 6715438278073810886L;
        nm.lwqh[15] = -2960431391057421401L;
        nm.lwqh[16] = 4683991885801922038L;
        nm.lwqh[17] = -4309226792088159241L;
        nm.lwqh[18] = -7132919825151157413L;
        nm.lwqh[19] = -4759414506000000157L;
        nm.lwqh[20] = -986798894320986700L;
        nm.lwqh[21] = -7770816589220598846L;
        nm.lwqh[22] = 6749001987929860961L;
        nm.lwqh[23] = 7409814886563350888L;
        nm.lwqh[24] = 1555042638371325125L;
        nm.lwqh[25] = 5603935611433759824L;
        nm.lwqh[26] = 6537768667401065829L;
        nm.lwqh[27] = 2370174355834448251L;
        nm.lwqh[28] = 4910759338245846430L;
        nm.lwqh[29] = -5131286002725259357L;
        nm.lwqh[30] = -6688985258032368214L;
        nm.lwqh[31] = 5135393380255371609L;
        nm.lwqh[32] = 409289434054015085L;
        nm.lwqh[33] = 2264281192429020215L;
        nm.lwqh[34] = -1295771287570202047L;
        nm.lwqh[35] = -2960118801333826680L;
        nm.lwqh[36] = -5578380715752027455L;
        nm.lwqh[37] = 2258538070489970435L;
        nm.lwqh[38] = -1084171861146034584L;
        nm.lwqh[39] = 7953107117182123969L;
        nm.lwqh[40] = 9068445271572736610L;
        nm.lwqh[41] = -1150128558416749895L;
        nm.lwqh[42] = -2570370114694596157L;
        nm.lwqh[43] = 7797698106059360241L;
        nm.lwqh[44] = 3982225552170612954L;
        nm.lwqh[45] = -5280089648158712993L;
        nm.lwqh[46] = 74523549830799965L;
        nm.lwqh[47] = -6169022681661521887L;
        nm.lwqh[48] = -6547022943944360385L;
        nm.lwqh[49] = -4960717275756429980L;
        nm.lwqh[50] = -4282377770409270135L;
        nm.lwqh[51] = -7594986636984449000L;
        nm.lwqh[52] = -4845066470329275935L;
        nm.lwqh[53] = -3677870976495483317L;
        nm.lwqh[54] = -4538837508293129830L;
        nm.lwqh[55] = -6706214101527655274L;
        nm.lwqh[56] = 5022203667625350611L;
        nm.lwqh[57] = 4667980801963341604L;
        nm.lwqh[58] = -4389251926520097341L;
        nm.lwqh[59] = 4409433354469427855L;
        nm.lwqh[60] = 4457238450959735536L;
        nm.lwqh[61] = -7895856097042042842L;
        nm.lwqh[62] = 5907589735306489129L;
        nm.lwqh[63] = 2954964156493773098L;
        nm.lwqh[64] = 9104515969212811122L;
        nm.lwqh[65] = -6781807521266508395L;
        nm.lwqh[66] = 3317705640380985069L;
        nm.lwqh[67] = -7756185303041757692L;
        nm.lwqh[68] = 6632680728547312528L;
        nm.lwqh[69] = 8975607973123404157L;
        nm.lwqh[70] = 7903186068441639367L;
        nm.lwqh[71] = 8688853570329054271L;
        nm.lwqh[72] = 4595200355386515042L;
        nm.lwqh[73] = 3938565132537942668L;
        nm.lwqh[74] = -2156509133182822809L;
        nm.lwqh[75] = 4593367430667831974L;
        nm.lwqh[76] = -5689793331955020630L;
        nm.lwqh[77] = -6281186882259412547L;
        nm.lwqh[78] = -7345236192737104998L;
        nm.lwqh[79] = -8371530537323308935L;
        nm.lwqh[80] = -5108784829696008002L;
        nm.lwqh[81] = 497789449999082592L;
        nm.lwqh[82] = 4639359653987744284L;
        nm.lwqh[83] = 7238229813451573638L;
        nm.lwqh[84] = -4540252700997289750L;
        nm.lwqh[85] = -4127622717584380727L;
        nm.lwqh[86] = 6524861878300037513L;
        nm.lwqh[87] = -1733403972245161048L;
        nm.lwqh[88] = -8163266837368713973L;
        nm.lwqh[89] = 2890528513406940984L;
        nm.lwqh[90] = -8669722776437814297L;
        nm.lwqh[91] = -6317705266845844709L;
        nm.lwqh[92] = -5369302349074167768L;
        nm.lwqh[93] = -1966209822647595330L;
        nm.lwqh[94] = -7568787597854967383L;
        nm.lwqh[95] = -4264216570696203665L;
        nm.lwqh[96] = -3862974126069813696L;
        nm.lwqh[97] = -8343605176101716116L;
        nm.lwqh[98] = 2358702947912947933L;
        nm.lwqh[99] = 8272551381954259377L;
    }

    private static /* synthetic */ void lxtc() {
        nm.lwqh[200] = -8387766459961324636L;
        nm.lwqh[201] = 693427280925225064L;
        nm.lwqh[202] = -3417162995376002212L;
        nm.lwqh[203] = 7621025397289022915L;
        nm.lwqh[204] = -7217057608632476324L;
        nm.lwqh[205] = 8664640202893255133L;
        nm.lwqh[206] = 4344592583657474349L;
        nm.lwqh[207] = 6020013819454788833L;
        nm.lwqh[208] = 647234148117530097L;
        nm.lwqh[209] = -1798236237017208914L;
        nm.lwqh[210] = -5690801785232599565L;
        nm.lwqh[211] = 2327771634370362930L;
        nm.lwqh[212] = 5469243532637865966L;
        nm.lwqh[213] = -8311025880773252897L;
        nm.lwqh[214] = 2944840285577935283L;
        nm.lwqh[215] = 7799697869698046653L;
        nm.lwqh[216] = 764295463307375534L;
        nm.lwqh[217] = -8093800099956085386L;
        nm.lwqh[218] = -7212612289733294019L;
        nm.lwqh[219] = -4803302998118777389L;
        nm.lwqh[220] = -2244781668413399345L;
        nm.lwqh[221] = -4736949107336614978L;
        nm.lwqh[222] = 564533287596759260L;
        nm.lwqh[223] = 3873562738868358452L;
        nm.lwqh[224] = 3678503344923866858L;
        nm.lwqh[225] = 695522402589807623L;
        nm.lwqh[226] = 3688687780031963514L;
        nm.lwqh[227] = -5654471370143244754L;
        nm.lwqh[228] = -7135089104391616920L;
        nm.lwqh[229] = 4478811043098863767L;
        nm.lwqh[230] = -4860898752895171123L;
        nm.lwqh[231] = -1947177120679725350L;
        nm.lwqh[232] = -3920562427353788375L;
        nm.lwqh[233] = -6161454808206676480L;
        nm.lwqh[234] = -9163941072787613580L;
        nm.lwqh[235] = 1400821838657468302L;
        nm.lwqh[236] = 1800605960831328565L;
        nm.lwqh[237] = 5303036544068821197L;
        nm.lwqh[238] = -541491878628054064L;
        nm.lwqh[239] = -2400824670965880544L;
        nm.lwqh[240] = -8960099971355947794L;
        nm.lwqh[241] = -5205179163213143706L;
        nm.lwqh[242] = 8275448534175609984L;
        nm.lwqh[243] = -913746264119217662L;
        nm.lwqh[244] = 3389514280984059102L;
        nm.lwqh[245] = -8089489418297362172L;
        nm.lwqh[246] = -384316406961763509L;
        nm.lwqh[247] = -3198277717029229323L;
        nm.lwqh[248] = 79363914149469518L;
        nm.lwqh[249] = -4490549966199853777L;
        nm.lwqh[250] = -7356439649368821090L;
        nm.lwqh[251] = 3693901293131782692L;
        nm.lwqh[252] = -1019721919524538669L;
        nm.lwqh[253] = -3302936389619875353L;
        nm.lwqh[254] = 8734443633166373090L;
        nm.lwqh[255] = 3256674726300087173L;
        nm.lwqh[256] = -9035407483221833904L;
        nm.lwqh[257] = 2045115614595597262L;
        nm.lwqh[258] = -3732515838379688249L;
        nm.lwqh[259] = -1613830368300446057L;
        nm.lwqh[260] = -2695514517252412474L;
        nm.lwqh[261] = -1128627318948409093L;
        nm.lwqh[262] = -9148266562157391915L;
        nm.lwqh[263] = 4514112399463558538L;
        nm.lwqh[264] = 7528661859682812270L;
        nm.lwqh[265] = -2127601078583120569L;
        nm.lwqh[266] = 3638964204791819600L;
        nm.lwqh[267] = -6635189350900609592L;
        nm.lwqh[268] = -7753337396583627107L;
        nm.lwqh[269] = 6937765096298948612L;
        nm.lwqh[270] = -4877589363099158781L;
        nm.lwqh[271] = 93393045076858732L;
        nm.lwqh[272] = -8517370112499061698L;
        nm.lwqh[273] = -4344980041997882761L;
        nm.lwqh[274] = 2015933038786974657L;
        nm.lwqh[275] = 7184430409058904548L;
        nm.lwqh[276] = 3184525351596925026L;
        nm.lwqh[277] = 8587801827746511057L;
        nm.lwqh[278] = -5063227149451505247L;
        nm.lwqh[279] = 7790518145932108737L;
        nm.lwqh[280] = 5760682934098957300L;
        nm.lwqh[281] = -1031294200128025308L;
        nm.lwqh[282] = -1552542595483650240L;
        nm.lwqh[283] = -5850918299261569440L;
        nm.lwqh[284] = 5948883857419841467L;
        nm.lwqh[285] = -2818856315346843660L;
        nm.lwqh[286] = -6798997532375046433L;
        nm.lwqh[287] = 4806001590576106058L;
        nm.lwqh[288] = 1840817640070898755L;
        nm.lwqh[289] = 295526465636845127L;
        nm.lwqh[290] = -7256887361892842651L;
        nm.lwqh[291] = 8131916848566535073L;
        nm.lwqh[292] = -3710442127354661914L;
        nm.lwqh[293] = 1513490382261315908L;
        nm.lwqh[294] = -1208933949722389552L;
        nm.lwqh[295] = 1797332465070192213L;
        nm.lwqh[296] = 1027239002731852232L;
        nm.lwqh[297] = 2603072883730503234L;
        nm.lwqh[298] = -4608410135892492511L;
        nm.lwqh[299] = 2872511455745600280L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double getRandom(double var0, double var2_1) {
        block56: {
            block55: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lwvx", lwqf(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == nm.lwqi("lwvy", lwqn(int ), (int)78)) break;
                    v0 /* !! */  = (long)nm.lwqi("lwvz", lwqn(int ), (int)79);
                }
                var8_2 = nm.c;
                v1 /* !! */  = nm.uq;
                if (true) ** GOTO lbl12
                block31: while (true) {
                    v1 /* !! */  = (long)(nm.lwqi("lwwb", lwqf(int ), (int)63) - nm.lwqi("lwwa", lwqf(int ), (int)62));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 1756328892: {
                            continue block31;
                        }
                        case 1759203347: {
                            break block31;
                        }
                    }
                    break;
                }
                var7_3 /* !! */  = nm.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lwwc", lwqf(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == nm.lwqi("lwwd", lwqn(int ), (int)80)) break;
                    v2 /* !! */  = (long)nm.lwqi("lwwe", lwqn(int ), (int)81);
                }
                var6_4 = nm.a;
                if (var8_2) {
                    throw null;
lbl27:
                    // 8 sources

                    return (double)nm.lwqi("lwwf", lwto(int ), (int)65);
                }
                if (var6_4 || var6_4) ** GOTO lbl27
                if (var0 != var2_1) break block55;
                if (var6_4 || var6_4) ** GOTO lbl27
                return var0;
            }
            if (var6_4 || var6_4) ** GOTO lbl27
            if (!(var0 > var2_1)) break block56;
            if (var6_4 || var6_4) ** GOTO lbl27
            var4_5 = var0;
            if (var6_4 || var6_4) ** GOTO lbl27
            var0 = var2_1;
            if (var6_4 || var6_4) ** GOTO lbl27
            var2_1 = var4_5;
            if (var6_4) ** GOTO lbl27
        }
        if (!var6_4 && !var6_4) ** break;
        ** while (true)
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = nm.uq;
                if (true) ** GOTO lbl53
                block34: while (true) {
                    v3 /* !! */  = (long)(v4 - nm.lwqi("lwwg", lwqf(int ), (int)66));
lbl53:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1637170516: {
                            v4 = nm.lwqi("lwwh", lwqf(int ), (int)67);
                            continue block34;
                        }
                        case 538969419: {
                            v4 = nm.lwqi("lwwi", lwqf(int ), (int)68);
                            continue block34;
                        }
                        case 556932412: {
                            v4 = nm.lwqi("lwwj", lwqf(int ), (int)69);
                            continue block34;
                        }
                        case 1759203347: {
                            break block34;
                        }
                    }
                    break;
                }
                v5 = ThreadLocalRandom.current();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lwwk", lwqf(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == nm.lwqi("lwwl", lwqn(int ), (int)82)) break;
                    v6 /* !! */  = (long)nm.lwqi("lwwm", lwqn(int ), (int)83);
                }
                return v5.nextDouble(var0, var2_1);
            }
lbl73:
            // 5 sources

            case 0: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwn", lwqn(int ), (int)84);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 1: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwo", lwqn(int ), (int)85);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl83:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)nm.lwqi("lwwp", lwqn(int ), (int)86);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl106
                    break;
                }
            }
            case 3: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwq", lwqn(int ), (int)87);
                if (!var8_2) ** GOTO lbl83
                throw null;
            }
lbl93:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwr", lwqn(int ), (int)88);
                if (!var8_2) ** GOTO lbl73
                throw null;
            }
            case 5: {
                do {
                    var7_3 /* !! */  = (int)nm.lwqi("lwws", lwqn(int ), (int)89);
                } while (!var8_2);
                throw null;
            }
            case 6: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwt", lwqn(int ), (int)90);
                if (var8_2) {
                    throw null;
                }
            }
lbl106:
            // 4 sources

            case 7: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwu", lwqn(int ), (int)91);
                if (!var8_2) ** GOTO lbl73
                throw null;
            }
lbl110:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwv", lwqn(int ), (int)92);
                if (!var8_2) ** GOTO lbl73
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)nm.lwqi("lwww", lwqn(int ), (int)93);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 10: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwx", lwqn(int ), (int)94);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 11: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwy", lwqn(int ), (int)95);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl129:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)nm.lwqi("lwwz", lwqn(int ), (int)96);
                if (!var8_2) ** GOTO lbl93
                throw null;
            }
lbl133:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)nm.lwqi("lwxa", lwqn(int ), (int)97);
                if (var8_2) {
                    throw null;
                }
            }
            case 14: {
                var7_3 /* !! */  = (int)nm.lwqi("lwxb", lwqn(int ), (int)98);
                if (!var8_2) ** GOTO lbl133
                throw null;
            }
lbl141:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)nm.lwqi("lwxc", lwqn(int ), (int)99);
                if (!var8_2) ** GOTO lbl110
                throw null;
            }
lbl145:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)nm.lwqi("lwxd", lwqn(int ), (int)100);
                if (!var8_2) ** GOTO lbl73
                throw null;
            }
            case 17: 
        }
        var7_3 /* !! */  = (int)nm.lwqi("lwxe", lwqn(int ), (int)101);
        ** while (!var8_2)
lbl152:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lwqi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lxsm() {
        nm.lwqo[0] = 181373166;
        nm.lwqo[1] = 845057337;
        nm.lwqo[2] = 510469090;
        nm.lwqo[3] = -600309568;
        nm.lwqo[4] = 667929284;
        nm.lwqo[5] = 533553168;
        nm.lwqo[6] = -1207943114;
        nm.lwqo[7] = 821034341;
        nm.lwqo[8] = -840548838;
        nm.lwqo[9] = 1498756781;
        nm.lwqo[10] = -1943238696;
        nm.lwqo[11] = -758033125;
        nm.lwqo[12] = 1536444938;
        nm.lwqo[13] = -854367640;
        nm.lwqo[14] = 725713639;
        nm.lwqo[15] = -1892737812;
        nm.lwqo[16] = -1680197247;
        nm.lwqo[17] = -651250233;
        nm.lwqo[18] = 643500165;
        nm.lwqo[19] = -1859712373;
        nm.lwqo[20] = -2088704375;
        nm.lwqo[21] = 156585832;
        nm.lwqo[22] = 1728094988;
        nm.lwqo[23] = -1610228543;
        nm.lwqo[24] = 1283330252;
        nm.lwqo[25] = -1430269607;
        nm.lwqo[26] = 934233321;
        nm.lwqo[27] = 1477315160;
        nm.lwqo[28] = -63877569;
        nm.lwqo[29] = -311579039;
        nm.lwqo[30] = 347483803;
        nm.lwqo[31] = 1344975507;
        nm.lwqo[32] = 1088202983;
        nm.lwqo[33] = 1994874154;
        nm.lwqo[34] = -641768617;
        nm.lwqo[35] = -731516435;
        nm.lwqo[36] = -686294370;
        nm.lwqo[37] = -1627593434;
        nm.lwqo[38] = -361969155;
        nm.lwqo[39] = 2147467476;
        nm.lwqo[40] = 2142238823;
        nm.lwqo[41] = 1335675171;
        nm.lwqo[42] = -1704486277;
        nm.lwqo[43] = -1126928905;
        nm.lwqo[44] = -2034931775;
        nm.lwqo[45] = -546356383;
        nm.lwqo[46] = 738468943;
        nm.lwqo[47] = -2037606822;
        nm.lwqo[48] = -993855541;
        nm.lwqo[49] = 2144403728;
        nm.lwqo[50] = -1748749104;
        nm.lwqo[51] = 1227233618;
        nm.lwqo[52] = 840163147;
        nm.lwqo[53] = -1616669494;
        nm.lwqo[54] = 1808775190;
        nm.lwqo[55] = 1664285009;
        nm.lwqo[56] = -865821986;
        nm.lwqo[57] = 1336806593;
        nm.lwqo[58] = -686702867;
        nm.lwqo[59] = 996478965;
        nm.lwqo[60] = 1177418280;
        nm.lwqo[61] = 1269681447;
        nm.lwqo[62] = 1743070897;
        nm.lwqo[63] = -1678652368;
        nm.lwqo[64] = -639109039;
        nm.lwqo[65] = -1957478564;
        nm.lwqo[66] = -1514608136;
        nm.lwqo[67] = 1544767110;
        nm.lwqo[68] = -423439746;
        nm.lwqo[69] = -1668875469;
        nm.lwqo[70] = -230751564;
        nm.lwqo[71] = -483477893;
        nm.lwqo[72] = -1404712550;
        nm.lwqo[73] = 2094831345;
        nm.lwqo[74] = -72691882;
        nm.lwqo[75] = -1059211649;
        nm.lwqo[76] = 1255726703;
        nm.lwqo[77] = -1558475809;
        nm.lwqo[78] = -1046378480;
        nm.lwqo[79] = 2101132499;
        nm.lwqo[80] = 308957877;
        nm.lwqo[81] = 76339629;
        nm.lwqo[82] = 1945811498;
        nm.lwqo[83] = 1579118216;
        nm.lwqo[84] = -2097773064;
        nm.lwqo[85] = -511325059;
        nm.lwqo[86] = 611665109;
        nm.lwqo[87] = 451744151;
        nm.lwqo[88] = -979445332;
        nm.lwqo[89] = 1243349113;
        nm.lwqo[90] = -701288664;
        nm.lwqo[91] = 646952641;
        nm.lwqo[92] = 1161264473;
        nm.lwqo[93] = -1063226962;
        nm.lwqo[94] = -703336147;
        nm.lwqo[95] = 843354103;
        nm.lwqo[96] = -1525627777;
        nm.lwqo[97] = 2134266384;
        nm.lwqo[98] = -928809956;
        nm.lwqo[99] = 215294972;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int applyContextAlpha(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxeq", lwqf(int ), (int)139)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nm.lwqi("lxer", lwqn(int ), (int)227)) break;
            v0 /* !! */  = (long)nm.lwqi("lxes", lwqn(int ), (int)228);
        }
        var4_1 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxet", lwqf(int ), (int)140)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nm.lwqi("lxeu", lwqn(int ), (int)229)) break;
            v1 /* !! */  = (long)nm.lwqi("lxev", lwqn(int ), (int)230);
        }
        var3_2 /* !! */  = nm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxew", lwqf(int ), (int)141)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nm.lwqi("lxex", lwqn(int ), (int)231)) break;
            v2 /* !! */  = (long)nm.lwqi("lxey", lwqn(int ), (int)232);
        }
        var2_3 = nm.a;
        if (var4_1) {
            throw null;
lbl21:
            // 2 sources

            return (int)nm.lwqi("lxez", lwqn(int ), (int)233);
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl21
                v3 /* !! */  = nm.uq;
                if (true) ** GOTO lbl31
                block32: while (true) {
                    v3 /* !! */  = (long)(v4 - nm.lwqi("lxfa", lwqf(int ), (int)142));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2013710284: {
                            v4 = nm.lwqi("lxfb", lwqf(int ), (int)143);
                            continue block32;
                        }
                        case -255755851: {
                            v4 = nm.lwqi("lxfc", lwqf(int ), (int)144);
                            continue block32;
                        }
                        case 1759203347: {
                            break block32;
                        }
                    }
                    break;
                }
                v5 = nm.getAlpha(var0);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxfd", lwqf(int ), (int)145)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nm.lwqi("lxfe", lwqn(int ), (int)234)) break;
                    v6 /* !! */  = (long)nm.lwqi("lxff", lwqn(int ), (int)235);
                }
                var1_4 = (int)(v5 * nm.contextAlpha);
                if (var2_3 || var2_3) ** continue;
                v7 /* !! */  = nm.uq;
                if (true) ** GOTO lbl52
                block34: while (true) {
                    v7 /* !! */  = (long)(nm.lwqi("lxfh", lwqf(int ), (int)147) - nm.lwqi("lxfg", lwqf(int ), (int)146));
lbl52:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 1351640211: {
                            continue block34;
                        }
                        case 1759203347: {
                            break block34;
                        }
                    }
                    break;
                }
                v8 = nm.getRed(var0);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lxfi", lwqf(int ), (int)148)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nm.lwqi("lxfj", lwqn(int ), (int)236)) break;
                    v9 /* !! */  = (long)nm.lwqi("lxfk", lwqn(int ), (int)237);
                }
                v10 = nm.getGreen(var0);
                v11 /* !! */  = nm.uq;
                if (true) ** GOTO lbl68
                block36: while (true) {
                    v11 /* !! */  = (long)(v12 - nm.lwqi("lxfl", lwqf(int ), (int)149));
lbl68:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 118509236: {
                            v12 = nm.lwqi("lxfm", lwqf(int ), (int)150);
                            continue block36;
                        }
                        case 1292273961: {
                            v12 = nm.lwqi("lxfn", lwqf(int ), (int)151);
                            continue block36;
                        }
                        case 1759203347: {
                            break block36;
                        }
                        case 1948200234: {
                            v12 = nm.lwqi("lxfo", lwqf(int ), (int)152);
                            continue block36;
                        }
                    }
                    break;
                }
                v13 = nm.getBlue(var0);
                v14 /* !! */  = nm.uq;
                if (true) ** GOTO lbl85
                block37: while (true) {
                    v14 /* !! */  = (long)(v15 - nm.lwqi("lxfp", lwqf(int ), (int)153));
lbl85:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -987849986: {
                            v15 = nm.lwqi("lxfq", lwqf(int ), (int)154);
                            continue block37;
                        }
                        case -9371556: {
                            v15 = nm.lwqi("lxfr", lwqf(int ), (int)155);
                            continue block37;
                        }
                        case 1759203347: {
                            break block37;
                        }
                    }
                    break;
                }
                return class_9848.method_61324((int)var1_4, (int)v8, (int)v10, (int)v13);
            }
            case 0: {
                var3_2 /* !! */  = (int)nm.lwqi("lxfs", lwqn(int ), (int)238);
                if (var4_1) {
                    throw null;
                }
            }
lbl99:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)nm.lwqi("lxft", lwqn(int ), (int)239);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl104:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)nm.lwqi("lxfu", lwqn(int ), (int)240);
                if (!var4_1) ** GOTO lbl99
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)nm.lwqi("lxfv", lwqn(int ), (int)241);
                if (!var4_1) break;
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)nm.lwqi("lxfw", lwqn(int ), (int)242);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)nm.lwqi("lxfx", lwqn(int ), (int)243);
        ** while (!var4_1)
lbl119:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 interpolate(class_243 var0, class_243 var1_1) {
        v0 /* !! */  = nm.uq;
        if (true) ** GOTO lbl5
        block48: while (true) {
            v0 /* !! */  = (long)(nm.lwqi("lxkr", lwqf(int ), (int)216) - nm.lwqi("lxkq", lwqf(int ), (int)215));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1681328387: {
                    continue block48;
                }
                case 1759203347: {
                    break block48;
                }
            }
            break;
        }
        var4_2 = nm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nm.uq - nm.lwqi("lxks", lwqf(int ), (int)217)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nm.lwqi("lxkt", lwqn(int ), (int)307)) break;
            v1 /* !! */  = (long)nm.lwqi("lxku", lwqn(int ), (int)308);
        }
        var3_3 /* !! */  = nm.b;
        v2 /* !! */  = nm.uq;
        if (true) ** GOTO lbl21
        block50: while (true) {
            v2 /* !! */  = (long)(v3 - nm.lwqi("lxkv", lwqf(int ), (int)218));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -249531628: {
                    v3 = nm.lwqi("lxkw", lwqf(int ), (int)219);
                    continue block50;
                }
                case 421391289: {
                    v3 = nm.lwqi("lxkx", lwqf(int ), (int)220);
                    continue block50;
                }
                case 1759203347: {
                    break block50;
                }
            }
            break;
        }
        var2_4 = nm.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v4 /* !! */  = nm.uq;
                if (true) ** GOTO lbl44
                block52: while (true) {
                    v4 /* !! */  = (long)(v5 - nm.lwqi("lxky", lwqf(int ), (int)221));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 946635841: {
                            v5 = nm.lwqi("lxkz", lwqf(int ), (int)222);
                            continue block52;
                        }
                        case 1633153140: {
                            v5 = nm.lwqi("lxla", lwqf(int ), (int)223);
                            continue block52;
                        }
                        case 1759203347: {
                            break block52;
                        }
                        case 1863437679: {
                            v5 = nm.lwqi("lxlb", lwqf(int ), (int)224);
                            continue block52;
                        }
                    }
                    break;
                }
                v6 /* !! */  = nm.uq;
                if (true) ** GOTO lbl60
                block53: while (true) {
                    v6 /* !! */  = (long)(v7 - nm.lwqi("lxlc", lwqf(int ), (int)225));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 931371888: {
                            v7 = nm.lwqi("lxld", lwqf(int ), (int)226);
                            continue block53;
                        }
                        case 1608641365: {
                            v7 = nm.lwqi("lxle", lwqf(int ), (int)227);
                            continue block53;
                        }
                        case 1759203347: {
                            break block53;
                        }
                    }
                    break;
                }
                v8 = var0.field_1352;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = nm.uq - nm.lwqi("lxlf", lwqf(int ), (int)228)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nm.lwqi("lxlg", lwqn(int ), (int)309)) break;
                    v9 /* !! */  = (long)nm.lwqi("lxlh", lwqn(int ), (int)310);
                }
                v10 = var1_1.field_1352;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = nm.uq - nm.lwqi("lxli", lwqf(int ), (int)229)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nm.lwqi("lxlj", lwqn(int ), (int)311)) break;
                    v11 /* !! */  = (long)nm.lwqi("lxlk", lwqn(int ), (int)312);
                }
                v12 = nm.interpolate(v8, v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = nm.uq - nm.lwqi("lxll", lwqf(int ), (int)230)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nm.lwqi("lxlm", lwqn(int ), (int)313)) break;
                    v13 /* !! */  = (long)nm.lwqi("lxln", lwqn(int ), (int)314);
                }
                v14 = var0.field_1351;
                v15 /* !! */  = nm.uq;
                if (true) ** GOTO lbl92
                block57: while (true) {
                    v15 /* !! */  = (long)(v16 - nm.lwqi("lxlo", lwqf(int ), (int)231));
lbl92:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2062207047: {
                            v16 = nm.lwqi("lxlp", lwqf(int ), (int)232);
                            continue block57;
                        }
                        case -1798482154: {
                            v16 = nm.lwqi("lxlq", lwqf(int ), (int)233);
                            continue block57;
                        }
                        case -1159663888: {
                            v16 = nm.lwqi("lxlr", lwqf(int ), (int)234);
                            continue block57;
                        }
                        case 1759203347: {
                            break block57;
                        }
                    }
                    break;
                }
                v17 = var1_1.field_1351;
                v18 /* !! */  = nm.uq;
                if (true) ** GOTO lbl109
                block58: while (true) {
                    v18 /* !! */  = (long)(v19 - nm.lwqi("lxls", lwqf(int ), (int)235));
lbl109:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -27471102: {
                            v19 = nm.lwqi("lxlt", lwqf(int ), (int)236);
                            continue block58;
                        }
                        case 501516955: {
                            v19 = nm.lwqi("lxlu", lwqf(int ), (int)237);
                            continue block58;
                        }
                        case 809727801: {
                            v19 = nm.lwqi("lxlv", lwqf(int ), (int)238);
                            continue block58;
                        }
                        case 1759203347: {
                            break block58;
                        }
                    }
                    break;
                }
                v20 = nm.interpolate(v14, v17);
                v21 /* !! */  = nm.uq;
                if (true) ** GOTO lbl126
                block59: while (true) {
                    v21 /* !! */  = (long)(v22 - nm.lwqi("lxlw", lwqf(int ), (int)239));
lbl126:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 57194999: {
                            v22 = nm.lwqi("lxlx", lwqf(int ), (int)240);
                            continue block59;
                        }
                        case 1078004471: {
                            v22 = nm.lwqi("lxly", lwqf(int ), (int)241);
                            continue block59;
                        }
                        case 1759203347: {
                            break block59;
                        }
                    }
                    break;
                }
                v23 = var0.field_1350;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_4 = nm.uq - nm.lwqi("lxlz", lwqf(int ), (int)242)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == nm.lwqi("lxma", lwqn(int ), (int)315)) break;
                    v24 /* !! */  = (long)nm.lwqi("lxmb", lwqn(int ), (int)316);
                }
                v25 = var1_1.field_1350;
                v26 /* !! */  = nm.uq;
                if (true) ** GOTO lbl146
                block61: while (true) {
                    v26 /* !! */  = (long)(v27 - nm.lwqi("lxmc", lwqf(int ), (int)243));
lbl146:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 71683117: {
                            v27 = nm.lwqi("lxmd", lwqf(int ), (int)244);
                            continue block61;
                        }
                        case 1511383430: {
                            v27 = nm.lwqi("lxme", lwqf(int ), (int)245);
                            continue block61;
                        }
                        case 1759203347: {
                            break block61;
                        }
                    }
                    break;
                }
                v28 = nm.interpolate(v23, v25);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_5 = nm.uq - nm.lwqi("lxmf", lwqf(int ), (int)246)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == nm.lwqi("lxmg", lwqn(int ), (int)317)) break;
                    v29 /* !! */  = (long)nm.lwqi("lxmh", lwqn(int ), (int)318);
                }
                return new class_243(v12, v20, v28);
            }
            case 0: {
                var3_3 /* !! */  = (int)nm.lwqi("lxmi", lwqn(int ), (int)319);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl167:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)nm.lwqi("lxmj", lwqn(int ), (int)320);
                if (var4_2) {
                    throw null;
                }
            }
lbl171:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nm.lwqi("lxmk", lwqn(int ), (int)321);
                    if (!var4_2) ** GOTO lbl167
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nm.lwqi("lxml", lwqn(int ), (int)322);
        ** while (!var4_2)
lbl179:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lxst() {
        nm.lwqp[200] = 161409898;
        nm.lwqp[201] = -1418122107;
        nm.lwqp[202] = 2013811888;
        nm.lwqp[203] = -1733840877;
        nm.lwqp[204] = 1377467579;
        nm.lwqp[205] = 1181045226;
        nm.lwqp[206] = -39041196;
        nm.lwqp[207] = 747538248;
        nm.lwqp[208] = -1435171753;
        nm.lwqp[209] = -658909993;
        nm.lwqp[210] = 852151213;
        nm.lwqp[211] = 718015973;
        nm.lwqp[212] = 150852390;
        nm.lwqp[213] = 111990087;
        nm.lwqp[214] = 2015252161;
        nm.lwqp[215] = 784757595;
        nm.lwqp[216] = 550085626;
        nm.lwqp[217] = -1883578885;
        nm.lwqp[218] = -650273860;
        nm.lwqp[219] = -719725101;
        nm.lwqp[220] = -2004795891;
        nm.lwqp[221] = -634330573;
        nm.lwqp[222] = -85262641;
        nm.lwqp[223] = -1545965519;
        nm.lwqp[224] = 1536014815;
        nm.lwqp[225] = 1004781093;
        nm.lwqp[226] = 1538864965;
        nm.lwqp[227] = 1101767362;
        nm.lwqp[228] = 469382102;
        nm.lwqp[229] = 131787457;
        nm.lwqp[230] = -557786607;
        nm.lwqp[231] = 1075415888;
        nm.lwqp[232] = 384772849;
        nm.lwqp[233] = -748970441;
        nm.lwqp[234] = -27724421;
        nm.lwqp[235] = 838763884;
        nm.lwqp[236] = 571935469;
        nm.lwqp[237] = -1051672901;
        nm.lwqp[238] = -1307747588;
        nm.lwqp[239] = 1877843073;
        nm.lwqp[240] = -1161364307;
        nm.lwqp[241] = 1599850888;
        nm.lwqp[242] = 229214502;
        nm.lwqp[243] = 592662250;
        nm.lwqp[244] = -681273053;
        nm.lwqp[245] = 1667745070;
        nm.lwqp[246] = -478362665;
        nm.lwqp[247] = -2082935406;
        nm.lwqp[248] = 515409793;
        nm.lwqp[249] = -1395418624;
        nm.lwqp[250] = -593571418;
        nm.lwqp[251] = -1608392379;
        nm.lwqp[252] = 861727559;
        nm.lwqp[253] = -911553077;
        nm.lwqp[254] = -829264150;
        nm.lwqp[255] = -1046519024;
        nm.lwqp[256] = 1823094437;
        nm.lwqp[257] = -1017055129;
        nm.lwqp[258] = 1385776343;
        nm.lwqp[259] = 360439526;
        nm.lwqp[260] = -1334910779;
        nm.lwqp[261] = 473321348;
        nm.lwqp[262] = 1231015956;
        nm.lwqp[263] = 1295551545;
        nm.lwqp[264] = -1461562153;
        nm.lwqp[265] = 537883651;
        nm.lwqp[266] = 126549613;
        nm.lwqp[267] = -1551839722;
        nm.lwqp[268] = -1385859193;
        nm.lwqp[269] = -1678849807;
        nm.lwqp[270] = -858019904;
        nm.lwqp[271] = 255152780;
        nm.lwqp[272] = -2131447543;
        nm.lwqp[273] = -57303959;
        nm.lwqp[274] = 1041649369;
        nm.lwqp[275] = -7295362;
        nm.lwqp[276] = -2035718133;
        nm.lwqp[277] = -985084762;
        nm.lwqp[278] = -1618567484;
        nm.lwqp[279] = 925748214;
        nm.lwqp[280] = -1050055815;
        nm.lwqp[281] = -524708450;
        nm.lwqp[282] = -441174912;
        nm.lwqp[283] = -956234246;
        nm.lwqp[284] = -1049821292;
        nm.lwqp[285] = -1956329858;
        nm.lwqp[286] = 321728398;
        nm.lwqp[287] = -1676651522;
        nm.lwqp[288] = -1126658035;
        nm.lwqp[289] = -1903211644;
        nm.lwqp[290] = -1572407470;
        nm.lwqp[291] = 1269444707;
        nm.lwqp[292] = 885760619;
        nm.lwqp[293] = 1040252812;
        nm.lwqp[294] = -995100005;
        nm.lwqp[295] = 1926492827;
        nm.lwqp[296] = -2070696045;
        nm.lwqp[297] = 627778591;
        nm.lwqp[298] = -58238248;
        nm.lwqp[299] = -1853251259;
    }

    private static /* synthetic */ void lxsy() {
        nm.lwqg[200] = -2830996412267867133L;
        nm.lwqg[201] = -6966441488569692570L;
        nm.lwqg[202] = -7752756893050352491L;
        nm.lwqg[203] = 3436922627128872168L;
        nm.lwqg[204] = -8863835574924580984L;
        nm.lwqg[205] = -4160690329575170563L;
        nm.lwqg[206] = 6644011936522827759L;
        nm.lwqg[207] = 1089167207621640022L;
        nm.lwqg[208] = -1549809595731437262L;
        nm.lwqg[209] = -7864020686460022040L;
        nm.lwqg[210] = 1190336682733859381L;
        nm.lwqg[211] = -5871657707398370582L;
        nm.lwqg[212] = -7922485389240677280L;
        nm.lwqg[213] = -3633615432505767014L;
        nm.lwqg[214] = -6383921380191135471L;
        nm.lwqg[215] = 5341745577897195156L;
        nm.lwqg[216] = -7987661240521917018L;
        nm.lwqg[217] = 5657993687452730032L;
        nm.lwqg[218] = 2535404525151524224L;
        nm.lwqg[219] = -8953080442700943150L;
        nm.lwqg[220] = -4863875792434422347L;
        nm.lwqg[221] = -586672956451215032L;
        nm.lwqg[222] = 2782544765875455496L;
        nm.lwqg[223] = 3479992334325160399L;
        nm.lwqg[224] = -721771135786184807L;
        nm.lwqg[225] = 3296108479677234414L;
        nm.lwqg[226] = 7051375150979912255L;
        nm.lwqg[227] = -5223347971073713341L;
        nm.lwqg[228] = 8066043513809831944L;
        nm.lwqg[229] = -9210327151736045830L;
        nm.lwqg[230] = 4785651360835681959L;
        nm.lwqg[231] = -5032751704052770729L;
        nm.lwqg[232] = 2581656552469011056L;
        nm.lwqg[233] = -8495245683090735046L;
        nm.lwqg[234] = -6913594863508582373L;
        nm.lwqg[235] = 1488549516078674360L;
        nm.lwqg[236] = -6385352022118399914L;
        nm.lwqg[237] = 7133556075481284672L;
        nm.lwqg[238] = 3968953863017947836L;
        nm.lwqg[239] = 2872835098146969100L;
        nm.lwqg[240] = -4805151026322030863L;
        nm.lwqg[241] = -3338632200421584433L;
        nm.lwqg[242] = 4719526341745955640L;
        nm.lwqg[243] = -8660637328008090402L;
        nm.lwqg[244] = 6144269330623438952L;
        nm.lwqg[245] = -7941032125188322714L;
        nm.lwqg[246] = 6030419691245185059L;
        nm.lwqg[247] = -6320683652001242742L;
        nm.lwqg[248] = -2915414445744561466L;
        nm.lwqg[249] = 3166202884170794639L;
        nm.lwqg[250] = -5659620845718011453L;
        nm.lwqg[251] = -1505420424561827300L;
        nm.lwqg[252] = 2555677656124984022L;
        nm.lwqg[253] = 4174046049334799969L;
        nm.lwqg[254] = -4298554067579414170L;
        nm.lwqg[255] = -9045034108443508158L;
        nm.lwqg[256] = 5699708620205317778L;
        nm.lwqg[257] = -8115678705381383303L;
        nm.lwqg[258] = -3343115684346601008L;
        nm.lwqg[259] = 7383759390277187697L;
        nm.lwqg[260] = -4675643517052077628L;
        nm.lwqg[261] = 2252559529835270058L;
        nm.lwqg[262] = -45744918926352798L;
        nm.lwqg[263] = 1205530984329025728L;
        nm.lwqg[264] = -942489357419215736L;
        nm.lwqg[265] = 5063596407794693249L;
        nm.lwqg[266] = 2339723469821766112L;
        nm.lwqg[267] = -7128462858257055788L;
        nm.lwqg[268] = -7693924964003559478L;
        nm.lwqg[269] = 7616078245886212278L;
        nm.lwqg[270] = 9207928902005270349L;
        nm.lwqg[271] = -4259209038500296681L;
        nm.lwqg[272] = 6222837078465585613L;
        nm.lwqg[273] = 1387649837244817169L;
        nm.lwqg[274] = 3378442825522356542L;
        nm.lwqg[275] = -5675025040742161949L;
        nm.lwqg[276] = -4897200745739021069L;
        nm.lwqg[277] = -4976894977702627393L;
        nm.lwqg[278] = 823585798500765756L;
        nm.lwqg[279] = -9057495304335429511L;
        nm.lwqg[280] = 8098210699300659465L;
        nm.lwqg[281] = -2385555278942345998L;
        nm.lwqg[282] = 2720115616181005520L;
        nm.lwqg[283] = 8178082322316087722L;
        nm.lwqg[284] = -8839240365099862746L;
        nm.lwqg[285] = 63999326523956970L;
        nm.lwqg[286] = -7131512389466141170L;
        nm.lwqg[287] = 4240843778554760758L;
        nm.lwqg[288] = 3236356012413366553L;
        nm.lwqg[289] = 4302344625731331911L;
        nm.lwqg[290] = -4562533970652987189L;
        nm.lwqg[291] = -5348213577021373106L;
        nm.lwqg[292] = 616381114096911587L;
        nm.lwqg[293] = -5746169171112972162L;
        nm.lwqg[294] = 4227897199951682794L;
        nm.lwqg[295] = -2583173764583510105L;
        nm.lwqg[296] = -5588525021395956483L;
        nm.lwqg[297] = 3670967953444803487L;
        nm.lwqg[298] = 4979126847084753528L;
        nm.lwqg[299] = -8598108949142661767L;
    }
}

