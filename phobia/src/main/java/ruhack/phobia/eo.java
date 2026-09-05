/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2561
 *  net.minecraft.class_742
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_742;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.mq;

public class eo
extends ds {
    public static final boolean a;
    private static long[] cuw;
    private static int[] cud;
    protected static final long n = 6061418025544250040L;
    private final kf leaveType;
    public static final boolean c;
    private static int[] cue;
    private final ke triggerSetting;
    private static long[] cux;
    private final kg distanceSetting;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eo.n - eo.cug("dpt", cuv(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eo.cug("dpu", cui(int ), (int)134)) break;
            v0 /* !! */  = (long)eo.cug("dpv", cui(int ), (int)135);
        }
        var3_1 = eo.c;
        v1 /* !! */  = eo.n;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - eo.cug("dpw", cuv(int ), (int)105));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1323578971: {
                    v2 = eo.cug("dpx", cuv(int ), (int)106);
                    continue block18;
                }
                case -299186057: {
                    v2 = eo.cug("dpy", cuv(int ), (int)107);
                    continue block18;
                }
                case 1471607480: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = eo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eo.n - eo.cug("dpz", cuv(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == eo.cug("dqa", cui(int ), (int)136)) break;
            v3 /* !! */  = (long)eo.cug("dqb", cui(int ), (int)137);
        }
        var1_3 = eo.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = eo.n - eo.cug("dqc", cuv(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == eo.cug("dqd", cui(int ), (int)138)) break;
                    v4 /* !! */  = (long)eo.cug("dqe", cui(int ), (int)139);
                }
                v5 /* !! */  = eo.n;
                if (true) ** GOTO lbl47
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - eo.cug("dqf", cuv(int ), (int)110));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -978489885: {
                            v6 = eo.cug("dqg", cuv(int ), (int)111);
                            continue block22;
                        }
                        case 297009170: {
                            v6 = eo.cug("dqh", cuv(int ), (int)112);
                            continue block22;
                        }
                        case 412464872: {
                            v6 = eo.cug("dqi", cuv(int ), (int)113);
                            continue block22;
                        }
                        case 1471607480: {
                            break block22;
                        }
                    }
                    break;
                }
                v7 = this.triggerSetting.isSelected("Players");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = eo.n - eo.cug("dqj", cuv(int ), (int)114)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == eo.cug("dqk", cui(int ), (int)140)) break;
                    v8 /* !! */  = (long)eo.cug("dql", cui(int ), (int)141);
                }
                return v7;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)eo.cug("dqm", cui(int ), (int)142);
                } while (!var3_1);
                throw null;
            }
