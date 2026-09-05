/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jn$HaloPassConsumer;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nd;
import ruhack.phobia.on;
import ruhack.phobia.oo;

public class jn
extends ds {
    public final kg speed;
    private static int[] knfa;
    public final kf mode;
    public final kg trailFade;
    public final kg fill;
    private static final String COLOR_THEME = "\u041e\u0442 \u0442\u0435\u043c\u044b";
    private static long[] kneh;
    protected static final long ss = 4426829660517913797L;
    public static boolean firstPersonItemContext;
    private int frameItemFillColor;
    public static final boolean c;
    private int frameColor2Speed;
    public static boolean firstPersonArmContext;
    public final kb trailBurst;
    private static int[] knez;
    private static jn instance;
    public final kg trailSway;
    private static final int[][] HALO_PASS_OVERLAYS;
    private int frameBakedItemFill;
    private static final String COLOR_ITEM = "\u041e\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430";
    private long renderFrameSerial;
    public final kg trailModelAlpha;
    private float frameFill;
    private int frameTrailModelOverlay;
    public final kg trailFlicker;
    public final kg trailBurstPower;
    private int frameTrailModelColor;
    public final kf colorMode;
    private float frameSpeed;
    private int cachedPrimaryColor;
    private static final int DEFAULT_HALO_PASS_LIMIT = 24;
    private static long[] knei;
    private int framePrimaryColor;
    public static final boolean a;
    public final kg trailTurbulence;
    public final kb trail;
    private int cachedSecondaryColor;
    private boolean renderCacheValid;
    public static final int b;
    private static final float[][] HALO_RINGS;
    public final kb trailModel;
    public final kg trailRise;
    private final int[] cachedRingLights;
    private static final int[] HALO_PASS_RINGS;
    private int frameColor1;
    private int frameSecondaryColor;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isGlowMode() {
        CallSite callSite;
        boolean bl2;
        block25: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = ss - jn.knej("knij", kneg(int ), (int)23)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == jn.knej("knik", kney(int ), (int)76)) break;
                object = jn.knej("knil", kney(int ), (int)77);
            }
            boolean bl3 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = ss - jn.knej("knim", kneg(int ), (int)24)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == jn.knej("knin", kney(int ), (int)78)) break;
                object = jn.knej("knio", kney(int ), (int)79);
            }
            int n2 = b;
            Object object = ss;
            block12: while (true) {
                switch ((int)object) {
                    case -1557297824: {
                        object = jn.knej("kniq", kneg(int ), (int)26) - jn.knej("knip", kneg(int ), (int)25);
                        continue block12;
                    }
                    case 878007493: {
                        break block12;
                    }
                }
                break;
            }
            bl2 = a;
            if (bl3) {
                throw null;
            }
            if (bl2 || bl2) return (boolean)jn.knej("knir", kney(int ), (int)80);
            Object object2 = ss;
            boolean bl4 = true;
            block13: while (true) {
                CallSite callSite2;
                if (!bl4 || (bl4 = false) || !true) {
                    object2 = callSite2 - jn.knej("knis", kneg(int ), (int)27);
                }
                switch ((int)object2) {
                    case -2092212567: {
                        callSite2 = jn.knej("knit", kneg(int ), (int)28);
                        continue block13;
                    }
                    case -1191277709: {
                        callSite2 = jn.knej("kniu", kneg(int ), (int)29);
                        continue block13;
                    }
                    case 878007493: {
                        break block13;
                    }
                    case 965835016: {
                        callSite2 = jn.knej("kniv", kneg(int ), (int)30);
                        continue block13;
                    }
                }
                break;
            }
            if (!this.isStandardGlowMode()) {
                if (bl2) return (boolean)jn.knej("knir", kney(int ), (int)80);
                while (true) {
                    long l4;
                    Object object3;
                    if ((object3 = (l4 = ss - jn.knej("kniw", kneg(int ), (int)31)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object3 == jn.knej("knix", kney(int ), (int)81)) {
                        if (this.isBeautifulMode()) {
                            break;
                        }
                        break block25;
                    }
                    object3 = jn.knej("kniy", kney(int ), (int)82);
                }
                if (bl2) return (boolean)jn.knej("knir", kney(int ), (int)80);
            }
            if (bl2 || bl2) return (boolean)jn.knej("knir", kney(int ), (int)80);
            callSite = jn.knej("kniz", kney(int ), (int)83);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)jn.knej("knir", kney(int ), (int)80);
        }
        callSite = jn.knej("knja", kney(int ), (int)84);
        return (boolean)callSite;
    }

    private static /* synthetic */ void kpie() {
        jn.knfa[500] = -1054574859;
        jn.knfa[501] = -921863084;
        jn.knfa[502] = -68697591;
        jn.knfa[503] = -582794074;
        jn.knfa[504] = -1262432297;
        jn.knfa[505] = 1885703638;
        jn.knfa[506] = -2020963991;
        jn.knfa[507] = -1465266375;
        jn.knfa[508] = -930723164;
        jn.knfa[509] = 1689999099;
        jn.knfa[510] = 965610649;
        jn.knfa[511] = 1051001210;
        jn.knfa[512] = 1321707850;
        jn.knfa[513] = 319150402;
        jn.knfa[514] = 1519748799;
        jn.knfa[515] = -181970121;
        jn.knfa[516] = 1519743594;
        jn.knfa[517] = 2008986241;
        jn.knfa[518] = -855732099;
        jn.knfa[519] = 1462575794;
        jn.knfa[520] = 1317305842;
        jn.knfa[521] = 1236608;
        jn.knfa[522] = 29155049;
        jn.knfa[523] = 0x663660;
        jn.knfa[524] = 2064575547;
        jn.knfa[525] = 160323864;
        jn.knfa[526] = 1720905176;
        jn.knfa[527] = 1005764483;
        jn.knfa[528] = 1205508591;
        jn.knfa[529] = -1550995364;
        jn.knfa[530] = 1841875072;
        jn.knfa[531] = -1682756292;
        jn.knfa[532] = -1894459334;
        jn.knfa[533] = -683559413;
        jn.knfa[534] = 498847092;
        jn.knfa[535] = 1219466139;
        jn.knfa[536] = 306685477;
        jn.knfa[537] = 1926762186;
        jn.knfa[538] = -2005709853;
        jn.knfa[539] = 645011984;
        jn.knfa[540] = -1354588250;
        jn.knfa[541] = 1196204827;
        jn.knfa[542] = 460813343;
        jn.knfa[543] = -205055237;
        jn.knfa[544] = 1393508211;
        jn.knfa[545] = 378507049;
        jn.knfa[546] = 1730902802;
        jn.knfa[547] = 2004174022;
        jn.knfa[548] = 2069972195;
        jn.knfa[549] = 1260743534;
        jn.knfa[550] = -728382844;
        jn.knfa[551] = 1472532152;
        jn.knfa[552] = -650631600;
        jn.knfa[553] = -852301585;
        jn.knfa[554] = -1428220803;
        jn.knfa[555] = 409943419;
        jn.knfa[556] = 207039503;
        jn.knfa[557] = 1324766282;
        jn.knfa[558] = 1360000313;
        jn.knfa[559] = 841052352;
        jn.knfa[560] = -1388706768;
        jn.knfa[561] = 1909262207;
        jn.knfa[562] = 1483435059;
        jn.knfa[563] = 622508229;
        jn.knfa[564] = -1604507062;
        jn.knfa[565] = 883201087;
        jn.knfa[566] = 980651665;
        jn.knfa[567] = -630834817;
        jn.knfa[568] = 978992141;
        jn.knfa[569] = 339460218;
        jn.knfa[570] = 443181651;
        jn.knfa[571] = -956299334;
        jn.knfa[572] = 1786280342;
        jn.knfa[573] = 593797668;
        jn.knfa[574] = 253358281;
        jn.knfa[575] = -1383582589;
        jn.knfa[576] = 1213495043;
        jn.knfa[577] = 291910458;
        jn.knfa[578] = 1896584262;
        jn.knfa[579] = 1569761993;
        jn.knfa[580] = 140038986;
        jn.knfa[581] = 420782599;
        jn.knfa[582] = 1991216402;
        jn.knfa[583] = -1590115519;
        jn.knfa[584] = -66385850;
        jn.knfa[585] = 1323819427;
        jn.knfa[586] = 1803483556;
        jn.knfa[587] = 663990922;
        jn.knfa[588] = 667723794;
        jn.knfa[589] = 1657552572;
        jn.knfa[590] = -1205645808;
        jn.knfa[591] = -1031457390;
        jn.knfa[592] = -2132632678;
        jn.knfa[593] = -1813971816;
        jn.knfa[594] = 593544894;
        jn.knfa[595] = -2087575497;
        jn.knfa[596] = 1234777710;
        jn.knfa[597] = 1964326490;
        jn.knfa[598] = -2060922276;
        jn.knfa[599] = -891768272;
    }

    private static /* synthetic */ void kphx() {
        jn.knez[700] = 542638411;
        jn.knez[701] = -1570786147;
        jn.knez[702] = 1318934063;
        jn.knez[703] = 866537953;
        jn.knez[704] = 358683445;
        jn.knez[705] = 1777101607;
        jn.knez[706] = 1518024959;
        jn.knez[707] = 181047730;
        jn.knez[708] = 1109289882;
        jn.knez[709] = 1124222110;
        jn.knez[710] = -480219320;
        jn.knez[711] = -829487324;
        jn.knez[712] = 1118789946;
        jn.knez[713] = 146753892;
        jn.knez[714] = 1605860644;
        jn.knez[715] = -702401635;
        jn.knez[716] = 111565129;
        jn.knez[717] = -733845067;
        jn.knez[718] = 1593205836;
        jn.knez[719] = 855688001;
        jn.knez[720] = 1186596025;
        jn.knez[721] = -1892105118;
        jn.knez[722] = -1970515968;
        jn.knez[723] = -1993790207;
        jn.knez[724] = 2041464122;
        jn.knez[725] = 26123496;
        jn.knez[726] = -1451127646;
        jn.knez[727] = -56773288;
        jn.knez[728] = 1025150249;
        jn.knez[729] = 1884426749;
        jn.knez[730] = -139767577;
        jn.knez[731] = -595983468;
        jn.knez[732] = 1867975733;
        jn.knez[733] = 1115081332;
        jn.knez[734] = -359319802;
        jn.knez[735] = 474283168;
        jn.knez[736] = 1348320282;
        jn.knez[737] = -1943498247;
        jn.knez[738] = 1037676694;
        jn.knez[739] = -1563217497;
        jn.knez[740] = -552794909;
        jn.knez[741] = -663466548;
        jn.knez[742] = 947268738;
        jn.knez[743] = -1632112181;
        jn.knez[744] = -1206578899;
        jn.knez[745] = -34165351;
        jn.knez[746] = -1416345341;
        jn.knez[747] = 1998855118;
        jn.knez[748] = 1228958687;
        jn.knez[749] = -1117791678;
        jn.knez[750] = 478861153;
        jn.knez[751] = 201232486;
        jn.knez[752] = -1944629617;
        jn.knez[753] = 1672780637;
        jn.knez[754] = -2080075004;
        jn.knez[755] = 2104344947;
        jn.knez[756] = 1798039403;
        jn.knez[757] = 1120596725;
        jn.knez[758] = -1199114942;
        jn.knez[759] = 1384981488;
        jn.knez[760] = 120082075;
        jn.knez[761] = 918588200;
        jn.knez[762] = 1577560048;
        jn.knez[763] = 543789495;
        jn.knez[764] = 1730836064;
        jn.knez[765] = 2032631096;
        jn.knez[766] = 972907891;
        jn.knez[767] = 204150337;
        jn.knez[768] = -711041294;
        jn.knez[769] = -1000585674;
        jn.knez[770] = -176302856;
        jn.knez[771] = 746972454;
        jn.knez[772] = 1866887482;
        jn.knez[773] = -621552091;
        jn.knez[774] = -777419714;
        jn.knez[775] = -969792614;
        jn.knez[776] = -403879660;
        jn.knez[777] = 1415614927;
        jn.knez[778] = 776864405;
        jn.knez[779] = -51700211;
        jn.knez[780] = -1339122452;
        jn.knez[781] = -657432737;
        jn.knez[782] = 862878379;
        jn.knez[783] = -1320161708;
        jn.knez[784] = 418217516;
        jn.knez[785] = 1413263617;
        jn.knez[786] = -1831808136;
        jn.knez[787] = -612466046;
        jn.knez[788] = 698750736;
        jn.knez[789] = -1044797550;
        jn.knez[790] = -2089098098;
        jn.knez[791] = -336903681;
        jn.knez[792] = -1876671878;
        jn.knez[793] = 1900589884;
        jn.knez[794] = -788092782;
        jn.knez[795] = 1252442461;
        jn.knez[796] = -1296446619;
        jn.knez[797] = 1279818826;
        jn.knez[798] = -914467231;
        jn.knez[799] = -521501360;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void forEachReducedHaloPass(jn$HaloPassConsumer var1_1, int var2_2) {
        var14_3 = jn.c;
        var13_4 /* !! */  = jn.b;
        var12_5 = jn.a;
        if (var14_3) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var12_5 || var12_5) ** GOTO lbl6
        this.ensureRenderCache();
        if (var12_5 || var12_5) ** GOTO lbl6
        var3_6 = this.framePrimaryColor;
        if (var12_5 || var12_5) ** GOTO lbl6
        var4_7 = this.frameSecondaryColor;
        if (var12_5 || var12_5) ** GOTO lbl6
        this.updateRingLights(var3_6, var4_7);
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_8 = Math.max((int)jn.knej("kouk", kney(int ), (int)611), Math.min((int)jn.knej("koul", kney(int ), (int)612), Math.round(this.frameSpeed / jn.knej("koum", knff(int ), (int)613) * jn.knej("koun", knff(int ), (int)614))));
        if (var12_5 || var12_5) ** GOTO lbl6
        var6_9 = jn.HALO_PASS_OVERLAYS[var5_8];
        if (var12_5 || var12_5) ** GOTO lbl6
        var7_10 = jn.HALO_PASS_RINGS.length;
        if (var12_5 || var12_5) ** GOTO lbl6
        var8_11 = (float)var7_10 / (float)var2_2;
        if (var12_5 || var12_5) ** GOTO lbl6
        var9_12 = jn.knej("kouo", kney(int ), (int)615);
        if (var12_5) ** GOTO lbl6
        block38: while (true) {
            if (var12_5 || var12_5) ** GOTO lbl6
            if (var9_12 >= var2_2) ** GOTO lbl44
            if (var13_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var12_5 || var12_5) ** GOTO lbl6
                    var10_13 = Math.min(var7_10 - jn.knej("koup", kney(int ), (int)616), Math.round(((float)var9_12 + jn.knej("kouq", knff(int ), (int)617)) * (float)var7_10 / (float)var2_2 - jn.knej("kour", knff(int ), (int)618)));
                    if (var12_5 || var12_5) ** GOTO lbl6
                    var11_14 = jn.scalePackedAlpha(this.cachedRingLights[jn.HALO_PASS_RINGS[var10_13]], var8_11);
                    if (var12_5 || var12_5) ** GOTO lbl6
                    var1_1.accept(var11_14, var6_9[var10_13]);
                    if (var12_5 || var12_5) ** GOTO lbl6
                    ++var9_12;
                    if (var12_5) ** GOTO lbl6
                    if (!var14_3) continue block38;
                    throw null;
                }
lbl44:
                // 1 sources

                if (!var12_5 && !var12_5) ** break;
                ** continue;
                return;
lbl47:
                // 2 sources

                case 0: {
                    do {
                        var13_4 /* !! */  = (int)jn.knej("kous", kney(int ), (int)619);
                    } while (!var14_3);
                    throw null;
                }
lbl52:
                // 2 sources

                case 1: {
                    var13_4 /* !! */  = (int)jn.knej("kout", kney(int ), (int)620);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
lbl57:
                // 2 sources

                case 2: {
                    var13_4 /* !! */  = (int)jn.knej("kouu", kney(int ), (int)621);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl62:
                // 2 sources

                case 3: {
                    var13_4 /* !! */  = (int)jn.knej("kouv", kney(int ), (int)622);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl134
                }
lbl67:
                // 3 sources

                case 4: {
                    var13_4 /* !! */  = (int)jn.knej("kouw", kney(int ), (int)623);
                    if (!var14_3) break block38;
                    throw null;
                }
lbl71:
                // 3 sources

                case 5: {
                    var13_4 /* !! */  = (int)jn.knej("koux", kney(int ), (int)624);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 6: {
                    var13_4 /* !! */  = (int)jn.knej("kouy", kney(int ), (int)625);
                    if (!var14_3) ** GOTO lbl67
                    throw null;
                }
                case 7: {
                    var13_4 /* !! */  = (int)jn.knej("kouz", kney(int ), (int)626);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl108
                }
lbl85:
                // 2 sources

                case 8: {
                    var13_4 /* !! */  = (int)jn.knej("kova", kney(int ), (int)627);
                    if (!var14_3) ** GOTO lbl52
                    throw null;
                }
                case 9: {
                    var13_4 /* !! */  = (int)jn.knej("kovb", kney(int ), (int)628);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl99
                }
                case 10: {
                    var13_4 /* !! */  = (int)jn.knej("kovc", kney(int ), (int)629);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl108
                }
lbl99:
                // 3 sources

                case 11: {
                    var13_4 /* !! */  = (int)jn.knej("kovd", kney(int ), (int)630);
                    if (!var14_3) ** GOTO lbl47
                    throw null;
                }
                case 12: {
                    var13_4 /* !! */  = (int)jn.knej("kove", kney(int ), (int)631);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
lbl108:
                // 4 sources

                case 13: {
                    do {
                        var13_4 /* !! */  = (int)jn.knej("kovf", kney(int ), (int)632);
                    } while (!var14_3);
                    throw null;
                }
                case 14: {
                    var13_4 /* !! */  = (int)jn.knej("kovg", kney(int ), (int)633);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
lbl118:
                // 5 sources

                case 15: {
                    var13_4 /* !! */  = (int)jn.knej("kovh", kney(int ), (int)634);
                    if (!var14_3) ** GOTO lbl71
                    throw null;
                }
lbl122:
                // 2 sources

                case 16: {
                    var13_4 /* !! */  = (int)jn.knej("kovi", kney(int ), (int)635);
                    if (!var14_3) ** GOTO lbl85
                    throw null;
                }
                case 17: {
                    var13_4 /* !! */  = (int)jn.knej("kovj", kney(int ), (int)636);
                    if (!var14_3) ** GOTO lbl62
                    throw null;
                }
lbl130:
                // 2 sources

                case 18: {
                    var13_4 /* !! */  = (int)jn.knej("kovk", kney(int ), (int)637);
                    if (!var14_3) ** GOTO lbl71
                    throw null;
                }
lbl134:
                // 2 sources

                case 19: {
                    var13_4 /* !! */  = (int)jn.knej("kovl", kney(int ), (int)638);
                    if (!var14_3) ** GOTO lbl118
                    throw null;
                }
                case 20: {
                    var13_4 /* !! */  = (int)jn.knej("kovm", kney(int ), (int)639);
                    if (!var14_3) ** GOTO lbl118
                    throw null;
                }
lbl142:
                // 2 sources

                case 21: {
                    var13_4 /* !! */  = (int)jn.knej("kovn", kney(int ), (int)640);
                    if (!var14_3) ** GOTO lbl118
                    throw null;
                }
lbl146:
                // 3 sources

                case 22: {
                    var13_4 /* !! */  = (int)jn.knej("kovo", kney(int ), (int)641);
                    if (!var14_3) ** GOTO lbl130
                    throw null;
                }
                case 23: {
                    var13_4 /* !! */  = (int)jn.knej("kovp", kney(int ), (int)642);
                    if (!var14_3) ** GOTO lbl146
                    throw null;
                }
                case 24: {
                    var13_4 /* !! */  = (int)jn.knej("kovq", kney(int ), (int)643);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
lbl159:
                // 3 sources

                case 25: {
                    var13_4 /* !! */  = (int)jn.knej("kovr", kney(int ), (int)644);
                    if (!var14_3) ** GOTO lbl146
                    throw null;
                }
                case 26: {
                    var13_4 /* !! */  = (int)jn.knej("kovs", kney(int ), (int)645);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl194
                }
                case 27: {
                    var13_4 /* !! */  = (int)jn.knej("kovt", kney(int ), (int)646);
                    if (!var14_3) ** GOTO lbl67
                    throw null;
                }
lbl172:
                // 2 sources

                case 28: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_4 /* !! */  = (int)jn.knej("kovu", kney(int ), (int)647);
                        if (var14_3) {
                            throw null;
                        }
                        ** GOTO lbl182
                        break;
                    }
                }
                case 29: {
                    var13_4 /* !! */  = (int)jn.knej("kovv", kney(int ), (int)648);
                    if (!var14_3) ** GOTO lbl118
                    throw null;
                }
lbl182:
                // 3 sources

                case 30: {
                    var13_4 /* !! */  = (int)jn.knej("kovw", kney(int ), (int)649);
                    if (!var14_3) ** GOTO lbl99
                    throw null;
                }
lbl186:
                // 2 sources

                case 31: {
                    var13_4 /* !! */  = (int)jn.knej("kovx", kney(int ), (int)650);
                    if (!var14_3) ** GOTO lbl142
                    throw null;
                }
                case 32: {
                    var13_4 /* !! */  = (int)jn.knej("kovy", kney(int ), (int)651);
                    if (!var14_3) ** GOTO lbl108
                    throw null;
                }
lbl194:
                // 2 sources

                case 33: {
                    var13_4 /* !! */  = (int)jn.knej("kovz", kney(int ), (int)652);
                    if (!var14_3) ** GOTO lbl57
                    throw null;
                }
                case 34: 
            }
            break;
        }
        var13_4 /* !! */  = (int)jn.knej("kowa", kney(int ), (int)653);
        ** while (!var14_3)
lbl201:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kpfc", kneg(int ), (int)290)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jn.knej("kpfd", kney(int ), (int)844)) break;
            v0 /* !! */  = (long)jn.knej("kpfe", kney(int ), (int)845);
        }
        var3_1 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kpff", kneg(int ), (int)291)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jn.knej("kpfg", kney(int ), (int)846)) break;
            v1 /* !! */  = (long)jn.knej("kpfh", kney(int ), (int)847);
        }
        var2_2 /* !! */  = jn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kpfi", kneg(int ), (int)292)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jn.knej("kpfj", kney(int ), (int)848)) break;
            v2 /* !! */  = (long)jn.knej("kpfk", kney(int ), (int)849);
        }
        var1_3 = jn.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("kpfl", kneg(int ), (int)293)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jn.knej("kpfm", kney(int ), (int)850)) break;
                    v3 /* !! */  = (long)jn.knej("kpfn", kney(int ), (int)851);
                }
                if (!this.isTrailControlsVisible()) ** GOTO lbl-1000
                if (var1_3) continue block19;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("kpfo", kneg(int ), (int)294)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jn.knej("kpfp", kney(int ), (int)852)) break;
                    v4 /* !! */  = (long)jn.knej("kpfq", kney(int ), (int)853);
                }
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl47
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - jn.knej("kpfr", kneg(int ), (int)295));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1726390520: {
                            v6 = jn.knej("kpfs", kneg(int ), (int)296);
                            continue block22;
                        }
                        case -825060434: {
                            v6 = jn.knej("kpft", kneg(int ), (int)297);
                            continue block22;
                        }
                        case 878007493: {
                            break block22;
                        }
                    }
                    break;
                }
                if (this.trailModel.isValue()) {
                    if (var1_3) continue block19;
                    v7 = jn.knej("kpfu", kney(int ), (int)854);
                    if (var3_1) {
                        throw null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    if (!var1_3 && !var1_3) ** break;
                    continue block19;
                    v7 = jn.knej("kpfv", kney(int ), (int)855);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = jn.ss - jn.knej("kpfw", kneg(int ), (int)298)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == jn.knej("kpfx", kney(int ), (int)856)) break;
                    v8 /* !! */  = (long)jn.knej("kpfy", kney(int ), (int)857);
                }
                return (boolean)v7;
                case 0: {
                    var2_2 /* !! */  = (int)jn.knej("kpfz", kney(int ), (int)858);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl98
                }
                case 1: {
                    var2_2 /* !! */  = (int)jn.knej("kpga", kney(int ), (int)859);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl93
                }
                case 2: {
                    var2_2 /* !! */  = (int)jn.knej("kpgb", kney(int ), (int)860);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl98
                }
lbl87:
                // 3 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)jn.knej("kpgc", kney(int ), (int)861);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl98
                        break;
                    }
                }
lbl93:
                // 2 sources

                case 4: {
                    do {
                        var2_2 /* !! */  = (int)jn.knej("kpgd", kney(int ), (int)862);
                    } while (!var3_1);
                    throw null;
                }
lbl98:
                // 4 sources

                case 5: {
                    do {
                        var2_2 /* !! */  = (int)jn.knej("kpge", kney(int ), (int)863);
                    } while (!var3_1);
                    throw null;
                }
                case 6: {
                    var2_2 /* !! */  = (int)jn.knej("kpgf", kney(int ), (int)864);
                    if (!var3_1) ** GOTO lbl87
                    throw null;
                }
                case 7: {
                    var2_2 /* !! */  = (int)jn.knej("kpgg", kney(int ), (int)865);
                    if (!var3_1) ** GOTO lbl87
                    throw null;
                }
                case 8: 
            }
        }
        var2_2 /* !! */  = (int)jn.knej("kpgh", kney(int ), (int)866);
        ** while (!var3_1)
lbl114:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isBeautifulMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knkg", kneg(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jn.knej("knkh", kney(int ), (int)111)) break;
            v0 /* !! */  = (long)jn.knej("knki", kney(int ), (int)112);
        }
        var3_1 = jn.c;
        v1 /* !! */  = jn.ss;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(jn.knej("knkk", kneg(int ), (int)39) - jn.knej("knkj", kneg(int ), (int)38));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 120381799: {
                    continue block29;
                }
                case 878007493: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = jn.b;
        v2 /* !! */  = jn.ss;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - jn.knej("knkl", kneg(int ), (int)40));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1939684561: {
                    v3 = jn.knej("knkm", kneg(int ), (int)41);
                    continue block30;
                }
                case -1333998614: {
                    v3 = jn.knej("knkn", kneg(int ), (int)42);
                    continue block30;
                }
                case 878007493: {
                    break block30;
                }
                case 1104087656: {
                    v3 = jn.knej("knko", kneg(int ), (int)43);
                    continue block30;
                }
            }
            break;
        }
        var1_3 = jn.a;
        if (var3_1) {
            throw null;
            return (boolean)jn.knej("knkp", kney(int ), (int)113);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = jn.ss;
                if (true) ** GOTO lbl47
                block32: while (true) {
                    v4 /* !! */  = (long)(v5 - jn.knej("knkq", kneg(int ), (int)44));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 218068315: {
                            v5 = jn.knej("knkr", kneg(int ), (int)45);
                            continue block32;
                        }
                        case 412440634: {
                            v5 = jn.knej("knks", kneg(int ), (int)46);
                            continue block32;
                        }
                        case 878007493: {
                            break block32;
                        }
                        case 1002515317: {
                            v5 = jn.knej("knkt", kneg(int ), (int)47);
                            continue block32;
                        }
                    }
                    break;
                }
                v6 /* !! */  = jn.ss;
                if (true) ** GOTO lbl63
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - jn.knej("knku", kneg(int ), (int)48));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2017060951: {
                            v7 = jn.knej("knkv", kneg(int ), (int)49);
                            continue block33;
                        }
                        case -950453137: {
                            v7 = jn.knej("knkw", kneg(int ), (int)50);
                            continue block33;
                        }
                        case -476324143: {
                            v7 = jn.knej("knkx", kneg(int ), (int)51);
                            continue block33;
                        }
                        case 878007493: {
                            break block33;
                        }
                    }
                    break;
                }
                return this.mode.isSelected("\u041a\u0440\u0430\u0441\u0438\u0432\u044b\u0439");
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knky", kney(int ), (int)114);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knkz", kney(int ), (int)115);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jn.knej("knla", kney(int ), (int)116);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jn.knej("knlb", kney(int ), (int)117);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kpij() {
        jn.kneh[100] = 3897623150392431184L;
        jn.kneh[101] = -6825550875824443315L;
        jn.kneh[102] = -2919975971433406159L;
        jn.kneh[103] = 3958719876576205592L;
        jn.kneh[104] = -2728784623472374028L;
        jn.kneh[105] = -8153781454902169359L;
        jn.kneh[106] = 1675360713044454543L;
        jn.kneh[107] = 4968618333056416570L;
        jn.kneh[108] = 7221780327294491258L;
        jn.kneh[109] = -1696717468268520512L;
        jn.kneh[110] = 480716640811408730L;
        jn.kneh[111] = 903733360149030051L;
        jn.kneh[112] = -8409623788255387239L;
        jn.kneh[113] = -531420630720030666L;
        jn.kneh[114] = -2015083727844707324L;
        jn.kneh[115] = -3093892270008861096L;
        jn.kneh[116] = -2540432037177162396L;
        jn.kneh[117] = -385260855200236577L;
        jn.kneh[118] = 4886953167241076016L;
        jn.kneh[119] = 339671945985879507L;
        jn.kneh[120] = 8535740028964381913L;
        jn.kneh[121] = -5817316780096205422L;
        jn.kneh[122] = 8548940577068298120L;
        jn.kneh[123] = 2804800192596345221L;
        jn.kneh[124] = 3834438661218312930L;
        jn.kneh[125] = -2006984362389928909L;
        jn.kneh[126] = -6673738276592325038L;
        jn.kneh[127] = 5978301917805443061L;
        jn.kneh[128] = 6835356950742482397L;
        jn.kneh[129] = -2210460522542074375L;
        jn.kneh[130] = -7193329890843151836L;
        jn.kneh[131] = -1817352287977131201L;
        jn.kneh[132] = 5442796833255999200L;
        jn.kneh[133] = 8337938047036385478L;
        jn.kneh[134] = 4056281105959597679L;
        jn.kneh[135] = 1913666146813972003L;
        jn.kneh[136] = 7560637411590265788L;
        jn.kneh[137] = -7636398153384177485L;
        jn.kneh[138] = 4291784497344034753L;
        jn.kneh[139] = -2000046211165096512L;
        jn.kneh[140] = 4080966585575454120L;
        jn.kneh[141] = 6645603656263529757L;
        jn.kneh[142] = -6875088481843360514L;
        jn.kneh[143] = -5703105830905046213L;
        jn.kneh[144] = 6771948355881484815L;
        jn.kneh[145] = 8245925514632197783L;
        jn.kneh[146] = -5707836945310912707L;
        jn.kneh[147] = 8303902658164575273L;
        jn.kneh[148] = 2695338429268653699L;
        jn.kneh[149] = -1178324404101881716L;
        jn.kneh[150] = -5436123918133232078L;
        jn.kneh[151] = -2484298890847477816L;
        jn.kneh[152] = 1962343476721570821L;
        jn.kneh[153] = -4012814322161138798L;
        jn.kneh[154] = 7485267136867303727L;
        jn.kneh[155] = 8681744085410270121L;
        jn.kneh[156] = 666592775787594404L;
        jn.kneh[157] = -4731559956057882153L;
        jn.kneh[158] = -8509484141124186228L;
        jn.kneh[159] = 3485266416124921129L;
        jn.kneh[160] = -7982313700443222211L;
        jn.kneh[161] = 3634846132067903147L;
        jn.kneh[162] = 7909456129939484922L;
        jn.kneh[163] = 5053197043148740356L;
        jn.kneh[164] = 6706718241735593568L;
        jn.kneh[165] = 6401163158316030320L;
        jn.kneh[166] = -8733959404461925932L;
        jn.kneh[167] = -8302621139384658560L;
        jn.kneh[168] = 6269020467610023864L;
        jn.kneh[169] = -2833468116272838787L;
        jn.kneh[170] = -2811838006064482361L;
        jn.kneh[171] = -2549528341902155789L;
        jn.kneh[172] = 9043601799709759216L;
        jn.kneh[173] = -7940716763236167523L;
        jn.kneh[174] = -7049954327829249066L;
        jn.kneh[175] = 5908440826158256844L;
        jn.kneh[176] = 5120935083878192794L;
        jn.kneh[177] = -247613563762676346L;
        jn.kneh[178] = 6673552186856887686L;
        jn.kneh[179] = -2138806806337456086L;
        jn.kneh[180] = -8203428998340966272L;
        jn.kneh[181] = 6684799412228345182L;
        jn.kneh[182] = 5746463045545779215L;
        jn.kneh[183] = -7411732833135283228L;
        jn.kneh[184] = 2562404384863676821L;
        jn.kneh[185] = 3376119972398573864L;
        jn.kneh[186] = 2026786469790371968L;
        jn.kneh[187] = 4755244413609383305L;
        jn.kneh[188] = -5293910003751634378L;
        jn.kneh[189] = 4016913067675769096L;
        jn.kneh[190] = -4082310061335525716L;
        jn.kneh[191] = 6979754940326476548L;
        jn.kneh[192] = -8046709604657019293L;
        jn.kneh[193] = 6046670029469435994L;
        jn.kneh[194] = -1526043519542697760L;
        jn.kneh[195] = -4350875614224682394L;
        jn.kneh[196] = -4599626335322215169L;
        jn.kneh[197] = -3930510034197230764L;
        jn.kneh[198] = -4159234297185710874L;
        jn.kneh[199] = -370235634409252011L;
    }

    private static /* synthetic */ void kpid() {
        jn.knfa[400] = 668031026;
        jn.knfa[401] = -626110504;
        jn.knfa[402] = 2094917147;
        jn.knfa[403] = 1235221029;
        jn.knfa[404] = 1792901967;
        jn.knfa[405] = 1823539546;
        jn.knfa[406] = 972422873;
        jn.knfa[407] = -929805818;
        jn.knfa[408] = 310537179;
        jn.knfa[409] = -1566829144;
        jn.knfa[410] = 22486243;
        jn.knfa[411] = -1501907975;
        jn.knfa[412] = -1761530799;
        jn.knfa[413] = -673976139;
        jn.knfa[414] = -191536877;
        jn.knfa[415] = -886493281;
        jn.knfa[416] = -976796616;
        jn.knfa[417] = 1948574872;
        jn.knfa[418] = 375710514;
        jn.knfa[419] = 251382775;
        jn.knfa[420] = -725888072;
        jn.knfa[421] = -878934129;
        jn.knfa[422] = -1592071763;
        jn.knfa[423] = -1714086143;
        jn.knfa[424] = 1559002224;
        jn.knfa[425] = 1200875079;
        jn.knfa[426] = -136419193;
        jn.knfa[427] = -943486044;
        jn.knfa[428] = 1474755462;
        jn.knfa[429] = 682890842;
        jn.knfa[430] = -403899503;
        jn.knfa[431] = -1407548976;
        jn.knfa[432] = -95825665;
        jn.knfa[433] = -1504514792;
        jn.knfa[434] = -1007104039;
        jn.knfa[435] = -417522457;
        jn.knfa[436] = -1276671920;
        jn.knfa[437] = -249700727;
        jn.knfa[438] = 452407391;
        jn.knfa[439] = -599145384;
        jn.knfa[440] = -1887603148;
        jn.knfa[441] = -102414158;
        jn.knfa[442] = 1560193550;
        jn.knfa[443] = 908898957;
        jn.knfa[444] = -1967652929;
        jn.knfa[445] = -1581601001;
        jn.knfa[446] = -682689814;
        jn.knfa[447] = -224819705;
        jn.knfa[448] = -2008301902;
        jn.knfa[449] = -1162302847;
        jn.knfa[450] = -1416871803;
        jn.knfa[451] = 1032470726;
        jn.knfa[452] = 42735377;
        jn.knfa[453] = -1728868095;
        jn.knfa[454] = 416946615;
        jn.knfa[455] = 467950061;
        jn.knfa[456] = 1247613427;
        jn.knfa[457] = -1115809228;
        jn.knfa[458] = -551899251;
        jn.knfa[459] = 675988902;
        jn.knfa[460] = -1645768296;
        jn.knfa[461] = -1034058809;
        jn.knfa[462] = 811653505;
        jn.knfa[463] = 1697519427;
        jn.knfa[464] = -917228864;
        jn.knfa[465] = 1107098173;
        jn.knfa[466] = 2044973291;
        jn.knfa[467] = -960880219;
        jn.knfa[468] = -213749958;
        jn.knfa[469] = 661146095;
        jn.knfa[470] = -273274953;
        jn.knfa[471] = -1756186143;
        jn.knfa[472] = 603379130;
        jn.knfa[473] = 311565396;
        jn.knfa[474] = -865536424;
        jn.knfa[475] = 541556767;
        jn.knfa[476] = -1969984785;
        jn.knfa[477] = 896157058;
        jn.knfa[478] = 1793029372;
        jn.knfa[479] = 411095750;
        jn.knfa[480] = 1549961173;
        jn.knfa[481] = -137566732;
        jn.knfa[482] = 69628929;
        jn.knfa[483] = -1301917739;
        jn.knfa[484] = -664680121;
        jn.knfa[485] = -2120522611;
        jn.knfa[486] = -530159705;
        jn.knfa[487] = -882800493;
        jn.knfa[488] = -1031281449;
        jn.knfa[489] = -2325283;
        jn.knfa[490] = 406715142;
        jn.knfa[491] = -1335506069;
        jn.knfa[492] = -417106207;
        jn.knfa[493] = -1815011934;
        jn.knfa[494] = -1237426623;
        jn.knfa[495] = 1041246224;
        jn.knfa[496] = -1788469794;
        jn.knfa[497] = -1648413808;
        jn.knfa[498] = -1373518853;
        jn.knfa[499] = 1451299304;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean isStandardGlowMode() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ss - jn.knej("knjm", kneg(int ), (int)32)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == jn.knej("knjn", kney(int ), (int)96)) break;
            object = jn.knej("knjo", kney(int ), (int)97);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ss - jn.knej("knjp", kneg(int ), (int)33)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == jn.knej("knjq", kney(int ), (int)98)) break;
            object = jn.knej("knjr", kney(int ), (int)99);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ss - jn.knej("knjs", kneg(int ), (int)34)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == jn.knej("knjt", kney(int ), (int)100)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = jn.knej("knju", kney(int ), (int)101);
        }
        if (bl2) return (boolean)jn.knej("knjv", kney(int ), (int)102);
        if (bl2) return (boolean)jn.knej("knjv", kney(int ), (int)102);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ss - jn.knej("knjw", kneg(int ), (int)35)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == jn.knej("knjx", kney(int ), (int)103)) break;
            object = jn.knej("knjy", kney(int ), (int)104);
        }
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = ss - jn.knej("knjz", kneg(int ), (int)36)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == jn.knej("knka", kney(int ), (int)105)) {
                return this.mode.isSelected("\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435");
            }
            object = jn.knej("knkb", kney(int ), (int)106);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        block52: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kpgi", kneg(int ), (int)299)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == jn.knej("kpgj", kney(int ), (int)867)) break;
                v0 /* !! */  = (long)jn.knej("kpgk", kney(int ), (int)868);
            }
            var3_1 = jn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kpgl", kneg(int ), (int)300)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == jn.knej("kpgm", kney(int ), (int)869)) break;
                v1 /* !! */  = (long)jn.knej("kpgn", kney(int ), (int)870);
            }
            var2_2 /* !! */  = jn.b;
            v2 /* !! */  = jn.ss;
            if (true) ** GOTO lbl19
            block35: while (true) {
                v2 /* !! */  = (long)(v3 - jn.knej("kpgo", kneg(int ), (int)301));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2121021385: {
                        v3 = jn.knej("kpgp", kneg(int ), (int)302);
                        continue block35;
                    }
                    case -2064665554: {
                        v3 = jn.knej("kpgq", kneg(int ), (int)303);
                        continue block35;
                    }
                    case -1397114268: {
                        v3 = jn.knej("kpgr", kneg(int ), (int)304);
                        continue block35;
                    }
                    case 878007493: {
                        break block35;
                    }
                }
                break;
            }
            var1_3 = jn.a;
            if (var3_1) {
                throw null;
lbl34:
                // 5 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            v4 /* !! */  = jn.ss;
            if (true) ** GOTO lbl41
            block37: while (true) {
                v4 /* !! */  = (long)(v5 - jn.knej("kpgs", kneg(int ), (int)305));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -967856498: {
                        v5 = jn.knej("kpgt", kneg(int ), (int)306);
                        continue block37;
                    }
                    case -692295089: {
                        v5 = jn.knej("kpgu", kneg(int ), (int)307);
                        continue block37;
                    }
                    case -317775182: {
                        v5 = jn.knej("kpgv", kneg(int ), (int)308);
                        continue block37;
                    }
                    case 878007493: {
                        break block37;
                    }
                }
                break;
            }
            if (!this.isTrailControlsVisible()) break block52;
            if (var1_3) ** GOTO lbl34
            v6 /* !! */  = jn.ss;
            if (true) ** GOTO lbl59
            block38: while (true) {
                v6 /* !! */  = (long)(v7 - jn.knej("kpgw", kneg(int ), (int)309));
lbl59:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -510378575: {
                        v7 = jn.knej("kpgx", kneg(int ), (int)310);
                        continue block38;
                    }
                    case 100670032: {
                        v7 = jn.knej("kpgy", kneg(int ), (int)311);
                        continue block38;
                    }
                    case 639925631: {
                        v7 = jn.knej("kpgz", kneg(int ), (int)312);
                        continue block38;
                    }
                    case 878007493: {
                        break block38;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kpha", kneg(int ), (int)313)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == jn.knej("kphb", kney(int ), (int)871)) break;
                v8 /* !! */  = (long)jn.knej("kphc", kney(int ), (int)872);
            }
            if (!this.trailBurst.isValue()) break block52;
            if (var1_3) ** GOTO lbl34
            v9 = jn.knej("kphd", kney(int ), (int)873);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl91
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v9 = jn.knej("kphe", kney(int ), (int)874);
lbl91:
                // 2 sources

                v10 /* !! */  = jn.ss;
                if (true) ** GOTO lbl95
                block40: while (true) {
                    v10 /* !! */  = (long)(jn.knej("kphg", kneg(int ), (int)315) - jn.knej("kphf", kneg(int ), (int)314));
lbl95:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 878007493: {
                            break block40;
                        }
                        case 1334360164: {
                            continue block40;
                        }
                    }
                    break;
                }
                return (boolean)v9;
            }
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("kphh", kney(int ), (int)875);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl106:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jn.knej("kphi", kney(int ), (int)876);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl111:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("kphj", kney(int ), (int)877);
                    if (!var3_1) ** GOTO lbl106
                    throw null;
                }
            }
