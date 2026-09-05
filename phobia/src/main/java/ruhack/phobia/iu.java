/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2761
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_2761;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;

public class iu
extends ds {
    private static final long r = 3470003046315465149L;
    public static final int b;
    private final kg customTime;
    private static int[] dag;
    public static final boolean c;
    public static final boolean a;
    private static long[] czx;
    private static int[] dah;
    private final kg saturation;
    private static long[] czy;
    private final kf mode;

    private static /* synthetic */ void dlh() {
        iu.dah[0] = 683657887;
        iu.dah[1] = -1530865898;
        iu.dah[2] = 1508439965;
        iu.dah[3] = -833534577;
        iu.dah[4] = -1282875256;
        iu.dah[5] = 151526521;
        iu.dah[6] = 175120795;
        iu.dah[7] = -1275200358;
        iu.dah[8] = -1572080488;
        iu.dah[9] = -1685303537;
        iu.dah[10] = -1631266660;
        iu.dah[11] = 776259183;
        iu.dah[12] = 135249453;
        iu.dah[13] = -530878304;
        iu.dah[14] = 922335053;
        iu.dah[15] = 1430681426;
        iu.dah[16] = 1608508455;
        iu.dah[17] = -115032754;
        iu.dah[18] = 634019367;
        iu.dah[19] = -1665824059;
        iu.dah[20] = 1269918837;
        iu.dah[21] = 499477266;
        iu.dah[22] = -8204455;
        iu.dah[23] = 1054663382;
        iu.dah[24] = -1940033939;
        iu.dah[25] = -489432326;
        iu.dah[26] = -751069221;
        iu.dah[27] = 919043856;
        iu.dah[28] = 1119534462;
        iu.dah[29] = -394384579;
        iu.dah[30] = -139439970;
        iu.dah[31] = -1186863899;
        iu.dah[32] = 388241470;
        iu.dah[33] = 1882953871;
        iu.dah[34] = -344787548;
        iu.dah[35] = 371585554;
        iu.dah[36] = -1783712134;
        iu.dah[37] = 2022071201;
        iu.dah[38] = 1927956619;
        iu.dah[39] = -588317473;
        iu.dah[40] = -2007883862;
        iu.dah[41] = 2127103474;
        iu.dah[42] = 447125864;
        iu.dah[43] = -525338090;
        iu.dah[44] = 247785089;
        iu.dah[45] = 1302134135;
        iu.dah[46] = -1611400740;
        iu.dah[47] = 975687888;
        iu.dah[48] = -274185672;
        iu.dah[49] = 1732348672;
        iu.dah[50] = -924712381;
        iu.dah[51] = -1060481603;
        iu.dah[52] = -983297665;
        iu.dah[53] = -1100461329;
        iu.dah[54] = -320414721;
        iu.dah[55] = -696997560;
        iu.dah[56] = 1098231513;
        iu.dah[57] = 1815834897;
        iu.dah[58] = -1681420584;
        iu.dah[59] = 1698882182;
        iu.dah[60] = -1066852507;
        iu.dah[61] = 2093537887;
        iu.dah[62] = -1282560093;
        iu.dah[63] = -30129674;
        iu.dah[64] = 1811510973;
        iu.dah[65] = -570572327;
        iu.dah[66] = -1763741546;
        iu.dah[67] = 1878192272;
        iu.dah[68] = -902297350;
        iu.dah[69] = 1683249451;
        iu.dah[70] = -1006040592;
        iu.dah[71] = -41711120;
        iu.dah[72] = 975296911;
        iu.dah[73] = -59370012;
        iu.dah[74] = -2071535419;
        iu.dah[75] = 936138752;
        iu.dah[76] = 338600935;
        iu.dah[77] = -1036418182;
        iu.dah[78] = 427826070;
        iu.dah[79] = 670150053;
        iu.dah[80] = 400093265;
        iu.dah[81] = 2028811539;
        iu.dah[82] = -1551460374;
        iu.dah[83] = 1945737652;
        iu.dah[84] = 1664791670;
        iu.dah[85] = 1687093899;
        iu.dah[86] = 935392257;
        iu.dah[87] = 441976587;
        iu.dah[88] = -1238641361;
        iu.dah[89] = -281822349;
        iu.dah[90] = -1910550061;
        iu.dah[91] = -56553826;
        iu.dah[92] = 1162186855;
        iu.dah[93] = -1958219035;
        iu.dah[94] = 1253955309;
        iu.dah[95] = -142182068;
        iu.dah[96] = -1845795307;
        iu.dah[97] = 1297184092;
        iu.dah[98] = -1534730890;
        iu.dah[99] = -997946732;
    }

    public static /* synthetic */ CallSite czz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        dag = new int[103];
        dah = new int[103];
        iu.dlf();
        iu.dlg();
        iu.dlh();
        iu.dli();
        czx = new long[102];
        czy = new long[102];
        iu.dlj();
        iu.dlk();
        iu.dll();
        iu.dlm();
    }

    private static /* synthetic */ void dlg() {
        iu.dag[100] = -340653359;
        iu.dag[101] = 1004941910;
        iu.dag[102] = -844664515;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getSaturationFactor() {
        v0 /* !! */  = iu.r;
        block19: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1054336579: {
                    break block19;
                }
                case -18092612: {
                    v0 /* !! */  = (long)(iu.czz("dbj", czw(int ), (int)8) - iu.czz("dbi", czw(int ), (int)7));
                    continue block19;
                }
            }
            break;
        }
        var3_1 = iu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iu.r - iu.czz("dbk", czw(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == iu.czz("dbl", daf(int ), (int)22)) break;
            v1 /* !! */  = (long)iu.czz("dbm", daf(int ), (int)23);
        }
        var2_2 /* !! */  = iu.b;
        v2 /* !! */  = iu.r;
        block21: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1054336579: {
                    break block21;
                }
                case 1118462068: {
                    v2 /* !! */  = (long)(iu.czz("dbo", czw(int ), (int)11) - iu.czz("dbn", czw(int ), (int)10));
                    continue block21;
                }
            }
            break;
        }
        var1_3 = iu.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (float)iu.czz("dbs", dau(int ), (int)24);
                    if (var1_3 != false) return (float)iu.czz("dbs", dau(int ), (int)24);
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_2 = iu.r - iu.czz("dbv", czw(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  != iu.czz("dbx", daf(int ), (int)25)) ** GOTO lbl39
                        v4 /* !! */  = iu.r;
                        if (true) ** GOTO lbl53
lbl39:
                        // 1 sources

                        v3 /* !! */  = (long)iu.czz("dbz", daf(int ), (int)26);
                    }
                }
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)iu.czz("dcg", daf(int ), (int)27);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)iu.czz("dcl", daf(int ), (int)30);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - iu.czz("dca", czw(int ), (int)13));
lbl53:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1746813899: {
                            v5 = iu.czz("dcc", czw(int ), (int)14);
                            continue block25;
                        }
                        case -1054336579: {
                            return 1.0f + this.saturation.getValue();
                        }
                        case 456075792: {
                            v5 = iu.czz("dce", czw(int ), (int)15);
                            continue block25;
                        }
                    }
                    break;
                }
                return 1.0f + this.saturation.getValue();
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)iu.czz("dch", daf(int ), (int)28);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl71
            break;
        }
        do {
            if (true) ** continue;
lbl71:
            // 2 sources

            var2_2 /* !! */  = (int)iu.czz("dcj", daf(int ), (int)29);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dll() {
        iu.czy[0] = -8633002381177968486L;
        iu.czy[1] = 7358829159258745846L;
        iu.czy[2] = -7407402365813994570L;
        iu.czy[3] = -3423385065476540069L;
        iu.czy[4] = 5731932909321732511L;
        iu.czy[5] = 5989427606300237688L;
        iu.czy[6] = -8629312846589712416L;
        iu.czy[7] = -7432883097928308612L;
        iu.czy[8] = -5118600545979169022L;
        iu.czy[9] = 7238737090062306623L;
        iu.czy[10] = -818663435065991660L;
        iu.czy[11] = 1789558362501797544L;
        iu.czy[12] = -3427299120656583577L;
        iu.czy[13] = 1316207490321447605L;
        iu.czy[14] = 8834442875153145973L;
        iu.czy[15] = 6012911885905539392L;
        iu.czy[16] = -6249307955010152265L;
        iu.czy[17] = -2904800916487663078L;
        iu.czy[18] = -7466071341048229609L;
        iu.czy[19] = 3203463402156654978L;
        iu.czy[20] = 1044088582232756922L;
        iu.czy[21] = 2317276722794986009L;
        iu.czy[22] = -5232658159008563682L;
        iu.czy[23] = -4159554267029277974L;
        iu.czy[24] = -4657738662706443791L;
        iu.czy[25] = 7668280186353167142L;
        iu.czy[26] = 3977331629249977177L;
        iu.czy[27] = 3640391411847555180L;
        iu.czy[28] = 7754475841287082999L;
        iu.czy[29] = 3806446089021479579L;
        iu.czy[30] = 2713848991259087766L;
        iu.czy[31] = 4135906137319220058L;
        iu.czy[32] = 3484201828698172726L;
        iu.czy[33] = 3165565516824109900L;
        iu.czy[34] = -2295497776466418641L;
        iu.czy[35] = 2502831154724636065L;
        iu.czy[36] = 6102380295582358058L;
        iu.czy[37] = 315216609387718767L;
        iu.czy[38] = 351972111834025152L;
        iu.czy[39] = -4428145501638946834L;
        iu.czy[40] = -1355671990440273674L;
        iu.czy[41] = 1715309043579910634L;
        iu.czy[42] = 3912688394625398672L;
        iu.czy[43] = -3968142584726533486L;
        iu.czy[44] = 1541627887116200490L;
        iu.czy[45] = -8441184841613360205L;
        iu.czy[46] = 6919360009026283405L;
        iu.czy[47] = -6840663281306436823L;
        iu.czy[48] = 7398625448888351043L;
        iu.czy[49] = 787964942107198609L;
        iu.czy[50] = -8334145517182230931L;
        iu.czy[51] = 9002820544914474963L;
        iu.czy[52] = -581174966964928196L;
        iu.czy[53] = -2250765091533928987L;
        iu.czy[54] = 3856227263042267178L;
        iu.czy[55] = -4614419203481965560L;
        iu.czy[56] = 7438056862844141313L;
        iu.czy[57] = 4796213553238659446L;
        iu.czy[58] = 8897434522924639865L;
        iu.czy[59] = 5491344852991042841L;
        iu.czy[60] = -1539981814443979865L;
        iu.czy[61] = -1636426593582722055L;
        iu.czy[62] = 1424196486207454756L;
        iu.czy[63] = 4695935746638923384L;
        iu.czy[64] = 8194863578900008146L;
        iu.czy[65] = 3381338763083216511L;
        iu.czy[66] = -793611981699929805L;
        iu.czy[67] = -4789819186533108487L;
        iu.czy[68] = 9086604339475786745L;
        iu.czy[69] = 2445442136726983300L;
        iu.czy[70] = 5693646520416630545L;
        iu.czy[71] = -3219164679028487920L;
        iu.czy[72] = 168120454262324177L;
        iu.czy[73] = 6947747731599698892L;
        iu.czy[74] = 8225882407627528736L;
        iu.czy[75] = 7665283522041544950L;
        iu.czy[76] = 3161826132866618361L;
        iu.czy[77] = -8644291882260475472L;
        iu.czy[78] = -3845527442309335988L;
        iu.czy[79] = 8340052764137504628L;
        iu.czy[80] = 4582489114580738311L;
        iu.czy[81] = 1877607951270219899L;
        iu.czy[82] = 4885634870575438265L;
        iu.czy[83] = -7968815805660176327L;
        iu.czy[84] = 7953980506705111159L;
        iu.czy[85] = -3142537409268188946L;
        iu.czy[86] = -1566276852414842568L;
        iu.czy[87] = -6700603220693963497L;
        iu.czy[88] = -1128239448800079264L;
        iu.czy[89] = 3364578651254314022L;
        iu.czy[90] = 7488136374912385690L;
        iu.czy[91] = -6563291854878843276L;
        iu.czy[92] = 888831024150767589L;
        iu.czy[93] = -7410324982159198953L;
        iu.czy[94] = 1761377680388668077L;
        iu.czy[95] = 3453040156093239153L;
        iu.czy[96] = -5029925521477555555L;
        iu.czy[97] = -2967850815614613059L;
        iu.czy[98] = -5707125133715741396L;
        iu.czy[99] = 5744473023367543646L;
    }

    private static /* synthetic */ long czw(int n2) {
        return czx[n2] ^ czy[n2];
    }

    private static /* synthetic */ float dau(int n2) {
        return Float.intBitsToFloat(dag[n2] ^ dah[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onPacket(cr var1_1) {
        block67: {
            while (true) {
                block66: {
                    if ((v0 /* !! */  = (cfr_temp_1 = iu.r - iu.czz("diz", czw(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != iu.czz("dja", daf(int ), (int)77)) break block66;
                    var4_2 = iu.c;
                    v1 /* !! */  = iu.r;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)iu.czz("djb", daf(int ), (int)78);
            }
            block43: while (true) {
                v1 /* !! */  = (long)(v2 - iu.czz("djc", czw(int ), (int)71));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1054336579: {
                        break block43;
                    }
                    case -495112894: {
                        v2 = iu.czz("djd", czw(int ), (int)72);
                        continue block43;
                    }
                    case 1473920843: {
                        v2 = iu.czz("dje", czw(int ), (int)73);
                        continue block43;
                    }
                    case 1691910133: {
                        v2 = iu.czz("djf", czw(int ), (int)74);
                        continue block43;
                    }
                }
                break;
            }
            var3_3 /* !! */  = iu.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = iu.r - iu.czz("djg", czw(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == iu.czz("djh", daf(int ), (int)79)) {
                    var2_4 = iu.a;
                    if (var4_2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)iu.czz("dji", daf(int ), (int)80);
            }
            if (var2_4 || var2_4) return;
            v4 /* !! */  = iu.r;
            if (true) ** GOTO lbl41
            block45: while (true) {
                v4 /* !! */  = (long)(v5 - iu.czz("djj", czw(int ), (int)76));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2052747537: {
                        v5 = iu.czz("djk", czw(int ), (int)77);
                        continue block45;
                    }
                    case -1054336579: {
                        break block45;
                    }
                    case 40434897: {
                        v5 = iu.czz("djl", czw(int ), (int)78);
                        continue block45;
                    }
                    case 906266717: {
                        v5 = iu.czz("djm", czw(int ), (int)79);
                        continue block45;
                    }
                }
                break;
            }
            v6 = var1_1.getType();
            v7 /* !! */  = iu.r;
            if (true) ** GOTO lbl58
            block46: while (true) {
                v7 /* !! */  = (long)(v8 - iu.czz("djn", czw(int ), (int)80));
lbl58:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1156913702: {
                        v8 = iu.czz("djo", czw(int ), (int)81);
                        continue block46;
                    }
                    case -1054336579: {
                        break block46;
                    }
                    case 953270459: {
                        v8 = iu.czz("djp", czw(int ), (int)82);
                        continue block46;
                    }
                    case 1089544551: {
                        v8 = iu.czz("djq", czw(int ), (int)83);
                        continue block46;
                    }
                }
                break;
            }
            if (v6 != cr$Type.RECEIVE) break block67;
            if (var2_4) return;
            v9 /* !! */  = iu.r;
            if (true) ** GOTO lbl76
            block47: while (true) {
                v9 /* !! */  = (long)(v10 - iu.czz("djr", czw(int ), (int)84));
lbl76:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1811218338: {
                        v10 = iu.czz("djs", czw(int ), (int)85);
                        continue block47;
                    }
                    case -1054336579: {
                        break block47;
                    }
                    case -426169695: {
                        v10 = iu.czz("djt", czw(int ), (int)86);
                        continue block47;
                    }
                    case 195679929: {
                        v10 = iu.czz("dju", czw(int ), (int)87);
                        continue block47;
                    }
                }
                break;
            }
            if (!(var1_1.getPacket() instanceof class_2761)) break block67;
            if (var2_4 || var2_4) return;
            v11 /* !! */  = iu.r;
            if (true) ** GOTO lbl94
            block48: while (true) {
                v11 /* !! */  = (long)(v12 - iu.czz("djv", czw(int ), (int)88));
lbl94:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1409924099: {
                        v12 = iu.czz("djw", czw(int ), (int)89);
                        continue block48;
                    }
                    case -1154030201: {
                        v12 = iu.czz("djx", czw(int ), (int)90);
                        continue block48;
                    }
                    case -1054336579: {
                        break block48;
                    }
                    case -485226554: {
                        v12 = iu.czz("djy", czw(int ), (int)91);
                        continue block48;
                    }
                }
                break;
            }
            var1_1.cancel();
            if (var2_4) return;
        }
        if (var2_4 || var2_4) {
            return;
        }
        if (var3_3 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block49: do {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: {
                    return;
                }
                case 0: {
                    var3_3 /* !! */  = (int)iu.czz("djz", daf(int ), (int)81);
                    cfr_temp_0 = 5;
                    if (!var4_2) continue block49;
                    throw null;
                }
                case 1: {
                    var3_3 /* !! */  = (int)iu.czz("dka", daf(int ), (int)82);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    ** GOTO lbl146
                }
                case 5: {
                    var3_3 /* !! */  = (int)iu.czz("dke", daf(int ), (int)86);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 4: {
                    var3_3 /* !! */  = (int)iu.czz("dkd", daf(int ), (int)85);
                    cfr_temp_0 = 3;
                    if (!var4_2) continue block49;
                    throw null;
                }
                case 7: {
                    do {
                        var3_3 /* !! */  = (int)iu.czz("dkg", daf(int ), (int)88);
                    } while (!var4_2);
                    throw null;
                }
                case 9: {
                    var3_3 /* !! */  = (int)iu.czz("dki", daf(int ), (int)90);
                    if (var4_2) {
                        throw null;
                    }
lbl146:
                    // 3 sources

                    var3_3 /* !! */  = (int)iu.czz("dkb", daf(int ), (int)83);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 8: {
                    var3_3 /* !! */  = (int)iu.czz("dkh", daf(int ), (int)89);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 3: {
                    var3_3 /* !! */  = (int)iu.czz("dkc", daf(int ), (int)84);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 6: 
            }
            break;
        } while (true);
        do {
            var3_3 /* !! */  = (int)iu.czz("dkf", daf(int ), (int)87);
        } while (!var4_2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void activate() {
        v0 /* !! */  = iu.r;
        block16: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1054336579: {
                    break block16;
                }
                case 1366727420: {
                    v0 /* !! */  = (long)(iu.czz("dcr", czw(int ), (int)17) - iu.czz("dcp", czw(int ), (int)16));
                    continue block16;
                }
            }
            break;
        }
        var3_1 = iu.c;
        v1 /* !! */  = iu.r;
        block17: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1054336579: {
                    break block17;
                }
                case -511797068: {
                    v1 /* !! */  = (long)(iu.czz("dcu", czw(int ), (int)19) - iu.czz("dct", czw(int ), (int)18));
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = iu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = iu.r - iu.czz("dcw", czw(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iu.czz("dcy", daf(int ), (int)31)) {
                var1_3 = iu.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)iu.czz("dda", daf(int ), (int)32);
        }
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block19: while (true) {
            block35: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return;
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = iu.r - iu.czz("ddc", czw(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == iu.czz("dde", daf(int ), (int)33)) {
                                ax.register(this);
                                if (var1_3) return;
                                break;
                            }
                            v3 /* !! */  = (long)iu.czz("ddf", daf(int ), (int)34);
                        }
                        if (!var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)iu.czz("ddg", daf(int ), (int)35);
                        if (!var3_1) ** break;
                        throw null;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)iu.czz("ddl", daf(int ), (int)39);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block35;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)iu.czz("ddm", daf(int ), (int)40);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)iu.czz("ddh", daf(int ), (int)36);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)iu.czz("ddi", daf(int ), (int)37);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl75
            }
            do {
                if (true) continue block19;
lbl75:
                // 2 sources

                var2_2 /* !! */  = (int)iu.czz("ddk", daf(int ), (int)38);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public iu() {
        var2_1 /* !! */  = iu.b;
        var1_2 = iu.a;
        super("Ambience", "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0432\u0440\u0435\u043c\u044f \u0441\u0443\u0442\u043e\u043a \u0432 \u043c\u0438\u0440\u0435", du.RENDER);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0420\u0435\u0436\u0438\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u0438 \u0441\u0443\u0442\u043e\u043a", "\u0414\u0435\u043d\u044c", new String[]{"\u0414\u0435\u043d\u044c", "\u041f\u043e\u043b\u0434\u0435\u043d\u044c", "\u041d\u043e\u0447\u044c", "\u041f\u043e\u043b\u043d\u043e\u0447\u044c", "\u0421\u0432\u043e\u0439"});
                this.customTime = new kg("\u0412\u0440\u0435\u043c\u044f", "\u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0441\u0432\u043e\u0435 \u0432\u0440\u0435\u043c\u044f", (float)iu.czz("dav", dau(int ), (int)10)).range((int)iu.czz("daw", daf(int ), (int)11), (int)iu.czz("dax", daf(int ), (int)12)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((iu)this));
                this.saturation = new kg("\u041d\u0430\u0441\u044b\u0449\u0435\u043d\u043d\u043e\u0441\u0442\u044c", "\u041d\u0430\u0441\u044b\u0449\u0435\u043d\u043d\u043e\u0441\u0442\u044c \u043c\u0438\u0440\u0430", 0.0f).range((float)iu.czz("day", dau(int ), (int)13), 1.0f).step((float)iu.czz("daz", dau(int ), (int)14));
                this.settings(new jx[]{this.mode, this.customTime, this.saturation});
                return;
            }
lbl12:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)iu.czz("dba", daf(int ), (int)15);
                    ** GOTO lbl19
                    break;
                }
            }
lbl16:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)iu.czz("dbb", daf(int ), (int)16);
                ** GOTO lbl22
            }
lbl19:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)iu.czz("dbc", daf(int ), (int)17);
                ** GOTO lbl12
            }