lbl72:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)eo.cug("dqn", cui(int ), (int)143);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)eo.cug("dqo", cui(int ), (int)144);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)eo.cug("dqp", cui(int ), (int)145);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite cug(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float cuc(int n2) {
        return Float.intBitsToFloat(cud[n2] ^ cue[n2]);
    }

    private static /* synthetic */ long cuv(int n2) {
        return cuw[n2] ^ cux[n2];
    }

    private static /* synthetic */ void dqw() {
        eo.cux[0] = 3771834686782762819L;
        eo.cux[1] = -1481407215352865201L;
        eo.cux[2] = 3413068246986270788L;
        eo.cux[3] = 8485042292587885233L;
        eo.cux[4] = -3726144917216753092L;
        eo.cux[5] = -7093944820456576010L;
        eo.cux[6] = -4211541309038473381L;
        eo.cux[7] = 3228071115402464726L;
        eo.cux[8] = -3836684759400289785L;
        eo.cux[9] = -55354935464516514L;
        eo.cux[10] = -2024316423493630637L;
        eo.cux[11] = 3344056866364898227L;
        eo.cux[12] = -8621011903512481561L;
        eo.cux[13] = -8628390292736709438L;
        eo.cux[14] = -5971824261329673697L;
        eo.cux[15] = 5862376507701373794L;
        eo.cux[16] = 7177197526476506010L;
        eo.cux[17] = 3957809999251063026L;
        eo.cux[18] = -6261699031437660510L;
        eo.cux[19] = -4346537856194113592L;
        eo.cux[20] = -2738571779201200110L;
        eo.cux[21] = 1485326812565517355L;
        eo.cux[22] = 8367478020978682759L;
        eo.cux[23] = -5052406853888085378L;
        eo.cux[24] = -171976365873338503L;
        eo.cux[25] = -7289043820369460507L;
        eo.cux[26] = -6172130194163310880L;
        eo.cux[27] = -4330669423423915894L;
        eo.cux[28] = 4698744704105848649L;
        eo.cux[29] = 6606532759944200210L;
        eo.cux[30] = -5467481146653211245L;
        eo.cux[31] = -6287206676816232163L;
        eo.cux[32] = -6438368830375380279L;
        eo.cux[33] = 7564151095634577067L;
        eo.cux[34] = -6046824627787224758L;
        eo.cux[35] = 6885805695892490254L;
        eo.cux[36] = -4900711621319814013L;
        eo.cux[37] = 8401406612305006123L;
        eo.cux[38] = 51378064741198363L;
        eo.cux[39] = -3445595679062228525L;
        eo.cux[40] = -2491778756567865831L;
        eo.cux[41] = 1702775418886039882L;
        eo.cux[42] = -2759878755457442518L;
        eo.cux[43] = -4437533914674386582L;
        eo.cux[44] = -7977176660206401840L;
        eo.cux[45] = 2279640333958264058L;
        eo.cux[46] = -2393883008955826362L;
        eo.cux[47] = -962396943091783633L;
        eo.cux[48] = 1925570996455877031L;
        eo.cux[49] = -1621672281823840802L;
        eo.cux[50] = -3187727080897095551L;
        eo.cux[51] = -308314561452240120L;
        eo.cux[52] = -4775222235594297499L;
        eo.cux[53] = 2100478034799701859L;
        eo.cux[54] = 6487507525481738025L;
        eo.cux[55] = 3431173558744527224L;
        eo.cux[56] = 2219749317694851232L;
        eo.cux[57] = 2560517609938256329L;
        eo.cux[58] = -9218957045104591547L;
        eo.cux[59] = 8549948895053620346L;
        eo.cux[60] = 1203666122014707065L;
        eo.cux[61] = -8457501587027829740L;
        eo.cux[62] = 3767342624940337060L;
        eo.cux[63] = -4277169119225240728L;
        eo.cux[64] = 597153592567945598L;
        eo.cux[65] = 7113832760082992279L;
        eo.cux[66] = 9039286480730896008L;
        eo.cux[67] = -3922741379675658386L;
        eo.cux[68] = 651389790541515203L;
        eo.cux[69] = 4068621813921580043L;
        eo.cux[70] = -1738256024112743839L;
        eo.cux[71] = 5942119531452559283L;
        eo.cux[72] = -5948595558815479726L;
        eo.cux[73] = -4260825073496308764L;
        eo.cux[74] = -3465856817619062300L;
        eo.cux[75] = 3929341426611536539L;
        eo.cux[76] = -5069835869890445861L;
        eo.cux[77] = -6993383142638368685L;
        eo.cux[78] = -2573972385419641171L;
        eo.cux[79] = -2487831822178572097L;
        eo.cux[80] = 2184737303681319742L;
        eo.cux[81] = 989799757854904726L;
        eo.cux[82] = 2359024296385378144L;
        eo.cux[83] = 5377762237376022381L;
        eo.cux[84] = 2714015765118324648L;
        eo.cux[85] = -8536348961407221969L;
        eo.cux[86] = 5388108293744364258L;
        eo.cux[87] = -7136046129496889506L;
        eo.cux[88] = -8907403404833957597L;
        eo.cux[89] = -4154427860828096615L;
        eo.cux[90] = 7749591147700404796L;
        eo.cux[91] = -9063200031431855574L;
        eo.cux[92] = 477782208668300829L;
        eo.cux[93] = -5137307880658346156L;
        eo.cux[94] = 3976754608361290353L;
        eo.cux[95] = 7597088126108033098L;
        eo.cux[96] = 2308850615976325174L;
        eo.cux[97] = -1734986811016450203L;
        eo.cux[98] = 7685373696724442146L;
        eo.cux[99] = -6940793126939800195L;
    }

    private static /* synthetic */ void dqr() {
        eo.cud[100] = 1012569183;
        eo.cud[101] = 1314025304;
        eo.cud[102] = -1531204856;
        eo.cud[103] = -895213434;
        eo.cud[104] = 1118534938;
        eo.cud[105] = -2145900679;
        eo.cud[106] = 367920333;
        eo.cud[107] = -297888624;
        eo.cud[108] = 905819795;
        eo.cud[109] = 371297541;
        eo.cud[110] = -837370789;
        eo.cud[111] = 1023490822;
        eo.cud[112] = -171013199;
        eo.cud[113] = -1571775271;
        eo.cud[114] = -813854602;
        eo.cud[115] = -1567979751;
        eo.cud[116] = 1933293436;
        eo.cud[117] = -1573987078;
        eo.cud[118] = -1204822013;
        eo.cud[119] = 796180950;
        eo.cud[120] = -1389874927;
        eo.cud[121] = -725541107;
        eo.cud[122] = -911956849;
        eo.cud[123] = 868022516;
        eo.cud[124] = 378284627;
        eo.cud[125] = 695149627;
        eo.cud[126] = 1643140069;
        eo.cud[127] = 158084989;
        eo.cud[128] = -1666217250;
        eo.cud[129] = 1194640125;
        eo.cud[130] = 1400935154;
        eo.cud[131] = -1065325956;
        eo.cud[132] = 430821605;
        eo.cud[133] = 1274709975;
        eo.cud[134] = -253119468;
        eo.cud[135] = 542712061;
        eo.cud[136] = -1931186070;
        eo.cud[137] = 60172715;
        eo.cud[138] = -1456049644;
        eo.cud[139] = -2065525194;
        eo.cud[140] = 55229654;
        eo.cud[141] = 1245047748;
        eo.cud[142] = -1081033692;
        eo.cud[143] = -179015700;
        eo.cud[144] = -856315240;
        eo.cud[145] = 1770177859;
    }

    private static /* synthetic */ int cui(int n2) {
        return cud[n2] ^ cue[n2];
    }

    private static /* synthetic */ void dqx() {
        eo.cux[100] = 1256208165877536957L;
        eo.cux[101] = 4031788964690424699L;
        eo.cux[102] = -5487795388742089416L;
        eo.cux[103] = 9164684964620127562L;
        eo.cux[104] = -2478834732931447482L;
        eo.cux[105] = -4682430217623071846L;
        eo.cux[106] = -5952294118422638349L;
        eo.cux[107] = -2150714104737346863L;
        eo.cux[108] = -5947367849452808895L;
        eo.cux[109] = -6214111165427644585L;
        eo.cux[110] = -7470819551204677527L;
        eo.cux[111] = -2849665107843939769L;
        eo.cux[112] = 4872492715547083070L;
        eo.cux[113] = -7886338505715253113L;
        eo.cux[114] = -6640378581877071122L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void leave(class_2561 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eo.n - eo.cug("dbp", cuv(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eo.cug("dbq", cui(int ), (int)41)) break;
            v0 /* !! */  = (long)eo.cug("dbr", cui(int ), (int)42);
        }
        var6_2 = eo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eo.n - eo.cug("dbt", cuv(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eo.cug("dbu", cui(int ), (int)43)) break;
            v1 /* !! */  = (long)eo.cug("dbw", cui(int ), (int)44);
        }
        var5_3 /* !! */  = eo.b;
        v2 /* !! */  = eo.n;
        if (true) ** GOTO lbl17
        block87: while (true) {
            v2 /* !! */  = (long)(v3 - eo.cug("dby", cuv(int ), (int)28));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -397901736: {
                    v3 = eo.cug("dcb", cuv(int ), (int)29);
                    continue block87;
                }
                case -140173819: {
                    v3 = eo.cug("dcd", cuv(int ), (int)30);
                    continue block87;
                }
                case 282499679: {
                    v3 = eo.cug("dcf", cuv(int ), (int)31);
                    continue block87;
                }
                case 1471607480: {
                    break block87;
                }
            }
            break;
        }
        var4_4 = eo.a;
        if (var6_2) {
            throw null;
lbl32:
            // 16 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = eo.n - eo.cug("dci", cuv(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == eo.cug("dck", cui(int ), (int)45)) break;
            v4 /* !! */  = (long)eo.cug("dcm", cui(int ), (int)46);
        }
        v5 /* !! */  = eo.n;
        if (true) ** GOTO lbl44
        block90: while (true) {
            v5 /* !! */  = (long)(v6 - eo.cug("dcn", cuv(int ), (int)33));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1924273191: {
                    v6 = eo.cug("dco", cuv(int ), (int)34);
                    continue block90;
                }
                case -1168614498: {
                    v6 = eo.cug("dcq", cuv(int ), (int)35);
                    continue block90;
                }
                case 1471607480: {
                    break block90;
                }
            }
            break;
        }
        var2_5 = this.leaveType.getValue();
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl32
                var3_6 = eo.cug("dcs", cui(int ), (int)47);
                if (var4_4) ** GOTO lbl32
                v7 /* !! */  = eo.n;
                if (true) ** GOTO lbl64
                block91: while (true) {
                    v7 /* !! */  = (long)(v8 - eo.cug("dcv", cuv(int ), (int)36));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1796310315: {
                            v8 = eo.cug("dcx", cuv(int ), (int)37);
                            continue block91;
                        }
                        case 1178914681: {
                            v8 = eo.cug("dcz", cuv(int ), (int)38);
                            continue block91;
                        }
                        case 1471607480: {
                            break block91;
                        }
                    }
                    break;
                }
                switch (var2_5.hashCode()) {
                    case 72917: {
                        if (var4_4 || var4_4) ** GOTO lbl32
                        v9 /* !! */  = eo.n;
                        if (true) ** GOTO lbl80
                        block92: while (true) {
                            v9 /* !! */  = (long)(eo.cug("ddd", cuv(int ), (int)40) - eo.cug("ddb", cuv(int ), (int)39));
lbl80:
                            // 2 sources

                            switch ((int)v9 /* !! */ ) {
                                case -1829809218: {
                                    continue block92;
                                }
                                case 1471607480: {
                                    break block92;
                                }
                            }
                            break;
                        }
                        if (!var2_5.equals("Hub")) break;
                        if (var4_4) ** GOTO lbl32
                        var3_6 = eo.cug("ddj", cui(int ), (int)48);
                        if (var4_4) ** GOTO lbl32
                        if (!var6_2) break;
                        throw null;
                    }
                    case 1693597542: {
                        if (var4_4 || var4_4) ** GOTO lbl32
                        v10 /* !! */  = eo.n;
                        if (true) ** GOTO lbl97
                        block93: while (true) {
                            v10 /* !! */  = (long)(v11 - eo.cug("ddn", cuv(int ), (int)41));
lbl97:
                            // 2 sources

                            switch ((int)v10 /* !! */ ) {
                                case -1825539724: {
                                    v11 = eo.cug("ddo", cuv(int ), (int)42);
                                    continue block93;
                                }
                                case -85043378: {
                                    v11 = eo.cug("ddq", cuv(int ), (int)43);
                                    continue block93;
                                }
                                case 1290840131: {
                                    v11 = eo.cug("dds", cuv(int ), (int)44);
                                    continue block93;
                                }
                                case 1471607480: {
                                    break block93;
                                }
                            }
                            break;
                        }
                        if (!var2_5.equals("Main Menu")) break;
                        if (var4_4) ** GOTO lbl32
                        var3_6 = eo.cug("ddt", cui(int ), (int)49);
                        if (var4_4) ** break;
                    }
                }
                if (var4_4 || var4_4) ** GOTO lbl32
                switch (var3_6) {
                    case 0: {
                        if (var4_4 || var4_4) ** GOTO lbl32
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_3 = eo.n - eo.cug("ddy", cuv(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == eo.cug("dea", cui(int ), (int)50)) break;
                            v12 /* !! */  = (long)eo.cug("dec", cui(int ), (int)51);
                        }
                        while (true) {
                            if ((v13 /* !! */  = (cfr_temp_4 = eo.n - eo.cug("dee", cuv(int ), (int)46)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v13 /* !! */  == eo.cug("def", cui(int ), (int)52)) break;
                            v13 /* !! */  = (long)eo.cug("dei", cui(int ), (int)53);
                        }
                        v14 = eo.mc.method_1562();
                        while (true) {
                            if ((v15 /* !! */  = (cfr_temp_5 = eo.n - eo.cug("dek", cuv(int ), (int)47)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v15 /* !! */  == eo.cug("dem", cui(int ), (int)54)) break;
                            v15 /* !! */  = (long)eo.cug("deo", cui(int ), (int)55);
                        }
                        v14.method_45730("hub");
                        if (var4_4 || var4_4) ** GOTO lbl32
                        if (!var6_2) break;
                        throw null;
                    }
                    case 1: {
                        if (var4_4 || var4_4) ** GOTO lbl32
                        while (true) {
                            if ((v16 /* !! */  = (cfr_temp_6 = eo.n - eo.cug("det", cuv(int ), (int)48)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v16 /* !! */  == eo.cug("deu", cui(int ), (int)56)) break;
                            v16 /* !! */  = (long)eo.cug("dev", cui(int ), (int)57);
                        }
                        v17 /* !! */  = eo.n;
                        if (true) ** GOTO lbl148
                        block98: while (true) {
                            v17 /* !! */  = (long)(v18 - eo.cug("dew", cuv(int ), (int)49));
lbl148:
                            // 2 sources

                            switch ((int)v17 /* !! */ ) {
                                case 1471607480: {
                                    break block98;
                                }
                                case 1490375587: {
                                    v18 = eo.cug("dex", cuv(int ), (int)50);
                                    continue block98;
                                }
                                case 1937753389: {
                                    v18 = eo.cug("dey", cuv(int ), (int)51);
                                    continue block98;
                                }
                            }
                            break;
                        }
                        v19 = eo.mc.method_1562();
                        v20 /* !! */  = eo.n;
                        if (true) ** GOTO lbl162
                        block99: while (true) {
                            v20 /* !! */  = (long)(v21 - eo.cug("dfa", cuv(int ), (int)52));
lbl162:
                            // 2 sources

                            switch ((int)v20 /* !! */ ) {
                                case -903801816: {
                                    v21 = eo.cug("dfb", cuv(int ), (int)53);
                                    continue block99;
                                }
                                case 309400148: {
                                    v21 = eo.cug("dfc", cuv(int ), (int)54);
                                    continue block99;
                                }
                                case 1471607480: {
                                    break block99;
                                }
                            }
                            break;
                        }
                        v22 = v19.method_48296();
                        while (true) {
                            if ((v23 /* !! */  = (cfr_temp_7 = eo.n - eo.cug("dfe", cuv(int ), (int)55)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v23 /* !! */  == eo.cug("dfg", cui(int ), (int)58)) break;
                            v23 /* !! */  = (long)eo.cug("dfi", cui(int ), (int)59);
                        }
                        v24 = class_2561.method_30163((String)"[Auto Leave] \n");
                        while (true) {
                            if ((v25 /* !! */  = (cfr_temp_8 = eo.n - eo.cug("dfj", cuv(int ), (int)56)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v25 /* !! */  == eo.cug("dfk", cui(int ), (int)60)) break;
                            v25 /* !! */  = (long)eo.cug("dfm", cui(int ), (int)61);
                        }
                        v26 = v24.method_27661();
                        v27 /* !! */  = eo.n;
                        if (true) ** GOTO lbl188
                        block102: while (true) {
                            v27 /* !! */  = (long)(v28 - eo.cug("dfo", cuv(int ), (int)57));
lbl188:
                            // 2 sources

                            switch ((int)v27 /* !! */ ) {
                                case -1520055313: {
                                    v28 = eo.cug("dfq", cuv(int ), (int)58);
                                    continue block102;
                                }
                                case -1430726561: {
                                    v28 = eo.cug("dfr", cuv(int ), (int)59);
                                    continue block102;
                                }
                                case 1471607480: {
                                    break block102;
                                }
                            }
                            break;
                        }
                        v29 = v26.method_10852(var1_1);
                        v30 /* !! */  = eo.n;
                        if (true) ** GOTO lbl202
                        block103: while (true) {
                            v30 /* !! */  = (long)(v31 - eo.cug("dfs", cuv(int ), (int)60));
lbl202:
                            // 2 sources

                            switch ((int)v30 /* !! */ ) {
                                case -159473697: {
                                    v31 = eo.cug("dft", cuv(int ), (int)61);
                                    continue block103;
                                }
                                case 1471607480: {
                                    break block103;
                                }
                                case 1818625614: {
                                    v31 = eo.cug("dfu", cuv(int ), (int)62);
                                    continue block103;
                                }
                            }
                            break;
                        }
                        v22.method_10747((class_2561)v29);
                        if (var4_4) ** break;
                    }
                }
                if (var4_4 || var4_4) ** GOTO lbl32
                v32 = eo.cug("dgd", cui(int ), (int)62);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = eo.n - eo.cug("dgj", cuv(int ), (int)63)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == eo.cug("dgo", cui(int ), (int)63)) break;
                    v33 /* !! */  = (long)eo.cug("dln", cui(int ), (int)64);
                }
                this.setState((boolean)v32);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl224:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)eo.cug("dlo", cui(int ), (int)65);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl229:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)eo.cug("dlp", cui(int ), (int)66);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl234:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)eo.cug("dlq", cui(int ), (int)67);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl239:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)eo.cug("dlr", cui(int ), (int)68);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl244:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)eo.cug("dls", cui(int ), (int)69);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl249:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)eo.cug("dlt", cui(int ), (int)70);
                if (!var6_2) ** GOTO lbl229
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)eo.cug("dlu", cui(int ), (int)71);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl258:
            // 2 sources

            case 7: {
                do {
                    var5_3 /* !! */  = (int)eo.cug("dlv", cui(int ), (int)72);
                } while (!var6_2);
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)eo.cug("dlw", cui(int ), (int)73);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 9: {
                var5_3 /* !! */  = (int)eo.cug("dlx", cui(int ), (int)74);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl273:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)eo.cug("dly", cui(int ), (int)75);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl278:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)eo.cug("dlz", cui(int ), (int)76);
                if (!var6_2) ** GOTO lbl258
                throw null;
            }
