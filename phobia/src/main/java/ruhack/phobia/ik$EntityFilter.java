/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import ruhack.phobia.c;
import ruhack.phobia.dl;
import ruhack.phobia.hb;

public class ik$EntityFilter {
    public static final boolean c;
    private static final long j = 4299140168450665110L;
    private final List<String> targetSettings;
    private static int[] bqk;
    private static long[] bqd;
    public static final boolean a;
    private static int[] bql;
    private static long[] bqe;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canAttackPlayer(class_1657 var1_1) {
        block72: {
            v0 /* !! */  = ik$EntityFilter.j;
            if (true) ** GOTO lbl5
            block38: while (true) {
                v0 /* !! */  = (long)(ik$EntityFilter.bqf("bvc", bqc(int ), (int)41) - ik$EntityFilter.bqf("bvb", bqc(int ), (int)40));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1810011498: {
                        break block38;
                    }
                    case 1026667569: {
                        continue block38;
                    }
                }
                break;
            }
            var5_2 = ik$EntityFilter.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = ik$EntityFilter.j - ik$EntityFilter.bqf("bvd", bqc(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ik$EntityFilter.bqf("bve", bqj(int ), (int)82)) break;
                v1 /* !! */  = (long)ik$EntityFilter.bqf("bvf", bqj(int ), (int)83);
            }
            var4_3 /* !! */  = ik$EntityFilter.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = ik$EntityFilter.j - ik$EntityFilter.bqf("bvg", bqc(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ik$EntityFilter.bqf("bvh", bqj(int ), (int)84)) break;
                v2 /* !! */  = (long)ik$EntityFilter.bqf("bvi", bqj(int ), (int)85);
            }
            var3_4 = ik$EntityFilter.a;
            if (var5_2) {
                throw null;
lbl27:
                // 10 sources

                return (boolean)ik$EntityFilter.bqf("bvj", bqj(int ), (int)86);
            }
            if (var3_4 || var3_4) ** GOTO lbl27
            v3 /* !! */  = ik$EntityFilter.j;
            if (true) ** GOTO lbl34
            block42: while (true) {
                v3 /* !! */  = (long)(v4 - ik$EntityFilter.bqf("bvk", bqc(int ), (int)44));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1810011498: {
                        break block42;
                    }
                    case -1024182397: {
                        v4 = ik$EntityFilter.bqf("bvl", bqc(int ), (int)45);
                        continue block42;
                    }
                    case 1170502339: {
                        v4 = ik$EntityFilter.bqf("bvm", bqc(int ), (int)46);
                        continue block42;
                    }
                }
                break;
            }
            if (!dl.isFriend((class_1297)var1_1)) break block72;
            if (var3_4 || var3_4) ** GOTO lbl27
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = ik$EntityFilter.j - ik$EntityFilter.bqf("bvn", bqc(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ik$EntityFilter.bqf("bvo", bqj(int ), (int)87)) break;
                v5 /* !! */  = (long)ik$EntityFilter.bqf("bvp", bqj(int ), (int)88);
            }
            v6 /* !! */  = ik$EntityFilter.j;
            if (true) ** GOTO lbl55
            block44: while (true) {
                v6 /* !! */  = (long)(ik$EntityFilter.bqf("bvr", bqc(int ), (int)49) - ik$EntityFilter.bqf("bvq", bqc(int ), (int)48));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1810011498: {
                        break block44;
                    }
                    case 1930152680: {
                        continue block44;
                    }
                }
                break;
            }
            v7 = this.targetSettings.contains("\u0414\u0440\u0443\u0437\u044c\u044f");
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl90
        }
        if (var3_4) ** GOTO lbl27
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl27
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ik$EntityFilter.j - ik$EntityFilter.bqf("bvs", bqc(int ), (int)50)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ik$EntityFilter.bqf("bvt", bqj(int ), (int)89)) break;
                    v8 /* !! */  = (long)ik$EntityFilter.bqf("bvu", bqj(int ), (int)90);
                }
                v9 /* !! */  = ik$EntityFilter.j;
                if (true) ** GOTO lbl80
                block46: while (true) {
                    v9 /* !! */  = (long)(v10 - ik$EntityFilter.bqf("bvv", bqc(int ), (int)51));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2024582562: {
                            v10 = ik$EntityFilter.bqf("bvw", bqc(int ), (int)52);
                            continue block46;
                        }
                        case -1810011498: {
                            break block46;
                        }
                        case 931672307: {
                            v10 = ik$EntityFilter.bqf("bvx", bqc(int ), (int)53);
                            continue block46;
                        }
                    }
                    break;
                }
                v7 = var2_5 = this.targetSettings.contains("\u0418\u0433\u0440\u043e\u043a\u0438");
lbl90:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl27
                if (!var2_5) ** GOTO lbl120
                if (var3_4) ** GOTO lbl27
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = ik$EntityFilter.j - ik$EntityFilter.bqf("bvy", bqc(int ), (int)54)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ik$EntityFilter.bqf("bvz", bqj(int ), (int)91)) break;
                    v11 /* !! */  = (long)ik$EntityFilter.bqf("bwa", bqj(int ), (int)92);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = ik$EntityFilter.j - ik$EntityFilter.bqf("bwb", bqc(int ), (int)55)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == ik$EntityFilter.bqf("bwc", bqj(int ), (int)93)) break;
                    v12 /* !! */  = (long)ik$EntityFilter.bqf("bwd", bqj(int ), (int)94);
                }
                if (this.targetSettings.contains("\u0413\u043e\u043b\u044b\u0435")) ** GOTO lbl115
                if (var3_4) ** GOTO lbl27
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = ik$EntityFilter.j - ik$EntityFilter.bqf("bwe", bqc(int ), (int)56)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == ik$EntityFilter.bqf("bwf", bqj(int ), (int)95)) break;
                    v13 /* !! */  = (long)ik$EntityFilter.bqf("bwg", bqj(int ), (int)96);
                }
                if (!this.hasArmor(var1_1)) ** GOTO lbl120
                if (var3_4) ** GOTO lbl27
lbl115:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl27
                v14 = ik$EntityFilter.bqf("bwh", bqj(int ), (int)97);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl123
lbl120:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v14 = ik$EntityFilter.bqf("bwi", bqj(int ), (int)98);
lbl123:
                // 2 sources

                return (boolean)v14;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwj", bqj(int ), (int)99);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl178
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwk", bqj(int ), (int)100);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 2: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwl", bqj(int ), (int)101);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl140:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwm", bqj(int ), (int)102);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl145:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwn", bqj(int ), (int)103);
                if (!var5_2) break;
                throw null;
            }
lbl149:
            // 4 sources

            case 5: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwo", bqj(int ), (int)104);
                if (!var5_2) break;
                throw null;
            }
lbl153:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwp", bqj(int ), (int)105);
                if (!var5_2) ** GOTO lbl140
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwq", bqj(int ), (int)106);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwr", bqj(int ), (int)107);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
lbl165:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bws", bqj(int ), (int)108);
                if (!var5_2) ** GOTO lbl140
                throw null;
            }
lbl169:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwt", bqj(int ), (int)109);
                if (var5_2) {
                    throw null;
                }
            }
lbl173:
            // 5 sources

            case 11: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwu", bqj(int ), (int)110);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl178:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwv", bqj(int ), (int)111);
                if (!var5_2) ** GOTO lbl165
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bww", bqj(int ), (int)112);
                if (!var5_2) ** GOTO lbl173
                throw null;
            }
            case 14: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwx", bqj(int ), (int)113);
                if (!var5_2) ** GOTO lbl169
                throw null;
            }
            case 15: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwy", bqj(int ), (int)114);
                if (!var5_2) ** GOTO lbl173
                throw null;
            }
lbl194:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bwz", bqj(int ), (int)115);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
            case 17: 
        }
        var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bxa", bqj(int ), (int)116);
        ** while (!var5_2)
