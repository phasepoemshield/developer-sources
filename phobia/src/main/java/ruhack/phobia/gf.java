/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_310;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.nq;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;

public class gf
extends ds {
    public static final int b;
    private final ov rot;
    private static final class_310 mc;
    private static int[] ejlf;
    public static final boolean c;
    public kf mode;
    private static long[] ejml;
    kg speed;
    private static long[] ejmm;
    private static int[] ejlg;
    private float lastYaw;
    public static final boolean a;
    private float lastPitch;
    protected static final long kt = -2857520335373846423L;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static gf getInstance() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = kt - gf.ejli("ejmp", ejmj(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == gf.ejli("ejmq", ejlp(int ), (int)8)) break;
            object = gf.ejli("ejmr", ejlp(int ), (int)9);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = kt - gf.ejli("ejmt", ejmj(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == gf.ejli("ejmx", ejlp(int ), (int)10)) break;
            object = gf.ejli("ejmy", ejlp(int ), (int)11);
        }
        int n2 = b;
        Object object = kt;
        block11: while (true) {
            switch ((int)object) {
                case 261503081: {
                    break block11;
                }
                case 1143028124: {
                    object = gf.ejli("ejnc", ejmj(int ), (int)3) - gf.ejli("ejna", ejmj(int ), (int)2);
                    continue block11;
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
        Object object2 = kt;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - gf.ejli("ejne", ejmj(int ), (int)4);
            }
            switch ((int)object2) {
                case -53229186: {
                    callSite = gf.ejli("ejng", ejmj(int ), (int)5);
                    continue block12;
                }
                case 261503081: {
                    return nj.get(gf.class);
                }
                case 540655563: {
                    callSite = gf.ejli("ejni", ejmj(int ), (int)6);
                    continue block12;
                }
            }
            break;
        }
        return nj.get(gf.class);
    }

    private static /* synthetic */ void ekcb() {
        gf.ejmm[0] = 8905203305464866551L;
        gf.ejmm[1] = 8835710800693425341L;
        gf.ejmm[2] = 1138705959096394166L;
        gf.ejmm[3] = 4103550757550664731L;
        gf.ejmm[4] = -4342990378310678213L;
        gf.ejmm[5] = -1857229298981954127L;
        gf.ejmm[6] = 376189250142072989L;
        gf.ejmm[7] = 4852994859265461722L;
        gf.ejmm[8] = 1720014413936304932L;
        gf.ejmm[9] = -7250783431688766792L;
        gf.ejmm[10] = 5393274766702999506L;
        gf.ejmm[11] = -8092755472999349089L;
        gf.ejmm[12] = 9176305177760897638L;
        gf.ejmm[13] = -7446131037491787757L;
        gf.ejmm[14] = -3214844655346708884L;
        gf.ejmm[15] = -1054177313473256198L;
        gf.ejmm[16] = 8756615692383118614L;
        gf.ejmm[17] = -6176621447437363635L;
        gf.ejmm[18] = 7628703978218408943L;
        gf.ejmm[19] = 5198256190119984327L;
        gf.ejmm[20] = -7072161007612298938L;
        gf.ejmm[21] = -2445136417033244234L;
        gf.ejmm[22] = 10251879009465110L;
        gf.ejmm[23] = 2214318374071860443L;
        gf.ejmm[24] = 3730149544669307789L;
        gf.ejmm[25] = -230327392715291622L;
        gf.ejmm[26] = 3516766335469471900L;
        gf.ejmm[27] = -5976889998349230873L;
        gf.ejmm[28] = -352283043257094741L;
        gf.ejmm[29] = -7184991815142857689L;
        gf.ejmm[30] = 7691143246688033865L;
        gf.ejmm[31] = -1698140250116558992L;
        gf.ejmm[32] = -2712925235866206069L;
        gf.ejmm[33] = -2661872746126365840L;
        gf.ejmm[34] = -7436954470101333109L;
        gf.ejmm[35] = -922853590617979740L;
        gf.ejmm[36] = -1510878479012785050L;
        gf.ejmm[37] = 7720344711948955692L;
        gf.ejmm[38] = -7905486068622724604L;
        gf.ejmm[39] = 8299074318170812275L;
        gf.ejmm[40] = -8186076261592127137L;
        gf.ejmm[41] = 6218427085279515779L;
        gf.ejmm[42] = -7360849601124004989L;
        gf.ejmm[43] = 4666430790976699463L;
        gf.ejmm[44] = 159833371916182682L;
        gf.ejmm[45] = 2439737802916781767L;
        gf.ejmm[46] = 2138269033255028746L;
        gf.ejmm[47] = -7551935143555590318L;
        gf.ejmm[48] = -1711582989677498075L;
        gf.ejmm[49] = -4909572171158971321L;
        gf.ejmm[50] = -8204100947890586157L;
        gf.ejmm[51] = 2216319205066189453L;
        gf.ejmm[52] = -5298217162338273974L;
        gf.ejmm[53] = 4208026295557819417L;
        gf.ejmm[54] = 4404937116680724197L;
        gf.ejmm[55] = -1582469797025765005L;
        gf.ejmm[56] = 6267808831484002577L;
        gf.ejmm[57] = 3104511800721574108L;
        gf.ejmm[58] = 370275137090323590L;
        gf.ejmm[59] = -4039724349460346905L;
        gf.ejmm[60] = -5474742743193324694L;
        gf.ejmm[61] = -1660956983722132806L;
        gf.ejmm[62] = 7040277817013578050L;
        gf.ejmm[63] = 5519389668257631458L;
        gf.ejmm[64] = 1516558717775469850L;
        gf.ejmm[65] = 3616480406787403523L;
        gf.ejmm[66] = -831702208732365413L;
        gf.ejmm[67] = 3375604197376355505L;
        gf.ejmm[68] = -3117290896459030892L;
        gf.ejmm[69] = 1669578201732466949L;
        gf.ejmm[70] = -1570429810488135576L;
        gf.ejmm[71] = -4659779636155516057L;
        gf.ejmm[72] = 9082332690975806897L;
        gf.ejmm[73] = 9188438575508432795L;
        gf.ejmm[74] = 5894556192168694198L;
        gf.ejmm[75] = 7577725408955057812L;
        gf.ejmm[76] = 7880491464919276104L;
        gf.ejmm[77] = 5803619685084298865L;
        gf.ejmm[78] = 3639044649724064463L;
        gf.ejmm[79] = 3485745773027943583L;
        gf.ejmm[80] = 2489609371380155782L;
        gf.ejmm[81] = 5676212648492345487L;
        gf.ejmm[82] = -3552769910623555632L;
        gf.ejmm[83] = -7327907554747034164L;
        gf.ejmm[84] = 6181494314378357226L;
        gf.ejmm[85] = 8869119086011661920L;
        gf.ejmm[86] = 3778317038554742331L;
        gf.ejmm[87] = -2880409363717090912L;
        gf.ejmm[88] = 7071033409134476900L;
        gf.ejmm[89] = -3397228642026012823L;
        gf.ejmm[90] = -8840794133195213779L;
        gf.ejmm[91] = -6601955334658972830L;
        gf.ejmm[92] = -9022644166231229582L;
        gf.ejmm[93] = 7856260223554352647L;
        gf.ejmm[94] = -3726444149537700118L;
        gf.ejmm[95] = -1302725680867722714L;
        gf.ejmm[96] = 2423255623792080019L;
        gf.ejmm[97] = 2034165590274409592L;
        gf.ejmm[98] = 4803937101371339444L;
        gf.ejmm[99] = -1517427469180453203L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = gf.kt;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - gf.ejli("ekay", ejmj(int ), (int)155));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -146305179: {
                    v1 = gf.ejli("ekaz", ejmj(int ), (int)156);
                    continue block25;
                }
                case 261503081: {
                    break block25;
                }
                case 1920784206: {
                    v1 = gf.ejli("ekba", ejmj(int ), (int)157);
                    continue block25;
                }
            }
            break;
        }
        var3_1 = gf.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gf.kt - gf.ejli("ekbb", ejmj(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gf.ejli("ekbc", ejlp(int ), (int)196)) break;
            v2 /* !! */  = (long)gf.ejli("ekbd", ejlp(int ), (int)197);
        }
        var2_2 /* !! */  = gf.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = gf.kt - gf.ejli("ekbe", ejmj(int ), (int)159)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gf.ejli("ekbf", ejlp(int ), (int)198)) break;
                    v3 /* !! */  = (long)gf.ejli("ekbg", ejlp(int ), (int)199);
                }
                var1_3 = gf.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = gf.kt;
                if (true) ** GOTO lbl41
                block29: while (true) {
                    v4 /* !! */  = (long)(gf.ejli("ekbi", ejmj(int ), (int)161) - gf.ejli("ekbh", ejmj(int ), (int)160));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 261503081: {
                            break block29;
                        }
                        case 1781869768: {
                            continue block29;
                        }
                    }
                    break;
                }
                v5 /* !! */  = gf.kt;
                if (true) ** GOTO lbl50
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - gf.ejli("ekbj", ejmj(int ), (int)162));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 180306187: {
                            v6 = gf.ejli("ekbk", ejmj(int ), (int)163);
                            continue block30;
                        }
                        case 261503081: {
                            break block30;
                        }
                        case 1913366150: {
                            v6 = gf.ejli("ekbl", ejmj(int ), (int)164);
                            continue block30;
                        }
                        case 2041882834: {
                            v6 = gf.ejli("ekbm", ejmj(int ), (int)165);
                            continue block30;
                        }
                    }
                    break;
                }
                v7 = this.mode.isSelected("Matrix");
                v8 /* !! */  = gf.kt;
                if (true) ** GOTO lbl67
                block31: while (true) {
                    v8 /* !! */  = (long)(gf.ejli("ekbo", ejmj(int ), (int)167) - gf.ejli("ekbn", ejmj(int ), (int)166));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 261503081: {
                            break block31;
                        }
                        case 1578974729: {
                            continue block31;
                        }
                    }
                    break;
                }
                return v7;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gf.ejli("ekbp", ejlp(int ), (int)200);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gf.ejli("ekbq", ejlp(int ), (int)201);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gf.ejli("ekbr", ejlp(int ), (int)202);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gf.ejli("ekbs", ejlp(int ), (int)203);
        ** while (!var3_1)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ejmj(int n2) {
        return ejml[n2] ^ ejmm[n2];
    }

    private static /* synthetic */ void ekby() {
        gf.ejlg[200] = 545891341;
        gf.ejlg[201] = 1479183538;
        gf.ejlg[202] = 1480589228;
        gf.ejlg[203] = 1247342207;
    }

    private static /* synthetic */ void ekbv() {
        gf.ejlf[200] = 545891342;
        gf.ejlf[201] = 1479183536;
        gf.ejlf[202] = 1480589231;
        gf.ejlf[203] = 1247342206;
    }

    private static /* synthetic */ float ejlc(int n2) {
        return Float.intBitsToFloat(ejlf[n2] ^ ejlg[n2]);
    }

    static {
        ejlf = new int[204];
        ejlg = new int[204];
        gf.ekbt();
        gf.ekbu();
        gf.ekbv();
        gf.ekbw();
        gf.ekbx();
        gf.ekby();
        ejml = new long[168];
        ejmm = new long[168];
        gf.ekbz();
        gf.ekca();
        gf.ekcb();
        gf.ekcc();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleGrimMode(boolean var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gf.kt - gf.ejli("ejvl", ejmj(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gf.ejli("ejvm", ejlp(int ), (int)116)) break;
            v0 /* !! */  = (long)gf.ejli("ejvn", ejlp(int ), (int)117);
        }
        var5_3 = gf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gf.kt - gf.ejli("ejvo", ejmj(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gf.ejli("ejvp", ejlp(int ), (int)118)) break;
            v1 /* !! */  = (long)gf.ejli("ejvq", ejlp(int ), (int)119);
        }
        var4_4 /* !! */  = gf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gf.kt - gf.ejli("ejvr", ejmj(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gf.ejli("ejvs", ejlp(int ), (int)120)) break;
            v2 /* !! */  = (long)gf.ejli("ejvt", ejlp(int ), (int)121);
        }
        var3_5 = gf.a;
        if (var5_3) {
            throw null;
lbl21:
            // 9 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl21
        if (!var1_1) ** GOTO lbl199
        if (var3_5 || var3_5) ** GOTO lbl21
        v3 = gf.ejli("ejvu", ejlp(int ), (int)122);
        v4 /* !! */  = gf.kt;
        if (true) ** GOTO lbl31
        block61: while (true) {
            v4 /* !! */  = (long)(gf.ejli("ejvw", ejmj(int ), (int)96) - gf.ejli("ejvv", ejmj(int ), (int)95));
lbl31:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 261503081: {
                    break block61;
                }
                case 1479155176: {
                    continue block61;
                }
            }
            break;
        }
        os.freeCorrection = v3;
        if (var3_5 || var3_5) ** GOTO lbl21
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = gf.kt - gf.ejli("ejvx", ejmj(int ), (int)97)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == gf.ejli("ejvy", ejlp(int ), (int)123)) break;
            v5 /* !! */  = (long)gf.ejli("ejvz", ejlp(int ), (int)124);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = gf.kt - gf.ejli("ejwa", ejmj(int ), (int)98)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gf.ejli("ejwb", ejlp(int ), (int)125)) break;
            v6 /* !! */  = (long)gf.ejli("ejwc", ejlp(int ), (int)126);
        }
        v7 = gf.mc.field_1724;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_5 = gf.kt - gf.ejli("ejwd", ejmj(int ), (int)99)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gf.ejli("ejwe", ejlp(int ), (int)127)) break;
            v8 /* !! */  = (long)gf.ejli("ejwf", ejlp(int ), (int)128);
        }
        v9 = v7.method_36454();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = gf.kt - gf.ejli("ejwg", ejmj(int ), (int)100)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gf.ejli("ejwh", ejlp(int ), (int)129)) break;
            v10 /* !! */  = (long)gf.ejli("ejwi", ejlp(int ), (int)130);
        }
        var2_2 = nq.moveYaw(v9);
        if (var3_5 || var3_5) ** GOTO lbl21
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_7 = gf.kt - gf.ejli("ejwj", ejmj(int ), (int)101)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gf.ejli("ejwk", ejlp(int ), (int)131)) break;
            v11 /* !! */  = (long)gf.ejli("ejwl", ejlp(int ), (int)132);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_8 = gf.kt - gf.ejli("ejwm", ejmj(int ), (int)102)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gf.ejli("ejwn", ejlp(int ), (int)133)) break;
            v12 /* !! */  = (long)gf.ejli("ejwo", ejlp(int ), (int)134);
        }
        this.rot.setYaw(var2_2);
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** GOTO lbl21
                v13 /* !! */  = gf.kt;
                if (true) ** GOTO lbl81
                block68: while (true) {
                    v13 /* !! */  = (long)(v14 - gf.ejli("ejwp", ejmj(int ), (int)103));
lbl81:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1629593077: {
                            v14 = gf.ejli("ejwq", ejmj(int ), (int)104);
                            continue block68;
                        }
                        case 261503081: {
                            break block68;
                        }
                        case 781933544: {
                            v14 = gf.ejli("ejwr", ejmj(int ), (int)105);
                            continue block68;
                        }
                        case 1178903614: {
                            v14 = gf.ejli("ejws", ejmj(int ), (int)106);
                            continue block68;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_9 = gf.kt - gf.ejli("ejwt", ejmj(int ), (int)107)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gf.ejli("ejwu", ejlp(int ), (int)135)) break;
                    v15 /* !! */  = (long)gf.ejli("ejwv", ejlp(int ), (int)136);
                }
                v16 /* !! */  = gf.kt;
                if (true) ** GOTO lbl102
                block70: while (true) {
                    v16 /* !! */  = (long)(v17 - gf.ejli("ejww", ejmj(int ), (int)108));
lbl102:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2101806735: {
                            v17 = gf.ejli("ejwx", ejmj(int ), (int)109);
                            continue block70;
                        }
                        case -230014508: {
                            v17 = gf.ejli("ejwy", ejmj(int ), (int)110);
                            continue block70;
                        }
                        case 261503081: {
                            break block70;
                        }
                        case 638678212: {
                            v17 = gf.ejli("ejwz", ejmj(int ), (int)111);
                            continue block70;
                        }
                    }
                    break;
                }
                v18 = gf.mc.field_1724;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_10 = gf.kt - gf.ejli("ejxa", ejmj(int ), (int)112)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == gf.ejli("ejxb", ejlp(int ), (int)137)) break;
                    v19 /* !! */  = (long)gf.ejli("ejxc", ejlp(int ), (int)138);
                }
                v20 = v18.method_36455();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_11 = gf.kt - gf.ejli("ejxd", ejmj(int ), (int)113)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gf.ejli("ejxe", ejlp(int ), (int)139)) break;
                    v21 /* !! */  = (long)gf.ejli("ejxf", ejlp(int ), (int)140);
                }
                this.rot.setPitch(v20);
                if (var3_5 || var3_5) ** GOTO lbl21
                v22 /* !! */  = gf.kt;
                if (true) ** GOTO lbl132
                block73: while (true) {
                    v22 /* !! */  = (long)(v23 - gf.ejli("ejxg", ejmj(int ), (int)114));
lbl132:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1554598728: {
                            v23 = gf.ejli("ejxh", ejmj(int ), (int)115);
                            continue block73;
                        }
                        case 197283705: {
                            v23 = gf.ejli("ejxi", ejmj(int ), (int)116);
                            continue block73;
                        }
                        case 261503081: {
                            break block73;
                        }
                        case 705242584: {
                            v23 = gf.ejli("ejxj", ejmj(int ), (int)117);
                            continue block73;
                        }
                    }
                    break;
                }
                v24 = hn.getInstance();
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_12 = gf.kt - gf.ejli("ejxk", ejmj(int ), (int)118)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == gf.ejli("ejxl", ejlp(int ), (int)141)) break;
                    v25 /* !! */  = (long)gf.ejli("ejxm", ejlp(int ), (int)142);
                }
                if (v24.getTarget() != null) ** GOTO lbl199
                if (var3_5 || var3_5) ** GOTO lbl21
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_13 = gf.kt - gf.ejli("ejxn", ejmj(int ), (int)119)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gf.ejli("ejxo", ejlp(int ), (int)143)) break;
                    v26 /* !! */  = (long)gf.ejli("ejxp", ejlp(int ), (int)144);
                }
                v27 /* !! */  = gf.kt;
                if (true) ** GOTO lbl161
                block76: while (true) {
                    v27 /* !! */  = (long)(v28 - gf.ejli("ejxq", ejmj(int ), (int)120));
lbl161:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1315447689: {
                            v28 = gf.ejli("ejxr", ejmj(int ), (int)121);
                            continue block76;
                        }
                        case -643351968: {
                            v28 = gf.ejli("ejxs", ejmj(int ), (int)122);
                            continue block76;
                        }
                        case 261503081: {
                            break block76;
                        }
                    }
                    break;
                }
                v29 /* !! */  = gf.kt;
                if (true) ** GOTO lbl174
                block77: while (true) {
                    v29 /* !! */  = (long)(gf.ejli("ejxu", ejmj(int ), (int)124) - gf.ejli("ejxt", ejmj(int ), (int)123));
lbl174:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case 261503081: {
                            break block77;
                        }
                        case 1014207134: {
                            continue block77;
                        }
                    }
                    break;
                }
                v30 /* !! */  = gf.kt;
                if (true) ** GOTO lbl183
                block78: while (true) {
                    v30 /* !! */  = (long)(v31 - gf.ejli("ejxv", ejmj(int ), (int)125));
lbl183:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -82477376: {
                            v31 = gf.ejli("ejxw", ejmj(int ), (int)126);
                            continue block78;
                        }
                        case 261503081: {
                            break block78;
                        }
                        case 1700199653: {
                            v31 = gf.ejli("ejxx", ejmj(int ), (int)127);
                            continue block78;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_14 = gf.kt - gf.ejli("ejxy", ejmj(int ), (int)128)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == gf.ejli("ejxz", ejlp(int ), (int)145)) break;
                    v32 /* !! */  = (long)gf.ejli("ejya", ejlp(int ), (int)146);
                }
                ot.INSTANCE.rotateTo(this.rot, os.DEFAULT, nn.HIGH_IMPORTANCE_1, this);
                if (var3_5) ** GOTO lbl21
