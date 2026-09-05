/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
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
import net.minecraft.class_1799;

record jp$WorldPreview(int anchorY, int anchorX, List<class_1799> contents) {
    private static long[] ffkw;
    private static int[] ffju;
    static final long lw = -1610576798151340213L;
    private static long[] ffkv;
    private static int[] ffjt;
    private final int anchorY;
    public static final int b;
    public static final boolean c;
    private final int anchorX;
    private final List<class_1799> contents;
    public static final boolean a;

    private static /* synthetic */ long ffkn(int n2) {
        return ffkv[n2] ^ ffkw[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private jp$WorldPreview(int n2, int n3, List<class_1799> list) {
        int n4 = b;
        this.anchorX = n2;
        this.anchorY = n3;
        this.contents = list;
        if (n4 == 0) return;
        switch (n4) {
            default: {
                return;
            }
            case 1: {
                CallSite callSite = jp$WorldPreview.ffkb("ffkd", ffjs(int ), (int)1);
            }
            case 2: {
                CallSite callSite = jp$WorldPreview.ffkb("ffkf", ffjs(int ), (int)2);
            }
            case 0: {
                break;
            }
            case 3: {
                CallSite callSite = jp$WorldPreview.ffkb("ffkh", ffjs(int ), (int)3);
            }
        }
        while (true) {
            CallSite callSite = jp$WorldPreview.ffkb("ffkc", ffjs(int ), (int)0);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int anchorX() {
        v0 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - jp$WorldPreview.ffkb("ffok", ffkn(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1443642602: {
                    v1 = jp$WorldPreview.ffkb("ffom", ffkn(int ), (int)19);
                    continue block20;
                }
                case -1211371451: {
                    v1 = jp$WorldPreview.ffkb("ffos", ffkn(int ), (int)20);
                    continue block20;
                }
                case 1857294155: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = jp$WorldPreview.c;
        v2 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - jp$WorldPreview.ffkb("ffot", ffkn(int ), (int)21));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2029328566: {
                    v3 = jp$WorldPreview.ffkb("ffou", ffkn(int ), (int)22);
                    continue block21;
                }
                case -687532022: {
                    v3 = jp$WorldPreview.ffkb("ffov", ffkn(int ), (int)23);
                    continue block21;
                }
                case 1857294155: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = jp$WorldPreview.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = jp$WorldPreview.lw;
                if (true) ** GOTO lbl36
                block22: while (true) {
                    v4 /* !! */  = (long)(jp$WorldPreview.ffkb("ffpb", ffkn(int ), (int)25) - jp$WorldPreview.ffkb("ffpa", ffkn(int ), (int)24));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -840371842: {
                            continue block22;
                        }
                        case 1857294155: {
                            break block22;
                        }
                    }
                    break;
                }
                var1_3 = jp$WorldPreview.a;
                if (var3_1) {
                    throw null;
                    return (int)jp$WorldPreview.ffkb("ffpg", ffjs(int ), (int)34);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffph", ffkn(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jp$WorldPreview.ffkb("ffpi", ffjs(int ), (int)35)) break;
                    v5 /* !! */  = (long)jp$WorldPreview.ffkb("ffpj", ffjs(int ), (int)36);
                }
                return this.anchorX;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffpk", ffjs(int ), (int)37);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffpl", ffjs(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffpm", ffjs(int ), (int)39);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffpq", ffjs(int ), (int)40);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fftv() {
        jp$WorldPreview.ffju[0] = 697366008;
        jp$WorldPreview.ffju[1] = 218849286;
        jp$WorldPreview.ffju[2] = 1772487117;
        jp$WorldPreview.ffju[3] = -35244454;
        jp$WorldPreview.ffju[4] = -1067595512;
        jp$WorldPreview.ffju[5] = -526330463;
        jp$WorldPreview.ffju[6] = -857357249;
        jp$WorldPreview.ffju[7] = -338789858;
        jp$WorldPreview.ffju[8] = 1234931067;
        jp$WorldPreview.ffju[9] = -838981762;
        jp$WorldPreview.ffju[10] = 928172697;
        jp$WorldPreview.ffju[11] = 2099481485;
        jp$WorldPreview.ffju[12] = -1985404430;
        jp$WorldPreview.ffju[13] = -341743352;
        jp$WorldPreview.ffju[14] = -641324856;
        jp$WorldPreview.ffju[15] = 1373963072;
        jp$WorldPreview.ffju[16] = -1921495298;
        jp$WorldPreview.ffju[17] = 434309618;
        jp$WorldPreview.ffju[18] = -1183306182;
        jp$WorldPreview.ffju[19] = 37648450;
        jp$WorldPreview.ffju[20] = 1799955642;
        jp$WorldPreview.ffju[21] = -803828370;
        jp$WorldPreview.ffju[22] = -1770554331;
        jp$WorldPreview.ffju[23] = -1358394444;
        jp$WorldPreview.ffju[24] = 1529821763;
        jp$WorldPreview.ffju[25] = 430176115;
        jp$WorldPreview.ffju[26] = -1910399095;
        jp$WorldPreview.ffju[27] = -1192427568;
        jp$WorldPreview.ffju[28] = -1375664718;
        jp$WorldPreview.ffju[29] = -1935237798;
        jp$WorldPreview.ffju[30] = -1540525059;
        jp$WorldPreview.ffju[31] = -552797157;
        jp$WorldPreview.ffju[32] = 882517714;
        jp$WorldPreview.ffju[33] = 2068737072;
        jp$WorldPreview.ffju[34] = -507249631;
        jp$WorldPreview.ffju[35] = 1785000059;
        jp$WorldPreview.ffju[36] = 947530680;
        jp$WorldPreview.ffju[37] = 1669500346;
        jp$WorldPreview.ffju[38] = 226995547;
        jp$WorldPreview.ffju[39] = 1187736574;
        jp$WorldPreview.ffju[40] = 591917185;
        jp$WorldPreview.ffju[41] = 1960732800;
        jp$WorldPreview.ffju[42] = 708732914;
        jp$WorldPreview.ffju[43] = 1610463985;
        jp$WorldPreview.ffju[44] = 1834403824;
        jp$WorldPreview.ffju[45] = -857226683;
        jp$WorldPreview.ffju[46] = -1197559983;
        jp$WorldPreview.ffju[47] = -1745230105;
        jp$WorldPreview.ffju[48] = 1560972837;
        jp$WorldPreview.ffju[49] = 1113043214;
        jp$WorldPreview.ffju[50] = 760812719;
        jp$WorldPreview.ffju[51] = 1215046247;
        jp$WorldPreview.ffju[52] = -686265174;
        jp$WorldPreview.ffju[53] = 1530973269;
        jp$WorldPreview.ffju[54] = 2116915977;
        jp$WorldPreview.ffju[55] = 469018342;
    }

    private static /* synthetic */ void ffuj() {
        jp$WorldPreview.ffkv[0] = -6771579506175801589L;
        jp$WorldPreview.ffkv[1] = 2852952789790608949L;
        jp$WorldPreview.ffkv[2] = 2285207698665164482L;
        jp$WorldPreview.ffkv[3] = 6151468641265498970L;
        jp$WorldPreview.ffkv[4] = 4588964637463610715L;
        jp$WorldPreview.ffkv[5] = -6284050596990321403L;
        jp$WorldPreview.ffkv[6] = -7985005285409198621L;
        jp$WorldPreview.ffkv[7] = -8100930803510972811L;
        jp$WorldPreview.ffkv[8] = -2906163102997755875L;
        jp$WorldPreview.ffkv[9] = 3018302032929132576L;
        jp$WorldPreview.ffkv[10] = 6657949749726547486L;
        jp$WorldPreview.ffkv[11] = -9200878895992594377L;
        jp$WorldPreview.ffkv[12] = 349866137385519900L;
        jp$WorldPreview.ffkv[13] = 248777767268505128L;
        jp$WorldPreview.ffkv[14] = 6771647711769954401L;
        jp$WorldPreview.ffkv[15] = -1929483605155630588L;
        jp$WorldPreview.ffkv[16] = 6885815307568737589L;
        jp$WorldPreview.ffkv[17] = 975305075683549863L;
        jp$WorldPreview.ffkv[18] = 4312704664739404153L;
        jp$WorldPreview.ffkv[19] = -6518932969013769125L;
        jp$WorldPreview.ffkv[20] = 335234329666318573L;
        jp$WorldPreview.ffkv[21] = -405023547325431364L;
        jp$WorldPreview.ffkv[22] = 2240853882346533489L;
        jp$WorldPreview.ffkv[23] = -1047648187467773773L;
        jp$WorldPreview.ffkv[24] = 3191807270815558227L;
        jp$WorldPreview.ffkv[25] = 789800935216581362L;
        jp$WorldPreview.ffkv[26] = -6039273051398714795L;
        jp$WorldPreview.ffkv[27] = 5819125374869066576L;
        jp$WorldPreview.ffkv[28] = -9048560023482033273L;
        jp$WorldPreview.ffkv[29] = 4358721833696153712L;
        jp$WorldPreview.ffkv[30] = -3146239929573507790L;
        jp$WorldPreview.ffkv[31] = -7489109950908414312L;
        jp$WorldPreview.ffkv[32] = 3525878703138093678L;
        jp$WorldPreview.ffkv[33] = 163960231187990315L;
        jp$WorldPreview.ffkv[34] = -6548426973753533922L;
        jp$WorldPreview.ffkv[35] = 33963612028749471L;
        jp$WorldPreview.ffkv[36] = 4304875319920932296L;
        jp$WorldPreview.ffkv[37] = 8563641836917073759L;
        jp$WorldPreview.ffkv[38] = 8769113494589472854L;
        jp$WorldPreview.ffkv[39] = -4448861140871453893L;
        jp$WorldPreview.ffkv[40] = -6958055109472308450L;
        jp$WorldPreview.ffkv[41] = -8734583577005690163L;
        jp$WorldPreview.ffkv[42] = 4372015648914061172L;
        jp$WorldPreview.ffkv[43] = -818497313652831237L;
        jp$WorldPreview.ffkv[44] = 5313304726568148623L;
    }

    private static /* synthetic */ int ffjs(int n2) {
        return ffjt[n2] ^ ffju[n2];
    }

    private static /* synthetic */ void ffus() {
        jp$WorldPreview.ffkw[0] = -6886008220939408867L;
        jp$WorldPreview.ffkw[1] = 1344008977981825119L;
        jp$WorldPreview.ffkw[2] = -1157851549252610821L;
        jp$WorldPreview.ffkw[3] = 4747564432815626508L;
        jp$WorldPreview.ffkw[4] = 1726041689896893695L;
        jp$WorldPreview.ffkw[5] = 6479555929123248650L;
        jp$WorldPreview.ffkw[6] = -1322636563346488953L;
        jp$WorldPreview.ffkw[7] = -6872018487033551062L;
        jp$WorldPreview.ffkw[8] = 943512506260923865L;
        jp$WorldPreview.ffkw[9] = -2891467834511116093L;
        jp$WorldPreview.ffkw[10] = 6625546197051483904L;
        jp$WorldPreview.ffkw[11] = -492216732563152890L;
        jp$WorldPreview.ffkw[12] = 113112220666135167L;
        jp$WorldPreview.ffkw[13] = 7165119162350323074L;
        jp$WorldPreview.ffkw[14] = -3883209215819360734L;
        jp$WorldPreview.ffkw[15] = -1583089969403660791L;
        jp$WorldPreview.ffkw[16] = -2527118564762343426L;
        jp$WorldPreview.ffkw[17] = -2057876743075581666L;
        jp$WorldPreview.ffkw[18] = -7631979633868861458L;
        jp$WorldPreview.ffkw[19] = -2426805047184374245L;
        jp$WorldPreview.ffkw[20] = -1534694490396289130L;
        jp$WorldPreview.ffkw[21] = -8974918427428728276L;
        jp$WorldPreview.ffkw[22] = -1828943667486407881L;
        jp$WorldPreview.ffkw[23] = 1450086121494358272L;
        jp$WorldPreview.ffkw[24] = -160420053430710280L;
        jp$WorldPreview.ffkw[25] = 1684878558980602180L;
        jp$WorldPreview.ffkw[26] = -8128106526414625684L;
        jp$WorldPreview.ffkw[27] = -5533155179235896672L;
        jp$WorldPreview.ffkw[28] = 8994170332214063087L;
        jp$WorldPreview.ffkw[29] = -5357308601312956949L;
        jp$WorldPreview.ffkw[30] = -7316567758396014800L;
        jp$WorldPreview.ffkw[31] = -2977521789415457483L;
        jp$WorldPreview.ffkw[32] = 305725625452682146L;
        jp$WorldPreview.ffkw[33] = -2201369414395555236L;
        jp$WorldPreview.ffkw[34] = 7308839183994037733L;
        jp$WorldPreview.ffkw[35] = -2307288830164768764L;
        jp$WorldPreview.ffkw[36] = 1862216397324808726L;
        jp$WorldPreview.ffkw[37] = 196493103058285444L;
        jp$WorldPreview.ffkw[38] = 1502636562985034539L;
        jp$WorldPreview.ffkw[39] = 6702275417820404092L;
        jp$WorldPreview.ffkw[40] = -2533654500491628073L;
        jp$WorldPreview.ffkw[41] = -6908757334425350948L;
        jp$WorldPreview.ffkw[42] = 2161699029612536164L;
        jp$WorldPreview.ffkw[43] = 3206609762178676366L;
        jp$WorldPreview.ffkw[44] = -8286833050647869512L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - jp$WorldPreview.ffkb("fflp", ffkn(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1179042796: {
                    v1 = jp$WorldPreview.ffkb("fflq", ffkn(int ), (int)7);
                    continue block16;
                }
                case 406944981: {
                    v1 = jp$WorldPreview.ffkb("fflr", ffkn(int ), (int)8);
                    continue block16;
                }
                case 1857294155: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = jp$WorldPreview.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffls", ffkn(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jp$WorldPreview.ffkb("fflv", ffjs(int ), (int)12)) break;
            v2 /* !! */  = (long)jp$WorldPreview.ffkb("fflw", ffjs(int ), (int)13);
        }
        var2_2 /* !! */  = jp$WorldPreview.b;
        v3 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - jp$WorldPreview.ffkb("fflx", ffkn(int ), (int)10));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1688760781: {
                    v4 = jp$WorldPreview.ffkb("ffly", ffkn(int ), (int)11);
                    continue block18;
                }
                case 1024766171: {
                    v4 = jp$WorldPreview.ffkb("fflz", ffkn(int ), (int)12);
                    continue block18;
                }
                case 1857294155: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = jp$WorldPreview.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (int)jp$WorldPreview.ffkb("ffma", ffjs(int ), (int)14);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffmd", ffkn(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jp$WorldPreview.ffkb("ffmh", ffjs(int ), (int)15)) break;
                    v5 /* !! */  = (long)jp$WorldPreview.ffkb("ffmj", ffjs(int ), (int)16);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jp$WorldPreview.class, "anchorX;anchorY;contents", "anchorX", "anchorY", "contents"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffmn", ffjs(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl57:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffmp", ffjs(int ), (int)18);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl62:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffmq", ffjs(int ), (int)19);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffms", ffjs(int ), (int)20);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    static {
        ffjt = new int[56];
        ffju = new int[56];
        jp$WorldPreview.fftg();
        jp$WorldPreview.fftv();
        ffkv = new long[45];
        ffkw = new long[45];
        jp$WorldPreview.ffuj();
        jp$WorldPreview.ffus();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int anchorY() {
        v0 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(jp$WorldPreview.ffkb("ffpu", ffkn(int ), (int)28) - jp$WorldPreview.ffkb("ffpt", ffkn(int ), (int)27));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1499703425: {
                    continue block19;
                }
                case 1857294155: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = jp$WorldPreview.c;
        v1 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - jp$WorldPreview.ffkb("ffpx", ffkn(int ), (int)29));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 673337433: {
                    v2 = jp$WorldPreview.ffkb("ffpz", ffkn(int ), (int)30);
                    continue block20;
                }
                case 1857294155: {
                    break block20;
                }
                case 2126541120: {
                    v2 = jp$WorldPreview.ffkb("ffqa", ffkn(int ), (int)31);
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = jp$WorldPreview.b;
        v3 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(jp$WorldPreview.ffkb("ffqf", ffkn(int ), (int)33) - jp$WorldPreview.ffkb("ffqd", ffkn(int ), (int)32));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1589537687: {
                    continue block21;
                }
                case 1857294155: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = jp$WorldPreview.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)jp$WorldPreview.ffkb("ffqi", ffjs(int ), (int)41);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffql", ffkn(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jp$WorldPreview.ffkb("ffqo", ffjs(int ), (int)42)) break;
                    v4 /* !! */  = (long)jp$WorldPreview.ffkb("ffqp", ffjs(int ), (int)43);
                }
                return this.anchorY;
            }
            case 0: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffqr", ffjs(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl59
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffqx", ffjs(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
lbl59:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffqy", ffjs(int ), (int)46);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffrb", ffjs(int ), (int)47);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffmx", ffkn(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jp$WorldPreview.ffkb("ffmz", ffjs(int ), (int)21)) break;
            v0 /* !! */  = (long)jp$WorldPreview.ffkb("ffna", ffjs(int ), (int)22);
        }
        var4_2 = jp$WorldPreview.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffnc", ffkn(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jp$WorldPreview.ffkb("ffnd", ffjs(int ), (int)23)) break;
            v1 /* !! */  = (long)jp$WorldPreview.ffkb("ffnf", ffjs(int ), (int)24);
        }
        var3_3 /* !! */  = jp$WorldPreview.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffnk", ffkn(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jp$WorldPreview.ffkb("ffnq", ffjs(int ), (int)25)) break;
            v2 /* !! */  = (long)jp$WorldPreview.ffkb("ffnt", ffjs(int ), (int)26);
        }
        var2_4 = jp$WorldPreview.a;
        if (var4_2) {
            throw null;
            return (boolean)jp$WorldPreview.ffkb("ffnv", ffjs(int ), (int)27);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffnx", ffkn(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jp$WorldPreview.ffkb("ffob", ffjs(int ), (int)28)) break;
                    v3 /* !! */  = (long)jp$WorldPreview.ffkb("ffoe", ffjs(int ), (int)29);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jp$WorldPreview.class, "anchorX;anchorY;contents", "anchorX", "anchorY", "contents"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)jp$WorldPreview.ffkb("ffof", ffjs(int ), (int)30);
                if (!var4_2) break;
                throw null;
            }
