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

final class ed$Snapshot
extends Record {
    private final long sampledAt;
    public static final boolean a;
    public static final int b;
    private static int[] eaqq;
    private static long[] eaqy;
    private final boolean playing;
    private static int[] eaqp;
    private final String artist;
    public static final boolean c;
    static final long kg = 1287361284653663804L;
    private final String title;
    private final long position;
    private final long duration;
    private static long[] eaqz;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public long sampledAt() {
        block22: {
            block23: {
                v0 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl5
                block11: while (true) {
                    v0 /* !! */  = (long)(v1 - ed$Snapshot.eaqr("ebaf", eaqx(int ), (int)125));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2057353668: {
                            break block11;
                        }
                        case -1936209862: {
                            v1 = ed$Snapshot.eaqr("ebag", eaqx(int ), (int)126);
                            continue block11;
                        }
                        case -222660579: {
                            v1 = ed$Snapshot.eaqr("ebah", eaqx(int ), (int)127);
                            continue block11;
                        }
                    }
                    break;
                }
                var3_1 = ed$Snapshot.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("ebai", eaqx(int ), (int)128)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ed$Snapshot.eaqr("ebaj", eaqo(int ), (int)119)) break;
                    v2 /* !! */  = (long)ed$Snapshot.eaqr("ebak", eaqo(int ), (int)120);
                }
                var2_2 /* !! */  = ed$Snapshot.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("ebal", eaqx(int ), (int)129)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ed$Snapshot.eaqr("ebam", eaqo(int ), (int)121)) {
                        var1_3 = ed$Snapshot.a;
                        if (var3_1) {
                            throw null;
                        }
                        break;
                    }
                    v3 /* !! */  = (long)ed$Snapshot.eaqr("eban", eaqo(int ), (int)122);
                }
                if (!var1_3 && !var1_3) ** GOTO lbl37
                if (var2_2 /* !! */  == 0) return (long)ed$Snapshot.eaqr("ebao", eaqx(int ), (int)130);
                cfr_temp_0 = -2147483648;
lbl33:
                // 2 sources

                block14: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: {
                            return (long)ed$Snapshot.eaqr("ebao", eaqx(int ), (int)130);
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = ed$Snapshot.kg - ed$Snapshot.eaqr("ebap", eaqx(int ), (int)131)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == ed$Snapshot.eaqr("ebaq", eaqo(int ), (int)123)) {
                                return this.sampledAt;
                            }
                            v4 /* !! */  = (long)ed$Snapshot.eaqr("ebar", eaqo(int ), (int)124);
                        }
                        case 0: {
                            ** break;
                        }
                        case 2: {
                            var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebau", eaqo(int ), (int)127);
                            if (var3_1) {
                                throw null;
                            }
                            break block22;
                        }
                        case 3: {
                            break block22;
                        }
lbl52:
                        // 2 sources

                        while (true) {
                            var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebas", eaqo(int ), (int)125);
                            cfr_temp_0 = 1;
                            if (!var3_1) continue block14;
                            throw null;
                        }
                        case 1: 
                    }
                    break;
                }
                break block23;
                ** while (true)
            }
            var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebat", eaqo(int ), (int)126);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebav", eaqo(int ), (int)128);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eava", eaqx(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ed$Snapshot.eaqr("eavb", eaqo(int ), (int)54)) break;
            v0 /* !! */  = (long)ed$Snapshot.eaqr("eavc", eaqo(int ), (int)55);
        }
        var3_1 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - ed$Snapshot.eaqr("eavd", eaqx(int ), (int)56));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block13;
                }
                case 547298215: {
                    v2 = ed$Snapshot.eaqr("eave", eaqx(int ), (int)57);
                    continue block13;
                }
                case 1515093030: {
                    v2 = ed$Snapshot.eaqr("eavf", eaqx(int ), (int)58);
                    continue block13;
                }
                case 1772803184: {
                    v2 = ed$Snapshot.eaqr("eavg", eaqx(int ), (int)59);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("eavh", eaqx(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ed$Snapshot.eaqr("eavi", eaqo(int ), (int)56)) break;
            v3 /* !! */  = (long)ed$Snapshot.eaqr("eavj", eaqo(int ), (int)57);
        }
        var1_3 = ed$Snapshot.a;
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
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("eavk", eaqx(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ed$Snapshot.eaqr("eavl", eaqo(int ), (int)58)) break;
                    v4 /* !! */  = (long)ed$Snapshot.eaqr("eavm", eaqo(int ), (int)59);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{ed$Snapshot.class, "title;artist;position;duration;playing;sampledAt", "title", "artist", "position", "duration", "playing", "sampledAt"}, this);
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eavn", eaqo(int ), (int)60);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eavo", eaqo(int ), (int)61);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eavp", eaqo(int ), (int)62);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eavq", eaqo(int ), (int)63);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ebba() {
        ed$Snapshot.eaqy[0] = 3270728098072377169L;
        ed$Snapshot.eaqy[1] = -4911793635053095422L;
        ed$Snapshot.eaqy[2] = 7264181138713278928L;
        ed$Snapshot.eaqy[3] = -8090627653457195645L;
        ed$Snapshot.eaqy[4] = 2875720553965266936L;
        ed$Snapshot.eaqy[5] = -8577146814911651041L;
        ed$Snapshot.eaqy[6] = -8355346453284816743L;
        ed$Snapshot.eaqy[7] = 3566446654011317352L;
        ed$Snapshot.eaqy[8] = -4005481040703860661L;
        ed$Snapshot.eaqy[9] = 2890416453361840230L;
        ed$Snapshot.eaqy[10] = 7666015585445666622L;
        ed$Snapshot.eaqy[11] = -5616730194650448925L;
        ed$Snapshot.eaqy[12] = -3109543681250780397L;
        ed$Snapshot.eaqy[13] = -1877659286433941068L;
        ed$Snapshot.eaqy[14] = 3270232957362045037L;
        ed$Snapshot.eaqy[15] = -4635053711212200754L;
        ed$Snapshot.eaqy[16] = -6622747268719197214L;
        ed$Snapshot.eaqy[17] = 6705724045334092901L;
        ed$Snapshot.eaqy[18] = 8630303720491121103L;
        ed$Snapshot.eaqy[19] = 4398093834646554328L;
        ed$Snapshot.eaqy[20] = 2482837539443504842L;
        ed$Snapshot.eaqy[21] = -7270419556346308469L;
        ed$Snapshot.eaqy[22] = 8803506502716491507L;
        ed$Snapshot.eaqy[23] = 6047531459978341825L;
        ed$Snapshot.eaqy[24] = 5976923799538367151L;
        ed$Snapshot.eaqy[25] = -7120781149839648963L;
        ed$Snapshot.eaqy[26] = 8627191226956921757L;
        ed$Snapshot.eaqy[27] = -7198515588284990885L;
        ed$Snapshot.eaqy[28] = -5513226375350096702L;
        ed$Snapshot.eaqy[29] = 7866092691895087083L;
        ed$Snapshot.eaqy[30] = 7044148446499198272L;
        ed$Snapshot.eaqy[31] = -8643314843506536042L;
        ed$Snapshot.eaqy[32] = 2807923181225770644L;
        ed$Snapshot.eaqy[33] = 5452522716197751906L;
        ed$Snapshot.eaqy[34] = -2240170439877269526L;
        ed$Snapshot.eaqy[35] = -824962314721913952L;
        ed$Snapshot.eaqy[36] = 2514383565631954923L;
        ed$Snapshot.eaqy[37] = -3368472223310089110L;
        ed$Snapshot.eaqy[38] = -6342672223719744497L;
        ed$Snapshot.eaqy[39] = 7982465091694046304L;
        ed$Snapshot.eaqy[40] = 7575889997593116666L;
        ed$Snapshot.eaqy[41] = -4611999627001272176L;
        ed$Snapshot.eaqy[42] = -7854356011777379087L;
        ed$Snapshot.eaqy[43] = -9140947430052468970L;
        ed$Snapshot.eaqy[44] = -1230700135292777875L;
        ed$Snapshot.eaqy[45] = -8252011497424014427L;
        ed$Snapshot.eaqy[46] = 9182736955842156942L;
        ed$Snapshot.eaqy[47] = 5676381912909200429L;
        ed$Snapshot.eaqy[48] = -2048088538144746515L;
        ed$Snapshot.eaqy[49] = 2692652581951684498L;
        ed$Snapshot.eaqy[50] = 2223743287601745160L;
        ed$Snapshot.eaqy[51] = -2198961659274657866L;
        ed$Snapshot.eaqy[52] = -3131078175378044028L;
        ed$Snapshot.eaqy[53] = 7213938119169884402L;
        ed$Snapshot.eaqy[54] = 3507747688898312653L;
        ed$Snapshot.eaqy[55] = -1253013840467233668L;
        ed$Snapshot.eaqy[56] = 2068774616146091444L;
        ed$Snapshot.eaqy[57] = -7257883089194181805L;
        ed$Snapshot.eaqy[58] = 8661542975359276172L;
        ed$Snapshot.eaqy[59] = 2101385459759740331L;
        ed$Snapshot.eaqy[60] = -1549250197483416576L;
        ed$Snapshot.eaqy[61] = 1578344236265567325L;
        ed$Snapshot.eaqy[62] = 2330730795206442767L;
        ed$Snapshot.eaqy[63] = 8508497314824889762L;
        ed$Snapshot.eaqy[64] = 3207242629655364529L;
        ed$Snapshot.eaqy[65] = 8916416961657707724L;
        ed$Snapshot.eaqy[66] = 7588114433445385752L;
        ed$Snapshot.eaqy[67] = 4898093252977945598L;
        ed$Snapshot.eaqy[68] = 1739072348615110399L;
        ed$Snapshot.eaqy[69] = 3737671143247129346L;
        ed$Snapshot.eaqy[70] = -7327665279873547451L;
        ed$Snapshot.eaqy[71] = -4592067268715339895L;
        ed$Snapshot.eaqy[72] = 1991662662645407824L;
        ed$Snapshot.eaqy[73] = 6006379595609643368L;
        ed$Snapshot.eaqy[74] = -7328581955876140444L;
        ed$Snapshot.eaqy[75] = 4007062262436753628L;
        ed$Snapshot.eaqy[76] = -5323263498824325893L;
        ed$Snapshot.eaqy[77] = 8684291936121791518L;
        ed$Snapshot.eaqy[78] = -7849284455672363123L;
        ed$Snapshot.eaqy[79] = 3444598064046582684L;
        ed$Snapshot.eaqy[80] = -2413176918943960819L;
        ed$Snapshot.eaqy[81] = 7761871448920420580L;
        ed$Snapshot.eaqy[82] = -6243242449780523382L;
        ed$Snapshot.eaqy[83] = 2743178464668000283L;
        ed$Snapshot.eaqy[84] = 9042203399710797998L;
        ed$Snapshot.eaqy[85] = 6142716464205881372L;
        ed$Snapshot.eaqy[86] = 2787905733369476099L;
        ed$Snapshot.eaqy[87] = -3805793382314684500L;
        ed$Snapshot.eaqy[88] = 8817911119362459260L;
        ed$Snapshot.eaqy[89] = 7874320727620520880L;
        ed$Snapshot.eaqy[90] = -7942950651869476730L;
        ed$Snapshot.eaqy[91] = -3923724481904583474L;
        ed$Snapshot.eaqy[92] = 2938865210094191230L;
        ed$Snapshot.eaqy[93] = 4809989895110565933L;
        ed$Snapshot.eaqy[94] = -7476004701492275997L;
        ed$Snapshot.eaqy[95] = -1580655773156233925L;
        ed$Snapshot.eaqy[96] = 5102124080420306763L;
        ed$Snapshot.eaqy[97] = -2320815573886497571L;
        ed$Snapshot.eaqy[98] = 6302045465694886083L;
        ed$Snapshot.eaqy[99] = 8538446683781587361L;
    }

    public static /* synthetic */ CallSite eaqr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long duration() {
        v0 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(ed$Snapshot.eaqr("eayy", eaqx(int ), (int)107) - ed$Snapshot.eaqr("eayx", eaqx(int ), (int)106));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2135419766: {
                    continue block25;
                }
                case -2057353668: {
                    break block25;
                }
            }
            break;
        }
        var3_1 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - ed$Snapshot.eaqr("eayz", eaqx(int ), (int)108));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block26;
                }
                case -1391833730: {
                    v2 = ed$Snapshot.eaqr("eaza", eaqx(int ), (int)109);
                    continue block26;
                }
                case -888072993: {
                    v2 = ed$Snapshot.eaqr("eazb", eaqx(int ), (int)110);
                    continue block26;
                }
                case -596145883: {
                    v2 = ed$Snapshot.eaqr("eazc", eaqx(int ), (int)111);
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = ed$Snapshot.b;
        v3 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl32
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - ed$Snapshot.eaqr("eazd", eaqx(int ), (int)112));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2070407868: {
                    v4 = ed$Snapshot.eaqr("eaze", eaqx(int ), (int)113);
                    continue block27;
                }
                case -2057353668: {
                    break block27;
                }
                case 251785501: {
                    v4 = ed$Snapshot.eaqr("eazf", eaqx(int ), (int)114);
                    continue block27;
                }
            }
            break;
        }
        var1_3 = ed$Snapshot.a;
        if (var3_1) {
            throw null;
            return (long)ed$Snapshot.eaqr("eazg", eaqx(int ), (int)115);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl54
                block29: while (true) {
                    v5 /* !! */  = (long)(ed$Snapshot.eaqr("eazi", eaqx(int ), (int)117) - ed$Snapshot.eaqr("eazh", eaqx(int ), (int)116));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2057353668: {
                            break block29;
                        }
                        case 910331451: {
                            continue block29;
                        }
                    }
                    break;
                }
                return this.duration;
            }
