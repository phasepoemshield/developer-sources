/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ac {
    private static int[] csro;
    private static long[] csri;
    private static final String AUTO_DIR = "autocfg";
    private static long[] csrj;
    private static final String CONFIG_FILE = "autoconfig.file";
    public static final boolean c;
    private static Path runDirectory;
    private static final String CONFIG_DIR = "configs";
    protected static final long gg = -690298961470182579L;
    public static final int b;
    private static int[] csrn;
    public static final boolean a;
    private static final String ROOT_DIR = "Phobia";

    private static /* synthetic */ void csxw() {
        ac.csrn[0] = 793688312;
        ac.csrn[1] = 1929493205;
        ac.csrn[2] = -306780061;
        ac.csrn[3] = 999517732;
        ac.csrn[4] = -204758772;
        ac.csrn[5] = -132525278;
        ac.csrn[6] = -2050608522;
        ac.csrn[7] = -1321617918;
        ac.csrn[8] = -172096866;
        ac.csrn[9] = -14685802;
        ac.csrn[10] = 573440764;
        ac.csrn[11] = -211665943;
        ac.csrn[12] = 339182428;
        ac.csrn[13] = -661904779;
        ac.csrn[14] = 189709326;
        ac.csrn[15] = 73702785;
        ac.csrn[16] = 463160510;
        ac.csrn[17] = -307573358;
        ac.csrn[18] = 27454965;
        ac.csrn[19] = -1115319991;
        ac.csrn[20] = -1582962734;
        ac.csrn[21] = -510863399;
        ac.csrn[22] = 1267058103;
        ac.csrn[23] = 1657157963;
        ac.csrn[24] = -1744359399;
        ac.csrn[25] = 62992841;
        ac.csrn[26] = -647632812;
        ac.csrn[27] = -769835786;
        ac.csrn[28] = 1767044100;
        ac.csrn[29] = 1749404574;
        ac.csrn[30] = -272865151;
        ac.csrn[31] = -1666259249;
        ac.csrn[32] = -670820758;
        ac.csrn[33] = 1192749984;
        ac.csrn[34] = 904985123;
        ac.csrn[35] = -651261994;
        ac.csrn[36] = 2099435314;
        ac.csrn[37] = 1721759118;
        ac.csrn[38] = 964145874;
        ac.csrn[39] = 366759872;
        ac.csrn[40] = -960805895;
        ac.csrn[41] = -388224302;
        ac.csrn[42] = -2098797997;
        ac.csrn[43] = 1491541268;
        ac.csrn[44] = -581861227;
        ac.csrn[45] = -995830921;
        ac.csrn[46] = -644016246;
        ac.csrn[47] = -1077701967;
        ac.csrn[48] = -386155862;
        ac.csrn[49] = 886200157;
        ac.csrn[50] = -667609203;
        ac.csrn[51] = 1225607774;
        ac.csrn[52] = -1360773989;
        ac.csrn[53] = 1789201020;
        ac.csrn[54] = -953924200;
        ac.csrn[55] = -1307826855;
        ac.csrn[56] = -1404606970;
        ac.csrn[57] = 1455723890;
        ac.csrn[58] = 508111487;
        ac.csrn[59] = -237675726;
        ac.csrn[60] = 1083145113;
        ac.csrn[61] = -1840858641;
        ac.csrn[62] = -1391751629;
        ac.csrn[63] = 978215870;
        ac.csrn[64] = 388503582;
        ac.csrn[65] = 1036680595;
        ac.csrn[66] = 1503201724;
        ac.csrn[67] = 1332723108;
        ac.csrn[68] = -60740525;
        ac.csrn[69] = -238827829;
        ac.csrn[70] = -2143702626;
        ac.csrn[71] = 864827835;
        ac.csrn[72] = -363582180;
        ac.csrn[73] = 1720404991;
        ac.csrn[74] = 32094325;
        ac.csrn[75] = -1820709972;
        ac.csrn[76] = -1733836257;
        ac.csrn[77] = 1244950970;
        ac.csrn[78] = 13646725;
        ac.csrn[79] = -655206230;
        ac.csrn[80] = 260899705;
        ac.csrn[81] = 1790441728;
        ac.csrn[82] = -9405660;
        ac.csrn[83] = -1308678007;
        ac.csrn[84] = -1290189855;
        ac.csrn[85] = -163507633;
        ac.csrn[86] = 850094566;
        ac.csrn[87] = 130818409;
    }

    private static /* synthetic */ int csrm(int n2) {
        return csrn[n2] ^ csro[n2];
    }

    private static /* synthetic */ void csxz() {
        ac.csrj[0] = -7340759938795297286L;
        ac.csrj[1] = -6901659004486832459L;
        ac.csrj[2] = -3578275346000771943L;
        ac.csrj[3] = -1374850885946159432L;
        ac.csrj[4] = 6391987252919747300L;
        ac.csrj[5] = 8567570794785729837L;
        ac.csrj[6] = -6042499033462137722L;
        ac.csrj[7] = 5720009429030595495L;
        ac.csrj[8] = -3260703916788470800L;
        ac.csrj[9] = -7672470985354693861L;
        ac.csrj[10] = 1580875511296624994L;
        ac.csrj[11] = -9143879783703561096L;
        ac.csrj[12] = -5749743671804700781L;
        ac.csrj[13] = 6014577342565847972L;
        ac.csrj[14] = -7623907326066324502L;
        ac.csrj[15] = 6091599699221076897L;
        ac.csrj[16] = -2236582184014119512L;
        ac.csrj[17] = -5650552574123051709L;
        ac.csrj[18] = -137567009321926801L;
        ac.csrj[19] = -7531795203020923300L;
        ac.csrj[20] = 7264389957862133000L;
        ac.csrj[21] = 6304864408304312089L;
        ac.csrj[22] = 650985530790400352L;
        ac.csrj[23] = 7560342611276802475L;
        ac.csrj[24] = 4478527152709830867L;
        ac.csrj[25] = -179050584313999319L;
        ac.csrj[26] = -4372275936161680204L;
        ac.csrj[27] = -4211704298573223615L;
        ac.csrj[28] = -9129865501282835845L;
        ac.csrj[29] = 2478102766136016509L;
        ac.csrj[30] = -6229726861569781069L;
        ac.csrj[31] = -3424768687553113023L;
        ac.csrj[32] = 991451441308810685L;
        ac.csrj[33] = 6592258458040375907L;
        ac.csrj[34] = 7369777442933057093L;
        ac.csrj[35] = -22278191005076503L;
        ac.csrj[36] = -404216610562782928L;
        ac.csrj[37] = 8357327441131340803L;
        ac.csrj[38] = -8015234793100204329L;
        ac.csrj[39] = -4311455601706169690L;
        ac.csrj[40] = 4153674737350285173L;
        ac.csrj[41] = -3746705899616219969L;
        ac.csrj[42] = -4793148964821439465L;
        ac.csrj[43] = -3708286579768535999L;
        ac.csrj[44] = 605710638699997308L;
        ac.csrj[45] = 5759616893059328567L;
        ac.csrj[46] = 7309116152769940335L;
        ac.csrj[47] = -1563768104733490216L;
        ac.csrj[48] = 996226717457820167L;
        ac.csrj[49] = -6794944839578928200L;
        ac.csrj[50] = 3832465244974431321L;
        ac.csrj[51] = 5794875242591055759L;
        ac.csrj[52] = -6200935939477097235L;
        ac.csrj[53] = -1188829713386756654L;
        ac.csrj[54] = -5713683896059677360L;
        ac.csrj[55] = -3300538964749506039L;
        ac.csrj[56] = -4178031464036118531L;
        ac.csrj[57] = -7951375747661708805L;
        ac.csrj[58] = 1152017414754660108L;
        ac.csrj[59] = -3649430718242767357L;
        ac.csrj[60] = -7725985701749268954L;
        ac.csrj[61] = -439333979655854399L;
        ac.csrj[62] = 1540182488213069908L;
        ac.csrj[63] = -6629835093827503971L;
        ac.csrj[64] = -6194063681115797137L;
        ac.csrj[65] = -2915905843753329202L;
        ac.csrj[66] = 3165291883335420334L;
        ac.csrj[67] = -188866361180387667L;
        ac.csrj[68] = -1375516306576699130L;
        ac.csrj[69] = -2827242061084446569L;
        ac.csrj[70] = -8555407173153530980L;
        ac.csrj[71] = -7178729540120925117L;
        ac.csrj[72] = -7846252507692157015L;
        ac.csrj[73] = 3951143898272075785L;
        ac.csrj[74] = -2811268209479242204L;
        ac.csrj[75] = 718319562478107920L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Path getConfigDirectory() {
        v0 /* !! */  = ac.gg;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - ac.csrk("cssm", csrh(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1774694072: {
                    v1 = ac.csrk("cssn", csrh(int ), (int)9);
                    continue block33;
                }
                case 817912515: {
                    v1 = ac.csrk("csso", csrh(int ), (int)10);
                    continue block33;
                }
                case 2092936013: {
                    break block33;
                }
            }
            break;
        }
        var2 = ac.c;
        v2 /* !! */  = ac.gg;
        if (true) ** GOTO lbl19
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - ac.csrk("cssp", csrh(int ), (int)11));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1728073216: {
                    v3 = ac.csrk("cssq", csrh(int ), (int)12);
                    continue block34;
                }
                case -1649167239: {
                    v3 = ac.csrk("cssr", csrh(int ), (int)13);
                    continue block34;
                }
                case -1417399357: {
                    v3 = ac.csrk("csss", csrh(int ), (int)14);
                    continue block34;
                }
                case 2092936013: {
                    break block34;
                }
            }
            break;
        }
        var1_1 /* !! */  = ac.b;
        v4 /* !! */  = ac.gg;
        if (true) ** GOTO lbl36
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - ac.csrk("csst", csrh(int ), (int)15));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1600182759: {
                    v5 = ac.csrk("cssu", csrh(int ), (int)16);
                    continue block35;
                }
                case 783411361: {
                    v5 = ac.csrk("cssv", csrh(int ), (int)17);
                    continue block35;
                }
                case 1083278964: {
                    v5 = ac.csrk("cssw", csrh(int ), (int)18);
                    continue block35;
                }
                case 2092936013: {
                    break block35;
                }
            }
            break;
        }
        var0_2 = ac.a;
        if (var2) {
            throw null;
lbl51:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl54:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 /* !! */  = ac.gg;
                if (true) ** GOTO lbl61
                block37: while (true) {
                    v6 /* !! */  = (long)(v7 - ac.csrk("cssx", csrh(int ), (int)19));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1824719878: {
                            v7 = ac.csrk("cssy", csrh(int ), (int)20);
                            continue block37;
                        }
                        case -810347549: {
                            v7 = ac.csrk("cssz", csrh(int ), (int)21);
                            continue block37;
                        }
                        case 327497164: {
                            v7 = ac.csrk("csta", csrh(int ), (int)22);
                            continue block37;
                        }
                        case 2092936013: {
                            break block37;
                        }
                    }
                    break;
                }
                v8 /* !! */  = ac.gg;
                if (true) ** GOTO lbl77
                block38: while (true) {
                    v8 /* !! */  = (long)(ac.csrk("cstc", csrh(int ), (int)24) - ac.csrk("cstb", csrh(int ), (int)23));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 126414514: {
                            continue block38;
                        }
                        case 2092936013: {
                            break block38;
                        }
                    }
                    break;
                }
                v9 = ac.runDirectory.resolve("Phobia");
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_0 = ac.gg - ac.csrk("cstd", csrh(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ac.csrk("cste", csrm(int ), (int)16)) break;
                    v10 /* !! */  = (long)ac.csrk("cstf", csrm(int ), (int)17);
                }
                v11 = v9.resolve("configs");
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = ac.gg - ac.csrk("cstg", csrh(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ac.csrk("csth", csrm(int ), (int)18)) break;
                    v12 /* !! */  = (long)ac.csrk("csti", csrm(int ), (int)19);
                }
                return v11.resolve("autocfg");
            }
