/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import ruhack.phobia.hx;
import ruhack.phobia.hy;
import ruhack.phobia.ou;
import ruhack.phobia.ov;

public class os {
    public static final boolean a;
    public static os DEFAULT;
    private final hx angleSmooth;
    private static int[] knbc;
    public static boolean clickSpam;
    private final int resetThreshold = 1;
    public static final boolean c;
    public final boolean moveCorrection;
    private static int[] knbb;
    private static long[] knby;
    private static final long sr = -8862730702055957682L;
    private static long[] knbx;
    public static boolean freeCorrection;
    public static final int b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public os(boolean var1_1, boolean var2_2, boolean var3_3) {
        var5_4 /* !! */  = os.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this(new hy(), var1_1, var2_2, var3_3);
                return;
            }
            case 0: {
                ** GOTO lbl11
            }
            case 2: {
                var5_4 /* !! */  = (int)os.knbd("knbg", knba(int ), (int)2);
lbl11:
                // 2 sources

                var5_4 /* !! */  = (int)os.knbd("knbe", knba(int ), (int)0);
            }
            case 1: 
        }
        while (true) {
            var5_4 /* !! */  = (int)os.knbd("knbf", knba(int ), (int)1);
        }
    }

    private static /* synthetic */ void knec() {
        os.knbb[0] = -1982325580;
        os.knbb[1] = -1912872035;
        os.knbb[2] = 823458601;
        os.knbb[3] = 44101744;
        os.knbb[4] = -1988442871;
        os.knbb[5] = 30169196;
        os.knbb[6] = 2105629836;
        os.knbb[7] = -1219396624;
        os.knbb[8] = -1479342085;
        os.knbb[9] = -1050477773;
        os.knbb[10] = -1243548014;
        os.knbb[11] = -659511533;
        os.knbb[12] = -1410628067;
        os.knbb[13] = 1469284802;
        os.knbb[14] = -1763112415;
        os.knbb[15] = -1392744912;
        os.knbb[16] = -1566325177;
        os.knbb[17] = -1239659747;
        os.knbb[18] = -1034688928;
        os.knbb[19] = 755136929;
        os.knbb[20] = -681497309;
        os.knbb[21] = -646369419;
        os.knbb[22] = -1388083084;
        os.knbb[23] = 1974209941;
        os.knbb[24] = -161918334;
        os.knbb[25] = 106609090;
        os.knbb[26] = -618016813;
        os.knbb[27] = -548628073;
        os.knbb[28] = -705149876;
        os.knbb[29] = 1324304794;
        os.knbb[30] = 1439936512;
        os.knbb[31] = -571026159;
        os.knbb[32] = 1253543088;
        os.knbb[33] = 1440977868;
        os.knbb[34] = -1970870894;
        os.knbb[35] = 1443399478;
        os.knbb[36] = 946411761;
        os.knbb[37] = 489003094;
        os.knbb[38] = 1012655147;
        os.knbb[39] = 1761816321;
        os.knbb[40] = -1058075441;
        os.knbb[41] = -898665007;
        os.knbb[42] = 750801615;
        os.knbb[43] = 2087714947;
    }

    private static /* synthetic */ void knee() {
        os.knbx[0] = -7321917407288821502L;
        os.knbx[1] = -6941029474800967518L;
        os.knbx[2] = 6731536640531064791L;
        os.knbx[3] = -321933243369446132L;
        os.knbx[4] = 5755127758412655658L;
        os.knbx[5] = 4469311370347562106L;
        os.knbx[6] = 454920015144504526L;
        os.knbx[7] = -5453886685162030906L;
        os.knbx[8] = 1848974838651610435L;
        os.knbx[9] = -4738107678590258382L;
        os.knbx[10] = -8320035775404087926L;
        os.knbx[11] = -4903566512094361221L;
        os.knbx[12] = -3854169418368246330L;
        os.knbx[13] = 1177421796179767806L;
        os.knbx[14] = 5064142742556455904L;
        os.knbx[15] = -8968559977671899364L;
        os.knbx[16] = -4327402139510173009L;
        os.knbx[17] = 8543533197775060716L;
        os.knbx[18] = 1303706649308792378L;
        os.knbx[19] = -3839825127381422271L;
        os.knbx[20] = 6489766590108976405L;
        os.knbx[21] = -7199567663583068896L;
        os.knbx[22] = 2105030350565291705L;
        os.knbx[23] = 6111298345573532340L;
        os.knbx[24] = -1998903016042623080L;
        os.knbx[25] = -4382350835267889522L;
        os.knbx[26] = -2972368403800374977L;
        os.knbx[27] = -6293405098466746715L;
        os.knbx[28] = 4233027432466357644L;
    }

    static {
        knbb = new int[44];
        knbc = new int[44];
        os.knec();
        os.kned();
        knbx = new long[29];
        knby = new long[29];
        os.knee();
        os.knef();
        DEFAULT = new os(new hy(), (boolean)os.knbd("kndz", knba(int ), (int)41), (boolean)os.knbd("knea", knba(int ), (int)42), (boolean)os.knbd("kneb", knba(int ), (int)43));
    }

    private static /* synthetic */ int knba(int n2) {
        return knbb[n2] ^ knbc[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ou createRotationPlan(ov ov2, class_243 class_2432, class_1297 class_12972, boolean bl2, boolean bl3) {
        Object object = sr;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - os.knbd("kndb", knbw(int ), (int)16);
            }
            switch ((int)object) {
                case -1353760839: {
                    callSite = os.knbd("kndc", knbw(int ), (int)17);
                    continue block16;
                }
                case 469867342: {
                    break block16;
                }
                case 608947222: {
                    callSite = os.knbd("kndd", knbw(int ), (int)18);
                    continue block16;
                }
                case 1904559943: {
                    callSite = os.knbd("knde", knbw(int ), (int)19);
                    continue block16;
                }
            }
            break;
        }
        boolean bl5 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = sr - os.knbd("kndf", knbw(int ), (int)20)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == os.knbd("kndg", knba(int ), (int)30)) break;
            object2 = os.knbd("kndh", knba(int ), (int)31);
        }
        int n2 = b;
        Object object3 = sr;
        block18: while (true) {
            switch ((int)object3) {
                case 469867342: {
                    break block18;
                }
                case 1950958774: {
                    object3 = os.knbd("kndj", knbw(int ), (int)22) - os.knbd("kndi", knbw(int ), (int)21);
                    continue block18;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl5) {
            throw null;
        }
        if (bl6) return null;
        if (bl6) return null;
        Object object4 = sr;
        boolean bl7 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object4 = callSite - os.knbd("kndk", knbw(int ), (int)23);
            }
            switch ((int)object4) {
                case -687890796: {
                    callSite = os.knbd("kndl", knbw(int ), (int)24);
                    continue block19;
                }
                case -567035143: {
                    callSite = os.knbd("kndm", knbw(int ), (int)25);
                    continue block19;
                }
                case -493465796: {
                    callSite = os.knbd("kndn", knbw(int ), (int)26);
                    continue block19;
                }
                case 469867342: {
                    break block19;
                }
            }
            break;
        }
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = sr - os.knbd("kndo", knbw(int ), (int)27)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object5 == os.knbd("kndp", knba(int ), (int)32)) break;
            object5 = os.knbd("kndq", knba(int ), (int)33);
        }
        CallSite callSite = os.knbd("kndr", knba(int ), (int)34);
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = sr - os.knbd("knds", knbw(int ), (int)28)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object6 == os.knbd("kndt", knba(int ), (int)35)) {
                return new ou(ov2, class_2432, class_12972, this.angleSmooth, (int)callSite, 1.0f, bl2, bl3);
            }
            object6 = os.knbd("kndu", knba(int ), (int)36);
        }
    }

    public static /* synthetic */ CallSite knbd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public os(hx var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        var6_5 /* !! */  = os.b;
        super();
        this.resetThreshold = (int)os.knbd("knbm", knba(int ), (int)8);
        this.angleSmooth = var1_1;
        this.moveCorrection = var2_2;
        if (var6_5 /* !! */  == 0) ** GOTO lbl10
        switch (var6_5 /* !! */ ) {
            default: {
lbl10:
                // 2 sources

                os.freeCorrection = var3_3;
                os.clickSpam = var4_4;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)os.knbd("knbn", knba(int ), (int)9);
                ** GOTO lbl26
            }
            case 1: {
                var6_5 /* !! */  = (int)os.knbd("knbo", knba(int ), (int)10);
                ** GOTO lbl35
            }
lbl20:
            // 2 sources

            case 2: {
                var6_5 /* !! */  = (int)os.knbd("knbp", knba(int ), (int)11);
                ** GOTO lbl31
            }
            case 3: {
                var6_5 /* !! */  = (int)os.knbd("knbq", knba(int ), (int)12);
                ** GOTO lbl31
            }
lbl26:
            // 3 sources

            case 4: {
                var6_5 /* !! */  = (int)os.knbd("knbr", knba(int ), (int)13);
            }
            case 5: {
                var6_5 /* !! */  = (int)os.knbd("knbs", knba(int ), (int)14);
                ** GOTO lbl20
            }
lbl31:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)os.knbd("knbt", knba(int ), (int)15);
                    ** GOTO lbl26
                    break;
                }
            }
