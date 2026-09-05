/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1922
 *  net.minecraft.class_2199
 *  net.minecraft.class_2238
 *  net.minecraft.class_2248
 *  net.minecraft.class_2260
 *  net.minecraft.class_2304
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2363
 *  net.minecraft.class_2374
 *  net.minecraft.class_2401
 *  net.minecraft.class_2406
 *  net.minecraft.class_243
 *  net.minecraft.class_2480
 *  net.minecraft.class_3711
 *  net.minecraft.class_3713
 *  net.minecraft.class_3715
 *  net.minecraft.class_3718
 *  net.minecraft.class_3726
 *  net.minecraft.class_3922
 *  net.minecraft.class_3965
 *  net.minecraft.class_4739
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2199;
import net.minecraft.class_2238;
import net.minecraft.class_2248;
import net.minecraft.class_2260;
import net.minecraft.class_2304;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2363;
import net.minecraft.class_2374;
import net.minecraft.class_2401;
import net.minecraft.class_2406;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_3711;
import net.minecraft.class_3713;
import net.minecraft.class_3715;
import net.minecraft.class_3718;
import net.minecraft.class_3726;
import net.minecraft.class_3922;
import net.minecraft.class_3965;
import net.minecraft.class_4739;
import ruhack.phobia.d;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.nj;