lbl199:
                // 3 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)gf.ejli("ejyb", ejlp(int ), (int)147);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl254
                    break;
                }
            }
lbl208:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)gf.ejli("ejyc", ejlp(int ), (int)148);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 2: {
                var4_4 /* !! */  = (int)gf.ejli("ejyd", ejlp(int ), (int)149);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl218:
            // 2 sources

            case 3: {
                do {
                    var4_4 /* !! */  = (int)gf.ejli("ejye", ejlp(int ), (int)150);
                } while (!var5_3);
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)gf.ejli("ejyf", ejlp(int ), (int)151);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl228:
            // 5 sources

            case 5: {
                var4_4 /* !! */  = (int)gf.ejli("ejyg", ejlp(int ), (int)152);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 6: {
                var4_4 /* !! */  = (int)gf.ejli("ejyh", ejlp(int ), (int)153);
                if (!var5_3) break;
                throw null;
            }
lbl237:
            // 3 sources

            case 7: {
                var4_4 /* !! */  = (int)gf.ejli("ejyi", ejlp(int ), (int)154);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 8: {
                var4_4 /* !! */  = (int)gf.ejli("ejyj", ejlp(int ), (int)155);
                if (!var5_3) ** GOTO lbl228
                throw null;
            }
lbl246:
            // 3 sources

            case 9: {
                var4_4 /* !! */  = (int)gf.ejli("ejyk", ejlp(int ), (int)156);
                if (!var5_3) ** GOTO lbl237
                throw null;
            }
            case 10: {
                var4_4 /* !! */  = (int)gf.ejli("ejyl", ejlp(int ), (int)157);
                if (!var5_3) ** GOTO lbl218
                throw null;
            }
lbl254:
            // 2 sources

            case 11: {
                var4_4 /* !! */  = (int)gf.ejli("ejym", ejlp(int ), (int)158);
                if (!var5_3) ** GOTO lbl228
                throw null;
            }
lbl258:
            // 2 sources

            case 12: {
                do {
                    var4_4 /* !! */  = (int)gf.ejli("ejyn", ejlp(int ), (int)159);
                } while (!var5_3);
                throw null;
            }
lbl263:
            // 3 sources

            case 13: {
                var4_4 /* !! */  = (int)gf.ejli("ejyo", ejlp(int ), (int)160);
                if (!var5_3) ** GOTO lbl228
                throw null;
            }
            case 14: {
                var4_4 /* !! */  = (int)gf.ejli("ejyp", ejlp(int ), (int)161);
                if (!var5_3) ** GOTO lbl246
                throw null;
            }
            case 15: {
                var4_4 /* !! */  = (int)gf.ejli("ejyq", ejlp(int ), (int)162);
                if (!var5_3) ** GOTO lbl228
                throw null;
            }
            case 16: {
                var4_4 /* !! */  = (int)gf.ejli("ejyr", ejlp(int ), (int)163);
                if (!var5_3) ** GOTO lbl263
                throw null;
            }
lbl279:
            // 2 sources

            case 17: {
                var4_4 /* !! */  = (int)gf.ejli("ejys", ejlp(int ), (int)164);
                if (!var5_3) ** GOTO lbl208
                throw null;
            }
            case 18: 
        }
        var4_4 /* !! */  = (int)gf.ejli("ejyt", ejlp(int ), (int)165);
        ** while (!var5_3)
lbl286:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ekbu() {
        gf.ejlf[100] = 161610777;
        gf.ejlf[101] = -1190738978;
        gf.ejlf[102] = -1648357589;
        gf.ejlf[103] = 1987664053;
        gf.ejlf[104] = -119232203;
        gf.ejlf[105] = 1974032294;
        gf.ejlf[106] = -1317214302;
        gf.ejlf[107] = -1348471368;
        gf.ejlf[108] = -772634549;
        gf.ejlf[109] = 2008815323;
        gf.ejlf[110] = 860954013;
        gf.ejlf[111] = 1270481649;
        gf.ejlf[112] = -995214076;
        gf.ejlf[113] = 526153983;
        gf.ejlf[114] = -340368097;
        gf.ejlf[115] = -2033388162;
        gf.ejlf[116] = -77936718;
        gf.ejlf[117] = 1658522056;
        gf.ejlf[118] = 1314414661;
        gf.ejlf[119] = 562080468;
        gf.ejlf[120] = -163406197;
        gf.ejlf[121] = -1633576191;
        gf.ejlf[122] = -8821872;
        gf.ejlf[123] = -1088241385;
        gf.ejlf[124] = 1744305765;
        gf.ejlf[125] = -633219654;
        gf.ejlf[126] = 1757693516;
        gf.ejlf[127] = -113893740;
        gf.ejlf[128] = 1538598979;
        gf.ejlf[129] = 2129913921;
        gf.ejlf[130] = 374235948;
        gf.ejlf[131] = -631346188;
        gf.ejlf[132] = 394700873;
        gf.ejlf[133] = 1330374895;
        gf.ejlf[134] = -2031892121;
        gf.ejlf[135] = 739418141;
        gf.ejlf[136] = -1693902041;
        gf.ejlf[137] = -138089863;
        gf.ejlf[138] = 1723530534;
        gf.ejlf[139] = 1130497748;
        gf.ejlf[140] = 2053757685;
        gf.ejlf[141] = 366384848;
        gf.ejlf[142] = -1589271056;
        gf.ejlf[143] = -1676290764;
        gf.ejlf[144] = -1858329662;
        gf.ejlf[145] = -743477454;
        gf.ejlf[146] = 476728937;
        gf.ejlf[147] = 363155860;
        gf.ejlf[148] = -971745959;
        gf.ejlf[149] = -1895004528;
        gf.ejlf[150] = 569453688;
        gf.ejlf[151] = -1251091519;
        gf.ejlf[152] = -1384810709;
        gf.ejlf[153] = 456109136;
        gf.ejlf[154] = 279476766;
        gf.ejlf[155] = 1642882590;
        gf.ejlf[156] = 792070020;
        gf.ejlf[157] = 147442461;
        gf.ejlf[158] = 2130922763;
        gf.ejlf[159] = -390274767;
        gf.ejlf[160] = -458240490;
        gf.ejlf[161] = -980628353;
        gf.ejlf[162] = 1781461799;
        gf.ejlf[163] = 154608301;
        gf.ejlf[164] = 1217120878;
        gf.ejlf[165] = 1306608782;
        gf.ejlf[166] = 1798888422;
        gf.ejlf[167] = 1870410623;
        gf.ejlf[168] = -1481931071;
        gf.ejlf[169] = -1545418602;
        gf.ejlf[170] = -941174522;
        gf.ejlf[171] = 323259108;
        gf.ejlf[172] = 656627612;
        gf.ejlf[173] = -51198485;
        gf.ejlf[174] = 277517628;
        gf.ejlf[175] = 934462877;
        gf.ejlf[176] = 108591392;
        gf.ejlf[177] = -70536092;
        gf.ejlf[178] = 1707616796;
        gf.ejlf[179] = 1400400729;
        gf.ejlf[180] = -979138708;
        gf.ejlf[181] = -1495885219;
        gf.ejlf[182] = 70460435;
        gf.ejlf[183] = 594724003;
        gf.ejlf[184] = 1049830915;
        gf.ejlf[185] = 1657875500;
        gf.ejlf[186] = 332980750;
        gf.ejlf[187] = -1569060855;
        gf.ejlf[188] = -2108800965;
        gf.ejlf[189] = -7715494;
        gf.ejlf[190] = 1404347732;
        gf.ejlf[191] = -1123908811;
        gf.ejlf[192] = 568103477;
        gf.ejlf[193] = 75412302;
        gf.ejlf[194] = -1239479197;
        gf.ejlf[195] = -673508300;
        gf.ejlf[196] = 363469701;
        gf.ejlf[197] = 1447084897;
        gf.ejlf[198] = 1730416652;
        gf.ejlf[199] = 261630222;
    }

    private static /* synthetic */ void ekbz() {
        gf.ejml[0] = 5411920897246379345L;
        gf.ejml[1] = -2887960161863031585L;
        gf.ejml[2] = -9017729301130333436L;
        gf.ejml[3] = -3951603160287892762L;
        gf.ejml[4] = -219297962864741765L;
        gf.ejml[5] = -2022646952873402381L;
        gf.ejml[6] = -8129431489964373106L;
        gf.ejml[7] = -2732119747714697865L;
        gf.ejml[8] = -1299931575495439441L;
        gf.ejml[9] = -9213653141645567531L;
        gf.ejml[10] = 1970459114045144025L;
        gf.ejml[11] = -632992313706875226L;
        gf.ejml[12] = 8646377714863788811L;
        gf.ejml[13] = -7035482298984735017L;
        gf.ejml[14] = -4778990582875394412L;
        gf.ejml[15] = 974021398024373513L;
        gf.ejml[16] = 3339397324865028980L;
        gf.ejml[17] = 917095392906170957L;
        gf.ejml[18] = 3808816379858799707L;
        gf.ejml[19] = 3786229815187426325L;
        gf.ejml[20] = -845353731200013194L;
        gf.ejml[21] = -7388099360460413344L;
        gf.ejml[22] = 7459315920734293248L;
        gf.ejml[23] = 7882911120041491200L;
        gf.ejml[24] = 6307645233469956533L;
        gf.ejml[25] = 5449719517921839126L;
        gf.ejml[26] = 755243240698306928L;
        gf.ejml[27] = -3046602103414367897L;
        gf.ejml[28] = 3665352453748833030L;
        gf.ejml[29] = -3916927048210547868L;
        gf.ejml[30] = 6549916584447812714L;
        gf.ejml[31] = 7137338215127767142L;
        gf.ejml[32] = -1070248468996226394L;
        gf.ejml[33] = -17784047861555744L;
        gf.ejml[34] = 8291873787890026408L;
        gf.ejml[35] = -8796128794966009534L;
        gf.ejml[36] = 8991484773788673565L;
        gf.ejml[37] = 7596087535366543717L;
        gf.ejml[38] = -6270148076381686774L;
        gf.ejml[39] = 1611449066805762383L;
        gf.ejml[40] = 5580976999107931104L;
        gf.ejml[41] = 9146110049277168749L;
        gf.ejml[42] = 4742152903540930310L;
        gf.ejml[43] = -2731111821089462252L;
        gf.ejml[44] = -4810614389566417958L;
        gf.ejml[45] = 4099207232318197974L;
        gf.ejml[46] = 2648270769754072065L;
        gf.ejml[47] = -5010765697482262184L;
        gf.ejml[48] = -2733491489285507761L;
        gf.ejml[49] = 916298139904759898L;
        gf.ejml[50] = -3843641889170263633L;
        gf.ejml[51] = -3068427526895254098L;
        gf.ejml[52] = -3031549831328073706L;
        gf.ejml[53] = 7126000004219793107L;
        gf.ejml[54] = 7953750260951650997L;
        gf.ejml[55] = 1649737141405694986L;
        gf.ejml[56] = 3874155730862182463L;
        gf.ejml[57] = 2132950526083454645L;
        gf.ejml[58] = -140664606911432878L;
        gf.ejml[59] = -1107608296591523897L;
        gf.ejml[60] = -876531472938792343L;
        gf.ejml[61] = -4893569795389806554L;
        gf.ejml[62] = -6150777604729297358L;
        gf.ejml[63] = -7448105143643687657L;
        gf.ejml[64] = -5709488545674525305L;
        gf.ejml[65] = 8508304748065083019L;
        gf.ejml[66] = 6612714416863638786L;
        gf.ejml[67] = 9217595201074687269L;
        gf.ejml[68] = -5823825042644867078L;
        gf.ejml[69] = 4007325200027053074L;
        gf.ejml[70] = -771116489991783899L;
        gf.ejml[71] = -668484674722303101L;
        gf.ejml[72] = -2457631217062513198L;
        gf.ejml[73] = -1489858759911973078L;
        gf.ejml[74] = -240520553425837937L;
        gf.ejml[75] = -6720166229961546677L;
        gf.ejml[76] = -37984510230507947L;
        gf.ejml[77] = -7659981499869932330L;
        gf.ejml[78] = 4926854319989017220L;
        gf.ejml[79] = 7854468581872831967L;
        gf.ejml[80] = -509340532491311074L;
        gf.ejml[81] = -4870912255145785934L;
        gf.ejml[82] = -372910191340761366L;
        gf.ejml[83] = -4126947262016853468L;
        gf.ejml[84] = 8164266855504815705L;
        gf.ejml[85] = 6059672141147810189L;
        gf.ejml[86] = -1401332072038781371L;
        gf.ejml[87] = 2982413095985561681L;
        gf.ejml[88] = 4734981176452615713L;
        gf.ejml[89] = 5937285005330680506L;
        gf.ejml[90] = 6748232698681426846L;
        gf.ejml[91] = -3624207847695258084L;
        gf.ejml[92] = -6476247334971105657L;
        gf.ejml[93] = 4329930184996859583L;
        gf.ejml[94] = -3949273056409079501L;
        gf.ejml[95] = -5796725214131391151L;
        gf.ejml[96] = -8482628276037533049L;
        gf.ejml[97] = 2443940977526799415L;
        gf.ejml[98] = -4449670105372511793L;
        gf.ejml[99] = 1654188302586464672L;
    }

    private static /* synthetic */ void ekbx() {
        gf.ejlg[100] = 161610780;
        gf.ejlg[101] = -1190738979;
        gf.ejlg[102] = -1648357574;
        gf.ejlg[103] = 1987664049;
        gf.ejlg[104] = -119232201;
        gf.ejlg[105] = 1974032292;
        gf.ejlg[106] = -1317214299;
        gf.ejlg[107] = -1348471369;
        gf.ejlg[108] = -772634536;
        gf.ejlg[109] = 2008815312;
        gf.ejlg[110] = 860954003;
        gf.ejlg[111] = 1270481651;
        gf.ejlg[112] = -995214078;
        gf.ejlg[113] = 526153976;
        gf.ejlg[114] = -340368098;
        gf.ejlg[115] = -2033388173;
        gf.ejlg[116] = 77936717;
        gf.ejlg[117] = 1489999411;
        gf.ejlg[118] = -1314414662;
        gf.ejlg[119] = 354207735;
        gf.ejlg[120] = 163406196;
        gf.ejlg[121] = 619468379;
        gf.ejlg[122] = -8821871;
        gf.ejlg[123] = 1088241384;
        gf.ejlg[124] = 902740170;
        gf.ejlg[125] = -633219653;
        gf.ejlg[126] = -2107802822;
        gf.ejlg[127] = 113893739;
        gf.ejlg[128] = -1700242567;
        gf.ejlg[129] = -2129913922;
        gf.ejlg[130] = -1948754319;
        gf.ejlg[131] = 631346187;
        gf.ejlg[132] = -591181979;
        gf.ejlg[133] = -1330374896;
        gf.ejlg[134] = -1069204175;
        gf.ejlg[135] = 739418140;
        gf.ejlg[136] = 1028619287;
        gf.ejlg[137] = 138089862;
        gf.ejlg[138] = -902594622;
        gf.ejlg[139] = 1130497749;
        gf.ejlg[140] = -1595024293;
        gf.ejlg[141] = 366384849;
        gf.ejlg[142] = -1068342458;
        gf.ejlg[143] = -1676290763;
        gf.ejlg[144] = 2140749288;
        gf.ejlg[145] = 743477453;
        gf.ejlg[146] = 242761672;
        gf.ejlg[147] = 363155865;
        gf.ejlg[148] = -971745955;
        gf.ejlg[149] = -1895004518;
        gf.ejlg[150] = 569453689;
        gf.ejlg[151] = -1251091503;
        gf.ejlg[152] = -1384810693;
        gf.ejlg[153] = 456109142;
        gf.ejlg[154] = 279476755;
        gf.ejlg[155] = 1642882576;
        gf.ejlg[156] = 792070038;
        gf.ejlg[157] = 147442460;
        gf.ejlg[158] = 2130922756;
        gf.ejlg[159] = -390274767;
        gf.ejlg[160] = -458240483;
        gf.ejlg[161] = -980628361;
        gf.ejlg[162] = 1781461801;
        gf.ejlg[163] = 154608297;
        gf.ejlg[164] = 1217120873;
        gf.ejlg[165] = 1306608768;
        gf.ejlg[166] = -1798888423;
        gf.ejlg[167] = -1108276949;
        gf.ejlg[168] = 1481931070;
        gf.ejlg[169] = -269260068;
        gf.ejlg[170] = 941174521;
        gf.ejlg[171] = -844373440;
        gf.ejlg[172] = -656627613;
        gf.ejlg[173] = 684017498;
        gf.ejlg[174] = -277517629;
        gf.ejlg[175] = 947103477;
        gf.ejlg[176] = 108591393;
        gf.ejlg[177] = -98911750;
        gf.ejlg[178] = -1707616797;
        gf.ejlg[179] = 2121294485;
        gf.ejlg[180] = 979138707;
        gf.ejlg[181] = 441692675;
        gf.ejlg[182] = -70460436;
        gf.ejlg[183] = 775087009;
        gf.ejlg[184] = 1049830914;
        gf.ejlg[185] = -1691498103;
        gf.ejlg[186] = 332980747;
        gf.ejlg[187] = -1569060852;
        gf.ejlg[188] = -2108800966;
        gf.ejlg[189] = -7715493;
        gf.ejlg[190] = 1404347734;
        gf.ejlg[191] = -1123908810;
        gf.ejlg[192] = 568103473;
        gf.ejlg[193] = 75412302;
        gf.ejlg[194] = -1239479189;
        gf.ejlg[195] = -673508304;
        gf.ejlg[196] = 363469700;
        gf.ejlg[197] = 938364608;
        gf.ejlg[198] = -1730416653;
        gf.ejlg[199] = 1277488415;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gf.kt - gf.ejli("ejyu", ejmj(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gf.ejli("ejyv", ejlp(int ), (int)166)) break;
            v0 /* !! */  = (long)gf.ejli("ejyw", ejlp(int ), (int)167);
        }
        var3_1 = gf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gf.kt - gf.ejli("ejyx", ejmj(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gf.ejli("ejyy", ejlp(int ), (int)168)) break;
            v1 /* !! */  = (long)gf.ejli("ejyz", ejlp(int ), (int)169);
        }
        var2_2 /* !! */  = gf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gf.kt - gf.ejli("ejza", ejmj(int ), (int)131)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gf.ejli("ejzb", ejlp(int ), (int)170)) break;
            v2 /* !! */  = (long)gf.ejli("ejzc", ejlp(int ), (int)171);
        }
        var1_3 = gf.a;
        if (var3_1) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = gf.kt - gf.ejli("ejzd", ejmj(int ), (int)132)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gf.ejli("ejze", ejlp(int ), (int)172)) break;
            v3 /* !! */  = (long)gf.ejli("ejzf", ejlp(int ), (int)173);
        }
        super.activate();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl21
                v4 /* !! */  = gf.kt;
                if (true) ** GOTO lbl38
                block45: while (true) {
                    v4 /* !! */  = (long)(gf.ejli("ejzh", ejmj(int ), (int)134) - gf.ejli("ejzg", ejmj(int ), (int)133));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1871847079: {
                            continue block45;
                        }
                        case 261503081: {
                            break block45;
                        }
                    }
                    break;
                }
                v5 /* !! */  = gf.kt;
                if (true) ** GOTO lbl47
                block46: while (true) {
                    v5 /* !! */  = (long)(gf.ejli("ejzj", ejmj(int ), (int)136) - gf.ejli("ejzi", ejmj(int ), (int)135));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2092664832: {
                            continue block46;
                        }
                        case 261503081: {
                            break block46;
                        }
                    }
                    break;
                }
                if (gf.mc.field_1724 == null) ** GOTO lbl85
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = gf.kt - gf.ejli("ejzk", ejmj(int ), (int)137)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gf.ejli("ejzl", ejlp(int ), (int)174)) break;
                    v6 /* !! */  = (long)gf.ejli("ejzm", ejlp(int ), (int)175);
                }
                v7 /* !! */  = gf.kt;
                if (true) ** GOTO lbl62
                block48: while (true) {
                    v7 /* !! */  = (long)(v8 - gf.ejli("ejzn", ejmj(int ), (int)138));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1165853048: {
                            v8 = gf.ejli("ejzo", ejmj(int ), (int)139);
                            continue block48;
                        }
                        case -280606989: {
                            v8 = gf.ejli("ejzp", ejmj(int ), (int)140);
                            continue block48;
                        }
                        case 261503081: {
                            break block48;
                        }
                    }
                    break;
                }
                v9 = gf.mc.field_1724;
                v10 /* !! */  = gf.kt;
                if (true) ** GOTO lbl76
                block49: while (true) {
                    v10 /* !! */  = (long)(gf.ejli("ejzr", ejmj(int ), (int)142) - gf.ejli("ejzq", ejmj(int ), (int)141));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1629217384: {
                            continue block49;
                        }
                        case 261503081: {
                            break block49;
                        }
                    }
                    break;
                }
                v11 = v9.method_36454();
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
lbl85:
                // 1 sources

                v11 = 0.0f;
