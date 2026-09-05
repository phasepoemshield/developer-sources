/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_1542
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.minecraft.class_1542;
import net.minecraft.class_1799;

final class jp$WorldShulker
extends Record {
    public static final boolean c;
    public static final int b;
    public static final boolean a;
    private final List<class_1799> contents;
    private static long[] bwuy;
    private static int[] bwur;
    private static final long eo = 4478990348288664658L;
    private static int[] bwuq;
    private static long[] bwux;
    private final class_1542 item;

    public static /* synthetic */ CallSite bwus(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long bwuw(int n2) {
        return bwux[n2] ^ bwuy[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final int hashCode() {
        while (true) {
            block33: {
                if ((v0 /* !! */  = (cfr_temp_1 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwvq", bwuw(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != jp$WorldShulker.bwus("bwvr", bwup(int ), (int)9)) break block33;
                var3_1 = jp$WorldShulker.c;
                v1 /* !! */  = jp$WorldShulker.eo;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)jp$WorldShulker.bwus("bwvs", bwup(int ), (int)10);
        }
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - jp$WorldShulker.bwus("bwvt", bwuw(int ), (int)12));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1722845809: {
                    v2 = jp$WorldShulker.bwus("bwvu", bwuw(int ), (int)13);
                    continue block23;
                }
                case -1239014318: {
                    break block23;
                }
                case -266162869: {
                    v2 = jp$WorldShulker.bwus("bwvv", bwuw(int ), (int)14);
                    continue block23;
                }
                case 222728509: {
                    v2 = jp$WorldShulker.bwus("bwvw", bwuw(int ), (int)15);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = jp$WorldShulker.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = jp$WorldShulker.eo;
                    block25: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -1239014318: {
                                break block25;
                            }
                            case -885491105: {
                                v4 = jp$WorldShulker.bwus("bwvy", bwuw(int ), (int)17);
                                ** GOTO lbl41
                            }
                            case 1740528769: {
                                v4 = jp$WorldShulker.bwus("bwvz", bwuw(int ), (int)18);
lbl41:
                                // 2 sources

                                v3 /* !! */  = (long)(v4 - jp$WorldShulker.bwus("bwvx", bwuw(int ), (int)16));
                                continue block25;
                            }
                        }
                        break;
                    }
                    var1_3 = jp$WorldShulker.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (int)jp$WorldShulker.bwus("bwwa", bwup(int ), (int)11);
                    if (var1_3 != false) return (int)jp$WorldShulker.bwus("bwwa", bwup(int ), (int)11);
                    v5 /* !! */  = jp$WorldShulker.eo;
                    block26: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -1239014318: {
                                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jp$WorldShulker.class, "item;contents", "item", "contents"}, this);
                            }
                            case 611633823: {
                                v6 = jp$WorldShulker.bwus("bwwc", bwuw(int ), (int)20);
                                ** GOTO lbl58
                            }
                            case 2135648745: {
                                v6 = jp$WorldShulker.bwus("bwwd", bwuw(int ), (int)21);
lbl58:
                                // 2 sources

                                v5 /* !! */  = (long)(v6 - jp$WorldShulker.bwus("bwwb", bwuw(int ), (int)19));
                                continue block26;
                            }
                        }
                        break;
                    }
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jp$WorldShulker.class, "item;contents", "item", "contents"}, this);
                }
                case 3: {
                    var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwwh", bwup(int ), (int)15);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwwe", bwup(int ), (int)12);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwwf", bwup(int ), (int)13);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl78
            break;
        }
        do {
            if (true) ** continue;
lbl78:
            // 2 sources

            var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwwg", bwup(int ), (int)14);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bwyj() {
        jp$WorldShulker.bwux[0] = -2016124947330806295L;
        jp$WorldShulker.bwux[1] = 3179557025340761683L;
        jp$WorldShulker.bwux[2] = -6313166901579714123L;
        jp$WorldShulker.bwux[3] = -5488034858440546398L;
        jp$WorldShulker.bwux[4] = -5429514128027419002L;
        jp$WorldShulker.bwux[5] = 4756903247251693520L;
        jp$WorldShulker.bwux[6] = 6803890552908705571L;
        jp$WorldShulker.bwux[7] = -3679866703043000428L;
        jp$WorldShulker.bwux[8] = -6796325872837416001L;
        jp$WorldShulker.bwux[9] = 1969502253114728326L;
        jp$WorldShulker.bwux[10] = 2011544045734446763L;
        jp$WorldShulker.bwux[11] = -2438636826827908625L;
        jp$WorldShulker.bwux[12] = 973308862635570343L;
        jp$WorldShulker.bwux[13] = 697900566544264336L;
        jp$WorldShulker.bwux[14] = -4919711118745843077L;
        jp$WorldShulker.bwux[15] = 760624283639261653L;
        jp$WorldShulker.bwux[16] = -7012643350354884893L;
        jp$WorldShulker.bwux[17] = 3946815998149348604L;
        jp$WorldShulker.bwux[18] = -1529249680103342158L;
        jp$WorldShulker.bwux[19] = -59474385836795550L;
        jp$WorldShulker.bwux[20] = 8253778442438766843L;
        jp$WorldShulker.bwux[21] = 5217934559162573564L;
        jp$WorldShulker.bwux[22] = -3340332867410277800L;
        jp$WorldShulker.bwux[23] = -549691324523838327L;
        jp$WorldShulker.bwux[24] = -3425567305815670197L;
        jp$WorldShulker.bwux[25] = 5095001628045047874L;
        jp$WorldShulker.bwux[26] = 6995171336800833778L;
        jp$WorldShulker.bwux[27] = -7288032034869124396L;
        jp$WorldShulker.bwux[28] = -8567842524764529563L;
        jp$WorldShulker.bwux[29] = 6645723414380648460L;
        jp$WorldShulker.bwux[30] = -1103341471109020553L;
        jp$WorldShulker.bwux[31] = -3553074395666450447L;
        jp$WorldShulker.bwux[32] = 4144413203224117083L;
        jp$WorldShulker.bwux[33] = 8759785231365210955L;
        jp$WorldShulker.bwux[34] = 4437872778626370261L;
        jp$WorldShulker.bwux[35] = 2530221192270285416L;
        jp$WorldShulker.bwux[36] = 377400756394998414L;
        jp$WorldShulker.bwux[37] = 5283987953532741060L;
        jp$WorldShulker.bwux[38] = -3173289196006468331L;
        jp$WorldShulker.bwux[39] = 293453863125878499L;
        jp$WorldShulker.bwux[40] = -2902804799471337240L;
        jp$WorldShulker.bwux[41] = 7956800757256146663L;
        jp$WorldShulker.bwux[42] = 679597269958849135L;
        jp$WorldShulker.bwux[43] = -5169893180239738517L;
    }

    private static /* synthetic */ void bwyh() {
        jp$WorldShulker.bwuq[0] = 1948321404;
        jp$WorldShulker.bwuq[1] = 480127576;
        jp$WorldShulker.bwuq[2] = 1114310378;
        jp$WorldShulker.bwuq[3] = 735507870;
        jp$WorldShulker.bwuq[4] = -1066549930;
        jp$WorldShulker.bwuq[5] = -725299912;
        jp$WorldShulker.bwuq[6] = -646794984;
        jp$WorldShulker.bwuq[7] = 1016298902;
        jp$WorldShulker.bwuq[8] = 1867674321;
        jp$WorldShulker.bwuq[9] = 1707691555;
        jp$WorldShulker.bwuq[10] = 1172235658;
        jp$WorldShulker.bwuq[11] = -964180021;
        jp$WorldShulker.bwuq[12] = 1381357686;
        jp$WorldShulker.bwuq[13] = -1252320901;
        jp$WorldShulker.bwuq[14] = -503220163;
        jp$WorldShulker.bwuq[15] = -567334461;
        jp$WorldShulker.bwuq[16] = -1379343640;
        jp$WorldShulker.bwuq[17] = 725034726;
        jp$WorldShulker.bwuq[18] = 1152678438;
        jp$WorldShulker.bwuq[19] = -1474287948;
        jp$WorldShulker.bwuq[20] = 289843253;
        jp$WorldShulker.bwuq[21] = -1490765191;
        jp$WorldShulker.bwuq[22] = -481369462;
        jp$WorldShulker.bwuq[23] = -228276920;
        jp$WorldShulker.bwuq[24] = -466480370;
        jp$WorldShulker.bwuq[25] = 2010947631;
        jp$WorldShulker.bwuq[26] = 1555422362;
        jp$WorldShulker.bwuq[27] = -2144510297;
        jp$WorldShulker.bwuq[28] = 636352898;
        jp$WorldShulker.bwuq[29] = 332598376;
        jp$WorldShulker.bwuq[30] = 840797699;
        jp$WorldShulker.bwuq[31] = 1204828537;
        jp$WorldShulker.bwuq[32] = -1859658779;
        jp$WorldShulker.bwuq[33] = -2068152959;
        jp$WorldShulker.bwuq[34] = -1216552916;
        jp$WorldShulker.bwuq[35] = 1894699653;
        jp$WorldShulker.bwuq[36] = -1983344856;
        jp$WorldShulker.bwuq[37] = -1398768587;
        jp$WorldShulker.bwuq[38] = 1743878667;
        jp$WorldShulker.bwuq[39] = 472567094;
        jp$WorldShulker.bwuq[40] = 1022924392;
        jp$WorldShulker.bwuq[41] = -1800737900;
        jp$WorldShulker.bwuq[42] = -2074198944;
        jp$WorldShulker.bwuq[43] = -49898787;
        jp$WorldShulker.bwuq[44] = -1062031903;
    }

    private static /* synthetic */ int bwup(int n2) {
        return bwuq[n2] ^ bwur[n2];
    }

    static {
        bwuq = new int[45];
        bwur = new int[45];
        jp$WorldShulker.bwyh();
        jp$WorldShulker.bwyi();
        bwux = new long[44];
        bwuy = new long[44];
        jp$WorldShulker.bwyj();
        jp$WorldShulker.bwyn();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jp$WorldShulker(class_1542 var1_1, List<class_1799> var2_2) {
        var4_3 /* !! */  = jp$WorldShulker.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.item = var1_1;
                this.contents = var2_2;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)jp$WorldShulker.bwus("bwut", bwup(int ), (int)0);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)jp$WorldShulker.bwus("bwuu", bwup(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)jp$WorldShulker.bwus("bwuv", bwup(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void bwyi() {
        jp$WorldShulker.bwur[0] = 1948321406;
        jp$WorldShulker.bwur[1] = 480127576;
        jp$WorldShulker.bwur[2] = 1114310379;
        jp$WorldShulker.bwur[3] = -735507871;
        jp$WorldShulker.bwur[4] = -927014666;
        jp$WorldShulker.bwur[5] = -725299911;
        jp$WorldShulker.bwur[6] = -646794981;
        jp$WorldShulker.bwur[7] = 1016298902;
        jp$WorldShulker.bwur[8] = 1867674320;
        jp$WorldShulker.bwur[9] = 1707691554;
        jp$WorldShulker.bwur[10] = -607817110;
        jp$WorldShulker.bwur[11] = 223662593;
        jp$WorldShulker.bwur[12] = 1381357687;
        jp$WorldShulker.bwur[13] = -1252320902;
        jp$WorldShulker.bwur[14] = -503220163;
        jp$WorldShulker.bwur[15] = -567334462;
        jp$WorldShulker.bwur[16] = 1379343639;
        jp$WorldShulker.bwur[17] = 1274943340;
        jp$WorldShulker.bwur[18] = 1152678438;
        jp$WorldShulker.bwur[19] = -1474287947;
        jp$WorldShulker.bwur[20] = -1308670332;
        jp$WorldShulker.bwur[21] = -1490765192;
        jp$WorldShulker.bwur[22] = -481369462;
        jp$WorldShulker.bwur[23] = -228276918;
        jp$WorldShulker.bwur[24] = -466480370;
        jp$WorldShulker.bwur[25] = 2010947630;
        jp$WorldShulker.bwur[26] = 1560297944;
        jp$WorldShulker.bwur[27] = -2144510298;
        jp$WorldShulker.bwur[28] = -957705402;
        jp$WorldShulker.bwur[29] = 332598377;
        jp$WorldShulker.bwur[30] = 1925984735;
        jp$WorldShulker.bwur[31] = -1204828538;
        jp$WorldShulker.bwur[32] = -1710479514;
        jp$WorldShulker.bwur[33] = -2068152959;
        jp$WorldShulker.bwur[34] = -1216552916;
        jp$WorldShulker.bwur[35] = 1894699652;
        jp$WorldShulker.bwur[36] = -1983344853;
        jp$WorldShulker.bwur[37] = 1398768586;
        jp$WorldShulker.bwur[38] = 986847646;
        jp$WorldShulker.bwur[39] = 472567095;
        jp$WorldShulker.bwur[40] = 267087917;
        jp$WorldShulker.bwur[41] = -1800737897;
        jp$WorldShulker.bwur[42] = -2074198942;
        jp$WorldShulker.bwur[43] = -49898787;
        jp$WorldShulker.bwur[44] = -1062031904;
    }

    private static /* synthetic */ void bwyn() {
        jp$WorldShulker.bwuy[0] = -5974247287774959197L;
        jp$WorldShulker.bwuy[1] = -7276631370596954211L;
        jp$WorldShulker.bwuy[2] = -2901539463894257653L;
        jp$WorldShulker.bwuy[3] = 1136534039443216142L;
        jp$WorldShulker.bwuy[4] = -6626357384465591906L;
        jp$WorldShulker.bwuy[5] = -671214218826656041L;
        jp$WorldShulker.bwuy[6] = -1490296398397816218L;
        jp$WorldShulker.bwuy[7] = -8968732353032496910L;
        jp$WorldShulker.bwuy[8] = -2044602362580203696L;
        jp$WorldShulker.bwuy[9] = -5663844018572431746L;
        jp$WorldShulker.bwuy[10] = 516584770305929654L;
        jp$WorldShulker.bwuy[11] = -149820836384799368L;
        jp$WorldShulker.bwuy[12] = -5863781402067422423L;
        jp$WorldShulker.bwuy[13] = 5202459758074420439L;
        jp$WorldShulker.bwuy[14] = 5995963665194395069L;
        jp$WorldShulker.bwuy[15] = -8054827122634531803L;
        jp$WorldShulker.bwuy[16] = 947351767104858895L;
        jp$WorldShulker.bwuy[17] = 1268442206245974161L;
        jp$WorldShulker.bwuy[18] = 1925457014232072924L;
        jp$WorldShulker.bwuy[19] = 9155075032808829810L;
        jp$WorldShulker.bwuy[20] = 6913961757479112184L;
        jp$WorldShulker.bwuy[21] = -1020322462251231312L;
        jp$WorldShulker.bwuy[22] = -4757247237345373028L;
        jp$WorldShulker.bwuy[23] = -8115388938631633302L;
        jp$WorldShulker.bwuy[24] = 7888794044157009091L;
        jp$WorldShulker.bwuy[25] = 3125712292098837547L;
        jp$WorldShulker.bwuy[26] = 8982349189692174099L;
        jp$WorldShulker.bwuy[27] = -5218146909900252952L;
        jp$WorldShulker.bwuy[28] = -6496070681206394365L;
        jp$WorldShulker.bwuy[29] = 6636884871987112239L;
        jp$WorldShulker.bwuy[30] = -4453424697012577545L;
        jp$WorldShulker.bwuy[31] = 8612939759090207394L;
        jp$WorldShulker.bwuy[32] = -7113117249085044421L;
        jp$WorldShulker.bwuy[33] = -5823385657601233022L;
        jp$WorldShulker.bwuy[34] = -4852998063305596418L;
        jp$WorldShulker.bwuy[35] = 2104064382271105814L;
        jp$WorldShulker.bwuy[36] = 8183344544360484370L;
        jp$WorldShulker.bwuy[37] = 9166968541207214268L;
        jp$WorldShulker.bwuy[38] = -878602969226693340L;
        jp$WorldShulker.bwuy[39] = -1518691899361959369L;
        jp$WorldShulker.bwuy[40] = 8179151674744704217L;
        jp$WorldShulker.bwuy[41] = -1680905315224721274L;
        jp$WorldShulker.bwuy[42] = -792689803264955206L;
        jp$WorldShulker.bwuy[43] = 6414007629192289259L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1542 item() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwxb", bwuw(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jp$WorldShulker.bwus("bwxc", bwup(int ), (int)25)) break;
            v0 /* !! */  = (long)jp$WorldShulker.bwus("bwxd", bwup(int ), (int)26);
        }
        var3_1 = jp$WorldShulker.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwxe", bwuw(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jp$WorldShulker.bwus("bwxf", bwup(int ), (int)27)) break;
            v1 /* !! */  = (long)jp$WorldShulker.bwus("bwxg", bwup(int ), (int)28);
        }
        var2_2 /* !! */  = jp$WorldShulker.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwxh", bwuw(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jp$WorldShulker.bwus("bwxi", bwup(int ), (int)29)) break;
            v2 /* !! */  = (long)jp$WorldShulker.bwus("bwxj", bwup(int ), (int)30);
        }
        var1_3 = jp$WorldShulker.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwxk", bwuw(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jp$WorldShulker.bwus("bwxl", bwup(int ), (int)31)) break;
                    v3 /* !! */  = (long)jp$WorldShulker.bwus("bwxm", bwup(int ), (int)32);
                }
                return this.item;
            }
