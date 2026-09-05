/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.d;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.eh;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.ot;

public class gh
extends ds {
    kf typeMatrix;
    public kf mode;
    kf directionMode;
    public static final boolean a;
    private static long[] efxk;
    private int grimPointIndex;
    ke setting;
    kg speed;
    private static final class_310 mc;
    public static final int b;
    kg radius;
    private static long[] efxj;
    kg grimRadius;
    private static int[] efwi;
    kf type;
    private static int[] efwj;
    public static final boolean c;
    private static final long kp = 3505397609600333075L;

    private static /* synthetic */ void ehjp() {
        gh.efxk[100] = 6960425432859165230L;
        gh.efxk[101] = -5702335093925232375L;
        gh.efxk[102] = 388173075833666176L;
        gh.efxk[103] = -8531047235366957597L;
        gh.efxk[104] = 6820669806484886818L;
        gh.efxk[105] = 5984015719223112490L;
        gh.efxk[106] = 5334818572599958671L;
        gh.efxk[107] = -2334207409599332515L;
        gh.efxk[108] = -1690622318224272537L;
        gh.efxk[109] = -1671142755267006532L;
        gh.efxk[110] = -7630334862503209734L;
        gh.efxk[111] = 7272113782387747861L;
        gh.efxk[112] = 5627686303811189227L;
        gh.efxk[113] = 6419505138755851035L;
        gh.efxk[114] = -575497422272586446L;
        gh.efxk[115] = -2608014093090134254L;
        gh.efxk[116] = 3372897730798595307L;
        gh.efxk[117] = -777967201054741607L;
        gh.efxk[118] = -2585827275320239368L;
        gh.efxk[119] = -6694812920400202326L;
        gh.efxk[120] = -8276940285805741801L;
        gh.efxk[121] = 6509949663042494900L;
        gh.efxk[122] = -1851841142352795768L;
        gh.efxk[123] = -2308100486619570791L;
        gh.efxk[124] = 4732999884237815532L;
        gh.efxk[125] = 9086653902754198521L;
        gh.efxk[126] = 1768098623234974098L;
        gh.efxk[127] = -8859019112233725069L;
        gh.efxk[128] = 7450387829134959559L;
        gh.efxk[129] = -1059100725770642948L;
        gh.efxk[130] = -4414658953727391621L;
        gh.efxk[131] = -795114854684667262L;
        gh.efxk[132] = 4107731577742911380L;
        gh.efxk[133] = -7258438130315617775L;
        gh.efxk[134] = 8349795579504536986L;
        gh.efxk[135] = -5060390928110782121L;
        gh.efxk[136] = 3218693331550847404L;
        gh.efxk[137] = 1002186220182561725L;
        gh.efxk[138] = -6627944199642776492L;
        gh.efxk[139] = 7147842239876616720L;
        gh.efxk[140] = 4635855415637646268L;
        gh.efxk[141] = -3783413453562533718L;
        gh.efxk[142] = -439963887119573833L;
        gh.efxk[143] = -7909767213018521997L;
        gh.efxk[144] = -6484922471996424385L;
        gh.efxk[145] = -4526594746556385000L;
        gh.efxk[146] = -1041079044748344113L;
        gh.efxk[147] = -3020769351580470921L;
        gh.efxk[148] = -4701702099051139961L;
        gh.efxk[149] = 125104899525320936L;
        gh.efxk[150] = -9174931428081408975L;
        gh.efxk[151] = 284959710151851342L;
        gh.efxk[152] = -667468505101430021L;
        gh.efxk[153] = 2594898669495986494L;
        gh.efxk[154] = 8876102308631863050L;
        gh.efxk[155] = -7169213447346536262L;
        gh.efxk[156] = 8495171539367100750L;
        gh.efxk[157] = -5841392888288239671L;
        gh.efxk[158] = 535933759700538710L;
        gh.efxk[159] = -2041827158901905960L;
        gh.efxk[160] = -2995324829059056705L;
        gh.efxk[161] = 83114292080692137L;
        gh.efxk[162] = -1198875823090084156L;
        gh.efxk[163] = 6891854771298436088L;
        gh.efxk[164] = -8219788835127568572L;
        gh.efxk[165] = -4452017139721210902L;
        gh.efxk[166] = -5492833570947326449L;
        gh.efxk[167] = -5189021411529379876L;
        gh.efxk[168] = -9126687635571628478L;
        gh.efxk[169] = 6283036667858627361L;
        gh.efxk[170] = 7125078678834086625L;
        gh.efxk[171] = 8377933789712569350L;
        gh.efxk[172] = -6875280285467580094L;
        gh.efxk[173] = -6322789064580898030L;
        gh.efxk[174] = -682048881695040528L;
        gh.efxk[175] = 6721737137537735311L;
        gh.efxk[176] = -8439321043162193967L;
        gh.efxk[177] = -1074300380859179126L;
        gh.efxk[178] = 1356490313709166881L;
        gh.efxk[179] = -868921757984198172L;
        gh.efxk[180] = 1306815694813555849L;
        gh.efxk[181] = -5574306927090530169L;
        gh.efxk[182] = -3946968720713908842L;
        gh.efxk[183] = -381636248419451233L;
        gh.efxk[184] = 690779197140541945L;
        gh.efxk[185] = -3099193831182574564L;
        gh.efxk[186] = -3954204589176998031L;
        gh.efxk[187] = 1652402995279526572L;
        gh.efxk[188] = -3198075817569740667L;
        gh.efxk[189] = -3941549024260116131L;
        gh.efxk[190] = -5017000508192769721L;
        gh.efxk[191] = -2860265481436374262L;
        gh.efxk[192] = 8097247638045426954L;
        gh.efxk[193] = 6050870460443350546L;
        gh.efxk[194] = -8694733906113180997L;
        gh.efxk[195] = -4277741058518704074L;
        gh.efxk[196] = 965784931958986885L;
        gh.efxk[197] = -3015759663749409513L;
        gh.efxk[198] = -926853325037065808L;
        gh.efxk[199] = 3131925193192495980L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processMatrixFrontStrafe(class_1309 var1_1, class_243 var2_2, class_243 var3_3, double var4_4, int var6_5) {
        v0 /* !! */  = gh.kp;
        if (true) ** GOTO lbl5
        block108: while (true) {
            v0 /* !! */  = (long)(v1 - gh.efwk("egso", efxi(int ), (int)163));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1369780051: {
                    v1 = gh.efwk("egsp", efxi(int ), (int)164);
                    continue block108;
                }
                case -1262799597: {
                    break block108;
                }
                case -1108875907: {
                    v1 = gh.efwk("egsq", efxi(int ), (int)165);
                    continue block108;
                }
                case -240324613: {
                    v1 = gh.efwk("egsr", efxi(int ), (int)166);
                    continue block108;
                }
            }
            break;
        }
        var17_6 = gh.c;
        v2 /* !! */  = gh.kp;
        if (true) ** GOTO lbl22
        block109: while (true) {
            v2 /* !! */  = (long)(v3 - gh.efwk("egss", efxi(int ), (int)167));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1262799597: {
                    break block109;
                }
                case -1173734032: {
                    v3 = gh.efwk("egst", efxi(int ), (int)168);
                    continue block109;
                }
                case 720627641: {
                    v3 = gh.efwk("egsu", efxi(int ), (int)169);
                    continue block109;
                }
                case 1555669409: {
                    v3 = gh.efwk("egsv", efxi(int ), (int)170);
                    continue block109;
                }
            }
            break;
        }
        var16_7 /* !! */  = gh.b;
        v4 /* !! */  = gh.kp;
        if (true) ** GOTO lbl39
        block110: while (true) {
            v4 /* !! */  = (long)(gh.efwk("egsx", efxi(int ), (int)172) - gh.efwk("egsw", efxi(int ), (int)171));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1799361544: {
                    continue block110;
                }
                case -1262799597: {
                    break block110;
                }
            }
            break;
        }
        var15_8 = gh.a;
        if (var17_6) {
            throw null;
lbl47:
            // 8 sources

            return;
        }
        if (var15_8 || var15_8) ** GOTO lbl47
        v5 /* !! */  = gh.kp;
        if (true) ** GOTO lbl54
        block112: while (true) {
            v5 /* !! */  = (long)(v6 - gh.efwk("egsy", efxi(int ), (int)173));
lbl54:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1461932561: {
                    v6 = gh.efwk("egsz", efxi(int ), (int)174);
                    continue block112;
                }
                case -1365757185: {
                    v6 = gh.efwk("egta", efxi(int ), (int)175);
                    continue block112;
                }
                case -1262799597: {
                    break block112;
                }
            }
            break;
        }
        var7_9 = var1_1.method_36454();
        if (var15_8 || var15_8) ** GOTO lbl47
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("egtb", efxi(int ), (int)176)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == gh.efwk("egtc", efwt(int ), (int)407)) break;
            v7 /* !! */  = (long)gh.efwk("egtd", efwt(int ), (int)408);
        }
        v8 = var3_3.field_1352;
        v9 = var7_9;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("egte", efxi(int ), (int)177)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gh.efwk("egtf", efwt(int ), (int)409)) break;
            v10 /* !! */  = (long)gh.efwk("egtg", efwt(int ), (int)410);
        }
        v11 = Math.toRadians(v9);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("egth", efxi(int ), (int)178)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gh.efwk("egti", efwt(int ), (int)411)) break;
            v12 /* !! */  = (long)gh.efwk("egtj", efwt(int ), (int)412);
        }
        var8_10 = v8 - Math.sin(v11) * var4_4 * (double)var6_5;
        if (var15_8) ** GOTO lbl47
        if (var16_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_8) ** GOTO lbl47
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("egtk", efxi(int ), (int)179)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gh.efwk("egtl", efwt(int ), (int)413)) break;
                    v13 /* !! */  = (long)gh.efwk("egtm", efwt(int ), (int)414);
                }
                v14 = var3_3.field_1350;
                v15 = var7_9;
                v16 /* !! */  = gh.kp;
                if (true) ** GOTO lbl100
                block117: while (true) {
                    v16 /* !! */  = (long)(v17 - gh.efwk("egtn", efxi(int ), (int)180));
lbl100:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1262799597: {
                            break block117;
                        }
                        case 1867606773: {
                            v17 = gh.efwk("egto", efxi(int ), (int)181);
                            continue block117;
                        }
                        case 2080031557: {
                            v17 = gh.efwk("egtp", efxi(int ), (int)182);
                            continue block117;
                        }
                    }
                    break;
                }
                v18 = Math.toRadians(v15);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("egtq", efxi(int ), (int)183)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == gh.efwk("egtr", efwt(int ), (int)415)) break;
                    v19 /* !! */  = (long)gh.efwk("egts", efwt(int ), (int)416);
                }
                var10_11 = v14 + Math.cos(v18) * var4_4 * (double)var6_5;
                if (var15_8 || var15_8) ** GOTO lbl47
                v20 /* !! */  = gh.kp;
                if (true) ** GOTO lbl121
                block119: while (true) {
                    v20 /* !! */  = (long)(v21 - gh.efwk("egtt", efxi(int ), (int)184));
lbl121:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1262799597: {
                            break block119;
                        }
                        case -985528082: {
                            v21 = gh.efwk("egtu", efxi(int ), (int)185);
                            continue block119;
                        }
                        case 1426583715: {
                            v21 = gh.efwk("egtv", efxi(int ), (int)186);
                            continue block119;
                        }
                        case 1638939726: {
                            v21 = gh.efwk("egtw", efxi(int ), (int)187);
                            continue block119;
                        }
                    }
                    break;
                }
                v22 = var10_11 - var2_2.field_1350;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = gh.kp - gh.efwk("egtx", efxi(int ), (int)188)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == gh.efwk("egty", efwt(int ), (int)417)) break;
                    v23 /* !! */  = (long)gh.efwk("egtz", efwt(int ), (int)418);
                }
                v24 = var8_10 - var2_2.field_1352;
                v25 /* !! */  = gh.kp;
                if (true) ** GOTO lbl144
                block121: while (true) {
                    v25 /* !! */  = (long)(v26 - gh.efwk("egua", efxi(int ), (int)189));
lbl144:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1262799597: {
                            break block121;
                        }
                        case -318802944: {
                            v26 = gh.efwk("egub", efxi(int ), (int)190);
                            continue block121;
                        }
                        case -73099407: {
                            v26 = gh.efwk("eguc", efxi(int ), (int)191);
                            continue block121;
                        }
                        case 1493432494: {
                            v26 = gh.efwk("egud", efxi(int ), (int)192);
                            continue block121;
                        }
                    }
                    break;
                }
                v27 = Math.atan2(v22, v24);
                v28 /* !! */  = gh.kp;
                if (true) ** GOTO lbl161
                block122: while (true) {
                    v28 /* !! */  = (long)(gh.efwk("eguf", efxi(int ), (int)194) - gh.efwk("egue", efxi(int ), (int)193));
lbl161:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1262799597: {
                            break block122;
                        }
                        case 166512925: {
                            continue block122;
                        }
                    }
                    break;
                }
                var12_12 = (float)Math.toDegrees(v27) - gh.efwk("egug", efwh(int ), (int)419);
                if (var15_8 || var15_8) ** GOTO lbl47
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_6 = gh.kp - gh.efwk("eguh", efxi(int ), (int)195)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == gh.efwk("egui", efwt(int ), (int)420)) break;
                    v29 /* !! */  = (long)gh.efwk("eguj", efwt(int ), (int)421);
                }
                v30 /* !! */  = gh.kp;
                if (true) ** GOTO lbl177
                block124: while (true) {
                    v30 /* !! */  = (long)(gh.efwk("egul", efxi(int ), (int)197) - gh.efwk("eguk", efxi(int ), (int)196));
lbl177:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1262799597: {
                            break block124;
                        }
                        case -474271667: {
                            continue block124;
                        }
                    }
                    break;
                }
                var13_13 = this.speed.getValue();
                if (var15_8 || var15_8) ** GOTO lbl47
                v31 /* !! */  = gh.kp;
                if (true) ** GOTO lbl188
                block125: while (true) {
                    v31 /* !! */  = (long)(v32 - gh.efwk("egum", efxi(int ), (int)198));
lbl188:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1262799597: {
                            break block125;
                        }
                        case -483310972: {
                            v32 = gh.efwk("egun", efxi(int ), (int)199);
                            continue block125;
                        }
                        case 129407630: {
                            v32 = gh.efwk("eguo", efxi(int ), (int)200);
                            continue block125;
                        }
                        case 2078766463: {
                            v32 = gh.efwk("egup", efxi(int ), (int)201);
                            continue block125;
                        }
                    }
                    break;
                }
                v33 /* !! */  = gh.kp;
                if (true) ** GOTO lbl204
                block126: while (true) {
                    v33 /* !! */  = (long)(v34 - gh.efwk("eguq", efxi(int ), (int)202));
lbl204:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1487473322: {
                            v34 = gh.efwk("egur", efxi(int ), (int)203);
                            continue block126;
                        }
                        case -1262799597: {
                            break block126;
                        }
                        case 473544030: {
                            v34 = gh.efwk("egus", efxi(int ), (int)204);
                            continue block126;
                        }
                        case 2036326886: {
                            v34 = gh.efwk("egut", efxi(int ), (int)205);
                            continue block126;
                        }
                    }
                    break;
                }
                v35 = gh.mc.field_1724;
                v36 = var12_12;
                v37 /* !! */  = gh.kp;
                if (true) ** GOTO lbl222
                block127: while (true) {
                    v37 /* !! */  = (long)(v38 - gh.efwk("eguu", efxi(int ), (int)206));
lbl222:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -1864550797: {
                            v38 = gh.efwk("eguv", efxi(int ), (int)207);
                            continue block127;
                        }
                        case -1262799597: {
                            break block127;
                        }
                        case -440008342: {
                            v38 = gh.efwk("eguw", efxi(int ), (int)208);
                            continue block127;
                        }
                        case 507870688: {
                            v38 = gh.efwk("egux", efxi(int ), (int)209);
                            continue block127;
                        }
                    }
                    break;
                }
                v39 = Math.toRadians(v36);
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_7 = gh.kp - gh.efwk("eguy", efxi(int ), (int)210)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == gh.efwk("eguz", efwt(int ), (int)422)) break;
                    v40 /* !! */  = (long)gh.efwk("egva", efwt(int ), (int)423);
                }
                v41 = -Math.sin(v39) * var13_13;
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_8 = gh.kp - gh.efwk("egvb", efxi(int ), (int)211)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == gh.efwk("egvc", efwt(int ), (int)424)) break;
                    v42 /* !! */  = (long)gh.efwk("egvd", efwt(int ), (int)425);
                }
                v43 /* !! */  = gh.kp;
                if (true) ** GOTO lbl250
                block130: while (true) {
                    v43 /* !! */  = (long)(v44 - gh.efwk("egve", efxi(int ), (int)212));
lbl250:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1262799597: {
                            break block130;
                        }
                        case -54930780: {
                            v44 = gh.efwk("egvf", efxi(int ), (int)213);
                            continue block130;
                        }
                        case 215381377: {
                            v44 = gh.efwk("egvg", efxi(int ), (int)214);
                            continue block130;
                        }
                    }
                    break;
                }
                v45 = gh.mc.field_1724;
                v46 /* !! */  = gh.kp;
                if (true) ** GOTO lbl264
                block131: while (true) {
                    v46 /* !! */  = (long)(v47 - gh.efwk("egvh", efxi(int ), (int)215));
lbl264:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -1742832393: {
                            v47 = gh.efwk("egvi", efxi(int ), (int)216);
                            continue block131;
                        }
                        case -1262799597: {
                            break block131;
                        }
                        case 1188546624: {
                            v47 = gh.efwk("egvj", efxi(int ), (int)217);
                            continue block131;
                        }
                        case 2110412821: {
                            v47 = gh.efwk("egvk", efxi(int ), (int)218);
                            continue block131;
                        }
                    }
                    break;
                }
                v48 = v45.method_18798();
                v49 /* !! */  = gh.kp;
                if (true) ** GOTO lbl281
                block132: while (true) {
                    v49 /* !! */  = (long)(gh.efwk("egvm", efxi(int ), (int)220) - gh.efwk("egvl", efxi(int ), (int)219));
lbl281:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1262799597: {
                            break block132;
                        }
                        case 1221889613: {
                            continue block132;
                        }
                    }
                    break;
                }
                v50 = v48.field_1351;
                v51 = var12_12;
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_9 = gh.kp - gh.efwk("egvn", efxi(int ), (int)221)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == gh.efwk("egvo", efwt(int ), (int)426)) break;
                    v52 /* !! */  = (long)gh.efwk("egvp", efwt(int ), (int)427);
                }
                v53 = Math.toRadians(v51);
                v54 /* !! */  = gh.kp;
                if (true) ** GOTO lbl298
                block134: while (true) {
                    v54 /* !! */  = (long)(v55 - gh.efwk("egvq", efxi(int ), (int)222));
lbl298:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -1965324094: {
                            v55 = gh.efwk("egvr", efxi(int ), (int)223);
                            continue block134;
                        }
                        case -1262799597: {
                            break block134;
                        }
                        case -1181855767: {
                            v55 = gh.efwk("egvs", efxi(int ), (int)224);
                            continue block134;
                        }
                    }
                    break;
                }
                v56 = Math.cos(v53) * var13_13;
                v57 /* !! */  = gh.kp;
                if (true) ** GOTO lbl312
                block135: while (true) {
                    v57 /* !! */  = (long)(v58 - gh.efwk("egvt", efxi(int ), (int)225));
lbl312:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -1262799597: {
                            break block135;
                        }
                        case -738430124: {
                            v58 = gh.efwk("egvu", efxi(int ), (int)226);
                            continue block135;
                        }
                        case 271000062: {
                            v58 = gh.efwk("egvv", efxi(int ), (int)227);
                            continue block135;
                        }
                        case 1195607653: {
                            v58 = gh.efwk("egvw", efxi(int ), (int)228);
                            continue block135;
                        }
                    }
                    break;
                }
                v35.method_18800(v41, v50, v56);
                if (!var15_8 && !var15_8) ** break;
                ** continue;
                return;
            }
lbl328:
            // 2 sources

            case 0: {
                var16_7 /* !! */  = (int)gh.efwk("egvx", efwt(int ), (int)428);
                if (var17_6) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 1: {
                var16_7 /* !! */  = (int)gh.efwk("egvy", efwt(int ), (int)429);
                if (var17_6) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 2: {
                var16_7 /* !! */  = (int)gh.efwk("egvz", efwt(int ), (int)430);
                if (var17_6) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 3: {
                var16_7 /* !! */  = (int)gh.efwk("egwa", efwt(int ), (int)431);
                if (var17_6) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl348:
            // 3 sources

            case 4: {
                do {
                    var16_7 /* !! */  = (int)gh.efwk("egwb", efwt(int ), (int)432);
                } while (!var17_6);
                throw null;
            }
            case 5: {
                var16_7 /* !! */  = (int)gh.efwk("egwc", efwt(int ), (int)433);
                if (var17_6) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl358:
            // 2 sources

            case 6: {
                var16_7 /* !! */  = (int)gh.efwk("egwd", efwt(int ), (int)434);
                if (!var17_6) ** GOTO lbl328
                throw null;
            }
lbl362:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_7 /* !! */  = (int)gh.efwk("egwe", efwt(int ), (int)435);
                    if (var17_6) {
                        throw null;
                    }
                    ** GOTO lbl377
                    break;
                }
            }
lbl368:
            // 2 sources

            case 8: {
                var16_7 /* !! */  = (int)gh.efwk("egwf", efwt(int ), (int)436);
                if (!var17_6) ** GOTO lbl362
                throw null;
            }
lbl372:
            // 2 sources

            case 9: {
                var16_7 /* !! */  = (int)gh.efwk("egwg", efwt(int ), (int)437);
                if (var17_6) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl377:
            // 2 sources

            case 10: {
                var16_7 /* !! */  = (int)gh.efwk("egwh", efwt(int ), (int)438);
                if (!var17_6) ** GOTO lbl372
                throw null;
            }
lbl381:
            // 2 sources

            case 11: {
                var16_7 /* !! */  = (int)gh.efwk("egwi", efwt(int ), (int)439);
                if (!var17_6) ** GOTO lbl358
                throw null;
            }
            case 12: {
                var16_7 /* !! */  = (int)gh.efwk("egwj", efwt(int ), (int)440);
                if (var17_6) {
                    throw null;
                }
            }
lbl389:
            // 4 sources

            case 13: {
                do {
                    var16_7 /* !! */  = (int)gh.efwk("egwk", efwt(int ), (int)441);
                } while (!var17_6);
                throw null;
            }
lbl394:
            // 2 sources

            case 14: {
                do {
                    var16_7 /* !! */  = (int)gh.efwk("egwl", efwt(int ), (int)442);
                } while (!var17_6);
                throw null;
            }
            case 15: 
        }
        var16_7 /* !! */  = (int)gh.efwk("egwm", efwt(int ), (int)443);
        ** while (!var17_6)
lbl402:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehjk() {
        gh.efxj[0] = -7788373599884679057L;
        gh.efxj[1] = -2379288612491877059L;
        gh.efxj[2] = -6156603608366980811L;
        gh.efxj[3] = -1304138978370239857L;
        gh.efxj[4] = 2808628442432072610L;
        gh.efxj[5] = -5443887332077973153L;
        gh.efxj[6] = 3149017135229034697L;
        gh.efxj[7] = 8562331349656060436L;
        gh.efxj[8] = -2886124847000945590L;
        gh.efxj[9] = 4828191066170539468L;
        gh.efxj[10] = 8960132474592007473L;
        gh.efxj[11] = 6711499500663062474L;
        gh.efxj[12] = 474582799608920903L;
        gh.efxj[13] = 13140915861601499L;
        gh.efxj[14] = -5324546215504047569L;
        gh.efxj[15] = 3981116051873725908L;
        gh.efxj[16] = -4073552737574238945L;
        gh.efxj[17] = 3526313492139541459L;
        gh.efxj[18] = 4443786920057193501L;
        gh.efxj[19] = 5642167732233000245L;
        gh.efxj[20] = 64420937464089748L;
        gh.efxj[21] = -1161669735215813771L;
        gh.efxj[22] = 712369312492704986L;
        gh.efxj[23] = -8506234096534101032L;
        gh.efxj[24] = -4246627220743803595L;
        gh.efxj[25] = -7038828942622203893L;
        gh.efxj[26] = -1634308960924469134L;
        gh.efxj[27] = -7032229187051046063L;
        gh.efxj[28] = 3428917375739521264L;
        gh.efxj[29] = 637423719720581256L;
        gh.efxj[30] = 8557980834039588689L;
        gh.efxj[31] = -7638252010304361634L;
        gh.efxj[32] = -8510598193787122269L;
        gh.efxj[33] = -4321984304058581570L;
        gh.efxj[34] = -16043918960699480L;
        gh.efxj[35] = -4489561793537256985L;
        gh.efxj[36] = 3807168937103179277L;
        gh.efxj[37] = -8057654483766615363L;
        gh.efxj[38] = 6163934324820727429L;
        gh.efxj[39] = 5074775556134153324L;
        gh.efxj[40] = 6388463999875243952L;
        gh.efxj[41] = 524862686701441430L;
        gh.efxj[42] = 7584349805199420285L;
        gh.efxj[43] = -6827164336762627745L;
        gh.efxj[44] = -2287600974600121859L;
        gh.efxj[45] = 6862275917159721125L;
        gh.efxj[46] = -2528472091511684401L;
        gh.efxj[47] = -1403380192290731104L;
        gh.efxj[48] = -7195785916454490156L;
        gh.efxj[49] = 6598599080787598985L;
        gh.efxj[50] = -8393152528861043170L;
        gh.efxj[51] = -3160715676482835713L;
        gh.efxj[52] = -122548436963226157L;
        gh.efxj[53] = -3173595047957650847L;
        gh.efxj[54] = -6153226145573417269L;
        gh.efxj[55] = -3508410686979173539L;
        gh.efxj[56] = -8917091788928986510L;
        gh.efxj[57] = -1830593000696845778L;
        gh.efxj[58] = -9094032909361177020L;
        gh.efxj[59] = 2365608061271415805L;
        gh.efxj[60] = -5610417416090196913L;
        gh.efxj[61] = -4166493398135107224L;
        gh.efxj[62] = -4946485617204437020L;
        gh.efxj[63] = -3000524913222450087L;
        gh.efxj[64] = 5510116239090558121L;
        gh.efxj[65] = -4135412150674736499L;
        gh.efxj[66] = -1729680546399468240L;
        gh.efxj[67] = -2325212488354434231L;
        gh.efxj[68] = 3545359493749840204L;
        gh.efxj[69] = -342999727641178058L;
        gh.efxj[70] = 2752095334314968018L;
        gh.efxj[71] = -3670114782640464579L;
        gh.efxj[72] = 1255991207606331456L;
        gh.efxj[73] = 8073749345330578424L;
        gh.efxj[74] = -5280406104458009851L;
        gh.efxj[75] = 5951092306023936613L;
        gh.efxj[76] = -4879294108546685741L;
        gh.efxj[77] = -25630711745346602L;
        gh.efxj[78] = -7730614141518792187L;
        gh.efxj[79] = -3030355658514819798L;
        gh.efxj[80] = -2842511377844153280L;
        gh.efxj[81] = -7837938035792704607L;
        gh.efxj[82] = 3829993119287020123L;
        gh.efxj[83] = 1712899024569005078L;
        gh.efxj[84] = -2282118301603005791L;
        gh.efxj[85] = 3855541349414861341L;
        gh.efxj[86] = -1570108272137477056L;
        gh.efxj[87] = -5061226952997529703L;
        gh.efxj[88] = 5006764342007723172L;
        gh.efxj[89] = 7923938638240489537L;
        gh.efxj[90] = -7510264755882388159L;
        gh.efxj[91] = 2258507571426344178L;
        gh.efxj[92] = 7611419024199879039L;
        gh.efxj[93] = -7237342796018323711L;
        gh.efxj[94] = -2513842743287035330L;
        gh.efxj[95] = 7805892810801917083L;
        gh.efxj[96] = -5270216565962903250L;
        gh.efxj[97] = 2427221959258312912L;
        gh.efxj[98] = 4924412551639039185L;
        gh.efxj[99] = -6428283427913068089L;
    }

    private static /* synthetic */ float efwh(int n2) {
        return Float.intBitsToFloat(efwi[n2] ^ efwj[n2]);
    }

    private static /* synthetic */ void ehji() {
        gh.efwj[500] = -468157657;
        gh.efwj[501] = -1817988134;
        gh.efwj[502] = 899049417;
        gh.efwj[503] = 2000594038;
        gh.efwj[504] = -666094743;
        gh.efwj[505] = -188068071;
        gh.efwj[506] = 864780590;
        gh.efwj[507] = -951372561;
        gh.efwj[508] = -690528202;
        gh.efwj[509] = 1941134806;
        gh.efwj[510] = -1002271543;
        gh.efwj[511] = 2146075290;
        gh.efwj[512] = -1218717337;
        gh.efwj[513] = 509191136;
        gh.efwj[514] = 287215541;
        gh.efwj[515] = 247114887;
        gh.efwj[516] = 238788411;
        gh.efwj[517] = 1622429032;
        gh.efwj[518] = -685088734;
        gh.efwj[519] = -922161354;
        gh.efwj[520] = -710421022;
        gh.efwj[521] = -1878509888;
        gh.efwj[522] = -81320484;
        gh.efwj[523] = -295175139;
        gh.efwj[524] = -1249130827;
        gh.efwj[525] = -1145734696;
        gh.efwj[526] = 1732039801;
        gh.efwj[527] = 1766151394;
        gh.efwj[528] = 328707732;
        gh.efwj[529] = 528629578;
        gh.efwj[530] = 666545438;
        gh.efwj[531] = -1102439007;
        gh.efwj[532] = 2020933080;
        gh.efwj[533] = -1953104561;
        gh.efwj[534] = 1876468187;
        gh.efwj[535] = -2002290459;
        gh.efwj[536] = -509983158;
        gh.efwj[537] = -785131349;
        gh.efwj[538] = -32223373;
        gh.efwj[539] = -150208678;
        gh.efwj[540] = 1555046495;
        gh.efwj[541] = -1776877019;
        gh.efwj[542] = -1036550099;
        gh.efwj[543] = 1713253436;
        gh.efwj[544] = 1208231506;
        gh.efwj[545] = -1882563700;
        gh.efwj[546] = -1754989619;
        gh.efwj[547] = -559507684;
        gh.efwj[548] = 266988790;
        gh.efwj[549] = -592761919;
        gh.efwj[550] = 406308763;
        gh.efwj[551] = 379607386;
        gh.efwj[552] = 1400102026;
        gh.efwj[553] = -1992644619;
        gh.efwj[554] = 128003133;
        gh.efwj[555] = 1536114871;
        gh.efwj[556] = 854369433;
        gh.efwj[557] = 356815988;
        gh.efwj[558] = -223670078;
        gh.efwj[559] = -284414808;
        gh.efwj[560] = -268318154;
        gh.efwj[561] = 1369463608;
        gh.efwj[562] = -869317492;
        gh.efwj[563] = 965550959;
        gh.efwj[564] = -1623489627;
        gh.efwj[565] = -286396978;
        gh.efwj[566] = 0x190010;
        gh.efwj[567] = -1190889537;
        gh.efwj[568] = -762757620;
        gh.efwj[569] = -344385618;
        gh.efwj[570] = 57243032;
        gh.efwj[571] = 187887293;
        gh.efwj[572] = -33106813;
        gh.efwj[573] = 1230727704;
        gh.efwj[574] = -1516755086;
        gh.efwj[575] = -1209937728;
        gh.efwj[576] = 983781260;
        gh.efwj[577] = 1016266213;
        gh.efwj[578] = -1364900473;
        gh.efwj[579] = -1633904053;
        gh.efwj[580] = 1619050368;
        gh.efwj[581] = -1737982460;
        gh.efwj[582] = -779240641;
        gh.efwj[583] = 420787068;
        gh.efwj[584] = -1821291450;
        gh.efwj[585] = -1182067060;
        gh.efwj[586] = -1717922508;
        gh.efwj[587] = 983409953;
        gh.efwj[588] = -2054433967;
        gh.efwj[589] = 1406431834;
        gh.efwj[590] = -751384794;
        gh.efwj[591] = -153671489;
        gh.efwj[592] = 653335814;
        gh.efwj[593] = -697585366;
        gh.efwj[594] = -703607950;
        gh.efwj[595] = -642888928;
        gh.efwj[596] = 449597565;
        gh.efwj[597] = 1037231459;
        gh.efwj[598] = 1879547094;
        gh.efwj[599] = 2038027026;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$2() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("ehfj", efxi(int ), (int)333)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gh.efwk("ehfk", efwt(int ), (int)570)) break;
            v0 /* !! */  = (long)gh.efwk("ehfl", efwt(int ), (int)571);
        }
        var3_1 = gh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("ehfm", efxi(int ), (int)334)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gh.efwk("ehfn", efwt(int ), (int)572)) break;
            v1 /* !! */  = (long)gh.efwk("ehfo", efwt(int ), (int)573);
        }
        var2_2 /* !! */  = gh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("ehfp", efxi(int ), (int)335)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gh.efwk("ehfq", efwt(int ), (int)574)) break;
            v2 /* !! */  = (long)gh.efwk("ehfr", efwt(int ), (int)575);
        }
        var1_3 = gh.a;
        if (var3_1) {
            throw null;
lbl24:
            // 6 sources

            return null;
        }
        if (var1_3 || var1_3) ** GOTO lbl24
        v3 /* !! */  = gh.kp;
        if (true) ** GOTO lbl31
        block34: while (true) {
            v3 /* !! */  = (long)(v4 - gh.efwk("ehfs", efxi(int ), (int)336));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1262799597: {
                    break block34;
                }
                case -343148211: {
                    v4 = gh.efwk("ehft", efxi(int ), (int)337);
                    continue block34;
                }
                case -206551755: {
                    v4 = gh.efwk("ehfu", efxi(int ), (int)338);
                    continue block34;
                }
                case 1504664791: {
                    v4 = gh.efwk("ehfv", efxi(int ), (int)339);
                    continue block34;
                }
            }
            break;
        }
        v5 /* !! */  = gh.kp;
        if (true) ** GOTO lbl47
        block35: while (true) {
            v5 /* !! */  = (long)(v6 - gh.efwk("ehfw", efxi(int ), (int)340));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1262799597: {
                    break block35;
                }
                case -178689691: {
                    v6 = gh.efwk("ehfx", efxi(int ), (int)341);
                    continue block35;
                }
                case 59626415: {
                    v6 = gh.efwk("ehfy", efxi(int ), (int)342);
                    continue block35;
                }
                case 1041272017: {
                    v6 = gh.efwk("ehfz", efxi(int ), (int)343);
                    continue block35;
                }
            }
            break;
        }
        if (!this.mode.isSelected("Grim")) ** GOTO lbl100
        if (var1_3) ** GOTO lbl24
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("ehga", efxi(int ), (int)344)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == gh.efwk("ehgb", efwt(int ), (int)576)) break;
            v7 /* !! */  = (long)gh.efwk("ehgc", efwt(int ), (int)577);
        }
        v8 /* !! */  = gh.kp;
        if (true) ** GOTO lbl71
        block37: while (true) {
            v8 /* !! */  = (long)(gh.efwk("ehge", efxi(int ), (int)346) - gh.efwk("ehgd", efxi(int ), (int)345));
lbl71:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1262799597: {
                    break block37;
                }
                case -182273915: {
                    continue block37;
                }
            }
            break;
        }
        if (this.type.isSelected("Cube")) ** GOTO lbl95
        if (var1_3) ** GOTO lbl24
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("ehgf", efxi(int ), (int)347)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == gh.efwk("ehgg", efwt(int ), (int)578)) break;
            v9 /* !! */  = (long)gh.efwk("ehgh", efwt(int ), (int)579);
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = gh.kp - gh.efwk("ehgi", efxi(int ), (int)348)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == gh.efwk("ehgj", efwt(int ), (int)580)) break;
            v10 /* !! */  = (long)gh.efwk("ehgk", efwt(int ), (int)581);
        }
        if (!this.type.isSelected("Circle")) ** GOTO lbl100
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl24
lbl95:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl24
                v11 = gh.efwk("ehgl", efwt(int ), (int)582);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl100:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v11 = gh.efwk("ehgm", efwt(int ), (int)583);
