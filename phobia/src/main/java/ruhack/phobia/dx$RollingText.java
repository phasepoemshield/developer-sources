/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class dx$RollingText {
    public static final int b;
    static final long lz = 4351959104851281546L;
    public static final boolean a;
    public static final boolean c;
    private long switchAt;
    private String previous;
    private String current;
    private static long[] fgki;
    private static long[] fgkj;
    private static int[] fgko;
    private static int[] fgkn;

    private static /* synthetic */ void fgxp() {
        dx$RollingText.fgko[0] = 1961208153;
        dx$RollingText.fgko[1] = -862566763;
        dx$RollingText.fgko[2] = -1042051711;
        dx$RollingText.fgko[3] = -443361077;
        dx$RollingText.fgko[4] = -592073934;
        dx$RollingText.fgko[5] = 1822302427;
        dx$RollingText.fgko[6] = -1865688433;
        dx$RollingText.fgko[7] = -859333118;
        dx$RollingText.fgko[8] = 570852028;
        dx$RollingText.fgko[9] = -778495886;
        dx$RollingText.fgko[10] = -1873359195;
        dx$RollingText.fgko[11] = -1844895074;
        dx$RollingText.fgko[12] = -1632676660;
        dx$RollingText.fgko[13] = -1382129514;
        dx$RollingText.fgko[14] = -846169658;
        dx$RollingText.fgko[15] = -860590440;
        dx$RollingText.fgko[16] = 519877793;
        dx$RollingText.fgko[17] = 66430323;
        dx$RollingText.fgko[18] = 2086917704;
        dx$RollingText.fgko[19] = -168383557;
        dx$RollingText.fgko[20] = 843290476;
        dx$RollingText.fgko[21] = 1343819944;
        dx$RollingText.fgko[22] = -181511014;
        dx$RollingText.fgko[23] = 1009065626;
        dx$RollingText.fgko[24] = -2108285940;
        dx$RollingText.fgko[25] = 1673831237;
        dx$RollingText.fgko[26] = -272166087;
        dx$RollingText.fgko[27] = 2060414368;
        dx$RollingText.fgko[28] = -1372463431;
        dx$RollingText.fgko[29] = -717363006;
        dx$RollingText.fgko[30] = 170965919;
        dx$RollingText.fgko[31] = 1718839370;
        dx$RollingText.fgko[32] = -766950700;
        dx$RollingText.fgko[33] = -1496363870;
        dx$RollingText.fgko[34] = -941660008;
        dx$RollingText.fgko[35] = 2082197476;
        dx$RollingText.fgko[36] = -1851291706;
        dx$RollingText.fgko[37] = 568107045;
        dx$RollingText.fgko[38] = 210345883;
        dx$RollingText.fgko[39] = -472941965;
        dx$RollingText.fgko[40] = 986414094;
        dx$RollingText.fgko[41] = 1934971341;
        dx$RollingText.fgko[42] = -1038963705;
        dx$RollingText.fgko[43] = -64501707;
        dx$RollingText.fgko[44] = -442444161;
        dx$RollingText.fgko[45] = 180238532;
        dx$RollingText.fgko[46] = 1313285629;
        dx$RollingText.fgko[47] = 1631231955;
        dx$RollingText.fgko[48] = 1814550162;
        dx$RollingText.fgko[49] = 833259620;
        dx$RollingText.fgko[50] = 1590323114;
        dx$RollingText.fgko[51] = 1879357254;
        dx$RollingText.fgko[52] = 734502541;
        dx$RollingText.fgko[53] = -815341967;
        dx$RollingText.fgko[54] = -1763759900;
        dx$RollingText.fgko[55] = 2121683258;
        dx$RollingText.fgko[56] = -1826991692;
        dx$RollingText.fgko[57] = 1843689583;
        dx$RollingText.fgko[58] = 761088967;
        dx$RollingText.fgko[59] = 1357894985;
        dx$RollingText.fgko[60] = -1882820972;
        dx$RollingText.fgko[61] = -563571554;
        dx$RollingText.fgko[62] = 1873574459;
        dx$RollingText.fgko[63] = 1180238577;
        dx$RollingText.fgko[64] = 635156478;
        dx$RollingText.fgko[65] = 257977546;
        dx$RollingText.fgko[66] = 423520554;
        dx$RollingText.fgko[67] = -935046033;
        dx$RollingText.fgko[68] = -370153370;
        dx$RollingText.fgko[69] = -402599794;
        dx$RollingText.fgko[70] = -1183181812;
        dx$RollingText.fgko[71] = -1095470606;
        dx$RollingText.fgko[72] = -452568483;
        dx$RollingText.fgko[73] = 1675914734;
        dx$RollingText.fgko[74] = -482431398;
        dx$RollingText.fgko[75] = -870950914;
        dx$RollingText.fgko[76] = 1064204926;
        dx$RollingText.fgko[77] = 181273782;
        dx$RollingText.fgko[78] = 444240709;
        dx$RollingText.fgko[79] = -852276354;
        dx$RollingText.fgko[80] = -931446298;
        dx$RollingText.fgko[81] = -870990110;
        dx$RollingText.fgko[82] = 1966924889;
        dx$RollingText.fgko[83] = 1618662581;
        dx$RollingText.fgko[84] = 430265529;
        dx$RollingText.fgko[85] = -1573257202;
        dx$RollingText.fgko[86] = -1837640472;
        dx$RollingText.fgko[87] = 345453841;
        dx$RollingText.fgko[88] = -2032401270;
        dx$RollingText.fgko[89] = -2031454604;
        dx$RollingText.fgko[90] = 495789294;
        dx$RollingText.fgko[91] = 737732667;
        dx$RollingText.fgko[92] = -657978866;
        dx$RollingText.fgko[93] = -1759739415;
        dx$RollingText.fgko[94] = 1490874733;
        dx$RollingText.fgko[95] = -904604006;
        dx$RollingText.fgko[96] = 1813905847;
        dx$RollingText.fgko[97] = 85801749;
        dx$RollingText.fgko[98] = 739561701;
        dx$RollingText.fgko[99] = 1822039530;
    }

    private static /* synthetic */ long fgkh(int n2) {
        return fgki[n2] ^ fgkj[n2];
    }

    private static /* synthetic */ void fhaf() {
        dx$RollingText.fgkj[0] = 6055696414567137904L;
        dx$RollingText.fgkj[1] = 1052368710560904974L;
        dx$RollingText.fgkj[2] = 3051171120173523401L;
        dx$RollingText.fgkj[3] = -5612442886803244669L;
        dx$RollingText.fgkj[4] = -6146512095919740405L;
        dx$RollingText.fgkj[5] = -8168333457329166436L;
        dx$RollingText.fgkj[6] = 5346119285363022833L;
        dx$RollingText.fgkj[7] = 6114596967413274130L;
        dx$RollingText.fgkj[8] = -7289106018508253714L;
        dx$RollingText.fgkj[9] = 3505853692219259137L;
        dx$RollingText.fgkj[10] = 4930989913821732988L;
        dx$RollingText.fgkj[11] = 7221238871622554320L;
        dx$RollingText.fgkj[12] = -5676965975270967877L;
        dx$RollingText.fgkj[13] = 3576899721560949207L;
        dx$RollingText.fgkj[14] = -7238786944936113959L;
        dx$RollingText.fgkj[15] = 4641925932495507245L;
        dx$RollingText.fgkj[16] = 1640997853963776698L;
        dx$RollingText.fgkj[17] = 8842296785738653410L;
        dx$RollingText.fgkj[18] = 1704238676792099122L;
        dx$RollingText.fgkj[19] = -5035214264087482812L;
        dx$RollingText.fgkj[20] = -2036547633704443990L;
        dx$RollingText.fgkj[21] = 1941794557506701223L;
        dx$RollingText.fgkj[22] = -262734940472000555L;
        dx$RollingText.fgkj[23] = 8507807225284401436L;
        dx$RollingText.fgkj[24] = -2580455612623678170L;
        dx$RollingText.fgkj[25] = 2955358978691242657L;
        dx$RollingText.fgkj[26] = 387020645456738918L;
        dx$RollingText.fgkj[27] = -952590079201730984L;
        dx$RollingText.fgkj[28] = -1254342260326530686L;
        dx$RollingText.fgkj[29] = -1709999328837196226L;
        dx$RollingText.fgkj[30] = 2153418122681600873L;
        dx$RollingText.fgkj[31] = 4847496497377893693L;
        dx$RollingText.fgkj[32] = -307474716686864580L;
        dx$RollingText.fgkj[33] = -7486402630501797931L;
        dx$RollingText.fgkj[34] = 48460416938177399L;
        dx$RollingText.fgkj[35] = 8593290738606634583L;
        dx$RollingText.fgkj[36] = 722683818784028356L;
        dx$RollingText.fgkj[37] = 7613890990118146256L;
        dx$RollingText.fgkj[38] = 1723969244114643848L;
        dx$RollingText.fgkj[39] = -3988111836119467649L;
        dx$RollingText.fgkj[40] = 1522736688072799157L;
        dx$RollingText.fgkj[41] = -8781352360087294726L;
        dx$RollingText.fgkj[42] = -5282900024619670315L;
        dx$RollingText.fgkj[43] = 2775228328475433463L;
        dx$RollingText.fgkj[44] = -2213393937721544821L;
        dx$RollingText.fgkj[45] = 6981064060020645334L;
        dx$RollingText.fgkj[46] = -3596767046164468214L;
        dx$RollingText.fgkj[47] = -6288394990516951605L;
        dx$RollingText.fgkj[48] = 1587611499517218780L;
        dx$RollingText.fgkj[49] = 8044476342541889658L;
        dx$RollingText.fgkj[50] = -6146393194896264549L;
        dx$RollingText.fgkj[51] = 5660701311879675952L;
        dx$RollingText.fgkj[52] = -7674730599602279722L;
        dx$RollingText.fgkj[53] = 3534979821442020071L;
        dx$RollingText.fgkj[54] = 9113456619658499347L;
        dx$RollingText.fgkj[55] = -1304323907989867752L;
        dx$RollingText.fgkj[56] = 8034250242298704927L;
        dx$RollingText.fgkj[57] = 614564901396722413L;
        dx$RollingText.fgkj[58] = 5408079076759236L;
        dx$RollingText.fgkj[59] = -2677486196742847026L;
        dx$RollingText.fgkj[60] = 2077237087521281049L;
        dx$RollingText.fgkj[61] = -4013849567522449739L;
        dx$RollingText.fgkj[62] = 4853406052703466133L;
        dx$RollingText.fgkj[63] = 1780337963430397939L;
        dx$RollingText.fgkj[64] = 5219710447628982074L;
        dx$RollingText.fgkj[65] = -4663308138029115296L;
        dx$RollingText.fgkj[66] = 1859944753292706594L;
        dx$RollingText.fgkj[67] = 3312460336642999008L;
        dx$RollingText.fgkj[68] = 3514171971162809797L;
        dx$RollingText.fgkj[69] = -6715148976955066920L;
        dx$RollingText.fgkj[70] = 7470781005587449258L;
        dx$RollingText.fgkj[71] = -4886582127117497368L;
        dx$RollingText.fgkj[72] = -3356856017769795082L;
        dx$RollingText.fgkj[73] = 6824778095174549906L;
        dx$RollingText.fgkj[74] = -6390838075283566387L;
        dx$RollingText.fgkj[75] = -5370052517650427165L;
        dx$RollingText.fgkj[76] = -4628451762329412452L;
        dx$RollingText.fgkj[77] = 3729148460535224566L;
        dx$RollingText.fgkj[78] = -5094530545940955725L;
        dx$RollingText.fgkj[79] = -145188095096561005L;
        dx$RollingText.fgkj[80] = 8158299045676166915L;
        dx$RollingText.fgkj[81] = 7333290014186160900L;
        dx$RollingText.fgkj[82] = -4499073331315983665L;
        dx$RollingText.fgkj[83] = 356662159544323066L;
        dx$RollingText.fgkj[84] = 3080246278682020914L;
        dx$RollingText.fgkj[85] = -5434979539007290176L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String value() {
        block35: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = dx$RollingText.lz - dx$RollingText.fgkk("fgqj", fgkh(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == dx$RollingText.fgkk("fgql", fgkm(int ), (int)77)) break;
                v0 /* !! */  = (long)dx$RollingText.fgkk("fgqn", fgkm(int ), (int)78);
            }
            var3_1 = dx$RollingText.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = dx$RollingText.lz - dx$RollingText.fgkk("fgqp", fgkh(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == dx$RollingText.fgkk("fgqr", fgkm(int ), (int)79)) break;
                v1 /* !! */  = (long)dx$RollingText.fgkk("fgqt", fgkm(int ), (int)80);
            }
            var2_2 /* !! */  = dx$RollingText.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = dx$RollingText.lz - dx$RollingText.fgkk("fgqu", fgkh(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == dx$RollingText.fgkk("fgqw", fgkm(int ), (int)81)) break;
                v2 /* !! */  = (long)dx$RollingText.fgkk("fgqx", fgkm(int ), (int)82);
            }
            var1_3 = dx$RollingText.a;
            if (var3_1) {
                throw null;
lbl24:
                // 3 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = dx$RollingText.lz - dx$RollingText.fgkk("fgra", fgkh(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == dx$RollingText.fgkk("fgrc", fgkm(int ), (int)83)) break;
                v3 /* !! */  = (long)dx$RollingText.fgkk("fgre", fgkm(int ), (int)84);
            }
            if (this.current != null) break block35;
            if (var1_3) ** GOTO lbl24
            v4 = "0:00";
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl59
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v5 /* !! */  = dx$RollingText.lz;
                if (true) ** GOTO lbl49
                block20: while (true) {
                    v5 /* !! */  = (long)(v6 - dx$RollingText.fgkk("fgro", fgkh(int ), (int)58));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1984952694: {
                            break block20;
                        }
                        case -1958521533: {
                            v6 = dx$RollingText.fgkk("fgrp", fgkh(int ), (int)59);
                            continue block20;
                        }
                        case 570280913: {
                            v6 = dx$RollingText.fgkk("fgrq", fgkh(int ), (int)60);
                            continue block20;
                        }
                    }
                    break;
                }
                v4 = this.current;
lbl59:
                // 2 sources

                return v4;
            }
lbl60:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgrr", fgkm(int ), (int)85);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgrs", fgkm(int ), (int)86);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl70:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgrt", fgkm(int ), (int)87);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl75:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgru", fgkm(int ), (int)88);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
lbl79:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgrv", fgkm(int ), (int)89);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
lbl83:
            // 3 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgrw", fgkm(int ), (int)90);
                } while (!var3_1);
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgsa", fgkm(int ), (int)91);
                    if (!var3_1) ** GOTO lbl75
                    throw null;
                }
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgsc", fgkm(int ), (int)92);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fgwb() {
        dx$RollingText.fgkn[0] = 1961208152;
        dx$RollingText.fgkn[1] = -862566764;
        dx$RollingText.fgkn[2] = -1042051709;
        dx$RollingText.fgkn[3] = -443361078;
        dx$RollingText.fgkn[4] = 1425357812;
        dx$RollingText.fgkn[5] = 1822302426;
        dx$RollingText.fgkn[6] = -144164903;
        dx$RollingText.fgkn[7] = 859333117;
        dx$RollingText.fgkn[8] = 1398239427;
        dx$RollingText.fgkn[9] = -778495885;
        dx$RollingText.fgkn[10] = 624046524;
        dx$RollingText.fgkn[11] = 1844895073;
        dx$RollingText.fgkn[12] = 126637120;
        dx$RollingText.fgkn[13] = -1382129513;
        dx$RollingText.fgkn[14] = 341300782;
        dx$RollingText.fgkn[15] = -860590439;
        dx$RollingText.fgkn[16] = 28585227;
        dx$RollingText.fgkn[17] = -66430324;
        dx$RollingText.fgkn[18] = 1754076184;
        dx$RollingText.fgkn[19] = -168383571;
        dx$RollingText.fgkn[20] = 843290479;
        dx$RollingText.fgkn[21] = 1343819939;
        dx$RollingText.fgkn[22] = -181511026;
        dx$RollingText.fgkn[23] = 1009065630;
        dx$RollingText.fgkn[24] = -2108285941;
        dx$RollingText.fgkn[25] = 1673831245;
        dx$RollingText.fgkn[26] = -272166085;
        dx$RollingText.fgkn[27] = 2060414371;
        dx$RollingText.fgkn[28] = -1372463443;
        dx$RollingText.fgkn[29] = -717363008;
        dx$RollingText.fgkn[30] = 170965903;
        dx$RollingText.fgkn[31] = 1718839385;
        dx$RollingText.fgkn[32] = -766950713;
        dx$RollingText.fgkn[33] = -1496363868;
        dx$RollingText.fgkn[34] = -941660024;
        dx$RollingText.fgkn[35] = 2082197494;
        dx$RollingText.fgkn[36] = -1851291707;
        dx$RollingText.fgkn[37] = 568107043;
        dx$RollingText.fgkn[38] = 210345872;
        dx$RollingText.fgkn[39] = -472941953;
        dx$RollingText.fgkn[40] = 986414091;
        dx$RollingText.fgkn[41] = 1934971332;
        dx$RollingText.fgkn[42] = 1038963704;
        dx$RollingText.fgkn[43] = 910898355;
        dx$RollingText.fgkn[44] = -442444161;
        dx$RollingText.fgkn[45] = 180238533;
        dx$RollingText.fgkn[46] = 1586045303;
        dx$RollingText.fgkn[47] = 1631231954;
        dx$RollingText.fgkn[48] = 251069621;
        dx$RollingText.fgkn[49] = 833259621;
        dx$RollingText.fgkn[50] = 1590323114;
        dx$RollingText.fgkn[51] = 1879357263;
        dx$RollingText.fgkn[52] = 734502533;
        dx$RollingText.fgkn[53] = -815341968;
        dx$RollingText.fgkn[54] = -1763759901;
        dx$RollingText.fgkn[55] = 2121683256;
        dx$RollingText.fgkn[56] = -1826991690;
        dx$RollingText.fgkn[57] = 1843689583;
        dx$RollingText.fgkn[58] = 761088975;
        dx$RollingText.fgkn[59] = 1357894987;
        dx$RollingText.fgkn[60] = -1882820970;
        dx$RollingText.fgkn[61] = 563571553;
        dx$RollingText.fgkn[62] = -2029252091;
        dx$RollingText.fgkn[63] = 1180238576;
        dx$RollingText.fgkn[64] = 38159097;
        dx$RollingText.fgkn[65] = 257977539;
        dx$RollingText.fgkn[66] = 423520553;
        dx$RollingText.fgkn[67] = -935046041;
        dx$RollingText.fgkn[68] = -370153363;
        dx$RollingText.fgkn[69] = -402599802;
        dx$RollingText.fgkn[70] = -1183181810;
        dx$RollingText.fgkn[71] = -1095470603;
        dx$RollingText.fgkn[72] = -452568491;
        dx$RollingText.fgkn[73] = 1675914733;
        dx$RollingText.fgkn[74] = -482431408;
        dx$RollingText.fgkn[75] = -870950913;
        dx$RollingText.fgkn[76] = 1064204916;
        dx$RollingText.fgkn[77] = -181273783;
        dx$RollingText.fgkn[78] = -1907519981;
        dx$RollingText.fgkn[79] = -852276353;
        dx$RollingText.fgkn[80] = 1742774449;
        dx$RollingText.fgkn[81] = 870990109;
        dx$RollingText.fgkn[82] = 423533539;
        dx$RollingText.fgkn[83] = 1618662580;
        dx$RollingText.fgkn[84] = -840695749;
        dx$RollingText.fgkn[85] = -1573257204;
        dx$RollingText.fgkn[86] = -1837640469;
        dx$RollingText.fgkn[87] = 345453845;
        dx$RollingText.fgkn[88] = -2032401271;
        dx$RollingText.fgkn[89] = -2031454603;
        dx$RollingText.fgkn[90] = 495789294;
        dx$RollingText.fgkn[91] = 737732664;
        dx$RollingText.fgkn[92] = -657978868;
        dx$RollingText.fgkn[93] = 1759739414;
        dx$RollingText.fgkn[94] = -868172322;
        dx$RollingText.fgkn[95] = -904604005;
        dx$RollingText.fgkn[96] = 1004681691;
        dx$RollingText.fgkn[97] = 85801748;
        dx$RollingText.fgkn[98] = -2051460574;
        dx$RollingText.fgkn[99] = 1822039528;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    long switchAt() {
        v0 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(dx$RollingText.fgkk("fgup", fgkh(int ), (int)76) - dx$RollingText.fgkk("fguj", fgkh(int ), (int)75));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1984952694: {
                    break block24;
                }
                case 360268683: {
                    continue block24;
                }
            }
            break;
        }
        var3_1 = dx$RollingText.c;
        v1 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - dx$RollingText.fgkk("fgus", fgkh(int ), (int)77));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1984952694: {
                    break block25;
                }
                case 500835749: {
                    v2 = dx$RollingText.fgkk("fguw", fgkh(int ), (int)78);
                    continue block25;
                }
                case 624506833: {
                    v2 = dx$RollingText.fgkk("fgux", fgkh(int ), (int)79);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = dx$RollingText.b;
        v3 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(dx$RollingText.fgkk("fgvd", fgkh(int ), (int)81) - dx$RollingText.fgkk("fguy", fgkh(int ), (int)80));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1984952694: {
                    break block26;
                }
                case 394375265: {
                    continue block26;
                }
            }
            break;
        }
        var1_3 = dx$RollingText.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (long)dx$RollingText.fgkk("fgve", fgkh(int ), (int)82);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = dx$RollingText.lz;
                if (true) ** GOTO lbl48
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - dx$RollingText.fgkk("fgvf", fgkh(int ), (int)83));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1984952694: {
                            break block28;
                        }
                        case -144563205: {
                            v5 = dx$RollingText.fgkk("fgvg", fgkh(int ), (int)84);
                            continue block28;
                        }
                        case 890942818: {
                            v5 = dx$RollingText.fgkk("fgvi", fgkh(int ), (int)85);
                            continue block28;
                        }
                    }
                    break;
                }
                return this.switchAt;
            }
            case 0: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgvl", fgkm(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 1: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgvs", fgkm(int ), (int)108);
                if (var3_1) {
                    throw null;
                }
            }
