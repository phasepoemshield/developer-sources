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

public class kp {
    static public final boolean a;
    static public final int b;
    static private GpuBuffer uniformBuffer;
    static private long[] hmtz;
    static private int[] hmuo;
    static private RenderPipeline pipeline;
    static private final int UNIFORM_SIZE = 128;
    static private long[] hmty;
    static public final boolean c;
    static private int[] hmun;
    static final long op = 2724409754618449070L;

    private static void hndr() {
        kp.hmty[0] = -6271104717541645816L;
        kp.hmty[1] = -7664466420795144351L;
        kp.hmty[2] = -5151191830059598458L;
        kp.hmty[3] = 5964537783146352045L;
        kp.hmty[4] = -4424508606851622072L;
        kp.hmty[5] = 6141281091595036456L;
        kp.hmty[6] = 3646879176775427714L;
        kp.hmty[7] = -2577860259479723686L;
        kp.hmty[8] = -7985448593942463710L;
        kp.hmty[9] = -6008418801031510430L;
        kp.hmty[10] = 1604520727561557358L;
        kp.hmty[11] = -3446078006570329787L;
        kp.hmty[12] = -5700321673750159722L;
        kp.hmty[13] = 9153838943322622744L;
        kp.hmty[14] = 2169309241207279218L;
        kp.hmty[15] = 4571279088674032204L;
        kp.hmty[16] = -3430130265980134201L;
        kp.hmty[17] = 3009318782164343070L;
        kp.hmty[18] = -5477145920007378185L;
        kp.hmty[19] = -8908269842485688105L;
        kp.hmty[20] = -2822355439742835791L;
        kp.hmty[21] = -1410474184170997850L;
        kp.hmty[22] = -5830638401003154267L;
        kp.hmty[23] = 4841454603995809117L;
        kp.hmty[24] = 5405647019591151538L;
        kp.hmty[25] = 8436155137774943072L;
        kp.hmty[26] = 7298438770756114998L;
        kp.hmty[27] = 5990146766977913982L;
        kp.hmty[28] = -8519407198624089210L;
        kp.hmty[29] = -389085239200854355L;
        kp.hmty[30] = -306583275425589747L;
        kp.hmty[31] = -3461329355053085034L;
        kp.hmty[32] = 4900102508116797719L;
        kp.hmty[33] = 2999574005978521812L;
        kp.hmty[34] = -5711160659185464223L;
        kp.hmty[35] = 6579000916439301193L;
        kp.hmty[36] = 1558042555893552555L;
        kp.hmty[37] = -4073325920873889809L;
        kp.hmty[38] = -3257219307083426498L;
        kp.hmty[39] = 9190492758157868962L;
        kp.hmty[40] = -1358290111534839096L;
        kp.hmty[41] = 6758823148863942229L;
        kp.hmty[42] = 4892136349141844237L;
        kp.hmty[43] = 2903089579940489926L;
        kp.hmty[44] = 749927757466917121L;
        kp.hmty[45] = 4792862160665531941L;
        kp.hmty[46] = -7433162888863278004L;
        kp.hmty[47] = -4231698249824987312L;
        kp.hmty[48] = -297416734385050844L;
        kp.hmty[49] = -8602750933197119311L;
        kp.hmty[50] = -2118210881704019835L;
        kp.hmty[51] = -7670319032001651802L;
        kp.hmty[52] = -275094465883510275L;
        kp.hmty[53] = 3653241762420514859L;
        kp.hmty[54] = -3839925043734809651L;
        kp.hmty[55] = 8652482151209677845L;
        kp.hmty[56] = 6000703626569648857L;
        kp.hmty[57] = 3312790266076844832L;
        kp.hmty[58] = 7505437969685429998L;
        kp.hmty[59] = 5521142745063280469L;
        kp.hmty[60] = -3653188516226611471L;
        kp.hmty[61] = -4411676073055808244L;
        kp.hmty[62] = 1911066273893437968L;
        kp.hmty[63] = -5167423917274018438L;
        kp.hmty[64] = -463031724969671067L;
        kp.hmty[65] = 5915504778240400772L;
        kp.hmty[66] = 7697594978580228948L;
        kp.hmty[67] = -2374360441008033664L;
        kp.hmty[68] = -5637553762166696635L;
        kp.hmty[69] = -4112932986651662891L;
        kp.hmty[70] = -8172617182773447426L;
        kp.hmty[71] = 7901414689176701132L;
        kp.hmty[72] = 8505473759158635620L;
        kp.hmty[73] = 6174988731808713168L;
        kp.hmty[74] = -5840899615894374366L;
        kp.hmty[75] = -2236845453608319039L;
        kp.hmty[76] = -2001590581332315892L;
        kp.hmty[77] = -6201681972140140219L;
        kp.hmty[78] = 2394419868344132143L;
        kp.hmty[79] = 6977605740176689737L;
        kp.hmty[80] = -6038428569803412905L;
        kp.hmty[81] = -423118012995145619L;
        kp.hmty[82] = -453183484745206907L;
        kp.hmty[83] = -2714103215315481611L;
        kp.hmty[84] = -4307124149196796796L;
        kp.hmty[85] = 5700382759333443135L;
        kp.hmty[86] = -5726268315185996684L;
        kp.hmty[87] = 9062149007636293916L;
        kp.hmty[88] = -8791403406865319151L;
        kp.hmty[89] = 8160313640036168333L;
        kp.hmty[90] = 3361952569074182353L;
        kp.hmty[91] = -4673154040583974579L;
        kp.hmty[92] = -6455436984951886978L;
        kp.hmty[93] = -3224080329634975874L;
        kp.hmty[94] = -5497344385480337299L;
    }