lbl201:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cch() {
        ik$EntityFilter.bqe[0] = -3807840672330726553L;
        ik$EntityFilter.bqe[1] = 4643390483437510089L;
        ik$EntityFilter.bqe[2] = -8426873326439435404L;
        ik$EntityFilter.bqe[3] = 1187151436061606301L;
        ik$EntityFilter.bqe[4] = -7065648116578837061L;
        ik$EntityFilter.bqe[5] = -7904658851901672223L;
        ik$EntityFilter.bqe[6] = 2245608277899329767L;
        ik$EntityFilter.bqe[7] = -6798297959006160405L;
        ik$EntityFilter.bqe[8] = -1063036006115975639L;
        ik$EntityFilter.bqe[9] = -6539340632335337261L;
        ik$EntityFilter.bqe[10] = -7595858750162470157L;
        ik$EntityFilter.bqe[11] = 7818651428829714767L;
        ik$EntityFilter.bqe[12] = 9169198279724486678L;
        ik$EntityFilter.bqe[13] = -7253331472895419070L;
        ik$EntityFilter.bqe[14] = 8805565864453545038L;
        ik$EntityFilter.bqe[15] = -5373630100356014850L;
        ik$EntityFilter.bqe[16] = 3052568007122535418L;
        ik$EntityFilter.bqe[17] = 7794089687817054199L;
        ik$EntityFilter.bqe[18] = -3303931991979280546L;
        ik$EntityFilter.bqe[19] = -5007400608872969852L;
        ik$EntityFilter.bqe[20] = -4214435072963965870L;
        ik$EntityFilter.bqe[21] = 1274722570667543299L;
        ik$EntityFilter.bqe[22] = 8432133168292257402L;
        ik$EntityFilter.bqe[23] = -430640637903544869L;
        ik$EntityFilter.bqe[24] = -3239385669696861668L;
        ik$EntityFilter.bqe[25] = -6092701039989950215L;
        ik$EntityFilter.bqe[26] = 1708118226547534728L;
        ik$EntityFilter.bqe[27] = -8264472903597341877L;
        ik$EntityFilter.bqe[28] = 5421023635030333167L;
        ik$EntityFilter.bqe[29] = 4486168149912086307L;
        ik$EntityFilter.bqe[30] = 8499493308733150966L;
        ik$EntityFilter.bqe[31] = -4788004948075767990L;
        ik$EntityFilter.bqe[32] = -3341803599619878832L;
        ik$EntityFilter.bqe[33] = -3967121841638476440L;
        ik$EntityFilter.bqe[34] = -7842842947215538514L;
        ik$EntityFilter.bqe[35] = 2795478783053917928L;
        ik$EntityFilter.bqe[36] = -350932270635382745L;
        ik$EntityFilter.bqe[37] = -8462430478234099178L;
        ik$EntityFilter.bqe[38] = -4509866360895780623L;
        ik$EntityFilter.bqe[39] = 1047128019452198566L;
        ik$EntityFilter.bqe[40] = 2604653808998672516L;
        ik$EntityFilter.bqe[41] = 393907715397562558L;
        ik$EntityFilter.bqe[42] = -8564566425638925462L;
        ik$EntityFilter.bqe[43] = 6559871492048343359L;
        ik$EntityFilter.bqe[44] = -2371599039278097579L;
        ik$EntityFilter.bqe[45] = 1270502596066683094L;
        ik$EntityFilter.bqe[46] = 3223561278241526331L;
        ik$EntityFilter.bqe[47] = 390335273953323864L;
        ik$EntityFilter.bqe[48] = 4819310605842233224L;
        ik$EntityFilter.bqe[49] = 5235028789485658450L;
        ik$EntityFilter.bqe[50] = -3849890031577775004L;
        ik$EntityFilter.bqe[51] = -9117772064042383200L;
        ik$EntityFilter.bqe[52] = -8182972442261617151L;
        ik$EntityFilter.bqe[53] = -1654407856747194422L;
        ik$EntityFilter.bqe[54] = -2398622427773788904L;
        ik$EntityFilter.bqe[55] = -669233228018805337L;
        ik$EntityFilter.bqe[56] = -7507254758462049607L;
        ik$EntityFilter.bqe[57] = -5943731272449094202L;
        ik$EntityFilter.bqe[58] = 2698965337784179055L;
        ik$EntityFilter.bqe[59] = 8367175638436912052L;
        ik$EntityFilter.bqe[60] = -4798820332923013880L;
        ik$EntityFilter.bqe[61] = 7433174401425251208L;
        ik$EntityFilter.bqe[62] = -8227669575701737112L;
        ik$EntityFilter.bqe[63] = -8653061858250866644L;
        ik$EntityFilter.bqe[64] = 6403684249917408335L;
        ik$EntityFilter.bqe[65] = 3164983309131481409L;
        ik$EntityFilter.bqe[66] = -6043729629756923100L;
        ik$EntityFilter.bqe[67] = -5840665016704033050L;
        ik$EntityFilter.bqe[68] = 4813520624347310376L;
        ik$EntityFilter.bqe[69] = -8752228801382284485L;
        ik$EntityFilter.bqe[70] = 1972445305532958896L;
        ik$EntityFilter.bqe[71] = -7564588149977586662L;
        ik$EntityFilter.bqe[72] = 375176489099492895L;
        ik$EntityFilter.bqe[73] = -4961545067442788040L;
        ik$EntityFilter.bqe[74] = 3835570604486853009L;
        ik$EntityFilter.bqe[75] = -2440917911473987661L;
        ik$EntityFilter.bqe[76] = -450801266946306882L;
        ik$EntityFilter.bqe[77] = 4451096074876619525L;
        ik$EntityFilter.bqe[78] = -5748755637029592057L;
        ik$EntityFilter.bqe[79] = 4539143892771811882L;
        ik$EntityFilter.bqe[80] = 4796724737166277039L;
        ik$EntityFilter.bqe[81] = 5289525266795781877L;
        ik$EntityFilter.bqe[82] = 5887359796343381684L;
        ik$EntityFilter.bqe[83] = 759815104864072291L;
        ik$EntityFilter.bqe[84] = 3573970168208579525L;
        ik$EntityFilter.bqe[85] = 3727685688753250152L;
        ik$EntityFilter.bqe[86] = -768984898962970584L;
        ik$EntityFilter.bqe[87] = 8639175120427369252L;
        ik$EntityFilter.bqe[88] = 1249899714551038183L;
        ik$EntityFilter.bqe[89] = -7223764565452618832L;
        ik$EntityFilter.bqe[90] = 2735574579531389605L;
        ik$EntityFilter.bqe[91] = 8345132700668448564L;
        ik$EntityFilter.bqe[92] = -5000580173406966080L;
        ik$EntityFilter.bqe[93] = 6337680280083883047L;
        ik$EntityFilter.bqe[94] = -1804590641804186890L;
        ik$EntityFilter.bqe[95] = -3386158463063502436L;
        ik$EntityFilter.bqe[96] = -8348215859715305664L;
        ik$EntityFilter.bqe[97] = 179091374684230472L;
        ik$EntityFilter.bqe[98] = 1421173061016374761L;
        ik$EntityFilter.bqe[99] = 925397436546320537L;
    }

    private static /* synthetic */ void cbz() {
        ik$EntityFilter.bql[0] = 2078847283;
        ik$EntityFilter.bql[1] = -1905878620;
        ik$EntityFilter.bql[2] = -223860019;
        ik$EntityFilter.bql[3] = -749748825;
        ik$EntityFilter.bql[4] = 1526551978;
        ik$EntityFilter.bql[5] = -16828759;
        ik$EntityFilter.bql[6] = 317098959;
        ik$EntityFilter.bql[7] = 881277241;
        ik$EntityFilter.bql[8] = 1600060674;
        ik$EntityFilter.bql[9] = 1619037895;
        ik$EntityFilter.bql[10] = 1901968611;
        ik$EntityFilter.bql[11] = 456042184;
        ik$EntityFilter.bql[12] = 876172924;
        ik$EntityFilter.bql[13] = -1145113851;
        ik$EntityFilter.bql[14] = 102566040;
        ik$EntityFilter.bql[15] = 333713269;
        ik$EntityFilter.bql[16] = 701608315;
        ik$EntityFilter.bql[17] = 818009207;
        ik$EntityFilter.bql[18] = -1508013854;
        ik$EntityFilter.bql[19] = 452163946;
        ik$EntityFilter.bql[20] = -941830484;
        ik$EntityFilter.bql[21] = -1935701081;
        ik$EntityFilter.bql[22] = 1248839111;
        ik$EntityFilter.bql[23] = -1256576517;
        ik$EntityFilter.bql[24] = -1602214304;
        ik$EntityFilter.bql[25] = -1385285269;
        ik$EntityFilter.bql[26] = -1263619983;
        ik$EntityFilter.bql[27] = -1939857496;
        ik$EntityFilter.bql[28] = -285317290;
        ik$EntityFilter.bql[29] = 142073536;
        ik$EntityFilter.bql[30] = -923756392;
        ik$EntityFilter.bql[31] = -1153526200;
        ik$EntityFilter.bql[32] = 1214391981;
        ik$EntityFilter.bql[33] = 184734930;
        ik$EntityFilter.bql[34] = -260312254;
        ik$EntityFilter.bql[35] = 1864055410;
        ik$EntityFilter.bql[36] = -1623526308;
        ik$EntityFilter.bql[37] = 1159482709;
        ik$EntityFilter.bql[38] = 1440308694;
        ik$EntityFilter.bql[39] = -1572710110;
        ik$EntityFilter.bql[40] = 562165696;
        ik$EntityFilter.bql[41] = -2110108684;
        ik$EntityFilter.bql[42] = -588775534;
        ik$EntityFilter.bql[43] = 441670883;
        ik$EntityFilter.bql[44] = -1325811563;
        ik$EntityFilter.bql[45] = -1991717608;
        ik$EntityFilter.bql[46] = -690319132;
        ik$EntityFilter.bql[47] = 2007113501;
        ik$EntityFilter.bql[48] = -1563992912;
        ik$EntityFilter.bql[49] = 837674324;
        ik$EntityFilter.bql[50] = -1219115476;
        ik$EntityFilter.bql[51] = 2058268519;
        ik$EntityFilter.bql[52] = -1807493197;
        ik$EntityFilter.bql[53] = 2031413137;
        ik$EntityFilter.bql[54] = 891222511;
        ik$EntityFilter.bql[55] = 225633461;
        ik$EntityFilter.bql[56] = -965611105;
        ik$EntityFilter.bql[57] = 1563191603;
        ik$EntityFilter.bql[58] = 777016432;
        ik$EntityFilter.bql[59] = -1021801791;
        ik$EntityFilter.bql[60] = 1003108798;
        ik$EntityFilter.bql[61] = 283411505;
        ik$EntityFilter.bql[62] = 1526939607;
        ik$EntityFilter.bql[63] = -858167257;
        ik$EntityFilter.bql[64] = 139511843;
        ik$EntityFilter.bql[65] = -411824502;
        ik$EntityFilter.bql[66] = 1874586102;
        ik$EntityFilter.bql[67] = -1072921565;
        ik$EntityFilter.bql[68] = -387751275;
        ik$EntityFilter.bql[69] = 1392267600;
        ik$EntityFilter.bql[70] = 1206904486;
        ik$EntityFilter.bql[71] = -415179375;
        ik$EntityFilter.bql[72] = -1353277982;
        ik$EntityFilter.bql[73] = -96862971;
        ik$EntityFilter.bql[74] = 36954461;
        ik$EntityFilter.bql[75] = 352647636;
        ik$EntityFilter.bql[76] = -469643222;
        ik$EntityFilter.bql[77] = -1190004509;
        ik$EntityFilter.bql[78] = 1220363634;
        ik$EntityFilter.bql[79] = -1792818552;
        ik$EntityFilter.bql[80] = -822035586;
        ik$EntityFilter.bql[81] = 1975259972;
        ik$EntityFilter.bql[82] = 499127972;
        ik$EntityFilter.bql[83] = 1586965656;
        ik$EntityFilter.bql[84] = 1166535013;
        ik$EntityFilter.bql[85] = -210547591;
        ik$EntityFilter.bql[86] = -1321949737;
        ik$EntityFilter.bql[87] = -1579371938;
        ik$EntityFilter.bql[88] = 718522963;
        ik$EntityFilter.bql[89] = 753726716;
        ik$EntityFilter.bql[90] = 1309445542;
        ik$EntityFilter.bql[91] = -553855210;
        ik$EntityFilter.bql[92] = 1580838318;
        ik$EntityFilter.bql[93] = -92863108;
        ik$EntityFilter.bql[94] = 1043352571;
        ik$EntityFilter.bql[95] = -970590706;
        ik$EntityFilter.bql[96] = 1441566246;
        ik$EntityFilter.bql[97] = 685272619;
        ik$EntityFilter.bql[98] = -784103387;
        ik$EntityFilter.bql[99] = -1243662078;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ik$EntityFilter(List<String> var1_1) {
        var3_2 /* !! */  = ik$EntityFilter.b;
        var2_3 = ik$EntityFilter.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.targetSettings = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)ik$EntityFilter.bqf("cbr", bqj(int ), (int)184);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ik$EntityFilter.bqf("cbs", bqj(int ), (int)185);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)ik$EntityFilter.bqf("cbt", bqj(int ), (int)186);
        ** while (true)
    }

    private static /* synthetic */ void cbu() {
        ik$EntityFilter.bqk[0] = 2078847282;
        ik$EntityFilter.bqk[1] = -635003059;
        ik$EntityFilter.bqk[2] = -223860020;
        ik$EntityFilter.bqk[3] = -617238941;
        ik$EntityFilter.bqk[4] = 1526551978;
        ik$EntityFilter.bqk[5] = -16828759;
        ik$EntityFilter.bqk[6] = 317098959;
        ik$EntityFilter.bqk[7] = 881277240;
        ik$EntityFilter.bqk[8] = 1886420346;
        ik$EntityFilter.bqk[9] = 1619037895;
        ik$EntityFilter.bqk[10] = 1901968610;
        ik$EntityFilter.bqk[11] = -1294189600;
        ik$EntityFilter.bqk[12] = 876172923;
        ik$EntityFilter.bqk[13] = -1145113850;
        ik$EntityFilter.bqk[14] = 102566041;
        ik$EntityFilter.bqk[15] = 333713269;
        ik$EntityFilter.bqk[16] = 701608307;
        ik$EntityFilter.bqk[17] = 818009209;
        ik$EntityFilter.bqk[18] = -1508013851;
        ik$EntityFilter.bqk[19] = 452163951;
        ik$EntityFilter.bqk[20] = -941830496;
        ik$EntityFilter.bqk[21] = -1935701083;
        ik$EntityFilter.bqk[22] = 1248839110;
        ik$EntityFilter.bqk[23] = -1256576515;
        ik$EntityFilter.bqk[24] = -1602214302;
        ik$EntityFilter.bqk[25] = -1385285274;
        ik$EntityFilter.bqk[26] = -1263619973;
        ik$EntityFilter.bqk[27] = -1939857495;
        ik$EntityFilter.bqk[28] = 2015748723;
        ik$EntityFilter.bqk[29] = 142073537;
        ik$EntityFilter.bqk[30] = -1929427756;
        ik$EntityFilter.bqk[31] = -1153526199;
        ik$EntityFilter.bqk[32] = 671485387;
        ik$EntityFilter.bqk[33] = 184734930;
        ik$EntityFilter.bqk[34] = -260312253;
        ik$EntityFilter.bqk[35] = -416095163;
        ik$EntityFilter.bqk[36] = -1623526307;
        ik$EntityFilter.bqk[37] = 1282511672;
        ik$EntityFilter.bqk[38] = 1440308695;
        ik$EntityFilter.bqk[39] = -1572710110;
        ik$EntityFilter.bqk[40] = 562165698;
        ik$EntityFilter.bqk[41] = -2110108681;
        ik$EntityFilter.bqk[42] = -588775533;
        ik$EntityFilter.bqk[43] = 441670886;
        ik$EntityFilter.bqk[44] = -1325811561;
        ik$EntityFilter.bqk[45] = -1991717604;
        ik$EntityFilter.bqk[46] = -690319129;
        ik$EntityFilter.bqk[47] = 2007113497;
        ik$EntityFilter.bqk[48] = -1563992911;
        ik$EntityFilter.bqk[49] = 837674325;
        ik$EntityFilter.bqk[50] = 994296278;
        ik$EntityFilter.bqk[51] = 2058268518;
        ik$EntityFilter.bqk[52] = -1807493197;
        ik$EntityFilter.bqk[53] = 2031413143;
        ik$EntityFilter.bqk[54] = 891222502;
        ik$EntityFilter.bqk[55] = 225633471;
        ik$EntityFilter.bqk[56] = -965611114;
        ik$EntityFilter.bqk[57] = 1563191609;
        ik$EntityFilter.bqk[58] = 777016435;
        ik$EntityFilter.bqk[59] = -1021801787;
        ik$EntityFilter.bqk[60] = 1003108791;
        ik$EntityFilter.bqk[61] = 283411508;
        ik$EntityFilter.bqk[62] = 1526939603;
        ik$EntityFilter.bqk[63] = -858167258;
        ik$EntityFilter.bqk[64] = -139511844;
        ik$EntityFilter.bqk[65] = 2125098272;
        ik$EntityFilter.bqk[66] = 1874586103;
        ik$EntityFilter.bqk[67] = 1072921564;
        ik$EntityFilter.bqk[68] = 1804178592;
        ik$EntityFilter.bqk[69] = 1392267601;
        ik$EntityFilter.bqk[70] = 1206904486;
        ik$EntityFilter.bqk[71] = -415179365;
        ik$EntityFilter.bqk[72] = -1353277976;
        ik$EntityFilter.bqk[73] = -96862963;
        ik$EntityFilter.bqk[74] = 36954452;
        ik$EntityFilter.bqk[75] = 352647635;
        ik$EntityFilter.bqk[76] = -469643222;
        ik$EntityFilter.bqk[77] = -1190004507;
        ik$EntityFilter.bqk[78] = 1220363643;
        ik$EntityFilter.bqk[79] = -1792818546;
        ik$EntityFilter.bqk[80] = -822035588;
        ik$EntityFilter.bqk[81] = 1975259969;
        ik$EntityFilter.bqk[82] = 499127973;
        ik$EntityFilter.bqk[83] = 1879703933;
        ik$EntityFilter.bqk[84] = 1166535012;
        ik$EntityFilter.bqk[85] = -1158350064;
        ik$EntityFilter.bqk[86] = -1321949737;
        ik$EntityFilter.bqk[87] = 1579371937;
        ik$EntityFilter.bqk[88] = 90038776;
        ik$EntityFilter.bqk[89] = 753726717;
        ik$EntityFilter.bqk[90] = 1169874160;
        ik$EntityFilter.bqk[91] = 553855209;
        ik$EntityFilter.bqk[92] = 2080860011;
        ik$EntityFilter.bqk[93] = -92863107;
        ik$EntityFilter.bqk[94] = -514385274;
        ik$EntityFilter.bqk[95] = -970590705;
        ik$EntityFilter.bqk[96] = 1094299578;
        ik$EntityFilter.bqk[97] = 685272618;
        ik$EntityFilter.bqk[98] = -784103387;
        ik$EntityFilter.bqk[99] = -1243662078;
    }

    /*
     * Exception decompiling
     */
    private boolean isValidEntityType(class_1309 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 16[SWITCH]
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
    private boolean isLocalPlayer(class_1309 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ik$EntityFilter.j - ik$EntityFilter.bqf("brw", bqc(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ik$EntityFilter.bqf("brx", bqj(int ), (int)27)) break;
            v0 /* !! */  = (long)ik$EntityFilter.bqf("bry", bqj(int ), (int)28);
        }
        var4_2 = ik$EntityFilter.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ik$EntityFilter.j - ik$EntityFilter.bqf("brz", bqc(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ik$EntityFilter.bqf("bsa", bqj(int ), (int)29)) break;
            v1 /* !! */  = (long)ik$EntityFilter.bqf("bsb", bqj(int ), (int)30);
        }
        var3_3 /* !! */  = ik$EntityFilter.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = ik$EntityFilter.j - ik$EntityFilter.bqf("bsc", bqc(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ik$EntityFilter.bqf("bsd", bqj(int ), (int)31)) break;
                    v2 /* !! */  = (long)ik$EntityFilter.bqf("bse", bqj(int ), (int)32);
                }
                var2_4 = ik$EntityFilter.a;
                if (var4_2) {
                    throw null;
lbl27:
                    // 3 sources

                    return (boolean)ik$EntityFilter.bqf("bsf", bqj(int ), (int)33);
                }
                if (var2_4 || var2_4) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ik$EntityFilter.j - ik$EntityFilter.bqf("bsg", bqc(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ik$EntityFilter.bqf("bsh", bqj(int ), (int)34)) break;
                    v3 /* !! */  = (long)ik$EntityFilter.bqf("bsi", bqj(int ), (int)35);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = ik$EntityFilter.j - ik$EntityFilter.bqf("bsj", bqc(int ), (int)16)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ik$EntityFilter.bqf("bsk", bqj(int ), (int)36)) break;
                    v4 /* !! */  = (long)ik$EntityFilter.bqf("bsl", bqj(int ), (int)37);
                }
                if (var1_1 != ruhack.phobia.c.mc.field_1724) ** GOTO lbl48
                if (var2_4) ** GOTO lbl27
                v5 = ik$EntityFilter.bqf("bsm", bqj(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl51
lbl48:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v5 = ik$EntityFilter.bqf("bsn", bqj(int ), (int)39);
lbl51:
                // 2 sources

                return (boolean)v5;
            }
lbl52:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bso", bqj(int ), (int)40);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl76
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bsp", bqj(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bsq", bqj(int ), (int)42);
                } while (!var4_2);
                throw null;
            }
