/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 *  net.minecraft.class_11659
 *  net.minecraft.class_12075
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_4587
 *  net.minecraft.class_922
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
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
import java.util.function.Predicate;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import net.minecraft.class_922;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import ruhack.phobia.a.bm;
import ruhack.phobia.aw;
import ruhack.phobia.bj;
import ruhack.phobia.di;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jg$Ghost;
import ruhack.phobia.jx;
import ruhack.phobia.kg;

public final class jg
extends ds {
    private final kg lifetime;
    private static final List<jg$Ghost> GHOSTS;
    private static final int HARD_COPY_LIMIT = 24;
    public static final int b;
    private static long[] afbu;
    private static long lifetimeNanos;
    public static final boolean a;
    private static final int GHOST_ALPHA = 128;
    private static int[] afax;
    private static int[] afaw;
    private static long[] afbt;
    private final kg riseSpeed;
    private static float configuredRiseHeight;
    private static boolean ghostRenderPass;
    private final kg riseHeight;
    public static final boolean c;
    private static float configuredRiseSpeed;
    protected static final long bt = -6115044685367483051L;

    private static /* synthetic */ void afsv() {
        jg.afbu[100] = -8323787022417068461L;
        jg.afbu[101] = 7315806688791162478L;
        jg.afbu[102] = 3479017244210974334L;
        jg.afbu[103] = -1649536255364438646L;
        jg.afbu[104] = 8155886519039874945L;
        jg.afbu[105] = 7220328744277368766L;
        jg.afbu[106] = 3973390555044351181L;
        jg.afbu[107] = 7664716767666445533L;
        jg.afbu[108] = -8488039563838956695L;
        jg.afbu[109] = 8029565347131194687L;
        jg.afbu[110] = -1218527493534905121L;
        jg.afbu[111] = -1158681527885691791L;
        jg.afbu[112] = -5713450228922375450L;
        jg.afbu[113] = 6546812180617934900L;
        jg.afbu[114] = -7071352295667643391L;
        jg.afbu[115] = -8751618963640698552L;
        jg.afbu[116] = -516721837788049746L;
        jg.afbu[117] = 3486739623603990L;
        jg.afbu[118] = 5568017510714879286L;
        jg.afbu[119] = 498141623220440640L;
        jg.afbu[120] = -2512917497753292591L;
        jg.afbu[121] = 2413302692640256738L;
        jg.afbu[122] = -218388938364912207L;
        jg.afbu[123] = -7245477474804584934L;
        jg.afbu[124] = 1781765808025604166L;
        jg.afbu[125] = 1889194743328904796L;
        jg.afbu[126] = 7831153757688992603L;
        jg.afbu[127] = 2927778596084754217L;
        jg.afbu[128] = -5874747952035061373L;
        jg.afbu[129] = 4988359529553045481L;
        jg.afbu[130] = 8876704037116124831L;
        jg.afbu[131] = 6422125366070402567L;
        jg.afbu[132] = 4452717088435993375L;
        jg.afbu[133] = -7404822192127647194L;
        jg.afbu[134] = 5220851771447300982L;
        jg.afbu[135] = 239138422771164749L;
        jg.afbu[136] = -4849659576395382392L;
        jg.afbu[137] = 325107241956992539L;
        jg.afbu[138] = 346402786306931274L;
        jg.afbu[139] = -7002170674264668848L;
        jg.afbu[140] = 5645189752665912157L;
        jg.afbu[141] = -4861568815231205349L;
        jg.afbu[142] = -71379913713060329L;
        jg.afbu[143] = 1245482284459088830L;
        jg.afbu[144] = -8832385346838480177L;
        jg.afbu[145] = -3232823298087785355L;
        jg.afbu[146] = -4599288445412858392L;
        jg.afbu[147] = 1407298825276233299L;
        jg.afbu[148] = -1243850570654781463L;
        jg.afbu[149] = -1992004965803165673L;
        jg.afbu[150] = -7496141661088046770L;
        jg.afbu[151] = 8661070409609254993L;
        jg.afbu[152] = -8627785052404827976L;
        jg.afbu[153] = 5696735542983267123L;
        jg.afbu[154] = 2802981664979168997L;
        jg.afbu[155] = 7772932516973750356L;
        jg.afbu[156] = 1366971286665466136L;
        jg.afbu[157] = -1984931388816981097L;
        jg.afbu[158] = 8958216524839356492L;
        jg.afbu[159] = -8806141370651460110L;
    }

    private static /* synthetic */ double afmn(int n2) {
        return Double.longBitsToDouble(afbt[n2] ^ afbu[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void syncSettings() {
        v0 /* !! */  = jg.bt;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - jg.afay("afjf", afbs(int ), (int)83));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2122660982: {
                    v1 = jg.afay("afjg", afbs(int ), (int)84);
                    continue block53;
                }
                case -1034607166: {
                    v1 = jg.afay("afjh", afbs(int ), (int)85);
                    continue block53;
                }
                case -284695211: {
                    break block53;
                }
            }
            break;
        }
        var3_1 = jg.c;
        v2 /* !! */  = jg.bt;
        if (true) ** GOTO lbl19
        block54: while (true) {
            v2 /* !! */  = (long)(jg.afay("afjj", afbs(int ), (int)87) - jg.afay("afji", afbs(int ), (int)86));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1518832891: {
                    continue block54;
                }
                case -284695211: {
                    break block54;
                }
            }
            break;
        }
        var2_2 /* !! */  = jg.b;
        v3 /* !! */  = jg.bt;
        if (true) ** GOTO lbl29
        block55: while (true) {
            v3 /* !! */  = (long)(jg.afay("afjl", afbs(int ), (int)89) - jg.afay("afjk", afbs(int ), (int)88));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -674611767: {
                    continue block55;
                }
                case -284695211: {
                    break block55;
                }
            }
            break;
        }
        var1_3 = jg.a;
        if (var3_1) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        v4 /* !! */  = jg.bt;
        if (true) ** GOTO lbl44
        block57: while (true) {
            v4 /* !! */  = (long)(v5 - jg.afay("afjm", afbs(int ), (int)90));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2008869795: {
                    v5 = jg.afay("afjn", afbs(int ), (int)91);
                    continue block57;
                }
                case -284695211: {
                    break block57;
                }
                case 51063426: {
                    v5 = jg.afay("afjo", afbs(int ), (int)92);
                    continue block57;
                }
                case 1826915020: {
                    v5 = jg.afay("afjp", afbs(int ), (int)93);
                    continue block57;
                }
            }
            break;
        }
        v6 /* !! */  = jg.bt;
        if (true) ** GOTO lbl60
        block58: while (true) {
            v6 /* !! */  = (long)(v7 - jg.afay("afjq", afbs(int ), (int)94));
lbl60:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1097564435: {
                    v7 = jg.afay("afjr", afbs(int ), (int)95);
                    continue block58;
                }
                case -874784413: {
                    v7 = jg.afay("afjs", afbs(int ), (int)96);
                    continue block58;
                }
                case -284695211: {
                    break block58;
                }
            }
            break;
        }
        v8 = (long)(this.lifetime.getValue() * jg.afay("afjt", afav(int ), (int)127));
        v9 /* !! */  = jg.bt;
        if (true) ** GOTO lbl74
        block59: while (true) {
            v9 /* !! */  = (long)(jg.afay("afjv", afbs(int ), (int)98) - jg.afay("afju", afbs(int ), (int)97));
lbl74:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1173045173: {
                    continue block59;
                }
                case -284695211: {
                    break block59;
                }
            }
            break;
        }
        jg.lifetimeNanos = v8;
        if (var1_3 || var1_3) ** GOTO lbl37
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afjw", afbs(int ), (int)99)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == jg.afay("afjx", afbk(int ), (int)128)) break;
            v10 /* !! */  = (long)jg.afay("afjy", afbk(int ), (int)129);
        }
        v11 /* !! */  = jg.bt;
        if (true) ** GOTO lbl90
        block61: while (true) {
            v11 /* !! */  = (long)(jg.afay("afka", afbs(int ), (int)101) - jg.afay("afjz", afbs(int ), (int)100));
lbl90:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -284695211: {
                    break block61;
                }
                case 2109397509: {
                    continue block61;
                }
            }
            break;
        }
        v12 = this.riseHeight.getValue();
        v13 /* !! */  = jg.bt;
        if (true) ** GOTO lbl100
        block62: while (true) {
            v13 /* !! */  = (long)(jg.afay("afkc", afbs(int ), (int)103) - jg.afay("afkb", afbs(int ), (int)102));
lbl100:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -356451596: {
                    continue block62;
                }
                case -284695211: {
                    break block62;
                }
            }
            break;
        }
        jg.configuredRiseHeight = v12;
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afkd", afbs(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == jg.afay("afke", afbk(int ), (int)130)) break;
                    v14 /* !! */  = (long)jg.afay("afkf", afbk(int ), (int)131);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("afkg", afbs(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == jg.afay("afkh", afbk(int ), (int)132)) break;
                    v15 /* !! */  = (long)jg.afay("afki", afbk(int ), (int)133);
                }
                v16 = this.riseSpeed.getValue();
                v17 /* !! */  = jg.bt;
                if (true) ** GOTO lbl126
                block65: while (true) {
                    v17 /* !! */  = (long)(v18 - jg.afay("afkj", afbs(int ), (int)106));
lbl126:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1829570260: {
                            v18 = jg.afay("afkk", afbs(int ), (int)107);
                            continue block65;
                        }
                        case -284695211: {
                            break block65;
                        }
                        case 1664564450: {
                            v18 = jg.afay("afkl", afbs(int ), (int)108);
                            continue block65;
                        }
                    }
                    break;
                }
                jg.configuredRiseSpeed = v16;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl139:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jg.afay("afkm", afbk(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 1: {
                var2_2 /* !! */  = (int)jg.afay("afkn", afbk(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
            }
lbl148:
            // 5 sources

            case 2: {
                var2_2 /* !! */  = (int)jg.afay("afko", afbk(int ), (int)136);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jg.afay("afkp", afbk(int ), (int)137);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jg.afay("afkq", afbk(int ), (int)138);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
lbl160:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)jg.afay("afkr", afbk(int ), (int)139);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl165:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jg.afay("afks", afbk(int ), (int)140);
                    if (!var3_1) ** GOTO lbl160
                    throw null;
                }
            }
lbl170:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)jg.afay("afkt", afbk(int ), (int)141);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)jg.afay("afku", afbk(int ), (int)142);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)jg.afay("afkv", afbk(int ), (int)143);
        ** while (!var3_1)
