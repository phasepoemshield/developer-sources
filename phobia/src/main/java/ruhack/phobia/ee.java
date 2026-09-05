/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import ruhack.phobia.ar;
import ruhack.phobia.at;
import ruhack.phobia.dz;
import ruhack.phobia.ee$TextPart;
import ruhack.phobia.ee$Toast;
import ruhack.phobia.ee$Type;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.nd;

public final class ee
extends ar {
    private static long[] arfa;
    public static final boolean c;
    private static final float TEXT_LEFT_PADDING = 6.6705875f;
    private static final int BORDER_COLOR;
    private static final AtomicBoolean UPDATE_SHOWN;
    private static final float PANEL_HEIGHT = 24.481056f;
    private static final float CONTENT_Y_OFFSET = 2.7149293f;
    private static final float BELL_WIDTH = 7.6111403f;
    private static final float INNER_SHADOW_BLUR = 9.672352f;
    private static final float CONTENT_BORDER = 0.66705877f;
    private static final String CONFIG_ICON = "F";
    private static int[] arev;
    private static final int MUTED_TEXT_COLOR;
    private static final float CONFIG_WIDTH = 7.7912464f;
    private static volatile ee instance;
    private static volatile ee$Toast updateToast;
    private static final float PANEL_RADIUS = 7.3376465f;
    private static final long ANIMATION_MS = 220L;
    private static final long LIFETIME_MS = 2500L;
    public static final boolean a;
    private static final float PANEL_BORDER = 0.66705877f;
    private static final int CONTENT_BORDER_COLOR;
    private static final int MAX_NOTIFICATIONS = 6;
    private static final float TEXT_SIZE = 8.004705f;
    private static int[] areu;
    protected static final long cj = 8606780693484564007L;
    private static final float CONTENT_GAP = 2.3747292f;
    private static final ee$Toast CHAT_PREVIEW;
    private static final float CONTENT_X_OFFSET = 2.9684112f;
    private static final float INNER_SHADOW_THICKNESS = 0.76711756f;
    private static final String TOGGLE_ON_ICON = "D";
    private static final List<ee$Toast> TOASTS;
    private static final float TEXT_RIGHT_PADDING = 5.6699996f;
    private static final int BLACK_FILL;
    private static long[] arfb;
    private static final float DESIGN_SCALE = 1.4991183f;
    private static final String TOGGLE_OFF_ICON = "E";
    private static final float TOGGLE_WIDTH = 8.404941f;
    private static final float ICON_PANEL_WIDTH = 22.046291f;
    private static final float STACK_GAP = 2.3747292f;
    private static final int TEXT_COLOR;
    private static final float INITIAL_WIDTH = 133.72527f;
    public static final int b;
    private static final String BELL_ICON = "G";
    private static final float CONTENT_HEIGHT = 19.057869f;
    private static final float CONTENT_RADIUS = 5.33647f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void push(ee$Toast var0) {
        v0 /* !! */  = ee.cj;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - ee.arew("arrl", arfj(int ), (int)142));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2131396466: {
                    v1 = ee.arew("arrn", arfj(int ), (int)143);
                    continue block31;
                }
                case -1495896537: {
                    break block31;
                }
                case -1197435201: {
                    v1 = ee.arew("arro", arfj(int ), (int)144);
                    continue block31;
                }
                case 1139546871: {
                    v1 = ee.arew("arrp", arfj(int ), (int)145);
                    continue block31;
                }
            }
            break;
        }
        var3_1 = ee.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arrq", arfj(int ), (int)146)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ee.arew("arrr", aret(int ), (int)176)) break;
            v2 /* !! */  = (long)ee.arew("arrs", aret(int ), (int)177);
        }
        var2_2 /* !! */  = ee.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arrt", arfj(int ), (int)147)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ee.arew("arrz", aret(int ), (int)178)) break;
            v3 /* !! */  = (long)ee.arew("arsa", aret(int ), (int)179);
        }
        var1_3 = ee.a;
        if (var3_1) {
            throw null;
lbl34:
            // 6 sources

            return;
        }
        if (var1_3) ** GOTO lbl34
        block35: while (true) {
            if (var1_3 || var1_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arsc", arfj(int ), (int)148)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ee.arew("arsd", aret(int ), (int)180)) break;
                v4 /* !! */  = (long)ee.arew("arse", aret(int ), (int)181);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("arsf", arfj(int ), (int)149)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ee.arew("arsg", aret(int ), (int)182)) break;
                v5 /* !! */  = (long)ee.arew("arsi", aret(int ), (int)183);
            }
            if (ee.TOASTS.size() < ee.arew("arsk", aret(int ), (int)184)) ** GOTO lbl84
            if (var1_3) ** GOTO lbl34
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("arsl", arfj(int ), (int)150)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == ee.arew("arsn", aret(int ), (int)185)) break;
                v6 /* !! */  = (long)ee.arew("arso", aret(int ), (int)186);
            }
            v7 = ee.arew("arsq", aret(int ), (int)187);
            v8 /* !! */  = ee.cj;
            if (true) ** GOTO lbl64
            block39: while (true) {
                v8 /* !! */  = (long)(v9 - ee.arew("arsr", arfj(int ), (int)151));
lbl64:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1495896537: {
                        break block39;
                    }
                    case -189456603: {
                        v9 = ee.arew("arsv", arfj(int ), (int)152);
                        continue block39;
                    }
                    case 560400263: {
                        v9 = ee.arew("arsw", arfj(int ), (int)153);
                        continue block39;
                    }
                    case 1548272715: {
                        v9 = ee.arew("arsx", arfj(int ), (int)154);
                        continue block39;
                    }
                }
                break;
            }
            ee.TOASTS.remove((int)v7);
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3) ** GOTO lbl34
                    if (!var3_1) continue block35;
                    throw null;
                }
lbl84:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl34
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ee.cj - ee.arew("arsy", arfj(int ), (int)155)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ee.arew("arsz", aret(int ), (int)188)) break;
                    v10 /* !! */  = (long)ee.arew("artb", aret(int ), (int)189);
                }
                v11 /* !! */  = ee.cj;
                if (true) ** GOTO lbl95
                block41: while (true) {
                    v11 /* !! */  = (long)(v12 - ee.arew("arti", arfj(int ), (int)156));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1495896537: {
                            break block41;
                        }
                        case -1143380908: {
                            v12 = ee.arew("artj", arfj(int ), (int)157);
                            continue block41;
                        }
                        case -794556563: {
                            v12 = ee.arew("artk", arfj(int ), (int)158);
                            continue block41;
                        }
                    }
                    break;
                }
                ee.TOASTS.add(var0);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
                case 0: {
                    var2_2 /* !! */  = (int)ee.arew("artl", aret(int ), (int)190);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                }
lbl114:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)ee.arew("artm", aret(int ), (int)191);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                }
lbl119:
                // 2 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ee.arew("artr", aret(int ), (int)192);
                    } while (!var3_1);
                    throw null;
                }
lbl124:
                // 2 sources

                case 3: {
                    do {
                        var2_2 /* !! */  = (int)ee.arew("arts", aret(int ), (int)193);
                    } while (!var3_1);
                    throw null;
                }
                case 4: {
                    var2_2 /* !! */  = (int)ee.arew("artu", aret(int ), (int)194);
                    if (!var3_1) ** GOTO lbl119
                    throw null;
                }
                case 5: {
                    var2_2 /* !! */  = (int)ee.arew("artw", aret(int ), (int)195);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl138:
                // 2 sources

                case 6: {
                    var2_2 /* !! */  = (int)ee.arew("arty", aret(int ), (int)196);
                    if (!var3_1) ** GOTO lbl114
                    throw null;
                }
lbl142:
                // 3 sources

                case 7: {
                    var2_2 /* !! */  = (int)ee.arew("arua", aret(int ), (int)197);
                    if (!var3_1) ** GOTO lbl138
                    throw null;
                }
                case 8: {
                    var2_2 /* !! */  = (int)ee.arew("arue", aret(int ), (int)198);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 9: {
                    var2_2 /* !! */  = (int)ee.arew("aruf", aret(int ), (int)199);
                    if (!var3_1) ** GOTO lbl124
                    throw null;
                }
lbl154:
                // 2 sources

                case 10: {
                    var2_2 /* !! */  = (int)ee.arew("aruh", aret(int ), (int)200);
                    if (!var3_1) break block35;
                    throw null;
                }
                case 11: 
            }
            break;
        }
        do {
            var2_2 /* !! */  = (int)ee.arew("aruj", aret(int ), (int)201);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void atij() {
        ee.arev[200] = -217001946;
        ee.arev[201] = -240684541;
        ee.arev[202] = 621282326;
        ee.arev[203] = -1692641969;
        ee.arev[204] = -1102490179;
        ee.arev[205] = 365968114;
        ee.arev[206] = -1407139930;
        ee.arev[207] = 297995040;
        ee.arev[208] = -69800088;
        ee.arev[209] = -940966543;
        ee.arev[210] = -828347510;
        ee.arev[211] = 1100662614;
        ee.arev[212] = 341359240;
        ee.arev[213] = -979781666;
        ee.arev[214] = 287762644;
        ee.arev[215] = 54641142;
        ee.arev[216] = -68903730;
        ee.arev[217] = 125256339;
        ee.arev[218] = -1865707673;
        ee.arev[219] = 1532285743;
        ee.arev[220] = 528366759;
        ee.arev[221] = -1174231345;
        ee.arev[222] = -2045864843;
        ee.arev[223] = 797718500;
        ee.arev[224] = 2085101568;
        ee.arev[225] = 467541328;
        ee.arev[226] = -1664387980;
        ee.arev[227] = -648827663;
        ee.arev[228] = -273154665;
        ee.arev[229] = 1480450833;
        ee.arev[230] = -1301338747;
        ee.arev[231] = 458874997;
        ee.arev[232] = -1603191593;
        ee.arev[233] = -1822764366;
        ee.arev[234] = -1853655599;
        ee.arev[235] = 824487619;
        ee.arev[236] = -690548687;
        ee.arev[237] = 1522125820;
        ee.arev[238] = 1320663891;
        ee.arev[239] = 845715107;
        ee.arev[240] = -1375021220;
        ee.arev[241] = 45778932;
        ee.arev[242] = 1582087133;
        ee.arev[243] = -2041276530;
        ee.arev[244] = -493863776;
        ee.arev[245] = -1612969660;
        ee.arev[246] = 558283540;
        ee.arev[247] = 263506394;
        ee.arev[248] = -173421106;
        ee.arev[249] = 2029070836;
        ee.arev[250] = 942121478;
        ee.arev[251] = 1334738557;
        ee.arev[252] = -1693307275;
        ee.arev[253] = -543997878;
        ee.arev[254] = 1992528910;
        ee.arev[255] = 2114076882;
        ee.arev[256] = -142806957;
        ee.arev[257] = -1301905368;
        ee.arev[258] = 1259224680;
        ee.arev[259] = 2040901788;
        ee.arev[260] = -1217921272;
        ee.arev[261] = -1661432142;
        ee.arev[262] = 984943879;
        ee.arev[263] = 1494382666;
        ee.arev[264] = 2028704525;
        ee.arev[265] = -1971180493;
        ee.arev[266] = 342317221;
        ee.arev[267] = 309846908;
        ee.arev[268] = 732028899;
        ee.arev[269] = 1375672385;
        ee.arev[270] = 908780060;
        ee.arev[271] = -573515322;
        ee.arev[272] = -2053181041;
        ee.arev[273] = -207776738;
        ee.arev[274] = -785633548;
        ee.arev[275] = -130530893;
        ee.arev[276] = -1090228923;
        ee.arev[277] = -205969568;
        ee.arev[278] = 1918868284;
        ee.arev[279] = -839774197;
        ee.arev[280] = -1505482398;
        ee.arev[281] = 2091551444;
        ee.arev[282] = 2000762013;
        ee.arev[283] = 1566541656;
        ee.arev[284] = 954192031;
        ee.arev[285] = 552656288;
        ee.arev[286] = -196169045;
        ee.arev[287] = -1283888217;
        ee.arev[288] = 514000003;
        ee.arev[289] = -388593497;
        ee.arev[290] = 12066942;
        ee.arev[291] = -1965871477;
        ee.arev[292] = 1127789337;
        ee.arev[293] = -67734480;
        ee.arev[294] = 1031342977;
        ee.arev[295] = 1960204134;
        ee.arev[296] = -623668253;
        ee.arev[297] = -970165303;
        ee.arev[298] = -1093317751;
        ee.arev[299] = 706063339;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public float getRoundingRadius() {
        block26: {
            v0 /* !! */  = ee.cj;
            block16: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1495896537: {
                        break block16;
                    }
                    case -1199658917: {
                        v0 /* !! */  = (long)(ee.arew("atco", arfj(int ), (int)247) - ee.arew("atcn", arfj(int ), (int)246));
                        continue block16;
                    }
                }
                break;
            }
            var3_1 = ee.c;
            while (true) {
                block27: {
                    if ((v1 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("atcp", arfj(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != ee.arew("atcq", aret(int ), (int)606)) break block27;
                    var2_2 /* !! */  = ee.b;
                    v2 /* !! */  = ee.cj;
                    if (true) ** GOTO lbl22
                }
                v1 /* !! */  = (long)ee.arew("atcr", aret(int ), (int)607);
            }
            block18: while (true) {
                v2 /* !! */  = (long)(v3 - ee.arew("atcs", arfj(int ), (int)249));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1495896537: {
                        break block18;
                    }
                    case -332795145: {
                        v3 = ee.arew("atct", arfj(int ), (int)250);
                        continue block18;
                    }
                    case 684914872: {
                        v3 = ee.arew("atcu", arfj(int ), (int)251);
                        continue block18;
                    }
                    case 844975550: {
                        v3 = ee.arew("atcv", arfj(int ), (int)252);
                        continue block18;
                    }
                }
                break;
            }
            var1_3 = ee.a;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block19: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) {
                            return (float)ee.arew("atcw", arxx(int ), (int)608);
                        }
                        return (float)ee.arew("atcx", arxx(int ), (int)609);
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        break block26;
                    }
lbl49:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)ee.arew("atcy", aret(int ), (int)610);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block19;
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)ee.arew("atda", aret(int ), (int)612);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)ee.arew("atcz", aret(int ), (int)611);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)ee.arew("atdb", aret(int ), (int)613);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    public ee() {
        int n2 = b;
        super("Notifications", (int)ee.arew("arex", aret(int ), (int)0), (int)ee.arew("arey", aret(int ), (int)1), (int)Math.ceil((double)ee.arew("arfc", arez(int ), (int)0)), (int)Math.ceil((double)ee.arew("arfd", arez(int ), (int)1)), (boolean)ee.arew("arfe", aret(int ), (int)2));
        instance = this;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float centeredTextY(ks var0, float var1_1, float var2_2) {
        block64: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("asvf", arfj(int ), (int)191)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ee.arew("asvg", aret(int ), (int)471)) break;
                v0 /* !! */  = (long)ee.arew("asvh", aret(int ), (int)472);
            }
            var7_3 = ee.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("asvi", arfj(int ), (int)192)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ee.arew("asvj", aret(int ), (int)473)) break;
                v1 /* !! */  = (long)ee.arew("asvk", aret(int ), (int)474);
            }
            var6_4 /* !! */  = ee.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("asvl", arfj(int ), (int)193)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ee.arew("asvm", aret(int ), (int)475)) break;
                v2 /* !! */  = (long)ee.arew("asvn", aret(int ), (int)476);
            }
            var5_5 = ee.a;
            if (var7_3) {
                throw null;
lbl21:
                // 10 sources

                return (float)ee.arew("asvo", arxx(int ), (int)477);
            }
            if (var5_5 || var5_5) ** GOTO lbl21
            if (var0 != null) break block64;
            if (var5_5) ** GOTO lbl21
            return var2_2 - var1_1 * ee.arew("asvp", arxx(int ), (int)478);
        }
        if (var5_5 || var5_5) ** GOTO lbl21
        v3 = ee.arew("asvq", aret(int ), (int)479);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("asvr", arfj(int ), (int)194)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ee.arew("asvs", aret(int ), (int)480)) break;
            v4 /* !! */  = (long)ee.arew("asvt", aret(int ), (int)481);
        }
        var3_6 = var0.getGlyph((int)v3);
        if (var5_5) ** GOTO lbl21
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl21
                if (var3_6 == null) ** GOTO lbl50
                if (var5_5) ** GOTO lbl21
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("asvu", arfj(int ), (int)195)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ee.arew("asvv", aret(int ), (int)482)) break;
                    v5 /* !! */  = (long)ee.arew("asvw", aret(int ), (int)483);
                }
                if (!(var3_6.height <= 0.0f)) ** GOTO lbl68
                if (var5_5) ** GOTO lbl21
lbl50:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl21
                v6 /* !! */  = ee.cj;
                if (true) ** GOTO lbl55
                block42: while (true) {
                    v6 /* !! */  = (long)(v7 - ee.arew("asvx", arfj(int ), (int)196));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1495896537: {
                            break block42;
                        }
                        case -9370244: {
                            v7 = ee.arew("asvy", arfj(int ), (int)197);
                            continue block42;
                        }
                        case 498394406: {
                            v7 = ee.arew("asvz", arfj(int ), (int)198);
                            continue block42;
                        }
                        case 592272172: {
                            v7 = ee.arew("aswa", arfj(int ), (int)199);
                            continue block42;
                        }
                    }
                    break;
                }
                return var2_2 - var0.getLineHeight() * var1_1 * ee.arew("aswb", arxx(int ), (int)484);
lbl68:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl21
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = ee.cj - ee.arew("aswc", arfj(int ), (int)200)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ee.arew("aswd", aret(int ), (int)485)) break;
                    v8 /* !! */  = (long)ee.arew("aswe", aret(int ), (int)486);
                }
                var4_7 = var1_1 / var0.getEmSize();
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_6 = ee.cj - ee.arew("aswf", arfj(int ), (int)201)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ee.arew("aswg", aret(int ), (int)487)) break;
                    v9 /* !! */  = (long)ee.arew("aswh", aret(int ), (int)488);
                }
                v10 = var0.getAscender();
                v11 /* !! */  = ee.cj;
                if (true) ** GOTO lbl87
                block45: while (true) {
                    v11 /* !! */  = (long)(ee.arew("aswj", arfj(int ), (int)203) - ee.arew("aswi", arfj(int ), (int)202));
lbl87:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1495896537: {
                            break block45;
                        }
                        case -513523843: {
                            continue block45;
                        }
                    }
                    break;
                }
                v12 = v10 - var3_6.bearingY;
                v13 /* !! */  = ee.cj;
                if (true) ** GOTO lbl97
                block46: while (true) {
                    v13 /* !! */  = (long)(v14 - ee.arew("aswk", arfj(int ), (int)204));
lbl97:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1495896537: {
                            break block46;
                        }
                        case -1449369303: {
                            v14 = ee.arew("aswl", arfj(int ), (int)205);
                            continue block46;
                        }
                        case -1345893895: {
                            v14 = ee.arew("aswm", arfj(int ), (int)206);
                            continue block46;
                        }
                        case 435106339: {
                            v14 = ee.arew("aswn", arfj(int ), (int)207);
                            continue block46;
                        }
                    }
                    break;
                }
                return var2_2 - (v12 + var3_6.height * ee.arew("aswo", arxx(int ), (int)489)) * var4_7;
            }
lbl110:
            // 2 sources

            case 0: {
                var6_4 /* !! */  = (int)ee.arew("aswp", aret(int ), (int)490);
                if (var7_3) {
                    throw null;
                }
            }
            case 1: {
                var6_4 /* !! */  = (int)ee.arew("aswq", aret(int ), (int)491);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl119:
            // 2 sources

            case 2: {
                do {
                    var6_4 /* !! */  = (int)ee.arew("aswr", aret(int ), (int)492);
                } while (!var7_3);
                throw null;
            }
            case 3: {
                var6_4 /* !! */  = (int)ee.arew("asws", aret(int ), (int)493);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl129:
            // 2 sources

            case 4: {
                var6_4 /* !! */  = (int)ee.arew("aswt", aret(int ), (int)494);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl134:
            // 3 sources

            case 5: {
                var6_4 /* !! */  = (int)ee.arew("aswu", aret(int ), (int)495);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 6: {
                var6_4 /* !! */  = (int)ee.arew("aswv", aret(int ), (int)496);
                if (!var7_3) ** GOTO lbl110
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)ee.arew("asww", aret(int ), (int)497);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl154
                    break;
                }
            }
            case 8: {
                var6_4 /* !! */  = (int)ee.arew("aswx", aret(int ), (int)498);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl154:
            // 3 sources

            case 9: {
                var6_4 /* !! */  = (int)ee.arew("aswy", aret(int ), (int)499);
                if (!var7_3) ** GOTO lbl119
                throw null;
            }
lbl158:
            // 2 sources

            case 10: {
                var6_4 /* !! */  = (int)ee.arew("aswz", aret(int ), (int)500);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
lbl162:
            // 3 sources

            case 11: {
                var6_4 /* !! */  = (int)ee.arew("asxa", aret(int ), (int)501);
                if (!var7_3) ** GOTO lbl134
                throw null;
            }
lbl166:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)ee.arew("asxb", aret(int ), (int)502);
                if (!var7_3) ** GOTO lbl162
                throw null;
            }
            case 13: {
                do {
                    var6_4 /* !! */  = (int)ee.arew("asxc", aret(int ), (int)503);
                } while (!var7_3);
                throw null;
            }
lbl175:
            // 2 sources

            case 14: {
                var6_4 /* !! */  = (int)ee.arew("asxd", aret(int ), (int)504);
                if (!var7_3) ** GOTO lbl162
                throw null;
            }
lbl179:
            // 2 sources

            case 15: {
                var6_4 /* !! */  = (int)ee.arew("asxe", aret(int ), (int)505);
                if (!var7_3) ** GOTO lbl134
                throw null;
            }
            case 16: {
                do {
                    var6_4 /* !! */  = (int)ee.arew("asxf", aret(int ), (int)506);
                } while (!var7_3);
                throw null;
            }
            case 17: 
        }
        var6_4 /* !! */  = (int)ee.arew("asxg", aret(int ), (int)507);
        ** while (!var7_3)
lbl191:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void info(String var0) {
        block71: {
            while (true) {
                block72: {
                    if ((v0 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arfy", arfj(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  != ee.arew("arfz", aret(int ), (int)15)) break block72;
                    var3_1 = ee.c;
                    v1 /* !! */  = ee.cj;
                    if (true) ** GOTO lbl12
                }
                v0 /* !! */  = (long)ee.arew("arga", aret(int ), (int)16);
            }
            block37: while (true) {
                v1 /* !! */  = (long)(v2 - ee.arew("argb", arfj(int ), (int)9));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1495896537: {
                        break block37;
                    }
                    case -182575305: {
                        v2 = ee.arew("argc", arfj(int ), (int)10);
                        continue block37;
                    }
                    case 1332624267: {
                        v2 = ee.arew("argd", arfj(int ), (int)11);
                        continue block37;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ee.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arge", arfj(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ee.arew("argf", aret(int ), (int)17)) {
                    var1_3 = ee.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)ee.arew("argg", aret(int ), (int)18);
            }
            if (var1_3 || var1_3) return;
            if (var0 != null) {
                if (var1_3) return;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("argh", arfj(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ee.arew("argi", aret(int ), (int)19)) {
                        if (var0.isBlank()) {
                            break;
                        }
                        break block71;
                    }
                    v4 /* !! */  = (long)ee.arew("argj", aret(int ), (int)20);
                }
                if (var1_3) return;
            }
            if (var1_3 || var1_3) return;
            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block40: while (true) {
            block73: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 || var1_3) return;
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("argk", arfj(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != ee.arew("argl", aret(int ), (int)21)) ** GOTO lbl57
                            v6 /* !! */  = ee.cj;
                            if (true) ** GOTO lbl108
lbl57:
                            // 1 sources

                            v5 /* !! */  = (long)ee.arew("argm", aret(int ), (int)22);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ee.arew("arhi", aret(int ), (int)31);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block73;
                    }
                    case 2: {
                        ** GOTO lbl101
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)ee.arew("arhn", aret(int ), (int)36);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)ee.arew("arho", aret(int ), (int)37);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)ee.arew("arhq", aret(int ), (int)39);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)ee.arew("arhm", aret(int ), (int)35);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)ee.arew("arhr", aret(int ), (int)40);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block73;
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)ee.arew("arht", aret(int ), (int)42);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block73;
                    }
                    case 12: lbl-1000:
                    // 3 sources

                    {
                        var2_2 /* !! */  = (int)ee.arew("arhu", aret(int ), (int)43);
                        if (var3_1) {
                            throw null;
                        }
lbl101:
                        // 3 sources

                        var2_2 /* !! */  = (int)ee.arew("arhk", aret(int ), (int)33);
                        cfr_temp_0 = 3;
                        if (var3_1) {
                            throw null;
                        }
                        break block73;
                    }
                    block42: while (true) {
                        v6 /* !! */  = (long)(v7 - ee.arew("argn", arfj(int ), (int)15));
lbl108:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1495896537: {
                                break block42;
                            }
                            case -558863955: {
                                v7 = ee.arew("argo", arfj(int ), (int)16);
                                continue block42;
                            }
                            case 923635267: {
                                v7 = ee.arew("argp", arfj(int ), (int)17);
                                continue block42;
                            }
                            case 1758927749: {
                                v7 = ee.arew("argq", arfj(int ), (int)18);
                                continue block42;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_5 = ee.cj - ee.arew("argr", arfj(int ), (int)19)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == ee.arew("args", aret(int ), (int)23)) break;
                        v8 /* !! */  = (long)ee.arew("argt", aret(int ), (int)24);
                    }
                    v9 = ee.arew("argu", aret(int ), (int)25);
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_6 = ee.cj - ee.arew("argv", arfj(int ), (int)20)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == ee.arew("argw", aret(int ), (int)26)) break;
                        v10 /* !! */  = (long)ee.arew("argx", aret(int ), (int)27);
                    }
                    v11 = new ee$TextPart(var0, (boolean)v9);
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_7 = ee.cj - ee.arew("argy", arfj(int ), (int)21)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  != ee.arew("argz", aret(int ), (int)28)) ** GOTO lbl139
                        v13 = List.of(v11);
                        v14 = ee.arew("arhb", aret(int ), (int)30);
                        v15 /* !! */  = ee.cj;
                        if (true) ** GOTO lbl143