public final class fe
extends ds {
    public static final boolean a;
    private static long[] inbt;
    private static int[] inbn;
    private static long[] inbu;
    private static final Class<?>[] INTERACTABLE_BLOCKS;
    public static final int b;
    public static final long py = -1376736617363296817L;
    private static int[] inbm;
    public static final boolean c;

    private static /* synthetic */ void inky() {
        fe.inbm[0] = -1672602714;
        fe.inbm[1] = -70052452;
        fe.inbm[2] = -1252037114;
        fe.inbm[3] = 98295002;
        fe.inbm[4] = 1943211437;
        fe.inbm[5] = 338291580;
        fe.inbm[6] = 257889894;
        fe.inbm[7] = 1267020144;
        fe.inbm[8] = 352297871;
        fe.inbm[9] = -575155219;
        fe.inbm[10] = 782307177;
        fe.inbm[11] = -118048401;
        fe.inbm[12] = -100839296;
        fe.inbm[13] = -1189676847;
        fe.inbm[14] = -500501575;
        fe.inbm[15] = 1705680881;
        fe.inbm[16] = -446208460;
        fe.inbm[17] = 1690563654;
        fe.inbm[18] = 1137301770;
        fe.inbm[19] = -1935492967;
        fe.inbm[20] = 1346773796;
        fe.inbm[21] = -835672543;
        fe.inbm[22] = 2089924903;
        fe.inbm[23] = 241519765;
        fe.inbm[24] = 668763582;
        fe.inbm[25] = -1040514138;
        fe.inbm[26] = 1276099409;
        fe.inbm[27] = 573883073;
        fe.inbm[28] = -180623945;
        fe.inbm[29] = 591324349;
        fe.inbm[30] = -638280769;
        fe.inbm[31] = -527357924;
        fe.inbm[32] = 1221922277;
        fe.inbm[33] = 969083555;
        fe.inbm[34] = 1786000330;
        fe.inbm[35] = -863652822;
        fe.inbm[36] = -5835343;
        fe.inbm[37] = -1451444687;
        fe.inbm[38] = -1123763556;
        fe.inbm[39] = 1017974624;
        fe.inbm[40] = -1024864417;
        fe.inbm[41] = 1511345509;
        fe.inbm[42] = 989546837;
        fe.inbm[43] = 1378952314;
        fe.inbm[44] = -760841891;
        fe.inbm[45] = -630039690;
        fe.inbm[46] = -186097984;
        fe.inbm[47] = 1155780653;
        fe.inbm[48] = 736121433;
        fe.inbm[49] = -824334846;
        fe.inbm[50] = -789150256;
        fe.inbm[51] = -349749649;
        fe.inbm[52] = -693790850;
        fe.inbm[53] = 595478770;
        fe.inbm[54] = -2068598378;
        fe.inbm[55] = 1082451487;
        fe.inbm[56] = -2005413906;
        fe.inbm[57] = -626799884;
        fe.inbm[58] = -1953107717;
        fe.inbm[59] = -1758069698;
        fe.inbm[60] = -67799070;
        fe.inbm[61] = 2075992982;
        fe.inbm[62] = -397972889;
        fe.inbm[63] = -1360801945;
        fe.inbm[64] = 467066268;
        fe.inbm[65] = 602165670;
        fe.inbm[66] = -1413653714;
        fe.inbm[67] = 306442726;
        fe.inbm[68] = 197200066;
        fe.inbm[69] = 972704177;
        fe.inbm[70] = 0x50055599;
        fe.inbm[71] = -315732861;
        fe.inbm[72] = -1088273413;
        fe.inbm[73] = 376301443;
        fe.inbm[74] = 118297870;
        fe.inbm[75] = -1566374994;
        fe.inbm[76] = 470349911;
        fe.inbm[77] = 1503548511;
        fe.inbm[78] = -2054205836;
        fe.inbm[79] = -1164235228;
        fe.inbm[80] = -1253316695;
        fe.inbm[81] = 1604046506;
        fe.inbm[82] = -1820151872;
        fe.inbm[83] = -1444993880;
        fe.inbm[84] = -1135572402;
        fe.inbm[85] = 866737608;
        fe.inbm[86] = 2015507583;
        fe.inbm[87] = 1654723575;
        fe.inbm[88] = -1981720952;
        fe.inbm[89] = -1642503533;
        fe.inbm[90] = 2135944358;
        fe.inbm[91] = -1618716726;
        fe.inbm[92] = -608401148;
        fe.inbm[93] = -4733034;
        fe.inbm[94] = 1008088760;
        fe.inbm[95] = -1574150395;
        fe.inbm[96] = 1943510841;
        fe.inbm[97] = -954034365;
        fe.inbm[98] = 1106085284;
        fe.inbm[99] = 1520051501;
    }

    private static /* synthetic */ void inlc() {
        fe.inbt[0] = 9112697070715708565L;
        fe.inbt[1] = 6630071034674987484L;
        fe.inbt[2] = 1380467873182330142L;
        fe.inbt[3] = -2877056759429712124L;
        fe.inbt[4] = -263820651126237051L;
        fe.inbt[5] = 8488827147254309536L;
        fe.inbt[6] = -541702229721576417L;
        fe.inbt[7] = -3696946202820657015L;
        fe.inbt[8] = 1564693509086581871L;
        fe.inbt[9] = 7602097336110644706L;
        fe.inbt[10] = 2885706942554916741L;
        fe.inbt[11] = -6005979754520914297L;
        fe.inbt[12] = 4166518533189883573L;
        fe.inbt[13] = 4515914727067832829L;
        fe.inbt[14] = 481223796077823303L;
        fe.inbt[15] = -4142250520914279735L;
        fe.inbt[16] = 6636108037710476365L;
        fe.inbt[17] = -1744405811465892220L;
        fe.inbt[18] = -6176953278419158770L;
        fe.inbt[19] = -4728226527984479831L;
        fe.inbt[20] = 4535039371220928706L;
        fe.inbt[21] = 7034304257950057637L;
        fe.inbt[22] = -2854645057900056321L;
        fe.inbt[23] = -3338155060227957116L;
        fe.inbt[24] = 6886894548075543712L;
        fe.inbt[25] = -7759293089775467404L;
        fe.inbt[26] = -3711446322251350917L;
        fe.inbt[27] = -7898808025953431811L;
        fe.inbt[28] = 9208514354324545247L;
        fe.inbt[29] = -2616329875382485220L;
        fe.inbt[30] = 5845187396641788442L;
        fe.inbt[31] = 3824784314443892361L;
        fe.inbt[32] = 3308486577381622124L;
        fe.inbt[33] = -2406723661284689312L;
        fe.inbt[34] = -4326200585712089487L;
        fe.inbt[35] = -5305610469603442374L;
        fe.inbt[36] = 1038467713325483631L;
        fe.inbt[37] = 8278467263244688217L;
        fe.inbt[38] = -3809846747773567572L;
        fe.inbt[39] = 5240181193565467618L;
        fe.inbt[40] = -3495409486608201905L;
        fe.inbt[41] = -5030873891591544022L;
        fe.inbt[42] = 729069563376297341L;
        fe.inbt[43] = 1716970951164053070L;
        fe.inbt[44] = -2043068767087997503L;
        fe.inbt[45] = 2499845696104419869L;
        fe.inbt[46] = -4165040613863372003L;
        fe.inbt[47] = 9091901473528662178L;
        fe.inbt[48] = -3353048347617789252L;
        fe.inbt[49] = -7368560900039462870L;
        fe.inbt[50] = -3668953866060551621L;
        fe.inbt[51] = -5948960086042868169L;
        fe.inbt[52] = 4115130752591081178L;
        fe.inbt[53] = -2225823882693136864L;
        fe.inbt[54] = 2151280813243565697L;
        fe.inbt[55] = -524707710633688995L;
        fe.inbt[56] = -6247354247912625174L;
        fe.inbt[57] = 493180858133516709L;
        fe.inbt[58] = -72143992702266706L;
        fe.inbt[59] = -7967934455547225975L;
        fe.inbt[60] = 3694276701144081188L;
        fe.inbt[61] = -6001780372577064948L;
        fe.inbt[62] = 5804535828584360356L;
        fe.inbt[63] = 8733211680708638126L;
        fe.inbt[64] = -276728187277110378L;
        fe.inbt[65] = -6326204499854869615L;
        fe.inbt[66] = -8953984233548554454L;
        fe.inbt[67] = 4718630744878647938L;
        fe.inbt[68] = -3736123334962090904L;
        fe.inbt[69] = 67497574847788044L;
        fe.inbt[70] = 5221366236634353945L;
        fe.inbt[71] = -1036931032818957917L;
        fe.inbt[72] = -4698979214363293206L;
        fe.inbt[73] = 4635395495802894613L;
        fe.inbt[74] = -998472797059572025L;
        fe.inbt[75] = 3133569555822505589L;
        fe.inbt[76] = 5679765775415247824L;
        fe.inbt[77] = 747998149107001120L;
        fe.inbt[78] = -1363817583898771105L;
        fe.inbt[79] = 7004076579324170102L;
        fe.inbt[80] = 6284866437676050046L;
        fe.inbt[81] = 7066874910465200307L;
        fe.inbt[82] = -2477413512999894240L;
        fe.inbt[83] = 7398409172623379649L;
        fe.inbt[84] = -6086880792360172623L;
        fe.inbt[85] = 5728534940003448513L;
        fe.inbt[86] = -9037530503310682791L;
        fe.inbt[87] = -7253094797137306242L;
        fe.inbt[88] = 3279527991513308505L;
        fe.inbt[89] = -7586041391998622954L;
        fe.inbt[90] = 8914121092589735577L;
        fe.inbt[91] = 6106655924877728524L;
        fe.inbt[92] = 5732756739363952097L;
        fe.inbt[93] = -8618704329689224813L;
        fe.inbt[94] = -6454058864468358027L;
        fe.inbt[95] = -1644196323701851099L;
        fe.inbt[96] = 8188553998816014805L;
        fe.inbt[97] = -6182366843664427403L;
        fe.inbt[98] = 5313124092152232752L;
        fe.inbt[99] = -2125114481144672215L;
    }

    public static /* synthetic */ CallSite inbo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static fe getInstance() {
        v0 /* !! */  = fe.py;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - fe.inbo("inbv", inbs(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -383236335: {
                    v1 = fe.inbo("inbw", inbs(int ), (int)1);
                    continue block31;
                }
                case 486523784: {
                    v1 = fe.inbo("inbx", inbs(int ), (int)2);
                    continue block31;
                }
                case 1019850191: {
                    break block31;
                }
                case 1066477253: {
                    v1 = fe.inbo("inby", inbs(int ), (int)3);
                    continue block31;
                }
            }
            break;
        }
        var2 = fe.c;
        v2 /* !! */  = fe.py;
        if (true) ** GOTO lbl22
        block32: while (true) {
            v2 /* !! */  = (long)(fe.inbo("inca", inbs(int ), (int)5) - fe.inbo("inbz", inbs(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1019850191: {
                    break block32;
                }
                case 1136008993: {
                    continue block32;
                }
            }
            break;
        }
        var1_1 /* !! */  = fe.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = fe.py - fe.inbo("incb", inbs(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fe.inbo("incc", inbl(int ), (int)3)) break;
            v3 /* !! */  = (long)fe.inbo("incd", inbl(int ), (int)4);
        }
        var0_2 = fe.a;
        if (var2) {
            throw null;
lbl37:
            // 3 sources

            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl37
                v4 /* !! */  = fe.py;
                if (true) ** GOTO lbl47
                block35: while (true) {
                    v4 /* !! */  = (long)(fe.inbo("incf", inbs(int ), (int)8) - fe.inbo("ince", inbs(int ), (int)7));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1082012740: {
                            continue block35;
                        }
                        case 1019850191: {
                            break block35;
                        }
                    }
                    break;
                }
                if (d.getInstance() != null) ** GOTO lbl55
                if (var0_2 || var0_2) ** GOTO lbl37
                return null;
lbl55:
                // 1 sources

                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = fe.py;
                if (true) ** GOTO lbl60
                block36: while (true) {
                    v5 /* !! */  = (long)(v6 - fe.inbo("incg", inbs(int ), (int)9));
lbl60:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1916341392: {
                            v6 = fe.inbo("inch", inbs(int ), (int)10);
                            continue block36;
                        }
                        case 736117822: {
                            v6 = fe.inbo("inci", inbs(int ), (int)11);
                            continue block36;
                        }
                        case 1019850191: {
                            break block36;
                        }
                        case 2003783931: {
                            v6 = fe.inbo("incj", inbs(int ), (int)12);
                            continue block36;
                        }
                    }
                    break;
                }
                return nj.get(fe.class);
            }
lbl73:
            // 3 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)fe.inbo("inck", inbl(int ), (int)5);
                } while (!var2);
                throw null;
            }
lbl78:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)fe.inbo("incl", inbl(int ), (int)6);
                if (var2) {
                    throw null;
                }
            }
lbl82:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)fe.inbo("incm", inbl(int ), (int)7);
                if (!var2) ** GOTO lbl73
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)fe.inbo("incn", inbl(int ), (int)8);
                if (!var2) break;
                throw null;
            }
