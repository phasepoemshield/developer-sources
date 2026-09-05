/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package ruhack.phobia;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Collections;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import ruhack.phobia.od$FiniteLoopStrategy;
import ruhack.phobia.od$LoopStrategy;
import ruhack.phobia.od$ScriptStep;
import ruhack.phobia.od$ScriptTickStep;
import ruhack.phobia.oe;
import ruhack.phobia.pr;

public class od {
    private int currentTickStepIndex;
    private static long[] mcas;
    private final List<od$ScriptStep> scriptSteps;
    private static int[] mcaf;
    private static int[] mcae;
    private boolean interrupt;
    private int currentStepIndex;
    private final pr time;
    private final List<od$ScriptTickStep> scriptTickSteps;
    public static final boolean c;
    private static long[] mcar;
    static final long va = -3927135925139048993L;
    public static final int b;
    public static final boolean a;
    private od$LoopStrategy loopStrategy;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$addStep$1() {
        block23: {
            v0 /* !! */  = od.va;
            block14: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -714508833: {
                        break block14;
                    }
                    case 1363063235: {
                        v0 /* !! */  = (long)(od.mcag("mdhs", mcaq(int ), (int)410) - od.mcag("mdhr", mcaq(int ), (int)409));
                        continue block14;
                    }
                }
                break;
            }
            var2 = od.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mdht", mcaq(int ), (int)411)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == od.mcag("mdhu", mcad(int ), (int)456)) break;
                v1 /* !! */  = (long)od.mcag("mdhv", mcad(int ), (int)457);
            }
            var1_1 /* !! */  = od.b;
            v2 /* !! */  = od.va;
            block16: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -714508833: {
                        break block16;
                    }
                    case -70745426: {
                        v2 /* !! */  = (long)(od.mcag("mdhx", mcaq(int ), (int)413) - od.mcag("mdhw", mcaq(int ), (int)412));
                        continue block16;
                    }
                }
                break;
            }
            var0_2 = od.a;
            if (var2) {
                throw null;
            }
            if (var0_2) ** GOTO lbl34
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block17: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var0_2) ** GOTO lbl35
lbl34:
                        // 2 sources

                        return (boolean)od.mcag("mdhy", mcad(int ), (int)458);
lbl35:
                        // 1 sources

                        return (boolean)od.mcag("mdhz", mcad(int ), (int)459);
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)od.mcag("mdia", mcad(int ), (int)460);
                        cfr_temp_0 = 2;
                        if (!var2) continue block17;
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block23;
                    }
lbl45:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)od.mcag("mdib", mcad(int ), (int)461);
                        cfr_temp_0 = 2;
                        if (!var2) continue block17;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)od.mcag("mdic", mcad(int ), (int)462);
            if (!var2) ** break;
            throw null;
        }
        var1_1 /* !! */  = (int)od.mcag("mdid", mcad(int ), (int)463);
        ** while (!var2)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdis() {
        od.mcae[0] = -1962703385;
        od.mcae[1] = -713043267;
        od.mcae[2] = -1954372532;
        od.mcae[3] = 663334478;
        od.mcae[4] = 1940728523;
        od.mcae[5] = -341025763;
        od.mcae[6] = -1743871894;
        od.mcae[7] = 348729454;
        od.mcae[8] = -967131968;
        od.mcae[9] = 221259165;
        od.mcae[10] = -653938264;
        od.mcae[11] = 828034493;
        od.mcae[12] = 537797294;
        od.mcae[13] = 1317539633;
        od.mcae[14] = -304553594;
        od.mcae[15] = -1583740875;
        od.mcae[16] = -1966692688;
        od.mcae[17] = -1762836367;
        od.mcae[18] = 208064906;
        od.mcae[19] = -1528971702;
        od.mcae[20] = 422994707;
        od.mcae[21] = -250380624;
        od.mcae[22] = -306497360;
        od.mcae[23] = -2103045418;
        od.mcae[24] = -1522059077;
        od.mcae[25] = 1016754545;
        od.mcae[26] = 2078906391;
        od.mcae[27] = -994254566;
        od.mcae[28] = 1969588962;
        od.mcae[29] = 235000719;
        od.mcae[30] = 1598910755;
        od.mcae[31] = -1311380334;
        od.mcae[32] = -1902269848;
        od.mcae[33] = -1866241636;
        od.mcae[34] = -1031823181;
        od.mcae[35] = 449112627;
        od.mcae[36] = -1793993703;
        od.mcae[37] = -656499131;
        od.mcae[38] = 642526707;
        od.mcae[39] = -341103051;
        od.mcae[40] = 1246633014;
        od.mcae[41] = 375225382;
        od.mcae[42] = -1503773274;
        od.mcae[43] = -1132546984;
        od.mcae[44] = 1353284888;
        od.mcae[45] = 1918379614;
        od.mcae[46] = 1980769675;
        od.mcae[47] = -1896781199;
        od.mcae[48] = -1899994887;
        od.mcae[49] = -1602614610;
        od.mcae[50] = 1590943449;
        od.mcae[51] = 998903690;
        od.mcae[52] = 731530766;
        od.mcae[53] = -1141854755;
        od.mcae[54] = 1932660114;
        od.mcae[55] = -551899447;
        od.mcae[56] = -365453552;
        od.mcae[57] = -1673620026;
        od.mcae[58] = -1768127639;
        od.mcae[59] = -625505636;
        od.mcae[60] = -413977464;
        od.mcae[61] = -2094658050;
        od.mcae[62] = 488696527;
        od.mcae[63] = -76472081;
        od.mcae[64] = 234217911;
        od.mcae[65] = 143522300;
        od.mcae[66] = 45197007;
        od.mcae[67] = 2090441850;
        od.mcae[68] = -1202353265;
        od.mcae[69] = 1108675405;
        od.mcae[70] = 1534426217;
        od.mcae[71] = 69098133;
        od.mcae[72] = 1668633724;
        od.mcae[73] = 1410652440;
        od.mcae[74] = -1291985213;
        od.mcae[75] = -678153343;
        od.mcae[76] = 1233546542;
        od.mcae[77] = -468363326;
        od.mcae[78] = 128909101;
        od.mcae[79] = -1886648182;
        od.mcae[80] = -2018169382;
        od.mcae[81] = 113637710;
        od.mcae[82] = 1174823535;
        od.mcae[83] = -400408832;
        od.mcae[84] = 1197079663;
        od.mcae[85] = 1469875464;
        od.mcae[86] = -1640323602;
        od.mcae[87] = -2099206788;
        od.mcae[88] = 1593503982;
        od.mcae[89] = 1260910954;
        od.mcae[90] = -2048332543;
        od.mcae[91] = 607102544;
        od.mcae[92] = -1051056714;
        od.mcae[93] = -700305189;
        od.mcae[94] = -1388935624;
        od.mcae[95] = 495023180;
        od.mcae[96] = -745433080;
        od.mcae[97] = -1414241723;
        od.mcae[98] = 166161021;
        od.mcae[99] = -392694159;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addStep(int var1_1, oe var2_2, int var3_3) {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(od.mcag("mcci", mcaq(int ), (int)25) - od.mcag("mcch", mcaq(int ), (int)24));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -714508833: {
                    break block19;
                }
                case 109305373: {
                    continue block19;
                }
            }
            break;
        }
        var6_4 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mccj", mcaq(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od.mcag("mcck", mcad(int ), (int)25)) break;
            v1 /* !! */  = (long)od.mcag("mccl", mcad(int ), (int)26);
        }
        var5_5 /* !! */  = od.b;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - od.mcag("mccm", mcaq(int ), (int)27));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -714508833: {
                    break block21;
                }
                case -227521812: {
                    v3 = od.mcag("mccn", mcaq(int ), (int)28);
                    continue block21;
                }
                case 936485078: {
                    v3 = od.mcag("mcco", mcaq(int ), (int)29);
                    continue block21;
                }
            }
            break;
        }
        var4_6 = od.a;
        if (var6_4) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var4_6) ** GOTO lbl34
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6) ** continue;
                v4 /* !! */  = od.va;
                if (true) ** GOTO lbl45
                block23: while (true) {
                    v4 /* !! */  = (long)(od.mcag("mccq", mcaq(int ), (int)31) - od.mcag("mccp", mcaq(int ), (int)30));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -714508833: {
                            break block23;
                        }
                        case -136243166: {
                            continue block23;
                        }
                    }
                    break;
                }
                v5 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lambda$addStep$1(), ()Z)();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mccr", mcaq(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == od.mcag("mccs", mcad(int ), (int)27)) break;
                    v6 /* !! */  = (long)od.mcag("mcct", mcad(int ), (int)28);
                }
                return this.addStep(var1_1, var2_2, v5, var3_3);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)od.mcag("mccu", mcad(int ), (int)29);
                    if (!var6_4) break block9;
                    throw null;
                }
            }
            case 1: {
                do {
                    var5_5 /* !! */  = (int)od.mcag("mccv", mcad(int ), (int)30);
                } while (!var6_4);
                throw null;
            }
            case 2: {
                do {
                    var5_5 /* !! */  = (int)od.mcag("mccw", mcad(int ), (int)31);
                } while (!var6_4);
                throw null;
            }
            case 3: 
        }
        var5_5 /* !! */  = (int)od.mcag("mccx", mcad(int ), (int)32);
        ** while (!var6_4)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void update() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mclu", mcaq(int ), (int)153)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mclv", mcad(int ), (int)143)) break;
            v0 /* !! */  = (long)od.mcag("mclw", mcad(int ), (int)144);
        }
        var3_1 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl11
        block73: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mclx", mcaq(int ), (int)154));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1995092112: {
                    v2 = od.mcag("mcly", mcaq(int ), (int)155);
                    continue block73;
                }
                case -714508833: {
                    break block73;
                }
                case -657345013: {
                    v2 = od.mcag("mclz", mcaq(int ), (int)156);
                    continue block73;
                }
            }
            break;
        }
        var2_2 /* !! */  = od.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcma", mcaq(int ), (int)157)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == od.mcag("mcmb", mcad(int ), (int)145)) break;
            v3 /* !! */  = (long)od.mcag("mcmc", mcad(int ), (int)146);
        }
        var1_3 = od.a;
        if (var3_1) {
            throw null;
lbl29:
            // 11 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcmd", mcaq(int ), (int)158)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == od.mcag("mcme", mcad(int ), (int)147)) break;
            v4 /* !! */  = (long)od.mcag("mcmf", mcad(int ), (int)148);
        }
        v5 /* !! */  = od.va;
        if (true) ** GOTO lbl41
        block77: while (true) {
            v5 /* !! */  = (long)(v6 - od.mcag("mcmg", mcaq(int ), (int)159));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1604375089: {
                    v6 = od.mcag("mcmh", mcaq(int ), (int)160);
                    continue block77;
                }
                case -714508833: {
                    break block77;
                }
                case 1003062027: {
                    v6 = od.mcag("mcmi", mcaq(int ), (int)161);
                    continue block77;
                }
                case 2031953503: {
                    v6 = od.mcag("mcmj", mcaq(int ), (int)162);
                    continue block77;
                }
            }
            break;
        }
        if (!this.scriptSteps.isEmpty()) ** GOTO lbl70
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcmk", mcaq(int ), (int)163)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == od.mcag("mcml", mcad(int ), (int)149)) break;
                    v7 /* !! */  = (long)od.mcag("mcmm", mcad(int ), (int)150);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = od.va - od.mcag("mcmn", mcaq(int ), (int)164)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == od.mcag("mcmo", mcad(int ), (int)151)) break;
                    v8 /* !! */  = (long)od.mcag("mcmp", mcad(int ), (int)152);
                }
                if (this.scriptTickSteps.isEmpty()) ** GOTO lbl78
                if (var1_3) ** GOTO lbl29
lbl70:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = od.va - od.mcag("mcmq", mcaq(int ), (int)165)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == od.mcag("mcmr", mcad(int ), (int)153)) break;
                    v9 /* !! */  = (long)od.mcag("mcms", mcad(int ), (int)154);
                }
                if (!this.interrupt) ** GOTO lbl80
                if (var1_3) ** GOTO lbl29
lbl78:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                return;
lbl80:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v10 /* !! */  = od.va;
                if (true) ** GOTO lbl85
                block81: while (true) {
                    v10 /* !! */  = (long)(v11 - od.mcag("mcmt", mcaq(int ), (int)166));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1323911403: {
                            v11 = od.mcag("mcmu", mcaq(int ), (int)167);
                            continue block81;
                        }
                        case -897940219: {
                            v11 = od.mcag("mcmv", mcaq(int ), (int)168);
                            continue block81;
                        }
                        case -714508833: {
                            break block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = od.va - od.mcag("mcmw", mcaq(int ), (int)169)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == od.mcag("mcmx", mcad(int ), (int)155)) break;
                    v12 /* !! */  = (long)od.mcag("mcmy", mcad(int ), (int)156);
                }
                v13 = (Consumer<od$ScriptStep>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$update$4(ruhack.phobia.od$ScriptStep ), (Lruhack/phobia/od$ScriptStep;)V)((od)this);
                v14 /* !! */  = od.va;
                if (true) ** GOTO lbl104
                block83: while (true) {
                    v14 /* !! */  = (long)(v15 - od.mcag("mcmz", mcaq(int ), (int)170));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1909524965: {
                            v15 = od.mcag("mcna", mcaq(int ), (int)171);
                            continue block83;
                        }
                        case -999207011: {
                            v15 = od.mcag("mcnb", mcaq(int ), (int)172);
                            continue block83;
                        }
                        case -714508833: {
                            break block83;
                        }
                        case -78683197: {
                            v15 = od.mcag("mcnc", mcaq(int ), (int)173);
                            continue block83;
                        }
                    }
                    break;
                }
                this.scriptSteps.forEach(v13);
                if (var1_3 || var1_3) ** GOTO lbl29
                v16 /* !! */  = od.va;
                if (true) ** GOTO lbl122
                block84: while (true) {
                    v16 /* !! */  = (long)(od.mcag("mcne", mcaq(int ), (int)175) - od.mcag("mcnd", mcaq(int ), (int)174));
lbl122:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1689208094: {
                            continue block84;
                        }
                        case -714508833: {
                            break block84;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = od.va - od.mcag("mcnf", mcaq(int ), (int)176)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == od.mcag("mcng", mcad(int ), (int)157)) break;
                    v17 /* !! */  = (long)od.mcag("mcnh", mcad(int ), (int)158);
                }
                v18 = (Consumer<od$ScriptTickStep>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$update$5(ruhack.phobia.od$ScriptTickStep ), (Lruhack/phobia/od$ScriptTickStep;)V)((od)this);
                v19 /* !! */  = od.va;
                if (true) ** GOTO lbl137
                block86: while (true) {
                    v19 /* !! */  = (long)(v20 - od.mcag("mcni", mcaq(int ), (int)177));
lbl137:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -714508833: {
                            break block86;
                        }
                        case -426177768: {
                            v20 = od.mcag("mcnj", mcaq(int ), (int)178);
                            continue block86;
                        }
                        case -171260886: {
                            v20 = od.mcag("mcnk", mcaq(int ), (int)179);
                            continue block86;
                        }
                        case 1514045865: {
                            v20 = od.mcag("mcnl", mcaq(int ), (int)180);
                            continue block86;
                        }
                    }
                    break;
                }
                this.scriptTickSteps.forEach(v18);
                if (var1_3 || var1_3) ** GOTO lbl29
                v21 /* !! */  = od.va;
                if (true) ** GOTO lbl155
                block87: while (true) {
                    v21 /* !! */  = (long)(v22 - od.mcag("mcnm", mcaq(int ), (int)181));
lbl155:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1174161172: {
                            v22 = od.mcag("mcnn", mcaq(int ), (int)182);
                            continue block87;
                        }
                        case -714508833: {
                            break block87;
                        }
                        case 1039935429: {
                            v22 = od.mcag("mcno", mcaq(int ), (int)183);
                            continue block87;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = od.va - od.mcag("mcnp", mcaq(int ), (int)184)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == od.mcag("mcnq", mcad(int ), (int)159)) break;
                    v23 /* !! */  = (long)od.mcag("mcnr", mcad(int ), (int)160);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_9 = od.va - od.mcag("mcns", mcaq(int ), (int)185)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == od.mcag("mcnt", mcad(int ), (int)161)) break;
                    v24 /* !! */  = (long)od.mcag("mcnu", mcad(int ), (int)162);
                }
                v25 = this.scriptSteps.size();
                v26 /* !! */  = od.va;
                if (true) ** GOTO lbl179
                block90: while (true) {
                    v26 /* !! */  = (long)(v27 - od.mcag("mcnv", mcaq(int ), (int)186));
lbl179:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1824954093: {
                            v27 = od.mcag("mcnw", mcaq(int ), (int)187);
                            continue block90;
                        }
                        case -714508833: {
                            break block90;
                        }
                        case 1509082342: {
                            v27 = od.mcag("mcnx", mcaq(int ), (int)188);
                            continue block90;
                        }
                        case 1707619493: {
                            v27 = od.mcag("mcny", mcaq(int ), (int)189);
                            continue block90;
                        }
                    }
                    break;
                }
                v28 = Math.min(this.currentStepIndex, v25);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_10 = od.va - od.mcag("mcnz", mcaq(int ), (int)190)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == od.mcag("mcoa", mcad(int ), (int)163)) break;
                    v29 /* !! */  = (long)od.mcag("mcob", mcad(int ), (int)164);
                }
                this.currentStepIndex = v28;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_11 = od.va - od.mcag("mcoc", mcaq(int ), (int)191)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == od.mcag("mcod", mcad(int ), (int)165)) break;
                    v30 /* !! */  = (long)od.mcag("mcoe", mcad(int ), (int)166);
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_12 = od.va - od.mcag("mcof", mcaq(int ), (int)192)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == od.mcag("mcog", mcad(int ), (int)167)) break;
                    v31 /* !! */  = (long)od.mcag("mcoh", mcad(int ), (int)168);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_13 = od.va - od.mcag("mcoi", mcaq(int ), (int)193)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == od.mcag("mcoj", mcad(int ), (int)169)) break;
                    v32 /* !! */  = (long)od.mcag("mcok", mcad(int ), (int)170);
                }
                v33 = this.scriptTickSteps.size();
                v34 /* !! */  = od.va;
                if (true) ** GOTO lbl219
                block95: while (true) {
                    v34 /* !! */  = (long)(v35 - od.mcag("mcol", mcaq(int ), (int)194));
lbl219:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1325021240: {
                            v35 = od.mcag("mcom", mcaq(int ), (int)195);
                            continue block95;
                        }
                        case -714508833: {
                            break block95;
                        }
                        case -225609115: {
                            v35 = od.mcag("mcon", mcaq(int ), (int)196);
                            continue block95;
                        }
                    }
                    break;
                }
                v36 = Math.min(this.currentTickStepIndex, v33);
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_14 = od.va - od.mcag("mcoo", mcaq(int ), (int)197)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == od.mcag("mcop", mcad(int ), (int)171)) break;
                    v37 /* !! */  = (long)od.mcag("mcoq", mcad(int ), (int)172);
                }
                this.currentTickStepIndex = v36;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl238:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)od.mcag("mcor", mcad(int ), (int)173);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od.mcag("mcos", mcad(int ), (int)174);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl319
                    break;
                }
            }
lbl249:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)od.mcag("mcot", mcad(int ), (int)175);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 3: {
                var2_2 /* !! */  = (int)od.mcag("mcou", mcad(int ), (int)176);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 4: {
                var2_2 /* !! */  = (int)od.mcag("mcov", mcad(int ), (int)177);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl264:
            // 5 sources

            case 5: {
                var2_2 /* !! */  = (int)od.mcag("mcow", mcad(int ), (int)178);
                if (!var3_1) break;
                throw null;
            }
lbl268:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)od.mcag("mcox", mcad(int ), (int)179);
                if (!var3_1) ** GOTO lbl264
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)od.mcag("mcoy", mcad(int ), (int)180);
                if (!var3_1) ** GOTO lbl264
                throw null;
            }
lbl276:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)od.mcag("mcoz", mcad(int ), (int)181);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 9: {
                var2_2 /* !! */  = (int)od.mcag("mcpa", mcad(int ), (int)182);
                if (!var3_1) ** GOTO lbl268
                throw null;
            }
lbl285:
            // 3 sources

            case 10: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mcpb", mcad(int ), (int)183);
                } while (!var3_1);
                throw null;
            }
lbl290:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)od.mcag("mcpc", mcad(int ), (int)184);
                if (!var3_1) ** GOTO lbl238
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)od.mcag("mcpd", mcad(int ), (int)185);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 13: {
                var2_2 /* !! */  = (int)od.mcag("mcpe", mcad(int ), (int)186);
                if (!var3_1) ** GOTO lbl285
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)od.mcag("mcpf", mcad(int ), (int)187);
                if (var3_1) {
                    throw null;
                }
            }
lbl307:
            // 5 sources

            case 15: {
                var2_2 /* !! */  = (int)od.mcag("mcpg", mcad(int ), (int)188);
                if (!var3_1) ** GOTO lbl249
                throw null;
            }
lbl311:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)od.mcag("mcph", mcad(int ), (int)189);
                if (!var3_1) ** GOTO lbl264
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)od.mcag("mcpi", mcad(int ), (int)190);
                if (!var3_1) ** GOTO lbl276
                throw null;
            }
lbl319:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)od.mcag("mcpj", mcad(int ), (int)191);
                if (!var3_1) ** GOTO lbl290
                throw null;
            }
lbl323:
            // 2 sources

            case 19: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mcpk", mcad(int ), (int)192);
                } while (!var3_1);
                throw null;
            }
lbl328:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)od.mcag("mcpl", mcad(int ), (int)193);
                if (!var3_1) ** GOTO lbl311
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)od.mcag("mcpm", mcad(int ), (int)194);
        ** while (!var3_1)
lbl335:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addStep(int var1_1, oe var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcat", mcaq(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcau", mcad(int ), (int)9)) break;
            v0 /* !! */  = (long)od.mcag("mcav", mcad(int ), (int)10);
        }
        var5_3 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl12
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mcaw", mcaq(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1678535924: {
                    v2 = od.mcag("mcax", mcaq(int ), (int)2);
                    continue block30;
                }
                case -1603771027: {
                    v2 = od.mcag("mcay", mcaq(int ), (int)3);
                    continue block30;
                }
                case -714508833: {
                    break block30;
                }
                case 1733699627: {
                    v2 = od.mcag("mcaz", mcaq(int ), (int)4);
                    continue block30;
                }
            }
            break;
        }
        var4_4 /* !! */  = od.b;
        v3 /* !! */  = od.va;
        if (true) ** GOTO lbl29
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - od.mcag("mcba", mcaq(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -714508833: {
                    break block31;
                }
                case 825285617: {
                    v4 = od.mcag("mcbb", mcaq(int ), (int)6);
                    continue block31;
                }
                case 1219143655: {
                    v4 = od.mcag("mcbc", mcaq(int ), (int)7);
                    continue block31;
                }
                case 1282195269: {
                    v4 = od.mcag("mcbd", mcaq(int ), (int)8);
                    continue block31;
                }
            }
            break;
        }
        var3_5 = od.a;
        if (var5_3) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var3_5 || var3_5)
lbl47:
        // 1 sources

        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = od.va;
                if (true) ** GOTO lbl54
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - od.mcag("mcbe", mcaq(int ), (int)9));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -714508833: {
                            break block33;
                        }
                        case 497029983: {
                            v6 = od.mcag("mcbf", mcaq(int ), (int)10);
                            continue block33;
                        }
                        case 749140046: {
                            v6 = od.mcag("mcbg", mcaq(int ), (int)11);
                            continue block33;
                        }
                        case 1163177458: {
                            v6 = od.mcag("mcbh", mcaq(int ), (int)12);
                            continue block33;
                        }
                    }
                    break;
                }
                v7 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lambda$addStep$0(), ()Z)();
                v8 = od.mcag("mcbi", mcad(int ), (int)11);
                v9 /* !! */  = od.va;
                if (true) ** GOTO lbl72
                block34: while (true) {
                    v9 /* !! */  = (long)(v10 - od.mcag("mcbj", mcaq(int ), (int)13));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -714508833: {
                            break block34;
                        }
                        case 155000643: {
                            v10 = od.mcag("mcbk", mcaq(int ), (int)14);
                            continue block34;
                        }
                        case 671024442: {
                            v10 = od.mcag("mcbl", mcaq(int ), (int)15);
                            continue block34;
                        }
                    }
                    break;
                }
                return this.addStep(var1_1, var2_2, v7, (int)v8);
            }
            case 0: {
                var4_4 /* !! */  = (int)od.mcag("mcbm", mcad(int ), (int)12);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl87:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)od.mcag("mcbn", mcad(int ), (int)13);
                    if (!var5_3) break block12;
                    throw null;
                }
            }
