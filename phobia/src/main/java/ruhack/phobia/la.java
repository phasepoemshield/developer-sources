/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  org.joml.Matrix4f
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.joml.Matrix4f;

public class la {
    private static RenderPipeline pipeline;
    private static final long qo = 6207494152954701304L;
    private static int[] ivgb;
    public static final boolean c;
    public static final int b;
    private static long[] ivft;
    public static final boolean a;
    private static final int UNIFORM_SIZE = 128;
    private static int[] ivgc;
    private static long[] ivfu;
    private static GpuBuffer uniformBuffer;

    private static /* synthetic */ int ivga(int n2) {
        return ivgb[n2] ^ ivgc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = la.qo - la.ivfv("ivpe", ivfs(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == la.ivfv("ivpf", ivga(int ), (int)175)) break;
            v0 /* !! */  = (long)la.ivfv("ivpg", ivga(int ), (int)176);
        }
        var2 = la.c;
        v1 /* !! */  = la.qo;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - la.ivfv("ivph", ivfs(int ), (int)64));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -81748118: {
                    v2 = la.ivfv("ivpi", ivfs(int ), (int)65);
                    continue block17;
                }
                case 153721994: {
                    v2 = la.ivfv("ivpj", ivfs(int ), (int)66);
                    continue block17;
                }
                case 472770040: {
                    break block17;
                }
            }
            break;
        }
        var1_1 /* !! */  = la.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = la.qo;
                if (true) ** GOTO lbl29
                block18: while (true) {
                    v3 /* !! */  = (long)(v4 - la.ivfv("ivpk", ivfs(int ), (int)67));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 437492368: {
                            v4 = la.ivfv("ivpl", ivfs(int ), (int)68);
                            continue block18;
                        }
                        case 472770040: {
                            break block18;
                        }
                        case 1546272544: {
                            v4 = la.ivfv("ivpm", ivfs(int ), (int)69);
                            continue block18;
                        }
                    }
                    break;
                }
                var0_2 = la.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "TaperedLine2D Uniforms";
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)la.ivfv("ivpn", ivga(int ), (int)177);
                } while (!var2);
                throw null;
            }