lbl116:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)jn.knej("kphk", kney(int ), (int)878);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 4: {
                var2_2 /* !! */  = (int)jn.knej("kphl", kney(int ), (int)879);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)jn.knej("kphm", kney(int ), (int)880);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
lbl129:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("kphn", kney(int ), (int)881);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)jn.knej("kpho", kney(int ), (int)882);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)jn.knej("kphp", kney(int ), (int)883);
        ** while (!var3_1)
lbl140:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpim() {
        jn.knei[0] = -8672661995558256743L;
        jn.knei[1] = 8632862961558634446L;
        jn.knei[2] = 5268058592150789327L;
        jn.knei[3] = -7579050513164546604L;
        jn.knei[4] = 3611571147864758554L;
        jn.knei[5] = 5695383702215561666L;
        jn.knei[6] = 3856522589633926152L;
        jn.knei[7] = 5013522452187724463L;
        jn.knei[8] = 3034517397963720397L;
        jn.knei[9] = -7354745812770964638L;
        jn.knei[10] = -478467585383100317L;
        jn.knei[11] = -2197508065820938985L;
        jn.knei[12] = 2935251526120349689L;
        jn.knei[13] = -6836694424880604542L;
        jn.knei[14] = 3474749613003697450L;
        jn.knei[15] = 8144186864988935253L;
        jn.knei[16] = -5722447726456490708L;
        jn.knei[17] = 2781701325487905399L;
        jn.knei[18] = -4480842755253900369L;
        jn.knei[19] = -5519338516153300394L;
        jn.knei[20] = -4907910824691810048L;
        jn.knei[21] = -8076345385818062552L;
        jn.knei[22] = 4069380429138020694L;
        jn.knei[23] = 964410860596905595L;
        jn.knei[24] = 2563886063273447381L;
        jn.knei[25] = -1185604828740556802L;
        jn.knei[26] = 7176063205872609287L;
        jn.knei[27] = 5738090322744917024L;
        jn.knei[28] = -1845366723843360618L;
        jn.knei[29] = -7153300276266415956L;
        jn.knei[30] = 106878926934984483L;
        jn.knei[31] = 6357497747562013506L;
        jn.knei[32] = -3413607658758844750L;
        jn.knei[33] = 8691610495945032144L;
        jn.knei[34] = 4447652052434262377L;
        jn.knei[35] = -4554438075314171909L;
        jn.knei[36] = 2120339094869560060L;
        jn.knei[37] = -1013509942842076926L;
        jn.knei[38] = -1600764271909862573L;
        jn.knei[39] = 8561989945494125096L;
        jn.knei[40] = -7010381563721764259L;
        jn.knei[41] = -4276364262326034247L;
        jn.knei[42] = -2851830522351572193L;
        jn.knei[43] = 5976923773599969164L;
        jn.knei[44] = -772302760342825532L;
        jn.knei[45] = 407873486553239199L;
        jn.knei[46] = 4322056258688167144L;
        jn.knei[47] = 36160343067452145L;
        jn.knei[48] = 5681750373404244002L;
        jn.knei[49] = 6435193809303731682L;
        jn.knei[50] = -417104136285647144L;
        jn.knei[51] = 5513106498530772650L;
        jn.knei[52] = 4569189193014290615L;
        jn.knei[53] = -16096046632610468L;
        jn.knei[54] = 4010999555858506009L;
        jn.knei[55] = 3877839740544149344L;
        jn.knei[56] = 9190918299378860024L;
        jn.knei[57] = -4023311948386583256L;
        jn.knei[58] = -3372396037899874916L;
        jn.knei[59] = 5108459015439037236L;
        jn.knei[60] = 4372460120878743532L;
        jn.knei[61] = 5150781778146949594L;
        jn.knei[62] = -4416954313638065079L;
        jn.knei[63] = -8033698489263485640L;
        jn.knei[64] = -2169230358974994196L;
        jn.knei[65] = 1060623378237020083L;
        jn.knei[66] = -8717481440173605100L;
        jn.knei[67] = 3700444723334233956L;
        jn.knei[68] = -8968317966679726351L;
        jn.knei[69] = -123982450847641528L;
        jn.knei[70] = -5216791844126319990L;
        jn.knei[71] = 8919074879643410310L;
        jn.knei[72] = -8164232816134922080L;
        jn.knei[73] = -4568594420053897180L;
        jn.knei[74] = -1180585429247785716L;
        jn.knei[75] = -1061841160263490777L;
        jn.knei[76] = 8746897607621094133L;
        jn.knei[77] = -9158309354120858382L;
        jn.knei[78] = -5700931657598106115L;
        jn.knei[79] = -7103679167954258003L;
        jn.knei[80] = -5353071674263381858L;
        jn.knei[81] = 7874271047788628665L;
        jn.knei[82] = 5391235039295852075L;
        jn.knei[83] = 6031335236469813329L;
        jn.knei[84] = -2049879267096934052L;
        jn.knei[85] = 5278442486573414867L;
        jn.knei[86] = -7207195930240295439L;
        jn.knei[87] = -2143971397310631383L;
        jn.knei[88] = -3016555198016228828L;
        jn.knei[89] = -212540677935391690L;
        jn.knei[90] = 2637239508093985206L;
        jn.knei[91] = 3602934321816962508L;
        jn.knei[92] = -8142842365667927386L;
        jn.knei[93] = 7857960083631431928L;
        jn.knei[94] = 3002748139992402939L;
        jn.knei[95] = -1584852924497865526L;
        jn.knei[96] = -6393633786210030192L;
        jn.knei[97] = 4269175339801939554L;
        jn.knei[98] = 7269055959080182690L;
        jn.knei[99] = 3342535311386837747L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int packItemFillColor() {
        v0 /* !! */  = jn.ss;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - jn.knej("koaj", kneg(int ), (int)132));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 786397152: {
                    v1 = jn.knej("koak", kneg(int ), (int)133);
                    continue block20;
                }
                case 843063143: {
                    v1 = jn.knej("koam", kneg(int ), (int)134);
                    continue block20;
                }
                case 878007493: {
                    break block20;
                }
                case 1144598647: {
                    v1 = jn.knej("koan", kneg(int ), (int)135);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = jn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("koap", kneg(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jn.knej("koaq", kney(int ), (int)281)) break;
            v2 /* !! */  = (long)jn.knej("koas", kney(int ), (int)282);
        }
        var2_2 /* !! */  = jn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("koau", kneg(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jn.knej("koav", kney(int ), (int)283)) break;
            v3 /* !! */  = (long)jn.knej("koax", kney(int ), (int)284);
        }
        var1_3 = jn.a;
        if (var3_1) {
            throw null;
lbl32:
            // 2 sources

            return (int)jn.knej("koaz", kney(int ), (int)285);
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kobb", kneg(int ), (int)138)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jn.knej("kobc", kney(int ), (int)286)) break;
            v4 /* !! */  = (long)jn.knej("kobd", kney(int ), (int)287);
        }
        this.ensureRenderCache();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl49
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - jn.knej("kobf", kneg(int ), (int)139));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1300966627: {
                            v6 = jn.knej("kobl", kneg(int ), (int)140);
                            continue block25;
                        }
                        case -1111918768: {
                            v6 = jn.knej("kobm", kneg(int ), (int)141);
                            continue block25;
                        }
                        case -458239085: {
                            v6 = jn.knej("kobo", kneg(int ), (int)142);
                            continue block25;
                        }
                        case 878007493: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.frameItemFillColor;
            }
lbl62:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)jn.knej("kobq", kney(int ), (int)288);
                if (!var3_1) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("kobs", kney(int ), (int)289);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jn.knej("kobt", kney(int ), (int)290);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("kobv", kney(int ), (int)291);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jn.knej("kobx", kney(int ), (int)292);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)jn.knej("koby", kney(int ), (int)293);
        ** while (!var3_1)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kphw() {
        jn.knez[600] = -2022362173;
        jn.knez[601] = -371998559;
        jn.knez[602] = 571778864;
        jn.knez[603] = 4118061;
        jn.knez[604] = -707858132;
        jn.knez[605] = -437115217;
        jn.knez[606] = 215447296;
        jn.knez[607] = -1625116885;
        jn.knez[608] = 255228281;
        jn.knez[609] = 1948312012;
        jn.knez[610] = -264570901;
        jn.knez[611] = 1253841009;
        jn.knez[612] = 1993618955;
        jn.knez[613] = 1311044096;
        jn.knez[614] = 1866478083;
        jn.knez[615] = -2094794051;
        jn.knez[616] = 1239636194;
        jn.knez[617] = -1812657804;
        jn.knez[618] = 363448971;
        jn.knez[619] = 585145633;
        jn.knez[620] = 1570788329;
        jn.knez[621] = 493343489;
        jn.knez[622] = 848575693;
        jn.knez[623] = 1227117320;
        jn.knez[624] = -1462308516;
        jn.knez[625] = 1052336462;
        jn.knez[626] = -1147947222;
        jn.knez[627] = -1612829425;
        jn.knez[628] = 652272019;
        jn.knez[629] = -225834465;
        jn.knez[630] = -1351184694;
        jn.knez[631] = -862810228;
        jn.knez[632] = 1302254276;
        jn.knez[633] = -1051119342;
        jn.knez[634] = 1103527732;
        jn.knez[635] = 971756585;
        jn.knez[636] = -1778162604;
        jn.knez[637] = -358430525;
        jn.knez[638] = 231876581;
        jn.knez[639] = -1806608146;
        jn.knez[640] = 677940480;
        jn.knez[641] = 2062453223;
        jn.knez[642] = 1126924149;
        jn.knez[643] = 1070965278;
        jn.knez[644] = 1079854581;
        jn.knez[645] = -447993926;
        jn.knez[646] = -1120982245;
        jn.knez[647] = -1884130903;
        jn.knez[648] = 136482352;
        jn.knez[649] = -475528129;
        jn.knez[650] = -2097941688;
        jn.knez[651] = -1718355376;
        jn.knez[652] = -1880351772;
        jn.knez[653] = 773335451;
        jn.knez[654] = 1049997285;
        jn.knez[655] = 1350789258;
        jn.knez[656] = -467158851;
        jn.knez[657] = 1248827271;
        jn.knez[658] = 157552329;
        jn.knez[659] = 1398555305;
        jn.knez[660] = 278332577;
        jn.knez[661] = -392926758;
        jn.knez[662] = -648507850;
        jn.knez[663] = 828700189;
        jn.knez[664] = -141957714;
        jn.knez[665] = -393581365;
        jn.knez[666] = -18624949;
        jn.knez[667] = -1760298595;
        jn.knez[668] = -1566370766;
        jn.knez[669] = 571927321;
        jn.knez[670] = -1602207615;
        jn.knez[671] = 1682316897;
        jn.knez[672] = -32019769;
        jn.knez[673] = -891481502;
        jn.knez[674] = 2067240705;
        jn.knez[675] = 448188702;
        jn.knez[676] = 1227960953;
        jn.knez[677] = 51786546;
        jn.knez[678] = -1622135134;
        jn.knez[679] = -1439060183;
        jn.knez[680] = -1641335642;
        jn.knez[681] = -452083292;
        jn.knez[682] = -848356989;
        jn.knez[683] = -254574884;
        jn.knez[684] = -431600131;
        jn.knez[685] = 808042260;
        jn.knez[686] = 1831922345;
        jn.knez[687] = 1813451448;
        jn.knez[688] = -1983348526;
        jn.knez[689] = 1959164774;
        jn.knez[690] = 981520278;
        jn.knez[691] = -641325508;
        jn.knez[692] = -541705388;
        jn.knez[693] = -34845389;
        jn.knez[694] = 1007628079;
        jn.knez[695] = 1726313792;
        jn.knez[696] = 15582143;
        jn.knez[697] = -1674673113;
        jn.knez[698] = 1578295730;
        jn.knez[699] = -1742498444;
    }

    private static /* synthetic */ void kpic() {
        jn.knfa[300] = -231645808;
        jn.knfa[301] = -731943067;
        jn.knfa[302] = -273431139;
        jn.knfa[303] = -1292628544;
        jn.knfa[304] = -309984470;
        jn.knfa[305] = 1271724223;
        jn.knfa[306] = -871524254;
        jn.knfa[307] = -391754987;
        jn.knfa[308] = -1492328274;
        jn.knfa[309] = 1381897853;
        jn.knfa[310] = -1952295978;
        jn.knfa[311] = 695410726;
        jn.knfa[312] = 1253959335;
        jn.knfa[313] = 79880611;
        jn.knfa[314] = 353642502;
        jn.knfa[315] = -1536161945;
        jn.knfa[316] = -1196815823;
        jn.knfa[317] = -2054886238;
        jn.knfa[318] = -1811905218;
        jn.knfa[319] = 1330407284;
        jn.knfa[320] = -1426804576;
        jn.knfa[321] = -74020542;
        jn.knfa[322] = 1404469911;
        jn.knfa[323] = 1193646299;
        jn.knfa[324] = 1689092713;
        jn.knfa[325] = -1349038024;
        jn.knfa[326] = 1805119316;
        jn.knfa[327] = 924856413;
        jn.knfa[328] = 983077961;
        jn.knfa[329] = -2130102491;
        jn.knfa[330] = 1996048338;
        jn.knfa[331] = 606901298;
        jn.knfa[332] = 13051433;
        jn.knfa[333] = -469167663;
        jn.knfa[334] = -975756726;
        jn.knfa[335] = 386405451;
        jn.knfa[336] = -1356024883;
        jn.knfa[337] = -399512940;
        jn.knfa[338] = -1033567784;
        jn.knfa[339] = -1288546485;
        jn.knfa[340] = 603713418;
        jn.knfa[341] = -364448540;
        jn.knfa[342] = 1480287629;
        jn.knfa[343] = 1569529845;
        jn.knfa[344] = -2078447209;
        jn.knfa[345] = 368055004;
        jn.knfa[346] = -2095491700;
        jn.knfa[347] = -1156821169;
        jn.knfa[348] = 59065301;
        jn.knfa[349] = 1949167676;
        jn.knfa[350] = -801446583;
        jn.knfa[351] = 21876141;
        jn.knfa[352] = 1018683680;
        jn.knfa[353] = -1784321812;
        jn.knfa[354] = 1528457592;
        jn.knfa[355] = -1476473417;
        jn.knfa[356] = 770815389;
        jn.knfa[357] = 1039209540;
        jn.knfa[358] = -884241750;
        jn.knfa[359] = 191039541;
        jn.knfa[360] = -1977126926;
        jn.knfa[361] = -341116543;
        jn.knfa[362] = -377903820;
        jn.knfa[363] = -1704239929;
        jn.knfa[364] = 232335720;
        jn.knfa[365] = -2139544154;
        jn.knfa[366] = -732731519;
        jn.knfa[367] = -1839601441;
        jn.knfa[368] = -1755612175;
        jn.knfa[369] = 294005303;
        jn.knfa[370] = -1076843254;
        jn.knfa[371] = -1939729448;
        jn.knfa[372] = 224769359;
        jn.knfa[373] = -75072102;
        jn.knfa[374] = 986802685;
        jn.knfa[375] = -746990367;
        jn.knfa[376] = -49265335;
        jn.knfa[377] = -512636434;
        jn.knfa[378] = 1347992367;
        jn.knfa[379] = -406538788;
        jn.knfa[380] = 355324095;
        jn.knfa[381] = 654574740;
        jn.knfa[382] = -782991024;
        jn.knfa[383] = 1777442951;
        jn.knfa[384] = -122035714;
        jn.knfa[385] = 1639578097;
        jn.knfa[386] = 644283231;
        jn.knfa[387] = -1983522335;
        jn.knfa[388] = -1508783531;
        jn.knfa[389] = -1289465487;
        jn.knfa[390] = -2037705632;
        jn.knfa[391] = -1580085306;
        jn.knfa[392] = -18773784;
        jn.knfa[393] = 597183950;
        jn.knfa[394] = -1748805556;
        jn.knfa[395] = 988978396;
        jn.knfa[396] = -252196157;
        jn.knfa[397] = -420098671;
        jn.knfa[398] = -1920023479;
        jn.knfa[399] = -15898958;
    }

    private static /* synthetic */ void kphr() {
        jn.knez[100] = 813015603;
        jn.knez[101] = -91408227;
        jn.knez[102] = -2051602050;
        jn.knez[103] = -492640143;
        jn.knez[104] = -653113608;
        jn.knez[105] = 1652046383;
        jn.knez[106] = 2049910126;
        jn.knez[107] = -843470662;
        jn.knez[108] = -479618310;
        jn.knez[109] = 1825295488;
        jn.knez[110] = 1166923834;
        jn.knez[111] = 1934306232;
        jn.knez[112] = -1642602495;
        jn.knez[113] = -773385564;
        jn.knez[114] = -400426469;
        jn.knez[115] = -526946134;
        jn.knez[116] = 1046971851;
        jn.knez[117] = 322278929;
        jn.knez[118] = 298498498;
        jn.knez[119] = 1374626360;
        jn.knez[120] = 1391423874;
        jn.knez[121] = 3111141;
        jn.knez[122] = 1028797817;
        jn.knez[123] = 2090725020;
        jn.knez[124] = 1665729272;
        jn.knez[125] = 509353008;
        jn.knez[126] = 442238059;
        jn.knez[127] = 569128276;
        jn.knez[128] = -544745356;
        jn.knez[129] = 737977325;
        jn.knez[130] = 2117678408;
        jn.knez[131] = 187658237;
        jn.knez[132] = 1085480181;
        jn.knez[133] = -1681960643;
        jn.knez[134] = 1666035438;
        jn.knez[135] = -994054573;
        jn.knez[136] = 1886621749;
        jn.knez[137] = 1755923673;
        jn.knez[138] = 2063322416;
        jn.knez[139] = 950242664;
        jn.knez[140] = -707496269;
        jn.knez[141] = 1565136671;
        jn.knez[142] = 2109306604;
        jn.knez[143] = -493610686;
        jn.knez[144] = -1155059196;
        jn.knez[145] = 800819437;
        jn.knez[146] = -1498970564;
        jn.knez[147] = 451147369;
        jn.knez[148] = 698600763;
        jn.knez[149] = -240755514;
        jn.knez[150] = -825467283;
        jn.knez[151] = -1635116130;
        jn.knez[152] = -1849574644;
        jn.knez[153] = 518107247;
        jn.knez[154] = -1162481220;
        jn.knez[155] = -70110747;
        jn.knez[156] = 2092356585;
        jn.knez[157] = -1889071577;
        jn.knez[158] = 1347160707;
        jn.knez[159] = 98697693;
        jn.knez[160] = 805522473;
        jn.knez[161] = -2140225579;
        jn.knez[162] = 434303040;
        jn.knez[163] = -1570209444;
        jn.knez[164] = -1559147614;
        jn.knez[165] = -1450073780;
        jn.knez[166] = 317093123;
        jn.knez[167] = -1798335013;
        jn.knez[168] = 1583797175;
        jn.knez[169] = -748764263;
        jn.knez[170] = -961973644;
        jn.knez[171] = -601446456;
        jn.knez[172] = -1237258219;
        jn.knez[173] = 132737051;
        jn.knez[174] = 1435387728;
        jn.knez[175] = -1814568457;
        jn.knez[176] = 1773296934;
        jn.knez[177] = -1531430246;
        jn.knez[178] = 463420396;
        jn.knez[179] = -559517475;
        jn.knez[180] = -745586425;
        jn.knez[181] = -651992226;
        jn.knez[182] = 1421355661;
        jn.knez[183] = 229262562;
        jn.knez[184] = -28138583;
        jn.knez[185] = -917750717;
        jn.knez[186] = 823557826;
        jn.knez[187] = 1391521653;
        jn.knez[188] = 12841508;
        jn.knez[189] = 277742795;
        jn.knez[190] = 2099336624;
        jn.knez[191] = 540504247;
        jn.knez[192] = 1861207434;
        jn.knez[193] = -843419231;
        jn.knez[194] = 1630863634;
        jn.knez[195] = -843468389;
        jn.knez[196] = 1775523041;
        jn.knez[197] = 67804321;
        jn.knez[198] = 1110569431;
        jn.knez[199] = -284174310;
    }

    private static /* synthetic */ void kpib() {
        jn.knfa[200] = 1197107845;
        jn.knfa[201] = -466515035;
        jn.knfa[202] = 574947582;
        jn.knfa[203] = -1555441347;
        jn.knfa[204] = 242251277;
        jn.knfa[205] = 1752431419;
        jn.knfa[206] = -1528344359;
        jn.knfa[207] = -433152388;
        jn.knfa[208] = -235423404;
        jn.knfa[209] = -1267418552;
        jn.knfa[210] = 309342977;
        jn.knfa[211] = 1354333660;
        jn.knfa[212] = 503316450;
        jn.knfa[213] = -170419470;
        jn.knfa[214] = -900660798;
        jn.knfa[215] = 909046205;
        jn.knfa[216] = -1455430421;
        jn.knfa[217] = 636833568;
        jn.knfa[218] = -1610817418;
        jn.knfa[219] = -1317451272;
        jn.knfa[220] = 155151853;
        jn.knfa[221] = 1824739862;
        jn.knfa[222] = -1167524054;
        jn.knfa[223] = -282533031;
        jn.knfa[224] = -140478170;
        jn.knfa[225] = -402168165;
        jn.knfa[226] = 1443867180;
        jn.knfa[227] = 1995430566;
        jn.knfa[228] = -406663557;
        jn.knfa[229] = 1229229965;
        jn.knfa[230] = -59752036;
        jn.knfa[231] = -474445545;
        jn.knfa[232] = 253335540;
        jn.knfa[233] = 1447235878;
        jn.knfa[234] = -1848976545;
        jn.knfa[235] = 888844601;
        jn.knfa[236] = -1493936429;
        jn.knfa[237] = -1103052160;
        jn.knfa[238] = 564105305;
        jn.knfa[239] = -2076436971;
        jn.knfa[240] = 1228510695;
        jn.knfa[241] = -1894354086;
        jn.knfa[242] = 1793032901;
        jn.knfa[243] = 141779709;
        jn.knfa[244] = -143853764;
        jn.knfa[245] = 750411543;
        jn.knfa[246] = 1824938449;
        jn.knfa[247] = 562247935;
        jn.knfa[248] = -702949303;
        jn.knfa[249] = -2126565042;
        jn.knfa[250] = 1041067465;
        jn.knfa[251] = 180726629;
        jn.knfa[252] = -27119726;
        jn.knfa[253] = -1502806830;
        jn.knfa[254] = 1849705421;
        jn.knfa[255] = 627802047;
        jn.knfa[256] = -1483744375;
        jn.knfa[257] = 671237880;
        jn.knfa[258] = 465577735;
        jn.knfa[259] = -663729287;
        jn.knfa[260] = -1641857713;
        jn.knfa[261] = 1965795436;
        jn.knfa[262] = -585971717;
        jn.knfa[263] = -1591748080;
        jn.knfa[264] = -1472229263;
        jn.knfa[265] = 1148426754;
        jn.knfa[266] = 1197428007;
        jn.knfa[267] = -1777341050;
        jn.knfa[268] = 515734614;
        jn.knfa[269] = 1715503841;
        jn.knfa[270] = -1712403641;
        jn.knfa[271] = 1713398722;
        jn.knfa[272] = -925944809;
        jn.knfa[273] = -688228998;
        jn.knfa[274] = -673723308;
        jn.knfa[275] = 879713657;
        jn.knfa[276] = -971143109;
        jn.knfa[277] = -1343423904;
        jn.knfa[278] = 1491810269;
        jn.knfa[279] = 307544481;
        jn.knfa[280] = -2088690816;
        jn.knfa[281] = -1685073301;
        jn.knfa[282] = 2135538159;
        jn.knfa[283] = 1291207833;
        jn.knfa[284] = -1696682949;
        jn.knfa[285] = -190618853;
        jn.knfa[286] = -1463193886;
        jn.knfa[287] = 2146282942;
        jn.knfa[288] = -413478180;
        jn.knfa[289] = -671743749;
        jn.knfa[290] = 1645249822;
        jn.knfa[291] = 1207440229;
        jn.knfa[292] = -2042274915;
        jn.knfa[293] = -336203477;
        jn.knfa[294] = -440146094;
        jn.knfa[295] = 2123346680;
        jn.knfa[296] = 1941039956;
        jn.knfa[297] = 1671578129;
        jn.knfa[298] = -64081411;
        jn.knfa[299] = -1888103131;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        block55: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knrj", kneg(int ), (int)91)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == jn.knej("knrk", kney(int ), (int)190)) break;
                v0 /* !! */  = (long)jn.knej("knrl", kney(int ), (int)191);
            }
            var4_1 = jn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knrm", kneg(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == jn.knej("knrt", kney(int ), (int)192)) break;
                v1 /* !! */  = (long)jn.knej("knrv", kney(int ), (int)193);
            }
            var3_2 /* !! */  = jn.b;
            v2 /* !! */  = jn.ss;
            if (true) ** GOTO lbl17
            block39: while (true) {
                v2 /* !! */  = (long)(v3 - jn.knej("knrw", kneg(int ), (int)93));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -543297653: {
                        v3 = jn.knej("knrx", kneg(int ), (int)94);
                        continue block39;
                    }
                    case 329958362: {
                        v3 = jn.knej("knrz", kneg(int ), (int)95);
                        continue block39;
                    }
                    case 878007493: {
                        break block39;
                    }
                    case 1222547963: {
                        v3 = jn.knej("knsu", kneg(int ), (int)96);
                        continue block39;
                    }
                }
                break;
            }
            var2_3 = jn.a;
            if (var4_1) {
                throw null;
lbl32:
                // 7 sources

                return;
            }
            if (var2_3) ** GOTO lbl32
            try {
                if (var2_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("knsw", kneg(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jn.knej("knsy", kney(int ), (int)194)) break;
                    v4 /* !! */  = (long)jn.knej("knsz", kney(int ), (int)195);
                }
                on.reset();
                if (var2_3 || var2_3) ** GOTO lbl32
                ** if (!var4_1) goto lbl-1000
            }
            catch (LinkageError var1_4) {
                if (var2_3 || var2_3) ** GOTO lbl32
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl53
            }
lbl-1000:
            // 1 sources

            {
                throw null;
            }
lbl-1000:
            // 1 sources

            {
                break block55;
            }
            block42: while (true) {
                v5 /* !! */  = (long)(jn.knej("kntd", kneg(int ), (int)99) - jn.knej("kntb", kneg(int ), (int)98));
lbl53:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 878007493: {
                        break block42;
                    }
                    case 887010287: {
                        continue block42;
                    }
                }
                break;
            }
            v6 = jn.knej("knte", kney(int ), (int)196);
            v7 /* !! */  = jn.ss;
            if (true) ** GOTO lbl63
            block43: while (true) {
                v7 /* !! */  = (long)(v8 - jn.knej("kntf", kneg(int ), (int)100));
lbl63:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2109357167: {
                        v8 = jn.knej("kntg", kneg(int ), (int)101);
                        continue block43;
                    }
                    case -1769778631: {
                        v8 = jn.knej("knth", kneg(int ), (int)102);
                        continue block43;
                    }
                    case -1085270830: {
                        v8 = jn.knej("knti", kneg(int ), (int)103);
                        continue block43;
                    }
                    case 878007493: {
                        break block43;
                    }
                }
                break;
            }
            this.trail.setValue((boolean)v6);
            if (var2_3) ** GOTO lbl32
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl32
                v9 = jn.knej("kntk", kney(int ), (int)197);
                v10 /* !! */  = jn.ss;
                if (true) ** GOTO lbl88
                block44: while (true) {
                    v10 /* !! */  = (long)(jn.knej("kntn", kneg(int ), (int)105) - jn.knej("kntm", kneg(int ), (int)104));
lbl88:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1353612558: {
                            continue block44;
                        }
                        case 878007493: {
                            break block44;
                        }
                    }
                    break;
                }
                this.renderCacheValid = v9;
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl97:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)jn.knej("kntp", kney(int ), (int)198);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl102:
            // 2 sources

            case 1: {
                do {
                    var3_2 /* !! */  = (int)jn.knej("kntq", kney(int ), (int)199);
                } while (!var4_1);
                throw null;
            }
