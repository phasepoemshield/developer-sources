/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.od$LoopStrategy;

public class od$InfiniteLoopStrategy
implements od$LoopStrategy {
    public static final boolean c;
    private static long[] fgib;
    private static int[] fgih;
    public static final int b;
    private static final long lx = -2816575942404194377L;
    private static long[] fgic;
    public static final boolean a;
    private static int[] fgig;

    public static /* synthetic */ CallSite fgid(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean shouldLoop(int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$InfiniteLoopStrategy.lx - od$InfiniteLoopStrategy.fgid("fgie", fgia(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$InfiniteLoopStrategy.fgid("fgii", fgif(int ), (int)0)) break;
            v0 /* !! */  = (long)od$InfiniteLoopStrategy.fgid("fgij", fgif(int ), (int)1);
        }
        var5_3 = od$InfiniteLoopStrategy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$InfiniteLoopStrategy.lx - od$InfiniteLoopStrategy.fgid("fgik", fgia(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$InfiniteLoopStrategy.fgid("fgil", fgif(int ), (int)2)) break;
            v1 /* !! */  = (long)od$InfiniteLoopStrategy.fgid("fgim", fgif(int ), (int)3);
        }
        var4_4 /* !! */  = od$InfiniteLoopStrategy.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = od$InfiniteLoopStrategy.lx - od$InfiniteLoopStrategy.fgid("fgin", fgia(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$InfiniteLoopStrategy.fgid("fgio", fgif(int ), (int)4)) break;
            v2 /* !! */  = (long)od$InfiniteLoopStrategy.fgid("fgip", fgif(int ), (int)5);
        }
        var3_5 = od$InfiniteLoopStrategy.a;
        if (var5_3) {
            throw null;
lbl24:
            // 3 sources

            return (boolean)od$InfiniteLoopStrategy.fgid("fgiq", fgif(int ), (int)6);
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** GOTO lbl24
                if (var1_1 < var2_2) ** GOTO lbl36
                if (var3_5) ** GOTO lbl24
                v3 = od$InfiniteLoopStrategy.fgid("fgir", fgif(int ), (int)7);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl39
lbl36:
                // 1 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v3 = od$InfiniteLoopStrategy.fgid("fgis", fgif(int ), (int)8);
lbl39:
                // 2 sources

                return (boolean)v3;
            }
            case 0: {
                var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgit", fgif(int ), (int)9);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgiu", fgif(int ), (int)10);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl50:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgiv", fgif(int ), (int)11);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 3: {
                var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgiw", fgif(int ), (int)12);
                if (!var5_3) break;
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgix", fgif(int ), (int)13);
                if (!var5_3) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgiy", fgif(int ), (int)14);
                    if (!var5_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl68:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgiz", fgif(int ), (int)15);
                if (!var5_3) break;
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)od$InfiniteLoopStrategy.fgid("fgja", fgif(int ), (int)16);
        ** while (!var5_3)
lbl75:
        // 1 sources

        throw null;
    }

    public od$InfiniteLoopStrategy() {
    }

    static {
        fgig = new int[35];
        fgih = new int[35];
        od$InfiniteLoopStrategy.fgkd();
        od$InfiniteLoopStrategy.fgke();
        fgib = new long[13];
        fgic = new long[13];
        od$InfiniteLoopStrategy.fgkf();
        od$InfiniteLoopStrategy.fgkg();
    }

    private static /* synthetic */ int fgif(int n2) {
        return fgig[n2] ^ fgih[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isFinished() {
        boolean bl2;
        block21: {
            boolean bl3;
            Object object = lx;
            boolean bl4 = true;
            block11: while (true) {
                CallSite callSite;
                if (!bl4 || (bl4 = false) || !true) {
                    object = callSite - od$InfiniteLoopStrategy.fgid("fgjo", fgia(int ), (int)8);
                }
                switch ((int)object) {
                    case -617367480: {
                        callSite = od$InfiniteLoopStrategy.fgid("fgjp", fgia(int ), (int)9);
                        continue block11;
                    }
                    case 1141752234: {
                        callSite = od$InfiniteLoopStrategy.fgid("fgjq", fgia(int ), (int)10);
                        continue block11;
                    }
                    case 1846951863: {
                        break block11;
                    }
                }
                break;
            }
            bl2 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = lx - od$InfiniteLoopStrategy.fgid("fgjr", fgia(int ), (int)11)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == od$InfiniteLoopStrategy.fgid("fgjs", fgif(int ), (int)25)) break;
                object2 = od$InfiniteLoopStrategy.fgid("fgjt", fgif(int ), (int)26);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = lx - od$InfiniteLoopStrategy.fgid("fgju", fgia(int ), (int)12)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == od$InfiniteLoopStrategy.fgid("fgjv", fgif(int ), (int)27)) {
                    bl3 = a;
                    if (bl2) {
                        throw null;
                    }
                    break;
                }
                object3 = od$InfiniteLoopStrategy.fgid("fgjw", fgif(int ), (int)28);
            }
            if (!bl3 && !bl3) {
                return (boolean)od$InfiniteLoopStrategy.fgid("fgjy", fgif(int ), (int)30);
            }
            if (n2 == 0) return (boolean)od$InfiniteLoopStrategy.fgid("fgjx", fgif(int ), (int)29);
            switch (n2) {
                default: {
                    return (boolean)od$InfiniteLoopStrategy.fgid("fgjx", fgif(int ), (int)29);
                }
                case 1: {
                    CallSite callSite = od$InfiniteLoopStrategy.fgid("fgka", fgif(int ), (int)32);
                    if (bl2) {
                        throw null;
                    }
                }
                case 0: {
                    break block21;
                }
                case 2: {
                    CallSite callSite = od$InfiniteLoopStrategy.fgid("fgkb", fgif(int ), (int)33);
                    if (!bl2) break;
                    throw null;
                }
                case 3: 
            }
            CallSite callSite = od$InfiniteLoopStrategy.fgid("fgkc", fgif(int ), (int)34);
            if (bl2) {
                throw null;
            }
        }
        do {
            CallSite callSite = od$InfiniteLoopStrategy.fgid("fgjz", fgif(int ), (int)31);
        } while (!bl2);
        throw null;
    }

    private static /* synthetic */ void fgke() {
        od$InfiniteLoopStrategy.fgih[0] = 98839249;
        od$InfiniteLoopStrategy.fgih[1] = 2142187777;
        od$InfiniteLoopStrategy.fgih[2] = 944369707;
        od$InfiniteLoopStrategy.fgih[3] = -324619152;
        od$InfiniteLoopStrategy.fgih[4] = 609347974;
        od$InfiniteLoopStrategy.fgih[5] = 2134861930;
        od$InfiniteLoopStrategy.fgih[6] = 1940292686;
        od$InfiniteLoopStrategy.fgih[7] = 1754293438;
        od$InfiniteLoopStrategy.fgih[8] = 1033713148;
        od$InfiniteLoopStrategy.fgih[9] = -219089458;
        od$InfiniteLoopStrategy.fgih[10] = 28835652;
        od$InfiniteLoopStrategy.fgih[11] = 707392680;
        od$InfiniteLoopStrategy.fgih[12] = 345691179;
        od$InfiniteLoopStrategy.fgih[13] = 436463794;
        od$InfiniteLoopStrategy.fgih[14] = -1299237742;
        od$InfiniteLoopStrategy.fgih[15] = 882296415;
        od$InfiniteLoopStrategy.fgih[16] = -1526788789;
        od$InfiniteLoopStrategy.fgih[17] = -1454221861;
        od$InfiniteLoopStrategy.fgih[18] = -1881277054;
        od$InfiniteLoopStrategy.fgih[19] = -565302708;
        od$InfiniteLoopStrategy.fgih[20] = -701628543;
        od$InfiniteLoopStrategy.fgih[21] = -647312442;
        od$InfiniteLoopStrategy.fgih[22] = 1107165168;
        od$InfiniteLoopStrategy.fgih[23] = 1627814773;
        od$InfiniteLoopStrategy.fgih[24] = 1029725570;
        od$InfiniteLoopStrategy.fgih[25] = 1657870100;
        od$InfiniteLoopStrategy.fgih[26] = 122042569;
        od$InfiniteLoopStrategy.fgih[27] = 109504128;
        od$InfiniteLoopStrategy.fgih[28] = -317242634;
        od$InfiniteLoopStrategy.fgih[29] = -596490982;
        od$InfiniteLoopStrategy.fgih[30] = -2023937941;
        od$InfiniteLoopStrategy.fgih[31] = -1159033997;
        od$InfiniteLoopStrategy.fgih[32] = 1374554785;
        od$InfiniteLoopStrategy.fgih[33] = -1851579537;
        od$InfiniteLoopStrategy.fgih[34] = 439576654;
    }

    private static /* synthetic */ void fgkf() {
        od$InfiniteLoopStrategy.fgib[0] = -6362456738044018369L;
        od$InfiniteLoopStrategy.fgib[1] = -7610885262331790550L;
        od$InfiniteLoopStrategy.fgib[2] = 4997827462389014274L;
        od$InfiniteLoopStrategy.fgib[3] = -1102451570618878440L;
        od$InfiniteLoopStrategy.fgib[4] = 6942652540374411973L;
        od$InfiniteLoopStrategy.fgib[5] = 8040015086977955642L;
        od$InfiniteLoopStrategy.fgib[6] = -6048200693622979693L;
        od$InfiniteLoopStrategy.fgib[7] = -3681308419474192409L;
        od$InfiniteLoopStrategy.fgib[8] = 2266902250856811598L;
        od$InfiniteLoopStrategy.fgib[9] = -5372367296187010611L;
        od$InfiniteLoopStrategy.fgib[10] = 6155261423441398328L;
        od$InfiniteLoopStrategy.fgib[11] = 7435005430493120477L;
        od$InfiniteLoopStrategy.fgib[12] = -5037915492679954133L;
    }

    private static /* synthetic */ void fgkd() {
        od$InfiniteLoopStrategy.fgig[0] = -98839250;
        od$InfiniteLoopStrategy.fgig[1] = 2007939628;
        od$InfiniteLoopStrategy.fgig[2] = 944369706;
        od$InfiniteLoopStrategy.fgig[3] = 0xE626EEE;
        od$InfiniteLoopStrategy.fgig[4] = 609347975;
        od$InfiniteLoopStrategy.fgig[5] = -326909907;
        od$InfiniteLoopStrategy.fgig[6] = 1940292686;
        od$InfiniteLoopStrategy.fgig[7] = 1754293439;
        od$InfiniteLoopStrategy.fgig[8] = 1033713148;
        od$InfiniteLoopStrategy.fgig[9] = -219089458;
        od$InfiniteLoopStrategy.fgig[10] = 28835651;
        od$InfiniteLoopStrategy.fgig[11] = 707392682;
        od$InfiniteLoopStrategy.fgig[12] = 345691176;
        od$InfiniteLoopStrategy.fgig[13] = 436463797;
        od$InfiniteLoopStrategy.fgig[14] = -1299237744;
        od$InfiniteLoopStrategy.fgig[15] = 882296409;
        od$InfiniteLoopStrategy.fgig[16] = -1526788792;
        od$InfiniteLoopStrategy.fgig[17] = 1454221860;
        od$InfiniteLoopStrategy.fgig[18] = 1161358594;
        od$InfiniteLoopStrategy.fgig[19] = 565302707;
        od$InfiniteLoopStrategy.fgig[20] = 43486685;
        od$InfiniteLoopStrategy.fgig[21] = -647312443;
        od$InfiniteLoopStrategy.fgig[22] = 1107165168;
        od$InfiniteLoopStrategy.fgig[23] = 1627814772;
        od$InfiniteLoopStrategy.fgig[24] = 1029725571;
        od$InfiniteLoopStrategy.fgig[25] = -1657870101;
        od$InfiniteLoopStrategy.fgig[26] = -260487769;
        od$InfiniteLoopStrategy.fgig[27] = 109504129;
        od$InfiniteLoopStrategy.fgig[28] = -1813338560;
        od$InfiniteLoopStrategy.fgig[29] = -596490982;
        od$InfiniteLoopStrategy.fgig[30] = -2023937941;
        od$InfiniteLoopStrategy.fgig[31] = -1159033997;
        od$InfiniteLoopStrategy.fgig[32] = 1374554784;
        od$InfiniteLoopStrategy.fgig[33] = -1851579539;
        od$InfiniteLoopStrategy.fgig[34] = 439576655;
    }

    private static /* synthetic */ void fgkg() {
        od$InfiniteLoopStrategy.fgic[0] = -8130455225377999380L;
        od$InfiniteLoopStrategy.fgic[1] = 3285395578169390621L;
        od$InfiniteLoopStrategy.fgic[2] = -3728241332932170233L;
        od$InfiniteLoopStrategy.fgic[3] = -6985575675452072703L;
        od$InfiniteLoopStrategy.fgic[4] = 2173814626375465256L;
        od$InfiniteLoopStrategy.fgic[5] = 6456584961065864566L;
        od$InfiniteLoopStrategy.fgic[6] = 3260433994099963682L;
        od$InfiniteLoopStrategy.fgic[7] = 3694927881750343972L;
        od$InfiniteLoopStrategy.fgic[8] = -8907998113182123524L;
        od$InfiniteLoopStrategy.fgic[9] = 987463702501471873L;
        od$InfiniteLoopStrategy.fgic[10] = 8617945026129759932L;
        od$InfiniteLoopStrategy.fgic[11] = -4923496387781426001L;
        od$InfiniteLoopStrategy.fgic[12] = 8975133478139758849L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void onLoop() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$InfiniteLoopStrategy.lx - od$InfiniteLoopStrategy.fgid("fgjb", fgia(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$InfiniteLoopStrategy.fgid("fgjc", fgif(int ), (int)17)) break;
            v0 /* !! */  = (long)od$InfiniteLoopStrategy.fgid("fgjd", fgif(int ), (int)18);
        }
        var3_1 = od$InfiniteLoopStrategy.c;
        v1 /* !! */  = od$InfiniteLoopStrategy.lx;
        if (true) ** GOTO lbl12
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - od$InfiniteLoopStrategy.fgid("fgje", fgia(int ), (int)4));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -936410924: {
                    v2 = od$InfiniteLoopStrategy.fgid("fgjf", fgia(int ), (int)5);
                    continue block6;
                }
                case 372338023: {
                    v2 = od$InfiniteLoopStrategy.fgid("fgjg", fgia(int ), (int)6);
                    continue block6;
                }
                case 1846951863: {
                    break block6;
                }
            }
            break;
        }
        var2_2 = od$InfiniteLoopStrategy.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od$InfiniteLoopStrategy.lx - od$InfiniteLoopStrategy.fgid("fgjh", fgia(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == od$InfiniteLoopStrategy.fgid("fgji", fgif(int ), (int)19)) break;
            v3 /* !! */  = (long)od$InfiniteLoopStrategy.fgid("fgjj", fgif(int ), (int)20);
        }
        var1_3 = od$InfiniteLoopStrategy.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

    }

    private static /* synthetic */ long fgia(int n2) {
        return fgib[n2] ^ fgic[n2];
    }
}

