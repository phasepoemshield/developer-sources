/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class eg$RollingText {
    private static long[] evqw;
    public static final boolean a;
    private static long[] evqv;
    private String current;
    protected static final long li = -6110379763847892991L;
    private static int[] evra;
    public static final int b;
    public static final boolean c;
    private String previous;
    private long switchAt;
    private static int[] evrb;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String previous() {
        block16: {
            block15: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = eg$RollingText.li - eg$RollingText.evqx("evun", evqu(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == eg$RollingText.evqx("evuo", evqz(int ), (int)57)) break;
                    v0 /* !! */  = (long)eg$RollingText.evqx("evup", evqz(int ), (int)58);
                }
                var3_1 = eg$RollingText.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = eg$RollingText.li - eg$RollingText.evqx("evuq", evqu(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == eg$RollingText.evqx("evur", evqz(int ), (int)59)) break;
                    v1 /* !! */  = (long)eg$RollingText.evqx("evus", evqz(int ), (int)60);
                }
                var2_2 = eg$RollingText.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = eg$RollingText.li - eg$RollingText.evqx("evut", evqu(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == eg$RollingText.evqx("evuu", evqz(int ), (int)61)) break;
                    v2 /* !! */  = (long)eg$RollingText.evqx("evuv", evqz(int ), (int)62);
                }
                var1_3 = eg$RollingText.a;
                if (var3_1) {
                    throw null;
lbl21:
                    // 3 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = eg$RollingText.li - eg$RollingText.evqx("evuw", evqu(int ), (int)36)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == eg$RollingText.evqx("evux", evqz(int ), (int)63)) break;
                    v3 /* !! */  = (long)eg$RollingText.evqx("evuy", evqz(int ), (int)64);
                }
                if (this.previous != null) break block15;
                if (var1_3) ** GOTO lbl21
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = eg$RollingText.li - eg$RollingText.evqx("evuz", evqu(int ), (int)37)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eg$RollingText.evqx("evva", evqz(int ), (int)65)) break;
                    v4 /* !! */  = (long)eg$RollingText.evqx("evvb", evqz(int ), (int)66);
                }
                v5 = this.value();
                if (var3_1) {
                    throw null;
                }
                break block16;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v6 /* !! */  = eg$RollingText.li;
            if (true) ** GOTO lbl47
            block12: while (true) {
                v6 /* !! */  = (long)(v7 - eg$RollingText.evqx("evvc", evqu(int ), (int)38));
lbl47:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1659080703: {
                        break block12;
                    }
                    case -193272963: {
                        v7 = eg$RollingText.evqx("evvd", evqu(int ), (int)39);
                        continue block12;
                    }
                    case -44044701: {
                        v7 = eg$RollingText.evqx("evve", evqu(int ), (int)40);
                        continue block12;
                    }
                    case 795981798: {
                        v7 = eg$RollingText.evqx("evvf", evqu(int ), (int)41);
                        continue block12;
                    }
                }
                break;
            }
            v5 = this.previous;
        }
        return v5;
    }

    private static /* synthetic */ void evzl() {
        eg$RollingText.evra[0] = -1204455847;
        eg$RollingText.evra[1] = -305083372;
        eg$RollingText.evra[2] = -1060877576;
        eg$RollingText.evra[3] = 2029448758;
        eg$RollingText.evra[4] = -1486990002;
        eg$RollingText.evra[5] = -673544824;
        eg$RollingText.evra[6] = 2081865437;
        eg$RollingText.evra[7] = -814191655;
        eg$RollingText.evra[8] = -979707397;
        eg$RollingText.evra[9] = 70434466;
        eg$RollingText.evra[10] = -2129836299;
        eg$RollingText.evra[11] = 889124109;
        eg$RollingText.evra[12] = 1265094519;
        eg$RollingText.evra[13] = -810200003;
        eg$RollingText.evra[14] = -1812274852;
        eg$RollingText.evra[15] = -629031158;
        eg$RollingText.evra[16] = 612753319;
        eg$RollingText.evra[17] = 1774732665;
        eg$RollingText.evra[18] = -105188351;
        eg$RollingText.evra[19] = 1086965281;
        eg$RollingText.evra[20] = 528704338;
        eg$RollingText.evra[21] = 1830703114;
        eg$RollingText.evra[22] = 259318955;
        eg$RollingText.evra[23] = -1737734518;
        eg$RollingText.evra[24] = 1066641484;
        eg$RollingText.evra[25] = -1419510395;
        eg$RollingText.evra[26] = -919612169;
        eg$RollingText.evra[27] = -339973777;
        eg$RollingText.evra[28] = -978327897;
        eg$RollingText.evra[29] = -1605284566;
        eg$RollingText.evra[30] = 1122993579;
        eg$RollingText.evra[31] = 1837654193;
        eg$RollingText.evra[32] = -1172957653;
        eg$RollingText.evra[33] = -1393692597;
        eg$RollingText.evra[34] = 1067626619;
        eg$RollingText.evra[35] = -2136521069;
        eg$RollingText.evra[36] = -1538050453;
        eg$RollingText.evra[37] = -1847923384;
        eg$RollingText.evra[38] = 636149974;
        eg$RollingText.evra[39] = 633310237;
        eg$RollingText.evra[40] = 523746027;
        eg$RollingText.evra[41] = -1954847224;
        eg$RollingText.evra[42] = -1559208973;
        eg$RollingText.evra[43] = 1419067765;
        eg$RollingText.evra[44] = -1057708243;
        eg$RollingText.evra[45] = -1559053201;
        eg$RollingText.evra[46] = 2139131082;
        eg$RollingText.evra[47] = 1376732286;
        eg$RollingText.evra[48] = 1911572782;
        eg$RollingText.evra[49] = -419561274;
        eg$RollingText.evra[50] = 809552510;
        eg$RollingText.evra[51] = -1679047376;
        eg$RollingText.evra[52] = 2016044916;
        eg$RollingText.evra[53] = -1803360889;
        eg$RollingText.evra[54] = -266853555;
        eg$RollingText.evra[55] = 1444389063;
        eg$RollingText.evra[56] = 975116017;
        eg$RollingText.evra[57] = -2004396608;
        eg$RollingText.evra[58] = 2047934184;
        eg$RollingText.evra[59] = -1681298450;
        eg$RollingText.evra[60] = 734081610;
        eg$RollingText.evra[61] = -1493315236;
        eg$RollingText.evra[62] = -21392152;
        eg$RollingText.evra[63] = -1830726753;
        eg$RollingText.evra[64] = -52200613;
        eg$RollingText.evra[65] = -364497215;
        eg$RollingText.evra[66] = 1926826927;
        eg$RollingText.evra[67] = -613482297;
        eg$RollingText.evra[68] = -246425757;
        eg$RollingText.evra[69] = 1160996012;
        eg$RollingText.evra[70] = -433841002;
        eg$RollingText.evra[71] = -304717360;
        eg$RollingText.evra[72] = -1605675914;
        eg$RollingText.evra[73] = -1701206533;
        eg$RollingText.evra[74] = -1283611902;
        eg$RollingText.evra[75] = -1512999122;
        eg$RollingText.evra[76] = -1318678750;
        eg$RollingText.evra[77] = -169059402;
        eg$RollingText.evra[78] = 2135994260;
        eg$RollingText.evra[79] = 1737629658;
        eg$RollingText.evra[80] = 277975353;
        eg$RollingText.evra[81] = 1777773255;
        eg$RollingText.evra[82] = -914982928;
        eg$RollingText.evra[83] = 1491625912;
        eg$RollingText.evra[84] = 139623700;
        eg$RollingText.evra[85] = 1289186643;
        eg$RollingText.evra[86] = 324819416;
        eg$RollingText.evra[87] = 1371594218;
        eg$RollingText.evra[88] = 1909378486;
        eg$RollingText.evra[89] = -982460799;
        eg$RollingText.evra[90] = -642794049;
        eg$RollingText.evra[91] = -1166890522;
        eg$RollingText.evra[92] = 291428318;
        eg$RollingText.evra[93] = -1990632168;
        eg$RollingText.evra[94] = -1697066734;
        eg$RollingText.evra[95] = -125648342;
        eg$RollingText.evra[96] = -1693691068;
        eg$RollingText.evra[97] = 1349020286;
        eg$RollingText.evra[98] = 228921732;
        eg$RollingText.evra[99] = 586974821;
    }

    private static /* synthetic */ void ewbh() {
        eg$RollingText.evrb[100] = -157134445;
        eg$RollingText.evrb[101] = -924357976;
        eg$RollingText.evrb[102] = -1689394353;
        eg$RollingText.evrb[103] = 727944475;
        eg$RollingText.evrb[104] = 1563161251;
        eg$RollingText.evrb[105] = -220554877;
        eg$RollingText.evrb[106] = -752768936;
        eg$RollingText.evrb[107] = 1564040340;
        eg$RollingText.evrb[108] = -1204363019;
        eg$RollingText.evrb[109] = -174002608;
        eg$RollingText.evrb[110] = -736935615;
        eg$RollingText.evrb[111] = -1077029966;
        eg$RollingText.evrb[112] = 2135373972;
        eg$RollingText.evrb[113] = -1913694803;
        eg$RollingText.evrb[114] = -1081261479;
        eg$RollingText.evrb[115] = -1741494598;
        eg$RollingText.evrb[116] = 2069630536;
        eg$RollingText.evrb[117] = 1031289912;
        eg$RollingText.evrb[118] = 426247700;
        eg$RollingText.evrb[119] = 1883234984;
        eg$RollingText.evrb[120] = 2006336239;
        eg$RollingText.evrb[121] = 1402960784;
        eg$RollingText.evrb[122] = 610678251;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private eg$RollingText() {
        var2_1 /* !! */  = eg$RollingText.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.switchAt = (long)eg$RollingText.evqx("evqy", evqu(int ), (int)0);
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)eg$RollingText.evqx("evrc", evqz(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)eg$RollingText.evqx("evrd", evqz(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)eg$RollingText.evqx("evre", evqz(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ int evqz(int n2) {
        return evra[n2] ^ evrb[n2];
    }

    private static /* synthetic */ void ewbv() {
        eg$RollingText.evqw[0] = 7412572359335458990L;
        eg$RollingText.evqw[1] = -161105633524824813L;
        eg$RollingText.evqw[2] = 9195859812083042029L;
        eg$RollingText.evqw[3] = 5442809407951187685L;
        eg$RollingText.evqw[4] = -5932143529900283618L;
        eg$RollingText.evqw[5] = -8156391806669658807L;
        eg$RollingText.evqw[6] = -7541140488080500798L;
        eg$RollingText.evqw[7] = -6237460509762227582L;
        eg$RollingText.evqw[8] = 6898286768866601407L;
        eg$RollingText.evqw[9] = 5254543764236450398L;
        eg$RollingText.evqw[10] = 4458068570707011897L;
        eg$RollingText.evqw[11] = -1776394928898538434L;
        eg$RollingText.evqw[12] = -169036799874357836L;
        eg$RollingText.evqw[13] = 243925223994816395L;
        eg$RollingText.evqw[14] = -5604380710935783323L;
        eg$RollingText.evqw[15] = -3706698334514610320L;
        eg$RollingText.evqw[16] = 150388536214953534L;
        eg$RollingText.evqw[17] = 9053588152923470135L;
        eg$RollingText.evqw[18] = -1055687397548846242L;
        eg$RollingText.evqw[19] = -8798898310636085455L;
        eg$RollingText.evqw[20] = -4933551029297944273L;
        eg$RollingText.evqw[21] = 833345510995177132L;
        eg$RollingText.evqw[22] = -6167256661214196252L;
        eg$RollingText.evqw[23] = 3547807718514269042L;
        eg$RollingText.evqw[24] = 3951127596692950852L;
        eg$RollingText.evqw[25] = -7257904837970092483L;
        eg$RollingText.evqw[26] = -6889655349632402561L;
        eg$RollingText.evqw[27] = -8538283895456092274L;
        eg$RollingText.evqw[28] = -457867564308837038L;
        eg$RollingText.evqw[29] = -3704285765195441654L;
        eg$RollingText.evqw[30] = 5393302262728530543L;
        eg$RollingText.evqw[31] = 6346780552886777200L;
        eg$RollingText.evqw[32] = -6021335588672582392L;
        eg$RollingText.evqw[33] = -988509905937903037L;
        eg$RollingText.evqw[34] = 5356435592491494272L;
        eg$RollingText.evqw[35] = 6058200652265685006L;
        eg$RollingText.evqw[36] = 5621383020809864329L;
        eg$RollingText.evqw[37] = -3866578074406686957L;
        eg$RollingText.evqw[38] = 6378530704564715660L;
        eg$RollingText.evqw[39] = 7940257992065155696L;
        eg$RollingText.evqw[40] = 459296192343371008L;
        eg$RollingText.evqw[41] = -4070369709356907631L;
        eg$RollingText.evqw[42] = 83090972760795409L;
        eg$RollingText.evqw[43] = -6479792625837452921L;
        eg$RollingText.evqw[44] = 671063662293792647L;
        eg$RollingText.evqw[45] = -5281595299792842660L;
        eg$RollingText.evqw[46] = -1689201925974533570L;
        eg$RollingText.evqw[47] = -3710539263569218112L;
        eg$RollingText.evqw[48] = -4812653700323723214L;
        eg$RollingText.evqw[49] = -4351268790576514112L;
        eg$RollingText.evqw[50] = -6447241587377113214L;
        eg$RollingText.evqw[51] = -1520257575317455039L;
        eg$RollingText.evqw[52] = -1466654210688284582L;
        eg$RollingText.evqw[53] = -7650592787645392948L;
        eg$RollingText.evqw[54] = -1880341958449136237L;
        eg$RollingText.evqw[55] = -6095077765405685960L;
        eg$RollingText.evqw[56] = -2983577908509920059L;
        eg$RollingText.evqw[57] = -6318248360344294666L;
        eg$RollingText.evqw[58] = -5938266155930406462L;
        eg$RollingText.evqw[59] = -5751157024842076385L;
        eg$RollingText.evqw[60] = -1367729065445491752L;
        eg$RollingText.evqw[61] = 7763118777565259433L;
        eg$RollingText.evqw[62] = 280654831759209228L;
        eg$RollingText.evqw[63] = 2683077546306945126L;
        eg$RollingText.evqw[64] = -7274855121610975436L;
        eg$RollingText.evqw[65] = 7579551377102400495L;
        eg$RollingText.evqw[66] = 3035258780008208400L;
        eg$RollingText.evqw[67] = 2580025219509943936L;
        eg$RollingText.evqw[68] = 6181030577087184552L;
        eg$RollingText.evqw[69] = 7374567431403553305L;
        eg$RollingText.evqw[70] = -2446021303012971275L;
        eg$RollingText.evqw[71] = 1629857797129388434L;
        eg$RollingText.evqw[72] = 7612467431616157600L;
        eg$RollingText.evqw[73] = -7778449946077580110L;
        eg$RollingText.evqw[74] = -7915075577274720023L;
        eg$RollingText.evqw[75] = -157821275384463979L;
        eg$RollingText.evqw[76] = 3891410172454829639L;
        eg$RollingText.evqw[77] = 4543478642688014918L;
        eg$RollingText.evqw[78] = 5390597094783487633L;
        eg$RollingText.evqw[79] = 5087551861266188808L;
        eg$RollingText.evqw[80] = 2702208463692741671L;
        eg$RollingText.evqw[81] = -2259457280962119575L;
        eg$RollingText.evqw[82] = 800795635645269188L;
        eg$RollingText.evqw[83] = 6168692680913919842L;
        eg$RollingText.evqw[84] = -7729251994903390204L;
    }

    private static /* synthetic */ long evqu(int n2) {
        return evqv[n2] ^ evqw[n2];
    }

    private static /* synthetic */ void ewao() {
        eg$RollingText.evrb[0] = -1204455845;
        eg$RollingText.evrb[1] = -305083370;
        eg$RollingText.evrb[2] = -1060877574;
        eg$RollingText.evrb[3] = -2029448759;
        eg$RollingText.evrb[4] = -1431572172;
        eg$RollingText.evrb[5] = 673544823;
        eg$RollingText.evrb[6] = 1517611722;
        eg$RollingText.evrb[7] = 814191654;
        eg$RollingText.evrb[8] = -980407267;
        eg$RollingText.evrb[9] = -70434467;
        eg$RollingText.evrb[10] = 1511367883;
        eg$RollingText.evrb[11] = -889124110;
        eg$RollingText.evrb[12] = -1165135998;
        eg$RollingText.evrb[13] = 810200002;
        eg$RollingText.evrb[14] = -721658378;
        eg$RollingText.evrb[15] = 629031157;
        eg$RollingText.evrb[16] = -1712808496;
        eg$RollingText.evrb[17] = -1774732666;
        eg$RollingText.evrb[18] = -1563477787;
        eg$RollingText.evrb[19] = 1086965303;
        eg$RollingText.evrb[20] = 528704339;
        eg$RollingText.evrb[21] = 1830703106;
        eg$RollingText.evrb[22] = 259318954;
        eg$RollingText.evrb[23] = -1737734516;
        eg$RollingText.evrb[24] = 1066641475;
        eg$RollingText.evrb[25] = -1419510385;
        eg$RollingText.evrb[26] = -919612185;
        eg$RollingText.evrb[27] = -339973762;
        eg$RollingText.evrb[28] = -978327898;
        eg$RollingText.evrb[29] = -1605284561;
        eg$RollingText.evrb[30] = 1122993579;
        eg$RollingText.evrb[31] = 1837654177;
        eg$RollingText.evrb[32] = -1172957659;
        eg$RollingText.evrb[33] = -1393692602;
        eg$RollingText.evrb[34] = 1067626623;
        eg$RollingText.evrb[35] = -2136521082;
        eg$RollingText.evrb[36] = -1538050440;
        eg$RollingText.evrb[37] = -1847923367;
        eg$RollingText.evrb[38] = 636149982;
        eg$RollingText.evrb[39] = 633310236;
        eg$RollingText.evrb[40] = 523746040;
        eg$RollingText.evrb[41] = -1954847208;
        eg$RollingText.evrb[42] = -1559208988;
        eg$RollingText.evrb[43] = 1419067764;
        eg$RollingText.evrb[44] = -460016484;
        eg$RollingText.evrb[45] = 1559053200;
        eg$RollingText.evrb[46] = -2089002616;
        eg$RollingText.evrb[47] = -1376732287;
        eg$RollingText.evrb[48] = -1900266816;
        eg$RollingText.evrb[49] = -419561279;
        eg$RollingText.evrb[50] = 809552507;
        eg$RollingText.evrb[51] = -1679047370;
        eg$RollingText.evrb[52] = 2016044918;
        eg$RollingText.evrb[53] = -1803360895;
        eg$RollingText.evrb[54] = -266853553;
        eg$RollingText.evrb[55] = 1444389059;
        eg$RollingText.evrb[56] = 975116018;
        eg$RollingText.evrb[57] = 2004396607;
        eg$RollingText.evrb[58] = -1327625052;
        eg$RollingText.evrb[59] = -1681298449;
        eg$RollingText.evrb[60] = 640264572;
        eg$RollingText.evrb[61] = 1493315235;
        eg$RollingText.evrb[62] = 803552889;
        eg$RollingText.evrb[63] = 1830726752;
        eg$RollingText.evrb[64] = -1292798848;
        eg$RollingText.evrb[65] = 364497214;
        eg$RollingText.evrb[66] = 1120329070;
        eg$RollingText.evrb[67] = -613482299;
        eg$RollingText.evrb[68] = -246425759;
        eg$RollingText.evrb[69] = 1160996012;
        eg$RollingText.evrb[70] = -433841004;
        eg$RollingText.evrb[71] = -304717358;
        eg$RollingText.evrb[72] = -1605675915;
        eg$RollingText.evrb[73] = -1701206529;
        eg$RollingText.evrb[74] = -1283611901;
        eg$RollingText.evrb[75] = 1512999121;
        eg$RollingText.evrb[76] = -1053232006;
        eg$RollingText.evrb[77] = 169059401;
        eg$RollingText.evrb[78] = 811977658;
        eg$RollingText.evrb[79] = -1737629659;
        eg$RollingText.evrb[80] = 1572373812;
        eg$RollingText.evrb[81] = 1777773253;
        eg$RollingText.evrb[82] = -914982928;
        eg$RollingText.evrb[83] = 1491625913;
        eg$RollingText.evrb[84] = 139623703;
        eg$RollingText.evrb[85] = -1289186644;
        eg$RollingText.evrb[86] = 1221349184;
        eg$RollingText.evrb[87] = -1371594219;
        eg$RollingText.evrb[88] = 1576729623;
        eg$RollingText.evrb[89] = -982460799;
        eg$RollingText.evrb[90] = 642794048;
        eg$RollingText.evrb[91] = 1866824190;
        eg$RollingText.evrb[92] = 291428319;
        eg$RollingText.evrb[93] = -1990632168;
        eg$RollingText.evrb[94] = -1697066734;
        eg$RollingText.evrb[95] = -125648344;
        eg$RollingText.evrb[96] = -1693691065;
        eg$RollingText.evrb[97] = 1349020280;
        eg$RollingText.evrb[98] = 228921731;
        eg$RollingText.evrb[99] = 586974821;
    }

    private static /* synthetic */ void ewak() {
        eg$RollingText.evra[100] = -157134438;
        eg$RollingText.evra[101] = -924357976;
        eg$RollingText.evra[102] = -1689394357;
        eg$RollingText.evra[103] = 727944472;
        eg$RollingText.evra[104] = -1563161252;
        eg$RollingText.evra[105] = -1836985056;
        eg$RollingText.evra[106] = 752768935;
        eg$RollingText.evra[107] = -115126441;
        eg$RollingText.evra[108] = -1204363020;
        eg$RollingText.evra[109] = -1999536880;
        eg$RollingText.evra[110] = -736935611;
        eg$RollingText.evra[111] = -1077029965;
        eg$RollingText.evra[112] = 2135373970;
        eg$RollingText.evra[113] = -1913694802;
        eg$RollingText.evra[114] = -1081261476;
        eg$RollingText.evra[115] = -1741494600;
        eg$RollingText.evra[116] = 2069630529;
        eg$RollingText.evra[117] = 1031289913;
        eg$RollingText.evra[118] = 426247708;
        eg$RollingText.evra[119] = 1883234985;
        eg$RollingText.evra[120] = 2006336231;
        eg$RollingText.evra[121] = 1402960792;
        eg$RollingText.evra[122] = 610678252;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void update(String var1_1, long var2_2) {
        block81: {
            block80: {
                v0 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl5
                block48: while (true) {
                    v0 /* !! */  = (long)(v1 - eg$RollingText.evqx("evrf", evqu(int ), (int)1));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1659080703: {
                            break block48;
                        }
                        case -610667021: {
                            v1 = eg$RollingText.evqx("evrg", evqu(int ), (int)2);
                            continue block48;
                        }
                        case 669098328: {
                            v1 = eg$RollingText.evqx("evrh", evqu(int ), (int)3);
                            continue block48;
                        }
                        case 1547935276: {
                            v1 = eg$RollingText.evqx("evri", evqu(int ), (int)4);
                            continue block48;
                        }
                    }
                    break;
                }
                var6_3 = eg$RollingText.c;
                v2 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl22
                block49: while (true) {
                    v2 /* !! */  = (long)(v3 - eg$RollingText.evqx("evrj", evqu(int ), (int)5));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2132747776: {
                            v3 = eg$RollingText.evqx("evrk", evqu(int ), (int)6);
                            continue block49;
                        }
                        case -1659080703: {
                            break block49;
                        }
                        case 689600524: {
                            v3 = eg$RollingText.evqx("evrl", evqu(int ), (int)7);
                            continue block49;
                        }
                    }
                    break;
                }
                var5_4 /* !! */  = eg$RollingText.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = eg$RollingText.li - eg$RollingText.evqx("evrm", evqu(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eg$RollingText.evqx("evrn", evqz(int ), (int)3)) break;
                    v4 /* !! */  = (long)eg$RollingText.evqx("evro", evqz(int ), (int)4);
                }
                var4_5 = eg$RollingText.a;
                if (var6_3) {
                    throw null;
lbl40:
                    // 11 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl40
                v5 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl47
                block52: while (true) {
                    v5 /* !! */  = (long)(v6 - eg$RollingText.evqx("evrp", evqu(int ), (int)9));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1659080703: {
                            break block52;
                        }
                        case -1302247801: {
                            v6 = eg$RollingText.evqx("evrq", evqu(int ), (int)10);
                            continue block52;
                        }
                        case -592354298: {
                            v6 = eg$RollingText.evqx("evrr", evqu(int ), (int)11);
                            continue block52;
                        }
                        case -141345322: {
                            v6 = eg$RollingText.evqx("evrs", evqu(int ), (int)12);
                            continue block52;
                        }
                    }
                    break;
                }
                if (this.current != null) break block80;
                if (var4_5 || var4_5) ** GOTO lbl40
                v7 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl65
                block53: while (true) {
                    v7 /* !! */  = (long)(v8 - eg$RollingText.evqx("evrt", evqu(int ), (int)13));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1659080703: {
                            break block53;
                        }
                        case -388667762: {
                            v8 = eg$RollingText.evqx("evru", evqu(int ), (int)14);
                            continue block53;
                        }
                        case 720728263: {
                            v8 = eg$RollingText.evqx("evrv", evqu(int ), (int)15);
                            continue block53;
                        }
                    }
                    break;
                }
                this.current = var1_1;
                if (var4_5 || var4_5) ** GOTO lbl40
                return;
            }
            if (var4_5 || var4_5) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = eg$RollingText.li - eg$RollingText.evqx("evrw", evqu(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == eg$RollingText.evqx("evrx", evqz(int ), (int)5)) break;
                v9 /* !! */  = (long)eg$RollingText.evqx("evry", evqz(int ), (int)6);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = eg$RollingText.li - eg$RollingText.evqx("evrz", evqu(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == eg$RollingText.evqx("evsa", evqz(int ), (int)7)) break;
                v10 /* !! */  = (long)eg$RollingText.evqx("evsb", evqz(int ), (int)8);
            }
            if (!this.current.equals(var1_1)) break block81;
            if (var4_5) ** GOTO lbl40
            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl40
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = eg$RollingText.li - eg$RollingText.evqx("evsc", evqu(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == eg$RollingText.evqx("evsd", evqz(int ), (int)9)) break;
            v11 /* !! */  = (long)eg$RollingText.evqx("evse", evqz(int ), (int)10);
        }
        if (!this.animating(var2_2)) ** GOTO lbl105
        if (var4_5) ** GOTO lbl40
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl105:
            // 1 sources

            if (var4_5 || var4_5) ** GOTO lbl40
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = eg$RollingText.li - eg$RollingText.evqx("evsf", evqu(int ), (int)19)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == eg$RollingText.evqx("evsg", evqz(int ), (int)11)) break;
                v12 /* !! */  = (long)eg$RollingText.evqx("evsh", evqz(int ), (int)12);
            }
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_5 = eg$RollingText.li - eg$RollingText.evqx("evsi", evqu(int ), (int)20)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == eg$RollingText.evqx("evsj", evqz(int ), (int)13)) break;
                v13 /* !! */  = (long)eg$RollingText.evqx("evsk", evqz(int ), (int)14);
            }
            this.previous = this.current;
            if (var4_5 || var4_5) ** GOTO lbl40
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = eg$RollingText.li - eg$RollingText.evqx("evsl", evqu(int ), (int)21)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == eg$RollingText.evqx("evsm", evqz(int ), (int)15)) break;
                v14 /* !! */  = (long)eg$RollingText.evqx("evsn", evqz(int ), (int)16);
            }
            this.current = var1_1;
            if (var4_5 || var4_5) ** GOTO lbl40
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_7 = eg$RollingText.li - eg$RollingText.evqx("evso", evqu(int ), (int)22)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == eg$RollingText.evqx("evsp", evqz(int ), (int)17)) break;
                v15 /* !! */  = (long)eg$RollingText.evqx("evsq", evqz(int ), (int)18);
            }
            this.switchAt = var2_2;
            if (!var4_5 && !var4_5) ** break;
            ** continue;
            return;
