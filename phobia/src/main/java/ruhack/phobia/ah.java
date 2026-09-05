/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ah {
    public static final int b;
    private static long[] chgw;
    private static int[] chge;
    private static long[] chgy;
    private final Set<String> blocks;
    public static final long fv = -6151444672259692308L;
    public static final boolean c;
    private static int[] chgf;
    private static ah instance;
    private final Gson gson;
    public static final boolean a;
    private final Path configPath;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean removeBlock(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chmy", chgu(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ah.chgg("chmz", chga(int ), (int)66)) break;
            v0 /* !! */  = (long)ah.chgg("chnb", chga(int ), (int)67);
        }
        var5_2 = ah.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chnc", chgu(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ah.chgg("chnd", chga(int ), (int)68)) break;
            v1 /* !! */  = (long)ah.chgg("chne", chga(int ), (int)69);
        }
        var4_3 /* !! */  = ah.b;
        v2 /* !! */  = ah.fv;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - ah.chgg("chnf", chgu(int ), (int)39));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1904350996: {
                    break block26;
                }
                case 673300161: {
                    v3 = ah.chgg("chnh", chgu(int ), (int)40);
                    continue block26;
                }
                case 991683950: {
                    v3 = ah.chgg("chni", chgu(int ), (int)41);
                    continue block26;
                }
            }
            break;
        }
        var3_4 = ah.a;
        if (var5_2) {
            throw null;
lbl31:
            // 2 sources

            return (boolean)ah.chgg("chnj", chga(int ), (int)70);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl31
                v4 /* !! */  = ah.fv;
                if (true) ** GOTO lbl41
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - ah.chgg("chnn", chgu(int ), (int)42));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1904350996: {
                            break block28;
                        }
                        case -696874627: {
                            v5 = ah.chgg("chno", chgu(int ), (int)43);
                            continue block28;
                        }
                        case 830733380: {
                            v5 = ah.chgg("chnp", chgu(int ), (int)44);
                            continue block28;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ah.fv;
                if (true) ** GOTO lbl54
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - ah.chgg("chnq", chgu(int ), (int)45));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1937333763: {
                            v7 = ah.chgg("chnr", chgu(int ), (int)46);
                            continue block29;
                        }
                        case -1904350996: {
                            break block29;
                        }
                        case -1793583749: {
                            v7 = ah.chgg("chns", chgu(int ), (int)47);
                            continue block29;
                        }
                        case -1731170361: {
                            v7 = ah.chgg("chnx", chgu(int ), (int)48);
                            continue block29;
                        }
                    }
                    break;
                }
                var2_5 = this.blocks.remove(var1_1);
                if (var3_4 || var3_4) ** continue;
                return var2_5;
            }
lbl69:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ah.chgg("chnz", chga(int ), (int)71);
                if (!var5_2) break;
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)ah.chgg("chob", chga(int ), (int)72);
                if (var5_2) {
                    throw null;
                }
            }
lbl77:
            // 5 sources

            case 2: {
                var4_3 /* !! */  = (int)ah.chgg("chod", chga(int ), (int)73);
                if (!var5_2) ** GOTO lbl69
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)ah.chgg("choe", chga(int ), (int)74);
                if (!var5_2) ** GOTO lbl77
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)ah.chgg("chof", chga(int ), (int)75);
                if (!var5_2) ** GOTO lbl77
                throw null;
            }
            case 5: 
        }
        do {
            var4_3 /* !! */  = (int)ah.chgg("choh", chga(int ), (int)76);
        } while (!var5_2);
        throw null;
    }

    private static /* synthetic */ void cioe() {
        ah.chgw[100] = 4971004216694201848L;
        ah.chgw[101] = -1179797886149762908L;
        ah.chgw[102] = 4354715661068165622L;
        ah.chgw[103] = -4074064069336332537L;
        ah.chgw[104] = 8700566969199976641L;
        ah.chgw[105] = 6275217006121032152L;
        ah.chgw[106] = -6287410434273882111L;
        ah.chgw[107] = 7916696863047375898L;
        ah.chgw[108] = -7321162458742127335L;
        ah.chgw[109] = 5736273400275661303L;
        ah.chgw[110] = -6506853740634552554L;
        ah.chgw[111] = 6328026609827613038L;
        ah.chgw[112] = 7373978827059610360L;
        ah.chgw[113] = -5352416809932390860L;
        ah.chgw[114] = -7101570644784604639L;
        ah.chgw[115] = -4308283351089344833L;
        ah.chgw[116] = -56828300851247079L;
        ah.chgw[117] = 6825442477146677968L;
        ah.chgw[118] = 4856743325105606626L;
        ah.chgw[119] = 5470949202827802418L;
        ah.chgw[120] = -135528391657097495L;
        ah.chgw[121] = 3213970700470040574L;
        ah.chgw[122] = -5187853501428703006L;
        ah.chgw[123] = 5162748011526115288L;
        ah.chgw[124] = 6856208756769830033L;
        ah.chgw[125] = -786068244825022181L;
        ah.chgw[126] = -5341288301421917262L;
        ah.chgw[127] = -2759392523257862943L;
        ah.chgw[128] = 2320062374621216323L;
        ah.chgw[129] = 7855906831142226000L;
        ah.chgw[130] = -6439653403652617171L;
        ah.chgw[131] = -7668529077981092607L;
        ah.chgw[132] = 3432108065475659377L;
        ah.chgw[133] = -7066969634748048885L;
        ah.chgw[134] = -6355910952993459485L;
        ah.chgw[135] = -2180465589870599824L;
        ah.chgw[136] = 5719066195208164408L;
        ah.chgw[137] = 140063217374637765L;
        ah.chgw[138] = 8905953043550182336L;
        ah.chgw[139] = -1572882009447635158L;
        ah.chgw[140] = 369670174714495471L;
        ah.chgw[141] = 7128517401545385983L;
        ah.chgw[142] = 3310391499886349149L;
        ah.chgw[143] = 7011961299525060691L;
        ah.chgw[144] = -8779783820520824822L;
        ah.chgw[145] = -6434250871119436620L;
        ah.chgw[146] = 4389156589449253061L;
        ah.chgw[147] = -955974304190895939L;
        ah.chgw[148] = -7419577806916705842L;
        ah.chgw[149] = -5947146758680023546L;
        ah.chgw[150] = 7746639671272272354L;
        ah.chgw[151] = 8885602094139394629L;
        ah.chgw[152] = 8238840025314237891L;
        ah.chgw[153] = -6725083037145610964L;
        ah.chgw[154] = -5483767623824285022L;
        ah.chgw[155] = -7689265993853381120L;
        ah.chgw[156] = 2304310572082443163L;
        ah.chgw[157] = -9134770018019675908L;
        ah.chgw[158] = 1901537649268756989L;
        ah.chgw[159] = 1011334851899546465L;
        ah.chgw[160] = -5055325053676701493L;
        ah.chgw[161] = -6066784684554023512L;
        ah.chgw[162] = -6655312427283234560L;
        ah.chgw[163] = 8392838270175478865L;
        ah.chgw[164] = 7439879932484602033L;
        ah.chgw[165] = -8910632532262401086L;
        ah.chgw[166] = -789724443180826852L;
        ah.chgw[167] = -4833266015212637846L;
        ah.chgw[168] = -1249644790466369163L;
        ah.chgw[169] = -4829890263194893441L;
        ah.chgw[170] = -1750040968000132783L;
        ah.chgw[171] = 3565147112781870855L;
        ah.chgw[172] = 4143921153291606869L;
        ah.chgw[173] = -8975508316026008276L;
        ah.chgw[174] = -2991582426211599809L;
        ah.chgw[175] = -8055598743014940397L;
        ah.chgw[176] = -6969552147730171460L;
        ah.chgw[177] = 6433238158514289881L;
        ah.chgw[178] = -8237394057894430911L;
        ah.chgw[179] = 7544455086323022106L;
        ah.chgw[180] = 3572939092317139816L;
        ah.chgw[181] = -2308758576957679982L;
        ah.chgw[182] = 6943317345289101829L;
        ah.chgw[183] = -6610184825530743824L;
        ah.chgw[184] = 6719950710285811982L;
        ah.chgw[185] = 9125983504852557994L;
        ah.chgw[186] = 570783004666954546L;
        ah.chgw[187] = 7470987538635972182L;
        ah.chgw[188] = -3633128171693814655L;
        ah.chgw[189] = 2435191552761444791L;
        ah.chgw[190] = 8363946763894814612L;
        ah.chgw[191] = 4430616072631590378L;
        ah.chgw[192] = 6518032081074167891L;
        ah.chgw[193] = 1353258779220183180L;
        ah.chgw[194] = 646116087622579052L;
        ah.chgw[195] = -2161426157297835761L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void clearAndSave() {
        v0 /* !! */  = ah.fv;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - ah.chgg("chso", chgu(int ), (int)68));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1904350996: {
                    break block31;
                }
                case 912884290: {
                    v1 = ah.chgg("chsp", chgu(int ), (int)69);
                    continue block31;
                }
                case 1169030071: {
                    v1 = ah.chgg("chsq", chgu(int ), (int)70);
                    continue block31;
                }
            }
            break;
        }
        var3_1 = ah.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chsr", chgu(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ah.chgg("chss", chga(int ), (int)122)) break;
            v2 /* !! */  = (long)ah.chgg("chst", chga(int ), (int)123);
        }
        var2_2 /* !! */  = ah.b;
        v3 /* !! */  = ah.fv;
        if (true) ** GOTO lbl26
        block33: while (true) {
            v3 /* !! */  = (long)(v4 - ah.chgg("chsu", chgu(int ), (int)72));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1904350996: {
                    break block33;
                }
                case -416739379: {
                    v4 = ah.chgg("chsv", chgu(int ), (int)73);
                    continue block33;
                }
                case -82511243: {
                    v4 = ah.chgg("chsw", chgu(int ), (int)74);
                    continue block33;
                }
                case 594159641: {
                    v4 = ah.chgg("chsy", chgu(int ), (int)75);
                    continue block33;
                }
            }
            break;
        }
        var1_3 = ah.a;
        if (var3_1) {
            throw null;
lbl41:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl41
        v5 /* !! */  = ah.fv;
        if (true) ** GOTO lbl48
        block35: while (true) {
            v5 /* !! */  = (long)(ah.chgg("chtc", chgu(int ), (int)77) - ah.chgg("chtb", chgu(int ), (int)76));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1904350996: {
                    break block35;
                }
                case -693966429: {
                    continue block35;
                }
            }
            break;
        }
        this.clear();
        if (var1_3 || var1_3) ** GOTO lbl41
        v6 /* !! */  = ah.fv;
        if (true) ** GOTO lbl59
        block36: while (true) {
            v6 /* !! */  = (long)(v7 - ah.chgg("chtd", chgu(int ), (int)78));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1904350996: {
                    break block36;
                }
                case -1083967131: {
                    v7 = ah.chgg("chte", chgu(int ), (int)79);
                    continue block36;
                }
                case -758213011: {
                    v7 = ah.chgg("chtf", chgu(int ), (int)80);
                    continue block36;
                }
                case 1465910424: {
                    v7 = ah.chgg("chtj", chgu(int ), (int)81);
                    continue block36;
                }
            }
            break;
        }
        this.save();
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ah.chgg("chtl", chga(int ), (int)124);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
lbl84:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ah.chgg("chtn", chga(int ), (int)125);
                if (var3_1) {
                    throw null;
                }
            }
