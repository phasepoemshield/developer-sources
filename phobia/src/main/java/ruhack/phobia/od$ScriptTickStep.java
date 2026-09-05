/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.BooleanSupplier;
import ruhack.phobia.oe;

public final class od$ScriptTickStep
implements Comparable<od$ScriptTickStep> {
    private static long[] klme;
    public static final boolean c;
    private static int[] klls;
    private static final long sp = -609652864476130887L;
    private oe action;
    public static final boolean a;
    private int ticks;
    private int priority;
    private static int[] kllt;
    private BooleanSupplier condition;
    private static long[] klmd;
    public static final int b;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int ticks() {
        boolean bl2;
        Object object = sp;
        block10: while (true) {
            switch ((int)object) {
                case 681169337: {
                    break block10;
                }
                case 1623880637: {
                    object = od$ScriptTickStep.kllu("kloa", klmc(int ), (int)17) - od$ScriptTickStep.kllu("klnz", klmc(int ), (int)16);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = sp - od$ScriptTickStep.kllu("klob", klmc(int ), (int)18)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == od$ScriptTickStep.kllu("kloc", kllr(int ), (int)37)) break;
            object2 = od$ScriptTickStep.kllu("klod", kllr(int ), (int)38);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = sp - od$ScriptTickStep.kllu("kloe", klmc(int ), (int)19)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == od$ScriptTickStep.kllu("klof", kllr(int ), (int)39)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = od$ScriptTickStep.kllu("klog", kllr(int ), (int)40);
        }
        if (bl2) return (int)od$ScriptTickStep.kllu("kloh", kllr(int ), (int)41);
        if (bl2) return (int)od$ScriptTickStep.kllu("kloh", kllr(int ), (int)41);
        Object object4 = sp;
        boolean bl4 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - od$ScriptTickStep.kllu("kloi", klmc(int ), (int)20);
            }
            switch ((int)object4) {
                case -1395111928: {
                    callSite = od$ScriptTickStep.kllu("kloj", klmc(int ), (int)21);
                    continue block13;
                }
                case -1060773588: {
                    callSite = od$ScriptTickStep.kllu("klok", klmc(int ), (int)22);
                    continue block13;
                }
                case 681169337: {
                    return this.ticks;
                }
                case 733726673: {
                    callSite = od$ScriptTickStep.kllu("klol", klmc(int ), (int)23);
                    continue block13;
                }
            }
            break;
        }
        return this.ticks;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void decrementTicks() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klnd", klmc(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptTickStep.kllu("klne", kllr(int ), (int)22)) break;
            v0 /* !! */  = (long)od$ScriptTickStep.kllu("klnf", kllr(int ), (int)23);
        }
        var3_1 = od$ScriptTickStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klng", klmc(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$ScriptTickStep.kllu("klnh", kllr(int ), (int)24)) break;
            v1 /* !! */  = (long)od$ScriptTickStep.kllu("klni", kllr(int ), (int)25);
        }
        var2_2 /* !! */  = od$ScriptTickStep.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klnj", klmc(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$ScriptTickStep.kllu("klnk", kllr(int ), (int)26)) break;
            v2 /* !! */  = (long)od$ScriptTickStep.kllu("klnl", kllr(int ), (int)27);
        }
        var1_3 = od$ScriptTickStep.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klnm", klmc(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == od$ScriptTickStep.kllu("klnn", kllr(int ), (int)28)) break;
                    v3 /* !! */  = (long)od$ScriptTickStep.kllu("klno", kllr(int ), (int)29);
                }
                v4 = this.ticks - od$ScriptTickStep.kllu("klnp", kllr(int ), (int)30);
                v5 /* !! */  = od$ScriptTickStep.sp;
                if (true) ** GOTO lbl41
                block18: while (true) {
                    v5 /* !! */  = (long)(v6 - od$ScriptTickStep.kllu("klnq", klmc(int ), (int)13));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1116541099: {
                            v6 = od$ScriptTickStep.kllu("klnr", klmc(int ), (int)14);
                            continue block18;
                        }
                        case 150161113: {
                            v6 = od$ScriptTickStep.kllu("klns", klmc(int ), (int)15);
                            continue block18;
                        }
                        case 681169337: {
                            break block18;
                        }
                    }
                    break;
                }
                this.ticks = v4;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl53:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klnt", kllr(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: {
                var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klnu", kllr(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
            }