lbl95:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ac.csrk("cstj", csrm(int ), (int)20);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 1: {
                var1_1 /* !! */  = (int)ac.csrk("cstk", csrm(int ), (int)21);
                if (!var2) ** GOTO lbl95
                throw null;
            }
lbl104:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ac.csrk("cstl", csrm(int ), (int)22);
                    if (!var2) break block17;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ac.csrk("cstm", csrm(int ), (int)23);
        ** while (!var2)
lbl112:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite csrk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void csxx() {
        ac.csro[0] = -793688313;
        ac.csro[1] = 1001223553;
        ac.csro[2] = 306780060;
        ac.csro[3] = -21307833;
        ac.csro[4] = -204758771;
        ac.csro[5] = -537619294;
        ac.csro[6] = -2050608521;
        ac.csro[7] = 370403310;
        ac.csro[8] = -172096865;
        ac.csro[9] = -1087435456;
        ac.csro[10] = 573440760;
        ac.csro[11] = -211665939;
        ac.csro[12] = 339182425;
        ac.csro[13] = -661904784;
        ac.csro[14] = 189709324;
        ac.csro[15] = 73702786;
        ac.csro[16] = -463160511;
        ac.csro[17] = 1709966252;
        ac.csro[18] = 27454964;
        ac.csro[19] = 397626604;
        ac.csro[20] = -1582962733;
        ac.csro[21] = -510863397;
        ac.csro[22] = 1267058103;
        ac.csro[23] = 1657157962;
        ac.csro[24] = -1744359400;
        ac.csro[25] = -1789369238;
        ac.csro[26] = 647632811;
        ac.csro[27] = 99254619;
        ac.csro[28] = 1767044101;
        ac.csro[29] = 1842199787;
        ac.csro[30] = -272865151;
        ac.csro[31] = -1666259249;
        ac.csro[32] = -670820760;
        ac.csro[33] = 1192749986;
        ac.csro[34] = -904985124;
        ac.csro[35] = 1323420989;
        ac.csro[36] = -2099435315;
        ac.csro[37] = 658034530;
        ac.csro[38] = -964145875;
        ac.csro[39] = 1326775128;
        ac.csro[40] = 960805894;
        ac.csro[41] = -1488748869;
        ac.csro[42] = -2098797998;
        ac.csro[43] = -1861235094;
        ac.csro[44] = -581861227;
        ac.csro[45] = -995830926;
        ac.csro[46] = -644016248;
        ac.csro[47] = -1077701965;
        ac.csro[48] = -386155863;
        ac.csro[49] = 886200157;
        ac.csro[50] = -667609204;
        ac.csro[51] = 858481238;
        ac.csro[52] = 1360773988;
        ac.csro[53] = -1575233086;
        ac.csro[54] = 953924199;
        ac.csro[55] = -1103837610;
        ac.csro[56] = -1404606970;
        ac.csro[57] = 1455723895;
        ac.csro[58] = -508111488;
        ac.csro[59] = -1889928520;
        ac.csro[60] = 1083145112;
        ac.csro[61] = -1213864091;
        ac.csro[62] = -1391751630;
        ac.csro[63] = -1677354645;
        ac.csro[64] = -388503583;
        ac.csro[65] = -517544022;
        ac.csro[66] = 1503201720;
        ac.csro[67] = 1332723108;
        ac.csro[68] = -60740519;
        ac.csro[69] = -238827827;
        ac.csro[70] = -2143702646;
        ac.csro[71] = 864827836;
        ac.csro[72] = -363582199;
        ac.csro[73] = 1720404972;
        ac.csro[74] = 32094323;
        ac.csro[75] = -1820709959;
        ac.csro[76] = -1733836278;
        ac.csro[77] = 1244950954;
        ac.csro[78] = 13646722;
        ac.csro[79] = -655206234;
        ac.csro[80] = 260899699;
        ac.csro[81] = 1790441731;
        ac.csro[82] = -9405654;
        ac.csro[83] = -1308677989;
        ac.csro[84] = -1290189844;
        ac.csro[85] = -163507641;
        ac.csro[86] = 850094573;
        ac.csro[87] = 130818406;
    }

    public ac() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Path getConfigFile() {
        v0 /* !! */  = ac.gg;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ac.csrk("cstn", csrh(int ), (int)27));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1798303588: {
                    v1 = ac.csrk("csto", csrh(int ), (int)28);
                    continue block12;
                }
                case 26270292: {
                    v1 = ac.csrk("cstp", csrh(int ), (int)29);
                    continue block12;
                }
                case 1385706693: {
                    v1 = ac.csrk("cstq", csrh(int ), (int)30);
                    continue block12;
                }
                case 2092936013: {
                    break block12;
                }
            }
            break;
        }
        var2 = ac.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ac.gg - ac.csrk("cstr", csrh(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ac.csrk("csts", csrm(int ), (int)24)) break;
            v2 /* !! */  = (long)ac.csrk("cstt", csrm(int ), (int)25);
        }
        var1_1 = ac.b;
        v3 /* !! */  = ac.gg;
        if (true) ** GOTO lbl28
        block14: while (true) {
            v3 /* !! */  = (long)(v4 - ac.csrk("cstu", csrh(int ), (int)32));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1627322983: {
                    v4 = ac.csrk("cstv", csrh(int ), (int)33);
                    continue block14;
                }
                case 947912448: {
                    v4 = ac.csrk("cstw", csrh(int ), (int)34);
                    continue block14;
                }
                case 1257783852: {
                    v4 = ac.csrk("cstx", csrh(int ), (int)35);
                    continue block14;
                }
                case 2092936013: {
                    break block14;
                }
            }
            break;
        }
        var0_2 = ac.a;
        if (var2) {
            throw null;
lbl43:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl46:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ac.gg - ac.csrk("csty", csrh(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ac.csrk("cstz", csrm(int ), (int)26)) break;
            v5 /* !! */  = (long)ac.csrk("csua", csrm(int ), (int)27);
        }
        v6 = ac.getConfigDirectory();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ac.gg - ac.csrk("csub", csrh(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ac.csrk("csuc", csrm(int ), (int)28)) break;
            v7 /* !! */  = (long)ac.csrk("csud", csrm(int ), (int)29);
        }
        return v6.resolve("autoconfig.file");
    }

    private static /* synthetic */ long csrh(int n2) {
        return csri[n2] ^ csrj[n2];
    }

    private static /* synthetic */ void csxy() {
        ac.csri[0] = -2225036478158425867L;
        ac.csri[1] = -3564892145975885179L;
        ac.csri[2] = 7012530642537915463L;
        ac.csri[3] = 7447462826439979244L;
        ac.csri[4] = -5357964468073819970L;
        ac.csri[5] = 8702111670751239332L;
        ac.csri[6] = 630526504399350167L;
        ac.csri[7] = 5696032737560594572L;
        ac.csri[8] = -6929037319545479408L;
        ac.csri[9] = -49334235878071004L;
        ac.csri[10] = 2477054153942223149L;
        ac.csri[11] = -3284824111372282783L;
        ac.csri[12] = -3011443683756583996L;
        ac.csri[13] = 4797533038033225017L;
        ac.csri[14] = 8532227540970375494L;
        ac.csri[15] = -2185368234148333477L;
        ac.csri[16] = -6456700497540415852L;
        ac.csri[17] = 1000973985085283563L;
        ac.csri[18] = 1375382099872347119L;
        ac.csri[19] = -8595680563215736570L;
        ac.csri[20] = -9058661381039750568L;
        ac.csri[21] = -1081535178308765321L;
        ac.csri[22] = -3487306592542402982L;
        ac.csri[23] = 1417471337992426541L;
        ac.csri[24] = -1192398343492039751L;
        ac.csri[25] = -3789449087721016804L;
        ac.csri[26] = 2423988929049669720L;
        ac.csri[27] = 504902576690824884L;
        ac.csri[28] = -6850441128305612189L;
        ac.csri[29] = -973997993101749972L;
        ac.csri[30] = 3289821038706113342L;
        ac.csri[31] = 7109783139697277429L;
        ac.csri[32] = -1991943477864024437L;
        ac.csri[33] = 7847255426472597504L;
        ac.csri[34] = 2156201553228658676L;
        ac.csri[35] = -6382206172749443707L;
        ac.csri[36] = -183314573214122072L;
        ac.csri[37] = -5691176891512891265L;
        ac.csri[38] = -9147615491063847163L;
        ac.csri[39] = -4492812301270514661L;
        ac.csri[40] = -217428179821017343L;
        ac.csri[41] = -31251947474473139L;
        ac.csri[42] = -2721527084829125899L;
        ac.csri[43] = -54826977072630336L;
        ac.csri[44] = 5485159052885547587L;
        ac.csri[45] = -4837867397579200260L;
        ac.csri[46] = 4624654615499415784L;
        ac.csri[47] = -727523728218528738L;
        ac.csri[48] = -4172090146440549542L;
        ac.csri[49] = 7601845061362696838L;
        ac.csri[50] = -8274333403716836382L;
        ac.csri[51] = 7945160433953135292L;
        ac.csri[52] = 2024445760022902906L;
        ac.csri[53] = -488098074641427955L;
        ac.csri[54] = 4248545108572781266L;
        ac.csri[55] = -7795063839128188833L;
        ac.csri[56] = 2127580228564605582L;
        ac.csri[57] = 8203830380318417908L;
        ac.csri[58] = 712274360854528178L;
        ac.csri[59] = -6908028149271353330L;
        ac.csri[60] = -7824183840899848443L;
        ac.csri[61] = 5710207676425172441L;
        ac.csri[62] = -2764314391897805252L;
        ac.csri[63] = 5769622931606949364L;
        ac.csri[64] = 7376585480959104474L;
        ac.csri[65] = 3098923165971126420L;
        ac.csri[66] = -2737693793710104547L;
        ac.csri[67] = 1563176406777673548L;
        ac.csri[68] = 8248213719957074880L;
        ac.csri[69] = -6587984308593903572L;
        ac.csri[70] = 3851578667720328405L;
        ac.csri[71] = 7271340996234111568L;
        ac.csri[72] = -5681944322491071728L;
        ac.csri[73] = -1680272013514294078L;
        ac.csri[74] = 5386567389238301152L;
        ac.csri[75] = 8857457328660390899L;
    }

    static {
        csrn = new int[88];
        csro = new int[88];
        ac.csxw();
        ac.csxx();
        csri = new long[76];
        csrj = new long[76];
        ac.csxy();
        ac.csxz();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Path getNamedConfigFile(String var0) {
        v0 /* !! */  = ac.gg;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - ac.csrk("csui", csrh(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1639691771: {
                    v1 = ac.csrk("csuj", csrh(int ), (int)39);
                    continue block11;
                }
                case -164207631: {
                    v1 = ac.csrk("csuk", csrh(int ), (int)40);
                    continue block11;
                }
                case 2092936013: {
                    break block11;
                }
            }
            break;
        }
        var4_1 = ac.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ac.gg - ac.csrk("csul", csrh(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ac.csrk("csum", csrm(int ), (int)34)) break;
            v2 /* !! */  = (long)ac.csrk("csun", csrm(int ), (int)35);
        }
        var3_2 = ac.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ac.gg - ac.csrk("csuo", csrh(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ac.csrk("csup", csrm(int ), (int)36)) break;
            v3 /* !! */  = (long)ac.csrk("csuq", csrm(int ), (int)37);
        }
        var2_3 = ac.a;
        if (var4_1) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ac.gg - ac.csrk("csur", csrh(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ac.csrk("csus", csrm(int ), (int)38)) break;
            v4 /* !! */  = (long)ac.csrk("csut", csrm(int ), (int)39);
        }
        var1_4 = ac.sanitizeConfigName(var0);
        ** while (var2_3 || var2_3)
lbl39:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ac.gg - ac.csrk("csuu", csrh(int ), (int)44)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ac.csrk("csuv", csrm(int ), (int)40)) break;
            v5 /* !! */  = (long)ac.csrk("csuw", csrm(int ), (int)41);
        }
        v6 = ac.getConfigDirectory();
        v7 /* !! */  = ac.gg;
        if (true) ** GOTO lbl49
        block17: while (true) {
            v7 /* !! */  = (long)(v8 - ac.csrk("csux", csrh(int ), (int)45));
lbl49:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -121280952: {
                    v8 = ac.csrk("csuy", csrh(int ), (int)46);
                    continue block17;
                }
                case 950215944: {
                    v8 = ac.csrk("csuz", csrh(int ), (int)47);
                    continue block17;
                }
                case 1446391932: {
                    v8 = ac.csrk("csva", csrh(int ), (int)48);
                    continue block17;
                }
                case 2092936013: {
                    break block17;
                }
            }
            break;
        }
        v9 = var1_4 + ".file";
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = ac.gg - ac.csrk("csvb", csrh(int ), (int)49)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ac.csrk("csvc", csrm(int ), (int)42)) break;
            v10 /* !! */  = (long)ac.csrk("csvd", csrm(int ), (int)43);
        }
        return v6.resolve(v9);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void init() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ac.gg - ac.csrk("csrl", csrh(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ac.csrk("csrp", csrm(int ), (int)0)) break;
            v0 /* !! */  = (long)ac.csrk("csrq", csrm(int ), (int)1);
        }
        var2 = ac.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ac.gg - ac.csrk("csrr", csrh(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ac.csrk("csrs", csrm(int ), (int)2)) break;
            v1 /* !! */  = (long)ac.csrk("csrt", csrm(int ), (int)3);
        }
        var1_1 /* !! */  = ac.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ac.gg - ac.csrk("csru", csrh(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ac.csrk("csrv", csrm(int ), (int)4)) break;
            v2 /* !! */  = (long)ac.csrk("csrw", csrm(int ), (int)5);
        }
        var0_2 = ac.a;
        if (var2) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var0_2) ** GOTO lbl21
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl21
                v3 = new String[]{};
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ac.gg - ac.csrk("csrx", csrh(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ac.csrk("csry", csrm(int ), (int)6)) break;
                    v4 /* !! */  = (long)ac.csrk("csrz", csrm(int ), (int)7);
                }
                v5 = Paths.get("", v3);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ac.gg - ac.csrk("cssa", csrh(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ac.csrk("cssb", csrm(int ), (int)8)) break;
                    v6 /* !! */  = (long)ac.csrk("cssc", csrm(int ), (int)9);
                }
                v7 = v5.toAbsolutePath();
                v8 /* !! */  = ac.gg;
                if (true) ** GOTO lbl45
                block19: while (true) {
                    v8 /* !! */  = (long)(v9 - ac.csrk("cssd", csrh(int ), (int)5));
lbl45:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1252941570: {
                            v9 = ac.csrk("csse", csrh(int ), (int)6);
                            continue block19;
                        }
                        case -181950250: {
                            v9 = ac.csrk("cssf", csrh(int ), (int)7);
                            continue block19;
                        }
                        case 2092936013: {
                            break block19;
                        }
                    }
                    break;
                }
                ac.runDirectory = v7;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)ac.csrk("cssg", csrm(int ), (int)10);
                } while (!var2);
                throw null;
            }