lbl88:
            // 5 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ah.chgg("chtp", chga(int ), (int)126);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ah.chgg("chtr", chga(int ), (int)127);
                if (!var3_1) ** GOTO lbl88
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ah.chgg("chts", chga(int ), (int)128);
                    if (!var3_1) ** GOTO lbl84
                    throw null;
                }
            }
lbl102:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ah.chgg("chtt", chga(int ), (int)129);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ah.chgg("chtv", chga(int ), (int)130);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ah.chgg("chtx", chga(int ), (int)131);
        ** while (!var3_1)
lbl113:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cild() {
        ah.chge[0] = -1712616604;
        ah.chge[1] = -158740846;
        ah.chge[2] = 1465033124;
        ah.chge[3] = 1902527732;
        ah.chge[4] = -1037075219;
        ah.chge[5] = 1075756315;
        ah.chge[6] = 480813625;
        ah.chge[7] = -550681100;
        ah.chge[8] = 592348628;
        ah.chge[9] = -1354858110;
        ah.chge[10] = -1442748905;
        ah.chge[11] = -469435545;
        ah.chge[12] = -1641952775;
        ah.chge[13] = -179731772;
        ah.chge[14] = 602806280;
        ah.chge[15] = -1345366672;
        ah.chge[16] = -1964330281;
        ah.chge[17] = 400279124;
        ah.chge[18] = -156997827;
        ah.chge[19] = 187684981;
        ah.chge[20] = -528399357;
        ah.chge[21] = -292849059;
        ah.chge[22] = 940345414;
        ah.chge[23] = -1112203753;
        ah.chge[24] = 1811935652;
        ah.chge[25] = -291156477;
        ah.chge[26] = -1770375146;
        ah.chge[27] = -770713414;
        ah.chge[28] = 1712312392;
        ah.chge[29] = -1525712684;
        ah.chge[30] = 1777336115;
        ah.chge[31] = 384483118;
        ah.chge[32] = -1506640415;
        ah.chge[33] = -1239162765;
        ah.chge[34] = 1894198282;
        ah.chge[35] = -161928347;
        ah.chge[36] = 1939637175;
        ah.chge[37] = -1485099949;
        ah.chge[38] = 1116367968;
        ah.chge[39] = 49112610;
        ah.chge[40] = -176822487;
        ah.chge[41] = -1713811249;
        ah.chge[42] = -1823377416;
        ah.chge[43] = -1933448196;
        ah.chge[44] = -1823783538;
        ah.chge[45] = -1732676080;
        ah.chge[46] = -404092540;
        ah.chge[47] = 572601006;
        ah.chge[48] = -870789139;
        ah.chge[49] = -2110936343;
        ah.chge[50] = -716398182;
        ah.chge[51] = 1824131680;
        ah.chge[52] = -1569970963;
        ah.chge[53] = -1550535556;
        ah.chge[54] = -1794824872;
        ah.chge[55] = -280732694;
        ah.chge[56] = -849072306;
        ah.chge[57] = -1219883875;
        ah.chge[58] = -1815247066;
        ah.chge[59] = 1622329782;
        ah.chge[60] = -519992314;
        ah.chge[61] = -160475083;
        ah.chge[62] = 1194359744;
        ah.chge[63] = 883286457;
        ah.chge[64] = 1860975697;
        ah.chge[65] = -2138605416;
        ah.chge[66] = 310686165;
        ah.chge[67] = -2095009794;
        ah.chge[68] = 1763801579;
        ah.chge[69] = -1760181785;
        ah.chge[70] = -283482574;
        ah.chge[71] = -1586044923;
        ah.chge[72] = -892686614;
        ah.chge[73] = -1330368313;
        ah.chge[74] = 664584042;
        ah.chge[75] = -1204598847;
        ah.chge[76] = -1490391638;
        ah.chge[77] = 646538514;
        ah.chge[78] = 442693260;
        ah.chge[79] = 1157249833;
        ah.chge[80] = -1011421649;
        ah.chge[81] = 171717905;
        ah.chge[82] = -743622704;
        ah.chge[83] = 1522064208;
        ah.chge[84] = 708361363;
        ah.chge[85] = 68998503;
        ah.chge[86] = -242000977;
        ah.chge[87] = 261554027;
        ah.chge[88] = -593014759;
        ah.chge[89] = 1216070271;
        ah.chge[90] = 1539241109;
        ah.chge[91] = -2025443145;
        ah.chge[92] = 2033545153;
        ah.chge[93] = -321474860;
        ah.chge[94] = -1241390975;
        ah.chge[95] = 33251598;
        ah.chge[96] = 1359403884;
        ah.chge[97] = -1990534069;
        ah.chge[98] = -1503233205;
        ah.chge[99] = -477765740;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean removeBlockAndSave(String var1_1) {
        block33: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chol", chgu(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ah.chgg("chom", chga(int ), (int)77)) break;
                v0 /* !! */  = (long)ah.chgg("choo", chga(int ), (int)78);
            }
            var5_2 = ah.c;
            v1 /* !! */  = ah.fv;
            if (true) ** GOTO lbl11
            block18: while (true) {
                v1 /* !! */  = (long)(ah.chgg("chos", chgu(int ), (int)51) - ah.chgg("choq", chgu(int ), (int)50));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1904350996: {
                        break block18;
                    }
                    case -1857298377: {
                        continue block18;
                    }
                }
                break;
            }
            var4_3 /* !! */  = ah.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chot", chgu(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ah.chgg("chou", chga(int ), (int)79)) break;
                v2 /* !! */  = (long)ah.chgg("chov", chga(int ), (int)80);
            }
            var3_4 = ah.a;
            if (var5_2) {
                throw null;
lbl25:
                // 5 sources

                return (boolean)ah.chgg("chow", chga(int ), (int)81);
            }
            if (var3_4 || var3_4) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("chox", chgu(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ah.chgg("choy", chga(int ), (int)82)) break;
                v3 /* !! */  = (long)ah.chgg("chpc", chga(int ), (int)83);
            }
            var2_5 = this.removeBlock(var1_1);
            if (var3_4 || var3_4) ** GOTO lbl25
            if (!var2_5) break block33;
            if (var3_4 || var3_4) ** GOTO lbl25
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = ah.fv - ah.chgg("chpe", chgu(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ah.chgg("chpg", chga(int ), (int)84)) break;
                v4 /* !! */  = (long)ah.chgg("chph", chga(int ), (int)85);
            }
            this.save();
            if (var3_4) ** GOTO lbl25
        }
        if (!var3_4 && !var3_4) ** break;
        ** while (true)
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return var2_5;
            }
            case 0: {
                var4_3 /* !! */  = (int)ah.chgg("chpj", chga(int ), (int)86);
                if (!var5_2) break;
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ah.chgg("chpk", chga(int ), (int)87);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl60:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)ah.chgg("chpl", chga(int ), (int)88);
                if (!var5_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ah.chgg("chpm", chga(int ), (int)89);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl88
                    break;
                }
            }
            case 4: {
                var4_3 /* !! */  = (int)ah.chgg("chpo", chga(int ), (int)90);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 5: {
                var4_3 /* !! */  = (int)ah.chgg("chpp", chga(int ), (int)91);
                if (!var5_2) ** GOTO lbl55
                throw null;
            }
lbl79:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)ah.chgg("chpr", chga(int ), (int)92);
                if (!var5_2) ** GOTO lbl60
                throw null;
            }