    private static void hndo() {
        kp.hmun[100] = -1231259338;
        kp.hmun[101] = 1770556484;
        kp.hmun[102] = 305173686;
        kp.hmun[103] = 1252391421;
        kp.hmun[104] = -5613706;
        kp.hmun[105] = -582943337;
        kp.hmun[106] = -932218489;
        kp.hmun[107] = 1175064539;
        kp.hmun[108] = 812615949;
        kp.hmun[109] = 1257194416;
        kp.hmun[110] = 1057721826;
        kp.hmun[111] = 2032695591;
        kp.hmun[112] = -862018223;
        kp.hmun[113] = -2145723836;
        kp.hmun[114] = -1290220501;
        kp.hmun[115] = 1094898504;
        kp.hmun[116] = -381824133;
        kp.hmun[117] = 651516179;
        kp.hmun[118] = 276955456;
        kp.hmun[119] = -365943012;
        kp.hmun[120] = -1096265315;
        kp.hmun[121] = -735195413;
        kp.hmun[122] = 465857222;
        kp.hmun[123] = 572163405;
        kp.hmun[124] = -317562128;
        kp.hmun[125] = -1708938457;
        kp.hmun[126] = 465925946;
        kp.hmun[127] = -619272377;
        kp.hmun[128] = 2040641513;
        kp.hmun[129] = -790962939;
        kp.hmun[130] = -99741470;
        kp.hmun[131] = 749916361;
        kp.hmun[132] = 866091528;
        kp.hmun[133] = 554798391;
        kp.hmun[134] = 1737781029;
        kp.hmun[135] = -1300367268;
        kp.hmun[136] = -5328917;
        kp.hmun[137] = -1081919833;
        kp.hmun[138] = 1609330592;
        kp.hmun[139] = -1163198968;
        kp.hmun[140] = -622281745;
        kp.hmun[141] = 792304550;
        kp.hmun[142] = -369327619;
        kp.hmun[143] = -573894282;
        kp.hmun[144] = -814410846;
        kp.hmun[145] = 552255502;
        kp.hmun[146] = -1738734222;
        kp.hmun[147] = -1235046298;
    }