lbl68:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bsr", bqj(int ), (int)43);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bss", bqj(int ), (int)44);
                if (!var4_2) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bst", bqj(int ), (int)45);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
lbl80:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bsu", bqj(int ), (int)46);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bsv", bqj(int ), (int)47);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ccj() {
        ik$EntityFilter.bqe[100] = -4715529503636589767L;
        ik$EntityFilter.bqe[101] = -5852954246390002824L;
        ik$EntityFilter.bqe[102] = 1548355349647452535L;
        ik$EntityFilter.bqe[103] = 9155869934197334782L;
        ik$EntityFilter.bqe[104] = -4497541633998636386L;
        ik$EntityFilter.bqe[105] = -6275557901459185526L;
        ik$EntityFilter.bqe[106] = 1009141037860535563L;
        ik$EntityFilter.bqe[107] = -661044981682348697L;
        ik$EntityFilter.bqe[108] = 1372269255595289380L;
    }

    public static /* synthetic */ CallSite bqf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean isInvalidHealth(class_1309 class_13092) {
        CallSite callSite;
        boolean bl2;
        block38: {
            Object object = j;
            block20: while (true) {
                switch ((int)object) {
                    case -1810011498: {
                        break block20;
                    }
                    case -66537343: {
                        object = ik$EntityFilter.bqf("bsx", bqc(int ), (int)18) - ik$EntityFilter.bqf("bsw", bqc(int ), (int)17);
                        continue block20;
                    }
                }
                break;
            }
            boolean bl3 = c;
            Object object2 = j;
            boolean bl4 = true;
            block21: while (true) {
                CallSite callSite2;
                if (!bl4 || (bl4 = false) || !true) {
                    object2 = callSite2 - ik$EntityFilter.bqf("bsy", bqc(int ), (int)19);
                }
                switch ((int)object2) {
                    case -1892422024: {
                        callSite2 = ik$EntityFilter.bqf("bsz", bqc(int ), (int)20);
                        continue block21;
                    }
                    case -1810011498: {
                        break block21;
                    }
                    case -1714766766: {
                        callSite2 = ik$EntityFilter.bqf("bta", bqc(int ), (int)21);
                        continue block21;
                    }
                }
                break;
            }
            int n2 = b;
            Object object3 = j;
            boolean bl5 = true;
            block22: while (true) {
                CallSite callSite3;
                if (!bl5 || (bl5 = false) || !true) {
                    object3 = callSite3 - ik$EntityFilter.bqf("btb", bqc(int ), (int)22);
                }
                switch ((int)object3) {
                    case -1810011498: {
                        break block22;
                    }
                    case 696787442: {
                        callSite3 = ik$EntityFilter.bqf("btc", bqc(int ), (int)23);
                        continue block22;
                    }
                    case 1773175781: {
                        callSite3 = ik$EntityFilter.bqf("btd", bqc(int ), (int)24);
                        continue block22;
                    }
                }
                break;
            }
            bl2 = a;
            if (bl3) {
                throw null;
            }
            if (bl2 || bl2) return (boolean)ik$EntityFilter.bqf("bte", bqj(int ), (int)48);
            Object object4 = j;
            boolean bl6 = true;
            block23: while (true) {
                CallSite callSite4;
                if (!bl6 || (bl6 = false) || !true) {
                    object4 = callSite4 - ik$EntityFilter.bqf("btf", bqc(int ), (int)25);
                }
                switch ((int)object4) {
                    case -2058210171: {
                        callSite4 = ik$EntityFilter.bqf("btg", bqc(int ), (int)26);
                        continue block23;
                    }
                    case -1810011498: {
                        break block23;
                    }
                    case -1803505581: {
                        callSite4 = ik$EntityFilter.bqf("bth", bqc(int ), (int)27);
                        continue block23;
                    }
                    case -274923886: {
                        callSite4 = ik$EntityFilter.bqf("bti", bqc(int ), (int)28);
                        continue block23;
                    }
                }
                break;
            }
            if (class_13092.method_5805()) {
                if (bl2) return (boolean)ik$EntityFilter.bqf("bte", bqj(int ), (int)48);
                while (true) {
                    long l2;
                    Object object5;
                    if ((object5 = (l2 = j - ik$EntityFilter.bqf("btj", bqc(int ), (int)29)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (object5 == ik$EntityFilter.bqf("btk", bqj(int ), (int)49)) {
                        if (class_13092.method_6032() <= 0.0f) {
                            break;
                        }
                        break block38;
                    }
                    object5 = ik$EntityFilter.bqf("btl", bqj(int ), (int)50);
                }
                if (bl2) return (boolean)ik$EntityFilter.bqf("bte", bqj(int ), (int)48);
            }
            if (bl2 || bl2) return (boolean)ik$EntityFilter.bqf("bte", bqj(int ), (int)48);
            callSite = ik$EntityFilter.bqf("btm", bqj(int ), (int)51);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)ik$EntityFilter.bqf("bte", bqj(int ), (int)48);
        }
        callSite = ik$EntityFilter.bqf("btn", bqj(int ), (int)52);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isBotPlayer(class_1309 var1_1) {
        v0 /* !! */  = ik$EntityFilter.j;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(ik$EntityFilter.bqf("bua", bqc(int ), (int)31) - ik$EntityFilter.bqf("btz", bqc(int ), (int)30));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1810011498: {
                    break block27;
                }
                case -882151083: {
                    continue block27;
                }
            }
            break;
        }
        var5_2 = ik$EntityFilter.c;
        v1 /* !! */  = ik$EntityFilter.j;
        if (true) ** GOTO lbl15
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - ik$EntityFilter.bqf("bub", bqc(int ), (int)32));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2120615083: {
                    v2 = ik$EntityFilter.bqf("buc", bqc(int ), (int)33);
                    continue block28;
                }
                case -1810011498: {
                    break block28;
                }
                case -395835413: {
                    v2 = ik$EntityFilter.bqf("bud", bqc(int ), (int)34);
                    continue block28;
                }
            }
            break;
        }
        var4_3 /* !! */  = ik$EntityFilter.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ik$EntityFilter.j - ik$EntityFilter.bqf("bue", bqc(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ik$EntityFilter.bqf("buf", bqj(int ), (int)64)) break;
            v3 /* !! */  = (long)ik$EntityFilter.bqf("bug", bqj(int ), (int)65);
        }
        var3_4 = ik$EntityFilter.a;
        if (var5_2) {
            throw null;
lbl33:
            // 5 sources

            return (boolean)ik$EntityFilter.bqf("buh", bqj(int ), (int)66);
        }
        if (var3_4 || var3_4) ** GOTO lbl33
        if (!(var1_1 instanceof class_1657)) ** GOTO lbl68
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl33
                var2_5 = (class_1657)var1_1;
                if (var3_4 || var3_4) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ik$EntityFilter.j - ik$EntityFilter.bqf("bui", bqc(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ik$EntityFilter.bqf("buj", bqj(int ), (int)67)) break;
                    v4 /* !! */  = (long)ik$EntityFilter.bqf("buk", bqj(int ), (int)68);
                }
                v5 = hb.getInstance();
                v6 /* !! */  = ik$EntityFilter.j;
                if (true) ** GOTO lbl53
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - ik$EntityFilter.bqf("bul", bqc(int ), (int)37));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1810011498: {
                            break block32;
                        }
                        case 1490254374: {
                            v7 = ik$EntityFilter.bqf("bum", bqc(int ), (int)38);
                            continue block32;
                        }
                        case 1719529449: {
                            v7 = ik$EntityFilter.bqf("bun", bqc(int ), (int)39);
                            continue block32;
                        }
                    }
                    break;
                }
                if (!v5.isBot(var2_5)) ** GOTO lbl68
                if (var3_4) ** GOTO lbl33
                v8 = ik$EntityFilter.bqf("buo", bqj(int ), (int)69);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl71
