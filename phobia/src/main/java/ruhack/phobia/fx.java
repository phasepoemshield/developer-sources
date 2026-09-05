/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import com.adl.nativeprotect.NativeLoader;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import java.util.function.Supplier;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.pr;

public class fx
extends ds {
    private final pr timer;
    private int tickCounter;
    private final kf mode;
    private static long[] jiaj;
    private boolean isMoving;
    private static long[] jiak;
    private final kg funtimeSpeed;
    public static final boolean a;
    protected static final long rn = 1318779096201129223L;
    private final float melonBallSpeed = 0.44f;
    public static final boolean c;
    private static int[] jhyi;
    public static final int b;
    private static int[] jhyg;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jipy", jiah(int ), (int)103)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fx.jhyj("jipz", jhyp(int ), (int)139)) break;
            v0 /* !! */  = (long)fx.jhyj("jiqb", jhyp(int ), (int)140);
        }
        var3_1 = fx.c;
        v1 /* !! */  = fx.rn;
        if (true) ** GOTO lbl11
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - fx.jhyj("jiqd", jiah(int ), (int)104));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1970556035: {
                    v2 = fx.jhyj("jiqe", jiah(int ), (int)105);
                    continue block13;
                }
                case -1509207145: {
                    v2 = fx.jhyj("jiqg", jiah(int ), (int)106);
                    continue block13;
                }
                case -1047156311: {
                    v2 = fx.jhyj("jiqh", jiah(int ), (int)107);
                    continue block13;
                }
                case -834179833: {
                    break block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = fx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fx.rn - fx.jhyj("jiqj", jiah(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fx.jhyj("jiql", jhyp(int ), (int)141)) break;
            v3 /* !! */  = (long)fx.jhyj("jiqm", jhyp(int ), (int)142);
        }
        var1_3 = fx.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fx.rn - fx.jhyj("jiqp", jiah(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fx.jhyj("jiqr", jhyp(int ), (int)143)) break;
                    v4 /* !! */  = (long)fx.jhyj("jiqt", jhyp(int ), (int)144);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fx.rn - fx.jhyj("jiqu", jiah(int ), (int)110)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fx.jhyj("jiqw", jhyp(int ), (int)145)) break;
                    v5 /* !! */  = (long)fx.jhyj("jiqz", jhyp(int ), (int)146);
                }
                v6 = this.mode.isSelected("FunTime New");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = fx.rn - fx.jhyj("jirb", jiah(int ), (int)111)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fx.jhyj("jird", jhyp(int ), (int)147)) break;
                    v7 /* !! */  = (long)fx.jhyj("jire", jhyp(int ), (int)148);
                }
                return v6;
            }
lbl55:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)fx.jhyj("jirg", jhyp(int ), (int)149);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)fx.jhyj("jiri", jhyp(int ), (int)150);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fx.jhyj("jirk", jhyp(int ), (int)151);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fx.jhyj("jirl", jhyp(int ), (int)152);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fx() {
        var2_1 /* !! */  = fx.b;
        super("Jesus", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0443 \u0445\u043e\u0434\u0438\u0442\u044c \u043f\u043e \u0432\u043e\u0434\u0435", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u043f\u0435\u0440\u0435\u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u043f\u043e \u0432\u043e\u0434\u0435", "Matrix", new String[]{"Matrix", "MetaHVH", "FunTime New"});
        this.funtimeSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c FT", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0435\u0440\u0435\u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u043f\u043e \u0432\u043e\u0434\u0435", (float)fx.jhyj("jhyl", jhye(int ), (int)0)).range((float)fx.jhyj("jhym", jhye(int ), (int)1), (float)fx.jhyj("jhyo", jhye(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((fx)this));
        this.timer = new pr();
        this.tickCounter = (int)fx.jhyj("jhyr", jhyp(int ), (int)3);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.melonBallSpeed = (float)fx.jhyj("jhys", jhye(int ), (int)4);
                this.settings(new jx[]{this.mode, this.funtimeSpeed});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fx.jhyj("jhyu", jhyp(int ), (int)5);
                ** GOTO lbl31
            }
lbl16:
            // 2 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)fx.jhyj("jhyv", jhyp(int ), (int)6);
                }
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)fx.jhyj("jhyx", jhyp(int ), (int)7);
                }
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)fx.jhyj("jhyy", jhyp(int ), (int)8);
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)fx.jhyj("jhyz", jhyp(int ), (int)9);
                break;
            }
