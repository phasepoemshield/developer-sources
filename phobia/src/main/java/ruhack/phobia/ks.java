/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.class_2960
 */
package ruhack.phobia;

import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_2960;
import ruhack.phobia.ku;

public class ks {
    private GpuTexture texture;
    static private int[] gzti = new int[394];
    static private long[] gztu;
    static public final int b;
    private boolean loaded;
    private float ascender;
    private GpuTextureView textureView;
    private float descender;
    private float pxRange;
    static private long[] gztt;
    private final Map<Integer, ku> glyphs;
    private final String name;
    private int atlasHeight;
    static final long nw = 5454150409226236923L;
    private int atlasWidth;
    static public final boolean c;
    private float emSize;
    static private int[] gztj;
    private float lineHeight;
    static public final boolean a;

    private static float hatl(int n2) {
        return Float.intBitsToFloat(gzti[n2] ^ gztj[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getLineHeight() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("hatb", gzts(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ks.gztk("hatc", gzth(int ), (int)243)) break;
            v0 /* !! */  = (long)ks.gztk("hatd", gzth(int ), (int)244);
        }
        var3_1 = ks.c;
        v1 /* !! */  = ks.nw;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - ks.gztk("hate", gzts(int ), (int)53));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -824559964: {
                    v2 = ks.gztk("hatf", gzts(int ), (int)54);
                    continue block18;
                }
                case 472155925: {
                    v2 = ks.gztk("hatg", gzts(int ), (int)55);
                    continue block18;
                }
                case 749474374: {
                    v2 = ks.gztk("hath", gzts(int ), (int)56);
                    continue block18;
                }
                case 1568355323: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ks.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("hati", gzts(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ks.gztk("hatj", gzth(int ), (int)245)) break;
                    v3 /* !! */  = (long)ks.gztk("hatk", gzth(int ), (int)246);
                }
                var1_3 = ks.a;
                if (var3_1) {
                    throw null;
                    return (float)ks.gztk("hatm", hatl(int ), (int)247);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ks.nw;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ks.gztk("hatn", gzts(int ), (int)58));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -569491577: {
                            v5 = ks.gztk("hato", gzts(int ), (int)59);
                            continue block21;
                        }
                        case 40207764: {
                            v5 = ks.gztk("hatp", gzts(int ), (int)60);
                            continue block21;
                        }
                        case 1568355323: {
                            break block21;
                        }
                    }
                    break;
                }
                return this.lineHeight;
            }