lbl92:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)od.mcag("mcbo", mcad(int ), (int)14);
                if (!var5_3) ** GOTO lbl87
                throw null;
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)od.mcag("mcbp", mcad(int ), (int)15);
        ** while (!var5_3)
lbl99:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public od addTickStep(int var1_1, oe var2_2, BooleanSupplier var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcfb", mcaq(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mcfc", mcad(int ), (int)60)) break;
            v0 /* !! */  = (long)od.mcag("mcfd", mcad(int ), (int)61);
        }
        var6_4 = od.c;
        while (true) {
            block24: {
                if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcfe", mcaq(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != od.mcag("mcff", mcad(int ), (int)62)) break block24;
                var5_5 /* !! */  = od.b;
                v2 /* !! */  = od.va;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)od.mcag("mcfg", mcad(int ), (int)63);
        }
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - od.mcag("mcfh", mcaq(int ), (int)63));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1628717069: {
                    v3 = od.mcag("mcfi", mcaq(int ), (int)64);
                    continue block17;
                }
                case -714508833: {
                    break block17;
                }
                case 1905466268: {
                    v3 = od.mcag("mcfj", mcaq(int ), (int)65);
                    continue block17;
                }
            }
            break;
        }
        var4_6 = od.a;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) {
                    throw null;
                }
                if (var4_6 != false) return null;
                if (var4_6 != false) return null;
                v4 = od.mcag("mcfk", mcad(int ), (int)64);
                v5 /* !! */  = od.va;
                block18: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1728285883: {
                            v5 /* !! */  = (long)(od.mcag("mcfm", mcaq(int ), (int)67) - od.mcag("mcfl", mcaq(int ), (int)66));
                            continue block18;
                        }
                        case -714508833: {
                            return this.addTickStep(var1_1, var2_2, var3_3, (int)v4);
                        }
                    }
                    break;
                }
                return this.addTickStep(var1_1, var2_2, var3_3, (int)v4);
            }
            case 0: {
                var5_5 /* !! */  = (int)od.mcag("mcfn", mcad(int ), (int)65);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 1: {
                ** GOTO lbl56
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var5_5 /* !! */  = (int)od.mcag("mcfq", mcad(int ), (int)68);
                if (var6_4) {
                    throw null;
                }
lbl56:
                // 3 sources

                var5_5 /* !! */  = (int)od.mcag("mcfo", mcad(int ), (int)66);
                if (var6_4) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var5_5 /* !! */  = (int)od.mcag("mcfp", mcad(int ), (int)67);
        } while (!var6_4);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCurrentStepIndex(int var1_1) {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - od.mcag("mcwk", mcaq(int ), (int)270));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1279808982: {
                    v1 = od.mcag("mcwl", mcaq(int ), (int)271);
                    continue block18;
                }
                case -714508833: {
                    break block18;
                }
                case -192672574: {
                    v1 = od.mcag("mcwm", mcaq(int ), (int)272);
                    continue block18;
                }
                case 112056061: {
                    v1 = od.mcag("mcwn", mcaq(int ), (int)273);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = od.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcwo", mcaq(int ), (int)274)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od.mcag("mcwp", mcad(int ), (int)302)) break;
            v2 /* !! */  = (long)od.mcag("mcwq", mcad(int ), (int)303);
        }
        var3_3 /* !! */  = od.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcwr", mcaq(int ), (int)275)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == od.mcag("mcws", mcad(int ), (int)304)) break;
            v3 /* !! */  = (long)od.mcag("mcwt", mcad(int ), (int)305);
        }
        var2_4 = od.a;
        if (!var4_2) ** GOTO lbl38
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl38:
                // 1 sources

                if (var2_4 || var2_4) continue block21;
                v4 /* !! */  = od.va;
                if (true) ** GOTO lbl43
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - od.mcag("mcwu", mcaq(int ), (int)276));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -714508833: {
                            break block22;
                        }
                        case -446639741: {
                            v5 = od.mcag("mcwv", mcaq(int ), (int)277);
                            continue block22;
                        }
                        case 1084407522: {
                            v5 = od.mcag("mcww", mcaq(int ), (int)278);
                            continue block22;
                        }
                    }
                    break;
                }
                this.currentStepIndex = var1_1;
                if (!var2_4) ** break;
                continue block21;
                return;
                case 0: {
                    do {
                        var3_3 /* !! */  = (int)od.mcag("mcwx", mcad(int ), (int)306);
                    } while (!var4_2);
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)od.mcag("mcwy", mcad(int ), (int)307);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl66:
                // 2 sources

                case 2: {
                    do {
                        var3_3 /* !! */  = (int)od.mcag("mcwz", mcad(int ), (int)308);
                    } while (!var4_2);
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)od.mcag("mcxa", mcad(int ), (int)309);
                    if (!var4_2) ** GOTO lbl66
                    throw null;
                }
                case 4: 
            }
        }
        var3_3 /* !! */  = (int)od.mcag("mcxb", mcad(int ), (int)310);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdjc() {
        od.mcar[0] = 4007299163246266004L;
        od.mcar[1] = 5211181649298509005L;
        od.mcar[2] = 2714013695457504925L;
        od.mcar[3] = -8378812925393407730L;
        od.mcar[4] = -2359895088418330294L;
        od.mcar[5] = -5886099268426131894L;
        od.mcar[6] = -2659296367281088029L;
        od.mcar[7] = -7164916216644425728L;
        od.mcar[8] = 7736561851033458552L;
        od.mcar[9] = 27496771035825748L;
        od.mcar[10] = 8267961565512008561L;
        od.mcar[11] = -8877382890118357290L;
        od.mcar[12] = 1782585700347775578L;
        od.mcar[13] = -8700302639716995036L;
        od.mcar[14] = -1430650611503602620L;
        od.mcar[15] = 3007574027714261650L;
        od.mcar[16] = -7322303493292284744L;
        od.mcar[17] = -5452828558440667259L;
        od.mcar[18] = 5206060251178915850L;
        od.mcar[19] = -446071684355846927L;
        od.mcar[20] = -5141037861931605091L;
        od.mcar[21] = -5301647570365219201L;
        od.mcar[22] = -5291054330059516441L;
        od.mcar[23] = -3963190220980032479L;
        od.mcar[24] = -2373582948500949471L;
        od.mcar[25] = -6654382497122263902L;
        od.mcar[26] = -3332600356992429623L;
        od.mcar[27] = -9126653199052856847L;
        od.mcar[28] = 4598359626440849971L;
        od.mcar[29] = 2813067515714876275L;
        od.mcar[30] = 5457414327750576095L;
        od.mcar[31] = 8245120380080960366L;
        od.mcar[32] = -8530273957993062548L;
        od.mcar[33] = 5802281214384712848L;
        od.mcar[34] = 3671787331250026028L;
        od.mcar[35] = 116237583564237680L;
        od.mcar[36] = -9129416157431866655L;
        od.mcar[37] = 1818343413804286583L;
        od.mcar[38] = -5889740153568665120L;
        od.mcar[39] = -2464564993834185033L;
        od.mcar[40] = -6361081698890646814L;
        od.mcar[41] = -7532150286350312471L;
        od.mcar[42] = 4390245306800722308L;
        od.mcar[43] = 5909794516579910512L;
        od.mcar[44] = -4970426375680700368L;
        od.mcar[45] = 8290171737909884326L;
        od.mcar[46] = -970250394261816065L;
        od.mcar[47] = -2534987511530903623L;
        od.mcar[48] = 2944841209129304379L;
        od.mcar[49] = -6366471518333077939L;
        od.mcar[50] = 2727463622018284923L;
        od.mcar[51] = -5794171636267736298L;
        od.mcar[52] = -111668847253080470L;
        od.mcar[53] = -7294712180673116653L;
        od.mcar[54] = 3095848097813227451L;
        od.mcar[55] = -5215595017038504021L;
        od.mcar[56] = -2723606653064352473L;
        od.mcar[57] = 6828864982831486819L;
        od.mcar[58] = -260676258751826026L;
        od.mcar[59] = 6871393402544043956L;
        od.mcar[60] = 1692541543262787118L;
        od.mcar[61] = -8891592077065972098L;
        od.mcar[62] = -3512043835459880300L;
        od.mcar[63] = 5430400281687253438L;
        od.mcar[64] = 1263629296059484296L;
        od.mcar[65] = 1747629455730297033L;
        od.mcar[66] = 607297651613886080L;
        od.mcar[67] = -5938051630860238755L;
        od.mcar[68] = -7123364086654358775L;
        od.mcar[69] = -2866744182926045897L;
        od.mcar[70] = -4509848015111054474L;
        od.mcar[71] = -5378371528087121323L;
        od.mcar[72] = 8044031414356127434L;
        od.mcar[73] = 7757755362486079891L;
        od.mcar[74] = 7873258751003689347L;
        od.mcar[75] = -280012465693347168L;
        od.mcar[76] = 1323298634879983315L;
        od.mcar[77] = -740740867987558936L;
        od.mcar[78] = -2515480851003485386L;
        od.mcar[79] = -7613859563974684321L;
        od.mcar[80] = -8723603148228178346L;
        od.mcar[81] = -4489755224986583924L;
        od.mcar[82] = -570368788109987592L;
        od.mcar[83] = 3225706449445597093L;
        od.mcar[84] = -4461716709288828496L;
        od.mcar[85] = 5606036943329357164L;
        od.mcar[86] = 2629998621485448476L;
        od.mcar[87] = 7402505039320472161L;
        od.mcar[88] = -3035229824725688599L;
        od.mcar[89] = 4654916248273931871L;
        od.mcar[90] = -279830559815636870L;
        od.mcar[91] = -1586289453522656584L;
        od.mcar[92] = -5227778714942296004L;
        od.mcar[93] = 4956327465579727014L;
        od.mcar[94] = 2373623566899389957L;
        od.mcar[95] = -6848420629657460049L;
        od.mcar[96] = -6787372357495404232L;
        od.mcar[97] = 5402994021693590003L;
        od.mcar[98] = 7140331893734276096L;
        od.mcar[99] = 7180123521517083633L;
    }

    static {
        mcae = new int[474];
        mcaf = new int[474];
        od.mdis();
        od.mdit();
        od.mdiu();
        od.mdiv();
        od.mdiw();
        od.mdix();
        od.mdiy();
        od.mdiz();
        od.mdja();
        od.mdjb();
        mcar = new long[418];
        mcas = new long[418];
        od.mdjc();
        od.mdjd();
        od.mdje();
        od.mdjf();
        od.mdjg();
        od.mdjh();
        od.mdji();
        od.mdjj();
        od.mdjk();
        od.mdjl();
    }

    private static /* synthetic */ void mdjl() {
        od.mcas[400] = -2978111748814335844L;
        od.mcas[401] = 1932436963957331701L;
        od.mcas[402] = 209008172905703783L;
        od.mcas[403] = -7151603158277545966L;
        od.mcas[404] = 3331435639263140234L;
        od.mcas[405] = -2680320359586046906L;
        od.mcas[406] = 7682108347295343732L;
        od.mcas[407] = -4982911579153589959L;
        od.mcas[408] = -4131928982929903702L;
        od.mcas[409] = 2808503638788363870L;
        od.mcas[410] = -4854649889276076861L;
        od.mcas[411] = -5274416375537260263L;
        od.mcas[412] = 6284785340666207934L;
        od.mcas[413] = 3038735612113599019L;
        od.mcas[414] = 6131815226263259404L;
        od.mcas[415] = -9115721170588148630L;
        od.mcas[416] = 7648194181501025374L;
        od.mcas[417] = -8637267035660902633L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public od() {
        var2_1 /* !! */  = od.b;
        super();
        this.time = new pr();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block10: while (true) {
            block12: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.scriptSteps = Lists.newCopyOnWriteArrayList();
                        this.scriptTickSteps = Lists.newCopyOnWriteArrayList();
                        this.loopStrategy = new od$FiniteLoopStrategy((int)od.mcag("mcah", mcad(int ), (int)0));
                        this.cleanup();
                        return;
                    }
                    case 1: {
                        ** GOTO lbl27
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)od.mcag("mcal", mcad(int ), (int)4);
                        cfr_temp_0 = 4;
                        break block12;
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)od.mcag("mcao", mcad(int ), (int)7);
                        cfr_temp_0 = 0;
                        break block12;
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)od.mcag("mcap", mcad(int ), (int)8);
lbl27:
                        // 2 sources

                        var2_1 /* !! */  = (int)od.mcag("mcaj", mcad(int ), (int)2);
                        cfr_temp_0 = 4;
                        break block12;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)od.mcag("mcai", mcad(int ), (int)1);
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)od.mcag("mcam", mcad(int ), (int)5);
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)od.mcag("mcak", mcad(int ), (int)3);
                    }
                    case 5: 
                }
                ** GOTO lbl41
            }
            while (true) {
                if (true) continue block10;
lbl41:
                // 2 sources

                var2_1 /* !! */  = (int)od.mcag("mcan", mcad(int ), (int)6);
                cfr_temp_0 = 0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$addStep$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mdie", mcaq(int ), (int)414)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mdif", mcad(int ), (int)464)) break;
            v0 /* !! */  = (long)od.mcag("mdig", mcad(int ), (int)465);
        }
        var2 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(od.mcag("mdii", mcaq(int ), (int)416) - od.mcag("mdih", mcaq(int ), (int)415));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block11;
                }
                case 2064695945: {
                    continue block11;
                }
            }
            break;
        }
        var1_1 /* !! */  = od.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mdij", mcaq(int ), (int)417)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od.mcag("mdik", mcad(int ), (int)466)) break;
            v2 /* !! */  = (long)od.mcag("mdil", mcad(int ), (int)467);
        }
        var0_2 = od.a;
        if (var2) {
            throw null;
            return (boolean)od.mcag("mdim", mcad(int ), (int)468);
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                return (boolean)od.mcag("mdin", mcad(int ), (int)469);
            }
lbl34:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)od.mcag("mdio", mcad(int ), (int)470);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)od.mcag("mdip", mcad(int ), (int)471);
                if (!var2) ** GOTO lbl34
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)od.mcag("mdiq", mcad(int ), (int)472);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)od.mcag("mdir", mcad(int ), (int)473);
        ** while (!var2)
lbl51:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdiv() {
        od.mcae[300] = 98459910;
        od.mcae[301] = -381792434;
        od.mcae[302] = -1158683154;
        od.mcae[303] = 1176081504;
        od.mcae[304] = -1318817894;
        od.mcae[305] = 1384623499;
        od.mcae[306] = 819836069;
        od.mcae[307] = -418763366;
        od.mcae[308] = -812808103;
        od.mcae[309] = 71071120;
        od.mcae[310] = -350554638;
        od.mcae[311] = -1008613530;
        od.mcae[312] = 1726730430;
        od.mcae[313] = 862499850;
        od.mcae[314] = 1472322939;
        od.mcae[315] = 285972549;
        od.mcae[316] = 778755152;
        od.mcae[317] = 1343438759;
        od.mcae[318] = 88352752;
        od.mcae[319] = -261727559;
        od.mcae[320] = 446618663;
        od.mcae[321] = 475033812;
        od.mcae[322] = -847810461;
        od.mcae[323] = -338698586;
        od.mcae[324] = -593029800;
        od.mcae[325] = -909077430;
        od.mcae[326] = 253814201;
        od.mcae[327] = 216929642;
        od.mcae[328] = 253428707;
        od.mcae[329] = -1867454224;
        od.mcae[330] = 2125300364;
        od.mcae[331] = -1689271797;
        od.mcae[332] = 2039814533;
        od.mcae[333] = 230164887;
        od.mcae[334] = 1481732317;
        od.mcae[335] = -1572882328;
        od.mcae[336] = 1390594971;
        od.mcae[337] = 2133183730;
        od.mcae[338] = 1698385724;
        od.mcae[339] = 1894140251;
        od.mcae[340] = -767218976;
        od.mcae[341] = 551617308;
        od.mcae[342] = -528211078;
        od.mcae[343] = -1865381244;
        od.mcae[344] = 730244583;
        od.mcae[345] = 1262631162;
        od.mcae[346] = 8004040;
        od.mcae[347] = -1083109721;
        od.mcae[348] = -1400895843;
        od.mcae[349] = -1377172628;
        od.mcae[350] = 1701418779;
        od.mcae[351] = 2034592145;
        od.mcae[352] = 359565531;
        od.mcae[353] = -1599272370;
        od.mcae[354] = 1416837840;
        od.mcae[355] = -1568068269;
        od.mcae[356] = -1399590033;
        od.mcae[357] = 1433395137;
        od.mcae[358] = -1502583381;
        od.mcae[359] = -888123775;
        od.mcae[360] = 244933852;
        od.mcae[361] = -1133564416;
        od.mcae[362] = -1038562673;
        od.mcae[363] = -1340758427;
        od.mcae[364] = -1041986080;
        od.mcae[365] = 67270644;
        od.mcae[366] = -1831777232;
        od.mcae[367] = -1398411923;
        od.mcae[368] = -671950843;
        od.mcae[369] = 926102341;
        od.mcae[370] = -709735331;
        od.mcae[371] = -28483237;
        od.mcae[372] = -894368143;
        od.mcae[373] = 324285717;
        od.mcae[374] = -567774154;
        od.mcae[375] = -1981131654;
        od.mcae[376] = 1092125321;
        od.mcae[377] = -1890672072;
        od.mcae[378] = -236479372;
        od.mcae[379] = -2015785383;
        od.mcae[380] = 1485507703;
        od.mcae[381] = -1443713097;
        od.mcae[382] = -169124900;
        od.mcae[383] = -300472101;
        od.mcae[384] = 1025142811;
        od.mcae[385] = 1234678369;
        od.mcae[386] = 1248842630;
        od.mcae[387] = -258552149;
        od.mcae[388] = 1036155159;
        od.mcae[389] = 674593916;
        od.mcae[390] = -1669517227;
        od.mcae[391] = 1984337582;
        od.mcae[392] = 796199942;
        od.mcae[393] = -777817936;
        od.mcae[394] = -711312567;
        od.mcae[395] = 1709153267;
        od.mcae[396] = -683557574;
        od.mcae[397] = 1854120392;
        od.mcae[398] = 1427224165;
        od.mcae[399] = -29575996;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$update$4(od$ScriptStep var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mdcm", mcaq(int ), (int)343)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mdcn", mcad(int ), (int)387)) break;
            v0 /* !! */  = (long)od.mcag("mdco", mcad(int ), (int)388);
        }
        var5_2 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl11
        block87: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mdcp", mcaq(int ), (int)344));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1645715796: {
                    v2 = od.mcag("mdcq", mcaq(int ), (int)345);
                    continue block87;
                }
                case -714508833: {
                    break block87;
                }
                case 1469675873: {
                    v2 = od.mcag("mdcr", mcaq(int ), (int)346);
                    continue block87;
                }
            }
            break;
        }
        var4_3 /* !! */  = od.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mdcs", mcaq(int ), (int)347)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == od.mcag("mdct", mcad(int ), (int)389)) break;
            v3 /* !! */  = (long)od.mcag("mdcu", mcad(int ), (int)390);
        }
        var3_4 = od.a;
        if (var5_2) {
            throw null;
lbl29:
            // 13 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        v4 /* !! */  = od.va;
        if (true) ** GOTO lbl36
        block90: while (true) {
            v4 /* !! */  = (long)(v5 - od.mcag("mdcv", mcaq(int ), (int)348));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1383205172: {
                    v5 = od.mcag("mdcw", mcaq(int ), (int)349);
                    continue block90;
                }
                case -714508833: {
                    break block90;
                }
                case 645292389: {
                    v5 = od.mcag("mdcx", mcaq(int ), (int)350);
                    continue block90;
                }
                case 711603901: {
                    v5 = od.mcag("mdcy", mcaq(int ), (int)351);
                    continue block90;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mdcz", mcaq(int ), (int)352)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == od.mcag("mdda", mcad(int ), (int)391)) break;
            v6 /* !! */  = (long)od.mcag("mddb", mcad(int ), (int)392);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mddc", mcaq(int ), (int)353)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == od.mcag("mddd", mcad(int ), (int)393)) break;
            v7 /* !! */  = (long)od.mcag("mdde", mcad(int ), (int)394);
        }
        if (this.currentStepIndex >= this.scriptSteps.size()) ** GOTO lbl265
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = od.va - od.mcag("mddf", mcaq(int ), (int)354)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == od.mcag("mddg", mcad(int ), (int)395)) break;
            v8 /* !! */  = (long)od.mcag("mddh", mcad(int ), (int)396);
        }
        v9 /* !! */  = od.va;
        if (true) ** GOTO lbl69
        block94: while (true) {
            v9 /* !! */  = (long)(od.mcag("mddj", mcaq(int ), (int)356) - od.mcag("mddi", mcaq(int ), (int)355));
lbl69:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1210672245: {
                    continue block94;
                }
                case -714508833: {
                    break block94;
                }
            }
            break;
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = od.va - od.mcag("mddk", mcaq(int ), (int)357)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == od.mcag("mddl", mcad(int ), (int)397)) break;
            v10 /* !! */  = (long)od.mcag("mddm", mcad(int ), (int)398);
        }
        var2_5 = this.scriptSteps.get(this.currentStepIndex);
        if (var3_4 || var3_4) ** GOTO lbl29
        v11 /* !! */  = od.va;
        if (true) ** GOTO lbl85
        block96: while (true) {
            v11 /* !! */  = (long)(v12 - od.mcag("mddn", mcaq(int ), (int)358));
lbl85:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -714508833: {
                    break block96;
                }
                case 428186517: {
                    v12 = od.mcag("mddo", mcaq(int ), (int)359);
                    continue block96;
                }
                case 1634895693: {
                    v12 = od.mcag("mddp", mcaq(int ), (int)360);
                    continue block96;
                }
            }
            break;
        }
        v13 = var2_5.condition();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = od.va - od.mcag("mddq", mcaq(int ), (int)361)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == od.mcag("mddr", mcad(int ), (int)399)) break;
            v14 /* !! */  = (long)od.mcag("mdds", mcad(int ), (int)400);
        }
        if (!v13.getAsBoolean()) ** GOTO lbl265
        if (var3_4) ** GOTO lbl29
        v15 /* !! */  = od.va;
        if (true) ** GOTO lbl106
        block98: while (true) {
            v15 /* !! */  = (long)(v16 - od.mcag("mddt", mcaq(int ), (int)362));
lbl106:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -714508833: {
                    break block98;
                }
                case 586915877: {
                    v16 = od.mcag("mddu", mcaq(int ), (int)363);
                    continue block98;
                }
                case 1485391621: {
                    v16 = od.mcag("mddv", mcaq(int ), (int)364);
                    continue block98;
                }
                case 2114067664: {
                    v16 = od.mcag("mddw", mcaq(int ), (int)365);
                    continue block98;
                }
            }
            break;
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = od.va - od.mcag("mddx", mcaq(int ), (int)366)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == od.mcag("mddy", mcad(int ), (int)401)) break;
            v17 /* !! */  = (long)od.mcag("mddz", mcad(int ), (int)402);
        }
        v18 = var2_5.delay();
        v19 /* !! */  = od.va;
        if (true) ** GOTO lbl128
        block100: while (true) {
            v19 /* !! */  = (long)(v20 - od.mcag("mdea", mcaq(int ), (int)367));
lbl128:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1110261456: {
                    v20 = od.mcag("mdeb", mcaq(int ), (int)368);
                    continue block100;
                }
                case -714508833: {
                    break block100;
                }
                case 2046015739: {
                    v20 = od.mcag("mdec", mcaq(int ), (int)369);
                    continue block100;
                }
            }
            break;
        }
        if (!this.time.finished(v18)) ** GOTO lbl265
        if (var3_4) ** GOTO lbl29
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl29
                v21 /* !! */  = od.va;
                if (true) ** GOTO lbl147
                block101: while (true) {
                    v21 /* !! */  = (long)(od.mcag("mdee", mcaq(int ), (int)371) - od.mcag("mded", mcaq(int ), (int)370));
lbl147:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2007523706: {
                            continue block101;
                        }
                        case -714508833: {
                            break block101;
                        }
                    }
                    break;
                }
                v22 = var2_5.action();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = od.va - od.mcag("mdef", mcaq(int ), (int)372)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == od.mcag("mdeg", mcad(int ), (int)403)) break;
                    v23 /* !! */  = (long)od.mcag("mdeh", mcad(int ), (int)404);
                }
                v22.perform();
                if (var3_4 || var3_4) ** GOTO lbl29
                v24 /* !! */  = od.va;
                if (true) ** GOTO lbl164
                block103: while (true) {
                    v24 /* !! */  = (long)(v25 - od.mcag("mdei", mcaq(int ), (int)373));
lbl164:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -714508833: {
                            break block103;
                        }
                        case -469202163: {
                            v25 = od.mcag("mdej", mcaq(int ), (int)374);
                            continue block103;
                        }
                        case 1631537492: {
                            v25 = od.mcag("mdek", mcaq(int ), (int)375);
                            continue block103;
                        }
                    }
                    break;
                }
                v26 = this.currentStepIndex + od.mcag("mdel", mcad(int ), (int)405);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = od.va - od.mcag("mdem", mcaq(int ), (int)376)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == od.mcag("mden", mcad(int ), (int)406)) break;
                    v27 /* !! */  = (long)od.mcag("mdeo", mcad(int ), (int)407);
                }
                this.currentStepIndex = v26;
                if (var3_4 || var3_4) ** GOTO lbl29
                v28 /* !! */  = od.va;
                if (true) ** GOTO lbl185
                block105: while (true) {
                    v28 /* !! */  = (long)(od.mcag("mdeq", mcaq(int ), (int)378) - od.mcag("mdep", mcaq(int ), (int)377));
lbl185:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1787817965: {
                            continue block105;
                        }
                        case -714508833: {
                            break block105;
                        }
                    }
                    break;
                }
                this.resetTime();
                if (var3_4 || var3_4) ** GOTO lbl29
                v29 /* !! */  = od.va;
                if (true) ** GOTO lbl196
                block106: while (true) {
                    v29 /* !! */  = (long)(od.mcag("mdes", mcaq(int ), (int)380) - od.mcag("mder", mcaq(int ), (int)379));
lbl196:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -759680497: {
                            continue block106;
                        }
                        case -714508833: {
                            break block106;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_10 = od.va - od.mcag("mdet", mcaq(int ), (int)381)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == od.mcag("mdeu", mcad(int ), (int)408)) break;
                    v30 /* !! */  = (long)od.mcag("mdev", mcad(int ), (int)409);
                }
                v31 /* !! */  = od.va;
                if (true) ** GOTO lbl210
                block108: while (true) {
                    v31 /* !! */  = (long)(v32 - od.mcag("mdew", mcaq(int ), (int)382));
lbl210:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -714508833: {
                            break block108;
                        }
                        case -632451133: {
                            v32 = od.mcag("mdex", mcaq(int ), (int)383);
                            continue block108;
                        }
                        case -143396817: {
                            v32 = od.mcag("mdey", mcaq(int ), (int)384);
                            continue block108;
                        }
                        case 732235035: {
                            v32 = od.mcag("mdez", mcaq(int ), (int)385);
                            continue block108;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_11 = od.va - od.mcag("mdfa", mcaq(int ), (int)386)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == od.mcag("mdfb", mcad(int ), (int)410)) break;
                    v33 /* !! */  = (long)od.mcag("mdfc", mcad(int ), (int)411);
                }
                v34 = this.scriptSteps.size();
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_12 = od.va - od.mcag("mdfd", mcaq(int ), (int)387)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == od.mcag("mdfe", mcad(int ), (int)412)) break;
                    v35 /* !! */  = (long)od.mcag("mdff", mcad(int ), (int)413);
                }
                if (!this.loopStrategy.shouldLoop(this.currentStepIndex, v34)) ** GOTO lbl265
                if (var3_4 || var3_4) ** GOTO lbl29
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_13 = od.va - od.mcag("mdfg", mcaq(int ), (int)388)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == od.mcag("mdfh", mcad(int ), (int)414)) break;
                    v36 /* !! */  = (long)od.mcag("mdfi", mcad(int ), (int)415);
                }
                this.resetStepIndex();
                if (var3_4 || var3_4) ** GOTO lbl29
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_14 = od.va - od.mcag("mdfj", mcaq(int ), (int)389)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == od.mcag("mdfk", mcad(int ), (int)416)) break;
                    v37 /* !! */  = (long)od.mcag("mdfl", mcad(int ), (int)417);
                }
                v38 /* !! */  = od.va;
                if (true) ** GOTO lbl251
                block113: while (true) {
                    v38 /* !! */  = (long)(v39 - od.mcag("mdfm", mcaq(int ), (int)390));
lbl251:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -714508833: {
                            break block113;
                        }
                        case 345600520: {
                            v39 = od.mcag("mdfn", mcaq(int ), (int)391);
                            continue block113;
                        }
                        case 886151731: {
                            v39 = od.mcag("mdfo", mcaq(int ), (int)392);
                            continue block113;
                        }
                        case 1139044114: {
                            v39 = od.mcag("mdfp", mcaq(int ), (int)393);
                            continue block113;
                        }
                    }
                    break;
                }
                this.loopStrategy.onLoop();
                if (var3_4) ** GOTO lbl29