lbl31:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fx.jhyj("jhzb", jhyp(int ), (int)10);
                    break block0;
                    break;
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)fx.jhyj("jhzc", jhyp(int ), (int)11);
                ** GOTO lbl31
            }
            case 7: {
                var2_1 /* !! */  = (int)fx.jhyj("jhzd", jhyp(int ), (int)12);
                ** GOTO lbl16
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)fx.jhyj("jhzf", jhyp(int ), (int)13);
        ** while (true)
    }

    private static /* synthetic */ void jisg() {
        fx.jhyi[100] = 1943458469;
        fx.jhyi[101] = -1135178362;
        fx.jhyi[102] = 824259599;
        fx.jhyi[103] = -853539453;
        fx.jhyi[104] = -1289790680;
        fx.jhyi[105] = 1215498305;
        fx.jhyi[106] = 1376483090;
        fx.jhyi[107] = -760966308;
        fx.jhyi[108] = -1355017969;
        fx.jhyi[109] = 578436718;
        fx.jhyi[110] = -622701365;
        fx.jhyi[111] = 1475733875;
        fx.jhyi[112] = -732169849;
        fx.jhyi[113] = -1904744475;
        fx.jhyi[114] = 1077333684;
        fx.jhyi[115] = -766494757;
        fx.jhyi[116] = 1656576838;
        fx.jhyi[117] = 214981732;
        fx.jhyi[118] = 344220117;
        fx.jhyi[119] = 2141182228;
        fx.jhyi[120] = -1812083041;
        fx.jhyi[121] = 852358008;
        fx.jhyi[122] = 1688924238;
        fx.jhyi[123] = 335616679;
        fx.jhyi[124] = 1915222137;
        fx.jhyi[125] = -1296260864;
        fx.jhyi[126] = 2111342563;
        fx.jhyi[127] = 2000802924;
        fx.jhyi[128] = 1792551460;
        fx.jhyi[129] = -1856095895;
        fx.jhyi[130] = 952730447;
        fx.jhyi[131] = 55441494;
        fx.jhyi[132] = -446226806;
        fx.jhyi[133] = -1102525808;
        fx.jhyi[134] = -1964867133;
        fx.jhyi[135] = 1287401132;
        fx.jhyi[136] = 1228422206;
        fx.jhyi[137] = 2144486249;
        fx.jhyi[138] = 1339385060;
        fx.jhyi[139] = 1070256162;
        fx.jhyi[140] = -549717660;
        fx.jhyi[141] = -685261350;
        fx.jhyi[142] = 879795122;
        fx.jhyi[143] = -553781374;
        fx.jhyi[144] = 2129517582;
        fx.jhyi[145] = 193255103;
        fx.jhyi[146] = 255454797;
        fx.jhyi[147] = 1636803859;
        fx.jhyi[148] = -1008788697;
        fx.jhyi[149] = 2055960680;
        fx.jhyi[150] = -858609611;
        fx.jhyi[151] = 1938835624;
        fx.jhyi[152] = -1725672109;
    }

    private static /* synthetic */ void jisk() {
        fx.jiaj[0] = 2471393484953711590L;
        fx.jiaj[1] = 1703789720450983987L;
        fx.jiaj[2] = 8783086024758182811L;
        fx.jiaj[3] = 8336934551223102699L;
        fx.jiaj[4] = 6537918539981212257L;
        fx.jiaj[5] = 7177999867617718518L;
        fx.jiaj[6] = -5616966224064534829L;
        fx.jiaj[7] = -461429030126841876L;
        fx.jiaj[8] = -1798351581858265335L;
        fx.jiaj[9] = 1880227758561430495L;
        fx.jiaj[10] = 8654046460020738505L;
        fx.jiaj[11] = -4632400881238768192L;
        fx.jiaj[12] = 3336389290922817247L;
        fx.jiaj[13] = 789799393576093783L;
        fx.jiaj[14] = -910882332581883081L;
        fx.jiaj[15] = -8650141773049627196L;
        fx.jiaj[16] = 7137434262650330766L;
        fx.jiaj[17] = -3119858313286008054L;
        fx.jiaj[18] = 1663387684971861417L;
        fx.jiaj[19] = 8233842360761278159L;
        fx.jiaj[20] = -5991901274909693364L;
        fx.jiaj[21] = 8173652733328095007L;
        fx.jiaj[22] = -366927467242395902L;
        fx.jiaj[23] = 4903172879291430062L;
        fx.jiaj[24] = 5562549135172133259L;
        fx.jiaj[25] = -821643872718381351L;
        fx.jiaj[26] = 194180934762368190L;
        fx.jiaj[27] = 3466215994656209281L;
        fx.jiaj[28] = 6768882680708643768L;
        fx.jiaj[29] = 1685689413145078495L;
        fx.jiaj[30] = 1902550487403831551L;
        fx.jiaj[31] = -1137515144080902452L;
        fx.jiaj[32] = 7906084208662980717L;
        fx.jiaj[33] = -1083011685925828059L;
        fx.jiaj[34] = 874229805487634616L;
        fx.jiaj[35] = -3450118450125041519L;
        fx.jiaj[36] = 7323000354627329525L;
        fx.jiaj[37] = -1788592666507012843L;
        fx.jiaj[38] = 7056884199054662446L;
        fx.jiaj[39] = 2381787620149290121L;
        fx.jiaj[40] = -2478909525042515975L;
        fx.jiaj[41] = -6059274903083040754L;
        fx.jiaj[42] = 4201729938280584155L;
        fx.jiaj[43] = 1880160356320135187L;
        fx.jiaj[44] = -3369786414567718923L;
        fx.jiaj[45] = -4965919870096497241L;
        fx.jiaj[46] = 4225787680124151722L;
        fx.jiaj[47] = 3465723208814409737L;
        fx.jiaj[48] = -2213999352754284515L;
        fx.jiaj[49] = -4213634151082019611L;
        fx.jiaj[50] = -4589076124358733770L;
        fx.jiaj[51] = 8280308404658325935L;
        fx.jiaj[52] = 1036572858587340227L;
        fx.jiaj[53] = -3376031731609160007L;
        fx.jiaj[54] = 2071290723027936918L;
        fx.jiaj[55] = 4795629847178707880L;
        fx.jiaj[56] = 3063538980919428931L;
        fx.jiaj[57] = -2591372710517104344L;
        fx.jiaj[58] = 700356996706146076L;
        fx.jiaj[59] = 6661986963435116278L;
        fx.jiaj[60] = 3694706156670611778L;
        fx.jiaj[61] = 5666773986338643679L;
        fx.jiaj[62] = 2947925636288071514L;
        fx.jiaj[63] = 4631997022793804856L;
        fx.jiaj[64] = -6414533206507716076L;
        fx.jiaj[65] = 980685568448769068L;
        fx.jiaj[66] = -4868991263705289798L;
        fx.jiaj[67] = -7574243051949342799L;
        fx.jiaj[68] = -2504423656093341868L;
        fx.jiaj[69] = -450914828478038638L;
        fx.jiaj[70] = 5862980766399091955L;
        fx.jiaj[71] = 2810785974978261170L;
        fx.jiaj[72] = -8857083158062775854L;
        fx.jiaj[73] = 3351203334562202425L;
        fx.jiaj[74] = -8658869583191263966L;
        fx.jiaj[75] = -8449587311912635659L;
        fx.jiaj[76] = -1665773269357909755L;
        fx.jiaj[77] = 2928937622190609806L;
        fx.jiaj[78] = 7209256170144326828L;
        fx.jiaj[79] = -6574220926105613595L;
        fx.jiaj[80] = 8993332004435020977L;
        fx.jiaj[81] = 2504711071963380436L;
        fx.jiaj[82] = 5750465702869808110L;
        fx.jiaj[83] = 6897969263583382540L;
        fx.jiaj[84] = 6985442060175697049L;
        fx.jiaj[85] = 6341239057236293870L;
        fx.jiaj[86] = -1278916972089288168L;
        fx.jiaj[87] = -298598124086543443L;
        fx.jiaj[88] = 1786425086199893240L;
        fx.jiaj[89] = 1900915801512932570L;
        fx.jiaj[90] = -1033291408068740196L;
        fx.jiaj[91] = -3013023851440663525L;
        fx.jiaj[92] = -8484281109933617375L;
        fx.jiaj[93] = 4807440188084072440L;
        fx.jiaj[94] = 757556225933424857L;
        fx.jiaj[95] = 8626293963043635774L;
        fx.jiaj[96] = -5846288694795746791L;
        fx.jiaj[97] = 1779687586402814450L;
        fx.jiaj[98] = 8924081785267412202L;
        fx.jiaj[99] = -2673290992847483352L;
    }

    private static /* synthetic */ void jist() {
        fx.jiaj[100] = -6008444777949316439L;
        fx.jiaj[101] = -1293851949083108303L;
        fx.jiaj[102] = -1884115594769363084L;
        fx.jiaj[103] = 1932646897848655170L;
        fx.jiaj[104] = 5766456350322775733L;
        fx.jiaj[105] = -2678922177045197595L;
        fx.jiaj[106] = 3223896525381653694L;
        fx.jiaj[107] = -7427883003807800867L;
        fx.jiaj[108] = -840884493523992296L;
        fx.jiaj[109] = -4041530140487629568L;
        fx.jiaj[110] = 4544580937811361014L;
        fx.jiaj[111] = 4447693870207510675L;
    }

    private static /* synthetic */ void jisa() {
        fx.jhyi[0] = -1666061984;
        fx.jhyi[1] = 1761546239;
        fx.jhyi[2] = -746325059;
        fx.jhyi[3] = -2102290198;
        fx.jhyi[4] = -1062793480;
        fx.jhyi[5] = 1121443567;
        fx.jhyi[6] = 1958777750;
        fx.jhyi[7] = 1317043901;
        fx.jhyi[8] = 1470732085;
        fx.jhyi[9] = -219441401;
        fx.jhyi[10] = -1770978844;
        fx.jhyi[11] = 340602237;
        fx.jhyi[12] = 565729842;
        fx.jhyi[13] = 362174827;
        fx.jhyi[14] = -880126686;
        fx.jhyi[15] = -1208246492;
        fx.jhyi[16] = 1398057237;
        fx.jhyi[17] = 2070131394;
        fx.jhyi[18] = -1002106041;
        fx.jhyi[19] = -953492010;
        fx.jhyi[20] = -1132815298;
        fx.jhyi[21] = -1637491123;
        fx.jhyi[22] = -868164217;
        fx.jhyi[23] = 1629509069;
        fx.jhyi[24] = -794211215;
        fx.jhyi[25] = -2010332832;
        fx.jhyi[26] = 125875666;
        fx.jhyi[27] = -391863548;
        fx.jhyi[28] = -1031493746;
        fx.jhyi[29] = 2022803545;
        fx.jhyi[30] = -777954124;
        fx.jhyi[31] = 1900323065;
        fx.jhyi[32] = 556631596;
        fx.jhyi[33] = -1311619104;
        fx.jhyi[34] = -1853768070;
        fx.jhyi[35] = -976623459;
        fx.jhyi[36] = 1134877747;
        fx.jhyi[37] = -562097117;
        fx.jhyi[38] = -658530699;
        fx.jhyi[39] = 1462457493;
        fx.jhyi[40] = 2010276435;
        fx.jhyi[41] = 1785923912;
        fx.jhyi[42] = 540410948;
        fx.jhyi[43] = 1181151330;
        fx.jhyi[44] = 1385260478;
        fx.jhyi[45] = -1962269598;
        fx.jhyi[46] = 332290645;
        fx.jhyi[47] = 609943908;
        fx.jhyi[48] = 40579217;
        fx.jhyi[49] = -1835318241;
        fx.jhyi[50] = -1542353247;
        fx.jhyi[51] = 1129771278;
        fx.jhyi[52] = 1487022884;
        fx.jhyi[53] = 2094832414;
        fx.jhyi[54] = 1671907647;
        fx.jhyi[55] = -279891060;
        fx.jhyi[56] = 762225818;
        fx.jhyi[57] = 743114977;
        fx.jhyi[58] = 957276404;
        fx.jhyi[59] = 823529768;
        fx.jhyi[60] = -469079434;
        fx.jhyi[61] = 565746644;
        fx.jhyi[62] = -489926935;
        fx.jhyi[63] = 978264559;
        fx.jhyi[64] = 1445315956;
        fx.jhyi[65] = -1011699827;
        fx.jhyi[66] = -71030371;
        fx.jhyi[67] = -720085100;
        fx.jhyi[68] = -521212010;
        fx.jhyi[69] = -785044652;
        fx.jhyi[70] = -177743076;
        fx.jhyi[71] = -1318981229;
        fx.jhyi[72] = -1630382212;
        fx.jhyi[73] = -1636522778;
        fx.jhyi[74] = -1716353423;
        fx.jhyi[75] = 316413849;
        fx.jhyi[76] = 883639544;
        fx.jhyi[77] = 920742774;
        fx.jhyi[78] = 18939704;
        fx.jhyi[79] = 2002602340;
        fx.jhyi[80] = 1550545447;
        fx.jhyi[81] = -1730037872;
        fx.jhyi[82] = 1344939599;
        fx.jhyi[83] = -1098464661;
        fx.jhyi[84] = 49539624;
        fx.jhyi[85] = 322675073;
        fx.jhyi[86] = -1033088978;
        fx.jhyi[87] = 683518175;
        fx.jhyi[88] = -422494042;
        fx.jhyi[89] = 1181692572;
        fx.jhyi[90] = -1267758474;
        fx.jhyi[91] = -1475261419;
        fx.jhyi[92] = 1362030289;
        fx.jhyi[93] = 2132246845;
        fx.jhyi[94] = 1894142205;
        fx.jhyi[95] = 2045359133;
        fx.jhyi[96] = -456782306;
        fx.jhyi[97] = -1999454942;
        fx.jhyi[98] = 293788954;
        fx.jhyi[99] = -1602962489;
    }

    private native void handleMetaHVHMode();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getMelonBallSpeed() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jios", jiah(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fx.jhyj("jiou", jhyp(int ), (int)128)) break;
            v0 /* !! */  = (long)fx.jhyj("jiov", jhyp(int ), (int)129);
        }
        var3_1 = fx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fx.rn - fx.jhyj("jiow", jiah(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fx.jhyj("jioy", jhyp(int ), (int)130)) break;
            v1 /* !! */  = (long)fx.jhyj("jioz", jhyp(int ), (int)131);
        }
        var2_2 = fx.b;
        v2 /* !! */  = fx.rn;
        if (true) ** GOTO lbl19
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - fx.jhyj("jipb", jiah(int ), (int)98));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1086176468: {
                    v3 = fx.jhyj("jipc", jiah(int ), (int)99);
                    continue block11;
                }
                case -834179833: {
                    break block11;
                }
                case 1104526200: {
                    v3 = fx.jhyj("jipe", jiah(int ), (int)100);
                    continue block11;
                }
            }
            break;
        }
        var1_3 = fx.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (float)fx.jhyj("jipf", jhye(int ), (int)132);
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        v4 /* !! */  = fx.rn;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(fx.jhyj("jiph", jiah(int ), (int)102) - fx.jhyj("jipg", jiah(int ), (int)101));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -834179833: {
                    break block13;
                }
                case 1184028181: {
                    continue block13;
                }
            }
            break;
        }
        Objects.requireNonNull(this);
        if (!var1_3) ** break;
        ** while (true)
        return (float)fx.jhyj("jipi", jhye(int ), (int)133);
    }

    private static /* synthetic */ int jhyp(int n2) {
        return jhyg[n2] ^ jhyi[n2];
    }

    private static /* synthetic */ void jisz() {
        fx.jiak[100] = -3985176752489215123L;
        fx.jiak[101] = -1624763871941352683L;
        fx.jiak[102] = 2629027814647660283L;
        fx.jiak[103] = 422879590193510938L;
        fx.jiak[104] = 4015736656017567177L;
        fx.jiak[105] = 1497132431682950391L;
        fx.jiak[106] = -5436350874996508180L;
        fx.jiak[107] = -3129857923185789656L;
        fx.jiak[108] = 2656471517564982718L;
        fx.jiak[109] = -4306318821999725684L;
        fx.jiak[110] = 616686476807543396L;
        fx.jiak[111] = -6826177556739627252L;
    }

    private static /* synthetic */ long jiah(int n2) {
        return jiaj[n2] ^ jiak[n2];
    }

    private static /* synthetic */ float jhye(int n2) {
        return Float.intBitsToFloat(jhyg[n2] ^ jhyi[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getTickCounter() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = fx.rn - fx.jhyj("jinm", jiah(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fx.jhyj("jinn", jhyp(int ), (int)119)) break;
            v0 /* !! */  = (long)fx.jhyj("jinp", jhyp(int ), (int)120);
        }
        var3_1 = fx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = fx.rn - fx.jhyj("jinq", jiah(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fx.jhyj("jins", jhyp(int ), (int)121)) break;
            v1 /* !! */  = (long)fx.jhyj("jinu", jhyp(int ), (int)122);
        }
        var2_2 /* !! */  = fx.b;
        v2 /* !! */  = fx.rn;
        block18: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -834179833: {
                    break block18;
                }
                case -9422220: {
                    v2 /* !! */  = (long)(fx.jhyj("jinx", jiah(int ), (int)91) - fx.jhyj("jinv", jiah(int ), (int)90));
                    continue block18;
                }
            }
            break;
        }
        var1_3 = fx.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (int)fx.jhyj("jinz", jhyp(int ), (int)123);
                    if (var1_3 != false) return (int)fx.jhyj("jinz", jhyp(int ), (int)123);
                    v3 /* !! */  = fx.rn;
                    block20: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -1367863752: {
                                v4 = fx.jhyj("jiod", jiah(int ), (int)93);
                                ** GOTO lbl44
                            }
                            case -852673130: {
                                v4 = fx.jhyj("jioe", jiah(int ), (int)94);
                                ** GOTO lbl44
                            }
                            case -834179833: {
                                return this.tickCounter;
                            }
                            case 887783038: {
                                v4 = fx.jhyj("jiog", jiah(int ), (int)95);
lbl44:
                                // 3 sources

                                v3 /* !! */  = (long)(v4 - fx.jhyj("jiob", jiah(int ), (int)92));
                                continue block20;
                            }
                        }
                        break;
                    }
                    return this.tickCounter;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)fx.jhyj("jiol", jhyp(int ), (int)126);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)fx.jhyj("jion", jhyp(int ), (int)127);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)fx.jhyj("jioi", jhyp(int ), (int)124);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl65
            break;
        }
        do {
            if (true) ** continue;
lbl65:
            // 2 sources

            var2_2 /* !! */  = (int)fx.jhyj("jiok", jhyp(int ), (int)125);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ double jihd(int n2) {
        return Double.longBitsToDouble(jiaj[n2] ^ jiak[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getMode() {
        v0 /* !! */  = fx.rn;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - fx.jhyj("jiiu", jiah(int ), (int)46));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -834179833: {
                    break block24;
                }
                case -367928748: {
                    v1 = fx.jhyj("jiiv", jiah(int ), (int)47);
                    continue block24;
                }
                case 384871173: {
                    v1 = fx.jhyj("jiiy", jiah(int ), (int)48);
                    continue block24;
                }
                case 1461803753: {
                    v1 = fx.jhyj("jiiz", jiah(int ), (int)49);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = fx.c;
        v2 /* !! */  = fx.rn;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - fx.jhyj("jijb", jiah(int ), (int)50));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2122257974: {
                    v3 = fx.jhyj("jijc", jiah(int ), (int)51);
                    continue block25;
                }
                case -834179833: {
                    break block25;
                }
                case 1035412920: {
                    v3 = fx.jhyj("jije", jiah(int ), (int)52);
                    continue block25;
                }
                case 1214926844: {
                    v3 = fx.jhyj("jijf", jiah(int ), (int)53);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = fx.b;
        v4 /* !! */  = fx.rn;
        if (true) ** GOTO lbl39
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - fx.jhyj("jijg", jiah(int ), (int)54));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1619300382: {
                    v5 = fx.jhyj("jijh", jiah(int ), (int)55);
                    continue block26;
                }
                case -834179833: {
                    break block26;
                }
                case -805072210: {
                    v5 = fx.jhyj("jiji", jiah(int ), (int)56);
                    continue block26;
                }
                case 1396991920: {
                    v5 = fx.jhyj("jijk", jiah(int ), (int)57);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = fx.a;
        if (var3_1) {
            throw null;
lbl54:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl57:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jijm", jiah(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fx.jhyj("jijn", jhyp(int ), (int)92)) break;
                    v6 /* !! */  = (long)fx.jhyj("jijo", jhyp(int ), (int)93);
                }
                return this.mode;
            }
lbl67:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fx.jhyj("jijp", jhyp(int ), (int)94);
                if (var3_1) {
                    throw null;
                }
            }
lbl71:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)fx.jhyj("jijr", jhyp(int ), (int)95);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fx.jhyj("jiju", jhyp(int ), (int)96);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fx.jhyj("jijw", jhyp(int ), (int)97);
        } while (!var3_1);
        throw null;
    }

    private native void handleMatrixMode();

    public static /* synthetic */ CallSite jhyj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isMoving() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = rn - fx.jhyj("jimg", jiah(int ), (int)80)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == fx.jhyj("jimi", jhyp(int ), (int)110)) break;
            object = fx.jhyj("jimj", jhyp(int ), (int)111);
        }
        boolean bl2 = c;
        Object object = rn;
        block11: while (true) {
            switch ((int)object) {
                case -834179833: {
                    break block11;
                }
                case 1790123665: {
                    object = fx.jhyj("jimn", jiah(int ), (int)82) - fx.jhyj("jiml", jiah(int ), (int)81);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = rn;
        boolean bl3 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - fx.jhyj("jimp", jiah(int ), (int)83);
            }
            switch ((int)object2) {
                case -834179833: {
                    break block12;
                }
                case 194171120: {
                    callSite = fx.jhyj("jimr", jiah(int ), (int)84);
                    continue block12;
                }
                case 1523770031: {
                    callSite = fx.jhyj("jims", jiah(int ), (int)85);
                    continue block12;
                }
                case 1901604448: {
                    callSite = fx.jhyj("jimu", jiah(int ), (int)86);
                    continue block12;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return (boolean)fx.jhyj("jimw", jhyp(int ), (int)112);
        if (bl4) return (boolean)fx.jhyj("jimw", jhyp(int ), (int)112);
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = rn - fx.jhyj("jimy", jiah(int ), (int)87)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == fx.jhyj("jina", jhyp(int ), (int)113)) {
                return this.isMoving;
            }
            object3 = fx.jhyj("jinc", jhyp(int ), (int)114);
        }
    }

    private native void handleFunTimeNewMode();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getFuntimeSpeed() {
        v0 /* !! */  = fx.rn;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - fx.jhyj("jika", jiah(int ), (int)59));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -834179833: {
                    break block20;
                }
                case 143570294: {
                    v1 = fx.jhyj("jikb", jiah(int ), (int)60);
                    continue block20;
                }
                case 1577637758: {
                    v1 = fx.jhyj("jikc", jiah(int ), (int)61);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = fx.c;
        v2 /* !! */  = fx.rn;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - fx.jhyj("jike", jiah(int ), (int)62));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -834179833: {
                    break block21;
                }
                case 124390370: {
                    v3 = fx.jhyj("jikf", jiah(int ), (int)63);
                    continue block21;
                }
                case 1219971462: {
                    v3 = fx.jhyj("jikg", jiah(int ), (int)64);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = fx.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jikh", jiah(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fx.jhyj("jiki", jhyp(int ), (int)98)) break;
                    v4 /* !! */  = (long)fx.jhyj("jikj", jhyp(int ), (int)99);
                }
                var1_3 = fx.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = fx.rn;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v5 /* !! */  = (long)(fx.jhyj("jikl", jiah(int ), (int)67) - fx.jhyj("jikk", jiah(int ), (int)66));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -834179833: {
                            break block24;
                        }
                        case 2007607360: {
                            continue block24;
                        }
                    }
                    break;
                }
                return this.funtimeSpeed;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)fx.jhyj("jikn", jhyp(int ), (int)100);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fx.jhyj("jikp", jhyp(int ), (int)101);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fx.jhyj("jikr", jhyp(int ), (int)102);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fx.jhyj("jikt", jhyp(int ), (int)103);
        } while (!var3_1);
        throw null;
    }

    static {
        NativeLoader.ensureNativeClassInitialized("nativo4ka", "ruhack/phobia/fx", fx.class);
        jhyg = new int[153];
        jhyi = new int[153];
        fx.jirp();
        fx.jirw();
        fx.jisa();
        fx.jisg();
        jiaj = new long[112];
        jiak = new long[112];
        fx.jisk();
        fx.jist();
        fx.jisv();
        fx.jisz();
    }

    private static /* synthetic */ void jirw() {
        fx.jhyg[100] = 1943458469;
        fx.jhyg[101] = -1135178361;
        fx.jhyg[102] = 824259598;
        fx.jhyg[103] = -853539453;
        fx.jhyg[104] = 1289790679;
        fx.jhyg[105] = 1736236071;
        fx.jhyg[106] = 1376483090;
        fx.jhyg[107] = -760966306;
        fx.jhyg[108] = -1355017969;
        fx.jhyg[109] = 578436719;
        fx.jhyg[110] = -622701366;
        fx.jhyg[111] = -699780088;
        fx.jhyg[112] = -732169849;
        fx.jhyg[113] = -1904744476;
        fx.jhyg[114] = 444014190;
        fx.jhyg[115] = -766494760;
        fx.jhyg[116] = 1656576836;
        fx.jhyg[117] = 214981733;
        fx.jhyg[118] = 344220119;
        fx.jhyg[119] = 2141182229;
        fx.jhyg[120] = 1365301036;
        fx.jhyg[121] = 852358009;
        fx.jhyg[122] = -1326282282;
        fx.jhyg[123] = 40391414;
        fx.jhyg[124] = 1915222138;
        fx.jhyg[125] = -1296260861;
        fx.jhyg[126] = 2111342560;
        fx.jhyg[127] = 2000802927;
        fx.jhyg[128] = -1792551461;
        fx.jhyg[129] = 751323179;
        fx.jhyg[130] = 952730446;
        fx.jhyg[131] = 1749547575;
        fx.jhyg[132] = -634275470;
        fx.jhyg[133] = -2136371906;
        fx.jhyg[134] = -1964867133;
        fx.jhyg[135] = 1287401133;
        fx.jhyg[136] = 1228422206;
        fx.jhyg[137] = 2144486253;
        fx.jhyg[138] = 1339385056;
        fx.jhyg[139] = -1070256163;
        fx.jhyg[140] = -1062515702;
        fx.jhyg[141] = -685261349;
        fx.jhyg[142] = 573356173;
        fx.jhyg[143] = -553781373;
        fx.jhyg[144] = 421511574;
        fx.jhyg[145] = -193255104;
        fx.jhyg[146] = -1489309045;
        fx.jhyg[147] = 1636803858;
        fx.jhyg[148] = 2126536761;
        fx.jhyg[149] = 2055960683;
        fx.jhyg[150] = -858609611;
        fx.jhyg[151] = 1938835625;
        fx.jhyg[152] = -1725672109;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = fx.rn;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - fx.jhyj("jiam", jiah(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2074053509: {
                    v1 = fx.jhyj("jiao", jiah(int ), (int)1);
                    continue block18;
                }
                case -1030560592: {
                    v1 = fx.jhyj("jiap", jiah(int ), (int)2);
                    continue block18;
                }
                case -834179833: {
                    break block18;
                }
                case -279274002: {
                    v1 = fx.jhyj("jiar", jiah(int ), (int)3);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = fx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jiat", jiah(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fx.jhyj("jiav", jhyp(int ), (int)14)) break;
            v2 /* !! */  = (long)fx.jhyj("jiaw", jhyp(int ), (int)15);
        }
        var2_2 /* !! */  = fx.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fx.rn - fx.jhyj("jiay", jiah(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fx.jhyj("jiba", jhyp(int ), (int)16)) break;
                    v3 /* !! */  = (long)fx.jhyj("jibb", jhyp(int ), (int)17);
                }
                var1_3 = fx.a;
                if (var3_1) {
                    throw null;
lbl37:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                v4 = fx.jhyj("jibe", jhyp(int ), (int)18);
                v5 /* !! */  = fx.rn;
                if (true) ** GOTO lbl45
                block22: while (true) {
                    v5 /* !! */  = (long)(fx.jhyj("jibh", jiah(int ), (int)7) - fx.jhyj("jibf", jiah(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -834179833: {
                            break block22;
                        }
                        case -718369695: {
                            continue block22;
                        }
                    }
                    break;
                }
                this.tickCounter = (int)v4;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fx.jhyj("jibj", jhyp(int ), (int)19);
                if (!var3_1) break;
                throw null;
            }
lbl57:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)fx.jhyj("jibl", jhyp(int ), (int)20);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fx.jhyj("jibo", jhyp(int ), (int)21);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fx.jhyj("jibq", jhyp(int ), (int)22);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)fx.jhyj("jibs", jhyp(int ), (int)23);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)fx.jhyj("jibv", jhyp(int ), (int)24);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pr getTimer() {
        v0 /* !! */  = fx.rn;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - fx.jhyj("jikw", jiah(int ), (int)68));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1968666150: {
                    v1 = fx.jhyj("jiky", jiah(int ), (int)69);
                    continue block23;
                }
                case -1778477299: {
                    v1 = fx.jhyj("jikz", jiah(int ), (int)70);
                    continue block23;
                }
                case -834179833: {
                    break block23;
                }
                case 778647120: {
                    v1 = fx.jhyj("jilb", jiah(int ), (int)71);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = fx.c;
        v2 /* !! */  = fx.rn;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - fx.jhyj("jild", jiah(int ), (int)72));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -834179833: {
                    break block24;
                }
                case 725135987: {
                    v3 = fx.jhyj("jile", jiah(int ), (int)73);
                    continue block24;
                }
                case 1928329314: {
                    v3 = fx.jhyj("jilg", jiah(int ), (int)74);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = fx.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jilj", jiah(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fx.jhyj("jilk", jhyp(int ), (int)104)) break;
            v4 /* !! */  = (long)fx.jhyj("jilm", jhyp(int ), (int)105);
        }
        var1_3 = fx.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = fx.rn;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - fx.jhyj("jilp", jiah(int ), (int)76));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -834179833: {
                            break block27;
                        }
                        case -761435003: {
                            v6 = fx.jhyj("jilr", jiah(int ), (int)77);
                            continue block27;
                        }
                        case 1494708679: {
                            v6 = fx.jhyj("jils", jiah(int ), (int)78);
                            continue block27;
                        }
                        case 2049565632: {
                            v6 = fx.jhyj("jilu", jiah(int ), (int)79);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.timer;
            }
            case 0: {
                var2_2 /* !! */  = (int)fx.jhyj("jilw", jhyp(int ), (int)106);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)fx.jhyj("jily", jhyp(int ), (int)107);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fx.jhyj("jima", jhyp(int ), (int)108);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fx.jhyj("jimc", jhyp(int ), (int)109);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void tick(df var1_1) {
        block114: {
            block113: {
                block112: {
                    v0 /* !! */  = fx.rn;
                    if (true) ** GOTO lbl5
                    block69: while (true) {
                        v0 /* !! */  = (long)(v1 - fx.jhyj("jice", jiah(int ), (int)8));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1126111591: {
                                v1 = fx.jhyj("jicf", jiah(int ), (int)9);
                                continue block69;
                            }
                            case -834179833: {
                                break block69;
                            }
                            case 298857843: {
                                v1 = fx.jhyj("jich", jiah(int ), (int)10);
                                continue block69;
                            }
                            case 1854008627: {
                                v1 = fx.jhyj("jicj", jiah(int ), (int)11);
                                continue block69;
                            }
                        }
                        break;
                    }
                    var4_2 = fx.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_0 = fx.rn - fx.jhyj("jicl", jiah(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == fx.jhyj("jicm", jhyp(int ), (int)25)) break;
                        v2 /* !! */  = (long)fx.jhyj("jicn", jhyp(int ), (int)26);
                    }
                    var3_3 /* !! */  = fx.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = fx.rn - fx.jhyj("jicp", jiah(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == fx.jhyj("jicr", jhyp(int ), (int)27)) break;
                        v3 /* !! */  = (long)fx.jhyj("jics", jhyp(int ), (int)28);
                    }
                    var2_4 = fx.a;
                    if (var4_2) {
                        throw null;
lbl32:
                        // 14 sources

                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl32
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = fx.rn - fx.jhyj("jicu", jiah(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == fx.jhyj("jicv", jhyp(int ), (int)29)) break;
                        v4 /* !! */  = (long)fx.jhyj("jicw", jhyp(int ), (int)30);
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = fx.rn - fx.jhyj("jicx", jiah(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == fx.jhyj("jicy", jhyp(int ), (int)31)) break;
                        v5 /* !! */  = (long)fx.jhyj("jicz", jhyp(int ), (int)32);
                    }
                    if (fx.mc.field_1724 == null) break block112;
                    if (var2_4) ** GOTO lbl32
                    v6 /* !! */  = fx.rn;
                    if (true) ** GOTO lbl51
                    block75: while (true) {
                        v6 /* !! */  = (long)(fx.jhyj("jidb", jiah(int ), (int)17) - fx.jhyj("jida", jiah(int ), (int)16));
lbl51:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1361432598: {
                                continue block75;
                            }
                            case -834179833: {
                                break block75;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = fx.rn;
                    if (true) ** GOTO lbl60
                    block76: while (true) {
                        v7 /* !! */  = (long)(v8 - fx.jhyj("jidc", jiah(int ), (int)18));
lbl60:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1805788073: {
                                v8 = fx.jhyj("jidd", jiah(int ), (int)19);
                                continue block76;
                            }
                            case -834179833: {
                                break block76;
                            }
                            case 590790010: {
                                v8 = fx.jhyj("jide", jiah(int ), (int)20);
                                continue block76;
                            }
                        }
                        break;
                    }
                    if (fx.mc.field_1687 != null) break block113;
                    if (var2_4) ** GOTO lbl32
                }
                if (var2_4 || var2_4) ** GOTO lbl32
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl32
            v9 /* !! */  = fx.rn;
            if (true) ** GOTO lbl80
            block77: while (true) {
                v9 /* !! */  = (long)(v10 - fx.jhyj("jidf", jiah(int ), (int)21));
lbl80:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1117826340: {
                        v10 = fx.jhyj("jidg", jiah(int ), (int)22);
                        continue block77;
                    }
                    case -834179833: {
                        break block77;
                    }
                    case -366903573: {
                        v10 = fx.jhyj("jidh", jiah(int ), (int)23);
                        continue block77;
                    }
                    case 781586396: {
                        v10 = fx.jhyj("jido", jiah(int ), (int)24);
                        continue block77;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = fx.rn - fx.jhyj("jidq", jiah(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == fx.jhyj("jids", jhyp(int ), (int)33)) break;
                v11 /* !! */  = (long)fx.jhyj("jidu", jhyp(int ), (int)34);
            }
            if (!this.mode.isSelected("Matrix")) break block114;
            if (var2_4 || var2_4) ** GOTO lbl32
            v12 /* !! */  = fx.rn;
            if (true) ** GOTO lbl103
            block79: while (true) {
                v12 /* !! */  = (long)(v13 - fx.jhyj("jidw", jiah(int ), (int)26));
lbl103:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1387892729: {
                        v13 = fx.jhyj("jidx", jiah(int ), (int)27);
                        continue block79;
                    }
                    case -1080723483: {
                        v13 = fx.jhyj("jidy", jiah(int ), (int)28);
                        continue block79;
                    }
                    case -834179833: {
                        break block79;
                    }
                    case -152039452: {
                        v13 = fx.jhyj("jiea", jiah(int ), (int)29);
                        continue block79;
                    }
                }
                break;
            }
            this.handleMatrixMode();
            if (var2_4) ** GOTO lbl32
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl183
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v14 /* !! */  = fx.rn;
        if (true) ** GOTO lbl126
        block80: while (true) {
            v14 /* !! */  = (long)(fx.jhyj("jiee", jiah(int ), (int)31) - fx.jhyj("jied", jiah(int ), (int)30));
lbl126:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -834179833: {
                    break block80;
                }
                case 1497812209: {
                    continue block80;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_5 = fx.rn - fx.jhyj("jieg", jiah(int ), (int)32)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == fx.jhyj("jieh", jhyp(int ), (int)35)) break;
            v15 /* !! */  = (long)fx.jhyj("jiej", jhyp(int ), (int)36);
        }
        if (!this.mode.isSelected("MetaHVH")) ** GOTO lbl155
        if (var2_4 || var2_4) ** GOTO lbl32
        v16 /* !! */  = fx.rn;
        if (true) ** GOTO lbl142
        block82: while (true) {
            v16 /* !! */  = (long)(fx.jhyj("jiel", jiah(int ), (int)34) - fx.jhyj("jiek", jiah(int ), (int)33));
lbl142:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -834179833: {
                    break block82;
                }
                case -262593769: {
                    continue block82;
                }
            }
            break;
        }
        this.handleMetaHVHMode();
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl155:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl32
            v17 /* !! */  = fx.rn;
            if (true) ** GOTO lbl160
            block83: while (true) {
                v17 /* !! */  = (long)(v18 - fx.jhyj("jien", jiah(int ), (int)35));
lbl160:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -834179833: {
                        break block83;
                    }
                    case -29442736: {
                        v18 = fx.jhyj("jieo", jiah(int ), (int)36);
                        continue block83;
                    }
                    case 1729006540: {
                        v18 = fx.jhyj("jieq", jiah(int ), (int)37);
                        continue block83;
                    }
                }
                break;
            }
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_6 = fx.rn - fx.jhyj("jies", jiah(int ), (int)38)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == fx.jhyj("jieu", jhyp(int ), (int)37)) break;
                v19 /* !! */  = (long)fx.jhyj("jiew", jhyp(int ), (int)38);
            }
            if (!this.mode.isSelected("FunTime New")) ** GOTO lbl183
            if (var2_4 || var2_4) ** GOTO lbl32
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_7 = fx.rn - fx.jhyj("jiey", jiah(int ), (int)39)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == fx.jhyj("jifa", jhyp(int ), (int)39)) break;
                v20 /* !! */  = (long)fx.jhyj("jifc", jhyp(int ), (int)40);
            }
            this.handleFunTimeNewMode();
            if (var2_4) ** GOTO lbl32
lbl183:
            // 4 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
            case 0: {
                var3_3 /* !! */  = (int)fx.jhyj("jife", jhyp(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl191:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)fx.jhyj("jifg", jhyp(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl196:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fx.jhyj("jifi", jhyp(int ), (int)43);
                if (!var4_2) ** GOTO lbl191
                throw null;
            }
lbl200:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)fx.jhyj("jifk", jhyp(int ), (int)44);
                if (!var4_2) ** GOTO lbl191
                throw null;
            }
lbl204:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)fx.jhyj("jifm", jhyp(int ), (int)45);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 5: {
                var3_3 /* !! */  = (int)fx.jhyj("jifn", jhyp(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl214:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)fx.jhyj("jifo", jhyp(int ), (int)47);
                if (!var4_2) break;
                throw null;
            }
lbl218:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)fx.jhyj("jifq", jhyp(int ), (int)48);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl223:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)fx.jhyj("jifr", jhyp(int ), (int)49);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl228:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)fx.jhyj("jifs", jhyp(int ), (int)50);
                if (!var4_2) ** GOTO lbl214
                throw null;
            }
