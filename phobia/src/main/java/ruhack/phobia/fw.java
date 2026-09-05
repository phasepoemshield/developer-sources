/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2490
 */
package ruhack.phobia;

import com.adl.nativeprotect.NativeLoader;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2490;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.pr;

public class fw
extends ds {
    private static int[] jjzc;
    private static long[] jjzr;
    public static final long rp = -2095810454896081508L;
    private boolean wasInShulkerScreen;
    public static final boolean c;
    private static long[] jjzq;
    private static int[] jjzd;
    public static final int b;
    private final pr timer;
    private boolean wasOnSlimeBlock;
    private final kf modeSetting;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pr getTimer() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fw.rp - fw.jjze("jkhj", jjzy(int ), (int)95)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fw.jjze("jkhk", jjzb(int ), (int)112)) break;
            v0 /* !! */  = (long)fw.jjze("jkhl", jjzb(int ), (int)113);
        }
        var3_1 = fw.c;
        v1 /* !! */  = fw.rp;
        if (true) ** GOTO lbl12
        block7: while (true) {
            v1 /* !! */  = (long)(v2 - fw.jjze("jkhm", jjzy(int ), (int)96));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1576005780: {
                    v2 = fw.jjze("jkhn", jjzy(int ), (int)97);
                    continue block7;
                }
                case -990444360: {
                    v2 = fw.jjze("jkho", jjzy(int ), (int)98);
                    continue block7;
                }
                case -815888996: {
                    break block7;
                }
                case 1045237475: {
                    v2 = fw.jjze("jkhp", jjzy(int ), (int)99);
                    continue block7;
                }
            }
            break;
        }
        var2_2 = fw.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fw.rp - fw.jjze("jkhq", jjzy(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fw.jjze("jkhr", jjzb(int ), (int)114)) break;
            v3 /* !! */  = (long)fw.jjze("jkhs", jjzb(int ), (int)115);
        }
        var1_3 = fw.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fw.rp - fw.jjze("jkht", jjzy(int ), (int)101)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fw.jjze("jkhu", jjzb(int ), (int)116)) break;
            v4 /* !! */  = (long)fw.jjze("jkhv", jjzb(int ), (int)117);
        }
        return this.timer;
    }

    private static /* synthetic */ int jjzb(int n2) {
        return jjzc[n2] ^ jjzd[n2];
    }

    private static /* synthetic */ void jkic() {
        fw.jjzd[0] = -1665677236;
        fw.jjzd[1] = 606061663;
        fw.jjzd[2] = -1474512696;
        fw.jjzd[3] = -1247997929;
        fw.jjzd[4] = 782765042;
        fw.jjzd[5] = -2001791431;
        fw.jjzd[6] = -1401089432;
        fw.jjzd[7] = -1010229790;
        fw.jjzd[8] = -119310435;
        fw.jjzd[9] = 84620813;
        fw.jjzd[10] = -1918975845;
        fw.jjzd[11] = -1998554333;
        fw.jjzd[12] = -1455523303;
        fw.jjzd[13] = 0xE0B00BE;
        fw.jjzd[14] = -2032490810;
        fw.jjzd[15] = -206350763;
        fw.jjzd[16] = -169092960;
        fw.jjzd[17] = -1474565647;
        fw.jjzd[18] = 266870971;
        fw.jjzd[19] = -1636392680;
        fw.jjzd[20] = 1360114052;
        fw.jjzd[21] = 1919720120;
        fw.jjzd[22] = 747663451;
        fw.jjzd[23] = 1403917003;
        fw.jjzd[24] = 370221296;
        fw.jjzd[25] = 1283574785;
        fw.jjzd[26] = 1245252967;
        fw.jjzd[27] = -1280303093;
        fw.jjzd[28] = -1249633250;
        fw.jjzd[29] = -1547864823;
        fw.jjzd[30] = -1820298673;
        fw.jjzd[31] = -1152242613;
        fw.jjzd[32] = -434827350;
        fw.jjzd[33] = -746586408;
        fw.jjzd[34] = -1352940919;
        fw.jjzd[35] = 1966560502;
        fw.jjzd[36] = -1786805098;
        fw.jjzd[37] = 1578742657;
        fw.jjzd[38] = 1036728332;
        fw.jjzd[39] = -2000361378;
        fw.jjzd[40] = -299221446;
        fw.jjzd[41] = 501236244;
        fw.jjzd[42] = -1502811415;
        fw.jjzd[43] = 678913495;
        fw.jjzd[44] = 1441553341;
        fw.jjzd[45] = -1984666648;
        fw.jjzd[46] = -1797028556;
        fw.jjzd[47] = 954930120;
        fw.jjzd[48] = 1730710960;
        fw.jjzd[49] = 989992614;
        fw.jjzd[50] = -1954710975;
        fw.jjzd[51] = 631836408;
        fw.jjzd[52] = -1165824616;
        fw.jjzd[53] = -1834129015;
        fw.jjzd[54] = 658109384;
        fw.jjzd[55] = 291987844;
        fw.jjzd[56] = 1007827398;
        fw.jjzd[57] = -985327549;
        fw.jjzd[58] = 589671878;
        fw.jjzd[59] = 542210800;
        fw.jjzd[60] = -225645091;
        fw.jjzd[61] = 1055691569;
        fw.jjzd[62] = -833672032;
        fw.jjzd[63] = 987207038;
        fw.jjzd[64] = -2012160111;
        fw.jjzd[65] = -1277045040;
        fw.jjzd[66] = -1958366834;
        fw.jjzd[67] = 1786682563;
        fw.jjzd[68] = -2143198287;
        fw.jjzd[69] = -666581394;
        fw.jjzd[70] = -513240778;
        fw.jjzd[71] = -766387004;
        fw.jjzd[72] = -635335140;
        fw.jjzd[73] = 1772016378;
        fw.jjzd[74] = 1801862610;
        fw.jjzd[75] = 68866555;
        fw.jjzd[76] = 2089812171;
        fw.jjzd[77] = -1960825976;
        fw.jjzd[78] = -2081100385;
        fw.jjzd[79] = 620364705;
        fw.jjzd[80] = -1032074509;
        fw.jjzd[81] = 1264246828;
        fw.jjzd[82] = -483304133;
        fw.jjzd[83] = 647780864;
        fw.jjzd[84] = -1122782696;
        fw.jjzd[85] = -553597199;
        fw.jjzd[86] = -393972377;
        fw.jjzd[87] = -2109947588;
        fw.jjzd[88] = -934702789;
        fw.jjzd[89] = 782509222;
        fw.jjzd[90] = -1551301569;
        fw.jjzd[91] = 71547710;
        fw.jjzd[92] = -1639433683;
        fw.jjzd[93] = -1769353475;
        fw.jjzd[94] = 2073649826;
        fw.jjzd[95] = 770025130;
        fw.jjzd[96] = -580113167;
        fw.jjzd[97] = -46099201;
        fw.jjzd[98] = -167435353;
        fw.jjzd[99] = 899147006;
    }

    private native boolean isNearShulkerBox();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isOnSlimeBlock() {
        v0 /* !! */  = fw.rp;
        if (true) ** GOTO lbl5
        block49: while (true) {
            v0 /* !! */  = (long)(v1 - fw.jjze("jkdw", jjzy(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -815888996: {
                    break block49;
                }
                case -768243303: {
                    v1 = fw.jjze("jkdx", jjzy(int ), (int)46);
                    continue block49;
                }
                case -678332786: {
                    v1 = fw.jjze("jkdy", jjzy(int ), (int)47);
                    continue block49;
                }
                case -354162672: {
                    v1 = fw.jjze("jkdz", jjzy(int ), (int)48);
                    continue block49;
                }
            }
            break;
        }
        var5_1 = fw.c;
        v2 /* !! */  = fw.rp;
        if (true) ** GOTO lbl22
        block50: while (true) {
            v2 /* !! */  = (long)(fw.jjze("jkeb", jjzy(int ), (int)50) - fw.jjze("jkea", jjzy(int ), (int)49));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -815888996: {
                    break block50;
                }
                case -591789223: {
                    continue block50;
                }
            }
            break;
        }
        var4_2 /* !! */  = fw.b;
        v3 /* !! */  = fw.rp;
        if (true) ** GOTO lbl32
        block51: while (true) {
            v3 /* !! */  = (long)(v4 - fw.jjze("jkec", jjzy(int ), (int)51));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2051567214: {
                    v4 = fw.jjze("jked", jjzy(int ), (int)52);
                    continue block51;
                }
                case -815888996: {
                    break block51;
                }
                case -655142428: {
                    v4 = fw.jjze("jkee", jjzy(int ), (int)53);
                    continue block51;
                }
                case 392973093: {
                    v4 = fw.jjze("jkef", jjzy(int ), (int)54);
                    continue block51;
                }
            }
            break;
        }
        var3_3 = fw.a;
        if (var5_1) {
            throw null;
lbl47:
            // 3 sources

            return (boolean)fw.jjze("jkeg", jjzb(int ), (int)71);
        }
        if (var3_3 || var3_3) ** GOTO lbl47
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = fw.rp;
                if (true) ** GOTO lbl57
                block53: while (true) {
                    v5 /* !! */  = (long)(fw.jjze("jkei", jjzy(int ), (int)56) - fw.jjze("jkeh", jjzy(int ), (int)55));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -815888996: {
                            break block53;
                        }
                        case 1994652457: {
                            continue block53;
                        }
                    }
                    break;
                }
                v6 /* !! */  = fw.rp;
                if (true) ** GOTO lbl66
                block54: while (true) {
                    v6 /* !! */  = (long)(v7 - fw.jjze("jkej", jjzy(int ), (int)57));
lbl66:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -815888996: {
                            break block54;
                        }
                        case -585777499: {
                            v7 = fw.jjze("jkek", jjzy(int ), (int)58);
                            continue block54;
                        }
                        case 750753081: {
                            v7 = fw.jjze("jkel", jjzy(int ), (int)59);
                            continue block54;
                        }
                        case 1903143823: {
                            v7 = fw.jjze("jkem", jjzy(int ), (int)60);
                            continue block54;
                        }
                    }
                    break;
                }
                v8 = fw.mc.field_1724;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_0 = fw.rp - fw.jjze("jken", jjzy(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fw.jjze("jkeo", jjzb(int ), (int)72)) break;
                    v9 /* !! */  = (long)fw.jjze("jkep", jjzb(int ), (int)73);
                }
                var1_4 = v8.method_24515();
                if (var3_3 || var3_3) ** GOTO lbl47
                v10 /* !! */  = fw.rp;
                if (true) ** GOTO lbl90
                block56: while (true) {
                    v10 /* !! */  = (long)(fw.jjze("jker", jjzy(int ), (int)63) - fw.jjze("jkeq", jjzy(int ), (int)62));
lbl90:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -815888996: {
                            break block56;
                        }
                        case -574608886: {
                            continue block56;
                        }
                    }
                    break;
                }
                var2_5 = var1_4.method_10074();
                if (var3_3 || var3_3) ** continue;
                v11 /* !! */  = fw.rp;
                if (true) ** GOTO lbl101
                block57: while (true) {
                    v11 /* !! */  = (long)(v12 - fw.jjze("jkes", jjzy(int ), (int)64));
lbl101:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -815888996: {
                            break block57;
                        }
                        case 310596196: {
                            v12 = fw.jjze("jket", jjzy(int ), (int)65);
                            continue block57;
                        }
                        case 906884415: {
                            v12 = fw.jjze("jkeu", jjzy(int ), (int)66);
                            continue block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_1 = fw.rp - fw.jjze("jkev", jjzy(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fw.jjze("jkew", jjzb(int ), (int)74)) break;
                    v13 /* !! */  = (long)fw.jjze("jkex", jjzb(int ), (int)75);
                }
                v14 = fw.mc.field_1687;
                v15 /* !! */  = fw.rp;
                if (true) ** GOTO lbl120
                block59: while (true) {
                    v15 /* !! */  = (long)(fw.jjze("jkez", jjzy(int ), (int)69) - fw.jjze("jkey", jjzy(int ), (int)68));
lbl120:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -815888996: {
                            break block59;
                        }
                        case 564440733: {
                            continue block59;
                        }
                    }
                    break;
                }
                v16 = v14.method_8320(var2_5);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_2 = fw.rp - fw.jjze("jkfa", jjzy(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fw.jjze("jkfb", jjzb(int ), (int)76)) break;
                    v17 /* !! */  = (long)fw.jjze("jkfc", jjzb(int ), (int)77);
                }
                return v16.method_26204() instanceof class_2490;
            }
