/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import ruhack.phobia.ai;

public class af {
    private static long[] cjnt;
    private static int[] cjnn;
    private static final long SAVE_INTERVAL_MS = 90000L;
    public static final boolean a;
    private static final long INITIAL_DELAY_MS = 90000L;
    private static long[] cjns;
    public static final int b;
    protected static final long fy = -8665159007522866886L;
    private static int[] cjno;
    private final ScheduledExecutorService executor;
    private final AtomicBoolean running;
    private final AtomicLong lastSaveTime;
    private ScheduledFuture<?> scheduledTask;
    private final Runnable saveTask;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Thread lambda$new$0(Runnable var0) {
        v0 /* !! */  = af.fy;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(af.cjnp("cjxq", cjnr(int ), (int)130) - af.cjnp("cjxp", cjnr(int ), (int)129));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -363677382: {
                    break block43;
                }
                case 684729074: {
                    continue block43;
                }
            }
            break;
        }
        var4_1 = af.c;
        v1 /* !! */  = af.fy;
        if (true) ** GOTO lbl15
        block44: while (true) {
            v1 /* !! */  = (long)(af.cjnp("cjxs", cjnr(int ), (int)132) - af.cjnp("cjxr", cjnr(int ), (int)131));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2047726041: {
                    continue block44;
                }
                case -363677382: {
                    break block44;
                }
            }
            break;
        }
        var3_2 /* !! */  = af.b;
        v2 /* !! */  = af.fy;
        if (true) ** GOTO lbl25
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - af.cjnp("cjxt", cjnr(int ), (int)133));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -363677382: {
                    break block45;
                }
                case 605280154: {
                    v3 = af.cjnp("cjxu", cjnr(int ), (int)134);
                    continue block45;
                }
                case 1204050945: {
                    v3 = af.cjnp("cjxv", cjnr(int ), (int)135);
                    continue block45;
                }
            }
            break;
        }
        var2_3 = af.a;
        if (var4_1) {
            throw null;
lbl37:
            // 4 sources

            return null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl37
                v4 /* !! */  = af.fy;
                if (true) ** GOTO lbl47
                block47: while (true) {
                    v4 /* !! */  = (long)(v5 - af.cjnp("cjxw", cjnr(int ), (int)136));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -623739392: {
                            v5 = af.cjnp("cjxx", cjnr(int ), (int)137);
                            continue block47;
                        }
                        case -363677382: {
                            break block47;
                        }
                        case 875633266: {
                            v5 = af.cjnp("cjxy", cjnr(int ), (int)138);
                            continue block47;
                        }
                        case 1488544076: {
                            v5 = af.cjnp("cjxz", cjnr(int ), (int)139);
                            continue block47;
                        }
                    }
                    break;
                }
                v6 /* !! */  = af.fy;
                if (true) ** GOTO lbl63
                block48: while (true) {
                    v6 /* !! */  = (long)(v7 - af.cjnp("cjya", cjnr(int ), (int)140));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -860571285: {
                            v7 = af.cjnp("cjyb", cjnr(int ), (int)141);
                            continue block48;
                        }
                        case -624255186: {
                            v7 = af.cjnp("cjyc", cjnr(int ), (int)142);
                            continue block48;
                        }
                        case -363677382: {
                            break block48;
                        }
                        case 1175411013: {
                            v7 = af.cjnp("cjyd", cjnr(int ), (int)143);
                            continue block48;
                        }
                    }
                    break;
                }
                var1_4 = new Thread(var0, "Phobia-ConfigAutoSaver");
                if (var2_3 || var2_3) ** GOTO lbl37
                v8 = af.cjnp("cjye", cjnm(int ), (int)127);
                v9 /* !! */  = af.fy;
                if (true) ** GOTO lbl82
                block49: while (true) {
                    v9 /* !! */  = (long)(v10 - af.cjnp("cjyf", cjnr(int ), (int)144));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -870677951: {
                            v10 = af.cjnp("cjyg", cjnr(int ), (int)145);
                            continue block49;
                        }
                        case -363677382: {
                            break block49;
                        }
                        case -188423689: {
                            v10 = af.cjnp("cjyh", cjnr(int ), (int)146);
                            continue block49;
                        }
                        case 1525052202: {
                            v10 = af.cjnp("cjyi", cjnr(int ), (int)147);
                            continue block49;
                        }
                    }
                    break;
                }
                var1_4.setDaemon((boolean)v8);
                if (var2_3 || var2_3) ** GOTO lbl37
                v11 = af.cjnp("cjyj", cjnm(int ), (int)128);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_0 = af.fy - af.cjnp("cjyk", cjnr(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == af.cjnp("cjyl", cjnm(int ), (int)129)) break;
                    v12 /* !! */  = (long)af.cjnp("cjym", cjnm(int ), (int)130);
                }
                var1_4.setPriority((int)v11);
                if (var2_3 || var2_3) ** continue;
                return var1_4;
            }
            case 0: {
                var3_2 /* !! */  = (int)af.cjnp("cjyn", cjnm(int ), (int)131);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 1: {
                do {
                    var3_2 /* !! */  = (int)af.cjnp("cjyo", cjnm(int ), (int)132);
                } while (!var4_1);
                throw null;
            }
lbl115:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)af.cjnp("cjyp", cjnm(int ), (int)133);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl120:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)af.cjnp("cjyq", cjnm(int ), (int)134);
                if (var4_1) {
                    throw null;
                }
            }
            case 4: {
                var3_2 /* !! */  = (int)af.cjnp("cjyr", cjnm(int ), (int)135);
                if (var4_1) {
                    throw null;
                }
            }
lbl128:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)af.cjnp("cjys", cjnm(int ), (int)136);
                if (!var4_1) break;
                throw null;
            }