lbl265:
                // 5 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl268:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)od.mcag("mdfq", mcad(int ), (int)418);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 1: {
                var4_3 /* !! */  = (int)od.mcag("mdfr", mcad(int ), (int)419);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 2: {
                var4_3 /* !! */  = (int)od.mcag("mdfs", mcad(int ), (int)420);
                if (!var5_2) ** GOTO lbl268
                throw null;
            }
lbl282:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)od.mcag("mdft", mcad(int ), (int)421);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl287:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)od.mcag("mdfu", mcad(int ), (int)422);
                if (!var5_2) ** GOTO lbl268
                throw null;
            }
lbl291:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)od.mcag("mdfv", mcad(int ), (int)423);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl296:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)od.mcag("mdfw", mcad(int ), (int)424);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 7: {
                var4_3 /* !! */  = (int)od.mcag("mdfx", mcad(int ), (int)425);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl306:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)od.mcag("mdfy", mcad(int ), (int)426);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl311:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)od.mcag("mdfz", mcad(int ), (int)427);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl316:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)od.mcag("mdga", mcad(int ), (int)428);
                if (!var5_2) ** GOTO lbl291
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)od.mcag("mdgb", mcad(int ), (int)429);
                if (!var5_2) ** GOTO lbl296
                throw null;
            }
lbl324:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)od.mcag("mdgc", mcad(int ), (int)430);
                if (!var5_2) ** GOTO lbl296
                throw null;
            }
lbl328:
            // 3 sources

            case 13: {
                var4_3 /* !! */  = (int)od.mcag("mdgd", mcad(int ), (int)431);
                if (!var5_2) ** GOTO lbl316
                throw null;
            }
lbl332:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)od.mcag("mdge", mcad(int ), (int)432);
                if (!var5_2) ** GOTO lbl328
                throw null;
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)od.mcag("mdgf", mcad(int ), (int)433);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl364
                    break;
                }
            }
            case 16: {
                var4_3 /* !! */  = (int)od.mcag("mdgg", mcad(int ), (int)434);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 17: {
                var4_3 /* !! */  = (int)od.mcag("mdgh", mcad(int ), (int)435);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl352:
            // 2 sources

            case 18: {
                var4_3 /* !! */  = (int)od.mcag("mdgi", mcad(int ), (int)436);
                if (!var5_2) ** GOTO lbl332
                throw null;
            }
lbl356:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)od.mcag("mdgj", mcad(int ), (int)437);
                if (!var5_2) ** GOTO lbl316
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)od.mcag("mdgk", mcad(int ), (int)438);
                if (!var5_2) ** GOTO lbl306
                throw null;
            }
lbl364:
            // 4 sources

            case 21: {
                var4_3 /* !! */  = (int)od.mcag("mdgl", mcad(int ), (int)439);
                if (!var5_2) ** GOTO lbl287
                throw null;
            }
lbl368:
            // 3 sources

            case 22: {
                var4_3 /* !! */  = (int)od.mcag("mdgm", mcad(int ), (int)440);
                if (!var5_2) ** GOTO lbl324
                throw null;
            }
            case 23: 
        }
        var4_3 /* !! */  = (int)od.mcag("mdgn", mcad(int ), (int)441);
        ** while (!var5_2)
lbl375:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int mcad(int n2) {
        return mcae[n2] ^ mcaf[n2];
    }

    private static /* synthetic */ void mdiy() {
        od.mcaf[100] = -1423243475;
        od.mcaf[101] = 1271623744;
        od.mcaf[102] = 605814175;
        od.mcaf[103] = 1208583832;
        od.mcaf[104] = -1005644458;
        od.mcaf[105] = -1266055466;
        od.mcaf[106] = -160494986;
        od.mcaf[107] = -971013822;
        od.mcaf[108] = -1705515182;
        od.mcaf[109] = 1567361354;
        od.mcaf[110] = 1927757683;
        od.mcaf[111] = 565488649;
        od.mcaf[112] = 2080027801;
        od.mcaf[113] = -1750364311;
        od.mcaf[114] = 585113561;
        od.mcaf[115] = 52777198;
        od.mcaf[116] = -409040806;
        od.mcaf[117] = 226732822;
        od.mcaf[118] = -1233666740;
        od.mcaf[119] = 1691754024;
        od.mcaf[120] = 563174684;
        od.mcaf[121] = -1024275365;
        od.mcaf[122] = -1210055873;
        od.mcaf[123] = 662014809;
        od.mcaf[124] = 1016461288;
        od.mcaf[125] = 61913737;
        od.mcaf[126] = -878394374;
        od.mcaf[127] = 1160617642;
        od.mcaf[128] = -859150008;
        od.mcaf[129] = -1799804050;
        od.mcaf[130] = 1421662954;
        od.mcaf[131] = 1066628966;
        od.mcaf[132] = 1062182931;
        od.mcaf[133] = 181907374;
        od.mcaf[134] = -1145482788;
        od.mcaf[135] = 1043218850;
        od.mcaf[136] = -1135098358;
        od.mcaf[137] = 1467921999;
        od.mcaf[138] = 1245621866;
        od.mcaf[139] = 1357086798;
        od.mcaf[140] = 1225196595;
        od.mcaf[141] = 1256181825;
        od.mcaf[142] = 1926202778;
        od.mcaf[143] = -1082447975;
        od.mcaf[144] = -1493545996;
        od.mcaf[145] = 1999179705;
        od.mcaf[146] = -232745845;
        od.mcaf[147] = -1852699169;
        od.mcaf[148] = 2047363658;
        od.mcaf[149] = 474772089;
        od.mcaf[150] = -380501995;
        od.mcaf[151] = -1335193129;
        od.mcaf[152] = 57145540;
        od.mcaf[153] = 1644981063;
        od.mcaf[154] = -1613323566;
        od.mcaf[155] = 323860803;
        od.mcaf[156] = 327209615;
        od.mcaf[157] = 765314070;
        od.mcaf[158] = -1817834947;
        od.mcaf[159] = 442030799;
        od.mcaf[160] = -787448626;
        od.mcaf[161] = -80903267;
        od.mcaf[162] = -639997903;
        od.mcaf[163] = -1291897869;
        od.mcaf[164] = -941188967;
        od.mcaf[165] = -374659091;
        od.mcaf[166] = -651405559;
        od.mcaf[167] = -1363526691;
        od.mcaf[168] = -993411959;
        od.mcaf[169] = -162318883;
        od.mcaf[170] = 1851406790;
        od.mcaf[171] = 1871294881;
        od.mcaf[172] = -1073284563;
        od.mcaf[173] = -589202496;
        od.mcaf[174] = -1539890823;
        od.mcaf[175] = -167432850;
        od.mcaf[176] = -702334546;
        od.mcaf[177] = 1261275213;
        od.mcaf[178] = 161085654;
        od.mcaf[179] = -1245544017;
        od.mcaf[180] = 201646722;
        od.mcaf[181] = 1476435712;
        od.mcaf[182] = 696292176;
        od.mcaf[183] = 2136209442;
        od.mcaf[184] = -1069362247;
        od.mcaf[185] = 462413128;
        od.mcaf[186] = -1911515870;
        od.mcaf[187] = 367553817;
        od.mcaf[188] = -691979702;
        od.mcaf[189] = -1615173350;
        od.mcaf[190] = -1903717254;
        od.mcaf[191] = -1271293516;
        od.mcaf[192] = -389947082;
        od.mcaf[193] = 405530701;
        od.mcaf[194] = 109928502;
        od.mcaf[195] = 1482907464;
        od.mcaf[196] = 58296868;
        od.mcaf[197] = -1951270566;
        od.mcaf[198] = -474028430;
        od.mcaf[199] = 1438650333;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isInterrupt() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcvc", mcaq(int ), (int)259)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcvd", mcad(int ), (int)279)) break;
            v0 /* !! */  = (long)od.mcag("mcve", mcad(int ), (int)280);
        }
        var3_1 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcvf", mcaq(int ), (int)260)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od.mcag("mcvg", mcad(int ), (int)281)) break;
            v1 /* !! */  = (long)od.mcag("mcvh", mcad(int ), (int)282);
        }
        var2_2 /* !! */  = od.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcvi", mcaq(int ), (int)261)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od.mcag("mcvj", mcad(int ), (int)283)) break;
            v2 /* !! */  = (long)od.mcag("mcvk", mcad(int ), (int)284);
        }
        var1_3 = od.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (boolean)od.mcag("mcvl", mcad(int ), (int)285);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcvm", mcaq(int ), (int)262)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == od.mcag("mcvn", mcad(int ), (int)286)) break;
                    v3 /* !! */  = (long)od.mcag("mcvo", mcad(int ), (int)287);
                }
                return this.interrupt;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mcvp", mcad(int ), (int)288);
                } while (!var3_1);
                throw null;
            }
lbl43:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od.mcag("mcvq", mcad(int ), (int)289);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)od.mcag("mcvr", mcad(int ), (int)290);
                if (!var3_1) ** GOTO lbl43
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)od.mcag("mcvs", mcad(int ), (int)291);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite mcag(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od cleanupIfFinished() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcjl", mcaq(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcjm", mcad(int ), (int)109)) break;
            v0 /* !! */  = (long)od.mcag("mcjn", mcad(int ), (int)110);
        }
        var3_1 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcjo", mcaq(int ), (int)127)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od.mcag("mcjp", mcad(int ), (int)111)) break;
            v1 /* !! */  = (long)od.mcag("mcjq", mcad(int ), (int)112);
        }
        var2_2 /* !! */  = od.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcjr", mcaq(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od.mcag("mcjs", mcad(int ), (int)113)) break;
            v2 /* !! */  = (long)od.mcag("mcjt", mcad(int ), (int)114);
        }
        var1_3 = od.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block22;
                v3 /* !! */  = od.va;
                if (true) ** GOTO lbl33
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - od.mcag("mcju", mcaq(int ), (int)129));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -714508833: {
                            break block23;
                        }
                        case 1249705434: {
                            v4 = od.mcag("mcjv", mcaq(int ), (int)130);
                            continue block23;
                        }
                        case 1669452516: {
                            v4 = od.mcag("mcjw", mcaq(int ), (int)131);
                            continue block23;
                        }
                    }
                    break;
                }
                if (!this.isFinished()) ** GOTO lbl56
                if (var1_3) continue block22;
                v5 /* !! */  = od.va;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v5 /* !! */  = (long)(od.mcag("mcjy", mcaq(int ), (int)133) - od.mcag("mcjx", mcaq(int ), (int)132));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1980923414: {
                            continue block24;
                        }
                        case -714508833: {
                            break block24;
                        }
                    }
                    break;
                }
                this.cleanup();
                if (var1_3) continue block22;
lbl56:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                continue block22;
                return this;
                case 0: {
                    var2_2 /* !! */  = (int)od.mcag("mcjz", mcad(int ), (int)115);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl69
                }
lbl64:
                // 3 sources

                case 1: {
                    var2_2 /* !! */  = (int)od.mcag("mcka", mcad(int ), (int)116);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl86
                }
lbl69:
                // 3 sources

                case 2: {
                    var2_2 /* !! */  = (int)od.mcag("mckb", mcad(int ), (int)117);
                    if (!var3_1) ** GOTO lbl64
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)od.mcag("mckc", mcad(int ), (int)118);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)od.mcag("mckd", mcad(int ), (int)119);
                        if (!var3_1) ** GOTO lbl64
                        throw null;
                    }
                }
                case 5: {
                    var2_2 /* !! */  = (int)od.mcag("mcke", mcad(int ), (int)120);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl86:
                // 4 sources

                case 6: {
                    var2_2 /* !! */  = (int)od.mcag("mckf", mcad(int ), (int)121);
                    if (!var3_1) ** GOTO lbl69
                    throw null;
                }
                case 7: 
            }
        }
        var2_2 /* !! */  = (int)od.mcag("mckg", mcad(int ), (int)122);
        ** while (!var3_1)
lbl93:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdit() {
        od.mcae[100] = -1423243475;
        od.mcae[101] = 1271623746;
        od.mcae[102] = 605814174;
        od.mcae[103] = 1208583837;
        od.mcae[104] = -1005644458;
        od.mcae[105] = -1266055472;
        od.mcae[106] = -160494985;
        od.mcae[107] = -971013821;
        od.mcae[108] = -1705515184;
        od.mcae[109] = -1567361355;
        od.mcae[110] = -654098146;
        od.mcae[111] = -565488650;
        od.mcae[112] = -506558716;
        od.mcae[113] = 1750364310;
        od.mcae[114] = 1553207053;
        od.mcae[115] = 52777196;
        od.mcae[116] = -409040802;
        od.mcae[117] = 226732822;
        od.mcae[118] = -1233666738;
        od.mcae[119] = 1691754027;
        od.mcae[120] = 563174686;
        od.mcae[121] = -1024275363;
        od.mcae[122] = -1210055876;
        od.mcae[123] = 662014808;
        od.mcae[124] = -1535088095;
        od.mcae[125] = -61913738;
        od.mcae[126] = -385022001;
        od.mcae[127] = -1160617643;
        od.mcae[128] = 2055029138;
        od.mcae[129] = -1799804049;
        od.mcae[130] = 1226578188;
        od.mcae[131] = 1066628962;
        od.mcae[132] = 1062182937;
        od.mcae[133] = 181907371;
        od.mcae[134] = -1145482787;
        od.mcae[135] = 1043218852;
        od.mcae[136] = -1135098366;
        od.mcae[137] = 1467921999;
        od.mcae[138] = 1245621866;
        od.mcae[139] = 1357086796;
        od.mcae[140] = 1225196596;
        od.mcae[141] = 1256181826;
        od.mcae[142] = 1926202783;
        od.mcae[143] = -1082447976;
        od.mcae[144] = 1431968587;
        od.mcae[145] = -1999179706;
        od.mcae[146] = -1278201192;
        od.mcae[147] = 1852699168;
        od.mcae[148] = -1804457375;
        od.mcae[149] = -474772090;
        od.mcae[150] = -913843089;
        od.mcae[151] = 1335193128;
        od.mcae[152] = 2033591895;
        od.mcae[153] = -1644981064;
        od.mcae[154] = 1266260946;
        od.mcae[155] = -323860804;
        od.mcae[156] = -760257923;
        od.mcae[157] = 765314071;
        od.mcae[158] = -572370263;
        od.mcae[159] = -442030800;
        od.mcae[160] = 404301393;
        od.mcae[161] = 80903266;
        od.mcae[162] = 444285136;
        od.mcae[163] = -1291897870;
        od.mcae[164] = -580411690;
        od.mcae[165] = 374659090;
        od.mcae[166] = 152545703;
        od.mcae[167] = 1363526690;
        od.mcae[168] = -1212752814;
        od.mcae[169] = 162318882;
        od.mcae[170] = 246317787;
        od.mcae[171] = 1871294880;
        od.mcae[172] = -517441605;
        od.mcae[173] = -589202485;
        od.mcae[174] = -1539890820;
        od.mcae[175] = -167432835;
        od.mcae[176] = -702334530;
        od.mcae[177] = 1261275205;
        od.mcae[178] = 161085659;
        od.mcae[179] = -1245544001;
        od.mcae[180] = 201646724;
        od.mcae[181] = 1476435712;
        od.mcae[182] = 696292160;
        od.mcae[183] = 2136209443;
        od.mcae[184] = -1069362260;
        od.mcae[185] = 462413124;
        od.mcae[186] = -1911515859;
        od.mcae[187] = 367553816;
        od.mcae[188] = -691979687;
        od.mcae[189] = -1615173346;
        od.mcae[190] = -1903717253;
        od.mcae[191] = -1271293516;
        od.mcae[192] = -389947102;
        od.mcae[193] = 405530702;
        od.mcae[194] = 109928510;
        od.mcae[195] = 1482907465;
        od.mcae[196] = 1463707321;
        od.mcae[197] = -1951270561;
        od.mcae[198] = -474028432;
        od.mcae[199] = 1438650332;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isFinished() {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(od.mcag("mcqf", mcaq(int ), (int)208) - od.mcag("mcqe", mcaq(int ), (int)207));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -714508833: {
                    break block36;
                }
                case 409422985: {
                    continue block36;
                }
            }
            break;
        }
        var3_1 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcqg", mcaq(int ), (int)209)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od.mcag("mcqh", mcad(int ), (int)203)) break;
            v1 /* !! */  = (long)od.mcag("mcqi", mcad(int ), (int)204);
        }
        var2_2 /* !! */  = od.b;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl22
        block38: while (true) {
            v2 /* !! */  = (long)(v3 - od.mcag("mcqj", mcaq(int ), (int)210));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -714508833: {
                    break block38;
                }
                case -473026804: {
                    v3 = od.mcag("mcqk", mcaq(int ), (int)211);
                    continue block38;
                }
                case -456704924: {
                    v3 = od.mcag("mcql", mcaq(int ), (int)212);
                    continue block38;
                }
                case 1728539380: {
                    v3 = od.mcag("mcqm", mcaq(int ), (int)213);
                    continue block38;
                }
            }
            break;
        }
        var1_3 = od.a;
        if (var3_1) {
            throw null;
lbl37:
            // 6 sources

            return (boolean)od.mcag("mcqn", mcad(int ), (int)205);
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcqo", mcaq(int ), (int)214)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == od.mcag("mcqp", mcad(int ), (int)206)) break;
            v4 /* !! */  = (long)od.mcag("mcqq", mcad(int ), (int)207);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcqr", mcaq(int ), (int)215)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == od.mcag("mcqs", mcad(int ), (int)208)) break;
            v5 /* !! */  = (long)od.mcag("mcqt", mcad(int ), (int)209);
        }
        v6 /* !! */  = od.va;
        if (true) ** GOTO lbl56
        block42: while (true) {
            v6 /* !! */  = (long)(od.mcag("mcqv", mcaq(int ), (int)217) - od.mcag("mcqu", mcaq(int ), (int)216));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -714508833: {
                    break block42;
                }
                case 1261105202: {
                    continue block42;
                }
            }
            break;
        }
        if (this.currentStepIndex < this.scriptSteps.size()) ** GOTO lbl122
        if (var1_3) ** GOTO lbl37
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcqw", mcaq(int ), (int)218)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == od.mcag("mcqx", mcad(int ), (int)210)) break;
            v7 /* !! */  = (long)od.mcag("mcqy", mcad(int ), (int)211);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = od.va - od.mcag("mcqz", mcaq(int ), (int)219)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == od.mcag("mcra", mcad(int ), (int)212)) break;
            v8 /* !! */  = (long)od.mcag("mcrb", mcad(int ), (int)213);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = od.va - od.mcag("mcrc", mcaq(int ), (int)220)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == od.mcag("mcrd", mcad(int ), (int)214)) break;
            v9 /* !! */  = (long)od.mcag("mcre", mcad(int ), (int)215);
        }
        if (this.currentTickStepIndex < this.scriptTickSteps.size()) ** GOTO lbl122
        if (var1_3) ** GOTO lbl37
        v10 /* !! */  = od.va;
        if (true) ** GOTO lbl87
        block46: while (true) {
            v10 /* !! */  = (long)(od.mcag("mcrg", mcaq(int ), (int)222) - od.mcag("mcrf", mcaq(int ), (int)221));
lbl87:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1922176990: {
                    continue block46;
                }
                case -714508833: {
                    break block46;
                }
            }
            break;
        }
        if (this.interrupt) ** GOTO lbl122
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = od.va - od.mcag("mcrh", mcaq(int ), (int)223)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == od.mcag("mcri", mcad(int ), (int)216)) break;
                    v11 /* !! */  = (long)od.mcag("mcrj", mcad(int ), (int)217);
                }
                v12 /* !! */  = od.va;
                if (true) ** GOTO lbl107
                block48: while (true) {
                    v12 /* !! */  = (long)(v13 - od.mcag("mcrk", mcaq(int ), (int)224));
lbl107:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -714508833: {
                            break block48;
                        }
                        case 685985017: {
                            v13 = od.mcag("mcrl", mcaq(int ), (int)225);
                            continue block48;
                        }
                        case 1186824667: {
                            v13 = od.mcag("mcrm", mcaq(int ), (int)226);
                            continue block48;
                        }
                    }
                    break;
                }
                if (!this.loopStrategy.isFinished()) ** GOTO lbl122
                if (var1_3) ** GOTO lbl37
                v14 = od.mcag("mcrn", mcad(int ), (int)218);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl125