lbl37:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwxn", bwup(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwxo", bwup(int ), (int)34);
                    if (!var3_1) ** GOTO lbl37
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwxp", bwup(int ), (int)35);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwxq", bwup(int ), (int)36);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwuz", bwuw(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jp$WorldShulker.bwus("bwva", bwup(int ), (int)3)) break;
            v0 /* !! */  = (long)jp$WorldShulker.bwus("bwvb", bwup(int ), (int)4);
        }
        var3_1 = jp$WorldShulker.c;
        v1 /* !! */  = jp$WorldShulker.eo;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - jp$WorldShulker.bwus("bwvc", bwuw(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1777799823: {
                    v2 = jp$WorldShulker.bwus("bwvd", bwuw(int ), (int)2);
                    continue block23;
                }
                case -1239014318: {
                    break block23;
                }
                case 1199463831: {
                    v2 = jp$WorldShulker.bwus("bwve", bwuw(int ), (int)3);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = jp$WorldShulker.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jp$WorldShulker.eo;
                if (true) ** GOTO lbl29
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - jp$WorldShulker.bwus("bwvf", bwuw(int ), (int)4));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1239014318: {
                            break block24;
                        }
                        case -335376578: {
                            v4 = jp$WorldShulker.bwus("bwvg", bwuw(int ), (int)5);
                            continue block24;
                        }
                        case 561643702: {
                            v4 = jp$WorldShulker.bwus("bwvh", bwuw(int ), (int)6);
                            continue block24;
                        }
                    }
                    break;
                }
                var1_3 = jp$WorldShulker.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = jp$WorldShulker.eo;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - jp$WorldShulker.bwus("bwvi", bwuw(int ), (int)7));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1239014318: {
                            break block26;
                        }
                        case -586339042: {
                            v6 = jp$WorldShulker.bwus("bwvj", bwuw(int ), (int)8);
                            continue block26;
                        }
                        case 576869871: {
                            v6 = jp$WorldShulker.bwus("bwvk", bwuw(int ), (int)9);
                            continue block26;
                        }
                        case 1282994821: {
                            v6 = jp$WorldShulker.bwus("bwvl", bwuw(int ), (int)10);
                            continue block26;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{jp$WorldShulker.class, "item;contents", "item", "contents"}, this);
            }