lbl132:
            // 2 sources

            case 6: {
                do {
                    var3_2 /* !! */  = (int)af.cjnp("cjyt", cjnm(int ), (int)137);
                } while (!var4_1);
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)af.cjnp("cjyu", cjnm(int ), (int)138);
                if (!var4_1) ** GOTO lbl120
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)af.cjnp("cjyv", cjnm(int ), (int)139);
                if (!var4_1) ** GOTO lbl132
                throw null;
            }
            case 9: 
        }
        do {
            var3_2 /* !! */  = (int)af.cjnp("cjyw", cjnm(int ), (int)140);
        } while (!var4_1);
        throw null;
    }

    private static /* synthetic */ void cjyy() {
        af.cjnn[100] = -1771742071;
        af.cjnn[101] = 1740528171;
        af.cjnn[102] = -665939374;
        af.cjnn[103] = -1341718898;
        af.cjnn[104] = -570915444;
        af.cjnn[105] = 1104484099;
        af.cjnn[106] = -1752874042;
        af.cjnn[107] = 472643617;
        af.cjnn[108] = 2039806444;
        af.cjnn[109] = -457370992;
        af.cjnn[110] = -1950570912;
        af.cjnn[111] = -206477610;
        af.cjnn[112] = 884361294;
        af.cjnn[113] = -692309734;
        af.cjnn[114] = 1182003842;
        af.cjnn[115] = 1610233855;
        af.cjnn[116] = 497707582;
        af.cjnn[117] = 90280635;
        af.cjnn[118] = -1044008720;
        af.cjnn[119] = 1005418120;
        af.cjnn[120] = -1515414868;
        af.cjnn[121] = -423293139;
        af.cjnn[122] = -761160384;
        af.cjnn[123] = 1959886962;
        af.cjnn[124] = 1065504044;
        af.cjnn[125] = 896943598;
        af.cjnn[126] = 1895768565;
        af.cjnn[127] = -525557233;
        af.cjnn[128] = -578770467;
        af.cjnn[129] = -2116219862;
        af.cjnn[130] = 1885973393;
        af.cjnn[131] = -1416914974;
        af.cjnn[132] = 8406814;
        af.cjnn[133] = 1376190734;
        af.cjnn[134] = -814524896;
        af.cjnn[135] = -45301739;
        af.cjnn[136] = 990209946;
        af.cjnn[137] = -2109556191;
        af.cjnn[138] = -1077470322;
        af.cjnn[139] = -70899720;
        af.cjnn[140] = 2046540659;
    }

    public static /* synthetic */ CallSite cjnp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cjyx() {
        af.cjnn[0] = -1710308108;
        af.cjnn[1] = -1561653256;
        af.cjnn[2] = 1446341313;
        af.cjnn[3] = -483784483;
        af.cjnn[4] = 1796447012;
        af.cjnn[5] = -1629421355;
        af.cjnn[6] = -357971891;
        af.cjnn[7] = -826857587;
        af.cjnn[8] = -1985637376;
        af.cjnn[9] = -958172795;
        af.cjnn[10] = 2102141491;
        af.cjnn[11] = -1470200656;
        af.cjnn[12] = 130316047;
        af.cjnn[13] = 731336183;
        af.cjnn[14] = 1985407460;
        af.cjnn[15] = 444229085;
        af.cjnn[16] = -659622021;
        af.cjnn[17] = -1262956243;
        af.cjnn[18] = -487699347;
        af.cjnn[19] = 2058150345;
        af.cjnn[20] = 1016051607;
        af.cjnn[21] = 174755189;
        af.cjnn[22] = 2122868163;
        af.cjnn[23] = 256947382;
        af.cjnn[24] = 1685171732;
        af.cjnn[25] = 1288782817;
        af.cjnn[26] = -719721880;
        af.cjnn[27] = -1726093852;
        af.cjnn[28] = 1626134055;
        af.cjnn[29] = -1555358283;
        af.cjnn[30] = 1282939509;
        af.cjnn[31] = 611926642;
        af.cjnn[32] = -989600295;
        af.cjnn[33] = -1199401100;
        af.cjnn[34] = -1350132157;
        af.cjnn[35] = -1119407648;
        af.cjnn[36] = 1296858543;
        af.cjnn[37] = 121914840;
        af.cjnn[38] = -817062012;
        af.cjnn[39] = -408165370;
        af.cjnn[40] = 147575468;
        af.cjnn[41] = 1602102854;
        af.cjnn[42] = 167455288;
        af.cjnn[43] = -925952244;
        af.cjnn[44] = 1240204795;
        af.cjnn[45] = -1726866159;
        af.cjnn[46] = 1649499186;
        af.cjnn[47] = 1508517693;
        af.cjnn[48] = -1595456542;
        af.cjnn[49] = -1278424076;
        af.cjnn[50] = -118745568;
        af.cjnn[51] = -1366031114;
        af.cjnn[52] = 857477475;
        af.cjnn[53] = -428569968;
        af.cjnn[54] = -1556235209;
        af.cjnn[55] = 1409259983;
        af.cjnn[56] = -1935481506;
        af.cjnn[57] = 294500328;
        af.cjnn[58] = -2053705554;
        af.cjnn[59] = 1262229271;
        af.cjnn[60] = 1033786951;
        af.cjnn[61] = 487216098;
        af.cjnn[62] = 1877107457;
        af.cjnn[63] = -905917476;
        af.cjnn[64] = 1943730704;
        af.cjnn[65] = -214205630;
        af.cjnn[66] = 1627265429;
        af.cjnn[67] = -641723851;
        af.cjnn[68] = -804906733;
        af.cjnn[69] = 208078262;
        af.cjnn[70] = 399767457;
        af.cjnn[71] = -37520614;
        af.cjnn[72] = -210311709;
        af.cjnn[73] = -691104931;
        af.cjnn[74] = -1578008143;
        af.cjnn[75] = 1624466809;
        af.cjnn[76] = -1985329158;
        af.cjnn[77] = -1538941845;
        af.cjnn[78] = -404071754;
        af.cjnn[79] = 1534482105;
        af.cjnn[80] = -778024249;
        af.cjnn[81] = -790619511;
        af.cjnn[82] = -2040934335;
        af.cjnn[83] = -670847774;
        af.cjnn[84] = -92070348;
        af.cjnn[85] = -294187062;
        af.cjnn[86] = 1080806030;
        af.cjnn[87] = 302675816;
        af.cjnn[88] = 1527000108;
        af.cjnn[89] = 990938674;
        af.cjnn[90] = -864831328;
        af.cjnn[91] = 106299051;
        af.cjnn[92] = 1263241645;
        af.cjnn[93] = -1333756905;
        af.cjnn[94] = -291660612;
        af.cjnn[95] = 1080467903;
        af.cjnn[96] = -981717864;
        af.cjnn[97] = 1471292974;
        af.cjnn[98] = 2122269041;
        af.cjnn[99] = -877226158;
    }

    private static /* synthetic */ long cjnr(int n2) {
        return cjns[n2] ^ cjnt[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void start() {
        v0 /* !! */  = af.fy;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(af.cjnp("cjod", cjnr(int ), (int)2) - af.cjnp("cjoc", cjnr(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1260627664: {
                    continue block57;
                }
                case -363677382: {
                    break block57;
                }
            }
            break;
        }
        var3_1 = af.c;
        v1 /* !! */  = af.fy;
        if (true) ** GOTO lbl15
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - af.cjnp("cjoe", cjnr(int ), (int)3));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -363677382: {
                    break block58;
                }
                case 784263966: {
                    v2 = af.cjnp("cjof", cjnr(int ), (int)4);
                    continue block58;
                }
                case 1628905127: {
                    v2 = af.cjnp("cjog", cjnr(int ), (int)5);
                    continue block58;
                }
                case 1983525656: {
                    v2 = af.cjnp("cjoh", cjnr(int ), (int)6);
                    continue block58;
                }
            }
            break;
        }
        var2_2 /* !! */  = af.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = af.fy;
                if (true) ** GOTO lbl35
                block59: while (true) {
                    v3 /* !! */  = (long)(v4 - af.cjnp("cjoi", cjnr(int ), (int)7));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -724312899: {
                            v4 = af.cjnp("cjoj", cjnr(int ), (int)8);
                            continue block59;
                        }
                        case -363677382: {
                            break block59;
                        }
                        case 973934399: {
                            v4 = af.cjnp("cjok", cjnr(int ), (int)9);
                            continue block59;
                        }
                    }
                    break;
                }
                var1_3 = af.a;
                if (var3_1) {
                    throw null;
lbl47:
                    // 5 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl47
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = af.fy - af.cjnp("cjol", cjnr(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == af.cjnp("cjom", cjnm(int ), (int)8)) break;
                    v5 /* !! */  = (long)af.cjnp("cjon", cjnm(int ), (int)9);
                }
                v6 = af.cjnp("cjoo", cjnm(int ), (int)10);
                v7 = af.cjnp("cjop", cjnm(int ), (int)11);
                v8 /* !! */  = af.fy;
                if (true) ** GOTO lbl61
                block62: while (true) {
                    v8 /* !! */  = (long)(v9 - af.cjnp("cjoq", cjnr(int ), (int)11));
lbl61:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -363677382: {
                            break block62;
                        }
                        case -129150462: {
                            v9 = af.cjnp("cjor", cjnr(int ), (int)12);
                            continue block62;
                        }
                        case -58114666: {
                            v9 = af.cjnp("cjos", cjnr(int ), (int)13);
                            continue block62;
                        }
                    }
                    break;
                }
                if (!this.running.compareAndSet((boolean)v6, (boolean)v7)) ** GOTO lbl145
                if (var1_3 || var1_3) ** GOTO lbl47
                v10 /* !! */  = af.fy;
                if (true) ** GOTO lbl76
                block63: while (true) {
                    v10 /* !! */  = (long)(v11 - af.cjnp("cjot", cjnr(int ), (int)14));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1749106407: {
                            v11 = af.cjnp("cjou", cjnr(int ), (int)15);
                            continue block63;
                        }
                        case -363677382: {
                            break block63;
                        }
                        case 963265527: {
                            v11 = af.cjnp("cjov", cjnr(int ), (int)16);
                            continue block63;
                        }
                    }
                    break;
                }
                v12 /* !! */  = af.fy;
                if (true) ** GOTO lbl89
                block64: while (true) {
                    v12 /* !! */  = (long)(af.cjnp("cjox", cjnr(int ), (int)18) - af.cjnp("cjow", cjnr(int ), (int)17));
lbl89:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1754774563: {
                            continue block64;
                        }
                        case -363677382: {
                            break block64;
                        }
                    }
                    break;
                }
                v13 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, executeSave(), ()V)((af)this);
                v14 = af.cjnp("cjoy", cjnr(int ), (int)19);
                v15 = af.cjnp("cjoz", cjnr(int ), (int)20);
                v16 /* !! */  = af.fy;
                if (true) ** GOTO lbl101
                block65: while (true) {
                    v16 /* !! */  = (long)(af.cjnp("cjpb", cjnr(int ), (int)22) - af.cjnp("cjpa", cjnr(int ), (int)21));
lbl101:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2096406540: {
                            continue block65;
                        }
                        case -363677382: {
                            break block65;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_1 = af.fy - af.cjnp("cjpc", cjnr(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == af.cjnp("cjpd", cjnm(int ), (int)12)) break;
                    v17 /* !! */  = (long)af.cjnp("cjpe", cjnm(int ), (int)13);
                }
                v18 = this.executor.scheduleAtFixedRate(v13, (long)v14, (long)v15, TimeUnit.MILLISECONDS);
                v19 /* !! */  = af.fy;
                if (true) ** GOTO lbl116
                block67: while (true) {
                    v19 /* !! */  = (long)(v20 - af.cjnp("cjpf", cjnr(int ), (int)24));
lbl116:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1011546590: {
                            v20 = af.cjnp("cjpg", cjnr(int ), (int)25);
                            continue block67;
                        }
                        case -363677382: {
                            break block67;
                        }
                        case -25701481: {
                            v20 = af.cjnp("cjph", cjnr(int ), (int)26);
                            continue block67;
                        }
                    }
                    break;
                }
                this.scheduledTask = v18;
                if (var1_3 || var1_3) ** GOTO lbl47
                v21 /* !! */  = af.fy;
                if (true) ** GOTO lbl131
                block68: while (true) {
                    v21 /* !! */  = (long)(v22 - af.cjnp("cjpi", cjnr(int ), (int)27));
lbl131:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1776349292: {
                            v22 = af.cjnp("cjpj", cjnr(int ), (int)28);
                            continue block68;
                        }
                        case -363677382: {
                            break block68;
                        }
                        case 510901552: {
                            v22 = af.cjnp("cjpk", cjnr(int ), (int)29);
                            continue block68;
                        }
                        case 2008227258: {
                            v22 = af.cjnp("cjpl", cjnr(int ), (int)30);
                            continue block68;
                        }
                    }
                    break;
                }
                ai.info("AutoConfiguration: AutoSaver started (interval: 90s)");
                if (var1_3) ** GOTO lbl47
