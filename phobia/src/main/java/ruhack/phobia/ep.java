/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.aw;
import ruhack.phobia.bt;
import ruhack.phobia.cr;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;

public class ep
extends ds {
    private static long[] cgt;
    private static int[] cgk;
    public static final long l = -5153817227656922375L;
    public static final boolean a;
    private final kf modeSetting;
    public static final boolean c;
    public static final int b;
    private static int[] cgl;
    private static long[] cgu;

    public static /* synthetic */ CallSite cgm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ep() {
        var2_1 /* !! */  = ep.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("AutoRespawn", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u043e\u0437\u0440\u0430\u0436\u0434\u0430\u0435\u0442\u0441\u044f", du.MISC);
                this.modeSetting = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435, \u0447\u0442\u043e \u0431\u0443\u0434\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f", "Vanilla", new String[]{"Vanilla"});
                this.settings(new jx[]{this.modeSetting});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ep.cgm("cgn", cgj(int ), (int)0);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ep.cgm("cgo", cgj(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)ep.cgm("cgp", cgj(int ), (int)2);
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)ep.cgm("cgq", cgj(int ), (int)3);
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)ep.cgm("cgr", cgj(int ), (int)4);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDeathScreen(bt var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ep.l - ep.cgm("chk", cgs(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ep.cgm("chl", cgj(int ), (int)9)) break;
            v0 /* !! */  = (long)ep.cgm("chm", cgj(int ), (int)10);
        }
        var4_2 = ep.c;
        v1 /* !! */  = ep.l;
        if (true) ** GOTO lbl11
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - ep.cgm("chn", cgs(int ), (int)12));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1674020103: {
                    break block35;
                }
                case 748989831: {
                    v2 = ep.cgm("cho", cgs(int ), (int)13);
                    continue block35;
                }
                case 0x45E44554: {
                    v2 = ep.cgm("chp", cgs(int ), (int)14);
                    continue block35;
                }
                case 1374161128: {
                    v2 = ep.cgm("chq", cgs(int ), (int)15);
                    continue block35;
                }
            }
            break;
        }
        var3_3 /* !! */  = ep.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ep.l - ep.cgm("chr", cgs(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ep.cgm("chs", cgj(int ), (int)11)) break;
            v3 /* !! */  = (long)ep.cgm("cht", cgj(int ), (int)12);
        }
        var2_4 = ep.a;
        if (var4_2) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ep.l - ep.cgm("chu", cgs(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ep.cgm("chv", cgj(int ), (int)13)) break;
                    v4 /* !! */  = (long)ep.cgm("chw", cgj(int ), (int)14);
                }
                v5 /* !! */  = ep.l;
                if (true) ** GOTO lbl47
                block39: while (true) {
                    v5 /* !! */  = (long)(v6 - ep.cgm("chx", cgs(int ), (int)18));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2006872710: {
                            v6 = ep.cgm("chy", cgs(int ), (int)19);
                            continue block39;
                        }
                        case -1674020103: {
                            break block39;
                        }
                        case -711109741: {
                            v6 = ep.cgm("chz", cgs(int ), (int)20);
                            continue block39;
                        }
                        case 216875918: {
                            v6 = ep.cgm("cia", cgs(int ), (int)21);
                            continue block39;
                        }
                    }
                    break;
                }
                if (!this.modeSetting.isSelected("Vanilla")) ** GOTO lbl103
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ep.l - ep.cgm("cib", cgs(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ep.cgm("cic", cgj(int ), (int)15)) break;
                    v7 /* !! */  = (long)ep.cgm("cid", cgj(int ), (int)16);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ep.l - ep.cgm("cie", cgs(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ep.cgm("cif", cgj(int ), (int)17)) break;
                    v8 /* !! */  = (long)ep.cgm("cig", cgj(int ), (int)18);
                }
                v9 = ep.mc.field_1724;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ep.l - ep.cgm("cih", cgs(int ), (int)24)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ep.cgm("cii", cgj(int ), (int)19)) break;
                    v10 /* !! */  = (long)ep.cgm("cij", cgj(int ), (int)20);
                }
                v9.method_7331();
                if (var2_4 || var2_4) ** GOTO lbl32
                v11 /* !! */  = ep.l;
                if (true) ** GOTO lbl83
                block43: while (true) {
                    v11 /* !! */  = (long)(ep.cgm("cil", cgs(int ), (int)26) - ep.cgm("cik", cgs(int ), (int)25));
lbl83:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1674020103: {
                            break block43;
                        }
                        case 24416622: {
                            continue block43;
                        }
                    }
                    break;
                }
                v12 /* !! */  = ep.l;
                if (true) ** GOTO lbl92
                block44: while (true) {
                    v12 /* !! */  = (long)(v13 - ep.cgm("cim", cgs(int ), (int)27));
lbl92:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1674020103: {
                            break block44;
                        }
                        case 376294516: {
                            v13 = ep.cgm("cin", cgs(int ), (int)28);
                            continue block44;
                        }
                        case 751138343: {
                            v13 = ep.cgm("cio", cgs(int ), (int)29);
                            continue block44;
                        }
                    }
                    break;
                }
                ep.mc.method_1507(null);
                if (var2_4) ** GOTO lbl32