lbl282:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)eo.cug("dma", cui(int ), (int)77);
                if (!var6_2) ** GOTO lbl224
                throw null;
            }
lbl286:
            // 4 sources

            case 13: {
                var5_3 /* !! */  = (int)eo.cug("dmb", cui(int ), (int)78);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl291:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)eo.cug("dmc", cui(int ), (int)79);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 15: {
                var5_3 /* !! */  = (int)eo.cug("dmd", cui(int ), (int)80);
                if (!var6_2) ** GOTO lbl234
                throw null;
            }
lbl300:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)eo.cug("dme", cui(int ), (int)81);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl305:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)eo.cug("dmf", cui(int ), (int)82);
                if (!var6_2) ** GOTO lbl234
                throw null;
            }
lbl309:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)eo.cug("dmg", cui(int ), (int)83);
                if (!var6_2) ** GOTO lbl244
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)eo.cug("dmh", cui(int ), (int)84);
                if (!var6_2) break;
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)eo.cug("dmi", cui(int ), (int)85);
                if (!var6_2) ** GOTO lbl291
                throw null;
            }
lbl321:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)eo.cug("dmj", cui(int ), (int)86);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl326:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)eo.cug("dmk", cui(int ), (int)87);
                if (!var6_2) ** GOTO lbl286
                throw null;
            }
            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)eo.cug("dml", cui(int ), (int)88);
                    if (!var6_2) ** GOTO lbl305
                    throw null;
                }
            }
            case 24: {
                var5_3 /* !! */  = (int)eo.cug("dmm", cui(int ), (int)89);
                if (!var6_2) ** GOTO lbl321
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)eo.cug("dmn", cui(int ), (int)90);
                if (!var6_2) ** GOTO lbl249
                throw null;
            }