lbl139:
                        // 1 sources

                        v12 /* !! */  = (long)ee.arew("arha", aret(int ), (int)29);
                    }
                    block46: while (true) {
                        v15 /* !! */  = (long)(v16 - ee.arew("arhc", arfj(int ), (int)22));
lbl143:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -1495896537: {
                                break block46;
                            }
                            case -1382259782: {
                                v16 = ee.arew("arhd", arfj(int ), (int)23);
                                continue block46;
                            }
                            case -104401024: {
                                v16 = ee.arew("arhe", arfj(int ), (int)24);
                                continue block46;
                            }
                            case 1942873520: {
                                v16 = ee.arew("arhf", arfj(int ), (int)25);
                                continue block46;
                            }
                        }
                        break;
                    }
                    v17 = new ee$Toast(ee$Type.INFO, v13, (boolean)v14);
                    v18 /* !! */  = ee.cj;
                    block47: while (true) {
                        switch ((int)v18 /* !! */ ) {
                            case -1495896537: {
                                break block47;
                            }
                            case -1111595051: {
                                v18 /* !! */  = (long)(ee.arew("arhh", arfj(int ), (int)27) - ee.arew("arhg", arfj(int ), (int)26));
                                continue block47;
                            }
                        }
                        break;
                    }
                    ee.push(v17);
                    if (!var1_3 && !var1_3) return;
                    return;
                    case 1: {
                        var2_2 /* !! */  = (int)ee.arew("arhj", aret(int ), (int)32);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)ee.arew("arhp", aret(int ), (int)38);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block73;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ee.arew("arhl", aret(int ), (int)34);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl186
            }
            do {
                if (true) continue block40;
lbl186:
                // 2 sources

                var2_2 /* !! */  = (int)ee.arew("arhs", aret(int ), (int)41);
                cfr_temp_0 = 3;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void atim() {
        ee.arev[500] = -813547379;
        ee.arev[501] = -922562038;
        ee.arev[502] = 702816913;
        ee.arev[503] = 335696438;
        ee.arev[504] = -819366078;
        ee.arev[505] = 725309150;
        ee.arev[506] = 665384088;
        ee.arev[507] = 916824336;
        ee.arev[508] = -1888936625;
        ee.arev[509] = -554680699;
        ee.arev[510] = 638493969;
        ee.arev[511] = 670369845;
        ee.arev[512] = 267974377;
        ee.arev[513] = 1258626325;
        ee.arev[514] = -1803410787;
        ee.arev[515] = 24033010;
        ee.arev[516] = 1219009710;
        ee.arev[517] = 1903029639;
        ee.arev[518] = 1966790140;
        ee.arev[519] = -223888319;
        ee.arev[520] = 2089880422;
        ee.arev[521] = 1951725906;
        ee.arev[522] = -542401820;
        ee.arev[523] = -2040237822;
        ee.arev[524] = -2086470934;
        ee.arev[525] = -1966795178;
        ee.arev[526] = -422972909;
        ee.arev[527] = 676774539;
        ee.arev[528] = -582012829;
        ee.arev[529] = 203382523;
        ee.arev[530] = 919453863;
        ee.arev[531] = -820502174;
        ee.arev[532] = -1322958920;
        ee.arev[533] = 1148307610;
        ee.arev[534] = -1520619347;
        ee.arev[535] = 722278472;
        ee.arev[536] = -283611071;
        ee.arev[537] = 87440411;
        ee.arev[538] = 1916634871;
        ee.arev[539] = 154980218;
        ee.arev[540] = -1984320;
        ee.arev[541] = -1537731362;
        ee.arev[542] = -1846475120;
        ee.arev[543] = -1059575330;
        ee.arev[544] = -185216360;
        ee.arev[545] = 1925524761;
        ee.arev[546] = -550058083;
        ee.arev[547] = 913651647;
        ee.arev[548] = 355953381;
        ee.arev[549] = -50329596;
        ee.arev[550] = 1008835028;
        ee.arev[551] = 523297679;
        ee.arev[552] = 209537943;
        ee.arev[553] = -831431930;
        ee.arev[554] = 2139626098;
        ee.arev[555] = 24843373;
        ee.arev[556] = 1635039460;
        ee.arev[557] = 553486683;
        ee.arev[558] = 921130158;
        ee.arev[559] = 363299960;
        ee.arev[560] = -1472513676;
        ee.arev[561] = -1941211713;
        ee.arev[562] = 1785207427;
        ee.arev[563] = 1116582090;
        ee.arev[564] = 814968531;
        ee.arev[565] = -1337064746;
        ee.arev[566] = 735907496;
        ee.arev[567] = 257257083;
        ee.arev[568] = -587890744;
        ee.arev[569] = -1940276227;
        ee.arev[570] = 1204674494;
        ee.arev[571] = 1707598830;
        ee.arev[572] = 811310240;
        ee.arev[573] = 583614722;
        ee.arev[574] = 324216852;
        ee.arev[575] = -1510498925;
        ee.arev[576] = -220680698;
        ee.arev[577] = -171852377;
        ee.arev[578] = 467226835;
        ee.arev[579] = -1363708781;
        ee.arev[580] = 1571690051;
        ee.arev[581] = 843884189;
        ee.arev[582] = 1271165849;
        ee.arev[583] = 268742744;
        ee.arev[584] = -2121842572;
        ee.arev[585] = 1123660325;
        ee.arev[586] = 1594088950;
        ee.arev[587] = 2085070526;
        ee.arev[588] = -886527899;
        ee.arev[589] = 756424997;
        ee.arev[590] = -2107780334;
        ee.arev[591] = 1402895198;
        ee.arev[592] = 2134564837;
        ee.arev[593] = -1115414128;
        ee.arev[594] = 1391180017;
        ee.arev[595] = -2021430075;
        ee.arev[596] = 1409507592;
        ee.arev[597] = -134551500;
        ee.arev[598] = -1693202926;
        ee.arev[599] = -1237459180;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void item(class_1799 var0) {
        block54: {
            block53: {
                v0 /* !! */  = ee.cj;
                if (true) ** GOTO lbl5
                block35: while (true) {
                    v0 /* !! */  = (long)(v1 - ee.arew("armf", arfj(int ), (int)84));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1495896537: {
                            break block35;
                        }
                        case -1400321097: {
                            v1 = ee.arew("armg", arfj(int ), (int)85);
                            continue block35;
                        }
                        case 1244149382: {
                            v1 = ee.arew("armh", arfj(int ), (int)86);
                            continue block35;
                        }
                    }
                    break;
                }
                var3_1 = ee.c;
                v2 /* !! */  = ee.cj;
                if (true) ** GOTO lbl19
                block36: while (true) {
                    v2 /* !! */  = (long)(ee.arew("armj", arfj(int ), (int)88) - ee.arew("armi", arfj(int ), (int)87));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1495896537: {
                            break block36;
                        }
                        case -963115975: {
                            continue block36;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = ee.b;
                v3 /* !! */  = ee.cj;
                if (true) ** GOTO lbl29
                block37: while (true) {
                    v3 /* !! */  = (long)(v4 - ee.arew("armk", arfj(int ), (int)89));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1613703642: {
                            v4 = ee.arew("arml", arfj(int ), (int)90);
                            continue block37;
                        }
                        case -1560460670: {
                            v4 = ee.arew("armm", arfj(int ), (int)91);
                            continue block37;
                        }
                        case -1495896537: {
                            break block37;
                        }
                        case 485190725: {
                            v4 = ee.arew("armn", arfj(int ), (int)92);
                            continue block37;
                        }
                    }
                    break;
                }
                var1_3 = ee.a;
                if (var3_1) {
                    throw null;
lbl44:
                    // 7 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl44
                if (var0 == null) break block53;
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("armo", arfj(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ee.arew("armp", aret(int ), (int)102)) break;
                    v5 /* !! */  = (long)ee.arew("armq", aret(int ), (int)103);
                }
                if (!var0.method_7960()) break block54;
                if (var1_3) ** GOTO lbl44
            }
            if (var1_3 || var1_3) ** GOTO lbl44
            return;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("armr", arfj(int ), (int)94)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ee.arew("arms", aret(int ), (int)104)) break;
                    v6 /* !! */  = (long)ee.arew("armt", aret(int ), (int)105);
                }
                v7 = var0.method_7964();
                v8 /* !! */  = ee.cj;
                if (true) ** GOTO lbl75
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - ee.arew("armu", arfj(int ), (int)95));
lbl75:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1698821856: {
                            v9 = ee.arew("armv", arfj(int ), (int)96);
                            continue block41;
                        }
                        case -1495896537: {
                            break block41;
                        }
                        case 280511926: {
                            v9 = ee.arew("armw", arfj(int ), (int)97);
                            continue block41;
                        }
                    }
                    break;
                }
                v10 = v7.getString();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("armx", arfj(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ee.arew("army", aret(int ), (int)106)) break;
                    v11 /* !! */  = (long)ee.arew("armz", aret(int ), (int)107);
                }
                ee.info(v10);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ee.arew("arna", aret(int ), (int)108);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 1: {
                var2_2 /* !! */  = (int)ee.arew("arnb", aret(int ), (int)109);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl104:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ee.arew("arnc", aret(int ), (int)110);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 3: {
                var2_2 /* !! */  = (int)ee.arew("arnd", aret(int ), (int)111);
                if (!var3_1) break;
                throw null;
            }
lbl113:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ee.arew("arne", aret(int ), (int)112);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ee.arew("arnf", aret(int ), (int)113);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl121:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ee.arew("arng", aret(int ), (int)114);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl139
                    break;
                }
            }
lbl127:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ee.arew("arnh", aret(int ), (int)115);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
lbl131:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ee.arew("arni", aret(int ), (int)116);
                if (!var3_1) break;
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ee.arew("arnj", aret(int ), (int)117);
                if (!var3_1) break;
                throw null;
            }
lbl139:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ee.arew("arnk", aret(int ), (int)118);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
lbl143:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ee.arew("arnl", aret(int ), (int)119);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)ee.arew("arnm", aret(int ), (int)120);
        ** while (!var3_1)
lbl150:
        // 1 sources

        throw null;
    }

    static {
        areu = new int[636];
        arev = new int[636];
        ee.atdy();
        ee.atdz();
        ee.atea();
        ee.ateb();
        ee.atec();
        ee.ated();
        ee.atig();
        ee.atih();
        ee.atii();
        ee.atij();
        ee.atik();
        ee.atil();
        ee.atim();
        ee.atin();
        arfa = new long[253];
        arfb = new long[253];
        ee.atio();
        ee.atip();
        ee.atiq();
        ee.atir();
        ee.atis();
        ee.atit();
        BLACK_FILL = nd.rgba((int)ee.arew("atdc", aret(int ), (int)614), (int)ee.arew("atdd", aret(int ), (int)615), (int)ee.arew("atde", aret(int ), (int)616), (int)ee.arew("atdf", aret(int ), (int)617));
        BORDER_COLOR = nd.rgba((int)ee.arew("atdg", aret(int ), (int)618), (int)ee.arew("atdh", aret(int ), (int)619), (int)ee.arew("atdi", aret(int ), (int)620), (int)ee.arew("atdj", aret(int ), (int)621));
        CONTENT_BORDER_COLOR = nd.rgba((int)ee.arew("atdk", aret(int ), (int)622), (int)ee.arew("atdl", aret(int ), (int)623), (int)ee.arew("atdm", aret(int ), (int)624), (int)ee.arew("atdn", aret(int ), (int)625));
        TEXT_COLOR = nd.rgba((int)ee.arew("atdo", aret(int ), (int)626), (int)ee.arew("atdp", aret(int ), (int)627), (int)ee.arew("atdq", aret(int ), (int)628), (int)ee.arew("atdr", aret(int ), (int)629));
        MUTED_TEXT_COLOR = nd.rgba((int)ee.arew("atds", aret(int ), (int)630), (int)ee.arew("atdt", aret(int ), (int)631), (int)ee.arew("atdu", aret(int ), (int)632), (int)ee.arew("atdv", aret(int ), (int)633));
        TOASTS = new CopyOnWriteArrayList<ee$Toast>();
        UPDATE_SHOWN = new AtomicBoolean();
        CHAT_PREVIEW = new ee$Toast(ee$Type.INFO, List.of(new ee$TextPart("\u041e\u0431\u044b\u0447\u043d\u043e\u0435 \u0443\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0435", (boolean)ee.arew("atdw", aret(int ), (int)634))), (boolean)ee.arew("atdx", aret(int ), (int)635));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void updateRequired() {
        v0 /* !! */  = ee.cj;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(v1 - ee.arew("arnn", arfj(int ), (int)99));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1495896537: {
                    break block50;
                }
                case -444620571: {
                    v1 = ee.arew("arno", arfj(int ), (int)100);
                    continue block50;
                }
                case -321659639: {
                    v1 = ee.arew("arnp", arfj(int ), (int)101);
                    continue block50;
                }
                case 1642785781: {
                    v1 = ee.arew("arnq", arfj(int ), (int)102);
                    continue block50;
                }
            }
            break;
        }
        var2 = ee.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arnr", arfj(int ), (int)103)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ee.arew("arns", aret(int ), (int)121)) break;
            v2 /* !! */  = (long)ee.arew("arnt", aret(int ), (int)122);
        }
        var1_1 /* !! */  = ee.b;
        v3 /* !! */  = ee.cj;
        if (true) ** GOTO lbl28
        block52: while (true) {
            v3 /* !! */  = (long)(v4 - ee.arew("arnu", arfj(int ), (int)104));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1495896537: {
                    break block52;
                }
                case -357019452: {
                    v4 = ee.arew("arnv", arfj(int ), (int)105);
                    continue block52;
                }
                case 67099272: {
                    v4 = ee.arew("arnw", arfj(int ), (int)106);
                    continue block52;
                }
                case 1791160361: {
                    v4 = ee.arew("arnx", arfj(int ), (int)107);
                    continue block52;
                }
            }
            break;
        }
        var0_2 = ee.a;
        if (!var2) ** GOTO lbl47
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl47:
                // 1 sources

                if (var0_2 || var0_2) continue block53;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arny", arfj(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ee.arew("arnz", aret(int ), (int)123)) break;
                    v5 /* !! */  = (long)ee.arew("aroa", aret(int ), (int)124);
                }
                v6 = ee.arew("arob", aret(int ), (int)125);
                v7 = ee.arew("aroc", aret(int ), (int)126);
                v8 /* !! */  = ee.cj;
                if (true) ** GOTO lbl59
                block55: while (true) {
                    v8 /* !! */  = (long)(ee.arew("aroe", arfj(int ), (int)110) - ee.arew("arod", arfj(int ), (int)109));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1495896537: {
                            break block55;
                        }
                        case -803442573: {
                            continue block55;
                        }
                    }
                    break;
                }
                if (!ee.UPDATE_SHOWN.compareAndSet((boolean)v6, (boolean)v7)) {
                    if (var0_2) continue block53;
                    return;
                }
                if (var0_2 || var0_2) continue block53;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arof", arfj(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ee.arew("arog", aret(int ), (int)127)) break;
                    v9 /* !! */  = (long)ee.arew("aroh", aret(int ), (int)128);
                }
                v10 /* !! */  = ee.cj;
                if (true) ** GOTO lbl77
                block57: while (true) {
                    v10 /* !! */  = (long)(v11 - ee.arew("aroi", arfj(int ), (int)112));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1495896537: {
                            break block57;
                        }
                        case -584023266: {
                            v11 = ee.arew("aroj", arfj(int ), (int)113);
                            continue block57;
                        }
                        case -185532878: {
                            v11 = ee.arew("arok", arfj(int ), (int)114);
                            continue block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("arol", arfj(int ), (int)115)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ee.arew("arom", aret(int ), (int)129)) break;
                    v12 /* !! */  = (long)ee.arew("aron", aret(int ), (int)130);
                }
                v13 = ee.arew("aroo", aret(int ), (int)131);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("arop", arfj(int ), (int)116)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ee.arew("aroq", aret(int ), (int)132)) break;
                    v14 /* !! */  = (long)ee.arew("aror", aret(int ), (int)133);
                }
                v15 = new ee$TextPart("\u0414\u043e\u0441\u0442\u0443\u043f\u043d\u043e \u043d\u043e\u0432\u043e\u0435 \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435", (boolean)v13);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ee.cj - ee.arew("aros", arfj(int ), (int)117)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ee.arew("arot", aret(int ), (int)134)) break;
                    v16 /* !! */  = (long)ee.arew("arou", aret(int ), (int)135);
                }
                v17 = List.of(v15);
                v18 = ee.arew("arov", aret(int ), (int)136);
                v19 /* !! */  = ee.cj;
                if (true) ** GOTO lbl109
                block61: while (true) {
                    v19 /* !! */  = (long)(ee.arew("arox", arfj(int ), (int)119) - ee.arew("arow", arfj(int ), (int)118));
lbl109:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1495896537: {
                            break block61;
                        }
                        case 1999862354: {
                            continue block61;
                        }
                    }
                    break;
                }
                v20 = new ee$Toast(ee$Type.INFO, v17, (boolean)v18);
                v21 /* !! */  = ee.cj;
                if (true) ** GOTO lbl119
                block62: while (true) {
                    v21 /* !! */  = (long)(v22 - ee.arew("aroy", arfj(int ), (int)120));
lbl119:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1495896537: {
                            break block62;
                        }
                        case -57216054: {
                            v22 = ee.arew("aroz", arfj(int ), (int)121);
                            continue block62;
                        }
                        case 153511915: {
                            v22 = ee.arew("arpa", arfj(int ), (int)122);
                            continue block62;
                        }
                    }
                    break;
                }
                ee.updateToast = v20;
                if (var0_2 || var0_2) continue block53;
                v23 /* !! */  = ee.cj;
                if (true) ** GOTO lbl134
                block63: while (true) {
                    v23 /* !! */  = (long)(v24 - ee.arew("arpb", arfj(int ), (int)123));
lbl134:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2117248989: {
                            v24 = ee.arew("arpc", arfj(int ), (int)124);
                            continue block63;
                        }
                        case -2056522549: {
                            v24 = ee.arew("arpd", arfj(int ), (int)125);
                            continue block63;
                        }
                        case -1495896537: {
                            break block63;
                        }
                        case 1036323502: {
                            v24 = ee.arew("arpe", arfj(int ), (int)126);
                            continue block63;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_6 = ee.cj - ee.arew("arpf", arfj(int ), (int)127)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ee.arew("arpg", aret(int ), (int)137)) break;
                    v25 /* !! */  = (long)ee.arew("arph", aret(int ), (int)138);
                }
                ee.push(ee.updateToast);
                if (!var0_2 && !var0_2) ** break;
                continue block53;
                return;
lbl155:
                // 4 sources

                case 0: {
                    var1_1 /* !! */  = (int)ee.arew("arpi", aret(int ), (int)139);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)ee.arew("arpj", aret(int ), (int)140);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl170
                        break;
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)ee.arew("arpk", aret(int ), (int)141);
                    if (var2) {
                        throw null;
                    }
                }
lbl170:
                // 5 sources

                case 3: {
                    var1_1 /* !! */  = (int)ee.arew("arpl", aret(int ), (int)142);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
                case 4: {
                    var1_1 /* !! */  = (int)ee.arew("arpm", aret(int ), (int)143);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl200
                }
lbl180:
                // 2 sources

                case 5: {
                    var1_1 /* !! */  = (int)ee.arew("arpn", aret(int ), (int)144);
                    if (!var2) ** GOTO lbl155
                    throw null;
                }
                case 6: {
                    var1_1 /* !! */  = (int)ee.arew("arpo", aret(int ), (int)145);
                    if (var2) {
                        throw null;
                    }
                }
                case 7: {
                    var1_1 /* !! */  = (int)ee.arew("arpp", aret(int ), (int)146);
                    if (!var2) ** GOTO lbl155
                    throw null;
                }
                case 8: {
                    var1_1 /* !! */  = (int)ee.arew("arpq", aret(int ), (int)147);
                    if (var2) {
                        throw null;
                    }
                }
                case 9: {
                    var1_1 /* !! */  = (int)ee.arew("arpr", aret(int ), (int)148);
                    if (!var2) ** GOTO lbl170
                    throw null;
                }
lbl200:
                // 3 sources

                case 10: {
                    var1_1 /* !! */  = (int)ee.arew("arps", aret(int ), (int)149);
                    if (!var2) ** GOTO lbl155
                    throw null;
                }
                case 11: 
            }
        }
        var1_1 /* !! */  = (int)ee.arew("arpt", aret(int ), (int)150);
        ** while (!var2)
lbl207:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void drawDraggable(class_332 var1_1, int var2_2) {
        block185: {
            block184: {
                var25_3 = ee.c;
                var24_4 /* !! */  = ee.b;
                var23_5 = ee.a;
                if (var25_3) {
                    throw null;
lbl6:
                    // 48 sources

                    return;
                }
                if (var23_5 || var23_5) ** GOTO lbl6
                kq.hasFonts();
                if (var23_5 || var23_5) ** GOTO lbl6
                if (kv.INTER_SEMIBOLD == null) break block184;
                if (var23_5 || var23_5) ** GOTO lbl6
                v0 = kv.INTER_SEMIBOLD;
                if (var25_3) {
                    throw null;
                }
                break block185;
            }
            if (var23_5 || var23_5) ** GOTO lbl6
            v0 = var3_6 = kv.getDefault();
        }
        if (var23_5 || var23_5) ** GOTO lbl6
        if (kv.PHOBIA_NEW == null) ** GOTO lbl32
        if (var24_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var24_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var23_5 || var23_5) ** GOTO lbl6
                v1 = kv.PHOBIA_NEW;
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl34
            }
lbl32:
            // 1 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            v1 = var4_7 = kv.getDefault();
lbl34:
            // 2 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            var5_8 = System.currentTimeMillis();
            if (var23_5 || var23_5) ** GOTO lbl6
            if (!ee.TOASTS.isEmpty()) ** GOTO lbl45
            if (var23_5) ** GOTO lbl6
            if (!(this.mc.field_1755 instanceof class_408)) ** GOTO lbl45
            if (var23_5) ** GOTO lbl6
            v2 = ee.arew("arxt", aret(int ), (int)230);
            if (var25_3) {
                throw null;
            }
            ** GOTO lbl47
lbl45:
            // 2 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            v2 = var7_9 = ee.arew("arxw", aret(int ), (int)231);
lbl47:
            // 2 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            if (var7_9 == false) ** GOTO lbl54
            if (var23_5) ** GOTO lbl6
            v3 = List.of(ee.CHAT_PREVIEW);
            if (var25_3) {
                throw null;
            }
            ** GOTO lbl56
lbl54:
            // 1 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            v3 = var8_10 = List.copyOf(ee.TOASTS);
lbl56:
            // 2 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            var9_11 = (float)ki.getFixedScaledWidth() / Math.max((float)ee.arew("arxy", arxx(int ), (int)232), ki.getContextScale());
            if (var23_5 || var23_5) ** GOTO lbl6
            var10_12 = var9_11 * ee.arew("arxz", arxx(int ), (int)233);
            if (var23_5 || var23_5) ** GOTO lbl6
            var11_13 = this.getY();
            if (var23_5 || var23_5) ** GOTO lbl6
            var12_14 = 0.0f;
            if (var23_5 || var23_5) ** GOTO lbl6
            var13_15 = ee.arew("arya", aret(int ), (int)234);
            if (var23_5 || var23_5) ** GOTO lbl6
            var14_16 = var8_10.iterator();
            if (var23_5) ** GOTO lbl6
            do lbl-1000:
            // 4 sources

            {
                if (var23_5 || var23_5) ** GOTO lbl6
                if (!var14_16.hasNext()) ** GOTO lbl121
                if (var23_5) ** GOTO lbl6
                var15_17 = var14_16.next();
                if (var23_5 || var23_5) ** GOTO lbl6
                if (var7_9 == false) ** GOTO lbl81
                if (var23_5) ** GOTO lbl6
                v4 = 1.0f;
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl83
lbl81:
                // 1 sources

                if (var23_5 || var23_5) ** GOTO lbl6
                v4 = var16_18 = ee.presence(var15_17, var5_8);
lbl83:
                // 2 sources

                if (var23_5 || var23_5) ** GOTO lbl6
                if (var15_17.sticky) ** GOTO lbl93
                if (var23_5) ** GOTO lbl6
                if (var5_8 - var15_17.createdAt < ee.arew("aryd", arfj(int ), (int)177)) ** GOTO lbl93
                if (var23_5 || var23_5) ** GOTO lbl6
                ee.TOASTS.remove(var15_17);
                if (var23_5 || var23_5) ** GOTO lbl6
                if (!var25_3) ** GOTO lbl-1000
                throw null;
lbl93:
                // 2 sources

                if (var23_5 || var23_5) ** GOTO lbl6
                if (!(var16_18 <= ee.arew("aryh", arxx(int ), (int)235))) ** GOTO lbl98
                if (var23_5) ** GOTO lbl6
                if (!var25_3) ** GOTO lbl-1000
                throw null;
lbl98:
                // 1 sources

                if (var23_5 || var23_5) ** GOTO lbl6
                var17_19 = (float)var2_2 / ee.arew("arym", arxx(int ), (int)236) * ee.easeOutCubic(var16_18);
                if (var23_5 || var23_5) ** GOTO lbl6
                var18_20 = ee.textWidth(var3_6, var15_17.parts);
                if (var23_5 || var23_5) ** GOTO lbl6
                var19_21 = ee.arew("aryq", arxx(int ), (int)237) + var18_20 + ee.arew("arys", arxx(int ), (int)238);
                if (var23_5 || var23_5) ** GOTO lbl6
                var20_22 = ee.arew("aryu", arxx(int ), (int)239) + var19_21 + ee.arew("aryw", arxx(int ), (int)240);
                if (var23_5 || var23_5) ** GOTO lbl6
                var21_23 = var10_12 - var20_22 * ee.arew("aryx", arxx(int ), (int)241);
                if (var23_5 || var23_5) ** GOTO lbl6
                var22_24 = var11_13 - (1.0f - ee.easeOutCubic(var16_18)) * ee.arew("aryy", arxx(int ), (int)242);
                if (var23_5 || var23_5) ** GOTO lbl6
                ee.drawToast(var1_1, var21_23, var22_24, (float)var20_22, (float)var19_21, var15_17, var3_6, var4_7, var17_19);
                if (var23_5 || var23_5) ** GOTO lbl6
                var12_14 = Math.max(var12_14, (float)var20_22);
                if (var23_5 || var23_5) ** GOTO lbl6
                var11_13 += ee.arew("arzg", arxx(int ), (int)243);
                if (var23_5 || var23_5) ** GOTO lbl6
                ++var13_15;
                if (var23_5 || var23_5) ** GOTO lbl6
            } while (!var25_3);
            throw null;