lbl50:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)la.ivfv("ivpo", ivga(int ), (int)178);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)la.ivfv("ivpp", ivga(int ), (int)179);
                if (!var2) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)la.ivfv("ivpq", ivga(int ), (int)180);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void ivpt() {
        la.ivgc[0] = 36600710;
        la.ivgc[1] = 166479314;
        la.ivgc[2] = -1160647795;
        la.ivgc[3] = -364191615;
        la.ivgc[4] = 209004559;
        la.ivgc[5] = 2100458040;
        la.ivgc[6] = 1186094952;
        la.ivgc[7] = -238824686;
        la.ivgc[8] = 1679669385;
        la.ivgc[9] = -1545907090;
        la.ivgc[10] = 1927345744;
        la.ivgc[11] = 488551895;
        la.ivgc[12] = -175735134;
        la.ivgc[13] = -815628111;
        la.ivgc[14] = 506259056;
        la.ivgc[15] = -1754818539;
        la.ivgc[16] = 1644604055;
        la.ivgc[17] = -1052749070;
        la.ivgc[18] = 83021061;
        la.ivgc[19] = 127714844;
        la.ivgc[20] = -1624731108;
        la.ivgc[21] = 300165264;
        la.ivgc[22] = -886369922;
        la.ivgc[23] = 1639241177;
        la.ivgc[24] = -1879905383;
        la.ivgc[25] = 1700523047;
        la.ivgc[26] = -790518395;
        la.ivgc[27] = -1481057872;
        la.ivgc[28] = 2044988919;
        la.ivgc[29] = 769051371;
        la.ivgc[30] = -2057446392;
        la.ivgc[31] = -917655618;
        la.ivgc[32] = 829951226;
        la.ivgc[33] = 126152481;
        la.ivgc[34] = 338688796;
        la.ivgc[35] = 1495986785;
        la.ivgc[36] = 743110645;
        la.ivgc[37] = -2114630984;
        la.ivgc[38] = 1883947641;
        la.ivgc[39] = 1760386211;
        la.ivgc[40] = 1383402355;
        la.ivgc[41] = 2023249431;
        la.ivgc[42] = -278801330;
        la.ivgc[43] = 1111712516;
        la.ivgc[44] = -1850756335;
        la.ivgc[45] = 465442790;
        la.ivgc[46] = -325584034;
        la.ivgc[47] = -834282253;
        la.ivgc[48] = 1705588799;
        la.ivgc[49] = -613368913;
        la.ivgc[50] = -104773381;
        la.ivgc[51] = 730823150;
        la.ivgc[52] = 534733642;
        la.ivgc[53] = 1407498380;
        la.ivgc[54] = 333006760;
        la.ivgc[55] = 490711387;
        la.ivgc[56] = 1469360277;
        la.ivgc[57] = -231198943;
        la.ivgc[58] = -338217985;
        la.ivgc[59] = -492590184;
        la.ivgc[60] = -1198234071;
        la.ivgc[61] = 2062922444;
        la.ivgc[62] = 1091723220;
        la.ivgc[63] = -2110316464;
        la.ivgc[64] = 2143221105;
        la.ivgc[65] = 1113453083;
        la.ivgc[66] = -387505253;
        la.ivgc[67] = 2079237648;
        la.ivgc[68] = -459369155;
        la.ivgc[69] = 515830398;
        la.ivgc[70] = 2137981446;
        la.ivgc[71] = -1965793511;
        la.ivgc[72] = 1943171088;
        la.ivgc[73] = -833170627;
        la.ivgc[74] = -719003150;
        la.ivgc[75] = -165187721;
        la.ivgc[76] = 1999454871;
        la.ivgc[77] = -810857557;
        la.ivgc[78] = 393773699;
        la.ivgc[79] = -1683175342;
        la.ivgc[80] = 976840310;
        la.ivgc[81] = 337533084;
        la.ivgc[82] = -320696947;
        la.ivgc[83] = -1729047421;
        la.ivgc[84] = -1934867126;
        la.ivgc[85] = -1004810989;
        la.ivgc[86] = 1782377525;
        la.ivgc[87] = 1562303082;
        la.ivgc[88] = -462456853;
        la.ivgc[89] = -1178420673;
        la.ivgc[90] = -315014697;
        la.ivgc[91] = 571221758;
        la.ivgc[92] = -24766991;
        la.ivgc[93] = -844569944;
        la.ivgc[94] = -1324764886;
        la.ivgc[95] = -832416220;
        la.ivgc[96] = -1384580743;
        la.ivgc[97] = 1887808677;
        la.ivgc[98] = -319926366;
        la.ivgc[99] = 632638533;
    }

    static {
        ivgb = new int[181];
        ivgc = new int[181];
        la.ivpr();
        la.ivps();
        la.ivpt();
        la.ivpu();
        ivft = new long[70];
        ivfu = new long[70];
        la.ivpv();
        la.ivpw();
    }

    private static /* synthetic */ void ivpw() {
        la.ivfu[0] = -8694144285965084999L;
        la.ivfu[1] = -6049322123441261939L;
        la.ivfu[2] = -5544196457442456047L;
        la.ivfu[3] = -4449735610237339413L;
        la.ivfu[4] = 1040979035828303584L;
        la.ivfu[5] = -5772101927681043253L;
        la.ivfu[6] = -8354033352006763487L;
        la.ivfu[7] = -8062574687761514383L;
        la.ivfu[8] = -5110773382050706084L;
        la.ivfu[9] = 1402695421088475939L;
        la.ivfu[10] = -1631181687382965966L;
        la.ivfu[11] = 3658433839982274826L;
        la.ivfu[12] = -5580250751318568605L;
        la.ivfu[13] = -647572634401013077L;
        la.ivfu[14] = 3139355723098706742L;
        la.ivfu[15] = -4355233257811575466L;
        la.ivfu[16] = -8658534824483299873L;
        la.ivfu[17] = 6020776205286065845L;
        la.ivfu[18] = -3030165263053191177L;
        la.ivfu[19] = 2973554228696235158L;
        la.ivfu[20] = 492892597112195151L;
        la.ivfu[21] = 6312199482798871628L;
        la.ivfu[22] = 2543483865265164655L;
        la.ivfu[23] = 1373977913126531393L;
        la.ivfu[24] = -7613422932152722441L;
        la.ivfu[25] = -8178902227175872331L;
        la.ivfu[26] = -6004905350912620101L;
        la.ivfu[27] = 5158245292460570339L;
        la.ivfu[28] = -824893900120801759L;
        la.ivfu[29] = 3224660155761374051L;
        la.ivfu[30] = 794206649424180611L;
        la.ivfu[31] = -7140679850457259055L;
        la.ivfu[32] = -3352214863853380737L;
        la.ivfu[33] = -7958703107675061811L;
        la.ivfu[34] = -7865977578401596771L;
        la.ivfu[35] = -1116320623935076216L;
        la.ivfu[36] = 9027036201091637349L;
        la.ivfu[37] = -3830067053982483117L;
        la.ivfu[38] = 1907663825688565804L;
        la.ivfu[39] = -8685024166055433288L;
        la.ivfu[40] = 3512415943383683412L;
        la.ivfu[41] = -8641724345752621651L;
        la.ivfu[42] = 5678847919653423523L;
        la.ivfu[43] = -3337581976629010551L;
        la.ivfu[44] = -369685026457444706L;
        la.ivfu[45] = -6610329933741326828L;
        la.ivfu[46] = -8615410698630704564L;
        la.ivfu[47] = -6289680775904652817L;
        la.ivfu[48] = -3517900003365247567L;
        la.ivfu[49] = -1828037604087194453L;
        la.ivfu[50] = -1133295959424884628L;
        la.ivfu[51] = -2312486992370055458L;
        la.ivfu[52] = 7878239824201211660L;
        la.ivfu[53] = -4683158212465199138L;
        la.ivfu[54] = -43595807267635878L;
        la.ivfu[55] = 1650975659771729520L;
        la.ivfu[56] = 6475073720723189676L;
        la.ivfu[57] = 2266414554349765098L;
        la.ivfu[58] = 4145738825595756127L;
        la.ivfu[59] = -631776551896508976L;
        la.ivfu[60] = -7335514725281212356L;
        la.ivfu[61] = -5250296589650843507L;
        la.ivfu[62] = -265938424866385669L;
        la.ivfu[63] = 8158564334385907774L;
        la.ivfu[64] = -5270732583101934493L;
        la.ivfu[65] = 2958574217473509618L;
        la.ivfu[66] = -5640138256266685662L;
        la.ivfu[67] = 7312490222597292187L;
        la.ivfu[68] = 5325980332289944666L;
        la.ivfu[69] = -6351455778918076834L;
    }

    private static /* synthetic */ void ivps() {
        la.ivgb[100] = 2103245674;
        la.ivgb[101] = -411744245;
        la.ivgb[102] = -1432622304;
        la.ivgb[103] = -754535145;
        la.ivgb[104] = 355625504;
        la.ivgb[105] = 1583086396;
        la.ivgb[106] = 1519846886;
        la.ivgb[107] = 1073879945;
        la.ivgb[108] = 1670202970;
        la.ivgb[109] = -1610822792;
        la.ivgb[110] = -1192743974;
        la.ivgb[111] = -1671827416;
        la.ivgb[112] = 359266542;
        la.ivgb[113] = -858393864;
        la.ivgb[114] = 1933379803;
        la.ivgb[115] = -698413629;
        la.ivgb[116] = -99967243;
        la.ivgb[117] = -1006051775;
        la.ivgb[118] = 1960566254;
        la.ivgb[119] = 1165071929;
        la.ivgb[120] = 2046105094;
        la.ivgb[121] = -205874026;
        la.ivgb[122] = -351978179;
        la.ivgb[123] = 830683301;
        la.ivgb[124] = 1508532546;
        la.ivgb[125] = -72025095;
        la.ivgb[126] = 1203385502;
        la.ivgb[127] = 1439707651;
        la.ivgb[128] = -1724638364;
        la.ivgb[129] = 1960822600;
        la.ivgb[130] = 1872445058;
        la.ivgb[131] = -1451908666;
        la.ivgb[132] = 1294796848;
        la.ivgb[133] = 2108479187;
        la.ivgb[134] = 737586664;
        la.ivgb[135] = -1545534939;
        la.ivgb[136] = 649461136;
        la.ivgb[137] = -2046237808;
        la.ivgb[138] = 576939973;
        la.ivgb[139] = 1987959270;
        la.ivgb[140] = -1852265151;
        la.ivgb[141] = -1743888758;
        la.ivgb[142] = 1370431613;
        la.ivgb[143] = 1036254482;
        la.ivgb[144] = -1645341756;
        la.ivgb[145] = -724128419;
        la.ivgb[146] = 649424049;
        la.ivgb[147] = 2065296388;
        la.ivgb[148] = -86466153;
        la.ivgb[149] = -596389673;
        la.ivgb[150] = 380936201;
        la.ivgb[151] = 1844038457;
        la.ivgb[152] = -1236882199;
        la.ivgb[153] = -1423423094;
        la.ivgb[154] = 474992174;
        la.ivgb[155] = -1747807674;
        la.ivgb[156] = 322191253;
        la.ivgb[157] = 1753038992;
        la.ivgb[158] = -272477159;
        la.ivgb[159] = 748533678;
        la.ivgb[160] = 1525061754;
        la.ivgb[161] = -1973249706;
        la.ivgb[162] = -1281602468;
        la.ivgb[163] = 261890762;
        la.ivgb[164] = 677450871;
        la.ivgb[165] = 580167329;
        la.ivgb[166] = 1184555583;
        la.ivgb[167] = 1060851503;
        la.ivgb[168] = 155678148;
        la.ivgb[169] = 347869424;
        la.ivgb[170] = -2085673334;
        la.ivgb[171] = 1520416524;
        la.ivgb[172] = 380697105;
        la.ivgb[173] = 1498867071;
        la.ivgb[174] = 305873610;
        la.ivgb[175] = 2130858190;
        la.ivgb[176] = -2106362483;
        la.ivgb[177] = -2028337224;
        la.ivgb[178] = 481937137;
        la.ivgb[179] = 1842002836;
        la.ivgb[180] = -1861093961;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 51[SWITCH]
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

    private static /* synthetic */ void ivpr() {
        la.ivgb[0] = 36600711;
        la.ivgb[1] = -1050659634;
        la.ivgb[2] = -1160647796;
        la.ivgb[3] = 1713433298;
        la.ivgb[4] = -209004560;
        la.ivgb[5] = 1228714901;
        la.ivgb[6] = 1186094953;
        la.ivgb[7] = -1014400010;
        la.ivgb[8] = 1679669384;
        la.ivgb[9] = -970596635;
        la.ivgb[10] = 1927345745;
        la.ivgb[11] = -609830552;
        la.ivgb[12] = -175735133;
        la.ivgb[13] = -1079960535;
        la.ivgb[14] = 506259057;
        la.ivgb[15] = -1849557950;
        la.ivgb[16] = 1644604054;
        la.ivgb[17] = -957495264;
        la.ivgb[18] = -83021062;
        la.ivgb[19] = 1600032894;
        la.ivgb[20] = -1624731107;
        la.ivgb[21] = -104656783;
        la.ivgb[22] = -886369921;
        la.ivgb[23] = -1078350829;
        la.ivgb[24] = -1879905384;
        la.ivgb[25] = -451253516;
        la.ivgb[26] = -790518395;
        la.ivgb[27] = 1481057871;
        la.ivgb[28] = 563994955;
        la.ivgb[29] = 769051370;
        la.ivgb[30] = -1189484001;
        la.ivgb[31] = -917655754;
        la.ivgb[32] = -829951227;
        la.ivgb[33] = 376773648;
        la.ivgb[34] = 338688799;
        la.ivgb[35] = 1495986790;
        la.ivgb[36] = 743110644;
        la.ivgb[37] = -2114630991;
        la.ivgb[38] = 1883947642;
        la.ivgb[39] = 1760386218;
        la.ivgb[40] = 1383402367;
        la.ivgb[41] = 2023249430;
        la.ivgb[42] = -278801343;
        la.ivgb[43] = 1111712514;
        la.ivgb[44] = -1850756333;
        la.ivgb[45] = 465442787;
        la.ivgb[46] = -325584042;
        la.ivgb[47] = -834282247;
        la.ivgb[48] = 1705588785;
        la.ivgb[49] = -613368923;
        la.ivgb[50] = -104773509;
        la.ivgb[51] = 730823086;
        la.ivgb[52] = 534733658;
        la.ivgb[53] = 1407498355;
        la.ivgb[54] = 1353074600;
        la.ivgb[55] = 490711379;
        la.ivgb[56] = 1469360234;
        la.ivgb[57] = -1320734943;
        la.ivgb[58] = -338218240;
        la.ivgb[59] = -1579373672;
        la.ivgb[60] = -1198234063;
        la.ivgb[61] = 2062922291;
        la.ivgb[62] = 40722388;
        la.ivgb[63] = -2110316464;
        la.ivgb[64] = 2143221111;
        la.ivgb[65] = 1113453065;
        la.ivgb[66] = -387505207;
        la.ivgb[67] = 2079237687;
        la.ivgb[68] = -459369177;
        la.ivgb[69] = 515830364;
        la.ivgb[70] = 2137981486;
        la.ivgb[71] = -1965793500;
        la.ivgb[72] = 1943171096;
        la.ivgb[73] = -833170660;
        la.ivgb[74] = -719003152;
        la.ivgb[75] = -165187783;
        la.ivgb[76] = 1999454903;
        la.ivgb[77] = -810857589;
        la.ivgb[78] = 393773778;
        la.ivgb[79] = -1683175398;
        la.ivgb[80] = 976840305;
        la.ivgb[81] = 337533066;
        la.ivgb[82] = -320696932;
        la.ivgb[83] = -1729047391;
        la.ivgb[84] = -1934867113;
        la.ivgb[85] = -1004810919;
        la.ivgb[86] = 1782377584;
        la.ivgb[87] = 1562303069;
        la.ivgb[88] = -462456926;
        la.ivgb[89] = -1178420678;
        la.ivgb[90] = -315014759;
        la.ivgb[91] = 571221723;
        la.ivgb[92] = -24767020;
        la.ivgb[93] = -844569933;
        la.ivgb[94] = -1324764865;
        la.ivgb[95] = -832416148;
        la.ivgb[96] = -1384580814;
        la.ivgb[97] = 1887808682;
        la.ivgb[98] = -319926346;
        la.ivgb[99] = 632638581;
    }

    private static /* synthetic */ void ivpu() {
        la.ivgc[100] = 2103245609;
        la.ivgc[101] = -411744239;
        la.ivgc[102] = -1432622315;
        la.ivgc[103] = -754535142;
        la.ivgc[104] = 355625584;
        la.ivgc[105] = 1583086398;
        la.ivgc[106] = 1519846817;
        la.ivgc[107] = 1073880009;
        la.ivgc[108] = 1670202898;
        la.ivgc[109] = -1610822872;
        la.ivgc[110] = -1192743988;
        la.ivgc[111] = -1671827403;
        la.ivgc[112] = 359266531;
        la.ivgc[113] = -858393875;
        la.ivgc[114] = 1933379820;
        la.ivgc[115] = -698413679;
        la.ivgc[116] = -99967278;
        la.ivgc[117] = -1006051716;
        la.ivgc[118] = 1960566216;
        la.ivgc[119] = 1165071926;
        la.ivgc[120] = 2046105129;
        la.ivgc[121] = -205874035;
        la.ivgc[122] = -351978113;
        la.ivgc[123] = 830683319;
        la.ivgc[124] = 1508532498;
        la.ivgc[125] = -72025136;
        la.ivgc[126] = 1203385512;
        la.ivgc[127] = 1439707697;
        la.ivgc[128] = -1724638372;
        la.ivgc[129] = 1960822632;
        la.ivgc[130] = 1872445114;
        la.ivgc[131] = -1451908634;
        la.ivgc[132] = 1294796927;
        la.ivgc[133] = 2108479130;
        la.ivgc[134] = 737586606;
        la.ivgc[135] = -1545534963;
        la.ivgc[136] = 649461213;
        la.ivgc[137] = -2046237759;
        la.ivgc[138] = 576940002;
        la.ivgc[139] = 1987959267;
        la.ivgc[140] = -1852265142;
        la.ivgc[141] = -1743888763;
        la.ivgc[142] = 1370431552;
        la.ivgc[143] = 1036254469;
        la.ivgc[144] = -1645341746;
        la.ivgc[145] = -724128436;
        la.ivgc[146] = 649424031;
        la.ivgc[147] = 2065296385;
        la.ivgc[148] = 86466152;
        la.ivgc[149] = -1809569239;
        la.ivgc[150] = 380936200;
        la.ivgc[151] = 1277615425;
        la.ivgc[152] = -1236882200;
        la.ivgc[153] = -433722583;
        la.ivgc[154] = 474992175;
        la.ivgc[155] = -292107590;
        la.ivgc[156] = 322191254;
        la.ivgc[157] = 1753038996;
        la.ivgc[158] = -272477154;
        la.ivgc[159] = 748533675;
        la.ivgc[160] = 1525061756;
        la.ivgc[161] = -1973249708;
        la.ivgc[162] = -1281602471;
        la.ivgc[163] = 261890754;
        la.ivgc[164] = 677450878;
        la.ivgc[165] = 580167331;
        la.ivgc[166] = 1184555578;
        la.ivgc[167] = 1060851502;
        la.ivgc[168] = -1548766308;
        la.ivgc[169] = 347869425;
        la.ivgc[170] = 708574781;
        la.ivgc[171] = 1520416524;
        la.ivgc[172] = 380697106;
        la.ivgc[173] = 1498867070;
        la.ivgc[174] = 305873611;
        la.ivgc[175] = 2130858191;
        la.ivgc[176] = 2075240227;
        la.ivgc[177] = -2028337223;
        la.ivgc[178] = 481937137;
        la.ivgc[179] = 1842002839;
        la.ivgc[180] = -1861093962;
    }

    public la() {
    }

    public static /* synthetic */ CallSite ivfv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long ivfs(int n2) {
        return ivft[n2] ^ ivfu[n2];
    }

    /*
     * Exception decompiling
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, int var11_11, float var12_12) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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
    public static void shutdown() {
        block43: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = la.qo - la.ivfv("ivnn", ivfs(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == la.ivfv("ivno", ivga(int ), (int)148)) break;
                v0 /* !! */  = (long)la.ivfv("ivnp", ivga(int ), (int)149);
            }
            var2 = la.c;
            v1 /* !! */  = la.qo;
            if (true) ** GOTO lbl11
            block28: while (true) {
                v1 /* !! */  = (long)(la.ivfv("ivnr", ivfs(int ), (int)49) - la.ivfv("ivnq", ivfs(int ), (int)48));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 472770040: {
                        break block28;
                    }
                    case 1527017611: {
                        continue block28;
                    }
                }
                break;
            }
            var1_1 /* !! */  = la.b;
            v2 /* !! */  = la.qo;
            if (true) ** GOTO lbl21
            block29: while (true) {
                v2 /* !! */  = (long)(v3 - la.ivfv("ivns", ivfs(int ), (int)50));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1436473690: {
                        v3 = la.ivfv("ivnt", ivfs(int ), (int)51);
                        continue block29;
                    }
                    case -994549159: {
                        v3 = la.ivfv("ivnu", ivfs(int ), (int)52);
                        continue block29;
                    }
                    case 472770040: {
                        break block29;
                    }
                }
                break;
            }
            var0_2 = la.a;
            if (var2) {
                throw null;
lbl33:
                // 6 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = la.qo - la.ivfv("ivnv", ivfs(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == la.ivfv("ivnw", ivga(int ), (int)150)) break;
                v4 /* !! */  = (long)la.ivfv("ivnx", ivga(int ), (int)151);
            }
            if (la.uniformBuffer == null) break block43;
            if (var0_2 || var0_2) ** GOTO lbl33
            v5 /* !! */  = la.qo;
            if (true) ** GOTO lbl47
            block32: while (true) {
                v5 /* !! */  = (long)(v6 - la.ivfv("ivny", ivfs(int ), (int)54));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -821451846: {
                        v6 = la.ivfv("ivnz", ivfs(int ), (int)55);
                        continue block32;
                    }
                    case 386217580: {
                        v6 = la.ivfv("ivoa", ivfs(int ), (int)56);
                        continue block32;
                    }
                    case 472770040: {
                        break block32;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = la.qo - la.ivfv("ivob", ivfs(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == la.ivfv("ivoc", ivga(int ), (int)152)) break;
                v7 /* !! */  = (long)la.ivfv("ivod", ivga(int ), (int)153);
            }
            la.uniformBuffer.close();
            if (var0_2 || var0_2) ** GOTO lbl33
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = la.qo - la.ivfv("ivoe", ivfs(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == la.ivfv("ivof", ivga(int ), (int)154)) break;
                v8 /* !! */  = (long)la.ivfv("ivog", ivga(int ), (int)155);
            }
            la.uniformBuffer = null;
            if (var0_2) ** GOTO lbl33
        }
        if (var0_2) ** GOTO lbl33
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                return;
            }