lbl60:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eazj", eaqo(int ), (int)104);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eazk", eaqo(int ), (int)105);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eazl", eaqo(int ), (int)106);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eazm", eaqo(int ), (int)107);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ebaz() {
        ed$Snapshot.eaqq[100] = -1776909809;
        ed$Snapshot.eaqq[101] = -1415847843;
        ed$Snapshot.eaqq[102] = -763931064;
        ed$Snapshot.eaqq[103] = 37848375;
        ed$Snapshot.eaqq[104] = 2079896476;
        ed$Snapshot.eaqq[105] = 1900820200;
        ed$Snapshot.eaqq[106] = -81009833;
        ed$Snapshot.eaqq[107] = -1728392179;
        ed$Snapshot.eaqq[108] = 1525572007;
        ed$Snapshot.eaqq[109] = 1931517718;
        ed$Snapshot.eaqq[110] = -1487164006;
        ed$Snapshot.eaqq[111] = 621522993;
        ed$Snapshot.eaqq[112] = 1400909585;
        ed$Snapshot.eaqq[113] = 1756340841;
        ed$Snapshot.eaqq[114] = -1398226150;
        ed$Snapshot.eaqq[115] = -1508606380;
        ed$Snapshot.eaqq[116] = 2031367943;
        ed$Snapshot.eaqq[117] = -1040017625;
        ed$Snapshot.eaqq[118] = -856194477;
        ed$Snapshot.eaqq[119] = 1455167126;
        ed$Snapshot.eaqq[120] = -1316436821;
        ed$Snapshot.eaqq[121] = -200321316;
        ed$Snapshot.eaqq[122] = -1306659183;
        ed$Snapshot.eaqq[123] = -532547905;
        ed$Snapshot.eaqq[124] = -263838962;
        ed$Snapshot.eaqq[125] = 1023544554;
        ed$Snapshot.eaqq[126] = -782856374;
        ed$Snapshot.eaqq[127] = 762841634;
        ed$Snapshot.eaqq[128] = 1662953688;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long position() {
        v0 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ed$Snapshot.eaqr("eaye", eaqx(int ), (int)93));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2057353668: {
                    break block23;
                }
                case 396381966: {
                    v1 = ed$Snapshot.eaqr("eayf", eaqx(int ), (int)94);
                    continue block23;
                }
                case 1360995691: {
                    v1 = ed$Snapshot.eaqr("eayg", eaqx(int ), (int)95);
                    continue block23;
                }
                case 2129680358: {
                    v1 = ed$Snapshot.eaqr("eayh", eaqx(int ), (int)96);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = ed$Snapshot.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eayi", eaqx(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ed$Snapshot.eaqr("eayj", eaqo(int ), (int)98)) break;
            v2 /* !! */  = (long)ed$Snapshot.eaqr("eayk", eaqo(int ), (int)99);
        }
        var2_2 /* !! */  = ed$Snapshot.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl32
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - ed$Snapshot.eaqr("eayl", eaqx(int ), (int)98));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2057353668: {
                            break block25;
                        }
                        case -1206936668: {
                            v4 = ed$Snapshot.eaqr("eaym", eaqx(int ), (int)99);
                            continue block25;
                        }
                        case -872717245: {
                            v4 = ed$Snapshot.eaqr("eayn", eaqx(int ), (int)100);
                            continue block25;
                        }
                        case -286287567: {
                            v4 = ed$Snapshot.eaqr("eayo", eaqx(int ), (int)101);
                            continue block25;
                        }
                    }
                    break;
                }
                var1_3 = ed$Snapshot.a;
                if (var3_1) {
                    throw null;
                    return (long)ed$Snapshot.eaqr("eayp", eaqx(int ), (int)102);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ed$Snapshot.eaqr("eayq", eaqx(int ), (int)103));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2057353668: {
                            break block27;
                        }
                        case 371765541: {
                            v6 = ed$Snapshot.eaqr("eayr", eaqx(int ), (int)104);
                            continue block27;
                        }
                        case 558628735: {
                            v6 = ed$Snapshot.eaqr("eays", eaqx(int ), (int)105);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.position;
            }
            case 0: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eayt", eaqo(int ), (int)100);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eayu", eaqo(int ), (int)101);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eayv", eaqo(int ), (int)102);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eayw", eaqo(int ), (int)103);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int eaqo(int n2) {
        return eaqp[n2] ^ eaqq[n2];
    }

    private static /* synthetic */ void ebay() {
        ed$Snapshot.eaqq[0] = 1816206401;
        ed$Snapshot.eaqq[1] = -1899646921;
        ed$Snapshot.eaqq[2] = 1385266991;
        ed$Snapshot.eaqq[3] = 1926348304;
        ed$Snapshot.eaqq[4] = -262938476;
        ed$Snapshot.eaqq[5] = 1014113530;
        ed$Snapshot.eaqq[6] = 559083726;
        ed$Snapshot.eaqq[7] = 1428226901;
        ed$Snapshot.eaqq[8] = -1182705081;
        ed$Snapshot.eaqq[9] = 1263743164;
        ed$Snapshot.eaqq[10] = 675839765;
        ed$Snapshot.eaqq[11] = 886428662;
        ed$Snapshot.eaqq[12] = 848806809;
        ed$Snapshot.eaqq[13] = -1788048360;
        ed$Snapshot.eaqq[14] = -413475792;
        ed$Snapshot.eaqq[15] = -828861035;
        ed$Snapshot.eaqq[16] = 1825027941;
        ed$Snapshot.eaqq[17] = -972489963;
        ed$Snapshot.eaqq[18] = -42268867;
        ed$Snapshot.eaqq[19] = 1333628458;
        ed$Snapshot.eaqq[20] = 360776254;
        ed$Snapshot.eaqq[21] = -376351467;
        ed$Snapshot.eaqq[22] = 301862611;
        ed$Snapshot.eaqq[23] = 313659646;
        ed$Snapshot.eaqq[24] = 1100505013;
        ed$Snapshot.eaqq[25] = 423089397;
        ed$Snapshot.eaqq[26] = 1000162492;
        ed$Snapshot.eaqq[27] = 1823174609;
        ed$Snapshot.eaqq[28] = 1251959674;
        ed$Snapshot.eaqq[29] = 1975664726;
        ed$Snapshot.eaqq[30] = 1571771464;
        ed$Snapshot.eaqq[31] = 1955930258;
        ed$Snapshot.eaqq[32] = 1725084260;
        ed$Snapshot.eaqq[33] = -1253488392;
        ed$Snapshot.eaqq[34] = 199100115;
        ed$Snapshot.eaqq[35] = 500306051;
        ed$Snapshot.eaqq[36] = 2053090684;
        ed$Snapshot.eaqq[37] = 1434689808;
        ed$Snapshot.eaqq[38] = -931182319;
        ed$Snapshot.eaqq[39] = 14238247;
        ed$Snapshot.eaqq[40] = 1250171953;
        ed$Snapshot.eaqq[41] = 1306516235;
        ed$Snapshot.eaqq[42] = 63369395;
        ed$Snapshot.eaqq[43] = 597841823;
        ed$Snapshot.eaqq[44] = -1319993327;
        ed$Snapshot.eaqq[45] = 1961006368;
        ed$Snapshot.eaqq[46] = -986816395;
        ed$Snapshot.eaqq[47] = -897165044;
        ed$Snapshot.eaqq[48] = 420622991;
        ed$Snapshot.eaqq[49] = 804172846;
        ed$Snapshot.eaqq[50] = 172076964;
        ed$Snapshot.eaqq[51] = 828940372;
        ed$Snapshot.eaqq[52] = 10873659;
        ed$Snapshot.eaqq[53] = 228147666;
        ed$Snapshot.eaqq[54] = -1930118448;
        ed$Snapshot.eaqq[55] = 498192410;
        ed$Snapshot.eaqq[56] = -885131972;
        ed$Snapshot.eaqq[57] = -1547647856;
        ed$Snapshot.eaqq[58] = -1859115684;
        ed$Snapshot.eaqq[59] = 1947857742;
        ed$Snapshot.eaqq[60] = 1057577201;
        ed$Snapshot.eaqq[61] = -1906021854;
        ed$Snapshot.eaqq[62] = -1067018012;
        ed$Snapshot.eaqq[63] = -1424637752;
        ed$Snapshot.eaqq[64] = 502206806;
        ed$Snapshot.eaqq[65] = -258910969;
        ed$Snapshot.eaqq[66] = -1698816774;
        ed$Snapshot.eaqq[67] = 621217102;
        ed$Snapshot.eaqq[68] = 2143417161;
        ed$Snapshot.eaqq[69] = 186757299;
        ed$Snapshot.eaqq[70] = -993153957;
        ed$Snapshot.eaqq[71] = -1339520251;
        ed$Snapshot.eaqq[72] = 1811952030;
        ed$Snapshot.eaqq[73] = -820505802;
        ed$Snapshot.eaqq[74] = 802177780;
        ed$Snapshot.eaqq[75] = -168208614;
        ed$Snapshot.eaqq[76] = -1184907869;
        ed$Snapshot.eaqq[77] = -1457922630;
        ed$Snapshot.eaqq[78] = -500338637;
        ed$Snapshot.eaqq[79] = 715196648;
        ed$Snapshot.eaqq[80] = -1383413423;
        ed$Snapshot.eaqq[81] = -136928703;
        ed$Snapshot.eaqq[82] = 686260852;
        ed$Snapshot.eaqq[83] = 1921095192;
        ed$Snapshot.eaqq[84] = 1152244165;
        ed$Snapshot.eaqq[85] = -933975783;
        ed$Snapshot.eaqq[86] = -1759629438;
        ed$Snapshot.eaqq[87] = -1092980916;
        ed$Snapshot.eaqq[88] = -1299744692;
        ed$Snapshot.eaqq[89] = -1903592910;
        ed$Snapshot.eaqq[90] = 888212675;
        ed$Snapshot.eaqq[91] = -8698326;
        ed$Snapshot.eaqq[92] = -611022161;
        ed$Snapshot.eaqq[93] = -1204071507;
        ed$Snapshot.eaqq[94] = 695733093;
        ed$Snapshot.eaqq[95] = 476538948;
        ed$Snapshot.eaqq[96] = 1719212174;
        ed$Snapshot.eaqq[97] = -277690875;
        ed$Snapshot.eaqq[98] = 1831379157;
        ed$Snapshot.eaqq[99] = 142020574;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eawh", eaqx(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ed$Snapshot.eaqr("eawi", eaqo(int ), (int)71)) break;
            v0 /* !! */  = (long)ed$Snapshot.eaqr("eawj", eaqo(int ), (int)72);
        }
        var4_2 = ed$Snapshot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("eawk", eaqx(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ed$Snapshot.eaqr("eawl", eaqo(int ), (int)73)) break;
            v1 /* !! */  = (long)ed$Snapshot.eaqr("eawm", eaqo(int ), (int)74);
        }
        var3_3 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("eawn", eaqx(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ed$Snapshot.eaqr("eawo", eaqo(int ), (int)75)) break;
            v2 /* !! */  = (long)ed$Snapshot.eaqr("eawp", eaqo(int ), (int)76);
        }
        var2_4 = ed$Snapshot.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return (boolean)ed$Snapshot.eaqr("eawq", eaqo(int ), (int)77);
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ed$Snapshot.kg - ed$Snapshot.eaqr("eawr", eaqx(int ), (int)74)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ed$Snapshot.eaqr("eaws", eaqo(int ), (int)78)) break;
                    v3 /* !! */  = (long)ed$Snapshot.eaqr("eawt", eaqo(int ), (int)79);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ed$Snapshot.class, "title;artist;position;duration;playing;sampledAt", "title", "artist", "position", "duration", "playing", "sampledAt"}, this, var1_1);
            }