lbl121:
            // 1 sources

            if (var23_5 || var23_5) ** GOTO lbl6
            this.setWidth((int)Math.ceil(Math.max(1.0f, var12_14)));
            if (var23_5 || var23_5) ** GOTO lbl6
            this.setHeight((int)Math.ceil(Math.max((float)ee.arew("arzl", arxx(int ), (int)244), (float)var13_15 * ee.arew("arzp", arxx(int ), (int)245) + (float)Math.max((int)ee.arew("arzq", aret(int ), (int)246), (int)(var13_15 - ee.arew("arzr", aret(int ), (int)247))) * ee.arew("arzt", arxx(int ), (int)248))));
            if (var23_5 || var23_5) ** GOTO lbl6
            super.setX(Math.round(var10_12 - (float)this.getWidth() * ee.arew("arzw", arxx(int ), (int)249)));
            if (!var23_5 && !var23_5) ** break;
            ** continue;
            return;
lbl130:
            // 3 sources

            case 0: {
                do {
                    var24_4 /* !! */  = (int)ee.arew("arzy", aret(int ), (int)250);
                } while (!var25_3);
                throw null;
            }
            case 1: {
                var24_4 /* !! */  = (int)ee.arew("asaa", aret(int ), (int)251);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 2: {
                var24_4 /* !! */  = (int)ee.arew("asac", aret(int ), (int)252);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl145:
            // 3 sources

            case 3: {
                var24_4 /* !! */  = (int)ee.arew("asad", aret(int ), (int)253);
                if (var25_3) {
                    throw null;
                }
            }
            case 4: {
                var24_4 /* !! */  = (int)ee.arew("asaf", aret(int ), (int)254);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl332
            }
            case 5: {
                var24_4 /* !! */  = (int)ee.arew("asah", aret(int ), (int)255);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl409
            }
            case 6: {
                var24_4 /* !! */  = (int)ee.arew("asaj", aret(int ), (int)256);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl164:
            // 3 sources

            case 7: {
                var24_4 /* !! */  = (int)ee.arew("asal", aret(int ), (int)257);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl169:
            // 2 sources

            case 8: {
                var24_4 /* !! */  = (int)ee.arew("asan", aret(int ), (int)258);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl174:
            // 2 sources

            case 9: {
                var24_4 /* !! */  = (int)ee.arew("asaq", aret(int ), (int)259);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl346
            }
            case 10: {
                var24_4 /* !! */  = (int)ee.arew("asas", aret(int ), (int)260);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 11: {
                var24_4 /* !! */  = (int)ee.arew("asat", aret(int ), (int)261);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 12: {
                var24_4 /* !! */  = (int)ee.arew("asau", aret(int ), (int)262);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl405
            }
            case 13: {
                var24_4 /* !! */  = (int)ee.arew("asaw", aret(int ), (int)263);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl379
            }
lbl199:
            // 3 sources

            case 14: {
                var24_4 /* !! */  = (int)ee.arew("asay", aret(int ), (int)264);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl204:
            // 2 sources

            case 15: {
                var24_4 /* !! */  = (int)ee.arew("asbb", aret(int ), (int)265);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl209:
            // 3 sources

            case 16: {
                var24_4 /* !! */  = (int)ee.arew("asbe", aret(int ), (int)266);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 17: {
                var24_4 /* !! */  = (int)ee.arew("asbf", aret(int ), (int)267);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl219:
            // 3 sources

            case 18: {
                var24_4 /* !! */  = (int)ee.arew("asmx", aret(int ), (int)268);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl486
            }
lbl224:
            // 2 sources

            case 19: {
                var24_4 /* !! */  = (int)ee.arew("asmy", aret(int ), (int)269);
                if (!var25_3) ** GOTO lbl169
                throw null;
            }
lbl228:
            // 3 sources

            case 20: {
                var24_4 /* !! */  = (int)ee.arew("asmz", aret(int ), (int)270);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 21: {
                var24_4 /* !! */  = (int)ee.arew("asna", aret(int ), (int)271);
                if (!var25_3) ** GOTO lbl199
                throw null;
            }
            case 22: {
                var24_4 /* !! */  = (int)ee.arew("asnb", aret(int ), (int)272);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl451
            }
lbl242:
            // 4 sources

            case 23: {
                var24_4 /* !! */  = (int)ee.arew("asnc", aret(int ), (int)273);
                if (!var25_3) break;
                throw null;
            }
            case 24: {
                var24_4 /* !! */  = (int)ee.arew("asnd", aret(int ), (int)274);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl417
            }
            case 25: {
                var24_4 /* !! */  = (int)ee.arew("asne", aret(int ), (int)275);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl256:
            // 3 sources

            case 26: {
                var24_4 /* !! */  = (int)ee.arew("asnf", aret(int ), (int)276);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl261:
            // 4 sources

            case 27: {
                var24_4 /* !! */  = (int)ee.arew("asng", aret(int ), (int)277);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl266:
            // 2 sources

            case 28: {
                var24_4 /* !! */  = (int)ee.arew("asnh", aret(int ), (int)278);
                if (!var25_3) ** GOTO lbl130
                throw null;
            }
lbl270:
            // 3 sources

            case 29: {
                var24_4 /* !! */  = (int)ee.arew("asni", aret(int ), (int)279);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl275:
            // 2 sources

            case 30: {
                var24_4 /* !! */  = (int)ee.arew("asnj", aret(int ), (int)280);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl409
            }
            case 31: {
                var24_4 /* !! */  = (int)ee.arew("asnk", aret(int ), (int)281);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 32: {
                var24_4 /* !! */  = (int)ee.arew("asnl", aret(int ), (int)282);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl486
            }
            case 33: {
                var24_4 /* !! */  = (int)ee.arew("asnm", aret(int ), (int)283);
                if (!var25_3) ** GOTO lbl164
                throw null;
            }
lbl294:
            // 2 sources

            case 34: {
                var24_4 /* !! */  = (int)ee.arew("asnn", aret(int ), (int)284);
                if (!var25_3) ** GOTO lbl209
                throw null;
            }
lbl298:
            // 5 sources

            case 35: {
                var24_4 /* !! */  = (int)ee.arew("asno", aret(int ), (int)285);
                if (!var25_3) ** GOTO lbl294
                throw null;
            }
lbl302:
            // 2 sources

            case 36: {
                var24_4 /* !! */  = (int)ee.arew("asnp", aret(int ), (int)286);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 37: {
                var24_4 /* !! */  = (int)ee.arew("asnq", aret(int ), (int)287);
                if (!var25_3) ** GOTO lbl261
                throw null;
            }
            case 38: {
                var24_4 /* !! */  = (int)ee.arew("asnr", aret(int ), (int)288);
                if (!var25_3) ** GOTO lbl228
                throw null;
            }
            case 39: {
                var24_4 /* !! */  = (int)ee.arew("asns", aret(int ), (int)289);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl401
            }
            case 40: {
                var24_4 /* !! */  = (int)ee.arew("asnt", aret(int ), (int)290);
                if (var25_3) {
                    throw null;
                }
            }
lbl324:
            // 4 sources

            case 41: {
                var24_4 /* !! */  = (int)ee.arew("asnu", aret(int ), (int)291);
                if (var25_3) {
                    throw null;
                }
            }
lbl328:
            // 5 sources

            case 42: {
                var24_4 /* !! */  = (int)ee.arew("asnv", aret(int ), (int)292);
                if (!var25_3) ** GOTO lbl228
                throw null;
            }
lbl332:
            // 3 sources

            case 43: {
                var24_4 /* !! */  = (int)ee.arew("asnw", aret(int ), (int)293);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl512
            }
            case 44: {
                var24_4 /* !! */  = (int)ee.arew("asnx", aret(int ), (int)294);
                if (!var25_3) ** GOTO lbl298
                throw null;
            }
lbl341:
            // 2 sources

            case 45: {
                var24_4 /* !! */  = (int)ee.arew("asny", aret(int ), (int)295);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl346:
            // 4 sources

            case 46: {
                var24_4 /* !! */  = (int)ee.arew("asnz", aret(int ), (int)296);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl351:
            // 2 sources

            case 47: {
                var24_4 /* !! */  = (int)ee.arew("asoa", aret(int ), (int)297);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl356:
            // 2 sources

            case 48: {
                var24_4 /* !! */  = (int)ee.arew("asob", aret(int ), (int)298);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl421
            }
lbl361:
            // 3 sources

            case 49: {
                var24_4 /* !! */  = (int)ee.arew("asoc", aret(int ), (int)299);
                if (!var25_3) ** GOTO lbl145
                throw null;
            }
lbl365:
            // 2 sources

            case 50: {
                var24_4 /* !! */  = (int)ee.arew("asod", aret(int ), (int)300);
                if (!var25_3) ** GOTO lbl351
                throw null;
            }
lbl369:
            // 3 sources

            case 51: {
                var24_4 /* !! */  = (int)ee.arew("asoe", aret(int ), (int)301);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl474
            }
lbl374:
            // 2 sources

            case 52: {
                var24_4 /* !! */  = (int)ee.arew("asof", aret(int ), (int)302);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl421
            }
lbl379:
            // 2 sources

            case 53: {
                var24_4 /* !! */  = (int)ee.arew("asog", aret(int ), (int)303);
                if (!var25_3) ** GOTO lbl270
                throw null;
            }
lbl383:
            // 2 sources

            case 54: {
                var24_4 /* !! */  = (int)ee.arew("asoh", aret(int ), (int)304);
                if (!var25_3) ** GOTO lbl204
                throw null;
            }
            case 55: {
                var24_4 /* !! */  = (int)ee.arew("asoi", aret(int ), (int)305);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl401
            }
            case 56: {
                var24_4 /* !! */  = (int)ee.arew("asoj", aret(int ), (int)306);
                if (!var25_3) ** GOTO lbl298
                throw null;
            }
lbl396:
            // 2 sources

            case 57: {
                var24_4 /* !! */  = (int)ee.arew("asok", aret(int ), (int)307);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl401:
            // 4 sources

            case 58: {
                var24_4 /* !! */  = (int)ee.arew("asol", aret(int ), (int)308);
                if (!var25_3) ** GOTO lbl199
                throw null;
            }
lbl405:
            // 2 sources

            case 59: {
                var24_4 /* !! */  = (int)ee.arew("asom", aret(int ), (int)309);
                if (!var25_3) ** GOTO lbl145
                throw null;
            }
lbl409:
            // 3 sources

            case 60: {
                var24_4 /* !! */  = (int)ee.arew("ason", aret(int ), (int)310);
                if (!var25_3) ** GOTO lbl256
                throw null;
            }
            case 61: {
                var24_4 /* !! */  = (int)ee.arew("asoo", aret(int ), (int)311);
                if (!var25_3) ** GOTO lbl332
                throw null;
            }
lbl417:
            // 5 sources

            case 62: {
                var24_4 /* !! */  = (int)ee.arew("asop", aret(int ), (int)312);
                if (!var25_3) ** GOTO lbl346
                throw null;
            }
lbl421:
            // 3 sources

            case 63: {
                var24_4 /* !! */  = (int)ee.arew("asoq", aret(int ), (int)313);
                if (!var25_3) ** GOTO lbl275
                throw null;
            }
            case 64: {
                var24_4 /* !! */  = (int)ee.arew("asor", aret(int ), (int)314);
                if (!var25_3) ** GOTO lbl328
                throw null;
            }
lbl429:
            // 2 sources

            case 65: {
                var24_4 /* !! */  = (int)ee.arew("asos", aret(int ), (int)315);
                if (!var25_3) ** GOTO lbl242
                throw null;
            }
lbl433:
            // 2 sources

            case 66: {
                var24_4 /* !! */  = (int)ee.arew("asot", aret(int ), (int)316);
                if (!var25_3) ** GOTO lbl396
                throw null;
            }
            case 67: {
                var24_4 /* !! */  = (int)ee.arew("asou", aret(int ), (int)317);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl541
            }
            case 68: {
                var24_4 /* !! */  = (int)ee.arew("asov", aret(int ), (int)318);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl508
            }
            case 69: {
                var24_4 /* !! */  = (int)ee.arew("asow", aret(int ), (int)319);
                if (!var25_3) ** GOTO lbl174
                throw null;
            }
lbl451:
            // 2 sources

            case 70: {
                var24_4 /* !! */  = (int)ee.arew("asox", aret(int ), (int)320);
                if (!var25_3) ** GOTO lbl256
                throw null;
            }
            case 71: {
                var24_4 /* !! */  = (int)ee.arew("asoy", aret(int ), (int)321);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl537
            }
lbl460:
            // 2 sources

            case 72: {
                var24_4 /* !! */  = (int)ee.arew("asoz", aret(int ), (int)322);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl541
            }
lbl465:
            // 2 sources

            case 73: {
                var24_4 /* !! */  = (int)ee.arew("aspa", aret(int ), (int)323);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl474
            }
            case 74: {
                var24_4 /* !! */  = (int)ee.arew("aspb", aret(int ), (int)324);
                if (!var25_3) ** GOTO lbl261
                throw null;
            }
lbl474:
            // 3 sources

            case 75: {
                var24_4 /* !! */  = (int)ee.arew("aspc", aret(int ), (int)325);
                if (!var25_3) ** GOTO lbl224
                throw null;
            }
            case 76: {
                var24_4 /* !! */  = (int)ee.arew("aspd", aret(int ), (int)326);
                if (!var25_3) ** GOTO lbl328
                throw null;
            }
lbl482:
            // 2 sources

            case 77: {
                var24_4 /* !! */  = (int)ee.arew("aspe", aret(int ), (int)327);
                if (!var25_3) ** GOTO lbl361
                throw null;
            }
lbl486:
            // 3 sources

            case 78: {
                do {
                    var24_4 /* !! */  = (int)ee.arew("aspf", aret(int ), (int)328);
                } while (!var25_3);
                throw null;
            }
            case 79: {
                var24_4 /* !! */  = (int)ee.arew("aspg", aret(int ), (int)329);
                if (var25_3) {
                    throw null;
                }
                ** GOTO lbl516
            }
            case 80: {
                var24_4 /* !! */  = (int)ee.arew("asph", aret(int ), (int)330);
                if (!var25_3) ** GOTO lbl369
                throw null;
            }
            case 81: {
                var24_4 /* !! */  = (int)ee.arew("aspi", aret(int ), (int)331);
                if (!var25_3) ** GOTO lbl242
                throw null;
            }
            case 82: {
                var24_4 /* !! */  = (int)ee.arew("aspj", aret(int ), (int)332);
                if (!var25_3) ** GOTO lbl465
                throw null;
            }
lbl508:
            // 2 sources

            case 83: {
                var24_4 /* !! */  = (int)ee.arew("aspk", aret(int ), (int)333);
                if (!var25_3) ** GOTO lbl482
                throw null;
            }
lbl512:
            // 3 sources

            case 84: {
                var24_4 /* !! */  = (int)ee.arew("aspl", aret(int ), (int)334);
                if (!var25_3) ** GOTO lbl130
                throw null;
            }
lbl516:
            // 2 sources

            case 85: {
                var24_4 /* !! */  = (int)ee.arew("aspm", aret(int ), (int)335);
                if (!var25_3) ** GOTO lbl417
                throw null;
            }
lbl520:
            // 3 sources

            case 86: {
                var24_4 /* !! */  = (int)ee.arew("aspn", aret(int ), (int)336);
                if (!var25_3) ** GOTO lbl242
                throw null;
            }
            case 87: {
                var24_4 /* !! */  = (int)ee.arew("aspo", aret(int ), (int)337);
                if (!var25_3) ** GOTO lbl520
                throw null;
            }
            case 88: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var24_4 /* !! */  = (int)ee.arew("aspp", aret(int ), (int)338);
                    if (!var25_3) ** GOTO lbl417
                    throw null;
                }
            }
            case 89: {
                var24_4 /* !! */  = (int)ee.arew("aspq", aret(int ), (int)339);
                if (!var25_3) ** GOTO lbl261
                throw null;
            }
lbl537:
            // 2 sources

            case 90: {
                var24_4 /* !! */  = (int)ee.arew("aspr", aret(int ), (int)340);
                if (!var25_3) ** GOTO lbl520
                throw null;
            }
lbl541:
            // 3 sources

            case 91: {
                var24_4 /* !! */  = (int)ee.arew("asps", aret(int ), (int)341);
                if (!var25_3) ** GOTO lbl302
                throw null;
            }
            case 92: {
                var24_4 /* !! */  = (int)ee.arew("aspt", aret(int ), (int)342);
                if (!var25_3) ** GOTO lbl512
                throw null;
            }
            case 93: 
        }
        var24_4 /* !! */  = (int)ee.arew("aspu", aret(int ), (int)343);
        ** while (!var25_3)
lbl552:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float easeOutCubic(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("atbw", arfj(int ), (int)240)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ee.arew("atbx", aret(int ), (int)595)) break;
            v0 /* !! */  = (long)ee.arew("atby", aret(int ), (int)596);
        }
        var4_1 = ee.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("atbz", arfj(int ), (int)241)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ee.arew("atca", aret(int ), (int)597)) break;
            v1 /* !! */  = (long)ee.arew("atcb", aret(int ), (int)598);
        }
        var3_2 /* !! */  = ee.b;
        v2 /* !! */  = ee.cj;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(ee.arew("atcd", arfj(int ), (int)243) - ee.arew("atcc", arfj(int ), (int)242));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1775872247: {
                    continue block18;
                }
                case -1495896537: {
                    break block18;
                }
            }
            break;
        }
        var2_3 = ee.a;
        if (var4_1) {
            throw null;
lbl27:
            // 3 sources

            return (float)ee.arew("atce", arxx(int ), (int)599);
        }
        if (var2_3) ** GOTO lbl27
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl27
                v3 /* !! */  = ee.cj;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v3 /* !! */  = (long)(ee.arew("atcg", arfj(int ), (int)245) - ee.arew("atcf", arfj(int ), (int)244));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1495896537: {
                            break block20;
                        }
                        case -662132572: {
                            continue block20;
                        }
                    }
                    break;
                }
                var1_4 = 1.0f - class_3532.method_15363((float)var0, (float)0.0f, (float)1.0f);
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return 1.0f - var1_4 * var1_4 * var1_4;
            }
lbl47:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)ee.arew("atch", aret(int ), (int)600);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)ee.arew("atci", aret(int ), (int)601);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 2: {
                var3_2 /* !! */  = (int)ee.arew("atcj", aret(int ), (int)602);
                if (!var4_1) ** GOTO lbl47
                throw null;
            }
lbl61:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)ee.arew("atck", aret(int ), (int)603);
                if (var4_1) {
                    throw null;
                }
            }
            case 4: {
                do {
                    var3_2 /* !! */  = (int)ee.arew("atcl", aret(int ), (int)604);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)ee.arew("atcm", aret(int ), (int)605);
        ** while (!var4_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long arfj(int n2) {
        return arfa[n2] ^ arfb[n2];
    }

    private static /* synthetic */ void atdy() {
        ee.areu[0] = -1660675502;
        ee.areu[1] = -1530335997;
        ee.areu[2] = -2129689836;
        ee.areu[3] = -1200016696;
        ee.areu[4] = 684973288;
        ee.areu[5] = -257537706;
        ee.areu[6] = 717598205;
        ee.areu[7] = 1858575040;
        ee.areu[8] = 1479517907;
        ee.areu[9] = 1946419336;
        ee.areu[10] = 901354575;
        ee.areu[11] = 872316939;
        ee.areu[12] = 1530416589;
        ee.areu[13] = 264152271;
        ee.areu[14] = 2070142510;
        ee.areu[15] = -759653292;
        ee.areu[16] = 1379449288;
        ee.areu[17] = -1324229634;
        ee.areu[18] = 710643210;
        ee.areu[19] = -1181078113;
        ee.areu[20] = 179083583;
        ee.areu[21] = 1943739109;
        ee.areu[22] = 797245865;
        ee.areu[23] = -775925789;
        ee.areu[24] = 1071858047;
        ee.areu[25] = -1885935174;
        ee.areu[26] = -902211085;
        ee.areu[27] = 681035390;
        ee.areu[28] = 1340434732;
        ee.areu[29] = -230745487;
        ee.areu[30] = -1680882219;
        ee.areu[31] = 689579397;
        ee.areu[32] = 1580314830;
        ee.areu[33] = -13601046;
        ee.areu[34] = 718354491;
        ee.areu[35] = -715027821;
        ee.areu[36] = 2046587878;
        ee.areu[37] = 870882856;
        ee.areu[38] = 1788299090;
        ee.areu[39] = 2051979410;
        ee.areu[40] = 685273762;
        ee.areu[41] = -1369865100;
        ee.areu[42] = -1169190246;
        ee.areu[43] = -387368978;
        ee.areu[44] = -1113976424;
        ee.areu[45] = -972578864;
        ee.areu[46] = -491863903;
        ee.areu[47] = -330309922;
        ee.areu[48] = 441938280;
        ee.areu[49] = -2024621640;
        ee.areu[50] = -1715951642;
        ee.areu[51] = -532107958;
        ee.areu[52] = -1099541707;
        ee.areu[53] = 1861666875;
        ee.areu[54] = -1995612370;
        ee.areu[55] = 1698987524;
        ee.areu[56] = -920527992;
        ee.areu[57] = 1798908903;
        ee.areu[58] = -808188649;
        ee.areu[59] = 899711161;
        ee.areu[60] = 1151736207;
        ee.areu[61] = 1040457073;
        ee.areu[62] = -658882307;
        ee.areu[63] = 14702322;
        ee.areu[64] = 709719102;
        ee.areu[65] = 306819667;
        ee.areu[66] = -469941193;
        ee.areu[67] = -1862425033;
        ee.areu[68] = 286420881;
        ee.areu[69] = -389186272;
        ee.areu[70] = 1831554969;
        ee.areu[71] = -2136392085;
        ee.areu[72] = 139559246;
        ee.areu[73] = 1122806548;
        ee.areu[74] = -58052408;
        ee.areu[75] = -1544311161;
        ee.areu[76] = -118785763;
        ee.areu[77] = -841947838;
        ee.areu[78] = 810265558;
        ee.areu[79] = -402890123;
        ee.areu[80] = 2057453251;
        ee.areu[81] = -1616461445;
        ee.areu[82] = -1938031286;
        ee.areu[83] = -110819286;
        ee.areu[84] = -1012664065;
        ee.areu[85] = 1932688610;
        ee.areu[86] = -327462965;
        ee.areu[87] = 258408473;
        ee.areu[88] = -808394482;
        ee.areu[89] = -836773780;
        ee.areu[90] = -934889705;
        ee.areu[91] = -433962249;
        ee.areu[92] = -116333894;
        ee.areu[93] = -278523261;
        ee.areu[94] = -939679760;
        ee.areu[95] = 1187313933;
        ee.areu[96] = 570900619;
        ee.areu[97] = 761280074;
        ee.areu[98] = 1518418842;
        ee.areu[99] = -1610461120;
    }

    private static /* synthetic */ void atik() {
        ee.arev[300] = 497877006;
        ee.arev[301] = 717622377;
        ee.arev[302] = -1957578711;
        ee.arev[303] = 244047070;
        ee.arev[304] = 580688358;
        ee.arev[305] = -831063852;
        ee.arev[306] = -1947050172;
        ee.arev[307] = 160545566;
        ee.arev[308] = 1581152139;
        ee.arev[309] = -85520317;
        ee.arev[310] = -1005776670;
        ee.arev[311] = 865351909;
        ee.arev[312] = 1095025893;
        ee.arev[313] = 1139110723;
        ee.arev[314] = -1130867641;
        ee.arev[315] = -1118651571;
        ee.arev[316] = 1223495892;
        ee.arev[317] = 816259805;
        ee.arev[318] = 1556879937;
        ee.arev[319] = -906854379;
        ee.arev[320] = 257997228;
        ee.arev[321] = 1765107190;
        ee.arev[322] = -1586839358;
        ee.arev[323] = -1229186139;
        ee.arev[324] = -1169478432;
        ee.arev[325] = -1684889351;
        ee.arev[326] = 1247689645;
        ee.arev[327] = -1255910577;
        ee.arev[328] = -1285034500;
        ee.arev[329] = -1419607118;
        ee.arev[330] = 1153332980;
        ee.arev[331] = 1846663127;
        ee.arev[332] = 1014339800;
        ee.arev[333] = 609005949;
        ee.arev[334] = 991118818;
        ee.arev[335] = 610640948;
        ee.arev[336] = -48606454;
        ee.arev[337] = 287262623;
        ee.arev[338] = -805997643;
        ee.arev[339] = 14943384;
        ee.arev[340] = -1592172388;
        ee.arev[341] = -1440160269;
        ee.arev[342] = -313013905;
        ee.arev[343] = -1493661266;
        ee.arev[344] = 1996541950;
        ee.arev[345] = 177741256;
        ee.arev[346] = -1376117523;
        ee.arev[347] = 951020578;
        ee.arev[348] = 1718710589;
        ee.arev[349] = -1322751223;
        ee.arev[350] = 1947581752;
        ee.arev[351] = -1662835611;
        ee.arev[352] = -1466790795;
        ee.arev[353] = -901571681;
        ee.arev[354] = 292802586;
        ee.arev[355] = 1162164913;
        ee.arev[356] = 1080429444;
        ee.arev[357] = -1824732910;
        ee.arev[358] = -1626114828;
        ee.arev[359] = 919966539;
        ee.arev[360] = 180947712;
        ee.arev[361] = -440514442;
        ee.arev[362] = -24198962;
        ee.arev[363] = -1765033209;
        ee.arev[364] = 1513621098;
        ee.arev[365] = -1577962364;
        ee.arev[366] = -1966413904;
        ee.arev[367] = 472512529;
        ee.arev[368] = -533916765;
        ee.arev[369] = 469661190;
        ee.arev[370] = 1500587823;
        ee.arev[371] = 728376041;
        ee.arev[372] = 1214374302;
        ee.arev[373] = 1742958200;
        ee.arev[374] = -1871493558;
        ee.arev[375] = -97481809;
        ee.arev[376] = 2024173142;
        ee.arev[377] = -1001346836;
        ee.arev[378] = -1011368330;
        ee.arev[379] = 1425108896;
        ee.arev[380] = 764979202;
        ee.arev[381] = 60372270;
        ee.arev[382] = 1815536118;
        ee.arev[383] = -1271282976;
        ee.arev[384] = 1754819976;
        ee.arev[385] = -1745874649;
        ee.arev[386] = 1150522224;
        ee.arev[387] = 1930711673;
        ee.arev[388] = 1226220078;
        ee.arev[389] = 1740063878;
        ee.arev[390] = 1959748285;
        ee.arev[391] = -1475312989;
        ee.arev[392] = -501921641;
        ee.arev[393] = 1043501724;
        ee.arev[394] = -798809344;
        ee.arev[395] = 1593847109;
        ee.arev[396] = -6694676;
        ee.arev[397] = 647554695;
        ee.arev[398] = 755125753;
        ee.arev[399] = 2127979708;
    }

    private static /* synthetic */ void atiq() {
        ee.arfa[200] = -7344128248364091934L;
        ee.arfa[201] = -6665711088041089215L;
        ee.arfa[202] = -8939324452133466145L;
        ee.arfa[203] = 2242795361256013827L;
        ee.arfa[204] = 958356088517129114L;
        ee.arfa[205] = 3809275966572275625L;
        ee.arfa[206] = 6848309567320421961L;
        ee.arfa[207] = 2314295134324774221L;
        ee.arfa[208] = -539635835464436822L;
        ee.arfa[209] = 2917484159274975192L;
        ee.arfa[210] = 3671392586985543791L;
        ee.arfa[211] = 8310088547759241830L;
        ee.arfa[212] = -1712765462023481649L;
        ee.arfa[213] = -3192770055418171523L;
        ee.arfa[214] = 6675893849811978672L;
        ee.arfa[215] = -7894417485301994069L;
        ee.arfa[216] = 7564932549527884950L;
        ee.arfa[217] = -7092406940092443479L;
        ee.arfa[218] = -3097773111390155854L;
        ee.arfa[219] = 5527787350806356947L;
        ee.arfa[220] = 7142954862323123084L;
        ee.arfa[221] = 4734988560979328704L;
        ee.arfa[222] = 190865077472777008L;
        ee.arfa[223] = -204043899110318258L;
        ee.arfa[224] = 6732843854357509402L;
        ee.arfa[225] = -971765647617520626L;
        ee.arfa[226] = -1696532711923530971L;
        ee.arfa[227] = 5201844218685484331L;
        ee.arfa[228] = 1554115310250773399L;
        ee.arfa[229] = -6222175278588510201L;
        ee.arfa[230] = 6998041508791500062L;
        ee.arfa[231] = -1931784853921210945L;
        ee.arfa[232] = 3829702742605984739L;
        ee.arfa[233] = 390307550049235889L;
        ee.arfa[234] = -1451827061098006200L;
        ee.arfa[235] = -8892786099641778589L;
        ee.arfa[236] = 8846914772015377442L;
        ee.arfa[237] = -1417045045555785373L;
        ee.arfa[238] = -6478040314974475641L;
        ee.arfa[239] = -778350176988827982L;
        ee.arfa[240] = 6396004399323184806L;
        ee.arfa[241] = 528032397885713934L;
        ee.arfa[242] = 8366553044079690987L;
        ee.arfa[243] = 3447065970139351658L;
        ee.arfa[244] = -6859976093222345648L;
        ee.arfa[245] = -6719274210553150138L;
        ee.arfa[246] = -116232548306663872L;
        ee.arfa[247] = -3685193350810724220L;
        ee.arfa[248] = 7054754563733369860L;
        ee.arfa[249] = 5394148437555160915L;
        ee.arfa[250] = 3159932992793151767L;
        ee.arfa[251] = 8808976362738134591L;
        ee.arfa[252] = 7789533011642125986L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float textWidth(ks var0, List<ee$TextPart> var1_1) {
        block56: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("astn", arfj(int ), (int)178)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ee.arew("asto", aret(int ), (int)440)) break;
                v0 /* !! */  = (long)ee.arew("astp", aret(int ), (int)441);
            }
            var7_2 = ee.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("astq", arfj(int ), (int)179)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ee.arew("astr", aret(int ), (int)442)) break;
                v1 /* !! */  = (long)ee.arew("asts", aret(int ), (int)443);
            }
            var6_3 /* !! */  = ee.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("astt", arfj(int ), (int)180)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ee.arew("astu", aret(int ), (int)444)) break;
                v2 /* !! */  = (long)ee.arew("astv", aret(int ), (int)445);
            }
            var5_4 = ee.a;
            if (var7_2) {
                throw null;
lbl21:
                // 9 sources

                return (float)ee.arew("astw", arxx(int ), (int)446);
            }
            if (var5_4 || var5_4) ** GOTO lbl21
            var2_5 = 0.0f;
            if (var5_4 || var5_4) ** GOTO lbl21
            v3 /* !! */  = ee.cj;
            if (true) ** GOTO lbl30
            block34: while (true) {
                v3 /* !! */  = (long)(v4 - ee.arew("astx", arfj(int ), (int)181));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1890134531: {
                        v4 = ee.arew("asty", arfj(int ), (int)182);
                        continue block34;
                    }
                    case -1495896537: {
                        break block34;
                    }
                    case 645519892: {
                        v4 = ee.arew("astz", arfj(int ), (int)183);
                        continue block34;
                    }
                    case 936605206: {
                        v4 = ee.arew("asua", arfj(int ), (int)184);
                        continue block34;
                    }
                }
                break;
            }
            var3_6 = var1_1.iterator();
            if (var5_4) ** GOTO lbl21
            do {
                if (var5_4 || var5_4) ** GOTO lbl21
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("asub", arfj(int ), (int)185)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ee.arew("asuc", aret(int ), (int)447)) break;
                    v5 /* !! */  = (long)ee.arew("asud", aret(int ), (int)448);
                }
                if (!var3_6.hasNext()) break block56;
                if (var5_4) ** GOTO lbl21
                v6 /* !! */  = ee.cj;
                if (true) ** GOTO lbl57
                block37: while (true) {
                    v6 /* !! */  = (long)(v7 - ee.arew("asue", arfj(int ), (int)186));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1495896537: {
                            break block37;
                        }
                        case -1431400928: {
                            v7 = ee.arew("asuf", arfj(int ), (int)187);
                            continue block37;
                        }
                        case 349254634: {
                            v7 = ee.arew("asug", arfj(int ), (int)188);
                            continue block37;
                        }
                    }
                    break;
                }
                var4_7 = var3_6.next();
                if (var5_4 || var5_4) ** GOTO lbl21
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("asuh", arfj(int ), (int)189)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ee.arew("asui", aret(int ), (int)449)) break;
                    v8 /* !! */  = (long)ee.arew("asuj", aret(int ), (int)450);
                }
                v9 = var4_7.text();
                v10 = ee.arew("asuk", arxx(int ), (int)451);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = ee.cj - ee.arew("asul", arfj(int ), (int)190)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ee.arew("asum", aret(int ), (int)452)) break;
                    v11 /* !! */  = (long)ee.arew("asun", aret(int ), (int)453);
                }
                var2_5 += kq.width(var0, v9, (float)v10);
                if (var5_4 || var5_4) ** GOTO lbl21
            } while (!var7_2);
            throw null;
        }
        if (var5_4) ** GOTO lbl21
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_4) ** break;
                ** continue;
                return var2_5;
            }