lbl145:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)af.cjnp("cjpm", cjnm(int ), (int)14);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)af.cjnp("cjpn", cjnm(int ), (int)15);
                if (!var3_1) break;
                throw null;
            }
lbl157:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)af.cjnp("cjpo", cjnm(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl162:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)af.cjnp("cjpp", cjnm(int ), (int)17);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)af.cjnp("cjpq", cjnm(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)af.cjnp("cjpr", cjnm(int ), (int)19);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)af.cjnp("cjps", cjnm(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl181:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)af.cjnp("cjpt", cjnm(int ), (int)21);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)af.cjnp("cjpu", cjnm(int ), (int)22);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl189:
            // 2 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)af.cjnp("cjpv", cjnm(int ), (int)23);
                } while (!var3_1);
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)af.cjnp("cjpw", cjnm(int ), (int)24);
        ** while (!var3_1)
lbl197:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public af(Runnable var1_1) {
        var3_2 /* !! */  = af.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.saveTask = var1_1;
                this.running = new AtomicBoolean((boolean)af.cjnp("cjnq", cjnm(int ), (int)0));
                this.lastSaveTime = new AtomicLong((long)af.cjnp("cjnu", cjnr(int ), (int)0));
                this.executor = Executors.newSingleThreadScheduledExecutor((ThreadFactory)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Runnable;)Ljava/lang/Thread;, lambda$new$0(java.lang.Runnable ), (Ljava/lang/Runnable;)Ljava/lang/Thread;)());
                return;
            }