lbl343:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)eo.cug("dmo", cui(int ), (int)91);
                if (!var6_2) ** GOTO lbl239
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)eo.cug("dmp", cui(int ), (int)92);
                if (!var6_2) ** GOTO lbl249
                throw null;
            }
            case 28: 
        }
        var5_3 /* !! */  = (int)eo.cug("dmq", cui(int ), (int)93);
        ** while (!var6_2)
lbl354:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dqq() {
        eo.cud[0] = -582950713;
        eo.cud[1] = 1107604218;
        eo.cud[2] = 2018108475;
        eo.cud[3] = 437080655;
        eo.cud[4] = 816772803;
        eo.cud[5] = 1905367357;
        eo.cud[6] = 849644076;
        eo.cud[7] = -121276437;
        eo.cud[8] = 1635293819;
        eo.cud[9] = -2081910992;
        eo.cud[10] = -2132046474;
        eo.cud[11] = -1093289168;
        eo.cud[12] = -1880889297;
        eo.cud[13] = 400053936;
        eo.cud[14] = 618713250;
        eo.cud[15] = 680419419;
        eo.cud[16] = 1367031317;
        eo.cud[17] = -12942370;
        eo.cud[18] = 715793833;
        eo.cud[19] = -742401189;
        eo.cud[20] = 710061708;
        eo.cud[21] = 1778481541;
        eo.cud[22] = -1204098804;
        eo.cud[23] = 1678625213;
        eo.cud[24] = 309886303;
        eo.cud[25] = -2121234900;
        eo.cud[26] = -935383650;
        eo.cud[27] = -2103981790;
        eo.cud[28] = 1073239712;
        eo.cud[29] = 933592496;
        eo.cud[30] = 193913859;
        eo.cud[31] = -1513166935;
        eo.cud[32] = 1644837620;
        eo.cud[33] = -188267891;
        eo.cud[34] = -1315656811;
        eo.cud[35] = -343087158;
        eo.cud[36] = -1645836780;
        eo.cud[37] = 1947061079;
        eo.cud[38] = -122949500;
        eo.cud[39] = -1247201366;
        eo.cud[40] = 590565070;
        eo.cud[41] = 2081862053;
        eo.cud[42] = -1886400797;
        eo.cud[43] = 1550944244;
        eo.cud[44] = 247715712;
        eo.cud[45] = -1659335179;
        eo.cud[46] = 488409520;
        eo.cud[47] = 1902228488;
        eo.cud[48] = -187233437;
        eo.cud[49] = -2139734759;
        eo.cud[50] = -1602141088;
        eo.cud[51] = 1527105178;
        eo.cud[52] = -30102807;
        eo.cud[53] = -507784604;
        eo.cud[54] = 560959198;
        eo.cud[55] = -523224847;
        eo.cud[56] = -212160372;
        eo.cud[57] = -1982366782;
        eo.cud[58] = 1432823350;
        eo.cud[59] = 961919134;
        eo.cud[60] = 897069421;
        eo.cud[61] = 1214479572;
        eo.cud[62] = 1023331182;
        eo.cud[63] = 1592343737;
        eo.cud[64] = -2043690407;
        eo.cud[65] = 1239226423;
        eo.cud[66] = -1601539834;
        eo.cud[67] = 691001883;
        eo.cud[68] = -481880250;
        eo.cud[69] = 168859062;
        eo.cud[70] = 2055587842;
        eo.cud[71] = -353572663;
        eo.cud[72] = -398359097;
        eo.cud[73] = 2109981261;
        eo.cud[74] = -135609311;
        eo.cud[75] = -1659141020;
        eo.cud[76] = -1678635191;
        eo.cud[77] = -538284950;
        eo.cud[78] = 1502777747;
        eo.cud[79] = 1961691635;
        eo.cud[80] = 661331730;
        eo.cud[81] = 891674429;
        eo.cud[82] = 585721547;
        eo.cud[83] = -1489893591;
        eo.cud[84] = 288148614;
        eo.cud[85] = 1084133748;
        eo.cud[86] = -1114922569;
        eo.cud[87] = -939971892;
        eo.cud[88] = -818632274;
        eo.cud[89] = 2132492551;
        eo.cud[90] = 1061911172;
        eo.cud[91] = -1214637144;
        eo.cud[92] = 1138497886;
        eo.cud[93] = -1302856099;
        eo.cud[94] = -832797578;
        eo.cud[95] = -1553729238;
        eo.cud[96] = -1173094283;
        eo.cud[97] = 769598312;
        eo.cud[98] = -710424700;
        eo.cud[99] = 1487207804;
    }

    private static /* synthetic */ void dqs() {
        eo.cue[0] = -1662983993;
        eo.cue[1] = 1107604223;
        eo.cue[2] = 2018108435;
        eo.cue[3] = 437080653;
        eo.cue[4] = 816772806;
        eo.cue[5] = 1905367356;
        eo.cue[6] = 849644072;
        eo.cue[7] = -121276438;
        eo.cue[8] = 1635293816;
        eo.cue[9] = -2081910988;
        eo.cue[10] = -2132046473;
        eo.cue[11] = -1237006363;
        eo.cue[12] = 1880889296;
        eo.cue[13] = -869857698;
        eo.cue[14] = 618713251;
        eo.cue[15] = 1638787714;
        eo.cue[16] = 1367031316;
        eo.cue[17] = -1852588892;
        eo.cue[18] = 715793832;
        eo.cue[19] = -2084253067;
        eo.cue[20] = 710061709;
        eo.cue[21] = -423385109;
        eo.cue[22] = -1204098803;
        eo.cue[23] = -1003582644;
        eo.cue[24] = -309886304;
        eo.cue[25] = -856095508;
        eo.cue[26] = -935383649;
        eo.cue[27] = 1643670945;
        eo.cue[28] = 1073239713;
        eo.cue[29] = 933592505;
        eo.cue[30] = 193913867;
        eo.cue[31] = -1513166936;
        eo.cue[32] = 1644837616;
        eo.cue[33] = -188267896;
        eo.cue[34] = -1315656811;
        eo.cue[35] = -343087162;
        eo.cue[36] = -1645836779;
        eo.cue[37] = 1947061087;
        eo.cue[38] = -122949491;
        eo.cue[39] = -1247201364;
        eo.cue[40] = 590565068;
        eo.cue[41] = 2081862052;
        eo.cue[42] = 1879528190;
        eo.cue[43] = 1550944245;
        eo.cue[44] = -1970981547;
        eo.cue[45] = -1659335180;
        eo.cue[46] = 1901744989;
        eo.cue[47] = -1902228489;
        eo.cue[48] = -187233437;
        eo.cue[49] = -2139734760;
        eo.cue[50] = -1602141087;
        eo.cue[51] = -46047550;
        eo.cue[52] = -30102808;
        eo.cue[53] = 1452942609;
        eo.cue[54] = -560959199;
        eo.cue[55] = 498531973;
        eo.cue[56] = 212160371;
        eo.cue[57] = 453644624;
        eo.cue[58] = -1432823351;
        eo.cue[59] = 50365124;
        eo.cue[60] = -897069422;
        eo.cue[61] = -157739757;
        eo.cue[62] = 1023331182;
        eo.cue[63] = 1592343736;
        eo.cue[64] = -883774272;
        eo.cue[65] = 1239226418;
        eo.cue[66] = -1601539824;
        eo.cue[67] = 691001858;
        eo.cue[68] = -481880244;
        eo.cue[69] = 168859052;
        eo.cue[70] = 2055587870;
        eo.cue[71] = -353572653;
        eo.cue[72] = -398359103;
        eo.cue[73] = 2109981251;
        eo.cue[74] = -135609308;
        eo.cue[75] = -1659141022;
        eo.cue[76] = -1678635179;
        eo.cue[77] = -538284957;
        eo.cue[78] = 1502777731;
        eo.cue[79] = 1961691632;
        eo.cue[80] = 661331741;
        eo.cue[81] = 891674411;
        eo.cue[82] = 585721560;
        eo.cue[83] = -1489893587;
        eo.cue[84] = 288148638;
        eo.cue[85] = 1084133747;
        eo.cue[86] = -1114922571;
        eo.cue[87] = -939971878;
        eo.cue[88] = -818632285;
        eo.cue[89] = 2132492560;
        eo.cue[90] = 1061911187;
        eo.cue[91] = -1214637137;
        eo.cue[92] = 1138497872;
        eo.cue[93] = -1302856106;
        eo.cue[94] = -832797577;
        eo.cue[95] = -977015842;
        eo.cue[96] = 1173094282;
        eo.cue[97] = 721649275;
        eo.cue[98] = -710424699;
        eo.cue[99] = -1081791312;
    }

    private static /* synthetic */ void dqu() {
        eo.cuw[0] = 2877882004727288384L;
        eo.cuw[1] = -2973272553344933823L;
        eo.cuw[2] = -5103189486629980075L;
        eo.cuw[3] = -203357358807971747L;
        eo.cuw[4] = -6116472659571937155L;
        eo.cuw[5] = 6436299086894693772L;
        eo.cuw[6] = 88894679988218843L;
        eo.cuw[7] = 4771346168723279193L;
        eo.cuw[8] = -8543753528989473810L;
        eo.cuw[9] = 1295937541046359291L;
        eo.cuw[10] = 2178147389288462989L;
        eo.cuw[11] = -9071737628023876369L;
        eo.cuw[12] = -2021032981385605511L;
        eo.cuw[13] = -5560465411853947047L;
        eo.cuw[14] = -9126463096419775579L;
        eo.cuw[15] = 7534231271251549382L;
        eo.cuw[16] = 4647093017189492493L;
        eo.cuw[17] = -113764680384504984L;
        eo.cuw[18] = -844363109105696683L;
        eo.cuw[19] = -8863214594715638006L;
        eo.cuw[20] = -4738868311273380562L;
        eo.cuw[21] = -1875084787228240243L;
        eo.cuw[22] = -3038884187771682852L;
        eo.cuw[23] = -1942539718571609422L;
        eo.cuw[24] = -52333281895805685L;
        eo.cuw[25] = -8830341280039980688L;
        eo.cuw[26] = 2255422242545697013L;
        eo.cuw[27] = 146718464798461315L;
        eo.cuw[28] = 4055446163204511785L;
        eo.cuw[29] = -3132230183680625538L;
        eo.cuw[30] = -5296220571483105821L;
        eo.cuw[31] = -8886173402260773722L;
        eo.cuw[32] = -8397342604406194196L;
        eo.cuw[33] = -5972380962121156496L;
        eo.cuw[34] = -4628730616254215371L;
        eo.cuw[35] = -147253200185952978L;
        eo.cuw[36] = -5306838316292205212L;
        eo.cuw[37] = 6095804206421218405L;
        eo.cuw[38] = -1870019614624988L;
        eo.cuw[39] = -7897326368189527340L;
        eo.cuw[40] = 6401979516913197751L;
        eo.cuw[41] = 6564451709554496668L;
        eo.cuw[42] = -2193940650585270456L;
        eo.cuw[43] = 5002269422745925035L;
        eo.cuw[44] = -460366441022112289L;
        eo.cuw[45] = -707468968763610938L;
        eo.cuw[46] = 3399575836519584567L;
        eo.cuw[47] = -7657349655986229697L;
        eo.cuw[48] = 8451038148484025710L;
        eo.cuw[49] = -7209794054054564039L;
        eo.cuw[50] = -3121755180718563293L;
        eo.cuw[51] = -6375741471546298380L;
        eo.cuw[52] = 6417034335129444453L;
        eo.cuw[53] = 945437617060478320L;
        eo.cuw[54] = -6378484840144336256L;
        eo.cuw[55] = 6551600274090034829L;
        eo.cuw[56] = 8473860281234594387L;
        eo.cuw[57] = 7406986667016571252L;
        eo.cuw[58] = -5292107822750179915L;
        eo.cuw[59] = -4673687519180134203L;
        eo.cuw[60] = -3156177006756066452L;
        eo.cuw[61] = 2626851516954416644L;
        eo.cuw[62] = -6077476536580075896L;
        eo.cuw[63] = 5578941977060678585L;
        eo.cuw[64] = 2627255672845505942L;
        eo.cuw[65] = -179965916089192945L;
        eo.cuw[66] = 2148177633988158178L;
        eo.cuw[67] = -6911889663067038138L;
        eo.cuw[68] = 6335389753351244829L;
        eo.cuw[69] = -2867956599211867787L;
        eo.cuw[70] = 4365725919433891008L;
        eo.cuw[71] = -1326714820495768200L;
        eo.cuw[72] = -3237232231207188749L;
        eo.cuw[73] = -8324408934258129595L;
        eo.cuw[74] = -1513154232491626004L;
        eo.cuw[75] = -2250057501983059563L;
        eo.cuw[76] = -5292319306991976915L;
        eo.cuw[77] = 1172983930066782337L;
        eo.cuw[78] = 8489053505108673112L;
        eo.cuw[79] = -3294633593006123538L;
        eo.cuw[80] = 3272799929449547373L;
        eo.cuw[81] = -7173661302348161780L;
        eo.cuw[82] = -532423247793231304L;
        eo.cuw[83] = -6208299246331043824L;
        eo.cuw[84] = 2016737796221996098L;
        eo.cuw[85] = -5687141827643077273L;
        eo.cuw[86] = -7408387849526710710L;
        eo.cuw[87] = 6952210542251296967L;
        eo.cuw[88] = 2848281115387174649L;
        eo.cuw[89] = -9210967534401010236L;
        eo.cuw[90] = -5406843610172774041L;
        eo.cuw[91] = 8795964312252345055L;
        eo.cuw[92] = 2437416159484730915L;
        eo.cuw[93] = -104456741086806846L;
        eo.cuw[94] = 7709058754211954292L;
        eo.cuw[95] = 259651613020307848L;
        eo.cuw[96] = 1886074148527964792L;
        eo.cuw[97] = 870738075686737980L;
        eo.cuw[98] = -5317367368982100597L;
        eo.cuw[99] = 7845706575199070332L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public eo() {
        var2_1 /* !! */  = eo.b;
        super("AutoLeave", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u044b\u0445\u043e\u0434\u0438\u0442 \u0441 \u0440\u0435\u0436\u0438\u043c\u0430 \u0435\u0441\u043b\u0438 \u0440\u044f\u0434\u043e\u043c \u0438\u0433\u0440\u043e\u043a", du.MISC);
        this.leaveType = new kf("\u0422\u0438\u043f \u0432\u044b\u0445\u043e\u0434\u0430", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u0442\u0438\u043f \u0432\u044b\u0445\u043e\u0434\u0430", "Hub", new String[]{"Hub", "Main Menu"});
        this.triggerSetting = new ke("\u0422\u0440\u0438\u0433\u0433\u0435\u0440\u044b", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435, \u0432 \u043a\u0430\u043a\u0438\u0445 \u0441\u043b\u0443\u0447\u0430\u044f\u0445 \u043f\u0440\u043e\u0438\u0437\u043e\u0439\u0434\u0435\u0442 \u0432\u044b\u0445\u043e\u0434").value(new String[]{"Players", "Staff"}).selected(new String[]{"Players", "Staff"});
        this.distanceSetting = new kg("\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043b\u044f \u0430\u043a\u0442\u0438\u0432\u0430\u0446\u0438\u0438 \u0430\u0432\u0442\u043e-\u0432\u044b\u0445\u043e\u0434\u0430", (float)eo.cug("cuh", cuc(int ), (int)0)).range((int)eo.cug("cuj", cui(int ), (int)1), (int)eo.cug("cuk", cui(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((eo)this));
        this.settings(new jx[]{this.leaveType, this.triggerSetting, this.distanceSetting});
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block9: do {
            switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
                case 0: {
                    var2_1 /* !! */  = (int)eo.cug("cum", cui(int ), (int)3);
                    ** GOTO lbl-1000
                }
                case 2: {
                    ** GOTO lbl26
                }
                case 4: {
                    var2_1 /* !! */  = (int)eo.cug("cur", cui(int ), (int)7);
                }
                case 1: {
                    var2_1 /* !! */  = (int)eo.cug("cun", cui(int ), (int)4);
                    cfr_temp_0 = 3;
                    continue block9;
                }
                case 6: lbl-1000:
                // 2 sources

                {
                    var2_1 /* !! */  = (int)eo.cug("cut", cui(int ), (int)9);
lbl26:
                    // 2 sources

                    var2_1 /* !! */  = (int)eo.cug("cuo", cui(int ), (int)5);
                }
                case 3: {
                    var2_1 /* !! */  = (int)eo.cug("cuq", cui(int ), (int)6);
                }
                case 5: 
            }
            break;
        } while (true);
        while (true) {
            var2_1 /* !! */  = (int)eo.cug("cus", cui(int ), (int)8);
        }
    }

    static {
        cud = new int[146];
        cue = new int[146];
        eo.dqq();
        eo.dqr();
        eo.dqs();
        eo.dqt();
        cuw = new long[115];
        cux = new long[115];
        eo.dqu();
        eo.dqv();
        eo.dqw();
        eo.dqx();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$onTick$1(class_742 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eo.n - eo.cug("dod", cuv(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eo.cug("doe", cui(int ), (int)111)) break;
            v0 /* !! */  = (long)eo.cug("dof", cui(int ), (int)112);
        }
        var4_2 = eo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eo.n - eo.cug("dog", cuv(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eo.cug("doh", cui(int ), (int)113)) break;
            v1 /* !! */  = (long)eo.cug("doi", cui(int ), (int)114);
        }
        var3_3 /* !! */  = eo.b;
        v2 /* !! */  = eo.n;
        if (true) ** GOTO lbl19
        block40: while (true) {
            v2 /* !! */  = (long)(eo.cug("dok", cuv(int ), (int)88) - eo.cug("doj", cuv(int ), (int)87));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -571416556: {
                    continue block40;
                }
                case 1471607480: {
                    break block40;
                }
            }
            break;
        }
        var2_4 = eo.a;
        if (var4_2) {
            throw null;
lbl27:
            // 6 sources

            return (boolean)eo.cug("dol", cui(int ), (int)115);
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = eo.n - eo.cug("dom", cuv(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == eo.cug("don", cui(int ), (int)116)) break;
                    v3 /* !! */  = (long)eo.cug("doo", cui(int ), (int)117);
                }
                v4 /* !! */  = eo.n;
                if (true) ** GOTO lbl44
                block43: while (true) {
                    v4 /* !! */  = (long)(v5 - eo.cug("dop", cuv(int ), (int)90));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1757956151: {
                            v5 = eo.cug("doq", cuv(int ), (int)91);
                            continue block43;
                        }
                        case 97112900: {
                            v5 = eo.cug("dor", cuv(int ), (int)92);
                            continue block43;
                        }
                        case 1471607480: {
                            break block43;
                        }
                    }
                    break;
                }
                v6 = eo.mc.field_1724;
                v7 /* !! */  = eo.n;
                if (true) ** GOTO lbl58
                block44: while (true) {
                    v7 /* !! */  = (long)(eo.cug("dot", cuv(int ), (int)94) - eo.cug("dos", cuv(int ), (int)93));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 210063535: {
                            continue block44;
                        }
                        case 1471607480: {
                            break block44;
                        }
                    }
                    break;
                }
                v8 = v6.method_5739((class_1297)var1_1);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = eo.n - eo.cug("dou", cuv(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == eo.cug("dov", cui(int ), (int)118)) break;
                    v9 /* !! */  = (long)eo.cug("dow", cui(int ), (int)119);
                }
                v10 /* !! */  = eo.n;
                if (true) ** GOTO lbl74
                block46: while (true) {
                    v10 /* !! */  = (long)(v11 - eo.cug("dox", cuv(int ), (int)96));
lbl74:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1516256337: {
                            v11 = eo.cug("doy", cuv(int ), (int)97);
                            continue block46;
                        }
                        case 1471607480: {
                            break block46;
                        }
                        case 1623354002: {
                            v11 = eo.cug("doz", cuv(int ), (int)98);
                            continue block46;
                        }
                    }
                    break;
                }
                if (!(v8 < this.distanceSetting.getValue())) ** GOTO lbl117
                if (var2_4) ** GOTO lbl27
                v12 /* !! */  = eo.n;
                if (true) ** GOTO lbl89
                block47: while (true) {
                    v12 /* !! */  = (long)(eo.cug("dpb", cuv(int ), (int)100) - eo.cug("dpa", cuv(int ), (int)99));
lbl89:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -807869710: {
                            continue block47;
                        }
                        case 1471607480: {
                            break block47;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = eo.n - eo.cug("dpc", cuv(int ), (int)101)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == eo.cug("dpd", cui(int ), (int)120)) break;
                    v13 /* !! */  = (long)eo.cug("dpe", cui(int ), (int)121);
                }
                if (eo.mc.field_1724 == var1_1) ** GOTO lbl117
                if (var2_4) ** GOTO lbl27
                v14 /* !! */  = eo.n;
                if (true) ** GOTO lbl106
                block49: while (true) {
                    v14 /* !! */  = (long)(eo.cug("dpg", cuv(int ), (int)103) - eo.cug("dpf", cuv(int ), (int)102));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 513710856: {
                            continue block49;
                        }
                        case 1471607480: {
                            break block49;
                        }
                    }
                    break;
                }
                if (dl.isFriend((class_1297)var1_1)) ** GOTO lbl117
                if (var2_4) ** GOTO lbl27
                v15 = eo.cug("dph", cui(int ), (int)122);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
lbl117:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v15 = eo.cug("dpi", cui(int ), (int)123);
lbl120:
                // 2 sources

                return (boolean)v15;
            }
            case 0: {
                var3_3 /* !! */  = (int)eo.cug("dpj", cui(int ), (int)124);
                if (!var4_2) break;
                throw null;
            }
lbl125:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)eo.cug("dpk", cui(int ), (int)125);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl139
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)eo.cug("dpl", cui(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
            }
lbl135:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)eo.cug("dpm", cui(int ), (int)127);
                if (var4_2) {
                    throw null;
                }
            }