lbl90:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)fe.inbo("inco", inbl(int ), (int)9);
                    if (!var2) ** GOTO lbl82
                    throw null;
                }
            }
            case 5: {
                var1_1 /* !! */  = (int)fe.inbo("incp", inbl(int ), (int)10);
                if (!var2) ** GOTO lbl73
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)fe.inbo("incq", inbl(int ), (int)11);
                if (!var2) ** GOTO lbl90
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)fe.inbo("incr", inbl(int ), (int)12);
                if (!var2) ** GOTO lbl78
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)fe.inbo("incs", inbl(int ), (int)13);
        ** while (!var2)
lbl110:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int inbl(int n2) {
        return inbm[n2] ^ inbn[n2];
    }

    private static /* synthetic */ void inla() {
        fe.inbn[0] = -1672602716;
        fe.inbn[1] = -70052450;
        fe.inbn[2] = -1252037114;
        fe.inbn[3] = -98295003;
        fe.inbn[4] = 1528145624;
        fe.inbn[5] = 338291581;
        fe.inbn[6] = 257889891;
        fe.inbn[7] = 1267020145;
        fe.inbn[8] = 352297863;
        fe.inbn[9] = -575155220;
        fe.inbn[10] = 782307180;
        fe.inbn[11] = -118048407;
        fe.inbn[12] = -100839288;
        fe.inbn[13] = -1189676848;
        fe.inbn[14] = 500501574;
        fe.inbn[15] = -240222199;
        fe.inbn[16] = -446208459;
        fe.inbn[17] = 857878556;
        fe.inbn[18] = 1137301771;
        fe.inbn[19] = -1935492968;
        fe.inbn[20] = 1260846658;
        fe.inbn[21] = -835672543;
        fe.inbn[22] = 2089924903;
        fe.inbn[23] = 241519764;
        fe.inbn[24] = 668763580;
        fe.inbn[25] = -1040514134;
        fe.inbn[26] = 1276099394;
        fe.inbn[27] = 573883073;
        fe.inbn[28] = -180623950;
        fe.inbn[29] = 591324347;
        fe.inbn[30] = -638280783;
        fe.inbn[31] = -527357925;
        fe.inbn[32] = 1221922280;
        fe.inbn[33] = 969083562;
        fe.inbn[34] = 1786000329;
        fe.inbn[35] = -863652808;
        fe.inbn[36] = -5835343;
        fe.inbn[37] = -1451444678;
        fe.inbn[38] = -1123763572;
        fe.inbn[39] = 1017974627;
        fe.inbn[40] = -1024864422;
        fe.inbn[41] = 1511345505;
        fe.inbn[42] = 989546832;
        fe.inbn[43] = 1378952298;
        fe.inbn[44] = 760841890;
        fe.inbn[45] = -350897227;
        fe.inbn[46] = 186097983;
        fe.inbn[47] = -1110168863;
        fe.inbn[48] = -736121434;
        fe.inbn[49] = 1884141828;
        fe.inbn[50] = 789150255;
        fe.inbn[51] = 2073117355;
        fe.inbn[52] = 693790849;
        fe.inbn[53] = -2006338614;
        fe.inbn[54] = 2068598377;
        fe.inbn[55] = -1873550845;
        fe.inbn[56] = 2005413905;
        fe.inbn[57] = 1004710604;
        fe.inbn[58] = 1953107716;
        fe.inbn[59] = -915331752;
        fe.inbn[60] = 67799069;
        fe.inbn[61] = -548917357;
        fe.inbn[62] = 397972888;
        fe.inbn[63] = 1573538034;
        fe.inbn[64] = 467066269;
        fe.inbn[65] = 975101319;
        fe.inbn[66] = 1413653713;
        fe.inbn[67] = 1630160808;
        fe.inbn[68] = 197200067;
        fe.inbn[69] = 985886877;
        fe.inbn[70] = 1342526866;
        fe.inbn[71] = -315732851;
        fe.inbn[72] = -1088273431;
        fe.inbn[73] = 376301451;
        fe.inbn[74] = 118297863;
        fe.inbn[75] = -1566374995;
        fe.inbn[76] = 470349919;
        fe.inbn[77] = 1503548508;
        fe.inbn[78] = -2054205832;
        fe.inbn[79] = -1164235231;
        fe.inbn[80] = -1253316679;
        fe.inbn[81] = 1604046511;
        fe.inbn[82] = -1820151869;
        fe.inbn[83] = -1444993888;
        fe.inbn[84] = -1135572409;
        fe.inbn[85] = 866737607;
        fe.inbn[86] = 2015507580;
        fe.inbn[87] = 1654723578;
        fe.inbn[88] = -1981720934;
        fe.inbn[89] = 1642503532;
        fe.inbn[90] = -542999225;
        fe.inbn[91] = 1618716725;
        fe.inbn[92] = -198173462;
        fe.inbn[93] = 4733033;
        fe.inbn[94] = 1125986925;
        fe.inbn[95] = -1574150396;
        fe.inbn[96] = -541406838;
        fe.inbn[97] = -954034366;
        fe.inbn[98] = -1845284466;
        fe.inbn[99] = 1520051500;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_3965 raycastInteractable() {
        block116: {
            block115: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fe.py - fe.inbo("inee", inbs(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fe.inbo("inef", inbl(int ), (int)44)) break;
                    v0 /* !! */  = (long)fe.inbo("ineg", inbl(int ), (int)45);
                }
                var7_1 = fe.c;
                v1 /* !! */  = fe.py;
                if (true) ** GOTO lbl11
                block75: while (true) {
                    v1 /* !! */  = (long)(v2 - fe.inbo("ineh", inbs(int ), (int)21));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -932726517: {
                            v2 = fe.inbo("inei", inbs(int ), (int)22);
                            continue block75;
                        }
                        case 1019850191: {
                            break block75;
                        }
                        case 1510876982: {
                            v2 = fe.inbo("inej", inbs(int ), (int)23);
                            continue block75;
                        }
                        case 1762639724: {
                            v2 = fe.inbo("inek", inbs(int ), (int)24);
                            continue block75;
                        }
                    }
                    break;
                }
                var6_2 /* !! */  = fe.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fe.py - fe.inbo("inel", inbs(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fe.inbo("inem", inbl(int ), (int)46)) break;
                    v3 /* !! */  = (long)fe.inbo("inen", inbl(int ), (int)47);
                }
                var5_3 = fe.a;
                if (var7_1) {
                    throw null;
lbl32:
                    // 10 sources

                    return null;
                }
                if (var5_3 || var5_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fe.py - fe.inbo("ineo", inbs(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fe.inbo("inep", inbl(int ), (int)48)) break;
                    v4 /* !! */  = (long)fe.inbo("ineq", inbl(int ), (int)49);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fe.py - fe.inbo("iner", inbs(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fe.inbo("ines", inbl(int ), (int)50)) break;
                    v5 /* !! */  = (long)fe.inbo("inet", inbl(int ), (int)51);
                }
                if (fe.mc.field_1724 == null) break block115;
                if (var5_3) ** GOTO lbl32
                v6 /* !! */  = fe.py;
                if (true) ** GOTO lbl51
                block80: while (true) {
                    v6 /* !! */  = (long)(fe.inbo("inev", inbs(int ), (int)29) - fe.inbo("ineu", inbs(int ), (int)28));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 406346760: {
                            continue block80;
                        }
                        case 1019850191: {
                            break block80;
                        }
                    }
                    break;
                }
                v7 /* !! */  = fe.py;
                if (true) ** GOTO lbl60
                block81: while (true) {
                    v7 /* !! */  = (long)(v8 - fe.inbo("inew", inbs(int ), (int)30));
lbl60:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2035935030: {
                            v8 = fe.inbo("inex", inbs(int ), (int)31);
                            continue block81;
                        }
                        case -167796801: {
                            v8 = fe.inbo("iney", inbs(int ), (int)32);
                            continue block81;
                        }
                        case 1019850191: {
                            break block81;
                        }
                    }
                    break;
                }
                if (fe.mc.field_1687 != null) break block116;
                if (var5_3) ** GOTO lbl32
            }
            if (var5_3 || var5_3) ** GOTO lbl32
            return null;
        }
        if (var5_3) ** GOTO lbl32
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) ** GOTO lbl32
                v9 /* !! */  = fe.py;
                if (true) ** GOTO lbl84
                block82: while (true) {
                    v9 /* !! */  = (long)(v10 - fe.inbo("inez", inbs(int ), (int)33));
lbl84:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1019850191: {
                            break block82;
                        }
                        case 1392495497: {
                            v10 = fe.inbo("infa", inbs(int ), (int)34);
                            continue block82;
                        }
                        case 2095351751: {
                            v10 = fe.inbo("infb", inbs(int ), (int)35);
                            continue block82;
                        }
                    }
                    break;
                }
                v11 /* !! */  = fe.py;
                if (true) ** GOTO lbl97
                block83: while (true) {
                    v11 /* !! */  = (long)(v12 - fe.inbo("infc", inbs(int ), (int)36));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1665415547: {
                            v12 = fe.inbo("infd", inbs(int ), (int)37);
                            continue block83;
                        }
                        case 972651364: {
                            v12 = fe.inbo("infe", inbs(int ), (int)38);
                            continue block83;
                        }
                        case 1019850191: {
                            break block83;
                        }
                        case 1055697431: {
                            v12 = fe.inbo("inff", inbs(int ), (int)39);
                            continue block83;
                        }
                    }
                    break;
                }
                v13 = fe.mc.field_1724;
                v14 /* !! */  = fe.py;
                if (true) ** GOTO lbl114
                block84: while (true) {
                    v14 /* !! */  = (long)(fe.inbo("infh", inbs(int ), (int)41) - fe.inbo("infg", inbs(int ), (int)40));
lbl114:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1865167849: {
                            continue block84;
                        }
                        case 1019850191: {
                            break block84;
                        }
                    }
                    break;
                }
                var1_4 = v13.method_33571();
                if (var5_3 || var5_3) ** GOTO lbl32
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = fe.py - fe.inbo("infi", inbs(int ), (int)42)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fe.inbo("infj", inbl(int ), (int)52)) break;
                    v15 /* !! */  = (long)fe.inbo("infk", inbl(int ), (int)53);
                }
                v16 /* !! */  = fe.py;
                if (true) ** GOTO lbl130
                block86: while (true) {
                    v16 /* !! */  = (long)(v17 - fe.inbo("infl", inbs(int ), (int)43));
lbl130:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1165517497: {
                            v17 = fe.inbo("infm", inbs(int ), (int)44);
                            continue block86;
                        }
                        case 1019850191: {
                            break block86;
                        }
                        case 1325213180: {
                            v17 = fe.inbo("infn", inbs(int ), (int)45);
                            continue block86;
                        }
                    }
                    break;
                }
                v18 = fe.mc.field_1724;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = fe.py - fe.inbo("info", inbs(int ), (int)46)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fe.inbo("infp", inbl(int ), (int)54)) break;
                    v19 /* !! */  = (long)fe.inbo("infq", inbl(int ), (int)55);
                }
                var2_5 = v18.method_5828(1.0f);
                if (var5_3 || var5_3) ** GOTO lbl32
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = fe.py - fe.inbo("infr", inbs(int ), (int)47)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fe.inbo("infs", inbl(int ), (int)56)) break;
                    v20 /* !! */  = (long)fe.inbo("inft", inbl(int ), (int)57);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = fe.py - fe.inbo("infu", inbs(int ), (int)48)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == fe.inbo("infv", inbl(int ), (int)58)) break;
                    v21 /* !! */  = (long)fe.inbo("infw", inbl(int ), (int)59);
                }
                v22 = fe.mc.field_1724;
                v23 /* !! */  = fe.py;
                if (true) ** GOTO lbl162
                block90: while (true) {
                    v23 /* !! */  = (long)(fe.inbo("infy", inbs(int ), (int)50) - fe.inbo("infx", inbs(int ), (int)49));
lbl162:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 21650143: {
                            continue block90;
                        }
                        case 1019850191: {
                            break block90;
                        }
                    }
                    break;
                }
                v24 = v22.method_55754();
                v25 /* !! */  = fe.py;
                if (true) ** GOTO lbl172
                block91: while (true) {
                    v25 /* !! */  = (long)(fe.inbo("inga", inbs(int ), (int)52) - fe.inbo("infz", inbs(int ), (int)51));
lbl172:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 1019850191: {
                            break block91;
                        }
                        case 1062692984: {
                            continue block91;
                        }
                    }
                    break;
                }
                v26 = var2_5.method_1021(v24);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = fe.py - fe.inbo("ingb", inbs(int ), (int)53)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == fe.inbo("ingc", inbl(int ), (int)60)) break;
                    v27 /* !! */  = (long)fe.inbo("ingd", inbl(int ), (int)61);
                }
                var3_6 = var1_4.method_1019(v26);
                if (var5_3 || var5_3) ** GOTO lbl32
                v28 /* !! */  = fe.py;
                if (true) ** GOTO lbl189
                block93: while (true) {
                    v28 /* !! */  = (long)(v29 - fe.inbo("inge", inbs(int ), (int)54));
lbl189:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1762358568: {
                            v29 = fe.inbo("ingf", inbs(int ), (int)55);
                            continue block93;
                        }
                        case 1019850191: {
                            break block93;
                        }
                        case 1239007668: {
                            v29 = fe.inbo("ingg", inbs(int ), (int)56);
                            continue block93;
                        }
                        case 1357129396: {
                            v29 = fe.inbo("ingh", inbs(int ), (int)57);
                            continue block93;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_9 = fe.py - fe.inbo("ingi", inbs(int ), (int)58)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == fe.inbo("ingj", inbl(int ), (int)62)) break;
                    v30 /* !! */  = (long)fe.inbo("ingk", inbl(int ), (int)63);
                }
                v31 = fe.mc.field_1724;
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_10 = fe.py - fe.inbo("ingl", inbs(int ), (int)59)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == fe.inbo("ingm", inbl(int ), (int)64)) break;
                    v32 /* !! */  = (long)fe.inbo("ingn", inbl(int ), (int)65);
                }
                var4_7 = class_3726.method_16195((class_1297)v31);
                if (!var5_3 && !var5_3) ** break;
                ** continue;
                v33 /* !! */  = fe.py;
                if (true) ** GOTO lbl219
                block96: while (true) {
                    v33 /* !! */  = (long)(fe.inbo("ingp", inbs(int ), (int)61) - fe.inbo("ingo", inbs(int ), (int)60));
lbl219:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case 1019850191: {
                            break block96;
                        }
                        case 1943800856: {
                            continue block96;
                        }
                    }
                    break;
                }
                v34 = (BiFunction<fe, class_2338, class_3965>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, lambda$raycastInteractable$0(net.minecraft.class_243 net.minecraft.class_243 net.minecraft.class_3726 ruhack.phobia.fe net.minecraft.class_2338 ), (Lruhack/phobia/fe;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;)((class_243)var1_4, (class_243)var3_6, (class_3726)var4_7);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_11 = fe.py - fe.inbo("ingq", inbs(int ), (int)62)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == fe.inbo("ingr", inbl(int ), (int)66)) break;
                    v35 /* !! */  = (long)fe.inbo("ings", inbl(int ), (int)67);
                }
                v36 = (Function<fe, class_3965>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$raycastInteractable$1(net.minecraft.class_243 net.minecraft.class_243 ruhack.phobia.fe ), (Lruhack/phobia/fe;)Lnet/minecraft/class_3965;)((class_243)var3_6, (class_243)var2_5);
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_12 = fe.py - fe.inbo("ingt", inbs(int ), (int)63)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == fe.inbo("ingu", inbl(int ), (int)68)) break;
                    v37 /* !! */  = (long)fe.inbo("ingv", inbl(int ), (int)69);
                }
                return (class_3965)class_1922.method_17744((class_243)var1_4, (class_243)var3_6, (Object)this, v34, v36);
            }
            case 0: {
                var6_2 /* !! */  = (int)fe.inbo("ingw", inbl(int ), (int)70);
                if (!var7_1) break;
                throw null;
            }
            case 1: {
                var6_2 /* !! */  = (int)fe.inbo("ingx", inbl(int ), (int)71);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 2: {
                var6_2 /* !! */  = (int)fe.inbo("ingy", inbl(int ), (int)72);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 3: {
                var6_2 /* !! */  = (int)fe.inbo("ingz", inbl(int ), (int)73);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl256:
            // 4 sources

            case 4: {
                var6_2 /* !! */  = (int)fe.inbo("inha", inbl(int ), (int)74);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 5: {
                var6_2 /* !! */  = (int)fe.inbo("inhb", inbl(int ), (int)75);
                if (var7_1) {
                    throw null;
                }
            }
            case 6: {
                var6_2 /* !! */  = (int)fe.inbo("inhc", inbl(int ), (int)76);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 7: {
                var6_2 /* !! */  = (int)fe.inbo("inhd", inbl(int ), (int)77);
                if (var7_1) {
                    throw null;
                }
            }
            case 8: {
                var6_2 /* !! */  = (int)fe.inbo("inhe", inbl(int ), (int)78);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl279:
            // 2 sources

            case 9: {
                var6_2 /* !! */  = (int)fe.inbo("inhf", inbl(int ), (int)79);
                if (var7_1) {
                    throw null;
                }
            }
lbl283:
            // 4 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)fe.inbo("inhg", inbl(int ), (int)80);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl310
                    break;
                }
            }
            case 11: {
                var6_2 /* !! */  = (int)fe.inbo("inhh", inbl(int ), (int)81);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 12: {
                var6_2 /* !! */  = (int)fe.inbo("inhi", inbl(int ), (int)82);
                if (!var7_1) ** GOTO lbl256
                throw null;
            }
            case 13: {
                var6_2 /* !! */  = (int)fe.inbo("inhj", inbl(int ), (int)83);
                if (!var7_1) ** GOTO lbl256
                throw null;
            }
lbl302:
            // 2 sources

            case 14: {
                var6_2 /* !! */  = (int)fe.inbo("inhk", inbl(int ), (int)84);
                if (!var7_1) break;
                throw null;
            }
lbl306:
            // 3 sources

            case 15: {
                var6_2 /* !! */  = (int)fe.inbo("inhl", inbl(int ), (int)85);
                if (!var7_1) ** GOTO lbl283
                throw null;
            }
lbl310:
            // 6 sources

            case 16: {
                var6_2 /* !! */  = (int)fe.inbo("inhm", inbl(int ), (int)86);
                if (!var7_1) ** GOTO lbl256
                throw null;
            }
            case 17: {
                var6_2 /* !! */  = (int)fe.inbo("inhn", inbl(int ), (int)87);
                if (!var7_1) ** GOTO lbl310
                throw null;
            }
            case 18: 
        }
        var6_2 /* !! */  = (int)fe.inbo("inho", inbl(int ), (int)88);
        ** while (!var7_1)
lbl321:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_3965 lambda$raycastInteractable$1(class_243 var0, class_243 var1_1, fe var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fe.py - fe.inbo("inhp", inbs(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fe.inbo("inhq", inbl(int ), (int)89)) break;
            v0 /* !! */  = (long)fe.inbo("inhr", inbl(int ), (int)90);
        }
        var5_3 = fe.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fe.py - fe.inbo("inhs", inbs(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fe.inbo("inht", inbl(int ), (int)91)) break;
            v1 /* !! */  = (long)fe.inbo("inhu", inbl(int ), (int)92);
        }
        var4_4 /* !! */  = fe.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fe.py - fe.inbo("inhv", inbs(int ), (int)66)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fe.inbo("inhw", inbl(int ), (int)93)) break;
            v2 /* !! */  = (long)fe.inbo("inhx", inbl(int ), (int)94);
        }
        var3_5 = fe.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
                    return null;
                }
                if (var3_5 || var3_5) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fe.py - fe.inbo("inhy", inbs(int ), (int)67)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fe.inbo("inhz", inbl(int ), (int)95)) break;
                    v3 /* !! */  = (long)fe.inbo("inia", inbl(int ), (int)96);
                }
                v4 = var1_1.field_1352;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = fe.py - fe.inbo("inib", inbs(int ), (int)68)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fe.inbo("inic", inbl(int ), (int)97)) break;
                    v5 /* !! */  = (long)fe.inbo("inid", inbl(int ), (int)98);
                }
                v6 = var1_1.field_1351;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = fe.py - fe.inbo("inie", inbs(int ), (int)69)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fe.inbo("inif", inbl(int ), (int)99)) break;
                    v7 /* !! */  = (long)fe.inbo("inig", inbl(int ), (int)100);
                }
                v8 = var1_1.field_1350;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_6 = fe.py - fe.inbo("inih", inbs(int ), (int)70)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fe.inbo("inii", inbl(int ), (int)101)) break;
                    v9 /* !! */  = (long)fe.inbo("inij", inbl(int ), (int)102);
                }
                v10 = class_2350.method_10142((double)v4, (double)v6, (double)v8);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_7 = fe.py - fe.inbo("inik", inbs(int ), (int)71)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fe.inbo("inil", inbl(int ), (int)103)) break;
                    v11 /* !! */  = (long)fe.inbo("inim", inbl(int ), (int)104);
                }
                v12 = class_2338.method_49638((class_2374)var0);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_8 = fe.py - fe.inbo("inin", inbs(int ), (int)72)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fe.inbo("inio", inbl(int ), (int)105)) break;
                    v13 /* !! */  = (long)fe.inbo("inip", inbl(int ), (int)106);
                }
                return class_3965.method_17778((class_243)var0, (class_2350)v10, (class_2338)v12);
            }
            case 0: {
                do {
                    var4_4 /* !! */  = (int)fe.inbo("iniq", inbl(int ), (int)107);
                } while (!var5_3);
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)fe.inbo("inir", inbl(int ), (int)108);
                if (!var5_3) break;
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)fe.inbo("inis", inbl(int ), (int)109);
                if (!var5_3) break;
                throw null;
            }
            case 3: 
        }
        do {
            var4_4 /* !! */  = (int)fe.inbo("init", inbl(int ), (int)110);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ void inkz() {
        fe.inbm[100] = -205527467;
        fe.inbm[101] = -956320119;
        fe.inbm[102] = 765188833;
        fe.inbm[103] = 2106089097;
        fe.inbm[104] = -198728795;
        fe.inbm[105] = -984625883;
        fe.inbm[106] = 178068863;
        fe.inbm[107] = 409121544;
        fe.inbm[108] = -1891447889;
        fe.inbm[109] = 1795110020;
        fe.inbm[110] = 2113840718;
        fe.inbm[111] = -676610582;
        fe.inbm[112] = -374174358;
        fe.inbm[113] = 1459669853;
        fe.inbm[114] = -79095688;
        fe.inbm[115] = 1876920541;
        fe.inbm[116] = 512230928;
        fe.inbm[117] = -879083784;
        fe.inbm[118] = -513410863;
        fe.inbm[119] = -1347917958;
        fe.inbm[120] = 1317792933;
        fe.inbm[121] = 23497155;
        fe.inbm[122] = 677902155;
        fe.inbm[123] = -137387306;
        fe.inbm[124] = -1204307578;
        fe.inbm[125] = 2074263042;
        fe.inbm[126] = 1013679619;
        fe.inbm[127] = 1852631818;
        fe.inbm[128] = -1339040520;
        fe.inbm[129] = -1069378079;
        fe.inbm[130] = 367425149;
        fe.inbm[131] = -1275715224;
        fe.inbm[132] = -1019098008;
        fe.inbm[133] = 1254112975;
        fe.inbm[134] = 1556319529;
        fe.inbm[135] = -1518101891;
        fe.inbm[136] = -1420761461;
        fe.inbm[137] = -1162611687;
        fe.inbm[138] = -1522858866;
        fe.inbm[139] = -1181575498;
    }

    static {
        inbm = new int[140];
        inbn = new int[140];
        fe.inky();
        fe.inkz();
        fe.inla();
        fe.inlb();
        inbt = new long[100];
        inbu = new long[100];
        fe.inlc();
        fe.inld();
        INTERACTABLE_BLOCKS = new Class[]{class_4739.class, class_2363.class, class_2304.class, class_2480.class, class_2199.class, class_2238.class, class_2260.class, class_3922.class, class_3711.class, class_3713.class, class_3715.class, class_2406.class, class_3718.class, class_2401.class};
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_3965 lambda$raycastInteractable$0(class_243 var0, class_243 var1_1, class_3726 var2_2, fe var3_3, class_2338 var4_4) {
        block44: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fe.py - fe.inbo("iniu", inbs(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == fe.inbo("iniv", inbl(int ), (int)111)) break;
                v0 /* !! */  = (long)fe.inbo("iniw", inbl(int ), (int)112);
            }
            var8_5 = fe.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = fe.py - fe.inbo("inix", inbs(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == fe.inbo("iniy", inbl(int ), (int)113)) break;
                v1 /* !! */  = (long)fe.inbo("iniz", inbl(int ), (int)114);
            }
            var7_6 = fe.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = fe.py - fe.inbo("inja", inbs(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == fe.inbo("injb", inbl(int ), (int)115)) break;
                v2 /* !! */  = (long)fe.inbo("injc", inbl(int ), (int)116);
            }
            var6_7 = fe.a;
            if (var8_5) {
                throw null;
lbl21:
                // 4 sources

                return null;
            }
            if (var6_7 || var6_7) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = fe.py - fe.inbo("injd", inbs(int ), (int)76)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == fe.inbo("inje", inbl(int ), (int)117)) break;
                v3 /* !! */  = (long)fe.inbo("injf", inbl(int ), (int)118);
            }
            v4 /* !! */  = fe.py;
            if (true) ** GOTO lbl33
            block33: while (true) {
                v4 /* !! */  = (long)(v5 - fe.inbo("injg", inbs(int ), (int)77));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2132906936: {
                        v5 = fe.inbo("injh", inbs(int ), (int)78);
                        continue block33;
                    }
                    case -2119716945: {
                        v5 = fe.inbo("inji", inbs(int ), (int)79);
                        continue block33;
                    }
                    case 708587932: {
                        v5 = fe.inbo("injj", inbs(int ), (int)80);
                        continue block33;
                    }
                    case 1019850191: {
                        break block33;
                    }
                }
                break;
            }
            v6 = fe.mc.field_1687;
            v7 /* !! */  = fe.py;
            if (true) ** GOTO lbl50
            block34: while (true) {
                v7 /* !! */  = (long)(v8 - fe.inbo("injk", inbs(int ), (int)81));
lbl50:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 1019850191: {
                        break block34;
                    }
                    case 1384671263: {
                        v8 = fe.inbo("injl", inbs(int ), (int)82);
                        continue block34;
                    }
                    case 1921449094: {
                        v8 = fe.inbo("injm", inbs(int ), (int)83);
                        continue block34;
                    }
                }
                break;
            }
            var5_8 = v6.method_8320(var4_4);
            if (var6_7 || var6_7) ** GOTO lbl21
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = fe.py - fe.inbo("injn", inbs(int ), (int)84)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == fe.inbo("injo", inbl(int ), (int)119)) break;
                v9 /* !! */  = (long)fe.inbo("injp", inbl(int ), (int)120);
            }
            v10 = var5_8.method_26204();
            v11 /* !! */  = fe.py;
            if (true) ** GOTO lbl71
            block36: while (true) {
                v11 /* !! */  = (long)(v12 - fe.inbo("injq", inbs(int ), (int)85));
lbl71:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1269995308: {
                        v12 = fe.inbo("injr", inbs(int ), (int)86);
                        continue block36;
                    }
                    case -937383086: {
                        v12 = fe.inbo("injs", inbs(int ), (int)87);
                        continue block36;
                    }
                    case 779220098: {
                        v12 = fe.inbo("injt", inbs(int ), (int)88);
                        continue block36;
                    }
                    case 1019850191: {
                        break block36;
                    }
                }
                break;
            }
            if (!var3_3.shouldIgnore(v10)) break block44;
            if (var6_7 || var6_7) ** GOTO lbl21
            return null;
        }
        ** while (var6_7 || var6_7)