lbl132:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)fw.jjze("jkfd", jjzb(int ), (int)78);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl137:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)fw.jjze("jkfe", jjzb(int ), (int)79);
                if (!var5_1) ** GOTO lbl132
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)fw.jjze("jkff", jjzb(int ), (int)80);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl146:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fw.jjze("jkfg", jjzb(int ), (int)81);
                    if (!var5_1) break block16;
                    throw null;
                }
            }
lbl151:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)fw.jjze("jkfh", jjzb(int ), (int)82);
                if (var5_1) {
                    throw null;
                }
            }
            case 5: {
                var4_2 /* !! */  = (int)fw.jjze("jkfi", jjzb(int ), (int)83);
                if (!var5_1) ** GOTO lbl137
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)fw.jjze("jkfj", jjzb(int ), (int)84);
                if (!var5_1) break;
                throw null;
            }
            case 7: 
        }
        var4_2 /* !! */  = (int)fw.jjze("jkfk", jjzb(int ), (int)85);
        ** while (!var5_1)
lbl166:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jkid() {
        fw.jjzd[100] = 974471800;
        fw.jjzd[101] = -305797807;
        fw.jjzd[102] = 609232822;
        fw.jjzd[103] = -929922471;
        fw.jjzd[104] = 1969109761;
        fw.jjzd[105] = 528982459;
        fw.jjzd[106] = 1196900646;
        fw.jjzd[107] = 859356081;
        fw.jjzd[108] = 787453774;
        fw.jjzd[109] = -801973635;
        fw.jjzd[110] = 1658484098;
        fw.jjzd[111] = -1875217586;
        fw.jjzd[112] = 305660022;
        fw.jjzd[113] = 440663313;
        fw.jjzd[114] = 1899493183;
        fw.jjzd[115] = 1297191013;
        fw.jjzd[116] = -1365629453;
        fw.jjzd[117] = 531118027;
        fw.jjzd[118] = -1535402442;
        fw.jjzd[119] = 1449738411;
        fw.jjzd[120] = -347786960;
        fw.jjzd[121] = 1529160743;
    }

    private static /* synthetic */ double jjzp(int n2) {
        return Double.longBitsToDouble(jjzq[n2] ^ jjzr[n2]);
    }

    private static /* synthetic */ void jkie() {
        fw.jjzq[0] = -3041053345418496934L;
        fw.jjzq[1] = -5304502140161685478L;
        fw.jjzq[2] = 3253034897081929507L;
        fw.jjzq[3] = 8564835697710652500L;
        fw.jjzq[4] = 7177166452061903380L;
        fw.jjzq[5] = 2338805970104987284L;
        fw.jjzq[6] = -4656618027833431702L;
        fw.jjzq[7] = 5275577033384796168L;
        fw.jjzq[8] = 4583463439025954941L;
        fw.jjzq[9] = -4085862673958334659L;
        fw.jjzq[10] = -473275929059638298L;
        fw.jjzq[11] = -5046617623848802978L;
        fw.jjzq[12] = 1442663726755016389L;
        fw.jjzq[13] = 1852490205189137096L;
        fw.jjzq[14] = 8422946324500718491L;
        fw.jjzq[15] = 7207654985795938678L;
        fw.jjzq[16] = -8475144246800598053L;
        fw.jjzq[17] = 5579317854059816803L;
        fw.jjzq[18] = 27532580984992723L;
        fw.jjzq[19] = 6247957216474336117L;
        fw.jjzq[20] = 3518145008058148925L;
        fw.jjzq[21] = -3594358644439323722L;
        fw.jjzq[22] = 1646299171385721115L;
        fw.jjzq[23] = 5550283941480057002L;
        fw.jjzq[24] = 7170059516791486025L;
        fw.jjzq[25] = -5750525841868370539L;
        fw.jjzq[26] = 4886444962288718462L;
        fw.jjzq[27] = 6245606348914509042L;
        fw.jjzq[28] = 8802844743084348526L;
        fw.jjzq[29] = 6286950435765994150L;
        fw.jjzq[30] = -4117294369412948347L;
        fw.jjzq[31] = -3293368285628519905L;
        fw.jjzq[32] = 4327827441902818471L;
        fw.jjzq[33] = -8008425889885912647L;
        fw.jjzq[34] = -4435543626472627043L;
        fw.jjzq[35] = -3510882125982720626L;
        fw.jjzq[36] = 7872627198999769559L;
        fw.jjzq[37] = -7030563265030150354L;
        fw.jjzq[38] = -3493411432538963296L;
        fw.jjzq[39] = 8156252053057605507L;
        fw.jjzq[40] = 1670599420024716361L;
        fw.jjzq[41] = -3441647100334107051L;
        fw.jjzq[42] = 7343085938756112963L;
        fw.jjzq[43] = -5066178309126906727L;
        fw.jjzq[44] = 6716408656093374096L;
        fw.jjzq[45] = -1460866965170917507L;
        fw.jjzq[46] = 2622968857700075696L;
        fw.jjzq[47] = 5991783687216416278L;
        fw.jjzq[48] = -625418879150381214L;
        fw.jjzq[49] = 7235489842155435647L;
        fw.jjzq[50] = -8038785537673076774L;
        fw.jjzq[51] = -8314824302288981892L;
        fw.jjzq[52] = 7851046034375392500L;
        fw.jjzq[53] = 6830290053071876665L;
        fw.jjzq[54] = 5554785451953927040L;
        fw.jjzq[55] = -5329370620224051386L;
        fw.jjzq[56] = 7944960492119495114L;
        fw.jjzq[57] = -4330914072388510684L;
        fw.jjzq[58] = -1810666541044291335L;
        fw.jjzq[59] = -782921928418057224L;
        fw.jjzq[60] = -4495051591351409215L;
        fw.jjzq[61] = 4725430456036953778L;
        fw.jjzq[62] = -7555926555209838876L;
        fw.jjzq[63] = 679398966344367418L;
        fw.jjzq[64] = 5803770103045056899L;
        fw.jjzq[65] = -3485189476798107512L;
        fw.jjzq[66] = -5173482397185141024L;
        fw.jjzq[67] = 4790937461907497513L;
        fw.jjzq[68] = 5402088795939132103L;
        fw.jjzq[69] = -830022983306500407L;
        fw.jjzq[70] = 2398969172740092332L;
        fw.jjzq[71] = -8251375418555877095L;
        fw.jjzq[72] = 3910271337779879200L;
        fw.jjzq[73] = 8675171251475365315L;
        fw.jjzq[74] = 4622015518828554677L;
        fw.jjzq[75] = 1409637053268620901L;
        fw.jjzq[76] = 8026207137769140583L;
        fw.jjzq[77] = -2320643798150405483L;
        fw.jjzq[78] = -8866391734158308204L;
        fw.jjzq[79] = -6493427497803219663L;
        fw.jjzq[80] = -7601333778747378485L;
        fw.jjzq[81] = 849901812764711386L;
        fw.jjzq[82] = 7102779094259866424L;
        fw.jjzq[83] = -7258962450565554144L;
        fw.jjzq[84] = -6832388978197316818L;
        fw.jjzq[85] = -3468650814822297943L;
        fw.jjzq[86] = 8460483615016023467L;
        fw.jjzq[87] = 2902004197231708931L;
        fw.jjzq[88] = 6520372441107478858L;
        fw.jjzq[89] = -6112719902638710915L;
        fw.jjzq[90] = -2526650532020186055L;
        fw.jjzq[91] = 742824520461915332L;
        fw.jjzq[92] = -3018529275992558379L;
        fw.jjzq[93] = 4393680595764736150L;
        fw.jjzq[94] = 61248429726847410L;
        fw.jjzq[95] = -7005621507799219084L;
        fw.jjzq[96] = -1507588252853100835L;
        fw.jjzq[97] = 9157514955077312677L;
        fw.jjzq[98] = 7442792594341766425L;
        fw.jjzq[99] = 7311464253187760962L;
    }

    private static /* synthetic */ void jkif() {
        fw.jjzq[100] = 7270605606922588400L;
        fw.jjzq[101] = 2992543194449264690L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isWasOnSlimeBlock() {
        boolean bl2;
        Object object = rp;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - fw.jjze("jkgs", jjzy(int ), (int)89);
            }
            switch ((int)object) {
                case -815888996: {
                    break block5;
                }
                case 551118602: {
                    callSite = fw.jjze("jkgt", jjzy(int ), (int)90);
                    continue block5;
                }
                case 1032026489: {
                    callSite = fw.jjze("jkgu", jjzy(int ), (int)91);
                    continue block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = rp - fw.jjze("jkgv", jjzy(int ), (int)92)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == fw.jjze("jkgw", jjzb(int ), (int)101)) break;
            object2 = fw.jjze("jkgx", jjzb(int ), (int)102);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = rp - fw.jjze("jkgy", jjzy(int ), (int)93)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == fw.jjze("jkgz", jjzb(int ), (int)103)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = fw.jjze("jkha", jjzb(int ), (int)104);
        }
        if (bl2) return (boolean)fw.jjze("jkhb", jjzb(int ), (int)105);
        if (bl2) return (boolean)fw.jjze("jkhb", jjzb(int ), (int)105);
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = rp - fw.jjze("jkhc", jjzy(int ), (int)94)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == fw.jjze("jkhd", jjzb(int ), (int)106)) {
                return this.wasOnSlimeBlock;
            }
            object4 = fw.jjze("jkhe", jjzb(int ), (int)107);
        }
    }

    static {
        NativeLoader.ensureNativeClassInitialized("nativo4ka", "ruhack/phobia/fw", fw.class);
        jjzc = new int[122];
        jjzd = new int[122];
        fw.jkia();
        fw.jkib();
        fw.jkic();
        fw.jkid();
        jjzq = new long[102];
        jjzr = new long[102];
        fw.jkie();
        fw.jkif();
        fw.jkig();
        fw.jkih();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getModeSetting() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fw.rp - fw.jjze("jkfl", jjzy(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fw.jjze("jkfm", jjzb(int ), (int)86)) break;
            v0 /* !! */  = (long)fw.jjze("jkfn", jjzb(int ), (int)87);
        }
        var3_1 = fw.c;
        v1 /* !! */  = fw.rp;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - fw.jjze("jkfo", jjzy(int ), (int)72));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1721974546: {
                    v2 = fw.jjze("jkfp", jjzy(int ), (int)73);
                    continue block17;
                }
                case -1013596403: {
                    v2 = fw.jjze("jkfq", jjzy(int ), (int)74);
                    continue block17;
                }
                case -875949657: {
                    v2 = fw.jjze("jkfr", jjzy(int ), (int)75);
                    continue block17;
                }
                case -815888996: {
                    break block17;
                }
            }
            break;
        }
        var2_2 = fw.b;
        v3 /* !! */  = fw.rp;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - fw.jjze("jkfs", jjzy(int ), (int)76));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1199826095: {
                    v4 = fw.jjze("jkft", jjzy(int ), (int)77);
                    continue block18;
                }
                case -815888996: {
                    break block18;
                }
                case 160371148: {
                    v4 = fw.jjze("jkfu", jjzy(int ), (int)78);
                    continue block18;
                }
                case 1313768437: {
                    v4 = fw.jjze("jkfv", jjzy(int ), (int)79);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = fw.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        v5 /* !! */  = fw.rp;
        if (true) ** GOTO lbl51
        block20: while (true) {
            v5 /* !! */  = (long)(fw.jjze("jkfx", jjzy(int ), (int)81) - fw.jjze("jkfw", jjzy(int ), (int)80));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -815888996: {
                    break block20;
                }
                case 926723413: {
                    continue block20;
                }
            }
            break;
        }
        return this.modeSetting;
    }

    private static /* synthetic */ void jkib() {
        fw.jjzc[100] = 974471802;
        fw.jjzc[101] = 305797806;
        fw.jjzc[102] = 86359364;
        fw.jjzc[103] = 929922470;
        fw.jjzc[104] = -463457011;
        fw.jjzc[105] = 528982459;
        fw.jjzc[106] = 1196900647;
        fw.jjzc[107] = -1002644581;
        fw.jjzc[108] = 787453775;
        fw.jjzc[109] = -801973635;
        fw.jjzc[110] = 1658484096;
        fw.jjzc[111] = -1875217585;
        fw.jjzc[112] = -305660023;
        fw.jjzc[113] = 891310520;
        fw.jjzc[114] = -1899493184;
        fw.jjzc[115] = -299648941;
        fw.jjzc[116] = -1365629454;
        fw.jjzc[117] = 944764489;
        fw.jjzc[118] = -1535402443;
        fw.jjzc[119] = 1449738408;
        fw.jjzc[120] = -347786960;
        fw.jjzc[121] = 1529160741;
    }

    private static /* synthetic */ void jkih() {
        fw.jjzr[100] = -7498016745129916232L;
        fw.jjzr[101] = -9073871355975134322L;
    }

    private native void handleBoatMode();

    private static /* synthetic */ void jkia() {
        fw.jjzc[0] = -1665677236;
        fw.jjzc[1] = 606061663;
        fw.jjzc[2] = -1474512691;
        fw.jjzc[3] = -1247997931;
        fw.jjzc[4] = 782765044;
        fw.jjzc[5] = -2001791426;
        fw.jjzc[6] = -1401089425;
        fw.jjzc[7] = -1010229789;
        fw.jjzc[8] = -119310435;
        fw.jjzc[9] = 84620813;
        fw.jjzc[10] = -1292327171;
        fw.jjzc[11] = -1998554334;
        fw.jjzc[12] = -1455523303;
        fw.jjzc[13] = -235602111;
        fw.jjzc[14] = -1299901023;
        fw.jjzc[15] = -206350764;
        fw.jjzc[16] = -1237046275;
        fw.jjzc[17] = 1474565646;
        fw.jjzc[18] = 837501896;
        fw.jjzc[19] = -1636392679;
        fw.jjzc[20] = -1360114053;
        fw.jjzc[21] = -2032020062;
        fw.jjzc[22] = 747663450;
        fw.jjzc[23] = 1634371263;
        fw.jjzc[24] = -370221297;
        fw.jjzc[25] = -899526221;
        fw.jjzc[26] = -1245252968;
        fw.jjzc[27] = 541000583;
        fw.jjzc[28] = 1249633249;
        fw.jjzc[29] = -1355278960;
        fw.jjzc[30] = 1820298672;
        fw.jjzc[31] = -1434483655;
        fw.jjzc[32] = 434827349;
        fw.jjzc[33] = -1681404401;
        fw.jjzc[34] = 1352940918;
        fw.jjzc[35] = -1679096355;
        fw.jjzc[36] = -1786805098;
        fw.jjzc[37] = 1578742657;
        fw.jjzc[38] = 1036728335;
        fw.jjzc[39] = -2000361396;
        fw.jjzc[40] = -299221463;
        fw.jjzc[41] = 501236244;
        fw.jjzc[42] = -1502811417;
        fw.jjzc[43] = 678913487;
        fw.jjzc[44] = 1441553324;
        fw.jjzc[45] = -1984666646;
        fw.jjzc[46] = -1797028569;
        fw.jjzc[47] = 954930136;
        fw.jjzc[48] = 1730710968;
        fw.jjzc[49] = 989992629;
        fw.jjzc[50] = -1954710958;
        fw.jjzc[51] = 631836396;
        fw.jjzc[52] = -1165824613;
        fw.jjzc[53] = -1834129019;
        fw.jjzc[54] = 658109378;
        fw.jjzc[55] = 291987861;
        fw.jjzc[56] = 1007827415;
        fw.jjzc[57] = -985327550;
        fw.jjzc[58] = 589671889;
        fw.jjzc[59] = 542210808;
        fw.jjzc[60] = -225645102;
        fw.jjzc[61] = 1055691579;
        fw.jjzc[62] = -833672030;
        fw.jjzc[63] = -987207039;
        fw.jjzc[64] = -2012160112;
        fw.jjzc[65] = 1277045039;
        fw.jjzc[66] = -1958366833;
        fw.jjzc[67] = -1786682564;
        fw.jjzc[68] = -2143198288;
        fw.jjzc[69] = -666581393;
        fw.jjzc[70] = -513240778;
        fw.jjzc[71] = -766387004;
        fw.jjzc[72] = 635335139;
        fw.jjzc[73] = -743755024;
        fw.jjzc[74] = 1801862611;
        fw.jjzc[75] = 546652916;
        fw.jjzc[76] = -2089812172;
        fw.jjzc[77] = -1495772680;
        fw.jjzc[78] = -2081100388;
        fw.jjzc[79] = 620364704;
        fw.jjzc[80] = -1032074505;
        fw.jjzc[81] = 1264246831;
        fw.jjzc[82] = -483304136;
        fw.jjzc[83] = 647780867;
        fw.jjzc[84] = -1122782691;
        fw.jjzc[85] = -553597195;
        fw.jjzc[86] = 393972376;
        fw.jjzc[87] = 277532677;
        fw.jjzc[88] = -934702791;
        fw.jjzc[89] = 782509220;
        fw.jjzc[90] = -1551301569;
        fw.jjzc[91] = 71547709;
        fw.jjzc[92] = 1639433682;
        fw.jjzc[93] = 1477238392;
        fw.jjzc[94] = -2073649827;
        fw.jjzc[95] = 1795786670;
        fw.jjzc[96] = -580113168;
        fw.jjzc[97] = -46099202;
        fw.jjzc[98] = -167435356;
        fw.jjzc[99] = 899147006;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isWasInShulkerScreen() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fw.rp - fw.jjze("jkgc", jjzy(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fw.jjze("jkgd", jjzb(int ), (int)92)) break;
            v0 /* !! */  = (long)fw.jjze("jkge", jjzb(int ), (int)93);
        }
        var3_1 = fw.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fw.rp - fw.jjze("jkgf", jjzy(int ), (int)83)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fw.jjze("jkgg", jjzb(int ), (int)94)) break;
            v1 /* !! */  = (long)fw.jjze("jkgh", jjzb(int ), (int)95);
        }
        var2_2 /* !! */  = fw.b;
        v2 /* !! */  = fw.rp;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(fw.jjze("jkgj", jjzy(int ), (int)85) - fw.jjze("jkgi", jjzy(int ), (int)84));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -815888996: {
                    break block17;
                }
                case 920153173: {
                    continue block17;
                }
            }
            break;
        }
        var1_3 = fw.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)fw.jjze("jkgk", jjzb(int ), (int)96);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = fw.rp;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - fw.jjze("jkgl", jjzy(int ), (int)86));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -815888996: {
                            break block19;
                        }
                        case 643302332: {
                            v4 = fw.jjze("jkgm", jjzy(int ), (int)87);
                            continue block19;
                        }
                        case 1788315011: {
                            v4 = fw.jjze("jkgn", jjzy(int ), (int)88);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.wasInShulkerScreen;
            }
            case 0: {
                var2_2 /* !! */  = (int)fw.jjze("jkgo", jjzb(int ), (int)97);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
            }
