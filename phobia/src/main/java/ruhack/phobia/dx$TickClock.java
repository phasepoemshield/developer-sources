/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class dx$TickClock {
    private int seconds;
    private static int[] dmcs = new int[48];
    public static final boolean a;
    private int lastTicks;
    public static final boolean c;
    public static final long id = -5131942852606843883L;
    public static final int b;
    private long staleAt;
    private static long[] dmcy;
    private static long[] dmcx;
    private static int[] dmct;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int advance(int var1_1, long var2_2) {
        block78: {
            var6_3 = dx$TickClock.c;
            var5_4 /* !! */  = dx$TickClock.b;
            var4_5 = dx$TickClock.a;
            if (var6_3) {
                throw null;
lbl6:
                // 19 sources

                return (int)dx$TickClock.dmcu("dmde", dmcr(int ), (int)5);
            }
            if (var4_5 || var4_5) ** GOTO lbl6
            if (var1_1 >= 0) break block78;
            if (var4_5 || var4_5) ** GOTO lbl6
            this.lastTicks = var1_1;
            if (var4_5 || var4_5) ** GOTO lbl6
            this.seconds = (int)dx$TickClock.dmcu("dmdf", dmcr(int ), (int)6);
            if (var4_5 || var4_5) ** GOTO lbl6
            this.staleAt = (long)dx$TickClock.dmcu("dmdg", dmcw(int ), (int)1);
            if (var4_5 || var4_5) ** GOTO lbl6
            return (int)dx$TickClock.dmcu("dmdh", dmcr(int ), (int)7);
        }
        if (var4_5 || var4_5) ** GOTO lbl6
        if (var1_1 == this.lastTicks) ** GOTO lbl32
        if (var4_5 || var4_5) ** GOTO lbl6
        this.lastTicks = var1_1;
        if (var4_5 || var4_5) ** GOTO lbl6
        this.seconds = var1_1 / dx$TickClock.dmcu("dmdi", dmcr(int ), (int)8);
        if (var4_5 || var4_5) ** GOTO lbl6
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.staleAt = var2_2;
                if (var4_5 || var4_5) ** GOTO lbl6
                return this.seconds;
            }
lbl32:
            // 1 sources

            if (var4_5 || var4_5) ** GOTO lbl6
            if (this.staleAt >= dx$TickClock.dmcu("dmdj", dmcw(int ), (int)2)) ** GOTO lbl37
            if (var4_5) ** GOTO lbl6
            this.staleAt = var2_2;
            if (var4_5) ** GOTO lbl6
lbl37:
            // 2 sources

            do {
                if (var4_5 || var4_5) ** GOTO lbl6
                if (this.seconds <= 0) ** GOTO lbl49
                if (var4_5) ** GOTO lbl6
                if (var2_2 - this.staleAt < dx$TickClock.dmcu("dmdk", dmcw(int ), (int)3)) ** GOTO lbl49
                if (var4_5 || var4_5) ** GOTO lbl6
                this.seconds -= dx$TickClock.dmcu("dmdl", dmcr(int ), (int)9);
                if (var4_5 || var4_5) ** GOTO lbl6
                this.staleAt += dx$TickClock.dmcu("dmdm", dmcw(int ), (int)4);
                if (var4_5) ** GOTO lbl6
            } while (!var6_3);
            throw null;
lbl49:
            // 2 sources

            if (!var4_5 && !var4_5) ** break;
            ** continue;
            return this.seconds;
lbl52:
            // 2 sources

            case 0: {
                do {
                    var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdn", dmcr(int ), (int)10);
                } while (!var6_3);
                throw null;
            }
lbl57:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdo", dmcr(int ), (int)11);
                if (var6_3) {
                    throw null;
                }
            }