lbl86:
                // 2 sources

                v12 /* !! */  = gf.kt;
                if (true) ** GOTO lbl90
                block50: while (true) {
                    v12 /* !! */  = (long)(v13 - gf.ejli("ejzs", ejmj(int ), (int)143));
lbl90:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1598644541: {
                            v13 = gf.ejli("ejzt", ejmj(int ), (int)144);
                            continue block50;
                        }
                        case -1024815495: {
                            v13 = gf.ejli("ejzu", ejmj(int ), (int)145);
                            continue block50;
                        }
                        case 261503081: {
                            break block50;
                        }
                        case 1113170363: {
                            v13 = gf.ejli("ejzv", ejmj(int ), (int)146);
                            continue block50;
                        }
                    }
                    break;
                }
                this.lastYaw = v11;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = gf.kt - gf.ejli("ejzw", ejmj(int ), (int)147)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == gf.ejli("ejzx", ejlp(int ), (int)176)) break;
                    v14 /* !! */  = (long)gf.ejli("ejzy", ejlp(int ), (int)177);
                }
                v15 /* !! */  = gf.kt;
                if (true) ** GOTO lbl113
                block52: while (true) {
                    v15 /* !! */  = (long)(v16 - gf.ejli("ejzz", ejmj(int ), (int)148));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 261503081: {
                            break block52;
                        }
                        case 649383091: {
                            v16 = gf.ejli("ekaa", ejmj(int ), (int)149);
                            continue block52;
                        }
                        case 2139106418: {
                            v16 = gf.ejli("ekab", ejmj(int ), (int)150);
                            continue block52;
                        }
                    }
                    break;
                }
                if (gf.mc.field_1724 != null) {
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_6 = gf.kt - gf.ejli("ekac", ejmj(int ), (int)151)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gf.ejli("ekad", ejlp(int ), (int)178)) break;
                        v17 /* !! */  = (long)gf.ejli("ekae", ejlp(int ), (int)179);
                    }
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_7 = gf.kt - gf.ejli("ekaf", ejmj(int ), (int)152)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == gf.ejli("ekag", ejlp(int ), (int)180)) break;
                        v18 /* !! */  = (long)gf.ejli("ekah", ejlp(int ), (int)181);
                    }
                    v19 = gf.mc.field_1724;
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_8 = gf.kt - gf.ejli("ekai", ejmj(int ), (int)153)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == gf.ejli("ekaj", ejlp(int ), (int)182)) break;
                        v20 /* !! */  = (long)gf.ejli("ekak", ejlp(int ), (int)183);
                    }
                    v21 = v19.method_36455();
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    v21 = 0.0f;
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_9 = gf.kt - gf.ejli("ekal", ejmj(int ), (int)154)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == gf.ejli("ekam", ejlp(int ), (int)184)) break;
                    v22 /* !! */  = (long)gf.ejli("ekan", ejlp(int ), (int)185);
                }
                this.lastPitch = v21;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)gf.ejli("ekao", ejlp(int ), (int)186);
                } while (!var3_1);
                throw null;
            }
