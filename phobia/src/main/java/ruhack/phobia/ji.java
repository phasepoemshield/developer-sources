/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1684
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2663
 *  net.minecraft.class_2960
 */
package ruhack.phobia;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1684;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.bj;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.gk;
import ruhack.phobia.gk$Palette;
import ruhack.phobia.ji$GlowParticle;
import ruhack.phobia.ji$ParticleKind;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.lr;
import ruhack.phobia.lt;
import ruhack.phobia.nd;
import ruhack.phobia.ol;

public final class ji
extends ds {
    private final kf mode;
    private static final float PEARL_LIFETIME = 2.25f;
    private boolean collisionCacheActive;
    private final kg radius;
    private static int[] ktxm;
    private static final int TOTEM_PARTICLE_COUNT = 45;
    private static final float TOTEM_LIFETIME = 1.45f;
    private long lastFrameNanos;
    private static final float TAU = (float)Math.PI * 2;
    private final kg size;
    private static final String TEXTURE_DOLLARS = "\u0414\u043e\u043b\u043b\u0430\u0440\u044b";
    static final long tf = 6009986719149303932L;
    private static final class_2960 STAR_TEXTURE;
    private final class_2338.class_2339 spawnPos;
    private static final int MAX_EVENT_PARTICLES = 420;
    public static final int b;
    private static final float CRITICAL_LIFETIME = 1.15f;
    private final kg count;
    private static final String TEXTURE_HEARTS = "\u0421\u0435\u0440\u0434\u0446\u0430";
    private final ke reasons;
    private final Long2ByteOpenHashMap collisionCache;
    private final ArrayDeque<ji$GlowParticle> particlePool;
    private static final class_2960 SNOWFLAKE_TEXTURE;
    public static final boolean a;
    public static final boolean c;
    private boolean lastFallingMode;
    private static final String TEXTURE_PUMPKINS = "\u0422\u044b\u043a\u0432\u044b";
    private static final float FALL_LIFETIME = 8.0f;
    private static final class_2960 DOLLAR_TEXTURE;
    private static final String TEXTURE_SNOWFLAKES = "\u0421\u043d\u0435\u0436\u0438\u043d\u043a\u0438";
    private final List<ji$GlowParticle> particles;
    private static final String TEXTURE_STARS = "\u0417\u0432\u0451\u0437\u0434\u044b";
    private static int[] ktxl;
    private final kf texture;
    private float spawnAccumulator;
    private static long[] ktyw;
    private static final float RISE_LIFETIME = 6.5f;
    private final kg speed;
    private static long[] ktyx;
    private static final class_2960 HEART_TEXTURE;
    private final class_2338.class_2339 collisionPos;
    private static final String TEXTURE_CIRCLES = "\u041a\u0440\u0443\u0436\u043e\u0447\u043a\u0438";
    private static final float MAX_DELTA = 0.05f;
    private static final class_2960 PUMPKIN_TEXTURE;
    private int ambientParticleCount;

    private static /* synthetic */ void kxyk() {
        ji.ktxl[200] = 614911404;
        ji.ktxl[201] = -1455903689;
        ji.ktxl[202] = 1408875056;
        ji.ktxl[203] = 661994433;
        ji.ktxl[204] = 1192641240;
        ji.ktxl[205] = 1420038186;
        ji.ktxl[206] = -414431253;
        ji.ktxl[207] = 1596740718;
        ji.ktxl[208] = -504831677;
        ji.ktxl[209] = 57929685;
        ji.ktxl[210] = -768394273;
        ji.ktxl[211] = -793737170;
        ji.ktxl[212] = -280610873;
        ji.ktxl[213] = -582827095;
        ji.ktxl[214] = -355926723;
        ji.ktxl[215] = 348160805;
        ji.ktxl[216] = -771011682;
        ji.ktxl[217] = -1127464529;
        ji.ktxl[218] = 410782096;
        ji.ktxl[219] = 500544965;
        ji.ktxl[220] = -798912781;
        ji.ktxl[221] = -1570917924;
        ji.ktxl[222] = 1479614075;
        ji.ktxl[223] = 1412689882;
        ji.ktxl[224] = -160722592;
        ji.ktxl[225] = -564915812;
        ji.ktxl[226] = -1367993617;
        ji.ktxl[227] = 83669449;
        ji.ktxl[228] = -457116420;
        ji.ktxl[229] = -1810545587;
        ji.ktxl[230] = -311636961;
        ji.ktxl[231] = 1860898579;
        ji.ktxl[232] = 1691488539;
        ji.ktxl[233] = -981959496;
        ji.ktxl[234] = 193669143;
        ji.ktxl[235] = -170238883;
        ji.ktxl[236] = 2008470425;
        ji.ktxl[237] = -299175226;
        ji.ktxl[238] = -1145070921;
        ji.ktxl[239] = 789935654;
        ji.ktxl[240] = -1971869242;
        ji.ktxl[241] = -488489053;
        ji.ktxl[242] = 1221834249;
        ji.ktxl[243] = 743069156;
        ji.ktxl[244] = 104709243;
        ji.ktxl[245] = 1120901003;
        ji.ktxl[246] = -532224836;
        ji.ktxl[247] = 1909853286;
        ji.ktxl[248] = 1314285652;
        ji.ktxl[249] = 271676387;
        ji.ktxl[250] = -2129321191;
        ji.ktxl[251] = -604592230;
        ji.ktxl[252] = 1970299475;
        ji.ktxl[253] = 285887630;
        ji.ktxl[254] = 472507897;
        ji.ktxl[255] = -1402017086;
        ji.ktxl[256] = 368494500;
        ji.ktxl[257] = -421861386;
        ji.ktxl[258] = 1281345542;
        ji.ktxl[259] = 2023426515;
        ji.ktxl[260] = 206514758;
        ji.ktxl[261] = 469518001;
        ji.ktxl[262] = -1477388327;
        ji.ktxl[263] = 1242338785;
        ji.ktxl[264] = 1582129339;
        ji.ktxl[265] = 707764420;
        ji.ktxl[266] = 1319033939;
        ji.ktxl[267] = -890559836;
        ji.ktxl[268] = -1844633558;
        ji.ktxl[269] = 2087592728;
        ji.ktxl[270] = 980238908;
        ji.ktxl[271] = 891063498;
        ji.ktxl[272] = 1524474158;
        ji.ktxl[273] = 409560374;
        ji.ktxl[274] = 708610699;
        ji.ktxl[275] = -1475290202;
        ji.ktxl[276] = -1964255610;
        ji.ktxl[277] = 1036569566;
        ji.ktxl[278] = 1211197637;
        ji.ktxl[279] = -499438024;
        ji.ktxl[280] = -669256525;
        ji.ktxl[281] = -1589688819;
        ji.ktxl[282] = -540022498;
        ji.ktxl[283] = 302133002;
        ji.ktxl[284] = 1917539831;
        ji.ktxl[285] = 1800939068;
        ji.ktxl[286] = 592793083;
        ji.ktxl[287] = 1267200335;
        ji.ktxl[288] = 624948754;
        ji.ktxl[289] = 898693087;
        ji.ktxl[290] = -1688108780;
        ji.ktxl[291] = 106055775;
        ji.ktxl[292] = -920972044;
        ji.ktxl[293] = 2135005572;
        ji.ktxl[294] = 28000551;
        ji.ktxl[295] = 81389820;
        ji.ktxl[296] = -579291847;
        ji.ktxl[297] = -1909260357;
        ji.ktxl[298] = -175609351;
        ji.ktxl[299] = -241700834;
    }

    private static /* synthetic */ void kxzp() {
        ji.ktyx[300] = 2175181340879284074L;
        ji.ktyx[301] = -505623395286193371L;
        ji.ktyx[302] = 2856495914779591700L;
        ji.ktyx[303] = 2772577838379779698L;
        ji.ktyx[304] = -3984681289615178922L;
        ji.ktyx[305] = 5894842068239238221L;
        ji.ktyx[306] = 7699040449319304936L;
        ji.ktyx[307] = 2168401218532798569L;
        ji.ktyx[308] = -1865882005512006966L;
        ji.ktyx[309] = -6717816714573608092L;
        ji.ktyx[310] = -4255182259062690496L;
        ji.ktyx[311] = -7809018974730764518L;
        ji.ktyx[312] = 8987638304536286616L;
        ji.ktyx[313] = -6347468766024283062L;
        ji.ktyx[314] = -6948790208978236309L;
        ji.ktyx[315] = 6684769175079939705L;
        ji.ktyx[316] = 6976575903508245538L;
        ji.ktyx[317] = 3826920835635190294L;
        ji.ktyx[318] = -477483621177586245L;
        ji.ktyx[319] = -6117116802084211251L;
        ji.ktyx[320] = -4687395693915664951L;
        ji.ktyx[321] = -637056236761251962L;
        ji.ktyx[322] = 2883078198704123266L;
        ji.ktyx[323] = 3233484855124155499L;
        ji.ktyx[324] = 1566757085913479406L;
        ji.ktyx[325] = -2248478824125119728L;
        ji.ktyx[326] = -3224587499475170220L;
        ji.ktyx[327] = 7573472085316873216L;
        ji.ktyx[328] = 1167585585328600898L;
        ji.ktyx[329] = -6836441642824052508L;
        ji.ktyx[330] = -6620538306898601022L;
        ji.ktyx[331] = -975254032539557057L;
        ji.ktyx[332] = 3075536755422161203L;
        ji.ktyx[333] = -2283302589921949L;
        ji.ktyx[334] = 1671646555473191802L;
        ji.ktyx[335] = -2066359475156321639L;
        ji.ktyx[336] = -6857944461076303365L;
        ji.ktyx[337] = -8104367191313704895L;
        ji.ktyx[338] = 553276460195426142L;
        ji.ktyx[339] = 798224801514136893L;
        ji.ktyx[340] = 5288544879550411158L;
        ji.ktyx[341] = 6550968301516180368L;
        ji.ktyx[342] = 5361336271391477279L;
        ji.ktyx[343] = 3372685522152783937L;
        ji.ktyx[344] = 3571984555155850629L;
        ji.ktyx[345] = 4238657929513167644L;
        ji.ktyx[346] = 2873801907235664123L;
        ji.ktyx[347] = 707698014183438659L;
        ji.ktyx[348] = 7881952346029486122L;
        ji.ktyx[349] = -5142903390350416387L;
        ji.ktyx[350] = -5430708239201340691L;
        ji.ktyx[351] = -5847218236233012613L;
        ji.ktyx[352] = 2138202205648866318L;
        ji.ktyx[353] = 8538167589621808011L;
        ji.ktyx[354] = -6497664041299421425L;
        ji.ktyx[355] = 4929658381139203831L;
        ji.ktyx[356] = -3463742219782332926L;
        ji.ktyx[357] = -4194157177327444046L;
        ji.ktyx[358] = 5822991800530445510L;
        ji.ktyx[359] = -2296442988536776437L;
        ji.ktyx[360] = 6811899045651988665L;
        ji.ktyx[361] = 8887423243592661262L;
        ji.ktyx[362] = -5107258846452275871L;
        ji.ktyx[363] = 1880784160428801064L;
        ji.ktyx[364] = 4408913123072068894L;
        ji.ktyx[365] = -4943734184524524301L;
        ji.ktyx[366] = 4708525708658131626L;
        ji.ktyx[367] = -2031555991852624783L;
        ji.ktyx[368] = 1035581234651053572L;
        ji.ktyx[369] = -4434418246374550169L;
        ji.ktyx[370] = 3885369141369037838L;
        ji.ktyx[371] = -5039873264197595221L;
        ji.ktyx[372] = 4809201946236771610L;
        ji.ktyx[373] = 4233984011638460358L;
        ji.ktyx[374] = -3890892815558055460L;
        ji.ktyx[375] = -9218512453735953194L;
        ji.ktyx[376] = 1828492150727452006L;
        ji.ktyx[377] = -7331639028915620649L;
        ji.ktyx[378] = 2296803878629634883L;
        ji.ktyx[379] = -5839239548821801789L;
        ji.ktyx[380] = -3046544799367998165L;
        ji.ktyx[381] = 5556124858246413746L;
        ji.ktyx[382] = 2968805687983514549L;
        ji.ktyx[383] = 7886968097916424306L;
        ji.ktyx[384] = -3554054414394953398L;
        ji.ktyx[385] = -7876859435806092466L;
        ji.ktyx[386] = -2006946650337420899L;
        ji.ktyx[387] = -2769914350793584668L;
        ji.ktyx[388] = -1496110184815755286L;
        ji.ktyx[389] = 8532903513253578337L;
        ji.ktyx[390] = 7224063142103140425L;
        ji.ktyx[391] = 8790626316970587172L;
        ji.ktyx[392] = 7531598374421086183L;
        ji.ktyx[393] = -64708152872505636L;
        ji.ktyx[394] = -1446786184747458249L;
        ji.ktyx[395] = -2569760925102040705L;
        ji.ktyx[396] = -723275610560852984L;
        ji.ktyx[397] = 6943544214625111588L;
        ji.ktyx[398] = 6540936487201116783L;
        ji.ktyx[399] = 3756689758997657727L;
    }

    private static /* synthetic */ void kxzh() {
        ji.ktyw[100] = -5404344234782041667L;
        ji.ktyw[101] = -3200133293598763985L;
        ji.ktyw[102] = 4420938316232731007L;
        ji.ktyw[103] = 2682650544989395920L;
        ji.ktyw[104] = -7287296385902685956L;
        ji.ktyw[105] = -2872282355215788697L;
        ji.ktyw[106] = -5250467499355328575L;
        ji.ktyw[107] = -4968737456223687273L;
        ji.ktyw[108] = 1922885334371264583L;
        ji.ktyw[109] = 3598266372277446117L;
        ji.ktyw[110] = 4733284271475141229L;
        ji.ktyw[111] = 1488779524443363617L;
        ji.ktyw[112] = -3453752371612954928L;
        ji.ktyw[113] = 2065334493626193091L;
        ji.ktyw[114] = -2199869082011743981L;
        ji.ktyw[115] = -1870609952269736284L;
        ji.ktyw[116] = 9130065748234802966L;
        ji.ktyw[117] = 7234994564733960930L;
        ji.ktyw[118] = 2405978431617096035L;
        ji.ktyw[119] = -812190513066945769L;
        ji.ktyw[120] = 8752212862959897174L;
        ji.ktyw[121] = 3053824746160671681L;
        ji.ktyw[122] = -5175480656284275861L;
        ji.ktyw[123] = 6068948614404118288L;
        ji.ktyw[124] = -5444352385150219543L;
        ji.ktyw[125] = -8911120914848577062L;
        ji.ktyw[126] = 7131420198855782807L;
        ji.ktyw[127] = 3465524002554673158L;
        ji.ktyw[128] = 1180904021622022272L;
        ji.ktyw[129] = -6647359533725758307L;
        ji.ktyw[130] = -2539661364656707766L;
        ji.ktyw[131] = 5779359175896041300L;
        ji.ktyw[132] = -5267755995140444220L;
        ji.ktyw[133] = 4812633962984903387L;
        ji.ktyw[134] = -6809200757835912820L;
        ji.ktyw[135] = 7810190522789560392L;
        ji.ktyw[136] = 8171986341532672685L;
        ji.ktyw[137] = -5351427985013916890L;
        ji.ktyw[138] = -8619708252941930518L;
        ji.ktyw[139] = -2108986234472048598L;
        ji.ktyw[140] = 5283477586489671565L;
        ji.ktyw[141] = 1941950554888061978L;
        ji.ktyw[142] = 6711280582612890279L;
        ji.ktyw[143] = 2117405753615940247L;
        ji.ktyw[144] = 3043075258546631949L;
        ji.ktyw[145] = 8745711148879504539L;
        ji.ktyw[146] = -613653901695836284L;
        ji.ktyw[147] = 4824843293281052381L;
        ji.ktyw[148] = -8059669916606564827L;
        ji.ktyw[149] = -4966166368577043249L;
        ji.ktyw[150] = -7302314040002100237L;
        ji.ktyw[151] = -6877717549928732393L;
        ji.ktyw[152] = -8323251590635757865L;
        ji.ktyw[153] = 8112546577354719452L;
        ji.ktyw[154] = -1860466869603468530L;
        ji.ktyw[155] = 6516692178202175114L;
        ji.ktyw[156] = 4911737375914960664L;
        ji.ktyw[157] = 3757447339908841183L;
        ji.ktyw[158] = 2794542113380872540L;
        ji.ktyw[159] = 1222485241809288048L;
        ji.ktyw[160] = -4520693470192121117L;
        ji.ktyw[161] = -5639560532801466000L;
        ji.ktyw[162] = 535617610226235842L;
        ji.ktyw[163] = -2958862036337181098L;
        ji.ktyw[164] = 1836301169797346599L;
        ji.ktyw[165] = -2096737025009733544L;
        ji.ktyw[166] = -2664908698186666459L;
        ji.ktyw[167] = -6013989241672656451L;
        ji.ktyw[168] = -5610639704339510780L;
        ji.ktyw[169] = -5186852113520141982L;
        ji.ktyw[170] = -1896228876077887787L;
        ji.ktyw[171] = -1663490915479798938L;
        ji.ktyw[172] = -2081542149591727757L;
        ji.ktyw[173] = 3507331716580161896L;
        ji.ktyw[174] = 1548355429484757581L;
        ji.ktyw[175] = -8324029020576002747L;
        ji.ktyw[176] = 5480863645596652111L;
        ji.ktyw[177] = -6756614810143971414L;
        ji.ktyw[178] = 3521744770306270298L;
        ji.ktyw[179] = 1916393363138080058L;
        ji.ktyw[180] = -113269235576677139L;
        ji.ktyw[181] = 5206761923010971924L;
        ji.ktyw[182] = -8158484383228057643L;
        ji.ktyw[183] = 6889387093655422979L;
        ji.ktyw[184] = -6172494419136642430L;
        ji.ktyw[185] = -749875189564631658L;
        ji.ktyw[186] = -8985856431716449037L;
        ji.ktyw[187] = -2607428917988076101L;
        ji.ktyw[188] = 5800436079997247371L;
        ji.ktyw[189] = 362787165478300226L;
        ji.ktyw[190] = -1756465638052656300L;
        ji.ktyw[191] = 2283305400065685402L;
        ji.ktyw[192] = 5508097186889883667L;
        ji.ktyw[193] = -7922071682762704821L;
        ji.ktyw[194] = -4809933521305750657L;
        ji.ktyw[195] = 7361252065823417658L;
        ji.ktyw[196] = -4511744606945745564L;
        ji.ktyw[197] = 291865704909568883L;
        ji.ktyw[198] = -8547495319397325481L;
        ji.ktyw[199] = 3669960772415505139L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isGroundClose(double var1_1, double var3_2, double var5_3, class_2338.class_2339 var7_4) {
        block29: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxnk", ktyv(int ), (int)450)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ji.ktxn("kxnl", ktxk(int ), (int)997)) break;
                v0 /* !! */  = (long)ji.ktxn("kxnm", ktxk(int ), (int)998);
            }
            var10_5 = ji.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxnn", ktyv(int ), (int)451)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ji.ktxn("kxno", ktxk(int ), (int)999)) break;
                v1 /* !! */  = (long)ji.ktxn("kxnp", ktxk(int ), (int)1000);
            }
            var9_6 /* !! */  = ji.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxnq", ktyv(int ), (int)452)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ji.ktxn("kxnr", ktxk(int ), (int)1001)) break;
                v2 /* !! */  = (long)ji.ktxn("kxnt", ktxk(int ), (int)1002);
            }
            var8_7 = ji.a;
            if (var10_5) {
                throw null;
lbl24:
                // 4 sources

                return (boolean)ji.ktxn("kxnu", ktxk(int ), (int)1003);
            }
            if (var8_7 || var8_7) ** GOTO lbl24
            v3 = var3_2 - ji.ktxn("kxnv", kufx(int ), (int)453);
            v4 /* !! */  = ji.tf;
            if (true) ** GOTO lbl32
            block18: while (true) {
                v4 /* !! */  = (long)(ji.ktxn("kxnx", ktyv(int ), (int)455) - ji.ktxn("kxnw", ktyv(int ), (int)454));
lbl32:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 733325436: {
                        break block18;
                    }
                    case 1149751609: {
                        continue block18;
                    }
                }
                break;
            }
            if (this.isFree(var1_1, v3, var5_3, var7_4)) break block29;
            if (var8_7) ** GOTO lbl24
            v5 = ji.ktxn("kxny", ktxk(int ), (int)1004);
            if (var10_5) {
                throw null;
            }
            ** GOTO lbl51
        }
        if (var8_7) ** GOTO lbl24
        if (var9_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_7) ** break;
                ** continue;
                v5 = ji.ktxn("kxnz", ktxk(int ), (int)1005);
lbl51:
                // 2 sources

                return (boolean)v5;
            }
            case 0: {
                var9_6 /* !! */  = (int)ji.ktxn("kxoa", ktxk(int ), (int)1006);
                if (!var10_5) break;
                throw null;
            }
            case 1: {
                var9_6 /* !! */  = (int)ji.ktxn("kxob", ktxk(int ), (int)1007);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl61:
            // 2 sources

            case 2: {
                var9_6 /* !! */  = (int)ji.ktxn("kxoc", ktxk(int ), (int)1008);
                if (var10_5) {
                    throw null;
                }
            }
            case 3: {
                var9_6 /* !! */  = (int)ji.ktxn("kxod", ktxk(int ), (int)1009);
                if (!var10_5) ** GOTO lbl61
                throw null;
            }
            case 4: {
                var9_6 /* !! */  = (int)ji.ktxn("kxoe", ktxk(int ), (int)1010);
                if (!var10_5) break;
                throw null;
            }
lbl73:
            // 2 sources

            case 5: {
                var9_6 /* !! */  = (int)ji.ktxn("kxof", ktxk(int ), (int)1011);
                if (!var10_5) break;
                throw null;
            }
lbl77:
            // 2 sources

            case 6: {
                var9_6 /* !! */  = (int)ji.ktxn("kxog", ktxk(int ), (int)1012);
                if (!var10_5) ** GOTO lbl73
                throw null;
            }
            case 7: 
        }
        do {
            var9_6 /* !! */  = (int)ji.ktxn("kxoh", ktxk(int ), (int)1013);
        } while (!var10_5);
        throw null;
    }

    private static /* synthetic */ void kxzo() {
        ji.ktyx[200] = 852596247835308534L;
        ji.ktyx[201] = -7874723429284191242L;
        ji.ktyx[202] = 1754880214620921186L;
        ji.ktyx[203] = -1133253032290302173L;
        ji.ktyx[204] = 8050786249282215026L;
        ji.ktyx[205] = 7989544953304468349L;
        ji.ktyx[206] = 6800891877414684522L;
        ji.ktyx[207] = 6592615252344224423L;
        ji.ktyx[208] = 6830400246198830546L;
        ji.ktyx[209] = 8047045468479578979L;
        ji.ktyx[210] = 6210523611756914813L;
        ji.ktyx[211] = -173959107628886637L;
        ji.ktyx[212] = -9040988192012441055L;
        ji.ktyx[213] = 5913082452574979613L;
        ji.ktyx[214] = 6122257228425012510L;
        ji.ktyx[215] = 6309377063914749121L;
        ji.ktyx[216] = -3533588115788098003L;
        ji.ktyx[217] = -2573084216060286770L;
        ji.ktyx[218] = -2348597371374354636L;
        ji.ktyx[219] = 6627100755654639260L;
        ji.ktyx[220] = -5882432247866273690L;
        ji.ktyx[221] = -4213001383756296933L;
        ji.ktyx[222] = -3347533316881133296L;
        ji.ktyx[223] = -5023421967103518326L;
        ji.ktyx[224] = 6367008022348134461L;
        ji.ktyx[225] = 4732543309368387234L;
        ji.ktyx[226] = 6069750164330417339L;
        ji.ktyx[227] = -852791014021431917L;
        ji.ktyx[228] = -8431623019877968130L;
        ji.ktyx[229] = -3741554324425485451L;
        ji.ktyx[230] = -4555638504074390922L;
        ji.ktyx[231] = 2311281935932395728L;
        ji.ktyx[232] = 141153497892367696L;
        ji.ktyx[233] = 6889408145378336198L;
        ji.ktyx[234] = 8334731509840215145L;
        ji.ktyx[235] = -7768250087355648739L;
        ji.ktyx[236] = -3850520747188644017L;
        ji.ktyx[237] = -2849210827622093787L;
        ji.ktyx[238] = -4813954488459439556L;
        ji.ktyx[239] = 5530139099401518123L;
        ji.ktyx[240] = -3123827523216475302L;
        ji.ktyx[241] = 6293768567174992853L;
        ji.ktyx[242] = 2856862444950920388L;
        ji.ktyx[243] = 544849216838202505L;
        ji.ktyx[244] = -460749802114062445L;
        ji.ktyx[245] = 6494931227613682368L;
        ji.ktyx[246] = -1502645503095311369L;
        ji.ktyx[247] = 6227037607951496534L;
        ji.ktyx[248] = 4333161566583116935L;
        ji.ktyx[249] = 8831470172510730746L;
        ji.ktyx[250] = 6724942292783587044L;
        ji.ktyx[251] = -3327106303111270110L;
        ji.ktyx[252] = -7046639798139352349L;
        ji.ktyx[253] = 5428918504801266861L;
        ji.ktyx[254] = -2522251804070702704L;
        ji.ktyx[255] = -7265925076628984199L;
        ji.ktyx[256] = 8034935425304977209L;
        ji.ktyx[257] = 1785353986306656573L;
        ji.ktyx[258] = -7923559352931787125L;
        ji.ktyx[259] = 8549743711866260602L;
        ji.ktyx[260] = 6092105487990603849L;
        ji.ktyx[261] = -2536672127788753266L;
        ji.ktyx[262] = 8959554794213985054L;
        ji.ktyx[263] = 7213063027350630303L;
        ji.ktyx[264] = -7914986308569424355L;
        ji.ktyx[265] = 630727424169888754L;
        ji.ktyx[266] = 2419589995468338247L;
        ji.ktyx[267] = 6561024577327321847L;
        ji.ktyx[268] = 7094366735213413060L;
        ji.ktyx[269] = -8354499666055375950L;
        ji.ktyx[270] = 99901477704802588L;
        ji.ktyx[271] = -6783943237378810170L;
        ji.ktyx[272] = 6284822427520569647L;
        ji.ktyx[273] = -2173168127599071232L;
        ji.ktyx[274] = -2338439981230889432L;
        ji.ktyx[275] = -1707615874954231902L;
        ji.ktyx[276] = 822953189088588997L;
        ji.ktyx[277] = -8532873286559062771L;
        ji.ktyx[278] = 5347898147568650259L;
        ji.ktyx[279] = 8615418676012163402L;
        ji.ktyx[280] = 5730647889520577713L;
        ji.ktyx[281] = 544079003432249617L;
        ji.ktyx[282] = -3294345932633704008L;
        ji.ktyx[283] = 3301053613028026296L;
        ji.ktyx[284] = 7625131262439827537L;
        ji.ktyx[285] = -1172428100146988921L;
        ji.ktyx[286] = -32332628978099216L;
        ji.ktyx[287] = -1501273480073043586L;
        ji.ktyx[288] = 1204182687784531700L;
        ji.ktyx[289] = 2858481379012512151L;
        ji.ktyx[290] = 7607175047219217211L;
        ji.ktyx[291] = -6177626437983371404L;
        ji.ktyx[292] = -5557055796511060117L;
        ji.ktyx[293] = 2188608998308115137L;
        ji.ktyx[294] = -7641247287744214413L;
        ji.ktyx[295] = -4630696701190823674L;
        ji.ktyx[296] = 6695698607390802319L;
        ji.ktyx[297] = 875331660247900171L;
        ji.ktyx[298] = -3240218264447428059L;
        ji.ktyx[299] = 3935501811399142186L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void spawnPearlTrail(class_1684 var1_1) {
        block55: {
            var11_2 = ji.c;
            var10_3 /* !! */  = ji.b;
            var9_4 = ji.a;
            if (var11_2) {
                throw null;
lbl6:
                // 14 sources

                return;
            }
            if (var9_4 || var9_4) ** GOTO lbl6
            if (this.particles.size() < ji.ktxn("kuzc", ktxk(int ), (int)446)) break block55;
            if (var9_4 || var9_4) ** GOTO lbl6
            return;
        }
        if (var9_4 || var9_4) ** GOTO lbl6
        var2_5 = ThreadLocalRandom.current();
        if (var9_4 || var9_4) ** GOTO lbl6
        var3_6 = this.size.getValue();
        if (var9_4 || var9_4) ** GOTO lbl6
        var4_7 = ji.ktxn("kuzg", ktxk(int ), (int)447);
        if (var9_4) ** GOTO lbl6
        if (var10_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                do {
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (var4_7 >= ji.ktxn("kuzj", ktxk(int ), (int)448)) ** GOTO lbl39
                    if (var9_4) ** GOTO lbl6
                    if (this.particles.size() >= ji.ktxn("kuzl", ktxk(int ), (int)449)) ** GOTO lbl39
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var5_8 = var2_5.nextDouble() * ji.ktxn("kuzo", kufx(int ), (int)160);
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var7_9 = var2_5.nextDouble((double)ji.ktxn("kuzq", kufx(int ), (int)161), (double)ji.ktxn("kuzr", kufx(int ), (int)162));
                    if (var9_4 || var9_4) ** GOTO lbl6
                    this.addEventParticle(var1_1.method_23317(), var1_1.method_23318() + var2_5.nextDouble((double)ji.ktxn("kuzt", kufx(int ), (int)163), (double)ji.ktxn("kuzv", kufx(int ), (int)164)), var1_1.method_23321(), Math.cos(var5_8) * var7_9, var2_5.nextDouble((double)ji.ktxn("kuzx", kufx(int ), (int)165), (double)ji.ktxn("kuzz", kufx(int ), (int)166)), Math.sin(var5_8) * var7_9, var3_6 * (ji.ktxn("kvab", ktxr(int ), (int)450) + var2_5.nextFloat() * ji.ktxn("kvad", ktxr(int ), (int)451)), (float)(ji.ktxn("kvaf", ktxr(int ), (int)452) * (ji.ktxn("kvag", ktxr(int ), (int)453) + var2_5.nextFloat() * ji.ktxn("kvai", ktxr(int ), (int)454))), ji$ParticleKind.PEARL);
                    if (var9_4 || var9_4) ** GOTO lbl6
                    ++var4_7;
                    if (var9_4) ** GOTO lbl6
                } while (!var11_2);
                throw null;
lbl39:
                // 2 sources

                if (!var9_4 && !var9_4) ** break;
                ** continue;
                return;
            }
lbl42:
            // 4 sources

            case 0: {
                var10_3 /* !! */  = (int)ji.ktxn("kvam", ktxk(int ), (int)455);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
lbl47:
            // 3 sources

            case 1: {
                var10_3 /* !! */  = (int)ji.ktxn("kvao", ktxk(int ), (int)456);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 2: {
                var10_3 /* !! */  = (int)ji.ktxn("kvaq", ktxk(int ), (int)457);
                if (!var11_2) ** GOTO lbl42
                throw null;
            }
            case 3: {
                var10_3 /* !! */  = (int)ji.ktxn("kvas", ktxk(int ), (int)458);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl61:
            // 3 sources

            case 4: {
                var10_3 /* !! */  = (int)ji.ktxn("kvau", ktxk(int ), (int)459);
                if (!var11_2) ** GOTO lbl42
                throw null;
            }
lbl65:
            // 2 sources

            case 5: {
                var10_3 /* !! */  = (int)ji.ktxn("kvaw", ktxk(int ), (int)460);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl70:
            // 2 sources

            case 6: {
                var10_3 /* !! */  = (int)ji.ktxn("kvay", ktxk(int ), (int)461);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 7: {
                var10_3 /* !! */  = (int)ji.ktxn("kvba", ktxk(int ), (int)462);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 8: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbb", ktxk(int ), (int)463);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 9: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbd", ktxk(int ), (int)464);
                if (!var11_2) ** GOTO lbl61
                throw null;
            }
lbl89:
            // 2 sources

            case 10: {
                do {
                    var10_3 /* !! */  = (int)ji.ktxn("kvbf", ktxk(int ), (int)465);
                } while (!var11_2);
                throw null;
            }
lbl94:
            // 3 sources

            case 11: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbh", ktxk(int ), (int)466);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl99:
            // 2 sources

            case 12: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbj", ktxk(int ), (int)467);
                if (!var11_2) ** GOTO lbl47
                throw null;
            }
lbl103:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_3 /* !! */  = (int)ji.ktxn("kvbl", ktxk(int ), (int)468);
                    if (!var11_2) ** GOTO lbl70
                    throw null;
                }
            }
lbl108:
            // 3 sources

            case 14: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbm", ktxk(int ), (int)469);
                if (!var11_2) ** GOTO lbl61
                throw null;
            }
lbl112:
            // 3 sources

            case 15: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbn", ktxk(int ), (int)470);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl117:
            // 2 sources

            case 16: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbo", ktxk(int ), (int)471);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 17: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbp", ktxk(int ), (int)472);
                if (!var11_2) ** GOTO lbl99
                throw null;
            }
            case 18: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbq", ktxk(int ), (int)473);
                if (!var11_2) ** GOTO lbl108
                throw null;
            }
lbl130:
            // 3 sources

            case 19: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbr", ktxk(int ), (int)474);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl135:
            // 2 sources

            case 20: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbs", ktxk(int ), (int)475);
                if (!var11_2) ** GOTO lbl94
                throw null;
            }
lbl139:
            // 2 sources

            case 21: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbt", ktxk(int ), (int)476);
                if (!var11_2) ** GOTO lbl42
                throw null;
            }
            case 22: {
                var10_3 /* !! */  = (int)ji.ktxn("kvbv", ktxk(int ), (int)477);
                if (!var11_2) ** GOTO lbl117
                throw null;
            }
lbl147:
            // 2 sources

            case 23: {
                var10_3 /* !! */  = (int)ji.ktxn("kvby", ktxk(int ), (int)478);
                if (!var11_2) ** GOTO lbl103
                throw null;
            }
            case 24: {
                var10_3 /* !! */  = (int)ji.ktxn("kvca", ktxk(int ), (int)479);
                if (!var11_2) ** GOTO lbl108
                throw null;
            }
lbl155:
            // 2 sources

            case 25: {
                var10_3 /* !! */  = (int)ji.ktxn("kvcc", ktxk(int ), (int)480);
                if (!var11_2) ** GOTO lbl94
                throw null;
            }
lbl159:
            // 2 sources

            case 26: {
                var10_3 /* !! */  = (int)ji.ktxn("kvcf", ktxk(int ), (int)481);
                if (!var11_2) ** GOTO lbl47
                throw null;
            }
            case 27: 
        }
        var10_3 /* !! */  = (int)ji.ktxn("kvci", ktxk(int ), (int)482);
        ** while (!var11_2)
lbl166:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyp() {
        ji.ktxl[700] = 519225204;
        ji.ktxl[701] = -94136039;
        ji.ktxl[702] = -89137449;
        ji.ktxl[703] = -1188687920;
        ji.ktxl[704] = -1580253246;
        ji.ktxl[705] = -1650154316;
        ji.ktxl[706] = -1027122899;
        ji.ktxl[707] = -1939850473;
        ji.ktxl[708] = 1701006545;
        ji.ktxl[709] = -623190838;
        ji.ktxl[710] = 847631124;
        ji.ktxl[711] = -356874790;
        ji.ktxl[712] = 337379104;
        ji.ktxl[713] = -1011618892;
        ji.ktxl[714] = -2002021134;
        ji.ktxl[715] = 1528928892;
        ji.ktxl[716] = -309059122;
        ji.ktxl[717] = 329141897;
        ji.ktxl[718] = -741901754;
        ji.ktxl[719] = -1307460416;
        ji.ktxl[720] = -1481506515;
        ji.ktxl[721] = 1710127135;
        ji.ktxl[722] = -888903848;
        ji.ktxl[723] = -710931201;
        ji.ktxl[724] = 386720263;
        ji.ktxl[725] = 1102058437;
        ji.ktxl[726] = 1206731262;
        ji.ktxl[727] = 377404120;
        ji.ktxl[728] = 1434739827;
        ji.ktxl[729] = 100295457;
        ji.ktxl[730] = 233132001;
        ji.ktxl[731] = 1974355543;
        ji.ktxl[732] = 735336286;
        ji.ktxl[733] = 597287750;
        ji.ktxl[734] = -1500266229;
        ji.ktxl[735] = 1988726051;
        ji.ktxl[736] = -2093820458;
        ji.ktxl[737] = -653703718;
        ji.ktxl[738] = -697907973;
        ji.ktxl[739] = -1660655765;
        ji.ktxl[740] = -2092862755;
        ji.ktxl[741] = -497290588;
        ji.ktxl[742] = 191420969;
        ji.ktxl[743] = -1837256545;
        ji.ktxl[744] = 338844520;
        ji.ktxl[745] = -1955536249;
        ji.ktxl[746] = 1015712404;
        ji.ktxl[747] = -1092708772;
        ji.ktxl[748] = -319650525;
        ji.ktxl[749] = -247136021;
        ji.ktxl[750] = -2121179902;
        ji.ktxl[751] = -1023886554;
        ji.ktxl[752] = 1602975713;
        ji.ktxl[753] = 1228853865;
        ji.ktxl[754] = 1687653987;
        ji.ktxl[755] = -536346432;
        ji.ktxl[756] = -1439005548;
        ji.ktxl[757] = -1610606027;
        ji.ktxl[758] = -1741157496;
        ji.ktxl[759] = 782890445;
        ji.ktxl[760] = 1216443941;
        ji.ktxl[761] = -1719696829;
        ji.ktxl[762] = -895161987;
        ji.ktxl[763] = 1906546046;
        ji.ktxl[764] = 1249867885;
        ji.ktxl[765] = 1312423513;
        ji.ktxl[766] = -1780044305;
        ji.ktxl[767] = -654789916;
        ji.ktxl[768] = -1625511210;
        ji.ktxl[769] = 1309482426;
        ji.ktxl[770] = -1752548062;
        ji.ktxl[771] = 1356366516;
        ji.ktxl[772] = -2132124004;
        ji.ktxl[773] = -524613990;
        ji.ktxl[774] = -1195781628;
        ji.ktxl[775] = 1527806709;
        ji.ktxl[776] = -674082131;
        ji.ktxl[777] = 1820920947;
        ji.ktxl[778] = -1977308213;
        ji.ktxl[779] = -1008859284;
        ji.ktxl[780] = -1198265935;
        ji.ktxl[781] = -1927991856;
        ji.ktxl[782] = -1396311794;
        ji.ktxl[783] = -1128060131;
        ji.ktxl[784] = -817589687;
        ji.ktxl[785] = -1324813896;
        ji.ktxl[786] = 1760778750;
        ji.ktxl[787] = 587849965;
        ji.ktxl[788] = 655877409;
        ji.ktxl[789] = -786992016;
        ji.ktxl[790] = -1064081472;
        ji.ktxl[791] = -1670351756;
        ji.ktxl[792] = -989940674;
        ji.ktxl[793] = 1076764869;
        ji.ktxl[794] = 796463181;
        ji.ktxl[795] = -193676054;
        ji.ktxl[796] = -2144749355;
        ji.ktxl[797] = 1311389594;
        ji.ktxl[798] = -1940367845;
        ji.ktxl[799] = 1312611384;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isFallingMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxqj", ktyv(int ), (int)456)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ji.ktxn("kxqk", ktxk(int ), (int)1067)) break;
            v0 /* !! */  = (long)ji.ktxn("kxql", ktxk(int ), (int)1068);
        }
        var3_1 = ji.c;
        v1 /* !! */  = ji.tf;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(ji.ktxn("kxqn", ktyv(int ), (int)458) - ji.ktxn("kxqm", ktyv(int ), (int)457));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 733325436: {
                    break block23;
                }
                case 1876843731: {
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = ji.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxqo", ktyv(int ), (int)459)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ji.ktxn("kxqp", ktxk(int ), (int)1069)) break;
            v2 /* !! */  = (long)ji.ktxn("kxqq", ktxk(int ), (int)1070);
        }
        var1_3 = ji.a;
        if (var3_1) {
            throw null;
            return (boolean)ji.ktxn("kxqr", ktxk(int ), (int)1071);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ji.tf;
                if (true) ** GOTO lbl37
                block26: while (true) {
                    v3 /* !! */  = (long)(v4 - ji.ktxn("kxqs", ktyv(int ), (int)460));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 72273698: {
                            v4 = ji.ktxn("kxqt", ktyv(int ), (int)461);
                            continue block26;
                        }
                        case 733325436: {
                            break block26;
                        }
                        case 1024548163: {
                            v4 = ji.ktxn("kxqu", ktyv(int ), (int)462);
                            continue block26;
                        }
                        case 1386354885: {
                            v4 = ji.ktxn("kxqv", ktyv(int ), (int)463);
                            continue block26;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ji.tf;
                if (true) ** GOTO lbl53
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ji.ktxn("kxqw", ktyv(int ), (int)464));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -436751818: {
                            v6 = ji.ktxn("kxqx", ktyv(int ), (int)465);
                            continue block27;
                        }
                        case 394039591: {
                            v6 = ji.ktxn("kxqy", ktyv(int ), (int)466);
                            continue block27;
                        }
                        case 733325436: {
                            break block27;
                        }
                        case 1544728749: {
                            v6 = ji.ktxn("kxqz", ktyv(int ), (int)467);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.mode.isSelected("\u041f\u0430\u0434\u0435\u043d\u0438\u0435");
            }
            case 0: {
                var2_2 /* !! */  = (int)ji.ktxn("kxra", ktxk(int ), (int)1072);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kxrb", ktxk(int ), (int)1073);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kxrc", ktxk(int ), (int)1074);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ji.ktxn("kxrd", ktxk(int ), (int)1075);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float ktxr(int n2) {
        return Float.intBitsToFloat(ktxl[n2] ^ ktxm[n2]);
    }

    private static /* synthetic */ void kxzl() {
        ji.ktyw[500] = 4024266502270245688L;
        ji.ktyw[501] = -3445379340438006257L;
        ji.ktyw[502] = -778306127324709330L;
        ji.ktyw[503] = 586408393336759864L;
        ji.ktyw[504] = -1326155406230767186L;
        ji.ktyw[505] = -8886112243924325158L;
        ji.ktyw[506] = -5688266738963194691L;
        ji.ktyw[507] = 1756121389878429329L;
        ji.ktyw[508] = -4741148849619820199L;
        ji.ktyw[509] = -2758662067617177073L;
        ji.ktyw[510] = 774340093243442938L;
        ji.ktyw[511] = 2775457641145761659L;
        ji.ktyw[512] = -2911809494655764221L;
        ji.ktyw[513] = 1225887167970469616L;
        ji.ktyw[514] = -4002213289863489383L;
        ji.ktyw[515] = 7263404321276841904L;
        ji.ktyw[516] = 6482536509988418607L;
        ji.ktyw[517] = 8470640722030264594L;
        ji.ktyw[518] = 2066691033543309029L;
        ji.ktyw[519] = 2061109980551226406L;
        ji.ktyw[520] = -2426609776424103174L;
        ji.ktyw[521] = 5149958651968220271L;
        ji.ktyw[522] = -4947486527797719809L;
        ji.ktyw[523] = -7479748103926782546L;
        ji.ktyw[524] = 1412359100831119055L;
        ji.ktyw[525] = -8732506341515221644L;
        ji.ktyw[526] = -4673897103667872763L;
        ji.ktyw[527] = -6668867338407508573L;
        ji.ktyw[528] = 710626078816357098L;
        ji.ktyw[529] = 6482446865979428797L;
        ji.ktyw[530] = -5960232817219330192L;
        ji.ktyw[531] = -753172180888490460L;
        ji.ktyw[532] = 3509693373393977517L;
        ji.ktyw[533] = -5903229820191473977L;
        ji.ktyw[534] = 7736752642952325792L;
        ji.ktyw[535] = -5093963799409086899L;
        ji.ktyw[536] = 989477582334158543L;
        ji.ktyw[537] = 5542722685317420462L;
        ji.ktyw[538] = -2441889608489548131L;
        ji.ktyw[539] = 4073876796845885377L;
        ji.ktyw[540] = -6733918641269002827L;
        ji.ktyw[541] = -8723960706811555992L;
        ji.ktyw[542] = 3797592030909357899L;
        ji.ktyw[543] = -8932469450654268952L;
        ji.ktyw[544] = -5292522237449291432L;
        ji.ktyw[545] = -5548892659547736138L;
        ji.ktyw[546] = 5268927263277681568L;
        ji.ktyw[547] = -5026094082535618652L;
    }

    private static /* synthetic */ void kxzf() {
        ji.ktxm[1100] = 113775961;
        ji.ktxm[1101] = -143555250;
        ji.ktxm[1102] = 445361668;
        ji.ktxm[1103] = -1043521935;
        ji.ktxm[1104] = 1341918974;
        ji.ktxm[1105] = -178176558;
        ji.ktxm[1106] = 132854275;
        ji.ktxm[1107] = 373872937;
        ji.ktxm[1108] = 1345036648;
        ji.ktxm[1109] = -2072583191;
        ji.ktxm[1110] = 1128840674;
        ji.ktxm[1111] = 1886610961;
        ji.ktxm[1112] = -695387339;
        ji.ktxm[1113] = 298357464;
        ji.ktxm[1114] = -1591876523;
        ji.ktxm[1115] = 1261406624;
        ji.ktxm[1116] = -218469073;
        ji.ktxm[1117] = 251548256;
        ji.ktxm[1118] = -435088018;
        ji.ktxm[1119] = 23372059;
        ji.ktxm[1120] = 76361597;
        ji.ktxm[1121] = 570731348;
        ji.ktxm[1122] = -1589579606;
        ji.ktxm[1123] = -964239823;
        ji.ktxm[1124] = -985996032;
        ji.ktxm[1125] = 2061454133;
        ji.ktxm[1126] = -1639664161;
        ji.ktxm[1127] = 1092079427;
        ji.ktxm[1128] = 1460081707;
        ji.ktxm[1129] = 573716662;
        ji.ktxm[1130] = 1368224653;
        ji.ktxm[1131] = 1230043649;
        ji.ktxm[1132] = -845980105;
        ji.ktxm[1133] = 319892143;
        ji.ktxm[1134] = 723282024;
        ji.ktxm[1135] = -802156096;
        ji.ktxm[1136] = 1405496119;
        ji.ktxm[1137] = 614765451;
        ji.ktxm[1138] = -49256020;
        ji.ktxm[1139] = 1275318229;
        ji.ktxm[1140] = 1856160033;
        ji.ktxm[1141] = -142655933;
        ji.ktxm[1142] = -882749820;
        ji.ktxm[1143] = -1415144867;
        ji.ktxm[1144] = -1823983919;
        ji.ktxm[1145] = -1576550984;
        ji.ktxm[1146] = -1514145238;
        ji.ktxm[1147] = 1653229879;
        ji.ktxm[1148] = -89980125;
        ji.ktxm[1149] = -232226029;
        ji.ktxm[1150] = 1594235602;
        ji.ktxm[1151] = 214312864;
        ji.ktxm[1152] = 1825302670;
        ji.ktxm[1153] = -301275197;
        ji.ktxm[1154] = 180415022;
        ji.ktxm[1155] = -1015980520;
        ji.ktxm[1156] = -1532138995;
        ji.ktxm[1157] = 2103128040;
        ji.ktxm[1158] = -1740715686;
        ji.ktxm[1159] = 2048197870;
        ji.ktxm[1160] = -344068497;
        ji.ktxm[1161] = -631220190;
        ji.ktxm[1162] = 1434177511;
        ji.ktxm[1163] = -437096792;
        ji.ktxm[1164] = -1431016013;
        ji.ktxm[1165] = 1654041895;
        ji.ktxm[1166] = 139729363;
        ji.ktxm[1167] = 1119757072;
        ji.ktxm[1168] = 1352421229;
        ji.ktxm[1169] = 1593896089;
        ji.ktxm[1170] = -974139398;
        ji.ktxm[1171] = -907416265;
        ji.ktxm[1172] = -826679272;
        ji.ktxm[1173] = 1365493289;
        ji.ktxm[1174] = -1370359341;
        ji.ktxm[1175] = 1640736495;
        ji.ktxm[1176] = 1474000119;
        ji.ktxm[1177] = -752360196;
        ji.ktxm[1178] = 660319983;
        ji.ktxm[1179] = -1768620975;
        ji.ktxm[1180] = -1858862936;
        ji.ktxm[1181] = -997714206;
    }

    private static /* synthetic */ double kufx(int n2) {
        return Double.longBitsToDouble(ktyw[n2] ^ ktyx[n2]);
    }

    private static /* synthetic */ void kxyn() {
        ji.ktxl[500] = -164003955;
        ji.ktxl[501] = -1684692476;
        ji.ktxl[502] = 1618968206;
        ji.ktxl[503] = 1491999695;
        ji.ktxl[504] = 1771101218;
        ji.ktxl[505] = -1211674220;
        ji.ktxl[506] = 1138299211;
        ji.ktxl[507] = 186894737;
        ji.ktxl[508] = 1728446190;
        ji.ktxl[509] = -1954999672;
        ji.ktxl[510] = 771230331;
        ji.ktxl[511] = -548813835;
        ji.ktxl[512] = -276765656;
        ji.ktxl[513] = 1596014428;
        ji.ktxl[514] = 848888009;
        ji.ktxl[515] = -1199143945;
        ji.ktxl[516] = 411004713;
        ji.ktxl[517] = -611732646;
        ji.ktxl[518] = 960930107;
        ji.ktxl[519] = 628910108;
        ji.ktxl[520] = -1775580011;
        ji.ktxl[521] = 636040366;
        ji.ktxl[522] = 1338095154;
        ji.ktxl[523] = 974446118;
        ji.ktxl[524] = -2142079143;
        ji.ktxl[525] = -2098140018;
        ji.ktxl[526] = 582025575;
        ji.ktxl[527] = -1289747966;
        ji.ktxl[528] = -225957177;
        ji.ktxl[529] = -625890205;
        ji.ktxl[530] = 282551949;
        ji.ktxl[531] = -1077465380;
        ji.ktxl[532] = 614948593;
        ji.ktxl[533] = -799784158;
        ji.ktxl[534] = 1770446276;
        ji.ktxl[535] = 2129419355;
        ji.ktxl[536] = -979926171;
        ji.ktxl[537] = 378661169;
        ji.ktxl[538] = 1946118791;
        ji.ktxl[539] = -2025597661;
        ji.ktxl[540] = -1586621051;
        ji.ktxl[541] = -153563268;
        ji.ktxl[542] = 1438802884;
        ji.ktxl[543] = 1650922251;
        ji.ktxl[544] = 1139403269;
        ji.ktxl[545] = 520353686;
        ji.ktxl[546] = -487095563;
        ji.ktxl[547] = -135204589;
        ji.ktxl[548] = 1555700038;
        ji.ktxl[549] = 2072724645;
        ji.ktxl[550] = -1512013242;
        ji.ktxl[551] = -448489752;
        ji.ktxl[552] = 516843494;
        ji.ktxl[553] = 1235764881;
        ji.ktxl[554] = -1789010059;
        ji.ktxl[555] = -836062161;
        ji.ktxl[556] = 1172055897;
        ji.ktxl[557] = -436793493;
        ji.ktxl[558] = 695815885;
        ji.ktxl[559] = -1355326815;
        ji.ktxl[560] = -1366978807;
        ji.ktxl[561] = -1568976410;
        ji.ktxl[562] = 688000559;
        ji.ktxl[563] = -163586992;
        ji.ktxl[564] = 1321591983;
        ji.ktxl[565] = 1637954994;
        ji.ktxl[566] = 424514275;
        ji.ktxl[567] = 1772924145;
        ji.ktxl[568] = -785065355;
        ji.ktxl[569] = -1943554078;
        ji.ktxl[570] = 1424503865;
        ji.ktxl[571] = 445448977;
        ji.ktxl[572] = 1515615449;
        ji.ktxl[573] = 1086955337;
        ji.ktxl[574] = -1551073715;
        ji.ktxl[575] = -439624348;
        ji.ktxl[576] = 121825480;
        ji.ktxl[577] = 95788771;
        ji.ktxl[578] = 397241143;
        ji.ktxl[579] = 1201136145;
        ji.ktxl[580] = -954645326;
        ji.ktxl[581] = -1969235617;
        ji.ktxl[582] = -555380930;
        ji.ktxl[583] = -1020375076;
        ji.ktxl[584] = -1714208668;
        ji.ktxl[585] = 333987129;
        ji.ktxl[586] = -1837742862;
        ji.ktxl[587] = -324039888;
        ji.ktxl[588] = 229353347;
        ji.ktxl[589] = -205386312;
        ji.ktxl[590] = -1007772032;
        ji.ktxl[591] = 892581847;
        ji.ktxl[592] = -1904295430;
        ji.ktxl[593] = -398840324;
        ji.ktxl[594] = -984998330;
        ji.ktxl[595] = -1043785413;
        ji.ktxl[596] = -551658031;
        ji.ktxl[597] = 174925755;
        ji.ktxl[598] = -2116227256;
        ji.ktxl[599] = 162304510;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void removeParticle(int var1_1, ji$GlowParticle var2_2) {
        block94: {
            block93: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxtf", ktyv(int ), (int)489)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ji.ktxn("kxtg", ktxk(int ), (int)1108)) break;
                    v0 /* !! */  = (long)ji.ktxn("kxth", ktxk(int ), (int)1109);
                }
                var6_3 = ji.c;
                v1 /* !! */  = ji.tf;
                if (true) ** GOTO lbl11
                block61: while (true) {
                    v1 /* !! */  = (long)(v2 - ji.ktxn("kxti", ktyv(int ), (int)490));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 733325436: {
                            break block61;
                        }
                        case 1102286003: {
                            v2 = ji.ktxn("kxtj", ktyv(int ), (int)491);
                            continue block61;
                        }
                        case 1671868030: {
                            v2 = ji.ktxn("kxtk", ktyv(int ), (int)492);
                            continue block61;
                        }
                    }
                    break;
                }
                var5_4 /* !! */  = ji.b;
                v3 /* !! */  = ji.tf;
                if (true) ** GOTO lbl25
                block62: while (true) {
                    v3 /* !! */  = (long)(ji.ktxn("kxtm", ktyv(int ), (int)494) - ji.ktxn("kxtl", ktyv(int ), (int)493));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1256364003: {
                            continue block62;
                        }
                        case 733325436: {
                            break block62;
                        }
                    }
                    break;
                }
                var4_5 = ji.a;
                if (var6_3) {
                    throw null;
lbl33:
                    // 11 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl33
                v4 /* !! */  = ji.tf;
                if (true) ** GOTO lbl40
                block64: while (true) {
                    v4 /* !! */  = (long)(v5 - ji.ktxn("kxtn", ktyv(int ), (int)495));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -538228101: {
                            v5 = ji.ktxn("kxto", ktyv(int ), (int)496);
                            continue block64;
                        }
                        case -505198176: {
                            v5 = ji.ktxn("kxtp", ktyv(int ), (int)497);
                            continue block64;
                        }
                        case 733325436: {
                            break block64;
                        }
                        case 762853508: {
                            v5 = ji.ktxn("kxtq", ktyv(int ), (int)498);
                            continue block64;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxtr", ktyv(int ), (int)499)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ji.ktxn("kxts", ktxk(int ), (int)1110)) break;
                    v6 /* !! */  = (long)ji.ktxn("kxtt", ktxk(int ), (int)1111);
                }
                var3_6 = this.particles.size() - ji.ktxn("kxtu", ktxk(int ), (int)1112);
                if (var4_5 || var4_5) ** GOTO lbl33
                if (var1_1 == var3_6) break block93;
                if (var4_5) ** GOTO lbl33
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxtv", ktyv(int ), (int)500)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ji.ktxn("kxtw", ktxk(int ), (int)1113)) break;
                    v7 /* !! */  = (long)ji.ktxn("kxtx", ktxk(int ), (int)1114);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kxty", ktyv(int ), (int)501)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ji.ktxn("kxtz", ktxk(int ), (int)1115)) break;
                    v8 /* !! */  = (long)ji.ktxn("kxua", ktxk(int ), (int)1116);
                }
                v9 /* !! */  = ji.tf;
                if (true) ** GOTO lbl75
                block68: while (true) {
                    v9 /* !! */  = (long)(v10 - ji.ktxn("kxub", ktyv(int ), (int)502));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -974402463: {
                            v10 = ji.ktxn("kxuc", ktyv(int ), (int)503);
                            continue block68;
                        }
                        case 733325436: {
                            break block68;
                        }
                        case 1702200967: {
                            v10 = ji.ktxn("kxud", ktyv(int ), (int)504);
                            continue block68;
                        }
                        case 2104571873: {
                            v10 = ji.ktxn("kxue", ktyv(int ), (int)505);
                            continue block68;
                        }
                    }
                    break;
                }
                v11 /* !! */  = ji.tf;
                if (true) ** GOTO lbl91
                block69: while (true) {
                    v11 /* !! */  = (long)(ji.ktxn("kxug", ktyv(int ), (int)507) - ji.ktxn("kxuf", ktyv(int ), (int)506));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1690044125: {
                            continue block69;
                        }
                        case 733325436: {
                            break block69;
                        }
                    }
                    break;
                }
                this.particles.set(var1_1, this.particles.get(var3_6));
                if (var4_5) ** GOTO lbl33
            }
            if (var4_5 || var4_5) ** GOTO lbl33
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kxuh", ktyv(int ), (int)508)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ji.ktxn("kxui", ktxk(int ), (int)1117)) break;
                v12 /* !! */  = (long)ji.ktxn("kxuj", ktxk(int ), (int)1118);
            }
            v13 /* !! */  = ji.tf;
            if (true) ** GOTO lbl110
            block71: while (true) {
                v13 /* !! */  = (long)(v14 - ji.ktxn("kxuk", ktyv(int ), (int)509));
lbl110:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1798158632: {
                        v14 = ji.ktxn("kxul", ktyv(int ), (int)510);
                        continue block71;
                    }
                    case 733325436: {
                        break block71;
                    }
                    case 1933419581: {
                        v14 = ji.ktxn("kxum", ktyv(int ), (int)511);
                        continue block71;
                    }
                }
                break;
            }
            this.particles.removeLast();
            if (var4_5 || var4_5) ** GOTO lbl33
            v15 /* !! */  = ji.tf;
            if (true) ** GOTO lbl126
            block72: while (true) {
                v15 /* !! */  = (long)(ji.ktxn("kxuo", ktyv(int ), (int)513) - ji.ktxn("kxun", ktyv(int ), (int)512));
lbl126:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1616349886: {
                        continue block72;
                    }
                    case 733325436: {
                        break block72;
                    }
                }
                break;
            }
            v16 = var2_2.kind;
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kxup", ktyv(int ), (int)514)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == ji.ktxn("kxuq", ktxk(int ), (int)1119)) break;
                v17 /* !! */  = (long)ji.ktxn("kxur", ktxk(int ), (int)1120);
            }
            if (v16 != ji$ParticleKind.AMBIENT) break block94;
            if (var4_5) ** GOTO lbl33
            v18 /* !! */  = ji.tf;
            if (true) ** GOTO lbl143
            block74: while (true) {
                v18 /* !! */  = (long)(v19 - ji.ktxn("kxus", ktyv(int ), (int)515));
lbl143:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1886792188: {
                        v19 = ji.ktxn("kxut", ktyv(int ), (int)516);
                        continue block74;
                    }
                    case 733325436: {
                        break block74;
                    }
                    case 1023745947: {
                        v19 = ji.ktxn("kxuu", ktyv(int ), (int)517);
                        continue block74;
                    }
                    case 1980284649: {
                        v19 = ji.ktxn("kxuv", ktyv(int ), (int)518);
                        continue block74;
                    }
                }
                break;
            }
            v20 = this.ambientParticleCount - ji.ktxn("kxuw", ktxk(int ), (int)1121);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kxux", ktyv(int ), (int)519)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == ji.ktxn("kxuy", ktxk(int ), (int)1122)) break;
                v21 /* !! */  = (long)ji.ktxn("kxuz", ktxk(int ), (int)1123);
            }
            this.ambientParticleCount = v20;
            if (var4_5) ** GOTO lbl33
        }
        if (var4_5 || var4_5) ** GOTO lbl33
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_7 = ji.tf - ji.ktxn("kxva", ktyv(int ), (int)520)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == ji.ktxn("kxvb", ktxk(int ), (int)1124)) break;
            v22 /* !! */  = (long)ji.ktxn("kxvc", ktxk(int ), (int)1125);
        }
        this.recycle(var2_2);
        if (var4_5) ** GOTO lbl33
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_5) ** break;
                ** continue;
                return;
            }
lbl178:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvd", ktxk(int ), (int)1126);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 1: {
                var5_4 /* !! */  = (int)ji.ktxn("kxve", ktxk(int ), (int)1127);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl188:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvf", ktxk(int ), (int)1128);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl193:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvg", ktxk(int ), (int)1129);
                if (var6_3) {
                    throw null;
                }
            }
lbl197:
            // 4 sources

            case 4: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvh", ktxk(int ), (int)1130);
                if (!var6_3) ** GOTO lbl193
                throw null;
            }
lbl201:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvi", ktxk(int ), (int)1131);
                if (!var6_3) break;
                throw null;
            }
            case 6: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvj", ktxk(int ), (int)1132);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 7: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvk", ktxk(int ), (int)1133);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 8: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvl", ktxk(int ), (int)1134);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 9: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvm", ktxk(int ), (int)1135);
                if (!var6_3) ** GOTO lbl193
                throw null;
            }
lbl224:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvn", ktxk(int ), (int)1136);
                if (!var6_3) ** GOTO lbl178
                throw null;
            }
lbl228:
            // 2 sources

            case 11: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvo", ktxk(int ), (int)1137);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl233:
            // 3 sources

            case 12: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvp", ktxk(int ), (int)1138);
                if (!var6_3) ** GOTO lbl224
                throw null;
            }
lbl237:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvq", ktxk(int ), (int)1139);
                if (!var6_3) ** GOTO lbl188
                throw null;
            }
            case 14: {
                do {
                    var5_4 /* !! */  = (int)ji.ktxn("kxvr", ktxk(int ), (int)1140);
                } while (!var6_3);
                throw null;
            }
lbl246:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)ji.ktxn("kxvs", ktxk(int ), (int)1141);
                if (!var6_3) ** GOTO lbl178
                throw null;
            }
lbl250:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ji.ktxn("kxvt", ktxk(int ), (int)1142);
                    if (!var6_3) ** GOTO lbl197
                    throw null;
                }
            }
            case 17: 
        }
        var5_4 /* !! */  = (int)ji.ktxn("kxvu", ktxk(int ), (int)1143);
        ** while (!var6_3)
lbl258:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyi() {
        ji.ktxl[0] = -2017337826;
        ji.ktxl[1] = 157009391;
        ji.ktxl[2] = -1630943083;
        ji.ktxl[3] = -1431202901;
        ji.ktxl[4] = 1864423492;
        ji.ktxl[5] = 776712617;
        ji.ktxl[6] = -1819337733;
        ji.ktxl[7] = 1000554138;
        ji.ktxl[8] = 1727230446;
        ji.ktxl[9] = 1812374332;
        ji.ktxl[10] = -1330997271;
        ji.ktxl[11] = -1104631075;
        ji.ktxl[12] = 1359290097;
        ji.ktxl[13] = 759873679;
        ji.ktxl[14] = 1057318018;
        ji.ktxl[15] = -1784098754;
        ji.ktxl[16] = -754026446;
        ji.ktxl[17] = -2115634421;
        ji.ktxl[18] = -1622923756;
        ji.ktxl[19] = -230292240;
        ji.ktxl[20] = 1558903051;
        ji.ktxl[21] = 526586271;
        ji.ktxl[22] = -911527782;
        ji.ktxl[23] = -1531062568;
        ji.ktxl[24] = 1811803570;
        ji.ktxl[25] = -887060489;
        ji.ktxl[26] = 915491976;
        ji.ktxl[27] = 1180451273;
        ji.ktxl[28] = 129137746;
        ji.ktxl[29] = 1734169454;
        ji.ktxl[30] = -1333838199;
        ji.ktxl[31] = 1550036405;
        ji.ktxl[32] = 1701175453;
        ji.ktxl[33] = 688266701;
        ji.ktxl[34] = -547557157;
        ji.ktxl[35] = 1278338937;
        ji.ktxl[36] = 1772804854;
        ji.ktxl[37] = -2141675760;
        ji.ktxl[38] = -238105412;
        ji.ktxl[39] = -610616252;
        ji.ktxl[40] = -207189477;
        ji.ktxl[41] = -1834312109;
        ji.ktxl[42] = -851570318;
        ji.ktxl[43] = 945555929;
        ji.ktxl[44] = 621923069;
        ji.ktxl[45] = 56384815;
        ji.ktxl[46] = -791385158;
        ji.ktxl[47] = 113503941;
        ji.ktxl[48] = 1733393507;
        ji.ktxl[49] = 816022282;
        ji.ktxl[50] = -1718121760;
        ji.ktxl[51] = 775834477;
        ji.ktxl[52] = -2118894792;
        ji.ktxl[53] = -1921088525;
        ji.ktxl[54] = -1633494656;
        ji.ktxl[55] = -1344571282;
        ji.ktxl[56] = -432243986;
        ji.ktxl[57] = -775737270;
        ji.ktxl[58] = 431979389;
        ji.ktxl[59] = -1708684136;
        ji.ktxl[60] = -800885017;
        ji.ktxl[61] = -167661780;
        ji.ktxl[62] = 1498482167;
        ji.ktxl[63] = -1829752806;
        ji.ktxl[64] = 1089503680;
        ji.ktxl[65] = -1474789673;
        ji.ktxl[66] = 1644646571;
        ji.ktxl[67] = -543359715;
        ji.ktxl[68] = -708775294;
        ji.ktxl[69] = 1229385212;
        ji.ktxl[70] = 1531992130;
        ji.ktxl[71] = 1402059913;
        ji.ktxl[72] = 899260195;
        ji.ktxl[73] = 629417845;
        ji.ktxl[74] = -813836211;
        ji.ktxl[75] = -833193263;
        ji.ktxl[76] = -1297148010;
        ji.ktxl[77] = 355333518;
        ji.ktxl[78] = -1870634870;
        ji.ktxl[79] = 303154349;
        ji.ktxl[80] = -1389589777;
        ji.ktxl[81] = -1572602513;
        ji.ktxl[82] = -1520662991;
        ji.ktxl[83] = 928101613;
        ji.ktxl[84] = -1145919691;
        ji.ktxl[85] = -1388494252;
        ji.ktxl[86] = 607123977;
        ji.ktxl[87] = -436761499;
        ji.ktxl[88] = 1117663387;
        ji.ktxl[89] = -510093751;
        ji.ktxl[90] = 2067180144;
        ji.ktxl[91] = -849533815;
        ji.ktxl[92] = 1475215938;
        ji.ktxl[93] = 591697831;
        ji.ktxl[94] = -1617014359;
        ji.ktxl[95] = -1888692393;
        ji.ktxl[96] = 1361233280;
        ji.ktxl[97] = 300196671;
        ji.ktxl[98] = -856090462;
        ji.ktxl[99] = 2094639128;
    }

    private static /* synthetic */ void kxyx() {
        ji.ktxm[300] = 498993430;
        ji.ktxm[301] = 668491694;
        ji.ktxm[302] = -775552625;
        ji.ktxm[303] = 1720621997;
        ji.ktxm[304] = -1263203739;
        ji.ktxm[305] = -1088049932;
        ji.ktxm[306] = 1960963440;
        ji.ktxm[307] = -1497150084;
        ji.ktxm[308] = 45334665;
        ji.ktxm[309] = -2093373713;
        ji.ktxm[310] = -1317901122;
        ji.ktxm[311] = 166538163;
        ji.ktxm[312] = 7470359;
        ji.ktxm[313] = -1950293488;
        ji.ktxm[314] = 1789248804;
        ji.ktxm[315] = -1963134319;
        ji.ktxm[316] = -2120708181;
        ji.ktxm[317] = 1146783178;
        ji.ktxm[318] = -897138639;
        ji.ktxm[319] = 2002242345;
        ji.ktxm[320] = -1857997264;
        ji.ktxm[321] = 933147013;
        ji.ktxm[322] = 458809145;
        ji.ktxm[323] = 1609055097;
        ji.ktxm[324] = -129053347;
        ji.ktxm[325] = -1343111976;
        ji.ktxm[326] = 1428777341;
        ji.ktxm[327] = -205159492;
        ji.ktxm[328] = -1778809470;
        ji.ktxm[329] = -11614472;
        ji.ktxm[330] = -2099201911;
        ji.ktxm[331] = 2069066376;
        ji.ktxm[332] = 41153268;
        ji.ktxm[333] = 1836228778;
        ji.ktxm[334] = -313563348;
        ji.ktxm[335] = 2109227184;
        ji.ktxm[336] = -458689504;
        ji.ktxm[337] = -242731632;
        ji.ktxm[338] = -1084316647;
        ji.ktxm[339] = 1121394094;
        ji.ktxm[340] = -40322572;
        ji.ktxm[341] = 1015727170;
        ji.ktxm[342] = 190176101;
        ji.ktxm[343] = 132737026;
        ji.ktxm[344] = 383581575;
        ji.ktxm[345] = -2114256664;
        ji.ktxm[346] = 233911472;
        ji.ktxm[347] = 1467270494;
        ji.ktxm[348] = 1754008786;
        ji.ktxm[349] = 481447557;
        ji.ktxm[350] = 1316741804;
        ji.ktxm[351] = 22836403;
        ji.ktxm[352] = -387049962;
        ji.ktxm[353] = -597526433;
        ji.ktxm[354] = 831580203;
        ji.ktxm[355] = -1735321333;
        ji.ktxm[356] = -1811874784;
        ji.ktxm[357] = -1877202187;
        ji.ktxm[358] = -570961914;
        ji.ktxm[359] = 1886510485;
        ji.ktxm[360] = 783198926;
        ji.ktxm[361] = 1443858479;
        ji.ktxm[362] = -289767615;
        ji.ktxm[363] = -65845503;
        ji.ktxm[364] = 1232449489;
        ji.ktxm[365] = 54872791;
        ji.ktxm[366] = 969114988;
        ji.ktxm[367] = 1880180238;
        ji.ktxm[368] = 1543248820;
        ji.ktxm[369] = -1090376376;
        ji.ktxm[370] = 224825163;
        ji.ktxm[371] = 1943494496;
        ji.ktxm[372] = -1543442660;
        ji.ktxm[373] = -1972533404;
        ji.ktxm[374] = -651501639;
        ji.ktxm[375] = 312671382;
        ji.ktxm[376] = -291465136;
        ji.ktxm[377] = -1456515126;
        ji.ktxm[378] = 1229583049;
        ji.ktxm[379] = -734971236;
        ji.ktxm[380] = 1327842555;
        ji.ktxm[381] = -95867832;
        ji.ktxm[382] = -556617939;
        ji.ktxm[383] = 1649068349;
        ji.ktxm[384] = -1159459791;
        ji.ktxm[385] = 1018207631;
        ji.ktxm[386] = 310626779;
        ji.ktxm[387] = -1468682245;
        ji.ktxm[388] = -1976290129;
        ji.ktxm[389] = -529968603;
        ji.ktxm[390] = 209076205;
        ji.ktxm[391] = 1195248674;
        ji.ktxm[392] = 2073959270;
        ji.ktxm[393] = 2118630559;
        ji.ktxm[394] = 148572872;
        ji.ktxm[395] = 839130138;
        ji.ktxm[396] = 1278443066;
        ji.ktxm[397] = -312145650;
        ji.ktxm[398] = 547189376;
        ji.ktxm[399] = -1638978563;
    }

    private static /* synthetic */ void kxzc() {
        ji.ktxm[800] = 1315375525;
        ji.ktxm[801] = 225518201;
        ji.ktxm[802] = -492681629;
        ji.ktxm[803] = -61865181;
        ji.ktxm[804] = 1074223104;
        ji.ktxm[805] = -2028921670;
        ji.ktxm[806] = 1992559547;
        ji.ktxm[807] = 492741961;
        ji.ktxm[808] = 1609493699;
        ji.ktxm[809] = 349403359;
        ji.ktxm[810] = 713118483;
        ji.ktxm[811] = 1574833060;
        ji.ktxm[812] = 1511531678;
        ji.ktxm[813] = -675882220;
        ji.ktxm[814] = 1653248098;
        ji.ktxm[815] = 304926919;
        ji.ktxm[816] = 560445272;
        ji.ktxm[817] = 1988223144;
        ji.ktxm[818] = 634805612;
        ji.ktxm[819] = -1574832747;
        ji.ktxm[820] = 660204751;
        ji.ktxm[821] = -942388552;
        ji.ktxm[822] = 1765695594;
        ji.ktxm[823] = -1992135401;
        ji.ktxm[824] = 1306500669;
        ji.ktxm[825] = 2131992620;
        ji.ktxm[826] = 783382761;
        ji.ktxm[827] = -844951154;
        ji.ktxm[828] = -835483716;
        ji.ktxm[829] = -1171555609;
        ji.ktxm[830] = -379496718;
        ji.ktxm[831] = 709646028;
        ji.ktxm[832] = 351579659;
        ji.ktxm[833] = 954790969;
        ji.ktxm[834] = -972038038;
        ji.ktxm[835] = -1854517825;
        ji.ktxm[836] = -983901038;
        ji.ktxm[837] = -2026117992;
        ji.ktxm[838] = 436406460;
        ji.ktxm[839] = -2125935282;
        ji.ktxm[840] = -282689629;
        ji.ktxm[841] = -1591743856;
        ji.ktxm[842] = -1972633932;
        ji.ktxm[843] = -2076912537;
        ji.ktxm[844] = -985833726;
        ji.ktxm[845] = -325423881;
        ji.ktxm[846] = -747055954;
        ji.ktxm[847] = 163150168;
        ji.ktxm[848] = 1375337639;
        ji.ktxm[849] = -1554379676;
        ji.ktxm[850] = 806749935;
        ji.ktxm[851] = 246938206;
        ji.ktxm[852] = 1246469058;
        ji.ktxm[853] = 1834432480;
        ji.ktxm[854] = -1546156974;
        ji.ktxm[855] = 580895611;
        ji.ktxm[856] = 102839294;
        ji.ktxm[857] = 2006767838;
        ji.ktxm[858] = 366419238;
        ji.ktxm[859] = -1577812596;
        ji.ktxm[860] = 460969225;
        ji.ktxm[861] = 1767590504;
        ji.ktxm[862] = -1345291178;
        ji.ktxm[863] = 1010662042;
        ji.ktxm[864] = 907624020;
        ji.ktxm[865] = 1557598107;
        ji.ktxm[866] = 513871562;
        ji.ktxm[867] = 1552880495;
        ji.ktxm[868] = -1601720553;
        ji.ktxm[869] = 1156054357;
        ji.ktxm[870] = -1831568115;
        ji.ktxm[871] = -170669460;
        ji.ktxm[872] = -403688809;
        ji.ktxm[873] = -1311454420;
        ji.ktxm[874] = 256678704;
        ji.ktxm[875] = -1073461350;
        ji.ktxm[876] = -203363157;
        ji.ktxm[877] = 1940803181;
        ji.ktxm[878] = -909831936;
        ji.ktxm[879] = -330262243;
        ji.ktxm[880] = 217159255;
        ji.ktxm[881] = 1217153037;
        ji.ktxm[882] = 1695576296;
        ji.ktxm[883] = -572757790;
        ji.ktxm[884] = 362055250;
        ji.ktxm[885] = -285517344;
        ji.ktxm[886] = 2069506740;
        ji.ktxm[887] = -400283412;
        ji.ktxm[888] = -1291983636;
        ji.ktxm[889] = -1213709703;
        ji.ktxm[890] = -675004408;
        ji.ktxm[891] = 2063588369;
        ji.ktxm[892] = -1480797656;
        ji.ktxm[893] = -1831669683;
        ji.ktxm[894] = 285493820;
        ji.ktxm[895] = 926652022;
        ji.ktxm[896] = -1449881412;
        ji.ktxm[897] = 394490640;
        ji.ktxm[898] = -1853706478;
        ji.ktxm[899] = 1570096860;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double findGround(double var1_1, double var3_2, double var5_3, class_2338.class_2339 var7_4) {
        v0 /* !! */  = ji.tf;
        if (true) ** GOTO lbl5
        block82: while (true) {
            v0 /* !! */  = (long)(v1 - ji.ktxn("kxjq", ktyv(int ), (int)407));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1805818162: {
                    v1 = ji.ktxn("kxjr", ktyv(int ), (int)408);
                    continue block82;
                }
                case 18880058: {
                    v1 = ji.ktxn("kxjs", ktyv(int ), (int)409);
                    continue block82;
                }
                case 733325436: {
                    break block82;
                }
                case 843641829: {
                    v1 = ji.ktxn("kxju", ktyv(int ), (int)410);
                    continue block82;
                }
            }
            break;
        }
        var14_5 = ji.c;
        v2 /* !! */  = ji.tf;
        if (true) ** GOTO lbl22
        block83: while (true) {
            v2 /* !! */  = (long)(v3 - ji.ktxn("kxjv", ktyv(int ), (int)411));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -123868605: {
                    v3 = ji.ktxn("kxjw", ktyv(int ), (int)412);
                    continue block83;
                }
                case 325042000: {
                    v3 = ji.ktxn("kxjx", ktyv(int ), (int)413);
                    continue block83;
                }
                case 706628778: {
                    v3 = ji.ktxn("kxjy", ktyv(int ), (int)414);
                    continue block83;
                }
                case 733325436: {
                    break block83;
                }
            }
            break;
        }
        var13_6 /* !! */  = ji.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxjz", ktyv(int ), (int)415)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ji.ktxn("kxka", ktxk(int ), (int)956)) break;
            v4 /* !! */  = (long)ji.ktxn("kxkb", ktxk(int ), (int)957);
        }
        var12_7 = ji.a;
        if (var14_5) {
            throw null;
lbl43:
            // 13 sources

            return (double)ji.ktxn("kxkd", kufx(int ), (int)416);
        }
        if (var12_7 || var12_7) ** GOTO lbl43
        v5 /* !! */  = ji.tf;
        if (true) ** GOTO lbl50
        block86: while (true) {
            v5 /* !! */  = (long)(v6 - ji.ktxn("kxke", ktyv(int ), (int)417));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1159499308: {
                    v6 = ji.ktxn("kxkf", ktyv(int ), (int)418);
                    continue block86;
                }
                case -494599617: {
                    v6 = ji.ktxn("kxkg", ktyv(int ), (int)419);
                    continue block86;
                }
                case 733325436: {
                    break block86;
                }
            }
            break;
        }
        var8_8 = (int)Math.floor(var5_3);
        if (var12_7 || var12_7) ** GOTO lbl43
        v7 /* !! */  = ji.tf;
        if (true) ** GOTO lbl65
        block87: while (true) {
            v7 /* !! */  = (long)(v8 - ji.ktxn("kxkh", ktyv(int ), (int)420));
lbl65:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1279359753: {
                    v8 = ji.ktxn("kxki", ktyv(int ), (int)421);
                    continue block87;
                }
                case 194159831: {
                    v8 = ji.ktxn("kxkj", ktyv(int ), (int)422);
                    continue block87;
                }
                case 225497589: {
                    v8 = ji.ktxn("kxkl", ktyv(int ), (int)423);
                    continue block87;
                }
                case 733325436: {
                    break block87;
                }
            }
            break;
        }
        v9 /* !! */  = ji.tf;
        if (true) ** GOTO lbl81
        block88: while (true) {
            v9 /* !! */  = (long)(v10 - ji.ktxn("kxkm", ktyv(int ), (int)424));
lbl81:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -383640823: {
                    v10 = ji.ktxn("kxkn", ktyv(int ), (int)425);
                    continue block88;
                }
                case 443825016: {
                    v10 = ji.ktxn("kxko", ktyv(int ), (int)426);
                    continue block88;
                }
                case 733325436: {
                    break block88;
                }
            }
            break;
        }
        v11 = ji.mc.field_1687;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxkp", ktyv(int ), (int)427)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ji.ktxn("kxkq", ktxk(int ), (int)958)) break;
            v12 /* !! */  = (long)ji.ktxn("kxkr", ktxk(int ), (int)959);
        }
        v13 = v11.method_31607();
        v14 = var8_8 - ji.ktxn("kxks", ktxk(int ), (int)960);
        v15 /* !! */  = ji.tf;
        if (true) ** GOTO lbl102
        block90: while (true) {
            v15 /* !! */  = (long)(v16 - ji.ktxn("kxku", ktyv(int ), (int)428));
lbl102:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1399267167: {
                    v16 = ji.ktxn("kxkv", ktyv(int ), (int)429);
                    continue block90;
                }
                case 608203633: {
                    v16 = ji.ktxn("kxkw", ktyv(int ), (int)430);
                    continue block90;
                }
                case 733325436: {
                    break block90;
                }
                case 1565802111: {
                    v16 = ji.ktxn("kxkx", ktyv(int ), (int)431);
                    continue block90;
                }
            }
            break;
        }
        var9_9 = Math.max(v13, v14);
        if (var12_7 || var12_7) ** GOTO lbl43
        var10_10 = var8_8;
        if (var12_7) ** GOTO lbl43
        block91: while (true) {
            if (var12_7 || var12_7) ** GOTO lbl43
            if (var13_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var10_10 < var9_9) ** GOTO lbl220
                    if (var12_7 || var12_7) ** GOTO lbl43
                    v17 = var10_10;
                    v18 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl130
                    block92: while (true) {
                        v18 /* !! */  = (long)(v19 - ji.ktxn("kxkz", ktyv(int ), (int)432));
lbl130:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -601395118: {
                                v19 = ji.ktxn("kxla", ktyv(int ), (int)433);
                                continue block92;
                            }
                            case 733325436: {
                                break block92;
                            }
                            case 1165258312: {
                                v19 = ji.ktxn("kxlb", ktyv(int ), (int)434);
                                continue block92;
                            }
                        }
                        break;
                    }
                    var7_4.method_10102(var1_1, v17, var3_2);
                    if (var12_7 || var12_7) ** GOTO lbl43
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxld", ktyv(int ), (int)435)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == ji.ktxn("kxle", ktxk(int ), (int)961)) break;
                        v20 /* !! */  = (long)ji.ktxn("kxlf", ktxk(int ), (int)962);
                    }
                    v21 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl151
                    block94: while (true) {
                        v21 /* !! */  = (long)(v22 - ji.ktxn("kxlg", ktyv(int ), (int)436));
lbl151:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1273478795: {
                                v22 = ji.ktxn("kxlh", ktyv(int ), (int)437);
                                continue block94;
                            }
                            case 163741743: {
                                v22 = ji.ktxn("kxli", ktyv(int ), (int)438);
                                continue block94;
                            }
                            case 733325436: {
                                break block94;
                            }
                            case 1030897247: {
                                v22 = ji.ktxn("kxlj", ktyv(int ), (int)439);
                                continue block94;
                            }
                        }
                        break;
                    }
                    v23 = ji.mc.field_1687;
                    v24 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl168
                    block95: while (true) {
                        v24 /* !! */  = (long)(v25 - ji.ktxn("kxlk", ktyv(int ), (int)440));
lbl168:
                        // 2 sources

                        switch ((int)v24 /* !! */ ) {
                            case -323813402: {
                                v25 = ji.ktxn("kxll", ktyv(int ), (int)441);
                                continue block95;
                            }
                            case 733325436: {
                                break block95;
                            }
                            case 1313543267: {
                                v25 = ji.ktxn("kxlm", ktyv(int ), (int)442);
                                continue block95;
                            }
                        }
                        break;
                    }
                    var11_11 = v23.method_8320((class_2338)var7_4);
                    if (var12_7 || var12_7) ** GOTO lbl43
                    v26 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl183
                    block96: while (true) {
                        v26 /* !! */  = (long)(ji.ktxn("kxlp", ktyv(int ), (int)444) - ji.ktxn("kxln", ktyv(int ), (int)443));
lbl183:
                        // 2 sources

                        switch ((int)v26 /* !! */ ) {
                            case 733325436: {
                                break block96;
                            }
                            case 1416189416: {
                                continue block96;
                            }
                        }
                        break;
                    }
                    if (var11_11.method_26215()) ** GOTO lbl215
                    if (var12_7) ** GOTO lbl43
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kxlq", ktyv(int ), (int)445)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == ji.ktxn("kxlr", ktxk(int ), (int)963)) break;
                        v27 /* !! */  = (long)ji.ktxn("kxls", ktxk(int ), (int)964);
                    }
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kxlt", ktyv(int ), (int)446)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == ji.ktxn("kxlu", ktxk(int ), (int)965)) break;
                        v28 /* !! */  = (long)ji.ktxn("kxlv", ktxk(int ), (int)966);
                    }
                    v29 = ji.mc.field_1687;
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kxlw", ktyv(int ), (int)447)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == ji.ktxn("kxlx", ktxk(int ), (int)967)) break;
                        v30 /* !! */  = (long)ji.ktxn("kxly", ktxk(int ), (int)968);
                    }
                    v31 = var11_11.method_26220((class_1922)v29, (class_2338)var7_4);
                    while (true) {
                        if ((v32 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kxma", ktyv(int ), (int)448)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v32 /* !! */  == ji.ktxn("kxmb", ktxk(int ), (int)969)) break;
                        v32 /* !! */  = (long)ji.ktxn("kxmc", ktxk(int ), (int)970);
                    }
                    if (v31.method_1110()) ** GOTO lbl215
                    if (var12_7 || var12_7) ** GOTO lbl43
                    return (double)var10_10 + 1.0;
lbl215:
                    // 2 sources

                    if (var12_7 || var12_7) ** GOTO lbl43
                    --var10_10;
                    if (var12_7) ** GOTO lbl43
                    if (!var14_5) continue block91;
                    throw null;
lbl220:
                    // 1 sources

                    if (!var12_7 && !var12_7) ** break;
                    ** continue;
                    return (double)ji.ktxn("kxmd", kufx(int ), (int)449);
                }
lbl223:
                // 3 sources

                case 0: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxme", ktxk(int ), (int)971);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
                case 1: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmg", ktxk(int ), (int)972);
                    if (!var14_5) ** GOTO lbl223
                    throw null;
                }
lbl232:
                // 3 sources

                case 2: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmh", ktxk(int ), (int)973);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
lbl237:
                // 2 sources

                case 3: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmi", ktxk(int ), (int)974);
                    if (!var14_5) ** GOTO lbl223
                    throw null;
                }
lbl241:
                // 3 sources

                case 4: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmj", ktxk(int ), (int)975);
                    if (!var14_5) ** GOTO lbl232
                    throw null;
                }
lbl245:
                // 2 sources

                case 5: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmk", ktxk(int ), (int)976);
                    if (!var14_5) ** GOTO lbl232
                    throw null;
                }
                case 6: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxml", ktxk(int ), (int)977);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
                case 7: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmm", ktxk(int ), (int)978);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl323
                }
lbl259:
                // 2 sources

                case 8: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmn", ktxk(int ), (int)979);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl283
                }
                case 9: {
                    do {
                        var13_6 /* !! */  = (int)ji.ktxn("kxmp", ktxk(int ), (int)980);
                    } while (!var14_5);
                    throw null;
                }
lbl269:
                // 2 sources

                case 10: {
                    do {
                        var13_6 /* !! */  = (int)ji.ktxn("kxmq", ktxk(int ), (int)981);
                    } while (!var14_5);
                    throw null;
                }
                case 11: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmr", ktxk(int ), (int)982);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl314
                }
lbl279:
                // 3 sources

                case 12: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmt", ktxk(int ), (int)983);
                    if (!var14_5) ** GOTO lbl241
                    throw null;
                }
lbl283:
                // 3 sources

                case 13: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_6 /* !! */  = (int)ji.ktxn("kxmu", ktxk(int ), (int)984);
                        if (var14_5) {
                            throw null;
                        }
                        ** GOTO lbl314
                        break;
                    }
                }
lbl289:
                // 2 sources

                case 14: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmv", ktxk(int ), (int)985);
                    if (!var14_5) ** GOTO lbl269
                    throw null;
                }
                case 15: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmw", ktxk(int ), (int)986);
                    if (!var14_5) ** GOTO lbl279
                    throw null;
                }
                case 16: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmy", ktxk(int ), (int)987);
                    if (!var14_5) ** GOTO lbl259
                    throw null;
                }
                case 17: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxmz", ktxk(int ), (int)988);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl314
                }
                case 18: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxna", ktxk(int ), (int)989);
                    if (!var14_5) ** GOTO lbl245
                    throw null;
                }
lbl310:
                // 3 sources

                case 19: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxnb", ktxk(int ), (int)990);
                    if (!var14_5) ** GOTO lbl289
                    throw null;
                }
lbl314:
                // 4 sources

                case 20: {
                    do {
                        var13_6 /* !! */  = (int)ji.ktxn("kxnc", ktxk(int ), (int)991);
                    } while (!var14_5);
                    throw null;
                }
                case 21: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxne", ktxk(int ), (int)992);
                    if (!var14_5) ** GOTO lbl241
                    throw null;
                }
lbl323:
                // 2 sources

                case 22: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxnf", ktxk(int ), (int)993);
                    if (var14_5) {
                        throw null;
                    }
                }
                case 23: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxng", ktxk(int ), (int)994);
                    if (!var14_5) ** GOTO lbl279
                    throw null;
                }
                case 24: {
                    var13_6 /* !! */  = (int)ji.ktxn("kxnh", ktxk(int ), (int)995);
                    if (!var14_5) ** GOTO lbl283
                    throw null;
                }
                case 25: 
            }
            break;
        }
        var13_6 /* !! */  = (int)ji.ktxn("kxni", ktxk(int ), (int)996);
        ** while (!var14_5)
lbl338:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ktxk(int n2) {
        return ktxl[n2] ^ ktxm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void update(float var1_1) {
        var28_2 = ji.c;
        var27_3 /* !! */  = ji.b;
        var26_4 = ji.a;
        if (var28_2) {
            throw null;
lbl6:
            // 47 sources

            return;
        }
        if (var26_4 || var26_4) ** GOTO lbl6
        var2_5 = this.speed.getValue();
        if (var26_4 || var26_4) ** GOTO lbl6
        var3_6 = (float)(System.nanoTime() & ji.ktxn("kuln", ktyv(int ), (int)123)) * ji.ktxn("kulo", ktxr(int ), (int)235);
        if (var26_4 || var26_4) ** GOTO lbl6
        var4_7 = Math.pow((double)ji.ktxn("kulp", kufx(int ), (int)124), (double)var1_1 * ji.ktxn("kulq", kufx(int ), (int)125));
        if (var26_4 || var26_4) ** GOTO lbl6
        var6_8 = this.particles.size() - ji.ktxn("kulr", ktxk(int ), (int)236);
        if (var26_4) ** GOTO lbl6
        block93: while (true) {
            block182: {
                block181: {
                    block180: {
                        block179: {
                            if (var26_4 || var26_4) ** GOTO lbl6
                            if (var6_8 < 0) ** GOTO lbl117
                            if (var26_4 || var26_4) ** GOTO lbl6
                            var7_9 = this.particles.get(var6_8);
                            if (var26_4 || var26_4) ** GOTO lbl6
                            var7_9.age += var1_1;
                            if (var26_4 || var26_4) ** GOTO lbl6
                            if (!(var7_9.age >= var7_9.maxAge)) break block179;
                            if (var26_4 || var26_4) ** GOTO lbl6
                            this.removeParticle(var6_8, var7_9);
                            if (var26_4 || var26_4) ** GOTO lbl6
                            if (var28_2) {
                                throw null;
                            }
                            ** GOTO lbl112
                        }
                        if (var26_4 || var26_4) ** GOTO lbl6
                        if (var7_9.kind == ji$ParticleKind.AMBIENT) break block180;
                        if (var26_4 || var26_4) ** GOTO lbl6
                        if (this.updateEventParticle(var7_9, var1_1, var4_7)) ** GOTO lbl112
                        if (var26_4 || var26_4) ** GOTO lbl6
                        this.removeParticle(var6_8, var7_9);
                        if (var26_4) ** GOTO lbl6
                        if (var28_2) {
                            throw null;
                        }
                        ** GOTO lbl112
                    }
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var8_10 = Math.sin(var7_9.z * ji.ktxn("kuls", kufx(int ), (int)126) + (double)var3_6 * ji.ktxn("kult", kufx(int ), (int)127) + (double)var7_9.phase) * ji.ktxn("kulu", kufx(int ), (int)128) + Math.cos(var7_9.y * ji.ktxn("kulv", kufx(int ), (int)129) - (double)var3_6 * ji.ktxn("kulw", kufx(int ), (int)130)) * ji.ktxn("kulx", kufx(int ), (int)131);
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var10_11 = Math.cos(var7_9.x * ji.ktxn("kuly", kufx(int ), (int)132) - (double)var3_6 * ji.ktxn("kulz", kufx(int ), (int)133) + (double)var7_9.phase) * ji.ktxn("kuma", kufx(int ), (int)134) - Math.sin(var7_9.y * ji.ktxn("kumb", kufx(int ), (int)135) + (double)var3_6 * ji.ktxn("kumc", kufx(int ), (int)136)) * ji.ktxn("kumd", kufx(int ), (int)137);
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var12_12 = var8_10 - var7_9.vx * ji.ktxn("kume", kufx(int ), (int)138);
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var14_13 = var10_11 - var7_9.vz * ji.ktxn("kumf", kufx(int ), (int)139);
                    if (var26_4 || var26_4) ** GOTO lbl6
                    if (!var7_9.falling) break block181;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var16_14 = ji.ktxn("kumg", kufx(int ), (int)140) * (double)var2_5 - var7_9.vy * Math.abs(var7_9.vy) * ji.ktxn("kumh", kufx(int ), (int)141);
                    if (var26_4 || var26_4) ** GOTO lbl6
                    if (var28_2) {
                        throw null;
                    }
                    break block182;
                }
                if (var26_4 || var26_4) ** GOTO lbl6
                var16_14 = ji.ktxn("kumi", kufx(int ), (int)142) * (double)var2_5 - var7_9.vy * ji.ktxn("kumj", kufx(int ), (int)143);
                if (var26_4) ** GOTO lbl6
            }
            if (var26_4 || var26_4) ** GOTO lbl6
            var7_9.vx += var12_12 * (double)var1_1;
            if (var26_4 || var26_4) ** GOTO lbl6
            var7_9.vy += var16_14 * (double)var1_1;
            if (var26_4 || var26_4) ** GOTO lbl6
            var7_9.vz += var14_13 * (double)var1_1;
            if (var27_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var27_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var26_4 || var26_4) ** GOTO lbl6
                    if (!var7_9.falling) ** GOTO lbl81
                    if (var26_4) ** GOTO lbl6
                    v0 = ji.ktxn("kumk", kufx(int ), (int)144);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl83
lbl81:
                    // 1 sources

                    if (var26_4 || var26_4) ** GOTO lbl6
                    v0 = ji.ktxn("kuml", kufx(int ), (int)145);
lbl83:
                    // 2 sources

                    var18_15 = v0 * (double)var2_5;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var7_9.vy = Math.max((double)(-var18_15), Math.min((double)var18_15, var7_9.vy));
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var20_16 = var7_9.x + var7_9.vx * (double)var1_1;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var22_17 = var7_9.y + var7_9.vy * (double)var1_1;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var24_18 = var7_9.z + var7_9.vz * (double)var1_1;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    if (!this.isFree(var20_16, var22_17, var24_18, this.collisionPos)) ** GOTO lbl99
                    if (var26_4) ** GOTO lbl6
                    if (!var7_9.falling) ** GOTO lbl105
                    if (var26_4) ** GOTO lbl6
                    if (!this.isGroundClose(var20_16, var22_17, var24_18, this.collisionPos)) ** GOTO lbl105
                    if (var26_4) ** GOTO lbl6
lbl99:
                    // 2 sources

                    if (var26_4 || var26_4) ** GOTO lbl6
                    this.removeParticle(var6_8, var7_9);
                    if (var26_4 || var26_4) ** GOTO lbl6
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl112
lbl105:
                    // 2 sources

                    if (var26_4 || var26_4) ** GOTO lbl6
                    var7_9.x = var20_16;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var7_9.y = var22_17;
                    if (var26_4 || var26_4) ** GOTO lbl6
                    var7_9.z = var24_18;
                    if (var26_4) ** GOTO lbl6
lbl112:
                    // 5 sources

                    if (var26_4 || var26_4) ** GOTO lbl6
                    --var6_8;
                    if (var26_4) ** GOTO lbl6
                    if (!var28_2) continue block93;
                    throw null;
                }
lbl117:
                // 1 sources

                if (!var26_4 && !var26_4) ** break;
                ** continue;
                return;
lbl120:
                // 3 sources

                case 0: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumm", ktxk(int ), (int)237);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
lbl125:
                // 3 sources

                case 1: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumn", ktxk(int ), (int)238);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl140
                }
                case 2: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumo", ktxk(int ), (int)239);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl512
                }
lbl135:
                // 2 sources

                case 3: {
                    var27_3 /* !! */  = (int)ji.ktxn("kump", ktxk(int ), (int)240);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl329
                }
lbl140:
                // 3 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var27_3 /* !! */  = (int)ji.ktxn("kumq", ktxk(int ), (int)241);
                        if (var28_2) {
                            throw null;
                        }
                        ** GOTO lbl375
                        break;
                    }
                }
                case 5: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumr", ktxk(int ), (int)242);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl437
                }
                case 6: {
                    var27_3 /* !! */  = (int)ji.ktxn("kums", ktxk(int ), (int)243);
                    if (!var28_2) ** GOTO lbl125
                    throw null;
                }
lbl155:
                // 2 sources

                case 7: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumt", ktxk(int ), (int)244);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl160:
                // 2 sources

                case 8: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumu", ktxk(int ), (int)245);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl409
                }
lbl165:
                // 2 sources

                case 9: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumv", ktxk(int ), (int)246);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl198
                }
lbl170:
                // 2 sources

                case 10: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumw", ktxk(int ), (int)247);
                    if (!var28_2) ** GOTO lbl165
                    throw null;
                }
                case 11: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumx", ktxk(int ), (int)248);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl179:
                // 2 sources

                case 12: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumy", ktxk(int ), (int)249);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl503
                }
lbl184:
                // 3 sources

                case 13: {
                    var27_3 /* !! */  = (int)ji.ktxn("kumz", ktxk(int ), (int)250);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
                case 14: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuna", ktxk(int ), (int)251);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
lbl194:
                // 2 sources

                case 15: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunb", ktxk(int ), (int)252);
                    if (!var28_2) ** GOTO lbl170
                    throw null;
                }
lbl198:
                // 3 sources

                case 16: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunc", ktxk(int ), (int)253);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl203:
                // 2 sources

                case 17: {
                    var27_3 /* !! */  = (int)ji.ktxn("kund", ktxk(int ), (int)254);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl338
                }
lbl208:
                // 2 sources

                case 18: {
                    var27_3 /* !! */  = (int)ji.ktxn("kune", ktxk(int ), (int)255);
                    if (!var28_2) ** GOTO lbl194
                    throw null;
                }
                case 19: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunf", ktxk(int ), (int)256);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl516
                }
                case 20: {
                    var27_3 /* !! */  = (int)ji.ktxn("kung", ktxk(int ), (int)257);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl462
                }
lbl222:
                // 3 sources

                case 21: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunh", ktxk(int ), (int)258);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl316
                }
                case 22: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuni", ktxk(int ), (int)259);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl433
                }
lbl232:
                // 2 sources

                case 23: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunj", ktxk(int ), (int)260);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl383
                }
                case 24: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunk", ktxk(int ), (int)261);
                    if (!var28_2) ** GOTO lbl125
                    throw null;
                }
lbl241:
                // 3 sources

                case 25: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunl", ktxk(int ), (int)262);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl453
                }
lbl246:
                // 2 sources

                case 26: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunm", ktxk(int ), (int)263);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl478
                }
lbl251:
                // 2 sources

                case 27: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunn", ktxk(int ), (int)264);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl429
                }
lbl256:
                // 3 sources

                case 28: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuno", ktxk(int ), (int)265);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl338
                }
                case 29: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunp", ktxk(int ), (int)266);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
                case 30: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunq", ktxk(int ), (int)267);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl433
                }
lbl271:
                // 3 sources

                case 31: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunr", ktxk(int ), (int)268);
                    if (!var28_2) ** GOTO lbl184
                    throw null;
                }
                case 32: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuns", ktxk(int ), (int)269);
                    if (!var28_2) ** GOTO lbl198
                    throw null;
                }
                case 33: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunt", ktxk(int ), (int)270);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl441
                }
                case 34: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunu", ktxk(int ), (int)271);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl421
                }
lbl289:
                // 5 sources

                case 35: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunv", ktxk(int ), (int)272);
                    if (!var28_2) ** GOTO lbl203
                    throw null;
                }
lbl293:
                // 3 sources

                case 36: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunw", ktxk(int ), (int)273);
                    if (!var28_2) ** GOTO lbl222
                    throw null;
                }
lbl297:
                // 2 sources

                case 37: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunx", ktxk(int ), (int)274);
                    if (!var28_2) ** GOTO lbl120
                    throw null;
                }
lbl301:
                // 4 sources

                case 38: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuny", ktxk(int ), (int)275);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl458
                }
                case 39: {
                    var27_3 /* !! */  = (int)ji.ktxn("kunz", ktxk(int ), (int)276);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl466
                }
                case 40: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoa", ktxk(int ), (int)277);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl449
                }
lbl316:
                // 2 sources

                case 41: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuob", ktxk(int ), (int)278);
                    if (!var28_2) ** GOTO lbl140
                    throw null;
                }
                case 42: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoc", ktxk(int ), (int)279);
                    if (!var28_2) ** GOTO lbl293
                    throw null;
                }
lbl324:
                // 2 sources

                case 43: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuod", ktxk(int ), (int)280);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl491
                }
lbl329:
                // 2 sources

                case 44: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoe", ktxk(int ), (int)281);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl437
                }
                case 45: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuof", ktxk(int ), (int)282);
                    if (!var28_2) ** GOTO lbl241
                    throw null;
                }
lbl338:
                // 4 sources

                case 46: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuog", ktxk(int ), (int)283);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl478
                }
lbl343:
                // 2 sources

                case 47: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoh", ktxk(int ), (int)284);
                    if (!var28_2) ** GOTO lbl155
                    throw null;
                }
                case 48: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoi", ktxk(int ), (int)285);
                    if (!var28_2) ** GOTO lbl160
                    throw null;
                }
                case 49: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoj", ktxk(int ), (int)286);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl425
                }
lbl356:
                // 2 sources

                case 50: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuok", ktxk(int ), (int)287);
                    if (!var28_2) ** GOTO lbl289
                    throw null;
                }
lbl360:
                // 3 sources

                case 51: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuol", ktxk(int ), (int)288);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
lbl365:
                // 2 sources

                case 52: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuom", ktxk(int ), (int)289);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl392
                }
                case 53: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuon", ktxk(int ), (int)290);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl487
                }
lbl375:
                // 2 sources

                case 54: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoo", ktxk(int ), (int)291);
                    if (!var28_2) ** GOTO lbl289
                    throw null;
                }
                case 55: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuop", ktxk(int ), (int)292);
                    if (!var28_2) ** GOTO lbl343
                    throw null;
                }
lbl383:
                // 4 sources

                case 56: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoq", ktxk(int ), (int)293);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl470
                }
                case 57: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuor", ktxk(int ), (int)294);
                    if (!var28_2) ** GOTO lbl256
                    throw null;
                }
lbl392:
                // 2 sources

                case 58: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuos", ktxk(int ), (int)295);
                    if (!var28_2) ** GOTO lbl256
                    throw null;
                }
lbl396:
                // 2 sources

                case 59: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuot", ktxk(int ), (int)296);
                    if (!var28_2) ** GOTO lbl324
                    throw null;
                }
lbl400:
                // 3 sources

                case 60: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuou", ktxk(int ), (int)297);
                    if (!var28_2) ** GOTO lbl222
                    throw null;
                }
                case 61: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuov", ktxk(int ), (int)298);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl507
                }
lbl409:
                // 2 sources

                case 62: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuow", ktxk(int ), (int)299);
                    if (!var28_2) ** GOTO lbl241
                    throw null;
                }
lbl413:
                // 2 sources

                case 63: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuox", ktxk(int ), (int)300);
                    if (!var28_2) ** GOTO lbl396
                    throw null;
                }
                case 64: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoy", ktxk(int ), (int)301);
                    if (!var28_2) ** GOTO lbl251
                    throw null;
                }
lbl421:
                // 3 sources

                case 65: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuoz", ktxk(int ), (int)302);
                    if (!var28_2) ** GOTO lbl365
                    throw null;
                }
lbl425:
                // 2 sources

                case 66: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupa", ktxk(int ), (int)303);
                    if (!var28_2) ** GOTO lbl356
                    throw null;
                }
lbl429:
                // 2 sources

                case 67: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupb", ktxk(int ), (int)304);
                    if (!var28_2) ** GOTO lbl360
                    throw null;
                }
lbl433:
                // 3 sources

                case 68: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupc", ktxk(int ), (int)305);
                    if (!var28_2) ** GOTO lbl135
                    throw null;
                }
lbl437:
                // 3 sources

                case 69: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupd", ktxk(int ), (int)306);
                    if (!var28_2) ** GOTO lbl383
                    throw null;
                }
lbl441:
                // 2 sources

                case 70: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupe", ktxk(int ), (int)307);
                    if (!var28_2) ** GOTO lbl413
                    throw null;
                }
lbl445:
                // 2 sources

                case 71: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupf", ktxk(int ), (int)308);
                    if (!var28_2) ** GOTO lbl383
                    throw null;
                }
lbl449:
                // 3 sources

                case 72: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupg", ktxk(int ), (int)309);
                    if (!var28_2) ** GOTO lbl184
                    throw null;
                }
lbl453:
                // 2 sources

                case 73: {
                    var27_3 /* !! */  = (int)ji.ktxn("kuph", ktxk(int ), (int)310);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl495
                }
lbl458:
                // 2 sources

                case 74: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupi", ktxk(int ), (int)311);
                    if (!var28_2) ** GOTO lbl400
                    throw null;
                }
lbl462:
                // 2 sources

                case 75: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupj", ktxk(int ), (int)312);
                    if (!var28_2) ** GOTO lbl232
                    throw null;
                }
lbl466:
                // 2 sources

                case 76: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupk", ktxk(int ), (int)313);
                    if (!var28_2) ** GOTO lbl301
                    throw null;
                }
lbl470:
                // 2 sources

                case 77: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupl", ktxk(int ), (int)314);
                    if (!var28_2) ** GOTO lbl421
                    throw null;
                }
                case 78: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupm", ktxk(int ), (int)315);
                    if (!var28_2) ** GOTO lbl301
                    throw null;
                }
lbl478:
                // 3 sources

                case 79: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupn", ktxk(int ), (int)316);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl495
                }
                case 80: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupo", ktxk(int ), (int)317);
                    if (!var28_2) ** GOTO lbl338
                    throw null;
                }
lbl487:
                // 2 sources

                case 81: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupp", ktxk(int ), (int)318);
                    if (!var28_2) ** GOTO lbl360
                    throw null;
                }
lbl491:
                // 2 sources

                case 82: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupq", ktxk(int ), (int)319);
                    if (!var28_2) ** GOTO lbl445
                    throw null;
                }
lbl495:
                // 3 sources

                case 83: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupr", ktxk(int ), (int)320);
                    if (!var28_2) ** GOTO lbl449
                    throw null;
                }
                case 84: {
                    var27_3 /* !! */  = (int)ji.ktxn("kups", ktxk(int ), (int)321);
                    if (!var28_2) ** GOTO lbl246
                    throw null;
                }
lbl503:
                // 2 sources

                case 85: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupt", ktxk(int ), (int)322);
                    if (!var28_2) ** GOTO lbl179
                    throw null;
                }
lbl507:
                // 2 sources

                case 86: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupu", ktxk(int ), (int)323);
                    if (var28_2) {
                        throw null;
                    }
                    ** GOTO lbl516
                }
lbl512:
                // 2 sources

                case 87: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupv", ktxk(int ), (int)324);
                    if (!var28_2) ** GOTO lbl120
                    throw null;
                }
lbl516:
                // 3 sources

                case 88: {
                    var27_3 /* !! */  = (int)ji.ktxn("kupw", ktxk(int ), (int)325);
                    if (!var28_2) ** GOTO lbl289
                    throw null;
                }
                case 89: 
            }
            break;
        }
        var27_3 /* !! */  = (int)ji.ktxn("kupx", ktxk(int ), (int)326);
        ** while (!var28_2)
lbl523:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyu() {
        ji.ktxm[0] = -2017337730;
        ji.ktxm[1] = 157009273;
        ji.ktxm[2] = -1630943147;
        ji.ktxm[3] = -387083349;
        ji.ktxm[4] = 1864423489;
        ji.ktxm[5] = 776712511;
        ji.ktxm[6] = -1384101934;
        ji.ktxm[7] = 109111696;
        ji.ktxm[8] = 1480606429;
        ji.ktxm[9] = 1344631862;
        ji.ktxm[10] = -239429655;
        ji.ktxm[11] = -1104631074;
        ji.ktxm[12] = 1359290089;
        ji.ktxm[13] = 332618005;
        ji.ktxm[14] = 2133156994;
        ji.ktxm[15] = -1461445389;
        ji.ktxm[16] = -754026444;
        ji.ktxm[17] = -2115634426;
        ji.ktxm[18] = -1622923754;
        ji.ktxm[19] = -230292239;
        ji.ktxm[20] = 1558903051;
        ji.ktxm[21] = 526586265;
        ji.ktxm[22] = -911527786;
        ji.ktxm[23] = -1531062570;
        ji.ktxm[24] = 1811803579;
        ji.ktxm[25] = -887060484;
        ji.ktxm[26] = 915491980;
        ji.ktxm[27] = 1180451273;
        ji.ktxm[28] = 129137748;
        ji.ktxm[29] = 1734169449;
        ji.ktxm[30] = -1333838208;
        ji.ktxm[31] = 1550036405;
        ji.ktxm[32] = 1701175452;
        ji.ktxm[33] = 669679131;
        ji.ktxm[34] = -547557158;
        ji.ktxm[35] = 139830943;
        ji.ktxm[36] = 1772804855;
        ji.ktxm[37] = 1594921815;
        ji.ktxm[38] = -238105411;
        ji.ktxm[39] = -483223536;
        ji.ktxm[40] = -207189478;
        ji.ktxm[41] = -72305978;
        ji.ktxm[42] = -851570312;
        ji.ktxm[43] = 945555923;
        ji.ktxm[44] = 621923070;
        ji.ktxm[45] = 56384805;
        ji.ktxm[46] = -791385165;
        ji.ktxm[47] = 113503948;
        ji.ktxm[48] = 1733393518;
        ji.ktxm[49] = 816022280;
        ji.ktxm[50] = -1718121755;
        ji.ktxm[51] = 775834464;
        ji.ktxm[52] = -2118894796;
        ji.ktxm[53] = -1921088519;
        ji.ktxm[54] = -1633494644;
        ji.ktxm[55] = -1344571293;
        ji.ktxm[56] = -432243985;
        ji.ktxm[57] = 1551146033;
        ji.ktxm[58] = 431979388;
        ji.ktxm[59] = -364573435;
        ji.ktxm[60] = -800885023;
        ji.ktxm[61] = -167661779;
        ji.ktxm[62] = 1498482162;
        ji.ktxm[63] = -1829752806;
        ji.ktxm[64] = 1089503687;
        ji.ktxm[65] = -1474789678;
        ji.ktxm[66] = 1644646570;
        ji.ktxm[67] = -543359720;
        ji.ktxm[68] = -393462193;
        ji.ktxm[69] = 2043649443;
        ji.ktxm[70] = 1531992131;
        ji.ktxm[71] = 1402059913;
        ji.ktxm[72] = 899260195;
        ji.ktxm[73] = 629417793;
        ji.ktxm[74] = -813836224;
        ji.ktxm[75] = -833193278;
        ji.ktxm[76] = -1297147997;
        ji.ktxm[77] = 355333513;
        ji.ktxm[78] = -1870634865;
        ji.ktxm[79] = 303154313;
        ji.ktxm[80] = -1389589785;
        ji.ktxm[81] = -1572602546;
        ji.ktxm[82] = -1520662990;
        ji.ktxm[83] = 928101607;
        ji.ktxm[84] = -1145919740;
        ji.ktxm[85] = -1388494264;
        ji.ktxm[86] = 607124001;
        ji.ktxm[87] = -436761535;
        ji.ktxm[88] = 1117663375;
        ji.ktxm[89] = -510093749;
        ji.ktxm[90] = 2067180142;
        ji.ktxm[91] = -849533783;
        ji.ktxm[92] = 1475215967;
        ji.ktxm[93] = 591697851;
        ji.ktxm[94] = -1617014358;
        ji.ktxm[95] = -1888692367;
        ji.ktxm[96] = 1361233301;
        ji.ktxm[97] = 300196670;
        ji.ktxm[98] = -856090489;
        ji.ktxm[99] = 2094639105;
    }

    private static /* synthetic */ void kxyj() {
        ji.ktxl[100] = -1324112429;
        ji.ktxl[101] = -1928942429;
        ji.ktxl[102] = -905564783;
        ji.ktxl[103] = -718354470;
        ji.ktxl[104] = 2040759793;
        ji.ktxl[105] = 757674825;
        ji.ktxl[106] = 26310662;
        ji.ktxl[107] = -917846007;
        ji.ktxl[108] = 972454001;
        ji.ktxl[109] = -1481652928;
        ji.ktxl[110] = -2036742333;
        ji.ktxl[111] = -481555455;
        ji.ktxl[112] = -1249935127;
        ji.ktxl[113] = -1294481753;
        ji.ktxl[114] = 1409230334;
        ji.ktxl[115] = 691621975;
        ji.ktxl[116] = 523952226;
        ji.ktxl[117] = -777621978;
        ji.ktxl[118] = -1477365180;
        ji.ktxl[119] = -653632160;
        ji.ktxl[120] = -1897302895;
        ji.ktxl[121] = 1105473542;
        ji.ktxl[122] = 1282384635;
        ji.ktxl[123] = -631098312;
        ji.ktxl[124] = 1080420266;
        ji.ktxl[125] = 1456014766;
        ji.ktxl[126] = 1588418033;
        ji.ktxl[127] = 1703759604;
        ji.ktxl[128] = 1247590011;
        ji.ktxl[129] = -792737832;
        ji.ktxl[130] = 1419548033;
        ji.ktxl[131] = 911002190;
        ji.ktxl[132] = -1957394667;
        ji.ktxl[133] = -1443410342;
        ji.ktxl[134] = 24625889;
        ji.ktxl[135] = 1869632190;
        ji.ktxl[136] = -2135994273;
        ji.ktxl[137] = -1021259011;
        ji.ktxl[138] = 813069579;
        ji.ktxl[139] = -1133286216;
        ji.ktxl[140] = -1079244289;
        ji.ktxl[141] = -77617664;
        ji.ktxl[142] = -72280465;
        ji.ktxl[143] = 1426780243;
        ji.ktxl[144] = 1659197197;
        ji.ktxl[145] = 47843349;
        ji.ktxl[146] = -1331110042;
        ji.ktxl[147] = 2117779445;
        ji.ktxl[148] = 667780235;
        ji.ktxl[149] = -1766409750;
        ji.ktxl[150] = -1591439504;
        ji.ktxl[151] = -1071030501;
        ji.ktxl[152] = 762473493;
        ji.ktxl[153] = -399097095;
        ji.ktxl[154] = 427349522;
        ji.ktxl[155] = 1329858076;
        ji.ktxl[156] = -831310113;
        ji.ktxl[157] = 682639803;
        ji.ktxl[158] = 986546883;
        ji.ktxl[159] = -1349466845;
        ji.ktxl[160] = -904112051;
        ji.ktxl[161] = 1704123597;
        ji.ktxl[162] = 1759026797;
        ji.ktxl[163] = -1504171017;
        ji.ktxl[164] = 1789058953;
        ji.ktxl[165] = 788809123;
        ji.ktxl[166] = -622381564;
        ji.ktxl[167] = -720808400;
        ji.ktxl[168] = 120874510;
        ji.ktxl[169] = 803528878;
        ji.ktxl[170] = 2048547862;
        ji.ktxl[171] = -925735328;
        ji.ktxl[172] = -302403695;
        ji.ktxl[173] = -631839236;
        ji.ktxl[174] = -942397502;
        ji.ktxl[175] = 1202153356;
        ji.ktxl[176] = -280021426;
        ji.ktxl[177] = 1572085878;
        ji.ktxl[178] = 1563899708;
        ji.ktxl[179] = 785808431;
        ji.ktxl[180] = 584689181;
        ji.ktxl[181] = -6685326;
        ji.ktxl[182] = 1437594419;
        ji.ktxl[183] = 1111366092;
        ji.ktxl[184] = 18799781;
        ji.ktxl[185] = 212781009;
        ji.ktxl[186] = -2128023686;
        ji.ktxl[187] = 773560516;
        ji.ktxl[188] = 885986788;
        ji.ktxl[189] = -343264031;
        ji.ktxl[190] = 1521217085;
        ji.ktxl[191] = 1051772762;
        ji.ktxl[192] = -167494707;
        ji.ktxl[193] = -56192127;
        ji.ktxl[194] = 1033259921;
        ji.ktxl[195] = -1337593864;
        ji.ktxl[196] = 1627062046;
        ji.ktxl[197] = 1098553961;
        ji.ktxl[198] = 1493966402;
        ji.ktxl[199] = -342764594;
    }

    private static /* synthetic */ void kxzb() {
        ji.ktxm[700] = 519225176;
        ji.ktxm[701] = -94136057;
        ji.ktxm[702] = -89137443;
        ji.ktxm[703] = -1188687932;
        ji.ktxm[704] = -1580253198;
        ji.ktxm[705] = -1650154325;
        ji.ktxm[706] = -1027122882;
        ji.ktxm[707] = -1939850472;
        ji.ktxm[708] = 1701006586;
        ji.ktxm[709] = -623190841;
        ji.ktxm[710] = 847631110;
        ji.ktxm[711] = -356874773;
        ji.ktxm[712] = 337379123;
        ji.ktxm[713] = -1011618922;
        ji.ktxm[714] = -2002021131;
        ji.ktxm[715] = 1528928860;
        ji.ktxm[716] = -309059118;
        ji.ktxm[717] = 329141919;
        ji.ktxm[718] = -741901741;
        ji.ktxm[719] = -1307460377;
        ji.ktxm[720] = -1481506499;
        ji.ktxm[721] = 1710127146;
        ji.ktxm[722] = -888903848;
        ji.ktxm[723] = -710931206;
        ji.ktxm[724] = 386720277;
        ji.ktxm[725] = 1102058479;
        ji.ktxm[726] = 1206731214;
        ji.ktxm[727] = 377404104;
        ji.ktxm[728] = 1434739830;
        ji.ktxm[729] = 100295440;
        ji.ktxm[730] = 233132020;
        ji.ktxm[731] = 1974355548;
        ji.ktxm[732] = 735336317;
        ji.ktxm[733] = 597287753;
        ji.ktxm[734] = -1500266230;
        ji.ktxm[735] = -816794266;
        ji.ktxm[736] = -2093820458;
        ji.ktxm[737] = -653703717;
        ji.ktxm[738] = 1341580991;
        ji.ktxm[739] = -1660655766;
        ji.ktxm[740] = 1835311804;
        ji.ktxm[741] = -581176668;
        ji.ktxm[742] = -191420970;
        ji.ktxm[743] = -1736519518;
        ji.ktxm[744] = 726940942;
        ji.ktxm[745] = -1955536250;
        ji.ktxm[746] = 1992219831;
        ji.ktxm[747] = 1092708771;
        ji.ktxm[748] = -581207712;
        ji.ktxm[749] = -247136022;
        ji.ktxm[750] = 1017734867;
        ji.ktxm[751] = -1023886553;
        ji.ktxm[752] = 540375262;
        ji.ktxm[753] = 1228853864;
        ji.ktxm[754] = 702072962;
        ji.ktxm[755] = -536346431;
        ji.ktxm[756] = 866260525;
        ji.ktxm[757] = 1610606026;
        ji.ktxm[758] = 1004781515;
        ji.ktxm[759] = 782890444;
        ji.ktxm[760] = -1071718778;
        ji.ktxm[761] = -1719696830;
        ji.ktxm[762] = 1734773038;
        ji.ktxm[763] = 1906546047;
        ji.ktxm[764] = 571363920;
        ji.ktxm[765] = 1312423512;
        ji.ktxm[766] = -1780044305;
        ji.ktxm[767] = -654789912;
        ji.ktxm[768] = -1625511207;
        ji.ktxm[769] = 1309482417;
        ji.ktxm[770] = -1752548052;
        ji.ktxm[771] = 1356366517;
        ji.ktxm[772] = -2132124006;
        ji.ktxm[773] = -524613999;
        ji.ktxm[774] = -1195781627;
        ji.ktxm[775] = 1527806711;
        ji.ktxm[776] = -674082129;
        ji.ktxm[777] = 1820920944;
        ji.ktxm[778] = -1977308219;
        ji.ktxm[779] = -1008859287;
        ji.ktxm[780] = -1198265928;
        ji.ktxm[781] = -1927991854;
        ji.ktxm[782] = -1396311806;
        ji.ktxm[783] = -1128059934;
        ji.ktxm[784] = -817589688;
        ji.ktxm[785] = -1324813896;
        ji.ktxm[786] = 1760778750;
        ji.ktxm[787] = 587849965;
        ji.ktxm[788] = 450570732;
        ji.ktxm[789] = -283629479;
        ji.ktxm[790] = -35216049;
        ji.ktxm[791] = -1555552872;
        ji.ktxm[792] = -69202836;
        ji.ktxm[793] = 2136900370;
        ji.ktxm[794] = 302830274;
        ji.ktxm[795] = -1271735668;
        ji.ktxm[796] = -1082633392;
        ji.ktxm[797] = 267007898;
        ji.ktxm[798] = -862048131;
        ji.ktxm[799] = 1901771358;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean updateEventParticle(ji$GlowParticle var1_1, float var2_2, double var3_3) {
        block60: {
            var13_4 = ji.c;
            var12_5 /* !! */  = ji.b;
            var11_6 = ji.a;
            if (var13_4) {
                throw null;
lbl6:
                // 15 sources

                return (boolean)ji.ktxn("kvxp", ktxk(int ), (int)640);
            }
            if (var11_6 || var11_6) ** GOTO lbl6
            if (var1_1.kind == ji$ParticleKind.PEARL) break block60;
            if (var11_6 || var11_6) ** GOTO lbl6
            return this.updateBurstParticle(var1_1, var2_2);
        }
        if (var11_6 || var11_6) ** GOTO lbl6
        var1_1.vx *= var3_3;
        if (var11_6 || var11_6) ** GOTO lbl6
        var1_1.vz *= var3_3;
        if (var11_6 || var11_6) ** GOTO lbl6
        var1_1.vy = var1_1.vy * var3_3 - ji.ktxn("kvxq", kufx(int ), (int)278) * (double)var2_2;
        if (var11_6 || var11_6) ** GOTO lbl6
        var5_7 = var1_1.x + var1_1.vx * (double)var2_2;
        if (var11_6) ** GOTO lbl6
        if (var12_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_6) ** GOTO lbl6
                var7_8 = var1_1.y + var1_1.vy * (double)var2_2;
                if (var11_6 || var11_6) ** GOTO lbl6
                var9_9 = var1_1.z + var1_1.vz * (double)var2_2;
                if (var11_6 || var11_6) ** GOTO lbl6
                if (this.isFree(var5_7, var7_8, var9_9, this.collisionPos)) ** GOTO lbl33
                if (var11_6 || var11_6) ** GOTO lbl6
                return (boolean)ji.ktxn("kvxs", ktxk(int ), (int)641);
lbl33:
                // 1 sources

                if (var11_6 || var11_6) ** GOTO lbl6
                var1_1.x = var5_7;
                if (var11_6 || var11_6) ** GOTO lbl6
                var1_1.y = var7_8;
                if (var11_6 || var11_6) ** GOTO lbl6
                var1_1.z = var9_9;
                if (!var11_6 && !var11_6) ** break;
                ** continue;
                return (boolean)ji.ktxn("kvxw", ktxk(int ), (int)642);
            }
            case 0: {
                var12_5 /* !! */  = (int)ji.ktxn("kvxy", ktxk(int ), (int)643);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl47:
            // 2 sources

            case 1: {
                var12_5 /* !! */  = (int)ji.ktxn("kvya", ktxk(int ), (int)644);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl52:
            // 2 sources

            case 2: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyb", ktxk(int ), (int)645);
                if (!var13_4) ** GOTO lbl47
                throw null;
            }
lbl56:
            // 4 sources

            case 3: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyc", ktxk(int ), (int)646);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl61:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_5 /* !! */  = (int)ji.ktxn("kvyd", ktxk(int ), (int)647);
                    if (!var13_4) ** GOTO lbl56
                    throw null;
                }
            }
lbl66:
            // 2 sources

            case 5: {
                var12_5 /* !! */  = (int)ji.ktxn("kvye", ktxk(int ), (int)648);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl71:
            // 2 sources

            case 6: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyf", ktxk(int ), (int)649);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 7: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyh", ktxk(int ), (int)650);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 8: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyk", ktxk(int ), (int)651);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl86:
            // 3 sources

            case 9: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyl", ktxk(int ), (int)652);
                if (!var13_4) ** GOTO lbl56
                throw null;
            }
lbl90:
            // 3 sources

            case 10: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyn", ktxk(int ), (int)653);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 11: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyp", ktxk(int ), (int)654);
                if (!var13_4) ** GOTO lbl90
                throw null;
            }
            case 12: {
                var12_5 /* !! */  = (int)ji.ktxn("kvys", ktxk(int ), (int)655);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 13: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyu", ktxk(int ), (int)656);
                if (!var13_4) ** GOTO lbl86
                throw null;
            }
lbl108:
            // 2 sources

            case 14: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyv", ktxk(int ), (int)657);
                if (!var13_4) ** GOTO lbl56
                throw null;
            }
            case 15: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyx", ktxk(int ), (int)658);
                if (!var13_4) ** GOTO lbl71
                throw null;
            }
lbl116:
            // 2 sources

            case 16: {
                var12_5 /* !! */  = (int)ji.ktxn("kvyz", ktxk(int ), (int)659);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl121:
            // 2 sources

            case 17: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzb", ktxk(int ), (int)660);
                if (!var13_4) ** GOTO lbl52
                throw null;
            }
            case 18: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzd", ktxk(int ), (int)661);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl130:
            // 2 sources

            case 19: {
                do {
                    var12_5 /* !! */  = (int)ji.ktxn("kvzf", ktxk(int ), (int)662);
                } while (!var13_4);
                throw null;
            }
            case 20: {
                do {
                    var12_5 /* !! */  = (int)ji.ktxn("kvzi", ktxk(int ), (int)663);
                } while (!var13_4);
                throw null;
            }
lbl140:
            // 3 sources

            case 21: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzk", ktxk(int ), (int)664);
                if (!var13_4) ** GOTO lbl66
                throw null;
            }
lbl144:
            // 4 sources

            case 22: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzm", ktxk(int ), (int)665);
                if (!var13_4) break;
                throw null;
            }
            case 23: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzo", ktxk(int ), (int)666);
                if (!var13_4) ** GOTO lbl144
                throw null;
            }
lbl152:
            // 3 sources

            case 24: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzs", ktxk(int ), (int)667);
                if (!var13_4) ** GOTO lbl140
                throw null;
            }
            case 25: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzu", ktxk(int ), (int)668);
                if (!var13_4) ** GOTO lbl90
                throw null;
            }
lbl160:
            // 2 sources

            case 26: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzw", ktxk(int ), (int)669);
                if (!var13_4) ** GOTO lbl144
                throw null;
            }
lbl164:
            // 2 sources

            case 27: {
                var12_5 /* !! */  = (int)ji.ktxn("kvzy", ktxk(int ), (int)670);
                if (!var13_4) ** GOTO lbl61
                throw null;
            }
lbl168:
            // 2 sources

            case 28: {
                var12_5 /* !! */  = (int)ji.ktxn("kwaa", ktxk(int ), (int)671);
                if (!var13_4) ** GOTO lbl86
                throw null;
            }
lbl172:
            // 2 sources

            case 29: {
                var12_5 /* !! */  = (int)ji.ktxn("kwac", ktxk(int ), (int)672);
                if (!var13_4) ** GOTO lbl121
                throw null;
            }
            case 30: 
        }
        var12_5 /* !! */  = (int)ji.ktxn("kwae", ktxk(int ), (int)673);
        ** while (!var13_4)
lbl179:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyr() {
        ji.ktxl[900] = -347239653;
        ji.ktxl[901] = 1854988753;
        ji.ktxl[902] = 81086370;
        ji.ktxl[903] = 876110969;
        ji.ktxl[904] = -369854978;
        ji.ktxl[905] = 25767024;
        ji.ktxl[906] = 1375417454;
        ji.ktxl[907] = -491539226;
        ji.ktxl[908] = -880399411;
        ji.ktxl[909] = -1216816234;
        ji.ktxl[910] = -1107017579;
        ji.ktxl[911] = 1605777982;
        ji.ktxl[912] = -312711148;
        ji.ktxl[913] = -403363467;
        ji.ktxl[914] = 1469342256;
        ji.ktxl[915] = 1395001012;
        ji.ktxl[916] = -1399672650;
        ji.ktxl[917] = -56868107;
        ji.ktxl[918] = 950862188;
        ji.ktxl[919] = -1841076871;
        ji.ktxl[920] = -1710957841;
        ji.ktxl[921] = 212598825;
        ji.ktxl[922] = 2121174594;
        ji.ktxl[923] = -2080731445;
        ji.ktxl[924] = -2124860028;
        ji.ktxl[925] = 1306387553;
        ji.ktxl[926] = 1779201281;
        ji.ktxl[927] = -650738665;
        ji.ktxl[928] = -2109858212;
        ji.ktxl[929] = 651164202;
        ji.ktxl[930] = -1616425075;
        ji.ktxl[931] = 2114709669;
        ji.ktxl[932] = -466310817;
        ji.ktxl[933] = 891337809;
        ji.ktxl[934] = 388803952;
        ji.ktxl[935] = -444324711;
        ji.ktxl[936] = 1250506338;
        ji.ktxl[937] = -283958752;
        ji.ktxl[938] = -1479139746;
        ji.ktxl[939] = 1757825392;
        ji.ktxl[940] = 283224306;
        ji.ktxl[941] = -656345824;
        ji.ktxl[942] = 1667730190;
        ji.ktxl[943] = 2050766127;
        ji.ktxl[944] = -391196333;
        ji.ktxl[945] = 380273008;
        ji.ktxl[946] = 1851692773;
        ji.ktxl[947] = -1983554449;
        ji.ktxl[948] = -468246561;
        ji.ktxl[949] = -1992512755;
        ji.ktxl[950] = 719000998;
        ji.ktxl[951] = -1259053858;
        ji.ktxl[952] = 129301954;
        ji.ktxl[953] = -1859839831;
        ji.ktxl[954] = 1952472842;
        ji.ktxl[955] = 1908555969;
        ji.ktxl[956] = 1549161640;
        ji.ktxl[957] = -380909713;
        ji.ktxl[958] = 1259033085;
        ji.ktxl[959] = -444897466;
        ji.ktxl[960] = 1625832648;
        ji.ktxl[961] = -1971442742;
        ji.ktxl[962] = -1991716614;
        ji.ktxl[963] = 229300972;
        ji.ktxl[964] = 1442462581;
        ji.ktxl[965] = 925755432;
        ji.ktxl[966] = -942062828;
        ji.ktxl[967] = 674505846;
        ji.ktxl[968] = -868050214;
        ji.ktxl[969] = -1389515157;
        ji.ktxl[970] = 773786541;
        ji.ktxl[971] = 1757318360;
        ji.ktxl[972] = -1719992250;
        ji.ktxl[973] = -830326988;
        ji.ktxl[974] = 805091965;
        ji.ktxl[975] = 123631698;
        ji.ktxl[976] = -1637393419;
        ji.ktxl[977] = -476090981;
        ji.ktxl[978] = -1976551602;
        ji.ktxl[979] = 894103259;
        ji.ktxl[980] = 2102928989;
        ji.ktxl[981] = 688429821;
        ji.ktxl[982] = -2019393906;
        ji.ktxl[983] = 1545528234;
        ji.ktxl[984] = 1644159123;
        ji.ktxl[985] = 417075015;
        ji.ktxl[986] = -315485569;
        ji.ktxl[987] = -557539000;
        ji.ktxl[988] = 1907046214;
        ji.ktxl[989] = 161535649;
        ji.ktxl[990] = -708874828;
        ji.ktxl[991] = 1756082111;
        ji.ktxl[992] = -1777941923;
        ji.ktxl[993] = 1709616643;
        ji.ktxl[994] = -2142533685;
        ji.ktxl[995] = 1769329876;
        ji.ktxl[996] = -28703519;
        ji.ktxl[997] = -840203725;
        ji.ktxl[998] = 1583226365;
        ji.ktxl[999] = -751222071;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void spawnCriticalBurst(class_1309 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kvda", ktyv(int ), (int)167)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ji.ktxn("kvdc", ktxk(int ), (int)483)) break;
            v0 /* !! */  = (long)ji.ktxn("kvde", ktxk(int ), (int)484);
        }
        var9_2 = ji.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kvdg", ktyv(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ji.ktxn("kvdi", ktxk(int ), (int)485)) break;
            v1 /* !! */  = (long)ji.ktxn("kvdj", ktxk(int ), (int)486);
        }
        var8_3 /* !! */  = ji.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kvdl", ktyv(int ), (int)169)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ji.ktxn("kvdm", ktxk(int ), (int)487)) break;
            v2 /* !! */  = (long)ji.ktxn("kvdo", ktxk(int ), (int)488);
        }
        var7_4 = ji.a;
        if (var9_2) {
            throw null;
lbl21:
            // 11 sources

            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl21
        v3 /* !! */  = ji.tf;
        if (true) ** GOTO lbl28
        block83: while (true) {
            v3 /* !! */  = (long)(ji.ktxn("kvdt", ktyv(int ), (int)171) - ji.ktxn("kvdr", ktyv(int ), (int)170));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1179876989: {
                    continue block83;
                }
                case 733325436: {
                    break block83;
                }
            }
            break;
        }
        var2_5 = ThreadLocalRandom.current();
        if (var7_4 || var7_4) ** GOTO lbl21
        v4 = ji.ktxn("kvdv", ktxk(int ), (int)489);
        v5 /* !! */  = ji.tf;
        if (true) ** GOTO lbl40
        block84: while (true) {
            v5 /* !! */  = (long)(ji.ktxn("kvdz", ktyv(int ), (int)173) - ji.ktxn("kvdx", ktyv(int ), (int)172));
lbl40:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1906377356: {
                    continue block84;
                }
                case 733325436: {
                    break block84;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kveb", ktyv(int ), (int)174)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ji.ktxn("kved", ktxk(int ), (int)490)) break;
            v6 /* !! */  = (long)ji.ktxn("kvef", ktxk(int ), (int)491);
        }
        var3_6 = v4 - this.particles.size();
        if (var7_4 || var7_4) ** GOTO lbl21
        v7 = ji.ktxn("kveh", ktxk(int ), (int)492);
        v8 = ji.ktxn("kvei", ktxk(int ), (int)493);
        v9 /* !! */  = ji.tf;
        if (true) ** GOTO lbl58
        block86: while (true) {
            v9 /* !! */  = (long)(v10 - ji.ktxn("kvek", ktyv(int ), (int)175));
lbl58:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -767030564: {
                    v10 = ji.ktxn("kvem", ktyv(int ), (int)176);
                    continue block86;
                }
                case -56124849: {
                    v10 = ji.ktxn("kven", ktyv(int ), (int)177);
                    continue block86;
                }
                case 733325436: {
                    break block86;
                }
            }
            break;
        }
        v11 = Math.max((int)v8, (int)var3_6);
        v12 /* !! */  = ji.tf;
        if (true) ** GOTO lbl72
        block87: while (true) {
            v12 /* !! */  = (long)(v13 - ji.ktxn("kvep", ktyv(int ), (int)178));
lbl72:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1470378197: {
                    v13 = ji.ktxn("kver", ktyv(int ), (int)179);
                    continue block87;
                }
                case -1374507113: {
                    v13 = ji.ktxn("kvet", ktyv(int ), (int)180);
                    continue block87;
                }
                case 89940864: {
                    v13 = ji.ktxn("kvev", ktyv(int ), (int)181);
                    continue block87;
                }
                case 733325436: {
                    break block87;
                }
            }
            break;
        }
        var4_7 = Math.min((int)v7, v11);
        if (var7_4 || var7_4) ** GOTO lbl21
        v14 /* !! */  = ji.tf;
        if (true) ** GOTO lbl90
        block88: while (true) {
            v14 /* !! */  = (long)(v15 - ji.ktxn("kvex", ktyv(int ), (int)182));
lbl90:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1874643550: {
                    v15 = ji.ktxn("kvez", ktyv(int ), (int)183);
                    continue block88;
                }
                case 733325436: {
                    break block88;
                }
                case 1213843332: {
                    v15 = ji.ktxn("kvfb", ktyv(int ), (int)184);
                    continue block88;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kvfc", ktyv(int ), (int)185)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ji.ktxn("kvfd", ktxk(int ), (int)494)) break;
            v16 /* !! */  = (long)ji.ktxn("kvff", ktxk(int ), (int)495);
        }
        var5_8 = this.size.getValue();
        if (var7_4 || var7_4) ** GOTO lbl21
        var6_9 = ji.ktxn("kvfi", ktxk(int ), (int)496);
        if (var7_4) ** GOTO lbl21
        block90: while (true) {
            if (var7_4 || var7_4) ** GOTO lbl21
            if (var6_9 >= var4_7) ** GOTO lbl264
            if (var7_4 || var7_4) ** GOTO lbl21
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kvfn", ktyv(int ), (int)186)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == ji.ktxn("kvfp", ktxk(int ), (int)497)) break;
                v17 /* !! */  = (long)ji.ktxn("kvfr", ktxk(int ), (int)498);
            }
            v18 = var1_1.method_23317();
            v19 = ji.ktxn("kvft", kufx(int ), (int)187);
            v20 = ji.ktxn("kvfu", kufx(int ), (int)188);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kvfv", ktyv(int ), (int)189)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == ji.ktxn("kvfw", ktxk(int ), (int)499)) break;
                v21 /* !! */  = (long)ji.ktxn("kvfy", ktxk(int ), (int)500);
            }
            v22 = v18 + var2_5.nextDouble((double)v19, (double)v20);
            v23 /* !! */  = ji.tf;
            if (true) ** GOTO lbl130
            block93: while (true) {
                v23 /* !! */  = (long)(ji.ktxn("kvgb", ktyv(int ), (int)191) - ji.ktxn("kvga", ktyv(int ), (int)190));
lbl130:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1131109487: {
                        continue block93;
                    }
                    case 733325436: {
                        break block93;
                    }
                }
                break;
            }
            v24 = var1_1.method_23318();
            v25 = ji.ktxn("kvgn", kufx(int ), (int)192);
            v26 /* !! */  = ji.tf;
            if (true) ** GOTO lbl141
            block94: while (true) {
                v26 /* !! */  = (long)(v27 - ji.ktxn("kvgq", ktyv(int ), (int)193));
lbl141:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1860718315: {
                        v27 = ji.ktxn("kvgr", ktyv(int ), (int)194);
                        continue block94;
                    }
                    case -1785342832: {
                        v27 = ji.ktxn("kvgs", ktyv(int ), (int)195);
                        continue block94;
                    }
                    case 733325436: {
                        break block94;
                    }
                }
                break;
            }
            v28 = (double)var1_1.method_17682() + ji.ktxn("kvgt", kufx(int ), (int)196);
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_7 = ji.tf - ji.ktxn("kvgu", ktyv(int ), (int)197)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == ji.ktxn("kvgw", ktxk(int ), (int)501)) break;
                v29 /* !! */  = (long)ji.ktxn("kvgz", ktxk(int ), (int)502);
            }
            v30 = v24 + var2_5.nextDouble((double)v25, v28);
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_8 = ji.tf - ji.ktxn("kvhc", ktyv(int ), (int)198)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == ji.ktxn("kvhe", ktxk(int ), (int)503)) break;
                v31 /* !! */  = (long)ji.ktxn("kvhh", ktxk(int ), (int)504);
            }
            v32 = var1_1.method_23321();
            v33 = ji.ktxn("kvhj", kufx(int ), (int)199);
            v34 = ji.ktxn("kvhk", kufx(int ), (int)200);
            while (true) {
                if ((v35 /* !! */  = (cfr_temp_9 = ji.tf - ji.ktxn("kvhl", ktyv(int ), (int)201)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v35 /* !! */  == ji.ktxn("kvho", ktxk(int ), (int)505)) break;
                v35 /* !! */  = (long)ji.ktxn("kvhq", ktxk(int ), (int)506);
            }
            v36 = v32 + var2_5.nextDouble((double)v33, (double)v34);
            v37 = ji.ktxn("kvhs", kufx(int ), (int)202);
            v38 = ji.ktxn("kvhu", kufx(int ), (int)203);
            v39 /* !! */  = ji.tf;
            if (true) ** GOTO lbl177
            block98: while (true) {
                v39 /* !! */  = (long)(v40 - ji.ktxn("kvhw", ktyv(int ), (int)204));
lbl177:
                // 2 sources

                switch ((int)v39 /* !! */ ) {
                    case -1900164335: {
                        v40 = ji.ktxn("kvhy", ktyv(int ), (int)205);
                        continue block98;
                    }
                    case -1174364597: {
                        v40 = ji.ktxn("kvia", ktyv(int ), (int)206);
                        continue block98;
                    }
                    case -213734620: {
                        v40 = ji.ktxn("kvic", ktyv(int ), (int)207);
                        continue block98;
                    }
                    case 733325436: {
                        break block98;
                    }
                }
                break;
            }
            v41 = var2_5.nextDouble((double)v37, (double)v38) * ji.ktxn("kvie", kufx(int ), (int)208);
            v42 = ji.ktxn("kvig", kufx(int ), (int)209);
            v43 = ji.ktxn("kvii", kufx(int ), (int)210);
            while (true) {
                if ((v44 /* !! */  = (cfr_temp_10 = ji.tf - ji.ktxn("kvik", ktyv(int ), (int)211)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v44 /* !! */  == ji.ktxn("kvim", ktxk(int ), (int)507)) break;
                v44 /* !! */  = (long)ji.ktxn("kvio", ktxk(int ), (int)508);
            }
            v45 = var2_5.nextDouble((double)v42, (double)v43) * ji.ktxn("kvip", kufx(int ), (int)212);
            v46 = ji.ktxn("kviq", kufx(int ), (int)213);
            v47 = ji.ktxn("kvir", kufx(int ), (int)214);
            v48 /* !! */  = ji.tf;
            if (true) ** GOTO lbl204
            block100: while (true) {
                v48 /* !! */  = (long)(ji.ktxn("kvit", ktyv(int ), (int)216) - ji.ktxn("kvis", ktyv(int ), (int)215));
lbl204:
                // 2 sources

                switch ((int)v48 /* !! */ ) {
                    case -1003711507: {
                        continue block100;
                    }
                    case 733325436: {
                        break block100;
                    }
                }
                break;
            }
            v49 = var2_5.nextDouble((double)v46, (double)v47) * ji.ktxn("kviu", kufx(int ), (int)217);
            v50 = ji.ktxn("kviv", ktxr(int ), (int)509);
            while (true) {
                if ((v51 /* !! */  = (cfr_temp_11 = ji.tf - ji.ktxn("kviw", ktyv(int ), (int)218)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v51 /* !! */  == ji.ktxn("kvix", ktxk(int ), (int)510)) break;
                v51 /* !! */  = (long)ji.ktxn("kviy", ktxk(int ), (int)511);
            }
            v52 = var5_8 * (v50 + var2_5.nextFloat() * ji.ktxn("kviz", ktxr(int ), (int)512));
            v53 = ji.ktxn("kvja", ktxr(int ), (int)513);
            v54 = ji.ktxn("kvjb", ktxr(int ), (int)514);
            while (true) {
                if ((v55 /* !! */  = (cfr_temp_12 = ji.tf - ji.ktxn("kvjc", ktyv(int ), (int)219)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v55 /* !! */  == ji.ktxn("kvje", ktxk(int ), (int)515)) break;
                v55 /* !! */  = (long)ji.ktxn("kvjh", ktxk(int ), (int)516);
            }
            v56 = v53 * (v54 + var2_5.nextFloat() * ji.ktxn("kvjj", ktxr(int ), (int)517));
            v57 /* !! */  = ji.tf;
            if (true) ** GOTO lbl229
            block103: while (true) {
                v57 /* !! */  = (long)(v58 - ji.ktxn("kvjl", ktyv(int ), (int)220));
lbl229:
                // 2 sources

                switch ((int)v57 /* !! */ ) {
                    case -1828098975: {
                        v58 = ji.ktxn("kvjo", ktyv(int ), (int)221);
                        continue block103;
                    }
                    case 733325436: {
                        break block103;
                    }
                    case 996364205: {
                        v58 = ji.ktxn("kvjq", ktyv(int ), (int)222);
                        continue block103;
                    }
                    case 1850054977: {
                        v58 = ji.ktxn("kvjs", ktyv(int ), (int)223);
                        continue block103;
                    }
                }
                break;
            }
            v59 = ji.ktxn("kvju", ktxk(int ), (int)518);
            v60 /* !! */  = ji.tf;
            if (true) ** GOTO lbl246
            block104: while (true) {
                v60 /* !! */  = (long)(v61 - ji.ktxn("kvjx", ktyv(int ), (int)224));
lbl246:
                // 2 sources

                switch ((int)v60 /* !! */ ) {
                    case -229425660: {
                        v61 = ji.ktxn("kvjz", ktyv(int ), (int)225);
                        continue block104;
                    }
                    case 466825378: {
                        v61 = ji.ktxn("kvkc", ktyv(int ), (int)226);
                        continue block104;
                    }
                    case 733325436: {
                        break block104;
                    }
                }
                break;
            }
            this.addEventParticle(v22, v30, v36, v41, v45, v49, v52, (float)v56, ji$ParticleKind.CRITICAL, (int)v59);
            if (var7_4 || var7_4) ** GOTO lbl21
            ++var6_9;
            if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var7_4) ** GOTO lbl21
                    if (!var9_2) continue block90;
                    throw null;
                }
lbl264:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
lbl267:
                // 3 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_3 /* !! */  = (int)ji.ktxn("kvkj", ktxk(int ), (int)519);
                        if (var9_2) {
                            throw null;
                        }
                        ** GOTO lbl337
                        break;
                    }
                }
                case 1: {
                    do {
                        var8_3 /* !! */  = (int)ji.ktxn("kvkl", ktxk(int ), (int)520);
                    } while (!var9_2);
                    throw null;
                }
lbl278:
                // 2 sources

                case 2: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvko", ktxk(int ), (int)521);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl320
                }
lbl283:
                // 2 sources

                case 3: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvkr", ktxk(int ), (int)522);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
                case 4: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvks", ktxk(int ), (int)523);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl341
                }
lbl293:
                // 2 sources

                case 5: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvkt", ktxk(int ), (int)524);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl345
                }
lbl298:
                // 2 sources

                case 6: {
                    do {
                        var8_3 /* !! */  = (int)ji.ktxn("kvkv", ktxk(int ), (int)525);
                    } while (!var9_2);
                    throw null;
                }
lbl303:
                // 3 sources

                case 7: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvkx", ktxk(int ), (int)526);
                    if (!var9_2) ** GOTO lbl278
                    throw null;
                }
                case 8: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvla", ktxk(int ), (int)527);
                    if (!var9_2) ** GOTO lbl283
                    throw null;
                }
lbl311:
                // 3 sources

                case 9: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvld", ktxk(int ), (int)528);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl349
                }
                case 10: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvlg", ktxk(int ), (int)529);
                    if (var9_2) {
                        throw null;
                    }
                }
lbl320:
                // 4 sources

                case 11: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvli", ktxk(int ), (int)530);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
lbl325:
                // 3 sources

                case 12: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvll", ktxk(int ), (int)531);
                    if (!var9_2) ** GOTO lbl311
                    throw null;
                }
                case 13: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvln", ktxk(int ), (int)532);
                    if (!var9_2) ** GOTO lbl298
                    throw null;
                }
lbl333:
                // 2 sources

                case 14: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvlq", ktxk(int ), (int)533);
                    if (!var9_2) ** GOTO lbl267
                    throw null;
                }
lbl337:
                // 2 sources

                case 15: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvls", ktxk(int ), (int)534);
                    if (!var9_2) ** GOTO lbl293
                    throw null;
                }
lbl341:
                // 3 sources

                case 16: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvlv", ktxk(int ), (int)535);
                    if (!var9_2) ** GOTO lbl303
                    throw null;
                }
lbl345:
                // 2 sources

                case 17: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvly", ktxk(int ), (int)536);
                    if (!var9_2) ** GOTO lbl325
                    throw null;
                }
lbl349:
                // 2 sources

                case 18: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvma", ktxk(int ), (int)537);
                    if (!var9_2) ** GOTO lbl341
                    throw null;
                }
                case 19: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvmc", ktxk(int ), (int)538);
                    if (!var9_2) ** GOTO lbl267
                    throw null;
                }
                case 20: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvme", ktxk(int ), (int)539);
                    if (!var9_2) ** GOTO lbl303
                    throw null;
                }
                case 21: {
                    var8_3 /* !! */  = (int)ji.ktxn("kvmh", ktxk(int ), (int)540);
                    if (!var9_2) ** GOTO lbl325
                    throw null;
                }
                case 22: 
            }
            break;
        }
        var8_3 /* !! */  = (int)ji.ktxn("kvmj", ktxk(int ), (int)541);
        ** while (!var9_2)
lbl368:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private int particleColor(ji$GlowParticle var1_1, float var2_2, gk$Palette var3_3) {
        block69: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxgm", ktyv(int ), (int)386)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ji.ktxn("kxgn", ktxk(int ), (int)913)) break;
                v0 /* !! */  = (long)ji.ktxn("kxgp", ktxk(int ), (int)914);
            }
            var7_4 = ji.c;
            v1 /* !! */  = ji.tf;
            block40: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case -632442437: {
                        v1 /* !! */  = (long)(ji.ktxn("kxgs", ktyv(int ), (int)388) - ji.ktxn("kxgq", ktyv(int ), (int)387));
                        continue block40;
                    }
                    case 733325436: {
                        break block40;
                    }
                }
                break;
            }
            var6_5 /* !! */  = ji.b;
            v2 /* !! */  = ji.tf;
            if (true) ** GOTO lbl20
            block41: while (true) {
                v2 /* !! */  = (long)(v3 - ji.ktxn("kxgu", ktyv(int ), (int)389));
lbl20:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -889911420: {
                        v3 = ji.ktxn("kxgw", ktyv(int ), (int)390);
                        continue block41;
                    }
                    case -661764596: {
                        v3 = ji.ktxn("kxgy", ktyv(int ), (int)391);
                        continue block41;
                    }
                    case 733325436: {
                        break block41;
                    }
                }
                break;
            }
            var5_6 = ji.a;
            if (var7_4) {
                throw null;
            }
            if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
            if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
            v4 /* !! */  = ji.tf;
            block42: while (true) {
                switch ((int)v4 /* !! */ ) {
                    case -489939505: {
                        v4 /* !! */  = (long)(ji.ktxn("kxhf", ktyv(int ), (int)393) - ji.ktxn("kxhd", ktyv(int ), (int)392));
                        continue block42;
                    }
                    case 733325436: {
                        break block42;
                    }
                }
                break;
            }
            if (var1_1.color != 0) {
                if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                v5 /* !! */  = ji.tf;
                block43: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case 733325436: {
                            return var1_1.color;
                        }
                        case 2110938644: {
                            v5 /* !! */  = (long)(ji.ktxn("kxhj", ktyv(int ), (int)395) - ji.ktxn("kxhh", ktyv(int ), (int)394));
                            continue block43;
                        }
                    }
                    break;
                }
                return var1_1.color;
            }
            if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
            if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
            while (true) {
                block70: {
                    if ((v6 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxhk", ktyv(int ), (int)396)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  != ji.ktxn("kxhl", ktxk(int ), (int)916)) break block70;
                    var4_7 = (var1_1.phase / ji.ktxn("kxho", ktxr(int ), (int)918) + var2_2 * ji.ktxn("kxhp", ktxr(int ), (int)919)) % 1.0f;
                    if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                    if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                    if (var3_3 != null) {
                        break;
                    }
                    ** GOTO lbl160
                }
                v6 /* !! */  = (long)ji.ktxn("kxhn", ktxk(int ), (int)917);
            }
            if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var6_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                        if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                        v7 = ji.ktxn("kxhq", ktxk(int ), (int)920);
                        v8 = var4_7 * ji.ktxn("kxhr", ktxr(int ), (int)921);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kxhs", ktyv(int ), (int)397)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  != ji.ktxn("kxht", ktxk(int ), (int)922)) ** GOTO lbl82
                            v10 = Math.round(v8);
                            v11 /* !! */  = ji.tf;
                            if (true) ** GOTO lbl141
lbl82:
                            // 1 sources

                            v9 /* !! */  = (long)ji.ktxn("kxhu", ktxk(int ), (int)923);
                        }
                    }
                    case 0: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxig", ktxk(int ), (int)928);
                        cfr_temp_0 = 7;
                        if (var7_4) {
                            throw null;
                        }
                        break block69;
                    }
                    case 5: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxim", ktxk(int ), (int)933);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** GOTO lbl122
                    }
                    case 9: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxiq", ktxk(int ), (int)937);
                        cfr_temp_0 = 4;
                        if (var7_4) {
                            throw null;
                        }
                        break block69;
                    }
                    case 11: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxis", ktxk(int ), (int)939);
                        cfr_temp_0 = 7;
                        if (var7_4) {
                            throw null;
                        }
                        break block69;
                    }
                    case 12: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxit", ktxk(int ), (int)940);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 10: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxir", ktxk(int ), (int)938);
                        cfr_temp_0 = 3;
                        if (var7_4) {
                            throw null;
                        }
                        break block69;
                    }
                    case 13: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxiv", ktxk(int ), (int)941);
                        if (var7_4) {
                            throw null;
                        }
lbl122:
                        // 3 sources

                        var6_5 /* !! */  = (int)ji.ktxn("kxih", ktxk(int ), (int)929);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 6: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxin", ktxk(int ), (int)934);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 3: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxij", ktxk(int ), (int)931);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 8: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxip", ktxk(int ), (int)936);
                        cfr_temp_0 = 4;
                        if (var7_4) {
                            throw null;
                        }
                        break block69;
                    }
                    block47: while (true) {
                        v11 /* !! */  = (long)(v12 - ji.ktxn("kxhv", ktyv(int ), (int)398));
lbl141:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case 103367585: {
                                v12 = ji.ktxn("kxhw", ktyv(int ), (int)399);
                                continue block47;
                            }
                            case 733325436: {
                                break block47;
                            }
                            case 988956389: {
                                v12 = ji.ktxn("kxhx", ktyv(int ), (int)400);
                                continue block47;
                            }
                            case 1047389878: {
                                v12 = ji.ktxn("kxhy", ktyv(int ), (int)401);
                                continue block47;
                            }
                        }
                        break;
                    }
                    v13 = var3_3.colors();
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kxhz", ktyv(int ), (int)402)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == ji.ktxn("kxib", ktxk(int ), (int)924)) {
                            return ol.color((int)v7, v10, v13);
                        }
                        v14 /* !! */  = (long)ji.ktxn("kxic", ktxk(int ), (int)925);
                    }
lbl160:
                    // 1 sources

                    if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                    if (var5_6 != false) return (int)ji.ktxn("kxha", ktxk(int ), (int)915);
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kxid", ktyv(int ), (int)403)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == ji.ktxn("kxie", ktxk(int ), (int)926)) {
                            return nd.getClientColorAt(var4_7);
                        }
                        v15 /* !! */  = (long)ji.ktxn("kxif", ktxk(int ), (int)927);
                    }
                    case 2: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxii", ktxk(int ), (int)930);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 7: {
                        var6_5 /* !! */  = (int)ji.ktxn("kxio", ktxk(int ), (int)935);
                        if (var7_4) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                break;
            }
            ** GOTO lbl181
        }
        do {
            if (true) ** continue;
lbl181:
            // 2 sources

            var6_5 /* !! */  = (int)ji.ktxn("kxik", ktxk(int ), (int)932);
            cfr_temp_0 = 2;
        } while (!var7_4);
        throw null;
    }

    public static /* synthetic */ CallSite ktxn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kxzq() {
        ji.ktyx[400] = -212454419126244378L;
        ji.ktyx[401] = 5215867050446409179L;
        ji.ktyx[402] = 6060462210809278586L;
        ji.ktyx[403] = 5173379647930161137L;
        ji.ktyx[404] = 3781005186610385116L;
        ji.ktyx[405] = -34647701594649833L;
        ji.ktyx[406] = -7507133275932501741L;
        ji.ktyx[407] = -5213449676934470070L;
        ji.ktyx[408] = -1805494619201606641L;
        ji.ktyx[409] = -8271533196672201822L;
        ji.ktyx[410] = 4501558550423485230L;
        ji.ktyx[411] = 242816995585527692L;
        ji.ktyx[412] = 6174221954011903319L;
        ji.ktyx[413] = 1292148174357908760L;
        ji.ktyx[414] = -781435680548279877L;
        ji.ktyx[415] = -2530518411179280921L;
        ji.ktyx[416] = 3585073916014323129L;
        ji.ktyx[417] = -6270373054174632994L;
        ji.ktyx[418] = 3644910550125812548L;
        ji.ktyx[419] = -5466731032756100034L;
        ji.ktyx[420] = -7038036496533886393L;
        ji.ktyx[421] = 7437885504919108930L;
        ji.ktyx[422] = 5548412665380436701L;
        ji.ktyx[423] = 8344424182656450001L;
        ji.ktyx[424] = 8115994132573121046L;
        ji.ktyx[425] = 5020329626983700549L;
        ji.ktyx[426] = 6743221497667198915L;
        ji.ktyx[427] = -4225905277684195745L;
        ji.ktyx[428] = -6426205131114375957L;
        ji.ktyx[429] = 2193687703153116706L;
        ji.ktyx[430] = -2948665867124478464L;
        ji.ktyx[431] = 164456926830374699L;
        ji.ktyx[432] = 2365169534874727124L;
        ji.ktyx[433] = 3481823287782825675L;
        ji.ktyx[434] = 9193385949270123912L;
        ji.ktyx[435] = -3707758185276736152L;
        ji.ktyx[436] = -5960546247240067654L;
        ji.ktyx[437] = -1368029647171070258L;
        ji.ktyx[438] = 1085256264870755796L;
        ji.ktyx[439] = -1723028670699782460L;
        ji.ktyx[440] = 799137727675976804L;
        ji.ktyx[441] = -7949359229516504339L;
        ji.ktyx[442] = 16679781098511929L;
        ji.ktyx[443] = 3701302306175903012L;
        ji.ktyx[444] = 2925987157212852229L;
        ji.ktyx[445] = 1844395111921116773L;
        ji.ktyx[446] = -3451811505042836885L;
        ji.ktyx[447] = -7815692355067330149L;
        ji.ktyx[448] = 5226705005671675168L;
        ji.ktyx[449] = -7244578635096936106L;
        ji.ktyx[450] = 4592496873249452955L;
        ji.ktyx[451] = -3984799505448060213L;
        ji.ktyx[452] = -2024289604083163848L;
        ji.ktyx[453] = 8934743125113645933L;
        ji.ktyx[454] = 5037578348653713153L;
        ji.ktyx[455] = 8648961167298998141L;
        ji.ktyx[456] = -8675496212730190506L;
        ji.ktyx[457] = 4361307789942699700L;
        ji.ktyx[458] = 5815147498938349930L;
        ji.ktyx[459] = -941130079007280872L;
        ji.ktyx[460] = 5218845418741986403L;
        ji.ktyx[461] = 2152420390830245494L;
        ji.ktyx[462] = 2585503682115182638L;
        ji.ktyx[463] = -8188260978773932409L;
        ji.ktyx[464] = 1131780844727440477L;
        ji.ktyx[465] = 296842649231023346L;
        ji.ktyx[466] = -7209489469839641874L;
        ji.ktyx[467] = -1188377181828015105L;
        ji.ktyx[468] = 8525823729335525733L;
        ji.ktyx[469] = -1221924796084696489L;
        ji.ktyx[470] = 6462507732829280796L;
        ji.ktyx[471] = -3856687142361420443L;
        ji.ktyx[472] = -4212540111553865854L;
        ji.ktyx[473] = 7206375997672486624L;
        ji.ktyx[474] = -8171587474134451709L;
        ji.ktyx[475] = -6771033927183139947L;
        ji.ktyx[476] = 3352835468449234998L;
        ji.ktyx[477] = 6575150520942188406L;
        ji.ktyx[478] = 3321142285940913539L;
        ji.ktyx[479] = -1717196612787110633L;
        ji.ktyx[480] = 370636341916916723L;
        ji.ktyx[481] = -3142103860588621048L;
        ji.ktyx[482] = 3885975418606561944L;
        ji.ktyx[483] = -8185079761308303410L;
        ji.ktyx[484] = -8087937654942652256L;
        ji.ktyx[485] = 1387185788929289210L;
        ji.ktyx[486] = -3543878612840329342L;
        ji.ktyx[487] = 5042571496265388406L;
        ji.ktyx[488] = 8189985185146273894L;
        ji.ktyx[489] = 1654044287432501601L;
        ji.ktyx[490] = 1583078798683566753L;
        ji.ktyx[491] = -6136853247838372815L;
        ji.ktyx[492] = 7121311074544261065L;
        ji.ktyx[493] = -7685683173774044522L;
        ji.ktyx[494] = -1990259138913695114L;
        ji.ktyx[495] = 2906143182041866418L;
        ji.ktyx[496] = -4290099229071214401L;
        ji.ktyx[497] = -2976994020990408100L;
        ji.ktyx[498] = -2123101452847541370L;
        ji.ktyx[499] = 4471977427515285016L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onAttack(bj var1_1) {
        v0 /* !! */  = ji.tf;
        block53: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1270001143: {
                    v0 /* !! */  = (long)(ji.ktxn("kuhh", ktyv(int ), (int)79) - ji.ktxn("kuhg", ktyv(int ), (int)78));
                    continue block53;
                }
                case 733325436: {
                    break block53;
                }
            }
            break;
        }
        var6_2 = ji.c;
        v1 /* !! */  = ji.tf;
        block54: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 733325436: {
                    break block54;
                }
                case 2057874801: {
                    v1 /* !! */  = (long)(ji.ktxn("kuhj", ktyv(int ), (int)81) - ji.ktxn("kuhi", ktyv(int ), (int)80));
                    continue block54;
                }
            }
            break;
        }
        var5_3 /* !! */  = ji.b;
        v2 /* !! */  = ji.tf;
        block55: while (true) {
            switch ((int)v2 /* !! */ ) {
                case 733325436: {
                    break block55;
                }
                case 1726480050: {
                    v2 /* !! */  = (long)(ji.ktxn("kuhl", ktyv(int ), (int)83) - ji.ktxn("kuhk", ktyv(int ), (int)82));
                    continue block55;
                }
            }
            break;
        }
        var4_4 = ji.a;
        if (var6_2) {
            throw null;
        }
        if (var4_4 || var4_4) return;
        v3 /* !! */  = ji.tf;
        if (true) ** GOTO lbl35
        block56: while (true) {
            v3 /* !! */  = (long)(v4 - ji.ktxn("kuhm", ktyv(int ), (int)84));
lbl35:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1918135322: {
                    v4 = ji.ktxn("kuhn", ktyv(int ), (int)85);
                    continue block56;
                }
                case -1086414965: {
                    v4 = ji.ktxn("kuho", ktyv(int ), (int)86);
                    continue block56;
                }
                case 733325436: {
                    break block56;
                }
                case 1373356415: {
                    v4 = ji.ktxn("kuhp", ktyv(int ), (int)87);
                    continue block56;
                }
            }
            break;
        }
        v5 /* !! */  = ji.tf;
        if (true) ** GOTO lbl51
        block57: while (true) {
            v5 /* !! */  = (long)(v6 - ji.ktxn("kuhq", ktyv(int ), (int)88));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1991552759: {
                    v6 = ji.ktxn("kuhr", ktyv(int ), (int)89);
                    continue block57;
                }
                case -913191641: {
                    v6 = ji.ktxn("kuhs", ktyv(int ), (int)90);
                    continue block57;
                }
                case 733325436: {
                    break block57;
                }
                case 1901541320: {
                    v6 = ji.ktxn("kuht", ktyv(int ), (int)91);
                    continue block57;
                }
            }
            break;
        }
        if (!this.reasons.isSelected("\u041a\u0440\u0438\u0442 \u0443\u0434\u0430\u0440")) ** GOTO lbl95
        if (var4_4 || var4_4) return;
        v7 /* !! */  = ji.tf;
        block58: while (true) {
            switch ((int)v7 /* !! */ ) {
                case 220698179: {
                    v7 /* !! */  = (long)(ji.ktxn("kuhv", ktyv(int ), (int)93) - ji.ktxn("kuhu", ktyv(int ), (int)92));
                    continue block58;
                }
                case 733325436: {
                    break block58;
                }
            }
            break;
        }
        var3_5 = var1_1.getTarget();
        if (var4_4) return;
        if (!(var3_5 instanceof class_1309)) ** GOTO lbl95
        if (var4_4) return;
        var2_6 = (class_1309)var3_5;
        if (var4_4) return;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block59: while (true) {
            block88: {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4) return;
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kuhw", ktyv(int ), (int)94)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v8 /* !! */  != ji.ktxn("kuhx", ktxk(int ), (int)169)) ** GOTO lbl92
                            if (!this.isCriticalHit()) {
                                break;
                            }
                            ** GOTO lbl97
lbl92:
                            // 1 sources

                            v8 /* !! */  = (long)ji.ktxn("kuhy", ktxk(int ), (int)170);
                        }
                        if (var4_4) return;
lbl95:
                        // 3 sources

                        if (var4_4 || var4_4) return;
                        return;
lbl97:
                        // 1 sources

                        if (var4_4 || var4_4) return;
                        v9 /* !! */  = ji.tf;
                        block61: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case -1252206624: {
                                    v10 = ji.ktxn("kuia", ktyv(int ), (int)96);
                                    ** GOTO lbl106
                                }
                                case -12671181: {
                                    v10 = ji.ktxn("kuib", ktyv(int ), (int)97);
lbl106:
                                    // 2 sources

                                    v9 /* !! */  = (long)(v10 - ji.ktxn("kuhz", ktyv(int ), (int)95));
                                    continue block61;
                                }
                                case 733325436: {
                                    break block61;
                                }
                            }
                            break;
                        }
                        this.spawnCriticalBurst(var2_6);
                        if (!var4_4 && !var4_4) return;
                        return;
                    }
                    case 0: {
                        ** GOTO lbl172
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuif", ktxk(int ), (int)174);
                        cfr_temp_0 = 15;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuii", ktxk(int ), (int)177);
                        cfr_temp_0 = 1;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuio", ktxk(int ), (int)183);
                        cfr_temp_0 = 10;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuip", ktxk(int ), (int)184);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        do {
                            var5_3 /* !! */  = (int)ji.ktxn("kuin", ktxk(int ), (int)182);
                        } while (!var6_2);
                        throw null;
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuiq", ktxk(int ), (int)185);
                        cfr_temp_0 = 2;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuir", ktxk(int ), (int)186);
                        cfr_temp_0 = 2;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuis", ktxk(int ), (int)187);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuil", ktxk(int ), (int)180);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuim", ktxk(int ), (int)181);
                        cfr_temp_0 = 8;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 17: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuit", ktxk(int ), (int)188);
                        if (var6_2) {
                            throw null;
                        }
lbl172:
                        // 3 sources

                        var5_3 /* !! */  = (int)ji.ktxn("kuic", ktxk(int ), (int)171);
                        cfr_temp_0 = 8;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuid", ktxk(int ), (int)172);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuij", ktxk(int ), (int)178);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuik", ktxk(int ), (int)179);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuig", ktxk(int ), (int)175);
                        cfr_temp_0 = 1;
                        if (var6_2) {
                            throw null;
                        }
                        break block88;
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)ji.ktxn("kuie", ktxk(int ), (int)173);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl204
            }
            do {
                if (true) continue block59;
lbl204:
                // 2 sources

                var5_3 /* !! */  = (int)ji.ktxn("kuih", ktxk(int ), (int)176);
                cfr_temp_0 = 2;
            } while (!var6_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void kxzk() {
        ji.ktyw[400] = -7349243555929037398L;
        ji.ktyw[401] = -6255003308486534405L;
        ji.ktyw[402] = 7144497853131667447L;
        ji.ktyw[403] = -4050055245807953770L;
        ji.ktyw[404] = -8259967227552224409L;
        ji.ktyw[405] = -5031726839800260498L;
        ji.ktyw[406] = -8193965209244767785L;
        ji.ktyw[407] = 8504680233839869143L;
        ji.ktyw[408] = -7352086675279624696L;
        ji.ktyw[409] = -5913993995308967601L;
        ji.ktyw[410] = -6572950274907955500L;
        ji.ktyw[411] = -5507983644551112014L;
        ji.ktyw[412] = 8857775723081099274L;
        ji.ktyw[413] = -2454085809600452572L;
        ji.ktyw[414] = -3568770621505029488L;
        ji.ktyw[415] = 7836297090075523106L;
        ji.ktyw[416] = 1015208241260971047L;
        ji.ktyw[417] = -8158791633624071425L;
        ji.ktyw[418] = -2200185611403748547L;
        ji.ktyw[419] = 881982906172169321L;
        ji.ktyw[420] = 464513547028383108L;
        ji.ktyw[421] = -4710031001969655185L;
        ji.ktyw[422] = -4169480048327565902L;
        ji.ktyw[423] = -3106220499710770210L;
        ji.ktyw[424] = -6308190389362272748L;
        ji.ktyw[425] = -2715131439701553819L;
        ji.ktyw[426] = 9156251319622362803L;
        ji.ktyw[427] = -1583617737414313113L;
        ji.ktyw[428] = -6420635384192753252L;
        ji.ktyw[429] = -6825896345751796118L;
        ji.ktyw[430] = -5136016138543114892L;
        ji.ktyw[431] = 8102918463180870997L;
        ji.ktyw[432] = -8505264962501617448L;
        ji.ktyw[433] = -7029112201837784381L;
        ji.ktyw[434] = 2545716746109545500L;
        ji.ktyw[435] = 6684142882483870068L;
        ji.ktyw[436] = -5787453489381788415L;
        ji.ktyw[437] = -7644695164175320996L;
        ji.ktyw[438] = -9075200959973467885L;
        ji.ktyw[439] = 6410724630827865798L;
        ji.ktyw[440] = -7715396001160365774L;
        ji.ktyw[441] = -1073786540540424932L;
        ji.ktyw[442] = -2608285066655158842L;
        ji.ktyw[443] = 5244958319729431425L;
        ji.ktyw[444] = -5678627763567666610L;
        ji.ktyw[445] = 2284821734800959846L;
        ji.ktyw[446] = -3090928852180049347L;
        ji.ktyw[447] = -7530645581470423187L;
        ji.ktyw[448] = -3429863588076303589L;
        ji.ktyw[449] = -1977618870887141034L;
        ji.ktyw[450] = 3938839508854156042L;
        ji.ktyw[451] = 8842181712571835773L;
        ji.ktyw[452] = 953910956883130517L;
        ji.ktyw[453] = 4917427627905407945L;
        ji.ktyw[454] = 36808400837249309L;
        ji.ktyw[455] = 1225491677073412909L;
        ji.ktyw[456] = -3510566376927258928L;
        ji.ktyw[457] = -4752655044739643183L;
        ji.ktyw[458] = -3498493769896696179L;
        ji.ktyw[459] = 1959245208604789612L;
        ji.ktyw[460] = -7994979896236666949L;
        ji.ktyw[461] = 1886704090562016288L;
        ji.ktyw[462] = 6242694441486100798L;
        ji.ktyw[463] = -1759129801986971260L;
        ji.ktyw[464] = -8070222921760068634L;
        ji.ktyw[465] = -3014446346107887414L;
        ji.ktyw[466] = 850598051321805007L;
        ji.ktyw[467] = -3960191810150963392L;
        ji.ktyw[468] = 4721286523803098629L;
        ji.ktyw[469] = 7474262122708137447L;
        ji.ktyw[470] = 9197974183503123364L;
        ji.ktyw[471] = -6443405365544607197L;
        ji.ktyw[472] = 1131279180106648050L;
        ji.ktyw[473] = 8410953189180905979L;
        ji.ktyw[474] = -2801572070565438625L;
        ji.ktyw[475] = -8208874447806808622L;
        ji.ktyw[476] = 8332179766076653966L;
        ji.ktyw[477] = -7322639076736812473L;
        ji.ktyw[478] = -4617009838944021370L;
        ji.ktyw[479] = -4730549775148955038L;
        ji.ktyw[480] = 4309140096640363894L;
        ji.ktyw[481] = 1827195023124134869L;
        ji.ktyw[482] = 8867356208941264812L;
        ji.ktyw[483] = -6288366048243855237L;
        ji.ktyw[484] = -4745623600559230622L;
        ji.ktyw[485] = 8138020752172437867L;
        ji.ktyw[486] = -203207781322583710L;
        ji.ktyw[487] = -7298783671435568061L;
        ji.ktyw[488] = 7527480646721961422L;
        ji.ktyw[489] = -1403141006555159559L;
        ji.ktyw[490] = -4368212913624881025L;
        ji.ktyw[491] = -2225481892661124528L;
        ji.ktyw[492] = 7338323282657111490L;
        ji.ktyw[493] = 3450294875122415257L;
        ji.ktyw[494] = 5747065806658605175L;
        ji.ktyw[495] = 8759088159568283247L;
        ji.ktyw[496] = 5869012420353333296L;
        ji.ktyw[497] = -78558040177805119L;
        ji.ktyw[498] = 6377286654044659651L;
        ji.ktyw[499] = 2452500694982993533L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void spawnTotemBurst(class_1309 var1_1) {
        var15_2 = ji.c;
        var14_3 /* !! */  = ji.b;
        var13_4 = ji.a;
        if (var15_2) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var13_4 || var13_4) ** GOTO lbl6
        var2_5 = ThreadLocalRandom.current();
        if (var14_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_4 || var13_4) ** GOTO lbl6
                var3_6 = Math.min((int)ji.ktxn("kvmr", ktxk(int ), (int)542), Math.max((int)ji.ktxn("kvmt", ktxk(int ), (int)543), (int)(ji.ktxn("kvmv", ktxk(int ), (int)544) - this.particles.size())));
                if (var13_4 || var13_4) ** GOTO lbl6
                var4_7 = var1_1.method_23318() + (double)var1_1.method_17682() * ji.ktxn("kvmx", kufx(int ), (int)227);
                if (var13_4 || var13_4) ** GOTO lbl6
                var6_8 = this.size.getValue();
                if (var13_4 || var13_4) ** GOTO lbl6
                var7_9 = ji.ktxn("kvmz", ktxk(int ), (int)545);
                if (var13_4) ** GOTO lbl6
                do {
                    if (var13_4 || var13_4) ** GOTO lbl6
                    if (var7_9 >= var3_6) ** GOTO lbl47
                    if (var13_4 || var13_4) ** GOTO lbl6
                    var8_10 = var2_5.nextDouble() * ji.ktxn("kvnb", kufx(int ), (int)228);
                    if (var13_4 || var13_4) ** GOTO lbl6
                    var10_11 = var2_5.nextDouble((double)ji.ktxn("kvnd", kufx(int ), (int)229), (double)ji.ktxn("kvnf", kufx(int ), (int)230));
                    if (var13_4 || var13_4) ** GOTO lbl6
                    if (!var2_5.nextBoolean()) ** GOTO lbl37
                    if (var13_4 || var13_4) ** GOTO lbl6
                    var12_12 = ji.rgb((int)(ji.ktxn("kvnh", ktxk(int ), (int)546) + var2_5.nextInt((int)ji.ktxn("kvnj", ktxk(int ), (int)547))), (int)(ji.ktxn("kvnk", ktxk(int ), (int)548) + var2_5.nextInt((int)ji.ktxn("kvnl", ktxk(int ), (int)549))), var2_5.nextInt((int)ji.ktxn("kvnn", ktxk(int ), (int)550)));
                    if (var13_4 || var13_4) ** GOTO lbl6
                    if (var15_2) {
                        throw null;
                    }
                    ** GOTO lbl40
lbl37:
                    // 1 sources

                    if (var13_4 || var13_4) ** GOTO lbl6
                    var12_12 = ji.rgb((int)(ji.ktxn("kvnp", ktxk(int ), (int)551) + var2_5.nextInt((int)ji.ktxn("kvnr", ktxk(int ), (int)552))), (int)(ji.ktxn("kvns", ktxk(int ), (int)553) + var2_5.nextInt((int)ji.ktxn("kvnt", ktxk(int ), (int)554))), var2_5.nextInt((int)ji.ktxn("kvnu", ktxk(int ), (int)555)));
                    if (var13_4) ** GOTO lbl6
lbl40:
                    // 2 sources

                    if (var13_4 || var13_4) ** GOTO lbl6
                    this.addEventParticle(var1_1.method_23317() + var2_5.nextDouble((double)ji.ktxn("kvnw", kufx(int ), (int)231), (double)ji.ktxn("kvnx", kufx(int ), (int)232)), var4_7 + var2_5.nextDouble((double)ji.ktxn("kvny", kufx(int ), (int)233), (double)ji.ktxn("kvnz", kufx(int ), (int)234)), var1_1.method_23321() + var2_5.nextDouble((double)ji.ktxn("kvoa", kufx(int ), (int)235), (double)ji.ktxn("kvob", kufx(int ), (int)236)), Math.cos(var8_10) * var10_11, var2_5.nextDouble((double)ji.ktxn("kvod", kufx(int ), (int)237), (double)ji.ktxn("kvof", kufx(int ), (int)238)), Math.sin(var8_10) * var10_11, var6_8 * (ji.ktxn("kvoi", ktxr(int ), (int)556) + var2_5.nextFloat() * ji.ktxn("kvol", ktxr(int ), (int)557)), (float)(ji.ktxn("kvom", ktxr(int ), (int)558) * (ji.ktxn("kvoo", ktxr(int ), (int)559) + var2_5.nextFloat() * ji.ktxn("kvoq", ktxr(int ), (int)560))), ji$ParticleKind.TOTEM, var12_12);
                    if (var13_4 || var13_4) ** GOTO lbl6
                    ++var7_9;
                    if (var13_4) ** GOTO lbl6
                } while (!var15_2);
                throw null;
lbl47:
                // 1 sources

                if (!var13_4 && !var13_4) ** break;
                ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: {
                var14_3 /* !! */  = (int)ji.ktxn("kvou", ktxk(int ), (int)561);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 1: {
                var14_3 /* !! */  = (int)ji.ktxn("kvow", ktxk(int ), (int)562);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl60:
            // 2 sources

            case 2: {
                var14_3 /* !! */  = (int)ji.ktxn("kvoy", ktxk(int ), (int)563);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl65:
            // 3 sources

            case 3: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpa", ktxk(int ), (int)564);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 4: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpc", ktxk(int ), (int)565);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 5: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpd", ktxk(int ), (int)566);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpe", ktxk(int ), (int)567);
                if (!var15_2) ** GOTO lbl65
                throw null;
            }
lbl84:
            // 2 sources

            case 7: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpf", ktxk(int ), (int)568);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 8: {
                var14_3 /* !! */  = (int)ji.ktxn("kvph", ktxk(int ), (int)569);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 9: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpi", ktxk(int ), (int)570);
                if (!var15_2) break;
                throw null;
            }
lbl98:
            // 2 sources

            case 10: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpj", ktxk(int ), (int)571);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl103:
            // 3 sources

            case 11: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpk", ktxk(int ), (int)572);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl108:
            // 3 sources

            case 12: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpl", ktxk(int ), (int)573);
                if (!var15_2) ** GOTO lbl50
                throw null;
            }
lbl112:
            // 2 sources

            case 13: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpm", ktxk(int ), (int)574);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 14: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpo", ktxk(int ), (int)575);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl122:
            // 2 sources

            case 15: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpr", ktxk(int ), (int)576);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl127:
            // 2 sources

            case 16: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpt", ktxk(int ), (int)577);
                if (!var15_2) ** GOTO lbl98
                throw null;
            }
lbl131:
            // 4 sources

            case 17: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpv", ktxk(int ), (int)578);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl136:
            // 4 sources

            case 18: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpx", ktxk(int ), (int)579);
                if (!var15_2) ** GOTO lbl103
                throw null;
            }
lbl140:
            // 2 sources

            case 19: {
                var14_3 /* !! */  = (int)ji.ktxn("kvpz", ktxk(int ), (int)580);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 20: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqb", ktxk(int ), (int)581);
                if (!var15_2) ** GOTO lbl131
                throw null;
            }
            case 21: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqe", ktxk(int ), (int)582);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl154:
            // 2 sources

            case 22: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqg", ktxk(int ), (int)583);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl159:
            // 2 sources

            case 23: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqi", ktxk(int ), (int)584);
                if (!var15_2) ** GOTO lbl65
                throw null;
            }
            case 24: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqk", ktxk(int ), (int)585);
                if (!var15_2) ** GOTO lbl122
                throw null;
            }
            case 25: {
                var14_3 /* !! */  = (int)ji.ktxn("kvql", ktxk(int ), (int)586);
                if (!var15_2) ** GOTO lbl154
                throw null;
            }
lbl171:
            // 4 sources

            case 26: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqm", ktxk(int ), (int)587);
                if (!var15_2) ** GOTO lbl140
                throw null;
            }
lbl175:
            // 2 sources

            case 27: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqn", ktxk(int ), (int)588);
                if (!var15_2) ** GOTO lbl84
                throw null;
            }
lbl179:
            // 2 sources

            case 28: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqo", ktxk(int ), (int)589);
                if (!var15_2) ** GOTO lbl108
                throw null;
            }
lbl183:
            // 4 sources

            case 29: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_3 /* !! */  = (int)ji.ktxn("kvqp", ktxk(int ), (int)590);
                    if (!var15_2) ** GOTO lbl60
                    throw null;
                }
            }
            case 30: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqq", ktxk(int ), (int)591);
                if (!var15_2) ** GOTO lbl103
                throw null;
            }
            case 31: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqr", ktxk(int ), (int)592);
                if (!var15_2) ** GOTO lbl108
                throw null;
            }
lbl196:
            // 2 sources

            case 32: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqs", ktxk(int ), (int)593);
                if (!var15_2) ** GOTO lbl171
                throw null;
            }
lbl200:
            // 2 sources

            case 33: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqt", ktxk(int ), (int)594);
                if (!var15_2) ** GOTO lbl136
                throw null;
            }
lbl204:
            // 2 sources

            case 34: {
                var14_3 /* !! */  = (int)ji.ktxn("kvqu", ktxk(int ), (int)595);
                if (!var15_2) break;
                throw null;
            }
            case 35: 
        }
        var14_3 /* !! */  = (int)ji.ktxn("kvqv", ktxk(int ), (int)596);
        ** while (!var15_2)
lbl211:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean updateBurstParticle(ji$GlowParticle var1_1, float var2_2) {
        block115: {
            block114: {
                var20_3 = ji.c;
                var19_4 /* !! */  = ji.b;
                var18_5 = ji.a;
                if (var20_3) {
                    throw null;
lbl6:
                    // 30 sources

                    return (boolean)ji.ktxn("kwah", ktxk(int ), (int)674);
                }
                if (var18_5 || var18_5) ** GOTO lbl6
                var3_6 = Math.min(1.0f, var1_1.age / Math.max((float)ji.ktxn("kwaj", ktxr(int ), (int)675), var1_1.maxAge));
                if (var18_5 || var18_5) ** GOTO lbl6
                if (var1_1.kind != ji$ParticleKind.CRITICAL) break block114;
                if (var18_5) ** GOTO lbl6
                v0 = ji.ktxn("kwak", kufx(int ), (int)279);
                if (var20_3) {
                    throw null;
                }
                break block115;
            }
            if (var18_5 || var18_5) ** GOTO lbl6
            v0 = var4_7 = ji.ktxn("kwal", kufx(int ), (int)280);
        }
        if (var18_5 || var18_5) ** GOTO lbl6
        var6_8 = Math.pow(1.0 - (double)var3_6, (double)var4_7) * (double)var2_2;
        if (var18_5) ** GOTO lbl6
        if (var19_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var19_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var18_5) ** GOTO lbl6
                var8_9 = ji.ktxn("kwam", kufx(int ), (int)281);
                if (var18_5 || var18_5) ** GOTO lbl6
                var10_10 = var1_1.x + var1_1.vx * var6_8;
                if (var18_5 || var18_5) ** GOTO lbl6
                if (this.isFree(var10_10, var1_1.y, var1_1.z, this.collisionPos)) ** GOTO lbl38
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.vx *= -var8_9;
                if (var18_5 || var18_5) ** GOTO lbl6
                var10_10 = var1_1.x;
                if (var18_5) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var18_5 || var18_5) ** GOTO lbl6
                var12_11 = var1_1.y + var1_1.vy * var6_8;
                if (var18_5 || var18_5) ** GOTO lbl6
                if (this.isFree(var10_10, var12_11, var1_1.z, this.collisionPos)) ** GOTO lbl47
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.vy *= -var8_9;
                if (var18_5 || var18_5) ** GOTO lbl6
                var12_11 = var1_1.y;
                if (var18_5) ** GOTO lbl6
lbl47:
                // 2 sources

                if (var18_5 || var18_5) ** GOTO lbl6
                var14_12 = var1_1.z + var1_1.vz * var6_8;
                if (var18_5 || var18_5) ** GOTO lbl6
                if (this.isFree(var10_10, var12_11, var14_12, this.collisionPos)) ** GOTO lbl56
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.vz *= -var8_9;
                if (var18_5 || var18_5) ** GOTO lbl6
                var14_12 = var1_1.z;
                if (var18_5) ** GOTO lbl6
lbl56:
                // 2 sources

                if (var18_5 || var18_5) ** GOTO lbl6
                var16_13 = Math.pow((double)ji.ktxn("kwas", kufx(int ), (int)282), (double)var2_2 * ji.ktxn("kwau", kufx(int ), (int)283));
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.vx *= var16_13;
                if (var18_5 || var18_5) ** GOTO lbl6
                v1 = var1_1.vy * var16_13;
                if (var1_1.kind == ji$ParticleKind.CRITICAL) {
                    v2 = ji.ktxn("kwaz", kufx(int ), (int)284);
                    if (var20_3) {
                        throw null;
                    }
                } else {
                    v2 = ji.ktxn("kwbb", kufx(int ), (int)285);
                }
                var1_1.vy = v1 - v2 * (double)var2_2;
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.vz *= var16_13;
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.x = var10_10;
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.y = var12_11;
                if (var18_5 || var18_5) ** GOTO lbl6
                var1_1.z = var14_12;
                if (!var18_5 && !var18_5) ** break;
                ** continue;
                return (boolean)ji.ktxn("kwbi", ktxk(int ), (int)676);
            }
lbl80:
            // 2 sources

            case 0: {
                var19_4 /* !! */  = (int)ji.ktxn("kwbk", ktxk(int ), (int)677);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 1: {
                var19_4 /* !! */  = (int)ji.ktxn("kwbm", ktxk(int ), (int)678);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl90:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var19_4 /* !! */  = (int)ji.ktxn("kwbp", ktxk(int ), (int)679);
                    if (var20_3) {
                        throw null;
                    }
                    ** GOTO lbl199
                    break;
                }
            }
lbl96:
            // 2 sources

            case 3: {
                var19_4 /* !! */  = (int)ji.ktxn("kwbr", ktxk(int ), (int)680);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl101:
            // 2 sources

            case 4: {
                var19_4 /* !! */  = (int)ji.ktxn("kwbt", ktxk(int ), (int)681);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl106:
            // 3 sources

            case 5: {
                var19_4 /* !! */  = (int)ji.ktxn("kwbv", ktxk(int ), (int)682);
                if (!var20_3) ** GOTO lbl90
                throw null;
            }
            case 6: {
                var19_4 /* !! */  = (int)ji.ktxn("kwby", ktxk(int ), (int)683);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl115:
            // 3 sources

            case 7: {
                var19_4 /* !! */  = (int)ji.ktxn("kwca", ktxk(int ), (int)684);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 8: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcd", ktxk(int ), (int)685);
                if (!var20_3) ** GOTO lbl96
                throw null;
            }
lbl124:
            // 2 sources

            case 9: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcf", ktxk(int ), (int)686);
                if (!var20_3) ** GOTO lbl106
                throw null;
            }
lbl128:
            // 2 sources

            case 10: {
                var19_4 /* !! */  = (int)ji.ktxn("kwch", ktxk(int ), (int)687);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl133:
            // 3 sources

            case 11: {
                do {
                    var19_4 /* !! */  = (int)ji.ktxn("kwcj", ktxk(int ), (int)688);
                } while (!var20_3);
                throw null;
            }
            case 12: {
                do {
                    var19_4 /* !! */  = (int)ji.ktxn("kwcl", ktxk(int ), (int)689);
                } while (!var20_3);
                throw null;
            }
            case 13: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcn", ktxk(int ), (int)690);
                if (!var20_3) ** GOTO lbl115
                throw null;
            }
lbl147:
            // 4 sources

            case 14: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcq", ktxk(int ), (int)691);
                if (!var20_3) ** GOTO lbl133
                throw null;
            }
lbl151:
            // 3 sources

            case 15: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcr", ktxk(int ), (int)692);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl156:
            // 4 sources

            case 16: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcs", ktxk(int ), (int)693);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl161:
            // 2 sources

            case 17: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcv", ktxk(int ), (int)694);
                if (!var20_3) ** GOTO lbl80
                throw null;
            }
lbl165:
            // 2 sources

            case 18: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcx", ktxk(int ), (int)695);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl170:
            // 2 sources

            case 19: {
                var19_4 /* !! */  = (int)ji.ktxn("kwcz", ktxk(int ), (int)696);
                if (!var20_3) ** GOTO lbl156
                throw null;
            }
            case 20: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdc", ktxk(int ), (int)697);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 21: {
                var19_4 /* !! */  = (int)ji.ktxn("kwde", ktxk(int ), (int)698);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl184:
            // 3 sources

            case 22: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdg", ktxk(int ), (int)699);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 23: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdi", ktxk(int ), (int)700);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 24: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdk", ktxk(int ), (int)701);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl199:
            // 5 sources

            case 25: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdl", ktxk(int ), (int)702);
                if (!var20_3) ** GOTO lbl124
                throw null;
            }
lbl203:
            // 2 sources

            case 26: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdm", ktxk(int ), (int)703);
                if (!var20_3) ** GOTO lbl199
                throw null;
            }
            case 27: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdp", ktxk(int ), (int)704);
                if (!var20_3) ** GOTO lbl101
                throw null;
            }
lbl211:
            // 2 sources

            case 28: {
                var19_4 /* !! */  = (int)ji.ktxn("kwds", ktxk(int ), (int)705);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 29: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdv", ktxk(int ), (int)706);
                if (!var20_3) ** GOTO lbl199
                throw null;
            }
            case 30: {
                var19_4 /* !! */  = (int)ji.ktxn("kwdy", ktxk(int ), (int)707);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 31: {
                var19_4 /* !! */  = (int)ji.ktxn("kwec", ktxk(int ), (int)708);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl230:
            // 2 sources

            case 32: {
                var19_4 /* !! */  = (int)ji.ktxn("kwee", ktxk(int ), (int)709);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl235:
            // 3 sources

            case 33: {
                var19_4 /* !! */  = (int)ji.ktxn("kweh", ktxk(int ), (int)710);
                if (!var20_3) ** GOTO lbl151
                throw null;
            }
lbl239:
            // 2 sources

            case 34: {
                var19_4 /* !! */  = (int)ji.ktxn("kwek", ktxk(int ), (int)711);
                if (!var20_3) ** GOTO lbl151
                throw null;
            }
            case 35: {
                var19_4 /* !! */  = (int)ji.ktxn("kwen", ktxk(int ), (int)712);
                if (var20_3) {
                    throw null;
                }
            }
            case 36: {
                var19_4 /* !! */  = (int)ji.ktxn("kweq", ktxk(int ), (int)713);
                if (!var20_3) ** GOTO lbl203
                throw null;
            }
lbl251:
            // 3 sources

            case 37: {
                var19_4 /* !! */  = (int)ji.ktxn("kwes", ktxk(int ), (int)714);
                if (!var20_3) ** GOTO lbl156
                throw null;
            }
lbl255:
            // 2 sources

            case 38: {
                var19_4 /* !! */  = (int)ji.ktxn("kwev", ktxk(int ), (int)715);
                if (!var20_3) ** GOTO lbl251
                throw null;
            }
lbl259:
            // 2 sources

            case 39: {
                var19_4 /* !! */  = (int)ji.ktxn("kwey", ktxk(int ), (int)716);
                if (!var20_3) ** GOTO lbl235
                throw null;
            }
lbl263:
            // 3 sources

            case 40: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfb", ktxk(int ), (int)717);
                if (!var20_3) ** GOTO lbl156
                throw null;
            }
lbl267:
            // 2 sources

            case 41: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfd", ktxk(int ), (int)718);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl272:
            // 3 sources

            case 42: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfe", ktxk(int ), (int)719);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl277:
            // 2 sources

            case 43: {
                var19_4 /* !! */  = (int)ji.ktxn("kwff", ktxk(int ), (int)720);
                if (!var20_3) ** GOTO lbl184
                throw null;
            }
            case 44: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfj", ktxk(int ), (int)721);
                if (var20_3) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl286:
            // 2 sources

            case 45: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfn", ktxk(int ), (int)722);
                if (!var20_3) ** GOTO lbl147
                throw null;
            }
            case 46: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfp", ktxk(int ), (int)723);
                if (!var20_3) ** GOTO lbl147
                throw null;
            }
lbl294:
            // 4 sources

            case 47: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfs", ktxk(int ), (int)724);
                if (!var20_3) ** GOTO lbl161
                throw null;
            }
            case 48: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfv", ktxk(int ), (int)725);
                if (!var20_3) ** GOTO lbl115
                throw null;
            }
            case 49: {
                var19_4 /* !! */  = (int)ji.ktxn("kwfy", ktxk(int ), (int)726);
                if (!var20_3) ** GOTO lbl272
                throw null;
            }
            case 50: {
                var19_4 /* !! */  = (int)ji.ktxn("kwgb", ktxk(int ), (int)727);
                if (!var20_3) ** GOTO lbl263
                throw null;
            }
lbl310:
            // 3 sources

            case 51: {
                var19_4 /* !! */  = (int)ji.ktxn("kwge", ktxk(int ), (int)728);
                if (!var20_3) ** GOTO lbl147
                throw null;
            }
            case 52: {
                var19_4 /* !! */  = (int)ji.ktxn("kwgh", ktxk(int ), (int)729);
                if (!var20_3) ** GOTO lbl128
                throw null;
            }
lbl318:
            // 2 sources

            case 53: {
                var19_4 /* !! */  = (int)ji.ktxn("kwgk", ktxk(int ), (int)730);
                if (!var20_3) ** GOTO lbl230
                throw null;
            }
            case 54: {
                var19_4 /* !! */  = (int)ji.ktxn("kwgn", ktxk(int ), (int)731);
                if (!var20_3) ** GOTO lbl106
                throw null;
            }
lbl326:
            // 2 sources

            case 55: {
                var19_4 /* !! */  = (int)ji.ktxn("kwgq", ktxk(int ), (int)732);
                if (!var20_3) ** GOTO lbl294
                throw null;
            }
            case 56: 
        }
        var19_4 /* !! */  = (int)ji.ktxn("kwgt", ktxk(int ), (int)733);
        ** while (!var20_3)
lbl333:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxze() {
        ji.ktxm[1000] = 146374524;
        ji.ktxm[1001] = -1484980386;
        ji.ktxm[1002] = 923857311;
        ji.ktxm[1003] = 68597520;
        ji.ktxm[1004] = 289565225;
        ji.ktxm[1005] = 927797233;
        ji.ktxm[1006] = -368229967;
        ji.ktxm[1007] = -2070174538;
        ji.ktxm[1008] = 541922022;
        ji.ktxm[1009] = 711428429;
        ji.ktxm[1010] = 743285896;
        ji.ktxm[1011] = 316421559;
        ji.ktxm[1012] = -318247246;
        ji.ktxm[1013] = 203696152;
        ji.ktxm[1014] = -919785273;
        ji.ktxm[1015] = 933509286;
        ji.ktxm[1016] = -114673622;
        ji.ktxm[1017] = 772032803;
        ji.ktxm[1018] = -264338591;
        ji.ktxm[1019] = 1827034759;
        ji.ktxm[1020] = 1773484445;
        ji.ktxm[1021] = -69670276;
        ji.ktxm[1022] = 1336521909;
        ji.ktxm[1023] = 71488465;
        ji.ktxm[1024] = -198956013;
        ji.ktxm[1025] = 187840547;
        ji.ktxm[1026] = -1392182989;
        ji.ktxm[1027] = 717704766;
        ji.ktxm[1028] = -1827896687;
        ji.ktxm[1029] = 1643032579;
        ji.ktxm[1030] = 1199843397;
        ji.ktxm[1031] = 2089550818;
        ji.ktxm[1032] = -1939790437;
        ji.ktxm[1033] = -570158816;
        ji.ktxm[1034] = 727666027;
        ji.ktxm[1035] = -1292503169;
        ji.ktxm[1036] = 1705992954;
        ji.ktxm[1037] = -208958964;
        ji.ktxm[1038] = 2041489320;
        ji.ktxm[1039] = 218531351;
        ji.ktxm[1040] = 181704127;
        ji.ktxm[1041] = -1195517281;
        ji.ktxm[1042] = 855423772;
        ji.ktxm[1043] = 1184252353;
        ji.ktxm[1044] = -2045261177;
        ji.ktxm[1045] = -1188864794;
        ji.ktxm[1046] = 599087346;
        ji.ktxm[1047] = 48375232;
        ji.ktxm[1048] = -1786584065;
        ji.ktxm[1049] = -989386405;
        ji.ktxm[1050] = 581091707;
        ji.ktxm[1051] = -2052098095;
        ji.ktxm[1052] = 1292567466;
        ji.ktxm[1053] = -679753130;
        ji.ktxm[1054] = 1092109467;
        ji.ktxm[1055] = 364636867;
        ji.ktxm[1056] = -137348382;
        ji.ktxm[1057] = -550292796;
        ji.ktxm[1058] = -595852189;
        ji.ktxm[1059] = -529213875;
        ji.ktxm[1060] = -122107877;
        ji.ktxm[1061] = 1280502805;
        ji.ktxm[1062] = -1747468801;
        ji.ktxm[1063] = 994678811;
        ji.ktxm[1064] = 1949066351;
        ji.ktxm[1065] = -1970753670;
        ji.ktxm[1066] = 741522642;
        ji.ktxm[1067] = 1110629968;
        ji.ktxm[1068] = 636836831;
        ji.ktxm[1069] = -969139673;
        ji.ktxm[1070] = -1007976226;
        ji.ktxm[1071] = 490440209;
        ji.ktxm[1072] = 1901418771;
        ji.ktxm[1073] = -1175958471;
        ji.ktxm[1074] = -952768103;
        ji.ktxm[1075] = 699345380;
        ji.ktxm[1076] = -663141971;
        ji.ktxm[1077] = 155591042;
        ji.ktxm[1078] = 206129338;
        ji.ktxm[1079] = 1902075490;
        ji.ktxm[1080] = 1625381015;
        ji.ktxm[1081] = -896091478;
        ji.ktxm[1082] = -453155261;
        ji.ktxm[1083] = 1857252889;
        ji.ktxm[1084] = -2019514362;
        ji.ktxm[1085] = 874634355;
        ji.ktxm[1086] = 1410780041;
        ji.ktxm[1087] = -626817761;
        ji.ktxm[1088] = -1435174522;
        ji.ktxm[1089] = -557342818;
        ji.ktxm[1090] = -1851323110;
        ji.ktxm[1091] = -997375083;
        ji.ktxm[1092] = -1379729802;
        ji.ktxm[1093] = 1599022697;
        ji.ktxm[1094] = -1586553106;
        ji.ktxm[1095] = 2050813314;
        ji.ktxm[1096] = 264600420;
        ji.ktxm[1097] = 1094196778;
        ji.ktxm[1098] = -121558924;
        ji.ktxm[1099] = 1576897185;
    }

    private static /* synthetic */ void kxzi() {
        ji.ktyw[200] = 3750546710629476460L;
        ji.ktyw[201] = 8627018690835167651L;
        ji.ktyw[202] = -6367228025665305352L;
        ji.ktyw[203] = -3477770918641901895L;
        ji.ktyw[204] = -1882636670225184465L;
        ji.ktyw[205] = -2915403628199902720L;
        ji.ktyw[206] = 1912101096004507556L;
        ji.ktyw[207] = -6154231795297897042L;
        ji.ktyw[208] = 2223291785464039711L;
        ji.ktyw[209] = -3423622782433074333L;
        ji.ktyw[210] = 7621867619034074651L;
        ji.ktyw[211] = -9133431093553381406L;
        ji.ktyw[212] = -4425004409397434644L;
        ji.ktyw[213] = -1299599993844637817L;
        ji.ktyw[214] = 7714447472727080068L;
        ji.ktyw[215] = 6464779212005402692L;
        ji.ktyw[216] = -952454511054947339L;
        ji.ktyw[217] = -7180324104950307837L;
        ji.ktyw[218] = -1167815689636258513L;
        ji.ktyw[219] = -8136323313184992877L;
        ji.ktyw[220] = -8478810847215734476L;
        ji.ktyw[221] = 8652086341989249818L;
        ji.ktyw[222] = 6172580361599179593L;
        ji.ktyw[223] = 7275060030982743094L;
        ji.ktyw[224] = 1092781081521127928L;
        ji.ktyw[225] = 8160138569897609218L;
        ji.ktyw[226] = -4168249658117688039L;
        ji.ktyw[227] = -3761943024227709641L;
        ji.ktyw[228] = -3826376939301841154L;
        ji.ktyw[229] = -864804486935863368L;
        ji.ktyw[230] = -9168616962071966740L;
        ji.ktyw[231] = -6933528787843218261L;
        ji.ktyw[232] = 4476860305644960043L;
        ji.ktyw[233] = -2287594448328486645L;
        ji.ktyw[234] = 5497923453633796623L;
        ji.ktyw[235] = 3163175473017184614L;
        ji.ktyw[236] = -773412794482392268L;
        ji.ktyw[237] = -1754535878198272234L;
        ji.ktyw[238] = -202194514113814799L;
        ji.ktyw[239] = -5676005575548456251L;
        ji.ktyw[240] = 2505499865759644422L;
        ji.ktyw[241] = 940902855896693432L;
        ji.ktyw[242] = -6649998106409908203L;
        ji.ktyw[243] = -245686543315098602L;
        ji.ktyw[244] = 470196896550041748L;
        ji.ktyw[245] = 6784331472216119753L;
        ji.ktyw[246] = 2907086489662233112L;
        ji.ktyw[247] = -4589792229332790964L;
        ji.ktyw[248] = 6711993882792493473L;
        ji.ktyw[249] = 4313478169470389791L;
        ji.ktyw[250] = 4388142220438874746L;
        ji.ktyw[251] = -1573765803955371683L;
        ji.ktyw[252] = -7306955010894038635L;
        ji.ktyw[253] = 3121607545065196973L;
        ji.ktyw[254] = 8597506565473392130L;
        ji.ktyw[255] = 4742917339149556202L;
        ji.ktyw[256] = -3972855757280176581L;
        ji.ktyw[257] = 2400627113806045348L;
        ji.ktyw[258] = -4870785822101445834L;
        ji.ktyw[259] = 7188811373780049015L;
        ji.ktyw[260] = -8057554854141365663L;
        ji.ktyw[261] = -977847038895830999L;
        ji.ktyw[262] = 3352710488460827151L;
        ji.ktyw[263] = -1912743186476281355L;
        ji.ktyw[264] = -2273098191663031881L;
        ji.ktyw[265] = -4016101788285197947L;
        ji.ktyw[266] = -3968223815322011722L;
        ji.ktyw[267] = -6036853602359464684L;
        ji.ktyw[268] = 6973407771693290171L;
        ji.ktyw[269] = 6285561603872203950L;
        ji.ktyw[270] = -5996769845988008838L;
        ji.ktyw[271] = 8056741206914216750L;
        ji.ktyw[272] = 6223873447983912718L;
        ji.ktyw[273] = -8337694935845357353L;
        ji.ktyw[274] = -1137736641643537523L;
        ji.ktyw[275] = 2502345668111018017L;
        ji.ktyw[276] = 3193461786610531800L;
        ji.ktyw[277] = 8673469956019028183L;
        ji.ktyw[278] = 8469359217986868907L;
        ji.ktyw[279] = 5219704556974809418L;
        ji.ktyw[280] = 8098715504128327554L;
        ji.ktyw[281] = 4063774502298480779L;
        ji.ktyw[282] = -1321842798693589338L;
        ji.ktyw[283] = 7890784583271983032L;
        ji.ktyw[284] = 6209659829808489628L;
        ji.ktyw[285] = -3432384035510374515L;
        ji.ktyw[286] = -554916521133069656L;
        ji.ktyw[287] = -4827530194483462253L;
        ji.ktyw[288] = 595662123727701043L;
        ji.ktyw[289] = 4675381116716007436L;
        ji.ktyw[290] = -7751985941151238154L;
        ji.ktyw[291] = 4653865451407388232L;
        ji.ktyw[292] = 8067390784572012906L;
        ji.ktyw[293] = 7155300889075069653L;
        ji.ktyw[294] = 2861861892235427014L;
        ji.ktyw[295] = -6926698789463114039L;
        ji.ktyw[296] = -6245305259001294620L;
        ji.ktyw[297] = -571629791997108980L;
        ji.ktyw[298] = 1432538642256317589L;
        ji.ktyw[299] = 6831747174658696685L;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    private static int rgb(int n2, int n3, int n4) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = tf - ji.ktxn("kxiw", ktyv(int ), (int)404)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ji.ktxn("kxix", ktxk(int ), (int)942)) break;
            object = ji.ktxn("kxiy", ktxk(int ), (int)943);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = tf - ji.ktxn("kxiz", ktyv(int ), (int)405)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ji.ktxn("kxja", ktxk(int ), (int)944)) break;
            object = ji.ktxn("kxjb", ktxk(int ), (int)945);
        }
        int n5 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = tf - ji.ktxn("kxjc", ktyv(int ), (int)406)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ji.ktxn("kxjd", ktxk(int ), (int)946)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ji.ktxn("kxje", ktxk(int ), (int)947);
        }
        if (bl2 || bl2) {
            return (int)ji.ktxn("kxjf", ktxk(int ), (int)948);
        }
        if (n5 == 0) return ji.ktxn("kxjg", ktxk(int ), (int)949) | n2 << ji.ktxn("kxjh", ktxk(int ), (int)950) | n3 << ji.ktxn("kxjj", ktxk(int ), (int)951) | n4;
        int n6 = Integer.MIN_VALUE;
        block9: do {
            switch (n6 == Integer.MIN_VALUE ? n5 : n6) {
                default: {
                    return ji.ktxn("kxjg", ktxk(int ), (int)949) | n2 << ji.ktxn("kxjh", ktxk(int ), (int)950) | n3 << ji.ktxn("kxjj", ktxk(int ), (int)951) | n4;
                }
                case 0: {
                    CallSite callSite = ji.ktxn("kxjk", ktxk(int ), (int)952);
                    n6 = 2;
                    if (!bl3) continue block9;
                    throw null;
                }
                case 1: {
                    CallSite callSite = ji.ktxn("kxjl", ktxk(int ), (int)953);
                    if (bl3) {
                        throw null;
                    }
                }
                case 2: {
                    CallSite callSite = ji.ktxn("kxjm", ktxk(int ), (int)954);
                    if (!bl3) break;
                    throw null;
                }
                case 3: 
            }
            break;
        } while (true);
        do {
            CallSite callSite = ji.ktxn("kxjn", ktxk(int ), (int)955);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void kxzj() {
        ji.ktyw[300] = -6831021400914319354L;
        ji.ktyw[301] = -8313516004086396260L;
        ji.ktyw[302] = 1531101855505800373L;
        ji.ktyw[303] = 2323535408147183472L;
        ji.ktyw[304] = 7201009502207044137L;
        ji.ktyw[305] = -8678726937959648105L;
        ji.ktyw[306] = 7028861134443212735L;
        ji.ktyw[307] = 6852380413293522049L;
        ji.ktyw[308] = 4895089103280337788L;
        ji.ktyw[309] = 8195065815825611531L;
        ji.ktyw[310] = -1134909879929003695L;
        ji.ktyw[311] = -7939263613083301848L;
        ji.ktyw[312] = -5662195328019335150L;
        ji.ktyw[313] = 8428402058749952191L;
        ji.ktyw[314] = 2684317768704865560L;
        ji.ktyw[315] = -8600568820708833160L;
        ji.ktyw[316] = -7329887963213582332L;
        ji.ktyw[317] = -6269335596773007252L;
        ji.ktyw[318] = -5578162202118017656L;
        ji.ktyw[319] = 2631117207149226367L;
        ji.ktyw[320] = 5887811634775812518L;
        ji.ktyw[321] = -660345607747429543L;
        ji.ktyw[322] = 4416533328776582086L;
        ji.ktyw[323] = 6035274805364718767L;
        ji.ktyw[324] = 228938912621805760L;
        ji.ktyw[325] = -2913861843207726153L;
        ji.ktyw[326] = -8630208805457991383L;
        ji.ktyw[327] = 5981810473535383083L;
        ji.ktyw[328] = -7785893572166261743L;
        ji.ktyw[329] = -7762675989794043143L;
        ji.ktyw[330] = -6883966896877009787L;
        ji.ktyw[331] = 2633422665789609217L;
        ji.ktyw[332] = 6139625797701055563L;
        ji.ktyw[333] = -355287437411289038L;
        ji.ktyw[334] = -260184229531245885L;
        ji.ktyw[335] = -4265776562470077284L;
        ji.ktyw[336] = 6927118161891248788L;
        ji.ktyw[337] = 2633792519857713596L;
        ji.ktyw[338] = -8292023147684269443L;
        ji.ktyw[339] = 6240659257046243693L;
        ji.ktyw[340] = 4658767933690543560L;
        ji.ktyw[341] = -7265397635954523680L;
        ji.ktyw[342] = -6360537918660388531L;
        ji.ktyw[343] = -1741308629344510342L;
        ji.ktyw[344] = 1190616648422523585L;
        ji.ktyw[345] = -4881961332791068932L;
        ji.ktyw[346] = 5813929004321919276L;
        ji.ktyw[347] = -2910928310199445301L;
        ji.ktyw[348] = 4994184672128028916L;
        ji.ktyw[349] = -4732670166832816466L;
        ji.ktyw[350] = -2076299492155051319L;
        ji.ktyw[351] = -3921637760950363626L;
        ji.ktyw[352] = -1083878478441554103L;
        ji.ktyw[353] = -4092979240454173290L;
        ji.ktyw[354] = 1560834596971683622L;
        ji.ktyw[355] = 2494793473557825756L;
        ji.ktyw[356] = -5114222125977722963L;
        ji.ktyw[357] = -6413473515144715270L;
        ji.ktyw[358] = 7045947369654840203L;
        ji.ktyw[359] = -7481320355419715830L;
        ji.ktyw[360] = 2210678578923307651L;
        ji.ktyw[361] = 281519657378519532L;
        ji.ktyw[362] = 5027779374222410832L;
        ji.ktyw[363] = 1827446998145901965L;
        ji.ktyw[364] = 1808049452554712431L;
        ji.ktyw[365] = -2351383928890409969L;
        ji.ktyw[366] = -5594075953607485346L;
        ji.ktyw[367] = -7336178208940877140L;
        ji.ktyw[368] = 8522114504761789915L;
        ji.ktyw[369] = -2999633910124826838L;
        ji.ktyw[370] = -6340771058159109316L;
        ji.ktyw[371] = -829722602810450607L;
        ji.ktyw[372] = 2777330109261998559L;
        ji.ktyw[373] = -2624849609867191594L;
        ji.ktyw[374] = 6309635776244712318L;
        ji.ktyw[375] = -9082430590045117497L;
        ji.ktyw[376] = -8522937778073208730L;
        ji.ktyw[377] = -6390731164020706586L;
        ji.ktyw[378] = 2173551788420230241L;
        ji.ktyw[379] = 3138384568027000650L;
        ji.ktyw[380] = 1159042534684944650L;
        ji.ktyw[381] = -7448532652282254822L;
        ji.ktyw[382] = 4780645272481809113L;
        ji.ktyw[383] = 253324305315673949L;
        ji.ktyw[384] = -3982184450770531683L;
        ji.ktyw[385] = -9047325701715924724L;
        ji.ktyw[386] = -309426697589262755L;
        ji.ktyw[387] = -4895419747097910589L;
        ji.ktyw[388] = -970494126090838626L;
        ji.ktyw[389] = -9077085889146338453L;
        ji.ktyw[390] = -6704639438227224834L;
        ji.ktyw[391] = -793870140940029041L;
        ji.ktyw[392] = 6187447617802692547L;
        ji.ktyw[393] = 8165640059052851964L;
        ji.ktyw[394] = 8831543134189904153L;
        ji.ktyw[395] = -2457651399059894191L;
        ji.ktyw[396] = -7972324479176148224L;
        ji.ktyw[397] = -6154022649648623321L;
        ji.ktyw[398] = -3972338471735241561L;
        ji.ktyw[399] = -6849160269798949467L;
    }

    private static /* synthetic */ void kxzn() {
        ji.ktyx[100] = -8232401107228465512L;
        ji.ktyx[101] = 6289433394387505723L;
        ji.ktyx[102] = -2900665222654675453L;
        ji.ktyx[103] = -3749082374865647454L;
        ji.ktyx[104] = 4749519925465071220L;
        ji.ktyx[105] = 701839622132996849L;
        ji.ktyx[106] = 5230739341466150377L;
        ji.ktyx[107] = -8943000830660496227L;
        ji.ktyx[108] = -7661751040658972135L;
        ji.ktyx[109] = 1508742249049528615L;
        ji.ktyx[110] = -5503816300231915138L;
        ji.ktyx[111] = 5608720385853396624L;
        ji.ktyx[112] = -7218078511074567485L;
        ji.ktyx[113] = 7267435841903630477L;
        ji.ktyx[114] = 3578248843432356542L;
        ji.ktyx[115] = -1750004966388764170L;
        ji.ktyx[116] = -3439368924332882031L;
        ji.ktyx[117] = 6826995554858354563L;
        ji.ktyx[118] = -1100093436511558315L;
        ji.ktyx[119] = 7086884668335132387L;
        ji.ktyx[120] = 979068326681568103L;
        ji.ktyx[121] = 3151208659998876022L;
        ji.ktyx[122] = -8167803439446081164L;
        ji.ktyx[123] = 3154423422450657519L;
        ji.ktyx[124] = -8385940970045804536L;
        ji.ktyx[125] = -4315760445070407206L;
        ji.ktyx[126] = 6711546421275300416L;
        ji.ktyx[127] = 1152650498285743884L;
        ji.ktyx[128] = 3433734209816130811L;
        ji.ktyx[129] = -7177523225488152808L;
        ji.ktyx[130] = -2083229950630223644L;
        ji.ktyx[131] = 8035973188180891320L;
        ji.ktyx[132] = -8559191657892942517L;
        ji.ktyx[133] = 9019856485049014212L;
        ji.ktyx[134] = -7042326768967959049L;
        ji.ktyx[135] = 6033604301021161662L;
        ji.ktyx[136] = 5670743553113925776L;
        ji.ktyx[137] = -8499977924314567990L;
        ji.ktyx[138] = -5223205758118392771L;
        ji.ktyx[139] = -2497044526402995203L;
        ji.ktyx[140] = -671407020800966771L;
        ji.ktyx[141] = 2677094428875764185L;
        ji.ktyx[142] = 7118360673671264410L;
        ji.ktyx[143] = 2485993644349241368L;
        ji.ktyx[144] = 7655357083991528299L;
        ji.ktyx[145] = 5090249309955413928L;
        ji.ktyx[146] = -5232341655802929276L;
        ji.ktyx[147] = 209216625179715293L;
        ji.ktyx[148] = -3441228498738121179L;
        ji.ktyx[149] = -352228550335970097L;
        ji.ktyx[150] = -6549215788098791544L;
        ji.ktyx[151] = -6975011486674307153L;
        ji.ktyx[152] = -5503998223901827369L;
        ji.ktyx[153] = 5717784633626942709L;
        ji.ktyx[154] = -2752179595822826738L;
        ji.ktyx[155] = 7323937076511111843L;
        ji.ktyx[156] = 8907422972412015459L;
        ji.ktyx[157] = 856291202497210837L;
        ji.ktyx[158] = 1805731260019795542L;
        ji.ktyx[159] = 3397623269238205084L;
        ji.ktyx[160] = -9125870889273570589L;
        ji.ktyx[161] = -8191892278902350403L;
        ji.ktyx[162] = 5146740678700202434L;
        ji.ktyx[163] = -1636606298963171380L;
        ji.ktyx[164] = 2787090766802047809L;
        ji.ktyx[165] = 6715411257907832658L;
        ji.ktyx[166] = -1958118514332010193L;
        ji.ktyx[167] = -331908507913474998L;
        ji.ktyx[168] = -511930698693670630L;
        ji.ktyx[169] = -7237436017265570122L;
        ji.ktyx[170] = 7252602513970433494L;
        ji.ktyx[171] = -7485708639960126264L;
        ji.ktyx[172] = 1080087627144726323L;
        ji.ktyx[173] = -1298954917466064383L;
        ji.ktyx[174] = 8422504534087740959L;
        ji.ktyx[175] = -3663701620361344918L;
        ji.ktyx[176] = 9086091547503964038L;
        ji.ktyx[177] = -4244311254731773472L;
        ji.ktyx[178] = -1485497657402106103L;
        ji.ktyx[179] = -5898543559933015022L;
        ji.ktyx[180] = -3308430353399176987L;
        ji.ktyx[181] = 8437626233316760431L;
        ji.ktyx[182] = -2861087876524633818L;
        ji.ktyx[183] = 5487059960077016758L;
        ji.ktyx[184] = -446951124691849509L;
        ji.ktyx[185] = -559995699301727061L;
        ji.ktyx[186] = 5587587280129329067L;
        ji.ktyx[187] = 7208315421100133409L;
        ji.ktyx[188] = 8045346999819683345L;
        ji.ktyx[189] = -8482110808269902974L;
        ji.ktyx[190] = -3047662290067529381L;
        ji.ktyx[191] = 563886567895529986L;
        ji.ktyx[192] = -896021483230961645L;
        ji.ktyx[193] = -7338421439813187262L;
        ji.ktyx[194] = -7271123720067858422L;
        ji.ktyx[195] = -2275994162080560701L;
        ji.ktyx[196] = -91609424674718466L;
        ji.ktyx[197] = -1482579159830565755L;
        ji.ktyx[198] = -1590878784322566924L;
        ji.ktyx[199] = -8270921767369286807L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void spawn(float var1_1, boolean var2_2) {
        block215: {
            block214: {
                block213: {
                    block212: {
                        var39_3 = ji.c;
                        var38_4 /* !! */  = ji.b;
                        var37_5 = ji.a;
                        if (var39_3) {
                            throw null;
lbl6:
                            // 56 sources

                            return;
                        }
                        if (var37_5 || var37_5) ** GOTO lbl6
                        var3_6 = this.count.getInt();
                        if (var37_5 || var37_5) ** GOTO lbl6
                        var4_7 = this.ambientParticleCount;
                        if (var37_5 || var37_5) ** GOTO lbl6
                        if (var4_7 < var3_6) break block212;
                        if (var37_5 || var37_5) ** GOTO lbl6
                        return;
                    }
                    if (var37_5 || var37_5) ** GOTO lbl6
                    if (!var2_2) break block213;
                    if (var37_5) ** GOTO lbl6
                    v0 = ji.ktxn("kupy", ktxr(int ), (int)327);
                    if (var39_3) {
                        throw null;
                    }
                    break block214;
                }
                if (var37_5 || var37_5) ** GOTO lbl6
                v0 = var5_8 = ji.ktxn("kupz", ktxr(int ), (int)328);
            }
            if (var37_5 || var37_5) ** GOTO lbl6
            this.spawnAccumulator += var1_1 * (float)var3_6 / var5_8;
            if (var37_5 || var37_5) ** GOTO lbl6
            var6_9 = Math.min(var3_6 - var4_7, (int)this.spawnAccumulator);
            if (var37_5 || var37_5) ** GOTO lbl6
            if (var4_7 != 0) break block215;
            if (var37_5 || var37_5) ** GOTO lbl6
            var6_9 = Math.min(var3_6, Math.max(var6_9, var3_6 / ji.ktxn("kuqa", ktxk(int ), (int)329)));
            if (var37_5) ** GOTO lbl6
        }
        if (var37_5 || var37_5) ** GOTO lbl6
        this.spawnAccumulator -= Math.min(this.spawnAccumulator, (float)var6_9);
        if (var37_5 || var37_5) ** GOTO lbl6
        var7_10 = ThreadLocalRandom.current();
        if (var37_5 || var37_5) ** GOTO lbl6
        var8_11 = ji.mc.field_1724.method_23317();
        if (var37_5 || var37_5) ** GOTO lbl6
        var10_12 = ji.mc.field_1724.method_23318();
        if (var37_5 || var37_5) ** GOTO lbl6
        var12_13 = ji.mc.field_1724.method_23321();
        if (var37_5 || var37_5) ** GOTO lbl6
        var14_14 = this.radius.getValue();
        if (var37_5 || var37_5) ** GOTO lbl6
        var15_15 = this.spawnPos;
        if (var37_5 || var37_5) ** GOTO lbl6
        var16_16 = ji.ktxn("kuqb", ktxk(int ), (int)330);
        if (var37_5) ** GOTO lbl6
        block112: while (true) {
            block219: {
                block217: {
                    block218: {
                        block216: {
                            if (var37_5 || var37_5) ** GOTO lbl6
                            if (var16_16 >= var6_9) ** GOTO lbl138
                            if (var37_5 || var37_5) ** GOTO lbl6
                            var17_17 = var7_10.nextDouble() * ji.ktxn("kuqc", kufx(int ), (int)146);
                            if (var37_5 || var37_5) ** GOTO lbl6
                            var19_18 = Math.sqrt(var7_10.nextDouble()) * (double)var14_14;
                            if (var37_5 || var37_5) ** GOTO lbl6
                            var21_19 = var8_11 + Math.cos(var17_17) * var19_18;
                            if (var37_5 || var37_5) ** GOTO lbl6
                            var23_20 = var12_13 + Math.sin(var17_17) * var19_18;
                            if (var37_5 || var37_5) ** GOTO lbl6
                            if (!var2_2) break block216;
                            if (var37_5 || var37_5) ** GOTO lbl6
                            var25_21 = var10_12 + ji.ktxn("kuqd", kufx(int ), (int)147) + var7_10.nextDouble() * ji.ktxn("kuqe", kufx(int ), (int)148);
                            if (var37_5 || var37_5) ** GOTO lbl6
                            if (var39_3) {
                                throw null;
                            }
                            break block217;
                        }
                        if (var37_5 || var37_5) ** GOTO lbl6
                        var27_22 = this.findGround(var21_19, var23_20, var10_12 + ji.ktxn("kuqf", kufx(int ), (int)149), var15_15);
                        if (var37_5 || var37_5) ** GOTO lbl6
                        if (!Double.isNaN(var27_22)) break block218;
                        if (var37_5 || var37_5) ** GOTO lbl6
                        if (var39_3) {
                            throw null;
                        }
                        ** GOTO lbl133
                    }
                    if (var37_5 || var37_5) ** GOTO lbl6
                    var25_21 = var27_22 + ji.ktxn("kuqg", kufx(int ), (int)150) + var7_10.nextDouble() * ji.ktxn("kuqh", kufx(int ), (int)151);
                    if (var37_5) ** GOTO lbl6
                }
                if (var37_5 || var37_5) ** GOTO lbl6
                if (this.isFree(var21_19, var25_21, var23_20, var15_15)) break block219;
                if (var37_5 || var37_5) ** GOTO lbl6
                if (var39_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            if (var37_5) ** GOTO lbl6
            if (var38_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var38_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var37_5) ** GOTO lbl6
                    var27_23 = this.size.getValue() * (ji.ktxn("kuqi", ktxr(int ), (int)331) + var7_10.nextFloat() * ji.ktxn("kuqj", ktxr(int ), (int)332));
                    if (var37_5 || var37_5) ** GOTO lbl6
                    var28_24 = var5_8 * (ji.ktxn("kuqk", ktxr(int ), (int)333) + var7_10.nextFloat() * ji.ktxn("kuql", ktxr(int ), (int)334));
                    if (var37_5 || var37_5) ** GOTO lbl6
                    var29_25 = (var7_10.nextDouble() - ji.ktxn("kuqm", kufx(int ), (int)152)) * ji.ktxn("kuqn", kufx(int ), (int)153);
                    if (var37_5 || var37_5) ** GOTO lbl6
                    var31_26 = (var7_10.nextDouble() - ji.ktxn("kuqo", kufx(int ), (int)154)) * ji.ktxn("kuqp", kufx(int ), (int)155);
                    if (var37_5 || var37_5) ** GOTO lbl6
                    if (!var2_2) ** GOTO lbl114
                    if (var37_5 || var37_5) ** GOTO lbl6
                    v1 = -(ji.ktxn("kuqq", kufx(int ), (int)156) + var7_10.nextDouble() * ji.ktxn("kuqr", kufx(int ), (int)157));
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl116
lbl114:
                    // 1 sources

                    if (var37_5 || var37_5) ** GOTO lbl6
                    v1 = var33_27 = ji.ktxn("kuqs", kufx(int ), (int)158) + var7_10.nextDouble() * ji.ktxn("kuqt", kufx(int ), (int)159);
lbl116:
                    // 2 sources

                    if (var37_5 || var37_5) ** GOTO lbl6
                    var35_28 = var7_10.nextFloat() * ji.ktxn("kuqu", ktxr(int ), (int)335);
                    if (var37_5 || var37_5) ** GOTO lbl6
                    var36_29 = this.particlePool.pollFirst();
                    if (var37_5 || var37_5) ** GOTO lbl6
                    if (var36_29 != null) ** GOTO lbl125
                    if (var37_5 || var37_5) ** GOTO lbl6
                    var36_29 = new ji$GlowParticle();
                    if (var37_5) ** GOTO lbl6
lbl125:
                    // 2 sources

                    if (var37_5 || var37_5) ** GOTO lbl6
                    var36_29.reset(var21_19, var25_21, var23_20, var29_25, (double)var33_27, var31_26, var27_23, var35_28, (float)var28_24, var2_2, ji$ParticleKind.AMBIENT);
                    if (var37_5 || var37_5) ** GOTO lbl6
                    this.particles.add(var36_29);
                    if (var37_5 || var37_5) ** GOTO lbl6
                    this.ambientParticleCount += ji.ktxn("kuqv", ktxk(int ), (int)336);
                    if (var37_5) ** GOTO lbl6
lbl133:
                    // 3 sources

                    if (var37_5 || var37_5) ** GOTO lbl6
                    ++var16_16;
                    if (var37_5) ** GOTO lbl6
                    if (!var39_3) continue block112;
                    throw null;
                }
lbl138:
                // 1 sources

                if (!var37_5 && !var37_5) ** break;
                ** continue;
                return;
lbl141:
                // 2 sources

                case 0: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuqw", ktxk(int ), (int)337);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl554
                }
lbl146:
                // 2 sources

                case 1: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuqx", ktxk(int ), (int)338);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl151:
                // 4 sources

                case 2: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuqy", ktxk(int ), (int)339);
                    if (var39_3) {
                        throw null;
                    }
                }
                case 3: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuqz", ktxk(int ), (int)340);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl487
                }
                case 4: {
                    var38_4 /* !! */  = (int)ji.ktxn("kura", ktxk(int ), (int)341);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl434
                }
                case 5: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurb", ktxk(int ), (int)342);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl281
                }
                case 6: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurc", ktxk(int ), (int)343);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl546
                }
lbl175:
                // 2 sources

                case 7: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurd", ktxk(int ), (int)344);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
lbl180:
                // 2 sources

                case 8: {
                    var38_4 /* !! */  = (int)ji.ktxn("kure", ktxk(int ), (int)345);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
lbl185:
                // 6 sources

                case 9: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurf", ktxk(int ), (int)346);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl587
                }
                case 10: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurg", ktxk(int ), (int)347);
                    if (!var39_3) ** GOTO lbl151
                    throw null;
                }
                case 11: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurh", ktxk(int ), (int)348);
                    if (!var39_3) ** GOTO lbl151
                    throw null;
                }
                case 12: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuri", ktxk(int ), (int)349);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl430
                }
lbl203:
                // 2 sources

                case 13: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurj", ktxk(int ), (int)350);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl604
                }
                case 14: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurk", ktxk(int ), (int)351);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl497
                }
                case 15: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurl", ktxk(int ), (int)352);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl322
                }
lbl218:
                // 3 sources

                case 16: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurm", ktxk(int ), (int)353);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl223:
                // 3 sources

                case 17: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurn", ktxk(int ), (int)354);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl457
                }
lbl228:
                // 2 sources

                case 18: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuro", ktxk(int ), (int)355);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl612
                }
lbl233:
                // 4 sources

                case 19: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurp", ktxk(int ), (int)356);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl466
                }
lbl238:
                // 2 sources

                case 20: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurq", ktxk(int ), (int)357);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl534
                }
                case 21: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurr", ktxk(int ), (int)358);
                    if (!var39_3) ** GOTO lbl218
                    throw null;
                }
lbl247:
                // 2 sources

                case 22: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurs", ktxk(int ), (int)359);
                    if (!var39_3) ** GOTO lbl218
                    throw null;
                }
lbl251:
                // 2 sources

                case 23: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurt", ktxk(int ), (int)360);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl616
                }
lbl256:
                // 5 sources

                case 24: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuru", ktxk(int ), (int)361);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl554
                }
lbl261:
                // 3 sources

                case 25: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurv", ktxk(int ), (int)362);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl448
                }
lbl266:
                // 2 sources

                case 26: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurw", ktxk(int ), (int)363);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl492
                }
lbl271:
                // 2 sources

                case 27: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurx", ktxk(int ), (int)364);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl529
                }
lbl276:
                // 2 sources

                case 28: {
                    var38_4 /* !! */  = (int)ji.ktxn("kury", ktxk(int ), (int)365);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl616
                }
lbl281:
                // 2 sources

                case 29: {
                    var38_4 /* !! */  = (int)ji.ktxn("kurz", ktxk(int ), (int)366);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl600
                }
lbl286:
                // 2 sources

                case 30: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusa", ktxk(int ), (int)367);
                    if (!var39_3) ** GOTO lbl238
                    throw null;
                }
                case 31: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusb", ktxk(int ), (int)368);
                    if (!var39_3) ** GOTO lbl266
                    throw null;
                }
lbl294:
                // 3 sources

                case 32: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusc", ktxk(int ), (int)369);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
                case 33: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusd", ktxk(int ), (int)370);
                    if (!var39_3) ** GOTO lbl261
                    throw null;
                }
                case 34: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuse", ktxk(int ), (int)371);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl466
                }
lbl308:
                // 2 sources

                case 35: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusf", ktxk(int ), (int)372);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl507
                }
                case 36: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusg", ktxk(int ), (int)373);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl558
                }
lbl318:
                // 2 sources

                case 37: {
                    var38_4 /* !! */  = (int)ji.ktxn("kush", ktxk(int ), (int)374);
                    if (!var39_3) ** GOTO lbl261
                    throw null;
                }
lbl322:
                // 3 sources

                case 38: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusi", ktxk(int ), (int)375);
                    if (!var39_3) ** GOTO lbl146
                    throw null;
                }
lbl326:
                // 3 sources

                case 39: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusj", ktxk(int ), (int)376);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl487
                }
lbl331:
                // 2 sources

                case 40: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusk", ktxk(int ), (int)377);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl373
                }
lbl336:
                // 3 sources

                case 41: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusl", ktxk(int ), (int)378);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl520
                }
lbl341:
                // 2 sources

                case 42: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusm", ktxk(int ), (int)379);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl558
                }
lbl346:
                // 2 sources

                case 43: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusn", ktxk(int ), (int)380);
                    if (!var39_3) ** GOTO lbl318
                    throw null;
                }
                case 44: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuso", ktxk(int ), (int)381);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl430
                }
                case 45: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusp", ktxk(int ), (int)382);
                    if (!var39_3) ** GOTO lbl326
                    throw null;
                }
lbl359:
                // 2 sources

                case 46: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusq", ktxk(int ), (int)383);
                    if (!var39_3) ** GOTO lbl151
                    throw null;
                }
                case 47: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusr", ktxk(int ), (int)384);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl453
                }
lbl368:
                // 2 sources

                case 48: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuss", ktxk(int ), (int)385);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl497
                }
lbl373:
                // 2 sources

                case 49: {
                    var38_4 /* !! */  = (int)ji.ktxn("kust", ktxk(int ), (int)386);
                    if (!var39_3) ** GOTO lbl322
                    throw null;
                }
                case 50: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusu", ktxk(int ), (int)387);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl608
                }
                case 51: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusv", ktxk(int ), (int)388);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl550
                }
lbl387:
                // 2 sources

                case 52: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusw", ktxk(int ), (int)389);
                    if (!var39_3) ** GOTO lbl346
                    throw null;
                }
                case 53: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusx", ktxk(int ), (int)390);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl600
                }
lbl396:
                // 2 sources

                case 54: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusy", ktxk(int ), (int)391);
                    if (!var39_3) ** GOTO lbl223
                    throw null;
                }
lbl400:
                // 2 sources

                case 55: {
                    var38_4 /* !! */  = (int)ji.ktxn("kusz", ktxk(int ), (int)392);
                    if (!var39_3) ** GOTO lbl387
                    throw null;
                }
                case 56: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuta", ktxk(int ), (int)393);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl511
                }
                case 57: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutb", ktxk(int ), (int)394);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl430
                }
lbl414:
                // 2 sources

                case 58: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutc", ktxk(int ), (int)395);
                    if (!var39_3) ** GOTO lbl294
                    throw null;
                }
                case 59: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutd", ktxk(int ), (int)396);
                    if (!var39_3) ** GOTO lbl251
                    throw null;
                }
                case 60: {
                    var38_4 /* !! */  = (int)ji.ktxn("kute", ktxk(int ), (int)397);
                    if (!var39_3) ** GOTO lbl326
                    throw null;
                }
                case 61: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutf", ktxk(int ), (int)398);
                    if (!var39_3) ** GOTO lbl233
                    throw null;
                }
lbl430:
                // 4 sources

                case 62: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutg", ktxk(int ), (int)399);
                    if (!var39_3) ** GOTO lbl175
                    throw null;
                }
lbl434:
                // 2 sources

                case 63: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuth", ktxk(int ), (int)400);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl466
                }
                case 64: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuti", ktxk(int ), (int)401);
                    if (!var39_3) ** GOTO lbl396
                    throw null;
                }
                case 65: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutl", ktxk(int ), (int)402);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl538
                }
lbl448:
                // 2 sources

                case 66: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutp", ktxk(int ), (int)403);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl583
                }
lbl453:
                // 2 sources

                case 67: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutu", ktxk(int ), (int)404);
                    if (!var39_3) ** GOTO lbl294
                    throw null;
                }
lbl457:
                // 2 sources

                case 68: {
                    var38_4 /* !! */  = (int)ji.ktxn("kutx", ktxk(int ), (int)405);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl511
                }
                case 69: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuua", ktxk(int ), (int)406);
                    if (!var39_3) ** GOTO lbl185
                    throw null;
                }
lbl466:
                // 4 sources

                case 70: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuud", ktxk(int ), (int)407);
                    if (!var39_3) ** GOTO lbl141
                    throw null;
                }
lbl470:
                // 2 sources

                case 71: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuug", ktxk(int ), (int)408);
                    if (!var39_3) ** GOTO lbl336
                    throw null;
                }
                case 72: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuuk", ktxk(int ), (int)409);
                    if (!var39_3) ** GOTO lbl228
                    throw null;
                }
                case 73: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuuo", ktxk(int ), (int)410);
                    if (!var39_3) ** GOTO lbl368
                    throw null;
                }
                case 74: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuur", ktxk(int ), (int)411);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl578
                }
lbl487:
                // 4 sources

                case 75: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuuu", ktxk(int ), (int)412);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl596
                }
lbl492:
                // 3 sources

                case 76: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuuy", ktxk(int ), (int)413);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl612
                }
lbl497:
                // 3 sources

                case 77: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvb", ktxk(int ), (int)414);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl570
                }
                case 78: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuve", ktxk(int ), (int)415);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl515
                }
lbl507:
                // 2 sources

                case 79: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvh", ktxk(int ), (int)416);
                    if (!var39_3) ** GOTO lbl331
                    throw null;
                }
lbl511:
                // 3 sources

                case 80: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvi", ktxk(int ), (int)417);
                    if (!var39_3) ** GOTO lbl308
                    throw null;
                }
lbl515:
                // 2 sources

                case 81: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvl", ktxk(int ), (int)418);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl525
                }
lbl520:
                // 3 sources

                case 82: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvp", ktxk(int ), (int)419);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl604
                }
lbl525:
                // 2 sources

                case 83: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvt", ktxk(int ), (int)420);
                    if (!var39_3) ** GOTO lbl185
                    throw null;
                }
lbl529:
                // 2 sources

                case 84: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvv", ktxk(int ), (int)421);
                    if (var39_3) {
                        throw null;
                    }
                    ** GOTO lbl587
                }
lbl534:
                // 2 sources

                case 85: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuvz", ktxk(int ), (int)422);
                    if (!var39_3) ** GOTO lbl185
                    throw null;
                }
lbl538:
                // 2 sources

                case 86: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwc", ktxk(int ), (int)423);
                    if (!var39_3) ** GOTO lbl271
                    throw null;
                }
                case 87: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwf", ktxk(int ), (int)424);
                    if (!var39_3) ** GOTO lbl233
                    throw null;
                }
lbl546:
                // 2 sources

                case 88: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwj", ktxk(int ), (int)425);
                    if (!var39_3) ** GOTO lbl185
                    throw null;
                }
lbl550:
                // 3 sources

                case 89: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwl", ktxk(int ), (int)426);
                    if (!var39_3) ** GOTO lbl470
                    throw null;
                }
lbl554:
                // 3 sources

                case 90: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwn", ktxk(int ), (int)427);
                    if (!var39_3) ** GOTO lbl550
                    throw null;
                }
lbl558:
                // 3 sources

                case 91: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwr", ktxk(int ), (int)428);
                    if (!var39_3) ** GOTO lbl223
                    throw null;
                }
                case 92: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwv", ktxk(int ), (int)429);
                    if (!var39_3) ** GOTO lbl180
                    throw null;
                }
                case 93: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuwy", ktxk(int ), (int)430);
                    if (!var39_3) ** GOTO lbl492
                    throw null;
                }
lbl570:
                // 2 sources

                case 94: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuxc", ktxk(int ), (int)431);
                    if (!var39_3) ** GOTO lbl276
                    throw null;
                }
                case 95: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuxf", ktxk(int ), (int)432);
                    if (!var39_3) ** GOTO lbl336
                    throw null;
                }
lbl578:
                // 2 sources

                case 96: {
                    do {
                        var38_4 /* !! */  = (int)ji.ktxn("kuxk", ktxk(int ), (int)433);
                    } while (!var39_3);
                    throw null;
                }
lbl583:
                // 2 sources

                case 97: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuxo", ktxk(int ), (int)434);
                    if (!var39_3) break block112;
                    throw null;
                }
lbl587:
                // 3 sources

                case 98: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuxp", ktxk(int ), (int)435);
                    if (!var39_3) ** GOTO lbl487
                    throw null;
                }
                case 99: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var38_4 /* !! */  = (int)ji.ktxn("kuxq", ktxk(int ), (int)436);
                        if (!var39_3) ** GOTO lbl185
                        throw null;
                    }
                }
lbl596:
                // 2 sources

                case 100: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuxv", ktxk(int ), (int)437);
                    if (!var39_3) ** GOTO lbl256
                    throw null;
                }
lbl600:
                // 3 sources

                case 101: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuxz", ktxk(int ), (int)438);
                    if (!var39_3) ** GOTO lbl520
                    throw null;
                }
lbl604:
                // 3 sources

                case 102: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuyd", ktxk(int ), (int)439);
                    if (!var39_3) ** GOTO lbl233
                    throw null;
                }
lbl608:
                // 2 sources

                case 103: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuyf", ktxk(int ), (int)440);
                    if (!var39_3) ** GOTO lbl286
                    throw null;
                }
lbl612:
                // 3 sources

                case 104: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuyk", ktxk(int ), (int)441);
                    if (!var39_3) ** GOTO lbl341
                    throw null;
                }
lbl616:
                // 3 sources

                case 105: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuyo", ktxk(int ), (int)442);
                    if (!var39_3) ** GOTO lbl256
                    throw null;
                }
                case 106: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuys", ktxk(int ), (int)443);
                    if (!var39_3) ** GOTO lbl359
                    throw null;
                }
                case 107: {
                    var38_4 /* !! */  = (int)ji.ktxn("kuyw", ktxk(int ), (int)444);
                    if (!var39_3) ** GOTO lbl203
                    throw null;
                }
                case 108: 
            }
            break;
        }
        var38_4 /* !! */  = (int)ji.ktxn("kuyy", ktxk(int ), (int)445);
        ** while (!var39_3)
lbl631:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyz() {
        ji.ktxm[500] = 587291437;
        ji.ktxm[501] = -1684692475;
        ji.ktxm[502] = 311076273;
        ji.ktxm[503] = -1491999696;
        ji.ktxm[504] = 681763272;
        ji.ktxm[505] = -1211674219;
        ji.ktxm[506] = -932344231;
        ji.ktxm[507] = -186894738;
        ji.ktxm[508] = -2144531001;
        ji.ktxm[509] = -1271538107;
        ji.ktxm[510] = 771230330;
        ji.ktxm[511] = 342032006;
        ji.ktxm[512] = -796120859;
        ji.ktxm[513] = 1622281327;
        ji.ktxm[514] = 231192731;
        ji.ktxm[515] = -1199143946;
        ji.ktxm[516] = 669598316;
        ji.ktxm[517] = -452153886;
        ji.ktxm[518] = 960930107;
        ji.ktxm[519] = 628910099;
        ji.ktxm[520] = -1775580026;
        ji.ktxm[521] = 636040355;
        ji.ktxm[522] = 1338095161;
        ji.ktxm[523] = 974446117;
        ji.ktxm[524] = -2142079138;
        ji.ktxm[525] = -2098140017;
        ji.ktxm[526] = 582025570;
        ji.ktxm[527] = -1289747963;
        ji.ktxm[528] = -225957164;
        ji.ktxm[529] = -625890199;
        ji.ktxm[530] = 282551965;
        ji.ktxm[531] = -1077465398;
        ji.ktxm[532] = 614948593;
        ji.ktxm[533] = -799784153;
        ji.ktxm[534] = 1770446295;
        ji.ktxm[535] = 2129419357;
        ji.ktxm[536] = -979926153;
        ji.ktxm[537] = 378661183;
        ji.ktxm[538] = 1946118789;
        ji.ktxm[539] = -2025597657;
        ji.ktxm[540] = -1586621043;
        ji.ktxm[541] = -153563267;
        ji.ktxm[542] = 1438802921;
        ji.ktxm[543] = 1650922251;
        ji.ktxm[544] = 1139403681;
        ji.ktxm[545] = 520353686;
        ji.ktxm[546] = -487095700;
        ji.ktxm[547] = -135204569;
        ji.ktxm[548] = 1555700191;
        ji.ktxm[549] = 2072724712;
        ji.ktxm[550] = -1512013198;
        ji.ktxm[551] = -448489742;
        ji.ktxm[552] = 516843474;
        ji.ktxm[553] = 1235764983;
        ji.ktxm[554] = -1789010120;
        ji.ktxm[555] = -836062181;
        ji.ktxm[556] = 2056113372;
        ji.ktxm[557] = -622627446;
        ji.ktxm[558] = 381736791;
        ji.ktxm[559] = -1872318172;
        ji.ktxm[560] = -1874993435;
        ji.ktxm[561] = -1568976406;
        ji.ktxm[562] = 688000557;
        ji.ktxm[563] = -163586958;
        ji.ktxm[564] = 1321591982;
        ji.ktxm[565] = 1637954984;
        ji.ktxm[566] = 424514290;
        ji.ktxm[567] = 1772924151;
        ji.ktxm[568] = -785065370;
        ji.ktxm[569] = -1943554049;
        ji.ktxm[570] = 1424503861;
        ji.ktxm[571] = 445448991;
        ji.ktxm[572] = 1515615448;
        ji.ktxm[573] = 1086955353;
        ji.ktxm[574] = -1551073724;
        ji.ktxm[575] = -439624347;
        ji.ktxm[576] = 121825484;
        ji.ktxm[577] = 95788769;
        ji.ktxm[578] = 397241146;
        ji.ktxm[579] = 1201136136;
        ji.ktxm[580] = -954645331;
        ji.ktxm[581] = -1969235625;
        ji.ktxm[582] = -555380933;
        ji.ktxm[583] = -1020375042;
        ji.ktxm[584] = -1714208661;
        ji.ktxm[585] = 333987106;
        ji.ktxm[586] = -1837742850;
        ji.ktxm[587] = -324039895;
        ji.ktxm[588] = 229353378;
        ji.ktxm[589] = -205386325;
        ji.ktxm[590] = -1007772021;
        ji.ktxm[591] = 892581832;
        ji.ktxm[592] = -1904295429;
        ji.ktxm[593] = -398840344;
        ji.ktxm[594] = -984998331;
        ji.ktxm[595] = -1043785425;
        ji.ktxm[596] = -551658030;
        ji.ktxm[597] = 174925754;
        ji.ktxm[598] = 1745445145;
        ji.ktxm[599] = 162304511;
    }

    private static /* synthetic */ void kxza() {
        ji.ktxm[600] = 1938883707;
        ji.ktxm[601] = 921409837;
        ji.ktxm[602] = -1556303198;
        ji.ktxm[603] = -1257508218;
        ji.ktxm[604] = -1130070812;
        ji.ktxm[605] = -2035216440;
        ji.ktxm[606] = 994833933;
        ji.ktxm[607] = -1245834743;
        ji.ktxm[608] = -214396710;
        ji.ktxm[609] = -1450448640;
        ji.ktxm[610] = 548120380;
        ji.ktxm[611] = 836062300;
        ji.ktxm[612] = 1142397178;
        ji.ktxm[613] = 1736889613;
        ji.ktxm[614] = -965521673;
        ji.ktxm[615] = -1598272343;
        ji.ktxm[616] = 345706235;
        ji.ktxm[617] = -1467107434;
        ji.ktxm[618] = 2065070905;
        ji.ktxm[619] = -407648493;
        ji.ktxm[620] = -1274702960;
        ji.ktxm[621] = -213096618;
        ji.ktxm[622] = -798370174;
        ji.ktxm[623] = -1754804638;
        ji.ktxm[624] = -1861394090;
        ji.ktxm[625] = -1657737697;
        ji.ktxm[626] = -1334348738;
        ji.ktxm[627] = 273919813;
        ji.ktxm[628] = -1710407257;
        ji.ktxm[629] = -1725631664;
        ji.ktxm[630] = -1508101792;
        ji.ktxm[631] = 787131493;
        ji.ktxm[632] = 1519046257;
        ji.ktxm[633] = 1393089542;
        ji.ktxm[634] = 804320479;
        ji.ktxm[635] = 1895099025;
        ji.ktxm[636] = -706216785;
        ji.ktxm[637] = -2082771765;
        ji.ktxm[638] = 613851615;
        ji.ktxm[639] = 1453449752;
        ji.ktxm[640] = -1082206922;
        ji.ktxm[641] = 859836762;
        ji.ktxm[642] = 1538880941;
        ji.ktxm[643] = -98153033;
        ji.ktxm[644] = -808257956;
        ji.ktxm[645] = -1306213220;
        ji.ktxm[646] = 1673174492;
        ji.ktxm[647] = -1384241316;
        ji.ktxm[648] = 43111350;
        ji.ktxm[649] = -1851259108;
        ji.ktxm[650] = -1817490134;
        ji.ktxm[651] = 1143186229;
        ji.ktxm[652] = -1625988524;
        ji.ktxm[653] = 1204162917;
        ji.ktxm[654] = 1510356064;
        ji.ktxm[655] = -1475419217;
        ji.ktxm[656] = 510759176;
        ji.ktxm[657] = -617035548;
        ji.ktxm[658] = 612499379;
        ji.ktxm[659] = -1086537700;
        ji.ktxm[660] = -1791066392;
        ji.ktxm[661] = 2112955578;
        ji.ktxm[662] = 29867264;
        ji.ktxm[663] = 1693018019;
        ji.ktxm[664] = 1357321518;
        ji.ktxm[665] = -1140749358;
        ji.ktxm[666] = 1043522137;
        ji.ktxm[667] = 652066679;
        ji.ktxm[668] = -466822304;
        ji.ktxm[669] = 159875126;
        ji.ktxm[670] = -1985169217;
        ji.ktxm[671] = -361238452;
        ji.ktxm[672] = 433220016;
        ji.ktxm[673] = 1681140638;
        ji.ktxm[674] = 1569533745;
        ji.ktxm[675] = 1252710149;
        ji.ktxm[676] = 1762141153;
        ji.ktxm[677] = -1598862794;
        ji.ktxm[678] = 2011631474;
        ji.ktxm[679] = 229002265;
        ji.ktxm[680] = 59389652;
        ji.ktxm[681] = -1251727973;
        ji.ktxm[682] = -556139256;
        ji.ktxm[683] = 1989304436;
        ji.ktxm[684] = 2066549111;
        ji.ktxm[685] = -115810981;
        ji.ktxm[686] = -1822850941;
        ji.ktxm[687] = -975788455;
        ji.ktxm[688] = -682154497;
        ji.ktxm[689] = -1875949452;
        ji.ktxm[690] = -1043078246;
        ji.ktxm[691] = 814852060;
        ji.ktxm[692] = 1316707771;
        ji.ktxm[693] = -2131080011;
        ji.ktxm[694] = 329223026;
        ji.ktxm[695] = 1144079414;
        ji.ktxm[696] = 53099094;
        ji.ktxm[697] = 1117925557;
        ji.ktxm[698] = 856626571;
        ji.ktxm[699] = -1893215016;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void recycle(ji$GlowParticle var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxvv", ktyv(int ), (int)521)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ji.ktxn("kxvw", ktxk(int ), (int)1144)) break;
            v0 /* !! */  = (long)ji.ktxn("kxvx", ktxk(int ), (int)1145);
        }
        var4_2 = ji.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxvy", ktyv(int ), (int)522)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ji.ktxn("kxvz", ktxk(int ), (int)1146)) break;
            v1 /* !! */  = (long)ji.ktxn("kxwa", ktxk(int ), (int)1147);
        }
        var3_3 /* !! */  = ji.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxwb", ktyv(int ), (int)523)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ji.ktxn("kxwc", ktxk(int ), (int)1148)) break;
            v2 /* !! */  = (long)ji.ktxn("kxwd", ktxk(int ), (int)1149);
        }
        var2_4 = ji.a;
        if (!var4_2) ** GOTO lbl25
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl25:
                // 1 sources

                if (var2_4 || var2_4) continue block31;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kxwe", ktyv(int ), (int)524)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ji.ktxn("kxwf", ktxk(int ), (int)1150)) break;
                    v3 /* !! */  = (long)ji.ktxn("kxwg", ktxk(int ), (int)1151);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kxwh", ktyv(int ), (int)525)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ji.ktxn("kxwi", ktxk(int ), (int)1152)) break;
                    v4 /* !! */  = (long)ji.ktxn("kxwj", ktxk(int ), (int)1153);
                }
                v5 = this.particlePool.size();
                v6 /* !! */  = ji.tf;
                if (true) ** GOTO lbl41
                block34: while (true) {
                    v6 /* !! */  = (long)(v7 - ji.ktxn("kxwk", ktyv(int ), (int)526));
lbl41:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1973104232: {
                            v7 = ji.ktxn("kxwl", ktyv(int ), (int)527);
                            continue block34;
                        }
                        case -1325542806: {
                            v7 = ji.ktxn("kxwm", ktyv(int ), (int)528);
                            continue block34;
                        }
                        case 733325436: {
                            break block34;
                        }
                    }
                    break;
                }
                v8 /* !! */  = ji.tf;
                if (true) ** GOTO lbl54
                block35: while (true) {
                    v8 /* !! */  = (long)(v9 - ji.ktxn("kxwn", ktyv(int ), (int)529));
lbl54:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -207271260: {
                            v9 = ji.ktxn("kxwo", ktyv(int ), (int)530);
                            continue block35;
                        }
                        case 733325436: {
                            break block35;
                        }
                        case 1350676290: {
                            v9 = ji.ktxn("kxwp", ktyv(int ), (int)531);
                            continue block35;
                        }
                        case 2025774831: {
                            v9 = ji.ktxn("kxwq", ktyv(int ), (int)532);
                            continue block35;
                        }
                    }
                    break;
                }
                v10 = this.count.getInt();
                v11 = ji.ktxn("kxwr", ktxk(int ), (int)1154);
                v12 /* !! */  = ji.tf;
                if (true) ** GOTO lbl72
                block36: while (true) {
                    v12 /* !! */  = (long)(v13 - ji.ktxn("kxws", ktyv(int ), (int)533));
lbl72:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1111883560: {
                            v13 = ji.ktxn("kxwt", ktyv(int ), (int)534);
                            continue block36;
                        }
                        case 52361859: {
                            v13 = ji.ktxn("kxwu", ktyv(int ), (int)535);
                            continue block36;
                        }
                        case 733325436: {
                            break block36;
                        }
                        case 1605896468: {
                            v13 = ji.ktxn("kxwv", ktyv(int ), (int)536);
                            continue block36;
                        }
                    }
                    break;
                }
                if (v5 < Math.max(v10, (int)v11)) {
                    if (var2_4 || var2_4) continue block31;
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kxww", ktyv(int ), (int)537)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == ji.ktxn("kxwx", ktxk(int ), (int)1155)) break;
                        v14 /* !! */  = (long)ji.ktxn("kxwy", ktxk(int ), (int)1156);
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kxwz", ktyv(int ), (int)538)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == ji.ktxn("kxxa", ktxk(int ), (int)1157)) break;
                        v15 /* !! */  = (long)ji.ktxn("kxxb", ktxk(int ), (int)1158);
                    }
                    this.particlePool.addFirst(var1_1);
                    if (var2_4) continue block31;
                }
                if (!var2_4 && !var2_4) ** break;
                continue block31;
                return;
lbl101:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxc", ktxk(int ), (int)1159);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl105:
                // 4 sources

                case 1: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxd", ktxk(int ), (int)1160);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
lbl110:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxe", ktxk(int ), (int)1161);
                    if (!var4_2) ** GOTO lbl105
                    throw null;
                }
lbl114:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxf", ktxk(int ), (int)1162);
                    if (!var4_2) ** GOTO lbl101
                    throw null;
                }
lbl118:
                // 2 sources

                case 4: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxg", ktxk(int ), (int)1163);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 5: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxh", ktxk(int ), (int)1164);
                    if (!var4_2) ** GOTO lbl110
                    throw null;
                }
lbl126:
                // 2 sources

                case 6: {
                    var3_3 /* !! */  = (int)ji.ktxn("kxxi", ktxk(int ), (int)1165);
                    if (!var4_2) ** GOTO lbl114
                    throw null;
                }
                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)ji.ktxn("kxxj", ktxk(int ), (int)1166);
                        if (!var4_2) ** GOTO lbl126
                        throw null;
                    }
                }
                case 8: 
            }
        }
        var3_3 /* !! */  = (int)ji.ktxn("kxxk", ktxk(int ), (int)1167);
        ** while (!var4_2)
lbl138:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isFree(double var1_1, double var3_2, double var5_3, class_2338.class_2339 var7_4) {
        var15_5 = ji.c;
        var14_6 /* !! */  = ji.b;
        var13_7 = ji.a;
        if (var15_5) {
            throw null;
lbl6:
            // 23 sources

            return (boolean)ji.ktxn("kxoi", ktxk(int ), (int)1014);
        }
        if (var13_7 || var13_7) ** GOTO lbl6
        var7_4.method_10102(var1_1, var3_2, var5_3);
        if (var13_7 || var13_7) ** GOTO lbl6
        if (!this.collisionCacheActive) ** GOTO lbl58
        if (var13_7) ** GOTO lbl6
        if (var14_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_7) ** GOTO lbl6
                var8_8 = var7_4.method_10063();
                if (var13_7 || var13_7) ** GOTO lbl6
                var10_10 = this.collisionCache.get(var8_8);
                if (var13_7 || var13_7) ** GOTO lbl6
                if (var10_10 == 0) ** GOTO lbl33
                if (var13_7) ** GOTO lbl6
                if (var10_10 != ji.ktxn("kxoj", ktxk(int ), (int)1015)) ** GOTO lbl30
                if (var13_7) ** GOTO lbl6
                v0 = ji.ktxn("kxok", ktxk(int ), (int)1016);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl32
lbl30:
                // 1 sources

                if (var13_7 || var13_7) ** GOTO lbl6
                v0 = ji.ktxn("kxol", ktxk(int ), (int)1017);
lbl32:
                // 2 sources

                return (boolean)v0;
lbl33:
                // 1 sources

                if (var13_7 || var13_7) ** GOTO lbl6
                var11_11 = ji.mc.field_1687.method_8320((class_2338)var7_4);
                if (var13_7 || var13_7) ** GOTO lbl6
                if (var11_11.method_26215()) ** GOTO lbl40
                if (var13_7) ** GOTO lbl6
                if (!var11_11.method_26220((class_1922)ji.mc.field_1687, (class_2338)var7_4).method_1110()) ** GOTO lbl45
                if (var13_7) ** GOTO lbl6
lbl40:
                // 2 sources

                if (var13_7 || var13_7) ** GOTO lbl6
                v1 = ji.ktxn("kxom", ktxk(int ), (int)1018);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl47
lbl45:
                // 1 sources

                if (var13_7 || var13_7) ** GOTO lbl6
                v1 = var12_12 = ji.ktxn("kxon", ktxk(int ), (int)1019);
lbl47:
                // 2 sources

                if (var13_7 || var13_7) ** GOTO lbl6
                if (var12_12 != false) {
                    v2 = ji.ktxn("kxoo", ktxk(int ), (int)1020);
                    if (var15_5) {
                        throw null;
                    }
                } else {
                    v2 = ji.ktxn("kxop", ktxk(int ), (int)1021);
                }
                this.collisionCache.put(var8_8, (byte)v2);
                if (var13_7 || var13_7) ** GOTO lbl6
                return (boolean)var12_12;
            }
lbl58:
            // 1 sources

            if (var13_7 || var13_7) ** GOTO lbl6
            var8_9 = ji.mc.field_1687.method_8320((class_2338)var7_4);
            if (var13_7 || var13_7) ** GOTO lbl6
            if (var8_9.method_26215()) ** GOTO lbl65
            if (var13_7) ** GOTO lbl6
            if (!var8_9.method_26220((class_1922)ji.mc.field_1687, (class_2338)var7_4).method_1110()) ** GOTO lbl70
            if (var13_7) ** GOTO lbl6
lbl65:
            // 2 sources

            if (var13_7 || var13_7) ** GOTO lbl6
            v3 = ji.ktxn("kxoq", ktxk(int ), (int)1022);
            if (var15_5) {
                throw null;
            }
            ** GOTO lbl73
lbl70:
            // 1 sources

            if (!var13_7 && !var13_7) ** break;
            ** continue;
            v3 = ji.ktxn("kxor", ktxk(int ), (int)1023);
lbl73:
            // 2 sources

            return (boolean)v3;
            case 0: {
                var14_6 /* !! */  = (int)ji.ktxn("kxos", ktxk(int ), (int)1024);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl79:
            // 2 sources

            case 1: {
                var14_6 /* !! */  = (int)ji.ktxn("kxot", ktxk(int ), (int)1025);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 2: {
                var14_6 /* !! */  = (int)ji.ktxn("kxou", ktxk(int ), (int)1026);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 3: {
                var14_6 /* !! */  = (int)ji.ktxn("kxov", ktxk(int ), (int)1027);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl94:
            // 3 sources

            case 4: {
                var14_6 /* !! */  = (int)ji.ktxn("kxow", ktxk(int ), (int)1028);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 5: {
                var14_6 /* !! */  = (int)ji.ktxn("kxox", ktxk(int ), (int)1029);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl104:
            // 4 sources

            case 6: {
                var14_6 /* !! */  = (int)ji.ktxn("kxoy", ktxk(int ), (int)1030);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl109:
            // 2 sources

            case 7: {
                var14_6 /* !! */  = (int)ji.ktxn("kxoz", ktxk(int ), (int)1031);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl114:
            // 2 sources

            case 8: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpa", ktxk(int ), (int)1032);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl119:
            // 4 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_6 /* !! */  = (int)ji.ktxn("kxpb", ktxk(int ), (int)1033);
                    if (var15_5) {
                        throw null;
                    }
                    ** GOTO lbl188
                    break;
                }
            }
lbl125:
            // 3 sources

            case 10: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpc", ktxk(int ), (int)1034);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl130:
            // 3 sources

            case 11: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpd", ktxk(int ), (int)1035);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl135:
            // 2 sources

            case 12: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpe", ktxk(int ), (int)1036);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 13: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpf", ktxk(int ), (int)1037);
                if (!var15_5) ** GOTO lbl119
                throw null;
            }
            case 14: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpg", ktxk(int ), (int)1038);
                if (!var15_5) ** GOTO lbl79
                throw null;
            }
            case 15: {
                var14_6 /* !! */  = (int)ji.ktxn("kxph", ktxk(int ), (int)1039);
                if (!var15_5) ** GOTO lbl94
                throw null;
            }
lbl152:
            // 2 sources

            case 16: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpi", ktxk(int ), (int)1040);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl157:
            // 2 sources

            case 17: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpj", ktxk(int ), (int)1041);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 18: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpk", ktxk(int ), (int)1042);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl167:
            // 2 sources

            case 19: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpl", ktxk(int ), (int)1043);
                if (!var15_5) ** GOTO lbl119
                throw null;
            }
lbl171:
            // 2 sources

            case 20: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpm", ktxk(int ), (int)1044);
                if (var15_5) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 21: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpn", ktxk(int ), (int)1045);
                if (!var15_5) ** GOTO lbl152
                throw null;
            }
            case 22: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpo", ktxk(int ), (int)1046);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl184:
            // 2 sources

            case 23: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpp", ktxk(int ), (int)1047);
                if (!var15_5) break;
                throw null;
            }
lbl188:
            // 2 sources

            case 24: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpq", ktxk(int ), (int)1048);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl193:
            // 4 sources

            case 25: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpr", ktxk(int ), (int)1049);
                if (!var15_5) ** GOTO lbl167
                throw null;
            }
lbl197:
            // 2 sources

            case 26: {
                var14_6 /* !! */  = (int)ji.ktxn("kxps", ktxk(int ), (int)1050);
                if (!var15_5) ** GOTO lbl125
                throw null;
            }
            case 27: {
                do {
                    var14_6 /* !! */  = (int)ji.ktxn("kxpt", ktxk(int ), (int)1051);
                } while (!var15_5);
                throw null;
            }
lbl206:
            // 2 sources

            case 28: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpu", ktxk(int ), (int)1052);
                if (!var15_5) ** GOTO lbl125
                throw null;
            }
lbl210:
            // 2 sources

            case 29: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpv", ktxk(int ), (int)1053);
                if (!var15_5) ** GOTO lbl130
                throw null;
            }
lbl214:
            // 2 sources

            case 30: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpw", ktxk(int ), (int)1054);
                if (!var15_5) ** GOTO lbl114
                throw null;
            }
            case 31: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpx", ktxk(int ), (int)1055);
                if (!var15_5) ** GOTO lbl130
                throw null;
            }
            case 32: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpy", ktxk(int ), (int)1056);
                if (!var15_5) ** GOTO lbl197
                throw null;
            }
lbl226:
            // 2 sources

            case 33: {
                var14_6 /* !! */  = (int)ji.ktxn("kxpz", ktxk(int ), (int)1057);
                if (!var15_5) ** GOTO lbl214
                throw null;
            }
lbl230:
            // 2 sources

            case 34: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqa", ktxk(int ), (int)1058);
                if (!var15_5) ** GOTO lbl94
                throw null;
            }
lbl234:
            // 3 sources

            case 35: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqb", ktxk(int ), (int)1059);
                if (!var15_5) ** GOTO lbl193
                throw null;
            }
            case 36: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqc", ktxk(int ), (int)1060);
                if (!var15_5) ** GOTO lbl206
                throw null;
            }
            case 37: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqd", ktxk(int ), (int)1061);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 38: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqe", ktxk(int ), (int)1062);
                if (!var15_5) ** GOTO lbl109
                throw null;
            }
lbl251:
            // 4 sources

            case 39: {
                do {
                    var14_6 /* !! */  = (int)ji.ktxn("kxqf", ktxk(int ), (int)1063);
                } while (!var15_5);
                throw null;
            }
            case 40: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqg", ktxk(int ), (int)1064);
                if (!var15_5) ** GOTO lbl104
                throw null;
            }
lbl260:
            // 2 sources

            case 41: {
                var14_6 /* !! */  = (int)ji.ktxn("kxqh", ktxk(int ), (int)1065);
                if (!var15_5) ** GOTO lbl251
                throw null;
            }
            case 42: 
        }
        var14_6 /* !! */  = (int)ji.ktxn("kxqi", ktxk(int ), (int)1066);
        ** while (!var15_5)
lbl267:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyq() {
        ji.ktxl[800] = 1315375530;
        ji.ktxl[801] = 225518156;
        ji.ktxl[802] = -492681639;
        ji.ktxl[803] = -61865177;
        ji.ktxl[804] = 1074223155;
        ji.ktxl[805] = -2028921610;
        ji.ktxl[806] = 1992559496;
        ji.ktxl[807] = 492742001;
        ji.ktxl[808] = 1609493754;
        ji.ktxl[809] = 349403391;
        ji.ktxl[810] = 713118496;
        ji.ktxl[811] = 1574833038;
        ji.ktxl[812] = 1511531683;
        ji.ktxl[813] = -675882227;
        ji.ktxl[814] = 1653248046;
        ji.ktxl[815] = 304926952;
        ji.ktxl[816] = 560445287;
        ji.ktxl[817] = 1988223116;
        ji.ktxl[818] = 634805609;
        ji.ktxl[819] = -1574832712;
        ji.ktxl[820] = 660204743;
        ji.ktxl[821] = -942388584;
        ji.ktxl[822] = 1765695526;
        ji.ktxl[823] = -1992135361;
        ji.ktxl[824] = 1306500657;
        ji.ktxl[825] = 2131992591;
        ji.ktxl[826] = 783382740;
        ji.ktxl[827] = -844951125;
        ji.ktxl[828] = -835483737;
        ji.ktxl[829] = -1171555635;
        ji.ktxl[830] = -379496740;
        ji.ktxl[831] = 709646042;
        ji.ktxl[832] = 351579696;
        ji.ktxl[833] = 954790949;
        ji.ktxl[834] = -972038080;
        ji.ktxl[835] = -1854517842;
        ji.ktxl[836] = -983901050;
        ji.ktxl[837] = -2026117958;
        ji.ktxl[838] = 436406447;
        ji.ktxl[839] = -2125935268;
        ji.ktxl[840] = -282689604;
        ji.ktxl[841] = -1591743851;
        ji.ktxl[842] = -1972633866;
        ji.ktxl[843] = -2076912522;
        ji.ktxl[844] = -985833700;
        ji.ktxl[845] = -325423950;
        ji.ktxl[846] = -747055949;
        ji.ktxl[847] = 163150198;
        ji.ktxl[848] = 1375337626;
        ji.ktxl[849] = -1554379706;
        ji.ktxl[850] = 806749861;
        ji.ktxl[851] = 246938191;
        ji.ktxl[852] = 1246468995;
        ji.ktxl[853] = 1834432474;
        ji.ktxl[854] = -1546156972;
        ji.ktxl[855] = 580895556;
        ji.ktxl[856] = 102839268;
        ji.ktxl[857] = 2006767826;
        ji.ktxl[858] = 366419298;
        ji.ktxl[859] = -1577812545;
        ji.ktxl[860] = 460969290;
        ji.ktxl[861] = 1767590486;
        ji.ktxl[862] = -1345291179;
        ji.ktxl[863] = 1010662111;
        ji.ktxl[864] = 907624051;
        ji.ktxl[865] = 1557598109;
        ji.ktxl[866] = 513871557;
        ji.ktxl[867] = 1552880462;
        ji.ktxl[868] = -1601720530;
        ji.ktxl[869] = 1156054354;
        ji.ktxl[870] = -1831568069;
        ji.ktxl[871] = -170669465;
        ji.ktxl[872] = -403688814;
        ji.ktxl[873] = -1311454448;
        ji.ktxl[874] = 256678706;
        ji.ktxl[875] = -1073461366;
        ji.ktxl[876] = -203363173;
        ji.ktxl[877] = -1940803182;
        ji.ktxl[878] = 379056220;
        ji.ktxl[879] = 330262242;
        ji.ktxl[880] = 2009330819;
        ji.ktxl[881] = 1217153036;
        ji.ktxl[882] = 1075124605;
        ji.ktxl[883] = -572757789;
        ji.ktxl[884] = 1884754829;
        ji.ktxl[885] = -285517343;
        ji.ktxl[886] = 2073771270;
        ji.ktxl[887] = -400283411;
        ji.ktxl[888] = -1258818722;
        ji.ktxl[889] = 1213709702;
        ji.ktxl[890] = -429839207;
        ji.ktxl[891] = 2063588381;
        ji.ktxl[892] = -1480797638;
        ji.ktxl[893] = -1831669688;
        ji.ktxl[894] = 285493816;
        ji.ktxl[895] = 926652027;
        ji.ktxl[896] = -1449881431;
        ji.ktxl[897] = 394490655;
        ji.ktxl[898] = -1853706490;
        ji.ktxl[899] = 1570096856;
    }

    private static /* synthetic */ void kxys() {
        ji.ktxl[1000] = -706037643;
        ji.ktxl[1001] = -1484980385;
        ji.ktxl[1002] = 688062507;
        ji.ktxl[1003] = 68597521;
        ji.ktxl[1004] = 289565224;
        ji.ktxl[1005] = 927797233;
        ji.ktxl[1006] = -368229964;
        ji.ktxl[1007] = -2070174541;
        ji.ktxl[1008] = 541922018;
        ji.ktxl[1009] = 711428428;
        ji.ktxl[1010] = 743285902;
        ji.ktxl[1011] = 316421554;
        ji.ktxl[1012] = -318247247;
        ji.ktxl[1013] = 203696152;
        ji.ktxl[1014] = -919785274;
        ji.ktxl[1015] = 933509287;
        ji.ktxl[1016] = -114673621;
        ji.ktxl[1017] = 772032803;
        ji.ktxl[1018] = -264338592;
        ji.ktxl[1019] = 1827034759;
        ji.ktxl[1020] = 1773484444;
        ji.ktxl[1021] = -69670274;
        ji.ktxl[1022] = 1336521908;
        ji.ktxl[1023] = 71488465;
        ji.ktxl[1024] = -198956015;
        ji.ktxl[1025] = 187840514;
        ji.ktxl[1026] = -1392182986;
        ji.ktxl[1027] = 717704735;
        ji.ktxl[1028] = -1827896686;
        ji.ktxl[1029] = 1643032582;
        ji.ktxl[1030] = 1199843394;
        ji.ktxl[1031] = 2089550845;
        ji.ktxl[1032] = -1939790458;
        ji.ktxl[1033] = -570158796;
        ji.ktxl[1034] = 727666026;
        ji.ktxl[1035] = -1292503190;
        ji.ktxl[1036] = 1705992930;
        ji.ktxl[1037] = -208958970;
        ji.ktxl[1038] = 2041489282;
        ji.ktxl[1039] = 218531376;
        ji.ktxl[1040] = 181704124;
        ji.ktxl[1041] = -1195517294;
        ji.ktxl[1042] = 855423759;
        ji.ktxl[1043] = 1184252370;
        ji.ktxl[1044] = -2045261177;
        ji.ktxl[1045] = -1188864783;
        ji.ktxl[1046] = 599087352;
        ji.ktxl[1047] = 48375248;
        ji.ktxl[1048] = -1786584065;
        ji.ktxl[1049] = -989386415;
        ji.ktxl[1050] = 581091710;
        ji.ktxl[1051] = -2052098092;
        ji.ktxl[1052] = 1292567465;
        ji.ktxl[1053] = -679753132;
        ji.ktxl[1054] = 0x41184481;
        ji.ktxl[1055] = 364636875;
        ji.ktxl[1056] = -137348410;
        ji.ktxl[1057] = -550292772;
        ji.ktxl[1058] = -595852162;
        ji.ktxl[1059] = -529213841;
        ji.ktxl[1060] = -122107844;
        ji.ktxl[1061] = 1280502791;
        ji.ktxl[1062] = -1747468837;
        ji.ktxl[1063] = 994678800;
        ji.ktxl[1064] = 1949066316;
        ji.ktxl[1065] = -1970753689;
        ji.ktxl[1066] = 741522634;
        ji.ktxl[1067] = 1110629969;
        ji.ktxl[1068] = 668557903;
        ji.ktxl[1069] = -969139674;
        ji.ktxl[1070] = -161901118;
        ji.ktxl[1071] = 490440209;
        ji.ktxl[1072] = 1901418769;
        ji.ktxl[1073] = -1175958472;
        ji.ktxl[1074] = -952768102;
        ji.ktxl[1075] = 699345383;
        ji.ktxl[1076] = 663141970;
        ji.ktxl[1077] = 937579614;
        ji.ktxl[1078] = 206129339;
        ji.ktxl[1079] = -1677073014;
        ji.ktxl[1080] = 1625381014;
        ji.ktxl[1081] = 2143963609;
        ji.ktxl[1082] = 453155260;
        ji.ktxl[1083] = 709530012;
        ji.ktxl[1084] = -2019514361;
        ji.ktxl[1085] = -290331231;
        ji.ktxl[1086] = 1410780041;
        ji.ktxl[1087] = -626817762;
        ji.ktxl[1088] = 343877588;
        ji.ktxl[1089] = -557342818;
        ji.ktxl[1090] = -1851323111;
        ji.ktxl[1091] = -997375086;
        ji.ktxl[1092] = -1379729793;
        ji.ktxl[1093] = 1599022694;
        ji.ktxl[1094] = -1586553113;
        ji.ktxl[1095] = 2050813319;
        ji.ktxl[1096] = 264600427;
        ji.ktxl[1097] = 1094196768;
        ji.ktxl[1098] = -121558928;
        ji.ktxl[1099] = 1576897200;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isCriticalHit() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kwho", ktyv(int ), (int)286)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ji.ktxn("kwhq", ktxk(int ), (int)734)) break;
            v0 /* !! */  = (long)ji.ktxn("kwhs", ktxk(int ), (int)735);
        }
        var3_1 = ji.c;
        v1 /* !! */  = ji.tf;
        if (true) ** GOTO lbl11
        block101: while (true) {
            v1 /* !! */  = (long)(v2 - ji.ktxn("kwht", ktyv(int ), (int)287));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1824034884: {
                    v2 = ji.ktxn("kwhu", ktyv(int ), (int)288);
                    continue block101;
                }
                case -810123729: {
                    v2 = ji.ktxn("kwhv", ktyv(int ), (int)289);
                    continue block101;
                }
                case 82748: {
                    v2 = ji.ktxn("kwhw", ktyv(int ), (int)290);
                    continue block101;
                }
                case 733325436: {
                    break block101;
                }
            }
            break;
        }
        var2_2 /* !! */  = ji.b;
        v3 /* !! */  = ji.tf;
        if (true) ** GOTO lbl28
        block102: while (true) {
            v3 /* !! */  = (long)(ji.ktxn("kwia", ktyv(int ), (int)292) - ji.ktxn("kwhy", ktyv(int ), (int)291));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 733325436: {
                    break block102;
                }
                case 1170501869: {
                    continue block102;
                }
            }
            break;
        }
        var1_3 = ji.a;
        if (var3_1) {
            throw null;
lbl36:
            // 11 sources

            return (boolean)ji.ktxn("kwid", ktxk(int ), (int)736);
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v4 /* !! */  = ji.tf;
        if (true) ** GOTO lbl43
        block104: while (true) {
            v4 /* !! */  = (long)(ji.ktxn("kwih", ktyv(int ), (int)294) - ji.ktxn("kwig", ktyv(int ), (int)293));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1440467276: {
                    continue block104;
                }
                case 733325436: {
                    break block104;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kwij", ktyv(int ), (int)295)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ji.ktxn("kwim", ktxk(int ), (int)737)) break;
            v5 /* !! */  = (long)ji.ktxn("kwio", ktxk(int ), (int)738);
        }
        if (ji.mc.field_1724 == null) ** GOTO lbl321
        if (var1_3) ** GOTO lbl36
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kwip", ktyv(int ), (int)296)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ji.ktxn("kwir", ktxk(int ), (int)739)) break;
            v6 /* !! */  = (long)ji.ktxn("kwit", ktxk(int ), (int)740);
        }
        v7 /* !! */  = ji.tf;
        if (true) ** GOTO lbl64
        block107: while (true) {
            v7 /* !! */  = (long)(ji.ktxn("kwix", ktyv(int ), (int)298) - ji.ktxn("kwiv", ktyv(int ), (int)297));
lbl64:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 733325436: {
                    break block107;
                }
                case 1154174456: {
                    continue block107;
                }
            }
            break;
        }
        v8 = ji.mc.field_1724;
        v9 = ji.ktxn("kwiy", ktxr(int ), (int)741);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kwjb", ktyv(int ), (int)299)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ji.ktxn("kwjc", ktxk(int ), (int)742)) break;
            v10 /* !! */  = (long)ji.ktxn("kwjd", ktxk(int ), (int)743);
        }
        if (!(v8.method_7261((float)v9) > ji.ktxn("kwjf", ktxr(int ), (int)744))) ** GOTO lbl321
        if (var1_3) ** GOTO lbl36
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kwjh", ktyv(int ), (int)300)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ji.ktxn("kwjj", ktxk(int ), (int)745)) break;
            v11 /* !! */  = (long)ji.ktxn("kwjk", ktxk(int ), (int)746);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kwjl", ktyv(int ), (int)301)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ji.ktxn("kwjm", ktxk(int ), (int)747)) break;
            v12 /* !! */  = (long)ji.ktxn("kwjo", ktxk(int ), (int)748);
        }
        v13 = ji.mc.field_1724;
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kwjq", ktyv(int ), (int)302)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ji.ktxn("kwjs", ktxk(int ), (int)749)) break;
            v14 /* !! */  = (long)ji.ktxn("kwjt", ktxk(int ), (int)750);
        }
        if (!(v13.field_6017 > 0.0)) ** GOTO lbl321
        if (var1_3) ** GOTO lbl36
        v15 /* !! */  = ji.tf;
        if (true) ** GOTO lbl100
        block112: while (true) {
            v15 /* !! */  = (long)(ji.ktxn("kwjx", ktyv(int ), (int)304) - ji.ktxn("kwjv", ktyv(int ), (int)303));
lbl100:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case 89611310: {
                    continue block112;
                }
                case 733325436: {
                    break block112;
                }
            }
            break;
        }
        v16 /* !! */  = ji.tf;
        if (true) ** GOTO lbl109
        block113: while (true) {
            v16 /* !! */  = (long)(v17 - ji.ktxn("kwka", ktyv(int ), (int)305));
lbl109:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case 604522274: {
                    v17 = ji.ktxn("kwkc", ktyv(int ), (int)306);
                    continue block113;
                }
                case 622175039: {
                    v17 = ji.ktxn("kwke", ktyv(int ), (int)307);
                    continue block113;
                }
                case 733325436: {
                    break block113;
                }
                case 1458160643: {
                    v17 = ji.ktxn("kwkg", ktyv(int ), (int)308);
                    continue block113;
                }
            }
            break;
        }
        v18 = ji.mc.field_1724;
        v19 /* !! */  = ji.tf;
        if (true) ** GOTO lbl126
        block114: while (true) {
            v19 /* !! */  = (long)(v20 - ji.ktxn("kwki", ktyv(int ), (int)309));
lbl126:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1657714189: {
                    v20 = ji.ktxn("kwkk", ktyv(int ), (int)310);
                    continue block114;
                }
                case -395037294: {
                    v20 = ji.ktxn("kwkl", ktyv(int ), (int)311);
                    continue block114;
                }
                case 733325436: {
                    break block114;
                }
            }
            break;
        }
        if (v18.method_24828()) ** GOTO lbl321
        if (var1_3) ** GOTO lbl36
        v21 /* !! */  = ji.tf;
        if (true) ** GOTO lbl141
        block115: while (true) {
            v21 /* !! */  = (long)(ji.ktxn("kwkr", ktyv(int ), (int)313) - ji.ktxn("kwko", ktyv(int ), (int)312));
lbl141:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1005304365: {
                    continue block115;
                }
                case 733325436: {
                    break block115;
                }
            }
            break;
        }
        v22 /* !! */  = ji.tf;
        if (true) ** GOTO lbl150
        block116: while (true) {
            v22 /* !! */  = (long)(v23 - ji.ktxn("kwkt", ktyv(int ), (int)314));
lbl150:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -1639237379: {
                    v23 = ji.ktxn("kwkv", ktyv(int ), (int)315);
                    continue block116;
                }
                case -590315138: {
                    v23 = ji.ktxn("kwkx", ktyv(int ), (int)316);
                    continue block116;
                }
                case 733325436: {
                    break block116;
                }
                case 985921104: {
                    v23 = ji.ktxn("kwky", ktyv(int ), (int)317);
                    continue block116;
                }
            }
            break;
        }
        v24 = ji.mc.field_1724;
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_7 = ji.tf - ji.ktxn("kwkz", ktyv(int ), (int)318)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == ji.ktxn("kwla", ktxk(int ), (int)751)) break;
            v25 /* !! */  = (long)ji.ktxn("kwlb", ktxk(int ), (int)752);
        }
        if (v24.method_6101()) ** GOTO lbl321
        if (var1_3) ** GOTO lbl36
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_8 = ji.tf - ji.ktxn("kwld", ktyv(int ), (int)319)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == ji.ktxn("kwlf", ktxk(int ), (int)753)) break;
            v26 /* !! */  = (long)ji.ktxn("kwlh", ktxk(int ), (int)754);
        }
        v27 /* !! */  = ji.tf;
        if (true) ** GOTO lbl179
        block119: while (true) {
            v27 /* !! */  = (long)(v28 - ji.ktxn("kwlj", ktyv(int ), (int)320));
lbl179:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case 733325436: {
                    break block119;
                }
                case 878318807: {
                    v28 = ji.ktxn("kwln", ktyv(int ), (int)321);
                    continue block119;
                }
                case 1946721279: {
                    v28 = ji.ktxn("kwlp", ktyv(int ), (int)322);
                    continue block119;
                }
            }
            break;
        }
        v29 = ji.mc.field_1724;
        v30 /* !! */  = ji.tf;
        if (true) ** GOTO lbl193
        block120: while (true) {
            v30 /* !! */  = (long)(ji.ktxn("kwlu", ktyv(int ), (int)324) - ji.ktxn("kwls", ktyv(int ), (int)323));
lbl193:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case 349014899: {
                    continue block120;
                }
                case 733325436: {
                    break block120;
                }
            }
            break;
        }
        if (v29.method_5799()) ** GOTO lbl321
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_9 = ji.tf - ji.ktxn("kwlz", ktyv(int ), (int)325)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == ji.ktxn("kwma", ktxk(int ), (int)755)) break;
                    v31 /* !! */  = (long)ji.ktxn("kwmc", ktxk(int ), (int)756);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_10 = ji.tf - ji.ktxn("kwmf", ktyv(int ), (int)326)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == ji.ktxn("kwmh", ktxk(int ), (int)757)) break;
                    v32 /* !! */  = (long)ji.ktxn("kwmj", ktxk(int ), (int)758);
                }
                v33 = ji.mc.field_1724;
                v34 /* !! */  = ji.tf;
                if (true) ** GOTO lbl218
                block123: while (true) {
                    v34 /* !! */  = (long)(v35 - ji.ktxn("kwml", ktyv(int ), (int)327));
lbl218:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case 116580182: {
                            v35 = ji.ktxn("kwmn", ktyv(int ), (int)328);
                            continue block123;
                        }
                        case 733325436: {
                            break block123;
                        }
                        case 874763247: {
                            v35 = ji.ktxn("kwmp", ktyv(int ), (int)329);
                            continue block123;
                        }
                        case 899760459: {
                            v35 = ji.ktxn("kwmr", ktyv(int ), (int)330);
                            continue block123;
                        }
                    }
                    break;
                }
                v36 /* !! */  = ji.tf;
                if (true) ** GOTO lbl234
                block124: while (true) {
                    v36 /* !! */  = (long)(v37 - ji.ktxn("kwmu", ktyv(int ), (int)331));
lbl234:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -495126095: {
                            v37 = ji.ktxn("kwmw", ktyv(int ), (int)332);
                            continue block124;
                        }
                        case 158884025: {
                            v37 = ji.ktxn("kwmy", ktyv(int ), (int)333);
                            continue block124;
                        }
                        case 733325436: {
                            break block124;
                        }
                        case 1381518025: {
                            v37 = ji.ktxn("kwna", ktyv(int ), (int)334);
                            continue block124;
                        }
                    }
                    break;
                }
                if (v33.method_6059(class_1294.field_5919)) ** GOTO lbl321
                if (var1_3) ** GOTO lbl36
                v38 /* !! */  = ji.tf;
                if (true) ** GOTO lbl252
                block125: while (true) {
                    v38 /* !! */  = (long)(v39 - ji.ktxn("kwnc", ktyv(int ), (int)335));
lbl252:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -2011596323: {
                            v39 = ji.ktxn("kwnf", ktyv(int ), (int)336);
                            continue block125;
                        }
                        case -1939408949: {
                            v39 = ji.ktxn("kwnh", ktyv(int ), (int)337);
                            continue block125;
                        }
                        case -1844457061: {
                            v39 = ji.ktxn("kwnj", ktyv(int ), (int)338);
                            continue block125;
                        }
                        case 733325436: {
                            break block125;
                        }
                    }
                    break;
                }
                v40 /* !! */  = ji.tf;
                if (true) ** GOTO lbl268
                block126: while (true) {
                    v40 /* !! */  = (long)(v41 - ji.ktxn("kwnl", ktyv(int ), (int)339));
lbl268:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -1277235616: {
                            v41 = ji.ktxn("kwno", ktyv(int ), (int)340);
                            continue block126;
                        }
                        case 731742577: {
                            v41 = ji.ktxn("kwnp", ktyv(int ), (int)341);
                            continue block126;
                        }
                        case 733325436: {
                            break block126;
                        }
                        case 1142557251: {
                            v41 = ji.ktxn("kwnr", ktyv(int ), (int)342);
                            continue block126;
                        }
                    }
                    break;
                }
                v42 = ji.mc.field_1724;
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_11 = ji.tf - ji.ktxn("kwnu", ktyv(int ), (int)343)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ji.ktxn("kwnw", ktxk(int ), (int)759)) break;
                    v43 /* !! */  = (long)ji.ktxn("kwny", ktxk(int ), (int)760);
                }
                if (v42.method_5624()) ** GOTO lbl321
                if (var1_3) ** GOTO lbl36
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_12 = ji.tf - ji.ktxn("kwoa", ktyv(int ), (int)344)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == ji.ktxn("kwob", ktxk(int ), (int)761)) break;
                    v44 /* !! */  = (long)ji.ktxn("kwoc", ktxk(int ), (int)762);
                }
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_13 = ji.tf - ji.ktxn("kwod", ktyv(int ), (int)345)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == ji.ktxn("kwoe", ktxk(int ), (int)763)) break;
                    v45 /* !! */  = (long)ji.ktxn("kwoh", ktxk(int ), (int)764);
                }
                v46 = ji.mc.field_1724;
                v47 /* !! */  = ji.tf;
                if (true) ** GOTO lbl303
                block130: while (true) {
                    v47 /* !! */  = (long)(v48 - ji.ktxn("kwok", ktyv(int ), (int)346));
lbl303:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -2029482306: {
                            v48 = ji.ktxn("kwon", ktyv(int ), (int)347);
                            continue block130;
                        }
                        case 607453385: {
                            v48 = ji.ktxn("kwop", ktyv(int ), (int)348);
                            continue block130;
                        }
                        case 733325436: {
                            break block130;
                        }
                        case 1425182103: {
                            v48 = ji.ktxn("kwos", ktyv(int ), (int)349);
                            continue block130;
                        }
                    }
                    break;
                }
                if (v46.method_5765()) ** GOTO lbl321
                if (var1_3) ** GOTO lbl36
                v49 = ji.ktxn("kwov", ktxk(int ), (int)765);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl324
lbl321:
                // 9 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v49 = ji.ktxn("kwoy", ktxk(int ), (int)766);
lbl324:
                // 2 sources

                return (boolean)v49;
            }
lbl325:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ji.ktxn("kwpb", ktxk(int ), (int)767);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl330:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ji.ktxn("kwps", ktxk(int ), (int)768);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl335:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ji.ktxn("kwpt", ktxk(int ), (int)769);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 3: {
                var2_2 /* !! */  = (int)ji.ktxn("kwpu", ktxk(int ), (int)770);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 4: {
                var2_2 /* !! */  = (int)ji.ktxn("kwpw", ktxk(int ), (int)771);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl350:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ji.ktxn("kwpz", ktxk(int ), (int)772);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl382
            }
lbl355:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqc", ktxk(int ), (int)773);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl360:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqf", ktxk(int ), (int)774);
                if (!var3_1) ** GOTO lbl350
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqi", ktxk(int ), (int)775);
                if (!var3_1) ** GOTO lbl360
                throw null;
            }
lbl368:
            // 3 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ji.ktxn("kwqk", ktxk(int ), (int)776);
                    if (!var3_1) ** GOTO lbl325
                    throw null;
                }
            }
            case 10: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqo", ktxk(int ), (int)777);
                if (!var3_1) ** GOTO lbl368
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqr", ktxk(int ), (int)778);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl382:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqt", ktxk(int ), (int)779);
                if (!var3_1) ** GOTO lbl330
                throw null;
            }
lbl386:
            // 4 sources

            case 13: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kwqw", ktxk(int ), (int)780);
                } while (!var3_1);
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ji.ktxn("kwqz", ktxk(int ), (int)781);
                if (!var3_1) ** GOTO lbl335
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ji.ktxn("kwrc", ktxk(int ), (int)782);
        ** while (!var3_1)
lbl398:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block149: {
            block148: {
                v0 /* !! */  = ji.tf;
                if (true) ** GOTO lbl5
                block96: while (true) {
                    v0 /* !! */  = (long)(v1 - ji.ktxn("kudw", ktyv(int ), (int)32));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 733325436: {
                            break block96;
                        }
                        case 1520144020: {
                            v1 = ji.ktxn("kudx", ktyv(int ), (int)33);
                            continue block96;
                        }
                        case 1587917050: {
                            v1 = ji.ktxn("kudy", ktyv(int ), (int)34);
                            continue block96;
                        }
                    }
                    break;
                }
                var7_2 = ji.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kudz", ktyv(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ji.ktxn("kuea", ktxk(int ), (int)128)) break;
                    v2 /* !! */  = (long)ji.ktxn("kueb", ktxk(int ), (int)129);
                }
                var6_3 /* !! */  = ji.b;
                v3 /* !! */  = ji.tf;
                if (true) ** GOTO lbl26
                block98: while (true) {
                    v3 /* !! */  = (long)(v4 - ji.ktxn("kuec", ktyv(int ), (int)36));
lbl26:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1376729517: {
                            v4 = ji.ktxn("kued", ktyv(int ), (int)37);
                            continue block98;
                        }
                        case -666955776: {
                            v4 = ji.ktxn("kuee", ktyv(int ), (int)38);
                            continue block98;
                        }
                        case 727918395: {
                            v4 = ji.ktxn("kuef", ktyv(int ), (int)39);
                            continue block98;
                        }
                        case 733325436: {
                            break block98;
                        }
                    }
                    break;
                }
                var5_4 = ji.a;
                if (var7_2) {
                    throw null;
lbl41:
                    // 18 sources

                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl41
                v5 /* !! */  = ji.tf;
                if (true) ** GOTO lbl48
                block100: while (true) {
                    v5 /* !! */  = (long)(v6 - ji.ktxn("kueg", ktyv(int ), (int)40));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1938956260: {
                            v6 = ji.ktxn("kueh", ktyv(int ), (int)41);
                            continue block100;
                        }
                        case 733325436: {
                            break block100;
                        }
                        case 2036358942: {
                            v6 = ji.ktxn("kuei", ktyv(int ), (int)42);
                            continue block100;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ji.tf;
                if (true) ** GOTO lbl61
                block101: while (true) {
                    v7 /* !! */  = (long)(v8 - ji.ktxn("kuej", ktyv(int ), (int)43));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 563066642: {
                            v8 = ji.ktxn("kuek", ktyv(int ), (int)44);
                            continue block101;
                        }
                        case 733325436: {
                            break block101;
                        }
                        case 840841174: {
                            v8 = ji.ktxn("kuel", ktyv(int ), (int)45);
                            continue block101;
                        }
                        case 1802763959: {
                            v8 = ji.ktxn("kuem", ktyv(int ), (int)46);
                            continue block101;
                        }
                    }
                    break;
                }
                if (!this.reasons.isSelected("\u0411\u0440\u043e\u0441\u043e\u043a \u043f\u0435\u0440\u043b\u0430")) break block148;
                if (var5_4) ** GOTO lbl41
                v9 /* !! */  = ji.tf;
                if (true) ** GOTO lbl79
                block102: while (true) {
                    v9 /* !! */  = (long)(v10 - ji.ktxn("kuen", ktyv(int ), (int)47));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 0x474D474: {
                            v10 = ji.ktxn("kueo", ktyv(int ), (int)48);
                            continue block102;
                        }
                        case 251440182: {
                            v10 = ji.ktxn("kuep", ktyv(int ), (int)49);
                            continue block102;
                        }
                        case 733325436: {
                            break block102;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kueq", ktyv(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ji.ktxn("kuer", ktxk(int ), (int)130)) break;
                    v11 /* !! */  = (long)ji.ktxn("kues", ktxk(int ), (int)131);
                }
                if (ji.mc.field_1724 == null) break block148;
                if (var5_4) ** GOTO lbl41
                v12 /* !! */  = ji.tf;
                if (true) ** GOTO lbl100
                block104: while (true) {
                    v12 /* !! */  = (long)(ji.ktxn("kueu", ktyv(int ), (int)52) - ji.ktxn("kuet", ktyv(int ), (int)51));
lbl100:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 733325436: {
                            break block104;
                        }
                        case 892415742: {
                            continue block104;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kuev", ktyv(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == ji.ktxn("kuew", ktxk(int ), (int)132)) break;
                    v13 /* !! */  = (long)ji.ktxn("kuex", ktxk(int ), (int)133);
                }
                if (ji.mc.field_1687 != null) break block149;
                if (var5_4) ** GOTO lbl41
            }
            if (var5_4 || var5_4) ** GOTO lbl41
            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl41
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kuey", ktyv(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v14 /* !! */  == ji.ktxn("kuez", ktxk(int ), (int)134)) break;
            v14 /* !! */  = (long)ji.ktxn("kufa", ktxk(int ), (int)135);
        }
        v15 /* !! */  = ji.tf;
        if (true) ** GOTO lbl128
        block107: while (true) {
            v15 /* !! */  = (long)(v16 - ji.ktxn("kufb", ktyv(int ), (int)55));
lbl128:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -20037048: {
                    v16 = ji.ktxn("kufc", ktyv(int ), (int)56);
                    continue block107;
                }
                case 375004454: {
                    v16 = ji.ktxn("kufd", ktyv(int ), (int)57);
                    continue block107;
                }
                case 733325436: {
                    break block107;
                }
            }
            break;
        }
        v17 = ji.mc.field_1687;
        v18 /* !! */  = ji.tf;
        if (true) ** GOTO lbl142
        block108: while (true) {
            v18 /* !! */  = (long)(ji.ktxn("kuff", ktyv(int ), (int)59) - ji.ktxn("kufe", ktyv(int ), (int)58));
lbl142:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -191375196: {
                    continue block108;
                }
                case 733325436: {
                    break block108;
                }
            }
            break;
        }
        v19 = v17.method_18112();
        v20 /* !! */  = ji.tf;
        if (true) ** GOTO lbl152
        block109: while (true) {
            v20 /* !! */  = (long)(ji.ktxn("kufh", ktyv(int ), (int)61) - ji.ktxn("kufg", ktyv(int ), (int)60));
lbl152:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -488616805: {
                    continue block109;
                }
                case 733325436: {
                    break block109;
                }
            }
            break;
        }
        var2_5 = v19.iterator();
        if (var5_4) ** GOTO lbl41
        block110: while (true) {
            if (var5_4 || var5_4) ** GOTO lbl41
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kufi", ktyv(int ), (int)62)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v21 /* !! */  == ji.ktxn("kufj", ktxk(int ), (int)136)) break;
                v21 /* !! */  = (long)ji.ktxn("kufk", ktxk(int ), (int)137);
            }
            if (!var2_5.hasNext()) ** GOTO lbl249
            if (var5_4) ** GOTO lbl41
            v22 /* !! */  = ji.tf;
            if (true) ** GOTO lbl173
            block112: while (true) {
                v22 /* !! */  = (long)(v23 - ji.ktxn("kufl", ktyv(int ), (int)63));
lbl173:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1961916387: {
                        v23 = ji.ktxn("kufm", ktyv(int ), (int)64);
                        continue block112;
                    }
                    case -979194474: {
                        v23 = ji.ktxn("kufn", ktyv(int ), (int)65);
                        continue block112;
                    }
                    case 733325436: {
                        break block112;
                    }
                }
                break;
            }
            var3_6 = (class_1297)var2_5.next();
            if (var5_4 || var5_4) ** GOTO lbl41
            if (!(var3_6 instanceof class_1684)) ** GOTO lbl246
            if (var5_4) ** GOTO lbl41
            var4_7 = (class_1684)var3_6;
            if (var5_4) ** GOTO lbl41
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4) ** GOTO lbl41
                    v24 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl196
                    block113: while (true) {
                        v24 /* !! */  = (long)(ji.ktxn("kufp", ktyv(int ), (int)67) - ji.ktxn("kufo", ktyv(int ), (int)66));
lbl196:
                        // 2 sources

                        switch ((int)v24 /* !! */ ) {
                            case -935042007: {
                                continue block113;
                            }
                            case 733325436: {
                                break block113;
                            }
                        }
                        break;
                    }
                    if (var4_7.method_24828()) ** GOTO lbl246
                    if (var5_4) ** GOTO lbl41
                    v25 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl207
                    block114: while (true) {
                        v25 /* !! */  = (long)(v26 - ji.ktxn("kufq", ktyv(int ), (int)68));
lbl207:
                        // 2 sources

                        switch ((int)v25 /* !! */ ) {
                            case -1113760549: {
                                v26 = ji.ktxn("kufr", ktyv(int ), (int)69);
                                continue block114;
                            }
                            case -630175336: {
                                v26 = ji.ktxn("kufs", ktyv(int ), (int)70);
                                continue block114;
                            }
                            case 733325436: {
                                break block114;
                            }
                            case 1530524204: {
                                v26 = ji.ktxn("kuft", ktyv(int ), (int)71);
                                continue block114;
                            }
                        }
                        break;
                    }
                    v27 = var4_7.method_18798();
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kufu", ktyv(int ), (int)72)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v28 /* !! */  == ji.ktxn("kufv", ktxk(int ), (int)138)) break;
                        v28 /* !! */  = (long)ji.ktxn("kufw", ktxk(int ), (int)139);
                    }
                    if (!(v27.method_1027() > ji.ktxn("kufy", kufx(int ), (int)73))) ** GOTO lbl246
                    if (var5_4 || var5_4) ** GOTO lbl41
                    v29 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl232
                    block116: while (true) {
                        v29 /* !! */  = (long)(v30 - ji.ktxn("kufz", ktyv(int ), (int)74));
lbl232:
                        // 2 sources

                        switch ((int)v29 /* !! */ ) {
                            case -356726429: {
                                v30 = ji.ktxn("kuga", ktyv(int ), (int)75);
                                continue block116;
                            }
                            case 220456312: {
                                v30 = ji.ktxn("kugb", ktyv(int ), (int)76);
                                continue block116;
                            }
                            case 733325436: {
                                break block116;
                            }
                            case 1051167684: {
                                v30 = ji.ktxn("kugc", ktyv(int ), (int)77);
                                continue block116;
                            }
                        }
                        break;
                    }
                    this.spawnPearlTrail(var4_7);
                    if (var5_4) ** GOTO lbl41
lbl246:
                    // 4 sources

                    if (var5_4 || var5_4) ** GOTO lbl41
                    if (!var7_2) continue block110;
                    throw null;
                }
lbl249:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
                case 0: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugd", ktxk(int ), (int)140);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl368
                }
lbl257:
                // 2 sources

                case 1: {
                    var6_3 /* !! */  = (int)ji.ktxn("kuge", ktxk(int ), (int)141);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl360
                }
lbl262:
                // 3 sources

                case 2: {
                    do {
                        var6_3 /* !! */  = (int)ji.ktxn("kugf", ktxk(int ), (int)142);
                    } while (!var7_2);
                    throw null;
                }
                case 3: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugg", ktxk(int ), (int)143);
                    if (!var7_2) ** GOTO lbl257
                    throw null;
                }
lbl271:
                // 2 sources

                case 4: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugh", ktxk(int ), (int)144);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl352
                }
                case 5: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugi", ktxk(int ), (int)145);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl340
                }
lbl281:
                // 2 sources

                case 6: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugj", ktxk(int ), (int)146);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl348
                }
                case 7: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugk", ktxk(int ), (int)147);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl309
                }
lbl291:
                // 2 sources

                case 8: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugl", ktxk(int ), (int)148);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl372
                }
lbl296:
                // 2 sources

                case 9: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugm", ktxk(int ), (int)149);
                    if (!var7_2) ** GOTO lbl291
                    throw null;
                }
lbl300:
                // 2 sources

                case 10: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugn", ktxk(int ), (int)150);
                    if (!var7_2) ** GOTO lbl262
                    throw null;
                }
lbl304:
                // 2 sources

                case 11: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugo", ktxk(int ), (int)151);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl323
                }
lbl309:
                // 4 sources

                case 12: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)ji.ktxn("kugp", ktxk(int ), (int)152);
                        if (var7_2) {
                            throw null;
                        }
                        ** GOTO lbl323
                        break;
                    }
                }
lbl315:
                // 2 sources

                case 13: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugq", ktxk(int ), (int)153);
                    if (!var7_2) ** GOTO lbl309
                    throw null;
                }
lbl319:
                // 4 sources

                case 14: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugr", ktxk(int ), (int)154);
                    if (!var7_2) ** GOTO lbl262
                    throw null;
                }
lbl323:
                // 3 sources

                case 15: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugs", ktxk(int ), (int)155);
                    if (!var7_2) break block110;
                    throw null;
                }
                case 16: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugt", ktxk(int ), (int)156);
                    if (!var7_2) ** GOTO lbl281
                    throw null;
                }
                case 17: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugu", ktxk(int ), (int)157);
                    if (!var7_2) ** GOTO lbl319
                    throw null;
                }
                case 18: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugv", ktxk(int ), (int)158);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl352
                }
lbl340:
                // 2 sources

                case 19: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugw", ktxk(int ), (int)159);
                    if (!var7_2) ** GOTO lbl296
                    throw null;
                }
                case 20: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugx", ktxk(int ), (int)160);
                    if (!var7_2) ** GOTO lbl309
                    throw null;
                }
lbl348:
                // 2 sources

                case 21: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugy", ktxk(int ), (int)161);
                    if (!var7_2) ** GOTO lbl300
                    throw null;
                }
lbl352:
                // 3 sources

                case 22: {
                    var6_3 /* !! */  = (int)ji.ktxn("kugz", ktxk(int ), (int)162);
                    if (!var7_2) ** GOTO lbl315
                    throw null;
                }
                case 23: {
                    var6_3 /* !! */  = (int)ji.ktxn("kuha", ktxk(int ), (int)163);
                    if (!var7_2) ** GOTO lbl271
                    throw null;
                }
lbl360:
                // 2 sources

                case 24: {
                    var6_3 /* !! */  = (int)ji.ktxn("kuhb", ktxk(int ), (int)164);
                    if (!var7_2) ** GOTO lbl304
                    throw null;
                }
lbl364:
                // 2 sources

                case 25: {
                    var6_3 /* !! */  = (int)ji.ktxn("kuhc", ktxk(int ), (int)165);
                    if (!var7_2) ** GOTO lbl319
                    throw null;
                }
lbl368:
                // 2 sources

                case 26: {
                    var6_3 /* !! */  = (int)ji.ktxn("kuhd", ktxk(int ), (int)166);
                    if (!var7_2) ** GOTO lbl364
                    throw null;
                }
lbl372:
                // 2 sources

                case 27: {
                    var6_3 /* !! */  = (int)ji.ktxn("kuhe", ktxk(int ), (int)167);
                    if (!var7_2) ** GOTO lbl319
                    throw null;
                }
                case 28: 
            }
            break;
        }
        var6_3 /* !! */  = (int)ji.ktxn("kuhf", ktxk(int ), (int)168);
        ** while (!var7_2)
lbl379:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ktyv(int n2) {
        return ktyw[n2] ^ ktyx[n2];
    }

    private static /* synthetic */ void kxyo() {
        ji.ktxl[600] = 878371164;
        ji.ktxl[601] = 921409837;
        ji.ktxl[602] = -1556303199;
        ji.ktxl[603] = -1257508218;
        ji.ktxl[604] = -1130070816;
        ji.ktxl[605] = -2035216436;
        ji.ktxl[606] = 994833934;
        ji.ktxl[607] = -1245834742;
        ji.ktxl[608] = -214396709;
        ji.ktxl[609] = -2052873926;
        ji.ktxl[610] = 548120381;
        ji.ktxl[611] = -1215095646;
        ji.ktxl[612] = -1142397179;
        ji.ktxl[613] = -1160403009;
        ji.ktxl[614] = -965521674;
        ji.ktxl[615] = -1250822805;
        ji.ktxl[616] = 1414660384;
        ji.ktxl[617] = -1467107434;
        ji.ktxl[618] = 2065070904;
        ji.ktxl[619] = 1862789036;
        ji.ktxl[620] = -1274702974;
        ji.ktxl[621] = -213096609;
        ji.ktxl[622] = -798370176;
        ji.ktxl[623] = -1754804632;
        ji.ktxl[624] = -1861394094;
        ji.ktxl[625] = -1657737714;
        ji.ktxl[626] = -1334348746;
        ji.ktxl[627] = 273919813;
        ji.ktxl[628] = -1710407260;
        ji.ktxl[629] = -1725631649;
        ji.ktxl[630] = -1508101784;
        ji.ktxl[631] = 787131508;
        ji.ktxl[632] = 1519046265;
        ji.ktxl[633] = 1393089550;
        ji.ktxl[634] = 804320473;
        ji.ktxl[635] = 1895099029;
        ji.ktxl[636] = -706216785;
        ji.ktxl[637] = -2082771770;
        ji.ktxl[638] = 613851599;
        ji.ktxl[639] = 1453449750;
        ji.ktxl[640] = -1082206921;
        ji.ktxl[641] = 859836762;
        ji.ktxl[642] = 1538880940;
        ji.ktxl[643] = -98153044;
        ji.ktxl[644] = -808257965;
        ji.ktxl[645] = -1306213242;
        ji.ktxl[646] = 1673174486;
        ji.ktxl[647] = -1384241332;
        ji.ktxl[648] = 43111346;
        ji.ktxl[649] = -1851259110;
        ji.ktxl[650] = -1817490128;
        ji.ktxl[651] = 1143186229;
        ji.ktxl[652] = -1625988530;
        ji.ktxl[653] = 1204162935;
        ji.ktxl[654] = 1510356071;
        ji.ktxl[655] = -1475419224;
        ji.ktxl[656] = 510759189;
        ji.ktxl[657] = -617035552;
        ji.ktxl[658] = 612499381;
        ji.ktxl[659] = -1086537718;
        ji.ktxl[660] = -1791066400;
        ji.ktxl[661] = 2112955570;
        ji.ktxl[662] = 29867280;
        ji.ktxl[663] = 1693018024;
        ji.ktxl[664] = 1357321532;
        ji.ktxl[665] = -1140749375;
        ji.ktxl[666] = 1043522138;
        ji.ktxl[667] = 652066665;
        ji.ktxl[668] = -466822296;
        ji.ktxl[669] = 159875110;
        ji.ktxl[670] = -1985169244;
        ji.ktxl[671] = -361238433;
        ji.ktxl[672] = 433220019;
        ji.ktxl[673] = 1681140622;
        ji.ktxl[674] = 1569533744;
        ji.ktxl[675] = 1881785706;
        ji.ktxl[676] = 1762141152;
        ji.ktxl[677] = -1598862826;
        ji.ktxl[678] = 2011631463;
        ji.ktxl[679] = 229002269;
        ji.ktxl[680] = 59389636;
        ji.ktxl[681] = -1251727937;
        ji.ktxl[682] = -556139228;
        ji.ktxl[683] = 1989304415;
        ji.ktxl[684] = 2066549081;
        ji.ktxl[685] = -115810960;
        ji.ktxl[686] = -1822850941;
        ji.ktxl[687] = -975788440;
        ji.ktxl[688] = -682154532;
        ji.ktxl[689] = -1875949443;
        ji.ktxl[690] = -1043078261;
        ji.ktxl[691] = 814852086;
        ji.ktxl[692] = 1316707743;
        ji.ktxl[693] = -2131080001;
        ji.ktxl[694] = 329223032;
        ji.ktxl[695] = 1144079397;
        ji.ktxl[696] = 53099134;
        ji.ktxl[697] = 1117925539;
        ji.ktxl[698] = 856626576;
        ji.ktxl[699] = -1893215010;
    }

    private static /* synthetic */ void kxyy() {
        ji.ktxm[400] = -1898238202;
        ji.ktxm[401] = 1893723577;
        ji.ktxm[402] = 2112725627;
        ji.ktxm[403] = 596260713;
        ji.ktxm[404] = -1334414621;
        ji.ktxm[405] = -636660980;
        ji.ktxm[406] = 248341587;
        ji.ktxm[407] = 856183958;
        ji.ktxm[408] = 409375146;
        ji.ktxm[409] = 636946129;
        ji.ktxm[410] = -1259133696;
        ji.ktxm[411] = 1736195242;
        ji.ktxm[412] = -396535370;
        ji.ktxm[413] = -264900963;
        ji.ktxm[414] = 1358276662;
        ji.ktxm[415] = -1578138293;
        ji.ktxm[416] = -607413266;
        ji.ktxm[417] = -1541902964;
        ji.ktxm[418] = 150277644;
        ji.ktxm[419] = 1710972790;
        ji.ktxm[420] = 1257038850;
        ji.ktxm[421] = 652013872;
        ji.ktxm[422] = -417591586;
        ji.ktxm[423] = 1624108942;
        ji.ktxm[424] = -6295309;
        ji.ktxm[425] = -2049713723;
        ji.ktxm[426] = -1667329677;
        ji.ktxm[427] = -878406984;
        ji.ktxm[428] = -1087393319;
        ji.ktxm[429] = 817574314;
        ji.ktxm[430] = 2022244193;
        ji.ktxm[431] = 1276421477;
        ji.ktxm[432] = -1809265952;
        ji.ktxm[433] = 1457121292;
        ji.ktxm[434] = -1190790225;
        ji.ktxm[435] = -939417809;
        ji.ktxm[436] = -1433147757;
        ji.ktxm[437] = -209222940;
        ji.ktxm[438] = 1878417340;
        ji.ktxm[439] = 565745641;
        ji.ktxm[440] = 665671516;
        ji.ktxm[441] = 2653218;
        ji.ktxm[442] = -1961778592;
        ji.ktxm[443] = 395741680;
        ji.ktxm[444] = -1061761717;
        ji.ktxm[445] = -1653162454;
        ji.ktxm[446] = -628945584;
        ji.ktxm[447] = 1126163911;
        ji.ktxm[448] = -351788010;
        ji.ktxm[449] = 124842879;
        ji.ktxm[450] = -1652715511;
        ji.ktxm[451] = 1472217449;
        ji.ktxm[452] = -141468430;
        ji.ktxm[453] = 1024484380;
        ji.ktxm[454] = 461778803;
        ji.ktxm[455] = 1666737810;
        ji.ktxm[456] = -1677415300;
        ji.ktxm[457] = 1473053303;
        ji.ktxm[458] = -1041900752;
        ji.ktxm[459] = 1987336680;
        ji.ktxm[460] = 1533699567;
        ji.ktxm[461] = 1883780311;
        ji.ktxm[462] = 1154147842;
        ji.ktxm[463] = 785594264;
        ji.ktxm[464] = -32013821;
        ji.ktxm[465] = 1322892184;
        ji.ktxm[466] = -1942222991;
        ji.ktxm[467] = 2013130384;
        ji.ktxm[468] = -1674960365;
        ji.ktxm[469] = -669750870;
        ji.ktxm[470] = 1731196947;
        ji.ktxm[471] = 157933942;
        ji.ktxm[472] = 1741901823;
        ji.ktxm[473] = 247705765;
        ji.ktxm[474] = -1429467635;
        ji.ktxm[475] = -1234165029;
        ji.ktxm[476] = 1906464851;
        ji.ktxm[477] = -1406313953;
        ji.ktxm[478] = -1001284135;
        ji.ktxm[479] = 33538224;
        ji.ktxm[480] = -500620632;
        ji.ktxm[481] = -2036006335;
        ji.ktxm[482] = 1048191816;
        ji.ktxm[483] = -112973928;
        ji.ktxm[484] = -1199671606;
        ji.ktxm[485] = 1500701736;
        ji.ktxm[486] = -1106930963;
        ji.ktxm[487] = -1659198522;
        ji.ktxm[488] = 133934627;
        ji.ktxm[489] = 2077872614;
        ji.ktxm[490] = 570802473;
        ji.ktxm[491] = -646677735;
        ji.ktxm[492] = -1184278888;
        ji.ktxm[493] = -537462854;
        ji.ktxm[494] = 1051808896;
        ji.ktxm[495] = -1992867097;
        ji.ktxm[496] = 1286177429;
        ji.ktxm[497] = 848011288;
        ji.ktxm[498] = 831828059;
        ji.ktxm[499] = 441680867;
    }

    private static /* synthetic */ void kxyt() {
        ji.ktxl[1100] = 113775964;
        ji.ktxl[1101] = -143555233;
        ji.ktxl[1102] = 445361677;
        ji.ktxl[1103] = -1043521933;
        ji.ktxl[1104] = 1341918960;
        ji.ktxl[1105] = -178176553;
        ji.ktxl[1106] = 132854283;
        ji.ktxl[1107] = 373872930;
        ji.ktxl[1108] = 1345036649;
        ji.ktxl[1109] = -361701648;
        ji.ktxl[1110] = 1128840675;
        ji.ktxl[1111] = 486447422;
        ji.ktxl[1112] = -695387340;
        ji.ktxl[1113] = 298357465;
        ji.ktxl[1114] = -1719577642;
        ji.ktxl[1115] = 1261406625;
        ji.ktxl[1116] = 1164157724;
        ji.ktxl[1117] = 251548257;
        ji.ktxl[1118] = -147185321;
        ji.ktxl[1119] = 23372058;
        ji.ktxl[1120] = 2042545831;
        ji.ktxl[1121] = 570731349;
        ji.ktxl[1122] = -1589579605;
        ji.ktxl[1123] = 1388446821;
        ji.ktxl[1124] = -985996031;
        ji.ktxl[1125] = -664001042;
        ji.ktxl[1126] = -1639664165;
        ji.ktxl[1127] = 1092079435;
        ji.ktxl[1128] = 1460081705;
        ji.ktxl[1129] = 573716663;
        ji.ktxl[1130] = 1368224643;
        ji.ktxl[1131] = 1230043654;
        ji.ktxl[1132] = -845980100;
        ji.ktxl[1133] = 319892143;
        ji.ktxl[1134] = 723282030;
        ji.ktxl[1135] = -802156089;
        ji.ktxl[1136] = 1405496124;
        ji.ktxl[1137] = 614765450;
        ji.ktxl[1138] = -49256004;
        ji.ktxl[1139] = 1275318229;
        ji.ktxl[1140] = 1856160043;
        ji.ktxl[1141] = -142655924;
        ji.ktxl[1142] = -882749811;
        ji.ktxl[1143] = -1415144880;
        ji.ktxl[1144] = -1823983920;
        ji.ktxl[1145] = 255396504;
        ji.ktxl[1146] = -1514145237;
        ji.ktxl[1147] = -1811028622;
        ji.ktxl[1148] = -89980126;
        ji.ktxl[1149] = 870749106;
        ji.ktxl[1150] = 1594235603;
        ji.ktxl[1151] = 893107085;
        ji.ktxl[1152] = 1825302671;
        ji.ktxl[1153] = 569604368;
        ji.ktxl[1154] = 180415160;
        ji.ktxl[1155] = 1015980519;
        ji.ktxl[1156] = -114756248;
        ji.ktxl[1157] = -2103128041;
        ji.ktxl[1158] = 661473782;
        ji.ktxl[1159] = 2048197865;
        ji.ktxl[1160] = -344068501;
        ji.ktxl[1161] = -631220191;
        ji.ktxl[1162] = 1434177505;
        ji.ktxl[1163] = -437096789;
        ji.ktxl[1164] = -1431016012;
        ji.ktxl[1165] = 1654041890;
        ji.ktxl[1166] = 139729367;
        ji.ktxl[1167] = 1119757079;
        ji.ktxl[1168] = 1352421228;
        ji.ktxl[1169] = -1885863050;
        ji.ktxl[1170] = -974139397;
        ji.ktxl[1171] = -75465282;
        ji.ktxl[1172] = -242070526;
        ji.ktxl[1173] = 1365493288;
        ji.ktxl[1174] = 401498440;
        ji.ktxl[1175] = 562800367;
        ji.ktxl[1176] = 1474000116;
        ji.ktxl[1177] = -752360200;
        ji.ktxl[1178] = 660319978;
        ji.ktxl[1179] = -1768620975;
        ji.ktxl[1180] = -1858862935;
        ji.ktxl[1181] = -997714201;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void addEventParticle(double var1_1, double var3_2, double var5_3, double var7_4, double var9_5, double var11_6, float var13_7, float var14_8, ji$ParticleKind var15_9) {
        block30: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kvqw", ktyv(int ), (int)239)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ji.ktxn("kvqy", ktxk(int ), (int)597)) break;
                v0 /* !! */  = (long)ji.ktxn("kvra", ktxk(int ), (int)598);
            }
            var18_10 = ji.c;
            while (true) {
                block31: {
                    if ((v1 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kvrb", ktyv(int ), (int)240)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != ji.ktxn("kvrd", ktxk(int ), (int)599)) break block31;
                    var17_11 /* !! */  = ji.b;
                    v2 /* !! */  = ji.tf;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)ji.ktxn("kvrf", ktxk(int ), (int)600);
            }
            block20: while (true) {
                v2 /* !! */  = (long)(v3 - ji.ktxn("kvrg", ktyv(int ), (int)241));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -205112459: {
                        v3 = ji.ktxn("kvri", ktyv(int ), (int)242);
                        continue block20;
                    }
                    case 733325436: {
                        break block20;
                    }
                    case 1256128478: {
                        v3 = ji.ktxn("kvru", ktyv(int ), (int)243);
                        continue block20;
                    }
                }
                break;
            }
            var16_12 = ji.a;
            if (var18_10) {
                throw null;
            }
            if (var16_12) ** GOTO lbl52
            if (var17_11 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block21: do {
                switch (cfr_temp_0 == -2147483648 ? var17_11 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var16_12) ** GOTO lbl52
                        v4 = ji.ktxn("kvsb", ktxk(int ), (int)601);
                        v5 /* !! */  = ji.tf;
                        block22: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -559684428: {
                                    v6 = ji.ktxn("kvsd", ktyv(int ), (int)245);
                                    ** GOTO lbl48
                                }
                                case 733325436: {
                                    break block22;
                                }
                                case 782059476: {
                                    v6 = ji.ktxn("kvse", ktyv(int ), (int)246);
lbl48:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - ji.ktxn("kvsc", ktyv(int ), (int)244));
                                    continue block22;
                                }
                            }
                            break;
                        }
                        this.addEventParticle(var1_1, var3_2, var5_3, var7_4, var9_5, var11_6, var13_7, var14_8, var15_9, (int)v4);
                        if (!var16_12 && !var16_12) ** GOTO lbl53
lbl52:
                        // 3 sources

                        return;
lbl53:
                        // 1 sources

                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var17_11 /* !! */  = (int)ji.ktxn("kvsj", ktxk(int ), (int)604);
                        if (!var18_10) ** break;
                        throw null;
                    }
                    case 5: {
                        break block30;
                    }
lbl62:
                    // 2 sources

                    while (true) {
                        var17_11 /* !! */  = (int)ji.ktxn("kvsf", ktxk(int ), (int)602);
                        cfr_temp_0 = 4;
                        if (!var18_10) continue block21;
                        throw null;
                    }
                    case 4: {
                        var17_11 /* !! */  = (int)ji.ktxn("kvso", ktxk(int ), (int)606);
                        if (var18_10) {
                            throw null;
                        }
                    }
                    case 3: {
                        var17_11 /* !! */  = (int)ji.ktxn("kvsl", ktxk(int ), (int)605);
                        if (var18_10) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var17_11 /* !! */  = (int)ji.ktxn("kvsg", ktxk(int ), (int)603);
            if (!var18_10) ** break;
            throw null;
        }
        var17_11 /* !! */  = (int)ji.ktxn("kvsq", ktxk(int ), (int)607);
        ** while (!var18_10)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxym() {
        ji.ktxl[400] = -1898238206;
        ji.ktxl[401] = 1893723644;
        ji.ktxl[402] = 2112725568;
        ji.ktxl[403] = 596260722;
        ji.ktxl[404] = -1334414712;
        ji.ktxl[405] = -636660948;
        ji.ktxl[406] = 248341533;
        ji.ktxl[407] = 856184009;
        ji.ktxl[408] = 409375124;
        ji.ktxl[409] = 636946142;
        ji.ktxl[410] = -1259133670;
        ji.ktxl[411] = 1736195257;
        ji.ktxl[412] = -396535306;
        ji.ktxl[413] = -264900919;
        ji.ktxl[414] = 1358276615;
        ji.ktxl[415] = -1578138266;
        ji.ktxl[416] = -607413250;
        ji.ktxl[417] = -1541902937;
        ji.ktxl[418] = 150277644;
        ji.ktxl[419] = 1710972689;
        ji.ktxl[420] = 1257038934;
        ji.ktxl[421] = 652013951;
        ji.ktxl[422] = -417591596;
        ji.ktxl[423] = 1624108939;
        ji.ktxl[424] = -6295310;
        ji.ktxl[425] = -2049713684;
        ji.ktxl[426] = -1667329735;
        ji.ktxl[427] = -878407031;
        ji.ktxl[428] = -1087393395;
        ji.ktxl[429] = 817574368;
        ji.ktxl[430] = 2022244157;
        ji.ktxl[431] = 1276421486;
        ji.ktxl[432] = -1809265937;
        ji.ktxl[433] = 1457121391;
        ji.ktxl[434] = -1190790200;
        ji.ktxl[435] = -939417827;
        ji.ktxl[436] = -1433147656;
        ji.ktxl[437] = -209223007;
        ji.ktxl[438] = 1878417309;
        ji.ktxl[439] = 565745643;
        ji.ktxl[440] = 665671515;
        ji.ktxl[441] = 2653256;
        ji.ktxl[442] = -1961778605;
        ji.ktxl[443] = 395741668;
        ji.ktxl[444] = -1061761788;
        ji.ktxl[445] = -1653162386;
        ji.ktxl[446] = -628945676;
        ji.ktxl[447] = 1126163911;
        ji.ktxl[448] = -351788012;
        ji.ktxl[449] = 124842715;
        ji.ktxl[450] = -1573023735;
        ji.ktxl[451] = 1764108047;
        ji.ktxl[452] = -1216258830;
        ji.ktxl[453] = 40969138;
        ji.ktxl[454] = 636743164;
        ji.ktxl[455] = 1666737799;
        ji.ktxl[456] = -1677415311;
        ji.ktxl[457] = 1473053307;
        ji.ktxl[458] = -1041900766;
        ji.ktxl[459] = 1987336675;
        ji.ktxl[460] = 1533699562;
        ji.ktxl[461] = 1883780294;
        ji.ktxl[462] = 1154147847;
        ji.ktxl[463] = 785594259;
        ji.ktxl[464] = -32013815;
        ji.ktxl[465] = 1322892180;
        ji.ktxl[466] = -1942222978;
        ji.ktxl[467] = 2013130399;
        ji.ktxl[468] = -1674960368;
        ji.ktxl[469] = -669750862;
        ji.ktxl[470] = 1731196946;
        ji.ktxl[471] = 157933950;
        ji.ktxl[472] = 1741901807;
        ji.ktxl[473] = 247705774;
        ji.ktxl[474] = -1429467627;
        ji.ktxl[475] = -1234165039;
        ji.ktxl[476] = 1906464848;
        ji.ktxl[477] = -1406313964;
        ji.ktxl[478] = -1001284129;
        ji.ktxl[479] = 33538236;
        ji.ktxl[480] = -500620610;
        ji.ktxl[481] = -2036006327;
        ji.ktxl[482] = 1048191809;
        ji.ktxl[483] = 112973927;
        ji.ktxl[484] = 856095668;
        ji.ktxl[485] = 1500701737;
        ji.ktxl[486] = -668146901;
        ji.ktxl[487] = -1659198521;
        ji.ktxl[488] = 863695585;
        ji.ktxl[489] = 2077872194;
        ji.ktxl[490] = -570802474;
        ji.ktxl[491] = 518396098;
        ji.ktxl[492] = -1184278853;
        ji.ktxl[493] = -537462854;
        ji.ktxl[494] = 1051808897;
        ji.ktxl[495] = -884214101;
        ji.ktxl[496] = 1286177429;
        ji.ktxl[497] = 848011289;
        ji.ktxl[498] = -1854230317;
        ji.ktxl[499] = 441680866;
    }

    private static /* synthetic */ void kxyl() {
        ji.ktxl[300] = 498993419;
        ji.ktxl[301] = 668491752;
        ji.ktxl[302] = -775552593;
        ji.ktxl[303] = 1720622075;
        ji.ktxl[304] = -1263203756;
        ji.ktxl[305] = -1088049937;
        ji.ktxl[306] = 1960963434;
        ji.ktxl[307] = -1497150119;
        ji.ktxl[308] = 45334708;
        ji.ktxl[309] = -2093373783;
        ji.ktxl[310] = -1317901151;
        ji.ktxl[311] = 166538210;
        ji.ktxl[312] = 7470399;
        ji.ktxl[313] = -1950293477;
        ji.ktxl[314] = 1789248778;
        ji.ktxl[315] = -1963134326;
        ji.ktxl[316] = -2120708098;
        ji.ktxl[317] = 1146783202;
        ji.ktxl[318] = -897138669;
        ji.ktxl[319] = 2002242405;
        ji.ktxl[320] = -1857997298;
        ji.ktxl[321] = 933147050;
        ji.ktxl[322] = 458809107;
        ji.ktxl[323] = 1609055029;
        ji.ktxl[324] = -129053348;
        ji.ktxl[325] = -1343111960;
        ji.ktxl[326] = 1428777340;
        ji.ktxl[327] = -1295678532;
        ji.ktxl[328] = -718699134;
        ji.ktxl[329] = -11614468;
        ji.ktxl[330] = -2099201911;
        ji.ktxl[331] = 1142125192;
        ji.ktxl[332] = 1031009012;
        ji.ktxl[333] = 1378044719;
        ji.ktxl[334] = -738773312;
        ji.ktxl[335] = 1030836075;
        ji.ktxl[336] = -458689503;
        ji.ktxl[337] = -242731600;
        ji.ktxl[338] = -1084316658;
        ji.ktxl[339] = 1121394063;
        ji.ktxl[340] = -40322621;
        ji.ktxl[341] = 1015727107;
        ji.ktxl[342] = 190176096;
        ji.ktxl[343] = 132737040;
        ji.ktxl[344] = 383581606;
        ji.ktxl[345] = -2114256663;
        ji.ktxl[346] = 233911484;
        ji.ktxl[347] = 1467270426;
        ji.ktxl[348] = 1754008716;
        ji.ktxl[349] = 481447605;
        ji.ktxl[350] = 1316741799;
        ji.ktxl[351] = 22836364;
        ji.ktxl[352] = -387049960;
        ji.ktxl[353] = -597526512;
        ji.ktxl[354] = 831580184;
        ji.ktxl[355] = -1735321283;
        ji.ktxl[356] = -1811874799;
        ji.ktxl[357] = -1877202245;
        ji.ktxl[358] = -570961819;
        ji.ktxl[359] = 1886510520;
        ji.ktxl[360] = 783198931;
        ji.ktxl[361] = 1443858438;
        ji.ktxl[362] = -289767573;
        ji.ktxl[363] = -65845501;
        ji.ktxl[364] = 1232449486;
        ji.ktxl[365] = 54872710;
        ji.ktxl[366] = 969114986;
        ji.ktxl[367] = 1880180234;
        ji.ktxl[368] = 1543248782;
        ji.ktxl[369] = -1090376322;
        ji.ktxl[370] = 224825092;
        ji.ktxl[371] = 1943494495;
        ji.ktxl[372] = -1543442614;
        ji.ktxl[373] = -1972533460;
        ji.ktxl[374] = -651501574;
        ji.ktxl[375] = 312671417;
        ji.ktxl[376] = -291465161;
        ji.ktxl[377] = -1456515090;
        ji.ktxl[378] = 1229583051;
        ji.ktxl[379] = -734971235;
        ji.ktxl[380] = 1327842518;
        ji.ktxl[381] = -95867779;
        ji.ktxl[382] = -556617951;
        ji.ktxl[383] = 1649068305;
        ji.ktxl[384] = -1159459788;
        ji.ktxl[385] = 1018207664;
        ji.ktxl[386] = 310626774;
        ji.ktxl[387] = -1468682270;
        ji.ktxl[388] = -1976290107;
        ji.ktxl[389] = -529968542;
        ji.ktxl[390] = 209076197;
        ji.ktxl[391] = 1195248736;
        ji.ktxl[392] = 2073959246;
        ji.ktxl[393] = 2118630582;
        ji.ktxl[394] = 148572920;
        ji.ktxl[395] = 839130183;
        ji.ktxl[396] = 1278443056;
        ji.ktxl[397] = -312145640;
        ji.ktxl[398] = 547189409;
        ji.ktxl[399] = -1638978671;
    }

    private static /* synthetic */ void kxzg() {
        ji.ktyw[0] = -8510135841618406037L;
        ji.ktyw[1] = 8554310593141696184L;
        ji.ktyw[2] = 6591676223203684872L;
        ji.ktyw[3] = 5174380154412237964L;
        ji.ktyw[4] = 4679527093621869374L;
        ji.ktyw[5] = -2970332011122830759L;
        ji.ktyw[6] = 3904267347768599652L;
        ji.ktyw[7] = 9213280843034041075L;
        ji.ktyw[8] = 4682793196003627977L;
        ji.ktyw[9] = -5941263805758069908L;
        ji.ktyw[10] = 1311052456860164000L;
        ji.ktyw[11] = -3649514772128723645L;
        ji.ktyw[12] = -5606354433960746557L;
        ji.ktyw[13] = 5350453155580539935L;
        ji.ktyw[14] = 3337308682283940089L;
        ji.ktyw[15] = -6337422458341421447L;
        ji.ktyw[16] = 7904127462734251571L;
        ji.ktyw[17] = -436664964696407298L;
        ji.ktyw[18] = -8582254042323969307L;
        ji.ktyw[19] = -5581788296098074453L;
        ji.ktyw[20] = 3120236661469412509L;
        ji.ktyw[21] = 7175651571670975980L;
        ji.ktyw[22] = -4247320754218000892L;
        ji.ktyw[23] = -5624372129348614758L;
        ji.ktyw[24] = 3846670008620921328L;
        ji.ktyw[25] = -4809151406653806918L;
        ji.ktyw[26] = 1668668072708725956L;
        ji.ktyw[27] = 7280604223647891266L;
        ji.ktyw[28] = -7615327403738672191L;
        ji.ktyw[29] = -1913453274703059393L;
        ji.ktyw[30] = 9087921753192081401L;
        ji.ktyw[31] = 1736921446855750433L;
        ji.ktyw[32] = 2469814105602839202L;
        ji.ktyw[33] = 8670350147672063035L;
        ji.ktyw[34] = 5845747486892945080L;
        ji.ktyw[35] = 7472285780385510381L;
        ji.ktyw[36] = 7448061566162561689L;
        ji.ktyw[37] = 4435169527779449052L;
        ji.ktyw[38] = -6437250286222547122L;
        ji.ktyw[39] = 6271452420452291472L;
        ji.ktyw[40] = -5216547582875840675L;
        ji.ktyw[41] = 2510682290412035351L;
        ji.ktyw[42] = 8436583449499992535L;
        ji.ktyw[43] = -6848248881494897822L;
        ji.ktyw[44] = -1715712888688364066L;
        ji.ktyw[45] = -1075628505380881615L;
        ji.ktyw[46] = 5288417090074145281L;
        ji.ktyw[47] = 4990911416205260466L;
        ji.ktyw[48] = -2252379993360462784L;
        ji.ktyw[49] = -745744963137294699L;
        ji.ktyw[50] = 7147018964979973674L;
        ji.ktyw[51] = 6985140774615433106L;
        ji.ktyw[52] = -5246724941746386646L;
        ji.ktyw[53] = 1623058805549917494L;
        ji.ktyw[54] = -7556840769168004763L;
        ji.ktyw[55] = -3901743773257962151L;
        ji.ktyw[56] = -8142953121048968450L;
        ji.ktyw[57] = 7727591126046074725L;
        ji.ktyw[58] = -8375616300253122531L;
        ji.ktyw[59] = -9150212210862847968L;
        ji.ktyw[60] = 7652842784319551067L;
        ji.ktyw[61] = 8218439837593013823L;
        ji.ktyw[62] = -4661503948120631498L;
        ji.ktyw[63] = 2558837612978185935L;
        ji.ktyw[64] = 6610611690475782831L;
        ji.ktyw[65] = 4967385276603268729L;
        ji.ktyw[66] = -7289145749233610071L;
        ji.ktyw[67] = -273315717196631354L;
        ji.ktyw[68] = 857545696122456916L;
        ji.ktyw[69] = 1241811023120772905L;
        ji.ktyw[70] = -8166390852364494936L;
        ji.ktyw[71] = 4623244209420407745L;
        ji.ktyw[72] = -3448028349708711241L;
        ji.ktyw[73] = 6409337226283634735L;
        ji.ktyw[74] = -8113470769443427465L;
        ji.ktyw[75] = -1423439168881067139L;
        ji.ktyw[76] = -8650765481830982123L;
        ji.ktyw[77] = 501259702829568941L;
        ji.ktyw[78] = -6394852807307198664L;
        ji.ktyw[79] = -4327354734493642129L;
        ji.ktyw[80] = 3453488099102767182L;
        ji.ktyw[81] = 891050406422078314L;
        ji.ktyw[82] = 3600743101913834227L;
        ji.ktyw[83] = -1555380622558774008L;
        ji.ktyw[84] = -6763988081874528597L;
        ji.ktyw[85] = -8754089300627585963L;
        ji.ktyw[86] = -6065945860223024888L;
        ji.ktyw[87] = 3688665967447504451L;
        ji.ktyw[88] = 5416214698082069491L;
        ji.ktyw[89] = -3682502604327990661L;
        ji.ktyw[90] = 5473409905439840284L;
        ji.ktyw[91] = 2929779064974589557L;
        ji.ktyw[92] = 7579617301530514592L;
        ji.ktyw[93] = 2278949062690004742L;
        ji.ktyw[94] = 8217954503260775377L;
        ji.ktyw[95] = -9117871427165335042L;
        ji.ktyw[96] = -4931753235673632160L;
        ji.ktyw[97] = -3606368558079697932L;
        ji.ktyw[98] = 2347558911297641818L;
        ji.ktyw[99] = 175072512656378443L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void recycleParticles() {
        v0 /* !! */  = ji.tf;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v1 - ji.ktxn("kxre", ktyv(int ), (int)468));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1347736564: {
                    v1 = ji.ktxn("kxrf", ktyv(int ), (int)469);
                    continue block46;
                }
                case 733325436: {
                    break block46;
                }
                case 1480011760: {
                    v1 = ji.ktxn("kxrg", ktyv(int ), (int)470);
                    continue block46;
                }
            }
            break;
        }
        var5_1 = ji.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxrh", ktyv(int ), (int)471)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ji.ktxn("kxri", ktxk(int ), (int)1076)) break;
            v2 /* !! */  = (long)ji.ktxn("kxrj", ktxk(int ), (int)1077);
        }
        var4_2 /* !! */  = ji.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxrk", ktyv(int ), (int)472)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ji.ktxn("kxrl", ktxk(int ), (int)1078)) {
                var3_3 = ji.a;
                if (var5_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ji.ktxn("kxrm", ktxk(int ), (int)1079);
        }
        if (var3_3 || var3_3) return;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kxrn", ktyv(int ), (int)473)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ji.ktxn("kxro", ktxk(int ), (int)1080)) break;
            v4 /* !! */  = (long)ji.ktxn("kxrp", ktxk(int ), (int)1081);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kxrq", ktyv(int ), (int)474)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ji.ktxn("kxrr", ktxk(int ), (int)1082)) {
                var1_4 = this.particles.iterator();
                if (var3_3) return;
                break;
            }
            v5 /* !! */  = (long)ji.ktxn("kxrs", ktxk(int ), (int)1083);
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl136
        cfr_temp_0 = -2147483648;
        block51: while (true) {
            block84: {
                switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                    default: {
                        ** GOTO lbl136
                    }
                    case 1: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsn", ktxk(int ), (int)1090);
                        cfr_temp_0 = 9;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 2: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxso", ktxk(int ), (int)1091);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsq", ktxk(int ), (int)1093);
                        cfr_temp_0 = 6;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 8: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsu", ktxk(int ), (int)1097);
                        cfr_temp_0 = 13;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 9: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsv", ktxk(int ), (int)1098);
                        cfr_temp_0 = 6;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 10: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsw", ktxk(int ), (int)1099);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsm", ktxk(int ), (int)1089);
                        cfr_temp_0 = 3;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 11: {
                        ** GOTO lbl116
                    }
                    case 14: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxta", ktxk(int ), (int)1103);
                        cfr_temp_0 = 6;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 15: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxtb", ktxk(int ), (int)1104);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 16: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxtc", ktxk(int ), (int)1105);
                        cfr_temp_0 = 12;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 17: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxtd", ktxk(int ), (int)1106);
                        cfr_temp_0 = 5;
                        if (var5_1) {
                            throw null;
                        }
                        break block84;
                    }
                    case 18: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxte", ktxk(int ), (int)1107);
                        if (var5_1) {
                            throw null;
                        }
lbl116:
                        // 3 sources

                        var4_2 /* !! */  = (int)ji.ktxn("kxsx", ktxk(int ), (int)1100);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 12: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsy", ktxk(int ), (int)1101);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxss", ktxk(int ), (int)1095);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsr", ktxk(int ), (int)1094);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxst", ktxk(int ), (int)1096);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl215
                    }
lbl136:
                    // 3 sources

                    while (!var3_3 && !var3_3) {
                        v6 /* !! */  = ji.tf;
                        if (true) ** GOTO lbl141
                        block53: while (true) {
                            v6 /* !! */  = (long)(v7 - ji.ktxn("kxrt", ktyv(int ), (int)475));
lbl141:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -1901407386: {
                                    v7 = ji.ktxn("kxru", ktyv(int ), (int)476);
                                    continue block53;
                                }
                                case -680783680: {
                                    v7 = ji.ktxn("kxrv", ktyv(int ), (int)477);
                                    continue block53;
                                }
                                case 733325436: {
                                    break block53;
                                }
                                case 1144129775: {
                                    v7 = ji.ktxn("kxrw", ktyv(int ), (int)478);
                                    continue block53;
                                }
                            }
                            break;
                        }
                        if (var1_4.hasNext()) ** GOTO lbl156
                        if (var3_3 || var3_3) return;
                        ** GOTO lbl187
lbl156:
                        // 1 sources

                        if (var3_3) return;
                        v8 /* !! */  = ji.tf;
                        block54: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -1241885105: {
                                    v8 /* !! */  = (long)(ji.ktxn("kxry", ktyv(int ), (int)480) - ji.ktxn("kxrx", ktyv(int ), (int)479));
                                    continue block54;
                                }
                                case 733325436: {
                                    break block54;
                                }
                            }
                            break;
                        }
                        var2_5 = var1_4.next();
                        if (var3_3 || var3_3) return;
                        v9 /* !! */  = ji.tf;
                        if (true) ** GOTO lbl171
                        block55: while (true) {
                            v9 /* !! */  = (long)(v10 - ji.ktxn("kxrz", ktyv(int ), (int)481));
lbl171:
                            // 2 sources

                            switch ((int)v9 /* !! */ ) {
                                case -941714913: {
                                    v10 = ji.ktxn("kxsa", ktyv(int ), (int)482);
                                    continue block55;
                                }
                                case -540777378: {
                                    v10 = ji.ktxn("kxsb", ktyv(int ), (int)483);
                                    continue block55;
                                }
                                case -214976958: {
                                    v10 = ji.ktxn("kxsc", ktyv(int ), (int)484);
                                    continue block55;
                                }
                                case 733325436: {
                                    break block55;
                                }
                            }
                            break;
                        }
                        this.recycle(var2_5);
                        if (var3_3 || var3_3) return;
                        if (!var5_1) continue;
                        throw null;
lbl187:
                        // 1 sources

                        v11 /* !! */  = ji.tf;
                        block56: while (true) {
                            switch ((int)v11 /* !! */ ) {
                                case 399137851: {
                                    v11 /* !! */  = (long)(ji.ktxn("kxse", ktyv(int ), (int)486) - ji.ktxn("kxsd", ktyv(int ), (int)485));
                                    continue block56;
                                }
                                case 733325436: {
                                    break block56;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kxsf", ktyv(int ), (int)487)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == ji.ktxn("kxsg", ktxk(int ), (int)1084)) {
                                this.particles.clear();
                                if (var3_3) return;
                                break;
                            }
                            v12 /* !! */  = (long)ji.ktxn("kxsh", ktxk(int ), (int)1085);
                        }
                        if (var3_3) return;
                        v13 = ji.ktxn("kxsi", ktxk(int ), (int)1086);
                        while (true) {
                            if ((v14 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kxsj", ktyv(int ), (int)488)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v14 /* !! */  == ji.ktxn("kxsk", ktxk(int ), (int)1087)) {
                                this.ambientParticleCount = (int)v13;
                                if (var3_3) return;
                                break;
                            }
                            v14 /* !! */  = (long)ji.ktxn("kxsl", ktxk(int ), (int)1088);
                        }
                        if (!var3_3) return;
                    }
                    return;
lbl215:
                    // 2 sources

                    case 3: {
                        var4_2 /* !! */  = (int)ji.ktxn("kxsp", ktxk(int ), (int)1092);
                        if (var5_1) {
                            throw null;
                        }
                    }
                    case 13: 
                }
                ** GOTO lbl224
            }
            do {
                if (true) continue block51;
lbl224:
                // 2 sources

                var4_2 /* !! */  = (int)ji.ktxn("kxsz", ktxk(int ), (int)1102);
                cfr_temp_0 = 3;
            } while (!var5_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void addEventParticle(double var1_2, double var3_3, double var5_4, double var7_5, double var9_6, double var11_7, float var13_8, float var14_9, ji$ParticleKind var15_10, int var16_1) {
        block99: {
            block98: {
                v0 /* !! */  = ji.tf;
                if (true) ** GOTO lbl5
                block66: while (true) {
                    v0 /* !! */  = (long)(ji.ktxn("kvtd", ktyv(int ), (int)248) - ji.ktxn("kvtb", ktyv(int ), (int)247));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1566920483: {
                            continue block66;
                        }
                        case 733325436: {
                            break block66;
                        }
                    }
                    break;
                }
                var20_11 = ji.c;
                v1 /* !! */  = ji.tf;
                if (true) ** GOTO lbl15
                block67: while (true) {
                    v1 /* !! */  = (long)(ji.ktxn("kvtg", ktyv(int ), (int)250) - ji.ktxn("kvte", ktyv(int ), (int)249));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 605127114: {
                            continue block67;
                        }
                        case 733325436: {
                            break block67;
                        }
                    }
                    break;
                }
                var19_12 /* !! */  = ji.b;
                v2 /* !! */  = ji.tf;
                if (true) ** GOTO lbl25
                block68: while (true) {
                    v2 /* !! */  = (long)(v3 - ji.ktxn("kvti", ktyv(int ), (int)251));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -703324072: {
                            v3 = ji.ktxn("kvtj", ktyv(int ), (int)252);
                            continue block68;
                        }
                        case 733325436: {
                            break block68;
                        }
                        case 949949927: {
                            v3 = ji.ktxn("kvtl", ktyv(int ), (int)253);
                            continue block68;
                        }
                        case 1502582357: {
                            v3 = ji.ktxn("kvtm", ktyv(int ), (int)254);
                            continue block68;
                        }
                    }
                    break;
                }
                var18_13 = ji.a;
                if (var20_11) {
                    throw null;
lbl40:
                    // 9 sources

                    return;
                }
                if (var18_13 || var18_13) ** GOTO lbl40
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kvtp", ktyv(int ), (int)255)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ji.ktxn("kvtq", ktxk(int ), (int)608)) break;
                    v4 /* !! */  = (long)ji.ktxn("kvts", ktxk(int ), (int)609);
                }
                v5 /* !! */  = ji.tf;
                if (true) ** GOTO lbl52
                block71: while (true) {
                    v5 /* !! */  = (long)(v6 - ji.ktxn("kvtt", ktyv(int ), (int)256));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1744277136: {
                            v6 = ji.ktxn("kvtu", ktyv(int ), (int)257);
                            continue block71;
                        }
                        case -445913367: {
                            v6 = ji.ktxn("kvtv", ktyv(int ), (int)258);
                            continue block71;
                        }
                        case 429331337: {
                            v6 = ji.ktxn("kvtw", ktyv(int ), (int)259);
                            continue block71;
                        }
                        case 733325436: {
                            break block71;
                        }
                    }
                    break;
                }
                if (this.isFree(var1_2, var3_3, var5_4, this.spawnPos)) break block98;
                if (var18_13 || var18_13) ** GOTO lbl40
                return;
            }
            if (var18_13 || var18_13) ** GOTO lbl40
            v7 /* !! */  = ji.tf;
            if (true) ** GOTO lbl73
            block72: while (true) {
                v7 /* !! */  = (long)(v8 - ji.ktxn("kvtx", ktyv(int ), (int)260));
lbl73:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 733325436: {
                        break block72;
                    }
                    case 1620957407: {
                        v8 = ji.ktxn("kvty", ktyv(int ), (int)261);
                        continue block72;
                    }
                    case 2043421051: {
                        v8 = ji.ktxn("kvtz", ktyv(int ), (int)262);
                        continue block72;
                    }
                }
                break;
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kvua", ktyv(int ), (int)263)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == ji.ktxn("kvub", ktxk(int ), (int)610)) break;
                v9 /* !! */  = (long)ji.ktxn("kvuc", ktxk(int ), (int)611);
            }
            var17_14 = this.particlePool.pollFirst();
            if (var18_13 || var18_13) ** GOTO lbl40
            if (var17_14 != null) break block99;
            if (var18_13 || var18_13) ** GOTO lbl40
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kvud", ktyv(int ), (int)264)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == ji.ktxn("kvue", ktxk(int ), (int)612)) break;
                v10 /* !! */  = (long)ji.ktxn("kvuf", ktxk(int ), (int)613);
            }
            v11 /* !! */  = ji.tf;
            if (true) ** GOTO lbl100
            block75: while (true) {
                v11 /* !! */  = (long)(v12 - ji.ktxn("kvuh", ktyv(int ), (int)265));
lbl100:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 122751897: {
                        v12 = ji.ktxn("kvuj", ktyv(int ), (int)266);
                        continue block75;
                    }
                    case 733325436: {
                        break block75;
                    }
                    case 881543985: {
                        v12 = ji.ktxn("kvul", ktyv(int ), (int)267);
                        continue block75;
                    }
                }
                break;
            }
            var17_14 = new ji$GlowParticle();
            if (var18_13) ** GOTO lbl40
        }
        if (var18_13 || var18_13) ** GOTO lbl40
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kvup", ktyv(int ), (int)268)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ji.ktxn("kvur", ktxk(int ), (int)614)) break;
            v13 /* !! */  = (long)ji.ktxn("kvut", ktxk(int ), (int)615);
        }
        v14 = ThreadLocalRandom.current();
        v15 /* !! */  = ji.tf;
        if (true) ** GOTO lbl123
        block77: while (true) {
            v15 /* !! */  = (long)(v16 - ji.ktxn("kvuv", ktyv(int ), (int)269));
lbl123:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -261490606: {
                    v16 = ji.ktxn("kvuw", ktyv(int ), (int)270);
                    continue block77;
                }
                case 554606370: {
                    v16 = ji.ktxn("kvuy", ktyv(int ), (int)271);
                    continue block77;
                }
                case 733325436: {
                    break block77;
                }
                case 917526013: {
                    v16 = ji.ktxn("kvva", ktyv(int ), (int)272);
                    continue block77;
                }
            }
            break;
        }
        v17 = v14.nextFloat() * ji.ktxn("kvvc", ktxr(int ), (int)616);
        v18 = ji.ktxn("kvve", ktxk(int ), (int)617);
        v19 /* !! */  = ji.tf;
        if (true) ** GOTO lbl141
        block78: while (true) {
            v19 /* !! */  = (long)(ji.ktxn("kvvh", ktyv(int ), (int)274) - ji.ktxn("kvvg", ktyv(int ), (int)273));
lbl141:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -2075428212: {
                    continue block78;
                }
                case 733325436: {
                    break block78;
                }
            }
            break;
        }
        var17_14.reset(var1_2, var3_3, var5_4, var7_5, var9_6, var11_7, var13_8, v17, var14_9, (boolean)v18, var15_10, var16_1);
        if (var18_13 || var18_13) ** GOTO lbl40
        if (var19_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var19_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v20 /* !! */  = ji.tf;
                if (true) ** GOTO lbl155
                block79: while (true) {
                    v20 /* !! */  = (long)(ji.ktxn("kvvn", ktyv(int ), (int)276) - ji.ktxn("kvvl", ktyv(int ), (int)275));
lbl155:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 733325436: {
                            break block79;
                        }
                        case 1594379397: {
                            continue block79;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kvvq", ktyv(int ), (int)277)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ji.ktxn("kvvr", ktxk(int ), (int)618)) break;
                    v21 /* !! */  = (long)ji.ktxn("kvvs", ktxk(int ), (int)619);
                }
                this.particles.add(var17_14);
                if (!var18_13 && !var18_13) ** break;
                ** continue;
                return;
            }
            case 0: {
                var19_12 /* !! */  = (int)ji.ktxn("kvvv", ktxk(int ), (int)620);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 1: {
                var19_12 /* !! */  = (int)ji.ktxn("kvvx", ktxk(int ), (int)621);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl179:
            // 4 sources

            case 2: {
                var19_12 /* !! */  = (int)ji.ktxn("kvvz", ktxk(int ), (int)622);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl184:
            // 4 sources

            case 3: {
                do {
                    var19_12 /* !! */  = (int)ji.ktxn("kvwb", ktxk(int ), (int)623);
                } while (!var20_11);
                throw null;
            }
            case 4: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwd", ktxk(int ), (int)624);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 5: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwf", ktxk(int ), (int)625);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 6: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwh", ktxk(int ), (int)626);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl204:
            // 2 sources

            case 7: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwj", ktxk(int ), (int)627);
                if (!var20_11) ** GOTO lbl184
                throw null;
            }
            case 8: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwl", ktxk(int ), (int)628);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl213:
            // 3 sources

            case 9: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwn", ktxk(int ), (int)629);
                if (var20_11) {
                    throw null;
                }
            }
            case 10: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwp", ktxk(int ), (int)630);
                if (var20_11) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl222:
            // 2 sources

            case 11: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwq", ktxk(int ), (int)631);
                if (!var20_11) ** GOTO lbl184
                throw null;
            }
lbl226:
            // 4 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var19_12 /* !! */  = (int)ji.ktxn("kvwr", ktxk(int ), (int)632);
                    if (!var20_11) ** GOTO lbl204
                    throw null;
                }
            }
lbl231:
            // 2 sources

            case 13: {
                var19_12 /* !! */  = (int)ji.ktxn("kvws", ktxk(int ), (int)633);
                if (!var20_11) ** GOTO lbl179
                throw null;
            }
            case 14: {
                do {
                    var19_12 /* !! */  = (int)ji.ktxn("kvwu", ktxk(int ), (int)634);
                } while (!var20_11);
                throw null;
            }
            case 15: {
                var19_12 /* !! */  = (int)ji.ktxn("kvwx", ktxk(int ), (int)635);
                if (!var20_11) ** GOTO lbl179
                throw null;
            }
            case 16: {
                var19_12 /* !! */  = (int)ji.ktxn("kvxa", ktxk(int ), (int)636);
                if (!var20_11) ** GOTO lbl184
                throw null;
            }
lbl248:
            // 2 sources

            case 17: {
                var19_12 /* !! */  = (int)ji.ktxn("kvxd", ktxk(int ), (int)637);
                if (!var20_11) ** GOTO lbl179
                throw null;
            }
lbl252:
            // 2 sources

            case 18: {
                var19_12 /* !! */  = (int)ji.ktxn("kvxf", ktxk(int ), (int)638);
                if (!var20_11) ** GOTO lbl213
                throw null;
            }
            case 19: 
        }
        var19_12 /* !! */  = (int)ji.ktxn("kvxh", ktxk(int ), (int)639);
        ** while (!var20_11)
lbl259:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyv() {
        ji.ktxm[100] = -1324112416;
        ji.ktxm[101] = -1928942412;
        ji.ktxm[102] = -905564738;
        ji.ktxm[103] = -718354454;
        ji.ktxm[104] = 2040759805;
        ji.ktxm[105] = 757674851;
        ji.ktxm[106] = 26310706;
        ji.ktxm[107] = -917845958;
        ji.ktxm[108] = 972454013;
        ji.ktxm[109] = -1481652874;
        ji.ktxm[110] = -2036742315;
        ji.ktxm[111] = -481555439;
        ji.ktxm[112] = -1249935158;
        ji.ktxm[113] = -1294481752;
        ji.ktxm[114] = 1409230282;
        ji.ktxm[115] = 691622004;
        ji.ktxm[116] = 523952235;
        ji.ktxm[117] = -777621956;
        ji.ktxm[118] = -1477365172;
        ji.ktxm[119] = -653632160;
        ji.ktxm[120] = -1897302906;
        ji.ktxm[121] = 1105473584;
        ji.ktxm[122] = 1282384589;
        ji.ktxm[123] = -631098334;
        ji.ktxm[124] = 1080420262;
        ji.ktxm[125] = 1456014769;
        ji.ktxm[126] = 1588418018;
        ji.ktxm[127] = 1703759589;
        ji.ktxm[128] = -1247590012;
        ji.ktxm[129] = -2144636522;
        ji.ktxm[130] = 1419548032;
        ji.ktxm[131] = -942623232;
        ji.ktxm[132] = -1957394668;
        ji.ktxm[133] = -45511373;
        ji.ktxm[134] = 24625888;
        ji.ktxm[135] = 1365355490;
        ji.ktxm[136] = -2135994274;
        ji.ktxm[137] = 174655607;
        ji.ktxm[138] = 813069578;
        ji.ktxm[139] = -957267302;
        ji.ktxm[140] = -1079244296;
        ji.ktxm[141] = -77617637;
        ji.ktxm[142] = -72280480;
        ji.ktxm[143] = 1426780228;
        ji.ktxm[144] = 1659197184;
        ji.ktxm[145] = 47843355;
        ji.ktxm[146] = -1331110035;
        ji.ktxm[147] = 2117779441;
        ji.ktxm[148] = 667780251;
        ji.ktxm[149] = -1766409755;
        ji.ktxm[150] = -1591439515;
        ji.ktxm[151] = -1071030505;
        ji.ktxm[152] = 762473494;
        ji.ktxm[153] = -399097117;
        ji.ktxm[154] = 427349513;
        ji.ktxm[155] = 1329858078;
        ji.ktxm[156] = -831310113;
        ji.ktxm[157] = 682639803;
        ji.ktxm[158] = 986546903;
        ji.ktxm[159] = -1349466823;
        ji.ktxm[160] = -904112054;
        ji.ktxm[161] = 1704123588;
        ji.ktxm[162] = 1759026791;
        ji.ktxm[163] = -1504171012;
        ji.ktxm[164] = 1789058961;
        ji.ktxm[165] = 788809141;
        ji.ktxm[166] = -622381545;
        ji.ktxm[167] = -720808400;
        ji.ktxm[168] = 120874525;
        ji.ktxm[169] = 803528879;
        ji.ktxm[170] = -1385066077;
        ji.ktxm[171] = -925735320;
        ji.ktxm[172] = -302403682;
        ji.ktxm[173] = -631839234;
        ji.ktxm[174] = -942397500;
        ji.ktxm[175] = 1202153359;
        ji.ktxm[176] = -280021429;
        ji.ktxm[177] = 1572085887;
        ji.ktxm[178] = 1563899696;
        ji.ktxm[179] = 785808417;
        ji.ktxm[180] = 584689170;
        ji.ktxm[181] = -6685320;
        ji.ktxm[182] = 1437594425;
        ji.ktxm[183] = 1111366086;
        ji.ktxm[184] = 18799784;
        ji.ktxm[185] = 212781010;
        ji.ktxm[186] = -2128023683;
        ji.ktxm[187] = 773560519;
        ji.ktxm[188] = 885986797;
        ji.ktxm[189] = -343264032;
        ji.ktxm[190] = 453426732;
        ji.ktxm[191] = 1051772763;
        ji.ktxm[192] = 1952752801;
        ji.ktxm[193] = -56192128;
        ji.ktxm[194] = 2106994042;
        ji.ktxm[195] = -1337593863;
        ji.ktxm[196] = 1335158359;
        ji.ktxm[197] = 1098553960;
        ji.ktxm[198] = -1204897164;
        ji.ktxm[199] = -342764593;
    }

    static {
        ktxl = new int[1182];
        ktxm = new int[1182];
        ji.kxyi();
        ji.kxyj();
        ji.kxyk();
        ji.kxyl();
        ji.kxym();
        ji.kxyn();
        ji.kxyo();
        ji.kxyp();
        ji.kxyq();
        ji.kxyr();
        ji.kxys();
        ji.kxyt();
        ji.kxyu();
        ji.kxyv();
        ji.kxyw();
        ji.kxyx();
        ji.kxyy();
        ji.kxyz();
        ji.kxza();
        ji.kxzb();
        ji.kxzc();
        ji.kxzd();
        ji.kxze();
        ji.kxzf();
        ktyw = new long[548];
        ktyx = new long[548];
        ji.kxzg();
        ji.kxzh();
        ji.kxzi();
        ji.kxzj();
        ji.kxzk();
        ji.kxzl();
        ji.kxzm();
        ji.kxzn();
        ji.kxzo();
        ji.kxzp();
        ji.kxzq();
        ji.kxzr();
        DOLLAR_TEXTURE = class_2960.method_60655((String)"phobia", (String)"particles/dollar.png");
        PUMPKIN_TEXTURE = class_2960.method_60655((String)"phobia", (String)"particles/pumpkin.png");
        SNOWFLAKE_TEXTURE = class_2960.method_60655((String)"phobia", (String)"particles/snowflake.png");
        HEART_TEXTURE = class_2960.method_60655((String)"phobia", (String)"particles/heart.png");
        STAR_TEXTURE = class_2960.method_60655((String)"phobia", (String)"particles/star.png");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void render() {
        block162: {
            var14_1 = ji.c;
            var13_2 /* !! */  = ji.b;
            var12_3 = ji.a;
            if (var14_1) {
                throw null;
lbl6:
                // 42 sources

                return;
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            if (!this.particles.isEmpty()) break block162;
            if (var12_3 || var12_3) ** GOTO lbl6
            return;
        }
        if (var12_3 || var12_3) ** GOTO lbl6
        var1_4 = null;
        if (var12_3 || var12_3) ** GOTO lbl6
        var2_5 = gk.getInstance();
        if (var12_3) ** GOTO lbl6
        if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_3) ** GOTO lbl6
                if (var2_5 == null) ** GOTO lbl29
                if (var12_3 || var12_3) ** GOTO lbl6
                var2_5.getColorAt(0.0f, (int)ji.ktxn("kwro", ktxk(int ), (int)783));
                if (var12_3 || var12_3) ** GOTO lbl6
                var1_4 = var2_5.selectedPalette();
                if (var12_3) ** GOTO lbl6
lbl29:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var3_6 = this.selectedTexture();
                if (var12_3 || var12_3) ** GOTO lbl6
                if (var3_6 != null) ** GOTO lbl38
                if (var12_3) ** GOTO lbl6
                v0 = ji.ktxn("kwrr", ktxk(int ), (int)784);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl40
lbl38:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                v0 = var4_7 = ji.ktxn("kwru", ktxk(int ), (int)785);
lbl40:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (var4_7 == false) ** GOTO lbl48
                if (var12_3 || var12_3) ** GOTO lbl6
                lt.begin((boolean)ji.ktxn("kwrw", ktxk(int ), (int)786));
                if (var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl51
lbl48:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                lr.begin(var3_6, (boolean)ji.ktxn("kwrz", ktxk(int ), (int)787));
                if (var12_3) ** GOTO lbl6
lbl51:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var5_8 = this.particles.iterator();
                if (var12_3) ** GOTO lbl6
                do {
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (!var5_8.hasNext()) ** GOTO lbl105
                    if (var12_3) ** GOTO lbl6
                    var6_9 = var5_8.next();
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var7_10 = var6_9.age / var6_9.maxAge;
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var6_9.kind != ji$ParticleKind.AMBIENT) ** GOTO lbl70
                    if (var12_3) ** GOTO lbl6
                    if (!var6_9.falling) ** GOTO lbl70
                    if (var12_3 || var12_3) ** GOTO lbl6
                    v1 = ji.smoothStep(0.0f, (float)ji.ktxn("kwsg", ktxr(int ), (int)788), var7_10);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl85
lbl70:
                    // 2 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var6_9.kind == ji$ParticleKind.AMBIENT) {
                        v2 = ji.ktxn("kwsj", ktxr(int ), (int)789);
                        if (var14_1) {
                            throw null;
                        }
                    } else {
                        v2 = ji.ktxn("kwsl", ktxr(int ), (int)790);
                    }
                    v3 = ji.smoothStep(0.0f, (float)v2, var7_10);
                    if (var6_9.kind == ji$ParticleKind.AMBIENT) {
                        v4 = ji.ktxn("kwsn", ktxr(int ), (int)791);
                        if (var14_1) {
                            throw null;
                        }
                    } else {
                        v4 = ji.ktxn("kwsp", ktxr(int ), (int)792);
                    }
                    v1 = var8_11 = v3 * (1.0f - ji.smoothStep((float)v4, 1.0f, var7_10));
lbl85:
                    // 2 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    var9_12 = ji.ktxn("kwsr", ktxr(int ), (int)793) + ji.ktxn("kwst", ktxr(int ), (int)794) * (float)Math.sin(var6_9.phase + var6_9.age * 2.0f);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    var10_13 = this.particleColor(var6_9, var7_10, var1_4);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    if (var4_7 == false) ** GOTO lbl97
                    if (var12_3 || var12_3) ** GOTO lbl6
                    lt.glow(var6_9.x, var6_9.y, var6_9.z, var6_9.size * var9_12 * ji.ktxn("kwsz", ktxr(int ), (int)795), var10_13, var8_11 * ji.ktxn("kwta", ktxr(int ), (int)796));
                    if (var12_3) ** GOTO lbl6
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl102
lbl97:
                    // 1 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                    var11_14 = (float)Math.toDegrees(var6_9.phase) + var6_9.age * ji.ktxn("kwte", ktxr(int ), (int)797);
                    if (var12_3 || var12_3) ** GOTO lbl6
                    lr.sprite(var6_9.x, var6_9.y, var6_9.z, var6_9.size * var9_12 * ji.ktxn("kwth", ktxr(int ), (int)798), var11_14, var10_13, var8_11 * ji.ktxn("kwtj", ktxr(int ), (int)799));
                    if (var12_3) ** GOTO lbl6
lbl102:
                    // 2 sources

                    if (var12_3 || var12_3) ** GOTO lbl6
                } while (!var14_1);
                throw null;
lbl105:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (var4_7 == false) ** GOTO lbl113
                if (var12_3 || var12_3) ** GOTO lbl6
                lt.end();
                if (var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl116
lbl113:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                lr.end();
                if (var12_3) ** GOTO lbl6
lbl116:
                // 2 sources

                if (!var12_3 && !var12_3) ** break;
                ** continue;
                return;
            }
lbl119:
            // 2 sources

            case 0: {
                var13_2 /* !! */  = (int)ji.ktxn("kwtm", ktxk(int ), (int)800);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl124:
            // 2 sources

            case 1: {
                var13_2 /* !! */  = (int)ji.ktxn("kwtp", ktxk(int ), (int)801);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl129:
            // 2 sources

            case 2: {
                var13_2 /* !! */  = (int)ji.ktxn("kwtr", ktxk(int ), (int)802);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl134:
            // 2 sources

            case 3: {
                var13_2 /* !! */  = (int)ji.ktxn("kwtu", ktxk(int ), (int)803);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl139:
            // 2 sources

            case 4: {
                var13_2 /* !! */  = (int)ji.ktxn("kwtw", ktxk(int ), (int)804);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl144:
            // 3 sources

            case 5: {
                var13_2 /* !! */  = (int)ji.ktxn("kwty", ktxk(int ), (int)805);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl405
            }
            case 6: {
                var13_2 /* !! */  = (int)ji.ktxn("kwua", ktxk(int ), (int)806);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl154:
            // 5 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_2 /* !! */  = (int)ji.ktxn("kwud", ktxk(int ), (int)807);
                    if (var14_1) {
                        throw null;
                    }
                    ** GOTO lbl446
                    break;
                }
            }
            case 8: {
                var13_2 /* !! */  = (int)ji.ktxn("kwug", ktxk(int ), (int)808);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl165:
            // 2 sources

            case 9: {
                var13_2 /* !! */  = (int)ji.ktxn("kwui", ktxk(int ), (int)809);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl170:
            // 3 sources

            case 10: {
                var13_2 /* !! */  = (int)ji.ktxn("kwul", ktxk(int ), (int)810);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl175:
            // 3 sources

            case 11: {
                var13_2 /* !! */  = (int)ji.ktxn("kwuo", ktxk(int ), (int)811);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 12: {
                var13_2 /* !! */  = (int)ji.ktxn("kwuq", ktxk(int ), (int)812);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 13: {
                var13_2 /* !! */  = (int)ji.ktxn("kwut", ktxk(int ), (int)813);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl190:
            // 2 sources

            case 14: {
                var13_2 /* !! */  = (int)ji.ktxn("kwuw", ktxk(int ), (int)814);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl376
            }
            case 15: {
                var13_2 /* !! */  = (int)ji.ktxn("kwuy", ktxk(int ), (int)815);
                if (!var14_1) ** GOTO lbl154
                throw null;
            }
lbl199:
            // 2 sources

            case 16: {
                var13_2 /* !! */  = (int)ji.ktxn("kwva", ktxk(int ), (int)816);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl204:
            // 3 sources

            case 17: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvb", ktxk(int ), (int)817);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 18: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvc", ktxk(int ), (int)818);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
            case 19: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvd", ktxk(int ), (int)819);
                if (var14_1) {
                    throw null;
                }
            }
lbl218:
            // 4 sources

            case 20: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvf", ktxk(int ), (int)820);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl223:
            // 2 sources

            case 21: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvj", ktxk(int ), (int)821);
                if (!var14_1) ** GOTO lbl124
                throw null;
            }
            case 22: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvm", ktxk(int ), (int)822);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 23: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvo", ktxk(int ), (int)823);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl237:
            // 2 sources

            case 24: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvq", ktxk(int ), (int)824);
                if (!var14_1) ** GOTO lbl129
                throw null;
            }
            case 25: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvt", ktxk(int ), (int)825);
                if (!var14_1) ** GOTO lbl204
                throw null;
            }
lbl245:
            // 2 sources

            case 26: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvw", ktxk(int ), (int)826);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl250:
            // 2 sources

            case 27: {
                var13_2 /* !! */  = (int)ji.ktxn("kwvy", ktxk(int ), (int)827);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl255:
            // 3 sources

            case 28: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwb", ktxk(int ), (int)828);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 29: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwe", ktxk(int ), (int)829);
                if (!var14_1) ** GOTO lbl134
                throw null;
            }
lbl264:
            // 2 sources

            case 30: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwg", ktxk(int ), (int)830);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 31: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwi", ktxk(int ), (int)831);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl274:
            // 2 sources

            case 32: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwl", ktxk(int ), (int)832);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl279:
            // 2 sources

            case 33: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwn", ktxk(int ), (int)833);
                if (!var14_1) ** GOTO lbl274
                throw null;
            }
            case 34: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwq", ktxk(int ), (int)834);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 35: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwt", ktxk(int ), (int)835);
                if (!var14_1) ** GOTO lbl175
                throw null;
            }
lbl292:
            // 4 sources

            case 36: {
                var13_2 /* !! */  = (int)ji.ktxn("kwww", ktxk(int ), (int)836);
                if (!var14_1) ** GOTO lbl255
                throw null;
            }
lbl296:
            // 2 sources

            case 37: {
                var13_2 /* !! */  = (int)ji.ktxn("kwwy", ktxk(int ), (int)837);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl454
            }
lbl301:
            // 3 sources

            case 38: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxa", ktxk(int ), (int)838);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl306:
            // 2 sources

            case 39: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxc", ktxk(int ), (int)839);
                if (!var14_1) ** GOTO lbl245
                throw null;
            }
            case 40: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxe", ktxk(int ), (int)840);
                if (!var14_1) ** GOTO lbl170
                throw null;
            }
            case 41: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxh", ktxk(int ), (int)841);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl319:
            // 2 sources

            case 42: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxj", ktxk(int ), (int)842);
                if (!var14_1) ** GOTO lbl250
                throw null;
            }
lbl323:
            // 2 sources

            case 43: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxm", ktxk(int ), (int)843);
                if (!var14_1) ** GOTO lbl190
                throw null;
            }
lbl327:
            // 2 sources

            case 44: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxo", ktxk(int ), (int)844);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl332:
            // 3 sources

            case 45: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxr", ktxk(int ), (int)845);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl388
            }
            case 46: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxt", ktxk(int ), (int)846);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl446
            }
            case 47: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxw", ktxk(int ), (int)847);
                if (!var14_1) ** GOTO lbl139
                throw null;
            }
lbl346:
            // 2 sources

            case 48: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxy", ktxk(int ), (int)848);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl351:
            // 2 sources

            case 49: {
                var13_2 /* !! */  = (int)ji.ktxn("kwxz", ktxk(int ), (int)849);
                if (!var14_1) break;
                throw null;
            }
lbl355:
            // 2 sources

            case 50: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyb", ktxk(int ), (int)850);
                if (!var14_1) ** GOTO lbl223
                throw null;
            }
            case 51: {
                var13_2 /* !! */  = (int)ji.ktxn("kwye", ktxk(int ), (int)851);
                if (!var14_1) ** GOTO lbl264
                throw null;
            }
            case 52: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyh", ktxk(int ), (int)852);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 53: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyk", ktxk(int ), (int)853);
                if (!var14_1) ** GOTO lbl154
                throw null;
            }
lbl372:
            // 3 sources

            case 54: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyn", ktxk(int ), (int)854);
                if (!var14_1) ** GOTO lbl237
                throw null;
            }
lbl376:
            // 3 sources

            case 55: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyq", ktxk(int ), (int)855);
                if (var14_1) {
                    throw null;
                }
            }
lbl380:
            // 4 sources

            case 56: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyt", ktxk(int ), (int)856);
                if (!var14_1) ** GOTO lbl292
                throw null;
            }
            case 57: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyu", ktxk(int ), (int)857);
                if (!var14_1) break;
                throw null;
            }
lbl388:
            // 4 sources

            case 58: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyv", ktxk(int ), (int)858);
                if (!var14_1) ** GOTO lbl165
                throw null;
            }
lbl392:
            // 2 sources

            case 59: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyx", ktxk(int ), (int)859);
                if (!var14_1) ** GOTO lbl255
                throw null;
            }
            case 60: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyy", ktxk(int ), (int)860);
                if (!var14_1) ** GOTO lbl199
                throw null;
            }
lbl400:
            // 3 sources

            case 61: {
                var13_2 /* !! */  = (int)ji.ktxn("kwyz", ktxk(int ), (int)861);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl418
            }
lbl405:
            // 2 sources

            case 62: {
                var13_2 /* !! */  = (int)ji.ktxn("kwza", ktxk(int ), (int)862);
                if (!var14_1) ** GOTO lbl218
                throw null;
            }
            case 63: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzb", ktxk(int ), (int)863);
                if (!var14_1) ** GOTO lbl119
                throw null;
            }
lbl413:
            // 2 sources

            case 64: {
                do {
                    var13_2 /* !! */  = (int)ji.ktxn("kwzc", ktxk(int ), (int)864);
                } while (!var14_1);
                throw null;
            }
lbl418:
            // 2 sources

            case 65: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzd", ktxk(int ), (int)865);
                if (var14_1) {
                    throw null;
                }
            }
lbl422:
            // 4 sources

            case 66: {
                var13_2 /* !! */  = (int)ji.ktxn("kwze", ktxk(int ), (int)866);
                if (!var14_1) ** GOTO lbl296
                throw null;
            }
lbl426:
            // 2 sources

            case 67: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzf", ktxk(int ), (int)867);
                if (!var14_1) ** GOTO lbl154
                throw null;
            }
lbl430:
            // 2 sources

            case 68: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzg", ktxk(int ), (int)868);
                if (!var14_1) ** GOTO lbl346
                throw null;
            }
lbl434:
            // 2 sources

            case 69: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzj", ktxk(int ), (int)869);
                if (!var14_1) ** GOTO lbl292
                throw null;
            }
            case 70: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzn", ktxk(int ), (int)870);
                if (!var14_1) ** GOTO lbl144
                throw null;
            }
lbl442:
            // 2 sources

            case 71: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzq", ktxk(int ), (int)871);
                if (!var14_1) ** GOTO lbl434
                throw null;
            }
lbl446:
            // 5 sources

            case 72: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzu", ktxk(int ), (int)872);
                if (!var14_1) ** GOTO lbl154
                throw null;
            }
lbl450:
            // 2 sources

            case 73: {
                var13_2 /* !! */  = (int)ji.ktxn("kwzx", ktxk(int ), (int)873);
                if (!var14_1) ** GOTO lbl175
                throw null;
            }
lbl454:
            // 2 sources

            case 74: {
                var13_2 /* !! */  = (int)ji.ktxn("kxab", ktxk(int ), (int)874);
                if (!var14_1) ** GOTO lbl372
                throw null;
            }
            case 75: {
                var13_2 /* !! */  = (int)ji.ktxn("kxae", ktxk(int ), (int)875);
                if (!var14_1) ** GOTO lbl400
                throw null;
            }
            case 76: 
        }
        var13_2 /* !! */  = (int)ji.ktxn("kxai", ktxk(int ), (int)876);
        ** while (!var14_1)
lbl465:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = ji.tf;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - ji.ktxn("kuar", ktyv(int ), (int)21));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -777331378: {
                    v1 = ji.ktxn("kuas", ktyv(int ), (int)22);
                    continue block25;
                }
                case 354106457: {
                    v1 = ji.ktxn("kuat", ktyv(int ), (int)23);
                    continue block25;
                }
                case 733325436: {
                    break block25;
                }
                case 939667428: {
                    v1 = ji.ktxn("kuau", ktyv(int ), (int)24);
                    continue block25;
                }
            }
            break;
        }
        var3_1 = ji.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kuav", ktyv(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ji.ktxn("kuaw", ktxk(int ), (int)56)) break;
            v2 /* !! */  = (long)ji.ktxn("kuax", ktxk(int ), (int)57);
        }
        var2_2 /* !! */  = ji.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kuay", ktyv(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ji.ktxn("kuaz", ktxk(int ), (int)58)) break;
            v3 /* !! */  = (long)ji.ktxn("kuba", ktxk(int ), (int)59);
        }
        var1_3 = ji.a;
        if (var3_1) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v4 /* !! */  = ji.tf;
        if (true) ** GOTO lbl41
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - ji.ktxn("kubb", ktyv(int ), (int)27));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 255742492: {
                    v5 = ji.ktxn("kubc", ktyv(int ), (int)28);
                    continue block29;
                }
                case 733325436: {
                    break block29;
                }
                case 1542178211: {
                    v5 = ji.ktxn("kubd", ktyv(int ), (int)29);
                    continue block29;
                }
            }
            break;
        }
        ax.unregister(this);
        if (var1_3 || var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 /* !! */  = ji.tf;
                if (true) ** GOTO lbl59
                block30: while (true) {
                    v6 /* !! */  = (long)(ji.ktxn("kubf", ktyv(int ), (int)31) - ji.ktxn("kube", ktyv(int ), (int)30));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1271961765: {
                            continue block30;
                        }
                        case 733325436: {
                            break block30;
                        }
                    }
                    break;
                }
                this.recycleParticles();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ji.ktxn("kubg", ktxk(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
            }
lbl71:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ji.ktxn("kubh", ktxk(int ), (int)61);
                if (var3_1) {
                    throw null;
                }
            }
lbl75:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ji.ktxn("kubi", ktxk(int ), (int)62);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kubj", ktxk(int ), (int)63);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ji.ktxn("kubk", ktxk(int ), (int)64);
                if (!var3_1) break;
                throw null;
            }
lbl88:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ji.ktxn("kubl", ktxk(int ), (int)65);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ji.ktxn("kubm", ktxk(int ), (int)66);
                    if (!var3_1) ** GOTO lbl88
                    throw null;
                }
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ji.ktxn("kubn", ktxk(int ), (int)67);
        ** while (!var3_1)
lbl100:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kxyw() {
        ji.ktxm[200] = 1597677640;
        ji.ktxm[201] = -1455903724;
        ji.ktxm[202] = -1408875057;
        ji.ktxm[203] = 186801893;
        ji.ktxm[204] = 1192641241;
        ji.ktxm[205] = -226896608;
        ji.ktxm[206] = -414431254;
        ji.ktxm[207] = 1790177658;
        ji.ktxm[208] = -504831678;
        ji.ktxm[209] = 137848840;
        ji.ktxm[210] = -768394285;
        ji.ktxm[211] = -793737184;
        ji.ktxm[212] = -280610862;
        ji.ktxm[213] = -582827094;
        ji.ktxm[214] = -355926723;
        ji.ktxm[215] = 348160829;
        ji.ktxm[216] = -771011682;
        ji.ktxm[217] = -1127464534;
        ji.ktxm[218] = 410782103;
        ji.ktxm[219] = 500544961;
        ji.ktxm[220] = -798912772;
        ji.ktxm[221] = -1570917930;
        ji.ktxm[222] = 1479614056;
        ji.ktxm[223] = 1412689864;
        ji.ktxm[224] = -160722570;
        ji.ktxm[225] = -564915818;
        ji.ktxm[226] = -1367993606;
        ji.ktxm[227] = 83669451;
        ji.ktxm[228] = -457116428;
        ji.ktxm[229] = -1810545599;
        ji.ktxm[230] = -311636967;
        ji.ktxm[231] = 1860898577;
        ji.ktxm[232] = 1691488538;
        ji.ktxm[233] = -981959509;
        ji.ktxm[234] = 193669146;
        ji.ktxm[235] = -984404990;
        ji.ktxm[236] = 2008470424;
        ji.ktxm[237] = -299175212;
        ji.ktxm[238] = -1145070950;
        ji.ktxm[239] = 789935653;
        ji.ktxm[240] = -1971869193;
        ji.ktxm[241] = -488488992;
        ji.ktxm[242] = 1221834294;
        ji.ktxm[243] = 743069122;
        ji.ktxm[244] = 104709232;
        ji.ktxm[245] = 1120901029;
        ji.ktxm[246] = -532224790;
        ji.ktxm[247] = 1909853289;
        ji.ktxm[248] = 1314285636;
        ji.ktxm[249] = 271676415;
        ji.ktxm[250] = -2129321122;
        ji.ktxm[251] = -604592221;
        ji.ktxm[252] = 1970299501;
        ji.ktxm[253] = 285887627;
        ji.ktxm[254] = 472507869;
        ji.ktxm[255] = -1402017135;
        ji.ktxm[256] = 368494575;
        ji.ktxm[257] = -421861471;
        ji.ktxm[258] = 1281345591;
        ji.ktxm[259] = 2023426555;
        ji.ktxm[260] = 206514784;
        ji.ktxm[261] = 469517953;
        ji.ktxm[262] = -1477388312;
        ji.ktxm[263] = 1242338728;
        ji.ktxm[264] = 1582129323;
        ji.ktxm[265] = 707764427;
        ji.ktxm[266] = 1319033977;
        ji.ktxm[267] = -890559761;
        ji.ktxm[268] = -1844633584;
        ji.ktxm[269] = 2087592756;
        ji.ktxm[270] = 980238886;
        ji.ktxm[271] = 891063438;
        ji.ktxm[272] = 1524474222;
        ji.ktxm[273] = 409560439;
        ji.ktxm[274] = 708610752;
        ji.ktxm[275] = -1475290183;
        ji.ktxm[276] = -1964255548;
        ji.ktxm[277] = 1036569480;
        ji.ktxm[278] = 1211197652;
        ji.ktxm[279] = -499437962;
        ji.ktxm[280] = -669256459;
        ji.ktxm[281] = -1589688817;
        ji.ktxm[282] = -540022515;
        ji.ktxm[283] = 302133031;
        ji.ktxm[284] = 1917539786;
        ji.ktxm[285] = 1800939028;
        ji.ktxm[286] = 592793046;
        ji.ktxm[287] = 1267200360;
        ji.ktxm[288] = 624948797;
        ji.ktxm[289] = 898693110;
        ji.ktxm[290] = -1688108733;
        ji.ktxm[291] = 106055707;
        ji.ktxm[292] = -920972044;
        ji.ktxm[293] = 2135005601;
        ji.ktxm[294] = 28000561;
        ji.ktxm[295] = 81389760;
        ji.ktxm[296] = -579291893;
        ji.ktxm[297] = -1909260289;
        ji.ktxm[298] = -175609429;
        ji.ktxm[299] = -241700855;
    }

    private static /* synthetic */ void kxzm() {
        ji.ktyx[0] = -5529271698027922209L;
        ji.ktyx[1] = -410007118584737260L;
        ji.ktyx[2] = -6860756215377547740L;
        ji.ktyx[3] = -4193101033785396823L;
        ji.ktyx[4] = 737750023606082037L;
        ji.ktyx[5] = 1968103299550939462L;
        ji.ktyx[6] = 2865908849000335113L;
        ji.ktyx[7] = -9173546528075428043L;
        ji.ktyx[8] = -540917111723619837L;
        ji.ktyx[9] = 6738549692048443618L;
        ji.ktyx[10] = -9008245836516958292L;
        ji.ktyx[11] = -4571402227650293212L;
        ji.ktyx[12] = 1128074859419263178L;
        ji.ktyx[13] = 4915369742787863949L;
        ji.ktyx[14] = -5813039909756547077L;
        ji.ktyx[15] = 517743759582583694L;
        ji.ktyx[16] = -4108324827401004916L;
        ji.ktyx[17] = 2462915995690575368L;
        ji.ktyx[18] = -5047235357263379445L;
        ji.ktyx[19] = 6150788714487295142L;
        ji.ktyx[20] = 7926116921955752880L;
        ji.ktyx[21] = -5308874529858287255L;
        ji.ktyx[22] = 839215929916816542L;
        ji.ktyx[23] = 6256155480851857336L;
        ji.ktyx[24] = 7771362676857482503L;
        ji.ktyx[25] = -8368711884416674945L;
        ji.ktyx[26] = -2532454539643064279L;
        ji.ktyx[27] = 570853304605594568L;
        ji.ktyx[28] = 1214751949061348530L;
        ji.ktyx[29] = 704574969371872293L;
        ji.ktyx[30] = -7764517055489763359L;
        ji.ktyx[31] = 2458792387576672537L;
        ji.ktyx[32] = 1113721431734110417L;
        ji.ktyx[33] = -3942736146824706676L;
        ji.ktyx[34] = 8717966596462745463L;
        ji.ktyx[35] = 2256713784218905538L;
        ji.ktyx[36] = -990407362930328498L;
        ji.ktyx[37] = -8816788289016199520L;
        ji.ktyx[38] = -7379913386273364565L;
        ji.ktyx[39] = 5370179630550476349L;
        ji.ktyx[40] = -3319666529938404393L;
        ji.ktyx[41] = -7099234378227087304L;
        ji.ktyx[42] = -6795471980891925653L;
        ji.ktyx[43] = -4555854403945898055L;
        ji.ktyx[44] = -4873247962766079509L;
        ji.ktyx[45] = -1437592762057331271L;
        ji.ktyx[46] = -5014285247441862817L;
        ji.ktyx[47] = 6817463621659166385L;
        ji.ktyx[48] = 1995822740806133026L;
        ji.ktyx[49] = 8407830449839423380L;
        ji.ktyx[50] = 4959223241745450489L;
        ji.ktyx[51] = -5348924018509124761L;
        ji.ktyx[52] = -8352282015060121681L;
        ji.ktyx[53] = 4115286996379436094L;
        ji.ktyx[54] = 22933052590661753L;
        ji.ktyx[55] = -5630624897197042103L;
        ji.ktyx[56] = -2154109919355809010L;
        ji.ktyx[57] = -6685992274127641491L;
        ji.ktyx[58] = 4938334104859162745L;
        ji.ktyx[59] = -9107586922387216954L;
        ji.ktyx[60] = 5880907548259592199L;
        ji.ktyx[61] = -2687936396389488086L;
        ji.ktyx[62] = 5920948856583453365L;
        ji.ktyx[63] = 7276860116662749385L;
        ji.ktyx[64] = 414948886045605355L;
        ji.ktyx[65] = -745166803241989301L;
        ji.ktyx[66] = 4581902877108088499L;
        ji.ktyx[67] = 4940823776175169715L;
        ji.ktyx[68] = 5692705673288719297L;
        ji.ktyx[69] = -528202641374779165L;
        ji.ktyx[70] = 5791883744688988642L;
        ji.ktyx[71] = 2134785334227922007L;
        ji.ktyx[72] = 624278275412350479L;
        ji.ktyx[73] = 7487442038436041474L;
        ji.ktyx[74] = 763619812034391035L;
        ji.ktyx[75] = 478648238965296140L;
        ji.ktyx[76] = -936908360837361024L;
        ji.ktyx[77] = 3302151260182313253L;
        ji.ktyx[78] = -1770965104893575702L;
        ji.ktyx[79] = 7174640931753238019L;
        ji.ktyx[80] = 7212231247953407149L;
        ji.ktyx[81] = 2476156096356140240L;
        ji.ktyx[82] = 4359881121949562459L;
        ji.ktyx[83] = -6283956479962415479L;
        ji.ktyx[84] = -8506413557731407678L;
        ji.ktyx[85] = -4522564126291010323L;
        ji.ktyx[86] = -6696657445484876187L;
        ji.ktyx[87] = -7391490120200251652L;
        ji.ktyx[88] = 8812450881862269860L;
        ji.ktyx[89] = -6235114581042481988L;
        ji.ktyx[90] = 1281779447687817754L;
        ji.ktyx[91] = -6377543907557690566L;
        ji.ktyx[92] = 482408924276721222L;
        ji.ktyx[93] = -8230284342694026034L;
        ji.ktyx[94] = -8052925727796702356L;
        ji.ktyx[95] = -5809444550994605635L;
        ji.ktyx[96] = -1974113673250694026L;
        ji.ktyx[97] = 7051207623520768693L;
        ji.ktyx[98] = 3663127551174439069L;
        ji.ktyx[99] = 1067408584330629665L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float smoothStep(float var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxxl", ktyv(int ), (int)539)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ji.ktxn("kxxm", ktxk(int ), (int)1168)) break;
            v0 /* !! */  = (long)ji.ktxn("kxxn", ktxk(int ), (int)1169);
        }
        var6_3 = ji.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxxo", ktyv(int ), (int)540)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ji.ktxn("kxxp", ktxk(int ), (int)1170)) break;
            v1 /* !! */  = (long)ji.ktxn("kxxq", ktxk(int ), (int)1171);
        }
        var5_4 /* !! */  = ji.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ji.tf;
                if (true) ** GOTO lbl22
                block20: while (true) {
                    v2 /* !! */  = (long)(v3 - ji.ktxn("kxxr", ktyv(int ), (int)541));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1047026686: {
                            v3 = ji.ktxn("kxxs", ktyv(int ), (int)542);
                            continue block20;
                        }
                        case 486744157: {
                            v3 = ji.ktxn("kxxt", ktyv(int ), (int)543);
                            continue block20;
                        }
                        case 733325436: {
                            break block20;
                        }
                    }
                    break;
                }
                var4_5 = ji.a;
                if (var6_3) {
                    throw null;
lbl34:
                    // 2 sources

                    return (float)ji.ktxn("kxxu", ktxr(int ), (int)1172);
                }
                if (var4_5 || var4_5) ** GOTO lbl34
                v4 = (var2_2 - var0) / (var1_1 - var0);
                v5 /* !! */  = ji.tf;
                if (true) ** GOTO lbl42
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - ji.ktxn("kxxv", ktyv(int ), (int)544));
lbl42:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1162972094: {
                            v6 = ji.ktxn("kxxw", ktyv(int ), (int)545);
                            continue block22;
                        }
                        case 733325436: {
                            break block22;
                        }
                        case 1687611092: {
                            v6 = ji.ktxn("kxxx", ktyv(int ), (int)546);
                            continue block22;
                        }
                    }
                    break;
                }
                v7 = Math.min(1.0f, v4);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxxy", ktyv(int ), (int)547)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ji.ktxn("kxxz", ktxk(int ), (int)1173)) break;
                    v8 /* !! */  = (long)ji.ktxn("kxya", ktxk(int ), (int)1174);
                }
                var3_6 = Math.max(0.0f, v7);
                if (var4_5 || var4_5) ** continue;
                return var3_6 * var3_6 * (ji.ktxn("kxyb", ktxr(int ), (int)1175) - 2.0f * var3_6);
            }
            case 0: {
                do {
                    var5_4 /* !! */  = (int)ji.ktxn("kxyc", ktxk(int ), (int)1176);
                } while (!var6_3);
                throw null;
            }
lbl66:
            // 2 sources

            case 1: {
                do {
                    var5_4 /* !! */  = (int)ji.ktxn("kxyd", ktxk(int ), (int)1177);
                } while (!var6_3);
                throw null;
            }
            case 2: {
                var5_4 /* !! */  = (int)ji.ktxn("kxye", ktxk(int ), (int)1178);
                if (!var6_3) ** GOTO lbl66
                throw null;
            }
lbl75:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)ji.ktxn("kxyf", ktxk(int ), (int)1179);
                if (var6_3) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ji.ktxn("kxyg", ktxk(int ), (int)1180);
                    if (!var6_3) ** GOTO lbl75
                    throw null;
                }
            }
            case 5: 
        }
        var5_4 /* !! */  = (int)ji.ktxn("kxyh", ktxk(int ), (int)1181);
        ** while (!var6_3)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ji() {
        var2_1 /* !! */  = ji.b;
        super("Particles", "\u0421\u043e\u0437\u0434\u0430\u0451\u0442 glow-\u0447\u0430\u0441\u0442\u0438\u0446\u044b \u0432 \u043c\u0438\u0440\u0435, \u0437\u0430 \u0436\u0435\u043c\u0447\u0443\u0433\u043e\u043c \u0438 \u043f\u0440\u0438 \u043a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0445 \u0443\u0434\u0430\u0440\u0430\u0445", du.RENDER);
        this.particles = new ArrayList<ji$GlowParticle>((int)ji.ktxn("ktxo", ktxk(int ), (int)0));
        this.particlePool = new ArrayDeque<E>((int)ji.ktxn("ktxp", ktxk(int ), (int)1));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.collisionPos = new class_2338.class_2339();
                this.spawnPos = new class_2338.class_2339();
                this.collisionCache = new Long2ByteOpenHashMap((int)ji.ktxn("ktxq", ktxk(int ), (int)2));
                this.reasons = new ke("\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0442\u044c \u043f\u0440\u0438", "\u0423\u0441\u043b\u043e\u0432\u0438\u044f \u043f\u043e\u044f\u0432\u043b\u0435\u043d\u0438\u044f \u0447\u0430\u0441\u0442\u0438\u0446").value(new String[]{"\u0411\u0435\u0437\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435", "\u0411\u0440\u043e\u0441\u043e\u043a \u043f\u0435\u0440\u043b\u0430", "\u041a\u0440\u0438\u0442 \u0443\u0434\u0430\u0440", "\u0421\u043d\u043e\u0441 \u0442\u043e\u0442\u0435\u043c\u0430"}).selected(new String[]{"\u0411\u0435\u0437\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435"});
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0424\u0438\u0437\u0438\u043a\u0430 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0447\u0430\u0441\u0442\u0438\u0446", "\u0412\u0437\u043b\u0451\u0442", new String[]{"\u0412\u0437\u043b\u0451\u0442", "\u041f\u0430\u0434\u0435\u043d\u0438\u0435"});
                this.texture = new kf("\u0422\u0435\u043a\u0441\u0442\u0443\u0440\u0430", "\u0412\u043d\u0435\u0448\u043d\u0438\u0439 \u0432\u0438\u0434 \u0447\u0430\u0441\u0442\u0438\u0446", "\u041a\u0440\u0443\u0436\u043e\u0447\u043a\u0438", new String[]{"\u041a\u0440\u0443\u0436\u043e\u0447\u043a\u0438", "\u0414\u043e\u043b\u043b\u0430\u0440\u044b", "\u0422\u044b\u043a\u0432\u044b", "\u0421\u043d\u0435\u0436\u0438\u043d\u043a\u0438", "\u0421\u0435\u0440\u0434\u0446\u0430", "\u0417\u0432\u0451\u0437\u0434\u044b"});
                this.count = new kg("\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e", "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0447\u0430\u0441\u0442\u0438\u0446", (float)ji.ktxn("ktxs", ktxr(int ), (int)3)).range((int)ji.ktxn("ktxt", ktxk(int ), (int)4), (int)ji.ktxn("ktxu", ktxk(int ), (int)5));
                this.size = new kg("\u0420\u0430\u0437\u043c\u0435\u0440", "\u0420\u0430\u0437\u043c\u0435\u0440 Glow", (float)ji.ktxn("ktxv", ktxr(int ), (int)6)).range((float)ji.ktxn("ktxw", ktxr(int ), (int)7), (float)ji.ktxn("ktxx", ktxr(int ), (int)8)).step((float)ji.ktxn("ktxy", ktxr(int ), (int)9));
                this.radius = new kg("\u0420\u0430\u0434\u0438\u0443\u0441", "\u0420\u0430\u0434\u0438\u0443\u0441 \u043f\u043e\u044f\u0432\u043b\u0435\u043d\u0438\u044f \u0432\u043e\u043a\u0440\u0443\u0433 \u0438\u0433\u0440\u043e\u043a\u0430", (float)ji.ktxn("ktxz", ktxr(int ), (int)10)).range((int)ji.ktxn("ktya", ktxk(int ), (int)11), (int)ji.ktxn("ktyb", ktxk(int ), (int)12));
                this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0432\u0437\u043b\u0451\u0442\u0430 \u0438\u043b\u0438 \u043f\u0430\u0434\u0435\u043d\u0438\u044f", 1.0f).range((float)ji.ktxn("ktyc", ktxr(int ), (int)13), (float)ji.ktxn("ktyd", ktxr(int ), (int)14)).step((float)ji.ktxn("ktye", ktxr(int ), (int)15));
                this.settings(new jx[]{this.reasons, this.mode, this.texture, this.count, this.size, this.radius, this.speed});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyf", ktxk(int ), (int)16);
                ** GOTO lbl51
            }
            case 1: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyg", ktxk(int ), (int)17);
            }
lbl25:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyh", ktxk(int ), (int)18);
                ** GOTO lbl48
            }
            case 3: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyi", ktxk(int ), (int)19);
            }
lbl30:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ji.ktxn("ktyj", ktxk(int ), (int)20);
                    ** GOTO lbl40
                    break;
                }
            }
            case 5: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyk", ktxk(int ), (int)21);
                ** GOTO lbl57
            }
            case 6: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyl", ktxk(int ), (int)22);
                ** GOTO lbl30
            }
lbl40:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)ji.ktxn("ktym", ktxk(int ), (int)23);
                ** GOTO lbl30
            }
lbl43:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyn", ktxk(int ), (int)24);
            }
lbl45:
            // 3 sources

            case 9: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyo", ktxk(int ), (int)25);
                ** GOTO lbl43
            }
lbl48:
            // 3 sources

            case 10: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyp", ktxk(int ), (int)26);
                ** GOTO lbl45
            }
lbl51:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyq", ktxk(int ), (int)27);
                ** GOTO lbl25
            }
            case 12: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyr", ktxk(int ), (int)28);
                ** GOTO lbl48
            }
lbl57:
            // 3 sources

            case 13: {
                var2_1 /* !! */  = (int)ji.ktxn("ktys", ktxk(int ), (int)29);
                break;
            }
            case 14: {
                var2_1 /* !! */  = (int)ji.ktxn("ktyt", ktxk(int ), (int)30);
                ** GOTO lbl57
            }
            case 15: 
        }
        var2_1 /* !! */  = (int)ji.ktxn("ktyu", ktxk(int ), (int)31);
        ** while (true)
    }

    private static /* synthetic */ void kxzr() {
        ji.ktyx[500] = -701988896914879358L;
        ji.ktyx[501] = 3948197566579299531L;
        ji.ktyx[502] = 4777733990428507900L;
        ji.ktyx[503] = -6252110328930780609L;
        ji.ktyx[504] = -1866596309520230530L;
        ji.ktyx[505] = 5313134724785673594L;
        ji.ktyx[506] = 6477165443431644048L;
        ji.ktyx[507] = 5931048862903608718L;
        ji.ktyx[508] = -8105371887699334106L;
        ji.ktyx[509] = -2653510540920394994L;
        ji.ktyx[510] = 5472919809211740173L;
        ji.ktyx[511] = 3389023590099584597L;
        ji.ktyx[512] = 4313619656648258665L;
        ji.ktyx[513] = 526834149295666664L;
        ji.ktyx[514] = -599965801052510774L;
        ji.ktyx[515] = -3044826294703317941L;
        ji.ktyx[516] = 3166992810101494963L;
        ji.ktyx[517] = 5405619534105336217L;
        ji.ktyx[518] = 1669661369268789111L;
        ji.ktyx[519] = 248584159802194298L;
        ji.ktyx[520] = 6573911374960147145L;
        ji.ktyx[521] = 4666454847731910058L;
        ji.ktyx[522] = -8335894466776421113L;
        ji.ktyx[523] = -5789167104339153436L;
        ji.ktyx[524] = -8608078107975610587L;
        ji.ktyx[525] = 6401691867653216603L;
        ji.ktyx[526] = -4311465385412854694L;
        ji.ktyx[527] = 7672209595611339425L;
        ji.ktyx[528] = -5075784961980745208L;
        ji.ktyx[529] = 7333521833499678361L;
        ji.ktyx[530] = 7970181942982535799L;
        ji.ktyx[531] = 8167040025069741427L;
        ji.ktyx[532] = 8298508814029385014L;
        ji.ktyx[533] = 6006754999086766864L;
        ji.ktyx[534] = -931018186107099440L;
        ji.ktyx[535] = -2367279299205219026L;
        ji.ktyx[536] = -8527686819769558130L;
        ji.ktyx[537] = 2802923121723150176L;
        ji.ktyx[538] = -6480216445090160614L;
        ji.ktyx[539] = -5093888520127502045L;
        ji.ktyx[540] = 8843635074545472862L;
        ji.ktyx[541] = 1055176841285703377L;
        ji.ktyx[542] = -1316242182112588019L;
        ji.ktyx[543] = -7223733499182075908L;
        ji.ktyx[544] = 8423081963595334133L;
        ji.ktyx[545] = -4782246704118149798L;
        ji.ktyx[546] = 7510388957866312957L;
        ji.ktyx[547] = 7446885347305755704L;
    }

    private static /* synthetic */ void kxzd() {
        ji.ktxm[900] = -347239660;
        ji.ktxm[901] = 1854988766;
        ji.ktxm[902] = 81086384;
        ji.ktxm[903] = 876110968;
        ji.ktxm[904] = -369854995;
        ji.ktxm[905] = 25767028;
        ji.ktxm[906] = 1375417448;
        ji.ktxm[907] = -491539217;
        ji.ktxm[908] = -880399423;
        ji.ktxm[909] = -1216816252;
        ji.ktxm[910] = -1107017575;
        ji.ktxm[911] = 1605777964;
        ji.ktxm[912] = -312711164;
        ji.ktxm[913] = -403363468;
        ji.ktxm[914] = 2123657897;
        ji.ktxm[915] = -398663154;
        ji.ktxm[916] = 1399672649;
        ji.ktxm[917] = -1385763337;
        ji.ktxm[918] = 2019823287;
        ji.ktxm[919] = -1346983946;
        ji.ktxm[920] = -1710957827;
        ji.ktxm[921] = 1326972969;
        ji.ktxm[922] = 2121174595;
        ji.ktxm[923] = -369623822;
        ji.ktxm[924] = -2124860027;
        ji.ktxm[925] = -1015766072;
        ji.ktxm[926] = 1779201280;
        ji.ktxm[927] = -1830720813;
        ji.ktxm[928] = -2109858213;
        ji.ktxm[929] = 651164192;
        ji.ktxm[930] = -1616425081;
        ji.ktxm[931] = 2114709666;
        ji.ktxm[932] = -466310827;
        ji.ktxm[933] = 891337817;
        ji.ktxm[934] = 388803952;
        ji.ktxm[935] = -444324720;
        ji.ktxm[936] = 1250506347;
        ji.ktxm[937] = -283958751;
        ji.ktxm[938] = -1479139746;
        ji.ktxm[939] = 1757825403;
        ji.ktxm[940] = 283224311;
        ji.ktxm[941] = -656345818;
        ji.ktxm[942] = 1667730191;
        ji.ktxm[943] = 928888943;
        ji.ktxm[944] = -391196334;
        ji.ktxm[945] = 734665429;
        ji.ktxm[946] = 1851692772;
        ji.ktxm[947] = -1673028431;
        ji.ktxm[948] = -1834411415;
        ji.ktxm[949] = 1983687437;
        ji.ktxm[950] = 719001014;
        ji.ktxm[951] = -1259053866;
        ji.ktxm[952] = 129301955;
        ji.ktxm[953] = -1859839831;
        ji.ktxm[954] = 1952472842;
        ji.ktxm[955] = 1908555969;
        ji.ktxm[956] = 1549161641;
        ji.ktxm[957] = -565711876;
        ji.ktxm[958] = 1259033084;
        ji.ktxm[959] = 2144218512;
        ji.ktxm[960] = 1625832666;
        ji.ktxm[961] = -1971442741;
        ji.ktxm[962] = -1298985240;
        ji.ktxm[963] = 0xDAADAED;
        ji.ktxm[964] = -1071902620;
        ji.ktxm[965] = 925755433;
        ji.ktxm[966] = 1520037404;
        ji.ktxm[967] = 674505847;
        ji.ktxm[968] = 939443878;
        ji.ktxm[969] = -1389515158;
        ji.ktxm[970] = 425900269;
        ji.ktxm[971] = 1757318337;
        ji.ktxm[972] = -1719992236;
        ji.ktxm[973] = -830326991;
        ji.ktxm[974] = 805091947;
        ji.ktxm[975] = 123631684;
        ji.ktxm[976] = -1637393410;
        ji.ktxm[977] = -476090988;
        ji.ktxm[978] = -1976551613;
        ji.ktxm[979] = 894103251;
        ji.ktxm[980] = 2102928968;
        ji.ktxm[981] = 688429814;
        ji.ktxm[982] = -2019393892;
        ji.ktxm[983] = 1545528251;
        ji.ktxm[984] = 1644159130;
        ji.ktxm[985] = 417075030;
        ji.ktxm[986] = -315485581;
        ji.ktxm[987] = -557538997;
        ji.ktxm[988] = 1907046239;
        ji.ktxm[989] = 161535672;
        ji.ktxm[990] = -708874843;
        ji.ktxm[991] = 1756082087;
        ji.ktxm[992] = -1777941935;
        ji.ktxm[993] = 1709616662;
        ji.ktxm[994] = -2142533672;
        ji.ktxm[995] = 1769329883;
        ji.ktxm[996] = -28703495;
        ji.ktxm[997] = -840203726;
        ji.ktxm[998] = 452162422;
        ji.ktxm[999] = -751222072;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block113: {
            block112: {
                var9_2 = ji.c;
                var8_3 /* !! */  = ji.b;
                var7_4 = ji.a;
                if (var9_2) {
                    throw null;
lbl6:
                    // 30 sources

                    return;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                if (ji.mc.field_1724 == null) break block112;
                if (var7_4) ** GOTO lbl6
                if (ji.mc.field_1687 != null) break block113;
                if (var7_4) ** GOTO lbl6
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            this.recycleParticles();
            if (var7_4 || var7_4) ** GOTO lbl6
            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5 = this.isFallingMode();
        if (var7_4 || var7_4) ** GOTO lbl6
        if (var2_5 == this.lastFallingMode) ** GOTO lbl34
        if (var7_4 || var7_4) ** GOTO lbl6
        this.recycleParticles();
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                this.spawnAccumulator = 0.0f;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastFallingMode = var2_5;
                if (var7_4) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var3_6 = System.nanoTime();
                if (var7_4 || var7_4) ** GOTO lbl6
                var5_7 = Math.min((float)ji.ktxn("kubo", ktxr(int ), (int)68), Math.max(0.0f, (float)(var3_6 - this.lastFrameNanos) * ji.ktxn("kubp", ktxr(int ), (int)69)));
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastFrameNanos = var3_6;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.collisionCache.clear();
                if (var7_4 || var7_4) ** GOTO lbl6
                this.collisionCacheActive = ji.ktxn("kubq", ktxk(int ), (int)70);
                if (var7_4) ** GOTO lbl6
                try {
                    if (var7_4) ** GOTO lbl6
                    this.update(var5_7);
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (!this.reasons.isSelected("\u0411\u0435\u0437\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435")) ** GOTO lbl62
                    if (var7_4 || var7_4) ** GOTO lbl6
                    this.spawn(var5_7, var2_5);
                    if (var7_4) ** GOTO lbl6
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl65
                }
                catch (Throwable var6_8) {
                    if (var7_4 || var7_4) ** GOTO lbl6
                    this.collisionCacheActive = ji.ktxn("kubs", ktxk(int ), (int)72);
                    if (var7_4 || var7_4) ** GOTO lbl6
                    throw var6_8;
                }
lbl62:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.spawnAccumulator = 0.0f;
                if (var7_4) ** GOTO lbl6
lbl65:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.collisionCacheActive = ji.ktxn("kubr", ktxk(int ), (int)71);
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var9_2) {
                    throw null;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                this.render();
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
lbl76:
            // 2 sources

            case 0: {
                var8_3 /* !! */  = (int)ji.ktxn("kubt", ktxk(int ), (int)73);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 1: {
                var8_3 /* !! */  = (int)ji.ktxn("kubu", ktxk(int ), (int)74);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl86:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)ji.ktxn("kubv", ktxk(int ), (int)75);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl91:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)ji.ktxn("kubw", ktxk(int ), (int)76);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl96:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)ji.ktxn("kubx", ktxk(int ), (int)77);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 5: {
                var8_3 /* !! */  = (int)ji.ktxn("kuby", ktxk(int ), (int)78);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 6: {
                var8_3 /* !! */  = (int)ji.ktxn("kubz", ktxk(int ), (int)79);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl111:
            // 3 sources

            case 7: {
                do {
                    var8_3 /* !! */  = (int)ji.ktxn("kuca", ktxk(int ), (int)80);
                } while (!var9_2);
                throw null;
            }
lbl116:
            // 3 sources

            case 8: {
                var8_3 /* !! */  = (int)ji.ktxn("kucb", ktxk(int ), (int)81);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl121:
            // 3 sources

            case 9: {
                var8_3 /* !! */  = (int)ji.ktxn("kucc", ktxk(int ), (int)82);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 10: {
                var8_3 /* !! */  = (int)ji.ktxn("kucd", ktxk(int ), (int)83);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl131:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)ji.ktxn("kuce", ktxk(int ), (int)84);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl136:
            // 2 sources

            case 12: {
                var8_3 /* !! */  = (int)ji.ktxn("kucf", ktxk(int ), (int)85);
                if (!var9_2) ** GOTO lbl116
                throw null;
            }
lbl140:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)ji.ktxn("kucg", ktxk(int ), (int)86);
                if (!var9_2) ** GOTO lbl76
                throw null;
            }
lbl144:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)ji.ktxn("kuch", ktxk(int ), (int)87);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl149:
            // 2 sources

            case 15: {
                var8_3 /* !! */  = (int)ji.ktxn("kuci", ktxk(int ), (int)88);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 16: {
                var8_3 /* !! */  = (int)ji.ktxn("kucj", ktxk(int ), (int)89);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl159:
            // 5 sources

            case 17: {
                var8_3 /* !! */  = (int)ji.ktxn("kuck", ktxk(int ), (int)90);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 18: {
                var8_3 /* !! */  = (int)ji.ktxn("kucl", ktxk(int ), (int)91);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 19: {
                var8_3 /* !! */  = (int)ji.ktxn("kucm", ktxk(int ), (int)92);
                if (!var9_2) ** GOTO lbl86
                throw null;
            }
lbl173:
            // 2 sources

            case 20: {
                var8_3 /* !! */  = (int)ji.ktxn("kucn", ktxk(int ), (int)93);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl178:
            // 3 sources

            case 21: {
                var8_3 /* !! */  = (int)ji.ktxn("kuco", ktxk(int ), (int)94);
                if (!var9_2) ** GOTO lbl159
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)ji.ktxn("kucp", ktxk(int ), (int)95);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 23: {
                var8_3 /* !! */  = (int)ji.ktxn("kucq", ktxk(int ), (int)96);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 24: {
                var8_3 /* !! */  = (int)ji.ktxn("kucr", ktxk(int ), (int)97);
                if (!var9_2) ** GOTO lbl159
                throw null;
            }
lbl196:
            // 2 sources

            case 25: {
                var8_3 /* !! */  = (int)ji.ktxn("kucs", ktxk(int ), (int)98);
                if (!var9_2) ** GOTO lbl121
                throw null;
            }
lbl200:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)ji.ktxn("kuct", ktxk(int ), (int)99);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl205:
            // 3 sources

            case 27: {
                var8_3 /* !! */  = (int)ji.ktxn("kucu", ktxk(int ), (int)100);
                if (!var9_2) ** GOTO lbl144
                throw null;
            }
            case 28: {
                var8_3 /* !! */  = (int)ji.ktxn("kucv", ktxk(int ), (int)101);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl214:
            // 2 sources

            case 29: {
                var8_3 /* !! */  = (int)ji.ktxn("kucw", ktxk(int ), (int)102);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl219:
            // 2 sources

            case 30: {
                var8_3 /* !! */  = (int)ji.ktxn("kucx", ktxk(int ), (int)103);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl224:
            // 3 sources

            case 31: {
                var8_3 /* !! */  = (int)ji.ktxn("kucy", ktxk(int ), (int)104);
                if (!var9_2) ** GOTO lbl136
                throw null;
            }
            case 32: {
                var8_3 /* !! */  = (int)ji.ktxn("kucz", ktxk(int ), (int)105);
                if (!var9_2) ** GOTO lbl121
                throw null;
            }
            case 33: {
                var8_3 /* !! */  = (int)ji.ktxn("kuda", ktxk(int ), (int)106);
                if (var9_2) {
                    throw null;
                }
            }
            case 34: {
                var8_3 /* !! */  = (int)ji.ktxn("kudb", ktxk(int ), (int)107);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl241:
            // 3 sources

            case 35: {
                var8_3 /* !! */  = (int)ji.ktxn("kudc", ktxk(int ), (int)108);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl246:
            // 4 sources

            case 36: {
                var8_3 /* !! */  = (int)ji.ktxn("kudd", ktxk(int ), (int)109);
                if (!var9_2) ** GOTO lbl131
                throw null;
            }
            case 37: {
                var8_3 /* !! */  = (int)ji.ktxn("kude", ktxk(int ), (int)110);
                if (!var9_2) break;
                throw null;
            }
lbl254:
            // 2 sources

            case 38: {
                var8_3 /* !! */  = (int)ji.ktxn("kudf", ktxk(int ), (int)111);
                if (!var9_2) ** GOTO lbl173
                throw null;
            }
lbl258:
            // 2 sources

            case 39: {
                var8_3 /* !! */  = (int)ji.ktxn("kudg", ktxk(int ), (int)112);
                if (!var9_2) ** GOTO lbl96
                throw null;
            }
lbl262:
            // 2 sources

            case 40: {
                var8_3 /* !! */  = (int)ji.ktxn("kudh", ktxk(int ), (int)113);
                if (!var9_2) ** GOTO lbl200
                throw null;
            }
            case 41: {
                var8_3 /* !! */  = (int)ji.ktxn("kudi", ktxk(int ), (int)114);
                if (!var9_2) ** GOTO lbl111
                throw null;
            }
            case 42: {
                var8_3 /* !! */  = (int)ji.ktxn("kudj", ktxk(int ), (int)115);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 43: {
                var8_3 /* !! */  = (int)ji.ktxn("kudk", ktxk(int ), (int)116);
                if (!var9_2) ** GOTO lbl159
                throw null;
            }
lbl279:
            // 4 sources

            case 44: {
                var8_3 /* !! */  = (int)ji.ktxn("kudl", ktxk(int ), (int)117);
                if (!var9_2) ** GOTO lbl86
                throw null;
            }
lbl283:
            // 3 sources

            case 45: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)ji.ktxn("kudm", ktxk(int ), (int)118);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl317
                    break;
                }
            }
            case 46: {
                var8_3 /* !! */  = (int)ji.ktxn("kudn", ktxk(int ), (int)119);
                if (!var9_2) ** GOTO lbl205
                throw null;
            }
            case 47: {
                var8_3 /* !! */  = (int)ji.ktxn("kudo", ktxk(int ), (int)120);
                if (!var9_2) ** GOTO lbl111
                throw null;
            }
lbl297:
            // 2 sources

            case 48: {
                var8_3 /* !! */  = (int)ji.ktxn("kudp", ktxk(int ), (int)121);
                if (!var9_2) ** GOTO lbl116
                throw null;
            }
lbl301:
            // 2 sources

            case 49: {
                var8_3 /* !! */  = (int)ji.ktxn("kudq", ktxk(int ), (int)122);
                if (!var9_2) ** GOTO lbl219
                throw null;
            }
lbl305:
            // 2 sources

            case 50: {
                var8_3 /* !! */  = (int)ji.ktxn("kudr", ktxk(int ), (int)123);
                if (!var9_2) ** GOTO lbl279
                throw null;
            }
lbl309:
            // 3 sources

            case 51: {
                var8_3 /* !! */  = (int)ji.ktxn("kuds", ktxk(int ), (int)124);
                if (!var9_2) ** GOTO lbl91
                throw null;
            }
            case 52: {
                var8_3 /* !! */  = (int)ji.ktxn("kudt", ktxk(int ), (int)125);
                if (!var9_2) ** GOTO lbl246
                throw null;
            }
lbl317:
            // 3 sources

            case 53: {
                var8_3 /* !! */  = (int)ji.ktxn("kudu", ktxk(int ), (int)126);
                if (!var9_2) ** GOTO lbl224
                throw null;
            }
            case 54: 
        }
        var8_3 /* !! */  = (int)ji.ktxn("kudv", ktxk(int ), (int)127);
        ** while (!var9_2)
lbl324:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("ktyy", ktyv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ji.ktxn("ktyz", ktxk(int ), (int)32)) break;
            v0 /* !! */  = (long)ji.ktxn("ktza", ktxk(int ), (int)33);
        }
        var3_1 = ji.c;
        v1 /* !! */  = ji.tf;
        if (true) ** GOTO lbl11
        block43: while (true) {
            v1 /* !! */  = (long)(v2 - ji.ktxn("ktzb", ktyv(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1162438114: {
                    v2 = ji.ktxn("ktzc", ktyv(int ), (int)2);
                    continue block43;
                }
                case 242006351: {
                    v2 = ji.ktxn("ktzd", ktyv(int ), (int)3);
                    continue block43;
                }
                case 733325436: {
                    break block43;
                }
            }
            break;
        }
        var2_2 /* !! */  = ji.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("ktze", ktyv(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ji.ktxn("ktzf", ktxk(int ), (int)34)) break;
            v3 /* !! */  = (long)ji.ktxn("ktzg", ktxk(int ), (int)35);
        }
        var1_3 = ji.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl32:
                    // 6 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                v4 /* !! */  = ji.tf;
                if (true) ** GOTO lbl39
                block46: while (true) {
                    v4 /* !! */  = (long)(v5 - ji.ktxn("ktzh", ktyv(int ), (int)5));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -524301572: {
                            v5 = ji.ktxn("ktzi", ktyv(int ), (int)6);
                            continue block46;
                        }
                        case 733325436: {
                            break block46;
                        }
                        case 1349196595: {
                            v5 = ji.ktxn("ktzj", ktyv(int ), (int)7);
                            continue block46;
                        }
                    }
                    break;
                }
                this.recycleParticles();
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("ktzk", ktyv(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ji.ktxn("ktzl", ktxk(int ), (int)36)) break;
                    v6 /* !! */  = (long)ji.ktxn("ktzm", ktxk(int ), (int)37);
                }
                this.spawnAccumulator = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("ktzn", ktyv(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ji.ktxn("ktzo", ktxk(int ), (int)38)) break;
                    v7 /* !! */  = (long)ji.ktxn("ktzp", ktxk(int ), (int)39);
                }
                v8 = System.nanoTime();
                v9 /* !! */  = ji.tf;
                if (true) ** GOTO lbl67
                block49: while (true) {
                    v9 /* !! */  = (long)(v10 - ji.ktxn("ktzq", ktyv(int ), (int)10));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 733325436: {
                            break block49;
                        }
                        case 768941592: {
                            v10 = ji.ktxn("ktzr", ktyv(int ), (int)11);
                            continue block49;
                        }
                        case 1116644311: {
                            v10 = ji.ktxn("ktzs", ktyv(int ), (int)12);
                            continue block49;
                        }
                    }
                    break;
                }
                this.lastFrameNanos = v8;
                if (var1_3 || var1_3) ** GOTO lbl32
                v11 /* !! */  = ji.tf;
                if (true) ** GOTO lbl82
                block50: while (true) {
                    v11 /* !! */  = (long)(v12 - ji.ktxn("ktzt", ktyv(int ), (int)13));
lbl82:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1988952212: {
                            v12 = ji.ktxn("ktzu", ktyv(int ), (int)14);
                            continue block50;
                        }
                        case 733325436: {
                            break block50;
                        }
                        case 1434167569: {
                            v12 = ji.ktxn("ktzv", ktyv(int ), (int)15);
                            continue block50;
                        }
                        case 2098115928: {
                            v12 = ji.ktxn("ktzw", ktyv(int ), (int)16);
                            continue block50;
                        }
                    }
                    break;
                }
                v13 = this.isFallingMode();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("ktzx", ktyv(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ji.ktxn("ktzy", ktxk(int ), (int)40)) break;
                    v14 /* !! */  = (long)ji.ktxn("ktzz", ktxk(int ), (int)41);
                }
                this.lastFallingMode = v13;
                if (var1_3 || var1_3) ** GOTO lbl32
                v15 /* !! */  = ji.tf;
                if (true) ** GOTO lbl106
                block52: while (true) {
                    v15 /* !! */  = (long)(v16 - ji.ktxn("kuaa", ktyv(int ), (int)18));
lbl106:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 733325436: {
                            break block52;
                        }
                        case 1256703566: {
                            v16 = ji.ktxn("kuab", ktyv(int ), (int)19);
                            continue block52;
                        }
                        case 1883674891: {
                            v16 = ji.ktxn("kuac", ktyv(int ), (int)20);
                            continue block52;
                        }
                    }
                    break;
                }
                ax.register(this);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kuad", ktxk(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ji.ktxn("kuae", ktxk(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ji.ktxn("kuaf", ktxk(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 3: {
                var2_2 /* !! */  = (int)ji.ktxn("kuag", ktxk(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl137:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ji.ktxn("kuah", ktxk(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ji.ktxn("kuai", ktxk(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 6: {
                var2_2 /* !! */  = (int)ji.ktxn("kuaj", ktxk(int ), (int)48);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl151:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ji.ktxn("kuak", ktxk(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl156:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ji.ktxn("kual", ktxk(int ), (int)50);
                if (!var3_1) ** GOTO lbl151
                throw null;
            }
lbl160:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ji.ktxn("kuam", ktxk(int ), (int)51);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
lbl164:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ji.ktxn("kuan", ktxk(int ), (int)52);
                    if (!var3_1) ** GOTO lbl137
                    throw null;
                }
            }
lbl169:
            // 2 sources

            case 11: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kuao", ktxk(int ), (int)53);
                } while (!var3_1);
                throw null;
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kuap", ktxk(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)ji.ktxn("kuaq", ktxk(int ), (int)55);
        ** while (!var3_1)
lbl182:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block90: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kuiu", ktyv(int ), (int)98)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ji.ktxn("kuiv", ktxk(int ), (int)189)) break;
                v0 /* !! */  = (long)ji.ktxn("kuiw", ktxk(int ), (int)190);
            }
            var7_2 = ji.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kuix", ktyv(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ji.ktxn("kuiy", ktxk(int ), (int)191)) break;
                v1 /* !! */  = (long)ji.ktxn("kuiz", ktxk(int ), (int)192);
            }
            var6_3 /* !! */  = ji.b;
            v2 /* !! */  = ji.tf;
            if (true) ** GOTO lbl17
            block54: while (true) {
                v2 /* !! */  = (long)(v3 - ji.ktxn("kuja", ktyv(int ), (int)100));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 733325436: {
                        break block54;
                    }
                    case 1696840534: {
                        v3 = ji.ktxn("kujb", ktyv(int ), (int)101);
                        continue block54;
                    }
                    case 1749091855: {
                        v3 = ji.ktxn("kujc", ktyv(int ), (int)102);
                        continue block54;
                    }
                    case 2064550355: {
                        v3 = ji.ktxn("kujd", ktyv(int ), (int)103);
                        continue block54;
                    }
                }
                break;
            }
            var5_4 = ji.a;
            if (var7_2) {
                throw null;
lbl32:
                // 14 sources

                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kuje", ktyv(int ), (int)104)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ji.ktxn("kujf", ktxk(int ), (int)193)) break;
                v4 /* !! */  = (long)ji.ktxn("kujg", ktxk(int ), (int)194);
            }
            v5 = var1_1.getType();
            v6 /* !! */  = ji.tf;
            if (true) ** GOTO lbl45
            block57: while (true) {
                v6 /* !! */  = (long)(ji.ktxn("kuji", ktyv(int ), (int)106) - ji.ktxn("kujh", ktyv(int ), (int)105));
lbl45:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1012632938: {
                        continue block57;
                    }
                    case 733325436: {
                        break block57;
                    }
                }
                break;
            }
            if (v5 == cr$Type.RECEIVE) break block90;
            if (var5_4) ** GOTO lbl32
            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kujj", ktyv(int ), (int)107)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ji.ktxn("kujk", ktxk(int ), (int)195)) break;
            v7 /* !! */  = (long)ji.ktxn("kujl", ktxk(int ), (int)196);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kujm", ktyv(int ), (int)108)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ji.ktxn("kujn", ktxk(int ), (int)197)) break;
            v8 /* !! */  = (long)ji.ktxn("kujo", ktxk(int ), (int)198);
        }
        if (!this.reasons.isSelected("\u0421\u043d\u043e\u0441 \u0442\u043e\u0442\u0435\u043c\u0430")) ** GOTO lbl-1000
        if (var5_4 || var5_4) ** GOTO lbl32
        v9 /* !! */  = ji.tf;
        if (true) ** GOTO lbl71
        block60: while (true) {
            v9 /* !! */  = (long)(v10 - ji.ktxn("kujp", ktyv(int ), (int)109));
lbl71:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1157413216: {
                    v10 = ji.ktxn("kujq", ktyv(int ), (int)110);
                    continue block60;
                }
                case -498322649: {
                    v10 = ji.ktxn("kujr", ktyv(int ), (int)111);
                    continue block60;
                }
                case 733325436: {
                    break block60;
                }
            }
            break;
        }
        var3_5 = var1_1.getPacket();
        if (var5_4) ** GOTO lbl32
        if (!(var3_5 instanceof class_2663)) ** GOTO lbl-1000
        if (var5_4) ** GOTO lbl32
        var2_6 = (class_2663)var3_5;
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kujs", ktyv(int ), (int)112)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ji.ktxn("kujt", ktxk(int ), (int)199)) break;
            v11 /* !! */  = (long)ji.ktxn("kuju", ktxk(int ), (int)200);
        }
        if (var2_6.method_11470() != ji.ktxn("kujv", ktxk(int ), (int)201)) ** GOTO lbl-1000
        if (var5_4) ** GOTO lbl32
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kujw", ktyv(int ), (int)113)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ji.ktxn("kujx", ktxk(int ), (int)202)) break;
            v12 /* !! */  = (long)ji.ktxn("kujy", ktxk(int ), (int)203);
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_7 = ji.tf - ji.ktxn("kujz", ktyv(int ), (int)114)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ji.ktxn("kuka", ktxk(int ), (int)204)) break;
            v13 /* !! */  = (long)ji.ktxn("kukb", ktxk(int ), (int)205);
        }
        if (ji.mc.field_1687 == null) ** GOTO lbl-1000
        if (var5_4 || var5_4) ** GOTO lbl32
        v14 /* !! */  = ji.tf;
        if (true) ** GOTO lbl109
        block64: while (true) {
            v14 /* !! */  = (long)(v15 - ji.ktxn("kukc", ktyv(int ), (int)115));
lbl109:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1841055886: {
                    v15 = ji.ktxn("kukd", ktyv(int ), (int)116);
                    continue block64;
                }
                case -474826987: {
                    v15 = ji.ktxn("kuke", ktyv(int ), (int)117);
                    continue block64;
                }
                case 733325436: {
                    break block64;
                }
            }
            break;
        }
        v16 /* !! */  = ji.tf;
        if (true) ** GOTO lbl122
        block65: while (true) {
            v16 /* !! */  = (long)(v17 - ji.ktxn("kukf", ktyv(int ), (int)118));
lbl122:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1574060580: {
                    v17 = ji.ktxn("kukg", ktyv(int ), (int)119);
                    continue block65;
                }
                case 733325436: {
                    break block65;
                }
                case 1626132409: {
                    v17 = ji.ktxn("kukh", ktyv(int ), (int)120);
                    continue block65;
                }
            }
            break;
        }
        v18 = ji.mc.field_1687;
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_8 = ji.tf - ji.ktxn("kuki", ktyv(int ), (int)121)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ji.ktxn("kukj", ktxk(int ), (int)206)) break;
            v19 /* !! */  = (long)ji.ktxn("kukk", ktxk(int ), (int)207);
        }
        var3_5 = var2_6.method_11469((class_1937)v18);
        if (var5_4 || var5_4) ** GOTO lbl32
        if (!(var3_5 instanceof class_1309)) ** GOTO lbl-1000
        if (var5_4) ** GOTO lbl32
        var4_7 = (class_1309)var3_5;
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_9 = ji.tf - ji.ktxn("kukl", ktyv(int ), (int)122)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == ji.ktxn("kukm", ktxk(int ), (int)208)) break;
            v20 /* !! */  = (long)ji.ktxn("kukn", ktxk(int ), (int)209);
        }
        this.spawnTotemBurst(var4_7);
        if (var5_4) ** GOTO lbl32
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 7 sources

            {
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)ji.ktxn("kuko", ktxk(int ), (int)210);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 1: {
                var6_3 /* !! */  = (int)ji.ktxn("kukp", ktxk(int ), (int)211);
                if (var7_2) {
                    throw null;
                }
            }
lbl165:
            // 4 sources

            case 2: {
                var6_3 /* !! */  = (int)ji.ktxn("kukq", ktxk(int ), (int)212);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl170:
            // 3 sources

            case 3: {
                var6_3 /* !! */  = (int)ji.ktxn("kukr", ktxk(int ), (int)213);
                if (!var7_2) break;
                throw null;
            }
            case 4: {
                var6_3 /* !! */  = (int)ji.ktxn("kuks", ktxk(int ), (int)214);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl179:
            // 3 sources

            case 5: {
                var6_3 /* !! */  = (int)ji.ktxn("kukt", ktxk(int ), (int)215);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 6: {
                do {
                    var6_3 /* !! */  = (int)ji.ktxn("kuku", ktxk(int ), (int)216);
                } while (!var7_2);
                throw null;
            }
            case 7: {
                var6_3 /* !! */  = (int)ji.ktxn("kukv", ktxk(int ), (int)217);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 8: {
                var6_3 /* !! */  = (int)ji.ktxn("kukw", ktxk(int ), (int)218);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 9: {
                do {
                    var6_3 /* !! */  = (int)ji.ktxn("kukx", ktxk(int ), (int)219);
                } while (!var7_2);
                throw null;
            }
lbl204:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)ji.ktxn("kuky", ktxk(int ), (int)220);
                if (!var7_2) break;
                throw null;
            }
lbl208:
            // 3 sources

            case 11: {
                do {
                    var6_3 /* !! */  = (int)ji.ktxn("kukz", ktxk(int ), (int)221);
                } while (!var7_2);
                throw null;
            }
            case 12: {
                var6_3 /* !! */  = (int)ji.ktxn("kula", ktxk(int ), (int)222);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl218:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)ji.ktxn("kulb", ktxk(int ), (int)223);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 14: {
                var6_3 /* !! */  = (int)ji.ktxn("kulc", ktxk(int ), (int)224);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl228:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)ji.ktxn("kuld", ktxk(int ), (int)225);
                if (!var7_2) ** GOTO lbl208
                throw null;
            }
lbl232:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)ji.ktxn("kule", ktxk(int ), (int)226);
                    if (!var7_2) ** GOTO lbl170
                    throw null;
                }
            }
lbl237:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)ji.ktxn("kulf", ktxk(int ), (int)227);
                if (!var7_2) ** GOTO lbl179
                throw null;
            }
lbl241:
            // 5 sources

            case 18: {
                var6_3 /* !! */  = (int)ji.ktxn("kulg", ktxk(int ), (int)228);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 19: {
                var6_3 /* !! */  = (int)ji.ktxn("kulh", ktxk(int ), (int)229);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 20: {
                var6_3 /* !! */  = (int)ji.ktxn("kuli", ktxk(int ), (int)230);
                if (!var7_2) ** GOTO lbl241
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)ji.ktxn("kulj", ktxk(int ), (int)231);
                if (!var7_2) ** GOTO lbl170
                throw null;
            }
lbl259:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)ji.ktxn("kulk", ktxk(int ), (int)232);
                if (!var7_2) ** GOTO lbl241
                throw null;
            }
lbl263:
            // 2 sources

            case 23: {
                var6_3 /* !! */  = (int)ji.ktxn("kull", ktxk(int ), (int)233);
                if (!var7_2) ** GOTO lbl165
                throw null;
            }
            case 24: 
        }
        var6_3 /* !! */  = (int)ji.ktxn("kulm", ktxk(int ), (int)234);
        ** while (!var7_2)
lbl270:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2960 selectedTexture() {
        v0 /* !! */  = ji.tf;
        if (true) ** GOTO lbl5
        block75: while (true) {
            v0 /* !! */  = (long)(v1 - ji.ktxn("kxay", ktyv(int ), (int)350));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 733325436: {
                    break block75;
                }
                case 759211862: {
                    v1 = ji.ktxn("kxaz", ktyv(int ), (int)351);
                    continue block75;
                }
                case 1658937963: {
                    v1 = ji.ktxn("kxba", ktyv(int ), (int)352);
                    continue block75;
                }
            }
            break;
        }
        var3_1 = ji.c;
        v2 /* !! */  = ji.tf;
        if (true) ** GOTO lbl19
        block76: while (true) {
            v2 /* !! */  = (long)(v3 - ji.ktxn("kxbc", ktyv(int ), (int)353));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1400364979: {
                    v3 = ji.ktxn("kxbf", ktyv(int ), (int)354);
                    continue block76;
                }
                case -1217927784: {
                    v3 = ji.ktxn("kxbg", ktyv(int ), (int)355);
                    continue block76;
                }
                case 733325436: {
                    break block76;
                }
            }
            break;
        }
        var2_2 /* !! */  = ji.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ji.tf - ji.ktxn("kxbh", ktyv(int ), (int)356)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ji.ktxn("kxbi", ktxk(int ), (int)877)) break;
            v4 /* !! */  = (long)ji.ktxn("kxbj", ktxk(int ), (int)878);
        }
        var1_3 = ji.a;
        if (var3_1) {
            throw null;
lbl38:
            // 12 sources

            return null;
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl38
                v5 /* !! */  = ji.tf;
                if (true) ** GOTO lbl49
                block79: while (true) {
                    v5 /* !! */  = (long)(ji.ktxn("kxbm", ktyv(int ), (int)358) - ji.ktxn("kxbk", ktyv(int ), (int)357));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1081496840: {
                            continue block79;
                        }
                        case 733325436: {
                            break block79;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ji.tf - ji.ktxn("kxbp", ktyv(int ), (int)359)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ji.ktxn("kxbr", ktxk(int ), (int)879)) break;
                    v6 /* !! */  = (long)ji.ktxn("kxbt", ktxk(int ), (int)880);
                }
                if (!this.texture.isSelected("\u0414\u043e\u043b\u043b\u0430\u0440\u044b")) ** GOTO lbl69
                if (var1_3) ** GOTO lbl38
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ji.tf - ji.ktxn("kxbw", ktyv(int ), (int)360)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ji.ktxn("kxby", ktxk(int ), (int)881)) break;
                    v7 /* !! */  = (long)ji.ktxn("kxca", ktxk(int ), (int)882);
                }
                return ji.DOLLAR_TEXTURE;
lbl69:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl38
                v8 /* !! */  = ji.tf;
                if (true) ** GOTO lbl74
                block82: while (true) {
                    v8 /* !! */  = (long)(v9 - ji.ktxn("kxcc", ktyv(int ), (int)361));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1221211010: {
                            v9 = ji.ktxn("kxce", ktyv(int ), (int)362);
                            continue block82;
                        }
                        case -294052800: {
                            v9 = ji.ktxn("kxcg", ktyv(int ), (int)363);
                            continue block82;
                        }
                        case 733325436: {
                            break block82;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = ji.tf - ji.ktxn("kxci", ktyv(int ), (int)364)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ji.ktxn("kxck", ktxk(int ), (int)883)) break;
                    v10 /* !! */  = (long)ji.ktxn("kxcm", ktxk(int ), (int)884);
                }
                if (!this.texture.isSelected("\u0422\u044b\u043a\u0432\u044b")) ** GOTO lbl108
                if (var1_3) ** GOTO lbl38
                v11 /* !! */  = ji.tf;
                if (true) ** GOTO lbl95
                block84: while (true) {
                    v11 /* !! */  = (long)(v12 - ji.ktxn("kxcp", ktyv(int ), (int)365));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -605073909: {
                            v12 = ji.ktxn("kxcr", ktyv(int ), (int)366);
                            continue block84;
                        }
                        case -532517005: {
                            v12 = ji.ktxn("kxcs", ktyv(int ), (int)367);
                            continue block84;
                        }
                        case 733325436: {
                            break block84;
                        }
                        case 771802012: {
                            v12 = ji.ktxn("kxct", ktyv(int ), (int)368);
                            continue block84;
                        }
                    }
                    break;
                }
                return ji.PUMPKIN_TEXTURE;
lbl108:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl38
                v13 /* !! */  = ji.tf;
                if (true) ** GOTO lbl113
                block85: while (true) {
                    v13 /* !! */  = (long)(ji.ktxn("kxcz", ktyv(int ), (int)370) - ji.ktxn("kxcw", ktyv(int ), (int)369));
lbl113:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1655716470: {
                            continue block85;
                        }
                        case 733325436: {
                            break block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ji.tf - ji.ktxn("kxdb", ktyv(int ), (int)371)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == ji.ktxn("kxde", ktxk(int ), (int)885)) break;
                    v14 /* !! */  = (long)ji.ktxn("kxdf", ktxk(int ), (int)886);
                }
                if (!this.texture.isSelected("\u0421\u043d\u0435\u0436\u0438\u043d\u043a\u0438")) ** GOTO lbl140
                if (var1_3) ** GOTO lbl38
                v15 /* !! */  = ji.tf;
                if (true) ** GOTO lbl130
                block87: while (true) {
                    v15 /* !! */  = (long)(v16 - ji.ktxn("kxdi", ktyv(int ), (int)372));
lbl130:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1560970185: {
                            v16 = ji.ktxn("kxdk", ktyv(int ), (int)373);
                            continue block87;
                        }
                        case -60525591: {
                            v16 = ji.ktxn("kxdl", ktyv(int ), (int)374);
                            continue block87;
                        }
                        case 733325436: {
                            break block87;
                        }
                    }
                    break;
                }
                return ji.SNOWFLAKE_TEXTURE;
lbl140:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl38
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = ji.tf - ji.ktxn("kxdn", ktyv(int ), (int)375)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 /* !! */  == ji.ktxn("kxdo", ktxk(int ), (int)887)) break;
                    v17 /* !! */  = (long)ji.ktxn("kxdp", ktxk(int ), (int)888);
                }
                v18 /* !! */  = ji.tf;
                if (true) ** GOTO lbl151
                block89: while (true) {
                    v18 /* !! */  = (long)(ji.ktxn("kxdr", ktyv(int ), (int)377) - ji.ktxn("kxdq", ktyv(int ), (int)376));
lbl151:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 733325436: {
                            break block89;
                        }
                        case 1150058621: {
                            continue block89;
                        }
                    }
                    break;
                }
                if (!this.texture.isSelected("\u0421\u0435\u0440\u0434\u0446\u0430")) ** GOTO lbl168
                if (var1_3) ** GOTO lbl38
                v19 /* !! */  = ji.tf;
                if (true) ** GOTO lbl162
                block90: while (true) {
                    v19 /* !! */  = (long)(ji.ktxn("kxdy", ktyv(int ), (int)379) - ji.ktxn("kxds", ktyv(int ), (int)378));
lbl162:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 310674358: {
                            continue block90;
                        }
                        case 733325436: {
                            break block90;
                        }
                    }
                    break;
                }
                return ji.HEART_TEXTURE;
lbl168:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl38
                v20 /* !! */  = ji.tf;
                if (true) ** GOTO lbl173
                block91: while (true) {
                    v20 /* !! */  = (long)(ji.ktxn("kxed", ktyv(int ), (int)381) - ji.ktxn("kxec", ktyv(int ), (int)380));
lbl173:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1712368139: {
                            continue block91;
                        }
                        case 733325436: {
                            break block91;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = ji.tf - ji.ktxn("kxee", ktyv(int ), (int)382)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 /* !! */  == ji.ktxn("kxef", ktxk(int ), (int)889)) break;
                    v21 /* !! */  = (long)ji.ktxn("kxeg", ktxk(int ), (int)890);
                }
                if (!this.texture.isSelected("\u0417\u0432\u0451\u0437\u0434\u044b")) ** GOTO lbl200
                if (var1_3) ** GOTO lbl38
                v22 /* !! */  = ji.tf;
                if (true) ** GOTO lbl190
                block93: while (true) {
                    v22 /* !! */  = (long)(v23 - ji.ktxn("kxeh", ktyv(int ), (int)383));
lbl190:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case 733325436: {
                            break block93;
                        }
                        case 1456479619: {
                            v23 = ji.ktxn("kxep", ktyv(int ), (int)384);
                            continue block93;
                        }
                        case 1537451507: {
                            v23 = ji.ktxn("kxeq", ktyv(int ), (int)385);
                            continue block93;
                        }
                    }
                    break;
                }
                return ji.STAR_TEXTURE;
lbl200:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return null;
            }
lbl203:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ji.ktxn("kxes", ktxk(int ), (int)891);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 1: {
                var2_2 /* !! */  = (int)ji.ktxn("kxeu", ktxk(int ), (int)892);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 2: {
                var2_2 /* !! */  = (int)ji.ktxn("kxew", ktxk(int ), (int)893);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl218:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kxex", ktxk(int ), (int)894);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfa", ktxk(int ), (int)895);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl228:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kxfb", ktxk(int ), (int)896);
                } while (!var3_1);
                throw null;
            }
lbl233:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfc", ktxk(int ), (int)897);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl238:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfe", ktxk(int ), (int)898);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 8: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfg", ktxk(int ), (int)899);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
lbl247:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfi", ktxk(int ), (int)900);
                if (!var3_1) break;
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ji.ktxn("kxfk", ktxk(int ), (int)901);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl289
                    break;
                }
            }
lbl257:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfl", ktxk(int ), (int)902);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl262:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfn", ktxk(int ), (int)903);
                if (!var3_1) ** GOTO lbl218
                throw null;
            }
lbl266:
            // 2 sources

            case 13: {
                do {
                    var2_2 /* !! */  = (int)ji.ktxn("kxfo", ktxk(int ), (int)904);
                } while (!var3_1);
                throw null;
            }
lbl271:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfq", ktxk(int ), (int)905);
                if (!var3_1) ** GOTO lbl203
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfs", ktxk(int ), (int)906);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 16: {
                var2_2 /* !! */  = (int)ji.ktxn("kxft", ktxk(int ), (int)907);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl285:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfu", ktxk(int ), (int)908);
                if (!var3_1) ** GOTO lbl238
                throw null;
            }
lbl289:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfv", ktxk(int ), (int)909);
                if (!var3_1) ** GOTO lbl228
                throw null;
            }
lbl293:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfw", ktxk(int ), (int)910);
                if (!var3_1) ** GOTO lbl247
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)ji.ktxn("kxfy", ktxk(int ), (int)911);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)ji.ktxn("kxgc", ktxk(int ), (int)912);
        ** while (!var3_1)
lbl304:
        // 1 sources

        throw null;
    }
}