lbl181:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float afav(int n2) {
        return Float.intBitsToFloat(afaw[n2] ^ afax[n2]);
    }

    private static /* synthetic */ void afsu() {
        jg.afbu[0] = -4049410090870361088L;
        jg.afbu[1] = 8857657532560885577L;
        jg.afbu[2] = -2770224152628781192L;
        jg.afbu[3] = 1099029829449534694L;
        jg.afbu[4] = 3602026816209967112L;
        jg.afbu[5] = 1611013416862721033L;
        jg.afbu[6] = -301208163181664577L;
        jg.afbu[7] = -5910718365822898825L;
        jg.afbu[8] = -1947777755095242077L;
        jg.afbu[9] = -8758483485845961185L;
        jg.afbu[10] = 178229564088547022L;
        jg.afbu[11] = 3373622002929790184L;
        jg.afbu[12] = -3203757732303452896L;
        jg.afbu[13] = -7578083215895463478L;
        jg.afbu[14] = 872052834295453638L;
        jg.afbu[15] = 2085532876845457433L;
        jg.afbu[16] = -3026015203045307748L;
        jg.afbu[17] = 8634904330291076622L;
        jg.afbu[18] = 4856619676289446000L;
        jg.afbu[19] = 9037511950806825402L;
        jg.afbu[20] = -7876661464105953298L;
        jg.afbu[21] = -415009063421418143L;
        jg.afbu[22] = 7631010262944209078L;
        jg.afbu[23] = 362957025397441904L;
        jg.afbu[24] = 9027275138952962488L;
        jg.afbu[25] = 4523863128221130404L;
        jg.afbu[26] = -5129235312968634445L;
        jg.afbu[27] = 6373236464743875587L;
        jg.afbu[28] = 4034063814229601813L;
        jg.afbu[29] = -3059811961044933835L;
        jg.afbu[30] = -2879446807886303945L;
        jg.afbu[31] = -941303248305877356L;
        jg.afbu[32] = 6348689600082866727L;
        jg.afbu[33] = 1238945186378604594L;
        jg.afbu[34] = 7039514634289611746L;
        jg.afbu[35] = 8405042387193804054L;
        jg.afbu[36] = -8002063103640091255L;
        jg.afbu[37] = -6391315865335280777L;
        jg.afbu[38] = -8231612812022051584L;
        jg.afbu[39] = -7666271659093891727L;
        jg.afbu[40] = -5320040431074514948L;
        jg.afbu[41] = -8083149760897150121L;
        jg.afbu[42] = 1749732979606283575L;
        jg.afbu[43] = -3703672851471322931L;
        jg.afbu[44] = 7704518361066282871L;
        jg.afbu[45] = -1283951921194096012L;
        jg.afbu[46] = 2297581127325790197L;
        jg.afbu[47] = -6143529517843787244L;
        jg.afbu[48] = -6824819058389219888L;
        jg.afbu[49] = -4912198591533929872L;
        jg.afbu[50] = 5711775607735911838L;
        jg.afbu[51] = -5395789504761607832L;
        jg.afbu[52] = 2479793159811592580L;
        jg.afbu[53] = -6243347071768410232L;
        jg.afbu[54] = 6188253843563825659L;
        jg.afbu[55] = -6247543836310497175L;
        jg.afbu[56] = -6804989807063828777L;
        jg.afbu[57] = -8973519839238486697L;
        jg.afbu[58] = -7840759784631239547L;
        jg.afbu[59] = 1549513981087657523L;
        jg.afbu[60] = 3383307445394456980L;
        jg.afbu[61] = 1617957512123266203L;
        jg.afbu[62] = -2984537812549916554L;
        jg.afbu[63] = -2419179251351751353L;
        jg.afbu[64] = 8747753171546931590L;
        jg.afbu[65] = -7770511127303210123L;
        jg.afbu[66] = -2539317668338909395L;
        jg.afbu[67] = -5448331287878426803L;
        jg.afbu[68] = -3542902997701206506L;
        jg.afbu[69] = 2285737566082412546L;
        jg.afbu[70] = 5704171025245828391L;
        jg.afbu[71] = -7047229037949773699L;
        jg.afbu[72] = -8365590272993121301L;
        jg.afbu[73] = 2720799105670323369L;
        jg.afbu[74] = -6699567616403097425L;
        jg.afbu[75] = 9073889051802318038L;
        jg.afbu[76] = 4570020242129560367L;
        jg.afbu[77] = -5818099327158139346L;
        jg.afbu[78] = 3121521638001497425L;
        jg.afbu[79] = -2184854730524715520L;
        jg.afbu[80] = 968813182808841547L;
        jg.afbu[81] = -1021415132650391239L;
        jg.afbu[82] = -880850099704094150L;
        jg.afbu[83] = 1469964979083096389L;
        jg.afbu[84] = 4673735391782613236L;
        jg.afbu[85] = -6624432814394384292L;
        jg.afbu[86] = -6823477399780330640L;
        jg.afbu[87] = -2236879532399547183L;
        jg.afbu[88] = 778653478944149769L;
        jg.afbu[89] = -2227686686267387117L;
        jg.afbu[90] = 8137817692374604243L;
        jg.afbu[91] = -5723654596428387740L;
        jg.afbu[92] = 4381882731930937710L;
        jg.afbu[93] = 4026693727428744669L;
        jg.afbu[94] = 5625081750825478574L;
        jg.afbu[95] = 6318099073866629557L;
        jg.afbu[96] = -6056062725321630850L;
        jg.afbu[97] = 7577993301877090821L;
        jg.afbu[98] = 2574803347656925788L;
        jg.afbu[99] = -4199925244734972130L;
    }

    private static /* synthetic */ long afbs(int n2) {
        return afbt[n2] ^ afbu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afbv", afbs(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jg.afay("afbw", afbk(int ), (int)18)) break;
            v0 /* !! */  = (long)jg.afay("afbx", afbk(int ), (int)19);
        }
        var3_1 = jg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afby", afbs(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jg.afay("afbz", afbk(int ), (int)20)) break;
            v1 /* !! */  = (long)jg.afay("afca", afbk(int ), (int)21);
        }
        var2_2 /* !! */  = jg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("afcb", afbs(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jg.afay("afcc", afbk(int ), (int)22)) break;
            v2 /* !! */  = (long)jg.afay("afcd", afbk(int ), (int)23);
        }
        var1_3 = jg.a;
        if (var3_1) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jg.bt - jg.afay("afce", afbs(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == jg.afay("afcf", afbk(int ), (int)24)) break;
                    v3 /* !! */  = (long)jg.afay("afcg", afbk(int ), (int)25);
                }
                jg.clear();
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = jg.bt - jg.afay("afch", afbs(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jg.afay("afci", afbk(int ), (int)26)) break;
                    v4 /* !! */  = (long)jg.afay("afcj", afbk(int ), (int)27);
                }
                this.syncSettings();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl44:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jg.afay("afck", afbk(int ), (int)28);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jg.afay("afcl", afbk(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl58
            }
lbl54:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jg.afay("afcm", afbk(int ), (int)30);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
lbl58:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)jg.afay("afcn", afbk(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)jg.afay("afco", afbk(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 5: {
                var2_2 /* !! */  = (int)jg.afay("afcp", afbk(int ), (int)33);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
lbl71:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jg.afay("afcq", afbk(int ), (int)34);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)jg.afay("afcr", afbk(int ), (int)35);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void afsp() {
        jg.afax[0] = -2002717272;
        jg.afax[1] = -801731653;
        jg.afax[2] = 762697711;
        jg.afax[3] = 2011251778;
        jg.afax[4] = -1018796716;
        jg.afax[5] = -1942100434;
        jg.afax[6] = -210035961;
        jg.afax[7] = 1867024678;
        jg.afax[8] = 1188532828;
        jg.afax[9] = 14094089;
        jg.afax[10] = 1606745430;
        jg.afax[11] = -1957100723;
        jg.afax[12] = 1429754482;
        jg.afax[13] = 1326441947;
        jg.afax[14] = 883722937;
        jg.afax[15] = -205623765;
        jg.afax[16] = 1030656811;
        jg.afax[17] = -994683719;
        jg.afax[18] = -1208661462;
        jg.afax[19] = 1217980314;
        jg.afax[20] = -779369603;
        jg.afax[21] = -1855388446;
        jg.afax[22] = 1715532358;
        jg.afax[23] = 1127193404;
        jg.afax[24] = -1739544675;
        jg.afax[25] = -1661052756;
        jg.afax[26] = 929223605;
        jg.afax[27] = -2003517725;
        jg.afax[28] = -786139835;
        jg.afax[29] = 532078561;
        jg.afax[30] = 52114749;
        jg.afax[31] = 1901177045;
        jg.afax[32] = -188179723;
        jg.afax[33] = -1549390921;
        jg.afax[34] = 166337288;
        jg.afax[35] = -331410039;
        jg.afax[36] = -252371985;
        jg.afax[37] = -1450226641;
        jg.afax[38] = 1349555650;
        jg.afax[39] = -1973656049;
        jg.afax[40] = -2099432659;
        jg.afax[41] = 522136065;
        jg.afax[42] = -1445552690;
        jg.afax[43] = 1382176388;
        jg.afax[44] = 2098223390;
        jg.afax[45] = 1504407870;
        jg.afax[46] = -716346857;
        jg.afax[47] = -456753575;
        jg.afax[48] = -2038827188;
        jg.afax[49] = 660563200;
        jg.afax[50] = -264990416;
        jg.afax[51] = 1190716336;
        jg.afax[52] = -705415483;
        jg.afax[53] = 717787632;
        jg.afax[54] = -1431250553;
        jg.afax[55] = 1105400109;
        jg.afax[56] = 63590790;
        jg.afax[57] = -1326125592;
        jg.afax[58] = 1429118440;
        jg.afax[59] = 1179370733;
        jg.afax[60] = 1265883644;
        jg.afax[61] = 331561565;
        jg.afax[62] = 1368463070;
        jg.afax[63] = 1045096998;
        jg.afax[64] = 821226580;
        jg.afax[65] = -561176836;
        jg.afax[66] = -1213152584;
        jg.afax[67] = -393508418;
        jg.afax[68] = 1327879159;
        jg.afax[69] = -1271429423;
        jg.afax[70] = 853155999;
        jg.afax[71] = 840598197;
        jg.afax[72] = -1150826955;
        jg.afax[73] = -959625314;
        jg.afax[74] = 1380873141;
        jg.afax[75] = 111017233;
        jg.afax[76] = 1240030216;
        jg.afax[77] = -576140264;
        jg.afax[78] = -1239161088;
        jg.afax[79] = -1379427178;
        jg.afax[80] = 1737944383;
        jg.afax[81] = -509613321;
        jg.afax[82] = 1875259222;
        jg.afax[83] = 1602518280;
        jg.afax[84] = 1190367788;
        jg.afax[85] = -1061156905;
        jg.afax[86] = -945691651;
        jg.afax[87] = -1528065546;
        jg.afax[88] = -923502440;
        jg.afax[89] = -1565380401;
        jg.afax[90] = 2052768098;
        jg.afax[91] = -2014641201;
        jg.afax[92] = -1193437439;
        jg.afax[93] = 1985797612;
        jg.afax[94] = 789532329;
        jg.afax[95] = -372632238;
        jg.afax[96] = -619361501;
        jg.afax[97] = -1880004036;
        jg.afax[98] = -1873094144;
        jg.afax[99] = 635253059;
    }

    private static /* synthetic */ void afss() {
        jg.afbt[0] = -275067093183608249L;
        jg.afbt[1] = 3292131279429051625L;
        jg.afbt[2] = 3781560251741146357L;
        jg.afbt[3] = -1874490627466888833L;
        jg.afbt[4] = 8839896470991136834L;
        jg.afbt[5] = -8348564925303811384L;
        jg.afbt[6] = 9141500028383245161L;
        jg.afbt[7] = -2617326451994815172L;
        jg.afbt[8] = 3603533217451666171L;
        jg.afbt[9] = -3794520605105605483L;
        jg.afbt[10] = 4142361570567814570L;
        jg.afbt[11] = -1041381274019375220L;
        jg.afbt[12] = -1940976203909513694L;
        jg.afbt[13] = -7978979678606891597L;
        jg.afbt[14] = 7856013824638560094L;
        jg.afbt[15] = 7850500527132534446L;
        jg.afbt[16] = -7359500011037846534L;
        jg.afbt[17] = -8330008431296332342L;
        jg.afbt[18] = 7490295507538296895L;
        jg.afbt[19] = 1461272479501816899L;
        jg.afbt[20] = -6568420854645339395L;
        jg.afbt[21] = -7285096299685181238L;
        jg.afbt[22] = -4733662843554099071L;
        jg.afbt[23] = 8904731747908035998L;
        jg.afbt[24] = 5023361541083519852L;
        jg.afbt[25] = -2592523095929089610L;
        jg.afbt[26] = 3134801344839586698L;
        jg.afbt[27] = 6624106505643776937L;
        jg.afbt[28] = -6680053185724228104L;
        jg.afbt[29] = 2459783865931098985L;
        jg.afbt[30] = -1608190031146240076L;
        jg.afbt[31] = 4597677632516490183L;
        jg.afbt[32] = 1890116300749117406L;
        jg.afbt[33] = -179176967021317156L;
        jg.afbt[34] = -6402547472773973249L;
        jg.afbt[35] = -4503583377357398278L;
        jg.afbt[36] = -8783821313332955759L;
        jg.afbt[37] = 2791062531241240062L;
        jg.afbt[38] = 7586264499142062993L;
        jg.afbt[39] = 3320694638031635058L;
        jg.afbt[40] = 3222375866582727397L;
        jg.afbt[41] = -816678660028105999L;
        jg.afbt[42] = -7264135154804195417L;
        jg.afbt[43] = 4535991011067805883L;
        jg.afbt[44] = 5847475126155413137L;
        jg.afbt[45] = 2794074431059539202L;
        jg.afbt[46] = 7907259240803882094L;
        jg.afbt[47] = 4918586972402698899L;
        jg.afbt[48] = 4273821450948465666L;
        jg.afbt[49] = -2605857070568119610L;
        jg.afbt[50] = -9189620403700935569L;
        jg.afbt[51] = -6002754020319549848L;
        jg.afbt[52] = 2221668714329031731L;
        jg.afbt[53] = 4608384379266373893L;
        jg.afbt[54] = 4101128274184517252L;
        jg.afbt[55] = -7470207854905129473L;
        jg.afbt[56] = -3744874641419619536L;
        jg.afbt[57] = -1559492177733529575L;
        jg.afbt[58] = 8545028298421758078L;
        jg.afbt[59] = -118971455193456356L;
        jg.afbt[60] = -6263920538333649213L;
        jg.afbt[61] = 8394606381856816115L;
        jg.afbt[62] = -152367750747046797L;
        jg.afbt[63] = 7678628784616055403L;
        jg.afbt[64] = 8605217388302017813L;
        jg.afbt[65] = 8102141414251611541L;
        jg.afbt[66] = 2515088818921650433L;
        jg.afbt[67] = -6703300753925903063L;
        jg.afbt[68] = 8052255963524763113L;
        jg.afbt[69] = 9047843841144742229L;
        jg.afbt[70] = 5670659600335703323L;
        jg.afbt[71] = 7070727914097268487L;
        jg.afbt[72] = 364591082099924592L;
        jg.afbt[73] = -9125858622562426664L;
        jg.afbt[74] = -6620510560029309975L;
        jg.afbt[75] = 4677156749021402127L;
        jg.afbt[76] = -961641092799276264L;
        jg.afbt[77] = 1640253551339456983L;
        jg.afbt[78] = 514780437232714243L;
        jg.afbt[79] = -5180957605447114718L;
        jg.afbt[80] = 7125793307176975560L;
        jg.afbt[81] = 6605478274801974798L;
        jg.afbt[82] = 4017342138566762945L;
        jg.afbt[83] = -2481210455030538752L;
        jg.afbt[84] = -9026350772571748461L;
        jg.afbt[85] = -7777113821331614126L;
        jg.afbt[86] = 5334128242129761038L;
        jg.afbt[87] = -7290749679513551615L;
        jg.afbt[88] = 8606247937804955484L;
        jg.afbt[89] = 9146272706806558697L;
        jg.afbt[90] = -5060053593687271322L;
        jg.afbt[91] = -4992666411022658696L;
        jg.afbt[92] = 8030691147824341412L;
        jg.afbt[93] = -8538971642029129599L;
        jg.afbt[94] = 4132965874717177372L;
        jg.afbt[95] = 6747879932415680826L;
        jg.afbt[96] = -1829066534237519681L;
        jg.afbt[97] = 938920448432077660L;
        jg.afbt[98] = -7108729653389158756L;
        jg.afbt[99] = -9196316357315433713L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afhw", afbs(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jg.afay("afhx", afbk(int ), (int)107)) break;
            v0 /* !! */  = (long)jg.afay("afhy", afbk(int ), (int)108);
        }
        var6_2 = jg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afhz", afbs(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jg.afay("afia", afbk(int ), (int)109)) break;
            v1 /* !! */  = (long)jg.afay("afib", afbk(int ), (int)110);
        }
        var5_3 /* !! */  = jg.b;
        v2 /* !! */  = jg.bt;
        if (true) ** GOTO lbl17
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - jg.afay("afic", afbs(int ), (int)70));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1515355066: {
                    v3 = jg.afay("afid", afbs(int ), (int)71);
                    continue block30;
                }
                case -335683840: {
                    v3 = jg.afay("afie", afbs(int ), (int)72);
                    continue block30;
                }
                case -284695211: {
                    break block30;
                }
            }
            break;
        }
        var4_4 = jg.a;
        if (!var6_2) ** GOTO lbl33
        throw null;