lbl62:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klnv", kllr(int ), (int)33);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klnw", kllr(int ), (int)34);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klnx", kllr(int ), (int)35);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klny", kllr(int ), (int)36);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void klxn() {
        od$ScriptTickStep.klls[100] = 1658071914;
        od$ScriptTickStep.klls[101] = -1607640473;
        od$ScriptTickStep.klls[102] = 1093871180;
        od$ScriptTickStep.klls[103] = 1658455458;
        od$ScriptTickStep.klls[104] = 1435258726;
        od$ScriptTickStep.klls[105] = 891073676;
        od$ScriptTickStep.klls[106] = -1944010479;
        od$ScriptTickStep.klls[107] = -238602836;
        od$ScriptTickStep.klls[108] = 1057753565;
        od$ScriptTickStep.klls[109] = -1957493518;
        od$ScriptTickStep.klls[110] = -270073782;
        od$ScriptTickStep.klls[111] = -530890639;
        od$ScriptTickStep.klls[112] = -826371601;
        od$ScriptTickStep.klls[113] = -1325491396;
        od$ScriptTickStep.klls[114] = 1878134252;
        od$ScriptTickStep.klls[115] = -597035389;
        od$ScriptTickStep.klls[116] = -815696682;
        od$ScriptTickStep.klls[117] = -329519543;
        od$ScriptTickStep.klls[118] = 1634731598;
        od$ScriptTickStep.klls[119] = -1265088306;
        od$ScriptTickStep.klls[120] = 1198418838;
        od$ScriptTickStep.klls[121] = 143715413;
        od$ScriptTickStep.klls[122] = 1654641522;
        od$ScriptTickStep.klls[123] = 694622422;
        od$ScriptTickStep.klls[124] = 1677982440;
        od$ScriptTickStep.klls[125] = 597409185;
    }

    private static /* synthetic */ void klxy() {
        od$ScriptTickStep.klmd[0] = 2923314395415779986L;
        od$ScriptTickStep.klmd[1] = 3252202002033802098L;
        od$ScriptTickStep.klmd[2] = -809243094395834605L;
        od$ScriptTickStep.klmd[3] = 5758239945351492652L;
        od$ScriptTickStep.klmd[4] = 1694710063020191826L;
        od$ScriptTickStep.klmd[5] = -1528280259069116052L;
        od$ScriptTickStep.klmd[6] = 5523322626153700251L;
        od$ScriptTickStep.klmd[7] = 395087351151758047L;
        od$ScriptTickStep.klmd[8] = 5079965935290479293L;
        od$ScriptTickStep.klmd[9] = -1909954175518195524L;
        od$ScriptTickStep.klmd[10] = 4570076441094250644L;
        od$ScriptTickStep.klmd[11] = 5584751079990310220L;
        od$ScriptTickStep.klmd[12] = 2270507176268455065L;
        od$ScriptTickStep.klmd[13] = -5803757114564433887L;
        od$ScriptTickStep.klmd[14] = -3222690924871641613L;
        od$ScriptTickStep.klmd[15] = -7860476221631919810L;
        od$ScriptTickStep.klmd[16] = -5813340796854460855L;
        od$ScriptTickStep.klmd[17] = -3073846129748021304L;
        od$ScriptTickStep.klmd[18] = -5264161353959239300L;
        od$ScriptTickStep.klmd[19] = 3341688967021292481L;
        od$ScriptTickStep.klmd[20] = 6155433861074024639L;
        od$ScriptTickStep.klmd[21] = 1648198331239632392L;
        od$ScriptTickStep.klmd[22] = 3711882052192995891L;
        od$ScriptTickStep.klmd[23] = -9052972623375915601L;
        od$ScriptTickStep.klmd[24] = 1158686791249798163L;
        od$ScriptTickStep.klmd[25] = -8348325702865701351L;
        od$ScriptTickStep.klmd[26] = -7120217862345441294L;
        od$ScriptTickStep.klmd[27] = -10687733002277058L;
        od$ScriptTickStep.klmd[28] = 2343183974048721957L;
        od$ScriptTickStep.klmd[29] = 2679959011453130117L;
        od$ScriptTickStep.klmd[30] = -8743644539376841242L;
        od$ScriptTickStep.klmd[31] = 8831794941559298581L;
        od$ScriptTickStep.klmd[32] = -1822936233269648196L;
        od$ScriptTickStep.klmd[33] = 3733614849667234752L;
        od$ScriptTickStep.klmd[34] = 101547112532802967L;
        od$ScriptTickStep.klmd[35] = -1088756882510835002L;
        od$ScriptTickStep.klmd[36] = 4661633954974580728L;
        od$ScriptTickStep.klmd[37] = 7815506940690965003L;
        od$ScriptTickStep.klmd[38] = 6625178544403956367L;
        od$ScriptTickStep.klmd[39] = 8116862770747219357L;
        od$ScriptTickStep.klmd[40] = -6312414513826222698L;
        od$ScriptTickStep.klmd[41] = 7366196478058024883L;
        od$ScriptTickStep.klmd[42] = -2590226638798295351L;
        od$ScriptTickStep.klmd[43] = 2093855042032234593L;
        od$ScriptTickStep.klmd[44] = 5892172536756317227L;
        od$ScriptTickStep.klmd[45] = 1083000620584331773L;
        od$ScriptTickStep.klmd[46] = 6236005199670333415L;
        od$ScriptTickStep.klmd[47] = -1717897424891684409L;
        od$ScriptTickStep.klmd[48] = 13673008174197195L;
        od$ScriptTickStep.klmd[49] = 7474335753851000999L;
        od$ScriptTickStep.klmd[50] = -5380737166760966457L;
        od$ScriptTickStep.klmd[51] = 1144176990246298419L;
        od$ScriptTickStep.klmd[52] = -7015805839392425410L;
        od$ScriptTickStep.klmd[53] = -2525867491451927954L;
        od$ScriptTickStep.klmd[54] = -1199864961611043190L;
        od$ScriptTickStep.klmd[55] = 5338331057114862882L;
        od$ScriptTickStep.klmd[56] = 902221224245565993L;
        od$ScriptTickStep.klmd[57] = 9162584629315710176L;
        od$ScriptTickStep.klmd[58] = -4659061551343003288L;
        od$ScriptTickStep.klmd[59] = -7617722274451745157L;
        od$ScriptTickStep.klmd[60] = -7317563570631043958L;
        od$ScriptTickStep.klmd[61] = 4691129685072645913L;
        od$ScriptTickStep.klmd[62] = 7740129190795708425L;
        od$ScriptTickStep.klmd[63] = 6668219811585915841L;
        od$ScriptTickStep.klmd[64] = 2952005673796473072L;
        od$ScriptTickStep.klmd[65] = -5736764209356938259L;
        od$ScriptTickStep.klmd[66] = 6545215867604451681L;
        od$ScriptTickStep.klmd[67] = -7659404005236574765L;
        od$ScriptTickStep.klmd[68] = 3736516749678340693L;
        od$ScriptTickStep.klmd[69] = -6700241057993203771L;
        od$ScriptTickStep.klmd[70] = 5228740290301959723L;
        od$ScriptTickStep.klmd[71] = -7015396216521376316L;
        od$ScriptTickStep.klmd[72] = 6156948359116606822L;
        od$ScriptTickStep.klmd[73] = 3655012605274294969L;
        od$ScriptTickStep.klmd[74] = 2479588798797889486L;
        od$ScriptTickStep.klmd[75] = -4716509319777838203L;
        od$ScriptTickStep.klmd[76] = 282503903665157303L;
        od$ScriptTickStep.klmd[77] = -6550569785617017641L;
        od$ScriptTickStep.klmd[78] = -3379915449357053737L;
    }

    public static /* synthetic */ CallSite kllu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void klxw() {
        od$ScriptTickStep.kllt[100] = -876982426;
        od$ScriptTickStep.kllt[101] = -1607640474;
        od$ScriptTickStep.kllt[102] = 1093871183;
        od$ScriptTickStep.kllt[103] = 1658455456;
        od$ScriptTickStep.kllt[104] = 1435258727;
        od$ScriptTickStep.kllt[105] = 891073678;
        od$ScriptTickStep.kllt[106] = -1944010480;
        od$ScriptTickStep.kllt[107] = 979175497;
        od$ScriptTickStep.kllt[108] = -1057753566;
        od$ScriptTickStep.kllt[109] = 1273871139;
        od$ScriptTickStep.kllt[110] = -270073778;
        od$ScriptTickStep.kllt[111] = -530890637;
        od$ScriptTickStep.kllt[112] = -826371605;
        od$ScriptTickStep.kllt[113] = -1325491393;
        od$ScriptTickStep.kllt[114] = 1878134254;
        od$ScriptTickStep.kllt[115] = -597035390;
        od$ScriptTickStep.kllt[116] = -293366692;
        od$ScriptTickStep.kllt[117] = 329519542;
        od$ScriptTickStep.kllt[118] = 1627439556;
        od$ScriptTickStep.kllt[119] = -1185925944;
        od$ScriptTickStep.kllt[120] = 1198418839;
        od$ScriptTickStep.kllt[121] = 721743175;
        od$ScriptTickStep.kllt[122] = 1654641522;
        od$ScriptTickStep.kllt[123] = 694622421;
        od$ScriptTickStep.kllt[124] = 1677982440;
        od$ScriptTickStep.kllt[125] = 597409186;
    }

    private static /* synthetic */ void klxq() {
        od$ScriptTickStep.kllt[0] = -2078667507;
        od$ScriptTickStep.kllt[1] = -113296226;
        od$ScriptTickStep.kllt[2] = 931168482;
        od$ScriptTickStep.kllt[3] = 457168614;
        od$ScriptTickStep.kllt[4] = 63824791;
        od$ScriptTickStep.kllt[5] = 1343659536;
        od$ScriptTickStep.kllt[6] = -1033378020;
        od$ScriptTickStep.kllt[7] = -310267626;
        od$ScriptTickStep.kllt[8] = -852995815;
        od$ScriptTickStep.kllt[9] = -1537356248;
        od$ScriptTickStep.kllt[10] = 571492539;
        od$ScriptTickStep.kllt[11] = 1066116388;
        od$ScriptTickStep.kllt[12] = -1003059840;
        od$ScriptTickStep.kllt[13] = -1277225032;
        od$ScriptTickStep.kllt[14] = -41631226;
        od$ScriptTickStep.kllt[15] = 998948158;
        od$ScriptTickStep.kllt[16] = 1650133517;
        od$ScriptTickStep.kllt[17] = 674768212;
        od$ScriptTickStep.kllt[18] = -975535288;
        od$ScriptTickStep.kllt[19] = 1522945648;
        od$ScriptTickStep.kllt[20] = -1651581603;
        od$ScriptTickStep.kllt[21] = -1939715141;
        od$ScriptTickStep.kllt[22] = -2039439626;
        od$ScriptTickStep.kllt[23] = 417124983;
        od$ScriptTickStep.kllt[24] = 1186932238;
        od$ScriptTickStep.kllt[25] = -1666333113;
        od$ScriptTickStep.kllt[26] = 1288682132;
        od$ScriptTickStep.kllt[27] = -1321380466;
        od$ScriptTickStep.kllt[28] = 182844601;
        od$ScriptTickStep.kllt[29] = 309590926;
        od$ScriptTickStep.kllt[30] = 371897607;
        od$ScriptTickStep.kllt[31] = 856992502;
        od$ScriptTickStep.kllt[32] = -1934777717;
        od$ScriptTickStep.kllt[33] = 1347783193;
        od$ScriptTickStep.kllt[34] = -1907533987;
        od$ScriptTickStep.kllt[35] = 1839603068;
        od$ScriptTickStep.kllt[36] = -787087772;
        od$ScriptTickStep.kllt[37] = 324973097;
        od$ScriptTickStep.kllt[38] = 1908234497;
        od$ScriptTickStep.kllt[39] = -1182991540;
        od$ScriptTickStep.kllt[40] = 1499684114;
        od$ScriptTickStep.kllt[41] = -478687518;
        od$ScriptTickStep.kllt[42] = -30299189;
        od$ScriptTickStep.kllt[43] = 1750540904;
        od$ScriptTickStep.kllt[44] = 1148738678;
        od$ScriptTickStep.kllt[45] = -982696477;
        od$ScriptTickStep.kllt[46] = -1942941019;
        od$ScriptTickStep.kllt[47] = -1114348707;
        od$ScriptTickStep.kllt[48] = -44454542;
        od$ScriptTickStep.kllt[49] = 1848659543;
        od$ScriptTickStep.kllt[50] = -1447760668;
        od$ScriptTickStep.kllt[51] = 1842718487;
        od$ScriptTickStep.kllt[52] = 535181789;
        od$ScriptTickStep.kllt[53] = 2019425039;
        od$ScriptTickStep.kllt[54] = -219797386;
        od$ScriptTickStep.kllt[55] = 1396415914;
        od$ScriptTickStep.kllt[56] = 56800574;
        od$ScriptTickStep.kllt[57] = 710058308;
        od$ScriptTickStep.kllt[58] = 1768330548;
        od$ScriptTickStep.kllt[59] = -342681350;
        od$ScriptTickStep.kllt[60] = 871838445;
        od$ScriptTickStep.kllt[61] = 52228555;
        od$ScriptTickStep.kllt[62] = 1514869907;
        od$ScriptTickStep.kllt[63] = 75743035;
        od$ScriptTickStep.kllt[64] = 2006315681;
        od$ScriptTickStep.kllt[65] = -55650807;
        od$ScriptTickStep.kllt[66] = 2037534668;
        od$ScriptTickStep.kllt[67] = -363712136;
        od$ScriptTickStep.kllt[68] = 1840777217;
        od$ScriptTickStep.kllt[69] = 1152678614;
        od$ScriptTickStep.kllt[70] = -145075788;
        od$ScriptTickStep.kllt[71] = -939458562;
        od$ScriptTickStep.kllt[72] = -111006477;
        od$ScriptTickStep.kllt[73] = 1363934439;
        od$ScriptTickStep.kllt[74] = -1189380730;
        od$ScriptTickStep.kllt[75] = -511999205;
        od$ScriptTickStep.kllt[76] = 7882290;
        od$ScriptTickStep.kllt[77] = 410236212;
        od$ScriptTickStep.kllt[78] = 699796614;
        od$ScriptTickStep.kllt[79] = 1209417285;
        od$ScriptTickStep.kllt[80] = 419064975;
        od$ScriptTickStep.kllt[81] = 556894154;
        od$ScriptTickStep.kllt[82] = -2037293520;
        od$ScriptTickStep.kllt[83] = -2116607011;
        od$ScriptTickStep.kllt[84] = 79377315;
        od$ScriptTickStep.kllt[85] = -1673634677;
        od$ScriptTickStep.kllt[86] = 236536125;
        od$ScriptTickStep.kllt[87] = -1597010772;
        od$ScriptTickStep.kllt[88] = -1637756103;
        od$ScriptTickStep.kllt[89] = 212961771;
        od$ScriptTickStep.kllt[90] = -849581869;
        od$ScriptTickStep.kllt[91] = -2113346885;
        od$ScriptTickStep.kllt[92] = 1689389181;
        od$ScriptTickStep.kllt[93] = 0x44341114;
        od$ScriptTickStep.kllt[94] = -397748819;
        od$ScriptTickStep.kllt[95] = 23803229;
        od$ScriptTickStep.kllt[96] = -213994474;
        od$ScriptTickStep.kllt[97] = -862416281;
        od$ScriptTickStep.kllt[98] = -2141586331;
        od$ScriptTickStep.kllt[99] = -1218300836;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oe action() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("kloq", klmc(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptTickStep.kllu("klor", kllr(int ), (int)46)) break;
            v0 /* !! */  = (long)od$ScriptTickStep.kllu("klos", kllr(int ), (int)47);
        }
        var3_1 = od$ScriptTickStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klot", klmc(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$ScriptTickStep.kllu("klou", kllr(int ), (int)48)) break;
            v1 /* !! */  = (long)od$ScriptTickStep.kllu("klov", kllr(int ), (int)49);
        }
        var2_2 = od$ScriptTickStep.b;
        v2 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptTickStep.kllu("klow", klmc(int ), (int)26));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1514454900: {
                    v3 = od$ScriptTickStep.kllu("klox", klmc(int ), (int)27);
                    continue block8;
                }
                case -329338915: {
                    v3 = od$ScriptTickStep.kllu("kloy", klmc(int ), (int)28);
                    continue block8;
                }
                case 138521912: {
                    v3 = od$ScriptTickStep.kllu("kloz", klmc(int ), (int)29);
                    continue block8;
                }
                case 681169337: {
                    break block8;
                }
            }
            break;
        }
        var1_3 = od$ScriptTickStep.a;
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
            if ((v4 /* !! */  = (cfr_temp_2 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klpa", klmc(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == od$ScriptTickStep.kllu("klpb", kllr(int ), (int)50)) break;
            v4 /* !! */  = (long)od$ScriptTickStep.kllu("klpc", kllr(int ), (int)51);
        }
        return this.action;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptTickStep priority(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klva", klmc(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptTickStep.kllu("klvb", kllr(int ), (int)106)) break;
            v0 /* !! */  = (long)od$ScriptTickStep.kllu("klvc", kllr(int ), (int)107);
        }
        var4_2 = od$ScriptTickStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klve", klmc(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$ScriptTickStep.kllu("klvf", kllr(int ), (int)108)) break;
            v1 /* !! */  = (long)od$ScriptTickStep.kllu("klvh", kllr(int ), (int)109);
        }
        var3_3 /* !! */  = od$ScriptTickStep.b;
        v2 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(od$ScriptTickStep.kllu("klvk", klmc(int ), (int)69) - od$ScriptTickStep.kllu("klvi", klmc(int ), (int)68));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 284867053: {
                    continue block17;
                }
                case 681169337: {
                    break block17;
                }
            }
            break;
        }
        var2_4 = od$ScriptTickStep.a;
        if (var4_2) {
            throw null;
lbl27:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                v3 /* !! */  = od$ScriptTickStep.sp;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(od$ScriptTickStep.kllu("klvo", klmc(int ), (int)71) - od$ScriptTickStep.kllu("klvn", klmc(int ), (int)70));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 681169337: {
                            break block19;
                        }
                        case 1252742117: {
                            continue block19;
                        }
                    }
                    break;
                }
                this.priority = var1_1;
                if (var2_4) ** continue;
                return this;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klvq", kllr(int ), (int)110);
                } while (!var4_2);
                throw null;
            }