lbl134:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsr", evqz(int ), (int)19);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl139:
            // 3 sources

            case 1: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evss", evqz(int ), (int)20);
                if (!var6_3) break;
                throw null;
            }
lbl143:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evst", evqz(int ), (int)21);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 3: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsu", evqz(int ), (int)22);
                if (!var6_3) ** GOTO lbl134
                throw null;
            }
lbl152:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsv", evqz(int ), (int)23);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 5: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsw", evqz(int ), (int)24);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 6: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsx", evqz(int ), (int)25);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 7: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsy", evqz(int ), (int)26);
                if (!var6_3) ** GOTO lbl143
                throw null;
            }
lbl171:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evsz", evqz(int ), (int)27);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 9: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evta", evqz(int ), (int)28);
                if (!var6_3) ** GOTO lbl139
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtb", evqz(int ), (int)29);
                if (!var6_3) ** GOTO lbl152
                throw null;
            }
            case 11: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtc", evqz(int ), (int)30);
                if (var6_3) {
                    throw null;
                }
            }
            case 12: {
                do {
                    var5_4 /* !! */  = (int)eg$RollingText.evqx("evtd", evqz(int ), (int)31);
                } while (!var6_3);
                throw null;
            }
lbl193:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evte", evqz(int ), (int)32);
                if (!var6_3) ** GOTO lbl171
                throw null;
            }
