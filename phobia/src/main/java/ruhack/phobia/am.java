/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import ruhack.phobia.g;

public class am {
    private static am instance;
    public static final int b;
    private final Path configPath;
    private String prefix;
    private static long[] bzvi;
    public static final long fg = 232953564431764527L;
    private static int[] bzur;
    private final Gson gson;
    public static final boolean a;
    public static final boolean c;
    private static long[] bzvj;
    private static int[] bzup;

    private static /* synthetic */ void caky() {
        am.bzvi[0] = -5701765004600840536L;
        am.bzvi[1] = 3651681334833620091L;
        am.bzvi[2] = 2666237377076116436L;
        am.bzvi[3] = 8731858692284740014L;
        am.bzvi[4] = -4076649742222049496L;
        am.bzvi[5] = 7810043640067356769L;
        am.bzvi[6] = -2959896846526908168L;
        am.bzvi[7] = 8056952095612894221L;
        am.bzvi[8] = -6063992102660808831L;
        am.bzvi[9] = 5134213455159907948L;
        am.bzvi[10] = -792350877233304576L;
        am.bzvi[11] = 2613838097614498036L;
        am.bzvi[12] = 2696715158348404374L;
        am.bzvi[13] = -8486937603144874362L;
        am.bzvi[14] = 6976280999962733171L;
        am.bzvi[15] = 4818452395722914405L;
        am.bzvi[16] = -3853705047813864095L;
        am.bzvi[17] = 8503508056757005174L;
        am.bzvi[18] = -7435095358080568736L;
        am.bzvi[19] = 1875452878896306299L;
        am.bzvi[20] = -3009740574327474021L;
        am.bzvi[21] = 8901880543320558852L;
        am.bzvi[22] = 8485484322639335535L;
        am.bzvi[23] = -2302679615087147073L;
        am.bzvi[24] = -7112111974223088480L;
        am.bzvi[25] = -4330454768363077962L;
        am.bzvi[26] = -6212617054035364775L;
        am.bzvi[27] = 8682744621853407363L;
        am.bzvi[28] = 4042308006760631720L;
        am.bzvi[29] = -2598078550682356603L;
        am.bzvi[30] = -8295891526578791492L;
        am.bzvi[31] = -406429703030486096L;
        am.bzvi[32] = 7521158269464883767L;
        am.bzvi[33] = -6715102423059301901L;
        am.bzvi[34] = -5864005485243090840L;
        am.bzvi[35] = 5246468089686164272L;
        am.bzvi[36] = -3265127414851079852L;
        am.bzvi[37] = -3370329337351274572L;
        am.bzvi[38] = 891132929350681420L;
        am.bzvi[39] = 7537486493823499072L;
        am.bzvi[40] = -7439555121020279412L;
        am.bzvi[41] = -2845302869110604755L;
        am.bzvi[42] = 6468727704425455670L;
        am.bzvi[43] = 1985079282882609419L;
        am.bzvi[44] = -4043988787496198453L;
        am.bzvi[45] = -181718085661533086L;
        am.bzvi[46] = -6139905978067294321L;
        am.bzvi[47] = 2936253453838599564L;
        am.bzvi[48] = -506935201839208339L;
        am.bzvi[49] = -733395363930686567L;
        am.bzvi[50] = 126029537430027517L;
        am.bzvi[51] = -6313851863035700539L;
        am.bzvi[52] = 2845763674537058635L;
        am.bzvi[53] = 2382244554755624729L;
        am.bzvi[54] = 4331873975265202603L;
        am.bzvi[55] = -4681904486220495504L;
        am.bzvi[56] = -1616904866490442578L;
        am.bzvi[57] = -8004681432244037338L;
        am.bzvi[58] = -9080137058495044473L;
        am.bzvi[59] = -830864910683434358L;
        am.bzvi[60] = 1103521755385504911L;
        am.bzvi[61] = 2115983449055304367L;
        am.bzvi[62] = -2204030157708840270L;
        am.bzvi[63] = 5530858443735065925L;
        am.bzvi[64] = 3551439773505119842L;
        am.bzvi[65] = 5626401661626289256L;
        am.bzvi[66] = -7572455567008900724L;
        am.bzvi[67] = 8137502302248728422L;
        am.bzvi[68] = 4375741045283587749L;
        am.bzvi[69] = -596259690322583184L;
        am.bzvi[70] = -2688398534755832315L;
        am.bzvi[71] = -4236127303501377162L;
        am.bzvi[72] = 5574742154414170937L;
        am.bzvi[73] = -2088880658915797324L;
        am.bzvi[74] = -1601481252032428569L;
        am.bzvi[75] = 3681756046031512747L;
        am.bzvi[76] = 8129567668047515642L;
        am.bzvi[77] = -7886690738464009112L;
        am.bzvi[78] = 2715667660123685803L;
        am.bzvi[79] = -9217736074404273088L;
        am.bzvi[80] = -6984199194578413668L;
        am.bzvi[81] = -3277864477980085804L;
        am.bzvi[82] = 1192333533498513317L;
        am.bzvi[83] = 5088123415984694894L;
        am.bzvi[84] = 7408145421744381515L;
        am.bzvi[85] = 5605974760754308171L;
        am.bzvi[86] = 3901053410988192662L;
        am.bzvi[87] = -3600331821042920371L;
        am.bzvi[88] = -6970093193006525323L;
        am.bzvi[89] = 5953945543164409950L;
        am.bzvi[90] = -6983826933278361531L;
        am.bzvi[91] = 3784028499171215340L;
        am.bzvi[92] = -9014483746995646936L;
        am.bzvi[93] = 3033276268443160077L;
        am.bzvi[94] = -5189893844567752629L;
        am.bzvi[95] = -488512919434354477L;
        am.bzvi[96] = -7360658376861366086L;
        am.bzvi[97] = 4873632291544510257L;
        am.bzvi[98] = -9000028629117109581L;
        am.bzvi[99] = -7473611947648696284L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getPrefix() {
        v0 /* !! */  = am.fg;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(am.bzut("cajd", bzvg(int ), (int)107) - am.bzut("cajb", bzvg(int ), (int)106));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1894446266: {
                    continue block14;
                }
                case 1495125039: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = am.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = am.fg - am.bzut("caje", bzvg(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == am.bzut("cajg", bzun(int ), (int)141)) break;
            v1 /* !! */  = (long)am.bzut("cajj", bzun(int ), (int)142);
        }
        var2_2 /* !! */  = am.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = am.fg - am.bzut("cajk", bzvg(int ), (int)109)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == am.bzut("cajl", bzun(int ), (int)143)) break;
            v2 /* !! */  = (long)am.bzut("cajm", bzun(int ), (int)144);
        }
        var1_3 = am.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = am.fg;
                if (true) ** GOTO lbl37
                block18: while (true) {
                    v3 /* !! */  = (long)(am.bzut("cajo", bzvg(int ), (int)111) - am.bzut("cajn", bzvg(int ), (int)110));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1076624616: {
                            continue block18;
                        }
                        case 1495125039: {
                            break block18;
                        }
                    }
                    break;
                }
                return this.prefix;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)am.bzut("cajp", bzun(int ), (int)145);
                } while (!var3_1);
                throw null;
            }