lbl-1000:
        // 4 sources

        {
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl33:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl-1000
                v4 /* !! */  = jg.bt;
                if (true) ** GOTO lbl38
                block32: while (true) {
                    v4 /* !! */  = (long)(v5 - jg.afay("afif", afbs(int ), (int)73));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -284695211: {
                            break block32;
                        }
                        case 986075085: {
                            v5 = jg.afay("afig", afbs(int ), (int)74);
                            continue block32;
                        }
                        case 1104645036: {
                            v5 = jg.afay("afih", afbs(int ), (int)75);
                            continue block32;
                        }
                    }
                    break;
                }
                this.syncSettings();
                if (var4_4 || var4_4) ** GOTO lbl-1000
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("afii", afbs(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jg.afay("afij", afbk(int ), (int)111)) break;
                    v6 /* !! */  = (long)jg.afay("afik", afbk(int ), (int)112);
                }
                var2_5 = System.nanoTime();
                if (var4_4 || var4_4) ** GOTO lbl-1000
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = jg.bt - jg.afay("afil", afbs(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jg.afay("afim", afbk(int ), (int)113)) break;
                    v7 /* !! */  = (long)jg.afay("afin", afbk(int ), (int)114);
                }
                v8 /* !! */  = jg.bt;
                if (true) ** GOTO lbl65
                block35: while (true) {
                    v8 /* !! */  = (long)(v9 - jg.afay("afio", afbs(int ), (int)78));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1469665945: {
                            v9 = jg.afay("afip", afbs(int ), (int)79);
                            continue block35;
                        }
                        case -1130958124: {
                            v9 = jg.afay("afiq", afbs(int ), (int)80);
                            continue block35;
                        }
                        case -948479432: {
                            v9 = jg.afay("afir", afbs(int ), (int)81);
                            continue block35;
                        }
                        case -284695211: {
                            break block35;
                        }
                    }
                    break;
                }
                v10 = (Predicate<jg$Ghost>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onWorldRender$0(long ruhack.phobia.jg$Ghost ), (Lruhack/phobia/jg$Ghost;)Z)((long)var2_5);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = jg.bt - jg.afay("afis", afbs(int ), (int)82)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == jg.afay("afit", afbk(int ), (int)115)) break;
                    v11 /* !! */  = (long)jg.afay("afiu", afbk(int ), (int)116);
                }
                jg.GHOSTS.removeIf(v10);
                if (var4_4 || var4_4) continue block31;
                return;
                case 0: {
                    var5_3 /* !! */  = (int)jg.afay("afiv", afbk(int ), (int)117);
                    if (var6_2) {
                        throw null;
                    }
                }
                case 1: {
                    var5_3 /* !! */  = (int)jg.afay("afiw", afbk(int ), (int)118);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)jg.afay("afix", afbk(int ), (int)119);
                        if (!var6_2) break block31;
                        throw null;
                    }
                }
lbl100:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)jg.afay("afiy", afbk(int ), (int)120);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
lbl105:
                // 2 sources

                case 4: {
                    var5_3 /* !! */  = (int)jg.afay("afiz", afbk(int ), (int)121);
                    if (!var6_2) break block31;
                    throw null;
                }
                case 5: {
                    var5_3 /* !! */  = (int)jg.afay("afja", afbk(int ), (int)122);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
                case 6: {
                    var5_3 /* !! */  = (int)jg.afay("afjb", afbk(int ), (int)123);
                    if (!var6_2) ** GOTO lbl105
                    throw null;
                }
lbl118:
                // 4 sources

                case 7: {
                    var5_3 /* !! */  = (int)jg.afay("afjc", afbk(int ), (int)124);
                    if (!var6_2) break block31;
                    throw null;
                }
                case 8: {
                    var5_3 /* !! */  = (int)jg.afay("afjd", afbk(int ), (int)125);
                    if (!var6_2) ** GOTO lbl100
                    throw null;
                }
                case 9: 
            }
        }
        var5_3 /* !! */  = (int)jg.afay("afje", afbk(int ), (int)126);
        ** while (!var6_2)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int ghostColor(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afpg", afbs(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jg.afay("afph", afbk(int ), (int)237)) break;
            v0 /* !! */  = (long)jg.afay("afpi", afbk(int ), (int)238);
        }
        var4_1 = jg.c;
        v1 /* !! */  = jg.bt;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(jg.afay("afpk", afbs(int ), (int)131) - jg.afay("afpj", afbs(int ), (int)130));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -284695211: {
                    break block13;
                }
                case 1892535599: {
                    continue block13;
                }
            }
            break;
        }
        var3_2 /* !! */  = jg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afpl", afbs(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jg.afay("afpm", afbk(int ), (int)239)) break;
            v2 /* !! */  = (long)jg.afay("afpn", afbk(int ), (int)240);
        }
        var2_3 = jg.a;
        if (!var4_1) ** GOTO lbl31
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)jg.afay("afpo", afbk(int ), (int)241);
                }
lbl31:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl-1000
                var1_4 = var0 >>> jg.afay("afpp", afbk(int ), (int)242);
                if (var2_3 || var2_3) continue block15;
                return var0 & jg.afay("afpq", afbk(int ), (int)243) | var1_4 * jg.afay("afpr", afbk(int ), (int)244) / jg.afay("afps", afbk(int ), (int)245) << jg.afay("afpt", afbk(int ), (int)246);
lbl35:
                // 2 sources

                case 0: {
                    do {
                        var3_2 /* !! */  = (int)jg.afay("afpu", afbk(int ), (int)247);
                    } while (!var4_1);
                    throw null;
                }
                case 1: {
                    var3_2 /* !! */  = (int)jg.afay("afpv", afbk(int ), (int)248);
                    if (!var4_1) break block15;
                    throw null;
                }