lbl92:
            // 2 sources

            case 0: {
                var6_3 /* !! */  = (int)ee.arew("asuo", aret(int ), (int)454);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl97:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)ee.arew("asup", aret(int ), (int)455);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl102:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)ee.arew("asuq", aret(int ), (int)456);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 3: {
                var6_3 /* !! */  = (int)ee.arew("asur", aret(int ), (int)457);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 4: {
                var6_3 /* !! */  = (int)ee.arew("asus", aret(int ), (int)458);
                if (!var7_2) ** GOTO lbl97
                throw null;
            }
lbl116:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)ee.arew("asut", aret(int ), (int)459);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 6: {
                var6_3 /* !! */  = (int)ee.arew("asuu", aret(int ), (int)460);
                if (!var7_2) ** GOTO lbl92
                throw null;
            }
            case 7: {
                var6_3 /* !! */  = (int)ee.arew("asuv", aret(int ), (int)461);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 8: {
                var6_3 /* !! */  = (int)ee.arew("asuw", aret(int ), (int)462);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl135:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)ee.arew("asux", aret(int ), (int)463);
                if (!var7_2) ** GOTO lbl97
                throw null;
            }
lbl139:
            // 5 sources

            case 10: {
                var6_3 /* !! */  = (int)ee.arew("asuy", aret(int ), (int)464);
                if (!var7_2) ** GOTO lbl135
                throw null;
            }
lbl143:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)ee.arew("asuz", aret(int ), (int)465);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 12: {
                var6_3 /* !! */  = (int)ee.arew("asva", aret(int ), (int)466);
                if (!var7_2) ** GOTO lbl143
                throw null;
            }
lbl152:
            // 3 sources

            case 13: {
                var6_3 /* !! */  = (int)ee.arew("asvb", aret(int ), (int)467);
                if (!var7_2) ** GOTO lbl102
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)ee.arew("asvc", aret(int ), (int)468);
                if (!var7_2) ** GOTO lbl143
                throw null;
            }
lbl160:
            // 3 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)ee.arew("asvd", aret(int ), (int)469);
                    if (!var7_2) ** GOTO lbl152
                    throw null;
                }
            }
            case 16: 
        }
        var6_3 /* !! */  = (int)ee.arew("asve", aret(int ), (int)470);
        ** while (!var7_2)
lbl168:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void atil() {
        ee.arev[400] = -1372436904;
        ee.arev[401] = 1099816338;
        ee.arev[402] = -975124325;
        ee.arev[403] = 1298734810;
        ee.arev[404] = 1941989306;
        ee.arev[405] = 1371476955;
        ee.arev[406] = 1287118043;
        ee.arev[407] = 1316228144;
        ee.arev[408] = 1002878870;
        ee.arev[409] = -638118090;
        ee.arev[410] = 1614838986;
        ee.arev[411] = -1134878832;
        ee.arev[412] = -307454133;
        ee.arev[413] = -541973423;
        ee.arev[414] = -1666833691;
        ee.arev[415] = 1678739917;
        ee.arev[416] = -669007477;
        ee.arev[417] = 1197412888;
        ee.arev[418] = -287906900;
        ee.arev[419] = -1704841788;
        ee.arev[420] = -1524959226;
        ee.arev[421] = -46592165;
        ee.arev[422] = -1530231696;
        ee.arev[423] = -331689825;
        ee.arev[424] = 1836251240;
        ee.arev[425] = 1296897709;
        ee.arev[426] = 1545841521;
        ee.arev[427] = 886803032;
        ee.arev[428] = -61614970;
        ee.arev[429] = -1459078003;
        ee.arev[430] = 992705832;
        ee.arev[431] = -775144836;
        ee.arev[432] = 303679955;
        ee.arev[433] = -1092994101;
        ee.arev[434] = 794376928;
        ee.arev[435] = -1551760079;
        ee.arev[436] = -576515048;
        ee.arev[437] = -79043548;
        ee.arev[438] = 1973204618;
        ee.arev[439] = -1735189382;
        ee.arev[440] = -1128550446;
        ee.arev[441] = 1468488120;
        ee.arev[442] = 1585409645;
        ee.arev[443] = -1386583181;
        ee.arev[444] = -1435423308;
        ee.arev[445] = 751606618;
        ee.arev[446] = -1932801996;
        ee.arev[447] = 134385051;
        ee.arev[448] = -1649413958;
        ee.arev[449] = 955980639;
        ee.arev[450] = 715309941;
        ee.arev[451] = -1745125406;
        ee.arev[452] = -1916926220;
        ee.arev[453] = 1604263452;
        ee.arev[454] = 1470601475;
        ee.arev[455] = 85350485;
        ee.arev[456] = 311849586;
        ee.arev[457] = -30904829;
        ee.arev[458] = 663126496;
        ee.arev[459] = 356628297;
        ee.arev[460] = 1447396662;
        ee.arev[461] = 64788900;
        ee.arev[462] = -413157028;
        ee.arev[463] = -1405218131;
        ee.arev[464] = 496814769;
        ee.arev[465] = -2133719011;
        ee.arev[466] = -854631520;
        ee.arev[467] = 790912197;
        ee.arev[468] = 553708497;
        ee.arev[469] = 1949840992;
        ee.arev[470] = -723025482;
        ee.arev[471] = 926799925;
        ee.arev[472] = -284825543;
        ee.arev[473] = -2058779259;
        ee.arev[474] = 500223308;
        ee.arev[475] = 1941534676;
        ee.arev[476] = 1687108045;
        ee.arev[477] = 526141962;
        ee.arev[478] = 796295908;
        ee.arev[479] = -73196529;
        ee.arev[480] = 1398097614;
        ee.arev[481] = 1616084103;
        ee.arev[482] = 948537112;
        ee.arev[483] = -1176647875;
        ee.arev[484] = -1507608721;
        ee.arev[485] = 1104212594;
        ee.arev[486] = -2106010035;
        ee.arev[487] = -1451469610;
        ee.arev[488] = -367018314;
        ee.arev[489] = 1782018334;
        ee.arev[490] = 1653146245;
        ee.arev[491] = -154814310;
        ee.arev[492] = -1495471333;
        ee.arev[493] = -337334087;
        ee.arev[494] = 1089740238;
        ee.arev[495] = 141845143;
        ee.arev[496] = 1944898811;
        ee.arev[497] = 1710558571;
        ee.arev[498] = 2124277483;
        ee.arev[499] = 1286585851;
    }

    private static /* synthetic */ void atig() {
        ee.areu[600] = -1941817406;
        ee.areu[601] = -391265320;
        ee.areu[602] = -119861595;
        ee.areu[603] = -1219022914;
        ee.areu[604] = -1903343698;
        ee.areu[605] = -104354685;
        ee.areu[606] = -278443259;
        ee.areu[607] = 1599198354;
        ee.areu[608] = 1549303984;
        ee.areu[609] = 1566877491;
        ee.areu[610] = -1432588673;
        ee.areu[611] = 98024521;
        ee.areu[612] = 98969607;
        ee.areu[613] = 18912623;
        ee.areu[614] = 1810681368;
        ee.areu[615] = 1270537133;
        ee.areu[616] = -98884145;
        ee.areu[617] = -1620600016;
        ee.areu[618] = 879691661;
        ee.areu[619] = -1819708508;
        ee.areu[620] = 2112663672;
        ee.areu[621] = -1407438533;
        ee.areu[622] = 789300273;
        ee.areu[623] = -1089990040;
        ee.areu[624] = 407020353;
        ee.areu[625] = -343718095;
        ee.areu[626] = 523192252;
        ee.areu[627] = -780737230;
        ee.areu[628] = -342220495;
        ee.areu[629] = -2062499208;
        ee.areu[630] = 2042344459;
        ee.areu[631] = 1894758991;
        ee.areu[632] = 1274392527;
        ee.areu[633] = -1667197574;
        ee.areu[634] = -1793747324;
        ee.areu[635] = -748838233;
    }

    private static /* synthetic */ void atih() {
        ee.arev[0] = -1660675500;
        ee.arev[1] = -1530335937;
        ee.arev[2] = -2129689835;
        ee.arev[3] = -1200016693;
        ee.arev[4] = 684973290;
        ee.arev[5] = -257537707;
        ee.arev[6] = 717598207;
        ee.arev[7] = 1858575041;
        ee.arev[8] = 814109405;
        ee.arev[9] = 1946419337;
        ee.arev[10] = 2082961594;
        ee.arev[11] = 872316938;
        ee.arev[12] = 1530416589;
        ee.arev[13] = 264152269;
        ee.arev[14] = 2070142510;
        ee.arev[15] = -759653291;
        ee.arev[16] = -1707636812;
        ee.arev[17] = -1324229633;
        ee.arev[18] = -86108292;
        ee.arev[19] = -1181078114;
        ee.arev[20] = 498827655;
        ee.arev[21] = 1943739108;
        ee.arev[22] = -1464998885;
        ee.arev[23] = -775925790;
        ee.arev[24] = -41002662;
        ee.arev[25] = -1885935174;
        ee.arev[26] = -902211086;
        ee.arev[27] = -2034215273;
        ee.arev[28] = 1340434733;
        ee.arev[29] = -1873523208;
        ee.arev[30] = -1680882219;
        ee.arev[31] = 689579405;
        ee.arev[32] = 1580314824;
        ee.arev[33] = -13601045;
        ee.arev[34] = 718354480;
        ee.arev[35] = -715027822;
        ee.arev[36] = 2046587886;
        ee.arev[37] = 870882863;
        ee.arev[38] = 1788299096;
        ee.arev[39] = 2051979419;
        ee.arev[40] = 685273763;
        ee.arev[41] = -1369865097;
        ee.arev[42] = -1169190244;
        ee.arev[43] = -387368987;
        ee.arev[44] = -1113976423;
        ee.arev[45] = 1970574098;
        ee.arev[46] = -491863904;
        ee.arev[47] = 264252785;
        ee.arev[48] = 441938281;
        ee.arev[49] = -1497165274;
        ee.arev[50] = -1715951641;
        ee.arev[51] = -548163269;
        ee.arev[52] = -1099541707;
        ee.arev[53] = 1861666874;
        ee.arev[54] = -1995612369;
        ee.arev[55] = 267123273;
        ee.arev[56] = -920527992;
        ee.arev[57] = 1798908902;
        ee.arev[58] = 766680131;
        ee.arev[59] = 899711160;
        ee.arev[60] = 287147568;
        ee.arev[61] = 1040457073;
        ee.arev[62] = -658882307;
        ee.arev[63] = 14702323;
        ee.arev[64] = 709719100;
        ee.arev[65] = 306819671;
        ee.arev[66] = -469941198;
        ee.arev[67] = -1862425030;
        ee.arev[68] = 286420893;
        ee.arev[69] = -389186261;
        ee.arev[70] = 1831554964;
        ee.arev[71] = -2136392091;
        ee.arev[72] = 139559242;
        ee.arev[73] = 1122806549;
        ee.arev[74] = -58052415;
        ee.arev[75] = -1544311165;
        ee.arev[76] = -118785764;
        ee.arev[77] = -374728670;
        ee.arev[78] = 810265559;
        ee.arev[79] = -380462374;
        ee.arev[80] = 2057453251;
        ee.arev[81] = -1616461446;
        ee.arev[82] = 1935470396;
        ee.arev[83] = -110819285;
        ee.arev[84] = -1012664065;
        ee.arev[85] = 1932688611;
        ee.arev[86] = 2031047314;
        ee.arev[87] = 258408473;
        ee.arev[88] = -808394488;
        ee.arev[89] = -836773791;
        ee.arev[90] = -934889701;
        ee.arev[91] = -433962245;
        ee.arev[92] = -116333893;
        ee.arev[93] = -278523256;
        ee.arev[94] = -939679756;
        ee.arev[95] = 1187313925;
        ee.arev[96] = 570900608;
        ee.arev[97] = 761280072;
        ee.arev[98] = 1518418833;
        ee.arev[99] = -1610461119;
    }

    private static /* synthetic */ void ated() {
        ee.areu[500] = -813547381;
        ee.areu[501] = -922562041;
        ee.areu[502] = 702816925;
        ee.areu[503] = 335696422;
        ee.areu[504] = -819366066;
        ee.areu[505] = 725309135;
        ee.areu[506] = 665384087;
        ee.areu[507] = 916824338;
        ee.areu[508] = -1888936625;
        ee.areu[509] = -504349051;
        ee.areu[510] = 638493969;
        ee.areu[511] = 670369830;
        ee.areu[512] = 267974377;
        ee.areu[513] = 1258626332;
        ee.areu[514] = -1803410809;
        ee.areu[515] = 24033009;
        ee.areu[516] = 1219009708;
        ee.areu[517] = 1903029642;
        ee.areu[518] = 1966790112;
        ee.areu[519] = -223888308;
        ee.areu[520] = 2089880425;
        ee.areu[521] = 1951725899;
        ee.areu[522] = -542401806;
        ee.areu[523] = -2040237793;
        ee.areu[524] = -2086470939;
        ee.areu[525] = -1966795195;
        ee.areu[526] = -422972911;
        ee.areu[527] = 676774529;
        ee.areu[528] = -582012803;
        ee.areu[529] = 203382499;
        ee.areu[530] = 919453857;
        ee.areu[531] = -820502153;
        ee.areu[532] = -1322958915;
        ee.areu[533] = 1148307611;
        ee.areu[534] = -1520619349;
        ee.areu[535] = 722278486;
        ee.areu[536] = -283611065;
        ee.areu[537] = 87440399;
        ee.areu[538] = 1916634869;
        ee.areu[539] = 154980210;
        ee.areu[540] = -1984293;
        ee.areu[541] = -1537731384;
        ee.areu[542] = -1846475119;
        ee.areu[543] = -451297791;
        ee.areu[544] = -185216359;
        ee.areu[545] = -2015835050;
        ee.areu[546] = -1632718567;
        ee.areu[547] = 1994388450;
        ee.areu[548] = 355953399;
        ee.areu[549] = -50329595;
        ee.areu[550] = -2115198054;
        ee.areu[551] = 523297678;
        ee.areu[552] = 1955329777;
        ee.areu[553] = -831431930;
        ee.areu[554] = 2139626099;
        ee.areu[555] = 899777846;
        ee.areu[556] = 552390240;
        ee.areu[557] = 1616334086;
        ee.areu[558] = 164466931;
        ee.areu[559] = 363299960;
        ee.areu[560] = -1472513680;
        ee.areu[561] = -1941211715;
        ee.areu[562] = 1785207429;
        ee.areu[563] = 1116582089;
        ee.areu[564] = 814968531;
        ee.areu[565] = -1337064750;
        ee.areu[566] = 735907498;
        ee.areu[567] = 257257080;
        ee.areu[568] = -587890743;
        ee.areu[569] = 620386840;
        ee.areu[570] = 2021752191;
        ee.areu[571] = 1707598831;
        ee.areu[572] = 365222504;
        ee.areu[573] = 1637171458;
        ee.areu[574] = 324216853;
        ee.areu[575] = 1989822918;
        ee.areu[576] = -1316704762;
        ee.areu[577] = -171852378;
        ee.areu[578] = -383984097;
        ee.areu[579] = -1363708774;
        ee.areu[580] = 1571690060;
        ee.areu[581] = 843884180;
        ee.areu[582] = 1271165843;
        ee.areu[583] = 268742738;
        ee.areu[584] = -2121842562;
        ee.areu[585] = 1123660325;
        ee.areu[586] = 1594088954;
        ee.areu[587] = 2085070512;
        ee.areu[588] = -886527904;
        ee.areu[589] = 756425006;
        ee.areu[590] = -2107780327;
        ee.areu[591] = 1402895190;
        ee.areu[592] = 2134564838;
        ee.areu[593] = -1115414116;
        ee.areu[594] = 1391180025;
        ee.areu[595] = -2021430076;
        ee.areu[596] = -905194526;
        ee.areu[597] = -134551499;
        ee.areu[598] = -1741372336;
        ee.areu[599] = -1992193142;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawContentBackground(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("asyp", arfj(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ee.arew("asyq", aret(int ), (int)542)) break;
            v0 /* !! */  = (long)ee.arew("asyr", aret(int ), (int)543);
        }
        var7_5 = ee.c;
        v1 /* !! */  = ee.cj;
        if (true) ** GOTO lbl11
        block30: while (true) {
            v1 /* !! */  = (long)(ee.arew("asyt", arfj(int ), (int)210) - ee.arew("asys", arfj(int ), (int)209));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1495896537: {
                    break block30;
                }
                case 1459611805: {
                    continue block30;
                }
            }
            break;
        }
        var6_6 /* !! */  = ee.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("asyu", arfj(int ), (int)211)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ee.arew("asyv", aret(int ), (int)544)) break;
            v2 /* !! */  = (long)ee.arew("asyw", aret(int ), (int)545);
        }
        var5_7 = ee.a;
        if (var7_5) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var5_7 || var5_7) ** GOTO lbl25
        v3 = ee.arew("asyx", arxx(int ), (int)546);
        v4 = ee.arew("asyy", arxx(int ), (int)547);
        v5 = ee.arew("asyz", aret(int ), (int)548);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("asza", arfj(int ), (int)212)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ee.arew("aszb", aret(int ), (int)549)) break;
            v6 /* !! */  = (long)ee.arew("aszc", aret(int ), (int)550);
        }
        v7 = dz.color((int)v5);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("aszd", arfj(int ), (int)213)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ee.arew("asze", aret(int ), (int)551)) break;
            v8 /* !! */  = (long)ee.arew("aszf", aret(int ), (int)552);
        }
        v9 = nd.multAlpha(v7, var4_4);
        v10 = ee.arew("aszg", aret(int ), (int)553);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("aszh", arfj(int ), (int)214)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ee.arew("aszi", aret(int ), (int)554)) break;
            v11 /* !! */  = (long)ee.arew("aszj", aret(int ), (int)555);
        }
        ki.rect(var0, var1_1, var2_2, var3_3, (float)v3, (float)v4, v9, (boolean)v10);
        if (var5_7 || var5_7) ** GOTO lbl25
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v12 = ee.arew("aszk", arxx(int ), (int)556);
                v13 = ee.arew("aszl", arxx(int ), (int)557);
                v14 = ee.arew("aszm", arxx(int ), (int)558);
                v15 /* !! */  = ee.cj;
                if (true) ** GOTO lbl61
                block36: while (true) {
                    v15 /* !! */  = (long)(v16 - ee.arew("aszn", arfj(int ), (int)215));
lbl61:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1495896537: {
                            break block36;
                        }
                        case 1027355225: {
                            v16 = ee.arew("aszo", arfj(int ), (int)216);
                            continue block36;
                        }
                        case 1199456981: {
                            v16 = ee.arew("aszp", arfj(int ), (int)217);
                            continue block36;
                        }
                    }
                    break;
                }
                v17 /* !! */  = ee.cj;
                if (true) ** GOTO lbl74
                block37: while (true) {
                    v17 /* !! */  = (long)(v18 - ee.arew("aszq", arfj(int ), (int)218));
lbl74:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1495896537: {
                            break block37;
                        }
                        case -249432529: {
                            v18 = ee.arew("aszr", arfj(int ), (int)219);
                            continue block37;
                        }
                        case 1602589613: {
                            v18 = ee.arew("aszs", arfj(int ), (int)220);
                            continue block37;
                        }
                    }
                    break;
                }
                v19 = nd.multAlpha(ee.CONTENT_BORDER_COLOR, var4_4);
                v20 = ee.arew("aszt", aret(int ), (int)559);
                v21 /* !! */  = ee.cj;
                if (true) ** GOTO lbl89
                block38: while (true) {
                    v21 /* !! */  = (long)(v22 - ee.arew("aszu", arfj(int ), (int)221));
lbl89:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1495896537: {
                            break block38;
                        }
                        case -1418883215: {
                            v22 = ee.arew("aszv", arfj(int ), (int)222);
                            continue block38;
                        }
                        case -559379313: {
                            v22 = ee.arew("aszw", arfj(int ), (int)223);
                            continue block38;
                        }
                    }
                    break;
                }
                ki.outline(var0, var1_1, var2_2, var3_3, (float)v12, (float)v13, (float)v14, v19, (boolean)v20);
                if (var5_7 || var5_7) ** continue;
                return;
            }
            case 0: {
                var6_6 /* !! */  = (int)ee.arew("aszx", aret(int ), (int)560);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 1: {
                var6_6 /* !! */  = (int)ee.arew("aszy", aret(int ), (int)561);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl111:
            // 3 sources

            case 2: {
                var6_6 /* !! */  = (int)ee.arew("aszz", aret(int ), (int)562);
                if (!var7_5) break;
                throw null;
            }
lbl115:
            // 2 sources

            case 3: {
                var6_6 /* !! */  = (int)ee.arew("ataa", aret(int ), (int)563);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl120:
            // 2 sources

            case 4: {
                var6_6 /* !! */  = (int)ee.arew("atab", aret(int ), (int)564);
                if (!var7_5) ** GOTO lbl111
                throw null;
            }
lbl124:
            // 2 sources

            case 5: {
                var6_6 /* !! */  = (int)ee.arew("atac", aret(int ), (int)565);
                if (!var7_5) break;
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)ee.arew("atad", aret(int ), (int)566);
                    if (!var7_5) ** GOTO lbl120
                    throw null;
                }
            }
            case 7: 
        }
        var6_6 /* !! */  = (int)ee.arew("atae", aret(int ), (int)567);
        ** while (!var7_5)
