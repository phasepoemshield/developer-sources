/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import ruhack.phobia.ov;

public class hv$AttackPerpetratorConfigurable {
    private static int[] gjv;
    private final boolean shieldBreaker;
    private final ov angle;
    private final class_238 box;
    private final boolean eatAndAttack;
    private static int[] gju;
    private static long[] gkj;
    protected static final long ac = -7822713604818001060L;
    public static final boolean c;
    private final boolean shouldUnPressShield;
    private final class_1309 target;
    public static final int b;
    private static long[] gkk;
    public static final boolean a;
    private final boolean onlyCritical;
    private final float maximumRange;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isOnlyCritical() {
        Object object = ac;
        block19: while (true) {
            switch ((int)object) {
                case 1161110364: {
                    break block19;
                }
                case 1278390739: {
                    object = hv$AttackPerpetratorConfigurable.gjw("gmh", gki(int ), (int)24) - hv$AttackPerpetratorConfigurable.gjw("gmg", gki(int ), (int)23);
                    continue block19;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = ac;
        block20: while (true) {
            switch ((int)object2) {
                case 1161110364: {
                    break block20;
                }
                case 2001108339: {
                    object2 = hv$AttackPerpetratorConfigurable.gjw("gmj", gki(int ), (int)26) - hv$AttackPerpetratorConfigurable.gjw("gmi", gki(int ), (int)25);
                    continue block20;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ac;
        boolean bl3 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object3 = callSite - hv$AttackPerpetratorConfigurable.gjw("gmk", gki(int ), (int)27);
            }
            switch ((int)object3) {
                case -162822116: {
                    callSite = hv$AttackPerpetratorConfigurable.gjw("gml", gki(int ), (int)28);
                    continue block21;
                }
                case 209813668: {
                    callSite = hv$AttackPerpetratorConfigurable.gjw("gmm", gki(int ), (int)29);
                    continue block21;
                }
                case 209926111: {
                    callSite = hv$AttackPerpetratorConfigurable.gjw("gmn", gki(int ), (int)30);
                    continue block21;
                }
                case 1161110364: {
                    break block21;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return (boolean)hv$AttackPerpetratorConfigurable.gjw("gmo", gjt(int ), (int)34);
        if (bl4) return (boolean)hv$AttackPerpetratorConfigurable.gjw("gmo", gjt(int ), (int)34);
        Object object4 = ac;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - hv$AttackPerpetratorConfigurable.gjw("gmp", gki(int ), (int)31);
            }
            switch ((int)object4) {
                case 1161110364: {
                    return this.onlyCritical;
                }
                case 1451169250: {
                    callSite = hv$AttackPerpetratorConfigurable.gjw("gmq", gki(int ), (int)32);
                    continue block22;
                }
                case 2062192605: {
                    callSite = hv$AttackPerpetratorConfigurable.gjw("gmr", gki(int ), (int)33);
                    continue block22;
                }
            }
            break;
        }
        return this.onlyCritical;
    }

    private static /* synthetic */ void gpm() {
        hv$AttackPerpetratorConfigurable.gjv[0] = 317226926;
        hv$AttackPerpetratorConfigurable.gjv[1] = -860986367;
        hv$AttackPerpetratorConfigurable.gjv[2] = -1479247803;
        hv$AttackPerpetratorConfigurable.gjv[3] = -309869031;
        hv$AttackPerpetratorConfigurable.gjv[4] = 1142712465;
        hv$AttackPerpetratorConfigurable.gjv[5] = -2042090458;
        hv$AttackPerpetratorConfigurable.gjv[6] = -1458183698;
        hv$AttackPerpetratorConfigurable.gjv[7] = 1743103333;
        hv$AttackPerpetratorConfigurable.gjv[8] = -1336371855;
        hv$AttackPerpetratorConfigurable.gjv[9] = 951164018;
        hv$AttackPerpetratorConfigurable.gjv[10] = -951194951;
        hv$AttackPerpetratorConfigurable.gjv[11] = -2107013686;
        hv$AttackPerpetratorConfigurable.gjv[12] = -570072429;
        hv$AttackPerpetratorConfigurable.gjv[13] = 94279356;
        hv$AttackPerpetratorConfigurable.gjv[14] = -1581690770;
        hv$AttackPerpetratorConfigurable.gjv[15] = -1769383714;
        hv$AttackPerpetratorConfigurable.gjv[16] = 584330453;
        hv$AttackPerpetratorConfigurable.gjv[17] = -954453377;
        hv$AttackPerpetratorConfigurable.gjv[18] = -1125193068;
        hv$AttackPerpetratorConfigurable.gjv[19] = 1164997003;
        hv$AttackPerpetratorConfigurable.gjv[20] = -639350885;
        hv$AttackPerpetratorConfigurable.gjv[21] = -657683853;
        hv$AttackPerpetratorConfigurable.gjv[22] = -340667059;
        hv$AttackPerpetratorConfigurable.gjv[23] = 625240227;
        hv$AttackPerpetratorConfigurable.gjv[24] = -537776285;
        hv$AttackPerpetratorConfigurable.gjv[25] = -768178462;
        hv$AttackPerpetratorConfigurable.gjv[26] = -1471069596;
        hv$AttackPerpetratorConfigurable.gjv[27] = -550740031;
        hv$AttackPerpetratorConfigurable.gjv[28] = -365979457;
        hv$AttackPerpetratorConfigurable.gjv[29] = -2095623219;
        hv$AttackPerpetratorConfigurable.gjv[30] = 1605956323;
        hv$AttackPerpetratorConfigurable.gjv[31] = -60799502;
        hv$AttackPerpetratorConfigurable.gjv[32] = -1112670435;
        hv$AttackPerpetratorConfigurable.gjv[33] = -842365587;
        hv$AttackPerpetratorConfigurable.gjv[34] = 410455646;
        hv$AttackPerpetratorConfigurable.gjv[35] = 909538923;
        hv$AttackPerpetratorConfigurable.gjv[36] = 1693921838;
        hv$AttackPerpetratorConfigurable.gjv[37] = -1569683773;
        hv$AttackPerpetratorConfigurable.gjv[38] = -688816869;
        hv$AttackPerpetratorConfigurable.gjv[39] = 443487559;
        hv$AttackPerpetratorConfigurable.gjv[40] = 681656437;
        hv$AttackPerpetratorConfigurable.gjv[41] = 42909649;
        hv$AttackPerpetratorConfigurable.gjv[42] = 1834415028;
        hv$AttackPerpetratorConfigurable.gjv[43] = 1893237847;
        hv$AttackPerpetratorConfigurable.gjv[44] = -2047769787;
        hv$AttackPerpetratorConfigurable.gjv[45] = -175358459;
        hv$AttackPerpetratorConfigurable.gjv[46] = 606695601;
        hv$AttackPerpetratorConfigurable.gjv[47] = -974269556;
        hv$AttackPerpetratorConfigurable.gjv[48] = 1896373949;
        hv$AttackPerpetratorConfigurable.gjv[49] = 288942073;
        hv$AttackPerpetratorConfigurable.gjv[50] = 457991850;
        hv$AttackPerpetratorConfigurable.gjv[51] = -104098742;
        hv$AttackPerpetratorConfigurable.gjv[52] = -189067776;
        hv$AttackPerpetratorConfigurable.gjv[53] = 2034190125;
        hv$AttackPerpetratorConfigurable.gjv[54] = 1878263493;
        hv$AttackPerpetratorConfigurable.gjv[55] = 1444442721;
        hv$AttackPerpetratorConfigurable.gjv[56] = 1888995511;
        hv$AttackPerpetratorConfigurable.gjv[57] = 1479367025;
        hv$AttackPerpetratorConfigurable.gjv[58] = 691612141;
        hv$AttackPerpetratorConfigurable.gjv[59] = -1650963834;
        hv$AttackPerpetratorConfigurable.gjv[60] = 1075871969;
        hv$AttackPerpetratorConfigurable.gjv[61] = -672832193;
        hv$AttackPerpetratorConfigurable.gjv[62] = 1132002632;
        hv$AttackPerpetratorConfigurable.gjv[63] = -1026099726;
        hv$AttackPerpetratorConfigurable.gjv[64] = -801546765;
        hv$AttackPerpetratorConfigurable.gjv[65] = 1487571035;
        hv$AttackPerpetratorConfigurable.gjv[66] = -1858723713;
        hv$AttackPerpetratorConfigurable.gjv[67] = 1123322411;
        hv$AttackPerpetratorConfigurable.gjv[68] = 1594776892;
        hv$AttackPerpetratorConfigurable.gjv[69] = -535906421;
        hv$AttackPerpetratorConfigurable.gjv[70] = -1008955661;
        hv$AttackPerpetratorConfigurable.gjv[71] = 1311784856;
        hv$AttackPerpetratorConfigurable.gjv[72] = 1893508960;
        hv$AttackPerpetratorConfigurable.gjv[73] = 1396562844;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isShieldBreaker() {
        v0 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        block21: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 1161110364: {
                    break block21;
                }
                case 1928776926: {
                    v0 /* !! */  = (long)(hv$AttackPerpetratorConfigurable.gjw("goe", gki(int ), (int)50) - hv$AttackPerpetratorConfigurable.gjw("god", gki(int ), (int)49));
                    continue block21;
                }
            }
            break;
        }
        var3_1 = hv$AttackPerpetratorConfigurable.c;
        v1 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        if (true) ** GOTO lbl14
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - hv$AttackPerpetratorConfigurable.gjw("gof", gki(int ), (int)51));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1978085337: {
                    v2 = hv$AttackPerpetratorConfigurable.gjw("gog", gki(int ), (int)52);
                    continue block22;
                }
                case -1856363727: {
                    v2 = hv$AttackPerpetratorConfigurable.gjw("goh", gki(int ), (int)53);
                    continue block22;
                }
                case -1339883668: {
                    v2 = hv$AttackPerpetratorConfigurable.gjw("goi", gki(int ), (int)54);
                    continue block22;
                }
                case 1161110364: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = hv$AttackPerpetratorConfigurable.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("goj", gki(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gok", gjt(int ), (int)57)) {
                var1_3 = hv$AttackPerpetratorConfigurable.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gol", gjt(int ), (int)58);
        }
        if (var1_3 != false) return (boolean)hv$AttackPerpetratorConfigurable.gjw("gom", gjt(int ), (int)59);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block24: while (true) {
            block33: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return (boolean)hv$AttackPerpetratorConfigurable.gjw("gom", gjt(int ), (int)59);
                        v4 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
                        block25: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -972642174: {
                                    v5 = hv$AttackPerpetratorConfigurable.gjw("goo", gki(int ), (int)57);
                                    ** GOTO lbl54
                                }
                                case 1161110364: {
                                    return this.shieldBreaker;
                                }
                                case 1196924230: {
                                    v5 = hv$AttackPerpetratorConfigurable.gjw("gop", gki(int ), (int)58);
lbl54:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - hv$AttackPerpetratorConfigurable.gjw("gon", gki(int ), (int)56));
                                    continue block25;
                                }
                            }
                            break;
                        }
                        return this.shieldBreaker;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gos", gjt(int ), (int)62);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block33;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("got", gjt(int ), (int)63);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("goq", gjt(int ), (int)60);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl77
            }
            do {
                if (true) continue block24;
lbl77:
                // 2 sources

                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gor", gjt(int ), (int)61);
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
    public boolean isShouldUnPressShield() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gmw", gki(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gmx", gjt(int ), (int)39)) break;
            v0 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gmy", gjt(int ), (int)40);
        }
        var3_1 = hv$AttackPerpetratorConfigurable.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gmz", gki(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gna", gjt(int ), (int)41)) break;
            v1 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gnb", gjt(int ), (int)42);
        }
        var2_2 /* !! */  = hv$AttackPerpetratorConfigurable.b;
        v2 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - hv$AttackPerpetratorConfigurable.gjw("gnc", gki(int ), (int)36));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 254750166: {
                    v3 = hv$AttackPerpetratorConfigurable.gjw("gnd", gki(int ), (int)37);
                    continue block17;
                }
                case 351900890: {
                    v3 = hv$AttackPerpetratorConfigurable.gjw("gne", gki(int ), (int)38);
                    continue block17;
                }
                case 1161110364: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = hv$AttackPerpetratorConfigurable.a;
        if (var3_1) {
            throw null;
            return (boolean)hv$AttackPerpetratorConfigurable.gjw("gnf", gjt(int ), (int)43);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v4 /* !! */  = (long)(hv$AttackPerpetratorConfigurable.gjw("gnh", gki(int ), (int)40) - hv$AttackPerpetratorConfigurable.gjw("gng", gki(int ), (int)39));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2028987420: {
                            continue block19;
                        }
                        case 1161110364: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.shouldUnPressShield;
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gni", gjt(int ), (int)44);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gnj", gjt(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gnk", gjt(int ), (int)46);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gnl", gjt(int ), (int)47);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float glx(int n2) {
        return Float.intBitsToFloat(gju[n2] ^ gjv[n2]);
    }

    private static /* synthetic */ void gpo() {
        hv$AttackPerpetratorConfigurable.gkk[0] = 2670350718060593600L;
        hv$AttackPerpetratorConfigurable.gkk[1] = 1564389562101506579L;
        hv$AttackPerpetratorConfigurable.gkk[2] = -2273667855593135071L;
        hv$AttackPerpetratorConfigurable.gkk[3] = -5793867847176546944L;
        hv$AttackPerpetratorConfigurable.gkk[4] = 9132082412548441934L;
        hv$AttackPerpetratorConfigurable.gkk[5] = 6221802101333405223L;
        hv$AttackPerpetratorConfigurable.gkk[6] = 8461179725306891580L;
        hv$AttackPerpetratorConfigurable.gkk[7] = 2081244664390484092L;
        hv$AttackPerpetratorConfigurable.gkk[8] = -8616517170494783305L;
        hv$AttackPerpetratorConfigurable.gkk[9] = -7658121322503186460L;
        hv$AttackPerpetratorConfigurable.gkk[10] = 6886914688246617139L;
        hv$AttackPerpetratorConfigurable.gkk[11] = 4550825260944441695L;
        hv$AttackPerpetratorConfigurable.gkk[12] = 6205194364015053153L;
        hv$AttackPerpetratorConfigurable.gkk[13] = -357190791464825173L;
        hv$AttackPerpetratorConfigurable.gkk[14] = -2107985242332439145L;
        hv$AttackPerpetratorConfigurable.gkk[15] = 7969816796900463206L;
        hv$AttackPerpetratorConfigurable.gkk[16] = 287777847270289312L;
        hv$AttackPerpetratorConfigurable.gkk[17] = 4821805948841341840L;
        hv$AttackPerpetratorConfigurable.gkk[18] = -152573842213733091L;
        hv$AttackPerpetratorConfigurable.gkk[19] = 8386081816351826460L;
        hv$AttackPerpetratorConfigurable.gkk[20] = 6297321703706189526L;
        hv$AttackPerpetratorConfigurable.gkk[21] = 267871770890154033L;
        hv$AttackPerpetratorConfigurable.gkk[22] = 5002698676969643358L;
        hv$AttackPerpetratorConfigurable.gkk[23] = 5763495447092539817L;
        hv$AttackPerpetratorConfigurable.gkk[24] = 9202255592985236984L;
        hv$AttackPerpetratorConfigurable.gkk[25] = 7200752504381928117L;
        hv$AttackPerpetratorConfigurable.gkk[26] = -5065220474388385600L;
        hv$AttackPerpetratorConfigurable.gkk[27] = 4402388080669180885L;
        hv$AttackPerpetratorConfigurable.gkk[28] = -4244200229192849529L;
        hv$AttackPerpetratorConfigurable.gkk[29] = 9204791725263551466L;
        hv$AttackPerpetratorConfigurable.gkk[30] = -487591645613153743L;
        hv$AttackPerpetratorConfigurable.gkk[31] = 8891837165169624610L;
        hv$AttackPerpetratorConfigurable.gkk[32] = -1212007357887185840L;
        hv$AttackPerpetratorConfigurable.gkk[33] = 7404717490613787594L;
        hv$AttackPerpetratorConfigurable.gkk[34] = 7966402959200706543L;
        hv$AttackPerpetratorConfigurable.gkk[35] = 5058635684262685L;
        hv$AttackPerpetratorConfigurable.gkk[36] = 7326038113540437431L;
        hv$AttackPerpetratorConfigurable.gkk[37] = 615338583603507124L;
        hv$AttackPerpetratorConfigurable.gkk[38] = 8462973880490702680L;
        hv$AttackPerpetratorConfigurable.gkk[39] = 3436704011742415752L;
        hv$AttackPerpetratorConfigurable.gkk[40] = -9033125086166956538L;
        hv$AttackPerpetratorConfigurable.gkk[41] = -4795024409226943642L;
        hv$AttackPerpetratorConfigurable.gkk[42] = -7431373257151766303L;
        hv$AttackPerpetratorConfigurable.gkk[43] = -2178718129025693795L;
        hv$AttackPerpetratorConfigurable.gkk[44] = -5429813796931878916L;
        hv$AttackPerpetratorConfigurable.gkk[45] = 8726968203471436645L;
        hv$AttackPerpetratorConfigurable.gkk[46] = 7615889763172868574L;
        hv$AttackPerpetratorConfigurable.gkk[47] = 4419710447896659463L;
        hv$AttackPerpetratorConfigurable.gkk[48] = -4266992732059046772L;
        hv$AttackPerpetratorConfigurable.gkk[49] = -2169486451326715262L;
        hv$AttackPerpetratorConfigurable.gkk[50] = -8380798824301546998L;
        hv$AttackPerpetratorConfigurable.gkk[51] = -3060653760321601250L;
        hv$AttackPerpetratorConfigurable.gkk[52] = 5192958851869650785L;
        hv$AttackPerpetratorConfigurable.gkk[53] = -7342350203044758883L;
        hv$AttackPerpetratorConfigurable.gkk[54] = 1363432375935303380L;
        hv$AttackPerpetratorConfigurable.gkk[55] = -7638875183427974708L;
        hv$AttackPerpetratorConfigurable.gkk[56] = 3294328866719852340L;
        hv$AttackPerpetratorConfigurable.gkk[57] = 2738154152417463754L;
        hv$AttackPerpetratorConfigurable.gkk[58] = -3374283574388934220L;
        hv$AttackPerpetratorConfigurable.gkk[59] = 2917010380949126837L;
        hv$AttackPerpetratorConfigurable.gkk[60] = -4304145431323502516L;
        hv$AttackPerpetratorConfigurable.gkk[61] = -2250275252534892962L;
        hv$AttackPerpetratorConfigurable.gkk[62] = 5409228953987444262L;
        hv$AttackPerpetratorConfigurable.gkk[63] = 2254574620793722175L;
        hv$AttackPerpetratorConfigurable.gkk[64] = 233043081765736285L;
        hv$AttackPerpetratorConfigurable.gkk[65] = 3167976483282226743L;
    }

    static {
        gju = new int[74];
        gjv = new int[74];
        hv$AttackPerpetratorConfigurable.gpl();
        hv$AttackPerpetratorConfigurable.gpm();
        gkj = new long[66];
        gkk = new long[66];
        hv$AttackPerpetratorConfigurable.gpn();
        hv$AttackPerpetratorConfigurable.gpo();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getMaximumRange() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("glp", gki(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("glq", gjt(int ), (int)23)) break;
            v0 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("glr", gjt(int ), (int)24);
        }
        var3_1 = hv$AttackPerpetratorConfigurable.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gls", gki(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("glt", gjt(int ), (int)25)) break;
            v1 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("glu", gjt(int ), (int)26);
        }
        var2_2 /* !! */  = hv$AttackPerpetratorConfigurable.b;
        v2 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(hv$AttackPerpetratorConfigurable.gjw("glw", gki(int ), (int)21) - hv$AttackPerpetratorConfigurable.gjw("glv", gki(int ), (int)20));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1161110364: {
                    break block12;
                }
                case 1975565353: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = hv$AttackPerpetratorConfigurable.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (float)hv$AttackPerpetratorConfigurable.gjw("gly", glx(int ), (int)27);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("glz", gki(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gma", gjt(int ), (int)28)) break;
                    v3 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gmb", gjt(int ), (int)29);
                }
                return this.maximumRange;
            }
            case 0: {
                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gmc", gjt(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl51
            }
lbl46:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gmd", gjt(int ), (int)31);
                } while (!var3_1);
                throw null;
            }