lbl122:
                // 4 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v14 = od.mcag("mcro", mcad(int ), (int)219);
lbl125:
                // 2 sources

                return (boolean)v14;
            }
            case 0: {
                var2_2 /* !! */  = (int)od.mcag("mcrp", mcad(int ), (int)220);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 1: {
                var2_2 /* !! */  = (int)od.mcag("mcrq", mcad(int ), (int)221);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl136:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)od.mcag("mcrr", mcad(int ), (int)222);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl141:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)od.mcag("mcrs", mcad(int ), (int)223);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
lbl145:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)od.mcag("mcrt", mcad(int ), (int)224);
                if (!var3_1) break;
                throw null;
            }
lbl149:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)od.mcag("mcru", mcad(int ), (int)225);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od.mcag("mcrv", mcad(int ), (int)226);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl164
                    break;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)od.mcag("mcrw", mcad(int ), (int)227);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl164:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)od.mcag("mcrx", mcad(int ), (int)228);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl168:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)od.mcag("mcry", mcad(int ), (int)229);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)od.mcag("mcrz", mcad(int ), (int)230);
        ** while (!var3_1)
lbl175:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdiz() {
        od.mcaf[200] = 817711344;
        od.mcaf[201] = -590423627;
        od.mcaf[202] = -96621472;
        od.mcaf[203] = 1531650123;
        od.mcaf[204] = 728455887;
        od.mcaf[205] = 1952283092;
        od.mcaf[206] = 355585677;
        od.mcaf[207] = 1852173743;
        od.mcaf[208] = 722803369;
        od.mcaf[209] = 1652157860;
        od.mcaf[210] = 4591226;
        od.mcaf[211] = 1066560299;
        od.mcaf[212] = 803363182;
        od.mcaf[213] = -826977743;
        od.mcaf[214] = 920268150;
        od.mcaf[215] = -1568976865;
        od.mcaf[216] = 1984784394;
        od.mcaf[217] = 1013489482;
        od.mcaf[218] = 929924102;
        od.mcaf[219] = -733081847;
        od.mcaf[220] = -248046585;
        od.mcaf[221] = -65562523;
        od.mcaf[222] = 2100548568;
        od.mcaf[223] = -82203051;
        od.mcaf[224] = 848708295;
        od.mcaf[225] = 996886958;
        od.mcaf[226] = -1248729826;
        od.mcaf[227] = -272472114;
        od.mcaf[228] = 1497862347;
        od.mcaf[229] = 1581967702;
        od.mcaf[230] = 1833684988;
        od.mcaf[231] = -1485936181;
        od.mcaf[232] = -469332501;
        od.mcaf[233] = -899551445;
        od.mcaf[234] = 495320819;
        od.mcaf[235] = -355054500;
        od.mcaf[236] = -277228102;
        od.mcaf[237] = -340125561;
        od.mcaf[238] = -1926042986;
        od.mcaf[239] = -1473903526;
        od.mcaf[240] = -1696753452;
        od.mcaf[241] = -1785622311;
        od.mcaf[242] = -790172205;
        od.mcaf[243] = 1976370830;
        od.mcaf[244] = -2057266535;
        od.mcaf[245] = -898646375;
        od.mcaf[246] = 495706489;
        od.mcaf[247] = 922491487;
        od.mcaf[248] = 1906314653;
        od.mcaf[249] = -353617576;
        od.mcaf[250] = 1933307640;
        od.mcaf[251] = -2002988729;
        od.mcaf[252] = 809739621;
        od.mcaf[253] = 1912000946;
        od.mcaf[254] = 1563194917;
        od.mcaf[255] = -88077537;
        od.mcaf[256] = 681520983;
        od.mcaf[257] = 1462839337;
        od.mcaf[258] = 450914829;
        od.mcaf[259] = -1644217415;
        od.mcaf[260] = 1149414259;
        od.mcaf[261] = 485329782;
        od.mcaf[262] = -127709017;
        od.mcaf[263] = -772306546;
        od.mcaf[264] = -2063899134;
        od.mcaf[265] = 1199699405;
        od.mcaf[266] = 1877720142;
        od.mcaf[267] = -1773633944;
        od.mcaf[268] = 1313511512;
        od.mcaf[269] = -845222052;
        od.mcaf[270] = -1062015541;
        od.mcaf[271] = 1746582745;
        od.mcaf[272] = -449584777;
        od.mcaf[273] = 688581550;
        od.mcaf[274] = 1744120487;
        od.mcaf[275] = 1846865013;
        od.mcaf[276] = -1665375111;
        od.mcaf[277] = -37372924;
        od.mcaf[278] = 752789552;
        od.mcaf[279] = 1053303925;
        od.mcaf[280] = -36065171;
        od.mcaf[281] = 374107456;
        od.mcaf[282] = 978684761;
        od.mcaf[283] = 232230657;
        od.mcaf[284] = 1523536823;
        od.mcaf[285] = -568260556;
        od.mcaf[286] = 945295671;
        od.mcaf[287] = 2051780050;
        od.mcaf[288] = -441175763;
        od.mcaf[289] = 490800919;
        od.mcaf[290] = 1455518934;
        od.mcaf[291] = -1153195911;
        od.mcaf[292] = 1219458949;
        od.mcaf[293] = -475767927;
        od.mcaf[294] = 610680045;
        od.mcaf[295] = 664426253;
        od.mcaf[296] = 1701974668;
        od.mcaf[297] = -691733904;
        od.mcaf[298] = -1363411232;
        od.mcaf[299] = -497297847;
    }

    private static /* synthetic */ void mdjk() {
        od.mcas[300] = 7043974636480727792L;
        od.mcas[301] = 4227670684287182814L;
        od.mcas[302] = 5246187204691072370L;
        od.mcas[303] = -4472814947589618311L;
        od.mcas[304] = -19085741020610774L;
        od.mcas[305] = 4952524034688099212L;
        od.mcas[306] = 4240242537602700309L;
        od.mcas[307] = 7949396175929196413L;
        od.mcas[308] = 5022362443646967699L;
        od.mcas[309] = -638635550162351058L;
        od.mcas[310] = 5670412616325044559L;
        od.mcas[311] = -2307630495177048465L;
        od.mcas[312] = 8371480404918787618L;
        od.mcas[313] = 7481447550466903452L;
        od.mcas[314] = 5038964466378834336L;
        od.mcas[315] = 9184190821686392036L;
        od.mcas[316] = -38710695922109695L;
        od.mcas[317] = 7631518154850892256L;
        od.mcas[318] = 447771328163658107L;
        od.mcas[319] = -1363479687009848961L;
        od.mcas[320] = -5954271655984578568L;
        od.mcas[321] = 8419420043190390299L;
        od.mcas[322] = 6883019589176948181L;
        od.mcas[323] = -2723806900163845218L;
        od.mcas[324] = 5465909633808918469L;
        od.mcas[325] = -1636145591548497865L;
        od.mcas[326] = -3056605150674490574L;
        od.mcas[327] = 1239336697912700424L;
        od.mcas[328] = 4504276387577893584L;
        od.mcas[329] = -1158186474583230866L;
        od.mcas[330] = -7536134875851103609L;
        od.mcas[331] = 6717852284417562255L;
        od.mcas[332] = -3725265603995545586L;
        od.mcas[333] = -1643666255554085572L;
        od.mcas[334] = 674980451474254141L;
        od.mcas[335] = -3033566663134135495L;
        od.mcas[336] = 3776417938563548299L;
        od.mcas[337] = 3079075580783369983L;
        od.mcas[338] = 3940001345471813395L;
        od.mcas[339] = 1333555671850463380L;
        od.mcas[340] = -3927565403109052868L;
        od.mcas[341] = 7763295251291665519L;
        od.mcas[342] = -944119969357960244L;
        od.mcas[343] = -4251558112809434674L;
        od.mcas[344] = 7504842251479410650L;
        od.mcas[345] = -2565380877459652216L;
        od.mcas[346] = 6113418016787887073L;
        od.mcas[347] = 7850093347701642359L;
        od.mcas[348] = -2223296158258322053L;
        od.mcas[349] = 73302709516568608L;
        od.mcas[350] = -640851566992056892L;
        od.mcas[351] = -6781728158006598238L;
        od.mcas[352] = -3436296898561460631L;
        od.mcas[353] = 3421767610382428299L;
        od.mcas[354] = 9212289944835341242L;
        od.mcas[355] = -5978159867496294762L;
        od.mcas[356] = -5342179880490397466L;
        od.mcas[357] = -3219769729092651591L;
        od.mcas[358] = 4974079008656813268L;
        od.mcas[359] = -1908508653843416253L;
        od.mcas[360] = -1417725879862061544L;
        od.mcas[361] = -4121067140249559077L;
        od.mcas[362] = 6617243219152655088L;
        od.mcas[363] = -5693991707026913175L;
        od.mcas[364] = -5096676946602712095L;
        od.mcas[365] = 1112241420808972371L;
        od.mcas[366] = -8985446000703505440L;
        od.mcas[367] = -2702017568983400714L;
        od.mcas[368] = -6135223441060029532L;
        od.mcas[369] = -8663183979102897847L;
        od.mcas[370] = 3242890984844187049L;
        od.mcas[371] = -495712856303838047L;
        od.mcas[372] = 2947754042048881736L;
        od.mcas[373] = -1893388009457019468L;
        od.mcas[374] = 6677227164915065969L;
        od.mcas[375] = 6983679179556453986L;
        od.mcas[376] = 25057572474354546L;
        od.mcas[377] = 5057250414481395305L;
        od.mcas[378] = -6924147854150282051L;
        od.mcas[379] = -6718719712162603602L;
        od.mcas[380] = 7694516332375303473L;
        od.mcas[381] = -9182567219936301817L;
        od.mcas[382] = -8664646075169027488L;
        od.mcas[383] = -2101012925476829387L;
        od.mcas[384] = 1209690350910537985L;
        od.mcas[385] = -4822178876759522526L;
        od.mcas[386] = -8854196031394853885L;
        od.mcas[387] = 7040938943193922560L;
        od.mcas[388] = -3830173728955612151L;
        od.mcas[389] = -9006535152338263588L;
        od.mcas[390] = 245331145309328726L;
        od.mcas[391] = 7949529344398869125L;
        od.mcas[392] = -3117714585277588698L;
        od.mcas[393] = 8579803415743436601L;
        od.mcas[394] = 3905595286872887307L;
        od.mcas[395] = -4411014428542861745L;
        od.mcas[396] = 8707968121938335954L;
        od.mcas[397] = -4276265340571034371L;
        od.mcas[398] = -904474477974731282L;
        od.mcas[399] = -2887031160464790351L;
    }

    private static /* synthetic */ void mdje() {
        od.mcar[200] = -5669018154457853720L;
        od.mcar[201] = -2251070648782070429L;
        od.mcar[202] = -7163088524899267531L;
        od.mcar[203] = -488041180772999952L;
        od.mcar[204] = -1406119780343995136L;
        od.mcar[205] = -5720477973153993441L;
        od.mcar[206] = -2254970931960869076L;
        od.mcar[207] = -1153247074897483705L;
        od.mcar[208] = 7013082281097033260L;
        od.mcar[209] = 1364915223524720630L;
        od.mcar[210] = 8848519185338968725L;
        od.mcar[211] = 7295170777693372622L;
        od.mcar[212] = -4247828547928501221L;
        od.mcar[213] = -7432309760437398980L;
        od.mcar[214] = 3128528075651014744L;
        od.mcar[215] = -4630706331752748190L;
        od.mcar[216] = 2615991205005779719L;
        od.mcar[217] = -2253564848999404236L;
        od.mcar[218] = -579799827334610925L;
        od.mcar[219] = 836374800406152868L;
        od.mcar[220] = -7821028173002265606L;
        od.mcar[221] = -1305984412814977761L;
        od.mcar[222] = -8938230415685925737L;
        od.mcar[223] = 704880255532155368L;
        od.mcar[224] = 4261465983349059212L;
        od.mcar[225] = 3570571329503831495L;
        od.mcar[226] = 5621298184135875969L;
        od.mcar[227] = 3853003613587371431L;
        od.mcar[228] = 2461843421418502940L;
        od.mcar[229] = 7116162673357117777L;
        od.mcar[230] = 2982706154639088753L;
        od.mcar[231] = 7308750305134768613L;
        od.mcar[232] = 4173618828446573344L;
        od.mcar[233] = 129912360675473285L;
        od.mcar[234] = 5055827106935680880L;
        od.mcar[235] = 8799242405684033917L;
        od.mcar[236] = -8613341157447500150L;
        od.mcar[237] = 4754656883727605878L;
        od.mcar[238] = 4862523078617774949L;
        od.mcar[239] = -1261696348900696787L;
        od.mcar[240] = -683098329597547897L;
        od.mcar[241] = 1760296051922128205L;
        od.mcar[242] = -276423371344480447L;
        od.mcar[243] = -3234570713479510235L;
        od.mcar[244] = -3504557829196368798L;
        od.mcar[245] = -7159672302867609965L;
        od.mcar[246] = 238962188840259340L;
        od.mcar[247] = -4585228990355705393L;
        od.mcar[248] = -5240943515608028501L;
        od.mcar[249] = 1878339739353079666L;
        od.mcar[250] = 495811282324656228L;
        od.mcar[251] = 1215334079539290731L;
        od.mcar[252] = 2336035385039517546L;
        od.mcar[253] = 1185534011866077951L;
        od.mcar[254] = -5684501606670572264L;
        od.mcar[255] = 6435542677236915329L;
        od.mcar[256] = -1637566786924089817L;
        od.mcar[257] = -1547546872802680330L;
        od.mcar[258] = -9002180990564546001L;
        od.mcar[259] = 4973754141623372315L;
        od.mcar[260] = 89088241720848629L;
        od.mcar[261] = -9125792260775502703L;
        od.mcar[262] = 2605475059099929329L;
        od.mcar[263] = -3348692984772167534L;
        od.mcar[264] = -3291891879233532498L;
        od.mcar[265] = 380581650681968147L;
        od.mcar[266] = 632941035260232588L;
        od.mcar[267] = -8659262006589654472L;
        od.mcar[268] = 3724930160724661618L;
        od.mcar[269] = 6308730846807880812L;
        od.mcar[270] = 1176460546690885353L;
        od.mcar[271] = 1240637338528357284L;
        od.mcar[272] = -8569960929190047964L;
        od.mcar[273] = -8597233779959832495L;
        od.mcar[274] = -626270557363465838L;
        od.mcar[275] = -2020668969710752865L;
        od.mcar[276] = 8050169280025047119L;
        od.mcar[277] = 891264110367991481L;
        od.mcar[278] = 1984028411067747197L;
        od.mcar[279] = -9137066354926692007L;
        od.mcar[280] = 2477974232376359097L;
        od.mcar[281] = 7594820538025408839L;
        od.mcar[282] = -1285093492993685562L;
        od.mcar[283] = 9075083155352972350L;
        od.mcar[284] = 7666598453300018965L;
        od.mcar[285] = 8117218389059333283L;
        od.mcar[286] = 518725305354571629L;
        od.mcar[287] = -1088748057335819835L;
        od.mcar[288] = -4649139061933799842L;
        od.mcar[289] = -4860572110198446263L;
        od.mcar[290] = -4213803606856445731L;
        od.mcar[291] = -4328414608101937191L;
        od.mcar[292] = -2563190609675635266L;
        od.mcar[293] = -7295634846003699931L;
        od.mcar[294] = 6284462939126550728L;
        od.mcar[295] = 8155370318363399032L;
        od.mcar[296] = -8824256919921933972L;
        od.mcar[297] = -848054424963526718L;
        od.mcar[298] = 5018168195986898282L;
        od.mcar[299] = -1564435439840657534L;
    }

    private static /* synthetic */ void mdji() {
        od.mcas[100] = 2930117129669413102L;
        od.mcas[101] = -5847211034493267504L;
        od.mcas[102] = 2673047739899107400L;
        od.mcas[103] = -7337109970845014153L;
        od.mcas[104] = -2463424114312903518L;
        od.mcas[105] = -3095959774743758365L;
        od.mcas[106] = -1595538739325886758L;
        od.mcas[107] = 788435109768993224L;
        od.mcas[108] = -690331354677928514L;
        od.mcas[109] = 4662240248669576890L;
        od.mcas[110] = -8966421493542837515L;
        od.mcas[111] = -3656765427375419221L;
        od.mcas[112] = 6785229656531118624L;
        od.mcas[113] = 2388980306298655049L;
        od.mcas[114] = 8646997815348418665L;
        od.mcas[115] = -329248082784734672L;
        od.mcas[116] = -6517299385497755552L;
        od.mcas[117] = -1159694043060393662L;
        od.mcas[118] = -2286171277172936517L;
        od.mcas[119] = -5602641560984548585L;
        od.mcas[120] = -6262086847910682681L;
        od.mcas[121] = -1359233984589776908L;
        od.mcas[122] = 7768732074855966534L;
        od.mcas[123] = -8409493863815281241L;
        od.mcas[124] = 1605972445942105531L;
        od.mcas[125] = -4465831598991953366L;
        od.mcas[126] = -6626297608410690067L;
        od.mcas[127] = 2251985404013598855L;
        od.mcas[128] = -6020342138553099619L;
        od.mcas[129] = 2387833508075970982L;
        od.mcas[130] = -259344154676599460L;
        od.mcas[131] = 7293059627804108216L;
        od.mcas[132] = -8050420085406210170L;
        od.mcas[133] = 4283370953064409935L;
        od.mcas[134] = -8405387772468365257L;
        od.mcas[135] = -3283850173672034975L;
        od.mcas[136] = -138847737135926276L;
        od.mcas[137] = 894926684537913635L;
        od.mcas[138] = 2757077474617478079L;
        od.mcas[139] = 2051282492818868117L;
        od.mcas[140] = -8270928254786324971L;
        od.mcas[141] = 2267953476986118852L;
        od.mcas[142] = 5048051409259033780L;
        od.mcas[143] = -3596565364886109102L;
        od.mcas[144] = 7689313283069301211L;
        od.mcas[145] = -5675772728765623133L;
        od.mcas[146] = -1480964467379166708L;
        od.mcas[147] = -1095582461346625178L;
        od.mcas[148] = -6006805327507477992L;
        od.mcas[149] = -8100013098213422158L;
        od.mcas[150] = 7887520433564249060L;
        od.mcas[151] = 1248994681243933803L;
        od.mcas[152] = -155612606199268497L;
        od.mcas[153] = 7767747258089749014L;
        od.mcas[154] = 392676468123503141L;
        od.mcas[155] = -2401502151203642520L;
        od.mcas[156] = -2412037755259734972L;
        od.mcas[157] = -151687006513192081L;
        od.mcas[158] = 9063002412648103791L;
        od.mcas[159] = 1589775943850078051L;
        od.mcas[160] = 2447356233092549453L;
        od.mcas[161] = 9022753929256173243L;
        od.mcas[162] = -2246170120782354592L;
        od.mcas[163] = 819061004322350464L;
        od.mcas[164] = -729246932283240517L;
        od.mcas[165] = -2462725952166414569L;
        od.mcas[166] = 8054420637995217605L;
        od.mcas[167] = 7946666897583122998L;
        od.mcas[168] = -5065589468214173281L;
        od.mcas[169] = -8829808469038578119L;
        od.mcas[170] = -4684559316297698692L;
        od.mcas[171] = 2439720211071520562L;
        od.mcas[172] = 5675730111916323903L;
        od.mcas[173] = -5134178506283438921L;
        od.mcas[174] = -1150830116690677793L;
        od.mcas[175] = 7472001571462301453L;
        od.mcas[176] = 8103564442425561760L;
        od.mcas[177] = 8882621502092416173L;
        od.mcas[178] = 8567714021325778451L;
        od.mcas[179] = 8898699880776996700L;
        od.mcas[180] = -5870998086148782076L;
        od.mcas[181] = 27669514763543477L;
        od.mcas[182] = -2997505748927604917L;
        od.mcas[183] = -6063952615090664140L;
        od.mcas[184] = -2036640273055764652L;
        od.mcas[185] = -4383220679727455138L;
        od.mcas[186] = -6512923911874044325L;
        od.mcas[187] = 6945974852932647248L;
        od.mcas[188] = 8418312976585618970L;
        od.mcas[189] = 2636560786528119326L;
        od.mcas[190] = 7892043600712843431L;
        od.mcas[191] = -1212476661370983183L;
        od.mcas[192] = -6991094572652947539L;
        od.mcas[193] = 4546114638082439546L;
        od.mcas[194] = -4317431497986960570L;
        od.mcas[195] = -4602834019124873722L;
        od.mcas[196] = -6596216344153473809L;
        od.mcas[197] = 3900955525122701420L;
        od.mcas[198] = 4240224063850995692L;
        od.mcas[199] = -766006501061071122L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od setLoopStrategy(od$LoopStrategy var1_1) {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(od.mcag("mcpo", mcaq(int ), (int)199) - od.mcag("mcpn", mcaq(int ), (int)198));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -714508833: {
                    break block22;
                }
                case 1419059118: {
                    continue block22;
                }
            }
            break;
        }
        var4_2 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(od.mcag("mcpq", mcaq(int ), (int)201) - od.mcag("mcpp", mcaq(int ), (int)200));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block23;
                }
                case 217240300: {
                    continue block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = od.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcpr", mcaq(int ), (int)202)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == od.mcag("mcps", mcad(int ), (int)195)) break;
                    v2 /* !! */  = (long)od.mcag("mcpt", mcad(int ), (int)196);
                }
                var2_4 = od.a;
                if (var4_2) {
                    throw null;
lbl33:
                    // 2 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl33
                v3 /* !! */  = od.va;
                if (true) ** GOTO lbl40
                block26: while (true) {
                    v3 /* !! */  = (long)(v4 - od.mcag("mcpu", mcaq(int ), (int)203));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1326511014: {
                            v4 = od.mcag("mcpv", mcaq(int ), (int)204);
                            continue block26;
                        }
                        case -899720132: {
                            v4 = od.mcag("mcpw", mcaq(int ), (int)205);
                            continue block26;
                        }
                        case -714508833: {
                            break block26;
                        }
                        case 56549266: {
                            v4 = od.mcag("mcpx", mcaq(int ), (int)206);
                            continue block26;
                        }
                    }
                    break;
                }
                this.loopStrategy = var1_1;
                if (var2_4 || var2_4) ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)od.mcag("mcpy", mcad(int ), (int)197);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)od.mcag("mcpz", mcad(int ), (int)198);
                    if (!var4_2) break block8;
                    throw null;
                }
            }
lbl65:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)od.mcag("mcqa", mcad(int ), (int)199);
                } while (!var4_2);
                throw null;
            }
lbl70:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)od.mcag("mcqb", mcad(int ), (int)200);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)od.mcag("mcqc", mcad(int ), (int)201);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)od.mcag("mcqd", mcad(int ), (int)202);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$LoopStrategy getLoopStrategy() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcvt", mcaq(int ), (int)263)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcvu", mcad(int ), (int)292)) break;
            v0 /* !! */  = (long)od.mcag("mcvv", mcad(int ), (int)293);
        }
        var3_1 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mcvw", mcaq(int ), (int)264));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2124632339: {
                    v2 = od.mcag("mcvx", mcaq(int ), (int)265);
                    continue block13;
                }
                case -1502579639: {
                    v2 = od.mcag("mcvy", mcaq(int ), (int)266);
                    continue block13;
                }
                case -714508833: {
                    break block13;
                }
                case 1019139451: {
                    v2 = od.mcag("mcvz", mcaq(int ), (int)267);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = od.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcwa", mcaq(int ), (int)268)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == od.mcag("mcwb", mcad(int ), (int)294)) break;
                    v3 /* !! */  = (long)od.mcag("mcwc", mcad(int ), (int)295);
                }
                var1_3 = od.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcwd", mcaq(int ), (int)269)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == od.mcag("mcwe", mcad(int ), (int)296)) break;
                    v4 /* !! */  = (long)od.mcag("mcwf", mcad(int ), (int)297);
                }
                return this.loopStrategy;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mcwg", mcad(int ), (int)298);
                } while (!var3_1);
                throw null;
            }
