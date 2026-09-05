/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nd;

public class jo
extends ds {
    public static final int b;
    public static final long sq = -3499573074522672885L;
    public static final String MODE_GALAXY = "\u0413\u0430\u043b\u0430\u043a\u0442\u0438\u043a\u0430";
    private static int[] kmnk;
    public final kf mode;
    public static final boolean c;
    public static final boolean a;
    private static jo instance;
    public static final String MODE_BLACK_HOLE = "\u0427\u0451\u0440\u043d\u0430\u044f \u0434\u044b\u0440\u0430";
    public static final String MODE_AURORA = "\u0421\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u0441\u0438\u044f\u043d\u0438\u0435";
    public final kg speed;
    private static long[] kmna;
    public final kg brightness;
    private static int[] kmni;
    private static long[] kmnb;

    private static /* synthetic */ int kmnh(int n2) {
        return kmni[n2] ^ kmnk[n2];
    }

    private static /* synthetic */ float kmoq(int n2) {
        return Float.intBitsToFloat(kmni[n2] ^ kmnk[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jo() {
        var2_1 /* !! */  = jo.b;
        var1_2 = jo.a;
        super("ShaderSky", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u043d\u0435\u0431\u043e \u043d\u0430 \u0448\u0435\u0439\u0434\u0435\u0440\u043d\u043e\u0435", du.RENDER);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0422\u0438\u043f \u043d\u0435\u0431\u0430", "\u0421\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u0441\u0438\u044f\u043d\u0438\u0435", new String[]{"\u0421\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u0441\u0438\u044f\u043d\u0438\u0435", "\u0427\u0451\u0440\u043d\u0430\u044f \u0434\u044b\u0440\u0430", "\u0413\u0430\u043b\u0430\u043a\u0442\u0438\u043a\u0430"});
        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438", 1.0f).range((float)jo.kmnc("kmor", kmoq(int ), (int)12), (float)jo.kmnc("kmos", kmoq(int ), (int)13)).step((float)jo.kmnc("kmou", kmoq(int ), (int)14));
        this.brightness = new kg("\u042f\u0440\u043a\u043e\u0441\u0442\u044c", "\u042f\u0440\u043a\u043e\u0441\u0442\u044c \u043d\u0435\u0431\u0430", 1.0f).range((float)jo.kmnc("kmox", kmoq(int ), (int)15), 2.0f).step((float)jo.kmnc("kmoz", kmoq(int ), (int)16));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                jo.instance = this;
                this.settings(new jx[]{this.mode, this.speed, this.brightness});
                return;
            }
lbl13:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jo.kmnc("kmpd", kmnh(int ), (int)17);
                    ** GOTO lbl20
                    break;
                }
            }
lbl17:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)jo.kmnc("kmpf", kmnh(int ), (int)18);
                ** GOTO lbl29
            }
lbl20:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)jo.kmnc("kmph", kmnh(int ), (int)19);
                ** GOTO lbl29
            }
            case 3: {
                var2_1 /* !! */  = (int)jo.kmnc("kmpj", kmnh(int ), (int)20);
                ** GOTO lbl13
            }
            case 4: {
                var2_1 /* !! */  = (int)jo.kmnc("kmpk", kmnh(int ), (int)21);
                ** GOTO lbl32
            }
lbl29:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)jo.kmnc("kmpl", kmnh(int ), (int)22);
                ** GOTO lbl13
            }
