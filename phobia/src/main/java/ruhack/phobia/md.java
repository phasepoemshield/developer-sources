/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  net.minecraft.class_490
 *  net.minecraft.class_746
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11909;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_490;
import net.minecraft.class_746;
import ruhack.phobia.hj;
import ruhack.phobia.me;
import ruhack.phobia.my;
import ruhack.phobia.nd;

public final class md
extends class_490 {
    public static final boolean c;
    private final int ringSlot;
    private final me ringScreen;
    private static long[] jzdt;
    private static int[] jzed;
    public static final boolean a;
    private static long[] jzds;
    private final my transition;
    private static final long rz = 5200013791932039252L;
    private final hj helper;
    public static final int b;
    private static int[] jzec;

    public md(class_746 class_7462, hj hj2, me me2, int n2) {
        int n3 = b;
        super((class_1657)class_7462);
        this.transition = new my((long)md.jzdv("jzdw", jzdq(int ), (int)0), (long)md.jzdv("jzdy", jzdq(int ), (int)1));
        this.helper = hj2;
        this.ringScreen = me2;
        this.ringSlot = n2;
    }

    private static /* synthetic */ void jzqj() {
        md.jzec[100] = 967794740;
        md.jzec[101] = 521757028;
        md.jzec[102] = 706215959;
        md.jzec[103] = -699989866;
        md.jzec[104] = 298464282;
        md.jzec[105] = -1987467802;
        md.jzec[106] = 1528817139;
        md.jzec[107] = 361998512;
        md.jzec[108] = 1065121795;
        md.jzec[109] = 1073223510;
        md.jzec[110] = -2094143923;
        md.jzec[111] = -580752983;
        md.jzec[112] = 1813318160;
        md.jzec[113] = 318769034;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishClosing() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = md.rz - md.jzdv("jzof", jzdq(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == md.jzdv("jzoh", jzeb(int ), (int)100)) break;
            v0 /* !! */  = (long)md.jzdv("jzoj", jzeb(int ), (int)101);
        }
        var3_1 = md.c;
        v1 /* !! */  = md.rz;
        if (true) ** GOTO lbl11
        block31: while (true) {
            v1 /* !! */  = (long)(v2 - md.jzdv("jzol", jzdq(int ), (int)53));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1429021651: {
                    v2 = md.jzdv("jzon", jzdq(int ), (int)54);
                    continue block31;
                }
                case -703171981: {
                    v2 = md.jzdv("jzop", jzdq(int ), (int)55);
                    continue block31;
                }
                case 210227486: {
                    v2 = md.jzdv("jzoq", jzdq(int ), (int)56);
                    continue block31;
                }
                case 792576084: {
                    break block31;
                }
            }
            break;
        }
        var2_2 /* !! */  = md.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = md.rz;
                if (true) ** GOTO lbl31
                block32: while (true) {
                    v3 /* !! */  = (long)(md.jzdv("jzov", jzdq(int ), (int)58) - md.jzdv("jzot", jzdq(int ), (int)57));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 241765962: {
                            continue block32;
                        }
                        case 792576084: {
                            break block32;
                        }
                    }
                    break;
                }
                var1_3 = md.a;
                if (var3_1) {
                    throw null;
lbl39:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl39
                v4 /* !! */  = md.rz;
                if (true) ** GOTO lbl46
                block34: while (true) {
                    v4 /* !! */  = (long)(md.jzdv("jzpa", jzdq(int ), (int)60) - md.jzdv("jzox", jzdq(int ), (int)59));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 792576084: {
                            break block34;
                        }
                        case 1455129859: {
                            continue block34;
                        }
                    }
                    break;
                }
                if (this.field_22787 == null) ** GOTO lbl81
                if (var1_3) ** GOTO lbl39
                v5 /* !! */  = md.rz;
                if (true) ** GOTO lbl57
                block35: while (true) {
                    v5 /* !! */  = (long)(v6 - md.jzdv("jzpd", jzdq(int ), (int)61));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1465551118: {
                            v6 = md.jzdv("jzpe", jzdq(int ), (int)62);
                            continue block35;
                        }
                        case -1381663119: {
                            v6 = md.jzdv("jzpg", jzdq(int ), (int)63);
                            continue block35;
                        }
                        case 792576084: {
                            break block35;
                        }
                        case 2017969483: {
                            v6 = md.jzdv("jzpj", jzdq(int ), (int)64);
                            continue block35;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = md.rz - md.jzdv("jzpk", jzdq(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == md.jzdv("jzpm", jzeb(int ), (int)102)) break;
                    v7 /* !! */  = (long)md.jzdv("jzpn", jzeb(int ), (int)103);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = md.rz - md.jzdv("jzpo", jzdq(int ), (int)66)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == md.jzdv("jzpq", jzeb(int ), (int)104)) break;
                    v8 /* !! */  = (long)md.jzdv("jzpr", jzeb(int ), (int)105);
                }
                this.field_22787.method_1507((class_437)this.ringScreen);
                if (var1_3) ** GOTO lbl39
lbl81:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl84:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)md.jzdv("jzpt", jzeb(int ), (int)106);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 1: {
                var2_2 /* !! */  = (int)md.jzdv("jzpu", jzeb(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 2: {
                var2_2 /* !! */  = (int)md.jzdv("jzpw", jzeb(int ), (int)108);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 3: {
                var2_2 /* !! */  = (int)md.jzdv("jzpx", jzeb(int ), (int)109);
                if (!var3_1) break;
                throw null;
            }
lbl103:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)md.jzdv("jzpz", jzeb(int ), (int)110);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)md.jzdv("jzqa", jzeb(int ), (int)111);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
lbl112:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)md.jzdv("jzqb", jzeb(int ), (int)112);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)md.jzdv("jzqc", jzeb(int ), (int)113);
        ** while (!var3_1)