lbl11:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)af.cjnp("cjnv", cjnm(int ), (int)1);
                ** GOTO lbl23
            }
            case 1: {
                var3_2 /* !! */  = (int)af.cjnp("cjnw", cjnm(int ), (int)2);
                ** GOTO lbl11
            }
            case 2: {
                var3_2 /* !! */  = (int)af.cjnp("cjnx", cjnm(int ), (int)3);
                break;
            }
            case 3: {
                var3_2 /* !! */  = (int)af.cjnp("cjny", cjnm(int ), (int)4);
                ** GOTO lbl11
            }
lbl23:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)af.cjnp("cjnz", cjnm(int ), (int)5);
                    continue;
                    break;
                }
            }
            case 5: {
                while (true) {
                    var3_2 /* !! */  = (int)af.cjnp("cjoa", cjnm(int ), (int)6);
                }
            }
            case 6: 
        }
        var3_2 /* !! */  = (int)af.cjnp("cjob", cjnm(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ int cjnm(int n2) {
        return cjnn[n2] ^ cjno[n2];
    }

    static {
        cjnn = new int[141];
        cjno = new int[141];
        af.cjyx();
        af.cjyy();
        af.cjyz();
        af.cjza();
        cjns = new long[149];
        cjnt = new long[149];
        af.cjzb();
        af.cjzc();
        af.cjzd();
        af.cjze();
    }

    private static /* synthetic */ void cjyz() {
        af.cjno[0] = -1710308108;
        af.cjno[1] = -1561653252;
        af.cjno[2] = 1446341319;
        af.cjno[3] = -483784488;
        af.cjno[4] = 1796447014;
        af.cjno[5] = -1629421354;
        af.cjno[6] = -357971890;
        af.cjno[7] = -826857592;
        af.cjno[8] = 1985637375;
        af.cjno[9] = 336608443;
        af.cjno[10] = 2102141491;
        af.cjno[11] = -1470200655;
        af.cjno[12] = -130316048;
        af.cjno[13] = -887863951;
        af.cjno[14] = 1985407469;
        af.cjno[15] = 444229082;
        af.cjno[16] = -659622030;
        af.cjno[17] = -1262956251;
        af.cjno[18] = -487699347;
        af.cjno[19] = 2058150349;
        af.cjno[20] = 1016051601;
        af.cjno[21] = 174755189;
        af.cjno[22] = 2122868164;
        af.cjno[23] = 256947380;
        af.cjno[24] = 1685171740;
        af.cjno[25] = -1288782818;
        af.cjno[26] = -1414946106;
        af.cjno[27] = 1726093851;
        af.cjno[28] = 1071915950;
        af.cjno[29] = 1555358282;
        af.cjno[30] = -71104956;
        af.cjno[31] = -611926643;
        af.cjno[32] = 414377740;
        af.cjno[33] = 1199401099;
        af.cjno[34] = 1036021396;
        af.cjno[35] = -1119407637;
        af.cjno[36] = 1296858530;
        af.cjno[37] = 121914843;
        af.cjno[38] = -817061995;
        af.cjno[39] = -408165366;
        af.cjno[40] = 147575469;
        af.cjno[41] = 1602102859;
        af.cjno[42] = 167455289;
        af.cjno[43] = -925952241;
        af.cjno[44] = 1240204797;
        af.cjno[45] = -1726866150;
        af.cjno[46] = 1649499197;
        af.cjno[47] = 1508517686;
        af.cjno[48] = -1595456542;
        af.cjno[49] = -1278424066;
        af.cjno[50] = -118745566;
        af.cjno[51] = -1366031116;
        af.cjno[52] = 857477480;
        af.cjno[53] = 428569967;
        af.cjno[54] = 503510459;
        af.cjno[55] = -1409259984;
        af.cjno[56] = -863316537;
        af.cjno[57] = -294500329;
        af.cjno[58] = -462625250;
        af.cjno[59] = 1262229271;
        af.cjno[60] = 1033786951;
        af.cjno[61] = 487216107;
        af.cjno[62] = 1877107465;
        af.cjno[63] = -905917484;
        af.cjno[64] = 1943730713;
        af.cjno[65] = -214205622;
        af.cjno[66] = 1627265439;
        af.cjno[67] = -641723849;
        af.cjno[68] = -804906732;
        af.cjno[69] = 208078270;
        af.cjno[70] = 399767462;
        af.cjno[71] = -37520609;
        af.cjno[72] = 210311708;
        af.cjno[73] = 1439251646;
        af.cjno[74] = 1578008142;
        af.cjno[75] = 386431011;
        af.cjno[76] = 1985329157;
        af.cjno[77] = -800250249;
        af.cjno[78] = -404071753;
        af.cjno[79] = -993917907;
        af.cjno[80] = 778024248;
        af.cjno[81] = 1101601173;
        af.cjno[82] = 2040934334;
        af.cjno[83] = 749633464;
        af.cjno[84] = 92070347;
        af.cjno[85] = -1083425852;
        af.cjno[86] = -1080806031;
        af.cjno[87] = 2114668281;
        af.cjno[88] = 1527000109;
        af.cjno[89] = 990938673;
        af.cjno[90] = -864831328;
        af.cjno[91] = 106299065;
        af.cjno[92] = 1263241644;
        af.cjno[93] = -1333756902;
        af.cjno[94] = -291660621;
        af.cjno[95] = 1080467899;
        af.cjno[96] = -981717860;
        af.cjno[97] = 1471292969;
        af.cjno[98] = 2122269048;
        af.cjno[99] = -877226154;
    }

    /*
     * Exception decompiling
     */
    private void executeSave() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 31[SWITCH]
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
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public long getLastSaveTime() {
        while (true) {
            block36: {
                if ((v0 /* !! */  = (cfr_temp_1 = af.fy - af.cjnp("cjvz", cjnr(int ), (int)106)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != af.cjnp("cjwa", cjnm(int ), (int)108)) break block36;
                var3_1 = af.c;
                v1 /* !! */  = af.fy;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)af.cjnp("cjwb", cjnm(int ), (int)109);
        }
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - af.cjnp("cjwc", cjnr(int ), (int)107));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1301057712: {
                    v2 = af.cjnp("cjwd", cjnr(int ), (int)108);
                    continue block24;
                }
                case -363677382: {
                    break block24;
                }
                case -246463902: {
                    v2 = af.cjnp("cjwe", cjnr(int ), (int)109);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = af.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = af.fy;
                    block26: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -988048738: {
                                v4 = af.cjnp("cjwg", cjnr(int ), (int)111);
                                ** GOTO lbl41
                            }
                            case -363677382: {
                                break block26;
                            }
                            case 450128577: {
                                v4 = af.cjnp("cjwh", cjnr(int ), (int)112);
                                ** GOTO lbl41
                            }
                            case 755314859: {
                                v4 = af.cjnp("cjwi", cjnr(int ), (int)113);
lbl41:
                                // 3 sources

                                v3 /* !! */  = (long)(v4 - af.cjnp("cjwf", cjnr(int ), (int)110));
                                continue block26;
                            }
                        }
                        break;
                    }
                    var1_3 = af.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (long)af.cjnp("cjwj", cjnr(int ), (int)114);
                    if (var1_3 != false) return (long)af.cjnp("cjwj", cjnr(int ), (int)114);
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = af.fy - af.cjnp("cjwk", cjnr(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  != af.cjnp("cjwl", cjnm(int ), (int)110)) ** GOTO lbl54
                        v6 /* !! */  = af.fy;
                        if (true) ** GOTO lbl68
lbl54:
                        // 1 sources

                        v5 /* !! */  = (long)af.cjnp("cjwm", cjnm(int ), (int)111);
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)af.cjnp("cjwt", cjnm(int ), (int)114);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)af.cjnp("cjwu", cjnm(int ), (int)115);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                block28: while (true) {
                    v6 /* !! */  = (long)(v7 - af.cjnp("cjwn", cjnr(int ), (int)116));
lbl68:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1848496577: {
                            v7 = af.cjnp("cjwo", cjnr(int ), (int)117);
                            continue block28;
                        }
                        case -363677382: {
                            return this.lastSaveTime.get();
                        }
                        case 406924413: {
                            v7 = af.cjnp("cjwp", cjnr(int ), (int)118);
                            continue block28;
                        }
                        case 562924777: {
                            v7 = af.cjnp("cjwq", cjnr(int ), (int)119);
                            continue block28;
                        }
                    }
                    break;
                }
                return this.lastSaveTime.get();
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)af.cjnp("cjwr", cjnm(int ), (int)112);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl89
            break;
        }
        do {
            if (true) ** continue;
lbl89:
            // 2 sources

            var2_2 /* !! */  = (int)af.cjnp("cjws", cjnm(int ), (int)113);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cjzd() {
        af.cjnt[0] = 6435090651345784807L;
        af.cjnt[1] = -534545296410022921L;
        af.cjnt[2] = -6253150033067449014L;
        af.cjnt[3] = 7150457296656320146L;
        af.cjnt[4] = -8290935032080673086L;
        af.cjnt[5] = -969755225414049506L;
        af.cjnt[6] = -3115469961828655194L;
        af.cjnt[7] = 6056031792066826312L;
        af.cjnt[8] = -4566519557974210856L;
        af.cjnt[9] = -7687661028506996439L;
        af.cjnt[10] = -3935537827770714185L;
        af.cjnt[11] = 3299680808483511945L;
        af.cjnt[12] = -222893136086417636L;
        af.cjnt[13] = -7477194459908357467L;
        af.cjnt[14] = -3671245675615750074L;
        af.cjnt[15] = 5165746795662905055L;
        af.cjnt[16] = 6697246944206241738L;
        af.cjnt[17] = -5530784198246941901L;
        af.cjnt[18] = -6293718547592137947L;
        af.cjnt[19] = -7321881610991846014L;
        af.cjnt[20] = -2626279134400187768L;
        af.cjnt[21] = -8718669579973903227L;
        af.cjnt[22] = -5104497790671679762L;
        af.cjnt[23] = -5398608506483868162L;
        af.cjnt[24] = -3746590078919277521L;
        af.cjnt[25] = 2393310771725212633L;
        af.cjnt[26] = 807274646666677904L;
        af.cjnt[27] = 690887713548022390L;
        af.cjnt[28] = 6838445261944648123L;
        af.cjnt[29] = -5286846921298059473L;
        af.cjnt[30] = 5948277762402056875L;
        af.cjnt[31] = -162844970433013058L;
        af.cjnt[32] = 5748579548856824836L;
        af.cjnt[33] = -6096022001391512173L;
        af.cjnt[34] = -6465089406176689842L;
        af.cjnt[35] = -6874143636099413433L;
        af.cjnt[36] = 9056142071207961113L;
        af.cjnt[37] = 2079520874240318803L;
        af.cjnt[38] = -602853092288153633L;
        af.cjnt[39] = -3792231274060099451L;
        af.cjnt[40] = -54355271187657990L;
        af.cjnt[41] = -1644238815898789340L;
        af.cjnt[42] = -122171263853154198L;
        af.cjnt[43] = -1431703707335849385L;
        af.cjnt[44] = 3941352957550249941L;
        af.cjnt[45] = 3164317025417139662L;
        af.cjnt[46] = 4185726933732639873L;
        af.cjnt[47] = 4249876192128695897L;
        af.cjnt[48] = 1448430883609221152L;
        af.cjnt[49] = 7098547327790994476L;
        af.cjnt[50] = -151297479969952451L;
        af.cjnt[51] = 1704484552259274173L;
        af.cjnt[52] = 7373388801472723698L;
        af.cjnt[53] = -7727479476335034524L;
        af.cjnt[54] = -9194622958087812934L;
        af.cjnt[55] = -4895525440479145398L;
        af.cjnt[56] = -8650016737400130151L;
        af.cjnt[57] = -1211071770625867750L;
        af.cjnt[58] = 2025308657347893278L;
        af.cjnt[59] = 6774135722725113076L;
        af.cjnt[60] = 7412627546218423113L;
        af.cjnt[61] = -2749904468926964739L;
        af.cjnt[62] = -6163636758885751881L;
        af.cjnt[63] = 1943429208272734108L;
        af.cjnt[64] = -5105774045027936481L;
        af.cjnt[65] = 7211390315642120193L;
        af.cjnt[66] = -5423425410706919480L;
        af.cjnt[67] = 4930071408469049485L;
        af.cjnt[68] = -8380204834400580899L;
        af.cjnt[69] = -8452789170332506121L;
        af.cjnt[70] = 8797888000475177636L;
        af.cjnt[71] = -6285110851024836129L;
        af.cjnt[72] = 5734765155563552220L;
        af.cjnt[73] = 2864278091449691957L;
        af.cjnt[74] = -3253075293583806094L;
        af.cjnt[75] = -4712388182523437098L;
        af.cjnt[76] = 8179036560485639293L;
        af.cjnt[77] = -2342398661576922803L;
        af.cjnt[78] = 8920349502143612999L;
        af.cjnt[79] = 6666308046223802110L;
        af.cjnt[80] = -6623727366764452234L;
        af.cjnt[81] = -6242740416797592107L;
        af.cjnt[82] = 7936380414991580562L;
        af.cjnt[83] = 5588059773618867421L;
        af.cjnt[84] = -9116844538305436422L;
        af.cjnt[85] = -7061041479935573855L;
        af.cjnt[86] = -4312153323623596482L;
        af.cjnt[87] = 5398888186561833798L;
        af.cjnt[88] = 6647838800093974435L;
        af.cjnt[89] = 6468430466459799527L;
        af.cjnt[90] = -5394189556823654600L;
        af.cjnt[91] = -6352065535102816218L;
        af.cjnt[92] = -3318152093240997938L;
        af.cjnt[93] = 5929235622780030195L;
        af.cjnt[94] = -1730804883448116000L;
        af.cjnt[95] = -1180071882415432753L;
        af.cjnt[96] = -677149479570526927L;
        af.cjnt[97] = -6193367557398327160L;
        af.cjnt[98] = 9071544969186822114L;
        af.cjnt[99] = -2310318356582473303L;
    }

    private static /* synthetic */ void cjza() {
        af.cjno[100] = -1771742056;
        af.cjno[101] = 1740528169;
        af.cjno[102] = -665939362;
        af.cjno[103] = -1341718884;
        af.cjno[104] = -570915450;
        af.cjno[105] = 1104484097;
        af.cjno[106] = -1752874040;
        af.cjno[107] = 472643616;
        af.cjno[108] = -2039806445;
        af.cjno[109] = 225048232;
        af.cjno[110] = 1950570911;
        af.cjno[111] = 1671712933;
        af.cjno[112] = 884361294;
        af.cjno[113] = -692309736;
        af.cjno[114] = 1182003841;
        af.cjno[115] = 1610233855;
        af.cjno[116] = -497707583;
        af.cjno[117] = 1850197428;
        af.cjno[118] = -1044008720;
        af.cjno[119] = -1005418121;
        af.cjno[120] = 1350244853;
        af.cjno[121] = 423293138;
        af.cjno[122] = -358947473;
        af.cjno[123] = 1959886960;
        af.cjno[124] = 1065504044;
        af.cjno[125] = 896943597;
        af.cjno[126] = 1895768567;
        af.cjno[127] = -525557234;
        af.cjno[128] = -578770468;
        af.cjno[129] = 2116219861;
        af.cjno[130] = -1977026326;
        af.cjno[131] = -1416914965;
        af.cjno[132] = 8406807;
        af.cjno[133] = 1376190735;
        af.cjno[134] = -814524891;
        af.cjno[135] = -45301740;
        af.cjno[136] = 990209946;
        af.cjno[137] = -2109556189;
        af.cjno[138] = -1077470326;
        af.cjno[139] = -70899727;
        af.cjno[140] = 2046540667;
    }

    private static /* synthetic */ void cjzc() {
        af.cjns[100] = -906955186652278868L;
        af.cjns[101] = 9211850358664201438L;
        af.cjns[102] = 8436322953939903537L;
        af.cjns[103] = 4070562680243431199L;
        af.cjns[104] = 3661905948386901442L;
        af.cjns[105] = -5320938814396580484L;
        af.cjns[106] = -1791342432035232405L;
        af.cjns[107] = 6199040747483030429L;
        af.cjns[108] = 421510816746084973L;
        af.cjns[109] = -6357572390333514433L;
        af.cjns[110] = -8546045643387983629L;
        af.cjns[111] = -5597331289577685673L;
        af.cjns[112] = 6410113255151357609L;
        af.cjns[113] = 7093656477759081178L;
        af.cjns[114] = 8547319180107783958L;
        af.cjns[115] = -2449059994542260785L;
        af.cjns[116] = 2995423653154286453L;
        af.cjns[117] = 6528471866317593206L;
        af.cjns[118] = -6210590775756782642L;
        af.cjns[119] = 7215537021086231165L;
        af.cjns[120] = -4735382077631829376L;
        af.cjns[121] = 1025736022130389644L;
        af.cjns[122] = 7254592382459258802L;
        af.cjns[123] = -3229556075797640002L;
        af.cjns[124] = 3196099919587509711L;
        af.cjns[125] = 5146501963432560476L;
        af.cjns[126] = 5422136227886802271L;
        af.cjns[127] = 7948192152985996719L;
        af.cjns[128] = -8551590857774115718L;
        af.cjns[129] = -6565597846398909800L;
        af.cjns[130] = 1075999213461833785L;
        af.cjns[131] = 6633374336341146768L;
        af.cjns[132] = 3685969198159221421L;
        af.cjns[133] = 52180268631000684L;
        af.cjns[134] = -505849388901226348L;
        af.cjns[135] = 8453194957399219638L;
        af.cjns[136] = 854840623613026886L;
        af.cjns[137] = -2617274335433330211L;
        af.cjns[138] = 4767746860564403152L;
        af.cjns[139] = 8633226974924242287L;
        af.cjns[140] = 3995990698982976122L;
        af.cjns[141] = 4942505121203823961L;
        af.cjns[142] = 5157035547292322202L;
        af.cjns[143] = 5229172689427721885L;
        af.cjns[144] = 1364408896675708573L;
        af.cjns[145] = 3818054316530504811L;
        af.cjns[146] = 3279173546252889987L;
        af.cjns[147] = 7823735256328168714L;
        af.cjns[148] = -7465423195010180751L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isRunning() {
        v0 /* !! */  = af.fy;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - af.cjnp("cjwv", cjnr(int ), (int)120));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -363677382: {
                    break block16;
                }
                case -36728108: {
                    v1 = af.cjnp("cjww", cjnr(int ), (int)121);
                    continue block16;
                }
                case 733998314: {
                    v1 = af.cjnp("cjwx", cjnr(int ), (int)122);
                    continue block16;
                }
                case 1773271034: {
                    v1 = af.cjnp("cjwy", cjnr(int ), (int)123);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = af.c;
        v2 /* !! */  = af.fy;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(af.cjnp("cjxa", cjnr(int ), (int)125) - af.cjnp("cjwz", cjnr(int ), (int)124));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -393061076: {
                    continue block17;
                }
                case -363677382: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = af.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = af.fy - af.cjnp("cjxb", cjnr(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == af.cjnp("cjxc", cjnm(int ), (int)116)) break;
            v3 /* !! */  = (long)af.cjnp("cjxd", cjnm(int ), (int)117);
        }
        var1_3 = af.a;
        if (var3_1) {
            throw null;
            return (boolean)af.cjnp("cjxe", cjnm(int ), (int)118);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = af.fy - af.cjnp("cjxf", cjnr(int ), (int)127)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == af.cjnp("cjxg", cjnm(int ), (int)119)) break;
                    v4 /* !! */  = (long)af.cjnp("cjxh", cjnm(int ), (int)120);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = af.fy - af.cjnp("cjxi", cjnr(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == af.cjnp("cjxj", cjnm(int ), (int)121)) break;
                    v5 /* !! */  = (long)af.cjnp("cjxk", cjnm(int ), (int)122);
                }
                return this.running.get();
            }
            case 0: {
                var2_2 /* !! */  = (int)af.cjnp("cjxl", cjnm(int ), (int)123);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 1: {
                var2_2 /* !! */  = (int)af.cjnp("cjxm", cjnm(int ), (int)124);
                if (var3_1) {
                    throw null;
                }
            }
lbl65:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)af.cjnp("cjxn", cjnm(int ), (int)125);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)af.cjnp("cjxo", cjnm(int ), (int)126);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cjze() {
        af.cjnt[100] = 5690438916181871909L;
        af.cjnt[101] = -5957281352812805838L;
        af.cjnt[102] = 322247005226940028L;
        af.cjnt[103] = 4051855634215459379L;
        af.cjnt[104] = 5433800387980299371L;
        af.cjnt[105] = -477196852906810554L;
        af.cjnt[106] = 7882999163157803340L;
        af.cjnt[107] = 6794339564387054889L;
        af.cjnt[108] = 8061835680814917408L;
        af.cjnt[109] = -6952111720677650098L;
        af.cjnt[110] = -5658818647824964656L;
        af.cjnt[111] = 5300432855723237219L;
        af.cjnt[112] = 7436216693583472337L;
        af.cjnt[113] = -7872521771262485107L;
        af.cjnt[114] = -1164057338535399491L;
        af.cjnt[115] = 7365620153899019592L;
        af.cjnt[116] = 311155731987016569L;
        af.cjnt[117] = -5879156849611237817L;
        af.cjnt[118] = -1464991058688510525L;
        af.cjnt[119] = -3910911480406229120L;
        af.cjnt[120] = -3973153713831484013L;
        af.cjnt[121] = -520695336142222789L;
        af.cjnt[122] = -7447816244343815291L;
        af.cjnt[123] = -4948352966252200794L;
        af.cjnt[124] = 8323109699212797389L;
        af.cjnt[125] = 3404404208348630562L;
        af.cjnt[126] = 1643966384572163437L;
        af.cjnt[127] = 8467491158931236306L;
        af.cjnt[128] = 6562419274968330334L;
        af.cjnt[129] = 1800398915887686206L;
        af.cjnt[130] = -4838367518566505035L;
        af.cjnt[131] = -7049799022955256050L;
        af.cjnt[132] = 4643021191549898058L;
        af.cjnt[133] = -3148826517141006310L;
        af.cjnt[134] = -7498475855144925969L;
        af.cjnt[135] = -4851173015761297758L;
        af.cjnt[136] = -3466204546222964770L;
        af.cjnt[137] = 2313975691880460464L;
        af.cjnt[138] = 240699353379422704L;
        af.cjnt[139] = -171122750170256040L;
        af.cjnt[140] = 6589271425462951815L;
        af.cjnt[141] = -2827822588383250111L;
        af.cjnt[142] = 2651505708838557613L;
        af.cjnt[143] = 4266513522811969379L;
        af.cjnt[144] = -1037467846988914499L;
        af.cjnt[145] = 3753884501037426419L;
        af.cjnt[146] = 3724368870518711620L;
        af.cjnt[147] = 1195327720028915102L;
        af.cjnt[148] = 1623885822710715115L;
    }

    /*
     * Exception decompiling
     */
    public void shutdown() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 24[SWITCH]
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
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void stop() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = af.fy - af.cjnp("cjsc", cjnr(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == af.cjnp("cjsd", cjnm(int ), (int)53)) break;
            v0 /* !! */  = (long)af.cjnp("cjse", cjnm(int ), (int)54);
        }
        var3_1 = af.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = af.fy - af.cjnp("cjsf", cjnr(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == af.cjnp("cjsg", cjnm(int ), (int)55)) break;
            v1 /* !! */  = (long)af.cjnp("cjsh", cjnm(int ), (int)56);
        }
        var2_2 /* !! */  = af.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = af.fy - af.cjnp("cjsi", cjnr(int ), (int)62)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == af.cjnp("cjsj", cjnm(int ), (int)57)) {
                var1_3 = af.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)af.cjnp("cjsk", cjnm(int ), (int)58);
        }
        if (var1_3 || var1_3) return;
        v3 /* !! */  = af.fy;
        block40: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -363677382: {
                    break block40;
                }
                case 1826779465: {
                    v3 /* !! */  = (long)(af.cjnp("cjsm", cjnr(int ), (int)64) - af.cjnp("cjsl", cjnr(int ), (int)63));
                    continue block40;
                }
            }
            break;
        }
        v4 = af.cjnp("cjsn", cjnm(int ), (int)59);
        v5 /* !! */  = af.fy;
        if (true) ** GOTO lbl36
        block41: while (true) {
            v5 /* !! */  = (long)(v6 - af.cjnp("cjso", cjnr(int ), (int)65));
lbl36:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -363677382: {
                    break block41;
                }
                case -121705690: {
                    v6 = af.cjnp("cjsp", cjnr(int ), (int)66);
                    continue block41;
                }
                case 61537160: {
                    v6 = af.cjnp("cjsq", cjnr(int ), (int)67);
                    continue block41;
                }
            }
            break;
        }
        this.running.set((boolean)v4);
        if (var1_3 || var1_3) return;
        v7 /* !! */  = af.fy;
        if (true) ** GOTO lbl51
        block42: while (true) {
            v7 /* !! */  = (long)(v8 - af.cjnp("cjsr", cjnr(int ), (int)68));
lbl51:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -363677382: {
                    break block42;
                }
                case 1219781927: {
                    v8 = af.cjnp("cjss", cjnr(int ), (int)69);
                    continue block42;
                }
                case 1461676965: {
                    v8 = af.cjnp("cjst", cjnr(int ), (int)70);
                    continue block42;
                }
            }
            break;
        }
        if (this.scheduledTask == null) ** GOTO lbl96
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block43: while (true) {
            block62: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return;
                        v9 /* !! */  = af.fy;
                        block44: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case -363677382: {
                                    break block44;
                                }
                                case 548696752: {
                                    v10 = af.cjnp("cjsv", cjnr(int ), (int)72);
                                    ** GOTO lbl78
                                }
                                case 1295400106: {
                                    v10 = af.cjnp("cjsw", cjnr(int ), (int)73);
lbl78:
                                    // 2 sources

                                    v9 /* !! */  = (long)(v10 - af.cjnp("cjsu", cjnr(int ), (int)71));
                                    continue block44;
                                }
                            }
                            break;
                        }
                        v11 = af.cjnp("cjsx", cjnm(int ), (int)60);
                        v12 /* !! */  = af.fy;
                        block45: while (true) {
                            switch ((int)v12 /* !! */ ) {
                                case -363677382: {
                                    break block45;
                                }
                                case 551346403: {
                                    v13 = af.cjnp("cjsz", cjnr(int ), (int)75);
                                    ** GOTO lbl91
                                }
                                case 1882731919: {
                                    v13 = af.cjnp("cjta", cjnr(int ), (int)76);
lbl91:
                                    // 2 sources

                                    v12 /* !! */  = (long)(v13 - af.cjnp("cjsy", cjnr(int ), (int)74));
                                    continue block45;
                                }
                            }
                            break;
                        }
                        this.scheduledTask.cancel((boolean)v11);
                        if (var1_3) return;