lbl83:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)ah.chgg("chpt", chga(int ), (int)93);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl88:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ah.chgg("chpu", chga(int ), (int)94);
                if (!var5_2) ** GOTO lbl79
                throw null;
            }
lbl92:
            // 2 sources

            case 9: {
                do {
                    var4_3 /* !! */  = (int)ah.chgg("chpy", chga(int ), (int)95);
                } while (!var5_2);
                throw null;
            }
            case 10: 
        }
        var4_3 /* !! */  = (int)ah.chgg("chqa", chga(int ), (int)96);
        ** while (!var5_2)
lbl100:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ciln() {
        ah.chge[100] = -687226411;
        ah.chge[101] = -1682664407;
        ah.chge[102] = 660729296;
        ah.chge[103] = 986904214;
        ah.chge[104] = 1700335207;
        ah.chge[105] = -71018056;
        ah.chge[106] = -196359615;
        ah.chge[107] = 1827853031;
        ah.chge[108] = 1908531404;
        ah.chge[109] = -387307639;
        ah.chge[110] = 312841513;
        ah.chge[111] = 725473559;
        ah.chge[112] = -250707437;
        ah.chge[113] = 206603418;
        ah.chge[114] = -1687972564;
        ah.chge[115] = 922272871;
        ah.chge[116] = -1878228722;
        ah.chge[117] = 160644888;
        ah.chge[118] = -38989041;
        ah.chge[119] = 300223912;
        ah.chge[120] = -2075812038;
        ah.chge[121] = 1159556905;
        ah.chge[122] = 1690947531;
        ah.chge[123] = -676673122;
        ah.chge[124] = -1168221838;
        ah.chge[125] = -215256061;
        ah.chge[126] = 949324202;
        ah.chge[127] = 1828389437;
        ah.chge[128] = -1800168564;
        ah.chge[129] = 875599472;
        ah.chge[130] = -220463819;
        ah.chge[131] = 932209184;
        ah.chge[132] = -1471542245;
        ah.chge[133] = 1226397324;
        ah.chge[134] = -318885807;
        ah.chge[135] = -2110323287;
        ah.chge[136] = -434794289;
        ah.chge[137] = -46821311;
        ah.chge[138] = -1945991703;
        ah.chge[139] = -1571325270;
        ah.chge[140] = 2116396704;
        ah.chge[141] = 1588034901;
        ah.chge[142] = -812969638;
        ah.chge[143] = -1316848129;
        ah.chge[144] = 1056215106;
        ah.chge[145] = 1626823542;
        ah.chge[146] = 640757857;
        ah.chge[147] = -877596441;
        ah.chge[148] = 2042601648;
        ah.chge[149] = 472510771;
        ah.chge[150] = -1107213076;
        ah.chge[151] = -428466620;
        ah.chge[152] = 100280112;
        ah.chge[153] = 727589705;
        ah.chge[154] = -481089749;
        ah.chge[155] = 1277683832;
        ah.chge[156] = 1834552322;
        ah.chge[157] = 68044403;
        ah.chge[158] = -1229576814;
        ah.chge[159] = -2034463191;
        ah.chge[160] = -1743956563;
        ah.chge[161] = 1634232007;
        ah.chge[162] = 71943609;
        ah.chge[163] = 1710870343;
        ah.chge[164] = -1832410575;
        ah.chge[165] = -674720808;
        ah.chge[166] = 799496124;
        ah.chge[167] = 1208695859;
        ah.chge[168] = -853970301;
        ah.chge[169] = -370667281;
        ah.chge[170] = -931889643;
        ah.chge[171] = 2075085494;
        ah.chge[172] = 376417004;
        ah.chge[173] = 1088824937;
        ah.chge[174] = -921290599;
        ah.chge[175] = -1715584847;
        ah.chge[176] = -1351637703;
        ah.chge[177] = -1062221192;
        ah.chge[178] = 343456583;
        ah.chge[179] = 632131251;
        ah.chge[180] = -1974288682;
        ah.chge[181] = -2021244249;
        ah.chge[182] = 1060556085;
        ah.chge[183] = 1570404059;
        ah.chge[184] = -549121129;
        ah.chge[185] = -1229111565;
        ah.chge[186] = 474558739;
        ah.chge[187] = -959964077;
        ah.chge[188] = 2073618801;
        ah.chge[189] = 1335765130;
        ah.chge[190] = -1715406236;
        ah.chge[191] = 1282424073;
        ah.chge[192] = -1191467760;
        ah.chge[193] = -2108344412;
        ah.chge[194] = -137560425;
        ah.chge[195] = -48886936;
        ah.chge[196] = -564171919;
        ah.chge[197] = 630050829;
        ah.chge[198] = -1626500436;
        ah.chge[199] = 1167175976;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public Set<String> getBlocks() {
        boolean bl2;
        Object object = fv;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ah.chgg("chjc", chgu(int ), (int)13);
            }
            switch ((int)object) {
                case -1904350996: {
                    break block16;
                }
                case -265664496: {
                    callSite = ah.chgg("chje", chgu(int ), (int)14);
                    continue block16;
                }
                case 1075513156: {
                    callSite = ah.chgg("chjg", chgu(int ), (int)15);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = fv;
        boolean bl5 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - ah.chgg("chjk", chgu(int ), (int)16);
            }
            switch ((int)object2) {
                case -1904350996: {
                    break block17;
                }
                case -482747049: {
                    callSite = ah.chgg("chjl", chgu(int ), (int)17);
                    continue block17;
                }
                case 484903132: {
                    callSite = ah.chgg("chjm", chgu(int ), (int)18);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = fv - ah.chgg("chjn", chgu(int ), (int)19)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ah.chgg("chjo", chga(int ), (int)30)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ah.chgg("chjp", chga(int ), (int)31);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = fv;
        boolean bl6 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - ah.chgg("chjr", chgu(int ), (int)20);
            }
            switch ((int)object4) {
                case -1904350996: {
                    return this.blocks;
                }
                case -314084136: {
                    callSite = ah.chgg("chjx", chgu(int ), (int)21);
                    continue block19;
                }
                case -26843071: {
                    callSite = ah.chgg("chjy", chgu(int ), (int)22);
                    continue block19;
                }
                case 1006749626: {
                    callSite = ah.chgg("chjz", chgu(int ), (int)23);
                    continue block19;
                }
            }
            break;
        }
        return this.blocks;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ah getInstance() {
        v0 /* !! */  = ah.fv;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - ah.chgg("chgz", chgu(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1904350996: {
                    break block22;
                }
                case -1729303696: {
                    v1 = ah.chgg("chhb", chgu(int ), (int)1);
                    continue block22;
                }
                case 921095391: {
                    v1 = ah.chgg("chhc", chgu(int ), (int)2);
                    continue block22;
                }
            }
            break;
        }
        var2 = ah.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chhd", chgu(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ah.chgg("chhe", chga(int ), (int)9)) break;
            v2 /* !! */  = (long)ah.chgg("chhg", chga(int ), (int)10);
        }
        var1_1 /* !! */  = ah.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chhh", chgu(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ah.chgg("chhj", chga(int ), (int)11)) break;
            v3 /* !! */  = (long)ah.chgg("chhk", chga(int ), (int)12);
        }
        var0_2 = ah.a;
        if (!var2) ** GOTO lbl33
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl33:
                // 1 sources

                if (var0_2 || var0_2) continue block25;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("chhm", chgu(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ah.chgg("chho", chga(int ), (int)13)) break;
                    v4 /* !! */  = (long)ah.chgg("chhr", chga(int ), (int)14);
                }
                if (ah.instance != null) ** GOTO lbl70
                if (var0_2 || var0_2) continue block25;
                v5 /* !! */  = ah.fv;
                if (true) ** GOTO lbl45
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ah.chgg("chht", chgu(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1904350996: {
                            break block27;
                        }
                        case -1075642825: {
                            v6 = ah.chgg("chhu", chgu(int ), (int)7);
                            continue block27;
                        }
                        case 67790983: {
                            v6 = ah.chgg("chhv", chgu(int ), (int)8);
                            continue block27;
                        }
                        case 1039750149: {
                            v6 = ah.chgg("chhw", chgu(int ), (int)9);
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ah.fv - ah.chgg("chhx", chgu(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ah.chgg("chhy", chga(int ), (int)15)) break;
                    v7 /* !! */  = (long)ah.chgg("chia", chga(int ), (int)16);
                }
                v8 = new ah();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ah.fv - ah.chgg("chic", chgu(int ), (int)11)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ah.chgg("chid", chga(int ), (int)17)) break;
                    v9 /* !! */  = (long)ah.chgg("chie", chga(int ), (int)18);
                }
                ah.instance = v8;
                if (var0_2) continue block25;
lbl70:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                continue block25;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ah.fv - ah.chgg("chig", chgu(int ), (int)12)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ah.chgg("chih", chga(int ), (int)19)) break;
                    v10 /* !! */  = (long)ah.chgg("chii", chga(int ), (int)20);
                }
                return ah.instance;