lbl67:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgvw", fgkm(int ), (int)109);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgvy", fgkm(int ), (int)110);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String previous() {
        block47: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = dx$RollingText.lz - dx$RollingText.fgkk("fgsf", fgkh(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == dx$RollingText.fgkk("fgsg", fgkm(int ), (int)93)) break;
                v0 /* !! */  = (long)dx$RollingText.fgkk("fgsh", fgkm(int ), (int)94);
            }
            var3_1 = dx$RollingText.c;
            v1 /* !! */  = dx$RollingText.lz;
            if (true) ** GOTO lbl12
            block28: while (true) {
                v1 /* !! */  = (long)(v2 - dx$RollingText.fgkk("fgsm", fgkh(int ), (int)62));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1984952694: {
                        break block28;
                    }
                    case -1417114993: {
                        v2 = dx$RollingText.fgkk("fgso", fgkh(int ), (int)63);
                        continue block28;
                    }
                    case 1186960763: {
                        v2 = dx$RollingText.fgkk("fgsp", fgkh(int ), (int)64);
                        continue block28;
                    }
                }
                break;
            }
            var2_2 /* !! */  = dx$RollingText.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = dx$RollingText.lz - dx$RollingText.fgkk("fgsr", fgkh(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == dx$RollingText.fgkk("fgss", fgkm(int ), (int)95)) break;
                v3 /* !! */  = (long)dx$RollingText.fgkk("fgst", fgkm(int ), (int)96);
            }
            var1_3 = dx$RollingText.a;
            if (var3_1) {
                throw null;
lbl31:
                // 3 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl31
            v4 /* !! */  = dx$RollingText.lz;
            if (true) ** GOTO lbl38
            block31: while (true) {
                v4 /* !! */  = (long)(v5 - dx$RollingText.fgkk("fgsz", fgkh(int ), (int)66));
lbl38:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1984952694: {
                        break block31;
                    }
                    case -1980947198: {
                        v5 = dx$RollingText.fgkk("fgtb", fgkh(int ), (int)67);
                        continue block31;
                    }
                    case -1184956578: {
                        v5 = dx$RollingText.fgkk("fgtd", fgkh(int ), (int)68);
                        continue block31;
                    }
                    case 1786108797: {
                        v5 = dx$RollingText.fgkk("fgte", fgkh(int ), (int)69);
                        continue block31;
                    }
                }
                break;
            }
            if (this.previous != null) break block47;
            if (var1_3) ** GOTO lbl31
            v6 /* !! */  = dx$RollingText.lz;
            if (true) ** GOTO lbl56
            block32: while (true) {
                v6 /* !! */  = (long)(v7 - dx$RollingText.fgkk("fgtf", fgkh(int ), (int)70));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1984952694: {
                        break block32;
                    }
                    case -1808033810: {
                        v7 = dx$RollingText.fgkk("fgtg", fgkh(int ), (int)71);
                        continue block32;
                    }
                    case -845607507: {
                        v7 = dx$RollingText.fgkk("fgtk", fgkh(int ), (int)72);
                        continue block32;
                    }
                    case 1395021404: {
                        v7 = dx$RollingText.fgkk("fgtm", fgkh(int ), (int)73);
                        continue block32;
                    }
                }
                break;
            }
            v8 = this.value();
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl86
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = dx$RollingText.lz - dx$RollingText.fgkk("fgtp", fgkh(int ), (int)74)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == dx$RollingText.fgkk("fgtq", fgkm(int ), (int)97)) {
                        v8 = this.previous;
                        break;
                    }
                    v9 /* !! */  = (long)dx$RollingText.fgkk("fgtr", fgkm(int ), (int)98);
                }