lbl96:
                        // 2 sources

                        if (!var1_3 && !var1_3) return;
                        return;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)af.cjnp("cjtd", cjnm(int ), (int)63);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)af.cjnp("cjte", cjnm(int ), (int)64);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 8: {
                        do {
                            var2_2 /* !! */  = (int)af.cjnp("cjtj", cjnm(int ), (int)69);
                        } while (!var3_1);
                        throw null;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)af.cjnp("cjtk", cjnm(int ), (int)70);
                        cfr_temp_0 = 7;
                        if (var3_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)af.cjnp("cjtl", cjnm(int ), (int)71);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)af.cjnp("cjtb", cjnm(int ), (int)61);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)af.cjnp("cjtf", cjnm(int ), (int)65);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)af.cjnp("cjth", cjnm(int ), (int)67);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)af.cjnp("cjtc", cjnm(int ), (int)62);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)af.cjnp("cjtg", cjnm(int ), (int)66);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                ** GOTO lbl151
            }
            do {
                if (true) continue block43;
lbl151:
                // 2 sources

                var2_2 /* !! */  = (int)af.cjnp("cjti", cjnm(int ), (int)68);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void cjzb() {
        af.cjns[0] = 6435090651345784807L;
        af.cjns[1] = -4122188923008220740L;
        af.cjns[2] = -8644255829248415747L;
        af.cjns[3] = 1703739200055292193L;
        af.cjns[4] = -7563530519220953032L;
        af.cjns[5] = -3869201240656164578L;
        af.cjns[6] = -4802693717069175121L;
        af.cjns[7] = -7791595643071900079L;
        af.cjns[8] = -5515802783708477868L;
        af.cjns[9] = -8186480462378045422L;
        af.cjns[10] = -2611488132885899518L;
        af.cjns[11] = -1772419710861153378L;
        af.cjns[12] = -7677174137670609133L;
        af.cjns[13] = 1995770904053407620L;
        af.cjns[14] = -4109482585733510906L;
        af.cjns[15] = -2289701463128259122L;
        af.cjns[16] = -4296545978773410791L;
        af.cjns[17] = 3840892167414082963L;
        af.cjns[18] = 3929927132714230869L;
        af.cjns[19] = -7321881610991902190L;
        af.cjns[20] = -2626279134400140008L;
        af.cjns[21] = 8947394135821078047L;
        af.cjns[22] = -5189549005257702483L;
        af.cjns[23] = -4787033393948501398L;
        af.cjns[24] = 8487167612696329857L;
        af.cjns[25] = -577762363246201230L;
        af.cjns[26] = 4526439638446066596L;
        af.cjns[27] = -3964909994167523945L;
        af.cjns[28] = -2617607475485503435L;
        af.cjns[29] = 5535161874576115583L;
        af.cjns[30] = 4131886789830919885L;
        af.cjns[31] = -9065750880001905365L;
        af.cjns[32] = 3766500791349135970L;
        af.cjns[33] = -3496029010132084038L;
        af.cjns[34] = 8699035577423124843L;
        af.cjns[35] = 116933294623569329L;
        af.cjns[36] = 1486245492890364531L;
        af.cjns[37] = -1574324666507996513L;
        af.cjns[38] = 2061832062304849757L;
        af.cjns[39] = -4834998361605366885L;
        af.cjns[40] = 5360637057559249185L;
        af.cjns[41] = 5406870245603193203L;
        af.cjns[42] = 3688071424211600267L;
        af.cjns[43] = 7702693426678329564L;
        af.cjns[44] = 8278655373965096407L;
        af.cjns[45] = 3088458672027648496L;
        af.cjns[46] = -4506129490735849748L;
        af.cjns[47] = 1437461234600491330L;
        af.cjns[48] = 5034657897709233845L;
        af.cjns[49] = 2363889339108440010L;
        af.cjns[50] = 5039235923159220122L;
        af.cjns[51] = 1391261507134188390L;
        af.cjns[52] = -5793465411294011595L;
        af.cjns[53] = -2024888602589662165L;
        af.cjns[54] = -6557509930984279974L;
        af.cjns[55] = -989580775450635452L;
        af.cjns[56] = -6331973630743745615L;
        af.cjns[57] = -868441772824850889L;
        af.cjns[58] = 5954722836854470938L;
        af.cjns[59] = -6298104920973150114L;
        af.cjns[60] = -5843563819308206626L;
        af.cjns[61] = -9166093187830918318L;
        af.cjns[62] = -5736774178486983863L;
        af.cjns[63] = 4466739005050879127L;
        af.cjns[64] = -3105355633188435515L;
        af.cjns[65] = -2468540298281798258L;
        af.cjns[66] = 3835787436081342889L;
        af.cjns[67] = 1695261396946129859L;
        af.cjns[68] = -4816215462230909456L;
        af.cjns[69] = 482924962197948834L;
        af.cjns[70] = 2493383962704068520L;
        af.cjns[71] = 843712493987488644L;
        af.cjns[72] = -2517106483620475441L;
        af.cjns[73] = 654226157707431822L;
        af.cjns[74] = -7010872626557042061L;
        af.cjns[75] = 4112881495127027913L;
        af.cjns[76] = 6534646361324384704L;
        af.cjns[77] = 1911927596423337356L;
        af.cjns[78] = -1487927722319934406L;
        af.cjns[79] = -6586039387622881904L;
        af.cjns[80] = 2738653723635500340L;
        af.cjns[81] = 3957555162061068964L;
        af.cjns[82] = 4567591402719954372L;
        af.cjns[83] = 3547668569286243290L;
        af.cjns[84] = -774961479269077569L;
        af.cjns[85] = -8221299303253996446L;
        af.cjns[86] = 4659558454330310522L;
        af.cjns[87] = 6113199615675045488L;
        af.cjns[88] = 6635403266765943624L;
        af.cjns[89] = -7632073007274407034L;
        af.cjns[90] = 586178981750940909L;
        af.cjns[91] = -6352065535102816219L;
        af.cjns[92] = 568264290099698413L;
        af.cjns[93] = -2581806867045542011L;
        af.cjns[94] = 5596763424110525554L;
        af.cjns[95] = 5598943859272690287L;
        af.cjns[96] = 8475622744636040704L;
        af.cjns[97] = -1934370609349774116L;
        af.cjns[98] = 4793562007366081852L;
        af.cjns[99] = -3039923860261790576L;
    }
}