lbl107:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)jn.knej("knts", kney(int ), (int)200);
                if (!var4_1) break;
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)jn.knej("kntt", kney(int ), (int)201);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl116:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)jn.knej("kntv", kney(int ), (int)202);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)jn.knej("kntw", kney(int ), (int)203);
                    if (!var4_1) break block17;
                    throw null;
                }
            }
lbl125:
            // 3 sources

            case 6: {
                var3_2 /* !! */  = (int)jn.knej("knty", kney(int ), (int)204);
                if (!var4_1) break;
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)jn.knej("kntz", kney(int ), (int)205);
                if (!var4_1) ** GOTO lbl125
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)jn.knej("knub", kney(int ), (int)206);
                if (!var4_1) ** GOTO lbl102
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)jn.knej("knuc", kney(int ), (int)207);
                if (!var4_1) ** GOTO lbl116
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)jn.knej("knue", kney(int ), (int)208);
                if (!var4_1) ** GOTO lbl125
                throw null;
            }
lbl145:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)jn.knej("knuf", kney(int ), (int)209);
                if (!var4_1) break;
                throw null;
            }
            case 12: 
        }
        var3_2 /* !! */  = (int)jn.knej("knuh", kney(int ), (int)210);
        ** while (!var4_1)
lbl152:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpia() {
        jn.knfa[100] = 813015602;
        jn.knfa[101] = 1259356690;
        jn.knfa[102] = -2051602050;
        jn.knfa[103] = -492640144;
        jn.knfa[104] = -275985550;
        jn.knfa[105] = 1652046382;
        jn.knfa[106] = -1512578127;
        jn.knfa[107] = -843470661;
        jn.knfa[108] = -479618312;
        jn.knfa[109] = 1825295490;
        jn.knfa[110] = 1166923833;
        jn.knfa[111] = 1934306233;
        jn.knfa[112] = 889531865;
        jn.knfa[113] = -773385564;
        jn.knfa[114] = -400426471;
        jn.knfa[115] = -526946133;
        jn.knfa[116] = 1046971851;
        jn.knfa[117] = 322278931;
        jn.knfa[118] = 298498499;
        jn.knfa[119] = -47109455;
        jn.knfa[120] = 1391423874;
        jn.knfa[121] = -3111142;
        jn.knfa[122] = -674024143;
        jn.knfa[123] = 2090725021;
        jn.knfa[124] = 1665729272;
        jn.knfa[125] = 509353012;
        jn.knfa[126] = 442238063;
        jn.knfa[127] = 569128284;
        jn.knfa[128] = -544745355;
        jn.knfa[129] = 737977320;
        jn.knfa[130] = 2117678413;
        jn.knfa[131] = 187658236;
        jn.knfa[132] = 1085480183;
        jn.knfa[133] = -1681960642;
        jn.knfa[134] = 1666035439;
        jn.knfa[135] = -1637750581;
        jn.knfa[136] = 1886621748;
        jn.knfa[137] = -892952825;
        jn.knfa[138] = -2063322417;
        jn.knfa[139] = -143833444;
        jn.knfa[140] = -707496270;
        jn.knfa[141] = 1565136668;
        jn.knfa[142] = 2109306605;
        jn.knfa[143] = -493610685;
        jn.knfa[144] = -1155059196;
        jn.knfa[145] = 800819436;
        jn.knfa[146] = -881929760;
        jn.knfa[147] = 451147368;
        jn.knfa[148] = 698600762;
        jn.knfa[149] = -104957126;
        jn.knfa[150] = -825467284;
        jn.knfa[151] = 1621766095;
        jn.knfa[152] = -1849574643;
        jn.knfa[153] = 1706541174;
        jn.knfa[154] = -1162481219;
        jn.knfa[155] = -70110747;
        jn.knfa[156] = 2092356586;
        jn.knfa[157] = -1889071570;
        jn.knfa[158] = 1347160705;
        jn.knfa[159] = 98697693;
        jn.knfa[160] = 805522477;
        jn.knfa[161] = -2140225578;
        jn.knfa[162] = 434303043;
        jn.knfa[163] = -1570209449;
        jn.knfa[164] = -1559147615;
        jn.knfa[165] = -1450073779;
        jn.knfa[166] = 317093123;
        jn.knfa[167] = -1798335009;
        jn.knfa[168] = -1583797176;
        jn.knfa[169] = -1076241423;
        jn.knfa[170] = -961973643;
        jn.knfa[171] = -434356804;
        jn.knfa[172] = -1237258219;
        jn.knfa[173] = 132737050;
        jn.knfa[174] = -154949748;
        jn.knfa[175] = -1814568458;
        jn.knfa[176] = 2132053828;
        jn.knfa[177] = 1531430245;
        jn.knfa[178] = 1862565939;
        jn.knfa[179] = -559517476;
        jn.knfa[180] = -745586425;
        jn.knfa[181] = -651992232;
        jn.knfa[182] = 1421355662;
        jn.knfa[183] = 229262561;
        jn.knfa[184] = -28138591;
        jn.knfa[185] = -917750709;
        jn.knfa[186] = 823557828;
        jn.knfa[187] = 1391521653;
        jn.knfa[188] = 12841509;
        jn.knfa[189] = 277742798;
        jn.knfa[190] = 2099336625;
        jn.knfa[191] = 1964961344;
        jn.knfa[192] = -1861207435;
        jn.knfa[193] = 399849438;
        jn.knfa[194] = 1630863635;
        jn.knfa[195] = -1171244553;
        jn.knfa[196] = 1775523041;
        jn.knfa[197] = 67804321;
        jn.knfa[198] = 1110569436;
        jn.knfa[199] = -284174318;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void forEachItemHaloOutlinePass(int var1_1, boolean var2_2, jn$HaloPassConsumer var3_3) {
        block84: {
            var7_4 = jn.c;
            var6_5 /* !! */  = jn.b;
            var5_6 = jn.a;
            if (var7_4) {
                throw null;
lbl6:
                // 19 sources

                return;
            }
            if (var5_6 || var5_6) ** GOTO lbl6
            if (var1_1 > jn.knej("kosm", kney(int ), (int)561)) break block84;
            if (var5_6 || var5_6) ** GOTO lbl6
            if (var2_2) {
                v0 = jn.knej("kosn", kney(int ), (int)562);
                if (var7_4) {
                    throw null;
                }
            } else {
                v0 = jn.knej("koso", kney(int ), (int)563);
            }
            this.forEachReducedHaloPass(var3_3, (int)v0);
            if (var5_6 || var5_6) ** GOTO lbl6
            return;
        }
        if (var5_6 || var5_6) ** GOTO lbl6
        if (var1_1 < jn.knej("kosp", kney(int ), (int)564)) ** GOTO lbl39
        if (var5_6 || var5_6) ** GOTO lbl6
        if (!var2_2) ** GOTO lbl33
        if (var5_6) ** GOTO lbl6
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v1 = jn.knej("kosq", kney(int ), (int)565);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl35
            }
lbl33:
            // 1 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            v1 = var4_7 = jn.knej("kosr", kney(int ), (int)566);
lbl35:
            // 2 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            if (var7_4) {
                throw null;
            }
            ** GOTO lbl64
lbl39:
            // 1 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            if (var1_1 < jn.knej("koss", kney(int ), (int)567)) ** GOTO lbl54
            if (var5_6 || var5_6) ** GOTO lbl6
            if (!var2_2) ** GOTO lbl48
            if (var5_6) ** GOTO lbl6
            v2 = jn.knej("kost", kney(int ), (int)568);
            if (var7_4) {
                throw null;
            }
            ** GOTO lbl50
lbl48:
            // 1 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            v2 = var4_7 = jn.knej("kosu", kney(int ), (int)569);
lbl50:
            // 2 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            if (var7_4) {
                throw null;
            }
            ** GOTO lbl64
lbl54:
            // 1 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            if (!var2_2) ** GOTO lbl61
            if (var5_6) ** GOTO lbl6
            v3 = jn.knej("kosv", kney(int ), (int)570);
            if (var7_4) {
                throw null;
            }
            ** GOTO lbl63
lbl61:
            // 1 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            v3 = var4_7 = jn.knej("kosw", kney(int ), (int)571);
lbl63:
            // 2 sources

            if (var5_6) ** GOTO lbl6
lbl64:
            // 3 sources

            if (var5_6 || var5_6) ** GOTO lbl6
            this.forEachReducedHaloPass(var3_3, (int)var4_7);
            if (!var5_6 && !var5_6) ** break;
            ** continue;
            return;
lbl69:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)jn.knej("kosx", kney(int ), (int)572);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 1: {
                var6_5 /* !! */  = (int)jn.knej("kosy", kney(int ), (int)573);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl79:
            // 4 sources

            case 2: {
                var6_5 /* !! */  = (int)jn.knej("kosz", kney(int ), (int)574);
                if (!var7_4) break;
                throw null;
            }
            case 3: {
                var6_5 /* !! */  = (int)jn.knej("kota", kney(int ), (int)575);
                if (!var7_4) ** GOTO lbl69
                throw null;
            }
lbl87:
            // 3 sources

            case 4: {
                var6_5 /* !! */  = (int)jn.knej("kotb", kney(int ), (int)576);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 5: {
                var6_5 /* !! */  = (int)jn.knej("kotc", kney(int ), (int)577);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl97:
            // 2 sources

            case 6: {
                var6_5 /* !! */  = (int)jn.knej("kotd", kney(int ), (int)578);
                if (!var7_4) ** GOTO lbl79
                throw null;
            }
lbl101:
            // 2 sources

            case 7: {
                var6_5 /* !! */  = (int)jn.knej("kote", kney(int ), (int)579);
                if (var7_4) {
                    throw null;
                }
            }
            case 8: {
                var6_5 /* !! */  = (int)jn.knej("kotf", kney(int ), (int)580);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl110:
            // 3 sources

            case 9: {
                var6_5 /* !! */  = (int)jn.knej("kotg", kney(int ), (int)581);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 10: {
                var6_5 /* !! */  = (int)jn.knej("koth", kney(int ), (int)582);
                if (!var7_4) ** GOTO lbl79
                throw null;
            }
lbl119:
            // 3 sources

            case 11: {
                var6_5 /* !! */  = (int)jn.knej("koti", kney(int ), (int)583);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 12: {
                var6_5 /* !! */  = (int)jn.knej("kotj", kney(int ), (int)584);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 13: {
                var6_5 /* !! */  = (int)jn.knej("kotk", kney(int ), (int)585);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 14: {
                var6_5 /* !! */  = (int)jn.knej("kotl", kney(int ), (int)586);
                if (!var7_4) ** GOTO lbl119
                throw null;
            }
lbl138:
            // 3 sources

            case 15: {
                var6_5 /* !! */  = (int)jn.knej("kotm", kney(int ), (int)587);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 16: {
                var6_5 /* !! */  = (int)jn.knej("kotn", kney(int ), (int)588);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl148:
            // 3 sources

            case 17: {
                var6_5 /* !! */  = (int)jn.knej("koto", kney(int ), (int)589);
                if (!var7_4) ** GOTO lbl101
                throw null;
            }
lbl152:
            // 2 sources

            case 18: {
                var6_5 /* !! */  = (int)jn.knej("kotp", kney(int ), (int)590);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 19: {
                var6_5 /* !! */  = (int)jn.knej("kotq", kney(int ), (int)591);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 20: {
                var6_5 /* !! */  = (int)jn.knej("kotr", kney(int ), (int)592);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl167:
            // 2 sources

            case 21: {
                var6_5 /* !! */  = (int)jn.knej("kots", kney(int ), (int)593);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 22: {
                var6_5 /* !! */  = (int)jn.knej("kott", kney(int ), (int)594);
                if (!var7_4) ** GOTO lbl87
                throw null;
            }
            case 23: {
                var6_5 /* !! */  = (int)jn.knej("kotu", kney(int ), (int)595);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl181:
            // 2 sources

            case 24: {
                var6_5 /* !! */  = (int)jn.knej("kotv", kney(int ), (int)596);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl186:
            // 2 sources

            case 25: {
                var6_5 /* !! */  = (int)jn.knej("kotw", kney(int ), (int)597);
                if (!var7_4) ** GOTO lbl69
                throw null;
            }
lbl190:
            // 2 sources

            case 26: {
                var6_5 /* !! */  = (int)jn.knej("kotx", kney(int ), (int)598);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl195:
            // 2 sources

            case 27: {
                var6_5 /* !! */  = (int)jn.knej("koty", kney(int ), (int)599);
                if (!var7_4) ** GOTO lbl110
                throw null;
            }
lbl199:
            // 3 sources

            case 28: {
                var6_5 /* !! */  = (int)jn.knej("kotz", kney(int ), (int)600);
                if (!var7_4) ** GOTO lbl138
                throw null;
            }
lbl203:
            // 3 sources

            case 29: {
                var6_5 /* !! */  = (int)jn.knej("koua", kney(int ), (int)601);
                if (!var7_4) ** GOTO lbl148
                throw null;
            }
lbl207:
            // 2 sources

            case 30: {
                var6_5 /* !! */  = (int)jn.knej("koub", kney(int ), (int)602);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl212:
            // 3 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)jn.knej("kouc", kney(int ), (int)603);
                    if (!var7_4) ** GOTO lbl79
                    throw null;
                }
            }
lbl217:
            // 3 sources

            case 32: {
                var6_5 /* !! */  = (int)jn.knej("koud", kney(int ), (int)604);
                if (!var7_4) ** GOTO lbl119
                throw null;
            }
            case 33: {
                var6_5 /* !! */  = (int)jn.knej("koue", kney(int ), (int)605);
                if (!var7_4) ** GOTO lbl97
                throw null;
            }
lbl225:
            // 3 sources

            case 34: {
                var6_5 /* !! */  = (int)jn.knej("kouf", kney(int ), (int)606);
                if (!var7_4) ** GOTO lbl190
                throw null;
            }
lbl229:
            // 2 sources

            case 35: {
                var6_5 /* !! */  = (int)jn.knej("koug", kney(int ), (int)607);
                if (!var7_4) ** GOTO lbl217
                throw null;
            }
            case 36: {
                var6_5 /* !! */  = (int)jn.knej("kouh", kney(int ), (int)608);
                if (!var7_4) ** GOTO lbl167
                throw null;
            }
lbl237:
            // 2 sources

            case 37: {
                var6_5 /* !! */  = (int)jn.knej("koui", kney(int ), (int)609);
                if (!var7_4) ** GOTO lbl87
                throw null;
            }
            case 38: 
        }
        var6_5 /* !! */  = (int)jn.knej("kouj", kney(int ), (int)610);
        ** while (!var7_4)
lbl244:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int packColor1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knyx", kneg(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jn.knej("knyy", kney(int ), (int)266)) break;
            v0 /* !! */  = (long)jn.knej("knza", kney(int ), (int)267);
        }
        var3_1 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("knzc", kneg(int ), (int)125)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jn.knej("knze", kney(int ), (int)268)) break;
            v1 /* !! */  = (long)jn.knej("knzf", kney(int ), (int)269);
        }
        var2_2 /* !! */  = jn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("knzh", kneg(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jn.knej("knzj", kney(int ), (int)270)) {
                var1_3 = jn.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)jn.knej("knzl", kney(int ), (int)271);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (int)jn.knej("knzm", kney(int ), (int)272);
                    if (var1_3 != false) return (int)jn.knej("knzm", kney(int ), (int)272);
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("knzo", kneg(int ), (int)127)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  != jn.knej("knzp", kney(int ), (int)273)) ** GOTO lbl37
                        this.ensureRenderCache();
                        if (var1_3 != false) return (int)jn.knej("knzm", kney(int ), (int)272);
                        if (var1_3 != false) return (int)jn.knej("knzm", kney(int ), (int)272);
                        v4 /* !! */  = jn.ss;
                        if (true) ** GOTO lbl54
lbl37:
                        // 1 sources

                        v3 /* !! */  = (long)jn.knej("knzq", kney(int ), (int)274);
                    }
                }
                case 0: {
                    var2_2 /* !! */  = (int)jn.knej("knzw", kney(int ), (int)275);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)jn.knej("knzx", kney(int ), (int)276);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    ** GOTO lbl74
                }
                case 5: {
                    ** GOTO lbl71
                }
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - jn.knej("knzr", kneg(int ), (int)128));
lbl54:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1691400585: {
                            v5 = jn.knej("knzt", kneg(int ), (int)129);
                            continue block20;
                        }
                        case -337504397: {
                            v5 = jn.knej("knzu", kneg(int ), (int)130);
                            continue block20;
                        }
                        case 878007493: {
                            return this.frameColor1;
                        }
                        case 2085298981: {
                            v5 = jn.knej("knzv", kneg(int ), (int)131);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.frameColor1;
                case 2: {
                    var2_2 /* !! */  = (int)jn.knej("knzz", kney(int ), (int)277);
                    if (var3_1) {
                        throw null;
                    }
lbl71:
                    // 3 sources

                    var2_2 /* !! */  = (int)jn.knej("koae", kney(int ), (int)280);
                    if (var3_1) {
                        throw null;
                    }
lbl74:
                    // 3 sources

                    var2_2 /* !! */  = (int)jn.knej("koaa", kney(int ), (int)278);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 4: 
            }
            if (true) ** GOTO lbl81
            break;
        }
        do {
            if (true) ** continue;
lbl81:
            // 2 sources

            var2_2 /* !! */  = (int)jn.knej("koac", kney(int ), (int)279);
            cfr_temp_0 = 2;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void forEachHaloOutlinePass(jn$HaloPassConsumer var1_1) {
        v0 /* !! */  = jn.ss;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - jn.knej("koqc", kneg(int ), (int)219));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 700461046: {
                    v1 = jn.knej("koqd", kneg(int ), (int)220);
                    continue block19;
                }
                case 878007493: {
                    break block19;
                }
                case 1499448750: {
                    v1 = jn.knej("koqe", kneg(int ), (int)221);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = jn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("koqf", kneg(int ), (int)222)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jn.knej("koqg", kney(int ), (int)525)) break;
            v2 /* !! */  = (long)jn.knej("koqh", kney(int ), (int)526);
        }
        var3_3 /* !! */  = jn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("koqi", kneg(int ), (int)223)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jn.knej("koqj", kney(int ), (int)527)) break;
            v3 /* !! */  = (long)jn.knej("koqk", kney(int ), (int)528);
        }
        var2_4 = jn.a;
        if (var4_2) {
            throw null;
lbl31:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 = jn.knej("koql", kney(int ), (int)529);
        v5 /* !! */  = jn.ss;
        if (true) ** GOTO lbl39
        block23: while (true) {
            v5 /* !! */  = (long)(v6 - jn.knej("koqm", kneg(int ), (int)224));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -120701895: {
                    v6 = jn.knej("koqn", kneg(int ), (int)225);
                    continue block23;
                }
                case 878007493: {
                    break block23;
                }
                case 1045621989: {
                    v6 = jn.knej("koqo", kneg(int ), (int)226);
                    continue block23;
                }
                case 1904993182: {
                    v6 = jn.knej("koqp", kneg(int ), (int)227);
                    continue block23;
                }
            }
            break;
        }
        this.forEachReducedHaloPass(var1_1, (int)v4);
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jn.knej("koqq", kney(int ), (int)530);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl64:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)jn.knej("koqr", kney(int ), (int)531);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)jn.knej("koqs", kney(int ), (int)532);
                } while (!var4_2);
                throw null;
            }
lbl74:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)jn.knej("koqt", kney(int ), (int)533);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)jn.knej("koqu", kney(int ), (int)534);
                } while (!var4_2);
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)jn.knej("koqv", kney(int ), (int)535);
        ** while (!var4_2)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpih() {
        jn.knfa[800] = -1640324513;
        jn.knfa[801] = -1584592831;
        jn.knfa[802] = -301087745;
        jn.knfa[803] = -177989203;
        jn.knfa[804] = -20239961;
        jn.knfa[805] = -690663104;
        jn.knfa[806] = 943770219;
        jn.knfa[807] = -878519878;
        jn.knfa[808] = 185265839;
        jn.knfa[809] = 1689200778;
        jn.knfa[810] = 2105402004;
        jn.knfa[811] = 877376556;
        jn.knfa[812] = 1394889510;
        jn.knfa[813] = 1792892518;
        jn.knfa[814] = -138188709;
        jn.knfa[815] = -1374785584;
        jn.knfa[816] = -965127899;
        jn.knfa[817] = 1260258377;
        jn.knfa[818] = -1408668641;
        jn.knfa[819] = -1123273655;
        jn.knfa[820] = 366726820;
        jn.knfa[821] = -1659884236;
        jn.knfa[822] = -1038191282;
        jn.knfa[823] = 1662475025;
        jn.knfa[824] = 1681077295;
        jn.knfa[825] = 806015066;
        jn.knfa[826] = -2081072578;
        jn.knfa[827] = -1825518403;
        jn.knfa[828] = 123222744;
        jn.knfa[829] = 413970948;
        jn.knfa[830] = -648527555;
        jn.knfa[831] = 103247492;
        jn.knfa[832] = -1173674641;
        jn.knfa[833] = 34043577;
        jn.knfa[834] = 1738677990;
        jn.knfa[835] = -1316854783;
        jn.knfa[836] = 1299699952;
        jn.knfa[837] = -1815722855;
        jn.knfa[838] = 1164002742;
        jn.knfa[839] = 86452535;
        jn.knfa[840] = -1744926660;
        jn.knfa[841] = -908945655;
        jn.knfa[842] = -1260725538;
        jn.knfa[843] = -71776042;
        jn.knfa[844] = -275757990;
        jn.knfa[845] = 1975366332;
        jn.knfa[846] = 1701110850;
        jn.knfa[847] = -1938950466;
        jn.knfa[848] = 756266335;
        jn.knfa[849] = -823924825;
        jn.knfa[850] = -695624448;
        jn.knfa[851] = 1065708160;
        jn.knfa[852] = -2085452274;
        jn.knfa[853] = 2015131153;
        jn.knfa[854] = -982112442;
        jn.knfa[855] = -1209857512;
        jn.knfa[856] = 2088769138;
        jn.knfa[857] = 675350532;
        jn.knfa[858] = 396098444;
        jn.knfa[859] = 62294925;
        jn.knfa[860] = -652743689;
        jn.knfa[861] = 1797556829;
        jn.knfa[862] = -1179345770;
        jn.knfa[863] = 1460222650;
        jn.knfa[864] = -79052632;
        jn.knfa[865] = -289502680;
        jn.knfa[866] = 596939266;
        jn.knfa[867] = -1747819388;
        jn.knfa[868] = 892807470;
        jn.knfa[869] = -1209263125;
        jn.knfa[870] = 354548035;
        jn.knfa[871] = -636857744;
        jn.knfa[872] = 581927625;
        jn.knfa[873] = -86849969;
        jn.knfa[874] = -575860889;
        jn.knfa[875] = -1284072641;
        jn.knfa[876] = -703526763;
        jn.knfa[877] = 961240446;
        jn.knfa[878] = 919583390;
        jn.knfa[879] = 312910346;
        jn.knfa[880] = 1900608848;
        jn.knfa[881] = 1594594933;
        jn.knfa[882] = 491005142;
        jn.knfa[883] = -1676050653;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isTrailEnabled() {
        block45: {
            v0 /* !! */  = jn.ss;
            if (true) ** GOTO lbl5
            block26: while (true) {
                v0 /* !! */  = (long)(v1 - jn.knej("knlf", kneg(int ), (int)52));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1818371714: {
                        v1 = jn.knej("knlg", kneg(int ), (int)53);
                        continue block26;
                    }
                    case -1746411937: {
                        v1 = jn.knej("knlh", kneg(int ), (int)54);
                        continue block26;
                    }
                    case 878007493: {
                        break block26;
                    }
                }
                break;
            }
            var3_1 = jn.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knlj", kneg(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == jn.knej("knll", kney(int ), (int)118)) break;
                v2 /* !! */  = (long)jn.knej("knlm", kney(int ), (int)119);
            }
            var2_2 /* !! */  = jn.b;
            v3 /* !! */  = jn.ss;
            if (true) ** GOTO lbl26
            block28: while (true) {
                v3 /* !! */  = (long)(v4 - jn.knej("knlo", kneg(int ), (int)56));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2038759418: {
                        v4 = jn.knej("knlp", kneg(int ), (int)57);
                        continue block28;
                    }
                    case -1995435493: {
                        v4 = jn.knej("knlq", kneg(int ), (int)58);
                        continue block28;
                    }
                    case 493932634: {
                        v4 = jn.knej("knlr", kneg(int ), (int)59);
                        continue block28;
                    }
                    case 878007493: {
                        break block28;
                    }
                }
                break;
            }
            var1_3 = jn.a;
            if (var3_1) {
                throw null;
lbl41:
                // 4 sources

                return (boolean)jn.knej("knls", kney(int ), (int)120);
            }
            if (var1_3 || var1_3) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knlt", kneg(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == jn.knej("knlv", kney(int ), (int)121)) break;
                v5 /* !! */  = (long)jn.knej("knlx", kney(int ), (int)122);
            }
            if (!this.isState()) break block45;
            if (var1_3) ** GOTO lbl41
            v6 /* !! */  = jn.ss;
            if (true) ** GOTO lbl56
            block31: while (true) {
                v6 /* !! */  = (long)(jn.knej("knma", kneg(int ), (int)62) - jn.knej("knly", kneg(int ), (int)61));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -624269229: {
                        continue block31;
                    }
                    case 878007493: {
                        break block31;
                    }
                }
                break;
            }
            if (!this.isTrailSelected()) break block45;
            if (var1_3) ** GOTO lbl41
            v7 = jn.knej("knmb", kney(int ), (int)123);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl74
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 = jn.knej("knmd", kney(int ), (int)124);
lbl74:
                // 2 sources

                return (boolean)v7;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knme", kney(int ), (int)125);
                } while (!var3_1);
                throw null;
            }
lbl80:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jn.knej("knmg", kney(int ), (int)126);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jn.knej("knmi", kney(int ), (int)127);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl89:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knmk", kney(int ), (int)128);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jn.knej("knmn", kney(int ), (int)129);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)jn.knej("knmp", kney(int ), (int)130);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 6: {
                var2_2 /* !! */  = (int)jn.knej("knmq", kney(int ), (int)131);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl107:
            // 3 sources

            case 7: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knmr", kney(int ), (int)132);
                } while (!var3_1);
                throw null;
            }
            case 8: 
        }
        do {
            var2_2 /* !! */  = (int)jn.knej("knms", kney(int ), (int)133);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kphz() {
        jn.knfa[0] = -531700205;
        jn.knfa[1] = 231678346;
        jn.knfa[2] = -1203936321;
        jn.knfa[3] = 1988212500;
        jn.knfa[4] = 2049849151;
        jn.knfa[5] = -1897901877;
        jn.knfa[6] = 232307663;
        jn.knfa[7] = -1998141828;
        jn.knfa[8] = -795416579;
        jn.knfa[9] = -1191963063;
        jn.knfa[10] = 1912676273;
        jn.knfa[11] = -282675088;
        jn.knfa[12] = 1261936729;
        jn.knfa[13] = 893178578;
        jn.knfa[14] = -1589274557;
        jn.knfa[15] = -1985430356;
        jn.knfa[16] = 714814824;
        jn.knfa[17] = 1671167252;
        jn.knfa[18] = 243123514;
        jn.knfa[19] = 1196872506;
        jn.knfa[20] = -907104716;
        jn.knfa[21] = 1834317188;
        jn.knfa[22] = 78867763;
        jn.knfa[23] = -1745740556;
        jn.knfa[24] = -1091689488;
        jn.knfa[25] = 1984541825;
        jn.knfa[26] = -1551074552;
        jn.knfa[27] = -2143473593;
        jn.knfa[28] = -1799163533;
        jn.knfa[29] = 589444792;
        jn.knfa[30] = -1916339099;
        jn.knfa[31] = 1408267833;
        jn.knfa[32] = -1135548957;
        jn.knfa[33] = 464374729;
        jn.knfa[34] = 274593178;
        jn.knfa[35] = -1775709268;
        jn.knfa[36] = -1978175824;
        jn.knfa[37] = -1268733142;
        jn.knfa[38] = 1527193265;
        jn.knfa[39] = -1522457885;
        jn.knfa[40] = 1118235844;
        jn.knfa[41] = 1254519628;
        jn.knfa[42] = -1255744061;
        jn.knfa[43] = 386613573;
        jn.knfa[44] = 1241098488;
        jn.knfa[45] = 1290958587;
        jn.knfa[46] = -1638329721;
        jn.knfa[47] = 2120594785;
        jn.knfa[48] = 990059465;
        jn.knfa[49] = 769457418;
        jn.knfa[50] = -2071820501;
        jn.knfa[51] = 2004300082;
        jn.knfa[52] = -1564509109;
        jn.knfa[53] = 1717720622;
        jn.knfa[54] = 1145576039;
        jn.knfa[55] = -1935051613;
        jn.knfa[56] = 1748134758;
        jn.knfa[57] = -343283554;
        jn.knfa[58] = 1321023867;
        jn.knfa[59] = 967125205;
        jn.knfa[60] = -1354110504;
        jn.knfa[61] = 49575628;
        jn.knfa[62] = -590280736;
        jn.knfa[63] = -766517603;
        jn.knfa[64] = 1557661528;
        jn.knfa[65] = -1837937699;
        jn.knfa[66] = 1384655213;
        jn.knfa[67] = -1481333421;
        jn.knfa[68] = -1668567255;
        jn.knfa[69] = 2002904631;
        jn.knfa[70] = 810156977;
        jn.knfa[71] = 492353383;
        jn.knfa[72] = -1529036345;
        jn.knfa[73] = 2086859144;
        jn.knfa[74] = -375118243;
        jn.knfa[75] = 171532509;
        jn.knfa[76] = 57426283;
        jn.knfa[77] = -7298151;
        jn.knfa[78] = 403725407;
        jn.knfa[79] = -649573994;
        jn.knfa[80] = -1611203632;
        jn.knfa[81] = 498893690;
        jn.knfa[82] = 1674982755;
        jn.knfa[83] = -2040653448;
        jn.knfa[84] = 1889595413;
        jn.knfa[85] = 565163071;
        jn.knfa[86] = 846634078;
        jn.knfa[87] = 574776362;
        jn.knfa[88] = 1429079768;
        jn.knfa[89] = -743840942;
        jn.knfa[90] = -748753715;
        jn.knfa[91] = -1472173930;
        jn.knfa[92] = -1494621327;
        jn.knfa[93] = 556966202;
        jn.knfa[94] = -2004160273;
        jn.knfa[95] = 2047157750;
        jn.knfa[96] = -1223108707;
        jn.knfa[97] = -1207230400;
        jn.knfa[98] = 601578652;
        jn.knfa[99] = 1635845107;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void forEachHaloFillPass(jn$HaloPassConsumer var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("koqw", kneg(int ), (int)228)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jn.knej("koqx", kney(int ), (int)536)) break;
            v0 /* !! */  = (long)jn.knej("koqy", kney(int ), (int)537);
        }
        var4_2 = jn.c;
        v1 /* !! */  = jn.ss;
        if (true) ** GOTO lbl11
        block33: while (true) {
            v1 /* !! */  = (long)(v2 - jn.knej("koqz", kneg(int ), (int)229));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2100868795: {
                    v2 = jn.knej("kora", kneg(int ), (int)230);
                    continue block33;
                }
                case -554149161: {
                    v2 = jn.knej("korb", kneg(int ), (int)231);
                    continue block33;
                }
                case -199840372: {
                    v2 = jn.knej("korc", kneg(int ), (int)232);
                    continue block33;
                }
                case 878007493: {
                    break block33;
                }
            }
            break;
        }
        var3_3 /* !! */  = jn.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kord", kneg(int ), (int)233)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == jn.knej("kore", kney(int ), (int)538)) break;
                    v3 /* !! */  = (long)jn.knej("korf", kney(int ), (int)539);
                }
                var2_4 = jn.a;
                if (var4_2) {
                    throw null;
lbl35:
                    // 5 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl35
                v4 /* !! */  = jn.ss;
                if (true) ** GOTO lbl42
                block36: while (true) {
                    v4 /* !! */  = (long)(v5 - jn.knej("korg", kneg(int ), (int)234));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1591805554: {
                            v5 = jn.knej("korh", kneg(int ), (int)235);
                            continue block36;
                        }
                        case 305598326: {
                            v5 = jn.knej("kori", kneg(int ), (int)236);
                            continue block36;
                        }
                        case 878007493: {
                            break block36;
                        }
                    }
                    break;
                }
                this.ensureRenderCache();
                if (var2_4 || var2_4) ** GOTO lbl35
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("korj", kneg(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jn.knej("kork", kney(int ), (int)540)) break;
                    v6 /* !! */  = (long)jn.knej("korl", kney(int ), (int)541);
                }
                if (!(this.fillFraction() > jn.knej("korm", knff(int ), (int)542))) ** GOTO lbl97
                if (var2_4 || var2_4) ** GOTO lbl35
                v7 /* !! */  = jn.ss;
                if (true) ** GOTO lbl64
                block38: while (true) {
                    v7 /* !! */  = (long)(jn.knej("koro", kneg(int ), (int)239) - jn.knej("korn", kneg(int ), (int)238));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 396522886: {
                            continue block38;
                        }
                        case 878007493: {
                            break block38;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("korp", kneg(int ), (int)240)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jn.knej("korq", kney(int ), (int)543)) break;
                    v8 /* !! */  = (long)jn.knej("korr", kney(int ), (int)544);
                }
                v9 = this.fillFraction() * jn.knej("kors", knff(int ), (int)545);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("kort", kneg(int ), (int)241)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == jn.knej("koru", kney(int ), (int)546)) break;
                    v10 /* !! */  = (long)jn.knej("korv", kney(int ), (int)547);
                }
                v11 = oo.packColorAlpha(this.framePrimaryColor, v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = jn.ss - jn.knej("korw", kneg(int ), (int)242)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == jn.knej("korx", kney(int ), (int)548)) break;
                    v12 /* !! */  = (long)jn.knej("kory", kney(int ), (int)549);
                }
                v13 /* !! */  = jn.ss;
                if (true) ** GOTO lbl90
                block42: while (true) {
                    v13 /* !! */  = (long)(jn.knej("kosa", kneg(int ), (int)244) - jn.knej("korz", kneg(int ), (int)243));
lbl90:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 878007493: {
                            break block42;
                        }
                        case 1701004612: {
                            continue block42;
                        }
                    }
                    break;
                }
                var1_1.accept(v11, this.frameTrailModelOverlay);
                if (var2_4) ** GOTO lbl35