lbl68:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v8 = ik$EntityFilter.bqf("bup", bqj(int ), (int)70);
lbl71:
                // 2 sources

                return (boolean)v8;
            }
            case 0: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("buq", bqj(int ), (int)71);
                if (!var5_2) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bur", bqj(int ), (int)72);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 2: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bus", bqj(int ), (int)73);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl86:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ik$EntityFilter.bqf("but", bqj(int ), (int)74);
                    if (!var5_2) break block9;
                    throw null;
                }
            }
lbl91:
            // 4 sources

            case 4: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("buu", bqj(int ), (int)75);
                if (!var5_2) ** GOTO lbl76
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("buv", bqj(int ), (int)76);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 6: {
                do {
                    var4_3 /* !! */  = (int)ik$EntityFilter.bqf("buw", bqj(int ), (int)77);
                } while (!var5_2);
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bux", bqj(int ), (int)78);
                if (!var5_2) break;
                throw null;
            }
lbl109:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("buy", bqj(int ), (int)79);
                if (!var5_2) ** GOTO lbl91
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)ik$EntityFilter.bqf("buz", bqj(int ), (int)80);
                if (!var5_2) ** GOTO lbl86
                throw null;
            }
            case 10: 
        }
        var4_3 /* !! */  = (int)ik$EntityFilter.bqf("bva", bqj(int ), (int)81);
        ** while (!var5_2)