lbl52:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od.mcag("mcwh", mcad(int ), (int)299);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od.mcag("mcwi", mcad(int ), (int)300);
                    if (!var3_1) ** GOTO lbl52
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)od.mcag("mcwj", mcad(int ), (int)301);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdiw() {
        od.mcae[400] = 119444488;
        od.mcae[401] = 1384675732;
        od.mcae[402] = -2033832426;
        od.mcae[403] = -257202455;
        od.mcae[404] = 2097288548;
        od.mcae[405] = -281874366;
        od.mcae[406] = 1820364052;
        od.mcae[407] = 704219051;
        od.mcae[408] = -1039571279;
        od.mcae[409] = -1713741354;
        od.mcae[410] = 1954054181;
        od.mcae[411] = 1655599209;
        od.mcae[412] = -1082829168;
        od.mcae[413] = -1377372376;
        od.mcae[414] = 2063579769;
        od.mcae[415] = 1078523766;
        od.mcae[416] = -1606412606;
        od.mcae[417] = -1305146858;
        od.mcae[418] = -971521752;
        od.mcae[419] = -9298232;
        od.mcae[420] = 1662682855;
        od.mcae[421] = -1398128654;
        od.mcae[422] = 1855323058;
        od.mcae[423] = 1054857102;
        od.mcae[424] = -843259752;
        od.mcae[425] = 286191747;
        od.mcae[426] = 2025751027;
        od.mcae[427] = -596359791;
        od.mcae[428] = 836736000;
        od.mcae[429] = 824699672;
        od.mcae[430] = -2056527015;
        od.mcae[431] = -2112257862;
        od.mcae[432] = -164559602;
        od.mcae[433] = -1287866226;
        od.mcae[434] = 983022817;
        od.mcae[435] = -473968589;
        od.mcae[436] = 658474880;
        od.mcae[437] = -1716708667;
        od.mcae[438] = 298927187;
        od.mcae[439] = 1375288366;
        od.mcae[440] = -1996400529;
        od.mcae[441] = -604632014;
        od.mcae[442] = -1742638299;
        od.mcae[443] = -792987727;
        od.mcae[444] = -401492094;
        od.mcae[445] = 71926185;
        od.mcae[446] = 544744288;
        od.mcae[447] = 1769266965;
        od.mcae[448] = -500140579;
        od.mcae[449] = 1358126553;
        od.mcae[450] = 1679412243;
        od.mcae[451] = 208232184;
        od.mcae[452] = -153036311;
        od.mcae[453] = -1429485387;
        od.mcae[454] = 1769855352;
        od.mcae[455] = -655955703;
        od.mcae[456] = -550382799;
        od.mcae[457] = -654879135;
        od.mcae[458] = 137491804;
        od.mcae[459] = 249187711;
        od.mcae[460] = -1448294226;
        od.mcae[461] = -1378840072;
        od.mcae[462] = -485560277;
        od.mcae[463] = 141453844;
        od.mcae[464] = -639262598;
        od.mcae[465] = 1045583146;
        od.mcae[466] = -1395246653;
        od.mcae[467] = 329487078;
        od.mcae[468] = 1887681053;
        od.mcae[469] = -427094731;
        od.mcae[470] = -76495463;
        od.mcae[471] = -1134928175;
        od.mcae[472] = 1742500361;
        od.mcae[473] = 920665164;
    }

    private static /* synthetic */ void mdjg() {
        od.mcar[400] = -3101674316674423830L;
        od.mcar[401] = 6115035456051009472L;
        od.mcar[402] = 2497765728172600343L;
        od.mcar[403] = 3668359698336916203L;
        od.mcar[404] = 4375315876620861289L;
        od.mcar[405] = -4670156003027718736L;
        od.mcar[406] = 4863924510974801969L;
        od.mcar[407] = -7726705958960084486L;
        od.mcar[408] = 7633678629542011507L;
        od.mcar[409] = 4383842407761291192L;
        od.mcar[410] = 1411838385906081400L;
        od.mcar[411] = 7382668459841599095L;
        od.mcar[412] = -5391660177399704877L;
        od.mcar[413] = 8357034468138702513L;
        od.mcar[414] = 3211921561680343296L;
        od.mcar[415] = 5757234415014434092L;
        od.mcar[416] = 1503569949088088898L;
        od.mcar[417] = 7748587553113894827L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<od$ScriptStep> getScriptSteps() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcsq", mcaq(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcsr", mcad(int ), (int)239)) break;
            v0 /* !! */  = (long)od.mcag("mcss", mcad(int ), (int)240);
        }
        var3_1 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mcst", mcaq(int ), (int)236));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1302553609: {
                    v2 = od.mcag("mcsu", mcaq(int ), (int)237);
                    continue block13;
                }
                case -927195623: {
                    v2 = od.mcag("mcsv", mcaq(int ), (int)238);
                    continue block13;
                }
                case -714508833: {
                    break block13;
                }
                case 1316098684: {
                    v2 = od.mcag("mcsw", mcaq(int ), (int)239);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = od.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcsx", mcaq(int ), (int)240)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == od.mcag("mcsy", mcad(int ), (int)241)) break;
            v3 /* !! */  = (long)od.mcag("mcsz", mcad(int ), (int)242);
        }
        var1_3 = od.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcta", mcaq(int ), (int)241)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == od.mcag("mctb", mcad(int ), (int)243)) break;
                    v4 /* !! */  = (long)od.mcag("mctc", mcad(int ), (int)244);
                }
                return this.scriptSteps;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mctd", mcad(int ), (int)245);
                } while (!var3_1);
                throw null;
            }
lbl53:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mcte", mcad(int ), (int)246);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)od.mcag("mctf", mcad(int ), (int)247);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)od.mcag("mctg", mcad(int ), (int)248);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getCurrentStepIndex() {
        block20: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mctx", mcaq(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == od.mcag("mcty", mcad(int ), (int)259)) break;
                v0 /* !! */  = (long)od.mcag("mctz", mcad(int ), (int)260);
            }
            var3_1 = od.c;
            v1 /* !! */  = od.va;
            block11: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case -774149570: {
                        v1 /* !! */  = (long)(od.mcag("mcub", mcaq(int ), (int)250) - od.mcag("mcua", mcaq(int ), (int)249));
                        continue block11;
                    }
                    case -714508833: {
                        break block11;
                    }
                }
                break;
            }
            var2_2 /* !! */  = od.b;
            while (true) {
                block21: {
                    if ((v2 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcuc", mcaq(int ), (int)251)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  != od.mcag("mcud", mcad(int ), (int)261)) break block21;
                    var1_3 = od.a;
                    if (var2_2 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v2 /* !! */  = (long)od.mcag("mcue", mcad(int ), (int)262);
            }
            cfr_temp_0 = -2147483648;
            block13: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return (int)od.mcag("mcuf", mcad(int ), (int)263);
                        if (var1_3 != false) return (int)od.mcag("mcuf", mcad(int ), (int)263);
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcug", mcaq(int ), (int)252)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == od.mcag("mcuh", mcad(int ), (int)264)) {
                                return this.currentStepIndex;
                            }
                            v3 /* !! */  = (long)od.mcag("mcui", mcad(int ), (int)265);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)od.mcag("mcuj", mcad(int ), (int)266);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block13;
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block20;
                    }
lbl49:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)od.mcag("mcuk", mcad(int ), (int)267);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block13;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)od.mcag("mcul", mcad(int ), (int)268);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)od.mcag("mcum", mcad(int ), (int)269);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void resetTime() {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(od.mcag("mcht", mcaq(int ), (int)100) - od.mcag("mchs", mcaq(int ), (int)99));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -714508833: {
                    break block32;
                }
                case -386209571: {
                    continue block32;
                }
            }
            break;
        }
        var3_1 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl15
        block33: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mchu", mcaq(int ), (int)101));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block33;
                }
                case -706300908: {
                    v2 = od.mcag("mchv", mcaq(int ), (int)102);
                    continue block33;
                }
                case 475183390: {
                    v2 = od.mcag("mchw", mcaq(int ), (int)103);
                    continue block33;
                }
                case 616349927: {
                    v2 = od.mcag("mchx", mcaq(int ), (int)104);
                    continue block33;
                }
            }
            break;
        }
        var2_2 /* !! */  = od.b;
        v3 /* !! */  = od.va;
        if (true) ** GOTO lbl32
        block34: while (true) {
            v3 /* !! */  = (long)(v4 - od.mcag("mchy", mcaq(int ), (int)105));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -714508833: {
                    break block34;
                }
                case -577155747: {
                    v4 = od.mcag("mchz", mcaq(int ), (int)106);
                    continue block34;
                }
                case 159813792: {
                    v4 = od.mcag("mcia", mcaq(int ), (int)107);
                    continue block34;
                }
            }
            break;
        }
        var1_3 = od.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                v5 /* !! */  = od.va;
                if (true) ** GOTO lbl53
                block36: while (true) {
                    v5 /* !! */  = (long)(v6 - od.mcag("mcib", mcaq(int ), (int)108));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1129900890: {
                            v6 = od.mcag("mcic", mcaq(int ), (int)109);
                            continue block36;
                        }
                        case -714508833: {
                            break block36;
                        }
                        case 1282854289: {
                            v6 = od.mcag("mcid", mcaq(int ), (int)110);
                            continue block36;
                        }
                    }
                    break;
                }
                v7 /* !! */  = od.va;
                if (true) ** GOTO lbl66
                block37: while (true) {
                    v7 /* !! */  = (long)(od.mcag("mcif", mcaq(int ), (int)112) - od.mcag("mcie", mcaq(int ), (int)111));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -714508833: {
                            break block37;
                        }
                        case 1783228194: {
                            continue block37;
                        }
                    }
                    break;
                }
                this.time.reset();
                if (var1_3 || var1_3) continue block35;
                return;
lbl74:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)od.mcag("mcig", mcad(int ), (int)91);
                    } while (!var3_1);
                    throw null;
                }
lbl79:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)od.mcag("mcih", mcad(int ), (int)92);
                    if (!var3_1) break block35;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)od.mcag("mcii", mcad(int ), (int)93);
                        if (!var3_1) ** GOTO lbl74
                        throw null;
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)od.mcag("mcij", mcad(int ), (int)94);
                    if (!var3_1) ** GOTO lbl79
                    throw null;
                }
                case 4: {
                    var2_2 /* !! */  = (int)od.mcag("mcik", mcad(int ), (int)95);
                    if (!var3_1) break block35;
                    throw null;
                }
                case 5: 
            }
        }
        var2_2 /* !! */  = (int)od.mcag("mcil", mcad(int ), (int)96);
        ** while (!var3_1)
lbl99:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCurrentTickStepIndex(int var1_1) {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - od.mcag("mcxc", mcaq(int ), (int)279));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1265940319: {
                    v1 = od.mcag("mcxd", mcaq(int ), (int)280);
                    continue block25;
                }
                case -714508833: {
                    break block25;
                }
                case 830419166: {
                    v1 = od.mcag("mcxe", mcaq(int ), (int)281);
                    continue block25;
                }
                case 2002677162: {
                    v1 = od.mcag("mcxf", mcaq(int ), (int)282);
                    continue block25;
                }
            }
            break;
        }
        var4_2 = od.c;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(od.mcag("mcxh", mcaq(int ), (int)284) - od.mcag("mcxg", mcaq(int ), (int)283));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -714508833: {
                    break block26;
                }
                case -498968314: {
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = od.b;
        v3 /* !! */  = od.va;
        if (true) ** GOTO lbl32
        block27: while (true) {
            v3 /* !! */  = (long)(od.mcag("mcxj", mcaq(int ), (int)286) - od.mcag("mcxi", mcaq(int ), (int)285));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1802165855: {
                    continue block27;
                }
                case -714508833: {
                    break block27;
                }
            }
            break;
        }
        var2_4 = od.a;
        if (var4_2) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        v4 /* !! */  = od.va;
        if (true) ** GOTO lbl47
        block29: while (true) {
            v4 /* !! */  = (long)(od.mcag("mcxl", mcaq(int ), (int)288) - od.mcag("mcxk", mcaq(int ), (int)287));
lbl47:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -714508833: {
                    break block29;
                }
                case 1692758609: {
                    continue block29;
                }
            }
            break;
        }
        this.currentTickStepIndex = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl59:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)od.mcag("mcxm", mcad(int ), (int)311);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)od.mcag("mcxn", mcad(int ), (int)312);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)od.mcag("mcxo", mcad(int ), (int)313);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)od.mcag("mcxp", mcad(int ), (int)314);
                    if (!var4_2) ** GOTO lbl59
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od.mcag("mcxq", mcad(int ), (int)315);
        ** while (!var4_2)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdjb() {
        od.mcaf[400] = 1496798166;
        od.mcaf[401] = -1384675733;
        od.mcaf[402] = 465521317;
        od.mcaf[403] = -257202456;
        od.mcaf[404] = 1835209256;
        od.mcaf[405] = -281874365;
        od.mcaf[406] = -1820364053;
        od.mcaf[407] = 278921803;
        od.mcaf[408] = -1039571280;
        od.mcaf[409] = -1115096890;
        od.mcaf[410] = -1954054182;
        od.mcaf[411] = 2122830773;
        od.mcaf[412] = 1082829167;
        od.mcaf[413] = 1687556969;
        od.mcaf[414] = 2063579768;
        od.mcaf[415] = 1667328035;
        od.mcaf[416] = 1606412605;
        od.mcaf[417] = -1057552250;
        od.mcaf[418] = -971521735;
        od.mcaf[419] = -9298237;
        od.mcaf[420] = 1662682853;
        od.mcaf[421] = -1398128652;
        od.mcaf[422] = 1855323046;
        od.mcaf[423] = 1054857119;
        od.mcaf[424] = -843259752;
        od.mcaf[425] = 286191765;
        od.mcaf[426] = 2025751024;
        od.mcaf[427] = -596359780;
        od.mcaf[428] = 836736016;
        od.mcaf[429] = 824699677;
        od.mcaf[430] = -2056527026;
        od.mcaf[431] = -2112257857;
        od.mcaf[432] = -164559610;
        od.mcaf[433] = -1287866238;
        od.mcaf[434] = 983022820;
        od.mcaf[435] = -473968605;
        od.mcaf[436] = 658474903;
        od.mcaf[437] = -1716708669;
        od.mcaf[438] = 298927173;
        od.mcaf[439] = 1375288367;
        od.mcaf[440] = -1996400529;
        od.mcaf[441] = -604632004;
        od.mcaf[442] = -1742638300;
        od.mcaf[443] = 1496768571;
        od.mcaf[444] = -401492093;
        od.mcaf[445] = 71926184;
        od.mcaf[446] = 544744291;
        od.mcaf[447] = 1769266966;
        od.mcaf[448] = -500140577;
        od.mcaf[449] = 1358126554;
        od.mcaf[450] = 1679412243;
        od.mcaf[451] = 208232185;
        od.mcaf[452] = -153036312;
        od.mcaf[453] = -1429485386;
        od.mcaf[454] = 1769855355;
        od.mcaf[455] = -655955701;
        od.mcaf[456] = 550382798;
        od.mcaf[457] = -1781165867;
        od.mcaf[458] = 137491805;
        od.mcaf[459] = 249187710;
        od.mcaf[460] = -1448294226;
        od.mcaf[461] = -1378840072;
        od.mcaf[462] = -485560280;
        od.mcaf[463] = 141453844;
        od.mcaf[464] = 639262597;
        od.mcaf[465] = 1730403642;
        od.mcaf[466] = 1395246652;
        od.mcaf[467] = 673716629;
        od.mcaf[468] = 1887681052;
        od.mcaf[469] = -427094732;
        od.mcaf[470] = -76495464;
        od.mcaf[471] = -1134928176;
        od.mcaf[472] = 1742500360;
        od.mcaf[473] = 920665167;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<od$ScriptTickStep> getScriptTickSteps() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcth", mcaq(int ), (int)242)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcti", mcad(int ), (int)249)) break;
            v0 /* !! */  = (long)od.mcag("mctj", mcad(int ), (int)250);
        }
        var3_1 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mctk", mcaq(int ), (int)243)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od.mcag("mctl", mcad(int ), (int)251)) break;
            v1 /* !! */  = (long)od.mcag("mctm", mcad(int ), (int)252);
        }
        var2_2 /* !! */  = od.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mctn", mcaq(int ), (int)244)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == od.mcag("mcto", mcad(int ), (int)253)) break;
                    v2 /* !! */  = (long)od.mcag("mctp", mcad(int ), (int)254);
                }
                var1_3 = od.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = od.va;
                if (true) ** GOTO lbl34
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - od.mcag("mctq", mcaq(int ), (int)245));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -714508833: {
                            break block15;
                        }
                        case -193196386: {
                            v4 = od.mcag("mctr", mcaq(int ), (int)246);
                            continue block15;
                        }
                        case 1945064182: {
                            v4 = od.mcag("mcts", mcaq(int ), (int)247);
                            continue block15;
                        }
                    }
                    break;
                }
                return this.scriptTickSteps;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)od.mcag("mctt", mcad(int ), (int)255);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)od.mcag("mctu", mcad(int ), (int)256);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mctv", mcad(int ), (int)257);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)od.mcag("mctw", mcad(int ), (int)258);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdjf() {
        od.mcar[300] = 4901543044154534993L;
        od.mcar[301] = 3886441690385774075L;
        od.mcar[302] = 1801078279746632732L;
        od.mcar[303] = -1613866281337181532L;
        od.mcar[304] = -303520413133559018L;
        od.mcar[305] = 1831158746165877065L;
        od.mcar[306] = 19360672562532672L;
        od.mcar[307] = 5742590405465949795L;
        od.mcar[308] = -1358178225138572630L;
        od.mcar[309] = 3556064969420080307L;
        od.mcar[310] = -2654570352332589167L;
        od.mcar[311] = 1647737122480299684L;
        od.mcar[312] = -4355554585114183493L;
        od.mcar[313] = 8702781344704662799L;
        od.mcar[314] = 8219939061978001731L;
        od.mcar[315] = -6461540781562762125L;
        od.mcar[316] = -2820696544792392152L;
        od.mcar[317] = 9008632708775593874L;
        od.mcar[318] = 6285056550225858958L;
        od.mcar[319] = 6024589025513219730L;
        od.mcar[320] = 7301566438562849286L;
        od.mcar[321] = -5361364397622072382L;
        od.mcar[322] = -969282043448711942L;
        od.mcar[323] = -9164730582432517090L;
        od.mcar[324] = -2454500009867081978L;
        od.mcar[325] = -3757096170339365513L;
        od.mcar[326] = 98950793127142838L;
        od.mcar[327] = -8017528323531227123L;
        od.mcar[328] = -7124043353855288603L;
        od.mcar[329] = 8936066161337218913L;
        od.mcar[330] = -4866479260774427570L;
        od.mcar[331] = 2695547284594004857L;
        od.mcar[332] = -992689393426194637L;
        od.mcar[333] = 5622222235534199187L;
        od.mcar[334] = -2223308706024081447L;
        od.mcar[335] = 4225557220671973057L;
        od.mcar[336] = -843069170734426687L;
        od.mcar[337] = 4042078322357952632L;
        od.mcar[338] = 7913367769827436311L;
        od.mcar[339] = -3906177136322777522L;
        od.mcar[340] = -7903161576044817742L;
        od.mcar[341] = 2340214560329706072L;
        od.mcar[342] = 3050205436936251753L;
        od.mcar[343] = -4789855936380681731L;
        od.mcar[344] = -3602300289285520839L;
        od.mcar[345] = 4096375113789650000L;
        od.mcar[346] = -6499946847081635665L;
        od.mcar[347] = -2911248027445863580L;
        od.mcar[348] = 3673872271315159455L;
        od.mcar[349] = -5343273723719652453L;
        od.mcar[350] = -1429603842304476411L;
        od.mcar[351] = 481945492241298789L;
        od.mcar[352] = -4688921399958039929L;
        od.mcar[353] = 8162812771424365420L;
        od.mcar[354] = 8719627544443969801L;
        od.mcar[355] = -6541968729284559388L;
        od.mcar[356] = -7763338145176848973L;
        od.mcar[357] = 8578994225658498471L;
        od.mcar[358] = 7048408345790226353L;
        od.mcar[359] = -7523560942647938029L;
        od.mcar[360] = 218405434026526059L;
        od.mcar[361] = 2584157495122689092L;
        od.mcar[362] = -7899446688533152662L;
        od.mcar[363] = 167075065583780618L;
        od.mcar[364] = 7314094368200085794L;
        od.mcar[365] = 3060744377432212652L;
        od.mcar[366] = -740919535319202338L;
        od.mcar[367] = 6828321206344650326L;
        od.mcar[368] = -821261116044270403L;
        od.mcar[369] = 5914318942437596107L;
        od.mcar[370] = 3569891751704976805L;
        od.mcar[371] = 2117240198559397063L;
        od.mcar[372] = -7129692055908849289L;
        od.mcar[373] = -470954235654052234L;
        od.mcar[374] = -7408313299923892598L;
        od.mcar[375] = -868346292964031158L;
        od.mcar[376] = -1262943274994280496L;
        od.mcar[377] = -6395725225895171194L;
        od.mcar[378] = -7272156026869627852L;
        od.mcar[379] = 7145112734260128178L;
        od.mcar[380] = 407242659437440822L;
        od.mcar[381] = 4828725753722359557L;
        od.mcar[382] = -6641839692323839348L;
        od.mcar[383] = 5326831529114835880L;
        od.mcar[384] = -5450393976372537749L;
        od.mcar[385] = -34795953704838160L;
        od.mcar[386] = 5222029385105676778L;
        od.mcar[387] = 3648592140625464295L;
        od.mcar[388] = 796248733849739313L;
        od.mcar[389] = 6143206095900177974L;
        od.mcar[390] = -4094661466873105803L;
        od.mcar[391] = 2368505183444596081L;
        od.mcar[392] = -7373074383738714492L;
        od.mcar[393] = 5000719605204467104L;
        od.mcar[394] = -5832857161649820527L;
        od.mcar[395] = -1732598491217362953L;
        od.mcar[396] = -3129477131941039177L;
        od.mcar[397] = 1257838265907746516L;
        od.mcar[398] = 1723633209308527816L;
        od.mcar[399] = 1911070371909882545L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addStep(int var1_1, oe var2_2, BooleanSupplier var3_3, int var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mccy", mcaq(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mccz", mcad(int ), (int)33)) break;
            v0 /* !! */  = (long)od.mcag("mcda", mcad(int ), (int)34);
        }
        var7_5 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcdb", mcaq(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == od.mcag("mcdc", mcad(int ), (int)35)) break;
            v1 /* !! */  = (long)od.mcag("mcdd", mcad(int ), (int)36);
        }
        var6_6 /* !! */  = od.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcde", mcaq(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == od.mcag("mcdf", mcad(int ), (int)37)) break;
            v2 /* !! */  = (long)od.mcag("mcdg", mcad(int ), (int)38);
        }
        var5_7 = od.a;
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_5) {
                    throw null;
lbl24:
                    // 3 sources

                    return null;
                }
                if (var5_7 || var5_7) ** GOTO lbl24
                v3 /* !! */  = od.va;
                if (true) ** GOTO lbl31
                block38: while (true) {
                    v3 /* !! */  = (long)(od.mcag("mcdi", mcaq(int ), (int)37) - od.mcag("mcdh", mcaq(int ), (int)36));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -714508833: {
                            break block38;
                        }
                        case 2075769604: {
                            continue block38;
                        }
                    }
                    break;
                }
                v4 /* !! */  = od.va;
                if (true) ** GOTO lbl40
                block39: while (true) {
                    v4 /* !! */  = (long)(v5 - od.mcag("mcdj", mcaq(int ), (int)38));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1347426913: {
                            v5 = od.mcag("mcdk", mcaq(int ), (int)39);
                            continue block39;
                        }
                        case -714508833: {
                            break block39;
                        }
                        case -189542836: {
                            v5 = od.mcag("mcdl", mcaq(int ), (int)40);
                            continue block39;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcdm", mcaq(int ), (int)41)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == od.mcag("mcdn", mcad(int ), (int)39)) break;
                    v6 /* !! */  = (long)od.mcag("mcdo", mcad(int ), (int)40);
                }
                v7 = new od$ScriptStep(var1_1, var2_2, var3_3, var4_4);
                v8 /* !! */  = od.va;
                if (true) ** GOTO lbl59
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - od.mcag("mcdp", mcaq(int ), (int)42));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1783811505: {
                            v9 = od.mcag("mcdq", mcaq(int ), (int)43);
                            continue block41;
                        }
                        case -1275005282: {
                            v9 = od.mcag("mcdr", mcaq(int ), (int)44);
                            continue block41;
                        }
                        case -1078921916: {
                            v9 = od.mcag("mcds", mcaq(int ), (int)45);
                            continue block41;
                        }
                        case -714508833: {
                            break block41;
                        }
                    }
                    break;
                }
                this.scriptSteps.add(v7);
                if (var5_7 || var5_7) ** GOTO lbl24
                v10 /* !! */  = od.va;
                if (true) ** GOTO lbl78
                block42: while (true) {
                    v10 /* !! */  = (long)(v11 - od.mcag("mcdt", mcaq(int ), (int)46));
lbl78:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -714508833: {
                            break block42;
                        }
                        case -610186309: {
                            v11 = od.mcag("mcdu", mcaq(int ), (int)47);
                            continue block42;
                        }
                        case 231303810: {
                            v11 = od.mcag("mcdv", mcaq(int ), (int)48);
                            continue block42;
                        }
                    }
                    break;
                }
                v12 /* !! */  = od.va;
                if (true) ** GOTO lbl91
                block43: while (true) {
                    v12 /* !! */  = (long)(od.mcag("mcdx", mcaq(int ), (int)50) - od.mcag("mcdw", mcaq(int ), (int)49));
lbl91:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2048364883: {
                            continue block43;
                        }
                        case -714508833: {
                            break block43;
                        }
                    }
                    break;
                }
                Collections.sort(this.scriptSteps);
                if (var5_7 || var5_7) ** continue;
                return this;
            }