lbl52:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fw.jjze("jkgp", jjzb(int ), (int)98);
                if (!var3_1) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fw.jjze("jkgq", jjzb(int ), (int)99);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fw.jjze("jkgr", jjzb(int ), (int)100);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void jkig() {
        fw.jjzr[0] = -1572343833593027146L;
        fw.jjzr[1] = -8526396866154719582L;
        fw.jjzr[2] = -83409001772398080L;
        fw.jjzr[3] = -7538872168200869619L;
        fw.jjzr[4] = -3984184463325078253L;
        fw.jjzr[5] = 6216866478277964375L;
        fw.jjzr[6] = 7804710360452941602L;
        fw.jjzr[7] = -5322075911018499184L;
        fw.jjzr[8] = 1577699046605334532L;
        fw.jjzr[9] = 5575121381782369174L;
        fw.jjzr[10] = 178867518385276852L;
        fw.jjzr[11] = 8796044360704668195L;
        fw.jjzr[12] = -1018836802942601834L;
        fw.jjzr[13] = 8761080901260646023L;
        fw.jjzr[14] = 3008268294501190040L;
        fw.jjzr[15] = 8111523457697283744L;
        fw.jjzr[16] = 1370202577982154110L;
        fw.jjzr[17] = -5868596419586653279L;
        fw.jjzr[18] = -7884009676776068936L;
        fw.jjzr[19] = 3030778968945667447L;
        fw.jjzr[20] = -3063128066806607486L;
        fw.jjzr[21] = -437146234519663528L;
        fw.jjzr[22] = 3781254021317573101L;
        fw.jjzr[23] = 783218662419897626L;
        fw.jjzr[24] = 4975483706066592604L;
        fw.jjzr[25] = -90040736539235618L;
        fw.jjzr[26] = 8727196514028376439L;
        fw.jjzr[27] = -7064762522793588074L;
        fw.jjzr[28] = 5981580081111295797L;
        fw.jjzr[29] = 4435716070753086950L;
        fw.jjzr[30] = -1684917118891129495L;
        fw.jjzr[31] = -1315610296520625275L;
        fw.jjzr[32] = 2774902870380329650L;
        fw.jjzr[33] = -4783360909827418137L;
        fw.jjzr[34] = 6688491725244115800L;
        fw.jjzr[35] = -5723025670793655853L;
        fw.jjzr[36] = -6378857488573959314L;
        fw.jjzr[37] = -1853553251728537886L;
        fw.jjzr[38] = -2840224387639376329L;
        fw.jjzr[39] = -2868268224051626032L;
        fw.jjzr[40] = -2174424554073674429L;
        fw.jjzr[41] = 24694625154890416L;
        fw.jjzr[42] = -8448122792165250021L;
        fw.jjzr[43] = 5212364649645575449L;
        fw.jjzr[44] = -1487762198224985742L;
        fw.jjzr[45] = -7516673296579674266L;
        fw.jjzr[46] = -3319999393825632105L;
        fw.jjzr[47] = -2297567485800093252L;
        fw.jjzr[48] = -6740111819965649880L;
        fw.jjzr[49] = 1606082469448245602L;
        fw.jjzr[50] = -8828356491257909952L;
        fw.jjzr[51] = -1356964523083031891L;
        fw.jjzr[52] = -4433487734880325192L;
        fw.jjzr[53] = 7228660589261015522L;
        fw.jjzr[54] = -2140105608010495538L;
        fw.jjzr[55] = -175625318975235007L;
        fw.jjzr[56] = -4789841758572321095L;
        fw.jjzr[57] = 5683329472871780113L;
        fw.jjzr[58] = -7820675677617996979L;
        fw.jjzr[59] = -684016054912298252L;
        fw.jjzr[60] = 8559391181328696372L;
        fw.jjzr[61] = 5341436573257825931L;
        fw.jjzr[62] = 6495422517185527057L;
        fw.jjzr[63] = 1886594605610646871L;
        fw.jjzr[64] = -7655788730413648685L;
        fw.jjzr[65] = -1673854340803990841L;
        fw.jjzr[66] = 701045818245505247L;
        fw.jjzr[67] = -8316577612629760166L;
        fw.jjzr[68] = -1950304443073278008L;
        fw.jjzr[69] = -6926887451324085543L;
        fw.jjzr[70] = 6891197559333169864L;
        fw.jjzr[71] = -8370746952213251316L;
        fw.jjzr[72] = 1293649267820107704L;
        fw.jjzr[73] = -4173787971594902493L;
        fw.jjzr[74] = -3716933074444735401L;
        fw.jjzr[75] = -4037164011312219105L;
        fw.jjzr[76] = -7125727241227842187L;
        fw.jjzr[77] = 9018424023132854272L;
        fw.jjzr[78] = -1083078089960182301L;
        fw.jjzr[79] = -2229635610919809248L;
        fw.jjzr[80] = 3834682887296905747L;
        fw.jjzr[81] = -5789495959738796325L;
        fw.jjzr[82] = 1196198440418107459L;
        fw.jjzr[83] = 7490452415865963178L;
        fw.jjzr[84] = -7350440552623571704L;
        fw.jjzr[85] = 684995075415388964L;
        fw.jjzr[86] = 5223354832447161151L;
        fw.jjzr[87] = -6500295923711914480L;
        fw.jjzr[88] = 4345180038558794318L;
        fw.jjzr[89] = -8577935348973067869L;
        fw.jjzr[90] = 6230203432087463997L;
        fw.jjzr[91] = 3536926265787541827L;
        fw.jjzr[92] = -6581340954902430798L;
        fw.jjzr[93] = 5784838967169982921L;
        fw.jjzr[94] = -3837377123562624124L;
        fw.jjzr[95] = -510666177384319600L;
        fw.jjzr[96] = 6678615496784981664L;
        fw.jjzr[97] = 7824614339664869119L;
        fw.jjzr[98] = -1199913447537304226L;
        fw.jjzr[99] = -3804633158231068673L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fw() {
        var2_1 /* !! */  = fw.b;
        super("HighJump", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0432\u044b\u0441\u043e\u0442\u0443 \u043f\u0440\u044b\u0436\u043a\u0430", du.MOVEMENT);
        this.modeSetting = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0420\u0435\u0436\u0438\u043c \u043f\u0440\u044b\u0436\u043a\u0430", "Boat", new String[]{"Boat", "Shulker Screen", "Slime Boost", "FunTime Soul Sand"});
        this.wasInShulkerScreen = fw.jjze("jjzf", jjzb(int ), (int)0);
        this.wasOnSlimeBlock = fw.jjze("jjzg", jjzb(int ), (int)1);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.timer = new pr();
                this.settings(new jx[]{this.modeSetting});
                return;
            }
lbl12:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)fw.jjze("jjzh", jjzb(int ), (int)2);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)fw.jjze("jjzi", jjzb(int ), (int)3);
                break;
            }
