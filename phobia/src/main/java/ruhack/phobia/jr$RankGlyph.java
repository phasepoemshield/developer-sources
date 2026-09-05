/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

final class jr$RankGlyph
extends Record {
    private static int[] dkqe = new int[40];
    public static final int b;
    private static long[] dkql;
    private final int color;
    private static long[] dkqm;
    private final String name;
    private static int[] dkqf;
    public static final boolean a;
    protected static final long ht = -4518565089390699972L;
    public static final boolean c;

    public static /* synthetic */ CallSite dkqg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jr$RankGlyph(String var1_1, int var2_2) {
        var4_3 /* !! */  = jr$RankGlyph.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.name = var1_1;
                this.color = var2_2;
                return;
            }
lbl9:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)jr$RankGlyph.dkqg("dkqh", dkqd(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)jr$RankGlyph.dkqg("dkqi", dkqd(int ), (int)1);
                ** GOTO lbl9
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)jr$RankGlyph.dkqg("dkqj", dkqd(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ long dkqk(int n2) {
        return dkql[n2] ^ dkqm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dkqn", dkqk(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$RankGlyph.dkqg("dkqo", dkqd(int ), (int)3)) break;
            v0 /* !! */  = (long)jr$RankGlyph.dkqg("dkqp", dkqd(int ), (int)4);
        }
        var3_1 = jr$RankGlyph.c;
        v1 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - jr$RankGlyph.dkqg("dkqq", dkqk(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -664610244: {
                    break block12;
                }
                case 361713008: {
                    v2 = jr$RankGlyph.dkqg("dkqr", dkqk(int ), (int)2);
                    continue block12;
                }
                case 466153781: {
                    v2 = jr$RankGlyph.dkqg("dkqs", dkqk(int ), (int)3);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = jr$RankGlyph.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dkqt", dkqk(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jr$RankGlyph.dkqg("dkqu", dkqd(int ), (int)5)) break;
            v3 /* !! */  = (long)jr$RankGlyph.dkqg("dkqv", dkqd(int ), (int)6);
        }
        var1_3 = jr$RankGlyph.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dkqw", dkqk(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jr$RankGlyph.dkqg("dkqx", dkqd(int ), (int)7)) break;
                    v4 /* !! */  = (long)jr$RankGlyph.dkqg("dkqy", dkqd(int ), (int)8);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{jr$RankGlyph.class, "name;color", "name", "color"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dkqz", dkqd(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dkra", dkqd(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
lbl54:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dkrb", dkqd(int ), (int)11);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dkrc", dkqd(int ), (int)12);
        } while (!var3_1);
        throw null;
    }

    static {
        dkqf = new int[40];
        jr$RankGlyph.dktv();
        jr$RankGlyph.dktw();
        dkql = new long[49];
        dkqm = new long[49];
        jr$RankGlyph.dktx();
        jr$RankGlyph.dkty();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int color() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dktd", dkqk(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$RankGlyph.dkqg("dkte", dkqd(int ), (int)31)) break;
            v0 /* !! */  = (long)jr$RankGlyph.dkqg("dktf", dkqd(int ), (int)32);
        }
        var3_1 = jr$RankGlyph.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dktg", dkqk(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jr$RankGlyph.dkqg("dkth", dkqd(int ), (int)33)) break;
            v1 /* !! */  = (long)jr$RankGlyph.dkqg("dkti", dkqd(int ), (int)34);
        }
        var2_2 = jr$RankGlyph.b;
        v2 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - jr$RankGlyph.dkqg("dktj", dkqk(int ), (int)42));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1359603395: {
                    v3 = jr$RankGlyph.dkqg("dktk", dkqk(int ), (int)43);
                    continue block13;
                }
                case -1186053856: {
                    v3 = jr$RankGlyph.dkqg("dktl", dkqk(int ), (int)44);
                    continue block13;
                }
                case -664610244: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = jr$RankGlyph.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (int)jr$RankGlyph.dkqg("dktm", dkqd(int ), (int)35);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl38
        block15: while (true) {
            v4 /* !! */  = (long)(v5 - jr$RankGlyph.dkqg("dktn", dkqk(int ), (int)45));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -953500417: {
                    v5 = jr$RankGlyph.dkqg("dkto", dkqk(int ), (int)46);
                    continue block15;
                }
                case -664610244: {
                    break block15;
                }
                case -572141921: {
                    v5 = jr$RankGlyph.dkqg("dktp", dkqk(int ), (int)47);
                    continue block15;
                }
                case 1055259646: {
                    v5 = jr$RankGlyph.dkqg("dktq", dkqk(int ), (int)48);
                    continue block15;
                }
            }
            break;
        }
        return this.color;
    }

    private static /* synthetic */ void dktx() {
        jr$RankGlyph.dkql[0] = -5483066596544957001L;
        jr$RankGlyph.dkql[1] = -4113830922572126966L;
        jr$RankGlyph.dkql[2] = 2840588838831139975L;
        jr$RankGlyph.dkql[3] = -9102849818701870126L;
        jr$RankGlyph.dkql[4] = -7770139199834545896L;
        jr$RankGlyph.dkql[5] = -8273875840385814932L;
        jr$RankGlyph.dkql[6] = 6484292468516229886L;
        jr$RankGlyph.dkql[7] = -9200162236403638866L;
        jr$RankGlyph.dkql[8] = 3231892529602588801L;
        jr$RankGlyph.dkql[9] = -9172240001774521134L;
        jr$RankGlyph.dkql[10] = -8588852350238464520L;
        jr$RankGlyph.dkql[11] = -8076640006449383233L;
        jr$RankGlyph.dkql[12] = -306521727800418082L;
        jr$RankGlyph.dkql[13] = -3171002039753596567L;
        jr$RankGlyph.dkql[14] = -4899436197193001961L;
        jr$RankGlyph.dkql[15] = 290974513470341560L;
        jr$RankGlyph.dkql[16] = -3069275867461536732L;
        jr$RankGlyph.dkql[17] = -3996556855971366244L;
        jr$RankGlyph.dkql[18] = -4111874249297710354L;
        jr$RankGlyph.dkql[19] = 1528759810155952962L;
        jr$RankGlyph.dkql[20] = 6303123905499057151L;
        jr$RankGlyph.dkql[21] = 6283995870846763353L;
        jr$RankGlyph.dkql[22] = 6719752234348449692L;
        jr$RankGlyph.dkql[23] = -8248032357797813847L;
        jr$RankGlyph.dkql[24] = 782272378308974549L;
        jr$RankGlyph.dkql[25] = -4921376842178173960L;
        jr$RankGlyph.dkql[26] = 6153089425167973778L;
        jr$RankGlyph.dkql[27] = -5017042328577713756L;
        jr$RankGlyph.dkql[28] = -5054376414562392855L;
        jr$RankGlyph.dkql[29] = -5621000912502942560L;
        jr$RankGlyph.dkql[30] = 1645327675820010940L;
        jr$RankGlyph.dkql[31] = -7381042657465260877L;
        jr$RankGlyph.dkql[32] = 6837075891127403230L;
        jr$RankGlyph.dkql[33] = 3990978847323113788L;
        jr$RankGlyph.dkql[34] = -4324249530491141362L;
        jr$RankGlyph.dkql[35] = 5063853339325816578L;
        jr$RankGlyph.dkql[36] = 5532667552199998440L;
        jr$RankGlyph.dkql[37] = 1766711495907205973L;
        jr$RankGlyph.dkql[38] = -5989630739813437262L;
        jr$RankGlyph.dkql[39] = -4230746520566915330L;
        jr$RankGlyph.dkql[40] = 917576163431605571L;
        jr$RankGlyph.dkql[41] = 469435790584592452L;
        jr$RankGlyph.dkql[42] = 487793480606141413L;
        jr$RankGlyph.dkql[43] = -2912794189054988752L;
        jr$RankGlyph.dkql[44] = -5833078316389949318L;
        jr$RankGlyph.dkql[45] = 3886343905845850307L;
        jr$RankGlyph.dkql[46] = -1896583971172758183L;
        jr$RankGlyph.dkql[47] = 4828576706084796332L;
        jr$RankGlyph.dkql[48] = 6021350667786292806L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final int hashCode() {
        Object object = ht;
        boolean bl2 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - jr$RankGlyph.dkqg("dkrd", dkqk(int ), (int)6);
            }
            switch ((int)object) {
                case -1949326495: {
                    callSite = jr$RankGlyph.dkqg("dkre", dkqk(int ), (int)7);
                    continue block20;
                }
                case -664610244: {
                    break block20;
                }
                case 1991872000: {
                    callSite = jr$RankGlyph.dkqg("dkrf", dkqk(int ), (int)8);
                    continue block20;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ht;
        block21: while (true) {
            switch ((int)object2) {
                case -987202594: {
                    object2 = jr$RankGlyph.dkqg("dkrh", dkqk(int ), (int)10) - jr$RankGlyph.dkqg("dkrg", dkqk(int ), (int)9);
                    continue block21;
                }
                case -664610244: {
                    break block21;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ht;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - jr$RankGlyph.dkqg("dkri", dkqk(int ), (int)11);
            }
            switch ((int)object3) {
                case -1222304352: {
                    callSite = jr$RankGlyph.dkqg("dkrj", dkqk(int ), (int)12);
                    continue block22;
                }
                case -901739539: {
                    callSite = jr$RankGlyph.dkqg("dkrk", dkqk(int ), (int)13);
                    continue block22;
                }
                case -664610244: {
                    break block22;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (int)jr$RankGlyph.dkqg("dkrl", dkqd(int ), (int)13);
        if (bl5) return (int)jr$RankGlyph.dkqg("dkrl", dkqd(int ), (int)13);
        Object object4 = ht;
        boolean bl6 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - jr$RankGlyph.dkqg("dkrm", dkqk(int ), (int)14);
            }
            switch ((int)object4) {
                case -991175174: {
                    callSite = jr$RankGlyph.dkqg("dkrn", dkqk(int ), (int)15);
                    continue block23;
                }
                case -664610244: {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jr$RankGlyph.class, "name;color", "name", "color"}, this);
                }
                case 1240154287: {
                    callSite = jr$RankGlyph.dkqg("dkro", dkqk(int ), (int)16);
                    continue block23;
                }
                case 1307987941: {
                    callSite = jr$RankGlyph.dkqg("dkrp", dkqk(int ), (int)17);
                    continue block23;
                }
            }
            break;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jr$RankGlyph.class, "name;color", "name", "color"}, this);
    }

    private static /* synthetic */ int dkqd(int n2) {
        return dkqe[n2] ^ dkqf[n2];
    }

    private static /* synthetic */ void dktw() {
        jr$RankGlyph.dkqf[0] = -363981439;
        jr$RankGlyph.dkqf[1] = -1392000991;
        jr$RankGlyph.dkqf[2] = -1301536031;
        jr$RankGlyph.dkqf[3] = -340941376;
        jr$RankGlyph.dkqf[4] = 1500801947;
        jr$RankGlyph.dkqf[5] = 1858096008;
        jr$RankGlyph.dkqf[6] = 2031602089;
        jr$RankGlyph.dkqf[7] = 811238306;
        jr$RankGlyph.dkqf[8] = -136496158;
        jr$RankGlyph.dkqf[9] = 1934692707;
        jr$RankGlyph.dkqf[10] = 1755737989;
        jr$RankGlyph.dkqf[11] = 1962086900;
        jr$RankGlyph.dkqf[12] = -1352774562;
        jr$RankGlyph.dkqf[13] = 1334181032;
        jr$RankGlyph.dkqf[14] = -140403212;
        jr$RankGlyph.dkqf[15] = 133293503;
        jr$RankGlyph.dkqf[16] = -434013613;
        jr$RankGlyph.dkqf[17] = 1942934876;
        jr$RankGlyph.dkqf[18] = -1275493700;
        jr$RankGlyph.dkqf[19] = -972024088;
        jr$RankGlyph.dkqf[20] = 2054593211;
        jr$RankGlyph.dkqf[21] = 733317361;
        jr$RankGlyph.dkqf[22] = 1533797809;
        jr$RankGlyph.dkqf[23] = 570712416;
        jr$RankGlyph.dkqf[24] = -163061044;
        jr$RankGlyph.dkqf[25] = 723231960;
        jr$RankGlyph.dkqf[26] = 1821950584;
        jr$RankGlyph.dkqf[27] = 1008470240;
        jr$RankGlyph.dkqf[28] = 1664990959;
        jr$RankGlyph.dkqf[29] = 2521391;
        jr$RankGlyph.dkqf[30] = 1696829849;
        jr$RankGlyph.dkqf[31] = 698545460;
        jr$RankGlyph.dkqf[32] = 532637957;
        jr$RankGlyph.dkqf[33] = -1162883857;
        jr$RankGlyph.dkqf[34] = 660627957;
        jr$RankGlyph.dkqf[35] = -480692025;
        jr$RankGlyph.dkqf[36] = 1472664063;
        jr$RankGlyph.dkqf[37] = -2063659328;
        jr$RankGlyph.dkqf[38] = -174477331;
        jr$RankGlyph.dkqf[39] = -1987215376;
    }

    private static /* synthetic */ void dkty() {
        jr$RankGlyph.dkqm[0] = -7115196134425028712L;
        jr$RankGlyph.dkqm[1] = 3103301992273287084L;
        jr$RankGlyph.dkqm[2] = -1491955037033303563L;
        jr$RankGlyph.dkqm[3] = 6922488168970560534L;
        jr$RankGlyph.dkqm[4] = -5799121623724612563L;
        jr$RankGlyph.dkqm[5] = -1209699406836598809L;
        jr$RankGlyph.dkqm[6] = 6734565034247135420L;
        jr$RankGlyph.dkqm[7] = -4316705828440545909L;
        jr$RankGlyph.dkqm[8] = 6278760671757635684L;
        jr$RankGlyph.dkqm[9] = 7251091524450122914L;
        jr$RankGlyph.dkqm[10] = 2348699825884723086L;
        jr$RankGlyph.dkqm[11] = 2089604065944153812L;
        jr$RankGlyph.dkqm[12] = -1013785172047477285L;
        jr$RankGlyph.dkqm[13] = -4905199829134574141L;
        jr$RankGlyph.dkqm[14] = 659483823382937098L;
        jr$RankGlyph.dkqm[15] = -7023821897675237575L;
        jr$RankGlyph.dkqm[16] = 6406091004572185497L;
        jr$RankGlyph.dkqm[17] = -843417771075876271L;
        jr$RankGlyph.dkqm[18] = 3965260632416940547L;
        jr$RankGlyph.dkqm[19] = -7950877475271859537L;
        jr$RankGlyph.dkqm[20] = -1917845558801276890L;
        jr$RankGlyph.dkqm[21] = -6327677796559232971L;
        jr$RankGlyph.dkqm[22] = 8928326933458855268L;
        jr$RankGlyph.dkqm[23] = -2297956651406361010L;
        jr$RankGlyph.dkqm[24] = -2526334166074943494L;
        jr$RankGlyph.dkqm[25] = -1551794070136407821L;
        jr$RankGlyph.dkqm[26] = 8469880141284655734L;
        jr$RankGlyph.dkqm[27] = -6041180909572494226L;
        jr$RankGlyph.dkqm[28] = 117740544239548373L;
        jr$RankGlyph.dkqm[29] = 4611156044924953219L;
        jr$RankGlyph.dkqm[30] = -6273721504475776287L;
        jr$RankGlyph.dkqm[31] = -8442707773199479604L;
        jr$RankGlyph.dkqm[32] = 5978814894089245899L;
        jr$RankGlyph.dkqm[33] = 3412290282714097472L;
        jr$RankGlyph.dkqm[34] = 2378671282807632145L;
        jr$RankGlyph.dkqm[35] = -1804057315523590782L;
        jr$RankGlyph.dkqm[36] = 6851999273419580367L;
        jr$RankGlyph.dkqm[37] = -1153765537761130331L;
        jr$RankGlyph.dkqm[38] = 2486061191372078908L;
        jr$RankGlyph.dkqm[39] = 2121267658222026527L;
        jr$RankGlyph.dkqm[40] = 4165853841241010904L;
        jr$RankGlyph.dkqm[41] = 6407758387408905588L;
        jr$RankGlyph.dkqm[42] = -2343183818292645572L;
        jr$RankGlyph.dkqm[43] = -2103046083077218005L;
        jr$RankGlyph.dkqm[44] = 1280588725066529118L;
        jr$RankGlyph.dkqm[45] = 1784231860164542776L;
        jr$RankGlyph.dkqm[46] = -1570496577124105227L;
        jr$RankGlyph.dkqm[47] = 3060744158880401609L;
        jr$RankGlyph.dkqm[48] = 1957625336424196356L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dksn", dkqk(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$RankGlyph.dkqg("dkso", dkqd(int ), (int)25)) break;
            v0 /* !! */  = (long)jr$RankGlyph.dkqg("dksp", dkqd(int ), (int)26);
        }
        var3_1 = jr$RankGlyph.c;
        v1 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - jr$RankGlyph.dkqg("dksq", dkqk(int ), (int)31));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -664610244: {
                    break block22;
                }
                case -341222113: {
                    v2 = jr$RankGlyph.dkqg("dksr", dkqk(int ), (int)32);
                    continue block22;
                }
                case 27458693: {
                    v2 = jr$RankGlyph.dkqg("dkss", dkqk(int ), (int)33);
                    continue block22;
                }
                case 1220576486: {
                    v2 = jr$RankGlyph.dkqg("dkst", dkqk(int ), (int)34);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = jr$RankGlyph.b;
        v3 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - jr$RankGlyph.dkqg("dksu", dkqk(int ), (int)35));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -664610244: {
                    break block23;
                }
                case -420581112: {
                    v4 = jr$RankGlyph.dkqg("dksv", dkqk(int ), (int)36);
                    continue block23;
                }
                case 357539394: {
                    v4 = jr$RankGlyph.dkqg("dksw", dkqk(int ), (int)37);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = jr$RankGlyph.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v5 /* !! */  = jr$RankGlyph.ht;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v5 /* !! */  = (long)(jr$RankGlyph.dkqg("dksy", dkqk(int ), (int)39) - jr$RankGlyph.dkqg("dksx", dkqk(int ), (int)38));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -664610244: {
                            break block25;
                        }
                        case 323440890: {
                            continue block25;
                        }
                    }
                    break;
                }
                return this.name;