lbl54:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ks.gztk("hatq", gzth(int ), (int)248);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ks.gztk("hatr", gzth(int ), (int)249);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ks.gztk("hats", gzth(int ), (int)250);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ks.gztk("hatt", gzth(int ), (int)251);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void shutdown() {
        block51: {
            block50: {
                v0 /* !! */  = ks.nw;
                if (true) ** GOTO lbl5
                block34: while (true) {
                    v0 /* !! */  = (long)(v1 - ks.gztk("hazt", gzts(int ), (int)121));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1463419790: {
                            v1 = ks.gztk("hazu", gzts(int ), (int)122);
                            continue block34;
                        }
                        case -35754988: {
                            v1 = ks.gztk("hazv", gzts(int ), (int)123);
                            continue block34;
                        }
                        case 1568355323: {
                            break block34;
                        }
                    }
                    break;
                }
                var3_1 = ks.c;
                v2 /* !! */  = ks.nw;
                if (true) ** GOTO lbl19
                block35: while (true) {
                    v2 /* !! */  = (long)(ks.gztk("hazx", gzts(int ), (int)125) - ks.gztk("hazw", gzts(int ), (int)124));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -672850478: {
                            continue block35;
                        }
                        case 1568355323: {
                            break block35;
                        }
                    }
                    break;
                }
                var2_2 = ks.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("hazy", gzts(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ks.gztk("hazz", gzth(int ), (int)347)) break;
                    v3 /* !! */  = (long)ks.gztk("hbaa", gzth(int ), (int)348);
                }
                var1_3 = ks.a;
                if (var3_1) {
                    throw null;
lbl33:
                    // 11 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl33
                v4 /* !! */  = ks.nw;
                if (true) ** GOTO lbl40
                block38: while (true) {
                    v4 /* !! */  = (long)(ks.gztk("hbac", gzts(int ), (int)128) - ks.gztk("hbab", gzts(int ), (int)127));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1156404502: {
                            continue block38;
                        }
                        case 1568355323: {
                            break block38;
                        }
                    }
                    break;
                }
                if (this.textureView == null) break block50;
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("hbad", gzts(int ), (int)129)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ks.gztk("hbae", gzth(int ), (int)349)) break;
                    v5 /* !! */  = (long)ks.gztk("hbaf", gzth(int ), (int)350);
                }
                v6 /* !! */  = ks.nw;
                if (true) ** GOTO lbl56
                block40: while (true) {
                    v6 /* !! */  = (long)(ks.gztk("hbah", gzts(int ), (int)131) - ks.gztk("hbag", gzts(int ), (int)130));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1210619822: {
                            continue block40;
                        }
                        case 1568355323: {
                            break block40;
                        }
                    }
                    break;
                }
                this.textureView.close();
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("hbai", gzts(int ), (int)132)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ks.gztk("hbaj", gzth(int ), (int)351)) break;
                    v7 /* !! */  = (long)ks.gztk("hbak", gzth(int ), (int)352);
                }
                this.textureView = null;
                if (var1_3) ** GOTO lbl33
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = ks.nw - ks.gztk("hbal", gzts(int ), (int)133)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ks.gztk("hbam", gzth(int ), (int)353)) break;
                v8 /* !! */  = (long)ks.gztk("hban", gzth(int ), (int)354);
            }
            if (this.texture == null) break block51;
            if (var1_3 || var1_3) ** GOTO lbl33
            v9 /* !! */  = ks.nw;
            if (true) ** GOTO lbl83
            block43: while (true) {
                v9 /* !! */  = (long)(v10 - ks.gztk("hbao", gzts(int ), (int)134));
lbl83:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1888449013: {
                        v10 = ks.gztk("hbap", gzts(int ), (int)135);
                        continue block43;
                    }
                    case -1502846267: {
                        v10 = ks.gztk("hbaq", gzts(int ), (int)136);
                        continue block43;
                    }
                    case 1568355323: {
                        break block43;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = ks.nw - ks.gztk("hbar", gzts(int ), (int)137)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ks.gztk("hbas", gzth(int ), (int)355)) break;
                v11 /* !! */  = (long)ks.gztk("hbat", gzth(int ), (int)356);
            }
            this.texture.close();
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_5 = ks.nw - ks.gztk("hbau", gzts(int ), (int)138)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ks.gztk("hbav", gzth(int ), (int)357)) break;
                v12 /* !! */  = (long)ks.gztk("hbaw", gzth(int ), (int)358);
            }
            this.texture = null;
            if (var1_3) ** GOTO lbl33
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_6 = ks.nw - ks.gztk("hbax", gzts(int ), (int)139)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ks.gztk("hbay", gzth(int ), (int)359)) break;
            v13 /* !! */  = (long)ks.gztk("hbaz", gzth(int ), (int)360);
        }
        v14 /* !! */  = ks.nw;
        if (true) ** GOTO lbl117
        block47: while (true) {
            v14 /* !! */  = (long)(v15 - ks.gztk("hbba", gzts(int ), (int)140));
lbl117:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -944537892: {
                    v15 = ks.gztk("hbbb", gzts(int ), (int)141);
                    continue block47;
                }
                case 132010710: {
                    v15 = ks.gztk("hbbc", gzts(int ), (int)142);
                    continue block47;
                }
                case 1403338131: {
                    v15 = ks.gztk("hbbd", gzts(int ), (int)143);
                    continue block47;
                }
                case 1568355323: {
                    break block47;
                }
            }
            break;
        }
        this.glyphs.clear();
        if (var1_3 || var1_3) ** GOTO lbl33
        v16 = ks.gztk("hbbe", gzth(int ), (int)361);
        v17 /* !! */  = ks.nw;
        if (true) ** GOTO lbl136
        block48: while (true) {
            v17 /* !! */  = (long)(v18 - ks.gztk("hbbf", gzts(int ), (int)144));
lbl136:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1026237213: {
                    v18 = ks.gztk("hbbg", gzts(int ), (int)145);
                    continue block48;
                }
                case 1242459514: {
                    v18 = ks.gztk("hbbh", gzts(int ), (int)146);
                    continue block48;
                }
                case 1568355323: {
                    break block48;
                }
                case 1749820743: {
                    v18 = ks.gztk("hbbi", gzts(int ), (int)147);
                    continue block48;
                }
            }
            break;
        }
        this.loaded = v16;
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
    }

    private static void hbdi() {
        ks.gztu[0] = 4458401494034240037L;
        ks.gztu[1] = 7571954300628859729L;
        ks.gztu[2] = -6619260363577837531L;
        ks.gztu[3] = 1495945349576664374L;
        ks.gztu[4] = -1659658717961426090L;
        ks.gztu[5] = -5498708501314262975L;
        ks.gztu[6] = -4340363855846685118L;
        ks.gztu[7] = 1649823946879467612L;
        ks.gztu[8] = 191937651869636440L;
        ks.gztu[9] = -6253923911305614277L;
        ks.gztu[10] = 2493904426088637220L;
        ks.gztu[11] = 3642617965410778341L;
        ks.gztu[12] = -423204421299359019L;
        ks.gztu[13] = -6225998217457983574L;
        ks.gztu[14] = -6531535220172235985L;
        ks.gztu[15] = 1434895257913951086L;
        ks.gztu[16] = 8903260886216895381L;
        ks.gztu[17] = 2758610757874480992L;
        ks.gztu[18] = 2340172030182300071L;
        ks.gztu[19] = -8580048956595483253L;
        ks.gztu[20] = -958665855100175204L;
        ks.gztu[21] = -5376615070421937691L;
        ks.gztu[22] = 3374691074452328315L;
        ks.gztu[23] = -51596141257683017L;
        ks.gztu[24] = 71061745610826943L;
        ks.gztu[25] = 8066174669561248L;
        ks.gztu[26] = -4186471516537662948L;
        ks.gztu[27] = 4382229288113345474L;
        ks.gztu[28] = 3916061311710809602L;
        ks.gztu[29] = 9103135149297576009L;
        ks.gztu[30] = 3175823240663958839L;
        ks.gztu[31] = 6967292745115361708L;
        ks.gztu[32] = 7894754925966407589L;
        ks.gztu[33] = 2253662218731887039L;
        ks.gztu[34] = 5609224131749115100L;
        ks.gztu[35] = 7435096286568319921L;
        ks.gztu[36] = -8539088103398634360L;
        ks.gztu[37] = 898906590056915842L;
        ks.gztu[38] = 2050008804064132590L;
        ks.gztu[39] = -261838265108244682L;
        ks.gztu[40] = -3780301090196790488L;
        ks.gztu[41] = -7582273775441769506L;
        ks.gztu[42] = -4989519323895948475L;
        ks.gztu[43] = -6987223721615403333L;
        ks.gztu[44] = 4211697938684742292L;
        ks.gztu[45] = 5063502372757904820L;
        ks.gztu[46] = -5818221674305329885L;
        ks.gztu[47] = -3909221363141640462L;
        ks.gztu[48] = 1823112816889773388L;
        ks.gztu[49] = 657866908602380261L;
        ks.gztu[50] = 356152327845841570L;
        ks.gztu[51] = -5341396360922011785L;
        ks.gztu[52] = -6256834085712861136L;
        ks.gztu[53] = 6320960954649262552L;
        ks.gztu[54] = 2162519807031281399L;
        ks.gztu[55] = -8338101446285816376L;
        ks.gztu[56] = -8937942340426964434L;
        ks.gztu[57] = 6950800381258289007L;
        ks.gztu[58] = -2333719565377472470L;
        ks.gztu[59] = 7233038577616437319L;
        ks.gztu[60] = 1462634397137921747L;
        ks.gztu[61] = -251134036517601912L;
        ks.gztu[62] = 8053965065217301843L;
        ks.gztu[63] = 1134982741697808702L;
        ks.gztu[64] = 5574015286341175671L;
        ks.gztu[65] = -7635312082481647197L;
        ks.gztu[66] = 2385990701781032932L;
        ks.gztu[67] = 4247004490265867458L;
        ks.gztu[68] = -6999887082749539356L;
        ks.gztu[69] = 2354986349534371707L;
        ks.gztu[70] = 7986380817564010007L;
        ks.gztu[71] = 1024085718594678448L;
        ks.gztu[72] = 713614290165220750L;
        ks.gztu[73] = 4561846289781327695L;
        ks.gztu[74] = -986887078974245067L;
        ks.gztu[75] = -6507062732950294511L;
        ks.gztu[76] = 739052939161860413L;
        ks.gztu[77] = -2879995264297713489L;
        ks.gztu[78] = 7066702084750918645L;
        ks.gztu[79] = -7006034012121291754L;
        ks.gztu[80] = -8498407248697825934L;
        ks.gztu[81] = -2877308098997933677L;
        ks.gztu[82] = -5093578922804998882L;
        ks.gztu[83] = 8299107726182853081L;
        ks.gztu[84] = 5405287419708929869L;
        ks.gztu[85] = 3104380764987546964L;
        ks.gztu[86] = 1701861206821024282L;
        ks.gztu[87] = 1638236601746228722L;
        ks.gztu[88] = -6577104342599379051L;
        ks.gztu[89] = -1053635872184478804L;
        ks.gztu[90] = -433176573387045036L;
        ks.gztu[91] = -8863881132450065481L;
        ks.gztu[92] = 2458177261063522480L;
        ks.gztu[93] = -7669977711608826934L;
        ks.gztu[94] = -4931779315444607773L;
        ks.gztu[95] = 2115450530277154679L;
        ks.gztu[96] = 5164178771269710997L;
        ks.gztu[97] = -1600462010725029520L;
        ks.gztu[98] = 8153308096620043919L;
        ks.gztu[99] = 3753306210388735661L;
    }

    private static void hbdb() {
        ks.gzti[300] = -90662721;
        ks.gzti[301] = 550304905;
        ks.gzti[302] = 1536061471;
        ks.gzti[303] = 1801727248;
        ks.gzti[304] = 882933189;
        ks.gzti[305] = -1380116248;
        ks.gzti[306] = -1913505498;
        ks.gzti[307] = 134317724;
        ks.gzti[308] = -2146685016;
        ks.gzti[309] = 2013219380;
        ks.gzti[310] = -237571921;
        ks.gzti[311] = -1475262411;
        ks.gzti[312] = 1928024511;
        ks.gzti[313] = -1221313685;
        ks.gzti[314] = 182537125;
        ks.gzti[315] = 946237773;
        ks.gzti[316] = 1724807284;
        ks.gzti[317] = 680128270;
        ks.gzti[318] = 1300032792;
        ks.gzti[319] = -435490328;
        ks.gzti[320] = 1911342707;
        ks.gzti[321] = -1038928138;
        ks.gzti[322] = -164849830;
        ks.gzti[323] = -1670190762;
        ks.gzti[324] = -386076658;
        ks.gzti[325] = -142842814;
        ks.gzti[326] = 1861735818;
        ks.gzti[327] = 931303782;
        ks.gzti[328] = -1442546326;
        ks.gzti[329] = 856521334;
        ks.gzti[330] = -1960294440;
        ks.gzti[331] = 1942605295;
        ks.gzti[332] = 497641033;
        ks.gzti[333] = -1670702338;
        ks.gzti[334] = -2033224847;
        ks.gzti[335] = 1229216188;
        ks.gzti[336] = 1319065706;
        ks.gzti[337] = 1863184246;
        ks.gzti[338] = 327748820;
        ks.gzti[339] = 1115400002;
        ks.gzti[340] = 1673237238;
        ks.gzti[341] = -1391020956;
        ks.gzti[342] = -19209585;
        ks.gzti[343] = 314163882;
        ks.gzti[344] = 253041343;
        ks.gzti[345] = 1954019401;
        ks.gzti[346] = -1208640581;
        ks.gzti[347] = 1471467843;
        ks.gzti[348] = 369589569;
        ks.gzti[349] = 1405454614;
        ks.gzti[350] = 1075291114;
        ks.gzti[351] = 1200688749;
        ks.gzti[352] = -1952552005;
        ks.gzti[353] = 47255435;
        ks.gzti[354] = -1088628946;
        ks.gzti[355] = -882282494;
        ks.gzti[356] = -1826824533;
        ks.gzti[357] = -2030925752;
        ks.gzti[358] = 920281310;
        ks.gzti[359] = 2044262095;
        ks.gzti[360] = 2026597432;
        ks.gzti[361] = -1563327287;
        ks.gzti[362] = -119055365;
        ks.gzti[363] = 821975129;
        ks.gzti[364] = 1007111058;
        ks.gzti[365] = 888914752;
        ks.gzti[366] = 836052453;
        ks.gzti[367] = -2032192726;
        ks.gzti[368] = 1373082379;
        ks.gzti[369] = 793689019;
        ks.gzti[370] = -220909658;
        ks.gzti[371] = 1910879693;
        ks.gzti[372] = 166171361;
        ks.gzti[373] = 1429963100;
        ks.gzti[374] = 294497974;
        ks.gzti[375] = -2141341969;
        ks.gzti[376] = -555579288;
        ks.gzti[377] = -497894703;
        ks.gzti[378] = 387147222;
        ks.gzti[379] = -1521771080;
        ks.gzti[380] = 1413941647;
        ks.gzti[381] = -1760305351;
        ks.gzti[382] = -799389213;
        ks.gzti[383] = 1931649882;
        ks.gzti[384] = 321587023;
        ks.gzti[385] = 480403630;
        ks.gzti[386] = 431858885;
        ks.gzti[387] = 426085326;
        ks.gzti[388] = -1039289841;
        ks.gzti[389] = -1563763135;
        ks.gzti[390] = 1205898804;
        ks.gzti[391] = -1519173219;
        ks.gzti[392] = -336289186;
        ks.gzti[393] = -524190679;
    }

    private static void hbdc() {
        ks.gztj[0] = -2033112435;
        ks.gztj[1] = 287236632;
        ks.gztj[2] = -1840021092;
        ks.gztj[3] = -1053327984;
        ks.gztj[4] = -789031870;
        ks.gztj[5] = -19671437;
        ks.gztj[6] = -1068500954;
        ks.gztj[7] = 2085970657;
        ks.gztj[8] = -1491889446;
        ks.gztj[9] = -1511351554;
        ks.gztj[10] = -2020593320;
        ks.gztj[11] = 1831928468;
        ks.gztj[12] = 2130296397;
        ks.gztj[13] = -1715909097;
        ks.gztj[14] = -295804314;
        ks.gztj[15] = -1482719253;
        ks.gztj[16] = -572195964;
        ks.gztj[17] = 145857077;
        ks.gztj[18] = -255726307;
        ks.gztj[19] = 2142103798;
        ks.gztj[20] = -383219212;
        ks.gztj[21] = -1950263528;
        ks.gztj[22] = 1780081013;
        ks.gztj[23] = -1989079070;
        ks.gztj[24] = 785565675;
        ks.gztj[25] = 1342287843;
        ks.gztj[26] = 995278229;
        ks.gztj[27] = 758642493;
        ks.gztj[28] = 501462994;
        ks.gztj[29] = -678557928;
        ks.gztj[30] = -540358995;
        ks.gztj[31] = 1146420997;
        ks.gztj[32] = 1516448762;
        ks.gztj[33] = 1126037784;
        ks.gztj[34] = -136327357;
        ks.gztj[35] = -1205446869;
        ks.gztj[36] = -1093186618;
        ks.gztj[37] = 134488639;
        ks.gztj[38] = 986537077;
        ks.gztj[39] = 934224756;
        ks.gztj[40] = 1463049556;
        ks.gztj[41] = -1926139871;
        ks.gztj[42] = 577035950;
        ks.gztj[43] = 635838221;
        ks.gztj[44] = 1746218481;
        ks.gztj[45] = -821964049;
        ks.gztj[46] = -792391366;
        ks.gztj[47] = -1659353464;
        ks.gztj[48] = -1205006897;
        ks.gztj[49] = 785916190;
        ks.gztj[50] = -1754317028;
        ks.gztj[51] = 1513987620;
        ks.gztj[52] = -1406053643;
        ks.gztj[53] = 1914835273;
        ks.gztj[54] = 883654943;
        ks.gztj[55] = -2099406767;
        ks.gztj[56] = -1226598538;
        ks.gztj[57] = 445083222;
        ks.gztj[58] = 296372522;
        ks.gztj[59] = -2047549326;
        ks.gztj[60] = 1942300389;
        ks.gztj[61] = 2006313432;
        ks.gztj[62] = -740110632;
        ks.gztj[63] = 1193709028;
        ks.gztj[64] = -1097904377;
        ks.gztj[65] = 997011636;
        ks.gztj[66] = -2079116984;
        ks.gztj[67] = -543227074;
        ks.gztj[68] = 1930659786;
        ks.gztj[69] = -33217018;
        ks.gztj[70] = -1908383183;
        ks.gztj[71] = -1716584998;
        ks.gztj[72] = -1545492874;
        ks.gztj[73] = 534931525;
        ks.gztj[74] = 1835085368;
        ks.gztj[75] = 931764628;
        ks.gztj[76] = -515796958;
        ks.gztj[77] = 1940620452;
        ks.gztj[78] = 71366277;
        ks.gztj[79] = -352826159;
        ks.gztj[80] = 821108584;
        ks.gztj[81] = 810777787;
        ks.gztj[82] = 1490808723;
        ks.gztj[83] = -1081859902;
        ks.gztj[84] = 552481116;
        ks.gztj[85] = 28607078;
        ks.gztj[86] = -1723860665;
        ks.gztj[87] = 985901546;
        ks.gztj[88] = -1482682951;
        ks.gztj[89] = -708833811;
        ks.gztj[90] = 1310352452;
        ks.gztj[91] = 57771229;
        ks.gztj[92] = 2033360477;
        ks.gztj[93] = -552095132;
        ks.gztj[94] = 1221343357;
        ks.gztj[95] = -538485943;
        ks.gztj[96] = 2697719;
        ks.gztj[97] = 1966363733;
        ks.gztj[98] = -429666038;
        ks.gztj[99] = -69880518;
    }

    private static void hbdg() {
        ks.gztt[0] = -4494642980522070995L;
        ks.gztt[1] = -1640730643369763557L;
        ks.gztt[2] = 7335226066931134532L;
        ks.gztt[3] = 2713992867020480642L;
        ks.gztt[4] = 5960643157404360677L;
        ks.gztt[5] = 1290715269751368980L;
        ks.gztt[6] = -5942060375533161701L;
        ks.gztt[7] = 7536394592830849167L;
        ks.gztt[8] = -1895440679460997532L;
        ks.gztt[9] = 4714481372032133949L;
        ks.gztt[10] = -1689221403115983360L;
        ks.gztt[11] = 7165006027614121267L;
        ks.gztt[12] = -483173008818721360L;
        ks.gztt[13] = -1303090564896755476L;
        ks.gztt[14] = 7471477075030622050L;
        ks.gztt[15] = 7242956971488392331L;
        ks.gztt[16] = 5677805539645798356L;
        ks.gztt[17] = -1259046637539080220L;
        ks.gztt[18] = -1577266916066810341L;
        ks.gztt[19] = 5500644377149887281L;
        ks.gztt[20] = 4939447796271562903L;
        ks.gztt[21] = -3010577345349822656L;
        ks.gztt[22] = -674342693260935382L;
        ks.gztt[23] = 7550718781605236115L;
        ks.gztt[24] = 8254699380310006476L;
        ks.gztt[25] = 6642610776443213307L;
        ks.gztt[26] = 7054518639421766017L;
        ks.gztt[27] = -7980259983511717543L;
        ks.gztt[28] = -6234540990994502613L;
        ks.gztt[29] = -9013052963855358543L;
        ks.gztt[30] = -4802240918698875960L;
        ks.gztt[31] = -7123936174489642224L;
        ks.gztt[32] = -6084151498413343290L;
        ks.gztt[33] = -2436108515882969028L;
        ks.gztt[34] = -6606015333622425653L;
        ks.gztt[35] = -3456866433608526966L;
        ks.gztt[36] = -7947360005645184592L;
        ks.gztt[37] = -7295173635942671942L;
        ks.gztt[38] = 5778633323256231067L;
        ks.gztt[39] = 6637669403475433057L;
        ks.gztt[40] = 2564019959432954636L;
        ks.gztt[41] = -3443438666428773411L;
        ks.gztt[42] = -1394763884024132284L;
        ks.gztt[43] = -2687799884382135985L;
        ks.gztt[44] = -2564827859992591575L;
        ks.gztt[45] = 7564482466208669523L;
        ks.gztt[46] = 6322292778091270695L;
        ks.gztt[47] = 3704955855056461596L;
        ks.gztt[48] = -1992239935427052216L;
        ks.gztt[49] = 1919173352643290485L;
        ks.gztt[50] = -2148369076058296618L;
        ks.gztt[51] = 5991291312488811810L;
        ks.gztt[52] = 6826035827644725802L;
        ks.gztt[53] = 7638619238036862273L;
        ks.gztt[54] = -5814321904833560293L;
        ks.gztt[55] = 2055359737275250943L;
        ks.gztt[56] = 1404113334420603553L;
        ks.gztt[57] = 2504723506710370747L;
        ks.gztt[58] = 7219596315402936073L;
        ks.gztt[59] = -2456320112292666896L;
        ks.gztt[60] = 4707976639460154687L;
        ks.gztt[61] = 8791869613651122060L;
        ks.gztt[62] = 4500661440017077200L;
        ks.gztt[63] = 8017793130443033655L;
        ks.gztt[64] = -9121628315287838494L;
        ks.gztt[65] = -7135642109100332544L;
        ks.gztt[66] = -5284526448334915260L;
        ks.gztt[67] = 2550376391715708300L;
        ks.gztt[68] = 4983899886571473997L;
        ks.gztt[69] = 2246384716098219278L;
        ks.gztt[70] = 3024340904029601313L;
        ks.gztt[71] = 834809966496649392L;
        ks.gztt[72] = -6960389414248912544L;
        ks.gztt[73] = 7114447398699061059L;
        ks.gztt[74] = 5365922826903686951L;
        ks.gztt[75] = 1717862388364836786L;
        ks.gztt[76] = 4757844600211380189L;
        ks.gztt[77] = -1098812824367029964L;
        ks.gztt[78] = -1079204605014327497L;
        ks.gztt[79] = 8231529679243586025L;
        ks.gztt[80] = 4730430624645634373L;
        ks.gztt[81] = 8560721928793084272L;
        ks.gztt[82] = 3041541483092981237L;
        ks.gztt[83] = 228183010175482242L;
        ks.gztt[84] = 7848196099665714216L;
        ks.gztt[85] = 4400759790499538548L;
        ks.gztt[86] = 68475226250544008L;
        ks.gztt[87] = 6978020595219865282L;
        ks.gztt[88] = -6897117236443090937L;
        ks.gztt[89] = 8224778823356469118L;
        ks.gztt[90] = -2519398850680526821L;
        ks.gztt[91] = -2631116999250189137L;
        ks.gztt[92] = 2787407819021781334L;
        ks.gztt[93] = 4163277213560714714L;
        ks.gztt[94] = 211853478625911535L;
        ks.gztt[95] = 1414171493291401222L;
        ks.gztt[96] = -5553818308378118641L;
        ks.gztt[97] = 5517109125209545969L;
        ks.gztt[98] = 514558436895560958L;
        ks.gztt[99] = 2296663921193077102L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ku getGlyph(int n2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = nw - ks.gztk("hadj", gzts(int ), 32)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ks.gztk("hadk", gzth(int ), 223)) break;
            object = ks.gztk("hadl", gzth(int ), 224);
        }
        boolean bl3 = c;
        Object object = nw;
        block17: while (true) {
            switch ((int)object) {
                case 1309806216: {
                    object = ks.gztk("hadn", gzts(int ), 34) - ks.gztk("hadm", gzts(int ), 33);
                    continue block17;
                }
                case 1568355323: {
                    break block17;
                }
            }
            break;
        }
        int n3 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = nw - ks.gztk("hado", gzts(int ), 35)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ks.gztk("hadp", gzth(int ), 225)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = ks.gztk("hadq", gzth(int ), 226);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object3 = nw;
        boolean bl4 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - ks.gztk("hadr", gzts(int ), 36);
            }
            switch ((int)object3) {
                case -1039623168: {
                    callSite = ks.gztk("hads", gzts(int ), 37);
                    continue block19;
                }
                case -854085991: {
                    callSite = ks.gztk("hadt", gzts(int ), 38);
                    continue block19;
                }
                case 476179933: {
                    callSite = ks.gztk("hadu", gzts(int ), 39);
                    continue block19;
                }
                case 1568355323: {
                    break block19;
                }
            }
            break;
        }
        Object object4 = nw;
        boolean bl5 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - ks.gztk("hadv", gzts(int ), 40);
            }
            switch ((int)object4) {
                case -1988878844: {
                    callSite = ks.gztk("hadw", gzts(int ), 41);
                    continue block20;
                }
                case -1361214758: {
                    callSite = ks.gztk("hadx", gzts(int ), 42);
                    continue block20;
                }
                case -310464163: {
                    callSite = ks.gztk("hady", gzts(int ), 43);
                    continue block20;
                }
                case 1568355323: {
                    break block20;
                }
            }
            break;
        }
        Integer n4 = n2;
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = nw - ks.gztk("hadz", gzts(int ), 44)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == ks.gztk("haea", gzth(int ), 227)) {
                return this.glyphs.get(n4);
            }
            object5 = ks.gztk("haeb", gzth(int ), 228);
        }
    }

    private static void hbda() {
        ks.gzti[200] = -878424131;
        ks.gzti[201] = 31307453;
        ks.gzti[202] = -1546189616;
        ks.gzti[203] = 1291462528;
        ks.gzti[204] = -1879823427;
        ks.gzti[205] = 2078578545;
        ks.gzti[206] = 2028540173;
        ks.gzti[207] = 1124935044;
        ks.gzti[208] = -2058262341;
        ks.gzti[209] = 1790942452;
        ks.gzti[210] = -959733031;
        ks.gzti[211] = -303961954;
        ks.gzti[212] = -1417936192;
        ks.gzti[213] = -840450151;
        ks.gzti[214] = 1750632516;
        ks.gzti[215] = -1779108404;
        ks.gzti[216] = 1456478615;
        ks.gzti[217] = -99243927;
        ks.gzti[218] = 1595965341;
        ks.gzti[219] = 1150203970;
        ks.gzti[220] = -1442688765;
        ks.gzti[221] = 1126730087;
        ks.gzti[222] = 2028528547;
        ks.gzti[223] = 1299439537;
        ks.gzti[224] = -1635104289;
        ks.gzti[225] = 937646827;
        ks.gzti[226] = 11698339;
        ks.gzti[227] = -1548188232;
        ks.gzti[228] = -93368589;
        ks.gzti[229] = -1040609397;
        ks.gzti[230] = -559945900;
        ks.gzti[231] = -275722778;
        ks.gzti[232] = -1615225035;
        ks.gzti[233] = 1416417752;
        ks.gzti[234] = 1435268822;
        ks.gzti[235] = -1207882037;
        ks.gzti[236] = 872125739;
        ks.gzti[237] = -1494144848;
        ks.gzti[238] = 1278679791;
        ks.gzti[239] = -619702951;
        ks.gzti[240] = -954236643;
        ks.gzti[241] = -1435691741;
        ks.gzti[242] = 1304861557;
        ks.gzti[243] = -177050312;
        ks.gzti[244] = -1153400696;
        ks.gzti[245] = -1721150635;
        ks.gzti[246] = 354540417;
        ks.gzti[247] = -743923694;
        ks.gzti[248] = 1736601618;
        ks.gzti[249] = -365059029;
        ks.gzti[250] = 1163975993;
        ks.gzti[251] = -2006045704;
        ks.gzti[252] = 1718667977;
        ks.gzti[253] = -1627505775;
        ks.gzti[254] = -1673982891;
        ks.gzti[255] = -881141514;
        ks.gzti[256] = 335834304;
        ks.gzti[257] = 861893421;
        ks.gzti[258] = 677336914;
        ks.gzti[259] = -755816043;
        ks.gzti[260] = -1296099178;
        ks.gzti[261] = -1674642107;
        ks.gzti[262] = 277305229;
        ks.gzti[263] = -1532514584;
        ks.gzti[264] = -1857935585;
        ks.gzti[265] = -780621773;
        ks.gzti[266] = 2071785459;
        ks.gzti[267] = -185197083;
        ks.gzti[268] = -801657180;
        ks.gzti[269] = -2056299655;
        ks.gzti[270] = 2139973164;
        ks.gzti[271] = -496668195;
        ks.gzti[272] = 516100539;
        ks.gzti[273] = 1566754390;
        ks.gzti[274] = -743938739;
        ks.gzti[275] = 1134640180;
        ks.gzti[276] = 924744906;
        ks.gzti[277] = -612940050;
        ks.gzti[278] = -1399183751;
        ks.gzti[279] = 1821407563;
        ks.gzti[280] = -463925717;
        ks.gzti[281] = -50039072;
        ks.gzti[282] = 593100720;
        ks.gzti[283] = -1906123312;
        ks.gzti[284] = 14530533;
        ks.gzti[285] = -818645987;
        ks.gzti[286] = -230115842;
        ks.gzti[287] = 272615319;
        ks.gzti[288] = -713337521;
        ks.gzti[289] = -195606795;
        ks.gzti[290] = 849942578;
        ks.gzti[291] = -63430146;
        ks.gzti[292] = -465342962;
        ks.gzti[293] = 696974763;
        ks.gzti[294] = -1926784344;
        ks.gzti[295] = 1863554454;
        ks.gzti[296] = 1809738862;
        ks.gzti[297] = 706487728;
        ks.gzti[298] = 501682201;
        ks.gzti[299] = 198278924;
    }

    private static int gzth(int n2) {
        return gzti[n2] ^ gztj[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getStringWidth(String var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("haxp", gzts(int ), (int)103)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ks.gztk("haxq", gzth(int ), (int)309)) break;
            v0 /* !! */  = (long)ks.gztk("haxr", gzth(int ), (int)310);
        }
        var9_3 = ks.c;
        v1 /* !! */  = ks.nw;
        if (true) ** GOTO lbl11
        block47: while (true) {
            v1 /* !! */  = (long)(v2 - ks.gztk("haxs", gzts(int ), (int)104));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 635331493: {
                    v2 = ks.gztk("haxt", gzts(int ), (int)105);
                    continue block47;
                }
                case 1214055323: {
                    v2 = ks.gztk("haxu", gzts(int ), (int)106);
                    continue block47;
                }
                case 1568355323: {
                    break block47;
                }
                case 1600377470: {
                    v2 = ks.gztk("haxv", gzts(int ), (int)107);
                    continue block47;
                }
            }
            break;
        }
        var8_4 /* !! */  = ks.b;
        v3 /* !! */  = ks.nw;
        if (true) ** GOTO lbl28
        block48: while (true) {
            v3 /* !! */  = (long)(v4 - ks.gztk("haxw", gzts(int ), (int)108));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1504777981: {
                    v4 = ks.gztk("haxx", gzts(int ), (int)109);
                    continue block48;
                }
                case 1568355323: {
                    break block48;
                }
                case 1685494563: {
                    v4 = ks.gztk("haxy", gzts(int ), (int)110);
                    continue block48;
                }
            }
            break;
        }
        var7_5 = ks.a;
        if (var9_3) {
            throw null;
lbl40:
            // 12 sources

            return (float)ks.gztk("haxz", hatl(int ), (int)311);
        }
        if (var7_5 || var7_5) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("haya", gzts(int ), (int)111)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ks.gztk("hayb", gzth(int ), (int)312)) break;
            v5 /* !! */  = (long)ks.gztk("hayc", gzth(int ), (int)313);
        }
        var3_6 = var2_2 / this.emSize;
        if (var7_5 || var7_5) ** GOTO lbl40
        var4_7 = 0.0f;
        if (var7_5 || var7_5) ** GOTO lbl40
        if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_8 = ks.gztk("hayd", gzth(int ), (int)314);
                if (var7_5) ** GOTO lbl40
                do {
                    if (var7_5 || var7_5) ** GOTO lbl40
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("haye", gzts(int ), (int)112)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == ks.gztk("hayf", gzth(int ), (int)315)) break;
                        v6 /* !! */  = (long)ks.gztk("hayg", gzth(int ), (int)316);
                    }
                    if (var5_8 >= var1_1.length()) ** GOTO lbl116
                    if (var7_5 || var7_5) ** GOTO lbl40
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = ks.nw - ks.gztk("hayh", gzts(int ), (int)113)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == ks.gztk("hayi", gzth(int ), (int)317)) break;
                        v7 /* !! */  = (long)ks.gztk("hayj", gzth(int ), (int)318);
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = ks.nw - ks.gztk("hayk", gzts(int ), (int)114)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == ks.gztk("hayl", gzth(int ), (int)319)) break;
                        v8 /* !! */  = (long)ks.gztk("haym", gzth(int ), (int)320);
                    }
                    v9 = var1_1.charAt((int)var5_8);
                    v10 /* !! */  = ks.nw;
                    if (true) ** GOTO lbl81
                    block55: while (true) {
                        v10 /* !! */  = (long)(v11 - ks.gztk("hayn", gzts(int ), (int)115));
lbl81:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -248867748: {
                                v11 = ks.gztk("hayo", gzts(int ), (int)116);
                                continue block55;
                            }
                            case -12895590: {
                                v11 = ks.gztk("hayp", gzts(int ), (int)117);
                                continue block55;
                            }
                            case 1568355323: {
                                break block55;
                            }
                        }
                        break;
                    }
                    v12 = v9;
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_5 = ks.nw - ks.gztk("hayq", gzts(int ), (int)118)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == ks.gztk("hayr", gzth(int ), (int)321)) break;
                        v13 /* !! */  = (long)ks.gztk("hays", gzth(int ), (int)322);
                    }
                    var6_9 = this.glyphs.get(v12);
                    if (var7_5 || var7_5) ** GOTO lbl40
                    if (var6_9 == null) ** GOTO lbl111
                    if (var7_5 || var7_5) ** GOTO lbl40
                    v14 /* !! */  = ks.nw;
                    if (true) ** GOTO lbl104
                    block57: while (true) {
                        v14 /* !! */  = (long)(ks.gztk("hayu", gzts(int ), (int)120) - ks.gztk("hayt", gzts(int ), (int)119));
lbl104:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -710714204: {
                                continue block57;
                            }
                            case 1568355323: {
                                break block57;
                            }
                        }
                        break;
                    }
                    var4_7 += var6_9.advance * var3_6;
                    if (var7_5) ** GOTO lbl40