lbl18:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fw.jjze("jjzj", jjzb(int ), (int)4);
                ** GOTO lbl30
            }
            case 3: {
                var2_1 /* !! */  = (int)fw.jjze("jjzk", jjzb(int ), (int)5);
                ** GOTO lbl12
            }
            case 4: {
                var2_1 /* !! */  = (int)fw.jjze("jjzl", jjzb(int ), (int)6);
                ** GOTO lbl18
            }
            case 5: {
                var2_1 /* !! */  = (int)fw.jjze("jjzm", jjzb(int ), (int)7);
                break;
            }
lbl30:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fw.jjze("jjzn", jjzb(int ), (int)8);
                    ** GOTO lbl12
                    break;
                }
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)fw.jjze("jjzo", jjzb(int ), (int)9);
        ** while (true)
    }

    public static /* synthetic */ CallSite jjze(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleSlimeBoost() {
        block131: {
            block130: {
                v0 /* !! */  = fw.rp;
                if (true) ** GOTO lbl5
                block80: while (true) {
                    v0 /* !! */  = (long)(v1 - fw.jjze("jjzz", jjzy(int ), (int)2));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -815888996: {
                            break block80;
                        }
                        case -311723798: {
                            v1 = fw.jjze("jkaa", jjzy(int ), (int)3);
                            continue block80;
                        }
                        case 531106960: {
                            v1 = fw.jjze("jkab", jjzy(int ), (int)4);
                            continue block80;
                        }
                    }
                    break;
                }
                var3_1 = fw.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = fw.rp - fw.jjze("jkac", jjzy(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == fw.jjze("jkad", jjzb(int ), (int)13)) break;
                    v2 /* !! */  = (long)fw.jjze("jkae", jjzb(int ), (int)14);
                }
                var2_2 /* !! */  = fw.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fw.rp - fw.jjze("jkaf", jjzy(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fw.jjze("jkag", jjzb(int ), (int)15)) break;
                    v3 /* !! */  = (long)fw.jjze("jkah", jjzb(int ), (int)16);
                }
                var1_3 = fw.a;
                if (var3_1) {
                    throw null;
lbl29:
                    // 15 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl29
                v4 /* !! */  = fw.rp;
                if (true) ** GOTO lbl36
                block84: while (true) {
                    v4 /* !! */  = (long)(fw.jjze("jkaj", jjzy(int ), (int)8) - fw.jjze("jkai", jjzy(int ), (int)7));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -815888996: {
                            break block84;
                        }
                        case 1053630261: {
                            continue block84;
                        }
                    }
                    break;
                }
                v5 /* !! */  = fw.rp;
                if (true) ** GOTO lbl45
                block85: while (true) {
                    v5 /* !! */  = (long)(fw.jjze("jkal", jjzy(int ), (int)10) - fw.jjze("jkak", jjzy(int ), (int)9));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -815888996: {
                            break block85;
                        }
                        case 750074091: {
                            continue block85;
                        }
                    }
                    break;
                }
                v6 = fw.mc.field_1724;
                v7 /* !! */  = fw.rp;
                if (true) ** GOTO lbl55
                block86: while (true) {
                    v7 /* !! */  = (long)(fw.jjze("jkan", jjzy(int ), (int)12) - fw.jjze("jkam", jjzy(int ), (int)11));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1786778816: {
                            continue block86;
                        }
                        case -815888996: {
                            break block86;
                        }
                    }
                    break;
                }
                if (!v6.method_24828()) break block130;
                if (var1_3) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fw.rp - fw.jjze("jkao", jjzy(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fw.jjze("jkap", jjzb(int ), (int)17)) break;
                    v8 /* !! */  = (long)fw.jjze("jkaq", jjzb(int ), (int)18);
                }
                if (!this.isOnSlimeBlock()) break block130;
                if (var1_3 || var1_3) ** GOTO lbl29
                v9 = fw.jjze("jkar", jjzb(int ), (int)19);
                v10 /* !! */  = fw.rp;
                if (true) ** GOTO lbl74
                block88: while (true) {
                    v10 /* !! */  = (long)(v11 - fw.jjze("jkas", jjzy(int ), (int)14));
lbl74:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -815888996: {
                            break block88;
                        }
                        case 551181344: {
                            v11 = fw.jjze("jkat", jjzy(int ), (int)15);
                            continue block88;
                        }
                        case 1311389369: {
                            v11 = fw.jjze("jkau", jjzy(int ), (int)16);
                            continue block88;
                        }
                    }
                    break;
                }
                this.wasOnSlimeBlock = v9;
                if (var1_3) ** GOTO lbl29
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
            if (var1_3 || var1_3) ** GOTO lbl29
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = fw.rp - fw.jjze("jkav", jjzy(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == fw.jjze("jkaw", jjzb(int ), (int)20)) break;
                v12 /* !! */  = (long)fw.jjze("jkax", jjzb(int ), (int)21);
            }
            if (!this.wasOnSlimeBlock) break block131;
            if (var1_3) ** GOTO lbl29
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = fw.rp - fw.jjze("jkay", jjzy(int ), (int)18)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == fw.jjze("jkaz", jjzb(int ), (int)22)) break;
                v13 /* !! */  = (long)fw.jjze("jkba", jjzb(int ), (int)23);
            }
            v14 /* !! */  = fw.rp;
            if (true) ** GOTO lbl106
            block91: while (true) {
                v14 /* !! */  = (long)(fw.jjze("jkbc", jjzy(int ), (int)20) - fw.jjze("jkbb", jjzy(int ), (int)19));
lbl106:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -990781803: {
                        continue block91;
                    }
                    case -815888996: {
                        break block91;
                    }
                }
                break;
            }
            v15 = fw.mc.field_1724;
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = fw.rp - fw.jjze("jkbd", jjzy(int ), (int)21)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == fw.jjze("jkbe", jjzb(int ), (int)24)) break;
                v16 /* !! */  = (long)fw.jjze("jkbf", jjzb(int ), (int)25);
            }
            if (v15.method_24828()) break block131;
            if (var1_3) ** GOTO lbl29
            v17 /* !! */  = fw.rp;
            if (true) ** GOTO lbl123
            block93: while (true) {
                v17 /* !! */  = (long)(v18 - fw.jjze("jkbg", jjzy(int ), (int)22));
lbl123:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -2067348139: {
                        v18 = fw.jjze("jkbh", jjzy(int ), (int)23);
                        continue block93;
                    }
                    case -975178691: {
                        v18 = fw.jjze("jkbi", jjzy(int ), (int)24);
                        continue block93;
                    }
                    case -815888996: {
                        break block93;
                    }
                }
                break;
            }
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_6 = fw.rp - fw.jjze("jkbj", jjzy(int ), (int)25)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == fw.jjze("jkbk", jjzb(int ), (int)26)) break;
                v19 /* !! */  = (long)fw.jjze("jkbl", jjzb(int ), (int)27);
            }
            v20 = fw.mc.field_1724;
            v21 /* !! */  = fw.rp;
            if (true) ** GOTO lbl142
            block95: while (true) {
                v21 /* !! */  = (long)(fw.jjze("jkbn", jjzy(int ), (int)27) - fw.jjze("jkbm", jjzy(int ), (int)26));
lbl142:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -815888996: {
                        break block95;
                    }
                    case 884856469: {
                        continue block95;
                    }
                }
                break;
            }
            v22 = v20.method_18798();
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_7 = fw.rp - fw.jjze("jkbo", jjzy(int ), (int)28)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == fw.jjze("jkbp", jjzb(int ), (int)28)) break;
                v23 /* !! */  = (long)fw.jjze("jkbq", jjzb(int ), (int)29);
            }
            if (!(v22.method_10214() > 0.0)) break block131;
            if (var1_3 || var1_3) ** GOTO lbl29
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_8 = fw.rp - fw.jjze("jkbr", jjzy(int ), (int)29)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == fw.jjze("jkbs", jjzb(int ), (int)30)) break;
                v24 /* !! */  = (long)fw.jjze("jkbt", jjzb(int ), (int)31);
            }
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_9 = fw.rp - fw.jjze("jkbu", jjzy(int ), (int)30)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == fw.jjze("jkbv", jjzb(int ), (int)32)) break;
                v25 /* !! */  = (long)fw.jjze("jkbw", jjzb(int ), (int)33);
            }
            v26 = fw.mc.field_1724;
            v27 = fw.jjze("jkbx", jjzp(int ), (int)31);
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_10 = fw.rp - fw.jjze("jkby", jjzy(int ), (int)32)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == fw.jjze("jkbz", jjzb(int ), (int)34)) break;
                v28 /* !! */  = (long)fw.jjze("jkca", jjzb(int ), (int)35);
            }
            v26.method_5762(0.0, (double)v27, 0.0);
            if (var1_3 || var1_3) ** GOTO lbl29
            v29 = fw.jjze("jkcb", jjzb(int ), (int)36);
            v30 /* !! */  = fw.rp;
            if (true) ** GOTO lbl179
            block100: while (true) {
                v30 /* !! */  = (long)(v31 - fw.jjze("jkcc", jjzy(int ), (int)33));
lbl179:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -1791169700: {
                        v31 = fw.jjze("jkcd", jjzy(int ), (int)34);
                        continue block100;
                    }
                    case -815888996: {
                        break block100;
                    }
                    case -795372150: {
                        v31 = fw.jjze("jkce", jjzy(int ), (int)35);
                        continue block100;
                    }
                    case 1870744650: {
                        v31 = fw.jjze("jkcf", jjzy(int ), (int)36);
                        continue block100;
                    }
                }
                break;
            }
            this.wasOnSlimeBlock = v29;
            if (var1_3) ** GOTO lbl29
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl239
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v32 /* !! */  = fw.rp;
        if (true) ** GOTO lbl202
        block101: while (true) {
            v32 /* !! */  = (long)(v33 - fw.jjze("jkcg", jjzy(int ), (int)37));
lbl202:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -815888996: {
                    break block101;
                }
                case 229817329: {
                    v33 = fw.jjze("jkch", jjzy(int ), (int)38);
                    continue block101;
                }
                case 328095992: {
                    v33 = fw.jjze("jkci", jjzy(int ), (int)39);
                    continue block101;
                }
                case 1775530752: {
                    v33 = fw.jjze("jkcj", jjzy(int ), (int)40);
                    continue block101;
                }
            }
            break;
        }
        if (this.isOnSlimeBlock()) ** GOTO lbl239
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v34 = fw.jjze("jkck", jjzb(int ), (int)37);
                v35 /* !! */  = fw.rp;
                if (true) ** GOTO lbl225
                block102: while (true) {
                    v35 /* !! */  = (long)(v36 - fw.jjze("jkcl", jjzy(int ), (int)41));
lbl225:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -815888996: {
                            break block102;
                        }
                        case 591922385: {
                            v36 = fw.jjze("jkcm", jjzy(int ), (int)42);
                            continue block102;
                        }
                        case 614624322: {
                            v36 = fw.jjze("jkcn", jjzy(int ), (int)43);
                            continue block102;
                        }
                        case 1550785653: {
                            v36 = fw.jjze("jkco", jjzy(int ), (int)44);
                            continue block102;
                        }
                    }
                    break;
                }
                this.wasOnSlimeBlock = v34;
                if (var1_3) ** GOTO lbl29