lbl38:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ed$Snapshot.eaqr("eawu", eaqo(int ), (int)80);
                } while (!var4_2);
                throw null;
            }
lbl43:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ed$Snapshot.eaqr("eawv", eaqo(int ), (int)81);
                    if (!var4_2) ** GOTO lbl38
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ed$Snapshot.eaqr("eaww", eaqo(int ), (int)82);
                if (!var4_2) ** GOTO lbl43
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ed$Snapshot.eaqr("eawx", eaqo(int ), (int)83);
        ** while (!var4_2)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String title() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eawy", eaqx(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ed$Snapshot.eaqr("eawz", eaqo(int ), (int)84)) break;
            v0 /* !! */  = (long)ed$Snapshot.eaqr("eaxa", eaqo(int ), (int)85);
        }
        var3_1 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - ed$Snapshot.eaqr("eaxb", eaqx(int ), (int)76));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block18;
                }
                case 1126745472: {
                    v2 = ed$Snapshot.eaqr("eaxc", eaqx(int ), (int)77);
                    continue block18;
                }
                case 1373094825: {
                    v2 = ed$Snapshot.eaqr("eaxd", eaqx(int ), (int)78);
                    continue block18;
                }
                case 1801462869: {
                    v2 = ed$Snapshot.eaqr("eaxe", eaqx(int ), (int)79);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("eaxf", eaqx(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ed$Snapshot.eaqr("eaxg", eaqo(int ), (int)86)) break;
            v3 /* !! */  = (long)ed$Snapshot.eaqr("eaxh", eaqo(int ), (int)87);
        }
        var1_3 = ed$Snapshot.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ed$Snapshot.eaqr("eaxi", eaqx(int ), (int)81));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2057353668: {
                            break block21;
                        }
                        case -267104362: {
                            v5 = ed$Snapshot.eaqr("eaxj", eaqx(int ), (int)82);
                            continue block21;
                        }
                        case 827155967: {
                            v5 = ed$Snapshot.eaqr("eaxk", eaqx(int ), (int)83);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.title;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eaxl", eaqo(int ), (int)88);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eaxm", eaqo(int ), (int)89);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eaxn", eaqo(int ), (int)90);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eaxo", eaqo(int ), (int)91);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long eaqx(int n2) {
        return eaqy[n2] ^ eaqz[n2];
    }

    private static /* synthetic */ void ebax() {
        ed$Snapshot.eaqp[100] = -1776909812;
        ed$Snapshot.eaqp[101] = -1415847843;
        ed$Snapshot.eaqp[102] = -763931062;
        ed$Snapshot.eaqp[103] = 37848373;
        ed$Snapshot.eaqp[104] = 2079896479;
        ed$Snapshot.eaqp[105] = 1900820203;
        ed$Snapshot.eaqp[106] = -81009834;
        ed$Snapshot.eaqp[107] = -1728392178;
        ed$Snapshot.eaqp[108] = 1525572006;
        ed$Snapshot.eaqp[109] = -258889822;
        ed$Snapshot.eaqp[110] = 1487164005;
        ed$Snapshot.eaqp[111] = -115614016;
        ed$Snapshot.eaqp[112] = 1400909585;
        ed$Snapshot.eaqp[113] = 1756340840;
        ed$Snapshot.eaqp[114] = 1785668370;
        ed$Snapshot.eaqp[115] = -1508606378;
        ed$Snapshot.eaqp[116] = 2031367940;
        ed$Snapshot.eaqp[117] = -1040017626;
        ed$Snapshot.eaqp[118] = -856194478;
        ed$Snapshot.eaqp[119] = 1455167127;
        ed$Snapshot.eaqp[120] = -1791633811;
        ed$Snapshot.eaqp[121] = -200321315;
        ed$Snapshot.eaqp[122] = -1705097004;
        ed$Snapshot.eaqp[123] = -532547906;
        ed$Snapshot.eaqp[124] = -1607500338;
        ed$Snapshot.eaqp[125] = 1023544555;
        ed$Snapshot.eaqp[126] = -782856375;
        ed$Snapshot.eaqp[127] = 762841632;
        ed$Snapshot.eaqp[128] = 1662953690;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean playing() {
        v0 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ed$Snapshot.eaqr("eazn", eaqx(int ), (int)118));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2127766161: {
                    v1 = ed$Snapshot.eaqr("eazo", eaqx(int ), (int)119);
                    continue block12;
                }
                case -2057353668: {
                    break block12;
                }
                case 295577781: {
                    v1 = ed$Snapshot.eaqr("eazp", eaqx(int ), (int)120);
                    continue block12;
                }
                case 1757517614: {
                    v1 = ed$Snapshot.eaqr("eazq", eaqx(int ), (int)121);
                    continue block12;
                }
            }
            break;
        }
        var3_1 = ed$Snapshot.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eazr", eaqx(int ), (int)122)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ed$Snapshot.eaqr("eazs", eaqo(int ), (int)108)) break;
            v2 /* !! */  = (long)ed$Snapshot.eaqr("eazt", eaqo(int ), (int)109);
        }
        var2_2 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("eazu", eaqx(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ed$Snapshot.eaqr("eazv", eaqo(int ), (int)110)) break;
            v3 /* !! */  = (long)ed$Snapshot.eaqr("eazw", eaqo(int ), (int)111);
        }
        var1_3 = ed$Snapshot.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)ed$Snapshot.eaqr("eazx", eaqo(int ), (int)112);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("eazy", eaqx(int ), (int)124)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ed$Snapshot.eaqr("eazz", eaqo(int ), (int)113)) break;
                    v4 /* !! */  = (long)ed$Snapshot.eaqr("ebaa", eaqo(int ), (int)114);
                }
                return this.playing;
            }
            case 0: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebab", eaqo(int ), (int)115);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
            }