lbl86:
                // 2 sources

                return v8;
            }
            case 0: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgts", fgkm(int ), (int)99);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl92:
            // 3 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgtt", fgkm(int ), (int)100);
                } while (!var3_1);
                throw null;
            }
lbl97:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgtu", fgkm(int ), (int)101);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgtz", fgkm(int ), (int)102);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl106:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dx$RollingText.fgkk("fguc", fgkm(int ), (int)103);
                    if (!var3_1) ** GOTO lbl92
                    throw null;
                }
            }
lbl111:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgud", fgkm(int ), (int)104);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)dx$RollingText.fgkk("fgue", fgkm(int ), (int)105);
                if (!var3_1) ** GOTO lbl106
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dx$RollingText.fgkk("fguf", fgkm(int ), (int)106);
        ** while (!var3_1)
lbl122:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fgkk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean animating(long var1_1) {
        v0 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - dx$RollingText.fgkk("fgna", fgkh(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1984952694: {
                    break block27;
                }
                case -1557448110: {
                    v1 = dx$RollingText.fgkk("fgnb", fgkh(int ), (int)23);
                    continue block27;
                }
                case -1104057420: {
                    v1 = dx$RollingText.fgkk("fgnc", fgkh(int ), (int)24);
                    continue block27;
                }
                case -1091731025: {
                    v1 = dx$RollingText.fgkk("fgnd", fgkh(int ), (int)25);
                    continue block27;
                }
            }
            break;
        }
        var5_2 = dx$RollingText.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dx$RollingText.lz - dx$RollingText.fgkk("fgne", fgkh(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dx$RollingText.fgkk("fgnf", fgkm(int ), (int)42)) break;
            v2 /* !! */  = (long)dx$RollingText.fgkk("fgng", fgkm(int ), (int)43);
        }
        var4_3 /* !! */  = dx$RollingText.b;
        v3 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl29
        block29: while (true) {
            v3 /* !! */  = (long)(dx$RollingText.fgkk("fgni", fgkh(int ), (int)28) - dx$RollingText.fgkk("fgnh", fgkh(int ), (int)27));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1984952694: {
                    break block29;
                }
                case 1312014972: {
                    continue block29;
                }
            }
            break;
        }
        var3_4 = dx$RollingText.a;
        if (var5_2) {
            throw null;
lbl37:
            // 6 sources

            return (boolean)dx$RollingText.fgkk("fgnj", fgkm(int ), (int)44);
        }
        if (var3_4) ** GOTO lbl37
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = dx$RollingText.lz - dx$RollingText.fgkk("fgnk", fgkh(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dx$RollingText.fgkk("fgnl", fgkm(int ), (int)45)) break;
                    v4 /* !! */  = (long)dx$RollingText.fgkk("fgnm", fgkm(int ), (int)46);
                }
                if (this.previous == null) ** GOTO lbl79
                if (var3_4) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = dx$RollingText.lz - dx$RollingText.fgkk("fgnn", fgkh(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == dx$RollingText.fgkk("fgno", fgkm(int ), (int)47)) break;
                    v5 /* !! */  = (long)dx$RollingText.fgkk("fgnp", fgkm(int ), (int)48);
                }
                if (this.switchAt < dx$RollingText.fgkk("fgnq", fgkh(int ), (int)31)) ** GOTO lbl79
                if (var3_4) ** GOTO lbl37
                v6 /* !! */  = dx$RollingText.lz;
                if (true) ** GOTO lbl64
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - dx$RollingText.fgkk("fgnr", fgkh(int ), (int)32));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1984952694: {
                            break block33;
                        }
                        case -817413966: {
                            v7 = dx$RollingText.fgkk("fgns", fgkh(int ), (int)33);
                            continue block33;
                        }
                        case 646044201: {
                            v7 = dx$RollingText.fgkk("fgnt", fgkh(int ), (int)34);
                            continue block33;
                        }
                    }
                    break;
                }
                if (var1_1 - this.switchAt >= dx$RollingText.fgkk("fgnu", fgkh(int ), (int)35)) ** GOTO lbl79
                if (var3_4) ** GOTO lbl37
                v8 = dx$RollingText.fgkk("fgnv", fgkm(int ), (int)49);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl82