lbl97:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl100:
            // 4 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jn.knej("kosb", kney(int ), (int)550);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl138
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)jn.knej("kosc", kney(int ), (int)551);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: {
                var3_3 /* !! */  = (int)jn.knej("kosd", kney(int ), (int)552);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)jn.knej("kose", kney(int ), (int)553);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)jn.knej("kosf", kney(int ), (int)554);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl124:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)jn.knej("kosg", kney(int ), (int)555);
                } while (!var4_2);
                throw null;
            }
lbl129:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jn.knej("kosh", kney(int ), (int)556);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)jn.knej("kosi", kney(int ), (int)557);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl138:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)jn.knej("kosj", kney(int ), (int)558);
                if (!var4_2) ** GOTO lbl124
                throw null;
            }
lbl142:
            // 3 sources

            case 9: {
                do {
                    var3_3 /* !! */  = (int)jn.knej("kosk", kney(int ), (int)559);
                } while (!var4_2);
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)jn.knej("kosl", kney(int ), (int)560);
        ** while (!var4_2)
lbl150:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getSecondaryColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kpch", kneg(int ), (int)282)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jn.knej("kpci", kney(int ), (int)779)) break;
            v0 /* !! */  = (long)jn.knej("kpcj", kney(int ), (int)780);
        }
        var3_1 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kpck", kneg(int ), (int)283)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jn.knej("kpcl", kney(int ), (int)781)) break;
            v1 /* !! */  = (long)jn.knej("kpcm", kney(int ), (int)782);
        }
        var2_2 /* !! */  = jn.b;
        v2 /* !! */  = jn.ss;
        block20: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -333236475: {
                    v2 /* !! */  = (long)(jn.knej("kpco", kneg(int ), (int)285) - jn.knej("kpcn", kneg(int ), (int)284));
                    continue block20;
                }
                case 878007493: {
                    break block20;
                }
            }
            break;
        }
        var1_3 = jn.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: while (true) {
            block36: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return (int)jn.knej("kpcp", kney(int ), (int)783);
                        if (var1_3 != false) return (int)jn.knej("kpcp", kney(int ), (int)783);
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("kpcq", kneg(int ), (int)286)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  != jn.knej("kpcr", kney(int ), (int)784)) ** GOTO lbl36
                            v4 /* !! */  = jn.ss;
                            ** GOTO lbl69
lbl36:
                            // 1 sources

                            v3 /* !! */  = (long)jn.knej("kpcs", kney(int ), (int)785);
                        }
                    }
                    case 1: {
                        do {
                            var2_2 /* !! */  = (int)jn.knej("kpdb", kney(int ), (int)791);
                        } while (!var3_1);
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)jn.knej("kpdc", kney(int ), (int)792);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block36;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)jn.knej("kpdf", kney(int ), (int)795);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        ** GOTO lbl64
                    }
                    case 6: {
                        do {
                            var2_2 /* !! */  = (int)jn.knej("kpdg", kney(int ), (int)796);
                        } while (!var3_1);
                        throw null;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)jn.knej("kpdh", kney(int ), (int)797);
                        if (var3_1) {
                            throw null;
                        }
lbl64:
                        // 3 sources

                        var2_2 /* !! */  = (int)jn.knej("kpdd", kney(int ), (int)793);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block36;
                    }
lbl69:
                    // 1 sources

                    block25: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -507875711: {
                                v4 /* !! */  = (long)(jn.knej("kpcu", kneg(int ), (int)288) - jn.knej("kpct", kneg(int ), (int)287));
                                continue block25;
                            }
                            case 878007493: {
                                break block25;
                            }
                        }
                        break;
                    }
                    if (!this.colorMode.isSelected("\u041e\u0442 \u0442\u0435\u043c\u044b")) {
                        if (var1_3 != false) return (int)jn.knej("kpcp", kney(int ), (int)783);
                        if (var1_3 != false) return (int)jn.knej("kpcp", kney(int ), (int)783);
                        return (int)jn.knej("kpcz", kney(int ), (int)789);
                    }
                    if (var1_3 != false) return (int)jn.knej("kpcp", kney(int ), (int)783);
                    v5 = jn.knej("kpcv", knff(int ), (int)786);
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("kpcw", kneg(int ), (int)289)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == jn.knej("kpcx", kney(int ), (int)787)) {
                            return nd.getClientColorAt((float)v5);
                        }
                        v6 /* !! */  = (long)jn.knej("kpcy", kney(int ), (int)788);
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)jn.knej("kpda", kney(int ), (int)790);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl97
            }
            do {
                if (true) continue block21;
lbl97:
                // 2 sources

                var2_2 /* !! */  = (int)jn.knej("kpde", kney(int ), (int)794);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float fillFraction() {
        block35: {
            v0 /* !! */  = jn.ss;
            if (true) ** GOTO lbl5
            block18: while (true) {
                v0 /* !! */  = (long)(jn.knej("knhh", kneg(int ), (int)15) - jn.knej("knhg", kneg(int ), (int)14));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -570781901: {
                        continue block18;
                    }
                    case 878007493: {
                        break block18;
                    }
                }
                break;
            }
            var3_1 = jn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knhi", kneg(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == jn.knej("knhj", kney(int ), (int)56)) break;
                v1 /* !! */  = (long)jn.knej("knhk", kney(int ), (int)57);
            }
            var2_2 /* !! */  = jn.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knhl", kneg(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == jn.knej("knhm", kney(int ), (int)58)) break;
                v2 /* !! */  = (long)jn.knej("knhn", kney(int ), (int)59);
            }
            var1_3 = jn.a;
            if (var3_1) {
                throw null;
lbl25:
                // 4 sources

                return (float)jn.knej("knho", knff(int ), (int)60);
            }
            if (var1_3 || var1_3) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("knhp", kneg(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == jn.knej("knhq", kney(int ), (int)61)) break;
                v3 /* !! */  = (long)jn.knej("knhr", kney(int ), (int)62);
            }
            if (!this.renderCacheValid) break block35;
            if (var1_3) ** GOTO lbl25
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("knhs", kneg(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == jn.knej("knht", kney(int ), (int)63)) break;
                v4 /* !! */  = (long)jn.knej("knhu", kney(int ), (int)64);
            }
            v5 = this.frameFill;
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl66
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v6 /* !! */  = jn.ss;
                if (true) ** GOTO lbl55
                block24: while (true) {
                    v6 /* !! */  = (long)(jn.knej("knhw", kneg(int ), (int)21) - jn.knej("knhv", kneg(int ), (int)20));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 878007493: {
                            break block24;
                        }
                        case 1910384885: {
                            continue block24;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("knhx", kneg(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jn.knej("knhy", kney(int ), (int)65)) break;
                    v7 /* !! */  = (long)jn.knej("knhz", kney(int ), (int)66);
                }
                v5 = this.fill.getValue() / jn.knej("knia", knff(int ), (int)67);
lbl66:
                // 2 sources

                return v5;
            }
lbl67:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jn.knej("knib", kney(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 1: {
                var2_2 /* !! */  = (int)jn.knej("knic", kney(int ), (int)69);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knid", kney(int ), (int)70);
                } while (!var3_1);
                throw null;
            }
lbl82:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knie", kney(int ), (int)71);
                } while (!var3_1);
                throw null;
            }
lbl87:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)jn.knej("knif", kney(int ), (int)72);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)jn.knej("knig", kney(int ), (int)73);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
lbl95:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("knih", kney(int ), (int)74);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)jn.knej("knii", kney(int ), (int)75);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite knej(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float[][] buildHaloRings() {
        var10 = jn.c;
        var9_1 /* !! */  = jn.b;
        var8_2 = jn.a;
        if (var10) {
            throw null;
lbl6:
            // 19 sources

            return null;
        }
        if (var8_2) ** GOTO lbl6
        if (var9_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_2) ** GOTO lbl6
                var0_3 = new float[]{1.5f, 3.0f, 4.5f, 6.0f, 8.0f, 10.0f};
                if (var8_2 || var8_2) ** GOTO lbl6
                var1_4 = jn.knej("kojd", knff(int ), (int)355);
                if (var8_2 || var8_2) ** GOTO lbl6
                var2_5 = jn.knej("koje", knff(int ), (int)356);
                if (var8_2 || var8_2) ** GOTO lbl6
                var3_6 = new float[var0_3.length][3];
                if (var8_2 || var8_2) ** GOTO lbl6
                var4_7 = jn.knej("kojf", kney(int ), (int)357);
                if (var8_2) ** GOTO lbl6
                do {
                    if (var8_2 || var8_2) ** GOTO lbl6
                    if (var4_7 >= var0_3.length) ** GOTO lbl50
                    if (var8_2 || var8_2) ** GOTO lbl6
                    var5_8 = var2_5 * (float)Math.exp(-Math.pow(var0_3[var4_7] / var1_4, (double)jn.knej("kojh", kojg(int ), (int)209)));
                    if (var8_2 || var8_2) ** GOTO lbl6
                    if (var4_7 + true >= var0_3.length) ** GOTO lbl35
                    if (var8_2 || var8_2) ** GOTO lbl6
                    v0 = (float)(var2_5 * (float)Math.exp(-Math.pow(var0_3[var4_7 + true] / var1_4, (double)jn.knej("koji", kojg(int ), (int)210))));
                    if (var10) {
                        throw null;
                    }
                    ** GOTO lbl37
lbl35:
                    // 1 sources

                    if (var8_2 || var8_2) ** GOTO lbl6
                    v0 = var6_9 = 0.0f;
lbl37:
                    // 2 sources

                    if (var8_2 || var8_2) ** GOTO lbl6
                    var7_10 = Math.max((int)jn.knej("kojj", kney(int ), (int)358), Math.min((int)jn.knej("kojk", kney(int ), (int)359), Math.round((float)(6.283185307179586 * (double)var0_3[var4_7]) / jn.knej("kojl", knff(int ), (int)360))));
                    if (var8_2 || var8_2) ** GOTO lbl6
                    var3_6[var4_7][0] = var0_3[var4_7];
                    if (var8_2 || var8_2) ** GOTO lbl6
                    var3_6[var4_7][jn.knej("kojm", kney(int ), (int)361)] = Math.max((float)jn.knej("kojn", knff(int ), (int)362), (float)(var5_8 - var6_9));
                    if (var8_2 || var8_2) ** GOTO lbl6
                    var3_6[var4_7][2] = var7_10;
                    if (var8_2 || var8_2) ** GOTO lbl6
                    ++var4_7;
                    if (var8_2) ** GOTO lbl6
                } while (!var10);
                throw null;
lbl50:
                // 1 sources

                if (!var8_2 && !var8_2) ** break;
                ** continue;
                return var3_6;
            }
            case 0: {
                var9_1 /* !! */  = (int)jn.knej("kojo", kney(int ), (int)363);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl58:
            // 3 sources

            case 1: {
                var9_1 /* !! */  = (int)jn.knej("kojp", kney(int ), (int)364);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 2: {
                var9_1 /* !! */  = (int)jn.knej("kojq", kney(int ), (int)365);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl68:
            // 2 sources

            case 3: {
                var9_1 /* !! */  = (int)jn.knej("kojr", kney(int ), (int)366);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 4: {
                var9_1 /* !! */  = (int)jn.knej("kojs", kney(int ), (int)367);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl78:
            // 3 sources

            case 5: {
                var9_1 /* !! */  = (int)jn.knej("kojt", kney(int ), (int)368);
                if (!var10) ** GOTO lbl58
                throw null;
            }
lbl82:
            // 3 sources

            case 6: {
                var9_1 /* !! */  = (int)jn.knej("koju", kney(int ), (int)369);
                if (!var10) ** GOTO lbl78
                throw null;
            }
            case 7: {
                var9_1 /* !! */  = (int)jn.knej("kojv", kney(int ), (int)370);
                if (!var10) ** GOTO lbl58
                throw null;
            }
lbl90:
            // 2 sources

            case 8: {
                var9_1 /* !! */  = (int)jn.knej("kojw", kney(int ), (int)371);
                if (!var10) ** GOTO lbl82
                throw null;
            }
            case 9: {
                var9_1 /* !! */  = (int)jn.knej("kojx", kney(int ), (int)372);
                if (!var10) ** GOTO lbl68
                throw null;
            }
lbl98:
            // 2 sources

            case 10: {
                var9_1 /* !! */  = (int)jn.knej("kojy", kney(int ), (int)373);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl103:
            // 2 sources

            case 11: {
                do {
                    var9_1 /* !! */  = (int)jn.knej("kojz", kney(int ), (int)374);
                } while (!var10);
                throw null;
            }
            case 12: {
                var9_1 /* !! */  = (int)jn.knej("koka", kney(int ), (int)375);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl113:
            // 3 sources

            case 13: {
                var9_1 /* !! */  = (int)jn.knej("kokb", kney(int ), (int)376);
                if (!var10) ** GOTO lbl82
                throw null;
            }
lbl117:
            // 3 sources

            case 14: {
                var9_1 /* !! */  = (int)jn.knej("kokc", kney(int ), (int)377);
                if (!var10) ** GOTO lbl113
                throw null;
            }
lbl121:
            // 4 sources

            case 15: {
                var9_1 /* !! */  = (int)jn.knej("kokd", kney(int ), (int)378);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 16: {
                var9_1 /* !! */  = (int)jn.knej("koke", kney(int ), (int)379);
                if (!var10) ** GOTO lbl103
                throw null;
            }
lbl130:
            // 2 sources

            case 17: {
                var9_1 /* !! */  = (int)jn.knej("kokf", kney(int ), (int)380);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl135:
            // 2 sources

            case 18: {
                var9_1 /* !! */  = (int)jn.knej("kokg", kney(int ), (int)381);
                if (!var10) ** GOTO lbl130
                throw null;
            }
lbl139:
            // 2 sources

            case 19: {
                var9_1 /* !! */  = (int)jn.knej("kokh", kney(int ), (int)382);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl144:
            // 2 sources

            case 20: {
                var9_1 /* !! */  = (int)jn.knej("koki", kney(int ), (int)383);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl149:
            // 2 sources

            case 21: {
                var9_1 /* !! */  = (int)jn.knej("kokj", kney(int ), (int)384);
                if (!var10) ** GOTO lbl78
                throw null;
            }
            case 22: {
                do {
                    var9_1 /* !! */  = (int)jn.knej("kokk", kney(int ), (int)385);
                } while (!var10);
                throw null;
            }
            case 23: {
                var9_1 /* !! */  = (int)jn.knej("kokl", kney(int ), (int)386);
                if (!var10) ** GOTO lbl139
                throw null;
            }
            case 24: {
                var9_1 /* !! */  = (int)jn.knej("kokm", kney(int ), (int)387);
                if (!var10) ** GOTO lbl121
                throw null;
            }
            case 25: {
                var9_1 /* !! */  = (int)jn.knej("kokn", kney(int ), (int)388);
                if (!var10) ** GOTO lbl90
                throw null;
            }
lbl170:
            // 2 sources

            case 26: {
                var9_1 /* !! */  = (int)jn.knej("koko", kney(int ), (int)389);
                if (!var10) ** GOTO lbl144
                throw null;
            }
lbl174:
            // 4 sources

            case 27: {
                var9_1 /* !! */  = (int)jn.knej("kokp", kney(int ), (int)390);
                if (var10) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 28: {
                var9_1 /* !! */  = (int)jn.knej("kokq", kney(int ), (int)391);
                if (!var10) ** GOTO lbl117
                throw null;
            }
lbl183:
            // 2 sources

            case 29: {
                do {
                    var9_1 /* !! */  = (int)jn.knej("kokr", kney(int ), (int)392);
                } while (!var10);
                throw null;
            }
lbl188:
            // 2 sources

            case 30: {
                var9_1 /* !! */  = (int)jn.knej("koks", kney(int ), (int)393);
                if (!var10) ** GOTO lbl135
                throw null;
            }
lbl192:
            // 2 sources

            case 31: {
                var9_1 /* !! */  = (int)jn.knej("kokt", kney(int ), (int)394);
                if (!var10) ** GOTO lbl174
                throw null;
            }
lbl196:
            // 3 sources

            case 32: {
                var9_1 /* !! */  = (int)jn.knej("koku", kney(int ), (int)395);
                if (!var10) ** GOTO lbl121
                throw null;
            }
            case 33: {
                var9_1 /* !! */  = (int)jn.knej("kokv", kney(int ), (int)396);
                if (!var10) ** GOTO lbl113
                throw null;
            }
lbl204:
            // 2 sources

            case 34: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_1 /* !! */  = (int)jn.knej("kokw", kney(int ), (int)397);
                    if (!var10) ** GOTO lbl188
                    throw null;
                }
            }
lbl209:
            // 2 sources

            case 35: {
                var9_1 /* !! */  = (int)jn.knej("kokx", kney(int ), (int)398);
                if (!var10) ** GOTO lbl196
                throw null;
            }
            case 36: 
        }
        var9_1 /* !! */  = (int)jn.knej("koky", kney(int ), (int)399);
        ** while (!var10)
lbl216:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isTrailSelected() {
        block59: {
            block58: {
                block60: {
                    v0 /* !! */  = jn.ss;
                    if (true) ** GOTO lbl5
                    block29: while (true) {
                        v0 /* !! */  = (long)(v1 - jn.knej("knnw", kneg(int ), (int)71));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -505806603: {
                                v1 = jn.knej("knnx", kneg(int ), (int)72);
                                continue block29;
                            }
                            case 725110260: {
                                v1 = jn.knej("knny", kneg(int ), (int)73);
                                continue block29;
                            }
                            case 878007493: {
                                break block29;
                            }
                        }
                        break;
                    }
                    var3_1 = jn.c;
                    v2 /* !! */  = jn.ss;
                    if (true) ** GOTO lbl19
                    block30: while (true) {
                        v2 /* !! */  = (long)(v3 - jn.knej("knnz", kneg(int ), (int)74));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case 674824932: {
                                v3 = jn.knej("knoa", kneg(int ), (int)75);
                                continue block30;
                            }
                            case 878007493: {
                                break block30;
                            }
                            case 1512677275: {
                                v3 = jn.knej("knob", kneg(int ), (int)76);
                                continue block30;
                            }
                        }
                        break;
                    }
                    var2_2 /* !! */  = jn.b;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knoc", kneg(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == jn.knej("knod", kney(int ), (int)145)) {
                            var1_3 = jn.a;
                            if (var3_1) {
                                throw null;
                            }
                            break;
                        }
                        v4 /* !! */  = (long)jn.knej("knoe", kney(int ), (int)146);
                    }
                    if (!var1_3 && !var1_3) break block60;
lbl40:
                    // 6 sources

                    while (true) {
                        if (var2_2 /* !! */  == 0) return (boolean)jn.knej("knog", kney(int ), (int)147);
                        cfr_temp_0 = -2147483648;
                        block33: do {
                            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                                default: {
                                    return (boolean)jn.knej("knog", kney(int ), (int)147);
                                }
                                case 0: {
                                    var2_2 /* !! */  = (int)jn.knej("knpa", kney(int ), (int)156);
                                    cfr_temp_0 = 9;
                                    if (!var3_1) continue block33;
                                    throw null;
                                }
                                case 1: {
                                    var2_2 /* !! */  = (int)jn.knej("knpe", kney(int ), (int)157);
                                    cfr_temp_0 = 4;
                                    if (!var3_1) continue block33;
                                    throw null;
                                }
                                case 2: {
                                    var2_2 /* !! */  = (int)jn.knej("knpf", kney(int ), (int)158);
                                    cfr_temp_0 = 4;
                                    if (!var3_1) continue block33;
                                    throw null;
                                }
                                case 5: {
                                    do {
                                        var2_2 /* !! */  = (int)jn.knej("knpi", kney(int ), (int)161);
                                    } while (!var3_1);
                                    throw null;
                                }
                                case 6: {
                                    var2_2 /* !! */  = (int)jn.knej("knpk", kney(int ), (int)162);
                                    if (var3_1) {
                                        throw null;
                                    }
                                }
                                case 8: {
                                    var2_2 /* !! */  = (int)jn.knej("knpn", kney(int ), (int)164);
                                    if (var3_1) {
                                        throw null;
                                    }
                                }
                                case 3: {
                                    var2_2 /* !! */  = (int)jn.knej("knpg", kney(int ), (int)159);
                                    if (var3_1) {
                                        throw null;
                                    }
                                }
                                case 7: {
                                    var2_2 /* !! */  = (int)jn.knej("knpm", kney(int ), (int)163);
                                    if (var3_1) {
                                        throw null;
                                    }
                                }
                                case 4: {
                                    var2_2 /* !! */  = (int)jn.knej("knph", kney(int ), (int)160);
                                    if (var3_1) {
                                        throw null;
                                    }
                                    ** GOTO lbl-1000
                                }
                                case 9: {
                                    ** GOTO lbl94
                                }
                                case 11: lbl-1000:
                                // 2 sources

                                {
                                    var2_2 /* !! */  = (int)jn.knej("knpt", kney(int ), (int)167);
                                    if (var3_1) {
                                        throw null;
                                    }
lbl94:
                                    // 3 sources

                                    var2_2 /* !! */  = (int)jn.knej("knpp", kney(int ), (int)165);
                                    if (var3_1) {
                                        throw null;
                                    }
                                }
                                case 10: 
                            }
                            break;
                        } while (true);
                        do {
                            var2_2 /* !! */  = (int)jn.knej("knpr", kney(int ), (int)166);
                        } while (!var3_1);
                        throw null;
                    }
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("knoh", kneg(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jn.knej("knoi", kney(int ), (int)148)) {
                        if (!this.isBeautifulMode()) {
                            break;
                        }
                        break block58;
                    }
                    v5 /* !! */  = (long)jn.knej("knoj", kney(int ), (int)149);
                }
                if (var1_3) ** GOTO lbl40
                v6 /* !! */  = jn.ss;
                if (true) ** GOTO lbl119
                block37: while (true) {
                    v6 /* !! */  = (long)(v7 - jn.knej("knok", kneg(int ), (int)79));
lbl119:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1931237360: {
                            v7 = jn.knej("knol", kneg(int ), (int)80);
                            continue block37;
                        }
                        case 878007493: {
                            break block37;
                        }
                        case 1414639332: {
                            v7 = jn.knej("knom", kneg(int ), (int)81);
                            continue block37;
                        }
                    }
                    break;
                }
                if (!this.isStandardGlowMode()) break block59;
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("knoo", kneg(int ), (int)82)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == jn.knej("knop", kney(int ), (int)150)) break;
                    v8 /* !! */  = (long)jn.knej("knor", kney(int ), (int)151);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("knos", kneg(int ), (int)83)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == jn.knej("knot", kney(int ), (int)152)) {
                        if (this.trail.isValue()) {
                            break;
                        }
                        break block59;
                    }
                    v9 /* !! */  = (long)jn.knej("knov", kney(int ), (int)153);
                }
                if (var1_3) ** GOTO lbl40
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            v10 = jn.knej("knox", kney(int ), (int)154);
            if (!var3_1) return (boolean)v10;
            throw null;
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        v10 = jn.knej("knoz", kney(int ), (int)155);
        return (boolean)v10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int[][] buildHaloPassOverlays() {
        var13 = jn.c;
        var12_1 /* !! */  = jn.b;
        var11_2 = jn.a;
        if (var13) {
            throw null;
lbl6:
            // 26 sources

            return null;
        }
        if (var11_2 || var11_2) ** GOTO lbl6
        var0_3 = new int[16][jn.HALO_PASS_RINGS.length];
        if (var11_2 || var11_2) ** GOTO lbl6
        var1_4 = jn.knej("komx", kney(int ), (int)450);
        if (var11_2) ** GOTO lbl6
        block51: while (true) {
            if (var11_2 || var11_2) ** GOTO lbl6
            if (var1_4 >= var0_3.length) ** GOTO lbl69
            if (var11_2 || var11_2) ** GOTO lbl6
            var2_5 = (float)var1_4 / jn.knej("komy", knff(int ), (int)451) * jn.knej("komz", knff(int ), (int)452);
            if (var11_2 || var11_2) ** GOTO lbl6
            var3_6 = jn.knej("kona", kney(int ), (int)453);
            if (var11_2 || var11_2) ** GOTO lbl6
            var4_7 = jn.knej("konb", kney(int ), (int)454);
            if (var11_2) ** GOTO lbl6
            block52: while (true) {
                if (var11_2 || var11_2) ** GOTO lbl6
                if (var4_7 >= jn.HALO_RINGS.length) ** GOTO lbl64
                if (var11_2 || var11_2) ** GOTO lbl6
                var5_8 = jn.HALO_RINGS[var4_7][0];
                if (var11_2) ** GOTO lbl6
                if (var12_1 /* !! */  == 0) ** GOTO lbl-1000
                switch (var12_1 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var11_2) ** GOTO lbl6
                        var6_9 = (int)jn.HALO_RINGS[var4_7][2];
                        if (var11_2 || var11_2) ** GOTO lbl6
                        var7_10 = (float)var4_7 * jn.knej("konc", knff(int ), (int)455) / (float)var6_9;
                        if (var11_2 || var11_2) ** GOTO lbl6
                        var8_11 = jn.knej("kond", kney(int ), (int)456);
                        if (var11_2) ** GOTO lbl6
                        do {
                            if (var11_2 || var11_2) ** GOTO lbl6
                            if (var8_11 >= var6_9) ** GOTO lbl59
                            if (var11_2 || var11_2) ** GOTO lbl6
                            var9_12 = var7_10 + jn.knej("kone", knff(int ), (int)457) * (float)var8_11 / (float)var6_9;
                            if (var11_2 || var11_2) ** GOTO lbl6
                            if (var8_11 % jn.knej("konf", kney(int ), (int)458) == false) {
                                v0 /* !! */  = 0.0f;
                                if (var13) {
                                    throw null;
                                }
                            } else {
                                v0 /* !! */  = (float)jn.knej("kong", knff(int ), (int)459);
                            }
                            var10_13 = var5_8 + v0 /* !! */ ;
                            if (var11_2 || var11_2) ** GOTO lbl6
                            var0_3[var1_4][var3_6++] = oo.packHaloPass(var9_12, var10_13, var2_5);
                            if (var11_2 || var11_2) ** GOTO lbl6
                            ++var8_11;
                            if (var11_2) ** GOTO lbl6
                        } while (!var13);
                        throw null;
lbl59:
                        // 1 sources

                        if (var11_2 || var11_2) ** GOTO lbl6
                        ++var4_7;
                        if (var11_2) ** GOTO lbl6
                        if (!var13) continue block52;
                        throw null;
                    }
lbl64:
                    // 1 sources

                    if (var11_2 || var11_2) ** GOTO lbl6
                    ++var1_4;
                    if (var11_2) ** GOTO lbl6
                    if (!var13) continue block51;
                    throw null;
lbl69:
                    // 1 sources

                    if (!var11_2 && !var11_2) ** break;
                    ** continue;
                    return var0_3;
                    case 0: {
                        var12_1 /* !! */  = (int)jn.knej("konh", kney(int ), (int)460);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl132
                    }
                    case 1: {
                        var12_1 /* !! */  = (int)jn.knej("koni", kney(int ), (int)461);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl246
                    }
lbl82:
                    // 3 sources

                    case 2: {
                        var12_1 /* !! */  = (int)jn.knej("konj", kney(int ), (int)462);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl227
                    }
                    case 3: {
                        var12_1 /* !! */  = (int)jn.knej("konk", kney(int ), (int)463);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl136
                    }
                    case 4: {
                        var12_1 /* !! */  = (int)jn.knej("konl", kney(int ), (int)464);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl151
                    }
                    case 5: {
                        var12_1 /* !! */  = (int)jn.knej("konm", kney(int ), (int)465);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl169
                    }
lbl102:
                    // 2 sources

                    case 6: {
                        var12_1 /* !! */  = (int)jn.knej("konn", kney(int ), (int)466);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl199
                    }
                    case 7: {
                        var12_1 /* !! */  = (int)jn.knej("kono", kney(int ), (int)467);
                        if (!var13) break block51;
                        throw null;
                    }
lbl111:
                    // 2 sources

                    case 8: {
                        var12_1 /* !! */  = (int)jn.knej("konp", kney(int ), (int)468);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl218
                    }
                    case 9: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var12_1 /* !! */  = (int)jn.knej("konq", kney(int ), (int)469);
                            if (var13) {
                                throw null;
                            }
                            ** GOTO lbl156
                            break;
                        }
                    }
lbl122:
                    // 2 sources

                    case 10: {
                        var12_1 /* !! */  = (int)jn.knej("konr", kney(int ), (int)470);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl232
                    }
lbl127:
                    // 2 sources

                    case 11: {
                        var12_1 /* !! */  = (int)jn.knej("kons", kney(int ), (int)471);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl209
                    }
lbl132:
                    // 2 sources

                    case 12: {
                        var12_1 /* !! */  = (int)jn.knej("kont", kney(int ), (int)472);
                        if (!var13) ** GOTO lbl111
                        throw null;
                    }
lbl136:
                    // 3 sources

                    case 13: {
                        var12_1 /* !! */  = (int)jn.knej("konu", kney(int ), (int)473);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl169
                    }
                    case 14: {
                        var12_1 /* !! */  = (int)jn.knej("konv", kney(int ), (int)474);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl164
                    }
lbl146:
                    // 2 sources

                    case 15: {
                        var12_1 /* !! */  = (int)jn.knej("konw", kney(int ), (int)475);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl270
                    }
lbl151:
                    // 3 sources

                    case 16: {
                        var12_1 /* !! */  = (int)jn.knej("konx", kney(int ), (int)476);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl204
                    }
lbl156:
                    // 2 sources

                    case 17: {
                        var12_1 /* !! */  = (int)jn.knej("kony", kney(int ), (int)477);
                        if (!var13) ** GOTO lbl102
                        throw null;
                    }
                    case 18: {
                        var12_1 /* !! */  = (int)jn.knej("konz", kney(int ), (int)478);
                        if (!var13) ** GOTO lbl122
                        throw null;
                    }
lbl164:
                    // 2 sources

                    case 19: {
                        var12_1 /* !! */  = (int)jn.knej("kooa", kney(int ), (int)479);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl250
                    }
lbl169:
                    // 4 sources

                    case 20: {
                        var12_1 /* !! */  = (int)jn.knej("koob", kney(int ), (int)480);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl195
                    }
lbl174:
                    // 2 sources

                    case 21: {
                        var12_1 /* !! */  = (int)jn.knej("kooc", kney(int ), (int)481);
                        if (!var13) ** GOTO lbl151
                        throw null;
                    }
                    case 22: {
                        var12_1 /* !! */  = (int)jn.knej("kood", kney(int ), (int)482);
                        if (!var13) ** GOTO lbl146
                        throw null;
                    }
lbl182:
                    // 4 sources

                    case 23: {
                        var12_1 /* !! */  = (int)jn.knej("kooe", kney(int ), (int)483);
                        if (!var13) ** GOTO lbl127
                        throw null;
                    }
lbl186:
                    // 2 sources

                    case 24: {
                        var12_1 /* !! */  = (int)jn.knej("koof", kney(int ), (int)484);
                        if (!var13) ** GOTO lbl136
                        throw null;
                    }
                    case 25: {
                        var12_1 /* !! */  = (int)jn.knej("koog", kney(int ), (int)485);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl258
                    }
lbl195:
                    // 2 sources

                    case 26: {
                        var12_1 /* !! */  = (int)jn.knej("kooh", kney(int ), (int)486);
                        if (!var13) ** GOTO lbl174
                        throw null;
                    }
lbl199:
                    // 3 sources

                    case 27: {
                        var12_1 /* !! */  = (int)jn.knej("kooi", kney(int ), (int)487);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl258
                    }
lbl204:
                    // 3 sources

                    case 28: {
                        var12_1 /* !! */  = (int)jn.knej("kooj", kney(int ), (int)488);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl241
                    }
lbl209:
                    // 2 sources

                    case 29: {
                        var12_1 /* !! */  = (int)jn.knej("kook", kney(int ), (int)489);
                        if (!var13) ** GOTO lbl182
                        throw null;
                    }
                    case 30: {
                        var12_1 /* !! */  = (int)jn.knej("kool", kney(int ), (int)490);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl232
                    }
lbl218:
                    // 2 sources

                    case 31: {
                        var12_1 /* !! */  = (int)jn.knej("koom", kney(int ), (int)491);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl270
                    }
                    case 32: {
                        var12_1 /* !! */  = (int)jn.knej("koon", kney(int ), (int)492);
                        if (!var13) ** GOTO lbl204
                        throw null;
                    }
lbl227:
                    // 2 sources

                    case 33: {
                        var12_1 /* !! */  = (int)jn.knej("kooo", kney(int ), (int)493);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl282
                    }
lbl232:
                    // 3 sources

                    case 34: {
                        var12_1 /* !! */  = (int)jn.knej("koop", kney(int ), (int)494);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl282
                    }
                    case 35: {
                        var12_1 /* !! */  = (int)jn.knej("kooq", kney(int ), (int)495);
                        if (!var13) ** GOTO lbl186
                        throw null;
                    }
lbl241:
                    // 3 sources

                    case 36: {
                        var12_1 /* !! */  = (int)jn.knej("koor", kney(int ), (int)496);
                        if (var13) {
                            throw null;
                        }
                        ** GOTO lbl266
                    }
lbl246:
                    // 2 sources

                    case 37: {
                        var12_1 /* !! */  = (int)jn.knej("koos", kney(int ), (int)497);
                        if (!var13) break block51;
                        throw null;
                    }
lbl250:
                    // 2 sources

                    case 38: {
                        var12_1 /* !! */  = (int)jn.knej("koot", kney(int ), (int)498);
                        if (!var13) ** GOTO lbl199
                        throw null;
                    }
lbl254:
                    // 2 sources

                    case 39: {
                        var12_1 /* !! */  = (int)jn.knej("koou", kney(int ), (int)499);
                        if (!var13) ** GOTO lbl82
                        throw null;
                    }
lbl258:
                    // 3 sources

                    case 40: {
                        var12_1 /* !! */  = (int)jn.knej("koov", kney(int ), (int)500);
                        if (!var13) ** GOTO lbl182
                        throw null;
                    }
lbl262:
                    // 2 sources

                    case 41: {
                        var12_1 /* !! */  = (int)jn.knej("koow", kney(int ), (int)501);
                        if (!var13) ** GOTO lbl241
                        throw null;
                    }
lbl266:
                    // 2 sources

                    case 42: {
                        var12_1 /* !! */  = (int)jn.knej("koox", kney(int ), (int)502);
                        if (!var13) ** GOTO lbl82
                        throw null;
                    }
lbl270:
                    // 3 sources

                    case 43: {
                        var12_1 /* !! */  = (int)jn.knej("kooy", kney(int ), (int)503);
                        if (!var13) ** GOTO lbl262
                        throw null;
                    }
                    case 44: {
                        var12_1 /* !! */  = (int)jn.knej("kooz", kney(int ), (int)504);
                        if (!var13) ** GOTO lbl182
                        throw null;
                    }
                    case 45: {
                        var12_1 /* !! */  = (int)jn.knej("kopa", kney(int ), (int)505);
                        if (!var13) ** GOTO lbl169
                        throw null;
                    }
lbl282:
                    // 3 sources

                    case 46: {
                        var12_1 /* !! */  = (int)jn.knej("kopb", kney(int ), (int)506);
                        if (!var13) ** GOTO lbl254
                        throw null;
                    }
                    case 47: 
                }
                break;
            }
            break;
        }
        var12_1 /* !! */  = (int)jn.knej("kopc", kney(int ), (int)507);
        ** while (!var13)
lbl289:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpig() {
        jn.knfa[700] = 542638413;
        jn.knfa[701] = -1570786164;
        jn.knfa[702] = 1318934058;
        jn.knfa[703] = 866537983;
        jn.knfa[704] = 358683454;
        jn.knfa[705] = 1777101621;
        jn.knfa[706] = 1518024927;
        jn.knfa[707] = 181047712;
        jn.knfa[708] = 1109289884;
        jn.knfa[709] = 1124222101;
        jn.knfa[710] = -480219313;
        jn.knfa[711] = -829487308;
        jn.knfa[712] = 1118789948;
        jn.knfa[713] = 146753898;
        jn.knfa[714] = 1605860653;
        jn.knfa[715] = -702401660;
        jn.knfa[716] = -111565130;
        jn.knfa[717] = -1617921281;
        jn.knfa[718] = 1593205837;
        jn.knfa[719] = -820554820;
        jn.knfa[720] = -1186596026;
        jn.knfa[721] = -965816385;
        jn.knfa[722] = -1970515967;
        jn.knfa[723] = 1521158010;
        jn.knfa[724] = 2041464123;
        jn.knfa[725] = 963324055;
        jn.knfa[726] = -1451127645;
        jn.knfa[727] = 280067566;
        jn.knfa[728] = 1025150249;
        jn.knfa[729] = -1884426750;
        jn.knfa[730] = -139767578;
        jn.knfa[731] = -595983467;
        jn.knfa[732] = 1629131969;
        jn.knfa[733] = 1115081333;
        jn.knfa[734] = -1460571006;
        jn.knfa[735] = 474283169;
        jn.knfa[736] = 1348320277;
        jn.knfa[737] = -1943498258;
        jn.knfa[738] = 1037676698;
        jn.knfa[739] = -1563217494;
        jn.knfa[740] = -552794889;
        jn.knfa[741] = -663466554;
        jn.knfa[742] = 947268762;
        jn.knfa[743] = -1632112179;
        jn.knfa[744] = -1206578911;
        jn.knfa[745] = -34165350;
        jn.knfa[746] = -1416345317;
        jn.knfa[747] = 1998855107;
        jn.knfa[748] = 1228958667;
        jn.knfa[749] = -1117791674;
        jn.knfa[750] = 478861157;
        jn.knfa[751] = 201232502;
        jn.knfa[752] = -1944629625;
        jn.knfa[753] = 1672780620;
        jn.knfa[754] = -2080074996;
        jn.knfa[755] = 2104344956;
        jn.knfa[756] = 1798039406;
        jn.knfa[757] = 1120596731;
        jn.knfa[758] = -1199114943;
        jn.knfa[759] = 1384981473;
        jn.knfa[760] = 120082075;
        jn.knfa[761] = 918588201;
        jn.knfa[762] = -1765679395;
        jn.knfa[763] = 499428169;
        jn.knfa[764] = -1730836065;
        jn.knfa[765] = 269271088;
        jn.knfa[766] = -972907892;
        jn.knfa[767] = 669705802;
        jn.knfa[768] = -711041293;
        jn.knfa[769] = 842441031;
        jn.knfa[770] = 176302855;
        jn.knfa[771] = 746972451;
        jn.knfa[772] = 1866887481;
        jn.knfa[773] = -621552094;
        jn.knfa[774] = -777419719;
        jn.knfa[775] = -969792614;
        jn.knfa[776] = -403879658;
        jn.knfa[777] = 1415614925;
        jn.knfa[778] = 776864405;
        jn.knfa[779] = -51700212;
        jn.knfa[780] = -1284685259;
        jn.knfa[781] = 657432736;
        jn.knfa[782] = -1869365696;
        jn.knfa[783] = -2026315561;
        jn.knfa[784] = 418217517;
        jn.knfa[785] = 551070398;
        jn.knfa[786] = -1378823304;
        jn.knfa[787] = -612466045;
        jn.knfa[788] = -1246818556;
        jn.knfa[789] = 1044797549;
        jn.knfa[790] = -2089098097;
        jn.knfa[791] = -336903686;
        jn.knfa[792] = -1876671878;
        jn.knfa[793] = 1900589880;
        jn.knfa[794] = -788092781;
        jn.knfa[795] = 1252442458;
        jn.knfa[796] = -1296446623;
        jn.knfa[797] = 1279818825;
        jn.knfa[798] = -119953769;
        jn.knfa[799] = -521501368;
    }

    private static /* synthetic */ void kpht() {
        jn.knez[300] = -231645807;
        jn.knez[301] = -731943071;
        jn.knez[302] = -273431140;
        jn.knez[303] = -1292628541;
        jn.knez[304] = -309984470;
        jn.knez[305] = 1271724222;
        jn.knez[306] = 758898386;
        jn.knez[307] = -391754988;
        jn.knez[308] = 1836618322;
        jn.knez[309] = 239988319;
        jn.knez[310] = -1952295977;
        jn.knez[311] = 1971956237;
        jn.knez[312] = 1253959333;
        jn.knez[313] = 79880614;
        jn.knez[314] = 353642503;
        jn.knez[315] = -1536161945;
        jn.knez[316] = -1196815819;
        jn.knez[317] = -2054886238;
        jn.knez[318] = -1811905217;
        jn.knez[319] = -1330407285;
        jn.knez[320] = -1233578709;
        jn.knez[321] = -74020541;
        jn.knez[322] = 1404469911;
        jn.knez[323] = 1193646289;
        jn.knez[324] = 1689092705;
        jn.knez[325] = -1349038021;
        jn.knez[326] = 1805119319;
        jn.knez[327] = 924856406;
        jn.knez[328] = 983077963;
        jn.knez[329] = -2130102484;
        jn.knez[330] = 1996048342;
        jn.knez[331] = 606901303;
        jn.knez[332] = 13051437;
        jn.knez[333] = -469167653;
        jn.knez[334] = -975756723;
        jn.knez[335] = -386405452;
        jn.knez[336] = 504994189;
        jn.knez[337] = -1879060034;
        jn.knez[338] = -1033567781;
        jn.knez[339] = -1288546486;
        jn.knez[340] = 603713417;
        jn.knez[341] = -364448538;
        jn.knez[342] = 1480287631;
        jn.knez[343] = 1569529846;
        jn.knez[344] = -2078447210;
        jn.knez[345] = 105502524;
        jn.knez[346] = 1061549432;
        jn.knez[347] = -1156821170;
        jn.knez[348] = 1192786823;
        jn.knez[349] = 1949167673;
        jn.knez[350] = -801446580;
        jn.knez[351] = 21876136;
        jn.knez[352] = 1018683680;
        jn.knez[353] = -1784321815;
        jn.knez[354] = 1528457594;
        jn.knez[355] = -413217353;
        jn.knez[356] = 324166295;
        jn.knez[357] = 1039209540;
        jn.knez[358] = -884241758;
        jn.knez[359] = 191039525;
        jn.knez[360] = -901287950;
        jn.knez[361] = -341116544;
        jn.knez[362] = -713377957;
        jn.knez[363] = -1704239927;
        jn.knez[364] = 232335737;
        jn.knez[365] = -2139544144;
        jn.knez[366] = -732731509;
        jn.knez[367] = -1839601463;
        jn.knez[368] = -1755612181;
        jn.knez[369] = 294005310;
        jn.knez[370] = -1076843246;
        jn.knez[371] = -1939729450;
        jn.knez[372] = 224769344;
        jn.knez[373] = -75072114;
        jn.knez[374] = 986802669;
        jn.knez[375] = -746990363;
        jn.knez[376] = -49265331;
        jn.knez[377] = -512636426;
        jn.knez[378] = 1347992332;
        jn.knez[379] = -406538754;
        jn.knez[380] = 355324061;
        jn.knez[381] = 654574727;
        jn.knez[382] = -782991034;
        jn.knez[383] = 1777442969;
        jn.knez[384] = -122035716;
        jn.knez[385] = 1639578106;
        jn.knez[386] = 644283221;
        jn.knez[387] = -1983522319;
        jn.knez[388] = -1508783547;
        jn.knez[389] = -1289465495;
        jn.knez[390] = -2037705602;
        jn.knez[391] = -1580085312;
        jn.knez[392] = -18773788;
        jn.knez[393] = 597183948;
        jn.knez[394] = -1748805568;
        jn.knez[395] = 988978383;
        jn.knez[396] = -252196160;
        jn.knez[397] = -420098661;
        jn.knez[398] = -1920023479;
        jn.knez[399] = -15898946;
    }

    private static /* synthetic */ void kphs() {
        jn.knez[200] = 1197107853;
        jn.knez[201] = -466515031;
        jn.knez[202] = 574947582;
        jn.knez[203] = -1555441359;
        jn.knez[204] = 242251268;
        jn.knez[205] = 1752431408;
        jn.knez[206] = -1528344359;
        jn.knez[207] = -433152387;
        jn.knez[208] = -235423403;
        jn.knez[209] = -1267418550;
        jn.knez[210] = 309342985;
        jn.knez[211] = 309427676;
        jn.knez[212] = 589886943;
        jn.knez[213] = -170419469;
        jn.knez[214] = -900660789;
        jn.knez[215] = 909046200;
        jn.knez[216] = -1455430425;
        jn.knez[217] = 636833590;
        jn.knez[218] = -1610817439;
        jn.knez[219] = -1317451268;
        jn.knez[220] = 155151864;
        jn.knez[221] = 1824739866;
        jn.knez[222] = -1167524037;
        jn.knez[223] = -282533032;
        jn.knez[224] = -140478159;
        jn.knez[225] = -402168161;
        jn.knez[226] = 1443867181;
        jn.knez[227] = 1995430567;
        jn.knez[228] = -406663567;
        jn.knez[229] = 1229229966;
        jn.knez[230] = -59752055;
        jn.knez[231] = -474445542;
        jn.knez[232] = 253335540;
        jn.knez[233] = 1447235874;
        jn.knez[234] = -1848976560;
        jn.knez[235] = 888844585;
        jn.knez[236] = -1493936443;
        jn.knez[237] = -1103052158;
        jn.knez[238] = 564105290;
        jn.knez[239] = -2076436980;
        jn.knez[240] = 1228510716;
        jn.knez[241] = -1894354085;
        jn.knez[242] = 1793032900;
        jn.knez[243] = 656318855;
        jn.knez[244] = -143853763;
        jn.knez[245] = 547188031;
        jn.knez[246] = 1824938448;
        jn.knez[247] = -1579378908;
        jn.knez[248] = -702949301;
        jn.knez[249] = -2126565041;
        jn.knez[250] = 1041067468;
        jn.knez[251] = 180726628;
        jn.knez[252] = -27119728;
        jn.knez[253] = -1502806830;
        jn.knez[254] = 1849705420;
        jn.knez[255] = -1921000855;
        jn.knez[256] = -1483744376;
        jn.knez[257] = -783230356;
        jn.knez[258] = 465577728;
        jn.knez[259] = -663729283;
        jn.knez[260] = -1641857718;
        jn.knez[261] = 1965795433;
        jn.knez[262] = -585971717;
        jn.knez[263] = -1591748075;
        jn.knez[264] = -1472229264;
        jn.knez[265] = 1148426754;
        jn.knez[266] = 1197428006;
        jn.knez[267] = -437195336;
        jn.knez[268] = 515734615;
        jn.knez[269] = -54978305;
        jn.knez[270] = -1712403642;
        jn.knez[271] = -1444299117;
        jn.knez[272] = 1479609237;
        jn.knez[273] = 688228997;
        jn.knez[274] = 2119833049;
        jn.knez[275] = 879713658;
        jn.knez[276] = -971143112;
        jn.knez[277] = -1343423901;
        jn.knez[278] = 1491810268;
        jn.knez[279] = 307544483;
        jn.knez[280] = -2088690814;
        jn.knez[281] = -1685073302;
        jn.knez[282] = -1352507555;
        jn.knez[283] = 1291207832;
        jn.knez[284] = -1398529391;
        jn.knez[285] = 1057154385;
        jn.knez[286] = -1463193885;
        jn.knez[287] = -25799666;
        jn.knez[288] = -413478184;
        jn.knez[289] = -671743752;
        jn.knez[290] = 1645249818;
        jn.knez[291] = 1207440229;
        jn.knez[292] = -2042274916;
        jn.knez[293] = -336203473;
        jn.knez[294] = -440146093;
        jn.knez[295] = -1774894088;
        jn.knez[296] = -1941039957;
        jn.knez[297] = 1454323657;
        jn.knez[298] = -320117107;
        jn.knez[299] = -1888103132;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isTrailModelEnabled() {
        block66: {
            v0 /* !! */  = jn.ss;
            if (true) ** GOTO lbl5
            block46: while (true) {
                v0 /* !! */  = (long)(v1 - jn.knej("koei", kneg(int ), (int)164));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1863845673: {
                        v1 = jn.knej("koej", kneg(int ), (int)165);
                        continue block46;
                    }
                    case 878007493: {
                        break block46;
                    }
                    case 1340999945: {
                        v1 = jn.knej("koek", kneg(int ), (int)166);
                        continue block46;
                    }
                }
                break;
            }
            var3_1 = jn.c;
            v2 /* !! */  = jn.ss;
            if (true) ** GOTO lbl19
            block47: while (true) {
                v2 /* !! */  = (long)(v3 - jn.knej("koem", kneg(int ), (int)167));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -581362679: {
                        v3 = jn.knej("koen", kneg(int ), (int)168);
                        continue block47;
                    }
                    case 878007493: {
                        break block47;
                    }
                    case 1153178100: {
                        v3 = jn.knej("koeo", kneg(int ), (int)169);
                        continue block47;
                    }
                }
                break;
            }
            var2_2 /* !! */  = jn.b;
            v4 /* !! */  = jn.ss;
            if (true) ** GOTO lbl33
            block48: while (true) {
                v4 /* !! */  = (long)(v5 - jn.knej("koep", kneg(int ), (int)170));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -199449463: {
                        v5 = jn.knej("koeq", kneg(int ), (int)171);
                        continue block48;
                    }
                    case 878007493: {
                        break block48;
                    }
                    case 1884882999: {
                        v5 = jn.knej("koes", kneg(int ), (int)172);
                        continue block48;
                    }
                    case 2064846066: {
                        v5 = jn.knej("koet", kneg(int ), (int)173);
                        continue block48;
                    }
                }
                break;
            }
            var1_3 = jn.a;
            if (var3_1) {
                throw null;
lbl48:
                // 6 sources

                return (boolean)jn.knej("kofi", kney(int ), (int)318);
            }
            if (var1_3 || var1_3) ** GOTO lbl48
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kofo", kneg(int ), (int)174)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == jn.knej("kofr", kney(int ), (int)319)) break;
                v6 /* !! */  = (long)jn.knej("kofu", kney(int ), (int)320);
            }
            if (!this.isTrailEnabled()) ** GOTO lbl114
            if (var1_3) ** GOTO lbl48
            v7 /* !! */  = jn.ss;
            if (true) ** GOTO lbl63
            block51: while (true) {
                v7 /* !! */  = (long)(v8 - jn.knej("kofy", kneg(int ), (int)175));
lbl63:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 396602240: {
                        v8 = jn.knej("kogb", kneg(int ), (int)176);
                        continue block51;
                    }
                    case 848058566: {
                        v8 = jn.knej("kogd", kneg(int ), (int)177);
                        continue block51;
                    }
                    case 878007493: {
                        break block51;
                    }
                    case 1697114048: {
                        v8 = jn.knej("kogg", kneg(int ), (int)178);
                        continue block51;
                    }
                }
                break;
            }
            if (this.isBeautifulMode()) break block66;
            if (var1_3) ** GOTO lbl48
            v9 /* !! */  = jn.ss;
            if (true) ** GOTO lbl81
            block52: while (true) {
                v9 /* !! */  = (long)(v10 - jn.knej("kogi", kneg(int ), (int)179));
lbl81:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 144490714: {
                        v10 = jn.knej("kogj", kneg(int ), (int)180);
                        continue block52;
                    }
                    case 819909709: {
                        v10 = jn.knej("kogk", kneg(int ), (int)181);
                        continue block52;
                    }
                    case 878007493: {
                        break block52;
                    }
                }
                break;
            }
            v11 /* !! */  = jn.ss;
            if (true) ** GOTO lbl94
            block53: while (true) {
                v11 /* !! */  = (long)(v12 - jn.knej("kogl", kneg(int ), (int)182));
lbl94:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1542312899: {
                        v12 = jn.knej("kogm", kneg(int ), (int)183);
                        continue block53;
                    }
                    case 843059106: {
                        v12 = jn.knej("kogn", kneg(int ), (int)184);
                        continue block53;
                    }
                    case 878007493: {
                        break block53;
                    }
                }
                break;
            }
            if (!this.trailModel.isValue()) ** GOTO lbl114
            if (var1_3) ** GOTO lbl48
        }
        if (var1_3 || var1_3) ** GOTO lbl48
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v13 = jn.knej("kogq", kney(int ), (int)321);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl114:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v13 = jn.knej("kogt", kney(int ), (int)322);
lbl117:
            // 2 sources

            return (boolean)v13;
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("kogu", kney(int ), (int)323);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var2_2 /* !! */  = (int)jn.knej("kogv", kney(int ), (int)324);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("kogw", kney(int ), (int)325);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl147
                    break;
                }
            }
