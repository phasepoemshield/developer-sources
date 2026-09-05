/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;
import ruhack.phobia.oq;

public class ky {
    static public final boolean c;
    static protected final long nn = -7728083709209924338L;
    static public final int b;
    static private int[] ggmd;
    static private long[] gglz;
    static private int[] ggme;
    static public final boolean a;
    static private long[] ggly;
    static private ByteBuffer uniformData;
    static private GpuBuffer uniformBuffer;
    static private final int UNIFORM_SIZE = 128;
    static private RenderPipeline pipeline;

    private static void ggxe() {
        ky.ggly[0] = -5421973120174186571L;
        ky.ggly[1] = 4713063111696150388L;
        ky.ggly[2] = 698959300510381394L;
        ky.ggly[3] = -6227459996641199624L;
        ky.ggly[4] = -1787092285614291500L;
        ky.ggly[5] = -6184718630500823205L;
        ky.ggly[6] = 4528180173107644835L;
        ky.ggly[7] = -1674327323912016681L;
        ky.ggly[8] = 664679593554150199L;
        ky.ggly[9] = -672808323707810419L;
        ky.ggly[10] = 5839902460085379098L;
        ky.ggly[11] = 2306691534011037008L;
        ky.ggly[12] = -2387178197380996494L;
        ky.ggly[13] = -8589172399158592389L;
        ky.ggly[14] = 7101565978694870417L;
        ky.ggly[15] = 5658562282442894684L;
        ky.ggly[16] = 7316209237207751191L;
        ky.ggly[17] = -8667617510199968402L;
        ky.ggly[18] = -5684021615681361704L;
        ky.ggly[19] = 8275567640943237739L;
        ky.ggly[20] = 2457839634381286223L;
        ky.ggly[21] = 4466145571337286822L;
        ky.ggly[22] = -3713798705847885156L;
        ky.ggly[23] = -8720359533269879233L;
        ky.ggly[24] = -6502992667011141216L;
        ky.ggly[25] = 1886522206004738673L;
        ky.ggly[26] = 7583567748635306378L;
        ky.ggly[27] = -905750995617605667L;
        ky.ggly[28] = 2693411264900459967L;
        ky.ggly[29] = 4875853356453168605L;
        ky.ggly[30] = 3940457581246999739L;
        ky.ggly[31] = -4602534340322636726L;
        ky.ggly[32] = 4135513526955102395L;
        ky.ggly[33] = -5915458359816819922L;
        ky.ggly[34] = -2594272073949332952L;
        ky.ggly[35] = 4639180833308380319L;
        ky.ggly[36] = 5995178031470848456L;
        ky.ggly[37] = -8757612524611719977L;
        ky.ggly[38] = 1430704637095790808L;
        ky.ggly[39] = 2151473684592577938L;
        ky.ggly[40] = 1919159678723316901L;
        ky.ggly[41] = -7021252613378897170L;
        ky.ggly[42] = -7387545064192319349L;
        ky.ggly[43] = -2687021239118433199L;
        ky.ggly[44] = 7573465219020761072L;
        ky.ggly[45] = 5760437788160802861L;
        ky.ggly[46] = -4261942475050699399L;
        ky.ggly[47] = 8767186052273662085L;
        ky.ggly[48] = 8223313775792482169L;
        ky.ggly[49] = -5560375088929612712L;
        ky.ggly[50] = 4248816213555297157L;
        ky.ggly[51] = 9109121696873602336L;
        ky.ggly[52] = -2918886434719952876L;
        ky.ggly[53] = -5481521775605604595L;
        ky.ggly[54] = -1796578850582877667L;
        ky.ggly[55] = 874753873560916560L;
        ky.ggly[56] = 3692783800472359955L;
        ky.ggly[57] = 7701510156297465795L;
        ky.ggly[58] = 3126483349449034532L;
        ky.ggly[59] = 3192808434793795753L;
        ky.ggly[60] = 5196365766790117833L;
        ky.ggly[61] = -7256098180407705686L;
        ky.ggly[62] = 1580258557189380746L;
        ky.ggly[63] = -1897366857315444123L;
        ky.ggly[64] = -8715354129976590925L;
        ky.ggly[65] = 5996907890131629234L;
        ky.ggly[66] = 7676323757118040120L;
        ky.ggly[67] = -6150302114315920048L;
        ky.ggly[68] = -3447043551804421851L;
        ky.ggly[69] = -2772161715890296689L;
        ky.ggly[70] = 1225559685746238770L;
        ky.ggly[71] = -1023277771958857471L;
        ky.ggly[72] = -4475390367089729853L;
        ky.ggly[73] = 5755998338709635255L;
        ky.ggly[74] = 9207196720253656639L;
        ky.ggly[75] = 3807266239312245635L;
        ky.ggly[76] = -2882138208560854649L;
        ky.ggly[77] = -1797025870106826294L;
        ky.ggly[78] = -7933624179672625759L;
        ky.ggly[79] = -1629389382725065500L;
        ky.ggly[80] = -1699976412520048530L;
        ky.ggly[81] = 3489134702496179868L;
        ky.ggly[82] = -3400368180496112793L;
        ky.ggly[83] = -6463875726097968758L;
        ky.ggly[84] = 6891488584514422315L;
        ky.ggly[85] = -2632703420978094605L;
        ky.ggly[86] = -2809926351468643190L;
        ky.ggly[87] = -4810265645810995297L;
        ky.ggly[88] = -1419866645140357857L;
        ky.ggly[89] = 1297903995018534737L;
        ky.ggly[90] = 7558143108916959199L;
        ky.ggly[91] = -1387626677834162534L;
        ky.ggly[92] = -7159058952154393957L;
    }