lbl51:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klvs", kllr(int ), (int)111);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klvu", kllr(int ), (int)112);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klvw", kllr(int ), (int)113);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klvx", kllr(int ), (int)114);
        ** while (!var4_2)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long klmc(int n2) {
        return klmd[n2] ^ klme[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptTickStep condition(BooleanSupplier var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("kltp", klmc(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od$ScriptTickStep.kllu("kltr", kllr(int ), (int)95)) break;
            v0 /* !! */  = (long)od$ScriptTickStep.kllu("kltv", kllr(int ), (int)96);
        }
        var4_2 = od$ScriptTickStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("kltx", klmc(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == od$ScriptTickStep.kllu("klty", kllr(int ), (int)97)) break;
            v1 /* !! */  = (long)od$ScriptTickStep.kllu("klua", kllr(int ), (int)98);
        }
        var3_3 /* !! */  = od$ScriptTickStep.b;
        v2 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptTickStep.kllu("klub", klmc(int ), (int)62));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 681169337: {
                    break block14;
                }
                case 1540283070: {
                    v3 = od$ScriptTickStep.kllu("klud", klmc(int ), (int)63);
                    continue block14;
                }
                case 2006231151: {
                    v3 = od$ScriptTickStep.kllu("kluf", klmc(int ), (int)64);
                    continue block14;
                }
            }
            break;
        }
        var2_4 = od$ScriptTickStep.a;
        if (var4_2) {
            throw null;
lbl29:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("kluj", klmc(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == od$ScriptTickStep.kllu("kluk", kllr(int ), (int)99)) break;
                    v4 /* !! */  = (long)od$ScriptTickStep.kllu("klul", kllr(int ), (int)100);
                }
                this.condition = var1_1;
                if (var2_4) ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klun", kllr(int ), (int)101);
                if (!var4_2) break;
                throw null;
            }