lbl61:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwvm", bwup(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwvn", bwup(int ), (int)6);
                    if (!var3_1) ** GOTO lbl61
                    throw null;
                }
            }
lbl71:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwvo", bwup(int ), (int)7);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwvp", bwup(int ), (int)8);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwwi", bwuw(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jp$WorldShulker.bwus("bwwj", bwup(int ), (int)16)) break;
            v0 /* !! */  = (long)jp$WorldShulker.bwus("bwwk", bwup(int ), (int)17);
        }
        var4_2 = jp$WorldShulker.c;
        v1 /* !! */  = jp$WorldShulker.eo;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - jp$WorldShulker.bwus("bwwl", bwuw(int ), (int)23));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1848322915: {
                    v2 = jp$WorldShulker.bwus("bwwm", bwuw(int ), (int)24);
                    continue block13;
                }
                case -1239014318: {
                    break block13;
                }
                case -101602273: {
                    v2 = jp$WorldShulker.bwus("bwwn", bwuw(int ), (int)25);
                    continue block13;
                }
                case 715559834: {
                    v2 = jp$WorldShulker.bwus("bwwo", bwuw(int ), (int)26);
                    continue block13;
                }
            }
            break;
        }
        var3_3 = jp$WorldShulker.b;
        v3 /* !! */  = jp$WorldShulker.eo;
        if (true) ** GOTO lbl29
        block14: while (true) {
            v3 /* !! */  = (long)(v4 - jp$WorldShulker.bwus("bwwp", bwuw(int ), (int)27));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1546876674: {
                    v4 = jp$WorldShulker.bwus("bwwq", bwuw(int ), (int)28);
                    continue block14;
                }
                case -1239014318: {
                    break block14;
                }
                case -333908041: {
                    v4 = jp$WorldShulker.bwus("bwwr", bwuw(int ), (int)29);
                    continue block14;
                }
                case -110293969: {
                    v4 = jp$WorldShulker.bwus("bwws", bwuw(int ), (int)30);
                    continue block14;
                }
            }
            break;
        }
        var2_4 = jp$WorldShulker.a;
        if (var4_2) {
            throw null;
lbl44:
            // 1 sources

            return (boolean)jp$WorldShulker.bwus("bwwt", bwup(int ), (int)18);
        }
        ** while (var2_4 || var2_4)