lbl133:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)jn.knej("kogx", kney(int ), (int)326);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 4: {
                var2_2 /* !! */  = (int)jn.knej("kogz", kney(int ), (int)327);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl143:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)jn.knej("koha", kney(int ), (int)328);
                if (!var3_1) break;
                throw null;
            }
lbl147:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("kohb", kney(int ), (int)329);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl152:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)jn.knej("kohc", kney(int ), (int)330);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)jn.knej("kohe", kney(int ), (int)331);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
lbl160:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)jn.knej("kohf", kney(int ), (int)332);
                if (!var3_1) ** GOTO lbl143
                throw null;
            }
lbl164:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)jn.knej("kohh", kney(int ), (int)333);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)jn.knej("kohi", kney(int ), (int)334);
        ** while (!var3_1)
lbl171:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void forEachHaloPass(jn$HaloPassConsumer jn$HaloPassConsumer) {
        boolean bl2;
        Object object = ss;
        boolean bl3 = true;
        block6: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - jn.knej("kopd", kneg(int ), (int)211);
            }
            switch ((int)object) {
                case -2031587296: {
                    callSite = jn.knej("kope", kneg(int ), (int)212);
                    continue block6;
                }
                case -338195988: {
                    callSite = jn.knej("kopf", kneg(int ), (int)213);
                    continue block6;
                }
                case 22317565: {
                    callSite = jn.knej("kopg", kneg(int ), (int)214);
                    continue block6;
                }
                case 878007493: {
                    break block6;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ss - jn.knej("koph", kneg(int ), (int)215)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == jn.knej("kopi", kney(int ), (int)508)) break;
            object2 = jn.knej("kopj", kney(int ), (int)509);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ss - jn.knej("kopk", kneg(int ), (int)216)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == jn.knej("kopl", kney(int ), (int)510)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = jn.knej("kopm", kney(int ), (int)511);
        }
        if (bl2 || bl2) return;
        CallSite callSite = jn.knej("kopn", kney(int ), (int)512);
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = ss - jn.knej("kopo", kneg(int ), (int)217)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == jn.knej("kopp", kney(int ), (int)513)) {
                this.forEachReducedHaloPass(jn$HaloPassConsumer, (int)callSite);
                if (bl2) return;
                break;
            }
            object4 = jn.knej("kopq", kney(int ), (int)514);
        }
        if (bl2) return;
        while (true) {
            long l5;
            Object object5;
            if ((object5 = (l5 = ss - jn.knej("kopr", kneg(int ), (int)218)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object5 == jn.knej("kops", kney(int ), (int)515)) {
                this.forEachHaloFillPass(jn$HaloPassConsumer);
                if (bl2) return;
                break;
            }
            object5 = jn.knej("kopt", kney(int ), (int)516);
        }
        if (!bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int packBakedItemFill() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kocc", kneg(int ), (int)143)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jn.knej("kocd", kney(int ), (int)294)) break;
            v0 /* !! */  = (long)jn.knej("kocf", kney(int ), (int)295);
        }
        var3_1 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kocg", kneg(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jn.knej("koch", kney(int ), (int)296)) break;
            v1 /* !! */  = (long)jn.knej("koci", kney(int ), (int)297);
        }
        var2_2 /* !! */  = jn.b;
        v2 /* !! */  = jn.ss;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - jn.knej("kock", kneg(int ), (int)145));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 878007493: {
                    break block26;
                }
                case 1568460544: {
                    v3 = jn.knej("kocl", kneg(int ), (int)146);
                    continue block26;
                }
                case 1636009942: {
                    v3 = jn.knej("kocm", kneg(int ), (int)147);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = jn.a;
        if (var3_1) {
            throw null;
lbl31:
            // 3 sources

            return (int)jn.knej("kocn", kney(int ), (int)298);
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        v4 /* !! */  = jn.ss;
        if (true) ** GOTO lbl38
        block28: while (true) {
            v4 /* !! */  = (long)(v5 - jn.knej("kocp", kneg(int ), (int)148));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1861727083: {
                    v5 = jn.knej("kocq", kneg(int ), (int)149);
                    continue block28;
                }
                case 878007493: {
                    break block28;
                }
                case 1554609441: {
                    v5 = jn.knej("kocr", kneg(int ), (int)150);
                    continue block28;
                }
            }
            break;
        }
        this.ensureRenderCache();
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v6 /* !! */  = jn.ss;
                if (true) ** GOTO lbl58
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - jn.knej("koct", kneg(int ), (int)151));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1634178783: {
                            v7 = jn.knej("kocu", kneg(int ), (int)152);
                            continue block29;
                        }
                        case -855232479: {
                            v7 = jn.knej("kocv", kneg(int ), (int)153);
                            continue block29;
                        }
                        case 444457849: {
                            v7 = jn.knej("kocx", kneg(int ), (int)154);
                            continue block29;
                        }
                        case 878007493: {
                            break block29;
                        }
                    }
                    break;
                }
                return this.frameBakedItemFill;
            }
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("kocy", kney(int ), (int)299);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)jn.knej("koda", kney(int ), (int)300);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 2: {
                var2_2 /* !! */  = (int)jn.knej("kodb", kney(int ), (int)301);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("kodc", kney(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
            }
lbl88:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("kodd", kney(int ), (int)303);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)jn.knej("kode", kney(int ), (int)304);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kphy() {
        jn.knez[800] = -1640324448;
        jn.knez[801] = -1584592815;
        jn.knez[802] = -301088000;
        jn.knez[803] = -177989211;
        jn.knez[804] = -20240040;
        jn.knez[805] = -690662977;
        jn.knez[806] = 943770227;
        jn.knez[807] = -878519995;
        jn.knez[808] = 185265855;
        jn.knez[809] = 1689200757;
        jn.knez[810] = 2105402012;
        jn.knez[811] = 877376723;
        jn.knez[812] = 1394889689;
        jn.knez[813] = 1792892542;
        jn.knez[814] = -138188725;
        jn.knez[815] = -1374785576;
        jn.knez[816] = -965127883;
        jn.knez[817] = 1260258371;
        jn.knez[818] = -1408668664;
        jn.knez[819] = -1123273658;
        jn.knez[820] = 366726820;
        jn.knez[821] = -1659884232;
        jn.knez[822] = -1038191291;
        jn.knez[823] = 1662475035;
        jn.knez[824] = 1681077303;
        jn.knez[825] = 806015065;
        jn.knez[826] = -2081072578;
        jn.knez[827] = -1825518428;
        jn.knez[828] = 123222730;
        jn.knez[829] = 413970963;
        jn.knez[830] = -648527563;
        jn.knez[831] = 103247489;
        jn.knez[832] = -1173674648;
        jn.knez[833] = 34043575;
        jn.knez[834] = 1738677999;
        jn.knez[835] = -1316854772;
        jn.knez[836] = 1299699943;
        jn.knez[837] = -1815722871;
        jn.knez[838] = 1164002738;
        jn.knez[839] = 86452519;
        jn.knez[840] = -1744926673;
        jn.knez[841] = -908945637;
        jn.knez[842] = -1260725556;
        jn.knez[843] = -71776040;
        jn.knez[844] = -275757989;
        jn.knez[845] = -1200105568;
        jn.knez[846] = -1701110851;
        jn.knez[847] = -1283906184;
        jn.knez[848] = 756266334;
        jn.knez[849] = -1892356488;
        jn.knez[850] = 695624447;
        jn.knez[851] = 370608761;
        jn.knez[852] = 2085452273;
        jn.knez[853] = 1159825474;
        jn.knez[854] = -982112441;
        jn.knez[855] = -1209857512;
        jn.knez[856] = -2088769139;
        jn.knez[857] = 1612111859;
        jn.knez[858] = 396098446;
        jn.knez[859] = 62294922;
        jn.knez[860] = -652743695;
        jn.knez[861] = 1797556831;
        jn.knez[862] = -1179345773;
        jn.knez[863] = 1460222642;
        jn.knez[864] = -79052640;
        jn.knez[865] = -289502680;
        jn.knez[866] = 596939267;
        jn.knez[867] = -1747819387;
        jn.knez[868] = 1518865129;
        jn.knez[869] = -1209263126;
        jn.knez[870] = 1661479832;
        jn.knez[871] = -636857743;
        jn.knez[872] = -895818182;
        jn.knez[873] = -86849970;
        jn.knez[874] = -575860889;
        jn.knez[875] = -1284072648;
        jn.knez[876] = -703526762;
        jn.knez[877] = 961240447;
        jn.knez[878] = 919583387;
        jn.knez[879] = 312910350;
        jn.knez[880] = 1900608852;
        jn.knez[881] = 1594594929;
        jn.knez[882] = 491005137;
        jn.knez[883] = -1676050655;
    }

    public jn() {
        int n2 = b;
        boolean bl2 = a;
        super("ShaderHands", "\u041d\u0430\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0435\u0442 \u0448\u0435\u0439\u0434\u0435\u0440 \u043d\u0430 \u0440\u0443\u043a\u0438 \u043e\u0442 \u043f\u0435\u0440\u0432\u043e\u0433\u043e \u043b\u0438\u0446\u0430", du.RENDER);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0420\u0435\u0436\u0438\u043c \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f \u0440\u0443\u043a", "\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435", "\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435", "\u041a\u0440\u0430\u0441\u0438\u0432\u044b\u0439", "\u0413\u0440\u0430\u0434\u0438\u0435\u043d\u0442");
        this.colorMode = new kf("\u0426\u0432\u0435\u0442", "\u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a \u0446\u0432\u0435\u0442\u043e\u0432 \u0448\u0435\u0439\u0434\u0435\u0440\u0430", COLOR_THEME, COLOR_THEME, COLOR_ITEM);
        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0443\u043b\u044c\u0441\u0430\u0446\u0438\u0438 \u0441\u0432\u0435\u0447\u0435\u043d\u0438\u044f", 1.0f).range((float)jn.knej("knfg", knff(int ), (int)4), (float)jn.knej("knfh", knff(int ), (int)5)).step((float)jn.knej("knfi", knff(int ), (int)6));
        this.fill = new kg("\u0417\u0430\u043b\u0438\u0432\u043a\u0430", "0% \u2014 \u0441\u0432\u0435\u0442\u0438\u0442\u0441\u044f \u0442\u043e\u043b\u044c\u043a\u043e \u043a\u043e\u043d\u0442\u0443\u0440, 100% \u2014 \u0432\u0441\u044f \u043f\u043e\u0432\u0435\u0440\u0445\u043d\u043e\u0441\u0442\u044c \u043f\u043e\u0434\u0441\u0432\u0435\u0447\u0435\u043d\u0430", 0.0f).range((int)jn.knej("knfj", kney(int ), (int)7), (int)jn.knej("knfk", kney(int ), (int)8)).suffix("%");
        this.trail = new kb("\u0428\u043b\u0435\u0439\u0444", "\u041e\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442 \u043f\u043b\u0430\u0432\u043d\u044b\u0439 \u0441\u0432\u0435\u0442\u044f\u0449\u0438\u0439\u0441\u044f \u0441\u043b\u0435\u0434 \u0437\u0430 \u0440\u0443\u043a\u0430\u043c\u0438 \u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u043c").setValue((boolean)jn.knej("knfl", kney(int ), (int)9)).visible(this::isStandardGlowMode);
        this.trailFade = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0437\u0430\u0442\u0443\u0445\u0430\u043d\u0438\u044f", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0438\u0441\u0447\u0435\u0437\u043d\u043e\u0432\u0435\u043d\u0438\u044f \u0441\u0442\u0430\u0440\u044b\u0445 \u043a\u0430\u0434\u0440\u043e\u0432 \u0448\u043b\u0435\u0439\u0444\u0430", (float)jn.knej("knfm", knff(int ), (int)10)).range((float)jn.knej("knfn", knff(int ), (int)11), (float)jn.knej("knfo", knff(int ), (int)12)).step((float)jn.knej("knfp", knff(int ), (int)13)).visible(this::isTrailControlsVisible);
        this.trailRise = new kg("\u041f\u043e\u0434\u044a\u0451\u043c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e\u0434\u044a\u0451\u043c\u0430 \u0448\u043b\u0435\u0439\u0444\u0430 \u0432\u0432\u0435\u0440\u0445", (float)jn.knej("knfq", knff(int ), (int)14)).range(0.0f, (float)jn.knej("knfr", knff(int ), (int)15)).step((float)jn.knej("knfs", knff(int ), (int)16)).visible(this::isTrailControlsVisible);
        this.trailSway = new kg("\u041a\u0430\u0447\u0430\u043d\u0438\u0435", "\u0410\u043c\u043f\u043b\u0438\u0442\u0443\u0434\u0430 \u043f\u043b\u0430\u0432\u043d\u043e\u0433\u043e \u043f\u043e\u043a\u0430\u0447\u0438\u0432\u0430\u043d\u0438\u044f \u0448\u043b\u0435\u0439\u0444\u0430", (float)jn.knej("knft", knff(int ), (int)17)).range(0.0f, (float)jn.knej("knfu", knff(int ), (int)18)).step((float)jn.knej("knfv", knff(int ), (int)19)).visible(this::isTrailControlsVisible);
        this.trailTurbulence = new kg("\u0422\u0443\u0440\u0431\u0443\u043b\u0435\u043d\u0442\u043d\u043e\u0441\u0442\u044c", "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u043d\u0435\u0440\u043e\u0432\u043d\u043e\u0435 \u0432\u043e\u043b\u043d\u043e\u043e\u0431\u0440\u0430\u0437\u043d\u043e\u0435 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435", 0.0f).range(0.0f, (float)jn.knej("knfw", knff(int ), (int)20)).step((float)jn.knej("knfx", knff(int ), (int)21)).visible(this::isTrailControlsVisible);
        this.trailFlicker = new kg("\u041c\u0435\u0440\u0446\u0430\u043d\u0438\u0435", "\u0418\u043d\u0442\u0435\u043d\u0441\u0438\u0432\u043d\u043e\u0441\u0442\u044c \u043c\u0435\u0440\u0446\u0430\u043d\u0438\u044f \u0448\u043b\u0435\u0439\u0444\u0430", 0.0f).range(0.0f, (float)jn.knej("knfy", knff(int ), (int)22)).step((float)jn.knej("knfz", knff(int ), (int)23)).visible(this::isTrailControlsVisible);
        this.trailBurst = new kb("\u0421\u0434\u0443\u0432 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435", "\u0411\u044b\u0441\u0442\u0440\u0435\u0435 \u0440\u0430\u0441\u0441\u0435\u0438\u0432\u0430\u0435\u0442 \u0448\u043b\u0435\u0439\u0444 \u043f\u0440\u0438 \u0432\u0437\u043c\u0430\u0445\u0435 \u0440\u0443\u043a\u0438").setValue((boolean)jn.knej("knga", kney(int ), (int)24)).visible(this::isTrailControlsVisible);
        this.trailBurstPower = new kg("\u0421\u0438\u043b\u0430 \u0441\u0434\u0443\u0432\u0430", "\u0421\u0438\u043b\u0430 \u0440\u0430\u0441\u0441\u0435\u0438\u0432\u0430\u043d\u0438\u044f \u0448\u043b\u0435\u0439\u0444\u0430 \u043f\u0440\u0438 \u0432\u0437\u043c\u0430\u0445\u0435", (float)jn.knej("kngb", knff(int ), (int)25)).range(1.0f, (float)jn.knej("kngc", knff(int ), (int)26)).step((float)jn.knej("kngd", knff(int ), (int)27)).visible(this::lambda$new$0);
        this.trailModel = new kb("\u0428\u043b\u0435\u0439\u0444 \u043c\u043e\u0434\u0435\u043b\u0438", "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u0432 \u0441\u043b\u0435\u0434 \u0441\u0438\u043b\u0443\u044d\u0442 \u0440\u0443\u043a\u0438 \u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430").setValue((boolean)jn.knej("knge", kney(int ), (int)28)).visible(this::isTrailControlsVisible);
        this.trailModelAlpha = new kg("\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c \u043c\u043e\u0434\u0435\u043b\u0438", "\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u0441\u0438\u043b\u0443\u044d\u0442\u0430 \u0440\u0443\u043a\u0438 \u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u0432 \u0448\u043b\u0435\u0439\u0444\u0435", (float)jn.knej("kngf", knff(int ), (int)29)).range((float)jn.knej("kngg", knff(int ), (int)30), 1.0f).step((float)jn.knej("kngh", knff(int ), (int)31)).visible(this::lambda$new$1);
        this.cachedRingLights = new int[HALO_RINGS.length];
        this.cachedPrimaryColor = (int)jn.knej("kngi", kney(int ), (int)32);
        this.cachedSecondaryColor = (int)jn.knej("kngj", kney(int ), (int)33);
        instance = this;
        this.settings(this.mode, this.colorMode, this.speed, this.fill, this.trail, this.trailFade, this.trailRise, this.trailSway, this.trailTurbulence, this.trailFlicker, this.trailBurst, this.trailBurstPower, this.trailModel, this.trailModelAlpha);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int lerpColor(int var0, int var1_1, float var2_2) {
        var17_3 = jn.c;
        var16_4 /* !! */  = jn.b;
        var15_5 = jn.a;
        if (var17_3) {
            throw null;
lbl6:
            // 13 sources

            return (int)jn.knej("kpdi", kney(int ), (int)798);
        }
        if (var15_5 || var15_5) ** GOTO lbl6
        var3_6 = var0 >>> jn.knej("kpdj", kney(int ), (int)799) & jn.knej("kpdk", kney(int ), (int)800);
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_5 || var15_5) ** GOTO lbl6
                var4_7 = var0 >> jn.knej("kpdl", kney(int ), (int)801) & jn.knej("kpdm", kney(int ), (int)802);
                if (var15_5 || var15_5) ** GOTO lbl6
                var5_8 = var0 >> jn.knej("kpdn", kney(int ), (int)803) & jn.knej("kpdo", kney(int ), (int)804);
                if (var15_5 || var15_5) ** GOTO lbl6
                var6_9 = var0 & jn.knej("kpdp", kney(int ), (int)805);
                if (var15_5 || var15_5) ** GOTO lbl6
                var7_10 = var1_1 >>> jn.knej("kpdq", kney(int ), (int)806) & jn.knej("kpdr", kney(int ), (int)807);
                if (var15_5 || var15_5) ** GOTO lbl6
                var8_11 = var1_1 >> jn.knej("kpds", kney(int ), (int)808) & jn.knej("kpdt", kney(int ), (int)809);
                if (var15_5 || var15_5) ** GOTO lbl6
                var9_12 = var1_1 >> jn.knej("kpdu", kney(int ), (int)810) & jn.knej("kpdv", kney(int ), (int)811);
                if (var15_5 || var15_5) ** GOTO lbl6
                var10_13 = var1_1 & jn.knej("kpdw", kney(int ), (int)812);
                if (var15_5 || var15_5) ** GOTO lbl6
                var11_14 = Math.round((float)var3_6 + (float)(var7_10 - var3_6) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var12_15 = Math.round((float)var4_7 + (float)(var8_11 - var4_7) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var13_16 = Math.round((float)var5_8 + (float)(var9_12 - var5_8) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var14_17 = Math.round((float)var6_9 + (float)(var10_13 - var6_9) * var2_2);
                if (var15_5 || var15_5) ** continue;
                return var11_14 << jn.knej("kpdx", kney(int ), (int)813) | var12_15 << jn.knej("kpdy", kney(int ), (int)814) | var13_16 << jn.knej("kpdz", kney(int ), (int)815) | var14_17;
            }
lbl37:
            // 3 sources

            case 0: {
                var16_4 /* !! */  = (int)jn.knej("kpea", kney(int ), (int)816);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl42:
            // 2 sources

            case 1: {
                var16_4 /* !! */  = (int)jn.knej("kpeb", kney(int ), (int)817);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl47:
            // 4 sources

            case 2: {
                var16_4 /* !! */  = (int)jn.knej("kpec", kney(int ), (int)818);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl56
            }
lbl52:
            // 2 sources

            case 3: {
                var16_4 /* !! */  = (int)jn.knej("kped", kney(int ), (int)819);
                if (!var17_3) ** GOTO lbl47
                throw null;
            }
lbl56:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_4 /* !! */  = (int)jn.knej("kpee", kney(int ), (int)820);
                    if (var17_3) {
                        throw null;
                    }
                    ** GOTO lbl140
                    break;
                }
            }
lbl62:
            // 2 sources

            case 5: {
                var16_4 /* !! */  = (int)jn.knej("kpef", kney(int ), (int)821);
                if (!var17_3) ** GOTO lbl42
                throw null;
            }
lbl66:
            // 2 sources

            case 6: {
                var16_4 /* !! */  = (int)jn.knej("kpeg", kney(int ), (int)822);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 7: {
                var16_4 /* !! */  = (int)jn.knej("kpeh", kney(int ), (int)823);
                if (var17_3) {
                    throw null;
                }
            }
lbl75:
            // 4 sources

            case 8: {
                do {
                    var16_4 /* !! */  = (int)jn.knej("kpei", kney(int ), (int)824);
                } while (!var17_3);
                throw null;
            }
            case 9: {
                var16_4 /* !! */  = (int)jn.knej("kpej", kney(int ), (int)825);
                if (!var17_3) ** GOTO lbl37
                throw null;
            }
lbl84:
            // 2 sources

            case 10: {
                var16_4 /* !! */  = (int)jn.knej("kpek", kney(int ), (int)826);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 11: {
                var16_4 /* !! */  = (int)jn.knej("kpel", kney(int ), (int)827);
                if (!var17_3) ** GOTO lbl37
                throw null;
            }
lbl93:
            // 2 sources

            case 12: {
                var16_4 /* !! */  = (int)jn.knej("kpem", kney(int ), (int)828);
                if (!var17_3) ** GOTO lbl52
                throw null;
            }
            case 13: {
                var16_4 /* !! */  = (int)jn.knej("kpen", kney(int ), (int)829);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 14: {
                var16_4 /* !! */  = (int)jn.knej("kpeo", kney(int ), (int)830);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl107:
            // 2 sources

            case 15: {
                var16_4 /* !! */  = (int)jn.knej("kpep", kney(int ), (int)831);
                if (!var17_3) ** GOTO lbl47
                throw null;
            }
            case 16: {
                var16_4 /* !! */  = (int)jn.knej("kpeq", kney(int ), (int)832);
                if (!var17_3) ** GOTO lbl66
                throw null;
            }
lbl115:
            // 2 sources

            case 17: {
                var16_4 /* !! */  = (int)jn.knej("kper", kney(int ), (int)833);
                if (!var17_3) ** GOTO lbl107
                throw null;
            }
lbl119:
            // 3 sources

            case 18: {
                var16_4 /* !! */  = (int)jn.knej("kpes", kney(int ), (int)834);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 19: {
                var16_4 /* !! */  = (int)jn.knej("kpet", kney(int ), (int)835);
                if (var17_3) {
                    throw null;
                }
            }
            case 20: {
                var16_4 /* !! */  = (int)jn.knej("kpeu", kney(int ), (int)836);
                if (!var17_3) ** GOTO lbl75
                throw null;
            }
lbl132:
            // 2 sources

            case 21: {
                var16_4 /* !! */  = (int)jn.knej("kpev", kney(int ), (int)837);
                if (!var17_3) ** GOTO lbl93
                throw null;
            }
lbl136:
            // 2 sources

            case 22: {
                var16_4 /* !! */  = (int)jn.knej("kpew", kney(int ), (int)838);
                if (!var17_3) ** GOTO lbl47
                throw null;
            }
lbl140:
            // 3 sources

            case 23: {
                var16_4 /* !! */  = (int)jn.knej("kpex", kney(int ), (int)839);
                if (!var17_3) ** GOTO lbl115
                throw null;
            }
lbl144:
            // 2 sources

            case 24: {
                var16_4 /* !! */  = (int)jn.knej("kpey", kney(int ), (int)840);
                if (!var17_3) ** GOTO lbl84
                throw null;
            }
lbl148:
            // 3 sources

            case 25: {
                var16_4 /* !! */  = (int)jn.knej("kpez", kney(int ), (int)841);
                if (!var17_3) ** GOTO lbl136
                throw null;
            }
            case 26: {
                var16_4 /* !! */  = (int)jn.knej("kpfa", kney(int ), (int)842);
                if (!var17_3) ** GOTO lbl132
                throw null;
            }
            case 27: 
        }
        var16_4 /* !! */  = (int)jn.knej("kpfb", kney(int ), (int)843);
        ** while (!var17_3)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kphq() {
        jn.knez[0] = -531700205;
        jn.knez[1] = 231678345;
        jn.knez[2] = -1203936324;
        jn.knez[3] = 1988212503;
        jn.knez[4] = 1206057970;
        jn.knez[5] = -828354357;
        jn.knez[6] = 806647554;
        jn.knez[7] = -1998141828;
        jn.knez[8] = -795416679;
        jn.knez[9] = -1191963063;
        jn.knez[10] = 1309829901;
        jn.knez[11] = -735729121;
        jn.knez[12] = 1971022996;
        jn.knez[13] = 239059133;
        jn.knez[14] = -1622490006;
        jn.knez[15] = -1234649940;
        jn.knez[16] = 400030117;
        jn.knez[17] = 1599549913;
        jn.knez[18] = 808520183;
        jn.knez[19] = 2096432176;
        jn.knez[20] = -151570514;
        jn.knez[21] = 1366729358;
        jn.knez[22] = 989831678;
        jn.knez[23] = -1412314114;
        jn.knez[24] = -1091689487;
        jn.knez[25] = 912897153;
        jn.knez[26] = -492012792;
        jn.knez[27] = -1086508985;
        jn.knez[28] = -1799163534;
        jn.knez[29] = 502200949;
        jn.knez[30] = -1341509464;
        jn.knez[31] = 1857862388;
        jn.knez[32] = 1011934691;
        jn.knez[33] = -1683108919;
        jn.knez[34] = 274593180;
        jn.knez[35] = -1775709252;
        jn.knez[36] = -1978175821;
        jn.knez[37] = -1268733144;
        jn.knez[38] = 1527193277;
        jn.knez[39] = -1522457888;
        jn.knez[40] = 1118235840;
        jn.knez[41] = 1254519641;
        jn.knez[42] = -1255744046;
        jn.knez[43] = 386613574;
        jn.knez[44] = 1241098472;
        jn.knez[45] = 1290958577;
        jn.knez[46] = -1638329723;
        jn.knez[47] = 2120594784;
        jn.knez[48] = 990059457;
        jn.knez[49] = 769457422;
        jn.knez[50] = -2071820512;
        jn.knez[51] = 0x77773133;
        jn.knez[52] = -1564509093;
        jn.knez[53] = 1717720636;
        jn.knez[54] = 1145576034;
        jn.knez[55] = -1935051604;
        jn.knez[56] = 1748134759;
        jn.knez[57] = 27997177;
        jn.knez[58] = 1321023866;
        jn.knez[59] = -18753131;
        jn.knez[60] = -1878687908;
        jn.knez[61] = 49575629;
        jn.knez[62] = -1884051274;
        jn.knez[63] = -766517604;
        jn.knez[64] = 1418031620;
        jn.knez[65] = -1837937700;
        jn.knez[66] = -403826233;
        jn.knez[67] = -444816045;
        jn.knez[68] = -1668567256;
        jn.knez[69] = 2002904630;
        jn.knez[70] = 810156979;
        jn.knez[71] = 492353376;
        jn.knez[72] = -1529036349;
        jn.knez[73] = 2086859149;
        jn.knez[74] = -375118242;
        jn.knez[75] = 171532504;
        jn.knez[76] = 57426282;
        jn.knez[77] = -692075740;
        jn.knez[78] = 403725406;
        jn.knez[79] = 706956692;
        jn.knez[80] = -1611203632;
        jn.knez[81] = 498893691;
        jn.knez[82] = 489723710;
        jn.knez[83] = -2040653447;
        jn.knez[84] = 1889595413;
        jn.knez[85] = 565163070;
        jn.knez[86] = 846634072;
        jn.knez[87] = 574776360;
        jn.knez[88] = 1429079768;
        jn.knez[89] = -743840937;
        jn.knez[90] = -748753717;
        jn.knez[91] = -1472173929;
        jn.knez[92] = -1494621320;
        jn.knez[93] = 556966195;
        jn.knez[94] = -2004160278;
        jn.knez[95] = 2047157745;
        jn.knez[96] = -1223108708;
        jn.knez[97] = -349307768;
        jn.knez[98] = 601578653;
        jn.knez[99] = -2053007462;
    }

    private static /* synthetic */ void kpip() {
        jn.knei[300] = -4020577721071842751L;
        jn.knei[301] = 3607755033732578547L;
        jn.knei[302] = 6693168968270180450L;
        jn.knei[303] = 4500178284677845454L;
        jn.knei[304] = 7725049848404410396L;
        jn.knei[305] = 8306913334888434691L;
        jn.knei[306] = -409621803834925784L;
        jn.knei[307] = -1347556140598355784L;
        jn.knei[308] = 6318221513277998671L;
        jn.knei[309] = 5324398076646240540L;
        jn.knei[310] = -6058671384930711894L;
        jn.knei[311] = 2596035257851283900L;
        jn.knei[312] = 10822285168355088L;
        jn.knei[313] = 7536665972716020500L;
        jn.knei[314] = -7048513549193333882L;
        jn.knei[315] = 209784061152608722L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isItemColorMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knmu", kneg(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jn.knej("knmv", kney(int ), (int)134)) break;
            v0 /* !! */  = (long)jn.knej("knmw", kney(int ), (int)135);
        }
        var3_1 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knmx", kneg(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jn.knej("knmy", kney(int ), (int)136)) break;
            v1 /* !! */  = (long)jn.knej("knmz", kney(int ), (int)137);
        }
        var2_2 /* !! */  = jn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("knna", kneg(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jn.knej("knnb", kney(int ), (int)138)) break;
            v2 /* !! */  = (long)jn.knej("knnd", kney(int ), (int)139);
        }
        var1_3 = jn.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)jn.knej("knne", kney(int ), (int)140);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = jn.ss;
                if (true) ** GOTO lbl34
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - jn.knej("knnf", kneg(int ), (int)66));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 878007493: {
                            break block19;
                        }
                        case 1673369498: {
                            v4 = jn.knej("knng", kneg(int ), (int)67);
                            continue block19;
                        }
                        case 1682368559: {
                            v4 = jn.knej("knnh", kneg(int ), (int)68);
                            continue block19;
                        }
                    }
                    break;
                }
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl47
                block20: while (true) {
                    v5 /* !! */  = (long)(jn.knej("knnl", kneg(int ), (int)70) - jn.knej("knnk", kneg(int ), (int)69));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 878007493: {
                            break block20;
                        }
                        case 1762796363: {
                            continue block20;
                        }
                    }
                    break;
                }
                return this.colorMode.isSelected("\u041e\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430");
            }