lbl48:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klup", kllr(int ), (int)102);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klus", kllr(int ), (int)103);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("kluu", kllr(int ), (int)104);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("kluw", kllr(int ), (int)105);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptTickStep action(oe var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klso", klmc(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od$ScriptTickStep.kllu("klsq", kllr(int ), (int)84)) break;
            v0 /* !! */  = (long)od$ScriptTickStep.kllu("klsr", kllr(int ), (int)85);
        }
        var4_2 = od$ScriptTickStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klss", klmc(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == od$ScriptTickStep.kllu("klst", kllr(int ), (int)86)) break;
            v1 /* !! */  = (long)od$ScriptTickStep.kllu("klsu", kllr(int ), (int)87);
        }
        var3_3 /* !! */  = od$ScriptTickStep.b;
        v2 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptTickStep.kllu("klsv", klmc(int ), (int)56));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 81759037: {
                    v3 = od$ScriptTickStep.kllu("klsw", klmc(int ), (int)57);
                    continue block14;
                }
                case 681169337: {
                    break block14;
                }
                case 2070747782: {
                    v3 = od$ScriptTickStep.kllu("klsx", klmc(int ), (int)58);
                    continue block14;
                }
            }
            break;
        }
        var2_4 = od$ScriptTickStep.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klsy", klmc(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == od$ScriptTickStep.kllu("klta", kllr(int ), (int)88)) break;
                    v4 /* !! */  = (long)od$ScriptTickStep.kllu("kltc", kllr(int ), (int)89);
                }
                this.action = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klte", kllr(int ), (int)90);
                if (var4_2) {
                    throw null;
                }
            }