lbl197:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtf", evqz(int ), (int)33);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)eg$RollingText.evqx("evtg", evqz(int ), (int)34);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl229
                    break;
                }
            }
lbl208:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evth", evqz(int ), (int)35);
                if (!var6_3) break;
                throw null;
            }
            case 17: {
                do {
                    var5_4 /* !! */  = (int)eg$RollingText.evqx("evti", evqz(int ), (int)36);
                } while (!var6_3);
                throw null;
            }
lbl217:
            // 3 sources

            case 18: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtj", evqz(int ), (int)37);
                if (!var6_3) break;
                throw null;
            }
            case 19: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtk", evqz(int ), (int)38);
                if (!var6_3) ** GOTO lbl139
                throw null;
            }
lbl225:
            // 3 sources

            case 20: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtl", evqz(int ), (int)39);
                if (!var6_3) ** GOTO lbl134
                throw null;
            }
lbl229:
            // 3 sources

            case 21: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtm", evqz(int ), (int)40);
                if (!var6_3) ** GOTO lbl217
                throw null;
            }
lbl233:
            // 2 sources

            case 22: {
                var5_4 /* !! */  = (int)eg$RollingText.evqx("evtn", evqz(int ), (int)41);
                if (!var6_3) ** GOTO lbl217
                throw null;
            }
            case 23: 
        }
        var5_4 /* !! */  = (int)eg$RollingText.evqx("evto", evqz(int ), (int)42);
        ** while (!var6_3)