lbl32:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)jo.kmnc("kmpn", kmnh(int ), (int)23);
                ** GOTO lbl17
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)jo.kmnc("kmpv", kmnh(int ), (int)24);
        ** while (true)
    }

    private static /* synthetic */ void kmsg() {
        jo.kmnk[0] = -174567872;
        jo.kmnk[1] = -2095667885;
        jo.kmnk[2] = 1040665133;
        jo.kmnk[3] = 468691781;
        jo.kmnk[4] = 1245759607;
        jo.kmnk[5] = -1963967891;
        jo.kmnk[6] = 1746814860;
        jo.kmnk[7] = -849388533;
        jo.kmnk[8] = -169804411;
        jo.kmnk[9] = 1216131823;
        jo.kmnk[10] = -1658718333;
        jo.kmnk[11] = -1852840059;
        jo.kmnk[12] = -1686199314;
        jo.kmnk[13] = 1394400746;
        jo.kmnk[14] = 966411360;
        jo.kmnk[15] = 971733334;
        jo.kmnk[16] = -1216531630;
        jo.kmnk[17] = 520209607;
        jo.kmnk[18] = 771571862;
        jo.kmnk[19] = 4285766;
        jo.kmnk[20] = 723796026;
        jo.kmnk[21] = 1992166467;
        jo.kmnk[22] = 1295102924;
        jo.kmnk[23] = 1725306843;
        jo.kmnk[24] = -811484132;
        jo.kmnk[25] = 461544207;
        jo.kmnk[26] = -375443965;
        jo.kmnk[27] = 1774780776;
        jo.kmnk[28] = 1080692563;
        jo.kmnk[29] = -382978863;
        jo.kmnk[30] = 808588032;
        jo.kmnk[31] = 273373012;
        jo.kmnk[32] = -853663529;
        jo.kmnk[33] = 1967642552;
        jo.kmnk[34] = -1492673551;
        jo.kmnk[35] = -657811420;
        jo.kmnk[36] = 271710099;
        jo.kmnk[37] = 1982386298;
        jo.kmnk[38] = 1092445073;
        jo.kmnk[39] = -928590115;
        jo.kmnk[40] = 706502699;
        jo.kmnk[41] = -1766709845;
        jo.kmnk[42] = 1530656007;
        jo.kmnk[43] = -409023703;
    }

    public static /* synthetic */ CallSite kmnc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kmsi() {
        jo.kmnb[0] = -8667704545908204359L;
        jo.kmnb[1] = -7845589075810762068L;
        jo.kmnb[2] = 1570773358833186347L;
        jo.kmnb[3] = 8734821736755215734L;
        jo.kmnb[4] = 3502384384039965156L;
        jo.kmnb[5] = -1930671429630566856L;
        jo.kmnb[6] = 4177988339143496047L;
        jo.kmnb[7] = -1438704231827816666L;
        jo.kmnb[8] = 2328151487636324217L;
        jo.kmnb[9] = -4147312558001830450L;
        jo.kmnb[10] = -1503089947694037445L;
        jo.kmnb[11] = 6465128401855655450L;
        jo.kmnb[12] = 94105778074931822L;
        jo.kmnb[13] = -5474940095393377762L;
        jo.kmnb[14] = -5960442666074474201L;
        jo.kmnb[15] = 5572919895343326332L;
        jo.kmnb[16] = 2122639416772805762L;
        jo.kmnb[17] = 1842643201848607806L;
        jo.kmnb[18] = -7711501561155001160L;
        jo.kmnb[19] = -1336879427864358254L;
        jo.kmnb[20] = 8169693525702412622L;
    }

    private static /* synthetic */ void kmsf() {
        jo.kmni[0] = 174567871;
        jo.kmni[1] = -932637141;
        jo.kmni[2] = 1040665132;
        jo.kmni[3] = -1797438504;
        jo.kmni[4] = -1245759608;
        jo.kmni[5] = -1403559391;
        jo.kmni[6] = 1746814861;
        jo.kmni[7] = -67006106;
        jo.kmni[8] = -169804409;
        jo.kmni[9] = 1216131821;
        jo.kmni[10] = -1658718335;
        jo.kmni[11] = -1852840058;
        jo.kmni[12] = -1498255581;
        jo.kmni[13] = 324853226;
        jo.kmni[14] = 72779949;
        jo.kmni[15] = 128431515;
        jo.kmni[16] = -1968046177;
        jo.kmni[17] = 520209604;
        jo.kmni[18] = 771571861;
        jo.kmni[19] = 4285763;
        jo.kmni[20] = 723796025;
        jo.kmni[21] = 1992166468;
        jo.kmni[22] = 1295102921;
        jo.kmni[23] = 1725306845;
        jo.kmni[24] = -811484136;
        jo.kmni[25] = -461544208;
        jo.kmni[26] = -455627728;
        jo.kmni[27] = -534831001;
        jo.kmni[28] = -1080692564;
        jo.kmni[29] = -352702795;
        jo.kmni[30] = 808588033;
        jo.kmni[31] = 273373013;
        jo.kmni[32] = -853663531;
        jo.kmni[33] = 1967642554;
        jo.kmni[34] = -1492673552;
        jo.kmni[35] = -1178648374;
        jo.kmni[36] = 1036460938;
        jo.kmni[37] = 1227411578;
        jo.kmni[38] = 1092445072;
        jo.kmni[39] = 96075793;
        jo.kmni[40] = 706502697;
        jo.kmni[41] = -1766709846;
        jo.kmni[42] = 1530656005;
        jo.kmni[43] = -409023702;
    }

    private static /* synthetic */ long kmmz(int n2) {
        return kmna[n2] ^ kmnb[n2];
    }

    private static /* synthetic */ void kmsh() {
        jo.kmna[0] = -1372161627939268843L;
        jo.kmna[1] = 1797299975615203864L;
        jo.kmna[2] = -181853643862826545L;
        jo.kmna[3] = -3313378933427866968L;
        jo.kmna[4] = -2285791248012927631L;
        jo.kmna[5] = -482772232959072037L;
        jo.kmna[6] = 9119220587162541366L;
        jo.kmna[7] = -6388942002892279420L;
        jo.kmna[8] = 864855844077496434L;
        jo.kmna[9] = -2618035187118897404L;
        jo.kmna[10] = -6147940280907652648L;
        jo.kmna[11] = -6544576769580822760L;
        jo.kmna[12] = 880970031549314167L;
        jo.kmna[13] = -1935210309670224607L;
        jo.kmna[14] = 7389791306317861352L;
        jo.kmna[15] = 1826341650319801853L;
        jo.kmna[16] = -3404338736405784256L;
        jo.kmna[17] = -5092951864580991721L;
        jo.kmna[18] = -1546599117132304550L;
        jo.kmna[19] = -9124096560834784789L;
        jo.kmna[20] = -4881055147609664516L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getSecondaryColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = jo.sq - jo.kmnc("kmrl", kmmz(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jo.kmnc("kmrm", kmnh(int ), (int)34)) break;
            v0 /* !! */  = (long)jo.kmnc("kmrn", kmnh(int ), (int)35);
        }
        var3_1 = jo.c;
        v1 /* !! */  = jo.sq;
        block16: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1953631989: {
                    break block16;
                }
                case 1921975844: {
                    v1 /* !! */  = (long)(jo.kmnc("kmrq", kmmz(int ), (int)16) - jo.kmnc("kmrp", kmmz(int ), (int)15));
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = jo.b;
        v2 /* !! */  = jo.sq;
        if (true) ** GOTO lbl20
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - jo.kmnc("kmrs", kmmz(int ), (int)17));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1953631989: {
                    break block17;
                }
                case -988709870: {
                    v3 = jo.kmnc("kmru", kmmz(int ), (int)18);
                    continue block17;
                }
                case 591155201: {
                    v3 = jo.kmnc("kmrv", kmmz(int ), (int)19);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = jo.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return (int)jo.kmnc("kmrw", kmnh(int ), (int)36);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (int)jo.kmnc("kmrw", kmnh(int ), (int)36);
                    v4 = jo.kmnc("kmrx", kmoq(int ), (int)37);
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = jo.sq - jo.kmnc("kmry", kmmz(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == jo.kmnc("kmrz", kmnh(int ), (int)38)) {
                            return nd.getClientColorAt((float)v4);
                        }
                        v5 /* !! */  = (long)jo.kmnc("kmsa", kmnh(int ), (int)39);
                    }
                }
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)jo.kmnc("kmsb", kmnh(int ), (int)40);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)jo.kmnc("kmse", kmnh(int ), (int)43);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jo.kmnc("kmsc", kmnh(int ), (int)41);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl64
            break;
        }
        do {
            if (true) ** continue;
lbl64:
            // 2 sources

            var2_2 /* !! */  = (int)jo.kmnc("kmsd", kmnh(int ), (int)42);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jo getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jo.sq - jo.kmnc("kmne", kmmz(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jo.kmnc("kmnl", kmnh(int ), (int)0)) break;
            v0 /* !! */  = (long)jo.kmnc("kmno", kmnh(int ), (int)1);
        }
        var2 = jo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jo.sq - jo.kmnc("kmnq", kmmz(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jo.kmnc("kmnt", kmnh(int ), (int)2)) break;
            v1 /* !! */  = (long)jo.kmnc("kmnu", kmnh(int ), (int)3);
        }
        var1_1 /* !! */  = jo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jo.sq - jo.kmnc("kmnw", kmmz(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jo.kmnc("kmnx", kmnh(int ), (int)4)) break;
            v2 /* !! */  = (long)jo.kmnc("kmny", kmnh(int ), (int)5);
        }
        var0_2 = jo.a;
        if (var2) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl27:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jo.sq - jo.kmnc("kmob", kmmz(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jo.kmnc("kmod", kmnh(int ), (int)6)) break;
                    v3 /* !! */  = (long)jo.kmnc("kmoe", kmnh(int ), (int)7);
                }
                return jo.instance;
            }
