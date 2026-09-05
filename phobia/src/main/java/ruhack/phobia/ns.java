/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2DoubleMap
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1320
 *  net.minecraft.class_1657
 *  net.minecraft.class_1690
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2399
 *  net.minecraft.class_243
 *  net.minecraft.class_2533
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_3481
 *  net.minecraft.class_3486
 *  net.minecraft.class_3532
 *  net.minecraft.class_3611
 *  net.minecraft.class_5134
 *  net.minecraft.class_5635
 *  net.minecraft.class_6862
 *  net.minecraft.class_6880
 */
package ruhack.phobia;

import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Collections;
import java.util.HashSet;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1320;
import net.minecraft.class_1657;
import net.minecraft.class_1690;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3611;
import net.minecraft.class_5134;
import net.minecraft.class_5635;
import net.minecraft.class_6862;
import net.minecraft.class_6880;
import ruhack.phobia.c;
import ruhack.phobia.nr;
import ruhack.phobia.ns$SimulatedPlayerInput;

public class ns
implements c,
nr {
    public boolean isSwimming;
    public final class_1657 player;
    public boolean verticalCollision;
    public float fallDistance;
    private final HashSet<class_6862<class_3611>> submergedFluidTag;
    public static final boolean c;
    private static int[] lpss;
    public boolean onGround;
    public boolean isJumping;
    protected static final long uk = 5138750055811229952L;
    private static long[] lptx;
    private static final double STEP_HEIGHT = 0.5;
    private static long[] lptw;
    public boolean touchingWater;
    public boolean submergedInWater;
    public class_238 boundingBox;
    public boolean isFallFlying;
    public int jumpingCooldown;
    public static final int b;
    public float pitch;
    private final Object2DoubleMap<class_6862<class_3611>> fluidHeight;
    public boolean horizontalCollision;
    public boolean sprinting;
    private int simulatedTicks;
    public static final boolean a;
    public float yaw;
    private static int[] lpsr;
    private boolean clipLedged;
    public class_243 velocity;
    public class_243 pos;
    public final ns$SimulatedPlayerInput input;

    private static /* synthetic */ void ltqe() {
        ns.lpsr[900] = 1208822505;
        ns.lpsr[901] = 1164594437;
        ns.lpsr[902] = -1558073883;
        ns.lpsr[903] = -1068796496;
        ns.lpsr[904] = -1092890176;
        ns.lpsr[905] = 1218367886;
        ns.lpsr[906] = -1033087723;
        ns.lpsr[907] = -1798086332;
        ns.lpsr[908] = -756491665;
        ns.lpsr[909] = -682524803;
        ns.lpsr[910] = 1949113031;
        ns.lpsr[911] = -1853771162;
        ns.lpsr[912] = 1855733430;
        ns.lpsr[913] = -463673465;
        ns.lpsr[914] = -2014610093;
        ns.lpsr[915] = 1208622149;
        ns.lpsr[916] = -632411172;
        ns.lpsr[917] = -1765065902;
        ns.lpsr[918] = 1231045351;
        ns.lpsr[919] = -1453960949;
        ns.lpsr[920] = 53086121;
        ns.lpsr[921] = 175379677;
        ns.lpsr[922] = 981400534;
        ns.lpsr[923] = -410469932;
        ns.lpsr[924] = -1580622924;
        ns.lpsr[925] = 1388688664;
        ns.lpsr[926] = -680432910;
        ns.lpsr[927] = -1764881299;
        ns.lpsr[928] = -979800979;
        ns.lpsr[929] = 460752533;
        ns.lpsr[930] = 1484022148;
        ns.lpsr[931] = -1001886061;
        ns.lpsr[932] = 115374204;
        ns.lpsr[933] = -287810236;
        ns.lpsr[934] = -1126289615;
        ns.lpsr[935] = -1452654428;
        ns.lpsr[936] = 1699727049;
        ns.lpsr[937] = -363306577;
        ns.lpsr[938] = 1366834205;
        ns.lpsr[939] = 1432313808;
        ns.lpsr[940] = 1638368156;
        ns.lpsr[941] = 2018781949;
        ns.lpsr[942] = -1218265919;
        ns.lpsr[943] = -469583034;
        ns.lpsr[944] = -1148329288;
        ns.lpsr[945] = -902752690;
        ns.lpsr[946] = 1734811035;
        ns.lpsr[947] = 1582217889;
        ns.lpsr[948] = 1679220665;
        ns.lpsr[949] = -1714008970;
        ns.lpsr[950] = 1388481662;
        ns.lpsr[951] = 1965031222;
        ns.lpsr[952] = -1883314139;
        ns.lpsr[953] = 649930858;
        ns.lpsr[954] = -14399850;
        ns.lpsr[955] = -997760909;
        ns.lpsr[956] = 775337786;
        ns.lpsr[957] = -976029089;
        ns.lpsr[958] = 691112688;
        ns.lpsr[959] = 878783628;
        ns.lpsr[960] = 528406308;
        ns.lpsr[961] = -1616752572;
        ns.lpsr[962] = 1100699387;
        ns.lpsr[963] = 1471482890;
        ns.lpsr[964] = -1732926748;
        ns.lpsr[965] = -1125563808;
        ns.lpsr[966] = 183522013;
        ns.lpsr[967] = -255651830;
        ns.lpsr[968] = -1478314547;
        ns.lpsr[969] = 1512402680;
        ns.lpsr[970] = -334000581;
        ns.lpsr[971] = 1624755007;
        ns.lpsr[972] = 1094131244;
        ns.lpsr[973] = -1376411516;
        ns.lpsr[974] = -888736523;
        ns.lpsr[975] = 1112178638;
        ns.lpsr[976] = -638989056;
        ns.lpsr[977] = 398216775;
        ns.lpsr[978] = 789748626;
        ns.lpsr[979] = -2052734958;
        ns.lpsr[980] = 827067026;
        ns.lpsr[981] = -1158845732;
        ns.lpsr[982] = 543182636;
        ns.lpsr[983] = -1976825196;
        ns.lpsr[984] = 1881797872;
        ns.lpsr[985] = 1126512149;
        ns.lpsr[986] = 2094858302;
        ns.lpsr[987] = 49233302;
        ns.lpsr[988] = 1699169772;
        ns.lpsr[989] = 1154288156;
        ns.lpsr[990] = -255330162;
        ns.lpsr[991] = 1439364552;
        ns.lpsr[992] = 201912387;
        ns.lpsr[993] = -252818189;
        ns.lpsr[994] = 868351091;
        ns.lpsr[995] = 503261284;
        ns.lpsr[996] = 744508498;
        ns.lpsr[997] = -1608317271;
        ns.lpsr[998] = -913525422;
        ns.lpsr[999] = -903246519;
    }

    private static /* synthetic */ void ltrf() {
        ns.lptw[0] = -8609445154388388472L;
        ns.lptw[1] = 5071105316270365583L;
        ns.lptw[2] = 3049285079384448644L;
        ns.lptw[3] = -6417674993310418147L;
        ns.lptw[4] = -4759401795675917704L;
        ns.lptw[5] = 5009796643671450923L;
        ns.lptw[6] = -1165325693727605763L;
        ns.lptw[7] = -4499356822262028149L;
        ns.lptw[8] = -3652145386289918393L;
        ns.lptw[9] = 7219021073202536372L;
        ns.lptw[10] = -1658616985181025609L;
        ns.lptw[11] = 5052097628920757765L;
        ns.lptw[12] = -7504424623518302141L;
        ns.lptw[13] = 3336407593451064656L;
        ns.lptw[14] = 2383638947464242350L;
        ns.lptw[15] = -1832102984359497338L;
        ns.lptw[16] = 539983909723579962L;
        ns.lptw[17] = -2542139704985027170L;
        ns.lptw[18] = 6972087460813371929L;
        ns.lptw[19] = -6395650610860965615L;
        ns.lptw[20] = 1880754419406094102L;
        ns.lptw[21] = 10313320604565696L;
        ns.lptw[22] = -2314929857404544780L;
        ns.lptw[23] = 461243179427219993L;
        ns.lptw[24] = 4530684992797838588L;
        ns.lptw[25] = -4839118682040209303L;
        ns.lptw[26] = 6426316957417666400L;
        ns.lptw[27] = 1279669288276516175L;
        ns.lptw[28] = 7615480403186406161L;
        ns.lptw[29] = 1663828956375413246L;
        ns.lptw[30] = 7553744982086509531L;
        ns.lptw[31] = 4799271885719925742L;
        ns.lptw[32] = -6544642553028597811L;
        ns.lptw[33] = -35433600335689839L;
        ns.lptw[34] = 5209104621008265111L;
        ns.lptw[35] = 7376566679489175443L;
        ns.lptw[36] = -1639825070549416808L;
        ns.lptw[37] = 1667132549126723405L;
        ns.lptw[38] = -4389689651258873960L;
        ns.lptw[39] = -4367515779359167359L;
        ns.lptw[40] = -5555327696951478885L;
        ns.lptw[41] = 2969858920599502143L;
        ns.lptw[42] = -8593334775968470711L;
        ns.lptw[43] = -5773309923605555353L;
        ns.lptw[44] = 3114421119007171132L;
        ns.lptw[45] = 7774776632452757685L;
        ns.lptw[46] = -2529606683848578515L;
        ns.lptw[47] = -3159453425233663090L;
        ns.lptw[48] = 7380547981576953019L;
        ns.lptw[49] = -5951876484605092509L;
        ns.lptw[50] = 9085370886053337975L;
        ns.lptw[51] = -5937066207828314176L;
        ns.lptw[52] = -7126522745701868146L;
        ns.lptw[53] = 9109554358410248993L;
        ns.lptw[54] = -3909614589944146223L;
        ns.lptw[55] = 5501331407268652100L;
        ns.lptw[56] = 5847440818012052563L;
        ns.lptw[57] = -7894654688322593879L;
        ns.lptw[58] = -2226829279024062507L;
        ns.lptw[59] = -3385337486839477622L;
        ns.lptw[60] = -3131907786524433774L;
        ns.lptw[61] = -2734716199851409505L;
        ns.lptw[62] = 8718808012752389295L;
        ns.lptw[63] = 9115690006864827054L;
        ns.lptw[64] = -5940800349835218235L;
        ns.lptw[65] = -5824432236376895973L;
        ns.lptw[66] = 8901502647352588229L;
        ns.lptw[67] = -7795749833400938025L;
        ns.lptw[68] = -9136062772558977352L;
        ns.lptw[69] = -6160592809457593301L;
        ns.lptw[70] = 1498787600614768161L;
        ns.lptw[71] = 9196676384352765398L;
        ns.lptw[72] = -3274611463506481521L;
        ns.lptw[73] = -3004812039892763423L;
        ns.lptw[74] = -1701991208924498931L;
        ns.lptw[75] = -9018637589712723848L;
        ns.lptw[76] = -5190222989194664181L;
        ns.lptw[77] = 8764125621512074785L;
        ns.lptw[78] = 2541844790934866303L;
        ns.lptw[79] = -223045046307485574L;
        ns.lptw[80] = -3491169096415146103L;
        ns.lptw[81] = 8499736903864247588L;
        ns.lptw[82] = -2620658380918312238L;
        ns.lptw[83] = 1939737081887695803L;
        ns.lptw[84] = -8593031696005274101L;
        ns.lptw[85] = 7455442569163713432L;
        ns.lptw[86] = -8104170310104550789L;
        ns.lptw[87] = -935856380158091345L;
        ns.lptw[88] = 22177619096222607L;
        ns.lptw[89] = -3657967784090120158L;
        ns.lptw[90] = 5495031459653800870L;
        ns.lptw[91] = -4787973276346408063L;
        ns.lptw[92] = 2839763606142498004L;
        ns.lptw[93] = 1982611740586902452L;
        ns.lptw[94] = 370975690224655444L;
        ns.lptw[95] = -6436081969608839190L;
        ns.lptw[96] = -1488266843813795189L;
        ns.lptw[97] = -3819518690568127299L;
        ns.lptw[98] = -257901187022907331L;
        ns.lptw[99] = -5861572266063712758L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isInLava() {
        block46: {
            v0 /* !! */  = ns.uk;
            if (true) ** GOTO lbl5
            block27: while (true) {
                v0 /* !! */  = (long)(v1 - ns.lpst("lskk", lptv(int ), (int)577));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1321749987: {
                        v1 = ns.lpst("lskl", lptv(int ), (int)578);
                        continue block27;
                    }
                    case -363697461: {
                        v1 = ns.lpst("lskm", lptv(int ), (int)579);
                        continue block27;
                    }
                    case 304457984: {
                        break block27;
                    }
                    case 758183961: {
                        v1 = ns.lpst("lskn", lptv(int ), (int)580);
                        continue block27;
                    }
                }
                break;
            }
            var3_1 = ns.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsko", lptv(int ), (int)581)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ns.lpst("lskp", lpsq(int ), (int)1228)) break;
                v2 /* !! */  = (long)ns.lpst("lskq", lpsq(int ), (int)1229);
            }
            var2_2 /* !! */  = ns.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lskr", lptv(int ), (int)582)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ns.lpst("lsks", lpsq(int ), (int)1230)) break;
                v3 /* !! */  = (long)ns.lpst("lskt", lpsq(int ), (int)1231);
            }
            var1_3 = ns.a;
            if (var3_1) {
                throw null;
lbl34:
                // 4 sources

                return (boolean)ns.lpst("lsku", lpsq(int ), (int)1232);
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lskv", lptv(int ), (int)583)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ns.lpst("lskw", lpsq(int ), (int)1233)) break;
                v4 /* !! */  = (long)ns.lpst("lskx", lpsq(int ), (int)1234);
            }
            v5 /* !! */  = ns.uk;
            if (true) ** GOTO lbl47
            block32: while (true) {
                v5 /* !! */  = (long)(v6 - ns.lpst("lsky", lptv(int ), (int)584));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1931398476: {
                        v6 = ns.lpst("lskz", lptv(int ), (int)585);
                        continue block32;
                    }
                    case 304457984: {
                        break block32;
                    }
                    case 487260467: {
                        v6 = ns.lpst("lsla", lptv(int ), (int)586);
                        continue block32;
                    }
                }
                break;
            }
            v7 /* !! */  = ns.uk;
            if (true) ** GOTO lbl60
            block33: while (true) {
                v7 /* !! */  = (long)(v8 - ns.lpst("lslb", lptv(int ), (int)587));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2035084712: {
                        v8 = ns.lpst("lslc", lptv(int ), (int)588);
                        continue block33;
                    }
                    case -1116082278: {
                        v8 = ns.lpst("lsld", lptv(int ), (int)589);
                        continue block33;
                    }
                    case 304457984: {
                        break block33;
                    }
                    case 665955954: {
                        v8 = ns.lpst("lsle", lptv(int ), (int)590);
                        continue block33;
                    }
                }
                break;
            }
            if (!(this.fluidHeight.getDouble((Object)class_3486.field_15518) > 0.0)) break block46;
            if (var1_3) ** GOTO lbl34
            v9 = ns.lpst("lslf", lpsq(int ), (int)1235);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl86
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v9 = ns.lpst("lslg", lpsq(int ), (int)1236);
lbl86:
                // 2 sources

                return (boolean)v9;
            }
lbl87:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ns.lpst("lslh", lpsq(int ), (int)1237);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("lsli", lpsq(int ), (int)1238);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lslj", lpsq(int ), (int)1239);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ns.lpst("lslk", lpsq(int ), (int)1240);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl106:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ns.lpst("lsll", lpsq(int ), (int)1241);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ns.lpst("lslm", lpsq(int ), (int)1242);
                if (!var3_1) ** GOTO lbl106
                throw null;
            }
lbl115:
            // 2 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("lsln", lpsq(int ), (int)1243);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ns.lpst("lslo", lpsq(int ), (int)1244);
        ** while (!var3_1)
lbl123:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateVelocity(float var1_1, class_243 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lqwv", lptv(int ), (int)213)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lqww", lpsq(int ), (int)563)) break;
            v0 /* !! */  = (long)ns.lpst("lqwx", lpsq(int ), (int)564);
        }
        var6_3 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lqwy", lptv(int ), (int)214)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("lqwz", lpsq(int ), (int)565)) break;
            v1 /* !! */  = (long)ns.lpst("lqxa", lpsq(int ), (int)566);
        }
        var5_4 /* !! */  = ns.b;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl17
        block30: while (true) {
            v2 /* !! */  = (long)(ns.lpst("lqxc", lptv(int ), (int)216) - ns.lpst("lqxb", lptv(int ), (int)215));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 304457984: {
                    break block30;
                }
                case 590011379: {
                    continue block30;
                }
            }
            break;
        }
        var4_5 = ns.a;
        if (var6_3) {
            throw null;
lbl25:
            // 4 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl25
        v3 /* !! */  = ns.uk;
        if (true) ** GOTO lbl32
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - ns.lpst("lqxd", lptv(int ), (int)217));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 263417384: {
                    v4 = ns.lpst("lqxe", lptv(int ), (int)218);
                    continue block32;
                }
                case 304457984: {
                    break block32;
                }
                case 1173057777: {
                    v4 = ns.lpst("lqxf", lptv(int ), (int)219);
                    continue block32;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lqxg", lptv(int ), (int)220)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ns.lpst("lqxh", lpsq(int ), (int)567)) break;
            v5 /* !! */  = (long)ns.lpst("lqxi", lpsq(int ), (int)568);
        }
        var3_6 = class_1297.method_18795((class_243)var2_2, (float)var1_1, (float)this.yaw);
        if (var4_5) ** GOTO lbl25
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl25
                v6 /* !! */  = ns.uk;
                if (true) ** GOTO lbl56
                block34: while (true) {
                    v6 /* !! */  = (long)(v7 - ns.lpst("lqxj", lptv(int ), (int)221));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2145550833: {
                            v7 = ns.lpst("lqxk", lptv(int ), (int)222);
                            continue block34;
                        }
                        case 304457984: {
                            break block34;
                        }
                        case 993522999: {
                            v7 = ns.lpst("lqxl", lptv(int ), (int)223);
                            continue block34;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lqxm", lptv(int ), (int)224)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ns.lpst("lqxn", lpsq(int ), (int)569)) break;
                    v8 /* !! */  = (long)ns.lpst("lqxo", lpsq(int ), (int)570);
                }
                v9 = this.velocity.method_1019(var3_6);
                v10 /* !! */  = ns.uk;
                if (true) ** GOTO lbl75
                block36: while (true) {
                    v10 /* !! */  = (long)(ns.lpst("lqxq", lptv(int ), (int)226) - ns.lpst("lqxp", lptv(int ), (int)225));
lbl75:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 304457984: {
                            break block36;
                        }
                        case 1532579851: {
                            continue block36;
                        }
                    }
                    break;
                }
                this.velocity = v9;
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl84:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)ns.lpst("lqxr", lpsq(int ), (int)571);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ns.lpst("lqxs", lpsq(int ), (int)572);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl109
                    break;
                }
            }
            case 2: {
                var5_4 /* !! */  = (int)ns.lpst("lqxt", lpsq(int ), (int)573);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl100:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)ns.lpst("lqxu", lpsq(int ), (int)574);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 4: {
                var5_4 /* !! */  = (int)ns.lpst("lqxv", lpsq(int ), (int)575);
                if (!var6_3) ** GOTO lbl84
                throw null;
            }
lbl109:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)ns.lpst("lqxw", lpsq(int ), (int)576);
                if (!var6_3) ** GOTO lbl100
                throw null;
            }
lbl113:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)ns.lpst("lqxx", lpsq(int ), (int)577);
                if (!var6_3) ** GOTO lbl84
                throw null;
            }
            case 7: 
        }
        var5_4 /* !! */  = (int)ns.lpst("lqxy", lpsq(int ), (int)578);
        ** while (!var6_3)
lbl120:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltru() {
        ns.lptx[500] = -4991011971742690403L;
        ns.lptx[501] = -301720468440089737L;
        ns.lptx[502] = -4241404095346561972L;
        ns.lptx[503] = 7409127703903656363L;
        ns.lptx[504] = 4794708247527135550L;
        ns.lptx[505] = -8215465176787235459L;
        ns.lptx[506] = -8151306815611778378L;
        ns.lptx[507] = -8100050802949939549L;
        ns.lptx[508] = 7125882703285031928L;
        ns.lptx[509] = -5289576641641347748L;
        ns.lptx[510] = -914788887432731594L;
        ns.lptx[511] = -6621621642026849109L;
        ns.lptx[512] = 8381867923645773401L;
        ns.lptx[513] = -1359432344849814282L;
        ns.lptx[514] = 5997221666547429506L;
        ns.lptx[515] = -1870880508807979472L;
        ns.lptx[516] = 7041096042516582625L;
        ns.lptx[517] = -3948636269244570748L;
        ns.lptx[518] = -4306819159939254378L;
        ns.lptx[519] = -7721438827992074691L;
        ns.lptx[520] = -856213380095323470L;
        ns.lptx[521] = -3769028799982740839L;
        ns.lptx[522] = -1877766230988341600L;
        ns.lptx[523] = 6676256772316041838L;
        ns.lptx[524] = 6406023737905211815L;
        ns.lptx[525] = 6641734525412147519L;
        ns.lptx[526] = 679257074785378069L;
        ns.lptx[527] = -5708418943123565474L;
        ns.lptx[528] = -2237329996662172752L;
        ns.lptx[529] = -4642803116881530939L;
        ns.lptx[530] = 4542042364032517037L;
        ns.lptx[531] = 1808889321127120858L;
        ns.lptx[532] = 6687539840932368190L;
        ns.lptx[533] = 5771753885154810878L;
        ns.lptx[534] = -7439865421064811185L;
        ns.lptx[535] = 3753771202423207025L;
        ns.lptx[536] = -2214685490611251990L;
        ns.lptx[537] = 2060074504042165345L;
        ns.lptx[538] = -3523849718825207589L;
        ns.lptx[539] = -2498011754608799709L;
        ns.lptx[540] = 6470378737768711602L;
        ns.lptx[541] = -5080785083326333299L;
        ns.lptx[542] = -6012652869706305042L;
        ns.lptx[543] = 6935250786594418801L;
        ns.lptx[544] = 8997751023991945721L;
        ns.lptx[545] = -3715609333268009229L;
        ns.lptx[546] = -2768734238948852665L;
        ns.lptx[547] = 661018144147345260L;
        ns.lptx[548] = -1524833709005498843L;
        ns.lptx[549] = -727170024813271727L;
        ns.lptx[550] = -8984785939527863512L;
        ns.lptx[551] = 8080270199435745368L;
        ns.lptx[552] = 3185697132149435755L;
        ns.lptx[553] = -5709769810743927776L;
        ns.lptx[554] = -4918965944019113829L;
        ns.lptx[555] = 8974232404341546135L;
        ns.lptx[556] = 566160886893620990L;
        ns.lptx[557] = 6946844875069479607L;
        ns.lptx[558] = 3416028320674385735L;
        ns.lptx[559] = -3297640599626886880L;
        ns.lptx[560] = 4348692832588905140L;
        ns.lptx[561] = 412444258329993370L;
        ns.lptx[562] = -8009188911527112140L;
        ns.lptx[563] = -3676229111314089869L;
        ns.lptx[564] = -6994660107010191005L;
        ns.lptx[565] = -2352754021367476395L;
        ns.lptx[566] = -5876327970672805954L;
        ns.lptx[567] = 191638314165373490L;
        ns.lptx[568] = -1035581495523323431L;
        ns.lptx[569] = 8059516292481375364L;
        ns.lptx[570] = -4898114944722507062L;
        ns.lptx[571] = -439140227892261912L;
        ns.lptx[572] = -8130917200283935158L;
        ns.lptx[573] = 4164734695461610978L;
        ns.lptx[574] = -6507621140310992815L;
        ns.lptx[575] = 738338017696243956L;
        ns.lptx[576] = -306702361282097577L;
        ns.lptx[577] = 3151680002846094173L;
        ns.lptx[578] = 1071080137983819818L;
        ns.lptx[579] = 5609263381273849969L;
        ns.lptx[580] = 8254418947004172570L;
        ns.lptx[581] = 6910698730227782611L;
        ns.lptx[582] = -5342729045396798985L;
        ns.lptx[583] = -839403676875297521L;
        ns.lptx[584] = 7158637080406861257L;
        ns.lptx[585] = -6556557336559705618L;
        ns.lptx[586] = 6823293551818661896L;
        ns.lptx[587] = -6670313894248963470L;
        ns.lptx[588] = 4151240219048779042L;
        ns.lptx[589] = 1309713322352717490L;
        ns.lptx[590] = -1417010006093259990L;
        ns.lptx[591] = -2293747671147344638L;
        ns.lptx[592] = -1004502410363842790L;
        ns.lptx[593] = -4838782479844705305L;
        ns.lptx[594] = -5049603661565748263L;
        ns.lptx[595] = 3134471104689568113L;
        ns.lptx[596] = -1389791470954837251L;
        ns.lptx[597] = 758201627854100008L;
        ns.lptx[598] = -7279037915127490627L;
        ns.lptx[599] = 7432604841596456314L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected boolean shouldClipAtLedge() {
        block52: {
            block51: {
                v0 /* !! */  = ns.uk;
                if (true) ** GOTO lbl5
                block31: while (true) {
                    v0 /* !! */  = (long)(v1 - ns.lpst("lrvb", lptv(int ), (int)405));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1846128833: {
                            v1 = ns.lpst("lrvc", lptv(int ), (int)406);
                            continue block31;
                        }
                        case -1011471135: {
                            v1 = ns.lpst("lrvd", lptv(int ), (int)407);
                            continue block31;
                        }
                        case -442692412: {
                            v1 = ns.lpst("lrve", lptv(int ), (int)408);
                            continue block31;
                        }
                        case 304457984: {
                            break block31;
                        }
                    }
                    break;
                }
                var3_1 = ns.c;
                v2 /* !! */  = ns.uk;
                if (true) ** GOTO lbl22
                block32: while (true) {
                    v2 /* !! */  = (long)(v3 - ns.lpst("lrvf", lptv(int ), (int)409));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2045352260: {
                            v3 = ns.lpst("lrvg", lptv(int ), (int)410);
                            continue block32;
                        }
                        case 304457984: {
                            break block32;
                        }
                        case 644523382: {
                            v3 = ns.lpst("lrvh", lptv(int ), (int)411);
                            continue block32;
                        }
                        case 1150586589: {
                            v3 = ns.lpst("lrvi", lptv(int ), (int)412);
                            continue block32;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = ns.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrvj", lptv(int ), (int)413)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ns.lpst("lrvk", lpsq(int ), (int)1001)) break;
                    v4 /* !! */  = (long)ns.lpst("lrvl", lpsq(int ), (int)1002);
                }
                var1_3 = ns.a;
                if (var3_1) {
                    throw null;
lbl43:
                    // 6 sources

                    return (boolean)ns.lpst("lrvm", lpsq(int ), (int)1003);
                }
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrvn", lptv(int ), (int)414)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ns.lpst("lrvo", lpsq(int ), (int)1004)) break;
                    v5 /* !! */  = (long)ns.lpst("lrvp", lpsq(int ), (int)1005);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lrvq", lptv(int ), (int)415)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ns.lpst("lrvr", lpsq(int ), (int)1006)) break;
                    v6 /* !! */  = (long)ns.lpst("lrvs", lpsq(int ), (int)1007);
                }
                v7 = this.input.playerInput;
                v8 /* !! */  = ns.uk;
                if (true) ** GOTO lbl61
                block37: while (true) {
                    v8 /* !! */  = (long)(v9 - ns.lpst("lrvt", lptv(int ), (int)416));
lbl61:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1222583992: {
                            v9 = ns.lpst("lrvu", lptv(int ), (int)417);
                            continue block37;
                        }
                        case -686593768: {
                            v9 = ns.lpst("lrvv", lptv(int ), (int)418);
                            continue block37;
                        }
                        case 304457984: {
                            break block37;
                        }
                        case 362768508: {
                            v9 = ns.lpst("lrvw", lptv(int ), (int)419);
                            continue block37;
                        }
                    }
                    break;
                }
                if (v7.comp_3164()) break block51;
                if (var1_3) ** GOTO lbl43
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lrvx", lptv(int ), (int)420)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ns.lpst("lrvy", lpsq(int ), (int)1008)) break;
                    v10 /* !! */  = (long)ns.lpst("lrvz", lpsq(int ), (int)1009);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lrwa", lptv(int ), (int)421)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ns.lpst("lrwb", lpsq(int ), (int)1010)) break;
                    v11 /* !! */  = (long)ns.lpst("lrwc", lpsq(int ), (int)1011);
                }
                if (!this.input.forceSafeWalk) break block52;
                if (var1_3) ** GOTO lbl43
            }
            if (var1_3 || var1_3) ** GOTO lbl43
            v12 = ns.lpst("lrwd", lpsq(int ), (int)1012);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl101
        }
        if (var1_3) ** GOTO lbl43
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block18 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v12 = ns.lpst("lrwe", lpsq(int ), (int)1013);
lbl101:
                // 2 sources

                return (boolean)v12;
            }
lbl102:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ns.lpst("lrwf", lpsq(int ), (int)1014);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 1: {
                var2_2 /* !! */  = (int)ns.lpst("lrwg", lpsq(int ), (int)1015);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lrwh", lpsq(int ), (int)1016);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl117:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ns.lpst("lrwi", lpsq(int ), (int)1017);
                    if (!var3_1) break block18;
                    throw null;
                }
            }
lbl122:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ns.lpst("lrwj", lpsq(int ), (int)1018);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 5: {
                var2_2 /* !! */  = (int)ns.lpst("lrwk", lpsq(int ), (int)1019);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl132:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ns.lpst("lrwl", lpsq(int ), (int)1020);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ns.lpst("lrwm", lpsq(int ), (int)1021);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl140:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ns.lpst("lrwn", lpsq(int ), (int)1022);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
lbl144:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ns.lpst("lrwo", lpsq(int ), (int)1023);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ns.lpst("lrwp", lpsq(int ), (int)1024);
        ** while (!var3_1)
lbl151:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 adjustMovementForCollisions(class_243 var1_1) {
        var14_2 = ns.c;
        var13_3 /* !! */  = ns.b;
        var12_4 = ns.a;
        if (var14_2) {
            throw null;
lbl6:
            // 37 sources

            return null;
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        var2_5 = new class_238((double)ns.lpst("lrdp", lqfo(int ), (int)258), 0.0, (double)ns.lpst("lrdq", lqfo(int ), (int)259), (double)ns.lpst("lrdr", lqfo(int ), (int)260), (double)ns.lpst("lrds", lqfo(int ), (int)261), (double)ns.lpst("lrdt", lqfo(int ), (int)262)).method_997(this.pos);
        if (var12_4 || var12_4) ** GOTO lbl6
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6 = Collections.emptyList();
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var1_1.method_1027() != 0.0) ** GOTO lbl23
                if (var12_4 || var12_4) ** GOTO lbl6
                var4_7 = var1_1;
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl26
lbl23:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                var4_7 = class_1297.method_20736((class_1297)this.player, (class_243)var1_1, (class_238)var2_5, (class_1937)this.player.method_73183(), var3_6);
                if (var12_4) ** GOTO lbl6
lbl26:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var1_1.field_1352 == var4_7.field_1352) ** GOTO lbl33
                if (var12_4) ** GOTO lbl6
                v0 = ns.lpst("lrdu", lpsq(int ), (int)694);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl35
lbl33:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v0 = var5_8 = ns.lpst("lrdv", lpsq(int ), (int)695);
lbl35:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var1_1.field_1351 == var4_7.field_1351) ** GOTO lbl42
                if (var12_4) ** GOTO lbl6
                v1 = ns.lpst("lrdw", lpsq(int ), (int)696);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl44
lbl42:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v1 = var6_9 = ns.lpst("lrdx", lpsq(int ), (int)697);
lbl44:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var1_1.field_1350 == var4_7.field_1350) ** GOTO lbl51
                if (var12_4) ** GOTO lbl6
                v2 = ns.lpst("lrdy", lpsq(int ), (int)698);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl53
lbl51:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v2 = var7_10 = ns.lpst("lrdz", lpsq(int ), (int)699);
lbl53:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (this.onGround) ** GOTO lbl60
                if (var12_4) ** GOTO lbl6
                if (var6_9 == false) ** GOTO lbl65
                if (var12_4) ** GOTO lbl6
                if (!(var1_1.field_1351 < 0.0)) ** GOTO lbl65
                if (var12_4) ** GOTO lbl6
lbl60:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v3 = ns.lpst("lrea", lpsq(int ), (int)700);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl67
lbl65:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v3 = var8_11 = ns.lpst("lreb", lpsq(int ), (int)701);
lbl67:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (!(this.player.method_49476() > 0.0f)) ** GOTO lbl93
                if (var12_4) ** GOTO lbl6
                if (var8_11 == false) ** GOTO lbl93
                if (var12_4) ** GOTO lbl6
                if (var5_8 != false) ** GOTO lbl76
                if (var12_4) ** GOTO lbl6
                if (var7_10 == false) ** GOTO lbl93
                if (var12_4) ** GOTO lbl6
lbl76:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                var9_12 = class_1297.method_20736((class_1297)this.player, (class_243)new class_243(var1_1.field_1352, (double)this.player.method_49476(), var1_1.field_1350), (class_238)var2_5, (class_1937)this.player.method_73183(), var3_6);
                if (var12_4 || var12_4) ** GOTO lbl6
                var10_13 = class_1297.method_20736((class_1297)this.player, (class_243)new class_243(0.0, (double)this.player.method_49476(), 0.0), (class_238)var2_5.method_1012(var1_1.field_1352, 0.0, var1_1.field_1350), (class_1937)this.player.method_73183(), var3_6);
                if (var12_4 || var12_4) ** GOTO lbl6
                var11_14 = class_1297.method_20736((class_1297)this.player, (class_243)new class_243(var1_1.field_1352, 0.0, var1_1.field_1350), (class_238)var2_5.method_997(var10_13), (class_1937)this.player.method_73183(), var3_6).method_1019(var10_13);
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!(var10_13.field_1351 < (double)this.player.method_49476())) ** GOTO lbl89
                if (var12_4) ** GOTO lbl6
                if (!(var11_14.method_37268() > var9_12.method_37268())) ** GOTO lbl89
                if (var12_4 || var12_4) ** GOTO lbl6
                var9_12 = var11_14;
                if (var12_4) ** GOTO lbl6
lbl89:
                // 3 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (!(var9_12.method_37268() > var4_7.method_37268())) ** GOTO lbl93
                if (var12_4 || var12_4) ** GOTO lbl6
                return var9_12.method_1019(class_1297.method_20736((class_1297)this.player, (class_243)new class_243(0.0, -var9_12.field_1351 + var1_1.field_1351, 0.0), (class_238)var2_5.method_997(var9_12), (class_1937)this.player.method_73183(), var3_6));
lbl93:
                // 4 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return var4_7;
            }
lbl96:
            // 2 sources

            case 0: {
                var13_3 /* !! */  = (int)ns.lpst("lrec", lpsq(int ), (int)702);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl101:
            // 2 sources

            case 1: {
                var13_3 /* !! */  = (int)ns.lpst("lred", lpsq(int ), (int)703);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl106:
            // 3 sources

            case 2: {
                var13_3 /* !! */  = (int)ns.lpst("lree", lpsq(int ), (int)704);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl111:
            // 2 sources

            case 3: {
                var13_3 /* !! */  = (int)ns.lpst("lref", lpsq(int ), (int)705);
                if (!var14_2) ** GOTO lbl106
                throw null;
            }
lbl115:
            // 3 sources

            case 4: {
                var13_3 /* !! */  = (int)ns.lpst("lreg", lpsq(int ), (int)706);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 5: {
                var13_3 /* !! */  = (int)ns.lpst("lreh", lpsq(int ), (int)707);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl125:
            // 2 sources

            case 6: {
                var13_3 /* !! */  = (int)ns.lpst("lrei", lpsq(int ), (int)708);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl130:
            // 3 sources

            case 7: {
                var13_3 /* !! */  = (int)ns.lpst("lrej", lpsq(int ), (int)709);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 8: {
                var13_3 /* !! */  = (int)ns.lpst("lrek", lpsq(int ), (int)710);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl140:
            // 2 sources

            case 9: {
                var13_3 /* !! */  = (int)ns.lpst("lrel", lpsq(int ), (int)711);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl145:
            // 2 sources

            case 10: {
                var13_3 /* !! */  = (int)ns.lpst("lrem", lpsq(int ), (int)712);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl150:
            // 2 sources

            case 11: {
                var13_3 /* !! */  = (int)ns.lpst("lren", lpsq(int ), (int)713);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl155:
            // 2 sources

            case 12: {
                var13_3 /* !! */  = (int)ns.lpst("lreo", lpsq(int ), (int)714);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl160:
            // 2 sources

            case 13: {
                var13_3 /* !! */  = (int)ns.lpst("lrep", lpsq(int ), (int)715);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl165:
            // 2 sources

            case 14: {
                do {
                    var13_3 /* !! */  = (int)ns.lpst("lreq", lpsq(int ), (int)716);
                } while (!var14_2);
                throw null;
            }
lbl170:
            // 2 sources

            case 15: {
                var13_3 /* !! */  = (int)ns.lpst("lrer", lpsq(int ), (int)717);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl175:
            // 2 sources

            case 16: {
                var13_3 /* !! */  = (int)ns.lpst("lres", lpsq(int ), (int)718);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl180:
            // 3 sources

            case 17: {
                var13_3 /* !! */  = (int)ns.lpst("lret", lpsq(int ), (int)719);
                if (!var14_2) ** GOTO lbl140
                throw null;
            }
lbl184:
            // 2 sources

            case 18: {
                var13_3 /* !! */  = (int)ns.lpst("lreu", lpsq(int ), (int)720);
                if (!var14_2) ** GOTO lbl160
                throw null;
            }
            case 19: {
                var13_3 /* !! */  = (int)ns.lpst("lrev", lpsq(int ), (int)721);
                if (!var14_2) ** GOTO lbl130
                throw null;
            }
lbl192:
            // 2 sources

            case 20: {
                var13_3 /* !! */  = (int)ns.lpst("lrew", lpsq(int ), (int)722);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl197:
            // 3 sources

            case 21: {
                var13_3 /* !! */  = (int)ns.lpst("lrex", lpsq(int ), (int)723);
                if (!var14_2) ** GOTO lbl125
                throw null;
            }
            case 22: {
                var13_3 /* !! */  = (int)ns.lpst("lrey", lpsq(int ), (int)724);
                if (!var14_2) ** GOTO lbl150
                throw null;
            }
lbl205:
            // 2 sources

            case 23: {
                var13_3 /* !! */  = (int)ns.lpst("lrez", lpsq(int ), (int)725);
                if (!var14_2) ** GOTO lbl165
                throw null;
            }
lbl209:
            // 2 sources

            case 24: {
                var13_3 /* !! */  = (int)ns.lpst("lrfa", lpsq(int ), (int)726);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 25: {
                var13_3 /* !! */  = (int)ns.lpst("lrfb", lpsq(int ), (int)727);
                if (!var14_2) ** GOTO lbl130
                throw null;
            }
lbl218:
            // 2 sources

            case 26: {
                var13_3 /* !! */  = (int)ns.lpst("lrfc", lpsq(int ), (int)728);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 27: {
                var13_3 /* !! */  = (int)ns.lpst("lrfd", lpsq(int ), (int)729);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 28: {
                var13_3 /* !! */  = (int)ns.lpst("lrfe", lpsq(int ), (int)730);
                if (!var14_2) ** GOTO lbl205
                throw null;
            }
            case 29: {
                var13_3 /* !! */  = (int)ns.lpst("lrff", lpsq(int ), (int)731);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl237:
            // 2 sources

            case 30: {
                var13_3 /* !! */  = (int)ns.lpst("lrfg", lpsq(int ), (int)732);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl242:
            // 2 sources

            case 31: {
                var13_3 /* !! */  = (int)ns.lpst("lrfh", lpsq(int ), (int)733);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl247:
            // 2 sources

            case 32: {
                var13_3 /* !! */  = (int)ns.lpst("lrfi", lpsq(int ), (int)734);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 33: {
                var13_3 /* !! */  = (int)ns.lpst("lrfj", lpsq(int ), (int)735);
                if (!var14_2) ** GOTO lbl180
                throw null;
            }
lbl256:
            // 2 sources

            case 34: {
                var13_3 /* !! */  = (int)ns.lpst("lrfk", lpsq(int ), (int)736);
                if (var14_2) {
                    throw null;
                }
            }
lbl260:
            // 4 sources

            case 35: {
                var13_3 /* !! */  = (int)ns.lpst("lrfl", lpsq(int ), (int)737);
                if (!var14_2) ** GOTO lbl180
                throw null;
            }
lbl264:
            // 2 sources

            case 36: {
                var13_3 /* !! */  = (int)ns.lpst("lrfm", lpsq(int ), (int)738);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl269:
            // 2 sources

            case 37: {
                var13_3 /* !! */  = (int)ns.lpst("lrfn", lpsq(int ), (int)739);
                if (!var14_2) ** GOTO lbl115
                throw null;
            }
            case 38: {
                var13_3 /* !! */  = (int)ns.lpst("lrfo", lpsq(int ), (int)740);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl278:
            // 5 sources

            case 39: {
                var13_3 /* !! */  = (int)ns.lpst("lrfp", lpsq(int ), (int)741);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl283:
            // 2 sources

            case 40: {
                var13_3 /* !! */  = (int)ns.lpst("lrfq", lpsq(int ), (int)742);
                if (!var14_2) ** GOTO lbl242
                throw null;
            }
lbl287:
            // 2 sources

            case 41: {
                var13_3 /* !! */  = (int)ns.lpst("lrfr", lpsq(int ), (int)743);
                if (!var14_2) ** GOTO lbl111
                throw null;
            }
lbl291:
            // 2 sources

            case 42: {
                var13_3 /* !! */  = (int)ns.lpst("lrfs", lpsq(int ), (int)744);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl386
            }
            case 43: {
                var13_3 /* !! */  = (int)ns.lpst("lrft", lpsq(int ), (int)745);
                if (!var14_2) ** GOTO lbl96
                throw null;
            }
lbl300:
            // 2 sources

            case 44: {
                var13_3 /* !! */  = (int)ns.lpst("lrfu", lpsq(int ), (int)746);
                if (!var14_2) ** GOTO lbl197
                throw null;
            }
lbl304:
            // 2 sources

            case 45: {
                var13_3 /* !! */  = (int)ns.lpst("lrfv", lpsq(int ), (int)747);
                if (!var14_2) ** GOTO lbl106
                throw null;
            }
            case 46: {
                var13_3 /* !! */  = (int)ns.lpst("lrfw", lpsq(int ), (int)748);
                if (!var14_2) ** GOTO lbl115
                throw null;
            }
            case 47: {
                var13_3 /* !! */  = (int)ns.lpst("lrfx", lpsq(int ), (int)749);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl317:
            // 2 sources

            case 48: {
                var13_3 /* !! */  = (int)ns.lpst("lrfy", lpsq(int ), (int)750);
                if (!var14_2) ** GOTO lbl192
                throw null;
            }
            case 49: {
                var13_3 /* !! */  = (int)ns.lpst("lrfz", lpsq(int ), (int)751);
                if (!var14_2) ** GOTO lbl278
                throw null;
            }
lbl325:
            // 2 sources

            case 50: {
                var13_3 /* !! */  = (int)ns.lpst("lrga", lpsq(int ), (int)752);
                if (!var14_2) ** GOTO lbl197
                throw null;
            }
lbl329:
            // 2 sources

            case 51: {
                var13_3 /* !! */  = (int)ns.lpst("lrgb", lpsq(int ), (int)753);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl334:
            // 3 sources

            case 52: {
                var13_3 /* !! */  = (int)ns.lpst("lrgc", lpsq(int ), (int)754);
                if (!var14_2) ** GOTO lbl247
                throw null;
            }
lbl338:
            // 3 sources

            case 53: {
                var13_3 /* !! */  = (int)ns.lpst("lrgd", lpsq(int ), (int)755);
                if (!var14_2) ** GOTO lbl145
                throw null;
            }
            case 54: {
                var13_3 /* !! */  = (int)ns.lpst("lrge", lpsq(int ), (int)756);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl347:
            // 2 sources

            case 55: {
                do {
                    var13_3 /* !! */  = (int)ns.lpst("lrgf", lpsq(int ), (int)757);
                } while (!var14_2);
                throw null;
            }
lbl352:
            // 3 sources

            case 56: {
                do {
                    var13_3 /* !! */  = (int)ns.lpst("lrgg", lpsq(int ), (int)758);
                } while (!var14_2);
                throw null;
            }
lbl357:
            // 2 sources

            case 57: {
                var13_3 /* !! */  = (int)ns.lpst("lrgh", lpsq(int ), (int)759);
                if (!var14_2) ** GOTO lbl329
                throw null;
            }
lbl361:
            // 2 sources

            case 58: {
                var13_3 /* !! */  = (int)ns.lpst("lrgi", lpsq(int ), (int)760);
                if (!var14_2) ** GOTO lbl334
                throw null;
            }
            case 59: {
                var13_3 /* !! */  = (int)ns.lpst("lrgj", lpsq(int ), (int)761);
                if (!var14_2) ** GOTO lbl278
                throw null;
            }
lbl369:
            // 2 sources

            case 60: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)ns.lpst("lrgk", lpsq(int ), (int)762);
                    if (!var14_2) ** GOTO lbl209
                    throw null;
                }
            }
lbl374:
            // 2 sources

            case 61: {
                var13_3 /* !! */  = (int)ns.lpst("lrgl", lpsq(int ), (int)763);
                if (!var14_2) ** GOTO lbl155
                throw null;
            }
            case 62: {
                var13_3 /* !! */  = (int)ns.lpst("lrgm", lpsq(int ), (int)764);
                if (var14_2) {
                    throw null;
                }
            }
            case 63: {
                var13_3 /* !! */  = (int)ns.lpst("lrgn", lpsq(int ), (int)765);
                if (!var14_2) break;
                throw null;
            }
lbl386:
            // 3 sources

            case 64: {
                var13_3 /* !! */  = (int)ns.lpst("lrgo", lpsq(int ), (int)766);
                if (!var14_2) ** GOTO lbl101
                throw null;
            }
            case 65: 
        }
        var13_3 /* !! */  = (int)ns.lpst("lrgp", lpsq(int ), (int)767);
        ** while (!var14_2)
lbl393:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ns fromClientPlayer(ns$SimulatedPlayerInput var0) {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block86: while (true) {
            v0 /* !! */  = (long)(ns.lpst("lpxg", lptv(int ), (int)32) - ns.lpst("lpxf", lptv(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 304457984: {
                    break block86;
                }
                case 323944472: {
                    continue block86;
                }
            }
            break;
        }
        var4_1 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lpxh", lptv(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("lpxi", lpsq(int ), (int)81)) break;
            v1 /* !! */  = (long)ns.lpst("lpxj", lpsq(int ), (int)82);
        }
        var3_2 /* !! */  = ns.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lpxk", lptv(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns.lpst("lpxl", lpsq(int ), (int)83)) break;
            v2 /* !! */  = (long)ns.lpst("lpxm", lpsq(int ), (int)84);
        }
        var2_3 = ns.a;
        if (var4_1) {
            throw null;
lbl25:
            // 2 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl25
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lpxn", lptv(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ns.lpst("lpxo", lpsq(int ), (int)85)) break;
                    v3 /* !! */  = (long)ns.lpst("lpxp", lpsq(int ), (int)86);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lpxq", lptv(int ), (int)36)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ns.lpst("lpxr", lpsq(int ), (int)87)) break;
                    v4 /* !! */  = (long)ns.lpst("lpxs", lpsq(int ), (int)88);
                }
                var1_4 = ns.mc.field_1724;
                if (var2_3 || var2_3) ** continue;
                v5 /* !! */  = ns.uk;
                if (true) ** GOTO lbl47
                block92: while (true) {
                    v5 /* !! */  = (long)(v6 - ns.lpst("lpxt", lptv(int ), (int)37));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -317201485: {
                            v6 = ns.lpst("lpxu", lptv(int ), (int)38);
                            continue block92;
                        }
                        case 304457984: {
                            break block92;
                        }
                        case 1507853928: {
                            v6 = ns.lpst("lpxv", lptv(int ), (int)39);
                            continue block92;
                        }
                        case 1661297142: {
                            v6 = ns.lpst("lpxw", lptv(int ), (int)40);
                            continue block92;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ns.uk;
                if (true) ** GOTO lbl63
                block93: while (true) {
                    v7 /* !! */  = (long)(v8 - ns.lpst("lpxx", lptv(int ), (int)41));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1825667729: {
                            v8 = ns.lpst("lpxy", lptv(int ), (int)42);
                            continue block93;
                        }
                        case -1490039798: {
                            v8 = ns.lpst("lpxz", lptv(int ), (int)43);
                            continue block93;
                        }
                        case 304457984: {
                            break block93;
                        }
                    }
                    break;
                }
                v9 = var1_4.method_73189();
                v10 /* !! */  = ns.uk;
                if (true) ** GOTO lbl77
                block94: while (true) {
                    v10 /* !! */  = (long)(v11 - ns.lpst("lpya", lptv(int ), (int)44));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2033563473: {
                            v11 = ns.lpst("lpyb", lptv(int ), (int)45);
                            continue block94;
                        }
                        case -279592093: {
                            v11 = ns.lpst("lpyc", lptv(int ), (int)46);
                            continue block94;
                        }
                        case 304457984: {
                            break block94;
                        }
                    }
                    break;
                }
                v12 = var1_4.method_18798();
                v13 /* !! */  = ns.uk;
                if (true) ** GOTO lbl91
                block95: while (true) {
                    v13 /* !! */  = (long)(v14 - ns.lpst("lpyd", lptv(int ), (int)47));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -891116401: {
                            v14 = ns.lpst("lpye", lptv(int ), (int)48);
                            continue block95;
                        }
                        case 304457984: {
                            break block95;
                        }
                        case 1033921450: {
                            v14 = ns.lpst("lpyf", lptv(int ), (int)49);
                            continue block95;
                        }
                        case 2124622690: {
                            v14 = ns.lpst("lpyg", lptv(int ), (int)50);
                            continue block95;
                        }
                    }
                    break;
                }
                v15 = var1_4.method_5829();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lpyh", lptv(int ), (int)51)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ns.lpst("lpyi", lpsq(int ), (int)89)) break;
                    v16 /* !! */  = (long)ns.lpst("lpyj", lpsq(int ), (int)90);
                }
                v17 = var1_4.method_36454();
                v18 /* !! */  = ns.uk;
                if (true) ** GOTO lbl114
                block97: while (true) {
                    v18 /* !! */  = (long)(ns.lpst("lpyl", lptv(int ), (int)53) - ns.lpst("lpyk", lptv(int ), (int)52));
lbl114:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -69122651: {
                            continue block97;
                        }
                        case 304457984: {
                            break block97;
                        }
                    }
                    break;
                }
                v19 = var1_4.method_36455();
                v20 /* !! */  = ns.uk;
                if (true) ** GOTO lbl124
                block98: while (true) {
                    v20 /* !! */  = (long)(ns.lpst("lpyn", lptv(int ), (int)55) - ns.lpst("lpym", lptv(int ), (int)54));
lbl124:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -209387067: {
                            continue block98;
                        }
                        case 304457984: {
                            break block98;
                        }
                    }
                    break;
                }
                v21 = var1_4.method_5624();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lpyo", lptv(int ), (int)56)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ns.lpst("lpyp", lpsq(int ), (int)91)) break;
                    v22 /* !! */  = (long)ns.lpst("lpyq", lpsq(int ), (int)92);
                }
                v23 = (float)var1_4.field_6017;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lpyr", lptv(int ), (int)57)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ns.lpst("lpys", lpsq(int ), (int)93)) break;
                    v24 /* !! */  = (long)ns.lpst("lpyt", lpsq(int ), (int)94);
                }
                v25 = var1_4.field_6228;
                v26 /* !! */  = ns.uk;
                if (true) ** GOTO lbl146
                block101: while (true) {
                    v26 /* !! */  = (long)(v27 - ns.lpst("lpyu", lptv(int ), (int)58));
lbl146:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1543584893: {
                            v27 = ns.lpst("lpyv", lptv(int ), (int)59);
                            continue block101;
                        }
                        case 17903862: {
                            v27 = ns.lpst("lpyw", lptv(int ), (int)60);
                            continue block101;
                        }
                        case 304457984: {
                            break block101;
                        }
                        case 2016460985: {
                            v27 = ns.lpst("lpyx", lptv(int ), (int)61);
                            continue block101;
                        }
                    }
                    break;
                }
                v28 = var1_4.field_6282;
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lpyy", lptv(int ), (int)62)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ns.lpst("lpyz", lpsq(int ), (int)95)) break;
                    v29 /* !! */  = (long)ns.lpst("lpza", lpsq(int ), (int)96);
                }
                v30 = var1_4.method_6128();
                v31 /* !! */  = ns.uk;
                if (true) ** GOTO lbl169
                block103: while (true) {
                    v31 /* !! */  = (long)(ns.lpst("lpzc", lptv(int ), (int)64) - ns.lpst("lpzb", lptv(int ), (int)63));
lbl169:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1126021071: {
                            continue block103;
                        }
                        case 304457984: {
                            break block103;
                        }
                    }
                    break;
                }
                v32 = var1_4.method_24828();
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("lpzd", lptv(int ), (int)65)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ns.lpst("lpze", lpsq(int ), (int)97)) break;
                    v33 /* !! */  = (long)ns.lpst("lpzf", lpsq(int ), (int)98);
                }
                v34 = var1_4.field_5976;
                v35 /* !! */  = ns.uk;
                if (true) ** GOTO lbl185
                block105: while (true) {
                    v35 /* !! */  = (long)(v36 - ns.lpst("lpzg", lptv(int ), (int)66));
lbl185:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1092042320: {
                            v36 = ns.lpst("lpzh", lptv(int ), (int)67);
                            continue block105;
                        }
                        case 144808426: {
                            v36 = ns.lpst("lpzi", lptv(int ), (int)68);
                            continue block105;
                        }
                        case 304457984: {
                            break block105;
                        }
                    }
                    break;
                }
                v37 = var1_4.field_5992;
                v38 /* !! */  = ns.uk;
                if (true) ** GOTO lbl199
                block106: while (true) {
                    v38 /* !! */  = (long)(ns.lpst("lpzk", lptv(int ), (int)70) - ns.lpst("lpzj", lptv(int ), (int)69));
lbl199:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case 304457984: {
                            break block106;
                        }
                        case 451874806: {
                            continue block106;
                        }
                    }
                    break;
                }
                v39 = var1_4.method_5799();
                v40 /* !! */  = ns.uk;
                if (true) ** GOTO lbl209
                block107: while (true) {
                    v40 /* !! */  = (long)(v41 - ns.lpst("lpzl", lptv(int ), (int)71));
lbl209:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case 155561720: {
                            v41 = ns.lpst("lpzm", lptv(int ), (int)72);
                            continue block107;
                        }
                        case 304457984: {
                            break block107;
                        }
                        case 1805497548: {
                            v41 = ns.lpst("lpzn", lptv(int ), (int)73);
                            continue block107;
                        }
                    }
                    break;
                }
                v42 = var1_4.method_5681();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_9 = ns.uk - ns.lpst("lpzo", lptv(int ), (int)74)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ns.lpst("lpzp", lpsq(int ), (int)99)) break;
                    v43 /* !! */  = (long)ns.lpst("lpzq", lpsq(int ), (int)100);
                }
                v44 = var1_4.method_5869();
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_10 = ns.uk - ns.lpst("lpzr", lptv(int ), (int)75)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == ns.lpst("lpzs", lpsq(int ), (int)101)) break;
                    v45 /* !! */  = (long)ns.lpst("lpzt", lpsq(int ), (int)102);
                }
                v46 /* !! */  = ns.uk;
                if (true) ** GOTO lbl234
                block110: while (true) {
                    v46 /* !! */  = (long)(v47 - ns.lpst("lpzu", lptv(int ), (int)76));
lbl234:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case 304457984: {
                            break block110;
                        }
                        case 1206520404: {
                            v47 = ns.lpst("lpzv", lptv(int ), (int)77);
                            continue block110;
                        }
                        case 1776954274: {
                            v47 = ns.lpst("lpzw", lptv(int ), (int)78);
                            continue block110;
                        }
                    }
                    break;
                }
                v48 = var1_4.field_5964;
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_11 = ns.uk - ns.lpst("lpzx", lptv(int ), (int)79)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == ns.lpst("lpzy", lpsq(int ), (int)103)) break;
                    v49 /* !! */  = (long)ns.lpst("lpzz", lpsq(int ), (int)104);
                }
                v50 = new Object2DoubleArrayMap(v48);
                v51 /* !! */  = ns.uk;
                if (true) ** GOTO lbl254
                block112: while (true) {
                    v51 /* !! */  = (long)(ns.lpst("lqab", lptv(int ), (int)81) - ns.lpst("lqaa", lptv(int ), (int)80));
lbl254:
                    // 2 sources

                    switch ((int)v51 /* !! */ ) {
                        case 304457984: {
                            break block112;
                        }
                        case 943746204: {
                            continue block112;
                        }
                    }
                    break;
                }
                v52 /* !! */  = ns.uk;
                if (true) ** GOTO lbl263
                block113: while (true) {
                    v52 /* !! */  = (long)(v53 - ns.lpst("lqac", lptv(int ), (int)82));
lbl263:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -1479341144: {
                            v53 = ns.lpst("lqad", lptv(int ), (int)83);
                            continue block113;
                        }
                        case -763396816: {
                            v53 = ns.lpst("lqae", lptv(int ), (int)84);
                            continue block113;
                        }
                        case 304457984: {
                            break block113;
                        }
                        case 1665102027: {
                            v53 = ns.lpst("lqaf", lptv(int ), (int)85);
                            continue block113;
                        }
                    }
                    break;
                }
                v54 = var1_4.field_25599;
                v55 /* !! */  = ns.uk;
                if (true) ** GOTO lbl280
                block114: while (true) {
                    v55 /* !! */  = (long)(v56 - ns.lpst("lqag", lptv(int ), (int)86));
lbl280:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case 304457984: {
                            break block114;
                        }
                        case 1032549207: {
                            v56 = ns.lpst("lqah", lptv(int ), (int)87);
                            continue block114;
                        }
                        case 1992871871: {
                            v56 = ns.lpst("lqai", lptv(int ), (int)88);
                            continue block114;
                        }
                    }
                    break;
                }
                v57 = new HashSet<class_6862<class_3611>>(v54);
                while (true) {
                    if ((v58 /* !! */  = (cfr_temp_12 = ns.uk - ns.lpst("lqaj", lptv(int ), (int)89)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v58 /* !! */  == ns.lpst("lqak", lpsq(int ), (int)105)) break;
                    v58 /* !! */  = (long)ns.lpst("lqal", lpsq(int ), (int)106);
                }
                return new ns((class_1657)var1_4, var0, v9, v12, v15, v17, v19, v21, v23, v25, v28, v30, v32, v34, v37, v39, v42, v44, (Object2DoubleMap<class_6862<class_3611>>)v50, v57);
            }
lbl296:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ns.lpst("lqam", lpsq(int ), (int)107);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl301:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)ns.lpst("lqan", lpsq(int ), (int)108);
                if (!var4_1) break;
                throw null;
            }
lbl305:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ns.lpst("lqao", lpsq(int ), (int)109);
                if (!var4_1) ** GOTO lbl301
                throw null;
            }
lbl309:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)ns.lpst("lqap", lpsq(int ), (int)110);
                if (!var4_1) ** GOTO lbl296
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ns.lpst("lqaq", lpsq(int ), (int)111);
                    if (!var4_1) ** GOTO lbl305
                    throw null;
                }
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)ns.lpst("lqar", lpsq(int ), (int)112);
        ** while (!var4_1)
lbl321:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqf() {
        ns.lpsr[1000] = 957668189;
        ns.lpsr[1001] = -1641697128;
        ns.lpsr[1002] = 1248397349;
        ns.lpsr[1003] = 1547887605;
        ns.lpsr[1004] = 1822366112;
        ns.lpsr[1005] = 2143084595;
        ns.lpsr[1006] = -580441532;
        ns.lpsr[1007] = 1298997601;
        ns.lpsr[1008] = 1717358816;
        ns.lpsr[1009] = -1678764567;
        ns.lpsr[1010] = -864231987;
        ns.lpsr[1011] = 721528444;
        ns.lpsr[1012] = 2087890824;
        ns.lpsr[1013] = 286990232;
        ns.lpsr[1014] = -75038753;
        ns.lpsr[1015] = 726354194;
        ns.lpsr[1016] = -1798231026;
        ns.lpsr[1017] = -562731211;
        ns.lpsr[1018] = -1438623749;
        ns.lpsr[1019] = 1254390710;
        ns.lpsr[1020] = 1021758273;
        ns.lpsr[1021] = -1633925619;
        ns.lpsr[1022] = 1076181148;
        ns.lpsr[1023] = -730047968;
        ns.lpsr[1024] = -919853183;
        ns.lpsr[1025] = -763190706;
        ns.lpsr[1026] = -1694038949;
        ns.lpsr[1027] = -78210433;
        ns.lpsr[1028] = 1661732344;
        ns.lpsr[1029] = 1146800058;
        ns.lpsr[1030] = 1334687526;
        ns.lpsr[1031] = 2037018253;
        ns.lpsr[1032] = -325438771;
        ns.lpsr[1033] = -1702665032;
        ns.lpsr[1034] = -267787807;
        ns.lpsr[1035] = -893100976;
        ns.lpsr[1036] = -44547733;
        ns.lpsr[1037] = -608887923;
        ns.lpsr[1038] = 1891196733;
        ns.lpsr[1039] = -1132506851;
        ns.lpsr[1040] = -816267273;
        ns.lpsr[1041] = -164600580;
        ns.lpsr[1042] = 18263183;
        ns.lpsr[1043] = 2070640531;
        ns.lpsr[1044] = -1636374778;
        ns.lpsr[1045] = 940198863;
        ns.lpsr[1046] = -1955888376;
        ns.lpsr[1047] = -647909349;
        ns.lpsr[1048] = 1501555484;
        ns.lpsr[1049] = 252684108;
        ns.lpsr[1050] = 350199224;
        ns.lpsr[1051] = -2056217075;
        ns.lpsr[1052] = -1053419482;
        ns.lpsr[1053] = 1385106026;
        ns.lpsr[1054] = 2127643770;
        ns.lpsr[1055] = -896236736;
        ns.lpsr[1056] = -1406868870;
        ns.lpsr[1057] = -1046695801;
        ns.lpsr[1058] = -115884353;
        ns.lpsr[1059] = 758533734;
        ns.lpsr[1060] = -2103104908;
        ns.lpsr[1061] = -105448990;
        ns.lpsr[1062] = 1750474899;
        ns.lpsr[1063] = -812295547;
        ns.lpsr[1064] = -853911485;
        ns.lpsr[1065] = 635200025;
        ns.lpsr[1066] = 510977100;
        ns.lpsr[1067] = 1000778588;
        ns.lpsr[1068] = 496558881;
        ns.lpsr[1069] = 1508020174;
        ns.lpsr[1070] = 1298960250;
        ns.lpsr[1071] = -1230327087;
        ns.lpsr[1072] = 1728127020;
        ns.lpsr[1073] = -1035696698;
        ns.lpsr[1074] = -287844464;
        ns.lpsr[1075] = 895322656;
        ns.lpsr[1076] = 1980271043;
        ns.lpsr[1077] = 867076580;
        ns.lpsr[1078] = -808757555;
        ns.lpsr[1079] = -1265239064;
        ns.lpsr[1080] = -1279481789;
        ns.lpsr[1081] = -969604458;
        ns.lpsr[1082] = -431696712;
        ns.lpsr[1083] = -921722266;
        ns.lpsr[1084] = 1909875102;
        ns.lpsr[1085] = 1830068360;
        ns.lpsr[1086] = 752644745;
        ns.lpsr[1087] = -856369172;
        ns.lpsr[1088] = -1744140806;
        ns.lpsr[1089] = 1306292249;
        ns.lpsr[1090] = -182884498;
        ns.lpsr[1091] = -1184220852;
        ns.lpsr[1092] = -228752382;
        ns.lpsr[1093] = 408578142;
        ns.lpsr[1094] = 1587175593;
        ns.lpsr[1095] = 663880333;
        ns.lpsr[1096] = 1265516829;
        ns.lpsr[1097] = 863602025;
        ns.lpsr[1098] = 638706177;
        ns.lpsr[1099] = 257012545;
    }

    private static /* synthetic */ void ltrv() {
        ns.lptx[600] = 4776783381917398575L;
        ns.lptx[601] = -5575360322708988802L;
        ns.lptx[602] = 9178403315812604654L;
        ns.lptx[603] = -8733547192213071625L;
        ns.lptx[604] = -2420632353119749677L;
        ns.lptx[605] = 6234477673753055438L;
        ns.lptx[606] = -134946907816889349L;
        ns.lptx[607] = -8194372562333275342L;
        ns.lptx[608] = 386448088096809847L;
        ns.lptx[609] = 5929142446110778890L;
        ns.lptx[610] = -3489298504081293278L;
        ns.lptx[611] = 2216376726022759122L;
        ns.lptx[612] = 197650740545140659L;
        ns.lptx[613] = -8123144261160104506L;
        ns.lptx[614] = -446354448602691863L;
        ns.lptx[615] = -7397675448216465425L;
        ns.lptx[616] = -3524945022891252920L;
        ns.lptx[617] = 1499149635636056868L;
        ns.lptx[618] = 3859450556654858552L;
        ns.lptx[619] = 2873176663020762645L;
        ns.lptx[620] = -2426766804127685974L;
        ns.lptx[621] = 8200423591209321229L;
        ns.lptx[622] = -6683380043780807814L;
        ns.lptx[623] = -6715774452852614400L;
        ns.lptx[624] = -6012399074067205585L;
        ns.lptx[625] = 4370815691072153034L;
        ns.lptx[626] = 2921027789924136638L;
        ns.lptx[627] = 4047465981149728754L;
        ns.lptx[628] = -8582826451422764936L;
        ns.lptx[629] = -6098822601755149023L;
        ns.lptx[630] = 129254923509885084L;
        ns.lptx[631] = -5768534172409348377L;
        ns.lptx[632] = -1419095590108408848L;
        ns.lptx[633] = 4881538619987563308L;
        ns.lptx[634] = 2540483953270921343L;
        ns.lptx[635] = 3082842653559171410L;
        ns.lptx[636] = 2422440259715460233L;
        ns.lptx[637] = 2211218292924883268L;
        ns.lptx[638] = 3798716915152045450L;
        ns.lptx[639] = 6703835402028480108L;
        ns.lptx[640] = -1500945939301716374L;
        ns.lptx[641] = 1038221417409996824L;
        ns.lptx[642] = 4343323881270740500L;
        ns.lptx[643] = 6503419789555487983L;
        ns.lptx[644] = 6958101701232351988L;
        ns.lptx[645] = -5943677305439387477L;
        ns.lptx[646] = 2055128304623050841L;
        ns.lptx[647] = 6992928763669709908L;
        ns.lptx[648] = 7367065529022327362L;
        ns.lptx[649] = 3376749214693005309L;
        ns.lptx[650] = 3932555014808894893L;
        ns.lptx[651] = 1943054803453913871L;
        ns.lptx[652] = -268663439963171111L;
        ns.lptx[653] = -2602336939095755671L;
        ns.lptx[654] = 434340595435315495L;
        ns.lptx[655] = -5060086808146638902L;
        ns.lptx[656] = 3105005655230509287L;
        ns.lptx[657] = 1537745614261131001L;
        ns.lptx[658] = 4940936573388462811L;
        ns.lptx[659] = -4789823204177517919L;
        ns.lptx[660] = -246394342083374620L;
        ns.lptx[661] = -5126488371202210173L;
        ns.lptx[662] = 916903136223708812L;
        ns.lptx[663] = 805008405514976910L;
        ns.lptx[664] = -8856194630249942837L;
        ns.lptx[665] = -8738736543043364125L;
        ns.lptx[666] = 1171085303129272465L;
        ns.lptx[667] = -1549631748326048245L;
        ns.lptx[668] = -8350478937642037935L;
        ns.lptx[669] = -7069953556269286734L;
        ns.lptx[670] = 5297760623023632740L;
        ns.lptx[671] = 763345683985780826L;
        ns.lptx[672] = 3062289681533214635L;
        ns.lptx[673] = -6757388696907383286L;
        ns.lptx[674] = 4632713126120612364L;
        ns.lptx[675] = 1649020859054296359L;
        ns.lptx[676] = -6199744709830161510L;
        ns.lptx[677] = 4348753869807672721L;
        ns.lptx[678] = 4657404572865063610L;
        ns.lptx[679] = 3778180054679210071L;
        ns.lptx[680] = 8774501284496846196L;
        ns.lptx[681] = 6441846886774593944L;
        ns.lptx[682] = -5026804255398976988L;
        ns.lptx[683] = -836405307777338753L;
        ns.lptx[684] = 3643211068865541486L;
        ns.lptx[685] = -4944571251596654621L;
        ns.lptx[686] = 2008006277676536874L;
        ns.lptx[687] = 9080068848115370475L;
        ns.lptx[688] = -1439844222584760604L;
        ns.lptx[689] = -5896829706677428093L;
        ns.lptx[690] = -8278573113051764430L;
        ns.lptx[691] = 5917809881647446054L;
        ns.lptx[692] = 8521727363954037341L;
        ns.lptx[693] = 3040947108977435216L;
        ns.lptx[694] = -618855154709527263L;
        ns.lptx[695] = -787285616189149604L;
        ns.lptx[696] = 2558201286439731659L;
        ns.lptx[697] = -2750501436734469026L;
        ns.lptx[698] = 3043349242605357259L;
        ns.lptx[699] = 3873434492414167062L;
    }

    private static /* synthetic */ void ltqq() {
        ns.lpss[300] = 1568204591;
        ns.lpss[301] = 1348456218;
        ns.lpss[302] = -1916578037;
        ns.lpss[303] = 1547690105;
        ns.lpss[304] = -690470130;
        ns.lpss[305] = 1996540503;
        ns.lpss[306] = 1326350468;
        ns.lpss[307] = -14196034;
        ns.lpss[308] = 557973646;
        ns.lpss[309] = -1282372058;
        ns.lpss[310] = -214772355;
        ns.lpss[311] = -2003904169;
        ns.lpss[312] = -1922028102;
        ns.lpss[313] = 1427996985;
        ns.lpss[314] = -1583215990;
        ns.lpss[315] = -737619232;
        ns.lpss[316] = 73737072;
        ns.lpss[317] = 34196295;
        ns.lpss[318] = -1372013829;
        ns.lpss[319] = -419152481;
        ns.lpss[320] = -1214826429;
        ns.lpss[321] = -1617995744;
        ns.lpss[322] = -173559710;
        ns.lpss[323] = 1167094453;
        ns.lpss[324] = -966115933;
        ns.lpss[325] = -2112325631;
        ns.lpss[326] = -1196712367;
        ns.lpss[327] = 1819951248;
        ns.lpss[328] = -1897845957;
        ns.lpss[329] = 554807593;
        ns.lpss[330] = 991843944;
        ns.lpss[331] = 1812637859;
        ns.lpss[332] = -382428006;
        ns.lpss[333] = -1240557908;
        ns.lpss[334] = -2095531890;
        ns.lpss[335] = 1040663641;
        ns.lpss[336] = -912194283;
        ns.lpss[337] = -228280186;
        ns.lpss[338] = -1978866819;
        ns.lpss[339] = 1730118982;
        ns.lpss[340] = 1804189162;
        ns.lpss[341] = 486342898;
        ns.lpss[342] = -365663868;
        ns.lpss[343] = 1861305503;
        ns.lpss[344] = 1530679976;
        ns.lpss[345] = -716369156;
        ns.lpss[346] = 1982238088;
        ns.lpss[347] = 495080940;
        ns.lpss[348] = 846311374;
        ns.lpss[349] = -1653637547;
        ns.lpss[350] = 1663487051;
        ns.lpss[351] = -1867247365;
        ns.lpss[352] = 1298208690;
        ns.lpss[353] = 1969937510;
        ns.lpss[354] = 1895577072;
        ns.lpss[355] = -1424947433;
        ns.lpss[356] = -317521500;
        ns.lpss[357] = -635098457;
        ns.lpss[358] = 942037950;
        ns.lpss[359] = 379869050;
        ns.lpss[360] = 1440761683;
        ns.lpss[361] = -1803422160;
        ns.lpss[362] = -112404957;
        ns.lpss[363] = -846375169;
        ns.lpss[364] = 1357661294;
        ns.lpss[365] = -167826289;
        ns.lpss[366] = -1424840964;
        ns.lpss[367] = 1979285275;
        ns.lpss[368] = -1020343154;
        ns.lpss[369] = -2129812004;
        ns.lpss[370] = -699991021;
        ns.lpss[371] = -1151739890;
        ns.lpss[372] = -1500701870;
        ns.lpss[373] = -106972149;
        ns.lpss[374] = 402724329;
        ns.lpss[375] = 2051560021;
        ns.lpss[376] = -674290997;
        ns.lpss[377] = 2000257921;
        ns.lpss[378] = -439527756;
        ns.lpss[379] = 316982114;
        ns.lpss[380] = -1053762533;
        ns.lpss[381] = 577992937;
        ns.lpss[382] = -1108492886;
        ns.lpss[383] = 2109241742;
        ns.lpss[384] = -1289388456;
        ns.lpss[385] = -1248217017;
        ns.lpss[386] = 353391232;
        ns.lpss[387] = -55927986;
        ns.lpss[388] = -1512259659;
        ns.lpss[389] = -534834868;
        ns.lpss[390] = -1476246227;
        ns.lpss[391] = 327075236;
        ns.lpss[392] = 1954055395;
        ns.lpss[393] = 540839148;
        ns.lpss[394] = -217135629;
        ns.lpss[395] = 754621913;
        ns.lpss[396] = 1491313332;
        ns.lpss[397] = 713766957;
        ns.lpss[398] = 1311037855;
        ns.lpss[399] = 979782248;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ns clone() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltjh", lptv(int ), (int)815)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("ltji", lpsq(int ), (int)1637)) break;
            v0 /* !! */  = (long)ns.lpst("ltjj", lpsq(int ), (int)1638);
        }
        var3_1 = ns.c;
        v1 /* !! */  = ns.uk;
        if (true) ** GOTO lbl11
        block80: while (true) {
            v1 /* !! */  = (long)(v2 - ns.lpst("ltjk", lptv(int ), (int)816));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -307723729: {
                    v2 = ns.lpst("ltjl", lptv(int ), (int)817);
                    continue block80;
                }
                case 304457984: {
                    break block80;
                }
                case 1093755405: {
                    v2 = ns.lpst("ltjm", lptv(int ), (int)818);
                    continue block80;
                }
                case 1447118755: {
                    v2 = ns.lpst("ltjn", lptv(int ), (int)819);
                    continue block80;
                }
            }
            break;
        }
        var2_2 = ns.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("ltjo", lptv(int ), (int)820)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ns.lpst("ltjp", lpsq(int ), (int)1639)) break;
            v3 /* !! */  = (long)ns.lpst("ltjq", lpsq(int ), (int)1640);
        }
        var1_3 = ns.a;
        if (var3_1) {
            throw null;
lbl32:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl35:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("ltjr", lptv(int ), (int)821)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ns.lpst("ltjs", lpsq(int ), (int)1641)) break;
            v4 /* !! */  = (long)ns.lpst("ltjt", lpsq(int ), (int)1642);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("ltju", lptv(int ), (int)822)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ns.lpst("ltjv", lpsq(int ), (int)1643)) break;
            v5 /* !! */  = (long)ns.lpst("ltjw", lpsq(int ), (int)1644);
        }
        v6 /* !! */  = ns.uk;
        if (true) ** GOTO lbl49
        block85: while (true) {
            v6 /* !! */  = (long)(v7 - ns.lpst("ltjx", lptv(int ), (int)823));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1664987719: {
                    v7 = ns.lpst("ltjy", lptv(int ), (int)824);
                    continue block85;
                }
                case -810313205: {
                    v7 = ns.lpst("ltjz", lptv(int ), (int)825);
                    continue block85;
                }
                case 304457984: {
                    break block85;
                }
                case 1087150862: {
                    v7 = ns.lpst("ltka", lptv(int ), (int)826);
                    continue block85;
                }
            }
            break;
        }
        v8 /* !! */  = ns.uk;
        if (true) ** GOTO lbl65
        block86: while (true) {
            v8 /* !! */  = (long)(ns.lpst("ltkc", lptv(int ), (int)828) - ns.lpst("ltkb", lptv(int ), (int)827));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 304457984: {
                    break block86;
                }
                case 431387663: {
                    continue block86;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("ltkd", lptv(int ), (int)829)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ns.lpst("ltke", lpsq(int ), (int)1645)) break;
            v9 /* !! */  = (long)ns.lpst("ltkf", lpsq(int ), (int)1646);
        }
        v10 /* !! */  = ns.uk;
        if (true) ** GOTO lbl79
        block88: while (true) {
            v10 /* !! */  = (long)(v11 - ns.lpst("ltkg", lptv(int ), (int)830));
lbl79:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2145011143: {
                    v11 = ns.lpst("ltkh", lptv(int ), (int)831);
                    continue block88;
                }
                case 89970984: {
                    v11 = ns.lpst("ltki", lptv(int ), (int)832);
                    continue block88;
                }
                case 304457984: {
                    break block88;
                }
                case 865741536: {
                    v11 = ns.lpst("ltkj", lptv(int ), (int)833);
                    continue block88;
                }
            }
            break;
        }
        v12 /* !! */  = ns.uk;
        if (true) ** GOTO lbl95
        block89: while (true) {
            v12 /* !! */  = (long)(ns.lpst("ltkl", lptv(int ), (int)835) - ns.lpst("ltkk", lptv(int ), (int)834));
lbl95:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1821602103: {
                    continue block89;
                }
                case 304457984: {
                    break block89;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("ltkm", lptv(int ), (int)836)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ns.lpst("ltkn", lpsq(int ), (int)1647)) break;
            v13 /* !! */  = (long)ns.lpst("ltko", lpsq(int ), (int)1648);
        }
        v14 /* !! */  = ns.uk;
        if (true) ** GOTO lbl109
        block91: while (true) {
            v14 /* !! */  = (long)(v15 - ns.lpst("ltkp", lptv(int ), (int)837));
lbl109:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1782090609: {
                    v15 = ns.lpst("ltkq", lptv(int ), (int)838);
                    continue block91;
                }
                case 304457984: {
                    break block91;
                }
                case 1234533243: {
                    v15 = ns.lpst("ltkr", lptv(int ), (int)839);
                    continue block91;
                }
                case 1781319716: {
                    v15 = ns.lpst("ltks", lptv(int ), (int)840);
                    continue block91;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("ltkt", lptv(int ), (int)841)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ns.lpst("ltku", lpsq(int ), (int)1649)) break;
            v16 /* !! */  = (long)ns.lpst("ltkv", lpsq(int ), (int)1650);
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("ltkw", lptv(int ), (int)842)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == ns.lpst("ltkx", lpsq(int ), (int)1651)) break;
            v17 /* !! */  = (long)ns.lpst("ltky", lpsq(int ), (int)1652);
        }
        v18 /* !! */  = ns.uk;
        if (true) ** GOTO lbl135
        block94: while (true) {
            v18 /* !! */  = (long)(ns.lpst("ltla", lptv(int ), (int)844) - ns.lpst("ltkz", lptv(int ), (int)843));
lbl135:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -921543502: {
                    continue block94;
                }
                case 304457984: {
                    break block94;
                }
            }
            break;
        }
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("ltlb", lptv(int ), (int)845)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ns.lpst("ltlc", lpsq(int ), (int)1653)) break;
            v19 /* !! */  = (long)ns.lpst("ltld", lpsq(int ), (int)1654);
        }
        v20 /* !! */  = ns.uk;
        if (true) ** GOTO lbl149
        block96: while (true) {
            v20 /* !! */  = (long)(ns.lpst("ltlf", lptv(int ), (int)847) - ns.lpst("ltle", lptv(int ), (int)846));
lbl149:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case 304457984: {
                    break block96;
                }
                case 517698826: {
                    continue block96;
                }
            }
            break;
        }
        v21 /* !! */  = ns.uk;
        if (true) ** GOTO lbl158
        block97: while (true) {
            v21 /* !! */  = (long)(v22 - ns.lpst("ltlg", lptv(int ), (int)848));
lbl158:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -449279390: {
                    v22 = ns.lpst("ltlh", lptv(int ), (int)849);
                    continue block97;
                }
                case 304457984: {
                    break block97;
                }
                case 424170943: {
                    v22 = ns.lpst("ltli", lptv(int ), (int)850);
                    continue block97;
                }
                case 502039970: {
                    v22 = ns.lpst("ltlj", lptv(int ), (int)851);
                    continue block97;
                }
            }
            break;
        }
        v23 /* !! */  = ns.uk;
        if (true) ** GOTO lbl174
        block98: while (true) {
            v23 /* !! */  = (long)(ns.lpst("ltll", lptv(int ), (int)853) - ns.lpst("ltlk", lptv(int ), (int)852));
lbl174:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case 304457984: {
                    break block98;
                }
                case 1772258980: {
                    continue block98;
                }
            }
            break;
        }
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_9 = ns.uk - ns.lpst("ltlm", lptv(int ), (int)854)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == ns.lpst("ltln", lpsq(int ), (int)1655)) break;
            v24 /* !! */  = (long)ns.lpst("ltlo", lpsq(int ), (int)1656);
        }
        v25 /* !! */  = ns.uk;
        if (true) ** GOTO lbl188
        block100: while (true) {
            v25 /* !! */  = (long)(v26 - ns.lpst("ltlp", lptv(int ), (int)855));
lbl188:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -1446961519: {
                    v26 = ns.lpst("ltlq", lptv(int ), (int)856);
                    continue block100;
                }
                case -452677313: {
                    v26 = ns.lpst("ltlr", lptv(int ), (int)857);
                    continue block100;
                }
                case 304457984: {
                    break block100;
                }
                case 1661642061: {
                    v26 = ns.lpst("ltls", lptv(int ), (int)858);
                    continue block100;
                }
            }
            break;
        }
        v27 /* !! */  = ns.uk;
        if (true) ** GOTO lbl204
        block101: while (true) {
            v27 /* !! */  = (long)(ns.lpst("ltlu", lptv(int ), (int)860) - ns.lpst("ltlt", lptv(int ), (int)859));
lbl204:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case 304457984: {
                    break block101;
                }
                case 1522476512: {
                    continue block101;
                }
            }
            break;
        }
        v28 /* !! */  = ns.uk;
        if (true) ** GOTO lbl213
        block102: while (true) {
            v28 /* !! */  = (long)(v29 - ns.lpst("ltlv", lptv(int ), (int)861));
lbl213:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -546661303: {
                    v29 = ns.lpst("ltlw", lptv(int ), (int)862);
                    continue block102;
                }
                case 304457984: {
                    break block102;
                }
                case 826025416: {
                    v29 = ns.lpst("ltlx", lptv(int ), (int)863);
                    continue block102;
                }
            }
            break;
        }
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_10 = ns.uk - ns.lpst("ltly", lptv(int ), (int)864)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == ns.lpst("ltlz", lpsq(int ), (int)1657)) break;
            v30 /* !! */  = (long)ns.lpst("ltma", lpsq(int ), (int)1658);
        }
        v31 /* !! */  = ns.uk;
        if (true) ** GOTO lbl231
        block104: while (true) {
            v31 /* !! */  = (long)(v32 - ns.lpst("ltmb", lptv(int ), (int)865));
lbl231:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case 304457984: {
                    break block104;
                }
                case 1399311307: {
                    v32 = ns.lpst("ltmc", lptv(int ), (int)866);
                    continue block104;
                }
                case 1637018866: {
                    v32 = ns.lpst("ltmd", lptv(int ), (int)867);
                    continue block104;
                }
                case 1877807837: {
                    v32 = ns.lpst("ltme", lptv(int ), (int)868);
                    continue block104;
                }
            }
            break;
        }
        v33 = new Object2DoubleArrayMap(this.fluidHeight);
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_11 = ns.uk - ns.lpst("ltmf", lptv(int ), (int)869)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == ns.lpst("ltmg", lpsq(int ), (int)1659)) break;
            v34 /* !! */  = (long)ns.lpst("ltmh", lpsq(int ), (int)1660);
        }
        v35 /* !! */  = ns.uk;
        if (true) ** GOTO lbl253
        block106: while (true) {
            v35 /* !! */  = (long)(ns.lpst("ltmj", lptv(int ), (int)871) - ns.lpst("ltmi", lptv(int ), (int)870));
lbl253:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1120254882: {
                    continue block106;
                }
                case 304457984: {
                    break block106;
                }
            }
            break;
        }
        while (true) {
            if ((v36 /* !! */  = (cfr_temp_12 = ns.uk - ns.lpst("ltmk", lptv(int ), (int)872)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v36 /* !! */  == ns.lpst("ltml", lpsq(int ), (int)1661)) break;
            v36 /* !! */  = (long)ns.lpst("ltmm", lpsq(int ), (int)1662);
        }
        v37 = new HashSet<class_6862<class_3611>>(this.submergedFluidTag);
        v38 /* !! */  = ns.uk;
        if (true) ** GOTO lbl268
        block108: while (true) {
            v38 /* !! */  = (long)(ns.lpst("ltmo", lptv(int ), (int)874) - ns.lpst("ltmn", lptv(int ), (int)873));
lbl268:
            // 2 sources

            switch ((int)v38 /* !! */ ) {
                case 304457984: {
                    break block108;
                }
                case 864136675: {
                    continue block108;
                }
            }
            break;
        }
        return new ns(this.player, this.input, this.pos, this.velocity, this.boundingBox, this.yaw, this.pitch, this.sprinting, this.fallDistance, this.jumpingCooldown, this.isJumping, this.isFallFlying, this.onGround, this.horizontalCollision, this.verticalCollision, this.touchingWater, this.isSwimming, this.submergedInWater, (Object2DoubleMap<class_6862<class_3611>>)v33, v37);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean hasStatusEffect(class_6880<class_1291> class_68802) {
        CallSite callSite;
        boolean bl2;
        block31: {
            class_1293 class_12932;
            Object object = uk;
            boolean bl3 = true;
            block10: while (true) {
                CallSite callSite2;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite2 - ns.lpst("ltfv", lptv(int ), (int)778);
                }
                switch ((int)object) {
                    case 304457984: {
                        break block10;
                    }
                    case 643813108: {
                        callSite2 = ns.lpst("ltfw", lptv(int ), (int)779);
                        continue block10;
                    }
                    case 1329431089: {
                        callSite2 = ns.lpst("ltfx", lptv(int ), (int)780);
                        continue block10;
                    }
                }
                break;
            }
            boolean bl4 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = uk - ns.lpst("ltfy", lptv(int ), (int)781)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == ns.lpst("ltfz", lpsq(int ), (int)1584)) break;
                object2 = ns.lpst("ltga", lpsq(int ), (int)1585);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = uk - ns.lpst("ltgb", lptv(int ), (int)782)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == ns.lpst("ltgc", lpsq(int ), (int)1586)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = ns.lpst("ltgd", lpsq(int ), (int)1587);
            }
            if (bl2 || bl2) return (boolean)ns.lpst("ltge", lpsq(int ), (int)1588);
            while (true) {
                long l4;
                Object object4;
                if ((object4 = (l4 = uk - ns.lpst("ltgf", lptv(int ), (int)783)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object4 == ns.lpst("ltgg", lpsq(int ), (int)1589)) break;
                object4 = ns.lpst("ltgh", lpsq(int ), (int)1590);
            }
            while (true) {
                long l5;
                Object object5;
                if ((object5 = (l5 = uk - ns.lpst("ltgi", lptv(int ), (int)784)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object5 == ns.lpst("ltgj", lpsq(int ), (int)1591)) {
                    class_12932 = this.player.method_6112(class_68802);
                    if (bl2) return (boolean)ns.lpst("ltge", lpsq(int ), (int)1588);
                    break;
                }
                object5 = ns.lpst("ltgk", lpsq(int ), (int)1592);
            }
            if (bl2) return (boolean)ns.lpst("ltge", lpsq(int ), (int)1588);
            if (class_12932 != null) {
                if (bl2) return (boolean)ns.lpst("ltge", lpsq(int ), (int)1588);
                Object object6 = uk;
                boolean bl5 = true;
                block15: while (true) {
                    CallSite callSite3;
                    if (!bl5 || (bl5 = false) || !true) {
                        object6 = callSite3 - ns.lpst("ltgl", lptv(int ), (int)785);
                    }
                    switch ((int)object6) {
                        case -2079107986: {
                            callSite3 = ns.lpst("ltgm", lptv(int ), (int)786);
                            continue block15;
                        }
                        case 304457984: {
                            break block15;
                        }
                        case 1611707165: {
                            callSite3 = ns.lpst("ltgn", lptv(int ), (int)787);
                            continue block15;
                        }
                    }
                    break;
                }
                int n3 = class_12932.method_5584();
                while (true) {
                    long l6;
                    Object object7;
                    if ((object7 = (l6 = uk - ns.lpst("ltgo", lptv(int ), (int)788)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                    if (object7 == ns.lpst("ltgp", lpsq(int ), (int)1593)) {
                        if (n3 >= this.simulatedTicks) {
                            break;
                        }
                        break block31;
                    }
                    object7 = ns.lpst("ltgq", lpsq(int ), (int)1594);
                }
                if (bl2) return (boolean)ns.lpst("ltge", lpsq(int ), (int)1588);
                callSite = ns.lpst("ltgr", lpsq(int ), (int)1595);
                if (!bl4) return (boolean)callSite;
                throw null;
            }
        }
        if (bl2 || bl2) {
            return (boolean)ns.lpst("ltge", lpsq(int ), (int)1588);
        }
        callSite = ns.lpst("ltgs", lpsq(int ), (int)1596);
        return (boolean)callSite;
    }

    private static /* synthetic */ void ltqp() {
        ns.lpss[200] = -337864926;
        ns.lpss[201] = 1145568616;
        ns.lpss[202] = -1656651215;
        ns.lpss[203] = 822465189;
        ns.lpss[204] = 439964624;
        ns.lpss[205] = 1945963553;
        ns.lpss[206] = 2094564816;
        ns.lpss[207] = 1520303118;
        ns.lpss[208] = 1222286128;
        ns.lpss[209] = -1265167137;
        ns.lpss[210] = 2082421372;
        ns.lpss[211] = -18097554;
        ns.lpss[212] = 943561739;
        ns.lpss[213] = 1045803010;
        ns.lpss[214] = -1108924028;
        ns.lpss[215] = -1838139299;
        ns.lpss[216] = -577622443;
        ns.lpss[217] = 335114858;
        ns.lpss[218] = 566027527;
        ns.lpss[219] = 1651004500;
        ns.lpss[220] = 1907299214;
        ns.lpss[221] = -422760442;
        ns.lpss[222] = 1713002753;
        ns.lpss[223] = -2135689376;
        ns.lpss[224] = -1604363926;
        ns.lpss[225] = -395816021;
        ns.lpss[226] = -495015801;
        ns.lpss[227] = 1668924178;
        ns.lpss[228] = -1806646605;
        ns.lpss[229] = 2073976870;
        ns.lpss[230] = 1641028433;
        ns.lpss[231] = 1240328889;
        ns.lpss[232] = 1040538222;
        ns.lpss[233] = 1354559123;
        ns.lpss[234] = 682680185;
        ns.lpss[235] = -1389442093;
        ns.lpss[236] = -1247242948;
        ns.lpss[237] = 159038960;
        ns.lpss[238] = 1052222338;
        ns.lpss[239] = -1150412353;
        ns.lpss[240] = 181052675;
        ns.lpss[241] = 1276094444;
        ns.lpss[242] = -1593226085;
        ns.lpss[243] = -69955401;
        ns.lpss[244] = 806019789;
        ns.lpss[245] = -1944678651;
        ns.lpss[246] = -1730065117;
        ns.lpss[247] = -570858498;
        ns.lpss[248] = 233075439;
        ns.lpss[249] = 1884789201;
        ns.lpss[250] = 1298816879;
        ns.lpss[251] = -1348084907;
        ns.lpss[252] = -1520531603;
        ns.lpss[253] = -542486629;
        ns.lpss[254] = 371304651;
        ns.lpss[255] = -2110729294;
        ns.lpss[256] = -1416371043;
        ns.lpss[257] = 2047109681;
        ns.lpss[258] = -1642428225;
        ns.lpss[259] = 625284916;
        ns.lpss[260] = 807111689;
        ns.lpss[261] = -1094487813;
        ns.lpss[262] = -1592158062;
        ns.lpss[263] = -224346032;
        ns.lpss[264] = -594103910;
        ns.lpss[265] = -611552945;
        ns.lpss[266] = -975069421;
        ns.lpss[267] = -1802822576;
        ns.lpss[268] = -1186570511;
        ns.lpss[269] = 687761412;
        ns.lpss[270] = -1384809322;
        ns.lpss[271] = -895368962;
        ns.lpss[272] = 1405970712;
        ns.lpss[273] = -1725353916;
        ns.lpss[274] = -641838275;
        ns.lpss[275] = -42677860;
        ns.lpss[276] = -1066820519;
        ns.lpss[277] = -1270286169;
        ns.lpss[278] = 1135836565;
        ns.lpss[279] = 1691617860;
        ns.lpss[280] = -981250066;
        ns.lpss[281] = -1087896093;
        ns.lpss[282] = -1773835283;
        ns.lpss[283] = -788036876;
        ns.lpss[284] = -721398867;
        ns.lpss[285] = -1491557373;
        ns.lpss[286] = -1748229304;
        ns.lpss[287] = -1489732925;
        ns.lpss[288] = 976472297;
        ns.lpss[289] = 53034451;
        ns.lpss[290] = 1942164088;
        ns.lpss[291] = -285809386;
        ns.lpss[292] = -288487255;
        ns.lpss[293] = 1421752052;
        ns.lpss[294] = 386127519;
        ns.lpss[295] = -280054721;
        ns.lpss[296] = -100131564;
        ns.lpss[297] = 2130722032;
        ns.lpss[298] = -359861257;
        ns.lpss[299] = 1204921245;
    }

    private static /* synthetic */ void ltrw() {
        ns.lptx[700] = 7744694436839613612L;
        ns.lptx[701] = -4011252777539725650L;
        ns.lptx[702] = -3581623641016539443L;
        ns.lptx[703] = 260674767743059112L;
        ns.lptx[704] = -1471148699146405761L;
        ns.lptx[705] = -2765166242466096362L;
        ns.lptx[706] = 4244852859711244719L;
        ns.lptx[707] = -8874265384198654904L;
        ns.lptx[708] = 3721311410777492304L;
        ns.lptx[709] = 560996956216150930L;
        ns.lptx[710] = -4860618659353064292L;
        ns.lptx[711] = 5765682858170180704L;
        ns.lptx[712] = -4417322107771122862L;
        ns.lptx[713] = -1671111113873795629L;
        ns.lptx[714] = -2357644968665952442L;
        ns.lptx[715] = -1736694576798447555L;
        ns.lptx[716] = 4990210847667033834L;
        ns.lptx[717] = -6122327787344307938L;
        ns.lptx[718] = -2969095282963147545L;
        ns.lptx[719] = -6956602522407497352L;
        ns.lptx[720] = -6210090897756428190L;
        ns.lptx[721] = 4736338609739735798L;
        ns.lptx[722] = -5590675476422801720L;
        ns.lptx[723] = 902984295091318131L;
        ns.lptx[724] = 3690411835245992740L;
        ns.lptx[725] = -6416149700124097544L;
        ns.lptx[726] = 4992633795833041395L;
        ns.lptx[727] = 3751856298554499656L;
        ns.lptx[728] = -3515489296341794800L;
        ns.lptx[729] = 6398729633605591689L;
        ns.lptx[730] = -845751758431579716L;
        ns.lptx[731] = -4108051843412291165L;
        ns.lptx[732] = 2910925749581430169L;
        ns.lptx[733] = 4592154639959389066L;
        ns.lptx[734] = 7585339104935151548L;
        ns.lptx[735] = -871614839846229801L;
        ns.lptx[736] = -2071956662169826642L;
        ns.lptx[737] = 8370842061143672013L;
        ns.lptx[738] = 8350065630288336075L;
        ns.lptx[739] = -5078039733994803648L;
        ns.lptx[740] = 7371231788723201768L;
        ns.lptx[741] = 1262597089280039661L;
        ns.lptx[742] = 3316858751162596723L;
        ns.lptx[743] = -1259154426959880999L;
        ns.lptx[744] = -817175257317949055L;
        ns.lptx[745] = 1507720686961401637L;
        ns.lptx[746] = 5289091618288149506L;
        ns.lptx[747] = 5356320517204186718L;
        ns.lptx[748] = -6362623819898650273L;
        ns.lptx[749] = 5102021969365087145L;
        ns.lptx[750] = -1694544040559450184L;
        ns.lptx[751] = 1956739958972436074L;
        ns.lptx[752] = 2411724060025500899L;
        ns.lptx[753] = 1950633631130261358L;
        ns.lptx[754] = -4603392884997195359L;
        ns.lptx[755] = 6686707207738365965L;
        ns.lptx[756] = 6147466418123451815L;
        ns.lptx[757] = -4142787592050559111L;
        ns.lptx[758] = -3655313722303052969L;
        ns.lptx[759] = 1598643051419402106L;
        ns.lptx[760] = 1673997764831725242L;
        ns.lptx[761] = 1306111280051388025L;
        ns.lptx[762] = 1626518098636302419L;
        ns.lptx[763] = -4131026686403673371L;
        ns.lptx[764] = -6344234378968666001L;
        ns.lptx[765] = 2719692980021921791L;
        ns.lptx[766] = -7077018642145070830L;
        ns.lptx[767] = 704874460597221146L;
        ns.lptx[768] = -8534011236422962191L;
        ns.lptx[769] = -5382045540704296071L;
        ns.lptx[770] = 795331751016394759L;
        ns.lptx[771] = 9202680495500846661L;
        ns.lptx[772] = -7645064054123278167L;
        ns.lptx[773] = 1564707870657891776L;
        ns.lptx[774] = -5824783843468076586L;
        ns.lptx[775] = -5849154210339419200L;
        ns.lptx[776] = 2849728406216064467L;
        ns.lptx[777] = 7533369462653196122L;
        ns.lptx[778] = -983351017917802960L;
        ns.lptx[779] = -8032469266489934079L;
        ns.lptx[780] = 1194593940182338203L;
        ns.lptx[781] = -1965011404951574171L;
        ns.lptx[782] = 5214782345377015790L;
        ns.lptx[783] = -5285353374859436290L;
        ns.lptx[784] = 2524072182310342989L;
        ns.lptx[785] = 3843204158989866398L;
        ns.lptx[786] = 5170149640487544451L;
        ns.lptx[787] = -3569704545753944428L;
        ns.lptx[788] = -7452739837078045800L;
        ns.lptx[789] = 1770024939464170731L;
        ns.lptx[790] = 6840225456515639759L;
        ns.lptx[791] = -6999094306785587764L;
        ns.lptx[792] = -8620941479211849735L;
        ns.lptx[793] = -530939352794953991L;
        ns.lptx[794] = -333641110909560175L;
        ns.lptx[795] = 1282917982629148332L;
        ns.lptx[796] = 5565462752769762165L;
        ns.lptx[797] = 7556014540877022315L;
        ns.lptx[798] = -6023730732502077182L;
        ns.lptx[799] = 19047760356398205L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2680 getState(class_2338 var1_1) {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ns.lpst("ltog", lptv(int ), (int)892));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -385238867: {
                    v1 = ns.lpst("ltoh", lptv(int ), (int)893);
                    continue block23;
                }
                case -107384176: {
                    v1 = ns.lpst("ltoi", lptv(int ), (int)894);
                    continue block23;
                }
                case 304457984: {
                    break block23;
                }
                case 1999741011: {
                    v1 = ns.lpst("ltoj", lptv(int ), (int)895);
                    continue block23;
                }
            }
            break;
        }
        var4_2 = ns.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltok", lptv(int ), (int)896)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns.lpst("ltol", lpsq(int ), (int)1689)) break;
            v2 /* !! */  = (long)ns.lpst("ltom", lpsq(int ), (int)1690);
        }
        var3_3 /* !! */  = ns.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ns.uk;
                if (true) ** GOTO lbl31
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - ns.lpst("lton", lptv(int ), (int)897));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2059673074: {
                            v4 = ns.lpst("ltoo", lptv(int ), (int)898);
                            continue block25;
                        }
                        case -1363548564: {
                            v4 = ns.lpst("ltop", lptv(int ), (int)899);
                            continue block25;
                        }
                        case 227576328: {
                            v4 = ns.lpst("ltoq", lptv(int ), (int)900);
                            continue block25;
                        }
                        case 304457984: {
                            break block25;
                        }
                    }
                    break;
                }
                var2_4 = ns.a;
                if (var4_2) {
                    throw null;
                    return null;
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("ltor", lptv(int ), (int)901)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ns.lpst("ltos", lpsq(int ), (int)1691)) break;
                    v5 /* !! */  = (long)ns.lpst("ltot", lpsq(int ), (int)1692);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("ltou", lptv(int ), (int)902)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ns.lpst("ltov", lpsq(int ), (int)1693)) break;
                    v6 /* !! */  = (long)ns.lpst("ltow", lpsq(int ), (int)1694);
                }
                v7 = this.player.method_73183();
                v8 /* !! */  = ns.uk;
                if (true) ** GOTO lbl64
                block29: while (true) {
                    v8 /* !! */  = (long)(v9 - ns.lpst("ltox", lptv(int ), (int)903));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1982152736: {
                            v9 = ns.lpst("ltoy", lptv(int ), (int)904);
                            continue block29;
                        }
                        case -1746804330: {
                            v9 = ns.lpst("ltoz", lptv(int ), (int)905);
                            continue block29;
                        }
                        case 304457984: {
                            break block29;
                        }
                    }
                    break;
                }
                return v7.method_8320(var1_1);
            }
lbl74:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ns.lpst("ltpa", lpsq(int ), (int)1695);
                    if (!var4_2) break block6;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ns.lpst("ltpb", lpsq(int ), (int)1696);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ns.lpst("ltpc", lpsq(int ), (int)1697);
                if (!var4_2) ** GOTO lbl74
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ns.lpst("ltpd", lpsq(int ), (int)1698);
        ** while (!var4_2)
lbl90:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private float getJumpVelocity() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = uk - ns.lpst("lrzg", lptv(int ), (int)454)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lrzh", lpsq(int ), (int)1061)) break;
            object = ns.lpst("lrzi", lpsq(int ), (int)1062);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = uk - ns.lpst("lrzj", lptv(int ), (int)455)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lrzk", lpsq(int ), (int)1063)) break;
            object = ns.lpst("lrzl", lpsq(int ), (int)1064);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = uk - ns.lpst("lrzm", lptv(int ), (int)456)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lrzn", lpsq(int ), (int)1065)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ns.lpst("lrzo", lpsq(int ), (int)1066);
        }
        if (bl2) return (float)ns.lpst("lrzp", lqfy(int ), (int)1067);
        if (bl2) return (float)ns.lpst("lrzp", lqfy(int ), (int)1067);
        CallSite callSite = ns.lpst("lrzq", lqfy(int ), (int)1068);
        Object object = uk;
        boolean bl4 = true;
        block13: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite2 - ns.lpst("lrzr", lptv(int ), (int)457);
            }
            switch ((int)object) {
                case -67292865: {
                    callSite2 = ns.lpst("lrzs", lptv(int ), (int)458);
                    continue block13;
                }
                case -53584959: {
                    callSite2 = ns.lpst("lrzt", lptv(int ), (int)459);
                    continue block13;
                }
                case 304457984: {
                    break block13;
                }
                case 863473779: {
                    callSite2 = ns.lpst("lrzu", lptv(int ), (int)460);
                    continue block13;
                }
            }
            break;
        }
        reference v6 = callSite * this.getJumpVelocityMultiplier();
        Object object2 = uk;
        block14: while (true) {
            switch ((int)object2) {
                case -744207002: {
                    object2 = ns.lpst("lrzw", lptv(int ), (int)462) - ns.lpst("lrzv", lptv(int ), (int)461);
                    continue block14;
                }
                case 304457984: {
                    return (float)(v6 + this.getJumpBoostVelocityModifier());
                }
            }
            break;
        }
        return (float)(v6 + this.getJumpBoostVelocityModifier());
    }

    private static /* synthetic */ double lqfo(int n2) {
        return Double.longBitsToDouble(lptw[n2] ^ lptx[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canEnterTrapdoor(class_2338 var1_1, class_2680 var2_2) {
        block93: {
            block92: {
                block91: {
                    v0 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl5
                    block67: while (true) {
                        v0 /* !! */  = (long)(v1 - ns.lpst("lrpb", lptv(int ), (int)356));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -2136966326: {
                                v1 = ns.lpst("lrpc", lptv(int ), (int)357);
                                continue block67;
                            }
                            case -1845603485: {
                                v1 = ns.lpst("lrpd", lptv(int ), (int)358);
                                continue block67;
                            }
                            case -1082731124: {
                                v1 = ns.lpst("lrpe", lptv(int ), (int)359);
                                continue block67;
                            }
                            case 304457984: {
                                break block67;
                            }
                        }
                        break;
                    }
                    var6_3 = ns.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrpf", lptv(int ), (int)360)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v2 /* !! */  == ns.lpst("lrpg", lpsq(int ), (int)894)) break;
                        v2 /* !! */  = (long)ns.lpst("lrph", lpsq(int ), (int)895);
                    }
                    var5_4 = ns.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrpi", lptv(int ), (int)361)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v3 /* !! */  == ns.lpst("lrpj", lpsq(int ), (int)896)) break;
                        v3 /* !! */  = (long)ns.lpst("lrpk", lpsq(int ), (int)897);
                    }
                    var4_5 = ns.a;
                    if (var6_3) {
                        throw null;
lbl34:
                        // 7 sources

                        return (boolean)ns.lpst("lrpl", lpsq(int ), (int)898);
                    }
                    if (var4_5 || var4_5) ** GOTO lbl34
                    v4 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl41
                    block71: while (true) {
                        v4 /* !! */  = (long)(v5 - ns.lpst("lrpm", lptv(int ), (int)362));
lbl41:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -721773721: {
                                v5 = ns.lpst("lrpn", lptv(int ), (int)363);
                                continue block71;
                            }
                            case 304457984: {
                                break block71;
                            }
                            case 1329295954: {
                                v5 = ns.lpst("lrpo", lptv(int ), (int)364);
                                continue block71;
                            }
                            case 1607148842: {
                                v5 = ns.lpst("lrpp", lptv(int ), (int)365);
                                continue block71;
                            }
                        }
                        break;
                    }
                    v6 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl57
                    block72: while (true) {
                        v6 /* !! */  = (long)(ns.lpst("lrpr", lptv(int ), (int)367) - ns.lpst("lrpq", lptv(int ), (int)366));
lbl57:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case 304457984: {
                                break block72;
                            }
                            case 501328227: {
                                continue block72;
                            }
                        }
                        break;
                    }
                    v7 = (Boolean)var2_2.method_11654((class_2769)class_2533.field_11631);
                    v8 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl67
                    block73: while (true) {
                        v8 /* !! */  = (long)(ns.lpst("lrpt", lptv(int ), (int)369) - ns.lpst("lrps", lptv(int ), (int)368));
lbl67:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1952699092: {
                                continue block73;
                            }
                            case 304457984: {
                                break block73;
                            }
                        }
                        break;
                    }
                    if (v7.booleanValue()) break block91;
                    if (var4_5 || var4_5) ** GOTO lbl34
                    return (boolean)ns.lpst("lrpu", lpsq(int ), (int)899);
                }
                if (var4_5 || var4_5) ** GOTO lbl34
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lrpv", lptv(int ), (int)370)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ns.lpst("lrpw", lpsq(int ), (int)900)) break;
                    v9 /* !! */  = (long)ns.lpst("lrpx", lpsq(int ), (int)901);
                }
                v10 /* !! */  = ns.uk;
                if (true) ** GOTO lbl87
                block75: while (true) {
                    v10 /* !! */  = (long)(v11 - ns.lpst("lrpy", lptv(int ), (int)371));
lbl87:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -447544131: {
                            v11 = ns.lpst("lrpz", lptv(int ), (int)372);
                            continue block75;
                        }
                        case 304457984: {
                            break block75;
                        }
                        case 487015220: {
                            v11 = ns.lpst("lrqa", lptv(int ), (int)373);
                            continue block75;
                        }
                    }
                    break;
                }
                v12 = this.player.method_73183();
                v13 /* !! */  = ns.uk;
                if (true) ** GOTO lbl101
                block76: while (true) {
                    v13 /* !! */  = (long)(v14 - ns.lpst("lrqb", lptv(int ), (int)374));
lbl101:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1039855907: {
                            v14 = ns.lpst("lrqc", lptv(int ), (int)375);
                            continue block76;
                        }
                        case -1016054802: {
                            v14 = ns.lpst("lrqd", lptv(int ), (int)376);
                            continue block76;
                        }
                        case 304457984: {
                            break block76;
                        }
                        case 2038829026: {
                            v14 = ns.lpst("lrqe", lptv(int ), (int)377);
                            continue block76;
                        }
                    }
                    break;
                }
                v15 = var1_1.method_10074();
                v16 /* !! */  = ns.uk;
                if (true) ** GOTO lbl118
                block77: while (true) {
                    v16 /* !! */  = (long)(v17 - ns.lpst("lrqf", lptv(int ), (int)378));
lbl118:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1180976408: {
                            v17 = ns.lpst("lrqg", lptv(int ), (int)379);
                            continue block77;
                        }
                        case -21118140: {
                            v17 = ns.lpst("lrqh", lptv(int ), (int)380);
                            continue block77;
                        }
                        case 304457984: {
                            break block77;
                        }
                        case 1840864803: {
                            v17 = ns.lpst("lrqi", lptv(int ), (int)381);
                            continue block77;
                        }
                    }
                    break;
                }
                var3_6 = v12.method_8320(v15);
                if (var4_5 || var4_5) ** GOTO lbl34
                v18 /* !! */  = ns.uk;
                if (true) ** GOTO lbl136
                block78: while (true) {
                    v18 /* !! */  = (long)(v19 - ns.lpst("lrqj", lptv(int ), (int)382));
lbl136:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 304457984: {
                            break block78;
                        }
                        case 551788642: {
                            v19 = ns.lpst("lrqk", lptv(int ), (int)383);
                            continue block78;
                        }
                        case 1757223812: {
                            v19 = ns.lpst("lrql", lptv(int ), (int)384);
                            continue block78;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lrqm", lptv(int ), (int)385)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == ns.lpst("lrqn", lpsq(int ), (int)902)) break;
                    v20 /* !! */  = (long)ns.lpst("lrqo", lpsq(int ), (int)903);
                }
                if (!var3_6.method_27852(class_2246.field_9983)) break block92;
                if (var4_5) ** GOTO lbl34
                v21 /* !! */  = ns.uk;
                if (true) ** GOTO lbl157
                block80: while (true) {
                    v21 /* !! */  = (long)(v22 - ns.lpst("lrqp", lptv(int ), (int)386));
lbl157:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -992200089: {
                            v22 = ns.lpst("lrqq", lptv(int ), (int)387);
                            continue block80;
                        }
                        case -159461138: {
                            v22 = ns.lpst("lrqr", lptv(int ), (int)388);
                            continue block80;
                        }
                        case 304457984: {
                            break block80;
                        }
                        case 1498604183: {
                            v22 = ns.lpst("lrqs", lptv(int ), (int)389);
                            continue block80;
                        }
                    }
                    break;
                }
                v23 /* !! */  = ns.uk;
                if (true) ** GOTO lbl173
                block81: while (true) {
                    v23 /* !! */  = (long)(v24 - ns.lpst("lrqt", lptv(int ), (int)390));
lbl173:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 304457984: {
                            break block81;
                        }
                        case 602982521: {
                            v24 = ns.lpst("lrqu", lptv(int ), (int)391);
                            continue block81;
                        }
                        case 2043163801: {
                            v24 = ns.lpst("lrqv", lptv(int ), (int)392);
                            continue block81;
                        }
                    }
                    break;
                }
                v25 = (class_2350)var3_6.method_11654((class_2769)class_2399.field_11253);
                v26 /* !! */  = ns.uk;
                if (true) ** GOTO lbl187
                block82: while (true) {
                    v26 /* !! */  = (long)(v27 - ns.lpst("lrqw", lptv(int ), (int)393));
lbl187:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2120824190: {
                            v27 = ns.lpst("lrqx", lptv(int ), (int)394);
                            continue block82;
                        }
                        case -1137504758: {
                            v27 = ns.lpst("lrqy", lptv(int ), (int)395);
                            continue block82;
                        }
                        case -578669557: {
                            v27 = ns.lpst("lrqz", lptv(int ), (int)396);
                            continue block82;
                        }
                        case 304457984: {
                            break block82;
                        }
                    }
                    break;
                }
                v28 /* !! */  = ns.uk;
                if (true) ** GOTO lbl203
                block83: while (true) {
                    v28 /* !! */  = (long)(ns.lpst("lrrb", lptv(int ), (int)398) - ns.lpst("lrra", lptv(int ), (int)397));
lbl203:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 304457984: {
                            break block83;
                        }
                        case 1347536665: {
                            continue block83;
                        }
                    }
                    break;
                }
                v29 = var2_2.method_11654((class_2769)class_2533.field_11177);
                v30 /* !! */  = ns.uk;
                if (true) ** GOTO lbl213
                block84: while (true) {
                    v30 /* !! */  = (long)(ns.lpst("lrrd", lptv(int ), (int)400) - ns.lpst("lrrc", lptv(int ), (int)399));
lbl213:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1719876380: {
                            continue block84;
                        }
                        case 304457984: {
                            break block84;
                        }
                    }
                    break;
                }
                if (!v25.equals((Object)v29)) break block92;
                if (var4_5) ** GOTO lbl34
                v31 = ns.lpst("lrre", lpsq(int ), (int)904);
                if (var6_3) {
                    throw null;
                }
                break block93;
            }
            if (!var4_5 && !var4_5) ** break;
            ** while (true)
            v31 = ns.lpst("lrrf", lpsq(int ), (int)905);
        }
        return (boolean)v31;
    }

    private static /* synthetic */ void ltre() {
        ns.lpss[1700] = 1065382120;
        ns.lpss[1701] = 1690450789;
        ns.lpss[1702] = -2063063814;
        ns.lpss[1703] = -170209545;
        ns.lpss[1704] = -313308046;
    }

    private static /* synthetic */ void ltqz() {
        ns.lpss[1200] = -429530785;
        ns.lpss[1201] = -1952972566;
        ns.lpss[1202] = 856024496;
        ns.lpss[1203] = -1540185096;
        ns.lpss[1204] = -1564305908;
        ns.lpss[1205] = 920166662;
        ns.lpss[1206] = 104193756;
        ns.lpss[1207] = 93780882;
        ns.lpss[1208] = -1729284906;
        ns.lpss[1209] = -191250661;
        ns.lpss[1210] = 681590273;
        ns.lpss[1211] = -512511957;
        ns.lpss[1212] = 473419711;
        ns.lpss[1213] = 397976844;
        ns.lpss[1214] = -1808462021;
        ns.lpss[1215] = -94502015;
        ns.lpss[1216] = 2071380826;
        ns.lpss[1217] = 1525470496;
        ns.lpss[1218] = 1201691727;
        ns.lpss[1219] = 2010919463;
        ns.lpss[1220] = 844021567;
        ns.lpss[1221] = 1043813903;
        ns.lpss[1222] = -950956701;
        ns.lpss[1223] = -1661938644;
        ns.lpss[1224] = -1580418922;
        ns.lpss[1225] = -1640898001;
        ns.lpss[1226] = 1194731311;
        ns.lpss[1227] = -40948057;
        ns.lpss[1228] = 486335596;
        ns.lpss[1229] = -570569312;
        ns.lpss[1230] = 384949724;
        ns.lpss[1231] = -989232891;
        ns.lpss[1232] = -209118804;
        ns.lpss[1233] = 477123138;
        ns.lpss[1234] = -1363131542;
        ns.lpss[1235] = -1487102008;
        ns.lpss[1236] = -1734637325;
        ns.lpss[1237] = -1491964907;
        ns.lpss[1238] = -67650920;
        ns.lpss[1239] = 1495885331;
        ns.lpss[1240] = 664101958;
        ns.lpss[1241] = -519761419;
        ns.lpss[1242] = 653761064;
        ns.lpss[1243] = 858937211;
        ns.lpss[1244] = 1020476685;
        ns.lpss[1245] = -1569704447;
        ns.lpss[1246] = 1066087870;
        ns.lpss[1247] = 236890751;
        ns.lpss[1248] = -1535701960;
        ns.lpss[1249] = 1494903709;
        ns.lpss[1250] = -812164069;
        ns.lpss[1251] = 500055177;
        ns.lpss[1252] = -1782404921;
        ns.lpss[1253] = -594019686;
        ns.lpss[1254] = -1623420409;
        ns.lpss[1255] = -834296513;
        ns.lpss[1256] = -924092227;
        ns.lpss[1257] = 1652695783;
        ns.lpss[1258] = -1488948904;
        ns.lpss[1259] = 866574915;
        ns.lpss[1260] = -591448079;
        ns.lpss[1261] = 771375994;
        ns.lpss[1262] = -453810625;
        ns.lpss[1263] = 1475871946;
        ns.lpss[1264] = 1344383752;
        ns.lpss[1265] = -973512883;
        ns.lpss[1266] = -806238920;
        ns.lpss[1267] = -472785793;
        ns.lpss[1268] = 1140496139;
        ns.lpss[1269] = -751344175;
        ns.lpss[1270] = 1224164470;
        ns.lpss[1271] = -933736347;
        ns.lpss[1272] = -969112618;
        ns.lpss[1273] = -173565106;
        ns.lpss[1274] = 400145375;
        ns.lpss[1275] = 633128203;
        ns.lpss[1276] = 982878187;
        ns.lpss[1277] = -1123721640;
        ns.lpss[1278] = -448330740;
        ns.lpss[1279] = -1564327026;
        ns.lpss[1280] = -596974440;
        ns.lpss[1281] = 946731808;
        ns.lpss[1282] = 1016162568;
        ns.lpss[1283] = -1533645050;
        ns.lpss[1284] = 1370472537;
        ns.lpss[1285] = -210509817;
        ns.lpss[1286] = 1586103639;
        ns.lpss[1287] = -1168636044;
        ns.lpss[1288] = -898152135;
        ns.lpss[1289] = -2029544812;
        ns.lpss[1290] = -998364558;
        ns.lpss[1291] = -728354175;
        ns.lpss[1292] = -137912795;
        ns.lpss[1293] = 905249985;
        ns.lpss[1294] = -834109311;
        ns.lpss[1295] = 903938110;
        ns.lpss[1296] = 838238914;
        ns.lpss[1297] = 1088513972;
        ns.lpss[1298] = -241039936;
        ns.lpss[1299] = 73623749;
    }

    private static /* synthetic */ void ltqo() {
        ns.lpss[100] = -2016634290;
        ns.lpss[101] = -769797195;
        ns.lpss[102] = 260498929;
        ns.lpss[103] = -1397348691;
        ns.lpss[104] = -1293928169;
        ns.lpss[105] = 1961474761;
        ns.lpss[106] = -809316811;
        ns.lpss[107] = -753960319;
        ns.lpss[108] = 2013525950;
        ns.lpss[109] = -1138820519;
        ns.lpss[110] = -1707514756;
        ns.lpss[111] = -997902816;
        ns.lpss[112] = 506301747;
        ns.lpss[113] = 922172336;
        ns.lpss[114] = -1752439693;
        ns.lpss[115] = -444039823;
        ns.lpss[116] = 1409007039;
        ns.lpss[117] = -743941058;
        ns.lpss[118] = -2053101996;
        ns.lpss[119] = -1798912968;
        ns.lpss[120] = 1614376711;
        ns.lpss[121] = 730946277;
        ns.lpss[122] = -1621189410;
        ns.lpss[123] = -275936220;
        ns.lpss[124] = -1748146618;
        ns.lpss[125] = -1503818243;
        ns.lpss[126] = -1814343655;
        ns.lpss[127] = 1713673660;
        ns.lpss[128] = -1082705717;
        ns.lpss[129] = 1081267860;
        ns.lpss[130] = 729453481;
        ns.lpss[131] = 1805512807;
        ns.lpss[132] = 207560235;
        ns.lpss[133] = 1706296381;
        ns.lpss[134] = 623313572;
        ns.lpss[135] = 623852905;
        ns.lpss[136] = 928235566;
        ns.lpss[137] = -914333021;
        ns.lpss[138] = -325401364;
        ns.lpss[139] = 1354811313;
        ns.lpss[140] = -1050625492;
        ns.lpss[141] = -1271967944;
        ns.lpss[142] = 1460886900;
        ns.lpss[143] = 1140418675;
        ns.lpss[144] = 1856594414;
        ns.lpss[145] = -1063162694;
        ns.lpss[146] = 882795402;
        ns.lpss[147] = 15396789;
        ns.lpss[148] = -232433480;
        ns.lpss[149] = -1627389517;
        ns.lpss[150] = -1797745290;
        ns.lpss[151] = -192531274;
        ns.lpss[152] = -1373132241;
        ns.lpss[153] = -1955601150;
        ns.lpss[154] = 1655356077;
        ns.lpss[155] = -603986117;
        ns.lpss[156] = 849353812;
        ns.lpss[157] = 185775593;
        ns.lpss[158] = -534996702;
        ns.lpss[159] = -896628737;
        ns.lpss[160] = -313452491;
        ns.lpss[161] = -538383750;
        ns.lpss[162] = -438419470;
        ns.lpss[163] = 1881931002;
        ns.lpss[164] = -2129745517;
        ns.lpss[165] = 192462614;
        ns.lpss[166] = -665096198;
        ns.lpss[167] = -251592179;
        ns.lpss[168] = -950348626;
        ns.lpss[169] = 944296805;
        ns.lpss[170] = 862972146;
        ns.lpss[171] = -2041504735;
        ns.lpss[172] = 154001188;
        ns.lpss[173] = 56052143;
        ns.lpss[174] = -1856116551;
        ns.lpss[175] = -453594941;
        ns.lpss[176] = -1534107753;
        ns.lpss[177] = -1518155853;
        ns.lpss[178] = -1095631462;
        ns.lpss[179] = 855418135;
        ns.lpss[180] = -994172020;
        ns.lpss[181] = -616419145;
        ns.lpss[182] = 1461401809;
        ns.lpss[183] = 381581324;
        ns.lpss[184] = -363458666;
        ns.lpss[185] = -1118475040;
        ns.lpss[186] = 1966441805;
        ns.lpss[187] = 1320373201;
        ns.lpss[188] = 1177640371;
        ns.lpss[189] = 216715715;
        ns.lpss[190] = 2061248182;
        ns.lpss[191] = -1436839289;
        ns.lpss[192] = -1917526539;
        ns.lpss[193] = -379977669;
        ns.lpss[194] = -1401510736;
        ns.lpss[195] = 537940535;
        ns.lpss[196] = -1207100060;
        ns.lpss[197] = -431076484;
        ns.lpss[198] = 403875425;
        ns.lpss[199] = 1139684357;
    }

    private static /* synthetic */ void ltrc() {
        ns.lpss[1500] = 1280236126;
        ns.lpss[1501] = 1513773120;
        ns.lpss[1502] = -1676877984;
        ns.lpss[1503] = -878763712;
        ns.lpss[1504] = -2070402524;
        ns.lpss[1505] = 2011541265;
        ns.lpss[1506] = -1535250590;
        ns.lpss[1507] = -625282692;
        ns.lpss[1508] = -1113036050;
        ns.lpss[1509] = -1419064620;
        ns.lpss[1510] = 58614213;
        ns.lpss[1511] = -1481934277;
        ns.lpss[1512] = -1654660445;
        ns.lpss[1513] = -604049496;
        ns.lpss[1514] = -1305257440;
        ns.lpss[1515] = -728604565;
        ns.lpss[1516] = -1337483938;
        ns.lpss[1517] = 470120020;
        ns.lpss[1518] = 2126443158;
        ns.lpss[1519] = -156060720;
        ns.lpss[1520] = -1464502847;
        ns.lpss[1521] = 1859768491;
        ns.lpss[1522] = -2131725334;
        ns.lpss[1523] = -900837763;
        ns.lpss[1524] = 382856397;
        ns.lpss[1525] = 1185118612;
        ns.lpss[1526] = -1271948998;
        ns.lpss[1527] = 307693352;
        ns.lpss[1528] = 860103565;
        ns.lpss[1529] = -891194368;
        ns.lpss[1530] = -170183572;
        ns.lpss[1531] = -862471602;
        ns.lpss[1532] = -62773009;
        ns.lpss[1533] = -291285649;
        ns.lpss[1534] = -1455321726;
        ns.lpss[1535] = 1855325726;
        ns.lpss[1536] = 899084172;
        ns.lpss[1537] = -1288154705;
        ns.lpss[1538] = -917306750;
        ns.lpss[1539] = 703829064;
        ns.lpss[1540] = 1974481547;
        ns.lpss[1541] = -1893718846;
        ns.lpss[1542] = -276477123;
        ns.lpss[1543] = -669894999;
        ns.lpss[1544] = -474470478;
        ns.lpss[1545] = -350345340;
        ns.lpss[1546] = -2142987773;
        ns.lpss[1547] = 122468806;
        ns.lpss[1548] = -208132401;
        ns.lpss[1549] = -2107580157;
        ns.lpss[1550] = -1084135997;
        ns.lpss[1551] = 2027848233;
        ns.lpss[1552] = 1000326722;
        ns.lpss[1553] = -807568444;
        ns.lpss[1554] = -441088473;
        ns.lpss[1555] = -151323621;
        ns.lpss[1556] = 1963066103;
        ns.lpss[1557] = -541519215;
        ns.lpss[1558] = 2005358392;
        ns.lpss[1559] = 1832859702;
        ns.lpss[1560] = 578119018;
        ns.lpss[1561] = 2038211092;
        ns.lpss[1562] = 554237048;
        ns.lpss[1563] = -2009347931;
        ns.lpss[1564] = -1436574307;
        ns.lpss[1565] = -854600149;
        ns.lpss[1566] = 785892690;
        ns.lpss[1567] = -1433831810;
        ns.lpss[1568] = 1200193006;
        ns.lpss[1569] = -1899759625;
        ns.lpss[1570] = -1770691195;
        ns.lpss[1571] = -145181220;
        ns.lpss[1572] = 376003710;
        ns.lpss[1573] = -1793015613;
        ns.lpss[1574] = -2024189470;
        ns.lpss[1575] = 722624257;
        ns.lpss[1576] = -625332442;
        ns.lpss[1577] = -1006866635;
        ns.lpss[1578] = 656746101;
        ns.lpss[1579] = 1686024287;
        ns.lpss[1580] = 102627335;
        ns.lpss[1581] = -356770979;
        ns.lpss[1582] = 741773529;
        ns.lpss[1583] = 552379427;
        ns.lpss[1584] = 2008431070;
        ns.lpss[1585] = -332981285;
        ns.lpss[1586] = -1970728003;
        ns.lpss[1587] = -1356327669;
        ns.lpss[1588] = 937445636;
        ns.lpss[1589] = -1207042562;
        ns.lpss[1590] = -362471000;
        ns.lpss[1591] = -851400370;
        ns.lpss[1592] = 665295575;
        ns.lpss[1593] = -1925408569;
        ns.lpss[1594] = -906683610;
        ns.lpss[1595] = 1124192239;
        ns.lpss[1596] = 841680191;
        ns.lpss[1597] = -1839071356;
        ns.lpss[1598] = -709795457;
        ns.lpss[1599] = 886348089;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isRegionUnloaded() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltai", lptv(int ), (int)702)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("ltaj", lpsq(int ), (int)1517)) break;
            v0 /* !! */  = (long)ns.lpst("ltak", lpsq(int ), (int)1518);
        }
        var8_1 = ns.c;
        v1 /* !! */  = ns.uk;
        if (true) ** GOTO lbl11
        block59: while (true) {
            v1 /* !! */  = (long)(v2 - ns.lpst("ltal", lptv(int ), (int)703));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1845938059: {
                    v2 = ns.lpst("ltam", lptv(int ), (int)704);
                    continue block59;
                }
                case -2811184: {
                    v2 = ns.lpst("ltan", lptv(int ), (int)705);
                    continue block59;
                }
                case 304457984: {
                    break block59;
                }
            }
            break;
        }
        var7_2 /* !! */  = ns.b;
        v3 /* !! */  = ns.uk;
        if (true) ** GOTO lbl25
        block60: while (true) {
            v3 /* !! */  = (long)(ns.lpst("ltap", lptv(int ), (int)707) - ns.lpst("ltao", lptv(int ), (int)706));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 304457984: {
                    break block60;
                }
                case 575441091: {
                    continue block60;
                }
            }
            break;
        }
        var6_3 = ns.a;
        if (var8_1) {
            throw null;
lbl33:
            // 9 sources

            return (boolean)ns.lpst("ltaq", lpsq(int ), (int)1519);
        }
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("ltar", lptv(int ), (int)708)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ns.lpst("ltas", lpsq(int ), (int)1520)) break;
            v4 /* !! */  = (long)ns.lpst("ltat", lpsq(int ), (int)1521);
        }
        v5 /* !! */  = ns.uk;
        if (true) ** GOTO lbl45
        block63: while (true) {
            v5 /* !! */  = (long)(v6 - ns.lpst("ltau", lptv(int ), (int)709));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -90306416: {
                    v6 = ns.lpst("ltav", lptv(int ), (int)710);
                    continue block63;
                }
                case 304457984: {
                    break block63;
                }
                case 1672405503: {
                    v6 = ns.lpst("ltaw", lptv(int ), (int)711);
                    continue block63;
                }
                case 1703630241: {
                    v6 = ns.lpst("ltax", lptv(int ), (int)712);
                    continue block63;
                }
            }
            break;
        }
        var1_4 = this.boundingBox.method_1014(1.0);
        if (var6_3 || var6_3) ** GOTO lbl33
        v7 /* !! */  = ns.uk;
        if (true) ** GOTO lbl63
        block64: while (true) {
            v7 /* !! */  = (long)(v8 - ns.lpst("ltay", lptv(int ), (int)713));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1975225143: {
                    v8 = ns.lpst("ltaz", lptv(int ), (int)714);
                    continue block64;
                }
                case 91879011: {
                    v8 = ns.lpst("ltba", lptv(int ), (int)715);
                    continue block64;
                }
                case 304457984: {
                    break block64;
                }
            }
            break;
        }
        v9 = var1_4.field_1323;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("ltbb", lptv(int ), (int)716)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ns.lpst("ltbc", lpsq(int ), (int)1522)) break;
            v10 /* !! */  = (long)ns.lpst("ltbd", lpsq(int ), (int)1523);
        }
        var2_5 = class_3532.method_15357((double)v9);
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("ltbe", lptv(int ), (int)717)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ns.lpst("ltbf", lpsq(int ), (int)1524)) break;
            v11 /* !! */  = (long)ns.lpst("ltbg", lpsq(int ), (int)1525);
        }
        v12 = var1_4.field_1320;
        v13 /* !! */  = ns.uk;
        if (true) ** GOTO lbl90
        block67: while (true) {
            v13 /* !! */  = (long)(ns.lpst("ltbi", lptv(int ), (int)719) - ns.lpst("ltbh", lptv(int ), (int)718));
lbl90:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -718352526: {
                    continue block67;
                }
                case 304457984: {
                    break block67;
                }
            }
            break;
        }
        var3_6 = class_3532.method_15384((double)v12);
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("ltbj", lptv(int ), (int)720)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ns.lpst("ltbk", lpsq(int ), (int)1526)) break;
            v14 /* !! */  = (long)ns.lpst("ltbl", lpsq(int ), (int)1527);
        }
        v15 = var1_4.field_1321;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("ltbm", lptv(int ), (int)721)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ns.lpst("ltbn", lpsq(int ), (int)1528)) break;
            v16 /* !! */  = (long)ns.lpst("ltbo", lpsq(int ), (int)1529);
        }
        var4_7 = class_3532.method_15357((double)v15);
        if (var6_3 || var6_3) ** GOTO lbl33
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("ltbp", lptv(int ), (int)722)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == ns.lpst("ltbq", lpsq(int ), (int)1530)) break;
            v17 /* !! */  = (long)ns.lpst("ltbr", lpsq(int ), (int)1531);
        }
        v18 = var1_4.field_1324;
        v19 /* !! */  = ns.uk;
        if (true) ** GOTO lbl120
        block71: while (true) {
            v19 /* !! */  = (long)(ns.lpst("ltbt", lptv(int ), (int)724) - ns.lpst("ltbs", lptv(int ), (int)723));
lbl120:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case 304457984: {
                    break block71;
                }
                case 635913635: {
                    continue block71;
                }
            }
            break;
        }
        var5_8 = class_3532.method_15384((double)v18);
        if (var6_3) ** GOTO lbl33
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) ** GOTO lbl33
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("ltbu", lptv(int ), (int)725)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ns.lpst("ltbv", lpsq(int ), (int)1532)) break;
                    v20 /* !! */  = (long)ns.lpst("ltbw", lpsq(int ), (int)1533);
                }
                v21 /* !! */  = ns.uk;
                if (true) ** GOTO lbl140
                block73: while (true) {
                    v21 /* !! */  = (long)(v22 - ns.lpst("ltbx", lptv(int ), (int)726));
lbl140:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -191806238: {
                            v22 = ns.lpst("ltby", lptv(int ), (int)727);
                            continue block73;
                        }
                        case 304457984: {
                            break block73;
                        }
                        case 1319486667: {
                            v22 = ns.lpst("ltbz", lptv(int ), (int)728);
                            continue block73;
                        }
                    }
                    break;
                }
                v23 = this.player.method_73183();
                v24 /* !! */  = ns.uk;
                if (true) ** GOTO lbl154
                block74: while (true) {
                    v24 /* !! */  = (long)(v25 - ns.lpst("ltca", lptv(int ), (int)729));
lbl154:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1245868122: {
                            v25 = ns.lpst("ltcb", lptv(int ), (int)730);
                            continue block74;
                        }
                        case -20932504: {
                            v25 = ns.lpst("ltcc", lptv(int ), (int)731);
                            continue block74;
                        }
                        case 304457984: {
                            break block74;
                        }
                    }
                    break;
                }
                if (v23.method_33597(var2_5, var4_7, var3_6, var5_8)) ** GOTO lbl169
                if (var6_3) ** GOTO lbl33
                v26 = ns.lpst("ltcd", lpsq(int ), (int)1534);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl172
lbl169:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                v26 = ns.lpst("ltce", lpsq(int ), (int)1535);
lbl172:
                // 2 sources

                return (boolean)v26;
            }
            case 0: {
                var7_2 /* !! */  = (int)ns.lpst("ltcf", lpsq(int ), (int)1536);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl178:
            // 2 sources

            case 1: {
                var7_2 /* !! */  = (int)ns.lpst("ltcg", lpsq(int ), (int)1537);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl183:
            // 2 sources

            case 2: {
                var7_2 /* !! */  = (int)ns.lpst("ltch", lpsq(int ), (int)1538);
                if (var8_1) {
                    throw null;
                }
            }
lbl187:
            // 4 sources

            case 3: {
                do {
                    var7_2 /* !! */  = (int)ns.lpst("ltci", lpsq(int ), (int)1539);
                } while (!var8_1);
                throw null;
            }
            case 4: {
                var7_2 /* !! */  = (int)ns.lpst("ltcj", lpsq(int ), (int)1540);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 5: {
                do {
                    var7_2 /* !! */  = (int)ns.lpst("ltck", lpsq(int ), (int)1541);
                } while (!var8_1);
                throw null;
            }
lbl202:
            // 2 sources

            case 6: {
                var7_2 /* !! */  = (int)ns.lpst("ltcl", lpsq(int ), (int)1542);
                if (!var8_1) ** GOTO lbl178
                throw null;
            }
lbl206:
            // 3 sources

            case 7: {
                var7_2 /* !! */  = (int)ns.lpst("ltcm", lpsq(int ), (int)1543);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 8: {
                var7_2 /* !! */  = (int)ns.lpst("ltcn", lpsq(int ), (int)1544);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 9: {
                do {
                    var7_2 /* !! */  = (int)ns.lpst("ltco", lpsq(int ), (int)1545);
                } while (!var8_1);
                throw null;
            }
            case 10: {
                do {
                    var7_2 /* !! */  = (int)ns.lpst("ltcp", lpsq(int ), (int)1546);
                } while (!var8_1);
                throw null;
            }
lbl226:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)ns.lpst("ltcq", lpsq(int ), (int)1547);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl244
                    break;
                }
            }
lbl232:
            // 2 sources

            case 12: {
                var7_2 /* !! */  = (int)ns.lpst("ltcr", lpsq(int ), (int)1548);
                if (!var8_1) ** GOTO lbl183
                throw null;
            }
            case 13: {
                var7_2 /* !! */  = (int)ns.lpst("ltcs", lpsq(int ), (int)1549);
                if (!var8_1) ** GOTO lbl202
                throw null;
            }
            case 14: {
                var7_2 /* !! */  = (int)ns.lpst("ltct", lpsq(int ), (int)1550);
                if (!var8_1) ** GOTO lbl206
                throw null;
            }
lbl244:
            // 3 sources

            case 15: {
                var7_2 /* !! */  = (int)ns.lpst("ltcu", lpsq(int ), (int)1551);
                if (!var8_1) ** GOTO lbl206
                throw null;
            }
lbl248:
            // 3 sources

            case 16: {
                var7_2 /* !! */  = (int)ns.lpst("ltcv", lpsq(int ), (int)1552);
                if (!var8_1) ** GOTO lbl232
                throw null;
            }
            case 17: 
        }
        var7_2 /* !! */  = (int)ns.lpst("ltcw", lpsq(int ), (int)1553);
        ** while (!var8_1)
lbl255:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void checkWaterState() {
        block103: {
            block102: {
                block101: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lslp", lptv(int ), (int)591)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == ns.lpst("lslq", lpsq(int ), (int)1245)) break;
                        v0 /* !! */  = (long)ns.lpst("lslr", lpsq(int ), (int)1246);
                    }
                    var4_1 = ns.c;
                    v1 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl11
                    block65: while (true) {
                        v1 /* !! */  = (long)(v2 - ns.lpst("lsls", lptv(int ), (int)592));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 304457984: {
                                break block65;
                            }
                            case 759961237: {
                                v2 = ns.lpst("lslt", lptv(int ), (int)593);
                                continue block65;
                            }
                            case 1542613562: {
                                v2 = ns.lpst("lslu", lptv(int ), (int)594);
                                continue block65;
                            }
                        }
                        break;
                    }
                    var3_2 /* !! */  = ns.b;
                    v3 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl25
                    block66: while (true) {
                        v3 /* !! */  = (long)(v4 - ns.lpst("lslv", lptv(int ), (int)595));
lbl25:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1619902371: {
                                v4 = ns.lpst("lslw", lptv(int ), (int)596);
                                continue block66;
                            }
                            case -203585805: {
                                v4 = ns.lpst("lslx", lptv(int ), (int)597);
                                continue block66;
                            }
                            case 304457984: {
                                break block66;
                            }
                            case 996947671: {
                                v4 = ns.lpst("lsly", lptv(int ), (int)598);
                                continue block66;
                            }
                        }
                        break;
                    }
                    var2_3 = ns.a;
                    if (var4_1) {
                        throw null;
lbl40:
                        // 12 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl40
                    v5 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl47
                    block68: while (true) {
                        v5 /* !! */  = (long)(v6 - ns.lpst("lslz", lptv(int ), (int)599));
lbl47:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -553645555: {
                                v6 = ns.lpst("lsma", lptv(int ), (int)600);
                                continue block68;
                            }
                            case 247937220: {
                                v6 = ns.lpst("lsmb", lptv(int ), (int)601);
                                continue block68;
                            }
                            case 304457984: {
                                break block68;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsmc", lptv(int ), (int)602)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == ns.lpst("lsmd", lpsq(int ), (int)1247)) break;
                        v7 /* !! */  = (long)ns.lpst("lsme", lpsq(int ), (int)1248);
                    }
                    if (!(this.player.method_5854() instanceof class_1690)) break block101;
                    if (var2_3 || var2_3) ** GOTO lbl40
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsmf", lptv(int ), (int)603)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == ns.lpst("lsmg", lpsq(int ), (int)1249)) break;
                        v8 /* !! */  = (long)ns.lpst("lsmh", lpsq(int ), (int)1250);
                    }
                    v9 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl72
                    block71: while (true) {
                        v9 /* !! */  = (long)(v10 - ns.lpst("lsmi", lptv(int ), (int)604));
lbl72:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1567439822: {
                                v10 = ns.lpst("lsmj", lptv(int ), (int)605);
                                continue block71;
                            }
                            case 304457984: {
                                break block71;
                            }
                            case 2059352537: {
                                v10 = ns.lpst("lsmk", lptv(int ), (int)606);
                                continue block71;
                            }
                        }
                        break;
                    }
                    var1_4 = (class_1690)this.player.method_5854();
                    if (var2_3 || var2_3) ** GOTO lbl40
                    v11 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl87
                    block72: while (true) {
                        v11 /* !! */  = (long)(ns.lpst("lsmm", lptv(int ), (int)608) - ns.lpst("lsml", lptv(int ), (int)607));
lbl87:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1084526419: {
                                continue block72;
                            }
                            case 304457984: {
                                break block72;
                            }
                        }
                        break;
                    }
                    if (var1_4.method_5869()) break block101;
                    if (var2_3 || var2_3) ** GOTO lbl40
                    v12 = ns.lpst("lsmn", lpsq(int ), (int)1251);
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lsmo", lptv(int ), (int)609)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == ns.lpst("lsmp", lpsq(int ), (int)1252)) break;
                        v13 /* !! */  = (long)ns.lpst("lsmq", lpsq(int ), (int)1253);
                    }
                    this.touchingWater = v12;
                    if (var2_3 || var2_3) ** GOTO lbl40
                    return;
                }
                if (var2_3 || var2_3) ** GOTO lbl40
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lsmr", lptv(int ), (int)610)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ns.lpst("lsms", lpsq(int ), (int)1254)) break;
                    v14 /* !! */  = (long)ns.lpst("lsmt", lpsq(int ), (int)1255);
                }
                v15 = ns.lpst("lsmu", lqfo(int ), (int)611);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lsmv", lptv(int ), (int)612)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ns.lpst("lsmw", lpsq(int ), (int)1256)) break;
                    v16 /* !! */  = (long)ns.lpst("lsmx", lpsq(int ), (int)1257);
                }
                if (!this.updateMovementInFluid((class_6862<class_3611>)class_3486.field_15517, (double)v15)) break block102;
                if (var2_3 || var2_3) ** GOTO lbl40
                v17 /* !! */  = ns.uk;
                if (true) ** GOTO lbl122
                block76: while (true) {
                    v17 /* !! */  = (long)(v18 - ns.lpst("lsmy", lptv(int ), (int)613));
lbl122:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1134496029: {
                            v18 = ns.lpst("lsmz", lptv(int ), (int)614);
                            continue block76;
                        }
                        case -1016807224: {
                            v18 = ns.lpst("lsna", lptv(int ), (int)615);
                            continue block76;
                        }
                        case 304457984: {
                            break block76;
                        }
                        case 919358188: {
                            v18 = ns.lpst("lsnb", lptv(int ), (int)616);
                            continue block76;
                        }
                    }
                    break;
                }
                this.onLanding();
                if (var2_3 || var2_3) ** GOTO lbl40
                v19 = ns.lpst("lsnc", lpsq(int ), (int)1258);
                v20 /* !! */  = ns.uk;
                if (true) ** GOTO lbl141
                block77: while (true) {
                    v20 /* !! */  = (long)(v21 - ns.lpst("lsnd", lptv(int ), (int)617));
lbl141:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 304457984: {
                            break block77;
                        }
                        case 645531020: {
                            v21 = ns.lpst("lsne", lptv(int ), (int)618);
                            continue block77;
                        }
                        case 1680380877: {
                            v21 = ns.lpst("lsnf", lptv(int ), (int)619);
                            continue block77;
                        }
                        case 1832079147: {
                            v21 = ns.lpst("lsng", lptv(int ), (int)620);
                            continue block77;
                        }
                    }
                    break;
                }
                this.touchingWater = v19;
                if (var2_3) ** GOTO lbl40
                if (var4_1) {
                    throw null;
                }
                break block103;
            }
            if (var2_3 || var2_3) ** GOTO lbl40
            v22 = ns.lpst("lsnh", lpsq(int ), (int)1259);
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lsni", lptv(int ), (int)621)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == ns.lpst("lsnj", lpsq(int ), (int)1260)) break;
                v23 /* !! */  = (long)ns.lpst("lsnk", lpsq(int ), (int)1261);
            }
            this.touchingWater = v22;
            if (var2_3) ** GOTO lbl40
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl175:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ns.lpst("lsnl", lpsq(int ), (int)1262);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 1: {
                var3_2 /* !! */  = (int)ns.lpst("lsnm", lpsq(int ), (int)1263);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ns.lpst("lsnn", lpsq(int ), (int)1264);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl201
                    break;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)ns.lpst("lsno", lpsq(int ), (int)1265);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl196:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)ns.lpst("lsnp", lpsq(int ), (int)1266);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl201:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)ns.lpst("lsnq", lpsq(int ), (int)1267);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl206:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)ns.lpst("lsnr", lpsq(int ), (int)1268);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl211:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)ns.lpst("lsns", lpsq(int ), (int)1269);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 8: {
                var3_2 /* !! */  = (int)ns.lpst("lsnt", lpsq(int ), (int)1270);
                if (!var4_1) break;
                throw null;
            }
lbl220:
            // 4 sources

            case 9: {
                var3_2 /* !! */  = (int)ns.lpst("lsnu", lpsq(int ), (int)1271);
                if (!var4_1) ** GOTO lbl196
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)ns.lpst("lsnv", lpsq(int ), (int)1272);
                if (!var4_1) ** GOTO lbl175
                throw null;
            }
            case 11: {
                do {
                    var3_2 /* !! */  = (int)ns.lpst("lsnw", lpsq(int ), (int)1273);
                } while (!var4_1);
                throw null;
            }
lbl233:
            // 4 sources

            case 12: {
                var3_2 /* !! */  = (int)ns.lpst("lsnx", lpsq(int ), (int)1274);
                if (!var4_1) ** GOTO lbl220
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)ns.lpst("lsny", lpsq(int ), (int)1275);
                if (!var4_1) ** GOTO lbl233
                throw null;
            }
lbl241:
            // 3 sources

            case 14: {
                var3_2 /* !! */  = (int)ns.lpst("lsnz", lpsq(int ), (int)1276);
                if (!var4_1) ** GOTO lbl220
                throw null;
            }
lbl245:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)ns.lpst("lsoa", lpsq(int ), (int)1277);
                if (!var4_1) ** GOTO lbl196
                throw null;
            }
lbl249:
            // 3 sources

            case 16: {
                var3_2 /* !! */  = (int)ns.lpst("lsob", lpsq(int ), (int)1278);
                if (!var4_1) ** GOTO lbl245
                throw null;
            }
            case 17: {
                var3_2 /* !! */  = (int)ns.lpst("lsoc", lpsq(int ), (int)1279);
                if (!var4_1) ** GOTO lbl249
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)ns.lpst("lsod", lpsq(int ), (int)1280);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl262:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)ns.lpst("lsoe", lpsq(int ), (int)1281);
                if (!var4_1) ** GOTO lbl249
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)ns.lpst("lsof", lpsq(int ), (int)1282);
                if (var4_1) {
                    throw null;
                }
            }
lbl270:
            // 4 sources

            case 21: {
                var3_2 /* !! */  = (int)ns.lpst("lsog", lpsq(int ), (int)1283);
                if (!var4_1) ** GOTO lbl241
                throw null;
            }
lbl274:
            // 2 sources

            case 22: {
                var3_2 /* !! */  = (int)ns.lpst("lsoh", lpsq(int ), (int)1284);
                if (!var4_1) ** GOTO lbl206
                throw null;
            }
lbl278:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)ns.lpst("lsoi", lpsq(int ), (int)1285);
                if (!var4_1) ** GOTO lbl220
                throw null;
            }
            case 24: 
        }
        var3_2 /* !! */  = (int)ns.lpst("lsoj", lpsq(int ), (int)1286);
        ** while (!var4_1)
lbl285:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void travel(class_243 var1_1) {
        block486: {
            block505: {
                block501: {
                    block502: {
                        block504: {
                            block503: {
                                block499: {
                                    block500: {
                                        block498: {
                                            block497: {
                                                block492: {
                                                    block496: {
                                                        block495: {
                                                            block494: {
                                                                block493: {
                                                                    block487: {
                                                                        block491: {
                                                                            block490: {
                                                                                block489: {
                                                                                    block488: {
                                                                                        block478: {
                                                                                            block485: {
                                                                                                block484: {
                                                                                                    block483: {
                                                                                                        block482: {
                                                                                                            block481: {
                                                                                                                block480: {
                                                                                                                    block479: {
                                                                                                                        block477: {
                                                                                                                            block476: {
                                                                                                                                block475: {
                                                                                                                                    block471: {
                                                                                                                                        block474: {
                                                                                                                                            block473: {
                                                                                                                                                block472: {
                                                                                                                                                    var21_2 = ns.c;
                                                                                                                                                    var20_3 /* !! */  = ns.b;
                                                                                                                                                    var19_4 = ns.a;
                                                                                                                                                    if (var21_2) {
                                                                                                                                                        throw null;
lbl6:
                                                                                                                                                        // 137 sources

                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                                    if (!this.isSwimming) break block471;
                                                                                                                                                    if (var19_4) ** GOTO lbl6
                                                                                                                                                    if (this.player.method_5765()) break block471;
                                                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                                    var2_5 = this.getRotationVector().field_1351;
                                                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                                    if (!(var2_5 < ns.lpst("lqkm", lqfo(int ), (int)178))) break block472;
                                                                                                                                                    if (var19_4) ** GOTO lbl6
                                                                                                                                                    v0 = ns.lpst("lqkn", lqfo(int ), (int)179);
                                                                                                                                                    if (var21_2) {
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    break block473;
                                                                                                                                                }
                                                                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                                v0 = var4_6 = ns.lpst("lqko", lqfo(int ), (int)180);
                                                                                                                                            }
                                                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                            var6_7 = new class_2338(class_3532.method_15357((double)this.pos.field_1352), class_3532.method_15357((double)(this.pos.field_1351 + 1.0 - ns.lpst("lqkp", lqfo(int ), (int)181))), class_3532.method_15357((double)this.pos.field_1350));
                                                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                            if (var2_5 <= 0.0) break block474;
                                                                                                                                            if (var19_4) ** GOTO lbl6
                                                                                                                                            if (this.input.playerInput.comp_3163()) break block474;
                                                                                                                                            if (var19_4) ** GOTO lbl6
                                                                                                                                            if (this.player.method_73183().method_8320(var6_7).method_26227().method_15769()) break block471;
                                                                                                                                            if (var19_4) ** GOTO lbl6
                                                                                                                                        }
                                                                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                        this.velocity = this.velocity.method_1031(0.0, (var2_5 - this.velocity.field_1351) * var4_6, 0.0);
                                                                                                                                        if (var19_4) ** GOTO lbl6
                                                                                                                                    }
                                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                    var2_5 = this.velocity.field_1351;
                                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                    var4_6 = ns.lpst("lqkq", lqfo(int ), (int)182);
                                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                    if (!(this.velocity.field_1351 <= 0.0)) break block475;
                                                                                                                                    if (var19_4) ** GOTO lbl6
                                                                                                                                    v1 = ns.lpst("lqkr", lpsq(int ), (int)277);
                                                                                                                                    if (var21_2) {
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    break block476;
                                                                                                                                }
                                                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                                v1 = var6_8 = ns.lpst("lqks", lpsq(int ), (int)278);
                                                                                                                            }
                                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                            if (!(this.velocity.field_1351 <= 0.0)) break block477;
                                                                                                                            if (var19_4) ** GOTO lbl6
                                                                                                                            if (!this.hasStatusEffect((class_6880<class_1291>)class_1294.field_5906)) break block477;
                                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                            var4_6 = ns.lpst("lqkt", lqfo(int ), (int)183);
                                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                            this.onLanding();
                                                                                                                            if (var19_4) ** GOTO lbl6
                                                                                                                        }
                                                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                        if (!this.isTouchingWater()) break block478;
                                                                                                                        if (var19_4) ** GOTO lbl6
                                                                                                                        if (!this.player.method_29920()) break block478;
                                                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                        var7_9 = this.pos.field_1351;
                                                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                        if (!this.isSprinting()) break block479;
                                                                                                                        if (var19_4) ** GOTO lbl6
                                                                                                                        v2 = ns.lpst("lqku", lqfy(int ), (int)279);
                                                                                                                        if (var21_2) {
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        break block480;
                                                                                                                    }
                                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                    v2 = var9_13 = ns.lpst("lqkv", lqfy(int ), (int)280);
                                                                                                                }
                                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                var10_16 = ns.lpst("lqkw", lqfy(int ), (int)281);
                                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                var11_19 = (float)this.getAttributeValue((class_6880<class_1320>)class_5134.field_51578);
                                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                if (this.onGround) break block481;
                                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                                var11_19 *= ns.lpst("lqkx", lqfy(int ), (int)282);
                                                                                                                if (var19_4) ** GOTO lbl6
                                                                                                            }
                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                            if (!(var11_19 > 0.0f)) break block482;
                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                            var9_13 += (ns.lpst("lqky", lqfy(int ), (int)283) - var9_13) * var11_19 / ns.lpst("lqkz", lqfy(int ), (int)284);
                                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                            var10_16 += (this.getMovementSpeed() - var10_16) * var11_19 / ns.lpst("lqla", lqfy(int ), (int)285);
                                                                                                            if (var19_4) ** GOTO lbl6
                                                                                                        }
                                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                        if (!this.hasStatusEffect((class_6880<class_1291>)class_1294.field_5900)) break block483;
                                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                        var9_13 = ns.lpst("lqlb", lqfy(int ), (int)286);
                                                                                                        if (var19_4) ** GOTO lbl6
                                                                                                    }
                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                    this.updateVelocity((float)var10_16, var1_1);
                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                    this.move(this.velocity);
                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                    var12_22 = this.velocity;
                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                    if (!this.horizontalCollision) break block484;
                                                                                                    if (var19_4) ** GOTO lbl6
                                                                                                    if (!this.isClimbing()) break block484;
                                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                    var12_22 = new class_243(var12_22.field_1352, (double)ns.lpst("lqlc", lqfo(int ), (int)184), var12_22.field_1350);
                                                                                                    if (var19_4) ** GOTO lbl6
                                                                                                }
                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                this.velocity = var12_22.method_18805((double)var9_13, (double)ns.lpst("lqld", lqfo(int ), (int)185), (double)var9_13);
                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                var13_24 = this.player.method_26317((double)var4_6, (boolean)var6_8, this.velocity);
                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                this.velocity = var13_24;
                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                if (!this.horizontalCollision) break block485;
                                                                                                if (var19_4) ** GOTO lbl6
                                                                                                if (!this.doesNotCollide(var13_24.field_1352, var13_24.field_1351 + ns.lpst("lqle", lqfo(int ), (int)186) - this.pos.field_1351 + var7_9, var13_24.field_1350)) break block485;
                                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                                this.velocity = new class_243(var13_24.field_1352, (double)ns.lpst("lqlf", lqfo(int ), (int)187), var13_24.field_1350);
                                                                                                if (var19_4) ** GOTO lbl6
                                                                                            }
                                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                                            if (var21_2) {
                                                                                                throw null;
                                                                                            }
                                                                                            break block486;
                                                                                        }
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        if (!this.isInLava()) break block487;
                                                                                        if (var19_4) ** GOTO lbl6
                                                                                        if (!this.player.method_29920()) break block487;
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        var7_10 = this.pos.field_1351;
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        this.updateVelocity((float)ns.lpst("lqlg", lqfy(int ), (int)287), var1_1);
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        this.move(this.velocity);
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        if (!(this.getFluidHeight((class_6862<class_3611>)class_3486.field_15518) <= this.getSwimHeight())) break block488;
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        this.velocity = this.velocity.method_18805((double)ns.lpst("lqlh", lqfo(int ), (int)188), (double)ns.lpst("lqli", lqfo(int ), (int)189), (double)ns.lpst("lqlj", lqfo(int ), (int)190));
                                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                                        this.velocity = this.player.method_26317((double)var4_6, (boolean)var6_8, this.velocity);
                                                                                        if (var19_4) ** GOTO lbl6
                                                                                        if (var21_2) {
                                                                                            throw null;
                                                                                        }
                                                                                        break block489;
                                                                                    }
                                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                                    this.velocity = this.velocity.method_1021((double)ns.lpst("lqlk", lqfo(int ), (int)191));
                                                                                    if (var19_4) ** GOTO lbl6
                                                                                }
                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                if (this.player.method_5740()) break block490;
                                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                                this.velocity = this.velocity.method_1031(0.0, (double)(-var4_6 / ns.lpst("lqll", lqfo(int ), (int)192)), 0.0);
                                                                                if (var19_4) ** GOTO lbl6
                                                                            }
                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                            if (!this.horizontalCollision) break block491;
                                                                            if (var19_4) ** GOTO lbl6
                                                                            if (!this.doesNotCollide(this.velocity.field_1352, this.velocity.field_1351 + ns.lpst("lqlm", lqfo(int ), (int)193) - this.pos.field_1351 + var7_10, this.velocity.field_1350)) break block491;
                                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                                            this.velocity = new class_243(this.velocity.field_1352, (double)ns.lpst("lqln", lqfo(int ), (int)194), this.velocity.field_1350);
                                                                            if (var19_4) ** GOTO lbl6
                                                                        }
                                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                                        if (var21_2) {
                                                                            throw null;
                                                                        }
                                                                        break block486;
                                                                    }
                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                    if (!this.isFallFlying) break block492;
                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                    var9_14 = this.velocity;
                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                    if (!(var9_14.field_1351 > ns.lpst("lqlo", lqfo(int ), (int)195))) break block493;
                                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                                    this.fallDistance = 1.0f;
                                                                    if (var19_4) ** GOTO lbl6
                                                                }
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var10_17 = this.getRotationVector();
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var11_20 = this.pitch * ns.lpst("lqlp", lqfy(int ), (int)288);
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var12_23 = Math.sqrt(var10_17.field_1352 * var10_17.field_1352 + var10_17.field_1350 * var10_17.field_1350);
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var14_25 = this.velocity.method_37267();
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var16_26 = var10_17.method_1033();
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var18_27 = class_3532.method_15362((double)var11_20);
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var18_27 = (float)((double)var18_27 * ((double)var18_27 * Math.min(1.0, var16_26 / ns.lpst("lqlq", lqfo(int ), (int)196))));
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var9_14 = this.velocity.method_1031(0.0, (double)(var4_6 * (ns.lpst("lqlr", lqfo(int ), (int)197) + (double)var18_27 * ns.lpst("lqls", lqfo(int ), (int)198))), 0.0);
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                if (!(var9_14.field_1351 < 0.0)) break block494;
                                                                if (var19_4) ** GOTO lbl6
                                                                if (!(var12_23 > 0.0)) break block494;
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var7_11 = var9_14.field_1351 * ns.lpst("lqlt", lqfo(int ), (int)199) * (double)var18_27;
                                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                                var9_14 = var9_14.method_1031(var10_17.field_1352 * var7_11 / var12_23, var7_11, var10_17.field_1350 * var7_11 / var12_23);
                                                                if (var19_4) ** GOTO lbl6
                                                            }
                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                            if (!(var11_20 < 0.0f)) break block495;
                                                            if (var19_4) ** GOTO lbl6
                                                            if (!(var12_23 > 0.0)) break block495;
                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                            var7_11 = var14_25 * (double)(-class_3532.method_15374((double)var11_20)) * ns.lpst("lqlu", lqfo(int ), (int)200);
                                                            if (var19_4 || var19_4) ** GOTO lbl6
                                                            var9_14 = var9_14.method_1031(-var10_17.field_1352 * var7_11 / var12_23, var7_11 * ns.lpst("lqlv", lqfo(int ), (int)201), -var10_17.field_1350 * var7_11 / var12_23);
                                                            if (var19_4) ** GOTO lbl6
                                                        }
                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                        if (!(var12_23 > 0.0)) break block496;
                                                        if (var19_4 || var19_4) ** GOTO lbl6
                                                        var9_14 = var9_14.method_1031((var10_17.field_1352 / var12_23 * var14_25 - var9_14.field_1352) * ns.lpst("lqlw", lqfo(int ), (int)202), 0.0, (var10_17.field_1350 / var12_23 * var14_25 - var9_14.field_1350) * ns.lpst("lqlx", lqfo(int ), (int)203));
                                                        if (var19_4) ** GOTO lbl6
                                                    }
                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                    this.velocity = var9_14.method_18805((double)ns.lpst("lqly", lqfo(int ), (int)204), (double)ns.lpst("lqlz", lqfo(int ), (int)205), (double)ns.lpst("lqma", lqfo(int ), (int)206));
                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                    this.move(this.velocity);
                                                    if (var19_4 || var19_4) ** GOTO lbl6
                                                    if (var21_2) {
                                                        throw null;
                                                    }
                                                    break block486;
                                                }
                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                var7_12 = this.getVelocityAffectingPos();
                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                var8_28 = this.player.method_73183().method_8320(var7_12).method_26204().method_9499();
                                                if (var19_4 || var19_4) ** GOTO lbl6
                                                if (!this.onGround) break block497;
                                                if (var19_4) ** GOTO lbl6
                                                v3 /* !! */  = var8_28 * ns.lpst("lqmb", lqfy(int ), (int)289);
                                                if (var21_2) {
                                                    throw null;
                                                }
                                                break block498;
                                            }
                                            if (var19_4 || var19_4) ** GOTO lbl6
                                            v3 /* !! */  = var9_15 /* !! */  = (float)ns.lpst("lqmc", lqfy(int ), (int)290);
                                        }
                                        if (var19_4 || var19_4) ** GOTO lbl6
                                        var10_18 = this.applyMovementInput(var1_1, var8_28);
                                        if (var19_4 || var19_4) ** GOTO lbl6
                                        var11_21 /* !! */  = var10_18.field_1351;
                                        if (var19_4 || var19_4) ** GOTO lbl6
                                        if (!this.hasStatusEffect((class_6880<class_1291>)class_1294.field_5902)) break block499;
                                        if (var19_4 || var19_4) ** GOTO lbl6
                                        var13_24 = this.getStatusEffect((class_6880<class_1291>)class_1294.field_5902);
                                        if (var19_4 || var19_4) ** GOTO lbl6
                                        if (var13_24 == null) break block500;
                                        if (var19_4 || var19_4) ** GOTO lbl6
                                        var11_21 /* !! */  += (ns.lpst("lqmd", lqfo(int ), (int)207) * (double)(var13_24.method_5578() + ns.lpst("lqme", lpsq(int ), (int)291)) - var10_18.field_1351) * ns.lpst("lqmf", lqfo(int ), (int)208);
                                        if (var19_4) ** GOTO lbl6
                                    }
                                    if (var19_4 || var19_4) ** GOTO lbl6
                                    if (var21_2) {
                                        throw null;
                                    }
                                    break block501;
                                }
                                if (var19_4 || var19_4) ** GOTO lbl6
                                if (!this.player.method_73183().method_8608()) break block502;
                                if (var19_4) ** GOTO lbl6
                                if (this.player.method_73183().method_22340(var7_12)) break block502;
                                if (var19_4 || var19_4) ** GOTO lbl6
                                if (!(this.pos.field_1351 > (double)this.player.method_73183().method_31607())) break block503;
                                if (var19_4) ** GOTO lbl6
                                v4 /* !! */  = ns.lpst("lqmg", lqfo(int ), (int)209);
                                if (var21_2) {
                                    throw null;
                                }
                                break block504;
                            }
                            if (var19_4 || var19_4) ** GOTO lbl6
                            v4 /* !! */  = (CallSite)0.0;
                        }
                        var11_21 /* !! */  = (double)v4 /* !! */ ;
                        if (var19_4) ** GOTO lbl6
                        if (var21_2) {
                            throw null;
                        }
                        break block501;
                    }
                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (this.player.method_5740()) break block501;
                    if (var19_4 || var19_4) ** GOTO lbl6
                    var11_21 /* !! */  -= var4_6;
                    if (var19_4) ** GOTO lbl6
                }
                if (var19_4 || var19_4) ** GOTO lbl6
                if (!this.player.method_35053()) break block505;
                if (var19_4 || var19_4) ** GOTO lbl6
                this.velocity = new class_243(var10_18.field_1352, var11_21 /* !! */ , var10_18.field_1350);
                if (var19_4) ** GOTO lbl6
                if (var21_2) {
                    throw null;
                }
                break block486;
            }
            if (var19_4 || var19_4) ** GOTO lbl6
            this.velocity = new class_243(var10_18.field_1352 * (double)var9_15 /* !! */ , var11_21 /* !! */  * ns.lpst("lqmh", lqfo(int ), (int)210), var10_18.field_1350 * (double)var9_15 /* !! */ );
            if (var19_4) ** GOTO lbl6
        }
        if (var19_4 || var19_4) ** GOTO lbl6
        if (!this.player.method_31549().field_7479) ** GOTO lbl329
        if (var19_4) ** GOTO lbl6
        if (this.player.method_5765()) ** GOTO lbl329
        if (var20_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_4 || var19_4) ** GOTO lbl6
                this.velocity = new class_243(this.velocity.field_1352, var2_5 * ns.lpst("lqmi", lqfo(int ), (int)211), this.velocity.field_1350);
                if (var19_4 || var19_4) ** GOTO lbl6
                this.onLanding();
                if (var19_4) ** GOTO lbl6
lbl329:
                // 3 sources

                if (!var19_4 && !var19_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var20_3 /* !! */  = (int)ns.lpst("lqmj", lpsq(int ), (int)292);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl337:
            // 3 sources

            case 1: {
                var20_3 /* !! */  = (int)ns.lpst("lqmk", lpsq(int ), (int)293);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl905
            }
            case 2: {
                var20_3 /* !! */  = (int)ns.lpst("lqml", lpsq(int ), (int)294);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl383
            }
            case 3: {
                var20_3 /* !! */  = (int)ns.lpst("lqmm", lpsq(int ), (int)295);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl550
            }
lbl352:
            // 4 sources

            case 4: {
                var20_3 /* !! */  = (int)ns.lpst("lqmn", lpsq(int ), (int)296);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl636
            }
lbl357:
            // 2 sources

            case 5: {
                var20_3 /* !! */  = (int)ns.lpst("lqmo", lpsq(int ), (int)297);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl952
            }
            case 6: {
                var20_3 /* !! */  = (int)ns.lpst("lqmp", lpsq(int ), (int)298);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl947
            }
lbl367:
            // 5 sources

            case 7: {
                var20_3 /* !! */  = (int)ns.lpst("lqmq", lpsq(int ), (int)299);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl613
            }
lbl372:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_3 /* !! */  = (int)ns.lpst("lqmr", lpsq(int ), (int)300);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl1178
                    break;
                }
            }
lbl378:
            // 3 sources

            case 9: {
                var20_3 /* !! */  = (int)ns.lpst("lqms", lpsq(int ), (int)301);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl599
            }
lbl383:
            // 3 sources

            case 10: {
                var20_3 /* !! */  = (int)ns.lpst("lqmt", lpsq(int ), (int)302);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1165
            }
            case 11: {
                var20_3 /* !! */  = (int)ns.lpst("lqmu", lpsq(int ), (int)303);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1165
            }
lbl393:
            // 2 sources

            case 12: {
                var20_3 /* !! */  = (int)ns.lpst("lqmv", lpsq(int ), (int)304);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1270
            }
            case 13: {
                var20_3 /* !! */  = (int)ns.lpst("lqmw", lpsq(int ), (int)305);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1258
            }
lbl403:
            // 4 sources

            case 14: {
                var20_3 /* !! */  = (int)ns.lpst("lqmx", lpsq(int ), (int)306);
                if (!var21_2) ** GOTO lbl378
                throw null;
            }
            case 15: {
                var20_3 /* !! */  = (int)ns.lpst("lqmy", lpsq(int ), (int)307);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl497
            }
            case 16: {
                var20_3 /* !! */  = (int)ns.lpst("lqmz", lpsq(int ), (int)308);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl662
            }
lbl417:
            // 2 sources

            case 17: {
                var20_3 /* !! */  = (int)ns.lpst("lqna", lpsq(int ), (int)309);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl626
            }
lbl422:
            // 3 sources

            case 18: {
                var20_3 /* !! */  = (int)ns.lpst("lqnb", lpsq(int ), (int)310);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl715
            }
lbl427:
            // 3 sources

            case 19: {
                var20_3 /* !! */  = (int)ns.lpst("lqnc", lpsq(int ), (int)311);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl715
            }
lbl432:
            // 2 sources

            case 20: {
                var20_3 /* !! */  = (int)ns.lpst("lqnd", lpsq(int ), (int)312);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl584
            }
lbl437:
            // 4 sources

            case 21: {
                var20_3 /* !! */  = (int)ns.lpst("lqne", lpsq(int ), (int)313);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl952
            }
lbl442:
            // 2 sources

            case 22: {
                var20_3 /* !! */  = (int)ns.lpst("lqnf", lpsq(int ), (int)314);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1009
            }
            case 23: {
                var20_3 /* !! */  = (int)ns.lpst("lqng", lpsq(int ), (int)315);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1295
            }
            case 24: {
                var20_3 /* !! */  = (int)ns.lpst("lqnh", lpsq(int ), (int)316);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl909
            }
lbl457:
            // 3 sources

            case 25: {
                var20_3 /* !! */  = (int)ns.lpst("lqni", lpsq(int ), (int)317);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1183
            }
lbl462:
            // 2 sources

            case 26: {
                var20_3 /* !! */  = (int)ns.lpst("lqnj", lpsq(int ), (int)318);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl686
            }
lbl467:
            // 2 sources

            case 27: {
                var20_3 /* !! */  = (int)ns.lpst("lqnk", lpsq(int ), (int)319);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl622
            }
lbl472:
            // 3 sources

            case 28: {
                var20_3 /* !! */  = (int)ns.lpst("lqnl", lpsq(int ), (int)320);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1009
            }
            case 29: {
                var20_3 /* !! */  = (int)ns.lpst("lqnm", lpsq(int ), (int)321);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl695
            }
lbl482:
            // 3 sources

            case 30: {
                var20_3 /* !! */  = (int)ns.lpst("lqnn", lpsq(int ), (int)322);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1352
            }
lbl487:
            // 2 sources

            case 31: {
                var20_3 /* !! */  = (int)ns.lpst("lqno", lpsq(int ), (int)323);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl800
            }
            case 32: {
                var20_3 /* !! */  = (int)ns.lpst("lqnp", lpsq(int ), (int)324);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl541
            }
lbl497:
            // 3 sources

            case 33: {
                var20_3 /* !! */  = (int)ns.lpst("lqnq", lpsq(int ), (int)325);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl820
            }
lbl502:
            // 2 sources

            case 34: {
                var20_3 /* !! */  = (int)ns.lpst("lqnr", lpsq(int ), (int)326);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1412
            }
lbl507:
            // 2 sources

            case 35: {
                var20_3 /* !! */  = (int)ns.lpst("lqns", lpsq(int ), (int)327);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl541
            }
            case 36: {
                var20_3 /* !! */  = (int)ns.lpst("lqnt", lpsq(int ), (int)328);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1254
            }
lbl517:
            // 2 sources

            case 37: {
                var20_3 /* !! */  = (int)ns.lpst("lqnu", lpsq(int ), (int)329);
                if (!var21_2) ** GOTO lbl437
                throw null;
            }
lbl521:
            // 3 sources

            case 38: {
                var20_3 /* !! */  = (int)ns.lpst("lqnv", lpsq(int ), (int)330);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl700
            }
lbl526:
            // 2 sources

            case 39: {
                var20_3 /* !! */  = (int)ns.lpst("lqnw", lpsq(int ), (int)331);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1249
            }
lbl531:
            // 3 sources

            case 40: {
                var20_3 /* !! */  = (int)ns.lpst("lqnx", lpsq(int ), (int)332);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1052
            }
lbl536:
            // 2 sources

            case 41: {
                var20_3 /* !! */  = (int)ns.lpst("lqny", lpsq(int ), (int)333);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl909
            }
lbl541:
            // 3 sources

            case 42: {
                var20_3 /* !! */  = (int)ns.lpst("lqnz", lpsq(int ), (int)334);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl820
            }
            case 43: {
                var20_3 /* !! */  = (int)ns.lpst("lqoa", lpsq(int ), (int)335);
                if (!var21_2) ** GOTO lbl526
                throw null;
            }
lbl550:
            // 3 sources

            case 44: {
                var20_3 /* !! */  = (int)ns.lpst("lqob", lpsq(int ), (int)336);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl796
            }
            case 45: {
                var20_3 /* !! */  = (int)ns.lpst("lqoc", lpsq(int ), (int)337);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1225
            }
            case 46: {
                var20_3 /* !! */  = (int)ns.lpst("lqod", lpsq(int ), (int)338);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1009
            }
            case 47: {
                var20_3 /* !! */  = (int)ns.lpst("lqoe", lpsq(int ), (int)339);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl734
            }
            case 48: {
                var20_3 /* !! */  = (int)ns.lpst("lqof", lpsq(int ), (int)340);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl835
            }
lbl575:
            // 4 sources

            case 49: {
                var20_3 /* !! */  = (int)ns.lpst("lqog", lpsq(int ), (int)341);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1136
            }
lbl580:
            // 3 sources

            case 50: {
                var20_3 /* !! */  = (int)ns.lpst("lqoh", lpsq(int ), (int)342);
                if (!var21_2) ** GOTO lbl422
                throw null;
            }
lbl584:
            // 2 sources

            case 51: {
                var20_3 /* !! */  = (int)ns.lpst("lqoi", lpsq(int ), (int)343);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1364
            }
lbl589:
            // 2 sources

            case 52: {
                var20_3 /* !! */  = (int)ns.lpst("lqoj", lpsq(int ), (int)344);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl961
            }
lbl594:
            // 3 sources

            case 53: {
                var20_3 /* !! */  = (int)ns.lpst("lqok", lpsq(int ), (int)345);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1066
            }
lbl599:
            // 3 sources

            case 54: {
                var20_3 /* !! */  = (int)ns.lpst("lqol", lpsq(int ), (int)346);
                if (!var21_2) ** GOTO lbl550
                throw null;
            }
lbl603:
            // 2 sources

            case 55: {
                var20_3 /* !! */  = (int)ns.lpst("lqom", lpsq(int ), (int)347);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1400
            }
lbl608:
            // 2 sources

            case 56: {
                var20_3 /* !! */  = (int)ns.lpst("lqon", lpsq(int ), (int)348);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl738
            }
lbl613:
            // 2 sources

            case 57: {
                var20_3 /* !! */  = (int)ns.lpst("lqoo", lpsq(int ), (int)349);
                if (!var21_2) ** GOTO lbl589
                throw null;
            }
            case 58: {
                var20_3 /* !! */  = (int)ns.lpst("lqop", lpsq(int ), (int)350);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1047
            }
lbl622:
            // 2 sources

            case 59: {
                var20_3 /* !! */  = (int)ns.lpst("lqoq", lpsq(int ), (int)351);
                if (!var21_2) ** GOTO lbl367
                throw null;
            }
lbl626:
            // 3 sources

            case 60: {
                var20_3 /* !! */  = (int)ns.lpst("lqor", lpsq(int ), (int)352);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1416
            }
            case 61: {
                var20_3 /* !! */  = (int)ns.lpst("lqos", lpsq(int ), (int)353);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1128
            }
lbl636:
            // 2 sources

            case 62: {
                var20_3 /* !! */  = (int)ns.lpst("lqot", lpsq(int ), (int)354);
                if (!var21_2) ** GOTO lbl507
                throw null;
            }
            case 63: {
                var20_3 /* !! */  = (int)ns.lpst("lqou", lpsq(int ), (int)355);
                if (!var21_2) ** GOTO lbl603
                throw null;
            }
            case 64: {
                var20_3 /* !! */  = (int)ns.lpst("lqov", lpsq(int ), (int)356);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl729
            }
            case 65: {
                var20_3 /* !! */  = (int)ns.lpst("lqow", lpsq(int ), (int)357);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1262
            }
            case 66: {
                var20_3 /* !! */  = (int)ns.lpst("lqox", lpsq(int ), (int)358);
                if (!var21_2) ** GOTO lbl442
                throw null;
            }
            case 67: {
                var20_3 /* !! */  = (int)ns.lpst("lqoy", lpsq(int ), (int)359);
                if (!var21_2) ** GOTO lbl432
                throw null;
            }
lbl662:
            // 3 sources

            case 68: {
                var20_3 /* !! */  = (int)ns.lpst("lqoz", lpsq(int ), (int)360);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl690
            }
            case 69: {
                var20_3 /* !! */  = (int)ns.lpst("lqpa", lpsq(int ), (int)361);
                if (!var21_2) ** GOTO lbl575
                throw null;
            }
            case 70: {
                var20_3 /* !! */  = (int)ns.lpst("lqpb", lpsq(int ), (int)362);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl952
            }
lbl676:
            // 2 sources

            case 71: {
                var20_3 /* !! */  = (int)ns.lpst("lqpc", lpsq(int ), (int)363);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1274
            }
lbl681:
            // 2 sources

            case 72: {
                var20_3 /* !! */  = (int)ns.lpst("lqpd", lpsq(int ), (int)364);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1165
            }
lbl686:
            // 2 sources

            case 73: {
                var20_3 /* !! */  = (int)ns.lpst("lqpe", lpsq(int ), (int)365);
                if (!var21_2) ** GOTO lbl462
                throw null;
            }
lbl690:
            // 4 sources

            case 74: {
                var20_3 /* !! */  = (int)ns.lpst("lqpf", lpsq(int ), (int)366);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1033
            }
lbl695:
            // 3 sources

            case 75: {
                var20_3 /* !! */  = (int)ns.lpst("lqpg", lpsq(int ), (int)367);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1392
            }
lbl700:
            // 2 sources

            case 76: {
                var20_3 /* !! */  = (int)ns.lpst("lqph", lpsq(int ), (int)368);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1249
            }
lbl705:
            // 2 sources

            case 77: {
                var20_3 /* !! */  = (int)ns.lpst("lqpi", lpsq(int ), (int)369);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1062
            }
            case 78: {
                var20_3 /* !! */  = (int)ns.lpst("lqpj", lpsq(int ), (int)370);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1157
            }
lbl715:
            // 4 sources

            case 79: {
                var20_3 /* !! */  = (int)ns.lpst("lqpk", lpsq(int ), (int)371);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1376
            }
            case 80: {
                var20_3 /* !! */  = (int)ns.lpst("lqpl", lpsq(int ), (int)372);
                if (!var21_2) ** GOTO lbl497
                throw null;
            }
            case 81: {
                var20_3 /* !! */  = (int)ns.lpst("lqpm", lpsq(int ), (int)373);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl840
            }
lbl729:
            // 2 sources

            case 82: {
                var20_3 /* !! */  = (int)ns.lpst("lqpn", lpsq(int ), (int)374);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1279
            }
lbl734:
            // 3 sources

            case 83: {
                var20_3 /* !! */  = (int)ns.lpst("lqpo", lpsq(int ), (int)375);
                if (!var21_2) ** GOTO lbl531
                throw null;
            }
lbl738:
            // 2 sources

            case 84: {
                var20_3 /* !! */  = (int)ns.lpst("lqpp", lpsq(int ), (int)376);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1038
            }
lbl743:
            // 2 sources

            case 85: {
                var20_3 /* !! */  = (int)ns.lpst("lqpq", lpsq(int ), (int)377);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1144
            }
lbl748:
            // 4 sources

            case 86: {
                var20_3 /* !! */  = (int)ns.lpst("lqpr", lpsq(int ), (int)378);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1200
            }
            case 87: {
                var20_3 /* !! */  = (int)ns.lpst("lqps", lpsq(int ), (int)379);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1254
            }
            case 88: {
                var20_3 /* !! */  = (int)ns.lpst("lqpt", lpsq(int ), (int)380);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1085
            }
            case 89: {
                var20_3 /* !! */  = (int)ns.lpst("lqpu", lpsq(int ), (int)381);
                if (!var21_2) ** GOTO lbl580
                throw null;
            }
            case 90: {
                var20_3 /* !! */  = (int)ns.lpst("lqpv", lpsq(int ), (int)382);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1225
            }
lbl772:
            // 2 sources

            case 91: {
                var20_3 /* !! */  = (int)ns.lpst("lqpw", lpsq(int ), (int)383);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1033
            }
            case 92: {
                var20_3 /* !! */  = (int)ns.lpst("lqpx", lpsq(int ), (int)384);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl873
            }
            case 93: {
                var20_3 /* !! */  = (int)ns.lpst("lqpy", lpsq(int ), (int)385);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1152
            }
lbl787:
            // 2 sources

            case 94: {
                var20_3 /* !! */  = (int)ns.lpst("lqpz", lpsq(int ), (int)386);
                if (!var21_2) ** GOTO lbl502
                throw null;
            }
            case 95: {
                var20_3 /* !! */  = (int)ns.lpst("lqqa", lpsq(int ), (int)387);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1038
            }
lbl796:
            // 2 sources

            case 96: {
                var20_3 /* !! */  = (int)ns.lpst("lqqb", lpsq(int ), (int)388);
                if (!var21_2) ** GOTO lbl695
                throw null;
            }
lbl800:
            // 3 sources

            case 97: {
                do {
                    var20_3 /* !! */  = (int)ns.lpst("lqqc", lpsq(int ), (int)389);
                } while (!var21_2);
                throw null;
            }
            case 98: {
                var20_3 /* !! */  = (int)ns.lpst("lqqd", lpsq(int ), (int)390);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1080
            }
lbl810:
            // 2 sources

            case 99: {
                var20_3 /* !! */  = (int)ns.lpst("lqqe", lpsq(int ), (int)391);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1200
            }
lbl815:
            // 2 sources

            case 100: {
                var20_3 /* !! */  = (int)ns.lpst("lqqf", lpsq(int ), (int)392);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1412
            }
lbl820:
            // 4 sources

            case 101: {
                var20_3 /* !! */  = (int)ns.lpst("lqqg", lpsq(int ), (int)393);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1344
            }
            case 102: {
                var20_3 /* !! */  = (int)ns.lpst("lqqh", lpsq(int ), (int)394);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl979
            }
lbl830:
            // 2 sources

            case 103: {
                var20_3 /* !! */  = (int)ns.lpst("lqqi", lpsq(int ), (int)395);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1025
            }
lbl835:
            // 2 sources

            case 104: {
                var20_3 /* !! */  = (int)ns.lpst("lqqj", lpsq(int ), (int)396);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1217
            }
lbl840:
            // 2 sources

            case 105: {
                var20_3 /* !! */  = (int)ns.lpst("lqqk", lpsq(int ), (int)397);
                if (!var21_2) ** GOTO lbl575
                throw null;
            }
lbl844:
            // 2 sources

            case 106: {
                var20_3 /* !! */  = (int)ns.lpst("lqql", lpsq(int ), (int)398);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl961
            }
            case 107: {
                var20_3 /* !! */  = (int)ns.lpst("lqqm", lpsq(int ), (int)399);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1062
            }
            case 108: {
                var20_3 /* !! */  = (int)ns.lpst("lqqn", lpsq(int ), (int)400);
                if (!var21_2) ** GOTO lbl820
                throw null;
            }
            case 109: {
                var20_3 /* !! */  = (int)ns.lpst("lqqo", lpsq(int ), (int)401);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl983
            }
lbl863:
            // 2 sources

            case 110: {
                var20_3 /* !! */  = (int)ns.lpst("lqqp", lpsq(int ), (int)402);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1249
            }
            case 111: {
                var20_3 /* !! */  = (int)ns.lpst("lqqq", lpsq(int ), (int)403);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl961
            }
lbl873:
            // 3 sources

            case 112: {
                var20_3 /* !! */  = (int)ns.lpst("lqqr", lpsq(int ), (int)404);
                if (!var21_2) ** GOTO lbl748
                throw null;
            }
            case 113: {
                var20_3 /* !! */  = (int)ns.lpst("lqqs", lpsq(int ), (int)405);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1328
            }
            case 114: {
                var20_3 /* !! */  = (int)ns.lpst("lqqt", lpsq(int ), (int)406);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1360
            }
lbl887:
            // 2 sources

            case 115: {
                var20_3 /* !! */  = (int)ns.lpst("lqqu", lpsq(int ), (int)407);
                if (!var21_2) ** GOTO lbl357
                throw null;
            }
            case 116: {
                var20_3 /* !! */  = (int)ns.lpst("lqqv", lpsq(int ), (int)408);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1340
            }
lbl896:
            // 3 sources

            case 117: {
                var20_3 /* !! */  = (int)ns.lpst("lqqw", lpsq(int ), (int)409);
                if (!var21_2) ** GOTO lbl352
                throw null;
            }
lbl900:
            // 2 sources

            case 118: {
                var20_3 /* !! */  = (int)ns.lpst("lqqx", lpsq(int ), (int)410);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1094
            }
lbl905:
            // 3 sources

            case 119: {
                var20_3 /* !! */  = (int)ns.lpst("lqqy", lpsq(int ), (int)411);
                if (!var21_2) ** GOTO lbl626
                throw null;
            }
lbl909:
            // 5 sources

            case 120: {
                var20_3 /* !! */  = (int)ns.lpst("lqqz", lpsq(int ), (int)412);
                if (!var21_2) ** GOTO lbl531
                throw null;
            }
            case 121: {
                var20_3 /* !! */  = (int)ns.lpst("lqra", lpsq(int ), (int)413);
                if (!var21_2) ** GOTO lbl467
                throw null;
            }
lbl917:
            // 3 sources

            case 122: {
                var20_3 /* !! */  = (int)ns.lpst("lqrb", lpsq(int ), (int)414);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1029
            }
            case 123: {
                var20_3 /* !! */  = (int)ns.lpst("lqrc", lpsq(int ), (int)415);
                if (!var21_2) ** GOTO lbl909
                throw null;
            }
lbl926:
            // 2 sources

            case 124: {
                var20_3 /* !! */  = (int)ns.lpst("lqrd", lpsq(int ), (int)416);
                if (!var21_2) ** GOTO lbl676
                throw null;
            }
            case 125: {
                var20_3 /* !! */  = (int)ns.lpst("lqre", lpsq(int ), (int)417);
                if (!var21_2) ** GOTO lbl748
                throw null;
            }
lbl934:
            // 2 sources

            case 126: {
                var20_3 /* !! */  = (int)ns.lpst("lqrf", lpsq(int ), (int)418);
                if (!var21_2) ** GOTO lbl417
                throw null;
            }
            case 127: {
                var20_3 /* !! */  = (int)ns.lpst("lqrg", lpsq(int ), (int)419);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1254
            }
            case 128: {
                var20_3 /* !! */  = (int)ns.lpst("lqrh", lpsq(int ), (int)420);
                if (!var21_2) ** GOTO lbl594
                throw null;
            }
lbl947:
            // 2 sources

            case 129: {
                var20_3 /* !! */  = (int)ns.lpst("lqri", lpsq(int ), (int)421);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1000
            }
lbl952:
            // 5 sources

            case 130: {
                var20_3 /* !! */  = (int)ns.lpst("lqrj", lpsq(int ), (int)422);
                if (!var21_2) ** GOTO lbl917
                throw null;
            }
lbl956:
            // 2 sources

            case 131: {
                var20_3 /* !! */  = (int)ns.lpst("lqrk", lpsq(int ), (int)423);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1304
            }
lbl961:
            // 4 sources

            case 132: {
                var20_3 /* !! */  = (int)ns.lpst("lqrl", lpsq(int ), (int)424);
                if (!var21_2) ** GOTO lbl337
                throw null;
            }
            case 133: {
                var20_3 /* !! */  = (int)ns.lpst("lqrm", lpsq(int ), (int)425);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1090
            }
            case 134: {
                var20_3 /* !! */  = (int)ns.lpst("lqrn", lpsq(int ), (int)426);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1237
            }
lbl975:
            // 2 sources

            case 135: {
                var20_3 /* !! */  = (int)ns.lpst("lqro", lpsq(int ), (int)427);
                if (!var21_2) ** GOTO lbl810
                throw null;
            }
lbl979:
            // 3 sources

            case 136: {
                var20_3 /* !! */  = (int)ns.lpst("lqrp", lpsq(int ), (int)428);
                if (!var21_2) ** GOTO lbl472
                throw null;
            }
lbl983:
            // 2 sources

            case 137: {
                var20_3 /* !! */  = (int)ns.lpst("lqrq", lpsq(int ), (int)429);
                if (!var21_2) ** GOTO lbl748
                throw null;
            }
            case 138: {
                var20_3 /* !! */  = (int)ns.lpst("lqrr", lpsq(int ), (int)430);
                if (!var21_2) ** GOTO lbl594
                throw null;
            }
            case 139: {
                var20_3 /* !! */  = (int)ns.lpst("lqrs", lpsq(int ), (int)431);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1038
            }
            case 140: {
                var20_3 /* !! */  = (int)ns.lpst("lqrt", lpsq(int ), (int)432);
                if (!var21_2) ** GOTO lbl900
                throw null;
            }
lbl1000:
            // 2 sources

            case 141: {
                var20_3 /* !! */  = (int)ns.lpst("lqru", lpsq(int ), (int)433);
                if (!var21_2) ** GOTO lbl536
                throw null;
            }
lbl1004:
            // 2 sources

            case 142: {
                var20_3 /* !! */  = (int)ns.lpst("lqrv", lpsq(int ), (int)434);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1042
            }
lbl1009:
            // 4 sources

            case 143: {
                var20_3 /* !! */  = (int)ns.lpst("lqrw", lpsq(int ), (int)435);
                if (!var21_2) ** GOTO lbl608
                throw null;
            }
            case 144: {
                var20_3 /* !! */  = (int)ns.lpst("lqrx", lpsq(int ), (int)436);
                if (!var21_2) ** GOTO lbl482
                throw null;
            }
            case 145: {
                var20_3 /* !! */  = (int)ns.lpst("lqry", lpsq(int ), (int)437);
                if (!var21_2) ** GOTO lbl393
                throw null;
            }
            case 146: {
                var20_3 /* !! */  = (int)ns.lpst("lqrz", lpsq(int ), (int)438);
                if (!var21_2) ** GOTO lbl437
                throw null;
            }
lbl1025:
            // 4 sources

            case 147: {
                var20_3 /* !! */  = (int)ns.lpst("lqsa", lpsq(int ), (int)439);
                if (!var21_2) ** GOTO lbl352
                throw null;
            }
lbl1029:
            // 2 sources

            case 148: {
                var20_3 /* !! */  = (int)ns.lpst("lqsb", lpsq(int ), (int)440);
                if (var21_2) {
                    throw null;
                }
            }
lbl1033:
            // 5 sources

            case 149: {
                var20_3 /* !! */  = (int)ns.lpst("lqsc", lpsq(int ), (int)441);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1071
            }
lbl1038:
            // 5 sources

            case 150: {
                var20_3 /* !! */  = (int)ns.lpst("lqsd", lpsq(int ), (int)442);
                if (!var21_2) ** GOTO lbl403
                throw null;
            }
lbl1042:
            // 2 sources

            case 151: {
                var20_3 /* !! */  = (int)ns.lpst("lqse", lpsq(int ), (int)443);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1295
            }
lbl1047:
            // 2 sources

            case 152: {
                var20_3 /* !! */  = (int)ns.lpst("lqsf", lpsq(int ), (int)444);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1212
            }
lbl1052:
            // 2 sources

            case 153: {
                var20_3 /* !! */  = (int)ns.lpst("lqsg", lpsq(int ), (int)445);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1266
            }
lbl1057:
            // 2 sources

            case 154: {
                var20_3 /* !! */  = (int)ns.lpst("lqsh", lpsq(int ), (int)446);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1107
            }
lbl1062:
            // 3 sources

            case 155: {
                var20_3 /* !! */  = (int)ns.lpst("lqsi", lpsq(int ), (int)447);
                if (!var21_2) ** GOTO lbl378
                throw null;
            }
lbl1066:
            // 2 sources

            case 156: {
                var20_3 /* !! */  = (int)ns.lpst("lqsj", lpsq(int ), (int)448);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1328
            }
lbl1071:
            // 3 sources

            case 157: {
                var20_3 /* !! */  = (int)ns.lpst("lqsk", lpsq(int ), (int)449);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1283
            }
            case 158: {
                var20_3 /* !! */  = (int)ns.lpst("lqsl", lpsq(int ), (int)450);
                if (!var21_2) ** GOTO lbl952
                throw null;
            }
lbl1080:
            // 2 sources

            case 159: {
                var20_3 /* !! */  = (int)ns.lpst("lqsm", lpsq(int ), (int)451);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1174
            }
lbl1085:
            // 2 sources

            case 160: {
                var20_3 /* !! */  = (int)ns.lpst("lqsn", lpsq(int ), (int)452);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1412
            }
lbl1090:
            // 2 sources

            case 161: {
                var20_3 /* !! */  = (int)ns.lpst("lqso", lpsq(int ), (int)453);
                if (!var21_2) ** GOTO lbl905
                throw null;
            }
lbl1094:
            // 3 sources

            case 162: {
                var20_3 /* !! */  = (int)ns.lpst("lqsp", lpsq(int ), (int)454);
                if (!var21_2) ** GOTO lbl917
                throw null;
            }
            case 163: {
                var20_3 /* !! */  = (int)ns.lpst("lqsq", lpsq(int ), (int)455);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1192
            }
lbl1103:
            // 3 sources

            case 164: {
                var20_3 /* !! */  = (int)ns.lpst("lqsr", lpsq(int ), (int)456);
                if (!var21_2) ** GOTO lbl367
                throw null;
            }
lbl1107:
            // 2 sources

            case 165: {
                var20_3 /* !! */  = (int)ns.lpst("lqss", lpsq(int ), (int)457);
                if (!var21_2) ** GOTO lbl896
                throw null;
            }
lbl1111:
            // 2 sources

            case 166: {
                var20_3 /* !! */  = (int)ns.lpst("lqst", lpsq(int ), (int)458);
                if (!var21_2) ** GOTO lbl873
                throw null;
            }
            case 167: {
                var20_3 /* !! */  = (int)ns.lpst("lqsu", lpsq(int ), (int)459);
                if (!var21_2) ** GOTO lbl909
                throw null;
            }
            case 168: {
                var20_3 /* !! */  = (int)ns.lpst("lqsv", lpsq(int ), (int)460);
                if (!var21_2) ** GOTO lbl681
                throw null;
            }
            case 169: {
                var20_3 /* !! */  = (int)ns.lpst("lqsw", lpsq(int ), (int)461);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1237
            }
lbl1128:
            // 2 sources

            case 170: {
                var20_3 /* !! */  = (int)ns.lpst("lqsx", lpsq(int ), (int)462);
                if (!var21_2) ** GOTO lbl427
                throw null;
            }
lbl1132:
            // 2 sources

            case 171: {
                var20_3 /* !! */  = (int)ns.lpst("lqsy", lpsq(int ), (int)463);
                if (!var21_2) ** GOTO lbl815
                throw null;
            }
lbl1136:
            // 2 sources

            case 172: {
                var20_3 /* !! */  = (int)ns.lpst("lqsz", lpsq(int ), (int)464);
                if (!var21_2) ** GOTO lbl934
                throw null;
            }
            case 173: {
                var20_3 /* !! */  = (int)ns.lpst("lqta", lpsq(int ), (int)465);
                if (!var21_2) ** GOTO lbl1071
                throw null;
            }
lbl1144:
            // 2 sources

            case 174: {
                var20_3 /* !! */  = (int)ns.lpst("lqtb", lpsq(int ), (int)466);
                if (!var21_2) ** GOTO lbl1103
                throw null;
            }
            case 175: {
                var20_3 /* !! */  = (int)ns.lpst("lqtc", lpsq(int ), (int)467);
                if (!var21_2) ** GOTO lbl403
                throw null;
            }
lbl1152:
            // 2 sources

            case 176: {
                do {
                    var20_3 /* !! */  = (int)ns.lpst("lqtd", lpsq(int ), (int)468);
                } while (!var21_2);
                throw null;
            }
lbl1157:
            // 2 sources

            case 177: {
                var20_3 /* !! */  = (int)ns.lpst("lqte", lpsq(int ), (int)469);
                if (!var21_2) ** GOTO lbl575
                throw null;
            }
            case 178: {
                var20_3 /* !! */  = (int)ns.lpst("lqtf", lpsq(int ), (int)470);
                if (!var21_2) ** GOTO lbl367
                throw null;
            }
lbl1165:
            // 4 sources

            case 179: {
                var20_3 /* !! */  = (int)ns.lpst("lqtg", lpsq(int ), (int)471);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1364
            }
            case 180: {
                var20_3 /* !! */  = (int)ns.lpst("lqth", lpsq(int ), (int)472);
                if (!var21_2) ** GOTO lbl599
                throw null;
            }
lbl1174:
            // 2 sources

            case 181: {
                var20_3 /* !! */  = (int)ns.lpst("lqti", lpsq(int ), (int)473);
                if (!var21_2) ** GOTO lbl715
                throw null;
            }
lbl1178:
            // 2 sources

            case 182: {
                var20_3 /* !! */  = (int)ns.lpst("lqtj", lpsq(int ), (int)474);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1392
            }
lbl1183:
            // 3 sources

            case 183: {
                var20_3 /* !! */  = (int)ns.lpst("lqtk", lpsq(int ), (int)475);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1408
            }
            case 184: {
                var20_3 /* !! */  = (int)ns.lpst("lqtl", lpsq(int ), (int)476);
                if (!var21_2) ** GOTO lbl521
                throw null;
            }
lbl1192:
            // 2 sources

            case 185: {
                var20_3 /* !! */  = (int)ns.lpst("lqtm", lpsq(int ), (int)477);
                if (!var21_2) ** GOTO lbl517
                throw null;
            }
            case 186: {
                var20_3 /* !! */  = (int)ns.lpst("lqtn", lpsq(int ), (int)478);
                if (!var21_2) ** GOTO lbl887
                throw null;
            }
lbl1200:
            // 4 sources

            case 187: {
                var20_3 /* !! */  = (int)ns.lpst("lqto", lpsq(int ), (int)479);
                if (!var21_2) ** GOTO lbl705
                throw null;
            }
            case 188: {
                var20_3 /* !! */  = (int)ns.lpst("lqtp", lpsq(int ), (int)480);
                if (!var21_2) ** GOTO lbl734
                throw null;
            }
            case 189: {
                var20_3 /* !! */  = (int)ns.lpst("lqtq", lpsq(int ), (int)481);
                if (!var21_2) ** GOTO lbl457
                throw null;
            }
lbl1212:
            // 2 sources

            case 190: {
                var20_3 /* !! */  = (int)ns.lpst("lqtr", lpsq(int ), (int)482);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1372
            }
lbl1217:
            // 2 sources

            case 191: {
                var20_3 /* !! */  = (int)ns.lpst("lqts", lpsq(int ), (int)483);
                if (!var21_2) ** GOTO lbl427
                throw null;
            }
            case 192: {
                var20_3 /* !! */  = (int)ns.lpst("lqtt", lpsq(int ), (int)484);
                if (!var21_2) ** GOTO lbl367
                throw null;
            }
lbl1225:
            // 3 sources

            case 193: {
                var20_3 /* !! */  = (int)ns.lpst("lqtu", lpsq(int ), (int)485);
                if (!var21_2) ** GOTO lbl457
                throw null;
            }
            case 194: {
                var20_3 /* !! */  = (int)ns.lpst("lqtv", lpsq(int ), (int)486);
                if (!var21_2) ** GOTO lbl422
                throw null;
            }
lbl1233:
            // 2 sources

            case 195: {
                var20_3 /* !! */  = (int)ns.lpst("lqtw", lpsq(int ), (int)487);
                if (!var21_2) ** GOTO lbl800
                throw null;
            }
lbl1237:
            // 3 sources

            case 196: {
                var20_3 /* !! */  = (int)ns.lpst("lqtx", lpsq(int ), (int)488);
                if (!var21_2) ** GOTO lbl863
                throw null;
            }
            case 197: {
                var20_3 /* !! */  = (int)ns.lpst("lqty", lpsq(int ), (int)489);
                if (!var21_2) ** GOTO lbl979
                throw null;
            }
lbl1245:
            // 2 sources

            case 198: {
                var20_3 /* !! */  = (int)ns.lpst("lqtz", lpsq(int ), (int)490);
                if (!var21_2) ** GOTO lbl1200
                throw null;
            }
lbl1249:
            // 4 sources

            case 199: {
                var20_3 /* !! */  = (int)ns.lpst("lqua", lpsq(int ), (int)491);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1376
            }
lbl1254:
            // 4 sources

            case 200: {
                var20_3 /* !! */  = (int)ns.lpst("lqub", lpsq(int ), (int)492);
                if (!var21_2) ** GOTO lbl1004
                throw null;
            }
lbl1258:
            // 2 sources

            case 201: {
                var20_3 /* !! */  = (int)ns.lpst("lquc", lpsq(int ), (int)493);
                if (!var21_2) ** GOTO lbl1025
                throw null;
            }
lbl1262:
            // 3 sources

            case 202: {
                var20_3 /* !! */  = (int)ns.lpst("lqud", lpsq(int ), (int)494);
                if (!var21_2) ** GOTO lbl975
                throw null;
            }
lbl1266:
            // 3 sources

            case 203: {
                var20_3 /* !! */  = (int)ns.lpst("lque", lpsq(int ), (int)495);
                if (!var21_2) ** GOTO lbl1103
                throw null;
            }
lbl1270:
            // 2 sources

            case 204: {
                var20_3 /* !! */  = (int)ns.lpst("lquf", lpsq(int ), (int)496);
                if (!var21_2) ** GOTO lbl1183
                throw null;
            }
lbl1274:
            // 2 sources

            case 205: {
                var20_3 /* !! */  = (int)ns.lpst("lqug", lpsq(int ), (int)497);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1300
            }
lbl1279:
            // 2 sources

            case 206: {
                var20_3 /* !! */  = (int)ns.lpst("lquh", lpsq(int ), (int)498);
                if (!var21_2) ** GOTO lbl926
                throw null;
            }
lbl1283:
            // 2 sources

            case 207: {
                var20_3 /* !! */  = (int)ns.lpst("lqui", lpsq(int ), (int)499);
                if (!var21_2) ** GOTO lbl743
                throw null;
            }
            case 208: {
                var20_3 /* !! */  = (int)ns.lpst("lquj", lpsq(int ), (int)500);
                if (!var21_2) ** GOTO lbl1057
                throw null;
            }
            case 209: {
                var20_3 /* !! */  = (int)ns.lpst("lquk", lpsq(int ), (int)501);
                if (!var21_2) ** GOTO lbl580
                throw null;
            }
lbl1295:
            // 3 sources

            case 210: {
                var20_3 /* !! */  = (int)ns.lpst("lqul", lpsq(int ), (int)502);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl1412
            }
lbl1300:
            // 2 sources

            case 211: {
                var20_3 /* !! */  = (int)ns.lpst("lqum", lpsq(int ), (int)503);
                if (!var21_2) ** GOTO lbl844
                throw null;
            }
lbl1304:
            // 3 sources

            case 212: {
                var20_3 /* !! */  = (int)ns.lpst("lqun", lpsq(int ), (int)504);
                if (!var21_2) ** GOTO lbl437
                throw null;
            }
lbl1308:
            // 2 sources

            case 213: {
                var20_3 /* !! */  = (int)ns.lpst("lquo", lpsq(int ), (int)505);
                if (!var21_2) ** GOTO lbl662
                throw null;
            }
            case 214: {
                var20_3 /* !! */  = (int)ns.lpst("lqup", lpsq(int ), (int)506);
                if (!var21_2) ** GOTO lbl956
                throw null;
            }
            case 215: {
                var20_3 /* !! */  = (int)ns.lpst("lquq", lpsq(int ), (int)507);
                if (!var21_2) ** GOTO lbl787
                throw null;
            }
            case 216: {
                var20_3 /* !! */  = (int)ns.lpst("lqur", lpsq(int ), (int)508);
                if (!var21_2) ** GOTO lbl1233
                throw null;
            }
            case 217: {
                var20_3 /* !! */  = (int)ns.lpst("lqus", lpsq(int ), (int)509);
                if (!var21_2) ** GOTO lbl1094
                throw null;
            }
lbl1328:
            // 3 sources

            case 218: {
                var20_3 /* !! */  = (int)ns.lpst("lqut", lpsq(int ), (int)510);
                if (!var21_2) ** GOTO lbl1262
                throw null;
            }
            case 219: {
                var20_3 /* !! */  = (int)ns.lpst("lquu", lpsq(int ), (int)511);
                if (!var21_2) ** GOTO lbl1266
                throw null;
            }
            case 220: {
                var20_3 /* !! */  = (int)ns.lpst("lquv", lpsq(int ), (int)512);
                if (!var21_2) ** GOTO lbl896
                throw null;
            }
lbl1340:
            // 2 sources

            case 221: {
                var20_3 /* !! */  = (int)ns.lpst("lquw", lpsq(int ), (int)513);
                if (!var21_2) ** GOTO lbl1038
                throw null;
            }
lbl1344:
            // 2 sources

            case 222: {
                var20_3 /* !! */  = (int)ns.lpst("lqux", lpsq(int ), (int)514);
                if (!var21_2) ** GOTO lbl1025
                throw null;
            }
            case 223: {
                var20_3 /* !! */  = (int)ns.lpst("lquy", lpsq(int ), (int)515);
                if (!var21_2) ** GOTO lbl690
                throw null;
            }
lbl1352:
            // 3 sources

            case 224: {
                var20_3 /* !! */  = (int)ns.lpst("lquz", lpsq(int ), (int)516);
                if (!var21_2) ** GOTO lbl482
                throw null;
            }
            case 225: {
                var20_3 /* !! */  = (int)ns.lpst("lqva", lpsq(int ), (int)517);
                if (!var21_2) ** GOTO lbl772
                throw null;
            }
lbl1360:
            // 2 sources

            case 226: {
                var20_3 /* !! */  = (int)ns.lpst("lqvb", lpsq(int ), (int)518);
                if (!var21_2) ** GOTO lbl1111
                throw null;
            }
lbl1364:
            // 3 sources

            case 227: {
                var20_3 /* !! */  = (int)ns.lpst("lqvc", lpsq(int ), (int)519);
                if (!var21_2) ** GOTO lbl1304
                throw null;
            }
            case 228: {
                var20_3 /* !! */  = (int)ns.lpst("lqvd", lpsq(int ), (int)520);
                if (!var21_2) ** GOTO lbl690
                throw null;
            }
lbl1372:
            // 2 sources

            case 229: {
                var20_3 /* !! */  = (int)ns.lpst("lqve", lpsq(int ), (int)521);
                if (!var21_2) ** GOTO lbl403
                throw null;
            }
lbl1376:
            // 3 sources

            case 230: {
                var20_3 /* !! */  = (int)ns.lpst("lqvf", lpsq(int ), (int)522);
                if (!var21_2) ** GOTO lbl337
                throw null;
            }
            case 231: {
                var20_3 /* !! */  = (int)ns.lpst("lqvg", lpsq(int ), (int)523);
                if (!var21_2) ** GOTO lbl487
                throw null;
            }
            case 232: {
                var20_3 /* !! */  = (int)ns.lpst("lqvh", lpsq(int ), (int)524);
                if (!var21_2) ** GOTO lbl830
                throw null;
            }
            case 233: {
                var20_3 /* !! */  = (int)ns.lpst("lqvi", lpsq(int ), (int)525);
                if (!var21_2) ** GOTO lbl372
                throw null;
            }
lbl1392:
            // 3 sources

            case 234: {
                var20_3 /* !! */  = (int)ns.lpst("lqvj", lpsq(int ), (int)526);
                if (!var21_2) ** GOTO lbl1308
                throw null;
            }
            case 235: {
                var20_3 /* !! */  = (int)ns.lpst("lqvk", lpsq(int ), (int)527);
                if (!var21_2) ** GOTO lbl383
                throw null;
            }
lbl1400:
            // 2 sources

            case 236: {
                var20_3 /* !! */  = (int)ns.lpst("lqvl", lpsq(int ), (int)528);
                if (!var21_2) ** GOTO lbl1245
                throw null;
            }
            case 237: {
                var20_3 /* !! */  = (int)ns.lpst("lqvm", lpsq(int ), (int)529);
                if (!var21_2) ** GOTO lbl1132
                throw null;
            }
lbl1408:
            // 2 sources

            case 238: {
                var20_3 /* !! */  = (int)ns.lpst("lqvn", lpsq(int ), (int)530);
                if (!var21_2) ** GOTO lbl472
                throw null;
            }
lbl1412:
            // 5 sources

            case 239: {
                var20_3 /* !! */  = (int)ns.lpst("lqvo", lpsq(int ), (int)531);
                if (!var21_2) ** GOTO lbl1352
                throw null;
            }
lbl1416:
            // 2 sources

            case 240: {
                var20_3 /* !! */  = (int)ns.lpst("lqvp", lpsq(int ), (int)532);
                if (!var21_2) ** GOTO lbl352
                throw null;
            }
            case 241: 
        }
        var20_3 /* !! */  = (int)ns.lpst("lqvq", lpsq(int ), (int)533);
        ** while (!var21_2)
lbl1423:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltql() {
        ns.lpsr[1600] = -1322220954;
        ns.lpsr[1601] = 687698024;
        ns.lpsr[1602] = 850420783;
        ns.lpsr[1603] = -2113892365;
        ns.lpsr[1604] = 866982253;
        ns.lpsr[1605] = -462770196;
        ns.lpsr[1606] = 460367196;
        ns.lpsr[1607] = 355519758;
        ns.lpsr[1608] = 1644048641;
        ns.lpsr[1609] = 113258540;
        ns.lpsr[1610] = -245581817;
        ns.lpsr[1611] = -172084578;
        ns.lpsr[1612] = -209084641;
        ns.lpsr[1613] = 1230978063;
        ns.lpsr[1614] = -2077538454;
        ns.lpsr[1615] = 1140017699;
        ns.lpsr[1616] = -1962062271;
        ns.lpsr[1617] = -384226796;
        ns.lpsr[1618] = 134560601;
        ns.lpsr[1619] = -2144186717;
        ns.lpsr[1620] = -1723096027;
        ns.lpsr[1621] = 1578203014;
        ns.lpsr[1622] = 493282242;
        ns.lpsr[1623] = 158440803;
        ns.lpsr[1624] = 70197067;
        ns.lpsr[1625] = -1588151109;
        ns.lpsr[1626] = -362823854;
        ns.lpsr[1627] = -1641092062;
        ns.lpsr[1628] = -1273316302;
        ns.lpsr[1629] = -1009772568;
        ns.lpsr[1630] = 550467165;
        ns.lpsr[1631] = -1270856883;
        ns.lpsr[1632] = 1869369214;
        ns.lpsr[1633] = 411789793;
        ns.lpsr[1634] = -1743970140;
        ns.lpsr[1635] = 2121415752;
        ns.lpsr[1636] = 1683003296;
        ns.lpsr[1637] = -309586752;
        ns.lpsr[1638] = 535026872;
        ns.lpsr[1639] = -1405599408;
        ns.lpsr[1640] = -394415736;
        ns.lpsr[1641] = 589157905;
        ns.lpsr[1642] = -1747374375;
        ns.lpsr[1643] = 280641476;
        ns.lpsr[1644] = -896048596;
        ns.lpsr[1645] = 2097998979;
        ns.lpsr[1646] = -273167407;
        ns.lpsr[1647] = 1136005628;
        ns.lpsr[1648] = 1320924508;
        ns.lpsr[1649] = 186420145;
        ns.lpsr[1650] = -1504072921;
        ns.lpsr[1651] = 732600046;
        ns.lpsr[1652] = -1993334285;
        ns.lpsr[1653] = 1059389374;
        ns.lpsr[1654] = 1960621109;
        ns.lpsr[1655] = 2112146556;
        ns.lpsr[1656] = -1800581214;
        ns.lpsr[1657] = -578626922;
        ns.lpsr[1658] = 644983317;
        ns.lpsr[1659] = -446302200;
        ns.lpsr[1660] = -1473346468;
        ns.lpsr[1661] = -507649574;
        ns.lpsr[1662] = -1629647531;
        ns.lpsr[1663] = -1687620409;
        ns.lpsr[1664] = 1663097586;
        ns.lpsr[1665] = -1310636927;
        ns.lpsr[1666] = -1076438305;
        ns.lpsr[1667] = -1832106074;
        ns.lpsr[1668] = -1139246351;
        ns.lpsr[1669] = 347697400;
        ns.lpsr[1670] = -1986160750;
        ns.lpsr[1671] = -442810426;
        ns.lpsr[1672] = 798614920;
        ns.lpsr[1673] = -1788167599;
        ns.lpsr[1674] = -446403227;
        ns.lpsr[1675] = 1861750138;
        ns.lpsr[1676] = -1278780014;
        ns.lpsr[1677] = 968939645;
        ns.lpsr[1678] = -1383689467;
        ns.lpsr[1679] = -46364544;
        ns.lpsr[1680] = -2058419673;
        ns.lpsr[1681] = -2140406439;
        ns.lpsr[1682] = -1445405573;
        ns.lpsr[1683] = 1722611727;
        ns.lpsr[1684] = -1158686533;
        ns.lpsr[1685] = -1034988909;
        ns.lpsr[1686] = 887214904;
        ns.lpsr[1687] = -662698018;
        ns.lpsr[1688] = 813530106;
        ns.lpsr[1689] = -2135563785;
        ns.lpsr[1690] = -1214895814;
        ns.lpsr[1691] = 2127929160;
        ns.lpsr[1692] = -337498103;
        ns.lpsr[1693] = 661848170;
        ns.lpsr[1694] = -629344077;
        ns.lpsr[1695] = -1332394398;
        ns.lpsr[1696] = -1912907916;
        ns.lpsr[1697] = 270030800;
        ns.lpsr[1698] = -1438614508;
        ns.lpsr[1699] = 13920959;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double getEyeY() {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - ns.lpst("lssx", lptv(int ), (int)660));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 304457984: {
                    break block24;
                }
                case 684374075: {
                    v1 = ns.lpst("lssy", lptv(int ), (int)661);
                    continue block24;
                }
                case 1637237506: {
                    v1 = ns.lpst("lssz", lptv(int ), (int)662);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = ns.c;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(ns.lpst("lstb", lptv(int ), (int)664) - ns.lpst("lsta", lptv(int ), (int)663));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1476210366: {
                    continue block25;
                }
                case 304457984: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = ns.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lstc", lptv(int ), (int)665)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ns.lpst("lstd", lpsq(int ), (int)1366)) break;
            v3 /* !! */  = (long)ns.lpst("lste", lpsq(int ), (int)1367);
        }
        var1_3 = ns.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (double)ns.lpst("lstf", lqfo(int ), (int)666);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block27;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lstg", lptv(int ), (int)667)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ns.lpst("lsth", lpsq(int ), (int)1368)) break;
                    v4 /* !! */  = (long)ns.lpst("lsti", lpsq(int ), (int)1369);
                }
                v5 /* !! */  = ns.uk;
                if (true) ** GOTO lbl49
                block29: while (true) {
                    v5 /* !! */  = (long)(ns.lpst("lstk", lptv(int ), (int)669) - ns.lpst("lstj", lptv(int ), (int)668));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -610560166: {
                            continue block29;
                        }
                        case 304457984: {
                            break block29;
                        }
                    }
                    break;
                }
                v6 = this.pos.field_1351;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lstl", lptv(int ), (int)670)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ns.lpst("lstm", lpsq(int ), (int)1370)) break;
                    v7 /* !! */  = (long)ns.lpst("lstn", lpsq(int ), (int)1371);
                }
                v8 /* !! */  = ns.uk;
                if (true) ** GOTO lbl65
                block31: while (true) {
                    v8 /* !! */  = (long)(v9 - ns.lpst("lsto", lptv(int ), (int)671));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1798270385: {
                            v9 = ns.lpst("lstp", lptv(int ), (int)672);
                            continue block31;
                        }
                        case 304457984: {
                            break block31;
                        }
                        case 609922251: {
                            v9 = ns.lpst("lstq", lptv(int ), (int)673);
                            continue block31;
                        }
                    }
                    break;
                }
                return v6 + (double)this.player.method_5751();
                case 0: {
                    var2_2 /* !! */  = (int)ns.lpst("lstr", lpsq(int ), (int)1372);
                    if (!var3_1) break block27;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)ns.lpst("lsts", lpsq(int ), (int)1373);
                    if (!var3_1) break block27;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ns.lpst("lstt", lpsq(int ), (int)1374);
                        if (!var3_1) break block27;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ns.lpst("lstu", lpsq(int ), (int)1375);
        ** while (!var3_1)
lbl91:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqy() {
        ns.lpss[1100] = -924330920;
        ns.lpss[1101] = -2025866081;
        ns.lpss[1102] = 1389059934;
        ns.lpss[1103] = -543233010;
        ns.lpss[1104] = 1027619935;
        ns.lpss[1105] = -1540301105;
        ns.lpss[1106] = 1160843301;
        ns.lpss[1107] = -110220956;
        ns.lpss[1108] = 3072365;
        ns.lpss[1109] = 1249992940;
        ns.lpss[1110] = -245103991;
        ns.lpss[1111] = 675509543;
        ns.lpss[1112] = 1530066266;
        ns.lpss[1113] = 2077647588;
        ns.lpss[1114] = 1641427078;
        ns.lpss[1115] = -981746075;
        ns.lpss[1116] = 412233205;
        ns.lpss[1117] = 717646807;
        ns.lpss[1118] = 475758562;
        ns.lpss[1119] = -2078495695;
        ns.lpss[1120] = -913384574;
        ns.lpss[1121] = 1969649584;
        ns.lpss[1122] = 1125817975;
        ns.lpss[1123] = -648531536;
        ns.lpss[1124] = -742859929;
        ns.lpss[1125] = 2120807016;
        ns.lpss[1126] = 194560960;
        ns.lpss[1127] = -1377572288;
        ns.lpss[1128] = -21480794;
        ns.lpss[1129] = 1224195037;
        ns.lpss[1130] = -109388384;
        ns.lpss[1131] = 2071119136;
        ns.lpss[1132] = 242149763;
        ns.lpss[1133] = 1940061344;
        ns.lpss[1134] = 350004902;
        ns.lpss[1135] = 746231914;
        ns.lpss[1136] = -1659927190;
        ns.lpss[1137] = 1671951374;
        ns.lpss[1138] = 1191992466;
        ns.lpss[1139] = -137662656;
        ns.lpss[1140] = -429073640;
        ns.lpss[1141] = -1198454971;
        ns.lpss[1142] = -1642586397;
        ns.lpss[1143] = -806735537;
        ns.lpss[1144] = 2130212060;
        ns.lpss[1145] = -1748432550;
        ns.lpss[1146] = -725956909;
        ns.lpss[1147] = -1827791696;
        ns.lpss[1148] = 1928601607;
        ns.lpss[1149] = 941590696;
        ns.lpss[1150] = 1063090379;
        ns.lpss[1151] = 1903962645;
        ns.lpss[1152] = -1122511439;
        ns.lpss[1153] = 1192927310;
        ns.lpss[1154] = 1811062682;
        ns.lpss[1155] = 415939543;
        ns.lpss[1156] = 264423769;
        ns.lpss[1157] = -1306668092;
        ns.lpss[1158] = 688614663;
        ns.lpss[1159] = 1921232063;
        ns.lpss[1160] = -1668389634;
        ns.lpss[1161] = -1880288014;
        ns.lpss[1162] = 1986626074;
        ns.lpss[1163] = -1038429054;
        ns.lpss[1164] = 1152222879;
        ns.lpss[1165] = 1543958783;
        ns.lpss[1166] = -1795079080;
        ns.lpss[1167] = -1507085269;
        ns.lpss[1168] = 1422220218;
        ns.lpss[1169] = 1665629360;
        ns.lpss[1170] = -1747081942;
        ns.lpss[1171] = -58555943;
        ns.lpss[1172] = 12057998;
        ns.lpss[1173] = 1096892289;
        ns.lpss[1174] = 933528144;
        ns.lpss[1175] = 818114886;
        ns.lpss[1176] = 1617036960;
        ns.lpss[1177] = -983917141;
        ns.lpss[1178] = 1432911943;
        ns.lpss[1179] = 729722037;
        ns.lpss[1180] = 1673430082;
        ns.lpss[1181] = -560226354;
        ns.lpss[1182] = 944153960;
        ns.lpss[1183] = -1911822264;
        ns.lpss[1184] = 1190402454;
        ns.lpss[1185] = -39234852;
        ns.lpss[1186] = -1840966721;
        ns.lpss[1187] = 1331287005;
        ns.lpss[1188] = 1064890713;
        ns.lpss[1189] = 929241119;
        ns.lpss[1190] = -436166363;
        ns.lpss[1191] = 2130011141;
        ns.lpss[1192] = -1298071482;
        ns.lpss[1193] = -419560197;
        ns.lpss[1194] = 1659849883;
        ns.lpss[1195] = -870508347;
        ns.lpss[1196] = -1723925789;
        ns.lpss[1197] = -1795168299;
        ns.lpss[1198] = 494012247;
        ns.lpss[1199] = -1669267503;
    }

    private static /* synthetic */ void ltrb() {
        ns.lpss[1400] = -2068408405;
        ns.lpss[1401] = 2021248668;
        ns.lpss[1402] = 1038279261;
        ns.lpss[1403] = -1715282590;
        ns.lpss[1404] = -103903303;
        ns.lpss[1405] = 5941104;
        ns.lpss[1406] = 590298268;
        ns.lpss[1407] = -1135631190;
        ns.lpss[1408] = 596879357;
        ns.lpss[1409] = -460869370;
        ns.lpss[1410] = -1745017746;
        ns.lpss[1411] = -1203026983;
        ns.lpss[1412] = -232186277;
        ns.lpss[1413] = 152962919;
        ns.lpss[1414] = -503441338;
        ns.lpss[1415] = 13221281;
        ns.lpss[1416] = -1421867350;
        ns.lpss[1417] = -1985669634;
        ns.lpss[1418] = -316670042;
        ns.lpss[1419] = 756211282;
        ns.lpss[1420] = -1220299842;
        ns.lpss[1421] = -1792967499;
        ns.lpss[1422] = -1289113809;
        ns.lpss[1423] = -1037901383;
        ns.lpss[1424] = -825150103;
        ns.lpss[1425] = -1446959227;
        ns.lpss[1426] = -696105814;
        ns.lpss[1427] = 802601358;
        ns.lpss[1428] = 28771800;
        ns.lpss[1429] = -709887484;
        ns.lpss[1430] = -749392636;
        ns.lpss[1431] = 509228334;
        ns.lpss[1432] = 1484237116;
        ns.lpss[1433] = 978526274;
        ns.lpss[1434] = -2048784743;
        ns.lpss[1435] = -232492916;
        ns.lpss[1436] = -1285282900;
        ns.lpss[1437] = 916986070;
        ns.lpss[1438] = 980542388;
        ns.lpss[1439] = -1160266135;
        ns.lpss[1440] = -1404212919;
        ns.lpss[1441] = -2084451277;
        ns.lpss[1442] = -1962954410;
        ns.lpss[1443] = -1795587645;
        ns.lpss[1444] = 1847209122;
        ns.lpss[1445] = -1825618625;
        ns.lpss[1446] = 1530512950;
        ns.lpss[1447] = -1396069750;
        ns.lpss[1448] = -1837060262;
        ns.lpss[1449] = 2008866598;
        ns.lpss[1450] = -1721836023;
        ns.lpss[1451] = -2134324839;
        ns.lpss[1452] = -403015416;
        ns.lpss[1453] = 1991900266;
        ns.lpss[1454] = -640088829;
        ns.lpss[1455] = -403247133;
        ns.lpss[1456] = 1929517150;
        ns.lpss[1457] = 1341823806;
        ns.lpss[1458] = 10303388;
        ns.lpss[1459] = 1506069741;
        ns.lpss[1460] = 1544114828;
        ns.lpss[1461] = 644700948;
        ns.lpss[1462] = -1904297321;
        ns.lpss[1463] = 1465106555;
        ns.lpss[1464] = -1181195034;
        ns.lpss[1465] = 1603520372;
        ns.lpss[1466] = -1374589121;
        ns.lpss[1467] = -432483442;
        ns.lpss[1468] = 434977988;
        ns.lpss[1469] = -2035024881;
        ns.lpss[1470] = 598124531;
        ns.lpss[1471] = 1203883149;
        ns.lpss[1472] = 1400621481;
        ns.lpss[1473] = 1316484628;
        ns.lpss[1474] = -224116507;
        ns.lpss[1475] = 1811600065;
        ns.lpss[1476] = -702624346;
        ns.lpss[1477] = -769644863;
        ns.lpss[1478] = 137232670;
        ns.lpss[1479] = -1331276538;
        ns.lpss[1480] = 2044383232;
        ns.lpss[1481] = -1414259908;
        ns.lpss[1482] = -199915579;
        ns.lpss[1483] = -515889217;
        ns.lpss[1484] = -2113202672;
        ns.lpss[1485] = -537571934;
        ns.lpss[1486] = -1652209249;
        ns.lpss[1487] = -247460342;
        ns.lpss[1488] = 1189791338;
        ns.lpss[1489] = -528125088;
        ns.lpss[1490] = -1524669735;
        ns.lpss[1491] = -866180556;
        ns.lpss[1492] = 569023041;
        ns.lpss[1493] = 1777523906;
        ns.lpss[1494] = -2104409851;
        ns.lpss[1495] = -857288337;
        ns.lpss[1496] = -446316279;
        ns.lpss[1497] = 326285769;
        ns.lpss[1498] = 1546217826;
        ns.lpss[1499] = -716742974;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean updateMovementInFluid(class_6862<class_3611> var1_1, double var2_2) {
        block214: {
            var27_3 = ns.c;
            var26_4 /* !! */  = ns.b;
            var25_5 = ns.a;
            if (var27_3) {
                throw null;
lbl6:
                // 60 sources

                return (boolean)ns.lpst("lsvr", lpsq(int ), (int)1402);
            }
            if (var25_5 || var25_5) ** GOTO lbl6
            if (!this.isRegionUnloaded()) break block214;
            if (var25_5 || var25_5) ** GOTO lbl6
            return (boolean)ns.lpst("lsvs", lpsq(int ), (int)1403);
        }
        if (var25_5 || var25_5) ** GOTO lbl6
        var4_6 = this.boundingBox.method_1011((double)ns.lpst("lsvt", lqfo(int ), (int)696));
        if (var25_5 || var25_5) ** GOTO lbl6
        var5_7 = class_3532.method_15357((double)var4_6.field_1323);
        if (var25_5 || var25_5) ** GOTO lbl6
        var6_8 = class_3532.method_15384((double)var4_6.field_1320);
        if (var25_5 || var25_5) ** GOTO lbl6
        var7_9 = class_3532.method_15357((double)var4_6.field_1322);
        if (var25_5 || var25_5) ** GOTO lbl6
        var8_10 = class_3532.method_15384((double)var4_6.field_1325);
        if (var25_5 || var25_5) ** GOTO lbl6
        var9_11 = class_3532.method_15357((double)var4_6.field_1321);
        if (var25_5 || var25_5) ** GOTO lbl6
        var10_12 = class_3532.method_15384((double)var4_6.field_1324);
        if (var25_5 || var25_5) ** GOTO lbl6
        var11_13 = 0.0;
        if (var25_5 || var25_5) ** GOTO lbl6
        var13_14 = ns.lpst("lsvu", lpsq(int ), (int)1404);
        if (var25_5 || var25_5) ** GOTO lbl6
        var14_15 = ns.lpst("lsvv", lpsq(int ), (int)1405);
        if (var25_5 || var25_5) ** GOTO lbl6
        var15_16 = class_243.field_1353;
        if (var25_5 || var25_5) ** GOTO lbl6
        var16_17 = ns.lpst("lsvw", lpsq(int ), (int)1406);
        if (var25_5 || var25_5) ** GOTO lbl6
        var17_18 = new class_2338.class_2339();
        if (var25_5 || var25_5) ** GOTO lbl6
        var18_19 = var5_7;
        if (var25_5) ** GOTO lbl6
        block112: while (true) {
            if (var25_5 || var25_5) ** GOTO lbl6
            if (var18_19 >= var6_8) ** GOTO lbl105
            if (var25_5 || var25_5) ** GOTO lbl6
            var19_20 = var7_9;
            if (var25_5) ** GOTO lbl6
            block113: while (true) {
                if (var25_5 || var25_5) ** GOTO lbl6
                if (var19_20 >= var8_10) ** GOTO lbl100
                if (var25_5 || var25_5) ** GOTO lbl6
                var20_21 = var9_11;
                if (var25_5) ** GOTO lbl6
                block114: while (true) {
                    if (var25_5 || var25_5) ** GOTO lbl6
                    if (var20_21 >= var10_12) ** GOTO lbl95
                    if (var25_5 || var25_5) ** GOTO lbl6
                    var17_18.method_10103(var18_19, var19_20, var20_21);
                    if (var25_5 || var25_5) ** GOTO lbl6
                    var21_22 = this.player.method_73183().method_8316((class_2338)var17_18);
                    if (var25_5 || var25_5) ** GOTO lbl6
                    if (!var21_22.method_15767(var1_1)) ** GOTO lbl90
                    if (var25_5 || var25_5) ** GOTO lbl6
                    var22_23 = (float)var19_20 + var21_22.method_15763((class_1922)this.player.method_73183(), (class_2338)var17_18);
                    if (var25_5 || var25_5) ** GOTO lbl6
                    if (!(var22_23 >= var4_6.field_1322)) ** GOTO lbl90
                    if (var25_5 || var25_5) ** GOTO lbl6
                    var14_15 = ns.lpst("lsvx", lpsq(int ), (int)1407);
                    if (var25_5) ** GOTO lbl6
                    if (var26_4 /* !! */  == 0) ** GOTO lbl-1000
                    switch (var26_4 /* !! */ ) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var25_5) ** GOTO lbl6
                            var11_13 = Math.max(var22_23 - var4_6.field_1322, var11_13);
                            if (var25_5 || var25_5) ** GOTO lbl6
                            if (var13_14 == false) ** GOTO lbl90
                            if (var25_5 || var25_5) ** GOTO lbl6
                            var24_24 = var21_22.method_15758((class_1922)this.player.method_73183(), (class_2338)var17_18);
                            if (var25_5 || var25_5) ** GOTO lbl6
                            if (!(var11_13 < ns.lpst("lsvy", lqfo(int ), (int)697))) ** GOTO lbl85
                            if (var25_5 || var25_5) ** GOTO lbl6
                            var24_24 = var24_24.method_1021(var11_13);
                            if (var25_5) ** GOTO lbl6
lbl85:
                            // 2 sources

                            if (var25_5 || var25_5) ** GOTO lbl6
                            var15_16 = var15_16.method_1019(var24_24);
                            if (var25_5 || var25_5) ** GOTO lbl6
                            ++var16_17;
                            if (var25_5) ** GOTO lbl6
lbl90:
                            // 4 sources

                            if (var25_5 || var25_5) ** GOTO lbl6
                            ++var20_21;
                            if (var25_5) ** GOTO lbl6
                            if (!var27_3) continue block114;
                            throw null;
                        }
lbl95:
                        // 1 sources

                        if (var25_5 || var25_5) ** GOTO lbl6
                        ++var19_20;
                        if (var25_5) ** GOTO lbl6
                        if (!var27_3) continue block113;
                        throw null;
lbl100:
                        // 1 sources

                        if (var25_5 || var25_5) ** GOTO lbl6
                        ++var18_19;
                        if (var25_5) ** GOTO lbl6
                        if (!var27_3) continue block112;
                        throw null;
lbl105:
                        // 1 sources

                        if (var25_5 || var25_5) ** GOTO lbl6
                        if (!(var15_16.method_1033() > 0.0)) ** GOTO lbl126
                        if (var25_5 || var25_5) ** GOTO lbl6
                        if (var16_17 <= 0) ** GOTO lbl112
                        if (var25_5 || var25_5) ** GOTO lbl6
                        var15_16 = var15_16.method_1021(1.0 / (double)var16_17);
                        if (var25_5) ** GOTO lbl6
lbl112:
                        // 2 sources

                        if (var25_5 || var25_5) ** GOTO lbl6
                        var15_16 = var15_16.method_1021(var2_2);
                        if (var25_5 || var25_5) ** GOTO lbl6
                        if (!(Math.abs(this.velocity.field_1352) < ns.lpst("lsvz", lqfo(int ), (int)698))) ** GOTO lbl123
                        if (var25_5) ** GOTO lbl6
                        if (!(Math.abs(this.velocity.field_1350) < ns.lpst("lswa", lqfo(int ), (int)699))) ** GOTO lbl123
                        if (var25_5) ** GOTO lbl6
                        if (!(var15_16.method_1033() < ns.lpst("lswb", lqfo(int ), (int)700))) ** GOTO lbl123
                        if (var25_5 || var25_5) ** GOTO lbl6
                        var15_16 = var15_16.method_1029().method_1021((double)ns.lpst("lswc", lqfo(int ), (int)701));
                        if (var25_5) ** GOTO lbl6
lbl123:
                        // 4 sources

                        if (var25_5 || var25_5) ** GOTO lbl6
                        this.velocity = this.velocity.method_1019(var15_16);
                        if (var25_5) ** GOTO lbl6
lbl126:
                        // 2 sources

                        if (var25_5 || var25_5) ** GOTO lbl6
                        this.fluidHeight.put(var1_1, var11_13);
                        if (!var25_5 && !var25_5) ** break;
                        ** continue;
                        return (boolean)var14_15;
lbl132:
                        // 2 sources

                        case 0: {
                            var26_4 /* !! */  = (int)ns.lpst("lswd", lpsq(int ), (int)1408);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl309
                        }
                        case 1: {
                            var26_4 /* !! */  = (int)ns.lpst("lswe", lpsq(int ), (int)1409);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl186
                        }
lbl142:
                        // 2 sources

                        case 2: {
                            var26_4 /* !! */  = (int)ns.lpst("lswf", lpsq(int ), (int)1410);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl309
                        }
lbl147:
                        // 2 sources

                        case 3: {
                            var26_4 /* !! */  = (int)ns.lpst("lswg", lpsq(int ), (int)1411);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl374
                        }
lbl152:
                        // 2 sources

                        case 4: {
                            var26_4 /* !! */  = (int)ns.lpst("lswh", lpsq(int ), (int)1412);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl489
                        }
lbl157:
                        // 2 sources

                        case 5: {
                            var26_4 /* !! */  = (int)ns.lpst("lswi", lpsq(int ), (int)1413);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl347
                        }
                        case 6: {
                            var26_4 /* !! */  = (int)ns.lpst("lswj", lpsq(int ), (int)1414);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl570
                        }
                        case 7: {
                            var26_4 /* !! */  = (int)ns.lpst("lswk", lpsq(int ), (int)1415);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl489
                        }
                        case 8: {
                            var26_4 /* !! */  = (int)ns.lpst("lswl", lpsq(int ), (int)1416);
                            if (!var27_3) ** GOTO lbl157
                            throw null;
                        }
lbl176:
                        // 2 sources

                        case 9: {
                            var26_4 /* !! */  = (int)ns.lpst("lswm", lpsq(int ), (int)1417);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl400
                        }
                        case 10: {
                            var26_4 /* !! */  = (int)ns.lpst("lswn", lpsq(int ), (int)1418);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl235
                        }
lbl186:
                        // 4 sources

                        case 11: {
                            var26_4 /* !! */  = (int)ns.lpst("lswo", lpsq(int ), (int)1419);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl603
                        }
lbl191:
                        // 3 sources

                        case 12: {
                            var26_4 /* !! */  = (int)ns.lpst("lswp", lpsq(int ), (int)1420);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl289
                        }
                        case 13: {
                            var26_4 /* !! */  = (int)ns.lpst("lswq", lpsq(int ), (int)1421);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl240
                        }
                        case 14: {
                            var26_4 /* !! */  = (int)ns.lpst("lswr", lpsq(int ), (int)1422);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl328
                        }
                        case 15: {
                            var26_4 /* !! */  = (int)ns.lpst("lsws", lpsq(int ), (int)1423);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl357
                        }
                        case 16: {
                            var26_4 /* !! */  = (int)ns.lpst("lswt", lpsq(int ), (int)1424);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl570
                        }
lbl216:
                        // 2 sources

                        case 17: {
                            var26_4 /* !! */  = (int)ns.lpst("lswu", lpsq(int ), (int)1425);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl540
                        }
lbl221:
                        // 2 sources

                        case 18: {
                            var26_4 /* !! */  = (int)ns.lpst("lswv", lpsq(int ), (int)1426);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl472
                        }
                        case 19: {
                            var26_4 /* !! */  = (int)ns.lpst("lsww", lpsq(int ), (int)1427);
                            if (!var27_3) ** GOTO lbl132
                            throw null;
                        }
lbl230:
                        // 3 sources

                        case 20: {
                            var26_4 /* !! */  = (int)ns.lpst("lswx", lpsq(int ), (int)1428);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl418
                        }
lbl235:
                        // 4 sources

                        case 21: {
                            var26_4 /* !! */  = (int)ns.lpst("lswy", lpsq(int ), (int)1429);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl516
                        }
lbl240:
                        // 3 sources

                        case 22: {
                            var26_4 /* !! */  = (int)ns.lpst("lswz", lpsq(int ), (int)1430);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl464
                        }
                        case 23: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxa", lpsq(int ), (int)1431);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl595
                        }
lbl250:
                        // 2 sources

                        case 24: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxb", lpsq(int ), (int)1432);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl423
                        }
lbl255:
                        // 2 sources

                        case 25: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxc", lpsq(int ), (int)1433);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl387
                        }
                        case 26: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxd", lpsq(int ), (int)1434);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl409
                        }
                        case 27: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxe", lpsq(int ), (int)1435);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl472
                        }
                        case 28: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxf", lpsq(int ), (int)1436);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl328
                        }
lbl275:
                        // 3 sources

                        case 29: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxg", lpsq(int ), (int)1437);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl502
                        }
                        case 30: {
                            do {
                                var26_4 /* !! */  = (int)ns.lpst("lsxh", lpsq(int ), (int)1438);
                            } while (!var27_3);
                            throw null;
                        }
lbl285:
                        // 2 sources

                        case 31: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxi", lpsq(int ), (int)1439);
                            if (!var27_3) ** GOTO lbl275
                            throw null;
                        }
lbl289:
                        // 2 sources

                        case 32: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxj", lpsq(int ), (int)1440);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl549
                        }
lbl294:
                        // 2 sources

                        case 33: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxk", lpsq(int ), (int)1441);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl502
                        }
lbl299:
                        // 2 sources

                        case 34: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxl", lpsq(int ), (int)1442);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl374
                        }
lbl304:
                        // 4 sources

                        case 35: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxm", lpsq(int ), (int)1443);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl453
                        }
lbl309:
                        // 3 sources

                        case 36: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxn", lpsq(int ), (int)1444);
                            if (!var27_3) ** GOTO lbl304
                            throw null;
                        }
                        case 37: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxo", lpsq(int ), (int)1445);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl453
                        }
                        case 38: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxp", lpsq(int ), (int)1446);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl557
                        }
lbl323:
                        // 2 sources

                        case 39: {
                            do {
                                var26_4 /* !! */  = (int)ns.lpst("lsxq", lpsq(int ), (int)1447);
                            } while (!var27_3);
                            throw null;
                        }
lbl328:
                        // 3 sources

                        case 40: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxr", lpsq(int ), (int)1448);
                            if (var27_3) {
                                throw null;
                            }
                        }
lbl332:
                        // 4 sources

                        case 41: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxs", lpsq(int ), (int)1449);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl352
                        }
lbl337:
                        // 3 sources

                        case 42: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxt", lpsq(int ), (int)1450);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl557
                        }
                        case 43: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxu", lpsq(int ), (int)1451);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl418
                        }
lbl347:
                        // 4 sources

                        case 44: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxv", lpsq(int ), (int)1452);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl400
                        }
lbl352:
                        // 2 sources

                        case 45: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxw", lpsq(int ), (int)1453);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl540
                        }
lbl357:
                        // 4 sources

                        case 46: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxx", lpsq(int ), (int)1454);
                            if (!var27_3) ** GOTO lbl250
                            throw null;
                        }
                        case 47: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxy", lpsq(int ), (int)1455);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl396
                        }
lbl366:
                        // 2 sources

                        case 48: {
                            var26_4 /* !! */  = (int)ns.lpst("lsxz", lpsq(int ), (int)1456);
                            if (!var27_3) ** GOTO lbl285
                            throw null;
                        }
                        case 49: {
                            var26_4 /* !! */  = (int)ns.lpst("lsya", lpsq(int ), (int)1457);
                            if (!var27_3) ** GOTO lbl235
                            throw null;
                        }
lbl374:
                        // 3 sources

                        case 50: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyb", lpsq(int ), (int)1458);
                            if (!var27_3) ** GOTO lbl152
                            throw null;
                        }
                        case 51: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyc", lpsq(int ), (int)1459);
                            if (!var27_3) ** GOTO lbl332
                            throw null;
                        }
lbl382:
                        // 2 sources

                        case 52: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyd", lpsq(int ), (int)1460);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl544
                        }
lbl387:
                        // 2 sources

                        case 53: {
                            var26_4 /* !! */  = (int)ns.lpst("lsye", lpsq(int ), (int)1461);
                            if (!var27_3) ** GOTO lbl240
                            throw null;
                        }
                        case 54: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyf", lpsq(int ), (int)1462);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl413
                        }
lbl396:
                        // 3 sources

                        case 55: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyg", lpsq(int ), (int)1463);
                            if (!var27_3) ** GOTO lbl191
                            throw null;
                        }
lbl400:
                        // 4 sources

                        case 56: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyh", lpsq(int ), (int)1464);
                            if (!var27_3) ** GOTO lbl186
                            throw null;
                        }
lbl404:
                        // 2 sources

                        case 57: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyi", lpsq(int ), (int)1465);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl591
                        }
lbl409:
                        // 3 sources

                        case 58: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyj", lpsq(int ), (int)1466);
                            if (!var27_3) ** GOTO lbl186
                            throw null;
                        }
lbl413:
                        // 2 sources

                        case 59: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyk", lpsq(int ), (int)1467);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl536
                        }
lbl418:
                        // 3 sources

                        case 60: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyl", lpsq(int ), (int)1468);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl468
                        }
lbl423:
                        // 2 sources

                        case 61: {
                            var26_4 /* !! */  = (int)ns.lpst("lsym", lpsq(int ), (int)1469);
                            if (!var27_3) ** GOTO lbl366
                            throw null;
                        }
lbl427:
                        // 3 sources

                        case 62: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyn", lpsq(int ), (int)1470);
                            if (!var27_3) ** GOTO lbl404
                            throw null;
                        }
lbl431:
                        // 2 sources

                        case 63: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyo", lpsq(int ), (int)1471);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl570
                        }
                        case 64: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyp", lpsq(int ), (int)1472);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl619
                        }
                        case 65: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyq", lpsq(int ), (int)1473);
                            if (!var27_3) ** GOTO lbl323
                            throw null;
                        }
                        case 66: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyr", lpsq(int ), (int)1474);
                            if (!var27_3) ** GOTO lbl347
                            throw null;
                        }
                        case 67: {
                            var26_4 /* !! */  = (int)ns.lpst("lsys", lpsq(int ), (int)1475);
                            if (!var27_3) ** GOTO lbl427
                            throw null;
                        }
lbl453:
                        // 3 sources

                        case 68: lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var26_4 /* !! */  = (int)ns.lpst("lsyt", lpsq(int ), (int)1476);
                                if (var27_3) {
                                    throw null;
                                }
                                ** GOTO lbl481
                                break;
                            }
                        }
                        case 69: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyu", lpsq(int ), (int)1477);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl520
                        }
lbl464:
                        // 2 sources

                        case 70: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyv", lpsq(int ), (int)1478);
                            if (!var27_3) ** GOTO lbl409
                            throw null;
                        }
lbl468:
                        // 2 sources

                        case 71: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyw", lpsq(int ), (int)1479);
                            if (!var27_3) ** GOTO lbl147
                            throw null;
                        }
lbl472:
                        // 3 sources

                        case 72: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyx", lpsq(int ), (int)1480);
                            if (!var27_3) ** GOTO lbl400
                            throw null;
                        }
lbl476:
                        // 2 sources

                        case 73: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyy", lpsq(int ), (int)1481);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl578
                        }
lbl481:
                        // 3 sources

                        case 74: {
                            var26_4 /* !! */  = (int)ns.lpst("lsyz", lpsq(int ), (int)1482);
                            if (!var27_3) ** GOTO lbl191
                            throw null;
                        }
                        case 75: {
                            var26_4 /* !! */  = (int)ns.lpst("lsza", lpsq(int ), (int)1483);
                            if (!var27_3) ** GOTO lbl357
                            throw null;
                        }
lbl489:
                        // 3 sources

                        case 76: {
                            var26_4 /* !! */  = (int)ns.lpst("lszb", lpsq(int ), (int)1484);
                            if (!var27_3) ** GOTO lbl255
                            throw null;
                        }
                        case 77: {
                            var26_4 /* !! */  = (int)ns.lpst("lszc", lpsq(int ), (int)1485);
                            if (!var27_3) ** GOTO lbl304
                            throw null;
                        }
                        case 78: {
                            var26_4 /* !! */  = (int)ns.lpst("lszd", lpsq(int ), (int)1486);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl520
                        }
lbl502:
                        // 3 sources

                        case 79: {
                            var26_4 /* !! */  = (int)ns.lpst("lsze", lpsq(int ), (int)1487);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl524
                        }
                        case 80: {
                            var26_4 /* !! */  = (int)ns.lpst("lszf", lpsq(int ), (int)1488);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl574
                        }
                        case 81: {
                            var26_4 /* !! */  = (int)ns.lpst("lszg", lpsq(int ), (int)1489);
                            if (!var27_3) ** GOTO lbl235
                            throw null;
                        }
lbl516:
                        // 2 sources

                        case 82: {
                            var26_4 /* !! */  = (int)ns.lpst("lszh", lpsq(int ), (int)1490);
                            if (!var27_3) ** GOTO lbl357
                            throw null;
                        }
lbl520:
                        // 3 sources

                        case 83: {
                            var26_4 /* !! */  = (int)ns.lpst("lszi", lpsq(int ), (int)1491);
                            if (!var27_3) ** GOTO lbl230
                            throw null;
                        }
lbl524:
                        // 2 sources

                        case 84: {
                            var26_4 /* !! */  = (int)ns.lpst("lszj", lpsq(int ), (int)1492);
                            if (!var27_3) ** GOTO lbl299
                            throw null;
                        }
                        case 85: {
                            var26_4 /* !! */  = (int)ns.lpst("lszk", lpsq(int ), (int)1493);
                            if (!var27_3) ** GOTO lbl216
                            throw null;
                        }
                        case 86: {
                            var26_4 /* !! */  = (int)ns.lpst("lszl", lpsq(int ), (int)1494);
                            if (!var27_3) ** GOTO lbl275
                            throw null;
                        }
lbl536:
                        // 2 sources

                        case 87: {
                            var26_4 /* !! */  = (int)ns.lpst("lszm", lpsq(int ), (int)1495);
                            if (!var27_3) ** GOTO lbl382
                            throw null;
                        }
lbl540:
                        // 4 sources

                        case 88: {
                            var26_4 /* !! */  = (int)ns.lpst("lszn", lpsq(int ), (int)1496);
                            if (!var27_3) ** GOTO lbl304
                            throw null;
                        }
lbl544:
                        // 3 sources

                        case 89: {
                            var26_4 /* !! */  = (int)ns.lpst("lszo", lpsq(int ), (int)1497);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl553
                        }
lbl549:
                        // 2 sources

                        case 90: {
                            var26_4 /* !! */  = (int)ns.lpst("lszp", lpsq(int ), (int)1498);
                            if (!var27_3) ** GOTO lbl176
                            throw null;
                        }
lbl553:
                        // 3 sources

                        case 91: {
                            var26_4 /* !! */  = (int)ns.lpst("lszq", lpsq(int ), (int)1499);
                            if (!var27_3) ** GOTO lbl396
                            throw null;
                        }
lbl557:
                        // 3 sources

                        case 92: {
                            var26_4 /* !! */  = (int)ns.lpst("lszr", lpsq(int ), (int)1500);
                            if (var27_3) {
                                throw null;
                            }
                            ** GOTO lbl586
                        }
                        case 93: {
                            var26_4 /* !! */  = (int)ns.lpst("lszs", lpsq(int ), (int)1501);
                            if (!var27_3) ** GOTO lbl142
                            throw null;
                        }
                        case 94: {
                            var26_4 /* !! */  = (int)ns.lpst("lszt", lpsq(int ), (int)1502);
                            if (!var27_3) ** GOTO lbl221
                            throw null;
                        }
lbl570:
                        // 4 sources

                        case 95: {
                            var26_4 /* !! */  = (int)ns.lpst("lszu", lpsq(int ), (int)1503);
                            if (!var27_3) ** GOTO lbl481
                            throw null;
                        }
lbl574:
                        // 2 sources

                        case 96: {
                            var26_4 /* !! */  = (int)ns.lpst("lszv", lpsq(int ), (int)1504);
                            if (!var27_3) ** GOTO lbl431
                            throw null;
                        }
lbl578:
                        // 2 sources

                        case 97: {
                            var26_4 /* !! */  = (int)ns.lpst("lszw", lpsq(int ), (int)1505);
                            if (!var27_3) ** GOTO lbl294
                            throw null;
                        }
                        case 98: {
                            var26_4 /* !! */  = (int)ns.lpst("lszx", lpsq(int ), (int)1506);
                            if (!var27_3) ** GOTO lbl337
                            throw null;
                        }
lbl586:
                        // 2 sources

                        case 99: {
                            do {
                                var26_4 /* !! */  = (int)ns.lpst("lszy", lpsq(int ), (int)1507);
                            } while (!var27_3);
                            throw null;
                        }
lbl591:
                        // 2 sources

                        case 100: {
                            var26_4 /* !! */  = (int)ns.lpst("lszz", lpsq(int ), (int)1508);
                            if (!var27_3) ** GOTO lbl476
                            throw null;
                        }
lbl595:
                        // 2 sources

                        case 101: {
                            var26_4 /* !! */  = (int)ns.lpst("ltaa", lpsq(int ), (int)1509);
                            if (!var27_3) ** GOTO lbl230
                            throw null;
                        }
                        case 102: {
                            var26_4 /* !! */  = (int)ns.lpst("ltab", lpsq(int ), (int)1510);
                            if (!var27_3) ** GOTO lbl427
                            throw null;
                        }
lbl603:
                        // 2 sources

                        case 103: {
                            var26_4 /* !! */  = (int)ns.lpst("ltac", lpsq(int ), (int)1511);
                            if (!var27_3) ** GOTO lbl553
                            throw null;
                        }
                        case 104: {
                            var26_4 /* !! */  = (int)ns.lpst("ltad", lpsq(int ), (int)1512);
                            if (!var27_3) ** GOTO lbl540
                            throw null;
                        }
                        case 105: {
                            var26_4 /* !! */  = (int)ns.lpst("ltae", lpsq(int ), (int)1513);
                            if (!var27_3) ** GOTO lbl337
                            throw null;
                        }
                        case 106: {
                            var26_4 /* !! */  = (int)ns.lpst("ltaf", lpsq(int ), (int)1514);
                            if (!var27_3) ** GOTO lbl347
                            throw null;
                        }
lbl619:
                        // 2 sources

                        case 107: {
                            var26_4 /* !! */  = (int)ns.lpst("ltag", lpsq(int ), (int)1515);
                            if (!var27_3) ** GOTO lbl544
                            throw null;
                        }
                        case 108: 
                    }
                    break;
                }
                break;
            }
            break;
        }
        var26_4 /* !! */  = (int)ns.lpst("ltah", lpsq(int ), (int)1516);
        ** while (!var27_3)
lbl626:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 getRotationVector(float var1_1, float var2_2) {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - ns.lpst("ltdv", lptv(int ), (int)748));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1519713387: {
                    v1 = ns.lpst("ltdw", lptv(int ), (int)749);
                    continue block53;
                }
                case -1288975536: {
                    v1 = ns.lpst("ltdx", lptv(int ), (int)750);
                    continue block53;
                }
                case 304457984: {
                    break block53;
                }
            }
            break;
        }
        var11_3 = ns.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltdy", lptv(int ), (int)751)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ns.lpst("ltdz", lpsq(int ), (int)1562)) break;
            v2 /* !! */  = (long)ns.lpst("ltea", lpsq(int ), (int)1563);
        }
        var10_4 /* !! */  = ns.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lteb", lptv(int ), (int)752)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ns.lpst("ltec", lpsq(int ), (int)1564)) break;
            v3 /* !! */  = (long)ns.lpst("lted", lpsq(int ), (int)1565);
        }
        var9_5 = ns.a;
        if (var11_3) {
            throw null;
lbl31:
            // 8 sources

            return null;
        }
        if (var9_5 || var9_5) ** GOTO lbl31
        var3_6 = (float)((double)var1_1 * ns.lpst("ltee", lqfo(int ), (int)753) / ns.lpst("ltef", lqfo(int ), (int)754));
        if (var9_5 || var9_5) ** GOTO lbl31
        var4_7 = (float)((double)(-var2_2) * ns.lpst("lteg", lqfo(int ), (int)755) / ns.lpst("lteh", lqfo(int ), (int)756));
        if (var9_5 || var9_5) ** GOTO lbl31
        v4 = var4_7;
        v5 /* !! */  = ns.uk;
        if (true) ** GOTO lbl43
        block57: while (true) {
            v5 /* !! */  = (long)(v6 - ns.lpst("ltei", lptv(int ), (int)757));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1595230925: {
                    v6 = ns.lpst("ltej", lptv(int ), (int)758);
                    continue block57;
                }
                case 140769764: {
                    v6 = ns.lpst("ltek", lptv(int ), (int)759);
                    continue block57;
                }
                case 304457984: {
                    break block57;
                }
                case 670515548: {
                    v6 = ns.lpst("ltel", lptv(int ), (int)760);
                    continue block57;
                }
            }
            break;
        }
        var5_8 = class_3532.method_15362((double)v4);
        if (var9_5 || var9_5) ** GOTO lbl31
        v7 = var4_7;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("ltem", lptv(int ), (int)761)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ns.lpst("lten", lpsq(int ), (int)1566)) break;
            v8 /* !! */  = (long)ns.lpst("lteo", lpsq(int ), (int)1567);
        }
        var6_9 = class_3532.method_15374((double)v7);
        if (var9_5 || var9_5) ** GOTO lbl31
        v9 = var3_6;
        v10 /* !! */  = ns.uk;
        if (true) ** GOTO lbl71
        block59: while (true) {
            v10 /* !! */  = (long)(v11 - ns.lpst("ltep", lptv(int ), (int)762));
lbl71:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1223676815: {
                    v11 = ns.lpst("lteq", lptv(int ), (int)763);
                    continue block59;
                }
                case -731458440: {
                    v11 = ns.lpst("lter", lptv(int ), (int)764);
                    continue block59;
                }
                case 304457984: {
                    break block59;
                }
                case 2120604641: {
                    v11 = ns.lpst("ltes", lptv(int ), (int)765);
                    continue block59;
                }
            }
            break;
        }
        var7_10 = class_3532.method_15362((double)v9);
        if (var9_5 || var9_5) ** GOTO lbl31
        v12 = var3_6;
        v13 /* !! */  = ns.uk;
        if (true) ** GOTO lbl90
        block60: while (true) {
            v13 /* !! */  = (long)(v14 - ns.lpst("ltet", lptv(int ), (int)766));
lbl90:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1377388778: {
                    v14 = ns.lpst("lteu", lptv(int ), (int)767);
                    continue block60;
                }
                case -140833499: {
                    v14 = ns.lpst("ltev", lptv(int ), (int)768);
                    continue block60;
                }
                case 304457984: {
                    break block60;
                }
                case 2053764339: {
                    v14 = ns.lpst("ltew", lptv(int ), (int)769);
                    continue block60;
                }
            }
            break;
        }
        var8_11 = class_3532.method_15374((double)v12);
        if (var9_5) ** GOTO lbl31
        if (var10_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var9_5) ** break;
                ** continue;
                v15 /* !! */  = ns.uk;
                if (true) ** GOTO lbl113
                block61: while (true) {
                    v15 /* !! */  = (long)(v16 - ns.lpst("ltex", lptv(int ), (int)770));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1911545343: {
                            v16 = ns.lpst("ltey", lptv(int ), (int)771);
                            continue block61;
                        }
                        case -342241962: {
                            v16 = ns.lpst("ltez", lptv(int ), (int)772);
                            continue block61;
                        }
                        case 304457984: {
                            break block61;
                        }
                        case 2026544965: {
                            v16 = ns.lpst("ltfa", lptv(int ), (int)773);
                            continue block61;
                        }
                    }
                    break;
                }
                v17 = var6_9 * var7_10;
                v18 = -var8_11;
                v19 = var5_8 * var7_10;
                v20 /* !! */  = ns.uk;
                if (true) ** GOTO lbl132
                block62: while (true) {
                    v20 /* !! */  = (long)(v21 - ns.lpst("ltfb", lptv(int ), (int)774));
lbl132:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -736253355: {
                            v21 = ns.lpst("ltfc", lptv(int ), (int)775);
                            continue block62;
                        }
                        case -699082093: {
                            v21 = ns.lpst("ltfd", lptv(int ), (int)776);
                            continue block62;
                        }
                        case -162125179: {
                            v21 = ns.lpst("ltfe", lptv(int ), (int)777);
                            continue block62;
                        }
                        case 304457984: {
                            break block62;
                        }
                    }
                    break;
                }
                return new class_243(v17, v18, v19);
            }
lbl145:
            // 3 sources

            case 0: {
                var10_4 /* !! */  = (int)ns.lpst("ltff", lpsq(int ), (int)1568);
                if (var11_3) {
                    throw null;
                }
            }
            case 1: {
                var10_4 /* !! */  = (int)ns.lpst("ltfg", lpsq(int ), (int)1569);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 2: {
                var10_4 /* !! */  = (int)ns.lpst("ltfh", lpsq(int ), (int)1570);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 3: {
                var10_4 /* !! */  = (int)ns.lpst("ltfi", lpsq(int ), (int)1571);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl164:
            // 2 sources

            case 4: {
                var10_4 /* !! */  = (int)ns.lpst("ltfj", lpsq(int ), (int)1572);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl169:
            // 2 sources

            case 5: {
                var10_4 /* !! */  = (int)ns.lpst("ltfk", lpsq(int ), (int)1573);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 6: {
                var10_4 /* !! */  = (int)ns.lpst("ltfl", lpsq(int ), (int)1574);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl179:
            // 2 sources

            case 7: {
                var10_4 /* !! */  = (int)ns.lpst("ltfm", lpsq(int ), (int)1575);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 8: {
                do {
                    var10_4 /* !! */  = (int)ns.lpst("ltfn", lpsq(int ), (int)1576);
                } while (!var11_3);
                throw null;
            }
lbl189:
            // 3 sources

            case 9: {
                var10_4 /* !! */  = (int)ns.lpst("ltfo", lpsq(int ), (int)1577);
                if (!var11_3) ** GOTO lbl145
                throw null;
            }
            case 10: {
                var10_4 /* !! */  = (int)ns.lpst("ltfp", lpsq(int ), (int)1578);
                if (!var11_3) ** GOTO lbl189
                throw null;
            }
lbl197:
            // 2 sources

            case 11: {
                var10_4 /* !! */  = (int)ns.lpst("ltfq", lpsq(int ), (int)1579);
                if (!var11_3) ** GOTO lbl145
                throw null;
            }
lbl201:
            // 3 sources

            case 12: {
                var10_4 /* !! */  = (int)ns.lpst("ltfr", lpsq(int ), (int)1580);
                if (var11_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl206:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_4 /* !! */  = (int)ns.lpst("ltfs", lpsq(int ), (int)1581);
                    if (!var11_3) ** GOTO lbl201
                    throw null;
                }
            }
lbl211:
            // 2 sources

            case 14: {
                var10_4 /* !! */  = (int)ns.lpst("ltft", lpsq(int ), (int)1582);
                if (!var11_3) break;
                throw null;
            }
            case 15: 
        }
        var10_4 /* !! */  = (int)ns.lpst("ltfu", lpsq(int ), (int)1583);
        ** while (!var11_3)
lbl218:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqm() {
        ns.lpsr[1700] = -487335419;
        ns.lpsr[1701] = 1690450791;
        ns.lpsr[1702] = -2063063814;
        ns.lpsr[1703] = -170209545;
        ns.lpsr[1704] = -313308048;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateSubmergedInWaterState() {
        var10_1 = ns.c;
        var9_2 /* !! */  = ns.b;
        var8_3 = ns.a;
        if (var10_1) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        this.submergedInWater = this.submergedFluidTag.contains(class_3486.field_15517);
        if (var8_3 || var8_3) ** GOTO lbl6
        this.submergedFluidTag.clear();
        if (var8_3 || var8_3) ** GOTO lbl6
        var1_4 = this.getEyeY() - ns.lpst("lsro", lqfo(int ), (int)659);
        if (var8_3 || var8_3) ** GOTO lbl6
        var3_5 = this.player.method_5854();
        if (var8_3 || var8_3) ** GOTO lbl6
        if (!(var3_5 instanceof class_1690)) ** GOTO lbl31
        if (var8_3 || var8_3) ** GOTO lbl6
        var4_6 = (class_1690)var3_5;
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_3 || var8_3) ** GOTO lbl6
                if (var4_6.method_5869()) ** GOTO lbl31
                if (var8_3) ** GOTO lbl6
                if (!(var4_6.method_5829().field_1325 >= var1_4)) ** GOTO lbl31
                if (var8_3) ** GOTO lbl6
                if (!(var4_6.method_5829().field_1322 <= var1_4)) ** GOTO lbl31
                if (var8_3 || var8_3) ** GOTO lbl6
                return;
lbl31:
                // 4 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                var4_6 = class_2338.method_49637((double)this.pos.field_1352, (double)var1_4, (double)this.pos.field_1350);
                if (var8_3 || var8_3) ** GOTO lbl6
                var5_7 = this.player.method_73183().method_8316((class_2338)var4_6);
                if (var8_3 || var8_3) ** GOTO lbl6
                var6_8 = (float)var4_6.method_10264() + var5_7.method_15763((class_1922)this.player.method_73183(), (class_2338)var4_6);
                if (var8_3 || var8_3) ** GOTO lbl6
                if (!(var6_8 > var1_4)) ** GOTO lbl43
                if (var8_3 || var8_3) ** GOTO lbl6
                this.submergedFluidTag.addAll(var5_7.method_40181().toList());
                if (var8_3) ** GOTO lbl6
lbl43:
                // 2 sources

                if (!var8_3 && !var8_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_2 /* !! */  = (int)ns.lpst("lsrp", lpsq(int ), (int)1332);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 1: {
                var9_2 /* !! */  = (int)ns.lpst("lsrq", lpsq(int ), (int)1333);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl56:
            // 3 sources

            case 2: {
                var9_2 /* !! */  = (int)ns.lpst("lsrr", lpsq(int ), (int)1334);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 3: {
                var9_2 /* !! */  = (int)ns.lpst("lsrs", lpsq(int ), (int)1335);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 4: {
                var9_2 /* !! */  = (int)ns.lpst("lsrt", lpsq(int ), (int)1336);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl71:
            // 4 sources

            case 5: {
                var9_2 /* !! */  = (int)ns.lpst("lsru", lpsq(int ), (int)1337);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl76:
            // 2 sources

            case 6: {
                var9_2 /* !! */  = (int)ns.lpst("lsrv", lpsq(int ), (int)1338);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl81:
            // 3 sources

            case 7: {
                var9_2 /* !! */  = (int)ns.lpst("lsrw", lpsq(int ), (int)1339);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 8: {
                var9_2 /* !! */  = (int)ns.lpst("lsrx", lpsq(int ), (int)1340);
                if (!var10_1) ** GOTO lbl76
                throw null;
            }
lbl90:
            // 2 sources

            case 9: {
                var9_2 /* !! */  = (int)ns.lpst("lsry", lpsq(int ), (int)1341);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl95:
            // 2 sources

            case 10: {
                var9_2 /* !! */  = (int)ns.lpst("lsrz", lpsq(int ), (int)1342);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl100:
            // 3 sources

            case 11: {
                var9_2 /* !! */  = (int)ns.lpst("lssa", lpsq(int ), (int)1343);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 12: {
                var9_2 /* !! */  = (int)ns.lpst("lssb", lpsq(int ), (int)1344);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 13: {
                var9_2 /* !! */  = (int)ns.lpst("lssc", lpsq(int ), (int)1345);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl115:
            // 2 sources

            case 14: {
                var9_2 /* !! */  = (int)ns.lpst("lssd", lpsq(int ), (int)1346);
                if (!var10_1) ** GOTO lbl100
                throw null;
            }
lbl119:
            // 2 sources

            case 15: {
                var9_2 /* !! */  = (int)ns.lpst("lsse", lpsq(int ), (int)1347);
                if (!var10_1) ** GOTO lbl81
                throw null;
            }
            case 16: {
                var9_2 /* !! */  = (int)ns.lpst("lssf", lpsq(int ), (int)1348);
                if (!var10_1) ** GOTO lbl56
                throw null;
            }
            case 17: {
                var9_2 /* !! */  = (int)ns.lpst("lssg", lpsq(int ), (int)1349);
                if (!var10_1) ** GOTO lbl56
                throw null;
            }
lbl131:
            // 4 sources

            case 18: {
                var9_2 /* !! */  = (int)ns.lpst("lssh", lpsq(int ), (int)1350);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl136:
            // 4 sources

            case 19: {
                var9_2 /* !! */  = (int)ns.lpst("lssi", lpsq(int ), (int)1351);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
lbl140:
            // 2 sources

            case 20: {
                var9_2 /* !! */  = (int)ns.lpst("lssj", lpsq(int ), (int)1352);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 21: {
                var9_2 /* !! */  = (int)ns.lpst("lssk", lpsq(int ), (int)1353);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl150:
            // 6 sources

            case 22: {
                var9_2 /* !! */  = (int)ns.lpst("lssl", lpsq(int ), (int)1354);
                if (!var10_1) ** GOTO lbl81
                throw null;
            }
lbl154:
            // 3 sources

            case 23: {
                var9_2 /* !! */  = (int)ns.lpst("lssm", lpsq(int ), (int)1355);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
            case 24: {
                var9_2 /* !! */  = (int)ns.lpst("lssn", lpsq(int ), (int)1356);
                if (!var10_1) ** GOTO lbl131
                throw null;
            }
lbl162:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)ns.lpst("lsso", lpsq(int ), (int)1357);
                    if (!var10_1) ** GOTO lbl131
                    throw null;
                }
            }
            case 26: {
                var9_2 /* !! */  = (int)ns.lpst("lssp", lpsq(int ), (int)1358);
                if (!var10_1) ** GOTO lbl131
                throw null;
            }
            case 27: {
                var9_2 /* !! */  = (int)ns.lpst("lssq", lpsq(int ), (int)1359);
                if (!var10_1) ** GOTO lbl150
                throw null;
            }
lbl175:
            // 3 sources

            case 28: {
                var9_2 /* !! */  = (int)ns.lpst("lssr", lpsq(int ), (int)1360);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
            case 29: {
                var9_2 /* !! */  = (int)ns.lpst("lsss", lpsq(int ), (int)1361);
                if (!var10_1) ** GOTO lbl136
                throw null;
            }
lbl183:
            // 2 sources

            case 30: {
                var9_2 /* !! */  = (int)ns.lpst("lsst", lpsq(int ), (int)1362);
                if (!var10_1) ** GOTO lbl140
                throw null;
            }
            case 31: {
                var9_2 /* !! */  = (int)ns.lpst("lssu", lpsq(int ), (int)1363);
                if (!var10_1) ** GOTO lbl119
                throw null;
            }
lbl191:
            // 2 sources

            case 32: {
                var9_2 /* !! */  = (int)ns.lpst("lssv", lpsq(int ), (int)1364);
                if (!var10_1) ** GOTO lbl95
                throw null;
            }
            case 33: 
        }
        var9_2 /* !! */  = (int)ns.lpst("lssw", lpsq(int ), (int)1365);
        ** while (!var10_1)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltpx() {
        ns.lpsr[200] = -337864850;
        ns.lpsr[201] = 1145568590;
        ns.lpsr[202] = -1656651174;
        ns.lpsr[203] = 822465220;
        ns.lpsr[204] = 439964626;
        ns.lpsr[205] = 1945963624;
        ns.lpsr[206] = 2094564744;
        ns.lpsr[207] = 1520303209;
        ns.lpsr[208] = 1222286089;
        ns.lpsr[209] = -1265167121;
        ns.lpsr[210] = 2082421282;
        ns.lpsr[211] = -18097585;
        ns.lpsr[212] = 943561739;
        ns.lpsr[213] = 1045803103;
        ns.lpsr[214] = -1108923984;
        ns.lpsr[215] = -1838139379;
        ns.lpsr[216] = -577622469;
        ns.lpsr[217] = 335114844;
        ns.lpsr[218] = 566027586;
        ns.lpsr[219] = 1651004431;
        ns.lpsr[220] = 1907299303;
        ns.lpsr[221] = -422760349;
        ns.lpsr[222] = 1713002854;
        ns.lpsr[223] = -2135689374;
        ns.lpsr[224] = -1604363980;
        ns.lpsr[225] = -395816050;
        ns.lpsr[226] = -495015731;
        ns.lpsr[227] = 1668924191;
        ns.lpsr[228] = -1806646540;
        ns.lpsr[229] = 2073976889;
        ns.lpsr[230] = 1641028445;
        ns.lpsr[231] = 1240328914;
        ns.lpsr[232] = 1040538183;
        ns.lpsr[233] = 1354559148;
        ns.lpsr[234] = 682680185;
        ns.lpsr[235] = -1389442122;
        ns.lpsr[236] = -1247242994;
        ns.lpsr[237] = 159038901;
        ns.lpsr[238] = 1052222409;
        ns.lpsr[239] = -1150412361;
        ns.lpsr[240] = 181052696;
        ns.lpsr[241] = 1276094395;
        ns.lpsr[242] = -1593226096;
        ns.lpsr[243] = -69955436;
        ns.lpsr[244] = 806019734;
        ns.lpsr[245] = -1944678603;
        ns.lpsr[246] = -1730065104;
        ns.lpsr[247] = -570858499;
        ns.lpsr[248] = 233075358;
        ns.lpsr[249] = 1884789178;
        ns.lpsr[250] = 1298816837;
        ns.lpsr[251] = -1348084895;
        ns.lpsr[252] = -1520531642;
        ns.lpsr[253] = -542486623;
        ns.lpsr[254] = 371304599;
        ns.lpsr[255] = -2110729296;
        ns.lpsr[256] = -1416370947;
        ns.lpsr[257] = 2047109641;
        ns.lpsr[258] = -1642428279;
        ns.lpsr[259] = 625284977;
        ns.lpsr[260] = 807111711;
        ns.lpsr[261] = -1094487821;
        ns.lpsr[262] = -1592158003;
        ns.lpsr[263] = -224346107;
        ns.lpsr[264] = -594103929;
        ns.lpsr[265] = -611552962;
        ns.lpsr[266] = -975069387;
        ns.lpsr[267] = -1802822595;
        ns.lpsr[268] = -1186570623;
        ns.lpsr[269] = 687761408;
        ns.lpsr[270] = -1384809257;
        ns.lpsr[271] = -895368998;
        ns.lpsr[272] = 1405970734;
        ns.lpsr[273] = -1725353946;
        ns.lpsr[274] = -641838321;
        ns.lpsr[275] = -42677802;
        ns.lpsr[276] = -1066820522;
        ns.lpsr[277] = -1270286170;
        ns.lpsr[278] = 1135836565;
        ns.lpsr[279] = 1538419746;
        ns.lpsr[280] = -87063773;
        ns.lpsr[281] = -2087988503;
        ns.lpsr[282] = -1455068179;
        ns.lpsr[283] = -301185955;
        ns.lpsr[284] = -1790946387;
        ns.lpsr[285] = -413621245;
        ns.lpsr[286] = -1464213049;
        ns.lpsr[287] = -1684558391;
        ns.lpsr[288] = 113062620;
        ns.lpsr[289] = 1010944016;
        ns.lpsr[290] = 1286334395;
        ns.lpsr[291] = -285809385;
        ns.lpsr[292] = -288487221;
        ns.lpsr[293] = 1421751886;
        ns.lpsr[294] = 386127433;
        ns.lpsr[295] = -280054560;
        ns.lpsr[296] = -100131527;
        ns.lpsr[297] = 2130721924;
        ns.lpsr[298] = -359861461;
        ns.lpsr[299] = 1204921202;
    }

    private static /* synthetic */ void ltrh() {
        ns.lptw[200] = 398241450186732658L;
        ns.lptw[201] = 6273397031498653116L;
        ns.lptw[202] = -5767250841260288329L;
        ns.lptw[203] = 6023023871031899240L;
        ns.lptw[204] = 2973105227440141518L;
        ns.lptw[205] = -1195524936249424535L;
        ns.lptw[206] = 3605453837944128035L;
        ns.lptw[207] = -620565641480985234L;
        ns.lptw[208] = 6796386413928217538L;
        ns.lptw[209] = -8046193200701774264L;
        ns.lptw[210] = -8367747848900034674L;
        ns.lptw[211] = -2596092916923221811L;
        ns.lptw[212] = 8008287045677955501L;
        ns.lptw[213] = -6847707399841537057L;
        ns.lptw[214] = -2450186637364040980L;
        ns.lptw[215] = 243147846711990914L;
        ns.lptw[216] = 875858913001859479L;
        ns.lptw[217] = 4434471322463085559L;
        ns.lptw[218] = 4116466554939094028L;
        ns.lptw[219] = 9075164492364038141L;
        ns.lptw[220] = -2044413086917006435L;
        ns.lptw[221] = -6474260199220470120L;
        ns.lptw[222] = -6638038583435739669L;
        ns.lptw[223] = 2984750167988019346L;
        ns.lptw[224] = -4108934004534612522L;
        ns.lptw[225] = -106916250561907433L;
        ns.lptw[226] = 5577634621868305730L;
        ns.lptw[227] = -1919439872742998817L;
        ns.lptw[228] = 2763356676806877033L;
        ns.lptw[229] = 758360928058126122L;
        ns.lptw[230] = -8798615497788772696L;
        ns.lptw[231] = 5518612302075150246L;
        ns.lptw[232] = 5695988252690467061L;
        ns.lptw[233] = 2944713429391264125L;
        ns.lptw[234] = -1558446417205907550L;
        ns.lptw[235] = 962485876559124226L;
        ns.lptw[236] = 4258957099208238182L;
        ns.lptw[237] = 2964178431130558126L;
        ns.lptw[238] = -2344380573241082655L;
        ns.lptw[239] = 1595410316717836871L;
        ns.lptw[240] = -9044801554461929576L;
        ns.lptw[241] = 645190395781724930L;
        ns.lptw[242] = 1217056805301839994L;
        ns.lptw[243] = 7308222111251826650L;
        ns.lptw[244] = -4458890680055273167L;
        ns.lptw[245] = -6225592135679756384L;
        ns.lptw[246] = -361704839871551778L;
        ns.lptw[247] = 7036543792828337286L;
        ns.lptw[248] = 6126398476476321459L;
        ns.lptw[249] = 3033125630090480195L;
        ns.lptw[250] = -4815701693949588195L;
        ns.lptw[251] = 6519616355579945317L;
        ns.lptw[252] = -3539018408514550146L;
        ns.lptw[253] = 3483645937646632728L;
        ns.lptw[254] = -2556156888236480775L;
        ns.lptw[255] = -6757309838771770723L;
        ns.lptw[256] = 8809050761416782236L;
        ns.lptw[257] = 8372385442719115774L;
        ns.lptw[258] = 5090833183362138821L;
        ns.lptw[259] = -6556086724740844686L;
        ns.lptw[260] = 7676191362874796771L;
        ns.lptw[261] = 6971946295549928325L;
        ns.lptw[262] = -1877588615968947422L;
        ns.lptw[263] = -699943218146919239L;
        ns.lptw[264] = -4024346545154535559L;
        ns.lptw[265] = 3189028153989450753L;
        ns.lptw[266] = 9170376802347622838L;
        ns.lptw[267] = -6472046172486408007L;
        ns.lptw[268] = -2178238863860509571L;
        ns.lptw[269] = -3296455149069718508L;
        ns.lptw[270] = -981015295493099061L;
        ns.lptw[271] = -4174739561654850262L;
        ns.lptw[272] = 8474846689716170772L;
        ns.lptw[273] = -7341055884344108528L;
        ns.lptw[274] = 7653540409096506367L;
        ns.lptw[275] = 2894684027514547819L;
        ns.lptw[276] = 5272457982952774953L;
        ns.lptw[277] = -1079939047756204816L;
        ns.lptw[278] = 8091442142223457528L;
        ns.lptw[279] = 6392892069549506904L;
        ns.lptw[280] = -8884799080838162352L;
        ns.lptw[281] = -3514168442898479432L;
        ns.lptw[282] = -2197945086876128315L;
        ns.lptw[283] = 6564367403797985438L;
        ns.lptw[284] = 2467113894376441895L;
        ns.lptw[285] = 1138483424050912032L;
        ns.lptw[286] = -3328479028596763375L;
        ns.lptw[287] = 986426109688094140L;
        ns.lptw[288] = -6383423957818068730L;
        ns.lptw[289] = -2913112900784453907L;
        ns.lptw[290] = 5587568706640418758L;
        ns.lptw[291] = 1180565545403423931L;
        ns.lptw[292] = 2555398880811343890L;
        ns.lptw[293] = -1009808921819090425L;
        ns.lptw[294] = 2426951115847994506L;
        ns.lptw[295] = 1555133250032765405L;
        ns.lptw[296] = 572163781080285642L;
        ns.lptw[297] = -2787126662945031687L;
        ns.lptw[298] = -7171812775580628182L;
        ns.lptw[299] = -6376989956145285886L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void swimUpward(class_6862<class_3611> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsgp", lptv(int ), (int)525)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lsgq", lpsq(int ), (int)1181)) break;
            v0 /* !! */  = (long)ns.lpst("lsgr", lpsq(int ), (int)1182);
        }
        var4_2 = ns.c;
        v1 /* !! */  = ns.uk;
        block32: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1550133355: {
                    v1 /* !! */  = (long)(ns.lpst("lsgt", lptv(int ), (int)527) - ns.lpst("lsgs", lptv(int ), (int)526));
                    continue block32;
                }
                case 304457984: {
                    break block32;
                }
            }
            break;
        }
        var3_3 /* !! */  = ns.b;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl20
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - ns.lpst("lsgu", lptv(int ), (int)528));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2136972156: {
                    v3 = ns.lpst("lsgv", lptv(int ), (int)529);
                    continue block33;
                }
                case 304457984: {
                    break block33;
                }
                case 488792118: {
                    v3 = ns.lpst("lsgw", lptv(int ), (int)530);
                    continue block33;
                }
                case 603279319: {
                    v3 = ns.lpst("lsgx", lptv(int ), (int)531);
                    continue block33;
                }
            }
            break;
        }
        var2_4 = ns.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4 || var2_4) ** GOTO lbl75
        v4 /* !! */  = ns.uk;
        block34: while (true) {
            switch ((int)v4 /* !! */ ) {
                case 304457984: {
                    break block34;
                }
                case 645906359: {
                    v4 /* !! */  = (long)(ns.lpst("lsgz", lptv(int ), (int)533) - ns.lpst("lsgy", lptv(int ), (int)532));
                    continue block34;
                }
            }
            break;
        }
        v5 = ns.lpst("lsha", lqfo(int ), (int)534);
        v6 /* !! */  = ns.uk;
        if (true) ** GOTO lbl49
        block35: while (true) {
            v6 /* !! */  = (long)(v7 - ns.lpst("lshb", lptv(int ), (int)535));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1519352098: {
                    v7 = ns.lpst("lshc", lptv(int ), (int)536);
                    continue block35;
                }
                case 304457984: {
                    break block35;
                }
                case 1826182302: {
                    v7 = ns.lpst("lshd", lptv(int ), (int)537);
                    continue block35;
                }
            }
            break;
        }
        v8 = this.velocity.method_1031(0.0, (double)v5, 0.0);
        v9 /* !! */  = ns.uk;
        block36: while (true) {
            switch ((int)v9 /* !! */ ) {
                case -1785562997: {
                    v9 /* !! */  = (long)(ns.lpst("lshf", lptv(int ), (int)539) - ns.lpst("lshe", lptv(int ), (int)538));
                    continue block36;
                }
                case 304457984: {
                    break block36;
                }
            }
            break;
        }
        this.velocity = v8;
        if (var2_4) ** GOTO lbl75
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var2_4) ** GOTO lbl76
lbl75:
                    // 3 sources

                    return;
lbl76:
                    // 1 sources

                    return;
                }
                case 0: {
                    ** GOTO lbl87
                }
                case 3: {
                    var3_3 /* !! */  = (int)ns.lpst("lshj", lpsq(int ), (int)1186);
                    if (!var4_2) ** break;
                    throw null;
                }
                case 5: {
                    var3_3 /* !! */  = (int)ns.lpst("lshl", lpsq(int ), (int)1188);
                    if (var4_2) {
                        throw null;
                    }
lbl87:
                    // 3 sources

                    var3_3 /* !! */  = (int)ns.lpst("lshg", lpsq(int ), (int)1183);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 4: {
                    var3_3 /* !! */  = (int)ns.lpst("lshk", lpsq(int ), (int)1187);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)ns.lpst("lshh", lpsq(int ), (int)1184);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl102
            break;
        }
        do {
            if (true) ** continue;
lbl102:
            // 2 sources

            var3_3 /* !! */  = (int)ns.lpst("lshi", lpsq(int ), (int)1185);
            cfr_temp_0 = 1;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void ltrn() {
        ns.lptw[800] = 6311815638528549962L;
        ns.lptw[801] = -554022080761206179L;
        ns.lptw[802] = -6657850460433543820L;
        ns.lptw[803] = 140867251120151797L;
        ns.lptw[804] = -7639497260739676471L;
        ns.lptw[805] = -618195576457862706L;
        ns.lptw[806] = -846540505227444645L;
        ns.lptw[807] = -3232953254600597088L;
        ns.lptw[808] = 3391685939078549744L;
        ns.lptw[809] = -3265970239298957478L;
        ns.lptw[810] = 364828744802613712L;
        ns.lptw[811] = 7621555246460613436L;
        ns.lptw[812] = 3424603144445888107L;
        ns.lptw[813] = -5638212856168822121L;
        ns.lptw[814] = 4284306758107218389L;
        ns.lptw[815] = -8860991653842575347L;
        ns.lptw[816] = 3540536632053260337L;
        ns.lptw[817] = -5482909732106326094L;
        ns.lptw[818] = -3097765011897019956L;
        ns.lptw[819] = 2312753106067817567L;
        ns.lptw[820] = 3974065685671104748L;
        ns.lptw[821] = 3898582876417387378L;
        ns.lptw[822] = -2023186140924574207L;
        ns.lptw[823] = 6215638584595367891L;
        ns.lptw[824] = -6355227487379793396L;
        ns.lptw[825] = -1299516076044814841L;
        ns.lptw[826] = -8558300915683679201L;
        ns.lptw[827] = -3798038572378150707L;
        ns.lptw[828] = -2333937862322069562L;
        ns.lptw[829] = 2352561344728410375L;
        ns.lptw[830] = 9144986875997285055L;
        ns.lptw[831] = -5940448727186121634L;
        ns.lptw[832] = -3186365492070826125L;
        ns.lptw[833] = -6316373048224018611L;
        ns.lptw[834] = -2554514238002556228L;
        ns.lptw[835] = 1007779051619190093L;
        ns.lptw[836] = 4129248908249505546L;
        ns.lptw[837] = 8603672441242579635L;
        ns.lptw[838] = 8751819461624441547L;
        ns.lptw[839] = -3179998586682660578L;
        ns.lptw[840] = 6754939356493910717L;
        ns.lptw[841] = 3797117138058788270L;
        ns.lptw[842] = -14446195862626869L;
        ns.lptw[843] = -8484495801064920866L;
        ns.lptw[844] = 1285735072392019668L;
        ns.lptw[845] = -8214081021631436186L;
        ns.lptw[846] = -344610979788885699L;
        ns.lptw[847] = 3741909289084376750L;
        ns.lptw[848] = 1016849427400958733L;
        ns.lptw[849] = -5078364745610191402L;
        ns.lptw[850] = 6590308813613942237L;
        ns.lptw[851] = -8623640833702623218L;
        ns.lptw[852] = 7750597282652077398L;
        ns.lptw[853] = 4809697815050570877L;
        ns.lptw[854] = 3478609455598216006L;
        ns.lptw[855] = -3899575119379579063L;
        ns.lptw[856] = 334114272150590732L;
        ns.lptw[857] = -9023831867279952588L;
        ns.lptw[858] = 2129360792295456351L;
        ns.lptw[859] = -9118464079121156158L;
        ns.lptw[860] = -193871356528512602L;
        ns.lptw[861] = -3795147654248323310L;
        ns.lptw[862] = 972313627828470827L;
        ns.lptw[863] = 6208689155081142911L;
        ns.lptw[864] = 671053815067623052L;
        ns.lptw[865] = -3525225327077135832L;
        ns.lptw[866] = 914999006340981921L;
        ns.lptw[867] = -7971939016975333091L;
        ns.lptw[868] = 7268001132330907060L;
        ns.lptw[869] = 1431504702868620745L;
        ns.lptw[870] = 1339610691108940287L;
        ns.lptw[871] = -251324859818696310L;
        ns.lptw[872] = -500016000688776421L;
        ns.lptw[873] = -8760138845290830525L;
        ns.lptw[874] = -3948899013985747652L;
        ns.lptw[875] = 4817832374031605302L;
        ns.lptw[876] = 7882655156595152080L;
        ns.lptw[877] = 7202412793485583424L;
        ns.lptw[878] = 5262995292243395175L;
        ns.lptw[879] = -9026079715335250322L;
        ns.lptw[880] = -9007440097028643177L;
        ns.lptw[881] = -4159826350520399987L;
        ns.lptw[882] = 3005074899720128875L;
        ns.lptw[883] = 906282455924350601L;
        ns.lptw[884] = 3502855265590710566L;
        ns.lptw[885] = -7037931298108581808L;
        ns.lptw[886] = 6509878816177679269L;
        ns.lptw[887] = -3890655551687728638L;
        ns.lptw[888] = 5502281295405912534L;
        ns.lptw[889] = -7697658661097059723L;
        ns.lptw[890] = -2868811141099458043L;
        ns.lptw[891] = 5156810511892549693L;
        ns.lptw[892] = -7603234294581593311L;
        ns.lptw[893] = -2110295832605916012L;
        ns.lptw[894] = -7747170734031926086L;
        ns.lptw[895] = 2854977893022200093L;
        ns.lptw[896] = -7620622433306814464L;
        ns.lptw[897] = -8234645304414469428L;
        ns.lptw[898] = 6464128967356895643L;
        ns.lptw[899] = -7065798749109461499L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private float getJumpBoostVelocityModifier() {
        boolean bl2;
        Object object = uk;
        boolean bl3 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ns.lpst("lsab", lptv(int ), (int)463);
            }
            switch ((int)object) {
                case -1336962610: {
                    callSite = ns.lpst("lsac", lptv(int ), (int)464);
                    continue block20;
                }
                case -637868905: {
                    callSite = ns.lpst("lsad", lptv(int ), (int)465);
                    continue block20;
                }
                case 304457984: {
                    break block20;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = uk - ns.lpst("lsae", lptv(int ), (int)466)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ns.lpst("lsaf", lpsq(int ), (int)1073)) break;
            object2 = ns.lpst("lsag", lpsq(int ), (int)1074);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = uk - ns.lpst("lsah", lptv(int ), (int)467)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ns.lpst("lsai", lpsq(int ), (int)1075)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ns.lpst("lsaj", lpsq(int ), (int)1076);
        }
        if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
        if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
        Object object4 = uk;
        block23: while (true) {
            switch ((int)object4) {
                case 304457984: {
                    break block23;
                }
                case 1996983764: {
                    object4 = ns.lpst("lsam", lptv(int ), (int)469) - ns.lpst("lsal", lptv(int ), (int)468);
                    continue block23;
                }
            }
            break;
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = uk - ns.lpst("lsan", lptv(int ), (int)470)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == ns.lpst("lsao", lpsq(int ), (int)1078)) {
                if (this.hasStatusEffect((class_6880<class_1291>)class_1294.field_5913)) break;
                if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
                if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
                return 0.0f;
            }
            object5 = ns.lpst("lsap", lpsq(int ), (int)1079);
        }
        if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
        if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
        Object object6 = uk;
        boolean bl5 = true;
        block25: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object6 = callSite - ns.lpst("lsaq", lptv(int ), (int)471);
            }
            switch ((int)object6) {
                case 304457984: {
                    break block25;
                }
                case 831717362: {
                    callSite = ns.lpst("lsar", lptv(int ), (int)472);
                    continue block25;
                }
                case 918337921: {
                    callSite = ns.lpst("lsas", lptv(int ), (int)473);
                    continue block25;
                }
                case 1575634356: {
                    callSite = ns.lpst("lsat", lptv(int ), (int)474);
                    continue block25;
                }
            }
            break;
        }
        Object object7 = uk;
        boolean bl6 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object7 = callSite - ns.lpst("lsau", lptv(int ), (int)475);
            }
            switch ((int)object7) {
                case -1570988198: {
                    callSite = ns.lpst("lsav", lptv(int ), (int)476);
                    continue block26;
                }
                case -1026541678: {
                    callSite = ns.lpst("lsaw", lptv(int ), (int)477);
                    continue block26;
                }
                case 304457984: {
                    break block26;
                }
            }
            break;
        }
        class_1293 class_12932 = this.getStatusEffect((class_6880<class_1291>)class_1294.field_5913);
        if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
        if (bl2) return (float)ns.lpst("lsak", lqfy(int ), (int)1077);
        CallSite callSite = ns.lpst("lsax", lqfy(int ), (int)1080);
        while (true) {
            long l5;
            Object object8;
            if ((object8 = (l5 = uk - ns.lpst("lsay", lptv(int ), (int)478)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object8 == ns.lpst("lsaz", lpsq(int ), (int)1081)) {
                return (float)(callSite * (float)(class_12932.method_5578() + ns.lpst("lsbb", lpsq(int ), (int)1083)));
            }
            object8 = ns.lpst("lsba", lpsq(int ), (int)1082);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTouchingWater() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsjt", lptv(int ), (int)573)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ns.lpst("lsju", lpsq(int ), (int)1215)) break;
            v0 /* !! */  = (long)ns.lpst("lsjv", lpsq(int ), (int)1216);
        }
        var3_1 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsjw", lptv(int ), (int)574)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ns.lpst("lsjx", lpsq(int ), (int)1217)) break;
            v1 /* !! */  = (long)ns.lpst("lsjy", lpsq(int ), (int)1218);
        }
        var2_2 /* !! */  = ns.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsjz", lptv(int ), (int)575)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ns.lpst("lska", lpsq(int ), (int)1219)) break;
            v2 /* !! */  = (long)ns.lpst("lskb", lpsq(int ), (int)1220);
        }
        var1_3 = ns.a;
        if (var3_1) {
            throw null;
            return (boolean)ns.lpst("lskc", lpsq(int ), (int)1221);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lskd", lptv(int ), (int)576)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ns.lpst("lske", lpsq(int ), (int)1222)) break;
                    v3 /* !! */  = (long)ns.lpst("lskf", lpsq(int ), (int)1223);
                }
                return this.touchingWater;
            }
lbl37:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ns.lpst("lskg", lpsq(int ), (int)1224);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl46
            }
            case 1: {
                var2_2 /* !! */  = (int)ns.lpst("lskh", lpsq(int ), (int)1225);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
lbl46:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lski", lpsq(int ), (int)1226);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ns.lpst("lskj", lpsq(int ), (int)1227);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean doesNotCollide(double d2, double d3, double d4) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = uk - ns.lpst("lseb", lptv(int ), (int)500)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lsec", lpsq(int ), (int)1140)) break;
            object = ns.lpst("lsed", lpsq(int ), (int)1141);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = uk - ns.lpst("lsee", lptv(int ), (int)501)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lsef", lpsq(int ), (int)1142)) break;
            object = ns.lpst("lseg", lpsq(int ), (int)1143);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = uk - ns.lpst("lseh", lptv(int ), (int)502)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lsei", lpsq(int ), (int)1144)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ns.lpst("lsej", lpsq(int ), (int)1145);
        }
        if (bl2) return (boolean)ns.lpst("lsek", lpsq(int ), (int)1146);
        if (bl2) return (boolean)ns.lpst("lsek", lpsq(int ), (int)1146);
        Object object = uk;
        boolean bl4 = true;
        block8: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - ns.lpst("lsel", lptv(int ), (int)503);
            }
            switch ((int)object) {
                case -355784589: {
                    callSite = ns.lpst("lsem", lptv(int ), (int)504);
                    continue block8;
                }
                case 304457984: {
                    break block8;
                }
                case 532642184: {
                    callSite = ns.lpst("lsen", lptv(int ), (int)505);
                    continue block8;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = uk - ns.lpst("lseo", lptv(int ), (int)506)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ns.lpst("lsep", lpsq(int ), (int)1147)) break;
            object2 = ns.lpst("lseq", lpsq(int ), (int)1148);
        }
        class_238 class_2383 = this.boundingBox.method_989(d2, d3, d4);
        while (true) {
            long l6;
            Object object3;
            if ((object3 = (l6 = uk - ns.lpst("lser", lptv(int ), (int)507)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ns.lpst("lses", lpsq(int ), (int)1149)) {
                return this.doesNotCollide(class_2383);
            }
            object3 = ns.lpst("lset", lpsq(int ), (int)1150);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isClimbing() {
        block65: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrnf", lptv(int ), (int)343)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ns.lpst("lrng", lpsq(int ), (int)859)) break;
                v0 /* !! */  = (long)ns.lpst("lrnh", lpsq(int ), (int)860);
            }
            var5_1 = ns.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrni", lptv(int ), (int)344)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ns.lpst("lrnj", lpsq(int ), (int)861)) break;
                v1 /* !! */  = (long)ns.lpst("lrnk", lpsq(int ), (int)862);
            }
            var4_2 /* !! */  = ns.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lrnl", lptv(int ), (int)345)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ns.lpst("lrnm", lpsq(int ), (int)863)) break;
                v2 /* !! */  = (long)ns.lpst("lrnn", lpsq(int ), (int)864);
            }
            var3_3 = ns.a;
            if (var5_1) {
                throw null;
lbl24:
                // 8 sources

                return (boolean)ns.lpst("lrno", lpsq(int ), (int)865);
            }
            if (var3_3 || var3_3) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lrnp", lptv(int ), (int)346)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ns.lpst("lrnq", lpsq(int ), (int)866)) break;
                v3 /* !! */  = (long)ns.lpst("lrnr", lpsq(int ), (int)867);
            }
            v4 /* !! */  = ns.uk;
            if (true) ** GOTO lbl37
            block36: while (true) {
                v4 /* !! */  = (long)(ns.lpst("lrnt", lptv(int ), (int)348) - ns.lpst("lrns", lptv(int ), (int)347));
lbl37:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 304457984: {
                        break block36;
                    }
                    case 768992993: {
                        continue block36;
                    }
                }
                break;
            }
            var1_4 = this.posToBlockPos(this.pos);
            if (var3_3 || var3_3) ** GOTO lbl24
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lrnu", lptv(int ), (int)349)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ns.lpst("lrnv", lpsq(int ), (int)868)) break;
                v5 /* !! */  = (long)ns.lpst("lrnw", lpsq(int ), (int)869);
            }
            var2_5 = this.getState(var1_4);
            if (var3_3 || var3_3) ** GOTO lbl24
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lrnx", lptv(int ), (int)350)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == ns.lpst("lrny", lpsq(int ), (int)870)) break;
                v6 /* !! */  = (long)ns.lpst("lrnz", lpsq(int ), (int)871);
            }
            v7 /* !! */  = ns.uk;
            if (true) ** GOTO lbl62
            block39: while (true) {
                v7 /* !! */  = (long)(ns.lpst("lrob", lptv(int ), (int)352) - ns.lpst("lroa", lptv(int ), (int)351));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -109491901: {
                        continue block39;
                    }
                    case 304457984: {
                        break block39;
                    }
                }
                break;
            }
            if (!var2_5.method_26164(class_3481.field_22414)) break block65;
            if (var3_3 || var3_3) ** GOTO lbl24
            return (boolean)ns.lpst("lroc", lpsq(int ), (int)872);
        }
        if (var3_3 || var3_3) ** GOTO lbl24
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lrod", lptv(int ), (int)353)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ns.lpst("lroe", lpsq(int ), (int)873)) break;
                    v8 /* !! */  = (long)ns.lpst("lrof", lpsq(int ), (int)874);
                }
                if (!(var2_5.method_26204() instanceof class_2533)) ** GOTO lbl98
                if (var3_3) ** GOTO lbl24
                v9 /* !! */  = ns.uk;
                if (true) ** GOTO lbl87
                block41: while (true) {
                    v9 /* !! */  = (long)(ns.lpst("lroh", lptv(int ), (int)355) - ns.lpst("lrog", lptv(int ), (int)354));
lbl87:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1808266794: {
                            continue block41;
                        }
                        case 304457984: {
                            break block41;
                        }
                    }
                    break;
                }
                if (!this.canEnterTrapdoor(var1_4, var2_5)) ** GOTO lbl98
                if (var3_3) ** GOTO lbl24
                v10 = ns.lpst("lroi", lpsq(int ), (int)875);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl101
lbl98:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v10 = ns.lpst("lroj", lpsq(int ), (int)876);
lbl101:
                // 2 sources

                return (boolean)v10;
            }
            case 0: {
                var4_2 /* !! */  = (int)ns.lpst("lrok", lpsq(int ), (int)877);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl107:
            // 3 sources

            case 1: {
                do {
                    var4_2 /* !! */  = (int)ns.lpst("lrol", lpsq(int ), (int)878);
                } while (!var5_1);
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)ns.lpst("lrom", lpsq(int ), (int)879);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 3: {
                var4_2 /* !! */  = (int)ns.lpst("lron", lpsq(int ), (int)880);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl122:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ns.lpst("lroo", lpsq(int ), (int)881);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl127:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)ns.lpst("lrop", lpsq(int ), (int)882);
                if (!var5_1) ** GOTO lbl122
                throw null;
            }
lbl131:
            // 3 sources

            case 6: {
                var4_2 /* !! */  = (int)ns.lpst("lroq", lpsq(int ), (int)883);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 7: {
                var4_2 /* !! */  = (int)ns.lpst("lror", lpsq(int ), (int)884);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl141:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)ns.lpst("lros", lpsq(int ), (int)885);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 9: {
                var4_2 /* !! */  = (int)ns.lpst("lrot", lpsq(int ), (int)886);
                if (!var5_1) ** GOTO lbl107
                throw null;
            }
lbl150:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)ns.lpst("lrou", lpsq(int ), (int)887);
                if (!var5_1) ** GOTO lbl107
                throw null;
            }
lbl154:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)ns.lpst("lrov", lpsq(int ), (int)888);
                if (!var5_1) ** GOTO lbl150
                throw null;
            }
lbl158:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)ns.lpst("lrow", lpsq(int ), (int)889);
                if (!var5_1) ** GOTO lbl154
                throw null;
            }
lbl162:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ns.lpst("lrox", lpsq(int ), (int)890);
                    if (!var5_1) ** GOTO lbl150
                    throw null;
                }
            }
lbl167:
            // 2 sources

            case 14: {
                do {
                    var4_2 /* !! */  = (int)ns.lpst("lroy", lpsq(int ), (int)891);
                } while (!var5_1);
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)ns.lpst("lroz", lpsq(int ), (int)892);
                if (!var5_1) break;
                throw null;
            }
            case 16: 
        }
        var4_2 /* !! */  = (int)ns.lpst("lrpa", lpsq(int ), (int)893);
        ** while (!var5_1)
lbl179:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float getMovementSpeed(float var1_1) {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(ns.lpst("lqya", lptv(int ), (int)228) - ns.lpst("lqxz", lptv(int ), (int)227));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1481490618: {
                    continue block24;
                }
                case 304457984: {
                    break block24;
                }
            }
            break;
        }
        var4_2 = ns.c;
        v1 /* !! */  = ns.uk;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(ns.lpst("lqyc", lptv(int ), (int)230) - ns.lpst("lqyb", lptv(int ), (int)229));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1555863733: {
                    continue block25;
                }
                case 304457984: {
                    break block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = ns.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lqyd", lptv(int ), (int)231)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ns.lpst("lqye", lpsq(int ), (int)579)) break;
            v2 /* !! */  = (long)ns.lpst("lqyf", lpsq(int ), (int)580);
        }
        var2_4 = ns.a;
        if (!var4_2) ** GOTO lbl34
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)ns.lpst("lqyg", lqfy(int ), (int)581);
                }
lbl34:
                // 1 sources

                if (var2_4 || var2_4) continue block27;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lqyh", lptv(int ), (int)232)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ns.lpst("lqyi", lpsq(int ), (int)582)) break;
                    v3 /* !! */  = (long)ns.lpst("lqyj", lpsq(int ), (int)583);
                }
                if (!this.onGround) ** GOTO lbl63
                if (var2_4) continue block27;
                v4 /* !! */  = ns.uk;
                if (true) ** GOTO lbl47
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - ns.lpst("lqyk", lptv(int ), (int)233));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1182411599: {
                            v5 = ns.lpst("lqyl", lptv(int ), (int)234);
                            continue block29;
                        }
                        case 24482048: {
                            v5 = ns.lpst("lqym", lptv(int ), (int)235);
                            continue block29;
                        }
                        case 304457984: {
                            break block29;
                        }
                        case 324419219: {
                            v5 = ns.lpst("lqyn", lptv(int ), (int)236);
                            continue block29;
                        }
                    }
                    break;
                }
                v6 = this.getMovementSpeed() * (ns.lpst("lqyo", lqfy(int ), (int)584) / (var1_1 * var1_1 * var1_1));
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl73
lbl63:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                continue block27;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lqyp", lptv(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ns.lpst("lqyq", lpsq(int ), (int)585)) {
                        v6 = this.getAirStrafingSpeed();
                        break;
                    }
                    v7 /* !! */  = (long)ns.lpst("lqyr", lpsq(int ), (int)586);
                }
lbl73:
                // 2 sources

                return v6;
lbl74:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)ns.lpst("lqys", lpsq(int ), (int)587);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl88
                }
lbl79:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)ns.lpst("lqyt", lpsq(int ), (int)588);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl98
                }
                case 2: {
                    var3_3 /* !! */  = (int)ns.lpst("lqyu", lpsq(int ), (int)589);
                    if (!var4_2) ** GOTO lbl74
                    throw null;
                }
lbl88:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)ns.lpst("lqyv", lpsq(int ), (int)590);
                        if (!var4_2) ** GOTO lbl79
                        throw null;
                    }
                }
                case 4: {
                    do {
                        var3_3 /* !! */  = (int)ns.lpst("lqyw", lpsq(int ), (int)591);
                    } while (!var4_2);
                    throw null;
                }
lbl98:
                // 2 sources

                case 5: {
                    do {
                        var3_3 /* !! */  = (int)ns.lpst("lqyx", lpsq(int ), (int)592);
                    } while (!var4_2);
                    throw null;
                }
                case 6: {
                    do {
                        var3_3 /* !! */  = (int)ns.lpst("lqyy", lpsq(int ), (int)593);
                    } while (!var4_2);
                    throw null;
                }
                case 7: 
            }
        }
        var3_3 /* !! */  = (int)ns.lpst("lqyz", lpsq(int ), (int)594);
        ** while (!var4_2)
lbl111:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2338 posToBlockPos(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltmt", lptv(int ), (int)875)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("ltmu", lpsq(int ), (int)1667)) break;
            v0 /* !! */  = (long)ns.lpst("ltmv", lpsq(int ), (int)1668);
        }
        var4_2 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("ltmw", lptv(int ), (int)876)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("ltmx", lpsq(int ), (int)1669)) break;
            v1 /* !! */  = (long)ns.lpst("ltmy", lpsq(int ), (int)1670);
        }
        var3_3 = ns.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("ltmz", lptv(int ), (int)877)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns.lpst("ltna", lpsq(int ), (int)1671)) break;
            v2 /* !! */  = (long)ns.lpst("ltnb", lpsq(int ), (int)1672);
        }
        var2_4 = ns.a;
        if (var4_2) {
            throw null;
lbl21:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl24:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("ltnc", lptv(int ), (int)878)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ns.lpst("ltnd", lpsq(int ), (int)1673)) break;
            v3 /* !! */  = (long)ns.lpst("ltne", lpsq(int ), (int)1674);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("ltnf", lptv(int ), (int)879)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ns.lpst("ltng", lpsq(int ), (int)1675)) break;
            v4 /* !! */  = (long)ns.lpst("ltnh", lpsq(int ), (int)1676);
        }
        v5 = var1_1.field_1352;
        v6 /* !! */  = ns.uk;
        if (true) ** GOTO lbl39
        block18: while (true) {
            v6 /* !! */  = (long)(v7 - ns.lpst("ltni", lptv(int ), (int)880));
lbl39:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 304457984: {
                    break block18;
                }
                case 733216495: {
                    v7 = ns.lpst("ltnj", lptv(int ), (int)881);
                    continue block18;
                }
                case 1045658977: {
                    v7 = ns.lpst("ltnk", lptv(int ), (int)882);
                    continue block18;
                }
                case 1232957904: {
                    v7 = ns.lpst("ltnl", lptv(int ), (int)883);
                    continue block18;
                }
            }
            break;
        }
        v8 = class_3532.method_15357((double)v5);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("ltnm", lptv(int ), (int)884)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ns.lpst("ltnn", lpsq(int ), (int)1677)) break;
            v9 /* !! */  = (long)ns.lpst("ltno", lpsq(int ), (int)1678);
        }
        v10 = var1_1.field_1351;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("ltnp", lptv(int ), (int)885)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ns.lpst("ltnq", lpsq(int ), (int)1679)) break;
            v11 /* !! */  = (long)ns.lpst("ltnr", lpsq(int ), (int)1680);
        }
        v12 = class_3532.method_15357((double)v10);
        v13 /* !! */  = ns.uk;
        if (true) ** GOTO lbl68
        block21: while (true) {
            v13 /* !! */  = (long)(v14 - ns.lpst("ltns", lptv(int ), (int)886));
lbl68:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1671064023: {
                    v14 = ns.lpst("ltnt", lptv(int ), (int)887);
                    continue block21;
                }
                case -1467702122: {
                    v14 = ns.lpst("ltnu", lptv(int ), (int)888);
                    continue block21;
                }
                case -1253106729: {
                    v14 = ns.lpst("ltnv", lptv(int ), (int)889);
                    continue block21;
                }
                case 304457984: {
                    break block21;
                }
            }
            break;
        }
        v15 = var1_1.field_1350;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("ltnw", lptv(int ), (int)890)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ns.lpst("ltnx", lpsq(int ), (int)1681)) break;
            v16 /* !! */  = (long)ns.lpst("ltny", lpsq(int ), (int)1682);
        }
        v17 = class_3532.method_15357((double)v15);
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("ltnz", lptv(int ), (int)891)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ns.lpst("ltoa", lpsq(int ), (int)1683)) break;
            v18 /* !! */  = (long)ns.lpst("ltob", lpsq(int ), (int)1684);
        }
        return new class_2338(v8, v12, v17);
    }

    private static /* synthetic */ void ltqw() {
        ns.lpss[900] = 1208822504;
        ns.lpss[901] = 1023029279;
        ns.lpss[902] = -1558073884;
        ns.lpss[903] = -224966979;
        ns.lpss[904] = -1092890175;
        ns.lpss[905] = 1218367886;
        ns.lpss[906] = -1033087717;
        ns.lpss[907] = -1798086327;
        ns.lpss[908] = -756491666;
        ns.lpss[909] = -682524805;
        ns.lpss[910] = 1949113026;
        ns.lpss[911] = -1853771160;
        ns.lpss[912] = 1855733427;
        ns.lpss[913] = -463673458;
        ns.lpss[914] = -2014610090;
        ns.lpss[915] = 1208622159;
        ns.lpss[916] = -632411179;
        ns.lpss[917] = -1765065889;
        ns.lpss[918] = 1231045355;
        ns.lpss[919] = -1453960954;
        ns.lpss[920] = 53086123;
        ns.lpss[921] = 175379676;
        ns.lpss[922] = 981400544;
        ns.lpss[923] = -410469895;
        ns.lpss[924] = -1580622850;
        ns.lpss[925] = 1388688682;
        ns.lpss[926] = -680432955;
        ns.lpss[927] = -1764881342;
        ns.lpss[928] = -979801016;
        ns.lpss[929] = 460752571;
        ns.lpss[930] = 1484022152;
        ns.lpss[931] = -1001886033;
        ns.lpss[932] = 115374193;
        ns.lpss[933] = -287810187;
        ns.lpss[934] = -1126289646;
        ns.lpss[935] = -1452654362;
        ns.lpss[936] = 1699726979;
        ns.lpss[937] = -363306591;
        ns.lpss[938] = 1366834194;
        ns.lpss[939] = 1432313792;
        ns.lpss[940] = 1638368182;
        ns.lpss[941] = 2018781918;
        ns.lpss[942] = -1218265895;
        ns.lpss[943] = -469583008;
        ns.lpss[944] = -1148329231;
        ns.lpss[945] = -902752680;
        ns.lpss[946] = 1734811013;
        ns.lpss[947] = 1582217862;
        ns.lpss[948] = 1679220624;
        ns.lpss[949] = -1714009030;
        ns.lpss[950] = 1388481633;
        ns.lpss[951] = 1965031205;
        ns.lpss[952] = -1883314073;
        ns.lpss[953] = 649930848;
        ns.lpss[954] = -14399860;
        ns.lpss[955] = -997760974;
        ns.lpss[956] = 775337735;
        ns.lpss[957] = -976029103;
        ns.lpss[958] = 691112663;
        ns.lpss[959] = 878783678;
        ns.lpss[960] = 528406335;
        ns.lpss[961] = -1616752532;
        ns.lpss[962] = 1100699379;
        ns.lpss[963] = 1471482950;
        ns.lpss[964] = -1732926747;
        ns.lpss[965] = -1125563808;
        ns.lpss[966] = 183521996;
        ns.lpss[967] = -255651767;
        ns.lpss[968] = -1478314538;
        ns.lpss[969] = 1512402657;
        ns.lpss[970] = -334000593;
        ns.lpss[971] = 1624754971;
        ns.lpss[972] = 1094131258;
        ns.lpss[973] = -1376411496;
        ns.lpss[974] = -888736590;
        ns.lpss[975] = 1112178681;
        ns.lpss[976] = -638989044;
        ns.lpss[977] = 398216794;
        ns.lpss[978] = 789748692;
        ns.lpss[979] = -2052734884;
        ns.lpss[980] = 827067097;
        ns.lpss[981] = -1158845796;
        ns.lpss[982] = 543182690;
        ns.lpss[983] = -1976825198;
        ns.lpss[984] = 1881797831;
        ns.lpss[985] = 1126512166;
        ns.lpss[986] = 2094858268;
        ns.lpss[987] = 49233289;
        ns.lpss[988] = 1699169752;
        ns.lpss[989] = 1154288135;
        ns.lpss[990] = -255330152;
        ns.lpss[991] = 1439364590;
        ns.lpss[992] = 201912432;
        ns.lpss[993] = -252818232;
        ns.lpss[994] = 868351079;
        ns.lpss[995] = 503261302;
        ns.lpss[996] = 744508436;
        ns.lpss[997] = -1608317212;
        ns.lpss[998] = -913525387;
        ns.lpss[999] = -903246470;
    }

    private static /* synthetic */ void ltrl() {
        ns.lptw[600] = 4047044541909768399L;
        ns.lptw[601] = 4474494807092206272L;
        ns.lptw[602] = 5942275339088491263L;
        ns.lptw[603] = 6627570528333783455L;
        ns.lptw[604] = 2534708732756031629L;
        ns.lptw[605] = 2661675317283688610L;
        ns.lptw[606] = -6318887745900973113L;
        ns.lptw[607] = -8653276843241515344L;
        ns.lptw[608] = -7080513197623339827L;
        ns.lptw[609] = -8249776616147853920L;
        ns.lptw[610] = -2987907801686835011L;
        ns.lptw[611] = 2400008395540220843L;
        ns.lptw[612] = 3893606596623607972L;
        ns.lptw[613] = -469360804585188L;
        ns.lptw[614] = -8556852576326374477L;
        ns.lptw[615] = -6644872820674976570L;
        ns.lptw[616] = 8075622060634259091L;
        ns.lptw[617] = -5326555213102698633L;
        ns.lptw[618] = -8722731072964599117L;
        ns.lptw[619] = -4542753706401853186L;
        ns.lptw[620] = -7765998834838716137L;
        ns.lptw[621] = 8394538572291129404L;
        ns.lptw[622] = 4106770679653078033L;
        ns.lptw[623] = 1361112689426520264L;
        ns.lptw[624] = -4211233889259844807L;
        ns.lptw[625] = -2928033019296700377L;
        ns.lptw[626] = -4310124057546857146L;
        ns.lptw[627] = 8112765844233328107L;
        ns.lptw[628] = 206957252999846452L;
        ns.lptw[629] = -164278416504700876L;
        ns.lptw[630] = 5222393421216056894L;
        ns.lptw[631] = 165991686139805530L;
        ns.lptw[632] = -2820236212107158283L;
        ns.lptw[633] = 8417141512316638482L;
        ns.lptw[634] = -6989413308055623004L;
        ns.lptw[635] = -4064369000365103991L;
        ns.lptw[636] = -3433636812667815008L;
        ns.lptw[637] = -4352311725822186942L;
        ns.lptw[638] = 5994815187199853992L;
        ns.lptw[639] = -454843200618062688L;
        ns.lptw[640] = 3097402215401301030L;
        ns.lptw[641] = 4328255909626634044L;
        ns.lptw[642] = 9050491059636484988L;
        ns.lptw[643] = -1149039195048800087L;
        ns.lptw[644] = 2205812522159668803L;
        ns.lptw[645] = 2279990363825619855L;
        ns.lptw[646] = 3344433765245441735L;
        ns.lptw[647] = 1635442079679640626L;
        ns.lptw[648] = -4206288091260457989L;
        ns.lptw[649] = 4855377628693827419L;
        ns.lptw[650] = -1992983416257460532L;
        ns.lptw[651] = -6170154082388977250L;
        ns.lptw[652] = 6581668467855015506L;
        ns.lptw[653] = -517094627791761482L;
        ns.lptw[654] = 8134575430800581101L;
        ns.lptw[655] = -2890848170503185123L;
        ns.lptw[656] = -173451186643620319L;
        ns.lptw[657] = -6942948131205249649L;
        ns.lptw[658] = -9054915443540620503L;
        ns.lptw[659] = -9062560853796887903L;
        ns.lptw[660] = -1064250750368144063L;
        ns.lptw[661] = 615187963507281550L;
        ns.lptw[662] = -5686941188483913738L;
        ns.lptw[663] = -5248453764821543755L;
        ns.lptw[664] = 9093685207904934063L;
        ns.lptw[665] = -9192979405851858497L;
        ns.lptw[666] = 3451299500872387073L;
        ns.lptw[667] = -7271366834619854197L;
        ns.lptw[668] = 754616836272925420L;
        ns.lptw[669] = 6936129419284906541L;
        ns.lptw[670] = 4214727393390474666L;
        ns.lptw[671] = -741355376567601140L;
        ns.lptw[672] = -5687569828046164808L;
        ns.lptw[673] = 3327618162389599092L;
        ns.lptw[674] = 1864144093658684147L;
        ns.lptw[675] = -2786823528878895805L;
        ns.lptw[676] = 1798581319359946954L;
        ns.lptw[677] = 4090903480983513753L;
        ns.lptw[678] = -3488253820718317010L;
        ns.lptw[679] = 147864916879078498L;
        ns.lptw[680] = 4149860049486074258L;
        ns.lptw[681] = -130324172459290878L;
        ns.lptw[682] = -2519252054707578835L;
        ns.lptw[683] = 3205262780211106411L;
        ns.lptw[684] = 9041437816501013775L;
        ns.lptw[685] = 3358266018943515642L;
        ns.lptw[686] = 2248637598657556790L;
        ns.lptw[687] = 8540852552378966769L;
        ns.lptw[688] = -846862043587077705L;
        ns.lptw[689] = -8756525598649638862L;
        ns.lptw[690] = -5548452351430899841L;
        ns.lptw[691] = 390831188942722962L;
        ns.lptw[692] = -678104897281343920L;
        ns.lptw[693] = 8386794155180709003L;
        ns.lptw[694] = -7204174541031848590L;
        ns.lptw[695] = -4572922919187503355L;
        ns.lptw[696] = 2076419779685623863L;
        ns.lptw[697] = -1869600648997890620L;
        ns.lptw[698] = 1537052898642900529L;
        ns.lptw[699] = 768329185184577260L;
    }

    private static /* synthetic */ void ltqc() {
        ns.lpsr[700] = 878063011;
        ns.lpsr[701] = 814892916;
        ns.lpsr[702] = -845777583;
        ns.lpsr[703] = 88210066;
        ns.lpsr[704] = -838095197;
        ns.lpsr[705] = -1194012595;
        ns.lpsr[706] = -1187958329;
        ns.lpsr[707] = 440896637;
        ns.lpsr[708] = -866755651;
        ns.lpsr[709] = 781986706;
        ns.lpsr[710] = -1559191301;
        ns.lpsr[711] = 938107469;
        ns.lpsr[712] = -22291607;
        ns.lpsr[713] = 950249591;
        ns.lpsr[714] = 1601981082;
        ns.lpsr[715] = 698311470;
        ns.lpsr[716] = -1659205870;
        ns.lpsr[717] = -166301538;
        ns.lpsr[718] = -277197460;
        ns.lpsr[719] = -1131941358;
        ns.lpsr[720] = 210636662;
        ns.lpsr[721] = 1052045417;
        ns.lpsr[722] = -1999517996;
        ns.lpsr[723] = 541004684;
        ns.lpsr[724] = 1970603478;
        ns.lpsr[725] = 568761524;
        ns.lpsr[726] = -924909012;
        ns.lpsr[727] = -1971599687;
        ns.lpsr[728] = -200960817;
        ns.lpsr[729] = 458429588;
        ns.lpsr[730] = -1184150946;
        ns.lpsr[731] = 1352575209;
        ns.lpsr[732] = 1753212792;
        ns.lpsr[733] = 1306053518;
        ns.lpsr[734] = 1970570893;
        ns.lpsr[735] = 2098083301;
        ns.lpsr[736] = 380699555;
        ns.lpsr[737] = -1872317161;
        ns.lpsr[738] = -336656712;
        ns.lpsr[739] = 279329330;
        ns.lpsr[740] = -1360977764;
        ns.lpsr[741] = 1184997531;
        ns.lpsr[742] = 709763201;
        ns.lpsr[743] = 129255335;
        ns.lpsr[744] = -1551583924;
        ns.lpsr[745] = -392871641;
        ns.lpsr[746] = 1447461805;
        ns.lpsr[747] = 1464092802;
        ns.lpsr[748] = -155727474;
        ns.lpsr[749] = -63174202;
        ns.lpsr[750] = -939038931;
        ns.lpsr[751] = 941455964;
        ns.lpsr[752] = -721466591;
        ns.lpsr[753] = -928489177;
        ns.lpsr[754] = -1437206865;
        ns.lpsr[755] = -1711182281;
        ns.lpsr[756] = 1212443037;
        ns.lpsr[757] = -1739796187;
        ns.lpsr[758] = -423059168;
        ns.lpsr[759] = -1195123989;
        ns.lpsr[760] = 985284865;
        ns.lpsr[761] = 1300771354;
        ns.lpsr[762] = -1743377184;
        ns.lpsr[763] = -823436398;
        ns.lpsr[764] = -1784786260;
        ns.lpsr[765] = -445251522;
        ns.lpsr[766] = -1924745450;
        ns.lpsr[767] = 1677224312;
        ns.lpsr[768] = -992804323;
        ns.lpsr[769] = -960580510;
        ns.lpsr[770] = 10531659;
        ns.lpsr[771] = -1022949857;
        ns.lpsr[772] = -1962467181;
        ns.lpsr[773] = 313699585;
        ns.lpsr[774] = 492388777;
        ns.lpsr[775] = -1658093731;
        ns.lpsr[776] = -1838063826;
        ns.lpsr[777] = 471123034;
        ns.lpsr[778] = -1447841146;
        ns.lpsr[779] = -701835682;
        ns.lpsr[780] = 432437108;
        ns.lpsr[781] = 1713501217;
        ns.lpsr[782] = -2082054936;
        ns.lpsr[783] = -982267743;
        ns.lpsr[784] = -1980285989;
        ns.lpsr[785] = -65893599;
        ns.lpsr[786] = -1596111021;
        ns.lpsr[787] = 1339795576;
        ns.lpsr[788] = 446797420;
        ns.lpsr[789] = 804742644;
        ns.lpsr[790] = -2138943560;
        ns.lpsr[791] = -1075871618;
        ns.lpsr[792] = -1798627762;
        ns.lpsr[793] = 1260293615;
        ns.lpsr[794] = -1052066617;
        ns.lpsr[795] = 1445657997;
        ns.lpsr[796] = 1527929618;
        ns.lpsr[797] = -1089519168;
        ns.lpsr[798] = 1820997914;
        ns.lpsr[799] = -850241636;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateSwimming() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsok", lptv(int ), (int)622)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lsol", lpsq(int ), (int)1287)) break;
            v0 /* !! */  = (long)ns.lpst("lsom", lpsq(int ), (int)1288);
        }
        var3_1 = ns.c;
        v1 /* !! */  = ns.uk;
        if (true) ** GOTO lbl11
        block53: while (true) {
            v1 /* !! */  = (long)(v2 - ns.lpst("lson", lptv(int ), (int)623));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 304457984: {
                    break block53;
                }
                case 903299601: {
                    v2 = ns.lpst("lsoo", lptv(int ), (int)624);
                    continue block53;
                }
                case 2030712993: {
                    v2 = ns.lpst("lsop", lptv(int ), (int)625);
                    continue block53;
                }
                case 2130320357: {
                    v2 = ns.lpst("lsoq", lptv(int ), (int)626);
                    continue block53;
                }
            }
            break;
        }
        var2_2 /* !! */  = ns.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsor", lptv(int ), (int)627)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ns.lpst("lsos", lpsq(int ), (int)1289)) break;
            v3 /* !! */  = (long)ns.lpst("lsot", lpsq(int ), (int)1290);
        }
        var1_3 = ns.a;
        if (var3_1) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsou", lptv(int ), (int)628)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ns.lpst("lsov", lpsq(int ), (int)1291)) break;
            v4 /* !! */  = (long)ns.lpst("lsow", lpsq(int ), (int)1292);
        }
        if (!this.isSwimming) ** GOTO lbl91
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lsox", lptv(int ), (int)629)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ns.lpst("lsoy", lpsq(int ), (int)1293)) break;
            v5 /* !! */  = (long)ns.lpst("lsoz", lpsq(int ), (int)1294);
        }
        if (!this.isSprinting()) ** GOTO lbl-1000
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lspa", lptv(int ), (int)630)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ns.lpst("lspb", lpsq(int ), (int)1295)) break;
            v6 /* !! */  = (long)ns.lpst("lspc", lpsq(int ), (int)1296);
        }
        if (!this.isTouchingWater()) ** GOTO lbl-1000
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lspd", lptv(int ), (int)631)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ns.lpst("lspe", lpsq(int ), (int)1297)) break;
            v7 /* !! */  = (long)ns.lpst("lspf", lpsq(int ), (int)1298);
        }
        v8 /* !! */  = ns.uk;
        if (true) ** GOTO lbl63
        block60: while (true) {
            v8 /* !! */  = (long)(v9 - ns.lpst("lspg", lptv(int ), (int)632));
lbl63:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 203003163: {
                    v9 = ns.lpst("lsph", lptv(int ), (int)633);
                    continue block60;
                }
                case 304457984: {
                    break block60;
                }
                case 1261226881: {
                    v9 = ns.lpst("lspi", lptv(int ), (int)634);
                    continue block60;
                }
            }
            break;
        }
        if (!this.player.method_5765()) {
            v10 = ns.lpst("lspj", lpsq(int ), (int)1299);
            if (var3_1) {
                throw null;
            }
        } else lbl-1000:
        // 3 sources

        {
            v10 = ns.lpst("lspk", lpsq(int ), (int)1300);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lspl", lptv(int ), (int)635)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ns.lpst("lspm", lpsq(int ), (int)1301)) break;
            v11 /* !! */  = (long)ns.lpst("lspn", lpsq(int ), (int)1302);
        }
        this.isSwimming = v10;
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl91:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl32
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lspo", lptv(int ), (int)636)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ns.lpst("lspp", lpsq(int ), (int)1303)) break;
                v12 /* !! */  = (long)ns.lpst("lspq", lpsq(int ), (int)1304);
            }
            if (!this.isSprinting()) ** GOTO lbl-1000
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("lspr", lptv(int ), (int)637)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == ns.lpst("lsps", lpsq(int ), (int)1305)) break;
                v13 /* !! */  = (long)ns.lpst("lspt", lpsq(int ), (int)1306);
            }
            if (!this.isSubmergedInWater()) ** GOTO lbl-1000
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_9 = ns.uk - ns.lpst("lspu", lptv(int ), (int)638)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == ns.lpst("lspv", lpsq(int ), (int)1307)) break;
                v14 /* !! */  = (long)ns.lpst("lspw", lpsq(int ), (int)1308);
            }
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_10 = ns.uk - ns.lpst("lspx", lptv(int ), (int)639)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == ns.lpst("lspy", lpsq(int ), (int)1309)) break;
                v15 /* !! */  = (long)ns.lpst("lspz", lpsq(int ), (int)1310);
            }
            if (this.player.method_5765()) ** GOTO lbl-1000
            v16 /* !! */  = ns.uk;
            if (true) ** GOTO lbl119
            block66: while (true) {
                v16 /* !! */  = (long)(ns.lpst("lsqb", lptv(int ), (int)641) - ns.lpst("lsqa", lptv(int ), (int)640));
lbl119:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case 304457984: {
                        break block66;
                    }
                    case 1063830843: {
                        continue block66;
                    }
                }
                break;
            }
            v17 /* !! */  = ns.uk;
            if (true) ** GOTO lbl128
            block67: while (true) {
                v17 /* !! */  = (long)(ns.lpst("lsqd", lptv(int ), (int)643) - ns.lpst("lsqc", lptv(int ), (int)642));
lbl128:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -214438613: {
                        continue block67;
                    }
                    case 304457984: {
                        break block67;
                    }
                }
                break;
            }
            v18 = this.player.method_73183();
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_11 = ns.uk - ns.lpst("lsqe", lptv(int ), (int)644)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == ns.lpst("lsqf", lpsq(int ), (int)1311)) break;
                v19 /* !! */  = (long)ns.lpst("lsqg", lpsq(int ), (int)1312);
            }
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_12 = ns.uk - ns.lpst("lsqh", lptv(int ), (int)645)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == ns.lpst("lsqi", lpsq(int ), (int)1313)) break;
                v20 /* !! */  = (long)ns.lpst("lsqj", lpsq(int ), (int)1314);
            }
            v21 = this.posToBlockPos(this.pos);
            v22 /* !! */  = ns.uk;
            if (true) ** GOTO lbl149
            block70: while (true) {
                v22 /* !! */  = (long)(v23 - ns.lpst("lsqk", lptv(int ), (int)646));
lbl149:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1435423311: {
                        v23 = ns.lpst("lsql", lptv(int ), (int)647);
                        continue block70;
                    }
                    case -1426858472: {
                        v23 = ns.lpst("lsqm", lptv(int ), (int)648);
                        continue block70;
                    }
                    case 304457984: {
                        break block70;
                    }
                    case 1103452171: {
                        v23 = ns.lpst("lsqn", lptv(int ), (int)649);
                        continue block70;
                    }
                }
                break;
            }
            v24 = v18.method_8316(v21);
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_13 = ns.uk - ns.lpst("lsqo", lptv(int ), (int)650)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == ns.lpst("lsqp", lpsq(int ), (int)1315)) break;
                v25 /* !! */  = (long)ns.lpst("lsqq", lpsq(int ), (int)1316);
            }
            v26 /* !! */  = ns.uk;
            if (true) ** GOTO lbl171
            block72: while (true) {
                v26 /* !! */  = (long)(v27 - ns.lpst("lsqr", lptv(int ), (int)651));
lbl171:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case 304457984: {
                        break block72;
                    }
                    case 1225990454: {
                        v27 = ns.lpst("lsqs", lptv(int ), (int)652);
                        continue block72;
                    }
                    case 1583421525: {
                        v27 = ns.lpst("lsqt", lptv(int ), (int)653);
                        continue block72;
                    }
                    case 1844976474: {
                        v27 = ns.lpst("lsqu", lptv(int ), (int)654);
                        continue block72;
                    }
                }
                break;
            }
            if (v24.method_15767(class_3486.field_15517)) {
                v28 = ns.lpst("lsqv", lpsq(int ), (int)1317);
                if (var3_1) {
                    throw null;
                }
            } else lbl-1000:
            // 4 sources

            {
                v28 = ns.lpst("lsqw", lpsq(int ), (int)1318);
            }
            v29 /* !! */  = ns.uk;
            if (true) ** GOTO lbl193
            block73: while (true) {
                v29 /* !! */  = (long)(v30 - ns.lpst("lsqx", lptv(int ), (int)655));
lbl193:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case 304457984: {
                        break block73;
                    }
                    case 649200901: {
                        v30 = ns.lpst("lsqy", lptv(int ), (int)656);
                        continue block73;
                    }
                    case 834867701: {
                        v30 = ns.lpst("lsqz", lptv(int ), (int)657);
                        continue block73;
                    }
                    case 1230379049: {
                        v30 = ns.lpst("lsra", lptv(int ), (int)658);
                        continue block73;
                    }
                }
                break;
            }
            this.isSwimming = v28;
            if (var1_3) ** GOTO lbl32
lbl207:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
            case 0: {
                var2_2 /* !! */  = (int)ns.lpst("lsrb", lpsq(int ), (int)1319);
                if (!var3_1) break;
                throw null;
            }
lbl214:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("lsrc", lpsq(int ), (int)1320);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lsrd", lpsq(int ), (int)1321);
                if (!var3_1) break;
                throw null;
            }
lbl223:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ns.lpst("lsre", lpsq(int ), (int)1322);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
lbl227:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("lsrf", lpsq(int ), (int)1323);
                } while (!var3_1);
                throw null;
            }
lbl232:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ns.lpst("lsrg", lpsq(int ), (int)1324);
                if (!var3_1) ** GOTO lbl227
                throw null;
            }
lbl236:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ns.lpst("lsrh", lpsq(int ), (int)1325);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                    break;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ns.lpst("lsri", lpsq(int ), (int)1326);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ns.lpst("lsrj", lpsq(int ), (int)1327);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
lbl250:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ns.lpst("lsrk", lpsq(int ), (int)1328);
                if (!var3_1) ** GOTO lbl236
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ns.lpst("lsrl", lpsq(int ), (int)1329);
                if (!var3_1) ** GOTO lbl236
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)ns.lpst("lsrm", lpsq(int ), (int)1330);
                if (!var3_1) ** GOTO lbl236
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)ns.lpst("lsrn", lpsq(int ), (int)1331);
        ** while (!var3_1)
lbl265:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqh() {
        ns.lpsr[1200] = -429530788;
        ns.lpsr[1201] = -1952972565;
        ns.lpsr[1202] = 826457097;
        ns.lpsr[1203] = -1540185095;
        ns.lpsr[1204] = 192345556;
        ns.lpsr[1205] = 920166663;
        ns.lpsr[1206] = -170813329;
        ns.lpsr[1207] = 93780887;
        ns.lpsr[1208] = -1729284912;
        ns.lpsr[1209] = -191250659;
        ns.lpsr[1210] = 681590277;
        ns.lpsr[1211] = -512511956;
        ns.lpsr[1212] = 473419704;
        ns.lpsr[1213] = 397976843;
        ns.lpsr[1214] = -1808462023;
        ns.lpsr[1215] = -94502016;
        ns.lpsr[1216] = 1033914742;
        ns.lpsr[1217] = 1525470497;
        ns.lpsr[1218] = 557881691;
        ns.lpsr[1219] = 2010919462;
        ns.lpsr[1220] = -1825222742;
        ns.lpsr[1221] = 1043813903;
        ns.lpsr[1222] = -950956702;
        ns.lpsr[1223] = 2107733907;
        ns.lpsr[1224] = -1580418921;
        ns.lpsr[1225] = -1640898004;
        ns.lpsr[1226] = 1194731309;
        ns.lpsr[1227] = -40948059;
        ns.lpsr[1228] = 486335597;
        ns.lpsr[1229] = 1948003386;
        ns.lpsr[1230] = -384949725;
        ns.lpsr[1231] = 2082341024;
        ns.lpsr[1232] = -209118803;
        ns.lpsr[1233] = 477123139;
        ns.lpsr[1234] = -1693112921;
        ns.lpsr[1235] = -1487102007;
        ns.lpsr[1236] = -1734637325;
        ns.lpsr[1237] = -1491964911;
        ns.lpsr[1238] = -67650913;
        ns.lpsr[1239] = 1495885335;
        ns.lpsr[1240] = 664101952;
        ns.lpsr[1241] = -519761417;
        ns.lpsr[1242] = 653761069;
        ns.lpsr[1243] = 858937212;
        ns.lpsr[1244] = 1020476687;
        ns.lpsr[1245] = -1569704448;
        ns.lpsr[1246] = 486668309;
        ns.lpsr[1247] = 236890750;
        ns.lpsr[1248] = -1604652215;
        ns.lpsr[1249] = 1494903708;
        ns.lpsr[1250] = 254326566;
        ns.lpsr[1251] = 500055177;
        ns.lpsr[1252] = -1782404922;
        ns.lpsr[1253] = 1927172888;
        ns.lpsr[1254] = -1623420410;
        ns.lpsr[1255] = 1107082294;
        ns.lpsr[1256] = -924092228;
        ns.lpsr[1257] = 162019904;
        ns.lpsr[1258] = -1488948903;
        ns.lpsr[1259] = 866574915;
        ns.lpsr[1260] = -591448080;
        ns.lpsr[1261] = 2064505999;
        ns.lpsr[1262] = -453810642;
        ns.lpsr[1263] = 1475871943;
        ns.lpsr[1264] = 1344383773;
        ns.lpsr[1265] = -973512892;
        ns.lpsr[1266] = -806238935;
        ns.lpsr[1267] = -472785814;
        ns.lpsr[1268] = 1140496147;
        ns.lpsr[1269] = -751344191;
        ns.lpsr[1270] = 1224164449;
        ns.lpsr[1271] = -933736331;
        ns.lpsr[1272] = -969112610;
        ns.lpsr[1273] = -173565113;
        ns.lpsr[1274] = 400145366;
        ns.lpsr[1275] = 633128195;
        ns.lpsr[1276] = 982878195;
        ns.lpsr[1277] = -1123721649;
        ns.lpsr[1278] = -448330750;
        ns.lpsr[1279] = -1564327033;
        ns.lpsr[1280] = -596974440;
        ns.lpsr[1281] = 946731823;
        ns.lpsr[1282] = 1016162576;
        ns.lpsr[1283] = -1533645040;
        ns.lpsr[1284] = 1370472543;
        ns.lpsr[1285] = -210509810;
        ns.lpsr[1286] = 1586103643;
        ns.lpsr[1287] = -1168636043;
        ns.lpsr[1288] = -1618062417;
        ns.lpsr[1289] = 2029544811;
        ns.lpsr[1290] = 1149746207;
        ns.lpsr[1291] = -728354176;
        ns.lpsr[1292] = 854530471;
        ns.lpsr[1293] = -905249986;
        ns.lpsr[1294] = 1993093726;
        ns.lpsr[1295] = -903938111;
        ns.lpsr[1296] = 1586122290;
        ns.lpsr[1297] = 1088513973;
        ns.lpsr[1298] = -1620513980;
        ns.lpsr[1299] = 73623748;
    }

    private static /* synthetic */ void ltrj() {
        ns.lptw[400] = -8793228716267071144L;
        ns.lptw[401] = -4950649011671556448L;
        ns.lptw[402] = 2609820125715136862L;
        ns.lptw[403] = 5122583562218488845L;
        ns.lptw[404] = -1288459879765284241L;
        ns.lptw[405] = 5605564853158563530L;
        ns.lptw[406] = 6890809136018111237L;
        ns.lptw[407] = 7394041759855868341L;
        ns.lptw[408] = 3696429751651621748L;
        ns.lptw[409] = 1105538059959074911L;
        ns.lptw[410] = 7630289341865595619L;
        ns.lptw[411] = -2118348510406338171L;
        ns.lptw[412] = -7550513621828721415L;
        ns.lptw[413] = 3959950050746926584L;
        ns.lptw[414] = 1712081876444901371L;
        ns.lptw[415] = -2606194150678859024L;
        ns.lptw[416] = -5529703935464207514L;
        ns.lptw[417] = 2304301208159842808L;
        ns.lptw[418] = 7838583574795530526L;
        ns.lptw[419] = 2880571823632163351L;
        ns.lptw[420] = 4064990662747110329L;
        ns.lptw[421] = -8174574624312880902L;
        ns.lptw[422] = 8231400533509869422L;
        ns.lptw[423] = 7016247812725956993L;
        ns.lptw[424] = 459826169386075361L;
        ns.lptw[425] = -5740018766012020579L;
        ns.lptw[426] = 3212900062156059805L;
        ns.lptw[427] = 9081217422182877928L;
        ns.lptw[428] = 8304087475152193386L;
        ns.lptw[429] = -8753262030569339258L;
        ns.lptw[430] = 59550331141300054L;
        ns.lptw[431] = 5055624114342090107L;
        ns.lptw[432] = 4587006161259903250L;
        ns.lptw[433] = -7991551930947633974L;
        ns.lptw[434] = -2958120337766790950L;
        ns.lptw[435] = 5441546898721207206L;
        ns.lptw[436] = 3721950171778679315L;
        ns.lptw[437] = 7561573613601704269L;
        ns.lptw[438] = -946552041466787879L;
        ns.lptw[439] = 3554947392277580992L;
        ns.lptw[440] = -8250325179327646831L;
        ns.lptw[441] = -2267596188705752177L;
        ns.lptw[442] = -8428306613761160744L;
        ns.lptw[443] = 3740136706076308477L;
        ns.lptw[444] = -2806750670245479167L;
        ns.lptw[445] = -1684035275794000935L;
        ns.lptw[446] = -6842273305886267646L;
        ns.lptw[447] = 4556495329217595708L;
        ns.lptw[448] = -3717177865700811147L;
        ns.lptw[449] = -7894807744883916798L;
        ns.lptw[450] = 2070486790692638519L;
        ns.lptw[451] = 8902044512451985438L;
        ns.lptw[452] = 3235976057252837482L;
        ns.lptw[453] = -6432875328797295477L;
        ns.lptw[454] = 5367973327941137519L;
        ns.lptw[455] = -7891750879992196593L;
        ns.lptw[456] = -3301215685160060504L;
        ns.lptw[457] = -4500983290351327689L;
        ns.lptw[458] = -8580059345864794953L;
        ns.lptw[459] = 2911467668646095983L;
        ns.lptw[460] = 9031605969705251660L;
        ns.lptw[461] = -6921898012964510716L;
        ns.lptw[462] = 3840739913776513144L;
        ns.lptw[463] = 3092056128149885808L;
        ns.lptw[464] = -4984750086416846047L;
        ns.lptw[465] = -3728305433624616745L;
        ns.lptw[466] = -7468940535008110858L;
        ns.lptw[467] = -6922671531139699486L;
        ns.lptw[468] = 3462401531451640088L;
        ns.lptw[469] = 8000779921701862506L;
        ns.lptw[470] = -1621420250629160484L;
        ns.lptw[471] = -5241954924100886651L;
        ns.lptw[472] = 1591925203938083626L;
        ns.lptw[473] = -3016187819057598901L;
        ns.lptw[474] = 184076021817966185L;
        ns.lptw[475] = 3570999839723724576L;
        ns.lptw[476] = 2496105786573454588L;
        ns.lptw[477] = -3900823665173941359L;
        ns.lptw[478] = 1435764350864197805L;
        ns.lptw[479] = 1090520957707181245L;
        ns.lptw[480] = 1906693311243580736L;
        ns.lptw[481] = 5760863525590923241L;
        ns.lptw[482] = 7682804132658892518L;
        ns.lptw[483] = 4479524686820300060L;
        ns.lptw[484] = 2715062324511398208L;
        ns.lptw[485] = 2226008935579151722L;
        ns.lptw[486] = 319622809034102923L;
        ns.lptw[487] = -3177799924992833674L;
        ns.lptw[488] = 2372790494523100073L;
        ns.lptw[489] = -3396428719446488548L;
        ns.lptw[490] = 3051136906742048407L;
        ns.lptw[491] = -4240984159310994399L;
        ns.lptw[492] = -2854739982174884354L;
        ns.lptw[493] = -6184322892812145954L;
        ns.lptw[494] = -6716001099776967569L;
        ns.lptw[495] = -2670832745004846582L;
        ns.lptw[496] = 1336313218432409633L;
        ns.lptw[497] = -6662365969978419270L;
        ns.lptw[498] = 6426281209564576627L;
        ns.lptw[499] = -785530596056403913L;
    }

    private static /* synthetic */ int lpsq(int n2) {
        return lpsr[n2] ^ lpss[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double getSwimHeight() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsis", lptv(int ), (int)560)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ns.lpst("lsit", lpsq(int ), (int)1201)) break;
            v0 /* !! */  = (long)ns.lpst("lsiu", lpsq(int ), (int)1202);
        }
        var3_1 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsiv", lptv(int ), (int)561)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ns.lpst("lsiw", lpsq(int ), (int)1203)) break;
            v1 /* !! */  = (long)ns.lpst("lsix", lpsq(int ), (int)1204);
        }
        var2_2 /* !! */  = ns.b;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - ns.lpst("lsiy", lptv(int ), (int)562));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1874194579: {
                    v3 = ns.lpst("lsiz", lptv(int ), (int)563);
                    continue block23;
                }
                case -1640188986: {
                    v3 = ns.lpst("lsja", lptv(int ), (int)564);
                    continue block23;
                }
                case 304457984: {
                    break block23;
                }
                case 785799367: {
                    v3 = ns.lpst("lsjb", lptv(int ), (int)565);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = ns.a;
        if (var3_1) {
            throw null;
lbl34:
            // 3 sources

            return (double)ns.lpst("lsjc", lqfo(int ), (int)566);
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v4 /* !! */  = ns.uk;
        if (true) ** GOTO lbl41
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - ns.lpst("lsjd", lptv(int ), (int)567));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -74731510: {
                    v5 = ns.lpst("lsje", lptv(int ), (int)568);
                    continue block25;
                }
                case 304457984: {
                    break block25;
                }
                case 608261560: {
                    v5 = ns.lpst("lsjf", lptv(int ), (int)569);
                    continue block25;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsjg", lptv(int ), (int)570)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ns.lpst("lsjh", lpsq(int ), (int)1205)) break;
            v6 /* !! */  = (long)ns.lpst("lsji", lpsq(int ), (int)1206);
        }
        if (!((double)this.player.method_5751() < ns.lpst("lsjj", lqfo(int ), (int)571))) ** GOTO lbl65
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 /* !! */  = 0.0;
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl65:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v7 /* !! */  = (double)ns.lpst("lsjk", lqfo(int ), (int)572);
lbl68:
            // 2 sources

            return v7 /* !! */ ;
lbl69:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ns.lpst("lsjl", lpsq(int ), (int)1207);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl78
            }
            case 1: {
                var2_2 /* !! */  = (int)ns.lpst("lsjm", lpsq(int ), (int)1208);
                if (var3_1) {
                    throw null;
                }
            }
lbl78:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lsjn", lpsq(int ), (int)1209);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 3: {
                var2_2 /* !! */  = (int)ns.lpst("lsjo", lpsq(int ), (int)1210);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl88:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ns.lpst("lsjp", lpsq(int ), (int)1211);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ns.lpst("lsjq", lpsq(int ), (int)1212);
                if (!var3_1) ** GOTO lbl88
                throw null;
            }
lbl96:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ns.lpst("lsjr", lpsq(int ), (int)1213);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)ns.lpst("lsjs", lpsq(int ), (int)1214);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite lpst(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ns(class_1657 var1_1, ns$SimulatedPlayerInput var2_2, class_243 var3_3, class_243 var4_4, class_238 var5_5, float var6_6, float var7_7, boolean var8_8, float var9_9, int var10_10, boolean var11_11, boolean var12_12, boolean var13_13, boolean var14_14, boolean var15_15, boolean var16_16, boolean var17_17, boolean var18_18, Object2DoubleMap<class_6862<class_3611>> var19_19, HashSet<class_6862<class_3611>> var20_20) {
        var22_21 /* !! */  = ns.b;
        super();
        if (var22_21 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_21 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.simulatedTicks = (int)ns.lpst("lpsu", lpsq(int ), (int)0);
                this.clipLedged = ns.lpst("lpsv", lpsq(int ), (int)1);
                this.player = var1_1;
                this.input = var2_2;
                this.pos = var3_3;
                this.velocity = var4_4;
                this.boundingBox = var5_5;
                this.yaw = var6_6;
                this.pitch = var7_7;
                this.sprinting = var8_8;
                this.fallDistance = var9_9;
                this.jumpingCooldown = var10_10;
                this.isJumping = var11_11;
                this.isFallFlying = var12_12;
                this.onGround = var13_13;
                this.horizontalCollision = var14_14;
                this.verticalCollision = var15_15;
                this.touchingWater = var16_16;
                this.isSwimming = var17_17;
                this.submergedInWater = var18_18;
                this.fluidHeight = var19_19;
                this.submergedFluidTag = var20_20;
                return;
            }
lbl29:
            // 2 sources

            case 0: {
                var22_21 /* !! */  = (int)ns.lpst("lpsw", lpsq(int ), (int)2);
                ** GOTO lbl38
            }
            case 1: {
                var22_21 /* !! */  = (int)ns.lpst("lpsx", lpsq(int ), (int)3);
                ** GOTO lbl62
            }
lbl35:
            // 2 sources

            case 2: {
                var22_21 /* !! */  = (int)ns.lpst("lpsy", lpsq(int ), (int)4);
                ** GOTO lbl47
            }
lbl38:
            // 4 sources

            case 3: {
                var22_21 /* !! */  = (int)ns.lpst("lpsz", lpsq(int ), (int)5);
                ** GOTO lbl99
            }
lbl41:
            // 3 sources

            case 4: {
                var22_21 /* !! */  = (int)ns.lpst("lpta", lpsq(int ), (int)6);
                ** GOTO lbl99
            }
lbl44:
            // 2 sources

            case 5: {
                var22_21 /* !! */  = (int)ns.lpst("lptb", lpsq(int ), (int)7);
                ** GOTO lbl59
            }
lbl47:
            // 2 sources

            case 6: {
                var22_21 /* !! */  = (int)ns.lpst("lptc", lpsq(int ), (int)8);
                break;
            }
            case 7: {
                var22_21 /* !! */  = (int)ns.lpst("lptd", lpsq(int ), (int)9);
                ** GOTO lbl38
            }
lbl53:
            // 2 sources

            case 8: {
                var22_21 /* !! */  = (int)ns.lpst("lpte", lpsq(int ), (int)10);
                ** GOTO lbl65
            }
lbl56:
            // 2 sources

            case 9: {
                var22_21 /* !! */  = (int)ns.lpst("lptf", lpsq(int ), (int)11);
                ** GOTO lbl41
            }
lbl59:
            // 3 sources

            case 10: {
                var22_21 /* !! */  = (int)ns.lpst("lptg", lpsq(int ), (int)12);
                ** GOTO lbl99
            }
lbl62:
            // 2 sources

            case 11: {
                var22_21 /* !! */  = (int)ns.lpst("lpth", lpsq(int ), (int)13);
                ** GOTO lbl93
            }
lbl65:
            // 2 sources

            case 12: {
                var22_21 /* !! */  = (int)ns.lpst("lpti", lpsq(int ), (int)14);
                ** GOTO lbl35
            }
            case 13: {
                while (true) {
                    var22_21 /* !! */  = (int)ns.lpst("lptj", lpsq(int ), (int)15);
                }
            }
            case 14: {
                var22_21 /* !! */  = (int)ns.lpst("lptk", lpsq(int ), (int)16);
                ** GOTO lbl44
            }
            case 15: {
                var22_21 /* !! */  = (int)ns.lpst("lptl", lpsq(int ), (int)17);
                break;
            }
            case 16: {
                var22_21 /* !! */  = (int)ns.lpst("lptm", lpsq(int ), (int)18);
                ** GOTO lbl87
            }
            case 17: {
                var22_21 /* !! */  = (int)ns.lpst("lptn", lpsq(int ), (int)19);
                ** GOTO lbl59
            }
            case 18: {
                var22_21 /* !! */  = (int)ns.lpst("lpto", lpsq(int ), (int)20);
                ** GOTO lbl38
            }
lbl87:
            // 2 sources

            case 19: {
                var22_21 /* !! */  = (int)ns.lpst("lptp", lpsq(int ), (int)21);
                ** GOTO lbl56
            }
            case 20: {
                var22_21 /* !! */  = (int)ns.lpst("lptq", lpsq(int ), (int)22);
                ** GOTO lbl53
            }
lbl93:
            // 3 sources

            case 21: {
                var22_21 /* !! */  = (int)ns.lpst("lptr", lpsq(int ), (int)23);
                ** GOTO lbl41
            }
            case 22: {
                var22_21 /* !! */  = (int)ns.lpst("lpts", lpsq(int ), (int)24);
                ** GOTO lbl93
            }
lbl99:
            // 4 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_21 /* !! */  = (int)ns.lpst("lptt", lpsq(int ), (int)25);
                    ** GOTO lbl29
                    break;
                }
            }
            case 24: 
        }
        var22_21 /* !! */  = (int)ns.lpst("lptu", lpsq(int ), (int)26);
        ** while (true)
    }

    private static /* synthetic */ void ltra() {
        ns.lpss[1300] = 983377689;
        ns.lpss[1301] = 5509027;
        ns.lpss[1302] = 949620158;
        ns.lpss[1303] = -1863507228;
        ns.lpss[1304] = 835737978;
        ns.lpss[1305] = -781547834;
        ns.lpss[1306] = -1197001449;
        ns.lpss[1307] = 1587922193;
        ns.lpss[1308] = 308647506;
        ns.lpss[1309] = -239774616;
        ns.lpss[1310] = -1064758117;
        ns.lpss[1311] = -1723676416;
        ns.lpss[1312] = -1539045692;
        ns.lpss[1313] = 17168058;
        ns.lpss[1314] = 248914048;
        ns.lpss[1315] = -1913670352;
        ns.lpss[1316] = 825100617;
        ns.lpss[1317] = 1853551708;
        ns.lpss[1318] = 1073672173;
        ns.lpss[1319] = 634765049;
        ns.lpss[1320] = 882837837;
        ns.lpss[1321] = -640204625;
        ns.lpss[1322] = -2147155223;
        ns.lpss[1323] = -1915599412;
        ns.lpss[1324] = -1519623734;
        ns.lpss[1325] = 1516924726;
        ns.lpss[1326] = 1746305913;
        ns.lpss[1327] = -679192537;
        ns.lpss[1328] = -343203297;
        ns.lpss[1329] = 1053435376;
        ns.lpss[1330] = 1074636307;
        ns.lpss[1331] = -1070334202;
        ns.lpss[1332] = -1706309746;
        ns.lpss[1333] = 846360449;
        ns.lpss[1334] = 539837893;
        ns.lpss[1335] = 706174859;
        ns.lpss[1336] = 1696160364;
        ns.lpss[1337] = 802334561;
        ns.lpss[1338] = 2000890293;
        ns.lpss[1339] = 1639027747;
        ns.lpss[1340] = -472519804;
        ns.lpss[1341] = -1917403403;
        ns.lpss[1342] = -1478006523;
        ns.lpss[1343] = 1840286983;
        ns.lpss[1344] = 353455329;
        ns.lpss[1345] = 1287652390;
        ns.lpss[1346] = 1511072126;
        ns.lpss[1347] = -1033908434;
        ns.lpss[1348] = 743574250;
        ns.lpss[1349] = -188927287;
        ns.lpss[1350] = -385259925;
        ns.lpss[1351] = 368065121;
        ns.lpss[1352] = 736858050;
        ns.lpss[1353] = -791454156;
        ns.lpss[1354] = 1864477859;
        ns.lpss[1355] = 1306500841;
        ns.lpss[1356] = 612931825;
        ns.lpss[1357] = 240345107;
        ns.lpss[1358] = -1416203579;
        ns.lpss[1359] = 441940617;
        ns.lpss[1360] = 0x4334E343;
        ns.lpss[1361] = -1787371396;
        ns.lpss[1362] = -356668987;
        ns.lpss[1363] = 1434849454;
        ns.lpss[1364] = -570740496;
        ns.lpss[1365] = 1130187584;
        ns.lpss[1366] = 978678812;
        ns.lpss[1367] = 121362885;
        ns.lpss[1368] = -1431558548;
        ns.lpss[1369] = 2023802314;
        ns.lpss[1370] = 1428471238;
        ns.lpss[1371] = 1685695353;
        ns.lpss[1372] = 311304354;
        ns.lpss[1373] = 836278982;
        ns.lpss[1374] = -1663262609;
        ns.lpss[1375] = -1006858050;
        ns.lpss[1376] = -272999225;
        ns.lpss[1377] = -238338198;
        ns.lpss[1378] = 385595582;
        ns.lpss[1379] = -489372187;
        ns.lpss[1380] = 2087178294;
        ns.lpss[1381] = 1511631843;
        ns.lpss[1382] = 1146972426;
        ns.lpss[1383] = -1614189863;
        ns.lpss[1384] = 734102471;
        ns.lpss[1385] = 301106625;
        ns.lpss[1386] = 587389511;
        ns.lpss[1387] = 222103093;
        ns.lpss[1388] = 774683843;
        ns.lpss[1389] = -1699606344;
        ns.lpss[1390] = -1682786138;
        ns.lpss[1391] = 1257727914;
        ns.lpss[1392] = -853154991;
        ns.lpss[1393] = -134489572;
        ns.lpss[1394] = 943265589;
        ns.lpss[1395] = -664626779;
        ns.lpss[1396] = 1519968484;
        ns.lpss[1397] = -502158935;
        ns.lpss[1398] = -392703150;
        ns.lpss[1399] = -892341694;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ns simulateLocalPlayer(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lpty", lptv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lptz", lpsq(int ), (int)27)) break;
            v0 /* !! */  = (long)ns.lpst("lpua", lpsq(int ), (int)28);
        }
        var5_1 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lpub", lptv(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("lpuc", lpsq(int ), (int)29)) break;
            v1 /* !! */  = (long)ns.lpst("lpud", lpsq(int ), (int)30);
        }
        var4_2 /* !! */  = ns.b;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl17
        block45: while (true) {
            v2 /* !! */  = (long)(ns.lpst("lpuf", lptv(int ), (int)3) - ns.lpst("lpue", lptv(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 304457984: {
                    break block45;
                }
                case 1185838820: {
                    continue block45;
                }
            }
            break;
        }
        var3_3 = ns.a;
        if (var5_1) {
            throw null;
lbl25:
            // 8 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl25
        v3 /* !! */  = ns.uk;
        if (true) ** GOTO lbl32
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - ns.lpst("lpug", lptv(int ), (int)4));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 304457984: {
                    break block47;
                }
                case 332826190: {
                    v4 = ns.lpst("lpuh", lptv(int ), (int)5);
                    continue block47;
                }
                case 1117922537: {
                    v4 = ns.lpst("lpui", lptv(int ), (int)6);
                    continue block47;
                }
                case 1376165416: {
                    v4 = ns.lpst("lpuj", lptv(int ), (int)7);
                    continue block47;
                }
            }
            break;
        }
        v5 /* !! */  = ns.uk;
        if (true) ** GOTO lbl48
        block48: while (true) {
            v5 /* !! */  = (long)(ns.lpst("lpul", lptv(int ), (int)9) - ns.lpst("lpuk", lptv(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1471131830: {
                    continue block48;
                }
                case 304457984: {
                    break block48;
                }
            }
            break;
        }
        v6 = ns.mc.field_1724;
        v7 /* !! */  = ns.uk;
        if (true) ** GOTO lbl58
        block49: while (true) {
            v7 /* !! */  = (long)(ns.lpst("lpun", lptv(int ), (int)11) - ns.lpst("lpum", lptv(int ), (int)10));
lbl58:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1917323852: {
                    continue block49;
                }
                case 304457984: {
                    break block49;
                }
            }
            break;
        }
        v8 = v6.field_3913;
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lpuo", lptv(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ns.lpst("lpup", lpsq(int ), (int)31)) break;
            v9 /* !! */  = (long)ns.lpst("lpuq", lpsq(int ), (int)32);
        }
        v10 = v8.field_54155;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lpur", lptv(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ns.lpst("lpus", lpsq(int ), (int)33)) break;
            v11 /* !! */  = (long)ns.lpst("lput", lpsq(int ), (int)34);
        }
        v12 = ns$SimulatedPlayerInput.fromClientPlayer(v10);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lpuu", lptv(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ns.lpst("lpuv", lpsq(int ), (int)35)) break;
            v13 /* !! */  = (long)ns.lpst("lpuw", lpsq(int ), (int)36);
        }
        var1_4 = ns.fromClientPlayer(v12);
        if (var3_3 || var3_3) ** GOTO lbl25
        var2_5 = ns.lpst("lpux", lpsq(int ), (int)37);
        if (var3_3) ** GOTO lbl25
        block53: while (true) {
            if (var3_3 || var3_3) ** GOTO lbl25
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var2_5 >= var0) ** GOTO lbl114
                    if (var3_3 || var3_3) ** GOTO lbl25
                    v14 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl96
                    block54: while (true) {
                        v14 /* !! */  = (long)(v15 - ns.lpst("lpuy", lptv(int ), (int)15));
lbl96:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -945239895: {
                                v15 = ns.lpst("lpuz", lptv(int ), (int)16);
                                continue block54;
                            }
                            case -581622990: {
                                v15 = ns.lpst("lpva", lptv(int ), (int)17);
                                continue block54;
                            }
                            case 304457984: {
                                break block54;
                            }
                            case 1592366057: {
                                v15 = ns.lpst("lpvb", lptv(int ), (int)18);
                                continue block54;
                            }
                        }
                        break;
                    }
                    var1_4.tick();
                    if (var3_3 || var3_3) ** GOTO lbl25
                    ++var2_5;
                    if (var3_3) ** GOTO lbl25
                    if (!var5_1) continue block53;
                    throw null;
lbl114:
                    // 1 sources

                    if (!var3_3 && !var3_3) ** break;
                    ** continue;
                    return var1_4;
                }
lbl117:
                // 2 sources

                case 0: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvc", lpsq(int ), (int)38);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
                case 1: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvd", lpsq(int ), (int)39);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl127:
                // 2 sources

                case 2: {
                    var4_2 /* !! */  = (int)ns.lpst("lpve", lpsq(int ), (int)40);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl132:
                // 4 sources

                case 3: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvf", lpsq(int ), (int)41);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl137:
                // 2 sources

                case 4: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvg", lpsq(int ), (int)42);
                    if (!var5_1) ** GOTO lbl132
                    throw null;
                }
                case 5: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvh", lpsq(int ), (int)43);
                    if (!var5_1) ** GOTO lbl127
                    throw null;
                }
                case 6: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvi", lpsq(int ), (int)44);
                    if (!var5_1) ** GOTO lbl137
                    throw null;
                }
lbl149:
                // 4 sources

                case 7: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvj", lpsq(int ), (int)45);
                    if (!var5_1) ** GOTO lbl132
                    throw null;
                }
lbl153:
                // 2 sources

                case 8: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvk", lpsq(int ), (int)46);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
                case 9: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)ns.lpst("lpvl", lpsq(int ), (int)47);
                        if (var5_1) {
                            throw null;
                        }
                        ** GOTO lbl168
                        break;
                    }
                }
                case 10: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvm", lpsq(int ), (int)48);
                    if (!var5_1) ** GOTO lbl153
                    throw null;
                }
lbl168:
                // 3 sources

                case 11: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvn", lpsq(int ), (int)49);
                    if (!var5_1) ** GOTO lbl117
                    throw null;
                }
lbl172:
                // 2 sources

                case 12: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvo", lpsq(int ), (int)50);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
lbl177:
                // 3 sources

                case 13: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvp", lpsq(int ), (int)51);
                    if (!var5_1) ** GOTO lbl132
                    throw null;
                }
lbl181:
                // 2 sources

                case 14: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvq", lpsq(int ), (int)52);
                    if (!var5_1) ** GOTO lbl149
                    throw null;
                }
                case 15: {
                    var4_2 /* !! */  = (int)ns.lpst("lpvr", lpsq(int ), (int)53);
                    if (!var5_1) ** GOTO lbl168
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var4_2 /* !! */  = (int)ns.lpst("lpvs", lpsq(int ), (int)54);
        ** while (!var5_1)
lbl192:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public class_243 pos() {
        block35: {
            v0 /* !! */  = ns.uk;
            if (true) ** GOTO lbl5
            block24: while (true) {
                v0 /* !! */  = (long)(v1 - ns.lpst("lqeq", lptv(int ), (int)160));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -783167460: {
                        v1 = ns.lpst("lqer", lptv(int ), (int)161);
                        continue block24;
                    }
                    case 304457984: {
                        break block24;
                    }
                    case 1007141814: {
                        v1 = ns.lpst("lqes", lptv(int ), (int)162);
                        continue block24;
                    }
                    case 2113994320: {
                        v1 = ns.lpst("lqet", lptv(int ), (int)163);
                        continue block24;
                    }
                }
                break;
            }
            var3_1 = ns.c;
            while (true) {
                block36: {
                    if ((v2 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lqeu", lptv(int ), (int)164)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != ns.lpst("lqev", lpsq(int ), (int)145)) break block36;
                    var2_2 /* !! */  = ns.b;
                    v3 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl30
                }
                v2 /* !! */  = (long)ns.lpst("lqew", lpsq(int ), (int)146);
            }
            block26: while (true) {
                v3 /* !! */  = (long)(v4 - ns.lpst("lqex", lptv(int ), (int)165));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -958771346: {
                        v4 = ns.lpst("lqey", lptv(int ), (int)166);
                        continue block26;
                    }
                    case 194249223: {
                        v4 = ns.lpst("lqez", lptv(int ), (int)167);
                        continue block26;
                    }
                    case 304457984: {
                        break block26;
                    }
                    case 586122593: {
                        v4 = ns.lpst("lqfa", lptv(int ), (int)168);
                        continue block26;
                    }
                }
                break;
            }
            var1_3 = ns.a;
            if (var3_1) {
                throw null;
            }
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block27: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lqfb", lptv(int ), (int)169)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  != ns.lpst("lqfc", lpsq(int ), (int)147)) ** GOTO lbl58
                            v6 /* !! */  = ns.uk;
                            if (true) ** GOTO lbl71
lbl58:
                            // 1 sources

                            v5 /* !! */  = (long)ns.lpst("lqfd", lpsq(int ), (int)148);
                        }
                    }
                    case 0: {
                        ** GOTO lbl84
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)ns.lpst("lqfk", lpsq(int ), (int)151);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block27;
                        throw null;
                    }
                    case 3: {
                        break block35;
                    }
                    block29: while (true) {
                        v6 /* !! */  = (long)(v7 - ns.lpst("lqfe", lptv(int ), (int)170));
lbl71:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1757616256: {
                                v7 = ns.lpst("lqff", lptv(int ), (int)171);
                                continue block29;
                            }
                            case -1669222326: {
                                v7 = ns.lpst("lqfg", lptv(int ), (int)172);
                                continue block29;
                            }
                            case 304457984: {
                                return this.player.method_73189();
                            }
                            case 1046951526: {
                                v7 = ns.lpst("lqfh", lptv(int ), (int)173);
                                continue block29;
                            }
                        }
                        break;
                    }
                    return this.player.method_73189();
lbl84:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)ns.lpst("lqfi", lpsq(int ), (int)149);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block27;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)ns.lpst("lqfj", lpsq(int ), (int)150);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)ns.lpst("lqfl", lpsq(int ), (int)152);
        ** while (!var3_1)
lbl98:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static ns fromOtherPlayer(class_1657 var0, ns$SimulatedPlayerInput var1_1) {
        block139: {
            v0 /* !! */  = ns.uk;
            block100: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1532618119: {
                        v0 /* !! */  = (long)(ns.lpst("lqat", lptv(int ), (int)91) - ns.lpst("lqas", lptv(int ), (int)90));
                        continue block100;
                    }
                    case 304457984: {
                        break block100;
                    }
                }
                break;
            }
            var4_2 = ns.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lqau", lptv(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ns.lpst("lqav", lpsq(int ), (int)113)) break;
                v1 /* !! */  = (long)ns.lpst("lqaw", lpsq(int ), (int)114);
            }
            var3_3 /* !! */  = ns.b;
            v2 /* !! */  = ns.uk;
            block102: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -263369324: {
                        v2 /* !! */  = (long)(ns.lpst("lqay", lptv(int ), (int)94) - ns.lpst("lqax", lptv(int ), (int)93));
                        continue block102;
                    }
                    case 304457984: {
                        break block102;
                    }
                }
                break;
            }
            var2_4 = ns.a;
            if (var4_2) {
                throw null;
            }
            if (var2_4 != false) return null;
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block103: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 != false) return null;
                        v3 /* !! */  = ns.uk;
                        block104: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1412705607: {
                                    v4 = ns.lpst("lqba", lptv(int ), (int)96);
                                    ** GOTO lbl47
                                }
                                case 304457984: {
                                    break block104;
                                }
                                case 412929199: {
                                    v4 = ns.lpst("lqbb", lptv(int ), (int)97);
                                    ** GOTO lbl47
                                }
                                case 880643002: {
                                    v4 = ns.lpst("lqbc", lptv(int ), (int)98);
lbl47:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - ns.lpst("lqaz", lptv(int ), (int)95));
                                    continue block104;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lqbd", lptv(int ), (int)99)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != ns.lpst("lqbe", lpsq(int ), (int)115)) ** GOTO lbl55
                            v6 = var0.method_73189();
                            v7 /* !! */  = ns.uk;
                            if (true) ** GOTO lbl63
lbl55:
                            // 1 sources

                            v5 /* !! */  = (long)ns.lpst("lqbf", lpsq(int ), (int)116);
                        }
                    }
                    case 0: {
                        ** GOTO lbl338
                    }
                    case 3: {
                        break block139;
                    }
                    block106: while (true) {
                        v7 /* !! */  = (long)(v8 - ns.lpst("lqbg", lptv(int ), (int)100));
lbl63:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -191063741: {
                                v8 = ns.lpst("lqbh", lptv(int ), (int)101);
                                continue block106;
                            }
                            case 304457984: {
                                break block106;
                            }
                            case 2065298163: {
                                v8 = ns.lpst("lqbi", lptv(int ), (int)102);
                                continue block106;
                            }
                        }
                        break;
                    }
                    v9 = var0.method_73189();
                    v10 /* !! */  = ns.uk;
                    block107: while (true) {
                        switch ((int)v10 /* !! */ ) {
                            case -76890028: {
                                v10 /* !! */  = (long)(ns.lpst("lqbk", lptv(int ), (int)104) - ns.lpst("lqbj", lptv(int ), (int)103));
                                continue block107;
                            }
                            case 304457984: {
                                break block107;
                            }
                        }
                        break;
                    }
                    v11 /* !! */  = ns.uk;
                    block108: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case 304457984: {
                                break block108;
                            }
                            case 1203667159: {
                                v11 /* !! */  = (long)(ns.lpst("lqbm", lptv(int ), (int)106) - ns.lpst("lqbl", lptv(int ), (int)105));
                                continue block108;
                            }
                        }
                        break;
                    }
                    v12 = var0.field_6014;
                    v13 /* !! */  = ns.uk;
                    block109: while (true) {
                        switch ((int)v13 /* !! */ ) {
                            case 304457984: {
                                break block109;
                            }
                            case 376833352: {
                                v13 /* !! */  = (long)(ns.lpst("lqbo", lptv(int ), (int)108) - ns.lpst("lqbn", lptv(int ), (int)107));
                                continue block109;
                            }
                        }
                        break;
                    }
                    v14 = var0.field_6036;
                    v15 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl103
                    block110: while (true) {
                        v15 /* !! */  = (long)(v16 - ns.lpst("lqbp", lptv(int ), (int)109));
lbl103:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -357429251: {
                                v16 = ns.lpst("lqbq", lptv(int ), (int)110);
                                continue block110;
                            }
                            case -344633005: {
                                v16 = ns.lpst("lqbr", lptv(int ), (int)111);
                                continue block110;
                            }
                            case 304457984: {
                                break block110;
                            }
                            case 973920075: {
                                v16 = ns.lpst("lqbs", lptv(int ), (int)112);
                                continue block110;
                            }
                        }
                        break;
                    }
                    v17 = var0.field_5969;
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lqbt", lptv(int ), (int)113)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  != ns.lpst("lqbu", lpsq(int ), (int)117)) ** GOTO lbl122
                        v19 = new class_243(v12, v14, v17);
                        v20 /* !! */  = ns.uk;
                        if (true) ** GOTO lbl126
lbl122:
                        // 1 sources

                        v18 /* !! */  = (long)ns.lpst("lqbv", lpsq(int ), (int)118);
                    }
                    block112: while (true) {
                        v20 /* !! */  = (long)(v21 - ns.lpst("lqbw", lptv(int ), (int)114));
lbl126:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case -555170617: {
                                v21 = ns.lpst("lqbx", lptv(int ), (int)115);
                                continue block112;
                            }
                            case 304457984: {
                                break block112;
                            }
                            case 760972127: {
                                v21 = ns.lpst("lqby", lptv(int ), (int)116);
                                continue block112;
                            }
                            case 1680036794: {
                                v21 = ns.lpst("lqbz", lptv(int ), (int)117);
                                continue block112;
                            }
                        }
                        break;
                    }
                    v22 = v9.method_1020(v19);
                    v23 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl143
                    block113: while (true) {
                        v23 /* !! */  = (long)(v24 - ns.lpst("lqca", lptv(int ), (int)118));
lbl143:
                        // 2 sources

                        switch ((int)v23 /* !! */ ) {
                            case -1025837301: {
                                v24 = ns.lpst("lqcb", lptv(int ), (int)119);
                                continue block113;
                            }
                            case 22770046: {
                                v24 = ns.lpst("lqcc", lptv(int ), (int)120);
                                continue block113;
                            }
                            case 304457984: {
                                break block113;
                            }
                            case 629217661: {
                                v24 = ns.lpst("lqcd", lptv(int ), (int)121);
                                continue block113;
                            }
                        }
                        break;
                    }
                    v25 = var0.method_5829();
                    v26 /* !! */  = ns.uk;
                    block114: while (true) {
                        switch ((int)v26 /* !! */ ) {
                            case -415735936: {
                                v26 /* !! */  = (long)(ns.lpst("lqcf", lptv(int ), (int)123) - ns.lpst("lqce", lptv(int ), (int)122));
                                continue block114;
                            }
                            case 304457984: {
                                break block114;
                            }
                        }
                        break;
                    }
                    v27 = var0.method_36454();
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lqcg", lptv(int ), (int)124)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == ns.lpst("lqch", lpsq(int ), (int)119)) break;
                        v28 /* !! */  = (long)ns.lpst("lqci", lpsq(int ), (int)120);
                    }
                    v29 = var0.method_36455();
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lqcj", lptv(int ), (int)125)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == ns.lpst("lqck", lpsq(int ), (int)121)) break;
                        v30 /* !! */  = (long)ns.lpst("lqcl", lpsq(int ), (int)122);
                    }
                    v31 = var0.method_5624();
                    v32 /* !! */  = ns.uk;
                    block117: while (true) {
                        switch ((int)v32 /* !! */ ) {
                            case 304457984: {
                                break block117;
                            }
                            case 1176679024: {
                                v32 /* !! */  = (long)(ns.lpst("lqcn", lptv(int ), (int)127) - ns.lpst("lqcm", lptv(int ), (int)126));
                                continue block117;
                            }
                        }
                        break;
                    }
                    v33 = (float)var0.field_6017;
                    v34 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl190
                    block118: while (true) {
                        v34 /* !! */  = (long)(v35 - ns.lpst("lqco", lptv(int ), (int)128));
lbl190:
                        // 2 sources

                        switch ((int)v34 /* !! */ ) {
                            case -290435772: {
                                v35 = ns.lpst("lqcp", lptv(int ), (int)129);
                                continue block118;
                            }
                            case -24677075: {
                                v35 = ns.lpst("lqcq", lptv(int ), (int)130);
                                continue block118;
                            }
                            case 68109840: {
                                v35 = ns.lpst("lqcr", lptv(int ), (int)131);
                                continue block118;
                            }
                            case 304457984: {
                                break block118;
                            }
                        }
                        break;
                    }
                    v36 = var0.field_6228;
                    while (true) {
                        if ((v37 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lqcs", lptv(int ), (int)132)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v37 /* !! */  == ns.lpst("lqct", lpsq(int ), (int)123)) break;
                        v37 /* !! */  = (long)ns.lpst("lqcu", lpsq(int ), (int)124);
                    }
                    v38 = var0.field_6282;
                    while (true) {
                        if ((v39 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lqcv", lptv(int ), (int)133)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v39 /* !! */  != ns.lpst("lqcw", lpsq(int ), (int)125)) ** GOTO lbl215
                        v40 = var0.method_6128();
                        v41 /* !! */  = ns.uk;
                        if (true) ** GOTO lbl219
lbl215:
                        // 1 sources

                        v39 /* !! */  = (long)ns.lpst("lqcx", lpsq(int ), (int)126);
                    }
                    block121: while (true) {
                        v41 /* !! */  = (long)(v42 - ns.lpst("lqcy", lptv(int ), (int)134));
lbl219:
                        // 2 sources

                        switch ((int)v41 /* !! */ ) {
                            case -46762868: {
                                v42 = ns.lpst("lqcz", lptv(int ), (int)135);
                                continue block121;
                            }
                            case 304457984: {
                                break block121;
                            }
                            case 1699164592: {
                                v42 = ns.lpst("lqda", lptv(int ), (int)136);
                                continue block121;
                            }
                            case 1905716258: {
                                v42 = ns.lpst("lqdb", lptv(int ), (int)137);
                                continue block121;
                            }
                        }
                        break;
                    }
                    v43 = var0.method_24828();
                    while (true) {
                        if ((v44 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("lqdc", lptv(int ), (int)138)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v44 /* !! */  == ns.lpst("lqdd", lpsq(int ), (int)127)) break;
                        v44 /* !! */  = (long)ns.lpst("lqde", lpsq(int ), (int)128);
                    }
                    v45 = var0.field_5976;
                    while (true) {
                        if ((v46 /* !! */  = (cfr_temp_9 = ns.uk - ns.lpst("lqdf", lptv(int ), (int)139)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v46 /* !! */  == ns.lpst("lqdg", lpsq(int ), (int)129)) break;
                        v46 /* !! */  = (long)ns.lpst("lqdh", lpsq(int ), (int)130);
                    }
                    v47 = var0.field_5992;
                    v48 /* !! */  = ns.uk;
                    block124: while (true) {
                        switch ((int)v48 /* !! */ ) {
                            case -1794938863: {
                                v48 /* !! */  = (long)(ns.lpst("lqdj", lptv(int ), (int)141) - ns.lpst("lqdi", lptv(int ), (int)140));
                                continue block124;
                            }
                            case 304457984: {
                                break block124;
                            }
                        }
                        break;
                    }
                    v49 = var0.method_5799();
                    v50 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl257
                    block125: while (true) {
                        v50 /* !! */  = (long)(v51 - ns.lpst("lqdk", lptv(int ), (int)142));
lbl257:
                        // 2 sources

                        switch ((int)v50 /* !! */ ) {
                            case -1917876272: {
                                v51 = ns.lpst("lqdl", lptv(int ), (int)143);
                                continue block125;
                            }
                            case -1899248144: {
                                v51 = ns.lpst("lqdm", lptv(int ), (int)144);
                                continue block125;
                            }
                            case -1457355338: {
                                v51 = ns.lpst("lqdn", lptv(int ), (int)145);
                                continue block125;
                            }
                            case 304457984: {
                                break block125;
                            }
                        }
                        break;
                    }
                    v52 = var0.method_5681();
                    while (true) {
                        if ((v53 /* !! */  = (cfr_temp_10 = ns.uk - ns.lpst("lqdo", lptv(int ), (int)146)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v53 /* !! */  == ns.lpst("lqdp", lpsq(int ), (int)131)) break;
                        v53 /* !! */  = (long)ns.lpst("lqdq", lpsq(int ), (int)132);
                    }
                    v54 = var0.method_5869();
                    while (true) {
                        if ((v55 /* !! */  = (cfr_temp_11 = ns.uk - ns.lpst("lqdr", lptv(int ), (int)147)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v55 /* !! */  == ns.lpst("lqds", lpsq(int ), (int)133)) break;
                        v55 /* !! */  = (long)ns.lpst("lqdt", lpsq(int ), (int)134);
                    }
                    v56 /* !! */  = ns.uk;
                    block128: while (true) {
                        switch ((int)v56 /* !! */ ) {
                            case 304457984: {
                                break block128;
                            }
                            case 611355912: {
                                v56 /* !! */  = (long)(ns.lpst("lqdv", lptv(int ), (int)149) - ns.lpst("lqdu", lptv(int ), (int)148));
                                continue block128;
                            }
                        }
                        break;
                    }
                    v57 = var0.field_5964;
                    v58 /* !! */  = ns.uk;
                    if (true) ** GOTO lbl294
                    block129: while (true) {
                        v58 /* !! */  = (long)(v59 - ns.lpst("lqdw", lptv(int ), (int)150));
lbl294:
                        // 2 sources

                        switch ((int)v58 /* !! */ ) {
                            case -1898149542: {
                                v59 = ns.lpst("lqdx", lptv(int ), (int)151);
                                continue block129;
                            }
                            case 304457984: {
                                break block129;
                            }
                            case 1402522769: {
                                v59 = ns.lpst("lqdy", lptv(int ), (int)152);
                                continue block129;
                            }
                        }
                        break;
                    }
                    v60 = new Object2DoubleArrayMap(v57);
                    while (true) {
                        if ((v61 /* !! */  = (cfr_temp_12 = ns.uk - ns.lpst("lqdz", lptv(int ), (int)153)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v61 /* !! */  == ns.lpst("lqea", lpsq(int ), (int)135)) break;
                        v61 /* !! */  = (long)ns.lpst("lqeb", lpsq(int ), (int)136);
                    }
                    while (true) {
                        if ((v62 /* !! */  = (cfr_temp_13 = ns.uk - ns.lpst("lqec", lptv(int ), (int)154)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v62 /* !! */  != ns.lpst("lqed", lpsq(int ), (int)137)) ** GOTO lbl315
                        v63 = var0.field_25599;
                        v64 /* !! */  = ns.uk;
                        if (true) ** GOTO lbl319
lbl315:
                        // 1 sources

                        v62 /* !! */  = (long)ns.lpst("lqee", lpsq(int ), (int)138);
                    }
                    block132: while (true) {
                        v64 /* !! */  = (long)(v65 - ns.lpst("lqef", lptv(int ), (int)155));
lbl319:
                        // 2 sources

                        switch ((int)v64 /* !! */ ) {
                            case -1578230204: {
                                v65 = ns.lpst("lqeg", lptv(int ), (int)156);
                                continue block132;
                            }
                            case -265058825: {
                                v65 = ns.lpst("lqeh", lptv(int ), (int)157);
                                continue block132;
                            }
                            case 304457984: {
                                break block132;
                            }
                            case 994998925: {
                                v65 = ns.lpst("lqei", lptv(int ), (int)158);
                                continue block132;
                            }
                        }
                        break;
                    }
                    v66 = new HashSet<class_6862<class_3611>>(v63);
                    while (true) {
                        if ((v67 /* !! */  = (cfr_temp_14 = ns.uk - ns.lpst("lqej", lptv(int ), (int)159)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                        if (v67 /* !! */  == ns.lpst("lqek", lpsq(int ), (int)139)) {
                            return new ns(var0, var1_1, v6, v22, v25, v27, v29, v31, v33, v36, v38, v40, v43, v45, v47, v49, v52, v54, (Object2DoubleMap<class_6862<class_3611>>)v60, v66);
                        }
                        v67 /* !! */  = (long)ns.lpst("lqel", lpsq(int ), (int)140);
                    }
lbl338:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)ns.lpst("lqem", lpsq(int ), (int)141);
                        cfr_temp_0 = 2;
                        if (!var4_2) continue block103;
                        throw null;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ns.lpst("lqeo", lpsq(int ), (int)143);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)ns.lpst("lqen", lpsq(int ), (int)142);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)ns.lpst("lqep", lpsq(int ), (int)144);
        ** while (!var4_2)
lbl356:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private double getFluidHeight(class_6862<class_3611> class_68622) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = uk - ns.lpst("lsuy", lptv(int ), (int)687)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lsuz", lpsq(int ), (int)1392)) break;
            object = ns.lpst("lsva", lpsq(int ), (int)1393);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = uk - ns.lpst("lsvb", lptv(int ), (int)688)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lsvc", lpsq(int ), (int)1394)) break;
            object = ns.lpst("lsvd", lpsq(int ), (int)1395);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = uk - ns.lpst("lsve", lptv(int ), (int)689)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ns.lpst("lsvf", lpsq(int ), (int)1396)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ns.lpst("lsvg", lpsq(int ), (int)1397);
        }
        if (bl2) return (double)ns.lpst("lsvh", lqfo(int ), (int)690);
        if (bl2) return (double)ns.lpst("lsvh", lqfo(int ), (int)690);
        Object object = uk;
        block12: while (true) {
            switch ((int)object) {
                case -642016730: {
                    object = ns.lpst("lsvj", lptv(int ), (int)692) - ns.lpst("lsvi", lptv(int ), (int)691);
                    continue block12;
                }
                case 304457984: {
                    break block12;
                }
            }
            break;
        }
        Object object2 = uk;
        boolean bl4 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ns.lpst("lsvk", lptv(int ), (int)693);
            }
            switch ((int)object2) {
                case -303658551: {
                    callSite = ns.lpst("lsvl", lptv(int ), (int)694);
                    continue block13;
                }
                case 304457984: {
                    return this.fluidHeight.getDouble(class_68622);
                }
                case 1447766092: {
                    callSite = ns.lpst("lsvm", lptv(int ), (int)695);
                    continue block13;
                }
            }
            break;
        }
        return this.fluidHeight.getDouble(class_68622);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 getVelocityAffectingPos() {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - ns.lpst("lshm", lptv(int ), (int)540));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1411392539: {
                    v1 = ns.lpst("lshn", lptv(int ), (int)541);
                    continue block33;
                }
                case -850187783: {
                    v1 = ns.lpst("lsho", lptv(int ), (int)542);
                    continue block33;
                }
                case 304457984: {
                    break block33;
                }
            }
            break;
        }
        var3_1 = ns.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lshp", lptv(int ), (int)543)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns.lpst("lshq", lpsq(int ), (int)1189)) break;
            v2 /* !! */  = (long)ns.lpst("lshr", lpsq(int ), (int)1190);
        }
        var2_2 /* !! */  = ns.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lshs", lptv(int ), (int)544)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ns.lpst("lsht", lpsq(int ), (int)1191)) break;
            v3 /* !! */  = (long)ns.lpst("lshu", lpsq(int ), (int)1192);
        }
        var1_3 = ns.a;
        if (!var3_1) ** GOTO lbl33
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl33:
                // 1 sources

                if (var1_3 || var1_3) continue block36;
                v4 /* !! */  = ns.uk;
                if (true) ** GOTO lbl38
                block37: while (true) {
                    v4 /* !! */  = (long)(ns.lpst("lshw", lptv(int ), (int)546) - ns.lpst("lshv", lptv(int ), (int)545));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 113275188: {
                            continue block37;
                        }
                        case 304457984: {
                            break block37;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ns.uk;
                if (true) ** GOTO lbl47
                block38: while (true) {
                    v5 /* !! */  = (long)(v6 - ns.lpst("lshx", lptv(int ), (int)547));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1154196206: {
                            v6 = ns.lpst("lshy", lptv(int ), (int)548);
                            continue block38;
                        }
                        case 304457984: {
                            break block38;
                        }
                        case 899114382: {
                            v6 = ns.lpst("lshz", lptv(int ), (int)549);
                            continue block38;
                        }
                        case 1795987071: {
                            v6 = ns.lpst("lsia", lptv(int ), (int)550);
                            continue block38;
                        }
                    }
                    break;
                }
                v7 = this.pos.field_1352;
                v8 /* !! */  = ns.uk;
                if (true) ** GOTO lbl64
                block39: while (true) {
                    v8 /* !! */  = (long)(ns.lpst("lsic", lptv(int ), (int)552) - ns.lpst("lsib", lptv(int ), (int)551));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1567705086: {
                            continue block39;
                        }
                        case 304457984: {
                            break block39;
                        }
                    }
                    break;
                }
                v9 /* !! */  = ns.uk;
                if (true) ** GOTO lbl73
                block40: while (true) {
                    v9 /* !! */  = (long)(ns.lpst("lsie", lptv(int ), (int)554) - ns.lpst("lsid", lptv(int ), (int)553));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 304457984: {
                            break block40;
                        }
                        case 1857497285: {
                            continue block40;
                        }
                    }
                    break;
                }
                v10 = this.boundingBox.field_1322 - ns.lpst("lsif", lqfo(int ), (int)555);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsig", lptv(int ), (int)556)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ns.lpst("lsih", lpsq(int ), (int)1193)) break;
                    v11 /* !! */  = (long)ns.lpst("lsii", lpsq(int ), (int)1194);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lsij", lptv(int ), (int)557)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ns.lpst("lsik", lpsq(int ), (int)1195)) break;
                    v12 /* !! */  = (long)ns.lpst("lsil", lpsq(int ), (int)1196);
                }
                v13 = this.pos.field_1350;
                v14 /* !! */  = ns.uk;
                if (true) ** GOTO lbl94
                block43: while (true) {
                    v14 /* !! */  = (long)(ns.lpst("lsin", lptv(int ), (int)559) - ns.lpst("lsim", lptv(int ), (int)558));
lbl94:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1805187179: {
                            continue block43;
                        }
                        case 304457984: {
                            break block43;
                        }
                    }
                    break;
                }
                return class_2338.method_49637((double)v7, (double)v10, (double)v13);
lbl100:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)ns.lpst("lsio", lpsq(int ), (int)1197);
                    if (!var3_1) break block36;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)ns.lpst("lsip", lpsq(int ), (int)1198);
                    if (!var3_1) ** GOTO lbl100
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)ns.lpst("lsiq", lpsq(int ), (int)1199);
                    if (!var3_1) break block36;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)ns.lpst("lsir", lpsq(int ), (int)1200);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ltqr() {
        ns.lpss[400] = 1528862210;
        ns.lpss[401] = 1173309506;
        ns.lpss[402] = -321933810;
        ns.lpss[403] = 770115389;
        ns.lpss[404] = -2098113074;
        ns.lpss[405] = 671673304;
        ns.lpss[406] = -406768909;
        ns.lpss[407] = 1550993695;
        ns.lpss[408] = 1160225707;
        ns.lpss[409] = 2094030254;
        ns.lpss[410] = -1419314472;
        ns.lpss[411] = 1024140393;
        ns.lpss[412] = -520126884;
        ns.lpss[413] = -800584597;
        ns.lpss[414] = 402499682;
        ns.lpss[415] = 937618176;
        ns.lpss[416] = 333159100;
        ns.lpss[417] = -1802966101;
        ns.lpss[418] = 1008167896;
        ns.lpss[419] = 336672128;
        ns.lpss[420] = -1126824226;
        ns.lpss[421] = 1444561498;
        ns.lpss[422] = -1899080475;
        ns.lpss[423] = 1294388152;
        ns.lpss[424] = 739597172;
        ns.lpss[425] = 1304922693;
        ns.lpss[426] = -1557955427;
        ns.lpss[427] = 639770712;
        ns.lpss[428] = -34005132;
        ns.lpss[429] = -1489226514;
        ns.lpss[430] = 1989692349;
        ns.lpss[431] = -1803332632;
        ns.lpss[432] = 2117485048;
        ns.lpss[433] = 1607887263;
        ns.lpss[434] = 975135030;
        ns.lpss[435] = 933819132;
        ns.lpss[436] = -1121530267;
        ns.lpss[437] = 1050611905;
        ns.lpss[438] = 173464812;
        ns.lpss[439] = 226354086;
        ns.lpss[440] = 1075723983;
        ns.lpss[441] = 1449574509;
        ns.lpss[442] = -1026157894;
        ns.lpss[443] = -1189857749;
        ns.lpss[444] = -1496969060;
        ns.lpss[445] = -622043581;
        ns.lpss[446] = 2088036793;
        ns.lpss[447] = 827313400;
        ns.lpss[448] = -912490650;
        ns.lpss[449] = -85226886;
        ns.lpss[450] = 1746103234;
        ns.lpss[451] = -125890602;
        ns.lpss[452] = -488011226;
        ns.lpss[453] = 1748903992;
        ns.lpss[454] = 1791772976;
        ns.lpss[455] = 1894719068;
        ns.lpss[456] = -769874290;
        ns.lpss[457] = 1310562084;
        ns.lpss[458] = -35302166;
        ns.lpss[459] = 292304293;
        ns.lpss[460] = -1412970827;
        ns.lpss[461] = -1857719752;
        ns.lpss[462] = 2021473440;
        ns.lpss[463] = -1367982781;
        ns.lpss[464] = -1533897479;
        ns.lpss[465] = 1333979099;
        ns.lpss[466] = -1289354925;
        ns.lpss[467] = 2096934771;
        ns.lpss[468] = 902498848;
        ns.lpss[469] = -111608018;
        ns.lpss[470] = 1250948123;
        ns.lpss[471] = 284446865;
        ns.lpss[472] = -1125727808;
        ns.lpss[473] = -233611610;
        ns.lpss[474] = 241253156;
        ns.lpss[475] = 1212967374;
        ns.lpss[476] = 245018849;
        ns.lpss[477] = 371615706;
        ns.lpss[478] = 278012665;
        ns.lpss[479] = -1460634849;
        ns.lpss[480] = -1469766944;
        ns.lpss[481] = -1504396131;
        ns.lpss[482] = -2140749820;
        ns.lpss[483] = 1105107064;
        ns.lpss[484] = -1564467051;
        ns.lpss[485] = -50364081;
        ns.lpss[486] = -157113259;
        ns.lpss[487] = 455730746;
        ns.lpss[488] = -252664392;
        ns.lpss[489] = -746065808;
        ns.lpss[490] = 253472162;
        ns.lpss[491] = -498865943;
        ns.lpss[492] = 734611584;
        ns.lpss[493] = 1023284085;
        ns.lpss[494] = 1520250766;
        ns.lpss[495] = -295789535;
        ns.lpss[496] = 1358772108;
        ns.lpss[497] = 1925297374;
        ns.lpss[498] = -1688404434;
        ns.lpss[499] = 1331987658;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float getJumpVelocityMultiplier() {
        block82: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsbn", lptv(int ), (int)479)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ns.lpst("lsbo", lpsq(int ), (int)1095)) break;
                v0 /* !! */  = (long)ns.lpst("lsbp", lpsq(int ), (int)1096);
            }
            var7_1 = ns.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsbq", lptv(int ), (int)480)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ns.lpst("lsbr", lpsq(int ), (int)1097)) break;
                v1 /* !! */  = (long)ns.lpst("lsbs", lpsq(int ), (int)1098);
            }
            var6_2 /* !! */  = ns.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsbt", lptv(int ), (int)481)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ns.lpst("lsbu", lpsq(int ), (int)1099)) break;
                v2 /* !! */  = (long)ns.lpst("lsbv", lpsq(int ), (int)1100);
            }
            var5_3 = ns.a;
            if (var7_1) {
                throw null;
lbl21:
                // 13 sources

                return (float)ns.lpst("lsbw", lqfy(int ), (int)1101);
            }
            if (var5_3 || var5_3) ** GOTO lbl21
            var1_4 = 0.0f;
            if (var5_3 || var5_3) ** GOTO lbl21
            v3 /* !! */  = ns.uk;
            if (true) ** GOTO lbl30
            block50: while (true) {
                v3 /* !! */  = (long)(v4 - ns.lpst("lsbx", lptv(int ), (int)482));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -453837054: {
                        v4 = ns.lpst("lsby", lptv(int ), (int)483);
                        continue block50;
                    }
                    case 7148501: {
                        v4 = ns.lpst("lsbz", lptv(int ), (int)484);
                        continue block50;
                    }
                    case 304457984: {
                        break block50;
                    }
                    case 525234453: {
                        v4 = ns.lpst("lsca", lptv(int ), (int)485);
                        continue block50;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lscb", lptv(int ), (int)486)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ns.lpst("lscc", lpsq(int ), (int)1102)) break;
                v5 /* !! */  = (long)ns.lpst("lscd", lpsq(int ), (int)1103);
            }
            v6 = this.posToBlockPos(this.pos);
            v7 /* !! */  = ns.uk;
            if (true) ** GOTO lbl52
            block52: while (true) {
                v7 /* !! */  = (long)(v8 - ns.lpst("lsce", lptv(int ), (int)487));
lbl52:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1839225264: {
                        v8 = ns.lpst("lscf", lptv(int ), (int)488);
                        continue block52;
                    }
                    case -1193223652: {
                        v8 = ns.lpst("lscg", lptv(int ), (int)489);
                        continue block52;
                    }
                    case -1070821033: {
                        v8 = ns.lpst("lsch", lptv(int ), (int)490);
                        continue block52;
                    }
                    case 304457984: {
                        break block52;
                    }
                }
                break;
            }
            v9 = this.getState(v6);
            v10 /* !! */  = ns.uk;
            if (true) ** GOTO lbl69
            block53: while (true) {
                v10 /* !! */  = (long)(v11 - ns.lpst("lsci", lptv(int ), (int)491));
lbl69:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1272005605: {
                        v11 = ns.lpst("lscj", lptv(int ), (int)492);
                        continue block53;
                    }
                    case 304457984: {
                        break block53;
                    }
                    case 480690574: {
                        v11 = ns.lpst("lsck", lptv(int ), (int)493);
                        continue block53;
                    }
                    case 1036073434: {
                        v11 = ns.lpst("lscl", lptv(int ), (int)494);
                        continue block53;
                    }
                }
                break;
            }
            var2_5 = v9.method_26204();
            if (var5_3 || var5_3) ** GOTO lbl21
            if (var2_5 == null) break block82;
            if (var5_3 || var5_3) ** GOTO lbl21
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lscm", lptv(int ), (int)495)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ns.lpst("lscn", lpsq(int ), (int)1104)) break;
                v12 /* !! */  = (long)ns.lpst("lsco", lpsq(int ), (int)1105);
            }
            var1_4 = var2_5.method_23350();
            if (var5_3) ** GOTO lbl21
        }
        if (var5_3 || var5_3) ** GOTO lbl21
        var3_6 = 0.0f;
        if (var5_3 || var5_3) ** GOTO lbl21
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lscp", lptv(int ), (int)496)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ns.lpst("lscq", lpsq(int ), (int)1106)) break;
            v13 /* !! */  = (long)ns.lpst("lscr", lpsq(int ), (int)1107);
        }
        v14 = this.getVelocityAffectingPos();
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lscs", lptv(int ), (int)497)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == ns.lpst("lsct", lpsq(int ), (int)1108)) break;
            v15 /* !! */  = (long)ns.lpst("lscu", lpsq(int ), (int)1109);
        }
        v16 = this.getState(v14);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lscv", lptv(int ), (int)498)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == ns.lpst("lscw", lpsq(int ), (int)1110)) break;
            v17 /* !! */  = (long)ns.lpst("lscx", lpsq(int ), (int)1111);
        }
        var4_7 = v16.method_26204();
        if (var5_3 || var5_3) ** GOTO lbl21
        if (var4_7 == null) ** GOTO lbl-1000
        if (var5_3 || var5_3) ** GOTO lbl21
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("lscy", lptv(int ), (int)499)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ns.lpst("lscz", lpsq(int ), (int)1112)) break;
            v18 /* !! */  = (long)ns.lpst("lsda", lpsq(int ), (int)1113);
        }
        var3_6 = var4_7.method_23350();
        if (var5_3) ** GOTO lbl21
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var5_3 || var5_3) ** GOTO lbl21
                if (var1_4 != 1.0f) ** GOTO lbl134
                if (var5_3) ** GOTO lbl21
                v19 = var3_6;
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl137
lbl134:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                v19 = var1_4;
lbl137:
                // 2 sources

                return v19;
            }
            case 0: {
                var6_2 /* !! */  = (int)ns.lpst("lsdb", lpsq(int ), (int)1114);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl143:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)ns.lpst("lsdc", lpsq(int ), (int)1115);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl214
                    break;
                }
            }
            case 2: {
                var6_2 /* !! */  = (int)ns.lpst("lsdd", lpsq(int ), (int)1116);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl154:
            // 2 sources

            case 3: {
                var6_2 /* !! */  = (int)ns.lpst("lsde", lpsq(int ), (int)1117);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl159:
            // 2 sources

            case 4: {
                var6_2 /* !! */  = (int)ns.lpst("lsdf", lpsq(int ), (int)1118);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 5: {
                var6_2 /* !! */  = (int)ns.lpst("lsdg", lpsq(int ), (int)1119);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 6: {
                var6_2 /* !! */  = (int)ns.lpst("lsdh", lpsq(int ), (int)1120);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl174:
            // 3 sources

            case 7: {
                var6_2 /* !! */  = (int)ns.lpst("lsdi", lpsq(int ), (int)1121);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl179:
            // 3 sources

            case 8: {
                var6_2 /* !! */  = (int)ns.lpst("lsdj", lpsq(int ), (int)1122);
                if (!var7_1) ** GOTO lbl174
                throw null;
            }
            case 9: {
                var6_2 /* !! */  = (int)ns.lpst("lsdk", lpsq(int ), (int)1123);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 10: {
                var6_2 /* !! */  = (int)ns.lpst("lsdl", lpsq(int ), (int)1124);
                if (!var7_1) ** GOTO lbl154
                throw null;
            }
            case 11: {
                var6_2 /* !! */  = (int)ns.lpst("lsdm", lpsq(int ), (int)1125);
                if (!var7_1) ** GOTO lbl159
                throw null;
            }
            case 12: {
                var6_2 /* !! */  = (int)ns.lpst("lsdn", lpsq(int ), (int)1126);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl201:
            // 2 sources

            case 13: {
                var6_2 /* !! */  = (int)ns.lpst("lsdo", lpsq(int ), (int)1127);
                if (!var7_1) ** GOTO lbl179
                throw null;
            }
lbl205:
            // 7 sources

            case 14: {
                var6_2 /* !! */  = (int)ns.lpst("lsdp", lpsq(int ), (int)1128);
                if (!var7_1) ** GOTO lbl179
                throw null;
            }
lbl209:
            // 2 sources

            case 15: {
                var6_2 /* !! */  = (int)ns.lpst("lsdq", lpsq(int ), (int)1129);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl214:
            // 4 sources

            case 16: {
                var6_2 /* !! */  = (int)ns.lpst("lsdr", lpsq(int ), (int)1130);
                if (!var7_1) ** GOTO lbl143
                throw null;
            }
lbl218:
            // 2 sources

            case 17: {
                var6_2 /* !! */  = (int)ns.lpst("lsds", lpsq(int ), (int)1131);
                if (!var7_1) ** GOTO lbl205
                throw null;
            }
            case 18: {
                var6_2 /* !! */  = (int)ns.lpst("lsdt", lpsq(int ), (int)1132);
                if (!var7_1) ** GOTO lbl209
                throw null;
            }
            case 19: {
                var6_2 /* !! */  = (int)ns.lpst("lsdu", lpsq(int ), (int)1133);
                if (!var7_1) break;
                throw null;
            }
            case 20: {
                var6_2 /* !! */  = (int)ns.lpst("lsdv", lpsq(int ), (int)1134);
                if (!var7_1) ** GOTO lbl205
                throw null;
            }
lbl234:
            // 2 sources

            case 21: {
                var6_2 /* !! */  = (int)ns.lpst("lsdw", lpsq(int ), (int)1135);
                if (!var7_1) ** GOTO lbl205
                throw null;
            }
            case 22: {
                var6_2 /* !! */  = (int)ns.lpst("lsdx", lpsq(int ), (int)1136);
                if (!var7_1) ** GOTO lbl143
                throw null;
            }
lbl242:
            // 3 sources

            case 23: {
                var6_2 /* !! */  = (int)ns.lpst("lsdy", lpsq(int ), (int)1137);
                if (!var7_1) ** GOTO lbl201
                throw null;
            }
lbl246:
            // 2 sources

            case 24: {
                var6_2 /* !! */  = (int)ns.lpst("lsdz", lpsq(int ), (int)1138);
                if (!var7_1) ** GOTO lbl214
                throw null;
            }
            case 25: 
        }
        var6_2 /* !! */  = (int)ns.lpst("lsea", lpsq(int ), (int)1139);
        ** while (!var7_1)
lbl253:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 applyClimbingSpeed(class_243 var1_1) {
        block113: {
            v0 /* !! */  = ns.uk;
            if (true) ** GOTO lbl5
            block72: while (true) {
                v0 /* !! */  = (long)(v1 - ns.lpst("lrjt", lptv(int ), (int)299));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1206303372: {
                        v1 = ns.lpst("lrju", lptv(int ), (int)300);
                        continue block72;
                    }
                    case -506650700: {
                        v1 = ns.lpst("lrjv", lptv(int ), (int)301);
                        continue block72;
                    }
                    case 304457984: {
                        break block72;
                    }
                }
                break;
            }
            var10_2 = ns.c;
            v2 /* !! */  = ns.uk;
            if (true) ** GOTO lbl19
            block73: while (true) {
                v2 /* !! */  = (long)(ns.lpst("lrjx", lptv(int ), (int)303) - ns.lpst("lrjw", lptv(int ), (int)302));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 304457984: {
                        break block73;
                    }
                    case 360389002: {
                        continue block73;
                    }
                }
                break;
            }
            var9_3 /* !! */  = ns.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrjy", lptv(int ), (int)304)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ns.lpst("lrjz", lpsq(int ), (int)813)) break;
                v3 /* !! */  = (long)ns.lpst("lrka", lpsq(int ), (int)814);
            }
            var8_4 = ns.a;
            if (var10_2) {
                throw null;
lbl33:
                // 12 sources

                return null;
            }
            if (var8_4 || var8_4) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrkb", lptv(int ), (int)305)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ns.lpst("lrkc", lpsq(int ), (int)815)) break;
                v4 /* !! */  = (long)ns.lpst("lrkd", lpsq(int ), (int)816);
            }
            if (this.isClimbing()) break block113;
            if (var8_4 || var8_4) ** GOTO lbl33
            return var1_1;
        }
        if (var8_4 || var8_4) ** GOTO lbl33
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lrke", lptv(int ), (int)306)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ns.lpst("lrkf", lpsq(int ), (int)817)) break;
            v5 /* !! */  = (long)ns.lpst("lrkg", lpsq(int ), (int)818);
        }
        this.onLanding();
        if (var8_4 || var8_4) ** GOTO lbl33
        v6 /* !! */  = ns.uk;
        if (true) ** GOTO lbl57
        block78: while (true) {
            v6 /* !! */  = (long)(v7 - ns.lpst("lrkh", lptv(int ), (int)307));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -923068560: {
                    v7 = ns.lpst("lrki", lptv(int ), (int)308);
                    continue block78;
                }
                case 304457984: {
                    break block78;
                }
                case 1736023006: {
                    v7 = ns.lpst("lrkj", lptv(int ), (int)309);
                    continue block78;
                }
            }
            break;
        }
        v8 = var1_1.field_1352;
        v9 = ns.lpst("lrkk", lqfo(int ), (int)310);
        v10 = ns.lpst("lrkl", lqfo(int ), (int)311);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lrkm", lptv(int ), (int)312)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ns.lpst("lrkn", lpsq(int ), (int)819)) break;
            v11 /* !! */  = (long)ns.lpst("lrko", lpsq(int ), (int)820);
        }
        var2_5 = class_3532.method_15350((double)v8, (double)v9, (double)v10);
        if (var8_4 || var8_4) ** GOTO lbl33
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lrkp", lptv(int ), (int)313)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ns.lpst("lrkq", lpsq(int ), (int)821)) break;
            v12 /* !! */  = (long)ns.lpst("lrkr", lpsq(int ), (int)822);
        }
        v13 = var1_1.field_1350;
        v14 = ns.lpst("lrks", lqfo(int ), (int)314);
        v15 = ns.lpst("lrkt", lqfo(int ), (int)315);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lrku", lptv(int ), (int)316)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ns.lpst("lrkv", lpsq(int ), (int)823)) break;
            v16 /* !! */  = (long)ns.lpst("lrkw", lpsq(int ), (int)824);
        }
        var4_6 = class_3532.method_15350((double)v13, (double)v14, (double)v15);
        if (var8_4 || var8_4) ** GOTO lbl33
        v17 /* !! */  = ns.uk;
        if (true) ** GOTO lbl95
        block82: while (true) {
            v17 /* !! */  = (long)(v18 - ns.lpst("lrkx", lptv(int ), (int)317));
lbl95:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1817705495: {
                    v18 = ns.lpst("lrky", lptv(int ), (int)318);
                    continue block82;
                }
                case -590423705: {
                    v18 = ns.lpst("lrkz", lptv(int ), (int)319);
                    continue block82;
                }
                case 304457984: {
                    break block82;
                }
                case 421617756: {
                    v18 = ns.lpst("lrla", lptv(int ), (int)320);
                    continue block82;
                }
            }
            break;
        }
        v19 = var1_1.field_1351;
        v20 = ns.lpst("lrlb", lqfo(int ), (int)321);
        v21 /* !! */  = ns.uk;
        if (true) ** GOTO lbl113
        block83: while (true) {
            v21 /* !! */  = (long)(v22 - ns.lpst("lrlc", lptv(int ), (int)322));
lbl113:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1438762123: {
                    v22 = ns.lpst("lrld", lptv(int ), (int)323);
                    continue block83;
                }
                case -295430865: {
                    v22 = ns.lpst("lrle", lptv(int ), (int)324);
                    continue block83;
                }
                case 304457984: {
                    break block83;
                }
            }
            break;
        }
        var6_7 = Math.max(v19, (double)v20);
        if (var8_4 || var8_4) ** GOTO lbl33
        if (!(var6_7 < 0.0)) ** GOTO lbl195
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_4) ** GOTO lbl33
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lrlf", lptv(int ), (int)325)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ns.lpst("lrlg", lpsq(int ), (int)825)) break;
                    v23 /* !! */  = (long)ns.lpst("lrlh", lpsq(int ), (int)826);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lrli", lptv(int ), (int)326)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ns.lpst("lrlj", lpsq(int ), (int)827)) break;
                    v24 /* !! */  = (long)ns.lpst("lrlk", lpsq(int ), (int)828);
                }
                v25 = this.posToBlockPos(this.pos);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("lrll", lptv(int ), (int)327)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ns.lpst("lrlm", lpsq(int ), (int)829)) break;
                    v26 /* !! */  = (long)ns.lpst("lrln", lpsq(int ), (int)830);
                }
                v27 = this.getState(v25);
                v28 /* !! */  = ns.uk;
                if (true) ** GOTO lbl150
                block87: while (true) {
                    v28 /* !! */  = (long)(ns.lpst("lrlp", lptv(int ), (int)329) - ns.lpst("lrlo", lptv(int ), (int)328));
lbl150:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 304457984: {
                            break block87;
                        }
                        case 1741893450: {
                            continue block87;
                        }
                    }
                    break;
                }
                v29 /* !! */  = ns.uk;
                if (true) ** GOTO lbl159
                block88: while (true) {
                    v29 /* !! */  = (long)(v30 - ns.lpst("lrlq", lptv(int ), (int)330));
lbl159:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1602921123: {
                            v30 = ns.lpst("lrlr", lptv(int ), (int)331);
                            continue block88;
                        }
                        case -995730385: {
                            v30 = ns.lpst("lrls", lptv(int ), (int)332);
                            continue block88;
                        }
                        case 304457984: {
                            break block88;
                        }
                        case 342716677: {
                            v30 = ns.lpst("lrlt", lptv(int ), (int)333);
                            continue block88;
                        }
                    }
                    break;
                }
                if (v27.method_27852(class_2246.field_16492)) ** GOTO lbl195
                if (var8_4) ** GOTO lbl33
                v31 /* !! */  = ns.uk;
                if (true) ** GOTO lbl177
                block89: while (true) {
                    v31 /* !! */  = (long)(v32 - ns.lpst("lrlu", lptv(int ), (int)334));
lbl177:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -2028375217: {
                            v32 = ns.lpst("lrlv", lptv(int ), (int)335);
                            continue block89;
                        }
                        case -1120440277: {
                            v32 = ns.lpst("lrlw", lptv(int ), (int)336);
                            continue block89;
                        }
                        case 304457984: {
                            break block89;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = ns.uk - ns.lpst("lrlx", lptv(int ), (int)337)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ns.lpst("lrly", lpsq(int ), (int)831)) break;
                    v33 /* !! */  = (long)ns.lpst("lrlz", lpsq(int ), (int)832);
                }
                if (!this.player.method_21754()) ** GOTO lbl195
                if (var8_4 || var8_4) ** GOTO lbl33
                var6_7 = 0.0;
                if (var8_4) ** GOTO lbl33
lbl195:
                // 4 sources

                if (!var8_4 && !var8_4) ** break;
                ** continue;
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_10 = ns.uk - ns.lpst("lrma", lptv(int ), (int)338)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == ns.lpst("lrmb", lpsq(int ), (int)833)) break;
                    v34 /* !! */  = (long)ns.lpst("lrmc", lpsq(int ), (int)834);
                }
                v35 /* !! */  = ns.uk;
                if (true) ** GOTO lbl206
                block92: while (true) {
                    v35 /* !! */  = (long)(v36 - ns.lpst("lrmd", lptv(int ), (int)339));
lbl206:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1288821844: {
                            v36 = ns.lpst("lrme", lptv(int ), (int)340);
                            continue block92;
                        }
                        case 304457984: {
                            break block92;
                        }
                        case 1030767089: {
                            v36 = ns.lpst("lrmf", lptv(int ), (int)341);
                            continue block92;
                        }
                        case 2020975592: {
                            v36 = ns.lpst("lrmg", lptv(int ), (int)342);
                            continue block92;
                        }
                    }
                    break;
                }
                return new class_243(var2_5, var6_7, var4_6);
            }
            case 0: {
                var9_3 /* !! */  = (int)ns.lpst("lrmh", lpsq(int ), (int)835);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl224:
            // 4 sources

            case 1: {
                var9_3 /* !! */  = (int)ns.lpst("lrmi", lpsq(int ), (int)836);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl229:
            // 3 sources

            case 2: {
                var9_3 /* !! */  = (int)ns.lpst("lrmj", lpsq(int ), (int)837);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 3: {
                var9_3 /* !! */  = (int)ns.lpst("lrmk", lpsq(int ), (int)838);
                if (!var10_2) ** GOTO lbl229
                throw null;
            }
            case 4: {
                var9_3 /* !! */  = (int)ns.lpst("lrml", lpsq(int ), (int)839);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 5: {
                var9_3 /* !! */  = (int)ns.lpst("lrmm", lpsq(int ), (int)840);
                if (!var10_2) ** GOTO lbl224
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_3 /* !! */  = (int)ns.lpst("lrmn", lpsq(int ), (int)841);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl311
                    break;
                }
            }
lbl253:
            // 2 sources

            case 7: {
                var9_3 /* !! */  = (int)ns.lpst("lrmo", lpsq(int ), (int)842);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl258:
            // 3 sources

            case 8: {
                var9_3 /* !! */  = (int)ns.lpst("lrmp", lpsq(int ), (int)843);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 9: {
                var9_3 /* !! */  = (int)ns.lpst("lrmq", lpsq(int ), (int)844);
                if (!var10_2) ** GOTO lbl224
                throw null;
            }
lbl267:
            // 3 sources

            case 10: {
                do {
                    var9_3 /* !! */  = (int)ns.lpst("lrmr", lpsq(int ), (int)845);
                } while (!var10_2);
                throw null;
            }
            case 11: {
                do {
                    var9_3 /* !! */  = (int)ns.lpst("lrms", lpsq(int ), (int)846);
                } while (!var10_2);
                throw null;
            }
lbl277:
            // 3 sources

            case 12: {
                do {
                    var9_3 /* !! */  = (int)ns.lpst("lrmt", lpsq(int ), (int)847);
                } while (!var10_2);
                throw null;
            }
lbl282:
            // 2 sources

            case 13: {
                var9_3 /* !! */  = (int)ns.lpst("lrmu", lpsq(int ), (int)848);
                if (!var10_2) ** GOTO lbl267
                throw null;
            }
lbl286:
            // 2 sources

            case 14: {
                var9_3 /* !! */  = (int)ns.lpst("lrmv", lpsq(int ), (int)849);
                if (!var10_2) ** GOTO lbl267
                throw null;
            }
lbl290:
            // 2 sources

            case 15: {
                var9_3 /* !! */  = (int)ns.lpst("lrmw", lpsq(int ), (int)850);
                if (!var10_2) ** GOTO lbl282
                throw null;
            }
            case 16: {
                var9_3 /* !! */  = (int)ns.lpst("lrmx", lpsq(int ), (int)851);
                if (!var10_2) ** GOTO lbl229
                throw null;
            }
            case 17: {
                var9_3 /* !! */  = (int)ns.lpst("lrmy", lpsq(int ), (int)852);
                if (!var10_2) ** GOTO lbl258
                throw null;
            }
            case 18: {
                var9_3 /* !! */  = (int)ns.lpst("lrmz", lpsq(int ), (int)853);
                if (!var10_2) ** GOTO lbl224
                throw null;
            }
lbl306:
            // 2 sources

            case 19: {
                var9_3 /* !! */  = (int)ns.lpst("lrna", lpsq(int ), (int)854);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl311:
            // 2 sources

            case 20: {
                var9_3 /* !! */  = (int)ns.lpst("lrnb", lpsq(int ), (int)855);
                if (!var10_2) ** GOTO lbl306
                throw null;
            }
            case 21: {
                var9_3 /* !! */  = (int)ns.lpst("lrnc", lpsq(int ), (int)856);
                if (!var10_2) ** GOTO lbl277
                throw null;
            }
lbl319:
            // 4 sources

            case 22: {
                var9_3 /* !! */  = (int)ns.lpst("lrnd", lpsq(int ), (int)857);
                if (!var10_2) ** GOTO lbl258
                throw null;
            }
            case 23: 
        }
        var9_3 /* !! */  = (int)ns.lpst("lrne", lpsq(int ), (int)858);
        ** while (!var10_2)
lbl326:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltrs() {
        ns.lptx[300] = 6583534642603298748L;
        ns.lptx[301] = -7659974319477974609L;
        ns.lptx[302] = 2649284869329080576L;
        ns.lptx[303] = 1652304687848893970L;
        ns.lptx[304] = -8339254591811629060L;
        ns.lptx[305] = -1530921779255304314L;
        ns.lptx[306] = 8253949668274305634L;
        ns.lptx[307] = -7904307206520771134L;
        ns.lptx[308] = -7008620693838462704L;
        ns.lptx[309] = 123574309359921167L;
        ns.lptx[310] = -6299893348767528761L;
        ns.lptx[311] = -4445439813808164887L;
        ns.lptx[312] = -160709011980011761L;
        ns.lptx[313] = -12131340286278617L;
        ns.lptx[314] = 3840708391204147690L;
        ns.lptx[315] = -6726754835188498268L;
        ns.lptx[316] = 8628196247001973552L;
        ns.lptx[317] = 8453844386153932148L;
        ns.lptx[318] = -6877615682612598235L;
        ns.lptx[319] = -108507578211397449L;
        ns.lptx[320] = 8382204277513553330L;
        ns.lptx[321] = 1119936947961897379L;
        ns.lptx[322] = 8864510551919004963L;
        ns.lptx[323] = 6810632979526578674L;
        ns.lptx[324] = -6064662308624741526L;
        ns.lptx[325] = -7814652188873837808L;
        ns.lptx[326] = 5398330815555325695L;
        ns.lptx[327] = -2246207019373186182L;
        ns.lptx[328] = -8214494421694960803L;
        ns.lptx[329] = -3759782302287640390L;
        ns.lptx[330] = -228864503917024701L;
        ns.lptx[331] = -2047400907027643643L;
        ns.lptx[332] = -6872868830128329104L;
        ns.lptx[333] = -1236080455822769552L;
        ns.lptx[334] = 6230774632768281841L;
        ns.lptx[335] = 8951750678797253829L;
        ns.lptx[336] = 4640270789243878401L;
        ns.lptx[337] = -8547068842290687414L;
        ns.lptx[338] = 9066581237016450302L;
        ns.lptx[339] = -8836172037793595358L;
        ns.lptx[340] = -5643783770444966455L;
        ns.lptx[341] = 2155841136530760698L;
        ns.lptx[342] = -226709823607556431L;
        ns.lptx[343] = 203046049754827114L;
        ns.lptx[344] = -2728916510741006536L;
        ns.lptx[345] = 495760626978093818L;
        ns.lptx[346] = 5736654882275302752L;
        ns.lptx[347] = 6561214083744486346L;
        ns.lptx[348] = 3851030548767471620L;
        ns.lptx[349] = 6847301931161601304L;
        ns.lptx[350] = -3873349363720752981L;
        ns.lptx[351] = -2397378795080450612L;
        ns.lptx[352] = 1271984372251886494L;
        ns.lptx[353] = -6195955969658282810L;
        ns.lptx[354] = 2725869483330328821L;
        ns.lptx[355] = 9104514026903277298L;
        ns.lptx[356] = 7948387190022991105L;
        ns.lptx[357] = 6066433004412497714L;
        ns.lptx[358] = -2849381061470319730L;
        ns.lptx[359] = -8438061782444394970L;
        ns.lptx[360] = 524476130815141025L;
        ns.lptx[361] = 7079443685652113627L;
        ns.lptx[362] = 1035306419192770384L;
        ns.lptx[363] = 9015652734822173960L;
        ns.lptx[364] = 548158980275721759L;
        ns.lptx[365] = 4912437669897299578L;
        ns.lptx[366] = -8117646173681428531L;
        ns.lptx[367] = -3401896817504167136L;
        ns.lptx[368] = -2363281173807014671L;
        ns.lptx[369] = 1412045554038974658L;
        ns.lptx[370] = 8225067519542399985L;
        ns.lptx[371] = 8188264447416525164L;
        ns.lptx[372] = -4517023982837188168L;
        ns.lptx[373] = -2500247410216630148L;
        ns.lptx[374] = -1010144988393421741L;
        ns.lptx[375] = -5775182740496260212L;
        ns.lptx[376] = 7196412321345412210L;
        ns.lptx[377] = -6891463258888050831L;
        ns.lptx[378] = 3350839194258931778L;
        ns.lptx[379] = 6932837042544138430L;
        ns.lptx[380] = 7963119621178607375L;
        ns.lptx[381] = 4242269124427317845L;
        ns.lptx[382] = 8814365339751287801L;
        ns.lptx[383] = 4275076145141072193L;
        ns.lptx[384] = 6857223163768360936L;
        ns.lptx[385] = -5748742068434470461L;
        ns.lptx[386] = 1303948940723702186L;
        ns.lptx[387] = 3365203316396868553L;
        ns.lptx[388] = -7140375492450677785L;
        ns.lptx[389] = -7967620228131915390L;
        ns.lptx[390] = -5672189221938036384L;
        ns.lptx[391] = -3493835289039044493L;
        ns.lptx[392] = -9124343015073959164L;
        ns.lptx[393] = 5201621774556289396L;
        ns.lptx[394] = 180113108935991583L;
        ns.lptx[395] = -7790207038557659365L;
        ns.lptx[396] = 6239518332945994735L;
        ns.lptx[397] = -186778343517857166L;
        ns.lptx[398] = 4678415461425226102L;
        ns.lptx[399] = 4498501690815491817L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 applyMovementInput(class_243 var1_1, float var2_2) {
        block55: {
            var8_3 = ns.c;
            var7_4 /* !! */  = ns.b;
            var6_5 = ns.a;
            if (var8_3) {
                throw null;
lbl6:
                // 17 sources

                return null;
            }
            if (var6_5 || var6_5) ** GOTO lbl6
            this.updateVelocity(this.getMovementSpeed(var2_2), var1_1);
            if (var6_5 || var6_5) ** GOTO lbl6
            this.velocity = this.applyClimbingSpeed(this.velocity);
            if (var6_5 || var6_5) ** GOTO lbl6
            this.move(this.velocity);
            if (var6_5 || var6_5) ** GOTO lbl6
            var3_6 = this.velocity;
            if (var6_5 || var6_5) ** GOTO lbl6
            var4_7 = this.posToBlockPos(this.pos);
            if (var6_5 || var6_5) ** GOTO lbl6
            var5_8 = this.getState(var4_7);
            if (var6_5 || var6_5) ** GOTO lbl6
            if (this.horizontalCollision) break block55;
            if (var6_5) ** GOTO lbl6
            if (!this.isJumping) ** GOTO lbl41
            if (var6_5) ** GOTO lbl6
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        if (this.isClimbing()) ** GOTO lbl38
        if (var6_5) ** GOTO lbl6
        if (var5_8 == null) ** GOTO lbl41
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5) ** GOTO lbl6
                if (!var5_8.method_27852(class_2246.field_27879)) ** GOTO lbl41
                if (var6_5) ** GOTO lbl6
                if (!class_5635.method_32355((class_1297)this.player)) ** GOTO lbl41
                if (var6_5) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var6_5 || var6_5) ** GOTO lbl6
                var3_6 = new class_243(var3_6.field_1352, (double)ns.lpst("lqvr", lqfo(int ), (int)212), var3_6.field_1350);
                if (var6_5) ** GOTO lbl6
lbl41:
                // 5 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return var3_6;
            }
lbl44:
            // 3 sources

            case 0: {
                var7_4 /* !! */  = (int)ns.lpst("lqvs", lpsq(int ), (int)534);
                if (!var8_3) break;
                throw null;
            }
lbl48:
            // 4 sources

            case 1: {
                var7_4 /* !! */  = (int)ns.lpst("lqvt", lpsq(int ), (int)535);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 2: {
                var7_4 /* !! */  = (int)ns.lpst("lqvu", lpsq(int ), (int)536);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 3: {
                var7_4 /* !! */  = (int)ns.lpst("lqvv", lpsq(int ), (int)537);
                if (!var8_3) break;
                throw null;
            }
            case 4: {
                var7_4 /* !! */  = (int)ns.lpst("lqvw", lpsq(int ), (int)538);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl67:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)ns.lpst("lqvx", lpsq(int ), (int)539);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 6: {
                var7_4 /* !! */  = (int)ns.lpst("lqvy", lpsq(int ), (int)540);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl77:
            // 2 sources

            case 7: {
                var7_4 /* !! */  = (int)ns.lpst("lqvz", lpsq(int ), (int)541);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl82:
            // 3 sources

            case 8: {
                var7_4 /* !! */  = (int)ns.lpst("lqwa", lpsq(int ), (int)542);
                if (!var8_3) break;
                throw null;
            }
lbl86:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)ns.lpst("lqwb", lpsq(int ), (int)543);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl91:
            // 2 sources

            case 10: {
                var7_4 /* !! */  = (int)ns.lpst("lqwc", lpsq(int ), (int)544);
                if (!var8_3) ** GOTO lbl48
                throw null;
            }
lbl95:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)ns.lpst("lqwd", lpsq(int ), (int)545);
                    if (!var8_3) ** GOTO lbl48
                    throw null;
                }
            }
lbl100:
            // 3 sources

            case 12: {
                var7_4 /* !! */  = (int)ns.lpst("lqwe", lpsq(int ), (int)546);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 13: {
                var7_4 /* !! */  = (int)ns.lpst("lqwf", lpsq(int ), (int)547);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl110:
            // 2 sources

            case 14: {
                var7_4 /* !! */  = (int)ns.lpst("lqwg", lpsq(int ), (int)548);
                if (!var8_3) ** GOTO lbl86
                throw null;
            }
lbl114:
            // 2 sources

            case 15: {
                var7_4 /* !! */  = (int)ns.lpst("lqwh", lpsq(int ), (int)549);
                if (!var8_3) ** GOTO lbl67
                throw null;
            }
            case 16: {
                var7_4 /* !! */  = (int)ns.lpst("lqwi", lpsq(int ), (int)550);
                if (!var8_3) ** GOTO lbl95
                throw null;
            }
lbl122:
            // 2 sources

            case 17: {
                var7_4 /* !! */  = (int)ns.lpst("lqwj", lpsq(int ), (int)551);
                if (!var8_3) ** GOTO lbl100
                throw null;
            }
lbl126:
            // 2 sources

            case 18: {
                var7_4 /* !! */  = (int)ns.lpst("lqwk", lpsq(int ), (int)552);
                if (!var8_3) ** GOTO lbl44
                throw null;
            }
lbl130:
            // 4 sources

            case 19: {
                var7_4 /* !! */  = (int)ns.lpst("lqwl", lpsq(int ), (int)553);
                if (!var8_3) ** GOTO lbl44
                throw null;
            }
lbl134:
            // 2 sources

            case 20: {
                var7_4 /* !! */  = (int)ns.lpst("lqwm", lpsq(int ), (int)554);
                if (!var8_3) ** GOTO lbl130
                throw null;
            }
lbl138:
            // 2 sources

            case 21: {
                var7_4 /* !! */  = (int)ns.lpst("lqwn", lpsq(int ), (int)555);
                if (!var8_3) ** GOTO lbl82
                throw null;
            }
            case 22: {
                var7_4 /* !! */  = (int)ns.lpst("lqwo", lpsq(int ), (int)556);
                if (!var8_3) ** GOTO lbl126
                throw null;
            }
lbl146:
            // 2 sources

            case 23: {
                var7_4 /* !! */  = (int)ns.lpst("lqwp", lpsq(int ), (int)557);
                if (!var8_3) ** GOTO lbl110
                throw null;
            }
lbl150:
            // 2 sources

            case 24: {
                var7_4 /* !! */  = (int)ns.lpst("lqwq", lpsq(int ), (int)558);
                if (!var8_3) ** GOTO lbl82
                throw null;
            }
            case 25: {
                var7_4 /* !! */  = (int)ns.lpst("lqwr", lpsq(int ), (int)559);
                if (!var8_3) ** GOTO lbl114
                throw null;
            }
            case 26: {
                var7_4 /* !! */  = (int)ns.lpst("lqws", lpsq(int ), (int)560);
                if (!var8_3) ** GOTO lbl77
                throw null;
            }
            case 27: {
                var7_4 /* !! */  = (int)ns.lpst("lqwt", lpsq(int ), (int)561);
                if (!var8_3) ** GOTO lbl48
                throw null;
            }
            case 28: 
        }
        var7_4 /* !! */  = (int)ns.lpst("lqwu", lpsq(int ), (int)562);
        ** while (!var8_3)
lbl169:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqi() {
        ns.lpsr[1300] = 983377689;
        ns.lpsr[1301] = 5509026;
        ns.lpsr[1302] = -2126355915;
        ns.lpsr[1303] = -1863507227;
        ns.lpsr[1304] = 655998519;
        ns.lpsr[1305] = -781547833;
        ns.lpsr[1306] = -330546847;
        ns.lpsr[1307] = -1587922194;
        ns.lpsr[1308] = -46758641;
        ns.lpsr[1309] = -239774615;
        ns.lpsr[1310] = -124219267;
        ns.lpsr[1311] = 1723676415;
        ns.lpsr[1312] = -661097516;
        ns.lpsr[1313] = 17168059;
        ns.lpsr[1314] = -736942140;
        ns.lpsr[1315] = -1913670351;
        ns.lpsr[1316] = -1192355500;
        ns.lpsr[1317] = 1853551709;
        ns.lpsr[1318] = 1073672173;
        ns.lpsr[1319] = 634765053;
        ns.lpsr[1320] = 882837830;
        ns.lpsr[1321] = -640204631;
        ns.lpsr[1322] = -2147155218;
        ns.lpsr[1323] = -1915599417;
        ns.lpsr[1324] = -1519623741;
        ns.lpsr[1325] = 1516924720;
        ns.lpsr[1326] = 1746305905;
        ns.lpsr[1327] = -679192539;
        ns.lpsr[1328] = -343203302;
        ns.lpsr[1329] = 1053435383;
        ns.lpsr[1330] = 1074636311;
        ns.lpsr[1331] = -1070334207;
        ns.lpsr[1332] = -1706309713;
        ns.lpsr[1333] = 846360458;
        ns.lpsr[1334] = 539837913;
        ns.lpsr[1335] = 706174870;
        ns.lpsr[1336] = 1696160353;
        ns.lpsr[1337] = 802334581;
        ns.lpsr[1338] = 2000890260;
        ns.lpsr[1339] = 1639027715;
        ns.lpsr[1340] = -472519785;
        ns.lpsr[1341] = -1917403413;
        ns.lpsr[1342] = -1478006515;
        ns.lpsr[1343] = 1840286979;
        ns.lpsr[1344] = 353455331;
        ns.lpsr[1345] = 1287652384;
        ns.lpsr[1346] = 1511072120;
        ns.lpsr[1347] = -1033908427;
        ns.lpsr[1348] = 743574258;
        ns.lpsr[1349] = -188927270;
        ns.lpsr[1350] = -385259921;
        ns.lpsr[1351] = 368065088;
        ns.lpsr[1352] = 736858058;
        ns.lpsr[1353] = -791454163;
        ns.lpsr[1354] = 1864477881;
        ns.lpsr[1355] = 1306500854;
        ns.lpsr[1356] = 612931810;
        ns.lpsr[1357] = 240345113;
        ns.lpsr[1358] = -1416203575;
        ns.lpsr[1359] = 441940617;
        ns.lpsr[1360] = 0x4334E344;
        ns.lpsr[1361] = -1787371421;
        ns.lpsr[1362] = -356668963;
        ns.lpsr[1363] = 1434849442;
        ns.lpsr[1364] = -570740527;
        ns.lpsr[1365] = 1130187594;
        ns.lpsr[1366] = 978678813;
        ns.lpsr[1367] = -1127671782;
        ns.lpsr[1368] = 1431558547;
        ns.lpsr[1369] = 1346650687;
        ns.lpsr[1370] = -1428471239;
        ns.lpsr[1371] = 812345192;
        ns.lpsr[1372] = 311304354;
        ns.lpsr[1373] = 836278982;
        ns.lpsr[1374] = -1663262610;
        ns.lpsr[1375] = -1006858050;
        ns.lpsr[1376] = -272999226;
        ns.lpsr[1377] = -73513644;
        ns.lpsr[1378] = 385595583;
        ns.lpsr[1379] = 489372186;
        ns.lpsr[1380] = -1367477302;
        ns.lpsr[1381] = 1511631842;
        ns.lpsr[1382] = 1146972426;
        ns.lpsr[1383] = -1614189862;
        ns.lpsr[1384] = 734102468;
        ns.lpsr[1385] = 301106624;
        ns.lpsr[1386] = 587389511;
        ns.lpsr[1387] = 222103094;
        ns.lpsr[1388] = 774683843;
        ns.lpsr[1389] = -1699606352;
        ns.lpsr[1390] = -1682786140;
        ns.lpsr[1391] = 1257727917;
        ns.lpsr[1392] = -853154992;
        ns.lpsr[1393] = -831489295;
        ns.lpsr[1394] = 943265588;
        ns.lpsr[1395] = -1862274302;
        ns.lpsr[1396] = 1519968485;
        ns.lpsr[1397] = 240977374;
        ns.lpsr[1398] = -392703152;
        ns.lpsr[1399] = -892341693;
    }

    private static /* synthetic */ void ltqv() {
        ns.lpss[800] = 1141041266;
        ns.lpss[801] = 367089327;
        ns.lpss[802] = -787020765;
        ns.lpss[803] = 565331392;
        ns.lpss[804] = -181927209;
        ns.lpss[805] = 1163847689;
        ns.lpss[806] = -2087482831;
        ns.lpss[807] = -526921777;
        ns.lpss[808] = -17702591;
        ns.lpss[809] = 168029276;
        ns.lpss[810] = -1025030407;
        ns.lpss[811] = -896799204;
        ns.lpss[812] = -1484990720;
        ns.lpss[813] = -1763798597;
        ns.lpss[814] = 580178597;
        ns.lpss[815] = -927209680;
        ns.lpss[816] = -53368897;
        ns.lpss[817] = -703967495;
        ns.lpss[818] = 425125920;
        ns.lpss[819] = 2011507266;
        ns.lpss[820] = 303400812;
        ns.lpss[821] = -95572256;
        ns.lpss[822] = 1486782389;
        ns.lpss[823] = -360048137;
        ns.lpss[824] = 297584866;
        ns.lpss[825] = 688244659;
        ns.lpss[826] = 664058389;
        ns.lpss[827] = 2108421335;
        ns.lpss[828] = 2146625235;
        ns.lpss[829] = 684226211;
        ns.lpss[830] = 1877224758;
        ns.lpss[831] = 600810066;
        ns.lpss[832] = 627060655;
        ns.lpss[833] = -1843446377;
        ns.lpss[834] = 296721596;
        ns.lpss[835] = -477842557;
        ns.lpss[836] = 1981893076;
        ns.lpss[837] = -796343005;
        ns.lpss[838] = 1084412467;
        ns.lpss[839] = 1781589793;
        ns.lpss[840] = 576181321;
        ns.lpss[841] = 830700666;
        ns.lpss[842] = 143709652;
        ns.lpss[843] = -1091655842;
        ns.lpss[844] = 899030978;
        ns.lpss[845] = 83201063;
        ns.lpss[846] = -1652013053;
        ns.lpss[847] = -953533468;
        ns.lpss[848] = 288827197;
        ns.lpss[849] = -1039892401;
        ns.lpss[850] = -2002680707;
        ns.lpss[851] = -2013328338;
        ns.lpss[852] = -182226607;
        ns.lpss[853] = -983556502;
        ns.lpss[854] = -2003887373;
        ns.lpss[855] = -1699789986;
        ns.lpss[856] = -211662481;
        ns.lpss[857] = 1111154486;
        ns.lpss[858] = 1844114409;
        ns.lpss[859] = -637824018;
        ns.lpss[860] = -1338613792;
        ns.lpss[861] = 742894267;
        ns.lpss[862] = -1364626249;
        ns.lpss[863] = -418855317;
        ns.lpss[864] = 2060475725;
        ns.lpss[865] = 2039853725;
        ns.lpss[866] = -1715765397;
        ns.lpss[867] = 1455184964;
        ns.lpss[868] = 27348206;
        ns.lpss[869] = 668522162;
        ns.lpss[870] = 2122417892;
        ns.lpss[871] = -851048343;
        ns.lpss[872] = 483542131;
        ns.lpss[873] = -410211983;
        ns.lpss[874] = -202916551;
        ns.lpss[875] = -610485264;
        ns.lpss[876] = 71839641;
        ns.lpss[877] = 1948390802;
        ns.lpss[878] = 1962324253;
        ns.lpss[879] = -305027440;
        ns.lpss[880] = 1974798268;
        ns.lpss[881] = -1852357639;
        ns.lpss[882] = -146227386;
        ns.lpss[883] = -1154413675;
        ns.lpss[884] = -1161841262;
        ns.lpss[885] = 1229963928;
        ns.lpss[886] = -344243760;
        ns.lpss[887] = -2101574987;
        ns.lpss[888] = 738753243;
        ns.lpss[889] = -1717862241;
        ns.lpss[890] = 279985908;
        ns.lpss[891] = 1484554814;
        ns.lpss[892] = 592685452;
        ns.lpss[893] = 629504035;
        ns.lpss[894] = -1580582157;
        ns.lpss[895] = 1835661118;
        ns.lpss[896] = -1270869730;
        ns.lpss[897] = -1529648278;
        ns.lpss[898] = -1807405251;
        ns.lpss[899] = 1330705533;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float getAirStrafingSpeed() {
        block50: {
            v0 /* !! */  = ns.uk;
            if (true) ** GOTO lbl5
            block29: while (true) {
                v0 /* !! */  = (long)(ns.lpst("lqzb", lptv(int ), (int)239) - ns.lpst("lqza", lptv(int ), (int)238));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -99455016: {
                        continue block29;
                    }
                    case 304457984: {
                        break block29;
                    }
                }
                break;
            }
            var4_1 = ns.c;
            v1 /* !! */  = ns.uk;
            if (true) ** GOTO lbl15
            block30: while (true) {
                v1 /* !! */  = (long)(v2 - ns.lpst("lqzc", lptv(int ), (int)240));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1359210390: {
                        v2 = ns.lpst("lqzd", lptv(int ), (int)241);
                        continue block30;
                    }
                    case 304457984: {
                        break block30;
                    }
                    case 510757837: {
                        v2 = ns.lpst("lqze", lptv(int ), (int)242);
                        continue block30;
                    }
                    case 1006276030: {
                        v2 = ns.lpst("lqzf", lptv(int ), (int)243);
                        continue block30;
                    }
                }
                break;
            }
            var3_2 /* !! */  = ns.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lqzg", lptv(int ), (int)244)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ns.lpst("lqzh", lpsq(int ), (int)595)) break;
                v3 /* !! */  = (long)ns.lpst("lqzi", lpsq(int ), (int)596);
            }
            var2_3 = ns.a;
            if (var4_1) {
                throw null;
lbl37:
                // 5 sources

                return (float)ns.lpst("lqzj", lqfy(int ), (int)597);
            }
            if (var2_3 || var2_3) ** GOTO lbl37
            var1_4 = ns.lpst("lqzk", lqfy(int ), (int)598);
            if (var2_3 || var2_3) ** GOTO lbl37
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lqzl", lptv(int ), (int)245)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ns.lpst("lqzm", lpsq(int ), (int)599)) break;
                v4 /* !! */  = (long)ns.lpst("lqzn", lpsq(int ), (int)600);
            }
            v5 /* !! */  = ns.uk;
            if (true) ** GOTO lbl52
            block34: while (true) {
                v5 /* !! */  = (long)(v6 - ns.lpst("lqzo", lptv(int ), (int)246));
lbl52:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -404566433: {
                        v6 = ns.lpst("lqzp", lptv(int ), (int)247);
                        continue block34;
                    }
                    case 304457984: {
                        break block34;
                    }
                    case 842276233: {
                        v6 = ns.lpst("lqzq", lptv(int ), (int)248);
                        continue block34;
                    }
                    case 1854720363: {
                        v6 = ns.lpst("lqzr", lptv(int ), (int)249);
                        continue block34;
                    }
                }
                break;
            }
            v7 = this.input.playerInput;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lqzs", lptv(int ), (int)250)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == ns.lpst("lqzt", lpsq(int ), (int)601)) break;
                v8 /* !! */  = (long)ns.lpst("lqzu", lpsq(int ), (int)602);
            }
            if (!v7.comp_3165()) break block50;
            if (var2_3 || var2_3) ** GOTO lbl37
            return (float)(var1_4 + ns.lpst("lqzv", lqfy(int ), (int)603));
        }
        if (var2_3) ** GOTO lbl37
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return (float)var1_4;
            }
lbl82:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)ns.lpst("lqzw", lpsq(int ), (int)604);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl87:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)ns.lpst("lqzx", lpsq(int ), (int)605);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 2: {
                do {
                    var3_2 /* !! */  = (int)ns.lpst("lqzy", lpsq(int ), (int)606);
                } while (!var4_1);
                throw null;
            }
lbl97:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ns.lpst("lqzz", lpsq(int ), (int)607);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl108
                    break;
                }
            }
            case 4: {
                do {
                    var3_2 /* !! */  = (int)ns.lpst("lraa", lpsq(int ), (int)608);
                } while (!var4_1);
                throw null;
            }
lbl108:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)ns.lpst("lrab", lpsq(int ), (int)609);
                if (!var4_1) ** GOTO lbl82
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)ns.lpst("lrac", lpsq(int ), (int)610);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
            case 7: {
                do {
                    var3_2 /* !! */  = (int)ns.lpst("lrad", lpsq(int ), (int)611);
                } while (!var4_1);
                throw null;
            }
lbl121:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)ns.lpst("lrae", lpsq(int ), (int)612);
                if (!var4_1) ** GOTO lbl87
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)ns.lpst("lraf", lpsq(int ), (int)613);
                if (!var4_1) ** GOTO lbl82
                throw null;
            }
            case 10: 
        }
        var3_2 /* !! */  = (int)ns.lpst("lrag", lpsq(int ), (int)614);
        ** while (!var4_1)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltpz() {
        ns.lpsr[400] = 1528862348;
        ns.lpsr[401] = 1173309537;
        ns.lpsr[402] = -321933749;
        ns.lpsr[403] = 770115567;
        ns.lpsr[404] = -2098113094;
        ns.lpsr[405] = 671673187;
        ns.lpsr[406] = -406769052;
        ns.lpsr[407] = 1550993728;
        ns.lpsr[408] = 1160225745;
        ns.lpsr[409] = 2094030228;
        ns.lpsr[410] = -1419314465;
        ns.lpsr[411] = 1024140422;
        ns.lpsr[412] = -520126968;
        ns.lpsr[413] = -800584541;
        ns.lpsr[414] = 402499768;
        ns.lpsr[415] = 937618269;
        ns.lpsr[416] = 333159061;
        ns.lpsr[417] = -1802966057;
        ns.lpsr[418] = 1008167796;
        ns.lpsr[419] = 336672219;
        ns.lpsr[420] = -1126824391;
        ns.lpsr[421] = 1444561613;
        ns.lpsr[422] = -1899080697;
        ns.lpsr[423] = 1294388015;
        ns.lpsr[424] = 739597267;
        ns.lpsr[425] = 1304922825;
        ns.lpsr[426] = -1557955542;
        ns.lpsr[427] = 639770848;
        ns.lpsr[428] = -34005184;
        ns.lpsr[429] = -1489226693;
        ns.lpsr[430] = 1989692377;
        ns.lpsr[431] = -1803332802;
        ns.lpsr[432] = 2117485029;
        ns.lpsr[433] = 1607887123;
        ns.lpsr[434] = 975135195;
        ns.lpsr[435] = 933818941;
        ns.lpsr[436] = -1121530149;
        ns.lpsr[437] = 1050611751;
        ns.lpsr[438] = 173464630;
        ns.lpsr[439] = 226353963;
        ns.lpsr[440] = 1075723878;
        ns.lpsr[441] = 1449574639;
        ns.lpsr[442] = -1026157946;
        ns.lpsr[443] = -1189857612;
        ns.lpsr[444] = -1496969188;
        ns.lpsr[445] = -622043640;
        ns.lpsr[446] = 2088036846;
        ns.lpsr[447] = 827313336;
        ns.lpsr[448] = -912490579;
        ns.lpsr[449] = -85226845;
        ns.lpsr[450] = 1746103068;
        ns.lpsr[451] = -125890590;
        ns.lpsr[452] = -488011096;
        ns.lpsr[453] = 1748904096;
        ns.lpsr[454] = 1791773044;
        ns.lpsr[455] = 1894719121;
        ns.lpsr[456] = -769874247;
        ns.lpsr[457] = 1310562112;
        ns.lpsr[458] = -35302162;
        ns.lpsr[459] = 292304212;
        ns.lpsr[460] = -1412970814;
        ns.lpsr[461] = -1857719742;
        ns.lpsr[462] = 2021473295;
        ns.lpsr[463] = -1367982747;
        ns.lpsr[464] = -1533897600;
        ns.lpsr[465] = 1333978931;
        ns.lpsr[466] = -1289354813;
        ns.lpsr[467] = 2096934679;
        ns.lpsr[468] = 902498846;
        ns.lpsr[469] = -111607868;
        ns.lpsr[470] = 1250948222;
        ns.lpsr[471] = 284446744;
        ns.lpsr[472] = -1125727968;
        ns.lpsr[473] = -233611757;
        ns.lpsr[474] = 241253265;
        ns.lpsr[475] = 1212967280;
        ns.lpsr[476] = 245018626;
        ns.lpsr[477] = 371615715;
        ns.lpsr[478] = 278012603;
        ns.lpsr[479] = -1460634795;
        ns.lpsr[480] = -1469767039;
        ns.lpsr[481] = -1504396156;
        ns.lpsr[482] = -2140749607;
        ns.lpsr[483] = 1105107198;
        ns.lpsr[484] = -1564467026;
        ns.lpsr[485] = -50364106;
        ns.lpsr[486] = -157113312;
        ns.lpsr[487] = 455730866;
        ns.lpsr[488] = -252664390;
        ns.lpsr[489] = -746065747;
        ns.lpsr[490] = 253472077;
        ns.lpsr[491] = -498866122;
        ns.lpsr[492] = 734611701;
        ns.lpsr[493] = 1023283992;
        ns.lpsr[494] = 1520250716;
        ns.lpsr[495] = -295789524;
        ns.lpsr[496] = 1358772162;
        ns.lpsr[497] = 1925297268;
        ns.lpsr[498] = -1688404353;
        ns.lpsr[499] = 1331987679;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ns simulateOtherPlayer(class_1657 var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lpvt", lptv(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lpvu", lpsq(int ), (int)55)) break;
            v0 /* !! */  = (long)ns.lpst("lpvv", lpsq(int ), (int)56);
        }
        var6_2 = ns.c;
        v1 /* !! */  = ns.uk;
        if (true) ** GOTO lbl11
        block32: while (true) {
            v1 /* !! */  = (long)(v2 - ns.lpst("lpvw", lptv(int ), (int)20));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1072077105: {
                    v2 = ns.lpst("lpvx", lptv(int ), (int)21);
                    continue block32;
                }
                case -285921587: {
                    v2 = ns.lpst("lpvy", lptv(int ), (int)22);
                    continue block32;
                }
                case -279896108: {
                    v2 = ns.lpst("lpvz", lptv(int ), (int)23);
                    continue block32;
                }
                case 304457984: {
                    break block32;
                }
            }
            break;
        }
        var5_3 /* !! */  = ns.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lpwa", lptv(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ns.lpst("lpwb", lpsq(int ), (int)57)) break;
            v3 /* !! */  = (long)ns.lpst("lpwc", lpsq(int ), (int)58);
        }
        var4_4 = ns.a;
        if (var6_2) {
            throw null;
lbl32:
            // 9 sources

            return null;
        }
        if (var4_4 || var4_4) ** GOTO lbl32
        v4 /* !! */  = ns.uk;
        if (true) ** GOTO lbl39
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - ns.lpst("lpwd", lptv(int ), (int)25));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1107254662: {
                    v5 = ns.lpst("lpwe", lptv(int ), (int)26);
                    continue block35;
                }
                case -517263058: {
                    v5 = ns.lpst("lpwf", lptv(int ), (int)27);
                    continue block35;
                }
                case 304457984: {
                    break block35;
                }
                case 1170748940: {
                    v5 = ns.lpst("lpwg", lptv(int ), (int)28);
                    continue block35;
                }
            }
            break;
        }
        v6 = ns$SimulatedPlayerInput.guessInput(var0);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lpwh", lptv(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ns.lpst("lpwi", lpsq(int ), (int)59)) break;
            v7 /* !! */  = (long)ns.lpst("lpwj", lpsq(int ), (int)60);
        }
        var2_5 = ns.fromOtherPlayer(var0, v6);
        if (var4_4 || var4_4) ** GOTO lbl32
        var3_6 = ns.lpst("lpwk", lpsq(int ), (int)61);
        if (var4_4) ** GOTO lbl32
        block37: while (true) {
            if (var4_4) ** GOTO lbl32
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4) ** GOTO lbl32
                    if (var3_6 >= var1_1) ** GOTO lbl80
                    if (var4_4 || var4_4) ** GOTO lbl32
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lpwl", lptv(int ), (int)30)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == ns.lpst("lpwm", lpsq(int ), (int)62)) break;
                        v8 /* !! */  = (long)ns.lpst("lpwn", lpsq(int ), (int)63);
                    }
                    var2_5.tick();
                    if (var4_4 || var4_4) ** GOTO lbl32
                    ++var3_6;
                    if (var4_4) ** GOTO lbl32
                    if (!var6_2) continue block37;
                    throw null;
lbl80:
                    // 1 sources

                    if (!var4_4 && !var4_4) ** break;
                    ** continue;
                    return var2_5;
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)ns.lpst("lpwo", lpsq(int ), (int)64);
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl109
                        break;
                    }
                }
                case 1: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwp", lpsq(int ), (int)65);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
                case 2: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwq", lpsq(int ), (int)66);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl127
                }
                case 3: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwr", lpsq(int ), (int)67);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl104:
                // 3 sources

                case 4: {
                    var5_3 /* !! */  = (int)ns.lpst("lpws", lpsq(int ), (int)68);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl127
                }
lbl109:
                // 3 sources

                case 5: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwt", lpsq(int ), (int)69);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl114:
                // 3 sources

                case 6: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwu", lpsq(int ), (int)70);
                    if (!var6_2) ** GOTO lbl104
                    throw null;
                }
                case 7: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwv", lpsq(int ), (int)71);
                    if (!var6_2) ** GOTO lbl114
                    throw null;
                }
                case 8: {
                    var5_3 /* !! */  = (int)ns.lpst("lpww", lpsq(int ), (int)72);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
lbl127:
                // 3 sources

                case 9: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwx", lpsq(int ), (int)73);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl132:
                // 2 sources

                case 10: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwy", lpsq(int ), (int)74);
                    if (!var6_2) ** GOTO lbl114
                    throw null;
                }
lbl136:
                // 2 sources

                case 11: {
                    var5_3 /* !! */  = (int)ns.lpst("lpwz", lpsq(int ), (int)75);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
lbl141:
                // 3 sources

                case 12: {
                    var5_3 /* !! */  = (int)ns.lpst("lpxa", lpsq(int ), (int)76);
                    if (!var6_2) ** GOTO lbl109
                    throw null;
                }
                case 13: {
                    var5_3 /* !! */  = (int)ns.lpst("lpxb", lpsq(int ), (int)77);
                    if (!var6_2) ** GOTO lbl104
                    throw null;
                }
lbl149:
                // 3 sources

                case 14: {
                    var5_3 /* !! */  = (int)ns.lpst("lpxc", lpsq(int ), (int)78);
                    if (!var6_2) ** GOTO lbl132
                    throw null;
                }
lbl153:
                // 3 sources

                case 15: {
                    var5_3 /* !! */  = (int)ns.lpst("lpxd", lpsq(int ), (int)79);
                    if (!var6_2) ** GOTO lbl149
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var5_3 /* !! */  = (int)ns.lpst("lpxe", lpsq(int ), (int)80);
        ** while (!var6_2)
lbl160:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long lptv(int n2) {
        return lptw[n2] ^ lptx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean method_30263() {
        block58: {
            v0 /* !! */  = ns.uk;
            if (true) ** GOTO lbl5
            block32: while (true) {
                v0 /* !! */  = (long)(ns.lpst("lrwr", lptv(int ), (int)423) - ns.lpst("lrwq", lptv(int ), (int)422));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2079531664: {
                        continue block32;
                    }
                    case 304457984: {
                        break block32;
                    }
                }
                break;
            }
            var3_1 = ns.c;
            v1 /* !! */  = ns.uk;
            if (true) ** GOTO lbl15
            block33: while (true) {
                v1 /* !! */  = (long)(v2 - ns.lpst("lrws", lptv(int ), (int)424));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -853072436: {
                        v2 = ns.lpst("lrwt", lptv(int ), (int)425);
                        continue block33;
                    }
                    case -87339177: {
                        v2 = ns.lpst("lrwu", lptv(int ), (int)426);
                        continue block33;
                    }
                    case 304457984: {
                        break block33;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ns.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrwv", lptv(int ), (int)427)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ns.lpst("lrww", lpsq(int ), (int)1025)) break;
                v3 /* !! */  = (long)ns.lpst("lrwx", lpsq(int ), (int)1026);
            }
            var1_3 = ns.a;
            if (var3_1) {
                throw null;
lbl33:
                // 6 sources

                return (boolean)ns.lpst("lrwy", lpsq(int ), (int)1027);
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrwz", lptv(int ), (int)428)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ns.lpst("lrxa", lpsq(int ), (int)1028)) break;
                v4 /* !! */  = (long)ns.lpst("lrxb", lpsq(int ), (int)1029);
            }
            if (this.onGround) break block58;
            if (var1_3) ** GOTO lbl33
            v5 /* !! */  = ns.uk;
            if (true) ** GOTO lbl47
            block37: while (true) {
                v5 /* !! */  = (long)(v6 - ns.lpst("lrxc", lptv(int ), (int)429));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -241250620: {
                        v6 = ns.lpst("lrxd", lptv(int ), (int)430);
                        continue block37;
                    }
                    case 304457984: {
                        break block37;
                    }
                    case 1588776206: {
                        v6 = ns.lpst("lrxe", lptv(int ), (int)431);
                        continue block37;
                    }
                }
                break;
            }
            if (!((double)this.fallDistance < ns.lpst("lrxf", lqfo(int ), (int)432))) ** GOTO lbl111
            if (var1_3) ** GOTO lbl33
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lrxg", lptv(int ), (int)433)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ns.lpst("lrxh", lpsq(int ), (int)1030)) break;
                v7 /* !! */  = (long)ns.lpst("lrxi", lpsq(int ), (int)1031);
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lrxj", lptv(int ), (int)434)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ns.lpst("lrxk", lpsq(int ), (int)1032)) break;
                v8 /* !! */  = (long)ns.lpst("lrxl", lpsq(int ), (int)1033);
            }
            v9 = this.player.method_73183();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lrxm", lptv(int ), (int)435)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == ns.lpst("lrxn", lpsq(int ), (int)1034)) break;
                v10 /* !! */  = (long)ns.lpst("lrxo", lpsq(int ), (int)1035);
            }
            v11 /* !! */  = ns.uk;
            if (true) ** GOTO lbl78
            block41: while (true) {
                v11 /* !! */  = (long)(ns.lpst("lrxq", lptv(int ), (int)437) - ns.lpst("lrxp", lptv(int ), (int)436));
lbl78:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 304457984: {
                        break block41;
                    }
                    case 1021203896: {
                        continue block41;
                    }
                }
                break;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lrxr", lptv(int ), (int)438)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ns.lpst("lrxs", lpsq(int ), (int)1036)) break;
                v12 /* !! */  = (long)ns.lpst("lrxt", lpsq(int ), (int)1037);
            }
            v13 = (double)this.fallDistance - ns.lpst("lrxu", lqfo(int ), (int)439);
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lrxv", lptv(int ), (int)440)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == ns.lpst("lrxw", lpsq(int ), (int)1038)) break;
                v14 /* !! */  = (long)ns.lpst("lrxx", lpsq(int ), (int)1039);
            }
            v15 = this.boundingBox.method_989(0.0, v13, 0.0);
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lrxy", lptv(int ), (int)441)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == ns.lpst("lrxz", lpsq(int ), (int)1040)) break;
                v16 /* !! */  = (long)ns.lpst("lrya", lpsq(int ), (int)1041);
            }
            if (v9.method_8587((class_1297)this.player, v15)) ** GOTO lbl111
            if (var1_3) ** GOTO lbl33
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl33
                v17 = ns.lpst("lryb", lpsq(int ), (int)1042);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl111:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v17 = ns.lpst("lryc", lpsq(int ), (int)1043);
lbl114:
            // 2 sources

            return (boolean)v17;
            case 0: {
                var2_2 /* !! */  = (int)ns.lpst("lryd", lpsq(int ), (int)1044);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 1: {
                var2_2 /* !! */  = (int)ns.lpst("lrye", lpsq(int ), (int)1045);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lryf", lpsq(int ), (int)1046);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl130:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ns.lpst("lryg", lpsq(int ), (int)1047);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl153
                    break;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ns.lpst("lryh", lpsq(int ), (int)1048);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ns.lpst("lryi", lpsq(int ), (int)1049);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl145:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ns.lpst("lryj", lpsq(int ), (int)1050);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl149:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ns.lpst("lryk", lpsq(int ), (int)1051);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl153:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)ns.lpst("lryl", lpsq(int ), (int)1052);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl157:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ns.lpst("lrym", lpsq(int ), (int)1053);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ns.lpst("lryn", lpsq(int ), (int)1054);
                if (!var3_1) ** GOTO lbl153
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ns.lpst("lryo", lpsq(int ), (int)1055);
        ** while (!var3_1)
lbl168:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltpw() {
        ns.lpsr[100] = 1730703119;
        ns.lpsr[101] = -769797196;
        ns.lpsr[102] = 1396559063;
        ns.lpsr[103] = 1397348690;
        ns.lpsr[104] = -789369014;
        ns.lpsr[105] = -1961474762;
        ns.lpsr[106] = -936190655;
        ns.lpsr[107] = -753960317;
        ns.lpsr[108] = 2013525946;
        ns.lpsr[109] = -1138820517;
        ns.lpsr[110] = -1707514755;
        ns.lpsr[111] = -997902811;
        ns.lpsr[112] = 506301747;
        ns.lpsr[113] = -922172337;
        ns.lpsr[114] = -1831136322;
        ns.lpsr[115] = -444039824;
        ns.lpsr[116] = 760321310;
        ns.lpsr[117] = -743941057;
        ns.lpsr[118] = 819594037;
        ns.lpsr[119] = -1798912967;
        ns.lpsr[120] = -1079760475;
        ns.lpsr[121] = 730946276;
        ns.lpsr[122] = -1965566250;
        ns.lpsr[123] = -275936219;
        ns.lpsr[124] = 1704557340;
        ns.lpsr[125] = -1503818244;
        ns.lpsr[126] = 913822784;
        ns.lpsr[127] = 1713673661;
        ns.lpsr[128] = -1741035699;
        ns.lpsr[129] = -1081267861;
        ns.lpsr[130] = 1060800851;
        ns.lpsr[131] = 1805512806;
        ns.lpsr[132] = 1432179770;
        ns.lpsr[133] = -1706296382;
        ns.lpsr[134] = 766721509;
        ns.lpsr[135] = 623852904;
        ns.lpsr[136] = 823925833;
        ns.lpsr[137] = 914333020;
        ns.lpsr[138] = 1485817426;
        ns.lpsr[139] = 1354811312;
        ns.lpsr[140] = -433109197;
        ns.lpsr[141] = -1271967944;
        ns.lpsr[142] = 1460886901;
        ns.lpsr[143] = 1140418672;
        ns.lpsr[144] = 1856594414;
        ns.lpsr[145] = -1063162693;
        ns.lpsr[146] = -1652059423;
        ns.lpsr[147] = 15396788;
        ns.lpsr[148] = -586707939;
        ns.lpsr[149] = -1627389520;
        ns.lpsr[150] = -1797745292;
        ns.lpsr[151] = -192531275;
        ns.lpsr[152] = -1373132242;
        ns.lpsr[153] = -1955601149;
        ns.lpsr[154] = 1655356077;
        ns.lpsr[155] = -603986118;
        ns.lpsr[156] = 849353812;
        ns.lpsr[157] = 185775592;
        ns.lpsr[158] = -534996702;
        ns.lpsr[159] = -896628747;
        ns.lpsr[160] = -768870019;
        ns.lpsr[161] = -527299790;
        ns.lpsr[162] = -438419482;
        ns.lpsr[163] = 1881930987;
        ns.lpsr[164] = -2129745461;
        ns.lpsr[165] = 192462681;
        ns.lpsr[166] = -665096202;
        ns.lpsr[167] = -251592122;
        ns.lpsr[168] = -950348597;
        ns.lpsr[169] = 944296754;
        ns.lpsr[170] = 862972120;
        ns.lpsr[171] = -2041504744;
        ns.lpsr[172] = 154001170;
        ns.lpsr[173] = 56052197;
        ns.lpsr[174] = -1856116574;
        ns.lpsr[175] = -453594907;
        ns.lpsr[176] = -1534107751;
        ns.lpsr[177] = -1518155841;
        ns.lpsr[178] = -1095631434;
        ns.lpsr[179] = 855418169;
        ns.lpsr[180] = -994171957;
        ns.lpsr[181] = -616419093;
        ns.lpsr[182] = 1461401802;
        ns.lpsr[183] = 381581349;
        ns.lpsr[184] = -363458620;
        ns.lpsr[185] = -1118475121;
        ns.lpsr[186] = 1966441749;
        ns.lpsr[187] = 1320373240;
        ns.lpsr[188] = 1177640368;
        ns.lpsr[189] = 216715681;
        ns.lpsr[190] = 2061248182;
        ns.lpsr[191] = -1436839269;
        ns.lpsr[192] = -1917526637;
        ns.lpsr[193] = -379977665;
        ns.lpsr[194] = -1401510763;
        ns.lpsr[195] = 537940512;
        ns.lpsr[196] = -1207100039;
        ns.lpsr[197] = -431076524;
        ns.lpsr[198] = 403875433;
        ns.lpsr[199] = 1139684392;
    }

    private static /* synthetic */ float lqfy(int n2) {
        return Float.intBitsToFloat(lpsr[n2] ^ lpss[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 getRotationVector() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltcx", lptv(int ), (int)732)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ns.lpst("ltcy", lpsq(int ), (int)1554)) break;
            v0 /* !! */  = (long)ns.lpst("ltcz", lpsq(int ), (int)1555);
        }
        var3_1 = ns.c;
        v1 /* !! */  = ns.uk;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(ns.lpst("ltdb", lptv(int ), (int)734) - ns.lpst("ltda", lptv(int ), (int)733));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 304457984: {
                    break block29;
                }
                case 515187114: {
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = ns.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("ltdc", lptv(int ), (int)735)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ns.lpst("ltdd", lpsq(int ), (int)1556)) break;
                    v2 /* !! */  = (long)ns.lpst("ltde", lpsq(int ), (int)1557);
                }
                var1_3 = ns.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ns.uk;
                if (true) ** GOTO lbl37
                block32: while (true) {
                    v3 /* !! */  = (long)(v4 - ns.lpst("ltdf", lptv(int ), (int)736));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -627278195: {
                            v4 = ns.lpst("ltdg", lptv(int ), (int)737);
                            continue block32;
                        }
                        case 304457984: {
                            break block32;
                        }
                        case 624720318: {
                            v4 = ns.lpst("ltdh", lptv(int ), (int)738);
                            continue block32;
                        }
                        case 2081882221: {
                            v4 = ns.lpst("ltdi", lptv(int ), (int)739);
                            continue block32;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ns.uk;
                if (true) ** GOTO lbl53
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - ns.lpst("ltdj", lptv(int ), (int)740));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1038598545: {
                            v6 = ns.lpst("ltdk", lptv(int ), (int)741);
                            continue block33;
                        }
                        case 304457984: {
                            break block33;
                        }
                        case 981185098: {
                            v6 = ns.lpst("ltdl", lptv(int ), (int)742);
                            continue block33;
                        }
                        case 1073601951: {
                            v6 = ns.lpst("ltdm", lptv(int ), (int)743);
                            continue block33;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ns.uk;
                if (true) ** GOTO lbl69
                block34: while (true) {
                    v7 /* !! */  = (long)(v8 - ns.lpst("ltdn", lptv(int ), (int)744));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1249202653: {
                            v8 = ns.lpst("ltdo", lptv(int ), (int)745);
                            continue block34;
                        }
                        case -28527989: {
                            v8 = ns.lpst("ltdp", lptv(int ), (int)746);
                            continue block34;
                        }
                        case 304457984: {
                            break block34;
                        }
                        case 1937323098: {
                            v8 = ns.lpst("ltdq", lptv(int ), (int)747);
                            continue block34;
                        }
                    }
                    break;
                }
                return this.getRotationVector(this.pitch, this.yaw);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("ltdr", lpsq(int ), (int)1558);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("ltds", lpsq(int ), (int)1559);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ns.lpst("ltdt", lpsq(int ), (int)1560);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ns.lpst("ltdu", lpsq(int ), (int)1561);
        ** while (!var3_1)
lbl100:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getAttributeValue(class_6880<class_1320> var1_1) {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(ns.lpst("ltio", lptv(int ), (int)804) - ns.lpst("ltin", lptv(int ), (int)803));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 304457984: {
                    break block23;
                }
                case 547820900: {
                    continue block23;
                }
            }
            break;
        }
        var4_2 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("ltip", lptv(int ), (int)805)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("ltiq", lpsq(int ), (int)1629)) break;
            v1 /* !! */  = (long)ns.lpst("ltir", lpsq(int ), (int)1630);
        }
        var3_3 /* !! */  = ns.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ns.uk;
                if (true) ** GOTO lbl24
                block25: while (true) {
                    v2 /* !! */  = (long)(v3 - ns.lpst("ltis", lptv(int ), (int)806));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1210094757: {
                            v3 = ns.lpst("ltit", lptv(int ), (int)807);
                            continue block25;
                        }
                        case 304457984: {
                            break block25;
                        }
                        case 1355998508: {
                            v3 = ns.lpst("ltiu", lptv(int ), (int)808);
                            continue block25;
                        }
                    }
                    break;
                }
                var2_4 = ns.a;
                if (var4_2) {
                    throw null;
                    return (double)ns.lpst("ltiv", lqfo(int ), (int)809);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = ns.uk;
                if (true) ** GOTO lbl43
                block27: while (true) {
                    v4 /* !! */  = (long)(ns.lpst("ltix", lptv(int ), (int)811) - ns.lpst("ltiw", lptv(int ), (int)810));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 304457984: {
                            break block27;
                        }
                        case 1252712657: {
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("ltiy", lptv(int ), (int)812)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ns.lpst("ltiz", lpsq(int ), (int)1631)) break;
                    v5 /* !! */  = (long)ns.lpst("ltja", lpsq(int ), (int)1632);
                }
                v6 = this.player.method_6127();
                v7 /* !! */  = ns.uk;
                if (true) ** GOTO lbl58
                block29: while (true) {
                    v7 /* !! */  = (long)(ns.lpst("ltjc", lptv(int ), (int)814) - ns.lpst("ltjb", lptv(int ), (int)813));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -658240250: {
                            continue block29;
                        }
                        case 304457984: {
                            break block29;
                        }
                    }
                    break;
                }
                return v6.method_26852(var1_1);
            }
lbl64:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)ns.lpst("ltjd", lpsq(int ), (int)1633);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ns.lpst("ltje", lpsq(int ), (int)1634);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ns.lpst("ltjf", lpsq(int ), (int)1635);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)ns.lpst("ltjg", lpsq(int ), (int)1636);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean doesNotCollide(class_238 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsey", lptv(int ), (int)508)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lsez", lpsq(int ), (int)1155)) break;
            v0 /* !! */  = (long)ns.lpst("lsfa", lpsq(int ), (int)1156);
        }
        var4_2 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsfb", lptv(int ), (int)509)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("lsfc", lpsq(int ), (int)1157)) break;
            v1 /* !! */  = (long)ns.lpst("lsfd", lpsq(int ), (int)1158);
        }
        var3_3 /* !! */  = ns.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lsfe", lptv(int ), (int)510)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns.lpst("lsff", lpsq(int ), (int)1159)) break;
            v2 /* !! */  = (long)ns.lpst("lsfg", lpsq(int ), (int)1160);
        }
        var2_4 = ns.a;
        if (var4_2) {
            throw null;
lbl21:
            // 4 sources

            return (boolean)ns.lpst("lsfh", lpsq(int ), (int)1161);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                v3 /* !! */  = ns.uk;
                if (true) ** GOTO lbl31
                block31: while (true) {
                    v3 /* !! */  = (long)(v4 - ns.lpst("lsfi", lptv(int ), (int)511));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1556617052: {
                            v4 = ns.lpst("lsfj", lptv(int ), (int)512);
                            continue block31;
                        }
                        case 304457984: {
                            break block31;
                        }
                        case 399803927: {
                            v4 = ns.lpst("lsfk", lptv(int ), (int)513);
                            continue block31;
                        }
                        case 1890281372: {
                            v4 = ns.lpst("lsfl", lptv(int ), (int)514);
                            continue block31;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lsfm", lptv(int ), (int)515)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ns.lpst("lsfn", lpsq(int ), (int)1162)) break;
                    v5 /* !! */  = (long)ns.lpst("lsfo", lpsq(int ), (int)1163);
                }
                v6 = this.player.method_73183();
                v7 /* !! */  = ns.uk;
                if (true) ** GOTO lbl53
                block33: while (true) {
                    v7 /* !! */  = (long)(ns.lpst("lsfq", lptv(int ), (int)517) - ns.lpst("lsfp", lptv(int ), (int)516));
lbl53:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1709682312: {
                            continue block33;
                        }
                        case 304457984: {
                            break block33;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lsfr", lptv(int ), (int)518)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ns.lpst("lsfs", lpsq(int ), (int)1164)) break;
                    v8 /* !! */  = (long)ns.lpst("lsft", lpsq(int ), (int)1165);
                }
                if (!v6.method_8587((class_1297)this.player, var1_1)) ** GOTO lbl98
                if (var2_4) ** GOTO lbl21
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lsfu", lptv(int ), (int)519)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ns.lpst("lsfv", lpsq(int ), (int)1166)) break;
                    v9 /* !! */  = (long)ns.lpst("lsfw", lpsq(int ), (int)1167);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lsfx", lptv(int ), (int)520)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ns.lpst("lsfy", lpsq(int ), (int)1168)) break;
                    v10 /* !! */  = (long)ns.lpst("lsfz", lpsq(int ), (int)1169);
                }
                v11 = this.player.method_73183();
                v12 /* !! */  = ns.uk;
                if (true) ** GOTO lbl80
                block37: while (true) {
                    v12 /* !! */  = (long)(v13 - ns.lpst("lsga", lptv(int ), (int)521));
lbl80:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1944151550: {
                            v13 = ns.lpst("lsgb", lptv(int ), (int)522);
                            continue block37;
                        }
                        case -1054737508: {
                            v13 = ns.lpst("lsgc", lptv(int ), (int)523);
                            continue block37;
                        }
                        case 304457984: {
                            break block37;
                        }
                        case 607057895: {
                            v13 = ns.lpst("lsgd", lptv(int ), (int)524);
                            continue block37;
                        }
                    }
                    break;
                }
                if (v11.method_22345(var1_1)) ** GOTO lbl98
                if (var2_4) ** GOTO lbl21
                v14 = ns.lpst("lsge", lpsq(int ), (int)1170);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl101
lbl98:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v14 = ns.lpst("lsgf", lpsq(int ), (int)1171);
lbl101:
                // 2 sources

                return (boolean)v14;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)ns.lpst("lsgg", lpsq(int ), (int)1172);
                } while (!var4_2);
                throw null;
            }
lbl107:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ns.lpst("lsgh", lpsq(int ), (int)1173);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl112:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ns.lpst("lsgi", lpsq(int ), (int)1174);
                if (var4_2) {
                    throw null;
                }
            }
lbl116:
            // 4 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ns.lpst("lsgj", lpsq(int ), (int)1175);
                    if (!var4_2) ** GOTO lbl107
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)ns.lpst("lsgk", lpsq(int ), (int)1176);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 5: {
                var3_3 /* !! */  = (int)ns.lpst("lsgl", lpsq(int ), (int)1177);
                if (!var4_2) break;
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)ns.lpst("lsgm", lpsq(int ), (int)1178);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
lbl134:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ns.lpst("lsgn", lpsq(int ), (int)1179);
                if (!var4_2) break;
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)ns.lpst("lsgo", lpsq(int ), (int)1180);
        ** while (!var4_2)
lbl141:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltpy() {
        ns.lpsr[300] = 1568204780;
        ns.lpsr[301] = 1348456398;
        ns.lpsr[302] = -1916577813;
        ns.lpsr[303] = 1547690053;
        ns.lpsr[304] = -690469912;
        ns.lpsr[305] = 1996540471;
        ns.lpsr[306] = 1326350560;
        ns.lpsr[307] = -14196181;
        ns.lpsr[308] = 557973641;
        ns.lpsr[309] = -1282371846;
        ns.lpsr[310] = -214772409;
        ns.lpsr[311] = -2003904188;
        ns.lpsr[312] = -1922028203;
        ns.lpsr[313] = 1427997152;
        ns.lpsr[314] = -1583215914;
        ns.lpsr[315] = -737619245;
        ns.lpsr[316] = 73737167;
        ns.lpsr[317] = 34196335;
        ns.lpsr[318] = -1372013955;
        ns.lpsr[319] = -419152571;
        ns.lpsr[320] = -1214826367;
        ns.lpsr[321] = -1617995750;
        ns.lpsr[322] = -173559756;
        ns.lpsr[323] = 1167094477;
        ns.lpsr[324] = -966115847;
        ns.lpsr[325] = -2112325607;
        ns.lpsr[326] = -1196712382;
        ns.lpsr[327] = 1819951347;
        ns.lpsr[328] = -1897845934;
        ns.lpsr[329] = 554807594;
        ns.lpsr[330] = 991843951;
        ns.lpsr[331] = 1812637948;
        ns.lpsr[332] = -382428070;
        ns.lpsr[333] = -1240557988;
        ns.lpsr[334] = -2095531950;
        ns.lpsr[335] = 1040663584;
        ns.lpsr[336] = -912194239;
        ns.lpsr[337] = -228280234;
        ns.lpsr[338] = -1978866710;
        ns.lpsr[339] = 1730118971;
        ns.lpsr[340] = 1804189029;
        ns.lpsr[341] = 486342677;
        ns.lpsr[342] = -365663826;
        ns.lpsr[343] = 1861305533;
        ns.lpsr[344] = 1530679825;
        ns.lpsr[345] = -716369300;
        ns.lpsr[346] = 1982238001;
        ns.lpsr[347] = 495080862;
        ns.lpsr[348] = 846311421;
        ns.lpsr[349] = -1653637478;
        ns.lpsr[350] = 1663487033;
        ns.lpsr[351] = -1867247480;
        ns.lpsr[352] = 1298208649;
        ns.lpsr[353] = 1969937622;
        ns.lpsr[354] = 1895576904;
        ns.lpsr[355] = -1424947300;
        ns.lpsr[356] = -317521416;
        ns.lpsr[357] = -635098406;
        ns.lpsr[358] = 942037953;
        ns.lpsr[359] = 379869010;
        ns.lpsr[360] = 1440761797;
        ns.lpsr[361] = -1803421980;
        ns.lpsr[362] = -112404963;
        ns.lpsr[363] = -846375271;
        ns.lpsr[364] = 1357661188;
        ns.lpsr[365] = -167826370;
        ns.lpsr[366] = -1424840973;
        ns.lpsr[367] = 1979285316;
        ns.lpsr[368] = -1020343232;
        ns.lpsr[369] = -2129811977;
        ns.lpsr[370] = -699990837;
        ns.lpsr[371] = -1151739722;
        ns.lpsr[372] = -1500701872;
        ns.lpsr[373] = -106972101;
        ns.lpsr[374] = 402724198;
        ns.lpsr[375] = 2051560021;
        ns.lpsr[376] = -674291037;
        ns.lpsr[377] = 2000258008;
        ns.lpsr[378] = -439527804;
        ns.lpsr[379] = 316982205;
        ns.lpsr[380] = -1053762497;
        ns.lpsr[381] = 577992708;
        ns.lpsr[382] = -1108493020;
        ns.lpsr[383] = 2109241734;
        ns.lpsr[384] = -1289388518;
        ns.lpsr[385] = -1248216987;
        ns.lpsr[386] = 353391187;
        ns.lpsr[387] = -55927892;
        ns.lpsr[388] = -1512259800;
        ns.lpsr[389] = -534834776;
        ns.lpsr[390] = -1476246150;
        ns.lpsr[391] = 327075126;
        ns.lpsr[392] = 1954055299;
        ns.lpsr[393] = 540839147;
        ns.lpsr[394] = -217135814;
        ns.lpsr[395] = 754621800;
        ns.lpsr[396] = 1491313306;
        ns.lpsr[397] = 713766969;
        ns.lpsr[398] = 1311037762;
        ns.lpsr[399] = 979782350;
    }

    private static /* synthetic */ void ltqa() {
        ns.lpsr[500] = -485838156;
        ns.lpsr[501] = 209182574;
        ns.lpsr[502] = 1649941651;
        ns.lpsr[503] = 673395286;
        ns.lpsr[504] = 1821531726;
        ns.lpsr[505] = -1073184933;
        ns.lpsr[506] = 218436683;
        ns.lpsr[507] = -1659378542;
        ns.lpsr[508] = -144498373;
        ns.lpsr[509] = -1518537038;
        ns.lpsr[510] = -1658439402;
        ns.lpsr[511] = -1676327674;
        ns.lpsr[512] = -774348953;
        ns.lpsr[513] = -1630421678;
        ns.lpsr[514] = 1080449709;
        ns.lpsr[515] = 1492414750;
        ns.lpsr[516] = 1856161105;
        ns.lpsr[517] = -1436917562;
        ns.lpsr[518] = -1357992941;
        ns.lpsr[519] = -1343045708;
        ns.lpsr[520] = 301071473;
        ns.lpsr[521] = -528980101;
        ns.lpsr[522] = -389224163;
        ns.lpsr[523] = -2105476642;
        ns.lpsr[524] = -847775496;
        ns.lpsr[525] = -799338482;
        ns.lpsr[526] = -1603474670;
        ns.lpsr[527] = 1583348323;
        ns.lpsr[528] = 1495578273;
        ns.lpsr[529] = 344381077;
        ns.lpsr[530] = -1143387379;
        ns.lpsr[531] = 1278341112;
        ns.lpsr[532] = 453219245;
        ns.lpsr[533] = -599707951;
        ns.lpsr[534] = 194095423;
        ns.lpsr[535] = -336724679;
        ns.lpsr[536] = 566641854;
        ns.lpsr[537] = 1692172108;
        ns.lpsr[538] = -1753823340;
        ns.lpsr[539] = 825338858;
        ns.lpsr[540] = -1190767030;
        ns.lpsr[541] = 1157066368;
        ns.lpsr[542] = -1845431212;
        ns.lpsr[543] = -2122064275;
        ns.lpsr[544] = 1458286780;
        ns.lpsr[545] = 344551718;
        ns.lpsr[546] = 1197250320;
        ns.lpsr[547] = -804508970;
        ns.lpsr[548] = 429288539;
        ns.lpsr[549] = 1626913848;
        ns.lpsr[550] = -1333677491;
        ns.lpsr[551] = 191062011;
        ns.lpsr[552] = 1662021480;
        ns.lpsr[553] = 718395876;
        ns.lpsr[554] = 1198575582;
        ns.lpsr[555] = -1435946114;
        ns.lpsr[556] = -184648523;
        ns.lpsr[557] = -508832495;
        ns.lpsr[558] = 1994424733;
        ns.lpsr[559] = -1845008702;
        ns.lpsr[560] = -1956814542;
        ns.lpsr[561] = -1741709650;
        ns.lpsr[562] = -1222205856;
        ns.lpsr[563] = -193780672;
        ns.lpsr[564] = 284806424;
        ns.lpsr[565] = -1897150573;
        ns.lpsr[566] = -398643432;
        ns.lpsr[567] = -1214655502;
        ns.lpsr[568] = 1931949717;
        ns.lpsr[569] = 944469916;
        ns.lpsr[570] = 2071779397;
        ns.lpsr[571] = -2137956251;
        ns.lpsr[572] = 818367922;
        ns.lpsr[573] = 1349320266;
        ns.lpsr[574] = -1763605809;
        ns.lpsr[575] = 1463694276;
        ns.lpsr[576] = 1707121839;
        ns.lpsr[577] = -1549684048;
        ns.lpsr[578] = 1177588595;
        ns.lpsr[579] = -32088914;
        ns.lpsr[580] = -136320620;
        ns.lpsr[581] = -1560255041;
        ns.lpsr[582] = -1244974027;
        ns.lpsr[583] = -232227381;
        ns.lpsr[584] = -347624598;
        ns.lpsr[585] = 58102485;
        ns.lpsr[586] = 386591038;
        ns.lpsr[587] = 658708632;
        ns.lpsr[588] = -416903434;
        ns.lpsr[589] = -252361247;
        ns.lpsr[590] = -1378193177;
        ns.lpsr[591] = 147636617;
        ns.lpsr[592] = -324112852;
        ns.lpsr[593] = -710475962;
        ns.lpsr[594] = 695065260;
        ns.lpsr[595] = -1262228392;
        ns.lpsr[596] = -1537982245;
        ns.lpsr[597] = 10383034;
        ns.lpsr[598] = -189148186;
        ns.lpsr[599] = 235585510;
    }

    private static /* synthetic */ void ltrr() {
        ns.lptx[200] = 4189100391211294729L;
        ns.lptx[201] = 1659027553600275494L;
        ns.lptx[202] = -8048211315648229587L;
        ns.lptx[203] = 7795605426960362994L;
        ns.lptx[204] = 1634025357496316768L;
        ns.lptx[205] = -3420492372109571531L;
        ns.lptx[206] = 1001641064372356493L;
        ns.lptx[207] = -3978130582865494796L;
        ns.lptx[208] = 7032376276503683672L;
        ns.lptx[209] = 3454177847505616850L;
        ns.lptx[210] = -5462701956377722994L;
        ns.lptx[211] = -2009766466113434626L;
        ns.lptx[212] = 5830682927463571511L;
        ns.lptx[213] = -7369934495630948420L;
        ns.lptx[214] = 5421004873389011803L;
        ns.lptx[215] = 2322446889267357432L;
        ns.lptx[216] = -6466272697627999374L;
        ns.lptx[217] = 2322311536097803443L;
        ns.lptx[218] = 3716773389035952417L;
        ns.lptx[219] = 6254826935335694768L;
        ns.lptx[220] = -2285471576306273559L;
        ns.lptx[221] = 4045835574028101993L;
        ns.lptx[222] = 1136909223204172147L;
        ns.lptx[223] = -5292962824934199802L;
        ns.lptx[224] = 1500705436774120187L;
        ns.lptx[225] = 4925438458569680531L;
        ns.lptx[226] = -7232854323221850591L;
        ns.lptx[227] = -716880990333567958L;
        ns.lptx[228] = 3775495425421275775L;
        ns.lptx[229] = -7742600370372145395L;
        ns.lptx[230] = 4617776238547586469L;
        ns.lptx[231] = -4385573635395614638L;
        ns.lptx[232] = 7308670813541678035L;
        ns.lptx[233] = -119810925803826685L;
        ns.lptx[234] = -3054940336769632182L;
        ns.lptx[235] = 6591598629447785996L;
        ns.lptx[236] = 8659391874661146515L;
        ns.lptx[237] = 7297828868857108389L;
        ns.lptx[238] = 9189017623852037658L;
        ns.lptx[239] = 2997133505595178201L;
        ns.lptx[240] = 1608463562954213532L;
        ns.lptx[241] = -530892523984152635L;
        ns.lptx[242] = 4386654569254842524L;
        ns.lptx[243] = 4463874639652044253L;
        ns.lptx[244] = -4016865549159021525L;
        ns.lptx[245] = 4667963058278485106L;
        ns.lptx[246] = -4535799105340075968L;
        ns.lptx[247] = -3141132499058178968L;
        ns.lptx[248] = 1182355448100397219L;
        ns.lptx[249] = 2830733622850681649L;
        ns.lptx[250] = 802496381983272662L;
        ns.lptx[251] = 1686361410557175789L;
        ns.lptx[252] = 4026997800228825429L;
        ns.lptx[253] = 3955373868829630062L;
        ns.lptx[254] = 5394275614889016831L;
        ns.lptx[255] = 3339561963910235320L;
        ns.lptx[256] = 6409388414926296373L;
        ns.lptx[257] = 5353205186000062134L;
        ns.lptx[258] = -471339753197702666L;
        ns.lptx[259] = 1934061771838570561L;
        ns.lptx[260] = 6148676198443637200L;
        ns.lptx[261] = 6862809612321976136L;
        ns.lptx[262] = -2728543480444243951L;
        ns.lptx[263] = -592061854720569657L;
        ns.lptx[264] = -4321187057062637101L;
        ns.lptx[265] = -2624067189328073920L;
        ns.lptx[266] = 7030236105476336547L;
        ns.lptx[267] = 9058109265748620781L;
        ns.lptx[268] = 3836171297268920733L;
        ns.lptx[269] = 9166236653751844600L;
        ns.lptx[270] = 637270795336726008L;
        ns.lptx[271] = 7138557241357558388L;
        ns.lptx[272] = 4819011616520861371L;
        ns.lptx[273] = -5810537760830739905L;
        ns.lptx[274] = -2827774013315502647L;
        ns.lptx[275] = -714378066947088262L;
        ns.lptx[276] = 3597506320473989337L;
        ns.lptx[277] = -4439975919999826961L;
        ns.lptx[278] = 8747065076406751311L;
        ns.lptx[279] = 4628677668580170200L;
        ns.lptx[280] = 3866041361806241783L;
        ns.lptx[281] = 6039971077312804330L;
        ns.lptx[282] = 6808395254478149156L;
        ns.lptx[283] = -6730351147516278753L;
        ns.lptx[284] = 3165389655975614438L;
        ns.lptx[285] = 7257486483595675308L;
        ns.lptx[286] = -345742471838249369L;
        ns.lptx[287] = -3938089768091756977L;
        ns.lptx[288] = 1135066711089588949L;
        ns.lptx[289] = 4947679167480902109L;
        ns.lptx[290] = 3646244930193838051L;
        ns.lptx[291] = -3898895722136941297L;
        ns.lptx[292] = -1704441050292063113L;
        ns.lptx[293] = -3587704537245652067L;
        ns.lptx[294] = 5589056251643087861L;
        ns.lptx[295] = 3052711476843483207L;
        ns.lptx[296] = -1046223838122271472L;
        ns.lptx[297] = 4322631223203190624L;
        ns.lptx[298] = 5415197972321707856L;
        ns.lptx[299] = 4043004822058889636L;
    }

    private static /* synthetic */ void ltqn() {
        ns.lpss[0] = -1968859369;
        ns.lpss[1] = 594840767;
        ns.lpss[2] = 1106695074;
        ns.lpss[3] = -120439934;
        ns.lpss[4] = -1818404050;
        ns.lpss[5] = -1908873344;
        ns.lpss[6] = 474395467;
        ns.lpss[7] = -1069597163;
        ns.lpss[8] = -1296255424;
        ns.lpss[9] = 1001765106;
        ns.lpss[10] = 682927322;
        ns.lpss[11] = 1493980885;
        ns.lpss[12] = 1818986093;
        ns.lpss[13] = 915318045;
        ns.lpss[14] = 702907623;
        ns.lpss[15] = -1366321652;
        ns.lpss[16] = 1094691123;
        ns.lpss[17] = -1563510614;
        ns.lpss[18] = 632134705;
        ns.lpss[19] = -1088994648;
        ns.lpss[20] = -158078189;
        ns.lpss[21] = 1688848822;
        ns.lpss[22] = 1037390307;
        ns.lpss[23] = -293414613;
        ns.lpss[24] = -676606603;
        ns.lpss[25] = 649236969;
        ns.lpss[26] = 1392524825;
        ns.lpss[27] = -1634740794;
        ns.lpss[28] = 546594977;
        ns.lpss[29] = 621555011;
        ns.lpss[30] = 1779924997;
        ns.lpss[31] = -1786693377;
        ns.lpss[32] = -1755282886;
        ns.lpss[33] = 1682560203;
        ns.lpss[34] = 2130672571;
        ns.lpss[35] = -1793277519;
        ns.lpss[36] = 89220255;
        ns.lpss[37] = -16406360;
        ns.lpss[38] = -313091781;
        ns.lpss[39] = -668900542;
        ns.lpss[40] = -1771904468;
        ns.lpss[41] = 1503377571;
        ns.lpss[42] = 1355018041;
        ns.lpss[43] = 2126268737;
        ns.lpss[44] = 584231832;
        ns.lpss[45] = 1120904938;
        ns.lpss[46] = -607973042;
        ns.lpss[47] = 384726438;
        ns.lpss[48] = -566501023;
        ns.lpss[49] = 267546225;
        ns.lpss[50] = -1761678236;
        ns.lpss[51] = 1889272140;
        ns.lpss[52] = -2074059575;
        ns.lpss[53] = -893235235;
        ns.lpss[54] = -1206413648;
        ns.lpss[55] = 1746343503;
        ns.lpss[56] = -943033834;
        ns.lpss[57] = -657303007;
        ns.lpss[58] = 205839917;
        ns.lpss[59] = 140346472;
        ns.lpss[60] = -975120121;
        ns.lpss[61] = 369158329;
        ns.lpss[62] = -955493451;
        ns.lpss[63] = -772851373;
        ns.lpss[64] = 1883231423;
        ns.lpss[65] = 1658779368;
        ns.lpss[66] = 2050240633;
        ns.lpss[67] = -795388438;
        ns.lpss[68] = -634536551;
        ns.lpss[69] = 1865604534;
        ns.lpss[70] = 844538154;
        ns.lpss[71] = -268475225;
        ns.lpss[72] = -1722846733;
        ns.lpss[73] = 1348700587;
        ns.lpss[74] = 555756279;
        ns.lpss[75] = 1548322027;
        ns.lpss[76] = -2145330039;
        ns.lpss[77] = -1333711161;
        ns.lpss[78] = 491838855;
        ns.lpss[79] = 92709288;
        ns.lpss[80] = -1134396743;
        ns.lpss[81] = -1658031938;
        ns.lpss[82] = -1133562640;
        ns.lpss[83] = -632618707;
        ns.lpss[84] = -844724147;
        ns.lpss[85] = -1969038427;
        ns.lpss[86] = 2126108475;
        ns.lpss[87] = 731811716;
        ns.lpss[88] = 661827464;
        ns.lpss[89] = 1645031591;
        ns.lpss[90] = -591801138;
        ns.lpss[91] = 1685496719;
        ns.lpss[92] = 918843598;
        ns.lpss[93] = 2070270701;
        ns.lpss[94] = -1188622519;
        ns.lpss[95] = -696119698;
        ns.lpss[96] = -1562332788;
        ns.lpss[97] = 2012933706;
        ns.lpss[98] = 396077326;
        ns.lpss[99] = -1360179259;
    }

    private static /* synthetic */ void ltro() {
        ns.lptw[900] = -1596166297261108645L;
        ns.lptw[901] = 6668005225884725120L;
        ns.lptw[902] = 6890129420674078997L;
        ns.lptw[903] = 8418285482974030857L;
        ns.lptw[904] = -1394042450347666991L;
        ns.lptw[905] = 6285888272057482135L;
        ns.lptw[906] = 6760627714287498577L;
        ns.lptw[907] = 6541540532439012561L;
        ns.lptw[908] = -2108695874070618485L;
        ns.lptw[909] = 6139221506683484835L;
        ns.lptw[910] = 4512345758772082527L;
        ns.lptw[911] = -1709451588022098857L;
        ns.lptw[912] = 5446656224065707754L;
        ns.lptw[913] = 4070559487296326996L;
        ns.lptw[914] = -2542162999661579161L;
        ns.lptw[915] = -4572947435748806832L;
        ns.lptw[916] = 9037941080808178709L;
    }

    private static /* synthetic */ void ltqt() {
        ns.lpss[600] = -1417485645;
        ns.lpss[601] = 1148858322;
        ns.lpss[602] = 1751286736;
        ns.lpss[603] = 469399535;
        ns.lpss[604] = 300744316;
        ns.lpss[605] = -1392043419;
        ns.lpss[606] = -206996919;
        ns.lpss[607] = 1467950211;
        ns.lpss[608] = -609207324;
        ns.lpss[609] = -88453682;
        ns.lpss[610] = 913744839;
        ns.lpss[611] = -434652147;
        ns.lpss[612] = 2106978957;
        ns.lpss[613] = -694095889;
        ns.lpss[614] = -201772353;
        ns.lpss[615] = -957493648;
        ns.lpss[616] = 784885351;
        ns.lpss[617] = 2033005136;
        ns.lpss[618] = -63935338;
        ns.lpss[619] = 501935414;
        ns.lpss[620] = 1672604113;
        ns.lpss[621] = 1113108124;
        ns.lpss[622] = 1812148814;
        ns.lpss[623] = 227680664;
        ns.lpss[624] = -1104508927;
        ns.lpss[625] = 878768320;
        ns.lpss[626] = 1724246279;
        ns.lpss[627] = 1107644831;
        ns.lpss[628] = 2069541436;
        ns.lpss[629] = 509588964;
        ns.lpss[630] = -11861389;
        ns.lpss[631] = -226596924;
        ns.lpss[632] = -1313399626;
        ns.lpss[633] = -413097483;
        ns.lpss[634] = 544199404;
        ns.lpss[635] = 952415453;
        ns.lpss[636] = -17387062;
        ns.lpss[637] = -1825222089;
        ns.lpss[638] = 912488240;
        ns.lpss[639] = -748823192;
        ns.lpss[640] = 2073896848;
        ns.lpss[641] = 2039397395;
        ns.lpss[642] = -596243624;
        ns.lpss[643] = -539745874;
        ns.lpss[644] = 2118683509;
        ns.lpss[645] = -1664122325;
        ns.lpss[646] = -1819878304;
        ns.lpss[647] = -1513223440;
        ns.lpss[648] = 508737890;
        ns.lpss[649] = 1728448175;
        ns.lpss[650] = -1570394649;
        ns.lpss[651] = -841533472;
        ns.lpss[652] = 32547100;
        ns.lpss[653] = 902090478;
        ns.lpss[654] = 786176050;
        ns.lpss[655] = -1736115118;
        ns.lpss[656] = 305528301;
        ns.lpss[657] = -639300561;
        ns.lpss[658] = 1709195894;
        ns.lpss[659] = 1041811507;
        ns.lpss[660] = -1666554748;
        ns.lpss[661] = 1420320194;
        ns.lpss[662] = -1715307178;
        ns.lpss[663] = -1435661895;
        ns.lpss[664] = 1032243993;
        ns.lpss[665] = -1788075951;
        ns.lpss[666] = 440107434;
        ns.lpss[667] = 471629532;
        ns.lpss[668] = 1702948820;
        ns.lpss[669] = 1265753723;
        ns.lpss[670] = -1134995583;
        ns.lpss[671] = 1268328964;
        ns.lpss[672] = -864272017;
        ns.lpss[673] = 1533392547;
        ns.lpss[674] = 1537550697;
        ns.lpss[675] = 516644355;
        ns.lpss[676] = -305254887;
        ns.lpss[677] = -1719350780;
        ns.lpss[678] = 1656522733;
        ns.lpss[679] = 984192324;
        ns.lpss[680] = 759037085;
        ns.lpss[681] = -858584824;
        ns.lpss[682] = -1271078562;
        ns.lpss[683] = 499451973;
        ns.lpss[684] = 1271305155;
        ns.lpss[685] = 116453594;
        ns.lpss[686] = 898118102;
        ns.lpss[687] = -1478740158;
        ns.lpss[688] = -761080842;
        ns.lpss[689] = 739708473;
        ns.lpss[690] = 534130553;
        ns.lpss[691] = -761275598;
        ns.lpss[692] = 1754490662;
        ns.lpss[693] = 1489394063;
        ns.lpss[694] = 2035077540;
        ns.lpss[695] = 1830662912;
        ns.lpss[696] = -1999427535;
        ns.lpss[697] = -2000918762;
        ns.lpss[698] = 1609247964;
        ns.lpss[699] = -360939456;
    }

    private static /* synthetic */ void ltry() {
        ns.lptx[900] = 8545470592120219166L;
        ns.lptx[901] = 3117484964734529563L;
        ns.lptx[902] = 4571386253536276360L;
        ns.lptx[903] = 8126648358908015972L;
        ns.lptx[904] = -117684998744988758L;
        ns.lptx[905] = -6673408108356954921L;
        ns.lptx[906] = 6013669053694170185L;
        ns.lptx[907] = -8575358265011392691L;
        ns.lptx[908] = -5529301945861713563L;
        ns.lptx[909] = 3528082458118390461L;
        ns.lptx[910] = 6335418318442437888L;
        ns.lptx[911] = 1292366969777752196L;
        ns.lptx[912] = -2258038362938029624L;
        ns.lptx[913] = -8269901852434646237L;
        ns.lptx[914] = 965669579180517866L;
        ns.lptx[915] = 5206506652810387671L;
        ns.lptx[916] = 4464766216965203322L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void jump() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrhj", lptv(int ), (int)272)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns.lpst("lrhk", lpsq(int ), (int)778)) break;
            v0 /* !! */  = (long)ns.lpst("lrhl", lpsq(int ), (int)779);
        }
        var4_1 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrhm", lptv(int ), (int)273)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns.lpst("lrhn", lpsq(int ), (int)780)) break;
            v1 /* !! */  = (long)ns.lpst("lrho", lpsq(int ), (int)781);
        }
        var3_2 /* !! */  = ns.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lrhp", lptv(int ), (int)274)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns.lpst("lrhq", lpsq(int ), (int)782)) break;
            v2 /* !! */  = (long)ns.lpst("lrhr", lpsq(int ), (int)783);
        }
        var2_3 = ns.a;
        if (var4_1) {
            throw null;
lbl21:
            // 7 sources

            return;
        }
        if (var2_3) ** GOTO lbl21
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lrhs", lptv(int ), (int)275)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ns.lpst("lrht", lpsq(int ), (int)784)) break;
                    v3 /* !! */  = (long)ns.lpst("lrhu", lpsq(int ), (int)785);
                }
                v4 /* !! */  = ns.uk;
                if (true) ** GOTO lbl37
                block46: while (true) {
                    v4 /* !! */  = (long)(ns.lpst("lrhw", lptv(int ), (int)277) - ns.lpst("lrhv", lptv(int ), (int)276));
lbl37:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -772897944: {
                            continue block46;
                        }
                        case 304457984: {
                            break block46;
                        }
                    }
                    break;
                }
                v5 = this.getJumpVelocity();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lrhx", lptv(int ), (int)278)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ns.lpst("lrhy", lpsq(int ), (int)786)) break;
                    v6 /* !! */  = (long)ns.lpst("lrhz", lpsq(int ), (int)787);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = ns.uk - ns.lpst("lria", lptv(int ), (int)279)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ns.lpst("lrib", lpsq(int ), (int)788)) break;
                    v7 /* !! */  = (long)ns.lpst("lric", lpsq(int ), (int)789);
                }
                v8 = v5 - this.velocity.field_1351;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_6 = ns.uk - ns.lpst("lrid", lptv(int ), (int)280)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ns.lpst("lrie", lpsq(int ), (int)790)) break;
                    v9 /* !! */  = (long)ns.lpst("lrif", lpsq(int ), (int)791);
                }
                v10 = this.velocity.method_1031(0.0, v8, 0.0);
                v11 /* !! */  = ns.uk;
                if (true) ** GOTO lbl64
                block50: while (true) {
                    v11 /* !! */  = (long)(ns.lpst("lrih", lptv(int ), (int)282) - ns.lpst("lrig", lptv(int ), (int)281));
lbl64:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1156556229: {
                            continue block50;
                        }
                        case 304457984: {
                            break block50;
                        }
                    }
                    break;
                }
                this.velocity = v10;
                if (var2_3 || var2_3) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = ns.uk - ns.lpst("lrii", lptv(int ), (int)283)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ns.lpst("lrij", lpsq(int ), (int)792)) break;
                    v12 /* !! */  = (long)ns.lpst("lrik", lpsq(int ), (int)793);
                }
                if (!this.isSprinting()) ** GOTO lbl146
                if (var2_3 || var2_3) ** GOTO lbl21
                v13 /* !! */  = ns.uk;
                if (true) ** GOTO lbl82
                block52: while (true) {
                    v13 /* !! */  = (long)(v14 - ns.lpst("lril", lptv(int ), (int)284));
lbl82:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1156158359: {
                            v14 = ns.lpst("lrim", lptv(int ), (int)285);
                            continue block52;
                        }
                        case -1129373456: {
                            v14 = ns.lpst("lrin", lptv(int ), (int)286);
                            continue block52;
                        }
                        case 304457984: {
                            break block52;
                        }
                        case 603453006: {
                            v14 = ns.lpst("lrio", lptv(int ), (int)287);
                            continue block52;
                        }
                    }
                    break;
                }
                v15 = this.yaw;
                v16 /* !! */  = ns.uk;
                if (true) ** GOTO lbl99
                block53: while (true) {
                    v16 /* !! */  = (long)(ns.lpst("lriq", lptv(int ), (int)289) - ns.lpst("lrip", lptv(int ), (int)288));
lbl99:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 304457984: {
                            break block53;
                        }
                        case 1362275066: {
                            continue block53;
                        }
                    }
                    break;
                }
                var1_4 = (float)Math.toRadians(v15);
                if (var2_3 || var2_3) ** GOTO lbl21
                v17 /* !! */  = ns.uk;
                if (true) ** GOTO lbl110
                block54: while (true) {
                    v17 /* !! */  = (long)(ns.lpst("lris", lptv(int ), (int)291) - ns.lpst("lrir", lptv(int ), (int)290));
lbl110:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 304457984: {
                            break block54;
                        }
                        case 1996353720: {
                            continue block54;
                        }
                    }
                    break;
                }
                v18 = var1_4;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_8 = ns.uk - ns.lpst("lrit", lptv(int ), (int)292)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ns.lpst("lriu", lpsq(int ), (int)794)) break;
                    v19 /* !! */  = (long)ns.lpst("lriv", lpsq(int ), (int)795);
                }
                v20 = (double)(-class_3532.method_15374((double)v18)) * ns.lpst("lriw", lqfo(int ), (int)293);
                v21 = var1_4;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_9 = ns.uk - ns.lpst("lrix", lptv(int ), (int)294)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ns.lpst("lriy", lpsq(int ), (int)796)) break;
                    v22 /* !! */  = (long)ns.lpst("lriz", lpsq(int ), (int)797);
                }
                v23 = (double)class_3532.method_15362((double)v21) * ns.lpst("lrja", lqfo(int ), (int)295);
                v24 /* !! */  = ns.uk;
                if (true) ** GOTO lbl133
                block57: while (true) {
                    v24 /* !! */  = (long)(ns.lpst("lrjc", lptv(int ), (int)297) - ns.lpst("lrjb", lptv(int ), (int)296));
lbl133:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 304457984: {
                            break block57;
                        }
                        case 1114367213: {
                            continue block57;
                        }
                    }
                    break;
                }
                v25 = this.velocity.method_1031(v20, 0.0, v23);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_10 = ns.uk - ns.lpst("lrjd", lptv(int ), (int)298)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ns.lpst("lrje", lpsq(int ), (int)798)) break;
                    v26 /* !! */  = (long)ns.lpst("lrjf", lpsq(int ), (int)799);
                }
                this.velocity = v25;
                if (var2_3) ** GOTO lbl21
lbl146:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl149:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ns.lpst("lrjg", lpsq(int ), (int)800);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 1: {
                var3_2 /* !! */  = (int)ns.lpst("lrjh", lpsq(int ), (int)801);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl159:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ns.lpst("lrji", lpsq(int ), (int)802);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl164:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)ns.lpst("lrjj", lpsq(int ), (int)803);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl169:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)ns.lpst("lrjk", lpsq(int ), (int)804);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl174:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)ns.lpst("lrjl", lpsq(int ), (int)805);
                if (!var4_1) break;
                throw null;
            }
lbl178:
            // 2 sources

            case 6: {
                do {
                    var3_2 /* !! */  = (int)ns.lpst("lrjm", lpsq(int ), (int)806);
                } while (!var4_1);
                throw null;
            }
lbl183:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)ns.lpst("lrjn", lpsq(int ), (int)807);
                if (!var4_1) ** GOTO lbl159
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)ns.lpst("lrjo", lpsq(int ), (int)808);
                if (!var4_1) ** GOTO lbl149
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ns.lpst("lrjp", lpsq(int ), (int)809);
                    if (!var4_1) ** GOTO lbl169
                    throw null;
                }
            }
            case 10: {
                do {
                    var3_2 /* !! */  = (int)ns.lpst("lrjq", lpsq(int ), (int)810);
                } while (!var4_1);
                throw null;
            }
            case 11: {
                var3_2 /* !! */  = (int)ns.lpst("lrjr", lpsq(int ), (int)811);
                if (!var4_1) break;
                throw null;
            }
            case 12: 
        }
        var3_2 /* !! */  = (int)ns.lpst("lrjs", lpsq(int ), (int)812);
        ** while (!var4_1)
lbl208:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqx() {
        ns.lpss[1000] = 957668212;
        ns.lpss[1001] = 1641697127;
        ns.lpss[1002] = -896033350;
        ns.lpss[1003] = 1547887604;
        ns.lpss[1004] = 1822366113;
        ns.lpss[1005] = 2123943417;
        ns.lpss[1006] = -580441531;
        ns.lpss[1007] = -754583639;
        ns.lpss[1008] = 1717358817;
        ns.lpss[1009] = -1263580603;
        ns.lpss[1010] = -864231988;
        ns.lpss[1011] = 1703089232;
        ns.lpss[1012] = 2087890825;
        ns.lpss[1013] = 286990232;
        ns.lpss[1014] = -75038757;
        ns.lpss[1015] = 726354200;
        ns.lpss[1016] = -1798231026;
        ns.lpss[1017] = -562731213;
        ns.lpss[1018] = -1438623757;
        ns.lpss[1019] = 1254390719;
        ns.lpss[1020] = 1021758278;
        ns.lpss[1021] = -1633925625;
        ns.lpss[1022] = 1076181148;
        ns.lpss[1023] = -730047963;
        ns.lpss[1024] = -919853180;
        ns.lpss[1025] = -763190705;
        ns.lpss[1026] = -882887125;
        ns.lpss[1027] = -78210434;
        ns.lpss[1028] = -1661732345;
        ns.lpss[1029] = 1024172273;
        ns.lpss[1030] = 1334687527;
        ns.lpss[1031] = 1094298485;
        ns.lpss[1032] = -325438772;
        ns.lpss[1033] = -1259613036;
        ns.lpss[1034] = -267787808;
        ns.lpss[1035] = 465735371;
        ns.lpss[1036] = -44547734;
        ns.lpss[1037] = 621641839;
        ns.lpss[1038] = -1891196734;
        ns.lpss[1039] = 555638499;
        ns.lpss[1040] = -816267274;
        ns.lpss[1041] = -2069294538;
        ns.lpss[1042] = 18263182;
        ns.lpss[1043] = 2070640531;
        ns.lpss[1044] = -1636374770;
        ns.lpss[1045] = 940198861;
        ns.lpss[1046] = -1955888372;
        ns.lpss[1047] = -647909359;
        ns.lpss[1048] = 1501555487;
        ns.lpss[1049] = 252684102;
        ns.lpss[1050] = 350199219;
        ns.lpss[1051] = -2056217076;
        ns.lpss[1052] = -1053419486;
        ns.lpss[1053] = 1385106018;
        ns.lpss[1054] = 2127643770;
        ns.lpss[1055] = -896236728;
        ns.lpss[1056] = -1406868869;
        ns.lpss[1057] = -1046695801;
        ns.lpss[1058] = -115884356;
        ns.lpss[1059] = 758533732;
        ns.lpss[1060] = -2103104905;
        ns.lpss[1061] = -105448989;
        ns.lpss[1062] = 1009871773;
        ns.lpss[1063] = -812295548;
        ns.lpss[1064] = -985100861;
        ns.lpss[1065] = 635200024;
        ns.lpss[1066] = -20354123;
        ns.lpss[1067] = 111620316;
        ns.lpss[1068] = 592439580;
        ns.lpss[1069] = 1508020172;
        ns.lpss[1070] = 1298960249;
        ns.lpss[1071] = -1230327088;
        ns.lpss[1072] = 1728127023;
        ns.lpss[1073] = 1035696697;
        ns.lpss[1074] = -2134407706;
        ns.lpss[1075] = 895322657;
        ns.lpss[1076] = -727949571;
        ns.lpss[1077] = 226487376;
        ns.lpss[1078] = -808757556;
        ns.lpss[1079] = -1239429026;
        ns.lpss[1080] = -1905236850;
        ns.lpss[1081] = 969604457;
        ns.lpss[1082] = -1650593741;
        ns.lpss[1083] = -921722265;
        ns.lpss[1084] = 1909875097;
        ns.lpss[1085] = 1830068353;
        ns.lpss[1086] = 752644744;
        ns.lpss[1087] = -856369175;
        ns.lpss[1088] = -1744140808;
        ns.lpss[1089] = 1306292254;
        ns.lpss[1090] = -182884502;
        ns.lpss[1091] = -1184220855;
        ns.lpss[1092] = -228752383;
        ns.lpss[1093] = 408578135;
        ns.lpss[1094] = 1587175594;
        ns.lpss[1095] = 663880332;
        ns.lpss[1096] = 1208371948;
        ns.lpss[1097] = -863602026;
        ns.lpss[1098] = -2117886767;
        ns.lpss[1099] = 257012544;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void move(class_243 var1_1) {
        block145: {
            block144: {
                block143: {
                    block142: {
                        block141: {
                            block140: {
                                block139: {
                                    block138: {
                                        var9_2 = ns.c;
                                        var8_3 /* !! */  = ns.b;
                                        var7_4 = ns.a;
                                        if (var9_2) {
                                            throw null;
lbl6:
                                            // 33 sources

                                            return;
                                        }
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        var2_5 = var1_1;
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        var2_5 = this.adjustMovementForSneaking(var2_5);
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        var3_6 = this.adjustMovementForCollisions(var2_5);
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        if (!(var3_6.method_1027() > ns.lpst("lrax", lqfo(int ), (int)257))) break block138;
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        this.pos = this.pos.method_1019(var3_6);
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        this.boundingBox = this.player.field_18065.method_30757(this.pos);
                                        if (var7_4) ** GOTO lbl6
                                    }
                                    if (var7_4 || var7_4) ** GOTO lbl6
                                    if (class_3532.method_20390((double)var1_1.field_1352, (double)var3_6.field_1352)) break block139;
                                    if (var7_4) ** GOTO lbl6
                                    v0 = ns.lpst("lray", lpsq(int ), (int)625);
                                    if (var9_2) {
                                        throw null;
                                    }
                                    break block140;
                                }
                                if (var7_4 || var7_4) ** GOTO lbl6
                                v0 = var4_7 = ns.lpst("lraz", lpsq(int ), (int)626);
                            }
                            if (var7_4 || var7_4) ** GOTO lbl6
                            if (class_3532.method_20390((double)var1_1.field_1350, (double)var3_6.field_1350)) break block141;
                            if (var7_4) ** GOTO lbl6
                            v1 = ns.lpst("lrba", lpsq(int ), (int)627);
                            if (var9_2) {
                                throw null;
                            }
                            break block142;
                        }
                        if (var7_4 || var7_4) ** GOTO lbl6
                        v1 = var5_8 = ns.lpst("lrbb", lpsq(int ), (int)628);
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var4_7 != false || var5_8 != false) {
                        v2 /* !! */  = ns.lpst("lrbc", lpsq(int ), (int)629);
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        this.horizontalCollision = ns.lpst("lrbd", lpsq(int ), (int)630);
                        v2 /* !! */  = (CallSite)this.horizontalCollision;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var1_1.field_1351 != var3_6.field_1351) {
                        v3 /* !! */  = ns.lpst("lrbe", lpsq(int ), (int)631);
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        this.verticalCollision = ns.lpst("lrbf", lpsq(int ), (int)632);
                        v3 /* !! */  = (CallSite)this.verticalCollision;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (this.verticalCollision && var1_1.field_1351 < 0.0) {
                        v4 /* !! */  = ns.lpst("lrbg", lpsq(int ), (int)633);
                        if (var9_2) {
                            throw null;
                        }
                    } else {
                        this.onGround = ns.lpst("lrbh", lpsq(int ), (int)634);
                        v4 /* !! */  = (CallSite)this.onGround;
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (this.isTouchingWater()) break block143;
                    if (var7_4 || var7_4) ** GOTO lbl6
                    this.checkWaterState();
                    if (var7_4) ** GOTO lbl6
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                if (!this.onGround) break block144;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.onLanding();
                if (var7_4) ** GOTO lbl6
                if (var9_2) {
                    throw null;
                }
                break block145;
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            if (!(var1_1.field_1351 < 0.0)) break block145;
            if (var7_4 || var7_4) ** GOTO lbl6
            this.fallDistance -= (float)var1_1.field_1351;
            if (var7_4) ** GOTO lbl6
        }
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                var6_9 = this.velocity;
                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.horizontalCollision) ** GOTO lbl100
                if (var7_4) ** GOTO lbl6
                if (!this.verticalCollision) ** GOTO lbl121
                if (var7_4) ** GOTO lbl6
lbl100:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (var4_7 != false) {
                    v5 = 0.0;
                    if (var9_2) {
                        throw null;
                    }
                } else {
                    v5 = var6_9.field_1352;
                }
                if (this.onGround) {
                    v6 = 0.0;
                    if (var9_2) {
                        throw null;
                    }
                } else {
                    v6 = var6_9.field_1351;
                }
                if (var5_8 != false) {
                    v7 = 0.0;
                    if (var9_2) {
                        throw null;
                    }
                } else {
                    v7 = var6_9.field_1350;
                }
                this.velocity = new class_243(v5, v6, v7);
                if (var7_4) ** GOTO lbl6
lbl121:
                // 2 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
lbl124:
            // 2 sources

            case 0: {
                do {
                    var8_3 /* !! */  = (int)ns.lpst("lrbi", lpsq(int ), (int)635);
                } while (!var9_2);
                throw null;
            }
lbl129:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)ns.lpst("lrbj", lpsq(int ), (int)636);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 2: {
                var8_3 /* !! */  = (int)ns.lpst("lrbk", lpsq(int ), (int)637);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 3: {
                var8_3 /* !! */  = (int)ns.lpst("lrbl", lpsq(int ), (int)638);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl144:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)ns.lpst("lrbm", lpsq(int ), (int)639);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl149:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)ns.lpst("lrbn", lpsq(int ), (int)640);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl154:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)ns.lpst("lrbo", lpsq(int ), (int)641);
                if (!var9_2) ** GOTO lbl124
                throw null;
            }
lbl158:
            // 3 sources

            case 7: {
                var8_3 /* !! */  = (int)ns.lpst("lrbp", lpsq(int ), (int)642);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 8: {
                var8_3 /* !! */  = (int)ns.lpst("lrbq", lpsq(int ), (int)643);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl168:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)ns.lpst("lrbr", lpsq(int ), (int)644);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl173:
            // 2 sources

            case 10: {
                var8_3 /* !! */  = (int)ns.lpst("lrbs", lpsq(int ), (int)645);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl178:
            // 3 sources

            case 11: {
                var8_3 /* !! */  = (int)ns.lpst("lrbt", lpsq(int ), (int)646);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl183:
            // 2 sources

            case 12: {
                var8_3 /* !! */  = (int)ns.lpst("lrbu", lpsq(int ), (int)647);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl188:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)ns.lpst("lrbv", lpsq(int ), (int)648);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl193:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)ns.lpst("lrbw", lpsq(int ), (int)649);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 15: {
                var8_3 /* !! */  = (int)ns.lpst("lrbx", lpsq(int ), (int)650);
                if (!var9_2) ** GOTO lbl178
                throw null;
            }
lbl202:
            // 3 sources

            case 16: {
                var8_3 /* !! */  = (int)ns.lpst("lrby", lpsq(int ), (int)651);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl207:
            // 2 sources

            case 17: {
                var8_3 /* !! */  = (int)ns.lpst("lrbz", lpsq(int ), (int)652);
                if (!var9_2) ** GOTO lbl193
                throw null;
            }
lbl211:
            // 2 sources

            case 18: {
                var8_3 /* !! */  = (int)ns.lpst("lrca", lpsq(int ), (int)653);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl216:
            // 3 sources

            case 19: {
                do {
                    var8_3 /* !! */  = (int)ns.lpst("lrcb", lpsq(int ), (int)654);
                } while (!var9_2);
                throw null;
            }
lbl221:
            // 2 sources

            case 20: {
                var8_3 /* !! */  = (int)ns.lpst("lrcc", lpsq(int ), (int)655);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl226:
            // 2 sources

            case 21: {
                var8_3 /* !! */  = (int)ns.lpst("lrcd", lpsq(int ), (int)656);
                if (!var9_2) ** GOTO lbl207
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)ns.lpst("lrce", lpsq(int ), (int)657);
                if (!var9_2) ** GOTO lbl149
                throw null;
            }
lbl234:
            // 2 sources

            case 23: {
                var8_3 /* !! */  = (int)ns.lpst("lrcf", lpsq(int ), (int)658);
                if (!var9_2) ** GOTO lbl173
                throw null;
            }
            case 24: {
                var8_3 /* !! */  = (int)ns.lpst("lrcg", lpsq(int ), (int)659);
                if (!var9_2) ** GOTO lbl221
                throw null;
            }
lbl242:
            // 4 sources

            case 25: {
                var8_3 /* !! */  = (int)ns.lpst("lrch", lpsq(int ), (int)660);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 26: {
                var8_3 /* !! */  = (int)ns.lpst("lrci", lpsq(int ), (int)661);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 27: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var8_3 /* !! */  = (int)ns.lpst("lrcj", lpsq(int ), (int)662);
                    if (!var9_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl257:
            // 3 sources

            case 28: {
                var8_3 /* !! */  = (int)ns.lpst("lrck", lpsq(int ), (int)663);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 29: {
                do {
                    var8_3 /* !! */  = (int)ns.lpst("lrcl", lpsq(int ), (int)664);
                } while (!var9_2);
                throw null;
            }
            case 30: {
                var8_3 /* !! */  = (int)ns.lpst("lrcm", lpsq(int ), (int)665);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl272:
            // 4 sources

            case 31: {
                var8_3 /* !! */  = (int)ns.lpst("lrcn", lpsq(int ), (int)666);
                if (!var9_2) ** GOTO lbl154
                throw null;
            }
lbl276:
            // 2 sources

            case 32: {
                var8_3 /* !! */  = (int)ns.lpst("lrco", lpsq(int ), (int)667);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
            case 33: {
                var8_3 /* !! */  = (int)ns.lpst("lrcp", lpsq(int ), (int)668);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl286:
            // 2 sources

            case 34: {
                var8_3 /* !! */  = (int)ns.lpst("lrcq", lpsq(int ), (int)669);
                if (!var9_2) ** GOTO lbl242
                throw null;
            }
            case 35: {
                var8_3 /* !! */  = (int)ns.lpst("lrcr", lpsq(int ), (int)670);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 36: {
                var8_3 /* !! */  = (int)ns.lpst("lrcs", lpsq(int ), (int)671);
                if (!var9_2) ** GOTO lbl211
                throw null;
            }
lbl299:
            // 3 sources

            case 37: {
                var8_3 /* !! */  = (int)ns.lpst("lrct", lpsq(int ), (int)672);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
            case 38: {
                var8_3 /* !! */  = (int)ns.lpst("lrcu", lpsq(int ), (int)673);
                if (!var9_2) ** GOTO lbl272
                throw null;
            }
lbl308:
            // 2 sources

            case 39: {
                var8_3 /* !! */  = (int)ns.lpst("lrcv", lpsq(int ), (int)674);
                if (!var9_2) ** GOTO lbl272
                throw null;
            }
            case 40: {
                var8_3 /* !! */  = (int)ns.lpst("lrcw", lpsq(int ), (int)675);
                if (!var9_2) ** GOTO lbl188
                throw null;
            }
lbl316:
            // 3 sources

            case 41: {
                var8_3 /* !! */  = (int)ns.lpst("lrcx", lpsq(int ), (int)676);
                if (!var9_2) ** GOTO lbl216
                throw null;
            }
            case 42: {
                var8_3 /* !! */  = (int)ns.lpst("lrcy", lpsq(int ), (int)677);
                if (!var9_2) ** GOTO lbl202
                throw null;
            }
            case 43: {
                var8_3 /* !! */  = (int)ns.lpst("lrcz", lpsq(int ), (int)678);
                if (!var9_2) ** GOTO lbl242
                throw null;
            }
lbl328:
            // 2 sources

            case 44: {
                var8_3 /* !! */  = (int)ns.lpst("lrda", lpsq(int ), (int)679);
                if (!var9_2) ** GOTO lbl257
                throw null;
            }
lbl332:
            // 2 sources

            case 45: {
                do {
                    var8_3 /* !! */  = (int)ns.lpst("lrdb", lpsq(int ), (int)680);
                } while (!var9_2);
                throw null;
            }
lbl337:
            // 2 sources

            case 46: {
                var8_3 /* !! */  = (int)ns.lpst("lrdc", lpsq(int ), (int)681);
                if (!var9_2) ** GOTO lbl202
                throw null;
            }
lbl341:
            // 2 sources

            case 47: {
                var8_3 /* !! */  = (int)ns.lpst("lrdd", lpsq(int ), (int)682);
                if (!var9_2) ** GOTO lbl242
                throw null;
            }
lbl345:
            // 3 sources

            case 48: {
                var8_3 /* !! */  = (int)ns.lpst("lrde", lpsq(int ), (int)683);
                if (!var9_2) ** GOTO lbl129
                throw null;
            }
lbl349:
            // 4 sources

            case 49: {
                var8_3 /* !! */  = (int)ns.lpst("lrdf", lpsq(int ), (int)684);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 50: {
                var8_3 /* !! */  = (int)ns.lpst("lrdg", lpsq(int ), (int)685);
                if (!var9_2) ** GOTO lbl276
                throw null;
            }
lbl358:
            // 2 sources

            case 51: {
                var8_3 /* !! */  = (int)ns.lpst("lrdh", lpsq(int ), (int)686);
                if (!var9_2) ** GOTO lbl144
                throw null;
            }
lbl362:
            // 3 sources

            case 52: {
                var8_3 /* !! */  = (int)ns.lpst("lrdi", lpsq(int ), (int)687);
                if (!var9_2) ** GOTO lbl349
                throw null;
            }
            case 53: {
                var8_3 /* !! */  = (int)ns.lpst("lrdj", lpsq(int ), (int)688);
                if (!var9_2) ** GOTO lbl358
                throw null;
            }
lbl370:
            // 2 sources

            case 54: {
                var8_3 /* !! */  = (int)ns.lpst("lrdk", lpsq(int ), (int)689);
                if (!var9_2) ** GOTO lbl226
                throw null;
            }
lbl374:
            // 2 sources

            case 55: {
                var8_3 /* !! */  = (int)ns.lpst("lrdl", lpsq(int ), (int)690);
                if (!var9_2) ** GOTO lbl183
                throw null;
            }
lbl378:
            // 2 sources

            case 56: {
                var8_3 /* !! */  = (int)ns.lpst("lrdm", lpsq(int ), (int)691);
                if (!var9_2) ** GOTO lbl332
                throw null;
            }
            case 57: {
                var8_3 /* !! */  = (int)ns.lpst("lrdn", lpsq(int ), (int)692);
                if (!var9_2) ** GOTO lbl234
                throw null;
            }
            case 58: 
        }
        var8_3 /* !! */  = (int)ns.lpst("lrdo", lpsq(int ), (int)693);
        ** while (!var9_2)
lbl389:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqd() {
        ns.lpsr[800] = 1141041265;
        ns.lpsr[801] = 367089324;
        ns.lpsr[802] = -787020758;
        ns.lpsr[803] = 565331403;
        ns.lpsr[804] = -181927202;
        ns.lpsr[805] = 1163847680;
        ns.lpsr[806] = -2087482828;
        ns.lpsr[807] = -526921780;
        ns.lpsr[808] = -17702582;
        ns.lpsr[809] = 168029273;
        ns.lpsr[810] = -1025030408;
        ns.lpsr[811] = -896799216;
        ns.lpsr[812] = -1484990719;
        ns.lpsr[813] = -1763798598;
        ns.lpsr[814] = -15019772;
        ns.lpsr[815] = -927209679;
        ns.lpsr[816] = 1318779845;
        ns.lpsr[817] = 703967494;
        ns.lpsr[818] = -1907299023;
        ns.lpsr[819] = 2011507267;
        ns.lpsr[820] = -470649843;
        ns.lpsr[821] = 95572255;
        ns.lpsr[822] = -1116635082;
        ns.lpsr[823] = -360048138;
        ns.lpsr[824] = -804772157;
        ns.lpsr[825] = 688244658;
        ns.lpsr[826] = -862187529;
        ns.lpsr[827] = 2108421334;
        ns.lpsr[828] = 2046144367;
        ns.lpsr[829] = 684226210;
        ns.lpsr[830] = -1873479123;
        ns.lpsr[831] = 600810067;
        ns.lpsr[832] = 1289281909;
        ns.lpsr[833] = -1843446378;
        ns.lpsr[834] = -507322681;
        ns.lpsr[835] = -477842542;
        ns.lpsr[836] = 1981893076;
        ns.lpsr[837] = -796343005;
        ns.lpsr[838] = 1084412479;
        ns.lpsr[839] = 1781589793;
        ns.lpsr[840] = 576181342;
        ns.lpsr[841] = 830700656;
        ns.lpsr[842] = 143709633;
        ns.lpsr[843] = -1091655848;
        ns.lpsr[844] = 899030985;
        ns.lpsr[845] = 83201059;
        ns.lpsr[846] = -1652013044;
        ns.lpsr[847] = -953533470;
        ns.lpsr[848] = 288827180;
        ns.lpsr[849] = -1039892401;
        ns.lpsr[850] = -2002680717;
        ns.lpsr[851] = -2013328321;
        ns.lpsr[852] = -182226596;
        ns.lpsr[853] = -983556512;
        ns.lpsr[854] = -2003887390;
        ns.lpsr[855] = -1699789994;
        ns.lpsr[856] = -211662491;
        ns.lpsr[857] = 1111154480;
        ns.lpsr[858] = 1844114410;
        ns.lpsr[859] = -637824017;
        ns.lpsr[860] = 414455825;
        ns.lpsr[861] = 742894266;
        ns.lpsr[862] = -1414911040;
        ns.lpsr[863] = -418855318;
        ns.lpsr[864] = -1022393233;
        ns.lpsr[865] = 2039853724;
        ns.lpsr[866] = -1715765398;
        ns.lpsr[867] = -2130019648;
        ns.lpsr[868] = 27348207;
        ns.lpsr[869] = 1074620060;
        ns.lpsr[870] = 2122417893;
        ns.lpsr[871] = -1483190102;
        ns.lpsr[872] = 483542130;
        ns.lpsr[873] = -410211984;
        ns.lpsr[874] = -1814912333;
        ns.lpsr[875] = -610485263;
        ns.lpsr[876] = 71839641;
        ns.lpsr[877] = 1948390811;
        ns.lpsr[878] = 1962324247;
        ns.lpsr[879] = -305027431;
        ns.lpsr[880] = 1974798269;
        ns.lpsr[881] = -1852357637;
        ns.lpsr[882] = -146227382;
        ns.lpsr[883] = -1154413668;
        ns.lpsr[884] = -1161841254;
        ns.lpsr[885] = 1229963921;
        ns.lpsr[886] = -344243751;
        ns.lpsr[887] = -2101574979;
        ns.lpsr[888] = 738753245;
        ns.lpsr[889] = -1717862248;
        ns.lpsr[890] = 279985911;
        ns.lpsr[891] = 1484554806;
        ns.lpsr[892] = 592685442;
        ns.lpsr[893] = 629504035;
        ns.lpsr[894] = -1580582158;
        ns.lpsr[895] = -1579359290;
        ns.lpsr[896] = -1270869729;
        ns.lpsr[897] = -1087364628;
        ns.lpsr[898] = -1807405251;
        ns.lpsr[899] = 1330705533;
    }

    private static /* synthetic */ void ltrd() {
        ns.lpss[1600] = -1322220960;
        ns.lpss[1601] = 687698030;
        ns.lpss[1602] = 850420774;
        ns.lpss[1603] = -2113892368;
        ns.lpss[1604] = 866982249;
        ns.lpss[1605] = -462770195;
        ns.lpss[1606] = 460367199;
        ns.lpss[1607] = 355519752;
        ns.lpss[1608] = 1644048640;
        ns.lpss[1609] = -884307812;
        ns.lpss[1610] = -245581818;
        ns.lpss[1611] = 2058078855;
        ns.lpss[1612] = -209084642;
        ns.lpss[1613] = 2123846285;
        ns.lpss[1614] = -2077538453;
        ns.lpss[1615] = 50691794;
        ns.lpss[1616] = -1962062269;
        ns.lpss[1617] = -384226796;
        ns.lpss[1618] = 134560594;
        ns.lpss[1619] = -2144186709;
        ns.lpss[1620] = -1723096025;
        ns.lpss[1621] = 1578203013;
        ns.lpss[1622] = 493282240;
        ns.lpss[1623] = 158440809;
        ns.lpss[1624] = 70197063;
        ns.lpss[1625] = -1588151110;
        ns.lpss[1626] = -362823845;
        ns.lpss[1627] = -1641092055;
        ns.lpss[1628] = -1273316301;
        ns.lpss[1629] = 1009772567;
        ns.lpss[1630] = -122575456;
        ns.lpss[1631] = -1270856884;
        ns.lpss[1632] = 925501459;
        ns.lpss[1633] = 411789794;
        ns.lpss[1634] = -1743970138;
        ns.lpss[1635] = 2121415755;
        ns.lpss[1636] = 1683003296;
        ns.lpss[1637] = -309586751;
        ns.lpss[1638] = 1387001796;
        ns.lpss[1639] = 1405599407;
        ns.lpss[1640] = -78046899;
        ns.lpss[1641] = 589157904;
        ns.lpss[1642] = -1713744595;
        ns.lpss[1643] = 280641477;
        ns.lpss[1644] = -1678707572;
        ns.lpss[1645] = 2097998978;
        ns.lpss[1646] = 1631649156;
        ns.lpss[1647] = 1136005629;
        ns.lpss[1648] = 2143782234;
        ns.lpss[1649] = 186420144;
        ns.lpss[1650] = -1856719708;
        ns.lpss[1651] = -732600047;
        ns.lpss[1652] = 274255911;
        ns.lpss[1653] = -1059389375;
        ns.lpss[1654] = -618548636;
        ns.lpss[1655] = 2112146557;
        ns.lpss[1656] = -1437547959;
        ns.lpss[1657] = 578626921;
        ns.lpss[1658] = -121771129;
        ns.lpss[1659] = 446302199;
        ns.lpss[1660] = -1285823155;
        ns.lpss[1661] = -507649573;
        ns.lpss[1662] = 370900828;
        ns.lpss[1663] = -1687620409;
        ns.lpss[1664] = 1663097587;
        ns.lpss[1665] = -1310636928;
        ns.lpss[1666] = -1076438305;
        ns.lpss[1667] = 1832106073;
        ns.lpss[1668] = 1216387579;
        ns.lpss[1669] = 347697401;
        ns.lpss[1670] = 754365790;
        ns.lpss[1671] = -442810425;
        ns.lpss[1672] = -476732147;
        ns.lpss[1673] = -1788167600;
        ns.lpss[1674] = 1698670916;
        ns.lpss[1675] = 1861750139;
        ns.lpss[1676] = 1545105306;
        ns.lpss[1677] = 968939644;
        ns.lpss[1678] = 1068530285;
        ns.lpss[1679] = -46364543;
        ns.lpss[1680] = -451199469;
        ns.lpss[1681] = -2140406440;
        ns.lpss[1682] = -2024417653;
        ns.lpss[1683] = 1722611726;
        ns.lpss[1684] = 1416904615;
        ns.lpss[1685] = -1034988912;
        ns.lpss[1686] = 887214904;
        ns.lpss[1687] = -662698017;
        ns.lpss[1688] = 813530106;
        ns.lpss[1689] = 2135563784;
        ns.lpss[1690] = -238698282;
        ns.lpss[1691] = -2127929161;
        ns.lpss[1692] = -26703961;
        ns.lpss[1693] = -661848171;
        ns.lpss[1694] = 1012019299;
        ns.lpss[1695] = -1332394399;
        ns.lpss[1696] = -1912907914;
        ns.lpss[1697] = 270030801;
        ns.lpss[1698] = -1438614506;
        ns.lpss[1699] = 13920958;
    }

    private static /* synthetic */ void ltpv() {
        ns.lpsr[0] = -1968859369;
        ns.lpsr[1] = 594840767;
        ns.lpsr[2] = 1106695075;
        ns.lpsr[3] = -120439910;
        ns.lpsr[4] = -1818404049;
        ns.lpsr[5] = -1908873329;
        ns.lpsr[6] = 474395484;
        ns.lpsr[7] = -1069597181;
        ns.lpsr[8] = -1296255404;
        ns.lpsr[9] = 1001765090;
        ns.lpsr[10] = 682927317;
        ns.lpsr[11] = 1493980895;
        ns.lpsr[12] = 1818986084;
        ns.lpsr[13] = 915318039;
        ns.lpsr[14] = 702907621;
        ns.lpsr[15] = -1366321653;
        ns.lpsr[16] = 1094691109;
        ns.lpsr[17] = -1563510595;
        ns.lpsr[18] = 632134714;
        ns.lpsr[19] = -1088994630;
        ns.lpsr[20] = -158078183;
        ns.lpsr[21] = 1688848828;
        ns.lpsr[22] = 1037390323;
        ns.lpsr[23] = -293414600;
        ns.lpsr[24] = -676606597;
        ns.lpsr[25] = 649236966;
        ns.lpsr[26] = 1392524808;
        ns.lpsr[27] = -1634740793;
        ns.lpsr[28] = -155012820;
        ns.lpsr[29] = 621555010;
        ns.lpsr[30] = -1236192003;
        ns.lpsr[31] = -1786693378;
        ns.lpsr[32] = 1004410750;
        ns.lpsr[33] = 1682560202;
        ns.lpsr[34] = 580528380;
        ns.lpsr[35] = 1793277518;
        ns.lpsr[36] = 1215688958;
        ns.lpsr[37] = -16406360;
        ns.lpsr[38] = -313091792;
        ns.lpsr[39] = -668900534;
        ns.lpsr[40] = -1771904452;
        ns.lpsr[41] = 1503377570;
        ns.lpsr[42] = 1355018025;
        ns.lpsr[43] = 2126268741;
        ns.lpsr[44] = 584231833;
        ns.lpsr[45] = 1120904941;
        ns.lpsr[46] = -607973048;
        ns.lpsr[47] = 384726432;
        ns.lpsr[48] = -566501021;
        ns.lpsr[49] = 267546225;
        ns.lpsr[50] = -1761678233;
        ns.lpsr[51] = 1889272133;
        ns.lpsr[52] = -2074059581;
        ns.lpsr[53] = -893235239;
        ns.lpsr[54] = -1206413642;
        ns.lpsr[55] = 1746343502;
        ns.lpsr[56] = -704589259;
        ns.lpsr[57] = 657303006;
        ns.lpsr[58] = 1810918414;
        ns.lpsr[59] = 140346473;
        ns.lpsr[60] = 626922123;
        ns.lpsr[61] = 369158329;
        ns.lpsr[62] = -955493452;
        ns.lpsr[63] = 1515054352;
        ns.lpsr[64] = 1883231412;
        ns.lpsr[65] = 1658779366;
        ns.lpsr[66] = 2050240627;
        ns.lpsr[67] = -795388436;
        ns.lpsr[68] = -634536550;
        ns.lpsr[69] = 1865604531;
        ns.lpsr[70] = 844538148;
        ns.lpsr[71] = -268475232;
        ns.lpsr[72] = -1722846727;
        ns.lpsr[73] = 1348700578;
        ns.lpsr[74] = 555756263;
        ns.lpsr[75] = 1548322020;
        ns.lpsr[76] = -2145330037;
        ns.lpsr[77] = -1333711145;
        ns.lpsr[78] = 491838851;
        ns.lpsr[79] = 92709286;
        ns.lpsr[80] = -1134396741;
        ns.lpsr[81] = -1658031937;
        ns.lpsr[82] = 1080823320;
        ns.lpsr[83] = -632618708;
        ns.lpsr[84] = 1874912148;
        ns.lpsr[85] = 1969038426;
        ns.lpsr[86] = 1752248450;
        ns.lpsr[87] = 731811717;
        ns.lpsr[88] = 1100213350;
        ns.lpsr[89] = 1645031590;
        ns.lpsr[90] = 635503965;
        ns.lpsr[91] = 1685496718;
        ns.lpsr[92] = -301977011;
        ns.lpsr[93] = 2070270700;
        ns.lpsr[94] = 1735673353;
        ns.lpsr[95] = -696119697;
        ns.lpsr[96] = 992838533;
        ns.lpsr[97] = 2012933707;
        ns.lpsr[98] = 97886911;
        ns.lpsr[99] = -1360179260;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 adjustMovementForSneaking(class_243 var1_1) {
        block167: {
            block175: {
                block174: {
                    block166: {
                        block165: {
                            block164: {
                                var10_2 = ns.c;
                                var9_3 /* !! */  = ns.b;
                                var8_4 = ns.a;
                                if (var10_2) {
                                    throw null;
lbl6:
                                    // 47 sources

                                    return null;
                                }
                                if (var8_4 || var8_4) ** GOTO lbl6
                                if (!(var1_1.field_1351 <= 0.0)) break block167;
                                if (var8_4) ** GOTO lbl6
                                if (!this.method_30263()) break block167;
                                if (var8_4 || var8_4) ** GOTO lbl6
                                var2_5 = var1_1.field_1352;
                                if (var8_4 || var8_4) ** GOTO lbl6
                                var4_6 = var1_1.field_1350;
                                if (var8_4 || var8_4) ** GOTO lbl6
                                var6_7 = ns.lpst("lrrv", lqfo(int ), (int)401);
                                if (var8_4) ** GOTO lbl6
                                do {
                                    block168: {
                                        if (var8_4 || var8_4) ** GOTO lbl6
                                        if (var2_5 == 0.0) break block164;
                                        if (var8_4) ** GOTO lbl6
                                        if (!this.player.method_73183().method_8587((class_1297)this.player, this.boundingBox.method_989(var2_5, (double)ns.lpst("lrrw", lqfo(int ), (int)402), 0.0))) break block164;
                                        if (var8_4 || var8_4) ** GOTO lbl6
                                        if (!(var2_5 < var6_7)) break block168;
                                        if (var8_4) ** GOTO lbl6
                                        if (!(var2_5 >= -var6_7)) break block168;
                                        if (var8_4 || var8_4) ** GOTO lbl6
                                        var2_5 = 0.0;
                                        if (var8_4 || var8_4) ** GOTO lbl6
                                        if (var10_2) {
                                            throw null;
                                        }
                                        break block164;
                                    }
                                    if (var8_4 || var8_4) ** GOTO lbl6
                                    if (var2_5 > 0.0) {
                                        v0 = -var6_7;
                                        if (var10_2) {
                                            throw null;
                                        }
                                    } else {
                                        v0 = var6_7;
                                    }
                                    var2_5 += v0;
                                    if (var8_4) ** GOTO lbl6
                                } while (!var10_2);
                                throw null;
                            }
                            do {
                                block169: {
                                    if (var8_4 || var8_4) ** GOTO lbl6
                                    if (var4_6 == 0.0) break block165;
                                    if (var8_4) ** GOTO lbl6
                                    if (!this.player.method_73183().method_8587((class_1297)this.player, this.boundingBox.method_989(0.0, (double)ns.lpst("lrrx", lqfo(int ), (int)403), var4_6))) break block165;
                                    if (var8_4 || var8_4) ** GOTO lbl6
                                    if (!(var4_6 < var6_7)) break block169;
                                    if (var8_4) ** GOTO lbl6
                                    if (!(var4_6 >= -var6_7)) break block169;
                                    if (var8_4 || var8_4) ** GOTO lbl6
                                    var4_6 = 0.0;
                                    if (var8_4 || var8_4) ** GOTO lbl6
                                    if (var10_2) {
                                        throw null;
                                    }
                                    break block165;
                                }
                                if (var8_4 || var8_4) ** GOTO lbl6
                                if (var4_6 > 0.0) {
                                    v1 = -var6_7;
                                    if (var10_2) {
                                        throw null;
                                    }
                                } else {
                                    v1 = var6_7;
                                }
                                var4_6 += v1;
                                if (var8_4) ** GOTO lbl6
                            } while (!var10_2);
                            throw null;
                        }
                        do {
                            block173: {
                                block171: {
                                    block172: {
                                        block170: {
                                            if (var8_4 || var8_4) ** GOTO lbl6
                                            if (var2_5 == 0.0) break block166;
                                            if (var8_4) ** GOTO lbl6
                                            if (var4_6 == 0.0) break block166;
                                            if (var8_4) ** GOTO lbl6
                                            if (!this.player.method_73183().method_8587((class_1297)this.player, this.boundingBox.method_989(var2_5, (double)ns.lpst("lrry", lqfo(int ), (int)404), var4_6))) break block166;
                                            if (var8_4 || var8_4) ** GOTO lbl6
                                            if (!(var2_5 < var6_7)) break block170;
                                            if (var8_4) ** GOTO lbl6
                                            if (!(var2_5 >= -var6_7)) break block170;
                                            if (var8_4) ** GOTO lbl6
                                            v2 = 0.0;
                                            if (var10_2) {
                                                throw null;
                                            }
                                            break block171;
                                        }
                                        if (var8_4 || var8_4) ** GOTO lbl6
                                        if (!(var2_5 > 0.0)) break block172;
                                        if (var8_4) ** GOTO lbl6
                                        v2 = var2_5 - var6_7;
                                        if (var10_2) {
                                            throw null;
                                        }
                                        break block171;
                                    }
                                    if (var8_4 || var8_4) ** GOTO lbl6
                                    v2 = var2_5 = var2_5 + var6_7;
                                }
                                if (var8_4 || var8_4) ** GOTO lbl6
                                if (!(var4_6 < var6_7)) break block173;
                                if (var8_4) ** GOTO lbl6
                                if (!(var4_6 >= -var6_7)) break block173;
                                if (var8_4 || var8_4) ** GOTO lbl6
                                var4_6 = 0.0;
                                if (var8_4 || var8_4) ** GOTO lbl6
                                if (var10_2) {
                                    throw null;
                                }
                                break block166;
                            }
                            if (var8_4 || var8_4) ** GOTO lbl6
                            if (var4_6 > 0.0) {
                                v3 = -var6_7;
                                if (var10_2) {
                                    throw null;
                                }
                            } else {
                                v3 = var6_7;
                            }
                            var4_6 += v3;
                            if (var8_4) ** GOTO lbl6
                        } while (!var10_2);
                        throw null;
                    }
                    if (var8_4 || var8_4) ** GOTO lbl6
                    if (var1_1.field_1352 != var2_5) break block174;
                    if (var8_4) ** GOTO lbl6
                    if (var1_1.field_1350 == var4_6) break block175;
                    if (var8_4) ** GOTO lbl6
                }
                if (var8_4 || var8_4) ** GOTO lbl6
                this.clipLedged = ns.lpst("lrrz", lpsq(int ), (int)921);
                if (var8_4) ** GOTO lbl6
            }
            if (var8_4 || var8_4) ** GOTO lbl6
            if (!this.shouldClipAtLedge()) break block167;
            if (var8_4 || var8_4) ** GOTO lbl6
            var1_1 = new class_243(var2_5, var1_1.field_1351, var4_6);
            if (var8_4) ** GOTO lbl6
        }
        if (var8_4) ** GOTO lbl6
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_4) ** break;
                ** continue;
                return var1_1;
            }
lbl149:
            // 2 sources

            case 0: {
                var9_3 /* !! */  = (int)ns.lpst("lrsa", lpsq(int ), (int)922);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 1: {
                var9_3 /* !! */  = (int)ns.lpst("lrsb", lpsq(int ), (int)923);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl159:
            // 3 sources

            case 2: {
                var9_3 /* !! */  = (int)ns.lpst("lrsc", lpsq(int ), (int)924);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl164:
            // 3 sources

            case 3: {
                var9_3 /* !! */  = (int)ns.lpst("lrsd", lpsq(int ), (int)925);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl169:
            // 2 sources

            case 4: {
                var9_3 /* !! */  = (int)ns.lpst("lrse", lpsq(int ), (int)926);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl174:
            // 2 sources

            case 5: {
                var9_3 /* !! */  = (int)ns.lpst("lrsf", lpsq(int ), (int)927);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
lbl179:
            // 2 sources

            case 6: {
                var9_3 /* !! */  = (int)ns.lpst("lrsg", lpsq(int ), (int)928);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 7: {
                var9_3 /* !! */  = (int)ns.lpst("lrsh", lpsq(int ), (int)929);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl189:
            // 3 sources

            case 8: {
                var9_3 /* !! */  = (int)ns.lpst("lrsi", lpsq(int ), (int)930);
                if (!var10_2) ** GOTO lbl179
                throw null;
            }
lbl193:
            // 3 sources

            case 9: {
                var9_3 /* !! */  = (int)ns.lpst("lrsj", lpsq(int ), (int)931);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl461
            }
lbl198:
            // 3 sources

            case 10: {
                var9_3 /* !! */  = (int)ns.lpst("lrsk", lpsq(int ), (int)932);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 11: {
                var9_3 /* !! */  = (int)ns.lpst("lrsl", lpsq(int ), (int)933);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 12: {
                var9_3 /* !! */  = (int)ns.lpst("lrsm", lpsq(int ), (int)934);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl213:
            // 3 sources

            case 13: {
                var9_3 /* !! */  = (int)ns.lpst("lrsn", lpsq(int ), (int)935);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 14: {
                var9_3 /* !! */  = (int)ns.lpst("lrso", lpsq(int ), (int)936);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl223:
            // 3 sources

            case 15: {
                var9_3 /* !! */  = (int)ns.lpst("lrsp", lpsq(int ), (int)937);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl228:
            // 4 sources

            case 16: {
                var9_3 /* !! */  = (int)ns.lpst("lrsq", lpsq(int ), (int)938);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
            case 17: {
                var9_3 /* !! */  = (int)ns.lpst("lrsr", lpsq(int ), (int)939);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl409
            }
            case 18: {
                var9_3 /* !! */  = (int)ns.lpst("lrss", lpsq(int ), (int)940);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
            case 19: {
                var9_3 /* !! */  = (int)ns.lpst("lrst", lpsq(int ), (int)941);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
lbl248:
            // 4 sources

            case 20: {
                var9_3 /* !! */  = (int)ns.lpst("lrsu", lpsq(int ), (int)942);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
            case 21: {
                var9_3 /* !! */  = (int)ns.lpst("lrsv", lpsq(int ), (int)943);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl258:
            // 5 sources

            case 22: {
                var9_3 /* !! */  = (int)ns.lpst("lrsw", lpsq(int ), (int)944);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl263:
            // 2 sources

            case 23: {
                var9_3 /* !! */  = (int)ns.lpst("lrsx", lpsq(int ), (int)945);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl497
            }
lbl268:
            // 2 sources

            case 24: {
                var9_3 /* !! */  = (int)ns.lpst("lrsy", lpsq(int ), (int)946);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl273:
            // 2 sources

            case 25: {
                var9_3 /* !! */  = (int)ns.lpst("lrsz", lpsq(int ), (int)947);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl477
            }
            case 26: {
                var9_3 /* !! */  = (int)ns.lpst("lrta", lpsq(int ), (int)948);
                if (!var10_2) ** GOTO lbl198
                throw null;
            }
            case 27: {
                var9_3 /* !! */  = (int)ns.lpst("lrtb", lpsq(int ), (int)949);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 28: {
                var9_3 /* !! */  = (int)ns.lpst("lrtc", lpsq(int ), (int)950);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl292:
            // 4 sources

            case 29: {
                var9_3 /* !! */  = (int)ns.lpst("lrtd", lpsq(int ), (int)951);
                if (!var10_2) ** GOTO lbl263
                throw null;
            }
lbl296:
            // 2 sources

            case 30: {
                var9_3 /* !! */  = (int)ns.lpst("lrte", lpsq(int ), (int)952);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
            case 31: {
                var9_3 /* !! */  = (int)ns.lpst("lrtf", lpsq(int ), (int)953);
                if (!var10_2) ** GOTO lbl258
                throw null;
            }
            case 32: {
                var9_3 /* !! */  = (int)ns.lpst("lrtg", lpsq(int ), (int)954);
                if (!var10_2) ** GOTO lbl258
                throw null;
            }
lbl309:
            // 2 sources

            case 33: {
                var9_3 /* !! */  = (int)ns.lpst("lrth", lpsq(int ), (int)955);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl473
            }
lbl314:
            // 2 sources

            case 34: {
                var9_3 /* !! */  = (int)ns.lpst("lrti", lpsq(int ), (int)956);
                if (!var10_2) ** GOTO lbl248
                throw null;
            }
lbl318:
            // 3 sources

            case 35: {
                var9_3 /* !! */  = (int)ns.lpst("lrtj", lpsq(int ), (int)957);
                if (!var10_2) ** GOTO lbl159
                throw null;
            }
            case 36: {
                var9_3 /* !! */  = (int)ns.lpst("lrtk", lpsq(int ), (int)958);
                if (!var10_2) break;
                throw null;
            }
            case 37: {
                var9_3 /* !! */  = (int)ns.lpst("lrtl", lpsq(int ), (int)959);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl331:
            // 2 sources

            case 38: {
                var9_3 /* !! */  = (int)ns.lpst("lrtm", lpsq(int ), (int)960);
                if (!var10_2) ** GOTO lbl318
                throw null;
            }
            case 39: {
                var9_3 /* !! */  = (int)ns.lpst("lrtn", lpsq(int ), (int)961);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl395
            }
lbl340:
            // 3 sources

            case 40: {
                var9_3 /* !! */  = (int)ns.lpst("lrto", lpsq(int ), (int)962);
                if (!var10_2) ** GOTO lbl223
                throw null;
            }
lbl344:
            // 5 sources

            case 41: {
                var9_3 /* !! */  = (int)ns.lpst("lrtp", lpsq(int ), (int)963);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl489
            }
lbl349:
            // 2 sources

            case 42: {
                var9_3 /* !! */  = (int)ns.lpst("lrtq", lpsq(int ), (int)964);
                if (!var10_2) ** GOTO lbl169
                throw null;
            }
lbl353:
            // 2 sources

            case 43: {
                var9_3 /* !! */  = (int)ns.lpst("lrtr", lpsq(int ), (int)965);
                if (!var10_2) ** GOTO lbl198
                throw null;
            }
lbl357:
            // 2 sources

            case 44: {
                var9_3 /* !! */  = (int)ns.lpst("lrts", lpsq(int ), (int)966);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl362:
            // 2 sources

            case 45: {
                var9_3 /* !! */  = (int)ns.lpst("lrtt", lpsq(int ), (int)967);
                if (!var10_2) ** GOTO lbl189
                throw null;
            }
lbl366:
            // 2 sources

            case 46: {
                var9_3 /* !! */  = (int)ns.lpst("lrtu", lpsq(int ), (int)968);
                if (!var10_2) ** GOTO lbl228
                throw null;
            }
            case 47: {
                var9_3 /* !! */  = (int)ns.lpst("lrtv", lpsq(int ), (int)969);
                if (!var10_2) ** GOTO lbl258
                throw null;
            }
            case 48: {
                var9_3 /* !! */  = (int)ns.lpst("lrtw", lpsq(int ), (int)970);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl469
            }
            case 49: {
                var9_3 /* !! */  = (int)ns.lpst("lrtx", lpsq(int ), (int)971);
                if (!var10_2) ** GOTO lbl273
                throw null;
            }
lbl383:
            // 2 sources

            case 50: {
                var9_3 /* !! */  = (int)ns.lpst("lrty", lpsq(int ), (int)972);
                if (!var10_2) ** GOTO lbl228
                throw null;
            }
            case 51: {
                var9_3 /* !! */  = (int)ns.lpst("lrtz", lpsq(int ), (int)973);
                if (!var10_2) ** GOTO lbl174
                throw null;
            }
lbl391:
            // 2 sources

            case 52: {
                var9_3 /* !! */  = (int)ns.lpst("lrua", lpsq(int ), (int)974);
                if (!var10_2) ** GOTO lbl258
                throw null;
            }
lbl395:
            // 2 sources

            case 53: {
                var9_3 /* !! */  = (int)ns.lpst("lrub", lpsq(int ), (int)975);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl443
            }
            case 54: {
                var9_3 /* !! */  = (int)ns.lpst("lruc", lpsq(int ), (int)976);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl405:
            // 2 sources

            case 55: {
                var9_3 /* !! */  = (int)ns.lpst("lrud", lpsq(int ), (int)977);
                if (!var10_2) ** GOTO lbl213
                throw null;
            }
lbl409:
            // 2 sources

            case 56: {
                var9_3 /* !! */  = (int)ns.lpst("lrue", lpsq(int ), (int)978);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl497
            }
            case 57: {
                var9_3 /* !! */  = (int)ns.lpst("lruf", lpsq(int ), (int)979);
                if (!var10_2) ** GOTO lbl149
                throw null;
            }
            case 58: {
                var9_3 /* !! */  = (int)ns.lpst("lrug", lpsq(int ), (int)980);
                if (!var10_2) ** GOTO lbl292
                throw null;
            }
            case 59: {
                var9_3 /* !! */  = (int)ns.lpst("lruh", lpsq(int ), (int)981);
                if (!var10_2) ** GOTO lbl292
                throw null;
            }
            case 60: {
                var9_3 /* !! */  = (int)ns.lpst("lrui", lpsq(int ), (int)982);
                if (!var10_2) ** GOTO lbl340
                throw null;
            }
            case 61: {
                var9_3 /* !! */  = (int)ns.lpst("lruj", lpsq(int ), (int)983);
                if (!var10_2) ** GOTO lbl164
                throw null;
            }
lbl434:
            // 4 sources

            case 62: {
                var9_3 /* !! */  = (int)ns.lpst("lruk", lpsq(int ), (int)984);
                if (!var10_2) ** GOTO lbl318
                throw null;
            }
lbl438:
            // 3 sources

            case 63: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_3 /* !! */  = (int)ns.lpst("lrul", lpsq(int ), (int)985);
                    if (!var10_2) ** GOTO lbl344
                    throw null;
                }
            }
lbl443:
            // 2 sources

            case 64: {
                var9_3 /* !! */  = (int)ns.lpst("lrum", lpsq(int ), (int)986);
                if (!var10_2) ** GOTO lbl164
                throw null;
            }
lbl447:
            // 2 sources

            case 65: {
                var9_3 /* !! */  = (int)ns.lpst("lrun", lpsq(int ), (int)987);
                if (!var10_2) ** GOTO lbl213
                throw null;
            }
            case 66: {
                var9_3 /* !! */  = (int)ns.lpst("lruo", lpsq(int ), (int)988);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl497
            }
lbl456:
            // 3 sources

            case 67: {
                var9_3 /* !! */  = (int)ns.lpst("lrup", lpsq(int ), (int)989);
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl461:
            // 2 sources

            case 68: {
                var9_3 /* !! */  = (int)ns.lpst("lruq", lpsq(int ), (int)990);
                if (!var10_2) ** GOTO lbl292
                throw null;
            }
            case 69: {
                var9_3 /* !! */  = (int)ns.lpst("lrur", lpsq(int ), (int)991);
                if (!var10_2) ** GOTO lbl248
                throw null;
            }
lbl469:
            // 2 sources

            case 70: {
                var9_3 /* !! */  = (int)ns.lpst("lrus", lpsq(int ), (int)992);
                if (!var10_2) ** GOTO lbl434
                throw null;
            }
lbl473:
            // 3 sources

            case 71: {
                var9_3 /* !! */  = (int)ns.lpst("lrut", lpsq(int ), (int)993);
                if (!var10_2) ** GOTO lbl193
                throw null;
            }
lbl477:
            // 2 sources

            case 72: {
                var9_3 /* !! */  = (int)ns.lpst("lruu", lpsq(int ), (int)994);
                if (!var10_2) ** GOTO lbl159
                throw null;
            }
            case 73: {
                var9_3 /* !! */  = (int)ns.lpst("lruv", lpsq(int ), (int)995);
                if (!var10_2) ** GOTO lbl331
                throw null;
            }
lbl485:
            // 3 sources

            case 74: {
                var9_3 /* !! */  = (int)ns.lpst("lruw", lpsq(int ), (int)996);
                if (!var10_2) ** GOTO lbl473
                throw null;
            }
lbl489:
            // 2 sources

            case 75: {
                var9_3 /* !! */  = (int)ns.lpst("lrux", lpsq(int ), (int)997);
                if (var10_2) {
                    throw null;
                }
            }
            case 76: {
                var9_3 /* !! */  = (int)ns.lpst("lruy", lpsq(int ), (int)998);
                if (!var10_2) ** GOTO lbl189
                throw null;
            }
lbl497:
            // 4 sources

            case 77: {
                var9_3 /* !! */  = (int)ns.lpst("lruz", lpsq(int ), (int)999);
                if (!var10_2) ** GOTO lbl223
                throw null;
            }
            case 78: 
        }
        var9_3 /* !! */  = (int)ns.lpst("lrva", lpsq(int ), (int)1000);
        ** while (!var10_2)
lbl504:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltri() {
        ns.lptw[300] = 2673733949942979592L;
        ns.lptw[301] = -4445266365011467713L;
        ns.lptw[302] = 2647914160182211761L;
        ns.lptw[303] = 5491872288433798576L;
        ns.lptw[304] = -3709568948782984012L;
        ns.lptw[305] = 391912773938481979L;
        ns.lptw[306] = 2315925280707323105L;
        ns.lptw[307] = -3219579538241451943L;
        ns.lptw[308] = -3989362520116685651L;
        ns.lptw[309] = 9179812478458769090L;
        ns.lptw[310] = 1680259736288463047L;
        ns.lptw[311] = -176322934899085335L;
        ns.lptw[312] = 1970620287447965606L;
        ns.lptw[313] = -6669623545602761557L;
        ns.lptw[314] = -8462302330651029014L;
        ns.lptw[315] = -7104719588319641436L;
        ns.lptw[316] = 3545045162616079335L;
        ns.lptw[317] = -6466735796550245862L;
        ns.lptw[318] = -8939756576415217893L;
        ns.lptw[319] = 6828351428625257210L;
        ns.lptw[320] = 5635051030172174195L;
        ns.lptw[321] = -5743809662753791581L;
        ns.lptw[322] = -3079502703930541378L;
        ns.lptw[323] = -3910323875170377727L;
        ns.lptw[324] = 8948114677708719969L;
        ns.lptw[325] = 5928416414285429236L;
        ns.lptw[326] = -8929778952981023561L;
        ns.lptw[327] = 7599525275605827489L;
        ns.lptw[328] = 9005302042794832403L;
        ns.lptw[329] = -6043066695022223948L;
        ns.lptw[330] = 3999693149150325645L;
        ns.lptw[331] = 1947092465675533957L;
        ns.lptw[332] = 5978910931666702901L;
        ns.lptw[333] = 2724082736991174225L;
        ns.lptw[334] = -5403123530946406165L;
        ns.lptw[335] = -4386103504704516731L;
        ns.lptw[336] = -7295246833952914857L;
        ns.lptw[337] = 5729126578780464880L;
        ns.lptw[338] = 6973386521271767787L;
        ns.lptw[339] = -4592204989821278053L;
        ns.lptw[340] = -484012097462672495L;
        ns.lptw[341] = 2437912706824779039L;
        ns.lptw[342] = 2817045789980749179L;
        ns.lptw[343] = 4517640537159532762L;
        ns.lptw[344] = 204270909301994423L;
        ns.lptw[345] = 3483017708436664555L;
        ns.lptw[346] = -6667562700591223517L;
        ns.lptw[347] = 4884115405362981213L;
        ns.lptw[348] = -6112570574564369508L;
        ns.lptw[349] = 6641229516060425132L;
        ns.lptw[350] = 3933981660784565585L;
        ns.lptw[351] = 7653194791020931065L;
        ns.lptw[352] = -879861338027520930L;
        ns.lptw[353] = 8007206821109719075L;
        ns.lptw[354] = 8059315121461580764L;
        ns.lptw[355] = 6471448768993058800L;
        ns.lptw[356] = 2807416403382426166L;
        ns.lptw[357] = -3369905167317206513L;
        ns.lptw[358] = 2101834366898440647L;
        ns.lptw[359] = -2573454090261423519L;
        ns.lptw[360] = -2641569212795575337L;
        ns.lptw[361] = -2750817721428852035L;
        ns.lptw[362] = 7091426250026007267L;
        ns.lptw[363] = 1914185507535885872L;
        ns.lptw[364] = -5435346538564214463L;
        ns.lptw[365] = 6022391143703070813L;
        ns.lptw[366] = 8036378133722593028L;
        ns.lptw[367] = -8334319350729428604L;
        ns.lptw[368] = 3488210542265852747L;
        ns.lptw[369] = 4914745420894840939L;
        ns.lptw[370] = -6243043158373059627L;
        ns.lptw[371] = -4336503637257042617L;
        ns.lptw[372] = 783849316135163623L;
        ns.lptw[373] = -4047804599224641067L;
        ns.lptw[374] = 4649827818992614880L;
        ns.lptw[375] = -7797257745895518616L;
        ns.lptw[376] = -6747332004065775777L;
        ns.lptw[377] = -3588505791837681698L;
        ns.lptw[378] = -2010640460866836866L;
        ns.lptw[379] = 903170817316811989L;
        ns.lptw[380] = 2931010607572502396L;
        ns.lptw[381] = -576496749598294207L;
        ns.lptw[382] = -5470700620640326329L;
        ns.lptw[383] = 4918865204643305979L;
        ns.lptw[384] = -6735141827766123803L;
        ns.lptw[385] = -5798566818974461278L;
        ns.lptw[386] = 7224298282083228607L;
        ns.lptw[387] = 3178250188357761908L;
        ns.lptw[388] = 539482853934053537L;
        ns.lptw[389] = -4941610915019808707L;
        ns.lptw[390] = -7620641224031040113L;
        ns.lptw[391] = -2012488473482607043L;
        ns.lptw[392] = 3626068804620540273L;
        ns.lptw[393] = 7253329531878986078L;
        ns.lptw[394] = -3831253817358206048L;
        ns.lptw[395] = 2089187586131991674L;
        ns.lptw[396] = -8075724696307547168L;
        ns.lptw[397] = 3124566186274007126L;
        ns.lptw[398] = 7047585604844279734L;
        ns.lptw[399] = -7256377580968065603L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean isSprinting() {
        Object object = uk;
        block20: while (true) {
            switch ((int)object) {
                case 304457984: {
                    break block20;
                }
                case 1684206260: {
                    object = ns.lpst("lryq", lptv(int ), (int)443) - ns.lpst("lryp", lptv(int ), (int)442);
                    continue block20;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = uk;
        block21: while (true) {
            switch ((int)object2) {
                case -1712779241: {
                    object2 = ns.lpst("lrys", lptv(int ), (int)445) - ns.lpst("lryr", lptv(int ), (int)444);
                    continue block21;
                }
                case 304457984: {
                    break block21;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = uk;
        boolean bl3 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object3 = callSite - ns.lpst("lryt", lptv(int ), (int)446);
            }
            switch ((int)object3) {
                case -1335169200: {
                    callSite = ns.lpst("lryu", lptv(int ), (int)447);
                    continue block22;
                }
                case -788229631: {
                    callSite = ns.lpst("lryv", lptv(int ), (int)448);
                    continue block22;
                }
                case 304457984: {
                    break block22;
                }
                case 765476495: {
                    callSite = ns.lpst("lryw", lptv(int ), (int)449);
                    continue block22;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return (boolean)ns.lpst("lryx", lpsq(int ), (int)1056);
        if (bl4) return (boolean)ns.lpst("lryx", lpsq(int ), (int)1056);
        Object object4 = uk;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - ns.lpst("lryy", lptv(int ), (int)450);
            }
            switch ((int)object4) {
                case -2139612102: {
                    callSite = ns.lpst("lryz", lptv(int ), (int)451);
                    continue block23;
                }
                case -2135708962: {
                    callSite = ns.lpst("lrza", lptv(int ), (int)452);
                    continue block23;
                }
                case -1103107752: {
                    callSite = ns.lpst("lrzb", lptv(int ), (int)453);
                    continue block23;
                }
                case 304457984: {
                    return this.sprinting;
                }
            }
            break;
        }
        return this.sprinting;
    }

    private static /* synthetic */ void ltrg() {
        ns.lptw[100] = -7883819956017423728L;
        ns.lptw[101] = 1845129958461866275L;
        ns.lptw[102] = -8418580899421946054L;
        ns.lptw[103] = -2747543114192510065L;
        ns.lptw[104] = -167642911261020718L;
        ns.lptw[105] = -8705511190891710209L;
        ns.lptw[106] = 5693810467365397287L;
        ns.lptw[107] = -2640916814134387530L;
        ns.lptw[108] = 8206961983625509772L;
        ns.lptw[109] = 8263794977169225498L;
        ns.lptw[110] = -5959443460134756901L;
        ns.lptw[111] = 2561696293482933748L;
        ns.lptw[112] = 655227154067887404L;
        ns.lptw[113] = -6466385836901024625L;
        ns.lptw[114] = -7318418484569053605L;
        ns.lptw[115] = 2663719416421556639L;
        ns.lptw[116] = -2887849222960601218L;
        ns.lptw[117] = 545948366873614326L;
        ns.lptw[118] = 1413944461958020192L;
        ns.lptw[119] = 6968392773352160288L;
        ns.lptw[120] = 5357078576392835035L;
        ns.lptw[121] = -453917579239923471L;
        ns.lptw[122] = -2674133249975129627L;
        ns.lptw[123] = 2500745681379975343L;
        ns.lptw[124] = 173330552233886482L;
        ns.lptw[125] = 8506436665931881862L;
        ns.lptw[126] = -5526702461738424676L;
        ns.lptw[127] = -6422538098817827441L;
        ns.lptw[128] = 7594008826800259584L;
        ns.lptw[129] = -3618556019586534309L;
        ns.lptw[130] = -5627253927103887316L;
        ns.lptw[131] = -6990990998088342098L;
        ns.lptw[132] = -5123816594493197034L;
        ns.lptw[133] = -426731502105244384L;
        ns.lptw[134] = 4484986471268290386L;
        ns.lptw[135] = -4186766308223373172L;
        ns.lptw[136] = 5315548009503324669L;
        ns.lptw[137] = 4894350097138967900L;
        ns.lptw[138] = 691500996090194367L;
        ns.lptw[139] = 9205634477779240487L;
        ns.lptw[140] = -4565255097381818612L;
        ns.lptw[141] = -5571501662167443743L;
        ns.lptw[142] = 8455042737059173128L;
        ns.lptw[143] = -53872663091989786L;
        ns.lptw[144] = -7108317427805531987L;
        ns.lptw[145] = -2781250042885113928L;
        ns.lptw[146] = -4842321584674586981L;
        ns.lptw[147] = 1967044603679455705L;
        ns.lptw[148] = -2981766395324707105L;
        ns.lptw[149] = -9073258168668645873L;
        ns.lptw[150] = 6498980504173656678L;
        ns.lptw[151] = 2047468629485333575L;
        ns.lptw[152] = -7193915008649603785L;
        ns.lptw[153] = -8997341988096847412L;
        ns.lptw[154] = -5647706556639424385L;
        ns.lptw[155] = 3631511254095415064L;
        ns.lptw[156] = -6789738199797604092L;
        ns.lptw[157] = -5995140103886792806L;
        ns.lptw[158] = 1662388939230334970L;
        ns.lptw[159] = -3903433596386241056L;
        ns.lptw[160] = -902998761484829356L;
        ns.lptw[161] = -5778574574324157757L;
        ns.lptw[162] = 6834152736342200466L;
        ns.lptw[163] = -7257472725671814486L;
        ns.lptw[164] = -424508527473104202L;
        ns.lptw[165] = -6558920099245788189L;
        ns.lptw[166] = 3381700106031316170L;
        ns.lptw[167] = 1855129208547923276L;
        ns.lptw[168] = -7905068809144730324L;
        ns.lptw[169] = 8285148725045031073L;
        ns.lptw[170] = 6695059160964755023L;
        ns.lptw[171] = -157051269240444767L;
        ns.lptw[172] = 3977917731162361570L;
        ns.lptw[173] = -5554259070442902042L;
        ns.lptw[174] = 2358024777032775879L;
        ns.lptw[175] = 7372850223428246553L;
        ns.lptw[176] = 6919858742527120944L;
        ns.lptw[177] = -2584836884760241704L;
        ns.lptw[178] = 8596688066065528546L;
        ns.lptw[179] = -3188357662713464915L;
        ns.lptw[180] = 8472026444407548534L;
        ns.lptw[181] = 2702431219853426496L;
        ns.lptw[182] = 3661489748242761383L;
        ns.lptw[183] = 3499833283704836837L;
        ns.lptw[184] = -4449321826999318035L;
        ns.lptw[185] = -8512578600712481204L;
        ns.lptw[186] = -6861955579872787387L;
        ns.lptw[187] = -6366116808436055400L;
        ns.lptw[188] = 3878251531284936655L;
        ns.lptw[189] = 9070665075492952148L;
        ns.lptw[190] = 872614031136748499L;
        ns.lptw[191] = 6378338876744078188L;
        ns.lptw[192] = -1120618567270092201L;
        ns.lptw[193] = -8878665454767712171L;
        ns.lptw[194] = 75986596956416300L;
        ns.lptw[195] = 216779080091519980L;
        ns.lptw[196] = 5348344924021849778L;
        ns.lptw[197] = -3720759668889216081L;
        ns.lptw[198] = -5146777540744998306L;
        ns.lptw[199] = 6028279515216737487L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSubmergedInWater() {
        v0 /* !! */  = ns.uk;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - ns.lpst("lstv", lptv(int ), (int)674));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1999860987: {
                    v1 = ns.lpst("lstw", lptv(int ), (int)675);
                    continue block28;
                }
                case 304457984: {
                    break block28;
                }
                case 1388278581: {
                    v1 = ns.lpst("lstx", lptv(int ), (int)676);
                    continue block28;
                }
                case 2144069316: {
                    v1 = ns.lpst("lsty", lptv(int ), (int)677);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = ns.c;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - ns.lpst("lstz", lptv(int ), (int)678));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 304457984: {
                    break block29;
                }
                case 1070016197: {
                    v3 = ns.lpst("lsua", lptv(int ), (int)679);
                    continue block29;
                }
                case 1357067138: {
                    v3 = ns.lpst("lsub", lptv(int ), (int)680);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = ns.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lsuc", lptv(int ), (int)681)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ns.lpst("lsud", lpsq(int ), (int)1376)) break;
            v4 /* !! */  = (long)ns.lpst("lsue", lpsq(int ), (int)1377);
        }
        var1_3 = ns.a;
        if (var3_1) {
            throw null;
lbl41:
            // 4 sources

            return (boolean)ns.lpst("lsuf", lpsq(int ), (int)1378);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lsug", lptv(int ), (int)682)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ns.lpst("lsuh", lpsq(int ), (int)1379)) break;
                    v5 /* !! */  = (long)ns.lpst("lsui", lpsq(int ), (int)1380);
                }
                if (!this.submergedInWater) ** GOTO lbl77
                if (var1_3) ** GOTO lbl41
                v6 /* !! */  = ns.uk;
                if (true) ** GOTO lbl59
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - ns.lpst("lsuj", lptv(int ), (int)683));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1274478078: {
                            v7 = ns.lpst("lsuk", lptv(int ), (int)684);
                            continue block33;
                        }
                        case 304457984: {
                            break block33;
                        }
                        case 434532086: {
                            v7 = ns.lpst("lsul", lptv(int ), (int)685);
                            continue block33;
                        }
                        case 1544090483: {
                            v7 = ns.lpst("lsum", lptv(int ), (int)686);
                            continue block33;
                        }
                    }
                    break;
                }
                if (!this.isTouchingWater()) ** GOTO lbl77
                if (var1_3) ** GOTO lbl41
                v8 = ns.lpst("lsun", lpsq(int ), (int)1381);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl80
lbl77:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v8 = ns.lpst("lsuo", lpsq(int ), (int)1382);
lbl80:
                // 2 sources

                return (boolean)v8;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ns.lpst("lsup", lpsq(int ), (int)1383);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl86:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ns.lpst("lsuq", lpsq(int ), (int)1384);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 2: {
                var2_2 /* !! */  = (int)ns.lpst("lsur", lpsq(int ), (int)1385);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl96:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ns.lpst("lsus", lpsq(int ), (int)1386);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl101:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ns.lpst("lsut", lpsq(int ), (int)1387);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl105:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)ns.lpst("lsuu", lpsq(int ), (int)1388);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
lbl109:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ns.lpst("lsuv", lpsq(int ), (int)1389);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl113:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ns.lpst("lsuw", lpsq(int ), (int)1390);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ns.lpst("lsux", lpsq(int ), (int)1391);
        ** while (!var3_1)
lbl120:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void tick() {
        block229: {
            var14_1 = ns.c;
            var13_2 /* !! */  = ns.b;
            var12_3 = ns.a;
            if (var14_1) {
                throw null;
lbl6:
                // 69 sources

                return;
            }
            if (var12_3 || var12_3) ** GOTO lbl6
            this.simulatedTicks += ns.lpst("lqfm", lpsq(int ), (int)153);
            if (var12_3 || var12_3) ** GOTO lbl6
            this.clipLedged = ns.lpst("lqfn", lpsq(int ), (int)154);
            if (var12_3 || var12_3) ** GOTO lbl6
            if (!(this.pos.field_1351 <= ns.lpst("lqfp", lqfo(int ), (int)174))) break block229;
            if (var12_3 || var12_3) ** GOTO lbl6
            return;
        }
        if (var12_3 || var12_3) ** GOTO lbl6
        this.input.update();
        if (var12_3 || var12_3) ** GOTO lbl6
        this.checkWaterState();
        if (var12_3 || var12_3) ** GOTO lbl6
        this.updateSubmergedInWaterState();
        if (var12_3 || var12_3) ** GOTO lbl6
        this.updateSwimming();
        if (var12_3 || var12_3) ** GOTO lbl6
        if (this.jumpingCooldown <= 0) ** GOTO lbl34
        if (var12_3) ** GOTO lbl6
        if (var13_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_3) ** GOTO lbl6
                this.jumpingCooldown -= ns.lpst("lqfq", lpsq(int ), (int)155);
                if (var12_3) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                this.isJumping = this.input.playerInput.comp_3163();
                if (var12_3 || var12_3) ** GOTO lbl6
                var1_4 = this.velocity.field_1352;
                if (var12_3 || var12_3) ** GOTO lbl6
                var3_5 = this.velocity.field_1351;
                if (var12_3 || var12_3) ** GOTO lbl6
                var5_6 = this.velocity.field_1350;
                if (var12_3 || var12_3) ** GOTO lbl6
                if (!(Math.abs(this.velocity.field_1352) < ns.lpst("lqfr", lqfo(int ), (int)175))) ** GOTO lbl47
                if (var12_3) ** GOTO lbl6
                var1_4 = 0.0;
                if (var12_3) ** GOTO lbl6
lbl47:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (!(Math.abs(this.velocity.field_1351) < ns.lpst("lqfs", lqfo(int ), (int)176))) ** GOTO lbl52
                if (var12_3) ** GOTO lbl6
                var3_5 = 0.0;
                if (var12_3) ** GOTO lbl6
lbl52:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (!(Math.abs(this.velocity.field_1350) < ns.lpst("lqft", lqfo(int ), (int)177))) ** GOTO lbl57
                if (var12_3) ** GOTO lbl6
                var5_6 = 0.0;
                if (var12_3) ** GOTO lbl6
lbl57:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (!this.onGround) ** GOTO lbl62
                if (var12_3 || var12_3) ** GOTO lbl6
                this.isFallFlying = ns.lpst("lqfu", lpsq(int ), (int)156);
                if (var12_3) ** GOTO lbl6
lbl62:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                this.velocity = new class_243(var1_4, var3_5, var5_6);
                if (var12_3 || var12_3) ** GOTO lbl6
                if (!this.isJumping) ** GOTO lbl130
                if (var12_3 || var12_3) ** GOTO lbl6
                if (!this.isInLava()) ** GOTO lbl73
                if (var12_3) ** GOTO lbl6
                v0 = this.getFluidHeight((class_6862<class_3611>)class_3486.field_15518);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl75
lbl73:
                // 1 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                v0 = var7_7 = this.getFluidHeight((class_6862<class_3611>)class_3486.field_15517);
lbl75:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (!this.isTouchingWater()) ** GOTO lbl84
                if (var12_3) ** GOTO lbl6
                if (!(var7_7 > 0.0)) ** GOTO lbl84
                if (var12_3) ** GOTO lbl6
                v1 = ns.lpst("lqfv", lpsq(int ), (int)157);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl86
lbl84:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                v1 = var9_9 = ns.lpst("lqfw", lpsq(int ), (int)158);
lbl86:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var10_11 = this.getSwimHeight();
                if (var12_3 || var12_3) ** GOTO lbl6
                if (var9_9 == false) ** GOTO lbl101
                if (var12_3) ** GOTO lbl6
                if (!this.onGround) ** GOTO lbl95
                if (var12_3) ** GOTO lbl6
                if (!(var7_7 > var10_11)) ** GOTO lbl101
                if (var12_3) ** GOTO lbl6
lbl95:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                this.swimUpward((class_6862<class_3611>)class_3486.field_15517);
                if (var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl130
lbl101:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (!this.isInLava()) ** GOTO lbl114
                if (var12_3) ** GOTO lbl6
                if (!this.onGround) ** GOTO lbl108
                if (var12_3) ** GOTO lbl6
                if (!(var7_7 > var10_11)) ** GOTO lbl114
                if (var12_3) ** GOTO lbl6
lbl108:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                this.swimUpward((class_6862<class_3611>)class_3486.field_15518);
                if (var12_3) ** GOTO lbl6
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl130
lbl114:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (this.onGround) ** GOTO lbl121
                if (var12_3) ** GOTO lbl6
                if (var9_9 == false) ** GOTO lbl130
                if (var12_3) ** GOTO lbl6
                if (!(var7_7 <= var10_11)) ** GOTO lbl130
                if (var12_3) ** GOTO lbl6
lbl121:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                if (this.jumpingCooldown != 0) ** GOTO lbl130
                if (var12_3 || var12_3) ** GOTO lbl6
                this.jump();
                if (var12_3 || var12_3) ** GOTO lbl6
                if (!this.player.equals((Object)ns.mc.field_1724)) ** GOTO lbl130
                if (var12_3 || var12_3) ** GOTO lbl6
                this.jumpingCooldown = (int)ns.lpst("lqfx", lpsq(int ), (int)159);
                if (var12_3) ** GOTO lbl6
lbl130:
                // 8 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                var7_8 = this.input.movementSideways * ns.lpst("lqfz", lqfy(int ), (int)160);
                if (var12_3 || var12_3) ** GOTO lbl6
                var8_12 = this.input.movementForward * ns.lpst("lqga", lqfy(int ), (int)161);
                if (var12_3 || var12_3) ** GOTO lbl6
                var9_10 = 0.0f;
                if (var12_3 || var12_3) ** GOTO lbl6
                if (this.hasStatusEffect((class_6880<class_1291>)class_1294.field_5906)) ** GOTO lbl141
                if (var12_3) ** GOTO lbl6
                if (!this.hasStatusEffect((class_6880<class_1291>)class_1294.field_5902)) ** GOTO lbl144
                if (var12_3) ** GOTO lbl6
lbl141:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                this.onLanding();
                if (var12_3) ** GOTO lbl6
lbl144:
                // 2 sources

                if (var12_3 || var12_3) ** GOTO lbl6
                this.travel(new class_243((double)var7_8, (double)var9_10, (double)var8_12));
                if (!var12_3 && !var12_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_2 /* !! */  = (int)ns.lpst("lqgb", lpsq(int ), (int)162);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 1: {
                var13_2 /* !! */  = (int)ns.lpst("lqgc", lpsq(int ), (int)163);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl159:
            // 2 sources

            case 2: {
                var13_2 /* !! */  = (int)ns.lpst("lqgd", lpsq(int ), (int)164);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl459
            }
lbl164:
            // 3 sources

            case 3: {
                var13_2 /* !! */  = (int)ns.lpst("lqge", lpsq(int ), (int)165);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 4: {
                var13_2 /* !! */  = (int)ns.lpst("lqgf", lpsq(int ), (int)166);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl508
            }
lbl174:
            // 4 sources

            case 5: {
                var13_2 /* !! */  = (int)ns.lpst("lqgg", lpsq(int ), (int)167);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 6: {
                var13_2 /* !! */  = (int)ns.lpst("lqgh", lpsq(int ), (int)168);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl184:
            // 2 sources

            case 7: {
                var13_2 /* !! */  = (int)ns.lpst("lqgi", lpsq(int ), (int)169);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl539
            }
            case 8: {
                var13_2 /* !! */  = (int)ns.lpst("lqgj", lpsq(int ), (int)170);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl194:
            // 2 sources

            case 9: {
                var13_2 /* !! */  = (int)ns.lpst("lqgk", lpsq(int ), (int)171);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl631
            }
lbl199:
            // 3 sources

            case 10: {
                var13_2 /* !! */  = (int)ns.lpst("lqgl", lpsq(int ), (int)172);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl204:
            // 2 sources

            case 11: {
                var13_2 /* !! */  = (int)ns.lpst("lqgm", lpsq(int ), (int)173);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl508
            }
lbl209:
            // 2 sources

            case 12: {
                var13_2 /* !! */  = (int)ns.lpst("lqgn", lpsq(int ), (int)174);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl551
            }
lbl214:
            // 2 sources

            case 13: {
                var13_2 /* !! */  = (int)ns.lpst("lqgo", lpsq(int ), (int)175);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl432
            }
lbl219:
            // 2 sources

            case 14: {
                var13_2 /* !! */  = (int)ns.lpst("lqgp", lpsq(int ), (int)176);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl224:
            // 2 sources

            case 15: {
                var13_2 /* !! */  = (int)ns.lpst("lqgq", lpsq(int ), (int)177);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl627
            }
lbl229:
            // 4 sources

            case 16: {
                var13_2 /* !! */  = (int)ns.lpst("lqgr", lpsq(int ), (int)178);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl615
            }
            case 17: {
                var13_2 /* !! */  = (int)ns.lpst("lqgs", lpsq(int ), (int)179);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl239:
            // 2 sources

            case 18: {
                var13_2 /* !! */  = (int)ns.lpst("lqgt", lpsq(int ), (int)180);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl651
            }
lbl244:
            // 2 sources

            case 19: {
                var13_2 /* !! */  = (int)ns.lpst("lqgu", lpsq(int ), (int)181);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 20: {
                var13_2 /* !! */  = (int)ns.lpst("lqgv", lpsq(int ), (int)182);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl254:
            // 2 sources

            case 21: {
                var13_2 /* !! */  = (int)ns.lpst("lqgw", lpsq(int ), (int)183);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl571
            }
lbl259:
            // 4 sources

            case 22: {
                var13_2 /* !! */  = (int)ns.lpst("lqgx", lpsq(int ), (int)184);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl264:
            // 3 sources

            case 23: {
                var13_2 /* !! */  = (int)ns.lpst("lqgy", lpsq(int ), (int)185);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl504
            }
            case 24: {
                var13_2 /* !! */  = (int)ns.lpst("lqgz", lpsq(int ), (int)186);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl274:
            // 2 sources

            case 25: {
                var13_2 /* !! */  = (int)ns.lpst("lqha", lpsq(int ), (int)187);
                if (!var14_1) ** GOTO lbl209
                throw null;
            }
lbl278:
            // 2 sources

            case 26: {
                var13_2 /* !! */  = (int)ns.lpst("lqhb", lpsq(int ), (int)188);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl589
            }
            case 27: {
                var13_2 /* !! */  = (int)ns.lpst("lqhc", lpsq(int ), (int)189);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl288:
            // 3 sources

            case 28: {
                var13_2 /* !! */  = (int)ns.lpst("lqhd", lpsq(int ), (int)190);
                if (!var14_1) ** GOTO lbl278
                throw null;
            }
            case 29: {
                var13_2 /* !! */  = (int)ns.lpst("lqhe", lpsq(int ), (int)191);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl623
            }
lbl297:
            // 2 sources

            case 30: {
                var13_2 /* !! */  = (int)ns.lpst("lqhf", lpsq(int ), (int)192);
                if (!var14_1) ** GOTO lbl254
                throw null;
            }
lbl301:
            // 2 sources

            case 31: {
                var13_2 /* !! */  = (int)ns.lpst("lqhg", lpsq(int ), (int)193);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl392
            }
            case 32: {
                var13_2 /* !! */  = (int)ns.lpst("lqhh", lpsq(int ), (int)194);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl611
            }
lbl311:
            // 3 sources

            case 33: {
                var13_2 /* !! */  = (int)ns.lpst("lqhi", lpsq(int ), (int)195);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl512
            }
            case 34: {
                var13_2 /* !! */  = (int)ns.lpst("lqhj", lpsq(int ), (int)196);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl647
            }
lbl321:
            // 4 sources

            case 35: {
                var13_2 /* !! */  = (int)ns.lpst("lqhk", lpsq(int ), (int)197);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl559
            }
lbl326:
            // 2 sources

            case 36: {
                var13_2 /* !! */  = (int)ns.lpst("lqhl", lpsq(int ), (int)198);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl331:
            // 4 sources

            case 37: {
                var13_2 /* !! */  = (int)ns.lpst("lqhm", lpsq(int ), (int)199);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl428
            }
            case 38: {
                var13_2 /* !! */  = (int)ns.lpst("lqhn", lpsq(int ), (int)200);
                if (!var14_1) ** GOTO lbl301
                throw null;
            }
lbl340:
            // 2 sources

            case 39: {
                var13_2 /* !! */  = (int)ns.lpst("lqho", lpsq(int ), (int)201);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl345:
            // 2 sources

            case 40: {
                var13_2 /* !! */  = (int)ns.lpst("lqhp", lpsq(int ), (int)202);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl428
            }
            case 41: {
                var13_2 /* !! */  = (int)ns.lpst("lqhq", lpsq(int ), (int)203);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl655
            }
lbl355:
            // 2 sources

            case 42: {
                var13_2 /* !! */  = (int)ns.lpst("lqhr", lpsq(int ), (int)204);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl432
            }
lbl360:
            // 2 sources

            case 43: {
                var13_2 /* !! */  = (int)ns.lpst("lqhs", lpsq(int ), (int)205);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl615
            }
            case 44: {
                var13_2 /* !! */  = (int)ns.lpst("lqht", lpsq(int ), (int)206);
                if (!var14_1) ** GOTO lbl174
                throw null;
            }
lbl369:
            // 2 sources

            case 45: {
                var13_2 /* !! */  = (int)ns.lpst("lqhu", lpsq(int ), (int)207);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl563
            }
lbl374:
            // 2 sources

            case 46: {
                var13_2 /* !! */  = (int)ns.lpst("lqhv", lpsq(int ), (int)208);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl589
            }
            case 47: {
                var13_2 /* !! */  = (int)ns.lpst("lqhw", lpsq(int ), (int)209);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl517
            }
            case 48: {
                var13_2 /* !! */  = (int)ns.lpst("lqhx", lpsq(int ), (int)210);
                if (!var14_1) ** GOTO lbl229
                throw null;
            }
lbl388:
            // 3 sources

            case 49: {
                var13_2 /* !! */  = (int)ns.lpst("lqhy", lpsq(int ), (int)211);
                if (!var14_1) ** GOTO lbl214
                throw null;
            }
lbl392:
            // 3 sources

            case 50: {
                var13_2 /* !! */  = (int)ns.lpst("lqhz", lpsq(int ), (int)212);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl635
            }
lbl397:
            // 2 sources

            case 51: {
                var13_2 /* !! */  = (int)ns.lpst("lqia", lpsq(int ), (int)213);
                if (!var14_1) ** GOTO lbl199
                throw null;
            }
lbl401:
            // 2 sources

            case 52: {
                var13_2 /* !! */  = (int)ns.lpst("lqib", lpsq(int ), (int)214);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 53: {
                var13_2 /* !! */  = (int)ns.lpst("lqic", lpsq(int ), (int)215);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl551
            }
            case 54: {
                var13_2 /* !! */  = (int)ns.lpst("lqid", lpsq(int ), (int)216);
                if (!var14_1) ** GOTO lbl244
                throw null;
            }
lbl415:
            // 3 sources

            case 55: {
                var13_2 /* !! */  = (int)ns.lpst("lqie", lpsq(int ), (int)217);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl420:
            // 3 sources

            case 56: {
                var13_2 /* !! */  = (int)ns.lpst("lqif", lpsq(int ), (int)218);
                if (!var14_1) ** GOTO lbl311
                throw null;
            }
lbl424:
            // 2 sources

            case 57: {
                var13_2 /* !! */  = (int)ns.lpst("lqig", lpsq(int ), (int)219);
                if (!var14_1) ** GOTO lbl288
                throw null;
            }
lbl428:
            // 3 sources

            case 58: {
                var13_2 /* !! */  = (int)ns.lpst("lqih", lpsq(int ), (int)220);
                if (!var14_1) ** GOTO lbl355
                throw null;
            }
lbl432:
            // 4 sources

            case 59: {
                var13_2 /* !! */  = (int)ns.lpst("lqii", lpsq(int ), (int)221);
                if (!var14_1) ** GOTO lbl345
                throw null;
            }
            case 60: {
                var13_2 /* !! */  = (int)ns.lpst("lqij", lpsq(int ), (int)222);
                if (!var14_1) ** GOTO lbl415
                throw null;
            }
lbl440:
            // 2 sources

            case 61: {
                var13_2 /* !! */  = (int)ns.lpst("lqik", lpsq(int ), (int)223);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl589
            }
lbl445:
            // 2 sources

            case 62: {
                var13_2 /* !! */  = (int)ns.lpst("lqil", lpsq(int ), (int)224);
                if (!var14_1) ** GOTO lbl264
                throw null;
            }
lbl449:
            // 4 sources

            case 63: {
                var13_2 /* !! */  = (int)ns.lpst("lqim", lpsq(int ), (int)225);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl635
            }
            case 64: {
                var13_2 /* !! */  = (int)ns.lpst("lqin", lpsq(int ), (int)226);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl459:
            // 2 sources

            case 65: {
                var13_2 /* !! */  = (int)ns.lpst("lqio", lpsq(int ), (int)227);
                if (!var14_1) ** GOTO lbl239
                throw null;
            }
            case 66: {
                var13_2 /* !! */  = (int)ns.lpst("lqip", lpsq(int ), (int)228);
                if (!var14_1) ** GOTO lbl297
                throw null;
            }
lbl467:
            // 2 sources

            case 67: {
                var13_2 /* !! */  = (int)ns.lpst("lqiq", lpsq(int ), (int)229);
                if (!var14_1) ** GOTO lbl259
                throw null;
            }
            case 68: {
                var13_2 /* !! */  = (int)ns.lpst("lqir", lpsq(int ), (int)230);
                if (!var14_1) ** GOTO lbl164
                throw null;
            }
            case 69: {
                var13_2 /* !! */  = (int)ns.lpst("lqis", lpsq(int ), (int)231);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl623
            }
            case 70: {
                var13_2 /* !! */  = (int)ns.lpst("lqit", lpsq(int ), (int)232);
                if (!var14_1) ** GOTO lbl331
                throw null;
            }
lbl484:
            // 3 sources

            case 71: {
                var13_2 /* !! */  = (int)ns.lpst("lqiu", lpsq(int ), (int)233);
                if (!var14_1) ** GOTO lbl360
                throw null;
            }
            case 72: {
                var13_2 /* !! */  = (int)ns.lpst("lqiv", lpsq(int ), (int)234);
                if (!var14_1) ** GOTO lbl440
                throw null;
            }
            case 73: {
                var13_2 /* !! */  = (int)ns.lpst("lqiw", lpsq(int ), (int)235);
                if (!var14_1) ** GOTO lbl194
                throw null;
            }
lbl496:
            // 2 sources

            case 74: {
                var13_2 /* !! */  = (int)ns.lpst("lqix", lpsq(int ), (int)236);
                if (var14_1) {
                    throw null;
                }
            }
            case 75: {
                var13_2 /* !! */  = (int)ns.lpst("lqiy", lpsq(int ), (int)237);
                if (!var14_1) ** GOTO lbl259
                throw null;
            }
lbl504:
            // 2 sources

            case 76: {
                var13_2 /* !! */  = (int)ns.lpst("lqiz", lpsq(int ), (int)238);
                if (!var14_1) ** GOTO lbl392
                throw null;
            }
lbl508:
            // 3 sources

            case 77: {
                var13_2 /* !! */  = (int)ns.lpst("lqja", lpsq(int ), (int)239);
                if (!var14_1) ** GOTO lbl374
                throw null;
            }
lbl512:
            // 3 sources

            case 78: {
                var13_2 /* !! */  = (int)ns.lpst("lqjb", lpsq(int ), (int)240);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl639
            }
lbl517:
            // 3 sources

            case 79: {
                var13_2 /* !! */  = (int)ns.lpst("lqjc", lpsq(int ), (int)241);
                if (!var14_1) ** GOTO lbl449
                throw null;
            }
lbl521:
            // 2 sources

            case 80: {
                var13_2 /* !! */  = (int)ns.lpst("lqjd", lpsq(int ), (int)242);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl647
            }
            case 81: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_2 /* !! */  = (int)ns.lpst("lqje", lpsq(int ), (int)243);
                    if (!var14_1) ** GOTO lbl321
                    throw null;
                }
            }
            case 82: {
                var13_2 /* !! */  = (int)ns.lpst("lqjf", lpsq(int ), (int)244);
                if (!var14_1) ** GOTO lbl174
                throw null;
            }
            case 83: {
                var13_2 /* !! */  = (int)ns.lpst("lqjg", lpsq(int ), (int)245);
                if (!var14_1) ** GOTO lbl331
                throw null;
            }
lbl539:
            // 2 sources

            case 84: {
                var13_2 /* !! */  = (int)ns.lpst("lqjh", lpsq(int ), (int)246);
                if (!var14_1) ** GOTO lbl401
                throw null;
            }
lbl543:
            // 2 sources

            case 85: {
                var13_2 /* !! */  = (int)ns.lpst("lqji", lpsq(int ), (int)247);
                if (!var14_1) ** GOTO lbl496
                throw null;
            }
            case 86: {
                var13_2 /* !! */  = (int)ns.lpst("lqjj", lpsq(int ), (int)248);
                if (!var14_1) ** GOTO lbl397
                throw null;
            }
lbl551:
            // 3 sources

            case 87: {
                var13_2 /* !! */  = (int)ns.lpst("lqjk", lpsq(int ), (int)249);
                if (!var14_1) ** GOTO lbl311
                throw null;
            }
            case 88: {
                var13_2 /* !! */  = (int)ns.lpst("lqjl", lpsq(int ), (int)250);
                if (!var14_1) ** GOTO lbl340
                throw null;
            }
lbl559:
            // 2 sources

            case 89: {
                var13_2 /* !! */  = (int)ns.lpst("lqjm", lpsq(int ), (int)251);
                if (!var14_1) ** GOTO lbl174
                throw null;
            }
lbl563:
            // 2 sources

            case 90: {
                var13_2 /* !! */  = (int)ns.lpst("lqjn", lpsq(int ), (int)252);
                if (!var14_1) ** GOTO lbl321
                throw null;
            }
            case 91: {
                var13_2 /* !! */  = (int)ns.lpst("lqjo", lpsq(int ), (int)253);
                if (!var14_1) ** GOTO lbl424
                throw null;
            }
lbl571:
            // 3 sources

            case 92: {
                var13_2 /* !! */  = (int)ns.lpst("lqjp", lpsq(int ), (int)254);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl651
            }
            case 93: {
                var13_2 /* !! */  = (int)ns.lpst("lqjq", lpsq(int ), (int)255);
                if (!var14_1) ** GOTO lbl517
                throw null;
            }
lbl580:
            // 2 sources

            case 94: {
                var13_2 /* !! */  = (int)ns.lpst("lqjr", lpsq(int ), (int)256);
                if (!var14_1) ** GOTO lbl164
                throw null;
            }
            case 95: {
                var13_2 /* !! */  = (int)ns.lpst("lqjs", lpsq(int ), (int)257);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl631
            }
lbl589:
            // 4 sources

            case 96: {
                var13_2 /* !! */  = (int)ns.lpst("lqjt", lpsq(int ), (int)258);
                if (!var14_1) ** GOTO lbl432
                throw null;
            }
            case 97: {
                var13_2 /* !! */  = (int)ns.lpst("lqju", lpsq(int ), (int)259);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl611
            }
            case 98: {
                var13_2 /* !! */  = (int)ns.lpst("lqjv", lpsq(int ), (int)260);
                if (!var14_1) ** GOTO lbl326
                throw null;
            }
            case 99: {
                var13_2 /* !! */  = (int)ns.lpst("lqjw", lpsq(int ), (int)261);
                if (!var14_1) ** GOTO lbl543
                throw null;
            }
lbl606:
            // 2 sources

            case 100: {
                var13_2 /* !! */  = (int)ns.lpst("lqjx", lpsq(int ), (int)262);
                if (var14_1) {
                    throw null;
                }
                ** GOTO lbl627
            }
lbl611:
            // 3 sources

            case 101: {
                var13_2 /* !! */  = (int)ns.lpst("lqjy", lpsq(int ), (int)263);
                if (!var14_1) ** GOTO lbl484
                throw null;
            }
lbl615:
            // 3 sources

            case 102: {
                var13_2 /* !! */  = (int)ns.lpst("lqjz", lpsq(int ), (int)264);
                if (!var14_1) ** GOTO lbl571
                throw null;
            }
            case 103: {
                var13_2 /* !! */  = (int)ns.lpst("lqka", lpsq(int ), (int)265);
                if (!var14_1) ** GOTO lbl521
                throw null;
            }
lbl623:
            // 3 sources

            case 104: {
                var13_2 /* !! */  = (int)ns.lpst("lqkb", lpsq(int ), (int)266);
                if (!var14_1) ** GOTO lbl199
                throw null;
            }
lbl627:
            // 3 sources

            case 105: {
                var13_2 /* !! */  = (int)ns.lpst("lqkc", lpsq(int ), (int)267);
                if (!var14_1) ** GOTO lbl580
                throw null;
            }
lbl631:
            // 4 sources

            case 106: {
                var13_2 /* !! */  = (int)ns.lpst("lqkd", lpsq(int ), (int)268);
                if (!var14_1) ** GOTO lbl321
                throw null;
            }
lbl635:
            // 3 sources

            case 107: {
                var13_2 /* !! */  = (int)ns.lpst("lqke", lpsq(int ), (int)269);
                if (!var14_1) ** GOTO lbl274
                throw null;
            }
lbl639:
            // 2 sources

            case 108: {
                var13_2 /* !! */  = (int)ns.lpst("lqkf", lpsq(int ), (int)270);
                if (!var14_1) ** GOTO lbl445
                throw null;
            }
            case 109: {
                var13_2 /* !! */  = (int)ns.lpst("lqkg", lpsq(int ), (int)271);
                if (!var14_1) ** GOTO lbl631
                throw null;
            }
lbl647:
            // 3 sources

            case 110: {
                var13_2 /* !! */  = (int)ns.lpst("lqkh", lpsq(int ), (int)272);
                if (!var14_1) ** GOTO lbl512
                throw null;
            }
lbl651:
            // 3 sources

            case 111: {
                var13_2 /* !! */  = (int)ns.lpst("lqki", lpsq(int ), (int)273);
                if (!var14_1) ** GOTO lbl219
                throw null;
            }
lbl655:
            // 2 sources

            case 112: {
                var13_2 /* !! */  = (int)ns.lpst("lqkj", lpsq(int ), (int)274);
                if (!var14_1) ** GOTO lbl159
                throw null;
            }
            case 113: {
                var13_2 /* !! */  = (int)ns.lpst("lqkk", lpsq(int ), (int)275);
                if (!var14_1) ** GOTO lbl606
                throw null;
            }
            case 114: 
        }
        var13_2 /* !! */  = (int)ns.lpst("lqkl", lpsq(int ), (int)276);
        ** while (!var14_1)
lbl666:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltqb() {
        ns.lpsr[600] = 68588964;
        ns.lpsr[601] = 1148858323;
        ns.lpsr[602] = 1430695926;
        ns.lpsr[603] = 540994633;
        ns.lpsr[604] = 300744308;
        ns.lpsr[605] = -1392043422;
        ns.lpsr[606] = -206996917;
        ns.lpsr[607] = 1467950211;
        ns.lpsr[608] = -609207322;
        ns.lpsr[609] = -88453684;
        ns.lpsr[610] = 913744833;
        ns.lpsr[611] = -434652151;
        ns.lpsr[612] = 2106978949;
        ns.lpsr[613] = -694095889;
        ns.lpsr[614] = -201772353;
        ns.lpsr[615] = -957493647;
        ns.lpsr[616] = 1292326054;
        ns.lpsr[617] = 2033005137;
        ns.lpsr[618] = -381225616;
        ns.lpsr[619] = 581690808;
        ns.lpsr[620] = 1585259804;
        ns.lpsr[621] = 1113108127;
        ns.lpsr[622] = 1812148815;
        ns.lpsr[623] = 227680666;
        ns.lpsr[624] = -1104508925;
        ns.lpsr[625] = 878768321;
        ns.lpsr[626] = 1724246279;
        ns.lpsr[627] = 1107644830;
        ns.lpsr[628] = 2069541436;
        ns.lpsr[629] = 509588965;
        ns.lpsr[630] = -11861389;
        ns.lpsr[631] = -226596923;
        ns.lpsr[632] = -1313399626;
        ns.lpsr[633] = -413097484;
        ns.lpsr[634] = 544199404;
        ns.lpsr[635] = 952415461;
        ns.lpsr[636] = -17387050;
        ns.lpsr[637] = -1825222083;
        ns.lpsr[638] = 912488241;
        ns.lpsr[639] = -748823173;
        ns.lpsr[640] = 2073896832;
        ns.lpsr[641] = 2039397398;
        ns.lpsr[642] = -596243643;
        ns.lpsr[643] = -539745891;
        ns.lpsr[644] = 2118683484;
        ns.lpsr[645] = -1664122338;
        ns.lpsr[646] = -1819878333;
        ns.lpsr[647] = -1513223480;
        ns.lpsr[648] = 508737898;
        ns.lpsr[649] = 1728448160;
        ns.lpsr[650] = -1570394655;
        ns.lpsr[651] = -841533463;
        ns.lpsr[652] = 32547135;
        ns.lpsr[653] = 902090466;
        ns.lpsr[654] = 786176021;
        ns.lpsr[655] = -1736115126;
        ns.lpsr[656] = 305528311;
        ns.lpsr[657] = -639300580;
        ns.lpsr[658] = 1709195891;
        ns.lpsr[659] = 1041811486;
        ns.lpsr[660] = -1666554707;
        ns.lpsr[661] = 1420320209;
        ns.lpsr[662] = -1715307140;
        ns.lpsr[663] = -1435661940;
        ns.lpsr[664] = 1032243976;
        ns.lpsr[665] = -1788075945;
        ns.lpsr[666] = 440107404;
        ns.lpsr[667] = 471629541;
        ns.lpsr[668] = 1702948853;
        ns.lpsr[669] = 1265753675;
        ns.lpsr[670] = -1134995539;
        ns.lpsr[671] = 1268329000;
        ns.lpsr[672] = -864272032;
        ns.lpsr[673] = 1533392525;
        ns.lpsr[674] = 1537550666;
        ns.lpsr[675] = 516644358;
        ns.lpsr[676] = -305254895;
        ns.lpsr[677] = -1719350749;
        ns.lpsr[678] = 1656522712;
        ns.lpsr[679] = 984192353;
        ns.lpsr[680] = 759037062;
        ns.lpsr[681] = -858584793;
        ns.lpsr[682] = -1271078563;
        ns.lpsr[683] = 499452015;
        ns.lpsr[684] = 1271305161;
        ns.lpsr[685] = 116453611;
        ns.lpsr[686] = 898118129;
        ns.lpsr[687] = -1478740149;
        ns.lpsr[688] = -761080857;
        ns.lpsr[689] = 739708427;
        ns.lpsr[690] = 534130537;
        ns.lpsr[691] = -761275645;
        ns.lpsr[692] = 1754490674;
        ns.lpsr[693] = 1489394074;
        ns.lpsr[694] = 2035077541;
        ns.lpsr[695] = 1830662912;
        ns.lpsr[696] = -1999427536;
        ns.lpsr[697] = -2000918762;
        ns.lpsr[698] = 1609247965;
        ns.lpsr[699] = -360939456;
    }

    private static /* synthetic */ void ltqj() {
        ns.lpsr[1400] = -2068408405;
        ns.lpsr[1401] = 2021248670;
        ns.lpsr[1402] = 1038279261;
        ns.lpsr[1403] = -1715282590;
        ns.lpsr[1404] = -103903304;
        ns.lpsr[1405] = 5941104;
        ns.lpsr[1406] = 590298268;
        ns.lpsr[1407] = -1135631189;
        ns.lpsr[1408] = 596879293;
        ns.lpsr[1409] = -460869313;
        ns.lpsr[1410] = -1745017815;
        ns.lpsr[1411] = -1203026965;
        ns.lpsr[1412] = -232186356;
        ns.lpsr[1413] = 152962911;
        ns.lpsr[1414] = -503441403;
        ns.lpsr[1415] = 13221366;
        ns.lpsr[1416] = -1421867287;
        ns.lpsr[1417] = -1985669680;
        ns.lpsr[1418] = -316670054;
        ns.lpsr[1419] = 756211281;
        ns.lpsr[1420] = -1220299817;
        ns.lpsr[1421] = -1792967501;
        ns.lpsr[1422] = -1289113846;
        ns.lpsr[1423] = -1037901393;
        ns.lpsr[1424] = -825150124;
        ns.lpsr[1425] = -1446959214;
        ns.lpsr[1426] = -696105823;
        ns.lpsr[1427] = 802601346;
        ns.lpsr[1428] = 28771817;
        ns.lpsr[1429] = -709887445;
        ns.lpsr[1430] = -749392537;
        ns.lpsr[1431] = 509228328;
        ns.lpsr[1432] = 1484237070;
        ns.lpsr[1433] = 978526305;
        ns.lpsr[1434] = -2048784684;
        ns.lpsr[1435] = -232492899;
        ns.lpsr[1436] = -1285282846;
        ns.lpsr[1437] = 916986089;
        ns.lpsr[1438] = 980542448;
        ns.lpsr[1439] = -1160266176;
        ns.lpsr[1440] = -1404212948;
        ns.lpsr[1441] = -2084451266;
        ns.lpsr[1442] = -1962954384;
        ns.lpsr[1443] = -1795587682;
        ns.lpsr[1444] = 1847209097;
        ns.lpsr[1445] = -1825618683;
        ns.lpsr[1446] = 1530512942;
        ns.lpsr[1447] = -1396069719;
        ns.lpsr[1448] = -1837060243;
        ns.lpsr[1449] = 2008866586;
        ns.lpsr[1450] = -1721835931;
        ns.lpsr[1451] = -2134324826;
        ns.lpsr[1452] = -403015342;
        ns.lpsr[1453] = 1991900204;
        ns.lpsr[1454] = -640088831;
        ns.lpsr[1455] = -403247123;
        ns.lpsr[1456] = 1929517075;
        ns.lpsr[1457] = 1341823796;
        ns.lpsr[1458] = 10303376;
        ns.lpsr[1459] = 1506069734;
        ns.lpsr[1460] = 1544114900;
        ns.lpsr[1461] = 644700940;
        ns.lpsr[1462] = -1904297338;
        ns.lpsr[1463] = 1465106544;
        ns.lpsr[1464] = -1181195076;
        ns.lpsr[1465] = 1603520308;
        ns.lpsr[1466] = -1374589080;
        ns.lpsr[1467] = -432483366;
        ns.lpsr[1468] = 434978032;
        ns.lpsr[1469] = -2035024848;
        ns.lpsr[1470] = 598124486;
        ns.lpsr[1471] = 1203883219;
        ns.lpsr[1472] = 1400621467;
        ns.lpsr[1473] = 1316484622;
        ns.lpsr[1474] = -224116520;
        ns.lpsr[1475] = 1811600033;
        ns.lpsr[1476] = -702624334;
        ns.lpsr[1477] = -769644911;
        ns.lpsr[1478] = 137232711;
        ns.lpsr[1479] = -1331276443;
        ns.lpsr[1480] = 2044383296;
        ns.lpsr[1481] = -1414259855;
        ns.lpsr[1482] = -199915567;
        ns.lpsr[1483] = -515889267;
        ns.lpsr[1484] = -2113202675;
        ns.lpsr[1485] = -537571932;
        ns.lpsr[1486] = -1652209254;
        ns.lpsr[1487] = -247460337;
        ns.lpsr[1488] = 1189791307;
        ns.lpsr[1489] = -528125184;
        ns.lpsr[1490] = -1524669824;
        ns.lpsr[1491] = -866180579;
        ns.lpsr[1492] = 569023043;
        ns.lpsr[1493] = 1777523864;
        ns.lpsr[1494] = -2104409767;
        ns.lpsr[1495] = -857288367;
        ns.lpsr[1496] = -446316231;
        ns.lpsr[1497] = 326285787;
        ns.lpsr[1498] = 1546217814;
        ns.lpsr[1499] = -716743004;
    }

    private static /* synthetic */ void ltqs() {
        ns.lpss[500] = -485838330;
        ns.lpss[501] = 209182600;
        ns.lpss[502] = 1649941704;
        ns.lpss[503] = 673395338;
        ns.lpss[504] = 1821531653;
        ns.lpss[505] = -1073184961;
        ns.lpss[506] = 218436829;
        ns.lpss[507] = -1659378565;
        ns.lpss[508] = -144498381;
        ns.lpss[509] = -1518537065;
        ns.lpss[510] = -1658439319;
        ns.lpss[511] = -1676327651;
        ns.lpss[512] = -774348881;
        ns.lpss[513] = -1630421509;
        ns.lpss[514] = 1080449640;
        ns.lpss[515] = 1492414862;
        ns.lpss[516] = 1856161076;
        ns.lpss[517] = -1436917754;
        ns.lpss[518] = -1357992804;
        ns.lpss[519] = -1343045640;
        ns.lpss[520] = 301071482;
        ns.lpss[521] = -528980207;
        ns.lpss[522] = -389224051;
        ns.lpss[523] = -2105476791;
        ns.lpss[524] = -847775524;
        ns.lpss[525] = -799338484;
        ns.lpss[526] = -1603474479;
        ns.lpss[527] = 1583348265;
        ns.lpss[528] = 1495578170;
        ns.lpss[529] = 344381073;
        ns.lpss[530] = -1143387251;
        ns.lpss[531] = 1278340904;
        ns.lpss[532] = 453219104;
        ns.lpss[533] = -599708106;
        ns.lpss[534] = 194095399;
        ns.lpss[535] = -336724702;
        ns.lpss[536] = 566641837;
        ns.lpss[537] = 1692172122;
        ns.lpss[538] = -1753823333;
        ns.lpss[539] = 825338850;
        ns.lpss[540] = -1190767024;
        ns.lpss[541] = 1157066394;
        ns.lpss[542] = -1845431202;
        ns.lpss[543] = -2122064259;
        ns.lpss[544] = 1458286773;
        ns.lpss[545] = 344551743;
        ns.lpss[546] = 1197250315;
        ns.lpss[547] = -804508987;
        ns.lpss[548] = 429288525;
        ns.lpss[549] = 1626913854;
        ns.lpss[550] = -1333677475;
        ns.lpss[551] = 191061999;
        ns.lpss[552] = 1662021492;
        ns.lpss[553] = 718395888;
        ns.lpss[554] = 1198575570;
        ns.lpss[555] = -1435946138;
        ns.lpss[556] = -184648528;
        ns.lpss[557] = -508832507;
        ns.lpss[558] = 1994424715;
        ns.lpss[559] = -1845008677;
        ns.lpss[560] = -1956814535;
        ns.lpss[561] = -1741709641;
        ns.lpss[562] = -1222205834;
        ns.lpss[563] = -193780671;
        ns.lpss[564] = 423009454;
        ns.lpss[565] = -1897150574;
        ns.lpss[566] = -364859871;
        ns.lpss[567] = -1214655501;
        ns.lpss[568] = 752921117;
        ns.lpss[569] = 944469917;
        ns.lpss[570] = -1868961521;
        ns.lpss[571] = -2137956252;
        ns.lpss[572] = 818367921;
        ns.lpss[573] = 1349320269;
        ns.lpss[574] = -1763605812;
        ns.lpss[575] = 1463694276;
        ns.lpss[576] = 1707121832;
        ns.lpss[577] = -1549684048;
        ns.lpss[578] = 1177588598;
        ns.lpss[579] = -32088913;
        ns.lpss[580] = -131201622;
        ns.lpss[581] = -1675673600;
        ns.lpss[582] = -1244974028;
        ns.lpss[583] = 1643159254;
        ns.lpss[584] = -719682442;
        ns.lpss[585] = -58102486;
        ns.lpss[586] = 1985768616;
        ns.lpss[587] = 658708633;
        ns.lpss[588] = -416903440;
        ns.lpss[589] = -252361243;
        ns.lpss[590] = -1378193182;
        ns.lpss[591] = 147636619;
        ns.lpss[592] = -324112852;
        ns.lpss[593] = -710475964;
        ns.lpss[594] = 695065261;
        ns.lpss[595] = -1262228391;
        ns.lpss[596] = 144309347;
        ns.lpss[597] = 1067281693;
        ns.lpss[598] = -937818900;
        ns.lpss[599] = 235585511;
    }

    private static /* synthetic */ void ltqu() {
        ns.lpss[700] = 878063010;
        ns.lpss[701] = 814892916;
        ns.lpss[702] = -845777584;
        ns.lpss[703] = 88210090;
        ns.lpss[704] = -838095232;
        ns.lpss[705] = -1194012558;
        ns.lpss[706] = -1187958325;
        ns.lpss[707] = 440896579;
        ns.lpss[708] = -866755659;
        ns.lpss[709] = 781986743;
        ns.lpss[710] = -1559191336;
        ns.lpss[711] = 938107461;
        ns.lpss[712] = -22291624;
        ns.lpss[713] = 950249540;
        ns.lpss[714] = 1601981099;
        ns.lpss[715] = 698311476;
        ns.lpss[716] = -1659205837;
        ns.lpss[717] = -166301533;
        ns.lpss[718] = -277197503;
        ns.lpss[719] = -1131941330;
        ns.lpss[720] = 210636671;
        ns.lpss[721] = 1052045408;
        ns.lpss[722] = -1999518010;
        ns.lpss[723] = 541004679;
        ns.lpss[724] = 1970603505;
        ns.lpss[725] = 568761528;
        ns.lpss[726] = -924909002;
        ns.lpss[727] = -1971599723;
        ns.lpss[728] = -200960775;
        ns.lpss[729] = 458429584;
        ns.lpss[730] = -1184150971;
        ns.lpss[731] = 1352575175;
        ns.lpss[732] = 1753212744;
        ns.lpss[733] = 1306053544;
        ns.lpss[734] = 1970570883;
        ns.lpss[735] = 2098083324;
        ns.lpss[736] = 380699539;
        ns.lpss[737] = -1872317168;
        ns.lpss[738] = -336656709;
        ns.lpss[739] = 279329297;
        ns.lpss[740] = -1360977769;
        ns.lpss[741] = 1184997594;
        ns.lpss[742] = 709763228;
        ns.lpss[743] = 129255356;
        ns.lpss[744] = -1551583908;
        ns.lpss[745] = -392871664;
        ns.lpss[746] = 1447461787;
        ns.lpss[747] = 1464092823;
        ns.lpss[748] = -155727428;
        ns.lpss[749] = -63174168;
        ns.lpss[750] = -939038953;
        ns.lpss[751] = 941455999;
        ns.lpss[752] = -721466586;
        ns.lpss[753] = -928489162;
        ns.lpss[754] = -1437206851;
        ns.lpss[755] = -1711182305;
        ns.lpss[756] = 1212443039;
        ns.lpss[757] = -1739796191;
        ns.lpss[758] = -423059155;
        ns.lpss[759] = -1195124025;
        ns.lpss[760] = 985284874;
        ns.lpss[761] = 1300771353;
        ns.lpss[762] = -1743377187;
        ns.lpss[763] = -823436414;
        ns.lpss[764] = -1784786264;
        ns.lpss[765] = -445251576;
        ns.lpss[766] = -1924745410;
        ns.lpss[767] = 1677224294;
        ns.lpss[768] = -992804324;
        ns.lpss[769] = -395237587;
        ns.lpss[770] = 10531658;
        ns.lpss[771] = 1017500164;
        ns.lpss[772] = -1962467182;
        ns.lpss[773] = 313699584;
        ns.lpss[774] = 492388778;
        ns.lpss[775] = -1658093735;
        ns.lpss[776] = -1838063828;
        ns.lpss[777] = 471123032;
        ns.lpss[778] = -1447841145;
        ns.lpss[779] = 1577097041;
        ns.lpss[780] = 432437109;
        ns.lpss[781] = 1215108222;
        ns.lpss[782] = -2082054935;
        ns.lpss[783] = -314185593;
        ns.lpss[784] = -1980285990;
        ns.lpss[785] = 1051214397;
        ns.lpss[786] = -1596111022;
        ns.lpss[787] = -31083013;
        ns.lpss[788] = 446797421;
        ns.lpss[789] = 964152999;
        ns.lpss[790] = -2138943559;
        ns.lpss[791] = -384228559;
        ns.lpss[792] = -1798627761;
        ns.lpss[793] = 1067013868;
        ns.lpss[794] = -1052066618;
        ns.lpss[795] = -894458588;
        ns.lpss[796] = -1527929619;
        ns.lpss[797] = -530876482;
        ns.lpss[798] = 1820997915;
        ns.lpss[799] = -2143912996;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void onLanding() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns.uk - ns.lpst("lrgq", lptv(int ), (int)263)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ns.lpst("lrgr", lpsq(int ), (int)768)) break;
            v0 /* !! */  = (long)ns.lpst("lrgs", lpsq(int ), (int)769);
        }
        var3_1 = ns.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lrgt", lptv(int ), (int)264)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ns.lpst("lrgu", lpsq(int ), (int)770)) break;
            v1 /* !! */  = (long)ns.lpst("lrgv", lpsq(int ), (int)771);
        }
        var2_2 /* !! */  = ns.b;
        v2 /* !! */  = ns.uk;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ns.lpst("lrgw", lptv(int ), (int)265));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1493240247: {
                    v3 = ns.lpst("lrgx", lptv(int ), (int)266);
                    continue block21;
                }
                case -1025695166: {
                    v3 = ns.lpst("lrgy", lptv(int ), (int)267);
                    continue block21;
                }
                case 304457984: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = ns.a;
        if (var3_1) {
            throw null;
lbl31:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        v4 /* !! */  = ns.uk;
        if (true) ** GOTO lbl38
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - ns.lpst("lrgz", lptv(int ), (int)268));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1357997854: {
                    v5 = ns.lpst("lrha", lptv(int ), (int)269);
                    continue block23;
                }
                case -287774379: {
                    v5 = ns.lpst("lrhb", lptv(int ), (int)270);
                    continue block23;
                }
                case 304457984: {
                    break block23;
                }
                case 499329306: {
                    v5 = ns.lpst("lrhc", lptv(int ), (int)271);
                    continue block23;
                }
            }
            break;
        }
        this.fallDistance = 0.0f;
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl58:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("lrhd", lpsq(int ), (int)772);
                } while (!var3_1);
                throw null;
            }
lbl63:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ns.lpst("lrhe", lpsq(int ), (int)773);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ns.lpst("lrhf", lpsq(int ), (int)774);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ns.lpst("lrhg", lpsq(int ), (int)775);
                    if (!var3_1) ** GOTO lbl63
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ns.lpst("lrhh", lpsq(int ), (int)776);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ns.lpst("lrhi", lpsq(int ), (int)777);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ltrm() {
        ns.lptw[700] = 6055300913353669527L;
        ns.lptw[701] = -637465718316742251L;
        ns.lptw[702] = 4581242686312856116L;
        ns.lptw[703] = -4305410796884559710L;
        ns.lptw[704] = 1731043850092968742L;
        ns.lptw[705] = 5979336115786194777L;
        ns.lptw[706] = 6995796280021932922L;
        ns.lptw[707] = 3706959541270277400L;
        ns.lptw[708] = -6190169231314700327L;
        ns.lptw[709] = -4675325468706220984L;
        ns.lptw[710] = 821816998594187411L;
        ns.lptw[711] = -530737764190209499L;
        ns.lptw[712] = -4731998200656008947L;
        ns.lptw[713] = 6852999344453674038L;
        ns.lptw[714] = -6904680734377840768L;
        ns.lptw[715] = 1284631099941240184L;
        ns.lptw[716] = -3537483094197020834L;
        ns.lptw[717] = -1771073546446997931L;
        ns.lptw[718] = 2056688132317643934L;
        ns.lptw[719] = -2094420200811148096L;
        ns.lptw[720] = -7133630819155639896L;
        ns.lptw[721] = 4522093367282279505L;
        ns.lptw[722] = 2980027743291446414L;
        ns.lptw[723] = -4356910238413604438L;
        ns.lptw[724] = 7561316082775288729L;
        ns.lptw[725] = 6740872167108019330L;
        ns.lptw[726] = 5877001576520591517L;
        ns.lptw[727] = -2813783524054151831L;
        ns.lptw[728] = 1946362197047218399L;
        ns.lptw[729] = 7091096643601095127L;
        ns.lptw[730] = -6943326614995589342L;
        ns.lptw[731] = -2483179341569560655L;
        ns.lptw[732] = -858809956072444648L;
        ns.lptw[733] = -5043117127535088217L;
        ns.lptw[734] = 1164969903357850368L;
        ns.lptw[735] = 3229494372307723728L;
        ns.lptw[736] = -7203398975670286395L;
        ns.lptw[737] = -3814040019966872916L;
        ns.lptw[738] = 5217310931301056107L;
        ns.lptw[739] = -6757150735581984335L;
        ns.lptw[740] = 8890199641961301812L;
        ns.lptw[741] = 5267011799956664453L;
        ns.lptw[742] = -188910972779154569L;
        ns.lptw[743] = -7820527351567611522L;
        ns.lptw[744] = -5779255545850878253L;
        ns.lptw[745] = 6868798990957365830L;
        ns.lptw[746] = 405056122038400691L;
        ns.lptw[747] = -510403361881446521L;
        ns.lptw[748] = 8012855594901150870L;
        ns.lptw[749] = -6058661022314644666L;
        ns.lptw[750] = 6276676757744777274L;
        ns.lptw[751] = 3319525579467742020L;
        ns.lptw[752] = 7686476558602791669L;
        ns.lptw[753] = 6564888197501237878L;
        ns.lptw[754] = -9188479518125426271L;
        ns.lptw[755] = 2072453233528157461L;
        ns.lptw[756] = 1528602787789942183L;
        ns.lptw[757] = 6278170742337329341L;
        ns.lptw[758] = 253773964264288265L;
        ns.lptw[759] = -3300471846856923732L;
        ns.lptw[760] = -5380635301515643260L;
        ns.lptw[761] = -8032919875073257830L;
        ns.lptw[762] = 2484306571117488871L;
        ns.lptw[763] = 1133748909047115641L;
        ns.lptw[764] = -4321061679001645208L;
        ns.lptw[765] = 5237189303341131659L;
        ns.lptw[766] = -7631485316158685524L;
        ns.lptw[767] = 8377142408711454813L;
        ns.lptw[768] = -5540876511978026323L;
        ns.lptw[769] = 3872321510526084889L;
        ns.lptw[770] = -4900929013299822209L;
        ns.lptw[771] = 761221917240391807L;
        ns.lptw[772] = 3751005394824876592L;
        ns.lptw[773] = 818715993020970215L;
        ns.lptw[774] = -9213575020330713451L;
        ns.lptw[775] = 2204131301020090326L;
        ns.lptw[776] = -2384901605490049211L;
        ns.lptw[777] = 6915122476892792287L;
        ns.lptw[778] = -4118179621068073009L;
        ns.lptw[779] = -7877165315852830252L;
        ns.lptw[780] = 6944108377748905889L;
        ns.lptw[781] = -7307969470388081042L;
        ns.lptw[782] = -706223986868307178L;
        ns.lptw[783] = -6227144810683171349L;
        ns.lptw[784] = 382029440169113847L;
        ns.lptw[785] = 476100416142579825L;
        ns.lptw[786] = -4467536499787882639L;
        ns.lptw[787] = -9174787085673241925L;
        ns.lptw[788] = -7358401871420615065L;
        ns.lptw[789] = 3886825371347975770L;
        ns.lptw[790] = -8967434711752536523L;
        ns.lptw[791] = 8620537743075346637L;
        ns.lptw[792] = -7385485919818882242L;
        ns.lptw[793] = -3025845234848440579L;
        ns.lptw[794] = -1194242872976186631L;
        ns.lptw[795] = 8302233030189769498L;
        ns.lptw[796] = 5233359287993531312L;
        ns.lptw[797] = -6330178483049448700L;
        ns.lptw[798] = 1781407087777002047L;
        ns.lptw[799] = -8348672378969801369L;
    }

    private static /* synthetic */ void ltrt() {
        ns.lptx[400] = 500376580099423377L;
        ns.lptx[401] = -8871427790072445126L;
        ns.lptx[402] = -7217034261207285410L;
        ns.lptx[403] = -506915971994631155L;
        ns.lptx[404] = 5908292324772768367L;
        ns.lptx[405] = -4353069381089422411L;
        ns.lptx[406] = -994818564351988054L;
        ns.lptx[407] = -4971443799603969283L;
        ns.lptx[408] = 1631640865636984260L;
        ns.lptx[409] = -4705140542659945682L;
        ns.lptx[410] = 7870985376708630399L;
        ns.lptx[411] = -3719198770276651369L;
        ns.lptx[412] = 3392637412326875221L;
        ns.lptx[413] = 6324201036557900442L;
        ns.lptx[414] = -2330473649306414152L;
        ns.lptx[415] = -639162700317063771L;
        ns.lptx[416] = -9145989954307114656L;
        ns.lptx[417] = -5270044835283999862L;
        ns.lptx[418] = 812073641249422129L;
        ns.lptx[419] = -1333016770714850981L;
        ns.lptx[420] = -3367034171292142711L;
        ns.lptx[421] = -8395175230904321962L;
        ns.lptx[422] = -7756823376109127745L;
        ns.lptx[423] = 6754789582645684667L;
        ns.lptx[424] = 4859991903144974513L;
        ns.lptx[425] = -3804735450248221409L;
        ns.lptx[426] = -3329740419284643217L;
        ns.lptx[427] = -5099865106167596789L;
        ns.lptx[428] = 4043446468699445065L;
        ns.lptx[429] = -2875623409530318079L;
        ns.lptx[430] = -7373188502106663789L;
        ns.lptx[431] = 5709137708920220246L;
        ns.lptx[432] = 20356139106220306L;
        ns.lptx[433] = 5113961904299630784L;
        ns.lptx[434] = -2850234039322038107L;
        ns.lptx[435] = -3353195564912474900L;
        ns.lptx[436] = -2889985970420385840L;
        ns.lptx[437] = -3583703857496231190L;
        ns.lptx[438] = 5908869898269354742L;
        ns.lptx[439] = 1059953198714326208L;
        ns.lptx[440] = -878540061280037642L;
        ns.lptx[441] = 5173301072950028016L;
        ns.lptx[442] = 2271530060603497943L;
        ns.lptx[443] = -7311425472440521567L;
        ns.lptx[444] = 2117311137842659171L;
        ns.lptx[445] = -716386361000803264L;
        ns.lptx[446] = -1046801407656328924L;
        ns.lptx[447] = -8804122313575853303L;
        ns.lptx[448] = -6134729417642374618L;
        ns.lptx[449] = -8881553639006149289L;
        ns.lptx[450] = -1314087658038440576L;
        ns.lptx[451] = -6228611414783588561L;
        ns.lptx[452] = -6507627705779614190L;
        ns.lptx[453] = 6313917075673028145L;
        ns.lptx[454] = -3794975183272926393L;
        ns.lptx[455] = 6491600455319291017L;
        ns.lptx[456] = -1497898224966857496L;
        ns.lptx[457] = 9161361572291419981L;
        ns.lptx[458] = 3216044790871994680L;
        ns.lptx[459] = -9039312759702209515L;
        ns.lptx[460] = 1766917189575663082L;
        ns.lptx[461] = 3949844625054732336L;
        ns.lptx[462] = 1359689618733223425L;
        ns.lptx[463] = 6988027807948459244L;
        ns.lptx[464] = -6506459879522802416L;
        ns.lptx[465] = -626310670346344892L;
        ns.lptx[466] = -974802430669951638L;
        ns.lptx[467] = 6678195255390189750L;
        ns.lptx[468] = 3413666801863130101L;
        ns.lptx[469] = 2618359282423348849L;
        ns.lptx[470] = 8525974113914027746L;
        ns.lptx[471] = 3111225466331699903L;
        ns.lptx[472] = 4143914833609697783L;
        ns.lptx[473] = 784678161840884539L;
        ns.lptx[474] = 7011710999988070538L;
        ns.lptx[475] = -4389584306707097002L;
        ns.lptx[476] = 6272365334262390884L;
        ns.lptx[477] = -2763252376079831534L;
        ns.lptx[478] = 8251654071852540719L;
        ns.lptx[479] = 2644344466444895814L;
        ns.lptx[480] = 5558556161962432442L;
        ns.lptx[481] = -1455823646055882381L;
        ns.lptx[482] = -7865043402677522954L;
        ns.lptx[483] = 6473614957240688521L;
        ns.lptx[484] = -2390363430834026052L;
        ns.lptx[485] = 4861500778631915778L;
        ns.lptx[486] = 260935386271006049L;
        ns.lptx[487] = -3494978376779595533L;
        ns.lptx[488] = -429883326962780382L;
        ns.lptx[489] = -5785325448937727371L;
        ns.lptx[490] = -2286373184476917255L;
        ns.lptx[491] = -3078697669163974193L;
        ns.lptx[492] = -7667679940689460057L;
        ns.lptx[493] = 5437710707998396421L;
        ns.lptx[494] = 2705998106050132973L;
        ns.lptx[495] = 9111813198823763372L;
        ns.lptx[496] = 8684554282588927128L;
        ns.lptx[497] = 6254662624583727322L;
        ns.lptx[498] = -8981112517025452823L;
        ns.lptx[499] = 5063511957505578270L;
    }

    private static /* synthetic */ void ltqg() {
        ns.lpsr[1100] = 715962484;
        ns.lpsr[1101] = -1180706405;
        ns.lpsr[1102] = 1389059935;
        ns.lpsr[1103] = -784394241;
        ns.lpsr[1104] = 1027619934;
        ns.lpsr[1105] = -386360829;
        ns.lpsr[1106] = -1160843302;
        ns.lpsr[1107] = -1000229944;
        ns.lpsr[1108] = 3072364;
        ns.lpsr[1109] = -967990690;
        ns.lpsr[1110] = -245103992;
        ns.lpsr[1111] = -1713635476;
        ns.lpsr[1112] = 1530066267;
        ns.lpsr[1113] = -1548998881;
        ns.lpsr[1114] = 1641427081;
        ns.lpsr[1115] = -981746078;
        ns.lpsr[1116] = 412233210;
        ns.lpsr[1117] = 717646804;
        ns.lpsr[1118] = 475758573;
        ns.lpsr[1119] = -2078495681;
        ns.lpsr[1120] = -913384558;
        ns.lpsr[1121] = 1969649572;
        ns.lpsr[1122] = 1125817957;
        ns.lpsr[1123] = -648531544;
        ns.lpsr[1124] = -742859919;
        ns.lpsr[1125] = 2120807025;
        ns.lpsr[1126] = 194560974;
        ns.lpsr[1127] = -1377572273;
        ns.lpsr[1128] = -21480790;
        ns.lpsr[1129] = 1224195024;
        ns.lpsr[1130] = -109388371;
        ns.lpsr[1131] = 2071119156;
        ns.lpsr[1132] = 242149777;
        ns.lpsr[1133] = 1940061353;
        ns.lpsr[1134] = 350004927;
        ns.lpsr[1135] = 746231907;
        ns.lpsr[1136] = -1659927189;
        ns.lpsr[1137] = 1671951372;
        ns.lpsr[1138] = 1191992478;
        ns.lpsr[1139] = -137662647;
        ns.lpsr[1140] = -429073639;
        ns.lpsr[1141] = -1772053605;
        ns.lpsr[1142] = 1642586396;
        ns.lpsr[1143] = 1151067899;
        ns.lpsr[1144] = 2130212061;
        ns.lpsr[1145] = -1981624641;
        ns.lpsr[1146] = -725956909;
        ns.lpsr[1147] = -1827791695;
        ns.lpsr[1148] = 1288468366;
        ns.lpsr[1149] = 941590697;
        ns.lpsr[1150] = 598461902;
        ns.lpsr[1151] = 1903962645;
        ns.lpsr[1152] = -1122511437;
        ns.lpsr[1153] = 1192927310;
        ns.lpsr[1154] = 1811062683;
        ns.lpsr[1155] = 415939542;
        ns.lpsr[1156] = -1240283062;
        ns.lpsr[1157] = 1306668091;
        ns.lpsr[1158] = 1191383468;
        ns.lpsr[1159] = 1921232062;
        ns.lpsr[1160] = -1320696549;
        ns.lpsr[1161] = -1880288014;
        ns.lpsr[1162] = 1986626075;
        ns.lpsr[1163] = -272910558;
        ns.lpsr[1164] = -1152222880;
        ns.lpsr[1165] = -1971899471;
        ns.lpsr[1166] = 1795079079;
        ns.lpsr[1167] = -125581383;
        ns.lpsr[1168] = 1422220219;
        ns.lpsr[1169] = 1769757818;
        ns.lpsr[1170] = -1747081941;
        ns.lpsr[1171] = -58555943;
        ns.lpsr[1172] = 12057990;
        ns.lpsr[1173] = 1096892294;
        ns.lpsr[1174] = 933528147;
        ns.lpsr[1175] = 818114886;
        ns.lpsr[1176] = 1617036967;
        ns.lpsr[1177] = -983917149;
        ns.lpsr[1178] = 1432911940;
        ns.lpsr[1179] = 729722034;
        ns.lpsr[1180] = 1673430087;
        ns.lpsr[1181] = -560226353;
        ns.lpsr[1182] = 1103861642;
        ns.lpsr[1183] = -1911822264;
        ns.lpsr[1184] = 1190402454;
        ns.lpsr[1185] = -39234851;
        ns.lpsr[1186] = -1840966724;
        ns.lpsr[1187] = 1331287004;
        ns.lpsr[1188] = 1064890713;
        ns.lpsr[1189] = 929241118;
        ns.lpsr[1190] = -101010864;
        ns.lpsr[1191] = -2130011142;
        ns.lpsr[1192] = -1426402508;
        ns.lpsr[1193] = -419560198;
        ns.lpsr[1194] = -1901957458;
        ns.lpsr[1195] = -870508348;
        ns.lpsr[1196] = 575175332;
        ns.lpsr[1197] = -1795168298;
        ns.lpsr[1198] = 494012244;
        ns.lpsr[1199] = -1669267502;
    }

    private static /* synthetic */ void ltqk() {
        ns.lpsr[1500] = 1280236032;
        ns.lpsr[1501] = 1513773158;
        ns.lpsr[1502] = -1676878029;
        ns.lpsr[1503] = -878763661;
        ns.lpsr[1504] = -2070402543;
        ns.lpsr[1505] = 2011541373;
        ns.lpsr[1506] = -1535250655;
        ns.lpsr[1507] = -625282767;
        ns.lpsr[1508] = -1113036100;
        ns.lpsr[1509] = -1419064642;
        ns.lpsr[1510] = 58614169;
        ns.lpsr[1511] = -1481934321;
        ns.lpsr[1512] = -1654660456;
        ns.lpsr[1513] = -604049493;
        ns.lpsr[1514] = -1305257351;
        ns.lpsr[1515] = -728604611;
        ns.lpsr[1516] = -1337484002;
        ns.lpsr[1517] = 470120021;
        ns.lpsr[1518] = 979545038;
        ns.lpsr[1519] = -156060719;
        ns.lpsr[1520] = -1464502848;
        ns.lpsr[1521] = 1637312587;
        ns.lpsr[1522] = -2131725333;
        ns.lpsr[1523] = -372239972;
        ns.lpsr[1524] = -382856398;
        ns.lpsr[1525] = -604397633;
        ns.lpsr[1526] = -1271948997;
        ns.lpsr[1527] = -834708942;
        ns.lpsr[1528] = -860103566;
        ns.lpsr[1529] = -1249488442;
        ns.lpsr[1530] = -170183571;
        ns.lpsr[1531] = -313181875;
        ns.lpsr[1532] = -62773010;
        ns.lpsr[1533] = 614030149;
        ns.lpsr[1534] = -1455321725;
        ns.lpsr[1535] = 1855325726;
        ns.lpsr[1536] = 899084164;
        ns.lpsr[1537] = -1288154718;
        ns.lpsr[1538] = -917306752;
        ns.lpsr[1539] = 703829066;
        ns.lpsr[1540] = 1974481562;
        ns.lpsr[1541] = -1893718834;
        ns.lpsr[1542] = -276477127;
        ns.lpsr[1543] = -669894999;
        ns.lpsr[1544] = -474470467;
        ns.lpsr[1545] = -350345334;
        ns.lpsr[1546] = -2142987770;
        ns.lpsr[1547] = 122468812;
        ns.lpsr[1548] = -208132416;
        ns.lpsr[1549] = -2107580153;
        ns.lpsr[1550] = -1084135986;
        ns.lpsr[1551] = 2027848230;
        ns.lpsr[1552] = 1000326739;
        ns.lpsr[1553] = -807568434;
        ns.lpsr[1554] = -441088474;
        ns.lpsr[1555] = -668678708;
        ns.lpsr[1556] = 1963066102;
        ns.lpsr[1557] = 619021284;
        ns.lpsr[1558] = 2005358394;
        ns.lpsr[1559] = 1832859701;
        ns.lpsr[1560] = 578119017;
        ns.lpsr[1561] = 2038211092;
        ns.lpsr[1562] = 554237049;
        ns.lpsr[1563] = -1635660910;
        ns.lpsr[1564] = 1436574306;
        ns.lpsr[1565] = 1020492278;
        ns.lpsr[1566] = 785892691;
        ns.lpsr[1567] = 2080299728;
        ns.lpsr[1568] = 1200193007;
        ns.lpsr[1569] = -1899759624;
        ns.lpsr[1570] = -1770691200;
        ns.lpsr[1571] = -145181232;
        ns.lpsr[1572] = 376003698;
        ns.lpsr[1573] = -1793015615;
        ns.lpsr[1574] = -2024189459;
        ns.lpsr[1575] = 722624271;
        ns.lpsr[1576] = -625332448;
        ns.lpsr[1577] = -1006866629;
        ns.lpsr[1578] = 656746096;
        ns.lpsr[1579] = 1686024278;
        ns.lpsr[1580] = 102627331;
        ns.lpsr[1581] = -356770988;
        ns.lpsr[1582] = 741773521;
        ns.lpsr[1583] = 552379437;
        ns.lpsr[1584] = -2008431071;
        ns.lpsr[1585] = 314987352;
        ns.lpsr[1586] = -1970728004;
        ns.lpsr[1587] = 106181822;
        ns.lpsr[1588] = 937445637;
        ns.lpsr[1589] = -1207042561;
        ns.lpsr[1590] = -520458621;
        ns.lpsr[1591] = -851400369;
        ns.lpsr[1592] = -758865796;
        ns.lpsr[1593] = -1925408570;
        ns.lpsr[1594] = 2099724318;
        ns.lpsr[1595] = 1124192238;
        ns.lpsr[1596] = 841680191;
        ns.lpsr[1597] = -1839071359;
        ns.lpsr[1598] = -709795466;
        ns.lpsr[1599] = 886348092;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private float getMovementSpeed() {
        boolean bl2;
        Object object = uk;
        boolean bl3 = true;
        block6: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ns.lpst("lrah", lptv(int ), (int)251);
            }
            switch ((int)object) {
                case -2100885921: {
                    callSite = ns.lpst("lrai", lptv(int ), (int)252);
                    continue block6;
                }
                case -143564090: {
                    callSite = ns.lpst("lraj", lptv(int ), (int)253);
                    continue block6;
                }
                case -91267064: {
                    callSite = ns.lpst("lrak", lptv(int ), (int)254);
                    continue block6;
                }
                case 304457984: {
                    break block6;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = uk - ns.lpst("lral", lptv(int ), (int)255)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ns.lpst("lram", lpsq(int ), (int)615)) break;
            object2 = ns.lpst("lran", lpsq(int ), (int)616);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = uk - ns.lpst("lrao", lptv(int ), (int)256)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ns.lpst("lrap", lpsq(int ), (int)617)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ns.lpst("lraq", lpsq(int ), (int)618);
        }
        if (!bl2 && !bl2) return (float)ns.lpst("lras", lqfy(int ), (int)620);
        return (float)ns.lpst("lrar", lqfy(int ), (int)619);
    }

    private static /* synthetic */ void ltrk() {
        ns.lptw[500] = -6298552336929521222L;
        ns.lptw[501] = -8774077173967864366L;
        ns.lptw[502] = 1908264049342343668L;
        ns.lptw[503] = 2273310792338770749L;
        ns.lptw[504] = -625438051168853050L;
        ns.lptw[505] = 1174592473378511436L;
        ns.lptw[506] = -5227554105516151974L;
        ns.lptw[507] = -8773121340967705164L;
        ns.lptw[508] = -7194857940144583580L;
        ns.lptw[509] = -4330933372198829008L;
        ns.lptw[510] = 6791636922194859399L;
        ns.lptw[511] = -8694260723725294809L;
        ns.lptw[512] = -6324322717827637211L;
        ns.lptw[513] = -6864359063081299448L;
        ns.lptw[514] = -4159256000627455767L;
        ns.lptw[515] = -6393396993805944888L;
        ns.lptw[516] = 7889262929141972537L;
        ns.lptw[517] = 4238855876396253375L;
        ns.lptw[518] = -7202145531338370004L;
        ns.lptw[519] = -4039182307268718069L;
        ns.lptw[520] = 5078030395299807606L;
        ns.lptw[521] = -4822966931316097587L;
        ns.lptw[522] = -3588735308150245023L;
        ns.lptw[523] = -2494352533163691169L;
        ns.lptw[524] = -7097634435141827554L;
        ns.lptw[525] = 8074947803913091783L;
        ns.lptw[526] = 6960248682429137405L;
        ns.lptw[527] = 2234144954616964014L;
        ns.lptw[528] = -8335727992648608583L;
        ns.lptw[529] = 5232763599628729879L;
        ns.lptw[530] = 4512004724830802464L;
        ns.lptw[531] = 3957345409408031742L;
        ns.lptw[532] = -9043894184849441821L;
        ns.lptw[533] = 6177649851068575682L;
        ns.lptw[534] = -6384922090172560049L;
        ns.lptw[535] = 232742993898171353L;
        ns.lptw[536] = -2996980543003789074L;
        ns.lptw[537] = -5818924490001266793L;
        ns.lptw[538] = -7242489829354881899L;
        ns.lptw[539] = -3282472447661441688L;
        ns.lptw[540] = 6524361050564461809L;
        ns.lptw[541] = -1642849451041471433L;
        ns.lptw[542] = -6979698999725031219L;
        ns.lptw[543] = 9057829483077853522L;
        ns.lptw[544] = 1722261633500948826L;
        ns.lptw[545] = -5846692955880437988L;
        ns.lptw[546] = -3867181007130877964L;
        ns.lptw[547] = 3970194516658787699L;
        ns.lptw[548] = 7566677065916547673L;
        ns.lptw[549] = 5453822554238461480L;
        ns.lptw[550] = 946144756791405887L;
        ns.lptw[551] = 7719242215025480149L;
        ns.lptw[552] = -984570908483652625L;
        ns.lptw[553] = 7393632357536373092L;
        ns.lptw[554] = -8767955161750760676L;
        ns.lptw[555] = 4857942345808361890L;
        ns.lptw[556] = -4550937183318712200L;
        ns.lptw[557] = -2844754582897446266L;
        ns.lptw[558] = -6885778447465604577L;
        ns.lptw[559] = -6109224055003571550L;
        ns.lptw[560] = -1497324251680947461L;
        ns.lptw[561] = -1182015565921062103L;
        ns.lptw[562] = 7150919878938185646L;
        ns.lptw[563] = -8559774792136247458L;
        ns.lptw[564] = 6429688171458940784L;
        ns.lptw[565] = -59105741445693454L;
        ns.lptw[566] = -7997374325788512322L;
        ns.lptw[567] = 2089579975513484278L;
        ns.lptw[568] = -5067119754448266895L;
        ns.lptw[569] = 7794355773570459474L;
        ns.lptw[570] = 244960633652636922L;
        ns.lptw[571] = -4161812230746385806L;
        ns.lptw[572] = -5696855086715648048L;
        ns.lptw[573] = -6953956020888309119L;
        ns.lptw[574] = 5978077411696707684L;
        ns.lptw[575] = -7237078539044125933L;
        ns.lptw[576] = -670223908460618113L;
        ns.lptw[577] = 2194370342165465287L;
        ns.lptw[578] = -1167309608968117525L;
        ns.lptw[579] = -1239231370241766029L;
        ns.lptw[580] = -3275815910768167022L;
        ns.lptw[581] = 2213240478719178821L;
        ns.lptw[582] = -1742997549180232157L;
        ns.lptw[583] = 7061117423285483232L;
        ns.lptw[584] = -7038423921721031786L;
        ns.lptw[585] = -5902875130881667768L;
        ns.lptw[586] = -8206142233139726089L;
        ns.lptw[587] = -4451745766119945377L;
        ns.lptw[588] = 5648554188266553221L;
        ns.lptw[589] = 169064655272345160L;
        ns.lptw[590] = 8136170565823670500L;
        ns.lptw[591] = 6544653985729254832L;
        ns.lptw[592] = -114970011158813193L;
        ns.lptw[593] = 4571805298742085457L;
        ns.lptw[594] = 345595335222630703L;
        ns.lptw[595] = -7103099803691712640L;
        ns.lptw[596] = -64792792824263733L;
        ns.lptw[597] = -3936584386651054785L;
        ns.lptw[598] = 5169989376016579389L;
        ns.lptw[599] = -2370083257221672826L;
    }

    private static /* synthetic */ void ltrp() {
        ns.lptx[0] = -8721073458488588600L;
        ns.lptx[1] = -3874346491183636243L;
        ns.lptx[2] = 3853777449580681685L;
        ns.lptx[3] = -1152567892075285303L;
        ns.lptx[4] = -5568091105254036888L;
        ns.lptx[5] = 7158634760510530800L;
        ns.lptx[6] = -7969855868683905112L;
        ns.lptx[7] = 4569222722891953093L;
        ns.lptx[8] = -2114058205065956842L;
        ns.lptx[9] = -4640255147419981353L;
        ns.lptx[10] = -8021767637852428460L;
        ns.lptx[11] = -6220834492207785660L;
        ns.lptx[12] = -9117220148343797237L;
        ns.lptx[13] = -3883362398275898354L;
        ns.lptx[14] = 6040092754712667839L;
        ns.lptx[15] = -7698747770120756506L;
        ns.lptx[16] = -9163944675194742702L;
        ns.lptx[17] = 1530880334197512600L;
        ns.lptx[18] = 2042355009190031366L;
        ns.lptx[19] = 8581414667623386370L;
        ns.lptx[20] = -1491385330937447880L;
        ns.lptx[21] = -6305329618583842613L;
        ns.lptx[22] = 8675569808713004245L;
        ns.lptx[23] = -8864123347825967045L;
        ns.lptx[24] = 4774163568210654464L;
        ns.lptx[25] = 5590917364399664741L;
        ns.lptx[26] = 6736965938395896869L;
        ns.lptx[27] = 1245486912933698619L;
        ns.lptx[28] = 4458229428403705097L;
        ns.lptx[29] = 379184282560858498L;
        ns.lptx[30] = -7844327662330505672L;
        ns.lptx[31] = -8036389321670174622L;
        ns.lptx[32] = -2219266448758900086L;
        ns.lptx[33] = 8019955887330574991L;
        ns.lptx[34] = -8056068775703799683L;
        ns.lptx[35] = 1022670831604429862L;
        ns.lptx[36] = -6136967249711058063L;
        ns.lptx[37] = 1122696578710380759L;
        ns.lptx[38] = -7176824741067465343L;
        ns.lptx[39] = 366613069626475081L;
        ns.lptx[40] = -5893647471291207821L;
        ns.lptx[41] = -7158700159366843823L;
        ns.lptx[42] = -304923751752110738L;
        ns.lptx[43] = -8247229701688776841L;
        ns.lptx[44] = 7505360576059754828L;
        ns.lptx[45] = -1366868771801887259L;
        ns.lptx[46] = 97804849243835121L;
        ns.lptx[47] = -5476426320051513523L;
        ns.lptx[48] = 2363387670082780371L;
        ns.lptx[49] = 3707428376373060874L;
        ns.lptx[50] = 1267713315494943932L;
        ns.lptx[51] = 1784198022584971397L;
        ns.lptx[52] = 1668922221824841178L;
        ns.lptx[53] = 5323756138568270023L;
        ns.lptx[54] = -3729121923880639302L;
        ns.lptx[55] = 4705358000371401606L;
        ns.lptx[56] = 5544023878743530386L;
        ns.lptx[57] = -5306497256687767315L;
        ns.lptx[58] = -7645342693466271978L;
        ns.lptx[59] = 4479153359505946318L;
        ns.lptx[60] = 7236813454429791744L;
        ns.lptx[61] = -8599499469445312794L;
        ns.lptx[62] = 5008403735501453162L;
        ns.lptx[63] = -3757823855848767170L;
        ns.lptx[64] = 5687140588434585140L;
        ns.lptx[65] = 8318512280211171898L;
        ns.lptx[66] = -8751631526326905647L;
        ns.lptx[67] = 77892464731075211L;
        ns.lptx[68] = 2974281831105166419L;
        ns.lptx[69] = -914984613667867873L;
        ns.lptx[70] = -5910582121441902517L;
        ns.lptx[71] = -8316189657070184632L;
        ns.lptx[72] = 3390654428111077927L;
        ns.lptx[73] = 9083821934698735567L;
        ns.lptx[74] = -4588839877232166626L;
        ns.lptx[75] = -7690951396599193522L;
        ns.lptx[76] = -1513890238590950620L;
        ns.lptx[77] = 7926468566384369792L;
        ns.lptx[78] = -4768392235629171712L;
        ns.lptx[79] = -6882722666812774500L;
        ns.lptx[80] = 4029306158319016520L;
        ns.lptx[81] = 8141630676032445339L;
        ns.lptx[82] = 5169829145012938411L;
        ns.lptx[83] = 49153656017913114L;
        ns.lptx[84] = 6894301307391619091L;
        ns.lptx[85] = 9106307013294114595L;
        ns.lptx[86] = 227222234135597373L;
        ns.lptx[87] = 3147134086456027438L;
        ns.lptx[88] = 409387100730261203L;
        ns.lptx[89] = -8826454942379706179L;
        ns.lptx[90] = -8978432590849470021L;
        ns.lptx[91] = 4399826151568858132L;
        ns.lptx[92] = 6962335802562043015L;
        ns.lptx[93] = -125832956889333319L;
        ns.lptx[94] = 8702583792508900065L;
        ns.lptx[95] = -5351504881201468303L;
        ns.lptx[96] = -2170115205263236592L;
        ns.lptx[97] = 7321351217212828254L;
        ns.lptx[98] = -5493855916705353031L;
        ns.lptx[99] = 4620206781940408381L;
    }

    private static /* synthetic */ void ltrq() {
        ns.lptx[100] = 8854270456580047519L;
        ns.lptx[101] = 3618148337973806228L;
        ns.lptx[102] = -3707422701022193938L;
        ns.lptx[103] = -3425294513744485412L;
        ns.lptx[104] = -581069359329312591L;
        ns.lptx[105] = 3893833398106074191L;
        ns.lptx[106] = -3671243534465753330L;
        ns.lptx[107] = -4983627825137785373L;
        ns.lptx[108] = -1836836563901923696L;
        ns.lptx[109] = -6893638698850508503L;
        ns.lptx[110] = 7840277591604847403L;
        ns.lptx[111] = -2006152859111785738L;
        ns.lptx[112] = -7555160564895273348L;
        ns.lptx[113] = 4618076629814965830L;
        ns.lptx[114] = -1669160960203157410L;
        ns.lptx[115] = 2608696843810758519L;
        ns.lptx[116] = -8058808660856605904L;
        ns.lptx[117] = -7830302777401601888L;
        ns.lptx[118] = 2899150125797239298L;
        ns.lptx[119] = -4433277396802547256L;
        ns.lptx[120] = 2144378776724995152L;
        ns.lptx[121] = -6794071120900093017L;
        ns.lptx[122] = -6980029946160360719L;
        ns.lptx[123] = -2403523099845108870L;
        ns.lptx[124] = -1150853905962415239L;
        ns.lptx[125] = 5602682218708000223L;
        ns.lptx[126] = 1189415015758346334L;
        ns.lptx[127] = 1011991903609404640L;
        ns.lptx[128] = 4306662443757319583L;
        ns.lptx[129] = 5982217214445782276L;
        ns.lptx[130] = -4360960435859713769L;
        ns.lptx[131] = 7252537570742759000L;
        ns.lptx[132] = 5761575021577207214L;
        ns.lptx[133] = 1624531852191204001L;
        ns.lptx[134] = 8966801428598833832L;
        ns.lptx[135] = -3208640135999415618L;
        ns.lptx[136] = 3091751414933819738L;
        ns.lptx[137] = -489446023742394674L;
        ns.lptx[138] = 3718293724443998928L;
        ns.lptx[139] = 590838074434167177L;
        ns.lptx[140] = -5390051435604011379L;
        ns.lptx[141] = 1017828023512848272L;
        ns.lptx[142] = -3179310979665948716L;
        ns.lptx[143] = -6257567220421930784L;
        ns.lptx[144] = -8774156917806259993L;
        ns.lptx[145] = 3734699309227205493L;
        ns.lptx[146] = 33251903489923527L;
        ns.lptx[147] = 5878199152518230030L;
        ns.lptx[148] = 7434182914971457108L;
        ns.lptx[149] = -6903471242490411704L;
        ns.lptx[150] = -9047413117007370796L;
        ns.lptx[151] = -8347398341388465779L;
        ns.lptx[152] = 5025812900145364558L;
        ns.lptx[153] = 9192324105779240568L;
        ns.lptx[154] = -1678427198254809246L;
        ns.lptx[155] = -4081618263167492865L;
        ns.lptx[156] = -141140707231893066L;
        ns.lptx[157] = -3381492615113297252L;
        ns.lptx[158] = 2872252843089264717L;
        ns.lptx[159] = 5010205602967661479L;
        ns.lptx[160] = -4739947055041849026L;
        ns.lptx[161] = -8702862418345404688L;
        ns.lptx[162] = -262504679404479893L;
        ns.lptx[163] = -8635517447837417675L;
        ns.lptx[164] = 8699755628674045203L;
        ns.lptx[165] = -3525586509177362238L;
        ns.lptx[166] = -1641914322336650774L;
        ns.lptx[167] = -4473216201466365059L;
        ns.lptx[168] = 6172023456606736931L;
        ns.lptx[169] = -9213976716258606845L;
        ns.lptx[170] = -7261672822053588396L;
        ns.lptx[171] = -8521955458313182199L;
        ns.lptx[172] = -3810614685997516426L;
        ns.lptx[173] = -3731505389109911631L;
        ns.lptx[174] = -2240291180000855865L;
        ns.lptx[175] = 6429226308755251939L;
        ns.lptx[176] = 6872727956286843082L;
        ns.lptx[177] = -2069329292623108318L;
        ns.lptx[178] = -3998057760813650056L;
        ns.lptx[179] = -1408097166370979218L;
        ns.lptx[180] = 5349176278503503054L;
        ns.lptx[181] = 1889664087375242970L;
        ns.lptx[182] = 964970332359267036L;
        ns.lptx[183] = 1086947737783420574L;
        ns.lptx[184] = -177526294135058313L;
        ns.lptx[185] = -5317441346759733290L;
        ns.lptx[186] = -6978788375190866058L;
        ns.lptx[187] = -7461284467916295765L;
        ns.lptx[188] = 734738991380330447L;
        ns.lptx[189] = 4758299616843465166L;
        ns.lptx[190] = 3745910593399124947L;
        ns.lptx[191] = 7450195588058256236L;
        ns.lptx[192] = -5736808185324850601L;
        ns.lptx[193] = -4959703454651323546L;
        ns.lptx[194] = 4530276371279387167L;
        ns.lptx[195] = -4836259701818176532L;
        ns.lptx[196] = 8493994259958753064L;
        ns.lptx[197] = 8335376533581601711L;
        ns.lptx[198] = -8684355048044522914L;
        ns.lptx[199] = -1436267995082494635L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_1293 getStatusEffect(class_6880<class_1291> var1_1) {
        block63: {
            block65: {
                v0 /* !! */  = ns.uk;
                if (true) ** GOTO lbl5
                block31: while (true) {
                    v0 /* !! */  = (long)(v1 - ns.lpst("lthe", lptv(int ), (int)789));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 304457984: {
                            break block31;
                        }
                        case 919135487: {
                            v1 = ns.lpst("lthf", lptv(int ), (int)790);
                            continue block31;
                        }
                        case 1329148031: {
                            v1 = ns.lpst("lthg", lptv(int ), (int)791);
                            continue block31;
                        }
                    }
                    break;
                }
                var5_2 = ns.c;
                while (true) {
                    block64: {
                        if ((v2 /* !! */  = (cfr_temp_1 = ns.uk - ns.lpst("lthh", lptv(int ), (int)792)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v2 /* !! */  != ns.lpst("lthi", lpsq(int ), (int)1608)) break block64;
                        var4_3 /* !! */  = ns.b;
                        if (var4_3 /* !! */  != 0) {
                            break;
                        }
                        ** GOTO lbl-1000
                    }
                    v2 /* !! */  = (long)ns.lpst("lthj", lpsq(int ), (int)1609);
                }
                cfr_temp_0 = -2147483648;
                block33: do {
                    switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                if ((v3 /* !! */  = (cfr_temp_2 = ns.uk - ns.lpst("lthk", lptv(int ), (int)793)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v3 /* !! */  == ns.lpst("lthl", lpsq(int ), (int)1610)) {
                                    var3_4 = ns.a;
                                    if (var5_2) {
                                        throw null;
                                    }
                                    break;
                                }
                                v3 /* !! */  = (long)ns.lpst("lthm", lpsq(int ), (int)1611);
                            }
                            if (var3_4 || var3_4) return null;
                            while (true) {
                                if ((v4 /* !! */  = (cfr_temp_3 = ns.uk - ns.lpst("lthn", lptv(int ), (int)794)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v4 /* !! */  != ns.lpst("ltho", lpsq(int ), (int)1612)) ** GOTO lbl47
                                v5 /* !! */  = ns.uk;
                                if (true) ** GOTO lbl112
lbl47:
                                // 1 sources

                                v4 /* !! */  = (long)ns.lpst("lthp", lpsq(int ), (int)1613);
                            }
                        }
                        case 3: {
                            var4_3 /* !! */  = (int)ns.lpst("ltid", lpsq(int ), (int)1619);
                            cfr_temp_0 = 10;
                            if (!var5_2) continue block33;
                            throw null;
                        }
                        case 6: {
                            var4_3 /* !! */  = (int)ns.lpst("ltig", lpsq(int ), (int)1622);
                            cfr_temp_0 = 9;
                            if (!var5_2) continue block33;
                            throw null;
                        }
                        case 7: {
                            var4_3 /* !! */  = (int)ns.lpst("ltih", lpsq(int ), (int)1623);
                            if (var5_2) {
                                throw null;
                            }
                        }
                        case 5: {
                            var4_3 /* !! */  = (int)ns.lpst("ltif", lpsq(int ), (int)1621);
                            cfr_temp_0 = 4;
                            if (!var5_2) continue block33;
                            throw null;
                        }
                        case 9: {
                            var4_3 /* !! */  = (int)ns.lpst("ltij", lpsq(int ), (int)1625);
                            if (var5_2) {
                                throw null;
                            }
                        }
                        case 8: {
                            do {
                                var4_3 /* !! */  = (int)ns.lpst("ltii", lpsq(int ), (int)1624);
                            } while (!var5_2);
                            throw null;
                        }
                        case 10: {
                            var4_3 /* !! */  = (int)ns.lpst("ltik", lpsq(int ), (int)1626);
                            if (var5_2) {
                                throw null;
                            }
                        }
                        case 0: {
                            ** GOTO lbl96
                        }
                        case 11: {
                            var4_3 /* !! */  = (int)ns.lpst("ltil", lpsq(int ), (int)1627);
                            if (var5_2) {
                                throw null;
                            }
                        }
                        case 4: {
                            do {
                                var4_3 /* !! */  = (int)ns.lpst("ltie", lpsq(int ), (int)1620);
                            } while (!var5_2);
                            throw null;
                        }
                        case 12: {
                            var4_3 /* !! */  = (int)ns.lpst("ltim", lpsq(int ), (int)1628);
                            if (var5_2) {
                                throw null;
                            }
lbl96:
                            // 3 sources

                            var4_3 /* !! */  = (int)ns.lpst("ltia", lpsq(int ), (int)1616);
                            if (var5_2) {
                                throw null;
                            }
                        }
                        case 1: {
                            var4_3 /* !! */  = (int)ns.lpst("ltib", lpsq(int ), (int)1617);
                            if (var5_2) {
                                throw null;
                            }
                        }
                        case 2: 
                    }
                    break;
                } while (true);
                do {
                    var4_3 /* !! */  = (int)ns.lpst("ltic", lpsq(int ), (int)1618);
                } while (!var5_2);
                throw null;
                block39: while (true) {
                    v5 /* !! */  = (long)(v6 - ns.lpst("lthq", lptv(int ), (int)795));
lbl112:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 304457984: {
                            break block39;
                        }
                        case 1000789276: {
                            v6 = ns.lpst("lthr", lptv(int ), (int)796);
                            continue block39;
                        }
                        case 1848542960: {
                            v6 = ns.lpst("lths", lptv(int ), (int)797);
                            continue block39;
                        }
                    }
                    break;
                }
                var2_5 = this.player.method_6112(var1_1);
                if (var3_4 || var3_4) return null;
                if (var2_5 == null) break block65;
                if (var3_4) return null;
                v7 /* !! */  = ns.uk;
                if (true) ** GOTO lbl129
                block40: while (true) {
                    v7 /* !! */  = (long)(v8 - ns.lpst("ltht", lptv(int ), (int)798));
lbl129:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1520931455: {
                            v8 = ns.lpst("lthu", lptv(int ), (int)799);
                            continue block40;
                        }
                        case -1085590471: {
                            v8 = ns.lpst("lthv", lptv(int ), (int)800);
                            continue block40;
                        }
                        case 304457984: {
                            break block40;
                        }
                        case 1843790277: {
                            v8 = ns.lpst("lthw", lptv(int ), (int)801);
                            continue block40;
                        }
                    }
                    break;
                }
                v9 = var2_5.method_5584();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ns.uk - ns.lpst("lthx", lptv(int ), (int)802)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ns.lpst("lthy", lpsq(int ), (int)1614)) {
                        if (v9 < this.simulatedTicks) {
                            break;
                        }
                        break block63;
                    }
                    v10 /* !! */  = (long)ns.lpst("lthz", lpsq(int ), (int)1615);
                }
                if (var3_4) return null;
            }
            if (var3_4 || var3_4) return null;
            return null;
        }
        if (!var3_4 && !var3_4) return var2_5;
        return null;
    }

    private static /* synthetic */ void ltrx() {
        ns.lptx[800] = -7852961624921396124L;
        ns.lptx[801] = 2029251312796713651L;
        ns.lptx[802] = -8875266373498821647L;
        ns.lptx[803] = 6932049848585192799L;
        ns.lptx[804] = -1848384810499218953L;
        ns.lptx[805] = -6652350473025620871L;
        ns.lptx[806] = -8183975887557153802L;
        ns.lptx[807] = -4393512218955496962L;
        ns.lptx[808] = 987583528095445788L;
        ns.lptx[809] = -1363492336512481366L;
        ns.lptx[810] = -2587569414660320552L;
        ns.lptx[811] = -8483000009923868342L;
        ns.lptx[812] = 4357457795510904216L;
        ns.lptx[813] = -114077948445949574L;
        ns.lptx[814] = 3807071575502054543L;
        ns.lptx[815] = -7630823871351182345L;
        ns.lptx[816] = -3365587205465633824L;
        ns.lptx[817] = -2803644534025236839L;
        ns.lptx[818] = 5156159152509428621L;
        ns.lptx[819] = 5993425375631868579L;
        ns.lptx[820] = 9150374766005295688L;
        ns.lptx[821] = -1733861400149534946L;
        ns.lptx[822] = -3856467159018794302L;
        ns.lptx[823] = -4584780596881022032L;
        ns.lptx[824] = 396437086140355620L;
        ns.lptx[825] = 614456189574768789L;
        ns.lptx[826] = 743052006727547435L;
        ns.lptx[827] = -1437116426514238227L;
        ns.lptx[828] = 604857741524127120L;
        ns.lptx[829] = 3315217166651253741L;
        ns.lptx[830] = 80754275954718116L;
        ns.lptx[831] = -7705341178951246533L;
        ns.lptx[832] = -6800858541526754724L;
        ns.lptx[833] = -5288243208543979533L;
        ns.lptx[834] = -8685513121905225658L;
        ns.lptx[835] = 5734844953767567669L;
        ns.lptx[836] = 3949111570474137429L;
        ns.lptx[837] = 4317996084101807977L;
        ns.lptx[838] = 6786462651249229392L;
        ns.lptx[839] = -8288571992557710160L;
        ns.lptx[840] = 1730059318881267869L;
        ns.lptx[841] = -4505042091934503351L;
        ns.lptx[842] = -6536734408259493079L;
        ns.lptx[843] = 3270785308924717378L;
        ns.lptx[844] = -7995745846130539507L;
        ns.lptx[845] = -4571518541968661791L;
        ns.lptx[846] = -3571381711625331113L;
        ns.lptx[847] = 2816349518052106408L;
        ns.lptx[848] = 9084261763407850459L;
        ns.lptx[849] = 7642216988042222149L;
        ns.lptx[850] = -6148685043292541521L;
        ns.lptx[851] = 1089117967418341210L;
        ns.lptx[852] = -4373626745424771456L;
        ns.lptx[853] = 1195737548408392639L;
        ns.lptx[854] = 8239635534300301842L;
        ns.lptx[855] = 3164986706087007260L;
        ns.lptx[856] = 5001271279002413132L;
        ns.lptx[857] = 1294286337319790960L;
        ns.lptx[858] = -5608456517883663008L;
        ns.lptx[859] = -6880562591263602850L;
        ns.lptx[860] = 2066404447962930024L;
        ns.lptx[861] = -6880260341212773030L;
        ns.lptx[862] = 8419480663327083216L;
        ns.lptx[863] = 4170954335361363164L;
        ns.lptx[864] = 6592657747437262613L;
        ns.lptx[865] = -8518629704713136247L;
        ns.lptx[866] = -4181718485792554099L;
        ns.lptx[867] = -1923947103841460136L;
        ns.lptx[868] = 9015135205772877393L;
        ns.lptx[869] = 5612108247968927685L;
        ns.lptx[870] = 8613189709000829881L;
        ns.lptx[871] = 65686698769155381L;
        ns.lptx[872] = -2557050173666798722L;
        ns.lptx[873] = 8284299672230758855L;
        ns.lptx[874] = 2714615301370506583L;
        ns.lptx[875] = 844075495062692754L;
        ns.lptx[876] = -459822991669789913L;
        ns.lptx[877] = -5051986869394077905L;
        ns.lptx[878] = -8996450664444528030L;
        ns.lptx[879] = 3341410342204736568L;
        ns.lptx[880] = 2906338678874223790L;
        ns.lptx[881] = 1068848451769558627L;
        ns.lptx[882] = 6931916617135429705L;
        ns.lptx[883] = -4929180880724204971L;
        ns.lptx[884] = -4819386467040489381L;
        ns.lptx[885] = -9187476874620867708L;
        ns.lptx[886] = 4738434914418197115L;
        ns.lptx[887] = -1589529163913320068L;
        ns.lptx[888] = -4322900289152328434L;
        ns.lptx[889] = 6123466385024646223L;
        ns.lptx[890] = 8910636950283920231L;
        ns.lptx[891] = -390089763713917040L;
        ns.lptx[892] = -2429989808422918730L;
        ns.lptx[893] = -2010001335869451171L;
        ns.lptx[894] = -6228246560310038962L;
        ns.lptx[895] = 6650908976718459918L;
        ns.lptx[896] = -2536843796317610317L;
        ns.lptx[897] = 6899211051837755853L;
        ns.lptx[898] = -225268081100140178L;
        ns.lptx[899] = -2339619625777347908L;
    }

    static {
        lpsr = new int[1705];
        lpss = new int[1705];
        ns.ltpv();
        ns.ltpw();
        ns.ltpx();
        ns.ltpy();
        ns.ltpz();
        ns.ltqa();
        ns.ltqb();
        ns.ltqc();
        ns.ltqd();
        ns.ltqe();
        ns.ltqf();
        ns.ltqg();
        ns.ltqh();
        ns.ltqi();
        ns.ltqj();
        ns.ltqk();
        ns.ltql();
        ns.ltqm();
        ns.ltqn();
        ns.ltqo();
        ns.ltqp();
        ns.ltqq();
        ns.ltqr();
        ns.ltqs();
        ns.ltqt();
        ns.ltqu();
        ns.ltqv();
        ns.ltqw();
        ns.ltqx();
        ns.ltqy();
        ns.ltqz();
        ns.ltra();
        ns.ltrb();
        ns.ltrc();
        ns.ltrd();
        ns.ltre();
        lptw = new long[917];
        lptx = new long[917];
        ns.ltrf();
        ns.ltrg();
        ns.ltrh();
        ns.ltri();
        ns.ltrj();
        ns.ltrk();
        ns.ltrl();
        ns.ltrm();
        ns.ltrn();
        ns.ltro();
        ns.ltrp();
        ns.ltrq();
        ns.ltrr();
        ns.ltrs();
        ns.ltrt();
        ns.ltru();
        ns.ltrv();
        ns.ltrw();
        ns.ltrx();
        ns.ltry();
    }
}