    private static void hnds() {
        kp.hmtz[0] = -8720584030316932936L;
        kp.hmtz[1] = 7097863121505075143L;
        kp.hmtz[2] = -3242803843369117321L;
        kp.hmtz[3] = 5077650140443690641L;
        kp.hmtz[4] = -1256375657874434695L;
        kp.hmtz[5] = -3268538701417204909L;
        kp.hmtz[6] = -257966311468039283L;
        kp.hmtz[7] = -599972480964932213L;
        kp.hmtz[8] = 2524639886186131840L;
        kp.hmtz[9] = 8862818360764534972L;
        kp.hmtz[10] = -8882978473044761865L;
        kp.hmtz[11] = 8030354411351282047L;
        kp.hmtz[12] = -6576239292869010146L;
        kp.hmtz[13] = 7079797798761765346L;
        kp.hmtz[14] = 1754442974705269304L;
        kp.hmtz[15] = -7675203690994685252L;
        kp.hmtz[16] = -2405974367566444467L;
        kp.hmtz[17] = -269485265799908310L;
        kp.hmtz[18] = -5232449180983314033L;
        kp.hmtz[19] = -2733414826745677510L;
        kp.hmtz[20] = -6066021672141196662L;
        kp.hmtz[21] = -625039029611357759L;
        kp.hmtz[22] = -6221481802251350041L;
        kp.hmtz[23] = -3519616806124344147L;
        kp.hmtz[24] = 8147166978676651971L;
        kp.hmtz[25] = 7982859750865302470L;
        kp.hmtz[26] = 8015189115308300403L;
        kp.hmtz[27] = 2091281276474887616L;
        kp.hmtz[28] = -2353021685939219599L;
        kp.hmtz[29] = -33699797414998807L;
        kp.hmtz[30] = 4594290174330670905L;
        kp.hmtz[31] = 8424647040863905664L;
        kp.hmtz[32] = -6793374060924052683L;
        kp.hmtz[33] = -2816773791421912119L;
        kp.hmtz[34] = -1720373209884697224L;
        kp.hmtz[35] = -1445992686125660837L;
        kp.hmtz[36] = 4258766927315001482L;
        kp.hmtz[37] = 6683723706764711018L;
        kp.hmtz[38] = -6881997402487717218L;
        kp.hmtz[39] = 2820544072805757393L;
        kp.hmtz[40] = -2545523830261439314L;
        kp.hmtz[41] = -9040597643308522387L;
        kp.hmtz[42] = -7349665058332206925L;
        kp.hmtz[43] = 8631138961340771175L;
        kp.hmtz[44] = -6959884969078505675L;
        kp.hmtz[45] = 2426095393857191787L;
        kp.hmtz[46] = 6046638130253273674L;
        kp.hmtz[47] = -4666884258742993007L;
        kp.hmtz[48] = 3323970913602190447L;
        kp.hmtz[49] = -1162358943802532886L;
        kp.hmtz[50] = -5520796564319565675L;
        kp.hmtz[51] = 8856900589288675042L;
        kp.hmtz[52] = 569637742227858673L;
        kp.hmtz[53] = -4288853717711617177L;
        kp.hmtz[54] = -2783160374657104340L;
        kp.hmtz[55] = 8652482151209677973L;
        kp.hmtz[56] = -5758723651964911610L;
        kp.hmtz[57] = -1567449146463600119L;
        kp.hmtz[58] = -1693806775162873219L;
        kp.hmtz[59] = 1945098416637422992L;
        kp.hmtz[60] = -8844088306354481859L;
        kp.hmtz[61] = -3265439418334724259L;
        kp.hmtz[62] = -2924078098282181760L;
        kp.hmtz[63] = -7183874827468477091L;
        kp.hmtz[64] = 1907624405036695015L;
        kp.hmtz[65] = -5505422035855772623L;
        kp.hmtz[66] = 995508442969557759L;
        kp.hmtz[67] = 3248002762349877163L;
        kp.hmtz[68] = 4984763622981285429L;
        kp.hmtz[69] = 8523475406072216685L;
        kp.hmtz[70] = -4702329109674182185L;
        kp.hmtz[71] = -6550770544666351900L;
        kp.hmtz[72] = -5500859466242527532L;
        kp.hmtz[73] = -8793144939078388728L;
        kp.hmtz[74] = -4426583147731207716L;
        kp.hmtz[75] = -6259301659188601407L;
        kp.hmtz[76] = -9043089780465409080L;
        kp.hmtz[77] = -8750934458770588456L;
        kp.hmtz[78] = 2531433411931091919L;
        kp.hmtz[79] = 3253942136465168103L;
        kp.hmtz[80] = 5799021795639538959L;
        kp.hmtz[81] = -1638026162698357990L;
        kp.hmtz[82] = -3852932166997439068L;
        kp.hmtz[83] = -61050196810455616L;
        kp.hmtz[84] = 1017645342390597632L;
        kp.hmtz[85] = -890572241297652872L;
        kp.hmtz[86] = -2774324273980098788L;
        kp.hmtz[87] = -2805703132372350602L;
        kp.hmtz[88] = 4716592684720713430L;
        kp.hmtz[89] = 3688953546592640869L;
        kp.hmtz[90] = 6446935387927007854L;
        kp.hmtz[91] = 8230771986995587880L;
        kp.hmtz[92] = 6408606349781194403L;
        kp.hmtz[93] = -7993728948460296043L;
        kp.hmtz[94] = -6279777152702787707L;
    }