lbl51:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gme", gjt(int ), (int)32);
                    if (!var3_1) ** GOTO lbl46
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gmf", gjt(int ), (int)33);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gpl() {
        hv$AttackPerpetratorConfigurable.gju[0] = 317226918;
        hv$AttackPerpetratorConfigurable.gju[1] = -860986361;
        hv$AttackPerpetratorConfigurable.gju[2] = -1479247795;
        hv$AttackPerpetratorConfigurable.gju[3] = -309869032;
        hv$AttackPerpetratorConfigurable.gju[4] = 1142712475;
        hv$AttackPerpetratorConfigurable.gju[5] = -2042090463;
        hv$AttackPerpetratorConfigurable.gju[6] = -1458183703;
        hv$AttackPerpetratorConfigurable.gju[7] = 1743103343;
        hv$AttackPerpetratorConfigurable.gju[8] = -1336371849;
        hv$AttackPerpetratorConfigurable.gju[9] = 951164016;
        hv$AttackPerpetratorConfigurable.gju[10] = -951194947;
        hv$AttackPerpetratorConfigurable.gju[11] = 2107013685;
        hv$AttackPerpetratorConfigurable.gju[12] = 353192136;
        hv$AttackPerpetratorConfigurable.gju[13] = 94279359;
        hv$AttackPerpetratorConfigurable.gju[14] = -1581690769;
        hv$AttackPerpetratorConfigurable.gju[15] = -1769383716;
        hv$AttackPerpetratorConfigurable.gju[16] = 584330453;
        hv$AttackPerpetratorConfigurable.gju[17] = 954453376;
        hv$AttackPerpetratorConfigurable.gju[18] = -1778539898;
        hv$AttackPerpetratorConfigurable.gju[19] = 1164997000;
        hv$AttackPerpetratorConfigurable.gju[20] = -639350886;
        hv$AttackPerpetratorConfigurable.gju[21] = -657683853;
        hv$AttackPerpetratorConfigurable.gju[22] = -340667059;
        hv$AttackPerpetratorConfigurable.gju[23] = -625240228;
        hv$AttackPerpetratorConfigurable.gju[24] = -1849814034;
        hv$AttackPerpetratorConfigurable.gju[25] = 768178461;
        hv$AttackPerpetratorConfigurable.gju[26] = 21766616;
        hv$AttackPerpetratorConfigurable.gju[27] = -534936552;
        hv$AttackPerpetratorConfigurable.gju[28] = -365979458;
        hv$AttackPerpetratorConfigurable.gju[29] = -1764085638;
        hv$AttackPerpetratorConfigurable.gju[30] = 1605956323;
        hv$AttackPerpetratorConfigurable.gju[31] = -60799501;
        hv$AttackPerpetratorConfigurable.gju[32] = -1112670434;
        hv$AttackPerpetratorConfigurable.gju[33] = -842365585;
        hv$AttackPerpetratorConfigurable.gju[34] = 410455646;
        hv$AttackPerpetratorConfigurable.gju[35] = 909538921;
        hv$AttackPerpetratorConfigurable.gju[36] = 1693921836;
        hv$AttackPerpetratorConfigurable.gju[37] = -1569683773;
        hv$AttackPerpetratorConfigurable.gju[38] = -688816870;
        hv$AttackPerpetratorConfigurable.gju[39] = -443487560;
        hv$AttackPerpetratorConfigurable.gju[40] = 1776710129;
        hv$AttackPerpetratorConfigurable.gju[41] = -42909650;
        hv$AttackPerpetratorConfigurable.gju[42] = 807264446;
        hv$AttackPerpetratorConfigurable.gju[43] = 1893237847;
        hv$AttackPerpetratorConfigurable.gju[44] = -2047769788;
        hv$AttackPerpetratorConfigurable.gju[45] = -175358460;
        hv$AttackPerpetratorConfigurable.gju[46] = 606695603;
        hv$AttackPerpetratorConfigurable.gju[47] = -974269553;
        hv$AttackPerpetratorConfigurable.gju[48] = -1896373950;
        hv$AttackPerpetratorConfigurable.gju[49] = -1177998396;
        hv$AttackPerpetratorConfigurable.gju[50] = 457991850;
        hv$AttackPerpetratorConfigurable.gju[51] = -104098741;
        hv$AttackPerpetratorConfigurable.gju[52] = 1654550558;
        hv$AttackPerpetratorConfigurable.gju[53] = 2034190127;
        hv$AttackPerpetratorConfigurable.gju[54] = 1878263494;
        hv$AttackPerpetratorConfigurable.gju[55] = 1444442722;
        hv$AttackPerpetratorConfigurable.gju[56] = 1888995510;
        hv$AttackPerpetratorConfigurable.gju[57] = -1479367026;
        hv$AttackPerpetratorConfigurable.gju[58] = 1922078122;
        hv$AttackPerpetratorConfigurable.gju[59] = -1650963834;
        hv$AttackPerpetratorConfigurable.gju[60] = 1075871968;
        hv$AttackPerpetratorConfigurable.gju[61] = -672832193;
        hv$AttackPerpetratorConfigurable.gju[62] = 1132002634;
        hv$AttackPerpetratorConfigurable.gju[63] = -1026099725;
        hv$AttackPerpetratorConfigurable.gju[64] = 801546764;
        hv$AttackPerpetratorConfigurable.gju[65] = -1655067131;
        hv$AttackPerpetratorConfigurable.gju[66] = 1858723712;
        hv$AttackPerpetratorConfigurable.gju[67] = 276733563;
        hv$AttackPerpetratorConfigurable.gju[68] = -1594776893;
        hv$AttackPerpetratorConfigurable.gju[69] = 1584979094;
        hv$AttackPerpetratorConfigurable.gju[70] = -1008955663;
        hv$AttackPerpetratorConfigurable.gju[71] = 1311784859;
        hv$AttackPerpetratorConfigurable.gju[72] = 1893508962;
        hv$AttackPerpetratorConfigurable.gju[73] = 1396562847;
    }

    private static /* synthetic */ void gpn() {
        hv$AttackPerpetratorConfigurable.gkj[0] = -4928689596096886343L;
        hv$AttackPerpetratorConfigurable.gkj[1] = -8389611102522078296L;
        hv$AttackPerpetratorConfigurable.gkj[2] = 4528624044265677290L;
        hv$AttackPerpetratorConfigurable.gkj[3] = -6702625482889852277L;
        hv$AttackPerpetratorConfigurable.gkj[4] = -7012756850643762116L;
        hv$AttackPerpetratorConfigurable.gkj[5] = 6595803919173033449L;
        hv$AttackPerpetratorConfigurable.gkj[6] = -7677086183415264439L;
        hv$AttackPerpetratorConfigurable.gkj[7] = -2302706660281669506L;
        hv$AttackPerpetratorConfigurable.gkj[8] = 6620512368684635430L;
        hv$AttackPerpetratorConfigurable.gkj[9] = 8117521906064792298L;
        hv$AttackPerpetratorConfigurable.gkj[10] = 3076738747123048739L;
        hv$AttackPerpetratorConfigurable.gkj[11] = -4478973306779212326L;
        hv$AttackPerpetratorConfigurable.gkj[12] = 7903790858883941529L;
        hv$AttackPerpetratorConfigurable.gkj[13] = 4855492688509556263L;
        hv$AttackPerpetratorConfigurable.gkj[14] = 7306322658166232848L;
        hv$AttackPerpetratorConfigurable.gkj[15] = 992902090113559056L;
        hv$AttackPerpetratorConfigurable.gkj[16] = 5977423950311449305L;
        hv$AttackPerpetratorConfigurable.gkj[17] = 6017677235439493229L;
        hv$AttackPerpetratorConfigurable.gkj[18] = 774623442080504251L;
        hv$AttackPerpetratorConfigurable.gkj[19] = -8983739643425626924L;
        hv$AttackPerpetratorConfigurable.gkj[20] = -9023768639816514912L;
        hv$AttackPerpetratorConfigurable.gkj[21] = -7822951928931000775L;
        hv$AttackPerpetratorConfigurable.gkj[22] = -3648971669243530596L;
        hv$AttackPerpetratorConfigurable.gkj[23] = 1193037454439971007L;
        hv$AttackPerpetratorConfigurable.gkj[24] = 4472599774585804756L;
        hv$AttackPerpetratorConfigurable.gkj[25] = -3292970155977713843L;
        hv$AttackPerpetratorConfigurable.gkj[26] = -8860326653248015472L;
        hv$AttackPerpetratorConfigurable.gkj[27] = -1046414251283586574L;
        hv$AttackPerpetratorConfigurable.gkj[28] = 7564969129810629858L;
        hv$AttackPerpetratorConfigurable.gkj[29] = -7826629612196977524L;
        hv$AttackPerpetratorConfigurable.gkj[30] = -7560627753073515183L;
        hv$AttackPerpetratorConfigurable.gkj[31] = 3152579761598514991L;
        hv$AttackPerpetratorConfigurable.gkj[32] = -1380695292003244727L;
        hv$AttackPerpetratorConfigurable.gkj[33] = -7074762320031891821L;
        hv$AttackPerpetratorConfigurable.gkj[34] = 5959978866796262616L;
        hv$AttackPerpetratorConfigurable.gkj[35] = 9155228931122532068L;
        hv$AttackPerpetratorConfigurable.gkj[36] = -2976356669701999117L;
        hv$AttackPerpetratorConfigurable.gkj[37] = -9192535078092015755L;
        hv$AttackPerpetratorConfigurable.gkj[38] = 3667614420010561647L;
        hv$AttackPerpetratorConfigurable.gkj[39] = 6841910795017231386L;
        hv$AttackPerpetratorConfigurable.gkj[40] = -8174246948452796893L;
        hv$AttackPerpetratorConfigurable.gkj[41] = -1769512348852683881L;
        hv$AttackPerpetratorConfigurable.gkj[42] = -4903073059685927500L;
        hv$AttackPerpetratorConfigurable.gkj[43] = 5620735090867581843L;
        hv$AttackPerpetratorConfigurable.gkj[44] = 1644794009266086666L;
        hv$AttackPerpetratorConfigurable.gkj[45] = 6226027609145453951L;
        hv$AttackPerpetratorConfigurable.gkj[46] = -7612007134424602897L;
        hv$AttackPerpetratorConfigurable.gkj[47] = -3110784927232444000L;
        hv$AttackPerpetratorConfigurable.gkj[48] = 5502257545647637206L;
        hv$AttackPerpetratorConfigurable.gkj[49] = -3662994212884262694L;
        hv$AttackPerpetratorConfigurable.gkj[50] = -1480974392394454232L;
        hv$AttackPerpetratorConfigurable.gkj[51] = 1387527598340864546L;
        hv$AttackPerpetratorConfigurable.gkj[52] = -652621917339877215L;
        hv$AttackPerpetratorConfigurable.gkj[53] = 5153450489035783210L;
        hv$AttackPerpetratorConfigurable.gkj[54] = 9018323534366933083L;
        hv$AttackPerpetratorConfigurable.gkj[55] = 6401047713609139853L;
        hv$AttackPerpetratorConfigurable.gkj[56] = -2600609559243328975L;
        hv$AttackPerpetratorConfigurable.gkj[57] = 5150016594949165397L;
        hv$AttackPerpetratorConfigurable.gkj[58] = 7767725203707711176L;
        hv$AttackPerpetratorConfigurable.gkj[59] = 1131873924469907178L;
        hv$AttackPerpetratorConfigurable.gkj[60] = 5245902708625869312L;
        hv$AttackPerpetratorConfigurable.gkj[61] = -3967922184778715265L;
        hv$AttackPerpetratorConfigurable.gkj[62] = -8704374427076793481L;
        hv$AttackPerpetratorConfigurable.gkj[63] = -4662750685773279964L;
        hv$AttackPerpetratorConfigurable.gkj[64] = 7765879443849962639L;
        hv$AttackPerpetratorConfigurable.gkj[65] = -81212002324868137L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public hv$AttackPerpetratorConfigurable(class_1309 var1_1, ov var2_2, float var3_3, List<String> var4_4, class_238 var5_5, boolean var6_6) {
        var8_7 /* !! */  = hv$AttackPerpetratorConfigurable.b;
        super();
        this.target = var1_1;
        this.angle = var2_2;
        this.maximumRange = var3_3;
        this.onlyCritical = var6_6;
        this.shouldUnPressShield = var4_4.contains("\u041e\u0442\u0436\u0438\u043c\u0430\u0442\u044c \u0449\u0438\u0442");
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block13: while (true) {
            block15: {
                switch (cfr_temp_0 == -2147483648 ? var8_7 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.eatAndAttack = var4_4.contains("\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438");
                        this.shieldBreaker = var4_4.contains("\u041b\u043e\u043c\u0430\u0442\u044c \u0449\u0438\u0442");
                        this.box = var5_5;
                        return;
                    }
                    case 3: {
                        ** GOTO lbl31
                    }
                    case 5: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkc", gjt(int ), (int)5);
                    }
                    case 1: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gjy", gjt(int ), (int)1);
                    }
                    case 6: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkd", gjt(int ), (int)6);
                        ** GOTO lbl-1000
                    }
                    case 7: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gke", gjt(int ), (int)7);
                        ** GOTO lbl-1000
                    }
                    case 10: lbl-1000:
                    // 3 sources

                    {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkh", gjt(int ), (int)10);
lbl31:
                        // 2 sources

                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gka", gjt(int ), (int)3);
                    }
                    case 4: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkb", gjt(int ), (int)4);
                    }
                    case 2: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gjz", gjt(int ), (int)2);
                        cfr_temp_0 = 8;
                        break block15;
                    }
                    case 0: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gjx", gjt(int ), (int)0);
                    }
                    case 9: {
                        var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkg", gjt(int ), (int)9);
                    }
                    case 8: 
                }
                ** GOTO lbl47
            }
            while (true) {
                if (true) continue block13;
lbl47:
                // 2 sources

                var8_7 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkf", gjt(int ), (int)8);
                cfr_temp_0 = 0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_238 getBox() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gou", gki(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gov", gjt(int ), (int)64)) break;
            v0 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gow", gjt(int ), (int)65);
        }
        var3_1 = hv$AttackPerpetratorConfigurable.c;
        v1 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - hv$AttackPerpetratorConfigurable.gjw("gox", gki(int ), (int)60));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -930497373: {
                    v2 = hv$AttackPerpetratorConfigurable.gjw("goy", gki(int ), (int)61);
                    continue block13;
                }
                case -529248210: {
                    v2 = hv$AttackPerpetratorConfigurable.gjw("goz", gki(int ), (int)62);
                    continue block13;
                }
                case 1009353798: {
                    v2 = hv$AttackPerpetratorConfigurable.gjw("gpa", gki(int ), (int)63);
                    continue block13;
                }
                case 1161110364: {
                    break block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = hv$AttackPerpetratorConfigurable.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gpb", gki(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gpc", gjt(int ), (int)66)) break;
                    v3 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gpd", gjt(int ), (int)67);
                }
                var1_3 = hv$AttackPerpetratorConfigurable.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gpe", gki(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gpf", gjt(int ), (int)68)) break;
                    v4 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gpg", gjt(int ), (int)69);
                }
                return this.box;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gph", gjt(int ), (int)70);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gpi", gjt(int ), (int)71);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gpj", gjt(int ), (int)72);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gpk", gjt(int ), (int)73);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int gjt(int n2) {
        return gju[n2] ^ gjv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isEatAndAttack() {
        v0 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - hv$AttackPerpetratorConfigurable.gjw("gnm", gki(int ), (int)41));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 247691022: {
                    v1 = hv$AttackPerpetratorConfigurable.gjw("gnn", gki(int ), (int)42);
                    continue block16;
                }
                case 1161110364: {
                    break block16;
                }
                case 1809091346: {
                    v1 = hv$AttackPerpetratorConfigurable.gjw("gno", gki(int ), (int)43);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = hv$AttackPerpetratorConfigurable.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gnp", gki(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gnq", gjt(int ), (int)48)) break;
            v2 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gnr", gjt(int ), (int)49);
        }
        var2_2 /* !! */  = hv$AttackPerpetratorConfigurable.b;
        v3 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - hv$AttackPerpetratorConfigurable.gjw("gns", gki(int ), (int)45));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1366990853: {
                    v4 = hv$AttackPerpetratorConfigurable.gjw("gnt", gki(int ), (int)46);
                    continue block18;
                }
                case 1161110364: {
                    break block18;
                }
                case 1845434735: {
                    v4 = hv$AttackPerpetratorConfigurable.gjw("gnu", gki(int ), (int)47);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = hv$AttackPerpetratorConfigurable.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (boolean)hv$AttackPerpetratorConfigurable.gjw("gnv", gjt(int ), (int)50);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gnw", gki(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gnx", gjt(int ), (int)51)) break;
                    v5 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gny", gjt(int ), (int)52);
                }
                return this.eatAndAttack;
            }
            case 0: {
                var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gnz", gjt(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("goa", gjt(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
lbl62:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gob", gjt(int ), (int)55);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("goc", gjt(int ), (int)56);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long gki(int n2) {
        return gkj[n2] ^ gkk[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public ov getAngle() {
        Object object = ac;
        block12: while (true) {
            switch ((int)object) {
                case -436671901: {
                    object = hv$AttackPerpetratorConfigurable.gjw("gld", gki(int ), (int)12) - hv$AttackPerpetratorConfigurable.gjw("glc", gki(int ), (int)11);
                    continue block12;
                }
                case 1161110364: {
                    break block12;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ac - hv$AttackPerpetratorConfigurable.gjw("gle", gki(int ), (int)13)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hv$AttackPerpetratorConfigurable.gjw("glf", gjt(int ), (int)17)) break;
            object2 = hv$AttackPerpetratorConfigurable.gjw("glg", gjt(int ), (int)18);
        }
        int n2 = b;
        Object object3 = ac;
        block14: while (true) {
            switch ((int)object3) {
                case 262519371: {
                    object3 = hv$AttackPerpetratorConfigurable.gjw("gli", gki(int ), (int)15) - hv$AttackPerpetratorConfigurable.gjw("glh", gki(int ), (int)14);
                    continue block14;
                }
                case 1161110364: {
                    break block14;
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
        Object object4 = ac;
        block15: while (true) {
            switch ((int)object4) {
                case -2124098519: {
                    object4 = hv$AttackPerpetratorConfigurable.gjw("glk", gki(int ), (int)17) - hv$AttackPerpetratorConfigurable.gjw("glj", gki(int ), (int)16);
                    continue block15;
                }
                case 1161110364: {
                    return this.angle;
                }
            }
            break;
        }
        return this.angle;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_1309 getTarget() {
        block33: {
            v0 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
            block22: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case 369892776: {
                        v0 /* !! */  = (long)(hv$AttackPerpetratorConfigurable.gjw("gkm", gki(int ), (int)1) - hv$AttackPerpetratorConfigurable.gjw("gkl", gki(int ), (int)0));
                        continue block22;
                    }
                    case 1161110364: {
                        break block22;
                    }
                }
                break;
            }
            var3_1 = hv$AttackPerpetratorConfigurable.c;
            v1 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
            if (true) ** GOTO lbl14
            block23: while (true) {
                v1 /* !! */  = (long)(v2 - hv$AttackPerpetratorConfigurable.gjw("gkn", gki(int ), (int)2));
lbl14:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1161110364: {
                        break block23;
                    }
                    case 1180777558: {
                        v2 = hv$AttackPerpetratorConfigurable.gjw("gko", gki(int ), (int)3);
                        continue block23;
                    }
                    case 1411438527: {
                        v2 = hv$AttackPerpetratorConfigurable.gjw("gkp", gki(int ), (int)4);
                        continue block23;
                    }
                    case 1717956481: {
                        v2 = hv$AttackPerpetratorConfigurable.gjw("gkq", gki(int ), (int)5);
                        continue block23;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hv$AttackPerpetratorConfigurable.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = hv$AttackPerpetratorConfigurable.ac - hv$AttackPerpetratorConfigurable.gjw("gkr", gki(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == hv$AttackPerpetratorConfigurable.gjw("gks", gjt(int ), (int)11)) {
                    var1_3 = hv$AttackPerpetratorConfigurable.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)hv$AttackPerpetratorConfigurable.gjw("gkt", gjt(int ), (int)12);
            }
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block25: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v4 /* !! */  = hv$AttackPerpetratorConfigurable.ac;
                        block26: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case 476798533: {
                                    v5 = hv$AttackPerpetratorConfigurable.gjw("gkv", gki(int ), (int)8);
                                    ** GOTO lbl57
                                }
                                case 995237436: {
                                    v5 = hv$AttackPerpetratorConfigurable.gjw("gkw", gki(int ), (int)9);
                                    ** GOTO lbl57
                                }
                                case 1161110364: {
                                    return this.target;
                                }
                                case 1263005745: {
                                    v5 = hv$AttackPerpetratorConfigurable.gjw("gkx", gki(int ), (int)10);
lbl57:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - hv$AttackPerpetratorConfigurable.gjw("gku", gki(int ), (int)7));
                                    continue block26;
                                }
                            }
                            break;
                        }
                        return this.target;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gky", gjt(int ), (int)13);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block33;
                    }
lbl68:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gkz", gjt(int ), (int)14);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block25;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("gla", gjt(int ), (int)15);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)hv$AttackPerpetratorConfigurable.gjw("glb", gjt(int ), (int)16);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite gjw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