lbl44:
                // 2 sources

                case 2: {
                    do {
                        var3_2 /* !! */  = (int)jg.afay("afpw", afbk(int ), (int)249);
                    } while (!var4_1);
                    throw null;
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)jg.afay("afpx", afbk(int ), (int)250);
                        if (!var4_1) ** GOTO lbl44
                        throw null;
                    }
                }
                case 4: {
                    var3_2 /* !! */  = (int)jg.afay("afpy", afbk(int ), (int)251);
                    if (!var4_1) ** GOTO lbl35
                    throw null;
                }
                case 5: 
            }
        }
        var3_2 /* !! */  = (int)jg.afay("afpz", afbk(int ), (int)252);
        ** while (!var4_1)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afcs", afbs(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jg.afay("afct", afbk(int ), (int)36)) break;
            v0 /* !! */  = (long)jg.afay("afcu", afbk(int ), (int)37);
        }
        var3_1 = jg.c;
        v1 /* !! */  = jg.bt;
        if (true) ** GOTO lbl12
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - jg.afay("afcv", afbs(int ), (int)6));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1856305677: {
                    v2 = jg.afay("afcw", afbs(int ), (int)7);
                    continue block20;
                }
                case -284695211: {
                    break block20;
                }
                case -37311788: {
                    v2 = jg.afay("afcx", afbs(int ), (int)8);
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = jg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afcy", afbs(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jg.afay("afcz", afbk(int ), (int)38)) break;
            v3 /* !! */  = (long)jg.afay("afda", afbk(int ), (int)39);
        }
        var1_3 = jg.a;
        if (var3_1) {
            throw null;
lbl31:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl31
                v4 /* !! */  = jg.bt;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v4 /* !! */  = (long)(v5 - jg.afay("afdb", afbs(int ), (int)10));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1493036932: {
                            v5 = jg.afay("afdc", afbs(int ), (int)11);
                            continue block23;
                        }
                        case -1298452140: {
                            v5 = jg.afay("afdd", afbs(int ), (int)12);
                            continue block23;
                        }
                        case -896624378: {
                            v5 = jg.afay("afde", afbs(int ), (int)13);
                            continue block23;
                        }
                        case -284695211: {
                            break block23;
                        }
                    }
                    break;
                }
                jg.clear();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl58:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jg.afay("afdf", afbk(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)jg.afay("afdg", afbk(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jg.afay("afdh", afbk(int ), (int)42);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jg.afay("afdi", afbk(int ), (int)43);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)jg.afay("afdj", afbk(int ), (int)44);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)jg.afay("afdk", afbk(int ), (int)45);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void afsq() {
        jg.afax[100] = -1307711587;
        jg.afax[101] = 550419109;
        jg.afax[102] = -1658259233;
        jg.afax[103] = -1216307365;
        jg.afax[104] = -779618349;
        jg.afax[105] = -2115568142;
        jg.afax[106] = 722094225;
        jg.afax[107] = 909695534;
        jg.afax[108] = 1945514740;
        jg.afax[109] = -484598987;
        jg.afax[110] = 1440594812;
        jg.afax[111] = 871784798;
        jg.afax[112] = 1095433732;
        jg.afax[113] = 918878667;
        jg.afax[114] = 803977118;
        jg.afax[115] = -1473152652;
        jg.afax[116] = -1932407791;
        jg.afax[117] = -2114911929;
        jg.afax[118] = -448397232;
        jg.afax[119] = 672903165;
        jg.afax[120] = -1139929267;
        jg.afax[121] = 1049149554;
        jg.afax[122] = 731427509;
        jg.afax[123] = 480349898;
        jg.afax[124] = -1800612559;
        jg.afax[125] = 498834117;
        jg.afax[126] = -1226791764;
        jg.afax[127] = -1890987015;
        jg.afax[128] = 231771129;
        jg.afax[129] = 642307944;
        jg.afax[130] = 1757779127;
        jg.afax[131] = -1619470092;
        jg.afax[132] = 1036521255;
        jg.afax[133] = 1617690517;
        jg.afax[134] = -1297393459;
        jg.afax[135] = 483048403;
        jg.afax[136] = 1666775332;
        jg.afax[137] = -112155990;
        jg.afax[138] = -1123173451;
        jg.afax[139] = -1893496979;
        jg.afax[140] = 199924234;
        jg.afax[141] = 2143426169;
        jg.afax[142] = -2015252537;
        jg.afax[143] = 350770209;
        jg.afax[144] = 1978531370;
        jg.afax[145] = 2068623035;
        jg.afax[146] = -1034224609;
        jg.afax[147] = -455038218;
        jg.afax[148] = 1734805231;
        jg.afax[149] = -1810145204;
        jg.afax[150] = 1354005478;
        jg.afax[151] = 1616485511;
        jg.afax[152] = -203901659;
        jg.afax[153] = -1551807648;
        jg.afax[154] = 795858865;
        jg.afax[155] = -901511621;
        jg.afax[156] = -621266957;
        jg.afax[157] = 260741471;
        jg.afax[158] = 1144949245;
        jg.afax[159] = -629028426;
        jg.afax[160] = 2132670285;
        jg.afax[161] = -205918181;
        jg.afax[162] = 466979707;
        jg.afax[163] = -1715618625;
        jg.afax[164] = -1331690403;
        jg.afax[165] = 1106116447;
        jg.afax[166] = 270240567;
        jg.afax[167] = -694191807;
        jg.afax[168] = -1275831144;
        jg.afax[169] = -58669088;
        jg.afax[170] = -936904694;
        jg.afax[171] = -1157067692;
        jg.afax[172] = 1521926086;
        jg.afax[173] = 1061528466;
        jg.afax[174] = 1368233172;
        jg.afax[175] = 488983100;
        jg.afax[176] = -2089354380;
        jg.afax[177] = 501541945;
        jg.afax[178] = -643882537;
        jg.afax[179] = -1319535967;
        jg.afax[180] = -665203282;
        jg.afax[181] = -1984364012;
        jg.afax[182] = 978612924;
        jg.afax[183] = -415982471;
        jg.afax[184] = 1746871508;
        jg.afax[185] = 276440183;
        jg.afax[186] = -817389089;
        jg.afax[187] = 733310500;
        jg.afax[188] = -1682905883;
        jg.afax[189] = -2114746434;
        jg.afax[190] = -1971805902;
        jg.afax[191] = -1091864971;
        jg.afax[192] = 58866945;
        jg.afax[193] = 1444894335;
        jg.afax[194] = -885099168;
        jg.afax[195] = -1325429999;
        jg.afax[196] = 1783648552;
        jg.afax[197] = 979702270;
        jg.afax[198] = 258899765;
        jg.afax[199] = -66197508;
    }

    private static /* synthetic */ void afso() {
        jg.afaw[200] = -593675166;
        jg.afaw[201] = 410584523;
        jg.afaw[202] = 1684305704;
        jg.afaw[203] = 64072823;
        jg.afaw[204] = 38448730;
        jg.afaw[205] = 101892899;
        jg.afaw[206] = 1528561566;
        jg.afaw[207] = -1278553907;
        jg.afaw[208] = 1112124259;
        jg.afaw[209] = 1973147212;
        jg.afaw[210] = -902369153;
        jg.afaw[211] = 763685596;
        jg.afaw[212] = 1940467135;
        jg.afaw[213] = -1000919692;
        jg.afaw[214] = -656817709;
        jg.afaw[215] = 1010192346;
        jg.afaw[216] = 598061168;
        jg.afaw[217] = -1516970358;
        jg.afaw[218] = 1207548124;
        jg.afaw[219] = 643068375;
        jg.afaw[220] = -1040717729;
        jg.afaw[221] = -1551021120;
        jg.afaw[222] = 995015127;
        jg.afaw[223] = -1573683148;
        jg.afaw[224] = -473879989;
        jg.afaw[225] = -390477236;
        jg.afaw[226] = -1982535984;
        jg.afaw[227] = -1516984202;
        jg.afaw[228] = -1772599511;
        jg.afaw[229] = 523259654;
        jg.afaw[230] = -303535754;
        jg.afaw[231] = 308775145;
        jg.afaw[232] = -970858760;
        jg.afaw[233] = -2115318654;
        jg.afaw[234] = -121106069;
        jg.afaw[235] = 1245226472;
        jg.afaw[236] = -1496616084;
        jg.afaw[237] = -284165276;
        jg.afaw[238] = -1990209194;
        jg.afaw[239] = 304709263;
        jg.afaw[240] = 1972697580;
        jg.afaw[241] = -36323455;
        jg.afaw[242] = -184244719;
        jg.afaw[243] = -1021754891;
        jg.afaw[244] = -1469787170;
        jg.afaw[245] = -1486616802;
        jg.afaw[246] = -1660977205;
        jg.afaw[247] = 570153940;
        jg.afaw[248] = -2027228766;
        jg.afaw[249] = -1767246285;
        jg.afaw[250] = -970596372;
        jg.afaw[251] = 137496046;
        jg.afaw[252] = -1052565715;
        jg.afaw[253] = 1523876942;
        jg.afaw[254] = 212480038;
        jg.afaw[255] = -75844163;
        jg.afaw[256] = -1232121910;
        jg.afaw[257] = 1711770998;
        jg.afaw[258] = 1075494087;
        jg.afaw[259] = 402432354;
        jg.afaw[260] = -500978550;
        jg.afaw[261] = -561146709;
        jg.afaw[262] = -905790915;
        jg.afaw[263] = -250984731;
        jg.afaw[264] = -1623617413;
        jg.afaw[265] = -2010111212;
        jg.afaw[266] = -2110064957;
        jg.afaw[267] = 1363138336;
        jg.afaw[268] = -660743006;
        jg.afaw[269] = 1149008223;
        jg.afaw[270] = -680058479;
        jg.afaw[271] = 1813358213;
        jg.afaw[272] = -581417517;
        jg.afaw[273] = -1448398701;
        jg.afaw[274] = -354689179;
        jg.afaw[275] = 236526571;
        jg.afaw[276] = -1548207280;
        jg.afaw[277] = -719337216;
        jg.afaw[278] = -350415755;
        jg.afaw[279] = 783905420;
        jg.afaw[280] = -1019809337;
        jg.afaw[281] = 1251192567;
        jg.afaw[282] = 1774577492;
        jg.afaw[283] = 678434194;
        jg.afaw[284] = -828637785;
        jg.afaw[285] = -737592145;
        jg.afaw[286] = -1287971691;
        jg.afaw[287] = -930029414;
        jg.afaw[288] = -2040059768;
        jg.afaw[289] = 912669623;
    }

    private static /* synthetic */ void afsr() {
        jg.afax[200] = -593675193;
        jg.afax[201] = 410584549;
        jg.afax[202] = 1684305724;
        jg.afax[203] = 64072816;
        jg.afax[204] = 38448757;
        jg.afax[205] = 101892916;
        jg.afax[206] = 1528561577;
        jg.afax[207] = -1278553871;
        jg.afax[208] = 1112124281;
        jg.afax[209] = 1973147253;
        jg.afax[210] = -902369159;
        jg.afax[211] = 763685533;
        jg.afax[212] = 1940467087;
        jg.afax[213] = -1000919756;
        jg.afax[214] = -656817705;
        jg.afax[215] = 1010192328;
        jg.afax[216] = 598061163;
        jg.afax[217] = -1516970322;
        jg.afax[218] = 1207548097;
        jg.afax[219] = 643068360;
        jg.afax[220] = -1040717698;
        jg.afax[221] = -1551021112;
        jg.afax[222] = 995015147;
        jg.afax[223] = -1573683188;
        jg.afax[224] = -473879945;
        jg.afax[225] = -390477246;
        jg.afax[226] = -1982535965;
        jg.afax[227] = -1516984205;
        jg.afax[228] = -1772599540;
        jg.afax[229] = 523259692;
        jg.afax[230] = -303535755;
        jg.afax[231] = 308775130;
        jg.afax[232] = -970858759;
        jg.afax[233] = -2115318632;
        jg.afax[234] = -121106096;
        jg.afax[235] = 1245226487;
        jg.afax[236] = -1496616120;
        jg.afax[237] = -284165275;
        jg.afax[238] = -235883053;
        jg.afax[239] = -304709264;
        jg.afax[240] = 836896234;
        jg.afax[241] = -1772164953;
        jg.afax[242] = -184244727;
        jg.afax[243] = -1008288246;
        jg.afax[244] = -1469787298;
        jg.afax[245] = -1486616607;
        jg.afax[246] = -1660977197;
        jg.afax[247] = 570153943;
        jg.afax[248] = -2027228762;
        jg.afax[249] = -1767246286;
        jg.afax[250] = -970596371;
        jg.afax[251] = 137496045;
        jg.afax[252] = -1052565719;
        jg.afax[253] = -1523876943;
        jg.afax[254] = -1541112463;
        jg.afax[255] = -75844163;
        jg.afax[256] = -1232121911;
        jg.afax[257] = 1711771003;
        jg.afax[258] = 1075494095;
        jg.afax[259] = 402432359;
        jg.afax[260] = -500978554;
        jg.afax[261] = -561146712;
        jg.afax[262] = -905790916;
        jg.afax[263] = -250984734;
        jg.afax[264] = -1623617413;
        jg.afax[265] = -2010111206;
        jg.afax[266] = -2110064952;
        jg.afax[267] = 1363138346;
        jg.afax[268] = -660743002;
        jg.afax[269] = 1149008219;
        jg.afax[270] = -680058476;
        jg.afax[271] = 1813358222;
        jg.afax[272] = -581417512;
        jg.afax[273] = 1448398700;
        jg.afax[274] = 1261393340;
        jg.afax[275] = 236526571;
        jg.afax[276] = 1548207279;
        jg.afax[277] = 1536495335;
        jg.afax[278] = -350415756;
        jg.afax[279] = 783905420;
        jg.afax[280] = -1019809342;
        jg.afax[281] = 1251192567;
        jg.afax[282] = 1774577489;
        jg.afax[283] = 678434192;
        jg.afax[284] = -828637792;
        jg.afax[285] = -737592147;
        jg.afax[286] = -1287971695;
        jg.afax[287] = -930029416;
        jg.afax[288] = -2040059776;
        jg.afax[289] = 160102266;
    }

    public static /* synthetic */ CallSite afay(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void afsn() {
        jg.afaw[100] = -1307711601;
        jg.afaw[101] = 550419119;
        jg.afaw[102] = -1658259255;
        jg.afaw[103] = -1216307392;
        jg.afaw[104] = -779618366;
        jg.afaw[105] = -2115568133;
        jg.afaw[106] = 722094218;
        jg.afaw[107] = 909695535;
        jg.afaw[108] = 1613526502;
        jg.afaw[109] = 484598986;
        jg.afaw[110] = -549886340;
        jg.afaw[111] = -871784799;
        jg.afaw[112] = -35642719;
        jg.afaw[113] = -918878668;
        jg.afaw[114] = -1350982536;
        jg.afaw[115] = 1473152651;
        jg.afaw[116] = 585487433;
        jg.afaw[117] = -2114911930;
        jg.afaw[118] = -448397231;
        jg.afaw[119] = 672903156;
        jg.afaw[120] = -1139929268;
        jg.afaw[121] = 1049149562;
        jg.afaw[122] = 731427505;
        jg.afaw[123] = 480349890;
        jg.afaw[124] = -1800612552;
        jg.afaw[125] = 498834114;
        jg.afaw[126] = -1226791767;
        jg.afaw[127] = -969017351;
        jg.afaw[128] = -231771130;
        jg.afaw[129] = 1470531682;
        jg.afaw[130] = -1757779128;
        jg.afaw[131] = -727581373;
        jg.afaw[132] = -1036521256;
        jg.afaw[133] = 413372520;
        jg.afaw[134] = -1297393457;
        jg.afaw[135] = 483048410;
        jg.afaw[136] = 1666775329;
        jg.afaw[137] = -112155992;
        jg.afaw[138] = -1123173453;
        jg.afaw[139] = -1893496977;
        jg.afaw[140] = 199924236;
        jg.afaw[141] = 2143426160;
        jg.afaw[142] = -2015252540;
        jg.afaw[143] = 350770213;
        jg.afaw[144] = 1978531371;
        jg.afaw[145] = 968268715;
        jg.afaw[146] = -1034224609;
        jg.afaw[147] = 455038217;
        jg.afaw[148] = 1083559189;
        jg.afaw[149] = -1810145206;
        jg.afaw[150] = 1354005475;
        jg.afaw[151] = 1616485508;
        jg.afaw[152] = -203901657;
        jg.afaw[153] = -1551807645;
        jg.afaw[154] = 795858870;
        jg.afaw[155] = -901511621;
        jg.afaw[156] = -621266955;
        jg.afaw[157] = -260741472;
        jg.afaw[158] = 1957269722;
        jg.afaw[159] = 629028425;
        jg.afaw[160] = -125135914;
        jg.afaw[161] = -205918182;
        jg.afaw[162] = -466979708;
        jg.afaw[163] = -808857246;
        jg.afaw[164] = -1331690404;
        jg.afaw[165] = 1106116446;
        jg.afaw[166] = 270240566;
        jg.afaw[167] = -694191808;
        jg.afaw[168] = -1275831143;
        jg.afaw[169] = -58669088;
        jg.afaw[170] = -936904694;
        jg.afaw[171] = -1157067669;
        jg.afaw[172] = 1521926115;
        jg.afaw[173] = 1061528468;
        jg.afaw[174] = 1368233188;
        jg.afaw[175] = 488983098;
        jg.afaw[176] = -2089354381;
        jg.afaw[177] = 501541905;
        jg.afaw[178] = -643882506;
        jg.afaw[179] = -1319535970;
        jg.afaw[180] = -665203315;
        jg.afaw[181] = -1984364009;
        jg.afaw[182] = 978612888;
        jg.afaw[183] = -415982481;
        jg.afaw[184] = 1746871492;
        jg.afaw[185] = 276440179;
        jg.afaw[186] = -817389061;
        jg.afaw[187] = 733310514;
        jg.afaw[188] = -1682905884;
        jg.afaw[189] = -2114746486;
        jg.afaw[190] = -1971805925;
        jg.afaw[191] = -1091864977;
        jg.afaw[192] = 58866966;
        jg.afaw[193] = 1444894312;
        jg.afaw[194] = -885099160;
        jg.afaw[195] = -1325429987;
        jg.afaw[196] = 1783648525;
        jg.afaw[197] = 979702269;
        jg.afaw[198] = 258899738;
        jg.afaw[199] = -66197510;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldLoad(di var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afdl", afbs(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jg.afay("afdm", afbk(int ), (int)46)) break;
            v0 /* !! */  = (long)jg.afay("afdn", afbk(int ), (int)47);
        }
        var4_2 = jg.c;
        v1 /* !! */  = jg.bt;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - jg.afay("afdo", afbs(int ), (int)15));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1830804854: {
                    v2 = jg.afay("afdp", afbs(int ), (int)16);
                    continue block24;
                }
                case -284695211: {
                    break block24;
                }
                case 791736837: {
                    v2 = jg.afay("afdq", afbs(int ), (int)17);
                    continue block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = jg.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jg.bt;
                if (true) ** GOTO lbl29
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - jg.afay("afdr", afbs(int ), (int)18));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1190690146: {
                            v4 = jg.afay("afds", afbs(int ), (int)19);
                            continue block25;
                        }
                        case -284695211: {
                            break block25;
                        }
                        case 225306938: {
                            v4 = jg.afay("afdt", afbs(int ), (int)20);
                            continue block25;
                        }
                        case 2045966448: {
                            v4 = jg.afay("afdu", afbs(int ), (int)21);
                            continue block25;
                        }
                    }
                    break;
                }
                var2_4 = jg.a;
                if (var4_2) {
                    throw null;
lbl44:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl44
                v5 /* !! */  = jg.bt;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(jg.afay("afdw", afbs(int ), (int)23) - jg.afay("afdv", afbs(int ), (int)22));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -284695211: {
                            break block27;
                        }
                        case 1040403079: {
                            continue block27;
                        }
                    }
                    break;
                }
                jg.clear();
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jg.afay("afdx", afbk(int ), (int)48);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jg.afay("afdy", afbk(int ), (int)49);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl74
                    break;
                }
            }