lbl157:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)gf.ejli("ekap", ejlp(int ), (int)187);
                if (!var3_1) break;
                throw null;
            }
lbl161:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gf.ejli("ekaq", ejlp(int ), (int)188);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 3: {
                var2_2 /* !! */  = (int)gf.ejli("ekar", ejlp(int ), (int)189);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 4: {
                var2_2 /* !! */  = (int)gf.ejli("ekas", ejlp(int ), (int)190);
                if (!var3_1) break;
                throw null;
            }
lbl175:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)gf.ejli("ekat", ejlp(int ), (int)191);
                if (!var3_1) ** GOTO lbl161
                throw null;
            }
lbl179:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gf.ejli("ekau", ejlp(int ), (int)192);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 7: {
                var2_2 /* !! */  = (int)gf.ejli("ekav", ejlp(int ), (int)193);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl188:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gf.ejli("ekaw", ejlp(int ), (int)194);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 9: 
        }
        do {
            var2_2 /* !! */  = (int)gf.ejli("ekax", ejlp(int ), (int)195);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ekcc() {
        gf.ejmm[100] = 1099167860426863580L;
        gf.ejmm[101] = 4032089155807655883L;
        gf.ejmm[102] = 3445715064923927733L;
        gf.ejmm[103] = 5863208084694174318L;
        gf.ejmm[104] = -6732899027769557035L;
        gf.ejmm[105] = 8166979921844234624L;
        gf.ejmm[106] = -1278209876136332749L;
        gf.ejmm[107] = 2474894110894767255L;
        gf.ejmm[108] = -1178810541039418338L;
        gf.ejmm[109] = 4839858054873974904L;
        gf.ejmm[110] = -6949722421692544983L;
        gf.ejmm[111] = -5509451303548738563L;
        gf.ejmm[112] = 3250325316706682005L;
        gf.ejmm[113] = 194249739827721069L;
        gf.ejmm[114] = -2827216845349037681L;
        gf.ejmm[115] = -2364259103712272104L;
        gf.ejmm[116] = 3061476179576633742L;
        gf.ejmm[117] = -1070997494782352502L;
        gf.ejmm[118] = 7107550541826429146L;
        gf.ejmm[119] = 1409909559186785054L;
        gf.ejmm[120] = -3346765007522064407L;
        gf.ejmm[121] = 5979187883990048602L;
        gf.ejmm[122] = -6472871100007584113L;
        gf.ejmm[123] = -2142752131092221354L;
        gf.ejmm[124] = -3976656412108600239L;
        gf.ejmm[125] = 8837033551074252073L;
        gf.ejmm[126] = 258005095854205115L;
        gf.ejmm[127] = 6266004034499466936L;
        gf.ejmm[128] = 5718670126871616589L;
        gf.ejmm[129] = 3196894154286190263L;
        gf.ejmm[130] = 1994658049008873946L;
        gf.ejmm[131] = -1448391867944780413L;
        gf.ejmm[132] = 5259199991496383500L;
        gf.ejmm[133] = 566605178753978344L;
        gf.ejmm[134] = -7441767737694558756L;
        gf.ejmm[135] = 6910752603497599514L;
        gf.ejmm[136] = -3098655188621065544L;
        gf.ejmm[137] = 8852946789713175530L;
        gf.ejmm[138] = 2758590196394461142L;
        gf.ejmm[139] = -1020812727552064570L;
        gf.ejmm[140] = -1039870100914252345L;
        gf.ejmm[141] = -8476046123668339753L;
        gf.ejmm[142] = -6176914108991988092L;
        gf.ejmm[143] = -8731095950979637782L;
        gf.ejmm[144] = 2181223019995927147L;
        gf.ejmm[145] = -1278345429814297438L;
        gf.ejmm[146] = -4894349982695858339L;
        gf.ejmm[147] = 5468602665777909663L;
        gf.ejmm[148] = -5717934129134806582L;
        gf.ejmm[149] = -8324985302013786610L;
        gf.ejmm[150] = -3233306942517767951L;
        gf.ejmm[151] = -1496705541215579574L;
        gf.ejmm[152] = 5186302520172649270L;
        gf.ejmm[153] = 3239726605769607526L;
        gf.ejmm[154] = 757076090702536427L;
        gf.ejmm[155] = 4628863535476077192L;
        gf.ejmm[156] = 4067194275963975314L;
        gf.ejmm[157] = -6730418604060434768L;
        gf.ejmm[158] = 5607432247297000311L;
        gf.ejmm[159] = -1573417718856679823L;
        gf.ejmm[160] = 3445849289665641917L;
        gf.ejmm[161] = 1857209307749448942L;
        gf.ejmm[162] = -3385645617080671817L;
        gf.ejmm[163] = -5955173422445764447L;
        gf.ejmm[164] = 4485516873525333903L;
        gf.ejmm[165] = 3128549144667518418L;
        gf.ejmm[166] = 7058737063837164349L;
        gf.ejmm[167] = 241560550062266961L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gf() {
        var2_1 /* !! */  = gf.b;
        super("Strafe", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0443 \u0441\u0442\u0440\u0435\u0439\u0444\u0438\u0442\u044c", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0442\u0438\u043f \u0441\u0442\u0440\u0435\u0439\u0444\u043e\u0432", "Matrix", new String[]{"Matrix", "Grim"});
        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0434\u043b\u044f \u0441\u0442\u0440\u0435\u0439\u0444\u0430", (float)gf.ejli("ejll", ejlc(int ), (int)0)).range(0.0f, 1.0f).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((gf)this));
        this.rot = new ov(0.0f, 0.0f);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.mode, this.speed});
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gf.ejli("ejlq", ejlp(int ), (int)1);
                ** GOTO lbl25
            }
            case 1: {
                var2_1 /* !! */  = (int)gf.ejli("ejlw", ejlp(int ), (int)2);
                break;
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)gf.ejli("ejly", ejlp(int ), (int)3);
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)gf.ejli("ejlz", ejlp(int ), (int)4);
            }
            case 4: {
                var2_1 /* !! */  = (int)gf.ejli("ejma", ejlp(int ), (int)5);
            }