lbl103:
            // 2 sources

            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = gh.kp - gh.efwk("ehgn", efxi(int ), (int)349)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == gh.efwk("ehgo", efwt(int ), (int)584)) break;
                v12 /* !! */  = (long)gh.efwk("ehgp", efwt(int ), (int)585);
            }
            return (boolean)v11;
lbl110:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gh.efwk("ehgq", efwt(int ), (int)586);
                if (var3_1) {
                    throw null;
                }
            }
lbl114:
            // 5 sources

            case 1: {
                var2_2 /* !! */  = (int)gh.efwk("ehgr", efwt(int ), (int)587);
                if (!var3_1) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gh.efwk("ehgs", efwt(int ), (int)588);
                if (var3_1) {
                    throw null;
                }
            }
lbl122:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)gh.efwk("ehgt", efwt(int ), (int)589);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)gh.efwk("ehgu", efwt(int ), (int)590);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gh.efwk("ehgv", efwt(int ), (int)591);
                    if (!var3_1) ** GOTO lbl122
                    throw null;
                }
            }
lbl135:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gh.efwk("ehgw", efwt(int ), (int)592);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 7: {
                var2_2 /* !! */  = (int)gh.efwk("ehgx", efwt(int ), (int)593);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl144:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gh.efwk("ehgy", efwt(int ), (int)594);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)gh.efwk("ehgz", efwt(int ), (int)595);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)gh.efwk("ehha", efwt(int ), (int)596);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)gh.efwk("ehhb", efwt(int ), (int)597);
        ** while (!var3_1)
lbl159:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block84: {
            block83: {
                block82: {
                    block81: {
                        block80: {
                            block79: {
                                var5_2 = gh.c;
                                var4_3 /* !! */  = gh.b;
                                var3_4 = gh.a;
                                if (var5_2) {
                                    throw null;
lbl6:
                                    // 23 sources

                                    return;
                                }
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (gh.mc.field_1724 == null) break block79;
                                if (var3_4) ** GOTO lbl6
                                if (gh.mc.field_1687 != null) break block80;
                                if (var3_4) ** GOTO lbl6
                            }
                            if (var3_4 || var3_4) ** GOTO lbl6
                            return;
                        }
                        if (var3_4 || var3_4) ** GOTO lbl6
                        var2_5 = hn.getInstance().getTarget();
                        if (var3_4 || var3_4) ** GOTO lbl6
                        if (var2_5 == null) break block81;
                        if (var3_4) ** GOTO lbl6
                        if (var2_5.method_5805()) break block82;
                        if (var3_4) ** GOTO lbl6
                    }
                    if (var3_4 || var3_4) ** GOTO lbl6
                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                if (this.mode.isSelected("Matrix")) break block83;
                if (var3_4) ** GOTO lbl6
                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            if (!this.setting.isSelected("Only Key Pressed")) break block84;
            if (var3_4 || var3_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1894.method_1434()) break block84;
            if (var3_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1881.method_1434()) break block84;
            if (var3_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1913.method_1434()) break block84;
            if (var3_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1849.method_1434()) break block84;
            if (var3_4 || var3_4) ** GOTO lbl6
            return;
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl6
                if (!this.setting.isSelected("Auto Jump")) ** GOTO lbl56
                if (var3_4) ** GOTO lbl6
                if (!gh.mc.field_1724.method_24828()) ** GOTO lbl56
                if (var3_4 || var3_4) ** GOTO lbl6
                gh.mc.field_1724.method_6043();
                if (var3_4) ** GOTO lbl6
lbl56:
                // 3 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                this.processMatrixStrafe(var2_5);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl61:
            // 4 sources

            case 0: {
                var4_3 /* !! */  = (int)gh.efwk("egll", efwt(int ), (int)279);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gh.efwk("eglm", efwt(int ), (int)280);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl175
                    break;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)gh.efwk("egln", efwt(int ), (int)281);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl77:
            // 4 sources

            case 3: {
                var4_3 /* !! */  = (int)gh.efwk("eglo", efwt(int ), (int)282);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 4: {
                var4_3 /* !! */  = (int)gh.efwk("eglp", efwt(int ), (int)283);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl87:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)gh.efwk("eglq", efwt(int ), (int)284);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl92:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)gh.efwk("eglr", efwt(int ), (int)285);
                if (!var5_2) ** GOTO lbl87
                throw null;
            }
lbl96:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)gh.efwk("egls", efwt(int ), (int)286);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl101:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)gh.efwk("eglt", efwt(int ), (int)287);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl106:
            // 3 sources

            case 9: {
                var4_3 /* !! */  = (int)gh.efwk("eglu", efwt(int ), (int)288);
                if (!var5_2) ** GOTO lbl77
                throw null;
            }
            case 10: {
                do {
                    var4_3 /* !! */  = (int)gh.efwk("eglv", efwt(int ), (int)289);
                } while (!var5_2);
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)gh.efwk("eglw", efwt(int ), (int)290);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 12: {
                var4_3 /* !! */  = (int)gh.efwk("eglx", efwt(int ), (int)291);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 13: {
                var4_3 /* !! */  = (int)gh.efwk("egly", efwt(int ), (int)292);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 14: {
                var4_3 /* !! */  = (int)gh.efwk("eglz", efwt(int ), (int)293);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 15: {
                var4_3 /* !! */  = (int)gh.efwk("egma", efwt(int ), (int)294);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl140:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)gh.efwk("egmb", efwt(int ), (int)295);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl145:
            // 3 sources

            case 17: {
                var4_3 /* !! */  = (int)gh.efwk("egmc", efwt(int ), (int)296);
                if (!var5_2) ** GOTO lbl101
                throw null;
            }
lbl149:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)gh.efwk("egmd", efwt(int ), (int)297);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 19: {
                var4_3 /* !! */  = (int)gh.efwk("egme", efwt(int ), (int)298);
                if (!var5_2) ** GOTO lbl61
                throw null;
            }
lbl158:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)gh.efwk("egmf", efwt(int ), (int)299);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl163:
            // 2 sources

            case 21: {
                var4_3 /* !! */  = (int)gh.efwk("egmg", efwt(int ), (int)300);
                if (!var5_2) break;
                throw null;
            }
            case 22: {
                var4_3 /* !! */  = (int)gh.efwk("egmh", efwt(int ), (int)301);
                if (!var5_2) ** GOTO lbl163
                throw null;
            }
            case 23: {
                var4_3 /* !! */  = (int)gh.efwk("egmi", efwt(int ), (int)302);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
lbl175:
            // 3 sources

            case 24: {
                var4_3 /* !! */  = (int)gh.efwk("egmj", efwt(int ), (int)303);
                if (!var5_2) ** GOTO lbl77
                throw null;
            }
            case 25: {
                var4_3 /* !! */  = (int)gh.efwk("egmk", efwt(int ), (int)304);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl184:
            // 2 sources

            case 26: {
                var4_3 /* !! */  = (int)gh.efwk("egml", efwt(int ), (int)305);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 27: {
                var4_3 /* !! */  = (int)gh.efwk("egmm", efwt(int ), (int)306);
                if (!var5_2) ** GOTO lbl77
                throw null;
            }
lbl193:
            // 2 sources

            case 28: {
                var4_3 /* !! */  = (int)gh.efwk("egmn", efwt(int ), (int)307);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
            case 29: {
                var4_3 /* !! */  = (int)gh.efwk("egmo", efwt(int ), (int)308);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
lbl201:
            // 5 sources

            case 30: {
                var4_3 /* !! */  = (int)gh.efwk("egmp", efwt(int ), (int)309);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 31: {
                var4_3 /* !! */  = (int)gh.efwk("egmq", efwt(int ), (int)310);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl211:
            // 3 sources

            case 32: {
                var4_3 /* !! */  = (int)gh.efwk("egmr", efwt(int ), (int)311);
                if (!var5_2) ** GOTO lbl140
                throw null;
            }
            case 33: {
                do {
                    var4_3 /* !! */  = (int)gh.efwk("egms", efwt(int ), (int)312);
                } while (!var5_2);
                throw null;
            }
lbl220:
            // 4 sources

            case 34: {
                do {
                    var4_3 /* !! */  = (int)gh.efwk("egmt", efwt(int ), (int)313);
                } while (!var5_2);
                throw null;
            }
lbl225:
            // 2 sources

            case 35: {
                var4_3 /* !! */  = (int)gh.efwk("egmu", efwt(int ), (int)314);
                if (!var5_2) ** GOTO lbl61
                throw null;
            }
lbl229:
            // 2 sources

            case 36: {
                var4_3 /* !! */  = (int)gh.efwk("egmv", efwt(int ), (int)315);
                if (!var5_2) ** GOTO lbl201
                throw null;
            }
            case 37: {
                var4_3 /* !! */  = (int)gh.efwk("egmw", efwt(int ), (int)316);
                if (!var5_2) ** GOTO lbl61
                throw null;
            }
lbl237:
            // 2 sources

            case 38: {
                var4_3 /* !! */  = (int)gh.efwk("egmx", efwt(int ), (int)317);
                if (!var5_2) ** GOTO lbl92
                throw null;
            }
            case 39: 
        }
        var4_3 /* !! */  = (int)gh.efwk("egmy", efwt(int ), (int)318);
        ** while (!var5_2)
lbl244:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehiw() {
        gh.efwi[0] = -1530707021;
        gh.efwi[1] = 808533648;
        gh.efwi[2] = -189184317;
        gh.efwi[3] = 1767290821;
        gh.efwi[4] = -1280028205;
        gh.efwi[5] = 817150057;
        gh.efwi[6] = 129815399;
        gh.efwi[7] = -68711912;
        gh.efwi[8] = -1106680822;
        gh.efwi[9] = -1625463542;
        gh.efwi[10] = 918714110;
        gh.efwi[11] = 1621023502;
        gh.efwi[12] = 1382780154;
        gh.efwi[13] = -980053934;
        gh.efwi[14] = 1915576214;
        gh.efwi[15] = -194091680;
        gh.efwi[16] = -319096396;
        gh.efwi[17] = -1661408824;
        gh.efwi[18] = 991226938;
        gh.efwi[19] = -2041722492;
        gh.efwi[20] = -2061046165;
        gh.efwi[21] = -1574929169;
        gh.efwi[22] = -1179043701;
        gh.efwi[23] = 1066404451;
        gh.efwi[24] = -340141230;
        gh.efwi[25] = -440012933;
        gh.efwi[26] = -370794297;
        gh.efwi[27] = 147679047;
        gh.efwi[28] = -1475836053;
        gh.efwi[29] = 254627927;
        gh.efwi[30] = -1006045836;
        gh.efwi[31] = 2059347953;
        gh.efwi[32] = -80210049;
        gh.efwi[33] = 1638177343;
        gh.efwi[34] = -1528691804;
        gh.efwi[35] = -2070175377;
        gh.efwi[36] = -42607304;
        gh.efwi[37] = 361235073;
        gh.efwi[38] = -362215361;
        gh.efwi[39] = -218196171;
        gh.efwi[40] = -1492873403;
        gh.efwi[41] = 1403938351;
        gh.efwi[42] = -1767910533;
        gh.efwi[43] = 298629435;
        gh.efwi[44] = 1810167135;
        gh.efwi[45] = -1672014051;
        gh.efwi[46] = 532463878;
        gh.efwi[47] = -1173531649;
        gh.efwi[48] = 1533724526;
        gh.efwi[49] = -159328809;
        gh.efwi[50] = 108708101;
        gh.efwi[51] = 1440203245;
        gh.efwi[52] = -722400511;
        gh.efwi[53] = -230018344;
        gh.efwi[54] = 1764612193;
        gh.efwi[55] = -1994082155;
        gh.efwi[56] = -306090211;
        gh.efwi[57] = -1421702537;
        gh.efwi[58] = 1522874799;
        gh.efwi[59] = 1918878047;
        gh.efwi[60] = 1400269965;
        gh.efwi[61] = -2108551077;
        gh.efwi[62] = -1412276225;
        gh.efwi[63] = -695831557;
        gh.efwi[64] = 2086154341;
        gh.efwi[65] = 1985125998;
        gh.efwi[66] = -1824602470;
        gh.efwi[67] = -2090318177;
        gh.efwi[68] = 1085312931;
        gh.efwi[69] = -304465347;
        gh.efwi[70] = -1563415346;
        gh.efwi[71] = -931985558;
        gh.efwi[72] = -183333555;
        gh.efwi[73] = -1219262777;
        gh.efwi[74] = 993361548;
        gh.efwi[75] = 2024100279;
        gh.efwi[76] = 39204117;
        gh.efwi[77] = -1114663659;
        gh.efwi[78] = 844418973;
        gh.efwi[79] = 1744934509;
        gh.efwi[80] = -53359668;
        gh.efwi[81] = -507525376;
        gh.efwi[82] = 657786478;
        gh.efwi[83] = -1989048141;
        gh.efwi[84] = -580542748;
        gh.efwi[85] = -8537319;
        gh.efwi[86] = -369742749;
        gh.efwi[87] = -1038776475;
        gh.efwi[88] = -2129145796;
        gh.efwi[89] = 1665888237;
        gh.efwi[90] = -1034409335;
        gh.efwi[91] = 803754725;
        gh.efwi[92] = 1981735237;
        gh.efwi[93] = 800837859;
        gh.efwi[94] = 1340007512;
        gh.efwi[95] = 1445578960;
        gh.efwi[96] = -517444165;
        gh.efwi[97] = -279671505;
        gh.efwi[98] = -1575289237;
        gh.efwi[99] = -907443853;
    }

    private static /* synthetic */ void ehjj() {
        gh.efwj[600] = -1105633521;
        gh.efwj[601] = -1405323991;
        gh.efwj[602] = 553859449;
        gh.efwj[603] = 616314750;
        gh.efwj[604] = 1696746724;
        gh.efwj[605] = -1433677910;
        gh.efwj[606] = 1080100715;
        gh.efwj[607] = -1653871159;
        gh.efwj[608] = 304259087;
        gh.efwj[609] = 970602821;
        gh.efwj[610] = -1319375689;
        gh.efwj[611] = -471891838;
        gh.efwj[612] = 1742783868;
        gh.efwj[613] = 1496559000;
        gh.efwj[614] = 1872241180;
        gh.efwj[615] = 1059926978;
        gh.efwj[616] = 302965274;
        gh.efwj[617] = 261959181;
        gh.efwj[618] = 1150677175;
        gh.efwj[619] = -523136874;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 calculateNormalPoint(class_243 var1_1, class_243 var2_2, double var3_3, int var5_4) {
        var12_5 = gh.c;
        var11_6 /* !! */  = gh.b;
        var10_7 = gh.a;
        if (var12_5) {
            throw null;
lbl6:
            // 13 sources

            return null;
        }
        if (var11_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_7 || var10_7) ** GOTO lbl6
                if (!this.type.isSelected("Cube")) ** GOTO lbl27
                if (var10_7 || var10_7) ** GOTO lbl6
                v0 = new class_243[4];
                v0[gh.efwk("egfo", efwt(int ), (int)146)] = new class_243(var2_2.field_1352 - var3_3, var1_1.field_1351, var2_2.field_1350 - var3_3);
                v0[gh.efwk("egfp", efwt(int ), (int)147)] = new class_243(var2_2.field_1352 - var3_3, var1_1.field_1351, var2_2.field_1350 + var3_3);
                v0[gh.efwk("egfq", efwt(int ), (int)148)] = new class_243(var2_2.field_1352 + var3_3, var1_1.field_1351, var2_2.field_1350 + var3_3);
                v0[gh.efwk("egfr", efwt(int ), (int)149)] = new class_243(var2_2.field_1352 + var3_3, var1_1.field_1351, var2_2.field_1350 - var3_3);
                var6_8 = v0;
                if (var10_7 || var10_7) ** GOTO lbl6
                if (!(var1_1.method_1022(var6_8[this.grimPointIndex]) < gh.efwk("egfs", egds(int ), (int)86))) ** GOTO lbl25
                if (var10_7 || var10_7) ** GOTO lbl6
                this.grimPointIndex = (this.grimPointIndex + var5_4 + var6_8.length) % var6_8.length;
                if (var10_7) ** GOTO lbl6
lbl25:
                // 2 sources

                if (var10_7 || var10_7) ** GOTO lbl6
                return var6_8[this.grimPointIndex];
lbl27:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl6
                if (!this.type.isSelected("Circle")) ** GOTO lbl42
                if (var10_7 || var10_7) ** GOTO lbl6
                var6_9 = (double)(System.currentTimeMillis() % gh.efwk("egft", efxi(int ), (int)87)) / gh.efwk("egfu", egds(int ), (int)88) * gh.efwk("egfv", egds(int ), (int)89) * gh.efwk("egfw", egds(int ), (int)90);
                if (var10_7 || var10_7) ** GOTO lbl6
                if (var5_4 <= 0) ** GOTO lbl38
                if (var10_7) ** GOTO lbl6
                v1 = var6_9;
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl40
lbl38:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl6
                v1 = var8_10 = (double)(gh.efwk("egfx", egds(int ), (int)91) - var6_9);
lbl40:
                // 2 sources

                if (var10_7 || var10_7) ** GOTO lbl6
                return new class_243(var2_2.field_1352 + Math.cos(var8_10) * var3_3, var1_1.field_1351, var2_2.field_1350 + Math.sin(var8_10) * var3_3);
lbl42:
                // 1 sources

                if (!var10_7 && !var10_7) ** break;
                ** continue;
                return new class_243(var2_2.field_1352, var1_1.field_1351, var2_2.field_1350);
            }
lbl45:
            // 3 sources

            case 0: {
                var11_6 /* !! */  = (int)gh.efwk("egfy", efwt(int ), (int)150);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 1: {
                var11_6 /* !! */  = (int)gh.efwk("egfz", efwt(int ), (int)151);
                if (var12_5) {
                    throw null;
                }
            }
lbl54:
            // 4 sources

            case 2: {
                do {
                    var11_6 /* !! */  = (int)gh.efwk("egga", efwt(int ), (int)152);
                } while (!var12_5);
                throw null;
            }
            case 3: {
                var11_6 /* !! */  = (int)gh.efwk("eggb", efwt(int ), (int)153);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl88
            }
lbl64:
            // 2 sources

            case 4: {
                var11_6 /* !! */  = (int)gh.efwk("eggc", efwt(int ), (int)154);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl69:
            // 2 sources

            case 5: {
                var11_6 /* !! */  = (int)gh.efwk("eggd", efwt(int ), (int)155);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl74:
            // 2 sources

            case 6: {
                var11_6 /* !! */  = (int)gh.efwk("egge", efwt(int ), (int)156);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 7: {
                var11_6 /* !! */  = (int)gh.efwk("eggf", efwt(int ), (int)157);
                if (!var12_5) ** GOTO lbl74
                throw null;
            }
lbl83:
            // 3 sources

            case 8: {
                var11_6 /* !! */  = (int)gh.efwk("eggg", efwt(int ), (int)158);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl88:
            // 3 sources

            case 9: {
                var11_6 /* !! */  = (int)gh.efwk("eggh", efwt(int ), (int)159);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 10: {
                var11_6 /* !! */  = (int)gh.efwk("eggi", efwt(int ), (int)160);
                if (!var12_5) ** GOTO lbl54
                throw null;
            }
lbl97:
            // 2 sources

            case 11: {
                var11_6 /* !! */  = (int)gh.efwk("eggj", efwt(int ), (int)161);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 12: {
                var11_6 /* !! */  = (int)gh.efwk("eggk", efwt(int ), (int)162);
                if (var12_5) {
                    throw null;
                }
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_6 /* !! */  = (int)gh.efwk("eggl", efwt(int ), (int)163);
                    if (!var12_5) ** GOTO lbl45
                    throw null;
                }
            }
            case 14: {
                var11_6 /* !! */  = (int)gh.efwk("eggm", efwt(int ), (int)164);
                if (!var12_5) ** GOTO lbl64
                throw null;
            }
lbl115:
            // 2 sources

            case 15: {
                var11_6 /* !! */  = (int)gh.efwk("eggn", efwt(int ), (int)165);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl120:
            // 2 sources

            case 16: {
                var11_6 /* !! */  = (int)gh.efwk("eggo", efwt(int ), (int)166);
                if (!var12_5) ** GOTO lbl83
                throw null;
            }
lbl124:
            // 3 sources

            case 17: {
                var11_6 /* !! */  = (int)gh.efwk("eggp", efwt(int ), (int)167);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl129:
            // 2 sources

            case 18: {
                var11_6 /* !! */  = (int)gh.efwk("eggq", efwt(int ), (int)168);
                if (!var12_5) ** GOTO lbl120
                throw null;
            }
            case 19: {
                var11_6 /* !! */  = (int)gh.efwk("eggr", efwt(int ), (int)169);
                if (!var12_5) ** GOTO lbl124
                throw null;
            }
lbl137:
            // 2 sources

            case 20: {
                var11_6 /* !! */  = (int)gh.efwk("eggs", efwt(int ), (int)170);
                if (!var12_5) ** GOTO lbl97
                throw null;
            }
lbl141:
            // 2 sources

            case 21: {
                do {
                    var11_6 /* !! */  = (int)gh.efwk("eggt", efwt(int ), (int)171);
                } while (!var12_5);
                throw null;
            }
lbl146:
            // 2 sources

            case 22: {
                var11_6 /* !! */  = (int)gh.efwk("eggu", efwt(int ), (int)172);
                if (!var12_5) ** GOTO lbl88
                throw null;
            }
lbl150:
            // 3 sources

            case 23: {
                var11_6 /* !! */  = (int)gh.efwk("eggv", efwt(int ), (int)173);
                if (!var12_5) break;
                throw null;
            }
lbl154:
            // 2 sources

            case 24: {
                var11_6 /* !! */  = (int)gh.efwk("eggw", efwt(int ), (int)174);
                if (!var12_5) ** GOTO lbl137
                throw null;
            }
            case 25: {
                var11_6 /* !! */  = (int)gh.efwk("eggx", efwt(int ), (int)175);
                if (!var12_5) ** GOTO lbl146
                throw null;
            }
            case 26: {
                var11_6 /* !! */  = (int)gh.efwk("eggy", efwt(int ), (int)176);
                if (!var12_5) ** GOTO lbl45
                throw null;
            }
            case 27: 
        }
        var11_6 /* !! */  = (int)gh.efwk("eggz", efwt(int ), (int)177);
        ** while (!var12_5)
lbl169:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehjf() {
        gh.efwj[200] = -1383289958;
        gh.efwj[201] = -1461047958;
        gh.efwj[202] = -833488070;
        gh.efwj[203] = 1209040583;
        gh.efwj[204] = 1552063380;
        gh.efwj[205] = 1626245615;
        gh.efwj[206] = 933043772;
        gh.efwj[207] = 1257030135;
        gh.efwj[208] = -1965196896;
        gh.efwj[209] = -534058409;
        gh.efwj[210] = 1115419195;
        gh.efwj[211] = 1810626276;
        gh.efwj[212] = 1955783744;
        gh.efwj[213] = 719389175;
        gh.efwj[214] = -593820265;
        gh.efwj[215] = 95516267;
        gh.efwj[216] = -1934459294;
        gh.efwj[217] = 210007188;
        gh.efwj[218] = -1076427162;
        gh.efwj[219] = -449272737;
        gh.efwj[220] = 1499340808;
        gh.efwj[221] = -884284359;
        gh.efwj[222] = -361816642;
        gh.efwj[223] = -806034568;
        gh.efwj[224] = -1048449750;
        gh.efwj[225] = 1984858187;
        gh.efwj[226] = -1779745997;
        gh.efwj[227] = -1586998134;
        gh.efwj[228] = 1908176602;
        gh.efwj[229] = 794468826;
        gh.efwj[230] = 1763513502;
        gh.efwj[231] = 1007342841;
        gh.efwj[232] = 574966441;
        gh.efwj[233] = -82157255;
        gh.efwj[234] = 986373664;
        gh.efwj[235] = -386011029;
        gh.efwj[236] = -341666743;
        gh.efwj[237] = 1020793039;
        gh.efwj[238] = -704709018;
        gh.efwj[239] = -1331578432;
        gh.efwj[240] = 1373943155;
        gh.efwj[241] = -947676881;
        gh.efwj[242] = 786973485;
        gh.efwj[243] = 787070782;
        gh.efwj[244] = 942209034;
        gh.efwj[245] = 1771352679;
        gh.efwj[246] = 2078956040;
        gh.efwj[247] = 1485868560;
        gh.efwj[248] = -426590592;
        gh.efwj[249] = -1378986347;
        gh.efwj[250] = -633958047;
        gh.efwj[251] = 893090033;
        gh.efwj[252] = -1241721223;
        gh.efwj[253] = -1389475394;
        gh.efwj[254] = -197057091;
        gh.efwj[255] = 1434949156;
        gh.efwj[256] = -1264922195;
        gh.efwj[257] = -944977182;
        gh.efwj[258] = 2061999939;
        gh.efwj[259] = -1911281497;
        gh.efwj[260] = -1210283758;
        gh.efwj[261] = -954351029;
        gh.efwj[262] = -597621890;
        gh.efwj[263] = -2127697753;
        gh.efwj[264] = 1080307257;
        gh.efwj[265] = -1027210971;
        gh.efwj[266] = 911794017;
        gh.efwj[267] = -1291722954;
        gh.efwj[268] = 1728155384;
        gh.efwj[269] = 1481401939;
        gh.efwj[270] = 119696779;
        gh.efwj[271] = 796248378;
        gh.efwj[272] = -1280610488;
        gh.efwj[273] = -791151489;
        gh.efwj[274] = 486628557;
        gh.efwj[275] = 1211053481;
        gh.efwj[276] = 1536826737;
        gh.efwj[277] = 1017734515;
        gh.efwj[278] = -161875224;
        gh.efwj[279] = 875680498;
        gh.efwj[280] = 1882498148;
        gh.efwj[281] = -1248909657;
        gh.efwj[282] = 2054342554;
        gh.efwj[283] = -1542414402;
        gh.efwj[284] = 666124391;
        gh.efwj[285] = -428233958;
        gh.efwj[286] = 881701851;
        gh.efwj[287] = -449514792;
        gh.efwj[288] = -1602749961;
        gh.efwj[289] = -714273180;
        gh.efwj[290] = 448762212;
        gh.efwj[291] = 1601801832;
        gh.efwj[292] = 2067565289;
        gh.efwj[293] = 979109132;
        gh.efwj[294] = 995128944;
        gh.efwj[295] = -242797977;
        gh.efwj[296] = -183832111;
        gh.efwj[297] = 2052617750;
        gh.efwj[298] = 1188567493;
        gh.efwj[299] = -2059181490;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$5() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("ehcv", efxi(int ), (int)291)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gh.efwk("ehcw", efwt(int ), (int)546)) break;
            v0 /* !! */  = (long)gh.efwk("ehcx", efwt(int ), (int)547);
        }
        var3_1 = gh.c;
        while (true) {
            block36: {
                if ((v1 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("ehcy", efxi(int ), (int)292)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != gh.efwk("ehcz", efwt(int ), (int)548)) break block36;
                var2_2 /* !! */  = gh.b;
                v2 /* !! */  = gh.kp;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)gh.efwk("ehda", efwt(int ), (int)549);
        }
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - gh.efwk("ehdb", efxi(int ), (int)293));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1740187083: {
                    v3 = gh.efwk("ehdc", efxi(int ), (int)294);
                    continue block27;
                }
                case -1428656905: {
                    v3 = gh.efwk("ehdd", efxi(int ), (int)295);
                    continue block27;
                }
                case -1262799597: {
                    break block27;
                }
            }
            break;
        }
        var1_3 = gh.a;
        if (var3_1) {
            throw null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block28: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    v4 /* !! */  = gh.kp;
                    block29: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1262799597: {
                                break block29;
                            }
                            case -621626619: {
                                v4 /* !! */  = (long)(gh.efwk("ehdf", efxi(int ), (int)297) - gh.efwk("ehde", efxi(int ), (int)296));
                                continue block29;
                            }
                        }
                        break;
                    }
                    v5 /* !! */  = gh.kp;
                    block30: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -1262799597: {
                                break block30;
                            }
                            case -1156420441: {
                                v6 = gh.efwk("ehdh", efxi(int ), (int)299);
                                ** GOTO lbl58
                            }
                            case -490660426: {
                                v6 = gh.efwk("ehdi", efxi(int ), (int)300);
                                ** GOTO lbl58
                            }
                            case -315480395: {
                                v6 = gh.efwk("ehdj", efxi(int ), (int)301);
lbl58:
                                // 3 sources

                                v5 /* !! */  = (long)(v6 - gh.efwk("ehdg", efxi(int ), (int)298));
                                continue block30;
                            }
                        }
                        break;
                    }
                    v7 = this.mode.isSelected("Matrix");
                    v8 /* !! */  = gh.kp;
                    block31: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case -1440523408: {
                                v8 /* !! */  = (long)(gh.efwk("ehdl", efxi(int ), (int)303) - gh.efwk("ehdk", efxi(int ), (int)302));
                                continue block31;
                            }
                            case -1262799597: {
                                return v7;
                            }
                        }
                        break;
                    }
                    return v7;
                }
                case 0: {
                    ** GOTO lbl81
                }
                case 2: {
                    var2_2 /* !! */  = (int)gh.efwk("ehdo", efwt(int ), (int)552);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block28;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)gh.efwk("ehdp", efwt(int ), (int)553);
                    if (var3_1) {
                        throw null;
                    }
lbl81:
                    // 3 sources

                    var2_2 /* !! */  = (int)gh.efwk("ehdm", efwt(int ), (int)550);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)gh.efwk("ehdn", efwt(int ), (int)551);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processMatrixStrafe(class_1309 var1_1) {
        block112: {
            v0 /* !! */  = gh.kp;
            if (true) ** GOTO lbl5
            block69: while (true) {
                v0 /* !! */  = (long)(gh.efwk("egna", efxi(int ), (int)107) - gh.efwk("egmz", efxi(int ), (int)106));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1262799597: {
                        break block69;
                    }
                    case -360172063: {
                        continue block69;
                    }
                }
                break;
            }
            var9_2 = gh.c;
            v1 /* !! */  = gh.kp;
            if (true) ** GOTO lbl15
            block70: while (true) {
                v1 /* !! */  = (long)(v2 - gh.efwk("egnb", efxi(int ), (int)108));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1262799597: {
                        break block70;
                    }
                    case -1235880717: {
                        v2 = gh.efwk("egnc", efxi(int ), (int)109);
                        continue block70;
                    }
                    case -568622405: {
                        v2 = gh.efwk("egnd", efxi(int ), (int)110);
                        continue block70;
                    }
                }
                break;
            }
            var8_3 /* !! */  = gh.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("egne", efxi(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gh.efwk("egnf", efwt(int ), (int)319)) break;
                v3 /* !! */  = (long)gh.efwk("egng", efwt(int ), (int)320);
            }
            var7_4 = gh.a;
            if (var9_2) {
                throw null;
lbl33:
                // 14 sources

                return;
            }
            if (var7_4 || var7_4) ** GOTO lbl33
            v4 /* !! */  = gh.kp;
            if (true) ** GOTO lbl40
            block73: while (true) {
                v4 /* !! */  = (long)(gh.efwk("egni", efxi(int ), (int)113) - gh.efwk("egnh", efxi(int ), (int)112));
lbl40:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1262799597: {
                        break block73;
                    }
                    case 1139024320: {
                        continue block73;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("egnj", efxi(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gh.efwk("egnk", efwt(int ), (int)321)) break;
                v5 /* !! */  = (long)gh.efwk("egnl", efwt(int ), (int)322);
            }
            v6 = gh.mc.field_1724;
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("egnm", efxi(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == gh.efwk("egnn", efwt(int ), (int)323)) break;
                v7 /* !! */  = (long)gh.efwk("egno", efwt(int ), (int)324);
            }
            var2_5 = v6.method_73189();
            if (var7_4 || var7_4) ** GOTO lbl33
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("egnp", efxi(int ), (int)116)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gh.efwk("egnq", efwt(int ), (int)325)) break;
                v8 /* !! */  = (long)gh.efwk("egnr", efwt(int ), (int)326);
            }
            var3_6 = var1_1.method_73189();
            if (var7_4 || var7_4) ** GOTO lbl33
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("egns", efxi(int ), (int)117)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gh.efwk("egnt", efwt(int ), (int)327)) break;
                v9 /* !! */  = (long)gh.efwk("egnu", efwt(int ), (int)328);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_5 = gh.kp - gh.efwk("egnv", efxi(int ), (int)118)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gh.efwk("egnw", efwt(int ), (int)329)) break;
                v10 /* !! */  = (long)gh.efwk("egnx", efwt(int ), (int)330);
            }
            var4_7 = this.radius.getValue();
            if (var7_4 || var7_4) ** GOTO lbl33
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = gh.kp - gh.efwk("egny", efxi(int ), (int)119)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gh.efwk("egnz", efwt(int ), (int)331)) break;
                v11 /* !! */  = (long)gh.efwk("egoa", efwt(int ), (int)332);
            }
            var6_8 = this.getDirectionMultiplier();
            if (var7_4 || var7_4) ** GOTO lbl33
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_7 = gh.kp - gh.efwk("egob", efxi(int ), (int)120)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == gh.efwk("egoc", efwt(int ), (int)333)) break;
                v12 /* !! */  = (long)gh.efwk("egod", efwt(int ), (int)334);
            }
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_8 = gh.kp - gh.efwk("egoe", efxi(int ), (int)121)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == gh.efwk("egof", efwt(int ), (int)335)) break;
                v13 /* !! */  = (long)gh.efwk("egog", efwt(int ), (int)336);
            }
            if (!this.setting.isSelected("In front of the target")) break block112;
            if (var7_4 || var7_4) ** GOTO lbl33
            v14 /* !! */  = gh.kp;
            if (true) ** GOTO lbl100
            block82: while (true) {
                v14 /* !! */  = (long)(gh.efwk("egoi", efxi(int ), (int)123) - gh.efwk("egoh", efxi(int ), (int)122));
lbl100:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1262799597: {
                        break block82;
                    }
                    case -1145867931: {
                        continue block82;
                    }
                }
                break;
            }
            this.processMatrixFrontStrafe(var1_1, var2_5, var3_6, var4_7, var6_8);
            if (var7_4 || var7_4) ** GOTO lbl33
            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl33
        v15 /* !! */  = gh.kp;
        if (true) ** GOTO lbl114
        block83: while (true) {
            v15 /* !! */  = (long)(v16 - gh.efwk("egoj", efxi(int ), (int)124));
lbl114:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1778966995: {
                    v16 = gh.efwk("egok", efxi(int ), (int)125);
                    continue block83;
                }
                case -1262799597: {
                    break block83;
                }
                case 829663241: {
                    v16 = gh.efwk("egol", efxi(int ), (int)126);
                    continue block83;
                }
                case 1946901087: {
                    v16 = gh.efwk("egom", efxi(int ), (int)127);
                    continue block83;
                }
            }
            break;
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_9 = gh.kp - gh.efwk("egon", efxi(int ), (int)128)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == gh.efwk("egoo", efwt(int ), (int)337)) break;
            v17 /* !! */  = (long)gh.efwk("egop", efwt(int ), (int)338);
        }
        if (!this.typeMatrix.isSelected("Cube")) ** GOTO lbl150
        if (var7_4 || var7_4) ** GOTO lbl33
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v18 /* !! */  = gh.kp;
                if (true) ** GOTO lbl140
                block85: while (true) {
                    v18 /* !! */  = (long)(gh.efwk("egor", efxi(int ), (int)130) - gh.efwk("egoq", efxi(int ), (int)129));
lbl140:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1262799597: {
                            break block85;
                        }
                        case 137413815: {
                            continue block85;
                        }
                    }
                    break;
                }
                this.processMatrixCubeStrafe(var2_5, var3_6, var4_7, var6_8);
                if (var7_4) ** GOTO lbl33
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl150:
            // 1 sources

            if (var7_4 || var7_4) ** GOTO lbl33
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_10 = gh.kp - gh.efwk("egos", efxi(int ), (int)131)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == gh.efwk("egot", efwt(int ), (int)339)) break;
                v19 /* !! */  = (long)gh.efwk("egou", efwt(int ), (int)340);
            }
            v20 /* !! */  = gh.kp;
            if (true) ** GOTO lbl160
            block87: while (true) {
                v20 /* !! */  = (long)(v21 - gh.efwk("egov", efxi(int ), (int)132));
lbl160:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1262799597: {
                        break block87;
                    }
                    case -457860117: {
                        v21 = gh.efwk("egow", efxi(int ), (int)133);
                        continue block87;
                    }
                    case 1304691577: {
                        v21 = gh.efwk("egox", efxi(int ), (int)134);
                        continue block87;
                    }
                }
                break;
            }
            if (!this.typeMatrix.isSelected("Circle")) ** GOTO lbl189
            if (var7_4 || var7_4) ** GOTO lbl33
            v22 /* !! */  = gh.kp;
            if (true) ** GOTO lbl175
            block88: while (true) {
                v22 /* !! */  = (long)(v23 - gh.efwk("egoy", efxi(int ), (int)135));
lbl175:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -2055886728: {
                        v23 = gh.efwk("egoz", efxi(int ), (int)136);
                        continue block88;
                    }
                    case -1714553143: {
                        v23 = gh.efwk("egpa", efxi(int ), (int)137);
                        continue block88;
                    }
                    case -1262799597: {
                        break block88;
                    }
                    case 471147469: {
                        v23 = gh.efwk("egpb", efxi(int ), (int)138);
                        continue block88;
                    }
                }
                break;
            }
            this.processMatrixCircleStrafe(var2_5, var3_6, var4_7, var6_8);
            if (var7_4) ** GOTO lbl33
