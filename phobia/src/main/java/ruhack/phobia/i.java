/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import ruhack.phobia.f;
import ruhack.phobia.g;

public class i {
    private static long[] arsj;
    public static final int b;
    public static final boolean a;
    private static int[] arrj;
    private final List<String> completions;
    private String prefix;
    private static int[] arrg;
    private boolean sorted;
    public static final boolean c;
    protected static final long ck = -6059556643516808121L;
    private static long[] arsh;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public i addCommands(List<f> var1_1) {
        var10_2 = i.c;
        var9_3 /* !! */  = i.b;
        var8_4 = i.a;
        if (var10_2) {
            throw null;
lbl6:
            // 23 sources

            return null;
        }
        if (var8_4 || var8_4) ** GOTO lbl6
        var2_5 = this.prefix.toLowerCase();
        if (var8_4 || var8_4) ** GOTO lbl6
        var3_6 = var1_1.iterator();
        if (var8_4) ** GOTO lbl6
        block46: while (true) {
            block90: {
                if (var8_4 || var8_4) ** GOTO lbl6
                if (!var3_6.hasNext()) ** GOTO lbl66
                if (var8_4) ** GOTO lbl6
                var4_7 = var3_6.next();
                if (var8_4 || var8_4) ** GOTO lbl6
                var5_8 = var4_7.getName();
                if (var8_4 || var8_4) ** GOTO lbl6
                if (!var2_5.isEmpty()) break block90;
                if (var8_4 || var8_4) ** GOTO lbl6
                this.completions.add(var5_8);
                if (var8_4) ** GOTO lbl6
                if (var10_2) {
                    throw null;
                }
                ** GOTO lbl63
            }
            if (var8_4) ** GOTO lbl6
            if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var9_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var8_4) ** GOTO lbl6
                    if (!var5_8.toLowerCase().startsWith(var2_5)) ** GOTO lbl43
                    if (var8_4 || var8_4) ** GOTO lbl6
                    this.completions.add(var5_8);
                    if (var8_4) ** GOTO lbl6
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl63
lbl43:
                    // 1 sources

                    if (var8_4 || var8_4) ** GOTO lbl6
                    var6_9 = var4_7.getAliases().iterator();
                    if (var8_4) ** GOTO lbl6
                    do {
                        if (var8_4 || var8_4) ** GOTO lbl6
                        if (!var6_9.hasNext()) ** GOTO lbl63
                        if (var8_4) ** GOTO lbl6
                        var7_10 = var6_9.next();
                        if (var8_4 || var8_4) ** GOTO lbl6
                        if (!var7_10.toLowerCase().startsWith(var2_5)) ** GOTO lbl60
                        if (var8_4 || var8_4) ** GOTO lbl6
                        this.completions.add(var7_10);
                        if (var8_4 || var8_4) ** GOTO lbl6
                        if (var10_2) {
                            throw null;
                        }
                        ** GOTO lbl63
lbl60:
                        // 1 sources

                        if (var8_4 || var8_4) ** GOTO lbl6
                    } while (!var10_2);
                    throw null;
lbl63:
                    // 4 sources

                    if (var8_4 || var8_4) ** GOTO lbl6
                    if (!var10_2) continue block46;
                    throw null;
                }
lbl66:
                // 1 sources

                if (!var8_4 && !var8_4) ** break;
                ** continue;
                return this;
lbl69:
                // 3 sources

                case 0: {
                    do {
                        var9_3 /* !! */  = (int)i.arrk("aryb", arrd(int ), (int)64);
                    } while (!var10_2);
                    throw null;
                }
lbl74:
                // 3 sources

                case 1: {
                    var9_3 /* !! */  = (int)i.arrk("aryc", arrd(int ), (int)65);
                    if (!var10_2) ** GOTO lbl69
                    throw null;
                }
                case 2: {
                    var9_3 /* !! */  = (int)i.arrk("arye", arrd(int ), (int)66);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl103
                }
lbl83:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_3 /* !! */  = (int)i.arrk("aryf", arrd(int ), (int)67);
                        if (var10_2) {
                            throw null;
                        }
                        ** GOTO lbl155
                        break;
                    }
                }
lbl89:
                // 2 sources

                case 4: {
                    var9_3 /* !! */  = (int)i.arrk("aryg", arrd(int ), (int)68);
                    if (!var10_2) ** GOTO lbl74
                    throw null;
                }