lbl78:
                // 3 sources

                case 0: {
                    var1_1 /* !! */  = (int)ah.chgg("chik", chga(int ), (int)21);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl87
                }
                case 1: {
                    var1_1 /* !! */  = (int)ah.chgg("chil", chga(int ), (int)22);
                    if (!var2) ** GOTO lbl78
                    throw null;
                }
lbl87:
                // 3 sources

                case 2: {
                    var1_1 /* !! */  = (int)ah.chgg("chim", chga(int ), (int)23);
                    if (!var2) break block25;
                    throw null;
                }
                case 3: {
                    var1_1 /* !! */  = (int)ah.chgg("chin", chga(int ), (int)24);
                    if (!var2) ** GOTO lbl87
                    throw null;
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)ah.chgg("chio", chga(int ), (int)25);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl110
                        break;
                    }
                }
                case 5: {
                    var1_1 /* !! */  = (int)ah.chgg("chiq", chga(int ), (int)26);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl110
                }
                case 6: {
                    var1_1 /* !! */  = (int)ah.chgg("chix", chga(int ), (int)27);
                    if (var2) {
                        throw null;
                    }
                }
lbl110:
                // 5 sources

                case 7: {
                    var1_1 /* !! */  = (int)ah.chgg("chiy", chga(int ), (int)28);
                    if (!var2) ** GOTO lbl78
                    throw null;
                }
                case 8: 
            }
        }
        var1_1 /* !! */  = (int)ah.chgg("chiz", chga(int ), (int)29);
        ** while (!var2)
lbl117:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cioo() {
        ah.chgy[0] = 7059794180065164174L;
        ah.chgy[1] = -471019089870851399L;
        ah.chgy[2] = 3983454138865692711L;
        ah.chgy[3] = 4196936874904272503L;
        ah.chgy[4] = -8359937823859629762L;
        ah.chgy[5] = -2150900064114030738L;
        ah.chgy[6] = -5194519942984665885L;
        ah.chgy[7] = -7079832043723306011L;
        ah.chgy[8] = 3704064650974140537L;
        ah.chgy[9] = 7271402663325246988L;
        ah.chgy[10] = 6385459282595779538L;
        ah.chgy[11] = -7567227145550972074L;
        ah.chgy[12] = 3876619979016065659L;
        ah.chgy[13] = 7051214855384830652L;
        ah.chgy[14] = 8087933815653841864L;
        ah.chgy[15] = -2981080544271389292L;
        ah.chgy[16] = -7913711389896853191L;
        ah.chgy[17] = -1777121998833958425L;
        ah.chgy[18] = 2779925117217966942L;
        ah.chgy[19] = 6051181632311431177L;
        ah.chgy[20] = 2350366959739438004L;
        ah.chgy[21] = -5451108521147645879L;
        ah.chgy[22] = -3748909858957377800L;
        ah.chgy[23] = -75756546355814163L;
        ah.chgy[24] = 2918913582200060086L;
        ah.chgy[25] = -606173908283661544L;
        ah.chgy[26] = 6435274917418562955L;
        ah.chgy[27] = -1551724673157645345L;
        ah.chgy[28] = -6981801375599316428L;
        ah.chgy[29] = -2357427264685972095L;
        ah.chgy[30] = 8673287640134321520L;
        ah.chgy[31] = -5907959984771008785L;
        ah.chgy[32] = -1095732950305280139L;
        ah.chgy[33] = -4328195143286131232L;
        ah.chgy[34] = 2927267600822805968L;
        ah.chgy[35] = -1006652063059500477L;
        ah.chgy[36] = -7032775799322204789L;
        ah.chgy[37] = -4708527118792642707L;
        ah.chgy[38] = -8963324759202164286L;
        ah.chgy[39] = -7705928362428757273L;
        ah.chgy[40] = 5684103552794594761L;
        ah.chgy[41] = 3229530923857931517L;
        ah.chgy[42] = -638184443404750306L;
        ah.chgy[43] = -3344734106632967294L;
        ah.chgy[44] = -3603932749571646289L;
        ah.chgy[45] = -2869875729317254880L;
        ah.chgy[46] = -6237245179525345441L;
        ah.chgy[47] = -1320677040484333650L;
        ah.chgy[48] = 165742198458398686L;
        ah.chgy[49] = 9162261490633887570L;
        ah.chgy[50] = -8481433615352145483L;
        ah.chgy[51] = -2813669590310241556L;
        ah.chgy[52] = 4132728910799579791L;
        ah.chgy[53] = -1999803891403771416L;
        ah.chgy[54] = -103775624301924113L;
        ah.chgy[55] = 3343181975869485553L;
        ah.chgy[56] = -6879715213881621731L;
        ah.chgy[57] = 3291429433280780633L;
        ah.chgy[58] = 3042168545975249162L;
        ah.chgy[59] = 8043121237626232257L;
        ah.chgy[60] = 8274111834851891590L;
        ah.chgy[61] = -688931292396483852L;
        ah.chgy[62] = -7645574865958175502L;
        ah.chgy[63] = -1939859608080615956L;
        ah.chgy[64] = -2977702585685163572L;
        ah.chgy[65] = 6866027335388493712L;
        ah.chgy[66] = -6356799848658309010L;
        ah.chgy[67] = 1945452140800781341L;
        ah.chgy[68] = -8478471967223012823L;
        ah.chgy[69] = -8340247091151501731L;
        ah.chgy[70] = -5858733050384047669L;
        ah.chgy[71] = 5661973489368521193L;
        ah.chgy[72] = -2702472479382531815L;
        ah.chgy[73] = 5326377190200245525L;
        ah.chgy[74] = 3446523755738064772L;
        ah.chgy[75] = -7629669149679466631L;
        ah.chgy[76] = -9170266623219376510L;
        ah.chgy[77] = -9122463566041687459L;
        ah.chgy[78] = 6219337536473600476L;
        ah.chgy[79] = -7697449352309212027L;
        ah.chgy[80] = 7076193896223450050L;
        ah.chgy[81] = 1820425149800455565L;
        ah.chgy[82] = 7993341878904601787L;
        ah.chgy[83] = 4620922032241346347L;
        ah.chgy[84] = 5979332868351842734L;
        ah.chgy[85] = -4857249648017116923L;
        ah.chgy[86] = -4207290371686585884L;
        ah.chgy[87] = 5010478785433327062L;
        ah.chgy[88] = 8273533129014337589L;
        ah.chgy[89] = 6223163469531073959L;
        ah.chgy[90] = 8009593773625052877L;
        ah.chgy[91] = 3073130418306216946L;
        ah.chgy[92] = -8177079564031770363L;
        ah.chgy[93] = 4683047155363581421L;
        ah.chgy[94] = -8238424233423939668L;
        ah.chgy[95] = 424751909778530642L;
        ah.chgy[96] = -624753004259737332L;
        ah.chgy[97] = -7151865966339590869L;
        ah.chgy[98] = 6353781297012963352L;
        ah.chgy[99] = -8325010293046233320L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$load$0(JsonElement var1_1) {
        v0 /* !! */  = ah.fv;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - ah.chgg("cijh", chgu(int ), (int)185));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1904350996: {
                    break block21;
                }
                case -456902446: {
                    v1 = ah.chgg("cijj", chgu(int ), (int)186);
                    continue block21;
                }
                case 210465991: {
                    v1 = ah.chgg("cijl", chgu(int ), (int)187);
                    continue block21;
                }
            }
            break;
        }
        var4_2 = ah.c;
        v2 /* !! */  = ah.fv;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(ah.chgg("cijo", chgu(int ), (int)189) - ah.chgg("cijn", chgu(int ), (int)188));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1912587597: {
                    continue block22;
                }
                case -1904350996: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = ah.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("cijp", chgu(int ), (int)190)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ah.chgg("cijs", chga(int ), (int)225)) break;
            v3 /* !! */  = (long)ah.chgg("ciju", chga(int ), (int)226);
        }
        var2_4 = ah.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("cijy", chgu(int ), (int)191)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ah.chgg("cijz", chga(int ), (int)227)) break;
                    v4 /* !! */  = (long)ah.chgg("cika", chga(int ), (int)228);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("cikh", chgu(int ), (int)192)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ah.chgg("ciki", chga(int ), (int)229)) break;
                    v5 /* !! */  = (long)ah.chgg("cikj", chga(int ), (int)230);
                }
                v6 = var1_1.getAsString();
                v7 /* !! */  = ah.fv;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v7 /* !! */  = (long)(v8 - ah.chgg("cikk", chgu(int ), (int)193));