lbl119:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long jzdq(int n2) {
        return jzds[n2] ^ jzdt[n2];
    }

    private static /* synthetic */ void jzqs() {
        md.jzdt[0] = -8333902785814155134L;
        md.jzdt[1] = -5323966424075293098L;
        md.jzdt[2] = -3847791195230447547L;
        md.jzdt[3] = 3465535240854039293L;
        md.jzdt[4] = 6134570545180007048L;
        md.jzdt[5] = 5010221301831541290L;
        md.jzdt[6] = 465835701779130802L;
        md.jzdt[7] = -2011045362077039874L;
        md.jzdt[8] = -4468624477303986058L;
        md.jzdt[9] = -7540908064252344230L;
        md.jzdt[10] = -2844991740599568658L;
        md.jzdt[11] = -4939166737155145714L;
        md.jzdt[12] = 4819192455223064567L;
        md.jzdt[13] = 4202058161169968551L;
        md.jzdt[14] = -4447159263375461737L;
        md.jzdt[15] = 510522687171197700L;
        md.jzdt[16] = 2638247056429032865L;
        md.jzdt[17] = -242170087872809474L;
        md.jzdt[18] = -4440004001650671590L;
        md.jzdt[19] = -6380261917716886093L;
        md.jzdt[20] = 1700234235280360760L;
        md.jzdt[21] = -4407638720269691239L;
        md.jzdt[22] = -3516795767245798883L;
        md.jzdt[23] = -308700822397516471L;
        md.jzdt[24] = 1061050729195916750L;
        md.jzdt[25] = 7749835605132818743L;
        md.jzdt[26] = -3980706597073125326L;
        md.jzdt[27] = 667927682522851695L;
        md.jzdt[28] = 1220106704665691643L;
        md.jzdt[29] = -2641966201384480426L;
        md.jzdt[30] = 8623124740958835788L;
        md.jzdt[31] = -2815529434063939042L;
        md.jzdt[32] = -531195867469676645L;
        md.jzdt[33] = -7285617763606720499L;
        md.jzdt[34] = -8449317939843773906L;
        md.jzdt[35] = 183710443587291836L;
        md.jzdt[36] = -8161994549597344206L;
        md.jzdt[37] = 2956589292919216468L;
        md.jzdt[38] = 1997827033072188606L;
        md.jzdt[39] = -2136634230478602706L;
        md.jzdt[40] = 7196699663051731953L;
        md.jzdt[41] = -2937915457665393364L;
        md.jzdt[42] = -6671002513157094898L;
        md.jzdt[43] = -8580107134666749104L;
        md.jzdt[44] = 1635472343573023356L;
        md.jzdt[45] = 376578943281013912L;
        md.jzdt[46] = -1800196763026750328L;
        md.jzdt[47] = 541258458906505849L;
        md.jzdt[48] = -2973998428364361980L;
        md.jzdt[49] = -4038326769066521311L;
        md.jzdt[50] = -2597391240955785954L;
        md.jzdt[51] = 3831688863995871215L;
        md.jzdt[52] = -8868377713048664362L;
        md.jzdt[53] = -2629977900672062945L;
        md.jzdt[54] = 5558538728942313531L;
        md.jzdt[55] = 4925960134258206106L;
        md.jzdt[56] = -3675768496986142106L;
        md.jzdt[57] = -1485920898582459890L;
        md.jzdt[58] = -1883213945967576067L;
        md.jzdt[59] = 997975331648839580L;
        md.jzdt[60] = -971637386506892895L;
        md.jzdt[61] = 3458689114542980079L;
        md.jzdt[62] = -4824273510616004972L;
        md.jzdt[63] = 5140017977180686257L;
        md.jzdt[64] = 4472548593468541255L;
        md.jzdt[65] = -6982860151328135360L;
        md.jzdt[66] = -4633536398039106911L;
    }

    private static /* synthetic */ void jzqp() {
        md.jzds[0] = -8333902785863721086L;
        md.jzds[1] = -5323966423943703210L;
        md.jzds[2] = -8896004838619781361L;
        md.jzds[3] = -4789702709447586149L;
        md.jzds[4] = 9122194059101352726L;
        md.jzds[5] = 7379464452297617113L;
        md.jzds[6] = 7030774407072616569L;
        md.jzds[7] = -790451161122080975L;
        md.jzds[8] = -5898098252130397795L;
        md.jzds[9] = -6758092898365240107L;
        md.jzds[10] = 2283333444176047386L;
        md.jzds[11] = -4027651311321298686L;
        md.jzds[12] = -8614588251859903830L;
        md.jzds[13] = -816716096702987010L;
        md.jzds[14] = 1129642573777809818L;
        md.jzds[15] = -1213266202511335080L;
        md.jzds[16] = -8712352177221670832L;
        md.jzds[17] = -4101697463666415073L;
        md.jzds[18] = 3441532415239935595L;
        md.jzds[19] = -1206634810163595005L;
        md.jzds[20] = 9109872176150356194L;
        md.jzds[21] = -8171121655056301361L;
        md.jzds[22] = -6498649152646766488L;
        md.jzds[23] = 5827366609514263683L;
        md.jzds[24] = 4774852111799576066L;
        md.jzds[25] = 737140529924014158L;
        md.jzds[26] = -4080160972117896453L;
        md.jzds[27] = 8172783029245015431L;
        md.jzds[28] = -6313224924804671513L;
        md.jzds[29] = -998030327003659158L;
        md.jzds[30] = 3773591689768865302L;
        md.jzds[31] = 2881846217386460690L;
        md.jzds[32] = -1947682121350104406L;
        md.jzds[33] = -6110150566336822779L;
        md.jzds[34] = -4237880187713081556L;
        md.jzds[35] = -7394352585204496407L;
        md.jzds[36] = -6596839520097871581L;
        md.jzds[37] = -4415773057306256936L;
        md.jzds[38] = 1300712396166433191L;
        md.jzds[39] = 2124352513730375776L;
        md.jzds[40] = 5942980036927995989L;
        md.jzds[41] = -9110618301327691390L;
        md.jzds[42] = 3208064702561982741L;
        md.jzds[43] = 9068717488815427043L;
        md.jzds[44] = 1461844178595380300L;
        md.jzds[45] = 5326904332329626263L;
        md.jzds[46] = -593561422533866121L;
        md.jzds[47] = 6498568345922941177L;
        md.jzds[48] = 3949989591400471005L;
        md.jzds[49] = 9031749021197997688L;
        md.jzds[50] = 4472914233529931503L;
        md.jzds[51] = -7500544181703544653L;
        md.jzds[52] = -7053416429343766528L;
        md.jzds[53] = 3553442784136751207L;
        md.jzds[54] = 983408273338693380L;
        md.jzds[55] = 377965349661417800L;
        md.jzds[56] = -2042212186557823371L;
        md.jzds[57] = 8213944342667824864L;
        md.jzds[58] = -1756473018903316768L;
        md.jzds[59] = 2794570191733535430L;
        md.jzds[60] = 3720083255298201925L;
        md.jzds[61] = 6501462554990749173L;
        md.jzds[62] = -5272751421676589256L;
        md.jzds[63] = 4970124223595351515L;
        md.jzds[64] = 2889858139882007114L;
        md.jzds[65] = -122161574825109945L;
        md.jzds[66] = -4941002089338099664L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        v0 /* !! */  = md.rz;
        if (true) ** GOTO lbl5
        block73: while (true) {
            v0 /* !! */  = (long)(md.jzdv("jzhr", jzdq(int ), (int)3) - md.jzdv("jzhq", jzdq(int ), (int)2));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 673635604: {
                    continue block73;
                }
                case 792576084: {
                    break block73;
                }
            }
            break;
        }
        var6_3 = md.c;
        v1 /* !! */  = md.rz;
        if (true) ** GOTO lbl15
        block74: while (true) {
            v1 /* !! */  = (long)(v2 - md.jzdv("jzhs", jzdq(int ), (int)4));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2143864424: {
                    v2 = md.jzdv("jzhu", jzdq(int ), (int)5);
                    continue block74;
                }
                case 666802378: {
                    v2 = md.jzdv("jzhv", jzdq(int ), (int)6);
                    continue block74;
                }
                case 792576084: {
                    break block74;
                }
                case 1855194272: {
                    v2 = md.jzdv("jzhx", jzdq(int ), (int)7);
                    continue block74;
                }
            }
            break;
        }
        var5_4 /* !! */  = md.b;
        v3 /* !! */  = md.rz;
        if (true) ** GOTO lbl32
        block75: while (true) {
            v3 /* !! */  = (long)(md.jzdv("jzia", jzdq(int ), (int)9) - md.jzdv("jzhy", jzdq(int ), (int)8));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 91854260: {
                    continue block75;
                }
                case 792576084: {
                    break block75;
                }
            }
            break;
        }
        var4_5 = md.a;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) {
                    throw null;
lbl43:
                    // 11 sources

                    return (boolean)md.jzdv("jzic", jzeb(int ), (int)49);
                }
                if (var4_5 || var4_5) ** GOTO lbl43
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = md.rz - md.jzdv("jzid", jzdq(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == md.jzdv("jzif", jzeb(int ), (int)50)) break;
                    v4 /* !! */  = (long)md.jzdv("jzig", jzeb(int ), (int)51);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = md.rz - md.jzdv("jzii", jzdq(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == md.jzdv("jzik", jzeb(int ), (int)52)) break;
                    v5 /* !! */  = (long)md.jzdv("jzil", jzeb(int ), (int)53);
                }
                if (!this.transition.blocksInput()) ** GOTO lbl61
                if (var4_5) ** GOTO lbl43
                return (boolean)md.jzdv("jzin", jzeb(int ), (int)54);
lbl61:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl43
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = md.rz - md.jzdv("jzip", jzdq(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == md.jzdv("jzir", jzeb(int ), (int)55)) break;
                    v6 /* !! */  = (long)md.jzdv("jzis", jzeb(int ), (int)56);
                }
                if (var1_1.method_74245() != 0) ** GOTO lbl201
                if (var4_5) ** GOTO lbl43
                v7 /* !! */  = md.rz;
                if (true) ** GOTO lbl74
                block80: while (true) {
                    v7 /* !! */  = (long)(md.jzdv("jziv", jzdq(int ), (int)14) - md.jzdv("jzit", jzdq(int ), (int)13));
lbl74:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 792576084: {
                            break block80;
                        }
                        case 1400953439: {
                            continue block80;
                        }
                    }
                    break;
                }
                if (this.field_2787 == null) ** GOTO lbl201
                if (var4_5) ** GOTO lbl43
                v8 /* !! */  = md.rz;
                if (true) ** GOTO lbl85
                block81: while (true) {
                    v8 /* !! */  = (long)(v9 - md.jzdv("jzix", jzdq(int ), (int)15));
lbl85:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1751413688: {
                            v9 = md.jzdv("jziz", jzdq(int ), (int)16);
                            continue block81;
                        }
                        case -995019932: {
                            v9 = md.jzdv("jzja", jzdq(int ), (int)17);
                            continue block81;
                        }
                        case 466741186: {
                            v9 = md.jzdv("jzjc", jzdq(int ), (int)18);
                            continue block81;
                        }
                        case 792576084: {
                            break block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = md.rz - md.jzdv("jzje", jzdq(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == md.jzdv("jzjf", jzeb(int ), (int)57)) break;
                    v10 /* !! */  = (long)md.jzdv("jzjh", jzeb(int ), (int)58);
                }
                if (!this.field_2787.method_7681()) ** GOTO lbl201
                if (var4_5 || var4_5) ** GOTO lbl43
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = md.rz - md.jzdv("jzjj", jzdq(int ), (int)20)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == md.jzdv("jzjl", jzeb(int ), (int)59)) break;
                    v11 /* !! */  = (long)md.jzdv("jzjm", jzeb(int ), (int)60);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = md.rz - md.jzdv("jzjo", jzdq(int ), (int)21)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == md.jzdv("jzjp", jzeb(int ), (int)61)) break;
                    v12 /* !! */  = (long)md.jzdv("jzjr", jzeb(int ), (int)62);
                }
                var3_6 = this.field_2787.method_7677();
                if (var4_5 || var4_5) ** GOTO lbl43
                v13 /* !! */  = md.rz;
                if (true) ** GOTO lbl123
                block85: while (true) {
                    v13 /* !! */  = (long)(md.jzdv("jzjv", jzdq(int ), (int)23) - md.jzdv("jzjt", jzdq(int ), (int)22));
lbl123:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1264952750: {
                            continue block85;
                        }
                        case 792576084: {
                            break block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = md.rz - md.jzdv("jzjx", jzdq(int ), (int)24)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == md.jzdv("jzjz", jzeb(int ), (int)63)) break;
                    v14 /* !! */  = (long)md.jzdv("jzka", jzeb(int ), (int)64);
                }
                if (!this.helper.isSelectablePotion(var3_6)) ** GOTO lbl201
                if (var4_5 || var4_5) ** GOTO lbl43
                v15 /* !! */  = md.rz;
                if (true) ** GOTO lbl140
                block87: while (true) {
                    v15 /* !! */  = (long)(md.jzdv("jzkd", jzdq(int ), (int)26) - md.jzdv("jzkc", jzdq(int ), (int)25));
lbl140:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1340248942: {
                            continue block87;
                        }
                        case 792576084: {
                            break block87;
                        }
                    }
                    break;
                }
                v16 /* !! */  = md.rz;
                if (true) ** GOTO lbl149
                block88: while (true) {
                    v16 /* !! */  = (long)(v17 - md.jzdv("jzkf", jzdq(int ), (int)27));
lbl149:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1385410491: {
                            v17 = md.jzdv("jzkh", jzdq(int ), (int)28);
                            continue block88;
                        }
                        case -421878256: {
                            v17 = md.jzdv("jzki", jzdq(int ), (int)29);
                            continue block88;
                        }
                        case 792576084: {
                            break block88;
                        }
                        case 1694081464: {
                            v17 = md.jzdv("jzkk", jzdq(int ), (int)30);
                            continue block88;
                        }
                    }
                    break;
                }
                v18 /* !! */  = md.rz;
                if (true) ** GOTO lbl165
                block89: while (true) {
                    v18 /* !! */  = (long)(v19 - md.jzdv("jzkm", jzdq(int ), (int)31));
lbl165:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1929058053: {
                            v19 = md.jzdv("jzkn", jzdq(int ), (int)32);
                            continue block89;
                        }
                        case 792576084: {
                            break block89;
                        }
                        case 826727777: {
                            v19 = md.jzdv("jzkp", jzdq(int ), (int)33);
                            continue block89;
                        }
                    }
                    break;
                }
                this.helper.selectPotion(this.ringSlot, var3_6);
                if (var4_5 || var4_5) ** GOTO lbl43
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = md.rz - md.jzdv("jzkr", jzdq(int ), (int)34)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == md.jzdv("jzkt", jzeb(int ), (int)65)) break;
                    v20 /* !! */  = (long)md.jzdv("jzku", jzeb(int ), (int)66);
                }
                v21 /* !! */  = md.rz;
                if (true) ** GOTO lbl186
                block91: while (true) {
                    v21 /* !! */  = (long)(v22 - md.jzdv("jzkw", jzdq(int ), (int)35));
lbl186:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2038609717: {
                            v22 = md.jzdv("jzky", jzdq(int ), (int)36);
                            continue block91;
                        }
                        case -1242551669: {
                            v22 = md.jzdv("jzkz", jzdq(int ), (int)37);
                            continue block91;
                        }
                        case -1033765945: {
                            v22 = md.jzdv("jzlb", jzdq(int ), (int)38);
                            continue block91;
                        }
                        case 792576084: {
                            break block91;
                        }
                    }
                    break;
                }
                this.transition.close();
                if (var4_5 || var4_5) ** GOTO lbl43
                return (boolean)md.jzdv("jzld", jzeb(int ), (int)67);