lbl70:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)jg.afay("afdz", afbk(int ), (int)50);
                if (!var4_2) break;
                throw null;
            }
lbl74:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)jg.afay("afea", afbk(int ), (int)51);
                } while (!var4_2);
                throw null;
            }
lbl79:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)jg.afay("afeb", afbk(int ), (int)52);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)jg.afay("afec", afbk(int ), (int)53);
        ** while (!var4_2)
lbl86:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$onWorldRender$0(long var0, jg$Ghost var2_1) {
        block50: {
            while (true) {
                block51: {
                    if ((v0 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afri", afbs(int ), (int)147)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != jg.afay("afrj", afbk(int ), (int)273)) break block51;
                    var5_2 = jg.c;
                    v1 /* !! */  = jg.bt;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)jg.afay("afrk", afbk(int ), (int)274);
            }
            block27: while (true) {
                v1 /* !! */  = (long)(v2 - jg.afay("afrl", afbs(int ), (int)148));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -284695211: {
                        break block27;
                    }
                    case 572879577: {
                        v2 = jg.afay("afrm", afbs(int ), (int)149);
                        continue block27;
                    }
                    case 875080223: {
                        v2 = jg.afay("afrn", afbs(int ), (int)150);
                        continue block27;
                    }
                    case 1578565414: {
                        v2 = jg.afay("afro", afbs(int ), (int)151);
                        continue block27;
                    }
                }
                break;
            }
            var4_3 /* !! */  = jg.b;
            v3 /* !! */  = jg.bt;
            block28: while (true) {
                switch ((int)v3 /* !! */ ) {
                    case -284695211: {
                        break block28;
                    }
                    case -204467803: {
                        v3 /* !! */  = (long)(jg.afay("afrq", afbs(int ), (int)153) - jg.afay("afrp", afbs(int ), (int)152));
                        continue block28;
                    }
                }
                break;
            }
            var3_4 = jg.a;
            if (var5_2) {
                throw null;
            }
            if (var3_4 || var3_4) return (boolean)jg.afay("afrr", afbk(int ), (int)275);
            v4 /* !! */  = jg.bt;
            if (true) ** GOTO lbl42
            block29: while (true) {
                v4 /* !! */  = (long)(v5 - jg.afay("afrs", afbs(int ), (int)154));
lbl42:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1096054666: {
                        v5 = jg.afay("afrt", afbs(int ), (int)155);
                        continue block29;
                    }
                    case -284695211: {
                        break block29;
                    }
                    case 110537621: {
                        v5 = jg.afay("afru", afbs(int ), (int)156);
                        continue block29;
                    }
                    case 1057247614: {
                        v5 = jg.afay("afrv", afbs(int ), (int)157);
                        continue block29;
                    }
                }
                break;
            }
            v6 = var0 - var2_1.createdNanos;
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("afrw", afbs(int ), (int)158)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == jg.afay("afrx", afbk(int ), (int)276)) {
                    if (v6 >= jg.lifetimeNanos) {
                        break;
                    }
                    break block50;
                }
                v7 /* !! */  = (long)jg.afay("afry", afbk(int ), (int)277);
            }
            if (var3_4) return (boolean)jg.afay("afrr", afbk(int ), (int)275);
            v8 = jg.afay("afrz", afbk(int ), (int)278);
            if (!var5_2) return (boolean)v8;
            throw null;
        }
        if (var3_4 || var3_4) {
            return (boolean)jg.afay("afrr", afbk(int ), (int)275);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block31: while (true) {
            block52: {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v8 = jg.afay("afsa", afbk(int ), (int)279);
                        return (boolean)v8;
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)jg.afay("afse", afbk(int ), (int)283);
                        cfr_temp_0 = 6;
                        if (var5_2) {
                            throw null;
                        }
                        break block52;
                    }
                    case 4: {
                        var4_3 /* !! */  = (int)jg.afay("afsf", afbk(int ), (int)284);
                        cfr_temp_0 = 1;
                        if (var5_2) {
                            throw null;
                        }
                        break block52;
                    }
                    case 7: {
                        var4_3 /* !! */  = (int)jg.afay("afsi", afbk(int ), (int)287);
                        if (var5_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var4_3 /* !! */  = (int)jg.afay("afsb", afbk(int ), (int)280);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var4_3 /* !! */  = (int)jg.afay("afsd", afbk(int ), (int)282);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var4_3 /* !! */  = (int)jg.afay("afsh", afbk(int ), (int)286);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var4_3 /* !! */  = (int)jg.afay("afsg", afbk(int ), (int)285);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl116
            }
            do {
                if (true) continue block31;
lbl116:
                // 2 sources

                var4_3 /* !! */  = (int)jg.afay("afsc", afbk(int ), (int)281);
                cfr_temp_0 = 0;
            } while (!var5_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jg() {
        var2_1 /* !! */  = jg.b;
        super("GhostHit", "\u041f\u0440\u0438 \u043a\u0440\u0438\u0442\u0435 \u0432\u044b\u043f\u0443\u0441\u043a\u0430\u0435\u0442 \u0432\u0432\u0435\u0440\u0445 \u043a\u043e\u043f\u0438\u044e \u043c\u043e\u0434\u0435\u043b\u0438 \u0446\u0435\u043b\u0438", du.RENDER);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.lifetime = new kg("\u0412\u0440\u0435\u043c\u044f \u0436\u0438\u0437\u043d\u0438", "\u0427\u0435\u0440\u0435\u0437 \u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0438\u0441\u0447\u0435\u0437\u0430\u0435\u0442 \u043a\u043e\u043f\u0438\u044f \u0438\u0433\u0440\u043e\u043a\u0430", (float)jg.afay("afaz", afav(int ), (int)0)).range((float)jg.afay("afba", afav(int ), (int)1), (float)jg.afay("afbb", afav(int ), (int)2)).step((float)jg.afay("afbc", afav(int ), (int)3)).suffix(" \u043c\u0441");
                this.riseHeight = new kg("\u0412\u044b\u0441\u043e\u0442\u0430 \u043f\u043e\u0434\u044a\u0451\u043c\u0430", "\u041d\u0430\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0432\u044b\u0441\u043e\u043a\u043e \u043f\u043e\u0434\u043d\u0438\u043c\u0430\u0435\u0442\u0441\u044f \u043a\u043e\u043f\u0438\u044f", (float)jg.afay("afbd", afav(int ), (int)4)).range((float)jg.afay("afbe", afav(int ), (int)5), (float)jg.afay("afbf", afav(int ), (int)6)).step((float)jg.afay("afbg", afav(int ), (int)7));
                this.riseSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e\u0434\u044a\u0451\u043c\u0430", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u043a\u043e\u043f\u0438\u0438 \u0432\u0432\u0435\u0440\u0445", 1.0f).range((float)jg.afay("afbh", afav(int ), (int)8), (float)jg.afay("afbi", afav(int ), (int)9)).step((float)jg.afay("afbj", afav(int ), (int)10)).suffix("x");
                this.settings(new jx[]{this.lifetime, this.riseHeight, this.riseSpeed});
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)jg.afay("afbl", afbk(int ), (int)11);
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)jg.afay("afbm", afbk(int ), (int)12);
                ** GOTO lbl23
            }
            case 2: {
                var2_1 /* !! */  = (int)jg.afay("afbn", afbk(int ), (int)13);
                ** GOTO lbl26
            }
            case 3: {
                var2_1 /* !! */  = (int)jg.afay("afbo", afbk(int ), (int)14);
            }
lbl23:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)jg.afay("afbp", afbk(int ), (int)15);
                break;
            }
lbl26:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jg.afay("afbq", afbk(int ), (int)16);
                    break;
                }
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)jg.afay("afbr", afbk(int ), (int)17);
        ** while (true)
    }

    static {
        afaw = new int[290];
        afax = new int[290];
        jg.afsm();
        jg.afsn();
        jg.afso();
        jg.afsp();
        jg.afsq();
        jg.afsr();
        afbt = new long[160];
        afbu = new long[160];
        jg.afss();
        jg.afst();
        jg.afsu();
        jg.afsv();
        GHOSTS = new ArrayList<jg$Ghost>((int)jg.afay("afsj", afbk(int ), (int)288));
        lifetimeNanos = (long)jg.afay("afsk", afbs(int ), (int)159);
        configuredRiseHeight = (float)jg.afay("afsl", afav(int ), (int)289);
        configuredRiseSpeed = 1.0f;
    }

    private static /* synthetic */ int afbk(int n2) {
        return afaw[n2] ^ afax[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isGhostRenderPass() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("aflv", afbs(int ), (int)121)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jg.afay("aflw", afbk(int ), (int)157)) break;
            v0 /* !! */  = (long)jg.afay("aflx", afbk(int ), (int)158);
        }
        var2 = jg.c;
        v1 /* !! */  = jg.bt;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - jg.afay("afly", afbs(int ), (int)122));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -284695211: {
                    break block13;
                }
                case 381995437: {
                    v2 = jg.afay("aflz", afbs(int ), (int)123);
                    continue block13;
                }
                case 441746988: {
                    v2 = jg.afay("afma", afbs(int ), (int)124);
                    continue block13;
                }
                case 1888915969: {
                    v2 = jg.afay("afmb", afbs(int ), (int)125);
                    continue block13;
                }
            }
            break;
        }
        var1_1 /* !! */  = jg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afmc", afbs(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jg.afay("afmd", afbk(int ), (int)159)) break;
            v3 /* !! */  = (long)jg.afay("afme", afbk(int ), (int)160);
        }
        var0_2 = jg.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)jg.afay("afmf", afbk(int ), (int)161);
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("afmg", afbs(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jg.afay("afmh", afbk(int ), (int)162)) break;
                    v4 /* !! */  = (long)jg.afay("afmi", afbk(int ), (int)163);
                }
                return jg.ghostRenderPass;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jg.afay("afmj", afbk(int ), (int)164);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl58
                    break;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)jg.afay("afmk", afbk(int ), (int)165);
                } while (!var2);
                throw null;
            }
lbl58:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)jg.afay("afml", afbk(int ), (int)166);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jg.afay("afmm", afbk(int ), (int)167);
        ** while (!var2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void clear() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afkw", afbs(int ), (int)109)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jg.afay("afkx", afbk(int ), (int)144)) break;
            v0 /* !! */  = (long)jg.afay("afky", afbk(int ), (int)145);
        }
        var2 = jg.c;
        v1 /* !! */  = jg.bt;
        block29: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -572386958: {
                    v1 /* !! */  = (long)(jg.afay("afla", afbs(int ), (int)111) - jg.afay("afkz", afbs(int ), (int)110));
                    continue block29;
                }
                case -284695211: {
                    break block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = jg.b;
        v2 /* !! */  = jg.bt;
        if (true) ** GOTO lbl20
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - jg.afay("aflb", afbs(int ), (int)112));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1018442406: {
                    v3 = jg.afay("aflc", afbs(int ), (int)113);
                    continue block30;
                }
                case -284695211: {
                    break block30;
                }
                case 1067211340: {
                    v3 = jg.afay("afld", afbs(int ), (int)114);
                    continue block30;
                }
                case 1964804893: {
                    v3 = jg.afay("afle", afbs(int ), (int)115);
                    continue block30;
                }
            }
            break;
        }
        var0_2 = jg.a;
        if (var2) {
            throw null;
        }
        if (var0_2 || var0_2) return;
        v4 /* !! */  = jg.bt;
        block31: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -284695211: {
                    break block31;
                }
                case -22983629: {
                    v4 /* !! */  = (long)(jg.afay("aflg", afbs(int ), (int)117) - jg.afay("aflf", afbs(int ), (int)116));
                    continue block31;
                }
            }
            break;
        }
        v5 /* !! */  = jg.bt;
        block32: while (true) {
            switch ((int)v5 /* !! */ ) {
                case -2014398196: {
                    v5 /* !! */  = (long)(jg.afay("afli", afbs(int ), (int)119) - jg.afay("aflh", afbs(int ), (int)118));
                    continue block32;
                }
                case -284695211: {
                    break block32;
                }
            }
            break;
        }
        jg.GHOSTS.clear();
        if (var0_2 || var0_2) return;
        v6 = jg.afay("aflj", afbk(int ), (int)146);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("aflk", afbs(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jg.afay("afll", afbk(int ), (int)147)) {
                jg.ghostRenderPass = v6;
                if (var0_2) return;
                break;
            }
            v7 /* !! */  = (long)jg.afay("aflm", afbk(int ), (int)148);
        }
        if (var0_2) {
            return;
        }
        if (var1_1 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block34: while (true) {
            block50: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)jg.afay("aflo", afbk(int ), (int)150);
                        cfr_temp_0 = 4;
                        if (var2) {
                            throw null;
                        }
                        break block50;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)jg.afay("aflp", afbk(int ), (int)151);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 4: {
                        do {
                            var1_1 /* !! */  = (int)jg.afay("aflr", afbk(int ), (int)153);
                        } while (!var2);
                        throw null;
                    }
                    case 5: {
                        ** GOTO lbl92
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)jg.afay("aflu", afbk(int ), (int)156);
                        if (var2) {
                            throw null;
                        }