lbl53:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jn.knej("knnn", kney(int ), (int)141);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jn.knej("knnp", kney(int ), (int)142);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("knnr", kney(int ), (int)143);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jn.knej("knns", kney(int ), (int)144);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void forEachHaloPass(jn$HaloPassConsumer var1_1, boolean var2_2) {
        var10_3 = jn.c;
        var9_4 /* !! */  = jn.b;
        var8_5 = jn.a;
        if (var10_3) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var8_5 || var8_5) ** GOTO lbl6
        this.ensureRenderCache();
        if (var8_5 || var8_5) ** GOTO lbl6
        var3_6 = this.framePrimaryColor;
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_5 || var8_5) ** GOTO lbl6
                var4_7 = this.frameSecondaryColor;
                if (var8_5 || var8_5) ** GOTO lbl6
                this.updateRingLights(var3_6, var4_7);
                if (var8_5 || var8_5) ** GOTO lbl6
                var5_8 = Math.max((int)jn.knej("koxe", kney(int ), (int)676), Math.min((int)jn.knej("koxf", kney(int ), (int)677), Math.round(this.frameSpeed / jn.knej("koxg", knff(int ), (int)678) * jn.knej("koxh", knff(int ), (int)679))));
                if (var8_5 || var8_5) ** GOTO lbl6
                var6_9 = jn.HALO_PASS_OVERLAYS[var5_8];
                if (var8_5 || var8_5) ** GOTO lbl6
                var7_10 = jn.knej("koxi", kney(int ), (int)680);
                if (var8_5) ** GOTO lbl6
                do {
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (var7_10 >= jn.HALO_PASS_RINGS.length) ** GOTO lbl36
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var1_1.accept(this.cachedRingLights[jn.HALO_PASS_RINGS[var7_10]], var6_9[var7_10]);
                    if (var8_5 || var8_5) ** GOTO lbl6
                    ++var7_10;
                    if (var8_5) ** GOTO lbl6
                } while (!var10_3);
                throw null;
lbl36:
                // 1 sources

                if (var8_5 || var8_5) ** GOTO lbl6
                if (!var2_2) ** GOTO lbl43
                if (var8_5) ** GOTO lbl6
                if (!(this.fillFraction() > jn.knej("koxj", knff(int ), (int)681))) ** GOTO lbl43
                if (var8_5 || var8_5) ** GOTO lbl6
                var1_1.accept(oo.packColorAlpha(var3_6, this.fillFraction() * jn.knej("koxk", knff(int ), (int)682)), this.frameTrailModelOverlay);
                if (var8_5) ** GOTO lbl6
lbl43:
                // 3 sources

                if (!var8_5 && !var8_5) ** break;
                ** continue;
                return;
            }
lbl46:
            // 2 sources

            case 0: {
                var9_4 /* !! */  = (int)jn.knej("koxl", kney(int ), (int)683);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 1: {
                do {
                    var9_4 /* !! */  = (int)jn.knej("koxm", kney(int ), (int)684);
                } while (!var10_3);
                throw null;
            }
lbl56:
            // 3 sources

            case 2: {
                var9_4 /* !! */  = (int)jn.knej("koxn", kney(int ), (int)685);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl61:
            // 2 sources

            case 3: {
                var9_4 /* !! */  = (int)jn.knej("koxo", kney(int ), (int)686);
                if (var10_3) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)jn.knej("koxp", kney(int ), (int)687);
                    if (!var10_3) ** GOTO lbl56
                    throw null;
                }
            }
lbl70:
            // 2 sources

            case 5: {
                var9_4 /* !! */  = (int)jn.knej("koxq", kney(int ), (int)688);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl75:
            // 2 sources

            case 6: {
                var9_4 /* !! */  = (int)jn.knej("koxr", kney(int ), (int)689);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl80:
            // 2 sources

            case 7: {
                var9_4 /* !! */  = (int)jn.knej("koxs", kney(int ), (int)690);
                if (!var10_3) ** GOTO lbl46
                throw null;
            }
lbl84:
            // 2 sources

            case 8: {
                var9_4 /* !! */  = (int)jn.knej("koxt", kney(int ), (int)691);
                if (!var10_3) break;
                throw null;
            }
lbl88:
            // 3 sources

            case 9: {
                var9_4 /* !! */  = (int)jn.knej("koxu", kney(int ), (int)692);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl93:
            // 2 sources

            case 10: {
                var9_4 /* !! */  = (int)jn.knej("koxv", kney(int ), (int)693);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl98:
            // 2 sources

            case 11: {
                var9_4 /* !! */  = (int)jn.knej("koxw", kney(int ), (int)694);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl103:
            // 2 sources

            case 12: {
                var9_4 /* !! */  = (int)jn.knej("koxx", kney(int ), (int)695);
                if (!var10_3) ** GOTO lbl88
                throw null;
            }
lbl107:
            // 3 sources

            case 13: {
                var9_4 /* !! */  = (int)jn.knej("koxy", kney(int ), (int)696);
                if (!var10_3) ** GOTO lbl56
                throw null;
            }
lbl111:
            // 2 sources

            case 14: {
                var9_4 /* !! */  = (int)jn.knej("koxz", kney(int ), (int)697);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 15: {
                var9_4 /* !! */  = (int)jn.knej("koya", kney(int ), (int)698);
                if (!var10_3) ** GOTO lbl111
                throw null;
            }
            case 16: {
                var9_4 /* !! */  = (int)jn.knej("koyb", kney(int ), (int)699);
                if (!var10_3) ** GOTO lbl93
                throw null;
            }
            case 17: {
                var9_4 /* !! */  = (int)jn.knej("koyc", kney(int ), (int)700);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl129:
            // 2 sources

            case 18: {
                var9_4 /* !! */  = (int)jn.knej("koyd", kney(int ), (int)701);
                if (var10_3) {
                    throw null;
                }
            }
lbl133:
            // 4 sources

            case 19: {
                var9_4 /* !! */  = (int)jn.knej("koye", kney(int ), (int)702);
                if (!var10_3) ** GOTO lbl84
                throw null;
            }
            case 20: {
                var9_4 /* !! */  = (int)jn.knej("koyf", kney(int ), (int)703);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 21: {
                var9_4 /* !! */  = (int)jn.knej("koyg", kney(int ), (int)704);
                if (!var10_3) ** GOTO lbl70
                throw null;
            }
lbl146:
            // 3 sources

            case 22: {
                do {
                    var9_4 /* !! */  = (int)jn.knej("koyh", kney(int ), (int)705);
                } while (!var10_3);
                throw null;
            }
lbl151:
            // 2 sources

            case 23: {
                var9_4 /* !! */  = (int)jn.knej("koyi", kney(int ), (int)706);
                if (!var10_3) ** GOTO lbl103
                throw null;
            }
lbl155:
            // 2 sources

            case 24: {
                var9_4 /* !! */  = (int)jn.knej("koyj", kney(int ), (int)707);
                if (!var10_3) ** GOTO lbl75
                throw null;
            }
            case 25: {
                var9_4 /* !! */  = (int)jn.knej("koyk", kney(int ), (int)708);
                if (!var10_3) ** GOTO lbl107
                throw null;
            }
            case 26: {
                var9_4 /* !! */  = (int)jn.knej("koyl", kney(int ), (int)709);
                if (!var10_3) ** GOTO lbl88
                throw null;
            }
lbl167:
            // 2 sources

            case 27: {
                var9_4 /* !! */  = (int)jn.knej("koym", kney(int ), (int)710);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 28: {
                var9_4 /* !! */  = (int)jn.knej("koyn", kney(int ), (int)711);
                if (!var10_3) ** GOTO lbl61
                throw null;
            }
            case 29: {
                var9_4 /* !! */  = (int)jn.knej("koyo", kney(int ), (int)712);
                if (!var10_3) ** GOTO lbl167
                throw null;
            }
lbl180:
            // 2 sources

            case 30: {
                var9_4 /* !! */  = (int)jn.knej("koyp", kney(int ), (int)713);
                if (!var10_3) ** GOTO lbl107
                throw null;
            }
lbl184:
            // 4 sources

            case 31: {
                var9_4 /* !! */  = (int)jn.knej("koyq", kney(int ), (int)714);
                if (!var10_3) ** GOTO lbl98
                throw null;
            }
            case 32: 
        }
        var9_4 /* !! */  = (int)jn.knej("koyr", kney(int ), (int)715);
        ** while (!var10_3)
lbl191:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public long getRenderFrameSerial() {
        boolean bl2;
        Object object = ss;
        block9: while (true) {
            switch ((int)object) {
                case 878007493: {
                    break block9;
                }
                case 1711607353: {
                    object = jn.knej("knwj", kneg(int ), (int)108) - jn.knej("knwi", kneg(int ), (int)107);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ss;
        boolean bl4 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - jn.knej("knwl", kneg(int ), (int)109);
            }
            switch ((int)object2) {
                case -534304634: {
                    callSite = jn.knej("knwm", kneg(int ), (int)110);
                    continue block10;
                }
                case -387758014: {
                    callSite = jn.knej("knwn", kneg(int ), (int)111);
                    continue block10;
                }
                case 878007493: {
                    break block10;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ss - jn.knej("knwp", kneg(int ), (int)112)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == jn.knej("knwq", kney(int ), (int)242)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = jn.knej("knwr", kney(int ), (int)243);
        }
        if (bl2) return (long)jn.knej("knwt", kneg(int ), (int)113);
        if (bl2) return (long)jn.knej("knwt", kneg(int ), (int)113);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ss - jn.knej("knwu", kneg(int ), (int)114)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == jn.knej("knww", kney(int ), (int)244)) break;
            object4 = jn.knej("knwx", kney(int ), (int)245);
        }
        this.ensureRenderCache();
        if (bl2) return (long)jn.knej("knwt", kneg(int ), (int)113);
        if (bl2) return (long)jn.knej("knwt", kneg(int ), (int)113);
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = ss - jn.knej("knwy", kneg(int ), (int)115)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == jn.knej("knwz", kney(int ), (int)246)) {
                return this.renderFrameSerial;
            }
            object5 = jn.knej("knxa", kney(int ), (int)247);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jn getInstance() {
        v0 /* !! */  = jn.ss;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(jn.knej("knel", kneg(int ), (int)1) - jn.knej("knek", kneg(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 878007493: {
                    break block28;
                }
                case 883115395: {
                    continue block28;
                }
            }
            break;
        }
        var2 = jn.c;
        v1 /* !! */  = jn.ss;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - jn.knej("knem", kneg(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 135657292: {
                    v2 = jn.knej("knen", kneg(int ), (int)3);
                    continue block29;
                }
                case 781247437: {
                    v2 = jn.knej("kneo", kneg(int ), (int)4);
                    continue block29;
                }
                case 878007493: {
                    break block29;
                }
                case 909011395: {
                    v2 = jn.knej("knep", kneg(int ), (int)5);
                    continue block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = jn.b;
        v3 /* !! */  = jn.ss;
        if (true) ** GOTO lbl32
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - jn.knej("kneq", kneg(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -390042058: {
                    v4 = jn.knej("kner", kneg(int ), (int)7);
                    continue block30;
                }
                case 581836638: {
                    v4 = jn.knej("knes", kneg(int ), (int)8);
                    continue block30;
                }
                case 719704356: {
                    v4 = jn.knej("knet", kneg(int ), (int)9);
                    continue block30;
                }
                case 878007493: {
                    break block30;
                }
            }
            break;
        }
        var0_2 = jn.a;
        if (!var2) ** GOTO lbl51
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl51:
                // 1 sources

                if (var0_2 || var0_2) continue block31;
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl56
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - jn.knej("kneu", kneg(int ), (int)10));
lbl56:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1241266096: {
                            v6 = jn.knej("knev", kneg(int ), (int)11);
                            continue block32;
                        }
                        case -655927490: {
                            v6 = jn.knej("knew", kneg(int ), (int)12);
                            continue block32;
                        }
                        case -196613978: {
                            v6 = jn.knej("knex", kneg(int ), (int)13);
                            continue block32;
                        }
                        case 878007493: {
                            break block32;
                        }
                    }
                    break;
                }
                return jn.instance;
                case 0: {
                    var1_1 /* !! */  = (int)jn.knej("knfb", kney(int ), (int)0);
                    if (!var2) break block31;
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)jn.knej("knfc", kney(int ), (int)1);
                    if (var2) {
                        throw null;
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)jn.knej("knfd", kney(int ), (int)2);
                    if (!var2) break block31;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)jn.knej("knfe", kney(int ), (int)3);
        } while (!var2);
        throw null;
    }

    static {
        knez = new int[884];
        knfa = new int[884];
        jn.kphq();
        jn.kphr();
        jn.kphs();
        jn.kpht();
        jn.kphu();
        jn.kphv();
        jn.kphw();
        jn.kphx();
        jn.kphy();
        jn.kphz();
        jn.kpia();
        jn.kpib();
        jn.kpic();
        jn.kpid();
        jn.kpie();
        jn.kpif();
        jn.kpig();
        jn.kpih();
        kneh = new long[316];
        knei = new long[316];
        jn.kpii();
        jn.kpij();
        jn.kpik();
        jn.kpil();
        jn.kpim();
        jn.kpin();
        jn.kpio();
        jn.kpip();
        HALO_RINGS = jn.buildHaloRings();
        HALO_PASS_RINGS = jn.buildHaloPassRings();
        HALO_PASS_OVERLAYS = jn.buildHaloPassOverlays();
    }

    private static /* synthetic */ double kojg(int n2) {
        return Double.longBitsToDouble(kneh[n2] ^ knei[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateRingLights(int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("koys", kneg(int ), (int)252)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jn.knej("koyt", kney(int ), (int)716)) break;
            v0 /* !! */  = (long)jn.knej("koyu", kney(int ), (int)717);
        }
        var7_3 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("koyv", kneg(int ), (int)253)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jn.knej("koyw", kney(int ), (int)718)) break;
            v1 /* !! */  = (long)jn.knej("koyx", kney(int ), (int)719);
        }
        var6_4 /* !! */  = jn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("koyy", kneg(int ), (int)254)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jn.knej("koyz", kney(int ), (int)720)) break;
            v2 /* !! */  = (long)jn.knej("koza", kney(int ), (int)721);
        }
        var5_5 = jn.a;
        if (var7_3) {
            throw null;
lbl21:
            // 14 sources

            return;
        }
        if (var5_5) ** GOTO lbl21
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("kozb", kneg(int ), (int)255)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == jn.knej("kozc", kney(int ), (int)722)) break;
                    v3 /* !! */  = (long)jn.knej("kozd", kney(int ), (int)723);
                }
                if (var1_1 != this.cachedPrimaryColor) ** GOTO lbl43
                if (var5_5) ** GOTO lbl21
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("koze", kneg(int ), (int)256)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jn.knej("kozf", kney(int ), (int)724)) break;
                    v4 /* !! */  = (long)jn.knej("kozg", kney(int ), (int)725);
                }
                if (var2_2 != this.cachedSecondaryColor) ** GOTO lbl43
                if (var5_5 || var5_5) ** GOTO lbl21
                return;
lbl43:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl21
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl48
                block53: while (true) {
                    v5 /* !! */  = (long)(jn.knej("kozi", kneg(int ), (int)258) - jn.knej("kozh", kneg(int ), (int)257));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 525442435: {
                            continue block53;
                        }
                        case 878007493: {
                            break block53;
                        }
                    }
                    break;
                }
                this.cachedPrimaryColor = var1_1;
                if (var5_5 || var5_5) ** GOTO lbl21
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_5 = jn.ss - jn.knej("kozj", kneg(int ), (int)259)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jn.knej("kozk", kney(int ), (int)726)) break;
                    v6 /* !! */  = (long)jn.knej("kozl", kney(int ), (int)727);
                }
                this.cachedSecondaryColor = var2_2;
                if (var5_5 || var5_5) ** GOTO lbl21
                var3_6 = jn.knej("kozm", kney(int ), (int)728);
                if (var5_5) ** GOTO lbl21
                do {
                    if (var5_5 || var5_5) ** GOTO lbl21
                    v7 /* !! */  = jn.ss;
                    if (true) ** GOTO lbl70
                    block56: while (true) {
                        v7 /* !! */  = (long)(v8 - jn.knej("kozn", kneg(int ), (int)260));
lbl70:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1485416695: {
                                v8 = jn.knej("kozo", kneg(int ), (int)261);
                                continue block56;
                            }
                            case -1464614913: {
                                v8 = jn.knej("kozp", kneg(int ), (int)262);
                                continue block56;
                            }
                            case 606662291: {
                                v8 = jn.knej("kozq", kneg(int ), (int)263);
                                continue block56;
                            }
                            case 878007493: {
                                break block56;
                            }
                        }
                        break;
                    }
                    if (var3_6 >= jn.HALO_RINGS.length) ** GOTO lbl132
                    if (var5_5 || var5_5) ** GOTO lbl21
                    v9 = (float)var3_6;
                    while (true) {
                        if ((v10 = (cfr_temp_6 = jn.ss - jn.knej("kozr", kneg(int ), (int)264)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v10 == jn.knej("kozs", kney(int ), (int)729)) break;
                        v10 = -1032832835;
                    }
                    v11 = v9 / (float)(jn.HALO_RINGS.length - jn.knej("kozt", kney(int ), (int)730));
                    v12 /* !! */  = jn.ss;
                    if (true) ** GOTO lbl95
                    block58: while (true) {
                        v12 /* !! */  = (long)(jn.knej("kozv", kneg(int ), (int)266) - jn.knej("kozu", kneg(int ), (int)265));
lbl95:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1034509513: {
                                continue block58;
                            }
                            case 878007493: {
                                break block58;
                            }
                        }
                        break;
                    }
                    var4_7 = jn.lerpColor(var1_1, var2_2, v11);
                    if (var5_5 || var5_5) ** GOTO lbl21
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_7 = jn.ss - jn.knej("kozw", kneg(int ), (int)267)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == jn.knej("kozx", kney(int ), (int)731)) break;
                        v13 /* !! */  = (long)jn.knej("kozy", kney(int ), (int)732);
                    }
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_8 = jn.ss - jn.knej("kozz", kneg(int ), (int)268)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == jn.knej("kpaa", kney(int ), (int)733)) break;
                        v14 /* !! */  = (long)jn.knej("kpab", kney(int ), (int)734);
                    }
                    v15 = jn.HALO_RINGS[var3_6][1];
                    v16 /* !! */  = jn.ss;
                    if (true) ** GOTO lbl117
                    block61: while (true) {
                        v16 /* !! */  = (long)(v17 - jn.knej("kpac", kneg(int ), (int)269));
lbl117:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -1921933172: {
                                v17 = jn.knej("kpad", kneg(int ), (int)270);
                                continue block61;
                            }
                            case -579199861: {
                                v17 = jn.knej("kpae", kneg(int ), (int)271);
                                continue block61;
                            }
                            case 878007493: {
                                break block61;
                            }
                        }
                        break;
                    }
                    this.cachedRingLights[var3_6] = oo.packColorAlpha(var4_7, v15);
                    if (var5_5 || var5_5) ** GOTO lbl21
                    ++var3_6;
                    if (var5_5) ** GOTO lbl21
                } while (!var7_3);
                throw null;