    public kp() {
    }

    private static long hmtx(int n2) {
        return hmty[n2] ^ hmtz[n2];
    }

    private static void hndq() {
        kp.hmuo[100] = -1231259376;
        kp.hmuo[101] = 1770556531;
        kp.hmuo[102] = 305173675;
        kp.hmuo[103] = 1252391369;
        kp.hmuo[104] = -5613729;
        kp.hmuo[105] = -582943299;
        kp.hmuo[106] = -932218477;
        kp.hmuo[107] = 1175064572;
        kp.hmuo[108] = 812615991;
        kp.hmuo[109] = 1257194385;
        kp.hmuo[110] = 1057721854;
        kp.hmuo[111] = 2032695594;
        kp.hmuo[112] = -862018238;
        kp.hmuo[113] = -2145723815;
        kp.hmuo[114] = -1290220489;
        kp.hmuo[115] = 1094898509;
        kp.hmuo[116] = -381824169;
        kp.hmuo[117] = 651516178;
        kp.hmuo[118] = -413416305;
        kp.hmuo[119] = -365943011;
        kp.hmuo[120] = 1618735515;
        kp.hmuo[121] = 735195412;
        kp.hmuo[122] = 1341657410;
        kp.hmuo[123] = 572163406;
        kp.hmuo[124] = -317562123;
        kp.hmuo[125] = -1708938457;
        kp.hmuo[126] = 465925945;
        kp.hmuo[127] = -619272372;
        kp.hmuo[128] = 2040641505;
        kp.hmuo[129] = -790962944;
        kp.hmuo[130] = -99741467;
        kp.hmuo[131] = 749916354;
        kp.hmuo[132] = 866091528;
        kp.hmuo[133] = 554798391;
        kp.hmuo[134] = 1737781025;
        kp.hmuo[135] = -1300367268;
        kp.hmuo[136] = 5328916;
        kp.hmuo[137] = 233609394;
        kp.hmuo[138] = -1609330593;
        kp.hmuo[139] = -1127783101;
        kp.hmuo[140] = -622281748;
        kp.hmuo[141] = 792304548;
        kp.hmuo[142] = -369327618;
        kp.hmuo[143] = -573894282;
        kp.hmuo[144] = -814410846;
        kp.hmuo[145] = 552255503;
        kp.hmuo[146] = -1738734222;
        kp.hmuo[147] = -1235046297;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 52[SWITCH]
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
    private static String lambda$draw$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kp.op - kp.hmua("hnco", hmtx(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kp.hmua("hncp", hmum(int ), (int)136)) break;
            v0 /* !! */  = (long)kp.hmua("hncq", hmum(int ), (int)137);
        }
        var2 = kp.c;
        v1 /* !! */  = kp.op;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - kp.hmua("hncr", hmtx(int ), (int)83));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2042073310: {
                    v2 = kp.hmua("hncs", hmtx(int ), (int)84);
                    continue block12;
                }
                case -1096528722: {
                    break block12;
                }
                case 234457949: {
                    v2 = kp.hmua("hnct", hmtx(int ), (int)85);
                    continue block12;
                }
            }
            break;
        }
        var1_1 /* !! */  = kp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kp.op - kp.hmua("hncu", hmtx(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kp.hmua("hncv", hmum(int ), (int)138)) break;
            v3 /* !! */  = (long)kp.hmua("hncw", hmum(int ), (int)139);
        }
        var0_2 = kp.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "Hue2D";
            }