lbl239:
                // 4 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl242:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fw.jjze("jkcp", jjzb(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl247:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fw.jjze("jkcq", jjzb(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)fw.jjze("jkcr", jjzb(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
lbl257:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fw.jjze("jkcs", jjzb(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl262:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)fw.jjze("jkct", jjzb(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)fw.jjze("jkcu", jjzb(int ), (int)43);
                } while (!var3_1);
                throw null;
            }
lbl272:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)fw.jjze("jkcv", jjzb(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl277:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fw.jjze("jkcw", jjzb(int ), (int)45);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl314
                    break;
                }
            }
lbl283:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)fw.jjze("jkcx", jjzb(int ), (int)46);
                if (!var3_1) ** GOTO lbl247
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)fw.jjze("jkcy", jjzb(int ), (int)47);
                if (!var3_1) ** GOTO lbl283
                throw null;
            }
lbl291:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)fw.jjze("jkcz", jjzb(int ), (int)48);
                if (!var3_1) ** GOTO lbl272
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)fw.jjze("jkda", jjzb(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 12: {
                var2_2 /* !! */  = (int)fw.jjze("jkdb", jjzb(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
            }
lbl304:
            // 4 sources

            case 13: {
                do {
                    var2_2 /* !! */  = (int)fw.jjze("jkdc", jjzb(int ), (int)51);
                } while (!var3_1);
                throw null;
            }
lbl309:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)fw.jjze("jkdd", jjzb(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl314:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)fw.jjze("jkde", jjzb(int ), (int)53);
                if (!var3_1) ** GOTO lbl262
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)fw.jjze("jkdf", jjzb(int ), (int)54);
                if (!var3_1) ** GOTO lbl304
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)fw.jjze("jkdg", jjzb(int ), (int)55);
                if (!var3_1) ** GOTO lbl272
                throw null;
            }
lbl326:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)fw.jjze("jkdh", jjzb(int ), (int)56);
                if (!var3_1) ** GOTO lbl257
                throw null;
            }