lbl120:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isValid(class_1309 var1_1) {
        block59: {
            block58: {
                block57: {
                    v0 /* !! */  = ik$EntityFilter.j;
                    if (true) ** GOTO lbl5
                    block31: while (true) {
                        v0 /* !! */  = (long)(ik$EntityFilter.bqf("bqh", bqc(int ), (int)1) - ik$EntityFilter.bqf("bqg", bqc(int ), (int)0));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1810011498: {
                                break block31;
                            }
                            case -77472817: {
                                continue block31;
                            }
                        }
                        break;
                    }
                    var4_2 = ik$EntityFilter.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_0 = ik$EntityFilter.j - ik$EntityFilter.bqf("bqi", bqc(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v1 /* !! */  == ik$EntityFilter.bqf("bqm", bqj(int ), (int)0)) break;
                        v1 /* !! */  = (long)ik$EntityFilter.bqf("bqn", bqj(int ), (int)1);
                    }
                    var3_3 /* !! */  = ik$EntityFilter.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_1 = ik$EntityFilter.j - ik$EntityFilter.bqf("bqo", bqc(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v2 /* !! */  == ik$EntityFilter.bqf("bqp", bqj(int ), (int)2)) break;
                        v2 /* !! */  = (long)ik$EntityFilter.bqf("bqq", bqj(int ), (int)3);
                    }
                    var2_4 = ik$EntityFilter.a;
                    if (var4_2) {
                        throw null;
lbl27:
                        // 8 sources

                        return (boolean)ik$EntityFilter.bqf("bqr", bqj(int ), (int)4);
                    }
                    if (var2_4 || var2_4) ** GOTO lbl27
                    v3 /* !! */  = ik$EntityFilter.j;
                    if (true) ** GOTO lbl34
                    block35: while (true) {
                        v3 /* !! */  = (long)(v4 - ik$EntityFilter.bqf("bqs", bqc(int ), (int)4));
lbl34:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1810011498: {
                                break block35;
                            }
                            case 915095635: {
                                v4 = ik$EntityFilter.bqf("bqt", bqc(int ), (int)5);
                                continue block35;
                            }
                            case 1670828247: {
                                v4 = ik$EntityFilter.bqf("bqu", bqc(int ), (int)6);
                                continue block35;
                            }
                        }
                        break;
                    }
                    if (!this.isLocalPlayer(var1_1)) break block57;
                    if (var2_4) ** GOTO lbl27
                    return (boolean)ik$EntityFilter.bqf("bqv", bqj(int ), (int)5);
                }
                if (var2_4 || var2_4) ** GOTO lbl27
                v5 /* !! */  = ik$EntityFilter.j;
                if (true) ** GOTO lbl52
                block36: while (true) {
                    v5 /* !! */  = (long)(v6 - ik$EntityFilter.bqf("bqw", bqc(int ), (int)7));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1810011498: {
                            break block36;
                        }
                        case -557722470: {
                            v6 = ik$EntityFilter.bqf("bqx", bqc(int ), (int)8);
                            continue block36;
                        }
                        case 2140472432: {
                            v6 = ik$EntityFilter.bqf("bqy", bqc(int ), (int)9);
                            continue block36;
                        }
                    }
                    break;
                }
                if (!this.isInvalidHealth(var1_1)) break block58;
                if (var2_4) ** GOTO lbl27
                return (boolean)ik$EntityFilter.bqf("bqz", bqj(int ), (int)6);
            }
            if (var2_4 || var2_4) ** GOTO lbl27
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = ik$EntityFilter.j - ik$EntityFilter.bqf("bra", bqc(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == ik$EntityFilter.bqf("brb", bqj(int ), (int)7)) break;
                v7 /* !! */  = (long)ik$EntityFilter.bqf("brc", bqj(int ), (int)8);
            }
            if (!this.isBotPlayer(var1_1)) break block59;
            if (var2_4) ** GOTO lbl27
            return (boolean)ik$EntityFilter.bqf("brd", bqj(int ), (int)9);
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ik$EntityFilter.j - ik$EntityFilter.bqf("bre", bqc(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ik$EntityFilter.bqf("brf", bqj(int ), (int)10)) break;
                    v8 /* !! */  = (long)ik$EntityFilter.bqf("brg", bqj(int ), (int)11);
                }
                return this.isValidEntityType(var1_1);
            }
lbl89:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brh", bqj(int ), (int)12);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl138
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bri", bqj(int ), (int)13);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 2: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brj", bqj(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 3: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brk", bqj(int ), (int)15);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl110:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brl", bqj(int ), (int)16);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brm", bqj(int ), (int)17);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brn", bqj(int ), (int)18);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl125:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bro", bqj(int ), (int)19);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 8: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brp", bqj(int ), (int)20);
                if (!var4_2) break;
                throw null;
            }
lbl134:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brq", bqj(int ), (int)21);
                if (!var4_2) break;
                throw null;
            }
lbl138:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brr", bqj(int ), (int)22);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
lbl142:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brs", bqj(int ), (int)23);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl147:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brt", bqj(int ), (int)24);
                if (!var4_2) ** GOTO lbl134
                throw null;
            }
lbl151:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bru", bqj(int ), (int)25);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
            case 14: 
        }
        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("brv", bqj(int ), (int)26);
        ** while (!var4_2)