lbl99:
            // 2 sources

            case 0: {
                var6_6 /* !! */  = (int)od.mcag("mcdy", mcad(int ), (int)41);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 1: {
                var6_6 /* !! */  = (int)od.mcag("mcdz", mcad(int ), (int)42);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)od.mcag("mcea", mcad(int ), (int)43);
                    if (!var7_5) ** GOTO lbl99
                    throw null;
                }
            }
lbl114:
            // 2 sources

            case 3: {
                var6_6 /* !! */  = (int)od.mcag("mceb", mcad(int ), (int)44);
                if (var7_5) {
                    throw null;
                }
            }
lbl118:
            // 5 sources

            case 4: {
                var6_6 /* !! */  = (int)od.mcag("mcec", mcad(int ), (int)45);
                if (var7_5) {
                    throw null;
                }
            }
            case 5: {
                var6_6 /* !! */  = (int)od.mcag("mced", mcad(int ), (int)46);
                if (!var7_5) ** GOTO lbl118
                throw null;
            }
            case 6: {
                do {
                    var6_6 /* !! */  = (int)od.mcag("mcee", mcad(int ), (int)47);
                } while (!var7_5);
                throw null;
            }
            case 7: 
        }
        var6_6 /* !! */  = (int)od.mcag("mcef", mcad(int ), (int)48);
        ** while (!var7_5)
lbl134:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od cleanup() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mckh", mcaq(int ), (int)134)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mcki", mcad(int ), (int)123)) break;
            v0 /* !! */  = (long)od.mcag("mckj", mcad(int ), (int)124);
        }
        var3_1 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mckk", mcaq(int ), (int)135)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == od.mcag("mckl", mcad(int ), (int)125)) break;
            v1 /* !! */  = (long)od.mcag("mckm", mcad(int ), (int)126);
        }
        var2_2 /* !! */  = od.b;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl17
        block41: while (true) {
            v2 /* !! */  = (long)(od.mcag("mcko", mcaq(int ), (int)137) - od.mcag("mckn", mcaq(int ), (int)136));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1445036388: {
                    continue block41;
                }
                case -714508833: {
                    break block41;
                }
            }
            break;
        }
        var1_3 = od.a;
        if (var3_1) {
            throw null;
lbl25:
            // 6 sources

            return null;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mckp", mcaq(int ), (int)138)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == od.mcag("mckq", mcad(int ), (int)127)) break;
            v3 /* !! */  = (long)od.mcag("mckr", mcad(int ), (int)128);
        }
        v4 /* !! */  = od.va;
        if (true) ** GOTO lbl37
        block44: while (true) {
            v4 /* !! */  = (long)(v5 - od.mcag("mcks", mcaq(int ), (int)139));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -714508833: {
                    break block44;
                }
                case -543295216: {
                    v5 = od.mcag("mckt", mcaq(int ), (int)140);
                    continue block44;
                }
                case 162833542: {
                    v5 = od.mcag("mcku", mcaq(int ), (int)141);
                    continue block44;
                }
                case 1882324070: {
                    v5 = od.mcag("mckv", mcaq(int ), (int)142);
                    continue block44;
                }
            }
            break;
        }
        this.scriptSteps.clear();
        if (var1_3 || var1_3) ** GOTO lbl25
        v6 /* !! */  = od.va;
        if (true) ** GOTO lbl55
        block45: while (true) {
            v6 /* !! */  = (long)(v7 - od.mcag("mckw", mcaq(int ), (int)143));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -968848690: {
                    v7 = od.mcag("mckx", mcaq(int ), (int)144);
                    continue block45;
                }
                case -714508833: {
                    break block45;
                }
                case -346114077: {
                    v7 = od.mcag("mcky", mcaq(int ), (int)145);
                    continue block45;
                }
                case 137166257: {
                    v7 = od.mcag("mckz", mcaq(int ), (int)146);
                    continue block45;
                }
            }
            break;
        }
        v8 /* !! */  = od.va;
        if (true) ** GOTO lbl71
        block46: while (true) {
            v8 /* !! */  = (long)(od.mcag("mclb", mcaq(int ), (int)148) - od.mcag("mcla", mcaq(int ), (int)147));
lbl71:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -714508833: {
                    break block46;
                }
                case 11141038: {
                    continue block46;
                }
            }
            break;
        }
        this.scriptTickSteps.clear();
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v9 /* !! */  = od.va;
                if (true) ** GOTO lbl86
                block47: while (true) {
                    v9 /* !! */  = (long)(v10 - od.mcag("mclc", mcaq(int ), (int)149));
lbl86:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -893695084: {
                            v10 = od.mcag("mcld", mcaq(int ), (int)150);
                            continue block47;
                        }
                        case -714508833: {
                            break block47;
                        }
                        case 59885405: {
                            v10 = od.mcag("mcle", mcaq(int ), (int)151);
                            continue block47;
                        }
                    }
                    break;
                }
                this.resetTime();
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mclf", mcaq(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == od.mcag("mclg", mcad(int ), (int)129)) break;
                    v11 /* !! */  = (long)od.mcag("mclh", mcad(int ), (int)130);
                }
                this.resetStepIndex();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return this;
            }
            case 0: {
                var2_2 /* !! */  = (int)od.mcag("mcli", mcad(int ), (int)131);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl111:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od.mcag("mclj", mcad(int ), (int)132);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)od.mcag("mclk", mcad(int ), (int)133);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 3: {
                var2_2 /* !! */  = (int)od.mcag("mcll", mcad(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl127:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)od.mcag("mclm", mcad(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl132:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)od.mcag("mcln", mcad(int ), (int)136);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)od.mcag("mclo", mcad(int ), (int)137);
                if (var3_1) {
                    throw null;
                }
            }
lbl140:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)od.mcag("mclp", mcad(int ), (int)138);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl145:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)od.mcag("mclq", mcad(int ), (int)139);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl149:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)od.mcag("mclr", mcad(int ), (int)140);
                if (!var3_1) ** GOTO lbl111
                throw null;
            }
lbl153:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)od.mcag("mcls", mcad(int ), (int)141);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)od.mcag("mclt", mcad(int ), (int)142);
        ** while (!var3_1)
lbl160:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mdja() {
        od.mcaf[300] = 98459911;
        od.mcaf[301] = -381792436;
        od.mcaf[302] = 1158683153;
        od.mcaf[303] = -1171342298;
        od.mcaf[304] = 1318817893;
        od.mcaf[305] = -472541153;
        od.mcaf[306] = 819836068;
        od.mcaf[307] = -418763366;
        od.mcaf[308] = -812808104;
        od.mcaf[309] = 71071121;
        od.mcaf[310] = -350554638;
        od.mcaf[311] = -1008613532;
        od.mcaf[312] = 1726730426;
        od.mcaf[313] = 862499848;
        od.mcaf[314] = 1472322937;
        od.mcaf[315] = 285972545;
        od.mcaf[316] = 778755153;
        od.mcaf[317] = -650996268;
        od.mcaf[318] = 88352754;
        od.mcaf[319] = -261727557;
        od.mcaf[320] = 446618659;
        od.mcaf[321] = 475033813;
        od.mcaf[322] = -847810457;
        od.mcaf[323] = 338698585;
        od.mcaf[324] = -1174591454;
        od.mcaf[325] = 909077429;
        od.mcaf[326] = -95411978;
        od.mcaf[327] = -216929643;
        od.mcaf[328] = 183436934;
        od.mcaf[329] = 1867454223;
        od.mcaf[330] = 340248259;
        od.mcaf[331] = 1689271796;
        od.mcaf[332] = -422412622;
        od.mcaf[333] = -230164888;
        od.mcaf[334] = -2073563278;
        od.mcaf[335] = -1572882327;
        od.mcaf[336] = -1227616382;
        od.mcaf[337] = -2133183731;
        od.mcaf[338] = 1667579929;
        od.mcaf[339] = 1894140250;
        od.mcaf[340] = -1041051225;
        od.mcaf[341] = 551617309;
        od.mcaf[342] = 1320384089;
        od.mcaf[343] = -1865381243;
        od.mcaf[344] = -730244584;
        od.mcaf[345] = -1440939396;
        od.mcaf[346] = 8004041;
        od.mcaf[347] = -1331620816;
        od.mcaf[348] = 1400895842;
        od.mcaf[349] = -974116474;
        od.mcaf[350] = -1701418780;
        od.mcaf[351] = 1964191250;
        od.mcaf[352] = -359565532;
        od.mcaf[353] = 1002923253;
        od.mcaf[354] = -1416837841;
        od.mcaf[355] = -1180309326;
        od.mcaf[356] = 1399590032;
        od.mcaf[357] = -243722867;
        od.mcaf[358] = 1502583380;
        od.mcaf[359] = -750109094;
        od.mcaf[360] = 244933855;
        od.mcaf[361] = -1133564393;
        od.mcaf[362] = -1038562675;
        od.mcaf[363] = -1340758421;
        od.mcaf[364] = -1041986073;
        od.mcaf[365] = 67270640;
        od.mcaf[366] = -1831777238;
        od.mcaf[367] = -1398411909;
        od.mcaf[368] = -671950832;
        od.mcaf[369] = 0x37333347;
        od.mcaf[370] = -709735337;
        od.mcaf[371] = -28483253;
        od.mcaf[372] = -894368136;
        od.mcaf[373] = 324285709;
        od.mcaf[374] = -567774172;
        od.mcaf[375] = -1981131667;
        od.mcaf[376] = 1092125319;
        od.mcaf[377] = -1890672081;
        od.mcaf[378] = -236479388;
        od.mcaf[379] = -2015785377;
        od.mcaf[380] = 1485507704;
        od.mcaf[381] = -1443713089;
        od.mcaf[382] = -169124905;
        od.mcaf[383] = -300472102;
        od.mcaf[384] = 1025142808;
        od.mcaf[385] = 1234678388;
        od.mcaf[386] = 1248842635;
        od.mcaf[387] = 258552148;
        od.mcaf[388] = 1468030334;
        od.mcaf[389] = 674593917;
        od.mcaf[390] = -185593688;
        od.mcaf[391] = -1984337583;
        od.mcaf[392] = 1618114682;
        od.mcaf[393] = 777817935;
        od.mcaf[394] = -1108428119;
        od.mcaf[395] = -1709153268;
        od.mcaf[396] = 2054873062;
        od.mcaf[397] = 1854120393;
        od.mcaf[398] = -1194682659;
        od.mcaf[399] = 29575995;
    }

    private static /* synthetic */ long mcaq(int n2) {
        return mcar[n2] ^ mcas[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void resetStepIndex() {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - od.mcag("mcim", mcaq(int ), (int)113));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1905011585: {
                    v1 = od.mcag("mcin", mcaq(int ), (int)114);
                    continue block30;
                }
                case -1611784695: {
                    v1 = od.mcag("mcio", mcaq(int ), (int)115);
                    continue block30;
                }
                case -714508833: {
                    break block30;
                }
            }
            break;
        }
        var3_1 = od.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcip", mcaq(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od.mcag("mciq", mcad(int ), (int)97)) break;
            v2 /* !! */  = (long)od.mcag("mcir", mcad(int ), (int)98);
        }
        var2_2 /* !! */  = od.b;
        v3 /* !! */  = od.va;
        if (true) ** GOTO lbl26
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - od.mcag("mcis", mcaq(int ), (int)117));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -714508833: {
                    break block32;
                }
                case -460797180: {
                    v4 = od.mcag("mcit", mcaq(int ), (int)118);
                    continue block32;
                }
                case -272921337: {
                    v4 = od.mcag("mciu", mcaq(int ), (int)119);
                    continue block32;
                }
            }
            break;
        }
        var1_3 = od.a;
        if (var3_1) {
            throw null;
lbl38:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl38
        v5 = od.mcag("mciv", mcad(int ), (int)99);
        v6 /* !! */  = od.va;
        if (true) ** GOTO lbl46
        block34: while (true) {
            v6 /* !! */  = (long)(v7 - od.mcag("mciw", mcaq(int ), (int)120));
lbl46:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -714508833: {
                    break block34;
                }
                case 228458222: {
                    v7 = od.mcag("mcix", mcaq(int ), (int)121);
                    continue block34;
                }
                case 1323909207: {
                    v7 = od.mcag("mciy", mcaq(int ), (int)122);
                    continue block34;
                }
            }
            break;
        }
        this.currentStepIndex = (int)v5;
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl38
                v8 = od.mcag("mciz", mcad(int ), (int)100);
                v9 /* !! */  = od.va;
                if (true) ** GOTO lbl66
                block35: while (true) {
                    v9 /* !! */  = (long)(v10 - od.mcag("mcja", mcaq(int ), (int)123));
lbl66:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -714508833: {
                            break block35;
                        }
                        case 103417419: {
                            v10 = od.mcag("mcjb", mcaq(int ), (int)124);
                            continue block35;
                        }
                        case 1008512138: {
                            v10 = od.mcag("mcjc", mcaq(int ), (int)125);
                            continue block35;
                        }
                    }
                    break;
                }
                this.currentTickStepIndex = (int)v8;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl79:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)od.mcag("mcjd", mcad(int ), (int)101);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl84:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od.mcag("mcje", mcad(int ), (int)102);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)od.mcag("mcjf", mcad(int ), (int)103);
                if (var3_1) {
                    throw null;
                }
            }
lbl92:
            // 5 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)od.mcag("mcjg", mcad(int ), (int)104);
                } while (!var3_1);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)od.mcag("mcjh", mcad(int ), (int)105);
                    if (!var3_1) ** GOTO lbl79
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)od.mcag("mcji", mcad(int ), (int)106);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)od.mcag("mcjj", mcad(int ), (int)107);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)od.mcag("mcjk", mcad(int ), (int)108);
        ** while (!var3_1)
lbl113:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getCurrentTickStepIndex() {
        boolean bl2;
        Object object = va;
        block8: while (true) {
            switch ((int)object) {
                case -1327523098: {
                    object = od.mcag("mcuo", mcaq(int ), (int)254) - od.mcag("mcun", mcaq(int ), (int)253);
                    continue block8;
                }
                case -714508833: {
                    break block8;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = va - od.mcag("mcup", mcaq(int ), (int)255)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == od.mcag("mcuq", mcad(int ), (int)270)) break;
            object2 = od.mcag("mcur", mcad(int ), (int)271);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = va - od.mcag("mcus", mcaq(int ), (int)256)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == od.mcag("mcut", mcad(int ), (int)272)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = od.mcag("mcuu", mcad(int ), (int)273);
        }
        if (bl2) return (int)od.mcag("mcuv", mcad(int ), (int)274);
        if (bl2) return (int)od.mcag("mcuv", mcad(int ), (int)274);
        Object object4 = va;
        block11: while (true) {
            switch ((int)object4) {
                case -714508833: {
                    return this.currentTickStepIndex;
                }
                case 895772185: {
                    object4 = od.mcag("mcux", mcaq(int ), (int)258) - od.mcag("mcuw", mcaq(int ), (int)257);
                    continue block11;
                }
            }
            break;
        }
        return this.currentTickStepIndex;
    }

    private static /* synthetic */ void mdix() {
        od.mcaf[0] = -1962703386;
        od.mcaf[1] = -713043265;
        od.mcaf[2] = -1954372529;
        od.mcaf[3] = 663334472;
        od.mcaf[4] = 1940728522;
        od.mcaf[5] = -341025766;
        od.mcaf[6] = -1743871889;
        od.mcaf[7] = 348729455;
        od.mcaf[8] = -967131962;
        od.mcaf[9] = -221259166;
        od.mcaf[10] = 718400759;
        od.mcaf[11] = 828034493;
        od.mcaf[12] = 537797294;
        od.mcaf[13] = 1317539632;
        od.mcaf[14] = -304553596;
        od.mcaf[15] = -1583740873;
        od.mcaf[16] = 1966692687;
        od.mcaf[17] = -1030174502;
        od.mcaf[18] = -208064907;
        od.mcaf[19] = 1110053998;
        od.mcaf[20] = 422994707;
        od.mcaf[21] = -250380621;
        od.mcaf[22] = -306497357;
        od.mcaf[23] = -2103045420;
        od.mcaf[24] = -1522059078;
        od.mcaf[25] = -1016754546;
        od.mcaf[26] = -222773074;
        od.mcaf[27] = 994254565;
        od.mcaf[28] = 689649899;
        od.mcaf[29] = 235000719;
        od.mcaf[30] = 1598910755;
        od.mcaf[31] = -1311380335;
        od.mcaf[32] = -1902269848;
        od.mcaf[33] = 1866241635;
        od.mcaf[34] = -1105478912;
        od.mcaf[35] = -449112628;
        od.mcaf[36] = -1581733937;
        od.mcaf[37] = 656499130;
        od.mcaf[38] = 1055400903;
        od.mcaf[39] = 341103050;
        od.mcaf[40] = 592877666;
        od.mcaf[41] = 375225379;
        od.mcaf[42] = -1503773274;
        od.mcaf[43] = -1132546978;
        od.mcaf[44] = 1353284895;
        od.mcaf[45] = 1918379614;
        od.mcaf[46] = 1980769676;
        od.mcaf[47] = -1896781196;
        od.mcaf[48] = -1899994886;
        od.mcaf[49] = -1602614609;
        od.mcaf[50] = -1282663855;
        od.mcaf[51] = -998903691;
        od.mcaf[52] = 1646988483;
        od.mcaf[53] = 1141854754;
        od.mcaf[54] = 1382949459;
        od.mcaf[55] = -551899447;
        od.mcaf[56] = -365453549;
        od.mcaf[57] = -1673620028;
        od.mcaf[58] = -1768127637;
        od.mcaf[59] = -625505636;
        od.mcaf[60] = 413977463;
        od.mcaf[61] = 547940996;
        od.mcaf[62] = 488696526;
        od.mcaf[63] = 1852104798;
        od.mcaf[64] = 234217911;
        od.mcaf[65] = 143522302;
        od.mcaf[66] = 45197004;
        od.mcaf[67] = 0x7C999C79;
        od.mcaf[68] = -1202353268;
        od.mcaf[69] = 1108675404;
        od.mcaf[70] = -1274752560;
        od.mcaf[71] = 69098132;
        od.mcaf[72] = -511510644;
        od.mcaf[73] = -1410652441;
        od.mcaf[74] = -112643069;
        od.mcaf[75] = 678153342;
        od.mcaf[76] = -834538453;
        od.mcaf[77] = -468363326;
        od.mcaf[78] = 128909101;
        od.mcaf[79] = -1886648182;
        od.mcaf[80] = -2018169382;
        od.mcaf[81] = 113637711;
        od.mcaf[82] = 1453458460;
        od.mcaf[83] = -400408826;
        od.mcaf[84] = 1197079658;
        od.mcaf[85] = 1469875465;
        od.mcaf[86] = -1640323608;
        od.mcaf[87] = -2099206790;
        od.mcaf[88] = 1593503979;
        od.mcaf[89] = 1260910957;
        od.mcaf[90] = -2048332539;
        od.mcaf[91] = 607102547;
        od.mcaf[92] = -1051056718;
        od.mcaf[93] = -700305185;
        od.mcaf[94] = -1388935621;
        od.mcaf[95] = 495023176;
        od.mcaf[96] = -745433075;
        od.mcaf[97] = 1414241722;
        od.mcaf[98] = 1503501537;
        od.mcaf[99] = -392694159;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addTickStep(int var1_1, oe var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcfr", mcaq(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mcfs", mcad(int ), (int)69)) break;
            v0 /* !! */  = (long)od.mcag("mcft", mcad(int ), (int)70);
        }
        var6_4 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl11
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mcfu", mcaq(int ), (int)69));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block6;
                }
                case 1131099890: {
                    v2 = od.mcag("mcfv", mcaq(int ), (int)70);
                    continue block6;
                }
                case 2061981669: {
                    v2 = od.mcag("mcfw", mcaq(int ), (int)71);
                    continue block6;
                }
            }
            break;
        }
        var5_5 = od.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcfx", mcaq(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == od.mcag("mcfy", mcad(int ), (int)71)) break;
            v3 /* !! */  = (long)od.mcag("mcfz", mcad(int ), (int)72);
        }
        var4_6 = od.a;
        if (var6_4) {
            throw null;
lbl29:
            // 1 sources

            return null;
        }
        ** while (var4_6 || var4_6)