lbl88:
        // 1 sources

        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = fe.py - fe.inbo("inju", inbs(int ), (int)89)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == fe.inbo("injv", inbl(int ), (int)121)) break;
            v13 /* !! */  = (long)fe.inbo("injw", inbl(int ), (int)122);
        }
        v14 /* !! */  = fe.py;
        if (true) ** GOTO lbl97
        block38: while (true) {
            v14 /* !! */  = (long)(v15 - fe.inbo("injx", inbs(int ), (int)90));
lbl97:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1988102738: {
                    v15 = fe.inbo("injy", inbs(int ), (int)91);
                    continue block38;
                }
                case 1019850191: {
                    break block38;
                }
                case 1374169259: {
                    v15 = fe.inbo("injz", inbs(int ), (int)92);
                    continue block38;
                }
                case 1741856262: {
                    v15 = fe.inbo("inka", inbs(int ), (int)93);
                    continue block38;
                }
            }
            break;
        }
        v16 = fe.mc.field_1687;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_6 = fe.py - fe.inbo("inkb", inbs(int ), (int)94)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == fe.inbo("inkc", inbl(int ), (int)123)) break;
            v17 /* !! */  = (long)fe.inbo("inkd", inbl(int ), (int)124);
        }
        v18 /* !! */  = fe.py;
        if (true) ** GOTO lbl119
        block40: while (true) {
            v18 /* !! */  = (long)(v19 - fe.inbo("inke", inbs(int ), (int)95));
lbl119:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1086740104: {
                    v19 = fe.inbo("inkf", inbs(int ), (int)96);
                    continue block40;
                }
                case -298019866: {
                    v19 = fe.inbo("inkg", inbs(int ), (int)97);
                    continue block40;
                }
                case 1019850191: {
                    break block40;
                }
            }
            break;
        }
        v20 = fe.mc.field_1687;
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_7 = fe.py - fe.inbo("inkh", inbs(int ), (int)98)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == fe.inbo("inki", inbl(int ), (int)125)) break;
            v21 /* !! */  = (long)fe.inbo("inkj", inbl(int ), (int)126);
        }
        v22 = var5_8.method_26172((class_1922)v20, var4_4, var2_2);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_8 = fe.py - fe.inbo("inkk", inbs(int ), (int)99)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == fe.inbo("inkl", inbl(int ), (int)127)) break;
            v23 /* !! */  = (long)fe.inbo("inkm", inbl(int ), (int)128);
        }
        return v16.method_17745(var0, var1_1, var4_4, v22, var5_8);
    }

    private static /* synthetic */ void inlb() {
        fe.inbn[100] = 947731038;
        fe.inbn[101] = 956320118;
        fe.inbn[102] = -190333505;
        fe.inbn[103] = 2106089096;
        fe.inbn[104] = 968751313;
        fe.inbn[105] = 984625882;
        fe.inbn[106] = 1672051164;
        fe.inbn[107] = 409121547;
        fe.inbn[108] = -1891447891;
        fe.inbn[109] = 1795110020;
        fe.inbn[110] = 2113840718;
        fe.inbn[111] = 676610581;
        fe.inbn[112] = 355278084;
        fe.inbn[113] = -1459669854;
        fe.inbn[114] = -1898088248;
        fe.inbn[115] = -1876920542;
        fe.inbn[116] = -1643497702;
        fe.inbn[117] = -879083783;
        fe.inbn[118] = -67516621;
        fe.inbn[119] = -1347917957;
        fe.inbn[120] = -892908980;
        fe.inbn[121] = -23497156;
        fe.inbn[122] = -1937823583;
        fe.inbn[123] = 137387305;
        fe.inbn[124] = 939531011;
        fe.inbn[125] = 2074263043;
        fe.inbn[126] = -122399211;
        fe.inbn[127] = -1852631819;
        fe.inbn[128] = -828741829;
        fe.inbn[129] = -1069378071;
        fe.inbn[130] = 367425150;
        fe.inbn[131] = -1275715224;
        fe.inbn[132] = -1019098002;
        fe.inbn[133] = 1254112971;
        fe.inbn[134] = 1556319534;
        fe.inbn[135] = -1518101899;
        fe.inbn[136] = -1420761463;
        fe.inbn[137] = -1162611687;
        fe.inbn[138] = -1522858865;
        fe.inbn[139] = -1181575492;
    }

    private static /* synthetic */ void inld() {
        fe.inbu[0] = 2382033635023143522L;
        fe.inbu[1] = -6949842528678172768L;
        fe.inbu[2] = -8886185645046648762L;
        fe.inbu[3] = -4696683038847426913L;
        fe.inbu[4] = 6984363627770514751L;
        fe.inbu[5] = 6927572678934532609L;
        fe.inbu[6] = -3371591955402905099L;
        fe.inbu[7] = 3528995698156497676L;
        fe.inbu[8] = -7332559285600612564L;
        fe.inbu[9] = -7718758929214987094L;
        fe.inbu[10] = 69282315987467039L;
        fe.inbu[11] = -766132954830493130L;
        fe.inbu[12] = 9086529016406603858L;
        fe.inbu[13] = -3930785269399871102L;
        fe.inbu[14] = 41475920818151730L;
        fe.inbu[15] = 5198874996795498118L;
        fe.inbu[16] = -2887805821847303546L;
        fe.inbu[17] = 8500430021737500388L;
        fe.inbu[18] = -4317870866371976681L;
        fe.inbu[19] = -4052942078260163788L;
        fe.inbu[20] = 5832116890646459195L;
        fe.inbu[21] = -239442660709717183L;
        fe.inbu[22] = -211498314256272486L;
        fe.inbu[23] = -1998884200134755398L;
        fe.inbu[24] = 3358513534024018416L;
        fe.inbu[25] = -4374503247940861071L;
        fe.inbu[26] = -6890819158074345817L;
        fe.inbu[27] = -8760201781088536757L;
        fe.inbu[28] = 7383687013741755496L;
        fe.inbu[29] = -4197751364432340872L;
        fe.inbu[30] = -8266998049240826658L;
        fe.inbu[31] = 3588328972408043830L;
        fe.inbu[32] = 8561456626865246548L;
        fe.inbu[33] = 5148895227307034341L;
        fe.inbu[34] = 7419526645597274476L;
        fe.inbu[35] = 929498964521269526L;
        fe.inbu[36] = 36728932823740473L;
        fe.inbu[37] = -4359080707048316807L;
        fe.inbu[38] = 1227988879552240621L;
        fe.inbu[39] = -5157213639945973836L;
        fe.inbu[40] = 3326874877533955286L;
        fe.inbu[41] = 5553236225231093109L;
        fe.inbu[42] = 5668829470302818187L;
        fe.inbu[43] = -4222584264257898910L;
        fe.inbu[44] = -8094158986400735057L;
        fe.inbu[45] = 8344802712020508196L;
        fe.inbu[46] = -5290297045044159512L;
        fe.inbu[47] = 2734138326053107217L;
        fe.inbu[48] = -4220265044149377805L;
        fe.inbu[49] = 6945121781081825560L;
        fe.inbu[50] = 8731616818570554440L;
        fe.inbu[51] = 5789865630644717729L;
        fe.inbu[52] = 206651822594267376L;
        fe.inbu[53] = 1959677224816630614L;
        fe.inbu[54] = -7706314522417699842L;
        fe.inbu[55] = -7381127909757936943L;
        fe.inbu[56] = 6950102944164045552L;
        fe.inbu[57] = 5029182108139678300L;
        fe.inbu[58] = -472339876680872471L;
        fe.inbu[59] = 4183372719043311904L;
        fe.inbu[60] = 69156185643580823L;
        fe.inbu[61] = 295876842318203840L;
        fe.inbu[62] = 4993795573732749492L;
        fe.inbu[63] = -129200252223127280L;
        fe.inbu[64] = -4741441837609540848L;
        fe.inbu[65] = -7718105328272394195L;
        fe.inbu[66] = -5625711485019872159L;
        fe.inbu[67] = -8781459051622449151L;
        fe.inbu[68] = 6848210981209217356L;
        fe.inbu[69] = -6547950539927535409L;
        fe.inbu[70] = 7645612721807620106L;
        fe.inbu[71] = 8263168716974368339L;
        fe.inbu[72] = -1853587832082876422L;
        fe.inbu[73] = 2747530135267332638L;
        fe.inbu[74] = 1070877386055320546L;
        fe.inbu[75] = 6523222073789338012L;
        fe.inbu[76] = -7184941896391216550L;
        fe.inbu[77] = 3326568306392822846L;
        fe.inbu[78] = 6522401734128305478L;
        fe.inbu[79] = 6541113172938126176L;
        fe.inbu[80] = -3113178452636883448L;
        fe.inbu[81] = -597897456726484237L;
        fe.inbu[82] = -6577506950376302990L;
        fe.inbu[83] = -3101685752922090331L;
        fe.inbu[84] = 7397820480371987397L;
        fe.inbu[85] = 8640513751013818318L;
        fe.inbu[86] = -3556504895687123522L;
        fe.inbu[87] = 2003120312583402859L;
        fe.inbu[88] = -7892333349569594625L;
        fe.inbu[89] = -3134839905412161203L;
        fe.inbu[90] = 4249997744583484159L;
        fe.inbu[91] = 4208574062691908200L;
        fe.inbu[92] = 4480878338118220326L;
        fe.inbu[93] = -3050370438883292628L;
        fe.inbu[94] = -4284534729267624951L;
        fe.inbu[95] = 1361243896140008787L;
        fe.inbu[96] = 7987339935268227742L;
        fe.inbu[97] = -8577911256977425385L;
        fe.inbu[98] = -1975744868420586253L;
        fe.inbu[99] = -1508037184944607716L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldIgnore(class_2248 var1_1) {
        block58: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fe.py - fe.inbo("inct", inbs(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == fe.inbo("incu", inbl(int ), (int)14)) break;
                v0 /* !! */  = (long)fe.inbo("incv", inbl(int ), (int)15);
            }
            var8_2 = fe.c;
            v1 /* !! */  = fe.py;
            if (true) ** GOTO lbl12
            block31: while (true) {
                v1 /* !! */  = (long)(fe.inbo("incx", inbs(int ), (int)15) - fe.inbo("incw", inbs(int ), (int)14));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1980764712: {
                        continue block31;
                    }
                    case 1019850191: {
                        break block31;
                    }
                }
                break;
            }
            var7_3 /* !! */  = fe.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = fe.py - fe.inbo("incy", inbs(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == fe.inbo("incz", inbl(int ), (int)16)) break;
                v2 /* !! */  = (long)fe.inbo("inda", inbl(int ), (int)17);
            }
            var6_4 = fe.a;
            if (var8_2) {
                throw null;
lbl27:
                // 12 sources

                return (boolean)fe.inbo("indb", inbl(int ), (int)18);
            }
            if (var6_4 || var6_4) ** GOTO lbl27
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = fe.py - fe.inbo("indc", inbs(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == fe.inbo("indd", inbl(int ), (int)19)) break;
                v3 /* !! */  = (long)fe.inbo("inde", inbl(int ), (int)20);
            }
            var2_5 = fe.INTERACTABLE_BLOCKS;
            if (var6_4) ** GOTO lbl27
            var3_6 = var2_5.length;
            if (var6_4) ** GOTO lbl27
            var4_7 = fe.inbo("indf", inbl(int ), (int)21);
            if (var6_4) ** GOTO lbl27
            do {
                block59: {
                    if (var6_4 || var6_4) ** GOTO lbl27
                    if (var4_7 >= var3_6) break block58;
                    if (var6_4) ** GOTO lbl27
                    var5_8 = var2_5[var4_7];
                    if (var6_4 || var6_4) ** GOTO lbl27
                    v4 /* !! */  = fe.py;
                    if (true) ** GOTO lbl52
                    block36: while (true) {
                        v4 /* !! */  = (long)(fe.inbo("indh", inbs(int ), (int)19) - fe.inbo("indg", inbs(int ), (int)18));
lbl52:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -56177830: {
                                continue block36;
                            }
                            case 1019850191: {
                                break block36;
                            }
                        }
                        break;
                    }
                    if (!var5_8.isInstance(var1_1)) break block59;
                    if (var6_4 || var6_4) ** GOTO lbl27
                    return (boolean)fe.inbo("indi", inbl(int ), (int)22);
                }
                if (var6_4 || var6_4) ** GOTO lbl27
                ++var4_7;
                if (var6_4) ** GOTO lbl27
            } while (!var8_2);
            throw null;
        }
        if (var6_4) ** GOTO lbl27
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_4) ** break;
                ** continue;
                return (boolean)fe.inbo("indj", inbl(int ), (int)23);
            }
            case 0: {
                var7_3 /* !! */  = (int)fe.inbo("indk", inbl(int ), (int)24);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl79:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)fe.inbo("indl", inbl(int ), (int)25);
                if (!var8_2) break;
                throw null;
            }
            case 2: {
                var7_3 /* !! */  = (int)fe.inbo("indm", inbl(int ), (int)26);
                if (!var8_2) break;
                throw null;
            }
            case 3: {
                var7_3 /* !! */  = (int)fe.inbo("indn", inbl(int ), (int)27);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl92:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)fe.inbo("indo", inbl(int ), (int)28);
                    if (!var8_2) break block8;
                    throw null;
                }
            }
