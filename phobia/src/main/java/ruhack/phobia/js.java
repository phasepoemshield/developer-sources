/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_3966
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import ruhack.phobia.aw;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.gz;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.lr;
import ruhack.phobia.lu;
import ruhack.phobia.lx;
import ruhack.phobia.lz;
import ruhack.phobia.nd;
import ruhack.phobia.nj;

public class js
extends ds {
    public static final boolean c;
    private final kb appearOnHover;
    private final kb reddenOnHit;
    private final kg ringSize;
    private static final double[] GHOST_X_SIGN;
    private static int[] jjfl;
    private double soulPhase;
    private static final double[] GHOST_HURT_SPEED;
    private float appearance;
    private static final double[] GHOST_Y_CURVE;
    private class_1309 lastTarget;
    private final double[] ghostPhase;
    private class_243 lastPosition;
    private final kg soulLength;
    private final kg soulSize;
    private float hurtAnimation;
    private int floatingGhostTargetId;
    private final kg ghostLength;
    private final kg ghostWidth;
    private final kg soulSpeed;
    private double diamondRotation;
    private final kf mode;
    private double floatingGhostPhase;
    private long hoverTargetExpiresAt;
    private static final double[] GHOST_Y_BASE;
    private static int[] jjfm;
    private static final double[] GHOST_BASE_SPEED;
    private class_1657 hoverTarget;
    public static final int b;
    private final class_243[] floatingGhostPosition;
    private static final long HOVER_TARGET_LIFETIME_MS = 3000L;
    private static final double[] GHOST_Z_SIGN;
    private final kg soulBright;
    private static final class_2960 TARGET;
    private final kg ringBright;
    private final kg ringThickness;
    private static long[] jjhu;
    public static final boolean a;
    private final List<class_243>[] floatingGhostTrails;
    private static final boolean[] GHOST_USE_X;
    private long lastFrameTime;
    private static long[] jjhv;
    public static final long rm = -8935762119809782856L;
    private final kg ringSpeed;

    private static /* synthetic */ void jmyv() {
        js.jjfl[800] = 2082896687;
        js.jjfl[801] = -467754138;
        js.jjfl[802] = 1565320899;
        js.jjfl[803] = 81769082;
        js.jjfl[804] = -186082869;
        js.jjfl[805] = -1350352998;
        js.jjfl[806] = -1798767805;
        js.jjfl[807] = -721646179;
        js.jjfl[808] = -1312526452;
        js.jjfl[809] = 260443491;
        js.jjfl[810] = 1347099606;
        js.jjfl[811] = -1656807397;
        js.jjfl[812] = -251584365;
        js.jjfl[813] = -503256749;
        js.jjfl[814] = 2090336799;
        js.jjfl[815] = -883052233;
        js.jjfl[816] = 1486200315;
        js.jjfl[817] = 181690070;
        js.jjfl[818] = 1956327265;
        js.jjfl[819] = -138235562;
        js.jjfl[820] = -352267392;
        js.jjfl[821] = -916787536;
        js.jjfl[822] = 1501887703;
        js.jjfl[823] = 774502747;
        js.jjfl[824] = 1905401869;
        js.jjfl[825] = -1272505546;
        js.jjfl[826] = -1618462060;
        js.jjfl[827] = 788070407;
        js.jjfl[828] = -828324873;
        js.jjfl[829] = -1620797416;
        js.jjfl[830] = 1537686270;
        js.jjfl[831] = 1531699233;
        js.jjfl[832] = -279453114;
        js.jjfl[833] = 1472059783;
        js.jjfl[834] = 1242684256;
        js.jjfl[835] = -1036941198;
        js.jjfl[836] = 79536089;
        js.jjfl[837] = 909357291;
        js.jjfl[838] = -289196059;
        js.jjfl[839] = 1737335243;
        js.jjfl[840] = -1185698844;
        js.jjfl[841] = -1549949595;
        js.jjfl[842] = 342541568;
        js.jjfl[843] = 1753776145;
        js.jjfl[844] = 2102373699;
        js.jjfl[845] = -1699804440;
        js.jjfl[846] = 1587107456;
        js.jjfl[847] = 1262590956;
        js.jjfl[848] = 1935309512;
        js.jjfl[849] = -1393236439;
        js.jjfl[850] = -2031210294;
        js.jjfl[851] = 1732444809;
        js.jjfl[852] = 1342511905;
        js.jjfl[853] = -745282529;
        js.jjfl[854] = 1188549290;
        js.jjfl[855] = 636141930;
        js.jjfl[856] = -476890675;
        js.jjfl[857] = -1986308673;
        js.jjfl[858] = 223062113;
        js.jjfl[859] = -2108228212;
        js.jjfl[860] = -2040360732;
        js.jjfl[861] = 1597593270;
        js.jjfl[862] = 878613656;
        js.jjfl[863] = -1902495055;
        js.jjfl[864] = 1027581367;
        js.jjfl[865] = 216848273;
        js.jjfl[866] = -804838756;
        js.jjfl[867] = 1839134149;
        js.jjfl[868] = 2146007734;
        js.jjfl[869] = 1146988151;
        js.jjfl[870] = 92078812;
        js.jjfl[871] = -278368854;
        js.jjfl[872] = -1171837503;
        js.jjfl[873] = -1850303438;
        js.jjfl[874] = 1204312700;
        js.jjfl[875] = -1315772288;
        js.jjfl[876] = 1662893661;
        js.jjfl[877] = 448252197;
        js.jjfl[878] = 1704528178;
        js.jjfl[879] = -438139333;
        js.jjfl[880] = -1624237650;
        js.jjfl[881] = -1791987487;
        js.jjfl[882] = -2081263128;
        js.jjfl[883] = -2087623253;
        js.jjfl[884] = 1152744206;
        js.jjfl[885] = -1358688891;
        js.jjfl[886] = -194676295;
        js.jjfl[887] = 364199253;
        js.jjfl[888] = -817654288;
        js.jjfl[889] = -514367232;
        js.jjfl[890] = -778304254;
        js.jjfl[891] = 989355531;
        js.jjfl[892] = 1899967019;
        js.jjfl[893] = -117742956;
        js.jjfl[894] = 527004705;
        js.jjfl[895] = 1580027839;
        js.jjfl[896] = 1627154693;
        js.jjfl[897] = -1299032248;
        js.jjfl[898] = -859315205;
        js.jjfl[899] = -1006404951;
    }

    private static /* synthetic */ void jmzn() {
        js.jjhu[200] = 330432920210701658L;
        js.jjhu[201] = 8810307105039000374L;
        js.jjhu[202] = 6122729006592568978L;
        js.jjhu[203] = -6945321420891394701L;
        js.jjhu[204] = 5220328696659125345L;
        js.jjhu[205] = -6537269975010737561L;
        js.jjhu[206] = 1547963413276117135L;
        js.jjhu[207] = -1602144350500152508L;
        js.jjhu[208] = -4638760785286719088L;
        js.jjhu[209] = -5311279049461204129L;
        js.jjhu[210] = -5960289626337866474L;
        js.jjhu[211] = -3747457856575587172L;
        js.jjhu[212] = -6768369632989671040L;
        js.jjhu[213] = -3800452711940051037L;
        js.jjhu[214] = 2968397814259435843L;
        js.jjhu[215] = 6890545136038859245L;
        js.jjhu[216] = 4168526458132791000L;
        js.jjhu[217] = 3459568124024189049L;
        js.jjhu[218] = 5620688254972785521L;
        js.jjhu[219] = -3027125826218175947L;
        js.jjhu[220] = 4046132386613638286L;
        js.jjhu[221] = -9014028737951058402L;
        js.jjhu[222] = 1532768072452872855L;
        js.jjhu[223] = 494770221184158377L;
        js.jjhu[224] = -3599702921701111959L;
        js.jjhu[225] = -6779061732440677020L;
        js.jjhu[226] = 3380686825159028499L;
        js.jjhu[227] = -1012917313859203172L;
        js.jjhu[228] = -671172431730509485L;
        js.jjhu[229] = 395172080480561249L;
        js.jjhu[230] = 7170301036302025503L;
        js.jjhu[231] = -2137897552659045998L;
        js.jjhu[232] = -4122785547225634103L;
        js.jjhu[233] = -2530341312676875270L;
        js.jjhu[234] = 4633856167567417561L;
        js.jjhu[235] = -1266298728507382710L;
        js.jjhu[236] = -8241641353460545051L;
        js.jjhu[237] = -1752063474803693776L;
        js.jjhu[238] = 21539759157799380L;
        js.jjhu[239] = 3542819470427024941L;
        js.jjhu[240] = -8164965670031102180L;
        js.jjhu[241] = -7462750370564289840L;
        js.jjhu[242] = -1874964613916623900L;
        js.jjhu[243] = 3796913546380215825L;
        js.jjhu[244] = 4362182362859142011L;
        js.jjhu[245] = -818803276279845497L;
        js.jjhu[246] = -480648437214222947L;
        js.jjhu[247] = -5822515772691226817L;
        js.jjhu[248] = -5713021762798121930L;
        js.jjhu[249] = -5944616502910696107L;
        js.jjhu[250] = 3529542834185237345L;
        js.jjhu[251] = -8656841365174381086L;
        js.jjhu[252] = -1274837913455876962L;
        js.jjhu[253] = -4422215394943928386L;
        js.jjhu[254] = -2532541026533522160L;
        js.jjhu[255] = 3395504037333785977L;
        js.jjhu[256] = 3413432700445167372L;
        js.jjhu[257] = 4170673162230928745L;
        js.jjhu[258] = 1342692969569464952L;
        js.jjhu[259] = 7171245950024639237L;
        js.jjhu[260] = 7196943360418773754L;
        js.jjhu[261] = -6002155554480519966L;
        js.jjhu[262] = 6357200461028260810L;
        js.jjhu[263] = -8793763317900518862L;
        js.jjhu[264] = -1372503100749797846L;
        js.jjhu[265] = -6487462751442102428L;
        js.jjhu[266] = -8725955804201210443L;
        js.jjhu[267] = 5539548663707677169L;
        js.jjhu[268] = -4225486321172193677L;
        js.jjhu[269] = -1510115708629848681L;
        js.jjhu[270] = -822865950207938675L;
        js.jjhu[271] = -3827810313221216038L;
        js.jjhu[272] = -6515934478835108836L;
        js.jjhu[273] = 1966211552426363448L;
        js.jjhu[274] = -2846478416727548633L;
        js.jjhu[275] = 959058127223964244L;
        js.jjhu[276] = -5964598947781640751L;
        js.jjhu[277] = -4250742054797701300L;
        js.jjhu[278] = 7678368297377877307L;
        js.jjhu[279] = 1132800524732057054L;
        js.jjhu[280] = 6491821173148375203L;
        js.jjhu[281] = -8371525046039458585L;
        js.jjhu[282] = -9206935827094249857L;
        js.jjhu[283] = 9051482138233455176L;
        js.jjhu[284] = -1499617475190638565L;
        js.jjhu[285] = 5462889737935263727L;
        js.jjhu[286] = 8162386956423526431L;
        js.jjhu[287] = 2817717335646876656L;
        js.jjhu[288] = -7377082575204238435L;
        js.jjhu[289] = 8810112054125486391L;
        js.jjhu[290] = -430424936276490296L;
        js.jjhu[291] = 2086632402738748466L;
        js.jjhu[292] = 4846386660494397845L;
        js.jjhu[293] = -8217247514968487142L;
        js.jjhu[294] = 7189769017559692985L;
        js.jjhu[295] = -85898223730747521L;
        js.jjhu[296] = -7793201767672222360L;
        js.jjhu[297] = -1943052492657691649L;
        js.jjhu[298] = 406081975122051046L;
        js.jjhu[299] = -4955511783194688104L;
    }

    private static /* synthetic */ void jmzm() {
        js.jjhu[100] = -5494054597764714553L;
        js.jjhu[101] = 5005410296838843471L;
        js.jjhu[102] = 8608113794564629390L;
        js.jjhu[103] = -2621828486708220433L;
        js.jjhu[104] = -826154011791761592L;
        js.jjhu[105] = 9010313197032708163L;
        js.jjhu[106] = -465697732121274728L;
        js.jjhu[107] = -1811706714377470483L;
        js.jjhu[108] = 8430299047985501108L;
        js.jjhu[109] = -2301313708536032707L;
        js.jjhu[110] = -4571160943067474399L;
        js.jjhu[111] = -6636623623056499574L;
        js.jjhu[112] = 6824499700138693722L;
        js.jjhu[113] = 3878621122613543090L;
        js.jjhu[114] = -6564402026620247198L;
        js.jjhu[115] = 8378513976414643475L;
        js.jjhu[116] = -4500090520501833793L;
        js.jjhu[117] = -7193726974891522063L;
        js.jjhu[118] = -8719952959660792059L;
        js.jjhu[119] = 915445799808334415L;
        js.jjhu[120] = 6068122693954552542L;
        js.jjhu[121] = 4044121886288378518L;
        js.jjhu[122] = 6434139895715089039L;
        js.jjhu[123] = -319638739659330688L;
        js.jjhu[124] = -4097995965397945762L;
        js.jjhu[125] = 7567425551425643631L;
        js.jjhu[126] = -3294773342087996095L;
        js.jjhu[127] = 7515059061127262754L;
        js.jjhu[128] = 4383624296982805106L;
        js.jjhu[129] = 3676840763914272402L;
        js.jjhu[130] = -9207610290633177553L;
        js.jjhu[131] = -4662365970235014810L;
        js.jjhu[132] = -5171083640663067145L;
        js.jjhu[133] = -5551024981717425376L;
        js.jjhu[134] = -5944574386927553271L;
        js.jjhu[135] = 1984345522990709845L;
        js.jjhu[136] = -817011501675599087L;
        js.jjhu[137] = -4074409195121862298L;
        js.jjhu[138] = 6308544689939605231L;
        js.jjhu[139] = -2933392568115942936L;
        js.jjhu[140] = -3084851605891999875L;
        js.jjhu[141] = -6599550252222094221L;
        js.jjhu[142] = -3282990514934040369L;
        js.jjhu[143] = -5839252726039486547L;
        js.jjhu[144] = -310970750086252229L;
        js.jjhu[145] = -5116641366948646569L;
        js.jjhu[146] = -5160779163598725869L;
        js.jjhu[147] = -6662912284648182856L;
        js.jjhu[148] = 5979012833343476003L;
        js.jjhu[149] = -9138946589669727576L;
        js.jjhu[150] = 5731651395602604609L;
        js.jjhu[151] = 1184322633506302345L;
        js.jjhu[152] = -3172872777509752834L;
        js.jjhu[153] = 3216423692021323507L;
        js.jjhu[154] = -2791579337931492830L;
        js.jjhu[155] = 9142870604608056398L;
        js.jjhu[156] = -3524409492239953084L;
        js.jjhu[157] = -28583854350744927L;
        js.jjhu[158] = 5447562912563003534L;
        js.jjhu[159] = -325256940028771288L;
        js.jjhu[160] = 8757382447372463096L;
        js.jjhu[161] = -6081812606877589277L;
        js.jjhu[162] = -7956826922948005643L;
        js.jjhu[163] = 2313899441452013578L;
        js.jjhu[164] = 6094327272478983305L;
        js.jjhu[165] = -4948458042513734036L;
        js.jjhu[166] = -1966239864854595482L;
        js.jjhu[167] = -3020743681935242938L;
        js.jjhu[168] = -2146531058182247431L;
        js.jjhu[169] = 6865900214620841207L;
        js.jjhu[170] = -4622466841835855659L;
        js.jjhu[171] = 6541207324441631026L;
        js.jjhu[172] = -3305697101635458106L;
        js.jjhu[173] = -7039967522652667299L;
        js.jjhu[174] = -6403351652458287518L;
        js.jjhu[175] = -7649690815558073572L;
        js.jjhu[176] = 710370091953488421L;
        js.jjhu[177] = -4401518321122908115L;
        js.jjhu[178] = -6461636845324856163L;
        js.jjhu[179] = 7644570008098035226L;
        js.jjhu[180] = -2971368943387599219L;
        js.jjhu[181] = -8092133465984982344L;
        js.jjhu[182] = 6984517307814261232L;
        js.jjhu[183] = -1884634136056499799L;
        js.jjhu[184] = -8474994029823008054L;
        js.jjhu[185] = -3108479013233168083L;
        js.jjhu[186] = 8301274492185671917L;
        js.jjhu[187] = 5694920496126830460L;
        js.jjhu[188] = 1239644701189633053L;
        js.jjhu[189] = 7689156914556946383L;
        js.jjhu[190] = -9076189524817943810L;
        js.jjhu[191] = 4804051521996145769L;
        js.jjhu[192] = 4733773478309533848L;
        js.jjhu[193] = -6353725358411362736L;
        js.jjhu[194] = -1131218776973875493L;
        js.jjhu[195] = -722807315986994531L;
        js.jjhu[196] = 282793616958023769L;
        js.jjhu[197] = -6945414021420099916L;
        js.jjhu[198] = 9128914289216545255L;
        js.jjhu[199] = 7944712854035735441L;
    }

    private static /* synthetic */ void jmyz() {
        js.jjfm[0] = -2019646224;
        js.jjfm[1] = -1500017863;
        js.jjfm[2] = -1556784619;
        js.jjfm[3] = -1217869663;
        js.jjfm[4] = -618993049;
        js.jjfm[5] = -1958713979;
        js.jjfm[6] = 1595231972;
        js.jjfm[7] = 1187851951;
        js.jjfm[8] = -1864040341;
        js.jjfm[9] = -479741419;
        js.jjfm[10] = -78829164;
        js.jjfm[11] = 612325769;
        js.jjfm[12] = -912344971;
        js.jjfm[13] = 1532003897;
        js.jjfm[14] = 974130593;
        js.jjfm[15] = 374725179;
        js.jjfm[16] = 998639656;
        js.jjfm[17] = -710270271;
        js.jjfm[18] = -1730307490;
        js.jjfm[19] = -802968404;
        js.jjfm[20] = 413530549;
        js.jjfm[21] = -1164937588;
        js.jjfm[22] = 427322356;
        js.jjfm[23] = 1682357848;
        js.jjfm[24] = 1316732545;
        js.jjfm[25] = -960217506;
        js.jjfm[26] = 483731626;
        js.jjfm[27] = 1946922049;
        js.jjfm[28] = 1913112581;
        js.jjfm[29] = -1786806793;
        js.jjfm[30] = -2036949402;
        js.jjfm[31] = 2075847719;
        js.jjfm[32] = 140315382;
        js.jjfm[33] = 1492610656;
        js.jjfm[34] = -1779452813;
        js.jjfm[35] = 45274358;
        js.jjfm[36] = -935407451;
        js.jjfm[37] = 1423867271;
        js.jjfm[38] = -821283453;
        js.jjfm[39] = -701154689;
        js.jjfm[40] = -8406361;
        js.jjfm[41] = -129092850;
        js.jjfm[42] = -223496712;
        js.jjfm[43] = -1396273046;
        js.jjfm[44] = 1826282680;
        js.jjfm[45] = 1118441055;
        js.jjfm[46] = -658892194;
        js.jjfm[47] = -1150826389;
        js.jjfm[48] = -1221979940;
        js.jjfm[49] = 512340483;
        js.jjfm[50] = 1380811324;
        js.jjfm[51] = 1960009652;
        js.jjfm[52] = -1284838969;
        js.jjfm[53] = -808849356;
        js.jjfm[54] = 1220123404;
        js.jjfm[55] = 544821162;
        js.jjfm[56] = -2034596060;
        js.jjfm[57] = -357415122;
        js.jjfm[58] = 413151028;
        js.jjfm[59] = -1695143094;
        js.jjfm[60] = -1571377712;
        js.jjfm[61] = -1991165535;
        js.jjfm[62] = 1292081450;
        js.jjfm[63] = -976281762;
        js.jjfm[64] = 277430528;
        js.jjfm[65] = 2074166080;
        js.jjfm[66] = 892089547;
        js.jjfm[67] = 283848739;
        js.jjfm[68] = 1120822723;
        js.jjfm[69] = -1532109445;
        js.jjfm[70] = 1150014140;
        js.jjfm[71] = -1891205887;
        js.jjfm[72] = -439240217;
        js.jjfm[73] = -983018745;
        js.jjfm[74] = -1389396820;
        js.jjfm[75] = -1774855815;
        js.jjfm[76] = 111577538;
        js.jjfm[77] = 66712196;
        js.jjfm[78] = 1806852595;
        js.jjfm[79] = 1308904241;
        js.jjfm[80] = -1069668819;
        js.jjfm[81] = 1102314375;
        js.jjfm[82] = 516202963;
        js.jjfm[83] = -20954907;
        js.jjfm[84] = -1894284698;
        js.jjfm[85] = -891244367;
        js.jjfm[86] = -1143081472;
        js.jjfm[87] = 791725211;
        js.jjfm[88] = 716196919;
        js.jjfm[89] = 13301500;
        js.jjfm[90] = -2028863134;
        js.jjfm[91] = 2108628250;
        js.jjfm[92] = -802364841;
        js.jjfm[93] = -422570408;
        js.jjfm[94] = -149666024;
        js.jjfm[95] = 1970573980;
        js.jjfm[96] = 1629408527;
        js.jjfm[97] = -59478154;
        js.jjfm[98] = -1563030080;
        js.jjfm[99] = 263408322;
    }

    private static /* synthetic */ void jmyx() {
        js.jjfl[1000] = 700533076;
        js.jjfl[1001] = -1372824786;
        js.jjfl[1002] = 20129114;
        js.jjfl[1003] = -1905700250;
        js.jjfl[1004] = 1681865816;
        js.jjfl[1005] = 1893998540;
        js.jjfl[1006] = 1526393570;
        js.jjfl[1007] = 1283438495;
        js.jjfl[1008] = -1910931723;
        js.jjfl[1009] = -1513961618;
        js.jjfl[1010] = -355673695;
        js.jjfl[1011] = 1930914493;
        js.jjfl[1012] = 821131386;
        js.jjfl[1013] = -1505915155;
        js.jjfl[1014] = 1104272808;
        js.jjfl[1015] = -629646369;
        js.jjfl[1016] = -1264613650;
        js.jjfl[1017] = 2002369805;
        js.jjfl[1018] = 935027111;
        js.jjfl[1019] = -1014473733;
        js.jjfl[1020] = 589151687;
        js.jjfl[1021] = -1647369111;
        js.jjfl[1022] = 610920485;
        js.jjfl[1023] = -1954005544;
        js.jjfl[1024] = -411174002;
        js.jjfl[1025] = -57732728;
        js.jjfl[1026] = 1291425793;
        js.jjfl[1027] = -1722389054;
        js.jjfl[1028] = -866104475;
        js.jjfl[1029] = 1971911375;
        js.jjfl[1030] = 150393428;
        js.jjfl[1031] = -34157642;
        js.jjfl[1032] = 876887437;
        js.jjfl[1033] = -129542769;
        js.jjfl[1034] = 581013390;
        js.jjfl[1035] = 1420043119;
        js.jjfl[1036] = 602030841;
        js.jjfl[1037] = 524661810;
        js.jjfl[1038] = 1657710302;
        js.jjfl[1039] = -1568663316;
        js.jjfl[1040] = 624094672;
        js.jjfl[1041] = -1956958899;
        js.jjfl[1042] = -17473681;
        js.jjfl[1043] = -394596134;
        js.jjfl[1044] = 1249817354;
        js.jjfl[1045] = -218297983;
        js.jjfl[1046] = -1217102332;
        js.jjfl[1047] = 357271350;
        js.jjfl[1048] = -1969562980;
        js.jjfl[1049] = -984575030;
        js.jjfl[1050] = -653265563;
        js.jjfl[1051] = -765375677;
        js.jjfl[1052] = 1587234513;
        js.jjfl[1053] = -1898933575;
        js.jjfl[1054] = -254964474;
        js.jjfl[1055] = -427896384;
        js.jjfl[1056] = 1930758425;
        js.jjfl[1057] = 118254636;
        js.jjfl[1058] = -764709099;
        js.jjfl[1059] = 2051264005;
        js.jjfl[1060] = 1797583025;
        js.jjfl[1061] = -2093085860;
        js.jjfl[1062] = 1955635368;
        js.jjfl[1063] = 69361708;
        js.jjfl[1064] = 431672080;
        js.jjfl[1065] = 2122375286;
        js.jjfl[1066] = -2020166045;
        js.jjfl[1067] = -594450023;
        js.jjfl[1068] = -1234772420;
        js.jjfl[1069] = -1719908750;
        js.jjfl[1070] = -75668930;
        js.jjfl[1071] = 91164477;
        js.jjfl[1072] = -1100443703;
        js.jjfl[1073] = -162750000;
        js.jjfl[1074] = 31169058;
        js.jjfl[1075] = -600513226;
        js.jjfl[1076] = 373481016;
        js.jjfl[1077] = -207546830;
        js.jjfl[1078] = 1260956557;
        js.jjfl[1079] = -575097137;
        js.jjfl[1080] = -1516560789;
        js.jjfl[1081] = -1526673495;
        js.jjfl[1082] = 174582248;
        js.jjfl[1083] = 939003868;
        js.jjfl[1084] = -1297971240;
        js.jjfl[1085] = 1376189716;
        js.jjfl[1086] = -928007658;
        js.jjfl[1087] = 361194206;
        js.jjfl[1088] = -41252556;
        js.jjfl[1089] = 315428542;
        js.jjfl[1090] = -1605082829;
        js.jjfl[1091] = 1154106672;
        js.jjfl[1092] = -1523084805;
        js.jjfl[1093] = -1606715589;
        js.jjfl[1094] = 722573669;
        js.jjfl[1095] = 2146550338;
        js.jjfl[1096] = -45380620;
        js.jjfl[1097] = -503112519;
        js.jjfl[1098] = -197401995;
        js.jjfl[1099] = 198694322;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$8() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmoi", jjht(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == js.jjfn("jmoj", jjfk(int ), (int)1013)) break;
            v0 /* !! */  = (long)js.jjfn("jmok", jjfk(int ), (int)1014);
        }
        var3_1 = js.c;
        v1 /* !! */  = js.rm;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - js.jjfn("jmol", jjht(int ), (int)198));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -436869937: {
                    v2 = js.jjfn("jmom", jjht(int ), (int)199);
                    continue block21;
                }
                case 458795960: {
                    break block21;
                }
                case 681246252: {
                    v2 = js.jjfn("jmon", jjht(int ), (int)200);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = js.b;
        v3 /* !! */  = js.rm;
        if (true) ** GOTO lbl25
        block22: while (true) {
            v3 /* !! */  = (long)(js.jjfn("jmop", jjht(int ), (int)202) - js.jjfn("jmoo", jjht(int ), (int)201));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 458795960: {
                    break block22;
                }
                case 764129969: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = js.a;
        if (var3_1) {
            throw null;
lbl33:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmoq", jjht(int ), (int)203)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == js.jjfn("jmor", jjfk(int ), (int)1015)) break;
                    v4 /* !! */  = (long)js.jjfn("jmos", jjfk(int ), (int)1016);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmot", jjht(int ), (int)204)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == js.jjfn("jmou", jjfk(int ), (int)1017)) break;
                    v5 /* !! */  = (long)js.jjfn("jmov", jjfk(int ), (int)1018);
                }
                v6 = this.mode.isSelected("\u041a\u043e\u043b\u044c\u0446\u043e");
                v7 /* !! */  = js.rm;
                if (true) ** GOTO lbl55
                block26: while (true) {
                    v7 /* !! */  = (long)(v8 - js.jjfn("jmow", jjht(int ), (int)205));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 47192660: {
                            v8 = js.jjfn("jmox", jjht(int ), (int)206);
                            continue block26;
                        }
                        case 458795960: {
                            break block26;
                        }
                        case 752991054: {
                            v8 = js.jjfn("jmoy", jjht(int ), (int)207);
                            continue block26;
                        }
                    }
                    break;
                }
                return v6;
            }
lbl65:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)js.jjfn("jmoz", jjfk(int ), (int)1019);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)js.jjfn("jmpa", jjfk(int ), (int)1020);
                    if (!var3_1) ** GOTO lbl65
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)js.jjfn("jmpb", jjfk(int ), (int)1021);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)js.jjfn("jmpc", jjfk(int ), (int)1022);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmyn() {
        js.jjfl[0] = -2019646223;
        js.jjfl[1] = -1743908189;
        js.jjfl[2] = -1636198696;
        js.jjfl[3] = -1985739668;
        js.jjfl[4] = -430561622;
        js.jjfl[5] = -1249072824;
        js.jjfl[6] = 1650033193;
        js.jjfl[7] = 2041268425;
        js.jjfl[8] = -1364603738;
        js.jjfl[9] = -595469197;
        js.jjfl[10] = -972954279;
        js.jjfl[11] = 439588164;
        js.jjfl[12] = -1981892491;
        js.jjfl[13] = 1721518836;
        js.jjfl[14] = 76125243;
        js.jjfl[15] = 697686587;
        js.jjfl[16] = 113951973;
        js.jjfl[17] = -357948735;
        js.jjfl[18] = -1517201773;
        js.jjfl[19] = -286302111;
        js.jjfl[20] = 1485175221;
        js.jjfl[21] = -2015577535;
        js.jjfl[22] = 669119086;
        js.jjfl[23] = 610713176;
        js.jjfl[24] = 1941402188;
        js.jjfl[25] = -128079932;
        js.jjfl[26] = 588589226;
        js.jjfl[27] = 1229414540;
        js.jjfl[28] = 1913112581;
        js.jjfl[29] = -1786806794;
        js.jjfl[30] = -2036949404;
        js.jjfl[31] = -71635929;
        js.jjfl[32] = 140315380;
        js.jjfl[33] = 1492610664;
        js.jjfl[34] = -1779452826;
        js.jjfl[35] = 45274338;
        js.jjfl[36] = -935407443;
        js.jjfl[37] = 1423867266;
        js.jjfl[38] = -821283449;
        js.jjfl[39] = -701154692;
        js.jjfl[40] = -8406354;
        js.jjfl[41] = -129092838;
        js.jjfl[42] = -223496725;
        js.jjfl[43] = -1396273052;
        js.jjfl[44] = 1826282685;
        js.jjfl[45] = 1118441033;
        js.jjfl[46] = -658892210;
        js.jjfl[47] = -1150826399;
        js.jjfl[48] = -1221979937;
        js.jjfl[49] = 512340498;
        js.jjfl[50] = 1380811306;
        js.jjfl[51] = 1960009659;
        js.jjfl[52] = -1284838953;
        js.jjfl[53] = -808849355;
        js.jjfl[54] = 1220123394;
        js.jjfl[55] = 544821161;
        js.jjfl[56] = 2034596059;
        js.jjfl[57] = 1236583664;
        js.jjfl[58] = 413151030;
        js.jjfl[59] = -1695143096;
        js.jjfl[60] = -1571377711;
        js.jjfl[61] = -1991165534;
        js.jjfl[62] = 1904249669;
        js.jjfl[63] = -125578349;
        js.jjfl[64] = 1425228032;
        js.jjfl[65] = 2074166081;
        js.jjfl[66] = 892089547;
        js.jjfl[67] = 1345007651;
        js.jjfl[68] = 2129507017;
        js.jjfl[69] = 615374203;
        js.jjfl[70] = 95146684;
        js.jjfl[71] = 256277761;
        js.jjfl[72] = 1708243431;
        js.jjfl[73] = 983018744;
        js.jjfl[74] = -1389396820;
        js.jjfl[75] = -1774855816;
        js.jjfl[76] = 111577536;
        js.jjfl[77] = 66712199;
        js.jjfl[78] = 1806852599;
        js.jjfl[79] = 1308904244;
        js.jjfl[80] = -1069668805;
        js.jjfl[81] = 1102314451;
        js.jjfl[82] = 516202834;
        js.jjfl[83] = -20955004;
        js.jjfl[84] = -1894284724;
        js.jjfl[85] = -891244298;
        js.jjfl[86] = -1143081469;
        js.jjfl[87] = 791725075;
        js.jjfl[88] = 716196943;
        js.jjfl[89] = 13301431;
        js.jjfl[90] = -2028863122;
        js.jjfl[91] = 2108628285;
        js.jjfl[92] = -802364802;
        js.jjfl[93] = -422570304;
        js.jjfl[94] = -149665893;
        js.jjfl[95] = 1970574007;
        js.jjfl[96] = 1629408561;
        js.jjfl[97] = -59478250;
        js.jjfl[98] = -1563030088;
        js.jjfl[99] = 263408280;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetFloatingGhosts() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jlps", jjht(int ), (int)119)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == js.jjfn("jlpt", jjfk(int ), (int)824)) break;
            v0 /* !! */  = (long)js.jjfn("jlpu", jjfk(int ), (int)825);
        }
        var4_1 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jlpv", jjht(int ), (int)120)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == js.jjfn("jlpw", jjfk(int ), (int)826)) break;
            v1 /* !! */  = (long)js.jjfn("jlpx", jjfk(int ), (int)827);
        }
        var3_2 /* !! */  = js.b;
        v2 /* !! */  = js.rm;
        if (true) ** GOTO lbl19
        block30: while (true) {
            v2 /* !! */  = (long)(js.jjfn("jlpz", jjht(int ), (int)122) - js.jjfn("jlpy", jjht(int ), (int)121));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1706472646: {
                    continue block30;
                }
                case 458795960: {
                    break block30;
                }
            }
            break;
        }
        var2_3 = js.a;
        if (var4_1) {
            throw null;
lbl27:
            // 9 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl27
        var1_4 = js.jjfn("jlqa", jjfk(int ), (int)828);
        if (var2_3) ** GOTO lbl27
        block32: while (true) {
            if (var2_3 || var2_3) ** GOTO lbl27
            while (true) {
                if ((v3 = (cfr_temp_2 = js.rm - js.jjfn("jlqb", jjht(int ), (int)123)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 == js.jjfn("jlqc", jjfk(int ), (int)829)) break;
                v3 = -751090466;
            }
            if (var1_4 >= this.floatingGhostPosition.length) ** GOTO lbl80
            if (var2_3) ** GOTO lbl27
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jlqd", jjht(int ), (int)124)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == js.jjfn("jlqe", jjfk(int ), (int)830)) break;
                        v4 /* !! */  = (long)js.jjfn("jlqf", jjfk(int ), (int)831);
                    }
                    this.floatingGhostPosition[var1_4] = null;
                    if (var2_3 || var2_3) ** GOTO lbl27
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_4 = js.rm - js.jjfn("jlqg", jjht(int ), (int)125)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == js.jjfn("jlqh", jjfk(int ), (int)832)) break;
                        v5 /* !! */  = (long)js.jjfn("jlqi", jjfk(int ), (int)833);
                    }
                    v6 = this.floatingGhostTrails[var1_4];
                    v7 /* !! */  = js.rm;
                    if (true) ** GOTO lbl65
                    block36: while (true) {
                        v7 /* !! */  = (long)(v8 - js.jjfn("jlqj", jjht(int ), (int)126));
lbl65:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1540497968: {
                                v8 = js.jjfn("jlqk", jjht(int ), (int)127);
                                continue block36;
                            }
                            case 21062095: {
                                v8 = js.jjfn("jlql", jjht(int ), (int)128);
                                continue block36;
                            }
                            case 458795960: {
                                break block36;
                            }
                        }
                        break;
                    }
                    v6.clear();
                    if (var2_3 || var2_3) ** GOTO lbl27
                    ++var1_4;
                    if (var2_3) ** GOTO lbl27
                    if (!var4_1) continue block32;
                    throw null;
                }
lbl80:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
lbl83:
                // 3 sources

                case 0: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqm", jjfk(int ), (int)834);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl121
                }
lbl88:
                // 2 sources

                case 1: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqn", jjfk(int ), (int)835);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)js.jjfn("jlqo", jjfk(int ), (int)836);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl112
                        break;
                    }
                }
lbl99:
                // 2 sources

                case 3: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqp", jjfk(int ), (int)837);
                    if (!var4_1) ** GOTO lbl88
                    throw null;
                }
                case 4: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqq", jjfk(int ), (int)838);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl107:
                // 4 sources

                case 5: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqr", jjfk(int ), (int)839);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl112:
                // 3 sources

                case 6: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqs", jjfk(int ), (int)840);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
                case 7: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqt", jjfk(int ), (int)841);
                    if (!var4_1) break block32;
                    throw null;
                }
lbl121:
                // 2 sources

                case 8: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqu", jjfk(int ), (int)842);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
                case 9: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqv", jjfk(int ), (int)843);
                    if (!var4_1) ** GOTO lbl83
                    throw null;
                }
                case 10: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqw", jjfk(int ), (int)844);
                    if (!var4_1) ** GOTO lbl107
                    throw null;
                }
lbl134:
                // 2 sources

                case 11: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqx", jjfk(int ), (int)845);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl147
                }
lbl139:
                // 3 sources

                case 12: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqy", jjfk(int ), (int)846);
                    if (!var4_1) ** GOTO lbl83
                    throw null;
                }
lbl143:
                // 3 sources

                case 13: {
                    var3_2 /* !! */  = (int)js.jjfn("jlqz", jjfk(int ), (int)847);
                    if (!var4_1) ** GOTO lbl134
                    throw null;
                }
lbl147:
                // 2 sources

                case 14: {
                    var3_2 /* !! */  = (int)js.jjfn("jlra", jjfk(int ), (int)848);
                    if (!var4_1) ** GOTO lbl99
                    throw null;
                }
                case 15: {
                    var3_2 /* !! */  = (int)js.jjfn("jlrb", jjfk(int ), (int)849);
                    if (!var4_1) ** GOTO lbl143
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var3_2 /* !! */  = (int)js.jjfn("jlrc", jjfk(int ), (int)850);
        ** while (!var4_1)
lbl158:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmzg() {
        js.jjfm[700] = -1821532874;
        js.jjfm[701] = -1496867044;
        js.jjfm[702] = -1402823556;
        js.jjfm[703] = -384435940;
        js.jjfm[704] = -1560336539;
        js.jjfm[705] = 1686078243;
        js.jjfm[706] = 1331329576;
        js.jjfm[707] = -1920464763;
        js.jjfm[708] = 1695414508;
        js.jjfm[709] = -1850738332;
        js.jjfm[710] = -1605941179;
        js.jjfm[711] = 2032560999;
        js.jjfm[712] = 264935813;
        js.jjfm[713] = -1443698500;
        js.jjfm[714] = 1193595161;
        js.jjfm[715] = 1191024346;
        js.jjfm[716] = -1181165984;
        js.jjfm[717] = 932625359;
        js.jjfm[718] = -1160798182;
        js.jjfm[719] = 986528271;
        js.jjfm[720] = 136702190;
        js.jjfm[721] = -2127974881;
        js.jjfm[722] = -627824235;
        js.jjfm[723] = -941474143;
        js.jjfm[724] = -1661594973;
        js.jjfm[725] = -1939392901;
        js.jjfm[726] = 903435797;
        js.jjfm[727] = -2044724688;
        js.jjfm[728] = -1186352898;
        js.jjfm[729] = -1569905484;
        js.jjfm[730] = -1990336501;
        js.jjfm[731] = 846357808;
        js.jjfm[732] = 1869680070;
        js.jjfm[733] = -1808243050;
        js.jjfm[734] = 708536235;
        js.jjfm[735] = 288123646;
        js.jjfm[736] = 1800826773;
        js.jjfm[737] = -638277610;
        js.jjfm[738] = -1397989101;
        js.jjfm[739] = -2056083660;
        js.jjfm[740] = -1300615527;
        js.jjfm[741] = -391560505;
        js.jjfm[742] = 348143794;
        js.jjfm[743] = 1376003133;
        js.jjfm[744] = -1659580007;
        js.jjfm[745] = 595669139;
        js.jjfm[746] = 201034215;
        js.jjfm[747] = -222826709;
        js.jjfm[748] = -489720010;
        js.jjfm[749] = -141363802;
        js.jjfm[750] = -1768447000;
        js.jjfm[751] = 471831751;
        js.jjfm[752] = -1782378637;
        js.jjfm[753] = -2048346707;
        js.jjfm[754] = 1609603301;
        js.jjfm[755] = 1294719977;
        js.jjfm[756] = -1032640137;
        js.jjfm[757] = -1093146560;
        js.jjfm[758] = 502080364;
        js.jjfm[759] = -1364045558;
        js.jjfm[760] = -1686021744;
        js.jjfm[761] = -1363451749;
        js.jjfm[762] = -1861243378;
        js.jjfm[763] = 1132951319;
        js.jjfm[764] = 1478654843;
        js.jjfm[765] = -1642488684;
        js.jjfm[766] = 10824003;
        js.jjfm[767] = -1026903673;
        js.jjfm[768] = 2100253922;
        js.jjfm[769] = 1768722121;
        js.jjfm[770] = -1703879798;
        js.jjfm[771] = -901891153;
        js.jjfm[772] = 775838757;
        js.jjfm[773] = 1717524504;
        js.jjfm[774] = 293769172;
        js.jjfm[775] = 1767293268;
        js.jjfm[776] = 1724688221;
        js.jjfm[777] = 1353294931;
        js.jjfm[778] = 450283042;
        js.jjfm[779] = 743664770;
        js.jjfm[780] = -413644899;
        js.jjfm[781] = 116891188;
        js.jjfm[782] = -1103705492;
        js.jjfm[783] = -1301775205;
        js.jjfm[784] = 128881786;
        js.jjfm[785] = -2084000114;
        js.jjfm[786] = -926362171;
        js.jjfm[787] = -1206666574;
        js.jjfm[788] = 315960269;
        js.jjfm[789] = 371096261;
        js.jjfm[790] = 1394515387;
        js.jjfm[791] = 676552473;
        js.jjfm[792] = -367220297;
        js.jjfm[793] = -1116154240;
        js.jjfm[794] = 814937603;
        js.jjfm[795] = -504546248;
        js.jjfm[796] = 1213750500;
        js.jjfm[797] = -80569188;
        js.jjfm[798] = 397240406;
        js.jjfm[799] = 578634400;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$7() {
        block38: {
            v0 /* !! */  = js.rm;
            block26: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case 458795960: {
                        break block26;
                    }
                    case 2025127422: {
                        v0 /* !! */  = (long)(js.jjfn("jmpe", jjht(int ), (int)209) - js.jjfn("jmpd", jjht(int ), (int)208));
                        continue block26;
                    }
                }
                break;
            }
            var3_1 = js.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmpf", jjht(int ), (int)210)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == js.jjfn("jmpg", jjfk(int ), (int)1023)) break;
                v1 /* !! */  = (long)js.jjfn("jmph", jjfk(int ), (int)1024);
            }
            var2_2 /* !! */  = js.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmpi", jjht(int ), (int)211)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == js.jjfn("jmpj", jjfk(int ), (int)1025)) {
                    var1_3 = js.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)js.jjfn("jmpk", jjfk(int ), (int)1026);
            }
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block29: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        v3 /* !! */  = js.rm;
                        block30: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1329718183: {
                                    v4 = js.jjfn("jmpm", jjht(int ), (int)213);
                                    ** GOTO lbl42
                                }
                                case 458795960: {
                                    break block30;
                                }
                                case 1140685491: {
                                    v4 = js.jjfn("jmpn", jjht(int ), (int)214);
lbl42:
                                    // 2 sources

                                    v3 /* !! */  = (long)(v4 - js.jjfn("jmpl", jjht(int ), (int)212));
                                    continue block30;
                                }
                            }
                            break;
                        }
                        v5 /* !! */  = js.rm;
                        block31: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -671194635: {
                                    v6 = js.jjfn("jmpp", jjht(int ), (int)216);
                                    ** GOTO lbl57
                                }
                                case 458795960: {
                                    break block31;
                                }
                                case 1259352571: {
                                    v6 = js.jjfn("jmpq", jjht(int ), (int)217);
                                    ** GOTO lbl57
                                }
                                case 1407435210: {
                                    v6 = js.jjfn("jmpr", jjht(int ), (int)218);
lbl57:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - js.jjfn("jmpo", jjht(int ), (int)215));
                                    continue block31;
                                }
                            }
                            break;
                        }
                        v7 = this.mode.isSelected("\u041a\u043e\u043b\u044c\u0446\u043e");
                        v8 /* !! */  = js.rm;
                        block32: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case 458795960: {
                                    return v7;
                                }
                                case 785137887: {
                                    v9 = js.jjfn("jmpt", jjht(int ), (int)220);
                                    ** GOTO lbl70
                                }
                                case 1870161851: {
                                    v9 = js.jjfn("jmpu", jjht(int ), (int)221);
lbl70:
                                    // 2 sources

                                    v8 /* !! */  = (long)(v9 - js.jjfn("jmps", jjht(int ), (int)219));
                                    continue block32;
                                }
                            }
                            break;
                        }
                        return v7;
                    }
                    case 0: {
                        do {
                            var2_2 /* !! */  = (int)js.jjfn("jmpv", jjfk(int ), (int)1027);
                        } while (!var3_1);
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block38;
                    }
lbl82:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)js.jjfn("jmpw", jjfk(int ), (int)1028);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block29;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)js.jjfn("jmpx", jjfk(int ), (int)1029);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)js.jjfn("jmpy", jjfk(int ), (int)1030);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmys() {
        js.jjfl[500] = -1676346007;
        js.jjfl[501] = -179486967;
        js.jjfl[502] = 636736940;
        js.jjfl[503] = -1307447380;
        js.jjfl[504] = -2019921951;
        js.jjfl[505] = -812613643;
        js.jjfl[506] = -833432406;
        js.jjfl[507] = -431639924;
        js.jjfl[508] = 1214905321;
        js.jjfl[509] = 1846454850;
        js.jjfl[510] = 159823555;
        js.jjfl[511] = -217787673;
        js.jjfl[512] = -1975513772;
        js.jjfl[513] = -817649075;
        js.jjfl[514] = -1773531708;
        js.jjfl[515] = 255096088;
        js.jjfl[516] = -1119054170;
        js.jjfl[517] = -656517008;
        js.jjfl[518] = -1130293503;
        js.jjfl[519] = -1650584805;
        js.jjfl[520] = 1909736850;
        js.jjfl[521] = -1040032247;
        js.jjfl[522] = -1066704734;
        js.jjfl[523] = 1213917038;
        js.jjfl[524] = -1272688647;
        js.jjfl[525] = 1679303434;
        js.jjfl[526] = 1207045302;
        js.jjfl[527] = -255273903;
        js.jjfl[528] = -1325506512;
        js.jjfl[529] = -1900286065;
        js.jjfl[530] = 1157484164;
        js.jjfl[531] = 1470044963;
        js.jjfl[532] = 150367422;
        js.jjfl[533] = 381469919;
        js.jjfl[534] = -1441921498;
        js.jjfl[535] = -750098119;
        js.jjfl[536] = -2137755694;
        js.jjfl[537] = 36607144;
        js.jjfl[538] = -352544177;
        js.jjfl[539] = -316856273;
        js.jjfl[540] = 933776966;
        js.jjfl[541] = -1550135251;
        js.jjfl[542] = 2129689568;
        js.jjfl[543] = -111538431;
        js.jjfl[544] = -732008163;
        js.jjfl[545] = -1751808318;
        js.jjfl[546] = -80022655;
        js.jjfl[547] = -1343467112;
        js.jjfl[548] = 1787285726;
        js.jjfl[549] = -911442759;
        js.jjfl[550] = -103145738;
        js.jjfl[551] = 84017782;
        js.jjfl[552] = -1250920645;
        js.jjfl[553] = -83297687;
        js.jjfl[554] = -2061682102;
        js.jjfl[555] = 1727166798;
        js.jjfl[556] = 382452662;
        js.jjfl[557] = -982236869;
        js.jjfl[558] = -896686000;
        js.jjfl[559] = -1826367967;
        js.jjfl[560] = -672274630;
        js.jjfl[561] = -67511276;
        js.jjfl[562] = 470404640;
        js.jjfl[563] = 859826562;
        js.jjfl[564] = 1207856448;
        js.jjfl[565] = 1180843598;
        js.jjfl[566] = -450023355;
        js.jjfl[567] = -935712607;
        js.jjfl[568] = 1783088672;
        js.jjfl[569] = 1232299624;
        js.jjfl[570] = -151818053;
        js.jjfl[571] = 1185770249;
        js.jjfl[572] = 662970541;
        js.jjfl[573] = -225675293;
        js.jjfl[574] = 171578604;
        js.jjfl[575] = 2033294747;
        js.jjfl[576] = 206050205;
        js.jjfl[577] = 487358725;
        js.jjfl[578] = 1704932326;
        js.jjfl[579] = 1589029128;
        js.jjfl[580] = 28302706;
        js.jjfl[581] = -1035739121;
        js.jjfl[582] = 1517908796;
        js.jjfl[583] = 2113089525;
        js.jjfl[584] = -1803798728;
        js.jjfl[585] = -323815380;
        js.jjfl[586] = -1584924284;
        js.jjfl[587] = -1036261309;
        js.jjfl[588] = 962120585;
        js.jjfl[589] = -1737409098;
        js.jjfl[590] = -1891665698;
        js.jjfl[591] = 438462046;
        js.jjfl[592] = 766116614;
        js.jjfl[593] = -1301018926;
        js.jjfl[594] = 1816689034;
        js.jjfl[595] = 621544485;
        js.jjfl[596] = -199771916;
        js.jjfl[597] = -1754098006;
        js.jjfl[598] = -213504702;
        js.jjfl[599] = -31479142;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float approach(float var0, float var1_1, float var2_2) {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(js.jjfn("jmlj", jjht(int ), (int)162) - js.jjfn("jmli", jjht(int ), (int)161));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -73960874: {
                    continue block16;
                }
                case 458795960: {
                    break block16;
                }
            }
            break;
        }
        var5_3 = js.c;
        v1 /* !! */  = js.rm;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - js.jjfn("jmlk", jjht(int ), (int)163));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -702999295: {
                    v2 = js.jjfn("jmll", jjht(int ), (int)164);
                    continue block17;
                }
                case -501690354: {
                    v2 = js.jjfn("jmlm", jjht(int ), (int)165);
                    continue block17;
                }
                case 26273604: {
                    v2 = js.jjfn("jmln", jjht(int ), (int)166);
                    continue block17;
                }
                case 458795960: {
                    break block17;
                }
            }
            break;
        }
        var4_4 /* !! */  = js.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmlo", jjht(int ), (int)167)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == js.jjfn("jmlp", jjfk(int ), (int)971)) break;
            v3 /* !! */  = (long)js.jjfn("jmlq", jjfk(int ), (int)972);
        }
        var3_5 = js.a;
        if (var5_3) {
            throw null;
lbl37:
            // 2 sources

            return (float)js.jjfn("jmlr", jjfp(int ), (int)973);
        }
        if (var3_5) ** GOTO lbl37
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmls", jjht(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == js.jjfn("jmlt", jjfk(int ), (int)974)) break;
                    v4 /* !! */  = (long)js.jjfn("jmlu", jjfk(int ), (int)975);
                }
                return var0 + (var1_1 - var0) * class_3532.method_15363((float)var2_2, (float)0.0f, (float)1.0f);
            }
lbl51:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)js.jjfn("jmlv", jjfk(int ), (int)976);
                if (!var5_3) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)js.jjfn("jmlw", jjfk(int ), (int)977);
                    if (!var5_3) ** GOTO lbl51
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)js.jjfn("jmlx", jjfk(int ), (int)978);
                if (!var5_3) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)js.jjfn("jmly", jjfk(int ), (int)979);
        ** while (!var5_3)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmyo() {
        js.jjfl[100] = 229088534;
        js.jjfl[101] = 883767994;
        js.jjfl[102] = 1275638470;
        js.jjfl[103] = -1177784363;
        js.jjfl[104] = -592423681;
        js.jjfl[105] = -484530859;
        js.jjfl[106] = -1519176913;
        js.jjfl[107] = -1067116960;
        js.jjfl[108] = 365674478;
        js.jjfl[109] = 1949228489;
        js.jjfl[110] = -1380849334;
        js.jjfl[111] = -1254188501;
        js.jjfl[112] = -925082877;
        js.jjfl[113] = -641473096;
        js.jjfl[114] = -1159476239;
        js.jjfl[115] = -1831970344;
        js.jjfl[116] = -973293455;
        js.jjfl[117] = -41205065;
        js.jjfl[118] = -2110216166;
        js.jjfl[119] = -2353565;
        js.jjfl[120] = -961317736;
        js.jjfl[121] = -804793889;
        js.jjfl[122] = 596124995;
        js.jjfl[123] = -1775410989;
        js.jjfl[124] = 778711478;
        js.jjfl[125] = -762092500;
        js.jjfl[126] = 894536087;
        js.jjfl[127] = -1799896369;
        js.jjfl[128] = 632369447;
        js.jjfl[129] = 927396577;
        js.jjfl[130] = -452947015;
        js.jjfl[131] = 121284950;
        js.jjfl[132] = 1347384980;
        js.jjfl[133] = -308973661;
        js.jjfl[134] = -363602511;
        js.jjfl[135] = 1975334204;
        js.jjfl[136] = -2084991225;
        js.jjfl[137] = -1970101184;
        js.jjfl[138] = 2139461446;
        js.jjfl[139] = 1568369552;
        js.jjfl[140] = -1601736846;
        js.jjfl[141] = -509570316;
        js.jjfl[142] = 44013930;
        js.jjfl[143] = 2106684957;
        js.jjfl[144] = -1742472815;
        js.jjfl[145] = 450053991;
        js.jjfl[146] = -747630460;
        js.jjfl[147] = -882183123;
        js.jjfl[148] = 779560688;
        js.jjfl[149] = -117171386;
        js.jjfl[150] = 1831096716;
        js.jjfl[151] = 1223129705;
        js.jjfl[152] = -940189168;
        js.jjfl[153] = -7681188;
        js.jjfl[154] = 1726186785;
        js.jjfl[155] = 126144365;
        js.jjfl[156] = -1919884200;
        js.jjfl[157] = 2353138;
        js.jjfl[158] = -1139062328;
        js.jjfl[159] = 603094086;
        js.jjfl[160] = 61782195;
        js.jjfl[161] = -504266009;
        js.jjfl[162] = -2016644190;
        js.jjfl[163] = 729400296;
        js.jjfl[164] = 1710347549;
        js.jjfl[165] = -738451304;
        js.jjfl[166] = -834237429;
        js.jjfl[167] = 333453499;
        js.jjfl[168] = 1497886047;
        js.jjfl[169] = -1788393071;
        js.jjfl[170] = 1520744396;
        js.jjfl[171] = 370777004;
        js.jjfl[172] = -555990097;
        js.jjfl[173] = -1662104527;
        js.jjfl[174] = 1900485685;
        js.jjfl[175] = 1736721996;
        js.jjfl[176] = -1756766745;
        js.jjfl[177] = 359858105;
        js.jjfl[178] = -1028652879;
        js.jjfl[179] = 62636357;
        js.jjfl[180] = -334471245;
        js.jjfl[181] = 1471261155;
        js.jjfl[182] = -1025757784;
        js.jjfl[183] = -1247734564;
        js.jjfl[184] = 1478021606;
        js.jjfl[185] = -1899345864;
        js.jjfl[186] = 883053307;
        js.jjfl[187] = 3188526;
        js.jjfl[188] = -448424017;
        js.jjfl[189] = -276766028;
        js.jjfl[190] = 1058894770;
        js.jjfl[191] = -764132950;
        js.jjfl[192] = -824487797;
        js.jjfl[193] = -1910790019;
        js.jjfl[194] = -253583444;
        js.jjfl[195] = 1820722481;
        js.jjfl[196] = -1253671024;
        js.jjfl[197] = -1243675634;
        js.jjfl[198] = 1510112615;
        js.jjfl[199] = 292853573;
    }

    private static /* synthetic */ void jmyp() {
        js.jjfl[200] = -1180953534;
        js.jjfl[201] = 1284826384;
        js.jjfl[202] = -690264340;
        js.jjfl[203] = 304603189;
        js.jjfl[204] = 1550929155;
        js.jjfl[205] = 1972229604;
        js.jjfl[206] = 986259814;
        js.jjfl[207] = 459875672;
        js.jjfl[208] = -292977051;
        js.jjfl[209] = 1465893338;
        js.jjfl[210] = -16028368;
        js.jjfl[211] = 606627644;
        js.jjfl[212] = 2023677229;
        js.jjfl[213] = -1215336828;
        js.jjfl[214] = -1341326535;
        js.jjfl[215] = -1136378656;
        js.jjfl[216] = 343200541;
        js.jjfl[217] = 2089746979;
        js.jjfl[218] = -1916239538;
        js.jjfl[219] = 515414825;
        js.jjfl[220] = 45239376;
        js.jjfl[221] = 307047382;
        js.jjfl[222] = -1147013117;
        js.jjfl[223] = 1332495919;
        js.jjfl[224] = 955419430;
        js.jjfl[225] = -46808899;
        js.jjfl[226] = -1125757801;
        js.jjfl[227] = -1407464004;
        js.jjfl[228] = 2018713516;
        js.jjfl[229] = -2076317820;
        js.jjfl[230] = 629404121;
        js.jjfl[231] = -597924877;
        js.jjfl[232] = 549376112;
        js.jjfl[233] = -2120018039;
        js.jjfl[234] = 1632049193;
        js.jjfl[235] = 838604206;
        js.jjfl[236] = -1191350300;
        js.jjfl[237] = 1315209052;
        js.jjfl[238] = -527959174;
        js.jjfl[239] = -1371012975;
        js.jjfl[240] = -1830354927;
        js.jjfl[241] = -1063027043;
        js.jjfl[242] = -1938064053;
        js.jjfl[243] = -1565653976;
        js.jjfl[244] = 991021277;
        js.jjfl[245] = -721759566;
        js.jjfl[246] = 1258842179;
        js.jjfl[247] = 1764306422;
        js.jjfl[248] = 1407372604;
        js.jjfl[249] = 1473475707;
        js.jjfl[250] = -95838521;
        js.jjfl[251] = -109904269;
        js.jjfl[252] = -1108938053;
        js.jjfl[253] = -2144833299;
        js.jjfl[254] = -1926413261;
        js.jjfl[255] = -2118866297;
        js.jjfl[256] = 842248128;
        js.jjfl[257] = -196779138;
        js.jjfl[258] = 90378272;
        js.jjfl[259] = -857548540;
        js.jjfl[260] = -1847161468;
        js.jjfl[261] = -900281027;
        js.jjfl[262] = -2093338504;
        js.jjfl[263] = -588877219;
        js.jjfl[264] = -395017956;
        js.jjfl[265] = 1120076062;
        js.jjfl[266] = -483304637;
        js.jjfl[267] = -976595354;
        js.jjfl[268] = 1510367818;
        js.jjfl[269] = 1450809161;
        js.jjfl[270] = 1208089331;
        js.jjfl[271] = -766572287;
        js.jjfl[272] = 925893193;
        js.jjfl[273] = -741172497;
        js.jjfl[274] = -1726377984;
        js.jjfl[275] = -155013400;
        js.jjfl[276] = 2015602283;
        js.jjfl[277] = 947251038;
        js.jjfl[278] = -419252832;
        js.jjfl[279] = -22440223;
        js.jjfl[280] = 284304419;
        js.jjfl[281] = -39073372;
        js.jjfl[282] = -727856436;
        js.jjfl[283] = 388779728;
        js.jjfl[284] = 2083010227;
        js.jjfl[285] = -919022244;
        js.jjfl[286] = 508421655;
        js.jjfl[287] = -1080891402;
        js.jjfl[288] = -681090667;
        js.jjfl[289] = -1549668690;
        js.jjfl[290] = 874335448;
        js.jjfl[291] = -1036028544;
        js.jjfl[292] = -942122081;
        js.jjfl[293] = -1496460990;
        js.jjfl[294] = 266757971;
        js.jjfl[295] = 747395517;
        js.jjfl[296] = 2088487108;
        js.jjfl[297] = 1636139822;
        js.jjfl[298] = -362222234;
        js.jjfl[299] = -1993584032;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmxp", jjht(int ), (int)314)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == js.jjfn("jmxq", jjfk(int ), (int)1137)) break;
            v0 /* !! */  = (long)js.jjfn("jmxr", jjfk(int ), (int)1138);
        }
        var3_1 = js.c;
        v1 /* !! */  = js.rm;
        block29: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 458795960: {
                    break block29;
                }
                case 1678059649: {
                    v1 /* !! */  = (long)(js.jjfn("jmxt", jjht(int ), (int)316) - js.jjfn("jmxs", jjht(int ), (int)315));
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = js.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmxu", jjht(int ), (int)317)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == js.jjfn("jmxv", jjfk(int ), (int)1139)) {
                var1_3 = js.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)js.jjfn("jmxw", jjfk(int ), (int)1140);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                v3 /* !! */  = js.rm;
                block31: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -1751029511: {
                            v4 = js.jjfn("jmxy", jjht(int ), (int)319);
                            ** GOTO lbl43
                        }
                        case 458795960: {
                            break block31;
                        }
                        case 536371560: {
                            v4 = js.jjfn("jmxz", jjht(int ), (int)320);
                            ** GOTO lbl43
                        }
                        case 636744052: {
                            v4 = js.jjfn("jmya", jjht(int ), (int)321);
lbl43:
                            // 3 sources

                            v3 /* !! */  = (long)(v4 - js.jjfn("jmxx", jjht(int ), (int)318));
                            continue block31;
                        }
                    }
                    break;
                }
                v5 /* !! */  = js.rm;
                block32: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1523311405: {
                            v6 = js.jjfn("jmyc", jjht(int ), (int)323);
                            ** GOTO lbl56
                        }
                        case -375688590: {
                            v6 = js.jjfn("jmyd", jjht(int ), (int)324);
                            ** GOTO lbl56
                        }
                        case -202314259: {
                            v6 = js.jjfn("jmye", jjht(int ), (int)325);
lbl56:
                            // 3 sources

                            v5 /* !! */  = (long)(v6 - js.jjfn("jmyb", jjht(int ), (int)322));
                            continue block32;
                        }
                        case 458795960: {
                            break block32;
                        }
                    }
                    break;
                }
                v7 = this.mode.isSelected("Ghosts");
                v8 /* !! */  = js.rm;
                block33: while (true) {
                    switch ((int)v8 /* !! */ ) {
                        case -1791930634: {
                            v9 = js.jjfn("jmyg", jjht(int ), (int)327);
                            ** GOTO lbl74
                        }
                        case -499095408: {
                            v9 = js.jjfn("jmyh", jjht(int ), (int)328);
                            ** GOTO lbl74
                        }
                        case 458795960: {
                            return v7;
                        }
                        case 1392964506: {
                            v9 = js.jjfn("jmyi", jjht(int ), (int)329);
lbl74:
                            // 3 sources

                            v8 /* !! */  = (long)(v9 - js.jjfn("jmyf", jjht(int ), (int)326));
                            continue block33;
                        }
                    }
                    break;
                }
                return v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmyj", jjfk(int ), (int)1141);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl87
            }
            case 3: {
                var2_2 /* !! */  = (int)js.jjfn("jmym", jjfk(int ), (int)1144);
                if (var3_1) {
                    throw null;
                }
lbl87:
                // 3 sources

                var2_2 /* !! */  = (int)js.jjfn("jmyk", jjfk(int ), (int)1142);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)js.jjfn("jmyl", jjfk(int ), (int)1143);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderLightning(class_1309 var1_1, class_243 var2_2, int var3_3, float var4_4) {
        var77_5 = js.c;
        var76_6 /* !! */  = js.b;
        var75_7 = js.a;
        if (var77_5) {
            throw null;
lbl6:
            // 82 sources

            return;
        }
        if (var75_7 || var75_7) ** GOTO lbl6
        var5_8 = System.currentTimeMillis();
        if (var75_7 || var75_7) ** GOTO lbl6
        var7_9 = Math.max(1.0, (double)var1_1.method_17682());
        if (var75_7 || var75_7) ** GOTO lbl6
        var9_10 = Math.max((double)js.jjfn("jjwv", jjsd(int ), (int)43), (double)var1_1.method_17681() * js.jjfn("jjww", jjsd(int ), (int)44));
        if (var75_7 || var75_7) ** GOTO lbl6
        var11_11 = js.jjfn("jjwx", jjfk(int ), (int)401);
        if (var75_7 || var75_7) ** GOTO lbl6
        var12_12 = js.jjfn("jjwy", jjfk(int ), (int)402);
        if (var75_7 || var75_7) ** GOTO lbl6
        lu.begin((boolean)js.jjfn("jjwz", jjfk(int ), (int)403));
        if (var75_7 || var75_7) ** GOTO lbl6
        var13_13 = js.jjfn("jjxa", jjfk(int ), (int)404);
        if (var75_7) ** GOTO lbl6
        block160: while (true) {
            block325: {
                block324: {
                    block323: {
                        block322: {
                            block321: {
                                block316: {
                                    block320: {
                                        block319: {
                                            block318: {
                                                block317: {
                                                    block315: {
                                                        block314: {
                                                            block313: {
                                                                block312: {
                                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                                    if (var13_13 >= var11_11) ** GOTO lbl217
                                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                                    var14_14 = js.jjfn("jjxb", jjht(int ), (int)45);
                                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                                    var16_15 = Math.floorDiv(var5_8, (long)var14_14);
                                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                                    var18_16 = (double)Math.floorMod(var5_8, (long)var14_14) - (double)var13_13 * js.jjfn("jjxc", jjsd(int ), (int)46);
                                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                                    var20_17 = js.jjfn("jjxd", jjsd(int ), (int)47);
                                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                                    if (var18_16 < 0.0) ** GOTO lbl212
                                                                    if (var75_7) ** GOTO lbl6
                                                                    if (!(var18_16 >= var20_17)) break block312;
                                                                    if (var75_7) ** GOTO lbl6
                                                                    if (var77_5) {
                                                                        throw null;
                                                                    }
                                                                    ** GOTO lbl212
                                                                }
                                                                if (var75_7 || var75_7) ** GOTO lbl6
                                                                var22_18 = (float)class_3532.method_15350((double)(var18_16 / js.jjfn("jkwb", jjsd(int ), (int)48)), (double)0.0, (double)1.0);
                                                                if (var75_7 || var75_7) ** GOTO lbl6
                                                                var23_19 = 1.0f - (float)js.smoothStep(class_3532.method_15350((double)((var18_16 - js.jjfn("jkwc", jjsd(int ), (int)49)) / (var20_17 - js.jjfn("jkwd", jjsd(int ), (int)50))), (double)0.0, (double)1.0));
                                                                if (var75_7 || var75_7) ** GOTO lbl6
                                                                var24_20 = js.jjfn("jkwe", jjfp(int ), (int)405) + js.jjfn("jkwf", jjfp(int ), (int)406) * (float)Math.sin(var18_16 * js.jjfn("jkwg", jjsd(int ), (int)51) + (double)var13_13 * js.jjfn("jkwh", jjsd(int ), (int)52));
                                                                if (var75_7 || var75_7) ** GOTO lbl6
                                                                var25_21 = var22_18 * var23_19 * var24_20 * this.appearance * js.jjfn("jkwi", jjfp(int ), (int)407);
                                                                if (var75_7 || var75_7) ** GOTO lbl6
                                                                if (!(var25_21 <= js.jjfn("jkwj", jjfp(int ), (int)408))) break block313;
                                                                if (var75_7) ** GOTO lbl6
                                                                if (var77_5) {
                                                                    throw null;
                                                                }
                                                                ** GOTO lbl212
                                                            }
                                                            if (var75_7 || var75_7) ** GOTO lbl6
                                                            var26_22 = js.lightningNoise((int)var13_13, (int)js.jjfn("jkwk", jjfk(int ), (int)409), var16_15, (int)js.jjfn("jkwl", jjfk(int ), (int)410));
                                                            if (var75_7 || var75_7) ** GOTO lbl6
                                                            var28_23 = js.lightningNoise((int)var13_13, (int)js.jjfn("jkwm", jjfk(int ), (int)411), var16_15, (int)js.jjfn("jkwn", jjfk(int ), (int)412));
                                                            if (var75_7 || var75_7) ** GOTO lbl6
                                                            var30_24 = js.lightningNoise((int)var13_13, (int)js.jjfn("jkwo", jjfk(int ), (int)413), var16_15, (int)js.jjfn("jkwp", jjfk(int ), (int)414));
                                                            if (var75_7 || var75_7) ** GOTO lbl6
                                                            var32_25 = var26_22 * js.jjfn("jkwq", jjsd(int ), (int)53) + js.jjfn("jkwr", jjsd(int ), (int)54);
                                                            if (var75_7 || var75_7) ** GOTO lbl6
                                                            if ((var13_13 & js.jjfn("jkws", jjfk(int ), (int)415)) != 0) break block314;
                                                            if (var75_7) ** GOTO lbl6
                                                            v0 = js.jjfn("jkwt", jjfk(int ), (int)416);
                                                            if (var77_5) {
                                                                throw null;
                                                            }
                                                            break block315;
                                                        }
                                                        if (var75_7 || var75_7) ** GOTO lbl6
                                                        v0 = var34_26 = js.jjfn("jkwu", jjfk(int ), (int)417);
                                                    }
                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                    if (var34_26 == false) break block316;
                                                    if (var75_7 || var75_7) ** GOTO lbl6
                                                    if (!(var28_23 >= 0.0)) break block317;
                                                    if (var75_7) ** GOTO lbl6
                                                    v1 = 1.0;
                                                    if (var77_5) {
                                                        throw null;
                                                    }
                                                    break block318;
                                                }
                                                if (var75_7 || var75_7) ** GOTO lbl6
                                                v1 = var39_29 = (double)js.jjfn("jkwv", jjsd(int ), (int)55);
                                            }
                                            if (var75_7 || var75_7) ** GOTO lbl6
                                            var35_27 = var39_29 * (js.jjfn("jkww", jjsd(int ), (int)56) + Math.abs(var28_23) * js.jjfn("jkwx", jjsd(int ), (int)57));
                                            if (var75_7 || var75_7) ** GOTO lbl6
                                            if (!(var39_29 > 0.0)) break block319;
                                            if (var75_7 || var75_7) ** GOTO lbl6
                                            v2 = js.jjfn("jkwy", jjsd(int ), (int)58) + var32_25 * js.jjfn("jkwz", jjsd(int ), (int)59);
                                            if (var77_5) {
                                                throw null;
                                            }
                                            break block320;
                                        }
                                        if (var75_7 || var75_7) ** GOTO lbl6
                                        v2 = var37_28 = js.jjfn("jkxa", jjsd(int ), (int)60) + var32_25 * js.jjfn("jkxb", jjsd(int ), (int)61);
                                    }
                                    if (var75_7 || var75_7) ** GOTO lbl6
                                    if (var77_5) {
                                        throw null;
                                    }
                                    break block321;
                                }
                                if (var75_7 || var75_7) ** GOTO lbl6
                                var35_27 = var28_23 * js.jjfn("jkxc", jjsd(int ), (int)62);
                                if (var75_7 || var75_7) ** GOTO lbl6
                                var37_28 = js.jjfn("jkxd", jjsd(int ), (int)63) + var32_25 * js.jjfn("jkxe", jjsd(int ), (int)64);
                                if (var75_7) ** GOTO lbl6
                            }
                            if (var75_7 || var75_7) ** GOTO lbl6
                            var39_29 = var2_2.field_1351 + var7_9 * var37_28;
                            if (var75_7 || var75_7) ** GOTO lbl6
                            if ((var13_13 & js.jjfn("jkxf", jjfk(int ), (int)418)) != 0) break block322;
                            if (var75_7) ** GOTO lbl6
                            v3 = 1.0;
                            if (var77_5) {
                                throw null;
                            }
                            break block323;
                        }
                        if (var75_7 || var75_7) ** GOTO lbl6
                        v3 = var41_30 = (double)js.jjfn("jkxg", jjsd(int ), (int)65);
                    }
                    if (var75_7 || var75_7) ** GOTO lbl6
                    if (var34_26 != false) {
                        v4 = js.jjfn("jkxh", jjsd(int ), (int)66) + Math.abs(var30_24) * js.jjfn("jkxi", jjsd(int ), (int)67);
                        if (var77_5) {
                            throw null;
                        }
                    } else {
                        v4 = js.jjfn("jkxj", jjsd(int ), (int)68) + Math.abs(var30_24) * js.jjfn("jkxk", jjsd(int ), (int)69);
                    }
                    var43_31 = var41_30 * v4;
                    if (var75_7 || var75_7) ** GOTO lbl6
                    var45_32 = (double)var13_13 * (js.jjfn("jkxl", jjsd(int ), (int)70) / (double)var11_11) + var30_24 * js.jjfn("jkxm", jjsd(int ), (int)71) + js.lightningNoise((int)var13_13, (int)js.jjfn("jkxn", jjfk(int ), (int)419), var16_15, (int)js.jjfn("jkxo", jjfk(int ), (int)420)) * js.jjfn("jkxp", jjsd(int ), (int)72);
                    if (var75_7 || var75_7) ** GOTO lbl6
                    if (var13_13 % js.jjfn("jkxq", jjfk(int ), (int)421) != false) break block324;
                    if (var75_7) ** GOTO lbl6
                    v5 = js.jjfn("jkxr", jjsd(int ), (int)73);
                    if (var77_5) {
                        throw null;
                    }
                    break block325;
                }
                if (var75_7 || var75_7) ** GOTO lbl6
                v5 = var47_33 = js.jjfn("jkxs", jjsd(int ), (int)74);
            }
            if (var75_7 || var75_7) ** GOTO lbl6
            var49_34 = null;
            if (var75_7 || var75_7) ** GOTO lbl6
            var50_35 = js.jjfn("jkxt", jjfk(int ), (int)422);
            if (var75_7) ** GOTO lbl6
            block161: while (true) {
                if (var75_7 || var75_7) ** GOTO lbl6
                if (var50_35 > var12_12) ** GOTO lbl212
                if (var75_7 || var75_7) ** GOTO lbl6
                var51_36 = (double)var50_35 / (double)var12_12;
                if (var75_7 || var75_7) ** GOTO lbl6
                var53_37 = var45_32 + var43_31 * var51_36;
                if (var75_7 || var75_7) ** GOTO lbl6
                var55_38 = js.lightningNoise((int)var13_13, (int)var50_35, var16_15, (int)js.jjfn("jkxu", jjfk(int ), (int)423)) * js.jjfn("jkxv", jjsd(int ), (int)75);
                if (var75_7 || var75_7) ** GOTO lbl6
                var57_39 = js.lightningNoise((int)var13_13, (int)var50_35, var16_15, (int)js.jjfn("jkxw", jjfk(int ), (int)424)) * js.jjfn("jkxx", jjsd(int ), (int)76);
                if (var75_7 || var75_7) ** GOTO lbl6
                var59_40 = js.lightningNoise((int)var13_13, (int)var50_35, var16_15, (int)js.jjfn("jkxy", jjfk(int ), (int)425)) * js.jjfn("jkxz", jjsd(int ), (int)77);
                if (var75_7 || var75_7) ** GOTO lbl6
                var61_41 = Math.sin(var51_36 * js.jjfn("jkya", jjsd(int ), (int)78));
                if (var75_7 || var75_7) ** GOTO lbl6
                if (var13_13 % js.jjfn("jkyb", jjfk(int ), (int)426) != false) ** GOTO lbl179
                if (var75_7) ** GOTO lbl6
                if (var76_6 /* !! */  == 0) ** GOTO lbl-1000
                switch (var76_6 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var75_7) ** GOTO lbl6
                        v6 = var51_36 * var47_33;
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl181
                    }
lbl179:
                    // 1 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    v6 = var63_42 = var61_41 * var47_33;
lbl181:
                    // 2 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    var65_43 = var39_29 + var35_27 * var51_36 + var59_40;
                    if (var75_7 || var75_7) ** GOTO lbl6
                    var67_44 = var9_10 + var63_42 + var55_38;
                    if (var75_7 || var75_7) ** GOTO lbl6
                    var69_45 = Math.cos(var53_37);
                    if (var75_7 || var75_7) ** GOTO lbl6
                    var71_46 = Math.sin(var53_37);
                    if (var75_7 || var75_7) ** GOTO lbl6
                    var73_47 = new class_243(var2_2.field_1352 + var69_45 * var67_44 - var71_46 * var57_39, var65_43, var2_2.field_1350 + var71_46 * var67_44 + var69_45 * var57_39);
                    if (var75_7 || var75_7) ** GOTO lbl6
                    if (var49_34 == null) ** GOTO lbl205
                    if (var75_7 || var75_7) ** GOTO lbl6
                    if (var13_13 % js.jjfn("jkyc", jjfk(int ), (int)427) != false) ** GOTO lbl200
                    if (var75_7 || var75_7) ** GOTO lbl6
                    v7 = 1.0f - js.jjfn("jkyd", jjfp(int ), (int)428) * (float)var51_36;
                    if (var77_5) {
                        throw null;
                    }
                    ** GOTO lbl202
lbl200:
                    // 1 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    v7 = var74_48 = 1.0f;
lbl202:
                    // 2 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    lu.segment(var49_34, var73_47, (float)js.jjfn("jkye", jjfp(int ), (int)429), var3_3, var25_21 * var74_48);
                    if (var75_7) ** GOTO lbl6
lbl205:
                    // 2 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    var49_34 = var73_47;
                    if (var75_7 || var75_7) ** GOTO lbl6
                    ++var50_35;
                    if (var75_7) ** GOTO lbl6
                    if (!var77_5) continue block161;
                    throw null;
lbl212:
                    // 4 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    ++var13_13;
                    if (var75_7) ** GOTO lbl6
                    if (!var77_5) continue block160;
                    throw null;
lbl217:
                    // 1 sources

                    if (var75_7 || var75_7) ** GOTO lbl6
                    lu.end();
                    if (!var75_7 && !var75_7) ** break;
                    ** continue;
                    return;
                    case 0: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyf", jjfk(int ), (int)430);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl850
                    }
lbl227:
                    // 2 sources

                    case 1: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyg", jjfk(int ), (int)431);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl350
                    }
lbl232:
                    // 2 sources

                    case 2: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyh", jjfk(int ), (int)432);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl898
                    }
                    case 3: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyi", jjfk(int ), (int)433);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl586
                    }
lbl242:
                    // 2 sources

                    case 4: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyj", jjfk(int ), (int)434);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl698
                    }
lbl247:
                    // 2 sources

                    case 5: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyk", jjfk(int ), (int)435);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl286
                    }
                    case 6: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyl", jjfk(int ), (int)436);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl315
                    }
lbl257:
                    // 2 sources

                    case 7: {
                        var76_6 /* !! */  = (int)js.jjfn("jkym", jjfk(int ), (int)437);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl489
                    }
lbl262:
                    // 3 sources

                    case 8: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyn", jjfk(int ), (int)438);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl291
                    }
lbl267:
                    // 2 sources

                    case 9: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyo", jjfk(int ), (int)439);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl508
                    }
lbl272:
                    // 2 sources

                    case 10: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyp", jjfk(int ), (int)440);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl878
                    }
lbl277:
                    // 3 sources

                    case 11: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyq", jjfk(int ), (int)441);
                        if (!var77_5) ** GOTO lbl257
                        throw null;
                    }
                    case 12: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyr", jjfk(int ), (int)442);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl320
                    }
lbl286:
                    // 3 sources

                    case 13: {
                        var76_6 /* !! */  = (int)js.jjfn("jkys", jjfk(int ), (int)443);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl340
                    }
lbl291:
                    // 3 sources

                    case 14: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyt", jjfk(int ), (int)444);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl673
                    }
lbl296:
                    // 6 sources

                    case 15: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyu", jjfk(int ), (int)445);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl476
                    }
lbl301:
                    // 3 sources

                    case 16: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyv", jjfk(int ), (int)446);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl826
                    }
                    case 17: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyw", jjfk(int ), (int)447);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl549
                    }
lbl311:
                    // 2 sources

                    case 18: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyx", jjfk(int ), (int)448);
                        if (var77_5) {
                            throw null;
                        }
                    }
lbl315:
                    // 4 sources

                    case 19: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyy", jjfk(int ), (int)449);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl480
                    }
lbl320:
                    // 2 sources

                    case 20: {
                        var76_6 /* !! */  = (int)js.jjfn("jkyz", jjfk(int ), (int)450);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl604
                    }
                    case 21: {
                        var76_6 /* !! */  = (int)js.jjfn("jkza", jjfk(int ), (int)451);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl802
                    }
lbl330:
                    // 2 sources

                    case 22: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzb", jjfk(int ), (int)452);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl591
                    }
lbl335:
                    // 2 sources

                    case 23: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzc", jjfk(int ), (int)453);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl428
                    }
lbl340:
                    // 5 sources

                    case 24: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzd", jjfk(int ), (int)454);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl882
                    }
lbl345:
                    // 2 sources

                    case 25: {
                        var76_6 /* !! */  = (int)js.jjfn("jkze", jjfk(int ), (int)455);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl489
                    }
lbl350:
                    // 2 sources

                    case 26: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzf", jjfk(int ), (int)456);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl685
                    }
lbl355:
                    // 3 sources

                    case 27: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzg", jjfk(int ), (int)457);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl780
                    }
                    case 28: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzh", jjfk(int ), (int)458);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl647
                    }
                    case 29: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzi", jjfk(int ), (int)459);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl870
                    }
lbl370:
                    // 2 sources

                    case 30: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzj", jjfk(int ), (int)460);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl798
                    }
                    case 31: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzk", jjfk(int ), (int)461);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl634
                    }
                    case 32: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzl", jjfk(int ), (int)462);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl499
                    }
lbl385:
                    // 2 sources

                    case 33: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzm", jjfk(int ), (int)463);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl413
                    }
                    case 34: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzn", jjfk(int ), (int)464);
                        if (!var77_5) ** GOTO lbl340
                        throw null;
                    }
lbl394:
                    // 2 sources

                    case 35: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzo", jjfk(int ), (int)465);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl617
                    }
lbl399:
                    // 2 sources

                    case 36: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzp", jjfk(int ), (int)466);
                        if (!var77_5) ** GOTO lbl227
                        throw null;
                    }
lbl403:
                    // 2 sources

                    case 37: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzq", jjfk(int ), (int)467);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl472
                    }
                    case 38: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzr", jjfk(int ), (int)468);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl604
                    }
lbl413:
                    // 2 sources

                    case 39: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzs", jjfk(int ), (int)469);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl862
                    }
                    case 40: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzt", jjfk(int ), (int)470);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl503
                    }
                    case 41: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzu", jjfk(int ), (int)471);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl457
                    }
lbl428:
                    // 6 sources

                    case 42: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzv", jjfk(int ), (int)472);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl706
                    }
                    case 43: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzw", jjfk(int ), (int)473);
                        if (!var77_5) ** GOTO lbl301
                        throw null;
                    }
                    case 44: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzx", jjfk(int ), (int)474);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl659
                    }
lbl442:
                    // 3 sources

                    case 45: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzy", jjfk(int ), (int)475);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl906
                    }
                    case 46: {
                        var76_6 /* !! */  = (int)js.jjfn("jkzz", jjfk(int ), (int)476);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl573
                    }
                    case 47: {
                        var76_6 /* !! */  = (int)js.jjfn("jlaa", jjfk(int ), (int)477);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl846
                    }
lbl457:
                    // 2 sources

                    case 48: {
                        var76_6 /* !! */  = (int)js.jjfn("jlab", jjfk(int ), (int)478);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl822
                    }
lbl462:
                    // 2 sources

                    case 49: {
                        var76_6 /* !! */  = (int)js.jjfn("jlac", jjfk(int ), (int)479);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl838
                    }
lbl467:
                    // 2 sources

                    case 50: {
                        var76_6 /* !! */  = (int)js.jjfn("jlad", jjfk(int ), (int)480);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl617
                    }
lbl472:
                    // 2 sources

                    case 51: {
                        var76_6 /* !! */  = (int)js.jjfn("jlae", jjfk(int ), (int)481);
                        if (!var77_5) ** GOTO lbl355
                        throw null;
                    }
lbl476:
                    // 2 sources

                    case 52: {
                        var76_6 /* !! */  = (int)js.jjfn("jlaf", jjfk(int ), (int)482);
                        if (!var77_5) ** GOTO lbl277
                        throw null;
                    }
lbl480:
                    // 2 sources

                    case 53: {
                        var76_6 /* !! */  = (int)js.jjfn("jlag", jjfk(int ), (int)483);
                        if (!var77_5) break block160;
                        throw null;
                    }
lbl484:
                    // 2 sources

                    case 54: {
                        var76_6 /* !! */  = (int)js.jjfn("jlah", jjfk(int ), (int)484);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl850
                    }
lbl489:
                    // 4 sources

                    case 55: {
                        var76_6 /* !! */  = (int)js.jjfn("jlai", jjfk(int ), (int)485);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl710
                    }
                    case 56: {
                        var76_6 /* !! */  = (int)js.jjfn("jlaj", jjfk(int ), (int)486);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl914
                    }
lbl499:
                    // 3 sources

                    case 57: {
                        var76_6 /* !! */  = (int)js.jjfn("jlak", jjfk(int ), (int)487);
                        if (!var77_5) ** GOTO lbl489
                        throw null;
                    }
lbl503:
                    // 4 sources

                    case 58: {
                        var76_6 /* !! */  = (int)js.jjfn("jlal", jjfk(int ), (int)488);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl734
                    }
lbl508:
                    // 3 sources

                    case 59: {
                        var76_6 /* !! */  = (int)js.jjfn("jlam", jjfk(int ), (int)489);
                        if (!var77_5) ** GOTO lbl340
                        throw null;
                    }
                    case 60: {
                        var76_6 /* !! */  = (int)js.jjfn("jlan", jjfk(int ), (int)490);
                        if (!var77_5) ** GOTO lbl442
                        throw null;
                    }
lbl516:
                    // 2 sources

                    case 61: {
                        var76_6 /* !! */  = (int)js.jjfn("jlao", jjfk(int ), (int)491);
                        if (!var77_5) ** GOTO lbl355
                        throw null;
                    }
                    case 62: {
                        var76_6 /* !! */  = (int)js.jjfn("jlap", jjfk(int ), (int)492);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl681
                    }
                    case 63: {
                        var76_6 /* !! */  = (int)js.jjfn("jlaq", jjfk(int ), (int)493);
                        if (!var77_5) ** GOTO lbl262
                        throw null;
                    }
                    case 64: {
                        var76_6 /* !! */  = (int)js.jjfn("jlar", jjfk(int ), (int)494);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl784
                    }
lbl534:
                    // 4 sources

                    case 65: {
                        var76_6 /* !! */  = (int)js.jjfn("jlas", jjfk(int ), (int)495);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl874
                    }
lbl539:
                    // 2 sources

                    case 66: {
                        var76_6 /* !! */  = (int)js.jjfn("jlat", jjfk(int ), (int)496);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl838
                    }
                    case 67: {
                        var76_6 /* !! */  = (int)js.jjfn("jlau", jjfk(int ), (int)497);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl638
                    }
lbl549:
                    // 2 sources

                    case 68: {
                        var76_6 /* !! */  = (int)js.jjfn("jlav", jjfk(int ), (int)498);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl874
                    }
                    case 69: {
                        var76_6 /* !! */  = (int)js.jjfn("jlaw", jjfk(int ), (int)499);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl906
                    }
                    case 70: {
                        var76_6 /* !! */  = (int)js.jjfn("jlax", jjfk(int ), (int)500);
                        if (!var77_5) break block160;
                        throw null;
                    }
lbl563:
                    // 2 sources

                    case 71: {
                        var76_6 /* !! */  = (int)js.jjfn("jlay", jjfk(int ), (int)501);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl759
                    }
                    case 72: {
                        var76_6 /* !! */  = (int)js.jjfn("jlaz", jjfk(int ), (int)502);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl810
                    }
lbl573:
                    // 2 sources

                    case 73: {
                        var76_6 /* !! */  = (int)js.jjfn("jlba", jjfk(int ), (int)503);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl878
                    }
lbl578:
                    // 2 sources

                    case 74: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbb", jjfk(int ), (int)504);
                        if (!var77_5) ** GOTO lbl272
                        throw null;
                    }
lbl582:
                    // 2 sources

                    case 75: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbc", jjfk(int ), (int)505);
                        if (!var77_5) ** GOTO lbl534
                        throw null;
                    }
lbl586:
                    // 3 sources

                    case 76: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbd", jjfk(int ), (int)506);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl681
                    }
lbl591:
                    // 3 sources

                    case 77: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbe", jjfk(int ), (int)507);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl826
                    }
lbl596:
                    // 2 sources

                    case 78: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbf", jjfk(int ), (int)508);
                        if (!var77_5) ** GOTO lbl508
                        throw null;
                    }
lbl600:
                    // 2 sources

                    case 79: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbg", jjfk(int ), (int)509);
                        if (!var77_5) ** GOTO lbl267
                        throw null;
                    }
lbl604:
                    // 4 sources

                    case 80: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbi", jjfk(int ), (int)510);
                        if (!var77_5) ** GOTO lbl301
                        throw null;
                    }
                    case 81: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbm", jjfk(int ), (int)511);
                        if (!var77_5) ** GOTO lbl291
                        throw null;
                    }
lbl612:
                    // 2 sources

                    case 82: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbr", jjfk(int ), (int)512);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl854
                    }
lbl617:
                    // 3 sources

                    case 83: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbx", jjfk(int ), (int)513);
                        if (!var77_5) ** GOTO lbl442
                        throw null;
                    }
                    case 84: {
                        var76_6 /* !! */  = (int)js.jjfn("jlbz", jjfk(int ), (int)514);
                        if (!var77_5) ** GOTO lbl499
                        throw null;
                    }
lbl625:
                    // 2 sources

                    case 85: {
                        var76_6 /* !! */  = (int)js.jjfn("jlca", jjfk(int ), (int)515);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl902
                    }
lbl630:
                    // 2 sources

                    case 86: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcb", jjfk(int ), (int)516);
                        if (!var77_5) ** GOTO lbl335
                        throw null;
                    }
lbl634:
                    // 2 sources

                    case 87: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcd", jjfk(int ), (int)517);
                        if (!var77_5) ** GOTO lbl242
                        throw null;
                    }
lbl638:
                    // 3 sources

                    case 88: {
                        var76_6 /* !! */  = (int)js.jjfn("jlce", jjfk(int ), (int)518);
                        if (!var77_5) ** GOTO lbl232
                        throw null;
                    }
                    case 89: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var76_6 /* !! */  = (int)js.jjfn("jlcf", jjfk(int ), (int)519);
                            if (!var77_5) ** GOTO lbl539
                            throw null;
                        }
                    }
lbl647:
                    // 2 sources

                    case 90: {
                        var76_6 /* !! */  = (int)js.jjfn("jlch", jjfk(int ), (int)520);
                        if (!var77_5) ** GOTO lbl286
                        throw null;
                    }
                    case 91: {
                        var76_6 /* !! */  = (int)js.jjfn("jlci", jjfk(int ), (int)521);
                        if (!var77_5) ** GOTO lbl534
                        throw null;
                    }
lbl655:
                    // 2 sources

                    case 92: {
                        var76_6 /* !! */  = (int)js.jjfn("jlck", jjfk(int ), (int)522);
                        if (!var77_5) ** GOTO lbl563
                        throw null;
                    }
lbl659:
                    // 4 sources

                    case 93: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcl", jjfk(int ), (int)523);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl914
                    }
lbl664:
                    // 2 sources

                    case 94: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcn", jjfk(int ), (int)524);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl850
                    }
                    case 95: {
                        var76_6 /* !! */  = (int)js.jjfn("jlco", jjfk(int ), (int)525);
                        if (!var77_5) ** GOTO lbl655
                        throw null;
                    }
lbl673:
                    // 2 sources

                    case 96: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcq", jjfk(int ), (int)526);
                        if (!var77_5) ** GOTO lbl578
                        throw null;
                    }
lbl677:
                    // 3 sources

                    case 97: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcr", jjfk(int ), (int)527);
                        if (!var77_5) ** GOTO lbl596
                        throw null;
                    }
lbl681:
                    // 3 sources

                    case 98: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcs", jjfk(int ), (int)528);
                        if (!var77_5) ** GOTO lbl630
                        throw null;
                    }
lbl685:
                    // 3 sources

                    case 99: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcu", jjfk(int ), (int)529);
                        if (!var77_5) ** GOTO lbl296
                        throw null;
                    }
                    case 100: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcv", jjfk(int ), (int)530);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl734
                    }
                    case 101: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcw", jjfk(int ), (int)531);
                        if (!var77_5) ** GOTO lbl685
                        throw null;
                    }
lbl698:
                    // 2 sources

                    case 102: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcy", jjfk(int ), (int)532);
                        if (!var77_5) ** GOTO lbl659
                        throw null;
                    }
                    case 103: {
                        var76_6 /* !! */  = (int)js.jjfn("jlcz", jjfk(int ), (int)533);
                        if (!var77_5) ** GOTO lbl394
                        throw null;
                    }
lbl706:
                    // 3 sources

                    case 104: {
                        var76_6 /* !! */  = (int)js.jjfn("jlda", jjfk(int ), (int)534);
                        if (!var77_5) ** GOTO lbl428
                        throw null;
                    }
lbl710:
                    // 3 sources

                    case 105: {
                        var76_6 /* !! */  = (int)js.jjfn("jldb", jjfk(int ), (int)535);
                        if (!var77_5) ** GOTO lbl604
                        throw null;
                    }
                    case 106: {
                        var76_6 /* !! */  = (int)js.jjfn("jldc", jjfk(int ), (int)536);
                        if (!var77_5) ** GOTO lbl262
                        throw null;
                    }
                    case 107: {
                        var76_6 /* !! */  = (int)js.jjfn("jldd", jjfk(int ), (int)537);
                        if (!var77_5) ** GOTO lbl503
                        throw null;
                    }
                    case 108: {
                        var76_6 /* !! */  = (int)js.jjfn("jlde", jjfk(int ), (int)538);
                        if (!var77_5) ** GOTO lbl428
                        throw null;
                    }
                    case 109: {
                        var76_6 /* !! */  = (int)js.jjfn("jldf", jjfk(int ), (int)539);
                        if (!var77_5) ** GOTO lbl370
                        throw null;
                    }
                    case 110: {
                        var76_6 /* !! */  = (int)js.jjfn("jldg", jjfk(int ), (int)540);
                        if (!var77_5) ** GOTO lbl296
                        throw null;
                    }
lbl734:
                    // 3 sources

                    case 111: {
                        var76_6 /* !! */  = (int)js.jjfn("jldh", jjfk(int ), (int)541);
                        if (!var77_5) ** GOTO lbl706
                        throw null;
                    }
                    case 112: {
                        var76_6 /* !! */  = (int)js.jjfn("jldi", jjfk(int ), (int)542);
                        if (!var77_5) ** GOTO lbl664
                        throw null;
                    }
                    case 113: {
                        var76_6 /* !! */  = (int)js.jjfn("jldj", jjfk(int ), (int)543);
                        if (!var77_5) ** GOTO lbl638
                        throw null;
                    }
                    case 114: {
                        var76_6 /* !! */  = (int)js.jjfn("jldk", jjfk(int ), (int)544);
                        if (!var77_5) ** GOTO lbl277
                        throw null;
                    }
                    case 115: {
                        var76_6 /* !! */  = (int)js.jjfn("jldl", jjfk(int ), (int)545);
                        if (!var77_5) ** GOTO lbl311
                        throw null;
                    }
                    case 116: {
                        var76_6 /* !! */  = (int)js.jjfn("jldm", jjfk(int ), (int)546);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl806
                    }
lbl759:
                    // 2 sources

                    case 117: {
                        var76_6 /* !! */  = (int)js.jjfn("jldn", jjfk(int ), (int)547);
                        if (!var77_5) ** GOTO lbl600
                        throw null;
                    }
lbl763:
                    // 2 sources

                    case 118: {
                        var76_6 /* !! */  = (int)js.jjfn("jldo", jjfk(int ), (int)548);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl784
                    }
                    case 119: {
                        var76_6 /* !! */  = (int)js.jjfn("jldp", jjfk(int ), (int)549);
                        if (!var77_5) ** GOTO lbl296
                        throw null;
                    }
lbl772:
                    // 2 sources

                    case 120: {
                        var76_6 /* !! */  = (int)js.jjfn("jldq", jjfk(int ), (int)550);
                        if (!var77_5) ** GOTO lbl345
                        throw null;
                    }
lbl776:
                    // 2 sources

                    case 121: {
                        var76_6 /* !! */  = (int)js.jjfn("jldr", jjfk(int ), (int)551);
                        if (!var77_5) ** GOTO lbl763
                        throw null;
                    }
lbl780:
                    // 2 sources

                    case 122: {
                        var76_6 /* !! */  = (int)js.jjfn("jlds", jjfk(int ), (int)552);
                        if (!var77_5) ** GOTO lbl330
                        throw null;
                    }
lbl784:
                    // 4 sources

                    case 123: {
                        var76_6 /* !! */  = (int)js.jjfn("jldt", jjfk(int ), (int)553);
                        if (!var77_5) ** GOTO lbl428
                        throw null;
                    }
                    case 124: {
                        var76_6 /* !! */  = (int)js.jjfn("jldu", jjfk(int ), (int)554);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl902
                    }
lbl793:
                    // 2 sources

                    case 125: {
                        var76_6 /* !! */  = (int)js.jjfn("jldv", jjfk(int ), (int)555);
                        if (var77_5) {
                            throw null;
                        }
                        ** GOTO lbl834
                    }
lbl798:
                    // 2 sources

                    case 126: {
                        var76_6 /* !! */  = (int)js.jjfn("jldw", jjfk(int ), (int)556);
                        if (!var77_5) ** GOTO lbl677
                        throw null;
                    }
lbl802:
                    // 2 sources

                    case 127: {
                        var76_6 /* !! */  = (int)js.jjfn("jldx", jjfk(int ), (int)557);
                        if (!var77_5) ** GOTO lbl582
                        throw null;
                    }
lbl806:
                    // 2 sources

                    case 128: {
                        var76_6 /* !! */  = (int)js.jjfn("jldy", jjfk(int ), (int)558);
                        if (!var77_5) ** GOTO lbl534
                        throw null;
                    }
lbl810:
                    // 2 sources

                    case 129: {
                        var76_6 /* !! */  = (int)js.jjfn("jldz", jjfk(int ), (int)559);
                        if (!var77_5) ** GOTO lbl625
                        throw null;
                    }
lbl814:
                    // 2 sources

                    case 130: {
                        var76_6 /* !! */  = (int)js.jjfn("jlea", jjfk(int ), (int)560);
                        if (!var77_5) ** GOTO lbl710
                        throw null;
                    }
                    case 131: {
                        var76_6 /* !! */  = (int)js.jjfn("jleb", jjfk(int ), (int)561);
                        if (!var77_5) ** GOTO lbl784
                        throw null;
                    }
lbl822:
                    // 2 sources

                    case 132: {
                        var76_6 /* !! */  = (int)js.jjfn("jlec", jjfk(int ), (int)562);
                        if (!var77_5) ** GOTO lbl776
                        throw null;
                    }
lbl826:
                    // 3 sources

                    case 133: {
                        var76_6 /* !! */  = (int)js.jjfn("jled", jjfk(int ), (int)563);
                        if (!var77_5) ** GOTO lbl462
                        throw null;
                    }
lbl830:
                    // 2 sources

                    case 134: {
                        var76_6 /* !! */  = (int)js.jjfn("jlee", jjfk(int ), (int)564);
                        if (!var77_5) ** GOTO lbl296
                        throw null;
                    }
lbl834:
                    // 2 sources

                    case 135: {
                        var76_6 /* !! */  = (int)js.jjfn("jlef", jjfk(int ), (int)565);
                        if (!var77_5) ** GOTO lbl340
                        throw null;
                    }
lbl838:
                    // 3 sources

                    case 136: {
                        var76_6 /* !! */  = (int)js.jjfn("jleg", jjfk(int ), (int)566);
                        if (!var77_5) ** GOTO lbl503
                        throw null;
                    }
                    case 137: {
                        var76_6 /* !! */  = (int)js.jjfn("jleh", jjfk(int ), (int)567);
                        if (!var77_5) ** GOTO lbl830
                        throw null;
                    }
lbl846:
                    // 2 sources

                    case 138: {
                        var76_6 /* !! */  = (int)js.jjfn("jlei", jjfk(int ), (int)568);
                        if (!var77_5) ** GOTO lbl385
                        throw null;
                    }
lbl850:
                    // 4 sources

                    case 139: {
                        var76_6 /* !! */  = (int)js.jjfn("jlej", jjfk(int ), (int)569);
                        if (!var77_5) ** GOTO lbl484
                        throw null;
                    }
lbl854:
                    // 3 sources

                    case 140: {
                        var76_6 /* !! */  = (int)js.jjfn("jlek", jjfk(int ), (int)570);
                        if (!var77_5) ** GOTO lbl677
                        throw null;
                    }
                    case 141: {
                        var76_6 /* !! */  = (int)js.jjfn("jlel", jjfk(int ), (int)571);
                        if (!var77_5) ** GOTO lbl659
                        throw null;
                    }
lbl862:
                    // 2 sources

                    case 142: {
                        var76_6 /* !! */  = (int)js.jjfn("jlem", jjfk(int ), (int)572);
                        if (!var77_5) ** GOTO lbl612
                        throw null;
                    }
                    case 143: {
                        var76_6 /* !! */  = (int)js.jjfn("jlen", jjfk(int ), (int)573);
                        if (!var77_5) ** GOTO lbl428
                        throw null;
                    }
lbl870:
                    // 2 sources

                    case 144: {
                        var76_6 /* !! */  = (int)js.jjfn("jleo", jjfk(int ), (int)574);
                        if (!var77_5) ** GOTO lbl591
                        throw null;
                    }
lbl874:
                    // 3 sources

                    case 145: {
                        var76_6 /* !! */  = (int)js.jjfn("jlep", jjfk(int ), (int)575);
                        if (!var77_5) ** GOTO lbl403
                        throw null;
                    }
lbl878:
                    // 3 sources

                    case 146: {
                        var76_6 /* !! */  = (int)js.jjfn("jleq", jjfk(int ), (int)576);
                        if (!var77_5) ** GOTO lbl516
                        throw null;
                    }
lbl882:
                    // 2 sources

                    case 147: {
                        var76_6 /* !! */  = (int)js.jjfn("jler", jjfk(int ), (int)577);
                        if (!var77_5) ** GOTO lbl772
                        throw null;
                    }
                    case 148: {
                        var76_6 /* !! */  = (int)js.jjfn("jles", jjfk(int ), (int)578);
                        if (!var77_5) ** GOTO lbl296
                        throw null;
                    }
                    case 149: {
                        var76_6 /* !! */  = (int)js.jjfn("jlet", jjfk(int ), (int)579);
                        if (!var77_5) ** GOTO lbl854
                        throw null;
                    }
                    case 150: {
                        var76_6 /* !! */  = (int)js.jjfn("jleu", jjfk(int ), (int)580);
                        if (!var77_5) ** GOTO lbl586
                        throw null;
                    }
lbl898:
                    // 2 sources

                    case 151: {
                        var76_6 /* !! */  = (int)js.jjfn("jlev", jjfk(int ), (int)581);
                        if (!var77_5) ** GOTO lbl247
                        throw null;
                    }
lbl902:
                    // 3 sources

                    case 152: {
                        var76_6 /* !! */  = (int)js.jjfn("jlew", jjfk(int ), (int)582);
                        if (!var77_5) ** GOTO lbl399
                        throw null;
                    }
lbl906:
                    // 3 sources

                    case 153: {
                        var76_6 /* !! */  = (int)js.jjfn("jlex", jjfk(int ), (int)583);
                        if (!var77_5) ** GOTO lbl467
                        throw null;
                    }
                    case 154: {
                        var76_6 /* !! */  = (int)js.jjfn("jley", jjfk(int ), (int)584);
                        if (!var77_5) ** GOTO lbl793
                        throw null;
                    }
lbl914:
                    // 3 sources

                    case 155: {
                        var76_6 /* !! */  = (int)js.jjfn("jlez", jjfk(int ), (int)585);
                        if (!var77_5) ** GOTO lbl814
                        throw null;
                    }
                    case 156: 
                }
                break;
            }
            break;
        }
        var76_6 /* !! */  = (int)js.jjfn("jlfa", jjfk(int ), (int)586);
        ** while (!var77_5)
lbl921:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static double lightningNoise(int var0, int var1_1, long var2_2, int var4_3) {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(js.jjfn("jlfx", jjht(int ), (int)93) - js.jjfn("jlfw", jjht(int ), (int)92));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1209029128: {
                    continue block22;
                }
                case 458795960: {
                    break block22;
                }
            }
            break;
        }
        var9_4 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jlfy", jjht(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == js.jjfn("jlfz", jjfk(int ), (int)595)) break;
            v1 /* !! */  = (long)js.jjfn("jlga", jjfk(int ), (int)596);
        }
        var8_5 /* !! */  = js.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jlgb", jjht(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == js.jjfn("jlgc", jjfk(int ), (int)597)) break;
            v2 /* !! */  = (long)js.jjfn("jlgd", jjfk(int ), (int)598);
        }
        var7_6 = js.a;
        if (var9_4) {
            throw null;
lbl27:
            // 7 sources

            return (double)js.jjfn("jlge", jjsd(int ), (int)96);
        }
        if (var7_6 || var7_6) ** GOTO lbl27
        var5_7 = var2_2 * js.jjfn("jlgf", jjht(int ), (int)97) ^ (long)var0 * js.jjfn("jlgg", jjht(int ), (int)98) ^ (long)var1_1 * js.jjfn("jlgh", jjht(int ), (int)99) ^ (long)var4_3 * js.jjfn("jlgi", jjht(int ), (int)100);
        if (var7_6 || var7_6) ** GOTO lbl27
        var5_7 ^= var5_7 >>> js.jjfn("jlgj", jjfk(int ), (int)599);
        if (var7_6 || var7_6) ** GOTO lbl27
        var5_7 *= js.jjfn("jlgk", jjht(int ), (int)101);
        if (var7_6 || var7_6) ** GOTO lbl27
        var5_7 ^= var5_7 >>> js.jjfn("jlgl", jjfk(int ), (int)600);
        if (var7_6 || var7_6) ** GOTO lbl27
        var5_7 *= js.jjfn("jlgm", jjht(int ), (int)102);
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_6 || var7_6) ** GOTO lbl27
                var5_7 ^= var5_7 >>> js.jjfn("jlgn", jjfk(int ), (int)601);
                if (var7_6 || var7_6) ** continue;
                return (double)(var5_7 >>> js.jjfn("jlgo", jjfk(int ), (int)602)) * js.jjfn("jlgp", jjsd(int ), (int)103) * js.jjfn("jlgq", jjsd(int ), (int)104) - 1.0;
            }
lbl46:
            // 2 sources

            case 0: {
                var8_5 /* !! */  = (int)js.jjfn("jlgr", jjfk(int ), (int)603);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl51:
            // 2 sources

            case 1: {
                var8_5 /* !! */  = (int)js.jjfn("jlgs", jjfk(int ), (int)604);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl56:
            // 2 sources

            case 2: {
                var8_5 /* !! */  = (int)js.jjfn("jlgt", jjfk(int ), (int)605);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl61:
            // 3 sources

            case 3: {
                var8_5 /* !! */  = (int)js.jjfn("jlgu", jjfk(int ), (int)606);
                if (!var9_4) ** GOTO lbl46
                throw null;
            }
            case 4: {
                var8_5 /* !! */  = (int)js.jjfn("jlgv", jjfk(int ), (int)607);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl70:
            // 2 sources

            case 5: {
                var8_5 /* !! */  = (int)js.jjfn("jlgw", jjfk(int ), (int)608);
                if (var9_4) {
                    throw null;
                }
            }
lbl74:
            // 5 sources

            case 6: {
                var8_5 /* !! */  = (int)js.jjfn("jlgx", jjfk(int ), (int)609);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 7: {
                var8_5 /* !! */  = (int)js.jjfn("jlgy", jjfk(int ), (int)610);
                if (!var9_4) ** GOTO lbl74
                throw null;
            }
lbl83:
            // 3 sources

            case 8: {
                var8_5 /* !! */  = (int)js.jjfn("jlgz", jjfk(int ), (int)611);
                if (!var9_4) ** GOTO lbl74
                throw null;
            }
            case 9: {
                var8_5 /* !! */  = (int)js.jjfn("jlha", jjfk(int ), (int)612);
                if (!var9_4) ** GOTO lbl61
                throw null;
            }
lbl91:
            // 3 sources

            case 10: {
                var8_5 /* !! */  = (int)js.jjfn("jlhb", jjfk(int ), (int)613);
                if (!var9_4) ** GOTO lbl56
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)js.jjfn("jlhc", jjfk(int ), (int)614);
                    if (!var9_4) ** GOTO lbl83
                    throw null;
                }
            }
lbl100:
            // 2 sources

            case 12: {
                var8_5 /* !! */  = (int)js.jjfn("jlhd", jjfk(int ), (int)615);
                if (!var9_4) ** GOTO lbl61
                throw null;
            }
            case 13: {
                var8_5 /* !! */  = (int)js.jjfn("jlhe", jjfk(int ), (int)616);
                if (!var9_4) ** GOTO lbl51
                throw null;
            }
lbl108:
            // 2 sources

            case 14: {
                var8_5 /* !! */  = (int)js.jjfn("jlhf", jjfk(int ), (int)617);
                if (!var9_4) ** GOTO lbl91
                throw null;
            }
            case 15: 
        }
        var8_5 /* !! */  = (int)js.jjfn("jlhg", jjfk(int ), (int)618);
        ** while (!var9_4)
lbl115:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$5() {
        block68: {
            v0 /* !! */  = js.rm;
            if (true) ** GOTO lbl5
            block46: while (true) {
                v0 /* !! */  = (long)(v1 - js.jjfn("jmqw", jjht(int ), (int)231));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1755081671: {
                        v1 = js.jjfn("jmqx", jjht(int ), (int)232);
                        continue block46;
                    }
                    case -6991331: {
                        v1 = js.jjfn("jmqy", jjht(int ), (int)233);
                        continue block46;
                    }
                    case 458795960: {
                        break block46;
                    }
                    case 1440972486: {
                        v1 = js.jjfn("jmqz", jjht(int ), (int)234);
                        continue block46;
                    }
                }
                break;
            }
            var3_1 = js.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmra", jjht(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == js.jjfn("jmrb", jjfk(int ), (int)1045)) break;
                v2 /* !! */  = (long)js.jjfn("jmrc", jjfk(int ), (int)1046);
            }
            var2_2 /* !! */  = js.b;
            v3 /* !! */  = js.rm;
            if (true) ** GOTO lbl29
            block48: while (true) {
                v3 /* !! */  = (long)(v4 - js.jjfn("jmrd", jjht(int ), (int)236));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1120097863: {
                        v4 = js.jjfn("jmre", jjht(int ), (int)237);
                        continue block48;
                    }
                    case -776632142: {
                        v4 = js.jjfn("jmrf", jjht(int ), (int)238);
                        continue block48;
                    }
                    case 458795960: {
                        break block48;
                    }
                    case 615598015: {
                        v4 = js.jjfn("jmrg", jjht(int ), (int)239);
                        continue block48;
                    }
                }
                break;
            }
            var1_3 = js.a;
            if (var3_1) {
                throw null;
lbl44:
                // 5 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl44
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmrh", jjht(int ), (int)240)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == js.jjfn("jmri", jjfk(int ), (int)1047)) break;
                v5 /* !! */  = (long)js.jjfn("jmrj", jjfk(int ), (int)1048);
            }
            v6 /* !! */  = js.rm;
            if (true) ** GOTO lbl57
            block51: while (true) {
                v6 /* !! */  = (long)(v7 - js.jjfn("jmrk", jjht(int ), (int)241));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1174315861: {
                        v7 = js.jjfn("jmrl", jjht(int ), (int)242);
                        continue block51;
                    }
                    case 458795960: {
                        break block51;
                    }
                    case 458940223: {
                        v7 = js.jjfn("jmrm", jjht(int ), (int)243);
                        continue block51;
                    }
                    case 768028670: {
                        v7 = js.jjfn("jmrn", jjht(int ), (int)244);
                        continue block51;
                    }
                }
                break;
            }
            if (this.mode.isSelected("\u0414\u0443\u0448\u0438")) break block68;
            if (var1_3) ** GOTO lbl44
            v8 /* !! */  = js.rm;
            if (true) ** GOTO lbl75
            block52: while (true) {
                v8 /* !! */  = (long)(v9 - js.jjfn("jmro", jjht(int ), (int)245));
lbl75:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -423104283: {
                        v9 = js.jjfn("jmrp", jjht(int ), (int)246);
                        continue block52;
                    }
                    case 458795960: {
                        break block52;
                    }
                    case 460263683: {
                        v9 = js.jjfn("jmrq", jjht(int ), (int)247);
                        continue block52;
                    }
                }
                break;
            }
            v10 /* !! */  = js.rm;
            if (true) ** GOTO lbl88
            block53: while (true) {
                v10 /* !! */  = (long)(js.jjfn("jmrs", jjht(int ), (int)249) - js.jjfn("jmrr", jjht(int ), (int)248));
lbl88:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 458795960: {
                        break block53;
                    }
                    case 1003709254: {
                        continue block53;
                    }
                }
                break;
            }
            if (!this.mode.isSelected("\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438")) ** GOTO lbl104
            if (var1_3) ** GOTO lbl44
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 = js.jjfn("jmrt", jjfk(int ), (int)1049);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl104:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v11 = js.jjfn("jmru", jjfk(int ), (int)1050);
lbl107:
            // 2 sources

            v12 /* !! */  = js.rm;
            if (true) ** GOTO lbl111
            block54: while (true) {
                v12 /* !! */  = (long)(v13 - js.jjfn("jmrv", jjht(int ), (int)250));
lbl111:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1128876423: {
                        v13 = js.jjfn("jmrw", jjht(int ), (int)251);
                        continue block54;
                    }
                    case -589127435: {
                        v13 = js.jjfn("jmrx", jjht(int ), (int)252);
                        continue block54;
                    }
                    case -179121400: {
                        v13 = js.jjfn("jmry", jjht(int ), (int)253);
                        continue block54;
                    }
                    case 458795960: {
                        break block54;
                    }
                }
                break;
            }
            return (boolean)v11;
lbl124:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)js.jjfn("jmrz", jjfk(int ), (int)1051);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl162
                    break;
                }
            }
lbl130:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)js.jjfn("jmsa", jjfk(int ), (int)1052);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 2: {
                var2_2 /* !! */  = (int)js.jjfn("jmsb", jjfk(int ), (int)1053);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)js.jjfn("jmsc", jjfk(int ), (int)1054);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl144:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)js.jjfn("jmsd", jjfk(int ), (int)1055);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 5: {
                var2_2 /* !! */  = (int)js.jjfn("jmse", jjfk(int ), (int)1056);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 6: {
                var2_2 /* !! */  = (int)js.jjfn("jmsf", jjfk(int ), (int)1057);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
lbl158:
            // 5 sources

            case 7: {
                var2_2 /* !! */  = (int)js.jjfn("jmsg", jjfk(int ), (int)1058);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
lbl162:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)js.jjfn("jmsh", jjfk(int ), (int)1059);
                if (!var3_1) ** GOTO lbl158
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)js.jjfn("jmsi", jjfk(int ), (int)1060);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)js.jjfn("jmsj", jjfk(int ), (int)1061);
        ** while (!var3_1)
lbl173:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmze() {
        js.jjfm[500] = -1676345998;
        js.jjfm[501] = -179486915;
        js.jjfm[502] = 636736896;
        js.jjfm[503] = -1307447340;
        js.jjfm[504] = -2019922005;
        js.jjfm[505] = -812613761;
        js.jjfm[506] = -833432327;
        js.jjfm[507] = -431640038;
        js.jjfm[508] = 1214905281;
        js.jjfm[509] = 1846454811;
        js.jjfm[510] = 159823436;
        js.jjfm[511] = -217787690;
        js.jjfm[512] = -1975513851;
        js.jjfm[513] = -817649128;
        js.jjfm[514] = -1773531690;
        js.jjfm[515] = 255096220;
        js.jjfm[516] = -1119054169;
        js.jjfm[517] = -656517077;
        js.jjfm[518] = -1130293487;
        js.jjfm[519] = -1650584735;
        js.jjfm[520] = 1909736901;
        js.jjfm[521] = -1040032147;
        js.jjfm[522] = -1066704837;
        js.jjfm[523] = 1213917005;
        js.jjfm[524] = -1272688732;
        js.jjfm[525] = 1679303501;
        js.jjfm[526] = 1207045172;
        js.jjfm[527] = -255273772;
        js.jjfm[528] = -1325506500;
        js.jjfm[529] = -1900286009;
        js.jjfm[530] = 1157484204;
        js.jjfm[531] = 1470044935;
        js.jjfm[532] = 150367481;
        js.jjfm[533] = 381469909;
        js.jjfm[534] = -1441921411;
        js.jjfm[535] = -750098138;
        js.jjfm[536] = -2137755713;
        js.jjfm[537] = 36607014;
        js.jjfm[538] = -352544172;
        js.jjfm[539] = -316856198;
        js.jjfm[540] = 933776943;
        js.jjfm[541] = -1550135283;
        js.jjfm[542] = 2129689495;
        js.jjfm[543] = -111538335;
        js.jjfm[544] = -732008152;
        js.jjfm[545] = -1751808325;
        js.jjfm[546] = -80022654;
        js.jjfm[547] = -1343467094;
        js.jjfm[548] = 1787285648;
        js.jjfm[549] = -911442767;
        js.jjfm[550] = -103145837;
        js.jjfm[551] = 0x5020222;
        js.jjfm[552] = -1250920620;
        js.jjfm[553] = -83297681;
        js.jjfm[554] = -2061682136;
        js.jjfm[555] = 1727166831;
        js.jjfm[556] = 382452652;
        js.jjfm[557] = -982236815;
        js.jjfm[558] = -896685979;
        js.jjfm[559] = -1826367973;
        js.jjfm[560] = -672274525;
        js.jjfm[561] = -67511205;
        js.jjfm[562] = 470404699;
        js.jjfm[563] = 859826675;
        js.jjfm[564] = 1207856598;
        js.jjfm[565] = 1180843634;
        js.jjfm[566] = -450023322;
        js.jjfm[567] = -935712622;
        js.jjfm[568] = 1783088763;
        js.jjfm[569] = 1232299598;
        js.jjfm[570] = -151818026;
        js.jjfm[571] = 1185770296;
        js.jjfm[572] = 662970533;
        js.jjfm[573] = -225675315;
        js.jjfm[574] = 171578576;
        js.jjfm[575] = 2033294815;
        js.jjfm[576] = 206050245;
        js.jjfm[577] = 487358795;
        js.jjfm[578] = 1704932214;
        js.jjfm[579] = 1589029264;
        js.jjfm[580] = 28302708;
        js.jjfm[581] = -1035739121;
        js.jjfm[582] = 1517908805;
        js.jjfm[583] = 2113089522;
        js.jjfm[584] = -1803798674;
        js.jjfm[585] = -323815417;
        js.jjfm[586] = -1584924225;
        js.jjfm[587] = 1036261308;
        js.jjfm[588] = -120264597;
        js.jjfm[589] = -1737409098;
        js.jjfm[590] = -1891665700;
        js.jjfm[591] = 438462046;
        js.jjfm[592] = 766116615;
        js.jjfm[593] = -1301018927;
        js.jjfm[594] = 1816689034;
        js.jjfm[595] = -621544486;
        js.jjfm[596] = -551896909;
        js.jjfm[597] = 1754098005;
        js.jjfm[598] = -53264632;
        js.jjfm[599] = -31479164;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateHoverTarget(long var1_1) {
        block90: {
            block89: {
                var8_2 = js.c;
                var7_3 /* !! */  = js.b;
                var6_4 = js.a;
                if (var8_2) {
                    throw null;
lbl6:
                    // 28 sources

                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!this.appearOnHover.isValue()) break block89;
                if (var6_4) ** GOTO lbl6
                if (js.mc.field_1724 == null) break block89;
                if (var6_4) ** GOTO lbl6
                if (js.mc.field_1687 != null) break block90;
                if (var6_4) ** GOTO lbl6
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            this.hoverTarget = null;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.hoverTargetExpiresAt = (long)js.jjfn("jjpe", jjht(int ), (int)12);
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        var5_5 = js.mc.field_1765;
        if (var6_4) ** GOTO lbl6
        if (!(var5_5 instanceof class_3966)) ** GOTO lbl48
        if (var6_4) ** GOTO lbl6
        var3_6 = (class_3966)var5_5;
        if (var6_4 || var6_4) ** GOTO lbl6
        var5_5 = var3_6.method_17782();
        if (var6_4) ** GOTO lbl6
        if (!(var5_5 instanceof class_1657)) ** GOTO lbl48
        if (var6_4) ** GOTO lbl6
        var4_7 = (class_1657)var5_5;
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var4_7 == js.mc.field_1724) ** GOTO lbl48
        if (var6_4) ** GOTO lbl6
        if (!var4_7.method_5805()) ** GOTO lbl48
        if (var6_4 || var6_4) ** GOTO lbl6
        this.hoverTarget = var4_7;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl6
                this.hoverTargetExpiresAt = var1_1 + js.jjfn("jjpf", jjht(int ), (int)13);
                if (var6_4 || var6_4) ** GOTO lbl6
                return;
            }
lbl48:
            // 4 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.hoverTarget == null) ** GOTO lbl59
            if (var6_4) ** GOTO lbl6
            if (var1_1 >= this.hoverTargetExpiresAt) ** GOTO lbl59
            if (var6_4) ** GOTO lbl6
            if (!this.hoverTarget.method_5805()) ** GOTO lbl59
            if (var6_4) ** GOTO lbl6
            if (this.hoverTarget.method_31481()) ** GOTO lbl59
            if (var6_4) ** GOTO lbl6
            if (this.hoverTarget.method_73183() == js.mc.field_1687) ** GOTO lbl64
            if (var6_4) ** GOTO lbl6
lbl59:
            // 5 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.hoverTarget = null;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.hoverTargetExpiresAt = (long)js.jjfn("jjpg", jjht(int ), (int)14);
            if (var6_4) ** GOTO lbl6
lbl64:
            // 2 sources

            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return;
lbl67:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)js.jjfn("jjph", jjfk(int ), (int)234);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl72:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)js.jjfn("jjpi", jjfk(int ), (int)235);
                if (var8_2) {
                    throw null;
                }
            }
lbl76:
            // 4 sources

            case 2: {
                var7_3 /* !! */  = (int)js.jjfn("jjpj", jjfk(int ), (int)236);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl81:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)js.jjfn("jjpk", jjfk(int ), (int)237);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl86:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)js.jjfn("jjpl", jjfk(int ), (int)238);
                if (!var8_2) ** GOTO lbl67
                throw null;
            }
lbl90:
            // 3 sources

            case 5: {
                var7_3 /* !! */  = (int)js.jjfn("jjpm", jjfk(int ), (int)239);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl95:
            // 3 sources

            case 6: {
                var7_3 /* !! */  = (int)js.jjfn("jjpn", jjfk(int ), (int)240);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 7: {
                do {
                    var7_3 /* !! */  = (int)js.jjfn("jjpo", jjfk(int ), (int)241);
                } while (!var8_2);
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)js.jjfn("jjpp", jjfk(int ), (int)242);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 9: {
                var7_3 /* !! */  = (int)js.jjfn("jjpq", jjfk(int ), (int)243);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl115:
            // 4 sources

            case 10: {
                var7_3 /* !! */  = (int)js.jjfn("jjpr", jjfk(int ), (int)244);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 11: {
                var7_3 /* !! */  = (int)js.jjfn("jjps", jjfk(int ), (int)245);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 12: {
                var7_3 /* !! */  = (int)js.jjfn("jjpt", jjfk(int ), (int)246);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl130:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)js.jjfn("jjpu", jjfk(int ), (int)247);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl135:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)js.jjfn("jjpv", jjfk(int ), (int)248);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 15: {
                var7_3 /* !! */  = (int)js.jjfn("jjpw", jjfk(int ), (int)249);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
            case 16: {
                var7_3 /* !! */  = (int)js.jjfn("jjpx", jjfk(int ), (int)250);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 17: {
                var7_3 /* !! */  = (int)js.jjfn("jjpy", jjfk(int ), (int)251);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl154:
            // 3 sources

            case 18: {
                var7_3 /* !! */  = (int)js.jjfn("jjpz", jjfk(int ), (int)252);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 19: {
                var7_3 /* !! */  = (int)js.jjfn("jjqa", jjfk(int ), (int)253);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 20: {
                var7_3 /* !! */  = (int)js.jjfn("jjqb", jjfk(int ), (int)254);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl169:
            // 6 sources

            case 21: {
                var7_3 /* !! */  = (int)js.jjfn("jjqc", jjfk(int ), (int)255);
                if (!var8_2) ** GOTO lbl90
                throw null;
            }
lbl173:
            // 3 sources

            case 22: {
                var7_3 /* !! */  = (int)js.jjfn("jjqd", jjfk(int ), (int)256);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl178:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)js.jjfn("jjqe", jjfk(int ), (int)257);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
            case 24: {
                var7_3 /* !! */  = (int)js.jjfn("jjqf", jjfk(int ), (int)258);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 25: {
                var7_3 /* !! */  = (int)js.jjfn("jjqg", jjfk(int ), (int)259);
                if (!var8_2) ** GOTO lbl76
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)js.jjfn("jjqh", jjfk(int ), (int)260);
                if (!var8_2) ** GOTO lbl169
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)js.jjfn("jjqi", jjfk(int ), (int)261);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl200:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)js.jjfn("jjqj", jjfk(int ), (int)262);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 29: {
                var7_3 /* !! */  = (int)js.jjfn("jjqk", jjfk(int ), (int)263);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)js.jjfn("jjql", jjfk(int ), (int)264);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl246
                    break;
                }
            }
lbl215:
            // 2 sources

            case 31: {
                var7_3 /* !! */  = (int)js.jjfn("jjqm", jjfk(int ), (int)265);
                if (!var8_2) ** GOTO lbl95
                throw null;
            }
lbl219:
            // 3 sources

            case 32: {
                var7_3 /* !! */  = (int)js.jjfn("jjqn", jjfk(int ), (int)266);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl224:
            // 2 sources

            case 33: {
                var7_3 /* !! */  = (int)js.jjfn("jjqo", jjfk(int ), (int)267);
                if (!var8_2) ** GOTO lbl169
                throw null;
            }
            case 34: {
                var7_3 /* !! */  = (int)js.jjfn("jjqp", jjfk(int ), (int)268);
                if (!var8_2) ** GOTO lbl130
                throw null;
            }
            case 35: {
                do {
                    var7_3 /* !! */  = (int)js.jjfn("jjqq", jjfk(int ), (int)269);
                } while (!var8_2);
                throw null;
            }
            case 36: {
                var7_3 /* !! */  = (int)js.jjfn("jjqr", jjfk(int ), (int)270);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl242:
            // 2 sources

            case 37: {
                var7_3 /* !! */  = (int)js.jjfn("jjqs", jjfk(int ), (int)271);
                if (!var8_2) ** GOTO lbl95
                throw null;
            }
lbl246:
            // 3 sources

            case 38: {
                var7_3 /* !! */  = (int)js.jjfn("jjqt", jjfk(int ), (int)272);
                if (!var8_2) ** GOTO lbl72
                throw null;
            }
lbl250:
            // 2 sources

            case 39: {
                var7_3 /* !! */  = (int)js.jjfn("jjqu", jjfk(int ), (int)273);
                if (!var8_2) ** GOTO lbl81
                throw null;
            }
lbl254:
            // 3 sources

            case 40: {
                var7_3 /* !! */  = (int)js.jjfn("jjqv", jjfk(int ), (int)274);
                if (!var8_2) ** GOTO lbl115
                throw null;
            }
lbl258:
            // 4 sources

            case 41: {
                var7_3 /* !! */  = (int)js.jjfn("jjqw", jjfk(int ), (int)275);
                if (!var8_2) ** GOTO lbl169
                throw null;
            }
lbl262:
            // 2 sources

            case 42: {
                var7_3 /* !! */  = (int)js.jjfn("jjqx", jjfk(int ), (int)276);
                if (!var8_2) break;
                throw null;
            }
lbl266:
            // 2 sources

            case 43: {
                var7_3 /* !! */  = (int)js.jjfn("jjqy", jjfk(int ), (int)277);
                if (!var8_2) ** GOTO lbl90
                throw null;
            }
            case 44: 
        }
        var7_3 /* !! */  = (int)js.jjfn("jjqz", jjfk(int ), (int)278);
        ** while (!var8_2)
lbl273:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$2() {
        block53: {
            block52: {
                v0 /* !! */  = js.rm;
                if (true) ** GOTO lbl5
                block28: while (true) {
                    v0 /* !! */  = (long)(js.jjfn("jmvk", jjht(int ), (int)290) - js.jjfn("jmvj", jjht(int ), (int)289));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -48786760: {
                            continue block28;
                        }
                        case 458795960: {
                            break block28;
                        }
                    }
                    break;
                }
                var3_1 = js.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmvl", jjht(int ), (int)291)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == js.jjfn("jmvm", jjfk(int ), (int)1104)) break;
                    v1 /* !! */  = (long)js.jjfn("jmvn", jjfk(int ), (int)1105);
                }
                var2_2 /* !! */  = js.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmvo", jjht(int ), (int)292)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == js.jjfn("jmvp", jjfk(int ), (int)1106)) break;
                    v2 /* !! */  = (long)js.jjfn("jmvq", jjfk(int ), (int)1107);
                }
                var1_3 = js.a;
                if (var3_1) {
                    throw null;
lbl27:
                    // 5 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl27
                v3 /* !! */  = js.rm;
                if (true) ** GOTO lbl34
                block32: while (true) {
                    v3 /* !! */  = (long)(v4 - js.jjfn("jmvr", jjht(int ), (int)293));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -961070152: {
                            v4 = js.jjfn("jmvs", jjht(int ), (int)294);
                            continue block32;
                        }
                        case -919966366: {
                            v4 = js.jjfn("jmvt", jjht(int ), (int)295);
                            continue block32;
                        }
                        case -579681272: {
                            v4 = js.jjfn("jmvu", jjht(int ), (int)296);
                            continue block32;
                        }
                        case 458795960: {
                            break block32;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmvv", jjht(int ), (int)297)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == js.jjfn("jmvw", jjfk(int ), (int)1108)) break;
                    v5 /* !! */  = (long)js.jjfn("jmvx", jjfk(int ), (int)1109);
                }
                if (this.mode.isSelected("\u0414\u0443\u0448\u0438")) break block52;
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jmvy", jjht(int ), (int)298)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == js.jjfn("jmvz", jjfk(int ), (int)1110)) break;
                    v6 /* !! */  = (long)js.jjfn("jmwa", jjfk(int ), (int)1111);
                }
                v7 /* !! */  = js.rm;
                if (true) ** GOTO lbl64
                block35: while (true) {
                    v7 /* !! */  = (long)(v8 - js.jjfn("jmwb", jjht(int ), (int)299));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2046338135: {
                            v8 = js.jjfn("jmwc", jjht(int ), (int)300);
                            continue block35;
                        }
                        case 458795960: {
                            break block35;
                        }
                        case 1262661149: {
                            v8 = js.jjfn("jmwd", jjht(int ), (int)301);
                            continue block35;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438")) break block53;
                if (var1_3) ** GOTO lbl27
            }
            if (var1_3 || var1_3) ** GOTO lbl27
            v9 = js.jjfn("jmwe", jjfk(int ), (int)1112);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl88
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v9 = js.jjfn("jmwf", jjfk(int ), (int)1113);
lbl88:
                // 2 sources

                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = js.rm - js.jjfn("jmwg", jjht(int ), (int)302)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == js.jjfn("jmwh", jjfk(int ), (int)1114)) break;
                    v10 /* !! */  = (long)js.jjfn("jmwi", jjfk(int ), (int)1115);
                }
                return (boolean)v9;
            }
lbl95:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmwj", jjfk(int ), (int)1116);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl100:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)js.jjfn("jmwk", jjfk(int ), (int)1117);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl105:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)js.jjfn("jmwl", jjfk(int ), (int)1118);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)js.jjfn("jmwm", jjfk(int ), (int)1119);
                    if (!var3_1) ** GOTO lbl95
                    throw null;
                }
            }
lbl115:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)js.jjfn("jmwn", jjfk(int ), (int)1120);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)js.jjfn("jmwo", jjfk(int ), (int)1121);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
lbl124:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)js.jjfn("jmwp", jjfk(int ), (int)1122);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)js.jjfn("jmwq", jjfk(int ), (int)1123);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)js.jjfn("jmwr", jjfk(int ), (int)1124);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)js.jjfn("jmws", jjfk(int ), (int)1125);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)js.jjfn("jmwt", jjfk(int ), (int)1126);
        ** while (!var3_1)
lbl143:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmzf() {
        js.jjfm[600] = 432158300;
        js.jjfm[601] = -659027815;
        js.jjfm[602] = 200039945;
        js.jjfm[603] = 674170366;
        js.jjfm[604] = 1795582504;
        js.jjfm[605] = 1123822007;
        js.jjfm[606] = -1449211571;
        js.jjfm[607] = -515757149;
        js.jjfm[608] = -1563904190;
        js.jjfm[609] = 2095456758;
        js.jjfm[610] = 512886524;
        js.jjfm[611] = 863753340;
        js.jjfm[612] = -845033878;
        js.jjfm[613] = 1525507426;
        js.jjfm[614] = 1017299850;
        js.jjfm[615] = -1616689224;
        js.jjfm[616] = 694321415;
        js.jjfm[617] = -1774880136;
        js.jjfm[618] = -577866396;
        js.jjfm[619] = -672621041;
        js.jjfm[620] = -1822215345;
        js.jjfm[621] = 2077103203;
        js.jjfm[622] = -1305138999;
        js.jjfm[623] = -624860993;
        js.jjfm[624] = 1012621008;
        js.jjfm[625] = -109226525;
        js.jjfm[626] = 1195685581;
        js.jjfm[627] = 430994877;
        js.jjfm[628] = -21894796;
        js.jjfm[629] = 1437298230;
        js.jjfm[630] = -210007065;
        js.jjfm[631] = -1964287651;
        js.jjfm[632] = 1757056914;
        js.jjfm[633] = -2092381918;
        js.jjfm[634] = 116554482;
        js.jjfm[635] = 517810687;
        js.jjfm[636] = -539783059;
        js.jjfm[637] = 1282207235;
        js.jjfm[638] = 2005364648;
        js.jjfm[639] = 765273465;
        js.jjfm[640] = -526324076;
        js.jjfm[641] = 1632734685;
        js.jjfm[642] = 1039315633;
        js.jjfm[643] = -1390249030;
        js.jjfm[644] = -1712551835;
        js.jjfm[645] = 218639137;
        js.jjfm[646] = -217469804;
        js.jjfm[647] = 1188010963;
        js.jjfm[648] = 1107885287;
        js.jjfm[649] = 1871608163;
        js.jjfm[650] = 710368602;
        js.jjfm[651] = 1762294986;
        js.jjfm[652] = 1636247054;
        js.jjfm[653] = 127697999;
        js.jjfm[654] = -690869647;
        js.jjfm[655] = 97525678;
        js.jjfm[656] = -1051561156;
        js.jjfm[657] = 2008666589;
        js.jjfm[658] = -779737389;
        js.jjfm[659] = -1623875861;
        js.jjfm[660] = -1428559861;
        js.jjfm[661] = -2126122045;
        js.jjfm[662] = 500775271;
        js.jjfm[663] = -1357226273;
        js.jjfm[664] = 1191428937;
        js.jjfm[665] = -906740693;
        js.jjfm[666] = -780089945;
        js.jjfm[667] = -814468180;
        js.jjfm[668] = -402255293;
        js.jjfm[669] = -1677620826;
        js.jjfm[670] = -577324414;
        js.jjfm[671] = -1244164017;
        js.jjfm[672] = 991867974;
        js.jjfm[673] = 442916447;
        js.jjfm[674] = -994694269;
        js.jjfm[675] = -731180303;
        js.jjfm[676] = -708210078;
        js.jjfm[677] = 2008462995;
        js.jjfm[678] = 1575344177;
        js.jjfm[679] = -1785265539;
        js.jjfm[680] = 1723600753;
        js.jjfm[681] = 1938051648;
        js.jjfm[682] = -1885780551;
        js.jjfm[683] = -743009934;
        js.jjfm[684] = 1641608279;
        js.jjfm[685] = 2117035548;
        js.jjfm[686] = -948482358;
        js.jjfm[687] = -576800857;
        js.jjfm[688] = -1853380175;
        js.jjfm[689] = -1142413784;
        js.jjfm[690] = -1573669765;
        js.jjfm[691] = -1933066103;
        js.jjfm[692] = 256278305;
        js.jjfm[693] = 255657405;
        js.jjfm[694] = -1525719860;
        js.jjfm[695] = 826761329;
        js.jjfm[696] = -413535990;
        js.jjfm[697] = -730343217;
        js.jjfm[698] = -1012637137;
        js.jjfm[699] = -1519380060;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderDiamond(class_1309 var1_1, class_243 var2_2, int var3_3, float var4_4) {
        var13_5 = js.c;
        var12_6 /* !! */  = js.b;
        var11_7 = js.a;
        if (var13_5) {
            throw null;
lbl6:
            // 15 sources

            return;
        }
        if (var11_7 || var11_7) ** GOTO lbl6
        v0 = js.jjfn("jjve", jjsd(int ), (int)38) * (double)var4_4;
        if (this.lastTarget == var1_1) {
            v1 /* !! */  = 1.0;
            if (var13_5) {
                throw null;
            }
        } else {
            v1 /* !! */  = (double)js.jjfn("jjvf", jjsd(int ), (int)39);
        }
        this.diamondRotation += v0 * v1 /* !! */ ;
        if (var11_7 || var11_7) ** GOTO lbl6
        if (var12_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_8 = (1.0f + this.hurtAnimation * js.jjfn("jjvg", jjfp(int ), (int)363)) * this.appearance;
                if (var11_7 || var11_7) ** GOTO lbl6
                var6_9 = (float)(System.currentTimeMillis() % js.jjfn("jjvh", jjht(int ), (int)40)) / js.jjfn("jjvi", jjfp(int ), (int)364);
                if (var11_7 || var11_7) ** GOTO lbl6
                var7_10 = nd.getClientColorAt(var6_9);
                if (var11_7 || var11_7) ** GOTO lbl6
                var8_11 = nd.getClientColorAt(var6_9 + js.jjfn("jjvj", jjfp(int ), (int)365));
                if (var11_7 || var11_7) ** GOTO lbl6
                var9_12 = nd.getClientColorAt(var6_9 + js.jjfn("jjvk", jjfp(int ), (int)366));
                if (var11_7 || var11_7) ** GOTO lbl6
                var10_13 = nd.getClientColorAt(var6_9 + js.jjfn("jjvl", jjfp(int ), (int)367));
                if (var11_7 || var11_7) ** GOTO lbl6
                if (!this.reddenOnHit.isValue()) ** GOTO lbl43
                if (var11_7 || var11_7) ** GOTO lbl6
                var7_10 = js.hurtColor(var7_10, this.hurtAnimation);
                if (var11_7 || var11_7) ** GOTO lbl6
                var8_11 = js.hurtColor(var8_11, this.hurtAnimation);
                if (var11_7 || var11_7) ** GOTO lbl6
                var9_12 = js.hurtColor(var9_12, this.hurtAnimation);
                if (var11_7 || var11_7) ** GOTO lbl6
                var10_13 = js.hurtColor(var10_13, this.hurtAnimation);
                if (var11_7) ** GOTO lbl6
lbl43:
                // 2 sources

                if (var11_7 || var11_7) ** GOTO lbl6
                lr.drawGradient(js.TARGET, var2_2.field_1352, var2_2.field_1351 + (double)var1_1.method_17682() * js.jjfn("jjvm", jjsd(int ), (int)41), var2_2.field_1350, var5_8, (float)(Math.sin(Math.toRadians(this.diamondRotation)) * js.jjfn("jjvn", jjsd(int ), (int)42)), var7_10, var8_11, var9_12, var10_13, this.appearance * js.jjfn("jjvo", jjfp(int ), (int)368), (boolean)js.jjfn("jjvp", jjfk(int ), (int)369));
                if (!var11_7 && !var11_7) ** break;
                ** continue;
                return;
            }
lbl48:
            // 3 sources

            case 0: {
                var12_6 /* !! */  = (int)js.jjfn("jjvq", jjfk(int ), (int)370);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl58
            }
            case 1: {
                var12_6 /* !! */  = (int)js.jjfn("jjvr", jjfk(int ), (int)371);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl58:
            // 3 sources

            case 2: {
                var12_6 /* !! */  = (int)js.jjfn("jjvs", jjfk(int ), (int)372);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 3: {
                var12_6 /* !! */  = (int)js.jjfn("jjvt", jjfk(int ), (int)373);
                if (!var13_5) break;
                throw null;
            }
lbl67:
            // 4 sources

            case 4: {
                var12_6 /* !! */  = (int)js.jjfn("jjvu", jjfk(int ), (int)374);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl72:
            // 2 sources

            case 5: {
                var12_6 /* !! */  = (int)js.jjfn("jjvv", jjfk(int ), (int)375);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl77:
            // 2 sources

            case 6: {
                var12_6 /* !! */  = (int)js.jjfn("jjvw", jjfk(int ), (int)376);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl82:
            // 2 sources

            case 7: {
                var12_6 /* !! */  = (int)js.jjfn("jjvx", jjfk(int ), (int)377);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl87:
            // 3 sources

            case 8: {
                var12_6 /* !! */  = (int)js.jjfn("jjvy", jjfk(int ), (int)378);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl92:
            // 3 sources

            case 9: {
                var12_6 /* !! */  = (int)js.jjfn("jjvz", jjfk(int ), (int)379);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl97:
            // 2 sources

            case 10: {
                var12_6 /* !! */  = (int)js.jjfn("jjwa", jjfk(int ), (int)380);
                if (!var13_5) ** GOTO lbl82
                throw null;
            }
            case 11: {
                var12_6 /* !! */  = (int)js.jjfn("jjwb", jjfk(int ), (int)381);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 12: {
                var12_6 /* !! */  = (int)js.jjfn("jjwc", jjfk(int ), (int)382);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl111:
            // 2 sources

            case 13: {
                do {
                    var12_6 /* !! */  = (int)js.jjfn("jjwd", jjfk(int ), (int)383);
                } while (!var13_5);
                throw null;
            }
            case 14: {
                var12_6 /* !! */  = (int)js.jjfn("jjwe", jjfk(int ), (int)384);
                if (!var13_5) ** GOTO lbl67
                throw null;
            }
            case 15: {
                var12_6 /* !! */  = (int)js.jjfn("jjwf", jjfk(int ), (int)385);
                if (!var13_5) ** GOTO lbl48
                throw null;
            }
            case 16: {
                var12_6 /* !! */  = (int)js.jjfn("jjwg", jjfk(int ), (int)386);
                if (!var13_5) ** GOTO lbl58
                throw null;
            }
            case 17: {
                var12_6 /* !! */  = (int)js.jjfn("jjwh", jjfk(int ), (int)387);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl133:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_6 /* !! */  = (int)js.jjfn("jjwi", jjfk(int ), (int)388);
                    if (var13_5) {
                        throw null;
                    }
                    ** GOTO lbl168
                    break;
                }
            }
lbl139:
            // 2 sources

            case 19: {
                var12_6 /* !! */  = (int)js.jjfn("jjwj", jjfk(int ), (int)389);
                if (!var13_5) ** GOTO lbl67
                throw null;
            }
lbl143:
            // 2 sources

            case 20: {
                var12_6 /* !! */  = (int)js.jjfn("jjwk", jjfk(int ), (int)390);
                if (var13_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 21: {
                var12_6 /* !! */  = (int)js.jjfn("jjwl", jjfk(int ), (int)391);
                if (!var13_5) ** GOTO lbl87
                throw null;
            }
            case 22: {
                var12_6 /* !! */  = (int)js.jjfn("jjwm", jjfk(int ), (int)392);
                if (!var13_5) ** GOTO lbl97
                throw null;
            }
            case 23: {
                var12_6 /* !! */  = (int)js.jjfn("jjwn", jjfk(int ), (int)393);
                if (!var13_5) ** GOTO lbl143
                throw null;
            }
lbl160:
            // 4 sources

            case 24: {
                var12_6 /* !! */  = (int)js.jjfn("jjwo", jjfk(int ), (int)394);
                if (!var13_5) ** GOTO lbl67
                throw null;
            }
lbl164:
            // 3 sources

            case 25: {
                var12_6 /* !! */  = (int)js.jjfn("jjwp", jjfk(int ), (int)395);
                if (!var13_5) ** GOTO lbl92
                throw null;
            }
lbl168:
            // 4 sources

            case 26: {
                var12_6 /* !! */  = (int)js.jjfn("jjwq", jjfk(int ), (int)396);
                if (!var13_5) ** GOTO lbl48
                throw null;
            }
lbl172:
            // 2 sources

            case 27: {
                var12_6 /* !! */  = (int)js.jjfn("jjwr", jjfk(int ), (int)397);
                if (!var13_5) ** GOTO lbl72
                throw null;
            }
            case 28: {
                var12_6 /* !! */  = (int)js.jjfn("jjws", jjfk(int ), (int)398);
                if (!var13_5) ** GOTO lbl168
                throw null;
            }
            case 29: {
                var12_6 /* !! */  = (int)js.jjfn("jjwt", jjfk(int ), (int)399);
                if (!var13_5) ** GOTO lbl160
                throw null;
            }
            case 30: 
        }
        var12_6 /* !! */  = (int)js.jjfn("jjwu", jjfk(int ), (int)400);
        ** while (!var13_5)
lbl187:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmzj() {
        js.jjfm[1000] = 700533078;
        js.jjfm[1001] = 1372824785;
        js.jjfm[1002] = -1876559943;
        js.jjfm[1003] = 1905700249;
        js.jjfm[1004] = -1165234502;
        js.jjfm[1005] = -1893998541;
        js.jjfm[1006] = -1133057986;
        js.jjfm[1007] = -1283438496;
        js.jjfm[1008] = 2135515311;
        js.jjfm[1009] = -1513961619;
        js.jjfm[1010] = -355673694;
        js.jjfm[1011] = 1930914492;
        js.jjfm[1012] = 821131387;
        js.jjfm[1013] = 1505915154;
        js.jjfm[1014] = 1816808402;
        js.jjfm[1015] = 629646368;
        js.jjfm[1016] = -1333775510;
        js.jjfm[1017] = -2002369806;
        js.jjfm[1018] = 492810102;
        js.jjfm[1019] = -1014473733;
        js.jjfm[1020] = 589151684;
        js.jjfm[1021] = -1647369109;
        js.jjfm[1022] = 610920487;
        js.jjfm[1023] = 1954005543;
        js.jjfm[1024] = 645799524;
        js.jjfm[1025] = 57732727;
        js.jjfm[1026] = -1263247047;
        js.jjfm[1027] = -1722389053;
        js.jjfm[1028] = -866104475;
        js.jjfm[1029] = 1971911372;
        js.jjfm[1030] = 150393429;
        js.jjfm[1031] = 34157641;
        js.jjfm[1032] = -57865059;
        js.jjfm[1033] = 129542768;
        js.jjfm[1034] = 480199428;
        js.jjfm[1035] = -1420043120;
        js.jjfm[1036] = 112884513;
        js.jjfm[1037] = -524661811;
        js.jjfm[1038] = -1897652123;
        js.jjfm[1039] = 1568663315;
        js.jjfm[1040] = -592496741;
        js.jjfm[1041] = -1956958899;
        js.jjfm[1042] = -17473682;
        js.jjfm[1043] = -394596135;
        js.jjfm[1044] = 1249817354;
        js.jjfm[1045] = 218297982;
        js.jjfm[1046] = -1673462110;
        js.jjfm[1047] = -357271351;
        js.jjfm[1048] = 1604843532;
        js.jjfm[1049] = -984575029;
        js.jjfm[1050] = -653265563;
        js.jjfm[1051] = -765375675;
        js.jjfm[1052] = 1587234516;
        js.jjfm[1053] = -1898933581;
        js.jjfm[1054] = -254964468;
        js.jjfm[1055] = -427896376;
        js.jjfm[1056] = 1930758428;
        js.jjfm[1057] = 118254632;
        js.jjfm[1058] = -764709101;
        js.jjfm[1059] = 2051264006;
        js.jjfm[1060] = 1797583031;
        js.jjfm[1061] = -2093085859;
        js.jjfm[1062] = -1955635369;
        js.jjfm[1063] = -1537900772;
        js.jjfm[1064] = -431672081;
        js.jjfm[1065] = -1346953750;
        js.jjfm[1066] = 2020166044;
        js.jjfm[1067] = 1359168528;
        js.jjfm[1068] = 1234772419;
        js.jjfm[1069] = -1890361609;
        js.jjfm[1070] = -75668929;
        js.jjfm[1071] = 91164477;
        js.jjfm[1072] = 1100443702;
        js.jjfm[1073] = -651311480;
        js.jjfm[1074] = 31169061;
        js.jjfm[1075] = -600513228;
        js.jjfm[1076] = 373481019;
        js.jjfm[1077] = -207546827;
        js.jjfm[1078] = 1260956549;
        js.jjfm[1079] = -575097140;
        js.jjfm[1080] = -1516560797;
        js.jjfm[1081] = -1526673504;
        js.jjfm[1082] = 174582255;
        js.jjfm[1083] = 939003865;
        js.jjfm[1084] = -1297971235;
        js.jjfm[1085] = -1376189717;
        js.jjfm[1086] = -1020795696;
        js.jjfm[1087] = -361194207;
        js.jjfm[1088] = 2037657793;
        js.jjfm[1089] = -315428543;
        js.jjfm[1090] = -494497604;
        js.jjfm[1091] = 1154106673;
        js.jjfm[1092] = -1523084805;
        js.jjfm[1093] = -1606715599;
        js.jjfm[1094] = 722573679;
        js.jjfm[1095] = 2146550337;
        js.jjfm[1096] = -45380617;
        js.jjfm[1097] = -503112514;
        js.jjfm[1098] = -197401993;
        js.jjfm[1099] = 198694331;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jjra", jjht(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == js.jjfn("jjrb", jjfk(int ), (int)279)) break;
            v0 /* !! */  = (long)js.jjfn("jjrc", jjfk(int ), (int)280);
        }
        var3_1 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jjrd", jjht(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == js.jjfn("jjre", jjfk(int ), (int)281)) break;
            v1 /* !! */  = (long)js.jjfn("jjrf", jjfk(int ), (int)282);
        }
        var2_2 /* !! */  = js.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jjrg", jjht(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == js.jjfn("jjrh", jjfk(int ), (int)283)) break;
            v2 /* !! */  = (long)js.jjfn("jjri", jjfk(int ), (int)284);
        }
        var1_3 = js.a;
        if (var3_1) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jjrj", jjht(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == js.jjfn("jjrk", jjfk(int ), (int)285)) break;
            v3 /* !! */  = (long)js.jjfn("jjrl", jjfk(int ), (int)286);
        }
        this.hoverTarget = null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl21
                v4 = js.jjfn("jjrm", jjht(int ), (int)19);
                v5 /* !! */  = js.rm;
                if (true) ** GOTO lbl39
                block26: while (true) {
                    v5 /* !! */  = (long)(js.jjfn("jjro", jjht(int ), (int)21) - js.jjfn("jjrn", jjht(int ), (int)20));
lbl39:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1478875035: {
                            continue block26;
                        }
                        case 458795960: {
                            break block26;
                        }
                    }
                    break;
                }
                this.hoverTargetExpiresAt = (long)v4;
                if (var1_3 || var1_3) ** GOTO lbl21
                v6 = js.jjfn("jjrp", jjht(int ), (int)22);
                v7 /* !! */  = js.rm;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v7 /* !! */  = (long)(v8 - js.jjfn("jjrq", jjht(int ), (int)23));
lbl51:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 458795960: {
                            break block27;
                        }
                        case 892194665: {
                            v8 = js.jjfn("jjrr", jjht(int ), (int)24);
                            continue block27;
                        }
                        case 1987102166: {
                            v8 = js.jjfn("jjrs", jjht(int ), (int)25);
                            continue block27;
                        }
                    }
                    break;
                }
                this.lastFrameTime = (long)v6;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jjrt", jjfk(int ), (int)287);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl68:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)js.jjfn("jjru", jjfk(int ), (int)288);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)js.jjfn("jjrv", jjfk(int ), (int)289);
                if (var3_1) {
                    throw null;
                }
            }
lbl76:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)js.jjfn("jjrw", jjfk(int ), (int)290);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl81:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)js.jjfn("jjrx", jjfk(int ), (int)291);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
lbl85:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)js.jjfn("jjry", jjfk(int ), (int)292);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
lbl89:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)js.jjfn("jjrz", jjfk(int ), (int)293);
                if (!var3_1) ** GOTO lbl76
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)js.jjfn("jjsa", jjfk(int ), (int)294);
                if (!var3_1) break;
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)js.jjfn("jjsb", jjfk(int ), (int)295);
                    if (!var3_1) ** GOTO lbl81
                    throw null;
                }
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)js.jjfn("jjsc", jjfk(int ), (int)296);
        ** while (!var3_1)
lbl105:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static js getInstance() {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(js.jjfn("jjhx", jjht(int ), (int)1) - js.jjfn("jjhw", jjht(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -175399524: {
                    continue block22;
                }
                case 458795960: {
                    break block22;
                }
            }
            break;
        }
        var2 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jjhy", jjht(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == js.jjfn("jjhz", jjfk(int ), (int)56)) break;
            v1 /* !! */  = (long)js.jjfn("jjia", jjfk(int ), (int)57);
        }
        var1_1 /* !! */  = js.b;
        v2 /* !! */  = js.rm;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - js.jjfn("jjib", jjht(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1509585586: {
                    v3 = js.jjfn("jjic", jjht(int ), (int)4);
                    continue block24;
                }
                case -466631913: {
                    v3 = js.jjfn("jjid", jjht(int ), (int)5);
                    continue block24;
                }
                case -128071299: {
                    v3 = js.jjfn("jjie", jjht(int ), (int)6);
                    continue block24;
                }
                case 458795960: {
                    break block24;
                }
            }
            break;
        }
        var0_2 = js.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = js.rm;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - js.jjfn("jjif", jjht(int ), (int)7));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1166883561: {
                            v5 = js.jjfn("jjig", jjht(int ), (int)8);
                            continue block26;
                        }
                        case 180405540: {
                            v5 = js.jjfn("jjih", jjht(int ), (int)9);
                            continue block26;
                        }
                        case 203228931: {
                            v5 = js.jjfn("jjii", jjht(int ), (int)10);
                            continue block26;
                        }
                        case 458795960: {
                            break block26;
                        }
                    }
                    break;
                }
                return nj.get(js.class);
            }
lbl61:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)js.jjfn("jjij", jjfk(int ), (int)58);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)js.jjfn("jjik", jjfk(int ), (int)59);
                if (!var2) ** GOTO lbl61
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)js.jjfn("jjil", jjfk(int ), (int)60);
                if (!var2) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)js.jjfn("jjim", jjfk(int ), (int)61);
        ** while (!var2)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmzq() {
        js.jjhv[100] = 7289582647850308180L;
        js.jjhv[101] = -419242374002275850L;
        js.jjhv[102] = -2042839447810395547L;
        js.jjhv[103] = -1784158956017308177L;
        js.jjhv[104] = -5437840030219149496L;
        js.jjhv[105] = 4825343243298674755L;
        js.jjhv[106] = -5062602542952859696L;
        js.jjhv[107] = -6413259633643274771L;
        js.jjhv[108] = 3799683837374321588L;
        js.jjhv[109] = -2308533266742807461L;
        js.jjhv[110] = -42327688560201657L;
        js.jjhv[111] = -7198447676570968950L;
        js.jjhv[112] = 7015737167143980480L;
        js.jjhv[113] = 722202367483930324L;
        js.jjhv[114] = -7275308717232077564L;
        js.jjhv[115] = 3768633184766111319L;
        js.jjhv[116] = -143323735260679929L;
        js.jjhv[117] = -6638741657142294543L;
        js.jjhv[118] = -5114821457950710011L;
        js.jjhv[119] = 3300215175682189706L;
        js.jjhv[120] = -1321404850670152617L;
        js.jjhv[121] = -8710513691139537395L;
        js.jjhv[122] = 40711872181324715L;
        js.jjhv[123] = 5716885550859267158L;
        js.jjhv[124] = -1747252545965529038L;
        js.jjhv[125] = 2100401710661238292L;
        js.jjhv[126] = 3086044544081117421L;
        js.jjhv[127] = -2692562881130206620L;
        js.jjhv[128] = 4426370060747192499L;
        js.jjhv[129] = 935274490752482962L;
        js.jjhv[130] = -4621143329767317579L;
        js.jjhv[131] = -9179016928908040448L;
        js.jjhv[132] = -8659585673313397871L;
        js.jjhv[133] = -937762697867073436L;
        js.jjhv[134] = -7893563455241964279L;
        js.jjhv[135] = 2626108469891005525L;
        js.jjhv[136] = -1540858261027332757L;
        js.jjhv[137] = -7358806552096849838L;
        js.jjhv[138] = 372538205047534307L;
        js.jjhv[139] = 6701607414197953428L;
        js.jjhv[140] = -2732519746872076624L;
        js.jjhv[141] = 1629038975691537955L;
        js.jjhv[142] = 2870540407036165725L;
        js.jjhv[143] = 4161876575869989324L;
        js.jjhv[144] = 3599890347424555171L;
        js.jjhv[145] = 2163274848619766327L;
        js.jjhv[146] = -8183130307823495682L;
        js.jjhv[147] = -2599596628938632777L;
        js.jjhv[148] = -2593651762497478537L;
        js.jjhv[149] = -8703469481777489383L;
        js.jjhv[150] = 5883329645513129953L;
        js.jjhv[151] = -7991503295768451808L;
        js.jjhv[152] = -342733074110115165L;
        js.jjhv[153] = -7010652140616757891L;
        js.jjhv[154] = 2368409609012283351L;
        js.jjhv[155] = -1601420151317127981L;
        js.jjhv[156] = 2045179390187930772L;
        js.jjhv[157] = -3267941921054115660L;
        js.jjhv[158] = 8965347178070046341L;
        js.jjhv[159] = -371510890545622293L;
        js.jjhv[160] = -2550506541247712939L;
        js.jjhv[161] = 3838003992737462939L;
        js.jjhv[162] = 5337178491358844778L;
        js.jjhv[163] = 7674784646556735103L;
        js.jjhv[164] = 6832174844649655916L;
        js.jjhv[165] = 2000009629086363626L;
        js.jjhv[166] = -1936515973691926110L;
        js.jjhv[167] = -366525831701943566L;
        js.jjhv[168] = -8158164844962407937L;
        js.jjhv[169] = -6572503588075397649L;
        js.jjhv[170] = -5258518087152085484L;
        js.jjhv[171] = 8950911963201253463L;
        js.jjhv[172] = 4930880272846906580L;
        js.jjhv[173] = 5768400452306499964L;
        js.jjhv[174] = 3674800361847285724L;
        js.jjhv[175] = -3673572317720466076L;
        js.jjhv[176] = 479009201204303550L;
        js.jjhv[177] = 7151533461312414492L;
        js.jjhv[178] = -56812494004389029L;
        js.jjhv[179] = -3077811870882761581L;
        js.jjhv[180] = -8921167666582314560L;
        js.jjhv[181] = -391718476449416040L;
        js.jjhv[182] = 6371014103790498778L;
        js.jjhv[183] = 3093344940464161097L;
        js.jjhv[184] = 2899866655282651477L;
        js.jjhv[185] = 905899255384565725L;
        js.jjhv[186] = 3039060090341042584L;
        js.jjhv[187] = -885351927224685281L;
        js.jjhv[188] = 7865629753454069108L;
        js.jjhv[189] = -1298039541191881430L;
        js.jjhv[190] = 8942860972669005491L;
        js.jjhv[191] = 8755381893811487426L;
        js.jjhv[192] = -4325034700793116855L;
        js.jjhv[193] = 6635686193949481901L;
        js.jjhv[194] = 2056038881928354053L;
        js.jjhv[195] = -6148111807407746607L;
        js.jjhv[196] = 4702122467127933867L;
        js.jjhv[197] = -1569234502263671455L;
        js.jjhv[198] = -851366522309638512L;
        js.jjhv[199] = 2350113656153604782L;
    }

    private static /* synthetic */ int jjfk(int n2) {
        return jjfl[n2] ^ jjfm[n2];
    }

    static {
        jjfl = new int[1145];
        jjfm = new int[1145];
        js.jmyn();
        js.jmyo();
        js.jmyp();
        js.jmyq();
        js.jmyr();
        js.jmys();
        js.jmyt();
        js.jmyu();
        js.jmyv();
        js.jmyw();
        js.jmyx();
        js.jmyy();
        js.jmyz();
        js.jmza();
        js.jmzb();
        js.jmzc();
        js.jmzd();
        js.jmze();
        js.jmzf();
        js.jmzg();
        js.jmzh();
        js.jmzi();
        js.jmzj();
        js.jmzk();
        jjhu = new long[330];
        jjhv = new long[330];
        js.jmzl();
        js.jmzm();
        js.jmzn();
        js.jmzo();
        js.jmzp();
        js.jmzq();
        js.jmzr();
        js.jmzs();
        TARGET = class_2960.method_60655((String)"phobia", (String)"textures/targetesp/target.png");
        GHOST_BASE_SPEED = new double[]{-0.25, -0.3, 0.25};
        GHOST_HURT_SPEED = new double[]{-0.3, -0.35, 0.3};
        GHOST_X_SIGN = new double[]{1.0, -1.0, -1.0};
        GHOST_Y_CURVE = new double[]{0.4, 0.3, -0.4};
        GHOST_Y_BASE = new double[]{0.7, 0.08, -0.7};
        GHOST_Z_SIGN = new double[]{-1.0, -1.0, 1.0};
        GHOST_USE_X = new boolean[]{false, true, true};
    }

    private static /* synthetic */ void jmyt() {
        js.jjfl[600] = 432158279;
        js.jjfl[601] = -659027834;
        js.jjfl[602] = 200039938;
        js.jjfl[603] = 674170353;
        js.jjfl[604] = 1795582505;
        js.jjfl[605] = 1123822006;
        js.jjfl[606] = -1449211572;
        js.jjfl[607] = -515757138;
        js.jjfl[608] = -1563904188;
        js.jjfl[609] = 2095456762;
        js.jjfl[610] = 512886523;
        js.jjfl[611] = 863753336;
        js.jjfl[612] = -845033878;
        js.jjfl[613] = 1525507424;
        js.jjfl[614] = 1017299852;
        js.jjfl[615] = -1616689230;
        js.jjfl[616] = 694321415;
        js.jjfl[617] = -1774880144;
        js.jjfl[618] = -577866396;
        js.jjfl[619] = -672621042;
        js.jjfl[620] = -1822215345;
        js.jjfl[621] = 2077103200;
        js.jjfl[622] = -1305139000;
        js.jjfl[623] = -624860993;
        js.jjfl[624] = 1012621001;
        js.jjfl[625] = -1196075549;
        js.jjfl[626] = 2055764480;
        js.jjfl[627] = 657487293;
        js.jjfl[628] = -21894795;
        js.jjfl[629] = 1437298294;
        js.jjfl[630] = -210007071;
        js.jjfl[631] = -1964287680;
        js.jjfl[632] = 1757056899;
        js.jjfl[633] = -2092381936;
        js.jjfl[634] = 116554474;
        js.jjfl[635] = 517810658;
        js.jjfl[636] = -539783053;
        js.jjfl[637] = 1282207278;
        js.jjfl[638] = 2005364668;
        js.jjfl[639] = 765273441;
        js.jjfl[640] = -526324084;
        js.jjfl[641] = 1632734675;
        js.jjfl[642] = 1039315600;
        js.jjfl[643] = -1390249052;
        js.jjfl[644] = -1712551869;
        js.jjfl[645] = 218639141;
        js.jjfl[646] = -217469772;
        js.jjfl[647] = 1188010956;
        js.jjfl[648] = 1107885300;
        js.jjfl[649] = 1871608138;
        js.jjfl[650] = 710368593;
        js.jjfl[651] = 1762294976;
        js.jjfl[652] = 1636247073;
        js.jjfl[653] = 127698017;
        js.jjfl[654] = -690869641;
        js.jjfl[655] = 97525693;
        js.jjfl[656] = -1051561178;
        js.jjfl[657] = 2008666579;
        js.jjfl[658] = -779737405;
        js.jjfl[659] = -1623875865;
        js.jjfl[660] = -1428559843;
        js.jjfl[661] = -2126122044;
        js.jjfl[662] = 500775268;
        js.jjfl[663] = -1357226257;
        js.jjfl[664] = 1191428962;
        js.jjfl[665] = -906740677;
        js.jjfl[666] = -780089949;
        js.jjfl[667] = -814468211;
        js.jjfl[668] = -402255272;
        js.jjfl[669] = -1677620832;
        js.jjfl[670] = -577324405;
        js.jjfl[671] = -1244163995;
        js.jjfl[672] = 991867996;
        js.jjfl[673] = 442916430;
        js.jjfl[674] = -994694260;
        js.jjfl[675] = -731180321;
        js.jjfl[676] = -708210071;
        js.jjfl[677] = 2008463007;
        js.jjfl[678] = 1575344133;
        js.jjfl[679] = -1785265556;
        js.jjfl[680] = 1723600725;
        js.jjfl[681] = 1938051693;
        js.jjfl[682] = -1885780590;
        js.jjfl[683] = -743009946;
        js.jjfl[684] = 1641608291;
        js.jjfl[685] = 2117035540;
        js.jjfl[686] = -2034282806;
        js.jjfl[687] = -576800858;
        js.jjfl[688] = -1853380175;
        js.jjfl[689] = -1142413781;
        js.jjfl[690] = -1573669756;
        js.jjfl[691] = -1933066122;
        js.jjfl[692] = 256278494;
        js.jjfl[693] = 255657282;
        js.jjfl[694] = -1681682431;
        js.jjfl[695] = 826761329;
        js.jjfl[696] = -413535989;
        js.jjfl[697] = -730343217;
        js.jjfl[698] = -47497722;
        js.jjfl[699] = -1739338066;
    }

    private static /* synthetic */ void jmzr() {
        js.jjhv[200] = 7736860272441142393L;
        js.jjhv[201] = 6766519249362574611L;
        js.jjhv[202] = 1769680634440343022L;
        js.jjhv[203] = 2889078200858296215L;
        js.jjhv[204] = -2564740147359841243L;
        js.jjhv[205] = 77446383845741309L;
        js.jjhv[206] = 6135709543410280782L;
        js.jjhv[207] = 670269987980937214L;
        js.jjhv[208] = -2943788570180687261L;
        js.jjhv[209] = 6196190399758543707L;
        js.jjhv[210] = 5624290812580804310L;
        js.jjhv[211] = 8793683360723603595L;
        js.jjhv[212] = 2620347823884942483L;
        js.jjhv[213] = 8274485978126747011L;
        js.jjhv[214] = 5532368369856775115L;
        js.jjhv[215] = -3943043597415214755L;
        js.jjhv[216] = 9122997748514848064L;
        js.jjhv[217] = 5949539765230365275L;
        js.jjhv[218] = 6915192856166013647L;
        js.jjhv[219] = 1114001371949952206L;
        js.jjhv[220] = -4756383467810137076L;
        js.jjhv[221] = -5949530098653088955L;
        js.jjhv[222] = -659270836518671994L;
        js.jjhv[223] = -8310080728316417283L;
        js.jjhv[224] = -3211898873429726175L;
        js.jjhv[225] = -7857758533245688508L;
        js.jjhv[226] = -3991139901590208720L;
        js.jjhv[227] = -8124481697110825300L;
        js.jjhv[228] = 8823199342988376247L;
        js.jjhv[229] = -6273298261267964362L;
        js.jjhv[230] = -4915948977060865277L;
        js.jjhv[231] = 337375507346296357L;
        js.jjhv[232] = 4654060333375331361L;
        js.jjhv[233] = 3949305164605447130L;
        js.jjhv[234] = 8799058114127885754L;
        js.jjhv[235] = -8900229518819719902L;
        js.jjhv[236] = 6979514370042085024L;
        js.jjhv[237] = -7656203545110833063L;
        js.jjhv[238] = 8767605137219945314L;
        js.jjhv[239] = 3958005449629619733L;
        js.jjhv[240] = 9204500110428530058L;
        js.jjhv[241] = -2972886274700655312L;
        js.jjhv[242] = -3414656658966358285L;
        js.jjhv[243] = -9010118820643466873L;
        js.jjhv[244] = -2555811587547790399L;
        js.jjhv[245] = 5568614143480461374L;
        js.jjhv[246] = 1091357491437445048L;
        js.jjhv[247] = -6937052914184083672L;
        js.jjhv[248] = 3796588096415445157L;
        js.jjhv[249] = 6135039984961389598L;
        js.jjhv[250] = 1837573852721184548L;
        js.jjhv[251] = -553761721867174229L;
        js.jjhv[252] = -814266573962714422L;
        js.jjhv[253] = 706487974908694529L;
        js.jjhv[254] = -3664594459698637621L;
        js.jjhv[255] = 390667658580325832L;
        js.jjhv[256] = -6468876560779395451L;
        js.jjhv[257] = 7660606840607406230L;
        js.jjhv[258] = 2941613530620499724L;
        js.jjhv[259] = 192036808524814777L;
        js.jjhv[260] = -4464965352863398098L;
        js.jjhv[261] = 7800159902844305139L;
        js.jjhv[262] = 4405994517064276073L;
        js.jjhv[263] = 230239172233536480L;
        js.jjhv[264] = 1845211155814543236L;
        js.jjhv[265] = 7853345393218597027L;
        js.jjhv[266] = -7352229383998195433L;
        js.jjhv[267] = -6546651693390767645L;
        js.jjhv[268] = 7985041813765267357L;
        js.jjhv[269] = 7602948057399321448L;
        js.jjhv[270] = 6276319075406686259L;
        js.jjhv[271] = -7941219192153633712L;
        js.jjhv[272] = -8629896006520134017L;
        js.jjhv[273] = -8355718152245119318L;
        js.jjhv[274] = -8846313118899053889L;
        js.jjhv[275] = 3197268384109947915L;
        js.jjhv[276] = 3960873271689590636L;
        js.jjhv[277] = 894166897829977665L;
        js.jjhv[278] = 2669624265329093597L;
        js.jjhv[279] = -2319071560453110412L;
        js.jjhv[280] = 7186571334663330904L;
        js.jjhv[281] = 4593350950577439582L;
        js.jjhv[282] = 4396962182986530499L;
        js.jjhv[283] = -1150660808779254549L;
        js.jjhv[284] = 7362389086812052648L;
        js.jjhv[285] = 5866496569196695334L;
        js.jjhv[286] = 6873024368722161744L;
        js.jjhv[287] = 8162169603918760437L;
        js.jjhv[288] = -3972032348345943438L;
        js.jjhv[289] = -2844770750305758570L;
        js.jjhv[290] = -1136936365846291931L;
        js.jjhv[291] = -1849474258359777579L;
        js.jjhv[292] = 147646935675084803L;
        js.jjhv[293] = 6518396481427562085L;
        js.jjhv[294] = -8391251724182886041L;
        js.jjhv[295] = 2661674971469988849L;
        js.jjhv[296] = -5508781541968771993L;
        js.jjhv[297] = 2353245296535599104L;
        js.jjhv[298] = -3347026514633264575L;
        js.jjhv[299] = 5574115451543445745L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static double smoothStep(double var0) {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - js.jjfn("jlfb", jjht(int ), (int)79));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -282654619: {
                    v1 = js.jjfn("jlfc", jjht(int ), (int)80);
                    continue block23;
                }
                case 65893543: {
                    v1 = js.jjfn("jlfd", jjht(int ), (int)81);
                    continue block23;
                }
                case 458795960: {
                    break block23;
                }
            }
            break;
        }
        var4_1 = js.c;
        v2 /* !! */  = js.rm;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - js.jjfn("jlfe", jjht(int ), (int)82));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 458795960: {
                    break block24;
                }
                case 1005406895: {
                    v3 = js.jjfn("jlff", jjht(int ), (int)83);
                    continue block24;
                }
                case 1169906690: {
                    v3 = js.jjfn("jlfg", jjht(int ), (int)84);
                    continue block24;
                }
                case 1940589877: {
                    v3 = js.jjfn("jlfh", jjht(int ), (int)85);
                    continue block24;
                }
            }
            break;
        }
        var3_2 /* !! */  = js.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jlfi", jjht(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == js.jjfn("jlfj", jjfk(int ), (int)587)) break;
            v4 /* !! */  = (long)js.jjfn("jlfk", jjfk(int ), (int)588);
        }
        var2_3 = js.a;
        if (var4_1) {
            throw null;
lbl41:
            // 3 sources

            return (double)js.jjfn("jlfl", jjsd(int ), (int)87);
        }
        if (var2_3 || var2_3) ** GOTO lbl41
        v5 /* !! */  = js.rm;
        if (true) ** GOTO lbl48
        block27: while (true) {
            v5 /* !! */  = (long)(js.jjfn("jlfn", jjht(int ), (int)89) - js.jjfn("jlfm", jjht(int ), (int)88));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -574659525: {
                    continue block27;
                }
                case 458795960: {
                    break block27;
                }
            }
            break;
        }
        var0 = class_3532.method_15350((double)var0, (double)0.0, (double)1.0);
        if (var2_3) ** GOTO lbl41
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return var0 * var0 * (js.jjfn("jlfo", jjsd(int ), (int)90) - js.jjfn("jlfp", jjsd(int ), (int)91) * var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)js.jjfn("jlfq", jjfk(int ), (int)589);
                    if (!var4_1) break block15;
                    throw null;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)js.jjfn("jlfr", jjfk(int ), (int)590);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 2: {
                do {
                    var3_2 /* !! */  = (int)js.jjfn("jlfs", jjfk(int ), (int)591);
                } while (!var4_1);
                throw null;
            }
lbl76:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)js.jjfn("jlft", jjfk(int ), (int)592);
                if (var4_1) {
                    throw null;
                }
            }
            case 4: {
                do {
                    var3_2 /* !! */  = (int)js.jjfn("jlfu", jjfk(int ), (int)593);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)js.jjfn("jlfv", jjfk(int ), (int)594);
        ** while (!var4_1)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmyy() {
        js.jjfl[1100] = 1812647430;
        js.jjfl[1101] = -1574947777;
        js.jjfl[1102] = -229589867;
        js.jjfl[1103] = -694405971;
        js.jjfl[1104] = 946408396;
        js.jjfl[1105] = -1050121448;
        js.jjfl[1106] = -44886239;
        js.jjfl[1107] = 519212547;
        js.jjfl[1108] = 358444690;
        js.jjfl[1109] = 386731819;
        js.jjfl[1110] = 1967925424;
        js.jjfl[1111] = -276044493;
        js.jjfl[1112] = -460156811;
        js.jjfl[1113] = 978532386;
        js.jjfl[1114] = 303870527;
        js.jjfl[1115] = -711430815;
        js.jjfl[1116] = -108815603;
        js.jjfl[1117] = 1140839758;
        js.jjfl[1118] = 662246266;
        js.jjfl[1119] = 1235568392;
        js.jjfl[1120] = 312813020;
        js.jjfl[1121] = -95443445;
        js.jjfl[1122] = -1581820127;
        js.jjfl[1123] = 2065394175;
        js.jjfl[1124] = 458911740;
        js.jjfl[1125] = 1381779737;
        js.jjfl[1126] = 1010623870;
        js.jjfl[1127] = -1390535839;
        js.jjfl[1128] = 2105282280;
        js.jjfl[1129] = 1802555879;
        js.jjfl[1130] = -24111442;
        js.jjfl[1131] = -924979340;
        js.jjfl[1132] = -1591302866;
        js.jjfl[1133] = -1232702612;
        js.jjfl[1134] = 1235751067;
        js.jjfl[1135] = -611589623;
        js.jjfl[1136] = -473208645;
        js.jjfl[1137] = -1165907728;
        js.jjfl[1138] = -1159810426;
        js.jjfl[1139] = -36858510;
        js.jjfl[1140] = -1890614553;
        js.jjfl[1141] = 84905956;
        js.jjfl[1142] = -701480694;
        js.jjfl[1143] = 1450200143;
        js.jjfl[1144] = -1891919112;
    }

    private static /* synthetic */ void jmzh() {
        js.jjfm[800] = 2082896660;
        js.jjfm[801] = -467754141;
        js.jjfm[802] = 1565320853;
        js.jjfm[803] = 81769055;
        js.jjfm[804] = -186082857;
        js.jjfm[805] = -1350352899;
        js.jjfm[806] = -1798767821;
        js.jjfm[807] = -721646187;
        js.jjfm[808] = -1312526441;
        js.jjfm[809] = 260443430;
        js.jjfm[810] = 1347099603;
        js.jjfm[811] = -1656807353;
        js.jjfm[812] = -251584293;
        js.jjfm[813] = -503256799;
        js.jjfm[814] = 2090336815;
        js.jjfm[815] = -883052174;
        js.jjfm[816] = 1486200265;
        js.jjfm[817] = 181690091;
        js.jjfm[818] = 1956327228;
        js.jjfm[819] = -138235549;
        js.jjfm[820] = -352267283;
        js.jjfm[821] = -916787532;
        js.jjfm[822] = 1501887627;
        js.jjfm[823] = 774502725;
        js.jjfm[824] = -1905401870;
        js.jjfm[825] = -736497669;
        js.jjfm[826] = 1618462059;
        js.jjfm[827] = -871782352;
        js.jjfm[828] = -828324873;
        js.jjfm[829] = 1620797415;
        js.jjfm[830] = -1537686271;
        js.jjfm[831] = -2129203230;
        js.jjfm[832] = 279453113;
        js.jjfm[833] = -61143243;
        js.jjfm[834] = 1242684260;
        js.jjfm[835] = -1036941193;
        js.jjfm[836] = 79536092;
        js.jjfm[837] = 909357283;
        js.jjfm[838] = -289196062;
        js.jjfm[839] = 1737335241;
        js.jjfm[840] = -1185698828;
        js.jjfm[841] = -1549949587;
        js.jjfm[842] = 342541579;
        js.jjfm[843] = 1753776159;
        js.jjfm[844] = 2102373703;
        js.jjfm[845] = -1699804433;
        js.jjfm[846] = 1587107461;
        js.jjfm[847] = 1262590972;
        js.jjfm[848] = 1935309517;
        js.jjfm[849] = -1393236442;
        js.jjfm[850] = -2031210298;
        js.jjfm[851] = 1732444857;
        js.jjfm[852] = 1857431570;
        js.jjfm[853] = -745282530;
        js.jjfm[854] = 1188549290;
        js.jjfm[855] = 636141931;
        js.jjfm[856] = -476890675;
        js.jjfm[857] = -1223423594;
        js.jjfm[858] = 812154731;
        js.jjfm[859] = -1140721743;
        js.jjfm[860] = -1188144087;
        js.jjfm[861] = 1636459909;
        js.jjfm[862] = 878613720;
        js.jjfm[863] = -1902495183;
        js.jjfm[864] = 36923770;
        js.jjfm[865] = 853773240;
        js.jjfm[866] = -804838752;
        js.jjfm[867] = 1839134137;
        js.jjfm[868] = 2146007562;
        js.jjfm[869] = 1146988127;
        js.jjfm[870] = 92078817;
        js.jjfm[871] = -278368872;
        js.jjfm[872] = -1171837449;
        js.jjfm[873] = -1850303428;
        js.jjfm[874] = 1204312695;
        js.jjfm[875] = -1315772241;
        js.jjfm[876] = 1662893632;
        js.jjfm[877] = 448252188;
        js.jjfm[878] = 1704528190;
        js.jjfm[879] = -438139270;
        js.jjfm[880] = -1624237696;
        js.jjfm[881] = -1791987464;
        js.jjfm[882] = -2081263144;
        js.jjfm[883] = -2087623292;
        js.jjfm[884] = 1152744271;
        js.jjfm[885] = -1358688886;
        js.jjfm[886] = -194676307;
        js.jjfm[887] = 364199197;
        js.jjfm[888] = -817654297;
        js.jjfm[889] = -514367197;
        js.jjfm[890] = -778304205;
        js.jjfm[891] = 989355593;
        js.jjfm[892] = 1899966986;
        js.jjfm[893] = -117742917;
        js.jjfm[894] = 527004783;
        js.jjfm[895] = 1580027898;
        js.jjfm[896] = 1627154723;
        js.jjfm[897] = -1299032247;
        js.jjfm[898] = -859315270;
        js.jjfm[899] = -1006404990;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderSouls(class_1309 var1_1, class_243 var2_2, int var3_3, float var4_4) {
        var34_5 = js.c;
        var33_6 /* !! */  = js.b;
        var32_7 = js.a;
        if (var34_5) {
            throw null;
lbl6:
            // 42 sources

            return;
        }
        if (var32_7 || var32_7) ** GOTO lbl6
        var5_8 = var2_2.field_1352;
        if (var32_7 || var32_7) ** GOTO lbl6
        var7_9 = var2_2.field_1351 + (double)var1_1.method_17682() / js.jjfn("jlrd", jjsd(int ), (int)129);
        if (var32_7 || var32_7) ** GOTO lbl6
        var9_10 = var2_2.field_1350;
        if (var32_7 || var32_7) ** GOTO lbl6
        var11_11 = Math.max((double)js.jjfn("jlre", jjsd(int ), (int)130), Math.max((double)var1_1.method_17681(), (double)var1_1.method_17682() * js.jjfn("jlrf", jjsd(int ), (int)131)) * js.jjfn("jlrg", jjsd(int ), (int)132));
        if (var32_7 || var32_7) ** GOTO lbl6
        this.soulPhase += (double)var4_4 * js.jjfn("jlrh", jjsd(int ), (int)133) * (double)this.soulSpeed.getValue();
        if (var32_7 || var32_7) ** GOTO lbl6
        var13_12 = this.soulSize.getValue();
        if (var32_7 || var32_7) ** GOTO lbl6
        var14_13 = this.soulBright.getValue();
        if (var32_7 || var32_7) ** GOTO lbl6
        var15_14 = js.jjfn("jlri", jjfk(int ), (int)851);
        if (var32_7 || var32_7) ** GOTO lbl6
        var16_15 = this.soulLength.getValue() / (float)var15_14;
        if (var32_7 || var32_7) ** GOTO lbl6
        var18_16 = 1.0f + this.hurtAnimation * js.jjfn("jlrj", jjfp(int ), (int)852);
        if (var32_7 || var32_7) ** GOTO lbl6
        lz.begin((boolean)js.jjfn("jlrk", jjfk(int ), (int)853));
        if (var32_7 || var32_7) ** GOTO lbl6
        var19_17 = js.jjfn("jlrl", jjfk(int ), (int)854);
        if (var32_7) ** GOTO lbl6
        block83: while (true) {
            block162: {
                block161: {
                    block160: {
                        block159: {
                            block158: {
                                if (var32_7 || var32_7) ** GOTO lbl6
                                if (var19_17 >= var15_14) ** GOTO lbl106
                                if (var32_7 || var32_7) ** GOTO lbl6
                                var20_18 = this.soulPhase - (double)var19_17 * var16_15;
                                if (var32_7 || var32_7) ** GOTO lbl6
                                var22_19 = Math.sin(var20_18) * var11_11;
                                if (var32_7 || var32_7) ** GOTO lbl6
                                var24_20 = Math.cos(var20_18) * var11_11;
                                if (var32_7 || var32_7) ** GOTO lbl6
                                var26_21 = 1.0f - (float)var19_17 / (float)var15_14;
                                if (var32_7 || var32_7) ** GOTO lbl6
                                if (var19_17 != false) break block158;
                                if (var32_7) ** GOTO lbl6
                                v0 = js.jjfn("jlrm", jjfk(int ), (int)855);
                                if (var34_5) {
                                    throw null;
                                }
                                break block159;
                            }
                            if (var32_7 || var32_7) ** GOTO lbl6
                            v0 = var27_22 = js.jjfn("jlrn", jjfk(int ), (int)856);
                        }
                        if (var32_7 || var32_7) ** GOTO lbl6
                        if (var27_22 == false) break block160;
                        if (var32_7) ** GOTO lbl6
                        v1 = js.jjfn("jlro", jjfp(int ), (int)857);
                        if (var34_5) {
                            throw null;
                        }
                        break block161;
                    }
                    if (var32_7 || var32_7) ** GOTO lbl6
                    v1 = js.jjfn("jlrp", jjfp(int ), (int)858) + js.jjfn("jlrq", jjfp(int ), (int)859) * (float)Math.pow(var26_21, (double)js.jjfn("jlrr", jjsd(int ), (int)134));
                }
                var28_23 = v1 * var13_12 * var18_16 * this.appearance;
                if (var32_7 || var32_7) ** GOTO lbl6
                if (var27_22 == false) break block162;
                if (var32_7) ** GOTO lbl6
                v2 = js.jjfn("jlrs", jjfp(int ), (int)860);
                if (var34_5) {
                    throw null;
                }
                ** GOTO lbl81
            }
            if (var32_7) ** GOTO lbl6
            if (var33_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var33_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var32_7) ** GOTO lbl6
                    v2 = js.jjfn("jlrt", jjfp(int ), (int)861) * (float)Math.pow(var26_21, (double)js.jjfn("jlru", jjsd(int ), (int)135));
lbl81:
                    // 2 sources

                    var29_24 = v2 * var14_13 * this.appearance;
                    if (var32_7 || var32_7) ** GOTO lbl6
                    lz.soul(var5_8 + var22_19, var7_9 + var24_20, var9_10 - var24_20, (float)var28_23, var3_3, (float)var29_24, (int)var19_17);
                    if (var32_7 || var32_7) ** GOTO lbl6
                    lz.soul(var5_8 - var22_19, var7_9 + var22_19, var9_10 - var24_20, (float)var28_23, var3_3, (float)var29_24, (int)(js.jjfn("jlrv", jjfk(int ), (int)862) + var19_17));
                    if (var32_7 || var32_7) ** GOTO lbl6
                    lz.soul(var5_8 - var22_19, var7_9 - var22_19, var9_10 + var24_20, (float)var28_23, var3_3, (float)var29_24, (int)(js.jjfn("jlrw", jjfk(int ), (int)863) + var19_17));
                    if (var32_7 || var32_7) ** GOTO lbl6
                    if (var27_22 == false) ** GOTO lbl101
                    if (var32_7 || var32_7) ** GOTO lbl6
                    var30_25 = js.jjfn("jlrx", jjfp(int ), (int)864) * var13_12 * var18_16 * this.appearance;
                    if (var32_7 || var32_7) ** GOTO lbl6
                    var31_26 = js.jjfn("jlry", jjfp(int ), (int)865) * var14_13 * this.appearance;
                    if (var32_7 || var32_7) ** GOTO lbl6
                    lz.soul(var5_8 + var22_19, var7_9 + var24_20, var9_10 - var24_20, (float)var30_25, var3_3, (float)var31_26, (int)js.jjfn("jlrz", jjfk(int ), (int)866));
                    if (var32_7 || var32_7) ** GOTO lbl6
                    lz.soul(var5_8 - var22_19, var7_9 + var22_19, var9_10 - var24_20, (float)var30_25, var3_3, (float)var31_26, (int)js.jjfn("jlsa", jjfk(int ), (int)867));
                    if (var32_7 || var32_7) ** GOTO lbl6
                    lz.soul(var5_8 - var22_19, var7_9 - var22_19, var9_10 + var24_20, (float)var30_25, var3_3, (float)var31_26, (int)js.jjfn("jlsb", jjfk(int ), (int)868));
                    if (var32_7) ** GOTO lbl6
lbl101:
                    // 2 sources

                    if (var32_7 || var32_7) ** GOTO lbl6
                    ++var19_17;
                    if (var32_7) ** GOTO lbl6
                    if (!var34_5) continue block83;
                    throw null;
                }
lbl106:
                // 1 sources

                if (var32_7 || var32_7) ** GOTO lbl6
                lz.end();
                if (!var32_7 && !var32_7) ** break;
                ** continue;
                return;
lbl111:
                // 2 sources

                case 0: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsc", jjfk(int ), (int)869);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl419
                }
                case 1: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsd", jjfk(int ), (int)870);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl452
                }
lbl121:
                // 2 sources

                case 2: {
                    var33_6 /* !! */  = (int)js.jjfn("jlse", jjfk(int ), (int)871);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
lbl126:
                // 2 sources

                case 3: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsf", jjfk(int ), (int)872);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
lbl131:
                // 2 sources

                case 4: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsg", jjfk(int ), (int)873);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl295
                }
lbl136:
                // 2 sources

                case 5: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsh", jjfk(int ), (int)874);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl448
                }
lbl141:
                // 2 sources

                case 6: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsi", jjfk(int ), (int)875);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl391
                }
lbl146:
                // 4 sources

                case 7: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsj", jjfk(int ), (int)876);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
lbl151:
                // 2 sources

                case 8: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsk", jjfk(int ), (int)877);
                    if (!var34_5) ** GOTO lbl146
                    throw null;
                }
                case 9: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsl", jjfk(int ), (int)878);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
                case 10: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsm", jjfk(int ), (int)879);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl377
                }
lbl165:
                // 2 sources

                case 11: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsn", jjfk(int ), (int)880);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
lbl170:
                // 3 sources

                case 12: {
                    var33_6 /* !! */  = (int)js.jjfn("jlso", jjfk(int ), (int)881);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl342
                }
lbl175:
                // 2 sources

                case 13: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsp", jjfk(int ), (int)882);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
                case 14: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsq", jjfk(int ), (int)883);
                    if (!var34_5) ** GOTO lbl141
                    throw null;
                }
lbl184:
                // 2 sources

                case 15: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsr", jjfk(int ), (int)884);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl431
                }
                case 16: {
                    var33_6 /* !! */  = (int)js.jjfn("jlss", jjfk(int ), (int)885);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl291
                }
lbl194:
                // 2 sources

                case 17: {
                    var33_6 /* !! */  = (int)js.jjfn("jlst", jjfk(int ), (int)886);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl407
                }
                case 18: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var33_6 /* !! */  = (int)js.jjfn("jlsu", jjfk(int ), (int)887);
                        if (var34_5) {
                            throw null;
                        }
                        ** GOTO lbl342
                        break;
                    }
                }
lbl205:
                // 3 sources

                case 19: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsv", jjfk(int ), (int)888);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl215
                }
lbl210:
                // 2 sources

                case 20: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsw", jjfk(int ), (int)889);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
lbl215:
                // 3 sources

                case 21: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsx", jjfk(int ), (int)890);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
lbl220:
                // 2 sources

                case 22: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsy", jjfk(int ), (int)891);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl431
                }
                case 23: {
                    var33_6 /* !! */  = (int)js.jjfn("jlsz", jjfk(int ), (int)892);
                    if (!var34_5) ** GOTO lbl146
                    throw null;
                }
lbl229:
                // 2 sources

                case 24: {
                    var33_6 /* !! */  = (int)js.jjfn("jlta", jjfk(int ), (int)893);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl427
                }
                case 25: {
                    var33_6 /* !! */  = (int)js.jjfn("jltb", jjfk(int ), (int)894);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl295
                }
lbl239:
                // 2 sources

                case 26: {
                    var33_6 /* !! */  = (int)js.jjfn("jltc", jjfk(int ), (int)895);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl411
                }
                case 27: {
                    var33_6 /* !! */  = (int)js.jjfn("jltd", jjfk(int ), (int)896);
                    if (!var34_5) ** GOTO lbl220
                    throw null;
                }
lbl248:
                // 3 sources

                case 28: {
                    var33_6 /* !! */  = (int)js.jjfn("jlte", jjfk(int ), (int)897);
                    if (!var34_5) ** GOTO lbl170
                    throw null;
                }
lbl252:
                // 2 sources

                case 29: {
                    var33_6 /* !! */  = (int)js.jjfn("jltf", jjfk(int ), (int)898);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl419
                }
lbl257:
                // 2 sources

                case 30: {
                    var33_6 /* !! */  = (int)js.jjfn("jltg", jjfk(int ), (int)899);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl423
                }
lbl262:
                // 2 sources

                case 31: {
                    var33_6 /* !! */  = (int)js.jjfn("jlth", jjfk(int ), (int)900);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl395
                }
                case 32: {
                    var33_6 /* !! */  = (int)js.jjfn("jlti", jjfk(int ), (int)901);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl372
                }
                case 33: {
                    var33_6 /* !! */  = (int)js.jjfn("jltj", jjfk(int ), (int)902);
                    if (!var34_5) ** GOTO lbl194
                    throw null;
                }
                case 34: {
                    var33_6 /* !! */  = (int)js.jjfn("jltk", jjfk(int ), (int)903);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl295
                }
lbl281:
                // 3 sources

                case 35: {
                    var33_6 /* !! */  = (int)js.jjfn("jltl", jjfk(int ), (int)904);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl359
                }
lbl286:
                // 4 sources

                case 36: {
                    var33_6 /* !! */  = (int)js.jjfn("jltm", jjfk(int ), (int)905);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl355
                }
lbl291:
                // 2 sources

                case 37: {
                    var33_6 /* !! */  = (int)js.jjfn("jltn", jjfk(int ), (int)906);
                    if (!var34_5) ** GOTO lbl205
                    throw null;
                }
lbl295:
                // 5 sources

                case 38: {
                    var33_6 /* !! */  = (int)js.jjfn("jlto", jjfk(int ), (int)907);
                    if (!var34_5) ** GOTO lbl170
                    throw null;
                }
lbl299:
                // 4 sources

                case 39: {
                    var33_6 /* !! */  = (int)js.jjfn("jltp", jjfk(int ), (int)908);
                    if (!var34_5) ** GOTO lbl184
                    throw null;
                }
lbl303:
                // 2 sources

                case 40: {
                    var33_6 /* !! */  = (int)js.jjfn("jltq", jjfk(int ), (int)909);
                    if (!var34_5) ** GOTO lbl131
                    throw null;
                }
                case 41: {
                    var33_6 /* !! */  = (int)js.jjfn("jltr", jjfk(int ), (int)910);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl391
                }
                case 42: {
                    var33_6 /* !! */  = (int)js.jjfn("jlts", jjfk(int ), (int)911);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl329
                }
lbl317:
                // 3 sources

                case 43: {
                    var33_6 /* !! */  = (int)js.jjfn("jltt", jjfk(int ), (int)912);
                    if (!var34_5) ** GOTO lbl229
                    throw null;
                }
                case 44: {
                    var33_6 /* !! */  = (int)js.jjfn("jltu", jjfk(int ), (int)913);
                    if (!var34_5) ** GOTO lbl111
                    throw null;
                }
lbl325:
                // 2 sources

                case 45: {
                    var33_6 /* !! */  = (int)js.jjfn("jmie", jjfk(int ), (int)914);
                    if (!var34_5) ** GOTO lbl126
                    throw null;
                }
lbl329:
                // 2 sources

                case 46: {
                    var33_6 /* !! */  = (int)js.jjfn("jmif", jjfk(int ), (int)915);
                    if (!var34_5) ** GOTO lbl175
                    throw null;
                }
lbl333:
                // 4 sources

                case 47: {
                    var33_6 /* !! */  = (int)js.jjfn("jmig", jjfk(int ), (int)916);
                    if (!var34_5) ** GOTO lbl151
                    throw null;
                }
                case 48: {
                    var33_6 /* !! */  = (int)js.jjfn("jmih", jjfk(int ), (int)917);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl439
                }
lbl342:
                // 3 sources

                case 49: {
                    var33_6 /* !! */  = (int)js.jjfn("jmii", jjfk(int ), (int)918);
                    if (!var34_5) ** GOTO lbl295
                    throw null;
                }
                case 50: {
                    var33_6 /* !! */  = (int)js.jjfn("jmij", jjfk(int ), (int)919);
                    if (!var34_5) ** GOTO lbl262
                    throw null;
                }
                case 51: {
                    var33_6 /* !! */  = (int)js.jjfn("jmik", jjfk(int ), (int)920);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl382
                }
lbl355:
                // 2 sources

                case 52: {
                    var33_6 /* !! */  = (int)js.jjfn("jmil", jjfk(int ), (int)921);
                    if (!var34_5) ** GOTO lbl286
                    throw null;
                }
lbl359:
                // 2 sources

                case 53: {
                    var33_6 /* !! */  = (int)js.jjfn("jmim", jjfk(int ), (int)922);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl368
                }
                case 54: {
                    var33_6 /* !! */  = (int)js.jjfn("jmin", jjfk(int ), (int)923);
                    if (!var34_5) ** GOTO lbl281
                    throw null;
                }
lbl368:
                // 2 sources

                case 55: {
                    var33_6 /* !! */  = (int)js.jjfn("jmio", jjfk(int ), (int)924);
                    if (!var34_5) ** GOTO lbl303
                    throw null;
                }
lbl372:
                // 4 sources

                case 56: {
                    var33_6 /* !! */  = (int)js.jjfn("jmip", jjfk(int ), (int)925);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl387
                }
lbl377:
                // 2 sources

                case 57: {
                    var33_6 /* !! */  = (int)js.jjfn("jmiq", jjfk(int ), (int)926);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl439
                }
lbl382:
                // 3 sources

                case 58: {
                    var33_6 /* !! */  = (int)js.jjfn("jmir", jjfk(int ), (int)927);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl419
                }
lbl387:
                // 2 sources

                case 59: {
                    var33_6 /* !! */  = (int)js.jjfn("jmis", jjfk(int ), (int)928);
                    if (!var34_5) ** GOTO lbl121
                    throw null;
                }
lbl391:
                // 3 sources

                case 60: {
                    var33_6 /* !! */  = (int)js.jjfn("jmit", jjfk(int ), (int)929);
                    if (!var34_5) ** GOTO lbl205
                    throw null;
                }
lbl395:
                // 2 sources

                case 61: {
                    var33_6 /* !! */  = (int)js.jjfn("jmiu", jjfk(int ), (int)930);
                    if (!var34_5) ** GOTO lbl299
                    throw null;
                }
                case 62: {
                    var33_6 /* !! */  = (int)js.jjfn("jmiv", jjfk(int ), (int)931);
                    if (!var34_5) ** GOTO lbl286
                    throw null;
                }
                case 63: {
                    var33_6 /* !! */  = (int)js.jjfn("jmiw", jjfk(int ), (int)932);
                    if (!var34_5) ** GOTO lbl299
                    throw null;
                }
lbl407:
                // 2 sources

                case 64: {
                    var33_6 /* !! */  = (int)js.jjfn("jmix", jjfk(int ), (int)933);
                    if (!var34_5) ** GOTO lbl372
                    throw null;
                }
lbl411:
                // 2 sources

                case 65: {
                    var33_6 /* !! */  = (int)js.jjfn("jmiy", jjfk(int ), (int)934);
                    if (!var34_5) ** GOTO lbl286
                    throw null;
                }
                case 66: {
                    var33_6 /* !! */  = (int)js.jjfn("jmiz", jjfk(int ), (int)935);
                    if (!var34_5) ** GOTO lbl299
                    throw null;
                }
lbl419:
                // 4 sources

                case 67: {
                    var33_6 /* !! */  = (int)js.jjfn("jmja", jjfk(int ), (int)936);
                    if (!var34_5) ** GOTO lbl372
                    throw null;
                }
lbl423:
                // 2 sources

                case 68: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjb", jjfk(int ), (int)937);
                    if (!var34_5) ** GOTO lbl317
                    throw null;
                }
lbl427:
                // 2 sources

                case 69: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjc", jjfk(int ), (int)938);
                    if (!var34_5) ** GOTO lbl325
                    throw null;
                }
lbl431:
                // 3 sources

                case 70: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjd", jjfk(int ), (int)939);
                    if (!var34_5) ** GOTO lbl239
                    throw null;
                }
                case 71: {
                    var33_6 /* !! */  = (int)js.jjfn("jmje", jjfk(int ), (int)940);
                    if (!var34_5) ** GOTO lbl333
                    throw null;
                }
lbl439:
                // 3 sources

                case 72: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjf", jjfk(int ), (int)941);
                    if (var34_5) {
                        throw null;
                    }
                    ** GOTO lbl464
                }
                case 73: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjg", jjfk(int ), (int)942);
                    if (!var34_5) ** GOTO lbl382
                    throw null;
                }
lbl448:
                // 2 sources

                case 74: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjh", jjfk(int ), (int)943);
                    if (!var34_5) ** GOTO lbl317
                    throw null;
                }
lbl452:
                // 2 sources

                case 75: {
                    var33_6 /* !! */  = (int)js.jjfn("jmji", jjfk(int ), (int)944);
                    if (!var34_5) ** GOTO lbl136
                    throw null;
                }
                case 76: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjj", jjfk(int ), (int)945);
                    if (!var34_5) ** GOTO lbl165
                    throw null;
                }
                case 77: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjk", jjfk(int ), (int)946);
                    if (!var34_5) ** GOTO lbl146
                    throw null;
                }
lbl464:
                // 2 sources

                case 78: {
                    var33_6 /* !! */  = (int)js.jjfn("jmjl", jjfk(int ), (int)947);
                    if (!var34_5) ** GOTO lbl215
                    throw null;
                }
                case 79: 
            }
            break;
        }
        var33_6 /* !! */  = (int)js.jjfn("jmjm", jjfk(int ), (int)948);
        ** while (!var34_5)
lbl471:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmzb() {
        js.jjfm[200] = -1180953531;
        js.jjfm[201] = 1284826392;
        js.jjfm[202] = -690264327;
        js.jjfm[203] = 304603210;
        js.jjfm[204] = 1550929252;
        js.jjfm[205] = 1972229564;
        js.jjfm[206] = 986259830;
        js.jjfm[207] = 459875644;
        js.jjfm[208] = -292977077;
        js.jjfm[209] = 1465893366;
        js.jjfm[210] = -16028230;
        js.jjfm[211] = 606627611;
        js.jjfm[212] = 2023677250;
        js.jjfm[213] = -1215336756;
        js.jjfm[214] = -1341326401;
        js.jjfm[215] = -1136378728;
        js.jjfm[216] = 343200664;
        js.jjfm[217] = 2089746978;
        js.jjfm[218] = -1916239562;
        js.jjfm[219] = 515414944;
        js.jjfm[220] = 45239310;
        js.jjfm[221] = 307047247;
        js.jjfm[222] = -1147012986;
        js.jjfm[223] = 1332495894;
        js.jjfm[224] = 955419508;
        js.jjfm[225] = -46808851;
        js.jjfm[226] = -1125757933;
        js.jjfm[227] = -1407463998;
        js.jjfm[228] = 2018713492;
        js.jjfm[229] = -2076317712;
        js.jjfm[230] = 629404099;
        js.jjfm[231] = -597924984;
        js.jjfm[232] = 549376079;
        js.jjfm[233] = -2120017927;
        js.jjfm[234] = 1632049211;
        js.jjfm[235] = 838604223;
        js.jjfm[236] = -1191350302;
        js.jjfm[237] = 1315209024;
        js.jjfm[238] = -527959177;
        js.jjfm[239] = -1371012971;
        js.jjfm[240] = -1830354920;
        js.jjfm[241] = -1063027049;
        js.jjfm[242] = -1938064019;
        js.jjfm[243] = -1565654005;
        js.jjfm[244] = 991021302;
        js.jjfm[245] = -721759566;
        js.jjfm[246] = 1258842207;
        js.jjfm[247] = 1764306384;
        js.jjfm[248] = 1407372599;
        js.jjfm[249] = 1473475677;
        js.jjfm[250] = -95838528;
        js.jjfm[251] = -109904262;
        js.jjfm[252] = -1108938064;
        js.jjfm[253] = -2144833301;
        js.jjfm[254] = -1926413286;
        js.jjfm[255] = -2118866280;
        js.jjfm[256] = 842248153;
        js.jjfm[257] = -196779158;
        js.jjfm[258] = 90378289;
        js.jjfm[259] = -857548541;
        js.jjfm[260] = -1847161461;
        js.jjfm[261] = -900281065;
        js.jjfm[262] = -2093338519;
        js.jjfm[263] = -588877191;
        js.jjfm[264] = -395017973;
        js.jjfm[265] = 1120076052;
        js.jjfm[266] = -483304604;
        js.jjfm[267] = -976595349;
        js.jjfm[268] = 1510367814;
        js.jjfm[269] = 1450809176;
        js.jjfm[270] = 1208089327;
        js.jjfm[271] = -766572267;
        js.jjfm[272] = 925893214;
        js.jjfm[273] = -741172506;
        js.jjfm[274] = -1726377954;
        js.jjfm[275] = -155013425;
        js.jjfm[276] = 2015602277;
        js.jjfm[277] = 947251009;
        js.jjfm[278] = -419252812;
        js.jjfm[279] = 22440222;
        js.jjfm[280] = -210672439;
        js.jjfm[281] = 39073371;
        js.jjfm[282] = -809738330;
        js.jjfm[283] = -388779729;
        js.jjfm[284] = -859314445;
        js.jjfm[285] = 919022243;
        js.jjfm[286] = 1627659539;
        js.jjfm[287] = -1080891404;
        js.jjfm[288] = -681090665;
        js.jjfm[289] = -1549668690;
        js.jjfm[290] = 874335454;
        js.jjfm[291] = -1036028543;
        js.jjfm[292] = -942122089;
        js.jjfm[293] = -1496460991;
        js.jjfm[294] = 266757970;
        js.jjfm[295] = 747395514;
        js.jjfm[296] = 2088487105;
        js.jjfm[297] = 1636139823;
        js.jjfm[298] = -362222234;
        js.jjfm[299] = -1235181907;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderFloatingGhosts(class_1309 var1_1, class_243 var2_2, int var3_3, float var4_4) {
        block230: {
            var31_5 = js.c;
            var30_6 /* !! */  = js.b;
            var29_7 = js.a;
            if (var31_5) {
                throw null;
lbl6:
                // 62 sources

                return;
            }
            if (var29_7 || var29_7) ** GOTO lbl6
            if (this.floatingGhostTargetId == var1_1.method_5628()) break block230;
            if (var29_7 || var29_7) ** GOTO lbl6
            this.resetFloatingGhosts();
            if (var29_7 || var29_7) ** GOTO lbl6
            this.floatingGhostTargetId = var1_1.method_5628();
            if (var29_7) ** GOTO lbl6
        }
        if (var29_7 || var29_7) ** GOTO lbl6
        var5_8 = Math.max((int)js.jjfn("jlkb", jjfk(int ), (int)685), Math.round((float)(js.jjfn("jlkc", jjfp(int ), (int)686) * this.ghostLength.getValue())));
        if (var29_7 || var29_7) ** GOTO lbl6
        var6_9 = var2_2.field_1352;
        if (var29_7 || var29_7) ** GOTO lbl6
        var8_10 = var2_2.field_1351 + (double)var1_1.method_17682() / js.jjfn("jlkd", jjsd(int ), (int)111);
        if (var29_7 || var29_7) ** GOTO lbl6
        var10_11 = var2_2.field_1350;
        if (var29_7 || var29_7) ** GOTO lbl6
        var12_12 = Math.max((double)js.jjfn("jlke", jjsd(int ), (int)112), Math.max((double)var1_1.method_17681(), (double)var1_1.method_17682() * js.jjfn("jlkf", jjsd(int ), (int)113)) * js.jjfn("jlkg", jjsd(int ), (int)114)) * (double)this.ghostWidth.getValue();
        if (var29_7 || var29_7) ** GOTO lbl6
        this.floatingGhostPhase += (double)var4_4 * js.jjfn("jlkh", jjsd(int ), (int)115) * (double)this.soulSpeed.getValue();
        if (var29_7 || var29_7) ** GOTO lbl6
        var14_13 = Math.sin(this.floatingGhostPhase) * var12_12;
        if (var29_7 || var29_7) ** GOTO lbl6
        var16_14 = Math.cos(this.floatingGhostPhase) * var12_12;
        if (var29_7 || var29_7) ** GOTO lbl6
        lz.begin((boolean)js.jjfn("jlki", jjfk(int ), (int)687));
        if (var29_7 || var29_7) ** GOTO lbl6
        var18_15 = js.jjfn("jlkj", jjfk(int ), (int)688);
        if (var29_7) ** GOTO lbl6
        block124: while (true) {
            block234: {
                block233: {
                    block232: {
                        block229: {
                            block231: {
                                if (var29_7 || var29_7) ** GOTO lbl6
                                if (var18_15 >= js.jjfn("jlkk", jjfk(int ), (int)689)) ** GOTO lbl158
                                if (var29_7 || var29_7) ** GOTO lbl6
                                switch (var18_15) {
                                    case 0: {
                                        if (var29_7 || var29_7) ** GOTO lbl6
                                        v0 = new class_243(var6_9 + var14_13, var8_10 + var16_14, var10_11 - var16_14);
                                        if (!var31_5) break;
                                        throw null;
                                    }
                                    case 1: {
                                        if (var29_7 || var29_7) ** GOTO lbl6
                                        v0 = new class_243(var6_9 - var14_13, var8_10 + var14_13, var10_11 - var16_14);
                                        if (!var31_5) break;
                                        throw null;
                                    }
                                    default: {
                                        if (var29_7 || var29_7) ** GOTO lbl6
                                        v0 = var19_16 = new class_243(var6_9 - var14_13, var8_10 - var14_13, var10_11 + var16_14);
                                    }
                                }
                                if (var29_7 || var29_7) ** GOTO lbl6
                                this.floatingGhostPosition[var18_15] = var19_16;
                                if (var29_7 || var29_7) ** GOTO lbl6
                                var20_17 = this.floatingGhostTrails[var18_15];
                                if (var29_7 || var29_7) ** GOTO lbl6
                                if (var20_17.isEmpty()) break block231;
                                if (var29_7) ** GOTO lbl6
                                if (!(((class_243)var20_17.getFirst()).method_1022(var19_16) > js.jjfn("jlkl", jjsd(int ), (int)116))) break block229;
                                if (var29_7) ** GOTO lbl6
                            }
                            if (var29_7 || var29_7) ** GOTO lbl6
                            var20_17.addFirst(var19_16);
                            if (var29_7) ** GOTO lbl6
                            do {
                                if (var29_7 || var29_7) ** GOTO lbl6
                                if (var20_17.size() <= var5_8) break block229;
                                if (var29_7 || var29_7) ** GOTO lbl6
                                var20_17.removeLast();
                                if (var29_7) ** GOTO lbl6
                            } while (!var31_5);
                            throw null;
                        }
                        if (var29_7 || var29_7) ** GOTO lbl6
                        if (var18_15 != false) break block232;
                        if (var29_7) ** GOTO lbl6
                        v1 = var3_3;
                        if (var31_5) {
                            throw null;
                        }
                        break block233;
                    }
                    if (var29_7 || var29_7) ** GOTO lbl6
                    v1 = var21_18 = nd.getClientColorAt((float)var18_15 / 2.0f);
                }
                if (var29_7 || var29_7) ** GOTO lbl6
                if (var18_15 <= 0) break block234;
                if (var29_7) ** GOTO lbl6
                if (!this.reddenOnHit.isValue()) break block234;
                if (var29_7 || var29_7) ** GOTO lbl6
                var21_18 = js.hurtColor(var21_18, this.hurtAnimation);
                if (var29_7) ** GOTO lbl6
            }
            if (var29_7 || var29_7) ** GOTO lbl6
            var22_19 = nd.interpolateColor(var21_18, nd.rgba((int)js.jjfn("jlkm", jjfk(int ), (int)690), (int)js.jjfn("jlkn", jjfk(int ), (int)691), (int)js.jjfn("jlko", jjfk(int ), (int)692), (int)js.jjfn("jlkp", jjfk(int ), (int)693)), (float)js.jjfn("jlkq", jjfp(int ), (int)694));
            if (var29_7 || var29_7) ** GOTO lbl6
            var23_20 = js.jjfn("jlkr", jjfk(int ), (int)695);
            if (var29_7) ** GOTO lbl6
            block126: while (true) {
                if (var29_7 || var29_7) ** GOTO lbl6
                if (var23_20 >= var20_17.size()) ** GOTO lbl153
                if (var29_7 || var29_7) ** GOTO lbl6
                var24_21 = 1.0f - (float)var23_20 / (float)var5_8;
                if (var29_7 || var29_7) ** GOTO lbl6
                if (var23_20 != false) ** GOTO lbl117
                if (var30_6 /* !! */  == 0) ** GOTO lbl-1000
                switch (var30_6 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var29_7) ** GOTO lbl6
                        v2 = js.jjfn("jlks", jjfk(int ), (int)696);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl119
                    }
lbl117:
                    // 1 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    v2 = var25_22 = js.jjfn("jlkt", jjfk(int ), (int)697);
lbl119:
                    // 2 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    if (var25_22 == false) ** GOTO lbl126
                    if (var29_7 || var29_7) ** GOTO lbl6
                    v3 = js.jjfn("jlku", jjfp(int ), (int)698);
                    if (var31_5) {
                        throw null;
                    }
                    ** GOTO lbl128
lbl126:
                    // 1 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    v3 = js.jjfn("jlkv", jjfp(int ), (int)699) + js.jjfn("jlkw", jjfp(int ), (int)700) * (float)Math.pow(var24_21, (double)js.jjfn("jlkx", jjsd(int ), (int)117));
lbl128:
                    // 2 sources

                    var26_23 = v3 * this.appearance;
                    if (var29_7 || var29_7) ** GOTO lbl6
                    if (var25_22 == false) ** GOTO lbl136
                    if (var29_7 || var29_7) ** GOTO lbl6
                    v4 = js.jjfn("jlky", jjfp(int ), (int)701);
                    if (var31_5) {
                        throw null;
                    }
                    ** GOTO lbl138
lbl136:
                    // 1 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    v4 = js.jjfn("jlkz", jjfp(int ), (int)702) * (float)Math.pow(var24_21, (double)js.jjfn("jlla", jjsd(int ), (int)118));
lbl138:
                    // 2 sources

                    var27_24 = v4 * this.appearance;
                    if (var29_7 || var29_7) ** GOTO lbl6
                    var28_25 = var20_17.get((int)var23_20);
                    if (var29_7 || var29_7) ** GOTO lbl6
                    lz.soul(var28_25.field_1352, var28_25.field_1351, var28_25.field_1350, (float)var26_23, var22_19, (float)var27_24, (int)(var18_15 * js.jjfn("jllb", jjfk(int ), (int)703) + var23_20));
                    if (var29_7 || var29_7) ** GOTO lbl6
                    if (var25_22 == false) ** GOTO lbl148
                    if (var29_7 || var29_7) ** GOTO lbl6
                    lz.soul(var28_25.field_1352, var28_25.field_1351, var28_25.field_1350, (float)(js.jjfn("jllc", jjfp(int ), (int)704) * this.appearance), var22_19, (float)(js.jjfn("jlld", jjfp(int ), (int)705) * this.appearance), (int)(js.jjfn("jlle", jjfk(int ), (int)706) + var18_15));
                    if (var29_7) ** GOTO lbl6
lbl148:
                    // 2 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    ++var23_20;
                    if (var29_7) ** GOTO lbl6
                    if (!var31_5) continue block126;
                    throw null;
lbl153:
                    // 1 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    ++var18_15;
                    if (var29_7) ** GOTO lbl6
                    if (!var31_5) continue block124;
                    throw null;
lbl158:
                    // 1 sources

                    if (var29_7 || var29_7) ** GOTO lbl6
                    lz.end();
                    if (!var29_7 && !var29_7) ** break;
                    ** continue;
                    return;
                    case 0: {
                        var30_6 /* !! */  = (int)js.jjfn("jllf", jjfk(int ), (int)707);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl642
                    }
                    case 1: {
                        var30_6 /* !! */  = (int)js.jjfn("jllg", jjfk(int ), (int)708);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl538
                    }
lbl173:
                    // 3 sources

                    case 2: {
                        var30_6 /* !! */  = (int)js.jjfn("jllh", jjfk(int ), (int)709);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl380
                    }
lbl178:
                    // 2 sources

                    case 3: {
                        var30_6 /* !! */  = (int)js.jjfn("jlli", jjfk(int ), (int)710);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl670
                    }
                    case 4: {
                        var30_6 /* !! */  = (int)js.jjfn("jllj", jjfk(int ), (int)711);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl241
                    }
lbl188:
                    // 2 sources

                    case 5: {
                        var30_6 /* !! */  = (int)js.jjfn("jllk", jjfk(int ), (int)712);
                        if (!var31_5) ** GOTO lbl173
                        throw null;
                    }
                    case 6: {
                        var30_6 /* !! */  = (int)js.jjfn("jlll", jjfk(int ), (int)713);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl357
                    }
lbl197:
                    // 3 sources

                    case 7: {
                        var30_6 /* !! */  = (int)js.jjfn("jllm", jjfk(int ), (int)714);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl483
                    }
                    case 8: {
                        var30_6 /* !! */  = (int)js.jjfn("jlln", jjfk(int ), (int)715);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl376
                    }
lbl207:
                    // 4 sources

                    case 9: {
                        var30_6 /* !! */  = (int)js.jjfn("jllo", jjfk(int ), (int)716);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl618
                    }
                    case 10: {
                        var30_6 /* !! */  = (int)js.jjfn("jllp", jjfk(int ), (int)717);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl434
                    }
                    case 11: {
                        var30_6 /* !! */  = (int)js.jjfn("jllq", jjfk(int ), (int)718);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl514
                    }
                    case 12: {
                        var30_6 /* !! */  = (int)js.jjfn("jllr", jjfk(int ), (int)719);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl337
                    }
                    case 13: {
                        var30_6 /* !! */  = (int)js.jjfn("jlls", jjfk(int ), (int)720);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl670
                    }
lbl232:
                    // 2 sources

                    case 14: {
                        var30_6 /* !! */  = (int)js.jjfn("jllt", jjfk(int ), (int)721);
                        if (!var31_5) ** GOTO lbl188
                        throw null;
                    }
lbl236:
                    // 3 sources

                    case 15: {
                        var30_6 /* !! */  = (int)js.jjfn("jllu", jjfk(int ), (int)722);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl576
                    }
lbl241:
                    // 4 sources

                    case 16: {
                        var30_6 /* !! */  = (int)js.jjfn("jllv", jjfk(int ), (int)723);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl622
                    }
lbl246:
                    // 2 sources

                    case 17: {
                        var30_6 /* !! */  = (int)js.jjfn("jllw", jjfk(int ), (int)724);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl342
                    }
                    case 18: {
                        do {
                            var30_6 /* !! */  = (int)js.jjfn("jllx", jjfk(int ), (int)725);
                        } while (!var31_5);
                        throw null;
                    }
                    case 19: {
                        var30_6 /* !! */  = (int)js.jjfn("jlly", jjfk(int ), (int)726);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl658
                    }
                    case 20: {
                        var30_6 /* !! */  = (int)js.jjfn("jllz", jjfk(int ), (int)727);
                        if (!var31_5) ** GOTO lbl178
                        throw null;
                    }
                    case 21: {
                        var30_6 /* !! */  = (int)js.jjfn("jlma", jjfk(int ), (int)728);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl304
                    }
lbl270:
                    // 2 sources

                    case 22: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmb", jjfk(int ), (int)729);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl642
                    }
lbl275:
                    // 2 sources

                    case 23: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmc", jjfk(int ), (int)730);
                        if (!var31_5) ** GOTO lbl197
                        throw null;
                    }
                    case 24: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var30_6 /* !! */  = (int)js.jjfn("jlmd", jjfk(int ), (int)731);
                            if (var31_5) {
                                throw null;
                            }
                            ** GOTO lbl558
                            break;
                        }
                    }
                    case 25: {
                        var30_6 /* !! */  = (int)js.jjfn("jlme", jjfk(int ), (int)732);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl425
                    }
lbl290:
                    // 4 sources

                    case 26: {
                        do {
                            var30_6 /* !! */  = (int)js.jjfn("jlmf", jjfk(int ), (int)733);
                        } while (!var31_5);
                        throw null;
                    }
lbl295:
                    // 2 sources

                    case 27: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmg", jjfk(int ), (int)734);
                        if (!var31_5) ** GOTO lbl241
                        throw null;
                    }
                    case 28: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmh", jjfk(int ), (int)735);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl429
                    }
lbl304:
                    // 2 sources

                    case 29: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmi", jjfk(int ), (int)736);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl654
                    }
lbl309:
                    // 2 sources

                    case 30: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmj", jjfk(int ), (int)737);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl398
                    }
lbl314:
                    // 2 sources

                    case 31: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmk", jjfk(int ), (int)738);
                        if (!var31_5) ** GOTO lbl270
                        throw null;
                    }
                    case 32: {
                        var30_6 /* !! */  = (int)js.jjfn("jlml", jjfk(int ), (int)739);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl385
                    }
                    case 33: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmm", jjfk(int ), (int)740);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl475
                    }
lbl328:
                    // 2 sources

                    case 34: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmn", jjfk(int ), (int)741);
                        if (!var31_5) ** GOTO lbl295
                        throw null;
                    }
                    case 35: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmo", jjfk(int ), (int)742);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl646
                    }
lbl337:
                    // 3 sources

                    case 36: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmp", jjfk(int ), (int)743);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl411
                    }
lbl342:
                    // 4 sources

                    case 37: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmq", jjfk(int ), (int)744);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl601
                    }
                    case 38: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmr", jjfk(int ), (int)745);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl642
                    }
lbl352:
                    // 3 sources

                    case 39: {
                        var30_6 /* !! */  = (int)js.jjfn("jlms", jjfk(int ), (int)746);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl634
                    }
lbl357:
                    // 2 sources

                    case 40: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmt", jjfk(int ), (int)747);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl658
                    }
lbl362:
                    // 4 sources

                    case 41: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmu", jjfk(int ), (int)748);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl614
                    }
                    case 42: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmv", jjfk(int ), (int)749);
                        if (!var31_5) ** GOTO lbl352
                        throw null;
                    }
lbl371:
                    // 3 sources

                    case 43: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmw", jjfk(int ), (int)750);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl567
                    }
lbl376:
                    // 2 sources

                    case 44: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmx", jjfk(int ), (int)751);
                        if (!var31_5) ** GOTO lbl362
                        throw null;
                    }
lbl380:
                    // 2 sources

                    case 45: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmy", jjfk(int ), (int)752);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl646
                    }
lbl385:
                    // 2 sources

                    case 46: {
                        var30_6 /* !! */  = (int)js.jjfn("jlmz", jjfk(int ), (int)753);
                        if (!var31_5) ** GOTO lbl328
                        throw null;
                    }
lbl389:
                    // 2 sources

                    case 47: {
                        var30_6 /* !! */  = (int)js.jjfn("jlna", jjfk(int ), (int)754);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl429
                    }
lbl394:
                    // 3 sources

                    case 48: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnb", jjfk(int ), (int)755);
                        if (!var31_5) ** GOTO lbl371
                        throw null;
                    }
lbl398:
                    // 4 sources

                    case 49: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnc", jjfk(int ), (int)756);
                        if (!var31_5) ** GOTO lbl389
                        throw null;
                    }
                    case 50: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnd", jjfk(int ), (int)757);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl630
                    }
                    case 51: {
                        var30_6 /* !! */  = (int)js.jjfn("jlne", jjfk(int ), (int)758);
                        if (!var31_5) ** GOTO lbl290
                        throw null;
                    }
lbl411:
                    // 3 sources

                    case 52: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnf", jjfk(int ), (int)759);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl622
                    }
lbl416:
                    // 4 sources

                    case 53: {
                        var30_6 /* !! */  = (int)js.jjfn("jlng", jjfk(int ), (int)760);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl475
                    }
                    case 54: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnh", jjfk(int ), (int)761);
                        if (!var31_5) ** GOTO lbl416
                        throw null;
                    }
lbl425:
                    // 2 sources

                    case 55: {
                        var30_6 /* !! */  = (int)js.jjfn("jlni", jjfk(int ), (int)762);
                        if (!var31_5) ** GOTO lbl275
                        throw null;
                    }
lbl429:
                    // 3 sources

                    case 56: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnj", jjfk(int ), (int)763);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl488
                    }
lbl434:
                    // 3 sources

                    case 57: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnk", jjfk(int ), (int)764);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl518
                    }
lbl439:
                    // 3 sources

                    case 58: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnl", jjfk(int ), (int)765);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl501
                    }
lbl444:
                    // 2 sources

                    case 59: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnm", jjfk(int ), (int)766);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl662
                    }
lbl449:
                    // 2 sources

                    case 60: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnn", jjfk(int ), (int)767);
                        if (!var31_5) ** GOTO lbl444
                        throw null;
                    }
lbl453:
                    // 2 sources

                    case 61: {
                        var30_6 /* !! */  = (int)js.jjfn("jlno", jjfk(int ), (int)768);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl492
                    }
                    case 62: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnp", jjfk(int ), (int)769);
                        if (!var31_5) ** GOTO lbl342
                        throw null;
                    }
lbl462:
                    // 2 sources

                    case 63: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnq", jjfk(int ), (int)770);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl554
                    }
                    case 64: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnr", jjfk(int ), (int)771);
                        if (!var31_5) ** GOTO lbl394
                        throw null;
                    }
                    case 65: {
                        var30_6 /* !! */  = (int)js.jjfn("jlns", jjfk(int ), (int)772);
                        if (!var31_5) ** GOTO lbl290
                        throw null;
                    }
lbl475:
                    // 4 sources

                    case 66: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnt", jjfk(int ), (int)773);
                        if (!var31_5) ** GOTO lbl236
                        throw null;
                    }
lbl479:
                    // 2 sources

                    case 67: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnu", jjfk(int ), (int)774);
                        if (!var31_5) ** GOTO lbl439
                        throw null;
                    }
lbl483:
                    // 3 sources

                    case 68: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnv", jjfk(int ), (int)775);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl642
                    }
lbl488:
                    // 4 sources

                    case 69: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnw", jjfk(int ), (int)776);
                        if (!var31_5) ** GOTO lbl197
                        throw null;
                    }
lbl492:
                    // 2 sources

                    case 70: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnx", jjfk(int ), (int)777);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl514
                    }
lbl497:
                    // 3 sources

                    case 71: {
                        var30_6 /* !! */  = (int)js.jjfn("jlny", jjfk(int ), (int)778);
                        if (!var31_5) ** GOTO lbl411
                        throw null;
                    }
lbl501:
                    // 3 sources

                    case 72: {
                        var30_6 /* !! */  = (int)js.jjfn("jlnz", jjfk(int ), (int)779);
                        if (!var31_5) ** GOTO lbl352
                        throw null;
                    }
                    case 73: {
                        var30_6 /* !! */  = (int)js.jjfn("jloa", jjfk(int ), (int)780);
                        if (!var31_5) ** GOTO lbl394
                        throw null;
                    }
                    case 74: {
                        var30_6 /* !! */  = (int)js.jjfn("jlob", jjfk(int ), (int)781);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl601
                    }
lbl514:
                    // 4 sources

                    case 75: {
                        var30_6 /* !! */  = (int)js.jjfn("jloc", jjfk(int ), (int)782);
                        if (!var31_5) ** GOTO lbl309
                        throw null;
                    }
lbl518:
                    // 2 sources

                    case 76: {
                        var30_6 /* !! */  = (int)js.jjfn("jlod", jjfk(int ), (int)783);
                        if (!var31_5) ** GOTO lbl488
                        throw null;
                    }
                    case 77: {
                        var30_6 /* !! */  = (int)js.jjfn("jloe", jjfk(int ), (int)784);
                        if (!var31_5) ** GOTO lbl416
                        throw null;
                    }
                    case 78: {
                        var30_6 /* !! */  = (int)js.jjfn("jlof", jjfk(int ), (int)785);
                        if (!var31_5) ** GOTO lbl246
                        throw null;
                    }
                    case 79: {
                        var30_6 /* !! */  = (int)js.jjfn("jlog", jjfk(int ), (int)786);
                        if (!var31_5) ** GOTO lbl483
                        throw null;
                    }
lbl534:
                    // 2 sources

                    case 80: {
                        var30_6 /* !! */  = (int)js.jjfn("jloh", jjfk(int ), (int)787);
                        if (!var31_5) ** GOTO lbl290
                        throw null;
                    }
lbl538:
                    // 2 sources

                    case 81: {
                        var30_6 /* !! */  = (int)js.jjfn("jloi", jjfk(int ), (int)788);
                        if (!var31_5) ** GOTO lbl207
                        throw null;
                    }
                    case 82: {
                        var30_6 /* !! */  = (int)js.jjfn("jloj", jjfk(int ), (int)789);
                        if (!var31_5) ** GOTO lbl337
                        throw null;
                    }
                    case 83: {
                        var30_6 /* !! */  = (int)js.jjfn("jlok", jjfk(int ), (int)790);
                        if (!var31_5) ** GOTO lbl479
                        throw null;
                    }
                    case 84: {
                        var30_6 /* !! */  = (int)js.jjfn("jlol", jjfk(int ), (int)791);
                        if (!var31_5) ** GOTO lbl371
                        throw null;
                    }
lbl554:
                    // 2 sources

                    case 85: {
                        var30_6 /* !! */  = (int)js.jjfn("jlom", jjfk(int ), (int)792);
                        if (!var31_5) ** GOTO lbl362
                        throw null;
                    }
lbl558:
                    // 2 sources

                    case 86: {
                        var30_6 /* !! */  = (int)js.jjfn("jlon", jjfk(int ), (int)793);
                        if (!var31_5) ** GOTO lbl232
                        throw null;
                    }
                    case 87: {
                        var30_6 /* !! */  = (int)js.jjfn("jloo", jjfk(int ), (int)794);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl618
                    }
lbl567:
                    // 2 sources

                    case 88: {
                        var30_6 /* !! */  = (int)js.jjfn("jlop", jjfk(int ), (int)795);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl646
                    }
                    case 89: {
                        var30_6 /* !! */  = (int)js.jjfn("jloq", jjfk(int ), (int)796);
                        if (!var31_5) ** GOTO lbl241
                        throw null;
                    }
lbl576:
                    // 2 sources

                    case 90: {
                        var30_6 /* !! */  = (int)js.jjfn("jlor", jjfk(int ), (int)797);
                        if (!var31_5) ** GOTO lbl173
                        throw null;
                    }
                    case 91: {
                        do {
                            var30_6 /* !! */  = (int)js.jjfn("jlos", jjfk(int ), (int)798);
                        } while (!var31_5);
                        throw null;
                    }
lbl585:
                    // 2 sources

                    case 92: {
                        var30_6 /* !! */  = (int)js.jjfn("jlot", jjfk(int ), (int)799);
                        if (!var31_5) ** GOTO lbl488
                        throw null;
                    }
                    case 93: {
                        var30_6 /* !! */  = (int)js.jjfn("jlou", jjfk(int ), (int)800);
                        if (!var31_5) ** GOTO lbl362
                        throw null;
                    }
                    case 94: {
                        var30_6 /* !! */  = (int)js.jjfn("jlov", jjfk(int ), (int)801);
                        if (!var31_5) ** GOTO lbl416
                        throw null;
                    }
                    case 95: {
                        var30_6 /* !! */  = (int)js.jjfn("jlow", jjfk(int ), (int)802);
                        if (!var31_5) ** GOTO lbl475
                        throw null;
                    }
lbl601:
                    // 3 sources

                    case 96: {
                        var30_6 /* !! */  = (int)js.jjfn("jlox", jjfk(int ), (int)803);
                        if (!var31_5) ** GOTO lbl534
                        throw null;
                    }
                    case 97: {
                        var30_6 /* !! */  = (int)js.jjfn("jloy", jjfk(int ), (int)804);
                        if (var31_5) {
                            throw null;
                        }
                        ** GOTO lbl614
                    }
                    case 98: {
                        var30_6 /* !! */  = (int)js.jjfn("jloz", jjfk(int ), (int)805);
                        if (!var31_5) ** GOTO lbl342
                        throw null;
                    }
lbl614:
                    // 3 sources

                    case 99: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpa", jjfk(int ), (int)806);
                        if (!var31_5) ** GOTO lbl501
                        throw null;
                    }
lbl618:
                    // 3 sources

                    case 100: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpb", jjfk(int ), (int)807);
                        if (!var31_5) ** GOTO lbl314
                        throw null;
                    }
lbl622:
                    // 3 sources

                    case 101: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpc", jjfk(int ), (int)808);
                        if (!var31_5) ** GOTO lbl236
                        throw null;
                    }
                    case 102: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpd", jjfk(int ), (int)809);
                        if (!var31_5) ** GOTO lbl497
                        throw null;
                    }
lbl630:
                    // 2 sources

                    case 103: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpe", jjfk(int ), (int)810);
                        if (!var31_5) ** GOTO lbl207
                        throw null;
                    }
lbl634:
                    // 2 sources

                    case 104: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpf", jjfk(int ), (int)811);
                        if (!var31_5) ** GOTO lbl207
                        throw null;
                    }
                    case 105: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpg", jjfk(int ), (int)812);
                        if (!var31_5) ** GOTO lbl453
                        throw null;
                    }
lbl642:
                    // 6 sources

                    case 106: {
                        var30_6 /* !! */  = (int)js.jjfn("jlph", jjfk(int ), (int)813);
                        if (!var31_5) ** GOTO lbl497
                        throw null;
                    }
lbl646:
                    // 4 sources

                    case 107: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpi", jjfk(int ), (int)814);
                        if (!var31_5) ** GOTO lbl398
                        throw null;
                    }
                    case 108: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpj", jjfk(int ), (int)815);
                        if (!var31_5) ** GOTO lbl585
                        throw null;
                    }
lbl654:
                    // 2 sources

                    case 109: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpk", jjfk(int ), (int)816);
                        if (!var31_5) ** GOTO lbl514
                        throw null;
                    }
lbl658:
                    // 3 sources

                    case 110: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpl", jjfk(int ), (int)817);
                        if (!var31_5) ** GOTO lbl462
                        throw null;
                    }
lbl662:
                    // 2 sources

                    case 111: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpm", jjfk(int ), (int)818);
                        if (!var31_5) ** GOTO lbl642
                        throw null;
                    }
                    case 112: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpn", jjfk(int ), (int)819);
                        if (!var31_5) ** GOTO lbl449
                        throw null;
                    }
lbl670:
                    // 3 sources

                    case 113: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpo", jjfk(int ), (int)820);
                        if (!var31_5) ** GOTO lbl439
                        throw null;
                    }
                    case 114: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpp", jjfk(int ), (int)821);
                        if (!var31_5) ** GOTO lbl398
                        throw null;
                    }
                    case 115: {
                        var30_6 /* !! */  = (int)js.jjfn("jlpq", jjfk(int ), (int)822);
                        if (!var31_5) ** GOTO lbl434
                        throw null;
                    }
                    case 116: 
                }
                break;
            }
            break;
        }
        var30_6 /* !! */  = (int)js.jjfn("jlpr", jjfk(int ), (int)823);
        ** while (!var31_5)
lbl685:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmyr() {
        js.jjfl[400] = 472689157;
        js.jjfl[401] = -33408105;
        js.jjfl[402] = 996591610;
        js.jjfl[403] = -1983513632;
        js.jjfl[404] = -2121035726;
        js.jjfl[405] = -1275778009;
        js.jjfl[406] = -2111615817;
        js.jjfl[407] = 308181685;
        js.jjfl[408] = -426652957;
        js.jjfl[409] = 2092412235;
        js.jjfl[410] = 848315343;
        js.jjfl[411] = 475435942;
        js.jjfl[412] = -1359638846;
        js.jjfl[413] = 767897517;
        js.jjfl[414] = -1955807641;
        js.jjfl[415] = -18388796;
        js.jjfl[416] = -480596526;
        js.jjfl[417] = 1134294759;
        js.jjfl[418] = 1499963985;
        js.jjfl[419] = -1184122878;
        js.jjfl[420] = 516252879;
        js.jjfl[421] = 500542213;
        js.jjfl[422] = -1696231245;
        js.jjfl[423] = -863257126;
        js.jjfl[424] = -127195090;
        js.jjfl[425] = 202109213;
        js.jjfl[426] = -265230305;
        js.jjfl[427] = 297211462;
        js.jjfl[428] = -833273614;
        js.jjfl[429] = -517305057;
        js.jjfl[430] = -42859828;
        js.jjfl[431] = 594108972;
        js.jjfl[432] = -1034569244;
        js.jjfl[433] = -596091035;
        js.jjfl[434] = 1604758888;
        js.jjfl[435] = -1352471230;
        js.jjfl[436] = 1796199799;
        js.jjfl[437] = -1415018230;
        js.jjfl[438] = 1531333691;
        js.jjfl[439] = -1609672765;
        js.jjfl[440] = -733100966;
        js.jjfl[441] = 1911766676;
        js.jjfl[442] = -2036110947;
        js.jjfl[443] = 1989990537;
        js.jjfl[444] = 1769559387;
        js.jjfl[445] = -820958840;
        js.jjfl[446] = -2048495233;
        js.jjfl[447] = 1957528554;
        js.jjfl[448] = 585469240;
        js.jjfl[449] = 1893500269;
        js.jjfl[450] = 100456788;
        js.jjfl[451] = -1636086788;
        js.jjfl[452] = -957540720;
        js.jjfl[453] = -1278780120;
        js.jjfl[454] = -1674504766;
        js.jjfl[455] = 1698190082;
        js.jjfl[456] = -463743156;
        js.jjfl[457] = 2064945858;
        js.jjfl[458] = -1400766136;
        js.jjfl[459] = 76704514;
        js.jjfl[460] = -472591220;
        js.jjfl[461] = 409320852;
        js.jjfl[462] = 823565275;
        js.jjfl[463] = 835043060;
        js.jjfl[464] = -516554068;
        js.jjfl[465] = -1394934803;
        js.jjfl[466] = -1953152700;
        js.jjfl[467] = -1822419166;
        js.jjfl[468] = 1309650663;
        js.jjfl[469] = -1205784820;
        js.jjfl[470] = 737394533;
        js.jjfl[471] = 405289441;
        js.jjfl[472] = 861772133;
        js.jjfl[473] = 245262110;
        js.jjfl[474] = 835187367;
        js.jjfl[475] = -20824397;
        js.jjfl[476] = 252442692;
        js.jjfl[477] = -1498195241;
        js.jjfl[478] = -2089370003;
        js.jjfl[479] = -1612517300;
        js.jjfl[480] = 296937736;
        js.jjfl[481] = 1090792813;
        js.jjfl[482] = -1810261157;
        js.jjfl[483] = -1888385321;
        js.jjfl[484] = -23650827;
        js.jjfl[485] = 2750944;
        js.jjfl[486] = 64032047;
        js.jjfl[487] = -1088923913;
        js.jjfl[488] = 1000780656;
        js.jjfl[489] = 1683081431;
        js.jjfl[490] = -524506226;
        js.jjfl[491] = 465191644;
        js.jjfl[492] = 353737274;
        js.jjfl[493] = -1771769164;
        js.jjfl[494] = -415783860;
        js.jjfl[495] = -531888323;
        js.jjfl[496] = -1196628123;
        js.jjfl[497] = 2007112588;
        js.jjfl[498] = 813879651;
        js.jjfl[499] = 418231917;
    }

    private static /* synthetic */ void jmzs() {
        js.jjhv[300] = -4486708986697504905L;
        js.jjhv[301] = 8611935664624516680L;
        js.jjhv[302] = -867451532463519434L;
        js.jjhv[303] = -6543705713959874926L;
        js.jjhv[304] = 8168584403047182349L;
        js.jjhv[305] = -4614883475969978839L;
        js.jjhv[306] = 7664047116003430738L;
        js.jjhv[307] = -1940370845448459628L;
        js.jjhv[308] = -980569289033843205L;
        js.jjhv[309] = 2713123001981419631L;
        js.jjhv[310] = 8173251806954928522L;
        js.jjhv[311] = -2751764812239564030L;
        js.jjhv[312] = -4730115063251459322L;
        js.jjhv[313] = -6680559571159776235L;
        js.jjhv[314] = -4582619001905881969L;
        js.jjhv[315] = 4015714894030642784L;
        js.jjhv[316] = -7249763647767246584L;
        js.jjhv[317] = 6154721630091932008L;
        js.jjhv[318] = -8472771802681848648L;
        js.jjhv[319] = 4249748106167426015L;
        js.jjhv[320] = -5147979078310551017L;
        js.jjhv[321] = 6344633599533615444L;
        js.jjhv[322] = 8139077970315798858L;
        js.jjhv[323] = -926892726491381240L;
        js.jjhv[324] = -6517666634222920811L;
        js.jjhv[325] = 1177709065191321662L;
        js.jjhv[326] = -3437820882186706047L;
        js.jjhv[327] = -9168630093098476107L;
        js.jjhv[328] = 7138398074704463070L;
        js.jjhv[329] = 8510289952944981328L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$3() {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block40: while (true) {
            v0 /* !! */  = (long)(js.jjfn("jmtx", jjht(int ), (int)270) - js.jjfn("jmtw", jjht(int ), (int)269));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1547783698: {
                    continue block40;
                }
                case 458795960: {
                    break block40;
                }
            }
            break;
        }
        var3_1 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmty", jjht(int ), (int)271)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == js.jjfn("jmtz", jjfk(int ), (int)1085)) break;
            v1 /* !! */  = (long)js.jjfn("jmua", jjfk(int ), (int)1086);
        }
        var2_2 /* !! */  = js.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmub", jjht(int ), (int)272)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == js.jjfn("jmuc", jjfk(int ), (int)1087)) break;
            v2 /* !! */  = (long)js.jjfn("jmud", jjfk(int ), (int)1088);
        }
        var1_3 = js.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl30:
                    // 5 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                v3 /* !! */  = js.rm;
                if (true) ** GOTO lbl37
                block44: while (true) {
                    v3 /* !! */  = (long)(v4 - js.jjfn("jmue", jjht(int ), (int)273));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -811332438: {
                            v4 = js.jjfn("jmuf", jjht(int ), (int)274);
                            continue block44;
                        }
                        case 425217119: {
                            v4 = js.jjfn("jmug", jjht(int ), (int)275);
                            continue block44;
                        }
                        case 458795960: {
                            break block44;
                        }
                    }
                    break;
                }
                v5 /* !! */  = js.rm;
                if (true) ** GOTO lbl50
                block45: while (true) {
                    v5 /* !! */  = (long)(v6 - js.jjfn("jmuh", jjht(int ), (int)276));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1571679380: {
                            v6 = js.jjfn("jmui", jjht(int ), (int)277);
                            continue block45;
                        }
                        case -1215166698: {
                            v6 = js.jjfn("jmuj", jjht(int ), (int)278);
                            continue block45;
                        }
                        case 458795960: {
                            break block45;
                        }
                        case 936587149: {
                            v6 = js.jjfn("jmuk", jjht(int ), (int)279);
                            continue block45;
                        }
                    }
                    break;
                }
                if (this.mode.isSelected("\u0414\u0443\u0448\u0438")) ** GOTO lbl88
                if (var1_3) ** GOTO lbl30
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmul", jjht(int ), (int)280)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == js.jjfn("jmum", jjfk(int ), (int)1089)) break;
                    v7 /* !! */  = (long)js.jjfn("jmun", jjfk(int ), (int)1090);
                }
                v8 /* !! */  = js.rm;
                if (true) ** GOTO lbl74
                block47: while (true) {
                    v8 /* !! */  = (long)(v9 - js.jjfn("jmuo", jjht(int ), (int)281));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1003094110: {
                            v9 = js.jjfn("jmup", jjht(int ), (int)282);
                            continue block47;
                        }
                        case 458795960: {
                            break block47;
                        }
                        case 864317028: {
                            v9 = js.jjfn("jmuq", jjht(int ), (int)283);
                            continue block47;
                        }
                        case 2135973081: {
                            v9 = js.jjfn("jmur", jjht(int ), (int)284);
                            continue block47;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438")) ** GOTO lbl93
                if (var1_3) ** GOTO lbl30
lbl88:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl30
                v10 = js.jjfn("jmus", jjfk(int ), (int)1091);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
lbl93:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v10 = js.jjfn("jmut", jjfk(int ), (int)1092);
lbl96:
                // 2 sources

                v11 /* !! */  = js.rm;
                if (true) ** GOTO lbl100
                block48: while (true) {
                    v11 /* !! */  = (long)(v12 - js.jjfn("jmuu", jjht(int ), (int)285));
lbl100:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2047708556: {
                            v12 = js.jjfn("jmuv", jjht(int ), (int)286);
                            continue block48;
                        }
                        case -548960459: {
                            v12 = js.jjfn("jmuw", jjht(int ), (int)287);
                            continue block48;
                        }
                        case -315218240: {
                            v12 = js.jjfn("jmux", jjht(int ), (int)288);
                            continue block48;
                        }
                        case 458795960: {
                            break block48;
                        }
                    }
                    break;
                }
                return (boolean)v10;
            }
lbl113:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmuy", jjfk(int ), (int)1093);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl118:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)js.jjfn("jmuz", jjfk(int ), (int)1094);
                } while (!var3_1);
                throw null;
            }
lbl123:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)js.jjfn("jmva", jjfk(int ), (int)1095);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 3: {
                var2_2 /* !! */  = (int)js.jjfn("jmvb", jjfk(int ), (int)1096);
                if (!var3_1) ** GOTO lbl123
                throw null;
            }
lbl132:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)js.jjfn("jmvc", jjfk(int ), (int)1097);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)js.jjfn("jmvd", jjfk(int ), (int)1098);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 6: {
                var2_2 /* !! */  = (int)js.jjfn("jmve", jjfk(int ), (int)1099);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 7: {
                var2_2 /* !! */  = (int)js.jjfn("jmvf", jjfk(int ), (int)1100);
                if (!var3_1) break;
                throw null;
            }
lbl150:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)js.jjfn("jmvg", jjfk(int ), (int)1101);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl154:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)js.jjfn("jmvh", jjfk(int ), (int)1102);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 10: 
        }
        do {
            var2_2 /* !! */  = (int)js.jjfn("jmvi", jjfk(int ), (int)1103);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void jmzc() {
        js.jjfm[300] = 1902945587;
        js.jjfm[301] = -18223799;
        js.jjfm[302] = -802980888;
        js.jjfm[303] = 1116539567;
        js.jjfm[304] = 473741810;
        js.jjfm[305] = 361109811;
        js.jjfm[306] = -1312417503;
        js.jjfm[307] = -163863802;
        js.jjfm[308] = -1478993612;
        js.jjfm[309] = -209519327;
        js.jjfm[310] = 1197638402;
        js.jjfm[311] = 599121741;
        js.jjfm[312] = 1961101923;
        js.jjfm[313] = -544589217;
        js.jjfm[314] = 1328797508;
        js.jjfm[315] = -756854556;
        js.jjfm[316] = -1795573623;
        js.jjfm[317] = -1118329908;
        js.jjfm[318] = 601319339;
        js.jjfm[319] = -1224100897;
        js.jjfm[320] = 899359285;
        js.jjfm[321] = 1168751090;
        js.jjfm[322] = 1469810317;
        js.jjfm[323] = 482908992;
        js.jjfm[324] = -385817691;
        js.jjfm[325] = -1699392425;
        js.jjfm[326] = -984606828;
        js.jjfm[327] = -509137815;
        js.jjfm[328] = -892502239;
        js.jjfm[329] = 907676690;
        js.jjfm[330] = 294185154;
        js.jjfm[331] = -1593991733;
        js.jjfm[332] = 1295910820;
        js.jjfm[333] = -2028323936;
        js.jjfm[334] = 129898421;
        js.jjfm[335] = -932483869;
        js.jjfm[336] = 2028491202;
        js.jjfm[337] = -1062033416;
        js.jjfm[338] = -759757012;
        js.jjfm[339] = -2086240409;
        js.jjfm[340] = 531680965;
        js.jjfm[341] = -1403312420;
        js.jjfm[342] = -76502839;
        js.jjfm[343] = 595502012;
        js.jjfm[344] = -509577704;
        js.jjfm[345] = -923085199;
        js.jjfm[346] = -1787289832;
        js.jjfm[347] = 1102324906;
        js.jjfm[348] = 2045075688;
        js.jjfm[349] = 1395636753;
        js.jjfm[350] = -2017526833;
        js.jjfm[351] = -772316078;
        js.jjfm[352] = 298777608;
        js.jjfm[353] = -441266080;
        js.jjfm[354] = 1971232343;
        js.jjfm[355] = 726839902;
        js.jjfm[356] = -381619180;
        js.jjfm[357] = 1537144477;
        js.jjfm[358] = 806647434;
        js.jjfm[359] = -341913222;
        js.jjfm[360] = 2116435929;
        js.jjfm[361] = 1139944762;
        js.jjfm[362] = -1726402626;
        js.jjfm[363] = -2044749825;
        js.jjfm[364] = -600582233;
        js.jjfm[365] = -567469492;
        js.jjfm[366] = -647524524;
        js.jjfm[367] = -1162634553;
        js.jjfm[368] = 716185710;
        js.jjfm[369] = 1135179166;
        js.jjfm[370] = -26394967;
        js.jjfm[371] = -682560959;
        js.jjfm[372] = 446973079;
        js.jjfm[373] = -61528833;
        js.jjfm[374] = 904287684;
        js.jjfm[375] = -1415390451;
        js.jjfm[376] = -672770314;
        js.jjfm[377] = -417369964;
        js.jjfm[378] = 1364545159;
        js.jjfm[379] = 781455303;
        js.jjfm[380] = -1100655465;
        js.jjfm[381] = -322099887;
        js.jjfm[382] = 1855716669;
        js.jjfm[383] = -971395781;
        js.jjfm[384] = 1768019746;
        js.jjfm[385] = -496073091;
        js.jjfm[386] = -1706335448;
        js.jjfm[387] = -1644980007;
        js.jjfm[388] = 1636785688;
        js.jjfm[389] = 403609513;
        js.jjfm[390] = -777559203;
        js.jjfm[391] = 1375034827;
        js.jjfm[392] = 992634971;
        js.jjfm[393] = 12095964;
        js.jjfm[394] = -1741266452;
        js.jjfm[395] = -1839773878;
        js.jjfm[396] = -2020072972;
        js.jjfm[397] = -1304233965;
        js.jjfm[398] = 1216950595;
        js.jjfm[399] = -1202828243;
    }

    private static /* synthetic */ void jmzo() {
        js.jjhu[300] = 7271885715863321187L;
        js.jjhu[301] = -3151577152981234249L;
        js.jjhu[302] = 3532125870913417189L;
        js.jjhu[303] = 244496699449628903L;
        js.jjhu[304] = -7370381458418297010L;
        js.jjhu[305] = -1177826855586359346L;
        js.jjhu[306] = 5940697671079445201L;
        js.jjhu[307] = -2433809119949870726L;
        js.jjhu[308] = 6168646428431645988L;
        js.jjhu[309] = -5422535667465193323L;
        js.jjhu[310] = -3577663921204087147L;
        js.jjhu[311] = -1605936562075782305L;
        js.jjhu[312] = 1780024837788939422L;
        js.jjhu[313] = -253711957031261985L;
        js.jjhu[314] = -759532842759515209L;
        js.jjhu[315] = -2424862719755984253L;
        js.jjhu[316] = 3949352806413186994L;
        js.jjhu[317] = 148835975092895384L;
        js.jjhu[318] = -2158868927910651545L;
        js.jjhu[319] = 2501523264580750403L;
        js.jjhu[320] = 8510996847441738041L;
        js.jjhu[321] = -8694205591705744991L;
        js.jjhu[322] = 5461919899284493081L;
        js.jjhu[323] = 6730705043070885790L;
        js.jjhu[324] = 4710313500077055430L;
        js.jjhu[325] = 183630768179767967L;
        js.jjhu[326] = -8553401468086958138L;
        js.jjhu[327] = 2559363215879978676L;
        js.jjhu[328] = -315604279548890968L;
        js.jjhu[329] = 3601847757962067943L;
    }

    public static /* synthetic */ CallSite jjfn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jmzk() {
        js.jjfm[1100] = 1812647428;
        js.jjfm[1101] = -1574947782;
        js.jjfm[1102] = -229589866;
        js.jjfm[1103] = -694405980;
        js.jjfm[1104] = -946408397;
        js.jjfm[1105] = -242379829;
        js.jjfm[1106] = 44886238;
        js.jjfm[1107] = -1412744550;
        js.jjfm[1108] = -358444691;
        js.jjfm[1109] = 215164418;
        js.jjfm[1110] = -1967925425;
        js.jjfm[1111] = 942032109;
        js.jjfm[1112] = -460156812;
        js.jjfm[1113] = 978532386;
        js.jjfm[1114] = -303870528;
        js.jjfm[1115] = 500895604;
        js.jjfm[1116] = -108815606;
        js.jjfm[1117] = 1140839759;
        js.jjfm[1118] = 662246267;
        js.jjfm[1119] = 1235568399;
        js.jjfm[1120] = 312813014;
        js.jjfm[1121] = -95443454;
        js.jjfm[1122] = -1581820125;
        js.jjfm[1123] = 2065394175;
        js.jjfm[1124] = 458911732;
        js.jjfm[1125] = 1381779729;
        js.jjfm[1126] = 1010623860;
        js.jjfm[1127] = 1390535838;
        js.jjfm[1128] = 2038002434;
        js.jjfm[1129] = -1802555880;
        js.jjfm[1130] = 782547315;
        js.jjfm[1131] = 924979339;
        js.jjfm[1132] = 1260183688;
        js.jjfm[1133] = -1232702609;
        js.jjfm[1134] = 1235751065;
        js.jjfm[1135] = -611589623;
        js.jjfm[1136] = -473208648;
        js.jjfm[1137] = 1165907727;
        js.jjfm[1138] = -1055296170;
        js.jjfm[1139] = 36858509;
        js.jjfm[1140] = 680226689;
        js.jjfm[1141] = 84905957;
        js.jjfm[1142] = -701480693;
        js.jjfm[1143] = 1450200140;
        js.jjfm[1144] = -1891919112;
    }

    private static /* synthetic */ void jmzl() {
        js.jjhu[0] = -2143952860092395437L;
        js.jjhu[1] = 905755863529368817L;
        js.jjhu[2] = 1148716625131628152L;
        js.jjhu[3] = 489579757603870419L;
        js.jjhu[4] = 1614440687148714266L;
        js.jjhu[5] = 993279937486019640L;
        js.jjhu[6] = -2035051509378896494L;
        js.jjhu[7] = -8124330426693340963L;
        js.jjhu[8] = 9027805309936276228L;
        js.jjhu[9] = 4737737145397944325L;
        js.jjhu[10] = -5155472496268158856L;
        js.jjhu[11] = 8590541678214139349L;
        js.jjhu[12] = -1246588090212948516L;
        js.jjhu[13] = 3932767300534770516L;
        js.jjhu[14] = 6732137565467894389L;
        js.jjhu[15] = -4564282672074816417L;
        js.jjhu[16] = -6210306974393045467L;
        js.jjhu[17] = 1991670264476632039L;
        js.jjhu[18] = 3148892516546041049L;
        js.jjhu[19] = 1686038729559002373L;
        js.jjhu[20] = -453578386668031982L;
        js.jjhu[21] = 5733038237673818684L;
        js.jjhu[22] = -8588029094437453775L;
        js.jjhu[23] = 4762208705515861139L;
        js.jjhu[24] = 479457534827242026L;
        js.jjhu[25] = 2360273805232270654L;
        js.jjhu[26] = -2907423954974297152L;
        js.jjhu[27] = -807381278115853412L;
        js.jjhu[28] = 2439551492340737167L;
        js.jjhu[29] = 5375152028214853163L;
        js.jjhu[30] = 8125042536055589251L;
        js.jjhu[31] = -8178202627928696606L;
        js.jjhu[32] = 9024864005266740166L;
        js.jjhu[33] = -8529666115876572208L;
        js.jjhu[34] = -3012513347678328782L;
        js.jjhu[35] = -1254775258822219925L;
        js.jjhu[36] = 6057156181486075278L;
        js.jjhu[37] = 9110050712512689508L;
        js.jjhu[38] = 7773775924530506996L;
        js.jjhu[39] = 2665587466317137922L;
        js.jjhu[40] = 1964012232777250552L;
        js.jjhu[41] = 887082687086049563L;
        js.jjhu[42] = 5456096880946974056L;
        js.jjhu[43] = 1263294468704799538L;
        js.jjhu[44] = 8221595604017959722L;
        js.jjhu[45] = -9098452078382575715L;
        js.jjhu[46] = 6288846131455378946L;
        js.jjhu[47] = -76127350901974826L;
        js.jjhu[48] = 9205923874890641332L;
        js.jjhu[49] = 3197070166915619914L;
        js.jjhu[50] = 3937252774084243261L;
        js.jjhu[51] = 8503456678671411899L;
        js.jjhu[52] = 3737871506094323261L;
        js.jjhu[53] = 6418168219515946292L;
        js.jjhu[54] = 3718251093880524573L;
        js.jjhu[55] = 3060874989810637928L;
        js.jjhu[56] = 8952031007326660424L;
        js.jjhu[57] = -6146040760601466928L;
        js.jjhu[58] = 2383923421394655547L;
        js.jjhu[59] = -4402877556967630189L;
        js.jjhu[60] = -3667688475889915555L;
        js.jjhu[61] = 5216709349123947701L;
        js.jjhu[62] = 8013899484047042146L;
        js.jjhu[63] = 7842900866752003616L;
        js.jjhu[64] = -4564741153977292194L;
        js.jjhu[65] = 6434650726044771670L;
        js.jjhu[66] = -5265467197001045277L;
        js.jjhu[67] = -8126464671287927638L;
        js.jjhu[68] = -7770266490994493190L;
        js.jjhu[69] = -532648158455833748L;
        js.jjhu[70] = 8348665110742426971L;
        js.jjhu[71] = 1042281967995550L;
        js.jjhu[72] = -8656535729231305058L;
        js.jjhu[73] = -1740824577749579733L;
        js.jjhu[74] = 3322234092052466453L;
        js.jjhu[75] = -2924873482629501978L;
        js.jjhu[76] = 9177840376459463961L;
        js.jjhu[77] = -6417549100828959046L;
        js.jjhu[78] = 1946656140715418944L;
        js.jjhu[79] = -6787248898553592120L;
        js.jjhu[80] = 4009493000787747771L;
        js.jjhu[81] = 4200601705828265787L;
        js.jjhu[82] = 5312959201484652743L;
        js.jjhu[83] = 7455062097204669430L;
        js.jjhu[84] = -5270025171802923981L;
        js.jjhu[85] = 4028976701250361790L;
        js.jjhu[86] = -6537750552372399010L;
        js.jjhu[87] = 562642022356387232L;
        js.jjhu[88] = -1854785635830625476L;
        js.jjhu[89] = 7955687097214566855L;
        js.jjhu[90] = -8293273478584691815L;
        js.jjhu[91] = -4393983894169139024L;
        js.jjhu[92] = 7164938584388190932L;
        js.jjhu[93] = -7881824522664547810L;
        js.jjhu[94] = 2987658808540457086L;
        js.jjhu[95] = -8813776410822666245L;
        js.jjhu[96] = -1181378042200901977L;
        js.jjhu[97] = -4348534582045039908L;
        js.jjhu[98] = -6338825031928728426L;
        js.jjhu[99] = 6969247786599091809L;
    }

    private static /* synthetic */ void jmzi() {
        js.jjfm[900] = -1482302037;
        js.jjfm[901] = 1138535509;
        js.jjfm[902] = 241317064;
        js.jjfm[903] = -476670398;
        js.jjfm[904] = -642476594;
        js.jjfm[905] = 1549821898;
        js.jjfm[906] = 63382502;
        js.jjfm[907] = 888787367;
        js.jjfm[908] = -1590141875;
        js.jjfm[909] = 393691408;
        js.jjfm[910] = -396235390;
        js.jjfm[911] = 2105205335;
        js.jjfm[912] = 1808452517;
        js.jjfm[913] = -436422822;
        js.jjfm[914] = 1746487280;
        js.jjfm[915] = -462916186;
        js.jjfm[916] = -821729423;
        js.jjfm[917] = -1885947588;
        js.jjfm[918] = 1178449259;
        js.jjfm[919] = 938128462;
        js.jjfm[920] = -520787956;
        js.jjfm[921] = -668421761;
        js.jjfm[922] = -662932903;
        js.jjfm[923] = 657706335;
        js.jjfm[924] = 1284381818;
        js.jjfm[925] = -290845384;
        js.jjfm[926] = -417561646;
        js.jjfm[927] = 1899609204;
        js.jjfm[928] = -289077624;
        js.jjfm[929] = -1130983657;
        js.jjfm[930] = 337619555;
        js.jjfm[931] = 747224871;
        js.jjfm[932] = 1175524657;
        js.jjfm[933] = 968885244;
        js.jjfm[934] = -1002881778;
        js.jjfm[935] = 551103942;
        js.jjfm[936] = -1783062206;
        js.jjfm[937] = -1532089137;
        js.jjfm[938] = -1289146219;
        js.jjfm[939] = 1694411590;
        js.jjfm[940] = -688910271;
        js.jjfm[941] = -1791823472;
        js.jjfm[942] = 1898565367;
        js.jjfm[943] = -12984201;
        js.jjfm[944] = 361054603;
        js.jjfm[945] = 1252405676;
        js.jjfm[946] = 1426252602;
        js.jjfm[947] = -2124466567;
        js.jjfm[948] = -1292752453;
        js.jjfm[949] = 435448245;
        js.jjfm[950] = 1925414603;
        js.jjfm[951] = -753854584;
        js.jjfm[952] = 1529161441;
        js.jjfm[953] = -1730580420;
        js.jjfm[954] = 1565427835;
        js.jjfm[955] = -326430077;
        js.jjfm[956] = 1749216101;
        js.jjfm[957] = -1210152797;
        js.jjfm[958] = -437444926;
        js.jjfm[959] = -85002584;
        js.jjfm[960] = 226351625;
        js.jjfm[961] = 1716740602;
        js.jjfm[962] = -138543324;
        js.jjfm[963] = -15150313;
        js.jjfm[964] = 638957564;
        js.jjfm[965] = 312659990;
        js.jjfm[966] = 1190897508;
        js.jjfm[967] = 1611160115;
        js.jjfm[968] = -692240573;
        js.jjfm[969] = 83137827;
        js.jjfm[970] = -1664922136;
        js.jjfm[971] = 85251227;
        js.jjfm[972] = -1818762028;
        js.jjfm[973] = -1737103005;
        js.jjfm[974] = -940477432;
        js.jjfm[975] = -1112241066;
        js.jjfm[976] = -2040701163;
        js.jjfm[977] = -737798235;
        js.jjfm[978] = 1948976351;
        js.jjfm[979] = 168629127;
        js.jjfm[980] = 163717695;
        js.jjfm[981] = 532430249;
        js.jjfm[982] = 1545604658;
        js.jjfm[983] = 1537942070;
        js.jjfm[984] = 983524877;
        js.jjfm[985] = 75394247;
        js.jjfm[986] = -403882449;
        js.jjfm[987] = -1453971551;
        js.jjfm[988] = 191076786;
        js.jjfm[989] = 1828418336;
        js.jjfm[990] = 223995707;
        js.jjfm[991] = 1554656890;
        js.jjfm[992] = 467725815;
        js.jjfm[993] = 1671457667;
        js.jjfm[994] = 1683168171;
        js.jjfm[995] = 1053822368;
        js.jjfm[996] = -221951288;
        js.jjfm[997] = 926356721;
        js.jjfm[998] = 937069176;
        js.jjfm[999] = -1492568950;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - js.jjfn("jmwu", jjht(int ), (int)303));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -196745806: {
                    v1 = js.jjfn("jmwv", jjht(int ), (int)304);
                    continue block20;
                }
                case 54101405: {
                    v1 = js.jjfn("jmww", jjht(int ), (int)305);
                    continue block20;
                }
                case 458795960: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = js.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmwx", jjht(int ), (int)306)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == js.jjfn("jmwy", jjfk(int ), (int)1127)) break;
            v2 /* !! */  = (long)js.jjfn("jmwz", jjfk(int ), (int)1128);
        }
        var2_2 /* !! */  = js.b;
        v3 /* !! */  = js.rm;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - js.jjfn("jmxa", jjht(int ), (int)307));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 458795960: {
                    break block22;
                }
                case 603020320: {
                    v4 = js.jjfn("jmxb", jjht(int ), (int)308);
                    continue block22;
                }
                case 1569923250: {
                    v4 = js.jjfn("jmxc", jjht(int ), (int)309);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = js.a;
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
                    if ((v5 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmxd", jjht(int ), (int)310)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == js.jjfn("jmxe", jjfk(int ), (int)1129)) break;
                    v5 /* !! */  = (long)js.jjfn("jmxf", jjfk(int ), (int)1130);
                }
                v6 /* !! */  = js.rm;
                if (true) ** GOTO lbl54
                block25: while (true) {
                    v6 /* !! */  = (long)(js.jjfn("jmxh", jjht(int ), (int)312) - js.jjfn("jmxg", jjht(int ), (int)311));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 436272876: {
                            continue block25;
                        }
                        case 458795960: {
                            break block25;
                        }
                    }
                    break;
                }
                v7 = this.mode.isSelected("Ghosts");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmxi", jjht(int ), (int)313)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == js.jjfn("jmxj", jjfk(int ), (int)1131)) break;
                    v8 /* !! */  = (long)js.jjfn("jmxk", jjfk(int ), (int)1132);
                }
                return v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmxl", jjfk(int ), (int)1133);
                if (!var3_1) break;
                throw null;
            }
lbl71:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)js.jjfn("jmxm", jjfk(int ), (int)1134);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)js.jjfn("jmxn", jjfk(int ), (int)1135);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)js.jjfn("jmxo", jjfk(int ), (int)1136);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void jmzp() {
        js.jjhv[0] = 447518264395402416L;
        js.jjhv[1] = -5982856705300703782L;
        js.jjhv[2] = 7017120853818066895L;
        js.jjhv[3] = -3042357902549973289L;
        js.jjhv[4] = 6888020204749218395L;
        js.jjhv[5] = -452745995288105585L;
        js.jjhv[6] = 4492442082085688733L;
        js.jjhv[7] = 3528889049341525265L;
        js.jjhv[8] = -8936470287859127386L;
        js.jjhv[9] = 5280702037856160740L;
        js.jjhv[10] = -2289936851490139181L;
        js.jjhv[11] = 8590541678214139349L;
        js.jjhv[12] = -1246588090212948516L;
        js.jjhv[13] = 3932767300534767852L;
        js.jjhv[14] = 6732137565467894389L;
        js.jjhv[15] = -3022785462099252633L;
        js.jjhv[16] = 3729937195877945517L;
        js.jjhv[17] = -4173358650049887936L;
        js.jjhv[18] = 8117864344841256363L;
        js.jjhv[19] = 1686038729559002373L;
        js.jjhv[20] = 6452453482168564687L;
        js.jjhv[21] = 5973659186634810414L;
        js.jjhv[22] = -8588029094437453775L;
        js.jjhv[23] = 6411795685847682648L;
        js.jjhv[24] = -8011756763091504974L;
        js.jjhv[25] = -5771161883113465399L;
        js.jjhv[26] = -7565570936744987712L;
        js.jjhv[27] = -5419067296543241316L;
        js.jjhv[28] = 7051237510768125071L;
        js.jjhv[29] = 8464621372591013419L;
        js.jjhv[30] = 3513356517628201347L;
        js.jjhv[31] = 5656855427353467106L;
        js.jjhv[32] = 4413177986839352262L;
        js.jjhv[33] = -3917980097449184304L;
        js.jjhv[34] = -7624199366105716686L;
        js.jjhv[35] = -3353452685176871061L;
        js.jjhv[36] = 7777531239141604750L;
        js.jjhv[37] = -4495323761773578908L;
        js.jjhv[38] = 3149669822755761396L;
        js.jjhv[39] = 1947263325751543810L;
        js.jjhv[40] = 1964012232777245064L;
        js.jjhv[41] = 3724350452329462043L;
        js.jjhv[42] = 851588474425707880L;
        js.jjhv[43] = 3338010545881739731L;
        js.jjhv[44] = 5620105041617696076L;
        js.jjhv[45] = -9098452078382576635L;
        js.jjhv[46] = 1664071526610945538L;
        js.jjhv[47] = -4718230259000157994L;
        js.jjhv[48] = 4609437505205628852L;
        js.jjhv[49] = 7799221220506934346L;
        js.jjhv[50] = 8557347857440862013L;
        js.jjhv[51] = 5308135003827411729L;
        js.jjhv[52] = 874886078672089491L;
        js.jjhv[53] = 7417967336792196404L;
        js.jjhv[54] = 898997727146594077L;
        js.jjhv[55] = -7671202922213254040L;
        js.jjhv[56] = 4889962595198539756L;
        js.jjhv[57] = -7680229267942000280L;
        js.jjhv[58] = 2208046112131909847L;
        js.jjhv[59] = -203947992793578453L;
        js.jjhv[60] = -936796304044062903L;
        js.jjhv[61] = 8623199020987769357L;
        js.jjhv[62] = 5828455683571815329L;
        js.jjhv[63] = 5989239197918209978L;
        js.jjhv[64] = -52359670578243219L;
        js.jjhv[65] = -1820447390925347498L;
        js.jjhv[66] = -8573961861959938939L;
        js.jjhv[67] = -5704991604097667175L;
        js.jjhv[68] = -6062613688323028023L;
        js.jjhv[69] = -4077046708616980575L;
        js.jjhv[70] = 3730470691405547587L;
        js.jjhv[71] = 4603027016575387665L;
        js.jjhv[72] = -4047346947794351226L;
        js.jjhv[73] = -2882211985006239967L;
        js.jjhv[74] = 1284488892525007503L;
        js.jjhv[75] = -1667174503794319835L;
        js.jjhv[76] = 4676104710771374072L;
        js.jjhv[77] = -7400917909467159461L;
        js.jjhv[78] = 6560276299622434904L;
        js.jjhv[79] = -8013332951782127135L;
        js.jjhv[80] = 7228333168737071433L;
        js.jjhv[81] = 1475435520003702248L;
        js.jjhv[82] = 6249440951023012181L;
        js.jjhv[83] = -6733414241042353071L;
        js.jjhv[84] = 7700203994158830787L;
        js.jjhv[85] = 8974905492403823782L;
        js.jjhv[86] = -4694603353496409468L;
        js.jjhv[87] = 4062036878261972096L;
        js.jjhv[88] = 2124725100374750883L;
        js.jjhv[89] = 9078566278134880442L;
        js.jjhv[90] = -3683839259970989159L;
        js.jjhv[91] = -9005669912596526928L;
        js.jjhv[92] = -3715803078764903577L;
        js.jjhv[93] = 2537372430010066641L;
        js.jjhv[94] = -5290723325319258972L;
        js.jjhv[95] = 6539592085813778717L;
        js.jjhv[96] = -3439400172955026071L;
        js.jjhv[97] = 6742345417062506185L;
        js.jjhv[98] = 1684275182458130735L;
        js.jjhv[99] = -835430559997255798L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$9() {
        v0 /* !! */  = js.rm;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(js.jjfn("jmno", jjht(int ), (int)189) - js.jjfn("jmnn", jjht(int ), (int)188));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 219088605: {
                    continue block15;
                }
                case 458795960: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = js.c;
        v1 /* !! */  = js.rm;
        if (true) ** GOTO lbl15
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - js.jjfn("jmnp", jjht(int ), (int)190));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -814264059: {
                    v2 = js.jjfn("jmnq", jjht(int ), (int)191);
                    continue block16;
                }
                case 138049617: {
                    v2 = js.jjfn("jmnr", jjht(int ), (int)192);
                    continue block16;
                }
                case 458795960: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = js.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmns", jjht(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == js.jjfn("jmnt", jjfk(int ), (int)1001)) break;
            v3 /* !! */  = (long)js.jjfn("jmnu", jjfk(int ), (int)1002);
        }
        var1_3 = js.a;
        if (var3_1) {
            throw null;
lbl33:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl36:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmnv", jjht(int ), (int)194)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == js.jjfn("jmnw", jjfk(int ), (int)1003)) break;
                    v4 /* !! */  = (long)js.jjfn("jmnx", jjfk(int ), (int)1004);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmny", jjht(int ), (int)195)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == js.jjfn("jmnz", jjfk(int ), (int)1005)) break;
                    v5 /* !! */  = (long)js.jjfn("jmoa", jjfk(int ), (int)1006);
                }
                v6 = this.mode.isSelected("\u041a\u043e\u043b\u044c\u0446\u043e");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jmob", jjht(int ), (int)196)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == js.jjfn("jmoc", jjfk(int ), (int)1007)) break;
                    v7 /* !! */  = (long)js.jjfn("jmod", jjfk(int ), (int)1008);
                }
                return v6;
            }
lbl56:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmoe", jjfk(int ), (int)1009);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)js.jjfn("jmof", jjfk(int ), (int)1010);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)js.jjfn("jmog", jjfk(int ), (int)1011);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)js.jjfn("jmoh", jjfk(int ), (int)1012);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmyq() {
        js.jjfl[300] = 1280636127;
        js.jjfl[301] = -1020976764;
        js.jjfl[302] = -802980887;
        js.jjfl[303] = 1116539564;
        js.jjfl[304] = 473741811;
        js.jjfl[305] = 736583325;
        js.jjfl[306] = -1312417487;
        js.jjfl[307] = -163863807;
        js.jjfl[308] = -1478993646;
        js.jjfl[309] = -209519341;
        js.jjfl[310] = 1197638455;
        js.jjfl[311] = 599121775;
        js.jjfl[312] = 1961101944;
        js.jjfl[313] = -544589199;
        js.jjfl[314] = 1328797535;
        js.jjfl[315] = -756854585;
        js.jjfl[316] = -1795573604;
        js.jjfl[317] = -1118329858;
        js.jjfl[318] = 601319297;
        js.jjfl[319] = -1224100865;
        js.jjfl[320] = 899359285;
        js.jjfl[321] = 1168751100;
        js.jjfl[322] = 1469810305;
        js.jjfl[323] = 482909012;
        js.jjfl[324] = -385817669;
        js.jjfl[325] = -1699392427;
        js.jjfl[326] = -984606823;
        js.jjfl[327] = -509137854;
        js.jjfl[328] = -892502272;
        js.jjfl[329] = 907676688;
        js.jjfl[330] = 294185167;
        js.jjfl[331] = -1593991733;
        js.jjfl[332] = 1295910837;
        js.jjfl[333] = -2028323952;
        js.jjfl[334] = 129898416;
        js.jjfl[335] = -932483864;
        js.jjfl[336] = 2028491218;
        js.jjfl[337] = -1062033425;
        js.jjfl[338] = -759757018;
        js.jjfl[339] = -2086240428;
        js.jjfl[340] = 531681006;
        js.jjfl[341] = -1403312400;
        js.jjfl[342] = -76502802;
        js.jjfl[343] = 595502006;
        js.jjfl[344] = -509577678;
        js.jjfl[345] = -923085186;
        js.jjfl[346] = -1787289813;
        js.jjfl[347] = 1102324904;
        js.jjfl[348] = 2045075655;
        js.jjfl[349] = 1395636762;
        js.jjfl[350] = -2017526829;
        js.jjfl[351] = -772316070;
        js.jjfl[352] = 298777615;
        js.jjfl[353] = -441266092;
        js.jjfl[354] = 1971232331;
        js.jjfl[355] = 726839903;
        js.jjfl[356] = -381619145;
        js.jjfl[357] = 1537144494;
        js.jjfl[358] = 806647443;
        js.jjfl[359] = -341913255;
        js.jjfl[360] = 2116435946;
        js.jjfl[361] = 1139944761;
        js.jjfl[362] = -1726402658;
        js.jjfl[363] = 958371839;
        js.jjfl[364] = -1719117913;
        js.jjfl[365] = -526236059;
        js.jjfl[366] = -428608075;
        js.jjfl[367] = -2048757438;
        js.jjfl[368] = 363763772;
        js.jjfl[369] = 1135179167;
        js.jjfl[370] = -26394947;
        js.jjfl[371] = -682560942;
        js.jjfl[372] = 446973073;
        js.jjfl[373] = -61528842;
        js.jjfl[374] = 904287693;
        js.jjfl[375] = -1415390454;
        js.jjfl[376] = -672770308;
        js.jjfl[377] = -417369959;
        js.jjfl[378] = 1364545152;
        js.jjfl[379] = 781455316;
        js.jjfl[380] = -1100655483;
        js.jjfl[381] = -322099900;
        js.jjfl[382] = 1855716640;
        js.jjfl[383] = -971395777;
        js.jjfl[384] = 1768019771;
        js.jjfl[385] = -496073098;
        js.jjfl[386] = -1706335432;
        js.jjfl[387] = -1644980024;
        js.jjfl[388] = 1636785667;
        js.jjfl[389] = 403609528;
        js.jjfl[390] = -777559224;
        js.jjfl[391] = 1375034846;
        js.jjfl[392] = 992634956;
        js.jjfl[393] = 12095961;
        js.jjfl[394] = -1741266449;
        js.jjfl[395] = -1839773869;
        js.jjfl[396] = -2020072966;
        js.jjfl[397] = -1304233958;
        js.jjfl[398] = 1216950592;
        js.jjfl[399] = -1202828237;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderGhosts(class_1309 var1_1, class_243 var2_2, int var3_3, float var4_4) {
        var29_5 = js.c;
        var28_6 /* !! */  = js.b;
        var27_7 = js.a;
        if (var29_5) {
            throw null;
lbl6:
            // 29 sources

            return;
        }
        if (var27_7 || var27_7) ** GOTO lbl6
        var5_8 = var2_2.field_1352;
        if (var27_7 || var27_7) ** GOTO lbl6
        var7_9 = var2_2.field_1351 + (double)var1_1.method_17682() / js.jjfn("jlhh", jjsd(int ), (int)105);
        if (var27_7 || var27_7) ** GOTO lbl6
        var9_10 = var2_2.field_1350;
        if (var27_7 || var27_7) ** GOTO lbl6
        var11_11 = this.soulSize.getValue();
        if (var27_7 || var27_7) ** GOTO lbl6
        var12_12 = this.soulBright.getValue();
        if (var27_7 || var27_7) ** GOTO lbl6
        var13_13 = this.soulSpeed.getValue();
        if (var27_7 || var27_7) ** GOTO lbl6
        lz.begin((boolean)js.jjfn("jlhi", jjfk(int ), (int)619));
        if (var27_7 || var27_7) ** GOTO lbl6
        var14_14 = js.jjfn("jlhj", jjfk(int ), (int)620);
        if (var27_7) ** GOTO lbl6
        block58: while (true) {
            if (var27_7 || var27_7) ** GOTO lbl6
            if (var14_14 >= js.jjfn("jlhk", jjfk(int ), (int)621)) ** GOTO lbl89
            if (var27_7 || var27_7) ** GOTO lbl6
            var15_15 = class_3532.method_16436((double)this.hurtAnimation, (double)js.GHOST_BASE_SPEED[var14_14], (double)js.GHOST_HURT_SPEED[var14_14]);
            if (var27_7 || var27_7) ** GOTO lbl6
            v0 = var14_14;
            v1 = this.ghostPhase[v0];
            if (var14_14 == js.jjfn("jlhl", jjfk(int ), (int)622)) {
                v2 = -var15_15;
                if (var29_5) {
                    throw null;
                }
            } else {
                v2 = var15_15;
            }
            this.ghostPhase[v0] = v1 + v2 * (double)var4_4 * js.jjfn("jlhm", jjsd(int ), (int)106) * (double)var13_13;
            if (var27_7 || var27_7) ** GOTO lbl6
            var17_16 = js.jjfn("jlhn", jjfk(int ), (int)623);
            if (var27_7) ** GOTO lbl6
            block59: while (true) {
                if (var27_7 || var27_7) ** GOTO lbl6
                if (var17_16 >= js.jjfn("jlho", jjfk(int ), (int)624)) ** GOTO lbl84
                if (var27_7 || var27_7) ** GOTO lbl6
                var18_17 = 1.0f - (float)var17_16 / js.jjfn("jlhp", jjfp(int ), (int)625);
                if (var27_7 || var27_7) ** GOTO lbl6
                var19_18 = (js.jjfn("jlhq", jjfp(int ), (int)626) + js.jjfn("jlhr", jjfp(int ), (int)627) * var18_17) * var11_11 * this.appearance;
                if (var27_7 || var27_7) ** GOTO lbl6
                var20_19 = var18_17 * var12_12 * this.appearance;
                if (var27_7 || var27_7) ** GOTO lbl6
                v3 = this.ghostPhase[var14_14];
                v4 = (double)var17_16 * js.jjfn("jlhs", jjsd(int ), (int)107);
                if (var14_14 == js.jjfn("jlht", jjfk(int ), (int)628)) {
                    v5 = -var15_15;
                    if (var29_5) {
                        throw null;
                    }
                } else {
                    v5 = var15_15;
                }
                var21_20 = v3 - v4 * v5 / js.jjfn("jlhu", jjsd(int ), (int)108);
                if (var27_7 || var27_7) ** GOTO lbl6
                var23_21 = Math.sin(var21_20) * js.jjfn("jlhv", jjsd(int ), (int)109);
                if (var27_7 || var27_7) ** GOTO lbl6
                var25_22 = Math.cos(var21_20) * js.jjfn("jlhw", jjsd(int ), (int)110);
                if (var27_7 || var27_7) ** GOTO lbl6
                v6 = var5_8 + js.GHOST_X_SIGN[var14_14] * var23_21;
                if (js.GHOST_USE_X[var14_14]) {
                    v7 = var23_21 * js.GHOST_Y_CURVE[var14_14];
                    if (var29_5) {
                        throw null;
                    }
                } else {
                    v7 = var25_22 * js.GHOST_Y_CURVE[var14_14];
                }
                lz.soul(v6, var7_9 + v7 + js.GHOST_Y_BASE[var14_14], var9_10 + js.GHOST_Z_SIGN[var14_14] * var25_22, (float)var19_18, var3_3, var20_19, (int)(var14_14 * js.jjfn("jlhx", jjfk(int ), (int)629) + var17_16));
                if (var27_7) ** GOTO lbl6
                if (var28_6 /* !! */  == 0) ** GOTO lbl-1000
                switch (var28_6 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var27_7) ** GOTO lbl6
                        ++var17_16;
                        if (var27_7) ** GOTO lbl6
                        if (!var29_5) continue block59;
                        throw null;
                    }
lbl84:
                    // 1 sources

                    if (var27_7 || var27_7) ** GOTO lbl6
                    ++var14_14;
                    if (var27_7) ** GOTO lbl6
                    if (!var29_5) continue block58;
                    throw null;
lbl89:
                    // 1 sources

                    if (var27_7 || var27_7) ** GOTO lbl6
                    lz.end();
                    if (!var27_7 && !var27_7) ** break;
                    ** continue;
                    return;
lbl94:
                    // 3 sources

                    case 0: {
                        var28_6 /* !! */  = (int)js.jjfn("jlhy", jjfk(int ), (int)630);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl147
                    }
lbl99:
                    // 2 sources

                    case 1: {
                        var28_6 /* !! */  = (int)js.jjfn("jlhz", jjfk(int ), (int)631);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl195
                    }
lbl104:
                    // 2 sources

                    case 2: {
                        var28_6 /* !! */  = (int)js.jjfn("jlia", jjfk(int ), (int)632);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl289
                    }
                    case 3: {
                        var28_6 /* !! */  = (int)js.jjfn("jlib", jjfk(int ), (int)633);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl138
                    }
                    case 4: {
                        var28_6 /* !! */  = (int)js.jjfn("jlic", jjfk(int ), (int)634);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl234
                    }
lbl119:
                    // 3 sources

                    case 5: {
                        var28_6 /* !! */  = (int)js.jjfn("jlid", jjfk(int ), (int)635);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl238
                    }
lbl124:
                    // 3 sources

                    case 6: {
                        var28_6 /* !! */  = (int)js.jjfn("jlie", jjfk(int ), (int)636);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl226
                    }
lbl129:
                    // 2 sources

                    case 7: {
                        var28_6 /* !! */  = (int)js.jjfn("jlif", jjfk(int ), (int)637);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl255
                    }
                    case 8: {
                        var28_6 /* !! */  = (int)js.jjfn("jlig", jjfk(int ), (int)638);
                        if (!var29_5) ** GOTO lbl104
                        throw null;
                    }
lbl138:
                    // 2 sources

                    case 9: {
                        var28_6 /* !! */  = (int)js.jjfn("jlih", jjfk(int ), (int)639);
                        if (!var29_5) ** GOTO lbl99
                        throw null;
                    }
                    case 10: {
                        var28_6 /* !! */  = (int)js.jjfn("jlii", jjfk(int ), (int)640);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl268
                    }
lbl147:
                    // 4 sources

                    case 11: {
                        var28_6 /* !! */  = (int)js.jjfn("jlij", jjfk(int ), (int)641);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl289
                    }
                    case 12: {
                        var28_6 /* !! */  = (int)js.jjfn("jlik", jjfk(int ), (int)642);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl276
                    }
lbl157:
                    // 2 sources

                    case 13: {
                        var28_6 /* !! */  = (int)js.jjfn("jlil", jjfk(int ), (int)643);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl326
                    }
lbl162:
                    // 4 sources

                    case 14: {
                        var28_6 /* !! */  = (int)js.jjfn("jlim", jjfk(int ), (int)644);
                        if (!var29_5) ** GOTO lbl124
                        throw null;
                    }
                    case 15: {
                        var28_6 /* !! */  = (int)js.jjfn("jlin", jjfk(int ), (int)645);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl322
                    }
                    case 16: {
                        var28_6 /* !! */  = (int)js.jjfn("jlio", jjfk(int ), (int)646);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl302
                    }
                    case 17: {
                        var28_6 /* !! */  = (int)js.jjfn("jlip", jjfk(int ), (int)647);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl212
                    }
lbl181:
                    // 2 sources

                    case 18: {
                        var28_6 /* !! */  = (int)js.jjfn("jliq", jjfk(int ), (int)648);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl326
                    }
                    case 19: {
                        var28_6 /* !! */  = (int)js.jjfn("jlir", jjfk(int ), (int)649);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl268
                    }
lbl191:
                    // 2 sources

                    case 20: {
                        var28_6 /* !! */  = (int)js.jjfn("jlis", jjfk(int ), (int)650);
                        if (!var29_5) ** GOTO lbl124
                        throw null;
                    }
lbl195:
                    // 3 sources

                    case 21: {
                        var28_6 /* !! */  = (int)js.jjfn("jlit", jjfk(int ), (int)651);
                        if (!var29_5) break block58;
                        throw null;
                    }
lbl199:
                    // 2 sources

                    case 22: {
                        var28_6 /* !! */  = (int)js.jjfn("jliu", jjfk(int ), (int)652);
                        if (!var29_5) ** GOTO lbl147
                        throw null;
                    }
lbl203:
                    // 3 sources

                    case 23: {
                        var28_6 /* !! */  = (int)js.jjfn("jliv", jjfk(int ), (int)653);
                        if (!var29_5) ** GOTO lbl119
                        throw null;
                    }
                    case 24: {
                        var28_6 /* !! */  = (int)js.jjfn("jliw", jjfk(int ), (int)654);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl226
                    }
lbl212:
                    // 2 sources

                    case 25: {
                        var28_6 /* !! */  = (int)js.jjfn("jlix", jjfk(int ), (int)655);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl276
                    }
lbl217:
                    // 2 sources

                    case 26: {
                        var28_6 /* !! */  = (int)js.jjfn("jliy", jjfk(int ), (int)656);
                        if (!var29_5) ** GOTO lbl203
                        throw null;
                    }
lbl221:
                    // 3 sources

                    case 27: {
                        var28_6 /* !! */  = (int)js.jjfn("jliz", jjfk(int ), (int)657);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl293
                    }
lbl226:
                    // 3 sources

                    case 28: {
                        var28_6 /* !! */  = (int)js.jjfn("jlja", jjfk(int ), (int)658);
                        if (!var29_5) ** GOTO lbl147
                        throw null;
                    }
                    case 29: {
                        var28_6 /* !! */  = (int)js.jjfn("jljb", jjfk(int ), (int)659);
                        if (!var29_5) ** GOTO lbl221
                        throw null;
                    }
lbl234:
                    // 3 sources

                    case 30: {
                        var28_6 /* !! */  = (int)js.jjfn("jljc", jjfk(int ), (int)660);
                        if (!var29_5) ** GOTO lbl129
                        throw null;
                    }
lbl238:
                    // 3 sources

                    case 31: {
                        var28_6 /* !! */  = (int)js.jjfn("jljd", jjfk(int ), (int)661);
                        if (!var29_5) ** GOTO lbl181
                        throw null;
                    }
                    case 32: {
                        var28_6 /* !! */  = (int)js.jjfn("jlje", jjfk(int ), (int)662);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl330
                    }
                    case 33: {
                        var28_6 /* !! */  = (int)js.jjfn("jljf", jjfk(int ), (int)663);
                        if (!var29_5) ** GOTO lbl221
                        throw null;
                    }
                    case 34: {
                        var28_6 /* !! */  = (int)js.jjfn("jljg", jjfk(int ), (int)664);
                        if (!var29_5) ** GOTO lbl162
                        throw null;
                    }
lbl255:
                    // 2 sources

                    case 35: {
                        var28_6 /* !! */  = (int)js.jjfn("jljh", jjfk(int ), (int)665);
                        if (!var29_5) ** GOTO lbl203
                        throw null;
                    }
lbl259:
                    // 2 sources

                    case 36: {
                        var28_6 /* !! */  = (int)js.jjfn("jlji", jjfk(int ), (int)666);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl306
                    }
                    case 37: {
                        var28_6 /* !! */  = (int)js.jjfn("jljj", jjfk(int ), (int)667);
                        if (!var29_5) ** GOTO lbl94
                        throw null;
                    }
lbl268:
                    // 4 sources

                    case 38: {
                        var28_6 /* !! */  = (int)js.jjfn("jljk", jjfk(int ), (int)668);
                        if (!var29_5) ** GOTO lbl199
                        throw null;
                    }
                    case 39: {
                        var28_6 /* !! */  = (int)js.jjfn("jljl", jjfk(int ), (int)669);
                        if (!var29_5) ** GOTO lbl259
                        throw null;
                    }
lbl276:
                    // 3 sources

                    case 40: {
                        var28_6 /* !! */  = (int)js.jjfn("jljm", jjfk(int ), (int)670);
                        if (var29_5) {
                            throw null;
                        }
                        ** GOTO lbl326
                    }
                    case 41: {
                        var28_6 /* !! */  = (int)js.jjfn("jljn", jjfk(int ), (int)671);
                        if (!var29_5) ** GOTO lbl162
                        throw null;
                    }
lbl285:
                    // 2 sources

                    case 42: {
                        var28_6 /* !! */  = (int)js.jjfn("jljo", jjfk(int ), (int)672);
                        if (!var29_5) ** GOTO lbl119
                        throw null;
                    }
lbl289:
                    // 3 sources

                    case 43: {
                        var28_6 /* !! */  = (int)js.jjfn("jljp", jjfk(int ), (int)673);
                        if (!var29_5) ** GOTO lbl285
                        throw null;
                    }
lbl293:
                    // 2 sources

                    case 44: {
                        var28_6 /* !! */  = (int)js.jjfn("jljq", jjfk(int ), (int)674);
                        if (!var29_5) ** GOTO lbl234
                        throw null;
                    }
                    case 45: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var28_6 /* !! */  = (int)js.jjfn("jljr", jjfk(int ), (int)675);
                            if (!var29_5) ** GOTO lbl191
                            throw null;
                        }
                    }
lbl302:
                    // 3 sources

                    case 46: {
                        var28_6 /* !! */  = (int)js.jjfn("jljs", jjfk(int ), (int)676);
                        if (!var29_5) ** GOTO lbl217
                        throw null;
                    }
lbl306:
                    // 2 sources

                    case 47: {
                        var28_6 /* !! */  = (int)js.jjfn("jljt", jjfk(int ), (int)677);
                        if (!var29_5) ** GOTO lbl238
                        throw null;
                    }
                    case 48: {
                        var28_6 /* !! */  = (int)js.jjfn("jlju", jjfk(int ), (int)678);
                        if (!var29_5) ** GOTO lbl302
                        throw null;
                    }
                    case 49: {
                        var28_6 /* !! */  = (int)js.jjfn("jljv", jjfk(int ), (int)679);
                        if (!var29_5) ** GOTO lbl162
                        throw null;
                    }
                    case 50: {
                        var28_6 /* !! */  = (int)js.jjfn("jljw", jjfk(int ), (int)680);
                        if (!var29_5) ** GOTO lbl157
                        throw null;
                    }
lbl322:
                    // 2 sources

                    case 51: {
                        var28_6 /* !! */  = (int)js.jjfn("jljx", jjfk(int ), (int)681);
                        if (!var29_5) ** GOTO lbl268
                        throw null;
                    }
lbl326:
                    // 4 sources

                    case 52: {
                        var28_6 /* !! */  = (int)js.jjfn("jljy", jjfk(int ), (int)682);
                        if (!var29_5) ** GOTO lbl195
                        throw null;
                    }
lbl330:
                    // 2 sources

                    case 53: {
                        var28_6 /* !! */  = (int)js.jjfn("jljz", jjfk(int ), (int)683);
                        if (!var29_5) ** GOTO lbl94
                        throw null;
                    }
                    case 54: 
                }
                break;
            }
            break;
        }
        var28_6 /* !! */  = (int)js.jjfn("jlka", jjfk(int ), (int)684);
        ** while (!var29_5)
lbl337:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float jjfp(int n2) {
        return Float.intBitsToFloat(jjfl[n2] ^ jjfm[n2]);
    }

    private static /* synthetic */ long jjht(int n2) {
        return jjhu[n2] ^ jjhv[n2];
    }

    private static /* synthetic */ void jmyw() {
        js.jjfl[900] = -1482302059;
        js.jjfl[901] = 1138535502;
        js.jjfl[902] = 241317074;
        js.jjfl[903] = -476670451;
        js.jjfl[904] = -642476590;
        js.jjfl[905] = 1549821891;
        js.jjfl[906] = 63382464;
        js.jjfl[907] = 888787363;
        js.jjfl[908] = -1590141855;
        js.jjfl[909] = 393691403;
        js.jjfl[910] = -396235339;
        js.jjfl[911] = 2105205373;
        js.jjfl[912] = 1808452503;
        js.jjfl[913] = -436422893;
        js.jjfl[914] = 1746487239;
        js.jjfl[915] = -462916163;
        js.jjfl[916] = -821729461;
        js.jjfl[917] = -1885947598;
        js.jjfl[918] = 1178449191;
        js.jjfl[919] = 938128495;
        js.jjfl[920] = -520787929;
        js.jjfl[921] = -668421779;
        js.jjfl[922] = -662932901;
        js.jjfl[923] = 657706322;
        js.jjfl[924] = 1284381778;
        js.jjfl[925] = -290845435;
        js.jjfl[926] = -417561644;
        js.jjfl[927] = 1899609149;
        js.jjfl[928] = -289077632;
        js.jjfl[929] = -1130983644;
        js.jjfl[930] = 337619544;
        js.jjfl[931] = 747224933;
        js.jjfl[932] = 1175524723;
        js.jjfl[933] = 968885175;
        js.jjfl[934] = -1002881742;
        js.jjfl[935] = 551103960;
        js.jjfl[936] = -1783062270;
        js.jjfl[937] = -1532089114;
        js.jjfl[938] = -1289146182;
        js.jjfl[939] = 1694411606;
        js.jjfl[940] = -688910327;
        js.jjfl[941] = -1791823457;
        js.jjfl[942] = 1898565370;
        js.jjfl[943] = -12984209;
        js.jjfl[944] = 361054640;
        js.jjfl[945] = 1252405665;
        js.jjfl[946] = 1426252606;
        js.jjfl[947] = -2124466563;
        js.jjfl[948] = -1292752462;
        js.jjfl[949] = -435448246;
        js.jjfl[950] = 1950510918;
        js.jjfl[951] = 753854583;
        js.jjfl[952] = -471480269;
        js.jjfl[953] = 1730580419;
        js.jjfl[954] = -738499905;
        js.jjfl[955] = 326430076;
        js.jjfl[956] = -1804927582;
        js.jjfl[957] = 1210152796;
        js.jjfl[958] = -1151518356;
        js.jjfl[959] = 85002583;
        js.jjfl[960] = -1761668120;
        js.jjfl[961] = -1716740603;
        js.jjfl[962] = -1502940626;
        js.jjfl[963] = 15150312;
        js.jjfl[964] = 1769230852;
        js.jjfl[965] = -312659991;
        js.jjfl[966] = 165343348;
        js.jjfl[967] = 1611160115;
        js.jjfl[968] = -692240573;
        js.jjfl[969] = 83137824;
        js.jjfl[970] = -1664922134;
        js.jjfl[971] = -85251228;
        js.jjfl[972] = -1205773358;
        js.jjfl[973] = -1517281309;
        js.jjfl[974] = 940477431;
        js.jjfl[975] = 2022529595;
        js.jjfl[976] = -2040701162;
        js.jjfl[977] = -737798236;
        js.jjfl[978] = 1948976350;
        js.jjfl[979] = 168629125;
        js.jjfl[980] = -163717696;
        js.jjfl[981] = 1377287044;
        js.jjfl[982] = -1545604659;
        js.jjfl[983] = -381448004;
        js.jjfl[984] = -983524878;
        js.jjfl[985] = 897852853;
        js.jjfl[986] = -682560712;
        js.jjfl[987] = -1453971618;
        js.jjfl[988] = -191076787;
        js.jjfl[989] = 1799926974;
        js.jjfl[990] = -223995708;
        js.jjfl[991] = 1897176963;
        js.jjfl[992] = 467725815;
        js.jjfl[993] = -1671457668;
        js.jjfl[994] = 1566523228;
        js.jjfl[995] = 1053822368;
        js.jjfl[996] = -221951433;
        js.jjfl[997] = 926356722;
        js.jjfl[998] = 937069179;
        js.jjfl[999] = -1492568951;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$4() {
        block52: {
            block51: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmsk", jjht(int ), (int)254)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == js.jjfn("jmsl", jjfk(int ), (int)1062)) break;
                    v0 /* !! */  = (long)js.jjfn("jmsm", jjfk(int ), (int)1063);
                }
                var3_1 = js.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmsn", jjht(int ), (int)255)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == js.jjfn("jmso", jjfk(int ), (int)1064)) break;
                    v1 /* !! */  = (long)js.jjfn("jmsp", jjfk(int ), (int)1065);
                }
                var2_2 /* !! */  = js.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmsq", jjht(int ), (int)256)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == js.jjfn("jmsr", jjfk(int ), (int)1066)) break;
                    v2 /* !! */  = (long)js.jjfn("jmss", jjfk(int ), (int)1067);
                }
                var1_3 = js.a;
                if (var3_1) {
                    throw null;
lbl24:
                    // 5 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jmst", jjht(int ), (int)257)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == js.jjfn("jmsu", jjfk(int ), (int)1068)) break;
                    v3 /* !! */  = (long)js.jjfn("jmsv", jjfk(int ), (int)1069);
                }
                v4 /* !! */  = js.rm;
                if (true) ** GOTO lbl37
                block34: while (true) {
                    v4 /* !! */  = (long)(v5 - js.jjfn("jmsw", jjht(int ), (int)258));
lbl37:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -164806354: {
                            v5 = js.jjfn("jmsx", jjht(int ), (int)259);
                            continue block34;
                        }
                        case 458795960: {
                            break block34;
                        }
                        case 1587568808: {
                            v5 = js.jjfn("jmsy", jjht(int ), (int)260);
                            continue block34;
                        }
                    }
                    break;
                }
                if (this.mode.isSelected("\u0414\u0443\u0448\u0438")) break block51;
                if (var1_3) ** GOTO lbl24
                v6 /* !! */  = js.rm;
                if (true) ** GOTO lbl52
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - js.jjfn("jmsz", jjht(int ), (int)261));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1951755497: {
                            v7 = js.jjfn("jmta", jjht(int ), (int)262);
                            continue block35;
                        }
                        case 29129995: {
                            v7 = js.jjfn("jmtb", jjht(int ), (int)263);
                            continue block35;
                        }
                        case 458795960: {
                            break block35;
                        }
                    }
                    break;
                }
                v8 /* !! */  = js.rm;
                if (true) ** GOTO lbl65
                block36: while (true) {
                    v8 /* !! */  = (long)(v9 - js.jjfn("jmtc", jjht(int ), (int)264));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -893126541: {
                            v9 = js.jjfn("jmtd", jjht(int ), (int)265);
                            continue block36;
                        }
                        case -287086203: {
                            v9 = js.jjfn("jmte", jjht(int ), (int)266);
                            continue block36;
                        }
                        case 458795960: {
                            break block36;
                        }
                        case 1225185445: {
                            v9 = js.jjfn("jmtf", jjht(int ), (int)267);
                            continue block36;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438")) break block52;
                if (var1_3) ** GOTO lbl24
            }
            if (var1_3 || var1_3) ** GOTO lbl24
            v10 = js.jjfn("jmtg", jjfk(int ), (int)1070);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl92
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v10 = js.jjfn("jmth", jjfk(int ), (int)1071);
lbl92:
                // 2 sources

                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = js.rm - js.jjfn("jmti", jjht(int ), (int)268)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == js.jjfn("jmtj", jjfk(int ), (int)1072)) break;
                    v11 /* !! */  = (long)js.jjfn("jmtk", jjfk(int ), (int)1073);
                }
                return (boolean)v10;
            }
            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmtl", jjfk(int ), (int)1074);
                if (!var3_1) break;
                throw null;
            }
lbl103:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)js.jjfn("jmtm", jjfk(int ), (int)1075);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)js.jjfn("jmtn", jjfk(int ), (int)1076);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl112:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)js.jjfn("jmto", jjfk(int ), (int)1077);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)js.jjfn("jmtp", jjfk(int ), (int)1078);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 5: {
                var2_2 /* !! */  = (int)js.jjfn("jmtq", jjfk(int ), (int)1079);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 6: {
                var2_2 /* !! */  = (int)js.jjfn("jmtr", jjfk(int ), (int)1080);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)js.jjfn("jmts", jjfk(int ), (int)1081);
                if (!var3_1) break;
                throw null;
            }
lbl134:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)js.jjfn("jmtt", jjfk(int ), (int)1082);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)js.jjfn("jmtu", jjfk(int ), (int)1083);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)js.jjfn("jmtv", jjfk(int ), (int)1084);
        ** while (!var3_1)
lbl145:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmyu() {
        js.jjfl[700] = -1388669173;
        js.jjfl[701] = -1718922287;
        js.jjfl[702] = -1831751857;
        js.jjfl[703] = -384435876;
        js.jjfl[704] = -1644958808;
        js.jjfl[705] = 1517346570;
        js.jjfl[706] = 1331329768;
        js.jjfl[707] = -1920464763;
        js.jjfl[708] = 1695414436;
        js.jjfl[709] = -1850738378;
        js.jjfl[710] = -1605941201;
        js.jjfl[711] = 2032560981;
        js.jjfl[712] = 264935879;
        js.jjfl[713] = -1443698499;
        js.jjfl[714] = 1193595165;
        js.jjfl[715] = 1191024286;
        js.jjfl[716] = -1181166039;
        js.jjfl[717] = 932625340;
        js.jjfl[718] = -1160798147;
        js.jjfl[719] = 986528331;
        js.jjfl[720] = 136702174;
        js.jjfl[721] = -2127974899;
        js.jjfl[722] = -627824217;
        js.jjfl[723] = -941474113;
        js.jjfl[724] = -1661594933;
        js.jjfl[725] = -1939393004;
        js.jjfl[726] = 903435871;
        js.jjfl[727] = -2044724616;
        js.jjfl[728] = -1186352981;
        js.jjfl[729] = -1569905519;
        js.jjfl[730] = -1990336476;
        js.jjfl[731] = 846357828;
        js.jjfl[732] = 1869680041;
        js.jjfl[733] = -1808243014;
        js.jjfl[734] = 708536210;
        js.jjfl[735] = 288123576;
        js.jjfl[736] = 1800826768;
        js.jjfl[737] = -638277629;
        js.jjfl[738] = -1397989044;
        js.jjfl[739] = -2056083643;
        js.jjfl[740] = -1300615535;
        js.jjfl[741] = -391560566;
        js.jjfl[742] = 348143841;
        js.jjfl[743] = 1376003079;
        js.jjfl[744] = -1659579972;
        js.jjfl[745] = 595669183;
        js.jjfl[746] = 201034154;
        js.jjfl[747] = -222826627;
        js.jjfl[748] = -489720056;
        js.jjfl[749] = -141363815;
        js.jjfl[750] = -1768447054;
        js.jjfl[751] = 471831726;
        js.jjfl[752] = -1782378751;
        js.jjfl[753] = -2048346697;
        js.jjfl[754] = 1609603268;
        js.jjfl[755] = 1294719998;
        js.jjfl[756] = -1032640181;
        js.jjfl[757] = -1093146526;
        js.jjfl[758] = 502080360;
        js.jjfl[759] = -1364045552;
        js.jjfl[760] = -1686021707;
        js.jjfl[761] = -1363451771;
        js.jjfl[762] = -1861243383;
        js.jjfl[763] = 1132951357;
        js.jjfl[764] = 1478654777;
        js.jjfl[765] = -1642488651;
        js.jjfl[766] = 10824007;
        js.jjfl[767] = -1026903580;
        js.jjfl[768] = 2100253943;
        js.jjfl[769] = 1768722146;
        js.jjfl[770] = -1703879686;
        js.jjfl[771] = -901891094;
        js.jjfl[772] = 775838777;
        js.jjfl[773] = 1717524566;
        js.jjfl[774] = 293769164;
        js.jjfl[775] = 1767293258;
        js.jjfl[776] = 1724688243;
        js.jjfl[777] = 1353294961;
        js.jjfl[778] = 450283067;
        js.jjfl[779] = 743664838;
        js.jjfl[780] = -413644876;
        js.jjfl[781] = 116891217;
        js.jjfl[782] = -1103705491;
        js.jjfl[783] = -1301775212;
        js.jjfl[784] = 128881763;
        js.jjfl[785] = -2084000039;
        js.jjfl[786] = -926362146;
        js.jjfl[787] = -1206666504;
        js.jjfl[788] = 315960306;
        js.jjfl[789] = 371096291;
        js.jjfl[790] = 1394515353;
        js.jjfl[791] = 676552527;
        js.jjfl[792] = -367220347;
        js.jjfl[793] = -1116154174;
        js.jjfl[794] = 814937710;
        js.jjfl[795] = -504546219;
        js.jjfl[796] = 1213750469;
        js.jjfl[797] = -80569205;
        js.jjfl[798] = 397240415;
        js.jjfl[799] = 578634407;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static class_243 interpolate(class_1309 var0, float var1_1) {
        block55: {
            v0 /* !! */  = js.rm;
            if (true) ** GOTO lbl5
            block32: while (true) {
                v0 /* !! */  = (long)(v1 - js.jjfn("jmjn", jjht(int ), (int)136));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 39256764: {
                        v1 = js.jjfn("jmjo", jjht(int ), (int)137);
                        continue block32;
                    }
                    case 458795960: {
                        break block32;
                    }
                    case 529322341: {
                        v1 = js.jjfn("jmjp", jjht(int ), (int)138);
                        continue block32;
                    }
                }
                break;
            }
            var4_2 = js.c;
            while (true) {
                block56: {
                    if ((v2 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmjq", jjht(int ), (int)139)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  != js.jjfn("jmjr", jjfk(int ), (int)949)) break block56;
                    var3_3 /* !! */  = js.b;
                    if (var3_3 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v2 /* !! */  = (long)js.jjfn("jmjs", jjfk(int ), (int)950);
            }
            cfr_temp_0 = -2147483648;
            block34: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmjt", jjht(int ), (int)140)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == js.jjfn("jmju", jjfk(int ), (int)951)) {
                                var2_4 = js.a;
                                if (var4_2) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)js.jjfn("jmjv", jjfk(int ), (int)952);
                        }
                        if (var2_4 != false) return null;
                        if (var2_4 != false) return null;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jmjw", jjht(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == js.jjfn("jmjx", jjfk(int ), (int)953)) {
                                v5 = var1_1;
                                v6 /* !! */  = js.rm;
                                ** break;
                            }
                            v4 /* !! */  = (long)js.jjfn("jmjy", jjfk(int ), (int)954);
                        }
                    }
                    case 0: {
                        ** GOTO lbl146
                    }
                    case 3: {
                        break block55;
                    }
lbl52:
                    // 1 sources

                    block37: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -1826339116: {
                                v6 /* !! */  = (long)(js.jjfn("jmka", jjht(int ), (int)143) - js.jjfn("jmjz", jjht(int ), (int)142));
                                continue block37;
                            }
                            case 458795960: {
                                break block37;
                            }
                        }
                        break;
                    }
                    v7 = var0.field_6014;
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = js.rm - js.jjfn("jmkb", jjht(int ), (int)144)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  != js.jjfn("jmkc", jjfk(int ), (int)955)) ** GOTO lbl66
                        v9 = var0.method_23317();
                        v10 /* !! */  = js.rm;
                        if (true) ** GOTO lbl70
lbl66:
                        // 1 sources

                        v8 /* !! */  = (long)js.jjfn("jmkd", jjfk(int ), (int)956);
                    }
                    block39: while (true) {
                        v10 /* !! */  = (long)(v11 - js.jjfn("jmke", jjht(int ), (int)145));
lbl70:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1284984058: {
                                v11 = js.jjfn("jmkf", jjht(int ), (int)146);
                                continue block39;
                            }
                            case 458795960: {
                                break block39;
                            }
                            case 661586460: {
                                v11 = js.jjfn("jmkg", jjht(int ), (int)147);
                                continue block39;
                            }
                        }
                        break;
                    }
                    v12 = class_3532.method_16436((double)v5, (double)v7, (double)v9);
                    v13 = var1_1;
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = js.rm - js.jjfn("jmkh", jjht(int ), (int)148)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  != js.jjfn("jmki", jjfk(int ), (int)957)) ** GOTO lbl87
                        v15 = var0.field_6036;
                        v16 /* !! */  = js.rm;
                        if (true) ** GOTO lbl91
lbl87:
                        // 1 sources

                        v14 /* !! */  = (long)js.jjfn("jmkj", jjfk(int ), (int)958);
                    }
                    block41: while (true) {
                        v16 /* !! */  = (long)(v17 - js.jjfn("jmkk", jjht(int ), (int)149));
lbl91:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case 458795960: {
                                break block41;
                            }
                            case 1207067625: {
                                v17 = js.jjfn("jmkl", jjht(int ), (int)150);
                                continue block41;
                            }
                            case 1943253692: {
                                v17 = js.jjfn("jmkm", jjht(int ), (int)151);
                                continue block41;
                            }
                            case 1976890760: {
                                v17 = js.jjfn("jmkn", jjht(int ), (int)152);
                                continue block41;
                            }
                        }
                        break;
                    }
                    v18 = var0.method_23318();
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_6 = js.rm - js.jjfn("jmko", jjht(int ), (int)153)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == js.jjfn("jmkp", jjfk(int ), (int)959)) break;
                        v19 /* !! */  = (long)js.jjfn("jmkq", jjfk(int ), (int)960);
                    }
                    v20 = class_3532.method_16436((double)v13, (double)v15, (double)v18);
                    v21 = var1_1;
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_7 = js.rm - js.jjfn("jmkr", jjht(int ), (int)154)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == js.jjfn("jmks", jjfk(int ), (int)961)) break;
                        v22 /* !! */  = (long)js.jjfn("jmkt", jjfk(int ), (int)962);
                    }
                    v23 = var0.field_5969;
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_8 = js.rm - js.jjfn("jmku", jjht(int ), (int)155)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  != js.jjfn("jmkv", jjfk(int ), (int)963)) ** GOTO lbl123
                        v25 = var0.method_23321();
                        v26 /* !! */  = js.rm;
                        if (true) ** GOTO lbl127
lbl123:
                        // 1 sources

                        v24 /* !! */  = (long)js.jjfn("jmkw", jjfk(int ), (int)964);
                    }
                    block45: while (true) {
                        v26 /* !! */  = (long)(v27 - js.jjfn("jmkx", jjht(int ), (int)156));
lbl127:
                        // 2 sources

                        switch ((int)v26 /* !! */ ) {
                            case -1918639331: {
                                v27 = js.jjfn("jmky", jjht(int ), (int)157);
                                continue block45;
                            }
                            case -69434225: {
                                v27 = js.jjfn("jmkz", jjht(int ), (int)158);
                                continue block45;
                            }
                            case 458795960: {
                                break block45;
                            }
                            case 1095618182: {
                                v27 = js.jjfn("jmla", jjht(int ), (int)159);
                                continue block45;
                            }
                        }
                        break;
                    }
                    v28 = class_3532.method_16436((double)v21, (double)v23, (double)v25);
                    while (true) {
                        if ((v29 /* !! */  = (cfr_temp_9 = js.rm - js.jjfn("jmlb", jjht(int ), (int)160)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v29 /* !! */  == js.jjfn("jmlc", jjfk(int ), (int)965)) {
                            return new class_243(v12, v20, v28);
                        }
                        v29 /* !! */  = (long)js.jjfn("jmld", jjfk(int ), (int)966);
                    }
lbl146:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)js.jjfn("jmle", jjfk(int ), (int)967);
                        cfr_temp_0 = 2;
                        if (!var4_2) continue block34;
                        throw null;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)js.jjfn("jmlg", jjfk(int ), (int)969);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)js.jjfn("jmlf", jjfk(int ), (int)968);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)js.jjfn("jmlh", jjfk(int ), (int)970);
        ** while (!var4_2)
lbl164:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block323: {
            block322: {
                block321: {
                    block320: {
                        var14_2 = js.c;
                        var13_3 /* !! */  = js.b;
                        var12_4 = js.a;
                        if (var14_2) {
                            throw null;
lbl6:
                            // 90 sources

                            return;
                        }
                        if (var12_4 || var12_4) ** GOTO lbl6
                        var2_5 = System.currentTimeMillis();
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (this.lastFrameTime != js.jjfn("jjin", jjht(int ), (int)11)) break block320;
                        if (var12_4) ** GOTO lbl6
                        v0 /* !! */  = js.jjfn("jjio", jjfp(int ), (int)62);
                        if (var14_2) {
                            throw null;
                        }
                        break block321;
                    }
                    if (var12_4 || var12_4) ** GOTO lbl6
                    v0 /* !! */  = var4_6 = (CallSite)Math.min((float)js.jjfn("jjip", jjfp(int ), (int)63), (float)(var2_5 - this.lastFrameTime) / js.jjfn("jjiq", jjfp(int ), (int)64));
                }
                if (var12_4 || var12_4) ** GOTO lbl6
                this.lastFrameTime = var2_5;
                if (var12_4 || var12_4) ** GOTO lbl6
                var5_7 = gz.getInstance();
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var5_7 == null) break block322;
                if (var12_4) ** GOTO lbl6
                if (!var5_7.isState()) break block322;
                if (var12_4) ** GOTO lbl6
                v1 = var5_7.getTarget();
                if (var14_2) {
                    throw null;
                }
                break block323;
            }
            if (var12_4 || var12_4) ** GOTO lbl6
            v1 = var6_8 = null;
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        if (var6_8 != null) ** GOTO lbl57
        if (var12_4 || var12_4) ** GOTO lbl6
        var7_9 = hn.getInstance();
        if (var12_4 || var12_4) ** GOTO lbl6
        if (var7_9 == null) ** GOTO lbl54
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_4) ** GOTO lbl6
                if (!var7_9.isState()) ** GOTO lbl54
                if (var12_4) ** GOTO lbl6
                v2 = var7_9.getTarget();
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl56
lbl54:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v2 = var6_8 = null;
lbl56:
                // 2 sources

                if (var12_4) ** GOTO lbl6
lbl57:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                this.updateHoverTarget(var2_5);
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var6_8 != null) ** GOTO lbl64
                if (var12_4 || var12_4) ** GOTO lbl6
                var6_8 = this.hoverTarget;
                if (var12_4) ** GOTO lbl6
lbl64:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var6_8 == null) ** GOTO lbl75
                if (var12_4) ** GOTO lbl6
                if (!var6_8.method_5805()) ** GOTO lbl75
                if (var12_4) ** GOTO lbl6
                if (this.mode.isSelected("\u041d\u0435 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c")) ** GOTO lbl75
                if (var12_4) ** GOTO lbl6
                v3 = js.jjfn("jjir", jjfk(int ), (int)65);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl77
lbl75:
                // 3 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v3 = var7_10 = js.jjfn("jjis", jjfk(int ), (int)66);
lbl77:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var7_10 != false) {
                    v4 = 1.0f;
                    if (var14_2) {
                        throw null;
                    }
                } else {
                    v4 = 0.0f;
                }
                this.appearance = js.approach(this.appearance, v4, (float)(var4_6 * js.jjfn("jjit", jjfp(int ), (int)67)));
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var7_10 == false) ** GOTO lbl92
                if (var12_4 || var12_4) ** GOTO lbl6
                this.lastTarget = var6_8;
                if (var12_4 || var12_4) ** GOTO lbl6
                this.lastPosition = js.interpolate((class_1309)var6_8, var1_1.getPartialTicks());
                if (var12_4) ** GOTO lbl6
lbl92:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (this.appearance <= js.jjfn("jjiu", jjfp(int ), (int)68)) ** GOTO lbl99
                if (var12_4) ** GOTO lbl6
                if (this.lastTarget == null) ** GOTO lbl99
                if (var12_4) ** GOTO lbl6
                if (this.lastPosition != null) ** GOTO lbl112
                if (var12_4) ** GOTO lbl6
lbl99:
                // 3 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var7_10 != false) ** GOTO lbl110
                if (var12_4 || var12_4) ** GOTO lbl6
                this.lastTarget = null;
                if (var12_4 || var12_4) ** GOTO lbl6
                this.lastPosition = null;
                if (var12_4 || var12_4) ** GOTO lbl6
                this.resetFloatingGhosts();
                if (var12_4 || var12_4) ** GOTO lbl6
                this.floatingGhostTargetId = (int)js.jjfn("jjiv", jjfk(int ), (int)69);
                if (var12_4) ** GOTO lbl6
lbl110:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                return;
lbl112:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var7_10 == false) ** GOTO lbl121
                if (var12_4) ** GOTO lbl6
                if (this.lastTarget.field_6254 <= 0) ** GOTO lbl121
                if (var12_4 || var12_4) ** GOTO lbl6
                v5 = class_3532.method_15363((float)((float)this.lastTarget.field_6235 / (float)this.lastTarget.field_6254), (float)0.0f, (float)1.0f);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl123
lbl121:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v5 = var8_11 = 0.0f;
lbl123:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                this.hurtAnimation = js.approach(this.hurtAnimation, var8_11, (float)(var4_6 * js.jjfn("jjiw", jjfp(int ), (int)70)));
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!this.reddenOnHit.isValue()) ** GOTO lbl132
                if (var12_4 || var12_4) ** GOTO lbl6
                v6 = js.hurtColor(nd.getClientColor(), this.hurtAnimation);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl134
lbl132:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v6 = var9_12 = nd.getClientColor();
lbl134:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (this.mode.isSelected("Ghosts")) ** GOTO lbl143
                if (var12_4) ** GOTO lbl6
                if (this.floatingGhostTargetId == js.jjfn("jjix", jjfk(int ), (int)71)) ** GOTO lbl143
                if (var12_4 || var12_4) ** GOTO lbl6
                this.resetFloatingGhosts();
                if (var12_4 || var12_4) ** GOTO lbl6
                this.floatingGhostTargetId = (int)js.jjfn("jjiy", jjfk(int ), (int)72);
                if (var12_4) ** GOTO lbl6
lbl143:
                // 3 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                var10_13 = this.mode.getValue();
                if (var12_4) ** GOTO lbl6
                var11_14 = js.jjfn("jjiz", jjfk(int ), (int)73);
                if (var12_4) ** GOTO lbl6
                switch (var10_13.hashCode()) {
                    case 1032137037: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var10_13.equals("\u041a\u043e\u043b\u044c\u0446\u043e")) break;
                        if (var12_4) ** GOTO lbl6
                        var11_14 = js.jjfn("jjja", jjfk(int ), (int)74);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 32537619: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var10_13.equals("\u0420\u043e\u043c\u0431")) break;
                        if (var12_4) ** GOTO lbl6
                        var11_14 = js.jjfn("jjjb", jjfk(int ), (int)75);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 1539932654: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var10_13.equals("\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438")) break;
                        if (var12_4) ** GOTO lbl6
                        var11_14 = js.jjfn("jjjc", jjfk(int ), (int)76);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 32185311: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var10_13.equals("\u0414\u0443\u0448\u0438")) break;
                        if (var12_4) ** GOTO lbl6
                        var11_14 = js.jjfn("jjjd", jjfk(int ), (int)77);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 2132136932: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var10_13.equals("Ghosts")) break;
                        if (var12_4) ** GOTO lbl6
                        var11_14 = js.jjfn("jjje", jjfk(int ), (int)78);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 1089380484: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var10_13.equals("\u041c\u043e\u043b\u043d\u0438\u0438")) break;
                        if (var12_4) ** GOTO lbl6
                        var11_14 = js.jjfn("jjjf", jjfk(int ), (int)79);
                        if (var12_4) ** break;
                    }
                }
                if (var12_4 || var12_4) ** GOTO lbl6
                switch (var11_14) {
                    case 0: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.renderRing(this.lastTarget, this.lastPosition, var9_12);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 1: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.renderDiamond(this.lastTarget, this.lastPosition, var9_12, (float)var4_6);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 2: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.renderGhosts(this.lastTarget, this.lastPosition, var9_12, (float)var4_6);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 3: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.renderSouls(this.lastTarget, this.lastPosition, var9_12, (float)var4_6);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 4: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.renderFloatingGhosts(this.lastTarget, this.lastPosition, var9_12, (float)var4_6);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                    case 5: {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        this.renderLightning(this.lastTarget, this.lastPosition, var9_12, (float)var4_6);
                        if (var12_4) ** GOTO lbl6
                        if (!var14_2) break;
                        throw null;
                    }
                }
                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_3 /* !! */  = (int)js.jjfn("jjjg", jjfk(int ), (int)80);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 1: {
                var13_3 /* !! */  = (int)js.jjfn("jjjh", jjfk(int ), (int)81);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl916
            }
            case 2: {
                var13_3 /* !! */  = (int)js.jjfn("jjji", jjfk(int ), (int)82);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl772
            }
            case 3: {
                var13_3 /* !! */  = (int)js.jjfn("jjjj", jjfk(int ), (int)83);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl763
            }
            case 4: {
                var13_3 /* !! */  = (int)js.jjfn("jjjk", jjfk(int ), (int)84);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl543
            }
            case 5: {
                var13_3 /* !! */  = (int)js.jjfn("jjjl", jjfk(int ), (int)85);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl266:
            // 4 sources

            case 6: {
                var13_3 /* !! */  = (int)js.jjfn("jjjm", jjfk(int ), (int)86);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl838
            }
lbl271:
            // 2 sources

            case 7: {
                var13_3 /* !! */  = (int)js.jjfn("jjjn", jjfk(int ), (int)87);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl276:
            // 2 sources

            case 8: {
                var13_3 /* !! */  = (int)js.jjfn("jjjo", jjfk(int ), (int)88);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl680
            }
lbl281:
            // 2 sources

            case 9: {
                var13_3 /* !! */  = (int)js.jjfn("jjjp", jjfk(int ), (int)89);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl702
            }
            case 10: {
                var13_3 /* !! */  = (int)js.jjfn("jjjq", jjfk(int ), (int)90);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl866
            }
lbl291:
            // 3 sources

            case 11: {
                var13_3 /* !! */  = (int)js.jjfn("jjjr", jjfk(int ), (int)91);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl296:
            // 4 sources

            case 12: {
                var13_3 /* !! */  = (int)js.jjfn("jjjs", jjfk(int ), (int)92);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl891
            }
lbl301:
            // 5 sources

            case 13: {
                var13_3 /* !! */  = (int)js.jjfn("jjjt", jjfk(int ), (int)93);
                if (!var14_2) ** GOTO lbl296
                throw null;
            }
lbl305:
            // 2 sources

            case 14: {
                var13_3 /* !! */  = (int)js.jjfn("jjju", jjfk(int ), (int)94);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl538
            }
            case 15: {
                var13_3 /* !! */  = (int)js.jjfn("jjjv", jjfk(int ), (int)95);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl862
            }
lbl315:
            // 3 sources

            case 16: {
                var13_3 /* !! */  = (int)js.jjfn("jjjw", jjfk(int ), (int)96);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl680
            }
lbl320:
            // 2 sources

            case 17: {
                var13_3 /* !! */  = (int)js.jjfn("jjjx", jjfk(int ), (int)97);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 18: {
                var13_3 /* !! */  = (int)js.jjfn("jjjy", jjfk(int ), (int)98);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl822
            }
lbl330:
            // 3 sources

            case 19: {
                var13_3 /* !! */  = (int)js.jjfn("jjjz", jjfk(int ), (int)99);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl335:
            // 3 sources

            case 20: {
                var13_3 /* !! */  = (int)js.jjfn("jjka", jjfk(int ), (int)100);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl578
            }
            case 21: {
                var13_3 /* !! */  = (int)js.jjfn("jjkb", jjfk(int ), (int)101);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl345:
            // 2 sources

            case 22: {
                var13_3 /* !! */  = (int)js.jjfn("jjkc", jjfk(int ), (int)102);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl350:
            // 2 sources

            case 23: {
                var13_3 /* !! */  = (int)js.jjfn("jjkd", jjfk(int ), (int)103);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
            case 24: {
                var13_3 /* !! */  = (int)js.jjfn("jjke", jjfk(int ), (int)104);
                if (!var14_2) ** GOTO lbl301
                throw null;
            }
            case 25: {
                var13_3 /* !! */  = (int)js.jjfn("jjkf", jjfk(int ), (int)105);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
            case 26: {
                var13_3 /* !! */  = (int)js.jjfn("jjkg", jjfk(int ), (int)106);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl689
            }
lbl369:
            // 3 sources

            case 27: {
                var13_3 /* !! */  = (int)js.jjfn("jjkh", jjfk(int ), (int)107);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl676
            }
lbl374:
            // 4 sources

            case 28: {
                var13_3 /* !! */  = (int)js.jjfn("jjki", jjfk(int ), (int)108);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl804
            }
lbl379:
            // 4 sources

            case 29: {
                var13_3 /* !! */  = (int)js.jjfn("jjkj", jjfk(int ), (int)109);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl871
            }
lbl384:
            // 3 sources

            case 30: {
                var13_3 /* !! */  = (int)js.jjfn("jjkk", jjfk(int ), (int)110);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl813
            }
            case 31: {
                var13_3 /* !! */  = (int)js.jjfn("jjkl", jjfk(int ), (int)111);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl740
            }
lbl394:
            // 2 sources

            case 32: {
                var13_3 /* !! */  = (int)js.jjfn("jjkm", jjfk(int ), (int)112);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl619
            }
lbl399:
            // 3 sources

            case 33: {
                var13_3 /* !! */  = (int)js.jjfn("jjkn", jjfk(int ), (int)113);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl404:
            // 2 sources

            case 34: {
                var13_3 /* !! */  = (int)js.jjfn("jjko", jjfk(int ), (int)114);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl547
            }
lbl409:
            // 2 sources

            case 35: {
                var13_3 /* !! */  = (int)js.jjfn("jjkp", jjfk(int ), (int)115);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl891
            }
lbl414:
            // 4 sources

            case 36: {
                var13_3 /* !! */  = (int)js.jjfn("jjkq", jjfk(int ), (int)116);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl788
            }
            case 37: {
                var13_3 /* !! */  = (int)js.jjfn("jjkr", jjfk(int ), (int)117);
                if (!var14_2) ** GOTO lbl379
                throw null;
            }
            case 38: {
                var13_3 /* !! */  = (int)js.jjfn("jjks", jjfk(int ), (int)118);
                if (var14_2) {
                    throw null;
                }
            }
lbl427:
            // 4 sources

            case 39: {
                var13_3 /* !! */  = (int)js.jjfn("jjkt", jjfk(int ), (int)119);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl784
            }
lbl432:
            // 2 sources

            case 40: {
                var13_3 /* !! */  = (int)js.jjfn("jjku", jjfk(int ), (int)120);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl925
            }
            case 41: {
                var13_3 /* !! */  = (int)js.jjfn("jjkv", jjfk(int ), (int)121);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl533
            }
            case 42: {
                var13_3 /* !! */  = (int)js.jjfn("jjkw", jjfk(int ), (int)122);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl623
            }
lbl447:
            // 2 sources

            case 43: {
                var13_3 /* !! */  = (int)js.jjfn("jjkx", jjfk(int ), (int)123);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl655
            }
lbl452:
            // 3 sources

            case 44: {
                var13_3 /* !! */  = (int)js.jjfn("jjky", jjfk(int ), (int)124);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl740
            }
lbl457:
            // 3 sources

            case 45: {
                var13_3 /* !! */  = (int)js.jjfn("jjkz", jjfk(int ), (int)125);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl689
            }
            case 46: {
                var13_3 /* !! */  = (int)js.jjfn("jjla", jjfk(int ), (int)126);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl663
            }
lbl467:
            // 2 sources

            case 47: {
                var13_3 /* !! */  = (int)js.jjfn("jjlb", jjfk(int ), (int)127);
                if (!var14_2) ** GOTO lbl399
                throw null;
            }
            case 48: {
                var13_3 /* !! */  = (int)js.jjfn("jjlc", jjfk(int ), (int)128);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl875
            }
lbl476:
            // 2 sources

            case 49: {
                var13_3 /* !! */  = (int)js.jjfn("jjld", jjfk(int ), (int)129);
                if (!var14_2) ** GOTO lbl301
                throw null;
            }
            case 50: {
                var13_3 /* !! */  = (int)js.jjfn("jjle", jjfk(int ), (int)130);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl555
            }
lbl485:
            // 2 sources

            case 51: {
                var13_3 /* !! */  = (int)js.jjfn("jjlf", jjfk(int ), (int)131);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl788
            }
lbl490:
            // 2 sources

            case 52: {
                var13_3 /* !! */  = (int)js.jjfn("jjlg", jjfk(int ), (int)132);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl750
            }
lbl495:
            // 2 sources

            case 53: {
                var13_3 /* !! */  = (int)js.jjfn("jjlh", jjfk(int ), (int)133);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl911
            }
            case 54: {
                var13_3 /* !! */  = (int)js.jjfn("jjli", jjfk(int ), (int)134);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl875
            }
            case 55: {
                var13_3 /* !! */  = (int)js.jjfn("jjlj", jjfk(int ), (int)135);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl615
            }
lbl510:
            // 2 sources

            case 56: {
                var13_3 /* !! */  = (int)js.jjfn("jjlk", jjfk(int ), (int)136);
                if (!var14_2) ** GOTO lbl414
                throw null;
            }
            case 57: {
                var13_3 /* !! */  = (int)js.jjfn("jjll", jjfk(int ), (int)137);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl642
            }
lbl519:
            // 2 sources

            case 58: {
                var13_3 /* !! */  = (int)js.jjfn("jjlm", jjfk(int ), (int)138);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl715
            }
            case 59: {
                var13_3 /* !! */  = (int)js.jjfn("jjln", jjfk(int ), (int)139);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl838
            }
lbl529:
            // 2 sources

            case 60: {
                var13_3 /* !! */  = (int)js.jjfn("jjlo", jjfk(int ), (int)140);
                if (!var14_2) ** GOTO lbl399
                throw null;
            }
lbl533:
            // 3 sources

            case 61: {
                var13_3 /* !! */  = (int)js.jjfn("jjlp", jjfk(int ), (int)141);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl559
            }
lbl538:
            // 2 sources

            case 62: {
                var13_3 /* !! */  = (int)js.jjfn("jjlq", jjfk(int ), (int)142);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl879
            }
lbl543:
            // 2 sources

            case 63: {
                var13_3 /* !! */  = (int)js.jjfn("jjlr", jjfk(int ), (int)143);
                if (!var14_2) ** GOTO lbl301
                throw null;
            }
lbl547:
            // 2 sources

            case 64: {
                var13_3 /* !! */  = (int)js.jjfn("jjls", jjfk(int ), (int)144);
                if (!var14_2) ** GOTO lbl296
                throw null;
            }
            case 65: {
                var13_3 /* !! */  = (int)js.jjfn("jjlt", jjfk(int ), (int)145);
                if (!var14_2) ** GOTO lbl266
                throw null;
            }
lbl555:
            // 2 sources

            case 66: {
                var13_3 /* !! */  = (int)js.jjfn("jjlu", jjfk(int ), (int)146);
                if (!var14_2) ** GOTO lbl409
                throw null;
            }
lbl559:
            // 2 sources

            case 67: {
                var13_3 /* !! */  = (int)js.jjfn("jjlv", jjfk(int ), (int)147);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl916
            }
            case 68: {
                var13_3 /* !! */  = (int)js.jjfn("jjlw", jjfk(int ), (int)148);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl715
            }
lbl569:
            // 2 sources

            case 69: {
                var13_3 /* !! */  = (int)js.jjfn("jjlx", jjfk(int ), (int)149);
                if (!var14_2) ** GOTO lbl476
                throw null;
            }
lbl573:
            // 2 sources

            case 70: {
                var13_3 /* !! */  = (int)js.jjfn("jjly", jjfk(int ), (int)150);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl619
            }
lbl578:
            // 2 sources

            case 71: {
                var13_3 /* !! */  = (int)js.jjfn("jjlz", jjfk(int ), (int)151);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl907
            }
            case 72: {
                var13_3 /* !! */  = (int)js.jjfn("jjma", jjfk(int ), (int)152);
                if (!var14_2) ** GOTO lbl467
                throw null;
            }
            case 73: {
                var13_3 /* !! */  = (int)js.jjfn("jjmb", jjfk(int ), (int)153);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl754
            }
            case 74: {
                var13_3 /* !! */  = (int)js.jjfn("jjmc", jjfk(int ), (int)154);
                if (!var14_2) ** GOTO lbl296
                throw null;
            }
lbl596:
            // 3 sources

            case 75: {
                var13_3 /* !! */  = (int)js.jjfn("jjmd", jjfk(int ), (int)155);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl750
            }
lbl601:
            // 2 sources

            case 76: {
                var13_3 /* !! */  = (int)js.jjfn("jjme", jjfk(int ), (int)156);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl676
            }
            case 77: {
                var13_3 /* !! */  = (int)js.jjfn("jjmf", jjfk(int ), (int)157);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl804
            }
lbl611:
            // 2 sources

            case 78: {
                var13_3 /* !! */  = (int)js.jjfn("jjmg", jjfk(int ), (int)158);
                if (!var14_2) ** GOTO lbl315
                throw null;
            }
lbl615:
            // 2 sources

            case 79: {
                var13_3 /* !! */  = (int)js.jjfn("jjmh", jjfk(int ), (int)159);
                if (!var14_2) ** GOTO lbl384
                throw null;
            }
lbl619:
            // 4 sources

            case 80: {
                var13_3 /* !! */  = (int)js.jjfn("jjmi", jjfk(int ), (int)160);
                if (!var14_2) ** GOTO lbl394
                throw null;
            }
lbl623:
            // 3 sources

            case 81: {
                var13_3 /* !! */  = (int)js.jjfn("jjmj", jjfk(int ), (int)161);
                if (!var14_2) ** GOTO lbl427
                throw null;
            }
lbl627:
            // 3 sources

            case 82: {
                var13_3 /* !! */  = (int)js.jjfn("jjmk", jjfk(int ), (int)162);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl891
            }
lbl632:
            // 2 sources

            case 83: {
                var13_3 /* !! */  = (int)js.jjfn("jjml", jjfk(int ), (int)163);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl668
            }
            case 84: {
                var13_3 /* !! */  = (int)js.jjfn("jjmm", jjfk(int ), (int)164);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl710
            }
lbl642:
            // 2 sources

            case 85: {
                var13_3 /* !! */  = (int)js.jjfn("jjmn", jjfk(int ), (int)165);
                if (!var14_2) ** GOTO lbl414
                throw null;
            }
lbl646:
            // 2 sources

            case 86: {
                var13_3 /* !! */  = (int)js.jjfn("jjmo", jjfk(int ), (int)166);
                if (!var14_2) ** GOTO lbl271
                throw null;
            }
            case 87: {
                var13_3 /* !! */  = (int)js.jjfn("jjmp", jjfk(int ), (int)167);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl804
            }
lbl655:
            // 3 sources

            case 88: {
                var13_3 /* !! */  = (int)js.jjfn("jjmq", jjfk(int ), (int)168);
                if (!var14_2) ** GOTO lbl330
                throw null;
            }
            case 89: {
                var13_3 /* !! */  = (int)js.jjfn("jjmr", jjfk(int ), (int)169);
                if (!var14_2) ** GOTO lbl596
                throw null;
            }
lbl663:
            // 2 sources

            case 90: {
                var13_3 /* !! */  = (int)js.jjfn("jjms", jjfk(int ), (int)170);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl672
            }
lbl668:
            // 2 sources

            case 91: {
                var13_3 /* !! */  = (int)js.jjfn("jjmt", jjfk(int ), (int)171);
                if (!var14_2) ** GOTO lbl452
                throw null;
            }
lbl672:
            // 2 sources

            case 92: {
                var13_3 /* !! */  = (int)js.jjfn("jjmu", jjfk(int ), (int)172);
                if (!var14_2) ** GOTO lbl452
                throw null;
            }
lbl676:
            // 4 sources

            case 93: {
                var13_3 /* !! */  = (int)js.jjfn("jjmv", jjfk(int ), (int)173);
                if (!var14_2) ** GOTO lbl276
                throw null;
            }
lbl680:
            // 3 sources

            case 94: {
                var13_3 /* !! */  = (int)js.jjfn("jjmw", jjfk(int ), (int)174);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl891
            }
            case 95: {
                var13_3 /* !! */  = (int)js.jjfn("jjmx", jjfk(int ), (int)175);
                if (!var14_2) ** GOTO lbl266
                throw null;
            }
lbl689:
            // 4 sources

            case 96: {
                var13_3 /* !! */  = (int)js.jjfn("jjmy", jjfk(int ), (int)176);
                if (!var14_2) ** GOTO lbl676
                throw null;
            }
            case 97: {
                var13_3 /* !! */  = (int)js.jjfn("jjmz", jjfk(int ), (int)177);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl804
            }
lbl698:
            // 2 sources

            case 98: {
                var13_3 /* !! */  = (int)js.jjfn("jjna", jjfk(int ), (int)178);
                if (!var14_2) ** GOTO lbl510
                throw null;
            }
lbl702:
            // 2 sources

            case 99: {
                var13_3 /* !! */  = (int)js.jjfn("jjnb", jjfk(int ), (int)179);
                if (!var14_2) ** GOTO lbl291
                throw null;
            }
            case 100: {
                var13_3 /* !! */  = (int)js.jjfn("jjnc", jjfk(int ), (int)180);
                if (!var14_2) ** GOTO lbl533
                throw null;
            }
lbl710:
            // 4 sources

            case 101: {
                var13_3 /* !! */  = (int)js.jjfn("jjnd", jjfk(int ), (int)181);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl719
            }
lbl715:
            // 3 sources

            case 102: {
                var13_3 /* !! */  = (int)js.jjfn("jjne", jjfk(int ), (int)182);
                if (!var14_2) ** GOTO lbl601
                throw null;
            }
lbl719:
            // 2 sources

            case 103: {
                var13_3 /* !! */  = (int)js.jjfn("jjnf", jjfk(int ), (int)183);
                if (!var14_2) ** GOTO lbl627
                throw null;
            }
lbl723:
            // 2 sources

            case 104: {
                var13_3 /* !! */  = (int)js.jjfn("jjng", jjfk(int ), (int)184);
                if (!var14_2) ** GOTO lbl529
                throw null;
            }
            case 105: {
                var13_3 /* !! */  = (int)js.jjfn("jjnh", jjfk(int ), (int)185);
                if (!var14_2) ** GOTO lbl330
                throw null;
            }
            case 106: {
                var13_3 /* !! */  = (int)js.jjfn("jjni", jjfk(int ), (int)186);
                if (!var14_2) ** GOTO lbl519
                throw null;
            }
            case 107: {
                var13_3 /* !! */  = (int)js.jjfn("jjnj", jjfk(int ), (int)187);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl750
            }
lbl740:
            // 4 sources

            case 108: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)js.jjfn("jjnk", jjfk(int ), (int)188);
                    if (!var14_2) ** GOTO lbl379
                    throw null;
                }
            }
            case 109: {
                var13_3 /* !! */  = (int)js.jjfn("jjnl", jjfk(int ), (int)189);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl809
            }
lbl750:
            // 4 sources

            case 110: {
                var13_3 /* !! */  = (int)js.jjfn("jjnm", jjfk(int ), (int)190);
                if (!var14_2) ** GOTO lbl379
                throw null;
            }
lbl754:
            // 2 sources

            case 111: {
                var13_3 /* !! */  = (int)js.jjfn("jjnn", jjfk(int ), (int)191);
                if (!var14_2) ** GOTO lbl432
                throw null;
            }
            case 112: {
                var13_3 /* !! */  = (int)js.jjfn("jjno", jjfk(int ), (int)192);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl822
            }
lbl763:
            // 2 sources

            case 113: {
                var13_3 /* !! */  = (int)js.jjfn("jjnp", jjfk(int ), (int)193);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl809
            }
            case 114: {
                var13_3 /* !! */  = (int)js.jjfn("jjnq", jjfk(int ), (int)194);
                if (!var14_2) ** GOTO lbl305
                throw null;
            }
lbl772:
            // 2 sources

            case 115: {
                var13_3 /* !! */  = (int)js.jjfn("jjnr", jjfk(int ), (int)195);
                if (!var14_2) ** GOTO lbl569
                throw null;
            }
            case 116: {
                var13_3 /* !! */  = (int)js.jjfn("jjns", jjfk(int ), (int)196);
                if (!var14_2) ** GOTO lbl457
                throw null;
            }
lbl780:
            // 2 sources

            case 117: {
                var13_3 /* !! */  = (int)js.jjfn("jjnt", jjfk(int ), (int)197);
                if (!var14_2) ** GOTO lbl320
                throw null;
            }
lbl784:
            // 2 sources

            case 118: {
                var13_3 /* !! */  = (int)js.jjfn("jjnu", jjfk(int ), (int)198);
                if (!var14_2) ** GOTO lbl710
                throw null;
            }
lbl788:
            // 3 sources

            case 119: {
                var13_3 /* !! */  = (int)js.jjfn("jjnv", jjfk(int ), (int)199);
                if (!var14_2) ** GOTO lbl619
                throw null;
            }
            case 120: {
                var13_3 /* !! */  = (int)js.jjfn("jjnw", jjfk(int ), (int)200);
                if (!var14_2) ** GOTO lbl698
                throw null;
            }
lbl796:
            // 2 sources

            case 121: {
                var13_3 /* !! */  = (int)js.jjfn("jjnx", jjfk(int ), (int)201);
                if (!var14_2) ** GOTO lbl740
                throw null;
            }
            case 122: {
                var13_3 /* !! */  = (int)js.jjfn("jjny", jjfk(int ), (int)202);
                if (!var14_2) ** GOTO lbl611
                throw null;
            }
lbl804:
            // 5 sources

            case 123: {
                var13_3 /* !! */  = (int)js.jjfn("jjnz", jjfk(int ), (int)203);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl925
            }
lbl809:
            // 3 sources

            case 124: {
                var13_3 /* !! */  = (int)js.jjfn("jjoa", jjfk(int ), (int)204);
                if (!var14_2) ** GOTO lbl281
                throw null;
            }
lbl813:
            // 2 sources

            case 125: {
                var13_3 /* !! */  = (int)js.jjfn("jjob", jjfk(int ), (int)205);
                if (!var14_2) ** GOTO lbl495
                throw null;
            }
            case 126: {
                var13_3 /* !! */  = (int)js.jjfn("jjoc", jjfk(int ), (int)206);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl891
            }
lbl822:
            // 3 sources

            case 127: {
                var13_3 /* !! */  = (int)js.jjfn("jjod", jjfk(int ), (int)207);
                if (!var14_2) ** GOTO lbl710
                throw null;
            }
            case 128: {
                var13_3 /* !! */  = (int)js.jjfn("jjoe", jjfk(int ), (int)208);
                if (!var14_2) ** GOTO lbl414
                throw null;
            }
            case 129: {
                var13_3 /* !! */  = (int)js.jjfn("jjof", jjfk(int ), (int)209);
                if (!var14_2) ** GOTO lbl627
                throw null;
            }
            case 130: {
                var13_3 /* !! */  = (int)js.jjfn("jjog", jjfk(int ), (int)210);
                if (!var14_2) ** GOTO lbl646
                throw null;
            }
lbl838:
            // 3 sources

            case 131: {
                var13_3 /* !! */  = (int)js.jjfn("jjoh", jjfk(int ), (int)211);
                if (!var14_2) ** GOTO lbl457
                throw null;
            }
            case 132: {
                var13_3 /* !! */  = (int)js.jjfn("jjoi", jjfk(int ), (int)212);
                if (!var14_2) ** GOTO lbl623
                throw null;
            }
            case 133: {
                var13_3 /* !! */  = (int)js.jjfn("jjoj", jjfk(int ), (int)213);
                if (!var14_2) ** GOTO lbl490
                throw null;
            }
            case 134: {
                var13_3 /* !! */  = (int)js.jjfn("jjok", jjfk(int ), (int)214);
                if (!var14_2) ** GOTO lbl723
                throw null;
            }
lbl854:
            // 2 sources

            case 135: {
                var13_3 /* !! */  = (int)js.jjfn("jjol", jjfk(int ), (int)215);
                if (!var14_2) ** GOTO lbl632
                throw null;
            }
            case 136: {
                var13_3 /* !! */  = (int)js.jjfn("jjom", jjfk(int ), (int)216);
                if (!var14_2) ** GOTO lbl854
                throw null;
            }
lbl862:
            // 2 sources

            case 137: {
                var13_3 /* !! */  = (int)js.jjfn("jjon", jjfk(int ), (int)217);
                if (!var14_2) ** GOTO lbl796
                throw null;
            }
lbl866:
            // 2 sources

            case 138: {
                var13_3 /* !! */  = (int)js.jjfn("jjoo", jjfk(int ), (int)218);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl921
            }
lbl871:
            // 2 sources

            case 139: {
                var13_3 /* !! */  = (int)js.jjfn("jjop", jjfk(int ), (int)219);
                if (!var14_2) ** GOTO lbl655
                throw null;
            }
lbl875:
            // 3 sources

            case 140: {
                var13_3 /* !! */  = (int)js.jjfn("jjoq", jjfk(int ), (int)220);
                if (!var14_2) ** GOTO lbl350
                throw null;
            }
lbl879:
            // 2 sources

            case 141: {
                var13_3 /* !! */  = (int)js.jjfn("jjor", jjfk(int ), (int)221);
                if (!var14_2) ** GOTO lbl447
                throw null;
            }
            case 142: {
                var13_3 /* !! */  = (int)js.jjfn("jjos", jjfk(int ), (int)222);
                if (!var14_2) ** GOTO lbl780
                throw null;
            }
            case 143: {
                var13_3 /* !! */  = (int)js.jjfn("jjot", jjfk(int ), (int)223);
                if (!var14_2) ** GOTO lbl345
                throw null;
            }
lbl891:
            // 6 sources

            case 144: {
                var13_3 /* !! */  = (int)js.jjfn("jjou", jjfk(int ), (int)224);
                if (!var14_2) ** GOTO lbl335
                throw null;
            }
            case 145: {
                var13_3 /* !! */  = (int)js.jjfn("jjov", jjfk(int ), (int)225);
                if (!var14_2) ** GOTO lbl266
                throw null;
            }
lbl899:
            // 2 sources

            case 146: {
                var13_3 /* !! */  = (int)js.jjfn("jjow", jjfk(int ), (int)226);
                if (!var14_2) ** GOTO lbl404
                throw null;
            }
            case 147: {
                var13_3 /* !! */  = (int)js.jjfn("jjox", jjfk(int ), (int)227);
                if (!var14_2) ** GOTO lbl689
                throw null;
            }
lbl907:
            // 2 sources

            case 148: {
                var13_3 /* !! */  = (int)js.jjfn("jjoy", jjfk(int ), (int)228);
                if (!var14_2) ** GOTO lbl899
                throw null;
            }
lbl911:
            // 2 sources

            case 149: {
                do {
                    var13_3 /* !! */  = (int)js.jjfn("jjoz", jjfk(int ), (int)229);
                } while (!var14_2);
                throw null;
            }
lbl916:
            // 3 sources

            case 150: {
                var13_3 /* !! */  = (int)js.jjfn("jjpa", jjfk(int ), (int)230);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl925
            }
lbl921:
            // 2 sources

            case 151: {
                var13_3 /* !! */  = (int)js.jjfn("jjpb", jjfk(int ), (int)231);
                if (!var14_2) ** GOTO lbl301
                throw null;
            }
lbl925:
            // 4 sources

            case 152: {
                var13_3 /* !! */  = (int)js.jjfn("jjpc", jjfk(int ), (int)232);
                if (!var14_2) ** GOTO lbl573
                throw null;
            }
            case 153: 
        }
        var13_3 /* !! */  = (int)js.jjfn("jjpd", jjfk(int ), (int)233);
        ** while (!var14_2)
lbl932:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jmza() {
        js.jjfm[100] = 229088544;
        js.jjfm[101] = 883768034;
        js.jjfm[102] = 1275638517;
        js.jjfm[103] = -1177784377;
        js.jjfm[104] = -592423709;
        js.jjfm[105] = -484530857;
        js.jjfm[106] = -1519176936;
        js.jjfm[107] = -1067116808;
        js.jjfm[108] = 365674418;
        js.jjfm[109] = 1949228366;
        js.jjfm[110] = -1380849325;
        js.jjfm[111] = -1254188445;
        js.jjfm[112] = -925082746;
        js.jjfm[113] = -641473065;
        js.jjfm[114] = -1159476261;
        js.jjfm[115] = -1831970354;
        js.jjfm[116] = -973293343;
        js.jjfm[117] = -41205076;
        js.jjfm[118] = -2110216076;
        js.jjfm[119] = -2353429;
        js.jjfm[120] = -961317650;
        js.jjfm[121] = -804793981;
        js.jjfm[122] = 596124986;
        js.jjfm[123] = -1775411000;
        js.jjfm[124] = 778711526;
        js.jjfm[125] = -762092380;
        js.jjfm[126] = 894536093;
        js.jjfm[127] = -1799896436;
        js.jjfm[128] = 632369588;
        js.jjfm[129] = 927396538;
        js.jjfm[130] = -452947028;
        js.jjfm[131] = 121284960;
        js.jjfm[132] = 1347385051;
        js.jjfm[133] = -308973587;
        js.jjfm[134] = -363602537;
        js.jjfm[135] = 1975334314;
        js.jjfm[136] = -2084991081;
        js.jjfm[137] = -1970101201;
        js.jjfm[138] = 2139461486;
        js.jjfm[139] = 1568369536;
        js.jjfm[140] = -1601736894;
        js.jjfm[141] = -509570347;
        js.jjfm[142] = 0x29F992F;
        js.jjfm[143] = 2106685019;
        js.jjfm[144] = -1742472711;
        js.jjfm[145] = 450053994;
        js.jjfm[146] = -747630338;
        js.jjfm[147] = -882183158;
        js.jjfm[148] = 779560575;
        js.jjfm[149] = -117171264;
        js.jjfm[150] = 1831096758;
        js.jjfm[151] = 1223129834;
        js.jjfm[152] = -940189088;
        js.jjfm[153] = -7681209;
        js.jjfm[154] = 1726186912;
        js.jjfm[155] = 126144340;
        js.jjfm[156] = -1919884199;
        js.jjfm[157] = 2353057;
        js.jjfm[158] = -1139062399;
        js.jjfm[159] = 603094101;
        js.jjfm[160] = 61782263;
        js.jjfm[161] = -504266123;
        js.jjfm[162] = -2016644135;
        js.jjfm[163] = 729400228;
        js.jjfm[164] = 1710347645;
        js.jjfm[165] = -738451326;
        js.jjfm[166] = -834237334;
        js.jjfm[167] = 333453520;
        js.jjfm[168] = 1497885962;
        js.jjfm[169] = -1788392969;
        js.jjfm[170] = 1520744438;
        js.jjfm[171] = 370777017;
        js.jjfm[172] = -555990021;
        js.jjfm[173] = -1662104574;
        js.jjfm[174] = 1900485709;
        js.jjfm[175] = 1736721984;
        js.jjfm[176] = -1756766835;
        js.jjfm[177] = 359858087;
        js.jjfm[178] = -1028652922;
        js.jjfm[179] = 62636354;
        js.jjfm[180] = -334471225;
        js.jjfm[181] = 1471261138;
        js.jjfm[182] = -1025757812;
        js.jjfm[183] = -1247734591;
        js.jjfm[184] = 1478021526;
        js.jjfm[185] = -1899345746;
        js.jjfm[186] = 883053276;
        js.jjfm[187] = 3188580;
        js.jjfm[188] = -448424135;
        js.jjfm[189] = -276766153;
        js.jjfm[190] = 1058894732;
        js.jjfm[191] = -764133087;
        js.jjfm[192] = -824487713;
        js.jjfm[193] = -1910790130;
        js.jjfm[194] = -253583474;
        js.jjfm[195] = 1820722488;
        js.jjfm[196] = -1253671027;
        js.jjfm[197] = -1243675509;
        js.jjfm[198] = 1510112566;
        js.jjfm[199] = 292853602;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderRing(class_1309 var1_1, class_243 var2_2, int var3_3) {
        block131: {
            block130: {
                block129: {
                    block128: {
                        block127: {
                            block126: {
                                var23_4 = js.c;
                                var22_5 /* !! */  = js.b;
                                var21_6 = js.a;
                                if (var23_4) {
                                    throw null;
lbl6:
                                    // 30 sources

                                    return;
                                }
                                if (var21_6 || var21_6) ** GOTO lbl6
                                var4_7 = js.jjfn("jjse", jjsd(int ), (int)26) / (double)this.ringSpeed.getValue();
                                if (var21_6 || var21_6) ** GOTO lbl6
                                var6_8 = System.currentTimeMillis() % (long)var4_7;
                                if (var21_6 || var21_6) ** GOTO lbl6
                                if (!(var6_8 > var4_7 / js.jjfn("jjsf", jjsd(int ), (int)27))) break block126;
                                if (var21_6) ** GOTO lbl6
                                v0 = js.jjfn("jjsg", jjfk(int ), (int)297);
                                if (var23_4) {
                                    throw null;
                                }
                                break block127;
                            }
                            if (var21_6 || var21_6) ** GOTO lbl6
                            v0 = var8_9 = js.jjfn("jjsh", jjfk(int ), (int)298);
                        }
                        if (var21_6 || var21_6) ** GOTO lbl6
                        var9_10 /* !! */  = var6_8 / (var4_7 / js.jjfn("jjsi", jjsd(int ), (int)28));
                        if (var21_6 || var21_6) ** GOTO lbl6
                        if (var8_9 == false) break block128;
                        if (var21_6) ** GOTO lbl6
                        v1 /* !! */  = var9_10 /* !! */  - 1.0;
                        if (var23_4) {
                            throw null;
                        }
                        break block129;
                    }
                    if (var21_6 || var21_6) ** GOTO lbl6
                    v1 /* !! */  = var9_10 /* !! */  = 1.0 - var9_10 /* !! */ ;
                }
                if (var21_6 || var21_6) ** GOTO lbl6
                if (!(var9_10 /* !! */  < js.jjfn("jjsj", jjsd(int ), (int)29))) break block130;
                if (var21_6) ** GOTO lbl6
                v2 /* !! */  = js.jjfn("jjsk", jjsd(int ), (int)30) * var9_10 /* !! */  * var9_10 /* !! */ ;
                if (var23_4) {
                    throw null;
                }
                break block131;
            }
            if (var21_6 || var21_6) ** GOTO lbl6
            v2 /* !! */  = (reference)(1.0 - Math.pow((double)(js.jjfn("jjsl", jjsd(int ), (int)31) * var9_10 /* !! */  + js.jjfn("jjsm", jjsd(int ), (int)32)), (double)js.jjfn("jjsn", jjsd(int ), (int)33)) / js.jjfn("jjso", jjsd(int ), (int)34));
        }
        var9_10 /* !! */  = (double)v2 /* !! */ ;
        if (var21_6) ** GOTO lbl6
        if (var22_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_6) ** GOTO lbl6
                v3 = (double)var1_1.method_17682() * js.jjfn("jjsp", jjsd(int ), (int)35);
                if (var9_10 /* !! */  > js.jjfn("jjsq", jjsd(int ), (int)36)) {
                    v4 = 1.0 - var9_10 /* !! */ ;
                    if (var23_4) {
                        throw null;
                    }
                } else {
                    v4 = var9_10 /* !! */ ;
                }
                v5 = v3 * v4;
                if (var8_9 != false) {
                    v6 /* !! */  = (double)js.jjfn("jjsr", jjsd(int ), (int)37);
                    if (var23_4) {
                        throw null;
                    }
                } else {
                    v6 /* !! */  = 1.0;
                }
                var11_11 = v5 * v6 /* !! */ ;
                if (var21_6 || var21_6) ** GOTO lbl6
                var13_12 = var2_2.field_1351 + (double)var1_1.method_17682() * var9_10 /* !! */ ;
                if (var21_6 || var21_6) ** GOTO lbl6
                var15_13 = var1_1.method_17681() * js.jjfn("jjss", jjfp(int ), (int)299) * this.ringSize.getValue();
                if (var21_6 || var21_6) ** GOTO lbl6
                var16_14 = Math.max((float)js.jjfn("jjst", jjfp(int ), (int)300), var15_13 * js.jjfn("jjsu", jjfp(int ), (int)301)) * this.ringThickness.getValue();
                if (var21_6 || var21_6) ** GOTO lbl6
                var17_15 = this.ringBright.getValue();
                if (var21_6 || var21_6) ** GOTO lbl6
                lx.begin((boolean)js.jjfn("jjsv", jjfk(int ), (int)302));
                if (var21_6 || var21_6) ** GOTO lbl6
                lx.ring(var2_2.field_1352, var13_12, var2_2.field_1350, var15_13, var16_14, var3_3, this.appearance * var17_15);
                if (var21_6 || var21_6) ** GOTO lbl6
                var18_16 = js.jjfn("jjsw", jjfk(int ), (int)303);
                if (var21_6 || var21_6) ** GOTO lbl6
                var19_17 = js.jjfn("jjsx", jjfk(int ), (int)304);
                if (var21_6) ** GOTO lbl6
                do {
                    if (var21_6 || var21_6) ** GOTO lbl6
                    if (var19_17 > var18_16) ** GOTO lbl97
                    if (var21_6 || var21_6) ** GOTO lbl6
                    var20_18 = (float)var19_17 / (float)var18_16;
                    if (var21_6 || var21_6) ** GOTO lbl6
                    lx.ring(var2_2.field_1352, var13_12 + var11_11 * (double)var20_18, var2_2.field_1350, var15_13, var16_14, var3_3, this.appearance * var17_15 * js.jjfn("jjsy", jjfp(int ), (int)305) * (1.0f - var20_18));
                    if (var21_6 || var21_6) ** GOTO lbl6
                    ++var19_17;
                    if (var21_6) ** GOTO lbl6
                } while (!var23_4);
                throw null;
lbl97:
                // 1 sources

                if (var21_6 || var21_6) ** GOTO lbl6
                lx.end();
                if (!var21_6 && !var21_6) ** break;
                ** continue;
                return;
            }
lbl102:
            // 2 sources

            case 0: {
                var22_5 /* !! */  = (int)js.jjfn("jjsz", jjfk(int ), (int)306);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 1: {
                var22_5 /* !! */  = (int)js.jjfn("jjta", jjfk(int ), (int)307);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 2: {
                var22_5 /* !! */  = (int)js.jjfn("jjtb", jjfk(int ), (int)308);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl117:
            // 2 sources

            case 3: {
                var22_5 /* !! */  = (int)js.jjfn("jjtc", jjfk(int ), (int)309);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_5 /* !! */  = (int)js.jjfn("jjtd", jjfk(int ), (int)310);
                    if (var23_4) {
                        throw null;
                    }
                    ** GOTO lbl293
                    break;
                }
            }
lbl128:
            // 2 sources

            case 5: {
                var22_5 /* !! */  = (int)js.jjfn("jjte", jjfk(int ), (int)311);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl133:
            // 2 sources

            case 6: {
                var22_5 /* !! */  = (int)js.jjfn("jjtf", jjfk(int ), (int)312);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl138:
            // 2 sources

            case 7: {
                var22_5 /* !! */  = (int)js.jjfn("jjtg", jjfk(int ), (int)313);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 8: {
                var22_5 /* !! */  = (int)js.jjfn("jjth", jjfk(int ), (int)314);
                if (!var23_4) ** GOTO lbl102
                throw null;
            }
            case 9: {
                var22_5 /* !! */  = (int)js.jjfn("jjti", jjfk(int ), (int)315);
                if (!var23_4) ** GOTO lbl128
                throw null;
            }
lbl151:
            // 2 sources

            case 10: {
                var22_5 /* !! */  = (int)js.jjfn("jjtj", jjfk(int ), (int)316);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl156:
            // 3 sources

            case 11: {
                var22_5 /* !! */  = (int)js.jjfn("jjtk", jjfk(int ), (int)317);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl161:
            // 2 sources

            case 12: {
                var22_5 /* !! */  = (int)js.jjfn("jjtl", jjfk(int ), (int)318);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 13: {
                var22_5 /* !! */  = (int)js.jjfn("jjtm", jjfk(int ), (int)319);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl171:
            // 2 sources

            case 14: {
                var22_5 /* !! */  = (int)js.jjfn("jjtn", jjfk(int ), (int)320);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl176:
            // 2 sources

            case 15: {
                var22_5 /* !! */  = (int)js.jjfn("jjto", jjfk(int ), (int)321);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 16: {
                var22_5 /* !! */  = (int)js.jjfn("jjtp", jjfk(int ), (int)322);
                if (!var23_4) ** GOTO lbl138
                throw null;
            }
lbl185:
            // 2 sources

            case 17: {
                var22_5 /* !! */  = (int)js.jjfn("jjtq", jjfk(int ), (int)323);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl190:
            // 2 sources

            case 18: {
                var22_5 /* !! */  = (int)js.jjfn("jjtr", jjfk(int ), (int)324);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 19: {
                var22_5 /* !! */  = (int)js.jjfn("jjts", jjfk(int ), (int)325);
                if (!var23_4) ** GOTO lbl161
                throw null;
            }
lbl199:
            // 2 sources

            case 20: {
                var22_5 /* !! */  = (int)js.jjfn("jjtt", jjfk(int ), (int)326);
                if (!var23_4) ** GOTO lbl171
                throw null;
            }
lbl203:
            // 2 sources

            case 21: {
                var22_5 /* !! */  = (int)js.jjfn("jjtu", jjfk(int ), (int)327);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl208:
            // 2 sources

            case 22: {
                var22_5 /* !! */  = (int)js.jjfn("jjtv", jjfk(int ), (int)328);
                if (var23_4) {
                    throw null;
                }
            }
lbl212:
            // 5 sources

            case 23: {
                var22_5 /* !! */  = (int)js.jjfn("jjtw", jjfk(int ), (int)329);
                if (!var23_4) ** GOTO lbl203
                throw null;
            }
lbl216:
            // 3 sources

            case 24: {
                var22_5 /* !! */  = (int)js.jjfn("jjtx", jjfk(int ), (int)330);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 25: {
                var22_5 /* !! */  = (int)js.jjfn("jjty", jjfk(int ), (int)331);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl226:
            // 4 sources

            case 26: {
                var22_5 /* !! */  = (int)js.jjfn("jjtz", jjfk(int ), (int)332);
                if (!var23_4) ** GOTO lbl156
                throw null;
            }
            case 27: {
                var22_5 /* !! */  = (int)js.jjfn("jjua", jjfk(int ), (int)333);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl235:
            // 2 sources

            case 28: {
                var22_5 /* !! */  = (int)js.jjfn("jjub", jjfk(int ), (int)334);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 29: {
                var22_5 /* !! */  = (int)js.jjfn("jjuc", jjfk(int ), (int)335);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl245:
            // 3 sources

            case 30: {
                var22_5 /* !! */  = (int)js.jjfn("jjud", jjfk(int ), (int)336);
                if (var23_4) {
                    throw null;
                }
            }
lbl249:
            // 6 sources

            case 31: {
                var22_5 /* !! */  = (int)js.jjfn("jjue", jjfk(int ), (int)337);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl254:
            // 2 sources

            case 32: {
                var22_5 /* !! */  = (int)js.jjfn("jjuf", jjfk(int ), (int)338);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 33: {
                var22_5 /* !! */  = (int)js.jjfn("jjug", jjfk(int ), (int)339);
                if (!var23_4) ** GOTO lbl156
                throw null;
            }
lbl263:
            // 2 sources

            case 34: {
                var22_5 /* !! */  = (int)js.jjfn("jjuh", jjfk(int ), (int)340);
                if (!var23_4) ** GOTO lbl245
                throw null;
            }
lbl267:
            // 2 sources

            case 35: {
                var22_5 /* !! */  = (int)js.jjfn("jjui", jjfk(int ), (int)341);
                if (!var23_4) ** GOTO lbl199
                throw null;
            }
lbl271:
            // 2 sources

            case 36: {
                var22_5 /* !! */  = (int)js.jjfn("jjuj", jjfk(int ), (int)342);
                if (!var23_4) ** GOTO lbl216
                throw null;
            }
            case 37: {
                var22_5 /* !! */  = (int)js.jjfn("jjuk", jjfk(int ), (int)343);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 38: {
                var22_5 /* !! */  = (int)js.jjfn("jjul", jjfk(int ), (int)344);
                if (!var23_4) break;
                throw null;
            }
lbl284:
            // 2 sources

            case 39: {
                var22_5 /* !! */  = (int)js.jjfn("jjum", jjfk(int ), (int)345);
                if (!var23_4) ** GOTO lbl263
                throw null;
            }
lbl288:
            // 4 sources

            case 40: {
                var22_5 /* !! */  = (int)js.jjfn("jjun", jjfk(int ), (int)346);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl293:
            // 3 sources

            case 41: {
                var22_5 /* !! */  = (int)js.jjfn("jjuo", jjfk(int ), (int)347);
                if (!var23_4) ** GOTO lbl176
                throw null;
            }
            case 42: {
                var22_5 /* !! */  = (int)js.jjfn("jjup", jjfk(int ), (int)348);
                if (!var23_4) ** GOTO lbl212
                throw null;
            }
lbl301:
            // 2 sources

            case 43: {
                do {
                    var22_5 /* !! */  = (int)js.jjfn("jjuq", jjfk(int ), (int)349);
                } while (!var23_4);
                throw null;
            }
lbl306:
            // 3 sources

            case 44: {
                var22_5 /* !! */  = (int)js.jjfn("jjur", jjfk(int ), (int)350);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl311:
            // 2 sources

            case 45: {
                do {
                    var22_5 /* !! */  = (int)js.jjfn("jjus", jjfk(int ), (int)351);
                } while (!var23_4);
                throw null;
            }
lbl316:
            // 2 sources

            case 46: {
                var22_5 /* !! */  = (int)js.jjfn("jjut", jjfk(int ), (int)352);
                if (!var23_4) ** GOTO lbl151
                throw null;
            }
            case 47: {
                var22_5 /* !! */  = (int)js.jjfn("jjuu", jjfk(int ), (int)353);
                if (!var23_4) ** GOTO lbl226
                throw null;
            }
            case 48: {
                var22_5 /* !! */  = (int)js.jjfn("jjuv", jjfk(int ), (int)354);
                if (!var23_4) ** GOTO lbl293
                throw null;
            }
lbl328:
            // 2 sources

            case 49: {
                var22_5 /* !! */  = (int)js.jjfn("jjuw", jjfk(int ), (int)355);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl350
            }
            case 50: {
                var22_5 /* !! */  = (int)js.jjfn("jjux", jjfk(int ), (int)356);
                if (var23_4) {
                    throw null;
                }
                ** GOTO lbl342
            }
            case 51: {
                var22_5 /* !! */  = (int)js.jjfn("jjuy", jjfk(int ), (int)357);
                if (!var23_4) ** GOTO lbl117
                throw null;
            }
lbl342:
            // 2 sources

            case 52: {
                var22_5 /* !! */  = (int)js.jjfn("jjuz", jjfk(int ), (int)358);
                if (!var23_4) ** GOTO lbl133
                throw null;
            }
lbl346:
            // 2 sources

            case 53: {
                var22_5 /* !! */  = (int)js.jjfn("jjva", jjfk(int ), (int)359);
                if (!var23_4) ** GOTO lbl288
                throw null;
            }
lbl350:
            // 4 sources

            case 54: {
                var22_5 /* !! */  = (int)js.jjfn("jjvb", jjfk(int ), (int)360);
                if (!var23_4) ** GOTO lbl346
                throw null;
            }
lbl354:
            // 2 sources

            case 55: {
                var22_5 /* !! */  = (int)js.jjfn("jjvc", jjfk(int ), (int)361);
                if (!var23_4) ** GOTO lbl267
                throw null;
            }
            case 56: 
        }
        var22_5 /* !! */  = (int)js.jjfn("jjvd", jjfk(int ), (int)362);
        ** while (!var23_4)
lbl361:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public js() {
        var2_1 /* !! */  = js.b;
        super("TargetESP", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0442\u0435\u043a\u0443\u0449\u0443\u044e \u0446\u0435\u043b\u044c KillAura \u0438\u043b\u0438 AimBot", du.RENDER);
        this.mode = new kf("\u0412\u0438\u0434", "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0439 \u044d\u0444\u0444\u0435\u043a\u0442 \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u0446\u0435\u043b\u0438", "\u041f\u0440\u0438\u0437\u0440\u0430\u043a\u0438", new String[]{"\u041a\u043e\u043b\u044c\u0446\u043e", "\u0420\u043e\u043c\u0431", "\u0414\u0443\u0448\u0438", "Ghosts", "\u041d\u0435 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c"});
        this.reddenOnHit = new kb("\u041a\u0440\u0430\u0441\u043d\u0435\u0442\u044c \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435", "\u041e\u043a\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u0442 \u044d\u0444\u0444\u0435\u043a\u0442 \u0446\u0435\u043b\u0438 \u0432 \u043a\u0440\u0430\u0441\u043d\u044b\u0439 \u043f\u0440\u0438 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438 \u0443\u0440\u043e\u043d\u0430").setValue((boolean)js.jjfn("jjfo", jjfk(int ), (int)0));
        this.appearOnHover = new kb("\u041f\u043e\u044f\u0432\u043b\u044f\u0442\u044c\u0441\u044f \u043f\u0440\u0438 \u043d\u0430\u0432\u043e\u0434\u043a\u0435", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 TargetESP \u043d\u0430 \u0438\u0433\u0440\u043e\u043a\u0435 \u043f\u043e\u0434 \u043f\u0440\u0438\u0446\u0435\u043b\u043e\u043c \u0435\u0449\u0451 3 \u0441\u0435\u043a\u0443\u043d\u0434\u044b \u043f\u043e\u0441\u043b\u0435 \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u044f");
        this.ghostLength = new kg("\u0414\u043b\u0438\u043d\u0430 \u0434\u0443\u0448", "\u041f\u0440\u043e\u0434\u043e\u043b\u0436\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e\u0433\u043e \u0445\u0432\u043e\u0441\u0442\u0430", 1.0f).range((float)js.jjfn("jjfq", jjfp(int ), (int)1), 2.0f).step((float)js.jjfn("jjfr", jjfp(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((js)this));
        this.ghostWidth = new kg("\u0428\u0438\u0440\u0438\u043d\u0430", "\u0420\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0434\u0443\u0448 \u043e\u0442 \u0446\u0435\u043b\u0438", 1.0f).range((float)js.jjfn("jjfs", jjfp(int ), (int)3), 2.0f).step((float)js.jjfn("jjft", jjfp(int ), (int)4)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((js)this));
        this.soulSize = new kg("\u0420\u0430\u0437\u043c\u0435\u0440 \u0434\u0443\u0448", "\u041c\u0430\u0441\u0448\u0442\u0430\u0431 \u043e\u0433\u043e\u043d\u044c\u043a\u043e\u0432", 1.0f).range((float)js.jjfn("jjfu", jjfp(int ), (int)5), 2.0f).step((float)js.jjfn("jjfv", jjfp(int ), (int)6)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((js)this));
        this.soulLength = new kg("\u0414\u043b\u0438\u043d\u0430 \u0445\u0432\u043e\u0441\u0442\u0430", "\u0414\u043b\u0438\u043d\u0430 \u0448\u043b\u0435\u0439\u0444\u0430 \u0437\u0430 \u0434\u0443\u0448\u043e\u0439", (float)js.jjfn("jjfw", jjfp(int ), (int)7)).range((float)js.jjfn("jjfx", jjfp(int ), (int)8), (float)js.jjfn("jjfy", jjfp(int ), (int)9)).step((float)js.jjfn("jjfz", jjfp(int ), (int)10)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((js)this));
        this.soulSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0434\u0443\u0448", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e\u043b\u0451\u0442\u0430 \u0432\u043e\u043a\u0440\u0443\u0433 \u0446\u0435\u043b\u0438", 1.0f).range((float)js.jjfn("jjga", jjfp(int ), (int)11), (float)js.jjfn("jjgb", jjfp(int ), (int)12)).step((float)js.jjfn("jjgc", jjfp(int ), (int)13)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$4(), ()Ljava/lang/Boolean;)((js)this));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.soulBright = new kg("\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u0434\u0443\u0448", "\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u0441\u0432\u0435\u0447\u0435\u043d\u0438\u044f", 1.0f).range((float)js.jjfn("jjgd", jjfp(int ), (int)14), (float)js.jjfn("jjge", jjfp(int ), (int)15)).step((float)js.jjfn("jjgf", jjfp(int ), (int)16)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$5(), ()Ljava/lang/Boolean;)((js)this));
                this.ringSize = new kg("\u0420\u0430\u0437\u043c\u0435\u0440 \u043a\u043e\u043b\u044c\u0446\u0430", "\u041c\u0430\u0441\u0448\u0442\u0430\u0431 \u0440\u0430\u0434\u0438\u0443\u0441\u0430 \u043a\u043e\u043b\u044c\u0446\u0430", 1.0f).range((float)js.jjfn("jjgg", jjfp(int ), (int)17), 2.0f).step((float)js.jjfn("jjgh", jjfp(int ), (int)18)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$6(), ()Ljava/lang/Boolean;)((js)this));
                this.ringThickness = new kg("\u0422\u043e\u043b\u0449\u0438\u043d\u0430 \u043a\u043e\u043b\u044c\u0446\u0430", "\u0422\u043e\u043b\u0449\u0438\u043d\u0430 \u0441\u0432\u0435\u0442\u044f\u0449\u0435\u0439\u0441\u044f \u0442\u0440\u0443\u0431\u043a\u0438", 1.0f).range((float)js.jjfn("jjgi", jjfp(int ), (int)19), (float)js.jjfn("jjgj", jjfp(int ), (int)20)).step((float)js.jjfn("jjgk", jjfp(int ), (int)21)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$7(), ()Ljava/lang/Boolean;)((js)this));
                this.ringSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043a\u043e\u043b\u044c\u0446\u0430", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u043f\u043e \u0446\u0435\u043b\u0438", 1.0f).range((float)js.jjfn("jjgl", jjfp(int ), (int)22), (float)js.jjfn("jjgm", jjfp(int ), (int)23)).step((float)js.jjfn("jjgn", jjfp(int ), (int)24)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$8(), ()Ljava/lang/Boolean;)((js)this));
                this.ringBright = new kg("\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u043a\u043e\u043b\u044c\u0446\u0430", "\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u0441\u0432\u0435\u0447\u0435\u043d\u0438\u044f \u043a\u043e\u043b\u044c\u0446\u0430", 1.0f).range((float)js.jjfn("jjgo", jjfp(int ), (int)25), (float)js.jjfn("jjgp", jjfp(int ), (int)26)).step((float)js.jjfn("jjgq", jjfp(int ), (int)27)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$9(), ()Ljava/lang/Boolean;)((js)this));
                this.ghostPhase = new double[3];
                this.floatingGhostPosition = new class_243[3];
                v0 = new List[3];
                v0[js.jjfn("jjgr", jjfk(int ), (int)28)] = new ArrayList<E>();
                v0[js.jjfn("jjgs", jjfk(int ), (int)29)] = new ArrayList<E>();
                v0[js.jjfn("jjgt", jjfk(int ), (int)30)] = new ArrayList<E>();
                this.floatingGhostTrails = v0;
                this.floatingGhostTargetId = (int)js.jjfn("jjgu", jjfk(int ), (int)31);
                this.mode.getList().add("\u041c\u043e\u043b\u043d\u0438\u0438");
                this.mode.getList().remove(this.mode.getList().size() - js.jjfn("jjgv", jjfk(int ), (int)32));
                this.settings(new jx[]{this.mode, this.reddenOnHit, this.appearOnHover, this.ghostLength, this.ghostWidth, this.soulSize, this.soulLength, this.soulSpeed, this.soulBright, this.ringSize, this.ringThickness, this.ringSpeed, this.ringBright});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)js.jjfn("jjgw", jjfk(int ), (int)33);
                ** GOTO lbl56
            }
lbl36:
            // 2 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)js.jjfn("jjgx", jjfk(int ), (int)34);
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)js.jjfn("jjgy", jjfk(int ), (int)35);
                    ** GOTO lbl90
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)js.jjfn("jjgz", jjfk(int ), (int)36);
                ** GOTO lbl62
            }
            case 4: {
                var2_1 /* !! */  = (int)js.jjfn("jjha", jjfk(int ), (int)37);
                ** GOTO lbl56
            }
            case 5: {
                var2_1 /* !! */  = (int)js.jjfn("jjhb", jjfk(int ), (int)38);
                break;
            }
            case 6: {
                var2_1 /* !! */  = (int)js.jjfn("jjhc", jjfk(int ), (int)39);
                ** GOTO lbl36
            }
lbl56:
            // 3 sources

            case 7: {
                var2_1 /* !! */  = (int)js.jjfn("jjhd", jjfk(int ), (int)40);
                ** GOTO lbl93
            }
lbl59:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)js.jjfn("jjhe", jjfk(int ), (int)41);
                ** GOTO lbl87
            }
lbl62:
            // 3 sources

            case 9: {
                var2_1 /* !! */  = (int)js.jjfn("jjhf", jjfk(int ), (int)42);
                ** GOTO lbl95
            }
lbl65:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)js.jjfn("jjhg", jjfk(int ), (int)43);
                ** GOTO lbl87
            }
lbl68:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)js.jjfn("jjhh", jjfk(int ), (int)44);
                ** GOTO lbl80
            }
            case 12: {
                var2_1 /* !! */  = (int)js.jjfn("jjhi", jjfk(int ), (int)45);
                ** GOTO lbl95
            }
            case 13: {
                var2_1 /* !! */  = (int)js.jjfn("jjhj", jjfk(int ), (int)46);
                ** GOTO lbl84
            }
            case 14: {
                var2_1 /* !! */  = (int)js.jjfn("jjhk", jjfk(int ), (int)47);
                break;
            }
lbl80:
            // 2 sources

            case 15: {
                while (true) {
                    var2_1 /* !! */  = (int)js.jjfn("jjhl", jjfk(int ), (int)48);
                }
            }
lbl84:
            // 2 sources

            case 16: {
                var2_1 /* !! */  = (int)js.jjfn("jjhm", jjfk(int ), (int)49);
                ** GOTO lbl65
            }
lbl87:
            // 4 sources

            case 17: {
                var2_1 /* !! */  = (int)js.jjfn("jjhn", jjfk(int ), (int)50);
                ** GOTO lbl68
            }
lbl90:
            // 2 sources

            case 18: {
                var2_1 /* !! */  = (int)js.jjfn("jjho", jjfk(int ), (int)51);
                ** GOTO lbl87
            }
lbl93:
            // 2 sources

            case 19: {
                var2_1 /* !! */  = (int)js.jjfn("jjhp", jjfk(int ), (int)52);
            }
lbl95:
            // 4 sources

            case 20: {
                var2_1 /* !! */  = (int)js.jjfn("jjhq", jjfk(int ), (int)53);
                ** GOTO lbl62
            }
            case 21: {
                var2_1 /* !! */  = (int)js.jjfn("jjhr", jjfk(int ), (int)54);
                ** GOTO lbl59
            }
            case 22: 
        }
        var2_1 /* !! */  = (int)js.jjfn("jjhs", jjfk(int ), (int)55);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$6() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmpz", jjht(int ), (int)222)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == js.jjfn("jmqa", jjfk(int ), (int)1031)) break;
            v0 /* !! */  = (long)js.jjfn("jmqb", jjfk(int ), (int)1032);
        }
        var3_1 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmqc", jjht(int ), (int)223)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == js.jjfn("jmqd", jjfk(int ), (int)1033)) break;
            v1 /* !! */  = (long)js.jjfn("jmqe", jjfk(int ), (int)1034);
        }
        var2_2 /* !! */  = js.b;
        v2 /* !! */  = js.rm;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - js.jjfn("jmqf", jjht(int ), (int)224));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1086939660: {
                    v3 = js.jjfn("jmqg", jjht(int ), (int)225);
                    continue block14;
                }
                case 458795960: {
                    break block14;
                }
                case 1016687028: {
                    v3 = js.jjfn("jmqh", jjht(int ), (int)226);
                    continue block14;
                }
                case 1886548701: {
                    v3 = js.jjfn("jmqi", jjht(int ), (int)227);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = js.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmqj", jjht(int ), (int)228)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == js.jjfn("jmqk", jjfk(int ), (int)1035)) break;
                    v4 /* !! */  = (long)js.jjfn("jmql", jjfk(int ), (int)1036);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jmqm", jjht(int ), (int)229)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == js.jjfn("jmqn", jjfk(int ), (int)1037)) break;
                    v5 /* !! */  = (long)js.jjfn("jmqo", jjfk(int ), (int)1038);
                }
                v6 = this.mode.isSelected("\u041a\u043e\u043b\u044c\u0446\u043e");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = js.rm - js.jjfn("jmqp", jjht(int ), (int)230)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == js.jjfn("jmqq", jjfk(int ), (int)1039)) break;
                    v7 /* !! */  = (long)js.jjfn("jmqr", jjfk(int ), (int)1040);
                }
                return v6;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)js.jjfn("jmqs", jjfk(int ), (int)1041);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)js.jjfn("jmqt", jjfk(int ), (int)1042);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)js.jjfn("jmqu", jjfk(int ), (int)1043);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)js.jjfn("jmqv", jjfk(int ), (int)1044);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int hurtColor(int var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = js.rm - js.jjfn("jmlz", jjht(int ), (int)169)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == js.jjfn("jmma", jjfk(int ), (int)980)) break;
            v0 /* !! */  = (long)js.jjfn("jmmb", jjfk(int ), (int)981);
        }
        var4_2 = js.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = js.rm - js.jjfn("jmmc", jjht(int ), (int)170)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == js.jjfn("jmmd", jjfk(int ), (int)982)) break;
            v1 /* !! */  = (long)js.jjfn("jmme", jjfk(int ), (int)983);
        }
        var3_3 /* !! */  = js.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = js.rm - js.jjfn("jmmf", jjht(int ), (int)171)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == js.jjfn("jmmg", jjfk(int ), (int)984)) break;
            v2 /* !! */  = (long)js.jjfn("jmmh", jjfk(int ), (int)985);
        }
        var2_4 = js.a;
        if (var4_2) {
            throw null;
lbl21:
            // 1 sources

            return (int)js.jjfn("jmmi", jjfk(int ), (int)986);
        }
        ** while (var2_4 || var2_4)
lbl24:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = js.rm;
                if (true) ** GOTO lbl31
                block31: while (true) {
                    v3 /* !! */  = (long)(v4 - js.jjfn("jmmj", jjht(int ), (int)172));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -736357564: {
                            v4 = js.jjfn("jmmk", jjht(int ), (int)173);
                            continue block31;
                        }
                        case 265023598: {
                            v4 = js.jjfn("jmml", jjht(int ), (int)174);
                            continue block31;
                        }
                        case 458795960: {
                            break block31;
                        }
                    }
                    break;
                }
                v5 = nd.red(var0);
                v6 = js.jjfn("jmmm", jjfk(int ), (int)987);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = js.rm - js.jjfn("jmmn", jjht(int ), (int)175)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == js.jjfn("jmmo", jjfk(int ), (int)988)) break;
                    v7 /* !! */  = (long)js.jjfn("jmmp", jjfk(int ), (int)989);
                }
                v8 = class_3532.method_48781((float)var1_1, (int)v5, (int)v6);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = js.rm - js.jjfn("jmmq", jjht(int ), (int)176)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == js.jjfn("jmmr", jjfk(int ), (int)990)) break;
                    v9 /* !! */  = (long)js.jjfn("jmms", jjfk(int ), (int)991);
                }
                v10 = nd.green(var0);
                v11 = js.jjfn("jmmt", jjfk(int ), (int)992);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = js.rm - js.jjfn("jmmu", jjht(int ), (int)177)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == js.jjfn("jmmv", jjfk(int ), (int)993)) break;
                    v12 /* !! */  = (long)js.jjfn("jmmw", jjfk(int ), (int)994);
                }
                v13 = class_3532.method_48781((float)var1_1, (int)v10, (int)v11);
                v14 /* !! */  = js.rm;
                if (true) ** GOTO lbl65
                block35: while (true) {
                    v14 /* !! */  = (long)(js.jjfn("jmmy", jjht(int ), (int)179) - js.jjfn("jmmx", jjht(int ), (int)178));
lbl65:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1262426829: {
                            continue block35;
                        }
                        case 458795960: {
                            break block35;
                        }
                    }
                    break;
                }
                v15 = nd.blue(var0);
                v16 = js.jjfn("jmmz", jjfk(int ), (int)995);
                v17 /* !! */  = js.rm;
                if (true) ** GOTO lbl76
                block36: while (true) {
                    v17 /* !! */  = (long)(v18 - js.jjfn("jmna", jjht(int ), (int)180));
lbl76:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -821655750: {
                            v18 = js.jjfn("jmnb", jjht(int ), (int)181);
                            continue block36;
                        }
                        case -105595705: {
                            v18 = js.jjfn("jmnc", jjht(int ), (int)182);
                            continue block36;
                        }
                        case 458795960: {
                            break block36;
                        }
                        case 1877156652: {
                            v18 = js.jjfn("jmnd", jjht(int ), (int)183);
                            continue block36;
                        }
                    }
                    break;
                }
                v19 = class_3532.method_48781((float)var1_1, (int)v15, (int)v16);
                v20 = js.jjfn("jmne", jjfk(int ), (int)996);
                v21 /* !! */  = js.rm;
                if (true) ** GOTO lbl94
                block37: while (true) {
                    v21 /* !! */  = (long)(v22 - js.jjfn("jmnf", jjht(int ), (int)184));
lbl94:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -300997843: {
                            v22 = js.jjfn("jmng", jjht(int ), (int)185);
                            continue block37;
                        }
                        case 458795960: {
                            break block37;
                        }
                        case 1242942534: {
                            v22 = js.jjfn("jmnh", jjht(int ), (int)186);
                            continue block37;
                        }
                        case 2082940662: {
                            v22 = js.jjfn("jmni", jjht(int ), (int)187);
                            continue block37;
                        }
                    }
                    break;
                }
                return nd.getColor(v8, v13, v19, (int)v20);
            }
            case 0: {
                var3_3 /* !! */  = (int)js.jjfn("jmnj", jjfk(int ), (int)997);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)js.jjfn("jmnk", jjfk(int ), (int)998);
                } while (!var4_2);
                throw null;
            }
lbl117:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)js.jjfn("jmnl", jjfk(int ), (int)999);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)js.jjfn("jmnm", jjfk(int ), (int)1000);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void jmzd() {
        js.jjfm[400] = 472689168;
        js.jjfm[401] = -33408112;
        js.jjfm[402] = 996591603;
        js.jjfm[403] = -1983513631;
        js.jjfm[404] = -2121035726;
        js.jjfm[405] = -1936430199;
        js.jjfm[406] = -1076457928;
        js.jjfm[407] = 762343118;
        js.jjfm[408] = -625861143;
        js.jjfm[409] = 2092412235;
        js.jjfm[410] = 848315337;
        js.jjfm[411] = 475435943;
        js.jjfm[412] = -1359638843;
        js.jjfm[413] = 767897519;
        js.jjfm[414] = -1955807633;
        js.jjfm[415] = -18388795;
        js.jjfm[416] = -480596525;
        js.jjfm[417] = 1134294759;
        js.jjfm[418] = 1499963984;
        js.jjfm[419] = -1184122879;
        js.jjfm[420] = 516252870;
        js.jjfm[421] = 500542214;
        js.jjfm[422] = -1696231245;
        js.jjfm[423] = -863257126;
        js.jjfm[424] = -127195089;
        js.jjfm[425] = 202109215;
        js.jjfm[426] = -265230308;
        js.jjfm[427] = 297211461;
        js.jjfm[428] = -253332543;
        js.jjfm[429] = -587364574;
        js.jjfm[430] = -42859904;
        js.jjfm[431] = 594109018;
        js.jjfm[432] = -1034569372;
        js.jjfm[433] = -596091015;
        js.jjfm[434] = 1604758804;
        js.jjfm[435] = -1352471173;
        js.jjfm[436] = 1796199750;
        js.jjfm[437] = -1415018117;
        js.jjfm[438] = 1531333677;
        js.jjfm[439] = -1609672740;
        js.jjfm[440] = -733100970;
        js.jjfm[441] = 1911766551;
        js.jjfm[442] = -2036110958;
        js.jjfm[443] = 1989990614;
        js.jjfm[444] = 1769559518;
        js.jjfm[445] = -820958972;
        js.jjfm[446] = -2048495262;
        js.jjfm[447] = 1957528571;
        js.jjfm[448] = 585469192;
        js.jjfm[449] = 1893500405;
        js.jjfm[450] = 100456756;
        js.jjfm[451] = -1636086934;
        js.jjfm[452] = -957540701;
        js.jjfm[453] = -1278780150;
        js.jjfm[454] = -1674504832;
        js.jjfm[455] = 1698190181;
        js.jjfm[456] = -463743193;
        js.jjfm[457] = 2064945801;
        js.jjfm[458] = -1400766148;
        js.jjfm[459] = 76704544;
        js.jjfm[460] = -472591114;
        js.jjfm[461] = 409320909;
        js.jjfm[462] = 823565258;
        js.jjfm[463] = 835043035;
        js.jjfm[464] = -516554012;
        js.jjfm[465] = -1394934914;
        js.jjfm[466] = -1953152751;
        js.jjfm[467] = -1822419150;
        js.jjfm[468] = 1309650681;
        js.jjfm[469] = -1205784830;
        js.jjfm[470] = 737394664;
        js.jjfm[471] = 405289395;
        js.jjfm[472] = 861772149;
        js.jjfm[473] = 245262130;
        js.jjfm[474] = 835187387;
        js.jjfm[475] = -20824399;
        js.jjfm[476] = 252442643;
        js.jjfm[477] = -1498195376;
        js.jjfm[478] = -2089370008;
        js.jjfm[479] = -1612517289;
        js.jjfm[480] = 296937874;
        js.jjfm[481] = 1090792761;
        js.jjfm[482] = -1810261142;
        js.jjfm[483] = -1888385281;
        js.jjfm[484] = -23650960;
        js.jjfm[485] = 2750934;
        js.jjfm[486] = 64032056;
        js.jjfm[487] = -1088923964;
        js.jjfm[488] = 1000780792;
        js.jjfm[489] = 1683081432;
        js.jjfm[490] = -524506129;
        js.jjfm[491] = 465191509;
        js.jjfm[492] = 353737343;
        js.jjfm[493] = -1771769180;
        js.jjfm[494] = -415783890;
        js.jjfm[495] = -531888372;
        js.jjfm[496] = -1196627991;
        js.jjfm[497] = 2007112586;
        js.jjfm[498] = 813879616;
        js.jjfm[499] = 418231870;
    }

    private static /* synthetic */ double jjsd(int n2) {
        return Double.longBitsToDouble(jjhu[n2] ^ jjhv[n2]);
    }
}

