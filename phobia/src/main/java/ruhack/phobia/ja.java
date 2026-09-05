/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_3965
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kg;
import ruhack.phobia.ma;
import ruhack.phobia.nd;
import ruhack.phobia.nj;

public class ja
extends ds {
    static final long ce = -6258502096327511841L;
    private static final double SMOOTHING_SPEED = 14.0;
    private static int[] andj;
    private final List<class_238> targetBoxesBuffer;
    private static int[] andi;
    public static final boolean a;
    private final kb smoothness;
    private static long[] andd;
    private final kg scale;
    private final kg speed;
    public static final int b;
    private long lastRenderNanos;
    private static long[] ande;
    private final kg alpha;
    public static final boolean c;
    private final List<class_238> animatedBoxes;

    private static /* synthetic */ double anip(int n2) {
        return Double.longBitsToDouble(andd[n2] ^ ande[n2]);
    }

    private static /* synthetic */ long andc(int n2) {
        return andd[n2] ^ ande[n2];
    }

    static {
        andi = new int[258];
        andj = new int[258];
        ja.anrs();
        ja.anru();
        ja.anrw();
        ja.anry();
        ja.ansa();
        ja.ansc();
        andd = new long[94];
        ande = new long[94];
        ja.anse();
        ja.ansf();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetAnimation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ja.ce - ja.andf("anqo", andc(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ja.andf("anqq", andh(int ), (int)240)) break;
            v0 /* !! */  = (long)ja.andf("anqr", andh(int ), (int)241);
        }
        var3_1 = ja.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ja.ce - ja.andf("anqs", andc(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ja.andf("anqt", andh(int ), (int)242)) break;
            v1 /* !! */  = (long)ja.andf("anqv", andh(int ), (int)243);
        }
        var2_2 = ja.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ja.ce - ja.andf("anqw", andc(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ja.andf("anqx", andh(int ), (int)244)) break;
            v2 /* !! */  = (long)ja.andf("anqy", andh(int ), (int)245);
        }
        var1_3 = ja.a;
        if (var3_1) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ja.ce - ja.andf("anqz", andc(int ), (int)87)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ja.andf("anra", andh(int ), (int)246)) break;
            v3 /* !! */  = (long)ja.andf("anrb", andh(int ), (int)247);
        }
        v4 /* !! */  = ja.ce;
        if (true) ** GOTO lbl33
        block11: while (true) {
            v4 /* !! */  = (long)(v5 - ja.andf("anrc", andc(int ), (int)88));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1705217825: {
                    break block11;
                }
                case -1483971161: {
                    v5 = ja.andf("anrd", andc(int ), (int)89);
                    continue block11;
                }
                case 299013725: {
                    v5 = ja.andf("anre", andc(int ), (int)90);
                    continue block11;
                }
                case 2052723929: {
                    v5 = ja.andf("anrf", andc(int ), (int)91);
                    continue block11;
                }
            }
            break;
        }
        this.animatedBoxes.clear();
        if (var1_3 || var1_3) ** GOTO lbl21
        v6 = ja.andf("anrg", andc(int ), (int)92);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = ja.ce - ja.andf("anrh", andc(int ), (int)93)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ja.andf("anri", andh(int ), (int)248)) break;
            v7 /* !! */  = (long)ja.andf("anrj", andh(int ), (int)249);
        }
        this.lastRenderNanos = (long)v6;
        ** while (var1_3 || var1_3)