lbl61:
            // 6 sources

            case 2: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdp", dmcr(int ), (int)12);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl66:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdq", dmcr(int ), (int)13);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl71:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdr", dmcr(int ), (int)14);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl76:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmds", dmcr(int ), (int)15);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 6: {
                do {
                    var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdt", dmcr(int ), (int)16);
                } while (!var6_3);
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdu", dmcr(int ), (int)17);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl134
                    break;
                }
            }
            case 8: {
                do {
                    var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdv", dmcr(int ), (int)18);
                } while (!var6_3);
                throw null;
            }
lbl97:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdw", dmcr(int ), (int)19);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl102:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdx", dmcr(int ), (int)20);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 11: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdy", dmcr(int ), (int)21);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 12: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmdz", dmcr(int ), (int)22);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl117:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmea", dmcr(int ), (int)23);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl122:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmeb", dmcr(int ), (int)24);
                if (!var6_3) ** GOTO lbl102
                throw null;
            }
            case 15: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmec", dmcr(int ), (int)25);
                if (!var6_3) ** GOTO lbl61
                throw null;
            }
            case 16: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmed", dmcr(int ), (int)26);
                if (!var6_3) ** GOTO lbl61
                throw null;
            }
lbl134:
            // 2 sources

            case 17: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmee", dmcr(int ), (int)27);
                if (!var6_3) ** GOTO lbl76
                throw null;
            }
lbl138:
            // 2 sources

            case 18: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmef", dmcr(int ), (int)28);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 19: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmeg", dmcr(int ), (int)29);
                if (!var6_3) ** GOTO lbl71
                throw null;
            }
            case 20: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmeh", dmcr(int ), (int)30);
                if (!var6_3) ** GOTO lbl97
                throw null;
            }
            case 21: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmei", dmcr(int ), (int)31);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl156:
            // 3 sources

            case 22: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmej", dmcr(int ), (int)32);
                if (var6_3) {
                    throw null;
                }
            }
lbl160:
            // 5 sources

            case 23: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmek", dmcr(int ), (int)33);
                if (!var6_3) ** GOTO lbl156
                throw null;
            }
            case 24: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmel", dmcr(int ), (int)34);
                if (!var6_3) ** GOTO lbl66
                throw null;
            }
lbl168:
            // 2 sources

            case 25: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmem", dmcr(int ), (int)35);
                if (!var6_3) ** GOTO lbl122
                throw null;
            }
lbl172:
            // 2 sources

            case 26: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmen", dmcr(int ), (int)36);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl177:
            // 2 sources

            case 27: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmeo", dmcr(int ), (int)37);
                if (!var6_3) ** GOTO lbl57
                throw null;
            }
lbl181:
            // 2 sources

            case 28: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmep", dmcr(int ), (int)38);
                if (!var6_3) ** GOTO lbl61
                throw null;
            }
lbl185:
            // 2 sources

            case 29: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmeq", dmcr(int ), (int)39);
                if (!var6_3) ** GOTO lbl177
                throw null;
            }
lbl189:
            // 3 sources

            case 30: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmer", dmcr(int ), (int)40);
                if (!var6_3) ** GOTO lbl185
                throw null;
            }
            case 31: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmes", dmcr(int ), (int)41);
                if (!var6_3) ** GOTO lbl76
                throw null;
            }
lbl197:
            // 2 sources

            case 32: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmet", dmcr(int ), (int)42);
                if (!var6_3) ** GOTO lbl172
                throw null;
            }
lbl201:
            // 2 sources

            case 33: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmeu", dmcr(int ), (int)43);
                if (!var6_3) ** GOTO lbl117
                throw null;
            }
lbl205:
            // 2 sources

            case 34: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmev", dmcr(int ), (int)44);
                if (!var6_3) ** GOTO lbl52
                throw null;
            }
lbl209:
            // 3 sources

            case 35: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmew", dmcr(int ), (int)45);
                if (!var6_3) ** GOTO lbl160
                throw null;
            }
lbl213:
            // 2 sources

            case 36: {
                var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmex", dmcr(int ), (int)46);
                if (!var6_3) ** GOTO lbl197
                throw null;
            }
            case 37: 
        }
        var5_4 /* !! */  = (int)dx$TickClock.dmcu("dmey", dmcr(int ), (int)47);
        ** while (!var6_3)