lbl38:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)kp.hmua("hncx", hmum(int ), (int)140);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)kp.hmua("hncy", hmum(int ), (int)141);
                if (!var2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kp.hmua("hncz", hmum(int ), (int)142);
                    if (!var2) ** GOTO lbl38
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)kp.hmua("hnda", hmum(int ), (int)143);
        ** while (!var2)
lbl54:
        // 1 sources

        throw null;
    }

    static {
        hmun = new int[148];
        hmuo = new int[148];
        kp.hndn();
        kp.hndo();
        kp.hndp();
        kp.hndq();
        hmty = new long[95];
        hmtz = new long[95];
        kp.hndr();
        kp.hnds();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String lambda$init$0() {
        v0 /* !! */  = kp.op;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(kp.hmua("hndc", hmtx(int ), (int)88) - kp.hmua("hndb", hmtx(int ), (int)87));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1301936955: {
                    continue block20;
                }
                case -1096528722: {
                    break block20;
                }
            }
            break;
        }
        var2 = kp.c;
        v1 /* !! */  = kp.op;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - kp.hmua("hndd", hmtx(int ), (int)89));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1850600742: {
                    v2 = kp.hmua("hnde", hmtx(int ), (int)90);
                    continue block21;
                }
                case -1096528722: {
                    break block21;
                }
                case 322844230: {
                    v2 = kp.hmua("hndf", hmtx(int ), (int)91);
                    continue block21;
                }
                case 1421498646: {
                    v2 = kp.hmua("hndg", hmtx(int ), (int)92);
                    continue block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = kp.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = kp.op;
                if (true) ** GOTO lbl35
                block22: while (true) {
                    v3 /* !! */  = (long)(kp.hmua("hndi", hmtx(int ), (int)94) - kp.hmua("hndh", hmtx(int ), (int)93));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1096528722: {
                            break block22;
                        }
                        case 1585499638: {
                            continue block22;
                        }
                    }
                    break;
                }
                var0_2 = kp.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Hue2D Uniforms";
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)kp.hmua("hndj", hmum(int ), (int)144);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kp.hmua("hndk", hmum(int ), (int)145);
                    if (!var2) break block10;
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)kp.hmua("hndl", hmum(int ), (int)146);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)kp.hmua("hndm", hmum(int ), (int)147);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = kp.op;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - kp.hmua("hnbe", hmtx(int ), (int)65));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1096528722: {
                    break block39;
                }
                case -799593544: {
                    v1 = kp.hmua("hnbf", hmtx(int ), (int)66);
                    continue block39;
                }
                case 1546638906: {
                    v1 = kp.hmua("hnbg", hmtx(int ), (int)67);
                    continue block39;
                }
            }
            break;
        }
        var2 = kp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kp.op - kp.hmua("hnbh", hmtx(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kp.hmua("hnbi", hmum(int ), (int)117)) break;
            v2 /* !! */  = (long)kp.hmua("hnbj", hmum(int ), (int)118);
        }
        var1_1 /* !! */  = kp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kp.op - kp.hmua("hnbk", hmtx(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kp.hmua("hnbl", hmum(int ), (int)119)) break;
            v3 /* !! */  = (long)kp.hmua("hnbm", hmum(int ), (int)120);
        }
        var0_2 = kp.a;
        if (var2) {
            throw null;
lbl31:
            // 7 sources

            return;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = kp.op - kp.hmua("hnbn", hmtx(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kp.hmua("hnbo", hmum(int ), (int)121)) break;
                    v4 /* !! */  = (long)kp.hmua("hnbp", hmum(int ), (int)122);
                }
                if (kp.uniformBuffer == null) ** GOTO lbl88
                if (var0_2 || var0_2) ** GOTO lbl31
                v5 /* !! */  = kp.op;
                if (true) ** GOTO lbl50
                block44: while (true) {
                    v5 /* !! */  = (long)(kp.hmua("hnbr", hmtx(int ), (int)72) - kp.hmua("hnbq", hmtx(int ), (int)71));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1096528722: {
                            break block44;
                        }
                        case -29114806: {
                            continue block44;
                        }
                    }
                    break;
                }
                v6 /* !! */  = kp.op;
                if (true) ** GOTO lbl59
                block45: while (true) {
                    v6 /* !! */  = (long)(v7 - kp.hmua("hnbs", hmtx(int ), (int)73));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1174134976: {
                            v7 = kp.hmua("hnbt", hmtx(int ), (int)74);
                            continue block45;
                        }
                        case -1096528722: {
                            break block45;
                        }
                        case 1461983113: {
                            v7 = kp.hmua("hnbu", hmtx(int ), (int)75);
                            continue block45;
                        }
                    }
                    break;
                }
                kp.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl31
                v8 /* !! */  = kp.op;
                if (true) ** GOTO lbl74
                block46: while (true) {
                    v8 /* !! */  = (long)(v9 - kp.hmua("hnbv", hmtx(int ), (int)76));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1096528722: {
                            break block46;
                        }
                        case 803775083: {
                            v9 = kp.hmua("hnbw", hmtx(int ), (int)77);
                            continue block46;
                        }
                        case 1130192416: {
                            v9 = kp.hmua("hnbx", hmtx(int ), (int)78);
                            continue block46;
                        }
                        case 1149703750: {
                            v9 = kp.hmua("hnby", hmtx(int ), (int)79);
                            continue block46;
                        }
                    }
                    break;
                }
                kp.uniformBuffer = null;
                if (var0_2) ** GOTO lbl31