lbl136:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void atec() {
        ee.areu[400] = -1372436900;
        ee.areu[401] = 1099816341;
        ee.areu[402] = -975124322;
        ee.areu[403] = 1298734793;
        ee.areu[404] = 1941989372;
        ee.areu[405] = 1371476930;
        ee.areu[406] = 1287118037;
        ee.areu[407] = 1316228135;
        ee.areu[408] = 1002878932;
        ee.areu[409] = -638118124;
        ee.areu[410] = 1614838982;
        ee.areu[411] = -1134878808;
        ee.areu[412] = -307454109;
        ee.areu[413] = -541973414;
        ee.areu[414] = -1666833701;
        ee.areu[415] = 1678739950;
        ee.areu[416] = -669007452;
        ee.areu[417] = 1197412917;
        ee.areu[418] = -287906923;
        ee.areu[419] = -1704841856;
        ee.areu[420] = -1524959210;
        ee.areu[421] = -46592164;
        ee.areu[422] = -1530231682;
        ee.areu[423] = -331689853;
        ee.areu[424] = 1836251216;
        ee.areu[425] = 1296897694;
        ee.areu[426] = 1545841529;
        ee.areu[427] = 886803057;
        ee.areu[428] = -61614931;
        ee.areu[429] = -1459077998;
        ee.areu[430] = 992705812;
        ee.areu[431] = -775144854;
        ee.areu[432] = 303679891;
        ee.areu[433] = -1092994071;
        ee.areu[434] = 794376918;
        ee.areu[435] = -1551760120;
        ee.areu[436] = -576515054;
        ee.areu[437] = -79043540;
        ee.areu[438] = 1973204629;
        ee.areu[439] = -1735189430;
        ee.areu[440] = -1128550445;
        ee.areu[441] = 436072466;
        ee.areu[442] = 1585409644;
        ee.areu[443] = -1792179025;
        ee.areu[444] = -1435423307;
        ee.areu[445] = -698784280;
        ee.areu[446] = -1302725076;
        ee.areu[447] = 134385050;
        ee.areu[448] = -1269304533;
        ee.areu[449] = 955980638;
        ee.areu[450] = -1610780915;
        ee.areu[451] = -688165724;
        ee.areu[452] = -1916926219;
        ee.areu[453] = -1224363845;
        ee.areu[454] = 1470601474;
        ee.areu[455] = 85350480;
        ee.areu[456] = 311849598;
        ee.areu[457] = -30904822;
        ee.areu[458] = 663126512;
        ee.areu[459] = 356628299;
        ee.areu[460] = 1447396657;
        ee.areu[461] = 64788903;
        ee.areu[462] = -413157037;
        ee.areu[463] = -1405218131;
        ee.areu[464] = 496814779;
        ee.areu[465] = -2133719019;
        ee.areu[466] = -854631506;
        ee.areu[467] = 790912205;
        ee.areu[468] = 553708501;
        ee.areu[469] = 1949841001;
        ee.areu[470] = -723025475;
        ee.areu[471] = 926799924;
        ee.areu[472] = 1084856776;
        ee.areu[473] = -2058779260;
        ee.areu[474] = 504710601;
        ee.areu[475] = 1941534677;
        ee.areu[476] = 1993921419;
        ee.areu[477] = 554006526;
        ee.areu[478] = 276202212;
        ee.areu[479] = -73196481;
        ee.areu[480] = 1398097615;
        ee.areu[481] = -28226460;
        ee.areu[482] = 948537113;
        ee.areu[483] = 1922141422;
        ee.areu[484] = -1725712529;
        ee.areu[485] = 1104212595;
        ee.areu[486] = -422680090;
        ee.areu[487] = -1451469609;
        ee.areu[488] = 322337921;
        ee.areu[489] = 1429696798;
        ee.areu[490] = 1653146247;
        ee.areu[491] = -154814313;
        ee.areu[492] = -1495471333;
        ee.areu[493] = -337334084;
        ee.areu[494] = 1089740228;
        ee.areu[495] = 141845147;
        ee.areu[496] = 1944898801;
        ee.areu[497] = 1710558573;
        ee.areu[498] = 2124277478;
        ee.areu[499] = 1286585842;
    }

    private static /* synthetic */ void atip() {
        ee.arfa[100] = -123720716836358705L;
        ee.arfa[101] = 6059968166195711369L;
        ee.arfa[102] = -4445508844716075369L;
        ee.arfa[103] = -3036153582939473604L;
        ee.arfa[104] = -1410552120796709538L;
        ee.arfa[105] = 1600238525873311265L;
        ee.arfa[106] = 2272691020472776499L;
        ee.arfa[107] = -8242090287134573138L;
        ee.arfa[108] = 2343920515976318280L;
        ee.arfa[109] = -5898732987791839761L;
        ee.arfa[110] = 5261495308278659287L;
        ee.arfa[111] = 141312524291878795L;
        ee.arfa[112] = -6288005914316070777L;
        ee.arfa[113] = -8106958814472998782L;
        ee.arfa[114] = 1286271868468790874L;
        ee.arfa[115] = -8344549296077225258L;
        ee.arfa[116] = -9154655330526028481L;
        ee.arfa[117] = -6348292061564759645L;
        ee.arfa[118] = -1985251845866251296L;
        ee.arfa[119] = 8204942603076437493L;
        ee.arfa[120] = -8624005950451996713L;
        ee.arfa[121] = -7703727581404133776L;
        ee.arfa[122] = 2354141953581052779L;
        ee.arfa[123] = 8928553340206683760L;
        ee.arfa[124] = 7227540870068931823L;
        ee.arfa[125] = 3426244806362379004L;
        ee.arfa[126] = -1708853176513223054L;
        ee.arfa[127] = -9162893363338494869L;
        ee.arfa[128] = -8332603631633527376L;
        ee.arfa[129] = 5542918486560560027L;
        ee.arfa[130] = -3782853184665816728L;
        ee.arfa[131] = 8268694654536130412L;
        ee.arfa[132] = 1859230372416565254L;
        ee.arfa[133] = 7363478568821734531L;
        ee.arfa[134] = -7099963589624513887L;
        ee.arfa[135] = 8149076363687241808L;
        ee.arfa[136] = 3781993065091767855L;
        ee.arfa[137] = -3906851678604827132L;
        ee.arfa[138] = 3906010771897791039L;
        ee.arfa[139] = 341160678433139154L;
        ee.arfa[140] = 2562581543277002595L;
        ee.arfa[141] = 7268011905260718137L;
        ee.arfa[142] = -196038928174034540L;
        ee.arfa[143] = -8915994643525519482L;
        ee.arfa[144] = 1993840974016744570L;
        ee.arfa[145] = 7787751830986593275L;
        ee.arfa[146] = -5587580693451507692L;
        ee.arfa[147] = 6285957848179969577L;
        ee.arfa[148] = 7332945145723737715L;
        ee.arfa[149] = 5837474128254739223L;
        ee.arfa[150] = 5988176406656386050L;
        ee.arfa[151] = 6550725858079191435L;
        ee.arfa[152] = 4569373733927739401L;
        ee.arfa[153] = -2023567534484499365L;
        ee.arfa[154] = -2374921253597250034L;
        ee.arfa[155] = -5308404084523292491L;
        ee.arfa[156] = 6704083403758236894L;
        ee.arfa[157] = -673753066970607329L;
        ee.arfa[158] = -1346521852977992181L;
        ee.arfa[159] = 6356799863442938183L;
        ee.arfa[160] = 8086114280012344814L;
        ee.arfa[161] = 8498343817078611976L;
        ee.arfa[162] = -6305737322163838717L;
        ee.arfa[163] = 8640320845498645681L;
        ee.arfa[164] = -5296001608492849177L;
        ee.arfa[165] = 6490555533727404823L;
        ee.arfa[166] = -6861182255190980730L;
        ee.arfa[167] = 5347642046475317910L;
        ee.arfa[168] = -9108528902080308737L;
        ee.arfa[169] = 1977559882653970817L;
        ee.arfa[170] = 7623050532745821609L;
        ee.arfa[171] = 4433712080977911474L;
        ee.arfa[172] = -5314817664683702141L;
        ee.arfa[173] = -379573461979887147L;
        ee.arfa[174] = -4563170542633008655L;
        ee.arfa[175] = 2163418144345673294L;
        ee.arfa[176] = -1453649400381751730L;
        ee.arfa[177] = -9160140880393287999L;
        ee.arfa[178] = -5757756978370664717L;
        ee.arfa[179] = 7109130975349053745L;
        ee.arfa[180] = -6032416450415698032L;
        ee.arfa[181] = 7431366591130074986L;
        ee.arfa[182] = -155196329429581703L;
        ee.arfa[183] = -1169885964612170908L;
        ee.arfa[184] = 7473125309419824016L;
        ee.arfa[185] = 1115231408952081754L;
        ee.arfa[186] = 1779245535327234150L;
        ee.arfa[187] = -5760147681734151213L;
        ee.arfa[188] = -1211434374521666595L;
        ee.arfa[189] = -7437888846959310732L;
        ee.arfa[190] = -6670388152187986394L;
        ee.arfa[191] = 3082882703114370254L;
        ee.arfa[192] = -2096241262159383750L;
        ee.arfa[193] = 4188898926421050723L;
        ee.arfa[194] = -831825741728393947L;
        ee.arfa[195] = -6476587891665691819L;
        ee.arfa[196] = 973604896094680314L;
        ee.arfa[197] = -612572375716645523L;
        ee.arfa[198] = 7391046813097697504L;
        ee.arfa[199] = -1629869805749228830L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void clearUpdateRequired() {
        block28: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arpu", arfj(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ee.arew("arpv", aret(int ), (int)151)) break;
                v0 /* !! */  = (long)ee.arew("arpw", aret(int ), (int)152);
            }
            var3 = ee.c;
            v1 /* !! */  = ee.cj;
            if (true) ** GOTO lbl11
            block18: while (true) {
                v1 /* !! */  = (long)(ee.arew("arpy", arfj(int ), (int)130) - ee.arew("arpx", arfj(int ), (int)129));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1495896537: {
                        break block18;
                    }
                    case 870858077: {
                        continue block18;
                    }
                }
                break;
            }
            var2_1 = ee.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arpz", arfj(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ee.arew("arqa", aret(int ), (int)153)) break;
                v2 /* !! */  = (long)ee.arew("arqb", aret(int ), (int)154);
            }
            var1_2 = ee.a;
            if (var3) {
                throw null;
lbl25:
                // 7 sources

                return;
            }
            if (var1_2 || var1_2) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arqc", arfj(int ), (int)132)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ee.arew("arqd", aret(int ), (int)155)) break;
                v3 /* !! */  = (long)ee.arew("arqe", aret(int ), (int)156);
            }
            v4 = ee.arew("arqf", aret(int ), (int)157);
            v5 /* !! */  = ee.cj;
            if (true) ** GOTO lbl38
            block22: while (true) {
                v5 /* !! */  = (long)(ee.arew("arqh", arfj(int ), (int)134) - ee.arew("arqg", arfj(int ), (int)133));
lbl38:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1495896537: {
                        break block22;
                    }
                    case -1083362852: {
                        continue block22;
                    }
                }
                break;
            }
            ee.UPDATE_SHOWN.set((boolean)v4);
            if (var1_2 || var1_2) ** GOTO lbl25
            v6 /* !! */  = ee.cj;
            if (true) ** GOTO lbl49
            block23: while (true) {
                v6 /* !! */  = (long)(ee.arew("arqj", arfj(int ), (int)136) - ee.arew("arqi", arfj(int ), (int)135));
lbl49:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1711539833: {
                        continue block23;
                    }
                    case -1495896537: {
                        break block23;
                    }
                }
                break;
            }
            var0_3 = ee.updateToast;
            if (var1_2 || var1_2) ** GOTO lbl25
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("arqk", arfj(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ee.arew("arql", aret(int ), (int)158)) break;
                v7 /* !! */  = (long)ee.arew("arqm", aret(int ), (int)159);
            }
            ee.updateToast = null;
            if (var1_2 || var1_2) ** GOTO lbl25
            if (var0_3 == null) break block28;
            if (var1_2) ** GOTO lbl25
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("arqn", arfj(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ee.arew("arqo", aret(int ), (int)160)) break;
                v8 /* !! */  = (long)ee.arew("arqp", aret(int ), (int)161);
            }
            v9 /* !! */  = ee.cj;
            if (true) ** GOTO lbl74
            block26: while (true) {
                v9 /* !! */  = (long)(v10 - ee.arew("arqq", arfj(int ), (int)139));
lbl74:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1495896537: {
                        break block26;
                    }
                    case -185377989: {
                        v10 = ee.arew("arqr", arfj(int ), (int)140);
                        continue block26;
                    }
                    case 1274556074: {
                        v10 = ee.arew("arqs", arfj(int ), (int)141);
                        continue block26;
                    }
                }
                break;
            }
            ee.TOASTS.remove(var0_3);
            if (var1_2) ** GOTO lbl25
        }
        if (!var1_2 && !var1_2) ** break;
        ** while (true)
    }

    private static /* synthetic */ double arez(int n2) {
        return Double.longBitsToDouble(arfa[n2] ^ arfb[n2]);
    }

    private static /* synthetic */ void atin() {
        ee.arev[600] = -1941817402;
        ee.arev[601] = -391265316;
        ee.arev[602] = -119861599;
        ee.arev[603] = -1219022918;
        ee.arev[604] = -1903343698;
        ee.arev[605] = -104354687;
        ee.arev[606] = -278443260;
        ee.arev[607] = -146475917;
        ee.arev[608] = 1636914248;
        ee.arev[609] = 495872307;
        ee.arev[610] = -1432588674;
        ee.arev[611] = 98024521;
        ee.arev[612] = 98969604;
        ee.arev[613] = 18912623;
        ee.arev[614] = 1810681368;
        ee.arev[615] = 1270537133;
        ee.arev[616] = -98884145;
        ee.arev[617] = -1620599857;
        ee.arev[618] = 879691634;
        ee.arev[619] = -1819708581;
        ee.arev[620] = 2112663687;
        ee.arev[621] = -1407438538;
        ee.arev[622] = 789300430;
        ee.arev[623] = -1089989993;
        ee.arev[624] = 407020478;
        ee.arev[625] = -343718092;
        ee.arev[626] = 523192131;
        ee.arev[627] = -780737075;
        ee.arev[628] = -342220338;
        ee.arev[629] = -2062499193;
        ee.arev[630] = 2042344692;
        ee.arev[631] = 1894759088;
        ee.arev[632] = 1274392368;
        ee.arev[633] = -1667197469;
        ee.arev[634] = -1793747324;
        ee.arev[635] = -748838234;
    }

    private static /* synthetic */ void atis() {
        ee.arfb[100] = -7967101023816219872L;
        ee.arfb[101] = 6338991333630835225L;
        ee.arfb[102] = 8300892440456454160L;
        ee.arfb[103] = 8072138154702594719L;
        ee.arfb[104] = -3654430564126036230L;
        ee.arfb[105] = 933730308586945509L;
        ee.arfb[106] = 2406770117731555509L;
        ee.arfb[107] = 2395688602737279466L;
        ee.arfb[108] = -4455711039366476746L;
        ee.arfb[109] = -7060218816246530344L;
        ee.arfb[110] = 1004766934283329540L;
        ee.arfb[111] = -6085019232193505467L;
        ee.arfb[112] = 3888205644976195915L;
        ee.arfb[113] = -8042168784589944046L;
        ee.arfb[114] = -5139898260490434730L;
        ee.arfb[115] = 3060544994012797268L;
        ee.arfb[116] = -2944480049906637988L;
        ee.arfb[117] = 6003204057575695455L;
        ee.arfb[118] = -7968229417030783899L;
        ee.arfb[119] = -2163800713163789136L;
        ee.arfb[120] = -1595468930708277842L;
        ee.arfb[121] = -7883070366328238142L;
        ee.arfb[122] = -5279297613255979551L;
        ee.arfb[123] = 7405441284367186813L;
        ee.arfb[124] = -1552059997737904442L;
        ee.arfb[125] = -8849614781343580389L;
        ee.arfb[126] = -7599143915535386462L;
        ee.arfb[127] = -3589151013779791530L;
        ee.arfb[128] = -1235561030968972727L;
        ee.arfb[129] = -7086962958290611666L;
        ee.arfb[130] = 2172544428963955281L;
        ee.arfb[131] = -3315521611050944588L;
        ee.arfb[132] = -5846937044883308835L;
        ee.arfb[133] = -8148483087709872893L;
        ee.arfb[134] = -1488049304816944481L;
        ee.arfb[135] = -8958262456525232205L;
        ee.arfb[136] = 1505565294653341286L;
        ee.arfb[137] = -2007071339129552670L;
        ee.arfb[138] = 2119369755266117064L;
        ee.arfb[139] = 1070886302478468399L;
        ee.arfb[140] = 4393647892218892774L;
        ee.arfb[141] = -3862691066095628714L;
        ee.arfb[142] = 1554603678192010370L;
        ee.arfb[143] = 5285241795848466767L;
        ee.arfb[144] = -3937290719563849427L;
        ee.arfb[145] = 3106019999611518999L;
        ee.arfb[146] = -3408764348862227925L;
        ee.arfb[147] = 6501279481292537832L;
        ee.arfb[148] = -5759961317990298778L;
        ee.arfb[149] = 2753039837078432096L;
        ee.arfb[150] = -8203285067680281163L;
        ee.arfb[151] = -3446894229587929549L;
        ee.arfb[152] = -8212552309247339917L;
        ee.arfb[153] = 2060265161714246916L;
        ee.arfb[154] = -8838597571192645581L;
        ee.arfb[155] = 8150664867289407025L;
        ee.arfb[156] = -4482496828635567876L;
        ee.arfb[157] = 8592899890952582975L;
        ee.arfb[158] = 2675491680318885479L;
        ee.arfb[159] = 8120229310052507039L;
        ee.arfb[160] = -3364402538601973010L;
        ee.arfb[161] = 723060334978541071L;
        ee.arfb[162] = 3012280962325527293L;
        ee.arfb[163] = -7621781691791371487L;
        ee.arfb[164] = -1224549437260028122L;
        ee.arfb[165] = -2481833058709678181L;
        ee.arfb[166] = 2622178253668493727L;
        ee.arfb[167] = 2075354930852649939L;
        ee.arfb[168] = 3356739453735475314L;
        ee.arfb[169] = -7545986552208880613L;
        ee.arfb[170] = 3419044486118571070L;
        ee.arfb[171] = -488408028249402076L;
        ee.arfb[172] = -4933285369542492183L;
        ee.arfb[173] = -7500016189288913655L;
        ee.arfb[174] = -3931793651107562981L;
        ee.arfb[175] = 7595484162035471091L;
        ee.arfb[176] = 6434548370641876L;
        ee.arfb[177] = -9160140880393286559L;
        ee.arfb[178] = 5395232518478712623L;
        ee.arfb[179] = -5170284931529441411L;
        ee.arfb[180] = 2444716994271333882L;
        ee.arfb[181] = 4796273787437395318L;
        ee.arfb[182] = -6851258678241501155L;
        ee.arfb[183] = 8536693147824913417L;
        ee.arfb[184] = -2590781414989631137L;
        ee.arfb[185] = -4517445091910300254L;
        ee.arfb[186] = 2091273557666624742L;
        ee.arfb[187] = -791535430126814240L;
        ee.arfb[188] = 2709356465745940672L;
        ee.arfb[189] = 5073324576606678376L;
        ee.arfb[190] = 5572496487791702455L;
        ee.arfb[191] = 8919878660787536278L;
        ee.arfb[192] = -1158144709687116572L;
        ee.arfb[193] = -3982261459590891621L;
        ee.arfb[194] = -2044588285989082960L;
        ee.arfb[195] = 1159474803802882163L;
        ee.arfb[196] = 9060452788278421422L;
        ee.arfb[197] = 3820989066444633183L;
        ee.arfb[198] = 5754601358297384198L;
        ee.arfb[199] = 8909483576477995282L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean visible() {
        block55: {
            block54: {
                v0 /* !! */  = ee.cj;
                if (true) ** GOTO lbl5
                block31: while (true) {
                    v0 /* !! */  = (long)(ee.arew("arul", arfj(int ), (int)160) - ee.arew("aruk", arfj(int ), (int)159));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1495896537: {
                            break block31;
                        }
                        case -338655110: {
                            continue block31;
                        }
                    }
                    break;
                }
                var3_1 = ee.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arum", arfj(int ), (int)161)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == ee.arew("arun", aret(int ), (int)202)) break;
                    v1 /* !! */  = (long)ee.arew("aruo", aret(int ), (int)203);
                }
                var2_2 /* !! */  = ee.b;
                v2 /* !! */  = ee.cj;
                if (true) ** GOTO lbl22
                block33: while (true) {
                    v2 /* !! */  = (long)(v3 - ee.arew("arup", arfj(int ), (int)162));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1495896537: {
                            break block33;
                        }
                        case 547629200: {
                            v3 = ee.arew("aruq", arfj(int ), (int)163);
                            continue block33;
                        }
                        case 1592349828: {
                            v3 = ee.arew("arus", arfj(int ), (int)164);
                            continue block33;
                        }
                    }
                    break;
                }
                var1_3 = ee.a;
                if (var3_1) {
                    throw null;
lbl34:
                    // 6 sources

                    return (boolean)ee.arew("arut", aret(int ), (int)204);
                }
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 /* !! */  = ee.cj;
                if (true) ** GOTO lbl41
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - ee.arew("aruu", arfj(int ), (int)165));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1725827561: {
                            v5 = ee.arew("aruw", arfj(int ), (int)166);
                            continue block35;
                        }
                        case -1495896537: {
                            break block35;
                        }
                        case -77749494: {
                            v5 = ee.arew("aruy", arfj(int ), (int)167);
                            continue block35;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("aruz", arfj(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ee.arew("arva", aret(int ), (int)205)) break;
                    v6 /* !! */  = (long)ee.arew("arvg", aret(int ), (int)206);
                }
                if (!ee.TOASTS.isEmpty()) break block54;
                if (var1_3) ** GOTO lbl34
                v7 /* !! */  = ee.cj;
                if (true) ** GOTO lbl62
                block37: while (true) {
                    v7 /* !! */  = (long)(ee.arew("arvi", arfj(int ), (int)170) - ee.arew("arvh", arfj(int ), (int)169));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1495896537: {
                            break block37;
                        }
                        case 360483177: {
                            continue block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arvj", arfj(int ), (int)171)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ee.arew("arvk", aret(int ), (int)207)) break;
                    v8 /* !! */  = (long)ee.arew("arvl", aret(int ), (int)208);
                }
                if (!(this.mc.field_1755 instanceof class_408)) break block55;
                if (var1_3) ** GOTO lbl34
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            v9 = ee.arew("arvo", aret(int ), (int)209);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl89
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v9 = ee.arew("arvu", aret(int ), (int)210);
lbl89:
                // 2 sources

                return (boolean)v9;
            }
            case 0: {
                var2_2 /* !! */  = (int)ee.arew("arvv", aret(int ), (int)211);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl95:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ee.arew("arvw", aret(int ), (int)212);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl100:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ee.arew("arvx", aret(int ), (int)213);
                if (!var3_1) ** GOTO lbl95
                throw null;
            }
lbl104:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ee.arew("arvy", aret(int ), (int)214);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 4: {
                var2_2 /* !! */  = (int)ee.arew("arvz", aret(int ), (int)215);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
lbl113:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ee.arew("arwb", aret(int ), (int)216);
                    if (!var3_1) ** GOTO lbl95
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)ee.arew("arwh", aret(int ), (int)217);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ee.arew("arwj", aret(int ), (int)218);
                if (var3_1) {
                    throw null;
                }
            }