lbl201:
                // 4 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = md.rz - md.jzdv("jzlg", jzdq(int ), (int)39)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v23 /* !! */  == md.jzdv("jzlh", jzeb(int ), (int)68)) break;
                    v23 /* !! */  = (long)md.jzdv("jzlj", jzeb(int ), (int)69);
                }
                return super.method_25402(var1_1, var2_2);
            }
            case 0: {
                var5_4 /* !! */  = (int)md.jzdv("jzlk", jzeb(int ), (int)70);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl215:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)md.jzdv("jzlm", jzeb(int ), (int)71);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 2: {
                var5_4 /* !! */  = (int)md.jzdv("jzlo", jzeb(int ), (int)72);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 3: {
                var5_4 /* !! */  = (int)md.jzdv("jzlq", jzeb(int ), (int)73);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 4: {
                var5_4 /* !! */  = (int)md.jzdv("jzls", jzeb(int ), (int)74);
                if (var6_3) {
                    throw null;
                }
            }
lbl234:
            // 5 sources

            case 5: {
                var5_4 /* !! */  = (int)md.jzdv("jzlu", jzeb(int ), (int)75);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 6: {
                var5_4 /* !! */  = (int)md.jzdv("jzlw", jzeb(int ), (int)76);
                if (!var6_3) ** GOTO lbl215
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)md.jzdv("jzly", jzeb(int ), (int)77);
                if (!var6_3) ** GOTO lbl234
                throw null;
            }
lbl247:
            // 3 sources

            case 8: {
                var5_4 /* !! */  = (int)md.jzdv("jzlz", jzeb(int ), (int)78);
                if (var6_3) {
                    throw null;
                }
            }
lbl251:
            // 4 sources

            case 9: {
                var5_4 /* !! */  = (int)md.jzdv("jzmb", jzeb(int ), (int)79);
                if (!var6_3) ** GOTO lbl247
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)md.jzdv("jzmd", jzeb(int ), (int)80);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl260:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)md.jzdv("jzmf", jzeb(int ), (int)81);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl301
                    break;
                }
            }
            case 12: {
                do {
                    var5_4 /* !! */  = (int)md.jzdv("jzmh", jzeb(int ), (int)82);
                } while (!var6_3);
                throw null;
            }