lbl35:
            // 2 sources

            case 7: {
                while (true) {
                    var6_5 /* !! */  = (int)os.knbd("knbu", knba(int ), (int)16);
                }
            }
            case 8: 
        }
        var6_5 /* !! */  = (int)os.knbd("knbv", knba(int ), (int)17);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ou createRotationPlan(ov var1_1, class_243 var2_2, class_1297 var3_3, int var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = os.sr - os.knbd("knbz", knbw(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == os.knbd("knca", knba(int ), (int)18)) break;
            v0 /* !! */  = (long)os.knbd("kncb", knba(int ), (int)19);
        }
        var7_5 = os.c;
        v1 /* !! */  = os.sr;
        if (true) ** GOTO lbl12
        block27: while (true) {
            v1 /* !! */  = (long)(os.knbd("kncd", knbw(int ), (int)2) - os.knbd("kncc", knbw(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 50042421: {
                    continue block27;
                }
                case 469867342: {
                    break block27;
                }
            }
            break;
        }
        var6_6 /* !! */  = os.b;
        v2 /* !! */  = os.sr;
        if (true) ** GOTO lbl22
        block28: while (true) {
            v2 /* !! */  = (long)(os.knbd("kncf", knbw(int ), (int)4) - os.knbd("knce", knbw(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1610562354: {
                    continue block28;
                }
                case 469867342: {
                    break block28;
                }
            }
            break;
        }
        var5_7 = os.a;
        if (var7_5) {
            throw null;
lbl30:
            // 2 sources

            return null;
        }
        if (var5_7) ** GOTO lbl30
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_7) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = os.sr - os.knbd("kncg", knbw(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == os.knbd("knch", knba(int ), (int)20)) break;
                    v3 /* !! */  = (long)os.knbd("knci", knba(int ), (int)21);
                }
                v4 /* !! */  = os.sr;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - os.knbd("kncj", knbw(int ), (int)6));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1135966464: {
                            v5 = os.knbd("knck", knbw(int ), (int)7);
                            continue block31;
                        }
                        case -1057470624: {
                            v5 = os.knbd("kncl", knbw(int ), (int)8);
                            continue block31;
                        }
                        case 469867342: {
                            break block31;
                        }
                        case 1864570521: {
                            v5 = os.knbd("kncm", knbw(int ), (int)9);
                            continue block31;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = os.sr - os.knbd("kncn", knbw(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == os.knbd("knco", knba(int ), (int)22)) break;
                    v6 /* !! */  = (long)os.knbd("kncp", knba(int ), (int)23);
                }
                v7 /* !! */  = os.sr;
                if (true) ** GOTO lbl69
                block33: while (true) {
                    v7 /* !! */  = (long)(v8 - os.knbd("kncq", knbw(int ), (int)11));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1671132820: {
                            v8 = os.knbd("kncr", knbw(int ), (int)12);
                            continue block33;
                        }
                        case 44657312: {
                            v8 = os.knbd("kncs", knbw(int ), (int)13);
                            continue block33;
                        }
                        case 128788944: {
                            v8 = os.knbd("knct", knbw(int ), (int)14);
                            continue block33;
                        }
                        case 469867342: {
                            break block33;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = os.sr - os.knbd("kncu", knbw(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == os.knbd("kncv", knba(int ), (int)24)) break;
                    v9 /* !! */  = (long)os.knbd("kncw", knba(int ), (int)25);
                }
                return new ou(var1_1, var2_2, var3_3, this.angleSmooth, var4_4, 1.0f, this.moveCorrection, os.freeCorrection);
            }
            case 0: {
                do {
                    var6_6 /* !! */  = (int)os.knbd("kncx", knba(int ), (int)26);
                } while (!var7_5);
                throw null;
            }
lbl93:
            // 2 sources

            case 1: {
                do {
                    var6_6 /* !! */  = (int)os.knbd("kncy", knba(int ), (int)27);
                } while (!var7_5);
                throw null;
            }
            case 2: {
                var6_6 /* !! */  = (int)os.knbd("kncz", knba(int ), (int)28);
                if (!var7_5) ** GOTO lbl93
                throw null;
            }
            case 3: 
        }
        do {
            var6_6 /* !! */  = (int)os.knbd("knda", knba(int ), (int)29);
        } while (!var7_5);
        throw null;
    }

    private static /* synthetic */ long knbw(int n2) {
        return knbx[n2] ^ knby[n2];
    }

    private static /* synthetic */ void kned() {
        os.knbc[0] = -1982325580;
        os.knbc[1] = -1912872035;
        os.knbc[2] = 823458601;
        os.knbc[3] = 44101745;
        os.knbc[4] = -1988442871;
        os.knbc[5] = 30169198;
        os.knbc[6] = 2105629837;
        os.knbc[7] = -1219396624;
        os.knbc[8] = -1479342086;
        os.knbc[9] = -1050477776;
        os.knbc[10] = -1243548009;
        os.knbc[11] = -659511536;
        os.knbc[12] = -1410628067;
        os.knbc[13] = 1469284806;
        os.knbc[14] = -1763112415;
        os.knbc[15] = -1392744912;
        os.knbc[16] = -1566325183;
        os.knbc[17] = -1239659751;
        os.knbc[18] = 1034688927;
        os.knbc[19] = 1843216701;
        os.knbc[20] = 681497308;
        os.knbc[21] = -969590602;
        os.knbc[22] = 1388083083;
        os.knbc[23] = -1101692654;
        os.knbc[24] = 161918333;
        os.knbc[25] = -463341094;
        os.knbc[26] = -618016816;
        os.knbc[27] = -548628075;
        os.knbc[28] = -705149875;
        os.knbc[29] = 1324304792;
        os.knbc[30] = -1439936513;
        os.knbc[31] = -30396765;
        os.knbc[32] = -1253543089;
        os.knbc[33] = 1157393904;
        os.knbc[34] = -1970870893;
        os.knbc[35] = -1443399479;
        os.knbc[36] = 558088435;
        os.knbc[37] = 489003092;
        os.knbc[38] = 1012655144;
        os.knbc[39] = 1761816322;
        os.knbc[40] = -1058075441;
        os.knbc[41] = -898665008;
        os.knbc[42] = 750801614;
        os.knbc[43] = 2087714947;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public os(boolean var1_1) {
        var3_2 /* !! */  = os.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this(new hy(), var1_1, (boolean)os.knbd("knbh", knba(int ), (int)3), (boolean)os.knbd("knbi", knba(int ), (int)4));
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)os.knbd("knbj", knba(int ), (int)5);
            }
            case 1: {
                var3_2 /* !! */  = (int)os.knbd("knbk", knba(int ), (int)6);
            }
            case 2: 
        }
        while (true) {
            var3_2 /* !! */  = (int)os.knbd("knbl", knba(int ), (int)7);
        }
    }

    private static /* synthetic */ void knef() {
        os.knby[0] = 24608348563587004L;
        os.knby[1] = -1968868874717661961L;
        os.knby[2] = 62785753437452754L;
        os.knby[3] = 4386907112851272442L;
        os.knby[4] = 4249756465225300140L;
        os.knby[5] = 6253078064193720315L;
        os.knby[6] = 377033978359666898L;
        os.knby[7] = -1035923733924192494L;
        os.knby[8] = -8225560161055018311L;
        os.knby[9] = -5751726658168505211L;
        os.knby[10] = 1889951204289107283L;
        os.knby[11] = 4025610804680909039L;
        os.knby[12] = -3194829943133518364L;
        os.knby[13] = -1518968713423284979L;
        os.knby[14] = 1163040983994290544L;
        os.knby[15] = -5575322484255659232L;
        os.knby[16] = -5933666601757998317L;
        os.knby[17] = 2890491598076791381L;
        os.knby[18] = -6556418268657527292L;
        os.knby[19] = -7174940033516791273L;
        os.knby[20] = 4798423491098681428L;
        os.knby[21] = -9113832761349547143L;
        os.knby[22] = -2243191706158142689L;
        os.knby[23] = 2325054844373710002L;
        os.knby[24] = 7961349329253460985L;
        os.knby[25] = -85336431169399406L;
        os.knby[26] = -8025942773700055800L;
        os.knby[27] = -1015258196389580609L;
        os.knby[28] = -1797192478010578753L;
    }
}