lbl126:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)ee.arew("arwk", aret(int ), (int)219);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
            case 9: {
                do {
                    var2_2 /* !! */  = (int)ee.arew("arwl", aret(int ), (int)220);
                } while (!var3_1);
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ee.arew("arwm", aret(int ), (int)221);
        ** while (!var3_1)
lbl138:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void config(String var0) {
        block89: {
            block88: {
                block87: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arkb", arfj(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == ee.arew("arkc", aret(int ), (int)76)) break;
                        v0 /* !! */  = (long)ee.arew("arkd", aret(int ), (int)77);
                    }
                    var4_1 = ee.c;
                    v1 /* !! */  = ee.cj;
                    if (true) ** GOTO lbl11
                    block62: while (true) {
                        v1 /* !! */  = (long)(v2 - ee.arew("arke", arfj(int ), (int)55));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -1495896537: {
                                break block62;
                            }
                            case -164453239: {
                                v2 = ee.arew("arkf", arfj(int ), (int)56);
                                continue block62;
                            }
                            case 1798054207: {
                                v2 = ee.arew("arkg", arfj(int ), (int)57);
                                continue block62;
                            }
                        }
                        break;
                    }
                    var3_2 /* !! */  = ee.b;
                    v3 /* !! */  = ee.cj;
                    if (true) ** GOTO lbl25
                    block63: while (true) {
                        v3 /* !! */  = (long)(ee.arew("arki", arfj(int ), (int)59) - ee.arew("arkh", arfj(int ), (int)58));
lbl25:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1495896537: {
                                break block63;
                            }
                            case 2050423823: {
                                continue block63;
                            }
                        }
                        break;
                    }
                    var2_3 = ee.a;
                    if (var4_1) {
                        throw null;
lbl33:
                        // 7 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl33
                    if (var0 == null) break block87;
                    if (var2_3) ** GOTO lbl33
                    v4 /* !! */  = ee.cj;
                    if (true) ** GOTO lbl42
                    block65: while (true) {
                        v4 /* !! */  = (long)(v5 - ee.arew("arkj", arfj(int ), (int)60));
lbl42:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1793211073: {
                                v5 = ee.arew("arkk", arfj(int ), (int)61);
                                continue block65;
                            }
                            case -1495896537: {
                                break block65;
                            }
                            case 1445707887: {
                                v5 = ee.arew("arkl", arfj(int ), (int)62);
                                continue block65;
                            }
                        }
                        break;
                    }
                    if (!var0.isBlank()) break block88;
                    if (var2_3) ** GOTO lbl33
                }
                if (var2_3 || var2_3) ** GOTO lbl33
                v6 = "Default";
                if (var4_1) {
                    throw null;
                }
                break block89;
            }
            if (var2_3 || var2_3) ** GOTO lbl33
            v6 = var1_4 = var0;
        }
        if (var2_3 || var2_3) ** GOTO lbl33
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arkm", arfj(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ee.arew("arkn", aret(int ), (int)78)) break;
            v7 /* !! */  = (long)ee.arew("arko", aret(int ), (int)79);
        }
        v8 /* !! */  = ee.cj;
        if (true) ** GOTO lbl73
        block67: while (true) {
            v8 /* !! */  = (long)(v9 - ee.arew("arkp", arfj(int ), (int)64));
lbl73:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1495896537: {
                    break block67;
                }
                case -872573250: {
                    v9 = ee.arew("arkq", arfj(int ), (int)65);
                    continue block67;
                }
                case -558834904: {
                    v9 = ee.arew("arkr", arfj(int ), (int)66);
                    continue block67;
                }
            }
            break;
        }
        v10 /* !! */  = ee.cj;
        if (true) ** GOTO lbl86
        block68: while (true) {
            v10 /* !! */  = (long)(v11 - ee.arew("arks", arfj(int ), (int)67));
lbl86:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1495896537: {
                    break block68;
                }
                case -1256368904: {
                    v11 = ee.arew("arkt", arfj(int ), (int)68);
                    continue block68;
                }
                case -1047334329: {
                    v11 = ee.arew("arku", arfj(int ), (int)69);
                    continue block68;
                }
            }
            break;
        }
        v12 = ee.arew("arkv", aret(int ), (int)80);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arkw", arfj(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ee.arew("arkx", aret(int ), (int)81)) break;
            v13 /* !! */  = (long)ee.arew("arky", aret(int ), (int)82);
        }
        v14 = new ee$TextPart("\u0417\u0430\u0433\u0440\u0443\u0436\u0435\u043d \u043a\u043e\u043d\u0444\u0438\u0433 ", (boolean)v12);
        v15 /* !! */  = ee.cj;
        if (true) ** GOTO lbl106
        block70: while (true) {
            v15 /* !! */  = (long)(v16 - ee.arew("arkz", arfj(int ), (int)71));
lbl106:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1495896537: {
                    break block70;
                }
                case -256971376: {
                    v16 = ee.arew("arla", arfj(int ), (int)72);
                    continue block70;
                }
                case -93284677: {
                    v16 = ee.arew("arlb", arfj(int ), (int)73);
                    continue block70;
                }
            }
            break;
        }
        v17 = ee.arew("arlc", aret(int ), (int)83);
        v18 /* !! */  = ee.cj;
        if (true) ** GOTO lbl120
        block71: while (true) {
            v18 /* !! */  = (long)(v19 - ee.arew("arld", arfj(int ), (int)74));
lbl120:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1495896537: {
                    break block71;
                }
                case -938764282: {
                    v19 = ee.arew("arle", arfj(int ), (int)75);
                    continue block71;
                }
                case 829423823: {
                    v19 = ee.arew("arlf", arfj(int ), (int)76);
                    continue block71;
                }
            }
            break;
        }
        v20 = new ee$TextPart(var1_4, (boolean)v17);
        v21 /* !! */  = ee.cj;
        if (true) ** GOTO lbl134
        block72: while (true) {
            v21 /* !! */  = (long)(v22 - ee.arew("arlg", arfj(int ), (int)77));
lbl134:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1495896537: {
                    break block72;
                }
                case -1111825281: {
                    v22 = ee.arew("arlh", arfj(int ), (int)78);
                    continue block72;
                }
                case 111778830: {
                    v22 = ee.arew("arli", arfj(int ), (int)79);
                    continue block72;
                }
            }
            break;
        }
        v23 = List.of(v14, v20);
        v24 = ee.arew("arlj", aret(int ), (int)84);
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("arlk", arfj(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == ee.arew("arll", aret(int ), (int)85)) break;
            v25 /* !! */  = (long)ee.arew("arlm", aret(int ), (int)86);
        }
        v26 = new ee$Toast(ee$Type.CONFIG, v23, (boolean)v24);
        v27 /* !! */  = ee.cj;
        if (true) ** GOTO lbl155
        block74: while (true) {
            v27 /* !! */  = (long)(v28 - ee.arew("arln", arfj(int ), (int)81));
lbl155:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1940791269: {
                    v28 = ee.arew("arlo", arfj(int ), (int)82);
                    continue block74;
                }
                case -1495896537: {
                    break block74;
                }
                case 976805831: {
                    v28 = ee.arew("arlp", arfj(int ), (int)83);
                    continue block74;
                }
            }
            break;
        }
        ee.push(v26);
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)ee.arew("arlq", aret(int ), (int)87);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl176:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)ee.arew("arlr", aret(int ), (int)88);
                if (!var4_1) break;
                throw null;
            }
lbl180:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)ee.arew("arls", aret(int ), (int)89);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 3: {
                var3_2 /* !! */  = (int)ee.arew("arlt", aret(int ), (int)90);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 4: {
                var3_2 /* !! */  = (int)ee.arew("arlu", aret(int ), (int)91);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl195:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)ee.arew("arlv", aret(int ), (int)92);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl200:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)ee.arew("arlw", aret(int ), (int)93);
                if (!var4_1) ** GOTO lbl176
                throw null;
            }
lbl204:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)ee.arew("arlx", aret(int ), (int)94);
                if (!var4_1) ** GOTO lbl180
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)ee.arew("arly", aret(int ), (int)95);
                if (!var4_1) ** GOTO lbl195
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)ee.arew("arlz", aret(int ), (int)96);
                if (!var4_1) ** GOTO lbl180
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)ee.arew("arma", aret(int ), (int)97);
                if (var4_1) {
                    throw null;
                }
            }
            case 11: {
                var3_2 /* !! */  = (int)ee.arew("armb", aret(int ), (int)98);
                if (!var4_1) break;
                throw null;
            }
lbl224:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)ee.arew("armc", aret(int ), (int)99);
                if (!var4_1) break;
                throw null;
            }
lbl228:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)ee.arew("armd", aret(int ), (int)100);
                if (!var4_1) ** GOTO lbl204
                throw null;
            }
            case 14: 
        }
        var3_2 /* !! */  = (int)ee.arew("arme", aret(int ), (int)101);
        ** while (!var4_1)
lbl235:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float arxx(int n2) {
        return Float.intBitsToFloat(areu[n2] ^ arev[n2]);
    }

    private static /* synthetic */ void atit() {
        ee.arfb[200] = 4970111210669866967L;
        ee.arfb[201] = 94714881638719583L;
        ee.arfb[202] = 8914328458949074988L;
        ee.arfb[203] = -7939376274381510475L;
        ee.arfb[204] = 5675937939265211557L;
        ee.arfb[205] = -2945737251686037473L;
        ee.arfb[206] = -5495769702981381202L;
        ee.arfb[207] = -8068583912246152624L;
        ee.arfb[208] = 9140902278306660402L;
        ee.arfb[209] = 974773366810942579L;
        ee.arfb[210] = 2868586385433281812L;
        ee.arfb[211] = -617663169667813626L;
        ee.arfb[212] = 7476719810656920584L;
        ee.arfb[213] = 4466170871724794295L;
        ee.arfb[214] = 334820057139145074L;
        ee.arfb[215] = 2270605959943391093L;
        ee.arfb[216] = 7255168263287533012L;
        ee.arfb[217] = -7585257084642553641L;
        ee.arfb[218] = -4367261982836535529L;
        ee.arfb[219] = -2954879496533699968L;
        ee.arfb[220] = -2623240381168600303L;
        ee.arfb[221] = 4307644768710596632L;
        ee.arfb[222] = -7921769406384878231L;
        ee.arfb[223] = -8366969489587098934L;
        ee.arfb[224] = 569286423809059292L;
        ee.arfb[225] = -1978583525243252043L;
        ee.arfb[226] = -1120243178424951631L;
        ee.arfb[227] = -7702220947195845345L;
        ee.arfb[228] = 2773876421766793980L;
        ee.arfb[229] = 6961793444844209175L;
        ee.arfb[230] = -5684199664007070646L;
        ee.arfb[231] = -7291349821277856902L;
        ee.arfb[232] = 6565792324586788346L;
        ee.arfb[233] = 390307550049235821L;
        ee.arfb[234] = 780124888319261019L;
        ee.arfb[235] = -3851333770603310037L;
        ee.arfb[236] = 2141297835210861170L;
        ee.arfb[237] = -1417045045555783513L;
        ee.arfb[238] = -6478040314974477501L;
        ee.arfb[239] = 7973263331558334414L;
        ee.arfb[240] = -4875443967953180158L;
        ee.arfb[241] = -5843619211271845953L;
        ee.arfb[242] = 5541561286982638596L;
        ee.arfb[243] = -4023636107279248605L;
        ee.arfb[244] = 6315765030782244222L;
        ee.arfb[245] = 795738543205134700L;
        ee.arfb[246] = -4833886149037998182L;
        ee.arfb[247] = 3617526956885713304L;
        ee.arfb[248] = -2497801434374722372L;
        ee.arfb[249] = 6065191331846001056L;
        ee.arfb[250] = 4730357703668274675L;
        ee.arfb[251] = 3218362488235395232L;
        ee.arfb[252] = -8023089862046295763L;
    }

    private static /* synthetic */ void atii() {
        ee.arev[100] = 903714657;
        ee.arev[101] = 916587030;
        ee.arev[102] = -79210019;
        ee.arev[103] = 1240484544;
        ee.arev[104] = 196581863;
        ee.arev[105] = 1029599146;
        ee.arev[106] = 1198035504;
        ee.arev[107] = 528444010;
        ee.arev[108] = 1613835840;
        ee.arev[109] = -1510395321;
        ee.arev[110] = -1344406073;
        ee.arev[111] = 1579891338;
        ee.arev[112] = 636291999;
        ee.arev[113] = -685029665;
        ee.arev[114] = -83066498;
        ee.arev[115] = -106771502;
        ee.arev[116] = 132597977;
        ee.arev[117] = -1130561981;
        ee.arev[118] = 1695016782;
        ee.arev[119] = 652327035;
        ee.arev[120] = -1190332780;
        ee.arev[121] = 1136400389;
        ee.arev[122] = 155381004;
        ee.arev[123] = 1265191595;
        ee.arev[124] = 1289898617;
        ee.arev[125] = 1977956012;
        ee.arev[126] = -373756038;
        ee.arev[127] = -1603790486;
        ee.arev[128] = 1751997458;
        ee.arev[129] = -1505333931;
        ee.arev[130] = -1896716918;
        ee.arev[131] = 1702808156;
        ee.arev[132] = 25933775;
        ee.arev[133] = -688095267;
        ee.arev[134] = -232063696;
        ee.arev[135] = 1648173053;
        ee.arev[136] = 1012266210;
        ee.arev[137] = -719418969;
        ee.arev[138] = -1831091951;
        ee.arev[139] = -1925748425;
        ee.arev[140] = -1978610337;
        ee.arev[141] = 24218494;
        ee.arev[142] = 1640946456;
        ee.arev[143] = 107811971;
        ee.arev[144] = -1312842987;
        ee.arev[145] = 721585739;
        ee.arev[146] = 2002891898;
        ee.arev[147] = -943043771;
        ee.arev[148] = -474782093;
        ee.arev[149] = -1009195838;
        ee.arev[150] = -1433672630;
        ee.arev[151] = -1816838901;
        ee.arev[152] = 267921089;
        ee.arev[153] = 853091464;
        ee.arev[154] = -1729943046;
        ee.arev[155] = -63556470;
        ee.arev[156] = 161001691;
        ee.arev[157] = 3291085;
        ee.arev[158] = -1448341455;
        ee.arev[159] = -1784182645;
        ee.arev[160] = 472365329;
        ee.arev[161] = -2133498196;
        ee.arev[162] = 1535750268;
        ee.arev[163] = -2043035050;
        ee.arev[164] = -615796001;
        ee.arev[165] = 1606969880;
        ee.arev[166] = 1298339150;
        ee.arev[167] = -2111899941;
        ee.arev[168] = -2080266496;
        ee.arev[169] = -281826739;
        ee.arev[170] = 1974026473;
        ee.arev[171] = 669136161;
        ee.arev[172] = -1590655516;
        ee.arev[173] = -790594704;
        ee.arev[174] = -1023180065;
        ee.arev[175] = -1666513445;
        ee.arev[176] = 348816801;
        ee.arev[177] = 1683784741;
        ee.arev[178] = -1842446012;
        ee.arev[179] = 1847356935;
        ee.arev[180] = 142698571;
        ee.arev[181] = -2092191125;
        ee.arev[182] = -2129297622;
        ee.arev[183] = 1184531430;
        ee.arev[184] = 140511276;
        ee.arev[185] = -1093245712;
        ee.arev[186] = -366144321;
        ee.arev[187] = -2125325065;
        ee.arev[188] = -977432814;
        ee.arev[189] = 1042195314;
        ee.arev[190] = -313480677;
        ee.arev[191] = -668186789;
        ee.arev[192] = -664515163;
        ee.arev[193] = 87617714;
        ee.arev[194] = -69668176;
        ee.arev[195] = 201123175;
        ee.arev[196] = 1382965750;
        ee.arev[197] = 780744482;
        ee.arev[198] = 152921865;
        ee.arev[199] = -1126491074;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void module(String var0, boolean var1_1) {
        block85: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arhv", arfj(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ee.arew("arhw", aret(int ), (int)44)) break;
                v0 /* !! */  = (long)ee.arew("arhx", aret(int ), (int)45);
            }
            var5_2 = ee.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arhy", arfj(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ee.arew("arhz", aret(int ), (int)46)) break;
                v1 /* !! */  = (long)ee.arew("aria", aret(int ), (int)47);
            }
            var4_3 /* !! */  = ee.b;
            v2 /* !! */  = ee.cj;
            if (true) ** GOTO lbl17
            block52: while (true) {
                v2 /* !! */  = (long)(v3 - ee.arew("arib", arfj(int ), (int)30));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1495896537: {
                        break block52;
                    }
                    case -1301671397: {
                        v3 = ee.arew("aric", arfj(int ), (int)31);
                        continue block52;
                    }
                    case -442960093: {
                        v3 = ee.arew("arid", arfj(int ), (int)32);
                        continue block52;
                    }
                }
                break;
            }
            var3_4 = ee.a;
            if (var5_2) {
                throw null;
lbl29:
                // 8 sources

                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl29
            if (var0 == null) break block85;
            if (var3_4) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("arie", arfj(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ee.arew("arif", aret(int ), (int)48)) break;
                v4 /* !! */  = (long)ee.arew("arig", aret(int ), (int)49);
            }
            if (!var0.isBlank()) ** GOTO lbl51
            if (var3_4) ** GOTO lbl29
        }
        if (var3_4) ** GOTO lbl29
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl29
                v5 = "Module";
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl53
            }
lbl51:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl29
            v5 = var2_5 = var0;
lbl53:
            // 2 sources

            if (var3_4 || var3_4) ** GOTO lbl29
            v6 /* !! */  = ee.cj;
            if (true) ** GOTO lbl58
            block55: while (true) {
                v6 /* !! */  = (long)(ee.arew("arii", arfj(int ), (int)35) - ee.arew("arih", arfj(int ), (int)34));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1495896537: {
                        break block55;
                    }
                    case 818439372: {
                        continue block55;
                    }
                }
                break;
            }
            if (!var1_1) ** GOTO lbl84
            v7 /* !! */  = ee.cj;
            if (true) ** GOTO lbl68
            block56: while (true) {
                v7 /* !! */  = (long)(v8 - ee.arew("arij", arfj(int ), (int)36));
lbl68:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1495896537: {
                        break block56;
                    }
                    case 1718864822: {
                        v8 = ee.arew("arik", arfj(int ), (int)37);
                        continue block56;
                    }
                    case 1814472913: {
                        v8 = ee.arew("aril", arfj(int ), (int)38);
                        continue block56;
                    }
                    case 1938401145: {
                        v8 = ee.arew("arim", arfj(int ), (int)39);
                        continue block56;
                    }
                }
                break;
            }
            v9 = ee$Type.MODULE_ON;
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl91
lbl84:
            // 1 sources

            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("arin", arfj(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == ee.arew("ario", aret(int ), (int)50)) {
                    v9 = ee$Type.MODULE_OFF;
                    break;
                }
                v10 /* !! */  = (long)ee.arew("arip", aret(int ), (int)51);
            }
lbl91:
            // 2 sources

            v11 /* !! */  = ee.cj;
            if (true) ** GOTO lbl95
            block58: while (true) {
                v11 /* !! */  = (long)(ee.arew("arir", arfj(int ), (int)42) - ee.arew("ariq", arfj(int ), (int)41));
lbl95:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1495896537: {
                        break block58;
                    }
                    case -1489277777: {
                        continue block58;
                    }
                }
                break;
            }
            v12 = ee.arew("aris", aret(int ), (int)52);
            v13 /* !! */  = ee.cj;
            if (true) ** GOTO lbl105
            block59: while (true) {
                v13 /* !! */  = (long)(ee.arew("ariu", arfj(int ), (int)44) - ee.arew("arit", arfj(int ), (int)43));
lbl105:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1495896537: {
                        break block59;
                    }
                    case 2029732669: {
                        continue block59;
                    }
                }
                break;
            }
            v14 = new ee$TextPart(var2_5, (boolean)v12);
            v15 /* !! */  = ee.cj;
            if (true) ** GOTO lbl115
            block60: while (true) {
                v15 /* !! */  = (long)(v16 - ee.arew("ariv", arfj(int ), (int)45));
lbl115:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1495896537: {
                        break block60;
                    }
                    case -736339025: {
                        v16 = ee.arew("ariw", arfj(int ), (int)46);
                        continue block60;
                    }
                    case 74758704: {
                        v16 = ee.arew("arix", arfj(int ), (int)47);
                        continue block60;
                    }
                    case 857069227: {
                        v16 = ee.arew("ariy", arfj(int ), (int)48);
                        continue block60;
                    }
                }
                break;
            }
            if (var1_1) {
                v17 = " \u0432\u043a\u043b\u044e\u0447\u0435\u043d";
                if (var5_2) {
                    throw null;
                }
            } else {
                v17 = " \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d";
            }
            v18 = ee.arew("ariz", aret(int ), (int)53);
            v19 /* !! */  = ee.cj;
            if (true) ** GOTO lbl138
            block61: while (true) {
                v19 /* !! */  = (long)(ee.arew("arjb", arfj(int ), (int)50) - ee.arew("arja", arfj(int ), (int)49));
lbl138:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1495896537: {
                        break block61;
                    }
                    case -688753881: {
                        continue block61;
                    }
                }
                break;
            }
            v20 = new ee$TextPart(v17, (boolean)v18);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_4 = ee.cj - ee.arew("arjc", arfj(int ), (int)51)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == ee.arew("arjd", aret(int ), (int)54)) break;
                v21 /* !! */  = (long)ee.arew("arje", aret(int ), (int)55);
            }
            v22 = List.of(v14, v20);
            v23 = ee.arew("arjf", aret(int ), (int)56);
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_5 = ee.cj - ee.arew("arjg", arfj(int ), (int)52)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == ee.arew("arjh", aret(int ), (int)57)) break;
                v24 /* !! */  = (long)ee.arew("arji", aret(int ), (int)58);
            }
            v25 = new ee$Toast(v9, v22, (boolean)v23);
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_6 = ee.cj - ee.arew("arjj", arfj(int ), (int)53)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == ee.arew("arjk", aret(int ), (int)59)) break;
                v26 /* !! */  = (long)ee.arew("arjl", aret(int ), (int)60);
            }
            ee.push(v25);
            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return;
lbl166:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ee.arew("arjm", aret(int ), (int)61);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl196
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)ee.arew("arjn", aret(int ), (int)62);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl177:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)ee.arew("arjo", aret(int ), (int)63);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl182:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)ee.arew("arjp", aret(int ), (int)64);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 4: {
                var4_3 /* !! */  = (int)ee.arew("arjq", aret(int ), (int)65);
                if (!var5_2) ** GOTO lbl166
                throw null;
            }
lbl191:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)ee.arew("arjr", aret(int ), (int)66);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl196:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)ee.arew("arjs", aret(int ), (int)67);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl201:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)ee.arew("arjt", aret(int ), (int)68);
                if (!var5_2) break;
                throw null;
            }
lbl205:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ee.arew("arju", aret(int ), (int)69);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl210:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)ee.arew("arjv", aret(int ), (int)70);
                if (!var5_2) break;
                throw null;
            }
lbl214:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)ee.arew("arjw", aret(int ), (int)71);
                if (!var5_2) ** GOTO lbl177
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)ee.arew("arjx", aret(int ), (int)72);
                if (!var5_2) ** GOTO lbl205
                throw null;
            }
lbl222:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)ee.arew("arjy", aret(int ), (int)73);
                if (!var5_2) ** GOTO lbl210
                throw null;
            }
lbl226:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)ee.arew("arjz", aret(int ), (int)74);
                if (!var5_2) ** GOTO lbl182
                throw null;
            }
            case 14: 
        }
        var4_3 /* !! */  = (int)ee.arew("arka", aret(int ), (int)75);
        ** while (!var5_2)