lbl54:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1904350996: {
                            break block27;
                        }
                        case -1624608647: {
                            v8 = ah.chgg("cikl", chgu(int ), (int)194);
                            continue block27;
                        }
                        case 678225064: {
                            v8 = ah.chgg("cikm", chgu(int ), (int)195);
                            continue block27;
                        }
                    }
                    break;
                }
                this.blocks.add(v6);
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl68:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ah.chgg("ciks", chga(int ), (int)231);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ah.chgg("ciku", chga(int ), (int)232);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 2: {
                var3_3 /* !! */  = (int)ah.chgg("cikw", chga(int ), (int)233);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
lbl82:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ah.chgg("cikx", chga(int ), (int)234);
                    if (!var4_2) ** GOTO lbl68
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ah.chgg("ciky", chga(int ), (int)235);
        ** while (!var4_2)
lbl90:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void addBlockAndSave(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chlt", chgu(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ah.chgg("chlx", chga(int ), (int)52)) break;
            v0 /* !! */  = (long)ah.chgg("chlz", chga(int ), (int)53);
        }
        var4_2 = ah.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chmb", chgu(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ah.chgg("chmc", chga(int ), (int)54)) break;
            v1 /* !! */  = (long)ah.chgg("chme", chga(int ), (int)55);
        }
        var3_3 /* !! */  = ah.b;
        v2 /* !! */  = ah.fv;
        if (true) ** GOTO lbl17
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ah.chgg("chmf", chgu(int ), (int)31));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1904350996: {
                    break block21;
                }
                case -339639616: {
                    v3 = ah.chgg("chmg", chgu(int ), (int)32);
                    continue block21;
                }
                case 1329851739: {
                    v3 = ah.chgg("chmh", chgu(int ), (int)33);
                    continue block21;
                }
            }
            break;
        }
        var2_4 = ah.a;
        if (var4_2) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("chmj", chgu(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ah.chgg("chml", chga(int ), (int)56)) break;
            v4 /* !! */  = (long)ah.chgg("chmm", chga(int ), (int)57);
        }
        this.addBlock(var1_1);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                v5 /* !! */  = ah.fv;
                if (true) ** GOTO lbl46
                block24: while (true) {
                    v5 /* !! */  = (long)(ah.chgg("chmp", chgu(int ), (int)36) - ah.chgg("chmo", chgu(int ), (int)35));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1904350996: {
                            break block24;
                        }
                        case 1883333595: {
                            continue block24;
                        }
                    }
                    break;
                }
                this.save();
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl54:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ah.chgg("chmq", chga(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl59:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ah.chgg("chmr", chga(int ), (int)59);
                if (!var4_2) ** GOTO lbl54
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ah.chgg("chms", chga(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl81
            }
lbl68:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ah.chgg("chmt", chga(int ), (int)61);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
lbl72:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ah.chgg("chmu", chga(int ), (int)62);
                if (!var4_2) break;
                throw null;
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)ah.chgg("chmv", chga(int ), (int)63);
                } while (!var4_2);
                throw null;
            }
lbl81:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ah.chgg("chmw", chga(int ), (int)64);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)ah.chgg("chmx", chga(int ), (int)65);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ah() {
        var4_1 /* !! */  = ah.b;
        super();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.blocks = new CopyOnWriteArraySet<String>();
        var1_2 = Paths.get("Phobia", new String[]{"configs"});
        Files.createDirectories(var1_2, new FileAttribute[0]);
        if (var4_1 /* !! */  != 0) {
            ** switch (var4_1 /* !! */ )
        }
lbl11:
        // 3 sources

        {
            catch (IOException var2_3) {
                // empty catch block
            }
            this.configPath = var1_2.resolve("blockesp.file");
            return;
lbl16:
            // 2 sources

            case 0: {
                var4_1 /* !! */  = (int)ah.chgg("chgi", chga(int ), (int)0);
                ** GOTO lbl22
            }
lbl19:
            // 1 sources

            case 1: {
                var4_1 /* !! */  = (int)ah.chgg("chgj", chga(int ), (int)1);
                ** GOTO lbl35
            }
lbl22:
            // 3 sources

            case 2: {
                while (true) {
                    var4_1 /* !! */  = (int)ah.chgg("chgk", chga(int ), (int)2);
                }
            }
lbl26:
            // 1 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)ah.chgg("chgl", chga(int ), (int)3);
                    ** GOTO lbl16
                    break;
                }
            }
lbl30:
            // 1 sources

            case 4: {
                var4_1 /* !! */  = (int)ah.chgg("chgm", chga(int ), (int)4);
            }
lbl32:
            // 3 sources

            case 5: {
                var4_1 /* !! */  = (int)ah.chgg("chgn", chga(int ), (int)5);
                ** GOTO lbl22
            }
lbl35:
            // 2 sources

            case 6: {
                var4_1 /* !! */  = (int)ah.chgg("chgo", chga(int ), (int)6);
                break;
            }
lbl38:
            // 1 sources

            case 7: {
                var4_1 /* !! */  = (int)ah.chgg("chgp", chga(int ), (int)7);
                ** GOTO lbl32
            }
lbl41:
            // 1 sources

            ** case 8:
        }
lbl42:
        // 2 sources

        var4_1 /* !! */  = (int)ah.chgg("chgq", chga(int ), (int)8);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void addBlock(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chkj", chgu(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ah.chgg("chkl", chga(int ), (int)36)) break;
            v0 /* !! */  = (long)ah.chgg("chkn", chga(int ), (int)37);
        }
        var4_2 = ah.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chko", chgu(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ah.chgg("chkp", chga(int ), (int)38)) break;
            v1 /* !! */  = (long)ah.chgg("chkr", chga(int ), (int)39);
        }
        var3_3 /* !! */  = ah.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("chks", chgu(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ah.chgg("chkt", chga(int ), (int)40)) break;
            v2 /* !! */  = (long)ah.chgg("chku", chga(int ), (int)41);
        }
        var2_4 = ah.a;
        if (var4_2) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ah.fv - ah.chgg("chkv", chgu(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ah.chgg("chkx", chga(int ), (int)42)) break;
            v3 /* !! */  = (long)ah.chgg("chlc", chga(int ), (int)43);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = ah.fv - ah.chgg("chld", chgu(int ), (int)28)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ah.chgg("chle", chga(int ), (int)44)) break;
            v4 /* !! */  = (long)ah.chgg("chlf", chga(int ), (int)45);
        }
        this.blocks.add(var1_1);
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl42:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ah.chgg("chlg", chga(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ah.chgg("chli", chga(int ), (int)47);
                } while (!var4_2);
                throw null;
            }
lbl52:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ah.chgg("chlp", chga(int ), (int)48);
                if (!var4_2) ** GOTO lbl42
                throw null;
            }