lbl55:
        // 1 sources

    }

    private static /* synthetic */ void ansf() {
        ja.ande[0] = -8598300216447732613L;
        ja.ande[1] = -6969215664407161663L;
        ja.ande[2] = -8553651613899272940L;
        ja.ande[3] = 3244033480140226937L;
        ja.ande[4] = 5454887938624270099L;
        ja.ande[5] = 1917422771275537616L;
        ja.ande[6] = -1500006134067994740L;
        ja.ande[7] = 6731337975644998761L;
        ja.ande[8] = 3324486598327979491L;
        ja.ande[9] = -2280024659044968801L;
        ja.ande[10] = 5127017434835696308L;
        ja.ande[11] = -4990210417161807251L;
        ja.ande[12] = -4776038611062796417L;
        ja.ande[13] = -5625640821384306487L;
        ja.ande[14] = 8648992738459893055L;
        ja.ande[15] = 7660166275397932623L;
        ja.ande[16] = 2377578265591155044L;
        ja.ande[17] = 2910979457415655659L;
        ja.ande[18] = -8708572885461996413L;
        ja.ande[19] = 2319478550912069430L;
        ja.ande[20] = 1459270174689047182L;
        ja.ande[21] = -2735244153565581150L;
        ja.ande[22] = -8827106168668731733L;
        ja.ande[23] = -8761950173122892861L;
        ja.ande[24] = -7297898320778755939L;
        ja.ande[25] = -4694195479166002459L;
        ja.ande[26] = 6877663168216753820L;
        ja.ande[27] = 9058607674171131830L;
        ja.ande[28] = 3255255835815356424L;
        ja.ande[29] = -5010175576668086336L;
        ja.ande[30] = -3200639495534469793L;
        ja.ande[31] = -5484815575890791576L;
        ja.ande[32] = 5793911450249743784L;
        ja.ande[33] = -4152769699524211373L;
        ja.ande[34] = 3266606567289618376L;
        ja.ande[35] = 7368306096299061185L;
        ja.ande[36] = -2584393133700356087L;
        ja.ande[37] = -6415314689435264615L;
        ja.ande[38] = 2896729878248492719L;
        ja.ande[39] = 3564724148576534809L;
        ja.ande[40] = 1596076872772223384L;
        ja.ande[41] = -2704046716198253509L;
        ja.ande[42] = -2366674003608970977L;
        ja.ande[43] = 6713354932243693061L;
        ja.ande[44] = -5931098558513767282L;
        ja.ande[45] = 4003410829910831649L;
        ja.ande[46] = -2894495741139093040L;
        ja.ande[47] = -4995200163021292116L;
        ja.ande[48] = -6585345426992905110L;
        ja.ande[49] = 3579239873223618476L;
        ja.ande[50] = -2562168969762801526L;
        ja.ande[51] = 6566520586214176803L;
        ja.ande[52] = 2628511418052047446L;
        ja.ande[53] = -6841059417688313775L;
        ja.ande[54] = -646811938084249874L;
        ja.ande[55] = 4106594891562198175L;
        ja.ande[56] = -7636832321033860462L;
        ja.ande[57] = 8422624732822814587L;
        ja.ande[58] = 5510269032840326973L;
        ja.ande[59] = -8553446292738838474L;
        ja.ande[60] = -1869799841847699210L;
        ja.ande[61] = -2605985755266400853L;
        ja.ande[62] = -2456473959315550132L;
        ja.ande[63] = 7737722665576068508L;
        ja.ande[64] = -1081549265683512264L;
        ja.ande[65] = -2507002216183080889L;
        ja.ande[66] = 6537556637906206097L;
        ja.ande[67] = 7214310442436246268L;
        ja.ande[68] = -6033821376352894992L;
        ja.ande[69] = -6405759442060565307L;
        ja.ande[70] = -4701534446031751343L;
        ja.ande[71] = -3093068672637953471L;
        ja.ande[72] = -2754132330575497707L;
        ja.ande[73] = 6766169320601086759L;
        ja.ande[74] = -4489993667691080702L;
        ja.ande[75] = 8839925416535075084L;
        ja.ande[76] = -6796748328940994912L;
        ja.ande[77] = 4400350221188857633L;
        ja.ande[78] = 1820418240360043261L;
        ja.ande[79] = -8401084062295051660L;
        ja.ande[80] = -1116106997805310925L;
        ja.ande[81] = 644025875750250889L;
        ja.ande[82] = 8662283669830048105L;
        ja.ande[83] = 1979310352471245513L;
        ja.ande[84] = 778635680939008540L;
        ja.ande[85] = -7968903065128431344L;
        ja.ande[86] = 441596509198307303L;
        ja.ande[87] = -3364599228044032243L;
        ja.ande[88] = -671614891368393534L;
        ja.ande[89] = -303924709492181728L;
        ja.ande[90] = 4119671600381480718L;
        ja.ande[91] = -4451442170711581420L;
        ja.ande[92] = -4682215743199514382L;
        ja.ande[93] = 3876730910333070704L;
    }

    private static /* synthetic */ void anse() {
        ja.andd[0] = -6944005021720248660L;
        ja.andd[1] = 4375875306940199549L;
        ja.andd[2] = 654846451775954658L;
        ja.andd[3] = -2814658698359864275L;
        ja.andd[4] = -4483830276731480285L;
        ja.andd[5] = 8207734770520385154L;
        ja.andd[6] = 6435332267482531339L;
        ja.andd[7] = 5591187178376519827L;
        ja.andd[8] = 5067502808854497440L;
        ja.andd[9] = 1114462166720713151L;
        ja.andd[10] = 6221615841138897509L;
        ja.andd[11] = -6328871613128229942L;
        ja.andd[12] = -3305670795431213061L;
        ja.andd[13] = 3065342921342473090L;
        ja.andd[14] = -2584505033005828617L;
        ja.andd[15] = -1047172231668894313L;
        ja.andd[16] = 810995774554131780L;
        ja.andd[17] = -7216296069828562409L;
        ja.andd[18] = 8067698832340532362L;
        ja.andd[19] = 2319478550913035638L;
        ja.andd[20] = 3107549936306625394L;
        ja.andd[21] = -2735244153565581150L;
        ja.andd[22] = -4976828726705236038L;
        ja.andd[23] = -5053367380750634407L;
        ja.andd[24] = -2633087074478063459L;
        ja.andd[25] = 9148743875464059621L;
        ja.andd[26] = 2353001774342351792L;
        ja.andd[27] = 4953734874407943140L;
        ja.andd[28] = 6162503427867403190L;
        ja.andd[29] = 7005509252478341993L;
        ja.andd[30] = 9216410955564878350L;
        ja.andd[31] = 236826172476811324L;
        ja.andd[32] = -5269730682940248990L;
        ja.andd[33] = 9126634488375570447L;
        ja.andd[34] = 2465139894285865518L;
        ja.andd[35] = -3349456128690854914L;
        ja.andd[36] = 6507112070430360937L;
        ja.andd[37] = 2783037645059298816L;
        ja.andd[38] = 1810138789306435742L;
        ja.andd[39] = -4664774484014663333L;
        ja.andd[40] = -7618226719012105350L;
        ja.andd[41] = -8270312689528786046L;
        ja.andd[42] = 8152495883817374216L;
        ja.andd[43] = 8440820614476462005L;
        ja.andd[44] = -9013819291353348514L;
        ja.andd[45] = -8556125006274024509L;
        ja.andd[46] = -5411571067630739407L;
        ja.andd[47] = -167946601583903003L;
        ja.andd[48] = 6481420982101774652L;
        ja.andd[49] = -4960545802923837652L;
        ja.andd[50] = 7978538416624007037L;
        ja.andd[51] = -4290455795841724130L;
        ja.andd[52] = 6652823912472793657L;
        ja.andd[53] = 3274517231442455590L;
        ja.andd[54] = 557443807129767719L;
        ja.andd[55] = -1378072555752026511L;
        ja.andd[56] = -4502790617300515142L;
        ja.andd[57] = -5217439249484058367L;
        ja.andd[58] = -8178575777533109129L;
        ja.andd[59] = 4825451243658942853L;
        ja.andd[60] = 6903931608824896205L;
        ja.andd[61] = -6754814230161464734L;
        ja.andd[62] = -6980823352526431970L;
        ja.andd[63] = 3786251832112734432L;
        ja.andd[64] = -8532766060597815505L;
        ja.andd[65] = 7776952130688129187L;
        ja.andd[66] = 2899790552394625565L;
        ja.andd[67] = 705759308440576617L;
        ja.andd[68] = -9110298223605746218L;
        ja.andd[69] = -1802510468212481697L;
        ja.andd[70] = 2855145296964965559L;
        ja.andd[71] = 5384412926227416941L;
        ja.andd[72] = -3100316991127724513L;
        ja.andd[73] = -2769443341511797738L;
        ja.andd[74] = 1144030886013031708L;
        ja.andd[75] = -7331011791703647568L;
        ja.andd[76] = -8894986730153415668L;
        ja.andd[77] = -16901423247045666L;
        ja.andd[78] = 6923725384970154906L;
        ja.andd[79] = -6556371561902581617L;
        ja.andd[80] = 3074503332262947292L;
        ja.andd[81] = -3191011974079988838L;
        ja.andd[82] = 6875976379829025624L;
        ja.andd[83] = 2636787959668125614L;
        ja.andd[84] = 6294028404650926361L;
        ja.andd[85] = 4785937478392383576L;
        ja.andd[86] = 6747580323916187581L;
        ja.andd[87] = 7465426512299694710L;
        ja.andd[88] = -1792664255124398528L;
        ja.andd[89] = -6667227920242242225L;
        ja.andd[90] = 8408123140539398655L;
        ja.andd[91] = 799898292109387403L;
        ja.andd[92] = -4682215743199514382L;
        ja.andd[93] = -5586342090835844858L;
    }

    private static /* synthetic */ void ansa() {
        ja.andj[100] = -592867495;
        ja.andj[101] = -1296043190;
        ja.andj[102] = 1158228969;
        ja.andj[103] = -523438938;
        ja.andj[104] = 1481885714;
        ja.andj[105] = -964703254;
        ja.andj[106] = -1316025177;
        ja.andj[107] = -1091661733;
        ja.andj[108] = -1308956614;
        ja.andj[109] = 60869883;
        ja.andj[110] = -1373667776;
        ja.andj[111] = 1359883793;
        ja.andj[112] = -1175152776;
        ja.andj[113] = -163379905;
        ja.andj[114] = -535889461;
        ja.andj[115] = 869551044;
        ja.andj[116] = 1480152958;
        ja.andj[117] = 984245069;
        ja.andj[118] = 1429570271;
        ja.andj[119] = -1744353370;
        ja.andj[120] = 2080055252;
        ja.andj[121] = -1555175928;
        ja.andj[122] = 1958373203;
        ja.andj[123] = -1369832494;
        ja.andj[124] = -77809969;
        ja.andj[125] = 1922885539;
        ja.andj[126] = 1492506133;
        ja.andj[127] = -1486486728;
        ja.andj[128] = -1972361161;
        ja.andj[129] = -1155597961;
        ja.andj[130] = -604901265;
        ja.andj[131] = -556606577;
        ja.andj[132] = 810779176;
        ja.andj[133] = -392877801;
        ja.andj[134] = -451597429;
        ja.andj[135] = 1580094090;
        ja.andj[136] = 727841853;
        ja.andj[137] = 1598161568;
        ja.andj[138] = -363674056;
        ja.andj[139] = -250832311;
        ja.andj[140] = -869405462;
        ja.andj[141] = 989783124;
        ja.andj[142] = -641313042;
        ja.andj[143] = -1047830254;
        ja.andj[144] = 1801072937;
        ja.andj[145] = 320501610;
        ja.andj[146] = -1687439857;
        ja.andj[147] = -1094080448;
        ja.andj[148] = 1991240280;
        ja.andj[149] = -614112737;
        ja.andj[150] = -839595921;
        ja.andj[151] = 1100060282;
        ja.andj[152] = 3651169;
        ja.andj[153] = 1938786064;
        ja.andj[154] = -774705642;
        ja.andj[155] = 1301330216;
        ja.andj[156] = -51657189;
        ja.andj[157] = -1253481013;
        ja.andj[158] = 715266372;
        ja.andj[159] = -229742301;
        ja.andj[160] = -359496446;
        ja.andj[161] = -423024251;
        ja.andj[162] = -577928142;
        ja.andj[163] = -40814588;
        ja.andj[164] = 1659192783;
        ja.andj[165] = -250697679;
        ja.andj[166] = 1581573227;
        ja.andj[167] = 1202148335;
        ja.andj[168] = 1496686248;
        ja.andj[169] = 2070751974;
        ja.andj[170] = -1838222260;
        ja.andj[171] = 341423263;
        ja.andj[172] = 1430909317;
        ja.andj[173] = 1038225751;
        ja.andj[174] = 1006096673;
        ja.andj[175] = -167803540;
        ja.andj[176] = 1805431199;
        ja.andj[177] = 424608052;
        ja.andj[178] = -585990334;
        ja.andj[179] = -1386602436;
        ja.andj[180] = -48519798;
        ja.andj[181] = -1251187136;
        ja.andj[182] = 580428989;
        ja.andj[183] = -1120477860;
        ja.andj[184] = 1664474226;
        ja.andj[185] = 1606809670;
        ja.andj[186] = -891762126;
        ja.andj[187] = -2000843630;
        ja.andj[188] = 1316828072;
        ja.andj[189] = 35990605;
        ja.andj[190] = -1500690946;
        ja.andj[191] = -1861948558;
        ja.andj[192] = 1318858844;
        ja.andj[193] = -1600846582;
        ja.andj[194] = 1890858396;
        ja.andj[195] = 105360624;
        ja.andj[196] = -1624690260;
        ja.andj[197] = -504498539;
        ja.andj[198] = -1566365369;
        ja.andj[199] = 866772534;
    }

    private static /* synthetic */ void anrw() {
        ja.andi[200] = -1779679545;
        ja.andi[201] = -644886190;
        ja.andi[202] = -1841863223;
        ja.andi[203] = 724038847;
        ja.andi[204] = -323160634;
        ja.andi[205] = 953870453;
        ja.andi[206] = -1431445243;
        ja.andi[207] = -1354419820;
        ja.andi[208] = -1807506384;
        ja.andi[209] = 947586635;
        ja.andi[210] = 1338556758;
        ja.andi[211] = 1361524313;
        ja.andi[212] = -338042126;
        ja.andi[213] = -1209627119;
        ja.andi[214] = 740097476;
        ja.andi[215] = 209672325;
        ja.andi[216] = -956230830;
        ja.andi[217] = 1237219660;
        ja.andi[218] = 839576667;
        ja.andi[219] = -1873502551;
        ja.andi[220] = -302036504;
        ja.andi[221] = -1597511937;
        ja.andi[222] = -1332363544;
        ja.andi[223] = 38355093;
        ja.andi[224] = 1596318423;
        ja.andi[225] = -824678539;
        ja.andi[226] = 5625020;
        ja.andi[227] = -1933113970;
        ja.andi[228] = -1959002095;
        ja.andi[229] = -654328430;
        ja.andi[230] = -2111801857;
        ja.andi[231] = 532442976;
        ja.andi[232] = 1746780919;
        ja.andi[233] = 787410270;
        ja.andi[234] = -595033911;
        ja.andi[235] = 416872770;
        ja.andi[236] = 628799436;
        ja.andi[237] = 928253373;
        ja.andi[238] = -1747446742;
        ja.andi[239] = -79516706;
        ja.andi[240] = 2003875158;
        ja.andi[241] = -359171239;
        ja.andi[242] = -507112179;
        ja.andi[243] = -2015792777;
        ja.andi[244] = -1858263964;
        ja.andi[245] = -1332863702;
        ja.andi[246] = -168538891;
        ja.andi[247] = -578026458;
        ja.andi[248] = 1378132091;
        ja.andi[249] = 89304009;
        ja.andi[250] = -1788321670;
        ja.andi[251] = 39587648;
        ja.andi[252] = -1540100821;
        ja.andi[253] = -1626853780;
        ja.andi[254] = 948089280;
        ja.andi[255] = -1765534832;
        ja.andi[256] = -1851457625;
        ja.andi[257] = 1488665920;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<class_238> getTargetBoxes() {
        block105: {
            block104: {
                block103: {
                    block102: {
                        block101: {
                            var9_1 = ja.c;
                            var8_2 /* !! */  = ja.b;
                            var7_3 = ja.a;
                            if (var9_1) {
                                throw null;
lbl6:
                                // 32 sources

                                return null;
                            }
                            if (var7_3 || var7_3) ** GOTO lbl6
                            this.targetBoxesBuffer.clear();
                            if (var7_3 || var7_3) ** GOTO lbl6
                            if (ja.mc.field_1724 == null) break block101;
                            if (var7_3) ** GOTO lbl6
                            if (ja.mc.field_1687 == null) break block101;
                            if (var7_3 || var7_3) ** GOTO lbl6
                            var2_4 = ja.mc.field_1765;
                            if (var7_3) ** GOTO lbl6
                            if (!(var2_4 instanceof class_3965)) break block101;
                            if (var7_3) ** GOTO lbl6
                            var1_5 = (class_3965)var2_4;
                            if (var7_3 || var7_3) ** GOTO lbl6
                            if (var1_5.method_17783() != class_239.class_240.field_1332) break block101;
                            if (var7_3) ** GOTO lbl6
                            if (!(ja.mc.field_1724.method_33571().method_1022(var1_5.method_17784()) > ja.mc.field_1724.method_55754())) break block102;
                            if (var7_3) ** GOTO lbl6
                        }
                        if (var7_3 || var7_3) ** GOTO lbl6
                        return this.targetBoxesBuffer;
                    }
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var2_4 = var1_5.method_17777();
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var3_6 = ja.mc.field_1687.method_8320((class_2338)var2_4);
                    if (var7_3 || var7_3) ** GOTO lbl6
                    if (var3_6.method_26215()) break block103;
                    if (var7_3) ** GOTO lbl6
                    if (var3_6.method_27852(class_2246.field_10479)) break block103;
                    if (var7_3) ** GOTO lbl6
                    if (var3_6.method_27852(class_2246.field_10214)) break block103;
                    if (var7_3) ** GOTO lbl6
                    if (var3_6.method_27852(class_2246.field_10112)) break block103;
                    if (var7_3) ** GOTO lbl6
                    if (var3_6.method_27852(class_2246.field_10313)) break block103;
                    if (var7_3) ** GOTO lbl6
                    if (var3_6.method_27852(class_2246.field_10376)) break block103;
                    if (var7_3) ** GOTO lbl6
                    if (!var3_6.method_27852(class_2246.field_10238)) break block104;
                    if (var7_3) ** GOTO lbl6
                }
                if (var7_3 || var7_3) ** GOTO lbl6
                return this.targetBoxesBuffer;
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            var4_7 = var3_6.method_26218((class_1922)ja.mc.field_1687, (class_2338)var2_4);
            if (var7_3 || var7_3) ** GOTO lbl6
            if (!var4_7.method_1110()) break block105;
            if (var7_3 || var7_3) ** GOTO lbl6
            return this.targetBoxesBuffer;
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var5_8 = var4_7.method_1090().iterator();
        if (var7_3) ** GOTO lbl6
        block55: while (true) {
            if (var7_3 || var7_3) ** GOTO lbl6
            if (!var5_8.hasNext()) ** GOTO lbl77
            if (var7_3) ** GOTO lbl6
            var6_9 = (class_238)var5_8.next();
            if (var7_3 || var7_3) ** GOTO lbl6
            this.targetBoxesBuffer.add(var6_9.method_996((class_2338)var2_4).method_1014((double)ja.andf("anir", anip(int ), (int)20)));
            if (var7_3) ** GOTO lbl6
            if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var7_3) ** GOTO lbl6
                    if (!var9_1) continue block55;
                    throw null;
                }
lbl77:
                // 1 sources

                if (!var7_3 && !var7_3) ** break;
                ** continue;
                return this.targetBoxesBuffer;
lbl80:
                // 4 sources

                case 0: {
                    var8_2 /* !! */  = (int)ja.andf("anis", andh(int ), (int)108);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 1: {
                    var8_2 /* !! */  = (int)ja.andf("anit", andh(int ), (int)109);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
                case 2: {
                    var8_2 /* !! */  = (int)ja.andf("aniu", andh(int ), (int)110);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
                case 3: {
                    var8_2 /* !! */  = (int)ja.andf("aniv", andh(int ), (int)111);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
lbl100:
                // 2 sources

                case 4: {
                    var8_2 /* !! */  = (int)ja.andf("aniw", andh(int ), (int)112);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
                case 5: {
                    var8_2 /* !! */  = (int)ja.andf("anix", andh(int ), (int)113);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl110:
                // 3 sources

                case 6: {
                    var8_2 /* !! */  = (int)ja.andf("aniy", andh(int ), (int)114);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl128
                }
                case 7: {
                    var8_2 /* !! */  = (int)ja.andf("aniz", andh(int ), (int)115);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
                case 8: {
                    var8_2 /* !! */  = (int)ja.andf("anja", andh(int ), (int)116);
                    if (!var9_1) ** GOTO lbl110
                    throw null;
                }
                case 9: {
                    var8_2 /* !! */  = (int)ja.andf("anjb", andh(int ), (int)117);
                    if (var9_1) {
                        throw null;
                    }
                }
lbl128:
                // 4 sources

                case 10: {
                    var8_2 /* !! */  = (int)ja.andf("anjc", andh(int ), (int)118);
                    if (!var9_1) ** GOTO lbl80
                    throw null;
                }
lbl132:
                // 4 sources

                case 11: {
                    var8_2 /* !! */  = (int)ja.andf("anjd", andh(int ), (int)119);
                    if (!var9_1) ** GOTO lbl100
                    throw null;
                }
lbl136:
                // 2 sources

                case 12: {
                    var8_2 /* !! */  = (int)ja.andf("anje", andh(int ), (int)120);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl141:
                // 3 sources

                case 13: {
                    var8_2 /* !! */  = (int)ja.andf("anjf", andh(int ), (int)121);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl146:
                // 4 sources

                case 14: {
                    var8_2 /* !! */  = (int)ja.andf("anjg", andh(int ), (int)122);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
                case 15: {
                    var8_2 /* !! */  = (int)ja.andf("anjh", andh(int ), (int)123);
                    if (!var9_1) ** GOTO lbl146
                    throw null;
                }
lbl155:
                // 2 sources

                case 16: {
                    var8_2 /* !! */  = (int)ja.andf("anji", andh(int ), (int)124);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl160:
                // 2 sources

                case 17: {
                    var8_2 /* !! */  = (int)ja.andf("anjj", andh(int ), (int)125);
                    if (var9_1) {
                        throw null;
                    }
                }
                case 18: {
                    var8_2 /* !! */  = (int)ja.andf("anjk", andh(int ), (int)126);
                    if (!var9_1) ** GOTO lbl141
                    throw null;
                }
lbl168:
                // 4 sources

                case 19: {
                    var8_2 /* !! */  = (int)ja.andf("anjl", andh(int ), (int)127);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
                case 20: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_2 /* !! */  = (int)ja.andf("anjm", andh(int ), (int)128);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl285
                        break;
                    }
                }
                case 21: {
                    var8_2 /* !! */  = (int)ja.andf("anjn", andh(int ), (int)129);
                    if (!var9_1) ** GOTO lbl168
                    throw null;
                }
lbl183:
                // 2 sources

                case 22: {
                    var8_2 /* !! */  = (int)ja.andf("anjo", andh(int ), (int)130);
                    if (!var9_1) ** GOTO lbl110
                    throw null;
                }
lbl187:
                // 3 sources

                case 23: {
                    var8_2 /* !! */  = (int)ja.andf("anjp", andh(int ), (int)131);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl192:
                // 2 sources

                case 24: {
                    var8_2 /* !! */  = (int)ja.andf("anjq", andh(int ), (int)132);
                    if (!var9_1) ** GOTO lbl168
                    throw null;
                }
lbl196:
                // 2 sources

                case 25: {
                    var8_2 /* !! */  = (int)ja.andf("anjs", andh(int ), (int)133);
                    if (!var9_1) ** GOTO lbl80
                    throw null;
                }
lbl200:
                // 3 sources

                case 26: {
                    var8_2 /* !! */  = (int)ja.andf("anjt", andh(int ), (int)134);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
lbl205:
                // 2 sources

                case 27: {
                    var8_2 /* !! */  = (int)ja.andf("anju", andh(int ), (int)135);
                    if (!var9_1) ** GOTO lbl146
                    throw null;
                }
                case 28: {
                    var8_2 /* !! */  = (int)ja.andf("anjv", andh(int ), (int)136);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl226
                }
lbl214:
                // 3 sources

                case 29: {
                    var8_2 /* !! */  = (int)ja.andf("anjw", andh(int ), (int)137);
                    if (!var9_1) ** GOTO lbl168
                    throw null;
                }
lbl218:
                // 3 sources

                case 30: {
                    var8_2 /* !! */  = (int)ja.andf("anjx", andh(int ), (int)138);
                    if (!var9_1) ** GOTO lbl146
                    throw null;
                }
lbl222:
                // 2 sources

                case 31: {
                    var8_2 /* !! */  = (int)ja.andf("anjy", andh(int ), (int)139);
                    if (!var9_1) ** GOTO lbl218
                    throw null;
                }
lbl226:
                // 2 sources

                case 32: {
                    var8_2 /* !! */  = (int)ja.andf("anjz", andh(int ), (int)140);
                    if (!var9_1) ** GOTO lbl196
                    throw null;
                }
lbl230:
                // 2 sources

                case 33: {
                    var8_2 /* !! */  = (int)ja.andf("anka", andh(int ), (int)141);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 34: {
                    var8_2 /* !! */  = (int)ja.andf("ankb", andh(int ), (int)142);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl240:
                // 2 sources

                case 35: {
                    var8_2 /* !! */  = (int)ja.andf("ankc", andh(int ), (int)143);
                    if (!var9_1) ** GOTO lbl214
                    throw null;
                }
                case 36: {
                    var8_2 /* !! */  = (int)ja.andf("ankd", andh(int ), (int)144);
                    if (!var9_1) ** GOTO lbl187
                    throw null;
                }
lbl248:
                // 2 sources

                case 37: {
                    var8_2 /* !! */  = (int)ja.andf("anke", andh(int ), (int)145);
                    if (!var9_1) ** GOTO lbl132
                    throw null;
                }
                case 38: {
                    var8_2 /* !! */  = (int)ja.andf("ankf", andh(int ), (int)146);
                    if (!var9_1) ** GOTO lbl192
                    throw null;
                }
                case 39: {
                    var8_2 /* !! */  = (int)ja.andf("ankg", andh(int ), (int)147);
                    if (!var9_1) ** GOTO lbl200
                    throw null;
                }
lbl260:
                // 2 sources

                case 40: {
                    var8_2 /* !! */  = (int)ja.andf("ankh", andh(int ), (int)148);
                    if (!var9_1) ** GOTO lbl230
                    throw null;
                }
lbl264:
                // 3 sources

                case 41: {
                    var8_2 /* !! */  = (int)ja.andf("anki", andh(int ), (int)149);
                    if (!var9_1) ** GOTO lbl240
                    throw null;
                }
                case 42: {
                    var8_2 /* !! */  = (int)ja.andf("ankj", andh(int ), (int)150);
                    if (!var9_1) ** GOTO lbl205
                    throw null;
                }
                case 43: {
                    var8_2 /* !! */  = (int)ja.andf("ankk", andh(int ), (int)151);
                    if (!var9_1) ** GOTO lbl183
                    throw null;
                }
lbl276:
                // 2 sources

                case 44: {
                    var8_2 /* !! */  = (int)ja.andf("ankl", andh(int ), (int)152);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl281:
                // 2 sources

                case 45: {
                    var8_2 /* !! */  = (int)ja.andf("ankm", andh(int ), (int)153);
                    if (!var9_1) ** GOTO lbl264
                    throw null;
                }
lbl285:
                // 2 sources

                case 46: {
                    var8_2 /* !! */  = (int)ja.andf("ankn", andh(int ), (int)154);
                    if (!var9_1) ** GOTO lbl132
                    throw null;
                }
                case 47: {
                    var8_2 /* !! */  = (int)ja.andf("anko", andh(int ), (int)155);
                    if (!var9_1) ** GOTO lbl260
                    throw null;
                }
lbl293:
                // 2 sources

                case 48: {
                    var8_2 /* !! */  = (int)ja.andf("ankq", andh(int ), (int)156);
                    if (!var9_1) ** GOTO lbl160
                    throw null;
                }
lbl297:
                // 3 sources

                case 49: {
                    var8_2 /* !! */  = (int)ja.andf("ankr", andh(int ), (int)157);
                    if (!var9_1) ** GOTO lbl222
                    throw null;
                }
lbl301:
                // 3 sources

                case 50: {
                    var8_2 /* !! */  = (int)ja.andf("anks", andh(int ), (int)158);
                    if (!var9_1) ** GOTO lbl80
                    throw null;
                }
                case 51: 
            }
            break;
        }
        var8_2 /* !! */  = (int)ja.andf("ankt", andh(int ), (int)159);
        ** while (!var9_1)
lbl308:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static ja getInstance() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ce - ja.andf("andg", andc(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ja.andf("andk", andh(int ), (int)0)) break;
            object = ja.andf("andm", andh(int ), (int)1);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ce - ja.andf("andn", andc(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ja.andf("ando", andh(int ), (int)2)) break;
            object = ja.andf("andp", andh(int ), (int)3);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ce - ja.andf("andq", andc(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ja.andf("andr", andh(int ), (int)4)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ja.andf("ands", andh(int ), (int)5);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object = ce;
        boolean bl4 = true;
        block8: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - ja.andf("andt", andc(int ), (int)3);
            }
            switch ((int)object) {
                case -1705217825: {
                    return nj.get(ja.class);
                }
                case -893796005: {
                    callSite = ja.andf("andu", andc(int ), (int)4);
                    continue block8;
                }
                case 556672279: {
                    callSite = ja.andf("andv", andc(int ), (int)5);
                    continue block8;
                }
            }
            break;
        }
        return nj.get(ja.class);
    }

    private static /* synthetic */ void anry() {
        ja.andj[0] = -693677564;
        ja.andj[1] = -575130982;
        ja.andj[2] = 1660164267;
        ja.andj[3] = 1507444593;
        ja.andj[4] = 121556168;
        ja.andj[5] = -1097763905;
        ja.andj[6] = -907032179;
        ja.andj[7] = -2139074196;
        ja.andj[8] = 2036440903;
        ja.andj[9] = 350165833;
        ja.andj[10] = 184394959;
        ja.andj[11] = -47373112;
        ja.andj[12] = -2046001690;
        ja.andj[13] = 1032308758;
        ja.andj[14] = -501072955;
        ja.andj[15] = -1066042374;
        ja.andj[16] = 1120874080;
        ja.andj[17] = 869196386;
        ja.andj[18] = 1921913986;
        ja.andj[19] = -1955372352;
        ja.andj[20] = 2079522865;
        ja.andj[21] = 147856769;
        ja.andj[22] = 567215879;
        ja.andj[23] = 537410324;
        ja.andj[24] = 1209205348;
        ja.andj[25] = 1354756200;
        ja.andj[26] = 386812320;
        ja.andj[27] = 1369037762;
        ja.andj[28] = -1702166367;
        ja.andj[29] = -1000775360;
        ja.andj[30] = -989897399;
        ja.andj[31] = 1437314013;
        ja.andj[32] = -1550995048;
        ja.andj[33] = 1564714700;
        ja.andj[34] = -1202234843;
        ja.andj[35] = 1538555586;
        ja.andj[36] = 1108893761;
        ja.andj[37] = -1174436379;
        ja.andj[38] = 1009390973;
        ja.andj[39] = -694841914;
        ja.andj[40] = -1917507819;
        ja.andj[41] = -316605733;
        ja.andj[42] = 347865311;
        ja.andj[43] = 1728130516;
        ja.andj[44] = -1357813949;
        ja.andj[45] = -307025092;
        ja.andj[46] = -1195246434;
        ja.andj[47] = 590074899;
        ja.andj[48] = -1251456434;
        ja.andj[49] = -1649106009;
        ja.andj[50] = -758544291;
        ja.andj[51] = -1504330808;
        ja.andj[52] = 1615463595;
        ja.andj[53] = 1500534360;
        ja.andj[54] = 830418205;
        ja.andj[55] = 413913773;
        ja.andj[56] = 426526971;
        ja.andj[57] = 743005464;
        ja.andj[58] = 426399534;
        ja.andj[59] = 544611926;
        ja.andj[60] = -2109132032;
        ja.andj[61] = -1985779037;
        ja.andj[62] = 553427886;
        ja.andj[63] = 328779920;
        ja.andj[64] = -471557155;
        ja.andj[65] = 910314583;
        ja.andj[66] = 1663384550;
        ja.andj[67] = 342964780;
        ja.andj[68] = -2138552020;
        ja.andj[69] = 2085535283;
        ja.andj[70] = 236711801;
        ja.andj[71] = 86315656;
        ja.andj[72] = 1400507379;
        ja.andj[73] = -20428138;
        ja.andj[74] = 1659845433;
        ja.andj[75] = 1540309071;
        ja.andj[76] = 359194781;
        ja.andj[77] = -1285748981;
        ja.andj[78] = 823808666;
        ja.andj[79] = -1270243058;
        ja.andj[80] = -384509699;
        ja.andj[81] = 1977077765;
        ja.andj[82] = -938982575;
        ja.andj[83] = -1976007162;
        ja.andj[84] = 922559122;
        ja.andj[85] = -1450570805;
        ja.andj[86] = 120794936;
        ja.andj[87] = 982069827;
        ja.andj[88] = -2014204660;
        ja.andj[89] = 513419441;
        ja.andj[90] = -169688972;
        ja.andj[91] = 85042669;
        ja.andj[92] = 272250126;
        ja.andj[93] = 1241467528;
        ja.andj[94] = 907754456;
        ja.andj[95] = 1930513117;
        ja.andj[96] = 1608300341;
        ja.andj[97] = 512088919;
        ja.andj[98] = 58774924;
        ja.andj[99] = 1530353267;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ja() {
        var2_1 /* !! */  = ja.b;
        var1_2 = ja.a;
        super("BlockOverlay", "\u041a\u0440\u0430\u0441\u0438\u0432\u0430\u044f \u043f\u043e\u0434\u0441\u0432\u0435\u0442\u043a\u0430 \u0431\u043b\u043e\u043a\u0430 \u043f\u043e\u0434 \u043f\u0440\u0438\u0446\u0435\u043b\u043e\u043c", du.RENDER);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block12: while (true) {
            block14: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.alpha = new kg("\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c \u044d\u0444\u0444\u0435\u043a\u0442\u0430", (float)ja.andf("aneb", anea(int ), (int)10)).range((float)ja.andf("anec", anea(int ), (int)11), 1.0f).step((float)ja.andf("aned", anea(int ), (int)12));
                        this.scale = new kg("\u041c\u0430\u0441\u0448\u0442\u0430\u0431", "\u041c\u0430\u0441\u0448\u0442\u0430\u0431 \u0443\u0437\u043e\u0440\u0430", (float)ja.andf("anef", anea(int ), (int)13)).range((float)ja.andf("aneg", anea(int ), (int)14), 2.0f).step((float)ja.andf("aneh", anea(int ), (int)15));
                        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438", 1.0f).range((float)ja.andf("anei", anea(int ), (int)16), (float)ja.andf("anej", anea(int ), (int)17)).step((float)ja.andf("anek", anea(int ), (int)18));
                        this.smoothness = new kb("\u041f\u043b\u0430\u0432\u043d\u043e\u0441\u0442\u044c", "\u041f\u043b\u0430\u0432\u043d\u043e \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0430\u0435\u0442 \u043f\u043e\u0434\u0441\u0432\u0435\u0442\u043a\u0443 \u043c\u0435\u0436\u0434\u0443 \u0431\u043b\u043e\u043a\u0430\u043c\u0438");
                        this.animatedBoxes = new ArrayList<class_238>();
                        this.targetBoxesBuffer = new ArrayList<class_238>();
                        this.settings(new jx[]{this.alpha, this.scale, this.speed, this.smoothness});
                        return;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)ja.andf("anel", andh(int ), (int)19);
                        cfr_temp_0 = 6;
                        break block14;
                    }
                    case 1: {
                        ** GOTO lbl39
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)ja.andf("anep", andh(int ), (int)23);
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)ja.andf("aneo", andh(int ), (int)22);
                        cfr_temp_0 = 5;
                        break block14;
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)ja.andf("aner", andh(int ), (int)25);
                        ** GOTO lbl-1000
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)ja.andf("anet", andh(int ), (int)27);
                    }
                    case 5: {
                        var2_1 /* !! */  = (int)ja.andf("aneq", andh(int ), (int)24);
                        ** GOTO lbl-1000
                    }
                    case 9: lbl-1000:
                    // 3 sources

                    {
                        var2_1 /* !! */  = (int)ja.andf("aneu", andh(int ), (int)28);
lbl39:
                        // 2 sources

                        var2_1 /* !! */  = (int)ja.andf("anem", andh(int ), (int)20);
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)ja.andf("anen", andh(int ), (int)21);
                    }
                    case 7: 
                }
                ** GOTO lbl47
            }
            while (true) {
                if (true) continue block12;
lbl47:
                // 2 sources

                var2_1 /* !! */  = (int)ja.andf("anes", andh(int ), (int)26);
                cfr_temp_0 = 2;
            }
            break;
        }
    }

    public static /* synthetic */ CallSite andf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_238 interpolate(class_238 var0, class_238 var1_1, double var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ja.ce - ja.andf("anmy", andc(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ja.andf("anmz", andh(int ), (int)208)) break;
            v0 /* !! */  = (long)ja.andf("anna", andh(int ), (int)209);
        }
        var6_3 = ja.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ja.ce - ja.andf("annb", andc(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ja.andf("annc", andh(int ), (int)210)) break;
            v1 /* !! */  = (long)ja.andf("annd", andh(int ), (int)211);
        }
        var5_4 /* !! */  = ja.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ja.ce - ja.andf("anne", andc(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ja.andf("annf", andh(int ), (int)212)) break;
            v2 /* !! */  = (long)ja.andf("anng", andh(int ), (int)213);
        }
        var4_5 = ja.a;
        if (var6_3) {
            throw null;
lbl21:
            // 2 sources

            return null;
        }
        if (var4_5) ** GOTO lbl21
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ja.ce - ja.andf("anni", andc(int ), (int)29)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ja.andf("annj", andh(int ), (int)214)) break;
                    v3 /* !! */  = (long)ja.andf("annk", andh(int ), (int)215);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = ja.ce - ja.andf("annl", andc(int ), (int)30)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ja.andf("annm", andh(int ), (int)216)) break;
                    v4 /* !! */  = (long)ja.andf("annn", andh(int ), (int)217);
                }
                v5 = var0.field_1323;
                v6 /* !! */  = ja.ce;
                if (true) ** GOTO lbl43
                block80: while (true) {
                    v6 /* !! */  = (long)(ja.andf("annp", andc(int ), (int)32) - ja.andf("anno", andc(int ), (int)31));
lbl43:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1705217825: {
                            break block80;
                        }
                        case -1106684716: {
                            continue block80;
                        }
                    }
                    break;
                }
                v7 = var1_1.field_1323;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = ja.ce - ja.andf("annq", andc(int ), (int)33)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ja.andf("annr", andh(int ), (int)218)) break;
                    v8 /* !! */  = (long)ja.andf("anns", andh(int ), (int)219);
                }
                v9 = ja.lerp(v5, v7, var2_2);
                v10 /* !! */  = ja.ce;
                if (true) ** GOTO lbl59
                block82: while (true) {
                    v10 /* !! */  = (long)(v11 - ja.andf("annt", andc(int ), (int)34));
lbl59:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1989270071: {
                            v11 = ja.andf("annu", andc(int ), (int)35);
                            continue block82;
                        }
                        case -1705217825: {
                            break block82;
                        }
                        case -1616310771: {
                            v11 = ja.andf("annv", andc(int ), (int)36);
                            continue block82;
                        }
                        case 1596180678: {
                            v11 = ja.andf("annw", andc(int ), (int)37);
                            continue block82;
                        }
                    }
                    break;
                }
                v12 = var0.field_1322;
                v13 /* !! */  = ja.ce;
                if (true) ** GOTO lbl76
                block83: while (true) {
                    v13 /* !! */  = (long)(v14 - ja.andf("annx", andc(int ), (int)38));
lbl76:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1705217825: {
                            break block83;
                        }
                        case -823137018: {
                            v14 = ja.andf("anny", andc(int ), (int)39);
                            continue block83;
                        }
                        case -482664263: {
                            v14 = ja.andf("annz", andc(int ), (int)40);
                            continue block83;
                        }
                        case -22551927: {
                            v14 = ja.andf("anoa", andc(int ), (int)41);
                            continue block83;
                        }
                    }
                    break;
                }
                v15 = var1_1.field_1322;
                v16 /* !! */  = ja.ce;
                if (true) ** GOTO lbl93
                block84: while (true) {
                    v16 /* !! */  = (long)(v17 - ja.andf("anob", andc(int ), (int)42));
lbl93:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1705217825: {
                            break block84;
                        }
                        case 1312157368: {
                            v17 = ja.andf("anoc", andc(int ), (int)43);
                            continue block84;
                        }
                        case 1401363137: {
                            v17 = ja.andf("anod", andc(int ), (int)44);
                            continue block84;
                        }
                    }
                    break;
                }
                v18 = ja.lerp(v12, v15, var2_2);
                v19 /* !! */  = ja.ce;
                if (true) ** GOTO lbl107
                block85: while (true) {
                    v19 /* !! */  = (long)(v20 - ja.andf("anoe", andc(int ), (int)45));
lbl107:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1705217825: {
                            break block85;
                        }
                        case 1760282097: {
                            v20 = ja.andf("anof", andc(int ), (int)46);
                            continue block85;
                        }
                        case 1902422282: {
                            v20 = ja.andf("anoh", andc(int ), (int)47);
                            continue block85;
                        }
                    }
                    break;
                }
                v21 = var0.field_1321;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = ja.ce - ja.andf("anoi", andc(int ), (int)48)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ja.andf("anoj", andh(int ), (int)220)) break;
                    v22 /* !! */  = (long)ja.andf("anok", andh(int ), (int)221);
                }
                v23 = var1_1.field_1321;
                v24 /* !! */  = ja.ce;
                if (true) ** GOTO lbl127
                block87: while (true) {
                    v24 /* !! */  = (long)(ja.andf("anom", andc(int ), (int)50) - ja.andf("anol", andc(int ), (int)49));
lbl127:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1705217825: {
                            break block87;
                        }
                        case 1624649609: {
                            continue block87;
                        }
                    }
                    break;
                }
                v25 = ja.lerp(v21, v23, var2_2);
                v26 /* !! */  = ja.ce;
                if (true) ** GOTO lbl137
                block88: while (true) {
                    v26 /* !! */  = (long)(v27 - ja.andf("anon", andc(int ), (int)51));
lbl137:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1705217825: {
                            break block88;
                        }
                        case 166253806: {
                            v27 = ja.andf("anoo", andc(int ), (int)52);
                            continue block88;
                        }
                        case 535940390: {
                            v27 = ja.andf("anop", andc(int ), (int)53);
                            continue block88;
                        }
                        case 1639231878: {
                            v27 = ja.andf("anoq", andc(int ), (int)54);
                            continue block88;
                        }
                    }
                    break;
                }
                v28 = var0.field_1320;
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_7 = ja.ce - ja.andf("anor", andc(int ), (int)55)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ja.andf("anos", andh(int ), (int)222)) break;
                    v29 /* !! */  = (long)ja.andf("anot", andh(int ), (int)223);
                }
                v30 = var1_1.field_1320;
                v31 /* !! */  = ja.ce;
                if (true) ** GOTO lbl160
                block90: while (true) {
                    v31 /* !! */  = (long)(v32 - ja.andf("anou", andc(int ), (int)56));
lbl160:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1705217825: {
                            break block90;
                        }
                        case 70567387: {
                            v32 = ja.andf("anov", andc(int ), (int)57);
                            continue block90;
                        }
                        case 1008987363: {
                            v32 = ja.andf("anow", andc(int ), (int)58);
                            continue block90;
                        }
                        case 1212569678: {
                            v32 = ja.andf("anox", andc(int ), (int)59);
                            continue block90;
                        }
                    }
                    break;
                }
                v33 = ja.lerp(v28, v30, var2_2);
                v34 /* !! */  = ja.ce;
                if (true) ** GOTO lbl177
                block91: while (true) {
                    v34 /* !! */  = (long)(v35 - ja.andf("anoy", andc(int ), (int)60));
lbl177:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1705217825: {
                            break block91;
                        }
                        case -1221271474: {
                            v35 = ja.andf("anoz", andc(int ), (int)61);
                            continue block91;
                        }
                        case 1993624878: {
                            v35 = ja.andf("anpa", andc(int ), (int)62);
                            continue block91;
                        }
                    }
                    break;
                }
                v36 = var0.field_1325;
                v37 /* !! */  = ja.ce;
                if (true) ** GOTO lbl191
                block92: while (true) {
                    v37 /* !! */  = (long)(v38 - ja.andf("anpc", andc(int ), (int)63));
lbl191:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -1705217825: {
                            break block92;
                        }
                        case 132522643: {
                            v38 = ja.andf("anpd", andc(int ), (int)64);
                            continue block92;
                        }
                        case 288429909: {
                            v38 = ja.andf("anpe", andc(int ), (int)65);
                            continue block92;
                        }
                        case 1394592870: {
                            v38 = ja.andf("anpf", andc(int ), (int)66);
                            continue block92;
                        }
                    }
                    break;
                }
                v39 = var1_1.field_1325;
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_8 = ja.ce - ja.andf("anpg", andc(int ), (int)67)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == ja.andf("anph", andh(int ), (int)224)) break;
                    v40 /* !! */  = (long)ja.andf("anpi", andh(int ), (int)225);
                }
                v41 = ja.lerp(v36, v39, var2_2);
                v42 /* !! */  = ja.ce;
                if (true) ** GOTO lbl214
                block94: while (true) {
                    v42 /* !! */  = (long)(v43 - ja.andf("anpj", andc(int ), (int)68));
lbl214:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1705217825: {
                            break block94;
                        }
                        case -1415033036: {
                            v43 = ja.andf("anpk", andc(int ), (int)69);
                            continue block94;
                        }
                        case 752147012: {
                            v43 = ja.andf("anpl", andc(int ), (int)70);
                            continue block94;
                        }
                    }
                    break;
                }
                v44 = var0.field_1324;
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_9 = ja.ce - ja.andf("anpm", andc(int ), (int)71)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == ja.andf("anpn", andh(int ), (int)226)) break;
                    v45 /* !! */  = (long)ja.andf("anpo", andh(int ), (int)227);
                }
                v46 = var1_1.field_1324;
                v47 /* !! */  = ja.ce;
                if (true) ** GOTO lbl234
                block96: while (true) {
                    v47 /* !! */  = (long)(ja.andf("anpq", andc(int ), (int)73) - ja.andf("anpp", andc(int ), (int)72));
lbl234:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1705217825: {
                            break block96;
                        }
                        case -996748823: {
                            continue block96;
                        }
                    }
                    break;
                }
                v48 = ja.lerp(v44, v46, var2_2);
                v49 /* !! */  = ja.ce;
                if (true) ** GOTO lbl244
                block97: while (true) {
                    v49 /* !! */  = (long)(v50 - ja.andf("anpr", andc(int ), (int)74));
lbl244:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1705217825: {
                            break block97;
                        }
                        case -160664858: {
                            v50 = ja.andf("anps", andc(int ), (int)75);
                            continue block97;
                        }
                        case 227550121: {
                            v50 = ja.andf("anpt", andc(int ), (int)76);
                            continue block97;
                        }
                        case 424776365: {
                            v50 = ja.andf("anpu", andc(int ), (int)77);
                            continue block97;
                        }
                    }
                    break;
                }
                return new class_238(v9, v18, v25, v33, v41, v48);
            }