lbl233:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ee getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arfk", arfj(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ee.arew("arfl", aret(int ), (int)7)) break;
            v0 /* !! */  = (long)ee.arew("arfm", aret(int ), (int)8);
        }
        var2 = ee.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arfn", arfj(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ee.arew("arfo", aret(int ), (int)9)) break;
            v1 /* !! */  = (long)ee.arew("arfp", aret(int ), (int)10);
        }
        var1_1 /* !! */  = ee.b;
        v2 /* !! */  = ee.cj;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(ee.arew("arfr", arfj(int ), (int)5) - ee.arew("arfq", arfj(int ), (int)4));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1495896537: {
                    break block16;
                }
                case 1823321050: {
                    continue block16;
                }
            }
            break;
        }
        var0_2 = ee.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v3 /* !! */  = ee.cj;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v3 /* !! */  = (long)(ee.arew("arft", arfj(int ), (int)7) - ee.arew("arfs", arfj(int ), (int)6));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1495896537: {
                            break block18;
                        }
                        case -195898577: {
                            continue block18;
                        }
                    }
                    break;
                }
                return ee.instance;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ee.arew("arfu", aret(int ), (int)11);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)ee.arew("arfv", aret(int ), (int)12);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ee.arew("arfw", aret(int ), (int)13);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ee.arew("arfx", aret(int ), (int)14);
        ** while (!var2)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void atir() {
        ee.arfb[0] = 8349201281190075736L;
        ee.arfb[1] = -4272538765981063946L;
        ee.arfb[2] = 8851896089315505131L;
        ee.arfb[3] = 1999423441310455689L;
        ee.arfb[4] = -8358598487699418553L;
        ee.arfb[5] = -541094642426389390L;
        ee.arfb[6] = 909198103860440574L;
        ee.arfb[7] = 7841599918259893381L;
        ee.arfb[8] = 8231592971463783245L;
        ee.arfb[9] = 2162311855912772361L;
        ee.arfb[10] = 1699045535851588607L;
        ee.arfb[11] = -4731813195869070291L;
        ee.arfb[12] = 719021567056114541L;
        ee.arfb[13] = 6081276929755303398L;
        ee.arfb[14] = 5415920661086263853L;
        ee.arfb[15] = -6957958717471723911L;
        ee.arfb[16] = 2691722767761093370L;
        ee.arfb[17] = 2444677397510952515L;
        ee.arfb[18] = 4387717156812648398L;
        ee.arfb[19] = -2885603949302507167L;
        ee.arfb[20] = -4711222245457521852L;
        ee.arfb[21] = 4392779698475577720L;
        ee.arfb[22] = -5563034218361662248L;
        ee.arfb[23] = 4555085112462231870L;
        ee.arfb[24] = -8528658974395587283L;
        ee.arfb[25] = -275142799736213612L;
        ee.arfb[26] = -5052957732788727740L;
        ee.arfb[27] = -1801722955703329431L;
        ee.arfb[28] = -8105307231118568059L;
        ee.arfb[29] = 9011640261951704156L;
        ee.arfb[30] = -140603733540455126L;
        ee.arfb[31] = 5009180143288564098L;
        ee.arfb[32] = 6947227533875304801L;
        ee.arfb[33] = -3780673654727765064L;
        ee.arfb[34] = 5961473060148381056L;
        ee.arfb[35] = -1216740938329080593L;
        ee.arfb[36] = -873381997827017598L;
        ee.arfb[37] = -4372324722319696282L;
        ee.arfb[38] = -2488489508022795738L;
        ee.arfb[39] = 4732044402508316564L;
        ee.arfb[40] = -5662387072835952807L;
        ee.arfb[41] = -6670310321913210736L;
        ee.arfb[42] = -3039106189082517118L;
        ee.arfb[43] = -4900375938692986992L;
        ee.arfb[44] = 6403810629408849020L;
        ee.arfb[45] = 1114373038268239376L;
        ee.arfb[46] = 257948792983718880L;
        ee.arfb[47] = -594904851554675149L;
        ee.arfb[48] = 2648545196306784677L;
        ee.arfb[49] = 4009891943430343992L;
        ee.arfb[50] = -6711658446658433894L;
        ee.arfb[51] = -1072642677285446228L;
        ee.arfb[52] = -4836564630343089722L;
        ee.arfb[53] = 9089751966999828040L;
        ee.arfb[54] = 1575035757357828559L;
        ee.arfb[55] = 1689656452025767560L;
        ee.arfb[56] = -8883934244433923379L;
        ee.arfb[57] = -9115431384746944757L;
        ee.arfb[58] = 1093899133099574230L;
        ee.arfb[59] = 9036265666822562080L;
        ee.arfb[60] = 2922872495457504852L;
        ee.arfb[61] = 475958478527804466L;
        ee.arfb[62] = 2845185751379541871L;
        ee.arfb[63] = 3856815568381692209L;
        ee.arfb[64] = 1862523707199290553L;
        ee.arfb[65] = -4596696527715046495L;
        ee.arfb[66] = -3935678414297090188L;
        ee.arfb[67] = 2314797873072831780L;
        ee.arfb[68] = -4530705532433499973L;
        ee.arfb[69] = 776758589846102114L;
        ee.arfb[70] = -2134873884255537932L;
        ee.arfb[71] = -7542529414453487503L;
        ee.arfb[72] = -6159216273727205628L;
        ee.arfb[73] = 7190876825971142989L;
        ee.arfb[74] = 8006629124866833868L;
        ee.arfb[75] = -241681718416735546L;
        ee.arfb[76] = 5471456267377130734L;
        ee.arfb[77] = 8137983994664485383L;
        ee.arfb[78] = -3938862182952961341L;
        ee.arfb[79] = 2304523739056164138L;
        ee.arfb[80] = -2071299076596314243L;
        ee.arfb[81] = 6045031392980164030L;
        ee.arfb[82] = 1187176389984202837L;
        ee.arfb[83] = 3494251406590458707L;
        ee.arfb[84] = -625764432394750071L;
        ee.arfb[85] = -2467982955986047919L;
        ee.arfb[86] = 6240372572871848778L;
        ee.arfb[87] = -4354682959852974170L;
        ee.arfb[88] = 3637730840304810634L;
        ee.arfb[89] = -1050071456098797131L;
        ee.arfb[90] = 2832533579220328491L;
        ee.arfb[91] = 4333164285120413684L;
        ee.arfb[92] = 5885386563836824688L;
        ee.arfb[93] = 3430105743910993619L;
        ee.arfb[94] = 7460660872698275617L;
        ee.arfb[95] = 5743890595038641582L;
        ee.arfb[96] = 952168483876182825L;
        ee.arfb[97] = -7125706537833795280L;
        ee.arfb[98] = -9215972929893491928L;
        ee.arfb[99] = -8733526100362532021L;
    }

    private static /* synthetic */ void atea() {
        ee.areu[200] = -217001939;
        ee.areu[201] = -240684535;
        ee.areu[202] = -621282327;
        ee.areu[203] = 1053534678;
        ee.areu[204] = -1102490180;
        ee.areu[205] = 365968115;
        ee.areu[206] = 360933972;
        ee.areu[207] = 297995041;
        ee.areu[208] = -1006849612;
        ee.areu[209] = -940966544;
        ee.areu[210] = -828347510;
        ee.areu[211] = 1100662614;
        ee.areu[212] = 341359242;
        ee.areu[213] = -979781669;
        ee.areu[214] = 287762640;
        ee.areu[215] = 54641137;
        ee.areu[216] = -68903731;
        ee.areu[217] = 125256339;
        ee.areu[218] = -1865707680;
        ee.areu[219] = 1532285733;
        ee.areu[220] = 528366758;
        ee.areu[221] = -1174231355;
        ee.areu[222] = -2045864844;
        ee.areu[223] = -1630785238;
        ee.areu[224] = 2085101569;
        ee.areu[225] = -1227242725;
        ee.areu[226] = -1664387978;
        ee.areu[227] = -648827663;
        ee.areu[228] = -273154665;
        ee.areu[229] = 1480450834;
        ee.areu[230] = -1301338748;
        ee.areu[231] = 458874997;
        ee.areu[232] = -1672287267;
        ee.areu[233] = -1403333966;
        ee.areu[234] = -1853655599;
        ee.areu[235] = 195542188;
        ee.areu[236] = -1784147919;
        ee.areu[237] = 443334280;
        ee.areu[238] = 235064304;
        ee.areu[239] = 1941146413;
        ee.areu[240] = -298373841;
        ee.areu[241] = 1035634676;
        ee.areu[242] = 518422400;
        ee.areu[243] = -947761368;
        ee.areu[244] = -1554782828;
        ee.areu[245] = -568340368;
        ee.areu[246] = 558283540;
        ee.areu[247] = 263506395;
        ee.areu[248] = -1245825442;
        ee.areu[249] = 1206987252;
        ee.areu[250] = 942121473;
        ee.areu[251] = 1334738507;
        ee.areu[252] = -1693307295;
        ee.areu[253] = -543997848;
        ee.areu[254] = 1992528901;
        ee.areu[255] = 2114076894;
        ee.areu[256] = -142806968;
        ee.areu[257] = -1301905368;
        ee.areu[258] = 1259224699;
        ee.areu[259] = 2040901818;
        ee.areu[260] = -1217921236;
        ee.areu[261] = -1661432092;
        ee.areu[262] = 984943879;
        ee.areu[263] = 1494382609;
        ee.areu[264] = 2028704602;
        ee.areu[265] = -1971180524;
        ee.areu[266] = 342317226;
        ee.areu[267] = 309846854;
        ee.areu[268] = 732028913;
        ee.areu[269] = 1375672330;
        ee.areu[270] = 908780042;
        ee.areu[271] = -573515383;
        ee.areu[272] = -2053180994;
        ee.areu[273] = -207776683;
        ee.areu[274] = -785633564;
        ee.areu[275] = -130530821;
        ee.areu[276] = -1090228908;
        ee.areu[277] = -205969627;
        ee.areu[278] = 1918868227;
        ee.areu[279] = -839774167;
        ee.areu[280] = -1505482402;
        ee.areu[281] = 2091551479;
        ee.areu[282] = 2000762031;
        ee.areu[283] = 1566541581;
        ee.areu[284] = 954192007;
        ee.areu[285] = 552656256;
        ee.areu[286] = -196169031;
        ee.areu[287] = -1283888153;
        ee.areu[288] = 514000084;
        ee.areu[289] = -388593412;
        ee.areu[290] = 12066874;
        ee.areu[291] = -1965871438;
        ee.areu[292] = 1127789394;
        ee.areu[293] = -67734484;
        ee.areu[294] = 1031343016;
        ee.areu[295] = 1960204066;
        ee.areu[296] = -623668245;
        ee.areu[297] = -970165362;
        ee.areu[298] = -1093317733;
        ee.areu[299] = 706063302;
    }

    public static /* synthetic */ CallSite arew(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int aret(int n2) {
        return areu[n2] ^ arev[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawIcon(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        var15_7 = ee.c;
        var14_8 /* !! */  = ee.b;
        var13_9 = ee.a;
        if (var15_7) {
            throw null;
lbl6:
            // 16 sources

            return;
        }
        if (var13_9 || var13_9) ** GOTO lbl6
        if (var1_1 == null) ** GOTO lbl16
        if (var14_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_9) ** GOTO lbl6
                if (!var2_2.isEmpty()) ** GOTO lbl18
                if (var13_9) ** GOTO lbl6
lbl16:
                // 2 sources

                if (var13_9 || var13_9) ** GOTO lbl6
                return;
lbl18:
                // 1 sources

                if (var13_9 || var13_9) ** GOTO lbl6
                var7_10 = var1_1.getGlyph(var2_2.charAt((int)ee.arew("asxh", aret(int ), (int)508)));
                if (var13_9 || var13_9) ** GOTO lbl6
                if (var7_10 == null) ** GOTO lbl25
                if (var13_9) ** GOTO lbl6
                if (!(var7_10.width <= 0.0f)) ** GOTO lbl27
                if (var13_9) ** GOTO lbl6
lbl25:
                // 2 sources

                if (var13_9 || var13_9) ** GOTO lbl6
                return;
lbl27:
                // 1 sources

                if (var13_9 || var13_9) ** GOTO lbl6
                var8_11 = var5_5 * var1_1.getEmSize() / var7_10.width;
                if (var13_9 || var13_9) ** GOTO lbl6
                var9_12 = var8_11 / var1_1.getEmSize();
                if (var13_9 || var13_9) ** GOTO lbl6
                var10_13 = var4_4 - var7_10.height * var9_12 * ee.arew("asxi", arxx(int ), (int)509);
                if (var13_9 || var13_9) ** GOTO lbl6
                var11_14 = var3_3 - var7_10.bearingX * var9_12;
                if (var13_9 || var13_9) ** GOTO lbl6
                var12_15 = var10_13 - var1_1.getAscender() * var9_12 + var7_10.bearingY * var9_12;
                if (var13_9 || var13_9) ** GOTO lbl6
                kq.text(var0, var1_1, var2_2, var11_14, var12_15, var8_11, var6_6, (boolean)ee.arew("asxj", aret(int ), (int)510));
                if (!var13_9 && !var13_9) ** break;
                ** continue;
                return;
            }
lbl42:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_8 /* !! */  = (int)ee.arew("asxk", aret(int ), (int)511);
                    if (var15_7) {
                        throw null;
                    }
                    ** GOTO lbl149
                    break;
                }
            }
lbl48:
            // 2 sources

            case 1: {
                var14_8 /* !! */  = (int)ee.arew("asxl", aret(int ), (int)512);
                if (!var15_7) break;
                throw null;
            }
lbl52:
            // 3 sources

            case 2: {
                var14_8 /* !! */  = (int)ee.arew("asxm", aret(int ), (int)513);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 3: {
                var14_8 /* !! */  = (int)ee.arew("asxn", aret(int ), (int)514);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl62:
            // 4 sources

            case 4: {
                var14_8 /* !! */  = (int)ee.arew("asxo", aret(int ), (int)515);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl67:
            // 3 sources

            case 5: {
                var14_8 /* !! */  = (int)ee.arew("asxp", aret(int ), (int)516);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl72:
            // 2 sources

            case 6: {
                var14_8 /* !! */  = (int)ee.arew("asxq", aret(int ), (int)517);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 7: {
                var14_8 /* !! */  = (int)ee.arew("asxr", aret(int ), (int)518);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 8: {
                var14_8 /* !! */  = (int)ee.arew("asxs", aret(int ), (int)519);
                if (!var15_7) ** GOTO lbl72
                throw null;
            }
            case 9: {
                var14_8 /* !! */  = (int)ee.arew("asxt", aret(int ), (int)520);
                if (!var15_7) ** GOTO lbl62
                throw null;
            }
            case 10: {
                var14_8 /* !! */  = (int)ee.arew("asxu", aret(int ), (int)521);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 11: {
                var14_8 /* !! */  = (int)ee.arew("asxv", aret(int ), (int)522);
                if (!var15_7) ** GOTO lbl52
                throw null;
            }
            case 12: {
                var14_8 /* !! */  = (int)ee.arew("asxw", aret(int ), (int)523);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl104:
            // 2 sources

            case 13: {
                var14_8 /* !! */  = (int)ee.arew("asxx", aret(int ), (int)524);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 14: {
                var14_8 /* !! */  = (int)ee.arew("asxy", aret(int ), (int)525);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl114:
            // 2 sources

            case 15: {
                var14_8 /* !! */  = (int)ee.arew("asxz", aret(int ), (int)526);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl119:
            // 2 sources

            case 16: {
                var14_8 /* !! */  = (int)ee.arew("asya", aret(int ), (int)527);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 17: {
                var14_8 /* !! */  = (int)ee.arew("asyb", aret(int ), (int)528);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl129:
            // 2 sources

            case 18: {
                var14_8 /* !! */  = (int)ee.arew("asyc", aret(int ), (int)529);
                if (!var15_7) ** GOTO lbl42
                throw null;
            }
lbl133:
            // 4 sources

            case 19: {
                var14_8 /* !! */  = (int)ee.arew("asyd", aret(int ), (int)530);
                if (!var15_7) ** GOTO lbl62
                throw null;
            }
lbl137:
            // 2 sources

            case 20: {
                var14_8 /* !! */  = (int)ee.arew("asye", aret(int ), (int)531);
                if (!var15_7) ** GOTO lbl62
                throw null;
            }
lbl141:
            // 3 sources

            case 21: {
                var14_8 /* !! */  = (int)ee.arew("asyf", aret(int ), (int)532);
                if (!var15_7) ** GOTO lbl133
                throw null;
            }
lbl145:
            // 2 sources

            case 22: {
                var14_8 /* !! */  = (int)ee.arew("asyg", aret(int ), (int)533);
                if (!var15_7) ** GOTO lbl119
                throw null;
            }
lbl149:
            // 2 sources

            case 23: {
                var14_8 /* !! */  = (int)ee.arew("asyh", aret(int ), (int)534);
                if (!var15_7) ** GOTO lbl129
                throw null;
            }
            case 24: {
                do {
                    var14_8 /* !! */  = (int)ee.arew("asyi", aret(int ), (int)535);
                } while (!var15_7);
                throw null;
            }
            case 25: {
                var14_8 /* !! */  = (int)ee.arew("asyj", aret(int ), (int)536);
                if (!var15_7) ** GOTO lbl104
                throw null;
            }
            case 26: {
                var14_8 /* !! */  = (int)ee.arew("asyk", aret(int ), (int)537);
                if (!var15_7) ** GOTO lbl67
                throw null;
            }
lbl166:
            // 3 sources

            case 27: {
                var14_8 /* !! */  = (int)ee.arew("asyl", aret(int ), (int)538);
                if (!var15_7) ** GOTO lbl48
                throw null;
            }
lbl170:
            // 4 sources

            case 28: {
                var14_8 /* !! */  = (int)ee.arew("asym", aret(int ), (int)539);
                if (!var15_7) ** GOTO lbl52
                throw null;
            }
            case 29: {
                var14_8 /* !! */  = (int)ee.arew("asyn", aret(int ), (int)540);
                if (!var15_7) break;
                throw null;
            }
            case 30: 
        }
        var14_8 /* !! */  = (int)ee.arew("asyo", aret(int ), (int)541);
        ** while (!var15_7)
lbl181:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void setX(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("arwn", arfj(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ee.arew("arws", aret(int ), (int)222)) break;
            v0 /* !! */  = (long)ee.arew("arwu", aret(int ), (int)223);
        }
        var4_2 = ee.c;
        v1 /* !! */  = ee.cj;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ee.arew("arwv", arfj(int ), (int)173));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1495896537: {
                    break block12;
                }
                case 985693621: {
                    v2 = ee.arew("arww", arfj(int ), (int)174);
                    continue block12;
                }
                case 1280510911: {
                    v2 = ee.arew("arwx", arfj(int ), (int)175);
                    continue block12;
                }
            }
            break;
        }
        var3_3 /* !! */  = ee.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("arwy", arfj(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ee.arew("arwz", aret(int ), (int)224)) break;
            v3 /* !! */  = (long)ee.arew("arxc", aret(int ), (int)225);
        }
        var2_4 = ee.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                return;
            }
lbl39:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ee.arew("arxf", aret(int ), (int)226);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ee.arew("arxh", aret(int ), (int)227);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ee.arew("arxj", aret(int ), (int)228);
                    if (!var4_2) ** GOTO lbl39
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ee.arew("arxk", aret(int ), (int)229);
        ** while (!var4_2)
lbl56:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float presence(ee$Toast var0, long var1_1) {
        block60: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ee.cj - ee.arew("ataf", arfj(int ), (int)224)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ee.arew("atag", aret(int ), (int)568)) break;
                v0 /* !! */  = (long)ee.arew("atah", aret(int ), (int)569);
            }
            var7_2 = ee.c;
            v1 /* !! */  = ee.cj;
            if (true) ** GOTO lbl12
            block34: while (true) {
                v1 /* !! */  = (long)(v2 - ee.arew("atai", arfj(int ), (int)225));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1495896537: {
                        break block34;
                    }
                    case -1479400759: {
                        v2 = ee.arew("ataj", arfj(int ), (int)226);
                        continue block34;
                    }
                    case 987971301: {
                        v2 = ee.arew("atak", arfj(int ), (int)227);
                        continue block34;
                    }
                }
                break;
            }
            var6_3 /* !! */  = ee.b;
            v3 /* !! */  = ee.cj;
            if (true) ** GOTO lbl26
            block35: while (true) {
                v3 /* !! */  = (long)(v4 - ee.arew("atal", arfj(int ), (int)228));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1495896537: {
                        break block35;
                    }
                    case -1402213031: {
                        v4 = ee.arew("atam", arfj(int ), (int)229);
                        continue block35;
                    }
                    case 306341918: {
                        v4 = ee.arew("atan", arfj(int ), (int)230);
                        continue block35;
                    }
                    case 2063354167: {
                        v4 = ee.arew("atao", arfj(int ), (int)231);
                        continue block35;
                    }
                }
                break;
            }
            var5_4 = ee.a;
            if (var7_2) {
                throw null;
lbl41:
                // 9 sources

                return (float)ee.arew("atap", arxx(int ), (int)570);
            }
            if (var5_4 || var5_4) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = ee.cj - ee.arew("ataq", arfj(int ), (int)232)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ee.arew("atar", aret(int ), (int)571)) break;
                v5 /* !! */  = (long)ee.arew("atas", aret(int ), (int)572);
            }
            var3_5 = var1_1 - var0.createdAt;
            if (var5_4 || var5_4) ** GOTO lbl41
            if (var3_5 >= ee.arew("atat", arfj(int ), (int)233)) break block60;
            if (var5_4) ** GOTO lbl41
            v6 = (float)var3_5 / ee.arew("atau", arxx(int ), (int)573);
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = ee.cj - ee.arew("atav", arfj(int ), (int)234)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == ee.arew("ataw", aret(int ), (int)574)) break;
                v7 /* !! */  = (long)ee.arew("atax", aret(int ), (int)575);
            }
            return class_3532.method_15363((float)v6, (float)0.0f, (float)1.0f);
        }
        if (var5_4) ** GOTO lbl41
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl41
                v8 /* !! */  = ee.cj;
                if (true) ** GOTO lbl72
                block39: while (true) {
                    v8 /* !! */  = (long)(ee.arew("ataz", arfj(int ), (int)236) - ee.arew("atay", arfj(int ), (int)235));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1495896537: {
                            break block39;
                        }
                        case -135674485: {
                            continue block39;
                        }
                    }
                    break;
                }
                if (var0.sticky) ** GOTO lbl81
                if (var5_4) ** GOTO lbl41
                if (var3_5 >= ee.arew("atba", arfj(int ), (int)237)) ** GOTO lbl83
                if (var5_4) ** GOTO lbl41
lbl81:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl41
                return 1.0f;
lbl83:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                v9 = (float)(var3_5 - ee.arew("atbb", arfj(int ), (int)238)) / ee.arew("atbc", arxx(int ), (int)576);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = ee.cj - ee.arew("atbd", arfj(int ), (int)239)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ee.arew("atbe", aret(int ), (int)577)) break;
                    v10 /* !! */  = (long)ee.arew("atbf", aret(int ), (int)578);
                }
                return 1.0f - class_3532.method_15363((float)v9, (float)0.0f, (float)1.0f);
            }
lbl93:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)ee.arew("atbg", aret(int ), (int)579);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl131
                    break;
                }
            }
lbl99:
            // 2 sources

            case 1: {
                do {
                    var6_3 /* !! */  = (int)ee.arew("atbh", aret(int ), (int)580);
                } while (!var7_2);
                throw null;
            }
            case 2: {
                var6_3 /* !! */  = (int)ee.arew("atbi", aret(int ), (int)581);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: {
                var6_3 /* !! */  = (int)ee.arew("atbj", aret(int ), (int)582);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl114:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)ee.arew("atbk", aret(int ), (int)583);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 5: {
                var6_3 /* !! */  = (int)ee.arew("atbl", aret(int ), (int)584);
                if (!var7_2) ** GOTO lbl114
                throw null;
            }
lbl123:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)ee.arew("atbm", aret(int ), (int)585);
                if (!var7_2) ** GOTO lbl93
                throw null;
            }
lbl127:
            // 3 sources

            case 7: {
                var6_3 /* !! */  = (int)ee.arew("atbn", aret(int ), (int)586);
                if (!var7_2) ** GOTO lbl99
                throw null;
            }
lbl131:
            // 3 sources

            case 8: {
                var6_3 /* !! */  = (int)ee.arew("atbo", aret(int ), (int)587);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 9: {
                var6_3 /* !! */  = (int)ee.arew("atbp", aret(int ), (int)588);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl141:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)ee.arew("atbq", aret(int ), (int)589);
                if (!var7_2) ** GOTO lbl93
                throw null;
            }
lbl145:
            // 2 sources

            case 11: {
                var6_3 /* !! */  = (int)ee.arew("atbr", aret(int ), (int)590);
                if (!var7_2) ** GOTO lbl127
                throw null;
            }
            case 12: {
                var6_3 /* !! */  = (int)ee.arew("atbs", aret(int ), (int)591);
                if (!var7_2) ** GOTO lbl127
                throw null;
            }
lbl153:
            // 4 sources

            case 13: {
                var6_3 /* !! */  = (int)ee.arew("atbt", aret(int ), (int)592);
                if (!var7_2) ** GOTO lbl123
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)ee.arew("atbu", aret(int ), (int)593);
                if (!var7_2) ** GOTO lbl131
                throw null;
            }
            case 15: 
        }
        var6_3 /* !! */  = (int)ee.arew("atbv", aret(int ), (int)594);
        ** while (!var7_2)