lbl79:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v8 = dx$RollingText.fgkk("fgnw", fgkm(int ), (int)50);
lbl82:
                // 2 sources

                return (boolean)v8;
            }
lbl83:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgnx", fgkm(int ), (int)51);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 1: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgny", fgkm(int ), (int)52);
                if (!var5_2) ** GOTO lbl83
                throw null;
            }
lbl92:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgnz", fgkm(int ), (int)53);
                if (var5_2) {
                    throw null;
                }
            }
lbl96:
            // 5 sources

            case 3: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgoa", fgkm(int ), (int)54);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgob", fgkm(int ), (int)55);
                    if (!var5_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgoc", fgkm(int ), (int)56);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgod", fgkm(int ), (int)57);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
lbl114:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgoe", fgkm(int ), (int)58);
                if (!var5_2) ** GOTO lbl92
                throw null;
            }
lbl118:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgof", fgkm(int ), (int)59);
                if (!var5_2) ** GOTO lbl114
                throw null;
            }
            case 9: 
        }
        var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgog", fgkm(int ), (int)60);
        ** while (!var5_2)
lbl125:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fgyq() {
        dx$RollingText.fgko[100] = 1189972928;
        dx$RollingText.fgko[101] = -928977079;
        dx$RollingText.fgko[102] = 1720005907;
        dx$RollingText.fgko[103] = -850254915;
        dx$RollingText.fgko[104] = -398487677;
        dx$RollingText.fgko[105] = -1366922551;
        dx$RollingText.fgko[106] = 441488192;
        dx$RollingText.fgko[107] = -667610877;
        dx$RollingText.fgko[108] = -1683154058;
        dx$RollingText.fgko[109] = -1852540212;
        dx$RollingText.fgko[110] = 1286480051;
    }

    static {
        fgkn = new int[111];
        fgko = new int[111];
        dx$RollingText.fgwb();
        dx$RollingText.fgxi();
        dx$RollingText.fgxp();
        dx$RollingText.fgyq();
        fgki = new long[86];
        fgkj = new long[86];
        dx$RollingText.fgzc();
        dx$RollingText.fhaf();
    }

    private static /* synthetic */ void fgzc() {
        dx$RollingText.fgki[0] = -6055696414567137905L;
        dx$RollingText.fgki[1] = 534363764604344216L;
        dx$RollingText.fgki[2] = 1087443553938953325L;
        dx$RollingText.fgki[3] = -8402980742925312363L;
        dx$RollingText.fgki[4] = 2834126011605181473L;
        dx$RollingText.fgki[5] = -555813210986760024L;
        dx$RollingText.fgki[6] = -6204044118860752500L;
        dx$RollingText.fgki[7] = 3440491809350723013L;
        dx$RollingText.fgki[8] = 896785050731559778L;
        dx$RollingText.fgki[9] = 1731387530986920265L;
        dx$RollingText.fgki[10] = 609563390800862549L;
        dx$RollingText.fgki[11] = 1823651538858627271L;
        dx$RollingText.fgki[12] = -2925412581607951763L;
        dx$RollingText.fgki[13] = -453943596127408561L;
        dx$RollingText.fgki[14] = 5479341915917435165L;
        dx$RollingText.fgki[15] = 3736526208795919965L;
        dx$RollingText.fgki[16] = 5856646397575555473L;
        dx$RollingText.fgki[17] = 2387427971352248001L;
        dx$RollingText.fgki[18] = 8449734484275322807L;
        dx$RollingText.fgki[19] = 5556717402696515819L;
        dx$RollingText.fgki[20] = -5631928212498357738L;
        dx$RollingText.fgki[21] = -8248152047574012684L;
        dx$RollingText.fgki[22] = 7576957666995024657L;
        dx$RollingText.fgki[23] = 8730176183541580977L;
        dx$RollingText.fgki[24] = 7583529296603678689L;
        dx$RollingText.fgki[25] = 1818975523091405680L;
        dx$RollingText.fgki[26] = 8473269427900931488L;
        dx$RollingText.fgki[27] = -8471884231605544533L;
        dx$RollingText.fgki[28] = -7156337321495271448L;
        dx$RollingText.fgki[29] = -2736786091818774713L;
        dx$RollingText.fgki[30] = 1125225823103344958L;
        dx$RollingText.fgki[31] = 4847496497377893693L;
        dx$RollingText.fgki[32] = 3216946778076445991L;
        dx$RollingText.fgki[33] = 1408684521427441881L;
        dx$RollingText.fgki[34] = -7789074515216529883L;
        dx$RollingText.fgki[35] = 8593290738606634995L;
        dx$RollingText.fgki[36] = -4110004532010943990L;
        dx$RollingText.fgki[37] = 1623179226798382056L;
        dx$RollingText.fgki[38] = -7934003709279055250L;
        dx$RollingText.fgki[39] = 9118807889250706293L;
        dx$RollingText.fgki[40] = -3163844682168351380L;
        dx$RollingText.fgki[41] = 5051882713419583905L;
        dx$RollingText.fgki[42] = -2337224039560315948L;
        dx$RollingText.fgki[43] = -6708378665308663162L;
        dx$RollingText.fgki[44] = -1154226853853212514L;
        dx$RollingText.fgki[45] = -4015928090362389763L;
        dx$RollingText.fgki[46] = -8421160756421464273L;
        dx$RollingText.fgki[47] = 2001262333605011952L;
        dx$RollingText.fgki[48] = -3230084365534883942L;
        dx$RollingText.fgki[49] = 8044476342541890014L;
        dx$RollingText.fgki[50] = 8250262067886804562L;
        dx$RollingText.fgki[51] = 1762225965679003309L;
        dx$RollingText.fgki[52] = 7674730599602279721L;
        dx$RollingText.fgki[53] = 2191116267822363780L;
        dx$RollingText.fgki[54] = 2953475271782009356L;
        dx$RollingText.fgki[55] = 7984953219286255317L;
        dx$RollingText.fgki[56] = 6026178891848987658L;
        dx$RollingText.fgki[57] = -1320820158570940162L;
        dx$RollingText.fgki[58] = 4741574030700703688L;
        dx$RollingText.fgki[59] = 6943654474801844652L;
        dx$RollingText.fgki[60] = 8197525501827454098L;
        dx$RollingText.fgki[61] = -7396805118926419826L;
        dx$RollingText.fgki[62] = 5513118791992147858L;
        dx$RollingText.fgki[63] = 2255995107030246882L;
        dx$RollingText.fgki[64] = -6577732655006741869L;
        dx$RollingText.fgki[65] = -6330251769496636987L;
        dx$RollingText.fgki[66] = -6389043076048897642L;
        dx$RollingText.fgki[67] = -5582620182999193989L;
        dx$RollingText.fgki[68] = 5449585208937955577L;
        dx$RollingText.fgki[69] = -507401119582553923L;
        dx$RollingText.fgki[70] = 5707793039263548170L;
        dx$RollingText.fgki[71] = 328754425526486863L;
        dx$RollingText.fgki[72] = -2249526281327767716L;
        dx$RollingText.fgki[73] = 2425686720532667445L;
        dx$RollingText.fgki[74] = -5516880462678936416L;
        dx$RollingText.fgki[75] = -1843921605713408949L;
        dx$RollingText.fgki[76] = 860785267894622788L;
        dx$RollingText.fgki[77] = 8323694540171180844L;
        dx$RollingText.fgki[78] = 9162749067330378094L;
        dx$RollingText.fgki[79] = 136163952944067915L;
        dx$RollingText.fgki[80] = -3929323675720674529L;
        dx$RollingText.fgki[81] = 6023001070177097908L;
        dx$RollingText.fgki[82] = -8095513406319620719L;
        dx$RollingText.fgki[83] = 853444436177453734L;
        dx$RollingText.fgki[84] = 1383549712006841917L;
        dx$RollingText.fgki[85] = -3016386428902293384L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private dx$RollingText() {
        int n2 = b;
        this.switchAt = (long)dx$RollingText.fgkk("fgkl", fgkh(int ), (int)0);
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                CallSite callSite = dx$RollingText.fgkk("fgkp", fgkm(int ), (int)0);
            }
            case 1: {
                while (true) {
                    CallSite callSite = dx$RollingText.fgkk("fgkq", fgkm(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = dx$RollingText.fgkk("fgkr", fgkm(int ), (int)2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void update(String var1_1, long var2_2) {
        block82: {
            block81: {
                block80: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = dx$RollingText.lz - dx$RollingText.fgkk("fgks", fgkh(int ), (int)1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == dx$RollingText.fgkk("fgkt", fgkm(int ), (int)3)) break;
                        v0 /* !! */  = (long)dx$RollingText.fgkk("fgku", fgkm(int ), (int)4);
                    }
                    var6_3 = dx$RollingText.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = dx$RollingText.lz - dx$RollingText.fgkk("fgkv", fgkh(int ), (int)2)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == dx$RollingText.fgkk("fgkw", fgkm(int ), (int)5)) break;
                        v1 /* !! */  = (long)dx$RollingText.fgkk("fgkx", fgkm(int ), (int)6);
                    }
                    var5_4 /* !! */  = dx$RollingText.b;
                    v2 /* !! */  = dx$RollingText.lz;
                    if (true) ** GOTO lbl17
                    block48: while (true) {
                        v2 /* !! */  = (long)(v3 - dx$RollingText.fgkk("fgky", fgkh(int ), (int)3));
lbl17:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1984952694: {
                                break block48;
                            }
                            case -790621156: {
                                v3 = dx$RollingText.fgkk("fgkz", fgkh(int ), (int)4);
                                continue block48;
                            }
                            case -761817126: {
                                v3 = dx$RollingText.fgkk("fgla", fgkh(int ), (int)5);
                                continue block48;
                            }
                            case 2015479473: {
                                v3 = dx$RollingText.fgkk("fglb", fgkh(int ), (int)6);
                                continue block48;
                            }
                        }
                        break;
                    }
                    var4_5 = dx$RollingText.a;
                    if (var6_3) {
                        throw null;
lbl32:
                        // 12 sources

                        return;
                    }
                    if (var4_5 || var4_5) ** GOTO lbl32
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = dx$RollingText.lz - dx$RollingText.fgkk("fglc", fgkh(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == dx$RollingText.fgkk("fgld", fgkm(int ), (int)7)) break;
                        v4 /* !! */  = (long)dx$RollingText.fgkk("fgle", fgkm(int ), (int)8);
                    }
                    if (this.current != null) break block80;
                    if (var4_5 || var4_5) ** GOTO lbl32
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = dx$RollingText.lz - dx$RollingText.fgkk("fglf", fgkh(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == dx$RollingText.fgkk("fglg", fgkm(int ), (int)9)) break;
                        v5 /* !! */  = (long)dx$RollingText.fgkk("fglh", fgkm(int ), (int)10);
                    }
                    this.current = var1_1;
                    if (var4_5 || var4_5) ** GOTO lbl32
                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl32
                v6 /* !! */  = dx$RollingText.lz;
                if (true) ** GOTO lbl56
                block52: while (true) {
                    v6 /* !! */  = (long)(v7 - dx$RollingText.fgkk("fgli", fgkh(int ), (int)9));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1984952694: {
                            break block52;
                        }
                        case 577531268: {
                            v7 = dx$RollingText.fgkk("fglj", fgkh(int ), (int)10);
                            continue block52;
                        }
                        case 671188322: {
                            v7 = dx$RollingText.fgkk("fglk", fgkh(int ), (int)11);
                            continue block52;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = dx$RollingText.lz - dx$RollingText.fgkk("fgll", fgkh(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dx$RollingText.fgkk("fglm", fgkm(int ), (int)11)) break;
                    v8 /* !! */  = (long)dx$RollingText.fgkk("fgln", fgkm(int ), (int)12);
                }
                if (this.current.equals(var1_1)) break block81;
                if (var4_5) ** GOTO lbl32
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = dx$RollingText.lz - dx$RollingText.fgkk("fglo", fgkh(int ), (int)13)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dx$RollingText.fgkk("fglp", fgkm(int ), (int)13)) break;
                    v9 /* !! */  = (long)dx$RollingText.fgkk("fglq", fgkm(int ), (int)14);
                }
                if (!this.animating(var2_2)) break block82;
                if (var4_5) ** GOTO lbl32
            }
            if (var4_5 || var4_5) ** GOTO lbl32
            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl32
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = dx$RollingText.lz - dx$RollingText.fgkk("fglr", fgkh(int ), (int)14)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == dx$RollingText.fgkk("fgls", fgkm(int ), (int)15)) break;
            v10 /* !! */  = (long)dx$RollingText.fgkk("fglt", fgkm(int ), (int)16);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_7 = dx$RollingText.lz - dx$RollingText.fgkk("fglu", fgkh(int ), (int)15)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == dx$RollingText.fgkk("fglv", fgkm(int ), (int)17)) break;
            v11 /* !! */  = (long)dx$RollingText.fgkk("fglw", fgkm(int ), (int)18);
        }
        this.previous = this.current;
        if (var4_5 || var4_5) ** GOTO lbl32
        v12 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl100
        block57: while (true) {
            v12 /* !! */  = (long)(v13 - dx$RollingText.fgkk("fglx", fgkh(int ), (int)16));
lbl100:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -2097170279: {
                    v13 = dx$RollingText.fgkk("fgly", fgkh(int ), (int)17);
                    continue block57;
                }
                case -1984952694: {
                    break block57;
                }
                case -1672963694: {
                    v13 = dx$RollingText.fgkk("fglz", fgkh(int ), (int)18);
                    continue block57;
                }
                case 1922559141: {
                    v13 = dx$RollingText.fgkk("fgma", fgkh(int ), (int)19);
                    continue block57;
                }
            }
            break;
        }
        this.current = var1_1;
        if (var4_5) ** GOTO lbl32
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl32
                v14 /* !! */  = dx$RollingText.lz;
                if (true) ** GOTO lbl122
                block58: while (true) {
                    v14 /* !! */  = (long)(dx$RollingText.fgkk("fgmc", fgkh(int ), (int)21) - dx$RollingText.fgkk("fgmb", fgkh(int ), (int)20));
lbl122:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1984952694: {
                            break block58;
                        }
                        case 695295429: {
                            continue block58;
                        }
                    }
                    break;
                }
                this.switchAt = var2_2;
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmd", fgkm(int ), (int)19);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 1: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgme", fgkm(int ), (int)20);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl141:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmf", fgkm(int ), (int)21);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 3: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmg", fgkm(int ), (int)22);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 4: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmh", fgkm(int ), (int)23);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 5: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmi", fgkm(int ), (int)24);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 6: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmj", fgkm(int ), (int)25);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl166:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmk", fgkm(int ), (int)26);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 8: {
                do {
                    var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgml", fgkm(int ), (int)27);
                } while (!var6_3);
                throw null;
            }
            case 9: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmm", fgkm(int ), (int)28);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 10: {
                do {
                    var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmn", fgkm(int ), (int)29);
                } while (!var6_3);
                throw null;
            }