lbl257:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)ja.andf("anpv", andh(int ), (int)228);
                if (var6_3) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ja.andf("anpw", andh(int ), (int)229);
                    if (!var6_3) ** GOTO lbl257
                    throw null;
                }
            }
            case 2: {
                var5_4 /* !! */  = (int)ja.andf("anpy", andh(int ), (int)230);
                if (!var6_3) break;
                throw null;
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)ja.andf("anpz", andh(int ), (int)231);
        ** while (!var6_3)
lbl273:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static double lerp(double var0, double var2_1, double var4_2) {
        v0 /* !! */  = ja.ce;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - ja.andf("anqa", andc(int ), (int)78));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1717790732: {
                    v1 = ja.andf("anqb", andc(int ), (int)79);
                    continue block11;
                }
                case -1705217825: {
                    break block11;
                }
                case 625999753: {
                    v1 = ja.andf("anqc", andc(int ), (int)80);
                    continue block11;
                }
            }
            break;
        }
        var8_3 = ja.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ja.ce - ja.andf("anqd", andc(int ), (int)81)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ja.andf("anqe", andh(int ), (int)232)) break;
            v2 /* !! */  = (long)ja.andf("anqf", andh(int ), (int)233);
        }
        var7_4 /* !! */  = ja.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ja.ce - ja.andf("anqg", andc(int ), (int)82)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ja.andf("anqh", andh(int ), (int)234)) {
                var6_5 = ja.a;
                if (var8_3) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ja.andf("anqi", andh(int ), (int)235);
        }
        if (!var6_5 && !var6_5) {
            return var0 + (var2_1 - var0) * var4_2;
        }
        if (var7_4 /* !! */  == 0) return (double)ja.andf("anqj", anip(int ), (int)83);
        cfr_temp_0 = -2147483648;
        block14: while (true) {
            block22: {
                switch (cfr_temp_0 == -2147483648 ? var7_4 /* !! */  : cfr_temp_0) {
                    default: {
                        return (double)ja.andf("anqj", anip(int ), (int)83);
                    }
                    case 0: {
                        ** GOTO lbl44
                    }
                    case 3: {
                        var7_4 /* !! */  = (int)ja.andf("anqn", andh(int ), (int)239);
                        if (var8_3) {
                            throw null;
                        }
lbl44:
                        // 3 sources

                        var7_4 /* !! */  = (int)ja.andf("anqk", andh(int ), (int)236);
                        cfr_temp_0 = 2;
                        if (var8_3) {
                            throw null;
                        }
                        break block22;
                    }
                    case 1: {
                        var7_4 /* !! */  = (int)ja.andf("anql", andh(int ), (int)237);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl58
            }
            do {
                if (true) continue block14;
lbl58:
                // 2 sources

                var7_4 /* !! */  = (int)ja.andf("anqm", andh(int ), (int)238);
                cfr_temp_0 = 1;
            } while (!var8_3);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void anru() {
        ja.andi[100] = -592867518;
        ja.andi[101] = -1296043195;
        ja.andi[102] = 1158228932;
        ja.andi[103] = -523438970;
        ja.andi[104] = 1481885759;
        ja.andi[105] = -964703239;
        ja.andi[106] = -1316025213;
        ja.andi[107] = -1091661751;
        ja.andi[108] = -1308956651;
        ja.andi[109] = 60869874;
        ja.andi[110] = -1373667726;
        ja.andi[111] = 1359883792;
        ja.andi[112] = -1175152821;
        ja.andi[113] = -163379913;
        ja.andi[114] = -535889465;
        ja.andi[115] = 869551063;
        ja.andi[116] = 1480152944;
        ja.andi[117] = 984245090;
        ja.andi[118] = 1429570243;
        ja.andi[119] = -1744353368;
        ja.andi[120] = 2080055281;
        ja.andi[121] = -1555175904;
        ja.andi[122] = 1958373190;
        ja.andi[123] = -1369832463;
        ja.andi[124] = -77809956;
        ja.andi[125] = 1922885513;
        ja.andi[126] = 1492506150;
        ja.andi[127] = -1486486776;
        ja.andi[128] = -1972361153;
        ja.andi[129] = -1155598000;
        ja.andi[130] = -604901283;
        ja.andi[131] = -556606571;
        ja.andi[132] = 810779199;
        ja.andi[133] = -392877814;
        ja.andi[134] = -451597384;
        ja.andi[135] = 1580094083;
        ja.andi[136] = 727841805;
        ja.andi[137] = 1598161536;
        ja.andi[138] = -363674102;
        ja.andi[139] = -250832307;
        ja.andi[140] = -869405452;
        ja.andi[141] = 989783112;
        ja.andi[142] = -641313040;
        ja.andi[143] = -1047830211;
        ja.andi[144] = 1801072937;
        ja.andi[145] = 320501612;
        ja.andi[146] = -1687439849;
        ja.andi[147] = -1094080401;
        ja.andi[148] = 1991240305;
        ja.andi[149] = -614112749;
        ja.andi[150] = -839595916;
        ja.andi[151] = 1100060264;
        ja.andi[152] = 3651196;
        ja.andi[153] = 1938786096;
        ja.andi[154] = -774705610;
        ja.andi[155] = 1301330238;
        ja.andi[156] = -51657158;
        ja.andi[157] = -1253481014;
        ja.andi[158] = 715266390;
        ja.andi[159] = -229742304;
        ja.andi[160] = -359496445;
        ja.andi[161] = -423024252;
        ja.andi[162] = -577928142;
        ja.andi[163] = -40814573;
        ja.andi[164] = 1659192809;
        ja.andi[165] = -250697689;
        ja.andi[166] = 1581573237;
        ja.andi[167] = 1202148297;
        ja.andi[168] = 1496686269;
        ja.andi[169] = 2070751974;
        ja.andi[170] = -1838222246;
        ja.andi[171] = 341423245;
        ja.andi[172] = 1430909321;
        ja.andi[173] = 1038225738;
        ja.andi[174] = 1006096640;
        ja.andi[175] = -167803569;
        ja.andi[176] = 1805431222;
        ja.andi[177] = 424608055;
        ja.andi[178] = -585990327;
        ja.andi[179] = -1386602462;
        ja.andi[180] = -48519798;
        ja.andi[181] = -1251187132;
        ja.andi[182] = 580428958;
        ja.andi[183] = -1120477869;
        ja.andi[184] = 1664474216;
        ja.andi[185] = 1606809688;
        ja.andi[186] = -891762118;
        ja.andi[187] = -2000843639;
        ja.andi[188] = 1316828068;
        ja.andi[189] = 35990593;
        ja.andi[190] = -1500690980;
        ja.andi[191] = -1861948567;
        ja.andi[192] = 1318858816;
        ja.andi[193] = -1600846561;
        ja.andi[194] = 1890858371;
        ja.andi[195] = 105360629;
        ja.andi[196] = -1624690291;
        ja.andi[197] = -504498550;
        ja.andi[198] = -1566365374;
        ja.andi[199] = 866772502;
    }

    private static /* synthetic */ int andh(int n2) {
        return andi[n2] ^ andj[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = ja.ce;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(ja.andf("anew", andc(int ), (int)7) - ja.andf("anev", andc(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1705217825: {
                    break block18;
                }
                case -1621909441: {
                    continue block18;
                }
            }
            break;
        }
        var3_1 = ja.c;
        v1 /* !! */  = ja.ce;
        if (true) ** GOTO lbl15
        block19: while (true) {
            v1 /* !! */  = (long)(ja.andf("aney", andc(int ), (int)9) - ja.andf("anex", andc(int ), (int)8));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1705217825: {
                    break block19;
                }
                case -980128489: {
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = ja.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ja.ce - ja.andf("anez", andc(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ja.andf("anfa", andh(int ), (int)29)) break;
            v2 /* !! */  = (long)ja.andf("anfb", andh(int ), (int)30);
        }
        var1_3 = ja.a;
        if (var3_1) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ja.ce - ja.andf("anfc", andc(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ja.andf("anfd", andh(int ), (int)31)) break;
            v3 /* !! */  = (long)ja.andf("anff", andh(int ), (int)32);
        }
        this.resetAnimation();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ja.ce - ja.andf("anfg", andc(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ja.andf("anfh", andh(int ), (int)33)) break;
                    v4 /* !! */  = (long)ja.andf("anfi", andh(int ), (int)34);
                }
                ax.register(this);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ja.andf("anfj", andh(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl78
            }
            case 1: {
                var2_2 /* !! */  = (int)ja.andf("anfk", andh(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl60:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ja.andf("anfl", andh(int ), (int)37);
                    if (!var3_1) break block8;
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ja.andf("anfm", andh(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl74
            }
            case 4: {
                var2_2 /* !! */  = (int)ja.andf("anfn", andh(int ), (int)39);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
lbl74:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ja.andf("anfo", andh(int ), (int)40);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl78:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ja.andf("anfp", andh(int ), (int)41);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ja.andf("anfq", andh(int ), (int)42);
        ** while (!var3_1)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ansc() {
        ja.andj[200] = -1779679523;
        ja.andj[201] = -644886177;
        ja.andj[202] = -1841863198;
        ja.andj[203] = 724038840;
        ja.andj[204] = -323160601;
        ja.andj[205] = 953870435;
        ja.andj[206] = -1431445220;
        ja.andj[207] = -1354419836;
        ja.andj[208] = 1807506383;
        ja.andj[209] = 1789003230;
        ja.andj[210] = -1338556759;
        ja.andj[211] = -1475988213;
        ja.andj[212] = 338042125;
        ja.andj[213] = -1729794195;
        ja.andj[214] = -740097477;
        ja.andj[215] = -902724912;
        ja.andj[216] = 956230829;
        ja.andj[217] = 1085193218;
        ja.andj[218] = -839576668;
        ja.andj[219] = 1301008463;
        ja.andj[220] = 302036503;
        ja.andj[221] = 1081477454;
        ja.andj[222] = 1332363543;
        ja.andj[223] = 1218801380;
        ja.andj[224] = -1596318424;
        ja.andj[225] = 892523973;
        ja.andj[226] = 5625021;
        ja.andj[227] = 7503258;
        ja.andj[228] = -1959002093;
        ja.andj[229] = -654328429;
        ja.andj[230] = -2111801859;
        ja.andj[231] = 532442977;
        ja.andj[232] = -1746780920;
        ja.andj[233] = 1347094962;
        ja.andj[234] = 595033910;
        ja.andj[235] = -235838893;
        ja.andj[236] = 628799439;
        ja.andj[237] = 928253374;
        ja.andj[238] = -1747446742;
        ja.andj[239] = -79516705;
        ja.andj[240] = -2003875159;
        ja.andj[241] = -1175015625;
        ja.andj[242] = 507112178;
        ja.andj[243] = 855679942;
        ja.andj[244] = 1858263963;
        ja.andj[245] = 522039871;
        ja.andj[246] = 168538890;
        ja.andj[247] = -190174299;
        ja.andj[248] = 1378132090;
        ja.andj[249] = 130475743;
        ja.andj[250] = -1788321666;
        ja.andj[251] = 39587651;
        ja.andj[252] = -1540100818;
        ja.andj[253] = -1626853781;
        ja.andj[254] = 948089286;
        ja.andj[255] = -1765534828;
        ja.andj[256] = -1851457625;
        ja.andj[257] = 1488665922;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ja.ce - ja.andf("anfr", andc(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ja.andf("anfs", andh(int ), (int)43)) break;
            v0 /* !! */  = (long)ja.andf("anft", andh(int ), (int)44);
        }
        var3_1 = ja.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ja.ce - ja.andf("anfu", andc(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ja.andf("anfv", andh(int ), (int)45)) break;
            v1 /* !! */  = (long)ja.andf("anfw", andh(int ), (int)46);
        }
        var2_2 /* !! */  = ja.b;
        v2 /* !! */  = ja.ce;
        if (true) ** GOTO lbl17
        block16: while (true) {
            v2 /* !! */  = (long)(ja.andf("anfy", andc(int ), (int)16) - ja.andf("anfx", andc(int ), (int)15));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1705217825: {
                    break block16;
                }
                case 47309595: {
                    continue block16;
                }
            }
            break;
        }
        var1_3 = ja.a;
        if (var3_1) {
            throw null;
lbl25:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ja.ce - ja.andf("anfz", andc(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ja.andf("anga", andh(int ), (int)47)) break;
                    v3 /* !! */  = (long)ja.andf("angb", andh(int ), (int)48);
                }
                ax.unregister(this);
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ja.ce - ja.andf("angc", andc(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ja.andf("angd", andh(int ), (int)49)) break;
                    v4 /* !! */  = (long)ja.andf("angf", andh(int ), (int)50);
                }
                this.resetAnimation();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl48:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ja.andf("angg", andh(int ), (int)51);
                if (var3_1) {
                    throw null;
                }
            }
lbl52:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ja.andf("angh", andh(int ), (int)52);
                    if (!var3_1) ** GOTO lbl48
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ja.andf("angi", andh(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ja.andf("angj", andh(int ), (int)54);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ja.andf("angk", andh(int ), (int)55);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ja.andf("angl", andh(int ), (int)56);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ja.andf("angm", andh(int ), (int)57);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ja.andf("angn", andh(int ), (int)58);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void anrs() {
        ja.andi[0] = 693677563;
        ja.andi[1] = -2108098414;
        ja.andi[2] = 1660164266;
        ja.andi[3] = -395228393;
        ja.andi[4] = 121556169;
        ja.andi[5] = -1989487552;
        ja.andi[6] = -907032179;
        ja.andi[7] = -2139074195;
        ja.andi[8] = 2036440901;
        ja.andi[9] = 350165835;
        ja.andi[10] = 875653122;
        ja.andi[11] = -1058936827;
        ja.andi[12] = -1171281172;
        ja.andi[13] = 42453014;
        ja.andi[14] = -537987320;
        ja.andi[15] = -38160585;
        ja.andi[16] = 2130961069;
        ja.andi[17] = 1936646754;
        ja.andi[18] = 1329780815;
        ja.andi[19] = -1955372346;
        ja.andi[20] = 2079522866;
        ja.andi[21] = 147856772;
        ja.andi[22] = 567215879;
        ja.andi[23] = 537410332;
        ja.andi[24] = 1209205347;
        ja.andi[25] = 1354756207;
        ja.andi[26] = 386812325;
        ja.andi[27] = 1369037764;
        ja.andi[28] = -1702166366;
        ja.andi[29] = 1000775359;
        ja.andi[30] = 447879722;
        ja.andi[31] = -1437314014;
        ja.andi[32] = 938655283;
        ja.andi[33] = -1564714701;
        ja.andi[34] = 938361983;
        ja.andi[35] = 1538555585;
        ja.andi[36] = 1108893763;
        ja.andi[37] = -1174436381;
        ja.andi[38] = 1009390975;
        ja.andi[39] = -694841918;
        ja.andi[40] = -1917507817;
        ja.andi[41] = -316605736;
        ja.andi[42] = 347865309;
        ja.andi[43] = 1728130517;
        ja.andi[44] = 395774130;
        ja.andi[45] = -307025091;
        ja.andi[46] = 1936185536;
        ja.andi[47] = -590074900;
        ja.andi[48] = 1460977121;
        ja.andi[49] = 1649106008;
        ja.andi[50] = -1721539692;
        ja.andi[51] = -1504330802;
        ja.andi[52] = 1615463595;
        ja.andi[53] = 1500534364;
        ja.andi[54] = 830418200;
        ja.andi[55] = 413913774;
        ja.andi[56] = 426526968;
        ja.andi[57] = 743005469;
        ja.andi[58] = 426399535;
        ja.andi[59] = 1678515798;
        ja.andi[60] = -1119276288;
        ja.andi[61] = -1985779063;
        ja.andi[62] = 553427890;
        ja.andi[63] = 328779929;
        ja.andi[64] = -471557126;
        ja.andi[65] = 910314575;
        ja.andi[66] = 1663384568;
        ja.andi[67] = 342964775;
        ja.andi[68] = -2138552016;
        ja.andi[69] = 2085535250;
        ja.andi[70] = 236711767;
        ja.andi[71] = 86315652;
        ja.andi[72] = 1400507357;
        ja.andi[73] = -20428104;
        ja.andi[74] = 1659845424;
        ja.andi[75] = 1540309100;
        ja.andi[76] = 359194777;
        ja.andi[77] = -1285748953;
        ja.andi[78] = 823808658;
        ja.andi[79] = -1270243053;
        ja.andi[80] = -384509714;
        ja.andi[81] = 1977077776;
        ja.andi[82] = -938982570;
        ja.andi[83] = -1976007145;
        ja.andi[84] = 922559156;
        ja.andi[85] = -1450570795;
        ja.andi[86] = 120794932;
        ja.andi[87] = 982069866;
        ja.andi[88] = -2014204630;
        ja.andi[89] = 513419411;
        ja.andi[90] = -169689004;
        ja.andi[91] = 85042659;
        ja.andi[92] = 272250123;
        ja.andi[93] = 1241467535;
        ja.andi[94] = 907754488;
        ja.andi[95] = 1930513103;
        ja.andi[96] = 1608300329;
        ja.andi[97] = 512088958;
        ja.andi[98] = 58774918;
        ja.andi[99] = 1530353243;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<class_238> updateAnimatedBoxes(List<class_238> var1_1) {
        var11_2 = ja.c;
        var10_3 /* !! */  = ja.b;
        if (var10_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var9_4 = ja.a;
                if (var11_2) {
                    throw null;
lbl9:
                    // 22 sources

                    return null;
                }
                if (var9_4 || var9_4) ** GOTO lbl9
                var2_5 = System.nanoTime();
                if (var9_4 || var9_4) ** GOTO lbl9
                if (this.lastRenderNanos != ja.andf("anku", andc(int ), (int)21)) ** GOTO lbl20
                if (var9_4 || var9_4) ** GOTO lbl9
                v0 /* !! */  = ja.andf("ankv", anip(int ), (int)22);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl22
lbl20:
                // 1 sources

                if (var9_4 || var9_4) ** GOTO lbl9
                v0 /* !! */  = var4_6 = (CallSite)Math.min((double)ja.andf("ankw", anip(int ), (int)23), (double)(var2_5 - this.lastRenderNanos) / ja.andf("ankx", anip(int ), (int)24));
lbl22:
                // 2 sources

                if (var9_4 || var9_4) ** GOTO lbl9
                this.lastRenderNanos = var2_5;
                if (var9_4 || var9_4) ** GOTO lbl9
                if (!this.animatedBoxes.isEmpty()) ** GOTO lbl31
                if (var9_4 || var9_4) ** GOTO lbl9
                this.animatedBoxes.addAll(var1_1);
                if (var9_4 || var9_4) ** GOTO lbl9
                return this.animatedBoxes;
lbl31:
                // 1 sources

                do {
                    if (var9_4 || var9_4) ** GOTO lbl9
                    if (this.animatedBoxes.size() >= var1_1.size()) ** GOTO lbl40
                    if (var9_4 || var9_4) ** GOTO lbl9
                    this.animatedBoxes.add(this.animatedBoxes.get(this.animatedBoxes.size() - ja.andf("anky", andh(int ), (int)160)));
                    if (var9_4) ** GOTO lbl9
                } while (!var11_2);
                throw null;
lbl40:
                // 1 sources

                do {
                    if (var9_4 || var9_4) ** GOTO lbl9
                    if (this.animatedBoxes.size() <= var1_1.size()) ** GOTO lbl49
                    if (var9_4 || var9_4) ** GOTO lbl9
                    this.animatedBoxes.remove(this.animatedBoxes.size() - ja.andf("ankz", andh(int ), (int)161));
                    if (var9_4) ** GOTO lbl9
                } while (!var11_2);
                throw null;
lbl49:
                // 1 sources

                if (var9_4 || var9_4) ** GOTO lbl9
                var6_7 = 1.0 - Math.exp((double)(ja.andf("anla", anip(int ), (int)25) * var4_6));
                if (var9_4 || var9_4) ** GOTO lbl9
                var8_8 = ja.andf("anlb", andh(int ), (int)162);
                if (var9_4) ** GOTO lbl9
                do {
                    if (var9_4 || var9_4) ** GOTO lbl9
                    if (var8_8 >= var1_1.size()) ** GOTO lbl65
                    if (var9_4 || var9_4) ** GOTO lbl9
                    this.animatedBoxes.set((int)var8_8, ja.interpolate(this.animatedBoxes.get((int)var8_8), var1_1.get((int)var8_8), var6_7));
                    if (var9_4 || var9_4) ** GOTO lbl9
                    ++var8_8;
                    if (var9_4) ** GOTO lbl9
                } while (!var11_2);
                throw null;
lbl65:
                // 1 sources

                if (!var9_4 && !var9_4) ** break;
                ** continue;
                return this.animatedBoxes;
            }
            case 0: {
                var10_3 /* !! */  = (int)ja.andf("anlc", andh(int ), (int)163);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl73:
            // 2 sources

            case 1: {
                var10_3 /* !! */  = (int)ja.andf("anld", andh(int ), (int)164);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl78:
            // 2 sources

            case 2: {
                var10_3 /* !! */  = (int)ja.andf("anle", andh(int ), (int)165);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl83:
            // 2 sources

            case 3: {
                var10_3 /* !! */  = (int)ja.andf("anlg", andh(int ), (int)166);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 4: {
                var10_3 /* !! */  = (int)ja.andf("anlh", andh(int ), (int)167);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl93:
            // 2 sources

            case 5: {
                var10_3 /* !! */  = (int)ja.andf("anli", andh(int ), (int)168);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 6: {
                var10_3 /* !! */  = (int)ja.andf("anlj", andh(int ), (int)169);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl103:
            // 2 sources

            case 7: {
                var10_3 /* !! */  = (int)ja.andf("anlk", andh(int ), (int)170);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl108:
            // 3 sources

            case 8: {
                var10_3 /* !! */  = (int)ja.andf("anll", andh(int ), (int)171);
                if (!var11_2) ** GOTO lbl93
                throw null;
            }
            case 9: {
                var10_3 /* !! */  = (int)ja.andf("anlm", andh(int ), (int)172);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 10: {
                var10_3 /* !! */  = (int)ja.andf("anln", andh(int ), (int)173);
                if (var11_2) {
                    throw null;
                }
            }
lbl121:
            // 4 sources

            case 11: {
                var10_3 /* !! */  = (int)ja.andf("anlo", andh(int ), (int)174);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 12: {
                var10_3 /* !! */  = (int)ja.andf("anlp", andh(int ), (int)175);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_3 /* !! */  = (int)ja.andf("anlq", andh(int ), (int)176);
                    if (!var11_2) ** GOTO lbl108
                    throw null;
                }
            }
lbl136:
            // 4 sources

            case 14: {
                var10_3 /* !! */  = (int)ja.andf("anlr", andh(int ), (int)177);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 15: {
                var10_3 /* !! */  = (int)ja.andf("anls", andh(int ), (int)178);
                if (!var11_2) ** GOTO lbl108
                throw null;
            }
            case 16: {
                var10_3 /* !! */  = (int)ja.andf("anlt", andh(int ), (int)179);
                if (var11_2) {
                    throw null;
                }
            }
lbl149:
            // 4 sources

            case 17: {
                var10_3 /* !! */  = (int)ja.andf("anlu", andh(int ), (int)180);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 18: {
                var10_3 /* !! */  = (int)ja.andf("anlv", andh(int ), (int)181);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl159:
            // 4 sources

            case 19: {
                var10_3 /* !! */  = (int)ja.andf("anlw", andh(int ), (int)182);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl164:
            // 2 sources

            case 20: {
                var10_3 /* !! */  = (int)ja.andf("anlx", andh(int ), (int)183);
                if (!var11_2) ** GOTO lbl159
                throw null;
            }
lbl168:
            // 4 sources

            case 21: {
                var10_3 /* !! */  = (int)ja.andf("anly", andh(int ), (int)184);
                if (!var11_2) ** GOTO lbl136
                throw null;
            }
lbl172:
            // 4 sources

            case 22: {
                var10_3 /* !! */  = (int)ja.andf("anlz", andh(int ), (int)185);
                if (!var11_2) ** GOTO lbl136
                throw null;
            }
lbl176:
            // 3 sources

            case 23: {
                var10_3 /* !! */  = (int)ja.andf("anma", andh(int ), (int)186);
                if (!var11_2) ** GOTO lbl103
                throw null;
            }
lbl180:
            // 2 sources

            case 24: {
                var10_3 /* !! */  = (int)ja.andf("anmb", andh(int ), (int)187);
                if (!var11_2) ** GOTO lbl159
                throw null;
            }
            case 25: {
                var10_3 /* !! */  = (int)ja.andf("anmd", andh(int ), (int)188);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl189:
            // 2 sources

            case 26: {
                var10_3 /* !! */  = (int)ja.andf("anme", andh(int ), (int)189);
                if (!var11_2) ** GOTO lbl78
                throw null;
            }
            case 27: {
                var10_3 /* !! */  = (int)ja.andf("anmf", andh(int ), (int)190);
                if (!var11_2) ** GOTO lbl168
                throw null;
            }
lbl197:
            // 2 sources

            case 28: {
                var10_3 /* !! */  = (int)ja.andf("anmg", andh(int ), (int)191);
                if (!var11_2) ** GOTO lbl121
                throw null;
            }
lbl201:
            // 2 sources

            case 29: {
                var10_3 /* !! */  = (int)ja.andf("anmh", andh(int ), (int)192);
                if (!var11_2) ** GOTO lbl172
                throw null;
            }
lbl205:
            // 3 sources

            case 30: {
                var10_3 /* !! */  = (int)ja.andf("anmi", andh(int ), (int)193);
                if (!var11_2) ** GOTO lbl159
                throw null;
            }
            case 31: {
                var10_3 /* !! */  = (int)ja.andf("anmj", andh(int ), (int)194);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl214:
            // 3 sources

            case 32: {
                var10_3 /* !! */  = (int)ja.andf("anmk", andh(int ), (int)195);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl219:
            // 2 sources

            case 33: {
                var10_3 /* !! */  = (int)ja.andf("anml", andh(int ), (int)196);
                if (!var11_2) ** GOTO lbl168
                throw null;
            }
            case 34: {
                var10_3 /* !! */  = (int)ja.andf("anmm", andh(int ), (int)197);
                if (!var11_2) ** GOTO lbl176
                throw null;
            }
lbl227:
            // 2 sources

            case 35: {
                var10_3 /* !! */  = (int)ja.andf("anmn", andh(int ), (int)198);
                if (!var11_2) ** GOTO lbl73
                throw null;
            }
lbl231:
            // 2 sources

            case 36: {
                var10_3 /* !! */  = (int)ja.andf("anmo", andh(int ), (int)199);
                if (!var11_2) ** GOTO lbl214
                throw null;
            }
            case 37: {
                var10_3 /* !! */  = (int)ja.andf("anmp", andh(int ), (int)200);
                if (!var11_2) ** GOTO lbl83
                throw null;
            }
lbl239:
            // 2 sources

            case 38: {
                var10_3 /* !! */  = (int)ja.andf("anmq", andh(int ), (int)201);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl244:
            // 2 sources

            case 39: {
                var10_3 /* !! */  = (int)ja.andf("anms", andh(int ), (int)202);
                if (!var11_2) ** GOTO lbl214
                throw null;
            }
            case 40: {
                var10_3 /* !! */  = (int)ja.andf("anmt", andh(int ), (int)203);
                if (!var11_2) ** GOTO lbl172
                throw null;
            }
lbl252:
            // 2 sources

            case 41: {
                var10_3 /* !! */  = (int)ja.andf("anmu", andh(int ), (int)204);
                if (!var11_2) ** GOTO lbl205
                throw null;
            }
lbl256:
            // 4 sources

            case 42: {
                var10_3 /* !! */  = (int)ja.andf("anmv", andh(int ), (int)205);
                if (!var11_2) ** GOTO lbl136
                throw null;
            }
lbl260:
            // 2 sources

            case 43: {
                var10_3 /* !! */  = (int)ja.andf("anmw", andh(int ), (int)206);
                if (!var11_2) ** GOTO lbl205
                throw null;
            }
            case 44: 
        }
        var10_3 /* !! */  = (int)ja.andf("anmx", andh(int ), (int)207);
        ** while (!var11_2)
lbl267:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float anea(int n2) {
        return Float.intBitsToFloat(andi[n2] ^ andj[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        var9_2 = ja.c;
        var8_3 /* !! */  = ja.b;
        var7_4 = ja.a;
        if (var9_2) {
            throw null;
lbl6:
            // 24 sources

            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5 = this.getTargetBoxes();
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                if (!var2_5.isEmpty()) ** GOTO lbl20
                if (var7_4 || var7_4) ** GOTO lbl6
                this.resetAnimation();
                if (var7_4 || var7_4) ** GOTO lbl6
                return;
lbl20:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (!this.smoothness.isValue()) ** GOTO lbl27
                if (var7_4 || var7_4) ** GOTO lbl6
                v0 = this.updateAnimatedBoxes(var2_5);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl29
lbl27:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                v0 = var3_6 = var2_5;
lbl29:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.smoothness.isValue()) ** GOTO lbl37
                if (var7_4 || var7_4) ** GOTO lbl6
                this.animatedBoxes.clear();
                if (var7_4 || var7_4) ** GOTO lbl6
                this.animatedBoxes.addAll(var3_6);
                if (var7_4) ** GOTO lbl6
lbl37:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var4_7 = (float)(System.currentTimeMillis() % ja.andf("ango", andc(int ), (int)19)) / ja.andf("angp", anea(int ), (int)59) * this.speed.getValue();
                if (var7_4 || var7_4) ** GOTO lbl6
                ma.begin();
                if (var7_4 || var7_4) ** GOTO lbl6
                var5_8 = var3_6.iterator();
                if (var7_4) ** GOTO lbl6
                do {
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (!var5_8.hasNext()) ** GOTO lbl54
                    if (var7_4) ** GOTO lbl6
                    var6_10 = var5_8.next();
                    if (var7_4 || var7_4) ** GOTO lbl6
                    ma.box(var6_10);
                    if (var7_4 || var7_4) ** GOTO lbl6
                } while (!var9_2);
                throw null;
lbl54:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var5_9 = nd.getClientColorAt(0.0f);
                if (var7_4 || var7_4) ** GOTO lbl6
                var6_11 = nd.getClientColorAt((float)ja.andf("angq", anea(int ), (int)60));
                if (var7_4 || var7_4) ** GOTO lbl6
                ma.end(var5_9, var6_11, this.alpha.getValue(), var4_7, this.scale.getValue());
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_3 /* !! */  = (int)ja.andf("angr", andh(int ), (int)61);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl68:
            // 3 sources

            case 1: {
                var8_3 /* !! */  = (int)ja.andf("angs", andh(int ), (int)62);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl73:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)ja.andf("angt", andh(int ), (int)63);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl78:
            // 3 sources

            case 3: {
                var8_3 /* !! */  = (int)ja.andf("angu", andh(int ), (int)64);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 4: {
                var8_3 /* !! */  = (int)ja.andf("angv", andh(int ), (int)65);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl88:
            // 4 sources

            case 5: {
                var8_3 /* !! */  = (int)ja.andf("angx", andh(int ), (int)66);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl93:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)ja.andf("angy", andh(int ), (int)67);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl98:
            // 4 sources

            case 7: {
                var8_3 /* !! */  = (int)ja.andf("angz", andh(int ), (int)68);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 8: {
                var8_3 /* !! */  = (int)ja.andf("anha", andh(int ), (int)69);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl108:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)ja.andf("anhb", andh(int ), (int)70);
                if (!var9_2) ** GOTO lbl88
                throw null;
            }
            case 10: {
                var8_3 /* !! */  = (int)ja.andf("anhc", andh(int ), (int)71);
                if (!var9_2) break;
                throw null;
            }
            case 11: {
                var8_3 /* !! */  = (int)ja.andf("anhd", andh(int ), (int)72);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 12: {
                var8_3 /* !! */  = (int)ja.andf("anhe", andh(int ), (int)73);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl126:
            // 3 sources

            case 13: {
                var8_3 /* !! */  = (int)ja.andf("anhf", andh(int ), (int)74);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl131:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)ja.andf("anhg", andh(int ), (int)75);
                if (!var9_2) ** GOTO lbl88
                throw null;
            }
            case 15: {
                var8_3 /* !! */  = (int)ja.andf("anhh", andh(int ), (int)76);
                if (!var9_2) ** GOTO lbl88
                throw null;
            }
lbl139:
            // 3 sources

            case 16: {
                var8_3 /* !! */  = (int)ja.andf("anhi", andh(int ), (int)77);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl144:
            // 2 sources

            case 17: {
                var8_3 /* !! */  = (int)ja.andf("anhj", andh(int ), (int)78);
                if (!var9_2) ** GOTO lbl78
                throw null;
            }
            case 18: {
                var8_3 /* !! */  = (int)ja.andf("anhk", andh(int ), (int)79);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 19: {
                var8_3 /* !! */  = (int)ja.andf("anhl", andh(int ), (int)80);
                if (!var9_2) ** GOTO lbl108
                throw null;
            }
lbl157:
            // 3 sources

            case 20: {
                var8_3 /* !! */  = (int)ja.andf("anhm", andh(int ), (int)81);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl162:
            // 2 sources

            case 21: {
                do {
                    var8_3 /* !! */  = (int)ja.andf("anhn", andh(int ), (int)82);
                } while (!var9_2);
                throw null;
            }
lbl167:
            // 2 sources

            case 22: {
                var8_3 /* !! */  = (int)ja.andf("anho", andh(int ), (int)83);
                if (!var9_2) ** GOTO lbl93
                throw null;
            }
lbl171:
            // 2 sources

            case 23: {
                var8_3 /* !! */  = (int)ja.andf("anhp", andh(int ), (int)84);
                if (!var9_2) ** GOTO lbl144
                throw null;
            }
lbl175:
            // 3 sources

            case 24: {
                var8_3 /* !! */  = (int)ja.andf("anhq", andh(int ), (int)85);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl180:
            // 2 sources

            case 25: {
                var8_3 /* !! */  = (int)ja.andf("anhs", andh(int ), (int)86);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl185:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)ja.andf("anht", andh(int ), (int)87);
                if (!var9_2) ** GOTO lbl126
                throw null;
            }
            case 27: {
                var8_3 /* !! */  = (int)ja.andf("anhu", andh(int ), (int)88);
                if (!var9_2) ** GOTO lbl98
                throw null;
            }
lbl193:
            // 5 sources

            case 28: {
                var8_3 /* !! */  = (int)ja.andf("anhv", andh(int ), (int)89);
                if (!var9_2) ** GOTO lbl162
                throw null;
            }
            case 29: {
                var8_3 /* !! */  = (int)ja.andf("anhw", andh(int ), (int)90);
                if (!var9_2) ** GOTO lbl73
                throw null;
            }
lbl201:
            // 2 sources

            case 30: {
                var8_3 /* !! */  = (int)ja.andf("anhx", andh(int ), (int)91);
                if (!var9_2) ** GOTO lbl98
                throw null;
            }
lbl205:
            // 2 sources

            case 31: {
                var8_3 /* !! */  = (int)ja.andf("anhy", andh(int ), (int)92);
                if (!var9_2) ** GOTO lbl98
                throw null;
            }
lbl209:
            // 2 sources

            case 32: {
                var8_3 /* !! */  = (int)ja.andf("anhz", andh(int ), (int)93);
                if (!var9_2) ** GOTO lbl205
                throw null;
            }
            case 33: {
                var8_3 /* !! */  = (int)ja.andf("ania", andh(int ), (int)94);
                if (!var9_2) ** GOTO lbl175
                throw null;
            }
lbl217:
            // 2 sources

            case 34: {
                var8_3 /* !! */  = (int)ja.andf("anib", andh(int ), (int)95);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 35: {
                var8_3 /* !! */  = (int)ja.andf("anic", andh(int ), (int)96);
                if (!var9_2) ** GOTO lbl68
                throw null;
            }
lbl226:
            // 2 sources

            case 36: {
                var8_3 /* !! */  = (int)ja.andf("anid", andh(int ), (int)97);
                if (!var9_2) ** GOTO lbl157
                throw null;
            }
lbl230:
            // 3 sources

            case 37: {
                var8_3 /* !! */  = (int)ja.andf("anie", andh(int ), (int)98);
                if (!var9_2) ** GOTO lbl171
                throw null;
            }
lbl234:
            // 3 sources

            case 38: {
                var8_3 /* !! */  = (int)ja.andf("anif", andh(int ), (int)99);
                if (!var9_2) ** GOTO lbl68
                throw null;
            }
            case 39: {
                var8_3 /* !! */  = (int)ja.andf("anig", andh(int ), (int)100);
                if (!var9_2) ** GOTO lbl139
                throw null;
            }
            case 40: {
                var8_3 /* !! */  = (int)ja.andf("anih", andh(int ), (int)101);
                if (!var9_2) ** GOTO lbl234
                throw null;
            }
lbl246:
            // 2 sources

            case 41: {
                var8_3 /* !! */  = (int)ja.andf("anii", andh(int ), (int)102);
                if (!var9_2) ** GOTO lbl193
                throw null;
            }
            case 42: {
                var8_3 /* !! */  = (int)ja.andf("anij", andh(int ), (int)103);
                if (!var9_2) ** GOTO lbl73
                throw null;
            }
lbl254:
            // 2 sources

            case 43: {
                var8_3 /* !! */  = (int)ja.andf("anik", andh(int ), (int)104);
                if (!var9_2) ** GOTO lbl185
                throw null;
            }
            case 44: {
                var8_3 /* !! */  = (int)ja.andf("anil", andh(int ), (int)105);
                if (!var9_2) ** GOTO lbl78
                throw null;
            }
            case 45: {
                var8_3 /* !! */  = (int)ja.andf("anin", andh(int ), (int)106);
                if (!var9_2) ** GOTO lbl226
                throw null;
            }
            case 46: 
        }
        do {
            var8_3 /* !! */  = (int)ja.andf("anio", andh(int ), (int)107);
        } while (!var9_2);
        throw null;
    }
}

