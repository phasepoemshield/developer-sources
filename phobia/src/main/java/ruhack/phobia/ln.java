/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public final class ln {
    public static final boolean a;
    protected static final long qm = -3093942617470732560L;
    private static ByteBuffer uniformData;
    public static final int b;
    private static RenderPipeline pipeline;
    private static int[] iuns;
    private static long[] iunn;
    private static int[] iunr;
    private static final int UNIFORM_SIZE = 224;
    private static GpuBuffer uniformBuffer;
    private static long[] iunm;
    public static final boolean c;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void shutdown() {
        boolean bl2;
        block69: {
            block68: {
                Object object = qm;
                block35: while (true) {
                    switch ((int)object) {
                        case -1390570950: {
                            object = ln.iuno("iuyo", iunl(int ), (int)85) - ln.iuno("iuyn", iunl(int ), (int)84);
                            continue block35;
                        }
                        case -231278864: {
                            break block35;
                        }
                    }
                    break;
                }
                boolean bl3 = c;
                Object object2 = qm;
                boolean bl4 = true;
                block36: while (true) {
                    CallSite callSite;
                    if (!bl4 || (bl4 = false) || !true) {
                        object2 = callSite - ln.iuno("iuyp", iunl(int ), (int)86);
                    }
                    switch ((int)object2) {
                        case -988843220: {
                            callSite = ln.iuno("iuyq", iunl(int ), (int)87);
                            continue block36;
                        }
                        case -231278864: {
                            break block36;
                        }
                        case 564153356: {
                            callSite = ln.iuno("iuyr", iunl(int ), (int)88);
                            continue block36;
                        }
                        case 1588033162: {
                            callSite = ln.iuno("iuys", iunl(int ), (int)89);
                            continue block36;
                        }
                    }
                    break;
                }
                int n2 = b;
                Object object3 = qm;
                block37: while (true) {
                    switch ((int)object3) {
                        case -231278864: {
                            break block37;
                        }
                        case -123381270: {
                            object3 = ln.iuno("iuyu", iunl(int ), (int)91) - ln.iuno("iuyt", iunl(int ), (int)90);
                            continue block37;
                        }
                    }
                    break;
                }
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                if (bl2 || bl2) return;
                while (true) {
                    long l2;
                    Object object4;
                    if ((object4 = (l2 = qm - ln.iuno("iuyv", iunl(int ), (int)92)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (object4 == ln.iuno("iuyw", iunq(int ), (int)196)) {
                        if (uniformBuffer != null) {
                            break;
                        }
                        break block68;
                    }
                    object4 = ln.iuno("iuyx", iunq(int ), (int)197);
                }
                if (bl2 || bl2) return;
                Object object5 = qm;
                boolean bl5 = true;
                block39: while (true) {
                    CallSite callSite;
                    if (!bl5 || (bl5 = false) || !true) {
                        object5 = callSite - ln.iuno("iuyy", iunl(int ), (int)93);
                    }
                    switch ((int)object5) {
                        case -823852677: {
                            callSite = ln.iuno("iuyz", iunl(int ), (int)94);
                            continue block39;
                        }
                        case -231278864: {
                            break block39;
                        }
                        case 1173784636: {
                            callSite = ln.iuno("iuza", iunl(int ), (int)95);
                            continue block39;
                        }
                    }
                    break;
                }
                Object object6 = qm;
                boolean bl6 = true;
                block40: while (true) {
                    CallSite callSite;
                    if (!bl6 || (bl6 = false) || !true) {
                        object6 = callSite - ln.iuno("iuzb", iunl(int ), (int)96);
                    }
                    switch ((int)object6) {
                        case -1928063617: {
                            callSite = ln.iuno("iuzc", iunl(int ), (int)97);
                            continue block40;
                        }
                        case -1634630171: {
                            callSite = ln.iuno("iuzd", iunl(int ), (int)98);
                            continue block40;
                        }
                        case -231278864: {
                            break block40;
                        }
                        case 1151546334: {
                            callSite = ln.iuno("iuze", iunl(int ), (int)99);
                            continue block40;
                        }
                    }
                    break;
                }
                uniformBuffer.close();
                if (bl2 || bl2) return;
                Object object7 = qm;
                block41: while (true) {
                    switch ((int)object7) {
                        case -1966709529: {
                            object7 = ln.iuno("iuzg", iunl(int ), (int)101) - ln.iuno("iuzf", iunl(int ), (int)100);
                            continue block41;
                        }
                        case -231278864: {
                            break block41;
                        }
                    }
                    break;
                }
                uniformBuffer = null;
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = qm - ln.iuno("iuzh", iunl(int ), (int)102)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object == ln.iuno("iuzi", iunq(int ), (int)198)) {
                    if (uniformData != null) {
                        break;
                    }
                    break block69;
                }
                object = ln.iuno("iuzj", iunq(int ), (int)199);
            }
            if (bl2 || bl2) return;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = qm - ln.iuno("iuzk", iunl(int ), (int)103)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object == ln.iuno("iuzl", iunq(int ), (int)200)) break;
                object = ln.iuno("iuzm", iunq(int ), (int)201);
            }
            while (true) {
                long l5;
                Object object;
                if ((object = (l5 = qm - ln.iuno("iuzn", iunl(int ), (int)104)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object == ln.iuno("iuzo", iunq(int ), (int)202)) {
                    MemoryUtil.memFree((Buffer)uniformData);
                    if (bl2) return;
                    break;
                }
                object = ln.iuno("iuzp", iunq(int ), (int)203);
            }
            if (bl2) return;
            Object object = qm;
            boolean bl7 = true;
            block45: while (true) {
                CallSite callSite;
                if (!bl7 || (bl7 = false) || !true) {
                    object = callSite - ln.iuno("iuzq", iunl(int ), (int)105);
                }
                switch ((int)object) {
                    case -440060311: {
                        callSite = ln.iuno("iuzr", iunl(int ), (int)106);
                        continue block45;
                    }
                    case -231278864: {
                        break block45;
                    }
                    case 248815131: {
                        callSite = ln.iuno("iuzs", iunl(int ), (int)107);
                        continue block45;
                    }
                    case 994696518: {
                        callSite = ln.iuno("iuzt", iunl(int ), (int)108);
                        continue block45;
                    }
                }
                break;
            }
            uniformData = null;
            if (bl2) return;
        }
        if (bl2 || bl2) return;
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = qm - ln.iuno("iuzu", iunl(int ), (int)109)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object == ln.iuno("iuzv", iunq(int ), (int)204)) {
                pipeline = null;
                if (bl2) return;
                break;
            }
            object = ln.iuno("iuzw", iunq(int ), (int)205);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void ivbt() {
        ln.iunr[0] = 437236363;
        ln.iunr[1] = 1303167268;
        ln.iunr[2] = 1298406319;
        ln.iunr[3] = 1926816568;
        ln.iunr[4] = 1744028937;
        ln.iunr[5] = -2037884796;
        ln.iunr[6] = 228602164;
        ln.iunr[7] = 929174721;
        ln.iunr[8] = 523896600;
        ln.iunr[9] = 548404182;
        ln.iunr[10] = 871076564;
        ln.iunr[11] = 1796814028;
        ln.iunr[12] = -2070822554;
        ln.iunr[13] = 363274881;
        ln.iunr[14] = -1546392747;
        ln.iunr[15] = -585931441;
        ln.iunr[16] = -7919459;
        ln.iunr[17] = 259840854;
        ln.iunr[18] = 492455842;
        ln.iunr[19] = 945001417;
        ln.iunr[20] = -1835192436;
        ln.iunr[21] = -867213738;
        ln.iunr[22] = 744589618;
        ln.iunr[23] = -535779715;
        ln.iunr[24] = 1782442347;
        ln.iunr[25] = 1337290107;
        ln.iunr[26] = 2063460589;
        ln.iunr[27] = -708692255;
        ln.iunr[28] = -2109800930;
        ln.iunr[29] = -509748421;
        ln.iunr[30] = -1325192273;
        ln.iunr[31] = 1066304391;
        ln.iunr[32] = -1810541990;
        ln.iunr[33] = -1332996534;
        ln.iunr[34] = -639143048;
        ln.iunr[35] = 966768440;
        ln.iunr[36] = 884405162;
        ln.iunr[37] = -1229364931;
        ln.iunr[38] = 449858590;
        ln.iunr[39] = 1275916647;
        ln.iunr[40] = -1493694186;
        ln.iunr[41] = 1368737387;
        ln.iunr[42] = -48030372;
        ln.iunr[43] = -1686412153;
        ln.iunr[44] = 263905544;
        ln.iunr[45] = -936380177;
        ln.iunr[46] = 811064243;
        ln.iunr[47] = 850545938;
        ln.iunr[48] = -1571168403;
        ln.iunr[49] = 214352583;
        ln.iunr[50] = -417077393;
        ln.iunr[51] = -911671122;
        ln.iunr[52] = 1261462456;
        ln.iunr[53] = 313667505;
        ln.iunr[54] = -1292076085;
        ln.iunr[55] = -1020203808;
        ln.iunr[56] = -1699620783;
        ln.iunr[57] = 1090885522;
        ln.iunr[58] = -669744360;
        ln.iunr[59] = -1396144284;
        ln.iunr[60] = 1328171104;
        ln.iunr[61] = 2062877871;
        ln.iunr[62] = 583266293;
        ln.iunr[63] = 82484346;
        ln.iunr[64] = 18914169;
        ln.iunr[65] = 1156334405;
        ln.iunr[66] = -1182352934;
        ln.iunr[67] = -912679322;
        ln.iunr[68] = -1907671292;
        ln.iunr[69] = 978934985;
        ln.iunr[70] = -912101310;
        ln.iunr[71] = -1162027156;
        ln.iunr[72] = 1824612941;
        ln.iunr[73] = -812842275;
        ln.iunr[74] = 1241292078;
        ln.iunr[75] = -991965485;
        ln.iunr[76] = 941622665;
        ln.iunr[77] = 1345826570;
        ln.iunr[78] = 26959436;
        ln.iunr[79] = -12473376;
        ln.iunr[80] = 1576764792;
        ln.iunr[81] = -969769888;
        ln.iunr[82] = -655557758;
        ln.iunr[83] = -31046290;
        ln.iunr[84] = 1936416572;
        ln.iunr[85] = -777062048;
        ln.iunr[86] = -2054529661;
        ln.iunr[87] = -968969817;
        ln.iunr[88] = 738679681;
        ln.iunr[89] = -606503553;
        ln.iunr[90] = 1391698311;
        ln.iunr[91] = 1779114593;
        ln.iunr[92] = 814373389;
        ln.iunr[93] = -1817329061;
        ln.iunr[94] = 386219892;
        ln.iunr[95] = -1534774722;
        ln.iunr[96] = -775919548;
        ln.iunr[97] = 2054538618;
        ln.iunr[98] = -371758026;
        ln.iunr[99] = -1619764420;
    }

    private static /* synthetic */ void ivbz() {
        ln.iunm[0] = -1596379805928841295L;
        ln.iunm[1] = -8990557049602437346L;
        ln.iunm[2] = 6710026810700144149L;
        ln.iunm[3] = 5939289188431609353L;
        ln.iunm[4] = -2908374357898022390L;
        ln.iunm[5] = 5758038161019548019L;
        ln.iunm[6] = -5815083020543978965L;
        ln.iunm[7] = -3909421271102477422L;
        ln.iunm[8] = -4903656477615363374L;
        ln.iunm[9] = -6145573835776527545L;
        ln.iunm[10] = -1891747644876282811L;
        ln.iunm[11] = 8188755271016860273L;
        ln.iunm[12] = -4749728189580858161L;
        ln.iunm[13] = 5682233434247208864L;
        ln.iunm[14] = 2411692234492462002L;
        ln.iunm[15] = 8031242439550807451L;
        ln.iunm[16] = -271621477426813552L;
        ln.iunm[17] = -441579496305296711L;
        ln.iunm[18] = 3399315113428926419L;
        ln.iunm[19] = 2869506873352370449L;
        ln.iunm[20] = 3264873642063901549L;
        ln.iunm[21] = -666264052461998229L;
        ln.iunm[22] = 4116551912825565938L;
        ln.iunm[23] = -2163281418686660560L;
        ln.iunm[24] = -7891504765868078108L;
        ln.iunm[25] = -988650800505105485L;
        ln.iunm[26] = 4051924903992039011L;
        ln.iunm[27] = 8181124804435243127L;
        ln.iunm[28] = -3739537683160509114L;
        ln.iunm[29] = -2606057858601965072L;
        ln.iunm[30] = -9011948864113834069L;
        ln.iunm[31] = -9082291977458528651L;
        ln.iunm[32] = 7831405085415800133L;
        ln.iunm[33] = 5664247054897454221L;
        ln.iunm[34] = -1318514255495542688L;
        ln.iunm[35] = 9214863586948513592L;
        ln.iunm[36] = -1613190535594399160L;
        ln.iunm[37] = 2222221820697906498L;
        ln.iunm[38] = 3341830026075301383L;
        ln.iunm[39] = 1705539023748787372L;
        ln.iunm[40] = 344706810837151857L;
        ln.iunm[41] = 5150118790694061321L;
        ln.iunm[42] = -3784030267995613577L;
        ln.iunm[43] = 4103721967937955754L;
        ln.iunm[44] = 8491036013662238541L;
        ln.iunm[45] = -3141439330296684046L;
        ln.iunm[46] = 3601581333851110522L;
        ln.iunm[47] = 6008046340058403564L;
        ln.iunm[48] = 5473153581415258380L;
        ln.iunm[49] = -3233489731758292168L;
        ln.iunm[50] = -6524041057643078313L;
        ln.iunm[51] = 7981638156331561873L;
        ln.iunm[52] = -3282633632292065272L;
        ln.iunm[53] = 1566765245023294630L;
        ln.iunm[54] = -8956853497945167718L;
        ln.iunm[55] = 6809349990831663013L;
        ln.iunm[56] = 5054943713007837033L;
        ln.iunm[57] = 8993662649736194599L;
        ln.iunm[58] = -354792214712896801L;
        ln.iunm[59] = 2805794180575488005L;
        ln.iunm[60] = 400015556470565909L;
        ln.iunm[61] = 6053572450938534211L;
        ln.iunm[62] = -3811882566809103663L;
        ln.iunm[63] = -6086263395773490411L;
        ln.iunm[64] = 8459672972802944602L;
        ln.iunm[65] = -7531868112723465189L;
        ln.iunm[66] = 1444820650179988085L;
        ln.iunm[67] = 9023245025885615198L;
        ln.iunm[68] = -3983184918790540557L;
        ln.iunm[69] = 5060594037900787548L;
        ln.iunm[70] = 8217663244966036404L;
        ln.iunm[71] = -8396372121099612403L;
        ln.iunm[72] = -228218579109445329L;
        ln.iunm[73] = -4146977015394775435L;
        ln.iunm[74] = -762250809938493569L;
        ln.iunm[75] = 116053477120387051L;
        ln.iunm[76] = 5654241227884729838L;
        ln.iunm[77] = -1831444468212198384L;
        ln.iunm[78] = -9011208896018656253L;
        ln.iunm[79] = 3882851711385237223L;
        ln.iunm[80] = 9143922629858259916L;
        ln.iunm[81] = 6044682183824215205L;
        ln.iunm[82] = 7705754874419528447L;
        ln.iunm[83] = -8108800071986909949L;
        ln.iunm[84] = 8031830695184005200L;
        ln.iunm[85] = -7900765713234412260L;
        ln.iunm[86] = 3777154039586651906L;
        ln.iunm[87] = -5671068217438103723L;
        ln.iunm[88] = 6250235801896105132L;
        ln.iunm[89] = -7307714192219021683L;
        ln.iunm[90] = -3642917031966510888L;
        ln.iunm[91] = -8690287545405942963L;
        ln.iunm[92] = 5156098441016775067L;
        ln.iunm[93] = -1958913048138751126L;
        ln.iunm[94] = -3669573436383289508L;
        ln.iunm[95] = 1199237042670811749L;
        ln.iunm[96] = 6861082128404127806L;
        ln.iunm[97] = -4981276965333448140L;
        ln.iunm[98] = 6574918284306956380L;
        ln.iunm[99] = -7248580103794266911L;
    }

    private static /* synthetic */ void ivbx() {
        ln.iuns[100] = 1084941990;
        ln.iuns[101] = -697879986;
        ln.iuns[102] = -1784628096;
        ln.iuns[103] = 1707371273;
        ln.iuns[104] = 404675192;
        ln.iuns[105] = -1638669329;
        ln.iuns[106] = -1353700638;
        ln.iuns[107] = 1431317093;
        ln.iuns[108] = 2077146329;
        ln.iuns[109] = -1918487610;
        ln.iuns[110] = 589431068;
        ln.iuns[111] = -1508865066;
        ln.iuns[112] = 1307728278;
        ln.iuns[113] = 1143612647;
        ln.iuns[114] = -1397337122;
        ln.iuns[115] = -524087217;
        ln.iuns[116] = 1154782257;
        ln.iuns[117] = 498117138;
        ln.iuns[118] = 392627633;
        ln.iuns[119] = -618643219;
        ln.iuns[120] = 1438131700;
        ln.iuns[121] = -894792651;
        ln.iuns[122] = 1560708390;
        ln.iuns[123] = -1645911275;
        ln.iuns[124] = -1476286136;
        ln.iuns[125] = -391334603;
        ln.iuns[126] = 1443871314;
        ln.iuns[127] = -142423335;
        ln.iuns[128] = 1403422278;
        ln.iuns[129] = 816308973;
        ln.iuns[130] = -236791943;
        ln.iuns[131] = -1888325729;
        ln.iuns[132] = -1513778034;
        ln.iuns[133] = -726006154;
        ln.iuns[134] = 254935304;
        ln.iuns[135] = 407938820;
        ln.iuns[136] = -1354267048;
        ln.iuns[137] = 1763693480;
        ln.iuns[138] = 2004615368;
        ln.iuns[139] = -334812675;
        ln.iuns[140] = -122523448;
        ln.iuns[141] = 120669409;
        ln.iuns[142] = 329414736;
        ln.iuns[143] = 2081998911;
        ln.iuns[144] = 1832715653;
        ln.iuns[145] = 381425412;
        ln.iuns[146] = -1098103108;
        ln.iuns[147] = -1041338911;
        ln.iuns[148] = -891072117;
        ln.iuns[149] = 1841004996;
        ln.iuns[150] = -1399056997;
        ln.iuns[151] = 1477205822;
        ln.iuns[152] = 520623424;
        ln.iuns[153] = -526602206;
        ln.iuns[154] = -288472787;
        ln.iuns[155] = -906795818;
        ln.iuns[156] = -1026364226;
        ln.iuns[157] = -815550067;
        ln.iuns[158] = -1484922993;
        ln.iuns[159] = 1369676975;
        ln.iuns[160] = -1010035912;
        ln.iuns[161] = 1906731183;
        ln.iuns[162] = 1946374377;
        ln.iuns[163] = 307281111;
        ln.iuns[164] = 370457858;
        ln.iuns[165] = 2011229677;
        ln.iuns[166] = -1311691783;
        ln.iuns[167] = -1712024148;
        ln.iuns[168] = -1467802443;
        ln.iuns[169] = -1591196504;
        ln.iuns[170] = -352598145;
        ln.iuns[171] = -275908970;
        ln.iuns[172] = 1296713875;
        ln.iuns[173] = 1836096801;
        ln.iuns[174] = 1777181739;
        ln.iuns[175] = -155545109;
        ln.iuns[176] = 1466478986;
        ln.iuns[177] = -1562436653;
        ln.iuns[178] = -1364095612;
        ln.iuns[179] = -492130706;
        ln.iuns[180] = -1831488542;
        ln.iuns[181] = -1323165697;
        ln.iuns[182] = -1250315338;
        ln.iuns[183] = 1358301677;
        ln.iuns[184] = 277824233;
        ln.iuns[185] = 1204053573;
        ln.iuns[186] = 1200574733;
        ln.iuns[187] = 1030299072;
        ln.iuns[188] = 2025428848;
        ln.iuns[189] = -1743025288;
        ln.iuns[190] = 1066884897;
        ln.iuns[191] = 1053320293;
        ln.iuns[192] = 387370087;
        ln.iuns[193] = 1534497605;
        ln.iuns[194] = 1507577134;
        ln.iuns[195] = 1811426807;
        ln.iuns[196] = -446068389;
        ln.iuns[197] = 1578432981;
        ln.iuns[198] = 1954026935;
        ln.iuns[199] = 1276799777;
    }

    private static /* synthetic */ float iuxe(int n2) {
        return Float.intBitsToFloat(iunr[n2] ^ iuns[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putRadii(ByteBuffer var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        v0 /* !! */  = ln.qm;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(ln.iuno("iuvu", iunl(int ), (int)55) - ln.iuno("iuvt", iunl(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -231278864: {
                    break block24;
                }
                case 1109871915: {
                    continue block24;
                }
            }
            break;
        }
        var7_5 = ln.c;
        v1 /* !! */  = ln.qm;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - ln.iuno("iuvv", iunl(int ), (int)56));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1861368045: {
                    v2 = ln.iuno("iuvw", iunl(int ), (int)57);
                    continue block25;
                }
                case -1787074198: {
                    v2 = ln.iuno("iuvx", iunl(int ), (int)58);
                    continue block25;
                }
                case -231278864: {
                    break block25;
                }
                case 1477705544: {
                    v2 = ln.iuno("iuvy", iunl(int ), (int)59);
                    continue block25;
                }
            }
            break;
        }
        var6_6 = ln.b;
        v3 /* !! */  = ln.qm;
        if (true) ** GOTO lbl32
        block26: while (true) {
            v3 /* !! */  = (long)(ln.iuno("iuwa", iunl(int ), (int)61) - ln.iuno("iuvz", iunl(int ), (int)60));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -231278864: {
                    break block26;
                }
                case 2050630758: {
                    continue block26;
                }
            }
            break;
        }
        var5_7 = ln.a;
        if (var7_5) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var5_7 || var5_7) ** GOTO lbl40
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ln.qm - ln.iuno("iuwb", iunl(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ln.iuno("iuwc", iunq(int ), (int)155)) break;
            v4 /* !! */  = (long)ln.iuno("iuwd", iunq(int ), (int)156);
        }
        v5 = var0.putFloat(var3_3);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ln.qm - ln.iuno("iuwe", iunl(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ln.iuno("iuwf", iunq(int ), (int)157)) break;
            v6 /* !! */  = (long)ln.iuno("iuwg", iunq(int ), (int)158);
        }
        v7 = v5.putFloat(var2_2);
        v8 /* !! */  = ln.qm;
        if (true) ** GOTO lbl59
        block30: while (true) {
            v8 /* !! */  = (long)(v9 - ln.iuno("iuwh", iunl(int ), (int)64));
lbl59:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -231278864: {
                    break block30;
                }
                case 696643895: {
                    v9 = ln.iuno("iuwi", iunl(int ), (int)65);
                    continue block30;
                }
                case 1430146316: {
                    v9 = ln.iuno("iuwj", iunl(int ), (int)66);
                    continue block30;
                }
            }
            break;
        }
        v10 = v7.putFloat(var4_4);
        v11 /* !! */  = ln.qm;
        if (true) ** GOTO lbl73
        block31: while (true) {
            v11 /* !! */  = (long)(v12 - ln.iuno("iuwk", iunl(int ), (int)67));
lbl73:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1439158658: {
                    v12 = ln.iuno("iuwl", iunl(int ), (int)68);
                    continue block31;
                }
                case -231278864: {
                    break block31;
                }
                case 687964790: {
                    v12 = ln.iuno("iuwm", iunl(int ), (int)69);
                    continue block31;
                }
            }
            break;
        }
        v10.putFloat(var1_1);
        ** while (var5_7 || var5_7)
lbl85:
        // 1 sources

    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void putColor(ByteBuffer var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ln.qm - ln.iuno("iuwt", iunl(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ln.iuno("iuwu", iunq(int ), (int)165)) break;
            v0 /* !! */  = (long)ln.iuno("iuwv", iunq(int ), (int)166);
        }
        var4_2 = ln.c;
        while (true) {
            block56: {
                if ((v1 /* !! */  = (cfr_temp_2 = ln.qm - ln.iuno("iuww", iunl(int ), (int)71)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != ln.iuno("iuwx", iunq(int ), (int)167)) break block56;
                var3_3 /* !! */  = ln.b;
                v2 /* !! */  = ln.qm;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)ln.iuno("iuwy", iunq(int ), (int)168);
        }
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - ln.iuno("iuwz", iunl(int ), (int)72));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -231278864: {
                    break block32;
                }
                case 1372525898: {
                    v3 = ln.iuno("iuxa", iunl(int ), (int)73);
                    continue block32;
                }
                case 1553235578: {
                    v3 = ln.iuno("iuxb", iunl(int ), (int)74);
                    continue block32;
                }
            }
            break;
        }
        var2_4 = ln.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block33: while (true) {
            block57: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4) return;
                        v4 = (float)(var1_1 >> ln.iuno("iuxc", iunq(int ), (int)169) & ln.iuno("iuxd", iunq(int ), (int)170)) / ln.iuno("iuxf", iuxe(int ), (int)171);
                        v5 /* !! */  = ln.qm;
                        block34: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1440749182: {
                                    v6 = ln.iuno("iuxh", iunl(int ), (int)76);
                                    ** GOTO lbl51
                                }
                                case -231278864: {
                                    break block34;
                                }
                                case -44460881: {
                                    v6 = ln.iuno("iuxi", iunl(int ), (int)77);
                                    ** GOTO lbl51
                                }
                                case 726864673: {
                                    v6 = ln.iuno("iuxj", iunl(int ), (int)78);
lbl51:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - ln.iuno("iuxg", iunl(int ), (int)75));
                                    continue block34;
                                }
                            }
                            break;
                        }
                        var0.putFloat(v4);
                        if (var2_4 || var2_4) return;
                        v7 = (float)(var1_1 >> ln.iuno("iuxk", iunq(int ), (int)172) & ln.iuno("iuxl", iunq(int ), (int)173)) / ln.iuno("iuxm", iuxe(int ), (int)174);
                        v8 /* !! */  = ln.qm;
                        block35: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -1186143512: {
                                    v9 = ln.iuno("iuxo", iunl(int ), (int)80);
                                    ** GOTO lbl67
                                }
                                case -231278864: {
                                    break block35;
                                }
                                case 595021462: {
                                    v9 = ln.iuno("iuxp", iunl(int ), (int)81);
lbl67:
                                    // 2 sources

                                    v8 /* !! */  = (long)(v9 - ln.iuno("iuxn", iunl(int ), (int)79));
                                    continue block35;
                                }
                            }
                            break;
                        }
                        var0.putFloat(v7);
                        if (var2_4 || var2_4) return;
                        v10 = (float)(var1_1 & ln.iuno("iuxq", iunq(int ), (int)175)) / ln.iuno("iuxr", iuxe(int ), (int)176);
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_3 = ln.qm - ln.iuno("iuxs", iunl(int ), (int)82)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  == ln.iuno("iuxt", iunq(int ), (int)177)) {
                                var0.putFloat(v10);
                                if (var2_4) return;
                                break;
                            }
                            v11 /* !! */  = (long)ln.iuno("iuxu", iunq(int ), (int)178);
                        }
                        if (var2_4) return;
                        v12 = (float)(var1_1 >>> ln.iuno("iuxv", iunq(int ), (int)179) & ln.iuno("iuxw", iunq(int ), (int)180)) / ln.iuno("iuxx", iuxe(int ), (int)181);
                        while (true) {
                            if ((v13 /* !! */  = (cfr_temp_4 = ln.qm - ln.iuno("iuxy", iunl(int ), (int)83)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v13 /* !! */  == ln.iuno("iuxz", iunq(int ), (int)182)) {
                                var0.putFloat(v12);
                                if (var2_4) return;
                                break;
                            }
                            v13 /* !! */  = (long)ln.iuno("iuya", iunq(int ), (int)183);
                        }
                        if (!var2_4) return;
                        return;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyb", iunq(int ), (int)184);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block57;
                    }
                    case 2: {
                        do {
                            var3_3 /* !! */  = (int)ln.iuno("iuyd", iunq(int ), (int)186);
                        } while (!var4_2);
                        throw null;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ln.iuno("iuye", iunq(int ), (int)187);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 4: {
                        ** GOTO lbl122
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyj", iunq(int ), (int)192);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyi", iunq(int ), (int)191);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)ln.iuno("iuym", iunq(int ), (int)195);
                        if (var4_2) {
                            throw null;
                        }
lbl122:
                        // 3 sources

                        var3_3 /* !! */  = (int)ln.iuno("iuyf", iunq(int ), (int)188);
                        cfr_temp_0 = 9;
                        if (var4_2) {
                            throw null;
                        }
                        break block57;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyc", iunq(int ), (int)185);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyl", iunq(int ), (int)194);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyh", iunq(int ), (int)190);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)ln.iuno("iuyk", iunq(int ), (int)193);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl148
            }
            do {
                if (true) continue block33;
lbl148:
                // 2 sources

                var3_3 /* !! */  = (int)ln.iuno("iuyg", iunq(int ), (int)189);
                cfr_temp_0 = 1;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, int var6_6, int var7_7, int var8_8, float var9_9, float var10_10, float var11_11, float var12_12, float var13_13) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[SWITCH]
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

    private static /* synthetic */ int iunq(int n2) {
        return iunr[n2] ^ iuns[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ln.qm - ln.iuno("ivbe", iunl(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ln.iuno("ivbf", iunq(int ), (int)236)) break;
            v0 /* !! */  = (long)ln.iuno("ivbg", iunq(int ), (int)237);
        }
        var2 = ln.c;
        v1 /* !! */  = ln.qm;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - ln.iuno("ivbh", iunl(int ), (int)114));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1458517185: {
                    v2 = ln.iuno("ivbi", iunl(int ), (int)115);
                    continue block19;
                }
                case -268738461: {
                    v2 = ln.iuno("ivbj", iunl(int ), (int)116);
                    continue block19;
                }
                case -231278864: {
                    break block19;
                }
                case 2007730806: {
                    v2 = ln.iuno("ivbk", iunl(int ), (int)117);
                    continue block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = ln.b;
        v3 /* !! */  = ln.qm;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - ln.iuno("ivbl", iunl(int ), (int)118));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -231278864: {
                    break block20;
                }
                case -221700971: {
                    v4 = ln.iuno("ivbm", iunl(int ), (int)119);
                    continue block20;
                }
                case 158933241: {
                    v4 = ln.iuno("ivbn", iunl(int ), (int)120);
                    continue block20;
                }
                case 684982499: {
                    v4 = ln.iuno("ivbo", iunl(int ), (int)121);
                    continue block20;
                }
            }
            break;
        }
        var0_2 = ln.a;
        if (var2) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl44
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "ThemeWave2D Uniforms";
            }
            case 0: {
                var1_1 /* !! */  = (int)ln.iuno("ivbp", iunq(int ), (int)238);
                if (!var2) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ln.iuno("ivbq", iunq(int ), (int)239);
                    if (!var2) break block12;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ln.iuno("ivbr", iunq(int ), (int)240);
                if (!var2) ** GOTO lbl56
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ln.iuno("ivbs", iunq(int ), (int)241);
        ** while (!var2)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ivbw() {
        ln.iuns[0] = -437236364;
        ln.iuns[1] = 1282567199;
        ln.iuns[2] = -1298406320;
        ln.iuns[3] = 1916855533;
        ln.iuns[4] = -1744028938;
        ln.iuns[5] = -385215148;
        ln.iuns[6] = -228602165;
        ln.iuns[7] = -1283694343;
        ln.iuns[8] = 523896601;
        ln.iuns[9] = 1816308338;
        ln.iuns[10] = -871076565;
        ln.iuns[11] = 1427346510;
        ln.iuns[12] = 2070822553;
        ln.iuns[13] = 971907239;
        ln.iuns[14] = -1546392748;
        ln.iuns[15] = -2110181505;
        ln.iuns[16] = -7919460;
        ln.iuns[17] = -1044874073;
        ln.iuns[18] = -492455843;
        ln.iuns[19] = -1849890393;
        ln.iuns[20] = 1835192435;
        ln.iuns[21] = -480346329;
        ln.iuns[22] = -744589619;
        ln.iuns[23] = 2065304664;
        ln.iuns[24] = -1782442348;
        ln.iuns[25] = -1801918358;
        ln.iuns[26] = -2063460590;
        ln.iuns[27] = 585570449;
        ln.iuns[28] = -2109800930;
        ln.iuns[29] = 509748420;
        ln.iuns[30] = -2119265684;
        ln.iuns[31] = -1066304392;
        ln.iuns[32] = 950540143;
        ln.iuns[33] = -1332996414;
        ln.iuns[34] = -639143047;
        ln.iuns[35] = 1536744070;
        ln.iuns[36] = 884405066;
        ln.iuns[37] = 1229364930;
        ln.iuns[38] = -261226586;
        ln.iuns[39] = 1275916640;
        ln.iuns[40] = -1493694189;
        ln.iuns[41] = 1368737383;
        ln.iuns[42] = -48030374;
        ln.iuns[43] = -1686412148;
        ln.iuns[44] = 263905542;
        ln.iuns[45] = -936380161;
        ln.iuns[46] = 811064254;
        ln.iuns[47] = 850545940;
        ln.iuns[48] = -1571168415;
        ln.iuns[49] = 214352590;
        ln.iuns[50] = -417077403;
        ln.iuns[51] = -911671126;
        ln.iuns[52] = 1261462451;
        ln.iuns[53] = 313667505;
        ln.iuns[54] = -1292076093;
        ln.iuns[55] = -1020203805;
        ln.iuns[56] = -1699620847;
        ln.iuns[57] = 1090885490;
        ln.iuns[58] = -669744360;
        ln.iuns[59] = -1396144286;
        ln.iuns[60] = 1328171122;
        ln.iuns[61] = 2062877841;
        ln.iuns[62] = 583266273;
        ln.iuns[63] = 82484277;
        ln.iuns[64] = 18914106;
        ln.iuns[65] = 1156334407;
        ln.iuns[66] = -1182353008;
        ln.iuns[67] = -912679298;
        ln.iuns[68] = -1907671276;
        ln.iuns[69] = 978934983;
        ln.iuns[70] = -912101250;
        ln.iuns[71] = -1162027179;
        ln.iuns[72] = 1824612868;
        ln.iuns[73] = -812842298;
        ln.iuns[74] = 1241292064;
        ln.iuns[75] = -991965459;
        ln.iuns[76] = 941622715;
        ln.iuns[77] = 1345826621;
        ln.iuns[78] = 26959481;
        ln.iuns[79] = -12473355;
        ln.iuns[80] = 1576764717;
        ln.iuns[81] = -969769875;
        ln.iuns[82] = -655557681;
        ln.iuns[83] = -31046336;
        ln.iuns[84] = 1936416609;
        ln.iuns[85] = -777062109;
        ln.iuns[86] = -2054529631;
        ln.iuns[87] = -968969817;
        ln.iuns[88] = 738679687;
        ln.iuns[89] = -606503619;
        ln.iuns[90] = 1391698391;
        ln.iuns[91] = 1779114542;
        ln.iuns[92] = 814373455;
        ln.iuns[93] = -1817329044;
        ln.iuns[94] = 386219835;
        ln.iuns[95] = -1534774683;
        ln.iuns[96] = -775919497;
        ln.iuns[97] = 2054538554;
        ln.iuns[98] = -371758041;
        ln.iuns[99] = -1619764464;
    }

    private static /* synthetic */ void ivcd() {
        ln.iunm[100] = 66154572929781666L;
        ln.iunm[101] = 8635952084266152329L;
        ln.iunm[102] = 1015124998248886283L;
        ln.iunm[103] = -4909197677546080013L;
        ln.iunm[104] = 5637096759128772667L;
        ln.iunm[105] = -7389841017741758047L;
        ln.iunm[106] = 6195921271622648256L;
        ln.iunm[107] = 8597001262056070199L;
        ln.iunm[108] = 7563404422642070280L;
        ln.iunm[109] = 1955060060024979865L;
        ln.iunm[110] = 4202560999025497575L;
        ln.iunm[111] = -2845163500567731495L;
        ln.iunm[112] = 6111281653123814514L;
        ln.iunm[113] = -6975959102188191456L;
        ln.iunm[114] = 444637015541207833L;
        ln.iunm[115] = -3185050069449637918L;
        ln.iunm[116] = -8179625320292482432L;
        ln.iunm[117] = 574364275452887600L;
        ln.iunm[118] = 5870187747107467602L;
        ln.iunm[119] = -2030473173582821657L;
        ln.iunm[120] = 6512656332969970040L;
        ln.iunm[121] = 5672040691560453788L;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 40[SWITCH]
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

    private ln() {
    }

    public static /* synthetic */ CallSite iuno(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ivbv() {
        ln.iunr[200] = -675563741;
        ln.iunr[201] = 329754954;
        ln.iunr[202] = 208039497;
        ln.iunr[203] = 118855943;
        ln.iunr[204] = 177665328;
        ln.iunr[205] = 2047260723;
        ln.iunr[206] = -224845816;
        ln.iunr[207] = -1253975304;
        ln.iunr[208] = 2128703435;
        ln.iunr[209] = 1982906246;
        ln.iunr[210] = -1329824936;
        ln.iunr[211] = -4551545;
        ln.iunr[212] = -178932776;
        ln.iunr[213] = 408273478;
        ln.iunr[214] = 8045574;
        ln.iunr[215] = 1325320802;
        ln.iunr[216] = 1443428387;
        ln.iunr[217] = 1534705572;
        ln.iunr[218] = 339951575;
        ln.iunr[219] = -1894416413;
        ln.iunr[220] = 1199309863;
        ln.iunr[221] = -1916712139;
        ln.iunr[222] = 2118275110;
        ln.iunr[223] = 937166754;
        ln.iunr[224] = 646677956;
        ln.iunr[225] = 1291297220;
        ln.iunr[226] = -781691844;
        ln.iunr[227] = -1450581338;
        ln.iunr[228] = 16115172;
        ln.iunr[229] = -85689821;
        ln.iunr[230] = 1849592657;
        ln.iunr[231] = -994689008;
        ln.iunr[232] = 2085242809;
        ln.iunr[233] = 1976098341;
        ln.iunr[234] = -1522289930;
        ln.iunr[235] = 1956980053;
        ln.iunr[236] = -1227830651;
        ln.iunr[237] = -422553648;
        ln.iunr[238] = 1556485143;
        ln.iunr[239] = 2145148223;
        ln.iunr[240] = -1539907358;
        ln.iunr[241] = -769025012;
    }

    private static /* synthetic */ void ivcf() {
        ln.iunn[0] = -8345470172625911327L;
        ln.iunn[1] = 6764284091296407494L;
        ln.iunn[2] = -1953874412252145818L;
        ln.iunn[3] = 1379590456864607667L;
        ln.iunn[4] = -6217127130212105633L;
        ln.iunn[5] = 3266181776907621481L;
        ln.iunn[6] = -5570047771629213782L;
        ln.iunn[7] = 7865172140418145372L;
        ln.iunn[8] = -4161028843419103965L;
        ln.iunn[9] = -683366123240350392L;
        ln.iunn[10] = 3121034356574364993L;
        ln.iunn[11] = -9081939441311846625L;
        ln.iunn[12] = 4951978013020929128L;
        ln.iunn[13] = -2633682216574753581L;
        ln.iunn[14] = -6143298326955100284L;
        ln.iunn[15] = -1342127871254422193L;
        ln.iunn[16] = 5620597932617018186L;
        ln.iunn[17] = -6454467213496973266L;
        ln.iunn[18] = -3037496223466145489L;
        ln.iunn[19] = 1241331710778728259L;
        ln.iunn[20] = -8879580609977418383L;
        ln.iunn[21] = 872355499852658L;
        ln.iunn[22] = -6066216288241949873L;
        ln.iunn[23] = -7431215735965711020L;
        ln.iunn[24] = -6889907689057304123L;
        ln.iunn[25] = 208293334784785393L;
        ln.iunn[26] = 3537513567339773974L;
        ln.iunn[27] = 8571788607437374241L;
        ln.iunn[28] = 5118844669462194403L;
        ln.iunn[29] = 5393732491733781233L;
        ln.iunn[30] = 8810810202280022591L;
        ln.iunn[31] = -2377716559569446859L;
        ln.iunn[32] = 6235339240642626817L;
        ln.iunn[33] = 3527075947169582795L;
        ln.iunn[34] = -384870712175998974L;
        ln.iunn[35] = 7064226156994315945L;
        ln.iunn[36] = 2649211683668242029L;
        ln.iunn[37] = 4375100277901123011L;
        ln.iunn[38] = -2952614769813157165L;
        ln.iunn[39] = -249189480596095506L;
        ln.iunn[40] = 6334287806767907154L;
        ln.iunn[41] = -7518352069136101443L;
        ln.iunn[42] = 5405807226670261607L;
        ln.iunn[43] = -2828159159650273200L;
        ln.iunn[44] = 8491036013662238637L;
        ln.iunn[45] = 1838404649845236034L;
        ln.iunn[46] = 312478727449432690L;
        ln.iunn[47] = 4513647448364880410L;
        ln.iunn[48] = -8185624740975447284L;
        ln.iunn[49] = 100003605001089450L;
        ln.iunn[50] = -6184463341409726053L;
        ln.iunn[51] = 969615642723222154L;
        ln.iunn[52] = -5681924376176134032L;
        ln.iunn[53] = 3998678148697208155L;
        ln.iunn[54] = 6073331835403438533L;
        ln.iunn[55] = 5923285967398014925L;
        ln.iunn[56] = -95926781236893809L;
        ln.iunn[57] = 4214587665008913580L;
        ln.iunn[58] = 6304470152765588021L;
        ln.iunn[59] = 2487247609357113791L;
        ln.iunn[60] = 3563061769290288522L;
        ln.iunn[61] = -1547197875131347718L;
        ln.iunn[62] = -4896076089417015314L;
        ln.iunn[63] = 7300511710419928545L;
        ln.iunn[64] = 5329462579422214872L;
        ln.iunn[65] = 8470430333302285065L;
        ln.iunn[66] = 4025854274520488788L;
        ln.iunn[67] = 7592322178133073428L;
        ln.iunn[68] = -1678136950744439761L;
        ln.iunn[69] = 7035324861412631126L;
        ln.iunn[70] = 6524435777047352909L;
        ln.iunn[71] = 6562617597763809696L;
        ln.iunn[72] = -1216576710607963380L;
        ln.iunn[73] = -7013027333054698606L;
        ln.iunn[74] = -1163240113723482752L;
        ln.iunn[75] = 5702040506995429152L;
        ln.iunn[76] = -1661759996675393028L;
        ln.iunn[77] = -728290099722260288L;
        ln.iunn[78] = 2408569198267097587L;
        ln.iunn[79] = -154223758189896360L;
        ln.iunn[80] = -6046612950727678371L;
        ln.iunn[81] = -1182164678230279590L;
        ln.iunn[82] = -8011666190519859999L;
        ln.iunn[83] = 7259058782556024574L;
        ln.iunn[84] = 6398991985313639118L;
        ln.iunn[85] = 5549594864469747300L;
        ln.iunn[86] = -3499732662952009995L;
        ln.iunn[87] = -3770571106255628208L;
        ln.iunn[88] = 5146631579533341658L;
        ln.iunn[89] = -4574583105984103879L;
        ln.iunn[90] = 7929691895122276513L;
        ln.iunn[91] = -4022950412571629093L;
        ln.iunn[92] = -1282524702827650184L;
        ln.iunn[93] = 1571699630738350551L;
        ln.iunn[94] = -3412777495699458677L;
        ln.iunn[95] = -6505355883998508791L;
        ln.iunn[96] = 5628188463765159758L;
        ln.iunn[97] = 3578478264281334508L;
        ln.iunn[98] = 6226489047540542650L;
        ln.iunn[99] = -3597947787236109580L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$draw$1() {
        block16: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ln.qm - ln.iuno("ivar", iunl(int ), (int)110)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ln.iuno("ivas", iunq(int ), (int)226)) break;
                v0 /* !! */  = (long)ln.iuno("ivat", iunq(int ), (int)227);
            }
            var2 = ln.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = ln.qm - ln.iuno("ivau", iunl(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ln.iuno("ivav", iunq(int ), (int)228)) break;
                v1 /* !! */  = (long)ln.iuno("ivaw", iunq(int ), (int)229);
            }
            var1_1 /* !! */  = ln.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = ln.qm - ln.iuno("ivax", iunl(int ), (int)112)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ln.iuno("ivay", iunq(int ), (int)230)) {
                    var0_2 = ln.a;
                    if (var2) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)ln.iuno("ivaz", iunq(int ), (int)231);
            }
            if (var0_2) return null;
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block9: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var0_2) return "ThemeWave2D";
                        return null;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)ln.iuno("ivbc", iunq(int ), (int)234);
                        if (!var2) ** break;
                        throw null;
                    }
                    case 3: {
                        break block16;
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)ln.iuno("ivba", iunq(int ), (int)232);
                        cfr_temp_0 = 1;
                        if (!var2) continue block9;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)ln.iuno("ivbb", iunq(int ), (int)233);
            if (!var2) ** break;
            throw null;
        }
        var1_1 /* !! */  = (int)ln.iuno("ivbd", iunq(int ), (int)235);
        ** while (!var2)