lbl240:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void finishIfNeeded(long var1_1) {
        v0 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - eg$RollingText.evqx("evxm", evqu(int ), (int)63));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1659080703: {
                    break block41;
                }
                case 606990682: {
                    v1 = eg$RollingText.evqx("evxn", evqu(int ), (int)64);
                    continue block41;
                }
                case 1432824403: {
                    v1 = eg$RollingText.evqx("evxo", evqu(int ), (int)65);
                    continue block41;
                }
                case 1854188795: {
                    v1 = eg$RollingText.evqx("evxp", evqu(int ), (int)66);
                    continue block41;
                }
            }
            break;
        }
        var5_2 = eg$RollingText.c;
        v2 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl22
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - eg$RollingText.evqx("evxq", evqu(int ), (int)67));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1880949490: {
                    v3 = eg$RollingText.evqx("evxr", evqu(int ), (int)68);
                    continue block42;
                }
                case -1659080703: {
                    break block42;
                }
                case 111510404: {
                    v3 = eg$RollingText.evqx("evxs", evqu(int ), (int)69);
                    continue block42;
                }
            }
            break;
        }
        var4_3 /* !! */  = eg$RollingText.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = eg$RollingText.li - eg$RollingText.evqx("evxt", evqu(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == eg$RollingText.evqx("evxu", evqz(int ), (int)104)) break;
            v4 /* !! */  = (long)eg$RollingText.evqx("evxv", evqz(int ), (int)105);
        }
        var3_4 = eg$RollingText.a;
        if (var5_2) {
            throw null;
lbl41:
            // 7 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = eg$RollingText.li - eg$RollingText.evqx("evxw", evqu(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == eg$RollingText.evqx("evxx", evqz(int ), (int)106)) break;
            v5 /* !! */  = (long)eg$RollingText.evqx("evxy", evqz(int ), (int)107);
        }
        if (this.previous == null) ** GOTO lbl108
        if (var3_4) ** GOTO lbl41
        v6 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl56
        block46: while (true) {
            v6 /* !! */  = (long)(v7 - eg$RollingText.evqx("evxz", evqu(int ), (int)72));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1742653619: {
                    v7 = eg$RollingText.evqx("evya", evqu(int ), (int)73);
                    continue block46;
                }
                case -1659080703: {
                    break block46;
                }
                case -142570408: {
                    v7 = eg$RollingText.evqx("evyb", evqu(int ), (int)74);
                    continue block46;
                }
            }
            break;
        }
        if (this.switchAt < eg$RollingText.evqx("evyc", evqu(int ), (int)75)) ** GOTO lbl108
        if (var3_4) ** GOTO lbl41
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = eg$RollingText.li - eg$RollingText.evqx("evyd", evqu(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == eg$RollingText.evqx("evye", evqz(int ), (int)108)) break;
            v8 /* !! */  = (long)eg$RollingText.evqx("evyf", evqz(int ), (int)109);
        }
        if (var1_1 - this.switchAt < eg$RollingText.evqx("evyg", evqu(int ), (int)77)) ** GOTO lbl108
        if (var3_4 || var3_4) ** GOTO lbl41
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl82
                block48: while (true) {
                    v9 /* !! */  = (long)(eg$RollingText.evqx("evyi", evqu(int ), (int)79) - eg$RollingText.evqx("evyh", evqu(int ), (int)78));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1659080703: {
                            break block48;
                        }
                        case -277556981: {
                            continue block48;
                        }
                    }
                    break;
                }
                this.previous = null;
                if (var3_4 || var3_4) ** GOTO lbl41
                v10 = eg$RollingText.evqx("evyj", evqu(int ), (int)80);
                v11 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl94
                block49: while (true) {
                    v11 /* !! */  = (long)(v12 - eg$RollingText.evqx("evyk", evqu(int ), (int)81));
lbl94:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2121680306: {
                            v12 = eg$RollingText.evqx("evyl", evqu(int ), (int)82);
                            continue block49;
                        }
                        case -1659080703: {
                            break block49;
                        }
                        case -637706031: {
                            v12 = eg$RollingText.evqx("evym", evqu(int ), (int)83);
                            continue block49;
                        }
                        case 944526950: {
                            v12 = eg$RollingText.evqx("evyn", evqu(int ), (int)84);
                            continue block49;
                        }
                    }
                    break;
                }
                this.switchAt = (long)v10;
                if (var3_4) ** GOTO lbl41