lbl41:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)jp$WorldPreview.ffkb("ffoh", ffjs(int ), (int)31);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)jp$WorldPreview.ffkb("ffoi", ffjs(int ), (int)32);
                if (!var4_2) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)jp$WorldPreview.ffkb("ffoj", ffjs(int ), (int)33);
        } while (!var4_2);
        throw null;
    }

    public static /* synthetic */ CallSite ffkb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fftg() {
        jp$WorldPreview.ffjt[0] = 697366010;
        jp$WorldPreview.ffjt[1] = 218849287;
        jp$WorldPreview.ffjt[2] = 1772487118;
        jp$WorldPreview.ffjt[3] = -35244453;
        jp$WorldPreview.ffjt[4] = 1067595511;
        jp$WorldPreview.ffjt[5] = 1739158690;
        jp$WorldPreview.ffjt[6] = 857357248;
        jp$WorldPreview.ffjt[7] = 1478733812;
        jp$WorldPreview.ffjt[8] = 1234931065;
        jp$WorldPreview.ffjt[9] = -838981763;
        jp$WorldPreview.ffjt[10] = 928172698;
        jp$WorldPreview.ffjt[11] = 2099481485;
        jp$WorldPreview.ffjt[12] = 1985404429;
        jp$WorldPreview.ffjt[13] = 1959117566;
        jp$WorldPreview.ffjt[14] = -1436601788;
        jp$WorldPreview.ffjt[15] = -1373963073;
        jp$WorldPreview.ffjt[16] = 1714966560;
        jp$WorldPreview.ffjt[17] = 434309616;
        jp$WorldPreview.ffjt[18] = -1183306182;
        jp$WorldPreview.ffjt[19] = 37648448;
        jp$WorldPreview.ffjt[20] = 1799955641;
        jp$WorldPreview.ffjt[21] = -803828369;
        jp$WorldPreview.ffjt[22] = -272559401;
        jp$WorldPreview.ffjt[23] = 1358394443;
        jp$WorldPreview.ffjt[24] = 514508779;
        jp$WorldPreview.ffjt[25] = 430176114;
        jp$WorldPreview.ffjt[26] = -1598656643;
        jp$WorldPreview.ffjt[27] = -1192427568;
        jp$WorldPreview.ffjt[28] = 1375664717;
        jp$WorldPreview.ffjt[29] = -623283767;
        jp$WorldPreview.ffjt[30] = -1540525060;
        jp$WorldPreview.ffjt[31] = -552797160;
        jp$WorldPreview.ffjt[32] = 882517715;
        jp$WorldPreview.ffjt[33] = 2068737073;
        jp$WorldPreview.ffjt[34] = 420126288;
        jp$WorldPreview.ffjt[35] = -1785000060;
        jp$WorldPreview.ffjt[36] = 1664138079;
        jp$WorldPreview.ffjt[37] = 1669500347;
        jp$WorldPreview.ffjt[38] = 226995545;
        jp$WorldPreview.ffjt[39] = 1187736573;
        jp$WorldPreview.ffjt[40] = 591917185;
        jp$WorldPreview.ffjt[41] = -1656146670;
        jp$WorldPreview.ffjt[42] = 708732915;
        jp$WorldPreview.ffjt[43] = 987080350;
        jp$WorldPreview.ffjt[44] = 1834403826;
        jp$WorldPreview.ffjt[45] = -857226682;
        jp$WorldPreview.ffjt[46] = -1197559984;
        jp$WorldPreview.ffjt[47] = -1745230106;
        jp$WorldPreview.ffjt[48] = 1560972836;
        jp$WorldPreview.ffjt[49] = 980996184;
        jp$WorldPreview.ffjt[50] = -760812720;
        jp$WorldPreview.ffjt[51] = 28941809;
        jp$WorldPreview.ffjt[52] = -686265176;
        jp$WorldPreview.ffjt[53] = 1530973269;
        jp$WorldPreview.ffjt[54] = 2116915978;
        jp$WorldPreview.ffjt[55] = 469018341;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(jp$WorldPreview.ffkb("ffky", ffkn(int ), (int)1) - jp$WorldPreview.ffkb("ffkx", ffkn(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 622233924: {
                    continue block14;
                }
                case 1857294155: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = jp$WorldPreview.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffkz", ffkn(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jp$WorldPreview.ffkb("fflb", ffjs(int ), (int)4)) break;
            v1 /* !! */  = (long)jp$WorldPreview.ffkb("fflc", ffjs(int ), (int)5);
        }
        var2_2 /* !! */  = jp$WorldPreview.b;
        v2 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(jp$WorldPreview.ffkb("ffle", ffkn(int ), (int)4) - jp$WorldPreview.ffkb("ffld", ffkn(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -94969338: {
                    continue block16;
                }
                case 1857294155: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = jp$WorldPreview.a;
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
                    if ((v3 /* !! */  = (cfr_temp_1 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("fflf", ffkn(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jp$WorldPreview.ffkb("fflg", ffjs(int ), (int)6)) break;
                    v3 /* !! */  = (long)jp$WorldPreview.ffkb("fflh", ffjs(int ), (int)7);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{jp$WorldPreview.class, "anchorX;anchorY;contents", "anchorX", "anchorY", "contents"}, this);
            }
lbl43:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("fflj", ffjs(int ), (int)8);
                } while (!var3_1);
                throw null;
            }
lbl48:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("fflk", ffjs(int ), (int)9);
                if (!var3_1) ** GOTO lbl43
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffln", ffjs(int ), (int)10);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("fflo", ffjs(int ), (int)11);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<class_1799> contents() {
        v0 /* !! */  = jp$WorldPreview.lw;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - jp$WorldPreview.ffkb("ffre", ffkn(int ), (int)35));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1023216580: {
                    v1 = jp$WorldPreview.ffkb("ffrf", ffkn(int ), (int)36);
                    continue block18;
                }
                case 998959570: {
                    v1 = jp$WorldPreview.ffkb("ffrn", ffkn(int ), (int)37);
                    continue block18;
                }
                case 1613129853: {
                    v1 = jp$WorldPreview.ffkb("ffro", ffkn(int ), (int)38);
                    continue block18;
                }
                case 1857294155: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = jp$WorldPreview.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffrq", ffkn(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jp$WorldPreview.ffkb("ffrs", ffjs(int ), (int)48)) break;
            v2 /* !! */  = (long)jp$WorldPreview.ffkb("ffrt", ffjs(int ), (int)49);
        }
        var2_2 /* !! */  = jp$WorldPreview.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jp$WorldPreview.lw - jp$WorldPreview.ffkb("ffry", ffkn(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jp$WorldPreview.ffkb("ffrz", ffjs(int ), (int)50)) break;
            v3 /* !! */  = (long)jp$WorldPreview.ffkb("ffsc", ffjs(int ), (int)51);
        }
        var1_3 = jp$WorldPreview.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = jp$WorldPreview.lw;
                if (true) ** GOTO lbl45
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - jp$WorldPreview.ffkb("ffsg", ffkn(int ), (int)41));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -731248497: {
                            v5 = jp$WorldPreview.ffkb("ffsh", ffkn(int ), (int)42);
                            continue block22;
                        }
                        case 64146576: {
                            v5 = jp$WorldPreview.ffkb("ffsj", ffkn(int ), (int)43);
                            continue block22;
                        }
                        case 434892814: {
                            v5 = jp$WorldPreview.ffkb("ffsk", ffkn(int ), (int)44);
                            continue block22;
                        }
                        case 1857294155: {
                            break block22;
                        }
                    }
                    break;
                }
                return this.contents;
            }
lbl58:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffsw", ffjs(int ), (int)52);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffsy", ffjs(int ), (int)53);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("ffsz", ffjs(int ), (int)54);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jp$WorldPreview.ffkb("fftb", ffjs(int ), (int)55);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }
}