lbl78:
            // 4 sources

            case 0: {
                var1_1 /* !! */  = (int)la.ivfv("ivoh", ivga(int ), (int)156);
                if (var2) {
                    throw null;
                }
            }
lbl82:
            // 4 sources

            case 1: {
                var1_1 /* !! */  = (int)la.ivfv("ivoi", ivga(int ), (int)157);
                if (!var2) ** GOTO lbl78
                throw null;
            }
lbl86:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)la.ivfv("ivoj", ivga(int ), (int)158);
                if (var2) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)la.ivfv("ivok", ivga(int ), (int)159);
                    if (!var2) break block14;
                    throw null;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)la.ivfv("ivol", ivga(int ), (int)160);
                if (!var2) ** GOTO lbl82
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)la.ivfv("ivom", ivga(int ), (int)161);
                if (!var2) ** GOTO lbl78
                throw null;
            }
lbl103:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)la.ivfv("ivon", ivga(int ), (int)162);
                if (!var2) break;
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)la.ivfv("ivoo", ivga(int ), (int)163);
                if (!var2) ** GOTO lbl78
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)la.ivfv("ivop", ivga(int ), (int)164);
                if (!var2) ** GOTO lbl86
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)la.ivfv("ivoq", ivga(int ), (int)165);
                if (!var2) ** GOTO lbl103
                throw null;
            }
            case 10: 
        }
        var1_1 /* !! */  = (int)la.ivfv("ivor", ivga(int ), (int)166);
        ** while (!var2)