    private static void ggxb() {
        ky.ggmd[100] = -1787898076;
        ky.ggmd[101] = -1784730844;
        ky.ggmd[102] = -654195840;
        ky.ggmd[103] = 497844781;
        ky.ggmd[104] = -241049356;
        ky.ggmd[105] = -1358018288;
        ky.ggmd[106] = 663625301;
        ky.ggmd[107] = 2038455147;
        ky.ggmd[108] = -116130353;
        ky.ggmd[109] = -1577284727;
        ky.ggmd[110] = -309049539;
        ky.ggmd[111] = 875394903;
        ky.ggmd[112] = -1422152761;
        ky.ggmd[113] = 716274323;
        ky.ggmd[114] = -489137334;
        ky.ggmd[115] = 492640316;
        ky.ggmd[116] = 213647593;
        ky.ggmd[117] = -1206867795;
        ky.ggmd[118] = 550580435;
        ky.ggmd[119] = -1773956321;
        ky.ggmd[120] = 888183255;
        ky.ggmd[121] = 1654919797;
        ky.ggmd[122] = -135870652;
        ky.ggmd[123] = -1508583538;
        ky.ggmd[124] = 1350085812;
        ky.ggmd[125] = -1826150825;
        ky.ggmd[126] = -1331569450;
        ky.ggmd[127] = 684750675;
        ky.ggmd[128] = 218762201;
        ky.ggmd[129] = -1173571755;
        ky.ggmd[130] = 1123260841;
        ky.ggmd[131] = 1513297319;
        ky.ggmd[132] = -1643235451;
        ky.ggmd[133] = -1604689996;
        ky.ggmd[134] = 347572344;
        ky.ggmd[135] = -1290444657;
        ky.ggmd[136] = 924371106;
        ky.ggmd[137] = -1495787020;
        ky.ggmd[138] = -899166460;
        ky.ggmd[139] = 125171690;
        ky.ggmd[140] = -865334250;
        ky.ggmd[141] = -1269847660;
        ky.ggmd[142] = 224430482;
        ky.ggmd[143] = -1888724853;
        ky.ggmd[144] = -957328231;
        ky.ggmd[145] = 584203279;
        ky.ggmd[146] = 1573742461;
        ky.ggmd[147] = 1692900323;
        ky.ggmd[148] = -689515632;
        ky.ggmd[149] = -1355521475;
        ky.ggmd[150] = 1979941965;
        ky.ggmd[151] = 1824851049;
        ky.ggmd[152] = -1291798486;
        ky.ggmd[153] = 762843462;
        ky.ggmd[154] = 1420574506;
        ky.ggmd[155] = 91370042;
        ky.ggmd[156] = 745715481;
        ky.ggmd[157] = -1137762787;
        ky.ggmd[158] = 1613737997;
        ky.ggmd[159] = -1086361479;
        ky.ggmd[160] = 1204415012;
        ky.ggmd[161] = 1897075872;
        ky.ggmd[162] = 1112792636;
        ky.ggmd[163] = -1103305078;
        ky.ggmd[164] = 832775456;
        ky.ggmd[165] = -705522211;
        ky.ggmd[166] = -247195378;
        ky.ggmd[167] = -1287644253;
        ky.ggmd[168] = -1017464943;
        ky.ggmd[169] = -51171769;
        ky.ggmd[170] = 239415475;
        ky.ggmd[171] = 1867712978;
        ky.ggmd[172] = -517631315;
        ky.ggmd[173] = -288187291;
        ky.ggmd[174] = -587012488;
        ky.ggmd[175] = 527871065;
        ky.ggmd[176] = -360566973;
        ky.ggmd[177] = -1317210546;
        ky.ggmd[178] = 1453949434;
        ky.ggmd[179] = -420214807;
        ky.ggmd[180] = 884328354;
        ky.ggmd[181] = -239776213;
        ky.ggmd[182] = -790930713;
        ky.ggmd[183] = 1221072049;
        ky.ggmd[184] = 400710302;
        ky.ggmd[185] = -1593816713;
        ky.ggmd[186] = -965446405;
        ky.ggmd[187] = -1447301609;
    }