lbl25:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gf.ejli("ejmb", ejlp(int ), (int)6);
                    ** GOTO lbl11
                    break;
                }
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)gf.ejli("ejmc", ejlp(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ void ekbw() {
        gf.ejlg[0] = -1684914681;
        gf.ejlg[1] = -1749251683;
        gf.ejlg[2] = 575130797;
        gf.ejlg[3] = -1012938388;
        gf.ejlg[4] = -1300847830;
        gf.ejlg[5] = -458864170;
        gf.ejlg[6] = -911454887;
        gf.ejlg[7] = -610662263;
        gf.ejlg[8] = -1891063930;
        gf.ejlg[9] = 761686685;
        gf.ejlg[10] = 1529234090;
        gf.ejlg[11] = 417965179;
        gf.ejlg[12] = -1335526465;
        gf.ejlg[13] = -1817158149;
        gf.ejlg[14] = 934799507;
        gf.ejlg[15] = 1948607390;
        gf.ejlg[16] = -717648593;
        gf.ejlg[17] = -1905728477;
        gf.ejlg[18] = 597566584;
        gf.ejlg[19] = 1984143654;
        gf.ejlg[20] = 1383486818;
        gf.ejlg[21] = 188819697;
        gf.ejlg[22] = 1216889877;
        gf.ejlg[23] = 953895560;
        gf.ejlg[24] = -682685798;
        gf.ejlg[25] = -162124510;
        gf.ejlg[26] = 683944848;
        gf.ejlg[27] = 1409535346;
        gf.ejlg[28] = -933376697;
        gf.ejlg[29] = 1358860681;
        gf.ejlg[30] = 2130717808;
        gf.ejlg[31] = -326111032;
        gf.ejlg[32] = -1807440290;
        gf.ejlg[33] = -1868530640;
        gf.ejlg[34] = -382364527;
        gf.ejlg[35] = 1446480416;
        gf.ejlg[36] = -2104060606;
        gf.ejlg[37] = 323392918;
        gf.ejlg[38] = -1151392704;
        gf.ejlg[39] = -1195195918;
        gf.ejlg[40] = 1206776683;
        gf.ejlg[41] = -1249699500;
        gf.ejlg[42] = -771771244;
        gf.ejlg[43] = -1223926081;
        gf.ejlg[44] = -1526087177;
        gf.ejlg[45] = 1956828168;
        gf.ejlg[46] = 1968697981;
        gf.ejlg[47] = 1863216906;
        gf.ejlg[48] = 1960015481;
        gf.ejlg[49] = -1539584583;
        gf.ejlg[50] = 74366786;
        gf.ejlg[51] = 1649734143;
        gf.ejlg[52] = 1611638556;
        gf.ejlg[53] = -1045892435;
        gf.ejlg[54] = 1713688849;
        gf.ejlg[55] = 1256784906;
        gf.ejlg[56] = -687577955;
        gf.ejlg[57] = 1622315464;
        gf.ejlg[58] = -1730678937;
        gf.ejlg[59] = 1346596197;
        gf.ejlg[60] = 1363732307;
        gf.ejlg[61] = -467886271;
        gf.ejlg[62] = -1395453516;
        gf.ejlg[63] = -608107023;
        gf.ejlg[64] = 880052334;
        gf.ejlg[65] = -1396052328;
        gf.ejlg[66] = -2125511618;
        gf.ejlg[67] = -1350264889;
        gf.ejlg[68] = -106727611;
        gf.ejlg[69] = 1439366071;
        gf.ejlg[70] = -1719690137;
        gf.ejlg[71] = 805575669;
        gf.ejlg[72] = 1576121925;
        gf.ejlg[73] = -160089691;
        gf.ejlg[74] = -205930905;
        gf.ejlg[75] = 2105405366;
        gf.ejlg[76] = -195328676;
        gf.ejlg[77] = -1424874060;
        gf.ejlg[78] = 1346643055;
        gf.ejlg[79] = 927965984;
        gf.ejlg[80] = 91598911;
        gf.ejlg[81] = 1268993190;
        gf.ejlg[82] = -1470683662;
        gf.ejlg[83] = -920091039;
        gf.ejlg[84] = 993434564;
        gf.ejlg[85] = 416671855;
        gf.ejlg[86] = -721695334;
        gf.ejlg[87] = -951635917;
        gf.ejlg[88] = -1149127282;
        gf.ejlg[89] = -367945944;
        gf.ejlg[90] = 149282363;
        gf.ejlg[91] = -113179222;
        gf.ejlg[92] = -681917303;
        gf.ejlg[93] = 1209859017;
        gf.ejlg[94] = 1464843289;
        gf.ejlg[95] = 105479319;
        gf.ejlg[96] = -27298571;
        gf.ejlg[97] = 852244526;
        gf.ejlg[98] = 374366147;
        gf.ejlg[99] = 0x833A33;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block120: {
            block119: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gf.kt - gf.ejli("ejnw", ejmj(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gf.ejli("ejnx", ejlp(int ), (int)16)) break;
                    v0 /* !! */  = (long)gf.ejli("ejny", ejlp(int ), (int)17);
                }
                var6_2 = gf.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = gf.kt - gf.ejli("ejoa", ejmj(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == gf.ejli("ejoc", ejlp(int ), (int)18)) break;
                    v1 /* !! */  = (long)gf.ejli("ejof", ejlp(int ), (int)19);
                }
                var5_3 /* !! */  = gf.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = gf.kt - gf.ejli("ejog", ejmj(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == gf.ejli("ejoh", ejlp(int ), (int)20)) break;
                    v2 /* !! */  = (long)gf.ejli("ejoj", ejlp(int ), (int)21);
                }
                var4_4 = gf.a;
                if (var6_2) {
                    throw null;
lbl21:
                    // 15 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = gf.kt - gf.ejli("ejok", ejmj(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == gf.ejli("ejom", ejlp(int ), (int)22)) break;
                    v3 /* !! */  = (long)gf.ejli("ejon", ejlp(int ), (int)23);
                }
                v4 /* !! */  = gf.kt;
                if (true) ** GOTO lbl33
                block76: while (true) {
                    v4 /* !! */  = (long)(v5 - gf.ejli("ejop", ejmj(int ), (int)11));
lbl33:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 152507838: {
                            v5 = gf.ejli("ejoq", ejmj(int ), (int)12);
                            continue block76;
                        }
                        case 261503081: {
                            break block76;
                        }
                        case 1817101549: {
                            v5 = gf.ejli("ejor", ejmj(int ), (int)13);
                            continue block76;
                        }
                    }
                    break;
                }
                if (gf.mc.field_1724 == null) break block119;
                if (var4_4) ** GOTO lbl21
                v6 /* !! */  = gf.kt;
                if (true) ** GOTO lbl48
                block77: while (true) {
                    v6 /* !! */  = (long)(v7 - gf.ejli("ejos", ejmj(int ), (int)14));
lbl48:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -764914632: {
                            v7 = gf.ejli("ejot", ejmj(int ), (int)15);
                            continue block77;
                        }
                        case -428559016: {
                            v7 = gf.ejli("ejou", ejmj(int ), (int)16);
                            continue block77;
                        }
                        case 261503081: {
                            break block77;
                        }
                        case 1751907128: {
                            v7 = gf.ejli("ejow", ejmj(int ), (int)17);
                            continue block77;
                        }
                    }
                    break;
                }
                v8 /* !! */  = gf.kt;
                if (true) ** GOTO lbl64
                block78: while (true) {
                    v8 /* !! */  = (long)(v9 - gf.ejli("ejoy", ejmj(int ), (int)18));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1338673925: {
                            v9 = gf.ejli("ejoz", ejmj(int ), (int)19);
                            continue block78;
                        }
                        case -851700646: {
                            v9 = gf.ejli("ejpa", ejmj(int ), (int)20);
                            continue block78;
                        }
                        case 261503081: {
                            break block78;
                        }
                    }
                    break;
                }
                if (gf.mc.field_1687 != null) break block120;
                if (var4_4) ** GOTO lbl21
            }
            if (var4_4 || var4_4) ** GOTO lbl21
            return;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = gf.kt - gf.ejli("ejpc", ejmj(int ), (int)21)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gf.ejli("ejpe", ejlp(int ), (int)24)) break;
                    v10 /* !! */  = (long)gf.ejli("ejpf", ejlp(int ), (int)25);
                }
                var2_5 = nq.hasPlayerMovement();
                if (var4_4 || var4_4) ** GOTO lbl21
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = gf.kt - gf.ejli("ejpg", ejmj(int ), (int)22)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gf.ejli("ejpi", ejlp(int ), (int)26)) break;
                    v11 /* !! */  = (long)gf.ejli("ejpj", ejlp(int ), (int)27);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = gf.kt - gf.ejli("ejpk", ejmj(int ), (int)23)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gf.ejli("ejpl", ejlp(int ), (int)28)) break;
                    v12 /* !! */  = (long)gf.ejli("ejpm", ejlp(int ), (int)29);
                }
                v13 = gf.mc.field_1724;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_7 = gf.kt - gf.ejli("ejpn", ejmj(int ), (int)24)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == gf.ejli("ejpo", ejlp(int ), (int)30)) break;
                    v14 /* !! */  = (long)gf.ejli("ejpp", ejlp(int ), (int)31);
                }
                var3_6 = v13.method_36454();
                if (var4_4 || var4_4) ** GOTO lbl21
                v15 /* !! */  = gf.kt;
                if (true) ** GOTO lbl112
                block83: while (true) {
                    v15 /* !! */  = (long)(v16 - gf.ejli("ejpq", ejmj(int ), (int)25));
lbl112:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1942179452: {
                            v16 = gf.ejli("ejpr", ejmj(int ), (int)26);
                            continue block83;
                        }
                        case 261503081: {
                            break block83;
                        }
                        case 1604505560: {
                            v16 = gf.ejli("ejps", ejmj(int ), (int)27);
                            continue block83;
                        }
                    }
                    break;
                }
                v17 /* !! */  = gf.kt;
                if (true) ** GOTO lbl125
                block84: while (true) {
                    v17 /* !! */  = (long)(v18 - gf.ejli("ejpt", ejmj(int ), (int)28));
lbl125:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1831065907: {
                            v18 = gf.ejli("ejpu", ejmj(int ), (int)29);
                            continue block84;
                        }
                        case -1700508871: {
                            v18 = gf.ejli("ejpv", ejmj(int ), (int)30);
                            continue block84;
                        }
                        case 261503081: {
                            break block84;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("Matrix")) ** GOTO lbl146
                if (var4_4 || var4_4) ** GOTO lbl21
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_8 = gf.kt - gf.ejli("ejpw", ejmj(int ), (int)31)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == gf.ejli("ejpx", ejlp(int ), (int)32)) break;
                    v19 /* !! */  = (long)gf.ejli("ejpy", ejlp(int ), (int)33);
                }
                this.handleMatrixMode(var2_5, var3_6);
                if (var4_4) ** GOTO lbl21
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
lbl146:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl21
                v20 /* !! */  = gf.kt;
                if (true) ** GOTO lbl151
                block86: while (true) {
                    v20 /* !! */  = (long)(v21 - gf.ejli("ejpz", ejmj(int ), (int)32));
lbl151:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -2124371207: {
                            v21 = gf.ejli("ejqa", ejmj(int ), (int)33);
                            continue block86;
                        }
                        case 261503081: {
                            break block86;
                        }
                        case 383742240: {
                            v21 = gf.ejli("ejqb", ejmj(int ), (int)34);
                            continue block86;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_9 = gf.kt - gf.ejli("ejqc", ejmj(int ), (int)35)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == gf.ejli("ejqd", ejlp(int ), (int)34)) break;
                    v22 /* !! */  = (long)gf.ejli("ejqe", ejlp(int ), (int)35);
                }
                if (!this.mode.isSelected("Grim")) ** GOTO lbl178
                if (var4_4 || var4_4) ** GOTO lbl21
                v23 /* !! */  = gf.kt;
                if (true) ** GOTO lbl171
                block88: while (true) {
                    v23 /* !! */  = (long)(gf.ejli("ejqg", ejmj(int ), (int)37) - gf.ejli("ejqf", ejmj(int ), (int)36));
lbl171:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1657854209: {
                            continue block88;
                        }
                        case 261503081: {
                            break block88;
                        }
                    }
                    break;
                }
                this.handleGrimMode(var2_5, var3_6);
                if (var4_4) ** GOTO lbl21