lbl271:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)md.jzdv("jzmj", jzeb(int ), (int)83);
                if (!var6_3) ** GOTO lbl251
                throw null;
            }
lbl275:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)md.jzdv("jzml", jzeb(int ), (int)84);
                if (!var6_3) ** GOTO lbl260
                throw null;
            }
            case 15: {
                do {
                    var5_4 /* !! */  = (int)md.jzdv("jzmm", jzeb(int ), (int)85);
                } while (!var6_3);
                throw null;
            }
lbl284:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)md.jzdv("jzmo", jzeb(int ), (int)86);
                if (!var6_3) ** GOTO lbl234
                throw null;
            }
lbl288:
            // 3 sources

            case 17: {
                var5_4 /* !! */  = (int)md.jzdv("jzmq", jzeb(int ), (int)87);
                if (!var6_3) ** GOTO lbl247
                throw null;
            }
lbl292:
            // 2 sources

            case 18: {
                var5_4 /* !! */  = (int)md.jzdv("jzms", jzeb(int ), (int)88);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 19: {
                var5_4 /* !! */  = (int)md.jzdv("jzmu", jzeb(int ), (int)89);
                if (!var6_3) ** GOTO lbl284
                throw null;
            }
lbl301:
            // 5 sources

            case 20: {
                var5_4 /* !! */  = (int)md.jzdv("jzmw", jzeb(int ), (int)90);
                if (!var6_3) ** GOTO lbl275
                throw null;
            }
            case 21: 
        }
        var5_4 /* !! */  = (int)md.jzdv("jzmy", jzeb(int ), (int)91);
        ** while (!var6_3)