lbl48:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("kltg", kllr(int ), (int)91);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl58
            }
lbl53:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klti", kllr(int ), (int)92);
                    if (!var4_2) ** GOTO lbl48
                    throw null;
                }
            }
lbl58:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("kltk", kllr(int ), (int)93);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("kltm", kllr(int ), (int)94);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    static {
        klls = new int[126];
        kllt = new int[126];
        od$ScriptTickStep.klxf();
        od$ScriptTickStep.klxn();
        od$ScriptTickStep.klxq();
        od$ScriptTickStep.klxw();
        klmd = new long[79];
        klme = new long[79];
        od$ScriptTickStep.klxy();
        od$ScriptTickStep.klyc();
    }

    private static /* synthetic */ int kllr(int n2) {
        return klls[n2] ^ kllt[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int priority() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klqa", klmc(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptTickStep.kllu("klqb", kllr(int ), (int)64)) break;
            v0 /* !! */  = (long)od$ScriptTickStep.kllu("klqd", kllr(int ), (int)65);
        }
        var3_1 = od$ScriptTickStep.c;
        v1 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(od$ScriptTickStep.kllu("klqh", klmc(int ), (int)42) - od$ScriptTickStep.kllu("klqf", klmc(int ), (int)41));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -6433290: {
                    continue block11;
                }
                case 681169337: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = od$ScriptTickStep.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klqj", klmc(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$ScriptTickStep.kllu("klql", kllr(int ), (int)66)) break;
            v2 /* !! */  = (long)od$ScriptTickStep.kllu("klqn", kllr(int ), (int)67);
        }
        var1_3 = od$ScriptTickStep.a;
        if (var3_1) {
            throw null;
            return (int)od$ScriptTickStep.kllu("klqo", kllr(int ), (int)68);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klqp", klmc(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == od$ScriptTickStep.kllu("klqq", kllr(int ), (int)69)) break;
                    v3 /* !! */  = (long)od$ScriptTickStep.kllu("klqr", kllr(int ), (int)70);
                }
                return this.priority;
            }
            case 0: {
                var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klqs", kllr(int ), (int)71);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klqt", kllr(int ), (int)72);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klqu", kllr(int ), (int)73);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klqx", kllr(int ), (int)74);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void klyc() {
        od$ScriptTickStep.klme[0] = -6458282870448761134L;
        od$ScriptTickStep.klme[1] = -8565588057175127578L;
        od$ScriptTickStep.klme[2] = -6437518516878090575L;
        od$ScriptTickStep.klme[3] = 775330120863467103L;
        od$ScriptTickStep.klme[4] = 6268515802512697596L;
        od$ScriptTickStep.klme[5] = 7015453529103074907L;
        od$ScriptTickStep.klme[6] = -7939260324513594751L;
        od$ScriptTickStep.klme[7] = 3362648831491691575L;
        od$ScriptTickStep.klme[8] = 282437439667995558L;
        od$ScriptTickStep.klme[9] = -4589084392959198850L;
        od$ScriptTickStep.klme[10] = 8154415137544778915L;
        od$ScriptTickStep.klme[11] = 3632245112430944948L;
        od$ScriptTickStep.klme[12] = 269586197559000226L;
        od$ScriptTickStep.klme[13] = 9151545110237036721L;
        od$ScriptTickStep.klme[14] = 4878430651585872489L;
        od$ScriptTickStep.klme[15] = 4975837168443286202L;
        od$ScriptTickStep.klme[16] = 2785450597689981939L;
        od$ScriptTickStep.klme[17] = -3531563059250127151L;
        od$ScriptTickStep.klme[18] = -405317041268855958L;
        od$ScriptTickStep.klme[19] = -8111229805833528503L;
        od$ScriptTickStep.klme[20] = -3291774057087409805L;
        od$ScriptTickStep.klme[21] = 8187204358168529688L;
        od$ScriptTickStep.klme[22] = -923977738983364599L;
        od$ScriptTickStep.klme[23] = -6921837268105764688L;
        od$ScriptTickStep.klme[24] = 8420216120015944587L;
        od$ScriptTickStep.klme[25] = -8318399098370407160L;
        od$ScriptTickStep.klme[26] = 6230697813424243004L;
        od$ScriptTickStep.klme[27] = -421886879601283099L;
        od$ScriptTickStep.klme[28] = -7130312306006909753L;
        od$ScriptTickStep.klme[29] = 8512241285376853388L;
        od$ScriptTickStep.klme[30] = 439304588545919802L;
        od$ScriptTickStep.klme[31] = 5871861657860723929L;
        od$ScriptTickStep.klme[32] = 3864615022470256663L;
        od$ScriptTickStep.klme[33] = -4237432711115081284L;
        od$ScriptTickStep.klme[34] = 4470304744784924784L;
        od$ScriptTickStep.klme[35] = -1601650069810219746L;
        od$ScriptTickStep.klme[36] = -2927691945937406244L;
        od$ScriptTickStep.klme[37] = -1307363820674017890L;
        od$ScriptTickStep.klme[38] = 5763988478588319150L;
        od$ScriptTickStep.klme[39] = -509217923578191181L;
        od$ScriptTickStep.klme[40] = -2869046769242571590L;
        od$ScriptTickStep.klme[41] = 77768657205949503L;
        od$ScriptTickStep.klme[42] = 1356610731653449764L;
        od$ScriptTickStep.klme[43] = -3951332868978143642L;
        od$ScriptTickStep.klme[44] = -2308510313161194778L;
        od$ScriptTickStep.klme[45] = 756156668526074755L;
        od$ScriptTickStep.klme[46] = 726168455412971131L;
        od$ScriptTickStep.klme[47] = 195940794115483417L;
        od$ScriptTickStep.klme[48] = -1436893015257386937L;
        od$ScriptTickStep.klme[49] = -5559249034212828177L;
        od$ScriptTickStep.klme[50] = -6806458516888649041L;
        od$ScriptTickStep.klme[51] = -6449960884056991091L;
        od$ScriptTickStep.klme[52] = 5469617429538745118L;
        od$ScriptTickStep.klme[53] = 6718858293463531844L;
        od$ScriptTickStep.klme[54] = -5790480430939238871L;
        od$ScriptTickStep.klme[55] = -7363733267046906711L;
        od$ScriptTickStep.klme[56] = -8703450803288491637L;
        od$ScriptTickStep.klme[57] = 4728252622064592063L;
        od$ScriptTickStep.klme[58] = 1538212283579624548L;
        od$ScriptTickStep.klme[59] = 705423403318426641L;
        od$ScriptTickStep.klme[60] = 496414990547113010L;
        od$ScriptTickStep.klme[61] = -8743166052778351698L;
        od$ScriptTickStep.klme[62] = 4080467254351427786L;
        od$ScriptTickStep.klme[63] = 5421635515262117598L;
        od$ScriptTickStep.klme[64] = -7083025110198089788L;
        od$ScriptTickStep.klme[65] = -6369994096372296140L;
        od$ScriptTickStep.klme[66] = -7583882210917377225L;
        od$ScriptTickStep.klme[67] = -7363054649147899966L;
        od$ScriptTickStep.klme[68] = -6496080253078629763L;
        od$ScriptTickStep.klme[69] = 834505095320368853L;
        od$ScriptTickStep.klme[70] = 2003167840407350707L;
        od$ScriptTickStep.klme[71] = 4839066010050213593L;
        od$ScriptTickStep.klme[72] = 3037343160792553095L;
        od$ScriptTickStep.klme[73] = 8163500833191562801L;
        od$ScriptTickStep.klme[74] = 6671961438521691365L;
        od$ScriptTickStep.klme[75] = 3996309239762821167L;
        od$ScriptTickStep.klme[76] = -8471523001374590914L;
        od$ScriptTickStep.klme[77] = 6717764322314488701L;
        od$ScriptTickStep.klme[78] = 595964050336886997L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptTickStep ticks(int var1_1) {
        v0 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - od$ScriptTickStep.kllu("klrd", klmc(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1459347785: {
                    v1 = od$ScriptTickStep.kllu("klrf", klmc(int ), (int)46);
                    continue block18;
                }
                case 681169337: {
                    break block18;
                }
                case 2017754008: {
                    v1 = od$ScriptTickStep.kllu("klrh", klmc(int ), (int)47);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = od$ScriptTickStep.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klrl", klmc(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$ScriptTickStep.kllu("klrm", kllr(int ), (int)75)) break;
            v2 /* !! */  = (long)od$ScriptTickStep.kllu("klro", kllr(int ), (int)76);
        }
        var3_3 /* !! */  = od$ScriptTickStep.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klrq", klmc(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == od$ScriptTickStep.kllu("klrs", kllr(int ), (int)77)) break;
                    v3 /* !! */  = (long)od$ScriptTickStep.kllu("klrt", kllr(int ), (int)78);
                }
                var2_4 = od$ScriptTickStep.a;
                if (var4_2) {
                    throw null;
lbl34:
                    // 2 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl34
                v4 /* !! */  = od$ScriptTickStep.sp;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - od$ScriptTickStep.kllu("klrv", klmc(int ), (int)50));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1333920662: {
                            v5 = od$ScriptTickStep.kllu("klrx", klmc(int ), (int)51);
                            continue block22;
                        }
                        case 681169337: {
                            break block22;
                        }
                        case 1572143452: {
                            v5 = od$ScriptTickStep.kllu("klrz", klmc(int ), (int)52);
                            continue block22;
                        }
                        case 1727198891: {
                            v5 = od$ScriptTickStep.kllu("klsa", klmc(int ), (int)53);
                            continue block22;
                        }
                    }
                    break;
                }
                this.ticks = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klsd", kllr(int ), (int)79);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klse", kllr(int ), (int)80);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klsg", kllr(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klsi", kllr(int ), (int)82);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klsk", kllr(int ), (int)83);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptTickStep(int var1_1, oe var2_2, BooleanSupplier var3_3, int var4_4) {
        var6_5 /* !! */  = od$ScriptTickStep.b;
        super();
        this.ticks = var1_1;
        this.action = var2_2;
        this.condition = var3_3;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.priority = var4_4;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("kllv", kllr(int ), (int)0);
                ** GOTO lbl17
            }
            case 1: {
                var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("kllw", kllr(int ), (int)1);
                ** GOTO lbl21
            }