lbl139:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)eo.cug("dpn", cui(int ), (int)128);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)eo.cug("dpo", cui(int ), (int)129);
                if (!var4_2) ** GOTO lbl135
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)eo.cug("dpp", cui(int ), (int)130);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)eo.cug("dpq", cui(int ), (int)131);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)eo.cug("dpr", cui(int ), (int)132);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)eo.cug("dps", cui(int ), (int)133);
        ** while (!var4_2)
lbl162:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dqt() {
        eo.cue[100] = 1012569182;
        eo.cue[101] = 1660410872;
        eo.cue[102] = -1531204855;
        eo.cue[103] = -987573502;
        eo.cue[104] = 1118534939;
        eo.cue[105] = -1847645637;
        eo.cue[106] = 367920332;
        eo.cue[107] = -297888621;
        eo.cue[108] = 905819792;
        eo.cue[109] = 371297541;
        eo.cue[110] = -837370785;
        eo.cue[111] = 1023490823;
        eo.cue[112] = -1730589434;
        eo.cue[113] = -1571775272;
        eo.cue[114] = 711217925;
        eo.cue[115] = -1567979751;
        eo.cue[116] = 1933293437;
        eo.cue[117] = 476507646;
        eo.cue[118] = 1204822012;
        eo.cue[119] = -1992447521;
        eo.cue[120] = -1389874928;
        eo.cue[121] = -1557368737;
        eo.cue[122] = -911956850;
        eo.cue[123] = 868022516;
        eo.cue[124] = 378284635;
        eo.cue[125] = 695149618;
        eo.cue[126] = 1643140067;
        eo.cue[127] = 158084984;
        eo.cue[128] = -1666217250;
        eo.cue[129] = 1194640126;
        eo.cue[130] = 1400935153;
        eo.cue[131] = -1065325957;
        eo.cue[132] = 430821600;
        eo.cue[133] = 1274709968;
        eo.cue[134] = -253119467;
        eo.cue[135] = -897137598;
        eo.cue[136] = -1931186069;
        eo.cue[137] = 1685543234;
        eo.cue[138] = -1456049643;
        eo.cue[139] = 727076842;
        eo.cue[140] = 55229655;
        eo.cue[141] = -2038099998;
        eo.cue[142] = -1081033692;
        eo.cue[143] = -179015699;
        eo.cue[144] = -856315238;
        eo.cue[145] = 1770177859;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$onTick$2(class_742 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eo.n - eo.cug("dmr", cuv(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eo.cug("dms", cui(int ), (int)94)) break;
            v0 /* !! */  = (long)eo.cug("dmt", cui(int ), (int)95);
        }
        var4_2 = eo.c;
        v1 /* !! */  = eo.n;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - eo.cug("dmu", cuv(int ), (int)65));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1839179802: {
                    v2 = eo.cug("dmv", cuv(int ), (int)66);
                    continue block26;
                }
                case 1471607480: {
                    break block26;
                }
                case 1547320400: {
                    v2 = eo.cug("dmw", cuv(int ), (int)67);
                    continue block26;
                }
            }
            break;
        }
        var3_3 = eo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eo.n - eo.cug("dmx", cuv(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eo.cug("dmy", cui(int ), (int)96)) break;
            v3 /* !! */  = (long)eo.cug("dmz", cui(int ), (int)97);
        }
        var2_4 = eo.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        v4 /* !! */  = eo.n;
        if (true) ** GOTO lbl36
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - eo.cug("dna", cuv(int ), (int)69));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 777516475: {
                    v5 = eo.cug("dnb", cuv(int ), (int)70);
                    continue block29;
                }
                case 859792292: {
                    v5 = eo.cug("dnc", cuv(int ), (int)71);
                    continue block29;
                }
                case 1471607480: {
                    break block29;
                }
                case 2053253484: {
                    v5 = eo.cug("dnd", cuv(int ), (int)72);
                    continue block29;
                }
            }
            break;
        }
        v6 = var1_1.method_5477();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = eo.n - eo.cug("dne", cuv(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == eo.cug("dnf", cui(int ), (int)98)) break;
            v7 /* !! */  = (long)eo.cug("dng", cui(int ), (int)99);
        }
        v8 = v6.method_27661();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = eo.n - eo.cug("dnh", cuv(int ), (int)74)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == eo.cug("dni", cui(int ), (int)100)) break;
            v9 /* !! */  = (long)eo.cug("dnj", cui(int ), (int)101);
        }
        v10 /* !! */  = eo.n;
        if (true) ** GOTO lbl64
        block32: while (true) {
            v10 /* !! */  = (long)(eo.cug("dnl", cuv(int ), (int)76) - eo.cug("dnk", cuv(int ), (int)75));
lbl64:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 959408312: {
                    continue block32;
                }
                case 1471607480: {
                    break block32;
                }
            }
            break;
        }
        v11 = eo.mc.field_1724;
        v12 /* !! */  = eo.n;
        if (true) ** GOTO lbl74
        block33: while (true) {
            v12 /* !! */  = (long)(eo.cug("dnn", cuv(int ), (int)78) - eo.cug("dnm", cuv(int ), (int)77));
lbl74:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 1471607480: {
                    break block33;
                }
                case 1724497605: {
                    continue block33;
                }
            }
            break;
        }
        v13 = v11.method_5739((class_1297)var1_1);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = eo.n - eo.cug("dno", cuv(int ), (int)79)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == eo.cug("dnp", cui(int ), (int)102)) break;
            v14 /* !! */  = (long)eo.cug("dnq", cui(int ), (int)103);
        }
        v15 = " - \u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u0440\u044f\u0434\u043e\u043c " + v13 + "\u043c";
        v16 /* !! */  = eo.n;
        if (true) ** GOTO lbl90
        block35: while (true) {
            v16 /* !! */  = (long)(v17 - eo.cug("dnr", cuv(int ), (int)80));
lbl90:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case 379187018: {
                    v17 = eo.cug("dns", cuv(int ), (int)81);
                    continue block35;
                }
                case 470824566: {
                    v17 = eo.cug("dnt", cuv(int ), (int)82);
                    continue block35;
                }
                case 1303460937: {
                    v17 = eo.cug("dnu", cuv(int ), (int)83);
                    continue block35;
                }
                case 1471607480: {
                    break block35;
                }
            }
            break;
        }
        v18 = v8.method_27693(v15);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_5 = eo.n - eo.cug("dnv", cuv(int ), (int)84)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == eo.cug("dnw", cui(int ), (int)104)) break;
            v19 /* !! */  = (long)eo.cug("dnx", cui(int ), (int)105);
        }
        this.leave((class_2561)v18);
        if (!var2_4) ** break;
        ** while (true)
    }

    private static /* synthetic */ void dqv() {
        eo.cuw[100] = 8602183124464177628L;
        eo.cuw[101] = 165596047135132907L;
        eo.cuw[102] = 4943790982221712044L;
        eo.cuw[103] = 7911734757945499681L;
        eo.cuw[104] = 5065969438849448079L;
        eo.cuw[105] = -5347243600512117353L;
        eo.cuw[106] = -3148946864462010831L;
        eo.cuw[107] = 5214290570434576790L;
        eo.cuw[108] = 5363483219349756505L;
        eo.cuw[109] = 6913834979500703780L;
        eo.cuw[110] = -5723282123000116454L;
        eo.cuw[111] = -1750232751848242110L;
        eo.cuw[112] = 4491855104250176844L;
        eo.cuw[113] = 5179311502213819725L;
        eo.cuw[114] = -1861443254899248468L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eo.n - eo.cug("cuy", cuv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eo.cug("cuz", cui(int ), (int)10)) break;
            v0 /* !! */  = (long)eo.cug("cva", cui(int ), (int)11);
        }
        var4_2 = eo.c;
        v1 /* !! */  = eo.n;
        if (true) ** GOTO lbl11
        block45: while (true) {
            v1 /* !! */  = (long)(v2 - eo.cug("cvb", cuv(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1301160418: {
                    v2 = eo.cug("cvc", cuv(int ), (int)2);
                    continue block45;
                }
                case -423258641: {
                    v2 = eo.cug("cvd", cuv(int ), (int)3);
                    continue block45;
                }
                case 1471607480: {
                    break block45;
                }
            }
            break;
        }
        var3_3 /* !! */  = eo.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = eo.n - eo.cug("cvf", cuv(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == eo.cug("cvg", cui(int ), (int)12)) break;
                    v3 /* !! */  = (long)eo.cug("cvm", cui(int ), (int)13);
                }
                var2_4 = eo.a;
                if (var4_2) {
                    throw null;
lbl32:
                    // 6 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = eo.n - eo.cug("cwb", cuv(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eo.cug("cwc", cui(int ), (int)14)) break;
                    v4 /* !! */  = (long)eo.cug("cwd", cui(int ), (int)15);
                }
                if (!mq.isPvp()) ** GOTO lbl43
                if (var2_4) ** GOTO lbl32
                return;
lbl43:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = eo.n - eo.cug("cwe", cuv(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == eo.cug("cwf", cui(int ), (int)16)) break;
                    v5 /* !! */  = (long)eo.cug("cwg", cui(int ), (int)17);
                }
                v6 /* !! */  = eo.n;
                if (true) ** GOTO lbl53
                block50: while (true) {
                    v6 /* !! */  = (long)(v7 - eo.cug("cwh", cuv(int ), (int)7));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1685319917: {
                            v7 = eo.cug("cwi", cuv(int ), (int)8);
                            continue block50;
                        }
                        case 237044274: {
                            v7 = eo.cug("cwj", cuv(int ), (int)9);
                            continue block50;
                        }
                        case 1471607480: {
                            break block50;
                        }
                        case 1680936750: {
                            v7 = eo.cug("cwk", cuv(int ), (int)10);
                            continue block50;
                        }
                    }
                    break;
                }
                if (!this.triggerSetting.isSelected("Players")) ** GOTO lbl144
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = eo.n - eo.cug("cwl", cuv(int ), (int)11)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == eo.cug("cwm", cui(int ), (int)18)) break;
                    v8 /* !! */  = (long)eo.cug("cwn", cui(int ), (int)19);
                }
                v9 /* !! */  = eo.n;
                if (true) ** GOTO lbl76
                block52: while (true) {
                    v9 /* !! */  = (long)(eo.cug("cwp", cuv(int ), (int)13) - eo.cug("cwo", cuv(int ), (int)12));
lbl76:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1471607480: {
                            break block52;
                        }
                        case 1593953163: {
                            continue block52;
                        }
                    }
                    break;
                }
                v10 = eo.mc.field_1687;
                v11 /* !! */  = eo.n;
                if (true) ** GOTO lbl86
                block53: while (true) {
                    v11 /* !! */  = (long)(eo.cug("cwr", cuv(int ), (int)15) - eo.cug("cwq", cuv(int ), (int)14));
lbl86:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 674375819: {
                            continue block53;
                        }
                        case 1471607480: {
                            break block53;
                        }
                    }
                    break;
                }
                v12 = v10.method_18456();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = eo.n - eo.cug("cws", cuv(int ), (int)16)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == eo.cug("cwt", cui(int ), (int)20)) break;
                    v13 /* !! */  = (long)eo.cug("cwu", cui(int ), (int)21);
                }
                v14 = v12.stream();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = eo.n - eo.cug("cwv", cuv(int ), (int)17)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == eo.cug("cww", cui(int ), (int)22)) break;
                    v15 /* !! */  = (long)eo.cug("cwx", cui(int ), (int)23);
                }
                v16 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$1(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)((eo)this);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = eo.n - eo.cug("cwy", cuv(int ), (int)18)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == eo.cug("cwz", cui(int ), (int)24)) break;
                    v17 /* !! */  = (long)eo.cug("cxa", cui(int ), (int)25);
                }
                v18 = v14.filter(v16);
                v19 /* !! */  = eo.n;
                if (true) ** GOTO lbl114
                block57: while (true) {
                    v19 /* !! */  = (long)(v20 - eo.cug("cxb", cuv(int ), (int)19));
lbl114:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 917624386: {
                            v20 = eo.cug("cxc", cuv(int ), (int)20);
                            continue block57;
                        }
                        case 1020566051: {
                            v20 = eo.cug("cxd", cuv(int ), (int)21);
                            continue block57;
                        }
                        case 1471607480: {
                            break block57;
                        }
                        case 2029826126: {
                            v20 = eo.cug("cxe", cuv(int ), (int)22);
                            continue block57;
                        }
                    }
                    break;
                }
                v21 = v18.findFirst();
                v22 /* !! */  = eo.n;
                if (true) ** GOTO lbl131
                block58: while (true) {
                    v22 /* !! */  = (long)(eo.cug("cxg", cuv(int ), (int)24) - eo.cug("cxf", cuv(int ), (int)23));
lbl131:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1616855624: {
                            continue block58;
                        }
                        case 1471607480: {
                            break block58;
                        }
                    }
                    break;
                }
                v23 = (Consumer<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$onTick$2(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)V)((eo)this);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = eo.n - eo.cug("cxh", cuv(int ), (int)25)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == eo.cug("cxi", cui(int ), (int)26)) break;
                    v24 /* !! */  = (long)eo.cug("cxj", cui(int ), (int)27);
                }
                v21.ifPresent(v23);
                if (var2_4) ** GOTO lbl32