lbl308:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float jzfa(int n2) {
        return Float.intBitsToFloat(jzec[n2] ^ jzed[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        var11_5 = md.c;
        var10_6 /* !! */  = md.b;
        var9_7 = md.a;
        if (!var11_5) ** GOTO lbl10
        throw null;
lbl-1000:
        // 15 sources

        {
            if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var10_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl10:
                // 1 sources

                if (var9_7 || var9_7) ** GOTO lbl-1000
                if (this.transition.isAlive()) ** GOTO lbl16
                if (var9_7 || var9_7) ** GOTO lbl-1000
                this.finishClosing();
                if (var9_7 || var9_7) ** GOTO lbl-1000
                return;
lbl16:
                // 1 sources

                if (var9_7 || var9_7) ** GOTO lbl-1000
                var5_8 = this.transition.scale();
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var6_9 = this.transition.alpha();
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var7_10 = var1_1.method_51448();
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var7_10.pushMatrix();
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var7_10.translate((float)this.field_22789 * md.jzdv("jzff", jzfa(int ), (int)7), (float)this.field_22790 * md.jzdv("jzfh", jzfa(int ), (int)8));
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var7_10.scale(var5_8, var5_8);
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var7_10.translate((float)(-this.field_22789) * md.jzdv("jzfl", jzfa(int ), (int)9), (float)(-this.field_22790) * md.jzdv("jzfn", jzfa(int ), (int)10));
                if (var9_7 || var9_7) ** GOTO lbl-1000
                super.method_25394(var1_1, var2_2, var3_3, var4_4);
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var8_11 = nd.multAlpha((int)md.jzdv("jzfp", jzeb(int ), (int)11), var6_9);
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var1_1.method_27534(this.field_22793, (class_2561)class_2561.method_43470((String)"\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0432\u0437\u0440\u044b\u0432\u043d\u043e\u0435 \u0437\u0435\u043b\u044c\u0435"), this.field_22789 / md.jzdv("jzfr", jzeb(int ), (int)12), Math.max((int)md.jzdv("jzft", jzeb(int ), (int)13), (this.field_22790 - this.field_2779) / md.jzdv("jzfv", jzeb(int ), (int)14) - md.jzdv("jzfw", jzeb(int ), (int)15)), var8_11);
                if (var9_7 || var9_7) ** GOTO lbl-1000
                var7_10.popMatrix();
                if (var9_7 || var9_7) continue block35;
                return;
lbl45:
                // 2 sources

                case 0: {
                    var10_6 /* !! */  = (int)md.jzdv("jzfz", jzeb(int ), (int)16);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl60
                }
lbl50:
                // 2 sources

                case 1: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgb", jzeb(int ), (int)17);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl174
                }
                case 2: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgc", jzeb(int ), (int)18);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
lbl60:
                // 3 sources

                case 3: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgd", jzeb(int ), (int)19);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl65:
                // 2 sources

                case 4: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgf", jzeb(int ), (int)20);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
                case 5: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgh", jzeb(int ), (int)21);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl75:
                // 2 sources

                case 6: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var10_6 /* !! */  = (int)md.jzdv("jzgj", jzeb(int ), (int)22);
                        if (var11_5) {
                            throw null;
                        }
                        ** GOTO lbl132
                        break;
                    }
                }
lbl81:
                // 2 sources

                case 7: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgl", jzeb(int ), (int)23);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl86:
                // 3 sources

                case 8: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgn", jzeb(int ), (int)24);
                    if (!var11_5) ** GOTO lbl50
                    throw null;
                }
                case 9: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgp", jzeb(int ), (int)25);
                    if (!var11_5) ** GOTO lbl86
                    throw null;
                }