lbl93:
                // 3 sources

                case 5: {
                    var9_3 /* !! */  = (int)i.arrk("aryi", arrd(int ), (int)69);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
                case 6: {
                    var9_3 /* !! */  = (int)i.arrk("aryj", arrd(int ), (int)70);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl108
                }
lbl103:
                // 2 sources

                case 7: {
                    var9_3 /* !! */  = (int)i.arrk("aryk", arrd(int ), (int)71);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl108:
                // 2 sources

                case 8: {
                    var9_3 /* !! */  = (int)i.arrk("aryl", arrd(int ), (int)72);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl113:
                // 2 sources

                case 9: {
                    var9_3 /* !! */  = (int)i.arrk("aryn", arrd(int ), (int)73);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl118:
                // 2 sources

                case 10: {
                    var9_3 /* !! */  = (int)i.arrk("aryo", arrd(int ), (int)74);
                    if (!var10_2) break block46;
                    throw null;
                }
                case 11: {
                    var9_3 /* !! */  = (int)i.arrk("aryp", arrd(int ), (int)75);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
lbl127:
                // 2 sources

                case 12: {
                    var9_3 /* !! */  = (int)i.arrk("aryr", arrd(int ), (int)76);
                    if (!var10_2) ** GOTO lbl74
                    throw null;
                }
lbl131:
                // 2 sources

                case 13: {
                    var9_3 /* !! */  = (int)i.arrk("aryt", arrd(int ), (int)77);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl136:
                // 2 sources

                case 14: {
                    var9_3 /* !! */  = (int)i.arrk("aryv", arrd(int ), (int)78);
                    if (!var10_2) ** GOTO lbl127
                    throw null;
                }
                case 15: {
                    var9_3 /* !! */  = (int)i.arrk("aryz", arrd(int ), (int)79);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl145:
                // 2 sources

                case 16: {
                    var9_3 /* !! */  = (int)i.arrk("arza", arrd(int ), (int)80);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
                case 17: {
                    var9_3 /* !! */  = (int)i.arrk("arzb", arrd(int ), (int)81);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl242
                }
lbl155:
                // 3 sources

                case 18: {
                    var9_3 /* !! */  = (int)i.arrk("arzc", arrd(int ), (int)82);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
                case 19: {
                    var9_3 /* !! */  = (int)i.arrk("arzd", arrd(int ), (int)83);
                    if (!var10_2) ** GOTO lbl136
                    throw null;
                }
lbl164:
                // 2 sources

                case 20: {
                    var9_3 /* !! */  = (int)i.arrk("arze", arrd(int ), (int)84);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl217
                }
                case 21: {
                    var9_3 /* !! */  = (int)i.arrk("arzf", arrd(int ), (int)85);
                    if (!var10_2) ** GOTO lbl69
                    throw null;
                }
                case 22: {
                    var9_3 /* !! */  = (int)i.arrk("arzh", arrd(int ), (int)86);
                    if (!var10_2) ** GOTO lbl83
                    throw null;
                }
lbl177:
                // 2 sources

                case 23: {
                    var9_3 /* !! */  = (int)i.arrk("arzi", arrd(int ), (int)87);
                    if (!var10_2) ** GOTO lbl131
                    throw null;
                }
                case 24: {
                    var9_3 /* !! */  = (int)i.arrk("arzj", arrd(int ), (int)88);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl186:
                // 4 sources

                case 25: {
                    var9_3 /* !! */  = (int)i.arrk("arzk", arrd(int ), (int)89);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl191:
                // 4 sources

                case 26: {
                    var9_3 /* !! */  = (int)i.arrk("arzm", arrd(int ), (int)90);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl246
                }
lbl196:
                // 2 sources

                case 27: {
                    var9_3 /* !! */  = (int)i.arrk("arzn", arrd(int ), (int)91);
                    if (!var10_2) ** GOTO lbl177
                    throw null;
                }
                case 28: {
                    var9_3 /* !! */  = (int)i.arrk("arzo", arrd(int ), (int)92);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl242
                }
                case 29: {
                    var9_3 /* !! */  = (int)i.arrk("arzs", arrd(int ), (int)93);
                    if (!var10_2) ** GOTO lbl118
                    throw null;
                }
lbl209:
                // 2 sources

                case 30: {
                    var9_3 /* !! */  = (int)i.arrk("arzu", arrd(int ), (int)94);
                    if (!var10_2) ** GOTO lbl93
                    throw null;
                }
                case 31: {
                    var9_3 /* !! */  = (int)i.arrk("arzv", arrd(int ), (int)95);
                    if (!var10_2) ** GOTO lbl145
                    throw null;
                }
lbl217:
                // 2 sources

                case 32: {
                    var9_3 /* !! */  = (int)i.arrk("arzx", arrd(int ), (int)96);
                    if (!var10_2) ** GOTO lbl191
                    throw null;
                }
lbl221:
                // 2 sources

                case 33: {
                    var9_3 /* !! */  = (int)i.arrk("arzz", arrd(int ), (int)97);
                    if (!var10_2) ** GOTO lbl89
                    throw null;
                }
lbl225:
                // 3 sources

                case 34: {
                    var9_3 /* !! */  = (int)i.arrk("asab", arrd(int ), (int)98);
                    if (!var10_2) break block46;
                    throw null;
                }
                case 35: {
                    var9_3 /* !! */  = (int)i.arrk("asae", arrd(int ), (int)99);
                    if (!var10_2) ** GOTO lbl93
                    throw null;
                }
lbl233:
                // 3 sources

                case 36: {
                    var9_3 /* !! */  = (int)i.arrk("asag", arrd(int ), (int)100);
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
                case 37: {
                    var9_3 /* !! */  = (int)i.arrk("asai", arrd(int ), (int)101);
                    if (!var10_2) ** GOTO lbl155
                    throw null;
                }
lbl242:
                // 3 sources

                case 38: {
                    var9_3 /* !! */  = (int)i.arrk("asak", arrd(int ), (int)102);
                    if (!var10_2) ** GOTO lbl186
                    throw null;
                }
lbl246:
                // 2 sources

                case 39: {
                    var9_3 /* !! */  = (int)i.arrk("asam", arrd(int ), (int)103);
                    if (!var10_2) ** GOTO lbl209
                    throw null;
                }
lbl250:
                // 2 sources

                case 40: {
                    var9_3 /* !! */  = (int)i.arrk("asao", arrd(int ), (int)104);
                    if (!var10_2) ** GOTO lbl113
                    throw null;
                }
lbl254:
                // 2 sources

                case 41: {
                    var9_3 /* !! */  = (int)i.arrk("asap", arrd(int ), (int)105);
                    if (!var10_2) ** GOTO lbl233
                    throw null;
                }
                case 42: 
            }
            break;
        }
        var9_3 /* !! */  = (int)i.arrk("asar", arrd(int ), (int)106);
        ** while (!var10_2)
lbl261:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public i append(String ... var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = i.ck - i.arrk("arsm", arsb(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == i.arrk("arsp", arrd(int ), (int)7)) break;
            v0 /* !! */  = (long)i.arrk("arss", arrd(int ), (int)8);
        }
        var4_2 = i.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("arst", arsb(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == i.arrk("arsu", arrd(int ), (int)9)) break;
            v1 /* !! */  = (long)i.arrk("arta", arrd(int ), (int)10);
        }
        var3_3 /* !! */  = i.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = i.ck - i.arrk("artc", arsb(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == i.arrk("artd", arrd(int ), (int)11)) break;
            v2 /* !! */  = (long)i.arrk("arte", arrd(int ), (int)12);
        }
        var2_4 = i.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = i.ck;
                if (true) ** GOTO lbl31
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - i.arrk("artf", arsb(int ), (int)3));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -665874460: {
                            v4 = i.arrk("artg", arsb(int ), (int)4);
                            continue block23;
                        }
                        case -36700676: {
                            v4 = i.arrk("arth", arsb(int ), (int)5);
                            continue block23;
                        }
                        case 1422808631: {
                            v4 = i.arrk("artn", arsb(int ), (int)6);
                            continue block23;
                        }
                        case 1859290183: {
                            break block23;
                        }
                    }
                    break;
                }
                v5 /* !! */  = i.ck;
                if (true) ** GOTO lbl47
                block24: while (true) {
                    v5 /* !! */  = (long)(v6 - i.arrk("arto", arsb(int ), (int)7));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 116689704: {
                            v6 = i.arrk("artp", arsb(int ), (int)8);
                            continue block24;
                        }
                        case 1225508184: {
                            v6 = i.arrk("artq", arsb(int ), (int)9);
                            continue block24;
                        }
                        case 1859290183: {
                            break block24;
                        }
                    }
                    break;
                }
                v7 = Arrays.asList(var1_1);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = i.ck - i.arrk("artt", arsb(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == i.arrk("artv", arrd(int ), (int)13)) break;
                    v8 /* !! */  = (long)i.arrk("artx", arrd(int ), (int)14);
                }
                this.completions.addAll(v7);
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl65:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)i.arrk("artz", arrd(int ), (int)15);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                var3_3 /* !! */  = (int)i.arrk("arub", arrd(int ), (int)16);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)i.arrk("aruc", arrd(int ), (int)17);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl79:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)i.arrk("arud", arrd(int ), (int)18);
                if (var4_2) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)i.arrk("arug", arrd(int ), (int)19);
                if (!var4_2) ** GOTO lbl74
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)i.arrk("arui", arrd(int ), (int)20);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void asjb() {
        i.arsj[0] = 1452595827760198996L;
        i.arsj[1] = -3187049363784901239L;
        i.arsj[2] = 2780527600101169212L;
        i.arsj[3] = -8882974678843154694L;
        i.arsj[4] = -4014975493536523375L;
        i.arsj[5] = 7438739537296216041L;
        i.arsj[6] = -6943180602381486667L;
        i.arsj[7] = -691336771267905781L;
        i.arsj[8] = 1434217421170140458L;
        i.arsj[9] = 8089651614702544836L;
        i.arsj[10] = -8406635062285732223L;
        i.arsj[11] = 6462759576470775536L;
        i.arsj[12] = 151667788940788905L;
        i.arsj[13] = -5000178573282900814L;
        i.arsj[14] = 3890976453939944062L;
        i.arsj[15] = -5984672062113588602L;
        i.arsj[16] = -2319973296555097077L;
        i.arsj[17] = -4865202905747043910L;
        i.arsj[18] = 1029416551042105160L;
        i.arsj[19] = 824934077251211489L;
        i.arsj[20] = -4812149730984817729L;
        i.arsj[21] = -8235479777619935360L;
        i.arsj[22] = 5535684651502174042L;
        i.arsj[23] = -151466852004893834L;
        i.arsj[24] = -6018400823579200160L;
        i.arsj[25] = -2233495570294611061L;
        i.arsj[26] = -3210160003771748493L;
        i.arsj[27] = -8953121492101988913L;
        i.arsj[28] = -2529011180567343077L;
        i.arsj[29] = -673032393329991215L;
        i.arsj[30] = 5748198312414463351L;
        i.arsj[31] = -4778418376462509165L;
        i.arsj[32] = -6048795918515170765L;
        i.arsj[33] = 5013298540699506912L;
        i.arsj[34] = -1059401300778212855L;
        i.arsj[35] = -7613796376245126530L;
        i.arsj[36] = 1632163444766442774L;
        i.arsj[37] = -3197050199763896865L;
        i.arsj[38] = -8226398405012762233L;
        i.arsj[39] = -2552419566338553548L;
        i.arsj[40] = 6380270305041694913L;
        i.arsj[41] = 5464408814580074136L;
        i.arsj[42] = -4409600397698253617L;
        i.arsj[43] = 8161341597216802891L;
        i.arsj[44] = 1416954669114922223L;
        i.arsj[45] = 1236878354336467962L;
        i.arsj[46] = -7894554710786476267L;
        i.arsj[47] = 8550634874125048332L;
        i.arsj[48] = -4336036941638443222L;
        i.arsj[49] = -7824481173333615471L;
        i.arsj[50] = 2983966207295212432L;
        i.arsj[51] = 5770631031448133215L;
        i.arsj[52] = -4849118811331472566L;
        i.arsj[53] = 3590205347912496051L;
        i.arsj[54] = 5413440044539731864L;
        i.arsj[55] = 3795470541714053073L;
        i.arsj[56] = -3356552389316098696L;
        i.arsj[57] = 6472057189195030250L;
        i.arsj[58] = 5934805407785898871L;
        i.arsj[59] = 7176900719463446920L;
        i.arsj[60] = 2789787353289807378L;
        i.arsj[61] = 4369863965360839037L;
        i.arsj[62] = -3453099342546231336L;
        i.arsj[63] = -6341667721390591269L;
        i.arsj[64] = 6557325073895075026L;
        i.arsj[65] = -4055306479392410347L;
        i.arsj[66] = 6842746251917026051L;
        i.arsj[67] = 2959200671696921233L;
        i.arsj[68] = 4902797842766581232L;
        i.arsj[69] = 6136945885769600610L;
        i.arsj[70] = -3268212434828231462L;
        i.arsj[71] = 3739468546119592356L;
        i.arsj[72] = -2700789634362144320L;
        i.arsj[73] = 5175382883521019695L;
        i.arsj[74] = 4070037395370055485L;
        i.arsj[75] = 2364421836957912026L;
        i.arsj[76] = -8388004246557759880L;
        i.arsj[77] = -7597849385733117723L;
        i.arsj[78] = -1038885798619558812L;
        i.arsj[79] = -4044251043905815909L;
        i.arsj[80] = -868540060004331822L;
        i.arsj[81] = 7872314304656163861L;
        i.arsj[82] = 3994757562996273194L;
        i.arsj[83] = 9061337197001126351L;
        i.arsj[84] = -2190338573398046246L;
        i.arsj[85] = -2028953757258137539L;
        i.arsj[86] = 2171126241931942609L;
        i.arsj[87] = -7802739724992280803L;
        i.arsj[88] = -4330196515620017897L;
        i.arsj[89] = 3957082016545563953L;
        i.arsj[90] = -3871739318723613286L;
        i.arsj[91] = 1985179670383761730L;
        i.arsj[92] = 2603979418520472294L;
        i.arsj[93] = -6229749418972251782L;
        i.arsj[94] = 5981199213932180511L;
        i.arsj[95] = 5648466288945872455L;
        i.arsj[96] = -1042862941928736782L;
        i.arsj[97] = 695219940784971366L;
        i.arsj[98] = -8367320959401200572L;
        i.arsj[99] = 8876114969420520475L;
    }

    private static /* synthetic */ void asiy() {
        i.arrj[200] = 678441052;
        i.arrj[201] = -1336509336;
        i.arrj[202] = 1844938211;
        i.arrj[203] = 1591931290;
        i.arrj[204] = -711938905;
        i.arrj[205] = 265026352;
        i.arrj[206] = -21129283;
        i.arrj[207] = 1491753379;
        i.arrj[208] = -898867113;
        i.arrj[209] = 2046084181;
        i.arrj[210] = 2031959086;
        i.arrj[211] = 1852519157;
        i.arrj[212] = 464722725;
        i.arrj[213] = -59056411;
        i.arrj[214] = 599795500;
        i.arrj[215] = -1522018460;
        i.arrj[216] = 1236392951;
        i.arrj[217] = 1822746245;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String[] lambda$toArray$1(int n2) {
        boolean bl2;
        Object object = ck;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - i.arrk("ashi", arsb(int ), (int)83);
            }
            switch ((int)object) {
                case -1960375192: {
                    callSite = i.arrk("ashj", arsb(int ), (int)84);
                    continue block5;
                }
                case 1361214108: {
                    callSite = i.arrk("ashk", arsb(int ), (int)85);
                    continue block5;
                }
                case 1859290183: {
                    break block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ck - i.arrk("ashl", arsb(int ), (int)86)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == i.arrk("ashm", arrd(int ), (int)199)) break;
            object2 = i.arrk("ashn", arrd(int ), (int)200);
        }
        int n3 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ck - i.arrk("asho", arsb(int ), (int)87)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == i.arrk("ashp", arrd(int ), (int)201)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = i.arrk("ashq", arrd(int ), (int)202);
        }
        if (!bl2 && !bl2) return new String[n2];
        return null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public Stream<String> stream() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("aseh", arsb(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == i.arrk("asei", arrd(int ), (int)156)) break;
            v0 /* !! */  = (long)i.arrk("asej", arrd(int ), (int)157);
        }
        var4_1 = i.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = i.ck - i.arrk("asek", arsb(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == i.arrk("asel", arrd(int ), (int)158)) break;
            v1 /* !! */  = (long)i.arrk("asem", arrd(int ), (int)159);
        }
        var3_2 /* !! */  = i.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = i.ck - i.arrk("asen", arsb(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == i.arrk("aseo", arrd(int ), (int)160)) {
                var2_3 = i.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)i.arrk("asep", arrd(int ), (int)161);
        }
        if (var2_3 || var2_3) return null;
        v3 /* !! */  = i.ck;
        if (true) ** GOTO lbl27
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - i.arrk("aseq", arsb(int ), (int)50));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 258985219: {
                    v4 = i.arrk("aser", arsb(int ), (int)51);
                    continue block21;
                }
                case 474066851: {
                    v4 = i.arrk("ases", arsb(int ), (int)52);
                    continue block21;
                }
                case 1859290183: {
                    break block21;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = i.ck - i.arrk("aset", arsb(int ), (int)53)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == i.arrk("aseu", arrd(int ), (int)162)) break;
            v5 /* !! */  = (long)i.arrk("asev", arrd(int ), (int)163);
        }
        v6 = this.completions.stream();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = i.ck - i.arrk("asew", arsb(int ), (int)54)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == i.arrk("asex", arrd(int ), (int)164)) break;
            v7 /* !! */  = (long)i.arrk("asey", arrd(int ), (int)165);
        }
        v8 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$stream$0(java.lang.String ), (Ljava/lang/String;)Z)((i)this);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_6 = i.ck - i.arrk("asez", arsb(int ), (int)55)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == i.arrk("asfa", arrd(int ), (int)166)) {
                var1_4 = v6.filter(v8);
                if (var2_3) return null;
                break;
            }
            v9 /* !! */  = (long)i.arrk("asfb", arrd(int ), (int)167);
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block48: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_3) return null;
                        while (true) {
                            if ((v10 /* !! */  = (cfr_temp_7 = i.ck - i.arrk("asfc", arsb(int ), (int)56)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v10 /* !! */  != i.arrk("asfd", arrd(int ), (int)168)) ** GOTO lbl68
                            if (this.sorted) {
                                break;
                            }
                            ** GOTO lbl79
lbl68:
                            // 1 sources

                            v10 /* !! */  = (long)i.arrk("asfe", arrd(int ), (int)169);
                        }
                        if (var2_3 || var2_3) return null;
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_8 = i.ck - i.arrk("asff", arsb(int ), (int)57)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  == i.arrk("asfg", arrd(int ), (int)170)) {
                                var1_4 = var1_4.sorted();
                                if (var2_3) return null;
                                break;
                            }
                            v11 /* !! */  = (long)i.arrk("asfh", arrd(int ), (int)171);
                        }