lbl189:
            // 3 sources

            if (!var7_4 && !var7_4) ** break;
            ** continue;
            return;
lbl192:
            // 4 sources

            case 0: {
                var8_3 /* !! */  = (int)gh.efwk("egpc", efwt(int ), (int)341);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl197:
            // 3 sources

            case 1: {
                var8_3 /* !! */  = (int)gh.efwk("egpd", efwt(int ), (int)342);
                if (!var9_2) ** GOTO lbl192
                throw null;
            }
lbl201:
            // 2 sources

            case 2: {
                var8_3 /* !! */  = (int)gh.efwk("egpe", efwt(int ), (int)343);
                if (!var9_2) break;
                throw null;
            }
lbl205:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)gh.efwk("egpf", efwt(int ), (int)344);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl210:
            // 3 sources

            case 4: {
                var8_3 /* !! */  = (int)gh.efwk("egpg", efwt(int ), (int)345);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl215:
            // 4 sources

            case 5: {
                var8_3 /* !! */  = (int)gh.efwk("egph", efwt(int ), (int)346);
                if (!var9_2) ** GOTO lbl210
                throw null;
            }
            case 6: {
                var8_3 /* !! */  = (int)gh.efwk("egpi", efwt(int ), (int)347);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl224:
            // 2 sources

            case 7: {
                var8_3 /* !! */  = (int)gh.efwk("egpj", efwt(int ), (int)348);
                if (!var9_2) ** GOTO lbl192
                throw null;
            }
lbl228:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)gh.efwk("egpk", efwt(int ), (int)349);
                if (!var9_2) ** GOTO lbl192
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)gh.efwk("egpl", efwt(int ), (int)350);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl277
                    break;
                }
            }
            case 10: {
                var8_3 /* !! */  = (int)gh.efwk("egpm", efwt(int ), (int)351);
                if (!var9_2) ** GOTO lbl197
                throw null;
            }
            case 11: {
                var8_3 /* !! */  = (int)gh.efwk("egpn", efwt(int ), (int)352);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 12: {
                do {
                    var8_3 /* !! */  = (int)gh.efwk("egpo", efwt(int ), (int)353);
                } while (!var9_2);
                throw null;
            }
lbl252:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)gh.efwk("egpp", efwt(int ), (int)354);
                if (!var9_2) ** GOTO lbl201
                throw null;
            }
lbl256:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)gh.efwk("egpq", efwt(int ), (int)355);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl261:
            // 2 sources

            case 15: {
                var8_3 /* !! */  = (int)gh.efwk("egpr", efwt(int ), (int)356);
                if (!var9_2) ** GOTO lbl228
                throw null;
            }
lbl265:
            // 2 sources

            case 16: {
                var8_3 /* !! */  = (int)gh.efwk("egps", efwt(int ), (int)357);
                if (!var9_2) ** GOTO lbl256
                throw null;
            }
lbl269:
            // 2 sources

            case 17: {
                var8_3 /* !! */  = (int)gh.efwk("egpt", efwt(int ), (int)358);
                if (!var9_2) ** GOTO lbl205
                throw null;
            }
lbl273:
            // 2 sources

            case 18: {
                var8_3 /* !! */  = (int)gh.efwk("egpu", efwt(int ), (int)359);
                if (!var9_2) ** GOTO lbl224
                throw null;
            }
lbl277:
            // 3 sources

            case 19: {
                var8_3 /* !! */  = (int)gh.efwk("egpv", efwt(int ), (int)360);
                if (!var9_2) ** GOTO lbl197
                throw null;
            }
lbl281:
            // 2 sources

            case 20: {
                var8_3 /* !! */  = (int)gh.efwk("egpw", efwt(int ), (int)361);
                if (!var9_2) ** GOTO lbl261
                throw null;
            }
            case 21: {
                var8_3 /* !! */  = (int)gh.efwk("egpx", efwt(int ), (int)362);
                if (!var9_2) ** GOTO lbl210
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)gh.efwk("egpy", efwt(int ), (int)363);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 23: {
                var8_3 /* !! */  = (int)gh.efwk("egpz", efwt(int ), (int)364);
                if (!var9_2) ** GOTO lbl215
                throw null;
            }
lbl298:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)gh.efwk("egqa", efwt(int ), (int)365);
                if (!var9_2) ** GOTO lbl215
                throw null;
            }
            case 25: {
                var8_3 /* !! */  = (int)gh.efwk("egqb", efwt(int ), (int)366);
                if (!var9_2) ** GOTO lbl215
                throw null;
            }
            case 26: {
                do {
                    var8_3 /* !! */  = (int)gh.efwk("egqc", efwt(int ), (int)367);
                } while (!var9_2);
                throw null;
            }
            case 27: {
                var8_3 /* !! */  = (int)gh.efwk("egqd", efwt(int ), (int)368);
                if (!var9_2) break;
                throw null;
            }
            case 28: 
        }
        var8_3 /* !! */  = (int)gh.efwk("egqe", efwt(int ), (int)369);
        ** while (!var9_2)
lbl318:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("ehia", efxi(int ), (int)366)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gh.efwk("ehib", efwt(int ), (int)606)) break;
            v0 /* !! */  = (long)gh.efwk("ehic", efwt(int ), (int)607);
        }
        var3_1 = gh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("ehid", efxi(int ), (int)367)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gh.efwk("ehie", efwt(int ), (int)608)) break;
            v1 /* !! */  = (long)gh.efwk("ehif", efwt(int ), (int)609);
        }
        var2_2 /* !! */  = gh.b;
        v2 /* !! */  = gh.kp;
        if (true) ** GOTO lbl17
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - gh.efwk("ehig", efxi(int ), (int)368));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1262799597: {
                    break block13;
                }
                case 146138264: {
                    v3 = gh.efwk("ehih", efxi(int ), (int)369);
                    continue block13;
                }
                case 1370560744: {
                    v3 = gh.efwk("ehii", efxi(int ), (int)370);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = gh.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("ehij", efxi(int ), (int)371)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gh.efwk("ehik", efwt(int ), (int)610)) break;
                    v4 /* !! */  = (long)gh.efwk("ehil", efwt(int ), (int)611);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("ehim", efxi(int ), (int)372)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gh.efwk("ehin", efwt(int ), (int)612)) break;
                    v5 /* !! */  = (long)gh.efwk("ehio", efwt(int ), (int)613);
                }
                v6 = this.mode.isSelected("Grim");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("ehip", efxi(int ), (int)373)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gh.efwk("ehiq", efwt(int ), (int)614)) break;
                    v7 /* !! */  = (long)gh.efwk("ehir", efwt(int ), (int)615);
                }
                return v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)gh.efwk("ehis", efwt(int ), (int)616);
                if (!var3_1) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gh.efwk("ehit", efwt(int ), (int)617);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gh.efwk("ehiu", efwt(int ), (int)618);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gh.efwk("ehiv", efwt(int ), (int)619);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 calculateFrontPoint(class_1309 var1_1, class_243 var2_2, double var3_3, int var5_4) {
        block84: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("egcl", efxi(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gh.efwk("egcm", efwt(int ), (int)113)) break;
                v0 /* !! */  = (long)gh.efwk("egcn", efwt(int ), (int)114);
            }
            var11_5 = gh.c;
            v1 /* !! */  = gh.kp;
            if (true) ** GOTO lbl11
            block61: while (true) {
                v1 /* !! */  = (long)(v2 - gh.efwk("egco", efxi(int ), (int)40));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1656712668: {
                        v2 = gh.efwk("egcp", efxi(int ), (int)41);
                        continue block61;
                    }
                    case -1262799597: {
                        break block61;
                    }
                    case 134094694: {
                        v2 = gh.efwk("egcq", efxi(int ), (int)42);
                        continue block61;
                    }
                }
                break;
            }
            var10_6 = gh.b;
            v3 /* !! */  = gh.kp;
            if (true) ** GOTO lbl25
            block62: while (true) {
                v3 /* !! */  = (long)(gh.efwk("egcs", efxi(int ), (int)44) - gh.efwk("egcr", efxi(int ), (int)43));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1326735465: {
                        continue block62;
                    }
                    case -1262799597: {
                        break block62;
                    }
                }
                break;
            }
            var9_7 = gh.a;
            if (var11_5) {
                throw null;
lbl33:
                // 5 sources

                return null;
            }
            if (var9_7 || var9_7) ** GOTO lbl33
            v4 /* !! */  = gh.kp;
            if (true) ** GOTO lbl40
            block64: while (true) {
                v4 /* !! */  = (long)(gh.efwk("egcu", efxi(int ), (int)46) - gh.efwk("egct", efxi(int ), (int)45));
lbl40:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1437674429: {
                        continue block64;
                    }
                    case -1262799597: {
                        break block64;
                    }
                }
                break;
            }
            var6_8 = var1_1.method_36454();
            if (var9_7 || var9_7) ** GOTO lbl33
            v5 /* !! */  = gh.kp;
            if (true) ** GOTO lbl51
            block65: while (true) {
                v5 /* !! */  = (long)(v6 - gh.efwk("egcv", efxi(int ), (int)47));
lbl51:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1262799597: {
                        break block65;
                    }
                    case -610672165: {
                        v6 = gh.efwk("egcw", efxi(int ), (int)48);
                        continue block65;
                    }
                    case 401055870: {
                        v6 = gh.efwk("egcx", efxi(int ), (int)49);
                        continue block65;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("egcy", efxi(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == gh.efwk("egcz", efwt(int ), (int)115)) break;
                v7 /* !! */  = (long)gh.efwk("egda", efwt(int ), (int)116);
            }
            if (!this.type.isSelected("Center")) break block84;
            if (var9_7 || var9_7) ** GOTO lbl33
            v8 = var6_8;
            v9 /* !! */  = gh.kp;
            if (true) ** GOTO lbl72
            block67: while (true) {
                v9 /* !! */  = (long)(v10 - gh.efwk("egdb", efxi(int ), (int)51));
lbl72:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1262799597: {
                        break block67;
                    }
                    case 347759154: {
                        v10 = gh.efwk("egdc", efxi(int ), (int)52);
                        continue block67;
                    }
                    case 1743098326: {
                        v10 = gh.efwk("egdd", efxi(int ), (int)53);
                        continue block67;
                    }
                }
                break;
            }
            v11 = Math.toRadians(v8);
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("egde", efxi(int ), (int)54)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == gh.efwk("egdf", efwt(int ), (int)117)) break;
                v12 /* !! */  = (long)gh.efwk("egdg", efwt(int ), (int)118);
            }
            v13 = -Math.sin(v11) * var3_3 * (double)var5_4;
            v14 = var6_8;
            v15 /* !! */  = gh.kp;
            if (true) ** GOTO lbl93
            block69: while (true) {
                v15 /* !! */  = (long)(v16 - gh.efwk("egdh", efxi(int ), (int)55));
lbl93:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1262799597: {
                        break block69;
                    }
                    case -316226797: {
                        v16 = gh.efwk("egdi", efxi(int ), (int)56);
                        continue block69;
                    }
                    case 653947585: {
                        v16 = gh.efwk("egdj", efxi(int ), (int)57);
                        continue block69;
                    }
                }
                break;
            }
            v17 = Math.toRadians(v14);
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("egdk", efxi(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == gh.efwk("egdl", efwt(int ), (int)119)) break;
                v18 /* !! */  = (long)gh.efwk("egdm", efwt(int ), (int)120);
            }
            v19 = Math.cos(v17) * var3_3 * (double)var5_4;
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("egdn", efxi(int ), (int)59)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == gh.efwk("egdo", efwt(int ), (int)121)) break;
                v20 /* !! */  = (long)gh.efwk("egdp", efwt(int ), (int)122);
            }
            return var2_2.method_1031(v13, 0.0, v19);
        }
        if (var9_7 || var9_7) ** GOTO lbl33
        v21 /* !! */  = gh.kp;
        if (true) ** GOTO lbl121
        block72: while (true) {
            v21 /* !! */  = (long)(gh.efwk("egdr", efxi(int ), (int)61) - gh.efwk("egdq", efxi(int ), (int)60));
lbl121:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1350441544: {
                    continue block72;
                }
                case -1262799597: {
                    break block72;
                }
            }
            break;
        }
        v22 = (double)System.currentTimeMillis() / gh.efwk("egdt", egds(int ), (int)62);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_5 = gh.kp - gh.efwk("egdu", efxi(int ), (int)63)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == gh.efwk("egdv", efwt(int ), (int)123)) break;
            v23 /* !! */  = (long)gh.efwk("egdw", efwt(int ), (int)124);
        }
        var7_9 = Math.cos(v22) * var3_3 * (double)var5_4;
        ** while (var9_7 || var9_7)
lbl134:
        // 1 sources

        v24 = var6_8;
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_6 = gh.kp - gh.efwk("egdx", efxi(int ), (int)64)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == gh.efwk("egdy", efwt(int ), (int)125)) break;
            v25 /* !! */  = (long)gh.efwk("egdz", efwt(int ), (int)126);
        }
        v26 = Math.toRadians(v24);
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_7 = gh.kp - gh.efwk("egea", efxi(int ), (int)65)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == gh.efwk("egeb", efwt(int ), (int)127)) break;
            v27 /* !! */  = (long)gh.efwk("egec", efwt(int ), (int)128);
        }
        v28 = -Math.sin(v26) * var3_3;
        v29 = var6_8;
        v30 /* !! */  = gh.kp;
        if (true) ** GOTO lbl152
        block76: while (true) {
            v30 /* !! */  = (long)(v31 - gh.efwk("eged", efxi(int ), (int)66));
lbl152:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case -1262799597: {
                    break block76;
                }
                case 282119893: {
                    v31 = gh.efwk("egee", efxi(int ), (int)67);
                    continue block76;
                }
                case 632429076: {
                    v31 = gh.efwk("egef", efxi(int ), (int)68);
                    continue block76;
                }
            }
            break;
        }
        v32 = Math.toRadians(v29);
        v33 /* !! */  = gh.kp;
        if (true) ** GOTO lbl166
        block77: while (true) {
            v33 /* !! */  = (long)(v34 - gh.efwk("egeg", efxi(int ), (int)69));
lbl166:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case -1803327337: {
                    v34 = gh.efwk("egeh", efxi(int ), (int)70);
                    continue block77;
                }
                case -1563611377: {
                    v34 = gh.efwk("egei", efxi(int ), (int)71);
                    continue block77;
                }
                case -1262799597: {
                    break block77;
                }
                case 1463313916: {
                    v34 = gh.efwk("egej", efxi(int ), (int)72);
                    continue block77;
                }
            }
            break;
        }
        v35 = v28 + Math.cos(v32) * var7_9;
        v36 = var6_8;
        v37 /* !! */  = gh.kp;
        if (true) ** GOTO lbl184
        block78: while (true) {
            v37 /* !! */  = (long)(v38 - gh.efwk("egek", efxi(int ), (int)73));
lbl184:
            // 2 sources

            switch ((int)v37 /* !! */ ) {
                case -1576598125: {
                    v38 = gh.efwk("egel", efxi(int ), (int)74);
                    continue block78;
                }
                case -1288523925: {
                    v38 = gh.efwk("egem", efxi(int ), (int)75);
                    continue block78;
                }
                case -1262799597: {
                    break block78;
                }
                case -406532396: {
                    v38 = gh.efwk("egen", efxi(int ), (int)76);
                    continue block78;
                }
            }
            break;
        }
        v39 = Math.toRadians(v36);
        while (true) {
            if ((v40 /* !! */  = (cfr_temp_8 = gh.kp - gh.efwk("egeo", efxi(int ), (int)77)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v40 /* !! */  == gh.efwk("egep", efwt(int ), (int)129)) break;
            v40 /* !! */  = (long)gh.efwk("egeq", efwt(int ), (int)130);
        }
        v41 = Math.cos(v39) * var3_3;
        v42 = var6_8;
        while (true) {
            if ((v43 /* !! */  = (cfr_temp_9 = gh.kp - gh.efwk("eger", efxi(int ), (int)78)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v43 /* !! */  == gh.efwk("eges", efwt(int ), (int)131)) break;
            v43 /* !! */  = (long)gh.efwk("eget", efwt(int ), (int)132);
        }
        v44 = Math.toRadians(v42);
        v45 /* !! */  = gh.kp;
        if (true) ** GOTO lbl214
        block81: while (true) {
            v45 /* !! */  = (long)(v46 - gh.efwk("egeu", efxi(int ), (int)79));
lbl214:
            // 2 sources

            switch ((int)v45 /* !! */ ) {
                case -1262799597: {
                    break block81;
                }
                case -1068095306: {
                    v46 = gh.efwk("egev", efxi(int ), (int)80);
                    continue block81;
                }
                case -882699909: {
                    v46 = gh.efwk("egew", efxi(int ), (int)81);
                    continue block81;
                }
                case -869625916: {
                    v46 = gh.efwk("egex", efxi(int ), (int)82);
                    continue block81;
                }
            }
            break;
        }
        v47 = v41 + Math.sin(v44) * var7_9;
        v48 /* !! */  = gh.kp;
        if (true) ** GOTO lbl231
        block82: while (true) {
            v48 /* !! */  = (long)(v49 - gh.efwk("egey", efxi(int ), (int)83));
lbl231:
            // 2 sources

            switch ((int)v48 /* !! */ ) {
                case -1262799597: {
                    break block82;
                }
                case 1106502347: {
                    v49 = gh.efwk("egez", efxi(int ), (int)84);
                    continue block82;
                }
                case 2008041600: {
                    v49 = gh.efwk("egfa", efxi(int ), (int)85);
                    continue block82;
                }
            }
            break;
        }
        return var2_2.method_1031(v35, 0.0, v47);
    }

    private static /* synthetic */ void ehix() {
        gh.efwi[100] = 1474807936;
        gh.efwi[101] = -727136190;
        gh.efwi[102] = 1063692597;
        gh.efwi[103] = 1178445800;
        gh.efwi[104] = -1629436065;
        gh.efwi[105] = 1210815464;
        gh.efwi[106] = 1672557508;
        gh.efwi[107] = 1516337357;
        gh.efwi[108] = 700827246;
        gh.efwi[109] = -859550943;
        gh.efwi[110] = -1076441191;
        gh.efwi[111] = 363041234;
        gh.efwi[112] = 1934333770;
        gh.efwi[113] = -1240288618;
        gh.efwi[114] = 262804496;
        gh.efwi[115] = 692720275;
        gh.efwi[116] = -362671374;
        gh.efwi[117] = -1928028112;
        gh.efwi[118] = -1349707347;
        gh.efwi[119] = 190552771;
        gh.efwi[120] = 1243064706;
        gh.efwi[121] = 428477200;
        gh.efwi[122] = 575733811;
        gh.efwi[123] = -685309566;
        gh.efwi[124] = 1705407984;
        gh.efwi[125] = 372746574;
        gh.efwi[126] = 1136766496;
        gh.efwi[127] = 1889905808;
        gh.efwi[128] = 922605185;
        gh.efwi[129] = -2059772212;
        gh.efwi[130] = 2056982373;
        gh.efwi[131] = -112637789;
        gh.efwi[132] = -1132552141;
        gh.efwi[133] = 446932071;
        gh.efwi[134] = 346549602;
        gh.efwi[135] = -1750208529;
        gh.efwi[136] = 957934131;
        gh.efwi[137] = 2061247741;
        gh.efwi[138] = -26103807;
        gh.efwi[139] = 1055274320;
        gh.efwi[140] = -215701100;
        gh.efwi[141] = 1066406677;
        gh.efwi[142] = -1743249358;
        gh.efwi[143] = -1330294332;
        gh.efwi[144] = -1640484323;
        gh.efwi[145] = 1365552539;
        gh.efwi[146] = -1223280422;
        gh.efwi[147] = -715211475;
        gh.efwi[148] = -1077780228;
        gh.efwi[149] = 751410953;
        gh.efwi[150] = -1983838934;
        gh.efwi[151] = 765441148;
        gh.efwi[152] = -1985207993;
        gh.efwi[153] = 2021640376;
        gh.efwi[154] = 1840535974;
        gh.efwi[155] = -1321074941;
        gh.efwi[156] = -1544023839;
        gh.efwi[157] = 1361961720;
        gh.efwi[158] = 1635603842;
        gh.efwi[159] = -364281751;
        gh.efwi[160] = 1568543648;
        gh.efwi[161] = 1652623939;
        gh.efwi[162] = -1913174634;
        gh.efwi[163] = -1030646824;
        gh.efwi[164] = 1141489884;
        gh.efwi[165] = -1600435567;
        gh.efwi[166] = -1312540348;
        gh.efwi[167] = -766625204;
        gh.efwi[168] = 2074194913;
        gh.efwi[169] = 649252465;
        gh.efwi[170] = 1975017903;
        gh.efwi[171] = -1490790696;
        gh.efwi[172] = -1178608147;
        gh.efwi[173] = -36727186;
        gh.efwi[174] = -1348038853;
        gh.efwi[175] = 144057270;
        gh.efwi[176] = -375221947;
        gh.efwi[177] = 1298529115;
        gh.efwi[178] = -1927047971;
        gh.efwi[179] = 1074026551;
        gh.efwi[180] = -77615790;
        gh.efwi[181] = -1966763225;
        gh.efwi[182] = -1009872114;
        gh.efwi[183] = 678285714;
        gh.efwi[184] = 726563115;
        gh.efwi[185] = 227045960;
        gh.efwi[186] = 411901926;
        gh.efwi[187] = -1785301957;
        gh.efwi[188] = 457317193;
        gh.efwi[189] = -1192029254;
        gh.efwi[190] = 261366090;
        gh.efwi[191] = -1856330529;
        gh.efwi[192] = 1242593764;
        gh.efwi[193] = -1316588874;
        gh.efwi[194] = 1740553068;
        gh.efwi[195] = 1905596393;
        gh.efwi[196] = 1081205104;
        gh.efwi[197] = 1594259778;
        gh.efwi[198] = 576531370;
        gh.efwi[199] = 1752728242;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$3() {
        v0 /* !! */  = gh.kp;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - gh.efwk("ehek", efxi(int ), (int)316));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1362654188: {
                    v1 = gh.efwk("ehel", efxi(int ), (int)317);
                    continue block29;
                }
                case -1262799597: {
                    break block29;
                }
                case 243003902: {
                    v1 = gh.efwk("ehem", efxi(int ), (int)318);
                    continue block29;
                }
            }
            break;
        }
        var3_1 = gh.c;
        v2 /* !! */  = gh.kp;
        if (true) ** GOTO lbl19
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - gh.efwk("ehen", efxi(int ), (int)319));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1262799597: {
                    break block30;
                }
                case 287461522: {
                    v3 = gh.efwk("eheo", efxi(int ), (int)320);
                    continue block30;
                }
                case 721794625: {
                    v3 = gh.efwk("ehep", efxi(int ), (int)321);
                    continue block30;
                }
                case 1752354877: {
                    v3 = gh.efwk("eheq", efxi(int ), (int)322);
                    continue block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = gh.b;
        v4 /* !! */  = gh.kp;
        if (true) ** GOTO lbl36
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - gh.efwk("eher", efxi(int ), (int)323));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1262799597: {
                    break block31;
                }
                case -386477886: {
                    v5 = gh.efwk("ehes", efxi(int ), (int)324);
                    continue block31;
                }
                case -189867219: {
                    v5 = gh.efwk("ehet", efxi(int ), (int)325);
                    continue block31;
                }
                case 166267961: {
                    v5 = gh.efwk("eheu", efxi(int ), (int)326);
                    continue block31;
                }
            }
            break;
        }
        var1_3 = gh.a;
        if (!var3_1) ** GOTO lbl55
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl55:
                // 1 sources

                if (var1_3 || var1_3) continue block32;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("ehev", efxi(int ), (int)327)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == gh.efwk("ehew", efwt(int ), (int)562)) break;
                    v6 /* !! */  = (long)gh.efwk("ehex", efwt(int ), (int)563);
                }
                v7 /* !! */  = gh.kp;
                if (true) ** GOTO lbl66
                block34: while (true) {
                    v7 /* !! */  = (long)(v8 - gh.efwk("ehey", efxi(int ), (int)328));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1262799597: {
                            break block34;
                        }
                        case -553099227: {
                            v8 = gh.efwk("ehez", efxi(int ), (int)329);
                            continue block34;
                        }
                        case 630693304: {
                            v8 = gh.efwk("ehfa", efxi(int ), (int)330);
                            continue block34;
                        }
                        case 1588230204: {
                            v8 = gh.efwk("ehfb", efxi(int ), (int)331);
                            continue block34;
                        }
                    }
                    break;
                }
                v9 = this.setting.isSelected("Direction Mode");
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("ehfc", efxi(int ), (int)332)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == gh.efwk("ehfd", efwt(int ), (int)564)) break;
                    v10 /* !! */  = (long)gh.efwk("ehfe", efwt(int ), (int)565);
                }
                return v9;
                case 0: {
                    var2_2 /* !! */  = (int)gh.efwk("ehff", efwt(int ), (int)566);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl96
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)gh.efwk("ehfg", efwt(int ), (int)567);
                        if (!var3_1) break block32;
                        throw null;
                    }
                }