lbl94:
                // 2 sources

                case 10: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgr", jzeb(int ), (int)26);
                    if (!var11_5) ** GOTO lbl81
                    throw null;
                }
                case 11: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgt", jzeb(int ), (int)27);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl127
                }
                case 12: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgv", jzeb(int ), (int)28);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
                case 13: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgw", jzeb(int ), (int)29);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl146
                }
                case 14: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgx", jzeb(int ), (int)30);
                    if (!var11_5) ** GOTO lbl60
                    throw null;
                }
                case 15: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgy", jzeb(int ), (int)31);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl127
                }
lbl122:
                // 4 sources

                case 16: {
                    var10_6 /* !! */  = (int)md.jzdv("jzgz", jzeb(int ), (int)32);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl127:
                // 3 sources

                case 17: {
                    var10_6 /* !! */  = (int)md.jzdv("jzha", jzeb(int ), (int)33);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
lbl132:
                // 2 sources

                case 18: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhb", jzeb(int ), (int)34);
                    if (!var11_5) ** GOTO lbl45
                    throw null;
                }
lbl136:
                // 2 sources

                case 19: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhc", jzeb(int ), (int)35);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl170
                }
lbl141:
                // 3 sources

                case 20: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhd", jzeb(int ), (int)36);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl146:
                // 3 sources

                case 21: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhe", jzeb(int ), (int)37);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl151:
                // 3 sources

                case 22: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhf", jzeb(int ), (int)38);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl178
                }
lbl156:
                // 2 sources

                case 23: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhg", jzeb(int ), (int)39);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl170
                }
                case 24: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhh", jzeb(int ), (int)40);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl178
                }
lbl166:
                // 2 sources

                case 25: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhi", jzeb(int ), (int)41);
                    if (!var11_5) ** GOTO lbl94
                    throw null;
                }
lbl170:
                // 3 sources

                case 26: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhj", jzeb(int ), (int)42);
                    if (!var11_5) ** GOTO lbl136
                    throw null;
                }
lbl174:
                // 2 sources

                case 27: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhk", jzeb(int ), (int)43);
                    if (!var11_5) ** GOTO lbl146
                    throw null;
                }
lbl178:
                // 3 sources

                case 28: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhl", jzeb(int ), (int)44);
                    if (!var11_5) ** GOTO lbl86
                    throw null;
                }
lbl182:
                // 2 sources

                case 29: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhm", jzeb(int ), (int)45);
                    if (!var11_5) ** GOTO lbl75
                    throw null;
                }
                case 30: {
                    var10_6 /* !! */  = (int)md.jzdv("jzhn", jzeb(int ), (int)46);
                    if (!var11_5) ** GOTO lbl182
                    throw null;
                }
lbl190:
                // 2 sources

                case 31: {
                    var10_6 /* !! */  = (int)md.jzdv("jzho", jzeb(int ), (int)47);
                    if (!var11_5) ** GOTO lbl65
                    throw null;
                }
                case 32: 
            }
        }
        var10_6 /* !! */  = (int)md.jzdv("jzhp", jzeb(int ), (int)48);
        ** while (!var11_5)
