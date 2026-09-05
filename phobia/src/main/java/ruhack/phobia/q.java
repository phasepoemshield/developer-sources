/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2568
 *  net.minecraft.class_2568$class_10613
 *  net.minecraft.class_5250
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_5250;
import ruhack.phobia.dm;
import ruhack.phobia.dn;
import ruhack.phobia.f;
import ruhack.phobia.g;
import ruhack.phobia.i;
import ruhack.phobia.o;
import ruhack.phobia.pm;

public class q
extends f {
    protected static final long bm = -5460453218809064494L;
    private static long[] acef;
    public static final boolean c;
    private static long[] aceg;
    public static final boolean a;
    private static int[] abvs;
    private static int[] abvt;
    public static final int b;

    private static /* synthetic */ long acee(int n2) {
        return acef[n2] ^ aceg[n2];
    }

    private static /* synthetic */ int abvr(int n2) {
        return abvs[n2] ^ abvt[n2];
    }

    private static /* synthetic */ void acky() {
        q.abvt[100] = 600841360;
        q.abvt[101] = -790504169;
        q.abvt[102] = 1556312127;
        q.abvt[103] = 1494484003;
        q.abvt[104] = 1096317193;
        q.abvt[105] = 1163054662;
        q.abvt[106] = 779795778;
        q.abvt[107] = -538148292;
        q.abvt[108] = -1742311877;
        q.abvt[109] = -1203784136;
        q.abvt[110] = 443381059;
        q.abvt[111] = -93742105;
        q.abvt[112] = 153585223;
        q.abvt[113] = 581405552;
        q.abvt[114] = -1788862778;
        q.abvt[115] = 764605172;
        q.abvt[116] = 1531288574;
        q.abvt[117] = 415063877;
        q.abvt[118] = -1588391561;
        q.abvt[119] = 429102078;
        q.abvt[120] = -327757474;
        q.abvt[121] = 1054796827;
        q.abvt[122] = 1311750730;
        q.abvt[123] = -135769666;
        q.abvt[124] = 452455004;
        q.abvt[125] = 698962643;
        q.abvt[126] = 63143394;
        q.abvt[127] = -288882274;
        q.abvt[128] = -1618276381;
        q.abvt[129] = 1838660484;
        q.abvt[130] = -358884042;
        q.abvt[131] = 2130341260;
        q.abvt[132] = 917585692;
        q.abvt[133] = -786510486;
        q.abvt[134] = 476954738;
        q.abvt[135] = -1353969903;
        q.abvt[136] = -378214160;
        q.abvt[137] = -604818914;
        q.abvt[138] = 183241754;
        q.abvt[139] = 1427761057;
        q.abvt[140] = -624917046;
        q.abvt[141] = 1045993479;
        q.abvt[142] = 1401939061;
        q.abvt[143] = 89262644;
        q.abvt[144] = -1935400543;
        q.abvt[145] = 1463412752;
        q.abvt[146] = 840385320;
        q.abvt[147] = -1174754795;
        q.abvt[148] = 899228725;
        q.abvt[149] = -22895973;
        q.abvt[150] = 145015584;
        q.abvt[151] = 119194361;
        q.abvt[152] = -1727800936;
        q.abvt[153] = 1732024244;
        q.abvt[154] = 1035323061;
        q.abvt[155] = 603762258;
        q.abvt[156] = 1277591279;
        q.abvt[157] = -1812697463;
        q.abvt[158] = -1680712692;
        q.abvt[159] = -193709595;
        q.abvt[160] = -911091847;
        q.abvt[161] = 1780133914;
        q.abvt[162] = -1356037188;
        q.abvt[163] = 1448547226;
        q.abvt[164] = -564425264;
        q.abvt[165] = -1417787092;
        q.abvt[166] = 2023407027;
        q.abvt[167] = 183475858;
        q.abvt[168] = 10675567;
        q.abvt[169] = 710457218;
        q.abvt[170] = 2108948570;
        q.abvt[171] = -1071676034;
        q.abvt[172] = 24150132;
        q.abvt[173] = -776776113;
        q.abvt[174] = 1905360375;
        q.abvt[175] = -1301766610;
        q.abvt[176] = 717634981;
        q.abvt[177] = -613384730;
        q.abvt[178] = -1155736493;
        q.abvt[179] = -1519914392;
        q.abvt[180] = -1853853000;
        q.abvt[181] = -392533325;
        q.abvt[182] = 857195164;
        q.abvt[183] = 481821179;
        q.abvt[184] = -679868722;
        q.abvt[185] = 71638894;
        q.abvt[186] = -277618292;
        q.abvt[187] = -1058237934;
        q.abvt[188] = 1618555200;
        q.abvt[189] = -1267747188;
        q.abvt[190] = -1855923767;
        q.abvt[191] = 883662285;
        q.abvt[192] = -1771904866;
        q.abvt[193] = -1574643975;
        q.abvt[194] = -1310219121;
        q.abvt[195] = -1576256499;
        q.abvt[196] = 344919540;
        q.abvt[197] = -1981726716;
        q.abvt[198] = -62823797;
        q.abvt[199] = 1637715599;
    }

    private static /* synthetic */ void ackw() {
        q.abvs[200] = -1091010495;
        q.abvs[201] = -1170038631;
        q.abvs[202] = -1349405440;
        q.abvs[203] = 134549053;
        q.abvs[204] = -56179605;
        q.abvs[205] = -2005914178;
        q.abvs[206] = 1904936283;
        q.abvs[207] = 910477491;
        q.abvs[208] = -1655087856;
        q.abvs[209] = -1563317237;
        q.abvs[210] = 50683472;
        q.abvs[211] = -525376688;
        q.abvs[212] = -1117294883;
        q.abvs[213] = -759111365;
        q.abvs[214] = -587809670;
        q.abvs[215] = -1701251348;
        q.abvs[216] = 540503259;
        q.abvs[217] = -2024222995;
        q.abvs[218] = 1730170714;
        q.abvs[219] = -1253809265;
        q.abvs[220] = 1834379570;
        q.abvs[221] = -1061296666;
        q.abvs[222] = 1771339001;
        q.abvs[223] = 1873897504;
        q.abvs[224] = -1173041482;
        q.abvs[225] = 914117686;
        q.abvs[226] = 1130828094;
        q.abvs[227] = 430169701;
        q.abvs[228] = 587716248;
        q.abvs[229] = 1419099107;
        q.abvs[230] = -308633294;
        q.abvs[231] = -333428963;
        q.abvs[232] = 861216493;
        q.abvs[233] = 872763480;
        q.abvs[234] = 2140775194;
        q.abvs[235] = -799546116;
        q.abvs[236] = 1451803242;
        q.abvs[237] = -974923739;
        q.abvs[238] = -174477650;
        q.abvs[239] = 835486213;
        q.abvs[240] = -1902301763;
        q.abvs[241] = 1787363980;
        q.abvs[242] = -7494869;
        q.abvs[243] = -1709913579;
        q.abvs[244] = 607304695;
        q.abvs[245] = -1059228981;
        q.abvs[246] = 784112929;
        q.abvs[247] = 397764565;
        q.abvs[248] = -841277175;
        q.abvs[249] = 1568160626;
        q.abvs[250] = -685719457;
        q.abvs[251] = 1896724202;
        q.abvs[252] = 285274801;
        q.abvs[253] = -1929272260;
        q.abvs[254] = -1693178001;
        q.abvs[255] = 1553472454;
        q.abvs[256] = -894117922;
        q.abvs[257] = -749139116;
        q.abvs[258] = -1862075571;
        q.abvs[259] = -1701947992;
        q.abvs[260] = -947627002;
        q.abvs[261] = 713483728;
        q.abvs[262] = -539805298;
        q.abvs[263] = -1688885601;
        q.abvs[264] = 741519871;
        q.abvs[265] = 917810454;
        q.abvs[266] = -600705523;
        q.abvs[267] = 1395960248;
        q.abvs[268] = 137862443;
        q.abvs[269] = 1760089169;
        q.abvs[270] = -725048247;
        q.abvs[271] = -1714476069;
        q.abvs[272] = 534648490;
        q.abvs[273] = -73612296;
        q.abvs[274] = -382286698;
        q.abvs[275] = 766412060;
        q.abvs[276] = 847284390;
        q.abvs[277] = 871299686;
        q.abvs[278] = -320447262;
        q.abvs[279] = 1268634510;
        q.abvs[280] = 600566576;
        q.abvs[281] = -1831663667;
        q.abvs[282] = 99499406;
        q.abvs[283] = 1407265554;
        q.abvs[284] = -2121234521;
        q.abvs[285] = 1249624278;
        q.abvs[286] = -452458984;
        q.abvs[287] = -799423400;
        q.abvs[288] = 2145749549;
        q.abvs[289] = 287698338;
        q.abvs[290] = -255643922;
        q.abvs[291] = -1202959757;
        q.abvs[292] = 1312701243;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block53: {
            block52: {
                var6_3 = q.c;
                var5_4 /* !! */  = q.b;
                var4_5 = q.a;
                if (var6_3) {
                    throw null;
lbl6:
                    // 12 sources

                    return null;
                }
                if (var4_5 || var4_5) ** GOTO lbl6
                if (var2_2.length != q.abvu("acdd", abvr(int ), (int)190)) break block52;
                if (var4_5 || var4_5) ** GOTO lbl6
                return new i().append(new String[]{"add", "remove", "list", "clear"}).sortAlphabetically().filterPrefix(var2_2[0]).stream();
            }
            if (var4_5 || var4_5) ** GOTO lbl6
            if (var2_2.length != q.abvu("acde", abvr(int ), (int)191)) ** GOTO lbl34
            if (var4_5 || var4_5) ** GOTO lbl6
            var3_6 = var2_2[0].toLowerCase();
            if (var4_5 || var4_5) ** GOTO lbl6
            if (!var3_6.equals("add")) break block53;
            if (var4_5 || var4_5) ** GOTO lbl6
            return new i().append(pm.getAllKeyNames()).filterPrefix(var2_2[1]).stream();
        }
        if (var4_5 || var4_5) ** GOTO lbl6
        if (var3_6.equals("remove")) ** GOTO lbl32
        if (var4_5) ** GOTO lbl6
        if (var3_6.equals("del")) ** GOTO lbl32
        if (var4_5) ** GOTO lbl6
        if (!var3_6.equals("delete")) ** GOTO lbl34
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl6
lbl32:
                // 3 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                return new i().append(dn.getInstance().getMacroNames().toArray(new String[0])).filterPrefix(var2_2[1]).stream();
            }
lbl34:
            // 2 sources

            if (!var4_5 && !var4_5) ** break;
            ** continue;
            return Stream.empty();
            case 0: {
                var5_4 /* !! */  = (int)q.abvu("acdf", abvr(int ), (int)192);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 1: {
                var5_4 /* !! */  = (int)q.abvu("acdg", abvr(int ), (int)193);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl52
            }
lbl47:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)q.abvu("acdh", abvr(int ), (int)194);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl52:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)q.abvu("acdi", abvr(int ), (int)195);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl57:
            // 3 sources

            case 4: {
                do {
                    var5_4 /* !! */  = (int)q.abvu("acdj", abvr(int ), (int)196);
                } while (!var6_3);
                throw null;
            }