lbl32:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcga", mcaq(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == od.mcag("mcgb", mcad(int ), (int)73)) break;
            v4 /* !! */  = (long)od.mcag("mcgc", mcad(int ), (int)74);
        }
        v5 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lambda$addTickStep$3(), ()Z)();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcgd", mcaq(int ), (int)74)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == od.mcag("mcge", mcad(int ), (int)75)) break;
            v6 /* !! */  = (long)od.mcag("mcgf", mcad(int ), (int)76);
        }
        return this.addTickStep(var1_1, var2_2, v5, var3_3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$addTickStep$2() {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(od.mcag("mdhd", mcaq(int ), (int)401) - od.mcag("mdhc", mcaq(int ), (int)400));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -714508833: {
                    break block21;
                }
                case 108282987: {
                    continue block21;
                }
            }
            break;
        }
        var2 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mdhe", mcaq(int ), (int)402));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block22;
                }
                case 491762864: {
                    v2 = od.mcag("mdhf", mcaq(int ), (int)403);
                    continue block22;
                }
                case 1887112833: {
                    v2 = od.mcag("mdhg", mcaq(int ), (int)404);
                    continue block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = od.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = od.va;
                if (true) ** GOTO lbl32
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - od.mcag("mdhh", mcaq(int ), (int)405));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1331841822: {
                            v4 = od.mcag("mdhi", mcaq(int ), (int)406);
                            continue block23;
                        }
                        case -1098547840: {
                            v4 = od.mcag("mdhj", mcaq(int ), (int)407);
                            continue block23;
                        }
                        case -714508833: {
                            break block23;
                        }
                        case 1070041765: {
                            v4 = od.mcag("mdhk", mcaq(int ), (int)408);
                            continue block23;
                        }
                    }
                    break;
                }
                var0_2 = od.a;
                if (var2) {
                    throw null;
                    return (boolean)od.mcag("mdhl", mcad(int ), (int)450);
                }
                if (var0_2 || var0_2) ** continue;
                return (boolean)od.mcag("mdhm", mcad(int ), (int)451);
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)od.mcag("mdhn", mcad(int ), (int)452);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)od.mcag("mdho", mcad(int ), (int)453);
                    if (!var2) break block9;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)od.mcag("mdhp", mcad(int ), (int)454);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)od.mcag("mdhq", mcad(int ), (int)455);
        ** while (!var2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addTickStep(int var1_1, oe var2_2, BooleanSupplier var3_3, int var4_4) {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block49: while (true) {
            v0 /* !! */  = (long)(v1 - od.mcag("mcgk", mcaq(int ), (int)75));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1907827519: {
                    v1 = od.mcag("mcgl", mcaq(int ), (int)76);
                    continue block49;
                }
                case -714508833: {
                    break block49;
                }
                case 270831353: {
                    v1 = od.mcag("mcgm", mcaq(int ), (int)77);
                    continue block49;
                }
            }
            break;
        }
        var7_5 = od.c;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl19
        block50: while (true) {
            v2 /* !! */  = (long)(od.mcag("mcgo", mcaq(int ), (int)79) - od.mcag("mcgn", mcaq(int ), (int)78));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -714508833: {
                    break block50;
                }
                case 1997120498: {
                    continue block50;
                }
            }
            break;
        }
        var6_6 /* !! */  = od.b;
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = od.va;
                if (true) ** GOTO lbl32
                block51: while (true) {
                    v3 /* !! */  = (long)(od.mcag("mcgq", mcaq(int ), (int)81) - od.mcag("mcgp", mcaq(int ), (int)80));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -714508833: {
                            break block51;
                        }
                        case -300611098: {
                            continue block51;
                        }
                    }
                    break;
                }
                var5_7 = od.a;
                if (var7_5) {
                    throw null;
lbl40:
                    // 3 sources

                    return null;
                }
                if (var5_7 || var5_7) ** GOTO lbl40
                v4 /* !! */  = od.va;
                if (true) ** GOTO lbl47
                block53: while (true) {
                    v4 /* !! */  = (long)(v5 - od.mcag("mcgr", mcaq(int ), (int)82));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -885926060: {
                            v5 = od.mcag("mcgs", mcaq(int ), (int)83);
                            continue block53;
                        }
                        case -714508833: {
                            break block53;
                        }
                        case -540480051: {
                            v5 = od.mcag("mcgt", mcaq(int ), (int)84);
                            continue block53;
                        }
                    }
                    break;
                }
                v6 /* !! */  = od.va;
                if (true) ** GOTO lbl60
                block54: while (true) {
                    v6 /* !! */  = (long)(od.mcag("mcgv", mcaq(int ), (int)86) - od.mcag("mcgu", mcaq(int ), (int)85));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -714508833: {
                            break block54;
                        }
                        case -201223449: {
                            continue block54;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcgw", mcaq(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == od.mcag("mcgx", mcad(int ), (int)81)) break;
                    v7 /* !! */  = (long)od.mcag("mcgy", mcad(int ), (int)82);
                }
                v8 = new od$ScriptTickStep(var1_1, var2_2, var3_3, var4_4);
                v9 /* !! */  = od.va;
                if (true) ** GOTO lbl75
                block56: while (true) {
                    v9 /* !! */  = (long)(v10 - od.mcag("mcgz", mcaq(int ), (int)88));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -714508833: {
                            break block56;
                        }
                        case -257616812: {
                            v10 = od.mcag("mcha", mcaq(int ), (int)89);
                            continue block56;
                        }
                        case 39147909: {
                            v10 = od.mcag("mchb", mcaq(int ), (int)90);
                            continue block56;
                        }
                    }
                    break;
                }
                this.scriptTickSteps.add(v8);
                if (var5_7 || var5_7) ** GOTO lbl40
                v11 /* !! */  = od.va;
                if (true) ** GOTO lbl91
                block57: while (true) {
                    v11 /* !! */  = (long)(v12 - od.mcag("mchc", mcaq(int ), (int)91));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1971051180: {
                            v12 = od.mcag("mchd", mcaq(int ), (int)92);
                            continue block57;
                        }
                        case -714508833: {
                            break block57;
                        }
                        case 427299454: {
                            v12 = od.mcag("mche", mcaq(int ), (int)93);
                            continue block57;
                        }
                        case 1418440823: {
                            v12 = od.mcag("mchf", mcaq(int ), (int)94);
                            continue block57;
                        }
                    }
                    break;
                }
                v13 /* !! */  = od.va;
                if (true) ** GOTO lbl107
                block58: while (true) {
                    v13 /* !! */  = (long)(v14 - od.mcag("mchg", mcaq(int ), (int)95));
lbl107:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -714508833: {
                            break block58;
                        }
                        case 157787967: {
                            v14 = od.mcag("mchh", mcaq(int ), (int)96);
                            continue block58;
                        }
                        case 1668563174: {
                            v14 = od.mcag("mchi", mcaq(int ), (int)97);
                            continue block58;
                        }
                        case 1863496791: {
                            v14 = od.mcag("mchj", mcaq(int ), (int)98);
                            continue block58;
                        }
                    }
                    break;
                }
                Collections.sort(this.scriptTickSteps);
                if (var5_7 || var5_7) ** continue;
                return this;
            }
            case 0: {
                var6_6 /* !! */  = (int)od.mcag("mchk", mcad(int ), (int)83);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl127:
            // 4 sources

            case 1: {
                var6_6 /* !! */  = (int)od.mcag("mchl", mcad(int ), (int)84);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 2: {
                var6_6 /* !! */  = (int)od.mcag("mchm", mcad(int ), (int)85);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl137:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)od.mcag("mchn", mcad(int ), (int)86);
                    if (!var7_5) ** GOTO lbl127
                    throw null;
                }
            }
lbl142:
            // 2 sources

            case 4: {
                var6_6 /* !! */  = (int)od.mcag("mcho", mcad(int ), (int)87);
                if (!var7_5) ** GOTO lbl127
                throw null;
            }
lbl146:
            // 2 sources

            case 5: {
                var6_6 /* !! */  = (int)od.mcag("mchp", mcad(int ), (int)88);
                if (!var7_5) ** GOTO lbl137
                throw null;
            }
            case 6: {
                var6_6 /* !! */  = (int)od.mcag("mchq", mcad(int ), (int)89);
                if (!var7_5) ** GOTO lbl127
                throw null;
            }
            case 7: 
        }
        var6_6 /* !! */  = (int)od.mcag("mchr", mcad(int ), (int)90);
        ** while (!var7_5)
lbl157:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setInterrupt(boolean var1_1) {
        v0 /* !! */  = od.va;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - od.mcag("mcxr", mcaq(int ), (int)289));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2078369539: {
                    v1 = od.mcag("mcxs", mcaq(int ), (int)290);
                    continue block23;
                }
                case -1211273725: {
                    v1 = od.mcag("mcxt", mcaq(int ), (int)291);
                    continue block23;
                }
                case -714508833: {
                    break block23;
                }
                case 63603266: {
                    v1 = od.mcag("mcxu", mcaq(int ), (int)292);
                    continue block23;
                }
            }
            break;
        }
        var4_2 = od.c;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - od.mcag("mcxv", mcaq(int ), (int)293));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1294552369: {
                    v3 = od.mcag("mcxw", mcaq(int ), (int)294);
                    continue block24;
                }
                case -1248472361: {
                    v3 = od.mcag("mcxx", mcaq(int ), (int)295);
                    continue block24;
                }
                case -714508833: {
                    break block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = od.b;
        v4 /* !! */  = od.va;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - od.mcag("mcxy", mcaq(int ), (int)296));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -714508833: {
                    break block25;
                }
                case 259780987: {
                    v5 = od.mcag("mcxz", mcaq(int ), (int)297);
                    continue block25;
                }
                case 1918083437: {
                    v5 = od.mcag("mcya", mcaq(int ), (int)298);
                    continue block25;
                }
            }
            break;
        }
        var2_4 = od.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl51:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl51
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcyb", mcaq(int ), (int)299)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == od.mcag("mcyc", mcad(int ), (int)316)) break;
                    v6 /* !! */  = (long)od.mcag("mcyd", mcad(int ), (int)317);
                }
                this.interrupt = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl63:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)od.mcag("mcye", mcad(int ), (int)318);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)od.mcag("mcyf", mcad(int ), (int)319);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)od.mcag("mcyg", mcad(int ), (int)320);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)od.mcag("mcyh", mcad(int ), (int)321);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)od.mcag("mcyi", mcad(int ), (int)322);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addStep(int var1_1, oe var2_2, BooleanSupplier var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcbq", mcaq(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od.mcag("mcbr", mcad(int ), (int)16)) break;
            v0 /* !! */  = (long)od.mcag("mcbs", mcad(int ), (int)17);
        }
        var6_4 = od.c;
        v1 /* !! */  = od.va;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - od.mcag("mcbt", mcaq(int ), (int)17));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block11;
                }
                case 416711105: {
                    v2 = od.mcag("mcbu", mcaq(int ), (int)18);
                    continue block11;
                }
                case 889292538: {
                    v2 = od.mcag("mcbv", mcaq(int ), (int)19);
                    continue block11;
                }
            }
            break;
        }
        var5_5 = od.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcbw", mcaq(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == od.mcag("mcbx", mcad(int ), (int)18)) break;
            v3 /* !! */  = (long)od.mcag("mcby", mcad(int ), (int)19);
        }
        var4_6 = od.a;
        if (var6_4) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var4_6 || var4_6)
lbl34:
        // 1 sources

        v4 = od.mcag("mcbz", mcad(int ), (int)20);
        v5 /* !! */  = od.va;
        if (true) ** GOTO lbl39
        block14: while (true) {
            v5 /* !! */  = (long)(v6 - od.mcag("mcca", mcaq(int ), (int)21));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -714508833: {
                    break block14;
                }
                case -251650799: {
                    v6 = od.mcag("mccb", mcaq(int ), (int)22);
                    continue block14;
                }
                case 286512745: {
                    v6 = od.mcag("mccc", mcaq(int ), (int)23);
                    continue block14;
                }
            }
            break;
        }
        return this.addStep(var1_1, var2_2, var3_3, (int)v4);
    }

    private static /* synthetic */ void mdiu() {
        od.mcae[200] = 817711345;
        od.mcae[201] = -590423632;
        od.mcae[202] = -96621471;
        od.mcae[203] = -1531650124;
        od.mcae[204] = -1343114132;
        od.mcae[205] = 1952283093;
        od.mcae[206] = -355585678;
        od.mcae[207] = -1832629760;
        od.mcae[208] = -722803370;
        od.mcae[209] = 381586941;
        od.mcae[210] = -4591227;
        od.mcae[211] = -1213730727;
        od.mcae[212] = -803363183;
        od.mcae[213] = 412932318;
        od.mcae[214] = -920268151;
        od.mcae[215] = 1270519289;
        od.mcae[216] = -1984784395;
        od.mcae[217] = -554476332;
        od.mcae[218] = 929924103;
        od.mcae[219] = -733081847;
        od.mcae[220] = -248046577;
        od.mcae[221] = -65562515;
        od.mcae[222] = 2100548570;
        od.mcae[223] = -82203056;
        od.mcae[224] = 848708292;
        od.mcae[225] = 996886956;
        od.mcae[226] = -1248729825;
        od.mcae[227] = -272472117;
        od.mcae[228] = 1497862346;
        od.mcae[229] = 1581967699;
        od.mcae[230] = 1833684981;
        od.mcae[231] = -1485936182;
        od.mcae[232] = -1094159457;
        od.mcae[233] = 899551444;
        od.mcae[234] = -883585163;
        od.mcae[235] = -355054497;
        od.mcae[236] = -277228101;
        od.mcae[237] = -340125563;
        od.mcae[238] = -1926042987;
        od.mcae[239] = -1473903525;
        od.mcae[240] = -1792212602;
        od.mcae[241] = 1785622310;
        od.mcae[242] = 828252622;
        od.mcae[243] = -1976370831;
        od.mcae[244] = -1911954221;
        od.mcae[245] = -898646376;
        od.mcae[246] = 495706488;
        od.mcae[247] = 922491484;
        od.mcae[248] = 1906314655;
        od.mcae[249] = 353617575;
        od.mcae[250] = -56563306;
        od.mcae[251] = 2002988728;
        od.mcae[252] = 2070872139;
        od.mcae[253] = 1912000947;
        od.mcae[254] = 1130239643;
        od.mcae[255] = -88077538;
        od.mcae[256] = 681520982;
        od.mcae[257] = 1462839337;
        od.mcae[258] = 450914830;
        od.mcae[259] = 1644217414;
        od.mcae[260] = 986648760;
        od.mcae[261] = 485329783;
        od.mcae[262] = 666418288;
        od.mcae[263] = -288928077;
        od.mcae[264] = 2063899133;
        od.mcae[265] = 205345620;
        od.mcae[266] = 1877720142;
        od.mcae[267] = -1773633942;
        od.mcae[268] = 1313511514;
        od.mcae[269] = -845222052;
        od.mcae[270] = -1062015542;
        od.mcae[271] = 1140579875;
        od.mcae[272] = 449584776;
        od.mcae[273] = -268806557;
        od.mcae[274] = -1213065685;
        od.mcae[275] = 1846865015;
        od.mcae[276] = -1665375109;
        od.mcae[277] = -37372921;
        od.mcae[278] = 752789554;
        od.mcae[279] = 1053303924;
        od.mcae[280] = 200481622;
        od.mcae[281] = -374107457;
        od.mcae[282] = -362098510;
        od.mcae[283] = -232230658;
        od.mcae[284] = 1639578050;
        od.mcae[285] = -568260556;
        od.mcae[286] = -945295672;
        od.mcae[287] = 652310144;
        od.mcae[288] = -441175763;
        od.mcae[289] = 490800916;
        od.mcae[290] = 1455518932;
        od.mcae[291] = -1153195911;
        od.mcae[292] = -1219458950;
        od.mcae[293] = -229543430;
        od.mcae[294] = -610680046;
        od.mcae[295] = 415865259;
        od.mcae[296] = 1701974669;
        od.mcae[297] = -2104858203;
        od.mcae[298] = -1363411232;
        od.mcae[299] = -497297845;
    }

    private static /* synthetic */ void mdjd() {
        od.mcar[100] = 5185880020571941865L;
        od.mcar[101] = 7081088975627720140L;
        od.mcar[102] = -4013790718097782021L;
        od.mcar[103] = 4276150724414330457L;
        od.mcar[104] = 2787411949411388677L;
        od.mcar[105] = 1066231714141913741L;
        od.mcar[106] = -2477175441052777954L;
        od.mcar[107] = 3341886797122666814L;
        od.mcar[108] = -4062770205287444598L;
        od.mcar[109] = 7367066894894690629L;
        od.mcar[110] = 5543821316502116379L;
        od.mcar[111] = -5351917863167159571L;
        od.mcar[112] = 4278882638971965362L;
        od.mcar[113] = -2766073908439326551L;
        od.mcar[114] = -6590712916978824320L;
        od.mcar[115] = -5817174644425873676L;
        od.mcar[116] = -5026134895823216064L;
        od.mcar[117] = 2485444510319073896L;
        od.mcar[118] = 7319922937816570471L;
        od.mcar[119] = 3083017276018666550L;
        od.mcar[120] = -6420619582427850229L;
        od.mcar[121] = -8213402908649579163L;
        od.mcar[122] = 466357394148781736L;
        od.mcar[123] = 8660228453898266019L;
        od.mcar[124] = 5221749164596272486L;
        od.mcar[125] = 5546764141473276311L;
        od.mcar[126] = 9152678470344752256L;
        od.mcar[127] = 264176996470288767L;
        od.mcar[128] = -8704499066946431516L;
        od.mcar[129] = 9094420479152032568L;
        od.mcar[130] = -7152818708411011044L;
        od.mcar[131] = 8915669057364441391L;
        od.mcar[132] = -1621403993734286616L;
        od.mcar[133] = -2350338076042900392L;
        od.mcar[134] = 2386337664185246209L;
        od.mcar[135] = 525262729925081826L;
        od.mcar[136] = 3833898619180524536L;
        od.mcar[137] = -5704489208452554466L;
        od.mcar[138] = 2726081514881213398L;
        od.mcar[139] = -5211846326570806009L;
        od.mcar[140] = -348422145131130310L;
        od.mcar[141] = -268766214104367224L;
        od.mcar[142] = 5782650744010742509L;
        od.mcar[143] = -1037766034393671140L;
        od.mcar[144] = 6795975887842095963L;
        od.mcar[145] = 1826817124603180118L;
        od.mcar[146] = 7689974874791539875L;
        od.mcar[147] = 4964614951876315894L;
        od.mcar[148] = -7340933191048213629L;
        od.mcar[149] = 8108986004276501701L;
        od.mcar[150] = 5099464099223773030L;
        od.mcar[151] = 8837772482681439505L;
        od.mcar[152] = 5121089581268428474L;
        od.mcar[153] = -583935655719888240L;
        od.mcar[154] = 445909016323728736L;
        od.mcar[155] = 676573933781675536L;
        od.mcar[156] = 7809677172671909751L;
        od.mcar[157] = -5219299697885957894L;
        od.mcar[158] = 4924450270141767380L;
        od.mcar[159] = 6261648742124493704L;
        od.mcar[160] = -2560307309043258234L;
        od.mcar[161] = -717219292212931639L;
        od.mcar[162] = -2630652538188470081L;
        od.mcar[163] = 2301561542512256026L;
        od.mcar[164] = -4935843649911660672L;
        od.mcar[165] = -8050702367029492724L;
        od.mcar[166] = 6569084213762902185L;
        od.mcar[167] = 6233901557775075659L;
        od.mcar[168] = -2785874038243627786L;
        od.mcar[169] = -6064814244328954183L;
        od.mcar[170] = 6689020235805516420L;
        od.mcar[171] = -1257730860538763518L;
        od.mcar[172] = -666400290349879018L;
        od.mcar[173] = -7655873576215989410L;
        od.mcar[174] = -7426890417249760107L;
        od.mcar[175] = 5586449468626035235L;
        od.mcar[176] = -5579063445579590302L;
        od.mcar[177] = -5335750287857276387L;
        od.mcar[178] = 1605658665293151565L;
        od.mcar[179] = 2293835132943548386L;
        od.mcar[180] = 8524450047973413107L;
        od.mcar[181] = -281807215247989585L;
        od.mcar[182] = 6774452001619500746L;
        od.mcar[183] = 727303705018760043L;
        od.mcar[184] = 335456824114409947L;
        od.mcar[185] = -1021928013638335533L;
        od.mcar[186] = -5524572649678291987L;
        od.mcar[187] = 5244507751974974594L;
        od.mcar[188] = -809642969647288191L;
        od.mcar[189] = -7774345483429513926L;
        od.mcar[190] = -3268362260081587515L;
        od.mcar[191] = 3957551507545756942L;
        od.mcar[192] = -780847877197467746L;
        od.mcar[193] = -2614817838153297778L;
        od.mcar[194] = -8084564676145464558L;
        od.mcar[195] = 6536494915834297885L;
        od.mcar[196] = 3501988976209370743L;
        od.mcar[197] = -5376847771138928154L;
        od.mcar[198] = 8337562633716752539L;
        od.mcar[199] = 1039461068971301504L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$addTickStep$3() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mdgo", mcaq(int ), (int)394)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mdgp", mcad(int ), (int)442)) break;
            v0 /* !! */  = (long)od.mcag("mdgq", mcad(int ), (int)443);
        }
        var2 = od.c;
        v1 /* !! */  = od.va;
        block16: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -714508833: {
                    break block16;
                }
                case 247047607: {
                    v1 /* !! */  = (long)(od.mcag("mdgs", mcaq(int ), (int)396) - od.mcag("mdgr", mcaq(int ), (int)395));
                    continue block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = od.b;
        v2 /* !! */  = od.va;
        if (true) ** GOTO lbl20
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - od.mcag("mdgt", mcaq(int ), (int)397));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -714508833: {
                    break block17;
                }
                case 595409963: {
                    v3 = od.mcag("mdgu", mcaq(int ), (int)398);
                    continue block17;
                }
                case 850148372: {
                    v3 = od.mcag("mdgv", mcaq(int ), (int)399);
                    continue block17;
                }
            }
            break;
        }
        var0_2 = od.a;
        if (var2) {
            throw null;
        }
        if (var0_2) ** GOTO lbl39
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var0_2) ** GOTO lbl40
lbl39:
                    // 2 sources

                    return (boolean)od.mcag("mdgw", mcad(int ), (int)444);