lbl52:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebac", eaqo(int ), (int)116);
                if (!var3_1) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebad", eaqo(int ), (int)117);
                    if (!var3_1) ** GOTO lbl52
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("ebae", eaqo(int ), (int)118);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ed$Snapshot(String var1_1, String var2_2, long var3_3, long var5_4, boolean var7_5, long var8_6) {
        var11_7 /* !! */  = ed$Snapshot.b;
        super();
        if (var11_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.title = var1_1;
                this.artist = var2_2;
                this.position = var3_3;
                this.duration = var5_4;
                this.playing = var7_5;
                this.sampledAt = var8_6;
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var11_7 /* !! */  = (int)ed$Snapshot.eaqr("eaqs", eaqo(int ), (int)0);
            }
            case 1: {
                var11_7 /* !! */  = (int)ed$Snapshot.eaqr("eaqt", eaqo(int ), (int)1);
                break;
            }
lbl18:
            // 2 sources

            case 2: {
                var11_7 /* !! */  = (int)ed$Snapshot.eaqr("eaqu", eaqo(int ), (int)2);
                ** GOTO lbl13
            }
            case 3: {
                var11_7 /* !! */  = (int)ed$Snapshot.eaqr("eaqv", eaqo(int ), (int)3);
                ** GOTO lbl18
            }
            case 4: 
        }
        while (true) {
            var11_7 /* !! */  = (int)ed$Snapshot.eaqr("eaqw", eaqo(int ), (int)4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static ed$Snapshot empty() {
        v0 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(ed$Snapshot.eaqr("earb", eaqx(int ), (int)1) - ed$Snapshot.eaqr("eara", eaqx(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2057353668: {
                    break block22;
                }
                case 1358665778: {
                    continue block22;
                }
            }
            break;
        }
        var2 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - ed$Snapshot.eaqr("earc", eaqx(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block23;
                }
                case -1268732117: {
                    v2 = ed$Snapshot.eaqr("eard", eaqx(int ), (int)3);
                    continue block23;
                }
                case -988925578: {
                    v2 = ed$Snapshot.eaqr("eare", eaqx(int ), (int)4);
                    continue block23;
                }
                case -969172981: {
                    v2 = ed$Snapshot.eaqr("earf", eaqx(int ), (int)5);
                    continue block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("earg", eaqx(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ed$Snapshot.eaqr("earh", eaqo(int ), (int)5)) break;
            v3 /* !! */  = (long)ed$Snapshot.eaqr("eari", eaqo(int ), (int)6);
        }
        var0_2 = ed$Snapshot.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl46
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - ed$Snapshot.eaqr("earj", eaqx(int ), (int)7));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2057353668: {
                            break block26;
                        }
                        case -1195974779: {
                            v5 = ed$Snapshot.eaqr("eark", eaqx(int ), (int)8);
                            continue block26;
                        }
                        case 779019147: {
                            v5 = ed$Snapshot.eaqr("earl", eaqx(int ), (int)9);
                            continue block26;
                        }
                        case 1761612410: {
                            v5 = ed$Snapshot.eaqr("earm", eaqx(int ), (int)10);
                            continue block26;
                        }
                    }
                    break;
                }
                v6 = ed$Snapshot.eaqr("earn", eaqx(int ), (int)11);
                v7 = ed$Snapshot.eaqr("earo", eaqx(int ), (int)12);
                v8 = ed$Snapshot.eaqr("earp", eaqo(int ), (int)7);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("earq", eaqx(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ed$Snapshot.eaqr("earr", eaqo(int ), (int)8)) break;
                    v9 /* !! */  = (long)ed$Snapshot.eaqr("ears", eaqo(int ), (int)9);
                }
                v10 = System.currentTimeMillis();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("eart", eaqx(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ed$Snapshot.eaqr("earu", eaqo(int ), (int)10)) break;
                    v11 /* !! */  = (long)ed$Snapshot.eaqr("earv", eaqo(int ), (int)11);
                }
                return new ed$Snapshot("No media", "", (long)v6, (long)v7, (boolean)v8, v10);
            }
lbl73:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)ed$Snapshot.eaqr("earw", eaqo(int ), (int)12);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)ed$Snapshot.eaqr("earx", eaqo(int ), (int)13);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ed$Snapshot.eaqr("eary", eaqo(int ), (int)14);
                if (!var2) ** GOTO lbl73
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ed$Snapshot.eaqr("earz", eaqo(int ), (int)15);
        ** while (!var2)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ebbd() {
        ed$Snapshot.eaqz[100] = 1903241256057711665L;
        ed$Snapshot.eaqz[101] = 1549164387263254636L;
        ed$Snapshot.eaqz[102] = 8319274377803587431L;
        ed$Snapshot.eaqz[103] = -4707302280142318986L;
        ed$Snapshot.eaqz[104] = 600915499204209057L;
        ed$Snapshot.eaqz[105] = -2924226333327515839L;
        ed$Snapshot.eaqz[106] = -4254667045094161180L;
        ed$Snapshot.eaqz[107] = -6673318860828979208L;
        ed$Snapshot.eaqz[108] = -2138499700960136841L;
        ed$Snapshot.eaqz[109] = 4483326023342152372L;
        ed$Snapshot.eaqz[110] = 7411152181274371528L;
        ed$Snapshot.eaqz[111] = 1539786093190296509L;
        ed$Snapshot.eaqz[112] = 3213276025904752299L;
        ed$Snapshot.eaqz[113] = -8267612515400571561L;
        ed$Snapshot.eaqz[114] = 5807325394757297421L;
        ed$Snapshot.eaqz[115] = 1898434080515094482L;
        ed$Snapshot.eaqz[116] = 2000644709098676260L;
        ed$Snapshot.eaqz[117] = 7029563829065040090L;
        ed$Snapshot.eaqz[118] = 1749741121679105217L;
        ed$Snapshot.eaqz[119] = -4152397682595321650L;
        ed$Snapshot.eaqz[120] = -5853648906689190527L;
        ed$Snapshot.eaqz[121] = 6281924607206312280L;
        ed$Snapshot.eaqz[122] = 9153979993816636563L;
        ed$Snapshot.eaqz[123] = 2267197942157417333L;
        ed$Snapshot.eaqz[124] = -6195805869423459734L;
        ed$Snapshot.eaqz[125] = -4272601953149835763L;
        ed$Snapshot.eaqz[126] = 4404015565082305991L;
        ed$Snapshot.eaqz[127] = -3001269666893851099L;
        ed$Snapshot.eaqz[128] = 8293644121356388057L;
        ed$Snapshot.eaqz[129] = 2058411333016495237L;
        ed$Snapshot.eaqz[130] = 6513494907185395947L;
        ed$Snapshot.eaqz[131] = 1119553022202196866L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    long visualPosition(long var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eath", eaqx(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ed$Snapshot.eaqr("eati", eaqo(int ), (int)36)) break;
            v0 /* !! */  = (long)ed$Snapshot.eaqr("eatj", eaqo(int ), (int)37);
        }
        var7_2 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl12
        block43: while (true) {
            v1 /* !! */  = (long)(ed$Snapshot.eaqr("eatl", eaqx(int ), (int)30) - ed$Snapshot.eaqr("eatk", eaqx(int ), (int)29));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block43;
                }
                case -904452996: {
                    continue block43;
                }
            }
            break;
        }
        var6_3 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("eatm", eaqx(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ed$Snapshot.eaqr("eatn", eaqo(int ), (int)38)) break;
            v2 /* !! */  = (long)ed$Snapshot.eaqr("eato", eaqo(int ), (int)39);
        }
        var5_4 = ed$Snapshot.a;
        if (var7_2) {
            throw null;
lbl27:
            // 4 sources

            return (long)ed$Snapshot.eaqr("eatp", eaqx(int ), (int)32);
        }
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4 || var5_4) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("eatq", eaqx(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ed$Snapshot.eaqr("eatr", eaqo(int ), (int)40)) break;
                    v3 /* !! */  = (long)ed$Snapshot.eaqr("eats", eaqo(int ), (int)41);
                }
                if (!this.playing) ** GOTO lbl75
                if (var5_4) ** GOTO lbl27
                v4 = ed$Snapshot.eaqr("eatt", eaqx(int ), (int)34);
                v5 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl46
                block47: while (true) {
                    v5 /* !! */  = (long)(v6 - ed$Snapshot.eaqr("eatu", eaqx(int ), (int)35));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2057353668: {
                            break block47;
                        }
                        case 648800432: {
                            v6 = ed$Snapshot.eaqr("eatv", eaqx(int ), (int)36);
                            continue block47;
                        }
                        case 1000354841: {
                            v6 = ed$Snapshot.eaqr("eatw", eaqx(int ), (int)37);
                            continue block47;
                        }
                        case 1379224714: {
                            v6 = ed$Snapshot.eaqr("eatx", eaqx(int ), (int)38);
                            continue block47;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl62
                block48: while (true) {
                    v7 /* !! */  = (long)(v8 - ed$Snapshot.eaqr("eaty", eaqx(int ), (int)39));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2057353668: {
                            break block48;
                        }
                        case 471860757: {
                            v8 = ed$Snapshot.eaqr("eatz", eaqx(int ), (int)40);
                            continue block48;
                        }
                        case 1460080466: {
                            v8 = ed$Snapshot.eaqr("eaua", eaqx(int ), (int)41);
                            continue block48;
                        }
                    }
                    break;
                }
                v9 /* !! */  = (CallSite)(Math.max((long)v4, var1_1 - this.sampledAt) / ed$Snapshot.eaqr("eaub", eaqx(int ), (int)42));
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl77
lbl75:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl27
                v9 /* !! */  = var3_5 = ed$Snapshot.eaqr("eauc", eaqx(int ), (int)43);
lbl77:
                // 2 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                v10 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl83
                block49: while (true) {
                    v10 /* !! */  = (long)(ed$Snapshot.eaqr("eaue", eaqx(int ), (int)45) - ed$Snapshot.eaqr("eaud", eaqx(int ), (int)44));
lbl83:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2057353668: {
                            break block49;
                        }
                        case 1196036812: {
                            continue block49;
                        }
                    }
                    break;
                }
                v11 = ed$Snapshot.eaqr("eauf", eaqx(int ), (int)46);
                v12 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl93
                block50: while (true) {
                    v12 /* !! */  = (long)(v13 - ed$Snapshot.eaqr("eaug", eaqx(int ), (int)47));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2057353668: {
                            break block50;
                        }
                        case -1924456692: {
                            v13 = ed$Snapshot.eaqr("eauh", eaqx(int ), (int)48);
                            continue block50;
                        }
                        case 1997191610: {
                            v13 = ed$Snapshot.eaqr("eaui", eaqx(int ), (int)49);
                            continue block50;
                        }
                    }
                    break;
                }
                v14 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl106
                block51: while (true) {
                    v14 /* !! */  = (long)(v15 - ed$Snapshot.eaqr("eauj", eaqx(int ), (int)50));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2057353668: {
                            break block51;
                        }
                        case 3880182: {
                            v15 = ed$Snapshot.eaqr("eauk", eaqx(int ), (int)51);
                            continue block51;
                        }
                        case 434151030: {
                            v15 = ed$Snapshot.eaqr("eaul", eaqx(int ), (int)52);
                            continue block51;
                        }
                        case 1073860884: {
                            v15 = ed$Snapshot.eaqr("eaum", eaqx(int ), (int)53);
                            continue block51;
                        }
                    }
                    break;
                }
                v16 = Math.max((long)v11, this.position + var3_5);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ed$Snapshot.kg - ed$Snapshot.eaqr("eaun", eaqx(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 /* !! */  == ed$Snapshot.eaqr("eauo", eaqo(int ), (int)42)) break;
                    v17 /* !! */  = (long)ed$Snapshot.eaqr("eaup", eaqo(int ), (int)43);
                }
                return Math.min(this.duration, v16);
            }
            case 0: {
                do {
                    var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eauq", eaqo(int ), (int)44);
                } while (!var7_2);
                throw null;
            }
            case 1: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eaur", eaqo(int ), (int)45);
                if (var7_2) {
                    throw null;
                }
            }
            case 2: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eaus", eaqo(int ), (int)46);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 3: {
                do {
                    var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eaut", eaqo(int ), (int)47);
                } while (!var7_2);
                throw null;
            }