lbl52:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ivcj() {
        ln.iunn[100] = -766782455646878369L;
        ln.iunn[101] = -1478185225100431499L;
        ln.iunn[102] = -1432765289048701021L;
        ln.iunn[103] = -1782418470830204953L;
        ln.iunn[104] = 8632463469066239463L;
        ln.iunn[105] = -6191260275151121306L;
        ln.iunn[106] = -5283892643185017706L;
        ln.iunn[107] = -5283482140568547575L;
        ln.iunn[108] = -7677025983857495432L;
        ln.iunn[109] = -5021626228912915837L;
        ln.iunn[110] = 7839732917327625640L;
        ln.iunn[111] = -3591498866549979455L;
        ln.iunn[112] = -1762471875111111925L;
        ln.iunn[113] = -4586155199147331098L;
        ln.iunn[114] = -7860968683770958026L;
        ln.iunn[115] = -8711992127911495878L;
        ln.iunn[116] = -5826396651910700743L;
        ln.iunn[117] = 900109921144624182L;
        ln.iunn[118] = -2246898507978465615L;
        ln.iunn[119] = -4607147508996188858L;
        ln.iunn[120] = -3791157412333847132L;
        ln.iunn[121] = -5474296569016733512L;
    }

    private static /* synthetic */ long iunl(int n2) {
        return iunm[n2] ^ iunn[n2];
    }

    private static /* synthetic */ void ivbu() {
        ln.iunr[100] = 1084941967;
        ln.iunr[101] = -697879963;
        ln.iunr[102] = -1784628030;
        ln.iunr[103] = 1707371328;
        ln.iunr[104] = 404675192;
        ln.iunr[105] = -1638669386;
        ln.iunr[106] = -1353700646;
        ln.iunr[107] = 1431317034;
        ln.iunr[108] = 2077146310;
        ln.iunr[109] = -1918487577;
        ln.iunr[110] = 589431121;
        ln.iunr[111] = -1508865031;
        ln.iunr[112] = 1307728347;
        ln.iunr[113] = 1143612653;
        ln.iunr[114] = -1397337192;
        ln.iunr[115] = -524087181;
        ln.iunr[116] = 1154782328;
        ln.iunr[117] = 498117210;
        ln.iunr[118] = 392627601;
        ln.iunr[119] = -618643223;
        ln.iunr[120] = 1438131694;
        ln.iunr[121] = -894792586;
        ln.iunr[122] = 1560708356;
        ln.iunr[123] = -1645911272;
        ln.iunr[124] = -1476286128;
        ln.iunr[125] = -391334649;
        ln.iunr[126] = 1443871310;
        ln.iunr[127] = -142423407;
        ln.iunr[128] = 1403422275;
        ln.iunr[129] = 816308979;
        ln.iunr[130] = -236791952;
        ln.iunr[131] = -1888325743;
        ln.iunr[132] = -1513778016;
        ln.iunr[133] = -726006157;
        ln.iunr[134] = 254935356;
        ln.iunr[135] = 407938875;
        ln.iunr[136] = -1354267035;
        ln.iunr[137] = 1763693472;
        ln.iunr[138] = 2004615405;
        ln.iunr[139] = -334812734;
        ln.iunr[140] = -122523400;
        ln.iunr[141] = 120669382;
        ln.iunr[142] = 329414748;
        ln.iunr[143] = 2081998951;
        ln.iunr[144] = 1832715673;
        ln.iunr[145] = 381425469;
        ln.iunr[146] = -1098103106;
        ln.iunr[147] = -1041338953;
        ln.iunr[148] = -891072125;
        ln.iunr[149] = 1841005042;
        ln.iunr[150] = -1399056987;
        ln.iunr[151] = 1477205785;
        ln.iunr[152] = 520623476;
        ln.iunr[153] = -526602118;
        ln.iunr[154] = -288472818;
        ln.iunr[155] = 906795817;
        ln.iunr[156] = 1041365266;
        ln.iunr[157] = -815550068;
        ln.iunr[158] = 664876654;
        ln.iunr[159] = 1369676970;
        ln.iunr[160] = -1010035911;
        ln.iunr[161] = 1906731183;
        ln.iunr[162] = 1946374379;
        ln.iunr[163] = 307281107;
        ln.iunr[164] = 370457862;
        ln.iunr[165] = -2011229678;
        ln.iunr[166] = 2094270478;
        ln.iunr[167] = -1712024147;
        ln.iunr[168] = 543151219;
        ln.iunr[169] = -1591196488;
        ln.iunr[170] = -352598144;
        ln.iunr[171] = -1393363306;
        ln.iunr[172] = 1296713883;
        ln.iunr[173] = 1836096990;
        ln.iunr[174] = 714253355;
        ln.iunr[175] = -155545324;
        ln.iunr[176] = 337097098;
        ln.iunr[177] = 1562436652;
        ln.iunr[178] = 1321577161;
        ln.iunr[179] = -492130698;
        ln.iunr[180] = -1831488739;
        ln.iunr[181] = -228780033;
        ln.iunr[182] = 1250315337;
        ln.iunr[183] = -1821013354;
        ln.iunr[184] = 277824232;
        ln.iunr[185] = 1204053570;
        ln.iunr[186] = 1200574730;
        ln.iunr[187] = 1030299077;
        ln.iunr[188] = 2025428856;
        ln.iunr[189] = -1743025281;
        ln.iunr[190] = 1066884906;
        ln.iunr[191] = 1053320290;
        ln.iunr[192] = 387370080;
        ln.iunr[193] = 1534497607;
        ln.iunr[194] = 1507577127;
        ln.iunr[195] = 1811426800;
        ln.iunr[196] = -446068390;
        ln.iunr[197] = -1150364957;
        ln.iunr[198] = -1954026936;
        ln.iunr[199] = 1738034948;
    }

    static {
        iunr = new int[242];
        iuns = new int[242];
        ln.ivbt();
        ln.ivbu();
        ln.ivbv();
        ln.ivbw();
        ln.ivbx();
        ln.ivby();
        iunm = new long[122];
        iunn = new long[122];
        ln.ivbz();
        ln.ivcd();
        ln.ivcf();
        ln.ivcj();
    }

    private static /* synthetic */ void ivby() {
        ln.iuns[200] = 675563740;
        ln.iuns[201] = 1911255758;
        ln.iuns[202] = -208039498;
        ln.iuns[203] = 1482007420;
        ln.iuns[204] = 177665329;
        ln.iuns[205] = -1142594255;
        ln.iuns[206] = -224845800;
        ln.iuns[207] = -1253975310;
        ln.iuns[208] = 2128703436;
        ln.iuns[209] = 1982906249;
        ln.iuns[210] = -1329824929;
        ln.iuns[211] = -4551544;
        ln.iuns[212] = -178932779;
        ln.iuns[213] = 408273477;
        ln.iuns[214] = 8045578;
        ln.iuns[215] = 1325320813;
        ln.iuns[216] = 1443428386;
        ln.iuns[217] = 1534705577;
        ln.iuns[218] = 339951581;
        ln.iuns[219] = -1894416412;
        ln.iuns[220] = 1199309876;
        ln.iuns[221] = -1916712131;
        ln.iuns[222] = 2118275116;
        ln.iuns[223] = 937166764;
        ln.iuns[224] = 646677964;
        ln.iuns[225] = 1291297236;
        ln.iuns[226] = 781691843;
        ln.iuns[227] = -940175927;
        ln.iuns[228] = -16115173;
        ln.iuns[229] = 1281805195;
        ln.iuns[230] = 1849592656;
        ln.iuns[231] = -1506594212;
        ln.iuns[232] = 2085242809;
        ln.iuns[233] = 1976098342;
        ln.iuns[234] = -1522289932;
        ln.iuns[235] = 1956980053;
        ln.iuns[236] = 1227830650;
        ln.iuns[237] = -2092953427;
        ln.iuns[238] = 1556485142;
        ln.iuns[239] = 2145148220;
        ln.iuns[240] = -1539907358;
        ln.iuns[241] = -769025012;
    }
}