lbl22:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)iu.czz("dbd", daf(int ), (int)18);
                ** GOTO lbl16
            }
            case 4: {
                var2_1 /* !! */  = (int)iu.czz("dbe", daf(int ), (int)19);
                ** GOTO lbl16
            }
            case 5: {
                var2_1 /* !! */  = (int)iu.czz("dbf", daf(int ), (int)20);
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)iu.czz("dbg", daf(int ), (int)21);
        ** while (true)
    }

    private static /* synthetic */ void dlj() {
        iu.czx[0] = 2120544373620969685L;
        iu.czx[1] = 5543206826899203149L;
        iu.czx[2] = 1504680777925921587L;
        iu.czx[3] = 7728198047615400587L;
        iu.czx[4] = 7460464969548087988L;
        iu.czx[5] = -8566233289964230526L;
        iu.czx[6] = 8782211802417016320L;
        iu.czx[7] = -5753261764547711970L;
        iu.czx[8] = 5544449856795609288L;
        iu.czx[9] = -8017556339860141961L;
        iu.czx[10] = -5577924966907196766L;
        iu.czx[11] = 8947289507789587532L;
        iu.czx[12] = -3954430402947233433L;
        iu.czx[13] = -2425118683738950148L;
        iu.czx[14] = 4679647140325289618L;
        iu.czx[15] = -6499002190538083412L;
        iu.czx[16] = 4996582365229306658L;
        iu.czx[17] = -669109904116588168L;
        iu.czx[18] = -1596358325404169067L;
        iu.czx[19] = 3105801238480571841L;
        iu.czx[20] = 1363905307752254516L;
        iu.czx[21] = 8022515879958607935L;
        iu.czx[22] = 5939061556522230069L;
        iu.czx[23] = -8823445842895441342L;
        iu.czx[24] = -5397985644497710020L;
        iu.czx[25] = 1786626575656164691L;
        iu.czx[26] = 5576450628228229275L;
        iu.czx[27] = -1754065381945616776L;
        iu.czx[28] = -7745021413619932645L;
        iu.czx[29] = 8294451253580027955L;
        iu.czx[30] = 2208997793777717384L;
        iu.czx[31] = 3994156448222435445L;
        iu.czx[32] = -5720435144273426352L;
        iu.czx[33] = -6498521651376676426L;
        iu.czx[34] = -8410957733447433586L;
        iu.czx[35] = -7606632252512700366L;
        iu.czx[36] = 862434423135475927L;
        iu.czx[37] = -4075635539926061542L;
        iu.czx[38] = -5604337356729827292L;
        iu.czx[39] = -5798173546538235980L;
        iu.czx[40] = -6282761454435011304L;
        iu.czx[41] = -4709972719200634488L;
        iu.czx[42] = 5406089432150388072L;
        iu.czx[43] = -6789033823250984442L;
        iu.czx[44] = -9071029921659009400L;
        iu.czx[45] = 4033491824103335012L;
        iu.czx[46] = 3298289700633465096L;
        iu.czx[47] = -5007278221703226250L;
        iu.czx[48] = 1750061211021618442L;
        iu.czx[49] = 787964942107199353L;
        iu.czx[50] = -5181189018157982174L;
        iu.czx[51] = -731504610401354916L;
        iu.czx[52] = -581174966964922804L;
        iu.czx[53] = -6491227100951775284L;
        iu.czx[54] = 816010364720597453L;
        iu.czx[55] = -4614419203481968960L;
        iu.czx[56] = -5082808561480795003L;
        iu.czx[57] = -4225700628481730482L;
        iu.czx[58] = -2412896673208001323L;
        iu.czx[59] = 6939511589035637588L;
        iu.czx[60] = 2800567533388190615L;
        iu.czx[61] = -2319468454832754135L;
        iu.czx[62] = 6034177594014334331L;
        iu.czx[63] = -28978998817936862L;
        iu.czx[64] = 8194863578900023938L;
        iu.czx[65] = 6106973756053517893L;
        iu.czx[66] = -8359020412437053708L;
        iu.czx[67] = 3836281539612244991L;
        iu.czx[68] = 309330681771137447L;
        iu.czx[69] = -8763097129355657512L;
        iu.czx[70] = 8422638742078924631L;
        iu.czx[71] = -7075198105070381770L;
        iu.czx[72] = -6315002468144404966L;
        iu.czx[73] = -5037960462212262160L;
        iu.czx[74] = 5667146850314648809L;
        iu.czx[75] = 6814810655488410720L;
        iu.czx[76] = -5996575779491904349L;
        iu.czx[77] = 2808437531377400292L;
        iu.czx[78] = 3873154670666626321L;
        iu.czx[79] = 4398159306135061230L;
        iu.czx[80] = 4544948617642856432L;
        iu.czx[81] = 2596229769660450850L;
        iu.czx[82] = 3159755128262061504L;
        iu.czx[83] = 1693129607706528062L;
        iu.czx[84] = -2682511101181842626L;
        iu.czx[85] = -2737567740829499954L;
        iu.czx[86] = -9021919658560231357L;
        iu.czx[87] = 8263202994507242772L;
        iu.czx[88] = -7873270705627800414L;
        iu.czx[89] = 8555064350394829180L;
        iu.czx[90] = 1649150698906726862L;
        iu.czx[91] = 5229491329951959481L;
        iu.czx[92] = -2473507524966878147L;
        iu.czx[93] = 8604561628237801947L;
        iu.czx[94] = -5726264116044537984L;
        iu.czx[95] = 3722098758557992796L;
        iu.czx[96] = -2787082513363227059L;
        iu.czx[97] = 1499199357131842077L;
        iu.czx[98] = 9106356885037726284L;
        iu.czx[99] = -4617397370512716594L;
    }

    private static /* synthetic */ void dlf() {
        iu.dag[0] = 683657886;
        iu.dag[1] = -1513879423;
        iu.dag[2] = 1508439964;
        iu.dag[3] = 1406577679;
        iu.dag[4] = -1282875255;
        iu.dag[5] = 2143476889;
        iu.dag[6] = 175120793;
        iu.dag[7] = -1275200360;
        iu.dag[8] = -1572080485;
        iu.dag[9] = -1685303537;
        iu.dag[10] = -625026916;
        iu.dag[11] = 776259183;
        iu.dag[12] = 135259117;
        iu.dag[13] = 1608216736;
        iu.dag[14] = 188054400;
        iu.dag[15] = 1430681425;
        iu.dag[16] = 1608508453;
        iu.dag[17] = -115032757;
        iu.dag[18] = 634019362;
        iu.dag[19] = -1665824059;
        iu.dag[20] = 1269918838;
        iu.dag[21] = 499477270;
        iu.dag[22] = -8204456;
        iu.dag[23] = 1401197374;
        iu.dag[24] = -1302557187;
        iu.dag[25] = -489432325;
        iu.dag[26] = 457214694;
        iu.dag[27] = 919043856;
        iu.dag[28] = 1119534463;
        iu.dag[29] = -394384580;
        iu.dag[30] = -139439972;
        iu.dag[31] = -1186863900;
        iu.dag[32] = -1347805680;
        iu.dag[33] = -1882953872;
        iu.dag[34] = 42799877;
        iu.dag[35] = 371585554;
        iu.dag[36] = -1783712135;
        iu.dag[37] = 2022071202;
        iu.dag[38] = 1927956622;
        iu.dag[39] = -588317477;
        iu.dag[40] = -2007883864;
        iu.dag[41] = 2127103478;
        iu.dag[42] = 447125867;
        iu.dag[43] = -525338089;
        iu.dag[44] = 247785090;
        iu.dag[45] = 1302134134;
        iu.dag[46] = -1611400743;
        iu.dag[47] = -975687889;
        iu.dag[48] = 312535698;
        iu.dag[49] = -1732348673;
        iu.dag[50] = 215759434;
        iu.dag[51] = -1060481604;
        iu.dag[52] = -188815665;
        iu.dag[53] = 1100461328;
        iu.dag[54] = -445779648;
        iu.dag[55] = 696997559;
        iu.dag[56] = 696491359;
        iu.dag[57] = 1815834896;
        iu.dag[58] = -594408367;
        iu.dag[59] = 1698882198;
        iu.dag[60] = -1066852499;
        iu.dag[61] = 2093537872;
        iu.dag[62] = -1282560094;
        iu.dag[63] = -30129671;
        iu.dag[64] = 1811510968;
        iu.dag[65] = -570572329;
        iu.dag[66] = -1763741551;
        iu.dag[67] = 1878192276;
        iu.dag[68] = -902297346;
        iu.dag[69] = 1683249452;
        iu.dag[70] = -1006040588;
        iu.dag[71] = -41711117;
        iu.dag[72] = 975296927;
        iu.dag[73] = -59370010;
        iu.dag[74] = -2071535416;
        iu.dag[75] = 936138754;
        iu.dag[76] = 338600932;
        iu.dag[77] = 1036418181;
        iu.dag[78] = -970670138;
        iu.dag[79] = -670150054;
        iu.dag[80] = 912227911;
        iu.dag[81] = 2028811537;
        iu.dag[82] = -1551460373;
        iu.dag[83] = 1945737648;
        iu.dag[84] = 1664791679;
        iu.dag[85] = 1687093897;
        iu.dag[86] = 935392265;
        iu.dag[87] = 441976585;
        iu.dag[88] = -1238641363;
        iu.dag[89] = -281822347;
        iu.dag[90] = -1910550060;
        iu.dag[91] = -56553825;
        iu.dag[92] = -406614185;
        iu.dag[93] = -1958219036;
        iu.dag[94] = -1189052691;
        iu.dag[95] = -142182067;
        iu.dag[96] = -1005873250;
        iu.dag[97] = 1297184093;
        iu.dag[98] = -1834021041;
        iu.dag[99] = -997946731;
    }

    private static /* synthetic */ void dli() {
        iu.dah[100] = -340653358;
        iu.dah[101] = 1004941908;
        iu.dah[102] = -844664516;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getInternalTime() {
        block97: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = iu.r - iu.czz("dfv", czw(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == iu.czz("dfw", daf(int ), (int)47)) break;
                v0 /* !! */  = (long)iu.czz("dfx", daf(int ), (int)48);
            }
            var3_1 = iu.c;
            v1 /* !! */  = iu.r;
            if (true) ** GOTO lbl12
            block60: while (true) {
                v1 /* !! */  = (long)(v2 - iu.czz("dfy", czw(int ), (int)35));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1054336579: {
                        break block60;
                    }
                    case -886554124: {
                        v2 = iu.czz("dfz", czw(int ), (int)36);
                        continue block60;
                    }
                    case -126834372: {
                        v2 = iu.czz("dga", czw(int ), (int)37);
                        continue block60;
                    }
                    case 552430246: {
                        v2 = iu.czz("dgb", czw(int ), (int)38);
                        continue block60;
                    }
                }
                break;
            }
            var2_2 /* !! */  = iu.b;
            v3 /* !! */  = iu.r;
            if (true) ** GOTO lbl29
            block61: while (true) {
                v3 /* !! */  = (long)(v4 - iu.czz("dge", czw(int ), (int)39));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1792767083: {
                        v4 = iu.czz("dgf", czw(int ), (int)40);
                        continue block61;
                    }
                    case -1054336579: {
                        break block61;
                    }
                    case -506168829: {
                        v4 = iu.czz("dgh", czw(int ), (int)41);
                        continue block61;
                    }
                }
                break;
            }
            var1_3 = iu.a;
            if (var3_1) {
                throw null;
lbl41:
                // 10 sources

                return (long)iu.czz("dgi", czw(int ), (int)42);
            }
            if (var1_3 || var1_3) ** GOTO lbl41
            v5 /* !! */  = iu.r;
            if (true) ** GOTO lbl48
            block63: while (true) {
                v5 /* !! */  = (long)(v6 - iu.czz("dgl", czw(int ), (int)43));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1054336579: {
                        break block63;
                    }
                    case 117518820: {
                        v6 = iu.czz("dgm", czw(int ), (int)44);
                        continue block63;
                    }
                    case 512330146: {
                        v6 = iu.czz("dgn", czw(int ), (int)45);
                        continue block63;
                    }
                    case 1017318467: {
                        v6 = iu.czz("dgp", czw(int ), (int)46);
                        continue block63;
                    }
                }
                break;
            }
            v7 /* !! */  = iu.r;
            if (true) ** GOTO lbl64
            block64: while (true) {
                v7 /* !! */  = (long)(iu.czz("dgt", czw(int ), (int)48) - iu.czz("dgr", czw(int ), (int)47));
lbl64:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1054336579: {
                        break block64;
                    }
                    case 1509680466: {
                        continue block64;
                    }
                }
                break;
            }
            if (!this.mode.isSelected("\u0414\u0435\u043d\u044c")) break block97;
            if (var1_3) ** GOTO lbl41
            v8 = iu.czz("dgv", czw(int ), (int)49);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl182
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl41
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = iu.r - iu.czz("dgx", czw(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == iu.czz("dgz", daf(int ), (int)49)) break;
                    v9 /* !! */  = (long)iu.czz("dha", daf(int ), (int)50);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = iu.r - iu.czz("dhc", czw(int ), (int)51)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == iu.czz("dhd", daf(int ), (int)51)) break;
                    v10 /* !! */  = (long)iu.czz("dhe", daf(int ), (int)52);
                }
                if (!this.mode.isSelected("\u041f\u043e\u043b\u0434\u0435\u043d\u044c")) ** GOTO lbl99
                if (var1_3) ** GOTO lbl41
                v8 = iu.czz("dhf", czw(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
lbl99:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl41
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = iu.r - iu.czz("dhh", czw(int ), (int)53)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == iu.czz("dhi", daf(int ), (int)53)) break;
                    v11 /* !! */  = (long)iu.czz("dhj", daf(int ), (int)54);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = iu.r - iu.czz("dhk", czw(int ), (int)54)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == iu.czz("dhm", daf(int ), (int)55)) break;
                    v12 /* !! */  = (long)iu.czz("dhn", daf(int ), (int)56);
                }
                if (!this.mode.isSelected("\u041d\u043e\u0447\u044c")) ** GOTO lbl118
                if (var1_3) ** GOTO lbl41
                v8 = iu.czz("dho", czw(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
lbl118:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl41
                v13 /* !! */  = iu.r;
                if (true) ** GOTO lbl123
                block69: while (true) {
                    v13 /* !! */  = (long)(v14 - iu.czz("dhq", czw(int ), (int)56));
lbl123:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1054336579: {
                            break block69;
                        }
                        case -775573881: {
                            v14 = iu.czz("dhr", czw(int ), (int)57);
                            continue block69;
                        }
                        case 1433951645: {
                            v14 = iu.czz("dht", czw(int ), (int)58);
                            continue block69;
                        }
                        case 2030438240: {
                            v14 = iu.czz("dhu", czw(int ), (int)59);
                            continue block69;
                        }
                    }
                    break;
                }
                v15 /* !! */  = iu.r;
                if (true) ** GOTO lbl139
                block70: while (true) {
                    v15 /* !! */  = (long)(v16 - iu.czz("dhv", czw(int ), (int)60));
lbl139:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1269160974: {
                            v16 = iu.czz("dhw", czw(int ), (int)61);
                            continue block70;
                        }
                        case -1054336579: {
                            break block70;
                        }
                        case 36847761: {
                            v16 = iu.czz("dhx", czw(int ), (int)62);
                            continue block70;
                        }
                        case 811255787: {
                            v16 = iu.czz("dhy", czw(int ), (int)63);
                            continue block70;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u041f\u043e\u043b\u043d\u043e\u0447\u044c")) ** GOTO lbl157
                if (var1_3) ** GOTO lbl41
                v8 = iu.czz("dhz", czw(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
lbl157:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v17 /* !! */  = iu.r;
                if (true) ** GOTO lbl163
                block71: while (true) {
                    v17 /* !! */  = (long)(v18 - iu.czz("dia", czw(int ), (int)65));
lbl163:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1908870645: {
                            v18 = iu.czz("dib", czw(int ), (int)66);
                            continue block71;
                        }
                        case -1054336579: {
                            break block71;
                        }
                        case 226766013: {
                            v18 = iu.czz("dic", czw(int ), (int)67);
                            continue block71;
                        }
                        case 1001029712: {
                            v18 = iu.czz("did", czw(int ), (int)68);
                            continue block71;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = iu.r - iu.czz("die", czw(int ), (int)69)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v19 /* !! */  == iu.czz("dif", daf(int ), (int)57)) break;
                    v19 /* !! */  = (long)iu.czz("dig", daf(int ), (int)58);
                }
                v8 = (long)this.customTime.getValue();
lbl182:
                // 5 sources

                return v8;
            }
lbl183:
            // 5 sources

            case 0: {
                var2_2 /* !! */  = (int)iu.czz("dih", daf(int ), (int)59);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl188:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)iu.czz("dii", daf(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 2: {
                var2_2 /* !! */  = (int)iu.czz("dij", daf(int ), (int)61);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl198:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)iu.czz("dik", daf(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl203:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)iu.czz("dil", daf(int ), (int)63);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
lbl207:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)iu.czz("dim", daf(int ), (int)64);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
lbl211:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)iu.czz("din", daf(int ), (int)65);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
lbl215:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)iu.czz("dio", daf(int ), (int)66);
                if (!var3_1) ** GOTO lbl198
                throw null;
            }
lbl219:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)iu.czz("dip", daf(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 9: {
                var2_2 /* !! */  = (int)iu.czz("diq", daf(int ), (int)68);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
lbl228:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)iu.czz("dir", daf(int ), (int)69);
                if (!var3_1) ** GOTO lbl219
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)iu.czz("dis", daf(int ), (int)70);
                    if (!var3_1) ** GOTO lbl215
                    throw null;
                }
            }
lbl237:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)iu.czz("dit", daf(int ), (int)71);
                if (!var3_1) ** GOTO lbl207
                throw null;
            }