lbl158:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean hasArmor(class_1657 var1_1) {
        v0 /* !! */  = ik$EntityFilter.j;
        if (true) ** GOTO lbl5
        block58: while (true) {
            v0 /* !! */  = (long)(v1 - ik$EntityFilter.bqf("bxb", bqc(int ), (int)57));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1810011498: {
                    break block58;
                }
                case -1404455727: {
                    v1 = ik$EntityFilter.bqf("bxc", bqc(int ), (int)58);
                    continue block58;
                }
                case -697202038: {
                    v1 = ik$EntityFilter.bqf("bxd", bqc(int ), (int)59);
                    continue block58;
                }
                case 2017574040: {
                    v1 = ik$EntityFilter.bqf("bxe", bqc(int ), (int)60);
                    continue block58;
                }
            }
            break;
        }
        var4_2 = ik$EntityFilter.c;
        v2 /* !! */  = ik$EntityFilter.j;
        if (true) ** GOTO lbl22
        block59: while (true) {
            v2 /* !! */  = (long)(v3 - ik$EntityFilter.bqf("bxf", bqc(int ), (int)61));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1810011498: {
                    break block59;
                }
                case 217925526: {
                    v3 = ik$EntityFilter.bqf("bxg", bqc(int ), (int)62);
                    continue block59;
                }
                case 231748359: {
                    v3 = ik$EntityFilter.bqf("bxh", bqc(int ), (int)63);
                    continue block59;
                }
            }
            break;
        }
        var3_3 /* !! */  = ik$EntityFilter.b;
        v4 /* !! */  = ik$EntityFilter.j;
        block60: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -1810011498: {
                    break block60;
                }
                case 1160557005: {
                    v4 /* !! */  = (long)(ik$EntityFilter.bqf("bxj", bqc(int ), (int)65) - ik$EntityFilter.bqf("bxi", bqc(int ), (int)64));
                    continue block60;
                }
            }
            break;
        }
        var2_4 = ik$EntityFilter.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block61: while (true) {
            block102: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
                        v5 /* !! */  = ik$EntityFilter.j;
                        block62: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1810011498: {
                                    break block62;
                                }
                                case -1627276847: {
                                    v5 /* !! */  = (long)(ik$EntityFilter.bqf("bxm", bqc(int ), (int)67) - ik$EntityFilter.bqf("bxl", bqc(int ), (int)66));
                                    continue block62;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_1 = ik$EntityFilter.j - ik$EntityFilter.bqf("bxn", bqc(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v6 /* !! */  != ik$EntityFilter.bqf("bxo", bqj(int ), (int)118)) ** GOTO lbl64
                            v7 = var1_1.method_6118(class_1304.field_6169);
                            ** GOTO lbl111
lbl64:
                            // 1 sources

                            v6 /* !! */  = (long)ik$EntityFilter.bqf("bxp", bqj(int ), (int)119);
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("byw", bqj(int ), (int)133);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("byx", bqj(int ), (int)134);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bza", bqj(int ), (int)137);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
                    case 6: {
                        ** GOTO lbl102
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bzd", bqj(int ), (int)140);
                        cfr_temp_0 = 9;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bzg", bqj(int ), (int)143);
                        cfr_temp_0 = 7;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
                    case 12: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bzh", bqj(int ), (int)144);
                        if (var4_2) {
                            throw null;
                        }
lbl102:
                        // 3 sources

                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bzb", bqj(int ), (int)138);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bzc", bqj(int ), (int)139);
                        cfr_temp_0 = 9;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
lbl111:
                    // 1 sources

                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_2 = ik$EntityFilter.j - ik$EntityFilter.bqf("bxq", bqc(int ), (int)69)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  != ik$EntityFilter.bqf("bxr", bqj(int ), (int)120)) ** GOTO lbl118
                        if (v7.method_7960()) {
                            break;
                        }
                        ** GOTO lbl216
lbl118:
                        // 1 sources

                        v8 /* !! */  = (long)ik$EntityFilter.bqf("bxs", bqj(int ), (int)121);
                    }
                    if (var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = ik$EntityFilter.j - ik$EntityFilter.bqf("bxt", bqc(int ), (int)70)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == ik$EntityFilter.bqf("bxu", bqj(int ), (int)122)) break;
                        v9 /* !! */  = (long)ik$EntityFilter.bqf("bxv", bqj(int ), (int)123);
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = ik$EntityFilter.j - ik$EntityFilter.bqf("bxw", bqc(int ), (int)71)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v10 /* !! */  != ik$EntityFilter.bqf("bxx", bqj(int ), (int)124)) ** GOTO lbl134
                        v11 = var1_1.method_6118(class_1304.field_6174);
                        v12 /* !! */  = ik$EntityFilter.j;
                        if (true) ** GOTO lbl138
lbl134:
                        // 1 sources

                        v10 /* !! */  = (long)ik$EntityFilter.bqf("bxy", bqj(int ), (int)125);
                    }
                    block67: while (true) {
                        v12 /* !! */  = (long)(v13 - ik$EntityFilter.bqf("bxz", bqc(int ), (int)72));
lbl138:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1810011498: {
                                break block67;
                            }
                            case -421035050: {
                                v13 = ik$EntityFilter.bqf("bya", bqc(int ), (int)73);
                                continue block67;
                            }
                            case 1116063366: {
                                v13 = ik$EntityFilter.bqf("byb", bqc(int ), (int)74);
                                continue block67;
                            }
                        }
                        break;
                    }
                    if (!v11.method_7960()) ** GOTO lbl216
                    if (var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
                    v14 /* !! */  = ik$EntityFilter.j;
                    if (true) ** GOTO lbl153
                    block68: while (true) {
                        v14 /* !! */  = (long)(v15 - ik$EntityFilter.bqf("byc", bqc(int ), (int)75));
lbl153:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1810011498: {
                                break block68;
                            }
                            case -841554387: {
                                v15 = ik$EntityFilter.bqf("byd", bqc(int ), (int)76);
                                continue block68;
                            }
                            case 496543799: {
                                v15 = ik$EntityFilter.bqf("bye", bqc(int ), (int)77);
                                continue block68;
                            }
                        }
                        break;
                    }
                    v16 /* !! */  = ik$EntityFilter.j;
                    block69: while (true) {
                        switch ((int)v16 /* !! */ ) {
                            case -1810011498: {
                                break block69;
                            }
                            case -360630312: {
                                v16 /* !! */  = (long)(ik$EntityFilter.bqf("byg", bqc(int ), (int)79) - ik$EntityFilter.bqf("byf", bqc(int ), (int)78));
                                continue block69;
                            }
                        }
                        break;
                    }
                    v17 = var1_1.method_6118(class_1304.field_6172);
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_5 = ik$EntityFilter.j - ik$EntityFilter.bqf("byh", bqc(int ), (int)80)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v18 /* !! */  != ik$EntityFilter.bqf("byi", bqj(int ), (int)126)) ** GOTO lbl178
                        if (v17.method_7960()) {
                            break;
                        }
                        ** GOTO lbl216
lbl178:
                        // 1 sources

                        v18 /* !! */  = (long)ik$EntityFilter.bqf("byj", bqj(int ), (int)127);
                    }
                    if (var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
                    v19 /* !! */  = ik$EntityFilter.j;
                    block71: while (true) {
                        switch ((int)v19 /* !! */ ) {
                            case -1810011498: {
                                break block71;
                            }
                            case -195657130: {
                                v19 /* !! */  = (long)(ik$EntityFilter.bqf("byl", bqc(int ), (int)82) - ik$EntityFilter.bqf("byk", bqc(int ), (int)81));
                                continue block71;
                            }
                        }
                        break;
                    }
                    v20 /* !! */  = ik$EntityFilter.j;
                    if (true) ** GOTO lbl193
                    block72: while (true) {
                        v20 /* !! */  = (long)(v21 - ik$EntityFilter.bqf("bym", bqc(int ), (int)83));
lbl193:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case -1810011498: {
                                break block72;
                            }
                            case -1545536891: {
                                v21 = ik$EntityFilter.bqf("byn", bqc(int ), (int)84);
                                continue block72;
                            }
                            case -1437683035: {
                                v21 = ik$EntityFilter.bqf("byo", bqc(int ), (int)85);
                                continue block72;
                            }
                            case 637722562: {
                                v21 = ik$EntityFilter.bqf("byp", bqc(int ), (int)86);
                                continue block72;
                            }
                        }
                        break;
                    }
                    v22 = var1_1.method_6118(class_1304.field_6166);
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_6 = ik$EntityFilter.j - ik$EntityFilter.bqf("byq", bqc(int ), (int)87)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v23 /* !! */  != ik$EntityFilter.bqf("byr", bqj(int ), (int)128)) ** GOTO lbl213
                        if (!v22.method_7960()) {
                            break;
                        }
                        ** GOTO lbl220