lbl79:
                        // 2 sources

                        if (!var2_3 && !var2_3) return var1_4;
                        return null;
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)i.arrk("asfi", arrd(int ), (int)172);
                        if (!var4_1) ** break;
                        throw null;
                    }
                    case 2: {
                        do {
                            var3_2 /* !! */  = (int)i.arrk("asfk", arrd(int ), (int)174);
                        } while (!var4_1);
                        throw null;
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)i.arrk("asfl", arrd(int ), (int)175);
                        cfr_temp_0 = 7;
                        if (var4_1) {
                            throw null;
                        }
                        break block48;
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)i.arrk("asfn", arrd(int ), (int)177);
                        cfr_temp_0 = 9;
                        if (var4_1) {
                            throw null;
                        }
                        break block48;
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)i.arrk("asfp", arrd(int ), (int)179);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_2 /* !! */  = (int)i.arrk("asfo", arrd(int ), (int)178);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        do {
                            var3_2 /* !! */  = (int)i.arrk("asfj", arrd(int ), (int)173);
                        } while (!var4_1);
                        throw null;
                    }
                    case 8: {
                        ** GOTO lbl121
                    }
                    case 10: {
                        var3_2 /* !! */  = (int)i.arrk("asfs", arrd(int ), (int)182);
                        if (var4_1) {
                            throw null;
                        }
lbl121:
                        // 3 sources

                        var3_2 /* !! */  = (int)i.arrk("asfq", arrd(int ), (int)180);
                        cfr_temp_0 = 9;
                        if (var4_1) {
                            throw null;
                        }
                        break block48;
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)i.arrk("asfm", arrd(int ), (int)176);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl135
            }
            do {
                if (true) continue block25;
lbl135:
                // 2 sources

                var3_2 /* !! */  = (int)i.arrk("asfr", arrd(int ), (int)181);
                cfr_temp_0 = 4;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void asiw() {
        i.arrj[0] = 1693763403;
        i.arrj[1] = 964893678;
        i.arrj[2] = -635353978;
        i.arrj[3] = -2010537714;
        i.arrj[4] = -2027827806;
        i.arrj[5] = 428347712;
        i.arrj[6] = 85933303;
        i.arrj[7] = -140641811;
        i.arrj[8] = -1584921213;
        i.arrj[9] = -1451991647;
        i.arrj[10] = -1790967105;
        i.arrj[11] = -793952207;
        i.arrj[12] = -1319611606;
        i.arrj[13] = -2046639323;
        i.arrj[14] = -471831911;
        i.arrj[15] = -1280945684;
        i.arrj[16] = 259026089;
        i.arrj[17] = -1927306802;
        i.arrj[18] = -1120337094;
        i.arrj[19] = 1060006955;
        i.arrj[20] = -344907630;
        i.arrj[21] = 1438782738;
        i.arrj[22] = 544854722;
        i.arrj[23] = -52856730;
        i.arrj[24] = -1311705326;
        i.arrj[25] = -589476537;
        i.arrj[26] = -1237640644;
        i.arrj[27] = 117518618;
        i.arrj[28] = 2024706316;
        i.arrj[29] = 1389052066;
        i.arrj[30] = -451731096;
        i.arrj[31] = 1423514887;
        i.arrj[32] = 1882479054;
        i.arrj[33] = 267199432;
        i.arrj[34] = -1498511937;
        i.arrj[35] = -1670001697;
        i.arrj[36] = -1373169733;
        i.arrj[37] = -444442716;
        i.arrj[38] = 611317173;
        i.arrj[39] = 532589113;
        i.arrj[40] = -1304796375;
        i.arrj[41] = -1432362885;
        i.arrj[42] = 809098301;
        i.arrj[43] = -535519029;
        i.arrj[44] = -218421364;
        i.arrj[45] = 826260029;
        i.arrj[46] = -148324206;
        i.arrj[47] = 1785131736;
        i.arrj[48] = 763269843;
        i.arrj[49] = -956260836;
        i.arrj[50] = -1691525581;
        i.arrj[51] = 1259540455;
        i.arrj[52] = 1007032082;
        i.arrj[53] = -1381757598;
        i.arrj[54] = -1847477970;
        i.arrj[55] = -2054992715;
        i.arrj[56] = -1213242784;
        i.arrj[57] = 1239528831;
        i.arrj[58] = 451195553;
        i.arrj[59] = -1572096148;
        i.arrj[60] = -1722715902;
        i.arrj[61] = 822378849;
        i.arrj[62] = -88350339;
        i.arrj[63] = -154961132;
        i.arrj[64] = -870965816;
        i.arrj[65] = 1614212104;
        i.arrj[66] = 284406669;
        i.arrj[67] = 1443661384;
        i.arrj[68] = 863098039;
        i.arrj[69] = 950626393;
        i.arrj[70] = -986572106;
        i.arrj[71] = -60659411;
        i.arrj[72] = -334410777;
        i.arrj[73] = -485035471;
        i.arrj[74] = -1754248576;
        i.arrj[75] = 94674592;
        i.arrj[76] = -1771084114;
        i.arrj[77] = 1490623676;
        i.arrj[78] = 265570772;
        i.arrj[79] = 1587524782;
        i.arrj[80] = -1337743618;
        i.arrj[81] = -234999288;
        i.arrj[82] = -1830068985;
        i.arrj[83] = -790886328;
        i.arrj[84] = 2048643339;
        i.arrj[85] = 1139357652;
        i.arrj[86] = 999459863;
        i.arrj[87] = 1911556151;
        i.arrj[88] = -1770412752;
        i.arrj[89] = -1406341714;
        i.arrj[90] = 1290455347;
        i.arrj[91] = 2092905293;
        i.arrj[92] = -1846029293;
        i.arrj[93] = -992995268;
        i.arrj[94] = 1485470592;
        i.arrj[95] = -68270628;
        i.arrj[96] = 1451725062;
        i.arrj[97] = 1933225433;
        i.arrj[98] = 536244762;
        i.arrj[99] = -194491796;
    }

    private static /* synthetic */ long arsb(int n2) {
        return arsh[n2] ^ arsj[n2];
    }

    private static /* synthetic */ void asit() {
        i.arrg[0] = 1693763403;
        i.arrg[1] = 964893678;
        i.arrg[2] = -635353982;
        i.arrg[3] = -2010537718;
        i.arrg[4] = -2027827807;
        i.arrg[5] = 428347712;
        i.arrg[6] = 85933302;
        i.arrg[7] = 140641810;
        i.arrg[8] = 117843061;
        i.arrg[9] = 1451991646;
        i.arrg[10] = 522278744;
        i.arrg[11] = 793952206;
        i.arrg[12] = 1815993132;
        i.arrg[13] = 2046639322;
        i.arrg[14] = 871757818;
        i.arrg[15] = -1280945688;
        i.arrg[16] = 259026088;
        i.arrg[17] = -1927306802;
        i.arrg[18] = -1120337090;
        i.arrg[19] = 1060006953;
        i.arrg[20] = -344907629;
        i.arrg[21] = 1438782742;
        i.arrg[22] = 544854749;
        i.arrg[23] = -52856709;
        i.arrg[24] = -1311705330;
        i.arrg[25] = -589476542;
        i.arrg[26] = -1237640663;
        i.arrg[27] = 117518613;
        i.arrg[28] = 2024706332;
        i.arrg[29] = 1389052038;
        i.arrg[30] = -451731074;
        i.arrg[31] = 1423514894;
        i.arrg[32] = 1882479086;
        i.arrg[33] = 267199429;
        i.arrg[34] = -1498511948;
        i.arrg[35] = -1670001721;
        i.arrg[36] = -1373169774;
        i.arrg[37] = -444442701;
        i.arrg[38] = 611317137;
        i.arrg[39] = 532589083;
        i.arrg[40] = -1304796407;
        i.arrg[41] = -1432362891;
        i.arrg[42] = 809098285;
        i.arrg[43] = -535518996;
        i.arrg[44] = -218421357;
        i.arrg[45] = 826259996;
        i.arrg[46] = -148324204;
        i.arrg[47] = 1785131731;
        i.arrg[48] = 763269849;
        i.arrg[49] = -956260807;
        i.arrg[50] = -1691525605;
        i.arrg[51] = 1259540460;
        i.arrg[52] = 1007032117;
        i.arrg[53] = -1381757570;
        i.arrg[54] = -1847477979;
        i.arrg[55] = -2054992746;
        i.arrg[56] = -1213242761;
        i.arrg[57] = 1239528804;
        i.arrg[58] = 451195576;
        i.arrg[59] = -1572096131;
        i.arrg[60] = -1722715890;
        i.arrg[61] = 822378868;
        i.arrg[62] = -88350353;
        i.arrg[63] = -154961125;
        i.arrg[64] = -870965778;
        i.arrg[65] = 1614212115;
        i.arrg[66] = 284406682;
        i.arrg[67] = 1443661421;
        i.arrg[68] = 863098041;
        i.arrg[69] = 950626417;
        i.arrg[70] = -986572132;
        i.arrg[71] = -60659415;
        i.arrg[72] = -334410761;
        i.arrg[73] = -485035476;
        i.arrg[74] = -1754248559;
        i.arrg[75] = 94674569;
        i.arrg[76] = -1771084153;
        i.arrg[77] = 1490623636;
        i.arrg[78] = 265570760;
        i.arrg[79] = 1587524771;
        i.arrg[80] = -1337743644;
        i.arrg[81] = -234999267;
        i.arrg[82] = -1830068953;
        i.arrg[83] = -790886296;
        i.arrg[84] = 2048643347;
        i.arrg[85] = 1139357652;
        i.arrg[86] = 999459863;
        i.arrg[87] = 1911556145;
        i.arrg[88] = -1770412763;
        i.arrg[89] = -1406341745;
        i.arrg[90] = 1290455346;
        i.arrg[91] = 2092905303;
        i.arrg[92] = -1846029263;
        i.arrg[93] = -992995287;
        i.arrg[94] = 1485470608;
        i.arrg[95] = -68270633;
        i.arrg[96] = 1451725103;
        i.arrg[97] = 1933225424;
        i.arrg[98] = 536244767;
        i.arrg[99] = -194491831;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public i filterPrefix(String var1_1) {
        v0 /* !! */  = i.ck;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(i.arrk("asax", arsb(int ), (int)12) - i.arrk("asav", arsb(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1535318150: {
                    continue block20;
                }
                case 1859290183: {
                    break block20;
                }
            }
            break;
        }
        var4_2 = i.c;
        v1 /* !! */  = i.ck;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(i.arrk("asba", arsb(int ), (int)14) - i.arrk("asaz", arsb(int ), (int)13));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 578218054: {
                    continue block21;
                }
                case 1859290183: {
                    break block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = i.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = i.ck - i.arrk("asbc", arsb(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == i.arrk("asbd", arrd(int ), (int)107)) break;
            v2 /* !! */  = (long)i.arrk("asbg", arrd(int ), (int)108);
        }
        var2_4 = i.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                v3 /* !! */  = i.ck;
                if (true) ** GOTO lbl39
                block24: while (true) {
                    v3 /* !! */  = (long)(i.arrk("asbi", arsb(int ), (int)17) - i.arrk("asbh", arsb(int ), (int)16));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1368058253: {
                            continue block24;
                        }
                        case 1859290183: {
                            break block24;
                        }
                    }
                    break;
                }
                v4 = var1_1.toLowerCase();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("asbj", arsb(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == i.arrk("asbk", arrd(int ), (int)109)) break;
                    v5 /* !! */  = (long)i.arrk("asbl", arrd(int ), (int)110);
                }
                this.prefix = v4;
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl53:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)i.arrk("asbm", arrd(int ), (int)111);
                    if (!var4_2) break block8;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)i.arrk("asbn", arrd(int ), (int)112);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
lbl62:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)i.arrk("asbo", arrd(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 3: {
                var3_3 /* !! */  = (int)i.arrk("asbp", arrd(int ), (int)114);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
lbl71:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)i.arrk("asbq", arrd(int ), (int)115);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)i.arrk("asbr", arrd(int ), (int)116);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$stream$0(String var1_1) {
        v0 /* !! */  = i.ck;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - i.arrk("ashv", arsb(int ), (int)88));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1980505938: {
                    v1 = i.arrk("ashw", arsb(int ), (int)89);
                    continue block22;
                }
                case -1481731266: {
                    v1 = i.arrk("ashx", arsb(int ), (int)90);
                    continue block22;
                }
                case 1230981185: {
                    v1 = i.arrk("ashy", arsb(int ), (int)91);
                    continue block22;
                }
                case 1859290183: {
                    break block22;
                }
            }
            break;
        }
        var4_2 = i.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = i.ck - i.arrk("ashz", arsb(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == i.arrk("asia", arrd(int ), (int)207)) break;
            v2 /* !! */  = (long)i.arrk("asib", arrd(int ), (int)208);
        }
        var3_3 /* !! */  = i.b;
        v3 /* !! */  = i.ck;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(i.arrk("asid", arsb(int ), (int)94) - i.arrk("asic", arsb(int ), (int)93));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 212566608: {
                    continue block24;
                }
                case 1859290183: {
                    break block24;
                }
            }
            break;
        }
        var2_4 = i.a;
        if (!var4_2) ** GOTO lbl41
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)i.arrk("asie", arrd(int ), (int)209);
                }