lbl232:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)fx.jhyj("jift", jhyp(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl237:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)fx.jhyj("jifu", jhyp(int ), (int)52);
                if (!var4_2) ** GOTO lbl218
                throw null;
            }
lbl241:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)fx.jhyj("jifv", jhyp(int ), (int)53);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
lbl245:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)fx.jhyj("jifw", jhyp(int ), (int)54);
                if (!var4_2) ** GOTO lbl214
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)fx.jhyj("jifx", jhyp(int ), (int)55);
                if (!var4_2) ** GOTO lbl237
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)fx.jhyj("jify", jhyp(int ), (int)56);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 16: {
                var3_3 /* !! */  = (int)fx.jhyj("jifz", jhyp(int ), (int)57);
                if (!var4_2) ** GOTO lbl228
                throw null;
            }
lbl262:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)fx.jhyj("jiga", jhyp(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
            }
            case 18: {
                var3_3 /* !! */  = (int)fx.jhyj("jigb", jhyp(int ), (int)59);
                if (!var4_2) ** GOTO lbl218
                throw null;
            }
lbl270:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)fx.jhyj("jigc", jhyp(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 20: {
                var3_3 /* !! */  = (int)fx.jhyj("jigd", jhyp(int ), (int)61);
                if (!var4_2) ** GOTO lbl200
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)fx.jhyj("jige", jhyp(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
            }
lbl283:
            // 4 sources

            case 22: {
                var3_3 /* !! */  = (int)fx.jhyj("jigf", jhyp(int ), (int)63);
                if (!var4_2) ** GOTO lbl241
                throw null;
            }
lbl287:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)fx.jhyj("jigg", jhyp(int ), (int)64);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)fx.jhyj("jigh", jhyp(int ), (int)65);
                if (!var4_2) ** GOTO lbl245
                throw null;
            }