lbl132:
                // 1 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_4 /* !! */  = (int)jn.knej("kpaf", kney(int ), (int)735);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl140:
            // 4 sources

            case 1: {
                var6_4 /* !! */  = (int)jn.knej("kpag", kney(int ), (int)736);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl145:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)jn.knej("kpah", kney(int ), (int)737);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl150:
            // 3 sources

            case 3: {
                var6_4 /* !! */  = (int)jn.knej("kpai", kney(int ), (int)738);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl155:
            // 3 sources

            case 4: {
                var6_4 /* !! */  = (int)jn.knej("kpaj", kney(int ), (int)739);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl160:
            // 3 sources

            case 5: {
                var6_4 /* !! */  = (int)jn.knej("kpak", kney(int ), (int)740);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl165:
            // 2 sources

            case 6: {
                var6_4 /* !! */  = (int)jn.knej("kpal", kney(int ), (int)741);
                if (!var7_3) ** GOTO lbl140
                throw null;
            }
            case 7: {
                var6_4 /* !! */  = (int)jn.knej("kpam", kney(int ), (int)742);
                if (!var7_3) ** GOTO lbl160
                throw null;
            }
lbl173:
            // 2 sources

            case 8: {
                var6_4 /* !! */  = (int)jn.knej("kpan", kney(int ), (int)743);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl178:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)jn.knej("kpao", kney(int ), (int)744);
                if (!var7_3) ** GOTO lbl145
                throw null;
            }
            case 10: {
                var6_4 /* !! */  = (int)jn.knej("kpap", kney(int ), (int)745);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl187:
            // 2 sources

            case 11: {
                var6_4 /* !! */  = (int)jn.knej("kpaq", kney(int ), (int)746);
                if (!var7_3) ** GOTO lbl140
                throw null;
            }
lbl191:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)jn.knej("kpar", kney(int ), (int)747);
                if (!var7_3) ** GOTO lbl150
                throw null;
            }
            case 13: {
                var6_4 /* !! */  = (int)jn.knej("kpas", kney(int ), (int)748);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 14: {
                var6_4 /* !! */  = (int)jn.knej("kpat", kney(int ), (int)749);
                if (!var7_3) ** GOTO lbl155
                throw null;
            }
lbl204:
            // 2 sources

            case 15: {
                var6_4 /* !! */  = (int)jn.knej("kpau", kney(int ), (int)750);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl209:
            // 2 sources

            case 16: {
                var6_4 /* !! */  = (int)jn.knej("kpav", kney(int ), (int)751);
                if (!var7_3) ** GOTO lbl140
                throw null;
            }
            case 17: {
                var6_4 /* !! */  = (int)jn.knej("kpaw", kney(int ), (int)752);
                if (!var7_3) ** GOTO lbl160
                throw null;
            }
lbl217:
            // 3 sources

            case 18: {
                var6_4 /* !! */  = (int)jn.knej("kpax", kney(int ), (int)753);
                if (!var7_3) ** GOTO lbl178
                throw null;
            }
lbl221:
            // 2 sources

            case 19: {
                var6_4 /* !! */  = (int)jn.knej("kpay", kney(int ), (int)754);
                if (!var7_3) ** GOTO lbl187
                throw null;
            }
lbl225:
            // 2 sources

            case 20: {
                var6_4 /* !! */  = (int)jn.knej("kpaz", kney(int ), (int)755);
                if (!var7_3) ** GOTO lbl209
                throw null;
            }
lbl229:
            // 4 sources

            case 21: {
                var6_4 /* !! */  = (int)jn.knej("kpba", kney(int ), (int)756);
                if (!var7_3) ** GOTO lbl173
                throw null;
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)jn.knej("kpbb", kney(int ), (int)757);
                    if (!var7_3) ** GOTO lbl225
                    throw null;
                }
            }
lbl238:
            // 2 sources

            case 23: {
                var6_4 /* !! */  = (int)jn.knej("kpbc", kney(int ), (int)758);
                if (!var7_3) ** GOTO lbl217
                throw null;
            }
            case 24: {
                var6_4 /* !! */  = (int)jn.knej("kpbd", kney(int ), (int)759);
                if (!var7_3) ** GOTO lbl150
                throw null;
            }
            case 25: 
        }
        var6_4 /* !! */  = (int)jn.knej("kpbe", kney(int ), (int)760);
        ** while (!var7_3)
lbl249:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpil() {
        jn.kneh[300] = -320577322384470113L;
        jn.kneh[301] = 2671537984118462678L;
        jn.kneh[302] = -2068230761930979669L;
        jn.kneh[303] = 7963041432322709580L;
        jn.kneh[304] = 5653869376785698715L;
        jn.kneh[305] = -7099282231863447081L;
        jn.kneh[306] = -505992634252832831L;
        jn.kneh[307] = -7362837989090856039L;
        jn.kneh[308] = 4034793826987434725L;
        jn.kneh[309] = -7210362579020374731L;
        jn.kneh[310] = -3312567184335409277L;
        jn.kneh[311] = 17604478487937922L;
        jn.kneh[312] = 1444105354330993510L;
        jn.kneh[313] = -1131569814209620117L;
        jn.kneh[314] = -2560346298619271243L;
        jn.kneh[315] = -3033065704826711556L;
    }

    private static /* synthetic */ int kney(int n2) {
        return knez[n2] ^ knfa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int[] buildHaloPassRings() {
        block89: {
            var8 = jn.c;
            var7_1 /* !! */  = jn.b;
            var6_2 = jn.a;
            if (var8) {
                throw null;
lbl6:
                // 26 sources

                return null;
            }
            if (var6_2 || var6_2) ** GOTO lbl6
            var0_3 = jn.knej("kokz", kney(int ), (int)400);
            if (var6_2 || var6_2) ** GOTO lbl6
            var1_4 /* !! */  = jn.HALO_RINGS;
            if (var6_2) ** GOTO lbl6
            var2_5 /* !! */  = var1_4 /* !! */ .length;
            if (var6_2) ** GOTO lbl6
            var3_6 = jn.knej("kola", kney(int ), (int)401);
            if (var6_2) ** GOTO lbl6
            do {
                if (var6_2 || var6_2) ** GOTO lbl6
                if (var3_6 >= var2_5 /* !! */ ) break block89;
                if (var6_2) ** GOTO lbl6
                var4_7 = var1_4 /* !! */ [var3_6];
                if (var6_2 || var6_2) ** GOTO lbl6
                var0_3 += (int)var4_7[2];
                if (var6_2 || var6_2) ** GOTO lbl6
                ++var3_6;
                if (var6_2) ** GOTO lbl6
            } while (!var8);
            throw null;
        }
        if (var6_2 || var6_2) ** GOTO lbl6
        var1_4 /* !! */  = (float[][])new int[var0_3];
        if (var6_2 || var6_2) ** GOTO lbl6
        var2_5 /* !! */  = (int)jn.knej("kolb", kney(int ), (int)402);
        if (var6_2 || var6_2) ** GOTO lbl6
        var3_6 = jn.knej("kolc", kney(int ), (int)403);
        if (var6_2) ** GOTO lbl6
        block49: while (true) {
            if (var6_2 || var6_2) ** GOTO lbl6
            if (var3_6 >= jn.HALO_RINGS.length) ** GOTO lbl64
            if (var6_2 || var6_2) ** GOTO lbl6
            var4_8 = (int)jn.HALO_RINGS[var3_6][2];
            if (var6_2) ** GOTO lbl6
            if (var7_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_2) ** GOTO lbl6
                    var5_9 = jn.knej("kold", kney(int ), (int)404);
                    if (var6_2) ** GOTO lbl6
                    do {
                        if (var6_2 || var6_2) ** GOTO lbl6
                        if (var5_9 >= var4_8) ** GOTO lbl59
                        if (var6_2 || var6_2) ** GOTO lbl6
                        var1_4 /* !! */ [var2_5 /* !! */ ++] = var3_6;
                        if (var6_2 || var6_2) ** GOTO lbl6
                        ++var5_9;
                        if (var6_2) ** GOTO lbl6
                    } while (!var8);
                    throw null;
lbl59:
                    // 1 sources

                    if (var6_2 || var6_2) ** GOTO lbl6
                    ++var3_6;
                    if (var6_2) ** GOTO lbl6
                    if (!var8) continue block49;
                    throw null;
                }
lbl64:
                // 1 sources

                if (!var6_2 && !var6_2) ** break;
                ** continue;
                return var1_4 /* !! */ ;
lbl67:
                // 2 sources

                case 0: {
                    var7_1 /* !! */  = (int)jn.knej("kole", kney(int ), (int)405);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
                case 1: {
                    var7_1 /* !! */  = (int)jn.knej("kolf", kney(int ), (int)406);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
lbl77:
                // 2 sources

                case 2: {
                    var7_1 /* !! */  = (int)jn.knej("kolg", kney(int ), (int)407);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
lbl82:
                // 3 sources

                case 3: {
                    var7_1 /* !! */  = (int)jn.knej("kolh", kney(int ), (int)408);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl87:
                // 4 sources

                case 4: {
                    var7_1 /* !! */  = (int)jn.knej("koli", kney(int ), (int)409);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl92:
                // 3 sources

                case 5: {
                    var7_1 /* !! */  = (int)jn.knej("kolj", kney(int ), (int)410);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
lbl97:
                // 2 sources

                case 6: {
                    var7_1 /* !! */  = (int)jn.knej("kolk", kney(int ), (int)411);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
                case 7: {
                    var7_1 /* !! */  = (int)jn.knej("koll", kney(int ), (int)412);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 8: {
                    var7_1 /* !! */  = (int)jn.knej("kolm", kney(int ), (int)413);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl112:
                // 3 sources

                case 9: {
                    var7_1 /* !! */  = (int)jn.knej("koln", kney(int ), (int)414);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
                case 10: {
                    var7_1 /* !! */  = (int)jn.knej("kolo", kney(int ), (int)415);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl131
                }
lbl122:
                // 3 sources

                case 11: {
                    var7_1 /* !! */  = (int)jn.knej("kolp", kney(int ), (int)416);
                    if (!var8) ** GOTO lbl87
                    throw null;
                }
lbl126:
                // 3 sources

                case 12: {
                    var7_1 /* !! */  = (int)jn.knej("kolq", kney(int ), (int)417);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl131:
                // 3 sources

                case 13: {
                    var7_1 /* !! */  = (int)jn.knej("kolr", kney(int ), (int)418);
                    if (!var8) ** GOTO lbl92
                    throw null;
                }
                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_1 /* !! */  = (int)jn.knej("kols", kney(int ), (int)419);
                        if (var8) {
                            throw null;
                        }
                        ** GOTO lbl185
                        break;
                    }
                }
lbl141:
                // 3 sources

                case 15: {
                    var7_1 /* !! */  = (int)jn.knej("kolt", kney(int ), (int)420);
                    if (!var8) ** GOTO lbl82
                    throw null;
                }
lbl145:
                // 3 sources

                case 16: {
                    var7_1 /* !! */  = (int)jn.knej("kolu", kney(int ), (int)421);
                    if (!var8) ** GOTO lbl82
                    throw null;
                }
                case 17: {
                    var7_1 /* !! */  = (int)jn.knej("kolv", kney(int ), (int)422);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl206
                }
lbl154:
                // 3 sources

                case 18: {
                    var7_1 /* !! */  = (int)jn.knej("kolw", kney(int ), (int)423);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
lbl159:
                // 2 sources

                case 19: {
                    var7_1 /* !! */  = (int)jn.knej("kolx", kney(int ), (int)424);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl194
                }
lbl164:
                // 2 sources

                case 20: {
                    var7_1 /* !! */  = (int)jn.knej("koly", kney(int ), (int)425);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
                case 21: {
                    var7_1 /* !! */  = (int)jn.knej("kolz", kney(int ), (int)426);
                    if (!var8) ** GOTO lbl122
                    throw null;
                }
                case 22: {
                    var7_1 /* !! */  = (int)jn.knej("koma", kney(int ), (int)427);
                    if (!var8) break block49;
                    throw null;
                }
                case 23: {
                    var7_1 /* !! */  = (int)jn.knej("komb", kney(int ), (int)428);
                    if (!var8) ** GOTO lbl154
                    throw null;
                }
lbl181:
                // 2 sources

                case 24: {
                    var7_1 /* !! */  = (int)jn.knej("komc", kney(int ), (int)429);
                    if (!var8) ** GOTO lbl145
                    throw null;
                }
lbl185:
                // 5 sources

                case 25: {
                    var7_1 /* !! */  = (int)jn.knej("komd", kney(int ), (int)430);
                    if (!var8) ** GOTO lbl126
                    throw null;
                }
lbl189:
                // 2 sources

                case 26: {
                    var7_1 /* !! */  = (int)jn.knej("kome", kney(int ), (int)431);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl255
                }
lbl194:
                // 2 sources

                case 27: {
                    var7_1 /* !! */  = (int)jn.knej("komf", kney(int ), (int)432);
                    if (!var8) ** GOTO lbl77
                    throw null;
                }
                case 28: {
                    var7_1 /* !! */  = (int)jn.knej("komg", kney(int ), (int)433);
                    if (!var8) ** GOTO lbl67
                    throw null;
                }
                case 29: {
                    var7_1 /* !! */  = (int)jn.knej("komh", kney(int ), (int)434);
                    if (!var8) ** GOTO lbl112
                    throw null;
                }
lbl206:
                // 3 sources

                case 30: {
                    var7_1 /* !! */  = (int)jn.knej("komi", kney(int ), (int)435);
                    if (var8) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
                case 31: {
                    var7_1 /* !! */  = (int)jn.knej("komj", kney(int ), (int)436);
                    if (!var8) ** GOTO lbl131
                    throw null;
                }
                case 32: {
                    var7_1 /* !! */  = (int)jn.knej("komk", kney(int ), (int)437);
                    if (!var8) ** GOTO lbl87
                    throw null;
                }
                case 33: {
                    var7_1 /* !! */  = (int)jn.knej("koml", kney(int ), (int)438);
                    if (!var8) ** GOTO lbl185
                    throw null;
                }
                case 34: {
                    var7_1 /* !! */  = (int)jn.knej("komm", kney(int ), (int)439);
                    if (!var8) ** GOTO lbl97
                    throw null;
                }
                case 35: {
                    var7_1 /* !! */  = (int)jn.knej("komn", kney(int ), (int)440);
                    if (!var8) ** GOTO lbl126
                    throw null;
                }
                case 36: {
                    var7_1 /* !! */  = (int)jn.knej("komo", kney(int ), (int)441);
                    if (!var8) ** GOTO lbl122
                    throw null;
                }
                case 37: {
                    var7_1 /* !! */  = (int)jn.knej("komp", kney(int ), (int)442);
                    if (!var8) ** GOTO lbl87
                    throw null;
                }
lbl239:
                // 3 sources

                case 38: {
                    var7_1 /* !! */  = (int)jn.knej("komq", kney(int ), (int)443);
                    if (!var8) ** GOTO lbl145
                    throw null;
                }
lbl243:
                // 3 sources

                case 39: {
                    var7_1 /* !! */  = (int)jn.knej("komr", kney(int ), (int)444);
                    if (!var8) ** GOTO lbl164
                    throw null;
                }
lbl247:
                // 3 sources

                case 40: {
                    var7_1 /* !! */  = (int)jn.knej("koms", kney(int ), (int)445);
                    if (!var8) ** GOTO lbl159
                    throw null;
                }
lbl251:
                // 2 sources

                case 41: {
                    var7_1 /* !! */  = (int)jn.knej("komt", kney(int ), (int)446);
                    if (!var8) ** GOTO lbl206
                    throw null;
                }
lbl255:
                // 2 sources

                case 42: {
                    var7_1 /* !! */  = (int)jn.knej("komu", kney(int ), (int)447);
                    if (!var8) ** GOTO lbl239
                    throw null;
                }
                case 43: {
                    var7_1 /* !! */  = (int)jn.knej("komv", kney(int ), (int)448);
                    if (!var8) ** GOTO lbl92
                    throw null;
                }
                case 44: 
            }
            break;
        }
        var7_1 /* !! */  = (int)jn.knej("komw", kney(int ), (int)449);
        ** while (!var8)
lbl266:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kphu() {
        jn.knez[400] = 668031026;
        jn.knez[401] = -626110504;
        jn.knez[402] = 2094917147;
        jn.knez[403] = 1235221029;
        jn.knez[404] = 1792901967;
        jn.knez[405] = 1823539582;
        jn.knez[406] = 972422849;
        jn.knez[407] = -929805817;
        jn.knez[408] = 310537154;
        jn.knez[409] = -1566829171;
        jn.knez[410] = 22486266;
        jn.knez[411] = -1501907977;
        jn.knez[412] = -1761530810;
        jn.knez[413] = -673976149;
        jn.knez[414] = -191536868;
        jn.knez[415] = -886493249;
        jn.knez[416] = -976796639;
        jn.knez[417] = 1948574853;
        jn.knez[418] = 375710500;
        jn.knez[419] = 251382776;
        jn.knez[420] = -725888073;
        jn.knez[421] = -878934142;
        jn.knez[422] = -1592071752;
        jn.knez[423] = -1714086101;
        jn.knez[424] = 1559002199;
        jn.knez[425] = 1200875079;
        jn.knez[426] = -136419184;
        jn.knez[427] = -943486026;
        jn.knez[428] = 1474755461;
        jn.knez[429] = 682890874;
        jn.knez[430] = -403899489;
        jn.knez[431] = -1407548986;
        jn.knez[432] = -95825668;
        jn.knez[433] = -1504514785;
        jn.knez[434] = -1007104048;
        jn.knez[435] = -417522454;
        jn.knez[436] = -1276671905;
        jn.knez[437] = -249700732;
        jn.knez[438] = 452407370;
        jn.knez[439] = -599145347;
        jn.knez[440] = -1887603178;
        jn.knez[441] = -102414162;
        jn.knez[442] = 1560193546;
        jn.knez[443] = 908898964;
        jn.knez[444] = -1967652937;
        jn.knez[445] = -1581601009;
        jn.knez[446] = -682689800;
        jn.knez[447] = -224819683;
        jn.knez[448] = -2008301910;
        jn.knez[449] = -1162302823;
        jn.knez[450] = -1416871803;
        jn.knez[451] = 2096775366;
        jn.knez[452] = 1120671505;
        jn.knez[453] = -1728868095;
        jn.knez[454] = 416946615;
        jn.knez[455] = 1538086454;
        jn.knez[456] = 1247613427;
        jn.knez[457] = -38332945;
        jn.knez[458] = -551899249;
        jn.knez[459] = 399727676;
        jn.knez[460] = -1645768298;
        jn.knez[461] = -1034058803;
        jn.knez[462] = 811653530;
        jn.knez[463] = 1697519471;
        jn.knez[464] = -917228828;
        jn.knez[465] = 1107098134;
        jn.knez[466] = 2044973295;
        jn.knez[467] = -960880195;
        jn.knez[468] = -213749995;
        jn.knez[469] = 661146052;
        jn.knez[470] = -273274979;
        jn.knez[471] = -1756186163;
        jn.knez[472] = 603379105;
        jn.knez[473] = 311565376;
        jn.knez[474] = -865536385;
        jn.knez[475] = 541556761;
        jn.knez[476] = -1969984785;
        jn.knez[477] = 896157097;
        jn.knez[478] = 1793029330;
        jn.knez[479] = 411095752;
        jn.knez[480] = 1549961179;
        jn.knez[481] = -137566728;
        jn.knez[482] = 69628959;
        jn.knez[483] = -1301917705;
        jn.knez[484] = -664680125;
        jn.knez[485] = -2120522604;
        jn.knez[486] = -530159684;
        jn.knez[487] = -882800461;
        jn.knez[488] = -1031281458;
        jn.knez[489] = -2325254;
        jn.knez[490] = 406715174;
        jn.knez[491] = -1335506111;
        jn.knez[492] = -417106226;
        jn.knez[493] = -1815011968;
        jn.knez[494] = -1237426581;
        jn.knez[495] = 1041246266;
        jn.knez[496] = -1788469818;
        jn.knez[497] = -1648413764;
        jn.knez[498] = -1373518875;
        jn.knez[499] = 1451299268;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int packTrailModelColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kodg", kneg(int ), (int)155)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jn.knej("kodh", kney(int ), (int)305)) break;
            v0 /* !! */  = (long)jn.knej("kodi", kney(int ), (int)306);
        }
        var3_1 = jn.c;
        v1 /* !! */  = jn.ss;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - jn.knej("kodk", kneg(int ), (int)156));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -522460315: {
                    v2 = jn.knej("kodl", kneg(int ), (int)157);
                    continue block19;
                }
                case -473785848: {
                    v2 = jn.knej("kodm", kneg(int ), (int)158);
                    continue block19;
                }
                case 878007493: {
                    break block19;
                }
                case 976056688: {
                    v2 = jn.knej("kodn", kneg(int ), (int)159);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = jn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kodo", kneg(int ), (int)160)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jn.knej("kodq", kney(int ), (int)307)) break;
            v3 /* !! */  = (long)jn.knej("kodr", kney(int ), (int)308);
        }
        var1_3 = jn.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (int)jn.knej("kods", kney(int ), (int)309);
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v4 /* !! */  = jn.ss;
        if (true) ** GOTO lbl41
        block22: while (true) {
            v4 /* !! */  = (long)(jn.knej("kodv", kneg(int ), (int)162) - jn.knej("kodu", kneg(int ), (int)161));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 346034759: {
                    continue block22;
                }
                case 878007493: {
                    break block22;
                }
            }
            break;
        }
        this.ensureRenderCache();
        ** while (var1_3 || var1_3)
lbl48:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kodw", kneg(int ), (int)163)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jn.knej("kody", kney(int ), (int)310)) break;
                    v5 /* !! */  = (long)jn.knej("kodz", kney(int ), (int)311);
                }
                return this.frameTrailModelColor;
            }
lbl58:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("koea", kney(int ), (int)312);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)jn.knej("koeb", kney(int ), (int)313);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl68:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jn.knej("koed", kney(int ), (int)314);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("koee", kney(int ), (int)315);
                if (!var3_1) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("koef", kney(int ), (int)316);
                    if (!var3_1) ** GOTO lbl68
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)jn.knej("koeg", kney(int ), (int)317);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpii() {
        jn.kneh[0] = -6455423955128671100L;
        jn.kneh[1] = -2442973406108697786L;
        jn.kneh[2] = 5618243782614887921L;
        jn.kneh[3] = -2179114187165380823L;
        jn.kneh[4] = 3048919519029596630L;
        jn.kneh[5] = 9128021391102332803L;
        jn.kneh[6] = -6654336526878429186L;
        jn.kneh[7] = 8372432636946358891L;
        jn.kneh[8] = -3486823562683018558L;
        jn.kneh[9] = -7586409444101437400L;
        jn.kneh[10] = 6220611648300629483L;
        jn.kneh[11] = 1819334681252619606L;
        jn.kneh[12] = -1390758224028182127L;
        jn.kneh[13] = -470584691724928256L;
        jn.kneh[14] = 6764547203547471862L;
        jn.kneh[15] = 759029541287230186L;
        jn.kneh[16] = 3159750026595236473L;
        jn.kneh[17] = -9065001654543914993L;
        jn.kneh[18] = 8900356104920836845L;
        jn.kneh[19] = 178596021257659719L;
        jn.kneh[20] = -3113549764431317112L;
        jn.kneh[21] = -5794228030661847926L;
        jn.kneh[22] = -4710539449407955580L;
        jn.kneh[23] = -8111798611449387936L;
        jn.kneh[24] = -1125557304022773588L;
        jn.kneh[25] = -4496908131659531542L;
        jn.kneh[26] = -5976093889554910385L;
        jn.kneh[27] = 5616064469872861202L;
        jn.kneh[28] = -9214973098728104204L;
        jn.kneh[29] = 2127253450636389328L;
        jn.kneh[30] = 1391516793180092589L;
        jn.kneh[31] = -4363121146319792980L;
        jn.kneh[32] = -3413161730164744699L;
        jn.kneh[33] = -8327651884639767962L;
        jn.kneh[34] = -6558096547287587261L;
        jn.kneh[35] = 7012540096638020791L;
        jn.kneh[36] = -462722484548260685L;
        jn.kneh[37] = -2700605050323990169L;
        jn.kneh[38] = -987490819105615742L;
        jn.kneh[39] = 217137114803848107L;
        jn.kneh[40] = 8809624857160833939L;
        jn.kneh[41] = 6702396367410283147L;
        jn.kneh[42] = -2213268420895702356L;
        jn.kneh[43] = -470610585998371173L;
        jn.kneh[44] = -105314657178901357L;
        jn.kneh[45] = 6240054817591637532L;
        jn.kneh[46] = 4311952889955603826L;
        jn.kneh[47] = -5720881004468317012L;
        jn.kneh[48] = 6978322362141500548L;
        jn.kneh[49] = -245873284399388139L;
        jn.kneh[50] = -932276843684858726L;
        jn.kneh[51] = -1398194397488023498L;
        jn.kneh[52] = 7695108935648260996L;
        jn.kneh[53] = -301121625727169930L;
        jn.kneh[54] = -7326401448574981299L;
        jn.kneh[55] = 4591608464305620374L;
        jn.kneh[56] = -1061073297119149317L;
        jn.kneh[57] = -5635468214835662441L;
        jn.kneh[58] = -4386464315241666385L;
        jn.kneh[59] = -3719987598489630259L;
        jn.kneh[60] = 6923208179385332125L;
        jn.kneh[61] = -5128377107836884422L;
        jn.kneh[62] = 5831103195435130566L;
        jn.kneh[63] = 3757964178373636060L;
        jn.kneh[64] = 3306114103353038657L;
        jn.kneh[65] = 7317139739823982590L;
        jn.kneh[66] = -2943454094669533096L;
        jn.kneh[67] = -8106220138754302507L;
        jn.kneh[68] = -1337138734861283093L;
        jn.kneh[69] = -4153597431983155376L;
        jn.kneh[70] = -2529005487562895583L;
        jn.kneh[71] = -7958360016059531728L;
        jn.kneh[72] = -6181782697179144826L;
        jn.kneh[73] = -7725962931652973897L;
        jn.kneh[74] = -1456735944783433705L;
        jn.kneh[75] = -4688632866333948948L;
        jn.kneh[76] = -5823502442112052776L;
        jn.kneh[77] = -6185099118948137088L;
        jn.kneh[78] = -7180960380181312903L;
        jn.kneh[79] = 3073026241494073070L;
        jn.kneh[80] = -4621185661530125021L;
        jn.kneh[81] = 7587154070042199659L;
        jn.kneh[82] = 4912689922558361298L;
        jn.kneh[83] = -421401147142383064L;
        jn.kneh[84] = -8331920623495612324L;
        jn.kneh[85] = -5665273637828171335L;
        jn.kneh[86] = -3707592477060344567L;
        jn.kneh[87] = 7576899091004598683L;
        jn.kneh[88] = 6883296830689390119L;
        jn.kneh[89] = 8492162406197298025L;
        jn.kneh[90] = 5065762753642718137L;
        jn.kneh[91] = -4379689864323887837L;
        jn.kneh[92] = -2221933634161470256L;
        jn.kneh[93] = 8270930864345447168L;
        jn.kneh[94] = 4270447839413089564L;
        jn.kneh[95] = -9123760663132660927L;
        jn.kneh[96] = -2983477485752821873L;
        jn.kneh[97] = -1565519871687715562L;
        jn.kneh[98] = 6516643551899234519L;
        jn.kneh[99] = 537321574637225104L;
    }

    private static /* synthetic */ void kpik() {
        jn.kneh[200] = -571931556650459861L;
        jn.kneh[201] = -6031283919226614820L;
        jn.kneh[202] = -2112007452039288075L;
        jn.kneh[203] = -4712971196197963047L;
        jn.kneh[204] = 8028931406962449070L;
        jn.kneh[205] = 2387395090832095210L;
        jn.kneh[206] = -951190229000883914L;
        jn.kneh[207] = -8284497202268351581L;
        jn.kneh[208] = 1147965657133713480L;
        jn.kneh[209] = 7080956475668674299L;
        jn.kneh[210] = -3793902257793008675L;
        jn.kneh[211] = -3389248967275109139L;
        jn.kneh[212] = 3880725834195305834L;
        jn.kneh[213] = -8659833838952009268L;
        jn.kneh[214] = 4196152705930318144L;
        jn.kneh[215] = 2892331912784103304L;
        jn.kneh[216] = 2197238234634902175L;
        jn.kneh[217] = -7582852062935773696L;
        jn.kneh[218] = -8788615488176463437L;
        jn.kneh[219] = 831979522244130104L;
        jn.kneh[220] = 4421172380348323078L;
        jn.kneh[221] = 1488828851904037425L;
        jn.kneh[222] = 853517880459843546L;
        jn.kneh[223] = 900658985138079858L;
        jn.kneh[224] = 5229081019856182971L;
        jn.kneh[225] = 1086901289249123144L;
        jn.kneh[226] = 7966117725415615004L;
        jn.kneh[227] = -926546298448287137L;
        jn.kneh[228] = 8362352581606385572L;
        jn.kneh[229] = 257579728920155557L;
        jn.kneh[230] = 6041149230252661327L;
        jn.kneh[231] = -8258213638279930459L;
        jn.kneh[232] = 2303684498518303908L;
        jn.kneh[233] = 9144837956071891099L;
        jn.kneh[234] = 489160007950765953L;
        jn.kneh[235] = 944994297673721799L;
        jn.kneh[236] = -1137798740156846158L;
        jn.kneh[237] = -1481304060696787619L;
        jn.kneh[238] = 8069777267724235382L;
        jn.kneh[239] = 8124594294049502519L;
        jn.kneh[240] = -2527946389973937736L;
        jn.kneh[241] = -7240959459769610539L;
        jn.kneh[242] = 4344471315154549513L;
        jn.kneh[243] = 531481443916488862L;
        jn.kneh[244] = 2018233570256844827L;
        jn.kneh[245] = 3601796778767645894L;
        jn.kneh[246] = -6011659658702401317L;
        jn.kneh[247] = 9097089765830096933L;
        jn.kneh[248] = 2002827083864815654L;
        jn.kneh[249] = 5754278618346991088L;
        jn.kneh[250] = -4368954200169973435L;
        jn.kneh[251] = -296253558290066469L;
        jn.kneh[252] = -5202916962115564859L;
        jn.kneh[253] = -2492172517593084416L;
        jn.kneh[254] = 6847894978771709386L;
        jn.kneh[255] = 7445044445651433948L;
        jn.kneh[256] = -7241535794853275880L;
        jn.kneh[257] = -7569623295136100240L;
        jn.kneh[258] = 8512513955403968744L;
        jn.kneh[259] = 4885846442973741645L;
        jn.kneh[260] = 8767254454538364142L;
        jn.kneh[261] = -2986364850886236446L;
        jn.kneh[262] = 2217408455479080773L;
        jn.kneh[263] = 5977769256834446150L;
        jn.kneh[264] = -3162225756760652282L;
        jn.kneh[265] = -8969788839234829759L;
        jn.kneh[266] = 2303134764378618988L;
        jn.kneh[267] = -9051229635547259219L;
        jn.kneh[268] = -4267572259406228744L;
        jn.kneh[269] = -9096509664470749031L;
        jn.kneh[270] = -6026228403012624771L;
        jn.kneh[271] = 3298121635523689472L;
        jn.kneh[272] = 4601643544929339992L;
        jn.kneh[273] = 6327095968658267327L;
        jn.kneh[274] = 8326580979035185543L;
        jn.kneh[275] = -8543397225618581434L;
        jn.kneh[276] = -6275924576197038831L;
        jn.kneh[277] = 2980832927412830385L;
        jn.kneh[278] = -6720692983841137838L;
        jn.kneh[279] = 3388166581886199112L;
        jn.kneh[280] = -3726638436610042125L;
        jn.kneh[281] = -811609111422979554L;
        jn.kneh[282] = -925844182349280238L;
        jn.kneh[283] = 9169958610653635578L;
        jn.kneh[284] = 8627804067821952710L;
        jn.kneh[285] = -3869681127682191567L;
        jn.kneh[286] = -7474895913410427252L;
        jn.kneh[287] = -8806295335849581058L;
        jn.kneh[288] = 7166876639280680279L;
        jn.kneh[289] = -2294518163434195072L;
        jn.kneh[290] = 3874251274201484352L;
        jn.kneh[291] = 3934314611083276679L;
        jn.kneh[292] = 1414507658076813895L;
        jn.kneh[293] = -4099694303184101656L;
        jn.kneh[294] = 2349673229678611798L;
        jn.kneh[295] = 5214821881789620043L;
        jn.kneh[296] = -4200471320768773486L;
        jn.kneh[297] = -6299150747391883295L;
        jn.kneh[298] = -8350420600276852069L;
        jn.kneh[299] = 6954013022624815240L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTrailControlsVisible() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knpw", kneg(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jn.knej("knpx", kney(int ), (int)168)) break;
            v0 /* !! */  = (long)jn.knej("knpz", kney(int ), (int)169);
        }
        var3_1 = jn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knqa", kneg(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jn.knej("knqb", kney(int ), (int)170)) break;
            v1 /* !! */  = (long)jn.knej("knqd", kney(int ), (int)171);
        }
        var2_2 /* !! */  = jn.b;
        v2 /* !! */  = jn.ss;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(jn.knej("knqg", kneg(int ), (int)87) - jn.knej("knqe", kneg(int ), (int)86));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1792027121: {
                    continue block17;
                }
                case 878007493: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = jn.a;
        if (var3_1) {
            throw null;
lbl27:
            // 5 sources

            return (boolean)jn.knej("knqh", kney(int ), (int)172);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("knqi", kneg(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jn.knej("knqj", kney(int ), (int)173)) break;
                    v3 /* !! */  = (long)jn.knej("knqk", kney(int ), (int)174);
                }
                if (!this.isStandardGlowMode()) ** GOTO lbl60
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("knql", kneg(int ), (int)89)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jn.knej("knqm", kney(int ), (int)175)) break;
                    v4 /* !! */  = (long)jn.knej("knqn", kney(int ), (int)176);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = jn.ss - jn.knej("knqo", kneg(int ), (int)90)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jn.knej("knqp", kney(int ), (int)177)) break;
                    v5 /* !! */  = (long)jn.knej("knqq", kney(int ), (int)178);
                }
                if (!this.trail.isValue()) ** GOTO lbl60
                if (var1_3) ** GOTO lbl27
                v6 = jn.knej("knqr", kney(int ), (int)179);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl63
lbl60:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v6 = jn.knej("knqs", kney(int ), (int)180);
lbl63:
                // 2 sources

                return (boolean)v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("knqt", kney(int ), (int)181);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl69:
            // 3 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knqu", kney(int ), (int)182);
                } while (!var3_1);
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jn.knej("knqw", kney(int ), (int)183);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("knqy", kney(int ), (int)184);
                if (!var3_1) break;
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("knqz", kney(int ), (int)185);
                    if (!var3_1) ** GOTO lbl69
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)jn.knej("knrb", kney(int ), (int)186);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
lbl92:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("knrd", kney(int ), (int)187);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)jn.knej("knre", kney(int ), (int)188);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)jn.knej("knrg", kney(int ), (int)189);
        ** while (!var3_1)