lbl96:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)gh.efwk("ehfh", efwt(int ), (int)568);
                    if (!var3_1) break block32;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)gh.efwk("ehfi", efwt(int ), (int)569);
        ** while (!var3_1)
lbl103:
        // 1 sources

        throw null;
    }

    static {
        efwi = new int[620];
        efwj = new int[620];
        gh.ehiw();
        gh.ehix();
        gh.ehiy();
        gh.ehiz();
        gh.ehja();
        gh.ehjb();
        gh.ehjc();
        gh.ehjd();
        gh.ehje();
        gh.ehjf();
        gh.ehjg();
        gh.ehjh();
        gh.ehji();
        gh.ehjj();
        efxj = new long[374];
        efxk = new long[374];
        gh.ehjk();
        gh.ehjl();
        gh.ehjm();
        gh.ehjn();
        gh.ehjo();
        gh.ehjp();
        gh.ehjq();
        gh.ehjr();
        mc = class_310.method_1551();
    }

    public static /* synthetic */ CallSite efwk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ehjh() {
        gh.efwj[400] = 639809478;
        gh.efwj[401] = 973078970;
        gh.efwj[402] = -1627778083;
        gh.efwj[403] = 164391741;
        gh.efwj[404] = 490030246;
        gh.efwj[405] = 1431670681;
        gh.efwj[406] = 641719437;
        gh.efwj[407] = -1720903903;
        gh.efwj[408] = 1397652041;
        gh.efwj[409] = 439486243;
        gh.efwj[410] = 976071573;
        gh.efwj[411] = 1637806208;
        gh.efwj[412] = 605727124;
        gh.efwj[413] = -1834761777;
        gh.efwj[414] = 509503928;
        gh.efwj[415] = -1907873826;
        gh.efwj[416] = 1747192322;
        gh.efwj[417] = 995608413;
        gh.efwj[418] = 1791544919;
        gh.efwj[419] = -2012485407;
        gh.efwj[420] = 1554266463;
        gh.efwj[421] = 2058246258;
        gh.efwj[422] = 878357444;
        gh.efwj[423] = -1794100461;
        gh.efwj[424] = -770757388;
        gh.efwj[425] = 1907819896;
        gh.efwj[426] = -1788012195;
        gh.efwj[427] = 2001061972;
        gh.efwj[428] = 687829118;
        gh.efwj[429] = -1480873922;
        gh.efwj[430] = 1658791674;
        gh.efwj[431] = 363252339;
        gh.efwj[432] = 765639079;
        gh.efwj[433] = 1912636254;
        gh.efwj[434] = -1734166285;
        gh.efwj[435] = -1050859800;
        gh.efwj[436] = 1532012422;
        gh.efwj[437] = 1868916743;
        gh.efwj[438] = -38202429;
        gh.efwj[439] = 993982344;
        gh.efwj[440] = -1464126715;
        gh.efwj[441] = -1554672479;
        gh.efwj[442] = -1876694081;
        gh.efwj[443] = -2113636017;
        gh.efwj[444] = 633742302;
        gh.efwj[445] = 180056003;
        gh.efwj[446] = -1870730459;
        gh.efwj[447] = 1515656056;
        gh.efwj[448] = -1243349372;
        gh.efwj[449] = -1479035377;
        gh.efwj[450] = 1600693098;
        gh.efwj[451] = 1141634243;
        gh.efwj[452] = -174226597;
        gh.efwj[453] = -1055650363;
        gh.efwj[454] = -1433791546;
        gh.efwj[455] = 83575800;
        gh.efwj[456] = 628768000;
        gh.efwj[457] = 1970970883;
        gh.efwj[458] = -280522859;
        gh.efwj[459] = 1279576969;
        gh.efwj[460] = -26135613;
        gh.efwj[461] = 1422600768;
        gh.efwj[462] = -1465638629;
        gh.efwj[463] = -526110800;
        gh.efwj[464] = 797041235;
        gh.efwj[465] = -1316895849;
        gh.efwj[466] = -1209439798;
        gh.efwj[467] = 21797450;
        gh.efwj[468] = 413095263;
        gh.efwj[469] = -661604461;
        gh.efwj[470] = 1205874122;
        gh.efwj[471] = -1165302593;
        gh.efwj[472] = 36659487;
        gh.efwj[473] = 287027233;
        gh.efwj[474] = -754800212;
        gh.efwj[475] = 1763738279;
        gh.efwj[476] = 369907858;
        gh.efwj[477] = -1078524093;
        gh.efwj[478] = -1142563382;
        gh.efwj[479] = -1552649455;
        gh.efwj[480] = 960724461;
        gh.efwj[481] = -738002228;
        gh.efwj[482] = 535176333;
        gh.efwj[483] = 2019349441;
        gh.efwj[484] = -1023086603;
        gh.efwj[485] = -1653428159;
        gh.efwj[486] = 2063449978;
        gh.efwj[487] = 156267616;
        gh.efwj[488] = 679838851;
        gh.efwj[489] = -891423624;
        gh.efwj[490] = -958250111;
        gh.efwj[491] = -1145924053;
        gh.efwj[492] = 1278058893;
        gh.efwj[493] = -1000601841;
        gh.efwj[494] = -1439453539;
        gh.efwj[495] = 221603658;
        gh.efwj[496] = 1904731302;
        gh.efwj[497] = -1756631252;
        gh.efwj[498] = -856699709;
        gh.efwj[499] = -2007498664;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$1() {
        boolean bl2;
        Object object = kp;
        boolean bl3 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gh.efwk("ehhc", efxi(int ), (int)350);
            }
            switch ((int)object) {
                case -1262799597: {
                    break block22;
                }
                case -255173456: {
                    callSite = gh.efwk("ehhd", efxi(int ), (int)351);
                    continue block22;
                }
                case 618368981: {
                    callSite = gh.efwk("ehhe", efxi(int ), (int)352);
                    continue block22;
                }
                case 1921556690: {
                    callSite = gh.efwk("ehhf", efxi(int ), (int)353);
                    continue block22;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = kp;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - gh.efwk("ehhg", efxi(int ), (int)354);
            }
            switch ((int)object2) {
                case -1262799597: {
                    break block23;
                }
                case -69877951: {
                    callSite = gh.efwk("ehhh", efxi(int ), (int)355);
                    continue block23;
                }
                case 55727984: {
                    callSite = gh.efwk("ehhi", efxi(int ), (int)356);
                    continue block23;
                }
                case 926270825: {
                    callSite = gh.efwk("ehhj", efxi(int ), (int)357);
                    continue block23;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = kp - gh.efwk("ehhk", efxi(int ), (int)358)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == gh.efwk("ehhl", efwt(int ), (int)598)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gh.efwk("ehhm", efwt(int ), (int)599);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = kp;
        boolean bl6 = true;
        block25: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - gh.efwk("ehhn", efxi(int ), (int)359);
            }
            switch ((int)object4) {
                case -1262799597: {
                    break block25;
                }
                case 53403910: {
                    callSite = gh.efwk("ehho", efxi(int ), (int)360);
                    continue block25;
                }
                case 564820819: {
                    callSite = gh.efwk("ehhp", efxi(int ), (int)361);
                    continue block25;
                }
            }
            break;
        }
        Object object5 = kp;
        boolean bl7 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object5 = callSite - gh.efwk("ehhq", efxi(int ), (int)362);
            }
            switch ((int)object5) {
                case -1262799597: {
                    break block26;
                }
                case 382365385: {
                    callSite = gh.efwk("ehhr", efxi(int ), (int)363);
                    continue block26;
                }
                case 1234504235: {
                    callSite = gh.efwk("ehhs", efxi(int ), (int)364);
                    continue block26;
                }
            }
            break;
        }
        boolean bl8 = this.mode.isSelected("Matrix");
        while (true) {
            long l3;
            Object object6;
            if ((object6 = (l3 = kp - gh.efwk("ehht", efxi(int ), (int)365)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object6 == gh.efwk("ehhu", efwt(int ), (int)600)) {
                return bl8;
            }
            object6 = gh.efwk("ehhv", efwt(int ), (int)601);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$4() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("ehdq", efxi(int ), (int)304)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gh.efwk("ehdr", efwt(int ), (int)554)) break;
            v0 /* !! */  = (long)gh.efwk("ehds", efwt(int ), (int)555);
        }
        var3_1 = gh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("ehdt", efxi(int ), (int)305)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gh.efwk("ehdu", efwt(int ), (int)556)) break;
            v1 /* !! */  = (long)gh.efwk("ehdv", efwt(int ), (int)557);
        }
        var2_2 /* !! */  = gh.b;
        v2 /* !! */  = gh.kp;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(gh.efwk("ehdx", efxi(int ), (int)307) - gh.efwk("ehdw", efxi(int ), (int)306));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2041145804: {
                    continue block26;
                }
                case -1262799597: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = gh.a;
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
                v3 /* !! */  = gh.kp;
                if (true) ** GOTO lbl38
                block28: while (true) {
                    v3 /* !! */  = (long)(v4 - gh.efwk("ehdy", efxi(int ), (int)308));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2073337834: {
                            v4 = gh.efwk("ehdz", efxi(int ), (int)309);
                            continue block28;
                        }
                        case -1262799597: {
                            break block28;
                        }
                        case -485528765: {
                            v4 = gh.efwk("ehea", efxi(int ), (int)310);
                            continue block28;
                        }
                    }
                    break;
                }
                v5 /* !! */  = gh.kp;
                if (true) ** GOTO lbl51
                block29: while (true) {
                    v5 /* !! */  = (long)(gh.efwk("ehec", efxi(int ), (int)312) - gh.efwk("eheb", efxi(int ), (int)311));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1262799597: {
                            break block29;
                        }
                        case 726751340: {
                            continue block29;
                        }
                    }
                    break;
                }
                v6 = this.mode.isSelected("Matrix");
                v7 /* !! */  = gh.kp;
                if (true) ** GOTO lbl61
                block30: while (true) {
                    v7 /* !! */  = (long)(v8 - gh.efwk("ehed", efxi(int ), (int)313));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1262799597: {
                            break block30;
                        }
                        case 823405108: {
                            v8 = gh.efwk("ehee", efxi(int ), (int)314);
                            continue block30;
                        }
                        case 1895916491: {
                            v8 = gh.efwk("ehef", efxi(int ), (int)315);
                            continue block30;
                        }
                    }
                    break;
                }
                return v6;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)gh.efwk("eheg", efwt(int ), (int)558);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)gh.efwk("eheh", efwt(int ), (int)559);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gh.efwk("ehei", efwt(int ), (int)560);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gh.efwk("ehej", efwt(int ), (int)561);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ehjc() {
        gh.efwi[600] = -1105633522;
        gh.efwi[601] = 78634118;
        gh.efwi[602] = 553859450;
        gh.efwi[603] = 616314751;
        gh.efwi[604] = 1696746726;
        gh.efwi[605] = -1433677912;
        gh.efwi[606] = -1080100716;
        gh.efwi[607] = 411858940;
        gh.efwi[608] = -304259088;
        gh.efwi[609] = 1483607042;
        gh.efwi[610] = 1319375688;
        gh.efwi[611] = -1537677849;
        gh.efwi[612] = -1742783869;
        gh.efwi[613] = 161734124;
        gh.efwi[614] = 1872241181;
        gh.efwi[615] = -1115457350;
        gh.efwi[616] = 302965275;
        gh.efwi[617] = 261959182;
        gh.efwi[618] = 1150677173;
        gh.efwi[619] = -523136874;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 calculateGrimNextPoint(class_1309 var1_1) {
        v0 /* !! */  = gh.kp;
        if (true) ** GOTO lbl5
        block64: while (true) {
            v0 /* !! */  = (long)(v1 - gh.efwk("egae", efxi(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2125542052: {
                    v1 = gh.efwk("egaf", efxi(int ), (int)8);
                    continue block64;
                }
                case -1941398226: {
                    v1 = gh.efwk("egag", efxi(int ), (int)9);
                    continue block64;
                }
                case -1262799597: {
                    break block64;
                }
                case 1793803880: {
                    v1 = gh.efwk("egah", efxi(int ), (int)10);
                    continue block64;
                }
            }
            break;
        }
        var9_2 = gh.c;
        v2 /* !! */  = gh.kp;
        if (true) ** GOTO lbl22
        block65: while (true) {
            v2 /* !! */  = (long)(v3 - gh.efwk("egai", efxi(int ), (int)11));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1262799597: {
                    break block65;
                }
                case 1874475526: {
                    v3 = gh.efwk("egaj", efxi(int ), (int)12);
                    continue block65;
                }
                case 2010191902: {
                    v3 = gh.efwk("egak", efxi(int ), (int)13);
                    continue block65;
                }
                case 2080361164: {
                    v3 = gh.efwk("egal", efxi(int ), (int)14);
                    continue block65;
                }
            }
            break;
        }
        var8_3 /* !! */  = gh.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("egam", efxi(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gh.efwk("egan", efwt(int ), (int)86)) break;
            v4 /* !! */  = (long)gh.efwk("egao", efwt(int ), (int)87);
        }
        var7_4 = gh.a;
        if (var9_2) {
            throw null;
lbl43:
            // 7 sources

            return null;
        }
        if (var7_4 || var7_4) ** GOTO lbl43
        v5 /* !! */  = gh.kp;
        if (true) ** GOTO lbl50
        block68: while (true) {
            v5 /* !! */  = (long)(gh.efwk("egaq", efxi(int ), (int)17) - gh.efwk("egap", efxi(int ), (int)16));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1833837671: {
                    continue block68;
                }
                case -1262799597: {
                    break block68;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("egar", efxi(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gh.efwk("egas", efwt(int ), (int)88)) break;
            v6 /* !! */  = (long)gh.efwk("egat", efwt(int ), (int)89);
        }
        v7 = gh.mc.field_1724;
        v8 /* !! */  = gh.kp;
        if (true) ** GOTO lbl65
        block70: while (true) {
            v8 /* !! */  = (long)(v9 - gh.efwk("egau", efxi(int ), (int)19));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1262799597: {
                    break block70;
                }
                case -169702434: {
                    v9 = gh.efwk("egav", efxi(int ), (int)20);
                    continue block70;
                }
                case 464649643: {
                    v9 = gh.efwk("egaw", efxi(int ), (int)21);
                    continue block70;
                }
                case 1158162075: {
                    v9 = gh.efwk("egax", efxi(int ), (int)22);
                    continue block70;
                }
            }
            break;
        }
        var2_5 = v7.method_73189();
        if (var7_4 || var7_4) ** GOTO lbl43
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("egay", efxi(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gh.efwk("egaz", efwt(int ), (int)90)) break;
                    v10 /* !! */  = (long)gh.efwk("egba", efwt(int ), (int)91);
                }
                var3_6 = var1_1.method_73189();
                if (var7_4 || var7_4) ** GOTO lbl43
                v11 /* !! */  = gh.kp;
                if (true) ** GOTO lbl93
                block72: while (true) {
                    v11 /* !! */  = (long)(v12 - gh.efwk("egbb", efxi(int ), (int)24));
lbl93:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1807861582: {
                            v12 = gh.efwk("egbc", efxi(int ), (int)25);
                            continue block72;
                        }
                        case -1401324689: {
                            v12 = gh.efwk("egbd", efxi(int ), (int)26);
                            continue block72;
                        }
                        case -1262799597: {
                            break block72;
                        }
                        case 144615703: {
                            v12 = gh.efwk("egbe", efxi(int ), (int)27);
                            continue block72;
                        }
                    }
                    break;
                }
                v13 /* !! */  = gh.kp;
                if (true) ** GOTO lbl109
                block73: while (true) {
                    v13 /* !! */  = (long)(gh.efwk("egbg", efxi(int ), (int)29) - gh.efwk("egbf", efxi(int ), (int)28));
lbl109:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1424103918: {
                            continue block73;
                        }
                        case -1262799597: {
                            break block73;
                        }
                    }
                    break;
                }
                var4_7 = this.grimRadius.getValue();
                if (var7_4 || var7_4) ** GOTO lbl43
                v14 /* !! */  = gh.kp;
                if (true) ** GOTO lbl120
                block74: while (true) {
                    v14 /* !! */  = (long)(v15 - gh.efwk("egbh", efxi(int ), (int)30));
lbl120:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1262799597: {
                            break block74;
                        }
                        case 916975321: {
                            v15 = gh.efwk("egbi", efxi(int ), (int)31);
                            continue block74;
                        }
                        case 1284213372: {
                            v15 = gh.efwk("egbj", efxi(int ), (int)32);
                            continue block74;
                        }
                    }
                    break;
                }
                var6_8 = this.getDirectionMultiplier();
                if (var7_4 || var7_4) ** GOTO lbl43
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("egbk", efxi(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == gh.efwk("egbl", efwt(int ), (int)92)) break;
                    v16 /* !! */  = (long)gh.efwk("egbm", efwt(int ), (int)93);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("egbn", efxi(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == gh.efwk("egbo", efwt(int ), (int)94)) break;
                    v17 /* !! */  = (long)gh.efwk("egbp", efwt(int ), (int)95);
                }
                if (!this.setting.isSelected("In front of the target")) ** GOTO lbl153
                if (var7_4 || var7_4) ** GOTO lbl43
                v18 /* !! */  = gh.kp;
                if (true) ** GOTO lbl147
                block77: while (true) {
                    v18 /* !! */  = (long)(gh.efwk("egbr", efxi(int ), (int)36) - gh.efwk("egbq", efxi(int ), (int)35));
lbl147:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1262799597: {
                            break block77;
                        }
                        case 1062908298: {
                            continue block77;
                        }
                    }
                    break;
                }
                return this.calculateFrontPoint(var1_1, var3_6, var4_7, var6_8);
lbl153:
                // 1 sources

                if (var7_4 || var7_4) ** continue;
                v19 /* !! */  = gh.kp;
                if (true) ** GOTO lbl158
                block78: while (true) {
                    v19 /* !! */  = (long)(gh.efwk("egbt", efxi(int ), (int)38) - gh.efwk("egbs", efxi(int ), (int)37));
lbl158:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1262799597: {
                            break block78;
                        }
                        case 1104493188: {
                            continue block78;
                        }
                    }
                    break;
                }
                return this.calculateNormalPoint(var2_5, var3_6, var4_7, var6_8);
            }
            case 0: {
                var8_3 /* !! */  = (int)gh.efwk("egbu", efwt(int ), (int)96);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 1: {
                var8_3 /* !! */  = (int)gh.efwk("egbv", efwt(int ), (int)97);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl174:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)gh.efwk("egbw", efwt(int ), (int)98);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 3: {
                var8_3 /* !! */  = (int)gh.efwk("egbx", efwt(int ), (int)99);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 4: {
                var8_3 /* !! */  = (int)gh.efwk("egby", efwt(int ), (int)100);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 5: {
                var8_3 /* !! */  = (int)gh.efwk("egbz", efwt(int ), (int)101);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl194:
            // 3 sources

            case 6: {
                var8_3 /* !! */  = (int)gh.efwk("egca", efwt(int ), (int)102);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl199:
            // 2 sources

            case 7: {
                var8_3 /* !! */  = (int)gh.efwk("egcb", efwt(int ), (int)103);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl204:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)gh.efwk("egcc", efwt(int ), (int)104);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl231
                    break;
                }
            }
            case 9: {
                var8_3 /* !! */  = (int)gh.efwk("egcd", efwt(int ), (int)105);
                if (!var9_2) ** GOTO lbl174
                throw null;
            }
            case 10: {
                var8_3 /* !! */  = (int)gh.efwk("egce", efwt(int ), (int)106);
                if (!var9_2) break;
                throw null;
            }
lbl218:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)gh.efwk("egcf", efwt(int ), (int)107);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 12: {
                var8_3 /* !! */  = (int)gh.efwk("egcg", efwt(int ), (int)108);
                if (!var9_2) ** GOTO lbl194
                throw null;
            }
            case 13: {
                var8_3 /* !! */  = (int)gh.efwk("egch", efwt(int ), (int)109);
                if (!var9_2) ** GOTO lbl194
                throw null;
            }
lbl231:
            // 3 sources

            case 14: {
                var8_3 /* !! */  = (int)gh.efwk("egci", efwt(int ), (int)110);
                if (!var9_2) break;
                throw null;
            }
lbl235:
            // 5 sources

            case 15: {
                var8_3 /* !! */  = (int)gh.efwk("egcj", efwt(int ), (int)111);
                if (!var9_2) ** GOTO lbl174
                throw null;
            }
            case 16: 
        }
        var8_3 /* !! */  = (int)gh.efwk("egck", efwt(int ), (int)112);
        ** while (!var9_2)
lbl242:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehiz() {
        gh.efwi[300] = -101558348;
        gh.efwi[301] = -1875142148;
        gh.efwi[302] = -285906186;
        gh.efwi[303] = -1384558030;
        gh.efwi[304] = 331885448;
        gh.efwi[305] = -1146047963;
        gh.efwi[306] = 431024871;
        gh.efwi[307] = -202363311;
        gh.efwi[308] = 1450416489;
        gh.efwi[309] = 178958219;
        gh.efwi[310] = 1552779366;
        gh.efwi[311] = -492751946;
        gh.efwi[312] = 469220736;
        gh.efwi[313] = -1728161886;
        gh.efwi[314] = 2017723866;
        gh.efwi[315] = -1494005250;
        gh.efwi[316] = -943571974;
        gh.efwi[317] = 1801437628;
        gh.efwi[318] = 1398876541;
        gh.efwi[319] = 531872547;
        gh.efwi[320] = -1041268474;
        gh.efwi[321] = -1914326707;
        gh.efwi[322] = -801935688;
        gh.efwi[323] = -604967694;
        gh.efwi[324] = 928920630;
        gh.efwi[325] = 43408549;
        gh.efwi[326] = 1772465880;
        gh.efwi[327] = -238088974;
        gh.efwi[328] = -714093945;
        gh.efwi[329] = -1754268809;
        gh.efwi[330] = -1769298327;
        gh.efwi[331] = 1343848121;
        gh.efwi[332] = -1162190867;
        gh.efwi[333] = -244120055;
        gh.efwi[334] = 1828924490;
        gh.efwi[335] = -1055122835;
        gh.efwi[336] = -1698343812;
        gh.efwi[337] = 463134122;
        gh.efwi[338] = -43458173;
        gh.efwi[339] = -1901941093;
        gh.efwi[340] = -272885798;
        gh.efwi[341] = -132506645;
        gh.efwi[342] = 568893476;
        gh.efwi[343] = -521774667;
        gh.efwi[344] = -31470462;
        gh.efwi[345] = -54799277;
        gh.efwi[346] = -663429199;
        gh.efwi[347] = 964030213;
        gh.efwi[348] = 819904311;
        gh.efwi[349] = 324239118;
        gh.efwi[350] = -2004230285;
        gh.efwi[351] = 1167290314;
        gh.efwi[352] = 1080571452;
        gh.efwi[353] = -745833240;
        gh.efwi[354] = -1447700702;
        gh.efwi[355] = 344732487;
        gh.efwi[356] = 953685134;
        gh.efwi[357] = -1315541211;
        gh.efwi[358] = 1172345638;
        gh.efwi[359] = 1389038136;
        gh.efwi[360] = 1765073473;
        gh.efwi[361] = -84957999;
        gh.efwi[362] = -1279663338;
        gh.efwi[363] = 747521164;
        gh.efwi[364] = -1736233756;
        gh.efwi[365] = -1899483113;
        gh.efwi[366] = 116309304;
        gh.efwi[367] = -1594436910;
        gh.efwi[368] = -461887639;
        gh.efwi[369] = -1644440013;
        gh.efwi[370] = -946385005;
        gh.efwi[371] = -2096772298;
        gh.efwi[372] = -285271355;
        gh.efwi[373] = -222055899;
        gh.efwi[374] = 1944652640;
        gh.efwi[375] = -158787138;
        gh.efwi[376] = 1351516133;
        gh.efwi[377] = -1425105692;
        gh.efwi[378] = -1447001313;
        gh.efwi[379] = -1585980052;
        gh.efwi[380] = -871314605;
        gh.efwi[381] = -1724190649;
        gh.efwi[382] = -1112801542;
        gh.efwi[383] = -386000692;
        gh.efwi[384] = 1913542834;
        gh.efwi[385] = -383143580;
        gh.efwi[386] = 552759016;
        gh.efwi[387] = -1509646843;
        gh.efwi[388] = -2111648584;
        gh.efwi[389] = 1730088688;
        gh.efwi[390] = 257800109;
        gh.efwi[391] = -802722518;
        gh.efwi[392] = 1894475702;
        gh.efwi[393] = 610821828;
        gh.efwi[394] = 1256675904;
        gh.efwi[395] = -2067657154;
        gh.efwi[396] = -428497456;
        gh.efwi[397] = -742506616;
        gh.efwi[398] = -132539815;
        gh.efwi[399] = -1854869296;
    }

    private static /* synthetic */ long efxi(int n2) {
        return efxj[n2] ^ efxk[n2];
    }

    private static /* synthetic */ void ehja() {
        gh.efwi[400] = 639809484;
        gh.efwi[401] = 973078957;
        gh.efwi[402] = -1627778083;
        gh.efwi[403] = 164391739;
        gh.efwi[404] = 490030245;
        gh.efwi[405] = 1431670676;
        gh.efwi[406] = 641719427;
        gh.efwi[407] = -1720903904;
        gh.efwi[408] = -576273717;
        gh.efwi[409] = 439486242;
        gh.efwi[410] = -333431083;
        gh.efwi[411] = 1637806209;
        gh.efwi[412] = 1400569183;
        gh.efwi[413] = 1834761776;
        gh.efwi[414] = 1294471665;
        gh.efwi[415] = -1907873825;
        gh.efwi[416] = -268936135;
        gh.efwi[417] = 995608412;
        gh.efwi[418] = 207940277;
        gh.efwi[419] = -893392671;
        gh.efwi[420] = -1554266464;
        gh.efwi[421] = -960072292;
        gh.efwi[422] = 878357445;
        gh.efwi[423] = 1075726509;
        gh.efwi[424] = -770757387;
        gh.efwi[425] = -1851592746;
        gh.efwi[426] = 1788012194;
        gh.efwi[427] = -56219037;
        gh.efwi[428] = 687829114;
        gh.efwi[429] = -1480873931;
        gh.efwi[430] = 1658791668;
        gh.efwi[431] = 363252346;
        gh.efwi[432] = 765639087;
        gh.efwi[433] = 1912636242;
        gh.efwi[434] = -1734166276;
        gh.efwi[435] = -1050859807;
        gh.efwi[436] = 1532012431;
        gh.efwi[437] = 1868916746;
        gh.efwi[438] = -38202418;
        gh.efwi[439] = 993982351;
        gh.efwi[440] = -1464126714;
        gh.efwi[441] = -1554672467;
        gh.efwi[442] = -1876694090;
        gh.efwi[443] = -2113636021;
        gh.efwi[444] = 633742302;
        gh.efwi[445] = 180056002;
        gh.efwi[446] = -1870730457;
        gh.efwi[447] = 1515656059;
        gh.efwi[448] = -145228156;
        gh.efwi[449] = -1479035386;
        gh.efwi[450] = 1600693088;
        gh.efwi[451] = 1141634245;
        gh.efwi[452] = -174226607;
        gh.efwi[453] = -1055650364;
        gh.efwi[454] = -1433791552;
        gh.efwi[455] = 83575805;
        gh.efwi[456] = 628768007;
        gh.efwi[457] = 1970970898;
        gh.efwi[458] = -280522876;
        gh.efwi[459] = 1279576965;
        gh.efwi[460] = -26135604;
        gh.efwi[461] = 1422600788;
        gh.efwi[462] = -1465638639;
        gh.efwi[463] = -526110789;
        gh.efwi[464] = 797041239;
        gh.efwi[465] = -1316895866;
        gh.efwi[466] = -1209439802;
        gh.efwi[467] = 21797448;
        gh.efwi[468] = 413095259;
        gh.efwi[469] = -661604456;
        gh.efwi[470] = -1205874123;
        gh.efwi[471] = 2031019529;
        gh.efwi[472] = 36659486;
        gh.efwi[473] = -53821351;
        gh.efwi[474] = -754800211;
        gh.efwi[475] = 1580274971;
        gh.efwi[476] = -369907859;
        gh.efwi[477] = -1918186624;
        gh.efwi[478] = 1142563381;
        gh.efwi[479] = -513093382;
        gh.efwi[480] = 960724460;
        gh.efwi[481] = -448842402;
        gh.efwi[482] = 535176332;
        gh.efwi[483] = -1745391534;
        gh.efwi[484] = -1023086604;
        gh.efwi[485] = -1983326038;
        gh.efwi[486] = 2063449979;
        gh.efwi[487] = 1716671578;
        gh.efwi[488] = -679838852;
        gh.efwi[489] = -1374768403;
        gh.efwi[490] = -958250112;
        gh.efwi[491] = -2104922129;
        gh.efwi[492] = -1278058894;
        gh.efwi[493] = -18901131;
        gh.efwi[494] = -1439453540;
        gh.efwi[495] = -384458894;
        gh.efwi[496] = 859038886;
        gh.efwi[497] = -1756631251;
        gh.efwi[498] = -648065083;
        gh.efwi[499] = -2007498663;
    }

    private static /* synthetic */ int efwt(int n2) {
        return efwi[n2] ^ efwj[n2];
    }

    private static /* synthetic */ void ehje() {
        gh.efwj[100] = 1474807948;
        gh.efwj[101] = -727136184;
        gh.efwj[102] = 1063692606;
        gh.efwj[103] = 1178445800;
        gh.efwj[104] = -1629436067;
        gh.efwj[105] = 1210815465;
        gh.efwj[106] = 1672557519;
        gh.efwj[107] = 1516337373;
        gh.efwj[108] = 700827242;
        gh.efwj[109] = -859550942;
        gh.efwj[110] = -1076441186;
        gh.efwj[111] = 363041238;
        gh.efwj[112] = 1934333765;
        gh.efwj[113] = 1240288617;
        gh.efwj[114] = -721312500;
        gh.efwj[115] = -692720276;
        gh.efwj[116] = 548341466;
        gh.efwj[117] = -1928028111;
        gh.efwj[118] = -907369690;
        gh.efwj[119] = -190552772;
        gh.efwj[120] = 2138930419;
        gh.efwj[121] = -428477201;
        gh.efwj[122] = -387965272;
        gh.efwj[123] = -685309565;
        gh.efwj[124] = 1721673789;
        gh.efwj[125] = 372746575;
        gh.efwj[126] = -1985556334;
        gh.efwj[127] = 1889905809;
        gh.efwj[128] = -1959269871;
        gh.efwj[129] = 2059772211;
        gh.efwj[130] = -1348004976;
        gh.efwj[131] = -112637790;
        gh.efwj[132] = -2096001585;
        gh.efwj[133] = 446932068;
        gh.efwj[134] = 346549605;
        gh.efwj[135] = -1750208535;
        gh.efwj[136] = 957934143;
        gh.efwj[137] = 2061247743;
        gh.efwj[138] = -26103808;
        gh.efwj[139] = 1055274331;
        gh.efwj[140] = -215701096;
        gh.efwj[141] = 1066406681;
        gh.efwj[142] = -1743249356;
        gh.efwj[143] = -1330294329;
        gh.efwj[144] = -1640484321;
        gh.efwj[145] = 1365552541;
        gh.efwj[146] = -1223280422;
        gh.efwj[147] = -715211476;
        gh.efwj[148] = -1077780226;
        gh.efwj[149] = 751410954;
        gh.efwj[150] = -1983838943;
        gh.efwj[151] = 765441138;
        gh.efwj[152] = -1985207977;
        gh.efwj[153] = 2021640352;
        gh.efwj[154] = 1840535987;
        gh.efwj[155] = -1321074933;
        gh.efwj[156] = -1544023816;
        gh.efwj[157] = 1361961721;
        gh.efwj[158] = 1635603867;
        gh.efwj[159] = -364281735;
        gh.efwj[160] = 1568543649;
        gh.efwj[161] = 1652623961;
        gh.efwj[162] = -1913174629;
        gh.efwj[163] = -1030646846;
        gh.efwj[164] = 1141489885;
        gh.efwj[165] = -1600435580;
        gh.efwj[166] = -1312540321;
        gh.efwj[167] = -766625201;
        gh.efwj[168] = 2074194935;
        gh.efwj[169] = 649252468;
        gh.efwj[170] = 1975017918;
        gh.efwj[171] = -1490790689;
        gh.efwj[172] = -1178608157;
        gh.efwj[173] = -36727188;
        gh.efwj[174] = -1348038850;
        gh.efwj[175] = 144057279;
        gh.efwj[176] = -375221923;
        gh.efwj[177] = 1298529100;
        gh.efwj[178] = -812149539;
        gh.efwj[179] = 1074026551;
        gh.efwj[180] = -77615790;
        gh.efwj[181] = -1966763225;
        gh.efwj[182] = -1009872114;
        gh.efwj[183] = 678285715;
        gh.efwj[184] = 726563114;
        gh.efwj[185] = 227045961;
        gh.efwj[186] = 411901927;
        gh.efwj[187] = -1785301958;
        gh.efwj[188] = 457317192;
        gh.efwj[189] = -1192029253;
        gh.efwj[190] = 261366091;
        gh.efwj[191] = -1856330530;
        gh.efwj[192] = 1242593765;
        gh.efwj[193] = -1316588873;
        gh.efwj[194] = 1740553069;
        gh.efwj[195] = 1905596392;
        gh.efwj[196] = 1081205050;
        gh.efwj[197] = 1594259793;
        gh.efwj[198] = 576531337;
        gh.efwj[199] = 1752728243;
    }

    private static /* synthetic */ void ehjr() {
        gh.efxk[300] = 5143673158413762728L;
        gh.efxk[301] = 4516299890637569797L;
        gh.efxk[302] = -3933696181387005469L;
        gh.efxk[303] = 7050023407437031854L;
        gh.efxk[304] = -2709598328600806509L;
        gh.efxk[305] = 3684498461792615524L;
        gh.efxk[306] = -5635836691010537236L;
        gh.efxk[307] = -7626939409282987417L;
        gh.efxk[308] = -4271046255637017401L;
        gh.efxk[309] = -3865782974989108522L;
        gh.efxk[310] = -2679865345279265155L;
        gh.efxk[311] = -3976147524210644309L;
        gh.efxk[312] = 3021845219690975034L;
        gh.efxk[313] = 301869660157602884L;
        gh.efxk[314] = -7175602955821807164L;
        gh.efxk[315] = 294576093768350086L;
        gh.efxk[316] = -5234845046423798857L;
        gh.efxk[317] = -8271146125229821555L;
        gh.efxk[318] = 4734482918396085424L;
        gh.efxk[319] = -3924476706794933758L;
        gh.efxk[320] = -534765709343096002L;
        gh.efxk[321] = -4060744082317545878L;
        gh.efxk[322] = 2967525048796876836L;
        gh.efxk[323] = 7745315402656430406L;
        gh.efxk[324] = -6731352768972894282L;
        gh.efxk[325] = -1380568095904122022L;
        gh.efxk[326] = 8879967377908159370L;
        gh.efxk[327] = -1368753894185824644L;
        gh.efxk[328] = -3925139866958401106L;
        gh.efxk[329] = 2780697397974147486L;
        gh.efxk[330] = 7127106070639831663L;
        gh.efxk[331] = 4022563895698521647L;
        gh.efxk[332] = -6222288481682839731L;
        gh.efxk[333] = -4431541457916531407L;
        gh.efxk[334] = 1927225216646347103L;
        gh.efxk[335] = 1789406384236797414L;
        gh.efxk[336] = -1284395564870303465L;
        gh.efxk[337] = 401440161064160398L;
        gh.efxk[338] = 1650960178201394190L;
        gh.efxk[339] = 7217631679730923620L;
        gh.efxk[340] = 5443640915515274755L;
        gh.efxk[341] = -6797457832646845019L;
        gh.efxk[342] = -4266112498606432033L;
        gh.efxk[343] = -4614938200929889050L;
        gh.efxk[344] = -3622337605662315758L;
        gh.efxk[345] = -2640839129764742493L;
        gh.efxk[346] = -942853545002057031L;
        gh.efxk[347] = -8140881617827281529L;
        gh.efxk[348] = -5134412097764943049L;
        gh.efxk[349] = -4915591177668294969L;
        gh.efxk[350] = 472059046532493706L;
        gh.efxk[351] = 8919656289598086824L;
        gh.efxk[352] = 3900645475073628738L;
        gh.efxk[353] = -7708600288840451031L;
        gh.efxk[354] = -799560851903567626L;
        gh.efxk[355] = 6526722447508967477L;
        gh.efxk[356] = 6228269621869053566L;
        gh.efxk[357] = 7848784858438461715L;
        gh.efxk[358] = 1823742715814266819L;
        gh.efxk[359] = -4523923422220529665L;
        gh.efxk[360] = 7073110457366718431L;
        gh.efxk[361] = -6882799943290281434L;
        gh.efxk[362] = 2759715189110423318L;
        gh.efxk[363] = -8069236345621981789L;
        gh.efxk[364] = 327133449808532506L;
        gh.efxk[365] = -570943075801193913L;
        gh.efxk[366] = -7067672685345582397L;
        gh.efxk[367] = 1994024139861346645L;
        gh.efxk[368] = 5899680742115965226L;
        gh.efxk[369] = 8614262109308278664L;
        gh.efxk[370] = 2340997480110970148L;
        gh.efxk[371] = 4225321048014566135L;
        gh.efxk[372] = 4432534648676992395L;
        gh.efxk[373] = -7371523834062833504L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        block108: {
            block107: {
                block106: {
                    block105: {
                        block104: {
                            block103: {
                                block102: {
                                    block101: {
                                        block100: {
                                            var6_2 = gh.c;
                                            var5_3 /* !! */  = gh.b;
                                            var4_4 = gh.a;
                                            if (var6_2) {
                                                throw null;
lbl6:
                                                // 29 sources

                                                return;
                                            }
                                            if (var4_4 || var4_4) ** GOTO lbl6
                                            if (gh.mc.field_1724 == null) break block100;
                                            if (var4_4) ** GOTO lbl6
                                            if (gh.mc.field_1687 != null) break block101;
                                            if (var4_4) ** GOTO lbl6
                                        }
                                        if (var4_4 || var4_4) ** GOTO lbl6
                                        return;
                                    }
                                    if (var4_4 || var4_4) ** GOTO lbl6
                                    var2_5 = hn.getInstance().getTarget();
                                    if (var4_4 || var4_4) ** GOTO lbl6
                                    if (hn.getInstance().isState()) break block102;
                                    if (var4_4 || var4_4) ** GOTO lbl6
                                    var2_5 = eh.getInstance().getTarget();
                                    if (var4_4) ** GOTO lbl6
                                }
                                if (var4_4 || var4_4) ** GOTO lbl6
                                if (var2_5 == null) break block103;
                                if (var4_4) ** GOTO lbl6
                                if (var2_5.method_5805()) break block104;
                                if (var4_4) ** GOTO lbl6
                            }
                            if (var4_4 || var4_4) ** GOTO lbl6
                            return;
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (this.mode.isSelected("Grim")) break block105;
                        if (var4_4) ** GOTO lbl6
                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (hn.getInstance().getTarget() == null) break block106;
                    if (var4_4) ** GOTO lbl6
                    if (!d.getInstance().getManager().getAttackPerpetrator().getAttackHandler().canAttack(hn.getInstance().getConfig(), (int)gh.efwk("efyc", efwt(int ), (int)32))) break block106;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (eh.getInstance().getTarget() == null) break block107;
                if (var4_4) ** GOTO lbl6
                if (!d.getInstance().getManager().getAttackPerpetrator().getAttackHandler().canAttack(eh.getInstance().getConfig(), (int)gh.efwk("efyd", efwt(int ), (int)33))) break block107;
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!this.setting.isSelected("Only Key Pressed")) break block108;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1894.method_1434()) break block108;
            if (var4_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1881.method_1434()) break block108;
            if (var4_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1913.method_1434()) break block108;
            if (var4_4) ** GOTO lbl6
            if (gh.mc.field_1690.field_1849.method_1434()) break block108;
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_6 = this.calculateGrimNextPoint(var2_5);
        if (var4_4 || var4_4) ** GOTO lbl6
        this.applyGrimMovement(var1_1, var3_6);
        if (!var4_4 && !var4_4) ** break;
        ** while (true)
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl76:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)gh.efwk("efye", efwt(int ), (int)34);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 1: {
                var5_3 /* !! */  = (int)gh.efwk("efyf", efwt(int ), (int)35);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 2: {
                var5_3 /* !! */  = (int)gh.efwk("efyg", efwt(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl91:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)gh.efwk("efyh", efwt(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl96:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)gh.efwk("efyi", efwt(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl101:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)gh.efwk("efyj", efwt(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl106:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)gh.efwk("efyk", efwt(int ), (int)40);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 7: {
                var5_3 /* !! */  = (int)gh.efwk("efyl", efwt(int ), (int)41);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl116:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)gh.efwk("efym", efwt(int ), (int)42);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 9: {
                var5_3 /* !! */  = (int)gh.efwk("efyn", efwt(int ), (int)43);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl126:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)gh.efwk("efyo", efwt(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl131:
            // 4 sources

            case 11: {
                var5_3 /* !! */  = (int)gh.efwk("efyp", efwt(int ), (int)45);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 12: {
                var5_3 /* !! */  = (int)gh.efwk("efyq", efwt(int ), (int)46);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
lbl140:
            // 4 sources

            case 13: {
                var5_3 /* !! */  = (int)gh.efwk("efyr", efwt(int ), (int)47);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl145:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)gh.efwk("efys", efwt(int ), (int)48);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)gh.efwk("efyt", efwt(int ), (int)49);
                if (!var6_2) break;
                throw null;
            }
lbl153:
            // 5 sources

            case 16: {
                var5_3 /* !! */  = (int)gh.efwk("efyu", efwt(int ), (int)50);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl158:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)gh.efwk("efyv", efwt(int ), (int)51);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl163:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)gh.efwk("efyw", efwt(int ), (int)52);
                if (!var6_2) ** GOTO lbl126
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)gh.efwk("efyx", efwt(int ), (int)53);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 20: {
                var5_3 /* !! */  = (int)gh.efwk("efyy", efwt(int ), (int)54);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl177:
            // 2 sources

            case 21: {
                do {
                    var5_3 /* !! */  = (int)gh.efwk("efyz", efwt(int ), (int)55);
                } while (!var6_2);
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)gh.efwk("efza", efwt(int ), (int)56);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 23: {
                var5_3 /* !! */  = (int)gh.efwk("efzb", efwt(int ), (int)57);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl192:
            // 3 sources

            case 24: {
                var5_3 /* !! */  = (int)gh.efwk("efzc", efwt(int ), (int)58);
                if (!var6_2) ** GOTO lbl153
                throw null;
            }
lbl196:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)gh.efwk("efzd", efwt(int ), (int)59);
                if (!var6_2) ** GOTO lbl76
                throw null;
            }
            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gh.efwk("efze", efwt(int ), (int)60);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl256
                    break;
                }
            }
lbl206:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)gh.efwk("efzf", efwt(int ), (int)61);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl211:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)gh.efwk("efzg", efwt(int ), (int)62);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl216:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)gh.efwk("efzh", efwt(int ), (int)63);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 30: {
                var5_3 /* !! */  = (int)gh.efwk("efzi", efwt(int ), (int)64);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 31: {
                var5_3 /* !! */  = (int)gh.efwk("efzj", efwt(int ), (int)65);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
            case 32: {
                var5_3 /* !! */  = (int)gh.efwk("efzk", efwt(int ), (int)66);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl235:
            // 2 sources

            case 33: {
                var5_3 /* !! */  = (int)gh.efwk("efzl", efwt(int ), (int)67);
                if (!var6_2) ** GOTO lbl153
                throw null;
            }
            case 34: {
                var5_3 /* !! */  = (int)gh.efwk("efzm", efwt(int ), (int)68);
                if (!var6_2) ** GOTO lbl158
                throw null;
            }
lbl243:
            // 2 sources

            case 35: {
                var5_3 /* !! */  = (int)gh.efwk("efzn", efwt(int ), (int)69);
                if (!var6_2) ** GOTO lbl91
                throw null;
            }
lbl247:
            // 3 sources

            case 36: {
                var5_3 /* !! */  = (int)gh.efwk("efzo", efwt(int ), (int)70);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl252:
            // 2 sources

            case 37: {
                var5_3 /* !! */  = (int)gh.efwk("efzp", efwt(int ), (int)71);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl256:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)gh.efwk("efzq", efwt(int ), (int)72);
                if (!var6_2) ** GOTO lbl101
                throw null;
            }
lbl260:
            // 4 sources

            case 39: {
                var5_3 /* !! */  = (int)gh.efwk("efzr", efwt(int ), (int)73);
                if (!var6_2) ** GOTO lbl192
                throw null;
            }
            case 40: {
                var5_3 /* !! */  = (int)gh.efwk("efzs", efwt(int ), (int)74);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl268:
            // 4 sources

            case 41: {
                var5_3 /* !! */  = (int)gh.efwk("efzt", efwt(int ), (int)75);
                if (var6_2) {
                    throw null;
                }
            }
lbl272:
            // 4 sources

            case 42: {
                var5_3 /* !! */  = (int)gh.efwk("efzu", efwt(int ), (int)76);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
            case 43: {
                var5_3 /* !! */  = (int)gh.efwk("efzv", efwt(int ), (int)77);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 44: {
                var5_3 /* !! */  = (int)gh.efwk("efzw", efwt(int ), (int)78);
                if (!var6_2) ** GOTO lbl153
                throw null;
            }
lbl285:
            // 3 sources

            case 45: {
                var5_3 /* !! */  = (int)gh.efwk("efzx", efwt(int ), (int)79);
                if (!var6_2) ** GOTO lbl153
                throw null;
            }
lbl289:
            // 3 sources

            case 46: {
                var5_3 /* !! */  = (int)gh.efwk("efzy", efwt(int ), (int)80);
                if (!var6_2) ** GOTO lbl96
                throw null;
            }
lbl293:
            // 2 sources

            case 47: {
                var5_3 /* !! */  = (int)gh.efwk("efzz", efwt(int ), (int)81);
                if (!var6_2) ** GOTO lbl216
                throw null;
            }
            case 48: {
                var5_3 /* !! */  = (int)gh.efwk("egaa", efwt(int ), (int)82);
                if (!var6_2) ** GOTO lbl247
                throw null;
            }
            case 49: {
                var5_3 /* !! */  = (int)gh.efwk("egab", efwt(int ), (int)83);
                if (!var6_2) ** GOTO lbl101
                throw null;
            }
lbl305:
            // 2 sources

            case 50: {
                var5_3 /* !! */  = (int)gh.efwk("egac", efwt(int ), (int)84);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
            case 51: 
        }
        var5_3 /* !! */  = (int)gh.efwk("egad", efwt(int ), (int)85);
        ** while (!var6_2)
lbl312:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehjd() {
        gh.efwj[0] = -1684145183;
        gh.efwj[1] = 234746461;
        gh.efwj[2] = -881244477;
        gh.efwj[3] = 695646149;
        gh.efwj[4] = -1904698082;
        gh.efwj[5] = 1884600425;
        gh.efwj[6] = 958745341;
        gh.efwj[7] = -970242347;
        gh.efwj[8] = -1106680822;
        gh.efwj[9] = -1625463550;
        gh.efwj[10] = 918714104;
        gh.efwj[11] = 1621023503;
        gh.efwj[12] = 1382780155;
        gh.efwj[13] = -980053925;
        gh.efwj[14] = 1915576223;
        gh.efwj[15] = -194091677;
        gh.efwj[16] = -319096392;
        gh.efwj[17] = -1661408819;
        gh.efwj[18] = 991226943;
        gh.efwj[19] = -2041722488;
        gh.efwj[20] = -2061046176;
        gh.efwj[21] = -1574929174;
        gh.efwj[22] = -1179043702;
        gh.efwj[23] = -349654062;
        gh.efwj[24] = 340141229;
        gh.efwj[25] = 1690610372;
        gh.efwj[26] = -370794298;
        gh.efwj[27] = -2061604742;
        gh.efwj[28] = -1475836053;
        gh.efwj[29] = 254627925;
        gh.efwj[30] = -1006045834;
        gh.efwj[31] = 2059347955;
        gh.efwj[32] = -80210050;
        gh.efwj[33] = 1638177342;
        gh.efwj[34] = -1528691808;
        gh.efwj[35] = -2070175384;
        gh.efwj[36] = -42607307;
        gh.efwj[37] = 361235092;
        gh.efwj[38] = -362215387;
        gh.efwj[39] = -218196217;
        gh.efwj[40] = -1492873397;
        gh.efwj[41] = 1403938356;
        gh.efwj[42] = -1767910529;
        gh.efwj[43] = 298629415;
        gh.efwj[44] = 1810167106;
        gh.efwj[45] = -1672014070;
        gh.efwj[46] = 532463910;
        gh.efwj[47] = -1173531676;
        gh.efwj[48] = 1533724514;
        gh.efwj[49] = -159328829;
        gh.efwj[50] = 108708148;
        gh.efwj[51] = 1440203245;
        gh.efwj[52] = -722400512;
        gh.efwj[53] = -230018361;
        gh.efwj[54] = 1764612171;
        gh.efwj[55] = -1994082149;
        gh.efwj[56] = -306090237;
        gh.efwj[57] = -1421702554;
        gh.efwj[58] = 1522874806;
        gh.efwj[59] = 1918878022;
        gh.efwj[60] = 1400269988;
        gh.efwj[61] = -2108551087;
        gh.efwj[62] = -1412276274;
        gh.efwj[63] = -695831596;
        gh.efwj[64] = 2086154356;
        gh.efwj[65] = 1985125963;
        gh.efwj[66] = -1824602466;
        gh.efwj[67] = -2090318190;
        gh.efwj[68] = 1085312931;
        gh.efwj[69] = -304465377;
        gh.efwj[70] = -1563415350;
        gh.efwj[71] = -931985594;
        gh.efwj[72] = -183333506;
        gh.efwj[73] = -1219262764;
        gh.efwj[74] = 993361580;
        gh.efwj[75] = 2024100228;
        gh.efwj[76] = 39204153;
        gh.efwj[77] = -1114663649;
        gh.efwj[78] = 844419007;
        gh.efwj[79] = 1744934464;
        gh.efwj[80] = -53359634;
        gh.efwj[81] = -507525352;
        gh.efwj[82] = 657786432;
        gh.efwj[83] = -1989048156;
        gh.efwj[84] = -580542747;
        gh.efwj[85] = -8537296;
        gh.efwj[86] = -369742750;
        gh.efwj[87] = 292022071;
        gh.efwj[88] = -2129145795;
        gh.efwj[89] = -9593125;
        gh.efwj[90] = -1034409336;
        gh.efwj[91] = 1589710598;
        gh.efwj[92] = 1981735236;
        gh.efwj[93] = 1562341626;
        gh.efwj[94] = -1340007513;
        gh.efwj[95] = -2064869478;
        gh.efwj[96] = -517444176;
        gh.efwj[97] = -279671508;
        gh.efwj[98] = -1575289238;
        gh.efwj[99] = -907443852;
    }

    private static /* synthetic */ void ehjl() {
        gh.efxj[100] = -6861086639168798162L;
        gh.efxj[101] = 8136804348519235849L;
        gh.efxj[102] = -4233610857383216512L;
        gh.efxj[103] = 5317416065681051107L;
        gh.efxj[104] = -7006383804147067614L;
        gh.efxj[105] = -7829685422201130198L;
        gh.efxj[106] = -4592502343380895080L;
        gh.efxj[107] = 3151395655868238279L;
        gh.efxj[108] = -6240344564567308627L;
        gh.efxj[109] = -4192911835503488702L;
        gh.efxj[110] = 8459315715627418519L;
        gh.efxj[111] = 4306375391749329787L;
        gh.efxj[112] = -7327241279308549973L;
        gh.efxj[113] = 1369074271435720785L;
        gh.efxj[114] = -1404793830229450145L;
        gh.efxj[115] = -5889183144166311664L;
        gh.efxj[116] = 636254561865906135L;
        gh.efxj[117] = 7951725772600681477L;
        gh.efxj[118] = 6890463662607288416L;
        gh.efxj[119] = 102287849181691900L;
        gh.efxj[120] = -6016027857804357172L;
        gh.efxj[121] = -6386991786306204522L;
        gh.efxj[122] = 941850675586313629L;
        gh.efxj[123] = -3264080261103315107L;
        gh.efxj[124] = -7811215896550463672L;
        gh.efxj[125] = 2095114443280760598L;
        gh.efxj[126] = 6727994537931454151L;
        gh.efxj[127] = -2096020530691614339L;
        gh.efxj[128] = 7942448593527793903L;
        gh.efxj[129] = -3963106156998186615L;
        gh.efxj[130] = -8160967373492274399L;
        gh.efxj[131] = 7706423505328767852L;
        gh.efxj[132] = 8058936015490823539L;
        gh.efxj[133] = 4535377176998750286L;
        gh.efxj[134] = -8900422562417206413L;
        gh.efxj[135] = -8628042714642587108L;
        gh.efxj[136] = 8364229205020636271L;
        gh.efxj[137] = 178278072263047639L;
        gh.efxj[138] = -3991162787336360217L;
        gh.efxj[139] = -4573360068787017290L;
        gh.efxj[140] = 4725240054078236643L;
        gh.efxj[141] = -6280519259070812855L;
        gh.efxj[142] = 3715605076494803504L;
        gh.efxj[143] = -811622220796974362L;
        gh.efxj[144] = 4500449667669470668L;
        gh.efxj[145] = 168833393137237581L;
        gh.efxj[146] = -5933733939691975512L;
        gh.efxj[147] = 2349372648340354903L;
        gh.efxj[148] = 1723044884907349105L;
        gh.efxj[149] = -4778136541652238233L;
        gh.efxj[150] = -5501990690945207734L;
        gh.efxj[151] = 4731055048085015472L;
        gh.efxj[152] = -7414358312458555319L;
        gh.efxj[153] = 7861541473936197169L;
        gh.efxj[154] = 1317014773971064017L;
        gh.efxj[155] = -3935420565248161633L;
        gh.efxj[156] = -1549598567044143894L;
        gh.efxj[157] = 9064610616577612418L;
        gh.efxj[158] = 6200659788187944486L;
        gh.efxj[159] = 2812656738884973668L;
        gh.efxj[160] = -2995324829059059705L;
        gh.efxj[161] = 83114292080692139L;
        gh.efxj[162] = -1198875823090084156L;
        gh.efxj[163] = -3170081641331190287L;
        gh.efxj[164] = 8335111138370410064L;
        gh.efxj[165] = -5992235796583578149L;
        gh.efxj[166] = 3454160633670492799L;
        gh.efxj[167] = 7486819400414157345L;
        gh.efxj[168] = -6514690298006413596L;
        gh.efxj[169] = -1056078031345147989L;
        gh.efxj[170] = 5520932425374704350L;
        gh.efxj[171] = 234386733365627681L;
        gh.efxj[172] = -8586072242975027204L;
        gh.efxj[173] = -8723374610860478309L;
        gh.efxj[174] = -8763752898887830468L;
        gh.efxj[175] = -6627097149632666838L;
        gh.efxj[176] = 2487452526949551984L;
        gh.efxj[177] = 8725601461523631803L;
        gh.efxj[178] = -8078690084451061987L;
        gh.efxj[179] = -4427665116004997752L;
        gh.efxj[180] = 9205912432894028824L;
        gh.efxj[181] = 1475385067192511023L;
        gh.efxj[182] = 3958028559884140781L;
        gh.efxj[183] = 7185761419902852840L;
        gh.efxj[184] = -1462366620112933745L;
        gh.efxj[185] = -5116035531584902841L;
        gh.efxj[186] = 7872206061217890997L;
        gh.efxj[187] = -8694131236796833596L;
        gh.efxj[188] = 7031101321575650487L;
        gh.efxj[189] = -8443731248090048225L;
        gh.efxj[190] = -1044722374309861958L;
        gh.efxj[191] = 225451336507071652L;
        gh.efxj[192] = -7340012754443719429L;
        gh.efxj[193] = -4716583856302358910L;
        gh.efxj[194] = 1156012470468036866L;
        gh.efxj[195] = -6682208370601866880L;
        gh.efxj[196] = 6349433720232534660L;
        gh.efxj[197] = -5516224585364309880L;
        gh.efxj[198] = 8246281603085356120L;
        gh.efxj[199] = 8698695726025422676L;
    }

    private static /* synthetic */ void ehjb() {
        gh.efwi[500] = 430540561;
        gh.efwi[501] = -1817988133;
        gh.efwi[502] = 1172326039;
        gh.efwi[503] = 2000594039;
        gh.efwi[504] = -1523903333;
        gh.efwi[505] = -188068072;
        gh.efwi[506] = -582237190;
        gh.efwi[507] = -951372562;
        gh.efwi[508] = 1190703697;
        gh.efwi[509] = 1941134807;
        gh.efwi[510] = -1603658020;
        gh.efwi[511] = 2146075291;
        gh.efwi[512] = 95043257;
        gh.efwi[513] = 509191152;
        gh.efwi[514] = 287215546;
        gh.efwi[515] = 247114884;
        gh.efwi[516] = 238788404;
        gh.efwi[517] = 1622429037;
        gh.efwi[518] = -685088732;
        gh.efwi[519] = -922161370;
        gh.efwi[520] = -710421012;
        gh.efwi[521] = -1878509878;
        gh.efwi[522] = -81320484;
        gh.efwi[523] = -295175150;
        gh.efwi[524] = -1249130820;
        gh.efwi[525] = -1145734699;
        gh.efwi[526] = 1732039800;
        gh.efwi[527] = 1766151401;
        gh.efwi[528] = 328707728;
        gh.efwi[529] = 528629575;
        gh.efwi[530] = 666545424;
        gh.efwi[531] = -1102439008;
        gh.efwi[532] = 1787313968;
        gh.efwi[533] = -1953104562;
        gh.efwi[534] = 646333390;
        gh.efwi[535] = -2002290459;
        gh.efwi[536] = -509983157;
        gh.efwi[537] = 1655388423;
        gh.efwi[538] = -32223376;
        gh.efwi[539] = -150208679;
        gh.efwi[540] = 1555046489;
        gh.efwi[541] = -1776877023;
        gh.efwi[542] = -1036550100;
        gh.efwi[543] = 1713253435;
        gh.efwi[544] = 1208231504;
        gh.efwi[545] = -1882563700;
        gh.efwi[546] = -1754989620;
        gh.efwi[547] = 504137309;
        gh.efwi[548] = -266988791;
        gh.efwi[549] = 1676849893;
        gh.efwi[550] = 406308763;
        gh.efwi[551] = 379607386;
        gh.efwi[552] = 1400102027;
        gh.efwi[553] = -1992644618;
        gh.efwi[554] = 128003132;
        gh.efwi[555] = 378152377;
        gh.efwi[556] = 854369432;
        gh.efwi[557] = -52336430;
        gh.efwi[558] = -223670078;
        gh.efwi[559] = -284414808;
        gh.efwi[560] = -268318156;
        gh.efwi[561] = 1369463609;
        gh.efwi[562] = -869317491;
        gh.efwi[563] = 1069025641;
        gh.efwi[564] = -1623489628;
        gh.efwi[565] = 1600616977;
        gh.efwi[566] = 1638419;
        gh.efwi[567] = -1190889539;
        gh.efwi[568] = -762757620;
        gh.efwi[569] = -344385619;
        gh.efwi[570] = 57243033;
        gh.efwi[571] = 900250650;
        gh.efwi[572] = 33106812;
        gh.efwi[573] = -296512230;
        gh.efwi[574] = -1516755085;
        gh.efwi[575] = -2087400354;
        gh.efwi[576] = 983781261;
        gh.efwi[577] = 330002677;
        gh.efwi[578] = -1364900474;
        gh.efwi[579] = 669824800;
        gh.efwi[580] = 1619050369;
        gh.efwi[581] = 541572811;
        gh.efwi[582] = -779240642;
        gh.efwi[583] = 420787068;
        gh.efwi[584] = -1821291449;
        gh.efwi[585] = 989417101;
        gh.efwi[586] = -1717922508;
        gh.efwi[587] = 983409955;
        gh.efwi[588] = -2054433967;
        gh.efwi[589] = 1406431833;
        gh.efwi[590] = -751384794;
        gh.efwi[591] = -153671500;
        gh.efwi[592] = 653335810;
        gh.efwi[593] = -697585364;
        gh.efwi[594] = -703607950;
        gh.efwi[595] = -642888924;
        gh.efwi[596] = 449597557;
        gh.efwi[597] = 1037231466;
        gh.efwi[598] = 1879547095;
        gh.efwi[599] = -2100865570;
    }

    private static /* synthetic */ double egds(int n2) {
        return Double.longBitsToDouble(efxj[n2] ^ efxk[n2]);
    }

    private static /* synthetic */ void ehjm() {
        gh.efxj[200] = 8694189247108432476L;
        gh.efxj[201] = -7150064115908263591L;
        gh.efxj[202] = -6045772316710638083L;
        gh.efxj[203] = 1666093241055704082L;
        gh.efxj[204] = -2355962559788546044L;
        gh.efxj[205] = 3180889111249873482L;
        gh.efxj[206] = 4782089988191758381L;
        gh.efxj[207] = -5599571971388513642L;
        gh.efxj[208] = -4473422352470123310L;
        gh.efxj[209] = 7671900897799329186L;
        gh.efxj[210] = -2714202636587610581L;
        gh.efxj[211] = 6708838508865745130L;
        gh.efxj[212] = -6403857009772333377L;
        gh.efxj[213] = -3854998565257526676L;
        gh.efxj[214] = 2126133855767282483L;
        gh.efxj[215] = 9152003642587577385L;
        gh.efxj[216] = 6931451183367905077L;
        gh.efxj[217] = 6147117448220041319L;
        gh.efxj[218] = 130428278174790872L;
        gh.efxj[219] = -3738375851384549884L;
        gh.efxj[220] = -6088309200043285279L;
        gh.efxj[221] = 5109631976490251650L;
        gh.efxj[222] = -3446417743974243646L;
        gh.efxj[223] = -2872829380647222591L;
        gh.efxj[224] = -3693204671363112029L;
        gh.efxj[225] = 1818822330895770845L;
        gh.efxj[226] = 716330656814828621L;
        gh.efxj[227] = 5242927728043512406L;
        gh.efxj[228] = 9032733495801144261L;
        gh.efxj[229] = 2021629549108402082L;
        gh.efxj[230] = 8462421735298753491L;
        gh.efxj[231] = -598076602818110906L;
        gh.efxj[232] = -7552056060822499998L;
        gh.efxj[233] = 8961977850856120366L;
        gh.efxj[234] = 6097210951918256514L;
        gh.efxj[235] = -1549322142932546775L;
        gh.efxj[236] = -3041318626028287456L;
        gh.efxj[237] = -6890038769390020329L;
        gh.efxj[238] = 7545102186049482860L;
        gh.efxj[239] = -3655864564267442320L;
        gh.efxj[240] = 3673247812315281258L;
        gh.efxj[241] = 8404790382969761677L;
        gh.efxj[242] = -9009101934188943196L;
        gh.efxj[243] = -1212543280952424140L;
        gh.efxj[244] = -3193586895597958749L;
        gh.efxj[245] = -775464808112013445L;
        gh.efxj[246] = -7646202546128521132L;
        gh.efxj[247] = -514690822824677087L;
        gh.efxj[248] = -4591509872868850220L;
        gh.efxj[249] = 5372690846945853551L;
        gh.efxj[250] = 2231892866699840341L;
        gh.efxj[251] = -2368228540148297757L;
        gh.efxj[252] = 6220243108598154114L;
        gh.efxj[253] = -6277500743281069339L;
        gh.efxj[254] = -8131440131495762485L;
        gh.efxj[255] = 287135786070844454L;
        gh.efxj[256] = 7958092225187398417L;
        gh.efxj[257] = 9135244820231828971L;
        gh.efxj[258] = -4296518035719586709L;
        gh.efxj[259] = -5143144364625800207L;
        gh.efxj[260] = -7146725655384583547L;
        gh.efxj[261] = 6207190697074911490L;
        gh.efxj[262] = 2390730256504204864L;
        gh.efxj[263] = 310500051881140109L;
        gh.efxj[264] = -3030685830372740514L;
        gh.efxj[265] = 1489959876268877230L;
        gh.efxj[266] = -9156416637539393722L;
        gh.efxj[267] = 7991450255683931465L;
        gh.efxj[268] = 5936968148996893657L;
        gh.efxj[269] = 2041471989286105722L;
        gh.efxj[270] = -8371724583668916771L;
        gh.efxj[271] = 819692192360248311L;
        gh.efxj[272] = 4543451860154422150L;
        gh.efxj[273] = 6170291908740209352L;
        gh.efxj[274] = -6282797936881783329L;
        gh.efxj[275] = -1483278127913994582L;
        gh.efxj[276] = 1680599078398280179L;
        gh.efxj[277] = 4224142035909908455L;
        gh.efxj[278] = -700324545656190953L;
        gh.efxj[279] = -3837568068185071245L;
        gh.efxj[280] = 63407525254196873L;
        gh.efxj[281] = 7030899758877174814L;
        gh.efxj[282] = 3643695453709343038L;
        gh.efxj[283] = 784373476960333398L;
        gh.efxj[284] = -2478114281636200469L;
        gh.efxj[285] = 3196759060490220469L;
        gh.efxj[286] = -4076899427244658910L;
        gh.efxj[287] = -7531512251180475627L;
        gh.efxj[288] = -6677173591178040603L;
        gh.efxj[289] = -3776021850971971426L;
        gh.efxj[290] = 5125255926063672193L;
        gh.efxj[291] = 2557127771070148768L;
        gh.efxj[292] = -4896691910135740875L;
        gh.efxj[293] = 29026806438819714L;
        gh.efxj[294] = -8725405309093159208L;
        gh.efxj[295] = 5367295171536680943L;
        gh.efxj[296] = 8703307725475677258L;
        gh.efxj[297] = -4403069187987306406L;
        gh.efxj[298] = -7938724956751093231L;
        gh.efxj[299] = 2587267431246698945L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processMatrixCubeStrafe(class_243 var1_1, class_243 var2_2, double var3_3, int var5_4) {
        block43: {
            var14_5 = gh.c;
            var13_6 /* !! */  = gh.b;
            var12_7 = gh.a;
            if (var14_5) {
                throw null;
lbl6:
                // 11 sources

                return;
            }
            if (var12_7 || var12_7) ** GOTO lbl6
            v0 = new class_243[4];
            v0[gh.efwk("egwn", efwt(int ), (int)444)] = new class_243(var2_2.field_1352 - var3_3, var1_1.field_1351, var2_2.field_1350 - var3_3);
            v0[gh.efwk("egwo", efwt(int ), (int)445)] = new class_243(var2_2.field_1352 - var3_3, var1_1.field_1351, var2_2.field_1350 + var3_3);
            v0[gh.efwk("egwp", efwt(int ), (int)446)] = new class_243(var2_2.field_1352 + var3_3, var1_1.field_1351, var2_2.field_1350 + var3_3);
            v0[gh.efwk("egwq", efwt(int ), (int)447)] = new class_243(var2_2.field_1352 + var3_3, var1_1.field_1351, var2_2.field_1350 - var3_3);
            var6_8 = v0;
            if (var12_7 || var12_7) ** GOTO lbl6
            if (!(var1_1.method_1022(var6_8[this.grimPointIndex]) < gh.efwk("egwr", egds(int ), (int)229))) break block43;
            if (var12_7 || var12_7) ** GOTO lbl6
            this.grimPointIndex = (this.grimPointIndex + var5_4 + var6_8.length) % var6_8.length;
            if (var12_7) ** GOTO lbl6
        }
        if (var12_7 || var12_7) ** GOTO lbl6
        var7_9 = var6_8[this.grimPointIndex];
        if (var12_7 || var12_7) ** GOTO lbl6
        var8_10 = var7_9.method_1020(var1_1).method_1029();
        if (var12_7 || var12_7) ** GOTO lbl6
        var9_11 = (float)Math.toDegrees(Math.atan2(var8_10.field_1350, var8_10.field_1352)) - gh.efwk("egws", efwh(int ), (int)448);
        if (var12_7 || var12_7) ** GOTO lbl6
        var10_12 = this.speed.getValue();
        if (var12_7 || var12_7) ** GOTO lbl6
        gh.mc.field_1724.method_18800(-Math.sin(Math.toRadians(var9_11)) * var10_12, gh.mc.field_1724.method_18798().field_1351, Math.cos(Math.toRadians(var9_11)) * var10_12);
        if (var12_7) ** GOTO lbl6
        if (var13_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var12_7) ** break;
                ** continue;
                return;
            }
lbl38:
            // 2 sources

            case 0: {
                var13_6 /* !! */  = (int)gh.efwk("egwt", efwt(int ), (int)449);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl43:
            // 3 sources

            case 1: {
                var13_6 /* !! */  = (int)gh.efwk("egwu", efwt(int ), (int)450);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl48:
            // 2 sources

            case 2: {
                var13_6 /* !! */  = (int)gh.efwk("egwv", efwt(int ), (int)451);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 3: {
                var13_6 /* !! */  = (int)gh.efwk("egww", efwt(int ), (int)452);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl58:
            // 3 sources

            case 4: {
                var13_6 /* !! */  = (int)gh.efwk("egwx", efwt(int ), (int)453);
                if (!var14_5) ** GOTO lbl48
                throw null;
            }
lbl62:
            // 2 sources

            case 5: {
                var13_6 /* !! */  = (int)gh.efwk("egwy", efwt(int ), (int)454);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl88
            }
lbl67:
            // 2 sources

            case 6: {
                var13_6 /* !! */  = (int)gh.efwk("egwz", efwt(int ), (int)455);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl72:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_6 /* !! */  = (int)gh.efwk("egxa", efwt(int ), (int)456);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl101
                    break;
                }
            }
lbl78:
            // 2 sources

            case 8: {
                var13_6 /* !! */  = (int)gh.efwk("egxb", efwt(int ), (int)457);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl83:
            // 2 sources

            case 9: {
                var13_6 /* !! */  = (int)gh.efwk("egxc", efwt(int ), (int)458);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl88:
            // 2 sources

            case 10: {
                var13_6 /* !! */  = (int)gh.efwk("egxd", efwt(int ), (int)459);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 11: {
                var13_6 /* !! */  = (int)gh.efwk("egxe", efwt(int ), (int)460);
                if (!var14_5) ** GOTO lbl78
                throw null;
            }
lbl97:
            // 3 sources

            case 12: {
                var13_6 /* !! */  = (int)gh.efwk("egxf", efwt(int ), (int)461);
                if (!var14_5) ** GOTO lbl43
                throw null;
            }
lbl101:
            // 2 sources

            case 13: {
                var13_6 /* !! */  = (int)gh.efwk("egxg", efwt(int ), (int)462);
                if (!var14_5) ** GOTO lbl58
                throw null;
            }
            case 14: {
                var13_6 /* !! */  = (int)gh.efwk("egxh", efwt(int ), (int)463);
                if (!var14_5) ** GOTO lbl43
                throw null;
            }
lbl109:
            // 2 sources

            case 15: {
                var13_6 /* !! */  = (int)gh.efwk("egxi", efwt(int ), (int)464);
                if (!var14_5) ** GOTO lbl83
                throw null;
            }
            case 16: {
                var13_6 /* !! */  = (int)gh.efwk("egxj", efwt(int ), (int)465);
                if (!var14_5) ** GOTO lbl67
                throw null;
            }
lbl117:
            // 2 sources

            case 17: {
                var13_6 /* !! */  = (int)gh.efwk("egxk", efwt(int ), (int)466);
                if (!var14_5) break;
                throw null;
            }
            case 18: {
                var13_6 /* !! */  = (int)gh.efwk("egxl", efwt(int ), (int)467);
                if (!var14_5) ** GOTO lbl38
                throw null;
            }
lbl125:
            // 3 sources

            case 19: {
                var13_6 /* !! */  = (int)gh.efwk("egxm", efwt(int ), (int)468);
                if (!var14_5) ** GOTO lbl58
                throw null;
            }
            case 20: 
        }
        var13_6 /* !! */  = (int)gh.efwk("egxn", efwt(int ), (int)469);
        ** while (!var14_5)
lbl132:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processMatrixCircleStrafe(class_243 var1_1, class_243 var2_2, double var3_3, int var5_4) {
        v0 /* !! */  = gh.kp;
        if (true) ** GOTO lbl5
        block75: while (true) {
            v0 /* !! */  = (long)(v1 - gh.efwk("egxo", efxi(int ), (int)230));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1262799597: {
                    break block75;
                }
                case -365776362: {
                    v1 = gh.efwk("egxp", efxi(int ), (int)231);
                    continue block75;
                }
                case 1587612365: {
                    v1 = gh.efwk("egxq", efxi(int ), (int)232);
                    continue block75;
                }
            }
            break;
        }
        var17_5 = gh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("egxr", efxi(int ), (int)233)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gh.efwk("egxs", efwt(int ), (int)470)) break;
            v2 /* !! */  = (long)gh.efwk("egxt", efwt(int ), (int)471);
        }
        var16_6 /* !! */  = gh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("egxu", efxi(int ), (int)234)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gh.efwk("egxv", efwt(int ), (int)472)) break;
            v3 /* !! */  = (long)gh.efwk("egxw", efwt(int ), (int)473);
        }
        var15_7 = gh.a;
        if (var17_5) {
            throw null;
lbl29:
            // 9 sources

            return;
        }
        if (var15_7 || var15_7) ** GOTO lbl29
        v4 /* !! */  = gh.kp;
        if (true) ** GOTO lbl36
        block79: while (true) {
            v4 /* !! */  = (long)(gh.efwk("egxy", efxi(int ), (int)236) - gh.efwk("egxx", efxi(int ), (int)235));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1395502876: {
                    continue block79;
                }
                case -1262799597: {
                    break block79;
                }
            }
            break;
        }
        v5 = var1_1.field_1350;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("egxz", efxi(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gh.efwk("egya", efwt(int ), (int)474)) break;
            v6 /* !! */  = (long)gh.efwk("egyb", efwt(int ), (int)475);
        }
        v7 = v5 - var2_2.field_1350;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("egyc", efxi(int ), (int)238)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gh.efwk("egyd", efwt(int ), (int)476)) break;
            v8 /* !! */  = (long)gh.efwk("egye", efwt(int ), (int)477);
        }
        v9 = var1_1.field_1352;
        v10 /* !! */  = gh.kp;
        if (true) ** GOTO lbl58
        block82: while (true) {
            v10 /* !! */  = (long)(gh.efwk("egyg", efxi(int ), (int)240) - gh.efwk("egyf", efxi(int ), (int)239));
lbl58:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1331305161: {
                    continue block82;
                }
                case -1262799597: {
                    break block82;
                }
            }
            break;
        }
        v11 = v9 - var2_2.field_1352;
        v12 /* !! */  = gh.kp;
        if (true) ** GOTO lbl68
        block83: while (true) {
            v12 /* !! */  = (long)(gh.efwk("egyi", efxi(int ), (int)242) - gh.efwk("egyh", efxi(int ), (int)241));
lbl68:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1262799597: {
                    break block83;
                }
                case 276021182: {
                    continue block83;
                }
            }
            break;
        }
        var6_8 = Math.atan2(v7, v11);
        if (var15_7 || var15_7) ** GOTO lbl29
        v13 = var5_4;
        v14 /* !! */  = gh.kp;
        if (true) ** GOTO lbl80
        block84: while (true) {
            v14 /* !! */  = (long)(v15 - gh.efwk("egyj", efxi(int ), (int)243));
lbl80:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1814806026: {
                    v15 = gh.efwk("egyk", efxi(int ), (int)244);
                    continue block84;
                }
                case -1262799597: {
                    break block84;
                }
                case -137580572: {
                    v15 = gh.efwk("egyl", efxi(int ), (int)245);
                    continue block84;
                }
                case 1814987628: {
                    v15 = gh.efwk("egym", efxi(int ), (int)246);
                    continue block84;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = gh.kp - gh.efwk("egyn", efxi(int ), (int)247)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == gh.efwk("egyo", efwt(int ), (int)478)) break;
            v16 /* !! */  = (long)gh.efwk("egyp", efwt(int ), (int)479);
        }
        v17 = v13 * this.speed.getValue();
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = gh.kp - gh.efwk("egyq", efxi(int ), (int)248)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == gh.efwk("egyr", efwt(int ), (int)480)) break;
            v18 /* !! */  = (long)gh.efwk("egys", efwt(int ), (int)481);
        }
        v19 = var1_1.method_1022(var2_2);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_6 = gh.kp - gh.efwk("egyt", efxi(int ), (int)249)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == gh.efwk("egyu", efwt(int ), (int)482)) break;
            v20 /* !! */  = (long)gh.efwk("egyv", efwt(int ), (int)483);
        }
        var6_8 += v17 / Math.max(v19, var3_3);
        if (var15_7 || var15_7) ** GOTO lbl29
        v21 /* !! */  = gh.kp;
        if (true) ** GOTO lbl115
        block88: while (true) {
            v21 /* !! */  = (long)(v22 - gh.efwk("egyw", efxi(int ), (int)250));
lbl115:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1262799597: {
                    break block88;
                }
                case -157557609: {
                    v22 = gh.efwk("egyx", efxi(int ), (int)251);
                    continue block88;
                }
                case 956182463: {
                    v22 = gh.efwk("egyy", efxi(int ), (int)252);
                    continue block88;
                }
            }
            break;
        }
        v23 = var2_2.field_1352;
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_7 = gh.kp - gh.efwk("egyz", efxi(int ), (int)253)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == gh.efwk("egza", efwt(int ), (int)484)) break;
            v24 /* !! */  = (long)gh.efwk("egzb", efwt(int ), (int)485);
        }
        var8_9 = v23 + var3_3 * Math.cos(var6_8);
        if (var15_7 || var15_7) ** GOTO lbl29
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_8 = gh.kp - gh.efwk("egzc", efxi(int ), (int)254)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == gh.efwk("egzd", efwt(int ), (int)486)) break;
            v25 /* !! */  = (long)gh.efwk("egze", efwt(int ), (int)487);
        }
        v26 = var2_2.field_1350;
        v27 /* !! */  = gh.kp;
        if (true) ** GOTO lbl142
        block91: while (true) {
            v27 /* !! */  = (long)(gh.efwk("egzg", efxi(int ), (int)256) - gh.efwk("egzf", efxi(int ), (int)255));
lbl142:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1675169311: {
                    continue block91;
                }
                case -1262799597: {
                    break block91;
                }
            }
            break;
        }
        var10_10 = v26 + var3_3 * Math.sin(var6_8);
        if (var15_7) ** GOTO lbl29
        if (var16_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_7) ** GOTO lbl29
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_9 = gh.kp - gh.efwk("egzh", efxi(int ), (int)257)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == gh.efwk("egzi", efwt(int ), (int)488)) break;
                    v28 /* !! */  = (long)gh.efwk("egzj", efwt(int ), (int)489);
                }
                v29 = var10_10 - var1_1.field_1350;
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_10 = gh.kp - gh.efwk("egzk", efxi(int ), (int)258)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == gh.efwk("egzl", efwt(int ), (int)490)) break;
                    v30 /* !! */  = (long)gh.efwk("egzm", efwt(int ), (int)491);
                }
                v31 = var8_9 - var1_1.field_1352;
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_11 = gh.kp - gh.efwk("egzn", efxi(int ), (int)259)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == gh.efwk("egzo", efwt(int ), (int)492)) break;
                    v32 /* !! */  = (long)gh.efwk("egzp", efwt(int ), (int)493);
                }
                v33 = Math.atan2(v29, v31);
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_12 = gh.kp - gh.efwk("egzq", efxi(int ), (int)260)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == gh.efwk("egzr", efwt(int ), (int)494)) break;
                    v34 /* !! */  = (long)gh.efwk("egzs", efwt(int ), (int)495);
                }
                var12_11 = (float)Math.toDegrees(v33) - gh.efwk("egzt", efwh(int ), (int)496);
                if (var15_7 || var15_7) ** GOTO lbl29
                v35 /* !! */  = gh.kp;
                if (true) ** GOTO lbl182
                block96: while (true) {
                    v35 /* !! */  = (long)(v36 - gh.efwk("egzu", efxi(int ), (int)261));
lbl182:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1262799597: {
                            break block96;
                        }
                        case 510776253: {
                            v36 = gh.efwk("egzv", efxi(int ), (int)262);
                            continue block96;
                        }
                        case 1953046076: {
                            v36 = gh.efwk("egzw", efxi(int ), (int)263);
                            continue block96;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_13 = gh.kp - gh.efwk("egzx", efxi(int ), (int)264)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == gh.efwk("egzy", efwt(int ), (int)497)) break;
                    v37 /* !! */  = (long)gh.efwk("egzz", efwt(int ), (int)498);
                }
                var13_12 = this.speed.getValue();
                if (var15_7 || var15_7) ** GOTO lbl29
                v38 /* !! */  = gh.kp;
                if (true) ** GOTO lbl202
                block98: while (true) {
                    v38 /* !! */  = (long)(v39 - gh.efwk("ehaa", efxi(int ), (int)265));
lbl202:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -1262799597: {
                            break block98;
                        }
                        case 677974429: {
                            v39 = gh.efwk("ehab", efxi(int ), (int)266);
                            continue block98;
                        }
                        case 1949429100: {
                            v39 = gh.efwk("ehac", efxi(int ), (int)267);
                            continue block98;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_14 = gh.kp - gh.efwk("ehad", efxi(int ), (int)268)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == gh.efwk("ehae", efwt(int ), (int)499)) break;
                    v40 /* !! */  = (long)gh.efwk("ehaf", efwt(int ), (int)500);
                }
                v41 = gh.mc.field_1724;
                v42 = var12_11;
                v43 /* !! */  = gh.kp;
                if (true) ** GOTO lbl222
                block100: while (true) {
                    v43 /* !! */  = (long)(gh.efwk("ehah", efxi(int ), (int)270) - gh.efwk("ehag", efxi(int ), (int)269));
lbl222:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1262799597: {
                            break block100;
                        }
                        case 298699338: {
                            continue block100;
                        }
                    }
                    break;
                }
                v44 = Math.toRadians(v42);
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_15 = gh.kp - gh.efwk("ehai", efxi(int ), (int)271)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == gh.efwk("ehaj", efwt(int ), (int)501)) break;
                    v45 /* !! */  = (long)gh.efwk("ehak", efwt(int ), (int)502);
                }
                v46 = -Math.sin(v44) * var13_12;
                v47 /* !! */  = gh.kp;
                if (true) ** GOTO lbl238
                block102: while (true) {
                    v47 /* !! */  = (long)(gh.efwk("eham", efxi(int ), (int)273) - gh.efwk("ehal", efxi(int ), (int)272));
lbl238:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1262799597: {
                            break block102;
                        }
                        case 314126653: {
                            continue block102;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_16 = gh.kp - gh.efwk("ehan", efxi(int ), (int)274)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == gh.efwk("ehao", efwt(int ), (int)503)) break;
                    v48 /* !! */  = (long)gh.efwk("ehap", efwt(int ), (int)504);
                }
                v49 = gh.mc.field_1724;
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_17 = gh.kp - gh.efwk("ehaq", efxi(int ), (int)275)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == gh.efwk("ehar", efwt(int ), (int)505)) break;
                    v50 /* !! */  = (long)gh.efwk("ehas", efwt(int ), (int)506);
                }
                v51 = v49.method_18798();
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_18 = gh.kp - gh.efwk("ehat", efxi(int ), (int)276)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == gh.efwk("ehau", efwt(int ), (int)507)) break;
                    v52 /* !! */  = (long)gh.efwk("ehav", efwt(int ), (int)508);
                }
                v53 = v51.field_1351;
                v54 = var12_11;
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_19 = gh.kp - gh.efwk("ehaw", efxi(int ), (int)277)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == gh.efwk("ehax", efwt(int ), (int)509)) break;
                    v55 /* !! */  = (long)gh.efwk("ehay", efwt(int ), (int)510);
                }
                v56 = Math.toRadians(v54);
                while (true) {
                    if ((v57 /* !! */  = (cfr_temp_20 = gh.kp - gh.efwk("ehaz", efxi(int ), (int)278)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v57 /* !! */  == gh.efwk("ehba", efwt(int ), (int)511)) break;
                    v57 /* !! */  = (long)gh.efwk("ehbb", efwt(int ), (int)512);
                }
                v58 = Math.cos(v56) * var13_12;
                v59 /* !! */  = gh.kp;
                if (true) ** GOTO lbl278
                block108: while (true) {
                    v59 /* !! */  = (long)(v60 - gh.efwk("ehbc", efxi(int ), (int)279));
lbl278:
                    // 2 sources

                    switch ((int)v59 /* !! */ ) {
                        case -1262799597: {
                            break block108;
                        }
                        case 1703232726: {
                            v60 = gh.efwk("ehbd", efxi(int ), (int)280);
                            continue block108;
                        }
                        case 2108619051: {
                            v60 = gh.efwk("ehbe", efxi(int ), (int)281);
                            continue block108;
                        }
                    }
                    break;
                }
                v41.method_18800(v46, v53, v58);
                if (!var15_7 && !var15_7) ** break;
                ** continue;
                return;
            }
            case 0: {
                var16_6 /* !! */  = (int)gh.efwk("ehbf", efwt(int ), (int)513);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl296:
            // 2 sources

            case 1: {
                var16_6 /* !! */  = (int)gh.efwk("ehbg", efwt(int ), (int)514);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl301:
            // 2 sources

            case 2: {
                var16_6 /* !! */  = (int)gh.efwk("ehbh", efwt(int ), (int)515);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl306:
            // 2 sources

            case 3: {
                var16_6 /* !! */  = (int)gh.efwk("ehbi", efwt(int ), (int)516);
                if (!var17_5) ** GOTO lbl296
                throw null;
            }
            case 4: {
                var16_6 /* !! */  = (int)gh.efwk("ehbj", efwt(int ), (int)517);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 5: {
                var16_6 /* !! */  = (int)gh.efwk("ehbk", efwt(int ), (int)518);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl320:
            // 2 sources

            case 6: {
                var16_6 /* !! */  = (int)gh.efwk("ehbl", efwt(int ), (int)519);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl325:
            // 3 sources

            case 7: {
                var16_6 /* !! */  = (int)gh.efwk("ehbm", efwt(int ), (int)520);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl330:
            // 2 sources

            case 8: {
                var16_6 /* !! */  = (int)gh.efwk("ehbn", efwt(int ), (int)521);
                if (!var17_5) ** GOTO lbl320
                throw null;
            }
lbl334:
            // 2 sources

            case 9: {
                var16_6 /* !! */  = (int)gh.efwk("ehbo", efwt(int ), (int)522);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl339:
            // 3 sources

            case 10: {
                var16_6 /* !! */  = (int)gh.efwk("ehbp", efwt(int ), (int)523);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl344:
            // 2 sources

            case 11: {
                var16_6 /* !! */  = (int)gh.efwk("ehbq", efwt(int ), (int)524);
                if (!var17_5) ** GOTO lbl325
                throw null;
            }
lbl348:
            // 4 sources

            case 12: {
                var16_6 /* !! */  = (int)gh.efwk("ehbr", efwt(int ), (int)525);
                if (!var17_5) ** GOTO lbl330
                throw null;
            }
            case 13: {
                var16_6 /* !! */  = (int)gh.efwk("ehbs", efwt(int ), (int)526);
                if (!var17_5) ** GOTO lbl306
                throw null;
            }
            case 14: {
                var16_6 /* !! */  = (int)gh.efwk("ehbt", efwt(int ), (int)527);
                if (!var17_5) ** GOTO lbl301
                throw null;
            }
lbl360:
            // 3 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_6 /* !! */  = (int)gh.efwk("ehbu", efwt(int ), (int)528);
                    if (!var17_5) ** GOTO lbl344
                    throw null;
                }
            }
lbl365:
            // 2 sources

            case 16: {
                var16_6 /* !! */  = (int)gh.efwk("ehbv", efwt(int ), (int)529);
                if (!var17_5) ** GOTO lbl325
                throw null;
            }
            case 17: 
        }
        var16_6 /* !! */  = (int)gh.efwk("ehbw", efwt(int ), (int)530);
        ** while (!var17_5)
lbl372:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehjq() {
        gh.efxk[200] = -31771266737502076L;
        gh.efxk[201] = 436989307100794169L;
        gh.efxk[202] = 3774656009087806941L;
        gh.efxk[203] = -7045129012543992053L;
        gh.efxk[204] = 4225176994984755288L;
        gh.efxk[205] = 1888929910346328831L;
        gh.efxk[206] = 657859338448545101L;
        gh.efxk[207] = 1059124417069190368L;
        gh.efxk[208] = 6044051361463233788L;
        gh.efxk[209] = -3685090325316097164L;
        gh.efxk[210] = 8099465913295310341L;
        gh.efxk[211] = -4890885255976901603L;
        gh.efxk[212] = -1836063608821766658L;
        gh.efxk[213] = -7647140477224017189L;
        gh.efxk[214] = 4085163576150673055L;
        gh.efxk[215] = -1980548954132017090L;
        gh.efxk[216] = 4888635320572065189L;
        gh.efxk[217] = 3184011419324141319L;
        gh.efxk[218] = 9209551781695451929L;
        gh.efxk[219] = -93088431966701106L;
        gh.efxk[220] = -3532209165179442598L;
        gh.efxk[221] = 9159335863033092728L;
        gh.efxk[222] = 5079258841002937732L;
        gh.efxk[223] = -2712265048086036239L;
        gh.efxk[224] = -4478497440915880284L;
        gh.efxk[225] = -8250858515622512689L;
        gh.efxk[226] = 1402835225783929487L;
        gh.efxk[227] = -7970402192995090380L;
        gh.efxk[228] = 4310667539861893653L;
        gh.efxk[229] = 2589083102157084578L;
        gh.efxk[230] = 7769840187253172684L;
        gh.efxk[231] = 2394544461215828813L;
        gh.efxk[232] = -960031997057574029L;
        gh.efxk[233] = 5183453318675371449L;
        gh.efxk[234] = -4677905278394582980L;
        gh.efxk[235] = 1082354229193477248L;
        gh.efxk[236] = -8822909914041356046L;
        gh.efxk[237] = 1198014596467956620L;
        gh.efxk[238] = 837738368367489550L;
        gh.efxk[239] = -6146726112421632517L;
        gh.efxk[240] = -5021091231200544500L;
        gh.efxk[241] = 4412913477206024537L;
        gh.efxk[242] = 2421597556195304321L;
        gh.efxk[243] = -4993615418553285029L;
        gh.efxk[244] = 7077241331841349514L;
        gh.efxk[245] = 2829840119712202926L;
        gh.efxk[246] = -1406201853880144143L;
        gh.efxk[247] = -5450356007639181295L;
        gh.efxk[248] = 4764260269441013803L;
        gh.efxk[249] = -6238148925574127208L;
        gh.efxk[250] = 8704568079571138628L;
        gh.efxk[251] = 4903393406917561022L;
        gh.efxk[252] = 77085675884700412L;
        gh.efxk[253] = -4824972226114836621L;
        gh.efxk[254] = -5891874564272869527L;
        gh.efxk[255] = 3953861607963026481L;
        gh.efxk[256] = 5027187031022441663L;
        gh.efxk[257] = 3946939832598622432L;
        gh.efxk[258] = -2544337847615292742L;
        gh.efxk[259] = -1789973812612576980L;
        gh.efxk[260] = 3636069552754653439L;
        gh.efxk[261] = -1171869616684138138L;
        gh.efxk[262] = 1274557738435741736L;
        gh.efxk[263] = 5751515264976010494L;
        gh.efxk[264] = 1374639896293546807L;
        gh.efxk[265] = 3997493617191405524L;
        gh.efxk[266] = 4706390870593272443L;
        gh.efxk[267] = -6003185791806826476L;
        gh.efxk[268] = 5639378869102691004L;
        gh.efxk[269] = -715588260667454578L;
        gh.efxk[270] = 7071284637634336405L;
        gh.efxk[271] = -3613373733733981874L;
        gh.efxk[272] = 2736042914865978836L;
        gh.efxk[273] = -4602329685261059629L;
        gh.efxk[274] = -5672182505730925096L;
        gh.efxk[275] = 8649730244957169809L;
        gh.efxk[276] = -2943814352961868386L;
        gh.efxk[277] = 3699904794862239017L;
        gh.efxk[278] = -1880522689304568247L;
        gh.efxk[279] = 4700298797343647656L;
        gh.efxk[280] = -213460499518885364L;
        gh.efxk[281] = -2976855019029594523L;
        gh.efxk[282] = -2957427797322482421L;
        gh.efxk[283] = -4952983583387050172L;
        gh.efxk[284] = -2115746615010005837L;
        gh.efxk[285] = -1709302814892527169L;
        gh.efxk[286] = -6461433727887149060L;
        gh.efxk[287] = -5950055525412374692L;
        gh.efxk[288] = -6635729651892627574L;
        gh.efxk[289] = 6626962328591323610L;
        gh.efxk[290] = 5050559438286176070L;
        gh.efxk[291] = -3911821402490108866L;
        gh.efxk[292] = -3679327087804552735L;
        gh.efxk[293] = -1459561938842096212L;
        gh.efxk[294] = -1338389683692362478L;
        gh.efxk[295] = -2623717625361096386L;
        gh.efxk[296] = -8076580238873559426L;
        gh.efxk[297] = 6439154299496368038L;
        gh.efxk[298] = -7533100206214447676L;
        gh.efxk[299] = 8781063664978540274L;
    }

    private static /* synthetic */ void ehiy() {
        gh.efwi[200] = -1383289910;
        gh.efwi[201] = -1461047954;
        gh.efwi[202] = -833488012;
        gh.efwi[203] = 1209040623;
        gh.efwi[204] = 1552063453;
        gh.efwi[205] = 1626245579;
        gh.efwi[206] = 933043723;
        gh.efwi[207] = 1257030130;
        gh.efwi[208] = -1965196827;
        gh.efwi[209] = -534058369;
        gh.efwi[210] = 1115419241;
        gh.efwi[211] = 1810626285;
        gh.efwi[212] = 1955783779;
        gh.efwi[213] = 719389143;
        gh.efwi[214] = -593820278;
        gh.efwi[215] = 95516270;
        gh.efwi[216] = -1934459303;
        gh.efwi[217] = 210007231;
        gh.efwi[218] = -1076427168;
        gh.efwi[219] = -449272707;
        gh.efwi[220] = 1499340861;
        gh.efwi[221] = -884284403;
        gh.efwi[222] = -361816691;
        gh.efwi[223] = -806034624;
        gh.efwi[224] = -1048449761;
        gh.efwi[225] = 1984858220;
        gh.efwi[226] = -1779746001;
        gh.efwi[227] = -1586998114;
        gh.efwi[228] = 1908176520;
        gh.efwi[229] = 794468744;
        gh.efwi[230] = 1763513527;
        gh.efwi[231] = 1007342826;
        gh.efwi[232] = 574966501;
        gh.efwi[233] = -82157297;
        gh.efwi[234] = 986373687;
        gh.efwi[235] = -386011059;
        gh.efwi[236] = -341666806;
        gh.efwi[237] = 1020793081;
        gh.efwi[238] = -704709050;
        gh.efwi[239] = -1331578410;
        gh.efwi[240] = 1373943136;
        gh.efwi[241] = -947676886;
        gh.efwi[242] = 786973541;
        gh.efwi[243] = 787070760;
        gh.efwi[244] = 942209024;
        gh.efwi[245] = 1771352684;
        gh.efwi[246] = 2078956095;
        gh.efwi[247] = 1485868590;
        gh.efwi[248] = -426590525;
        gh.efwi[249] = -1378986313;
        gh.efwi[250] = -633958041;
        gh.efwi[251] = 893090025;
        gh.efwi[252] = -1241721250;
        gh.efwi[253] = -1389475417;
        gh.efwi[254] = -197057108;
        gh.efwi[255] = 1434949168;
        gh.efwi[256] = -1264922203;
        gh.efwi[257] = -944977234;
        gh.efwi[258] = 2061999977;
        gh.efwi[259] = -1911281484;
        gh.efwi[260] = -1210283768;
        gh.efwi[261] = -954351034;
        gh.efwi[262] = -597621895;
        gh.efwi[263] = -2127697743;
        gh.efwi[264] = 1080307233;
        gh.efwi[265] = -1027210971;
        gh.efwi[266] = 911793986;
        gh.efwi[267] = -1291722894;
        gh.efwi[268] = 1728155373;
        gh.efwi[269] = 1481401975;
        gh.efwi[270] = 119696828;
        gh.efwi[271] = 796248330;
        gh.efwi[272] = -1280610549;
        gh.efwi[273] = -791151511;
        gh.efwi[274] = 486628563;
        gh.efwi[275] = 1211053498;
        gh.efwi[276] = 1536826724;
        gh.efwi[277] = 1017734467;
        gh.efwi[278] = -161875253;
        gh.efwi[279] = 875680497;
        gh.efwi[280] = 1882498144;
        gh.efwi[281] = -1248909646;
        gh.efwi[282] = 2054342556;
        gh.efwi[283] = -1542414425;
        gh.efwi[284] = 666124389;
        gh.efwi[285] = -428233975;
        gh.efwi[286] = 881701846;
        gh.efwi[287] = -449514755;
        gh.efwi[288] = -1602749973;
        gh.efwi[289] = -714273173;
        gh.efwi[290] = 448762236;
        gh.efwi[291] = 1601801825;
        gh.efwi[292] = 2067565309;
        gh.efwi[293] = 979109137;
        gh.efwi[294] = 995128949;
        gh.efwi[295] = -242798016;
        gh.efwi[296] = -183832076;
        gh.efwi[297] = 2052617748;
        gh.efwi[298] = 1188567512;
        gh.efwi[299] = -2059181481;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gh getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("efxl", efxi(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gh.efwk("efxm", efwt(int ), (int)22)) break;
            v0 /* !! */  = (long)gh.efwk("efxn", efwt(int ), (int)23);
        }
        var2 = gh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("efxo", efxi(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gh.efwk("efxp", efwt(int ), (int)24)) break;
            v1 /* !! */  = (long)gh.efwk("efxq", efwt(int ), (int)25);
        }
        var1_1 = gh.b;
        v2 /* !! */  = gh.kp;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - gh.efwk("efxr", efxi(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1262799597: {
                    break block8;
                }
                case -1219839409: {
                    v3 = gh.efwk("efxs", efxi(int ), (int)3);
                    continue block8;
                }
                case -223675427: {
                    v3 = gh.efwk("efxt", efxi(int ), (int)4);
                    continue block8;
                }
                case 45222078: {
                    v3 = gh.efwk("efxu", efxi(int ), (int)5);
                    continue block8;
                }
            }
            break;
        }
        var0_2 = gh.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("efxv", efxi(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == gh.efwk("efxw", efwt(int ), (int)26)) break;
            v4 /* !! */  = (long)gh.efwk("efxx", efwt(int ), (int)27);
        }
        return nj.get(gh.class);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gh() {
        var2_1 /* !! */  = gh.b;
        super("TargetStrafe", "\u0421\u0442\u0440\u0435\u0439\u0444\u0438\u0442\u0441\u044f \u0432\u043e\u043a\u0440\u0443\u0433 \u0442\u0430\u0440\u0433\u0435\u0442\u0430 \u043a\u0438\u043b\u043b\u0430\u0443\u0440\u044b", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0422\u0438\u043f \u0441\u0442\u0440\u0435\u0439\u0444\u0430", "Matrix", new String[]{"Matrix", "Grim"});
        this.type = new kf("\u0422\u043e\u0447\u043a\u0430 \u0445\u043e\u0434\u044c\u0431\u044b", "\u0412\u044b\u0431\u0438\u0440\u0435\u0442\u0435 \u0442\u043e\u0447\u043a\u0443 \u043a\u0443\u0434\u0430 \u0431\u0443\u0434\u0435\u0442 \u0438\u0434\u0442\u0438 \u0441\u0442\u0440\u0435\u0439\u0444", "Cube", new String[]{"Cube", "Center", "Circle"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((gh)this));
        this.typeMatrix = new kf("\u0422\u043e\u0447\u043a\u0430 \u0434\u043b\u044f \u043e\u0431\u0445\u043e\u0434\u0430", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0442\u043e\u0447\u043a\u0443 \u043e\u0431\u0445\u043e\u0434\u0430 \u0432 \u0440\u0435\u0436\u0438\u043c\u0435 Matrix", "Cube", new String[]{"Cube", "Circle"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((gh)this));
        this.grimRadius = new kg("\u0420\u0430\u0434\u0438\u0443\u0441 \u043e\u0431\u0445\u043e\u0434\u0430", "\u0420\u0430\u0434\u0438\u0443\u0441 \u043e\u0431\u0445\u043e\u0434\u0430 \u0432\u043e\u043a\u0440\u0443\u0433 \u0446\u0435\u043b\u0438", (float)gh.efwk("efwl", efwh(int ), (int)0)).range((float)gh.efwk("efwm", efwh(int ), (int)1), (float)gh.efwk("efwn", efwh(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((gh)this));
        this.setting = new ke("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043d\u0430\u0441\u0442\u0440\u043e\u0438\u0442\u044c \u0440\u0430\u0431\u043e\u0442\u0443 \u0441\u0442\u0440\u0435\u0439\u0444\u043e\u0432").value(new String[]{"Auto Jump", "Only Key Pressed", "In front of the target", "Direction Mode"}).selected(new String[]{"Auto Jump"});
        this.directionMode = new kf("\u041d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043e\u0431\u0445\u043e\u0434\u0430", "Clockwise", new String[]{"Clockwise", "Counterclockwise", "Random"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((gh)this));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.radius = new kg("\u0420\u0430\u0434\u0438\u0443\u0441", "\u0420\u0430\u0434\u0438\u0443\u0441 \u043e\u0431\u0445\u043e\u0434\u0430 \u0432\u043e\u043a\u0440\u0443\u0433 \u0446\u0435\u043b\u0438", (float)gh.efwk("efwo", efwh(int ), (int)3)).range((float)gh.efwk("efwp", efwh(int ), (int)4), (float)gh.efwk("efwq", efwh(int ), (int)5)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$4(), ()Ljava/lang/Boolean;)((gh)this));
                this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0441\u0442\u0440\u0435\u0439\u0444\u0430", (float)gh.efwk("efwr", efwh(int ), (int)6)).range((float)gh.efwk("efws", efwh(int ), (int)7), 1.0f).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$5(), ()Ljava/lang/Boolean;)((gh)this));
                this.grimPointIndex = (int)gh.efwk("efwu", efwt(int ), (int)8);
                this.settings(new jx[]{this.mode, this.type, this.typeMatrix, this.grimRadius, this.radius, this.speed, this.setting, this.directionMode});
                return;
            }
lbl17:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gh.efwk("efwv", efwt(int ), (int)9);
                ** GOTO lbl40
            }
            case 1: {
                var2_1 /* !! */  = (int)gh.efwk("efww", efwt(int ), (int)10);
                ** GOTO lbl26
            }
            case 2: {
                var2_1 /* !! */  = (int)gh.efwk("efwx", efwt(int ), (int)11);
                ** GOTO lbl33
            }
lbl26:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)gh.efwk("efwy", efwt(int ), (int)12);
                ** GOTO lbl33
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)gh.efwk("efwz", efwt(int ), (int)13);
                }
            }
lbl33:
            // 4 sources

            case 5: {
                var2_1 /* !! */  = (int)gh.efwk("efxa", efwt(int ), (int)14);
                break;
            }
lbl36:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gh.efwk("efxb", efwt(int ), (int)15);
                    ** GOTO lbl17
                    break;
                }
            }
lbl40:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)gh.efwk("efxc", efwt(int ), (int)16);
                ** GOTO lbl36
            }
            case 8: {
                var2_1 /* !! */  = (int)gh.efwk("efxd", efwt(int ), (int)17);
                ** GOTO lbl33
            }
            case 9: {
                var2_1 /* !! */  = (int)gh.efwk("efxe", efwt(int ), (int)18);
            }
            case 10: {
                var2_1 /* !! */  = (int)gh.efwk("efxf", efwt(int ), (int)19);
            }
            case 11: {
                var2_1 /* !! */  = (int)gh.efwk("efxg", efwt(int ), (int)20);
                ** GOTO lbl26
            }
            case 12: 
        }
        var2_1 /* !! */  = (int)gh.efwk("efxh", efwt(int ), (int)21);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyGrimMovement(cj var1_1, class_243 var2_2) {
        var14_3 = gh.c;
        var13_4 /* !! */  = gh.b;
        var12_5 = gh.a;
        if (var14_3) {
            throw null;
lbl6:
            // 50 sources

            return;
        }
        if (var12_5 || var12_5) ** GOTO lbl6
        var3_6 = gh.mc.field_1724.method_73189();
        if (var12_5 || var12_5) ** GOTO lbl6
        var4_7 = var2_2.method_1020(var3_6).method_1029();
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_8 = ot.INSTANCE.getRotation().getYaw();
        if (var12_5 || var12_5) ** GOTO lbl6
        var6_9 = (float)Math.toDegrees(Math.atan2(var4_7.field_1350, var4_7.field_1352)) - gh.efwk("egha", efwh(int ), (int)178);
        if (var12_5 || var12_5) ** GOTO lbl6
        var7_10 = class_3532.method_15393((float)(var6_9 - var5_8));
        if (var12_5 || var12_5) ** GOTO lbl6
        var8_11 = gh.efwk("eghb", efwt(int ), (int)179);
        if (var12_5 || var12_5) ** GOTO lbl6
        var9_12 = gh.efwk("eghc", efwt(int ), (int)180);
        if (var12_5) ** GOTO lbl6
        if (var13_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_5) ** GOTO lbl6
                var10_13 = gh.efwk("eghd", efwt(int ), (int)181);
                if (var12_5 || var12_5) ** GOTO lbl6
                var11_14 = gh.efwk("eghe", efwt(int ), (int)182);
                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("eghf", egds(int ), (int)92))) ** GOTO lbl40
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("eghg", egds(int ), (int)93))) ** GOTO lbl40
                if (var12_5 || var12_5) ** GOTO lbl6
                var8_11 = gh.efwk("eghh", efwt(int ), (int)183);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl40:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("eghi", egds(int ), (int)94))) ** GOTO lbl52
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("eghj", egds(int ), (int)95))) ** GOTO lbl52
                if (var12_5 || var12_5) ** GOTO lbl6
                var8_11 = gh.efwk("eghk", efwt(int ), (int)184);
                if (var12_5) ** GOTO lbl6
                var11_14 = gh.efwk("eghl", efwt(int ), (int)185);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl52:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("eghm", egds(int ), (int)96))) ** GOTO lbl62
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("eghn", egds(int ), (int)97))) ** GOTO lbl62
                if (var12_5 || var12_5) ** GOTO lbl6
                var11_14 = gh.efwk("egho", efwt(int ), (int)186);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl62:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("eghp", egds(int ), (int)98))) ** GOTO lbl74
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("eghq", egds(int ), (int)99))) ** GOTO lbl74
                if (var12_5 || var12_5) ** GOTO lbl6
                var9_12 = gh.efwk("eghr", efwt(int ), (int)187);
                if (var12_5) ** GOTO lbl6
                var11_14 = gh.efwk("eghs", efwt(int ), (int)188);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl74:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("eght", egds(int ), (int)100))) ** GOTO lbl86
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("eghu", egds(int ), (int)101))) ** GOTO lbl86
                if (var12_5 || var12_5) ** GOTO lbl6
                var8_11 = gh.efwk("eghv", efwt(int ), (int)189);
                if (var12_5) ** GOTO lbl6
                var10_13 = gh.efwk("eghw", efwt(int ), (int)190);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl86:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("eghx", egds(int ), (int)102))) ** GOTO lbl96
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("eghy", egds(int ), (int)103))) ** GOTO lbl96
                if (var12_5 || var12_5) ** GOTO lbl6
                var10_13 = gh.efwk("eghz", efwt(int ), (int)191);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl96:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!((double)var7_10 >= gh.efwk("egia", egds(int ), (int)104))) ** GOTO lbl108
                if (var12_5) ** GOTO lbl6
                if (!((double)var7_10 < gh.efwk("egib", egds(int ), (int)105))) ** GOTO lbl108
                if (var12_5 || var12_5) ** GOTO lbl6
                var9_12 = gh.efwk("egic", efwt(int ), (int)192);
                if (var12_5) ** GOTO lbl6
                var10_13 = gh.efwk("egid", efwt(int ), (int)193);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl111