lbl178:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl21
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_10 = gf.kt - gf.ejli("ejqh", ejmj(int ), (int)38)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == gf.ejli("ejqi", ejlp(int ), (int)36)) break;
                    v24 /* !! */  = (long)gf.ejli("ejqj", ejlp(int ), (int)37);
                }
                this.lastYaw = var3_6;
                if (var4_4 || var4_4) ** GOTO lbl21
                v25 /* !! */  = gf.kt;
                if (true) ** GOTO lbl190
                block90: while (true) {
                    v25 /* !! */  = (long)(v26 - gf.ejli("ejqk", ejmj(int ), (int)39));
lbl190:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1343303810: {
                            v26 = gf.ejli("ejql", ejmj(int ), (int)40);
                            continue block90;
                        }
                        case 261503081: {
                            break block90;
                        }
                        case 1859705546: {
                            v26 = gf.ejli("ejqm", ejmj(int ), (int)41);
                            continue block90;
                        }
                    }
                    break;
                }
                this.lastPitch = 0.0f;
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl203:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)gf.ejli("ejqn", ejlp(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl208:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)gf.ejli("ejqo", ejlp(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl213:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)gf.ejli("ejqp", ejlp(int ), (int)40);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl218:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)gf.ejli("ejqq", ejlp(int ), (int)41);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl223:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)gf.ejli("ejqr", ejlp(int ), (int)42);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl228:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)gf.ejli("ejqs", ejlp(int ), (int)43);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl233:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)gf.ejli("ejqt", ejlp(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl238:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)gf.ejli("ejqu", ejlp(int ), (int)45);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 8: {
                var5_3 /* !! */  = (int)gf.ejli("ejqv", ejlp(int ), (int)46);
                if (!var6_2) ** GOTO lbl233
                throw null;
            }
lbl247:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)gf.ejli("ejqw", ejlp(int ), (int)47);
                if (!var6_2) ** GOTO lbl228
                throw null;
            }
lbl251:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)gf.ejli("ejqx", ejlp(int ), (int)48);
                if (!var6_2) ** GOTO lbl208
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)gf.ejli("ejqy", ejlp(int ), (int)49);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
            case 12: {
                var5_3 /* !! */  = (int)gf.ejli("ejqz", ejlp(int ), (int)50);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl265:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)gf.ejli("ejra", ejlp(int ), (int)51);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl270:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)gf.ejli("ejrb", ejlp(int ), (int)52);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl275:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)gf.ejli("ejrc", ejlp(int ), (int)53);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl280:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)gf.ejli("ejrd", ejlp(int ), (int)54);
                if (!var6_2) ** GOTO lbl223
                throw null;
            }
lbl284:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)gf.ejli("ejre", ejlp(int ), (int)55);
                if (!var6_2) ** GOTO lbl280
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)gf.ejli("ejrf", ejlp(int ), (int)56);
                if (!var6_2) ** GOTO lbl280
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)gf.ejli("ejrg", ejlp(int ), (int)57);
                if (!var6_2) ** GOTO lbl238
                throw null;
            }
lbl296:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)gf.ejli("ejrh", ejlp(int ), (int)58);
                if (!var6_2) ** GOTO lbl203
                throw null;
            }
            case 21: {
                var5_3 /* !! */  = (int)gf.ejli("ejri", ejlp(int ), (int)59);
                if (!var6_2) ** GOTO lbl223
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)gf.ejli("ejrj", ejlp(int ), (int)60);
                if (var6_2) {
                    throw null;
                }
            }
lbl308:
            // 5 sources

            case 23: {
                var5_3 /* !! */  = (int)gf.ejli("ejrk", ejlp(int ), (int)61);
                if (!var6_2) ** GOTO lbl208
                throw null;
            }
lbl312:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)gf.ejli("ejrl", ejlp(int ), (int)62);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)gf.ejli("ejrm", ejlp(int ), (int)63);
                if (!var6_2) ** GOTO lbl218
                throw null;
            }
