/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import ruhack.phobia.ir$1;
import ruhack.phobia.it$Stage;

public class ir {
    private static long[] ewv;
    private class_243 smoothedVelocity;
    public static final boolean a;
    private static int[] exa;
    private static long[] ewu;
    private static int[] ewz;
    public static final long z = -2931379892590622558L;
    private int sampleCount;
    private long lastUpdateTime;
    private class_243 velocity;
    private static final double SMOOTHING = 0.6;
    private static final class_310 mc;
    public static final boolean c;
    public static final int b;
    private class_243 lastPosition;
    private static final int MIN_SAMPLES = 2;

    private static /* synthetic */ int ewy(int n2) {
        return ewz[n2] ^ exa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getVelocity() {
        v0 /* !! */  = ir.z;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - ir.eww("ffk", ewt(int ), (int)61));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -798373726: {
                    break block22;
                }
                case -724002449: {
                    v1 = ir.eww("ffl", ewt(int ), (int)62);
                    continue block22;
                }
                case 412267789: {
                    v1 = ir.eww("ffm", ewt(int ), (int)63);
                    continue block22;
                }
                case 656044645: {
                    v1 = ir.eww("ffn", ewt(int ), (int)64);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = ir.c;
        v2 /* !! */  = ir.z;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - ir.eww("ffo", ewt(int ), (int)65));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1494654738: {
                    v3 = ir.eww("ffp", ewt(int ), (int)66);
                    continue block23;
                }
                case -798373726: {
                    break block23;
                }
                case -777103590: {
                    v3 = ir.eww("ffq", ewt(int ), (int)67);
                    continue block23;
                }
                case 633726420: {
                    v3 = ir.eww("ffr", ewt(int ), (int)68);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = ir.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ir.z - ir.eww("ffs", ewt(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ir.eww("fft", ewy(int ), (int)156)) break;
            v4 /* !! */  = (long)ir.eww("ffu", ewy(int ), (int)157);
        }
        var1_3 = ir.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block25;
                v5 /* !! */  = ir.z;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v5 /* !! */  = (long)(ir.eww("ffw", ewt(int ), (int)71) - ir.eww("ffv", ewt(int ), (int)70));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -798373726: {
                            break block26;
                        }
                        case 744924734: {
                            continue block26;
                        }
                    }
                    break;
                }
                return this.velocity;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ir.eww("ffx", ewy(int ), (int)158);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl64:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)ir.eww("ffy", ewy(int ), (int)159);
                    if (!var3_1) break block25;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)ir.eww("ffz", ewy(int ), (int)160);
                    if (!var3_1) ** GOTO lbl64
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ir.eww("fga", ewy(int ), (int)161);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fic() {
        ir.exa[100] = -1268862400;
        ir.exa[101] = 2073667399;
        ir.exa[102] = 2030861910;
        ir.exa[103] = 195365429;
        ir.exa[104] = -382124169;
        ir.exa[105] = -2036461466;
        ir.exa[106] = 1911397702;
        ir.exa[107] = -1351482490;
        ir.exa[108] = -1552728776;
        ir.exa[109] = -75290282;
        ir.exa[110] = 1254898189;
        ir.exa[111] = -1072384760;
        ir.exa[112] = 376669812;
        ir.exa[113] = -2141901893;
        ir.exa[114] = -1160512364;
        ir.exa[115] = -1143994373;
        ir.exa[116] = -1395904210;
        ir.exa[117] = 1710369450;
        ir.exa[118] = -1770991772;
        ir.exa[119] = -1294202146;
        ir.exa[120] = -1511688090;
        ir.exa[121] = 1058832869;
        ir.exa[122] = 1066574154;
        ir.exa[123] = -1544200373;
        ir.exa[124] = 364332818;
        ir.exa[125] = 1262895988;
        ir.exa[126] = -424188764;
        ir.exa[127] = 139903484;
        ir.exa[128] = 2129896205;
        ir.exa[129] = -804057074;
        ir.exa[130] = 1173903364;
        ir.exa[131] = 1102449358;
        ir.exa[132] = -1496354703;
        ir.exa[133] = -1206920951;
        ir.exa[134] = -2021514492;
        ir.exa[135] = -1201802801;
        ir.exa[136] = 1774888458;
        ir.exa[137] = -365201677;
        ir.exa[138] = -1992480579;
        ir.exa[139] = -198861827;
        ir.exa[140] = -1183859992;
        ir.exa[141] = 973575541;
        ir.exa[142] = 1711327259;
        ir.exa[143] = -798724227;
        ir.exa[144] = -804556793;
        ir.exa[145] = -1288824765;
        ir.exa[146] = 1952864129;
        ir.exa[147] = -1285219727;
        ir.exa[148] = -1500809313;
        ir.exa[149] = 1856169055;
        ir.exa[150] = -1214601709;
        ir.exa[151] = 764845282;
        ir.exa[152] = -1520399200;
        ir.exa[153] = -1594599337;
        ir.exa[154] = -1815918326;
        ir.exa[155] = -1253589452;
        ir.exa[156] = -798338099;
        ir.exa[157] = 954640917;
        ir.exa[158] = -1089867086;
        ir.exa[159] = -1241642207;
        ir.exa[160] = -1842436081;
        ir.exa[161] = -1590848360;
        ir.exa[162] = -1274991344;
        ir.exa[163] = -1942042120;
        ir.exa[164] = 774227265;
        ir.exa[165] = 1309145442;
        ir.exa[166] = -1313064858;
        ir.exa[167] = 414395632;
        ir.exa[168] = 1812097601;
        ir.exa[169] = 311569864;
        ir.exa[170] = -1249837078;
        ir.exa[171] = -668462357;
        ir.exa[172] = -681904145;
        ir.exa[173] = 394747828;
        ir.exa[174] = -2052980817;
        ir.exa[175] = 1037597939;
        ir.exa[176] = -1256148141;
        ir.exa[177] = 2066540610;
        ir.exa[178] = 1126400073;
        ir.exa[179] = 411385397;
        ir.exa[180] = 1019087249;
        ir.exa[181] = -764278408;
        ir.exa[182] = -1862436238;
        ir.exa[183] = 13599120;
        ir.exa[184] = -755679591;
        ir.exa[185] = -1909812968;
        ir.exa[186] = 598867758;
        ir.exa[187] = -1388341013;
        ir.exa[188] = -306492008;
    }

    private static /* synthetic */ void fid() {
        ir.ewu[0] = -8621434994366212294L;
        ir.ewu[1] = 8280466793752322211L;
        ir.ewu[2] = 5074296232345223203L;
        ir.ewu[3] = -6160399858384377521L;
        ir.ewu[4] = 3584443229955528451L;
        ir.ewu[5] = -8874032929330947345L;
        ir.ewu[6] = -1671661428563341674L;
        ir.ewu[7] = -8723407243687435868L;
        ir.ewu[8] = -9171734325628799961L;
        ir.ewu[9] = -352312300318501125L;
        ir.ewu[10] = 6926777930884647073L;
        ir.ewu[11] = -8241090602089680026L;
        ir.ewu[12] = 2908306127811241256L;
        ir.ewu[13] = 2864591141623354168L;
        ir.ewu[14] = 1227798506899749449L;
        ir.ewu[15] = -8074773174624181501L;
        ir.ewu[16] = -4658864454546577140L;
        ir.ewu[17] = 6236879721865605988L;
        ir.ewu[18] = 7156302853531901561L;
        ir.ewu[19] = -2342926603151435280L;
        ir.ewu[20] = 824433186472266474L;
        ir.ewu[21] = 7157945704591525203L;
        ir.ewu[22] = -5273225175857454353L;
        ir.ewu[23] = -790556256723497335L;
        ir.ewu[24] = -3479244344206670001L;
        ir.ewu[25] = 1183700555226497462L;
        ir.ewu[26] = -8088485336811085697L;
        ir.ewu[27] = 6611207296848820616L;
        ir.ewu[28] = -7361347341086919967L;
        ir.ewu[29] = 4756618921012757585L;
        ir.ewu[30] = -3549794781651684446L;
        ir.ewu[31] = 1236359068002575296L;
        ir.ewu[32] = -1612058494055897478L;
        ir.ewu[33] = 1049432716758801561L;
        ir.ewu[34] = -7431950365311767463L;
        ir.ewu[35] = 7625324178121925788L;
        ir.ewu[36] = 818085444916874742L;
        ir.ewu[37] = 7654852808625060321L;
        ir.ewu[38] = -5765147556531088973L;
        ir.ewu[39] = 7428567374248089587L;
        ir.ewu[40] = 6936536508986760473L;
        ir.ewu[41] = -5547844069467358467L;
        ir.ewu[42] = 7081131210701458166L;
        ir.ewu[43] = -2394437133628463280L;
        ir.ewu[44] = 3012445539213756057L;
        ir.ewu[45] = 4096346553253846848L;
        ir.ewu[46] = 5578266562065923538L;
        ir.ewu[47] = -6123965751695110037L;
        ir.ewu[48] = 8331317475770513060L;
        ir.ewu[49] = 7760788383305907792L;
        ir.ewu[50] = -3162598173030667076L;
        ir.ewu[51] = -8521508254051573403L;
        ir.ewu[52] = -5832299879230596720L;
        ir.ewu[53] = 8337698219253330712L;
        ir.ewu[54] = 7944372224604035507L;
        ir.ewu[55] = -6745568254788918489L;
        ir.ewu[56] = 1410579759131912281L;
        ir.ewu[57] = 425850736931670119L;
        ir.ewu[58] = 6229916848998245925L;
        ir.ewu[59] = -1870287727002844476L;
        ir.ewu[60] = -6859286550362837142L;
        ir.ewu[61] = -5103752358857920165L;
        ir.ewu[62] = 8541387607503563295L;
        ir.ewu[63] = -7008105836532362670L;
        ir.ewu[64] = 1315789810590882963L;
        ir.ewu[65] = -8256267695671669580L;
        ir.ewu[66] = -151667250320067785L;
        ir.ewu[67] = -4580750319415506491L;
        ir.ewu[68] = -592403320070353203L;
        ir.ewu[69] = 4337324923383466911L;
        ir.ewu[70] = 1721865420470788447L;
        ir.ewu[71] = 9040720110730327824L;
        ir.ewu[72] = 1150627524737172448L;
        ir.ewu[73] = -7929550349469371387L;
        ir.ewu[74] = 1373894466024045587L;
        ir.ewu[75] = 6474770033669060028L;
        ir.ewu[76] = -3901826181628725556L;
        ir.ewu[77] = 4158599829105603440L;
        ir.ewu[78] = 1872993509004208107L;
        ir.ewu[79] = 6538832723040915223L;
        ir.ewu[80] = -2288272150740758609L;
        ir.ewu[81] = 7246609087788098468L;
        ir.ewu[82] = 8636134543999417278L;
        ir.ewu[83] = -5356237895123576297L;
        ir.ewu[84] = -3388962173743818307L;
        ir.ewu[85] = -3880904022917387370L;
        ir.ewu[86] = -2133873288471584436L;
        ir.ewu[87] = 862285296940782935L;
        ir.ewu[88] = -5653962679548528526L;
        ir.ewu[89] = 6490812495980285106L;
        ir.ewu[90] = 5814071665542155200L;
        ir.ewu[91] = 2264206094614576926L;
        ir.ewu[92] = -6142853970514205324L;
        ir.ewu[93] = 2837261965544346285L;
        ir.ewu[94] = -6186037514549558154L;
    }

    private static /* synthetic */ void fie() {
        ir.ewv[0] = -8621434994366212294L;
        ir.ewv[1] = 8280466793752322211L;
        ir.ewv[2] = 5074296232345223203L;
        ir.ewv[3] = -6160399858384377669L;
        ir.ewv[4] = 1035180385366877232L;
        ir.ewv[5] = -4971829364795276427L;
        ir.ewv[6] = -2893802267442491973L;
        ir.ewv[7] = -4124106124235316828L;
        ir.ewv[8] = -4664525202660505836L;
        ir.ewv[9] = -4960620619025361157L;
        ir.ewv[10] = 6902120804582723899L;
        ir.ewv[11] = -3632782283382819994L;
        ir.ewv[12] = 1703593227489633576L;
        ir.ewv[13] = 1740795113898592930L;
        ir.ewv[14] = 5839484525327137353L;
        ir.ewv[15] = -3479975654799432957L;
        ir.ewv[16] = -9182282257546137450L;
        ir.ewv[17] = 7600129884096970665L;
        ir.ewv[18] = 6668091749731895267L;
        ir.ewv[19] = -2268617209299822096L;
        ir.ewv[20] = 3263467487295207103L;
        ir.ewv[21] = 8449306916128905231L;
        ir.ewv[22] = -2741599596637850029L;
        ir.ewv[23] = 1534555675993376191L;
        ir.ewv[24] = -5707266118369767362L;
        ir.ewv[25] = 2566217912742025614L;
        ir.ewv[26] = -5677270398178476249L;
        ir.ewv[27] = 2347881978856469634L;
        ir.ewv[28] = -3956849735832697130L;
        ir.ewv[29] = 8979481973007464296L;
        ir.ewv[30] = -1014160689236010402L;
        ir.ewv[31] = -2185804533227579153L;
        ir.ewv[32] = 2713073822111424772L;
        ir.ewv[33] = -8244335923293754987L;
        ir.ewv[34] = 8225418549248757963L;
        ir.ewv[35] = -4665185508351802170L;
        ir.ewv[36] = -1742945687403242571L;
        ir.ewv[37] = 913443215194519193L;
        ir.ewv[38] = -3079039069741900454L;
        ir.ewv[39] = 7137732091623915450L;
        ir.ewv[40] = -3669279615424294050L;
        ir.ewv[41] = 2683460367061627638L;
        ir.ewv[42] = -6873971726760311364L;
        ir.ewv[43] = 744316108541247977L;
        ir.ewv[44] = -3526890252067087905L;
        ir.ewv[45] = -8860977815360769830L;
        ir.ewv[46] = -1246525537172109497L;
        ir.ewv[47] = 6967408909620576804L;
        ir.ewv[48] = -30700989129661720L;
        ir.ewv[49] = -905229991034030262L;
        ir.ewv[50] = -6579747802321245425L;
        ir.ewv[51] = 6082625696657517753L;
        ir.ewv[52] = -5832299879230596720L;
        ir.ewv[53] = -7366999848209470821L;
        ir.ewv[54] = -6412201328087789330L;
        ir.ewv[55] = -2033215967920527407L;
        ir.ewv[56] = 3364050333143487013L;
        ir.ewv[57] = 1835158579341405485L;
        ir.ewv[58] = 8434996026680965962L;
        ir.ewv[59] = -6358666882984675289L;
        ir.ewv[60] = -2986635300603920596L;
        ir.ewv[61] = 4696696401249549431L;
        ir.ewv[62] = 871393556963171771L;
        ir.ewv[63] = -627146180444473601L;
        ir.ewv[64] = -7011085992662499335L;
        ir.ewv[65] = 5810757616182649153L;
        ir.ewv[66] = 2390561204883024090L;
        ir.ewv[67] = -6111120598637732645L;
        ir.ewv[68] = -2930110667957527220L;
        ir.ewv[69] = -5781213219199286927L;
        ir.ewv[70] = -5170281739839639140L;
        ir.ewv[71] = -2924741278956583968L;
        ir.ewv[72] = -6329667360323508635L;
        ir.ewv[73] = -8745758347850655456L;
        ir.ewv[74] = 1925484046756294737L;
        ir.ewv[75] = -2968919550111017615L;
        ir.ewv[76] = -8277057061153084470L;
        ir.ewv[77] = -7325729793198505486L;
        ir.ewv[78] = 954594692714674868L;
        ir.ewv[79] = 8124333394160429383L;
        ir.ewv[80] = 8465117735942261782L;
        ir.ewv[81] = -2619247978702239910L;
        ir.ewv[82] = 6555457249227138976L;
        ir.ewv[83] = 1338868757717275454L;
        ir.ewv[84] = 5488085144943159120L;
        ir.ewv[85] = 6556160260899825561L;
        ir.ewv[86] = -8633744204898082565L;
        ir.ewv[87] = 793683805748052626L;
        ir.ewv[88] = -381698182419301535L;
        ir.ewv[89] = -1004549530099037623L;
        ir.ewv[90] = 176165328077909270L;
        ir.ewv[91] = 5684928978936654462L;
        ir.ewv[92] = 1232770143441653299L;
        ir.ewv[93] = -16604067055763070L;
        ir.ewv[94] = -5998437443485237514L;
    }

    private static /* synthetic */ long ewt(int n2) {
        return ewu[n2] ^ ewv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getPredictedPosition(class_1309 var1_1, it$Stage var2_2) {
        block132: {
            block131: {
                block130: {
                    block129: {
                        block128: {
                            block127: {
                                var17_3 = ir.c;
                                var16_4 /* !! */  = ir.b;
                                var15_5 = ir.a;
                                if (var17_3) {
                                    throw null;
lbl6:
                                    // 33 sources

                                    return null;
                                }
                                if (var15_5 || var15_5) ** GOTO lbl6
                                if (var1_1 == null) break block127;
                                if (var15_5) ** GOTO lbl6
                                if (ir.mc.field_1724 != null) break block128;
                                if (var15_5) ** GOTO lbl6
                            }
                            if (var15_5 || var15_5) ** GOTO lbl6
                            return class_243.field_1353;
                        }
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var3_6 = var1_1.method_73189();
                        if (var15_5 || var15_5) ** GOTO lbl6
                        if (this.sampleCount < ir.eww("eyy", ewy(int ), (int)43)) break block129;
                        if (var15_5) ** GOTO lbl6
                        if (!(this.smoothedVelocity.method_37268() < ir.eww("eyz", exm(int ), (int)6))) break block130;
                        if (var15_5) ** GOTO lbl6
                    }
                    if (var15_5 || var15_5) ** GOTO lbl6
                    return var3_6;
                }
                if (var15_5 || var15_5) ** GOTO lbl6
                var4_7 = ir.mc.field_1724.method_5739((class_1297)var1_1);
                if (var15_5 || var15_5) ** GOTO lbl6
                var6_8 = ir.mc.field_1724.method_18798().method_1033();
                if (var15_5 || var15_5) ** GOTO lbl6
                var8_9 = this.smoothedVelocity.method_37267();
                if (var15_5 || var15_5) ** GOTO lbl6
                switch (ir$1.$SwitchMap$ruhack$phobia$system$modulesystem$impl$rage$macetarget$state$MaceState$Stage[var2_2.ordinal()]) {
                    case 1: {
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var12_10 /* !! */  = Math.abs(ir.mc.field_1724.method_23318() - var1_1.method_23318());
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var10_11 = (var12_10 /* !! */  + var4_7) / Math.max(var6_8 * ir.eww("eza", exm(int ), (int)7), 1.0) * ir.eww("ezb", exm(int ), (int)8);
                        if (var15_5 || var15_5) ** GOTO lbl6
                        if (!var17_3) break;
                        throw null;
                    }
                    case 2: {
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var10_11 = var4_7 / Math.max(var6_8 * ir.eww("ezc", exm(int ), (int)9), (double)ir.eww("ezd", exm(int ), (int)10));
                        if (var15_5 || var15_5) ** GOTO lbl6
                        if (!var17_3) break;
                        throw null;
                    }
                    case 3: {
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var10_11 = var4_7 / Math.max(var6_8 * ir.eww("eze", exm(int ), (int)11), (double)ir.eww("ezf", exm(int ), (int)12)) * ir.eww("ezg", exm(int ), (int)13);
                        if (var15_5 || var15_5) ** GOTO lbl6
                        if (!var17_3) break;
                        throw null;
                    }
                    default: {
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var10_11 = var4_7 / ir.eww("ezh", exm(int ), (int)14);
                        if (var15_5) ** GOTO lbl6
                    }
                }
                if (var15_5 || var15_5) ** GOTO lbl6
                var10_11 = Math.min(var10_11, (double)ir.eww("ezi", exm(int ), (int)15));
                if (var15_5 || var15_5) ** GOTO lbl6
                var12_10 /* !! */  = 1.0;
                if (var15_5 || var15_5) ** GOTO lbl6
                if (!(var8_9 > ir.eww("ezj", exm(int ), (int)16))) break block131;
                if (var15_5 || var15_5) ** GOTO lbl6
                var12_10 /* !! */  = (double)ir.eww("ezk", exm(int ), (int)17);
                if (var15_5) ** GOTO lbl6
            }
            if (var15_5 || var15_5) ** GOTO lbl6
            if (!(var8_9 > ir.eww("ezl", exm(int ), (int)18))) break block132;
            if (var15_5 || var15_5) ** GOTO lbl6
            var12_10 /* !! */  = (double)ir.eww("ezm", exm(int ), (int)19);
            if (var15_5) ** GOTO lbl6
        }
        if (var15_5 || var15_5) ** GOTO lbl6
        var14_12 = this.smoothedVelocity.method_1021(var10_11 * var12_10 /* !! */ );
        if (var15_5) ** GOTO lbl6
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var15_5) ** break;
                ** continue;
                return var3_6.method_1019(var14_12);
            }
            case 0: {
                var16_4 /* !! */  = (int)ir.eww("ezn", ewy(int ), (int)44);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 1: {
                var16_4 /* !! */  = (int)ir.eww("ezo", ewy(int ), (int)45);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl95:
            // 3 sources

            case 2: {
                var16_4 /* !! */  = (int)ir.eww("ezp", ewy(int ), (int)46);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl100:
            // 2 sources

            case 3: {
                var16_4 /* !! */  = (int)ir.eww("ezq", ewy(int ), (int)47);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl105:
            // 2 sources

            case 4: {
                var16_4 /* !! */  = (int)ir.eww("ezr", ewy(int ), (int)48);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl110:
            // 3 sources

            case 5: {
                var16_4 /* !! */  = (int)ir.eww("ezs", ewy(int ), (int)49);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl115:
            // 3 sources

            case 6: {
                var16_4 /* !! */  = (int)ir.eww("ezt", ewy(int ), (int)50);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl120:
            // 2 sources

            case 7: {
                var16_4 /* !! */  = (int)ir.eww("ezu", ewy(int ), (int)51);
                if (!var17_3) ** GOTO lbl115
                throw null;
            }
lbl124:
            // 2 sources

            case 8: {
                var16_4 /* !! */  = (int)ir.eww("ezv", ewy(int ), (int)52);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl129:
            // 3 sources

            case 9: {
                var16_4 /* !! */  = (int)ir.eww("ezw", ewy(int ), (int)53);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 10: {
                var16_4 /* !! */  = (int)ir.eww("ezx", ewy(int ), (int)54);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl139:
            // 2 sources

            case 11: {
                var16_4 /* !! */  = (int)ir.eww("ezy", ewy(int ), (int)55);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl144:
            // 2 sources

            case 12: {
                var16_4 /* !! */  = (int)ir.eww("ezz", ewy(int ), (int)56);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl149:
            // 2 sources

            case 13: {
                var16_4 /* !! */  = (int)ir.eww("faa", ewy(int ), (int)57);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 14: {
                var16_4 /* !! */  = (int)ir.eww("fab", ewy(int ), (int)58);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl159:
            // 3 sources

            case 15: {
                var16_4 /* !! */  = (int)ir.eww("fac", ewy(int ), (int)59);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl164:
            // 2 sources

            case 16: {
                var16_4 /* !! */  = (int)ir.eww("fad", ewy(int ), (int)60);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl169:
            // 5 sources

            case 17: {
                var16_4 /* !! */  = (int)ir.eww("fae", ewy(int ), (int)61);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 18: {
                var16_4 /* !! */  = (int)ir.eww("faf", ewy(int ), (int)62);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 19: {
                var16_4 /* !! */  = (int)ir.eww("fag", ewy(int ), (int)63);
                if (!var17_3) ** GOTO lbl159
                throw null;
            }
lbl183:
            // 2 sources

            case 20: {
                var16_4 /* !! */  = (int)ir.eww("fah", ewy(int ), (int)64);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 21: {
                var16_4 /* !! */  = (int)ir.eww("fai", ewy(int ), (int)65);
                if (!var17_3) ** GOTO lbl105
                throw null;
            }
lbl192:
            // 2 sources

            case 22: {
                var16_4 /* !! */  = (int)ir.eww("faj", ewy(int ), (int)66);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 23: {
                var16_4 /* !! */  = (int)ir.eww("fak", ewy(int ), (int)67);
                if (!var17_3) ** GOTO lbl124
                throw null;
            }
            case 24: {
                var16_4 /* !! */  = (int)ir.eww("fal", ewy(int ), (int)68);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl206:
            // 2 sources

            case 25: {
                var16_4 /* !! */  = (int)ir.eww("fam", ewy(int ), (int)69);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl354
            }
            case 26: {
                var16_4 /* !! */  = (int)ir.eww("fan", ewy(int ), (int)70);
                if (!var17_3) ** GOTO lbl192
                throw null;
            }
lbl215:
            // 2 sources

            case 27: {
                var16_4 /* !! */  = (int)ir.eww("fao", ewy(int ), (int)71);
                if (!var17_3) ** GOTO lbl183
                throw null;
            }
lbl219:
            // 2 sources

            case 28: {
                var16_4 /* !! */  = (int)ir.eww("fap", ewy(int ), (int)72);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl224:
            // 2 sources

            case 29: {
                var16_4 /* !! */  = (int)ir.eww("faq", ewy(int ), (int)73);
                if (!var17_3) ** GOTO lbl129
                throw null;
            }
lbl228:
            // 2 sources

            case 30: {
                var16_4 /* !! */  = (int)ir.eww("far", ewy(int ), (int)74);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl233:
            // 3 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_4 /* !! */  = (int)ir.eww("fas", ewy(int ), (int)75);
                    if (var17_3) {
                        throw null;
                    }
                    ** GOTO lbl287
                    break;
                }
            }
lbl239:
            // 2 sources

            case 32: {
                var16_4 /* !! */  = (int)ir.eww("fat", ewy(int ), (int)76);
                if (!var17_3) ** GOTO lbl159
                throw null;
            }
            case 33: {
                var16_4 /* !! */  = (int)ir.eww("fau", ewy(int ), (int)77);
                if (!var17_3) ** GOTO lbl169
                throw null;
            }
lbl247:
            // 3 sources

            case 34: {
                var16_4 /* !! */  = (int)ir.eww("fav", ewy(int ), (int)78);
                if (!var17_3) ** GOTO lbl100
                throw null;
            }
lbl251:
            // 2 sources

            case 35: {
                var16_4 /* !! */  = (int)ir.eww("faw", ewy(int ), (int)79);
                if (!var17_3) ** GOTO lbl228
                throw null;
            }
lbl255:
            // 2 sources

            case 36: {
                var16_4 /* !! */  = (int)ir.eww("fax", ewy(int ), (int)80);
                if (!var17_3) ** GOTO lbl120
                throw null;
            }
            case 37: {
                var16_4 /* !! */  = (int)ir.eww("fay", ewy(int ), (int)81);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl264:
            // 2 sources

            case 38: {
                var16_4 /* !! */  = (int)ir.eww("faz", ewy(int ), (int)82);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl269:
            // 3 sources

            case 39: {
                var16_4 /* !! */  = (int)ir.eww("fba", ewy(int ), (int)83);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 40: {
                var16_4 /* !! */  = (int)ir.eww("fbb", ewy(int ), (int)84);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl279:
            // 2 sources

            case 41: {
                var16_4 /* !! */  = (int)ir.eww("fbc", ewy(int ), (int)85);
                if (!var17_3) ** GOTO lbl247
                throw null;
            }
lbl283:
            // 4 sources

            case 42: {
                var16_4 /* !! */  = (int)ir.eww("fbd", ewy(int ), (int)86);
                if (!var17_3) ** GOTO lbl169
                throw null;
            }
lbl287:
            // 2 sources

            case 43: {
                var16_4 /* !! */  = (int)ir.eww("fbe", ewy(int ), (int)87);
                if (!var17_3) ** GOTO lbl233
                throw null;
            }
lbl291:
            // 2 sources

            case 44: {
                var16_4 /* !! */  = (int)ir.eww("fbf", ewy(int ), (int)88);
                if (!var17_3) ** GOTO lbl239
                throw null;
            }
lbl295:
            // 2 sources

            case 45: {
                var16_4 /* !! */  = (int)ir.eww("fbg", ewy(int ), (int)89);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 46: {
                var16_4 /* !! */  = (int)ir.eww("fbh", ewy(int ), (int)90);
                if (!var17_3) ** GOTO lbl149
                throw null;
            }
lbl304:
            // 3 sources

            case 47: {
                var16_4 /* !! */  = (int)ir.eww("fbi", ewy(int ), (int)91);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl309:
            // 3 sources

            case 48: {
                var16_4 /* !! */  = (int)ir.eww("fbj", ewy(int ), (int)92);
                if (!var17_3) ** GOTO lbl110
                throw null;
            }
lbl313:
            // 2 sources

            case 49: {
                var16_4 /* !! */  = (int)ir.eww("fbk", ewy(int ), (int)93);
                if (!var17_3) ** GOTO lbl269
                throw null;
            }
            case 50: {
                var16_4 /* !! */  = (int)ir.eww("fbl", ewy(int ), (int)94);
                if (!var17_3) ** GOTO lbl110
                throw null;
            }
lbl321:
            // 2 sources

            case 51: {
                var16_4 /* !! */  = (int)ir.eww("fbm", ewy(int ), (int)95);
                if (!var17_3) ** GOTO lbl251
                throw null;
            }
            case 52: {
                var16_4 /* !! */  = (int)ir.eww("fbn", ewy(int ), (int)96);
                if (!var17_3) ** GOTO lbl95
                throw null;
            }
lbl329:
            // 3 sources

            case 53: {
                do {
                    var16_4 /* !! */  = (int)ir.eww("fbo", ewy(int ), (int)97);
                } while (!var17_3);
                throw null;
            }
lbl334:
            // 2 sources

            case 54: {
                var16_4 /* !! */  = (int)ir.eww("fbp", ewy(int ), (int)98);
                if (!var17_3) ** GOTO lbl164
                throw null;
            }
lbl338:
            // 2 sources

            case 55: {
                var16_4 /* !! */  = (int)ir.eww("fbq", ewy(int ), (int)99);
                if (!var17_3) ** GOTO lbl139
                throw null;
            }
            case 56: {
                var16_4 /* !! */  = (int)ir.eww("fbr", ewy(int ), (int)100);
                if (!var17_3) ** GOTO lbl247
                throw null;
            }
lbl346:
            // 2 sources

            case 57: {
                var16_4 /* !! */  = (int)ir.eww("fbs", ewy(int ), (int)101);
                if (!var17_3) ** GOTO lbl95
                throw null;
            }
            case 58: {
                var16_4 /* !! */  = (int)ir.eww("fbt", ewy(int ), (int)102);
                if (!var17_3) ** GOTO lbl206
                throw null;
            }
lbl354:
            // 3 sources

            case 59: {
                var16_4 /* !! */  = (int)ir.eww("fbu", ewy(int ), (int)103);
                if (!var17_3) ** GOTO lbl313
                throw null;
            }
lbl358:
            // 2 sources

            case 60: {
                var16_4 /* !! */  = (int)ir.eww("fbv", ewy(int ), (int)104);
                if (!var17_3) ** GOTO lbl115
                throw null;
            }
            case 61: 
        }
        var16_4 /* !! */  = (int)ir.eww("fbw", ewy(int ), (int)105);
        ** while (!var17_3)
lbl365:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int getSampleCount() {
        boolean bl2;
        Object object = z;
        block14: while (true) {
            switch ((int)object) {
                case -798373726: {
                    break block14;
                }
                case 1119832082: {
                    object = ir.eww("fhk", ewt(int ), (int)87) - ir.eww("fhj", ewt(int ), (int)86);
                    continue block14;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = z;
        boolean bl4 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ir.eww("fhl", ewt(int ), (int)88);
            }
            switch ((int)object2) {
                case -1237293256: {
                    callSite = ir.eww("fhm", ewt(int ), (int)89);
                    continue block15;
                }
                case -1005215205: {
                    callSite = ir.eww("fhn", ewt(int ), (int)90);
                    continue block15;
                }
                case -798373726: {
                    break block15;
                }
                case 1654757290: {
                    callSite = ir.eww("fho", ewt(int ), (int)91);
                    continue block15;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = z - ir.eww("fhp", ewt(int ), (int)92)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ir.eww("fhq", ewy(int ), (int)182)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = ir.eww("fhr", ewy(int ), (int)183);
        }
        if (bl2) return (int)ir.eww("fhs", ewy(int ), (int)184);
        if (bl2) return (int)ir.eww("fhs", ewy(int ), (int)184);
        Object object4 = z;
        block17: while (true) {
            switch ((int)object4) {
                case -1189605041: {
                    object4 = ir.eww("fhu", ewt(int ), (int)94) - ir.eww("fht", ewt(int ), (int)93);
                    continue block17;
                }
                case -798373726: {
                    return this.sampleCount;
                }
            }
            break;
        }
        return this.sampleCount;
    }

    static {
        ewz = new int[189];
        exa = new int[189];
        ir.fhz();
        ir.fia();
        ir.fib();
        ir.fic();
        ewu = new long[95];
        ewv = new long[95];
        ir.fid();
        ir.fie();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = ir.z;
        if (true) ** GOTO lbl5
        block48: while (true) {
            v0 /* !! */  = (long)(v1 - ir.eww("fcz", ewt(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -798373726: {
                    break block48;
                }
                case -518933805: {
                    v1 = ir.eww("fda", ewt(int ), (int)32);
                    continue block48;
                }
                case 1688603577: {
                    v1 = ir.eww("fdb", ewt(int ), (int)33);
                    continue block48;
                }
                case 1824105394: {
                    v1 = ir.eww("fdc", ewt(int ), (int)34);
                    continue block48;
                }
            }
            break;
        }
        var3_1 = ir.c;
        v2 /* !! */  = ir.z;
        if (true) ** GOTO lbl22
        block49: while (true) {
            v2 /* !! */  = (long)(v3 - ir.eww("fdd", ewt(int ), (int)35));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -798373726: {
                    break block49;
                }
                case -740708487: {
                    v3 = ir.eww("fde", ewt(int ), (int)36);
                    continue block49;
                }
                case 776271344: {
                    v3 = ir.eww("fdf", ewt(int ), (int)37);
                    continue block49;
                }
            }
            break;
        }
        var2_2 /* !! */  = ir.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ir.z - ir.eww("fdg", ewt(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ir.eww("fdh", ewy(int ), (int)123)) break;
            v4 /* !! */  = (long)ir.eww("fdi", ewy(int ), (int)124);
        }
        var1_3 = ir.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ir.z - ir.eww("fdj", ewt(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ir.eww("fdk", ewy(int ), (int)125)) break;
            v5 /* !! */  = (long)ir.eww("fdl", ewy(int ), (int)126);
        }
        this.lastPosition = null;
        if (var1_3 || var1_3) ** GOTO lbl40
        v6 /* !! */  = ir.z;
        if (true) ** GOTO lbl54
        block53: while (true) {
            v6 /* !! */  = (long)(v7 - ir.eww("fdm", ewt(int ), (int)40));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2143917387: {
                    v7 = ir.eww("fdn", ewt(int ), (int)41);
                    continue block53;
                }
                case -1733206825: {
                    v7 = ir.eww("fdo", ewt(int ), (int)42);
                    continue block53;
                }
                case -798373726: {
                    break block53;
                }
                case -600770501: {
                    v7 = ir.eww("fdp", ewt(int ), (int)43);
                    continue block53;
                }
            }
            break;
        }
        v8 /* !! */  = ir.z;
        if (true) ** GOTO lbl70
        block54: while (true) {
            v8 /* !! */  = (long)(v9 - ir.eww("fdq", ewt(int ), (int)44));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2041492366: {
                    v9 = ir.eww("fdr", ewt(int ), (int)45);
                    continue block54;
                }
                case -798373726: {
                    break block54;
                }
                case 1947794466: {
                    v9 = ir.eww("fds", ewt(int ), (int)46);
                    continue block54;
                }
            }
            break;
        }
        this.velocity = class_243.field_1353;
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = ir.z - ir.eww("fdt", ewt(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ir.eww("fdu", ewy(int ), (int)127)) break;
            v10 /* !! */  = (long)ir.eww("fdv", ewy(int ), (int)128);
        }
        v11 /* !! */  = ir.z;
        if (true) ** GOTO lbl90
        block56: while (true) {
            v11 /* !! */  = (long)(v12 - ir.eww("fdw", ewt(int ), (int)48));
lbl90:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1637738850: {
                    v12 = ir.eww("fdx", ewt(int ), (int)49);
                    continue block56;
                }
                case -1498563691: {
                    v12 = ir.eww("fdy", ewt(int ), (int)50);
                    continue block56;
                }
                case -798373726: {
                    break block56;
                }
                case 725483181: {
                    v12 = ir.eww("fdz", ewt(int ), (int)51);
                    continue block56;
                }
            }
            break;
        }
        this.smoothedVelocity = class_243.field_1353;
        if (var1_3 || var1_3) ** GOTO lbl40
        v13 = ir.eww("fea", ewt(int ), (int)52);
        v14 /* !! */  = ir.z;
        if (true) ** GOTO lbl109
        block57: while (true) {
            v14 /* !! */  = (long)(ir.eww("fec", ewt(int ), (int)54) - ir.eww("feb", ewt(int ), (int)53));
lbl109:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -798373726: {
                    break block57;
                }
                case -145961267: {
                    continue block57;
                }
            }
            break;
        }
        this.lastUpdateTime = (long)v13;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl40
                v15 = ir.eww("fed", ewy(int ), (int)129);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = ir.z - ir.eww("fee", ewt(int ), (int)55)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ir.eww("fef", ewy(int ), (int)130)) break;
                    v16 /* !! */  = (long)ir.eww("feg", ewy(int ), (int)131);
                }
                this.sampleCount = (int)v15;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl128:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ir.eww("feh", ewy(int ), (int)132);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl133:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ir.eww("fei", ewy(int ), (int)133);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ir.eww("fej", ewy(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl142:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)ir.eww("fek", ewy(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 4: {
                var2_2 /* !! */  = (int)ir.eww("fel", ewy(int ), (int)136);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 5: {
                var2_2 /* !! */  = (int)ir.eww("fem", ewy(int ), (int)137);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ir.eww("fen", ewy(int ), (int)138);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ir.eww("feo", ewy(int ), (int)139);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
lbl164:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ir.eww("fep", ewy(int ), (int)140);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ir.eww("feq", ewy(int ), (int)141);
                if (var3_1) {
                    throw null;
                }
            }
lbl172:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)ir.eww("fer", ewy(int ), (int)142);
                if (!var3_1) ** GOTO lbl164
                throw null;
            }
lbl176:
            // 4 sources

            case 11: {
                do {
                    var2_2 /* !! */  = (int)ir.eww("fes", ewy(int ), (int)143);
                } while (!var3_1);
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ir.eww("fet", ewy(int ), (int)144);
                    if (!var3_1) ** GOTO lbl176
                    throw null;
                }
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)ir.eww("feu", ewy(int ), (int)145);
        ** while (!var3_1)
lbl189:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fhz() {
        ir.ewz[0] = 911014765;
        ir.ewz[1] = 349679149;
        ir.ewz[2] = -1690662503;
        ir.ewz[3] = 1176981176;
        ir.ewz[4] = 1453664556;
        ir.ewz[5] = -270462105;
        ir.ewz[6] = -1205793413;
        ir.ewz[7] = 660314822;
        ir.ewz[8] = 795560830;
        ir.ewz[9] = 2129899876;
        ir.ewz[10] = 445067124;
        ir.ewz[11] = 292329069;
        ir.ewz[12] = -1769511677;
        ir.ewz[13] = -2001702493;
        ir.ewz[14] = -1508513769;
        ir.ewz[15] = -709266336;
        ir.ewz[16] = 988514737;
        ir.ewz[17] = -1619791796;
        ir.ewz[18] = -1150334564;
        ir.ewz[19] = -728479274;
        ir.ewz[20] = 1115853858;
        ir.ewz[21] = 370391992;
        ir.ewz[22] = -1827627046;
        ir.ewz[23] = -919534176;
        ir.ewz[24] = -750666851;
        ir.ewz[25] = -678324797;
        ir.ewz[26] = 766081840;
        ir.ewz[27] = -194709356;
        ir.ewz[28] = 1987866864;
        ir.ewz[29] = -1776145535;
        ir.ewz[30] = -978714768;
        ir.ewz[31] = 1225529522;
        ir.ewz[32] = 619049667;
        ir.ewz[33] = 1625810182;
        ir.ewz[34] = -1859160612;
        ir.ewz[35] = 961094214;
        ir.ewz[36] = 0xFBDBBDF;
        ir.ewz[37] = -134077895;
        ir.ewz[38] = -1626676946;
        ir.ewz[39] = -659880012;
        ir.ewz[40] = 600977162;
        ir.ewz[41] = -1614644792;
        ir.ewz[42] = -1558865256;
        ir.ewz[43] = 418734922;
        ir.ewz[44] = -1755741412;
        ir.ewz[45] = 1375221847;
        ir.ewz[46] = -850440775;
        ir.ewz[47] = 236305952;
        ir.ewz[48] = 303703214;
        ir.ewz[49] = 1638891750;
        ir.ewz[50] = -1779234784;
        ir.ewz[51] = 1690451868;
        ir.ewz[52] = -1135312627;
        ir.ewz[53] = 755334386;
        ir.ewz[54] = -1967609186;
        ir.ewz[55] = -618924114;
        ir.ewz[56] = 349681682;
        ir.ewz[57] = 1383668295;
        ir.ewz[58] = -571646679;
        ir.ewz[59] = 772375525;
        ir.ewz[60] = -873050813;
        ir.ewz[61] = -240681588;
        ir.ewz[62] = -1492685224;
        ir.ewz[63] = -680085349;
        ir.ewz[64] = 1400523672;
        ir.ewz[65] = -2019054058;
        ir.ewz[66] = 1687717730;
        ir.ewz[67] = 605682012;
        ir.ewz[68] = 176642718;
        ir.ewz[69] = 2113247363;
        ir.ewz[70] = 376987861;
        ir.ewz[71] = -1753109269;
        ir.ewz[72] = 632025841;
        ir.ewz[73] = -570375731;
        ir.ewz[74] = 910670457;
        ir.ewz[75] = -1274527557;
        ir.ewz[76] = -741274240;
        ir.ewz[77] = -1209780182;
        ir.ewz[78] = -1339843319;
        ir.ewz[79] = 1396731948;
        ir.ewz[80] = 1909061282;
        ir.ewz[81] = -1257071503;
        ir.ewz[82] = -195221526;
        ir.ewz[83] = -2041396762;
        ir.ewz[84] = -969136541;
        ir.ewz[85] = -1860546094;
        ir.ewz[86] = 1032482207;
        ir.ewz[87] = 1071673767;
        ir.ewz[88] = 1219576922;
        ir.ewz[89] = -1470943989;
        ir.ewz[90] = -393664967;
        ir.ewz[91] = 294598582;
        ir.ewz[92] = -819742654;
        ir.ewz[93] = -410504117;
        ir.ewz[94] = -162252588;
        ir.ewz[95] = 27567595;
        ir.ewz[96] = -1216844071;
        ir.ewz[97] = 1841644200;
        ir.ewz[98] = 2115593055;
        ir.ewz[99] = -800126589;
    }

    public ir() {
        int n2 = b;
        this.lastPosition = null;
        this.velocity = class_243.field_1353;
        this.smoothedVelocity = class_243.field_1353;
        this.lastUpdateTime = (long)ir.eww("ewx", ewt(int ), (int)0);
        this.sampleCount = (int)ir.eww("exb", ewy(int ), (int)0);
    }

    public static /* synthetic */ CallSite eww(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fia() {
        ir.ewz[100] = -1268862339;
        ir.ewz[101] = 2073667436;
        ir.ewz[102] = 2030861950;
        ir.ewz[103] = 195365391;
        ir.ewz[104] = -382124188;
        ir.ewz[105] = -2036461454;
        ir.ewz[106] = -1911397703;
        ir.ewz[107] = 1412913314;
        ir.ewz[108] = -1552728775;
        ir.ewz[109] = 75290281;
        ir.ewz[110] = 340758418;
        ir.ewz[111] = 1072384759;
        ir.ewz[112] = 627487694;
        ir.ewz[113] = -2141901894;
        ir.ewz[114] = -1160512364;
        ir.ewz[115] = -1143994374;
        ir.ewz[116] = -1395904211;
        ir.ewz[117] = 1710369448;
        ir.ewz[118] = -1770991773;
        ir.ewz[119] = -1294202152;
        ir.ewz[120] = -1511688093;
        ir.ewz[121] = 1058832870;
        ir.ewz[122] = 1066574157;
        ir.ewz[123] = 1544200372;
        ir.ewz[124] = 1712357940;
        ir.ewz[125] = -1262895989;
        ir.ewz[126] = -1222661571;
        ir.ewz[127] = 139903485;
        ir.ewz[128] = 169488272;
        ir.ewz[129] = -804057074;
        ir.ewz[130] = -1173903365;
        ir.ewz[131] = 2083501256;
        ir.ewz[132] = -1496354700;
        ir.ewz[133] = -1206920946;
        ir.ewz[134] = -2021514493;
        ir.ewz[135] = -1201802805;
        ir.ewz[136] = 1774888458;
        ir.ewz[137] = -365201675;
        ir.ewz[138] = -1992480586;
        ir.ewz[139] = -198861826;
        ir.ewz[140] = -1183859999;
        ir.ewz[141] = 973575550;
        ir.ewz[142] = 1711327257;
        ir.ewz[143] = -798724239;
        ir.ewz[144] = -804556789;
        ir.ewz[145] = -1288824761;
        ir.ewz[146] = -1952864130;
        ir.ewz[147] = -553384443;
        ir.ewz[148] = 1500809312;
        ir.ewz[149] = 136492847;
        ir.ewz[150] = 1214601708;
        ir.ewz[151] = -16523533;
        ir.ewz[152] = -1520399197;
        ir.ewz[153] = -1594599337;
        ir.ewz[154] = -1815918328;
        ir.ewz[155] = -1253589451;
        ir.ewz[156] = -798338100;
        ir.ewz[157] = 708720859;
        ir.ewz[158] = -1089867085;
        ir.ewz[159] = -1241642205;
        ir.ewz[160] = -1842436081;
        ir.ewz[161] = -1590848357;
        ir.ewz[162] = -1274991343;
        ir.ewz[163] = 1098746948;
        ir.ewz[164] = -774227266;
        ir.ewz[165] = -1437731664;
        ir.ewz[166] = 1313064857;
        ir.ewz[167] = 978782702;
        ir.ewz[168] = 1812097600;
        ir.ewz[169] = -1935276837;
        ir.ewz[170] = -1249837078;
        ir.ewz[171] = -668462359;
        ir.ewz[172] = -681904145;
        ir.ewz[173] = 394747831;
        ir.ewz[174] = -2052980818;
        ir.ewz[175] = -1240342167;
        ir.ewz[176] = -1256148142;
        ir.ewz[177] = 565876549;
        ir.ewz[178] = 1126400072;
        ir.ewz[179] = 411385399;
        ir.ewz[180] = 1019087251;
        ir.ewz[181] = -764278406;
        ir.ewz[182] = -1862436237;
        ir.ewz[183] = -1034989980;
        ir.ewz[184] = 880296600;
        ir.ewz[185] = -1909812965;
        ir.ewz[186] = 598867756;
        ir.ewz[187] = -1388341014;
        ir.ewz[188] = -306492008;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getLastPosition() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ir.z - ir.eww("fev", ewt(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ir.eww("few", ewy(int ), (int)146)) break;
            v0 /* !! */  = (long)ir.eww("fex", ewy(int ), (int)147);
        }
        var3_1 = ir.c;
        v1 /* !! */  = ir.z;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(ir.eww("fez", ewt(int ), (int)58) - ir.eww("fey", ewt(int ), (int)57));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -798373726: {
                    break block11;
                }
                case 504659921: {
                    continue block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = ir.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ir.z - ir.eww("ffa", ewt(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ir.eww("ffb", ewy(int ), (int)148)) break;
            v2 /* !! */  = (long)ir.eww("ffc", ewy(int ), (int)149);
        }
        var1_3 = ir.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block13;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ir.z - ir.eww("ffd", ewt(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ir.eww("ffe", ewy(int ), (int)150)) break;
                    v3 /* !! */  = (long)ir.eww("fff", ewy(int ), (int)151);
                }
                return this.lastPosition;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ir.eww("ffg", ewy(int ), (int)152);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl44:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)ir.eww("ffh", ewy(int ), (int)153);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)ir.eww("ffi", ewy(int ), (int)154);
                    if (!var3_1) ** GOTO lbl44
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ir.eww("ffj", ewy(int ), (int)155);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getSmoothedVelocity() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ir.z - ir.eww("fgb", ewt(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ir.eww("fgc", ewy(int ), (int)162)) break;
            v0 /* !! */  = (long)ir.eww("fgd", ewy(int ), (int)163);
        }
        var3_1 = ir.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ir.z - ir.eww("fge", ewt(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ir.eww("fgf", ewy(int ), (int)164)) break;
            v1 /* !! */  = (long)ir.eww("fgg", ewy(int ), (int)165);
        }
        var2_2 /* !! */  = ir.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ir.z - ir.eww("fgh", ewt(int ), (int)74)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ir.eww("fgi", ewy(int ), (int)166)) break;
            v2 /* !! */  = (long)ir.eww("fgj", ewy(int ), (int)167);
        }
        var1_3 = ir.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ir.z - ir.eww("fgk", ewt(int ), (int)75)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ir.eww("fgl", ewy(int ), (int)168)) break;
                    v3 /* !! */  = (long)ir.eww("fgm", ewy(int ), (int)169);
                }
                return this.smoothedVelocity;
            }
            case 0: {
                var2_2 /* !! */  = (int)ir.eww("fgn", ewy(int ), (int)170);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ir.eww("fgo", ewy(int ), (int)171);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ir.eww("fgp", ewy(int ), (int)172);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ir.eww("fgq", ewy(int ), (int)173);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public long getLastUpdateTime() {
        boolean bl2;
        Object object = z;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ir.eww("fgr", ewt(int ), (int)76);
            }
            switch ((int)object) {
                case -2131234830: {
                    callSite = ir.eww("fgs", ewt(int ), (int)77);
                    continue block11;
                }
                case -798373726: {
                    break block11;
                }
                case -59956661: {
                    callSite = ir.eww("fgt", ewt(int ), (int)78);
                    continue block11;
                }
                case 1674872979: {
                    callSite = ir.eww("fgu", ewt(int ), (int)79);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = z;
        boolean bl5 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - ir.eww("fgv", ewt(int ), (int)80);
            }
            switch ((int)object2) {
                case -798373726: {
                    break block12;
                }
                case -421842021: {
                    callSite = ir.eww("fgw", ewt(int ), (int)81);
                    continue block12;
                }
                case 1602051150: {
                    callSite = ir.eww("fgx", ewt(int ), (int)82);
                    continue block12;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = z - ir.eww("fgy", ewt(int ), (int)83)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ir.eww("fgz", ewy(int ), (int)174)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ir.eww("fha", ewy(int ), (int)175);
        }
        if (bl2) return (long)ir.eww("fhb", ewt(int ), (int)84);
        if (bl2) return (long)ir.eww("fhb", ewt(int ), (int)84);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = z - ir.eww("fhc", ewt(int ), (int)85)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ir.eww("fhd", ewy(int ), (int)176)) {
                return this.lastUpdateTime;
            }
            object4 = ir.eww("fhe", ewy(int ), (int)177);
        }
    }

    private static /* synthetic */ double exm(int n2) {
        return Double.longBitsToDouble(ewu[n2] ^ ewv[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void update(class_1309 var1_1) {
        var9_2 = ir.c;
        var8_3 /* !! */  = ir.b;
        var7_4 = ir.a;
        if (var9_2) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                if (var1_1 != null) ** GOTO lbl18
                if (var7_4 || var7_4) ** GOTO lbl6
                this.reset();
                if (var7_4 || var7_4) ** GOTO lbl6
                return;
lbl18:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var2_5 = var1_1.method_73189();
                if (var7_4 || var7_4) ** GOTO lbl6
                var3_6 = System.currentTimeMillis();
                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.lastPosition == null) ** GOTO lbl39
                if (var7_4) ** GOTO lbl6
                if (this.lastUpdateTime <= ir.eww("exj", ewt(int ), (int)1)) ** GOTO lbl39
                if (var7_4 || var7_4) ** GOTO lbl6
                var5_7 = var3_6 - this.lastUpdateTime;
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var5_7 <= ir.eww("exk", ewt(int ), (int)2)) ** GOTO lbl39
                if (var7_4) ** GOTO lbl6
                if (var5_7 >= ir.eww("exl", ewt(int ), (int)3)) ** GOTO lbl39
                if (var7_4 || var7_4) ** GOTO lbl6
                this.velocity = var2_5.method_1020(this.lastPosition);
                if (var7_4 || var7_4) ** GOTO lbl6
                this.smoothedVelocity = this.smoothedVelocity.method_1021((double)ir.eww("exn", exm(int ), (int)4)).method_1019(this.velocity.method_1021((double)ir.eww("exo", exm(int ), (int)5)));
                if (var7_4 || var7_4) ** GOTO lbl6
                this.sampleCount += ir.eww("exp", ewy(int ), (int)8);
                if (var7_4) ** GOTO lbl6
lbl39:
                // 5 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastPosition = var2_5;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastUpdateTime = var3_6;
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_3 /* !! */  = (int)ir.eww("exq", ewy(int ), (int)9);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 1: {
                var8_3 /* !! */  = (int)ir.eww("exr", ewy(int ), (int)10);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl56:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)ir.eww("exs", ewy(int ), (int)11);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 3: {
                var8_3 /* !! */  = (int)ir.eww("ext", ewy(int ), (int)12);
                if (!var9_2) ** GOTO lbl56
                throw null;
            }
            case 4: {
                var8_3 /* !! */  = (int)ir.eww("exu", ewy(int ), (int)13);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 5: {
                var8_3 /* !! */  = (int)ir.eww("exv", ewy(int ), (int)14);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 6: {
                var8_3 /* !! */  = (int)ir.eww("exw", ewy(int ), (int)15);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 7: {
                var8_3 /* !! */  = (int)ir.eww("exx", ewy(int ), (int)16);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl85:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)ir.eww("exy", ewy(int ), (int)17);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl90:
            // 3 sources

            case 9: {
                var8_3 /* !! */  = (int)ir.eww("exz", ewy(int ), (int)18);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 10: {
                do {
                    var8_3 /* !! */  = (int)ir.eww("eya", ewy(int ), (int)19);
                } while (!var9_2);
                throw null;
            }
lbl100:
            // 5 sources

            case 11: {
                var8_3 /* !! */  = (int)ir.eww("eyb", ewy(int ), (int)20);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 12: {
                var8_3 /* !! */  = (int)ir.eww("eyc", ewy(int ), (int)21);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 13: {
                var8_3 /* !! */  = (int)ir.eww("eyd", ewy(int ), (int)22);
                if (!var9_2) ** GOTO lbl56
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)ir.eww("eye", ewy(int ), (int)23);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                    break;
                }
            }
            case 15: {
                var8_3 /* !! */  = (int)ir.eww("eyf", ewy(int ), (int)24);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl125:
            // 2 sources

            case 16: {
                var8_3 /* !! */  = (int)ir.eww("eyg", ewy(int ), (int)25);
                if (!var9_2) ** GOTO lbl100
                throw null;
            }
lbl129:
            // 3 sources

            case 17: {
                var8_3 /* !! */  = (int)ir.eww("eyh", ewy(int ), (int)26);
                if (!var9_2) ** GOTO lbl90
                throw null;
            }
lbl133:
            // 2 sources

            case 18: {
                var8_3 /* !! */  = (int)ir.eww("eyi", ewy(int ), (int)27);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl138:
            // 2 sources

            case 19: {
                var8_3 /* !! */  = (int)ir.eww("eyj", ewy(int ), (int)28);
                if (!var9_2) ** GOTO lbl90
                throw null;
            }
            case 20: {
                var8_3 /* !! */  = (int)ir.eww("eyk", ewy(int ), (int)29);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
lbl146:
            // 4 sources

            case 21: {
                var8_3 /* !! */  = (int)ir.eww("eyl", ewy(int ), (int)30);
                if (!var9_2) break;
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)ir.eww("eym", ewy(int ), (int)31);
                if (!var9_2) ** GOTO lbl133
                throw null;
            }
            case 23: {
                var8_3 /* !! */  = (int)ir.eww("eyn", ewy(int ), (int)32);
                if (!var9_2) ** GOTO lbl125
                throw null;
            }
            case 24: {
                var8_3 /* !! */  = (int)ir.eww("eyo", ewy(int ), (int)33);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl163:
            // 3 sources

            case 25: {
                var8_3 /* !! */  = (int)ir.eww("eyp", ewy(int ), (int)34);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl168:
            // 4 sources

            case 26: {
                var8_3 /* !! */  = (int)ir.eww("eyq", ewy(int ), (int)35);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl173:
            // 2 sources

            case 27: {
                var8_3 /* !! */  = (int)ir.eww("eyr", ewy(int ), (int)36);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl178:
            // 2 sources

            case 28: {
                var8_3 /* !! */  = (int)ir.eww("eys", ewy(int ), (int)37);
                if (!var9_2) ** GOTO lbl100
                throw null;
            }
lbl182:
            // 5 sources

            case 29: {
                var8_3 /* !! */  = (int)ir.eww("eyt", ewy(int ), (int)38);
                if (!var9_2) ** GOTO lbl146
                throw null;
            }
lbl186:
            // 2 sources

            case 30: {
                var8_3 /* !! */  = (int)ir.eww("eyu", ewy(int ), (int)39);
                if (!var9_2) ** GOTO lbl178
                throw null;
            }
            case 31: {
                var8_3 /* !! */  = (int)ir.eww("eyv", ewy(int ), (int)40);
                if (!var9_2) ** GOTO lbl163
                throw null;
            }
lbl194:
            // 3 sources

            case 32: {
                var8_3 /* !! */  = (int)ir.eww("eyw", ewy(int ), (int)41);
                if (!var9_2) ** GOTO lbl168
                throw null;
            }
            case 33: 
        }
        var8_3 /* !! */  = (int)ir.eww("eyx", ewy(int ), (int)42);
        ** while (!var9_2)
lbl201:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fib() {
        ir.exa[0] = 911014765;
        ir.exa[1] = 349679149;
        ir.exa[2] = -1690662497;
        ir.exa[3] = 1176981178;
        ir.exa[4] = 1453664556;
        ir.exa[5] = -270462110;
        ir.exa[6] = -1205793416;
        ir.exa[7] = 660314822;
        ir.exa[8] = 795560831;
        ir.exa[9] = 2129899903;
        ir.exa[10] = 445067093;
        ir.exa[11] = 292329037;
        ir.exa[12] = -1769511670;
        ir.exa[13] = -2001702489;
        ir.exa[14] = -1508513782;
        ir.exa[15] = -709266327;
        ir.exa[16] = 988514729;
        ir.exa[17] = -1619791785;
        ir.exa[18] = -1150334565;
        ir.exa[19] = -728479287;
        ir.exa[20] = 1115853866;
        ir.exa[21] = 370391982;
        ir.exa[22] = -1827627013;
        ir.exa[23] = -919534147;
        ir.exa[24] = -750666855;
        ir.exa[25] = -678324790;
        ir.exa[26] = 766081832;
        ir.exa[27] = -194709353;
        ir.exa[28] = 1987866853;
        ir.exa[29] = -1776145505;
        ir.exa[30] = -978714774;
        ir.exa[31] = 1225529506;
        ir.exa[32] = 619049668;
        ir.exa[33] = 1625810185;
        ir.exa[34] = -1859160612;
        ir.exa[35] = 961094226;
        ir.exa[36] = 264092627;
        ir.exa[37] = -134077917;
        ir.exa[38] = -1626676949;
        ir.exa[39] = -659880004;
        ir.exa[40] = 600977152;
        ir.exa[41] = -1614644775;
        ir.exa[42] = -1558865251;
        ir.exa[43] = 418734920;
        ir.exa[44] = -1755741386;
        ir.exa[45] = 1375221876;
        ir.exa[46] = -850440811;
        ir.exa[47] = 236305964;
        ir.exa[48] = 303703227;
        ir.exa[49] = 1638891734;
        ir.exa[50] = -1779234769;
        ir.exa[51] = 1690451862;
        ir.exa[52] = -1135312605;
        ir.exa[53] = 755334380;
        ir.exa[54] = -1967609201;
        ir.exa[55] = -618924160;
        ir.exa[56] = 349681666;
        ir.exa[57] = 1383668295;
        ir.exa[58] = -571646708;
        ir.exa[59] = 772375504;
        ir.exa[60] = -873050777;
        ir.exa[61] = -240681541;
        ir.exa[62] = -1492685239;
        ir.exa[63] = -680085333;
        ir.exa[64] = 1400523654;
        ir.exa[65] = -2019054034;
        ir.exa[66] = 1687717745;
        ir.exa[67] = 605682032;
        ir.exa[68] = 176642710;
        ir.exa[69] = 2113247411;
        ir.exa[70] = 376987843;
        ir.exa[71] = -1753109273;
        ir.exa[72] = 632025852;
        ir.exa[73] = -570375722;
        ir.exa[74] = 910670417;
        ir.exa[75] = -1274527559;
        ir.exa[76] = -741274199;
        ir.exa[77] = -1209780167;
        ir.exa[78] = -1339843325;
        ir.exa[79] = 1396731939;
        ir.exa[80] = 1909061311;
        ir.exa[81] = -1257071521;
        ir.exa[82] = -195221534;
        ir.exa[83] = -2041396762;
        ir.exa[84] = -969136518;
        ir.exa[85] = -1860546105;
        ir.exa[86] = 1032482195;
        ir.exa[87] = 1071673730;
        ir.exa[88] = 1219576909;
        ir.exa[89] = -1470943940;
        ir.exa[90] = -393664992;
        ir.exa[91] = 294598562;
        ir.exa[92] = -819742645;
        ir.exa[93] = -410504085;
        ir.exa[94] = -162252546;
        ir.exa[95] = 27567577;
        ir.exa[96] = -1216844088;
        ir.exa[97] = 1841644214;
        ir.exa[98] = 2115593035;
        ir.exa[99] = -800126577;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isMoving() {
        v0 /* !! */  = ir.z;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - ir.eww("fbx", ewt(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1664241055: {
                    v1 = ir.eww("fby", ewt(int ), (int)21);
                    continue block21;
                }
                case -1331857610: {
                    v1 = ir.eww("fbz", ewt(int ), (int)22);
                    continue block21;
                }
                case -798373726: {
                    break block21;
                }
                case -602290624: {
                    v1 = ir.eww("fca", ewt(int ), (int)23);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ir.c;
        v2 /* !! */  = ir.z;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ir.eww("fcb", ewt(int ), (int)24));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1963959310: {
                    v3 = ir.eww("fcc", ewt(int ), (int)25);
                    continue block22;
                }
                case -798373726: {
                    break block22;
                }
                case 1919532488: {
                    v3 = ir.eww("fcd", ewt(int ), (int)26);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ir.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ir.z - ir.eww("fce", ewt(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ir.eww("fcf", ewy(int ), (int)106)) break;
            v4 /* !! */  = (long)ir.eww("fcg", ewy(int ), (int)107);
        }
        var1_3 = ir.a;
        if (var3_1) {
            throw null;
lbl41:
            // 4 sources

            return (boolean)ir.eww("fch", ewy(int ), (int)108);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ir.z - ir.eww("fci", ewt(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ir.eww("fcj", ewy(int ), (int)109)) break;
                    v5 /* !! */  = (long)ir.eww("fck", ewy(int ), (int)110);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ir.z - ir.eww("fcl", ewt(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ir.eww("fcm", ewy(int ), (int)111)) break;
                    v6 /* !! */  = (long)ir.eww("fcn", ewy(int ), (int)112);
                }
                if (!(this.smoothedVelocity.method_37268() > ir.eww("fco", exm(int ), (int)30))) ** GOTO lbl66
                if (var1_3) ** GOTO lbl41
                v7 = ir.eww("fcp", ewy(int ), (int)113);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl69
lbl66:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = ir.eww("fcq", ewy(int ), (int)114);
lbl69:
                // 2 sources

                return (boolean)v7;
            }
lbl70:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ir.eww("fcr", ewy(int ), (int)115);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ir.eww("fcs", ewy(int ), (int)116);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl80:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ir.eww("fct", ewy(int ), (int)117);
                if (!var3_1) break;
                throw null;
            }
lbl84:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ir.eww("fcu", ewy(int ), (int)118);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ir.eww("fcv", ewy(int ), (int)119);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ir.eww("fcw", ewy(int ), (int)120);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl96:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ir.eww("fcx", ewy(int ), (int)121);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ir.eww("fcy", ewy(int ), (int)122);
        ** while (!var3_1)
lbl103:
        // 1 sources

        throw null;
    }
}