    private static void ggxc() {
        ky.ggme[0] = -383645818;
        ky.ggme[1] = 1533054775;
        ky.ggme[2] = 1356266114;
        ky.ggme[3] = 1397632575;
        ky.ggme[4] = -2118094816;
        ky.ggme[5] = 838654391;
        ky.ggme[6] = -1986884489;
        ky.ggme[7] = 1633813866;
        ky.ggme[8] = 141084663;
        ky.ggme[9] = 2040565414;
        ky.ggme[10] = 413929615;
        ky.ggme[11] = 1245542336;
        ky.ggme[12] = -716812193;
        ky.ggme[13] = 2012907078;
        ky.ggme[14] = -882378448;
        ky.ggme[15] = -275273891;
        ky.ggme[16] = -187436739;
        ky.ggme[17] = -559342459;
        ky.ggme[18] = -1760031824;
        ky.ggme[19] = 790101149;
        ky.ggme[20] = 503356158;
        ky.ggme[21] = 1725434858;
        ky.ggme[22] = -336129984;
        ky.ggme[23] = 1962990200;
        ky.ggme[24] = -1512512293;
        ky.ggme[25] = 1327097909;
        ky.ggme[26] = -270413289;
        ky.ggme[27] = 713842995;
        ky.ggme[28] = -1899445568;
        ky.ggme[29] = -1796597555;
        ky.ggme[30] = -666906816;
        ky.ggme[31] = -1050278289;
        ky.ggme[32] = -872561359;
        ky.ggme[33] = 2010992586;
        ky.ggme[34] = 207491532;
        ky.ggme[35] = -682132815;
        ky.ggme[36] = 1717267789;
        ky.ggme[37] = 1209597775;
        ky.ggme[38] = 2000507053;
        ky.ggme[39] = 1186352057;
        ky.ggme[40] = 1697040670;
        ky.ggme[41] = -1778366298;
        ky.ggme[42] = 888953445;
        ky.ggme[43] = -1947074711;
        ky.ggme[44] = -1450086429;
        ky.ggme[45] = -1446941294;
        ky.ggme[46] = 1638012052;
        ky.ggme[47] = 1485221093;
        ky.ggme[48] = -1841604724;
        ky.ggme[49] = 423025282;
        ky.ggme[50] = -802860622;
        ky.ggme[51] = 282109560;
        ky.ggme[52] = 254083796;
        ky.ggme[53] = -1378173674;
        ky.ggme[54] = 101613379;
        ky.ggme[55] = -497656392;
        ky.ggme[56] = 189660309;
        ky.ggme[57] = 1233059554;
        ky.ggme[58] = 231310152;
        ky.ggme[59] = -1668684313;
        ky.ggme[60] = 2121217111;
        ky.ggme[61] = -1841059727;
        ky.ggme[62] = -885818120;
        ky.ggme[63] = -902448996;
        ky.ggme[64] = 2015760425;
        ky.ggme[65] = -1386090356;
        ky.ggme[66] = -25731920;
        ky.ggme[67] = -958488414;
        ky.ggme[68] = 1977501620;
        ky.ggme[69] = 1023572923;
        ky.ggme[70] = -620263641;
        ky.ggme[71] = -610341089;
        ky.ggme[72] = -753542004;
        ky.ggme[73] = 62492683;
        ky.ggme[74] = -357435419;
        ky.ggme[75] = 1620926200;
        ky.ggme[76] = 829932489;
        ky.ggme[77] = -659799791;
        ky.ggme[78] = 1924110069;
        ky.ggme[79] = -1518056844;
        ky.ggme[80] = 956241110;
        ky.ggme[81] = 370006063;
        ky.ggme[82] = 1097250265;
        ky.ggme[83] = 310646559;
        ky.ggme[84] = 0x11DD188;
        ky.ggme[85] = 13958421;
        ky.ggme[86] = 1789126589;
        ky.ggme[87] = -961152016;
        ky.ggme[88] = 536845169;
        ky.ggme[89] = 947675786;
        ky.ggme[90] = 881567983;
        ky.ggme[91] = -1906145875;
        ky.ggme[92] = -1515066762;
        ky.ggme[93] = 1889205100;
        ky.ggme[94] = 884640143;
        ky.ggme[95] = -1509851762;
        ky.ggme[96] = -478111585;
        ky.ggme[97] = 945552373;
        ky.ggme[98] = 842059650;
        ky.ggme[99] = -2080434656;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String lambda$draw$1() {
        v0 /* !! */  = ky.nn;
        block10: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -972083954: {
                    break block10;
                }
                case 1144255121: {
                    v0 /* !! */  = (long)(ky.ggma("ggwb", gglx(int ), (int)84) - ky.ggma("ggwa", gglx(int ), (int)83));
                    continue block10;
                }
            }
            break;
        }
        var2 = ky.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ky.nn - ky.ggma("ggwc", gglx(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ky.ggma("ggwd", ggmc(int ), (int)172)) break;
            v1 /* !! */  = (long)ky.ggma("ggwe", ggmc(int ), (int)173);
        }
        var1_1 /* !! */  = ky.b;
        while (true) {
            block21: {
                if ((v2 /* !! */  = (cfr_temp_2 = ky.nn - ky.ggma("ggwf", gglx(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != ky.ggma("ggwg", ggmc(int ), (int)174)) break block21;
                var0_2 = ky.a;
                if (var1_1 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)ky.ggma("ggwh", ggmc(int ), (int)175);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var2) {
                        throw null;
                    }
                    if (var0_2 || var0_2) {
                        return null;
                    }
                    return "Glow2D";
                }
                case 0: {
                    var1_1 /* !! */  = (int)ky.ggma("ggwi", ggmc(int ), (int)176);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ky.ggma("ggwl", ggmc(int ), (int)179);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ky.ggma("ggwj", ggmc(int ), (int)177);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl53
            break;
        }
        do {
            if (true) ** continue;
lbl53:
            // 2 sources

            var1_1 /* !! */  = (int)ky.ggma("ggwk", ggmc(int ), (int)178);
            cfr_temp_0 = 1;
        } while (!var2);
        throw null;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 71[SWITCH]
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

    private static void ggxf() {
        ky.gglz[0] = -8735456387857024680L;
        ky.gglz[1] = -795348991198533664L;
        ky.gglz[2] = 4866017713515249223L;
        ky.gglz[3] = -2233877913991956141L;
        ky.gglz[4] = 3553880325172610883L;
        ky.gglz[5] = -8066943205159081609L;
        ky.gglz[6] = -4630638821396026087L;
        ky.gglz[7] = 8171003912837041236L;
        ky.gglz[8] = -7038612586878879133L;
        ky.gglz[9] = 3476596443531377828L;
        ky.gglz[10] = -4382488475953585389L;
        ky.gglz[11] = -134462152926118701L;
        ky.gglz[12] = 6448055636826494947L;
        ky.gglz[13] = -7700693217640008451L;
        ky.gglz[14] = 4702219928754777231L;
        ky.gglz[15] = -7817280309715572358L;
        ky.gglz[16] = 4730570705585702579L;
        ky.gglz[17] = 1003044803288570790L;
        ky.gglz[18] = -5279906467454506262L;
        ky.gglz[19] = 3952995552366123L;
        ky.gglz[20] = 1401297421108721784L;
        ky.gglz[21] = 53853180724146270L;
        ky.gglz[22] = 681030612031803661L;
        ky.gglz[23] = 2900102154463860988L;
        ky.gglz[24] = 7769684644093032827L;
        ky.gglz[25] = 3397177979934517306L;
        ky.gglz[26] = 4383123040246510760L;
        ky.gglz[27] = -6765655508846118679L;
        ky.gglz[28] = -4164367875068901676L;
        ky.gglz[29] = 8006741080730114374L;
        ky.gglz[30] = 1332965612640618063L;
        ky.gglz[31] = -7789648250291659191L;
        ky.gglz[32] = -5445709408244087901L;
        ky.gglz[33] = 6439087311451271543L;
        ky.gglz[34] = 2415574546627679524L;
        ky.gglz[35] = 2457288457506256953L;
        ky.gglz[36] = 4211424212315845188L;
        ky.gglz[37] = -5039336702624708979L;
        ky.gglz[38] = -1244759660156630006L;
        ky.gglz[39] = 6218158388757957920L;
        ky.gglz[40] = -4074970308119040860L;
        ky.gglz[41] = 1333715900912191884L;
        ky.gglz[42] = -7434821803701723052L;
        ky.gglz[43] = 256849780114600046L;
        ky.gglz[44] = -878056318901196146L;
        ky.gglz[45] = -2984980540727405725L;
        ky.gglz[46] = -2232443528133483635L;
        ky.gglz[47] = 365019352754981824L;
        ky.gglz[48] = -72748601720055928L;
        ky.gglz[49] = -3563779975205364145L;
        ky.gglz[50] = -2175493255128763601L;
        ky.gglz[51] = -88579095070293999L;
        ky.gglz[52] = -2918886434719952748L;
        ky.gglz[53] = -6217714931707896541L;
        ky.gglz[54] = -3100757746679393673L;
        ky.gglz[55] = 1237879398589370008L;
        ky.gglz[56] = -7900597372885229990L;
        ky.gglz[57] = 6112432697403751836L;
        ky.gglz[58] = -2368137615976123140L;
        ky.gglz[59] = 7168573021265187782L;
        ky.gglz[60] = 2282874955557659504L;
        ky.gglz[61] = -7135341467452722685L;
        ky.gglz[62] = -8934778308996958192L;
        ky.gglz[63] = 3813075540214409078L;
        ky.gglz[64] = -7733054850128570901L;
        ky.gglz[65] = -4600789058507878357L;
        ky.gglz[66] = 7603155119551336703L;
        ky.gglz[67] = -742190129257959848L;
        ky.gglz[68] = -7238920392993444893L;
        ky.gglz[69] = -3969382500477064225L;
        ky.gglz[70] = 7422459489217723881L;
        ky.gglz[71] = -1927090958347538766L;
        ky.gglz[72] = -1393710727717320483L;
        ky.gglz[73] = -3316379651426128652L;
        ky.gglz[74] = -7926497139714319192L;
        ky.gglz[75] = 7559147022896436655L;
        ky.gglz[76] = -786897407141743879L;
        ky.gglz[77] = -3883223849985089247L;
        ky.gglz[78] = -3414280969375939522L;
        ky.gglz[79] = -8334969589556851813L;
        ky.gglz[80] = 6309777537214192600L;
        ky.gglz[81] = 3093956097721943383L;
        ky.gglz[82] = -978251951692142864L;
        ky.gglz[83] = 6576360966405071957L;
        ky.gglz[84] = 7132316080015512168L;
        ky.gglz[85] = 422175204401644772L;
        ky.gglz[86] = -6263030043143007825L;
        ky.gglz[87] = 2016532191765292876L;
        ky.gglz[88] = -7513803975717908581L;
        ky.gglz[89] = -7740454040946945616L;
        ky.gglz[90] = 5747661436255170604L;
        ky.gglz[91] = -5876976670992727520L;
        ky.gglz[92] = -7730698543596268075L;
    }

    static {
        ggmd = new int[188];
        ggme = new int[188];
        ky.ggxa();
        ky.ggxb();
        ky.ggxc();
        ky.ggxd();
        ggly = new long[93];
        gglz = new long[93];
        ky.ggxe();
        ky.ggxf();
    }

    private static void ggxa() {
        ky.ggmd[0] = 383645817;
        ky.ggmd[1] = 1810490189;
        ky.ggmd[2] = -1356266115;
        ky.ggmd[3] = -2068072772;
        ky.ggmd[4] = 2118094815;
        ky.ggmd[5] = 469009052;
        ky.ggmd[6] = 1986884488;
        ky.ggmd[7] = -1767413026;
        ky.ggmd[8] = -141084664;
        ky.ggmd[9] = 228131556;
        ky.ggmd[10] = -413929616;
        ky.ggmd[11] = -1772050625;
        ky.ggmd[12] = 716812192;
        ky.ggmd[13] = -125833577;
        ky.ggmd[14] = 882378447;
        ky.ggmd[15] = -735128738;
        ky.ggmd[16] = 187436738;
        ky.ggmd[17] = -1976880672;
        ky.ggmd[18] = -1760031823;
        ky.ggmd[19] = -1787876289;
        ky.ggmd[20] = 503356158;
        ky.ggmd[21] = -1725434859;
        ky.ggmd[22] = 2019309329;
        ky.ggmd[23] = -1962990201;
        ky.ggmd[24] = 1151022405;
        ky.ggmd[25] = 1327097908;
        ky.ggmd[26] = -1545142838;
        ky.ggmd[27] = 713843131;
        ky.ggmd[28] = 1899445567;
        ky.ggmd[29] = 1840215660;
        ky.ggmd[30] = -666906688;
        ky.ggmd[31] = 1050278288;
        ky.ggmd[32] = -1958616840;
        ky.ggmd[33] = 2010992581;
        ky.ggmd[34] = 207491535;
        ky.ggmd[35] = -682132809;
        ky.ggmd[36] = 1717267780;
        ky.ggmd[37] = 1209597766;
        ky.ggmd[38] = 2000507047;
        ky.ggmd[39] = 1186352040;
        ky.ggmd[40] = 1697040658;
        ky.ggmd[41] = -1778366302;
        ky.ggmd[42] = 888953448;
        ky.ggmd[43] = -1947074717;
        ky.ggmd[44] = -1450086422;
        ky.ggmd[45] = -1446941288;
        ky.ggmd[46] = 1638012061;
        ky.ggmd[47] = 1485221089;
        ky.ggmd[48] = -1841604735;
        ky.ggmd[49] = 423025292;
        ky.ggmd[50] = -802860622;
        ky.ggmd[51] = 282109544;
        ky.ggmd[52] = 254083627;
        ky.ggmd[53] = -291128042;
        ky.ggmd[54] = 101613387;
        ky.ggmd[55] = -497656505;
        ky.ggmd[56] = 1211301013;
        ky.ggmd[57] = 1233059357;
        ky.ggmd[58] = 1320584008;
        ky.ggmd[59] = -1668684289;
        ky.ggmd[60] = 2121217192;
        ky.ggmd[61] = -784553871;
        ky.ggmd[62] = -885818184;
        ky.ggmd[63] = -902448996;
        ky.ggmd[64] = 2015760431;
        ky.ggmd[65] = -1386090313;
        ky.ggmd[66] = -25731965;
        ky.ggmd[67] = -958488415;
        ky.ggmd[68] = 1977501685;
        ky.ggmd[69] = 1023572918;
        ky.ggmd[70] = -620263653;
        ky.ggmd[71] = -610341025;
        ky.ggmd[72] = -753541972;
        ky.ggmd[73] = 62492672;
        ky.ggmd[74] = -357435423;
        ky.ggmd[75] = 1620926139;
        ky.ggmd[76] = 829932525;
        ky.ggmd[77] = -659799807;
        ky.ggmd[78] = 1924110054;
        ky.ggmd[79] = -1518056858;
        ky.ggmd[80] = 956241104;
        ky.ggmd[81] = 370006075;
        ky.ggmd[82] = 1097250206;
        ky.ggmd[83] = 310646563;
        ky.ggmd[84] = 18731429;
        ky.ggmd[85] = 13958401;
        ky.ggmd[86] = 1789126578;
        ky.ggmd[87] = -961152023;
        ky.ggmd[88] = 536845152;
        ky.ggmd[89] = 947675796;
        ky.ggmd[90] = 881567985;
        ky.ggmd[91] = -1906145915;
        ky.ggmd[92] = -1515066786;
        ky.ggmd[93] = 1889205083;
        ky.ggmd[94] = 884640201;
        ky.ggmd[95] = -1509851721;
        ky.ggmd[96] = -478111582;
        ky.ggmd[97] = 945552328;
        ky.ggmd[98] = 842059717;
        ky.ggmd[99] = -2080434645;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ky.nn - ky.ggma("ggwm", gglx(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ky.ggma("ggwn", ggmc(int ), (int)180)) break;
            v0 /* !! */  = (long)ky.ggma("ggwo", ggmc(int ), (int)181);
        }
        var2 = ky.c;
        v1 /* !! */  = ky.nn;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - ky.ggma("ggwp", gglx(int ), (int)88));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -972083954: {
                    break block13;
                }
                case -808028951: {
                    v2 = ky.ggma("ggwq", gglx(int ), (int)89);
                    continue block13;
                }
                case 216501738: {
                    v2 = ky.ggma("ggwr", gglx(int ), (int)90);
                    continue block13;
                }
                case 514255395: {
                    v2 = ky.ggma("ggws", gglx(int ), (int)91);
                    continue block13;
                }
            }
            break;
        }
        var1_1 /* !! */  = ky.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ky.nn - ky.ggma("ggwt", gglx(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ky.ggma("ggwu", ggmc(int ), (int)182)) break;
            v3 /* !! */  = (long)ky.ggma("ggwv", ggmc(int ), (int)183);
        }
        var0_2 = ky.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Glow2D Uniforms";
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ky.ggma("ggww", ggmc(int ), (int)184);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)ky.ggma("ggwx", ggmc(int ), (int)185);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ky.ggma("ggwy", ggmc(int ), (int)186);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ky.ggma("ggwz", ggmc(int ), (int)187);
        ** while (!var2)
lbl58:
        // 1 sources

        throw null;
    }