lbl330:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)fw.jjze("jkdi", jjzb(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 20: {
                var2_2 /* !! */  = (int)fw.jjze("jkdj", jjzb(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 21: {
                var2_2 /* !! */  = (int)fw.jjze("jkdk", jjzb(int ), (int)59);
                if (!var3_1) ** GOTO lbl314
                throw null;
            }
lbl344:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)fw.jjze("jkdl", jjzb(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
            }
lbl348:
            // 4 sources

            case 23: {
                var2_2 /* !! */  = (int)fw.jjze("jkdm", jjzb(int ), (int)61);
                if (!var3_1) ** GOTO lbl242
                throw null;
            }
            case 24: 
        }
        var2_2 /* !! */  = (int)fw.jjze("jkdn", jjzb(int ), (int)62);
        ** while (!var3_1)
lbl355:
        // 1 sources

        throw null;
    }

    private native void handleShulkerScreen();

    private static /* synthetic */ float jjzt(int n2) {
        return Float.intBitsToFloat(jjzc[n2] ^ jjzd[n2]);
    }

    @aw
    private native void tickEvent(df var1);

    private static /* synthetic */ long jjzy(int n2) {
        return jjzq[n2] ^ jjzr[n2];
    }

    private static int __adl_guard_a135c1cd74e08325() {
        return 1649885064;
    }
}