lbl197:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jzqn() {
        md.jzed[100] = 967794741;
        md.jzed[101] = -57310175;
        md.jzed[102] = -706215960;
        md.jzed[103] = 154969393;
        md.jzed[104] = 298464283;
        md.jzed[105] = -339235359;
        md.jzed[106] = 1528817141;
        md.jzed[107] = 361998516;
        md.jzed[108] = 1065121797;
        md.jzed[109] = 1073223510;
        md.jzed[110] = -2094143923;
        md.jzed[111] = -580752983;
        md.jzed[112] = 1813318164;
        md.jzed[113] = 318769038;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void method_25419() {
        block39: {
            v0 /* !! */  = md.rz;
            if (true) ** GOTO lbl5
            block27: while (true) {
                v0 /* !! */  = (long)(v1 - md.jzdv("jznc", jzdq(int ), (int)40));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -966378675: {
                        v1 = md.jzdv("jznd", jzdq(int ), (int)41);
                        continue block27;
                    }
                    case 792576084: {
                        break block27;
                    }
                    case 1066840064: {
                        v1 = md.jzdv("jzne", jzdq(int ), (int)42);
                        continue block27;
                    }
                    case 1922092640: {
                        v1 = md.jzdv("jzng", jzdq(int ), (int)43);
                        continue block27;
                    }
                }
                break;
            }
            var3_1 = md.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = md.rz - md.jzdv("jznh", jzdq(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == md.jzdv("jznj", jzeb(int ), (int)92)) break;
                v2 /* !! */  = (long)md.jzdv("jznk", jzeb(int ), (int)93);
            }
            var2_2 /* !! */  = md.b;
            v3 /* !! */  = md.rz;
            block29: while (true) {
                switch ((int)v3 /* !! */ ) {
                    case -1584753544: {
                        v3 /* !! */  = (long)(md.jzdv("jznn", jzdq(int ), (int)46) - md.jzdv("jznl", jzdq(int ), (int)45));
                        continue block29;
                    }
                    case 792576084: {
                        break block29;
                    }
                }
                break;
            }
            var1_3 = md.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3) ** GOTO lbl64
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block30: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) ** GOTO lbl64
                        v4 /* !! */  = md.rz;
                        block31: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -381319605: {
                                    v5 = md.jzdv("jznr", jzdq(int ), (int)48);
                                    ** GOTO lbl52
                                }
                                case 792576084: {
                                    break block31;
                                }
                                case 828436418: {
                                    v5 = md.jzdv("jzns", jzdq(int ), (int)49);
lbl52:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - md.jzdv("jznp", jzdq(int ), (int)47));
                                    continue block31;
                                }
                            }
                            break;
                        }
                        v6 /* !! */  = md.rz;
                        block32: while (true) {
                            switch ((int)v6 /* !! */ ) {
                                case 792576084: {
                                    break block32;
                                }
                                case 1290006996: {
                                    v6 /* !! */  = (long)(md.jzdv("jznv", jzdq(int ), (int)51) - md.jzdv("jznu", jzdq(int ), (int)50));
                                    continue block32;
                                }
                            }
                            break;
                        }
                        this.transition.close();
                        if (!var1_3 && !var1_3) ** GOTO lbl65
lbl64:
                        // 3 sources

                        return;
lbl65:
                        // 1 sources

                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)md.jzdv("jznx", jzeb(int ), (int)94);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block30;
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        do {
                            var2_2 /* !! */  = (int)md.jzdv("jzoc", jzeb(int ), (int)97);
                        } while (!var3_1);
                        throw null;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)md.jzdv("jzod", jzeb(int ), (int)98);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block30;
                        throw null;
                    }
                    case 5: {
                        break block39;
                    }
lbl85:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)md.jzdv("jzny", jzeb(int ), (int)95);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block30;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)md.jzdv("jzob", jzeb(int ), (int)96);
            if (!var3_1) ** break;
            throw null;
        }
        var2_2 /* !! */  = (int)md.jzdv("jzoe", jzeb(int ), (int)99);
        ** while (!var3_1)