lbl164:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ateb() {
        ee.areu[300] = 497877080;
        ee.areu[301] = 717622369;
        ee.areu[302] = -1957578640;
        ee.areu[303] = 244047045;
        ee.areu[304] = 580688298;
        ee.areu[305] = -831063869;
        ee.areu[306] = -1947050123;
        ee.areu[307] = 160545570;
        ee.areu[308] = 1581152204;
        ee.areu[309] = -85520289;
        ee.areu[310] = -1005776646;
        ee.areu[311] = 865351901;
        ee.areu[312] = 1095025847;
        ee.areu[313] = 1139110686;
        ee.areu[314] = -1130867627;
        ee.areu[315] = -1118651558;
        ee.areu[316] = 1223495931;
        ee.areu[317] = 816259808;
        ee.areu[318] = 1556879900;
        ee.areu[319] = -906854316;
        ee.areu[320] = 257997207;
        ee.areu[321] = 1765107187;
        ee.areu[322] = -1586839408;
        ee.areu[323] = -1229186073;
        ee.areu[324] = -1169478463;
        ee.areu[325] = -1684889404;
        ee.areu[326] = 1247689631;
        ee.areu[327] = -1255910538;
        ee.areu[328] = -1285034516;
        ee.areu[329] = -1419607158;
        ee.areu[330] = 1153332950;
        ee.areu[331] = 1846663070;
        ee.areu[332] = 1014339837;
        ee.areu[333] = 609005881;
        ee.areu[334] = 991118772;
        ee.areu[335] = 610640955;
        ee.areu[336] = -48606384;
        ee.areu[337] = 287262608;
        ee.areu[338] = -805997657;
        ee.areu[339] = 14943410;
        ee.areu[340] = -1592172324;
        ee.areu[341] = -1440160335;
        ee.areu[342] = -313013971;
        ee.areu[343] = -1493661283;
        ee.areu[344] = 918755018;
        ee.areu[345] = 1249039304;
        ee.areu[346] = -320807655;
        ee.areu[347] = 132845043;
        ee.areu[348] = 643608666;
        ee.areu[349] = -250244742;
        ee.areu[350] = 900064246;
        ee.areu[351] = -587931659;
        ee.areu[352] = -383593797;
        ee.areu[353] = -1958387396;
        ee.areu[354] = 1368031742;
        ee.areu[355] = 95859911;
        ee.areu[356] = 25066752;
        ee.areu[357] = -762538020;
        ee.areu[358] = -1609337612;
        ee.areu[359] = 919966644;
        ee.areu[360] = 1243381364;
        ee.areu[361] = -1531028688;
        ee.areu[362] = -1081158776;
        ee.areu[363] = -1765033209;
        ee.areu[364] = 456660268;
        ee.areu[365] = -533598800;
        ee.areu[366] = -903861840;
        ee.areu[367] = 587414604;
        ee.areu[368] = -533916765;
        ee.areu[369] = 469661252;
        ee.areu[370] = 1500587881;
        ee.areu[371] = 728376044;
        ee.areu[372] = 1214374319;
        ee.areu[373] = 1742958171;
        ee.areu[374] = -1871493562;
        ee.areu[375] = -97481834;
        ee.areu[376] = 2024173133;
        ee.areu[377] = -1001346867;
        ee.areu[378] = -1011368348;
        ee.areu[379] = 1425108873;
        ee.areu[380] = 764979238;
        ee.areu[381] = 60372273;
        ee.areu[382] = 1815536093;
        ee.areu[383] = -1271282964;
        ee.areu[384] = 1754819975;
        ee.areu[385] = -1745874628;
        ee.areu[386] = 1150522207;
        ee.areu[387] = 1930711663;
        ee.areu[388] = 1226220032;
        ee.areu[389] = 1740063875;
        ee.areu[390] = 1959748259;
        ee.areu[391] = -1475312973;
        ee.areu[392] = -501921578;
        ee.areu[393] = 1043501722;
        ee.areu[394] = -798809323;
        ee.areu[395] = 1593847108;
        ee.areu[396] = -6694681;
        ee.areu[397] = 647554720;
        ee.areu[398] = 755125749;
        ee.areu[399] = 2127979669;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawToast(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, ee$Toast var5_5, ks var6_6, ks var7_7, float var8_8) {
        var22_9 = ee.c;
        var21_10 /* !! */  = ee.b;
        var20_11 = ee.a;
        if (var22_9) {
            throw null;
lbl6:
            // 33 sources

            return;
        }
        if (var20_11 || var20_11) ** GOTO lbl6
        at.panelWithInnerShadow(var0, var1_1, var2_2, var3_3, (float)ee.arew("aspv", arxx(int ), (int)344), (float)ee.arew("aspw", arxx(int ), (int)345), var8_8, (float)ee.arew("aspx", arxx(int ), (int)346), (float)ee.arew("aspy", arxx(int ), (int)347));
        if (var20_11 || var20_11) ** GOTO lbl6
        var9_12 = var2_2 + ee.arew("aspz", arxx(int ), (int)348);
        if (var20_11 || var20_11) ** GOTO lbl6
        var10_13 = var1_1 + ee.arew("asqa", arxx(int ), (int)349);
        if (var20_11 || var20_11) ** GOTO lbl6
        var11_14 = var10_13 + ee.arew("asqb", arxx(int ), (int)350) + ee.arew("asqc", arxx(int ), (int)351);
        if (var20_11 || var20_11) ** GOTO lbl6
        ee.drawContentBackground(var0, var10_13, var9_12, (float)ee.arew("asqd", arxx(int ), (int)352), var8_8);
        if (var20_11 || var20_11) ** GOTO lbl6
        ee.drawContentBackground(var0, var11_14, var9_12, var4_4, var8_8);
        if (var20_11 || var20_11) ** GOTO lbl6
        switch (var5_5.type.ordinal()) {
            default: {
                if (var20_11 || var20_11) ** GOTO lbl6
                throw new MatchException(null, null);
            }
            case 0: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v0 = "D";
                if (!var22_9) break;
                throw null;
            }
            case 1: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v0 = "E";
                if (!var22_9) break;
                throw null;
            }
            case 2: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v0 = "F";
                if (!var22_9) break;
                throw null;
            }
            case 3: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v0 = var12_15 = "G";
            }
        }
        if (var20_11 || var20_11) ** GOTO lbl6
        switch (var5_5.type.ordinal()) {
            default: {
                if (var20_11 || var20_11) ** GOTO lbl6
                throw new MatchException(null, null);
            }
            case 0: 
            case 1: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v1 = ee.arew("asqe", arxx(int ), (int)353);
                if (!var22_9) break;
                throw null;
            }
            case 2: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v1 = ee.arew("asqf", arxx(int ), (int)354);
                if (!var22_9) break;
                throw null;
            }
            case 3: {
                if (var20_11 || var20_11) ** GOTO lbl6
                v1 = var13_16 = ee.arew("asqg", arxx(int ), (int)355);
            }
        }
        if (var20_11 || var20_11) ** GOTO lbl6
        var14_17 = var9_12 + ee.arew("asqh", arxx(int ), (int)356);
        if (var20_11 || var20_11) ** GOTO lbl6
        ee.drawIcon(var0, var7_7, var12_15, var10_13 + (ee.arew("asqi", arxx(int ), (int)357) - var13_16) * ee.arew("asqj", arxx(int ), (int)358), var14_17, (float)var13_16, nd.multAlpha(dz.color((int)ee.arew("asqk", aret(int ), (int)359)), var8_8));
        if (var20_11 || var20_11) ** GOTO lbl6
        var15_18 = var11_14 + ee.arew("asql", arxx(int ), (int)360);
        if (var20_11 || var20_11) ** GOTO lbl6
        var16_19 = ee.centeredTextY(var6_6, (float)ee.arew("asqm", arxx(int ), (int)361), var14_17);
        if (var20_11 || var20_11) ** GOTO lbl6
        var17_20 = var5_5.parts.iterator();
        if (var20_11) ** GOTO lbl6
        block85: while (true) {
            block151: {
                block150: {
                    if (var20_11 || var20_11) ** GOTO lbl6
                    if (!var17_20.hasNext()) ** GOTO lbl98
                    if (var20_11) ** GOTO lbl6
                    var18_21 = var17_20.next();
                    if (var20_11 || var20_11) ** GOTO lbl6
                    if (!var18_21.muted()) break block150;
                    if (var20_11) ** GOTO lbl6
                    v2 = ee.MUTED_TEXT_COLOR;
                    if (var22_9) {
                        throw null;
                    }
                    break block151;
                }
                if (var20_11 || var20_11) ** GOTO lbl6
                v2 = var19_22 = ee.TEXT_COLOR;
            }
            if (var20_11 || var20_11) ** GOTO lbl6
            if (var21_10 /* !! */  == 0) ** GOTO lbl-1000
            switch (var21_10 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    kq.text(var0, var6_6, var18_21.text(), var15_18, var16_19, (float)ee.arew("asqn", arxx(int ), (int)362), nd.multAlpha(var19_22, var8_8), (boolean)ee.arew("asqo", aret(int ), (int)363));
                    if (var20_11 || var20_11) ** GOTO lbl6
                    var15_18 += kq.width(var6_6, var18_21.text(), (float)ee.arew("asqp", arxx(int ), (int)364));
                    if (var20_11 || var20_11) ** GOTO lbl6
                    if (!var22_9) continue block85;
                    throw null;
                }
lbl98:
                // 1 sources

                if (var20_11 || var20_11) ** GOTO lbl6
                ki.outline(var0, var1_1, var2_2, var3_3, (float)ee.arew("asqq", arxx(int ), (int)365), (float)ee.arew("asqr", arxx(int ), (int)366), (float)ee.arew("asqs", arxx(int ), (int)367), nd.multAlpha(ee.BORDER_COLOR, var8_8), (boolean)ee.arew("asqt", aret(int ), (int)368));
                if (!var20_11 && !var20_11) ** break;
                ** continue;
                return;
                case 0: {
                    var21_10 /* !! */  = (int)ee.arew("asqu", aret(int ), (int)369);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
                case 1: {
                    var21_10 /* !! */  = (int)ee.arew("asqv", aret(int ), (int)370);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl113:
                // 2 sources

                case 2: {
                    var21_10 /* !! */  = (int)ee.arew("asqw", aret(int ), (int)371);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
lbl118:
                // 2 sources

                case 3: {
                    var21_10 /* !! */  = (int)ee.arew("asqx", aret(int ), (int)372);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl123:
                // 3 sources

                case 4: {
                    var21_10 /* !! */  = (int)ee.arew("asqy", aret(int ), (int)373);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl128:
                // 2 sources

                case 5: {
                    var21_10 /* !! */  = (int)ee.arew("asqz", aret(int ), (int)374);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl245
                }
lbl133:
                // 2 sources

                case 6: {
                    var21_10 /* !! */  = (int)ee.arew("asra", aret(int ), (int)375);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
                case 7: {
                    var21_10 /* !! */  = (int)ee.arew("asrb", aret(int ), (int)376);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl349
                }
                case 8: {
                    var21_10 /* !! */  = (int)ee.arew("asrc", aret(int ), (int)377);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl148:
                // 2 sources

                case 9: {
                    var21_10 /* !! */  = (int)ee.arew("asrd", aret(int ), (int)378);
                    if (!var22_9) break block85;
                    throw null;
                }
lbl152:
                // 2 sources

                case 10: {
                    var21_10 /* !! */  = (int)ee.arew("asre", aret(int ), (int)379);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl320
                }
lbl157:
                // 2 sources

                case 11: {
                    var21_10 /* !! */  = (int)ee.arew("asrf", aret(int ), (int)380);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl162:
                // 2 sources

                case 12: {
                    var21_10 /* !! */  = (int)ee.arew("asrg", aret(int ), (int)381);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl357
                }
                case 13: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var21_10 /* !! */  = (int)ee.arew("asrh", aret(int ), (int)382);
                        if (!var22_9) ** GOTO lbl133
                        throw null;
                    }
                }
lbl172:
                // 2 sources

                case 14: {
                    var21_10 /* !! */  = (int)ee.arew("asri", aret(int ), (int)383);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
lbl177:
                // 2 sources

                case 15: {
                    var21_10 /* !! */  = (int)ee.arew("asrj", aret(int ), (int)384);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl395
                }
lbl182:
                // 2 sources

                case 16: {
                    var21_10 /* !! */  = (int)ee.arew("asrk", aret(int ), (int)385);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
lbl187:
                // 2 sources

                case 17: {
                    var21_10 /* !! */  = (int)ee.arew("asrl", aret(int ), (int)386);
                    if (var22_9) {
                        throw null;
                    }
                }
lbl191:
                // 4 sources

                case 18: {
                    var21_10 /* !! */  = (int)ee.arew("asrm", aret(int ), (int)387);
                    if (var22_9) {
                        throw null;
                    }
                }
lbl195:
                // 5 sources

                case 19: {
                    var21_10 /* !! */  = (int)ee.arew("asrn", aret(int ), (int)388);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
                case 20: {
                    var21_10 /* !! */  = (int)ee.arew("asro", aret(int ), (int)389);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl366
                }
lbl205:
                // 3 sources

                case 21: {
                    var21_10 /* !! */  = (int)ee.arew("asrp", aret(int ), (int)390);
                    if (!var22_9) ** GOTO lbl128
                    throw null;
                }
lbl209:
                // 3 sources

                case 22: {
                    var21_10 /* !! */  = (int)ee.arew("asrq", aret(int ), (int)391);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl395
                }
                case 23: {
                    var21_10 /* !! */  = (int)ee.arew("asrr", aret(int ), (int)392);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl219:
                // 2 sources

                case 24: {
                    var21_10 /* !! */  = (int)ee.arew("asrs", aret(int ), (int)393);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl332
                }
lbl224:
                // 3 sources

                case 25: {
                    var21_10 /* !! */  = (int)ee.arew("asrt", aret(int ), (int)394);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
lbl229:
                // 2 sources

                case 26: {
                    var21_10 /* !! */  = (int)ee.arew("asru", aret(int ), (int)395);
                    if (!var22_9) ** GOTO lbl177
                    throw null;
                }
lbl233:
                // 3 sources

                case 27: {
                    var21_10 /* !! */  = (int)ee.arew("asrv", aret(int ), (int)396);
                    if (!var22_9) ** GOTO lbl219
                    throw null;
                }
lbl237:
                // 2 sources

                case 28: {
                    var21_10 /* !! */  = (int)ee.arew("asrw", aret(int ), (int)397);
                    if (!var22_9) ** GOTO lbl148
                    throw null;
                }
                case 29: {
                    var21_10 /* !! */  = (int)ee.arew("asrx", aret(int ), (int)398);
                    if (!var22_9) ** GOTO lbl182
                    throw null;
                }
lbl245:
                // 2 sources

                case 30: {
                    var21_10 /* !! */  = (int)ee.arew("asry", aret(int ), (int)399);
                    if (!var22_9) ** GOTO lbl157
                    throw null;
                }
                case 31: {
                    var21_10 /* !! */  = (int)ee.arew("asrz", aret(int ), (int)400);
                    if (!var22_9) ** GOTO lbl191
                    throw null;
                }
lbl253:
                // 2 sources

                case 32: {
                    var21_10 /* !! */  = (int)ee.arew("assa", aret(int ), (int)401);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl361
                }
lbl258:
                // 4 sources

                case 33: {
                    var21_10 /* !! */  = (int)ee.arew("assb", aret(int ), (int)402);
                    if (!var22_9) ** GOTO lbl205
                    throw null;
                }
                case 34: {
                    var21_10 /* !! */  = (int)ee.arew("assc", aret(int ), (int)403);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl395
                }
                case 35: {
                    var21_10 /* !! */  = (int)ee.arew("assd", aret(int ), (int)404);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl366
                }
lbl272:
                // 2 sources

                case 36: {
                    var21_10 /* !! */  = (int)ee.arew("asse", aret(int ), (int)405);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl395
                }
lbl277:
                // 2 sources

                case 37: {
                    var21_10 /* !! */  = (int)ee.arew("assf", aret(int ), (int)406);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl366
                }
                case 38: {
                    var21_10 /* !! */  = (int)ee.arew("assg", aret(int ), (int)407);
                    if (!var22_9) ** GOTO lbl205
                    throw null;
                }
lbl286:
                // 3 sources

                case 39: {
                    var21_10 /* !! */  = (int)ee.arew("assh", aret(int ), (int)408);
                    if (!var22_9) break block85;
                    throw null;
                }
lbl290:
                // 3 sources

                case 40: {
                    var21_10 /* !! */  = (int)ee.arew("assi", aret(int ), (int)409);
                    if (!var22_9) ** GOTO lbl123
                    throw null;
                }
lbl294:
                // 2 sources

                case 41: {
                    var21_10 /* !! */  = (int)ee.arew("assj", aret(int ), (int)410);
                    if (!var22_9) ** GOTO lbl258
                    throw null;
                }
                case 42: {
                    var21_10 /* !! */  = (int)ee.arew("assk", aret(int ), (int)411);
                    if (!var22_9) ** GOTO lbl162
                    throw null;
                }
lbl302:
                // 2 sources

                case 43: {
                    var21_10 /* !! */  = (int)ee.arew("assl", aret(int ), (int)412);
                    if (!var22_9) ** GOTO lbl172
                    throw null;
                }
lbl306:
                // 2 sources

                case 44: {
                    var21_10 /* !! */  = (int)ee.arew("assm", aret(int ), (int)413);
                    if (!var22_9) ** GOTO lbl195
                    throw null;
                }
                case 45: {
                    var21_10 /* !! */  = (int)ee.arew("assn", aret(int ), (int)414);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl353
                }
lbl315:
                // 2 sources

                case 46: {
                    var21_10 /* !! */  = (int)ee.arew("asso", aret(int ), (int)415);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl374
                }
lbl320:
                // 2 sources

                case 47: {
                    var21_10 /* !! */  = (int)ee.arew("assp", aret(int ), (int)416);
                    if (!var22_9) ** GOTO lbl277
                    throw null;
                }
lbl324:
                // 3 sources

                case 48: {
                    var21_10 /* !! */  = (int)ee.arew("assq", aret(int ), (int)417);
                    if (!var22_9) ** GOTO lbl229
                    throw null;
                }
                case 49: {
                    var21_10 /* !! */  = (int)ee.arew("assr", aret(int ), (int)418);
                    if (!var22_9) ** GOTO lbl290
                    throw null;
                }
lbl332:
                // 2 sources

                case 50: {
                    var21_10 /* !! */  = (int)ee.arew("asss", aret(int ), (int)419);
                    if (!var22_9) break block85;
                    throw null;
                }
                case 51: {
                    var21_10 /* !! */  = (int)ee.arew("asst", aret(int ), (int)420);
                    if (!var22_9) ** GOTO lbl258
                    throw null;
                }
                case 52: {
                    var21_10 /* !! */  = (int)ee.arew("assu", aret(int ), (int)421);
                    if (!var22_9) ** GOTO lbl123
                    throw null;
                }
                case 53: {
                    var21_10 /* !! */  = (int)ee.arew("assv", aret(int ), (int)422);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl374
                }
lbl349:
                // 2 sources

                case 54: {
                    var21_10 /* !! */  = (int)ee.arew("assw", aret(int ), (int)423);
                    if (!var22_9) ** GOTO lbl253
                    throw null;
                }
lbl353:
                // 2 sources

                case 55: {
                    var21_10 /* !! */  = (int)ee.arew("assx", aret(int ), (int)424);
                    if (!var22_9) ** GOTO lbl113
                    throw null;
                }
lbl357:
                // 2 sources

                case 56: {
                    var21_10 /* !! */  = (int)ee.arew("assy", aret(int ), (int)425);
                    if (!var22_9) ** GOTO lbl258
                    throw null;
                }
lbl361:
                // 2 sources

                case 57: {
                    var21_10 /* !! */  = (int)ee.arew("assz", aret(int ), (int)426);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl408
                }
lbl366:
                // 5 sources

                case 58: {
                    var21_10 /* !! */  = (int)ee.arew("asta", aret(int ), (int)427);
                    if (!var22_9) ** GOTO lbl118
                    throw null;
                }
                case 59: {
                    var21_10 /* !! */  = (int)ee.arew("astb", aret(int ), (int)428);
                    if (!var22_9) ** GOTO lbl302
                    throw null;
                }
lbl374:
                // 3 sources

                case 60: {
                    var21_10 /* !! */  = (int)ee.arew("astc", aret(int ), (int)429);
                    if (!var22_9) ** GOTO lbl195
                    throw null;
                }
                case 61: {
                    var21_10 /* !! */  = (int)ee.arew("astd", aret(int ), (int)430);
                    if (!var22_9) ** GOTO lbl286
                    throw null;
                }
                case 62: {
                    var21_10 /* !! */  = (int)ee.arew("aste", aret(int ), (int)431);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl395
                }
                case 63: {
                    var21_10 /* !! */  = (int)ee.arew("astf", aret(int ), (int)432);
                    if (!var22_9) break block85;
                    throw null;
                }
                case 64: {
                    var21_10 /* !! */  = (int)ee.arew("astg", aret(int ), (int)433);
                    if (!var22_9) ** GOTO lbl272
                    throw null;
                }
lbl395:
                // 6 sources

                case 65: {
                    var21_10 /* !! */  = (int)ee.arew("asth", aret(int ), (int)434);
                    if (!var22_9) ** GOTO lbl306
                    throw null;
                }
                case 66: {
                    var21_10 /* !! */  = (int)ee.arew("asti", aret(int ), (int)435);
                    if (!var22_9) ** GOTO lbl366
                    throw null;
                }
                case 67: {
                    var21_10 /* !! */  = (int)ee.arew("astj", aret(int ), (int)436);
                    if (var22_9) {
                        throw null;
                    }
                    ** GOTO lbl412
                }
lbl408:
                // 2 sources

                case 68: {
                    var21_10 /* !! */  = (int)ee.arew("astk", aret(int ), (int)437);
                    if (!var22_9) ** GOTO lbl209
                    throw null;
                }
lbl412:
                // 2 sources

                case 69: {
                    var21_10 /* !! */  = (int)ee.arew("astl", aret(int ), (int)438);
                    if (!var22_9) ** GOTO lbl324
                    throw null;
                }
                case 70: 
            }
            break;
        }
        var21_10 /* !! */  = (int)ee.arew("astm", aret(int ), (int)439);
        ** while (!var22_9)
lbl419:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void atdz() {
        ee.areu[100] = 903714664;
        ee.areu[101] = 916587028;
        ee.areu[102] = -79210020;
        ee.areu[103] = -1991929305;
        ee.areu[104] = 196581862;
        ee.areu[105] = 328327474;
        ee.areu[106] = 1198035505;
        ee.areu[107] = 1863766002;
        ee.areu[108] = 1613835846;
        ee.areu[109] = -1510395317;
        ee.areu[110] = -1344406067;
        ee.areu[111] = 1579891331;
        ee.areu[112] = 636291995;
        ee.areu[113] = -685029665;
        ee.areu[114] = -83066505;
        ee.areu[115] = -106771502;
        ee.areu[116] = 132597971;
        ee.areu[117] = -1130561979;
        ee.areu[118] = 1695016772;
        ee.areu[119] = 652327024;
        ee.areu[120] = -1190332779;
        ee.areu[121] = 1136400388;
        ee.areu[122] = -1638352088;
        ee.areu[123] = 1265191594;
        ee.areu[124] = -1835362763;
        ee.areu[125] = 1977956012;
        ee.areu[126] = -373756037;
        ee.areu[127] = -1603790485;
        ee.areu[128] = -2137927425;
        ee.areu[129] = -1505333932;
        ee.areu[130] = -467009453;
        ee.areu[131] = 1702808156;
        ee.areu[132] = 25933774;
        ee.areu[133] = -1087252312;
        ee.areu[134] = -232063695;
        ee.areu[135] = 724443194;
        ee.areu[136] = 1012266211;
        ee.areu[137] = -719418970;
        ee.areu[138] = -1783870794;
        ee.areu[139] = -1925748431;
        ee.areu[140] = -1978610346;
        ee.areu[141] = 24218485;
        ee.areu[142] = 1640946462;
        ee.areu[143] = 107811973;
        ee.areu[144] = -1312842987;
        ee.areu[145] = 721585742;
        ee.areu[146] = 2002891900;
        ee.areu[147] = -943043764;
        ee.areu[148] = -474782090;
        ee.areu[149] = -1009195834;
        ee.areu[150] = -1433672638;
        ee.areu[151] = -1816838902;
        ee.areu[152] = -1764579781;
        ee.areu[153] = 853091465;
        ee.areu[154] = -903233415;
        ee.areu[155] = -63556469;
        ee.areu[156] = -884948;
        ee.areu[157] = 3291085;
        ee.areu[158] = -1448341456;
        ee.areu[159] = -650631299;
        ee.areu[160] = 472365328;
        ee.areu[161] = 1614241204;
        ee.areu[162] = 1535750269;
        ee.areu[163] = -2043035049;
        ee.areu[164] = -615796006;
        ee.areu[165] = 1606969885;
        ee.areu[166] = 1298339145;
        ee.areu[167] = -2111899952;
        ee.areu[168] = -2080266486;
        ee.areu[169] = -281826745;
        ee.areu[170] = 1974026468;
        ee.areu[171] = 669136164;
        ee.areu[172] = -1590655511;
        ee.areu[173] = -790594694;
        ee.areu[174] = -1023180076;
        ee.areu[175] = -1666513449;
        ee.areu[176] = 348816800;
        ee.areu[177] = -2027923404;
        ee.areu[178] = -1842446011;
        ee.areu[179] = -199016028;
        ee.areu[180] = 142698570;
        ee.areu[181] = -1029614480;
        ee.areu[182] = -2129297621;
        ee.areu[183] = 213355018;
        ee.areu[184] = 140511274;
        ee.areu[185] = -1093245711;
        ee.areu[186] = 843532607;
        ee.areu[187] = -2125325065;
        ee.areu[188] = -977432813;
        ee.areu[189] = 1829335736;
        ee.areu[190] = -313480678;
        ee.areu[191] = -668186792;
        ee.areu[192] = -664515168;
        ee.areu[193] = 87617718;
        ee.areu[194] = -69668170;
        ee.areu[195] = 201123183;
        ee.areu[196] = 1382965748;
        ee.areu[197] = 780744487;
        ee.areu[198] = 152921856;
        ee.areu[199] = -1126491082;
    }

    private static /* synthetic */ void atio() {
        ee.arfa[0] = 3728669747014933848L;
        ee.arfa[1] = -8895559759300860682L;
        ee.arfa[2] = 2754767043464143436L;
        ee.arfa[3] = -3527859733202355995L;
        ee.arfa[4] = 8742384826333101264L;
        ee.arfa[5] = -4130052080562054849L;
        ee.arfa[6] = -4677801751588309033L;
        ee.arfa[7] = 5363571974826039113L;
        ee.arfa[8] = -6069649299817961750L;
        ee.arfa[9] = 6203480571236572591L;
        ee.arfa[10] = -4770303406859091142L;
        ee.arfa[11] = 742578189119188772L;
        ee.arfa[12] = 6569994667243616288L;
        ee.arfa[13] = 2841514821793102981L;
        ee.arfa[14] = 7655293024512345342L;
        ee.arfa[15] = -3284707693190320499L;
        ee.arfa[16] = -4759727863922406056L;
        ee.arfa[17] = -2962140282050411298L;
        ee.arfa[18] = 1416922634467878178L;
        ee.arfa[19] = -4816161422486553788L;
        ee.arfa[20] = -7154084010010118872L;
        ee.arfa[21] = 2904489999465281189L;
        ee.arfa[22] = -1115183056095412577L;
        ee.arfa[23] = 5076556232050124495L;
        ee.arfa[24] = 3342666495535115425L;
        ee.arfa[25] = -3077250777591836393L;
        ee.arfa[26] = 5047381685811493259L;
        ee.arfa[27] = 4117467380273425425L;
        ee.arfa[28] = 8536425745506504666L;
        ee.arfa[29] = 6323124116240170387L;
        ee.arfa[30] = 5295849777224628858L;
        ee.arfa[31] = 4216259647048696277L;
        ee.arfa[32] = -8748215874657971217L;
        ee.arfa[33] = -2135247929004059014L;
        ee.arfa[34] = -2712430247950421933L;
        ee.arfa[35] = -3219008365174360301L;
        ee.arfa[36] = 6159718110566411990L;
        ee.arfa[37] = -6532924072547056031L;
        ee.arfa[38] = 4392342649351156864L;
        ee.arfa[39] = 5613790189675209060L;
        ee.arfa[40] = 4876598507995297241L;
        ee.arfa[41] = -8992711111779095738L;
        ee.arfa[42] = 5979471888267011045L;
        ee.arfa[43] = 7870656977768890802L;
        ee.arfa[44] = 693526572785793793L;
        ee.arfa[45] = -4332023316683846970L;
        ee.arfa[46] = 2312887686451407719L;
        ee.arfa[47] = -6594469409112177935L;
        ee.arfa[48] = -3822289713902977774L;
        ee.arfa[49] = -1382474985263632485L;
        ee.arfa[50] = 1828619336812571820L;
        ee.arfa[51] = 1623161622539346783L;
        ee.arfa[52] = 786433900926777101L;
        ee.arfa[53] = -5914531618079209356L;
        ee.arfa[54] = -4476501771468777735L;
        ee.arfa[55] = -5198941424461860902L;
        ee.arfa[56] = 4879787181430441679L;
        ee.arfa[57] = 5823914898716172010L;
        ee.arfa[58] = -7263815684877112477L;
        ee.arfa[59] = -1476509206037642011L;
        ee.arfa[60] = 26121143889756191L;
        ee.arfa[61] = 2369776737276990941L;
        ee.arfa[62] = 5107650774379746227L;
        ee.arfa[63] = 4132273891145957784L;
        ee.arfa[64] = -86868226652602745L;
        ee.arfa[65] = -8482547485848996546L;
        ee.arfa[66] = -8435964524080482225L;
        ee.arfa[67] = -8398072104495485414L;
        ee.arfa[68] = -2112601460689787920L;
        ee.arfa[69] = 5765902488753204437L;
        ee.arfa[70] = -8820403905574708459L;
        ee.arfa[71] = -4978383600502940598L;
        ee.arfa[72] = 6628593280102778598L;
        ee.arfa[73] = 6015829149514995542L;
        ee.arfa[74] = 6660948274966173413L;
        ee.arfa[75] = -7219447888335955481L;
        ee.arfa[76] = 5620030204427330977L;
        ee.arfa[77] = -2502779886321739399L;
        ee.arfa[78] = 5907810853632979307L;
        ee.arfa[79] = -1221321646618085319L;
        ee.arfa[80] = 4799283404412255456L;
        ee.arfa[81] = 5399494947926899683L;
        ee.arfa[82] = 2691641932971159582L;
        ee.arfa[83] = -492326554331705405L;
        ee.arfa[84] = -8132811563473700036L;
        ee.arfa[85] = -7626227666870501076L;
        ee.arfa[86] = -9128429068975912870L;
        ee.arfa[87] = 9063937797876659000L;
        ee.arfa[88] = 5454324212594421323L;
        ee.arfa[89] = 4089343865244916800L;
        ee.arfa[90] = -1193192069412884957L;
        ee.arfa[91] = 4895830757976299463L;
        ee.arfa[92] = -6202732036692995349L;
        ee.arfa[93] = 4457322979698792639L;
        ee.arfa[94] = -2037169885708251429L;
        ee.arfa[95] = -5272303941457079871L;
        ee.arfa[96] = -2596330510435853542L;
        ee.arfa[97] = 7212409709865673566L;
        ee.arfa[98] = -3326406337597621771L;
        ee.arfa[99] = -3669730755849623018L;
    }
}