lbl111:
                    // 2 sources

                    if (var7_5 || var7_5) ** GOTO lbl40
                    ++var5_8;
                    if (var7_5) ** GOTO lbl40
                } while (!var9_3);
                throw null;
lbl116:
                // 1 sources

                if (!var7_5 && !var7_5) ** break;
                ** continue;
                return var4_7;
            }
            case 0: {
                var8_4 /* !! */  = (int)ks.gztk("hayv", gzth(int ), (int)323);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl124:
            // 3 sources

            case 1: {
                var8_4 /* !! */  = (int)ks.gztk("hayw", gzth(int ), (int)324);
                if (var9_3) {
                    throw null;
                }
            }
lbl128:
            // 5 sources

            case 2: {
                var8_4 /* !! */  = (int)ks.gztk("hayx", gzth(int ), (int)325);
                if (!var9_3) break;
                throw null;
            }
            case 3: {
                var8_4 /* !! */  = (int)ks.gztk("hayy", gzth(int ), (int)326);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 4: {
                var8_4 /* !! */  = (int)ks.gztk("hayz", gzth(int ), (int)327);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 5: {
                var8_4 /* !! */  = (int)ks.gztk("haza", gzth(int ), (int)328);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl147:
            // 2 sources

            case 6: {
                var8_4 /* !! */  = (int)ks.gztk("hazb", gzth(int ), (int)329);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 7: {
                var8_4 /* !! */  = (int)ks.gztk("hazc", gzth(int ), (int)330);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl157:
            // 4 sources

            case 8: {
                var8_4 /* !! */  = (int)ks.gztk("hazd", gzth(int ), (int)331);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl162:
            // 3 sources

            case 9: {
                var8_4 /* !! */  = (int)ks.gztk("haze", gzth(int ), (int)332);
                if (!var9_3) ** GOTO lbl128
                throw null;
            }
lbl166:
            // 2 sources

            case 10: {
                var8_4 /* !! */  = (int)ks.gztk("hazf", gzth(int ), (int)333);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl171:
            // 2 sources

            case 11: {
                var8_4 /* !! */  = (int)ks.gztk("hazg", gzth(int ), (int)334);
                if (!var9_3) ** GOTO lbl124
                throw null;
            }
            case 12: {
                var8_4 /* !! */  = (int)ks.gztk("hazh", gzth(int ), (int)335);
                if (!var9_3) ** GOTO lbl157
                throw null;
            }
lbl179:
            // 5 sources

            case 13: {
                var8_4 /* !! */  = (int)ks.gztk("hazi", gzth(int ), (int)336);
                if (var9_3) {
                    throw null;
                }
            }
            case 14: {
                var8_4 /* !! */  = (int)ks.gztk("hazj", gzth(int ), (int)337);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 15: {
                var8_4 /* !! */  = (int)ks.gztk("hazk", gzth(int ), (int)338);
                if (!var9_3) ** GOTO lbl162
                throw null;
            }
lbl192:
            // 2 sources

            case 16: {
                var8_4 /* !! */  = (int)ks.gztk("hazl", gzth(int ), (int)339);
                if (!var9_3) ** GOTO lbl179
                throw null;
            }
            case 17: {
                var8_4 /* !! */  = (int)ks.gztk("hazm", gzth(int ), (int)340);
                if (!var9_3) ** GOTO lbl179
                throw null;
            }
            case 18: {
                var8_4 /* !! */  = (int)ks.gztk("hazn", gzth(int ), (int)341);
                if (!var9_3) ** GOTO lbl162
                throw null;
            }
            case 19: {
                var8_4 /* !! */  = (int)ks.gztk("hazo", gzth(int ), (int)342);
                if (!var9_3) ** GOTO lbl124
                throw null;
            }
            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_4 /* !! */  = (int)ks.gztk("hazp", gzth(int ), (int)343);
                    if (!var9_3) ** GOTO lbl179
                    throw null;
                }
            }
lbl213:
            // 2 sources

            case 21: {
                var8_4 /* !! */  = (int)ks.gztk("hazq", gzth(int ), (int)344);
                if (!var9_3) ** GOTO lbl157
                throw null;
            }
lbl217:
            // 3 sources

            case 22: {
                var8_4 /* !! */  = (int)ks.gztk("hazr", gzth(int ), (int)345);
                if (!var9_3) ** GOTO lbl128
                throw null;
            }
            case 23: 
        }
        var8_4 /* !! */  = (int)ks.gztk("hazs", gzth(int ), (int)346);
        ** while (!var9_3)
lbl224:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private String lambda$loadAtlas$0() {
        v0 /* !! */  = ks.nw;
        block16: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 112297432: {
                    v0 /* !! */  = (long)(ks.gztk("hbcg", gzts(int ), (int)149) - ks.gztk("hbcf", gzts(int ), (int)148));
                    continue block16;
                }
                case 1568355323: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = ks.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("hbch", gzts(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ks.gztk("hbci", gzth(int ), (int)384)) break;
            v1 /* !! */  = (long)ks.gztk("hbcj", gzth(int ), (int)385);
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("hbck", gzts(int ), (int)151)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ks.gztk("hbcl", gzth(int ), (int)386)) {
                var1_3 = ks.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ks.gztk("hbcm", gzth(int ), (int)387);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                v3 /* !! */  = ks.nw;
                block19: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -443890162: {
                            v4 = ks.gztk("hbco", gzts(int ), (int)153);
                            ** GOTO lbl41
                        }
                        case 228559097: {
                            v4 = ks.gztk("hbcp", gzts(int ), (int)154);
                            ** GOTO lbl41
                        }
                        case 741303209: {
                            v4 = ks.gztk("hbcq", gzts(int ), (int)155);
lbl41:
                            // 3 sources

                            v3 /* !! */  = (long)(v4 - ks.gztk("hbcn", gzts(int ), (int)152));
                            continue block19;
                        }
                        case 1568355323: {
                            break block19;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("hbcr", gzts(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ks.gztk("hbcs", gzth(int ), (int)388)) {
                        return "msdf:" + this.name;
                    }
                    v5 /* !! */  = (long)ks.gztk("hbct", gzth(int ), (int)389);
                }
            }
            case 0: {
                var2_2 /* !! */  = (int)ks.gztk("hbcu", gzth(int ), (int)390);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl61
            }
            case 3: {
                var2_2 /* !! */  = (int)ks.gztk("hbcx", gzth(int ), (int)393);
                if (var3_1) {
                    throw null;
                }
lbl61:
                // 3 sources

                var2_2 /* !! */  = (int)ks.gztk("hbcv", gzth(int ), (int)391);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)ks.gztk("hbcw", gzth(int ), (int)392);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ks(String var1_1) {
        var3_2 /* !! */  = ks.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.glyphs = new HashMap<Integer, ku>();
                this.loaded = ks.gztk("gztl", gzth(int ), (int)0);
                this.name = var1_1;
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ks.gztk("gztm", gzth(int ), (int)1);
                ** GOTO lbl23
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ks.gztk("gztn", gzth(int ), (int)2);
                    continue;
                    break;
                }
            }
lbl17:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ks.gztk("gzto", gzth(int ), (int)3);
                ** GOTO lbl10
            }
            case 3: {
                var3_2 /* !! */  = (int)ks.gztk("gztp", gzth(int ), (int)4);
                ** GOTO lbl17
            }
lbl23:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)ks.gztk("gztq", gzth(int ), (int)5);
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)ks.gztk("gztr", gzth(int ), (int)6);
        ** while (true)
    }

    private static void hbdh() {
        ks.gztt[100] = -4070348936438663838L;
        ks.gztt[101] = -5581429878107415896L;
        ks.gztt[102] = 8454401095811420504L;
        ks.gztt[103] = 5771624667828074424L;
        ks.gztt[104] = -7989937483837850603L;
        ks.gztt[105] = -1547728930045697611L;
        ks.gztt[106] = -8943262045025226732L;
        ks.gztt[107] = 839313392295315145L;
        ks.gztt[108] = 7522616796708410792L;
        ks.gztt[109] = 4362597937860736533L;
        ks.gztt[110] = 2527528723678338727L;
        ks.gztt[111] = -100286634576961474L;
        ks.gztt[112] = -5904701164637318789L;
        ks.gztt[113] = -5874436515631165232L;
        ks.gztt[114] = 6713071913693464429L;
        ks.gztt[115] = 3248328519127684783L;
        ks.gztt[116] = -329072182861831992L;
        ks.gztt[117] = 2580031778650659634L;
        ks.gztt[118] = -3728260571482003384L;
        ks.gztt[119] = -4929990085820781853L;
        ks.gztt[120] = 1250257195128628102L;
        ks.gztt[121] = 7748398148566444986L;
        ks.gztt[122] = 2500462524648419879L;
        ks.gztt[123] = 870687624599140416L;
        ks.gztt[124] = 2014074869268042220L;
        ks.gztt[125] = -2447600278403631582L;
        ks.gztt[126] = 3718375579605185022L;
        ks.gztt[127] = 7453010282530338197L;
        ks.gztt[128] = -1620254942139479087L;
        ks.gztt[129] = -3184923137788817938L;
        ks.gztt[130] = 364408355340418130L;
        ks.gztt[131] = -8208036350802257535L;
        ks.gztt[132] = 8803267037641026740L;
        ks.gztt[133] = 5339651696974617305L;
        ks.gztt[134] = 7864175678520316644L;
        ks.gztt[135] = -4015322775978446466L;
        ks.gztt[136] = -5243511456253304249L;
        ks.gztt[137] = 93619494844304947L;
        ks.gztt[138] = -5705136375833247527L;
        ks.gztt[139] = 2981167759429713662L;
        ks.gztt[140] = -7852310144734043045L;
        ks.gztt[141] = -8289865168380368917L;
        ks.gztt[142] = 3140425767842630641L;
        ks.gztt[143] = 1459699623130160819L;
        ks.gztt[144] = 7195393884820182519L;
        ks.gztt[145] = 1571995028022260043L;
        ks.gztt[146] = 4562531543700980017L;
        ks.gztt[147] = -8146750108206231775L;
        ks.gztt[148] = -88639500565727198L;
        ks.gztt[149] = -8123707635140683211L;
        ks.gztt[150] = 5418132350569943701L;
        ks.gztt[151] = -3957447281796837972L;
        ks.gztt[152] = 7362763791422197719L;
        ks.gztt[153] = 551128892901388258L;
        ks.gztt[154] = -5942499335669881589L;
        ks.gztt[155] = 3542192983401609680L;
        ks.gztt[156] = 6449013879735790637L;
    }

    private static long gzts(int n2) {
        return gztt[n2] ^ gztu[n2];
    }

    private static void hbde() {
        ks.gztj[200] = -878424188;
        ks.gztj[201] = 31307440;
        ks.gztj[202] = -1546189660;
        ks.gztj[203] = 1291462404;
        ks.gztj[204] = -1879823445;
        ks.gztj[205] = 2078578544;
        ks.gztj[206] = 2028540164;
        ks.gztj[207] = 1124935156;
        ks.gztj[208] = -2058262281;
        ks.gztj[209] = 1790942431;
        ks.gztj[210] = -959733004;
        ks.gztj[211] = -303961979;
        ks.gztj[212] = -1417936221;
        ks.gztj[213] = -840450077;
        ks.gztj[214] = 1750632641;
        ks.gztj[215] = -1779108479;
        ks.gztj[216] = 1456478483;
        ks.gztj[217] = -99243956;
        ks.gztj[218] = 1595965429;
        ks.gztj[219] = 1150203973;
        ks.gztj[220] = -1442688692;
        ks.gztj[221] = 1126730037;
        ks.gztj[222] = 2028528619;
        ks.gztj[223] = 1299439536;
        ks.gztj[224] = -1103285851;
        ks.gztj[225] = 937646826;
        ks.gztj[226] = 720892504;
        ks.gztj[227] = -1548188231;
        ks.gztj[228] = -1149899642;
        ks.gztj[229] = -1040609400;
        ks.gztj[230] = -559945898;
        ks.gztj[231] = -275722779;
        ks.gztj[232] = -1615225033;
        ks.gztj[233] = 1416417753;
        ks.gztj[234] = -495123212;
        ks.gztj[235] = -1207882038;
        ks.gztj[236] = 1593283187;
        ks.gztj[237] = -1494144847;
        ks.gztj[238] = 720644426;
        ks.gztj[239] = -619702949;
        ks.gztj[240] = -954236641;
        ks.gztj[241] = -1435691744;
        ks.gztj[242] = 1304861559;
        ks.gztj[243] = -177050311;
        ks.gztj[244] = -877679606;
        ks.gztj[245] = -1721150636;
        ks.gztj[246] = -1936155671;
        ks.gztj[247] = -318983458;
        ks.gztj[248] = 1736601618;
        ks.gztj[249] = -365059030;
        ks.gztj[250] = 1163975994;
        ks.gztj[251] = -2006045704;
        ks.gztj[252] = 1718667976;
        ks.gztj[253] = -801359472;
        ks.gztj[254] = -1673982892;
        ks.gztj[255] = 35553527;
        ks.gztj[256] = 727887438;
        ks.gztj[257] = 861893421;
        ks.gztj[258] = 677336912;
        ks.gztj[259] = -755816043;
        ks.gztj[260] = -1296099179;
        ks.gztj[261] = -1674642108;
        ks.gztj[262] = 400006233;
        ks.gztj[263] = -1532514583;
        ks.gztj[264] = 930196586;
        ks.gztj[265] = -282364061;
        ks.gztj[266] = 2071785457;
        ks.gztj[267] = -185197084;
        ks.gztj[268] = -801657180;
        ks.gztj[269] = -2056299655;
        ks.gztj[270] = 2139973165;
        ks.gztj[271] = 871953109;
        ks.gztj[272] = 516100538;
        ks.gztj[273] = -363860890;
        ks.gztj[274] = -309353791;
        ks.gztj[275] = 1134640181;
        ks.gztj[276] = 1090918327;
        ks.gztj[277] = -612940051;
        ks.gztj[278] = -1399183750;
        ks.gztj[279] = 1821407560;
        ks.gztj[280] = -463925717;
        ks.gztj[281] = 50039071;
        ks.gztj[282] = 1900541279;
        ks.gztj[283] = -1906123311;
        ks.gztj[284] = -35319566;
        ks.gztj[285] = -205339427;
        ks.gztj[286] = -230115843;
        ks.gztj[287] = 272615316;
        ks.gztj[288] = -713337524;
        ks.gztj[289] = -195606796;
        ks.gztj[290] = 849942579;
        ks.gztj[291] = -94490516;
        ks.gztj[292] = -465342961;
        ks.gztj[293] = 1150440327;
        ks.gztj[294] = 1926784343;
        ks.gztj[295] = -2063353817;
        ks.gztj[296] = 1809738860;
        ks.gztj[297] = 706487728;
        ks.gztj[298] = 501682202;
        ks.gztj[299] = 198278926;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void load(class_2960 var1_1, class_2960 var2_2) {
        block125: {
            block124: {
                v0 /* !! */  = ks.nw;
                block73: while (true) {
                    switch ((int)v0 /* !! */ ) {
                        case -2143084738: {
                            v0 /* !! */  = (long)(ks.gztk("gztw", gzts(int ), (int)1) - ks.gztk("gztv", gzts(int ), (int)0));
                            continue block73;
                        }
                        case 1568355323: {
                            break block73;
                        }
                    }
                    break;
                }
                var6_3 = ks.c;
                while (true) {
                    block126: {
                        if ((v1 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("gztx", gzts(int ), (int)2)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  != ks.gztk("gzty", gzth(int ), (int)7)) break block126;
                        var5_4 /* !! */  = ks.b;
                        v2 /* !! */  = ks.nw;
                        if (true) ** GOTO lbl21
                    }
                    v1 /* !! */  = (long)ks.gztk("gztz", gzth(int ), (int)8);
                }
                block75: while (true) {
                    v2 /* !! */  = (long)(v3 - ks.gztk("gzua", gzts(int ), (int)3));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1969189133: {
                            v3 = ks.gztk("gzub", gzts(int ), (int)4);
                            continue block75;
                        }
                        case -418512368: {
                            v3 = ks.gztk("gzuc", gzts(int ), (int)5);
                            continue block75;
                        }
                        case 1568355323: {
                            break block75;
                        }
                    }
                    break;
                }
                var4_5 = ks.a;
                if (var6_3) {
                    throw null;
                }
                if (var4_5 || var4_5) return;
                v4 /* !! */  = ks.nw;
                if (true) ** GOTO lbl38
                block76: while (true) {
                    v4 /* !! */  = (long)(v5 - ks.gztk("gzud", gzts(int ), (int)6));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -384151048: {
                            v5 = ks.gztk("gzue", gzts(int ), (int)7);
                            continue block76;
                        }
                        case 771422608: {
                            v5 = ks.gztk("gzuf", gzts(int ), (int)8);
                            continue block76;
                        }
                        case 1568355323: {
                            break block76;
                        }
                        case 1599165373: {
                            v5 = ks.gztk("gzug", gzts(int ), (int)9);
                            continue block76;
                        }
                    }
                    break;
                }
                if (this.loaded) {
                    if (var4_5 || var4_5) return;
                    return;
                }
                try {
                    if (var4_5 || var4_5) return;
                    v6 /* !! */  = ks.nw;
                    if (true) ** GOTO lbl59
                    block77: while (true) {
                        v6 /* !! */  = (long)(v7 - ks.gztk("gzuh", gzts(int ), (int)10));
lbl59:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1565835399: {
                                v7 = ks.gztk("gzui", gzts(int ), (int)11);
                                continue block77;
                            }
                            case 825829527: {
                                v7 = ks.gztk("gzuj", gzts(int ), (int)12);
                                continue block77;
                            }
                            case 1568355323: {
                                break block77;
                            }
                        }
                        break;
                    }
                    this.loadAtlas(var1_1);
                    if (var4_5 || var4_5) return;
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("gzuk", gzts(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == ks.gztk("gzul", gzth(int ), (int)9)) {
                            this.loadMetrics(var2_2);
                            if (var4_5) return;
                            break;
                        }
                        v8 /* !! */  = (long)ks.gztk("gzum", gzth(int ), (int)10);
                    }
                    if (var4_5) return;
                    v9 = this;
                    v10 = ks.gztk("gzun", gzth(int ), (int)11);
                    v11 /* !! */  = ks.nw;
                    block79: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case -1553980614: {
                                v11 /* !! */  = (long)(ks.gztk("gzup", gzts(int ), (int)15) - ks.gztk("gzuo", gzts(int ), (int)14));
                                continue block79;
                            }
                            case 1568355323: {
                                ** break;
                            }
                        }
                        break;
                    }
                }
                catch (Exception var3_6) {
                    if (var4_5 || var4_5) return;
                    v12 /* !! */  = ks.nw;
                    if (true) ** GOTO lbl223
                }
lbl94:
                // 3 sources

                v9.loaded = v10;
                if (var4_5 || var4_5) return;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ks.nw - ks.gztk("gzuq", gzts(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ks.gztk("gzur", gzth(int ), (int)12)) break;
                    v13 /* !! */  = (long)ks.gztk("gzus", gzth(int ), (int)13);
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ks.nw - ks.gztk("gzut", gzts(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ks.gztk("gzuu", gzth(int ), (int)14)) break;
                    v14 /* !! */  = (long)ks.gztk("gzuv", gzth(int ), (int)15);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = ks.nw - ks.gztk("gzuw", gzts(int ), (int)18)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ks.gztk("gzux", gzth(int ), (int)16)) break;
                    v15 /* !! */  = (long)ks.gztk("gzuy", gzth(int ), (int)17);
                }
                v16 = "[MSDF] Successfully loaded font: " + this.name;
                while (true) {
                    block127: {
                        if ((v17 /* !! */  = (cfr_temp_6 = ks.nw - ks.gztk("gzuz", gzts(int ), (int)19)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  != ks.gztk("gzva", gzth(int ), (int)18)) break block127;
                        System.out.println(v16);
                        if (var5_4 /* !! */  != 0) {
                            break;
                        }
                        ** GOTO lbl-1000
                    }
                    v17 /* !! */  = (long)ks.gztk("gzvb", gzth(int ), (int)19);
                }
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var4_5 || var4_5) return;
                            if (var6_3) {
                                throw null;
                            }
                            ** GOTO lbl276
                        }
                        case 5: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvx", gzth(int ), (int)29);
                            cfr_temp_0 = 3;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 7: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvz", gzth(int ), (int)31);
                            if (!var6_3) ** break;
                            throw null;
                        }
                        case 9: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwb", gzth(int ), (int)33);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 8: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwa", gzth(int ), (int)32);
                            cfr_temp_0 = 17;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 14: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwg", gzth(int ), (int)38);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 0: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvs", gzth(int ), (int)24);
                            cfr_temp_0 = 1;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 15: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwh", gzth(int ), (int)39);
                            cfr_temp_0 = 17;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 16: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwi", gzth(int ), (int)40);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 2: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvu", gzth(int ), (int)26);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 11: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwd", gzth(int ), (int)35);
                            cfr_temp_0 = 17;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 19: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwl", gzth(int ), (int)43);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 17: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwj", gzth(int ), (int)41);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 1: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvt", gzth(int ), (int)25);
                            cfr_temp_0 = 6;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 21: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwn", gzth(int ), (int)45);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 12: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwe", gzth(int ), (int)36);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 13: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwf", gzth(int ), (int)37);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 18: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwk", gzth(int ), (int)42);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 10: {
                            break block125;
                        }
                        case 22: {
                            var5_4 /* !! */  = (int)ks.gztk("gzwo", gzth(int ), (int)46);
                            cfr_temp_0 = 3;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 23: {
                            ** GOTO lbl306
                        }
                        block85: while (true) {
                            v12 /* !! */  = (long)(v18 - ks.gztk("gzvc", gzts(int ), (int)20));
lbl223:
                            // 2 sources

                            switch ((int)v12 /* !! */ ) {
                                case -196542822: {
                                    v18 = ks.gztk("gzvd", gzts(int ), (int)21);
                                    continue block85;
                                }
                                case 341795291: {
                                    v18 = ks.gztk("gzve", gzts(int ), (int)22);
                                    continue block85;
                                }
                                case 955579066: {
                                    v18 = ks.gztk("gzvf", gzts(int ), (int)23);
                                    continue block85;
                                }
                                case 1568355323: {
                                    break block85;
                                }
                            }
                            break;
                        }
                        v19 /* !! */  = ks.nw;
                        block86: while (true) {
                            switch ((int)v19 /* !! */ ) {
                                case -1471881322: {
                                    v19 /* !! */  = (long)(ks.gztk("gzvh", gzts(int ), (int)25) - ks.gztk("gzvg", gzts(int ), (int)24));
                                    continue block86;
                                }
                                case 1568355323: {
                                    break block86;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v20 /* !! */  = (cfr_temp_7 = ks.nw - ks.gztk("gzvi", gzts(int ), (int)26)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v20 /* !! */  == ks.gztk("gzvj", gzth(int ), (int)20)) break;
                            v20 /* !! */  = (long)ks.gztk("gzvk", gzth(int ), (int)21);
                        }
                        v21 = "[MSDF] Failed to load font '" + this.name + "':";
                        while (true) {
                            if ((v22 /* !! */  = (cfr_temp_8 = ks.nw - ks.gztk("gzvl", gzts(int ), (int)27)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v22 /* !! */  == ks.gztk("gzvm", gzth(int ), (int)22)) {
                                System.err.println(v21);
                                if (var4_5) return;
                                break;
                            }
                            v22 /* !! */  = (long)ks.gztk("gzvn", gzth(int ), (int)23);
                        }
                        if (var4_5) return;
                        v23 /* !! */  = ks.nw;
                        if (true) ** GOTO lbl262
                        block89: while (true) {
                            v23 /* !! */  = (long)(v24 - ks.gztk("gzvo", gzts(int ), (int)28));
lbl262:
                            // 2 sources

                            switch ((int)v23 /* !! */ ) {
                                case -1430660403: {
                                    v24 = ks.gztk("gzvp", gzts(int ), (int)29);
                                    continue block89;
                                }
                                case -1191531980: {
                                    v24 = ks.gztk("gzvq", gzts(int ), (int)30);
                                    continue block89;
                                }
                                case 589894995: {
                                    v24 = ks.gztk("gzvr", gzts(int ), (int)31);
                                    continue block89;
                                }
                                case 1568355323: {
                                    break block89;
                                }
                            }
                            break;
                        }
                        var3_6.printStackTrace();
                        if (var4_5) return;
lbl276:
                        // 2 sources

                        if (!var4_5 && !var4_5) return;
                        return;
                        case 3: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvv", gzth(int ), (int)27);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 6: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvy", gzth(int ), (int)30);
                            cfr_temp_0 = 3;
                            if (var6_3) {
                                throw null;
                            }
                            break block124;
                        }
                        case 4: {
                            var5_4 /* !! */  = (int)ks.gztk("gzvw", gzth(int ), (int)28);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 20: 
                    }
                    break;
                }
                ** GOTO lbl297
            }
            do {
                if (true) ** continue;
lbl297:
                // 2 sources

                var5_4 /* !! */  = (int)ks.gztk("gzwm", gzth(int ), (int)44);
                cfr_temp_0 = 4;
            } while (!var6_3);
            throw null;
        }
        do {
            var5_4 /* !! */  = (int)ks.gztk("gzwc", gzth(int ), (int)34);
            if (!var6_3) ** break;
            throw null;
lbl306:
            // 3 sources

            var5_4 /* !! */  = (int)ks.gztk("gzwp", gzth(int ), (int)47);
        } while (!var6_3);
        throw null;
    }

    static {
        gztj = new int[394];
        ks.hbcy();
        ks.hbcz();
        ks.hbda();
        ks.hbdb();
        ks.hbdc();
        ks.hbdd();
        ks.hbde();
        ks.hbdf();
        gztt = new long[157];
        gztu = new long[157];
        ks.hbdg();
        ks.hbdh();
        ks.hbdi();
        ks.hbdj();
    }

    /*
     * Exception decompiling
     */
    private void loadAtlas(class_2960 var1_1) throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getAscender() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("hatu", gzts(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ks.gztk("hatv", gzth(int ), (int)252)) break;
            v0 /* !! */  = (long)ks.gztk("hatw", gzth(int ), (int)253);
        }
        var3_1 = ks.c;
        v1 /* !! */  = ks.nw;
        block15: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 26583222: {
                    v1 /* !! */  = (long)(ks.gztk("haty", gzts(int ), (int)63) - ks.gztk("hatx", gzts(int ), (int)62));
                    continue block15;
                }
                case 1568355323: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("hatz", gzts(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ks.gztk("haua", gzth(int ), (int)254)) {
                var1_3 = ks.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ks.gztk("haub", gzth(int ), (int)255);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (float)ks.gztk("hauc", hatl(int ), (int)256);
                    if (var1_3 != false) return (float)ks.gztk("hauc", hatl(int ), (int)256);
                    v3 /* !! */  = ks.nw;
                    block18: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case 616224568: {
                                v3 /* !! */  = (long)(ks.gztk("haue", gzts(int ), (int)66) - ks.gztk("haud", gzts(int ), (int)65));
                                continue block18;
                            }
                            case 1568355323: {
                                return this.ascender;
                            }
                        }
                        break;
                    }
                    return this.ascender;
                }
                case 0: {
                    var2_2 /* !! */  = (int)ks.gztk("hauf", gzth(int ), (int)257);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ks.gztk("haui", gzth(int ), (int)260);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ks.gztk("haug", gzth(int ), (int)258);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl59
            break;
        }
        do {
            if (true) ** continue;
lbl59:
            // 2 sources

            var2_2 /* !! */  = (int)ks.gztk("hauh", gzth(int ), (int)259);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getName() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("hawi", gzts(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ks.gztk("hawj", gzth(int ), (int)290)) break;
            v0 /* !! */  = (long)ks.gztk("hawk", gzth(int ), (int)291);
        }
        var3_1 = ks.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("hawl", gzts(int ), (int)90)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ks.gztk("hawm", gzth(int ), (int)292)) break;
            v1 /* !! */  = (long)ks.gztk("hawn", gzth(int ), (int)293);
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("hawo", gzts(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ks.gztk("hawp", gzth(int ), (int)294)) break;
            v2 /* !! */  = (long)ks.gztk("hawq", gzth(int ), (int)295);
        }
        var1_3 = ks.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ks.nw;
                if (true) ** GOTO lbl34
                block14: while (true) {
                    v3 /* !! */  = (long)(ks.gztk("haws", gzts(int ), (int)93) - ks.gztk("hawr", gzts(int ), (int)92));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -314883746: {
                            continue block14;
                        }
                        case 1568355323: {
                            break block14;
                        }
                    }
                    break;
                }
                return this.name;
            }