lbl145:
            // 3 sources

            case 4: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eauu", eaqo(int ), (int)48);
                if (!var7_2) break;
                throw null;
            }
lbl149:
            // 3 sources

            case 5: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eauv", eaqo(int ), (int)49);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 6: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eauw", eaqo(int ), (int)50);
                if (!var7_2) ** GOTO lbl149
                throw null;
            }
lbl158:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eaux", eaqo(int ), (int)51);
                if (!var7_2) ** GOTO lbl145
                throw null;
            }
            case 8: {
                var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eauy", eaqo(int ), (int)52);
                if (!var7_2) ** GOTO lbl145
                throw null;
            }
            case 9: 
        }
        do {
            var6_3 /* !! */  = (int)ed$Snapshot.eaqr("eauz", eaqo(int ), (int)53);
        } while (!var7_2);
        throw null;
    }

    private static /* synthetic */ void ebbc() {
        ed$Snapshot.eaqz[0] = 5517930785097544979L;
        ed$Snapshot.eaqz[1] = 2739281230921806560L;
        ed$Snapshot.eaqz[2] = -71225395019414992L;
        ed$Snapshot.eaqz[3] = 8531712998588424421L;
        ed$Snapshot.eaqz[4] = 6363320137709273761L;
        ed$Snapshot.eaqz[5] = 8840597262167850644L;
        ed$Snapshot.eaqz[6] = 2982730503800700619L;
        ed$Snapshot.eaqz[7] = 8552739084754697666L;
        ed$Snapshot.eaqz[8] = -1026481310030749582L;
        ed$Snapshot.eaqz[9] = 6912602218808400364L;
        ed$Snapshot.eaqz[10] = -2777724679632021098L;
        ed$Snapshot.eaqz[11] = -5616730194650448925L;
        ed$Snapshot.eaqz[12] = -3109543681250780397L;
        ed$Snapshot.eaqz[13] = -3628459155388105226L;
        ed$Snapshot.eaqz[14] = 5019692605242794282L;
        ed$Snapshot.eaqz[15] = 1446405663651681828L;
        ed$Snapshot.eaqz[16] = 4616725738984685782L;
        ed$Snapshot.eaqz[17] = 5749181022226153328L;
        ed$Snapshot.eaqz[18] = 8035761330478413680L;
        ed$Snapshot.eaqz[19] = -7961371542639247741L;
        ed$Snapshot.eaqz[20] = -8170112086692267843L;
        ed$Snapshot.eaqz[21] = 110562579536113156L;
        ed$Snapshot.eaqz[22] = -6502625295758424265L;
        ed$Snapshot.eaqz[23] = 2924377546683728550L;
        ed$Snapshot.eaqz[24] = -2123775969232612469L;
        ed$Snapshot.eaqz[25] = 2184215432389193095L;
        ed$Snapshot.eaqz[26] = -5535954481287342715L;
        ed$Snapshot.eaqz[27] = -9118871501988920997L;
        ed$Snapshot.eaqz[28] = 5383110062188665435L;
        ed$Snapshot.eaqz[29] = -2883073927138024803L;
        ed$Snapshot.eaqz[30] = 6440623545304733139L;
        ed$Snapshot.eaqz[31] = -4719415611352409880L;
        ed$Snapshot.eaqz[32] = 1192670536136636202L;
        ed$Snapshot.eaqz[33] = -8006900889444434948L;
        ed$Snapshot.eaqz[34] = -2240170439877269526L;
        ed$Snapshot.eaqz[35] = 2888214332643901980L;
        ed$Snapshot.eaqz[36] = 6397157654979736199L;
        ed$Snapshot.eaqz[37] = -824337588639017653L;
        ed$Snapshot.eaqz[38] = 7089097997827771133L;
        ed$Snapshot.eaqz[39] = -1290764960111937633L;
        ed$Snapshot.eaqz[40] = 1326461147360948950L;
        ed$Snapshot.eaqz[41] = -4544519718356087776L;
        ed$Snapshot.eaqz[42] = -7854356011777378535L;
        ed$Snapshot.eaqz[43] = -9140947430052468970L;
        ed$Snapshot.eaqz[44] = -2021346586588158309L;
        ed$Snapshot.eaqz[45] = 1264110281595559542L;
        ed$Snapshot.eaqz[46] = 9182736955842156942L;
        ed$Snapshot.eaqz[47] = -3469903292878754407L;
        ed$Snapshot.eaqz[48] = -4692518617481028003L;
        ed$Snapshot.eaqz[49] = 2503846874936942639L;
        ed$Snapshot.eaqz[50] = 2884428927160967100L;
        ed$Snapshot.eaqz[51] = 2909283815939012722L;
        ed$Snapshot.eaqz[52] = -5682940769689708550L;
        ed$Snapshot.eaqz[53] = 418501880716117150L;
        ed$Snapshot.eaqz[54] = -8505230137735404135L;
        ed$Snapshot.eaqz[55] = -930520647147188426L;
        ed$Snapshot.eaqz[56] = -1869438152418287754L;
        ed$Snapshot.eaqz[57] = 3416498106563422953L;
        ed$Snapshot.eaqz[58] = -4681137070745577523L;
        ed$Snapshot.eaqz[59] = -5005225457775683571L;
        ed$Snapshot.eaqz[60] = -2683849744690734048L;
        ed$Snapshot.eaqz[61] = -3222132579976508171L;
        ed$Snapshot.eaqz[62] = -6385652866972734266L;
        ed$Snapshot.eaqz[63] = 4107741608189792310L;
        ed$Snapshot.eaqz[64] = -1781646428532192131L;
        ed$Snapshot.eaqz[65] = -9089770648005315102L;
        ed$Snapshot.eaqz[66] = -6248138462719253554L;
        ed$Snapshot.eaqz[67] = -4755694329157143885L;
        ed$Snapshot.eaqz[68] = 5150044314298722280L;
        ed$Snapshot.eaqz[69] = 1233326099856456908L;
        ed$Snapshot.eaqz[70] = -6589167827517302937L;
        ed$Snapshot.eaqz[71] = -7026423592247055381L;
        ed$Snapshot.eaqz[72] = 5062297005893035492L;
        ed$Snapshot.eaqz[73] = 8923784768641199965L;
        ed$Snapshot.eaqz[74] = -8063564745094503118L;
        ed$Snapshot.eaqz[75] = 246403236907672608L;
        ed$Snapshot.eaqz[76] = 256289413811594702L;
        ed$Snapshot.eaqz[77] = 7448951110613663780L;
        ed$Snapshot.eaqz[78] = 2868364877589571787L;
        ed$Snapshot.eaqz[79] = 3406480665962702673L;
        ed$Snapshot.eaqz[80] = -4213940473728493659L;
        ed$Snapshot.eaqz[81] = 3499328913211686354L;
        ed$Snapshot.eaqz[82] = -3634806270623982776L;
        ed$Snapshot.eaqz[83] = 7730687681144203456L;
        ed$Snapshot.eaqz[84] = 9103769103651856170L;
        ed$Snapshot.eaqz[85] = -8969899427901952722L;
        ed$Snapshot.eaqz[86] = -2628872634933562469L;
        ed$Snapshot.eaqz[87] = 1012628544551938584L;
        ed$Snapshot.eaqz[88] = 257261183498337037L;
        ed$Snapshot.eaqz[89] = -7442964561207817014L;
        ed$Snapshot.eaqz[90] = -6602544899905843906L;
        ed$Snapshot.eaqz[91] = 3451066898774669990L;
        ed$Snapshot.eaqz[92] = -4565834701844195305L;
        ed$Snapshot.eaqz[93] = -1878273908500410018L;
        ed$Snapshot.eaqz[94] = 6116812036738660626L;
        ed$Snapshot.eaqz[95] = 3032483609676315663L;
        ed$Snapshot.eaqz[96] = -80436633773104333L;
        ed$Snapshot.eaqz[97] = -7160452755622446276L;
        ed$Snapshot.eaqz[98] = -1611126014200191918L;
        ed$Snapshot.eaqz[99] = -6724959625871772960L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(ed$Snapshot.eaqr("eavs", eaqx(int ), (int)63) - ed$Snapshot.eaqr("eavr", eaqx(int ), (int)62));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2057353668: {
                    break block20;
                }
                case 1761489765: {
                    continue block20;
                }
            }
            break;
        }
        var3_1 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - ed$Snapshot.eaqr("eavt", eaqx(int ), (int)64));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block21;
                }
                case -1693109319: {
                    v2 = ed$Snapshot.eaqr("eavu", eaqx(int ), (int)65);
                    continue block21;
                }
                case 531957466: {
                    v2 = ed$Snapshot.eaqr("eavv", eaqx(int ), (int)66);
                    continue block21;
                }
                case 829342532: {
                    v2 = ed$Snapshot.eaqr("eavw", eaqx(int ), (int)67);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ed$Snapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eavx", eaqx(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ed$Snapshot.eaqr("eavy", eaqo(int ), (int)64)) break;
            v3 /* !! */  = (long)ed$Snapshot.eaqr("eavz", eaqo(int ), (int)65);
        }
        var1_3 = ed$Snapshot.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return (int)ed$Snapshot.eaqr("eawa", eaqo(int ), (int)66);
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ed$Snapshot.kg;
                if (true) ** GOTO lbl47
                block24: while (true) {
                    v4 /* !! */  = (long)(ed$Snapshot.eaqr("eawc", eaqx(int ), (int)70) - ed$Snapshot.eaqr("eawb", eaqx(int ), (int)69));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2057353668: {
                            break block24;
                        }
                        case -1880379640: {
                            continue block24;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ed$Snapshot.class, "title;artist;position;duration;playing;sampledAt", "title", "artist", "position", "duration", "playing", "sampledAt"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eawd", eaqo(int ), (int)67);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl63
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eawe", eaqo(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
            }
lbl63:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eawf", eaqo(int ), (int)69);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eawg", eaqo(int ), (int)70);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String artist() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("eaxp", eaqx(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ed$Snapshot.eaqr("eaxq", eaqo(int ), (int)92)) break;
            v0 /* !! */  = (long)ed$Snapshot.eaqr("eaxr", eaqo(int ), (int)93);
        }
        var3_1 = ed$Snapshot.c;
        v1 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - ed$Snapshot.eaqr("eaxs", eaqx(int ), (int)85));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2057353668: {
                    break block15;
                }
                case -1699076826: {
                    v2 = ed$Snapshot.eaqr("eaxt", eaqx(int ), (int)86);
                    continue block15;
                }
                case -429888522: {
                    v2 = ed$Snapshot.eaqr("eaxu", eaqx(int ), (int)87);
                    continue block15;
                }
            }
            break;
        }
        var2_2 = ed$Snapshot.b;
        v3 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl26
        block16: while (true) {
            v3 /* !! */  = (long)(v4 - ed$Snapshot.eaqr("eaxv", eaqx(int ), (int)88));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2057353668: {
                    break block16;
                }
                case 947340259: {
                    v4 = ed$Snapshot.eaqr("eaxw", eaqx(int ), (int)89);
                    continue block16;
                }
                case 1492372975: {
                    v4 = ed$Snapshot.eaqr("eaxx", eaqx(int ), (int)90);
                    continue block16;
                }
            }
            break;
        }
        var1_3 = ed$Snapshot.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        v5 /* !! */  = ed$Snapshot.kg;
        if (true) ** GOTO lbl45
        block18: while (true) {
            v5 /* !! */  = (long)(ed$Snapshot.eaqr("eaxz", eaqx(int ), (int)92) - ed$Snapshot.eaqr("eaxy", eaqx(int ), (int)91));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2057353668: {
                    break block18;
                }
                case 38294245: {
                    continue block18;
                }
            }
            break;
        }
        return this.artist;
    }

    private static /* synthetic */ void ebbb() {
        ed$Snapshot.eaqy[100] = 3033700423823615679L;
        ed$Snapshot.eaqy[101] = -185211236451178483L;
        ed$Snapshot.eaqy[102] = -4823479158708199604L;
        ed$Snapshot.eaqy[103] = 6880613098517496310L;
        ed$Snapshot.eaqy[104] = -8793346496366023969L;
        ed$Snapshot.eaqy[105] = -5227873705966142645L;
        ed$Snapshot.eaqy[106] = -5485738951822935449L;
        ed$Snapshot.eaqy[107] = -4484657010183874528L;
        ed$Snapshot.eaqy[108] = -8988411514499878935L;
        ed$Snapshot.eaqy[109] = -1852941575572276528L;
        ed$Snapshot.eaqy[110] = 3836278120282657903L;
        ed$Snapshot.eaqy[111] = -7622372716846166058L;
        ed$Snapshot.eaqy[112] = 6511381408873743556L;
        ed$Snapshot.eaqy[113] = -9198257214091657274L;
        ed$Snapshot.eaqy[114] = -1373070091969369594L;
        ed$Snapshot.eaqy[115] = -687556720959066909L;
        ed$Snapshot.eaqy[116] = 5568057563167119029L;
        ed$Snapshot.eaqy[117] = 2669388801024160925L;
        ed$Snapshot.eaqy[118] = -6707836954887815610L;
        ed$Snapshot.eaqy[119] = -5733410289576157426L;
        ed$Snapshot.eaqy[120] = 3005765004511882239L;
        ed$Snapshot.eaqy[121] = -4752829759382601734L;
        ed$Snapshot.eaqy[122] = 8341186952353503557L;
        ed$Snapshot.eaqy[123] = 6990547656048567483L;
        ed$Snapshot.eaqy[124] = 4697010690017480515L;
        ed$Snapshot.eaqy[125] = 3214887878124797266L;
        ed$Snapshot.eaqy[126] = -8826663296573206246L;
        ed$Snapshot.eaqy[127] = -5394616020492452293L;
        ed$Snapshot.eaqy[128] = -2685005599986381592L;
        ed$Snapshot.eaqy[129] = -5652615136217163305L;
        ed$Snapshot.eaqy[130] = 5753362472284421264L;
        ed$Snapshot.eaqy[131] = -8905163445492050772L;
    }

    static {
        eaqp = new int[129];
        eaqq = new int[129];
        ed$Snapshot.ebaw();
        ed$Snapshot.ebax();
        ed$Snapshot.ebay();
        ed$Snapshot.ebaz();
        eaqy = new long[132];
        eaqz = new long[132];
        ed$Snapshot.ebba();
        ed$Snapshot.ebbb();
        ed$Snapshot.ebbc();
        ed$Snapshot.ebbd();
    }

    private static /* synthetic */ void ebaw() {
        ed$Snapshot.eaqp[0] = 1816206401;
        ed$Snapshot.eaqp[1] = -1899646921;
        ed$Snapshot.eaqp[2] = 1385266991;
        ed$Snapshot.eaqp[3] = 1926348304;
        ed$Snapshot.eaqp[4] = -262938476;
        ed$Snapshot.eaqp[5] = 1014113531;
        ed$Snapshot.eaqp[6] = 423734200;
        ed$Snapshot.eaqp[7] = 1428226901;
        ed$Snapshot.eaqp[8] = 1182705080;
        ed$Snapshot.eaqp[9] = -1350598557;
        ed$Snapshot.eaqp[10] = -675839766;
        ed$Snapshot.eaqp[11] = -365658967;
        ed$Snapshot.eaqp[12] = 848806808;
        ed$Snapshot.eaqp[13] = -1788048360;
        ed$Snapshot.eaqp[14] = -413475791;
        ed$Snapshot.eaqp[15] = -828861033;
        ed$Snapshot.eaqp[16] = -1825027942;
        ed$Snapshot.eaqp[17] = -1363764364;
        ed$Snapshot.eaqp[18] = -42268867;
        ed$Snapshot.eaqp[19] = 1333628459;
        ed$Snapshot.eaqp[20] = 1677940212;
        ed$Snapshot.eaqp[21] = -376351468;
        ed$Snapshot.eaqp[22] = -2028097536;
        ed$Snapshot.eaqp[23] = -313659647;
        ed$Snapshot.eaqp[24] = -771515873;
        ed$Snapshot.eaqp[25] = 423089396;
        ed$Snapshot.eaqp[26] = 1000162492;
        ed$Snapshot.eaqp[27] = 1823174608;
        ed$Snapshot.eaqp[28] = 1251959675;
        ed$Snapshot.eaqp[29] = 1975664723;
        ed$Snapshot.eaqp[30] = 1571771465;
        ed$Snapshot.eaqp[31] = 1955930256;
        ed$Snapshot.eaqp[32] = 1725084259;
        ed$Snapshot.eaqp[33] = -1253488387;
        ed$Snapshot.eaqp[34] = 199100112;
        ed$Snapshot.eaqp[35] = 500306049;
        ed$Snapshot.eaqp[36] = 2053090685;
        ed$Snapshot.eaqp[37] = -2009770192;
        ed$Snapshot.eaqp[38] = 931182318;
        ed$Snapshot.eaqp[39] = -968157252;
        ed$Snapshot.eaqp[40] = 1250171952;
        ed$Snapshot.eaqp[41] = -374993215;
        ed$Snapshot.eaqp[42] = 63369394;
        ed$Snapshot.eaqp[43] = -1315183856;
        ed$Snapshot.eaqp[44] = -1319993328;
        ed$Snapshot.eaqp[45] = 1961006375;
        ed$Snapshot.eaqp[46] = -986816400;
        ed$Snapshot.eaqp[47] = -897165045;
        ed$Snapshot.eaqp[48] = 420622991;
        ed$Snapshot.eaqp[49] = 804172844;
        ed$Snapshot.eaqp[50] = 172076966;
        ed$Snapshot.eaqp[51] = 828940381;
        ed$Snapshot.eaqp[52] = 10873651;
        ed$Snapshot.eaqp[53] = 228147666;
        ed$Snapshot.eaqp[54] = 1930118447;
        ed$Snapshot.eaqp[55] = 341579118;
        ed$Snapshot.eaqp[56] = 885131971;
        ed$Snapshot.eaqp[57] = -1572250290;
        ed$Snapshot.eaqp[58] = -1859115683;
        ed$Snapshot.eaqp[59] = -1049959077;
        ed$Snapshot.eaqp[60] = 1057577200;
        ed$Snapshot.eaqp[61] = -1906021855;
        ed$Snapshot.eaqp[62] = -1067018010;
        ed$Snapshot.eaqp[63] = -1424637749;
        ed$Snapshot.eaqp[64] = -502206807;
        ed$Snapshot.eaqp[65] = -1461349557;
        ed$Snapshot.eaqp[66] = 429536107;
        ed$Snapshot.eaqp[67] = 621217100;
        ed$Snapshot.eaqp[68] = 2143417161;
        ed$Snapshot.eaqp[69] = 186757299;
        ed$Snapshot.eaqp[70] = -993153959;
        ed$Snapshot.eaqp[71] = 1339520250;
        ed$Snapshot.eaqp[72] = -1931953606;
        ed$Snapshot.eaqp[73] = 820505801;
        ed$Snapshot.eaqp[74] = -1390463517;
        ed$Snapshot.eaqp[75] = 168208613;
        ed$Snapshot.eaqp[76] = -751883293;
        ed$Snapshot.eaqp[77] = -1457922629;
        ed$Snapshot.eaqp[78] = -500338638;
        ed$Snapshot.eaqp[79] = 727171397;
        ed$Snapshot.eaqp[80] = -1383413424;
        ed$Snapshot.eaqp[81] = -136928704;
        ed$Snapshot.eaqp[82] = 686260855;
        ed$Snapshot.eaqp[83] = 1921095193;
        ed$Snapshot.eaqp[84] = -1152244166;
        ed$Snapshot.eaqp[85] = 1942448894;
        ed$Snapshot.eaqp[86] = 1759629437;
        ed$Snapshot.eaqp[87] = -769450414;
        ed$Snapshot.eaqp[88] = -1299744690;
        ed$Snapshot.eaqp[89] = -1903592910;
        ed$Snapshot.eaqp[90] = 888212672;
        ed$Snapshot.eaqp[91] = -8698326;
        ed$Snapshot.eaqp[92] = -611022162;
        ed$Snapshot.eaqp[93] = 401158125;
        ed$Snapshot.eaqp[94] = 695733093;
        ed$Snapshot.eaqp[95] = 476538948;
        ed$Snapshot.eaqp[96] = 1719212175;
        ed$Snapshot.eaqp[97] = -277690874;
        ed$Snapshot.eaqp[98] = -1831379158;
        ed$Snapshot.eaqp[99] = -1647757714;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean valid() {
        block46: {
            v0 /* !! */  = ed$Snapshot.kg;
            if (true) ** GOTO lbl5
            block26: while (true) {
                v0 /* !! */  = (long)(ed$Snapshot.eaqr("easb", eaqx(int ), (int)16) - ed$Snapshot.eaqr("easa", eaqx(int ), (int)15));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2057353668: {
                        break block26;
                    }
                    case -1656151804: {
                        continue block26;
                    }
                }
                break;
            }
            var3_1 = ed$Snapshot.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = ed$Snapshot.kg - ed$Snapshot.eaqr("easc", eaqx(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ed$Snapshot.eaqr("easd", eaqo(int ), (int)16)) break;
                v1 /* !! */  = (long)ed$Snapshot.eaqr("ease", eaqo(int ), (int)17);
            }
            var2_2 /* !! */  = ed$Snapshot.b;
            v2 /* !! */  = ed$Snapshot.kg;
            if (true) ** GOTO lbl22
            block28: while (true) {
                v2 /* !! */  = (long)(v3 - ed$Snapshot.eaqr("easf", eaqx(int ), (int)18));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2057353668: {
                        break block28;
                    }
                    case 1135159192: {
                        v3 = ed$Snapshot.eaqr("easg", eaqx(int ), (int)19);
                        continue block28;
                    }
                    case 1417257782: {
                        v3 = ed$Snapshot.eaqr("eash", eaqx(int ), (int)20);
                        continue block28;
                    }
                }
                break;
            }
            var1_3 = ed$Snapshot.a;
            if (var3_1) {
                throw null;
lbl34:
                // 5 sources

                return (boolean)ed$Snapshot.eaqr("easi", eaqo(int ), (int)18);
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ed$Snapshot.kg - ed$Snapshot.eaqr("easj", eaqx(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ed$Snapshot.eaqr("eask", eaqo(int ), (int)19)) break;
                v4 /* !! */  = (long)ed$Snapshot.eaqr("easl", eaqo(int ), (int)20);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = ed$Snapshot.kg - ed$Snapshot.eaqr("easm", eaqx(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ed$Snapshot.eaqr("easn", eaqo(int ), (int)21)) break;
                v5 /* !! */  = (long)ed$Snapshot.eaqr("easo", eaqo(int ), (int)22);
            }
            if (this.title.isBlank()) break block46;
            if (var1_3) ** GOTO lbl34
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_3 = ed$Snapshot.kg - ed$Snapshot.eaqr("easp", eaqx(int ), (int)23)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == ed$Snapshot.eaqr("easq", eaqo(int ), (int)23)) break;
                v6 /* !! */  = (long)ed$Snapshot.eaqr("easr", eaqo(int ), (int)24);
            }
            v7 /* !! */  = ed$Snapshot.kg;
            if (true) ** GOTO lbl61
            block33: while (true) {
                v7 /* !! */  = (long)(v8 - ed$Snapshot.eaqr("eass", eaqx(int ), (int)24));
lbl61:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2057353668: {
                        break block33;
                    }
                    case -1947157527: {
                        v8 = ed$Snapshot.eaqr("east", eaqx(int ), (int)25);
                        continue block33;
                    }
                    case -1778402807: {
                        v8 = ed$Snapshot.eaqr("easu", eaqx(int ), (int)26);
                        continue block33;
                    }
                    case -1749377476: {
                        v8 = ed$Snapshot.eaqr("easv", eaqx(int ), (int)27);
                        continue block33;
                    }
                }
                break;
            }
            if (this.title.equals("No media")) break block46;
            if (var1_3) ** GOTO lbl34
            v9 = ed$Snapshot.eaqr("easw", eaqo(int ), (int)25);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl87
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v9 = ed$Snapshot.eaqr("easx", eaqo(int ), (int)26);
lbl87:
                // 2 sources

                return (boolean)v9;
            }
            case 0: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("easy", eaqo(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl93:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("easz", eaqo(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl98:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eata", eaqo(int ), (int)29);
                if (!var3_1) ** GOTO lbl93
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eatb", eaqo(int ), (int)30);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eatc", eaqo(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
            }
lbl112:
            // 5 sources

            case 5: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eatd", eaqo(int ), (int)32);
                if (!var3_1) break;
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eate", eaqo(int ), (int)33);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eatf", eaqo(int ), (int)34);
                if (!var3_1) ** GOTO lbl93
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ed$Snapshot.eaqr("eatg", eaqo(int ), (int)35);
        ** while (!var3_1)
lbl127:
        // 1 sources

        throw null;
    }
}