lbl92:
                        // 3 sources

                        var1_1 /* !! */  = (int)jg.afay("afls", afbk(int ), (int)154);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block50;
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)jg.afay("afln", afbk(int ), (int)149);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)jg.afay("aflq", afbk(int ), (int)152);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl110
            }
            do {
                if (true) continue block34;
lbl110:
                // 2 sources

                var1_1 /* !! */  = (int)jg.afay("aflt", afbk(int ), (int)155);
                cfr_temp_0 = 0;
            } while (!var2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void afst() {
        jg.afbt[100] = 8961109501329708204L;
        jg.afbt[101] = -9150384765364574472L;
        jg.afbt[102] = -120407259475586182L;
        jg.afbt[103] = -5961576278413727266L;
        jg.afbt[104] = 6346298254198490126L;
        jg.afbt[105] = 2599780780028437487L;
        jg.afbt[106] = -3519777651109909486L;
        jg.afbt[107] = -1672037563440209915L;
        jg.afbt[108] = -8792567556199520802L;
        jg.afbt[109] = -3592904645462634886L;
        jg.afbt[110] = 3790643671800723504L;
        jg.afbt[111] = -1216351490518468089L;
        jg.afbt[112] = -8021867095189980601L;
        jg.afbt[113] = -8521559025607729158L;
        jg.afbt[114] = 7518008779747864049L;
        jg.afbt[115] = 3666420738005970232L;
        jg.afbt[116] = 3888759904269850800L;
        jg.afbt[117] = 3516557119014530721L;
        jg.afbt[118] = -6051451403341582564L;
        jg.afbt[119] = 8106946328823722619L;
        jg.afbt[120] = -1418143059399008038L;
        jg.afbt[121] = 4818848611079361858L;
        jg.afbt[122] = -2165411465886501602L;
        jg.afbt[123] = 8348192678875059532L;
        jg.afbt[124] = 7993250618912660788L;
        jg.afbt[125] = -9189413690255938408L;
        jg.afbt[126] = 6890418401199237884L;
        jg.afbt[127] = -8685451054194912637L;
        jg.afbt[128] = -7957532592416835559L;
        jg.afbt[129] = -3621908475705390406L;
        jg.afbt[130] = 8071582338506783571L;
        jg.afbt[131] = 3764027735980586917L;
        jg.afbt[132] = -4360279669874714972L;
        jg.afbt[133] = -4336133295777505700L;
        jg.afbt[134] = 788527138646678394L;
        jg.afbt[135] = -5841986828571267289L;
        jg.afbt[136] = 3728753688643598520L;
        jg.afbt[137] = -2347997433751648129L;
        jg.afbt[138] = 8884486199447010866L;
        jg.afbt[139] = -979068023079780619L;
        jg.afbt[140] = -4868968271957635093L;
        jg.afbt[141] = 7436507144752207763L;
        jg.afbt[142] = -2739540103924379657L;
        jg.afbt[143] = -2973676507309630801L;
        jg.afbt[144] = 7126004838495402198L;
        jg.afbt[145] = 3093586583576411086L;
        jg.afbt[146] = -1042032079474468325L;
        jg.afbt[147] = 449327438028691589L;
        jg.afbt[148] = -6812360401927686594L;
        jg.afbt[149] = 1019036323108897589L;
        jg.afbt[150] = 3065969587370606127L;
        jg.afbt[151] = 871427766721509203L;
        jg.afbt[152] = -739719457244188787L;
        jg.afbt[153] = -3141905995149754562L;
        jg.afbt[154] = 1967642914592807754L;
        jg.afbt[155] = 71023362345823674L;
        jg.afbt[156] = -8560297863786456265L;
        jg.afbt[157] = 5931080450033364066L;
        jg.afbt[158] = -4916802276049888205L;
        jg.afbt[159] = -8806141369750944910L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void renderGhostCopies(class_922 var0, class_10055 var1_1, class_4587 var2_2, class_11659 var3_3, class_12075 var4_4) {
        block136: {
            block135: {
                var25_5 = jg.c;
                var24_6 /* !! */  = jg.b;
                var23_7 = jg.a;
                if (var25_5) {
                    throw null;
lbl6:
                    // 36 sources

                    return;
                }
                if (var23_7 || var23_7) ** GOTO lbl6
                if (jg.ghostRenderPass) break block135;
                if (var23_7) ** GOTO lbl6
                if (!jg.GHOSTS.isEmpty()) break block136;
                if (var23_7) ** GOTO lbl6
            }
            if (var23_7 || var23_7) ** GOTO lbl6
            return;
        }
        if (var23_7 || var23_7) ** GOTO lbl6
        var5_8 = System.nanoTime();
        if (var23_7 || var23_7) ** GOTO lbl6
        var7_9 = jg.GHOSTS.iterator();
        if (var23_7) ** GOTO lbl6
        block71: while (true) lbl-1000:
        // 4 sources

        {
            block139: {
                block138: {
                    block137: {
                        if (var23_7 || var23_7) ** GOTO lbl6
                        if (!var7_9.hasNext()) ** GOTO lbl89
                        if (var23_7) ** GOTO lbl6
                        var8_10 = var7_9.next();
                        if (var23_7 || var23_7) ** GOTO lbl6
                        if (var8_10.targetId == var1_1.field_53528) break block137;
                        if (var23_7) ** GOTO lbl6
                        if (!var25_5) ** GOTO lbl-1000
                        throw null;
                    }
                    if (var23_7 || var23_7) ** GOTO lbl6
                    var9_11 = (float)(var5_8 - var8_10.createdNanos) / (float)jg.lifetimeNanos;
                    if (var23_7 || var23_7) ** GOTO lbl6
                    if (!(var9_11 >= 1.0f)) break block138;
                    if (var23_7) ** GOTO lbl6
                    if (!var25_5) ** GOTO lbl-1000
                    throw null;
                }
                if (var23_7 || var23_7) ** GOTO lbl6
                if (var8_10.frozenState != null) break block139;
                if (var23_7 || var23_7) ** GOTO lbl6
                var8_10.frozenState = var1_1;
                if (var23_7) ** GOTO lbl6
            }
            if (var23_7 || var23_7) ** GOTO lbl6
            var9_11 = Math.max(0.0f, var9_11);
            if (var23_7 || var23_7) ** GOTO lbl6
            var10_12 = 1.0 + (double)jg.configuredRiseSpeed * jg.afay("afmo", afmn(int ), (int)128);
            if (var23_7 || var23_7) ** GOTO lbl6
            var12_13 = (double)jg.configuredRiseHeight * (1.0 - Math.pow(1.0 - (double)var9_11, var10_12));
            if (var23_7 || var23_7) ** GOTO lbl6
            var14_14 = var8_10.position.field_1352 - var1_1.field_53325;
            if (var23_7 || var23_7) ** GOTO lbl6
            var16_15 = var8_10.position.field_1351 + var12_13 - var1_1.field_53326;
            if (var23_7 || var23_7) ** GOTO lbl6
            var18_16 = var8_10.position.field_1350 - var1_1.field_53327;
            if (var23_7 || var23_7) ** GOTO lbl6
            var20_17 = new Matrix4f().translation((float)var14_14, (float)var16_15, (float)var18_16).mul((Matrix4fc)var2_2.method_23760().method_23761());
            if (var23_7 || var23_7) ** GOTO lbl6
            var21_18 = new class_4587();
            if (var23_7 || var23_7) ** GOTO lbl6
            var21_18.method_34425((Matrix4fc)var20_17);
            if (var23_7 || var23_7) ** GOTO lbl6
            jg.ghostRenderPass = jg.afay("afmp", afbk(int ), (int)168);
            if (var23_7) ** GOTO lbl6
            try {
                if (var23_7) ** GOTO lbl6
                var0.method_4054((class_10042)var8_10.frozenState, var21_18, var3_3, var4_4);
                if (var23_7 || var23_7) ** GOTO lbl6
            }
            catch (Throwable var22_19) {
                if (var23_7 || var23_7) ** GOTO lbl6
                jg.ghostRenderPass = jg.afay("afmr", afbk(int ), (int)170);
                if (var23_7 || var23_7) ** GOTO lbl6
                throw var22_19;
            }
            jg.ghostRenderPass = jg.afay("afmq", afbk(int ), (int)169);
            if (var23_7 || var23_7) ** GOTO lbl6
            if (var25_5) {
                throw null;
            }
            if (var23_7) ** GOTO lbl6
            if (var24_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var24_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var23_7) ** GOTO lbl6
                    if (!var25_5) continue block71;
                    throw null;
                }
lbl89:
                // 1 sources

                if (!var23_7 && !var23_7) ** break;
                ** continue;
                return;
                case 0: {
                    var24_6 /* !! */  = (int)jg.afay("afms", afbk(int ), (int)171);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
                case 1: {
                    var24_6 /* !! */  = (int)jg.afay("afmt", afbk(int ), (int)172);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl102:
                // 3 sources

                case 2: {
                    var24_6 /* !! */  = (int)jg.afay("afmu", afbk(int ), (int)173);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl107:
                // 2 sources

                case 3: {
                    var24_6 /* !! */  = (int)jg.afay("afmv", afbk(int ), (int)174);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl219
                }
lbl112:
                // 2 sources

                case 4: {
                    var24_6 /* !! */  = (int)jg.afay("afmw", afbk(int ), (int)175);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
lbl117:
                // 2 sources

                case 5: {
                    var24_6 /* !! */  = (int)jg.afay("afmx", afbk(int ), (int)176);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl367
                }
lbl122:
                // 2 sources

                case 6: {
                    var24_6 /* !! */  = (int)jg.afay("afmy", afbk(int ), (int)177);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl127:
                // 4 sources

                case 7: {
                    var24_6 /* !! */  = (int)jg.afay("afmz", afbk(int ), (int)178);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl194
                }
                case 8: {
                    var24_6 /* !! */  = (int)jg.afay("afna", afbk(int ), (int)179);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl137:
                // 2 sources

                case 9: {
                    var24_6 /* !! */  = (int)jg.afay("afnb", afbk(int ), (int)180);
                    if (!var25_5) ** GOTO lbl127
                    throw null;
                }
lbl141:
                // 2 sources

                case 10: {
                    var24_6 /* !! */  = (int)jg.afay("afnc", afbk(int ), (int)181);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
lbl146:
                // 2 sources

                case 11: {
                    var24_6 /* !! */  = (int)jg.afay("afnd", afbk(int ), (int)182);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
                case 12: {
                    var24_6 /* !! */  = (int)jg.afay("afne", afbk(int ), (int)183);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl351
                }
lbl156:
                // 2 sources

                case 13: {
                    var24_6 /* !! */  = (int)jg.afay("afnf", afbk(int ), (int)184);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
                case 14: {
                    var24_6 /* !! */  = (int)jg.afay("afng", afbk(int ), (int)185);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
                case 15: {
                    var24_6 /* !! */  = (int)jg.afay("afnh", afbk(int ), (int)186);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
lbl171:
                // 2 sources

                case 16: {
                    var24_6 /* !! */  = (int)jg.afay("afni", afbk(int ), (int)187);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
                case 17: {
                    var24_6 /* !! */  = (int)jg.afay("afnj", afbk(int ), (int)188);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
                case 18: {
                    var24_6 /* !! */  = (int)jg.afay("afnk", afbk(int ), (int)189);
                    if (!var25_5) ** GOTO lbl141
                    throw null;
                }
lbl185:
                // 2 sources

                case 19: {
                    var24_6 /* !! */  = (int)jg.afay("afnl", afbk(int ), (int)190);
                    if (!var25_5) ** GOTO lbl117
                    throw null;
                }
lbl189:
                // 2 sources

                case 20: {
                    var24_6 /* !! */  = (int)jg.afay("afnm", afbk(int ), (int)191);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl335
                }
lbl194:
                // 4 sources

                case 21: {
                    var24_6 /* !! */  = (int)jg.afay("afnn", afbk(int ), (int)192);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
                case 22: {
                    var24_6 /* !! */  = (int)jg.afay("afno", afbk(int ), (int)193);
                    if (!var25_5) ** GOTO lbl102
                    throw null;
                }
lbl203:
                // 2 sources

                case 23: {
                    var24_6 /* !! */  = (int)jg.afay("afnp", afbk(int ), (int)194);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl208:
                // 2 sources

                case 24: {
                    var24_6 /* !! */  = (int)jg.afay("afnq", afbk(int ), (int)195);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
lbl213:
                // 2 sources

                case 25: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var24_6 /* !! */  = (int)jg.afay("afnr", afbk(int ), (int)196);
                        if (var25_5) {
                            throw null;
                        }
                        ** GOTO lbl284
                        break;
                    }
                }
lbl219:
                // 3 sources

                case 26: {
                    var24_6 /* !! */  = (int)jg.afay("afns", afbk(int ), (int)197);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl261
                }
                case 27: {
                    var24_6 /* !! */  = (int)jg.afay("afnt", afbk(int ), (int)198);
                    if (!var25_5) ** GOTO lbl122
                    throw null;
                }
                case 28: {
                    var24_6 /* !! */  = (int)jg.afay("afnu", afbk(int ), (int)199);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl233:
                // 2 sources

                case 29: {
                    var24_6 /* !! */  = (int)jg.afay("afnv", afbk(int ), (int)200);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
lbl238:
                // 2 sources

                case 30: {
                    var24_6 /* !! */  = (int)jg.afay("afnw", afbk(int ), (int)201);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl379
                }
lbl243:
                // 3 sources

                case 31: {
                    var24_6 /* !! */  = (int)jg.afay("afnx", afbk(int ), (int)202);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl355
                }
                case 32: {
                    var24_6 /* !! */  = (int)jg.afay("afny", afbk(int ), (int)203);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
                case 33: {
                    var24_6 /* !! */  = (int)jg.afay("afnz", afbk(int ), (int)204);
                    if (!var25_5) ** GOTO lbl146
                    throw null;
                }
lbl257:
                // 2 sources

                case 34: {
                    var24_6 /* !! */  = (int)jg.afay("afoa", afbk(int ), (int)205);
                    if (!var25_5) ** GOTO lbl127
                    throw null;
                }
lbl261:
                // 3 sources

                case 35: {
                    var24_6 /* !! */  = (int)jg.afay("afob", afbk(int ), (int)206);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl292
                }
                case 36: {
                    var24_6 /* !! */  = (int)jg.afay("afoc", afbk(int ), (int)207);
                    if (!var25_5) ** GOTO lbl257
                    throw null;
                }
lbl270:
                // 2 sources

                case 37: {
                    var24_6 /* !! */  = (int)jg.afay("afod", afbk(int ), (int)208);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl355
                }
lbl275:
                // 6 sources

                case 38: {
                    var24_6 /* !! */  = (int)jg.afay("afoe", afbk(int ), (int)209);
                    if (!var25_5) ** GOTO lbl194
                    throw null;
                }
                case 39: {
                    var24_6 /* !! */  = (int)jg.afay("afof", afbk(int ), (int)210);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl351
                }
lbl284:
                // 2 sources

                case 40: {
                    var24_6 /* !! */  = (int)jg.afay("afog", afbk(int ), (int)211);
                    if (!var25_5) ** GOTO lbl270
                    throw null;
                }
                case 41: {
                    var24_6 /* !! */  = (int)jg.afay("afoh", afbk(int ), (int)212);
                    if (!var25_5) ** GOTO lbl208
                    throw null;
                }
lbl292:
                // 2 sources

                case 42: {
                    var24_6 /* !! */  = (int)jg.afay("afoi", afbk(int ), (int)213);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
lbl297:
                // 3 sources

                case 43: {
                    var24_6 /* !! */  = (int)jg.afay("afoj", afbk(int ), (int)214);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
lbl302:
                // 2 sources

                case 44: {
                    var24_6 /* !! */  = (int)jg.afay("afok", afbk(int ), (int)215);
                    if (var25_5) {
                        throw null;
                    }
                    ** GOTO lbl351
                }
                case 45: {
                    var24_6 /* !! */  = (int)jg.afay("afol", afbk(int ), (int)216);
                    if (!var25_5) ** GOTO lbl185
                    throw null;
                }
lbl311:
                // 2 sources

                case 46: {
                    var24_6 /* !! */  = (int)jg.afay("afom", afbk(int ), (int)217);
                    if (!var25_5) ** GOTO lbl261
                    throw null;
                }
lbl315:
                // 2 sources

                case 47: {
                    var24_6 /* !! */  = (int)jg.afay("afon", afbk(int ), (int)218);
                    if (!var25_5) ** GOTO lbl171
                    throw null;
                }
lbl319:
                // 4 sources

                case 48: {
                    var24_6 /* !! */  = (int)jg.afay("afoo", afbk(int ), (int)219);
                    if (!var25_5) ** GOTO lbl127
                    throw null;
                }
lbl323:
                // 2 sources

                case 49: {
                    var24_6 /* !! */  = (int)jg.afay("afop", afbk(int ), (int)220);
                    if (!var25_5) ** GOTO lbl219
                    throw null;
                }
lbl327:
                // 4 sources

                case 50: {
                    var24_6 /* !! */  = (int)jg.afay("afoq", afbk(int ), (int)221);
                    if (!var25_5) ** GOTO lbl323
                    throw null;
                }
lbl331:
                // 4 sources

                case 51: {
                    var24_6 /* !! */  = (int)jg.afay("afor", afbk(int ), (int)222);
                    if (!var25_5) ** GOTO lbl102
                    throw null;
                }
lbl335:
                // 3 sources

                case 52: {
                    var24_6 /* !! */  = (int)jg.afay("afos", afbk(int ), (int)223);
                    if (!var25_5) ** GOTO lbl194
                    throw null;
                }
                case 53: {
                    var24_6 /* !! */  = (int)jg.afay("afot", afbk(int ), (int)224);
                    if (!var25_5) ** GOTO lbl335
                    throw null;
                }
                case 54: {
                    var24_6 /* !! */  = (int)jg.afay("afou", afbk(int ), (int)225);
                    if (!var25_5) ** GOTO lbl275
                    throw null;
                }
                case 55: {
                    var24_6 /* !! */  = (int)jg.afay("afov", afbk(int ), (int)226);
                    if (!var25_5) ** GOTO lbl203
                    throw null;
                }
lbl351:
                // 4 sources

                case 56: {
                    var24_6 /* !! */  = (int)jg.afay("afow", afbk(int ), (int)227);
                    if (!var25_5) ** GOTO lbl137
                    throw null;
                }
lbl355:
                // 4 sources

                case 57: {
                    var24_6 /* !! */  = (int)jg.afay("afox", afbk(int ), (int)228);
                    if (!var25_5) ** GOTO lbl213
                    throw null;
                }
                case 58: {
                    var24_6 /* !! */  = (int)jg.afay("afoy", afbk(int ), (int)229);
                    if (!var25_5) break block71;
                    throw null;
                }
                case 59: {
                    var24_6 /* !! */  = (int)jg.afay("afoz", afbk(int ), (int)230);
                    if (!var25_5) ** GOTO lbl315
                    throw null;
                }
lbl367:
                // 2 sources

                case 60: {
                    var24_6 /* !! */  = (int)jg.afay("afpa", afbk(int ), (int)231);
                    if (!var25_5) ** GOTO lbl243
                    throw null;
                }
                case 61: {
                    var24_6 /* !! */  = (int)jg.afay("afpb", afbk(int ), (int)232);
                    if (!var25_5) ** GOTO lbl355
                    throw null;
                }
                case 62: {
                    var24_6 /* !! */  = (int)jg.afay("afpc", afbk(int ), (int)233);
                    if (!var25_5) ** GOTO lbl112
                    throw null;
                }
lbl379:
                // 2 sources

                case 63: {
                    var24_6 /* !! */  = (int)jg.afay("afpd", afbk(int ), (int)234);
                    if (!var25_5) ** GOTO lbl107
                    throw null;
                }
                case 64: {
                    var24_6 /* !! */  = (int)jg.afay("afpe", afbk(int ), (int)235);
                    if (!var25_5) ** GOTO lbl297
                    throw null;
                }
                case 65: 
            }
            break;
        }
        var24_6 /* !! */  = (int)jg.afay("afpf", afbk(int ), (int)236);
        ** while (!var25_5)
lbl390:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onAttack(bj var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jg.bt - jg.afay("afed", afbs(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jg.afay("afee", afbk(int ), (int)54)) break;
            v0 /* !! */  = (long)jg.afay("afef", afbk(int ), (int)55);
        }
        var7_2 = jg.c;
        v1 /* !! */  = jg.bt;
        if (true) ** GOTO lbl11
        block90: while (true) {
            v1 /* !! */  = (long)(jg.afay("afeh", afbs(int ), (int)26) - jg.afay("afeg", afbs(int ), (int)25));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -284695211: {
                    break block90;
                }
                case 884389138: {
                    continue block90;
                }
            }
            break;
        }
        var6_3 /* !! */  = jg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jg.bt - jg.afay("afei", afbs(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jg.afay("afej", afbk(int ), (int)56)) break;
            v2 /* !! */  = (long)jg.afay("afek", afbk(int ), (int)57);
        }
        var5_4 = jg.a;
        if (var7_2) {
            throw null;
lbl25:
            // 16 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = jg.bt - jg.afay("afel", afbs(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jg.afay("afem", afbk(int ), (int)58)) break;
            v3 /* !! */  = (long)jg.afay("afen", afbk(int ), (int)59);
        }
        v4 /* !! */  = jg.bt;
        if (true) ** GOTO lbl37
        block94: while (true) {
            v4 /* !! */  = (long)(jg.afay("afep", afbs(int ), (int)30) - jg.afay("afeo", afbs(int ), (int)29));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -284695211: {
                    break block94;
                }
                case 1822628701: {
                    continue block94;
                }
            }
            break;
        }
        if (jg.mc.field_1724 == null) ** GOTO lbl88
        if (var5_4) ** GOTO lbl25
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = jg.bt - jg.afay("afeq", afbs(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == jg.afay("afer", afbk(int ), (int)60)) break;
            v5 /* !! */  = (long)jg.afay("afes", afbk(int ), (int)61);
        }
        var3_5 = var1_1.getTarget();
        if (var5_4) ** GOTO lbl25
        if (!(var3_5 instanceof class_1657)) ** GOTO lbl88
        if (var5_4) ** GOTO lbl25
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_7 = (class_1657)var3_5;
                if (var5_4 || var5_4) ** GOTO lbl25
                v6 /* !! */  = jg.bt;
                if (true) ** GOTO lbl62
                block96: while (true) {
                    v6 /* !! */  = (long)(v7 - jg.afay("afet", afbs(int ), (int)32));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1523203184: {
                            v7 = jg.afay("afeu", afbs(int ), (int)33);
                            continue block96;
                        }
                        case -661843988: {
                            v7 = jg.afay("afev", afbs(int ), (int)34);
                            continue block96;
                        }
                        case -284695211: {
                            break block96;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = jg.bt - jg.afay("afew", afbs(int ), (int)35)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jg.afay("afex", afbk(int ), (int)62)) break;
                    v8 /* !! */  = (long)jg.afay("afey", afbk(int ), (int)63);
                }
                v9 = (bm)jg.mc.field_1724;
                v10 /* !! */  = jg.bt;
                if (true) ** GOTO lbl81
                block98: while (true) {
                    v10 /* !! */  = (long)(jg.afay("affa", afbs(int ), (int)37) - jg.afay("afez", afbs(int ), (int)36));
lbl81:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -284695211: {
                            break block98;
                        }
                        case 19230201: {
                            continue block98;
                        }
                    }
                    break;
                }
                if (v9.phobia$isCriticalHit((class_1297)var2_7)) ** GOTO lbl90
                if (var5_4) ** GOTO lbl25
lbl88:
                // 3 sources

                if (var5_4 || var5_4) ** GOTO lbl25
                return;
lbl90:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl25
                v11 /* !! */  = jg.bt;
                if (true) ** GOTO lbl95
                block99: while (true) {
                    v11 /* !! */  = (long)(jg.afay("affc", afbs(int ), (int)39) - jg.afay("affb", afbs(int ), (int)38));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -284695211: {
                            break block99;
                        }
                        case 375981396: {
                            continue block99;
                        }
                    }
                    break;
                }
                this.syncSettings();
                if (var5_4 || var5_4) ** GOTO lbl25
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = jg.bt - jg.afay("affd", afbs(int ), (int)40)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == jg.afay("affe", afbk(int ), (int)64)) break;
                    v12 /* !! */  = (long)jg.afay("afff", afbk(int ), (int)65);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = jg.bt - jg.afay("affg", afbs(int ), (int)41)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == jg.afay("affh", afbk(int ), (int)66)) break;
                    v13 /* !! */  = (long)jg.afay("affi", afbk(int ), (int)67);
                }
                v14 = jg.mc.method_61966();
                v15 = jg.afay("affj", afbk(int ), (int)68);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_7 = jg.bt - jg.afay("affk", afbs(int ), (int)42)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == jg.afay("affl", afbk(int ), (int)69)) break;
                    v16 /* !! */  = (long)jg.afay("affm", afbk(int ), (int)70);
                }
                var3_6 = v14.method_60637((boolean)v15);
                if (var5_4 || var5_4) ** GOTO lbl25
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_8 = jg.bt - jg.afay("affn", afbs(int ), (int)43)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == jg.afay("affo", afbk(int ), (int)71)) break;
                    v17 /* !! */  = (long)jg.afay("affp", afbk(int ), (int)72);
                }
                var4_8 = var2_7.method_30950(var3_6);
                if (var5_4 || var5_4) ** GOTO lbl25
                v18 /* !! */  = jg.bt;
                if (true) ** GOTO lbl132
                block104: while (true) {
                    v18 /* !! */  = (long)(jg.afay("affr", afbs(int ), (int)45) - jg.afay("affq", afbs(int ), (int)44));
lbl132:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -284695211: {
                            break block104;
                        }
                        case 324248039: {
                            continue block104;
                        }
                    }
                    break;
                }
                v19 /* !! */  = jg.bt;
                if (true) ** GOTO lbl141
                block105: while (true) {
                    v19 /* !! */  = (long)(v20 - jg.afay("affs", afbs(int ), (int)46));
lbl141:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1912833839: {
                            v20 = jg.afay("afft", afbs(int ), (int)47);
                            continue block105;
                        }
                        case -284695211: {
                            break block105;
                        }
                        case 1380244389: {
                            v20 = jg.afay("affu", afbs(int ), (int)48);
                            continue block105;
                        }
                    }
                    break;
                }
                v21 /* !! */  = jg.bt;
                if (true) ** GOTO lbl154
                block106: while (true) {
                    v21 /* !! */  = (long)(jg.afay("affw", afbs(int ), (int)50) - jg.afay("affv", afbs(int ), (int)49));
lbl154:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -284695211: {
                            break block106;
                        }
                        case 751981709: {
                            continue block106;
                        }
                    }
                    break;
                }
                v22 = var2_7.method_5628();
                v23 /* !! */  = jg.bt;
                if (true) ** GOTO lbl164
                block107: while (true) {
                    v23 /* !! */  = (long)(v24 - jg.afay("affx", afbs(int ), (int)51));
lbl164:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1984347510: {
                            v24 = jg.afay("affy", afbs(int ), (int)52);
                            continue block107;
                        }
                        case -1629162558: {
                            v24 = jg.afay("affz", afbs(int ), (int)53);
                            continue block107;
                        }
                        case -284695211: {
                            break block107;
                        }
                    }
                    break;
                }
                v25 = System.nanoTime();
                v26 /* !! */  = jg.bt;
                if (true) ** GOTO lbl178
                block108: while (true) {
                    v26 /* !! */  = (long)(v27 - jg.afay("afga", afbs(int ), (int)54));
lbl178:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -284695211: {
                            break block108;
                        }
                        case -199082615: {
                            v27 = jg.afay("afgb", afbs(int ), (int)55);
                            continue block108;
                        }
                        case 874242299: {
                            v27 = jg.afay("afgc", afbs(int ), (int)56);
                            continue block108;
                        }
                    }
                    break;
                }
                v28 = new jg$Ghost(v22, var4_8, v25);
                v29 /* !! */  = jg.bt;
                if (true) ** GOTO lbl192
                block109: while (true) {
                    v29 /* !! */  = (long)(v30 - jg.afay("afgd", afbs(int ), (int)57));
lbl192:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -284695211: {
                            break block109;
                        }
                        case 1064004756: {
                            v30 = jg.afay("afge", afbs(int ), (int)58);
                            continue block109;
                        }
                        case 1912023200: {
                            v30 = jg.afay("afgf", afbs(int ), (int)59);
                            continue block109;
                        }
                    }
                    break;
                }
                jg.GHOSTS.add(v28);
                if (var5_4) ** GOTO lbl25
                do {
                    if (var5_4 || var5_4) ** GOTO lbl25
                    v31 /* !! */  = jg.bt;
                    if (true) ** GOTO lbl210
                    block111: while (true) {
                        v31 /* !! */  = (long)(v32 - jg.afay("afgg", afbs(int ), (int)60));
lbl210:
                        // 2 sources

                        switch ((int)v31 /* !! */ ) {
                            case -284695211: {
                                break block111;
                            }
                            case 493608681: {
                                v32 = jg.afay("afgh", afbs(int ), (int)61);
                                continue block111;
                            }
                            case 1000368155: {
                                v32 = jg.afay("afgi", afbs(int ), (int)62);
                                continue block111;
                            }
                            case 1465218319: {
                                v32 = jg.afay("afgj", afbs(int ), (int)63);
                                continue block111;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v33 /* !! */  = (cfr_temp_9 = jg.bt - jg.afay("afgk", afbs(int ), (int)64)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v33 /* !! */  == jg.afay("afgl", afbk(int ), (int)73)) break;
                        v33 /* !! */  = (long)jg.afay("afgm", afbk(int ), (int)74);
                    }
                    if (jg.GHOSTS.size() <= jg.afay("afgn", afbk(int ), (int)75)) ** GOTO lbl249
                    if (var5_4) ** GOTO lbl25
                    while (true) {
                        if ((v34 /* !! */  = (cfr_temp_10 = jg.bt - jg.afay("afgo", afbs(int ), (int)65)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v34 /* !! */  == jg.afay("afgp", afbk(int ), (int)76)) break;
                        v34 /* !! */  = (long)jg.afay("afgq", afbk(int ), (int)77);
                    }
                    v35 = jg.afay("afgr", afbk(int ), (int)78);
                    v36 /* !! */  = jg.bt;
                    if (true) ** GOTO lbl239
                    block114: while (true) {
                        v36 /* !! */  = (long)(jg.afay("afgt", afbs(int ), (int)67) - jg.afay("afgs", afbs(int ), (int)66));
lbl239:
                        // 2 sources

                        switch ((int)v36 /* !! */ ) {
                            case -1054165302: {
                                continue block114;
                            }
                            case -284695211: {
                                break block114;
                            }
                        }
                        break;
                    }
                    jg.GHOSTS.remove((int)v35);
                    if (var5_4) ** GOTO lbl25
                } while (!var7_2);
                throw null;
lbl249:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)jg.afay("afgu", afbk(int ), (int)79);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl257:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)jg.afay("afgv", afbk(int ), (int)80);
                if (var7_2) {
                    throw null;
                }
            }
lbl261:
            // 6 sources

            case 2: {
                var6_3 /* !! */  = (int)jg.afay("afgw", afbk(int ), (int)81);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl266:
            // 4 sources

            case 3: {
                var6_3 /* !! */  = (int)jg.afay("afgx", afbk(int ), (int)82);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 4: {
                var6_3 /* !! */  = (int)jg.afay("afgy", afbk(int ), (int)83);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)jg.afay("afgz", afbk(int ), (int)84);
                    if (!var7_2) ** GOTO lbl261
                    throw null;
                }
            }
lbl281:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)jg.afay("afha", afbk(int ), (int)85);
                if (!var7_2) ** GOTO lbl257
                throw null;
            }
lbl285:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)jg.afay("afhb", afbk(int ), (int)86);
                if (!var7_2) ** GOTO lbl266
                throw null;
            }
lbl289:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)jg.afay("afhc", afbk(int ), (int)87);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 9: {
                var6_3 /* !! */  = (int)jg.afay("afhd", afbk(int ), (int)88);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 10: {
                var6_3 /* !! */  = (int)jg.afay("afhe", afbk(int ), (int)89);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl304:
            // 2 sources

            case 11: {
                var6_3 /* !! */  = (int)jg.afay("afhf", afbk(int ), (int)90);
                if (!var7_2) ** GOTO lbl257
                throw null;
            }
lbl308:
            // 3 sources

            case 12: {
                var6_3 /* !! */  = (int)jg.afay("afhg", afbk(int ), (int)91);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl313:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)jg.afay("afhh", afbk(int ), (int)92);
                if (var7_2) {
                    throw null;
                }
            }
lbl317:
            // 4 sources

            case 14: {
                do {
                    var6_3 /* !! */  = (int)jg.afay("afhi", afbk(int ), (int)93);
                } while (!var7_2);
                throw null;
            }
            case 15: {
                var6_3 /* !! */  = (int)jg.afay("afhj", afbk(int ), (int)94);
                if (!var7_2) ** GOTO lbl289
                throw null;
            }
            case 16: {
                do {
                    var6_3 /* !! */  = (int)jg.afay("afhk", afbk(int ), (int)95);
                } while (!var7_2);
                throw null;
            }
            case 17: {
                var6_3 /* !! */  = (int)jg.afay("afhl", afbk(int ), (int)96);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl336:
            // 3 sources

            case 18: {
                var6_3 /* !! */  = (int)jg.afay("afhm", afbk(int ), (int)97);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl366
            }
lbl341:
            // 2 sources

            case 19: {
                var6_3 /* !! */  = (int)jg.afay("afhn", afbk(int ), (int)98);
                if (!var7_2) ** GOTO lbl266
                throw null;
            }
            case 20: {
                var6_3 /* !! */  = (int)jg.afay("afho", afbk(int ), (int)99);
                if (!var7_2) ** GOTO lbl261
                throw null;
            }
            case 21: {
                do {
                    var6_3 /* !! */  = (int)jg.afay("afhp", afbk(int ), (int)100);
                } while (!var7_2);
                throw null;
            }
lbl354:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)jg.afay("afhq", afbk(int ), (int)101);
                if (!var7_2) ** GOTO lbl261
                throw null;
            }
            case 23: {
                var6_3 /* !! */  = (int)jg.afay("afhr", afbk(int ), (int)102);
                if (!var7_2) ** GOTO lbl281
                throw null;
            }