    public ky() {
    }

    private static float ggqp(int n2) {
        return Float.intBitsToFloat(ggmd[n2] ^ ggme[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block79: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ky.nn - ky.ggma("ggtx", gglx(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ky.ggma("ggty", ggmc(int ), (int)138)) break;
                v0 /* !! */  = (long)ky.ggma("ggtz", ggmc(int ), (int)139);
            }
            var2 = ky.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ky.nn - ky.ggma("ggua", gglx(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ky.ggma("ggub", ggmc(int ), (int)140)) break;
                v1 /* !! */  = (long)ky.ggma("gguc", ggmc(int ), (int)141);
            }
            var1_1 /* !! */  = ky.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ky.nn - ky.ggma("ggud", gglx(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ky.ggma("ggue", ggmc(int ), (int)142)) break;
                v2 /* !! */  = (long)ky.ggma("gguf", ggmc(int ), (int)143);
            }
            var0_2 = ky.a;
            if (var2) {
                throw null;
lbl21:
                // 11 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = ky.nn - ky.ggma("ggug", gglx(int ), (int)65)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ky.ggma("gguh", ggmc(int ), (int)144)) break;
                v3 /* !! */  = (long)ky.ggma("ggui", ggmc(int ), (int)145);
            }
            if (ky.uniformBuffer == null) break block79;
            if (var0_2 || var0_2) ** GOTO lbl21
            v4 /* !! */  = ky.nn;
            if (true) ** GOTO lbl35
            block51: while (true) {
                v4 /* !! */  = (long)(v5 - ky.ggma("gguj", gglx(int ), (int)66));
lbl35:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1744224477: {
                        v5 = ky.ggma("gguk", gglx(int ), (int)67);
                        continue block51;
                    }
                    case -972083954: {
                        break block51;
                    }
                    case 546776095: {
                        v5 = ky.ggma("ggul", gglx(int ), (int)68);
                        continue block51;
                    }
                }
                break;
            }
            v6 /* !! */  = ky.nn;
            if (true) ** GOTO lbl48
            block52: while (true) {
                v6 /* !! */  = (long)(ky.ggma("ggun", gglx(int ), (int)70) - ky.ggma("ggum", gglx(int ), (int)69));
lbl48:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -983367552: {
                        continue block52;
                    }
                    case -972083954: {
                        break block52;
                    }
                }
                break;
            }
            ky.uniformBuffer.close();
            if (var0_2 || var0_2) ** GOTO lbl21
            v7 /* !! */  = ky.nn;
            if (true) ** GOTO lbl59
            block53: while (true) {
                v7 /* !! */  = (long)(ky.ggma("ggup", gglx(int ), (int)72) - ky.ggma("gguo", gglx(int ), (int)71));
lbl59:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -972083954: {
                        break block53;
                    }
                    case 1002682791: {
                        continue block53;
                    }
                }
                break;
            }
            ky.uniformBuffer = null;
            if (var0_2) ** GOTO lbl21
        }
        if (var0_2) ** GOTO lbl21
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl21
                v8 /* !! */  = ky.nn;
                if (true) ** GOTO lbl76
                block54: while (true) {
                    v8 /* !! */  = (long)(v9 - ky.ggma("gguq", gglx(int ), (int)73));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1295335584: {
                            v9 = ky.ggma("ggur", gglx(int ), (int)74);
                            continue block54;
                        }
                        case -972083954: {
                            break block54;
                        }
                        case 922138341: {
                            v9 = ky.ggma("ggus", gglx(int ), (int)75);
                            continue block54;
                        }
                    }
                    break;
                }
                if (ky.uniformData == null) ** GOTO lbl106
                if (var0_2 || var0_2) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ky.nn - ky.ggma("ggut", gglx(int ), (int)76)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ky.ggma("gguu", ggmc(int ), (int)146)) break;
                    v10 /* !! */  = (long)ky.ggma("gguv", ggmc(int ), (int)147);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = ky.nn - ky.ggma("gguw", gglx(int ), (int)77)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ky.ggma("ggux", ggmc(int ), (int)148)) break;
                    v11 /* !! */  = (long)ky.ggma("gguy", ggmc(int ), (int)149);
                }
                MemoryUtil.memFree((Buffer)ky.uniformData);
                if (var0_2 || var0_2) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = ky.nn - ky.ggma("gguz", gglx(int ), (int)78)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ky.ggma("ggva", ggmc(int ), (int)150)) break;
                    v12 /* !! */  = (long)ky.ggma("ggvb", ggmc(int ), (int)151);
                }
                ky.uniformData = null;
                if (var0_2) ** GOTO lbl21