lbl62:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)q.abvu("acdk", abvr(int ), (int)197);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl67:
            // 3 sources

            case 6: {
                var5_4 /* !! */  = (int)q.abvu("acdl", abvr(int ), (int)198);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl72:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)q.abvu("acdm", abvr(int ), (int)199);
                if (!var6_3) ** GOTO lbl62
                throw null;
            }
            case 8: {
                var5_4 /* !! */  = (int)q.abvu("acdn", abvr(int ), (int)200);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 9: {
                var5_4 /* !! */  = (int)q.abvu("acdo", abvr(int ), (int)201);
                if (!var6_3) ** GOTO lbl47
                throw null;
            }
lbl85:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)q.abvu("acdp", abvr(int ), (int)202);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            case 11: {
                var5_4 /* !! */  = (int)q.abvu("acdq", abvr(int ), (int)203);
                if (!var6_3) ** GOTO lbl52
                throw null;
            }
lbl95:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)q.abvu("acdr", abvr(int ), (int)204);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 13: {
                var5_4 /* !! */  = (int)q.abvu("acds", abvr(int ), (int)205);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
lbl104:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)q.abvu("acdt", abvr(int ), (int)206);
                if (!var6_3) ** GOTO lbl72
                throw null;
            }
            case 15: {
                var5_4 /* !! */  = (int)q.abvu("acdu", abvr(int ), (int)207);
                if (!var6_3) ** GOTO lbl57
                throw null;
            }
lbl112:
            // 4 sources

            case 16: {
                var5_4 /* !! */  = (int)q.abvu("acdv", abvr(int ), (int)208);
                if (!var6_3) ** GOTO lbl62
                throw null;
            }
lbl116:
            // 3 sources

            case 17: {
                var5_4 /* !! */  = (int)q.abvu("acdw", abvr(int ), (int)209);
                if (!var6_3) ** GOTO lbl112
                throw null;
            }
lbl120:
            // 2 sources

            case 18: {
                var5_4 /* !! */  = (int)q.abvu("acdx", abvr(int ), (int)210);
                if (var6_3) {
                    throw null;
                }
            }
lbl124:
            // 4 sources

            case 19: {
                var5_4 /* !! */  = (int)q.abvu("acdy", abvr(int ), (int)211);
                if (!var6_3) ** GOTO lbl67
                throw null;
            }
            case 20: {
                var5_4 /* !! */  = (int)q.abvu("acdz", abvr(int ), (int)212);
                if (!var6_3) ** GOTO lbl57
                throw null;
            }
lbl132:
            // 2 sources

            case 21: {
                var5_4 /* !! */  = (int)q.abvu("acea", abvr(int ), (int)213);
                if (!var6_3) ** GOTO lbl124
                throw null;
            }
            case 22: {
                var5_4 /* !! */  = (int)q.abvu("aceb", abvr(int ), (int)214);
                if (!var6_3) ** GOTO lbl104
                throw null;
            }
lbl140:
            // 2 sources

            case 23: {
                var5_4 /* !! */  = (int)q.abvu("acec", abvr(int ), (int)215);
                if (!var6_3) ** GOTO lbl85
                throw null;
            }
            case 24: 
        }
        var5_4 /* !! */  = (int)q.abvu("aced", abvr(int ), (int)216);
        ** while (!var6_3)