lbl108:
                // 4 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl111:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)eg$RollingText.evqx("evyo", evqz(int ), (int)110);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl131
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyp", evqz(int ), (int)111);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 2: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyq", evqz(int ), (int)112);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 3: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyr", evqz(int ), (int)113);
                if (!var5_2) break;
                throw null;
            }
lbl131:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evys", evqz(int ), (int)114);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 5: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyt", evqz(int ), (int)115);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl141:
            // 4 sources

            case 6: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyu", evqz(int ), (int)116);
                if (var5_2) {
                    throw null;
                }
            }
            case 7: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyv", evqz(int ), (int)117);
                if (!var5_2) ** GOTO lbl141
                throw null;
            }
lbl149:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evyz", evqz(int ), (int)118);
                if (!var5_2) ** GOTO lbl111
                throw null;
            }
lbl153:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evzc", evqz(int ), (int)119);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 10: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evze", evqz(int ), (int)120);
                if (!var5_2) ** GOTO lbl111
                throw null;
            }
lbl162:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evzh", evqz(int ), (int)121);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
            case 12: 
        }
        var4_3 /* !! */  = (int)eg$RollingText.evqx("evzj", evqz(int ), (int)122);
        ** while (!var5_2)
lbl169:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String value() {
        v0 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - eg$RollingText.evqx("evtp", evqu(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1903781156: {
                    v1 = eg$RollingText.evqx("evtq", evqu(int ), (int)24);
                    continue block21;
                }
                case -1659080703: {
                    break block21;
                }
                case -1253166554: {
                    v1 = eg$RollingText.evqx("evtr", evqu(int ), (int)25);
                    continue block21;
                }
                case 788526168: {
                    v1 = eg$RollingText.evqx("evts", evqu(int ), (int)26);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = eg$RollingText.c;
        v2 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - eg$RollingText.evqx("evtt", evqu(int ), (int)27));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1659080703: {
                    break block22;
                }
                case -9911913: {
                    v3 = eg$RollingText.evqx("evtu", evqu(int ), (int)28);
                    continue block22;
                }
                case 2145101502: {
                    v3 = eg$RollingText.evqx("evtv", evqu(int ), (int)29);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = eg$RollingText.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = eg$RollingText.li - eg$RollingText.evqx("evtw", evqu(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == eg$RollingText.evqx("evtx", evqz(int ), (int)43)) break;
            v4 /* !! */  = (long)eg$RollingText.evqx("evty", evqz(int ), (int)44);
        }
        var1_3 = eg$RollingText.a;
        if (var3_1) {
            throw null;
lbl41:
            // 3 sources

            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = eg$RollingText.li - eg$RollingText.evqx("evtz", evqu(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == eg$RollingText.evqx("evua", evqz(int ), (int)45)) break;
                    v5 /* !! */  = (long)eg$RollingText.evqx("evub", evqz(int ), (int)46);
                }
                if (this.current != null) ** GOTO lbl59
                if (var1_3) ** GOTO lbl41
                v6 = "";
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl69
lbl59:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = eg$RollingText.li - eg$RollingText.evqx("evuc", evqu(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == eg$RollingText.evqx("evud", evqz(int ), (int)47)) {
                        v6 = this.current;
                        break;
                    }
                    v7 /* !! */  = (long)eg$RollingText.evqx("evue", evqz(int ), (int)48);
                }
lbl69:
                // 2 sources

                return v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)eg$RollingText.evqx("evuf", evqz(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)eg$RollingText.evqx("evug", evqz(int ), (int)50);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
lbl80:
            // 3 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)eg$RollingText.evqx("evuh", evqz(int ), (int)51);
                } while (!var3_1);
                throw null;
            }
lbl85:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)eg$RollingText.evqx("evui", evqz(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl90:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)eg$RollingText.evqx("evuj", evqz(int ), (int)53);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)eg$RollingText.evqx("evuk", evqz(int ), (int)54);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl98:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)eg$RollingText.evqx("evul", evqz(int ), (int)55);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)eg$RollingText.evqx("evum", evqz(int ), (int)56);
        ** while (!var3_1)