lbl106:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl21
                v13 /* !! */  = ky.nn;
                if (true) ** GOTO lbl111
                block58: while (true) {
                    v13 /* !! */  = (long)(v14 - ky.ggma("ggvc", gglx(int ), (int)79));
lbl111:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2034485417: {
                            v14 = ky.ggma("ggvd", gglx(int ), (int)80);
                            continue block58;
                        }
                        case -972083954: {
                            break block58;
                        }
                        case 859638407: {
                            v14 = ky.ggma("ggve", gglx(int ), (int)81);
                            continue block58;
                        }
                        case 1503931673: {
                            v14 = ky.ggma("ggvf", gglx(int ), (int)82);
                            continue block58;
                        }
                    }
                    break;
                }
                ky.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl127:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ky.ggma("ggvg", ggmc(int ), (int)152);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var1_1 /* !! */  = (int)ky.ggma("ggvh", ggmc(int ), (int)153);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl137:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)ky.ggma("ggvi", ggmc(int ), (int)154);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 3: {
                var1_1 /* !! */  = (int)ky.ggma("ggvj", ggmc(int ), (int)155);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl147:
            // 3 sources

            case 4: {
                var1_1 /* !! */  = (int)ky.ggma("ggvk", ggmc(int ), (int)156);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl152:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)ky.ggma("ggvl", ggmc(int ), (int)157);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 6: {
                var1_1 /* !! */  = (int)ky.ggma("ggvm", ggmc(int ), (int)158);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 7: {
                var1_1 /* !! */  = (int)ky.ggma("ggvn", ggmc(int ), (int)159);
                if (!var2) ** GOTO lbl147
                throw null;
            }
lbl166:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)ky.ggma("ggvo", ggmc(int ), (int)160);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 9: {
                var1_1 /* !! */  = (int)ky.ggma("ggvp", ggmc(int ), (int)161);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 10: {
                var1_1 /* !! */  = (int)ky.ggma("ggvq", ggmc(int ), (int)162);
                if (!var2) ** GOTO lbl152
                throw null;
            }
lbl180:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)ky.ggma("ggvr", ggmc(int ), (int)163);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl185:
            // 3 sources

            case 12: {
                var1_1 /* !! */  = (int)ky.ggma("ggvs", ggmc(int ), (int)164);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl190:
            // 3 sources

            case 13: {
                var1_1 /* !! */  = (int)ky.ggma("ggvt", ggmc(int ), (int)165);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ky.ggma("ggvu", ggmc(int ), (int)166);
                    if (!var2) ** GOTO lbl127
                    throw null;
                }
            }
lbl200:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)ky.ggma("ggvv", ggmc(int ), (int)167);
                if (!var2) ** GOTO lbl185
                throw null;
            }
lbl204:
            // 4 sources

            case 16: {
                var1_1 /* !! */  = (int)ky.ggma("ggvw", ggmc(int ), (int)168);
                if (!var2) ** GOTO lbl137
                throw null;
            }
lbl208:
            // 3 sources

            case 17: {
                var1_1 /* !! */  = (int)ky.ggma("ggvx", ggmc(int ), (int)169);
                if (!var2) ** GOTO lbl147
                throw null;
            }
lbl212:
            // 3 sources

            case 18: {
                var1_1 /* !! */  = (int)ky.ggma("ggvy", ggmc(int ), (int)170);
                if (!var2) ** GOTO lbl166
                throw null;
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)ky.ggma("ggvz", ggmc(int ), (int)171);
        ** while (!var2)