lbl362:
            // 2 sources

            case 24: {
                var6_3 /* !! */  = (int)jg.afay("afhs", afbk(int ), (int)103);
                if (!var7_2) ** GOTO lbl313
                throw null;
            }
lbl366:
            // 2 sources

            case 25: {
                var6_3 /* !! */  = (int)jg.afay("afht", afbk(int ), (int)104);
                if (!var7_2) ** GOTO lbl266
                throw null;
            }
            case 26: {
                var6_3 /* !! */  = (int)jg.afay("afhu", afbk(int ), (int)105);
                if (!var7_2) ** GOTO lbl304
                throw null;
            }
            case 27: 
        }
        var6_3 /* !! */  = (int)jg.afay("afhv", afbk(int ), (int)106);
        ** while (!var7_2)
lbl377:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public static int[] ghostTints(int[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [23[CASE]], but top level block is 48[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void afsm() {
        jg.afaw[0] = -870992472;
        jg.afaw[1] = -1807807557;
        jg.afaw[2] = 1749964783;
        jg.afaw[3] = 900285506;
        jg.afaw[4] = -55924327;
        jg.afaw[5] = -1294237624;
        jg.afaw[6] = -1275389177;
        jg.afaw[7] = 1376011755;
        jg.afaw[8] = 2044170844;
        jg.afaw[9] = 1058475785;
        jg.afaw[10] = 1653092763;
        jg.afaw[11] = -1957100725;
        jg.afaw[12] = 1429754483;
        jg.afaw[13] = 1326441947;
        jg.afaw[14] = 883722943;
        jg.afaw[15] = -205623768;
        jg.afaw[16] = 1030656811;
        jg.afaw[17] = -994683717;
        jg.afaw[18] = 1208661461;
        jg.afaw[19] = 768389592;
        jg.afaw[20] = 779369602;
        jg.afaw[21] = -1118805405;
        jg.afaw[22] = -1715532359;
        jg.afaw[23] = 1582459940;
        jg.afaw[24] = 1739544674;
        jg.afaw[25] = -490341155;
        jg.afaw[26] = -929223606;
        jg.afaw[27] = 1750285423;
        jg.afaw[28] = -786139835;
        jg.afaw[29] = 532078564;
        jg.afaw[30] = 52114748;
        jg.afaw[31] = 1901177042;
        jg.afaw[32] = -188179728;
        jg.afaw[33] = -1549390928;
        jg.afaw[34] = 166337293;
        jg.afaw[35] = -331410036;
        jg.afaw[36] = -252371986;
        jg.afaw[37] = -353365171;
        jg.afaw[38] = -1349555651;
        jg.afaw[39] = -452783559;
        jg.afaw[40] = -2099432659;
        jg.afaw[41] = 522136066;
        jg.afaw[42] = -1445552689;
        jg.afaw[43] = 1382176384;
        jg.afaw[44] = 2098223389;
        jg.afaw[45] = 1504407866;
        jg.afaw[46] = 716346856;
        jg.afaw[47] = 2052420933;
        jg.afaw[48] = -2038827187;
        jg.afaw[49] = 660563205;
        jg.afaw[50] = -264990413;
        jg.afaw[51] = 1190716338;
        jg.afaw[52] = -705415487;
        jg.afaw[53] = 717787637;
        jg.afaw[54] = 1431250552;
        jg.afaw[55] = -1895669994;
        jg.afaw[56] = -63590791;
        jg.afaw[57] = 1405995791;
        jg.afaw[58] = 1429118441;
        jg.afaw[59] = 250479984;
        jg.afaw[60] = -1265883645;
        jg.afaw[61] = 1636501487;
        jg.afaw[62] = -1368463071;
        jg.afaw[63] = 2041755937;
        jg.afaw[64] = 821226581;
        jg.afaw[65] = -2006173615;
        jg.afaw[66] = 1213152583;
        jg.afaw[67] = -1127872530;
        jg.afaw[68] = 1327879159;
        jg.afaw[69] = -1271429424;
        jg.afaw[70] = 1654463947;
        jg.afaw[71] = -840598198;
        jg.afaw[72] = 1217100141;
        jg.afaw[73] = 959625313;
        jg.afaw[74] = 1197605139;
        jg.afaw[75] = 111017225;
        jg.afaw[76] = -1240030217;
        jg.afaw[77] = -1548665473;
        jg.afaw[78] = -1239161088;
        jg.afaw[79] = -1379427194;
        jg.afaw[80] = 1737944356;
        jg.afaw[81] = -509613320;
        jg.afaw[82] = 1875259223;
        jg.afaw[83] = 1602518282;
        jg.afaw[84] = 1190367779;
        jg.afaw[85] = -1061156916;
        jg.afaw[86] = -945691674;
        jg.afaw[87] = -1528065553;
        jg.afaw[88] = -923502434;
        jg.afaw[89] = -1565380387;
        jg.afaw[90] = 2052768098;
        jg.afaw[91] = -2014641213;
        jg.afaw[92] = -1193437413;
        jg.afaw[93] = 1985797601;
        jg.afaw[94] = 789532324;
        jg.afaw[95] = -372632252;
        jg.afaw[96] = -619361481;
        jg.afaw[97] = -1880004041;
        jg.afaw[98] = -1873094141;
        jg.afaw[99] = 635253083;
    }
}

