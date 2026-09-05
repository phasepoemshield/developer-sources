/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10185
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_744
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_10185;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_744;
import ruhack.phobia.nq;

public class ns$SimulatedPlayerInput
extends class_744 {
    public float movementSideways;
    private static final long ah = 2563819004403861780L;
    public static final boolean c;
    private static int[] icm;
    private static int[] icl;
    public boolean forceSafeWalk;
    public class_10185 playerInput;
    public static final int b;
    private static long[] ied;
    public static final double MAX_WALKING_SPEED = 0.121;
    private static long[] iec;
    public static final boolean a;
    public float movementForward;

    private static /* synthetic */ void ikt() {
        ns$SimulatedPlayerInput.ied[0] = -4076804527535352059L;
        ns$SimulatedPlayerInput.ied[1] = 6783384045660374817L;
        ns$SimulatedPlayerInput.ied[2] = 8788405546216574311L;
        ns$SimulatedPlayerInput.ied[3] = 7129127096244303991L;
        ns$SimulatedPlayerInput.ied[4] = -5934194781474327964L;
        ns$SimulatedPlayerInput.ied[5] = 7446298922553732807L;
        ns$SimulatedPlayerInput.ied[6] = -2663412831626035294L;
        ns$SimulatedPlayerInput.ied[7] = -1566234352536496773L;
        ns$SimulatedPlayerInput.ied[8] = 9077715713949947718L;
        ns$SimulatedPlayerInput.ied[9] = -334491162004479618L;
        ns$SimulatedPlayerInput.ied[10] = 6928256988873829541L;
        ns$SimulatedPlayerInput.ied[11] = 4881238737565662685L;
        ns$SimulatedPlayerInput.ied[12] = -6059530768270770558L;
        ns$SimulatedPlayerInput.ied[13] = -6436388378019192634L;
        ns$SimulatedPlayerInput.ied[14] = -2857394283648614893L;
        ns$SimulatedPlayerInput.ied[15] = 6248376535266448567L;
        ns$SimulatedPlayerInput.ied[16] = 1362569400271430876L;
        ns$SimulatedPlayerInput.ied[17] = -3187496846102386684L;
        ns$SimulatedPlayerInput.ied[18] = -5726907834613572074L;
        ns$SimulatedPlayerInput.ied[19] = 6579770025421620098L;
        ns$SimulatedPlayerInput.ied[20] = -5189032783523088879L;
        ns$SimulatedPlayerInput.ied[21] = -3053628480508401077L;
        ns$SimulatedPlayerInput.ied[22] = -2794061549327969L;
        ns$SimulatedPlayerInput.ied[23] = 1207472101479401395L;
        ns$SimulatedPlayerInput.ied[24] = -2620571028286425655L;
        ns$SimulatedPlayerInput.ied[25] = 2326400906580478276L;
        ns$SimulatedPlayerInput.ied[26] = -341494246625361033L;
        ns$SimulatedPlayerInput.ied[27] = 7281125845258655740L;
        ns$SimulatedPlayerInput.ied[28] = 752815861136574391L;
        ns$SimulatedPlayerInput.ied[29] = 6910063740657539059L;
        ns$SimulatedPlayerInput.ied[30] = -5407308363072918151L;
        ns$SimulatedPlayerInput.ied[31] = 7851243749530164555L;
        ns$SimulatedPlayerInput.ied[32] = 1021019339696362216L;
        ns$SimulatedPlayerInput.ied[33] = 8034078932178772643L;
        ns$SimulatedPlayerInput.ied[34] = 6172184875575736995L;
        ns$SimulatedPlayerInput.ied[35] = 5816451449105528583L;
        ns$SimulatedPlayerInput.ied[36] = -2963741158064826484L;
        ns$SimulatedPlayerInput.ied[37] = -957452575734659927L;
        ns$SimulatedPlayerInput.ied[38] = 4979018174051072533L;
        ns$SimulatedPlayerInput.ied[39] = -6470971247754884618L;
        ns$SimulatedPlayerInput.ied[40] = -1629313957080768281L;
        ns$SimulatedPlayerInput.ied[41] = 7748756725066974836L;
        ns$SimulatedPlayerInput.ied[42] = 2013918312309740176L;
        ns$SimulatedPlayerInput.ied[43] = -490215464923496868L;
        ns$SimulatedPlayerInput.ied[44] = -3756246995313875177L;
        ns$SimulatedPlayerInput.ied[45] = 7693495073106591205L;
        ns$SimulatedPlayerInput.ied[46] = 6242905928326251340L;
        ns$SimulatedPlayerInput.ied[47] = -5566966037913095855L;
        ns$SimulatedPlayerInput.ied[48] = -5843194037804605893L;
        ns$SimulatedPlayerInput.ied[49] = -1161202953861546661L;
        ns$SimulatedPlayerInput.ied[50] = 4330491890527539619L;
        ns$SimulatedPlayerInput.ied[51] = -671189733938750790L;
        ns$SimulatedPlayerInput.ied[52] = 192974912226852078L;
        ns$SimulatedPlayerInput.ied[53] = 2265227469272093974L;
        ns$SimulatedPlayerInput.ied[54] = 1214829796047245209L;
        ns$SimulatedPlayerInput.ied[55] = 3456890049329402362L;
        ns$SimulatedPlayerInput.ied[56] = -5642626723238517098L;
        ns$SimulatedPlayerInput.ied[57] = 809229164479038912L;
        ns$SimulatedPlayerInput.ied[58] = -2713759753019319927L;
        ns$SimulatedPlayerInput.ied[59] = -2112792405794616772L;
        ns$SimulatedPlayerInput.ied[60] = 3461978159420173450L;
        ns$SimulatedPlayerInput.ied[61] = 7510358822799647258L;
        ns$SimulatedPlayerInput.ied[62] = 5968135303732795689L;
        ns$SimulatedPlayerInput.ied[63] = 7374728445440127089L;
        ns$SimulatedPlayerInput.ied[64] = -8975956163444565853L;
        ns$SimulatedPlayerInput.ied[65] = -6781901512370829905L;
        ns$SimulatedPlayerInput.ied[66] = -3804222992439154342L;
        ns$SimulatedPlayerInput.ied[67] = -4549134389103573954L;
        ns$SimulatedPlayerInput.ied[68] = -1971470799670767071L;
        ns$SimulatedPlayerInput.ied[69] = -8250321108668706899L;
        ns$SimulatedPlayerInput.ied[70] = -1924471202510204099L;
        ns$SimulatedPlayerInput.ied[71] = 2761751267431700772L;
        ns$SimulatedPlayerInput.ied[72] = 3576812709756610927L;
        ns$SimulatedPlayerInput.ied[73] = -2193367947738304051L;
        ns$SimulatedPlayerInput.ied[74] = -8784163988399362608L;
        ns$SimulatedPlayerInput.ied[75] = 7184119275769245319L;
        ns$SimulatedPlayerInput.ied[76] = 3285137115270527220L;
        ns$SimulatedPlayerInput.ied[77] = -9149962440612334067L;
    }

    static {
        icl = new int[125];
        icm = new int[125];
        ns$SimulatedPlayerInput.iko();
        ns$SimulatedPlayerInput.ikp();
        ns$SimulatedPlayerInput.ikq();
        ns$SimulatedPlayerInput.ikr();
        iec = new long[78];
        ied = new long[78];
        ns$SimulatedPlayerInput.iks();
        ns$SimulatedPlayerInput.ikt();
    }

    private static /* synthetic */ long ieb(int n2) {
        return iec[n2] ^ ied[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iee", ieb(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ns$SimulatedPlayerInput.icn("ief", ick(int ), (int)38)) break;
            v0 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ieg", ick(int ), (int)39);
        }
        var3_1 = ns$SimulatedPlayerInput.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ieh", ieb(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ns$SimulatedPlayerInput.icn("iei", ick(int ), (int)40)) break;
            v1 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iej", ick(int ), (int)41);
        }
        var2_2 /* !! */  = ns$SimulatedPlayerInput.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iek", ieb(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ns$SimulatedPlayerInput.icn("iel", ick(int ), (int)42)) break;
            v2 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iem", ick(int ), (int)43);
        }
        var1_3 = ns$SimulatedPlayerInput.a;
        if (!var3_1) ** GOTO lbl25
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl25:
                // 1 sources

                if (var1_3 || var1_3) continue block41;
                v3 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl30
                block42: while (true) {
                    v3 /* !! */  = (long)(v4 - ns$SimulatedPlayerInput.icn("ien", ieb(int ), (int)3));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -382937778: {
                            v4 = ns$SimulatedPlayerInput.icn("ieo", ieb(int ), (int)4);
                            continue block42;
                        }
                        case 31672596: {
                            break block42;
                        }
                        case 535280528: {
                            v4 = ns$SimulatedPlayerInput.icn("iep", ieb(int ), (int)5);
                            continue block42;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ieq", ieb(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ns$SimulatedPlayerInput.icn("ier", ick(int ), (int)44)) break;
                    v5 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ies", ick(int ), (int)45);
                }
                v6 = this.playerInput.comp_3159();
                v7 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl49
                block44: while (true) {
                    v7 /* !! */  = (long)(ns$SimulatedPlayerInput.icn("ieu", ieb(int ), (int)8) - ns$SimulatedPlayerInput.icn("iet", ieb(int ), (int)7));
lbl49:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 31672596: {
                            break block44;
                        }
                        case 1595736363: {
                            continue block44;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iev", ieb(int ), (int)9)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ns$SimulatedPlayerInput.icn("iew", ick(int ), (int)46)) break;
                    v8 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iex", ick(int ), (int)47);
                }
                v9 = this.playerInput.comp_3160();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iey", ieb(int ), (int)10)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ns$SimulatedPlayerInput.icn("iez", ick(int ), (int)48)) break;
                    v10 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ifa", ick(int ), (int)49);
                }
                v11 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl69
                block47: while (true) {
                    v11 /* !! */  = (long)(ns$SimulatedPlayerInput.icn("ifc", ieb(int ), (int)12) - ns$SimulatedPlayerInput.icn("ifb", ieb(int ), (int)11));
lbl69:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 31672596: {
                            break block47;
                        }
                        case 462246423: {
                            continue block47;
                        }
                    }
                    break;
                }
                v12 = this.playerInput.comp_3161();
                v13 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl79
                block48: while (true) {
                    v13 /* !! */  = (long)(v14 - ns$SimulatedPlayerInput.icn("ifd", ieb(int ), (int)13));
lbl79:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -52705433: {
                            v14 = ns$SimulatedPlayerInput.icn("ife", ieb(int ), (int)14);
                            continue block48;
                        }
                        case 31672596: {
                            break block48;
                        }
                        case 575327600: {
                            v14 = ns$SimulatedPlayerInput.icn("iff", ieb(int ), (int)15);
                            continue block48;
                        }
                        case 735389760: {
                            v14 = ns$SimulatedPlayerInput.icn("ifg", ieb(int ), (int)16);
                            continue block48;
                        }
                    }
                    break;
                }
                v15 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl95
                block49: while (true) {
                    v15 /* !! */  = (long)(ns$SimulatedPlayerInput.icn("ifi", ieb(int ), (int)18) - ns$SimulatedPlayerInput.icn("ifh", ieb(int ), (int)17));
lbl95:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1430022597: {
                            continue block49;
                        }
                        case 31672596: {
                            break block49;
                        }
                    }
                    break;
                }
                v16 = this.playerInput.comp_3162();
                v17 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl105
                block50: while (true) {
                    v17 /* !! */  = (long)(v18 - ns$SimulatedPlayerInput.icn("ifj", ieb(int ), (int)19));
lbl105:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -539997749: {
                            v18 = ns$SimulatedPlayerInput.icn("ifk", ieb(int ), (int)20);
                            continue block50;
                        }
                        case 31672596: {
                            break block50;
                        }
                        case 1178030599: {
                            v18 = ns$SimulatedPlayerInput.icn("ifl", ieb(int ), (int)21);
                            continue block50;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ifm", ieb(int ), (int)22)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ns$SimulatedPlayerInput.icn("ifn", ick(int ), (int)50)) break;
                    v19 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ifo", ick(int ), (int)51);
                }
                v20 = this.playerInput.comp_3163();
                v21 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl124
                block52: while (true) {
                    v21 /* !! */  = (long)(ns$SimulatedPlayerInput.icn("ifq", ieb(int ), (int)24) - ns$SimulatedPlayerInput.icn("ifp", ieb(int ), (int)23));
lbl124:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 31672596: {
                            break block52;
                        }
                        case 449644558: {
                            continue block52;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ifr", ieb(int ), (int)25)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ns$SimulatedPlayerInput.icn("ifs", ick(int ), (int)52)) break;
                    v22 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ift", ick(int ), (int)53);
                }
                v23 = this.playerInput.comp_3165();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ifu", ieb(int ), (int)26)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ns$SimulatedPlayerInput.icn("ifv", ick(int ), (int)54)) break;
                    v24 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ifw", ick(int ), (int)55);
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_9 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ifx", ieb(int ), (int)27)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ns$SimulatedPlayerInput.icn("ify", ick(int ), (int)56)) break;
                    v25 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ifz", ick(int ), (int)57);
                }
                v26 = this.playerInput.comp_3164();
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_10 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iga", ieb(int ), (int)28)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ns$SimulatedPlayerInput.icn("igb", ick(int ), (int)58)) break;
                    v27 /* !! */  = (long)ns$SimulatedPlayerInput.icn("igc", ick(int ), (int)59);
                }
                return "SimulatedPlayerInput(forwards={" + v6 + "}, backwards={" + v9 + "}, left={" + v12 + "}, right={" + v16 + "}, jumping={" + v20 + "}, sprinting=" + v23 + ", slowDown=" + v26 + ")";
                case 0: {
                    var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("igd", ick(int ), (int)60);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ige", ick(int ), (int)61);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("igf", ick(int ), (int)62);
                    if (!var3_1) break block41;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("igg", ick(int ), (int)63);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void iko() {
        ns$SimulatedPlayerInput.icl[0] = -1125295835;
        ns$SimulatedPlayerInput.icl[1] = -547773461;
        ns$SimulatedPlayerInput.icl[2] = 459147371;
        ns$SimulatedPlayerInput.icl[3] = 1845200033;
        ns$SimulatedPlayerInput.icl[4] = -791880891;
        ns$SimulatedPlayerInput.icl[5] = -643224271;
        ns$SimulatedPlayerInput.icl[6] = 813784598;
        ns$SimulatedPlayerInput.icl[7] = -1344970475;
        ns$SimulatedPlayerInput.icl[8] = 728806348;
        ns$SimulatedPlayerInput.icl[9] = -1369619145;
        ns$SimulatedPlayerInput.icl[10] = 1457549721;
        ns$SimulatedPlayerInput.icl[11] = 1567498314;
        ns$SimulatedPlayerInput.icl[12] = -701773444;
        ns$SimulatedPlayerInput.icl[13] = -678559086;
        ns$SimulatedPlayerInput.icl[14] = 1242615420;
        ns$SimulatedPlayerInput.icl[15] = 1024163965;
        ns$SimulatedPlayerInput.icl[16] = 1314512097;
        ns$SimulatedPlayerInput.icl[17] = -903688015;
        ns$SimulatedPlayerInput.icl[18] = -2088695297;
        ns$SimulatedPlayerInput.icl[19] = 466775178;
        ns$SimulatedPlayerInput.icl[20] = -1244232689;
        ns$SimulatedPlayerInput.icl[21] = 1606619463;
        ns$SimulatedPlayerInput.icl[22] = -407772436;
        ns$SimulatedPlayerInput.icl[23] = 985583398;
        ns$SimulatedPlayerInput.icl[24] = -565150594;
        ns$SimulatedPlayerInput.icl[25] = 380800859;
        ns$SimulatedPlayerInput.icl[26] = -1563628271;
        ns$SimulatedPlayerInput.icl[27] = -1467273187;
        ns$SimulatedPlayerInput.icl[28] = -1858182733;
        ns$SimulatedPlayerInput.icl[29] = -1990463194;
        ns$SimulatedPlayerInput.icl[30] = -1969341526;
        ns$SimulatedPlayerInput.icl[31] = 51543789;
        ns$SimulatedPlayerInput.icl[32] = -76668956;
        ns$SimulatedPlayerInput.icl[33] = 652152259;
        ns$SimulatedPlayerInput.icl[34] = 2119810718;
        ns$SimulatedPlayerInput.icl[35] = 175681911;
        ns$SimulatedPlayerInput.icl[36] = 1579248047;
        ns$SimulatedPlayerInput.icl[37] = -1839072205;
        ns$SimulatedPlayerInput.icl[38] = 1517963448;
        ns$SimulatedPlayerInput.icl[39] = -1569953957;
        ns$SimulatedPlayerInput.icl[40] = 1285036736;
        ns$SimulatedPlayerInput.icl[41] = -1332225069;
        ns$SimulatedPlayerInput.icl[42] = -1326018432;
        ns$SimulatedPlayerInput.icl[43] = 1570644839;
        ns$SimulatedPlayerInput.icl[44] = -1314798981;
        ns$SimulatedPlayerInput.icl[45] = -158195465;
        ns$SimulatedPlayerInput.icl[46] = -1884884860;
        ns$SimulatedPlayerInput.icl[47] = 1526567037;
        ns$SimulatedPlayerInput.icl[48] = 1822720787;
        ns$SimulatedPlayerInput.icl[49] = -593486139;
        ns$SimulatedPlayerInput.icl[50] = 306533279;
        ns$SimulatedPlayerInput.icl[51] = -794823548;
        ns$SimulatedPlayerInput.icl[52] = 279458910;
        ns$SimulatedPlayerInput.icl[53] = 1966583982;
        ns$SimulatedPlayerInput.icl[54] = 366016048;
        ns$SimulatedPlayerInput.icl[55] = -2142875411;
        ns$SimulatedPlayerInput.icl[56] = 611387996;
        ns$SimulatedPlayerInput.icl[57] = 1688594169;
        ns$SimulatedPlayerInput.icl[58] = 945764566;
        ns$SimulatedPlayerInput.icl[59] = 1920250135;
        ns$SimulatedPlayerInput.icl[60] = 716222792;
        ns$SimulatedPlayerInput.icl[61] = 282168227;
        ns$SimulatedPlayerInput.icl[62] = -1302208045;
        ns$SimulatedPlayerInput.icl[63] = -1670840146;
        ns$SimulatedPlayerInput.icl[64] = -938812185;
        ns$SimulatedPlayerInput.icl[65] = -1532831833;
        ns$SimulatedPlayerInput.icl[66] = -1949661233;
        ns$SimulatedPlayerInput.icl[67] = -2137380560;
        ns$SimulatedPlayerInput.icl[68] = 453245554;
        ns$SimulatedPlayerInput.icl[69] = 1489304220;
        ns$SimulatedPlayerInput.icl[70] = 192341416;
        ns$SimulatedPlayerInput.icl[71] = 1731255059;
        ns$SimulatedPlayerInput.icl[72] = -252010112;
        ns$SimulatedPlayerInput.icl[73] = 1708702879;
        ns$SimulatedPlayerInput.icl[74] = 396005169;
        ns$SimulatedPlayerInput.icl[75] = 354004014;
        ns$SimulatedPlayerInput.icl[76] = -595161780;
        ns$SimulatedPlayerInput.icl[77] = -1963625280;
        ns$SimulatedPlayerInput.icl[78] = -1634148454;
        ns$SimulatedPlayerInput.icl[79] = -1668085877;
        ns$SimulatedPlayerInput.icl[80] = -612761396;
        ns$SimulatedPlayerInput.icl[81] = -2126845322;
        ns$SimulatedPlayerInput.icl[82] = 1095294404;
        ns$SimulatedPlayerInput.icl[83] = -1666727482;
        ns$SimulatedPlayerInput.icl[84] = 930913006;
        ns$SimulatedPlayerInput.icl[85] = -241715439;
        ns$SimulatedPlayerInput.icl[86] = 1064458080;
        ns$SimulatedPlayerInput.icl[87] = -1641629998;
        ns$SimulatedPlayerInput.icl[88] = 885499361;
        ns$SimulatedPlayerInput.icl[89] = 160181310;
        ns$SimulatedPlayerInput.icl[90] = 753472984;
        ns$SimulatedPlayerInput.icl[91] = -1637510223;
        ns$SimulatedPlayerInput.icl[92] = -1590860547;
        ns$SimulatedPlayerInput.icl[93] = 1419112191;
        ns$SimulatedPlayerInput.icl[94] = -961714046;
        ns$SimulatedPlayerInput.icl[95] = -983549278;
        ns$SimulatedPlayerInput.icl[96] = 1883746223;
        ns$SimulatedPlayerInput.icl[97] = 1507226695;
        ns$SimulatedPlayerInput.icl[98] = 955171984;
        ns$SimulatedPlayerInput.icl[99] = -1022384055;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ns$SimulatedPlayerInput guessInput(class_1657 var0) {
        v0 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl5
        block62: while (true) {
            v0 /* !! */  = (long)(v1 - ns$SimulatedPlayerInput.icn("igy", ieb(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1110774407: {
                    v1 = ns$SimulatedPlayerInput.icn("igz", ieb(int ), (int)39);
                    continue block62;
                }
                case 31672596: {
                    break block62;
                }
                case 1199454100: {
                    v1 = ns$SimulatedPlayerInput.icn("iha", ieb(int ), (int)40);
                    continue block62;
                }
            }
            break;
        }
        var11_1 = ns$SimulatedPlayerInput.c;
        v2 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl19
        block63: while (true) {
            v2 /* !! */  = (long)(ns$SimulatedPlayerInput.icn("ihc", ieb(int ), (int)42) - ns$SimulatedPlayerInput.icn("ihb", ieb(int ), (int)41));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -282780047: {
                    continue block63;
                }
                case 31672596: {
                    break block63;
                }
            }
            break;
        }
        var10_2 /* !! */  = ns$SimulatedPlayerInput.b;
        v3 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl29
        block64: while (true) {
            v3 /* !! */  = (long)(v4 - ns$SimulatedPlayerInput.icn("ihd", ieb(int ), (int)43));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1148927723: {
                    v4 = ns$SimulatedPlayerInput.icn("ihe", ieb(int ), (int)44);
                    continue block64;
                }
                case 31672596: {
                    break block64;
                }
                case 157839746: {
                    v4 = ns$SimulatedPlayerInput.icn("ihf", ieb(int ), (int)45);
                    continue block64;
                }
            }
            break;
        }
        var9_3 = ns$SimulatedPlayerInput.a;
        if (var11_1) {
            throw null;
lbl41:
            // 9 sources

            return null;
        }
        if (var9_3 || var9_3) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ihg", ieb(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ns$SimulatedPlayerInput.icn("ihh", ick(int ), (int)72)) break;
            v5 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ihi", ick(int ), (int)73);
        }
        v6 = var0.method_73189();
        v7 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl54
        block67: while (true) {
            v7 /* !! */  = (long)(v8 - ns$SimulatedPlayerInput.icn("ihj", ieb(int ), (int)47));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -905658717: {
                    v8 = ns$SimulatedPlayerInput.icn("ihk", ieb(int ), (int)48);
                    continue block67;
                }
                case -336064581: {
                    v8 = ns$SimulatedPlayerInput.icn("ihl", ieb(int ), (int)49);
                    continue block67;
                }
                case 31672596: {
                    break block67;
                }
                case 1099237135: {
                    v8 = ns$SimulatedPlayerInput.icn("ihm", ieb(int ), (int)50);
                    continue block67;
                }
            }
            break;
        }
        v9 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl70
        block68: while (true) {
            v9 /* !! */  = (long)(v10 - ns$SimulatedPlayerInput.icn("ihn", ieb(int ), (int)51));
lbl70:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 31672596: {
                    break block68;
                }
                case 1023942210: {
                    v10 = ns$SimulatedPlayerInput.icn("iho", ieb(int ), (int)52);
                    continue block68;
                }
                case 1653240596: {
                    v10 = ns$SimulatedPlayerInput.icn("ihp", ieb(int ), (int)53);
                    continue block68;
                }
                case 2087890721: {
                    v10 = ns$SimulatedPlayerInput.icn("ihq", ieb(int ), (int)54);
                    continue block68;
                }
            }
            break;
        }
        v11 = var0.field_6014;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ihr", ieb(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ns$SimulatedPlayerInput.icn("ihs", ick(int ), (int)74)) break;
            v12 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iht", ick(int ), (int)75);
        }
        v13 = var0.field_6036;
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_2 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ihu", ieb(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ns$SimulatedPlayerInput.icn("ihv", ick(int ), (int)76)) break;
            v14 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ihw", ick(int ), (int)77);
        }
        v15 = var0.field_5969;
        v16 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl99
        block71: while (true) {
            v16 /* !! */  = (long)(v17 - ns$SimulatedPlayerInput.icn("ihx", ieb(int ), (int)57));
lbl99:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1935833159: {
                    v17 = ns$SimulatedPlayerInput.icn("ihy", ieb(int ), (int)58);
                    continue block71;
                }
                case 31672596: {
                    break block71;
                }
                case 1818684297: {
                    v17 = ns$SimulatedPlayerInput.icn("ihz", ieb(int ), (int)59);
                    continue block71;
                }
            }
            break;
        }
        v18 = new class_243(v11, v13, v15);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_3 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iia", ieb(int ), (int)60)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ns$SimulatedPlayerInput.icn("iib", ick(int ), (int)78)) break;
            v19 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iic", ick(int ), (int)79);
        }
        var1_4 = v6.method_1020(v18);
        if (var9_3 || var9_3) ** GOTO lbl41
        v20 /* !! */  = ns$SimulatedPlayerInput.ah;
        if (true) ** GOTO lbl120
        block73: while (true) {
            v20 /* !! */  = (long)(v21 - ns$SimulatedPlayerInput.icn("iid", ieb(int ), (int)61));
lbl120:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1924847261: {
                    v21 = ns$SimulatedPlayerInput.icn("iie", ieb(int ), (int)62);
                    continue block73;
                }
                case 31672596: {
                    break block73;
                }
                case 1056477350: {
                    v21 = ns$SimulatedPlayerInput.icn("iif", ieb(int ), (int)63);
                    continue block73;
                }
            }
            break;
        }
        var2_5 = var1_4.method_37268();
        if (var9_3 || var9_3) ** GOTO lbl41
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iig", ieb(int ), (int)64)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == ns$SimulatedPlayerInput.icn("iih", ick(int ), (int)80)) break;
            v22 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iii", ick(int ), (int)81);
        }
        v23 = ns$SimulatedPlayerInput.icn("iij", ick(int ), (int)82);
        v24 = ns$SimulatedPlayerInput.icn("iik", ick(int ), (int)83);
        v25 = ns$SimulatedPlayerInput.icn("iil", ick(int ), (int)84);
        v26 = ns$SimulatedPlayerInput.icn("iim", ick(int ), (int)85);
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_5 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iin", ieb(int ), (int)65)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == ns$SimulatedPlayerInput.icn("iio", ick(int ), (int)86)) break;
            v27 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iip", ick(int ), (int)87);
        }
        if (!var0.method_24828()) {
            v28 = ns$SimulatedPlayerInput.icn("iiq", ick(int ), (int)88);
            if (var11_1) {
                throw null;
            }
        } else {
            v28 = ns$SimulatedPlayerInput.icn("iir", ick(int ), (int)89);
        }
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_6 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iis", ieb(int ), (int)66)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == ns$SimulatedPlayerInput.icn("iit", ick(int ), (int)90)) break;
            v29 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iiu", ick(int ), (int)91);
        }
        v30 = var0.method_5715();
        if (var2_5 >= ns$SimulatedPlayerInput.icn("iiw", iiv(int ), (int)67)) {
            v31 = ns$SimulatedPlayerInput.icn("iix", ick(int ), (int)92);
            if (var11_1) {
                throw null;
            }
        } else {
            v31 = ns$SimulatedPlayerInput.icn("iiy", ick(int ), (int)93);
        }
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_7 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("iiz", ieb(int ), (int)68)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == ns$SimulatedPlayerInput.icn("ija", ick(int ), (int)94)) break;
            v32 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ijb", ick(int ), (int)95);
        }
        var4_6 = new class_10185((boolean)v23, (boolean)v24, (boolean)v25, (boolean)v26, (boolean)v28, v30, (boolean)v31);
        if (var9_3 || var9_3) ** GOTO lbl41
        if (!(var2_5 > ns$SimulatedPlayerInput.icn("ijc", iiv(int ), (int)69))) ** GOTO lbl202
        if (var9_3 || var9_3) ** GOTO lbl41
        while (true) {
            if ((v33 /* !! */  = (cfr_temp_8 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ijd", ieb(int ), (int)70)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v33 /* !! */  == ns$SimulatedPlayerInput.icn("ije", ick(int ), (int)96)) break;
            v33 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ijf", ick(int ), (int)97);
        }
        v34 = var0.method_36454();
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_9 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ijg", ieb(int ), (int)71)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == ns$SimulatedPlayerInput.icn("ijh", ick(int ), (int)98)) break;
            v35 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iji", ick(int ), (int)99);
        }
        var5_7 = nq.getDegreesRelativeToView(var1_4, v34);
        if (var9_3 || var9_3) ** GOTO lbl41
        while (true) {
            if ((v36 /* !! */  = (cfr_temp_10 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ijj", ieb(int ), (int)72)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v36 /* !! */  == ns$SimulatedPlayerInput.icn("ijk", ick(int ), (int)100)) break;
            v36 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ijl", ick(int ), (int)101);
        }
        var7_8 = class_3532.method_15338((double)var5_7);
        if (var9_3 || var9_3) ** GOTO lbl41
        while (true) {
            if ((v37 /* !! */  = (cfr_temp_11 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ijm", ieb(int ), (int)73)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v37 /* !! */  == ns$SimulatedPlayerInput.icn("ijn", ick(int ), (int)102)) break;
            v37 /* !! */  = (long)ns$SimulatedPlayerInput.icn("ijo", ick(int ), (int)103);
        }
        var4_6 = nq.getDirectionalInputForDegrees(var4_6, var7_8);
        if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_3) ** GOTO lbl41
lbl202:
                // 2 sources

                if (!var9_3 && !var9_3) ** break;
                ** continue;
                v38 /* !! */  = ns$SimulatedPlayerInput.ah;
                if (true) ** GOTO lbl208
                block82: while (true) {
                    v38 /* !! */  = (long)(v39 - ns$SimulatedPlayerInput.icn("ijp", ieb(int ), (int)74));
lbl208:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case 31672596: {
                            break block82;
                        }
                        case 963177443: {
                            v39 = ns$SimulatedPlayerInput.icn("ijq", ieb(int ), (int)75);
                            continue block82;
                        }
                        case 1044591073: {
                            v39 = ns$SimulatedPlayerInput.icn("ijr", ieb(int ), (int)76);
                            continue block82;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_12 = ns$SimulatedPlayerInput.ah - ns$SimulatedPlayerInput.icn("ijs", ieb(int ), (int)77)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == ns$SimulatedPlayerInput.icn("ijt", ick(int ), (int)104)) break;
                    v40 /* !! */  = (long)ns$SimulatedPlayerInput.icn("iju", ick(int ), (int)105);
                }
                return new ns$SimulatedPlayerInput(var4_6);
            }
lbl223:
            // 2 sources

            case 0: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ijv", ick(int ), (int)106);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl228:
            // 3 sources

            case 1: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ijw", ick(int ), (int)107);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl233:
            // 2 sources

            case 2: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ijx", ick(int ), (int)108);
                if (!var11_1) ** GOTO lbl228
                throw null;
            }
            case 3: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ijy", ick(int ), (int)109);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl242:
            // 3 sources

            case 4: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ijz", ick(int ), (int)110);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 5: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ika", ick(int ), (int)111);
                if (!var11_1) break;
                throw null;
            }
lbl251:
            // 2 sources

            case 6: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikb", ick(int ), (int)112);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 7: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikc", ick(int ), (int)113);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
            case 8: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikd", ick(int ), (int)114);
                if (!var11_1) ** GOTO lbl242
                throw null;
            }
lbl265:
            // 2 sources

            case 9: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ike", ick(int ), (int)115);
                if (var11_1) {
                    throw null;
                }
            }