lbl40:
                    // 1 sources

                    return (boolean)od.mcag("mdgx", mcad(int ), (int)445);
                }
                case 2: {
                    do {
                        var1_1 /* !! */  = (int)od.mcag("mdha", mcad(int ), (int)448);
                    } while (!var2);
                    throw null;
                }
                case 3: {
                    var1_1 /* !! */  = (int)od.mcag("mdhb", mcad(int ), (int)449);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)od.mcag("mdgy", mcad(int ), (int)446);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl59
            break;
        }
        do {
            if (true) ** continue;
lbl59:
            // 2 sources

            var1_1 /* !! */  = (int)od.mcag("mdgz", mcad(int ), (int)447);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addTickStep(int var1_1, oe var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mceg", mcaq(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od.mcag("mceh", mcad(int ), (int)49)) break;
            v0 /* !! */  = (long)od.mcag("mcei", mcad(int ), (int)50);
        }
        var5_3 = od.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcej", mcaq(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == od.mcag("mcek", mcad(int ), (int)51)) break;
            v1 /* !! */  = (long)od.mcag("mcel", mcad(int ), (int)52);
        }
        var4_4 /* !! */  = od.b;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = od.va;
                if (true) ** GOTO lbl20
                block19: while (true) {
                    v2 /* !! */  = (long)(v3 - od.mcag("mcem", mcaq(int ), (int)53));
lbl20:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2118866010: {
                            v3 = od.mcag("mcen", mcaq(int ), (int)54);
                            continue block19;
                        }
                        case -714508833: {
                            break block19;
                        }
                        case -14422818: {
                            v3 = od.mcag("mceo", mcaq(int ), (int)55);
                            continue block19;
                        }
                    }
                    break;
                }
                var3_5 = od.a;
                if (var5_3) {
                    throw null;
                    return null;
                }
                if (var3_5 || var3_5) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcep", mcaq(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == od.mcag("mceq", mcad(int ), (int)53)) break;
                    v4 /* !! */  = (long)od.mcag("mcer", mcad(int ), (int)54);
                }
                v5 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lambda$addTickStep$2(), ()Z)();
                v6 = od.mcag("mces", mcad(int ), (int)55);
                v7 /* !! */  = od.va;
                if (true) ** GOTO lbl46
                block22: while (true) {
                    v7 /* !! */  = (long)(v8 - od.mcag("mcet", mcaq(int ), (int)57));
lbl46:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -877875467: {
                            v8 = od.mcag("mceu", mcaq(int ), (int)58);
                            continue block22;
                        }
                        case -714508833: {
                            break block22;
                        }
                        case -287475890: {
                            v8 = od.mcag("mcev", mcaq(int ), (int)59);
                            continue block22;
                        }
                        case 85569454: {
                            v8 = od.mcag("mcew", mcaq(int ), (int)60);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.addTickStep(var1_1, var2_2, v5, (int)v6);
            }
            case 0: {
                do {
                    var4_4 /* !! */  = (int)od.mcag("mcex", mcad(int ), (int)56);
                } while (!var5_3);
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)od.mcag("mcey", mcad(int ), (int)57);
                if (var5_3) {
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)od.mcag("mcez", mcad(int ), (int)58);
                if (!var5_3) break;
                throw null;
            }
            case 3: 
        }
        do {
            var4_4 /* !! */  = (int)od.mcag("mcfa", mcad(int ), (int)59);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ void mdjj() {
        od.mcas[200] = 6376615778208664303L;
        od.mcas[201] = -842771075800909258L;
        od.mcas[202] = 3698785441777699509L;
        od.mcas[203] = 2709314451760430290L;
        od.mcas[204] = 231348283332293903L;
        od.mcas[205] = -6918564454347193515L;
        od.mcas[206] = -1201639478458443878L;
        od.mcas[207] = 3633361355993894736L;
        od.mcas[208] = -1852439451205907580L;
        od.mcas[209] = -25747327680980789L;
        od.mcas[210] = -211219923720684468L;
        od.mcas[211] = 6936875390053688419L;
        od.mcas[212] = -6842579283883145511L;
        od.mcas[213] = 4138735780025859708L;
        od.mcas[214] = -2466256160200566187L;
        od.mcas[215] = -8062471296351953332L;
        od.mcas[216] = -80717077158440519L;
        od.mcas[217] = -7979449295778677996L;
        od.mcas[218] = -4975864362964920316L;
        od.mcas[219] = -1459284119522881888L;
        od.mcas[220] = -3882806776457569663L;
        od.mcas[221] = -5967912813213296437L;
        od.mcas[222] = -1356564983623642507L;
        od.mcas[223] = -2041965049354459445L;
        od.mcas[224] = -328349235083741910L;
        od.mcas[225] = -2591150985256190556L;
        od.mcas[226] = 8263721762631572063L;
        od.mcas[227] = -5132170131808979575L;
        od.mcas[228] = 4968854245283718506L;
        od.mcas[229] = -540376300542903409L;
        od.mcas[230] = 7251450213992613326L;
        od.mcas[231] = -3602319211364140602L;
        od.mcas[232] = 4808523894015770086L;
        od.mcas[233] = -5269854143030176518L;
        od.mcas[234] = -4967795498671467111L;
        od.mcas[235] = -3197259929179534495L;
        od.mcas[236] = -6449450738193403135L;
        od.mcas[237] = 4274101226538113077L;
        od.mcas[238] = 5002395437454499393L;
        od.mcas[239] = -6903398915207957454L;
        od.mcas[240] = -3602801638812669182L;
        od.mcas[241] = -3081141957122611551L;
        od.mcas[242] = -7233889174707652949L;
        od.mcas[243] = 1018436406476442656L;
        od.mcas[244] = 8008471715518107343L;
        od.mcas[245] = -9056226677821116613L;
        od.mcas[246] = 272124772099702562L;
        od.mcas[247] = 8654844996233962047L;
        od.mcas[248] = -5061296288531734162L;
        od.mcas[249] = -7276390820215685974L;
        od.mcas[250] = -520794399602453664L;
        od.mcas[251] = -5017681717789278201L;
        od.mcas[252] = 9064931990857577066L;
        od.mcas[253] = -7563041751810318589L;
        od.mcas[254] = 7064526317538228311L;
        od.mcas[255] = -925641682103516820L;
        od.mcas[256] = -7643505358765816572L;
        od.mcas[257] = -7870280925725690490L;
        od.mcas[258] = -8498461492693842270L;
        od.mcas[259] = -1531851986045275691L;
        od.mcas[260] = 1263885268566511142L;
        od.mcas[261] = -8707855141625612474L;
        od.mcas[262] = 4184434349407542652L;
        od.mcas[263] = -3026421115096049784L;
        od.mcas[264] = -1072571251224677938L;
        od.mcas[265] = 6832733625314340636L;
        od.mcas[266] = 324209190851540324L;
        od.mcas[267] = 5290019961196808795L;
        od.mcas[268] = 974585653627568820L;
        od.mcas[269] = -565426783241252151L;
        od.mcas[270] = 1719321551710834593L;
        od.mcas[271] = -2060948313393779388L;
        od.mcas[272] = -4197107820031763327L;
        od.mcas[273] = -1151621603438210706L;
        od.mcas[274] = -5888403150659083637L;
        od.mcas[275] = -8102993277098814650L;
        od.mcas[276] = 8889788307193985880L;
        od.mcas[277] = -854881418161357126L;
        od.mcas[278] = -567639479654182668L;
        od.mcas[279] = -7526920737838266770L;
        od.mcas[280] = -2021308246850358765L;
        od.mcas[281] = 4821044248535268343L;
        od.mcas[282] = 1004261957721161338L;
        od.mcas[283] = -3926632919405808492L;
        od.mcas[284] = -3660402024217497048L;
        od.mcas[285] = -2346372321289179713L;
        od.mcas[286] = 2514475202411350098L;
        od.mcas[287] = -972504352654347249L;
        od.mcas[288] = 3387303255234267457L;
        od.mcas[289] = -2877224723988598819L;
        od.mcas[290] = 4040695459681546629L;
        od.mcas[291] = 6561397169050704062L;
        od.mcas[292] = -2435183435623207839L;
        od.mcas[293] = 7708378294893786721L;
        od.mcas[294] = -1065093204831853871L;
        od.mcas[295] = -1660685859304865909L;
        od.mcas[296] = 3580834905832581869L;
        od.mcas[297] = -6693711169328007298L;
        od.mcas[298] = 2511735444472345470L;
        od.mcas[299] = 7213832522533645999L;
    }

    private static /* synthetic */ void mdjh() {
        od.mcas[0] = 6750800507725619303L;
        od.mcas[1] = 8641143323360128147L;
        od.mcas[2] = -8451676175231910231L;
        od.mcas[3] = 7933364943833731271L;
        od.mcas[4] = -4267110017826122760L;
        od.mcas[5] = -4117583979545316460L;
        od.mcas[6] = 4978101727907651769L;
        od.mcas[7] = -8671492462174233143L;
        od.mcas[8] = -5201822525563787366L;
        od.mcas[9] = 2560875788828194364L;
        od.mcas[10] = 8550151198278854023L;
        od.mcas[11] = -8963759839936776759L;
        od.mcas[12] = -7441505075120550065L;
        od.mcas[13] = 334277490435557808L;
        od.mcas[14] = -4192704437371629396L;
        od.mcas[15] = -2126673559185512852L;
        od.mcas[16] = -8010488044260509545L;
        od.mcas[17] = 6577658919955950799L;
        od.mcas[18] = -3845202111109846429L;
        od.mcas[19] = 8052340897318951301L;
        od.mcas[20] = -6609507298822484898L;
        od.mcas[21] = 809381579335931929L;
        od.mcas[22] = -6005824007183486577L;
        od.mcas[23] = -688574456278353091L;
        od.mcas[24] = -8910098961567279734L;
        od.mcas[25] = 2103053160661331312L;
        od.mcas[26] = 315381281875766226L;
        od.mcas[27] = 3854790517143991557L;
        od.mcas[28] = 8670369444248417495L;
        od.mcas[29] = -7144843207814038633L;
        od.mcas[30] = -5470257438709555647L;
        od.mcas[31] = -2043754524001974661L;
        od.mcas[32] = 8407613118428652640L;
        od.mcas[33] = 8388180023004590749L;
        od.mcas[34] = -3912073898091064600L;
        od.mcas[35] = -1477402339798365626L;
        od.mcas[36] = -7951396537609998456L;
        od.mcas[37] = 9215421661303175347L;
        od.mcas[38] = -2807042347881977166L;
        od.mcas[39] = 7912036235969508472L;
        od.mcas[40] = 8593839148080983519L;
        od.mcas[41] = -986289219332282722L;
        od.mcas[42] = -9212741112714710514L;
        od.mcas[43] = -6491666436565194706L;
        od.mcas[44] = 3688898742040704797L;
        od.mcas[45] = 1713599914501643639L;
        od.mcas[46] = -6220579166599734840L;
        od.mcas[47] = -678197027360852840L;
        od.mcas[48] = 2759074189292578881L;
        od.mcas[49] = 5710993856791697975L;
        od.mcas[50] = 4939837416451892650L;
        od.mcas[51] = 7556250749435144900L;
        od.mcas[52] = 2201474218931404164L;
        od.mcas[53] = -1201298319831066431L;
        od.mcas[54] = -7748100469345045900L;
        od.mcas[55] = -5147637903827269678L;
        od.mcas[56] = 1162416415537140821L;
        od.mcas[57] = -7302583876965363552L;
        od.mcas[58] = -6960768093480476492L;
        od.mcas[59] = -2224688317268308815L;
        od.mcas[60] = -6108789222950632440L;
        od.mcas[61] = 8458431228596770319L;
        od.mcas[62] = 8804624535321702342L;
        od.mcas[63] = 973704761207814538L;
        od.mcas[64] = -1806363030377037077L;
        od.mcas[65] = 6420298215652085279L;
        od.mcas[66] = 126448100144033262L;
        od.mcas[67] = -8998223519635323744L;
        od.mcas[68] = 6791692532254379098L;
        od.mcas[69] = -4134455007861014698L;
        od.mcas[70] = -1865803943177779625L;
        od.mcas[71] = -3777709835720286723L;
        od.mcas[72] = -2109040394523055487L;
        od.mcas[73] = -8748202839838418105L;
        od.mcas[74] = 5137090305296763042L;
        od.mcas[75] = -6697894107750094840L;
        od.mcas[76] = 3237132533076854901L;
        od.mcas[77] = -2011940966911728896L;
        od.mcas[78] = -1511169468865217097L;
        od.mcas[79] = 4026445232845889260L;
        od.mcas[80] = -8176170326503865680L;
        od.mcas[81] = 4651301230071059545L;
        od.mcas[82] = -3390772051390317297L;
        od.mcas[83] = -807832848775379351L;
        od.mcas[84] = -6525668821880534877L;
        od.mcas[85] = -5095497994745713161L;
        od.mcas[86] = -5980029924167823074L;
        od.mcas[87] = -1945103332288679169L;
        od.mcas[88] = 2290637498721818685L;
        od.mcas[89] = 277935600514735971L;
        od.mcas[90] = 461209985301626131L;
        od.mcas[91] = -5980732619044151444L;
        od.mcas[92] = 3971856466429090223L;
        od.mcas[93] = -6346594302469582302L;
        od.mcas[94] = 7875424962011175277L;
        od.mcas[95] = -6547733657065483800L;
        od.mcas[96] = 7231897880505137017L;
        od.mcas[97] = -6253659729493578527L;
        od.mcas[98] = -7859342289458216520L;
        od.mcas[99] = -2801658684661393969L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public pr getTime() {
        boolean bl2;
        Object object = va;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - od.mcag("mcsa", mcaq(int ), (int)227);
            }
            switch ((int)object) {
                case -1913540768: {
                    callSite = od.mcag("mcsb", mcaq(int ), (int)228);
                    continue block10;
                }
                case -714508833: {
                    break block10;
                }
                case 884638928: {
                    callSite = od.mcag("mcsc", mcaq(int ), (int)229);
                    continue block10;
                }
                case 1933711174: {
                    callSite = od.mcag("mcsd", mcaq(int ), (int)230);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = va;
        block11: while (true) {
            switch ((int)object2) {
                case -714508833: {
                    break block11;
                }
                case 1841169694: {
                    object2 = od.mcag("mcsf", mcaq(int ), (int)232) - od.mcag("mcse", mcaq(int ), (int)231);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = va - od.mcag("mcsg", mcaq(int ), (int)233)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == od.mcag("mcsh", mcad(int ), (int)231)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = od.mcag("mcsi", mcad(int ), (int)232);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = va - od.mcag("mcsj", mcaq(int ), (int)234)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == od.mcag("mcsk", mcad(int ), (int)233)) {
                return this.time;
            }
            object4 = od.mcag("mcsl", mcad(int ), (int)234);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$update$5(od$ScriptTickStep var1_1) {
        block121: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = od.va - od.mcag("mcyj", mcaq(int ), (int)300)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == od.mcag("mcyk", mcad(int ), (int)323)) break;
                v0 /* !! */  = (long)od.mcag("mcyl", mcad(int ), (int)324);
            }
            var5_2 = od.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = od.va - od.mcag("mcym", mcaq(int ), (int)301)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == od.mcag("mcyn", mcad(int ), (int)325)) break;
                v1 /* !! */  = (long)od.mcag("mcyo", mcad(int ), (int)326);
            }
            var4_3 /* !! */  = od.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = od.va - od.mcag("mcyp", mcaq(int ), (int)302)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == od.mcag("mcyq", mcad(int ), (int)327)) break;
                v2 /* !! */  = (long)od.mcag("mcyr", mcad(int ), (int)328);
            }
            var3_4 = od.a;
            if (var5_2) {
                throw null;
lbl21:
                // 15 sources

                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = od.va - od.mcag("mcys", mcaq(int ), (int)303)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == od.mcag("mcyt", mcad(int ), (int)329)) break;
                v3 /* !! */  = (long)od.mcag("mcyu", mcad(int ), (int)330);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_4 = od.va - od.mcag("mcyv", mcaq(int ), (int)304)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == od.mcag("mcyw", mcad(int ), (int)331)) break;
                v4 /* !! */  = (long)od.mcag("mcyx", mcad(int ), (int)332);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_5 = od.va - od.mcag("mcyy", mcaq(int ), (int)305)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == od.mcag("mcyz", mcad(int ), (int)333)) break;
                v5 /* !! */  = (long)od.mcag("mcza", mcad(int ), (int)334);
            }
            if (this.currentTickStepIndex >= this.scriptTickSteps.size()) ** GOTO lbl236
            if (var3_4 || var3_4) ** GOTO lbl21
            v6 /* !! */  = od.va;
            if (true) ** GOTO lbl45
            block77: while (true) {
                v6 /* !! */  = (long)(od.mcag("mczc", mcaq(int ), (int)307) - od.mcag("mczb", mcaq(int ), (int)306));
lbl45:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -714508833: {
                        break block77;
                    }
                    case 1774557099: {
                        continue block77;
                    }
                }
                break;
            }
            v7 /* !! */  = od.va;
            if (true) ** GOTO lbl54
            block78: while (true) {
                v7 /* !! */  = (long)(od.mcag("mcze", mcaq(int ), (int)309) - od.mcag("mczd", mcaq(int ), (int)308));
lbl54:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -714508833: {
                        break block78;
                    }
                    case -640825289: {
                        continue block78;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_6 = od.va - od.mcag("mczf", mcaq(int ), (int)310)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == od.mcag("mczg", mcad(int ), (int)335)) break;
                v8 /* !! */  = (long)od.mcag("mczh", mcad(int ), (int)336);
            }
            var2_5 = this.scriptTickSteps.get(this.currentTickStepIndex);
            if (var3_4 || var3_4) ** GOTO lbl21
            v9 /* !! */  = od.va;
            if (true) ** GOTO lbl70
            block80: while (true) {
                v9 /* !! */  = (long)(v10 - od.mcag("mczi", mcaq(int ), (int)311));
lbl70:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -2071194166: {
                        v10 = od.mcag("mczj", mcaq(int ), (int)312);
                        continue block80;
                    }
                    case -1668068972: {
                        v10 = od.mcag("mczk", mcaq(int ), (int)313);
                        continue block80;
                    }
                    case -714508833: {
                        break block80;
                    }
                }
                break;
            }
            v11 = var2_5.condition();
            v12 /* !! */  = od.va;
            if (true) ** GOTO lbl84
            block81: while (true) {
                v12 /* !! */  = (long)(v13 - od.mcag("mczl", mcaq(int ), (int)314));
lbl84:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -714508833: {
                        break block81;
                    }
                    case -209488934: {
                        v13 = od.mcag("mczm", mcaq(int ), (int)315);
                        continue block81;
                    }
                    case 2110893482: {
                        v13 = od.mcag("mczn", mcaq(int ), (int)316);
                        continue block81;
                    }
                    case 2132619817: {
                        v13 = od.mcag("mczo", mcaq(int ), (int)317);
                        continue block81;
                    }
                }
                break;
            }
            if (!v11.getAsBoolean()) break block121;
            if (var3_4) ** GOTO lbl21
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_7 = od.va - od.mcag("mczp", mcaq(int ), (int)318)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == od.mcag("mczq", mcad(int ), (int)337)) break;
                v14 /* !! */  = (long)od.mcag("mczr", mcad(int ), (int)338);
            }
            if (var2_5.ticks() > 0) break block121;
            if (var3_4 || var3_4) ** GOTO lbl21
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_8 = od.va - od.mcag("mczs", mcaq(int ), (int)319)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == od.mcag("mczt", mcad(int ), (int)339)) break;
                v15 /* !! */  = (long)od.mcag("mczu", mcad(int ), (int)340);
            }
            v16 = var2_5.action();
            v17 /* !! */  = od.va;
            if (true) ** GOTO lbl115
            block84: while (true) {
                v17 /* !! */  = (long)(v18 - od.mcag("mczv", mcaq(int ), (int)320));
lbl115:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -714508833: {
                        break block84;
                    }
                    case -232431214: {
                        v18 = od.mcag("mczw", mcaq(int ), (int)321);
                        continue block84;
                    }
                    case 1259479205: {
                        v18 = od.mcag("mczx", mcaq(int ), (int)322);
                        continue block84;
                    }
                    case 1266073482: {
                        v18 = od.mcag("mczy", mcaq(int ), (int)323);
                        continue block84;
                    }
                }
                break;
            }
            v16.perform();
            if (var3_4 || var3_4) ** GOTO lbl21
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_9 = od.va - od.mcag("mczz", mcaq(int ), (int)324)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == od.mcag("mdaa", mcad(int ), (int)341)) break;
                v19 /* !! */  = (long)od.mcag("mdab", mcad(int ), (int)342);
            }
            v20 = this.currentTickStepIndex + od.mcag("mdac", mcad(int ), (int)343);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_10 = od.va - od.mcag("mdad", mcaq(int ), (int)325)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == od.mcag("mdae", mcad(int ), (int)344)) break;
                v21 /* !! */  = (long)od.mcag("mdaf", mcad(int ), (int)345);
            }
            this.currentTickStepIndex = v20;
            if (var3_4 || var3_4) ** GOTO lbl21
            v22 /* !! */  = od.va;
            if (true) ** GOTO lbl146
            block87: while (true) {
                v22 /* !! */  = (long)(v23 - od.mcag("mdag", mcaq(int ), (int)326));
lbl146:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -714508833: {
                        break block87;
                    }
                    case -686422502: {
                        v23 = od.mcag("mdah", mcaq(int ), (int)327);
                        continue block87;
                    }
                    case 1180895704: {
                        v23 = od.mcag("mdai", mcaq(int ), (int)328);
                        continue block87;
                    }
                }
                break;
            }
            this.resetTime();
            if (var3_4 || var3_4) ** GOTO lbl21
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_11 = od.va - od.mcag("mdaj", mcaq(int ), (int)329)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == od.mcag("mdak", mcad(int ), (int)346)) break;
                v24 /* !! */  = (long)od.mcag("mdal", mcad(int ), (int)347);
            }
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_12 = od.va - od.mcag("mdam", mcaq(int ), (int)330)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == od.mcag("mdan", mcad(int ), (int)348)) break;
                v25 /* !! */  = (long)od.mcag("mdao", mcad(int ), (int)349);
            }
            v26 /* !! */  = od.va;
            if (true) ** GOTO lbl171
            block90: while (true) {
                v26 /* !! */  = (long)(v27 - od.mcag("mdap", mcaq(int ), (int)331));
lbl171:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1759834612: {
                        v27 = od.mcag("mdaq", mcaq(int ), (int)332);
                        continue block90;
                    }
                    case -714508833: {
                        break block90;
                    }
                    case 1486568060: {
                        v27 = od.mcag("mdar", mcaq(int ), (int)333);
                        continue block90;
                    }
                }
                break;
            }
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_13 = od.va - od.mcag("mdas", mcaq(int ), (int)334)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == od.mcag("mdat", mcad(int ), (int)350)) break;
                v28 /* !! */  = (long)od.mcag("mdau", mcad(int ), (int)351);
            }
            v29 = this.scriptTickSteps.size();
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_14 = od.va - od.mcag("mdav", mcaq(int ), (int)335)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == od.mcag("mdaw", mcad(int ), (int)352)) break;
                v30 /* !! */  = (long)od.mcag("mdax", mcad(int ), (int)353);
            }
            if (!this.loopStrategy.shouldLoop(this.currentTickStepIndex, v29)) break block121;
            if (var3_4 || var3_4) ** GOTO lbl21
            v31 /* !! */  = od.va;
            if (true) ** GOTO lbl197
            block93: while (true) {
                v31 /* !! */  = (long)(v32 - od.mcag("mday", mcaq(int ), (int)336));
lbl197:
                // 2 sources

                switch ((int)v31 /* !! */ ) {
                    case -714508833: {
                        break block93;
                    }
                    case 448613307: {
                        v32 = od.mcag("mdaz", mcaq(int ), (int)337);
                        continue block93;
                    }
                    case 936266335: {
                        v32 = od.mcag("mdba", mcaq(int ), (int)338);
                        continue block93;
                    }
                    case 1210295208: {
                        v32 = od.mcag("mdbb", mcaq(int ), (int)339);
                        continue block93;
                    }
                }
                break;
            }
            this.resetStepIndex();
            if (var3_4 || var3_4) ** GOTO lbl21
            while (true) {
                if ((v33 /* !! */  = (cfr_temp_15 = od.va - od.mcag("mdbc", mcaq(int ), (int)340)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                if (v33 /* !! */  == od.mcag("mdbd", mcad(int ), (int)354)) break;
                v33 /* !! */  = (long)od.mcag("mdbe", mcad(int ), (int)355);
            }
            while (true) {
                if ((v34 /* !! */  = (cfr_temp_16 = od.va - od.mcag("mdbf", mcaq(int ), (int)341)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                if (v34 /* !! */  == od.mcag("mdbg", mcad(int ), (int)356)) break;
                v34 /* !! */  = (long)od.mcag("mdbh", mcad(int ), (int)357);
            }
            this.loopStrategy.onLoop();
            if (var3_4) ** GOTO lbl21
        }
        if (var3_4) ** GOTO lbl21
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl21
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_17 = od.va - od.mcag("mdbi", mcaq(int ), (int)342)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == od.mcag("mdbj", mcad(int ), (int)358)) break;
                    v35 /* !! */  = (long)od.mcag("mdbk", mcad(int ), (int)359);
                }
                var2_5.decrementTicks();
                if (var3_4) ** GOTO lbl21
lbl236:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)od.mcag("mdbl", mcad(int ), (int)360);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl244:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)od.mcag("mdbm", mcad(int ), (int)361);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
            case 2: {
                do {
                    var4_3 /* !! */  = (int)od.mcag("mdbn", mcad(int ), (int)362);
                } while (!var5_2);
                throw null;
            }
lbl254:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)od.mcag("mdbo", mcad(int ), (int)363);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl309
                    break;
                }
            }
lbl260:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)od.mcag("mdbp", mcad(int ), (int)364);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 5: {
                var4_3 /* !! */  = (int)od.mcag("mdbq", mcad(int ), (int)365);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl270:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)od.mcag("mdbr", mcad(int ), (int)366);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 7: {
                var4_3 /* !! */  = (int)od.mcag("mdbs", mcad(int ), (int)367);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 8: {
                var4_3 /* !! */  = (int)od.mcag("mdbt", mcad(int ), (int)368);
                if (!var5_2) ** GOTO lbl260
                throw null;
            }
lbl284:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)od.mcag("mdbu", mcad(int ), (int)369);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl289:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)od.mcag("mdbv", mcad(int ), (int)370);
                if (var5_2) {
                    throw null;
                }
            }
lbl293:
            // 4 sources

            case 11: {
                var4_3 /* !! */  = (int)od.mcag("mdbw", mcad(int ), (int)371);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
lbl297:
            // 5 sources

            case 12: {
                var4_3 /* !! */  = (int)od.mcag("mdbx", mcad(int ), (int)372);
                if (!var5_2) ** GOTO lbl254
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)od.mcag("mdby", mcad(int ), (int)373);
                if (!var5_2) ** GOTO lbl289
                throw null;
            }
lbl305:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)od.mcag("mdbz", mcad(int ), (int)374);
                if (!var5_2) ** GOTO lbl254
                throw null;
            }
lbl309:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)od.mcag("mdca", mcad(int ), (int)375);
                if (!var5_2) ** GOTO lbl297
                throw null;
            }
            case 16: {
                do {
                    var4_3 /* !! */  = (int)od.mcag("mdcb", mcad(int ), (int)376);
                } while (!var5_2);
                throw null;
            }
lbl318:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)od.mcag("mdcc", mcad(int ), (int)377);
                if (!var5_2) ** GOTO lbl284
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)od.mcag("mdcd", mcad(int ), (int)378);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)od.mcag("mdce", mcad(int ), (int)379);
                if (!var5_2) ** GOTO lbl293
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)od.mcag("mdcf", mcad(int ), (int)380);
                if (!var5_2) break;
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)od.mcag("mdcg", mcad(int ), (int)381);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
            case 22: {
                var4_3 /* !! */  = (int)od.mcag("mdch", mcad(int ), (int)382);
                if (!var5_2) ** GOTO lbl318
                throw null;
            }
lbl343:
            // 3 sources

            case 23: {
                var4_3 /* !! */  = (int)od.mcag("mdci", mcad(int ), (int)383);
                if (!var5_2) ** GOTO lbl260
                throw null;
            }
lbl347:
            // 3 sources

            case 24: {
                var4_3 /* !! */  = (int)od.mcag("mdcj", mcad(int ), (int)384);
                if (!var5_2) ** GOTO lbl305
                throw null;
            }
            case 25: {
                var4_3 /* !! */  = (int)od.mcag("mdck", mcad(int ), (int)385);
                if (!var5_2) ** GOTO lbl270
                throw null;
            }
            case 26: 
        }
        var4_3 /* !! */  = (int)od.mcag("mdcl", mcad(int ), (int)386);
        ** while (!var5_2)
lbl358:
        // 1 sources

        throw null;
    }
}