lbl41:
                // 1 sources

                if (var2_4 || var2_4) continue block25;
                v4 /* !! */  = i.ck;
                if (true) ** GOTO lbl46
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - i.arrk("asif", arsb(int ), (int)95));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1293725223: {
                            v5 = i.arrk("asig", arsb(int ), (int)96);
                            continue block26;
                        }
                        case -1257477699: {
                            v5 = i.arrk("asih", arsb(int ), (int)97);
                            continue block26;
                        }
                        case 1587307393: {
                            v5 = i.arrk("asii", arsb(int ), (int)98);
                            continue block26;
                        }
                        case 1859290183: {
                            break block26;
                        }
                    }
                    break;
                }
                v6 = var1_1.toLowerCase();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("asij", arsb(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == i.arrk("asik", arrd(int ), (int)210)) break;
                    v7 /* !! */  = (long)i.arrk("asil", arrd(int ), (int)211);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = i.ck - i.arrk("asim", arsb(int ), (int)100)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == i.arrk("asin", arrd(int ), (int)212)) break;
                    v8 /* !! */  = (long)i.arrk("asio", arrd(int ), (int)213);
                }
                return v6.startsWith(this.prefix);
                case 0: {
                    do {
                        var3_3 /* !! */  = (int)i.arrk("asip", arrd(int ), (int)214);
                    } while (!var4_2);
                    throw null;
                }