lbl40:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ks.gztk("hawt", gzth(int ), (int)296);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ks.gztk("hawu", gzth(int ), (int)297);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ks.gztk("hawv", gzth(int ), (int)298);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ks.gztk("haww", gzth(int ), (int)299);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    public static CallSite gztk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Exception decompiling
     */
    private void loadMetrics(class_2960 var1_1) throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 145[DOLOOP]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getDescender() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("hauj", gzts(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ks.gztk("hauk", gzth(int ), (int)261)) break;
            v0 /* !! */  = (long)ks.gztk("haul", gzth(int ), (int)262);
        }
        var3_1 = ks.c;
        v1 /* !! */  = ks.nw;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ks.gztk("haum", gzts(int ), (int)68));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1484661139: {
                    v2 = ks.gztk("haun", gzts(int ), (int)69);
                    continue block17;
                }
                case 768482564: {
                    v2 = ks.gztk("hauo", gzts(int ), (int)70);
                    continue block17;
                }
                case 1568355323: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("haup", gzts(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ks.gztk("hauq", gzth(int ), (int)263)) break;
            v3 /* !! */  = (long)ks.gztk("haur", gzth(int ), (int)264);
        }
        var1_3 = ks.a;
        if (var3_1) {
            throw null;
            return (float)ks.gztk("haus", hatl(int ), (int)265);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ks.nw;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ks.gztk("haut", gzts(int ), (int)72));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -977700227: {
                            v5 = ks.gztk("hauu", gzts(int ), (int)73);
                            continue block20;
                        }
                        case 682142934: {
                            v5 = ks.gztk("hauv", gzts(int ), (int)74);
                            continue block20;
                        }
                        case 1568355323: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.descender;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ks.gztk("hauw", gzth(int ), (int)266);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ks.gztk("haux", gzth(int ), (int)267);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ks.gztk("hauy", gzth(int ), (int)268);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ks.gztk("hauz", gzth(int ), (int)269);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static void hbdd() {
        ks.gztj[100] = 357926398;
        ks.gztj[101] = 611821211;
        ks.gztj[102] = 2004083007;
        ks.gztj[103] = 1406212761;
        ks.gztj[104] = -189008924;
        ks.gztj[105] = -1344401008;
        ks.gztj[106] = 464336635;
        ks.gztj[107] = 1473333493;
        ks.gztj[108] = 1086004619;
        ks.gztj[109] = -1463457686;
        ks.gztj[110] = -660484547;
        ks.gztj[111] = 1145536901;
        ks.gztj[112] = 1582490871;
        ks.gztj[113] = -375451422;
        ks.gztj[114] = -1435694596;
        ks.gztj[115] = -1740819603;
        ks.gztj[116] = 1004272453;
        ks.gztj[117] = -458587882;
        ks.gztj[118] = 1550198327;
        ks.gztj[119] = 775718464;
        ks.gztj[120] = 36532956;
        ks.gztj[121] = -1304479825;
        ks.gztj[122] = 213858121;
        ks.gztj[123] = 1507363014;
        ks.gztj[124] = 374128865;
        ks.gztj[125] = -654601658;
        ks.gztj[126] = -649835902;
        ks.gztj[127] = -1933375490;
        ks.gztj[128] = -1298669072;
        ks.gztj[129] = 1335895555;
        ks.gztj[130] = -1433175052;
        ks.gztj[131] = 951734885;
        ks.gztj[132] = -1323264504;
        ks.gztj[133] = 2058714759;
        ks.gztj[134] = -815786614;
        ks.gztj[135] = 930704248;
        ks.gztj[136] = -1863653434;
        ks.gztj[137] = 1368680203;
        ks.gztj[138] = -673182883;
        ks.gztj[139] = 192508792;
        ks.gztj[140] = 1815114453;
        ks.gztj[141] = 893854153;
        ks.gztj[142] = 866412874;
        ks.gztj[143] = -470071443;
        ks.gztj[144] = 1374494116;
        ks.gztj[145] = -902024806;
        ks.gztj[146] = -1626176065;
        ks.gztj[147] = -792945300;
        ks.gztj[148] = 135346778;
        ks.gztj[149] = -1440114208;
        ks.gztj[150] = -1430450731;
        ks.gztj[151] = -567533285;
        ks.gztj[152] = -1593818362;
        ks.gztj[153] = -2146846555;
        ks.gztj[154] = 590954148;
        ks.gztj[155] = -1910221707;
        ks.gztj[156] = -171793125;
        ks.gztj[157] = -217506044;
        ks.gztj[158] = -50470959;
        ks.gztj[159] = -210945846;
        ks.gztj[160] = 566513690;
        ks.gztj[161] = 818875335;
        ks.gztj[162] = -1700867221;
        ks.gztj[163] = -1950284791;
        ks.gztj[164] = -1537148016;
        ks.gztj[165] = 1375759441;
        ks.gztj[166] = -711897353;
        ks.gztj[167] = 1024484929;
        ks.gztj[168] = 454711363;
        ks.gztj[169] = -948467778;
        ks.gztj[170] = 2144473545;
        ks.gztj[171] = -880336027;
        ks.gztj[172] = 1550033064;
        ks.gztj[173] = 1772664904;
        ks.gztj[174] = 277359765;
        ks.gztj[175] = -291895985;
        ks.gztj[176] = -1984873321;
        ks.gztj[177] = 944690924;
        ks.gztj[178] = -1672204732;
        ks.gztj[179] = 1483958791;
        ks.gztj[180] = -550343615;
        ks.gztj[181] = -855622324;
        ks.gztj[182] = -190526965;
        ks.gztj[183] = -1935412668;
        ks.gztj[184] = 864431713;
        ks.gztj[185] = -1846050345;
        ks.gztj[186] = -43562310;
        ks.gztj[187] = 223417394;
        ks.gztj[188] = 1360778673;
        ks.gztj[189] = -177647066;
        ks.gztj[190] = -1225037999;
        ks.gztj[191] = -109865355;
        ks.gztj[192] = 1493369247;
        ks.gztj[193] = -1284304983;
        ks.gztj[194] = -1195946791;
        ks.gztj[195] = -1084999827;
        ks.gztj[196] = -352981440;
        ks.gztj[197] = 1933841026;
        ks.gztj[198] = -1883115152;
        ks.gztj[199] = -1802173253;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getEmSize() {
        v0 /* !! */  = ks.nw;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ks.gztk("havq", gzts(int ), (int)80));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1442336326: {
                    v1 = ks.gztk("havr", gzts(int ), (int)81);
                    continue block17;
                }
                case -174865550: {
                    v1 = ks.gztk("havs", gzts(int ), (int)82);
                    continue block17;
                }
                case 1568355323: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = ks.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("havt", gzts(int ), (int)83)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ks.gztk("havu", gzth(int ), (int)281)) break;
            v2 /* !! */  = (long)ks.gztk("havv", gzth(int ), (int)282);
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("havw", gzts(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ks.gztk("havx", gzth(int ), (int)283)) break;
            v3 /* !! */  = (long)ks.gztk("havy", gzth(int ), (int)284);
        }
        var1_3 = ks.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (float)ks.gztk("havz", hatl(int ), (int)285);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ks.nw;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ks.gztk("hawa", gzts(int ), (int)85));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1764635134: {
                            v5 = ks.gztk("hawb", gzts(int ), (int)86);
                            continue block21;
                        }
                        case -1465819754: {
                            v5 = ks.gztk("hawc", gzts(int ), (int)87);
                            continue block21;
                        }
                        case 819504481: {
                            v5 = ks.gztk("hawd", gzts(int ), (int)88);
                            continue block21;
                        }
                        case 1568355323: {
                            break block21;
                        }
                    }
                    break;
                }
                return this.emSize;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ks.gztk("hawe", gzth(int ), (int)286);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ks.gztk("hawf", gzth(int ), (int)287);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ks.gztk("hawg", gzth(int ), (int)288);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ks.gztk("hawh", gzth(int ), (int)289);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public GpuTextureView getTextureView() {
        v0 /* !! */  = ks.nw;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ks.gztk("haeg", gzts(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -951997607: {
                    v1 = ks.gztk("haeh", gzts(int ), (int)46);
                    continue block12;
                }
                case -816396100: {
                    v1 = ks.gztk("haei", gzts(int ), (int)47);
                    continue block12;
                }
                case -163414524: {
                    v1 = ks.gztk("haej", gzts(int ), (int)48);
                    continue block12;
                }
                case 1568355323: {
                    break block12;
                }
            }
            break;
        }
        var3_1 = ks.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("haek", gzts(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ks.gztk("hael", gzth(int ), (int)233)) break;
            v2 /* !! */  = (long)ks.gztk("haem", gzth(int ), (int)234);
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("haen", gzts(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ks.gztk("haeo", gzth(int ), (int)235)) {
                var1_3 = ks.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ks.gztk("haep", gzth(int ), (int)236);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return null;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = ks.nw - ks.gztk("haeq", gzts(int ), (int)51)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == ks.gztk("hasv", gzth(int ), (int)237)) {
                            return this.textureView;
                        }
                        v4 /* !! */  = (long)ks.gztk("hasw", gzth(int ), (int)238);
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)ks.gztk("hata", gzth(int ), (int)242);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var2_2 /* !! */  = (int)ks.gztk("hasx", gzth(int ), (int)239);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ks.gztk("hasy", gzth(int ), (int)240);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl63
            break;
        }
        do {
            if (true) ** continue;
lbl63:
            // 2 sources

            var2_2 /* !! */  = (int)ks.gztk("hasz", gzth(int ), (int)241);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static void hbcy() {
        ks.gzti[0] = -2033112435;
        ks.gzti[1] = 287236633;
        ks.gzti[2] = -1840021089;
        ks.gzti[3] = -1053327983;
        ks.gzti[4] = -789031871;
        ks.gzti[5] = -19671434;
        ks.gzti[6] = -1068500958;
        ks.gzti[7] = 2085970656;
        ks.gzti[8] = 1483472726;
        ks.gzti[9] = -1511351553;
        ks.gzti[10] = 1572892647;
        ks.gzti[11] = 1831928469;
        ks.gzti[12] = 2130296396;
        ks.gzti[13] = -1880622802;
        ks.gzti[14] = -295804313;
        ks.gzti[15] = 1319233102;
        ks.gzti[16] = -572195963;
        ks.gzti[17] = -911317184;
        ks.gzti[18] = -255726308;
        ks.gzti[19] = 1458169091;
        ks.gzti[20] = -383219211;
        ks.gzti[21] = -733171047;
        ks.gzti[22] = 1780081012;
        ks.gzti[23] = 1385764242;
        ks.gzti[24] = 785565692;
        ks.gzti[25] = 1342287862;
        ks.gzti[26] = 995278228;
        ks.gzti[27] = 758642484;
        ks.gzti[28] = 501462981;
        ks.gzti[29] = -678557925;
        ks.gzti[30] = -540358996;
        ks.gzti[31] = 1146420994;
        ks.gzti[32] = 1516448762;
        ks.gzti[33] = 1126037782;
        ks.gzti[34] = -136327353;
        ks.gzti[35] = -1205446854;
        ks.gzti[36] = -1093186615;
        ks.gzti[37] = 134488623;
        ks.gzti[38] = 986537056;
        ks.gzti[39] = 934224760;
        ks.gzti[40] = 1463049562;
        ks.gzti[41] = -1926139864;
        ks.gzti[42] = 577035964;
        ks.gzti[43] = 635838237;
        ks.gzti[44] = 1746218487;
        ks.gzti[45] = -821964061;
        ks.gzti[46] = -792391384;
        ks.gzti[47] = -1659353470;
        ks.gzti[48] = -1205006902;
        ks.gzti[49] = 785916191;
        ks.gzti[50] = -1754317027;
        ks.gzti[51] = 1513987624;
        ks.gzti[52] = -1406053643;
        ks.gzti[53] = 1914835293;
        ks.gzti[54] = 883654914;
        ks.gzti[55] = -2099406753;
        ks.gzti[56] = -1226598555;
        ks.gzti[57] = 445083254;
        ks.gzti[58] = 296372539;
        ks.gzti[59] = -2047549326;
        ks.gzti[60] = 1942300400;
        ks.gzti[61] = 2006313418;
        ks.gzti[62] = -740110599;
        ks.gzti[63] = 1193708998;
        ks.gzti[64] = -1097904374;
        ks.gzti[65] = 997011606;
        ks.gzti[66] = -2079116975;
        ks.gzti[67] = -543227089;
        ks.gzti[68] = 1930659803;
        ks.gzti[69] = -33216985;
        ks.gzti[70] = -1908383172;
        ks.gzti[71] = -1716584998;
        ks.gzti[72] = -1545492871;
        ks.gzti[73] = 534931550;
        ks.gzti[74] = 1835085365;
        ks.gzti[75] = 931764611;
        ks.gzti[76] = -515796937;
        ks.gzti[77] = 1940620473;
        ks.gzti[78] = 71366281;
        ks.gzti[79] = -352826162;
        ks.gzti[80] = 821108587;
        ks.gzti[81] = 810777767;
        ks.gzti[82] = 1490808753;
        ks.gzti[83] = -1081859896;
        ks.gzti[84] = 552481109;
        ks.gzti[85] = 28607084;
        ks.gzti[86] = -1723860668;
        ks.gzti[87] = 985901547;
        ks.gzti[88] = -1482682951;
        ks.gzti[89] = -708833803;
        ks.gzti[90] = 1310352505;
        ks.gzti[91] = 57771201;
        ks.gzti[92] = 2033360455;
        ks.gzti[93] = -552095002;
        ks.gzti[94] = 1221343253;
        ks.gzti[95] = -538485935;
        ks.gzti[96] = 2697587;
        ks.gzti[97] = 1966363688;
        ks.gzti[98] = -429665964;
        ks.gzti[99] = -69880511;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isLoaded() {
        v0 /* !! */  = ks.nw;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ks.gztk("hawx", gzts(int ), (int)94));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 147422070: {
                    v1 = ks.gztk("hawy", gzts(int ), (int)95);
                    continue block17;
                }
                case 1568355323: {
                    break block17;
                }
                case 1947817415: {
                    v1 = ks.gztk("hawz", gzts(int ), (int)96);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = ks.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("haxa", gzts(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ks.gztk("haxb", gzth(int ), (int)300)) break;
            v2 /* !! */  = (long)ks.gztk("haxc", gzth(int ), (int)301);
        }
        var2_2 /* !! */  = ks.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("haxd", gzts(int ), (int)98)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ks.gztk("haxe", gzth(int ), (int)302)) break;
            v3 /* !! */  = (long)ks.gztk("haxf", gzth(int ), (int)303);
        }
        var1_3 = ks.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (boolean)ks.gztk("haxg", gzth(int ), (int)304);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ks.nw;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ks.gztk("haxh", gzts(int ), (int)99));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -740151368: {
                            v5 = ks.gztk("haxi", gzts(int ), (int)100);
                            continue block21;
                        }
                        case 709887175: {
                            v5 = ks.gztk("haxj", gzts(int ), (int)101);
                            continue block21;
                        }
                        case 1568355323: {
                            break block21;
                        }
                        case 1864711359: {
                            v5 = ks.gztk("haxk", gzts(int ), (int)102);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.loaded;
            }
lbl55:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ks.gztk("haxl", gzth(int ), (int)305);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ks.gztk("haxm", gzth(int ), (int)306);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ks.gztk("haxn", gzth(int ), (int)307);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ks.gztk("haxo", gzth(int ), (int)308);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getPxRange() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ks.nw - ks.gztk("hava", gzts(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ks.gztk("havb", gzth(int ), (int)270)) break;
            v0 /* !! */  = (long)ks.gztk("havc", gzth(int ), (int)271);
        }
        var3_1 = ks.c;
        while (true) {
            block21: {
                if ((v1 /* !! */  = (cfr_temp_1 = ks.nw - ks.gztk("havd", gzts(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != ks.gztk("have", gzth(int ), (int)272)) break block21;
                var2_2 /* !! */  = ks.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)ks.gztk("havf", gzth(int ), (int)273);
        }
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ks.nw;
                block12: while (true) {
                    switch ((int)v2 /* !! */ ) {
                        case -249682390: {
                            v2 /* !! */  = (long)(ks.gztk("havh", gzts(int ), (int)78) - ks.gztk("havg", gzts(int ), (int)77));
                            continue block12;
                        }
                        case 1568355323: {
                            break block12;
                        }
                    }
                    break;
                }
                var1_3 = ks.a;
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return (float)ks.gztk("havi", hatl(int ), (int)274);
                if (var1_3 != false) return (float)ks.gztk("havi", hatl(int ), (int)274);
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ks.nw - ks.gztk("havj", gzts(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ks.gztk("havk", gzth(int ), (int)275)) {
                        return this.pxRange;
                    }
                    v3 /* !! */  = (long)ks.gztk("havl", gzth(int ), (int)276);
                }
            }
            case 0: {
                ** GOTO lbl49
            }
            case 2: {
                var2_2 /* !! */  = (int)ks.gztk("havo", gzth(int ), (int)279);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var2_2 /* !! */  = (int)ks.gztk("havp", gzth(int ), (int)280);
                if (var3_1) {
                    throw null;
                }
lbl49:
                // 3 sources

                var2_2 /* !! */  = (int)ks.gztk("havm", gzth(int ), (int)277);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)ks.gztk("havn", gzth(int ), (int)278);
        } while (!var3_1);
        throw null;
    }

    private static void hbcz() {
        ks.gzti[100] = 357926313;
        ks.gzti[101] = 611821201;
        ks.gzti[102] = 2004083042;
        ks.gzti[103] = 1406212787;
        ks.gzti[104] = -189009005;
        ks.gzti[105] = -1344400922;
        ks.gzti[106] = 464336634;
        ks.gzti[107] = 1473333384;
        ks.gzti[108] = 1086004490;
        ks.gzti[109] = -1463457698;
        ks.gzti[110] = -660484559;
        ks.gzti[111] = 1145536919;
        ks.gzti[112] = 1582490777;
        ks.gzti[113] = -375451449;
        ks.gzti[114] = -1435694685;
        ks.gzti[115] = -1740819684;
        ks.gzti[116] = 1004272510;
        ks.gzti[117] = -458587893;
        ks.gzti[118] = 1550198348;
        ks.gzti[119] = 775718432;
        ks.gzti[120] = 36532938;
        ks.gzti[121] = -1304479775;
        ks.gzti[122] = 213858121;
        ks.gzti[123] = 1507362882;
        ks.gzti[124] = 374128843;
        ks.gzti[125] = -654601613;
        ks.gzti[126] = -649835894;
        ks.gzti[127] = -1933375601;
        ks.gzti[128] = -1298669132;
        ks.gzti[129] = 1335895566;
        ks.gzti[130] = -1433175109;
        ks.gzti[131] = 951734879;
        ks.gzti[132] = -1323264476;
        ks.gzti[133] = 2058714789;
        ks.gzti[134] = -815786560;
        ks.gzti[135] = 930704242;
        ks.gzti[136] = -1863653565;
        ks.gzti[137] = 1368680313;
        ks.gzti[138] = -673182970;
        ks.gzti[139] = 192508735;
        ks.gzti[140] = 1815114471;
        ks.gzti[141] = 893854025;
        ks.gzti[142] = 866412812;
        ks.gzti[143] = -470071498;
        ks.gzti[144] = 1374494126;
        ks.gzti[145] = -902024746;
        ks.gzti[146] = -1626176128;
        ks.gzti[147] = -792945170;
        ks.gzti[148] = 135346911;
        ks.gzti[149] = -1440114240;
        ks.gzti[150] = -1430450754;
        ks.gzti[151] = -567533306;
        ks.gzti[152] = -1593818339;
        ks.gzti[153] = -2146846479;
        ks.gzti[154] = 590954126;
        ks.gzti[155] = -1910221806;
        ks.gzti[156] = -171793075;
        ks.gzti[157] = -217505966;
        ks.gzti[158] = -50470972;
        ks.gzti[159] = -210945793;
        ks.gzti[160] = 566513753;
        ks.gzti[161] = 818875300;
        ks.gzti[162] = -1700867269;
        ks.gzti[163] = -1950284659;
        ks.gzti[164] = -1537147984;
        ks.gzti[165] = 1375759417;
        ks.gzti[166] = -711897414;
        ks.gzti[167] = 1024484909;
        ks.gzti[168] = 454711332;
        ks.gzti[169] = -948467771;
        ks.gzti[170] = 2144473475;
        ks.gzti[171] = -880336067;
        ks.gzti[172] = 1550033095;
        ks.gzti[173] = 1772664946;
        ks.gzti[174] = 277359854;
        ks.gzti[175] = -291895986;
        ks.gzti[176] = -1984873300;
        ks.gzti[177] = 944690797;
        ks.gzti[178] = -1672204757;
        ks.gzti[179] = 1483958832;
        ks.gzti[180] = -550343641;
        ks.gzti[181] = -855622370;
        ks.gzti[182] = -190526957;
        ks.gzti[183] = -1935412678;
        ks.gzti[184] = 864431710;
        ks.gzti[185] = -1846050401;
        ks.gzti[186] = -43562267;
        ks.gzti[187] = 223417360;
        ks.gzti[188] = 1360778644;
        ks.gzti[189] = -177647077;
        ks.gzti[190] = -1225038006;
        ks.gzti[191] = -109865361;
        ks.gzti[192] = 1493369231;
        ks.gzti[193] = -1284304955;
        ks.gzti[194] = -1195946880;
        ks.gzti[195] = -1084999876;
        ks.gzti[196] = -352981429;
        ks.gzti[197] = 1933841095;
        ks.gzti[198] = -1883115164;
        ks.gzti[199] = -1802173231;
    }

    private static void hbdj() {
        ks.gztu[100] = 4247272141397053096L;
        ks.gztu[101] = 3279972740581989936L;
        ks.gztu[102] = 6267375837710808834L;
        ks.gztu[103] = -885252758884451342L;
        ks.gztu[104] = -5377232871706409000L;
        ks.gztu[105] = 9165672903160726539L;
        ks.gztu[106] = 3939350907325994341L;
        ks.gztu[107] = -2153538514578550142L;
        ks.gztu[108] = 522774134340391469L;
        ks.gztu[109] = 7149164181789736742L;
        ks.gztu[110] = -1896663814966041159L;
        ks.gztu[111] = -3225662466238298077L;
        ks.gztu[112] = -2252012329772408431L;
        ks.gztu[113] = -3676545247039251238L;
        ks.gztu[114] = 7788905296540856711L;
        ks.gztu[115] = 1396844911502608644L;
        ks.gztu[116] = -1556083244991271134L;
        ks.gztu[117] = -1840865792615498584L;
        ks.gztu[118] = 3599185476622190090L;
        ks.gztu[119] = -8550651259852010853L;
        ks.gztu[120] = 7486167279776301812L;
        ks.gztu[121] = -2367028546695372857L;
        ks.gztu[122] = 3933212797954845108L;
        ks.gztu[123] = 1972715134785235018L;
        ks.gztu[124] = 1447097323750793530L;
        ks.gztu[125] = -4609930305216523119L;
        ks.gztu[126] = -1690287684895281593L;
        ks.gztu[127] = -6745519912193419325L;
        ks.gztu[128] = 4856908437487109562L;
        ks.gztu[129] = -8998366063050586583L;
        ks.gztu[130] = 4538742953284403582L;
        ks.gztu[131] = -4283529095266446661L;
        ks.gztu[132] = -7379366732360099202L;
        ks.gztu[133] = -4368004339178212584L;
        ks.gztu[134] = 1879956844708125213L;
        ks.gztu[135] = -5515188897400728677L;
        ks.gztu[136] = 57609139572796979L;
        ks.gztu[137] = -7571719430696674161L;
        ks.gztu[138] = -2966009933101824762L;
        ks.gztu[139] = -1096789480088051142L;
        ks.gztu[140] = -8839965056918705431L;
        ks.gztu[141] = -8460540763864402129L;
        ks.gztu[142] = -7043672232589901205L;
        ks.gztu[143] = -2563306003274487011L;
        ks.gztu[144] = -8495371063915563750L;
        ks.gztu[145] = 6947145019352762888L;
        ks.gztu[146] = 6528791749544963460L;
        ks.gztu[147] = 4633928946794308833L;
        ks.gztu[148] = -7886503850524459827L;
        ks.gztu[149] = 6801249686941280348L;
        ks.gztu[150] = -4675631638930862313L;
        ks.gztu[151] = 7604248800193054177L;
        ks.gztu[152] = 8648335006018757481L;
        ks.gztu[153] = 5847610279874846100L;
        ks.gztu[154] = 6178933667108426873L;
        ks.gztu[155] = -3400577605290510387L;
        ks.gztu[156] = -7657087516069992760L;
    }

    private static void hbdf() {
        ks.gztj[300] = -90662722;
        ks.gztj[301] = -249670958;
        ks.gztj[302] = -1536061472;
        ks.gztj[303] = 347045709;
        ks.gztj[304] = 882933188;
        ks.gztj[305] = -1380116246;
        ks.gztj[306] = -1913505499;
        ks.gztj[307] = 134317726;
        ks.gztj[308] = -2146685015;
        ks.gztj[309] = 2013219381;
        ks.gztj[310] = 1617323917;
        ks.gztj[311] = -1755529639;
        ks.gztj[312] = 1928024510;
        ks.gztj[313] = -1381614284;
        ks.gztj[314] = 182537125;
        ks.gztj[315] = -946237774;
        ks.gztj[316] = 935159046;
        ks.gztj[317] = -680128271;
        ks.gztj[318] = -692116984;
        ks.gztj[319] = -435490327;
        ks.gztj[320] = -640798924;
        ks.gztj[321] = -1038928137;
        ks.gztj[322] = 1945542002;
        ks.gztj[323] = -1670190761;
        ks.gztj[324] = -386076661;
        ks.gztj[325] = -142842810;
        ks.gztj[326] = 1861735822;
        ks.gztj[327] = 931303793;
        ks.gztj[328] = -1442546322;
        ks.gztj[329] = 856521338;
        ks.gztj[330] = -1960294433;
        ks.gztj[331] = 1942605306;
        ks.gztj[332] = 497641035;
        ks.gztj[333] = -1670702354;
        ks.gztj[334] = -2033224839;
        ks.gztj[335] = 1229216178;
        ks.gztj[336] = 1319065708;
        ks.gztj[337] = 1863184247;
        ks.gztj[338] = 327748819;
        ks.gztj[339] = 1115400019;
        ks.gztj[340] = 1673237238;
        ks.gztj[341] = -1391020951;
        ks.gztj[342] = -19209597;
        ks.gztj[343] = 314163886;
        ks.gztj[344] = 253041336;
        ks.gztj[345] = 1954019420;
        ks.gztj[346] = -1208640596;
        ks.gztj[347] = 1471467842;
        ks.gztj[348] = 1884049516;
        ks.gztj[349] = -1405454615;
        ks.gztj[350] = -594058176;
        ks.gztj[351] = 1200688748;
        ks.gztj[352] = 605166903;
        ks.gztj[353] = 47255434;
        ks.gztj[354] = -590203743;
        ks.gztj[355] = -882282493;
        ks.gztj[356] = 1404582927;
        ks.gztj[357] = 2030925751;
        ks.gztj[358] = -200864798;
        ks.gztj[359] = 2044262094;
        ks.gztj[360] = -1683795436;
        ks.gztj[361] = -1563327287;
        ks.gztj[362] = -119055369;
        ks.gztj[363] = 821975125;
        ks.gztj[364] = 1007111047;
        ks.gztj[365] = 888914769;
        ks.gztj[366] = 836052460;
        ks.gztj[367] = -2032192723;
        ks.gztj[368] = 1373082383;
        ks.gztj[369] = 793689022;
        ks.gztj[370] = -220909659;
        ks.gztj[371] = 1910879683;
        ks.gztj[372] = 166171367;
        ks.gztj[373] = 1429963101;
        ks.gztj[374] = 294497971;
        ks.gztj[375] = -2141341979;
        ks.gztj[376] = -555579296;
        ks.gztj[377] = -497894697;
        ks.gztj[378] = 387147217;
        ks.gztj[379] = -1521771076;
        ks.gztj[380] = 1413941647;
        ks.gztj[381] = -1760305366;
        ks.gztj[382] = -799389201;
        ks.gztj[383] = 1931649877;
        ks.gztj[384] = 321587022;
        ks.gztj[385] = 1816797993;
        ks.gztj[386] = 431858884;
        ks.gztj[387] = -856233472;
        ks.gztj[388] = -1039289842;
        ks.gztj[389] = 600408779;
        ks.gztj[390] = 1205898806;
        ks.gztj[391] = -1519173217;
        ks.gztj[392] = -336289185;
        ks.gztj[393] = -524190679;
    }
}