lbl108:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                var9_12 = gh.efwk("egie", efwt(int ), (int)194);
                if (var12_5) ** GOTO lbl6
lbl111:
                // 8 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                var1_1.setDirectionalLow((boolean)var8_11, (boolean)var9_12, (boolean)var10_13, (boolean)var11_14);
                if (var12_5 || var12_5) ** GOTO lbl6
                if (!this.setting.isSelected("Auto Jump")) ** GOTO lbl120
                if (var12_5) ** GOTO lbl6
                if (!gh.mc.field_1724.method_24828()) ** GOTO lbl120
                if (var12_5 || var12_5) ** GOTO lbl6
                var1_1.setJumping((boolean)gh.efwk("egif", efwt(int ), (int)195));
                if (var12_5) ** GOTO lbl6
lbl120:
                // 3 sources

                if (!var12_5 && !var12_5) ** break;
                ** continue;
                return;
            }
lbl123:
            // 3 sources

            case 0: {
                var13_4 /* !! */  = (int)gh.efwk("egig", efwt(int ), (int)196);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl128:
            // 2 sources

            case 1: {
                var13_4 /* !! */  = (int)gh.efwk("egih", efwt(int ), (int)197);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl133:
            // 4 sources

            case 2: {
                var13_4 /* !! */  = (int)gh.efwk("egii", efwt(int ), (int)198);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 3: {
                var13_4 /* !! */  = (int)gh.efwk("egij", efwt(int ), (int)199);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 4: {
                var13_4 /* !! */  = (int)gh.efwk("egik", efwt(int ), (int)200);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl148:
            // 2 sources

            case 5: {
                var13_4 /* !! */  = (int)gh.efwk("egil", efwt(int ), (int)201);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl404
            }
            case 6: {
                var13_4 /* !! */  = (int)gh.efwk("egim", efwt(int ), (int)202);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 7: {
                var13_4 /* !! */  = (int)gh.efwk("egin", efwt(int ), (int)203);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl454
            }
lbl163:
            // 2 sources

            case 8: {
                var13_4 /* !! */  = (int)gh.efwk("egio", efwt(int ), (int)204);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl492
            }
            case 9: {
                var13_4 /* !! */  = (int)gh.efwk("egip", efwt(int ), (int)205);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 10: {
                var13_4 /* !! */  = (int)gh.efwk("egiq", efwt(int ), (int)206);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl178:
            // 3 sources

            case 11: {
                var13_4 /* !! */  = (int)gh.efwk("egir", efwt(int ), (int)207);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl183:
            // 2 sources

            case 12: {
                var13_4 /* !! */  = (int)gh.efwk("egis", efwt(int ), (int)208);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 13: {
                var13_4 /* !! */  = (int)gh.efwk("egit", efwt(int ), (int)209);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl193:
            // 4 sources

            case 14: {
                var13_4 /* !! */  = (int)gh.efwk("egiu", efwt(int ), (int)210);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl454
            }
            case 15: {
                var13_4 /* !! */  = (int)gh.efwk("egiv", efwt(int ), (int)211);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl488
            }
            case 16: {
                var13_4 /* !! */  = (int)gh.efwk("egiw", efwt(int ), (int)212);
                if (!var14_3) ** GOTO lbl123
                throw null;
            }
lbl207:
            // 2 sources

            case 17: {
                var13_4 /* !! */  = (int)gh.efwk("egix", efwt(int ), (int)213);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl408
            }
            case 18: {
                var13_4 /* !! */  = (int)gh.efwk("egiy", efwt(int ), (int)214);
                if (!var14_3) ** GOTO lbl183
                throw null;
            }
            case 19: {
                var13_4 /* !! */  = (int)gh.efwk("egiz", efwt(int ), (int)215);
                if (!var14_3) ** GOTO lbl193
                throw null;
            }
            case 20: {
                var13_4 /* !! */  = (int)gh.efwk("egja", efwt(int ), (int)216);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl225:
            // 3 sources

            case 21: {
                var13_4 /* !! */  = (int)gh.efwk("egjb", efwt(int ), (int)217);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl230:
            // 2 sources

            case 22: {
                var13_4 /* !! */  = (int)gh.efwk("egjc", efwt(int ), (int)218);
                if (!var14_3) ** GOTO lbl193
                throw null;
            }
lbl234:
            // 3 sources

            case 23: {
                var13_4 /* !! */  = (int)gh.efwk("egjd", efwt(int ), (int)219);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl239:
            // 2 sources

            case 24: {
                var13_4 /* !! */  = (int)gh.efwk("egje", efwt(int ), (int)220);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 25: {
                var13_4 /* !! */  = (int)gh.efwk("egjf", efwt(int ), (int)221);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl249:
            // 3 sources

            case 26: {
                var13_4 /* !! */  = (int)gh.efwk("egjg", efwt(int ), (int)222);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 27: {
                var13_4 /* !! */  = (int)gh.efwk("egjh", efwt(int ), (int)223);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl259:
            // 2 sources

            case 28: {
                var13_4 /* !! */  = (int)gh.efwk("egji", efwt(int ), (int)224);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl264:
            // 2 sources

            case 29: {
                var13_4 /* !! */  = (int)gh.efwk("egjj", efwt(int ), (int)225);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl269:
            // 2 sources

            case 30: {
                var13_4 /* !! */  = (int)gh.efwk("egjk", efwt(int ), (int)226);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl476
            }
            case 31: {
                var13_4 /* !! */  = (int)gh.efwk("egjl", efwt(int ), (int)227);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl279:
            // 4 sources

            case 32: {
                var13_4 /* !! */  = (int)gh.efwk("egjm", efwt(int ), (int)228);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 33: {
                var13_4 /* !! */  = (int)gh.efwk("egjn", efwt(int ), (int)229);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl289:
            // 2 sources

            case 34: {
                var13_4 /* !! */  = (int)gh.efwk("egjo", efwt(int ), (int)230);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl294:
            // 2 sources

            case 35: {
                var13_4 /* !! */  = (int)gh.efwk("egjp", efwt(int ), (int)231);
                if (!var14_3) ** GOTO lbl225
                throw null;
            }
lbl298:
            // 2 sources

            case 36: {
                var13_4 /* !! */  = (int)gh.efwk("egjq", efwt(int ), (int)232);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl303:
            // 3 sources

            case 37: {
                var13_4 /* !! */  = (int)gh.efwk("egjr", efwt(int ), (int)233);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl476
            }
lbl308:
            // 2 sources

            case 38: {
                var13_4 /* !! */  = (int)gh.efwk("egjs", efwt(int ), (int)234);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl492
            }
lbl313:
            // 2 sources

            case 39: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_4 /* !! */  = (int)gh.efwk("egjt", efwt(int ), (int)235);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl349
                    break;
                }
            }
lbl319:
            // 3 sources

            case 40: {
                var13_4 /* !! */  = (int)gh.efwk("egju", efwt(int ), (int)236);
                if (!var14_3) ** GOTO lbl133
                throw null;
            }
            case 41: {
                var13_4 /* !! */  = (int)gh.efwk("egjv", efwt(int ), (int)237);
                if (!var14_3) ** GOTO lbl279
                throw null;
            }
lbl327:
            // 2 sources

            case 42: {
                var13_4 /* !! */  = (int)gh.efwk("egjw", efwt(int ), (int)238);
                if (!var14_3) ** GOTO lbl289
                throw null;
            }
            case 43: {
                var13_4 /* !! */  = (int)gh.efwk("egjx", efwt(int ), (int)239);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl374
            }
            case 44: {
                var13_4 /* !! */  = (int)gh.efwk("egjy", efwt(int ), (int)240);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 45: {
                var13_4 /* !! */  = (int)gh.efwk("egjz", efwt(int ), (int)241);
                if (!var14_3) ** GOTO lbl234
                throw null;
            }
lbl345:
            // 2 sources

            case 46: {
                var13_4 /* !! */  = (int)gh.efwk("egka", efwt(int ), (int)242);
                if (!var14_3) ** GOTO lbl279
                throw null;
            }
lbl349:
            // 3 sources

            case 47: {
                var13_4 /* !! */  = (int)gh.efwk("egkb", efwt(int ), (int)243);
                if (!var14_3) ** GOTO lbl133
                throw null;
            }
            case 48: {
                var13_4 /* !! */  = (int)gh.efwk("egkc", efwt(int ), (int)244);
                if (!var14_3) ** GOTO lbl269
                throw null;
            }
lbl357:
            // 3 sources

            case 49: {
                var13_4 /* !! */  = (int)gh.efwk("egkd", efwt(int ), (int)245);
                if (!var14_3) ** GOTO lbl313
                throw null;
            }
lbl361:
            // 2 sources

            case 50: {
                var13_4 /* !! */  = (int)gh.efwk("egke", efwt(int ), (int)246);
                if (!var14_3) ** GOTO lbl239
                throw null;
            }
            case 51: {
                var13_4 /* !! */  = (int)gh.efwk("egkf", efwt(int ), (int)247);
                if (!var14_3) ** GOTO lbl178
                throw null;
            }
lbl369:
            // 3 sources

            case 52: {
                var13_4 /* !! */  = (int)gh.efwk("egkg", efwt(int ), (int)248);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl374:
            // 2 sources

            case 53: {
                var13_4 /* !! */  = (int)gh.efwk("egkh", efwt(int ), (int)249);
                if (!var14_3) ** GOTO lbl308
                throw null;
            }
lbl378:
            // 3 sources

            case 54: {
                var13_4 /* !! */  = (int)gh.efwk("egki", efwt(int ), (int)250);
                if (!var14_3) ** GOTO lbl128
                throw null;
            }
lbl382:
            // 2 sources

            case 55: {
                var13_4 /* !! */  = (int)gh.efwk("egkj", efwt(int ), (int)251);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl387:
            // 2 sources

            case 56: {
                var13_4 /* !! */  = (int)gh.efwk("egkk", efwt(int ), (int)252);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl413
            }
            case 57: {
                var13_4 /* !! */  = (int)gh.efwk("egkl", efwt(int ), (int)253);
                if (var14_3) {
                    throw null;
                }
            }
lbl396:
            // 4 sources

            case 58: {
                var13_4 /* !! */  = (int)gh.efwk("egkm", efwt(int ), (int)254);
                if (!var14_3) ** GOTO lbl298
                throw null;
            }
            case 59: {
                var13_4 /* !! */  = (int)gh.efwk("egkn", efwt(int ), (int)255);
                if (!var14_3) ** GOTO lbl163
                throw null;
            }
lbl404:
            // 2 sources

            case 60: {
                var13_4 /* !! */  = (int)gh.efwk("egko", efwt(int ), (int)256);
                if (!var14_3) ** GOTO lbl123
                throw null;
            }
lbl408:
            // 2 sources

            case 61: {
                var13_4 /* !! */  = (int)gh.efwk("egkp", efwt(int ), (int)257);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl413:
            // 5 sources

            case 62: {
                var13_4 /* !! */  = (int)gh.efwk("egkq", efwt(int ), (int)258);
                if (!var14_3) ** GOTO lbl148
                throw null;
            }
            case 63: {
                var13_4 /* !! */  = (int)gh.efwk("egkr", efwt(int ), (int)259);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 64: {
                var13_4 /* !! */  = (int)gh.efwk("egks", efwt(int ), (int)260);
                if (!var14_3) ** GOTO lbl396
                throw null;
            }
            case 65: {
                var13_4 /* !! */  = (int)gh.efwk("egkt", efwt(int ), (int)261);
                if (!var14_3) ** GOTO lbl382
                throw null;
            }
            case 66: {
                var13_4 /* !! */  = (int)gh.efwk("egku", efwt(int ), (int)262);
                if (!var14_3) ** GOTO lbl207
                throw null;
            }
lbl434:
            // 4 sources

            case 67: {
                var13_4 /* !! */  = (int)gh.efwk("egkv", efwt(int ), (int)263);
                if (!var14_3) ** GOTO lbl294
                throw null;
            }
lbl438:
            // 2 sources

            case 68: {
                var13_4 /* !! */  = (int)gh.efwk("egkw", efwt(int ), (int)264);
                if (!var14_3) ** GOTO lbl133
                throw null;
            }
lbl442:
            // 2 sources

            case 69: {
                var13_4 /* !! */  = (int)gh.efwk("egkx", efwt(int ), (int)265);
                if (!var14_3) ** GOTO lbl438
                throw null;
            }
lbl446:
            // 2 sources

            case 70: {
                var13_4 /* !! */  = (int)gh.efwk("egky", efwt(int ), (int)266);
                if (!var14_3) ** GOTO lbl357
                throw null;
            }
            case 71: {
                var13_4 /* !! */  = (int)gh.efwk("egkz", efwt(int ), (int)267);
                if (!var14_3) ** GOTO lbl434
                throw null;
            }
lbl454:
            // 3 sources

            case 72: {
                var13_4 /* !! */  = (int)gh.efwk("egla", efwt(int ), (int)268);
                if (!var14_3) ** GOTO lbl178
                throw null;
            }
lbl458:
            // 2 sources

            case 73: {
                var13_4 /* !! */  = (int)gh.efwk("eglb", efwt(int ), (int)269);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl463:
            // 3 sources

            case 74: {
                var13_4 /* !! */  = (int)gh.efwk("eglc", efwt(int ), (int)270);
                if (!var14_3) ** GOTO lbl458
                throw null;
            }
            case 75: {
                var13_4 /* !! */  = (int)gh.efwk("egld", efwt(int ), (int)271);
                if (!var14_3) ** GOTO lbl369
                throw null;
            }
lbl471:
            // 3 sources

            case 76: {
                do {
                    var13_4 /* !! */  = (int)gh.efwk("egle", efwt(int ), (int)272);
                } while (!var14_3);
                throw null;
            }
lbl476:
            // 3 sources

            case 77: {
                var13_4 /* !! */  = (int)gh.efwk("eglf", efwt(int ), (int)273);
                if (!var14_3) ** GOTO lbl234
                throw null;
            }
            case 78: {
                var13_4 /* !! */  = (int)gh.efwk("eglg", efwt(int ), (int)274);
                if (!var14_3) ** GOTO lbl225
                throw null;
            }
lbl484:
            // 4 sources

            case 79: {
                var13_4 /* !! */  = (int)gh.efwk("eglh", efwt(int ), (int)275);
                if (!var14_3) ** GOTO lbl471
                throw null;
            }
lbl488:
            // 2 sources

            case 80: {
                var13_4 /* !! */  = (int)gh.efwk("egli", efwt(int ), (int)276);
                if (!var14_3) ** GOTO lbl446
                throw null;
            }
lbl492:
            // 3 sources

            case 81: {
                var13_4 /* !! */  = (int)gh.efwk("eglj", efwt(int ), (int)277);
                if (!var14_3) ** GOTO lbl345
                throw null;
            }
            case 82: 
        }
        var13_4 /* !! */  = (int)gh.efwk("eglk", efwt(int ), (int)278);
        ** while (!var14_3)
lbl499:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ehjg() {
        gh.efwj[300] = -101558360;
        gh.efwj[301] = -1875142176;
        gh.efwj[302] = -285906187;
        gh.efwj[303] = -1384558064;
        gh.efwj[304] = 331885480;
        gh.efwj[305] = -1146047954;
        gh.efwj[306] = 431024865;
        gh.efwj[307] = -202363318;
        gh.efwj[308] = 1450416506;
        gh.efwj[309] = 178958211;
        gh.efwj[310] = 1552779390;
        gh.efwj[311] = -492751943;
        gh.efwj[312] = 469220755;
        gh.efwj[313] = -1728161870;
        gh.efwj[314] = 2017723867;
        gh.efwj[315] = -1494005268;
        gh.efwj[316] = -943572005;
        gh.efwj[317] = 1801437619;
        gh.efwj[318] = 1398876514;
        gh.efwj[319] = -531872548;
        gh.efwj[320] = 612785761;
        gh.efwj[321] = -1914326708;
        gh.efwj[322] = -1464740560;
        gh.efwj[323] = 604967693;
        gh.efwj[324] = -637994088;
        gh.efwj[325] = 43408548;
        gh.efwj[326] = 18107100;
        gh.efwj[327] = -238088973;
        gh.efwj[328] = 1015534589;
        gh.efwj[329] = -1754268810;
        gh.efwj[330] = -1067524715;
        gh.efwj[331] = 1343848120;
        gh.efwj[332] = 96893756;
        gh.efwj[333] = -244120056;
        gh.efwj[334] = -743459027;
        gh.efwj[335] = -1055122836;
        gh.efwj[336] = 1664627240;
        gh.efwj[337] = 463134123;
        gh.efwj[338] = 550477515;
        gh.efwj[339] = -1901941094;
        gh.efwj[340] = -1032557538;
        gh.efwj[341] = -132506630;
        gh.efwj[342] = 568893502;
        gh.efwj[343] = -521774661;
        gh.efwj[344] = -31470441;
        gh.efwj[345] = -54799279;
        gh.efwj[346] = -663429208;
        gh.efwj[347] = 964030215;
        gh.efwj[348] = 819904310;
        gh.efwj[349] = 324239113;
        gh.efwj[350] = -2004230273;
        gh.efwj[351] = 1167290304;
        gh.efwj[352] = 1080571441;
        gh.efwj[353] = -745833230;
        gh.efwj[354] = -1447700704;
        gh.efwj[355] = 344732500;
        gh.efwj[356] = 953685132;
        gh.efwj[357] = -1315541204;
        gh.efwj[358] = 1172345641;
        gh.efwj[359] = 1389038130;
        gh.efwj[360] = 1765073493;
        gh.efwj[361] = -84957991;
        gh.efwj[362] = -1279663336;
        gh.efwj[363] = 747521182;
        gh.efwj[364] = -1736233756;
        gh.efwj[365] = -1899483116;
        gh.efwj[366] = 116309297;
        gh.efwj[367] = -1594436924;
        gh.efwj[368] = -461887644;
        gh.efwj[369] = -1644440032;
        gh.efwj[370] = -946385006;
        gh.efwj[371] = -999797020;
        gh.efwj[372] = -285271356;
        gh.efwj[373] = -332101737;
        gh.efwj[374] = 1377251469;
        gh.efwj[375] = -158787137;
        gh.efwj[376] = 1351516132;
        gh.efwj[377] = 1188497878;
        gh.efwj[378] = 1447001312;
        gh.efwj[379] = 1585980051;
        gh.efwj[380] = -481695500;
        gh.efwj[381] = -1724190650;
        gh.efwj[382] = 1112801541;
        gh.efwj[383] = -386000677;
        gh.efwj[384] = 1913542836;
        gh.efwj[385] = -383143574;
        gh.efwj[386] = 552759008;
        gh.efwj[387] = -1509646848;
        gh.efwj[388] = -2111648591;
        gh.efwj[389] = 1730088679;
        gh.efwj[390] = 257800122;
        gh.efwj[391] = -802722519;
        gh.efwj[392] = 1894475699;
        gh.efwj[393] = 610821831;
        gh.efwj[394] = 1256675911;
        gh.efwj[395] = -2067657174;
        gh.efwj[396] = -428497453;
        gh.efwj[397] = -742506594;
        gh.efwj[398] = -132539823;
        gh.efwj[399] = -1854869293;
    }

    private static /* synthetic */ void ehjo() {
        gh.efxk[0] = 8523827560571599664L;
        gh.efxk[1] = -5117910290712020354L;
        gh.efxk[2] = -6438221330253995084L;
        gh.efxk[3] = -5126251129541580553L;
        gh.efxk[4] = 554161248340641329L;
        gh.efxk[5] = 3769041366171964075L;
        gh.efxk[6] = -2212992285354084711L;
        gh.efxk[7] = -8690789419638914013L;
        gh.efxk[8] = 4359469136048452194L;
        gh.efxk[9] = 3198998163489079246L;
        gh.efxk[10] = 978075977874482601L;
        gh.efxk[11] = -5566654154948320538L;
        gh.efxk[12] = 2363777691163655857L;
        gh.efxk[13] = -2163473048672088399L;
        gh.efxk[14] = -5941953457082849328L;
        gh.efxk[15] = 3703787195379003793L;
        gh.efxk[16] = 7446417312943093585L;
        gh.efxk[17] = -8036790210242234012L;
        gh.efxk[18] = 3708498794418662082L;
        gh.efxk[19] = 2002361227295464582L;
        gh.efxk[20] = 687170226523017492L;
        gh.efxk[21] = 1182465394853634859L;
        gh.efxk[22] = -1659325513801706825L;
        gh.efxk[23] = 3384851287130048635L;
        gh.efxk[24] = 2732141480286320657L;
        gh.efxk[25] = 5207617768760802458L;
        gh.efxk[26] = -904867302669417681L;
        gh.efxk[27] = 3273890454334240593L;
        gh.efxk[28] = -5124528141925970481L;
        gh.efxk[29] = 8906266005902083462L;
        gh.efxk[30] = -1808417575474136841L;
        gh.efxk[31] = -2999351702721790845L;
        gh.efxk[32] = 5643385759357820497L;
        gh.efxk[33] = -3031552466122983373L;
        gh.efxk[34] = -3668121823473886693L;
        gh.efxk[35] = 3904978496938296203L;
        gh.efxk[36] = -7166128561523616844L;
        gh.efxk[37] = -5879827809295352048L;
        gh.efxk[38] = 6923261131659004478L;
        gh.efxk[39] = 2080700723789732685L;
        gh.efxk[40] = -6287394597167420795L;
        gh.efxk[41] = 4755932425971931371L;
        gh.efxk[42] = 6217660216178321433L;
        gh.efxk[43] = 59582402388181732L;
        gh.efxk[44] = -6249416911174207893L;
        gh.efxk[45] = -8844220482993403182L;
        gh.efxk[46] = 8403533904591876622L;
        gh.efxk[47] = -7885878927627424342L;
        gh.efxk[48] = 1403907428198136492L;
        gh.efxk[49] = -8465887945516299516L;
        gh.efxk[50] = -5345499495489984982L;
        gh.efxk[51] = -4045351863547870711L;
        gh.efxk[52] = -6575613661614554226L;
        gh.efxk[53] = -2808099625583638769L;
        gh.efxk[54] = -7341063962154616783L;
        gh.efxk[55] = -436307875162757375L;
        gh.efxk[56] = 3223375918661336451L;
        gh.efxk[57] = 3230478871938250803L;
        gh.efxk[58] = -1665907681750427382L;
        gh.efxk[59] = 1731703248212900080L;
        gh.efxk[60] = -2868035145807664222L;
        gh.efxk[61] = 3982916331937627772L;
        gh.efxk[62] = -349647403798536220L;
        gh.efxk[63] = -571568975727212261L;
        gh.efxk[64] = -7064564115900087622L;
        gh.efxk[65] = 553625906884497242L;
        gh.efxk[66] = 1479701180971596621L;
        gh.efxk[67] = 2365646092979269968L;
        gh.efxk[68] = -6989757352478275591L;
        gh.efxk[69] = -242985703717801291L;
        gh.efxk[70] = 2879137014590718171L;
        gh.efxk[71] = 6914378297137467671L;
        gh.efxk[72] = 7777796775921065167L;
        gh.efxk[73] = 5425232841827734181L;
        gh.efxk[74] = 4857708790333861773L;
        gh.efxk[75] = 5994749709355079687L;
        gh.efxk[76] = -5829150909218246794L;
        gh.efxk[77] = -4988151567409847870L;
        gh.efxk[78] = -8828066210548463648L;
        gh.efxk[79] = -7195473803374999601L;
        gh.efxk[80] = -7121702299809471082L;
        gh.efxk[81] = -6288385204088091511L;
        gh.efxk[82] = -8750988636606302596L;
        gh.efxk[83] = -2618822195761146635L;
        gh.efxk[84] = 856382252985276242L;
        gh.efxk[85] = -1805295603671343988L;
        gh.efxk[86] = -3038281750660258752L;
        gh.efxk[87] = -5061226952997529207L;
        gh.efxk[88] = 421009205809804452L;
        gh.efxk[89] = 3307749020185731137L;
        gh.efxk[90] = -2896082816737822631L;
        gh.efxk[91] = 6867696209375629802L;
        gh.efxk[92] = -6226313043361035905L;
        gh.efxk[93] = -2613975566057443583L;
        gh.efxk[94] = -7121447374552118722L;
        gh.efxk[95] = 3171935084842298523L;
        gh.efxk[96] = -681013361300278994L;
        gh.efxk[97] = 7058013091729936592L;
        gh.efxk[98] = 291369619353730257L;
        gh.efxk[99] = -1825762938414820921L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void activate() {
        v0 /* !! */  = gh.kp;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - gh.efwk("ehbx", efxi(int ), (int)282));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1389787195: {
                    v1 = gh.efwk("ehby", efxi(int ), (int)283);
                    continue block20;
                }
                case -1262799597: {
                    break block20;
                }
                case -1036514692: {
                    v1 = gh.efwk("ehbz", efxi(int ), (int)284);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = gh.c;
        while (true) {
            block45: {
                if ((v2 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("ehca", efxi(int ), (int)285)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != gh.efwk("ehcb", efwt(int ), (int)531)) break block45;
                var2_2 /* !! */  = gh.b;
                v3 /* !! */  = gh.kp;
                if (true) ** GOTO lbl27
            }
            v2 /* !! */  = (long)gh.efwk("ehcc", efwt(int ), (int)532);
        }
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - gh.efwk("ehcd", efxi(int ), (int)286));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1381979436: {
                    v4 = gh.efwk("ehce", efxi(int ), (int)287);
                    continue block22;
                }
                case -1262799597: {
                    break block22;
                }
                case 750297765: {
                    v4 = gh.efwk("ehcf", efxi(int ), (int)288);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = gh.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("ehcg", efxi(int ), (int)289)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == gh.efwk("ehch", efwt(int ), (int)533)) {
                super.activate();
                if (var1_3) return;
                break;
            }
            v5 /* !! */  = (long)gh.efwk("ehci", efwt(int ), (int)534);
        }
        if (var1_3) return;
        v6 = gh.efwk("ehcj", efwt(int ), (int)535);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("ehck", efxi(int ), (int)290)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == gh.efwk("ehcl", efwt(int ), (int)536)) {
                this.grimPointIndex = (int)v6;
                if (var1_3) return;
                break;
            }
            v7 /* !! */  = (long)gh.efwk("ehcm", efwt(int ), (int)537);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block46: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)gh.efwk("ehcn", efwt(int ), (int)538);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block46;
                    }
                    case 2: {
                        ** GOTO lbl79
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)gh.efwk("ehcu", efwt(int ), (int)545);
                        if (var3_1) {
                            throw null;
                        }
lbl79:
                        // 3 sources

                        var2_2 /* !! */  = (int)gh.efwk("ehcp", efwt(int ), (int)540);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block46;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)gh.efwk("ehco", efwt(int ), (int)539);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)gh.efwk("ehcr", efwt(int ), (int)542);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)gh.efwk("ehct", efwt(int ), (int)544);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)gh.efwk("ehcs", efwt(int ), (int)543);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl105
            }
            do {
                if (true) continue block25;
lbl105:
                // 2 sources

                var2_2 /* !! */  = (int)gh.efwk("ehcq", efwt(int ), (int)541);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ehjn() {
        gh.efxj[300] = -7703064769407434136L;
        gh.efxj[301] = -7487402938513788422L;
        gh.efxj[302] = 248754802974380448L;
        gh.efxj[303] = 7346293457993126609L;
        gh.efxj[304] = -273898370874455040L;
        gh.efxj[305] = 3774234589284853429L;
        gh.efxj[306] = -5518307717223355912L;
        gh.efxj[307] = -8927267724335588454L;
        gh.efxj[308] = -263981242175122143L;
        gh.efxj[309] = 3443453163741657201L;
        gh.efxj[310] = 4028323189956236593L;
        gh.efxj[311] = -6319948640486254681L;
        gh.efxj[312] = 3692784087098205575L;
        gh.efxj[313] = -1159960725985614404L;
        gh.efxj[314] = -7946974492240506469L;
        gh.efxj[315] = 5231601524592121802L;
        gh.efxj[316] = 7328390299905767015L;
        gh.efxj[317] = 3544708049335396598L;
        gh.efxj[318] = 6569760612565880814L;
        gh.efxj[319] = -3125729352212785362L;
        gh.efxj[320] = 4591996690893385393L;
        gh.efxj[321] = 991656086246482102L;
        gh.efxj[322] = -1971773775657667614L;
        gh.efxj[323] = 1512008948897010266L;
        gh.efxj[324] = -3411405047752908905L;
        gh.efxj[325] = -2083459230718419210L;
        gh.efxj[326] = 430898922361727841L;
        gh.efxj[327] = 8022688025906546297L;
        gh.efxj[328] = -4374099047513695913L;
        gh.efxj[329] = -4832446947299146123L;
        gh.efxj[330] = -4500300738371412949L;
        gh.efxj[331] = -1296909725986050082L;
        gh.efxj[332] = 3282199280093346662L;
        gh.efxj[333] = -4230163558851084494L;
        gh.efxj[334] = 4642768580340739452L;
        gh.efxj[335] = -7171953265436806139L;
        gh.efxj[336] = 893597869360002366L;
        gh.efxj[337] = -2937111613849109018L;
        gh.efxj[338] = 1125661402301334054L;
        gh.efxj[339] = 9070138353977617772L;
        gh.efxj[340] = 2868736167913904513L;
        gh.efxj[341] = -2858422272575784889L;
        gh.efxj[342] = 2718947164096519985L;
        gh.efxj[343] = -8371976462858357163L;
        gh.efxj[344] = -3297805062353690435L;
        gh.efxj[345] = -4448819669880670861L;
        gh.efxj[346] = -3835785167709111428L;
        gh.efxj[347] = 3963565084984918729L;
        gh.efxj[348] = 3004318519030880969L;
        gh.efxj[349] = -8039937952310662656L;
        gh.efxj[350] = -6908400037811276891L;
        gh.efxj[351] = 2340437371320391657L;
        gh.efxj[352] = 3293541915770661378L;
        gh.efxj[353] = 6337771720372675435L;
        gh.efxj[354] = -5765494328150672163L;
        gh.efxj[355] = -3475242612092188636L;
        gh.efxj[356] = 4062114604221695511L;
        gh.efxj[357] = 5620111829040799589L;
        gh.efxj[358] = 3809649116662266079L;
        gh.efxj[359] = 7008818594122058872L;
        gh.efxj[360] = -6072652369136599624L;
        gh.efxj[361] = -8426148039784635501L;
        gh.efxj[362] = 1492847031787485935L;
        gh.efxj[363] = -1027148006060199409L;
        gh.efxj[364] = -6935378231412324211L;
        gh.efxj[365] = 3952310856740443618L;
        gh.efxj[366] = -513695957901324265L;
        gh.efxj[367] = 8209994672355775913L;
        gh.efxj[368] = 5588673857129860685L;
        gh.efxj[369] = -8860440870962128612L;
        gh.efxj[370] = -6419853486254267420L;
        gh.efxj[371] = 8024089438280265825L;
        gh.efxj[372] = 4799461012475312370L;
        gh.efxj[373] = 2688976504438364091L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int getDirectionMultiplier() {
        block94: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gh.kp - gh.efwk("egqf", efxi(int ), (int)139)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gh.efwk("egqg", efwt(int ), (int)370)) break;
                v0 /* !! */  = (long)gh.efwk("egqh", efwt(int ), (int)371);
            }
            var6_1 = gh.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = gh.kp - gh.efwk("egqi", efxi(int ), (int)140)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == gh.efwk("egqj", efwt(int ), (int)372)) break;
                v1 /* !! */  = (long)gh.efwk("egqk", efwt(int ), (int)373);
            }
            var5_2 /* !! */  = gh.b;
            v2 /* !! */  = gh.kp;
            if (true) ** GOTO lbl19
            block57: while (true) {
                v2 /* !! */  = (long)(v3 - gh.efwk("egql", efxi(int ), (int)141));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1675758682: {
                        v3 = gh.efwk("egqm", efxi(int ), (int)142);
                        continue block57;
                    }
                    case -1262799597: {
                        break block57;
                    }
                    case -467500307: {
                        v3 = gh.efwk("egqn", efxi(int ), (int)143);
                        continue block57;
                    }
                    case 166512560: {
                        v3 = gh.efwk("egqo", efxi(int ), (int)144);
                        continue block57;
                    }
                }
                break;
            }
            var4_3 = gh.a;
            if (var6_1) {
                throw null;
lbl34:
                // 13 sources

                return (int)gh.efwk("egqp", efwt(int ), (int)374);
            }
            if (var4_3 || var4_3) ** GOTO lbl34
            var1_4 = gh.efwk("egqq", efwt(int ), (int)375);
            if (var4_3 || var4_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gh.kp - gh.efwk("egqr", efxi(int ), (int)145)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == gh.efwk("egqs", efwt(int ), (int)376)) break;
                v4 /* !! */  = (long)gh.efwk("egqt", efwt(int ), (int)377);
            }
            v5 /* !! */  = gh.kp;
            if (true) ** GOTO lbl49
            block60: while (true) {
                v5 /* !! */  = (long)(v6 - gh.efwk("egqu", efxi(int ), (int)146));
lbl49:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2027273768: {
                        v6 = gh.efwk("egqv", efxi(int ), (int)147);
                        continue block60;
                    }
                    case -1262799597: {
                        break block60;
                    }
                    case 667383735: {
                        v6 = gh.efwk("egqw", efxi(int ), (int)148);
                        continue block60;
                    }
                }
                break;
            }
            if (!this.setting.isSelected("Direction Mode")) ** GOTO lbl136
            if (var4_3 || var4_3) ** GOTO lbl34
            v7 /* !! */  = gh.kp;
            if (true) ** GOTO lbl64
            block61: while (true) {
                v7 /* !! */  = (long)(v8 - gh.efwk("egqx", efxi(int ), (int)149));
lbl64:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1262799597: {
                        break block61;
                    }
                    case -960520309: {
                        v8 = gh.efwk("egqy", efxi(int ), (int)150);
                        continue block61;
                    }
                    case -195684156: {
                        v8 = gh.efwk("egqz", efxi(int ), (int)151);
                        continue block61;
                    }
                }
                break;
            }
            v9 /* !! */  = gh.kp;
            if (true) ** GOTO lbl77
            block62: while (true) {
                v9 /* !! */  = (long)(gh.efwk("egrb", efxi(int ), (int)153) - gh.efwk("egra", efxi(int ), (int)152));
lbl77:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1262799597: {
                        break block62;
                    }
                    case 2037232285: {
                        continue block62;
                    }
                }
                break;
            }
            if (!this.directionMode.isSelected("Counterclockwise")) break block94;
            if (var4_3 || var4_3) ** GOTO lbl34
            var1_4 = gh.efwk("egrc", efwt(int ), (int)378);
            if (var4_3) ** GOTO lbl34
            if (var6_1) {
                throw null;
            }
            ** GOTO lbl136
        }
        if (var4_3 || var4_3) ** GOTO lbl34
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = gh.kp - gh.efwk("egrd", efxi(int ), (int)154)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == gh.efwk("egre", efwt(int ), (int)379)) break;
            v10 /* !! */  = (long)gh.efwk("egrf", efwt(int ), (int)380);
        }
        v11 /* !! */  = gh.kp;
        if (true) ** GOTO lbl101
        block64: while (true) {
            v11 /* !! */  = (long)(v12 - gh.efwk("egrg", efxi(int ), (int)155));
lbl101:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1262799597: {
                    break block64;
                }
                case 544354687: {
                    v12 = gh.efwk("egrh", efxi(int ), (int)156);
                    continue block64;
                }
                case 1541506474: {
                    v12 = gh.efwk("egri", efxi(int ), (int)157);
                    continue block64;
                }
            }
            break;
        }
        if (!this.directionMode.isSelected("Random")) ** GOTO lbl136
        if (var4_3 || var4_3) ** GOTO lbl34
        v13 /* !! */  = gh.kp;
        if (true) ** GOTO lbl116
        block65: while (true) {
            v13 /* !! */  = (long)(gh.efwk("egrk", efxi(int ), (int)159) - gh.efwk("egrj", efxi(int ), (int)158));
lbl116:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1814348186: {
                    continue block65;
                }
                case -1262799597: {
                    break block65;
                }
            }
            break;
        }
        var2_5 = System.currentTimeMillis() / gh.efwk("egrl", efxi(int ), (int)160);
        if (var4_3) ** GOTO lbl34
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl34
                if (var2_5 % gh.efwk("egrm", efxi(int ), (int)161) != gh.efwk("egrn", efxi(int ), (int)162)) ** GOTO lbl133
                if (var4_3) ** GOTO lbl34
                v14 = gh.efwk("egro", efwt(int ), (int)381);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl135
lbl133:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl34
                v14 = var1_4 = gh.efwk("egrp", efwt(int ), (int)382);
lbl135:
                // 2 sources

                if (var4_3) ** GOTO lbl34
lbl136:
                // 4 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return (int)var1_4;
            }
lbl139:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)gh.efwk("egrq", efwt(int ), (int)383);
                if (!var6_1) break;
                throw null;
            }
lbl143:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)gh.efwk("egrr", efwt(int ), (int)384);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl210
                    break;
                }
            }
            case 2: {
                do {
                    var5_2 /* !! */  = (int)gh.efwk("egrs", efwt(int ), (int)385);
                } while (!var6_1);
                throw null;
            }
lbl154:
            // 3 sources

            case 3: {
                var5_2 /* !! */  = (int)gh.efwk("egrt", efwt(int ), (int)386);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 4: {
                var5_2 /* !! */  = (int)gh.efwk("egru", efwt(int ), (int)387);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl164:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)gh.efwk("egrv", efwt(int ), (int)388);
                if (!var6_1) ** GOTO lbl143
                throw null;
            }
            case 6: {
                var5_2 /* !! */  = (int)gh.efwk("egrw", efwt(int ), (int)389);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 7: {
                var5_2 /* !! */  = (int)gh.efwk("egrx", efwt(int ), (int)390);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 8: {
                var5_2 /* !! */  = (int)gh.efwk("egry", efwt(int ), (int)391);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 9: {
                var5_2 /* !! */  = (int)gh.efwk("egrz", efwt(int ), (int)392);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl188:
            // 4 sources

            case 10: {
                var5_2 /* !! */  = (int)gh.efwk("egsa", efwt(int ), (int)393);
                if (var6_1) {
                    throw null;
                }
            }
            case 11: {
                var5_2 /* !! */  = (int)gh.efwk("egsb", efwt(int ), (int)394);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 12: {
                var5_2 /* !! */  = (int)gh.efwk("egsc", efwt(int ), (int)395);
                if (var6_1) {
                    throw null;
                }
            }
lbl201:
            // 4 sources

            case 13: {
                var5_2 /* !! */  = (int)gh.efwk("egsd", efwt(int ), (int)396);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 14: {
                var5_2 /* !! */  = (int)gh.efwk("egse", efwt(int ), (int)397);
                if (!var6_1) ** GOTO lbl139
                throw null;
            }
lbl210:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)gh.efwk("egsf", efwt(int ), (int)398);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 16: {
                var5_2 /* !! */  = (int)gh.efwk("egsg", efwt(int ), (int)399);
                if (!var6_1) ** GOTO lbl154
                throw null;
            }
lbl219:
            // 2 sources

            case 17: {
                do {
                    var5_2 /* !! */  = (int)gh.efwk("egsh", efwt(int ), (int)400);
                } while (!var6_1);
                throw null;
            }
            case 18: {
                var5_2 /* !! */  = (int)gh.efwk("egsi", efwt(int ), (int)401);
                if (!var6_1) ** GOTO lbl219
                throw null;
            }
lbl228:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)gh.efwk("egsj", efwt(int ), (int)402);
                if (!var6_1) ** GOTO lbl188
                throw null;
            }
lbl232:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)gh.efwk("egsk", efwt(int ), (int)403);
                if (!var6_1) ** GOTO lbl164
                throw null;
            }
lbl236:
            // 4 sources

            case 21: {
                var5_2 /* !! */  = (int)gh.efwk("egsl", efwt(int ), (int)404);
                if (!var6_1) ** GOTO lbl188
                throw null;
            }
lbl240:
            // 3 sources

            case 22: {
                var5_2 /* !! */  = (int)gh.efwk("egsm", efwt(int ), (int)405);
                if (!var6_1) ** GOTO lbl154
                throw null;
            }
            case 23: 
        }
        var5_2 /* !! */  = (int)gh.efwk("egsn", efwt(int ), (int)406);
        ** while (!var6_1)
lbl247:
        // 1 sources

        throw null;
    }
}