lbl186:
            // 4 sources

            case 11: {
                do {
                    var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmo", fgkm(int ), (int)30);
                } while (!var6_3);
                throw null;
            }
lbl191:
            // 3 sources

            case 12: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmp", fgkm(int ), (int)31);
                if (!var6_3) break;
                throw null;
            }
lbl195:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmq", fgkm(int ), (int)32);
                if (!var6_3) ** GOTO lbl166
                throw null;
            }
lbl199:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmr", fgkm(int ), (int)33);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl204:
            // 3 sources

            case 15: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgms", fgkm(int ), (int)34);
                if (!var6_3) ** GOTO lbl195
                throw null;
            }
            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmt", fgkm(int ), (int)35);
                    if (!var6_3) ** GOTO lbl141
                    throw null;
                }
            }
            case 17: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmu", fgkm(int ), (int)36);
                if (!var6_3) ** GOTO lbl191
                throw null;
            }
            case 18: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmv", fgkm(int ), (int)37);
                if (!var6_3) ** GOTO lbl191
                throw null;
            }
lbl221:
            // 5 sources

            case 19: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmw", fgkm(int ), (int)38);
                if (!var6_3) ** GOTO lbl141
                throw null;
            }
lbl225:
            // 2 sources

            case 20: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmx", fgkm(int ), (int)39);
                if (var6_3) {
                    throw null;
                }
            }
            case 21: {
                var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmy", fgkm(int ), (int)40);
                if (!var6_3) ** GOTO lbl186
                throw null;
            }
            case 22: 
        }
        var5_4 /* !! */  = (int)dx$RollingText.fgkk("fgmz", fgkm(int ), (int)41);
        ** while (!var6_3)