lbl105:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ewbm() {
        eg$RollingText.evqv[0] = -7412572359335458991L;
        eg$RollingText.evqv[1] = -1080590922040238854L;
        eg$RollingText.evqv[2] = 6678314791213892543L;
        eg$RollingText.evqv[3] = -4531169499499785630L;
        eg$RollingText.evqv[4] = -3686649792311821045L;
        eg$RollingText.evqv[5] = 1728816271570900400L;
        eg$RollingText.evqv[6] = 1241049856538619464L;
        eg$RollingText.evqv[7] = -5781086850476481014L;
        eg$RollingText.evqv[8] = -8911907620009837200L;
        eg$RollingText.evqv[9] = 5339025848753367143L;
        eg$RollingText.evqv[10] = 8741051317044449354L;
        eg$RollingText.evqv[11] = 5017129635963094347L;
        eg$RollingText.evqv[12] = 5577698925128851583L;
        eg$RollingText.evqv[13] = 4539525746712389004L;
        eg$RollingText.evqv[14] = 736717655786189718L;
        eg$RollingText.evqv[15] = -3975453861273148454L;
        eg$RollingText.evqv[16] = -3233467964930990378L;
        eg$RollingText.evqv[17] = -7884024337316433207L;
        eg$RollingText.evqv[18] = 803402964353827603L;
        eg$RollingText.evqv[19] = -2672411645029905983L;
        eg$RollingText.evqv[20] = -6316804708701080278L;
        eg$RollingText.evqv[21] = -2101385235279992967L;
        eg$RollingText.evqv[22] = 9103486521178947954L;
        eg$RollingText.evqv[23] = 1955859660698337842L;
        eg$RollingText.evqv[24] = 7001101817975076694L;
        eg$RollingText.evqv[25] = -5675757551015724190L;
        eg$RollingText.evqv[26] = 6260066645999245536L;
        eg$RollingText.evqv[27] = -4693808090712993313L;
        eg$RollingText.evqv[28] = 8205689430806632460L;
        eg$RollingText.evqv[29] = 9160524175148013979L;
        eg$RollingText.evqv[30] = -4045238432830077034L;
        eg$RollingText.evqv[31] = -9123436254165258149L;
        eg$RollingText.evqv[32] = 5404866377996121221L;
        eg$RollingText.evqv[33] = -7479577225580297631L;
        eg$RollingText.evqv[34] = -1554432951829684241L;
        eg$RollingText.evqv[35] = 6169386732222535815L;
        eg$RollingText.evqv[36] = -5002094223090022796L;
        eg$RollingText.evqv[37] = 7298619864051277260L;
        eg$RollingText.evqv[38] = 7536546966365646447L;
        eg$RollingText.evqv[39] = -1431859509795639696L;
        eg$RollingText.evqv[40] = -4282116752994991886L;
        eg$RollingText.evqv[41] = 1744073876777568000L;
        eg$RollingText.evqv[42] = -7997038352483516733L;
        eg$RollingText.evqv[43] = -5058705191968760918L;
        eg$RollingText.evqv[44] = 4633212874761704686L;
        eg$RollingText.evqv[45] = -4466260941635086506L;
        eg$RollingText.evqv[46] = 8163327017419013750L;
        eg$RollingText.evqv[47] = -6443725914268390420L;
        eg$RollingText.evqv[48] = -2572756207510043541L;
        eg$RollingText.evqv[49] = 7208995548279687959L;
        eg$RollingText.evqv[50] = 6587269634633706709L;
        eg$RollingText.evqv[51] = -5831132308698592136L;
        eg$RollingText.evqv[52] = 6338403275553759977L;
        eg$RollingText.evqv[53] = 3848024327467155400L;
        eg$RollingText.evqv[54] = -6938773484404897462L;
        eg$RollingText.evqv[55] = 768317041527446465L;
        eg$RollingText.evqv[56] = 9140787999919355574L;
        eg$RollingText.evqv[57] = -8860370249426459028L;
        eg$RollingText.evqv[58] = 4000433510611993484L;
        eg$RollingText.evqv[59] = 4714602362043659428L;
        eg$RollingText.evqv[60] = -1367729065445491752L;
        eg$RollingText.evqv[61] = 4677348511633631622L;
        eg$RollingText.evqv[62] = 280654831759208980L;
        eg$RollingText.evqv[63] = -7103182432422273414L;
        eg$RollingText.evqv[64] = 99377909008149880L;
        eg$RollingText.evqv[65] = -4539159020325661761L;
        eg$RollingText.evqv[66] = 3052323449853537033L;
        eg$RollingText.evqv[67] = 8727771414474861204L;
        eg$RollingText.evqv[68] = 4480181472700017969L;
        eg$RollingText.evqv[69] = 7435074275663550424L;
        eg$RollingText.evqv[70] = -624663459997703509L;
        eg$RollingText.evqv[71] = 6089782481326844977L;
        eg$RollingText.evqv[72] = -1503056474937946447L;
        eg$RollingText.evqv[73] = 2784166039992248094L;
        eg$RollingText.evqv[74] = -3954721323694859986L;
        eg$RollingText.evqv[75] = -157821275384463979L;
        eg$RollingText.evqv[76] = -4768293118301417822L;
        eg$RollingText.evqv[77] = 4543478642688015198L;
        eg$RollingText.evqv[78] = 2526269891600520765L;
        eg$RollingText.evqv[79] = -7605696184126329592L;
        eg$RollingText.evqv[80] = -2702208463692741672L;
        eg$RollingText.evqv[81] = 8917124019217227066L;
        eg$RollingText.evqv[82] = -4173820790225685823L;
        eg$RollingText.evqv[83] = -8504108929409876181L;
        eg$RollingText.evqv[84] = -7296783072593133444L;
    }

    public static /* synthetic */ CallSite evqx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        evra = new int[123];
        evrb = new int[123];
        eg$RollingText.evzl();
        eg$RollingText.ewak();
        eg$RollingText.ewao();
        eg$RollingText.ewbh();
        evqv = new long[85];
        evqw = new long[85];
        eg$RollingText.ewbm();
        eg$RollingText.ewbv();
    }

    /*
     * Enabled aggressive block sorting
     */
    long switchAt() {
        boolean bl2;
        Object object = li;
        block4: while (true) {
            switch ((int)object) {
                case -1659080703: {
                    break block4;
                }
                case -278737513: {
                    object = eg$RollingText.evqx("evvp", evqu(int ), (int)43) - eg$RollingText.evqx("evvo", evqu(int ), (int)42);
                    continue block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = li - eg$RollingText.evqx("evvq", evqu(int ), (int)44)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == eg$RollingText.evqx("evvr", evqz(int ), (int)75)) break;
            object2 = eg$RollingText.evqx("evvs", evqz(int ), (int)76);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = li - eg$RollingText.evqx("evvt", evqu(int ), (int)45)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == eg$RollingText.evqx("evvu", evqz(int ), (int)77)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = eg$RollingText.evqx("evvv", evqz(int ), (int)78);
        }
        if (bl2) return (long)eg$RollingText.evqx("evvw", evqu(int ), (int)46);
        if (bl2) return (long)eg$RollingText.evqx("evvw", evqu(int ), (int)46);
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = li - eg$RollingText.evqx("evvx", evqu(int ), (int)47)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == eg$RollingText.evqx("evvy", evqz(int ), (int)79)) {
                return this.switchAt;
            }
            object4 = eg$RollingText.evqx("evvz", evqz(int ), (int)80);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean animating(long var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg$RollingText.li - eg$RollingText.evqx("evwe", evqu(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eg$RollingText.evqx("evwf", evqz(int ), (int)85)) break;
            v0 /* !! */  = (long)eg$RollingText.evqx("evwg", evqz(int ), (int)86);
        }
        var5_2 = eg$RollingText.c;
        v1 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - eg$RollingText.evqx("evwh", evqu(int ), (int)49));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1659080703: {
                    break block29;
                }
                case -1031455365: {
                    v2 = eg$RollingText.evqx("evwi", evqu(int ), (int)50);
                    continue block29;
                }
                case 776433382: {
                    v2 = eg$RollingText.evqx("evwj", evqu(int ), (int)51);
                    continue block29;
                }
            }
            break;
        }
        var4_3 /* !! */  = eg$RollingText.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eg$RollingText.li - eg$RollingText.evqx("evwk", evqu(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == eg$RollingText.evqx("evwl", evqz(int ), (int)87)) break;
            v3 /* !! */  = (long)eg$RollingText.evqx("evwm", evqz(int ), (int)88);
        }
        var3_4 = eg$RollingText.a;
        if (var5_2) {
            throw null;
lbl31:
            // 5 sources

            return (boolean)eg$RollingText.evqx("evwn", evqz(int ), (int)89);
        }
        if (var3_4 || var3_4) ** GOTO lbl31
        v4 /* !! */  = eg$RollingText.li;
        if (true) ** GOTO lbl38
        block32: while (true) {
            v4 /* !! */  = (long)(v5 - eg$RollingText.evqx("evwo", evqu(int ), (int)53));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1947457102: {
                    v5 = eg$RollingText.evqx("evwp", evqu(int ), (int)54);
                    continue block32;
                }
                case -1659080703: {
                    break block32;
                }
                case -353223428: {
                    v5 = eg$RollingText.evqx("evwq", evqu(int ), (int)55);
                    continue block32;
                }
            }
            break;
        }
        if (this.previous == null) ** GOTO lbl82
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl31
                v6 /* !! */  = eg$RollingText.li;
                if (true) ** GOTO lbl56
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - eg$RollingText.evqx("evwr", evqu(int ), (int)56));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1855651606: {
                            v7 = eg$RollingText.evqx("evws", evqu(int ), (int)57);
                            continue block33;
                        }
                        case -1659080703: {
                            break block33;
                        }
                        case -1641519239: {
                            v7 = eg$RollingText.evqx("evwt", evqu(int ), (int)58);
                            continue block33;
                        }
                        case -1588896739: {
                            v7 = eg$RollingText.evqx("evwu", evqu(int ), (int)59);
                            continue block33;
                        }
                    }
                    break;
                }
                if (this.switchAt < eg$RollingText.evqx("evwv", evqu(int ), (int)60)) ** GOTO lbl82
                if (var3_4) ** GOTO lbl31
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = eg$RollingText.li - eg$RollingText.evqx("evww", evqu(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == eg$RollingText.evqx("evwx", evqz(int ), (int)90)) break;
                    v8 /* !! */  = (long)eg$RollingText.evqx("evwy", evqz(int ), (int)91);
                }
                if (var1_1 - this.switchAt >= eg$RollingText.evqx("evwz", evqu(int ), (int)62)) ** GOTO lbl82
                if (var3_4) ** GOTO lbl31
                v9 = eg$RollingText.evqx("evxa", evqz(int ), (int)92);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl85