lbl17:
            // 3 sources

            case 2: {
                while (true) {
                    var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("kllx", kllr(int ), (int)2);
                }
            }
lbl21:
            // 2 sources

            case 3: {
                var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("klly", kllr(int ), (int)3);
            }
            case 4: {
                var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("kllz", kllr(int ), (int)4);
                ** GOTO lbl17
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("klma", kllr(int ), (int)5);
                    break;
                }
            }
            case 6: 
        }
        var6_5 /* !! */  = (int)od$ScriptTickStep.kllu("klmb", kllr(int ), (int)6);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public int compareTo(od$ScriptTickStep var1_1) {
        block25: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klmf", klmc(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == od$ScriptTickStep.kllu("klmg", kllr(int ), (int)7)) break;
                v0 /* !! */  = (long)od$ScriptTickStep.kllu("klmh", kllr(int ), (int)8);
            }
            var4_2 = od$ScriptTickStep.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klmi", klmc(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == od$ScriptTickStep.kllu("klmj", kllr(int ), (int)9)) break;
                v1 /* !! */  = (long)od$ScriptTickStep.kllu("klmk", kllr(int ), (int)10);
            }
            var3_3 /* !! */  = od$ScriptTickStep.b;
            while (true) {
                block26: {
                    if ((v2 /* !! */  = (cfr_temp_3 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klml", klmc(int ), (int)2)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  != od$ScriptTickStep.kllu("klmm", kllr(int ), (int)11)) break block26;
                    var2_4 = od$ScriptTickStep.a;
                    if (var3_3 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v2 /* !! */  = (long)od$ScriptTickStep.kllu("klmn", kllr(int ), (int)12);
            }
            cfr_temp_0 = -2147483648;
            block15: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_2) {
                            throw null;
                        }
                        if (var2_4 != false) return (int)od$ScriptTickStep.kllu("klmo", kllr(int ), (int)13);
                        if (var2_4 != false) return (int)od$ScriptTickStep.kllu("klmo", kllr(int ), (int)13);
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_4 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klmp", klmc(int ), (int)3)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  != od$ScriptTickStep.kllu("klmq", kllr(int ), (int)14)) ** GOTO lbl37
                            v4 = var1_1.priority();
                            v5 /* !! */  = od$ScriptTickStep.sp;
                            if (true) ** GOTO lbl50
lbl37:
                            // 1 sources

                            v3 /* !! */  = (long)od$ScriptTickStep.kllu("klmr", kllr(int ), (int)15);
                        }
                    }
                    case 0: {
                        do {
                            var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klmz", kllr(int ), (int)18);
                        } while (!var4_2);
                        throw null;
                    }
                    case 1: {
                        ** GOTO lbl69
                    }
                    case 3: {
                        break block25;
                    }
                    block18: while (true) {
                        v5 /* !! */  = (long)(v6 - od$ScriptTickStep.kllu("klms", klmc(int ), (int)4));
lbl50:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1594337966: {
                                v6 = od$ScriptTickStep.kllu("klmt", klmc(int ), (int)5);
                                continue block18;
                            }
                            case 140899152: {
                                v6 = od$ScriptTickStep.kllu("klmu", klmc(int ), (int)6);
                                continue block18;
                            }
                            case 395637383: {
                                v6 = od$ScriptTickStep.kllu("klmv", klmc(int ), (int)7);
                                continue block18;
                            }
                            case 681169337: {
                                break block18;
                            }
                        }
                        break;
                    }
                    v7 = this.priority();
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_5 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klmw", klmc(int ), (int)8)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == od$ScriptTickStep.kllu("klmx", kllr(int ), (int)16)) {
                            return Integer.compare(v4, v7);
                        }
                        v8 /* !! */  = (long)od$ScriptTickStep.kllu("klmy", kllr(int ), (int)17);
                    }