lbl88:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl31
                v10 /* !! */  = kp.op;
                if (true) ** GOTO lbl93
                block47: while (true) {
                    v10 /* !! */  = (long)(kp.hmua("hnca", hmtx(int ), (int)81) - kp.hmua("hnbz", hmtx(int ), (int)80));
lbl93:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1260518034: {
                            continue block47;
                        }
                        case -1096528722: {
                            break block47;
                        }
                    }
                    break;
                }
                kp.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)kp.hmua("hncb", hmum(int ), (int)123);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 1: {
                var1_1 /* !! */  = (int)kp.hmua("hncc", hmum(int ), (int)124);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl112:
            // 3 sources

            case 2: {
                var1_1 /* !! */  = (int)kp.hmua("hncd", hmum(int ), (int)125);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl117:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)kp.hmua("hnce", hmum(int ), (int)126);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl122:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)kp.hmua("hncf", hmum(int ), (int)127);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl127:
            // 3 sources

            case 5: {
                var1_1 /* !! */  = (int)kp.hmua("hncg", hmum(int ), (int)128);
                if (!var2) ** GOTO lbl122
                throw null;
            }
lbl131:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)kp.hmua("hnch", hmum(int ), (int)129);
                if (!var2) ** GOTO lbl117
                throw null;
            }
lbl135:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)kp.hmua("hnci", hmum(int ), (int)130);
                if (!var2) ** GOTO lbl127
                throw null;
            }
lbl139:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)kp.hmua("hncj", hmum(int ), (int)131);
                if (!var2) ** GOTO lbl135
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)kp.hmua("hnck", hmum(int ), (int)132);
                if (!var2) ** GOTO lbl112
                throw null;
            }
lbl147:
            // 3 sources

            case 10: {
                var1_1 /* !! */  = (int)kp.hmua("hncl", hmum(int ), (int)133);
                if (!var2) ** GOTO lbl127
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kp.hmua("hncm", hmum(int ), (int)134);
                    if (!var2) break block5;
                    throw null;
                }
            }
            case 12: 
        }
        var1_1 /* !! */  = (int)kp.hmua("hncn", hmum(int ), (int)135);
        ** while (!var2)