lbl47:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwwu", bwuw(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == jp$WorldShulker.bwus("bwwv", bwup(int ), (int)19)) break;
            v5 /* !! */  = (long)jp$WorldShulker.bwus("bwww", bwup(int ), (int)20);
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jp$WorldShulker.class, "item;contents", "item", "contents"}, this, var1_1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<class_1799> contents() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwxr", bwuw(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jp$WorldShulker.bwus("bwxs", bwup(int ), (int)37)) break;
            v0 /* !! */  = (long)jp$WorldShulker.bwus("bwxt", bwup(int ), (int)38);
        }
        var3_1 = jp$WorldShulker.c;
        v1 /* !! */  = jp$WorldShulker.eo;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(jp$WorldShulker.bwus("bwxv", bwuw(int ), (int)38) - jp$WorldShulker.bwus("bwxu", bwuw(int ), (int)37));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1646585005: {
                    continue block17;
                }
                case -1239014318: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = jp$WorldShulker.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jp$WorldShulker.eo - jp$WorldShulker.bwus("bwxw", bwuw(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jp$WorldShulker.bwus("bwxx", bwup(int ), (int)39)) break;
            v2 /* !! */  = (long)jp$WorldShulker.bwus("bwxy", bwup(int ), (int)40);
        }
        var1_3 = jp$WorldShulker.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = jp$WorldShulker.eo;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - jp$WorldShulker.bwus("bwxz", bwuw(int ), (int)40));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1239014318: {
                            break block20;
                        }
                        case -1217725700: {
                            v4 = jp$WorldShulker.bwus("bwya", bwuw(int ), (int)41);
                            continue block20;
                        }
                        case -836203287: {
                            v4 = jp$WorldShulker.bwus("bwyb", bwuw(int ), (int)42);
                            continue block20;
                        }
                        case 1707867125: {
                            v4 = jp$WorldShulker.bwus("bwyc", bwuw(int ), (int)43);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.contents;
            }
            case 0: {
                var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwyd", bwup(int ), (int)41);
                if (!var3_1) break;
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwye", bwup(int ), (int)42);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwyf", bwup(int ), (int)43);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jp$WorldShulker.bwus("bwyg", bwup(int ), (int)44);
        } while (!var3_1);
        throw null;
    }
}