lbl295:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fx.jhyj("jigi", jhyp(int ), (int)66);
                    if (!var4_2) ** GOTO lbl270
                    throw null;
                }
            }
            case 26: 
        }
        var3_3 /* !! */  = (int)fx.jhyj("jigj", jhyp(int ), (int)67);
        ** while (!var4_2)
lbl303:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jirp() {
        fx.jhyg[0] = -1592639894;
        fx.jhyg[1] = 1423759605;
        fx.jhyg[2] = -305186960;
        fx.jhyg[3] = -2102290198;
        fx.jhyg[4] = -28948138;
        fx.jhyg[5] = 1121443566;
        fx.jhyg[6] = 1958777744;
        fx.jhyg[7] = 1317043900;
        fx.jhyg[8] = 1470732081;
        fx.jhyg[9] = -219441402;
        fx.jhyg[10] = -1770978836;
        fx.jhyg[11] = 340602238;
        fx.jhyg[12] = 565729845;
        fx.jhyg[13] = 362174826;
        fx.jhyg[14] = 880126685;
        fx.jhyg[15] = -3126560;
        fx.jhyg[16] = -1398057238;
        fx.jhyg[17] = -777129643;
        fx.jhyg[18] = -1002106041;
        fx.jhyg[19] = -953492012;
        fx.jhyg[20] = -1132815300;
        fx.jhyg[21] = -1637491124;
        fx.jhyg[22] = -868164221;
        fx.jhyg[23] = 1629509065;
        fx.jhyg[24] = -794211214;
        fx.jhyg[25] = -2010332831;
        fx.jhyg[26] = -1321581767;
        fx.jhyg[27] = -391863547;
        fx.jhyg[28] = 66695303;
        fx.jhyg[29] = -2022803546;
        fx.jhyg[30] = 2069127063;
        fx.jhyg[31] = 1900323064;
        fx.jhyg[32] = -490886901;
        fx.jhyg[33] = 1311619103;
        fx.jhyg[34] = -1308064594;
        fx.jhyg[35] = -976623460;
        fx.jhyg[36] = -33776108;
        fx.jhyg[37] = 562097116;
        fx.jhyg[38] = -343173588;
        fx.jhyg[39] = 1462457492;
        fx.jhyg[40] = -2137801195;
        fx.jhyg[41] = 1785923913;
        fx.jhyg[42] = 540410951;
        fx.jhyg[43] = 1181151330;
        fx.jhyg[44] = 1385260452;
        fx.jhyg[45] = -1962269588;
        fx.jhyg[46] = 332290624;
        fx.jhyg[47] = 609943921;
        fx.jhyg[48] = 40579200;
        fx.jhyg[49] = -1835318255;
        fx.jhyg[50] = -1542353227;
        fx.jhyg[51] = 1129771274;
        fx.jhyg[52] = 1487022899;
        fx.jhyg[53] = 2094832394;
        fx.jhyg[54] = 1671907632;
        fx.jhyg[55] = -279891067;
        fx.jhyg[56] = 762225802;
        fx.jhyg[57] = 743114997;
        fx.jhyg[58] = 957276413;
        fx.jhyg[59] = 823529778;
        fx.jhyg[60] = -469079439;
        fx.jhyg[61] = 565746624;
        fx.jhyg[62] = -489926917;
        fx.jhyg[63] = 978264559;
        fx.jhyg[64] = 1445315943;
        fx.jhyg[65] = -1011699839;
        fx.jhyg[66] = -71030373;
        fx.jhyg[67] = -720085093;
        fx.jhyg[68] = -521212012;
        fx.jhyg[69] = -272038513;
        fx.jhyg[70] = -177743074;
        fx.jhyg[71] = -1906280284;
        fx.jhyg[72] = -1630382211;
        fx.jhyg[73] = -1600789688;
        fx.jhyg[74] = -1490307377;
        fx.jhyg[75] = 763727363;
        fx.jhyg[76] = 883639545;
        fx.jhyg[77] = 920742774;
        fx.jhyg[78] = 1070619887;
        fx.jhyg[79] = 2002602342;
        fx.jhyg[80] = 1669009513;
        fx.jhyg[81] = -1730037871;
        fx.jhyg[82] = 1859553864;
        fx.jhyg[83] = -2144423717;
        fx.jhyg[84] = 1035937509;
        fx.jhyg[85] = 322675072;
        fx.jhyg[86] = -1033088978;
        fx.jhyg[87] = 683518174;
        fx.jhyg[88] = -422494044;
        fx.jhyg[89] = 1181692572;
        fx.jhyg[90] = -1267758476;
        fx.jhyg[91] = -1475261419;
        fx.jhyg[92] = 1362030288;
        fx.jhyg[93] = -1582084613;
        fx.jhyg[94] = 1894142205;
        fx.jhyg[95] = 2045359132;
        fx.jhyg[96] = -456782305;
        fx.jhyg[97] = -1999454943;
        fx.jhyg[98] = 293788955;
        fx.jhyg[99] = -119221955;
    }

    private static /* synthetic */ void jisv() {
        fx.jiak[0] = -8118714526702101841L;
        fx.jiak[1] = -4996817720635619352L;
        fx.jiak[2] = 7870096109971275007L;
        fx.jiak[3] = -4136346803415925889L;
        fx.jiak[4] = 3447618730641428577L;
        fx.jiak[5] = 184824379690088568L;
        fx.jiak[6] = -4945685513345235130L;
        fx.jiak[7] = -2306904574612922200L;
        fx.jiak[8] = -5409459156767009973L;
        fx.jiak[9] = -7155251796983071273L;
        fx.jiak[10] = -8707152170062678561L;
        fx.jiak[11] = 1335201055200962235L;
        fx.jiak[12] = -286957044006911836L;
        fx.jiak[13] = -8902594805151060311L;
        fx.jiak[14] = -2660518321748180455L;
        fx.jiak[15] = 3877615568373419764L;
        fx.jiak[16] = 4250814409401629954L;
        fx.jiak[17] = -497775513480087017L;
        fx.jiak[18] = -8999733279843470077L;
        fx.jiak[19] = 1141467088584312358L;
        fx.jiak[20] = -4913247766191362773L;
        fx.jiak[21] = 3009840105465959209L;
        fx.jiak[22] = -7458038255193225012L;
        fx.jiak[23] = 3248083431224896998L;
        fx.jiak[24] = -2574890678508880043L;
        fx.jiak[25] = -8427062201121912532L;
        fx.jiak[26] = -7387240315075015385L;
        fx.jiak[27] = -5005122093617366092L;
        fx.jiak[28] = -2255331655406204940L;
        fx.jiak[29] = 5206803755871480044L;
        fx.jiak[30] = 2963741307040027511L;
        fx.jiak[31] = -2260194264367726478L;
        fx.jiak[32] = -685500012570786708L;
        fx.jiak[33] = 4130508037224232636L;
        fx.jiak[34] = -2115937341311677397L;
        fx.jiak[35] = 2263319068579433233L;
        fx.jiak[36] = 4170640745845268504L;
        fx.jiak[37] = -9005981128152356436L;
        fx.jiak[38] = 3579183721449838703L;
        fx.jiak[39] = -6103992317666610541L;
        fx.jiak[40] = -2158824733221792222L;
        fx.jiak[41] = -7745713206791651596L;
        fx.jiak[42] = 420543975041993281L;
        fx.jiak[43] = 2694226802856287336L;
        fx.jiak[44] = -1254951212116515217L;
        fx.jiak[45] = 341178088031370301L;
        fx.jiak[46] = 8910355409973878554L;
        fx.jiak[47] = 3321792723877783292L;
        fx.jiak[48] = -4295298746843010448L;
        fx.jiak[49] = -8567134993135460538L;
        fx.jiak[50] = -2851829903410172144L;
        fx.jiak[51] = 7087150534871895271L;
        fx.jiak[52] = 7718098141976779708L;
        fx.jiak[53] = -1743647825167862063L;
        fx.jiak[54] = 7671026328721893978L;
        fx.jiak[55] = 7145227444776525905L;
        fx.jiak[56] = -3518270803008993798L;
        fx.jiak[57] = -8026606693551945544L;
        fx.jiak[58] = -2004683840642544360L;
        fx.jiak[59] = -2163056704397226965L;
        fx.jiak[60] = -8840383270038355948L;
        fx.jiak[61] = -372699936994397670L;
        fx.jiak[62] = -2516031374693773609L;
        fx.jiak[63] = -7131836190432138820L;
        fx.jiak[64] = 6648766843411924514L;
        fx.jiak[65] = -5587396279330395800L;
        fx.jiak[66] = -9155595994285532746L;
        fx.jiak[67] = -219316746264457705L;
        fx.jiak[68] = 6818932427695273543L;
        fx.jiak[69] = -4654925244466271098L;
        fx.jiak[70] = 2006134912695670901L;
        fx.jiak[71] = -2112262003559448126L;
        fx.jiak[72] = 4877617132083463267L;
        fx.jiak[73] = 667901859376490601L;
        fx.jiak[74] = 2756392498404644666L;
        fx.jiak[75] = -1619856005101552930L;
        fx.jiak[76] = 5496740044522283931L;
        fx.jiak[77] = 1010174131954665054L;
        fx.jiak[78] = 8482828025124790356L;
        fx.jiak[79] = 1828387793897630172L;
        fx.jiak[80] = -5064279602814220472L;
        fx.jiak[81] = 2889002190882523345L;
        fx.jiak[82] = -8953353279359225734L;
        fx.jiak[83] = 4227447102487198462L;
        fx.jiak[84] = 5306137672460198921L;
        fx.jiak[85] = -3588524047178921598L;
        fx.jiak[86] = 1474847996277093018L;
        fx.jiak[87] = 7369117566367815777L;
        fx.jiak[88] = -5596189275534296733L;
        fx.jiak[89] = -6501707287644652673L;
        fx.jiak[90] = -927149925946402889L;
        fx.jiak[91] = 6120574282254716564L;
        fx.jiak[92] = -5319127678795290635L;
        fx.jiak[93] = 8430428225969466846L;
        fx.jiak[94] = 5863008628589775717L;
        fx.jiak[95] = 7490188183377785064L;
        fx.jiak[96] = -1612198673434220046L;
        fx.jiak[97] = -3489592239072208572L;
        fx.jiak[98] = 3617232150191630757L;
        fx.jiak[99] = 2268762964842673802L;
    }

    private static int __adl_guard_a1adc1cd75b04b25() {
        return 1113013736;
    }
}