lbl48:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)am.bzut("cajq", bzun(int ), (int)146);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)am.bzut("cajr", bzun(int ), (int)147);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)am.bzut("cajs", bzun(int ), (int)148);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cajv() {
        am.bzup[0] = -1714540350;
        am.bzup[1] = 1323714744;
        am.bzup[2] = 811004024;
        am.bzup[3] = 1926033692;
        am.bzup[4] = -1674933238;
        am.bzup[5] = -487937875;
        am.bzup[6] = 100280348;
        am.bzup[7] = -1799214534;
        am.bzup[8] = -47373360;
        am.bzup[9] = 145110106;
        am.bzup[10] = -1379563365;
        am.bzup[11] = -1300595852;
        am.bzup[12] = 1315193629;
        am.bzup[13] = 853558349;
        am.bzup[14] = 1234865847;
        am.bzup[15] = -1057725377;
        am.bzup[16] = 721146027;
        am.bzup[17] = -1852767437;
        am.bzup[18] = -1611567020;
        am.bzup[19] = -969140799;
        am.bzup[20] = -1726365502;
        am.bzup[21] = 1567637651;
        am.bzup[22] = 204885144;
        am.bzup[23] = -1851221518;
        am.bzup[24] = 267759821;
        am.bzup[25] = -2104878670;
        am.bzup[26] = -1640372618;
        am.bzup[27] = 202285513;
        am.bzup[28] = 414377113;
        am.bzup[29] = 1277278157;
        am.bzup[30] = -914307890;
        am.bzup[31] = -950161075;
        am.bzup[32] = -682111881;
        am.bzup[33] = -816538497;
        am.bzup[34] = -81904922;
        am.bzup[35] = -1523573575;
        am.bzup[36] = -451879686;
        am.bzup[37] = 1890266799;
        am.bzup[38] = 1883714068;
        am.bzup[39] = 1844352114;
        am.bzup[40] = -100271195;
        am.bzup[41] = 471856155;
        am.bzup[42] = -655842387;
        am.bzup[43] = -1087168824;
        am.bzup[44] = -248531963;
        am.bzup[45] = -1220462114;
        am.bzup[46] = 909681155;
        am.bzup[47] = 178782694;
        am.bzup[48] = 1034023870;
        am.bzup[49] = -592644931;
        am.bzup[50] = 1105553157;
        am.bzup[51] = -1416379032;
        am.bzup[52] = 807086303;
        am.bzup[53] = 1780247808;
        am.bzup[54] = 736829874;
        am.bzup[55] = -1279192973;
        am.bzup[56] = 249022539;
        am.bzup[57] = 111989791;
        am.bzup[58] = 631779218;
        am.bzup[59] = -226531735;
        am.bzup[60] = 1105729734;
        am.bzup[61] = 1324047650;
        am.bzup[62] = -1254679778;
        am.bzup[63] = 1142430725;
        am.bzup[64] = 1817235654;
        am.bzup[65] = -459124020;
        am.bzup[66] = -2042005119;
        am.bzup[67] = 1902177871;
        am.bzup[68] = -1543902545;
        am.bzup[69] = -1534008727;
        am.bzup[70] = 1603287283;
        am.bzup[71] = 1788446523;
        am.bzup[72] = 1951244470;
        am.bzup[73] = -434033869;
        am.bzup[74] = 1621789767;
        am.bzup[75] = 654192187;
        am.bzup[76] = 1626343679;
        am.bzup[77] = -1276368627;
        am.bzup[78] = 1821071721;
        am.bzup[79] = -1564777076;
        am.bzup[80] = 19542954;
        am.bzup[81] = 2133008492;
        am.bzup[82] = 1777732711;
        am.bzup[83] = 125158345;
        am.bzup[84] = 1418737116;
        am.bzup[85] = -2142693859;
        am.bzup[86] = -828491379;
        am.bzup[87] = -432702197;
        am.bzup[88] = 162757624;
        am.bzup[89] = 1965013784;
        am.bzup[90] = -735963605;
        am.bzup[91] = -159654564;
        am.bzup[92] = 2089997557;
        am.bzup[93] = -687353499;
        am.bzup[94] = 899971533;
        am.bzup[95] = 341469184;
        am.bzup[96] = 1667096130;
        am.bzup[97] = 769130955;
        am.bzup[98] = -1709181128;
        am.bzup[99] = -1203761235;
    }

    private static /* synthetic */ void calo() {
        am.bzvj[0] = 530107864823821554L;
        am.bzvj[1] = 8748666163775533742L;
        am.bzvj[2] = -947148582533437503L;
        am.bzvj[3] = 1545475289041505219L;
        am.bzvj[4] = -4523221220244669284L;
        am.bzvj[5] = 1888203727294155895L;
        am.bzvj[6] = 2110925306137036202L;
        am.bzvj[7] = -2947449776609921687L;
        am.bzvj[8] = 6659017587065728830L;
        am.bzvj[9] = 4913761880200180005L;
        am.bzvj[10] = 6295128609468678463L;
        am.bzvj[11] = -5072744488592531684L;
        am.bzvj[12] = 6612602312268815184L;
        am.bzvj[13] = 1892735928706154205L;
        am.bzvj[14] = -5225553445751508456L;
        am.bzvj[15] = -1918067195889477879L;
        am.bzvj[16] = 5770938508366994848L;
        am.bzvj[17] = 3727375865642900182L;
        am.bzvj[18] = -2162940449102529855L;
        am.bzvj[19] = 4423800505049073844L;
        am.bzvj[20] = 4902020146815586690L;
        am.bzvj[21] = -6657574868203101660L;
        am.bzvj[22] = 3496146982937153443L;
        am.bzvj[23] = 1393235197239953724L;
        am.bzvj[24] = -894531407005152776L;
        am.bzvj[25] = 5129614363272938586L;
        am.bzvj[26] = -8395614234871866355L;
        am.bzvj[27] = -2857630623736713530L;
        am.bzvj[28] = 4858077062043576059L;
        am.bzvj[29] = -1850491083307793247L;
        am.bzvj[30] = -2912959115044536147L;
        am.bzvj[31] = -6028166978328123437L;
        am.bzvj[32] = -6321434066044548861L;
        am.bzvj[33] = -540405710712130590L;
        am.bzvj[34] = -3167440192326315963L;
        am.bzvj[35] = -1308123814572298708L;
        am.bzvj[36] = -6664139491974705826L;
        am.bzvj[37] = -5828614230993040504L;
        am.bzvj[38] = -755009111809336149L;
        am.bzvj[39] = 3557825790087935167L;
        am.bzvj[40] = -8880227723548019387L;
        am.bzvj[41] = -7126531794404551668L;
        am.bzvj[42] = -2214085609806847923L;
        am.bzvj[43] = 515211023622434702L;
        am.bzvj[44] = -6502571121919743855L;
        am.bzvj[45] = -3312403514916220111L;
        am.bzvj[46] = -3493905407906231609L;
        am.bzvj[47] = -5146329290964450042L;
        am.bzvj[48] = 7451155751774939190L;
        am.bzvj[49] = -8538375914981951860L;
        am.bzvj[50] = -7913029011609036562L;
        am.bzvj[51] = 3637125767300468844L;
        am.bzvj[52] = -3364500080987785649L;
        am.bzvj[53] = 9114653050441996793L;
        am.bzvj[54] = -7989786410090405628L;
        am.bzvj[55] = -4356442319302566661L;
        am.bzvj[56] = -3096487623771446376L;
        am.bzvj[57] = -3667101978240577982L;
        am.bzvj[58] = 7714911048049264349L;
        am.bzvj[59] = -6690892571979379928L;
        am.bzvj[60] = -7772597759034568951L;
        am.bzvj[61] = -3817681905076630542L;
        am.bzvj[62] = -5812560300634858856L;
        am.bzvj[63] = -1301038604863769206L;
        am.bzvj[64] = -820148391332198631L;
        am.bzvj[65] = 1440552170855082034L;
        am.bzvj[66] = -5287707301381496724L;
        am.bzvj[67] = -5373348832147572046L;
        am.bzvj[68] = 4519898029679053889L;
        am.bzvj[69] = 2405074635383837932L;
        am.bzvj[70] = -18032009778859028L;
        am.bzvj[71] = -2665688884502961441L;
        am.bzvj[72] = -946687584726047518L;
        am.bzvj[73] = -7041380548792693271L;
        am.bzvj[74] = 6497010202964985539L;
        am.bzvj[75] = -5769931820446437991L;
        am.bzvj[76] = 2643287906286750818L;
        am.bzvj[77] = 6600466765875235787L;
        am.bzvj[78] = -1128433690369357506L;
        am.bzvj[79] = -3848150358993921824L;
        am.bzvj[80] = -7975883841560804834L;
        am.bzvj[81] = -3784116990564189685L;
        am.bzvj[82] = 425465475885494097L;
        am.bzvj[83] = -896682297903522431L;
        am.bzvj[84] = -8117427984875383554L;
        am.bzvj[85] = -4532973364158787677L;
        am.bzvj[86] = -8826587138952115561L;
        am.bzvj[87] = 4998846040443361267L;
        am.bzvj[88] = 7171787655607148794L;
        am.bzvj[89] = -5803254546783110549L;
        am.bzvj[90] = -5330347914514687609L;
        am.bzvj[91] = 4003485534421531587L;
        am.bzvj[92] = -2171536263278997591L;
        am.bzvj[93] = 5835830006916907071L;
        am.bzvj[94] = 3006344118762145787L;
        am.bzvj[95] = 7908547457818497060L;
        am.bzvj[96] = 5020468435196034333L;
        am.bzvj[97] = 5628357725517268487L;
        am.bzvj[98] = -1223655748872896332L;
        am.bzvj[99] = 4368370111323065557L;
    }

    private static /* synthetic */ long bzvg(int n2) {
        return bzvi[n2] ^ bzvj[n2];
    }

    private static /* synthetic */ void calk() {
        am.bzvi[100] = 2025828444539834642L;
        am.bzvi[101] = -8618786030414660470L;
        am.bzvi[102] = -2908685048994262582L;
        am.bzvi[103] = -474792494779700176L;
        am.bzvi[104] = -5769319378925155683L;
        am.bzvi[105] = 4842766045741061927L;
        am.bzvi[106] = -8873715388945721328L;
        am.bzvi[107] = 3102288235059167631L;
        am.bzvi[108] = -4007271764245057804L;
        am.bzvi[109] = -3331337778496262708L;
        am.bzvi[110] = -8642121759677574377L;
        am.bzvi[111] = -4690026844665693668L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private am() {
        var4_1 /* !! */  = am.b;
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.gson = new GsonBuilder().setPrettyPrinting().create();
                this.prefix = ".";
                var1_2 = Paths.get("Phobia", new String[]{"configs"});
                try {
                    Files.createDirectories(var1_2, new FileAttribute[0]);
                }
                catch (IOException var2_3) {
                    // empty catch block
                }
                this.configPath = var1_2.resolve("prefix.file");
                return;
            }
lbl17:
            // 3 sources

            case 0: {
                while (true) {
                    var4_1 /* !! */  = (int)am.bzut("bzuu", bzun(int ), (int)0);
                }
            }
lbl21:
            // 3 sources

            case 1: {
                var4_1 /* !! */  = (int)am.bzut("bzuv", bzun(int ), (int)1);
                ** GOTO lbl17
            }
            case 2: {
                var4_1 /* !! */  = (int)am.bzut("bzuw", bzun(int ), (int)2);
            }
            case 3: {
                var4_1 /* !! */  = (int)am.bzut("bzux", bzun(int ), (int)3);
                ** GOTO lbl17
            }
            case 4: {
                var4_1 /* !! */  = (int)am.bzut("bzuz", bzun(int ), (int)4);
                ** GOTO lbl21
            }
            case 5: {
                var4_1 /* !! */  = (int)am.bzut("bzvb", bzun(int ), (int)5);
                break;
            }
            case 6: {
                while (true) {
                    var4_1 /* !! */  = (int)am.bzut("bzvc", bzun(int ), (int)6);
                }
            }
            case 7: {
                var4_1 /* !! */  = (int)am.bzut("bzvd", bzun(int ), (int)7);
                ** GOTO lbl21
            }
            case 8: 
        }
        while (true) {
            var4_1 /* !! */  = (int)am.bzut("bzve", bzun(int ), (int)8);
        }
    }

    private static /* synthetic */ void caku() {
        am.bzur[100] = -1327389114;
        am.bzur[101] = -1788889314;
        am.bzur[102] = -2074951915;
        am.bzur[103] = -178258151;
        am.bzur[104] = -1405787302;
        am.bzur[105] = 2103721362;
        am.bzur[106] = 1820452910;
        am.bzur[107] = -1266453021;
        am.bzur[108] = -1398674877;
        am.bzur[109] = -1649439289;
        am.bzur[110] = 1672964396;
        am.bzur[111] = -821199341;
        am.bzur[112] = 765230234;
        am.bzur[113] = -761217692;
        am.bzur[114] = -424787832;
        am.bzur[115] = 819314024;
        am.bzur[116] = -173412562;
        am.bzur[117] = 1565870157;
        am.bzur[118] = -411020924;
        am.bzur[119] = -829886338;
        am.bzur[120] = -1098732086;
        am.bzur[121] = -88378027;
        am.bzur[122] = 1005983317;
        am.bzur[123] = -236342115;
        am.bzur[124] = 1539211381;
        am.bzur[125] = 1101074912;
        am.bzur[126] = 1534878866;
        am.bzur[127] = -1688423463;
        am.bzur[128] = -2116000839;
        am.bzur[129] = 1487286966;
        am.bzur[130] = 675134503;
        am.bzur[131] = -651708907;
        am.bzur[132] = -422214247;
        am.bzur[133] = -1400758300;
        am.bzur[134] = -1533440150;
        am.bzur[135] = 7162242;
        am.bzur[136] = 1882365379;
        am.bzur[137] = 626039520;
        am.bzur[138] = -213944212;
        am.bzur[139] = 740028262;
        am.bzur[140] = 1576146177;
        am.bzur[141] = -381009562;
        am.bzur[142] = 256749829;
        am.bzur[143] = 611749334;
        am.bzur[144] = 1695458707;
        am.bzur[145] = -422269580;
        am.bzur[146] = 744824777;
        am.bzur[147] = 1534481111;
        am.bzur[148] = -2018413676;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static am getInstance() {
        v0 /* !! */  = am.fg;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - am.bzut("bzvl", bzvg(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1961100775: {
                    v1 = am.bzut("bzvm", bzvg(int ), (int)1);
                    continue block33;
                }
                case 343042650: {
                    v1 = am.bzut("bzvn", bzvg(int ), (int)2);
                    continue block33;
                }
                case 987150964: {
                    v1 = am.bzut("bzvo", bzvg(int ), (int)3);
                    continue block33;
                }
                case 1495125039: {
                    break block33;
                }
            }
            break;
        }
        var2 = am.c;
        v2 /* !! */  = am.fg;
        if (true) ** GOTO lbl22
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - am.bzut("bzvp", bzvg(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2079730775: {
                    v3 = am.bzut("bzvr", bzvg(int ), (int)5);
                    continue block34;
                }
                case -1941941380: {
                    v3 = am.bzut("bzvt", bzvg(int ), (int)6);
                    continue block34;
                }
                case 714043237: {
                    v3 = am.bzut("bzvu", bzvg(int ), (int)7);
                    continue block34;
                }
                case 1495125039: {
                    break block34;
                }
            }
            break;
        }
        var1_1 /* !! */  = am.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = am.fg - am.bzut("bzvv", bzvg(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == am.bzut("bzvw", bzun(int ), (int)9)) break;
            v4 /* !! */  = (long)am.bzut("bzvx", bzun(int ), (int)10);
        }
        var0_2 = am.a;
        if (var2) {
            throw null;
lbl43:
            // 4 sources

            return null;
        }
        if (var0_2 || var0_2) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = am.fg - am.bzut("bzvy", bzvg(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == am.bzut("bzwa", bzun(int ), (int)11)) break;
            v5 /* !! */  = (long)am.bzut("bzwb", bzun(int ), (int)12);
        }
        if (am.instance != null) ** GOTO lbl89
        if (var0_2 || var0_2) ** GOTO lbl43
        v6 /* !! */  = am.fg;
        if (true) ** GOTO lbl57
        block38: while (true) {
            v6 /* !! */  = (long)(v7 - am.bzut("bzwd", bzvg(int ), (int)10));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1257507892: {
                    v7 = am.bzut("bzwe", bzvg(int ), (int)11);
                    continue block38;
                }
                case -1100481611: {
                    v7 = am.bzut("bzwf", bzvg(int ), (int)12);
                    continue block38;
                }
                case 417129745: {
                    v7 = am.bzut("bzwg", bzvg(int ), (int)13);
                    continue block38;
                }
                case 1495125039: {
                    break block38;
                }
            }
            break;
        }
        v8 /* !! */  = am.fg;
        if (true) ** GOTO lbl73
        block39: while (true) {
            v8 /* !! */  = (long)(am.bzut("bzwk", bzvg(int ), (int)15) - am.bzut("bzwi", bzvg(int ), (int)14));
lbl73:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 621065724: {
                    continue block39;
                }
                case 1495125039: {
                    break block39;
                }
            }
            break;
        }
        v9 = new am();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = am.fg - am.bzut("bzwl", bzvg(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == am.bzut("bzwm", bzun(int ), (int)13)) break;
            v10 /* !! */  = (long)am.bzut("bzwo", bzun(int ), (int)14);
        }
        am.instance = v9;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block22 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl43