lbl122:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$draw$1() {
        v0 /* !! */  = la.qo;
        block10: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 297046406: {
                    v0 /* !! */  = (long)(la.ivfv("ivot", ivfs(int ), (int)60) - la.ivfv("ivos", ivfs(int ), (int)59));
                    continue block10;
                }
                case 472770040: {
                    break block10;
                }
            }
            break;
        }
        var2 = la.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = la.qo - la.ivfv("ivou", ivfs(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == la.ivfv("ivov", ivga(int ), (int)167)) break;
            v1 /* !! */  = (long)la.ivfv("ivow", ivga(int ), (int)168);
        }
        var1_1 /* !! */  = la.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = la.qo - la.ivfv("ivox", ivfs(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == la.ivfv("ivoy", ivga(int ), (int)169)) {
                var0_2 = la.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)la.ivfv("ivoz", ivga(int ), (int)170);
        }
        if (!var0_2 && !var0_2) {
            return "TaperedLine2D";
        }
        if (var1_1 /* !! */  == 0) return null;
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: {
                    return null;
                }
                case 2: {
                    var1_1 /* !! */  = (int)la.ivfv("ivpc", ivga(int ), (int)173);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)la.ivfv("ivpd", ivga(int ), (int)174);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)la.ivfv("ivpa", ivga(int ), (int)171);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl51
            break;
        }
        do {
            if (true) ** continue;
lbl51:
            // 2 sources

            var1_1 /* !! */  = (int)la.ivfv("ivpb", ivga(int ), (int)172);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ float ivjw(int n2) {
        return Float.intBitsToFloat(ivgb[n2] ^ ivgc[n2]);
    }

    private static /* synthetic */ void ivpv() {
        la.ivft[0] = -8558272262310602438L;
        la.ivft[1] = -8545977810926629734L;
        la.ivft[2] = 4962722098479755219L;
        la.ivft[3] = -3188495381072817878L;
        la.ivft[4] = 1486434022399548209L;
        la.ivft[5] = -965604002538366251L;
        la.ivft[6] = -1767297353423324922L;
        la.ivft[7] = 4452763398437083146L;
        la.ivft[8] = -343908487453101246L;
        la.ivft[9] = 9064734133187660636L;
        la.ivft[10] = 1893857857382093574L;
        la.ivft[11] = -3791966224345980339L;
        la.ivft[12] = 5848758392029295322L;
        la.ivft[13] = 3869633380961361564L;
        la.ivft[14] = 650416748715535226L;
        la.ivft[15] = 2968395656836640899L;
        la.ivft[16] = 7528045915868456052L;
        la.ivft[17] = 6316198376911798896L;
        la.ivft[18] = 3895664344840999718L;
        la.ivft[19] = 883631748536108498L;
        la.ivft[20] = 3595676064649343396L;
        la.ivft[21] = -4302598788623787317L;
        la.ivft[22] = -5967061992686533868L;
        la.ivft[23] = 1031960192385214861L;
        la.ivft[24] = 7487120530956602444L;
        la.ivft[25] = -2556757436029326180L;
        la.ivft[26] = -3152052502434794976L;
        la.ivft[27] = 8397319354263743496L;
        la.ivft[28] = 5055930469304586745L;
        la.ivft[29] = -7796534931960120310L;
        la.ivft[30] = -7287756473036316312L;
        la.ivft[31] = -7331650910885355803L;
        la.ivft[32] = -7149201532059989366L;
        la.ivft[33] = -160207590973207548L;
        la.ivft[34] = 3305431540806943874L;
        la.ivft[35] = 7283708956516975598L;
        la.ivft[36] = 7271223600590723464L;
        la.ivft[37] = -3590632049033603990L;
        la.ivft[38] = 5926313805999454547L;
        la.ivft[39] = -4281080328172779153L;
        la.ivft[40] = 8038949792770646043L;
        la.ivft[41] = 8102538753023122129L;
        la.ivft[42] = 5678847919653423395L;
        la.ivft[43] = 8871702879367494218L;
        la.ivft[44] = 8992924626191212366L;
        la.ivft[45] = -2915883119673193241L;
        la.ivft[46] = -1948509089449161962L;
        la.ivft[47] = -128991203454930514L;
        la.ivft[48] = 1893906080228382194L;
        la.ivft[49] = 8308602987624720011L;
        la.ivft[50] = 1047234914074556373L;
        la.ivft[51] = -2441615821886915531L;
        la.ivft[52] = -2627158564967233767L;
        la.ivft[53] = -7540651035498880036L;
        la.ivft[54] = -2244061777831598243L;
        la.ivft[55] = -1879881858366649328L;
        la.ivft[56] = 177246866694269733L;
        la.ivft[57] = 1098360195989552143L;
        la.ivft[58] = -2510370660868083883L;
        la.ivft[59] = -7660019731666300159L;
        la.ivft[60] = -7962215138193914219L;
        la.ivft[61] = 5209912213957135413L;
        la.ivft[62] = 6790344462093083945L;
        la.ivft[63] = 8258363305645123268L;
        la.ivft[64] = -5121902981731886714L;
        la.ivft[65] = -5411146347529979440L;
        la.ivft[66] = 4253213157616274212L;
        la.ivft[67] = 1878543816028941120L;
        la.ivft[68] = -3018178014185120613L;
        la.ivft[69] = 8135900041341149399L;
    }
}