lbl159:
        // 1 sources

        throw null;
    }

    public static CallSite hmua(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static void hndp() {
        kp.hmuo[0] = 948666623;
        kp.hmuo[1] = -1933205151;
        kp.hmuo[2] = 2020795995;
        kp.hmuo[3] = 1426352711;
        kp.hmuo[4] = 1504254828;
        kp.hmuo[5] = -1492337024;
        kp.hmuo[6] = 375813938;
        kp.hmuo[7] = -505984118;
        kp.hmuo[8] = 2027582026;
        kp.hmuo[9] = 700115290;
        kp.hmuo[10] = -46939993;
        kp.hmuo[11] = 1528920644;
        kp.hmuo[12] = -1893041732;
        kp.hmuo[13] = -229323428;
        kp.hmuo[14] = 1484328399;
        kp.hmuo[15] = -849268232;
        kp.hmuo[16] = -1558862532;
        kp.hmuo[17] = -835820113;
        kp.hmuo[18] = -862529387;
        kp.hmuo[19] = 63817434;
        kp.hmuo[20] = -1195954261;
        kp.hmuo[21] = -158290322;
        kp.hmuo[22] = -1967128975;
        kp.hmuo[23] = -1354714860;
        kp.hmuo[24] = 774103966;
        kp.hmuo[25] = -765112228;
        kp.hmuo[26] = 1969684142;
        kp.hmuo[27] = -1891718490;
        kp.hmuo[28] = -261266262;
        kp.hmuo[29] = 729460646;
        kp.hmuo[30] = -200678984;
        kp.hmuo[31] = 477405718;
        kp.hmuo[32] = 1802146386;
        kp.hmuo[33] = 1975756411;
        kp.hmuo[34] = -34006261;
        kp.hmuo[35] = 387542900;
        kp.hmuo[36] = 1612069180;
        kp.hmuo[37] = -1889666624;
        kp.hmuo[38] = 2077278696;
        kp.hmuo[39] = -985510008;
        kp.hmuo[40] = -1496043678;
        kp.hmuo[41] = -715756756;
        kp.hmuo[42] = -1552264568;
        kp.hmuo[43] = 523786517;
        kp.hmuo[44] = -162168286;
        kp.hmuo[45] = 2020048947;
        kp.hmuo[46] = 0x73737C73;
        kp.hmuo[47] = -1160890839;
        kp.hmuo[48] = 1773662083;
        kp.hmuo[49] = 350560104;
        kp.hmuo[50] = -439552336;
        kp.hmuo[51] = -2084386613;
        kp.hmuo[52] = 1871339641;
        kp.hmuo[53] = 741193591;
        kp.hmuo[54] = -817410642;
        kp.hmuo[55] = 573549834;
        kp.hmuo[56] = -232242330;
        kp.hmuo[57] = 1351770457;
        kp.hmuo[58] = -1076614297;
        kp.hmuo[59] = 1905608786;
        kp.hmuo[60] = -686716188;
        kp.hmuo[61] = 1096970690;
        kp.hmuo[62] = 119635394;
        kp.hmuo[63] = -1865942527;
        kp.hmuo[64] = 16602305;
        kp.hmuo[65] = -23450148;
        kp.hmuo[66] = -1169809608;
        kp.hmuo[67] = 455557433;
        kp.hmuo[68] = -272532150;
        kp.hmuo[69] = -1485072582;
        kp.hmuo[70] = 1593697722;
        kp.hmuo[71] = 2025909239;
        kp.hmuo[72] = 973710028;
        kp.hmuo[73] = 1884521223;
        kp.hmuo[74] = 526203858;
        kp.hmuo[75] = -1567644828;
        kp.hmuo[76] = -2089001641;
        kp.hmuo[77] = 1092382845;
        kp.hmuo[78] = -322787320;
        kp.hmuo[79] = -1960482453;
        kp.hmuo[80] = 1452650181;
        kp.hmuo[81] = 1943261853;
        kp.hmuo[82] = 877586054;
        kp.hmuo[83] = -1207444597;
        kp.hmuo[84] = -932581638;
        kp.hmuo[85] = 1970127132;
        kp.hmuo[86] = 278034686;
        kp.hmuo[87] = -1240641811;
        kp.hmuo[88] = -436946836;
        kp.hmuo[89] = -1164032868;
        kp.hmuo[90] = -1247162165;
        kp.hmuo[91] = -2140726856;
        kp.hmuo[92] = 1120639205;
        kp.hmuo[93] = -110185957;
        kp.hmuo[94] = 217020246;
        kp.hmuo[95] = -805921372;
        kp.hmuo[96] = 1078233735;
        kp.hmuo[97] = 218679728;
        kp.hmuo[98] = -1778526021;
        kp.hmuo[99] = -1940920371;
    }

    private static void hndn() {
        kp.hmun[0] = 948666622;
        kp.hmun[1] = 527746003;
        kp.hmun[2] = 2020795994;
        kp.hmun[3] = -758583093;
        kp.hmun[4] = -1504254829;
        kp.hmun[5] = 547096894;
        kp.hmun[6] = 375813939;
        kp.hmun[7] = -1044216887;
        kp.hmun[8] = 2027582027;
        kp.hmun[9] = -142610400;
        kp.hmun[10] = 46939992;
        kp.hmun[11] = -1931756835;
        kp.hmun[12] = -1893041731;
        kp.hmun[13] = -331571928;
        kp.hmun[14] = -1484328400;
        kp.hmun[15] = -2033476563;
        kp.hmun[16] = 1558862531;
        kp.hmun[17] = 892762070;
        kp.hmun[18] = -862529387;
        kp.hmun[19] = 63817435;
        kp.hmun[20] = -305048905;
        kp.hmun[21] = -158290321;
        kp.hmun[22] = -957541852;
        kp.hmun[23] = -1354714859;
        kp.hmun[24] = -913610669;
        kp.hmun[25] = -765112108;
        kp.hmun[26] = 1969684143;
        kp.hmun[27] = -404658685;
        kp.hmun[28] = 261266261;
        kp.hmun[29] = -472903609;
        kp.hmun[30] = 200678983;
        kp.hmun[31] = 209635625;
        kp.hmun[32] = 1802146384;
        kp.hmun[33] = 1975756410;
        kp.hmun[34] = -34006259;
        kp.hmun[35] = 387542905;
        kp.hmun[36] = 1612069171;
        kp.hmun[37] = -1889666619;
        kp.hmun[38] = 2077278712;
        kp.hmun[39] = -985510007;
        kp.hmun[40] = -1496043678;
        kp.hmun[41] = -715756756;
        kp.hmun[42] = -1552264565;
        kp.hmun[43] = 523786524;
        kp.hmun[44] = -162168270;
        kp.hmun[45] = 2020048958;
        kp.hmun[46] = 1936948336;
        kp.hmun[47] = -1160890840;
        kp.hmun[48] = 1773662082;
        kp.hmun[49] = 350560120;
        kp.hmun[50] = -439552464;
        kp.hmun[51] = -2084386677;
        kp.hmun[52] = 1871339641;
        kp.hmun[53] = 741193585;
        kp.hmun[54] = -817410658;
        kp.hmun[55] = 573549835;
        kp.hmun[56] = -232242362;
        kp.hmun[57] = 1351770490;
        kp.hmun[58] = -1076614285;
        kp.hmun[59] = 1905608794;
        kp.hmun[60] = -686716218;
        kp.hmun[61] = 1096970689;
        kp.hmun[62] = 119635455;
        kp.hmun[63] = -1865942514;
        kp.hmun[64] = 16602334;
        kp.hmun[65] = -23450146;
        kp.hmun[66] = -1169809620;
        kp.hmun[67] = 455557437;
        kp.hmun[68] = -272532131;
        kp.hmun[69] = -1485072592;
        kp.hmun[70] = 1593697681;
        kp.hmun[71] = 2025909218;
        kp.hmun[72] = 973710029;
        kp.hmun[73] = 1884521233;
        kp.hmun[74] = 526203889;
        kp.hmun[75] = -1567644859;
        kp.hmun[76] = -2089001633;
        kp.hmun[77] = 1092382839;
        kp.hmun[78] = -322787302;
        kp.hmun[79] = -1960482435;
        kp.hmun[80] = 1452650235;
        kp.hmun[81] = 1943261829;
        kp.hmun[82] = 877586101;
        kp.hmun[83] = -1207444594;
        kp.hmun[84] = -932581637;
        kp.hmun[85] = 1970127155;
        kp.hmun[86] = 278034655;
        kp.hmun[87] = -1240641832;
        kp.hmun[88] = -436946833;
        kp.hmun[89] = -1164032884;
        kp.hmun[90] = -1247162133;
        kp.hmun[91] = -2140726892;
        kp.hmun[92] = 1120639228;
        kp.hmun[93] = -110185921;
        kp.hmun[94] = 217020271;
        kp.hmun[95] = -805921352;
        kp.hmun[96] = 1078233767;
        kp.hmun[97] = 218679707;
        kp.hmun[98] = -1778526050;
        kp.hmun[99] = -1940920377;
    }

    /*
     * Exception decompiling
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
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

    private static int hmum(int n2) {
        return hmun[n2] ^ hmuo[n2];
    }
}