lbl89:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = am.fg - am.bzut("bzwp", bzvg(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == am.bzut("bzwq", bzun(int ), (int)15)) break;
                    v11 /* !! */  = (long)am.bzut("bzwr", bzun(int ), (int)16);
                }
                return am.instance;
            }
            case 0: {
                var1_1 /* !! */  = (int)am.bzut("bzws", bzun(int ), (int)17);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl102:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)am.bzut("bzwt", bzun(int ), (int)18);
                    if (!var2) break block22;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)am.bzut("bzwu", bzun(int ), (int)19);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl112:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)am.bzut("bzwv", bzun(int ), (int)20);
                if (!var2) ** GOTO lbl102
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)am.bzut("bzww", bzun(int ), (int)21);
                if (!var2) break;
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)am.bzut("bzwx", bzun(int ), (int)22);
                if (!var2) break;
                throw null;
            }
lbl124:
            // 2 sources

            case 6: {
                do {
                    var1_1 /* !! */  = (int)am.bzut("bzwz", bzun(int ), (int)23);
                } while (!var2);
                throw null;
            }
lbl129:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)am.bzut("bzxb", bzun(int ), (int)24);
                if (!var2) ** GOTO lbl112
                throw null;
            }
            case 8: 
        }
        var1_1 /* !! */  = (int)am.bzut("bzxc", bzun(int ), (int)25);
        ** while (!var2)