lbl147:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aclb() {
        q.aceg[0] = -8634351084442880042L;
        q.aceg[1] = 6787234041950538136L;
        q.aceg[2] = -1881412262479024988L;
        q.aceg[3] = 7053666425834041371L;
        q.aceg[4] = 1563498156598412727L;
        q.aceg[5] = -3719084545780217647L;
        q.aceg[6] = -8655472510620365438L;
        q.aceg[7] = 7774207195560574005L;
        q.aceg[8] = -4246103997978140146L;
        q.aceg[9] = 8993845459685082832L;
        q.aceg[10] = -8391747816596709082L;
        q.aceg[11] = -7057870392883985470L;
        q.aceg[12] = 1950097992484995372L;
        q.aceg[13] = 1187925232859980627L;
        q.aceg[14] = 3634519111325391516L;
        q.aceg[15] = 1896495618368918590L;
        q.aceg[16] = -4996200874592629843L;
        q.aceg[17] = -5322582294929904557L;
        q.aceg[18] = -8723566460963160104L;
        q.aceg[19] = -6188141641772722724L;
        q.aceg[20] = -7976896887768948814L;
        q.aceg[21] = 5341983003830109574L;
        q.aceg[22] = 6618270796109324510L;
        q.aceg[23] = 7322924049694744794L;
        q.aceg[24] = -14638638524152271L;
        q.aceg[25] = -8034143663906390298L;
        q.aceg[26] = 909208622971887993L;
        q.aceg[27] = 3813984780545563598L;
        q.aceg[28] = -7051651452811785927L;
        q.aceg[29] = -851895159993079855L;
        q.aceg[30] = -1543779776523438842L;
        q.aceg[31] = -2594544344694226938L;
        q.aceg[32] = 5521991239206093758L;
        q.aceg[33] = 2721710492681809351L;
        q.aceg[34] = -4866970119745536641L;
        q.aceg[35] = -1233423568815752867L;
        q.aceg[36] = -1106962128760757915L;
        q.aceg[37] = -7874895328215927508L;
        q.aceg[38] = -7247392752216408645L;
        q.aceg[39] = 1434551435603101075L;
        q.aceg[40] = -6410976626987362514L;
        q.aceg[41] = -4338536024719359102L;
        q.aceg[42] = 1350516296776040558L;
        q.aceg[43] = 9114284135120442564L;
        q.aceg[44] = 2227064930093719509L;
        q.aceg[45] = 4210411493859246363L;
        q.aceg[46] = -5765623810655782126L;
        q.aceg[47] = 2200897432851649014L;
        q.aceg[48] = -970911231296891869L;
        q.aceg[49] = -8484976708591494957L;
        q.aceg[50] = -2542972395422538293L;
        q.aceg[51] = -7878157487963612909L;
        q.aceg[52] = -8600828409316953519L;
        q.aceg[53] = 2086459129116083474L;
        q.aceg[54] = 2478227120355497144L;
        q.aceg[55] = -6045562108653340337L;
        q.aceg[56] = -2402144123067847325L;
        q.aceg[57] = -6044296876207757430L;
        q.aceg[58] = 529941589946024351L;
        q.aceg[59] = 4681443430530365322L;
        q.aceg[60] = 8470865593064852121L;
        q.aceg[61] = -5542034344078908633L;
        q.aceg[62] = 6748413102986442624L;
        q.aceg[63] = -1409989881969970900L;
        q.aceg[64] = 3762362780712868765L;
        q.aceg[65] = -1615059543457547073L;
        q.aceg[66] = -2835958559946505033L;
        q.aceg[67] = 7853642339585732559L;
        q.aceg[68] = 996772491402576356L;
        q.aceg[69] = 1244275701943797466L;
        q.aceg[70] = -879526935389547031L;
        q.aceg[71] = 5159929214305148271L;
        q.aceg[72] = -5970532277882291500L;
        q.aceg[73] = 8959420589600765325L;
        q.aceg[74] = 8165655129671806127L;
        q.aceg[75] = 1031118771174054059L;
        q.aceg[76] = 3143211353003327273L;
        q.aceg[77] = -7253645019078857440L;
        q.aceg[78] = 4822474635919477657L;
        q.aceg[79] = -6159375258203653309L;
        q.aceg[80] = -7873303895177678374L;
        q.aceg[81] = 1074366959350291526L;
        q.aceg[82] = 3137289841052477351L;
        q.aceg[83] = 5774620868582128079L;
        q.aceg[84] = -8030931003053431656L;
        q.aceg[85] = -4585468446728293830L;
        q.aceg[86] = 5901822772706679479L;
        q.aceg[87] = -8706028294356501001L;
        q.aceg[88] = -5094621823546175387L;
        q.aceg[89] = 2161279597001130592L;
        q.aceg[90] = -1167840797701748022L;
        q.aceg[91] = -2520558230398306450L;
        q.aceg[92] = -6682531268757960165L;
    }

    static {
        abvs = new int[293];
        abvt = new int[293];
        q.acku();
        q.ackv();
        q.ackw();
        q.ackx();
        q.acky();
        q.ackz();
        acef = new long[93];
        aceg = new long[93];
        q.acla();
        q.aclb();
    }

    public q() {
        int n2 = b;
        super("macro", "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043c\u0430\u043a\u0440\u043e\u0441\u0430\u043c\u0438", "macros");
    }

    public static /* synthetic */ CallSite abvu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void acku() {
        q.abvs[0] = 1702997379;
        q.abvs[1] = -996932370;
        q.abvs[2] = -931988087;
        q.abvs[3] = -1312607544;
        q.abvs[4] = -684096244;
        q.abvs[5] = -1514848215;
        q.abvs[6] = 1053499567;
        q.abvs[7] = 318215102;
        q.abvs[8] = -1454801127;
        q.abvs[9] = -1433083274;
        q.abvs[10] = 2067644114;
        q.abvs[11] = -980064465;
        q.abvs[12] = 1670444890;
        q.abvs[13] = -1954567918;
        q.abvs[14] = -1449828799;
        q.abvs[15] = 1892644349;
        q.abvs[16] = 844421228;
        q.abvs[17] = -2120441531;
        q.abvs[18] = -890076662;
        q.abvs[19] = 222476020;
        q.abvs[20] = 131570757;
        q.abvs[21] = 1536318787;
        q.abvs[22] = 1453747829;
        q.abvs[23] = 1763186744;
        q.abvs[24] = -415593296;
        q.abvs[25] = -1323957154;
        q.abvs[26] = -1097087675;
        q.abvs[27] = 1068119661;
        q.abvs[28] = -418117591;
        q.abvs[29] = 1532932810;
        q.abvs[30] = -148347428;
        q.abvs[31] = -219726435;
        q.abvs[32] = 245288587;
        q.abvs[33] = -1725244477;
        q.abvs[34] = -1175050323;
        q.abvs[35] = 450979732;
        q.abvs[36] = -1407018347;
        q.abvs[37] = 363635834;
        q.abvs[38] = 1449549953;
        q.abvs[39] = -473730951;
        q.abvs[40] = -696874071;
        q.abvs[41] = -175282687;
        q.abvs[42] = 1236162485;
        q.abvs[43] = 183909306;
        q.abvs[44] = -360570021;
        q.abvs[45] = 327670082;
        q.abvs[46] = -1138164794;
        q.abvs[47] = -79278040;
        q.abvs[48] = 2024397346;
        q.abvs[49] = 1780188567;
        q.abvs[50] = 842831905;
        q.abvs[51] = -1649606928;
        q.abvs[52] = -111110871;
        q.abvs[53] = -254573372;
        q.abvs[54] = -201762559;
        q.abvs[55] = 172634669;
        q.abvs[56] = 65500411;
        q.abvs[57] = -859456288;
        q.abvs[58] = -1048589289;
        q.abvs[59] = -933666589;
        q.abvs[60] = -1428566550;
        q.abvs[61] = -326170130;
        q.abvs[62] = -1718829481;
        q.abvs[63] = -1111683997;
        q.abvs[64] = 398149154;
        q.abvs[65] = 56887347;
        q.abvs[66] = -2055595347;
        q.abvs[67] = 610387869;
        q.abvs[68] = -845519748;
        q.abvs[69] = 1276476562;
        q.abvs[70] = 1356510962;
        q.abvs[71] = -1099778658;
        q.abvs[72] = -214300715;
        q.abvs[73] = -1218282164;
        q.abvs[74] = -1261364156;
        q.abvs[75] = 1332147828;
        q.abvs[76] = 995661577;
        q.abvs[77] = -941496206;
        q.abvs[78] = 513790158;
        q.abvs[79] = -393185679;
        q.abvs[80] = 231992484;
        q.abvs[81] = -1267745647;
        q.abvs[82] = -940335274;
        q.abvs[83] = -2125854243;
        q.abvs[84] = 1389704774;
        q.abvs[85] = -1079874783;
        q.abvs[86] = 743367985;
        q.abvs[87] = 1449911062;
        q.abvs[88] = 304111357;
        q.abvs[89] = -2104019715;
        q.abvs[90] = -66653315;
        q.abvs[91] = -1215646900;
        q.abvs[92] = 542551878;
        q.abvs[93] = 581181604;
        q.abvs[94] = -525144688;
        q.abvs[95] = -604565899;
        q.abvs[96] = 2058668466;
        q.abvs[97] = -1351535583;
        q.abvs[98] = -1157771528;
        q.abvs[99] = -1967662013;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[CASE]], but top level block is 15[SWITCH]
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

    private static /* synthetic */ void ackz() {
        q.abvt[200] = -1091010481;
        q.abvt[201] = -1170038629;
        q.abvt[202] = -1349405430;
        q.abvt[203] = 134549052;
        q.abvt[204] = -56179585;
        q.abvt[205] = -2005914185;
        q.abvt[206] = 1904936275;
        q.abvt[207] = 910477502;
        q.abvt[208] = -1655087843;
        q.abvt[209] = -1563317223;
        q.abvt[210] = 50683472;
        q.abvt[211] = -525376682;
        q.abvt[212] = -1117294897;
        q.abvt[213] = -759111370;
        q.abvt[214] = -587809677;
        q.abvt[215] = -1701251348;
        q.abvt[216] = 540503242;
        q.abvt[217] = -2024222993;
        q.abvt[218] = 1730170712;
        q.abvt[219] = -1253809265;
        q.abvt[220] = 1834379569;
        q.abvt[221] = 1061296665;
        q.abvt[222] = 875621923;
        q.abvt[223] = 1873897505;
        q.abvt[224] = -1173041482;
        q.abvt[225] = 914117685;
        q.abvt[226] = 1130828093;
        q.abvt[227] = -430169702;
        q.abvt[228] = -1234108128;
        q.abvt[229] = -1419099108;
        q.abvt[230] = -1711159985;
        q.abvt[231] = 333428962;
        q.abvt[232] = 724260137;
        q.abvt[233] = -872763481;
        q.abvt[234] = -439917588;
        q.abvt[235] = -799546115;
        q.abvt[236] = 1518807047;
        q.abvt[237] = 974923738;
        q.abvt[238] = -418172822;
        q.abvt[239] = -835486214;
        q.abvt[240] = 1071166086;
        q.abvt[241] = -1787363981;
        q.abvt[242] = 1859947323;
        q.abvt[243] = -1709913580;
        q.abvt[244] = 1841527841;
        q.abvt[245] = 1059228980;
        q.abvt[246] = 569934997;
        q.abvt[247] = -397764566;
        q.abvt[248] = 816960524;
        q.abvt[249] = -1568160627;
        q.abvt[250] = -996145873;
        q.abvt[251] = -1896724203;
        q.abvt[252] = -1078784743;
        q.abvt[253] = -1929272259;
        q.abvt[254] = 1341570504;
        q.abvt[255] = -1553472455;
        q.abvt[256] = 1387305978;
        q.abvt[257] = -749139112;
        q.abvt[258] = -1862075577;
        q.abvt[259] = -1701947988;
        q.abvt[260] = -947626994;
        q.abvt[261] = 713483730;
        q.abvt[262] = -539805297;
        q.abvt[263] = -1688885605;
        q.abvt[264] = 741519865;
        q.abvt[265] = 917810460;
        q.abvt[266] = -600705508;
        q.abvt[267] = 1395960255;
        q.abvt[268] = 137862445;
        q.abvt[269] = 1760089169;
        q.abvt[270] = -725048256;
        q.abvt[271] = -1714476086;
        q.abvt[272] = 534648487;
        q.abvt[273] = -73612299;
        q.abvt[274] = -382286693;
        q.abvt[275] = -766412061;
        q.abvt[276] = 2112552389;
        q.abvt[277] = -871299687;
        q.abvt[278] = -1258121256;
        q.abvt[279] = -1268634511;
        q.abvt[280] = 1294557987;
        q.abvt[281] = 1831663666;
        q.abvt[282] = 1637374044;
        q.abvt[283] = 1407265554;
        q.abvt[284] = -2121234525;
        q.abvt[285] = 1249624286;
        q.abvt[286] = -452458977;
        q.abvt[287] = -799423407;
        q.abvt[288] = 2145749545;
        q.abvt[289] = 287698342;
        q.abvt[290] = -255643922;
        q.abvt[291] = -1202959759;
        q.abvt[292] = 1312701243;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_5250 lambda$execute$1(g var0, dm var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = q.bm - q.abvu("acfh", acee(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == q.abvu("acfi", abvr(int ), (int)227)) break;
            v0 /* !! */  = (long)q.abvu("acfj", abvr(int ), (int)228);
        }
        var10_2 = q.c;
        v1 /* !! */  = q.bm;
        if (true) ** GOTO lbl11
        block63: while (true) {
            v1 /* !! */  = (long)(q.abvu("acfl", acee(int ), (int)18) - q.abvu("acfk", acee(int ), (int)17));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1790474773: {
                    continue block63;
                }
                case 1816089554: {
                    break block63;
                }
            }
            break;
        }
        var9_3 = q.b;
        v2 /* !! */  = q.bm;
        if (true) ** GOTO lbl21
        block64: while (true) {
            v2 /* !! */  = (long)(q.abvu("acfn", acee(int ), (int)20) - q.abvu("acfm", acee(int ), (int)19));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 600247543: {
                    continue block64;
                }
                case 1816089554: {
                    break block64;
                }
            }
            break;
        }
        var8_4 = q.a;
        if (var10_2) {
            throw null;
lbl29:
            // 8 sources

            return null;
        }
        if (var8_4 || var8_4) ** GOTO lbl29
        v3 /* !! */  = q.bm;
        if (true) ** GOTO lbl36
        block66: while (true) {
            v3 /* !! */  = (long)(q.abvu("acfp", acee(int ), (int)22) - q.abvu("acfo", acee(int ), (int)21));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1466478194: {
                    continue block66;
                }
                case 1816089554: {
                    break block66;
                }
            }
            break;
        }
        var2_5 = var1_1.name();
        if (var8_4 || var8_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = q.bm - q.abvu("acfq", acee(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == q.abvu("acfr", abvr(int ), (int)229)) break;
            v4 /* !! */  = (long)q.abvu("acfs", abvr(int ), (int)230);
        }
        v5 = var1_1.key();
        v6 /* !! */  = q.bm;
        if (true) ** GOTO lbl53
        block68: while (true) {
            v6 /* !! */  = (long)(v7 - q.abvu("acft", acee(int ), (int)24));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2032741442: {
                    v7 = q.abvu("acfu", acee(int ), (int)25);
                    continue block68;
                }
                case -1377607247: {
                    v7 = q.abvu("acfv", acee(int ), (int)26);
                    continue block68;
                }
                case 881864767: {
                    v7 = q.abvu("acfw", acee(int ), (int)27);
                    continue block68;
                }
                case 1816089554: {
                    break block68;
                }
            }
            break;
        }
        v8 = pm.getKeyName(v5);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = q.bm - q.abvu("acfx", acee(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == q.abvu("acfy", abvr(int ), (int)231)) break;
            v9 /* !! */  = (long)q.abvu("acfz", abvr(int ), (int)232);
        }
        var3_6 = v8.toLowerCase();
        if (var8_4 || var8_4) ** GOTO lbl29
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = q.bm - q.abvu("acga", acee(int ), (int)29)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == q.abvu("acgb", abvr(int ), (int)233)) break;
            v10 /* !! */  = (long)q.abvu("acgc", abvr(int ), (int)234);
        }
        var4_7 = var1_1.message();
        if (var8_4 || var8_4) ** GOTO lbl29
        v11 /* !! */  = q.bm;
        if (true) ** GOTO lbl84
        block71: while (true) {
            v11 /* !! */  = (long)(v12 - q.abvu("acgd", acee(int ), (int)30));
lbl84:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1679561216: {
                    v12 = q.abvu("acge", acee(int ), (int)31);
                    continue block71;
                }
                case 248341743: {
                    v12 = q.abvu("acgf", acee(int ), (int)32);
                    continue block71;
                }
                case 1816089554: {
                    break block71;
                }
            }
            break;
        }
        v13 = "  \u00a7e\u25cf \u00a7f" + var2_5;
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = q.bm - q.abvu("acgg", acee(int ), (int)33)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == q.abvu("acgh", abvr(int ), (int)235)) break;
            v14 /* !! */  = (long)q.abvu("acgi", abvr(int ), (int)236);
        }
        v15 = class_2561.method_43470((String)v13);
        v16 /* !! */  = q.bm;
        if (true) ** GOTO lbl104
        block73: while (true) {
            v16 /* !! */  = (long)(v17 - q.abvu("acgj", acee(int ), (int)34));
lbl104:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1997233471: {
                    v17 = q.abvu("acgk", acee(int ), (int)35);
                    continue block73;
                }
                case -1763737383: {
                    v17 = q.abvu("acgl", acee(int ), (int)36);
                    continue block73;
                }
                case 1816089554: {
                    break block73;
                }
            }
            break;
        }
        v18 = " \u00a78[\u00a77" + var3_6 + "\u00a78]";
        v19 /* !! */  = q.bm;
        if (true) ** GOTO lbl118
        block74: while (true) {
            v19 /* !! */  = (long)(v20 - q.abvu("acgm", acee(int ), (int)37));
lbl118:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case 0xBAAACAB: {
                    v20 = q.abvu("acgn", acee(int ), (int)38);
                    continue block74;
                }
                case 889647398: {
                    v20 = q.abvu("acgo", acee(int ), (int)39);
                    continue block74;
                }
                case 1816089554: {
                    break block74;
                }
            }
            break;
        }
        v21 = class_2561.method_43470((String)v18);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_5 = q.bm - q.abvu("acgp", acee(int ), (int)40)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == q.abvu("acgq", abvr(int ), (int)237)) break;
            v22 /* !! */  = (long)q.abvu("acgr", abvr(int ), (int)238);
        }
        v23 = v15.method_10852((class_2561)v21);
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_6 = q.bm - q.abvu("acgs", acee(int ), (int)41)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == q.abvu("acgt", abvr(int ), (int)239)) break;
            v24 /* !! */  = (long)q.abvu("acgu", abvr(int ), (int)240);
        }
        v25 = " \u00a78-> \u00a77" + var4_7;
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_7 = q.bm - q.abvu("acgv", acee(int ), (int)42)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == q.abvu("acgw", abvr(int ), (int)241)) break;
            v26 /* !! */  = (long)q.abvu("acgx", abvr(int ), (int)242);
        }
        v27 = class_2561.method_43470((String)v25);
        while (true) {
            if ((v28 /* !! */  = (cfr_temp_8 = q.bm - q.abvu("acgy", acee(int ), (int)43)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v28 /* !! */  == q.abvu("acgz", abvr(int ), (int)243)) break;
            v28 /* !! */  = (long)q.abvu("acha", abvr(int ), (int)244);
        }
        var5_8 = v23.method_10852((class_2561)v27);
        if (var8_4 || var8_4) ** GOTO lbl29
        v29 /* !! */  = q.bm;
        if (true) ** GOTO lbl157
        block79: while (true) {
            v29 /* !! */  = (long)(q.abvu("achc", acee(int ), (int)45) - q.abvu("achb", acee(int ), (int)44));
lbl157:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case -1764577350: {
                    continue block79;
                }
                case 1816089554: {
                    break block79;
                }
            }
            break;
        }
        v30 = "\u00a77\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441 \u00a7f" + var2_5;
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_9 = q.bm - q.abvu("achd", acee(int ), (int)46)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == q.abvu("ache", abvr(int ), (int)245)) break;
            v31 /* !! */  = (long)q.abvu("achf", abvr(int ), (int)246);
        }
        var6_9 = class_2561.method_43470((String)v30);
        if (var8_4 || var8_4) ** GOTO lbl29
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_10 = q.bm - q.abvu("achg", acee(int ), (int)47)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == q.abvu("achh", abvr(int ), (int)247)) break;
            v32 /* !! */  = (long)q.abvu("achi", abvr(int ), (int)248);
        }
        v33 = var0.getPrefix();
        v34 /* !! */  = q.bm;
        if (true) ** GOTO lbl180
        block82: while (true) {
            v34 /* !! */  = (long)(q.abvu("achk", acee(int ), (int)49) - q.abvu("achj", acee(int ), (int)48));
lbl180:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case 1816089554: {
                    break block82;
                }
                case 2108938755: {
                    continue block82;
                }
            }
            break;
        }
        var7_10 = v33 + "macro remove " + var2_5;
        if (var8_4 || var8_4) ** GOTO lbl29
        v35 /* !! */  = q.bm;
        if (true) ** GOTO lbl191
        block83: while (true) {
            v35 /* !! */  = (long)(v36 - q.abvu("achl", acee(int ), (int)50));
lbl191:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -321279811: {
                    v36 = q.abvu("achm", acee(int ), (int)51);
                    continue block83;
                }
                case 805921655: {
                    v36 = q.abvu("achn", acee(int ), (int)52);
                    continue block83;
                }
                case 1816089554: {
                    break block83;
                }
            }
            break;
        }
        v37 = var5_8.method_10866();
        while (true) {
            if ((v38 /* !! */  = (cfr_temp_11 = q.bm - q.abvu("acho", acee(int ), (int)53)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v38 /* !! */  == q.abvu("achp", abvr(int ), (int)249)) break;
            v38 /* !! */  = (long)q.abvu("achq", abvr(int ), (int)250);
        }
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_12 = q.bm - q.abvu("achr", acee(int ), (int)54)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == q.abvu("achs", abvr(int ), (int)251)) break;
            v39 /* !! */  = (long)q.abvu("acht", abvr(int ), (int)252);
        }
        v40 = new class_2568.class_10613((class_2561)var6_9);
        v41 /* !! */  = q.bm;
        if (true) ** GOTO lbl216
        block86: while (true) {
            v41 /* !! */  = (long)(v42 - q.abvu("achu", acee(int ), (int)55));
lbl216:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case -1310111584: {
                    v42 = q.abvu("achv", acee(int ), (int)56);
                    continue block86;
                }
                case 1816089554: {
                    break block86;
                }
                case 2036630541: {
                    v42 = q.abvu("achw", acee(int ), (int)57);
                    continue block86;
                }
            }
            break;
        }
        v43 = v37.method_10949((class_2568)v40);
        while (true) {
            if ((v44 /* !! */  = (cfr_temp_13 = q.bm - q.abvu("achx", acee(int ), (int)58)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v44 /* !! */  == q.abvu("achy", abvr(int ), (int)253)) break;
            v44 /* !! */  = (long)q.abvu("achz", abvr(int ), (int)254);
        }
        v45 /* !! */  = q.bm;
        if (true) ** GOTO lbl235
        block88: while (true) {
            v45 /* !! */  = (long)(v46 - q.abvu("acia", acee(int ), (int)59));
lbl235:
            // 2 sources

            switch ((int)v45 /* !! */ ) {
                case 488577273: {
                    v46 = q.abvu("acib", acee(int ), (int)60);
                    continue block88;
                }
                case 1590380949: {
                    v46 = q.abvu("acic", acee(int ), (int)61);
                    continue block88;
                }
                case 1610445950: {
                    v46 = q.abvu("acid", acee(int ), (int)62);
                    continue block88;
                }
                case 1816089554: {
                    break block88;
                }
            }
            break;
        }
        v47 = new class_2558.class_10609(var7_10);
        while (true) {
            if ((v48 /* !! */  = (cfr_temp_14 = q.bm - q.abvu("acie", acee(int ), (int)63)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v48 /* !! */  == q.abvu("acif", abvr(int ), (int)255)) break;
            v48 /* !! */  = (long)q.abvu("acig", abvr(int ), (int)256);
        }
        v49 = v43.method_10958((class_2558)v47);
        v50 /* !! */  = q.bm;
        if (true) ** GOTO lbl258
        block90: while (true) {
            v50 /* !! */  = (long)(v51 - q.abvu("acih", acee(int ), (int)64));
lbl258:
            // 2 sources

            switch ((int)v50 /* !! */ ) {
                case -569364303: {
                    v51 = q.abvu("acii", acee(int ), (int)65);
                    continue block90;
                }
                case 153554935: {
                    v51 = q.abvu("acij", acee(int ), (int)66);
                    continue block90;
                }
                case 1816089554: {
                    break block90;
                }
            }
            break;
        }
        var5_8.method_10862(v49);
        ** while (var8_4 || var8_4)
lbl270:
        // 1 sources

        return var5_8;
    }

    private static /* synthetic */ void ackv() {
        q.abvs[100] = 600841388;
        q.abvs[101] = -790504181;
        q.abvs[102] = 1556312065;
        q.abvs[103] = 1494484054;
        q.abvs[104] = 1096317282;
        q.abvs[105] = 1163054610;
        q.abvs[106] = 779795833;
        q.abvs[107] = -538148289;
        q.abvs[108] = -1742311904;
        q.abvs[109] = -1203784178;
        q.abvs[110] = 443381096;
        q.abvs[111] = -93742226;
        q.abvs[112] = 153585220;
        q.abvs[113] = 581405456;
        q.abvs[114] = -1788862895;
        q.abvs[115] = 764605178;
        q.abvs[116] = 1531288537;
        q.abvs[117] = 415064008;
        q.abvs[118] = -1588391578;
        q.abvs[119] = 429101962;
        q.abvs[120] = -327757447;
        q.abvs[121] = 1054796914;
        q.abvs[122] = 1311750659;
        q.abvs[123] = -135769678;
        q.abvs[124] = 452454912;
        q.abvs[125] = 698962588;
        q.abvs[126] = 63143301;
        q.abvs[127] = -288882295;
        q.abvs[128] = -1618276454;
        q.abvs[129] = 1838660494;
        q.abvs[130] = -358883911;
        q.abvs[131] = 2130341151;
        q.abvs[132] = 917585736;
        q.abvs[133] = -786510532;
        q.abvs[134] = 476954735;
        q.abvs[135] = -1353969830;
        q.abvs[136] = -378214165;
        q.abvs[137] = -604818868;
        q.abvs[138] = 183241826;
        q.abvs[139] = 1427761147;
        q.abvs[140] = -624917034;
        q.abvs[141] = 1045993475;
        q.abvs[142] = 1401939063;
        q.abvs[143] = 89262606;
        q.abvs[144] = -1935400539;
        q.abvs[145] = 1463412918;
        q.abvs[146] = 840385396;
        q.abvs[147] = -1174754760;
        q.abvs[148] = 899228838;
        q.abvs[149] = -22896116;
        q.abvs[150] = 145015655;
        q.abvs[151] = 119194271;
        q.abvs[152] = -1727800850;
        q.abvs[153] = 1732024243;
        q.abvs[154] = 1035323014;
        q.abvs[155] = 603762419;
        q.abvs[156] = 1277591200;
        q.abvs[157] = -1812697581;
        q.abvs[158] = -1680712600;
        q.abvs[159] = -193709673;
        q.abvs[160] = -911091947;
        q.abvs[161] = 1780134079;
        q.abvs[162] = -1356037334;
        q.abvs[163] = 1448547243;
        q.abvs[164] = -564425359;
        q.abvs[165] = -1417787094;
        q.abvs[166] = 2023407070;
        q.abvs[167] = 183475962;
        q.abvs[168] = 10675685;
        q.abvs[169] = 710457104;
        q.abvs[170] = 2108948720;
        q.abvs[171] = -1071676134;
        q.abvs[172] = 24150097;
        q.abvs[173] = -776776068;
        q.abvs[174] = 1905360225;
        q.abvs[175] = -1301766466;
        q.abvs[176] = 717634816;
        q.abvs[177] = -613384813;
        q.abvs[178] = -1155736493;
        q.abvs[179] = -1519914247;
        q.abvs[180] = -1853853130;
        q.abvs[181] = -392533250;
        q.abvs[182] = 857195219;
        q.abvs[183] = 481821155;
        q.abvs[184] = -679868763;
        q.abvs[185] = 71639010;
        q.abvs[186] = -277618264;
        q.abvs[187] = -1058237765;
        q.abvs[188] = 1618555215;
        q.abvs[189] = -1267747173;
        q.abvs[190] = -1855923768;
        q.abvs[191] = 883662287;
        q.abvs[192] = -1771904880;
        q.abvs[193] = -1574643986;
        q.abvs[194] = -1310219107;
        q.abvs[195] = -1576256483;
        q.abvs[196] = 344919521;
        q.abvs[197] = -1981726710;
        q.abvs[198] = -62823783;
        q.abvs[199] = 1637715598;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> getLongDesc() {
        Object object = bm;
        block14: while (true) {
            switch ((int)object) {
                case 1816089554: {
                    break block14;
                }
                case 2028520295: {
                    object = q.abvu("acet", acee(int ), (int)8) - q.abvu("aces", acee(int ), (int)7);
                    continue block14;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = bm;
        block15: while (true) {
            switch ((int)object2) {
                case -435096128: {
                    object2 = q.abvu("acev", acee(int ), (int)10) - q.abvu("aceu", acee(int ), (int)9);
                    continue block15;
                }
                case 1816089554: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = bm;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object3 = callSite - q.abvu("acew", acee(int ), (int)11);
            }
            switch ((int)object3) {
                case -1231961934: {
                    callSite = q.abvu("acex", acee(int ), (int)12);
                    continue block16;
                }
                case 1408821958: {
                    callSite = q.abvu("acey", acee(int ), (int)13);
                    continue block16;
                }
                case 1816089554: {
                    break block16;
                }
                case 2122261742: {
                    callSite = q.abvu("acez", acee(int ), (int)14);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        String[] stringArray = new String[]{"\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043c\u0430\u043a\u0440\u043e\u0441\u0430\u043c\u0438", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:", "> macro add <key> <name> <message> - \u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441", "> macro remove <name> - \u0423\u0434\u0430\u043b\u0438\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441", "> macro list - \u041f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432", "> macro clear - \u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0432\u0441\u0435 \u043c\u0430\u043a\u0440\u043e\u0441\u044b"};
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = bm - q.abvu("acfa", acee(int ), (int)15)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == q.abvu("acfb", abvr(int ), (int)221)) {
                return Arrays.asList(stringArray);
            }
            object4 = q.abvu("acfc", abvr(int ), (int)222);
        }
    }

    private static /* synthetic */ void acla() {
        q.acef[0] = -3465796530969518310L;
        q.acef[1] = -1927402536897694837L;
        q.acef[2] = -3542136065083684808L;
        q.acef[3] = 6257888672932167775L;
        q.acef[4] = 914766721139802662L;
        q.acef[5] = -4588076905848695033L;
        q.acef[6] = -8757142858281725614L;
        q.acef[7] = -7249565698737958817L;
        q.acef[8] = -8393605086932848306L;
        q.acef[9] = -2743390668623566490L;
        q.acef[10] = 6601615724823746882L;
        q.acef[11] = -1826661251413264734L;
        q.acef[12] = 7341478891639892153L;
        q.acef[13] = 3439392236179828099L;
        q.acef[14] = 2740513935483147472L;
        q.acef[15] = 8528477233150127726L;
        q.acef[16] = -916055836043330699L;
        q.acef[17] = -5096826318856977949L;
        q.acef[18] = -1872408873525043824L;
        q.acef[19] = -1238415191813589636L;
        q.acef[20] = -1652759793599425431L;
        q.acef[21] = -8526083186141574557L;
        q.acef[22] = 938156290228956857L;
        q.acef[23] = 7118427871211528595L;
        q.acef[24] = 8263611636425223233L;
        q.acef[25] = -6691307101092512439L;
        q.acef[26] = -8375861213994887364L;
        q.acef[27] = 4922111806402810681L;
        q.acef[28] = -523127510372744958L;
        q.acef[29] = -281785659810998603L;
        q.acef[30] = 4320644651420328262L;
        q.acef[31] = 5156640328178694731L;
        q.acef[32] = -8164545933663149188L;
        q.acef[33] = -4638149495950486410L;
        q.acef[34] = -6078339045653283104L;
        q.acef[35] = -7476904459541497321L;
        q.acef[36] = -2485177658958197575L;
        q.acef[37] = -8918632967126416767L;
        q.acef[38] = -4153963238026554852L;
        q.acef[39] = 2688713355694288465L;
        q.acef[40] = -7035592288066476925L;
        q.acef[41] = -6052713410912696872L;
        q.acef[42] = 163916624194183345L;
        q.acef[43] = -921586314861740108L;
        q.acef[44] = 8205999381835270942L;
        q.acef[45] = 4577337044651531943L;
        q.acef[46] = 8008290208018286614L;
        q.acef[47] = -6120527033351023185L;
        q.acef[48] = 2477957211060431803L;
        q.acef[49] = 8934570214093890661L;
        q.acef[50] = 566925850516198908L;
        q.acef[51] = 5363403695128272346L;
        q.acef[52] = -310484194709721826L;
        q.acef[53] = 3665194951312722524L;
        q.acef[54] = 8082594871924659594L;
        q.acef[55] = -7122581147506789573L;
        q.acef[56] = -1867124714794597450L;
        q.acef[57] = 7734736939614728731L;
        q.acef[58] = -7276086647263148672L;
        q.acef[59] = 6803328198363274483L;
        q.acef[60] = -1287619078055468134L;
        q.acef[61] = 7381809566930248299L;
        q.acef[62] = -1058996232513309679L;
        q.acef[63] = -3847370866187043996L;
        q.acef[64] = -6903900520024418566L;
        q.acef[65] = -6988830432253142521L;
        q.acef[66] = 736186897598722486L;
        q.acef[67] = -1088642110000670567L;
        q.acef[68] = -921245207848371345L;
        q.acef[69] = -7087281816410504709L;
        q.acef[70] = -1810364635366417573L;
        q.acef[71] = 4741039753697101404L;
        q.acef[72] = -6981203223953907542L;
        q.acef[73] = -5190777573205822351L;
        q.acef[74] = -4857192201267310516L;
        q.acef[75] = 788270635090620709L;
        q.acef[76] = -7723035560256146067L;
        q.acef[77] = -7024004401833811692L;
        q.acef[78] = 6069990662370203240L;
        q.acef[79] = -6986204748690576264L;
        q.acef[80] = -963820765739931435L;
        q.acef[81] = 881064594205761589L;
        q.acef[82] = 2030480898891747398L;
        q.acef[83] = 4880683605296608040L;
        q.acef[84] = 8456898342685479422L;
        q.acef[85] = 2381184111095417988L;
        q.acef[86] = -8407360421463272223L;
        q.acef[87] = -8901953627082781601L;
        q.acef[88] = 4988627615285948420L;
        q.acef[89] = -2353151610704140543L;
        q.acef[90] = -5544742942161983425L;
        q.acef[91] = -3299658322297747037L;
        q.acef[92] = 6818014964075601467L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String getShortDesc() {
        v0 /* !! */  = q.bm;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(q.abvu("acei", acee(int ), (int)1) - q.abvu("aceh", acee(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 980380213: {
                    continue block19;
                }
                case 1816089554: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = q.c;
        v1 /* !! */  = q.bm;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - q.abvu("acej", acee(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1721150084: {
                    v2 = q.abvu("acek", acee(int ), (int)3);
                    continue block20;
                }
                case -1054607464: {
                    v2 = q.abvu("acel", acee(int ), (int)4);
                    continue block20;
                }
                case 1816089554: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = q.b;
        v3 /* !! */  = q.bm;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(q.abvu("acen", acee(int ), (int)6) - q.abvu("acem", acee(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -315790887: {
                    continue block21;
                }
                case 1816089554: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = q.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block13 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043c\u0430\u043a\u0440\u043e\u0441\u0430\u043c\u0438";
            }
lbl44:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)q.abvu("aceo", abvr(int ), (int)217);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)q.abvu("acep", abvr(int ), (int)218);
                    if (!var3_1) break block13;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)q.abvu("aceq", abvr(int ), (int)219);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)q.abvu("acer", abvr(int ), (int)220);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$execute$0(List var1_1) {
        v0 /* !! */  = q.bm;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(v1 - q.abvu("acjc", acee(int ), (int)67));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1165274001: {
                    v1 = q.abvu("acjd", acee(int ), (int)68);
                    continue block50;
                }
                case 297529760: {
                    v1 = q.abvu("acje", acee(int ), (int)69);
                    continue block50;
                }
                case 1816089554: {
                    break block50;
                }
            }
            break;
        }
        var4_2 = q.c;
        v2 /* !! */  = q.bm;
        if (true) ** GOTO lbl19
        block51: while (true) {
            v2 /* !! */  = (long)(q.abvu("acjg", acee(int ), (int)71) - q.abvu("acjf", acee(int ), (int)70));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1460068835: {
                    continue block51;
                }
                case 1816089554: {
                    break block51;
                }
            }
            break;
        }
        var3_3 /* !! */  = q.b;
        v3 /* !! */  = q.bm;
        if (true) ** GOTO lbl29
        block52: while (true) {
            v3 /* !! */  = (long)(v4 - q.abvu("acjh", acee(int ), (int)72));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -831846015: {
                    v4 = q.abvu("acji", acee(int ), (int)73);
                    continue block52;
                }
                case 1193746670: {
                    v4 = q.abvu("acjj", acee(int ), (int)74);
                    continue block52;
                }
                case 1816089554: {
                    break block52;
                }
            }
            break;
        }
        var2_4 = q.a;
        if (var4_2) {
            throw null;
lbl41:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v5 /* !! */  = q.bm;
        if (true) ** GOTO lbl48
        block54: while (true) {
            v5 /* !! */  = (long)(v6 - q.abvu("acjk", acee(int ), (int)75));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -792192631: {
                    v6 = q.abvu("acjl", acee(int ), (int)76);
                    continue block54;
                }
                case 862307721: {
                    v6 = q.abvu("acjm", acee(int ), (int)77);
                    continue block54;
                }
                case 1816089554: {
                    break block54;
                }
            }
            break;
        }
        v7 = o.getLine();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = q.bm - q.abvu("acjn", acee(int ), (int)78)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == q.abvu("acjo", abvr(int ), (int)275)) break;
            v8 /* !! */  = (long)q.abvu("acjp", abvr(int ), (int)276);
        }
        v9 = class_2561.method_43470((String)v7);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = q.bm - q.abvu("acjq", acee(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == q.abvu("acjr", abvr(int ), (int)277)) break;
            v10 /* !! */  = (long)q.abvu("acjs", abvr(int ), (int)278);
        }
        this.logDirectRaw(v9);
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = q.bm - q.abvu("acjt", acee(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == q.abvu("acju", abvr(int ), (int)279)) break;
                    v11 /* !! */  = (long)q.abvu("acjv", abvr(int ), (int)280);
                }
                v12 = var1_1.size();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = q.bm - q.abvu("acjw", acee(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == q.abvu("acjx", abvr(int ), (int)281)) break;
                    v13 /* !! */  = (long)q.abvu("acjy", abvr(int ), (int)282);
                }
                v14 = "\u00a77\u0421\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432: \u00a7f" + v12;
                v15 /* !! */  = q.bm;
                if (true) ** GOTO lbl91
                block59: while (true) {
                    v15 /* !! */  = (long)(q.abvu("acka", acee(int ), (int)83) - q.abvu("acjz", acee(int ), (int)82));
lbl91:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 1816089554: {
                            break block59;
                        }
                        case 2104607998: {
                            continue block59;
                        }
                    }
                    break;
                }
                this.logDirect(v14);
                if (var2_4 || var2_4) ** GOTO lbl41
                v16 /* !! */  = q.bm;
                if (true) ** GOTO lbl102
                block60: while (true) {
                    v16 /* !! */  = (long)(v17 - q.abvu("ackb", acee(int ), (int)84));
lbl102:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 212091665: {
                            v17 = q.abvu("ackc", acee(int ), (int)85);
                            continue block60;
                        }
                        case 732493422: {
                            v17 = q.abvu("ackd", acee(int ), (int)86);
                            continue block60;
                        }
                        case 1816089554: {
                            break block60;
                        }
                        case 1845003676: {
                            v17 = q.abvu("acke", acee(int ), (int)87);
                            continue block60;
                        }
                    }
                    break;
                }
                v18 = o.getLine();
                v19 /* !! */  = q.bm;
                if (true) ** GOTO lbl119
                block61: while (true) {
                    v19 /* !! */  = (long)(v20 - q.abvu("ackf", acee(int ), (int)88));
lbl119:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 475023345: {
                            v20 = q.abvu("ackg", acee(int ), (int)89);
                            continue block61;
                        }
                        case 631003171: {
                            v20 = q.abvu("ackh", acee(int ), (int)90);
                            continue block61;
                        }
                        case 1816089554: {
                            break block61;
                        }
                    }
                    break;
                }
                v21 = class_2561.method_43470((String)v18);
                v22 /* !! */  = q.bm;
                if (true) ** GOTO lbl133
                block62: while (true) {
                    v22 /* !! */  = (long)(q.abvu("ackj", acee(int ), (int)92) - q.abvu("acki", acee(int ), (int)91));
lbl133:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1007816853: {
                            continue block62;
                        }
                        case 1816089554: {
                            break block62;
                        }
                    }
                    break;
                }
                this.logDirectRaw(v21);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl142:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)q.abvu("ackk", abvr(int ), (int)283);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 1: {
                var3_3 /* !! */  = (int)q.abvu("ackl", abvr(int ), (int)284);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl152:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)q.abvu("ackm", abvr(int ), (int)285);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl157:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)q.abvu("ackn", abvr(int ), (int)286);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)q.abvu("acko", abvr(int ), (int)287);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
lbl165:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)q.abvu("ackp", abvr(int ), (int)288);
                if (var4_2) {
                    throw null;
                }
            }