lbl236:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void finishIfNeeded(long var1_1) {
        v0 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - dx$RollingText.fgkk("fgoh", fgkh(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1984952694: {
                    break block38;
                }
                case 470757120: {
                    v1 = dx$RollingText.fgkk("fgoi", fgkh(int ), (int)37);
                    continue block38;
                }
                case 2001198186: {
                    v1 = dx$RollingText.fgkk("fgoj", fgkh(int ), (int)38);
                    continue block38;
                }
            }
            break;
        }
        var5_2 = dx$RollingText.c;
        v2 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl19
        block39: while (true) {
            v2 /* !! */  = (long)(v3 - dx$RollingText.fgkk("fgok", fgkh(int ), (int)39));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1984952694: {
                    break block39;
                }
                case -1321590496: {
                    v3 = dx$RollingText.fgkk("fgol", fgkh(int ), (int)40);
                    continue block39;
                }
                case 2101482890: {
                    v3 = dx$RollingText.fgkk("fgom", fgkh(int ), (int)41);
                    continue block39;
                }
            }
            break;
        }
        var4_3 /* !! */  = dx$RollingText.b;
        v4 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl33
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - dx$RollingText.fgkk("fgon", fgkh(int ), (int)42));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1984952694: {
                    break block40;
                }
                case -437272170: {
                    v5 = dx$RollingText.fgkk("fgoo", fgkh(int ), (int)43);
                    continue block40;
                }
                case -330095665: {
                    v5 = dx$RollingText.fgkk("fgop", fgkh(int ), (int)44);
                    continue block40;
                }
                case 1152769538: {
                    v5 = dx$RollingText.fgkk("fgoq", fgkh(int ), (int)45);
                    continue block40;
                }
            }
            break;
        }
        var3_4 = dx$RollingText.a;
        if (var5_2) {
            throw null;
lbl48:
            // 7 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl48
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = dx$RollingText.lz - dx$RollingText.fgkk("fgor", fgkh(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == dx$RollingText.fgkk("fgos", fgkm(int ), (int)61)) break;
            v6 /* !! */  = (long)dx$RollingText.fgkk("fgot", fgkm(int ), (int)62);
        }
        if (this.previous == null) ** GOTO lbl92
        if (var3_4) ** GOTO lbl48
        v7 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl62
        block43: while (true) {
            v7 /* !! */  = (long)(dx$RollingText.fgkk("fgov", fgkh(int ), (int)48) - dx$RollingText.fgkk("fgou", fgkh(int ), (int)47));
lbl62:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1984952694: {
                    break block43;
                }
                case 1972623061: {
                    continue block43;
                }
            }
            break;
        }
        if (var1_1 - this.switchAt < dx$RollingText.fgkk("fgow", fgkh(int ), (int)49)) ** GOTO lbl92
        if (var3_4 || var3_4) ** GOTO lbl48
        v8 /* !! */  = dx$RollingText.lz;
        if (true) ** GOTO lbl73
        block44: while (true) {
            v8 /* !! */  = (long)(dx$RollingText.fgkk("fgoz", fgkh(int ), (int)51) - dx$RollingText.fgkk("fgoy", fgkh(int ), (int)50));
lbl73:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1984952694: {
                    break block44;
                }
                case -1741433379: {
                    continue block44;
                }
            }
            break;
        }
        this.previous = null;
        if (var3_4) ** GOTO lbl48
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl48
                v9 = dx$RollingText.fgkk("fgpa", fgkh(int ), (int)52);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = dx$RollingText.lz - dx$RollingText.fgkk("fgpb", fgkh(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dx$RollingText.fgkk("fgpc", fgkm(int ), (int)63)) break;
                    v10 /* !! */  = (long)dx$RollingText.fgkk("fgpd", fgkm(int ), (int)64);
                }
                this.switchAt = (long)v9;
                if (var3_4) ** GOTO lbl48