lbl63:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)ac.csrk("cssh", csrm(int ), (int)11);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 2: {
                var1_1 /* !! */  = (int)ac.csrk("cssi", csrm(int ), (int)12);
                if (!var2) ** GOTO lbl63
                throw null;
            }
lbl72:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ac.csrk("cssj", csrm(int ), (int)13);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl77:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)ac.csrk("cssk", csrm(int ), (int)14);
                if (!var2) ** GOTO lbl72
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)ac.csrk("cssl", csrm(int ), (int)15);
        ** while (!var2)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String sanitizeConfigName(String var0) {
        block58: {
            block57: {
                block56: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = ac.gg - ac.csrk("csvk", csrh(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  == ac.csrk("csvl", csrm(int ), (int)50)) break;
                        v0 /* !! */  = (long)ac.csrk("csvm", csrm(int ), (int)51);
                    }
                    var4_1 = ac.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = ac.gg - ac.csrk("csvn", csrh(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v1 /* !! */  == ac.csrk("csvo", csrm(int ), (int)52)) break;
                        v1 /* !! */  = (long)ac.csrk("csvp", csrm(int ), (int)53);
                    }
                    var3_2 = ac.b;
                    v2 /* !! */  = ac.gg;
                    if (true) ** GOTO lbl19
                    block35: while (true) {
                        v2 /* !! */  = (long)(ac.csrk("csvr", csrh(int ), (int)53) - ac.csrk("csvq", csrh(int ), (int)52));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case 963158764: {
                                continue block35;
                            }
                            case 2092936013: {
                                break block35;
                            }
                        }
                        break;
                    }
                    var2_3 = ac.a;
                    if (var4_1) {
                        throw null;
lbl27:
                        // 10 sources

                        return null;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl27
                    if (var0 != null) break block56;
                    if (var2_3 || var2_3) ** GOTO lbl27
                    v3 /* !! */  = ac.gg;
                    if (true) ** GOTO lbl36
                    block37: while (true) {
                        v3 /* !! */  = (long)(v4 - ac.csrk("csvs", csrh(int ), (int)54));
lbl36:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -935540904: {
                                v4 = ac.csrk("csvt", csrh(int ), (int)55);
                                continue block37;
                            }
                            case 17325268: {
                                v4 = ac.csrk("csvu", csrh(int ), (int)56);
                                continue block37;
                            }
                            case 1014881638: {
                                v4 = ac.csrk("csvv", csrh(int ), (int)57);
                                continue block37;
                            }
                            case 2092936013: {
                                break block37;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = ac.gg - ac.csrk("csvw", csrh(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == ac.csrk("csvx", csrm(int ), (int)54)) break;
                        v5 /* !! */  = (long)ac.csrk("csvy", csrm(int ), (int)55);
                    }
                    throw new IllegalArgumentException("Config name is missing");
                }
                if (var2_3 || var2_3) ** GOTO lbl27
                v6 /* !! */  = ac.gg;
                if (true) ** GOTO lbl61
                block39: while (true) {
                    v6 /* !! */  = (long)(v7 - ac.csrk("csvz", csrh(int ), (int)59));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1268883224: {
                            v7 = ac.csrk("cswa", csrh(int ), (int)60);
                            continue block39;
                        }
                        case 1640861606: {
                            v7 = ac.csrk("cswb", csrh(int ), (int)61);
                            continue block39;
                        }
                        case 2092936013: {
                            break block39;
                        }
                    }
                    break;
                }
                var1_4 = var0.trim();
                if (var2_3 || var2_3) ** GOTO lbl27
                v8 /* !! */  = ac.gg;
                if (true) ** GOTO lbl76
                block40: while (true) {
                    v8 /* !! */  = (long)(v9 - ac.csrk("cswc", csrh(int ), (int)62));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -361145401: {
                            v9 = ac.csrk("cswd", csrh(int ), (int)63);
                            continue block40;
                        }
                        case 350041853: {
                            v9 = ac.csrk("cswe", csrh(int ), (int)64);
                            continue block40;
                        }
                        case 2092936013: {
                            break block40;
                        }
                    }
                    break;
                }
                v10 = var1_4.toLowerCase();
                v11 /* !! */  = ac.gg;
                if (true) ** GOTO lbl90
                block41: while (true) {
                    v11 /* !! */  = (long)(ac.csrk("cswg", csrh(int ), (int)66) - ac.csrk("cswf", csrh(int ), (int)65));
lbl90:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1775796216: {
                            continue block41;
                        }
                        case 2092936013: {
                            break block41;
                        }
                    }
                    break;
                }
                if (!v10.endsWith(".file")) break block57;
                if (var2_3 || var2_3) ** GOTO lbl27
                v12 = ac.csrk("cswh", csrm(int ), (int)56);
                v13 /* !! */  = ac.gg;
                if (true) ** GOTO lbl102
                block42: while (true) {
                    v13 /* !! */  = (long)(ac.csrk("cswj", csrh(int ), (int)68) - ac.csrk("cswi", csrh(int ), (int)67));
lbl102:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -96612942: {
                            continue block42;
                        }
                        case 2092936013: {
                            break block42;
                        }
                    }
                    break;
                }
                v14 = var1_4.length() - ac.csrk("cswk", csrm(int ), (int)57);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = ac.gg - ac.csrk("cswl", csrh(int ), (int)69)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == ac.csrk("cswm", csrm(int ), (int)58)) break;
                    v15 /* !! */  = (long)ac.csrk("cswn", csrm(int ), (int)59);
                }
                var1_4 = var1_4.substring((int)v12, v14);
                if (var2_3) ** GOTO lbl27
            }
            if (var2_3 || var2_3) ** GOTO lbl27
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_4 = ac.gg - ac.csrk("cswo", csrh(int ), (int)70)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v16 /* !! */  == ac.csrk("cswp", csrm(int ), (int)60)) break;
                v16 /* !! */  = (long)ac.csrk("cswq", csrm(int ), (int)61);
            }
            var1_4 = var1_4.replaceAll("[^\\p{L}\\p{N}_-]", "_");
            if (var2_3 || var2_3) ** GOTO lbl27
            v17 /* !! */  = ac.gg;
            if (true) ** GOTO lbl130
            block45: while (true) {
                v17 /* !! */  = (long)(v18 - ac.csrk("cswr", csrh(int ), (int)71));
lbl130:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -197380839: {
                        v18 = ac.csrk("csws", csrh(int ), (int)72);
                        continue block45;
                    }
                    case 890651094: {
                        v18 = ac.csrk("cswt", csrh(int ), (int)73);
                        continue block45;
                    }
                    case 2092936013: {
                        break block45;
                    }
                }
                break;
            }
            if (!var1_4.isBlank()) break block58;
            if (var2_3 || var2_3) ** GOTO lbl27
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_5 = ac.gg - ac.csrk("cswu", csrh(int ), (int)74)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v19 /* !! */  == ac.csrk("cswv", csrm(int ), (int)62)) break;
                v19 /* !! */  = (long)ac.csrk("csww", csrm(int ), (int)63);
            }
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_6 = ac.gg - ac.csrk("cswx", csrh(int ), (int)75)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v20 /* !! */  == ac.csrk("cswy", csrm(int ), (int)64)) break;
                v20 /* !! */  = (long)ac.csrk("cswz", csrm(int ), (int)65);
            }
            throw new IllegalArgumentException("Config name is empty");
        }
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        return var1_4;
    }
}