lbl219:
        // 1 sources

        throw null;
    }

    private static void ggxd() {
        ky.ggme[100] = -1787898066;
        ky.ggme[101] = -1784730817;
        ky.ggme[102] = -654195796;
        ky.ggme[103] = 497844844;
        ky.ggme[104] = -241049358;
        ky.ggme[105] = -1358018295;
        ky.ggme[106] = 663625309;
        ky.ggme[107] = 2038455128;
        ky.ggme[108] = -116130340;
        ky.ggme[109] = -1577284677;
        ky.ggme[110] = -309049589;
        ky.ggme[111] = 875394892;
        ky.ggme[112] = -1422152750;
        ky.ggme[113] = 716274343;
        ky.ggme[114] = -489137342;
        ky.ggme[115] = 492640279;
        ky.ggme[116] = 213647555;
        ky.ggme[117] = -1206867823;
        ky.ggme[118] = 550580440;
        ky.ggme[119] = -1773956332;
        ky.ggme[120] = 888183291;
        ky.ggme[121] = 1654919793;
        ky.ggme[122] = -135870620;
        ky.ggme[123] = -1508583544;
        ky.ggme[124] = 1350085815;
        ky.ggme[125] = -1826150794;
        ky.ggme[126] = -1331569425;
        ky.ggme[127] = 684750670;
        ky.ggme[128] = 218762236;
        ky.ggme[129] = -1173571762;
        ky.ggme[130] = 1123260908;
        ky.ggme[131] = 1513297333;
        ky.ggme[132] = -1643235420;
        ky.ggme[133] = -1604690012;
        ky.ggme[134] = 347572325;
        ky.ggme[135] = -1290444631;
        ky.ggme[136] = 924371128;
        ky.ggme[137] = -1495787030;
        ky.ggme[138] = -899166459;
        ky.ggme[139] = -751103913;
        ky.ggme[140] = 865334249;
        ky.ggme[141] = 803137843;
        ky.ggme[142] = -224430483;
        ky.ggme[143] = -1575939246;
        ky.ggme[144] = -957328232;
        ky.ggme[145] = -1725573411;
        ky.ggme[146] = -1573742462;
        ky.ggme[147] = 1369476891;
        ky.ggme[148] = 689515631;
        ky.ggme[149] = 1907823903;
        ky.ggme[150] = -1979941966;
        ky.ggme[151] = 996359192;
        ky.ggme[152] = -1291798493;
        ky.ggme[153] = 762843460;
        ky.ggme[154] = 1420574497;
        ky.ggme[155] = 91370034;
        ky.ggme[156] = 745715475;
        ky.ggme[157] = -1137762800;
        ky.ggme[158] = 1613737990;
        ky.ggme[159] = -1086361487;
        ky.ggme[160] = 1204415020;
        ky.ggme[161] = 1897075882;
        ky.ggme[162] = 1112792630;
        ky.ggme[163] = -1103305078;
        ky.ggme[164] = 832775458;
        ky.ggme[165] = -705522210;
        ky.ggme[166] = -247195387;
        ky.ggme[167] = -1287644248;
        ky.ggme[168] = -1017464930;
        ky.ggme[169] = -51171774;
        ky.ggme[170] = 239415472;
        ky.ggme[171] = 1867712962;
        ky.ggme[172] = 517631314;
        ky.ggme[173] = -1186792513;
        ky.ggme[174] = 587012487;
        ky.ggme[175] = 1999616458;
        ky.ggme[176] = -360566975;
        ky.ggme[177] = -1317210548;
        ky.ggme[178] = 1453949432;
        ky.ggme[179] = -420214806;
        ky.ggme[180] = -884328355;
        ky.ggme[181] = 632559271;
        ky.ggme[182] = 790930712;
        ky.ggme[183] = 448188674;
        ky.ggme[184] = 400710303;
        ky.ggme[185] = -1593816713;
        ky.ggme[186] = -965446405;
        ky.ggme[187] = -1447301609;
    }

    private static long gglx(int n2) {
        return ggly[n2] ^ gglz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, int var4_4, float var5_5) {
        block146: {
            block145: {
                block144: {
                    var18_6 = ky.c;
                    var17_7 /* !! */  = ky.b;
                    var16_8 = ky.a;
                    if (var18_6) {
                        throw null;
lbl6:
                        // 42 sources

                        return;
                    }
                    if (var16_8 || var16_8) ** GOTO lbl6
                    if (ky.pipeline != null) break block144;
                    if (var16_8 || var16_8) ** GOTO lbl6
                    ky.init();
                    if (var16_8) ** GOTO lbl6
                }
                if (var16_8 || var16_8) ** GOTO lbl6
                if (ky.pipeline == null) break block145;
                if (var16_8) ** GOTO lbl6
                if (ky.uniformBuffer != null) break block146;
                if (var16_8) ** GOTO lbl6
            }
            if (var16_8 || var16_8) ** GOTO lbl6
            return;
        }
        if (var16_8 || var16_8) ** GOTO lbl6
        var6_9 = (float)(var4_4 >> ky.ggma("ggqn", ggmc(int ), (int)51) & ky.ggma("ggqo", ggmc(int ), (int)52)) / ky.ggma("ggqq", ggqp(int ), (int)53);
        if (var16_8 || var16_8) ** GOTO lbl6
        var7_10 = (float)(var4_4 >> ky.ggma("ggqr", ggmc(int ), (int)54) & ky.ggma("ggqs", ggmc(int ), (int)55)) / ky.ggma("ggqt", ggqp(int ), (int)56);
        if (var16_8 || var16_8) ** GOTO lbl6
        var8_11 = (float)(var4_4 & ky.ggma("ggqu", ggmc(int ), (int)57)) / ky.ggma("ggqv", ggqp(int ), (int)58);
        if (var16_8 || var16_8) ** GOTO lbl6
        var9_12 = (float)(var4_4 >> ky.ggma("ggqw", ggmc(int ), (int)59) & ky.ggma("ggqx", ggmc(int ), (int)60)) / ky.ggma("ggqy", ggqp(int ), (int)61);
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13 = ky.uniformData;
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.clear();
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.position((int)ky.ggma("ggqz", ggmc(int ), (int)62));
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var5_5);
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.putFloat(var6_9).putFloat(var7_10).putFloat(var8_11).putFloat(var9_12);
        if (var16_8 || var16_8) ** GOTO lbl6
        var10_13.flip();
        if (var16_8) ** GOTO lbl6
        if (var17_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var16_8) ** GOTO lbl6
                var11_14 = RenderSystem.getDevice().createCommandEncoder();
                if (var16_8 || var16_8) ** GOTO lbl6
                var11_14.writeToBuffer(ky.uniformBuffer.slice(), var10_13);
                if (var16_8 || var16_8) ** GOTO lbl6
                var12_15 = class_310.method_1551().method_1522();
                if (var16_8 || var16_8) ** GOTO lbl6
                var13_16 = var11_14.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var12_15.method_71639(), OptionalInt.empty());
                if (var16_8) ** GOTO lbl6
                try {
                    if (var16_8) ** GOTO lbl6
                    oq.applyToPass(var13_16);
                    if (var16_8 || var16_8) ** GOTO lbl6
                    var13_16.setPipeline(ky.pipeline);
                    if (var16_8 || var16_8) ** GOTO lbl6
                    var13_16.setUniform("Uniforms", ky.uniformBuffer);
                    if (var16_8 || var16_8) ** GOTO lbl6
                    var13_16.draw((int)ky.ggma("ggra", ggmc(int ), (int)63), (int)ky.ggma("ggrb", ggmc(int ), (int)64));
                    if (var16_8 || var16_8) ** GOTO lbl6
                    if (var13_16 == null) ** GOTO lbl107
                    if (var16_8) ** GOTO lbl6
                }
                catch (Throwable var14_17) {
                    if (var16_8) ** GOTO lbl6
                    if (var13_16 == null) ** GOTO lbl100
                    if (var16_8) ** GOTO lbl6
                    try {
                        if (var16_8) ** GOTO lbl6
                        var13_16.close();
                        if (var16_8 || var16_8) ** GOTO lbl6
                        ** if (!var18_6) goto lbl-1000
                    }
                    catch (Throwable var15_18) {
                        if (var16_8) ** GOTO lbl6
                        var14_17.addSuppressed(var15_18);
                        if (var16_8) ** GOTO lbl6
                    }
lbl-1000:
                    // 1 sources

                    {
                        throw null;
                    }
lbl-1000:
                    // 1 sources

                    {
                    }
lbl100:
                    // 3 sources

                    if (var16_8 || var16_8) ** GOTO lbl6
                    throw var14_17;
                }
                var13_16.close();
                if (var16_8) ** GOTO lbl6
                if (var18_6) {
                    throw null;
                }