lbl77:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)i.arrk("asiq", arrd(int ), (int)215);
                    if (!var4_2) break block25;
                    throw null;
                }
                case 2: {
                    var3_3 /* !! */  = (int)i.arrk("asir", arrd(int ), (int)216);
                    if (!var4_2) ** GOTO lbl77
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)i.arrk("asis", arrd(int ), (int)217);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public i prepend(String ... var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = i.ck - i.arrk("ascl", arsb(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == i.arrk("ascm", arrd(int ), (int)128)) break;
            v0 /* !! */  = (long)i.arrk("ascn", arrd(int ), (int)129);
        }
        var5_2 = i.c;
        v1 /* !! */  = i.ck;
        if (true) ** GOTO lbl11
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - i.arrk("asco", arsb(int ), (int)28));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1343388642: {
                    v2 = i.arrk("ascp", arsb(int ), (int)29);
                    continue block35;
                }
                case -479276101: {
                    v2 = i.arrk("ascq", arsb(int ), (int)30);
                    continue block35;
                }
                case 1859290183: {
                    break block35;
                }
            }
            break;
        }
        var4_3 /* !! */  = i.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("ascr", arsb(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == i.arrk("ascs", arrd(int ), (int)130)) break;
            v3 /* !! */  = (long)i.arrk("asct", arrd(int ), (int)131);
        }
        var3_4 = i.a;
        if (var5_2) {
            throw null;
lbl29:
            // 5 sources

            return null;
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = i.ck - i.arrk("ascu", arsb(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == i.arrk("ascv", arrd(int ), (int)132)) break;
            v4 /* !! */  = (long)i.arrk("ascw", arrd(int ), (int)133);
        }
        v5 /* !! */  = i.ck;
        if (true) ** GOTO lbl41
        block39: while (true) {
            v5 /* !! */  = (long)(i.arrk("ascy", arsb(int ), (int)34) - i.arrk("ascx", arsb(int ), (int)33));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 584549522: {
                    continue block39;
                }
                case 1859290183: {
                    break block39;
                }
            }
            break;
        }
        v6 = Arrays.asList(var1_1);
        v7 /* !! */  = i.ck;
        if (true) ** GOTO lbl51
        block40: while (true) {
            v7 /* !! */  = (long)(v8 - i.arrk("ascz", arsb(int ), (int)35));
lbl51:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 623272154: {
                    v8 = i.arrk("asda", arsb(int ), (int)36);
                    continue block40;
                }
                case 1524862205: {
                    v8 = i.arrk("asdb", arsb(int ), (int)37);
                    continue block40;
                }
                case 1580526773: {
                    v8 = i.arrk("asdc", arsb(int ), (int)38);
                    continue block40;
                }
                case 1859290183: {
                    break block40;
                }
            }
            break;
        }
        var2_5 = new ArrayList<String>(v6);
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = i.ck - i.arrk("asdd", arsb(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == i.arrk("asde", arrd(int ), (int)134)) break;
            v9 /* !! */  = (long)i.arrk("asdf", arrd(int ), (int)135);
        }
        v10 /* !! */  = i.ck;
        if (true) ** GOTO lbl74
        block42: while (true) {
            v10 /* !! */  = (long)(v11 - i.arrk("asdg", arsb(int ), (int)40));
lbl74:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1803465107: {
                    v11 = i.arrk("asdh", arsb(int ), (int)41);
                    continue block42;
                }
                case 727552456: {
                    v11 = i.arrk("asdi", arsb(int ), (int)42);
                    continue block42;
                }
                case 1859290183: {
                    break block42;
                }
            }
            break;
        }
        var2_5.addAll(this.completions);
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = i.ck - i.arrk("asdj", arsb(int ), (int)43)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == i.arrk("asdk", arrd(int ), (int)136)) break;
            v12 /* !! */  = (long)i.arrk("asdl", arrd(int ), (int)137);
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = i.ck - i.arrk("asdm", arsb(int ), (int)44)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == i.arrk("asdn", arrd(int ), (int)138)) break;
            v13 /* !! */  = (long)i.arrk("asdo", arrd(int ), (int)139);
        }
        this.completions.clear();
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = i.ck - i.arrk("asdp", arsb(int ), (int)45)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == i.arrk("asdq", arrd(int ), (int)140)) break;
            v14 /* !! */  = (long)i.arrk("asdr", arrd(int ), (int)141);
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_7 = i.ck - i.arrk("asds", arsb(int ), (int)46)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == i.arrk("asdt", arrd(int ), (int)142)) break;
            v15 /* !! */  = (long)i.arrk("asdu", arrd(int ), (int)143);
        }
        this.completions.addAll(var2_5);
        ** while (var3_4 || var3_4)
lbl110:
        // 1 sources

        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return this;
            }
lbl114:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)i.arrk("asdv", arrd(int ), (int)144);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var4_3 /* !! */  = (int)i.arrk("asdw", arrd(int ), (int)145);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: {
                var4_3 /* !! */  = (int)i.arrk("asdx", arrd(int ), (int)146);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl129:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)i.arrk("asdy", arrd(int ), (int)147);
                if (var5_2) {
                    throw null;
                }
            }
lbl133:
            // 6 sources

            case 4: {
                var4_3 /* !! */  = (int)i.arrk("asdz", arrd(int ), (int)148);
                if (!var5_2) ** GOTO lbl114
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)i.arrk("asea", arrd(int ), (int)149);
                if (!var5_2) break;
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)i.arrk("aseb", arrd(int ), (int)150);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl146:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)i.arrk("asec", arrd(int ), (int)151);
                if (!var5_2) ** GOTO lbl133
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)i.arrk("ased", arrd(int ), (int)152);
                if (!var5_2) ** GOTO lbl133
                throw null;
            }
lbl154:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)i.arrk("asee", arrd(int ), (int)153);
                    if (!var5_2) ** GOTO lbl146
                    throw null;
                }
            }
lbl159:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)i.arrk("asef", arrd(int ), (int)154);
                if (!var5_2) break;
                throw null;
            }
            case 11: 
        }
        var4_3 /* !! */  = (int)i.arrk("aseg", arrd(int ), (int)155);
        ** while (!var5_2)