lbl37:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)jo.kmnc("kmog", kmnh(int ), (int)8);
                } while (!var2);
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)jo.kmnc("kmoi", kmnh(int ), (int)9);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)jo.kmnc("kmol", kmnh(int ), (int)10);
                if (!var2) ** GOTO lbl37
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)jo.kmnc("kmon", kmnh(int ), (int)11);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getPrimaryColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jo.sq - jo.kmnc("kmqb", kmmz(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jo.kmnc("kmqd", kmnh(int ), (int)25)) break;
            v0 /* !! */  = (long)jo.kmnc("kmqe", kmnh(int ), (int)26);
        }
        var3_1 = jo.c;
        v1 /* !! */  = jo.sq;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - jo.kmnc("kmqg", kmmz(int ), (int)5));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1953631989: {
                    break block19;
                }
                case -948927342: {
                    v2 = jo.kmnc("kmqi", kmmz(int ), (int)6);
                    continue block19;
                }
                case -518791577: {
                    v2 = jo.kmnc("kmqk", kmmz(int ), (int)7);
                    continue block19;
                }
                case 1402053642: {
                    v2 = jo.kmnc("kmql", kmmz(int ), (int)8);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = jo.b;
        v3 /* !! */  = jo.sq;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - jo.kmnc("kmqn", kmmz(int ), (int)9));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1953631989: {
                    break block20;
                }
                case -499632111: {
                    v4 = jo.kmnc("kmqp", kmmz(int ), (int)10);
                    continue block20;
                }
                case -337126509: {
                    v4 = jo.kmnc("kmqr", kmmz(int ), (int)11);
                    continue block20;
                }
                case 692352885: {
                    v4 = jo.kmnc("kmqs", kmmz(int ), (int)12);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = jo.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (int)jo.kmnc("kmqu", kmnh(int ), (int)27);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jo.sq - jo.kmnc("kmqx", kmmz(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jo.kmnc("kmqy", kmnh(int ), (int)28)) break;
                    v5 /* !! */  = (long)jo.kmnc("kmra", kmnh(int ), (int)29);
                }
                return nd.getClientColorAt(0.0f);
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jo.kmnc("kmrb", kmnh(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                var2_2 /* !! */  = (int)jo.kmnc("kmrd", kmnh(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
            }
lbl66:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)jo.kmnc("kmrf", kmnh(int ), (int)32);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jo.kmnc("kmrh", kmnh(int ), (int)33);
        } while (!var3_1);
        throw null;
    }

    static {
        kmni = new int[44];
        kmnk = new int[44];
        jo.kmsf();
        jo.kmsg();
        kmna = new long[21];
        kmnb = new long[21];
        jo.kmsh();
        jo.kmsi();
    }
}