lbl136:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cakg() {
        am.bzup[100] = -1327389113;
        am.bzup[101] = -1029230422;
        am.bzup[102] = -2074951916;
        am.bzup[103] = 1001087306;
        am.bzup[104] = -1405787301;
        am.bzup[105] = -1404769637;
        am.bzup[106] = 1820452911;
        am.bzup[107] = -238443660;
        am.bzup[108] = 1398674876;
        am.bzup[109] = 1026175021;
        am.bzup[110] = 1672964397;
        am.bzup[111] = -1571374214;
        am.bzup[112] = 765230230;
        am.bzup[113] = -761217680;
        am.bzup[114] = -424787829;
        am.bzup[115] = 819314046;
        am.bzup[116] = -173412553;
        am.bzup[117] = 1565870145;
        am.bzup[118] = -411020900;
        am.bzup[119] = -829886362;
        am.bzup[120] = -1098732069;
        am.bzup[121] = -88378034;
        am.bzup[122] = 1005983324;
        am.bzup[123] = -236342135;
        am.bzup[124] = 1539211373;
        am.bzup[125] = 1101074929;
        am.bzup[126] = 1534878864;
        am.bzup[127] = -1688423465;
        am.bzup[128] = -2116000843;
        am.bzup[129] = 1487286969;
        am.bzup[130] = 675134503;
        am.bzup[131] = -651708900;
        am.bzup[132] = -422214251;
        am.bzup[133] = -1400758303;
        am.bzup[134] = -1533440157;
        am.bzup[135] = 7162259;
        am.bzup[136] = 1882365394;
        am.bzup[137] = 626039533;
        am.bzup[138] = -213944194;
        am.bzup[139] = 740028278;
        am.bzup[140] = 1576146189;
        am.bzup[141] = 381009561;
        am.bzup[142] = 1943426856;
        am.bzup[143] = 611749335;
        am.bzup[144] = 1940136981;
        am.bzup[145] = -422269580;
        am.bzup[146] = 744824779;
        am.bzup[147] = 1534481109;
        am.bzup[148] = -2018413675;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPrefix(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = am.fg - am.bzut("bzxe", bzvg(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == am.bzut("bzxg", bzun(int ), (int)26)) break;
            v0 /* !! */  = (long)am.bzut("bzxh", bzun(int ), (int)27);
        }
        var4_2 = am.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = am.fg - am.bzut("bzxj", bzvg(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == am.bzut("bzxk", bzun(int ), (int)28)) break;
            v1 /* !! */  = (long)am.bzut("bzxl", bzun(int ), (int)29);
        }
        var3_3 /* !! */  = am.b;
        v2 /* !! */  = am.fg;
        if (true) ** GOTO lbl17
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - am.bzut("bzxm", bzvg(int ), (int)20));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -357442640: {
                    v3 = am.bzut("bzxn", bzvg(int ), (int)21);
                    continue block30;
                }
                case 1495125039: {
                    break block30;
                }
                case 1693841968: {
                    v3 = am.bzut("bzxp", bzvg(int ), (int)22);
                    continue block30;
                }
            }
            break;
        }
        var2_4 = am.a;
        if (var4_2) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = am.fg - am.bzut("bzxr", bzvg(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == am.bzut("bzxs", bzun(int ), (int)30)) break;
            v4 /* !! */  = (long)am.bzut("bzxt", bzun(int ), (int)31);
        }
        this.prefix = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                v5 /* !! */  = am.fg;
                if (true) ** GOTO lbl46
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - am.bzut("bzxu", bzvg(int ), (int)24));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1531658127: {
                            v6 = am.bzut("bzxv", bzvg(int ), (int)25);
                            continue block33;
                        }
                        case 1495125039: {
                            break block33;
                        }
                        case 2001295901: {
                            v6 = am.bzut("bzxw", bzvg(int ), (int)26);
                            continue block33;
                        }
                    }
                    break;
                }
                if (g.getInstance() == null) ** GOTO lbl78
                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = am.fg - am.bzut("bzxy", bzvg(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == am.bzut("bzya", bzun(int ), (int)32)) break;
                    v7 /* !! */  = (long)am.bzut("bzyb", bzun(int ), (int)33);
                }
                v8 = g.getInstance();
                v9 /* !! */  = am.fg;
                if (true) ** GOTO lbl67
                block35: while (true) {
                    v9 /* !! */  = (long)(v10 - am.bzut("bzyc", bzvg(int ), (int)28));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -238155179: {
                            v10 = am.bzut("bzyd", bzvg(int ), (int)29);
                            continue block35;
                        }
                        case 635201624: {
                            v10 = am.bzut("bzyf", bzvg(int ), (int)30);
                            continue block35;
                        }
                        case 1495125039: {
                            break block35;
                        }
                    }
                    break;
                }
                v8.setPrefix(var1_1);
                if (var2_4) ** GOTO lbl29