lbl144:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)eo.cug("cxk", cui(int ), (int)28);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl152:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)eo.cug("cxl", cui(int ), (int)29);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl157:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)eo.cug("cxn", cui(int ), (int)30);
                if (var4_2) {
                    throw null;
                }
            }
lbl161:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)eo.cug("cxt", cui(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl166:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)eo.cug("cxy", cui(int ), (int)32);
                if (!var4_2) ** GOTO lbl161
                throw null;
            }
lbl170:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)eo.cug("cya", cui(int ), (int)33);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
lbl174:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)eo.cug("cyf", cui(int ), (int)34);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)eo.cug("cyg", cui(int ), (int)35);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)eo.cug("cyk", cui(int ), (int)36);
                    if (!var4_2) ** GOTO lbl174
                    throw null;
                }
            }
lbl187:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)eo.cug("cym", cui(int ), (int)37);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)eo.cug("cyo", cui(int ), (int)38);
                if (!var4_2) ** GOTO lbl187
                throw null;
            }
            case 11: {
                do {
                    var3_3 /* !! */  = (int)eo.cug("cyr", cui(int ), (int)39);
                } while (!var4_2);
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)eo.cug("dbh", cui(int ), (int)40);
        ** while (!var4_2)
lbl203:
        // 1 sources

        throw null;
    }
}