lbl103:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float knff(int n2) {
        return Float.intBitsToFloat(knez[n2] ^ knfa[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int scalePackedAlpha(int var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kowb", kneg(int ), (int)245)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jn.knej("kowc", kney(int ), (int)654)) break;
            v0 /* !! */  = (long)jn.knej("kowd", kney(int ), (int)655);
        }
        var6_2 = jn.c;
        v1 /* !! */  = jn.ss;
        if (true) ** GOTO lbl11
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - jn.knej("kowe", kneg(int ), (int)246));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1111633013: {
                    v2 = jn.knej("kowf", kneg(int ), (int)247);
                    continue block16;
                }
                case 878007493: {
                    break block16;
                }
                case 1069819626: {
                    v2 = jn.knej("kowg", kneg(int ), (int)248);
                    continue block16;
                }
            }
            break;
        }
        var5_3 /* !! */  = jn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kowh", kneg(int ), (int)249)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jn.knej("kowi", kney(int ), (int)656)) break;
            v3 /* !! */  = (long)jn.knej("kowj", kney(int ), (int)657);
        }
        var4_4 = jn.a;
        if (var6_2) {
            throw null;
lbl29:
            // 4 sources

            return (int)jn.knej("kowk", kney(int ), (int)658);
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        var2_5 = var0 >>> jn.knej("kowl", kney(int ), (int)659) & jn.knej("kowm", kney(int ), (int)660);
        if (var4_4) ** GOTO lbl29
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl29
                v4 = jn.knej("kown", kney(int ), (int)661);
                v5 = (float)var2_5 * var1_1;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kowo", kneg(int ), (int)250)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jn.knej("kowp", kney(int ), (int)662)) break;
                    v6 /* !! */  = (long)jn.knej("kowq", kney(int ), (int)663);
                }
                v7 = Math.round(v5);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("kowr", kneg(int ), (int)251)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jn.knej("kows", kney(int ), (int)664)) break;
                    v8 /* !! */  = (long)jn.knej("kowt", kney(int ), (int)665);
                }
                var3_6 = Math.min((int)v4, v7);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return var0 & jn.knej("kowu", kney(int ), (int)666) | var3_6 << jn.knej("kowv", kney(int ), (int)667);
            }
            case 0: {
                var5_3 /* !! */  = (int)jn.knej("koww", kney(int ), (int)668);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl60:
            // 4 sources

            case 1: {
                var5_3 /* !! */  = (int)jn.knej("kowx", kney(int ), (int)669);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 2: {
                var5_3 /* !! */  = (int)jn.knej("kowy", kney(int ), (int)670);
                if (!var6_2) break;
                throw null;
            }
lbl69:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)jn.knej("kowz", kney(int ), (int)671);
                    if (!var6_2) ** GOTO lbl60
                    throw null;
                }
            }
            case 4: {
                var5_3 /* !! */  = (int)jn.knej("koxa", kney(int ), (int)672);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
lbl78:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)jn.knej("koxb", kney(int ), (int)673);
                if (!var6_2) ** GOTO lbl60
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)jn.knej("koxc", kney(int ), (int)674);
                if (!var6_2) ** GOTO lbl78
                throw null;
            }
            case 7: 
        }
        var5_3 /* !! */  = (int)jn.knej("koxd", kney(int ), (int)675);
        ** while (!var6_2)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void refreshRenderCache() {
        var3_1 = jn.c;
        var2_2 /* !! */  = jn.b;
        var1_3 = jn.a;
        if (var3_1) {
            throw null;
lbl6:
            // 14 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.framePrimaryColor = this.getPrimaryColor();
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                this.frameSecondaryColor = this.getSecondaryColor();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameSpeed = this.speed.getValue();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameFill = this.fill.getValue() / jn.knej("knul", knff(int ), (int)211);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameColor1 = oo.packColorAlpha(this.framePrimaryColor);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameItemFillColor = oo.packColorAlpha(this.framePrimaryColor, this.frameFill);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameBakedItemFill = oo.packBakedItemColors(this.framePrimaryColor, this.frameSecondaryColor, this.frameSpeed, this.frameFill);
                if (var1_3 || var1_3) ** GOTO lbl6
                if (this.isBeautifulMode()) {
                    v0 /* !! */  = jn.knej("knun", knff(int ), (int)212);
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    v0 /* !! */  = (CallSite)this.trailModelAlpha.getValue();
                }
                this.frameTrailModelColor = oo.packColorAlpha(this.framePrimaryColor, (float)v0 /* !! */ );
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameTrailModelOverlay = oo.packHaloPass(0.0f, 0.0f, this.frameSpeed);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.frameColor2Speed = oo.packColorSpeedFill(this.frameSecondaryColor, this.frameSpeed, this.frameFill);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.renderFrameSerial += jn.knej("knup", kneg(int ), (int)106);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.renderCacheValid = jn.knej("knur", kney(int ), (int)213);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("knus", kney(int ), (int)214);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl50:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)jn.knej("knuu", kney(int ), (int)215);
                if (var3_1) {
                    throw null;
                }
            }
lbl54:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)jn.knej("knuv", kney(int ), (int)216);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("knuw", kney(int ), (int)217);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl64:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)jn.knej("knuy", kney(int ), (int)218);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 5: {
                var2_2 /* !! */  = (int)jn.knej("knuz", kney(int ), (int)219);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl73:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("knvb", kney(int ), (int)220);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)jn.knej("knvc", kney(int ), (int)221);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("knve", kney(int ), (int)222);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl101
                    break;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)jn.knej("knvf", kney(int ), (int)223);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl92:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)jn.knej("knvh", kney(int ), (int)224);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)jn.knej("knvi", kney(int ), (int)225);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl101:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)jn.knej("knvj", kney(int ), (int)226);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)jn.knej("knvk", kney(int ), (int)227);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
lbl109:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)jn.knej("knvl", kney(int ), (int)228);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl114:
            // 5 sources

            case 15: {
                var2_2 /* !! */  = (int)jn.knej("knvn", kney(int ), (int)229);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 16: {
                var2_2 /* !! */  = (int)jn.knej("knvp", kney(int ), (int)230);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl123:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)jn.knej("knvq", kney(int ), (int)231);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl127:
            // 5 sources

            case 18: {
                var2_2 /* !! */  = (int)jn.knej("knvr", kney(int ), (int)232);
                if (var3_1) {
                    throw null;
                }
            }
            case 19: {
                var2_2 /* !! */  = (int)jn.knej("knvt", kney(int ), (int)233);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)jn.knej("knvu", kney(int ), (int)234);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl139:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)jn.knej("knvw", kney(int ), (int)235);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 22: {
                var2_2 /* !! */  = (int)jn.knej("knvx", kney(int ), (int)236);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 23: {
                var2_2 /* !! */  = (int)jn.knej("knvz", kney(int ), (int)237);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
lbl153:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)jn.knej("knwa", kney(int ), (int)238);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl157:
            // 3 sources

            case 25: {
                var2_2 /* !! */  = (int)jn.knej("knwc", kney(int ), (int)239);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
            case 26: {
                var2_2 /* !! */  = (int)jn.knej("knwd", kney(int ), (int)240);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 27: 
        }
        var2_2 /* !! */  = (int)jn.knej("knwf", kney(int ), (int)241);
        ** while (!var3_1)
lbl168:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int packColor2Speed() {
        v0 /* !! */  = jn.ss;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(jn.knej("koii", kneg(int ), (int)199) - jn.knej("koih", kneg(int ), (int)198));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1754706419: {
                    continue block23;
                }
                case 878007493: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = jn.c;
        v1 /* !! */  = jn.ss;
        if (true) ** GOTO lbl15
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - jn.knej("koij", kneg(int ), (int)200));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 878007493: {
                    break block24;
                }
                case 1022369757: {
                    v2 = jn.knej("koik", kneg(int ), (int)201);
                    continue block24;
                }
                case 1841771675: {
                    v2 = jn.knej("koil", kneg(int ), (int)202);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = jn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("koim", kneg(int ), (int)203)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jn.knej("koin", kney(int ), (int)344)) break;
            v3 /* !! */  = (long)jn.knej("koio", kney(int ), (int)345);
        }
        var1_3 = jn.a;
        if (!var3_1) ** GOTO lbl37
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)jn.knej("koip", kney(int ), (int)346);
                }
lbl37:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("koiq", kneg(int ), (int)204)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jn.knej("koir", kney(int ), (int)347)) break;
                    v4 /* !! */  = (long)jn.knej("kois", kney(int ), (int)348);
                }
                this.ensureRenderCache();
                if (var1_3 || var1_3) continue block26;
                v5 /* !! */  = jn.ss;
                if (true) ** GOTO lbl49
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - jn.knej("koit", kneg(int ), (int)205));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1762919792: {
                            v6 = jn.knej("koiu", kneg(int ), (int)206);
                            continue block28;
                        }
                        case -471997744: {
                            v6 = jn.knej("koiv", kneg(int ), (int)207);
                            continue block28;
                        }
                        case 687898217: {
                            v6 = jn.knej("koiw", kneg(int ), (int)208);
                            continue block28;
                        }
                        case 878007493: {
                            break block28;
                        }
                    }
                    break;
                }
                return this.frameColor2Speed;
lbl62:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)jn.knej("koix", kney(int ), (int)349);
                        if (!var3_1) break block26;
                        throw null;
                    }
                }
lbl67:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)jn.knej("koiy", kney(int ), (int)350);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl80
                }
                case 2: {
                    var2_2 /* !! */  = (int)jn.knej("koiz", kney(int ), (int)351);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
lbl76:
                // 2 sources

                case 3: {
                    var2_2 /* !! */  = (int)jn.knej("koja", kney(int ), (int)352);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
lbl80:
                // 2 sources

                case 4: {
                    var2_2 /* !! */  = (int)jn.knej("kojb", kney(int ), (int)353);
                    if (!var3_1) ** GOTO lbl76
                    throw null;
                }
                case 5: 
            }
        }
        var2_2 /* !! */  = (int)jn.knej("kojc", kney(int ), (int)354);
        ** while (!var3_1)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void ensureRenderCache() {
        block36: {
            v0 /* !! */  = jn.ss;
            if (true) ** GOTO lbl5
            block22: while (true) {
                v0 /* !! */  = (long)(jn.knej("knxx", kneg(int ), (int)117) - jn.knej("knxu", kneg(int ), (int)116));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 878007493: {
                        break block22;
                    }
                    case 1607147211: {
                        continue block22;
                    }
                }
                break;
            }
            var3_1 = jn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("knxy", kneg(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == jn.knej("knya", kney(int ), (int)254)) break;
                v1 /* !! */  = (long)jn.knej("knyc", kney(int ), (int)255);
            }
            var2_2 /* !! */  = jn.b;
            v2 /* !! */  = jn.ss;
            if (true) ** GOTO lbl21
            block24: while (true) {
                v2 /* !! */  = (long)(jn.knej("knyf", kneg(int ), (int)120) - jn.knej("knye", kneg(int ), (int)119));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1304250532: {
                        continue block24;
                    }
                    case 878007493: {
                        break block24;
                    }
                }
                break;
            }
            var1_3 = jn.a;
            if (var3_1) {
                throw null;
lbl29:
                // 4 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl29
            v3 /* !! */  = jn.ss;
            if (true) ** GOTO lbl36
            block26: while (true) {
                v3 /* !! */  = (long)(jn.knej("knyj", kneg(int ), (int)122) - jn.knej("knyi", kneg(int ), (int)121));
lbl36:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -432631527: {
                        continue block26;
                    }
                    case 878007493: {
                        break block26;
                    }
                }
                break;
            }
            if (this.renderCacheValid) break block36;
            if (var1_3) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("knyk", kneg(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == jn.knej("knyl", kney(int ), (int)256)) break;
                v4 /* !! */  = (long)jn.knej("knym", kney(int ), (int)257);
            }
            this.refreshRenderCache();
            if (var1_3) ** GOTO lbl29
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("knyn", kney(int ), (int)258);
                } while (!var3_1);
                throw null;
            }
lbl62:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jn.knej("knyo", kney(int ), (int)259);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jn.knej("knyp", kney(int ), (int)260);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl81
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("knyq", kney(int ), (int)261);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)jn.knej("knyr", kney(int ), (int)262);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl81:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)jn.knej("knys", kney(int ), (int)263);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
lbl85:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("knyt", kney(int ), (int)264);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)jn.knej("knyu", kney(int ), (int)265);
        ** while (!var3_1)
lbl92:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kpin() {
        jn.knei[100] = 625221542426097953L;
        jn.knei[101] = -5045363147715368497L;
        jn.knei[102] = 858138935475095737L;
        jn.knei[103] = 1211958232731982896L;
        jn.knei[104] = 7088133416083908211L;
        jn.knei[105] = 6664872271563623008L;
        jn.knei[106] = 1675360713044454542L;
        jn.knei[107] = 2429948019834151057L;
        jn.knei[108] = 1398909887264025116L;
        jn.knei[109] = 6056246762783536917L;
        jn.knei[110] = -9108765101430915560L;
        jn.knei[111] = -7119882741007930512L;
        jn.knei[112] = 4712088645173678610L;
        jn.knei[113] = -9159347269118495998L;
        jn.knei[114] = 8285826310240279809L;
        jn.knei[115] = 3142843471355247447L;
        jn.knei[116] = 972527025296294075L;
        jn.knei[117] = 224079868364557769L;
        jn.knei[118] = -4951772893391244488L;
        jn.knei[119] = 2270765279118965028L;
        jn.knei[120] = 6919001491564382660L;
        jn.knei[121] = -460352521150738093L;
        jn.knei[122] = 733386516988774548L;
        jn.knei[123] = -5434033525588634642L;
        jn.knei[124] = -4082577240976707853L;
        jn.knei[125] = 8025427985692282949L;
        jn.knei[126] = 4780210844515450128L;
        jn.knei[127] = 1833716615444407961L;
        jn.knei[128] = 1847856421122379897L;
        jn.knei[129] = 1737515511125054695L;
        jn.knei[130] = -4001424454778804721L;
        jn.knei[131] = -2795413671423267646L;
        jn.knei[132] = -8276510158812175802L;
        jn.knei[133] = 5110924714622374720L;
        jn.knei[134] = -1819019696504635269L;
        jn.knei[135] = -5696543071668372439L;
        jn.knei[136] = 7879763754315391227L;
        jn.knei[137] = -9039816098647170278L;
        jn.knei[138] = -5056795721638268733L;
        jn.knei[139] = -7878085040731617159L;
        jn.knei[140] = -6882369556225123363L;
        jn.knei[141] = -1137040885257821728L;
        jn.knei[142] = -401205842566774984L;
        jn.knei[143] = 6577753569826741493L;
        jn.knei[144] = 1465903625417578196L;
        jn.knei[145] = -568074857114217995L;
        jn.knei[146] = 2320340549809403793L;
        jn.knei[147] = -3122523142403052754L;
        jn.knei[148] = 8464951470669567628L;
        jn.knei[149] = 8832187101014117168L;
        jn.knei[150] = 2696319893384165393L;
        jn.knei[151] = -6673870816525755986L;
        jn.knei[152] = 255343394680233472L;
        jn.knei[153] = -3613178834401782174L;
        jn.knei[154] = 2297378296986782963L;
        jn.knei[155] = -680836632107801790L;
        jn.knei[156] = -1756299634755736216L;
        jn.knei[157] = -3168493217950566784L;
        jn.knei[158] = 6433105909911097550L;
        jn.knei[159] = 5810006617295069940L;
        jn.knei[160] = -7963667440042527843L;
        jn.knei[161] = -1226218400292809324L;
        jn.knei[162] = 4176247173468260612L;
        jn.knei[163] = -1299773197773337158L;
        jn.knei[164] = -6857317114866057804L;
        jn.knei[165] = -1988101915929417558L;
        jn.knei[166] = 751323839625690974L;
        jn.knei[167] = 3235208005440360943L;
        jn.knei[168] = 851740747519872102L;
        jn.knei[169] = 8733560567860699340L;
        jn.knei[170] = -3701602776447873285L;
        jn.knei[171] = 5324563446620012007L;
        jn.knei[172] = 5204380277575820864L;
        jn.knei[173] = 366065241656562834L;
        jn.knei[174] = -1564339714989254131L;
        jn.knei[175] = -5984590633455928863L;
        jn.knei[176] = -5663615834628731160L;
        jn.knei[177] = 2556957151491155945L;
        jn.knei[178] = 5046402835595364218L;
        jn.knei[179] = -8520917932918619650L;
        jn.knei[180] = -6919497030009617858L;
        jn.knei[181] = -3260044740272150663L;
        jn.knei[182] = 8348991094017091183L;
        jn.knei[183] = -5455503112112601555L;
        jn.knei[184] = 1406516608232223409L;
        jn.knei[185] = -1005137268310246883L;
        jn.knei[186] = 1835410257989586157L;
        jn.knei[187] = 6070259441592965315L;
        jn.knei[188] = 6706373007906441821L;
        jn.knei[189] = 7698345701484504284L;
        jn.knei[190] = 6308482288493437278L;
        jn.knei[191] = 2463103879101142045L;
        jn.knei[192] = -3387936968699658938L;
        jn.knei[193] = -2565907403756796676L;
        jn.knei[194] = 3485235759224207535L;
        jn.knei[195] = 5898578951502322300L;
        jn.knei[196] = 1471540956322448199L;
        jn.knei[197] = -5818662120766417409L;
        jn.knei[198] = 3258173343781933095L;
        jn.knei[199] = -3680513278743535287L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int packTrailModelOverlay() {
        v0 /* !! */  = jn.ss;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - jn.knej("kohl", kneg(int ), (int)185));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2110073133: {
                    v1 = jn.knej("kohm", kneg(int ), (int)186);
                    continue block28;
                }
                case 878007493: {
                    break block28;
                }
                case 1195825697: {
                    v1 = jn.knej("kohn", kneg(int ), (int)187);
                    continue block28;
                }
                case 1960060086: {
                    v1 = jn.knej("koho", kneg(int ), (int)188);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = jn.c;
        v2 /* !! */  = jn.ss;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(jn.knej("kohq", kneg(int ), (int)190) - jn.knej("kohp", kneg(int ), (int)189));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 314185389: {
                    continue block29;
                }
                case 878007493: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = jn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kohr", kneg(int ), (int)191)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jn.knej("kohs", kney(int ), (int)335)) break;
                    v3 /* !! */  = (long)jn.knej("koht", kney(int ), (int)336);
                }
                var1_3 = jn.a;
                if (var3_1) {
                    throw null;
lbl40:
                    // 2 sources

                    return (int)jn.knej("kohu", kney(int ), (int)337);
                }
                if (var1_3 || var1_3) ** GOTO lbl40
                v4 /* !! */  = jn.ss;
                if (true) ** GOTO lbl47
                block32: while (true) {
                    v4 /* !! */  = (long)(v5 - jn.knej("kohv", kneg(int ), (int)192));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1118266580: {
                            v5 = jn.knej("kohw", kneg(int ), (int)193);
                            continue block32;
                        }
                        case 766401874: {
                            v5 = jn.knej("kohx", kneg(int ), (int)194);
                            continue block32;
                        }
                        case 878007493: {
                            break block32;
                        }
                    }
                    break;
                }
                this.ensureRenderCache();
                if (var1_3 || var1_3) ** continue;
                v6 /* !! */  = jn.ss;
                if (true) ** GOTO lbl62
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - jn.knej("kohy", kneg(int ), (int)195));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1092572834: {
                            v7 = jn.knej("kohz", kneg(int ), (int)196);
                            continue block33;
                        }
                        case -146508249: {
                            v7 = jn.knej("koia", kneg(int ), (int)197);
                            continue block33;
                        }
                        case 878007493: {
                            break block33;
                        }
                    }
                    break;
                }
                return this.frameTrailModelOverlay;
            }
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("koib", kney(int ), (int)338);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)jn.knej("koic", kney(int ), (int)339);
                if (var3_1) {
                    throw null;
                }
            }
lbl80:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jn.knej("koid", kney(int ), (int)340);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("koie", kney(int ), (int)341);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)jn.knej("koif", kney(int ), (int)342);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)jn.knej("koig", kney(int ), (int)343);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long kneg(int n2) {
        return kneh[n2] ^ knei[n2];
    }

    private static /* synthetic */ void kpio() {
        jn.knei[200] = -2602713772687158338L;
        jn.knei[201] = 2246862794415904781L;
        jn.knei[202] = -445309490227967931L;
        jn.knei[203] = 1328348754463348248L;
        jn.knei[204] = 5744375197541027089L;
        jn.knei[205] = -6581650301713567234L;
        jn.knei[206] = 6785280285452732265L;
        jn.knei[207] = -2480601032798634846L;
        jn.knei[208] = -2487232872414157546L;
        jn.knei[209] = 2469270457241286395L;
        jn.knei[210] = -8405588276220396579L;
        jn.knei[211] = 1598392809657941438L;
        jn.knei[212] = -8233941918572517148L;
        jn.knei[213] = -411470208172296902L;
        jn.knei[214] = 3045086792006988973L;
        jn.knei[215] = -1612091569149510403L;
        jn.knei[216] = -685843992397740662L;
        jn.knei[217] = -2506974812771664392L;
        jn.knei[218] = 5217448044395493295L;
        jn.knei[219] = -245827072581785995L;
        jn.knei[220] = -4076954574347402317L;
        jn.knei[221] = -7632199934397242349L;
        jn.knei[222] = -8479839572144213526L;
        jn.knei[223] = 1481426080924030056L;
        jn.knei[224] = 3034927770188286398L;
        jn.knei[225] = -1411772041506098210L;
        jn.knei[226] = 3121757387765313505L;
        jn.knei[227] = -2152669287367586021L;
        jn.knei[228] = 7154080708045385758L;
        jn.knei[229] = -247506473501822624L;
        jn.knei[230] = -5218889950236386213L;
        jn.knei[231] = -8804073305204661801L;
        jn.knei[232] = 6961498668949863334L;
        jn.knei[233] = 8638520262910457647L;
        jn.knei[234] = -6447100023533730664L;
        jn.knei[235] = -2258466046396858480L;
        jn.knei[236] = 3043556966434497775L;
        jn.knei[237] = 3468413210724319087L;
        jn.knei[238] = -3244226369972432278L;
        jn.knei[239] = 3851708773582995396L;
        jn.knei[240] = 4478115613133145045L;
        jn.knei[241] = 4349411529673817549L;
        jn.knei[242] = -7108922491047111367L;
        jn.knei[243] = 4769493977593206027L;
        jn.knei[244] = -36109746350538631L;
        jn.knei[245] = 5134323677233581786L;
        jn.knei[246] = -5252597148837710485L;
        jn.knei[247] = 4208681135136428166L;
        jn.knei[248] = 5793308890053984320L;
        jn.knei[249] = 6530739169997240289L;
        jn.knei[250] = -2538193094305561984L;
        jn.knei[251] = 4570940940629442135L;
        jn.knei[252] = -1531104084537395733L;
        jn.knei[253] = 9216763962847039278L;
        jn.knei[254] = 1088553645372320462L;
        jn.knei[255] = 6332653461175274696L;
        jn.knei[256] = 7834225696486703013L;
        jn.knei[257] = -6626162543525721378L;
        jn.knei[258] = 3129223972863094004L;
        jn.knei[259] = 5486113629722323835L;
        jn.knei[260] = 1259586209303625618L;
        jn.knei[261] = -2002404319056463898L;
        jn.knei[262] = 6165973784142786532L;
        jn.knei[263] = -5981763331556216693L;
        jn.knei[264] = -7335791962289678891L;
        jn.knei[265] = -8002443002048259532L;
        jn.knei[266] = 297682929924060284L;
        jn.knei[267] = 1855675429809111675L;
        jn.knei[268] = -3374997729607267808L;
        jn.knei[269] = 4747012684092489002L;
        jn.knei[270] = 2169336299421388453L;
        jn.knei[271] = -5625825010171582458L;
        jn.knei[272] = -9101255001652434587L;
        jn.knei[273] = -653103250624956706L;
        jn.knei[274] = -309709797530475097L;
        jn.knei[275] = 9158501701777339438L;
        jn.knei[276] = 7652858914893389387L;
        jn.knei[277] = -3603213059445516479L;
        jn.knei[278] = 142524037189119079L;
        jn.knei[279] = 6416915909316118472L;
        jn.knei[280] = -5834463620520095420L;
        jn.knei[281] = -485210507276256008L;
        jn.knei[282] = -743081779155896951L;
        jn.knei[283] = 1485326497727054347L;
        jn.knei[284] = -2339609687665870073L;
        jn.knei[285] = -5163217923185595266L;
        jn.knei[286] = 2517588642388594244L;
        jn.knei[287] = -5195115250738820997L;
        jn.knei[288] = -539558856382482990L;
        jn.knei[289] = 8926870436815053785L;
        jn.knei[290] = -635316460616406892L;
        jn.knei[291] = 6291273737986840336L;
        jn.knei[292] = -2114780047058295297L;
        jn.knei[293] = -9125916423489240264L;
        jn.knei[294] = 7433203924588605895L;
        jn.knei[295] = 8797822976664502032L;
        jn.knei[296] = -7019817288321104216L;
        jn.knei[297] = 4852942550050350650L;
        jn.knei[298] = -1338473612682426935L;
        jn.knei[299] = 4942261162840143784L;
    }

    private static /* synthetic */ void kphv() {
        jn.knez[500] = -1054574857;
        jn.knez[501] = -921863083;
        jn.knez[502] = -68697557;
        jn.knez[503] = -582794073;
        jn.knez[504] = -1262432272;
        jn.knez[505] = 1885703644;
        jn.knez[506] = -2020963993;
        jn.knez[507] = -1465266394;
        jn.knez[508] = -930723163;
        jn.knez[509] = -2058165389;
        jn.knez[510] = 965610648;
        jn.knez[511] = -1459401728;
        jn.knez[512] = 1321707858;
        jn.knez[513] = -319150403;
        jn.knez[514] = 2012588845;
        jn.knez[515] = -181970122;
        jn.knez[516] = 1374981163;
        jn.knez[517] = 2008986243;
        jn.knez[518] = -855732099;
        jn.knez[519] = 1462575794;
        jn.knez[520] = 1317305847;
        jn.knez[521] = 1236611;
        jn.knez[522] = 29155049;
        jn.knez[523] = 0x663664;
        jn.knez[524] = 2064575550;
        jn.knez[525] = 160323865;
        jn.knez[526] = 2123320476;
        jn.knez[527] = 1005764482;
        jn.knez[528] = -686452143;
        jn.knez[529] = -1550995388;
        jn.knez[530] = 1841875073;
        jn.knez[531] = -1682756291;
        jn.knez[532] = -1894459329;
        jn.knez[533] = -683559410;
        jn.knez[534] = 498847092;
        jn.knez[535] = 1219466137;
        jn.knez[536] = 306685476;
        jn.knez[537] = 1261473335;
        jn.knez[538] = -2005709854;
        jn.knez[539] = 1181771871;
        jn.knez[540] = -1354588249;
        jn.knez[541] = -1886706451;
        jn.knez[542] = 659858197;
        jn.knez[543] = -205055238;
        jn.knez[544] = -1318625405;
        jn.knez[545] = 697274153;
        jn.knez[546] = 1730902803;
        jn.knez[547] = -1816356288;
        jn.knez[548] = 2069972194;
        jn.knez[549] = 360847935;
        jn.knez[550] = -728382848;
        jn.knez[551] = 1472532152;
        jn.knez[552] = -650631595;
        jn.knez[553] = -852301595;
        jn.knez[554] = -1428220803;
        jn.knez[555] = 409943423;
        jn.knez[556] = 207039495;
        jn.knez[557] = 1324766285;
        jn.knez[558] = 1360000312;
        jn.knez[559] = 841052358;
        jn.knez[560] = -1388706764;
        jn.knez[561] = 1909262111;
        jn.knez[562] = 1483435041;
        jn.knez[563] = 622508253;
        jn.knez[564] = -1604507630;
        jn.knez[565] = 883201079;
        jn.knez[566] = 980651677;
        jn.knez[567] = -630835117;
        jn.knez[568] = 978992135;
        jn.knez[569] = 339460202;
        jn.knez[570] = 443181661;
        jn.knez[571] = -956299346;
        jn.knez[572] = 1786280374;
        jn.knez[573] = 593797672;
        jn.knez[574] = 253358273;
        jn.knez[575] = -1383582579;
        jn.knez[576] = 1213495062;
        jn.knez[577] = 291910463;
        jn.knez[578] = 1896584278;
        jn.knez[579] = 1569761998;
        jn.knez[580] = 140038996;
        jn.knez[581] = 420782628;
        jn.knez[582] = 1991216384;
        jn.knez[583] = -1590115505;
        jn.knez[584] = -66385849;
        jn.knez[585] = 1323819441;
        jn.knez[586] = 1803483558;
        jn.knez[587] = 663990926;
        jn.knez[588] = 667723792;
        jn.knez[589] = 1657552554;
        jn.knez[590] = -1205645814;
        jn.knez[591] = -1031457392;
        jn.knez[592] = -2132632679;
        jn.knez[593] = -1813971811;
        jn.knez[594] = 593544868;
        jn.knez[595] = -2087575516;
        jn.knez[596] = 1234777697;
        jn.knez[597] = 1964326526;
        jn.knez[598] = -2060922298;
        jn.knez[599] = -891768266;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getPrimaryColor() {
        block39: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jn.ss - jn.knej("kpbf", kneg(int ), (int)272)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == jn.knej("kpbg", kney(int ), (int)761)) break;
                v0 /* !! */  = (long)jn.knej("kpbh", kney(int ), (int)762);
            }
            var3_1 = jn.c;
            v1 /* !! */  = jn.ss;
            if (true) ** GOTO lbl12
            block21: while (true) {
                v1 /* !! */  = (long)(v2 - jn.knej("kpbi", kneg(int ), (int)273));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1154548515: {
                        v2 = jn.knej("kpbj", kneg(int ), (int)274);
                        continue block21;
                    }
                    case 878007493: {
                        break block21;
                    }
                    case 1166641445: {
                        v2 = jn.knej("kpbk", kneg(int ), (int)275);
                        continue block21;
                    }
                }
                break;
            }
            var2_2 /* !! */  = jn.b;
            v3 /* !! */  = jn.ss;
            if (true) ** GOTO lbl26
            block22: while (true) {
                v3 /* !! */  = (long)(v4 - jn.knej("kpbl", kneg(int ), (int)276));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1548900121: {
                        v4 = jn.knej("kpbm", kneg(int ), (int)277);
                        continue block22;
                    }
                    case 119892206: {
                        v4 = jn.knej("kpbn", kneg(int ), (int)278);
                        continue block22;
                    }
                    case 878007493: {
                        break block22;
                    }
                }
                break;
            }
            var1_3 = jn.a;
            if (var3_1) {
                throw null;
lbl38:
                // 3 sources

                return (int)jn.knej("kpbo", kney(int ), (int)763);
            }
            if (var1_3 || var1_3) ** GOTO lbl38
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = jn.ss - jn.knej("kpbp", kneg(int ), (int)279)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == jn.knej("kpbq", kney(int ), (int)764)) break;
                v5 /* !! */  = (long)jn.knej("kpbr", kney(int ), (int)765);
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = jn.ss - jn.knej("kpbs", kneg(int ), (int)280)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == jn.knej("kpbt", kney(int ), (int)766)) break;
                v6 /* !! */  = (long)jn.knej("kpbu", kney(int ), (int)767);
            }
            if (!this.colorMode.isSelected("\u041e\u0442 \u0442\u0435\u043c\u044b")) break block39;
            if (var1_3) ** GOTO lbl38
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = jn.ss - jn.knej("kpbv", kneg(int ), (int)281)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == jn.knej("kpbw", kney(int ), (int)768)) break;
                v7 /* !! */  = (long)jn.knej("kpbx", kney(int ), (int)769);
            }
            return nd.getClientColorAt(0.0f);
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (int)jn.knej("kpby", kney(int ), (int)770);
            }
            case 0: {
                var2_2 /* !! */  = (int)jn.knej("kpbz", kney(int ), (int)771);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl74:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)jn.knej("kpca", kney(int ), (int)772);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl79:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jn.knej("kpcb", kney(int ), (int)773);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 3: {
                var2_2 /* !! */  = (int)jn.knej("kpcc", kney(int ), (int)774);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)jn.knej("kpcd", kney(int ), (int)775);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)jn.knej("kpce", kney(int ), (int)776);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
lbl98:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)jn.knej("kpcf", kney(int ), (int)777);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)jn.knej("kpcg", kney(int ), (int)778);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kpif() {
        jn.knfa[600] = -2022362151;
        jn.knfa[601] = -371998589;
        jn.knfa[602] = 571778837;
        jn.knfa[603] = 4118062;
        jn.knfa[604] = -707858126;
        jn.knfa[605] = -437115205;
        jn.knfa[606] = 215447298;
        jn.knfa[607] = -1625116866;
        jn.knfa[608] = 255228273;
        jn.knfa[609] = 1948312017;
        jn.knfa[610] = -264570912;
        jn.knfa[611] = 1253841009;
        jn.knfa[612] = 1993618948;
        jn.knfa[613] = 241496576;
        jn.knfa[614] = 774910467;
        jn.knfa[615] = -2094794051;
        jn.knfa[616] = 1239636195;
        jn.knfa[617] = -1393227404;
        jn.knfa[618] = 715770507;
        jn.knfa[619] = 585145637;
        jn.knfa[620] = 1570788322;
        jn.knfa[621] = 493343499;
        jn.knfa[622] = 848575700;
        jn.knfa[623] = 1227117336;
        jn.knfa[624] = -1462308539;
        jn.knfa[625] = 1052336479;
        jn.knfa[626] = -1147947214;
        jn.knfa[627] = -1612829418;
        jn.knfa[628] = 652272025;
        jn.knfa[629] = -225834492;
        jn.knfa[630] = -1351184674;
        jn.knfa[631] = -862810215;
        jn.knfa[632] = 1302254273;
        jn.knfa[633] = -1051119346;
        jn.knfa[634] = 1103527722;
        jn.knfa[635] = 971756594;
        jn.knfa[636] = -1778162609;
        jn.knfa[637] = -358430507;
        jn.knfa[638] = 231876604;
        jn.knfa[639] = -1806608143;
        jn.knfa[640] = 677940500;
        jn.knfa[641] = 2062453243;
        jn.knfa[642] = 1126924153;
        jn.knfa[643] = 1070965258;
        jn.knfa[644] = 1079854585;
        jn.knfa[645] = -447993938;
        jn.knfa[646] = -1120982272;
        jn.knfa[647] = -1884130892;
        jn.knfa[648] = 136482320;
        jn.knfa[649] = -475528150;
        jn.knfa[650] = -2097941671;
        jn.knfa[651] = -1718355372;
        jn.knfa[652] = -1880351771;
        jn.knfa[653] = 773335425;
        jn.knfa[654] = -1049997286;
        jn.knfa[655] = 351898270;
        jn.knfa[656] = -467158852;
        jn.knfa[657] = -161591091;
        jn.knfa[658] = 1722001747;
        jn.knfa[659] = 1398555321;
        jn.knfa[660] = 278332510;
        jn.knfa[661] = -392926939;
        jn.knfa[662] = -648507849;
        jn.knfa[663] = -1470337124;
        jn.knfa[664] = -141957713;
        jn.knfa[665] = -1282357075;
        jn.knfa[666] = 31666612;
        jn.knfa[667] = -1760298611;
        jn.knfa[668] = -1566370761;
        jn.knfa[669] = 571927326;
        jn.knfa[670] = -1602207610;
        jn.knfa[671] = 1682316901;
        jn.knfa[672] = -32019772;
        jn.knfa[673] = -891481502;
        jn.knfa[674] = 2067240704;
        jn.knfa[675] = 448188700;
        jn.knfa[676] = 1227960953;
        jn.knfa[677] = 51786557;
        jn.knfa[678] = -552587614;
        jn.knfa[679] = -347492567;
        jn.knfa[680] = -1641335642;
        jn.knfa[681] = -651290962;
        jn.knfa[682] = -227599997;
        jn.knfa[683] = -254574906;
        jn.knfa[684] = -431600143;
        jn.knfa[685] = 808042248;
        jn.knfa[686] = 1831922345;
        jn.knfa[687] = 1813451439;
        jn.knfa[688] = -1983348526;
        jn.knfa[689] = 1959164769;
        jn.knfa[690] = 981520282;
        jn.knfa[691] = -641325527;
        jn.knfa[692] = -541705404;
        jn.knfa[693] = -34845392;
        jn.knfa[694] = 1007628082;
        jn.knfa[695] = 1726313797;
        jn.knfa[696] = 15582136;
        jn.knfa[697] = -1674673103;
        jn.knfa[698] = 1578295735;
        jn.knfa[699] = -1742498459;
    }
}