lbl241:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)iu.czz("diu", daf(int ), (int)72);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)iu.czz("div", daf(int ), (int)73);
                if (!var3_1) ** GOTO lbl198
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)iu.czz("diw", daf(int ), (int)74);
                if (!var3_1) ** GOTO lbl203
                throw null;
            }
lbl253:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)iu.czz("dix", daf(int ), (int)75);
                if (!var3_1) break;
                throw null;
            }
            case 17: 
        }
        var2_2 /* !! */  = (int)iu.czz("diy", daf(int ), (int)76);
        ** while (!var3_1)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int daf(int n2) {
        return dag[n2] ^ dah[n2];
    }

    private static /* synthetic */ void dlk() {
        iu.czx[100] = 4930429524178025387L;
        iu.czx[101] = 1710019649932102835L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static iu getInstance() {
        v0 /* !! */  = iu.r;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - iu.czz("daa", czw(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1088349893: {
                    v1 = iu.czz("dab", czw(int ), (int)1);
                    continue block12;
                }
                case -1054336579: {
                    break block12;
                }
                case 154952384: {
                    v1 = iu.czz("dac", czw(int ), (int)2);
                    continue block12;
                }
                case 721342516: {
                    v1 = iu.czz("dad", czw(int ), (int)3);
                    continue block12;
                }
            }
            break;
        }
        var2 = iu.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iu.r - iu.czz("dae", czw(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iu.czz("dai", daf(int ), (int)0)) break;
            v2 /* !! */  = (long)iu.czz("daj", daf(int ), (int)1);
        }
        var1_1 /* !! */  = iu.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = iu.r - iu.czz("dak", czw(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == iu.czz("dal", daf(int ), (int)2)) {
                var0_2 = iu.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)iu.czz("dam", daf(int ), (int)3);
        }
        if (!var0_2 && !var0_2) ** GOTO lbl38
        if (var1_1 /* !! */  == 0) return null;
        switch (var1_1 /* !! */ ) {
            default: {
                return null;
            }
lbl38:
            // 1 sources

            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = iu.r - iu.czz("dan", czw(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == iu.czz("dao", daf(int ), (int)4)) {
                    return nj.get(iu.class);
                }
                v4 /* !! */  = (long)iu.czz("dap", daf(int ), (int)5);
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)iu.czz("daq", daf(int ), (int)6);
                } while (!var2);
                throw null;
            }
            case 1: {
                ** GOTO lbl55
            }
            case 3: {
                var1_1 /* !! */  = (int)iu.czz("dat", daf(int ), (int)9);
                if (var2) {
                    throw null;
                }
lbl55:
                // 3 sources

                var1_1 /* !! */  = (int)iu.czz("dar", daf(int ), (int)7);
                if (var2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var1_1 /* !! */  = (int)iu.czz("das", daf(int ), (int)8);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = iu.r;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - iu.czz("ddp", czw(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1054336579: {
                    break block28;
                }
                case -1033244966: {
                    v1 = iu.czz("ddr", czw(int ), (int)23);
                    continue block28;
                }
                case 1106921092: {
                    v1 = iu.czz("ddu", czw(int ), (int)24);
                    continue block28;
                }
                case 2139764778: {
                    v1 = iu.czz("ddv", czw(int ), (int)25);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = iu.c;
        v2 /* !! */  = iu.r;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - iu.czz("ddw", czw(int ), (int)26));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1054336579: {
                    break block29;
                }
                case -798234013: {
                    v3 = iu.czz("ddx", czw(int ), (int)27);
                    continue block29;
                }
                case 297937379: {
                    v3 = iu.czz("ddz", czw(int ), (int)28);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = iu.b;
        v4 /* !! */  = iu.r;
        if (true) ** GOTO lbl36
        block30: while (true) {
            v4 /* !! */  = (long)(iu.czz("ded", czw(int ), (int)30) - iu.czz("deb", czw(int ), (int)29));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1054336579: {
                    break block30;
                }
                case -262871132: {
                    continue block30;
                }
            }
            break;
        }
        var1_3 = iu.a;
        if (var3_1) {
            throw null;
lbl44:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl44
                v5 /* !! */  = iu.r;
                if (true) ** GOTO lbl55
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - iu.czz("deg", czw(int ), (int)31));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1054336579: {
                            break block32;
                        }
                        case 361827661: {
                            v6 = iu.czz("deh", czw(int ), (int)32);
                            continue block32;
                        }
                        case 1597069940: {
                            v6 = iu.czz("dej", czw(int ), (int)33);
                            continue block32;
                        }
                    }
                    break;
                }
                ax.unregister(this);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)iu.czz("del", daf(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl73:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)iu.czz("den", daf(int ), (int)42);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
lbl77:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)iu.czz("dep", daf(int ), (int)43);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)iu.czz("deq", daf(int ), (int)44);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)iu.czz("der", daf(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)iu.czz("des", daf(int ), (int)46);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dlm() {
        iu.czy[100] = 8875620546713920824L;
        iu.czy[101] = -1015696944337369569L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iu.r - iu.czz("dkj", czw(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == iu.czz("dkk", daf(int ), (int)91)) break;
            v0 /* !! */  = (long)iu.czz("dkl", daf(int ), (int)92);
        }
        var3_1 = iu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iu.r - iu.czz("dkm", czw(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == iu.czz("dkn", daf(int ), (int)93)) break;
            v1 /* !! */  = (long)iu.czz("dko", daf(int ), (int)94);
        }
        var2_2 = iu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = iu.r - iu.czz("dkp", czw(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == iu.czz("dkq", daf(int ), (int)95)) break;
            v2 /* !! */  = (long)iu.czz("dkr", daf(int ), (int)96);
        }
        var1_3 = iu.a;
        if (var3_1) {
            throw null;
lbl21:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl24:
        // 1 sources

        v3 /* !! */  = iu.r;
        if (true) ** GOTO lbl28
        block14: while (true) {
            v3 /* !! */  = (long)(v4 - iu.czz("dks", czw(int ), (int)95));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1054336579: {
                    break block14;
                }
                case 1950522503: {
                    v4 = iu.czz("dkt", czw(int ), (int)96);
                    continue block14;
                }
                case 2037905926: {
                    v4 = iu.czz("dku", czw(int ), (int)97);
                    continue block14;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = iu.r - iu.czz("dkv", czw(int ), (int)98)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == iu.czz("dkw", daf(int ), (int)97)) break;
            v5 /* !! */  = (long)iu.czz("dkx", daf(int ), (int)98);
        }
        v6 = this.mode.isSelected("\u0421\u0432\u043e\u0439");
        v7 /* !! */  = iu.r;
        if (true) ** GOTO lbl47
        block16: while (true) {
            v7 /* !! */  = (long)(v8 - iu.czz("dky", czw(int ), (int)99));
lbl47:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1102773128: {
                    v8 = iu.czz("dkz", czw(int ), (int)100);
                    continue block16;
                }
                case -1054336579: {
                    break block16;
                }
                case -860039196: {
                    v8 = iu.czz("dla", czw(int ), (int)101);
                    continue block16;
                }
            }
            break;
        }
        return v6;
    }
}