lbl103:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl106:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ep.cgm("cip", cgj(int ), (int)21);
                } while (!var4_2);
                throw null;
            }
lbl111:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)ep.cgm("ciq", cgj(int ), (int)22);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl116:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)ep.cgm("cir", cgj(int ), (int)23);
                } while (!var4_2);
                throw null;
            }
lbl121:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ep.cgm("cis", cgj(int ), (int)24);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ep.cgm("cit", cgj(int ), (int)25);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)ep.cgm("ciu", cgj(int ), (int)26);
                if (!var4_2) ** GOTO lbl106
                throw null;
            }
lbl133:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)ep.cgm("civ", cgj(int ), (int)27);
                if (!var4_2) ** GOTO lbl121
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)ep.cgm("ciw", cgj(int ), (int)28);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ep.cgm("cix", cgj(int ), (int)29);
                    if (!var4_2) ** GOTO lbl111
                    throw null;
                }
            }
            case 9: {
                var3_3 /* !! */  = (int)ep.cgm("ciy", cgj(int ), (int)30);
                if (!var4_2) ** GOTO lbl133
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)ep.cgm("ciz", cgj(int ), (int)31);
        ** while (!var4_2)
lbl153:
        // 1 sources

        throw null;
    }

    static {
        cgk = new int[32];
        cgl = new int[32];
        ep.cja();
        ep.cjb();
        cgt = new long[30];
        cgu = new long[30];
        ep.cjc();
        ep.cjd();
    }

    private static /* synthetic */ long cgs(int n2) {
        return cgt[n2] ^ cgu[n2];
    }

    private static /* synthetic */ int cgj(int n2) {
        return cgk[n2] ^ cgl[n2];
    }

    private static /* synthetic */ void cja() {
        ep.cgk[0] = -1664907739;
        ep.cgk[1] = -1704907489;
        ep.cgk[2] = 1364079327;
        ep.cgk[3] = 460586609;
        ep.cgk[4] = 178914785;
        ep.cgk[5] = -1301626049;
        ep.cgk[6] = -1641413826;
        ep.cgk[7] = -464347780;
        ep.cgk[8] = 1496933204;
        ep.cgk[9] = 2118721085;
        ep.cgk[10] = -1261047338;
        ep.cgk[11] = 369113251;
        ep.cgk[12] = -1256372579;
        ep.cgk[13] = -395849573;
        ep.cgk[14] = 1222599416;
        ep.cgk[15] = 1888871744;
        ep.cgk[16] = -450344173;
        ep.cgk[17] = -1600641577;
        ep.cgk[18] = 1290025;
        ep.cgk[19] = 548382852;
        ep.cgk[20] = -1144102563;
        ep.cgk[21] = 1049143110;
        ep.cgk[22] = -505953008;
        ep.cgk[23] = -1793736547;
        ep.cgk[24] = -989531178;
        ep.cgk[25] = -1427233318;
        ep.cgk[26] = -41363615;
        ep.cgk[27] = -1203642626;
        ep.cgk[28] = 2108154499;
        ep.cgk[29] = 1806781;
        ep.cgk[30] = -108208244;
        ep.cgk[31] = 1888460103;
    }

    private static /* synthetic */ void cjc() {
        ep.cgt[0] = -3035237434182232692L;
        ep.cgt[1] = -1286839395337238409L;
        ep.cgt[2] = 4175475543722116143L;
        ep.cgt[3] = 34132983055882859L;
        ep.cgt[4] = 6823111870989817617L;
        ep.cgt[5] = 7061498187134284133L;
        ep.cgt[6] = -5506395351144715166L;
        ep.cgt[7] = -8210990426241303258L;
        ep.cgt[8] = -7265518229577537593L;
        ep.cgt[9] = 7059384710685183253L;
        ep.cgt[10] = 6274282679417104457L;
        ep.cgt[11] = 5066833857431159009L;
        ep.cgt[12] = 6623180116651597222L;
        ep.cgt[13] = 2964486834033102576L;
        ep.cgt[14] = 5723208269056603378L;
        ep.cgt[15] = 722967249741682332L;
        ep.cgt[16] = -1162167810782062748L;
        ep.cgt[17] = 65114096521110407L;
        ep.cgt[18] = -5752175013384944304L;
        ep.cgt[19] = 6967896523855217306L;
        ep.cgt[20] = 5219508855507260672L;
        ep.cgt[21] = 3799016554999457507L;
        ep.cgt[22] = 6452462575471993283L;
        ep.cgt[23] = -8721281473228495857L;
        ep.cgt[24] = 5054497913579527817L;
        ep.cgt[25] = -3566952171043509098L;
        ep.cgt[26] = -6824349207218363861L;
        ep.cgt[27] = -808807583516853741L;
        ep.cgt[28] = 1285669780989855998L;
        ep.cgt[29] = 8551305722936831195L;
    }

    private static /* synthetic */ void cjd() {
        ep.cgu[0] = 1467475065769955341L;
        ep.cgu[1] = -5883288609572308882L;
        ep.cgu[2] = 2975318148408391950L;
        ep.cgu[3] = 6999110760604077420L;
        ep.cgu[4] = 8203239477936599959L;
        ep.cgu[5] = 7234254392343131336L;
        ep.cgu[6] = 4053507990306388115L;
        ep.cgu[7] = -570082337564705238L;
        ep.cgu[8] = -7711419280093230775L;
        ep.cgu[9] = -4532560074936456001L;
        ep.cgu[10] = -5032275662053920068L;
        ep.cgu[11] = -6074856710659994589L;
        ep.cgu[12] = 6469054073797796421L;
        ep.cgu[13] = -3844199883856700402L;
        ep.cgu[14] = -6055987314082906745L;
        ep.cgu[15] = 7762407900411247150L;
        ep.cgu[16] = 3700258137444075496L;
        ep.cgu[17] = -5308417166632501566L;
        ep.cgu[18] = -1042309392901708721L;
        ep.cgu[19] = 8643232423405178527L;
        ep.cgu[20] = 572032861912941935L;
        ep.cgu[21] = -6837046110810072908L;
        ep.cgu[22] = 3813538930917021607L;
        ep.cgu[23] = 8333988575521387373L;
        ep.cgu[24] = -7531200106764177758L;
        ep.cgu[25] = -5853112444202804385L;
        ep.cgu[26] = 7591539471511195105L;
        ep.cgu[27] = -144828969190641933L;
        ep.cgu[28] = -2248548379245341029L;
        ep.cgu[29] = -4546002535737207508L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @aw
    public void onPacket(cr cr2) {
        Object object = l;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ep.cgm("cgv", cgs(int ), (int)0);
            }
            switch ((int)object) {
                case -1674020103: {
                    break block17;
                }
                case -158654442: {
                    callSite = ep.cgm("cgw", cgs(int ), (int)1);
                    continue block17;
                }
                case 496105542: {
                    callSite = ep.cgm("cgx", cgs(int ), (int)2);
                    continue block17;
                }
                case 2055319417: {
                    callSite = ep.cgm("cgy", cgs(int ), (int)3);
                    continue block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = l;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ep.cgm("cgz", cgs(int ), (int)4);
            }
            switch ((int)object2) {
                case -1674020103: {
                    break block18;
                }
                case 1227067523: {
                    callSite = ep.cgm("cha", cgs(int ), (int)5);
                    continue block18;
                }
                case 2081915569: {
                    callSite = ep.cgm("chb", cgs(int ), (int)6);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = l;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - ep.cgm("chc", cgs(int ), (int)7);
            }
            switch ((int)object3) {
                case -1942167646: {
                    callSite = ep.cgm("chd", cgs(int ), (int)8);
                    continue block19;
                }
                case -1923577065: {
                    callSite = ep.cgm("che", cgs(int ), (int)9);
                    continue block19;
                }
                case -1674020103: {
                    break block19;
                }
                case 265917014: {
                    callSite = ep.cgm("chf", cgs(int ), (int)10);
                    continue block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) {
            return;
        }
    }

    private static /* synthetic */ void cjb() {
        ep.cgl[0] = -1664907738;
        ep.cgl[1] = -1704907489;
        ep.cgl[2] = 1364079325;
        ep.cgl[3] = 460586608;
        ep.cgl[4] = 178914789;
        ep.cgl[5] = -1301626052;
        ep.cgl[6] = -1641413827;
        ep.cgl[7] = -464347780;
        ep.cgl[8] = 1496933204;
        ep.cgl[9] = -2118721086;
        ep.cgl[10] = 1932801725;
        ep.cgl[11] = -369113252;
        ep.cgl[12] = 2070902387;
        ep.cgl[13] = -395849574;
        ep.cgl[14] = -715275893;
        ep.cgl[15] = -1888871745;
        ep.cgl[16] = 1029069397;
        ep.cgl[17] = 1600641576;
        ep.cgl[18] = -254878865;
        ep.cgl[19] = -548382853;
        ep.cgl[20] = 571914619;
        ep.cgl[21] = 1049143105;
        ep.cgl[22] = -505952999;
        ep.cgl[23] = -1793736549;
        ep.cgl[24] = -989531179;
        ep.cgl[25] = -1427233313;
        ep.cgl[26] = -41363612;
        ep.cgl[27] = -1203642634;
        ep.cgl[28] = 2108154496;
        ep.cgl[29] = 1806783;
        ep.cgl[30] = -108208250;
        ep.cgl[31] = 1888460098;
    }
}