lbl320:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)gf.ejli("ejrn", ejlp(int ), (int)64);
                if (!var6_2) ** GOTO lbl308
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)gf.ejli("ejro", ejlp(int ), (int)65);
                if (!var6_2) ** GOTO lbl251
                throw null;
            }
            case 28: 
        }
        do {
            var5_3 /* !! */  = (int)gf.ejli("ejrp", ejlp(int ), (int)66);
        } while (!var6_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleMatrixMode(boolean var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gf.kt - gf.ejli("ejrq", ejmj(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gf.ejli("ejrr", ejlp(int ), (int)67)) break;
            v0 /* !! */  = (long)gf.ejli("ejrs", ejlp(int ), (int)68);
        }
        var7_3 = gf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gf.kt - gf.ejli("ejrt", ejmj(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gf.ejli("ejru", ejlp(int ), (int)69)) break;
            v1 /* !! */  = (long)gf.ejli("ejrv", ejlp(int ), (int)70);
        }
        var6_4 /* !! */  = gf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gf.kt - gf.ejli("ejrw", ejmj(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gf.ejli("ejrx", ejlp(int ), (int)71)) break;
            v2 /* !! */  = (long)gf.ejli("ejry", ejlp(int ), (int)72);
        }
        var5_5 = gf.a;
        if (var7_3) {
            throw null;
lbl21:
            // 10 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl21
        if (!var1_1) ** GOTO lbl102
        if (var5_5 || var5_5) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = gf.kt - gf.ejli("ejrz", ejmj(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gf.ejli("ejsa", ejlp(int ), (int)73)) break;
            v3 /* !! */  = (long)gf.ejli("ejsb", ejlp(int ), (int)74);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = gf.kt - gf.ejli("ejsc", ejmj(int ), (int)46)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gf.ejli("ejsd", ejlp(int ), (int)75)) break;
            v4 /* !! */  = (long)gf.ejli("ejse", ejlp(int ), (int)76);
        }
        v5 = gf.mc.field_1724;
        v6 /* !! */  = gf.kt;
        if (true) ** GOTO lbl41
        block88: while (true) {
            v6 /* !! */  = (long)(v7 - gf.ejli("ejsf", ejmj(int ), (int)47));
lbl41:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1364954673: {
                    v7 = gf.ejli("ejsg", ejmj(int ), (int)48);
                    continue block88;
                }
                case -583042863: {
                    v7 = gf.ejli("ejsh", ejmj(int ), (int)49);
                    continue block88;
                }
                case 261503081: {
                    break block88;
                }
                case 1623121669: {
                    v7 = gf.ejli("ejsi", ejmj(int ), (int)50);
                    continue block88;
                }
            }
            break;
        }
        v8 = v5.method_36454();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = gf.kt - gf.ejli("ejsj", ejmj(int ), (int)51)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == gf.ejli("ejsk", ejlp(int ), (int)77)) break;
            v9 /* !! */  = (long)gf.ejli("ejsl", ejlp(int ), (int)78);
        }
        var2_2 = nq.moveYaw(v8);
        if (var5_5) ** GOTO lbl21
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl21
                v10 /* !! */  = gf.kt;
                if (true) ** GOTO lbl69
                block90: while (true) {
                    v10 /* !! */  = (long)(v11 - gf.ejli("ejsm", ejmj(int ), (int)52));
lbl69:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2039181758: {
                            v11 = gf.ejli("ejsn", ejmj(int ), (int)53);
                            continue block90;
                        }
                        case -483375778: {
                            v11 = gf.ejli("ejso", ejmj(int ), (int)54);
                            continue block90;
                        }
                        case 261503081: {
                            break block90;
                        }
                        case 1106863234: {
                            v11 = gf.ejli("ejsp", ejmj(int ), (int)55);
                            continue block90;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = gf.kt - gf.ejli("ejsq", ejmj(int ), (int)56)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gf.ejli("ejsr", ejlp(int ), (int)79)) break;
                    v12 /* !! */  = (long)gf.ejli("ejss", ejlp(int ), (int)80);
                }
                var3_6 = this.speed.getValue() * gf.ejli("ejst", ejlc(int ), (int)81);
                if (var5_5 || var5_5) ** GOTO lbl21
                v13 /* !! */  = gf.kt;
                if (true) ** GOTO lbl92
                block92: while (true) {
                    v13 /* !! */  = (long)(gf.ejli("ejsv", ejmj(int ), (int)58) - gf.ejli("ejsu", ejmj(int ), (int)57));
lbl92:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -656975670: {
                            continue block92;
                        }
                        case 261503081: {
                            break block92;
                        }
                    }
                    break;
                }
                nq.setVelocity(var3_6);
                if (var5_5 || var5_5) ** GOTO lbl21
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl102:
            // 1 sources

            if (var5_5 || var5_5) ** GOTO lbl21
            v14 /* !! */  = gf.kt;
            if (true) ** GOTO lbl107
            block93: while (true) {
                v14 /* !! */  = (long)(v15 - gf.ejli("ejsw", ejmj(int ), (int)59));
lbl107:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -81362505: {
                        v15 = gf.ejli("ejsx", ejmj(int ), (int)60);
                        continue block93;
                    }
                    case 261503081: {
                        break block93;
                    }
                    case 1532196805: {
                        v15 = gf.ejli("ejsy", ejmj(int ), (int)61);
                        continue block93;
                    }
                }
                break;
            }
            nq.setVelocity(0.0);
            if (var5_5) ** GOTO lbl21