lbl107:
                // 3 sources

                if (!var16_8 && !var16_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var17_7 /* !! */  = (int)ky.ggma("ggrc", ggmc(int ), (int)65);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 1: {
                var17_7 /* !! */  = (int)ky.ggma("ggrd", ggmc(int ), (int)66);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 2: {
                var17_7 /* !! */  = (int)ky.ggma("ggre", ggmc(int ), (int)67);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 3: {
                var17_7 /* !! */  = (int)ky.ggma("ggrf", ggmc(int ), (int)68);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl130:
            // 3 sources

            case 4: {
                var17_7 /* !! */  = (int)ky.ggma("ggrg", ggmc(int ), (int)69);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl135:
            // 3 sources

            case 5: {
                var17_7 /* !! */  = (int)ky.ggma("ggrh", ggmc(int ), (int)70);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl140:
            // 2 sources

            case 6: {
                var17_7 /* !! */  = (int)ky.ggma("ggri", ggmc(int ), (int)71);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 7: {
                var17_7 /* !! */  = (int)ky.ggma("ggrj", ggmc(int ), (int)72);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl396
            }
lbl150:
            // 2 sources

            case 8: {
                var17_7 /* !! */  = (int)ky.ggma("ggrk", ggmc(int ), (int)73);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 9: {
                var17_7 /* !! */  = (int)ky.ggma("ggrl", ggmc(int ), (int)74);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl160:
            // 2 sources

            case 10: {
                var17_7 /* !! */  = (int)ky.ggma("ggrm", ggmc(int ), (int)75);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl165:
            // 4 sources

            case 11: {
                var17_7 /* !! */  = (int)ky.ggma("ggrn", ggmc(int ), (int)76);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl392
            }
            case 12: {
                var17_7 /* !! */  = (int)ky.ggma("ggro", ggmc(int ), (int)77);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl404
            }
lbl175:
            // 3 sources

            case 13: {
                var17_7 /* !! */  = (int)ky.ggma("ggrp", ggmc(int ), (int)78);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl180:
            // 3 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_7 /* !! */  = (int)ky.ggma("ggrq", ggmc(int ), (int)79);
                    if (var18_6) {
                        throw null;
                    }
                    ** GOTO lbl392
                    break;
                }
            }
lbl186:
            // 2 sources

            case 15: {
                var17_7 /* !! */  = (int)ky.ggma("ggrr", ggmc(int ), (int)80);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 16: {
                var17_7 /* !! */  = (int)ky.ggma("ggrs", ggmc(int ), (int)81);
                if (!var18_6) ** GOTO lbl165
                throw null;
            }
            case 17: {
                var17_7 /* !! */  = (int)ky.ggma("ggrt", ggmc(int ), (int)82);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl200:
            // 2 sources

            case 18: {
                var17_7 /* !! */  = (int)ky.ggma("ggru", ggmc(int ), (int)83);
                if (!var18_6) ** GOTO lbl150
                throw null;
            }
lbl204:
            // 5 sources

            case 19: {
                var17_7 /* !! */  = (int)ky.ggma("ggrv", ggmc(int ), (int)84);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl209:
            // 3 sources

            case 20: {
                var17_7 /* !! */  = (int)ky.ggma("ggrw", ggmc(int ), (int)85);
                if (!var18_6) ** GOTO lbl160
                throw null;
            }
lbl213:
            // 2 sources

            case 21: {
                var17_7 /* !! */  = (int)ky.ggma("ggrx", ggmc(int ), (int)86);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl218:
            // 2 sources

            case 22: {
                var17_7 /* !! */  = (int)ky.ggma("ggry", ggmc(int ), (int)87);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 23: {
                var17_7 /* !! */  = (int)ky.ggma("ggrz", ggmc(int ), (int)88);
                if (!var18_6) ** GOTO lbl200
                throw null;
            }
lbl227:
            // 2 sources

            case 24: {
                var17_7 /* !! */  = (int)ky.ggma("ggsa", ggmc(int ), (int)89);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl232:
            // 2 sources

            case 25: {
                var17_7 /* !! */  = (int)ky.ggma("ggsb", ggmc(int ), (int)90);
                if (!var18_6) ** GOTO lbl213
                throw null;
            }
lbl236:
            // 2 sources

            case 26: {
                var17_7 /* !! */  = (int)ky.ggma("ggsc", ggmc(int ), (int)91);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl241:
            // 3 sources

            case 27: {
                var17_7 /* !! */  = (int)ky.ggma("ggsd", ggmc(int ), (int)92);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl246:
            // 2 sources

            case 28: {
                do {
                    var17_7 /* !! */  = (int)ky.ggma("ggse", ggmc(int ), (int)93);
                } while (!var18_6);
                throw null;
            }
lbl251:
            // 2 sources

            case 29: {
                var17_7 /* !! */  = (int)ky.ggma("ggsf", ggmc(int ), (int)94);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl256:
            // 2 sources

            case 30: {
                var17_7 /* !! */  = (int)ky.ggma("ggsg", ggmc(int ), (int)95);
                if (!var18_6) ** GOTO lbl241
                throw null;
            }
lbl260:
            // 2 sources

            case 31: {
                var17_7 /* !! */  = (int)ky.ggma("ggsh", ggmc(int ), (int)96);
                if (!var18_6) ** GOTO lbl204
                throw null;
            }
lbl264:
            // 3 sources

            case 32: {
                var17_7 /* !! */  = (int)ky.ggma("ggsi", ggmc(int ), (int)97);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl396
            }
            case 33: {
                var17_7 /* !! */  = (int)ky.ggma("ggsj", ggmc(int ), (int)98);
                if (!var18_6) ** GOTO lbl209
                throw null;
            }
lbl273:
            // 2 sources

            case 34: {
                var17_7 /* !! */  = (int)ky.ggma("ggsk", ggmc(int ), (int)99);
                if (!var18_6) ** GOTO lbl135
                throw null;
            }
lbl277:
            // 2 sources

            case 35: {
                var17_7 /* !! */  = (int)ky.ggma("ggsl", ggmc(int ), (int)100);
                if (!var18_6) ** GOTO lbl204
                throw null;
            }
lbl281:
            // 6 sources

            case 36: {
                var17_7 /* !! */  = (int)ky.ggma("ggsm", ggmc(int ), (int)101);
                if (!var18_6) ** GOTO lbl140
                throw null;
            }
            case 37: {
                var17_7 /* !! */  = (int)ky.ggma("ggsn", ggmc(int ), (int)102);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 38: {
                var17_7 /* !! */  = (int)ky.ggma("ggso", ggmc(int ), (int)103);
                if (!var18_6) ** GOTO lbl251
                throw null;
            }
lbl294:
            // 2 sources

            case 39: {
                var17_7 /* !! */  = (int)ky.ggma("ggsp", ggmc(int ), (int)104);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 40: {
                var17_7 /* !! */  = (int)ky.ggma("ggsq", ggmc(int ), (int)105);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl304:
            // 3 sources

            case 41: {
                var17_7 /* !! */  = (int)ky.ggma("ggsr", ggmc(int ), (int)106);
                if (!var18_6) ** GOTO lbl264
                throw null;
            }
            case 42: {
                var17_7 /* !! */  = (int)ky.ggma("ggss", ggmc(int ), (int)107);
                if (!var18_6) ** GOTO lbl281
                throw null;
            }
            case 43: {
                var17_7 /* !! */  = (int)ky.ggma("ggst", ggmc(int ), (int)108);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl317:
            // 2 sources

            case 44: {
                var17_7 /* !! */  = (int)ky.ggma("ggsu", ggmc(int ), (int)109);
                if (!var18_6) ** GOTO lbl165
                throw null;
            }
            case 45: {
                var17_7 /* !! */  = (int)ky.ggma("ggsv", ggmc(int ), (int)110);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl326:
            // 3 sources

            case 46: {
                var17_7 /* !! */  = (int)ky.ggma("ggsw", ggmc(int ), (int)111);
                if (!var18_6) ** GOTO lbl209
                throw null;
            }
            case 47: {
                var17_7 /* !! */  = (int)ky.ggma("ggsx", ggmc(int ), (int)112);
                if (!var18_6) ** GOTO lbl256
                throw null;
            }
            case 48: {
                var17_7 /* !! */  = (int)ky.ggma("ggsy", ggmc(int ), (int)113);
                if (!var18_6) ** GOTO lbl180
                throw null;
            }
lbl338:
            // 3 sources

            case 49: {
                var17_7 /* !! */  = (int)ky.ggma("ggsz", ggmc(int ), (int)114);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 50: {
                var17_7 /* !! */  = (int)ky.ggma("ggta", ggmc(int ), (int)115);
                if (var18_6) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl348:
            // 3 sources

            case 51: {
                var17_7 /* !! */  = (int)ky.ggma("ggtb", ggmc(int ), (int)116);
                if (!var18_6) ** GOTO lbl175
                throw null;
            }
lbl352:
            // 2 sources

            case 52: {
                var17_7 /* !! */  = (int)ky.ggma("ggtc", ggmc(int ), (int)117);
                if (!var18_6) ** GOTO lbl277
                throw null;
            }
            case 53: {
                var17_7 /* !! */  = (int)ky.ggma("ggtd", ggmc(int ), (int)118);
                if (!var18_6) ** GOTO lbl204
                throw null;
            }
lbl360:
            // 3 sources

            case 54: {
                var17_7 /* !! */  = (int)ky.ggma("ggte", ggmc(int ), (int)119);
                if (!var18_6) ** GOTO lbl180
                throw null;
            }
            case 55: {
                var17_7 /* !! */  = (int)ky.ggma("ggtf", ggmc(int ), (int)120);
                if (!var18_6) ** GOTO lbl175
                throw null;
            }
            case 56: {
                var17_7 /* !! */  = (int)ky.ggma("ggtg", ggmc(int ), (int)121);
                if (!var18_6) ** GOTO lbl232
                throw null;
            }
            case 57: {
                var17_7 /* !! */  = (int)ky.ggma("ggth", ggmc(int ), (int)122);
                if (!var18_6) ** GOTO lbl260
                throw null;
            }
lbl376:
            // 2 sources

            case 58: {
                var17_7 /* !! */  = (int)ky.ggma("ggti", ggmc(int ), (int)123);
                if (!var18_6) ** GOTO lbl348
                throw null;
            }
lbl380:
            // 2 sources

            case 59: {
                var17_7 /* !! */  = (int)ky.ggma("ggtj", ggmc(int ), (int)124);
                if (!var18_6) ** GOTO lbl326
                throw null;
            }
            case 60: {
                var17_7 /* !! */  = (int)ky.ggma("ggtk", ggmc(int ), (int)125);
                if (!var18_6) ** GOTO lbl130
                throw null;
            }
            case 61: {
                var17_7 /* !! */  = (int)ky.ggma("ggtl", ggmc(int ), (int)126);
                if (!var18_6) ** GOTO lbl165
                throw null;
            }
lbl392:
            // 5 sources

            case 62: {
                var17_7 /* !! */  = (int)ky.ggma("ggtm", ggmc(int ), (int)127);
                if (!var18_6) ** GOTO lbl304
                throw null;
            }
lbl396:
            // 3 sources

            case 63: {
                var17_7 /* !! */  = (int)ky.ggma("ggtn", ggmc(int ), (int)128);
                if (!var18_6) ** GOTO lbl326
                throw null;
            }
            case 64: {
                var17_7 /* !! */  = (int)ky.ggma("ggto", ggmc(int ), (int)129);
                if (!var18_6) ** GOTO lbl236
                throw null;
            }
lbl404:
            // 2 sources

            case 65: {
                var17_7 /* !! */  = (int)ky.ggma("ggtp", ggmc(int ), (int)130);
                if (!var18_6) ** GOTO lbl304
                throw null;
            }
            case 66: {
                var17_7 /* !! */  = (int)ky.ggma("ggtq", ggmc(int ), (int)131);
                if (!var18_6) ** GOTO lbl227
                throw null;
            }
lbl412:
            // 2 sources

            case 67: {
                var17_7 /* !! */  = (int)ky.ggma("ggtr", ggmc(int ), (int)132);
                if (!var18_6) ** GOTO lbl246
                throw null;
            }
lbl416:
            // 2 sources

            case 68: {
                var17_7 /* !! */  = (int)ky.ggma("ggts", ggmc(int ), (int)133);
                if (var18_6) {
                    throw null;
                }
            }
lbl420:
            // 4 sources

            case 69: {
                var17_7 /* !! */  = (int)ky.ggma("ggtt", ggmc(int ), (int)134);
                if (!var18_6) ** GOTO lbl135
                throw null;
            }
            case 70: {
                var17_7 /* !! */  = (int)ky.ggma("ggtu", ggmc(int ), (int)135);
                if (!var18_6) ** GOTO lbl281
                throw null;
            }
lbl428:
            // 4 sources

            case 71: {
                var17_7 /* !! */  = (int)ky.ggma("ggtv", ggmc(int ), (int)136);
                if (!var18_6) ** GOTO lbl281
                throw null;
            }
            case 72: 
        }
        var17_7 /* !! */  = (int)ky.ggma("ggtw", ggmc(int ), (int)137);
        ** while (!var18_6)
lbl435:
        // 1 sources

        throw null;
    }

    public static CallSite ggma(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static int ggmc(int n2) {
        return ggmd[n2] ^ ggme[n2];
    }
}