lbl92:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpe", fgkm(int ), (int)65);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 1: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpm", fgkm(int ), (int)66);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl105:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpn", fgkm(int ), (int)67);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl143
                    break;
                }
            }
lbl111:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpp", fgkm(int ), (int)68);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 4: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpq", fgkm(int ), (int)69);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 5: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpr", fgkm(int ), (int)70);
                if (!var5_2) ** GOTO lbl105
                throw null;
            }
lbl125:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpv", fgkm(int ), (int)71);
                if (!var5_2) ** GOTO lbl105
                throw null;
            }
            case 7: {
                do {
                    var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgpy", fgkm(int ), (int)72);
                } while (!var5_2);
                throw null;
            }
lbl134:
            // 2 sources

            case 8: {
                do {
                    var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgqa", fgkm(int ), (int)73);
                } while (!var5_2);
                throw null;
            }
lbl139:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgqd", fgkm(int ), (int)74);
                if (!var5_2) ** GOTO lbl111
                throw null;
            }
lbl143:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgqf", fgkm(int ), (int)75);
                if (!var5_2) ** GOTO lbl134
                throw null;
            }
            case 11: 
        }
        var4_3 /* !! */  = (int)dx$RollingText.fgkk("fgqh", fgkm(int ), (int)76);
        ** while (!var5_2)
lbl150:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fgxi() {
        dx$RollingText.fgkn[100] = 1189972928;
        dx$RollingText.fgkn[101] = -928977074;
        dx$RollingText.fgkn[102] = 1720005905;
        dx$RollingText.fgkn[103] = -850254915;
        dx$RollingText.fgkn[104] = -398487679;
        dx$RollingText.fgkn[105] = -1366922545;
        dx$RollingText.fgkn[106] = 441488194;
        dx$RollingText.fgkn[107] = -667610879;
        dx$RollingText.fgkn[108] = -1683154058;
        dx$RollingText.fgkn[109] = -1852540212;
        dx$RollingText.fgkn[110] = 1286480051;
    }

    private static /* synthetic */ int fgkm(int n2) {
        return fgkn[n2] ^ fgko[n2];
    }
}