lbl220:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dmfb() {
        dx$TickClock.dmcx[0] = 7763511462758294377L;
        dx$TickClock.dmcx[1] = -8550287348424141771L;
        dx$TickClock.dmcx[2] = -1322084000484937968L;
        dx$TickClock.dmcx[3] = 7959302129952446000L;
        dx$TickClock.dmcx[4] = 4803502736159420059L;
    }

    private static /* synthetic */ long dmcw(int n2) {
        return dmcx[n2] ^ dmcy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dx$TickClock() {
        var2_1 /* !! */  = dx$TickClock.b;
        super();
        this.lastTicks = (int)dx$TickClock.dmcu("dmcv", dmcr(int ), (int)0);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.staleAt = (long)dx$TickClock.dmcu("dmcz", dmcw(int ), (int)0);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)dx$TickClock.dmcu("dmda", dmcr(int ), (int)1);
                break;
            }
lbl12:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)dx$TickClock.dmcu("dmdb", dmcr(int ), (int)2);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)dx$TickClock.dmcu("dmdc", dmcr(int ), (int)3);
                    ** GOTO lbl12
                    break;
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)dx$TickClock.dmcu("dmdd", dmcr(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ void dmfa() {
        dx$TickClock.dmct[0] = -1068040077;
        dx$TickClock.dmct[1] = 186153433;
        dx$TickClock.dmct[2] = 2115695235;
        dx$TickClock.dmct[3] = 735275919;
        dx$TickClock.dmct[4] = -1620506072;
        dx$TickClock.dmct[5] = 386248899;
        dx$TickClock.dmct[6] = 1046140996;
        dx$TickClock.dmct[7] = 1999855952;
        dx$TickClock.dmct[8] = 417190081;
        dx$TickClock.dmct[9] = -83001354;
        dx$TickClock.dmct[10] = 1005580061;
        dx$TickClock.dmct[11] = -912853268;
        dx$TickClock.dmct[12] = -439014903;
        dx$TickClock.dmct[13] = -1450014099;
        dx$TickClock.dmct[14] = 2145890045;
        dx$TickClock.dmct[15] = 423585210;
        dx$TickClock.dmct[16] = -2003656478;
        dx$TickClock.dmct[17] = 139000189;
        dx$TickClock.dmct[18] = 1982914086;
        dx$TickClock.dmct[19] = 1364381599;
        dx$TickClock.dmct[20] = -1758337167;
        dx$TickClock.dmct[21] = 73318678;
        dx$TickClock.dmct[22] = -1917093594;
        dx$TickClock.dmct[23] = 77534383;
        dx$TickClock.dmct[24] = 1926014624;
        dx$TickClock.dmct[25] = 1468338080;
        dx$TickClock.dmct[26] = 1978688594;
        dx$TickClock.dmct[27] = -1343495706;
        dx$TickClock.dmct[28] = -159820247;
        dx$TickClock.dmct[29] = 1297824690;
        dx$TickClock.dmct[30] = -1038779928;
        dx$TickClock.dmct[31] = 1903758975;
        dx$TickClock.dmct[32] = 23228760;
        dx$TickClock.dmct[33] = 90723201;
        dx$TickClock.dmct[34] = 241292919;
        dx$TickClock.dmct[35] = 863304326;
        dx$TickClock.dmct[36] = 1821750293;
        dx$TickClock.dmct[37] = 81375122;
        dx$TickClock.dmct[38] = -1679816834;
        dx$TickClock.dmct[39] = 2019672748;
        dx$TickClock.dmct[40] = -1642355679;
        dx$TickClock.dmct[41] = 2139847863;
        dx$TickClock.dmct[42] = -638451629;
        dx$TickClock.dmct[43] = -260481702;
        dx$TickClock.dmct[44] = 1026026144;
        dx$TickClock.dmct[45] = 2126213432;
        dx$TickClock.dmct[46] = -1826293434;
        dx$TickClock.dmct[47] = -678562553;
    }

    private static /* synthetic */ void dmez() {
        dx$TickClock.dmcs[0] = 1079443571;
        dx$TickClock.dmcs[1] = 186153432;
        dx$TickClock.dmcs[2] = 2115695232;
        dx$TickClock.dmcs[3] = 735275917;
        dx$TickClock.dmcs[4] = -1620506071;
        dx$TickClock.dmcs[5] = -1048402636;
        dx$TickClock.dmcs[6] = -1046140997;
        dx$TickClock.dmcs[7] = -1999855953;
        dx$TickClock.dmcs[8] = 417190101;
        dx$TickClock.dmcs[9] = -83001353;
        dx$TickClock.dmcs[10] = 1005580032;
        dx$TickClock.dmcs[11] = -912853265;
        dx$TickClock.dmcs[12] = -439014894;
        dx$TickClock.dmcs[13] = -1450014088;
        dx$TickClock.dmcs[14] = 2145890009;
        dx$TickClock.dmcs[15] = 423585189;
        dx$TickClock.dmcs[16] = -2003656452;
        dx$TickClock.dmcs[17] = 139000171;
        dx$TickClock.dmcs[18] = 1982914094;
        dx$TickClock.dmcs[19] = 1364381572;
        dx$TickClock.dmcs[20] = -1758337182;
        dx$TickClock.dmcs[21] = 73318677;
        dx$TickClock.dmcs[22] = -1917093584;
        dx$TickClock.dmcs[23] = 77534396;
        dx$TickClock.dmcs[24] = 1926014650;
        dx$TickClock.dmcs[25] = 1468338086;
        dx$TickClock.dmcs[26] = 1978688577;
        dx$TickClock.dmcs[27] = -1343495686;
        dx$TickClock.dmcs[28] = -159820235;
        dx$TickClock.dmcs[29] = 1297824683;
        dx$TickClock.dmcs[30] = -1038779911;
        dx$TickClock.dmcs[31] = 1903758938;
        dx$TickClock.dmcs[32] = 23228745;
        dx$TickClock.dmcs[33] = 90723237;
        dx$TickClock.dmcs[34] = 241292900;
        dx$TickClock.dmcs[35] = 863304337;
        dx$TickClock.dmcs[36] = 1821750302;
        dx$TickClock.dmcs[37] = 81375154;
        dx$TickClock.dmcs[38] = -1679816866;
        dx$TickClock.dmcs[39] = 2019672712;
        dx$TickClock.dmcs[40] = -1642355651;
        dx$TickClock.dmcs[41] = 2139847853;
        dx$TickClock.dmcs[42] = -638451593;
        dx$TickClock.dmcs[43] = -260481724;
        dx$TickClock.dmcs[44] = 1026026175;
        dx$TickClock.dmcs[45] = 2126213423;
        dx$TickClock.dmcs[46] = -1826293427;
        dx$TickClock.dmcs[47] = -678562521;
    }

    public static /* synthetic */ CallSite dmcu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        dmct = new int[48];
        dx$TickClock.dmez();
        dx$TickClock.dmfa();
        dmcx = new long[5];
        dmcy = new long[5];
        dx$TickClock.dmfb();
        dx$TickClock.dmfc();
    }

    private static /* synthetic */ void dmfc() {
        dx$TickClock.dmcy[0] = -7763511462758294378L;
        dx$TickClock.dmcy[1] = 8550287348424141770L;
        dx$TickClock.dmcy[2] = -1322084000484937968L;
        dx$TickClock.dmcy[3] = 7959302129952445912L;
        dx$TickClock.dmcy[4] = 4803502736159419763L;
    }

    private static /* synthetic */ int dmcr(int n2) {
        return dmcs[n2] ^ dmct[n2];
    }
}