lbl82:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v9 = eg$RollingText.evqx("evxb", evqz(int ), (int)93);
lbl85:
                // 2 sources

                return (boolean)v9;
            }
lbl86:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)eg$RollingText.evqx("evxc", evqz(int ), (int)94);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl101
                    break;
                }
            }
lbl92:
            // 3 sources

            case 1: {
                do {
                    var4_3 /* !! */  = (int)eg$RollingText.evqx("evxd", evqz(int ), (int)95);
                } while (!var5_2);
                throw null;
            }
lbl97:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evxe", evqz(int ), (int)96);
                if (!var5_2) ** GOTO lbl86
                throw null;
            }
lbl101:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evxf", evqz(int ), (int)97);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl106:
            // 2 sources

            case 4: {
                do {
                    var4_3 /* !! */  = (int)eg$RollingText.evqx("evxg", evqz(int ), (int)98);
                } while (!var5_2);
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evxh", evqz(int ), (int)99);
                if (!var5_2) ** GOTO lbl92
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evxi", evqz(int ), (int)100);
                if (!var5_2) ** GOTO lbl97
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evxj", evqz(int ), (int)101);
                if (!var5_2) ** GOTO lbl92
                throw null;
            }
lbl123:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)eg$RollingText.evqx("evxk", evqz(int ), (int)102);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
            case 9: 
        }
        var4_3 /* !! */  = (int)eg$RollingText.evqx("evxl", evqz(int ), (int)103);
        ** while (!var5_2)
lbl130:
        // 1 sources

        throw null;
    }
}