lbl56:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ah.chgg("chlq", chga(int ), (int)49);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
lbl60:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ah.chgg("chlr", chga(int ), (int)50);
                    if (!var4_2) ** GOTO lbl56
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ah.chgg("chls", chga(int ), (int)51);
        ** while (!var4_2)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cimu() {
        ah.chgf[100] = 1981396427;
        ah.chgf[101] = -1682664408;
        ah.chgf[102] = -1470178597;
        ah.chgf[103] = 986904215;
        ah.chgf[104] = -1700335208;
        ah.chgf[105] = -1541544843;
        ah.chgf[106] = -196359615;
        ah.chgf[107] = 1827853030;
        ah.chgf[108] = 1908531407;
        ah.chgf[109] = -387307638;
        ah.chgf[110] = -312841514;
        ah.chgf[111] = 149660202;
        ah.chgf[112] = 250707436;
        ah.chgf[113] = -951541726;
        ah.chgf[114] = 1687972563;
        ah.chgf[115] = -795847525;
        ah.chgf[116] = -1878228724;
        ah.chgf[117] = 160644890;
        ah.chgf[118] = -38989044;
        ah.chgf[119] = 300223913;
        ah.chgf[120] = -2075812037;
        ah.chgf[121] = 1159556906;
        ah.chgf[122] = -1690947532;
        ah.chgf[123] = 138645045;
        ah.chgf[124] = -1168221834;
        ah.chgf[125] = -215256063;
        ah.chgf[126] = 949324205;
        ah.chgf[127] = 1828389438;
        ah.chgf[128] = -1800168564;
        ah.chgf[129] = 875599476;
        ah.chgf[130] = -220463821;
        ah.chgf[131] = 932209186;
        ah.chgf[132] = 1471542244;
        ah.chgf[133] = -1745040807;
        ah.chgf[134] = 2131523131;
        ah.chgf[135] = 2110323286;
        ah.chgf[136] = -1151104382;
        ah.chgf[137] = 46821310;
        ah.chgf[138] = -476541726;
        ah.chgf[139] = -1571325272;
        ah.chgf[140] = 2116396705;
        ah.chgf[141] = 1588034900;
        ah.chgf[142] = -812969638;
        ah.chgf[143] = 1316848128;
        ah.chgf[144] = -819255559;
        ah.chgf[145] = 1626823541;
        ah.chgf[146] = 640757857;
        ah.chgf[147] = -877596442;
        ah.chgf[148] = 2042601648;
        ah.chgf[149] = -472510772;
        ah.chgf[150] = 1733919563;
        ah.chgf[151] = 428466619;
        ah.chgf[152] = 95994553;
        ah.chgf[153] = -727589706;
        ah.chgf[154] = -1484365519;
        ah.chgf[155] = -1277683833;
        ah.chgf[156] = -673726142;
        ah.chgf[157] = 68044402;
        ah.chgf[158] = -777778597;
        ah.chgf[159] = 2034463190;
        ah.chgf[160] = -2073999398;
        ah.chgf[161] = 1634232011;
        ah.chgf[162] = 71943595;
        ah.chgf[163] = 1710870350;
        ah.chgf[164] = -1832410574;
        ah.chgf[165] = -674720812;
        ah.chgf[166] = 799496107;
        ah.chgf[167] = 1208695870;
        ah.chgf[168] = -853970282;
        ah.chgf[169] = -370667291;
        ah.chgf[170] = -931889660;
        ah.chgf[171] = 2075085490;
        ah.chgf[172] = 376416995;
        ah.chgf[173] = 1088824935;
        ah.chgf[174] = -921290598;
        ah.chgf[175] = -1715584836;
        ah.chgf[176] = -1351637715;
        ah.chgf[177] = -1062221197;
        ah.chgf[178] = 343456584;
        ah.chgf[179] = 632131233;
        ah.chgf[180] = -1974288678;
        ah.chgf[181] = -2021244247;
        ah.chgf[182] = 1060556071;
        ah.chgf[183] = 1570404046;
        ah.chgf[184] = -549121148;
        ah.chgf[185] = 1229111564;
        ah.chgf[186] = 1228571172;
        ah.chgf[187] = 959964076;
        ah.chgf[188] = -33996110;
        ah.chgf[189] = -1335765131;
        ah.chgf[190] = 267351683;
        ah.chgf[191] = -1282424074;
        ah.chgf[192] = -1055083344;
        ah.chgf[193] = 2108344411;
        ah.chgf[194] = 1186257276;
        ah.chgf[195] = 48886935;
        ah.chgf[196] = 1138003867;
        ah.chgf[197] = -630050830;
        ah.chgf[198] = -1896471361;
        ah.chgf[199] = -1167175977;
    }

    private static /* synthetic */ void cimc() {
        ah.chge[200] = 1545847518;
        ah.chge[201] = -1551331008;
        ah.chge[202] = 1747429041;
        ah.chge[203] = 1305575779;
        ah.chge[204] = 890191217;
        ah.chge[205] = 804385856;
        ah.chge[206] = 1239603722;
        ah.chge[207] = 1321868145;
        ah.chge[208] = -342256616;
        ah.chge[209] = 125310692;
        ah.chge[210] = 1337728117;
        ah.chge[211] = -1716120615;
        ah.chge[212] = -937901780;
        ah.chge[213] = 112732256;
        ah.chge[214] = -1579535221;
        ah.chge[215] = -89303824;
        ah.chge[216] = -1490735466;
        ah.chge[217] = -1837351352;
        ah.chge[218] = 1626129561;
        ah.chge[219] = -1641526964;
        ah.chge[220] = 1537953318;
        ah.chge[221] = -706840016;
        ah.chge[222] = 566852104;
        ah.chge[223] = 1147617915;
        ah.chge[224] = -944449800;
        ah.chge[225] = -62190289;
        ah.chge[226] = -1638813223;
        ah.chge[227] = -1305514780;
        ah.chge[228] = -407358489;
        ah.chge[229] = -1561024378;
        ah.chge[230] = 1837946562;
        ah.chge[231] = 629391851;
        ah.chge[232] = -2004233528;
        ah.chge[233] = -2070073775;
        ah.chge[234] = -1118553975;
        ah.chge[235] = 1061271765;
    }

    private static /* synthetic */ void cino() {
        ah.chgw[0] = -5594771542317380565L;
        ah.chgw[1] = 2846786080470832312L;
        ah.chgw[2] = 3078265150703930412L;
        ah.chgw[3] = 2533006476092709339L;
        ah.chgw[4] = -7199496921342590168L;
        ah.chgw[5] = -3792640581429831810L;
        ah.chgw[6] = -6073113667429843836L;
        ah.chgw[7] = -1817452400663311007L;
        ah.chgw[8] = 8876578304560481632L;
        ah.chgw[9] = -1625916982027346029L;
        ah.chgw[10] = -6957982779811770447L;
        ah.chgw[11] = -7513505214172898565L;
        ah.chgw[12] = 5806360420938233167L;
        ah.chgw[13] = -1349714537519168859L;
        ah.chgw[14] = 8042069466413645432L;
        ah.chgw[15] = 7192172763758753510L;
        ah.chgw[16] = 7835530092651145053L;
        ah.chgw[17] = 3376642159794975609L;
        ah.chgw[18] = 3340872425835268429L;
        ah.chgw[19] = -6374898617790702603L;
        ah.chgw[20] = -7596402821685235938L;
        ah.chgw[21] = -3415478907674445929L;
        ah.chgw[22] = 5234275152113376379L;
        ah.chgw[23] = 8870672632550348217L;
        ah.chgw[24] = 9161773496936865156L;
        ah.chgw[25] = 6793700571657428233L;
        ah.chgw[26] = -8365410523982275141L;
        ah.chgw[27] = -6675735558821236469L;
        ah.chgw[28] = 4590992756334342144L;
        ah.chgw[29] = -6035924024916867331L;
        ah.chgw[30] = -9094821099000131680L;
        ah.chgw[31] = 4249838609362720791L;
        ah.chgw[32] = 1376132335116230945L;
        ah.chgw[33] = 4467655243542944968L;
        ah.chgw[34] = 6972698451593728084L;
        ah.chgw[35] = 8418085313446734309L;
        ah.chgw[36] = -7929557039562133244L;
        ah.chgw[37] = -5279161467083276491L;
        ah.chgw[38] = -5405487007055294806L;
        ah.chgw[39] = -4417633331142538939L;
        ah.chgw[40] = 953535226499515274L;
        ah.chgw[41] = 5342584119904180963L;
        ah.chgw[42] = -7116902312414785443L;
        ah.chgw[43] = 1088094959111564786L;
        ah.chgw[44] = -2874927395309363453L;
        ah.chgw[45] = -4025578737266456324L;
        ah.chgw[46] = 6867329162631216796L;
        ah.chgw[47] = -6396360310992280798L;
        ah.chgw[48] = -3250556391879709231L;
        ah.chgw[49] = -177578685814577752L;
        ah.chgw[50] = -744945977008074032L;
        ah.chgw[51] = 185981771606235219L;
        ah.chgw[52] = 4802744316370742689L;
        ah.chgw[53] = 4975888918696328981L;
        ah.chgw[54] = -2703826771120036148L;
        ah.chgw[55] = -4397499027549810022L;
        ah.chgw[56] = -8967563674162597820L;
        ah.chgw[57] = -6167613392084800750L;
        ah.chgw[58] = 8408476739849237446L;
        ah.chgw[59] = 9050440162123780239L;
        ah.chgw[60] = -7118572013407049826L;
        ah.chgw[61] = 6353992323881859870L;
        ah.chgw[62] = -1095875349519314274L;
        ah.chgw[63] = 3871483117524411810L;
        ah.chgw[64] = 3688025442273460021L;
        ah.chgw[65] = -8117913023912773101L;
        ah.chgw[66] = 6888530938966343437L;
        ah.chgw[67] = 7721780628990893634L;
        ah.chgw[68] = -7333759340882538745L;
        ah.chgw[69] = -907448637519788009L;
        ah.chgw[70] = 5053454752016751641L;
        ah.chgw[71] = -8636304115225837515L;
        ah.chgw[72] = 7934945853011222246L;
        ah.chgw[73] = -6949953996682926261L;
        ah.chgw[74] = 3188861179454732878L;
        ah.chgw[75] = -1825309750965836934L;
        ah.chgw[76] = -5200106718680297978L;
        ah.chgw[77] = -9195678925194802592L;
        ah.chgw[78] = -3464647735899449544L;
        ah.chgw[79] = -1683680809284066718L;
        ah.chgw[80] = -8986469237276403513L;
        ah.chgw[81] = -7513968833774685461L;
        ah.chgw[82] = -8926763195642316263L;
        ah.chgw[83] = -219121502692666692L;
        ah.chgw[84] = -3154124035349312051L;
        ah.chgw[85] = 5761140467270524666L;
        ah.chgw[86] = 3817973871789479540L;
        ah.chgw[87] = 6537365973518973772L;
        ah.chgw[88] = 5223139885584608358L;
        ah.chgw[89] = -1048196654725903395L;
        ah.chgw[90] = 6431032053325594981L;
        ah.chgw[91] = 6452441636089976028L;
        ah.chgw[92] = -1466832183457855183L;
        ah.chgw[93] = 8711903126872836634L;
        ah.chgw[94] = 2802706840276352039L;
        ah.chgw[95] = 8847172216181070821L;
        ah.chgw[96] = 940423732299188919L;
        ah.chgw[97] = -6510891178284266477L;
        ah.chgw[98] = -3060416993897611192L;
        ah.chgw[99] = -1175234867570728386L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int size() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = fv - ah.chgg("chuc", chgu(int ), (int)82)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ah.chgg("chue", chga(int ), (int)132)) break;
            object = ah.chgg("chuf", chga(int ), (int)133);
        }
        boolean bl2 = c;
        Object object = fv;
        block9: while (true) {
            switch ((int)object) {
                case -1904350996: {
                    break block9;
                }
                case 1271851212: {
                    object = ah.chgg("chuh", chgu(int ), (int)84) - ah.chgg("chug", chgu(int ), (int)83);
                    continue block9;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = fv;
        block10: while (true) {
            switch ((int)object2) {
                case -1904350996: {
                    break block10;
                }
                case 1536461491: {
                    object2 = ah.chgg("chuk", chgu(int ), (int)86) - ah.chgg("chuj", chgu(int ), (int)85);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (int)ah.chgg("chum", chga(int ), (int)134);
        if (bl3) return (int)ah.chgg("chum", chga(int ), (int)134);
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = fv - ah.chgg("chun", chgu(int ), (int)87)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ah.chgg("chuo", chga(int ), (int)135)) break;
            object3 = ah.chgg("chut", chga(int ), (int)136);
        }
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = fv - ah.chgg("chuv", chgu(int ), (int)88)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == ah.chgg("chuw", chga(int ), (int)137)) {
                return this.blocks.size();
            }
            object4 = ah.chgg("chux", chga(int ), (int)138);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void clear() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chri", chgu(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ah.chgg("chrj", chga(int ), (int)110)) break;
            v0 /* !! */  = (long)ah.chgg("chrm", chga(int ), (int)111);
        }
        var3_1 = ah.c;
        v1 /* !! */  = ah.fv;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(ah.chgg("chrp", chgu(int ), (int)63) - ah.chgg("chro", chgu(int ), (int)62));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1904350996: {
                    break block17;
                }
                case 432807533: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ah.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chrr", chgu(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ah.chgg("chrs", chga(int ), (int)112)) break;
                    v2 /* !! */  = (long)ah.chgg("chrt", chga(int ), (int)113);
                }
                var1_3 = ah.a;
                if (var3_1) {
                    throw null;
lbl28:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl28
                v3 /* !! */  = ah.fv;
                if (true) ** GOTO lbl35
                block20: while (true) {
                    v3 /* !! */  = (long)(ah.chgg("chry", chgu(int ), (int)66) - ah.chgg("chrv", chgu(int ), (int)65));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1904350996: {
                            break block20;
                        }
                        case -1467149011: {
                            continue block20;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("chrz", chgu(int ), (int)67)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ah.chgg("chsa", chga(int ), (int)114)) break;
                    v4 /* !! */  = (long)ah.chgg("chsb", chga(int ), (int)115);
                }
                this.blocks.clear();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ah.chgg("chsc", chga(int ), (int)116);
                if (!var3_1) break;
                throw null;
            }
lbl52:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ah.chgg("chsd", chga(int ), (int)117);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 2: {
                var2_2 /* !! */  = (int)ah.chgg("chsf", chga(int ), (int)118);
                if (var3_1) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ah.chgg("chsi", chga(int ), (int)119);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ah.chgg("chsk", chga(int ), (int)120);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ah.chgg("chsl", chga(int ), (int)121);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 57[SWITCH]
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasBlock(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chqc", chgu(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ah.chgg("chqd", chga(int ), (int)97)) break;
            v0 /* !! */  = (long)ah.chgg("chqf", chga(int ), (int)98);
        }
        var4_2 = ah.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ah.fv - ah.chgg("chqk", chgu(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ah.chgg("chql", chga(int ), (int)99)) break;
            v1 /* !! */  = (long)ah.chgg("chqn", chga(int ), (int)100);
        }
        var3_3 /* !! */  = ah.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ah.fv - ah.chgg("chqo", chgu(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ah.chgg("chqp", chga(int ), (int)101)) break;
            v2 /* !! */  = (long)ah.chgg("chqq", chga(int ), (int)102);
        }
        var2_4 = ah.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return (boolean)ah.chgg("chqr", chga(int ), (int)103);
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v3 /* !! */  = ah.fv;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(ah.chgg("chqv", chgu(int ), (int)59) - ah.chgg("chqt", chgu(int ), (int)58));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1904350996: {
                            break block14;
                        }
                        case -297463829: {
                            continue block14;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ah.fv - ah.chgg("chqw", chgu(int ), (int)60)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ah.chgg("chqy", chga(int ), (int)104)) break;
                    v4 /* !! */  = (long)ah.chgg("chqz", chga(int ), (int)105);
                }
                return this.blocks.contains(var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)ah.chgg("chrb", chga(int ), (int)106);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ah.chgg("chrc", chga(int ), (int)107);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)ah.chgg("chrg", chga(int ), (int)108);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ah.chgg("chrh", chga(int ), (int)109);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cioz() {
        ah.chgy[100] = -8688746234177587794L;
        ah.chgy[101] = 1383172075258929769L;
        ah.chgy[102] = 3571310433188895137L;
        ah.chgy[103] = 3750679520669566335L;
        ah.chgy[104] = 6793402024389691673L;
        ah.chgy[105] = -4762736172927892874L;
        ah.chgy[106] = -6728027541382792616L;
        ah.chgy[107] = 3453615027884201852L;
        ah.chgy[108] = -2308794447384461133L;
        ah.chgy[109] = 7942841195337962856L;
        ah.chgy[110] = -7885884756905134030L;
        ah.chgy[111] = -2779890071279426554L;
        ah.chgy[112] = 5448418772174903574L;
        ah.chgy[113] = 6512861891367106828L;
        ah.chgy[114] = 9054717748287862480L;
        ah.chgy[115] = -173863386167614146L;
        ah.chgy[116] = -2762607295729011550L;
        ah.chgy[117] = -790851446103117332L;
        ah.chgy[118] = 7990543595278183473L;
        ah.chgy[119] = 280384213985057068L;
        ah.chgy[120] = -598638498837752598L;
        ah.chgy[121] = 3069239917077540652L;
        ah.chgy[122] = 2356956151546223329L;
        ah.chgy[123] = 8712364954990168528L;
        ah.chgy[124] = -1704687566444293225L;
        ah.chgy[125] = 3025479326882462505L;
        ah.chgy[126] = -2596406719816917927L;
        ah.chgy[127] = 4391439885044646680L;
        ah.chgy[128] = 7366865773732021366L;
        ah.chgy[129] = 2510905283658399950L;
        ah.chgy[130] = 126424613915756979L;
        ah.chgy[131] = -3535591539608244031L;
        ah.chgy[132] = 1468224545765781505L;
        ah.chgy[133] = 9090262751782858354L;
        ah.chgy[134] = -6421662395124623731L;
        ah.chgy[135] = -3989397905852555360L;
        ah.chgy[136] = 8230139785105886172L;
        ah.chgy[137] = -419173470157169844L;
        ah.chgy[138] = 8892276642994888609L;
        ah.chgy[139] = -541026562320891127L;
        ah.chgy[140] = 3591458748812477542L;
        ah.chgy[141] = -7077818172241758822L;
        ah.chgy[142] = -3216900744694809392L;
        ah.chgy[143] = 3649205909012257062L;
        ah.chgy[144] = -1996339601993848868L;
        ah.chgy[145] = 5906755135124556051L;
        ah.chgy[146] = 1532656873494040146L;
        ah.chgy[147] = 4066063541533235216L;
        ah.chgy[148] = -7372969429296878498L;
        ah.chgy[149] = -290221650309521300L;
        ah.chgy[150] = -6380141991067697928L;
        ah.chgy[151] = 3207855525495865459L;
        ah.chgy[152] = 6222070458617354126L;
        ah.chgy[153] = -5208684991560520553L;
        ah.chgy[154] = 6577412840733252897L;
        ah.chgy[155] = 1335064579836870046L;
        ah.chgy[156] = -5509626569494315319L;
        ah.chgy[157] = 5622445785438269214L;
        ah.chgy[158] = -164041345491446241L;
        ah.chgy[159] = 286109691805717863L;
        ah.chgy[160] = -1805160647526179330L;
        ah.chgy[161] = 8396570504717593426L;
        ah.chgy[162] = -1634493658137694317L;
        ah.chgy[163] = -8350597503008594282L;
        ah.chgy[164] = 4463768576162773310L;
        ah.chgy[165] = -4429912045385337302L;
        ah.chgy[166] = -2962504184455849732L;
        ah.chgy[167] = -2235893730655126396L;
        ah.chgy[168] = -6461527273620777354L;
        ah.chgy[169] = -908155235264605597L;
        ah.chgy[170] = 6224536830540118891L;
        ah.chgy[171] = 75895925660925297L;
        ah.chgy[172] = -6703413444695803177L;
        ah.chgy[173] = 530497813419999693L;
        ah.chgy[174] = -3333516115679361866L;
        ah.chgy[175] = -5910050079314613454L;
        ah.chgy[176] = 8849785663844134346L;
        ah.chgy[177] = -681146843765029800L;
        ah.chgy[178] = 6691013408304111770L;
        ah.chgy[179] = 1682951526863494104L;
        ah.chgy[180] = -5398408724354354018L;
        ah.chgy[181] = -267360699098011671L;
        ah.chgy[182] = -6559978511778765691L;
        ah.chgy[183] = -1254824071336850885L;
        ah.chgy[184] = 7336558201739401945L;
        ah.chgy[185] = -4237890248017764502L;
        ah.chgy[186] = -4094461080313061620L;
        ah.chgy[187] = -2158564268568438807L;
        ah.chgy[188] = 293837918972295263L;
        ah.chgy[189] = 7160316082222663270L;
        ah.chgy[190] = 8195818035232289680L;
        ah.chgy[191] = -3786226660366209761L;
        ah.chgy[192] = -5447321124212766521L;
        ah.chgy[193] = 943468915093536551L;
        ah.chgy[194] = 1236118043092453473L;
        ah.chgy[195] = -434890173991984732L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getBlockList() {
        v0 /* !! */  = ah.fv;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - ah.chgg("chvh", chgu(int ), (int)89));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1904350996: {
                    break block28;
                }
                case -1772750904: {
                    v1 = ah.chgg("chvi", chgu(int ), (int)90);
                    continue block28;
                }
                case -1125142724: {
                    v1 = ah.chgg("chvk", chgu(int ), (int)91);
                    continue block28;
                }
                case 1890980896: {
                    v1 = ah.chgg("chvl", chgu(int ), (int)92);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = ah.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ah.fv - ah.chgg("chvn", chgu(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ah.chgg("chvo", chga(int ), (int)143)) break;
            v2 /* !! */  = (long)ah.chgg("chvp", chga(int ), (int)144);
        }
        var2_2 /* !! */  = ah.b;
        v3 /* !! */  = ah.fv;
        if (true) ** GOTO lbl29
        block30: while (true) {
            v3 /* !! */  = (long)(ah.chgg("chvs", chgu(int ), (int)95) - ah.chgg("chvq", chgu(int ), (int)94));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1904350996: {
                    break block30;
                }
                case -614676070: {
                    continue block30;
                }
            }
            break;
        }
        var1_3 = ah.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block31;
                v4 /* !! */  = ah.fv;
                if (true) ** GOTO lbl46
                block32: while (true) {
                    v4 /* !! */  = (long)(ah.chgg("chwa", chgu(int ), (int)97) - ah.chgg("chvx", chgu(int ), (int)96));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1904350996: {
                            break block32;
                        }
                        case -921050343: {
                            continue block32;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ah.fv;
                if (true) ** GOTO lbl55
                block33: while (true) {
                    v5 /* !! */  = (long)(ah.chgg("chwc", chgu(int ), (int)99) - ah.chgg("chwb", chgu(int ), (int)98));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1904350996: {
                            break block33;
                        }
                        case 1435346747: {
                            continue block33;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ah.fv;
                if (true) ** GOTO lbl64
                block34: while (true) {
                    v6 /* !! */  = (long)(ah.chgg("chwg", chgu(int ), (int)101) - ah.chgg("chwe", chgu(int ), (int)100));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2026724228: {
                            continue block34;
                        }
                        case -1904350996: {
                            break block34;
                        }
                    }
                    break;
                }
                return new ArrayList<String>(this.blocks);
                case 0: {
                    var2_2 /* !! */  = (int)ah.chgg("chwi", chga(int ), (int)145);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl80
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ah.chgg("chwj", chga(int ), (int)146);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl80:
                // 2 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ah.chgg("chwo", chga(int ), (int)147);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ah.chgg("chwp", chga(int ), (int)148);
        ** while (!var3_1)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 64[SWITCH]
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

    private static /* synthetic */ long chgu(int n2) {
        return chgw[n2] ^ chgy[n2];
    }

    public static /* synthetic */ CallSite chgg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cing() {
        ah.chgf[200] = -369203877;
        ah.chgf[201] = -1551331000;
        ah.chgf[202] = 1747429054;
        ah.chgf[203] = 1305575792;
        ah.chgf[204] = 890191228;
        ah.chgf[205] = 804385859;
        ah.chgf[206] = 1239603715;
        ah.chgf[207] = 1321868149;
        ah.chgf[208] = -342256631;
        ah.chgf[209] = 125310699;
        ah.chgf[210] = 1337728123;
        ah.chgf[211] = -1716120620;
        ah.chgf[212] = -937901765;
        ah.chgf[213] = 112732277;
        ah.chgf[214] = -1579535230;
        ah.chgf[215] = -89303834;
        ah.chgf[216] = -1490735472;
        ah.chgf[217] = -1837351348;
        ah.chgf[218] = 1626129566;
        ah.chgf[219] = -1641526949;
        ah.chgf[220] = 1537953321;
        ah.chgf[221] = -706840031;
        ah.chgf[222] = 566852103;
        ah.chgf[223] = 1147617901;
        ah.chgf[224] = -944449804;
        ah.chgf[225] = 62190288;
        ah.chgf[226] = 1038263553;
        ah.chgf[227] = 1305514779;
        ah.chgf[228] = -309194530;
        ah.chgf[229] = 1561024377;
        ah.chgf[230] = 233311787;
        ah.chgf[231] = 629391851;
        ah.chgf[232] = -2004233527;
        ah.chgf[233] = -2070073773;
        ah.chgf[234] = -1118553971;
        ah.chgf[235] = 1061271765;
    }

    private static /* synthetic */ void cimj() {
        ah.chgf[0] = -1712616601;
        ah.chgf[1] = -158740838;
        ah.chgf[2] = 1465033126;
        ah.chgf[3] = 1902527730;
        ah.chgf[4] = -1037075220;
        ah.chgf[5] = 1075756318;
        ah.chgf[6] = 480813624;
        ah.chgf[7] = -550681099;
        ah.chgf[8] = 592348636;
        ah.chgf[9] = 1354858109;
        ah.chgf[10] = -333172469;
        ah.chgf[11] = 469435544;
        ah.chgf[12] = -1546087374;
        ah.chgf[13] = 179731771;
        ah.chgf[14] = 2073283877;
        ah.chgf[15] = 1345366671;
        ah.chgf[16] = -964809166;
        ah.chgf[17] = -400279125;
        ah.chgf[18] = 807476626;
        ah.chgf[19] = -187684982;
        ah.chgf[20] = 1890104300;
        ah.chgf[21] = -292849064;
        ah.chgf[22] = 940345414;
        ah.chgf[23] = -1112203745;
        ah.chgf[24] = 1811935660;
        ah.chgf[25] = -291156479;
        ah.chgf[26] = -1770375152;
        ah.chgf[27] = -770713415;
        ah.chgf[28] = 1712312394;
        ah.chgf[29] = -1525712681;
        ah.chgf[30] = -1777336116;
        ah.chgf[31] = -1337103414;
        ah.chgf[32] = -1506640415;
        ah.chgf[33] = -1239162768;
        ah.chgf[34] = 1894198280;
        ah.chgf[35] = -161928346;
        ah.chgf[36] = -1939637176;
        ah.chgf[37] = -1070581865;
        ah.chgf[38] = 1116367969;
        ah.chgf[39] = -1951514267;
        ah.chgf[40] = 176822486;
        ah.chgf[41] = -1570628655;
        ah.chgf[42] = 1823377415;
        ah.chgf[43] = -1872477880;
        ah.chgf[44] = -1823783537;
        ah.chgf[45] = -1315318471;
        ah.chgf[46] = -404092540;
        ah.chgf[47] = 572601004;
        ah.chgf[48] = -870789139;
        ah.chgf[49] = -2110936344;
        ah.chgf[50] = -716398181;
        ah.chgf[51] = 1824131681;
        ah.chgf[52] = 1569970962;
        ah.chgf[53] = 1295542681;
        ah.chgf[54] = 1794824871;
        ah.chgf[55] = -457825480;
        ah.chgf[56] = 849072305;
        ah.chgf[57] = -1990239524;
        ah.chgf[58] = -1815247072;
        ah.chgf[59] = 1622329783;
        ah.chgf[60] = -519992318;
        ah.chgf[61] = -160475083;
        ah.chgf[62] = 1194359751;
        ah.chgf[63] = 883286457;
        ah.chgf[64] = 1860975701;
        ah.chgf[65] = -2138605415;
        ah.chgf[66] = -310686166;
        ah.chgf[67] = 1975470589;
        ah.chgf[68] = -1763801580;
        ah.chgf[69] = 1309480070;
        ah.chgf[70] = -283482573;
        ah.chgf[71] = -1586044924;
        ah.chgf[72] = -892686610;
        ah.chgf[73] = -1330368315;
        ah.chgf[74] = 664584042;
        ah.chgf[75] = -1204598844;
        ah.chgf[76] = -1490391639;
        ah.chgf[77] = 646538515;
        ah.chgf[78] = -1774339117;
        ah.chgf[79] = -1157249834;
        ah.chgf[80] = -1332488024;
        ah.chgf[81] = 171717905;
        ah.chgf[82] = -743622703;
        ah.chgf[83] = -2099432980;
        ah.chgf[84] = -708361364;
        ah.chgf[85] = 868832953;
        ah.chgf[86] = -242000985;
        ah.chgf[87] = 0xF96FF69;
        ah.chgf[88] = -593014758;
        ah.chgf[89] = 1216070262;
        ah.chgf[90] = 1539241104;
        ah.chgf[91] = -2025443147;
        ah.chgf[92] = 2033545153;
        ah.chgf[93] = -321474862;
        ah.chgf[94] = -1241390967;
        ah.chgf[95] = 33251597;
        ah.chgf[96] = 1359403883;
        ah.chgf[97] = 1990534068;
        ah.chgf[98] = -318072979;
        ah.chgf[99] = 477765739;
    }

    private static /* synthetic */ int chga(int n2) {
        return chge[n2] ^ chgf[n2];
    }

    static {
        chge = new int[236];
        chgf = new int[236];
        ah.cild();
        ah.ciln();
        ah.cimc();
        ah.cimj();
        ah.cimu();
        ah.cing();
        chgw = new long[196];
        chgy = new long[196];
        ah.cino();
        ah.cioe();
        ah.cioo();
        ah.cioz();
    }
}