lbl69:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klna", kllr(int ), (int)19);
                        cfr_temp_0 = 2;
                        if (!var4_2) continue block15;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klnb", kllr(int ), (int)20);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)od$ScriptTickStep.kllu("klnc", kllr(int ), (int)21);
        ** while (!var4_2)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public BooleanSupplier condition() {
        v0 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - od$ScriptTickStep.kllu("klph", klmc(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2058136884: {
                    v1 = od$ScriptTickStep.kllu("klpi", klmc(int ), (int)32);
                    continue block17;
                }
                case -1146626213: {
                    v1 = od$ScriptTickStep.kllu("klpj", klmc(int ), (int)33);
                    continue block17;
                }
                case 230887684: {
                    v1 = od$ScriptTickStep.kllu("klpk", klmc(int ), (int)34);
                    continue block17;
                }
                case 681169337: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = od$ScriptTickStep.c;
        v2 /* !! */  = od$ScriptTickStep.sp;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptTickStep.kllu("klpl", klmc(int ), (int)35));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1713300848: {
                    v3 = od$ScriptTickStep.kllu("klpm", klmc(int ), (int)36);
                    continue block18;
                }
                case -1276012664: {
                    v3 = od$ScriptTickStep.kllu("klpn", klmc(int ), (int)37);
                    continue block18;
                }
                case 681169337: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = od$ScriptTickStep.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klpo", klmc(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == od$ScriptTickStep.kllu("klpp", kllr(int ), (int)56)) break;
            v4 /* !! */  = (long)od$ScriptTickStep.kllu("klpq", kllr(int ), (int)57);
        }
        var1_3 = od$ScriptTickStep.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = od$ScriptTickStep.sp - od$ScriptTickStep.kllu("klpr", klmc(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == od$ScriptTickStep.kllu("klps", kllr(int ), (int)58)) break;
                    v5 /* !! */  = (long)od$ScriptTickStep.kllu("klpt", kllr(int ), (int)59);
                }
                return this.condition;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klpu", kllr(int ), (int)60);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klpv", kllr(int ), (int)61);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klpw", kllr(int ), (int)62);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)od$ScriptTickStep.kllu("klpx", kllr(int ), (int)63);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void klxf() {
        od$ScriptTickStep.klls[0] = -2078667512;
        od$ScriptTickStep.klls[1] = -113296232;
        od$ScriptTickStep.klls[2] = 931168487;
        od$ScriptTickStep.klls[3] = 457168612;
        od$ScriptTickStep.klls[4] = 63824786;
        od$ScriptTickStep.klls[5] = 1343659537;
        od$ScriptTickStep.klls[6] = -1033378023;
        od$ScriptTickStep.klls[7] = -310267625;
        od$ScriptTickStep.klls[8] = -2051242734;
        od$ScriptTickStep.klls[9] = -1537356247;
        od$ScriptTickStep.klls[10] = -1023044084;
        od$ScriptTickStep.klls[11] = -1066116389;
        od$ScriptTickStep.klls[12] = -424064954;
        od$ScriptTickStep.klls[13] = -390541359;
        od$ScriptTickStep.klls[14] = 41631225;
        od$ScriptTickStep.klls[15] = 1919879822;
        od$ScriptTickStep.klls[16] = -1650133518;
        od$ScriptTickStep.klls[17] = 699030236;
        od$ScriptTickStep.klls[18] = -975535287;
        od$ScriptTickStep.klls[19] = 1522945650;
        od$ScriptTickStep.klls[20] = -1651581602;
        od$ScriptTickStep.klls[21] = -1939715142;
        od$ScriptTickStep.klls[22] = 2039439625;
        od$ScriptTickStep.klls[23] = -460034790;
        od$ScriptTickStep.klls[24] = -1186932239;
        od$ScriptTickStep.klls[25] = -584911120;
        od$ScriptTickStep.klls[26] = -1288682133;
        od$ScriptTickStep.klls[27] = -106733037;
        od$ScriptTickStep.klls[28] = -182844602;
        od$ScriptTickStep.klls[29] = -1224071643;
        od$ScriptTickStep.klls[30] = 371897606;
        od$ScriptTickStep.klls[31] = 856992502;
        od$ScriptTickStep.klls[32] = -1934777719;
        od$ScriptTickStep.klls[33] = 1347783194;
        od$ScriptTickStep.klls[34] = -1907533991;
        od$ScriptTickStep.klls[35] = 1839603071;
        od$ScriptTickStep.klls[36] = -787087775;
        od$ScriptTickStep.klls[37] = -324973098;
        od$ScriptTickStep.klls[38] = 1591547120;
        od$ScriptTickStep.klls[39] = -1182991539;
        od$ScriptTickStep.klls[40] = 1961206594;
        od$ScriptTickStep.klls[41] = 1107310274;
        od$ScriptTickStep.klls[42] = -30299190;
        od$ScriptTickStep.klls[43] = 1750540905;
        od$ScriptTickStep.klls[44] = 1148738677;
        od$ScriptTickStep.klls[45] = -982696479;
        od$ScriptTickStep.klls[46] = 1942941018;
        od$ScriptTickStep.klls[47] = -1997053854;
        od$ScriptTickStep.klls[48] = 44454541;
        od$ScriptTickStep.klls[49] = -146562019;
        od$ScriptTickStep.klls[50] = -1447760667;
        od$ScriptTickStep.klls[51] = -873639531;
        od$ScriptTickStep.klls[52] = 535181790;
        od$ScriptTickStep.klls[53] = 2019425039;
        od$ScriptTickStep.klls[54] = -219797385;
        od$ScriptTickStep.klls[55] = 1396415912;
        od$ScriptTickStep.klls[56] = -56800575;
        od$ScriptTickStep.klls[57] = 1504876897;
        od$ScriptTickStep.klls[58] = 1768330549;
        od$ScriptTickStep.klls[59] = -1730628629;
        od$ScriptTickStep.klls[60] = 871838445;
        od$ScriptTickStep.klls[61] = 52228554;
        od$ScriptTickStep.klls[62] = 1514869904;
        od$ScriptTickStep.klls[63] = 75743034;
        od$ScriptTickStep.klls[64] = -2006315682;
        od$ScriptTickStep.klls[65] = -2010447255;
        od$ScriptTickStep.klls[66] = 2037534669;
        od$ScriptTickStep.klls[67] = 688400531;
        od$ScriptTickStep.klls[68] = -69888364;
        od$ScriptTickStep.klls[69] = 1152678615;
        od$ScriptTickStep.klls[70] = 680454155;
        od$ScriptTickStep.klls[71] = -939458562;
        od$ScriptTickStep.klls[72] = -111006478;
        od$ScriptTickStep.klls[73] = 1363934436;
        od$ScriptTickStep.klls[74] = -1189380731;
        od$ScriptTickStep.klls[75] = -511999206;
        od$ScriptTickStep.klls[76] = -637581552;
        od$ScriptTickStep.klls[77] = 410236213;
        od$ScriptTickStep.klls[78] = 1295673239;
        od$ScriptTickStep.klls[79] = 1209417284;
        od$ScriptTickStep.klls[80] = 419064974;
        od$ScriptTickStep.klls[81] = 556894155;
        od$ScriptTickStep.klls[82] = -2037293518;
        od$ScriptTickStep.klls[83] = -2116607010;
        od$ScriptTickStep.klls[84] = -79377316;
        od$ScriptTickStep.klls[85] = 1378556536;
        od$ScriptTickStep.klls[86] = 236536124;
        od$ScriptTickStep.klls[87] = 1169290397;
        od$ScriptTickStep.klls[88] = -1637756104;
        od$ScriptTickStep.klls[89] = -745921819;
        od$ScriptTickStep.klls[90] = -849581872;
        od$ScriptTickStep.klls[91] = -2113346886;
        od$ScriptTickStep.klls[92] = 1689389183;
        od$ScriptTickStep.klls[93] = 1144262928;
        od$ScriptTickStep.klls[94] = -397748817;
        od$ScriptTickStep.klls[95] = 23803228;
        od$ScriptTickStep.klls[96] = -1197123201;
        od$ScriptTickStep.klls[97] = -862416282;
        od$ScriptTickStep.klls[98] = -611978991;
        od$ScriptTickStep.klls[99] = 1218300835;
    }
}