lbl166:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public i addCommands(g var1_1) {
        block95: {
            var10_2 = i.c;
            var9_3 /* !! */  = i.b;
            var8_4 = i.a;
            if (var10_2) {
                throw null;
            }
            if (var8_4 != false) return null;
            if (var8_4 != false) return null;
            var2_5 = this.prefix.toLowerCase();
            if (var8_4 != false) return null;
            if (var8_4 != false) return null;
            var3_6 = var1_1.getCommands().iterator();
            if (var8_4 != false) return null;
            block45: while (true) {
                block96: {
                    if (var8_4 != false) return null;
                    if (var8_4 != false) return null;
                    if (!var3_6.hasNext()) ** GOTO lbl80
                    if (var8_4 != false) return null;
                    var4_7 = var3_6.next();
                    if (var8_4 != false) return null;
                    if (var8_4 != false) return null;
                    var5_8 = var4_7.getName();
                    if (var8_4 != false) return null;
                    if (var8_4 != false) return null;
                    if (!var2_5.isEmpty()) break block96;
                    if (var8_4 != false) return null;
                    if (var8_4 != false) return null;
                    this.completions.add(var5_8);
                    if (var8_4 != false) return null;
                    if (var10_2) {
                        throw null;
                    }
                    ** GOTO lbl76
                }
                if (var8_4 != false) return null;
                if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var9_3 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var8_4 != false) return null;
                            if (!var5_8.toLowerCase().startsWith(var2_5)) ** GOTO lbl50
                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            this.completions.add(var5_8);
                            if (var8_4 != false) return null;
                            if (var10_2) {
                                throw null;
                            }
                            ** GOTO lbl76
lbl50:
                            // 1 sources

                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            var6_9 = var4_7.getAliases().iterator();
                            if (var8_4 != false) return null;
                            do {
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                if (!var6_9.hasNext()) ** GOTO lbl76
                                if (var8_4 != false) return null;
                                var7_10 = var6_9.next();
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                if (!var7_10.toLowerCase().startsWith(var2_5)) ** GOTO lbl72
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                this.completions.add(var7_10);
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                if (var10_2) {
                                    throw null;
                                }
                                ** GOTO lbl76
lbl72:
                                // 1 sources

                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                            } while (!var10_2);
                            throw null;
lbl76:
                            // 4 sources

                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            if (!var10_2) continue block45;
                            throw null;
                        }
lbl80:
                        // 1 sources

                        if (var8_4 != false) return null;
                        if (var8_4 != false) return null;
                        return this;
                        case 1: {
                            var9_3 /* !! */  = (int)i.arrk("aruv", arrd(int ), (int)22);
                            cfr_temp_0 = 22;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 2: {
                            var9_3 /* !! */  = (int)i.arrk("arux", arrd(int ), (int)23);
                            cfr_temp_0 = 39;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 8: {
                            var9_3 /* !! */  = (int)i.arrk("arvm", arrd(int ), (int)29);
                            cfr_temp_0 = 17;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 9: {
                            var9_3 /* !! */  = (int)i.arrk("arvn", arrd(int ), (int)30);
                            cfr_temp_0 = 16;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 13: {
                            var9_3 /* !! */  = (int)i.arrk("arvs", arrd(int ), (int)34);
                            cfr_temp_0 = 14;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 16: {
                            var9_3 /* !! */  = (int)i.arrk("arwc", arrd(int ), (int)37);
                            if (var10_2) {
                                throw null;
                            }
                            ** GOTO lbl-1000
                        }
                        case 18: {
                            var9_3 /* !! */  = (int)i.arrk("arwe", arrd(int ), (int)39);
                            cfr_temp_0 = 38;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 22: {
                            var9_3 /* !! */  = (int)i.arrk("arwo", arrd(int ), (int)43);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 11: {
                            var9_3 /* !! */  = (int)i.arrk("arvq", arrd(int ), (int)32);
                            cfr_temp_0 = 0;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 23: {
                            var9_3 /* !! */  = (int)i.arrk("arwp", arrd(int ), (int)44);
                            cfr_temp_0 = 14;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 26: {
                            var9_3 /* !! */  = (int)i.arrk("arwt", arrd(int ), (int)47);
                            cfr_temp_0 = 25;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 28: {
                            ** GOTO lbl245
                        }
                        case 31: {
                            var9_3 /* !! */  = (int)i.arrk("arxg", arrd(int ), (int)52);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 15: {
                            var9_3 /* !! */  = (int)i.arrk("arwa", arrd(int ), (int)36);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 17: {
                            var9_3 /* !! */  = (int)i.arrk("arwd", arrd(int ), (int)38);
                            cfr_temp_0 = 3;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 32: {
                            var9_3 /* !! */  = (int)i.arrk("arxi", arrd(int ), (int)53);
                            cfr_temp_0 = 24;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 33: {
                            var9_3 /* !! */  = (int)i.arrk("arxl", arrd(int ), (int)54);
                            cfr_temp_0 = 12;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 34: {
                            var9_3 /* !! */  = (int)i.arrk("arxm", arrd(int ), (int)55);
                            cfr_temp_0 = 5;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 35: {
                            var9_3 /* !! */  = (int)i.arrk("arxn", arrd(int ), (int)56);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 20: {
                            var9_3 /* !! */  = (int)i.arrk("arwg", arrd(int ), (int)41);
                            cfr_temp_0 = 29;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 36: {
                            var9_3 /* !! */  = (int)i.arrk("arxo", arrd(int ), (int)57);
                            cfr_temp_0 = 39;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 38: {
                            var9_3 /* !! */  = (int)i.arrk("arxq", arrd(int ), (int)59);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 7: {
                            var9_3 /* !! */  = (int)i.arrk("arvf", arrd(int ), (int)28);
                            cfr_temp_0 = 12;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 40: {
                            var9_3 /* !! */  = (int)i.arrk("arxs", arrd(int ), (int)61);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 25: {
                            var9_3 /* !! */  = (int)i.arrk("arwr", arrd(int ), (int)46);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 5: {
                            var9_3 /* !! */  = (int)i.arrk("arvd", arrd(int ), (int)26);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 12: {
                            var9_3 /* !! */  = (int)i.arrk("arvr", arrd(int ), (int)33);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 3: {
                            var9_3 /* !! */  = (int)i.arrk("arvb", arrd(int ), (int)24);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 21: {
                            var9_3 /* !! */  = (int)i.arrk("arwi", arrd(int ), (int)42);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 4: {
                            do {
                                var9_3 /* !! */  = (int)i.arrk("arvc", arrd(int ), (int)25);
                            } while (!var10_2);
                            throw null;
                        }
                        case 41: {
                            var9_3 /* !! */  = (int)i.arrk("arxu", arrd(int ), (int)62);
                            cfr_temp_0 = 14;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 42: lbl-1000:
                        // 2 sources

                        {
                            var9_3 /* !! */  = (int)i.arrk("arxv", arrd(int ), (int)63);
                            if (var10_2) {
                                throw null;
                            }
lbl245:
                            // 3 sources

                            var9_3 /* !! */  = (int)i.arrk("arxb", arrd(int ), (int)49);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 29: {
                            do {
                                var9_3 /* !! */  = (int)i.arrk("arxd", arrd(int ), (int)50);
                            } while (!var10_2);
                            throw null;
                        }
                        case 0: {
                            var9_3 /* !! */  = (int)i.arrk("arur", arrd(int ), (int)21);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 39: {
                            var9_3 /* !! */  = (int)i.arrk("arxr", arrd(int ), (int)60);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 6: {
                            var9_3 /* !! */  = (int)i.arrk("arve", arrd(int ), (int)27);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 27: {
                            var9_3 /* !! */  = (int)i.arrk("arxa", arrd(int ), (int)48);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 24: {
                            var9_3 /* !! */  = (int)i.arrk("arwq", arrd(int ), (int)45);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 14: {
                            var9_3 /* !! */  = (int)i.arrk("arvt", arrd(int ), (int)35);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 30: {
                            var9_3 /* !! */  = (int)i.arrk("arxe", arrd(int ), (int)51);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 19: {
                            var9_3 /* !! */  = (int)i.arrk("arwf", arrd(int ), (int)40);
                            cfr_temp_0 = 0;
                            if (var10_2) {
                                throw null;
                            }
                            break block95;
                        }
                        case 10: {
                            var9_3 /* !! */  = (int)i.arrk("arvp", arrd(int ), (int)31);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 37: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl296
        }
        do {
            if (true) ** continue;
lbl296:
            // 2 sources

            var9_3 /* !! */  = (int)i.arrk("arxp", arrd(int ), (int)58);
            cfr_temp_0 = 10;
        } while (!var10_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> toList() {
        v0 /* !! */  = i.ck;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(i.arrk("asfu", arsb(int ), (int)59) - i.arrk("asft", arsb(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -570288590: {
                    continue block26;
                }
                case 1859290183: {
                    break block26;
                }
            }
            break;
        }
        var3_1 = i.c;
        v1 /* !! */  = i.ck;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - i.arrk("asfv", arsb(int ), (int)60));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1712706808: {
                    v2 = i.arrk("asfw", arsb(int ), (int)61);
                    continue block27;
                }
                case 1203806143: {
                    v2 = i.arrk("asfx", arsb(int ), (int)62);
                    continue block27;
                }
                case 1461388384: {
                    v2 = i.arrk("asfy", arsb(int ), (int)63);
                    continue block27;
                }
                case 1859290183: {
                    break block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = i.b;
        v3 /* !! */  = i.ck;
        if (true) ** GOTO lbl32
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - i.arrk("asfz", arsb(int ), (int)64));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1428262682: {
                    v4 = i.arrk("asga", arsb(int ), (int)65);
                    continue block28;
                }
                case -67352277: {
                    v4 = i.arrk("asgb", arsb(int ), (int)66);
                    continue block28;
                }
                case 911866681: {
                    v4 = i.arrk("asgc", arsb(int ), (int)67);
                    continue block28;
                }
                case 1859290183: {
                    break block28;
                }
            }
            break;
        }
        var1_3 = i.a;
        if (var3_1) {
            throw null;
lbl47:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl47
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = i.ck - i.arrk("asgd", arsb(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == i.arrk("asge", arrd(int ), (int)183)) break;
                    v5 /* !! */  = (long)i.arrk("asgf", arrd(int ), (int)184);
                }
                v6 = this.stream();
                v7 /* !! */  = i.ck;
                if (true) ** GOTO lbl64
                block31: while (true) {
                    v7 /* !! */  = (long)(i.arrk("asgh", arsb(int ), (int)70) - i.arrk("asgg", arsb(int ), (int)69));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 670588408: {
                            continue block31;
                        }
                        case 1859290183: {
                            break block31;
                        }
                    }
                    break;
                }
                return v6.toList();
            }
lbl70:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)i.arrk("asgi", arrd(int ), (int)185);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)i.arrk("asgj", arrd(int ), (int)186);
                    if (!var3_1) ** GOTO lbl70
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)i.arrk("asgk", arrd(int ), (int)187);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)i.arrk("asgl", arrd(int ), (int)188);
        ** while (!var3_1)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void asix() {
        i.arrj[100] = 1359636144;
        i.arrj[101] = 1592834147;
        i.arrj[102] = 277381976;
        i.arrj[103] = 609714599;
        i.arrj[104] = -828231188;
        i.arrj[105] = -1975975854;
        i.arrj[106] = 243948627;
        i.arrj[107] = 1727620049;
        i.arrj[108] = 670501571;
        i.arrj[109] = 896096667;
        i.arrj[110] = 7819193;
        i.arrj[111] = -1812255734;
        i.arrj[112] = 1294663953;
        i.arrj[113] = -1038377949;
        i.arrj[114] = 625991213;
        i.arrj[115] = -1107949199;
        i.arrj[116] = -455251025;
        i.arrj[117] = -656531051;
        i.arrj[118] = -1674923176;
        i.arrj[119] = -929024832;
        i.arrj[120] = 196847481;
        i.arrj[121] = 1222007185;
        i.arrj[122] = 1956619262;
        i.arrj[123] = 238850143;
        i.arrj[124] = 112090024;
        i.arrj[125] = 513142247;
        i.arrj[126] = 1255703152;
        i.arrj[127] = -1567600571;
        i.arrj[128] = -1433462640;
        i.arrj[129] = -2072352640;
        i.arrj[130] = -145216781;
        i.arrj[131] = 1153668286;
        i.arrj[132] = 1142423250;
        i.arrj[133] = 1330444425;
        i.arrj[134] = 1386611116;
        i.arrj[135] = -584733244;
        i.arrj[136] = 2012103941;
        i.arrj[137] = -814472473;
        i.arrj[138] = 103467364;
        i.arrj[139] = -460853700;
        i.arrj[140] = -824962426;
        i.arrj[141] = -209677464;
        i.arrj[142] = -271777231;
        i.arrj[143] = -780407973;
        i.arrj[144] = -51916245;
        i.arrj[145] = -1376423886;
        i.arrj[146] = 1909143774;
        i.arrj[147] = -2002757232;
        i.arrj[148] = -1326186485;
        i.arrj[149] = -2083564316;
        i.arrj[150] = -1638832008;
        i.arrj[151] = 515776896;
        i.arrj[152] = -295886515;
        i.arrj[153] = 1103567594;
        i.arrj[154] = -273313949;
        i.arrj[155] = 1085022043;
        i.arrj[156] = 1377918911;
        i.arrj[157] = 1995102197;
        i.arrj[158] = -157591827;
        i.arrj[159] = 1364464638;
        i.arrj[160] = 487278929;
        i.arrj[161] = 1363966582;
        i.arrj[162] = -1881137536;
        i.arrj[163] = 657967310;
        i.arrj[164] = 95751710;
        i.arrj[165] = -1935336348;
        i.arrj[166] = -1475781670;
        i.arrj[167] = 1693075497;
        i.arrj[168] = 1532740226;
        i.arrj[169] = 1366725598;
        i.arrj[170] = -2141853763;
        i.arrj[171] = -369180164;
        i.arrj[172] = 1450301774;
        i.arrj[173] = -396333823;
        i.arrj[174] = 1479772972;
        i.arrj[175] = -571049461;
        i.arrj[176] = -743969224;
        i.arrj[177] = 181153672;
        i.arrj[178] = -800390196;
        i.arrj[179] = -1903852493;
        i.arrj[180] = -2030519624;
        i.arrj[181] = 94967019;
        i.arrj[182] = -1244287075;
        i.arrj[183] = -899997672;
        i.arrj[184] = 1913332179;
        i.arrj[185] = 1835013835;
        i.arrj[186] = -2014903703;
        i.arrj[187] = 968574517;
        i.arrj[188] = -1587809590;
        i.arrj[189] = -1865443980;
        i.arrj[190] = -1403273270;
        i.arrj[191] = -1534234410;
        i.arrj[192] = 1573667549;
        i.arrj[193] = 634959937;
        i.arrj[194] = 1642214454;
        i.arrj[195] = 192165221;
        i.arrj[196] = -440841808;
        i.arrj[197] = 246069498;
        i.arrj[198] = -1340746099;
        i.arrj[199] = -795021967;
    }

    public static /* synthetic */ CallSite arrk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void asiv() {
        i.arrg[200] = -1394678643;
        i.arrg[201] = 1336509335;
        i.arrg[202] = 1021123417;
        i.arrg[203] = 1591931288;
        i.arrg[204] = -711938906;
        i.arrg[205] = 265026354;
        i.arrg[206] = -21129282;
        i.arrg[207] = -1491753380;
        i.arrg[208] = -1772160917;
        i.arrg[209] = 2046084181;
        i.arrg[210] = -2031959087;
        i.arrg[211] = -1269751948;
        i.arrg[212] = -464722726;
        i.arrg[213] = -1630536663;
        i.arrg[214] = 599795501;
        i.arrg[215] = -1522018459;
        i.arrg[216] = 1236392951;
        i.arrg[217] = 1822746246;
    }

    private static /* synthetic */ void asiu() {
        i.arrg[100] = 1359636159;
        i.arrg[101] = 1592834146;
        i.arrg[102] = 277381980;
        i.arrg[103] = 609714605;
        i.arrg[104] = -828231193;
        i.arrg[105] = -1975975862;
        i.arrg[106] = 243948614;
        i.arrg[107] = 1727620048;
        i.arrg[108] = 810028213;
        i.arrg[109] = 896096666;
        i.arrg[110] = -2134179033;
        i.arrg[111] = -1812255730;
        i.arrg[112] = 1294663954;
        i.arrg[113] = -1038377951;
        i.arrg[114] = 625991208;
        i.arrg[115] = -1107949198;
        i.arrg[116] = -455251025;
        i.arrg[117] = -656531052;
        i.arrg[118] = -798340910;
        i.arrg[119] = -929024831;
        i.arrg[120] = -196847482;
        i.arrg[121] = -769682452;
        i.arrg[122] = 1956619263;
        i.arrg[123] = 238850140;
        i.arrg[124] = 112090027;
        i.arrg[125] = 513142245;
        i.arrg[126] = 1255703156;
        i.arrg[127] = -1567600575;
        i.arrg[128] = 1433462639;
        i.arrg[129] = 1341794444;
        i.arrg[130] = 145216780;
        i.arrg[131] = -1907453617;
        i.arrg[132] = -1142423251;
        i.arrg[133] = -1160530120;
        i.arrg[134] = -1386611117;
        i.arrg[135] = -1473778654;
        i.arrg[136] = 2012103940;
        i.arrg[137] = -1997104430;
        i.arrg[138] = -103467365;
        i.arrg[139] = 1785357503;
        i.arrg[140] = 824962425;
        i.arrg[141] = -965857951;
        i.arrg[142] = -271777232;
        i.arrg[143] = 829760799;
        i.arrg[144] = -51916247;
        i.arrg[145] = -1376423888;
        i.arrg[146] = 1909143768;
        i.arrg[147] = -2002757228;
        i.arrg[148] = -1326186484;
        i.arrg[149] = -2083564316;
        i.arrg[150] = -1638832006;
        i.arrg[151] = 515776900;
        i.arrg[152] = -295886520;
        i.arrg[153] = 1103567596;
        i.arrg[154] = -273313945;
        i.arrg[155] = 1085022035;
        i.arrg[156] = -1377918912;
        i.arrg[157] = 407349996;
        i.arrg[158] = 157591826;
        i.arrg[159] = -430716895;
        i.arrg[160] = -487278930;
        i.arrg[161] = -1081379514;
        i.arrg[162] = 1881137535;
        i.arrg[163] = -1036727488;
        i.arrg[164] = -95751711;
        i.arrg[165] = 256952280;
        i.arrg[166] = 1475781669;
        i.arrg[167] = -2120058302;
        i.arrg[168] = -1532740227;
        i.arrg[169] = 832163811;
        i.arrg[170] = 2141853762;
        i.arrg[171] = -556936112;
        i.arrg[172] = 1450301766;
        i.arrg[173] = -396333819;
        i.arrg[174] = 1479772969;
        i.arrg[175] = -571049462;
        i.arrg[176] = -743969230;
        i.arrg[177] = 181153666;
        i.arrg[178] = -800390203;
        i.arrg[179] = -1903852495;
        i.arrg[180] = -2030519632;
        i.arrg[181] = 94967022;
        i.arrg[182] = -1244287074;
        i.arrg[183] = 899997671;
        i.arrg[184] = -797883799;
        i.arrg[185] = 1835013832;
        i.arrg[186] = -2014903701;
        i.arrg[187] = 968574518;
        i.arrg[188] = -1587809590;
        i.arrg[189] = 1865443979;
        i.arrg[190] = 712649469;
        i.arrg[191] = 1534234409;
        i.arrg[192] = 1199767380;
        i.arrg[193] = -634959938;
        i.arrg[194] = -1504862270;
        i.arrg[195] = 192165220;
        i.arrg[196] = -440841808;
        i.arrg[197] = 246069499;
        i.arrg[198] = -1340746098;
        i.arrg[199] = 795021966;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String[] toArray() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = i.ck - i.arrk("asgm", arsb(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == i.arrk("asgn", arrd(int ), (int)189)) break;
            v0 /* !! */  = (long)i.arrk("asgo", arrd(int ), (int)190);
        }
        var3_1 = i.c;
        v1 /* !! */  = i.ck;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - i.arrk("asgp", arsb(int ), (int)72));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -881390678: {
                    v2 = i.arrk("asgq", arsb(int ), (int)73);
                    continue block22;
                }
                case -239165091: {
                    v2 = i.arrk("asgr", arsb(int ), (int)74);
                    continue block22;
                }
                case 86249125: {
                    v2 = i.arrk("asgs", arsb(int ), (int)75);
                    continue block22;
                }
                case 1859290183: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = i.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("asgt", arsb(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == i.arrk("asgu", arrd(int ), (int)191)) break;
            v3 /* !! */  = (long)i.arrk("asgv", arrd(int ), (int)192);
        }
        var1_3 = i.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = i.ck;
                if (true) ** GOTO lbl44
                block25: while (true) {
                    v4 /* !! */  = (long)(i.arrk("asgx", arsb(int ), (int)78) - i.arrk("asgw", arsb(int ), (int)77));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 713237800: {
                            continue block25;
                        }
                        case 1859290183: {
                            break block25;
                        }
                    }
                    break;
                }
                v5 = this.stream();
                v6 /* !! */  = i.ck;
                if (true) ** GOTO lbl54
                block26: while (true) {
                    v6 /* !! */  = (long)(v7 - i.arrk("asgy", arsb(int ), (int)79));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 12791952: {
                            v7 = i.arrk("asgz", arsb(int ), (int)80);
                            continue block26;
                        }
                        case 895751859: {
                            v7 = i.arrk("asha", arsb(int ), (int)81);
                            continue block26;
                        }
                        case 1859290183: {
                            break block26;
                        }
                    }
                    break;
                }
                v8 = (IntFunction<String[]>)LambdaMetafactory.metafactory(null, null, null, (I)Ljava/lang/Object;, lambda$toArray$1(int ), (I)[Ljava/lang/String;)();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = i.ck - i.arrk("ashb", arsb(int ), (int)82)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == i.arrk("ashc", arrd(int ), (int)193)) break;
                    v9 /* !! */  = (long)i.arrk("ashd", arrd(int ), (int)194);
                }
                return (String[])v5.toArray(v8);
            }
            case 0: {
                var2_2 /* !! */  = (int)i.arrk("ashe", arrd(int ), (int)195);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 1: {
                var2_2 /* !! */  = (int)i.arrk("ashf", arrd(int ), (int)196);
                if (var3_1) {
                    throw null;
                }
            }
lbl80:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)i.arrk("ashg", arrd(int ), (int)197);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)i.arrk("ashh", arrd(int ), (int)198);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void asiz() {
        i.arsh[0] = 4154543907035919632L;
        i.arsh[1] = 1136459644982555372L;
        i.arsh[2] = -440801658142435052L;
        i.arsh[3] = -5707931028809375912L;
        i.arsh[4] = 8998128342064509216L;
        i.arsh[5] = -6636104339444209944L;
        i.arsh[6] = 6412060750707976667L;
        i.arsh[7] = 4596889352194397207L;
        i.arsh[8] = -6127046153295036977L;
        i.arsh[9] = -2485547927482252644L;
        i.arsh[10] = -8565520684366852590L;
        i.arsh[11] = -4461263721431999766L;
        i.arsh[12] = 6790638654087509294L;
        i.arsh[13] = 8481180520702159916L;
        i.arsh[14] = 442484222428787302L;
        i.arsh[15] = 3692511719963991394L;
        i.arsh[16] = 439339350653916089L;
        i.arsh[17] = -4562035936310718355L;
        i.arsh[18] = -6537904153609375747L;
        i.arsh[19] = 4906688888964708251L;
        i.arsh[20] = 8378085484581753794L;
        i.arsh[21] = 1878823110804822863L;
        i.arsh[22] = -2700560167926935272L;
        i.arsh[23] = 406620700107302634L;
        i.arsh[24] = 4280928340450506412L;
        i.arsh[25] = 6118785629515780053L;
        i.arsh[26] = 421043467310016819L;
        i.arsh[27] = 8691970021367603321L;
        i.arsh[28] = -1338830148110023066L;
        i.arsh[29] = -3139870456663079550L;
        i.arsh[30] = -2749653949952853782L;
        i.arsh[31] = 8086961015862956183L;
        i.arsh[32] = -2701179087831262292L;
        i.arsh[33] = 7696191314240412578L;
        i.arsh[34] = 5015680265977006584L;
        i.arsh[35] = -111499816313318849L;
        i.arsh[36] = 1015277860104474022L;
        i.arsh[37] = 8801256107727320853L;
        i.arsh[38] = 5271106031651197785L;
        i.arsh[39] = -4435849127755152013L;
        i.arsh[40] = 923582617458148082L;
        i.arsh[41] = -5090230880137991161L;
        i.arsh[42] = -7106974379367769436L;
        i.arsh[43] = -1663883053780573801L;
        i.arsh[44] = -2916841131637668160L;
        i.arsh[45] = -4359445268527909982L;
        i.arsh[46] = 1967858258207273361L;
        i.arsh[47] = 2701748460043990840L;
        i.arsh[48] = -7736206255522987225L;
        i.arsh[49] = -3895027734362011578L;
        i.arsh[50] = -5088408619450480090L;
        i.arsh[51] = -1508999701246544587L;
        i.arsh[52] = 4626777966666498439L;
        i.arsh[53] = -1375115076041635769L;
        i.arsh[54] = 4484054731486765800L;
        i.arsh[55] = -8659745200986638111L;
        i.arsh[56] = -4372346629900511425L;
        i.arsh[57] = 3382783416449144022L;
        i.arsh[58] = -7534957095837706087L;
        i.arsh[59] = -7360647343862645859L;
        i.arsh[60] = 7479141083903380746L;
        i.arsh[61] = 184530521661627369L;
        i.arsh[62] = -5639216463406574599L;
        i.arsh[63] = -3431147928144473260L;
        i.arsh[64] = -8147668676436969795L;
        i.arsh[65] = 4589959619422590408L;
        i.arsh[66] = -5611638233510674514L;
        i.arsh[67] = -1220858763675475839L;
        i.arsh[68] = 2759444192147395289L;
        i.arsh[69] = -1822907014188837167L;
        i.arsh[70] = -8140243773662822647L;
        i.arsh[71] = 1274491021537585051L;
        i.arsh[72] = 8165091711351374618L;
        i.arsh[73] = -5744287975050349111L;
        i.arsh[74] = -836571320456585235L;
        i.arsh[75] = -3810874734119494846L;
        i.arsh[76] = -2677096094498629938L;
        i.arsh[77] = 8078122159077350965L;
        i.arsh[78] = 6169430499135517683L;
        i.arsh[79] = -1790058789277609808L;
        i.arsh[80] = 6237319730793877752L;
        i.arsh[81] = -8204882736271130115L;
        i.arsh[82] = 901581996878193006L;
        i.arsh[83] = -4052610371254912641L;
        i.arsh[84] = -7983408769732075704L;
        i.arsh[85] = 6505363079915748671L;
        i.arsh[86] = 4126461318163747608L;
        i.arsh[87] = -6202222191647252499L;
        i.arsh[88] = 269275919694548315L;
        i.arsh[89] = -6034955047976901644L;
        i.arsh[90] = -8791362249892978024L;
        i.arsh[91] = -4139821201157051829L;
        i.arsh[92] = -2069108445429485257L;
        i.arsh[93] = -4436639156508917280L;
        i.arsh[94] = 6210332713742216649L;
        i.arsh[95] = -1279620370511561924L;
        i.arsh[96] = 1260465756351866779L;
        i.arsh[97] = 4396136677283443066L;
        i.arsh[98] = 1619618150831589076L;
        i.arsh[99] = 564620278700416028L;
    }

    static {
        arrg = new int[218];
        arrj = new int[218];
        i.asit();
        i.asiu();
        i.asiv();
        i.asiw();
        i.asix();
        i.asiy();
        arsh = new long[101];
        arsj = new long[101];
        i.asiz();
        i.arsh[100] = 602220398509879663L;
        i.asjb();
        i.arsj[100] = 7294757795132290544L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public i() {
        var2_1 /* !! */  = i.b;
        super();
        this.prefix = "";
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.sorted = i.arrk("arrl", arrd(int ), (int)0);
                this.completions = new ArrayList<String>();
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)i.arrk("arrm", arrd(int ), (int)1);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)i.arrk("arru", arrd(int ), (int)2);
                    break block0;
                    break;
                }
            }
lbl18:
            // 2 sources

            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)i.arrk("arrv", arrd(int ), (int)3);
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)i.arrk("arrw", arrd(int ), (int)4);
                ** GOTO lbl18
            }
            case 4: {
                var2_1 /* !! */  = (int)i.arrk("arrx", arrd(int ), (int)5);
                ** GOTO lbl10
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)i.arrk("arry", arrd(int ), (int)6);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public i sortAlphabetically() {
        v0 /* !! */  = i.ck;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - i.arrk("asbs", arsb(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1932054442: {
                    v1 = i.arrk("asbt", arsb(int ), (int)20);
                    continue block18;
                }
                case -779881320: {
                    v1 = i.arrk("asbu", arsb(int ), (int)21);
                    continue block18;
                }
                case 1859290183: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = i.c;
        while (true) {
            block35: {
                if ((v2 /* !! */  = (cfr_temp_1 = i.ck - i.arrk("asbv", arsb(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != i.arrk("asbw", arrd(int ), (int)117)) break block35;
                var2_2 /* !! */  = i.b;
                v3 /* !! */  = i.ck;
                if (true) ** GOTO lbl27
            }
            v2 /* !! */  = (long)i.arrk("asbx", arrd(int ), (int)118);
        }
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - i.arrk("asby", arsb(int ), (int)23));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1839260125: {
                    v4 = i.arrk("asbz", arsb(int ), (int)24);
                    continue block20;
                }
                case -1734259962: {
                    v4 = i.arrk("asca", arsb(int ), (int)25);
                    continue block20;
                }
                case 1859290183: {
                    break block20;
                }
            }
            break;
        }
        var1_3 = i.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3) return null;
                    v5 = i.arrk("ascb", arrd(int ), (int)119);
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_2 = i.ck - i.arrk("ascc", arsb(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v6 /* !! */  == i.arrk("ascd", arrd(int ), (int)120)) {
                            this.sorted = v5;
                            if (var1_3) return null;
                            break;
                        }
                        v6 /* !! */  = (long)i.arrk("asce", arrd(int ), (int)121);
                    }
                    if (!var1_3) return this;
                    return null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)i.arrk("ascg", arrd(int ), (int)123);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: {
                    var2_2 /* !! */  = (int)i.arrk("ascf", arrd(int ), (int)122);
                    cfr_temp_0 = 4;
                    if (!var3_1) continue block21;
                    throw null;
                }
                case 2: {
                    ** GOTO lbl78
                }
                case 4: {
                    var2_2 /* !! */  = (int)i.arrk("ascj", arrd(int ), (int)126);
                    cfr_temp_0 = 3;
                    if (!var3_1) continue block21;
                    throw null;
                }
                case 5: {
                    var2_2 /* !! */  = (int)i.arrk("asck", arrd(int ), (int)127);
                    if (var3_1) {
                        throw null;
                    }
lbl78:
                    // 3 sources

                    var2_2 /* !! */  = (int)i.arrk("asch", arrd(int ), (int)124);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 3: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)i.arrk("asci", arrd(int ), (int)125);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int arrd(int n2) {
        return arrg[n2] ^ arrj[n2];
    }
}