lbl118:
            // 2 sources

            if (var5_5 || var5_5) ** GOTO lbl21
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_7 = gf.kt - gf.ejli("ejsz", ejmj(int ), (int)62)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == gf.ejli("ejta", ejlp(int ), (int)82)) break;
                v16 /* !! */  = (long)gf.ejli("ejtb", ejlp(int ), (int)83);
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_8 = gf.kt - gf.ejli("ejtc", ejmj(int ), (int)63)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == gf.ejli("ejtd", ejlp(int ), (int)84)) break;
                v17 /* !! */  = (long)gf.ejli("ejte", ejlp(int ), (int)85);
            }
            v18 = gf.mc.field_1724;
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_9 = gf.kt - gf.ejli("ejtf", ejmj(int ), (int)64)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == gf.ejli("ejtg", ejlp(int ), (int)86)) break;
                v19 /* !! */  = (long)gf.ejli("ejth", ejlp(int ), (int)87);
            }
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_10 = gf.kt - gf.ejli("ejti", ejmj(int ), (int)65)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == gf.ejli("ejtj", ejlp(int ), (int)88)) break;
                v20 /* !! */  = (long)gf.ejli("ejtk", ejlp(int ), (int)89);
            }
            v21 = gf.mc.field_1724;
            v22 /* !! */  = gf.kt;
            if (true) ** GOTO lbl145
            block98: while (true) {
                v22 /* !! */  = (long)(gf.ejli("ejtm", ejmj(int ), (int)67) - gf.ejli("ejtl", ejmj(int ), (int)66));
lbl145:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case 261503081: {
                        break block98;
                    }
                    case 1805886320: {
                        continue block98;
                    }
                }
                break;
            }
            v23 = v21.method_18798();
            v24 /* !! */  = gf.kt;
            if (true) ** GOTO lbl155
            block99: while (true) {
                v24 /* !! */  = (long)(v25 - gf.ejli("ejtn", ejmj(int ), (int)68));
lbl155:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1764108045: {
                        v25 = gf.ejli("ejto", ejmj(int ), (int)69);
                        continue block99;
                    }
                    case -666959564: {
                        v25 = gf.ejli("ejtp", ejmj(int ), (int)70);
                        continue block99;
                    }
                    case 261503081: {
                        break block99;
                    }
                    case 2050789556: {
                        v25 = gf.ejli("ejtq", ejmj(int ), (int)71);
                        continue block99;
                    }
                }
                break;
            }
            v26 = v23.field_1352;
            v27 /* !! */  = gf.kt;
            if (true) ** GOTO lbl172
            block100: while (true) {
                v27 /* !! */  = (long)(v28 - gf.ejli("ejtr", ejmj(int ), (int)72));
lbl172:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -1243605168: {
                        v28 = gf.ejli("ejts", ejmj(int ), (int)73);
                        continue block100;
                    }
                    case 261503081: {
                        break block100;
                    }
                    case 1155774412: {
                        v28 = gf.ejli("ejtt", ejmj(int ), (int)74);
                        continue block100;
                    }
                }
                break;
            }
            v29 /* !! */  = gf.kt;
            if (true) ** GOTO lbl185
            block101: while (true) {
                v29 /* !! */  = (long)(v30 - gf.ejli("ejtu", ejmj(int ), (int)75));
lbl185:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case -1866428121: {
                        v30 = gf.ejli("ejtv", ejmj(int ), (int)76);
                        continue block101;
                    }
                    case -222810937: {
                        v30 = gf.ejli("ejtw", ejmj(int ), (int)77);
                        continue block101;
                    }
                    case 261503081: {
                        break block101;
                    }
                }
                break;
            }
            v31 = gf.mc.field_1724;
            while (true) {
                if ((v32 /* !! */  = (cfr_temp_11 = gf.kt - gf.ejli("ejtx", ejmj(int ), (int)78)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v32 /* !! */  == gf.ejli("ejty", ejlp(int ), (int)90)) break;
                v32 /* !! */  = (long)gf.ejli("ejtz", ejlp(int ), (int)91);
            }
            v33 = v31.method_18798();
            v34 /* !! */  = gf.kt;
            if (true) ** GOTO lbl205
            block103: while (true) {
                v34 /* !! */  = (long)(v35 - gf.ejli("ejua", ejmj(int ), (int)79));
lbl205:
                // 2 sources

                switch ((int)v34 /* !! */ ) {
                    case -1862304806: {
                        v35 = gf.ejli("ejub", ejmj(int ), (int)80);
                        continue block103;
                    }
                    case -297067249: {
                        v35 = gf.ejli("ejuc", ejmj(int ), (int)81);
                        continue block103;
                    }
                    case 261503081: {
                        break block103;
                    }
                    case 404976327: {
                        v35 = gf.ejli("ejud", ejmj(int ), (int)82);
                        continue block103;
                    }
                }
                break;
            }
            v36 = v33.field_1351;
            while (true) {
                if ((v37 /* !! */  = (cfr_temp_12 = gf.kt - gf.ejli("ejue", ejmj(int ), (int)83)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v37 /* !! */  == gf.ejli("ejuf", ejlp(int ), (int)92)) break;
                v37 /* !! */  = (long)gf.ejli("ejug", ejlp(int ), (int)93);
            }
            v38 /* !! */  = gf.kt;
            if (true) ** GOTO lbl227
            block105: while (true) {
                v38 /* !! */  = (long)(gf.ejli("ejui", ejmj(int ), (int)85) - gf.ejli("ejuh", ejmj(int ), (int)84));
lbl227:
                // 2 sources

                switch ((int)v38 /* !! */ ) {
                    case 261503081: {
                        break block105;
                    }
                    case 348159876: {
                        continue block105;
                    }
                }
                break;
            }
            v39 = gf.mc.field_1724;
            v40 /* !! */  = gf.kt;
            if (true) ** GOTO lbl237
            block106: while (true) {
                v40 /* !! */  = (long)(v41 - gf.ejli("ejuj", ejmj(int ), (int)86));
lbl237:
                // 2 sources

                switch ((int)v40 /* !! */ ) {
                    case -1777297929: {
                        v41 = gf.ejli("ejuk", ejmj(int ), (int)87);
                        continue block106;
                    }
                    case -1286773260: {
                        v41 = gf.ejli("ejul", ejmj(int ), (int)88);
                        continue block106;
                    }
                    case 261503081: {
                        break block106;
                    }
                }
                break;
            }
            v42 = v39.method_18798();
            v43 /* !! */  = gf.kt;
            if (true) ** GOTO lbl251
            block107: while (true) {
                v43 /* !! */  = (long)(gf.ejli("ejun", ejmj(int ), (int)90) - gf.ejli("ejum", ejmj(int ), (int)89));
lbl251:
                // 2 sources

                switch ((int)v43 /* !! */ ) {
                    case -784310810: {
                        continue block107;
                    }
                    case 261503081: {
                        break block107;
                    }
                }
                break;
            }
            v44 = v42.field_1350;
            while (true) {
                if ((v45 /* !! */  = (cfr_temp_13 = gf.kt - gf.ejli("ejuo", ejmj(int ), (int)91)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v45 /* !! */  == gf.ejli("ejup", ejlp(int ), (int)94)) break;
                v45 /* !! */  = (long)gf.ejli("ejuq", ejlp(int ), (int)95);
            }
            v18.method_18800(v26, v36, v44);
            if (!var5_5 && !var5_5) ** break;
            ** continue;
            return;
            case 0: {
                var6_4 /* !! */  = (int)gf.ejli("ejur", ejlp(int ), (int)96);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl271:
            // 3 sources

            case 1: {
                var6_4 /* !! */  = (int)gf.ejli("ejus", ejlp(int ), (int)97);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 2: {
                var6_4 /* !! */  = (int)gf.ejli("ejut", ejlp(int ), (int)98);
                if (!var7_3) ** GOTO lbl271
                throw null;
            }
            case 3: {
                var6_4 /* !! */  = (int)gf.ejli("ejuu", ejlp(int ), (int)99);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 4: {
                var6_4 /* !! */  = (int)gf.ejli("ejuv", ejlp(int ), (int)100);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 5: {
                var6_4 /* !! */  = (int)gf.ejli("ejuw", ejlp(int ), (int)101);
                if (var7_3) {
                    throw null;
                }
            }
            case 6: {
                var6_4 /* !! */  = (int)gf.ejli("ejux", ejlp(int ), (int)102);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl299:
            // 2 sources

            case 7: {
                var6_4 /* !! */  = (int)gf.ejli("ejuy", ejlp(int ), (int)103);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 8: {
                do {
                    var6_4 /* !! */  = (int)gf.ejli("ejuz", ejlp(int ), (int)104);
                } while (!var7_3);
                throw null;
            }
lbl309:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)gf.ejli("ejva", ejlp(int ), (int)105);
                if (!var7_3) ** GOTO lbl299
                throw null;
            }
lbl313:
            // 2 sources

            case 10: {
                var6_4 /* !! */  = (int)gf.ejli("ejvb", ejlp(int ), (int)106);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl318:
            // 3 sources

            case 11: {
                var6_4 /* !! */  = (int)gf.ejli("ejvc", ejlp(int ), (int)107);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl323:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)gf.ejli("ejvd", ejlp(int ), (int)108);
                if (var7_3) {
                    throw null;
                }
            }
lbl327:
            // 4 sources

            case 13: {
                var6_4 /* !! */  = (int)gf.ejli("ejve", ejlp(int ), (int)109);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)gf.ejli("ejvf", ejlp(int ), (int)110);
                    if (!var7_3) break block6;
                    throw null;
                }
            }
            case 15: {
                var6_4 /* !! */  = (int)gf.ejli("ejvg", ejlp(int ), (int)111);
                if (!var7_3) ** GOTO lbl318
                throw null;
            }
lbl341:
            // 2 sources

            case 16: {
                var6_4 /* !! */  = (int)gf.ejli("ejvh", ejlp(int ), (int)112);
                if (!var7_3) ** GOTO lbl271
                throw null;
            }
lbl345:
            // 2 sources

            case 17: {
                var6_4 /* !! */  = (int)gf.ejli("ejvi", ejlp(int ), (int)113);
                if (var7_3) {
                    throw null;
                }
            }
lbl349:
            // 6 sources

            case 18: {
                var6_4 /* !! */  = (int)gf.ejli("ejvj", ejlp(int ), (int)114);
                if (!var7_3) ** GOTO lbl345
                throw null;
            }
            case 19: 
        }
        var6_4 /* !! */  = (int)gf.ejli("ejvk", ejlp(int ), (int)115);
        ** while (!var7_3)
lbl356:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ekbt() {
        gf.ejlf[0] = -1522191302;
        gf.ejlf[1] = -1749251688;
        gf.ejlf[2] = 575130792;
        gf.ejlf[3] = -1012938391;
        gf.ejlf[4] = -1300847829;
        gf.ejlf[5] = -458864176;
        gf.ejlf[6] = -911454886;
        gf.ejlf[7] = -610662262;
        gf.ejlf[8] = 1891063929;
        gf.ejlf[9] = 858665529;
        gf.ejlf[10] = 1529234091;
        gf.ejlf[11] = -1846509492;
        gf.ejlf[12] = -1335526466;
        gf.ejlf[13] = -1817158150;
        gf.ejlf[14] = 934799506;
        gf.ejlf[15] = 1948607388;
        gf.ejlf[16] = -717648594;
        gf.ejlf[17] = -255688514;
        gf.ejlf[18] = -597566585;
        gf.ejlf[19] = -1956324307;
        gf.ejlf[20] = -1383486819;
        gf.ejlf[21] = -1533646926;
        gf.ejlf[22] = -1216889878;
        gf.ejlf[23] = 1971634940;
        gf.ejlf[24] = 682685797;
        gf.ejlf[25] = 285650127;
        gf.ejlf[26] = -683944849;
        gf.ejlf[27] = -1919414864;
        gf.ejlf[28] = 933376696;
        gf.ejlf[29] = 635592178;
        gf.ejlf[30] = -2130717809;
        gf.ejlf[31] = 1477345330;
        gf.ejlf[32] = -1807440289;
        gf.ejlf[33] = -694822007;
        gf.ejlf[34] = 382364526;
        gf.ejlf[35] = 186046568;
        gf.ejlf[36] = 2104060605;
        gf.ejlf[37] = 1642519992;
        gf.ejlf[38] = -1151392678;
        gf.ejlf[39] = -1195195931;
        gf.ejlf[40] = 1206776691;
        gf.ejlf[41] = -1249699517;
        gf.ejlf[42] = -771771250;
        gf.ejlf[43] = -1223926091;
        gf.ejlf[44] = -1526087186;
        gf.ejlf[45] = 1956828189;
        gf.ejlf[46] = 1968697979;
        gf.ejlf[47] = 1863216901;
        gf.ejlf[48] = 1960015487;
        gf.ejlf[49] = -1539584581;
        gf.ejlf[50] = 74366795;
        gf.ejlf[51] = 1649734129;
        gf.ejlf[52] = 1611638539;
        gf.ejlf[53] = -1045892445;
        gf.ejlf[54] = 1713688861;
        gf.ejlf[55] = 1256784925;
        gf.ejlf[56] = -687577978;
        gf.ejlf[57] = 1622315458;
        gf.ejlf[58] = -1730678930;
        gf.ejlf[59] = 1346596196;
        gf.ejlf[60] = 1363732295;
        gf.ejlf[61] = -467886256;
        gf.ejlf[62] = -1395453511;
        gf.ejlf[63] = -608107034;
        gf.ejlf[64] = 880052342;
        gf.ejlf[65] = -1396052333;
        gf.ejlf[66] = -2125511624;
        gf.ejlf[67] = -1350264890;
        gf.ejlf[68] = -95860653;
        gf.ejlf[69] = 1439366070;
        gf.ejlf[70] = 1820738729;
        gf.ejlf[71] = 805575668;
        gf.ejlf[72] = -1520111352;
        gf.ejlf[73] = 160089690;
        gf.ejlf[74] = 369814343;
        gf.ejlf[75] = -2105405367;
        gf.ejlf[76] = -191665134;
        gf.ejlf[77] = -1424874059;
        gf.ejlf[78] = -1500892315;
        gf.ejlf[79] = -927965985;
        gf.ejlf[80] = 1670043504;
        gf.ejlf[81] = 1952664742;
        gf.ejlf[82] = -1470683661;
        gf.ejlf[83] = -184503847;
        gf.ejlf[84] = 993434565;
        gf.ejlf[85] = -753364474;
        gf.ejlf[86] = -721695333;
        gf.ejlf[87] = 1597791306;
        gf.ejlf[88] = 1149127281;
        gf.ejlf[89] = 1302850543;
        gf.ejlf[90] = -149282364;
        gf.ejlf[91] = 255869005;
        gf.ejlf[92] = 681917302;
        gf.ejlf[93] = -2146226986;
        gf.ejlf[94] = -1464843290;
        gf.ejlf[95] = -13887329;
        gf.ejlf[96] = -27298585;
        gf.ejlf[97] = 852244513;
        gf.ejlf[98] = 374366158;
        gf.ejlf[99] = 8600123;
    }

    private static /* synthetic */ void ekca() {
        gf.ejml[100] = 5090643623692023273L;
        gf.ejml[101] = 7171242445407217172L;
        gf.ejml[102] = -938271517596231941L;
        gf.ejml[103] = -8769584873533788805L;
        gf.ejml[104] = -7754052834262226997L;
        gf.ejml[105] = -3131838784946404743L;
        gf.ejml[106] = 7898519979014198201L;
        gf.ejml[107] = -5068158218221812942L;
        gf.ejml[108] = 8241438653592102270L;
        gf.ejml[109] = -7979928875252558038L;
        gf.ejml[110] = -1943618278251834584L;
        gf.ejml[111] = -6276545420739668746L;
        gf.ejml[112] = -4413241226588982886L;
        gf.ejml[113] = -5142643674214691923L;
        gf.ejml[114] = 887954697965613950L;
        gf.ejml[115] = -6639609582216781297L;
        gf.ejml[116] = 8384505751644600872L;
        gf.ejml[117] = -226653677623597306L;
        gf.ejml[118] = -216069554504705068L;
        gf.ejml[119] = -5393853799871844622L;
        gf.ejml[120] = 7997801303724341869L;
        gf.ejml[121] = -5905606709964425158L;
        gf.ejml[122] = -4651831917137886609L;
        gf.ejml[123] = -4500537459442265554L;
        gf.ejml[124] = 4755870154833867915L;
        gf.ejml[125] = -9171668974550177750L;
        gf.ejml[126] = -1716152750066939086L;
        gf.ejml[127] = -4655312276913762770L;
        gf.ejml[128] = -5917989103384352655L;
        gf.ejml[129] = 3069124747873345401L;
        gf.ejml[130] = 2729926407107868103L;
        gf.ejml[131] = -1060042254713665780L;
        gf.ejml[132] = 436055625344873292L;
        gf.ejml[133] = 573089877360554984L;
        gf.ejml[134] = 8238615868002966476L;
        gf.ejml[135] = 700797858926689023L;
        gf.ejml[136] = 968560155561643290L;
        gf.ejml[137] = -7175306074069448522L;
        gf.ejml[138] = -6839292418387183048L;
        gf.ejml[139] = -6016055016874996945L;
        gf.ejml[140] = -985775345981302681L;
        gf.ejml[141] = -1509587690131537709L;
        gf.ejml[142] = 6895203426284414224L;
        gf.ejml[143] = 9069481004801697711L;
        gf.ejml[144] = 11370750912746791L;
        gf.ejml[145] = 7868045563601843130L;
        gf.ejml[146] = 889825268437732313L;
        gf.ejml[147] = -1824617088902563233L;
        gf.ejml[148] = -4949497106829439465L;
        gf.ejml[149] = -9101009994788681508L;
        gf.ejml[150] = -6756412998891083339L;
        gf.ejml[151] = 1899944908217643793L;
        gf.ejml[152] = -7079875515584823517L;
        gf.ejml[153] = 90650437150408743L;
        gf.ejml[154] = -5189970504382869470L;
        gf.ejml[155] = 4496713878283449L;
        gf.ejml[156] = -5669611364098413348L;
        gf.ejml[157] = 2677135515359415567L;
        gf.ejml[158] = -2039872516710295155L;
        gf.ejml[159] = -6316314701013284114L;
        gf.ejml[160] = -9032819772432917360L;
        gf.ejml[161] = 2660062037528193800L;
        gf.ejml[162] = 1223918484345821263L;
        gf.ejml[163] = -4991066986169108142L;
        gf.ejml[164] = 4295259595816158940L;
        gf.ejml[165] = -2476046277772495423L;
        gf.ejml[166] = -2864974476766460226L;
        gf.ejml[167] = -5636101736730094465L;
    }

    private static /* synthetic */ int ejlp(int n2) {
        return ejlf[n2] ^ ejlg[n2];
    }

    public static /* synthetic */ CallSite ejli(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