lbl78:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)am.bzut("bzyg", bzun(int ), (int)34);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl86:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)am.bzut("bzyi", bzun(int ), (int)35);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 2: {
                var3_3 /* !! */  = (int)am.bzut("bzyj", bzun(int ), (int)36);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl96:
            // 5 sources

            case 3: {
                var3_3 /* !! */  = (int)am.bzut("bzyl", bzun(int ), (int)37);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
lbl100:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)am.bzut("bzym", bzun(int ), (int)38);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)am.bzut("bzyn", bzun(int ), (int)39);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)am.bzut("bzyo", bzun(int ), (int)40);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl113:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)am.bzut("bzyq", bzun(int ), (int)41);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl117:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)am.bzut("bzys", bzun(int ), (int)42);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)am.bzut("bzyt", bzun(int ), (int)43);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)am.bzut("bzyu", bzun(int ), (int)44);
        ** while (!var4_2)
lbl128:
        // 1 sources

        throw null;
    }

    static {
        bzup = new int[149];
        bzur = new int[149];
        am.cajv();
        am.cakg();
        am.cakl();
        am.caku();
        bzvi = new long[112];
        bzvj = new long[112];
        am.caky();
        am.calk();
        am.calo();
        am.came();
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 20[SWITCH]
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
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 62[SWITCH]
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

    private static /* synthetic */ int bzun(int n2) {
        return bzup[n2] ^ bzur[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPrefixAndSave(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = am.fg - am.bzut("bzyw", bzvg(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == am.bzut("bzyx", bzun(int ), (int)45)) break;
            v0 /* !! */  = (long)am.bzut("bzyy", bzun(int ), (int)46);
        }
        var4_2 = am.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = am.fg - am.bzut("bzza", bzvg(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == am.bzut("bzzb", bzun(int ), (int)47)) break;
            v1 /* !! */  = (long)am.bzut("bzzd", bzun(int ), (int)48);
        }
        var3_3 = am.b;
        v2 /* !! */  = am.fg;
        if (true) ** GOTO lbl17
        block7: while (true) {
            v2 /* !! */  = (long)(v3 - am.bzut("bzze", bzvg(int ), (int)33));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 57385255: {
                    v3 = am.bzut("bzzf", bzvg(int ), (int)34);
                    continue block7;
                }
                case 1495125039: {
                    break block7;
                }
                case 2055862046: {
                    v3 = am.bzut("bzzh", bzvg(int ), (int)35);
                    continue block7;
                }
            }
            break;
        }
        var2_4 = am.a;
        if (var4_2) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = am.fg - am.bzut("bzzi", bzvg(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == am.bzut("bzzj", bzun(int ), (int)49)) break;
            v4 /* !! */  = (long)am.bzut("bzzk", bzun(int ), (int)50);
        }
        this.setPrefix(var1_1);
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = am.fg - am.bzut("bzzl", bzvg(int ), (int)37)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == am.bzut("bzzm", bzun(int ), (int)51)) break;
            v5 /* !! */  = (long)am.bzut("bzzn", bzun(int ), (int)52);
        }
        this.save();
        ** while (var2_4 || var2_4)
lbl46:
        // 1 sources

    }

    private static /* synthetic */ void came() {
        am.bzvj[100] = 6500765117934126985L;
        am.bzvj[101] = -4010630214872205136L;
        am.bzvj[102] = -1708954414851633741L;
        am.bzvj[103] = 7566227328471384490L;
        am.bzvj[104] = -672746267376314123L;
        am.bzvj[105] = 893130329935619791L;
        am.bzvj[106] = 2876360826681814929L;
        am.bzvj[107] = 4187451682032496629L;
        am.bzvj[108] = -963176813429172381L;
        am.bzvj[109] = -3321692252094238302L;
        am.bzvj[110] = -8375326869241163361L;
        am.bzvj[111] = -1995124671066516879L;
    }

    private static /* synthetic */ void cakl() {
        am.bzur[0] = -1714540346;
        am.bzur[1] = 1323714745;
        am.bzur[2] = 811004016;
        am.bzur[3] = 1926033684;
        am.bzur[4] = -1674933237;
        am.bzur[5] = -487937874;
        am.bzur[6] = 100280349;
        am.bzur[7] = -1799214536;
        am.bzur[8] = -47373358;
        am.bzur[9] = 145110107;
        am.bzur[10] = 206823073;
        am.bzur[11] = 1300595851;
        am.bzur[12] = -1722860791;
        am.bzur[13] = 853558348;
        am.bzur[14] = -634030705;
        am.bzur[15] = 1057725376;
        am.bzur[16] = 1558844735;
        am.bzur[17] = -1852767433;
        am.bzur[18] = -1611567012;
        am.bzur[19] = -969140793;
        am.bzur[20] = -1726365502;
        am.bzur[21] = 1567637651;
        am.bzur[22] = 204885148;
        am.bzur[23] = -1851221519;
        am.bzur[24] = 267759818;
        am.bzur[25] = -2104878670;
        am.bzur[26] = 1640372617;
        am.bzur[27] = 1100811335;
        am.bzur[28] = -414377114;
        am.bzur[29] = 1648767833;
        am.bzur[30] = -914307889;
        am.bzur[31] = -335671788;
        am.bzur[32] = -682111882;
        am.bzur[33] = 1353853304;
        am.bzur[34] = -81904914;
        am.bzur[35] = -1523573571;
        am.bzur[36] = -451879688;
        am.bzur[37] = 1890266795;
        am.bzur[38] = 1883714067;
        am.bzur[39] = 1844352115;
        am.bzur[40] = -100271199;
        am.bzur[41] = 471856158;
        am.bzur[42] = -655842386;
        am.bzur[43] = -1087168830;
        am.bzur[44] = -248531956;
        am.bzur[45] = 1220462113;
        am.bzur[46] = -1725916233;
        am.bzur[47] = 178782695;
        am.bzur[48] = 217927747;
        am.bzur[49] = 592644930;
        am.bzur[50] = 1539868905;
        am.bzur[51] = 1416379031;
        am.bzur[52] = -920157728;
        am.bzur[53] = 1780247815;
        am.bzur[54] = 736829875;
        am.bzur[55] = -1279192976;
        am.bzur[56] = 249022536;
        am.bzur[57] = 111989787;
        am.bzur[58] = 631779216;
        am.bzur[59] = -226531733;
        am.bzur[60] = 1105729733;
        am.bzur[61] = 1324047651;
        am.bzur[62] = 2036901010;
        am.bzur[63] = -1142430726;
        am.bzur[64] = 1849096186;
        am.bzur[65] = -459124019;
        am.bzur[66] = 15398704;
        am.bzur[67] = -1902177872;
        am.bzur[68] = -2088931877;
        am.bzur[69] = 1534008726;
        am.bzur[70] = -1330846397;
        am.bzur[71] = 1788446522;
        am.bzur[72] = 1323917164;
        am.bzur[73] = -434033870;
        am.bzur[74] = -1594620417;
        am.bzur[75] = -654192188;
        am.bzur[76] = 2084326587;
        am.bzur[77] = -1276368628;
        am.bzur[78] = -210986289;
        am.bzur[79] = -1564777080;
        am.bzur[80] = 19542954;
        am.bzur[81] = 2133008488;
        am.bzur[82] = 1777732713;
        am.bzur[83] = 125158337;
        am.bzur[84] = 1418737113;
        am.bzur[85] = -2142693867;
        am.bzur[86] = -828491379;
        am.bzur[87] = -432702195;
        am.bzur[88] = 162757617;
        am.bzur[89] = 1965013786;
        am.bzur[90] = -735963609;
        am.bzur[91] = -159654570;
        am.bzur[92] = 2089997560;
        am.bzur[93] = -687353500;
        am.bzur[94] = 899971532;
        am.bzur[95] = -837972885;
        am.bzur[96] = 1667096131;
        am.bzur[97] = -1494530132;
        am.bzur[98] = 1709181127;
        am.bzur[99] = -181683202;
    }

    public static /* synthetic */ CallSite bzut(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