lbl213:
                        // 1 sources

                        v23 /* !! */  = (long)ik$EntityFilter.bqf("bys", bqj(int ), (int)129);
                    }
                    if (var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
lbl216:
                    // 4 sources

                    if (var2_4 || var2_4) return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
                    v24 = ik$EntityFilter.bqf("byt", bqj(int ), (int)130);
                    if (!var4_2) return (boolean)v24;
                    throw null;
lbl220:
                    // 1 sources

                    if (var2_4 || var2_4) {
                        return (boolean)ik$EntityFilter.bqf("bxk", bqj(int ), (int)117);
                    }
                    v24 = ik$EntityFilter.bqf("byu", bqj(int ), (int)131);
                    return (boolean)v24;
                    case 0: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("byv", bqj(int ), (int)132);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("byz", bqj(int ), (int)136);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("byy", bqj(int ), (int)135);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block102;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bze", bqj(int ), (int)141);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl247
            }
            do {
                if (true) continue block61;
lbl247:
                // 2 sources

                var3_3 /* !! */  = (int)ik$EntityFilter.bqf("bzf", bqj(int ), (int)142);
                cfr_temp_0 = 9;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ccg() {
        ik$EntityFilter.bqd[100] = 3969823960584362972L;
        ik$EntityFilter.bqd[101] = 984407213332281048L;
        ik$EntityFilter.bqd[102] = 330906050703496105L;
        ik$EntityFilter.bqd[103] = -5802599732087228156L;
        ik$EntityFilter.bqd[104] = -3577047077652536460L;
        ik$EntityFilter.bqd[105] = 1613296243779605283L;
        ik$EntityFilter.bqd[106] = -952642553309484957L;
        ik$EntityFilter.bqd[107] = 274637741048048985L;
        ik$EntityFilter.bqd[108] = -4227355539368360299L;
    }

    private static /* synthetic */ void ccb() {
        ik$EntityFilter.bql[100] = -284125298;
        ik$EntityFilter.bql[101] = -2138387057;
        ik$EntityFilter.bql[102] = -550449317;
        ik$EntityFilter.bql[103] = -73002964;
        ik$EntityFilter.bql[104] = 1922514912;
        ik$EntityFilter.bql[105] = -737424789;
        ik$EntityFilter.bql[106] = -739326880;
        ik$EntityFilter.bql[107] = -1383095885;
        ik$EntityFilter.bql[108] = 1719361980;
        ik$EntityFilter.bql[109] = -1090971633;
        ik$EntityFilter.bql[110] = 723046166;
        ik$EntityFilter.bql[111] = 1537942023;
        ik$EntityFilter.bql[112] = 473100184;
        ik$EntityFilter.bql[113] = 482807173;
        ik$EntityFilter.bql[114] = 973962433;
        ik$EntityFilter.bql[115] = -840029934;
        ik$EntityFilter.bql[116] = -2033454364;
        ik$EntityFilter.bql[117] = -527541298;
        ik$EntityFilter.bql[118] = -1318742761;
        ik$EntityFilter.bql[119] = -1340098265;
        ik$EntityFilter.bql[120] = -828868863;
        ik$EntityFilter.bql[121] = 712845221;
        ik$EntityFilter.bql[122] = 112975605;
        ik$EntityFilter.bql[123] = 1913628676;
        ik$EntityFilter.bql[124] = 1018170964;
        ik$EntityFilter.bql[125] = 368568875;
        ik$EntityFilter.bql[126] = 1368340719;
        ik$EntityFilter.bql[127] = -1476549723;
        ik$EntityFilter.bql[128] = 646365835;
        ik$EntityFilter.bql[129] = -1820325627;
        ik$EntityFilter.bql[130] = -1827944476;
        ik$EntityFilter.bql[131] = -1239709053;
        ik$EntityFilter.bql[132] = -1276163663;
        ik$EntityFilter.bql[133] = 1159600527;
        ik$EntityFilter.bql[134] = -917457004;
        ik$EntityFilter.bql[135] = 766860685;
        ik$EntityFilter.bql[136] = -118484794;
        ik$EntityFilter.bql[137] = 1204885625;
        ik$EntityFilter.bql[138] = 905300290;
        ik$EntityFilter.bql[139] = 568028155;
        ik$EntityFilter.bql[140] = -1308683066;
        ik$EntityFilter.bql[141] = -1293166424;
        ik$EntityFilter.bql[142] = 1385371764;
        ik$EntityFilter.bql[143] = 2021043980;
        ik$EntityFilter.bql[144] = 2030065640;
        ik$EntityFilter.bql[145] = -1848216423;
        ik$EntityFilter.bql[146] = 405967141;
        ik$EntityFilter.bql[147] = 1871808359;
        ik$EntityFilter.bql[148] = 1740165115;
        ik$EntityFilter.bql[149] = -773781316;
        ik$EntityFilter.bql[150] = 1496586350;
        ik$EntityFilter.bql[151] = 1564441458;
        ik$EntityFilter.bql[152] = 1787575119;
        ik$EntityFilter.bql[153] = 1892479788;
        ik$EntityFilter.bql[154] = 1181655086;
        ik$EntityFilter.bql[155] = -874724471;
        ik$EntityFilter.bql[156] = 619350962;
        ik$EntityFilter.bql[157] = -1526610398;
        ik$EntityFilter.bql[158] = 1249194081;
        ik$EntityFilter.bql[159] = 731348151;
        ik$EntityFilter.bql[160] = 2040978378;
        ik$EntityFilter.bql[161] = -1633390410;
        ik$EntityFilter.bql[162] = -865134710;
        ik$EntityFilter.bql[163] = -1165600781;
        ik$EntityFilter.bql[164] = -1130381442;
        ik$EntityFilter.bql[165] = -439565846;
        ik$EntityFilter.bql[166] = -149499815;
        ik$EntityFilter.bql[167] = -240736278;
        ik$EntityFilter.bql[168] = 96365762;
        ik$EntityFilter.bql[169] = -2096430780;
        ik$EntityFilter.bql[170] = -575327570;
        ik$EntityFilter.bql[171] = -1198284711;
        ik$EntityFilter.bql[172] = 1294659953;
        ik$EntityFilter.bql[173] = -1070579458;
        ik$EntityFilter.bql[174] = -329256343;
        ik$EntityFilter.bql[175] = 626227211;
        ik$EntityFilter.bql[176] = -1091806109;
        ik$EntityFilter.bql[177] = -37196525;
        ik$EntityFilter.bql[178] = -1341777357;
        ik$EntityFilter.bql[179] = 1988706960;
        ik$EntityFilter.bql[180] = -710269165;
        ik$EntityFilter.bql[181] = 2005769746;
        ik$EntityFilter.bql[182] = 1264895938;
        ik$EntityFilter.bql[183] = 1199452460;
        ik$EntityFilter.bql[184] = 1273501057;
        ik$EntityFilter.bql[185] = -465746636;
        ik$EntityFilter.bql[186] = 81061979;
    }

    private static /* synthetic */ long bqc(int n2) {
        return bqd[n2] ^ bqe[n2];
    }

    private static /* synthetic */ int bqj(int n2) {
        return bqk[n2] ^ bql[n2];
    }

    static {
        bqk = new int[187];
        bql = new int[187];
        ik$EntityFilter.cbu();
        ik$EntityFilter.cbx();
        ik$EntityFilter.cbz();
        ik$EntityFilter.ccb();
        bqd = new long[109];
        bqe = new long[109];
        ik$EntityFilter.ccd();
        ik$EntityFilter.ccg();
        ik$EntityFilter.cch();
        ik$EntityFilter.ccj();
    }

    private static /* synthetic */ void cbx() {
        ik$EntityFilter.bqk[100] = -284125306;
        ik$EntityFilter.bqk[101] = -2138387067;
        ik$EntityFilter.bqk[102] = -550449325;
        ik$EntityFilter.bqk[103] = -73002963;
        ik$EntityFilter.bqk[104] = 1922514913;
        ik$EntityFilter.bqk[105] = -737424797;
        ik$EntityFilter.bqk[106] = -739326875;
        ik$EntityFilter.bqk[107] = -1383095880;
        ik$EntityFilter.bqk[108] = 1719361969;
        ik$EntityFilter.bqk[109] = -1090971617;
        ik$EntityFilter.bqk[110] = 723046166;
        ik$EntityFilter.bqk[111] = 1537942026;
        ik$EntityFilter.bqk[112] = 473100180;
        ik$EntityFilter.bqk[113] = 482807172;
        ik$EntityFilter.bqk[114] = 973962439;
        ik$EntityFilter.bqk[115] = -840029950;
        ik$EntityFilter.bqk[116] = -2033454364;
        ik$EntityFilter.bqk[117] = -527541297;
        ik$EntityFilter.bqk[118] = -1318742762;
        ik$EntityFilter.bqk[119] = -825541484;
        ik$EntityFilter.bqk[120] = -828868864;
        ik$EntityFilter.bqk[121] = 881505664;
        ik$EntityFilter.bqk[122] = 112975604;
        ik$EntityFilter.bqk[123] = -593527877;
        ik$EntityFilter.bqk[124] = -1018170965;
        ik$EntityFilter.bqk[125] = 1986399652;
        ik$EntityFilter.bqk[126] = 1368340718;
        ik$EntityFilter.bqk[127] = -1048439091;
        ik$EntityFilter.bqk[128] = 646365834;
        ik$EntityFilter.bqk[129] = 2036472344;
        ik$EntityFilter.bqk[130] = -1827944475;
        ik$EntityFilter.bqk[131] = -1239709053;
        ik$EntityFilter.bqk[132] = -1276163658;
        ik$EntityFilter.bqk[133] = 1159600519;
        ik$EntityFilter.bqk[134] = -917457000;
        ik$EntityFilter.bqk[135] = 766860683;
        ik$EntityFilter.bqk[136] = -118484794;
        ik$EntityFilter.bqk[137] = 1204885617;
        ik$EntityFilter.bqk[138] = 905300299;
        ik$EntityFilter.bqk[139] = 568028157;
        ik$EntityFilter.bqk[140] = -1308683069;
        ik$EntityFilter.bqk[141] = -1293166430;
        ik$EntityFilter.bqk[142] = 1385371768;
        ik$EntityFilter.bqk[143] = 2021043976;
        ik$EntityFilter.bqk[144] = 2030065632;
        ik$EntityFilter.bqk[145] = -1848216424;
        ik$EntityFilter.bqk[146] = 1108133517;
        ik$EntityFilter.bqk[147] = 1871808358;
        ik$EntityFilter.bqk[148] = -589894086;
        ik$EntityFilter.bqk[149] = 773781315;
        ik$EntityFilter.bqk[150] = 617543901;
        ik$EntityFilter.bqk[151] = 1564441458;
        ik$EntityFilter.bqk[152] = -1787575120;
        ik$EntityFilter.bqk[153] = -598135408;
        ik$EntityFilter.bqk[154] = 1181655086;
        ik$EntityFilter.bqk[155] = -874724472;
        ik$EntityFilter.bqk[156] = -1707072217;
        ik$EntityFilter.bqk[157] = -1526610397;
        ik$EntityFilter.bqk[158] = 1592417910;
        ik$EntityFilter.bqk[159] = 731348151;
        ik$EntityFilter.bqk[160] = 2040978370;
        ik$EntityFilter.bqk[161] = -1633390401;
        ik$EntityFilter.bqk[162] = -865134708;
        ik$EntityFilter.bqk[163] = -1165600798;
        ik$EntityFilter.bqk[164] = -1130381449;
        ik$EntityFilter.bqk[165] = -439565846;
        ik$EntityFilter.bqk[166] = -149499812;
        ik$EntityFilter.bqk[167] = -240736260;
        ik$EntityFilter.bqk[168] = 96365774;
        ik$EntityFilter.bqk[169] = -2096430777;
        ik$EntityFilter.bqk[170] = -575327570;
        ik$EntityFilter.bqk[171] = -1198284728;
        ik$EntityFilter.bqk[172] = 1294659938;
        ik$EntityFilter.bqk[173] = -1070579480;
        ik$EntityFilter.bqk[174] = -329256327;
        ik$EntityFilter.bqk[175] = 626227226;
        ik$EntityFilter.bqk[176] = -1091806110;
        ik$EntityFilter.bqk[177] = -37196538;
        ik$EntityFilter.bqk[178] = -1341777357;
        ik$EntityFilter.bqk[179] = 1988706965;
        ik$EntityFilter.bqk[180] = -710269161;
        ik$EntityFilter.bqk[181] = 2005769734;
        ik$EntityFilter.bqk[182] = 1264895947;
        ik$EntityFilter.bqk[183] = 1199452473;
        ik$EntityFilter.bqk[184] = 1273501059;
        ik$EntityFilter.bqk[185] = -465746634;
        ik$EntityFilter.bqk[186] = 81061978;
    }

    private static /* synthetic */ void ccd() {
        ik$EntityFilter.bqd[0] = -5451499264173444703L;
        ik$EntityFilter.bqd[1] = -6648552989117042853L;
        ik$EntityFilter.bqd[2] = 7856928471217224040L;
        ik$EntityFilter.bqd[3] = -7834877804360820714L;
        ik$EntityFilter.bqd[4] = -7608965132159232166L;
        ik$EntityFilter.bqd[5] = 7774736602968074786L;
        ik$EntityFilter.bqd[6] = 5826759732457280678L;
        ik$EntityFilter.bqd[7] = -6975760066291157002L;
        ik$EntityFilter.bqd[8] = -1908803647521242626L;
        ik$EntityFilter.bqd[9] = -8252177148601246235L;
        ik$EntityFilter.bqd[10] = 8127258457763572087L;
        ik$EntityFilter.bqd[11] = -8199253144530086571L;
        ik$EntityFilter.bqd[12] = 6885719836004861139L;
        ik$EntityFilter.bqd[13] = 2816772096239458151L;
        ik$EntityFilter.bqd[14] = -8681514308745966729L;
        ik$EntityFilter.bqd[15] = 5656171969757120981L;
        ik$EntityFilter.bqd[16] = -3377823577596427948L;
        ik$EntityFilter.bqd[17] = 5393013237702108341L;
        ik$EntityFilter.bqd[18] = 3762190326385998147L;
        ik$EntityFilter.bqd[19] = 810294375612634935L;
        ik$EntityFilter.bqd[20] = 4525276036934382370L;
        ik$EntityFilter.bqd[21] = 4529659980191733150L;
        ik$EntityFilter.bqd[22] = 6801645333910809737L;
        ik$EntityFilter.bqd[23] = -4653396905007582662L;
        ik$EntityFilter.bqd[24] = -6253057897913803281L;
        ik$EntityFilter.bqd[25] = -8609635207048369470L;
        ik$EntityFilter.bqd[26] = -32014152675736913L;
        ik$EntityFilter.bqd[27] = -1330369656889684141L;
        ik$EntityFilter.bqd[28] = -9175538241154591850L;
        ik$EntityFilter.bqd[29] = 3420363257037170756L;
        ik$EntityFilter.bqd[30] = 4626294501457094149L;
        ik$EntityFilter.bqd[31] = -6929163066976682984L;
        ik$EntityFilter.bqd[32] = -6702031429855582959L;
        ik$EntityFilter.bqd[33] = 8688156102224397549L;
        ik$EntityFilter.bqd[34] = 5456354828671215915L;
        ik$EntityFilter.bqd[35] = 8547281335166234338L;
        ik$EntityFilter.bqd[36] = -7099171562365726558L;
        ik$EntityFilter.bqd[37] = -6127967454700254509L;
        ik$EntityFilter.bqd[38] = 2843404662078182767L;
        ik$EntityFilter.bqd[39] = 1572417550456007073L;
        ik$EntityFilter.bqd[40] = -6740849703090841501L;
        ik$EntityFilter.bqd[41] = -3301418831885821075L;
        ik$EntityFilter.bqd[42] = 928644561321250687L;
        ik$EntityFilter.bqd[43] = -8705830086767224481L;
        ik$EntityFilter.bqd[44] = 8578273153651848895L;
        ik$EntityFilter.bqd[45] = 7937358779145363336L;
        ik$EntityFilter.bqd[46] = 2172687386349582457L;
        ik$EntityFilter.bqd[47] = 8038122348162847768L;
        ik$EntityFilter.bqd[48] = 7900917439564813937L;
        ik$EntityFilter.bqd[49] = 1142442183444182947L;
        ik$EntityFilter.bqd[50] = 8087179480591006986L;
        ik$EntityFilter.bqd[51] = -6064632914749030789L;
        ik$EntityFilter.bqd[52] = 3476132067742534274L;
        ik$EntityFilter.bqd[53] = 8008076188007902290L;
        ik$EntityFilter.bqd[54] = -4872457918303200737L;
        ik$EntityFilter.bqd[55] = -3405284402369438024L;
        ik$EntityFilter.bqd[56] = -7707790048390542830L;
        ik$EntityFilter.bqd[57] = -5566319875907491400L;
        ik$EntityFilter.bqd[58] = -2736217059172237750L;
        ik$EntityFilter.bqd[59] = -3702211836610524160L;
        ik$EntityFilter.bqd[60] = -2957829366896771977L;
        ik$EntityFilter.bqd[61] = -130644193793877808L;
        ik$EntityFilter.bqd[62] = 7091736036260058160L;
        ik$EntityFilter.bqd[63] = 6292844522699477383L;
        ik$EntityFilter.bqd[64] = 3227886495126836261L;
        ik$EntityFilter.bqd[65] = -8948431203366471011L;
        ik$EntityFilter.bqd[66] = -2812306697440395716L;
        ik$EntityFilter.bqd[67] = -2787456845304559764L;
        ik$EntityFilter.bqd[68] = -7343636674005403067L;
        ik$EntityFilter.bqd[69] = 7402727523681338496L;
        ik$EntityFilter.bqd[70] = 3868644786965829987L;
        ik$EntityFilter.bqd[71] = -2409296456674921590L;
        ik$EntityFilter.bqd[72] = 6288593259230166939L;
        ik$EntityFilter.bqd[73] = -6816082950109774826L;
        ik$EntityFilter.bqd[74] = -4340499441408166870L;
        ik$EntityFilter.bqd[75] = -4244934793434877551L;
        ik$EntityFilter.bqd[76] = 896775709444074349L;
        ik$EntityFilter.bqd[77] = 4830376691915908918L;
        ik$EntityFilter.bqd[78] = -5951202942188274428L;
        ik$EntityFilter.bqd[79] = 5303916163441482751L;
        ik$EntityFilter.bqd[80] = -9004953574743953982L;
        ik$EntityFilter.bqd[81] = -5908625779057012936L;
        ik$EntityFilter.bqd[82] = 8091207335887031686L;
        ik$EntityFilter.bqd[83] = -5952435501082441487L;
        ik$EntityFilter.bqd[84] = 4056082395731309034L;
        ik$EntityFilter.bqd[85] = 6215090882651695143L;
        ik$EntityFilter.bqd[86] = -6593833393798818950L;
        ik$EntityFilter.bqd[87] = -5870210792228273296L;
        ik$EntityFilter.bqd[88] = 4142929546052379130L;
        ik$EntityFilter.bqd[89] = -6143457529279091806L;
        ik$EntityFilter.bqd[90] = 8089187759514508683L;
        ik$EntityFilter.bqd[91] = 1163133705459268380L;
        ik$EntityFilter.bqd[92] = -100089905184518418L;
        ik$EntityFilter.bqd[93] = 1080457171899055937L;
        ik$EntityFilter.bqd[94] = -5471299710204276317L;
        ik$EntityFilter.bqd[95] = 4902384955107675711L;
        ik$EntityFilter.bqd[96] = 841644283718091356L;
        ik$EntityFilter.bqd[97] = 7615008335881137834L;
        ik$EntityFilter.bqd[98] = 3428221388415790114L;
        ik$EntityFilter.bqd[99] = 5536918967633933523L;
    }
}