lbl56:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dksz", dkqd(int ), (int)27);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl66
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dkta", dkqd(int ), (int)28);
                    if (!var3_1) break block24;
                    throw null;
                }
lbl66:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dktb", dkqd(int ), (int)29);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)jr$RankGlyph.dkqg("dktc", dkqd(int ), (int)30);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dktv() {
        jr$RankGlyph.dkqe[0] = -363981440;
        jr$RankGlyph.dkqe[1] = -1392000989;
        jr$RankGlyph.dkqe[2] = -1301536031;
        jr$RankGlyph.dkqe[3] = 340941375;
        jr$RankGlyph.dkqe[4] = 351804811;
        jr$RankGlyph.dkqe[5] = -1858096009;
        jr$RankGlyph.dkqe[6] = 1340976459;
        jr$RankGlyph.dkqe[7] = -811238307;
        jr$RankGlyph.dkqe[8] = 1521760836;
        jr$RankGlyph.dkqe[9] = 1934692704;
        jr$RankGlyph.dkqe[10] = 1755737991;
        jr$RankGlyph.dkqe[11] = 1962086901;
        jr$RankGlyph.dkqe[12] = -1352774561;
        jr$RankGlyph.dkqe[13] = 1316852133;
        jr$RankGlyph.dkqe[14] = -140403212;
        jr$RankGlyph.dkqe[15] = 133293501;
        jr$RankGlyph.dkqe[16] = -434013614;
        jr$RankGlyph.dkqe[17] = 1942934876;
        jr$RankGlyph.dkqe[18] = 1275493699;
        jr$RankGlyph.dkqe[19] = -1396338385;
        jr$RankGlyph.dkqe[20] = 2054593211;
        jr$RankGlyph.dkqe[21] = 733317362;
        jr$RankGlyph.dkqe[22] = 1533797809;
        jr$RankGlyph.dkqe[23] = 570712417;
        jr$RankGlyph.dkqe[24] = -163061042;
        jr$RankGlyph.dkqe[25] = 723231961;
        jr$RankGlyph.dkqe[26] = -6065199;
        jr$RankGlyph.dkqe[27] = 1008470241;
        jr$RankGlyph.dkqe[28] = 1664990956;
        jr$RankGlyph.dkqe[29] = 2521390;
        jr$RankGlyph.dkqe[30] = 1696829851;
        jr$RankGlyph.dkqe[31] = -698545461;
        jr$RankGlyph.dkqe[32] = -505500291;
        jr$RankGlyph.dkqe[33] = 1162883856;
        jr$RankGlyph.dkqe[34] = 762454560;
        jr$RankGlyph.dkqe[35] = -1956528606;
        jr$RankGlyph.dkqe[36] = 1472664062;
        jr$RankGlyph.dkqe[37] = -2063659328;
        jr$RankGlyph.dkqe[38] = -174477329;
        jr$RankGlyph.dkqe[39] = -1987215373;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - jr$RankGlyph.dkqg("dkru", dkqk(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1989821428: {
                    v1 = jr$RankGlyph.dkqg("dkrv", dkqk(int ), (int)19);
                    continue block23;
                }
                case -664610244: {
                    break block23;
                }
                case 2094262451: {
                    v1 = jr$RankGlyph.dkqg("dkrw", dkqk(int ), (int)20);
                    continue block23;
                }
                case 2128796330: {
                    v1 = jr$RankGlyph.dkqg("dkrx", dkqk(int ), (int)21);
                    continue block23;
                }
            }
            break;
        }
        var4_2 = jr$RankGlyph.c;
        v2 /* !! */  = jr$RankGlyph.ht;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - jr$RankGlyph.dkqg("dkry", dkqk(int ), (int)22));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -664610244: {
                    break block24;
                }
                case -609314468: {
                    v3 = jr$RankGlyph.dkqg("dkrz", dkqk(int ), (int)23);
                    continue block24;
                }
                case -435175482: {
                    v3 = jr$RankGlyph.dkqg("dksa", dkqk(int ), (int)24);
                    continue block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = jr$RankGlyph.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = jr$RankGlyph.ht - jr$RankGlyph.dkqg("dksb", dkqk(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == jr$RankGlyph.dkqg("dksc", dkqd(int ), (int)18)) break;
            v4 /* !! */  = (long)jr$RankGlyph.dkqg("dksd", dkqd(int ), (int)19);
        }
        var2_4 = jr$RankGlyph.a;
        if (var4_2) {
            throw null;
lbl41:
            // 2 sources

            return (boolean)jr$RankGlyph.dkqg("dkse", dkqd(int ), (int)20);
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v5 /* !! */  = jr$RankGlyph.ht;
                if (true) ** GOTO lbl52
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - jr$RankGlyph.dkqg("dksf", dkqk(int ), (int)26));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1348491275: {
                            v6 = jr$RankGlyph.dkqg("dksg", dkqk(int ), (int)27);
                            continue block27;
                        }
                        case -664610244: {
                            break block27;
                        }
                        case 194874176: {
                            v6 = jr$RankGlyph.dkqg("dksh", dkqk(int ), (int)28);
                            continue block27;
                        }
                        case 1010925615: {
                            v6 = jr$RankGlyph.dkqg("dksi", dkqk(int ), (int)29);
                            continue block27;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jr$RankGlyph.class, "name;color", "name", "color"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)jr$RankGlyph.dkqg("dksj", dkqd(int ), (int)21);
                if (!var4_2) break;
                throw null;
            }
lbl69:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)jr$RankGlyph.dkqg("dksk", dkqd(int ), (int)22);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jr$RankGlyph.dkqg("dksl", dkqd(int ), (int)23);
                    if (!var4_2) ** GOTO lbl69
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)jr$RankGlyph.dkqg("dksm", dkqd(int ), (int)24);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }
}