lbl99:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jzqk() {
        md.jzed[0] = 1608940384;
        md.jzed[1] = -1100029238;
        md.jzed[2] = 952327184;
        md.jzed[3] = -1489158411;
        md.jzed[4] = 1299682414;
        md.jzed[5] = 2027532429;
        md.jzed[6] = 1565499460;
        md.jzed[7] = -1070295231;
        md.jzed[8] = -1660608338;
        md.jzed[9] = -992206070;
        md.jzed[10] = 2112664672;
        md.jzed[11] = 1757378453;
        md.jzed[12] = 953312371;
        md.jzed[13] = -284810245;
        md.jzed[14] = 1956534118;
        md.jzed[15] = -1184267432;
        md.jzed[16] = -348374988;
        md.jzed[17] = -355515896;
        md.jzed[18] = 273118643;
        md.jzed[19] = 1592417426;
        md.jzed[20] = -297353584;
        md.jzed[21] = 119851136;
        md.jzed[22] = -1872365400;
        md.jzed[23] = -1462082367;
        md.jzed[24] = 792852114;
        md.jzed[25] = 1704271430;
        md.jzed[26] = 2060020876;
        md.jzed[27] = 1202861805;
        md.jzed[28] = -1632719307;
        md.jzed[29] = -1168269303;
        md.jzed[30] = 326344881;
        md.jzed[31] = 8335098;
        md.jzed[32] = 2132908330;
        md.jzed[33] = -566269513;
        md.jzed[34] = -266295852;
        md.jzed[35] = -393702852;
        md.jzed[36] = -310734888;
        md.jzed[37] = 5423922;
        md.jzed[38] = 1894108873;
        md.jzed[39] = 1791372624;
        md.jzed[40] = 497171107;
        md.jzed[41] = -984079292;
        md.jzed[42] = 472749911;
        md.jzed[43] = 1438808873;
        md.jzed[44] = -782193296;
        md.jzed[45] = -2038365232;
        md.jzed[46] = -531589792;
        md.jzed[47] = -1215321751;
        md.jzed[48] = -150751383;
        md.jzed[49] = -1837544584;
        md.jzed[50] = 1332073209;
        md.jzed[51] = -188508374;
        md.jzed[52] = -852506960;
        md.jzed[53] = 616896541;
        md.jzed[54] = 331888333;
        md.jzed[55] = 1275113314;
        md.jzed[56] = -224653518;
        md.jzed[57] = -511421002;
        md.jzed[58] = -420097769;
        md.jzed[59] = 772219575;
        md.jzed[60] = 1235607899;
        md.jzed[61] = -1811625574;
        md.jzed[62] = -1068976131;
        md.jzed[63] = 1356153048;
        md.jzed[64] = -822355996;
        md.jzed[65] = -250641364;
        md.jzed[66] = 149493632;
        md.jzed[67] = 1466893913;
        md.jzed[68] = 1987525730;
        md.jzed[69] = 2069590950;
        md.jzed[70] = -383344482;
        md.jzed[71] = 2051395552;
        md.jzed[72] = 1545909509;
        md.jzed[73] = 249859368;
        md.jzed[74] = -1259582560;
        md.jzed[75] = -1713731691;
        md.jzed[76] = 9623418;
        md.jzed[77] = 1980963817;
        md.jzed[78] = 983920337;
        md.jzed[79] = -408907075;
        md.jzed[80] = 1702918150;
        md.jzed[81] = -1332618941;
        md.jzed[82] = 939736331;
        md.jzed[83] = 1025433125;
        md.jzed[84] = -2091553505;
        md.jzed[85] = 866607178;
        md.jzed[86] = -1061758188;
        md.jzed[87] = -397056375;
        md.jzed[88] = -700508554;
        md.jzed[89] = -1873198454;
        md.jzed[90] = -1377114040;
        md.jzed[91] = -2106605971;
        md.jzed[92] = 1562433378;
        md.jzed[93] = -1026490332;
        md.jzed[94] = 1934952856;
        md.jzed[95] = -636662289;
        md.jzed[96] = -23242684;
        md.jzed[97] = -1160100008;
        md.jzed[98] = 2033112745;
        md.jzed[99] = 157237747;
    }

    static {
        jzec = new int[114];
        jzed = new int[114];
        md.jzqe();
        md.jzqj();
        md.jzqk();
        md.jzqn();
        jzds = new long[67];
        jzdt = new long[67];
        md.jzqp();
        md.jzqs();
    }

    private static /* synthetic */ int jzeb(int n2) {
        return jzec[n2] ^ jzed[n2];
    }

    public static /* synthetic */ CallSite jzdv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jzqe() {
        md.jzec[0] = 1608940384;
        md.jzec[1] = -1100029239;
        md.jzec[2] = 952327186;
        md.jzec[3] = -1489158410;
        md.jzec[4] = 1299682413;
        md.jzec[5] = 2027532425;
        md.jzec[6] = 1565499460;
        md.jzec[7] = -13330623;
        md.jzec[8] = -1576722258;
        md.jzec[9] = -69459190;
        md.jzec[10] = 1122808928;
        md.jzec[11] = -1756456851;
        md.jzec[12] = 953312369;
        md.jzec[13] = -284810253;
        md.jzec[14] = 1956534116;
        md.jzec[15] = -1184267434;
        md.jzec[16] = -348375020;
        md.jzec[17] = -355515900;
        md.jzec[18] = 273118625;
        md.jzec[19] = 1592417409;
        md.jzec[20] = -297353569;
        md.jzec[21] = 119851143;
        md.jzec[22] = -1872365405;
        md.jzec[23] = -1462082365;
        md.jzec[24] = 792852109;
        md.jzec[25] = 1704271424;
        md.jzec[26] = 2060020886;
        md.jzec[27] = 1202861810;
        md.jzec[28] = -1632719299;
        md.jzec[29] = -1168269312;
        md.jzec[30] = 326344888;
        md.jzec[31] = 8335084;
        md.jzec[32] = 2132908343;
        md.jzec[33] = -566269513;
        md.jzec[34] = -266295853;
        md.jzec[35] = -393702862;
        md.jzec[36] = -310734885;
        md.jzec[37] = 5423906;
        md.jzec[38] = 1894108884;
        md.jzec[39] = 1791372636;
        md.jzec[40] = 497171112;
        md.jzec[41] = -984079289;
        md.jzec[42] = 472749914;
        md.jzec[43] = 1438808892;
        md.jzec[44] = -782193308;
        md.jzec[45] = -2038365238;
        md.jzec[46] = -531589769;
        md.jzec[47] = -1215321757;
        md.jzec[48] = -150751377;
        md.jzec[49] = -1837544583;
        md.jzec[50] = 1332073208;
        md.jzec[51] = 1899091650;
        md.jzec[52] = 852506959;
        md.jzec[53] = 735537891;
        md.jzec[54] = 331888332;
        md.jzec[55] = 1275113315;
        md.jzec[56] = -1418338735;
        md.jzec[57] = 511421001;
        md.jzec[58] = -494653577;
        md.jzec[59] = -772219576;
        md.jzec[60] = 1160575265;
        md.jzec[61] = 1811625573;
        md.jzec[62] = 2003530635;
        md.jzec[63] = -1356153049;
        md.jzec[64] = 1186959433;
        md.jzec[65] = 250641363;
        md.jzec[66] = 1879537832;
        md.jzec[67] = 1466893912;
        md.jzec[68] = 1987525731;
        md.jzec[69] = 230766850;
        md.jzec[70] = -383344501;
        md.jzec[71] = 2051395562;
        md.jzec[72] = 1545909527;
        md.jzec[73] = 249859365;
        md.jzec[74] = -1259582557;
        md.jzec[75] = -1713731685;
        md.jzec[76] = 9623419;
        md.jzec[77] = 1980963812;
        md.jzec[78] = 983920350;
        md.jzec[79] = -408907095;
        md.jzec[80] = 1702918153;
        md.jzec[81] = -1332618921;
        md.jzec[82] = 939736347;
        md.jzec[83] = 1025433125;
        md.jzec[84] = -2091553526;
        md.jzec[85] = 866607172;
        md.jzec[86] = -1061758192;
        md.jzec[87] = -397056384;
        md.jzec[88] = -700508555;
        md.jzec[89] = -1873198438;
        md.jzec[90] = -1377114040;
        md.jzec[91] = -2106605983;
        md.jzec[92] = 1562433379;
        md.jzec[93] = -2076801970;
        md.jzec[94] = 1934952859;
        md.jzec[95] = -636662294;
        md.jzec[96] = -23242681;
        md.jzec[97] = -1160100008;
        md.jzec[98] = 2033112746;
        md.jzec[99] = 157237747;
    }
}