lbl269:
            // 5 sources

            case 10: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikf", ick(int ), (int)116);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl274:
            // 2 sources

            case 11: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikg", ick(int ), (int)117);
                if (!var11_1) break;
                throw null;
            }
lbl278:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikh", ick(int ), (int)118);
                    if (!var11_1) ** GOTO lbl228
                    throw null;
                }
            }
            case 13: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("iki", ick(int ), (int)119);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 14: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikj", ick(int ), (int)120);
                if (!var11_1) ** GOTO lbl242
                throw null;
            }
            case 15: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikk", ick(int ), (int)121);
                if (!var11_1) ** GOTO lbl278
                throw null;
            }
lbl296:
            // 3 sources

            case 16: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikl", ick(int ), (int)122);
                if (!var11_1) ** GOTO lbl223
                throw null;
            }
lbl300:
            // 2 sources

            case 17: {
                var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikm", ick(int ), (int)123);
                if (!var11_1) ** GOTO lbl233
                throw null;
            }
            case 18: 
        }
        var10_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ikn", ick(int ), (int)124);
        ** while (!var11_1)
lbl307:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikp() {
        ns$SimulatedPlayerInput.icl[100] = 342687385;
        ns$SimulatedPlayerInput.icl[101] = -1081872567;
        ns$SimulatedPlayerInput.icl[102] = -1572083951;
        ns$SimulatedPlayerInput.icl[103] = -1092308845;
        ns$SimulatedPlayerInput.icl[104] = -105124678;
        ns$SimulatedPlayerInput.icl[105] = 389400964;
        ns$SimulatedPlayerInput.icl[106] = -127604711;
        ns$SimulatedPlayerInput.icl[107] = 484682952;
        ns$SimulatedPlayerInput.icl[108] = -2074993006;
        ns$SimulatedPlayerInput.icl[109] = 664010729;
        ns$SimulatedPlayerInput.icl[110] = -106221198;
        ns$SimulatedPlayerInput.icl[111] = -1484302341;
        ns$SimulatedPlayerInput.icl[112] = -314367726;
        ns$SimulatedPlayerInput.icl[113] = -655026221;
        ns$SimulatedPlayerInput.icl[114] = 246608838;
        ns$SimulatedPlayerInput.icl[115] = -1413390936;
        ns$SimulatedPlayerInput.icl[116] = 467552141;
        ns$SimulatedPlayerInput.icl[117] = 2114405640;
        ns$SimulatedPlayerInput.icl[118] = 2028738442;
        ns$SimulatedPlayerInput.icl[119] = 1507918333;
        ns$SimulatedPlayerInput.icl[120] = -1647117031;
        ns$SimulatedPlayerInput.icl[121] = -1671202470;
        ns$SimulatedPlayerInput.icl[122] = 723031035;
        ns$SimulatedPlayerInput.icl[123] = -419493470;
        ns$SimulatedPlayerInput.icl[124] = 130234362;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ns$SimulatedPlayerInput(class_10185 var1_1) {
        var3_2 /* !! */  = ns$SimulatedPlayerInput.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.forceSafeWalk = ns$SimulatedPlayerInput.icn("ico", ick(int ), (int)0);
                this.playerInput = var1_1;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("icp", ick(int ), (int)1);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("icq", ick(int ), (int)2);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: {
                while (true) {
                    var3_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("icr", ick(int ), (int)3);
                }
            }
            case 3: {
                while (true) {
                    var3_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ics", ick(int ), (int)4);
                }
            }
            case 4: 
        }
        var3_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ict", ick(int ), (int)5);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void update() {
        block69: {
            block68: {
                block67: {
                    block66: {
                        var3_1 = ns$SimulatedPlayerInput.c;
                        var2_2 /* !! */  = ns$SimulatedPlayerInput.b;
                        var1_3 = ns$SimulatedPlayerInput.a;
                        if (var3_1) {
                            throw null;
lbl6:
                            // 15 sources

                            return;
                        }
                        if (var1_3 || var1_3) ** GOTO lbl6
                        if (this.playerInput.comp_3159() == this.playerInput.comp_3160()) break block66;
                        if (var1_3 || var1_3) ** GOTO lbl6
                        if (this.playerInput.comp_3159()) {
                            v0 /* !! */  = 1.0f;
                            if (var3_1) {
                                throw null;
                            }
                        } else {
                            v0 /* !! */  = this.movementForward = (float)ns$SimulatedPlayerInput.icn("icv", icu(int ), (int)6);
                        }
                        if (var1_3) ** GOTO lbl6
                        if (var3_1) {
                            throw null;
                        }
                        break block67;
                    }
                    if (var1_3 || var1_3) ** GOTO lbl6
                    this.movementForward = 0.0f;
                    if (var1_3) ** GOTO lbl6
                }
                if (var1_3 || var1_3) ** GOTO lbl6
                if (this.playerInput.comp_3161() != this.playerInput.comp_3162()) break block68;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.movementSideways = 0.0f;
                if (var1_3) ** GOTO lbl6
                if (var3_1) {
                    throw null;
                }
                break block69;
            }
            if (var1_3 || var1_3) ** GOTO lbl6
            if (this.playerInput.comp_3161()) {
                v1 /* !! */  = 1.0f;
                if (var3_1) {
                    throw null;
                }
            } else {
                v1 /* !! */  = this.movementSideways = (float)ns$SimulatedPlayerInput.icn("icw", icu(int ), (int)7);
            }
            if (var1_3) ** GOTO lbl6
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        if (!this.playerInput.comp_3164()) ** GOTO lbl54
        if (var1_3 || var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.movementSideways *= ns$SimulatedPlayerInput.icn("icx", icu(int ), (int)8);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.movementForward *= ns$SimulatedPlayerInput.icn("icy", icu(int ), (int)9);
                if (var1_3) ** GOTO lbl6
lbl54:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("icz", ick(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl62:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ida", ick(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl67:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idb", ick(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl72:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idc", ick(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl77:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idd", ick(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
lbl81:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ide", ick(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 6: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idf", ick(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 7: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idg", ick(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 8: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idh", ick(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl101:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idi", ick(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 10: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idj", ick(int ), (int)20);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
lbl110:
            // 5 sources

            case 11: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idk", ick(int ), (int)21);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 12: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idl", ick(int ), (int)22);
                if (!var3_1) break;
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idm", ick(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl124:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idn", ick(int ), (int)24);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ido", ick(int ), (int)25);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 16: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idp", ick(int ), (int)26);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idq", ick(int ), (int)27);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idr", ick(int ), (int)28);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("ids", ick(int ), (int)29);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl149:
            // 4 sources

            case 20: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idt", ick(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl154:
            // 5 sources

            case 21: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idu", ick(int ), (int)31);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
lbl158:
            // 3 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idv", ick(int ), (int)32);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
            }
lbl163:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idw", ick(int ), (int)33);
                if (!var3_1) ** GOTO lbl154
                throw null;
            }
lbl167:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idx", ick(int ), (int)34);
                if (!var3_1) ** GOTO lbl163
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idy", ick(int ), (int)35);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
            case 26: {
                var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("idz", ick(int ), (int)36);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 27: 
        }
        var2_2 /* !! */  = (int)ns$SimulatedPlayerInput.icn("iea", ick(int ), (int)37);
        ** while (!var3_1)
lbl182:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikr() {
        ns$SimulatedPlayerInput.icm[100] = 342687384;
        ns$SimulatedPlayerInput.icm[101] = 1267695337;
        ns$SimulatedPlayerInput.icm[102] = -1572083952;
        ns$SimulatedPlayerInput.icm[103] = -1022380028;
        ns$SimulatedPlayerInput.icm[104] = -105124677;
        ns$SimulatedPlayerInput.icm[105] = 52493535;
        ns$SimulatedPlayerInput.icm[106] = -127604727;
        ns$SimulatedPlayerInput.icm[107] = 484682970;
        ns$SimulatedPlayerInput.icm[108] = -2074993022;
        ns$SimulatedPlayerInput.icm[109] = 664010730;
        ns$SimulatedPlayerInput.icm[110] = -106221194;
        ns$SimulatedPlayerInput.icm[111] = -1484302341;
        ns$SimulatedPlayerInput.icm[112] = -314367726;
        ns$SimulatedPlayerInput.icm[113] = -655026209;
        ns$SimulatedPlayerInput.icm[114] = 246608837;
        ns$SimulatedPlayerInput.icm[115] = -1413390933;
        ns$SimulatedPlayerInput.icm[116] = 467552142;
        ns$SimulatedPlayerInput.icm[117] = 2114405636;
        ns$SimulatedPlayerInput.icm[118] = 2028738436;
        ns$SimulatedPlayerInput.icm[119] = 1507918329;
        ns$SimulatedPlayerInput.icm[120] = -1647117029;
        ns$SimulatedPlayerInput.icm[121] = -1671202472;
        ns$SimulatedPlayerInput.icm[122] = 723031017;
        ns$SimulatedPlayerInput.icm[123] = -419493466;
        ns$SimulatedPlayerInput.icm[124] = 130234363;
    }

    private static /* synthetic */ int ick(int n2) {
        return icl[n2] ^ icm[n2];
    }

    private static /* synthetic */ void ikq() {
        ns$SimulatedPlayerInput.icm[0] = -1125295835;
        ns$SimulatedPlayerInput.icm[1] = -547773457;
        ns$SimulatedPlayerInput.icm[2] = 459147369;
        ns$SimulatedPlayerInput.icm[3] = 1845200034;
        ns$SimulatedPlayerInput.icm[4] = -791880889;
        ns$SimulatedPlayerInput.icm[5] = -643224270;
        ns$SimulatedPlayerInput.icm[6] = -1895735786;
        ns$SimulatedPlayerInput.icm[7] = 274030869;
        ns$SimulatedPlayerInput.icm[8] = 367602262;
        ns$SimulatedPlayerInput.icm[9] = -1866146643;
        ns$SimulatedPlayerInput.icm[10] = 1457549717;
        ns$SimulatedPlayerInput.icm[11] = 1567498315;
        ns$SimulatedPlayerInput.icm[12] = -701773456;
        ns$SimulatedPlayerInput.icm[13] = -678559079;
        ns$SimulatedPlayerInput.icm[14] = 1242615410;
        ns$SimulatedPlayerInput.icm[15] = 1024163952;
        ns$SimulatedPlayerInput.icm[16] = 1314512105;
        ns$SimulatedPlayerInput.icm[17] = -903688021;
        ns$SimulatedPlayerInput.icm[18] = -2088695318;
        ns$SimulatedPlayerInput.icm[19] = 466775168;
        ns$SimulatedPlayerInput.icm[20] = -1244232681;
        ns$SimulatedPlayerInput.icm[21] = 1606619475;
        ns$SimulatedPlayerInput.icm[22] = -407772446;
        ns$SimulatedPlayerInput.icm[23] = 985583407;
        ns$SimulatedPlayerInput.icm[24] = -565150615;
        ns$SimulatedPlayerInput.icm[25] = 380800834;
        ns$SimulatedPlayerInput.icm[26] = -1563628262;
        ns$SimulatedPlayerInput.icm[27] = -1467273203;
        ns$SimulatedPlayerInput.icm[28] = -1858182722;
        ns$SimulatedPlayerInput.icm[29] = -1990463187;
        ns$SimulatedPlayerInput.icm[30] = -1969341534;
        ns$SimulatedPlayerInput.icm[31] = 51543781;
        ns$SimulatedPlayerInput.icm[32] = -76668941;
        ns$SimulatedPlayerInput.icm[33] = 652152273;
        ns$SimulatedPlayerInput.icm[34] = 2119810700;
        ns$SimulatedPlayerInput.icm[35] = 175681894;
        ns$SimulatedPlayerInput.icm[36] = 1579248062;
        ns$SimulatedPlayerInput.icm[37] = -1839072202;
        ns$SimulatedPlayerInput.icm[38] = 1517963449;
        ns$SimulatedPlayerInput.icm[39] = 1949066294;
        ns$SimulatedPlayerInput.icm[40] = 1285036737;
        ns$SimulatedPlayerInput.icm[41] = -1308044480;
        ns$SimulatedPlayerInput.icm[42] = -1326018431;
        ns$SimulatedPlayerInput.icm[43] = -102753959;
        ns$SimulatedPlayerInput.icm[44] = -1314798982;
        ns$SimulatedPlayerInput.icm[45] = -374149688;
        ns$SimulatedPlayerInput.icm[46] = -1884884859;
        ns$SimulatedPlayerInput.icm[47] = -1201311468;
        ns$SimulatedPlayerInput.icm[48] = 1822720786;
        ns$SimulatedPlayerInput.icm[49] = 482802407;
        ns$SimulatedPlayerInput.icm[50] = -306533280;
        ns$SimulatedPlayerInput.icm[51] = -241667650;
        ns$SimulatedPlayerInput.icm[52] = 279458911;
        ns$SimulatedPlayerInput.icm[53] = 1120505194;
        ns$SimulatedPlayerInput.icm[54] = 366016049;
        ns$SimulatedPlayerInput.icm[55] = 1946944370;
        ns$SimulatedPlayerInput.icm[56] = 611387997;
        ns$SimulatedPlayerInput.icm[57] = 41375627;
        ns$SimulatedPlayerInput.icm[58] = -945764567;
        ns$SimulatedPlayerInput.icm[59] = 1614121853;
        ns$SimulatedPlayerInput.icm[60] = 716222793;
        ns$SimulatedPlayerInput.icm[61] = 282168227;
        ns$SimulatedPlayerInput.icm[62] = -1302208045;
        ns$SimulatedPlayerInput.icm[63] = -1670840148;
        ns$SimulatedPlayerInput.icm[64] = -938812186;
        ns$SimulatedPlayerInput.icm[65] = 192539108;
        ns$SimulatedPlayerInput.icm[66] = -1949661234;
        ns$SimulatedPlayerInput.icm[67] = -618490535;
        ns$SimulatedPlayerInput.icm[68] = 453245553;
        ns$SimulatedPlayerInput.icm[69] = 1489304223;
        ns$SimulatedPlayerInput.icm[70] = 192341417;
        ns$SimulatedPlayerInput.icm[71] = 1731255056;
        ns$SimulatedPlayerInput.icm[72] = -252010111;
        ns$SimulatedPlayerInput.icm[73] = -374568051;
        ns$SimulatedPlayerInput.icm[74] = -396005170;
        ns$SimulatedPlayerInput.icm[75] = 572364956;
        ns$SimulatedPlayerInput.icm[76] = -595161779;
        ns$SimulatedPlayerInput.icm[77] = 1035475919;
        ns$SimulatedPlayerInput.icm[78] = -1634148453;
        ns$SimulatedPlayerInput.icm[79] = 336486716;
        ns$SimulatedPlayerInput.icm[80] = 612761395;
        ns$SimulatedPlayerInput.icm[81] = -1250381991;
        ns$SimulatedPlayerInput.icm[82] = 1095294404;
        ns$SimulatedPlayerInput.icm[83] = -1666727482;
        ns$SimulatedPlayerInput.icm[84] = 930913006;
        ns$SimulatedPlayerInput.icm[85] = -241715439;
        ns$SimulatedPlayerInput.icm[86] = 1064458081;
        ns$SimulatedPlayerInput.icm[87] = -175421068;
        ns$SimulatedPlayerInput.icm[88] = 885499360;
        ns$SimulatedPlayerInput.icm[89] = 160181310;
        ns$SimulatedPlayerInput.icm[90] = 753472985;
        ns$SimulatedPlayerInput.icm[91] = -623700964;
        ns$SimulatedPlayerInput.icm[92] = -1590860548;
        ns$SimulatedPlayerInput.icm[93] = 1419112191;
        ns$SimulatedPlayerInput.icm[94] = -961714045;
        ns$SimulatedPlayerInput.icm[95] = -705741268;
        ns$SimulatedPlayerInput.icm[96] = 1883746222;
        ns$SimulatedPlayerInput.icm[97] = 71104156;
        ns$SimulatedPlayerInput.icm[98] = -955171985;
        ns$SimulatedPlayerInput.icm[99] = 1490327642;
    }

    private static /* synthetic */ double iiv(int n2) {
        return Double.longBitsToDouble(iec[n2] ^ ied[n2]);
    }

    private static /* synthetic */ void iks() {
        ns$SimulatedPlayerInput.iec[0] = 6111632854155149497L;
        ns$SimulatedPlayerInput.iec[1] = -229608298148083851L;
        ns$SimulatedPlayerInput.iec[2] = -2176767867169320388L;
        ns$SimulatedPlayerInput.iec[3] = -4768051958482862592L;
        ns$SimulatedPlayerInput.iec[4] = 4443405760340623809L;
        ns$SimulatedPlayerInput.iec[5] = -772190206345292052L;
        ns$SimulatedPlayerInput.iec[6] = 1757629543137220388L;
        ns$SimulatedPlayerInput.iec[7] = -9045672516023925202L;
        ns$SimulatedPlayerInput.iec[8] = -6672024963347334429L;
        ns$SimulatedPlayerInput.iec[9] = 7461467162791319190L;
        ns$SimulatedPlayerInput.iec[10] = -9030977989160335537L;
        ns$SimulatedPlayerInput.iec[11] = 1069640893284116223L;
        ns$SimulatedPlayerInput.iec[12] = 2318090940135567789L;
        ns$SimulatedPlayerInput.iec[13] = -658706958256262583L;
        ns$SimulatedPlayerInput.iec[14] = 1289778249121914605L;
        ns$SimulatedPlayerInput.iec[15] = 4655637143076658974L;
        ns$SimulatedPlayerInput.iec[16] = -3712990775699679112L;
        ns$SimulatedPlayerInput.iec[17] = 7485601575403994115L;
        ns$SimulatedPlayerInput.iec[18] = 1900618650695568750L;
        ns$SimulatedPlayerInput.iec[19] = -4248384947690852557L;
        ns$SimulatedPlayerInput.iec[20] = -2404191041964096552L;
        ns$SimulatedPlayerInput.iec[21] = 137872784995580182L;
        ns$SimulatedPlayerInput.iec[22] = -8106278212652737516L;
        ns$SimulatedPlayerInput.iec[23] = -955241416007021989L;
        ns$SimulatedPlayerInput.iec[24] = 2905012754914459372L;
        ns$SimulatedPlayerInput.iec[25] = 3774933216738275030L;
        ns$SimulatedPlayerInput.iec[26] = 9044011155691795310L;
        ns$SimulatedPlayerInput.iec[27] = -1879941927624748797L;
        ns$SimulatedPlayerInput.iec[28] = 9006383847097106135L;
        ns$SimulatedPlayerInput.iec[29] = -1983199998583304914L;
        ns$SimulatedPlayerInput.iec[30] = 4532391612671339655L;
        ns$SimulatedPlayerInput.iec[31] = 5753668139474617732L;
        ns$SimulatedPlayerInput.iec[32] = 3107736023473017115L;
        ns$SimulatedPlayerInput.iec[33] = -162335204043382063L;
        ns$SimulatedPlayerInput.iec[34] = -1774342967454395964L;
        ns$SimulatedPlayerInput.iec[35] = 778048091446653612L;
        ns$SimulatedPlayerInput.iec[36] = -5246167269972170867L;
        ns$SimulatedPlayerInput.iec[37] = -6926883054928810608L;
        ns$SimulatedPlayerInput.iec[38] = 2750221803122730240L;
        ns$SimulatedPlayerInput.iec[39] = 2420732791493508430L;
        ns$SimulatedPlayerInput.iec[40] = -7779805611440571794L;
        ns$SimulatedPlayerInput.iec[41] = 48244168381413730L;
        ns$SimulatedPlayerInput.iec[42] = 2476524632362485894L;
        ns$SimulatedPlayerInput.iec[43] = 8241507881947449186L;
        ns$SimulatedPlayerInput.iec[44] = -4426602499926287898L;
        ns$SimulatedPlayerInput.iec[45] = -6465168193203160156L;
        ns$SimulatedPlayerInput.iec[46] = 4790393644610369039L;
        ns$SimulatedPlayerInput.iec[47] = 7419299209677143793L;
        ns$SimulatedPlayerInput.iec[48] = -2769438546238221029L;
        ns$SimulatedPlayerInput.iec[49] = 4473525380597196464L;
        ns$SimulatedPlayerInput.iec[50] = 8750144142310995418L;
        ns$SimulatedPlayerInput.iec[51] = 3521387553879148117L;
        ns$SimulatedPlayerInput.iec[52] = -6475485628963217002L;
        ns$SimulatedPlayerInput.iec[53] = 3729501647119930681L;
        ns$SimulatedPlayerInput.iec[54] = -6673727842670380571L;
        ns$SimulatedPlayerInput.iec[55] = 802423164135188638L;
        ns$SimulatedPlayerInput.iec[56] = -5537897001268473379L;
        ns$SimulatedPlayerInput.iec[57] = -2630022384614918324L;
        ns$SimulatedPlayerInput.iec[58] = -6231019902356665530L;
        ns$SimulatedPlayerInput.iec[59] = 429911710481190187L;
        ns$SimulatedPlayerInput.iec[60] = 4190808626489439367L;
        ns$SimulatedPlayerInput.iec[61] = -9112190781144607094L;
        ns$SimulatedPlayerInput.iec[62] = -7216247669005429394L;
        ns$SimulatedPlayerInput.iec[63] = -6215562599189723546L;
        ns$SimulatedPlayerInput.iec[64] = -4289533763722652575L;
        ns$SimulatedPlayerInput.iec[65] = 2852848851966751662L;
        ns$SimulatedPlayerInput.iec[66] = 3722567399160117192L;
        ns$SimulatedPlayerInput.iec[67] = -48476944277839479L;
        ns$SimulatedPlayerInput.iec[68] = 1853762847511842874L;
        ns$SimulatedPlayerInput.iec[69] = -5556172791611712559L;
        ns$SimulatedPlayerInput.iec[70] = 5272090258797119688L;
        ns$SimulatedPlayerInput.iec[71] = 7125680237612064317L;
        ns$SimulatedPlayerInput.iec[72] = -6358956296881616259L;
        ns$SimulatedPlayerInput.iec[73] = 7042279774901026276L;
        ns$SimulatedPlayerInput.iec[74] = 6718188038894994721L;
        ns$SimulatedPlayerInput.iec[75] = 2438914188601407354L;
        ns$SimulatedPlayerInput.iec[76] = 278592062534961458L;
        ns$SimulatedPlayerInput.iec[77] = 7268071830492909061L;
    }

    private static /* synthetic */ float icu(int n2) {
        return Float.intBitsToFloat(icl[n2] ^ icm[n2]);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static ns$SimulatedPlayerInput fromClientPlayer(class_10185 class_101852) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ah - ns$SimulatedPlayerInput.icn("igh", ieb(int ), (int)29)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ns$SimulatedPlayerInput.icn("igi", ick(int ), (int)64)) break;
            object = ns$SimulatedPlayerInput.icn("igj", ick(int ), (int)65);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ah - ns$SimulatedPlayerInput.icn("igk", ieb(int ), (int)30)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ns$SimulatedPlayerInput.icn("igl", ick(int ), (int)66)) break;
            object = ns$SimulatedPlayerInput.icn("igm", ick(int ), (int)67);
        }
        int n2 = b;
        Object object = ah;
        block15: while (true) {
            switch ((int)object) {
                case -736934460: {
                    object = ns$SimulatedPlayerInput.icn("igo", ieb(int ), (int)32) - ns$SimulatedPlayerInput.icn("ign", ieb(int ), (int)31);
                    continue block15;
                }
                case 31672596: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        Object object2 = ah;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ns$SimulatedPlayerInput.icn("igp", ieb(int ), (int)33);
            }
            switch ((int)object2) {
                case 31672596: {
                    break block16;
                }
                case 1057344549: {
                    callSite = ns$SimulatedPlayerInput.icn("igq", ieb(int ), (int)34);
                    continue block16;
                }
                case 1892426789: {
                    callSite = ns$SimulatedPlayerInput.icn("igr", ieb(int ), (int)35);
                    continue block16;
                }
            }
            break;
        }
        Object object3 = ah;
        block17: while (true) {
            switch ((int)object3) {
                case 31672596: {
                    return new ns$SimulatedPlayerInput(class_101852);
                }
                case 1341460250: {
                    object3 = ns$SimulatedPlayerInput.icn("igt", ieb(int ), (int)37) - ns$SimulatedPlayerInput.icn("igs", ieb(int ), (int)36);
                    continue block17;
                }
            }
            break;
        }
        return new ns$SimulatedPlayerInput(class_101852);
    }

    public static /* synthetic */ CallSite icn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