lbl169:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)q.abvu("ackq", abvr(int ), (int)289);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
lbl173:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)q.abvu("ackr", abvr(int ), (int)290);
                if (!var4_2) ** GOTO lbl142
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)q.abvu("acks", abvr(int ), (int)291);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
            case 9: 
        }
        do {
            var3_3 /* !! */  = (int)q.abvu("ackt", abvr(int ), (int)292);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void ackx() {
        q.abvt[0] = 1702997377;
        q.abvt[1] = -996932369;
        q.abvt[2] = -931988088;
        q.abvt[3] = 1312607543;
        q.abvt[4] = -684096244;
        q.abvt[5] = -1514848216;
        q.abvt[6] = 1053499565;
        q.abvt[7] = 318215101;
        q.abvt[8] = -1454801123;
        q.abvt[9] = -1433083277;
        q.abvt[10] = 2067644118;
        q.abvt[11] = 980064464;
        q.abvt[12] = 1670444889;
        q.abvt[13] = -1954567919;
        q.abvt[14] = -1449828800;
        q.abvt[15] = 1892644351;
        q.abvt[16] = 844421228;
        q.abvt[17] = -2120441532;
        q.abvt[18] = -890076661;
        q.abvt[19] = 222475950;
        q.abvt[20] = 131570769;
        q.abvt[21] = 1536318790;
        q.abvt[22] = 1453747738;
        q.abvt[23] = 1763186730;
        q.abvt[24] = -415593265;
        q.abvt[25] = -1323957123;
        q.abvt[26] = -1097087683;
        q.abvt[27] = 1068119804;
        q.abvt[28] = -418117562;
        q.abvt[29] = 1532932845;
        q.abvt[30] = -148347502;
        q.abvt[31] = -219726462;
        q.abvt[32] = 245288619;
        q.abvt[33] = -1725244434;
        q.abvt[34] = -1175050457;
        q.abvt[35] = 450979770;
        q.abvt[36] = -1407018288;
        q.abvt[37] = 363635742;
        q.abvt[38] = 1449550052;
        q.abvt[39] = -473730975;
        q.abvt[40] = -696874008;
        q.abvt[41] = -175282536;
        q.abvt[42] = 1236162472;
        q.abvt[43] = 183909180;
        q.abvt[44] = -360570038;
        q.abvt[45] = 327670117;
        q.abvt[46] = -1138164815;
        q.abvt[47] = -79277900;
        q.abvt[48] = 2024397429;
        q.abvt[49] = 1780188466;
        q.abvt[50] = 842831936;
        q.abvt[51] = -1649607000;
        q.abvt[52] = -111110828;
        q.abvt[53] = -254573501;
        q.abvt[54] = -201762436;
        q.abvt[55] = 172634751;
        q.abvt[56] = 65500354;
        q.abvt[57] = -859456345;
        q.abvt[58] = -1048589162;
        q.abvt[59] = -933666693;
        q.abvt[60] = -1428566705;
        q.abvt[61] = -326170195;
        q.abvt[62] = -1718829523;
        q.abvt[63] = -1111684011;
        q.abvt[64] = 398149188;
        q.abvt[65] = 56887446;
        q.abvt[66] = -2055595276;
        q.abvt[67] = 610387717;
        q.abvt[68] = -845519644;
        q.abvt[69] = 1276476555;
        q.abvt[70] = 1356510866;
        q.abvt[71] = -1099778592;
        q.abvt[72] = -214300684;
        q.abvt[73] = -1218282031;
        q.abvt[74] = -1261364023;
        q.abvt[75] = 1332147944;
        q.abvt[76] = 995661693;
        q.abvt[77] = -941496262;
        q.abvt[78] = 513790169;
        q.abvt[79] = -393185697;
        q.abvt[80] = 231992528;
        q.abvt[81] = -1267745570;
        q.abvt[82] = -940335322;
        q.abvt[83] = -2125854307;
        q.abvt[84] = 1389704907;
        q.abvt[85] = -1079874805;
        q.abvt[86] = 743367960;
        q.abvt[87] = 1449911075;
        q.abvt[88] = 304111193;
        q.abvt[89] = -2104019847;
        q.abvt[90] = -66653374;
        q.abvt[91] = -1215646737;
        q.abvt[92] = 542551870;
        q.abvt[93] = 581181634;
        q.abvt[94] = -525144634;
        q.abvt[95] = -604565999;
        q.abvt[96] = 2058668308;
        q.abvt[97] = -1351535600;
        q.abvt[98] = -1157771530;
        q.abvt[99] = -1967661955;
    }
}