lbl97:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)fe.inbo("indp", inbl(int ), (int)29);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 6: {
                var7_3 /* !! */  = (int)fe.inbo("indq", inbl(int ), (int)30);
                if (!var8_2) ** GOTO lbl79
                throw null;
            }
lbl106:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)fe.inbo("indr", inbl(int ), (int)31);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl111:
            // 2 sources

            case 8: {
                var7_3 /* !! */  = (int)fe.inbo("inds", inbl(int ), (int)32);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 9: {
                var7_3 /* !! */  = (int)fe.inbo("indt", inbl(int ), (int)33);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl121:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)fe.inbo("indu", inbl(int ), (int)34);
                if (!var8_2) ** GOTO lbl111
                throw null;
            }
lbl125:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)fe.inbo("indv", inbl(int ), (int)35);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
lbl129:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)fe.inbo("indw", inbl(int ), (int)36);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl134:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)fe.inbo("indx", inbl(int ), (int)37);
                if (!var8_2) ** GOTO lbl97
                throw null;
            }
lbl138:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)fe.inbo("indy", inbl(int ), (int)38);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 15: {
                var7_3 /* !! */  = (int)fe.inbo("indz", inbl(int ), (int)39);
                if (!var8_2) ** GOTO lbl125
                throw null;
            }
lbl147:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)fe.inbo("inea", inbl(int ), (int)40);
                if (!var8_2) ** GOTO lbl92
                throw null;
            }
            case 17: {
                var7_3 /* !! */  = (int)fe.inbo("ineb", inbl(int ), (int)41);
                if (!var8_2) ** GOTO lbl138
                throw null;
            }
lbl155:
            // 4 sources

            case 18: {
                var7_3 /* !! */  = (int)fe.inbo("inec", inbl(int ), (int)42);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
            case 19: 
        }
        var7_3 /* !! */  = (int)fe.inbo("ined", inbl(int ), (int)43);
        ** while (!var8_2)
lbl162:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long inbs(int n2) {
        return inbt[n2] ^ inbu[n2];
    }

    public fe() {
        int n2 = b;
        super("OpenWalls", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043d\u0430\u0432\u043e\u0434\u0438\u0442\u044c\u0441\u044f \u0438 \u043e\u0442\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u044b \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", du.MISC);
    }
}

