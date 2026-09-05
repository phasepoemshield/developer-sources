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
import ruhack.phobia.kb;

public final class eu
extends ds {
    public static final boolean a;
    static final long ds = -3900820556159861254L;
    public static final int b;
    private static long[] bpsj;
    private static volatile eu instance;
    private static long[] bpsi;
    private final kb ircInChat;
    private static int[] bprv;
    private static int[] bprx;
    public static final boolean c;

    public eu() {
        int n2 = b;
        super("Communication", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u043e\u0431\u0449\u0435\u043d\u0438\u044f \u043a\u043b\u0438\u0435\u043d\u0442\u0430", du.MISC);
        this.ircInChat = new kb("IRC in chat", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f IRC \u0432 \u0447\u0430\u0442\u0435 Minecraft").setValue((boolean)eu.bpry("bpsa", bpru(int ), (int)0));
        instance = this;
        this.settings(this.ircInChat);
    }

    private static /* synthetic */ void bptw() {
        eu.bprx[0] = -1654519517;
        eu.bprx[1] = 1456747328;
        eu.bprx[2] = -1117117696;
        eu.bprx[3] = 2051641374;
        eu.bprx[4] = -1530612675;
        eu.bprx[5] = 1913674129;
        eu.bprx[6] = -52989895;
        eu.bprx[7] = 312490414;
        eu.bprx[8] = 1720985995;
        eu.bprx[9] = 1521435331;
        eu.bprx[10] = -1596572126;
        eu.bprx[11] = 1664158422;
        eu.bprx[12] = -2093132747;
        eu.bprx[13] = 1691706398;
        eu.bprx[14] = -1781517367;
        eu.bprx[15] = 514403588;
        eu.bprx[16] = -689724798;
        eu.bprx[17] = 1669592187;
        eu.bprx[18] = 655522725;
        eu.bprx[19] = 2022365841;
        eu.bprx[20] = 1241863938;
        eu.bprx[21] = 937783093;
        eu.bprx[22] = -1508013659;
        eu.bprx[23] = -1513689368;
        eu.bprx[24] = 1625392824;
        eu.bprx[25] = 124559932;
        eu.bprx[26] = -126751166;
        eu.bprx[27] = 563672424;
        eu.bprx[28] = 1997263441;
        eu.bprx[29] = -1753752150;
    }

    private static /* synthetic */ void bptv() {
        eu.bprv[0] = -1654519517;
        eu.bprv[1] = 1456747332;
        eu.bprv[2] = -1117117691;
        eu.bprv[3] = 2051641374;
        eu.bprv[4] = -1530612673;
        eu.bprv[5] = 1913674130;
        eu.bprv[6] = -52989891;
        eu.bprv[7] = -312490415;
        eu.bprv[8] = 1946133299;
        eu.bprv[9] = -1521435332;
        eu.bprv[10] = -26622198;
        eu.bprv[11] = 1664158423;
        eu.bprv[12] = 2093132746;
        eu.bprv[13] = 1190986038;
        eu.bprv[14] = -1781517368;
        eu.bprv[15] = -980235037;
        eu.bprv[16] = -689724797;
        eu.bprv[17] = 1669592187;
        eu.bprv[18] = 655522720;
        eu.bprv[19] = 2022365846;
        eu.bprv[20] = 1241863945;
        eu.bprv[21] = 937783092;
        eu.bprv[22] = -1508013651;
        eu.bprv[23] = -1513689362;
        eu.bprv[24] = 1625392830;
        eu.bprv[25] = 124559934;
        eu.bprv[26] = -126751167;
        eu.bprv[27] = 563672418;
        eu.bprv[28] = 1997263450;
        eu.bprv[29] = -1753752145;
    }

    private static /* synthetic */ long bpsh(int n2) {
        return bpsi[n2] ^ bpsj[n2];
    }

    public static /* synthetic */ CallSite bpry(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bpty() {
        eu.bpsj[0] = 937633989281309553L;
        eu.bpsj[1] = 1484996164380547702L;
        eu.bpsj[2] = -5754342800695018872L;
        eu.bpsj[3] = -583945923859452674L;
        eu.bpsj[4] = 4561655213780954448L;
        eu.bpsj[5] = -7948512102393464020L;
        eu.bpsj[6] = 6851454158995263288L;
        eu.bpsj[7] = 4587530429065125373L;
        eu.bpsj[8] = -808897616962731268L;
        eu.bpsj[9] = 1785674466987158417L;
        eu.bpsj[10] = -5274462267425045236L;
        eu.bpsj[11] = -1948846077890455548L;
        eu.bpsj[12] = -5749347075390933354L;
        eu.bpsj[13] = 3150153755479285787L;
    }

    private static /* synthetic */ void bptx() {
        eu.bpsi[0] = -2413197421595226457L;
        eu.bpsi[1] = -1757384180829806921L;
        eu.bpsi[2] = 4792890632607977357L;
        eu.bpsi[3] = -2043557566221145987L;
        eu.bpsi[4] = 1145215398892131956L;
        eu.bpsi[5] = -4508748617968933725L;
        eu.bpsi[6] = -8847888942943785067L;
        eu.bpsi[7] = -593726793716081572L;
        eu.bpsi[8] = -7968056820244905259L;
        eu.bpsi[9] = -3261484316624758590L;
        eu.bpsi[10] = 1260613699962393914L;
        eu.bpsi[11] = -8775601990448893380L;
        eu.bpsi[12] = 5094600672301612738L;
        eu.bpsi[13] = 8382271688064853682L;
    }

    static {
        bprv = new int[30];
        bprx = new int[30];
        eu.bptv();
        eu.bptw();
        bpsi = new long[14];
        bpsj = new long[14];
        eu.bptx();
        eu.bpty();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean showIrcInChat() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eu.ds - eu.bpry("bpsk", bpsh(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eu.bpry("bpsl", bpru(int ), (int)7)) break;
            v0 /* !! */  = (long)eu.bpry("bpsm", bpru(int ), (int)8);
        }
        var3 = eu.c;
        v1 /* !! */  = eu.ds;
        if (true) ** GOTO lbl12
        block31: while (true) {
            v1 /* !! */  = (long)(v2 - eu.bpry("bpsn", bpsh(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1768285356: {
                    v2 = eu.bpry("bpso", bpsh(int ), (int)2);
                    continue block31;
                }
                case -540635687: {
                    v2 = eu.bpry("bpsp", bpsh(int ), (int)3);
                    continue block31;
                }
                case 562871802: {
                    break block31;
                }
                case 1020150904: {
                    v2 = eu.bpry("bpsq", bpsh(int ), (int)4);
                    continue block31;
                }
            }
            break;
        }
        var2_1 /* !! */  = eu.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eu.ds - eu.bpry("bpsr", bpsh(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == eu.bpry("bpss", bpru(int ), (int)9)) break;
            v3 /* !! */  = (long)eu.bpry("bpst", bpru(int ), (int)10);
        }
        var1_2 = eu.a;
        if (var3) {
            throw null;
lbl34:
            // 6 sources

            return (boolean)eu.bpry("bpsu", bpru(int ), (int)11);
        }
        if (var1_2 || var1_2) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = eu.ds - eu.bpry("bpsv", bpsh(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == eu.bpry("bpsw", bpru(int ), (int)12)) break;
            v4 /* !! */  = (long)eu.bpry("bpsx", bpru(int ), (int)13);
        }
        var0_3 = eu.instance;
        if (var1_2 || var1_2) ** GOTO lbl34
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_3 == null) ** GOTO lbl90
                if (var1_2) ** GOTO lbl34
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = eu.ds - eu.bpry("bpsy", bpsh(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == eu.bpry("bpsz", bpru(int ), (int)14)) break;
                    v5 /* !! */  = (long)eu.bpry("bpta", bpru(int ), (int)15);
                }
                if (!var0_3.isState()) ** GOTO lbl90
                if (var1_2) ** GOTO lbl34
                v6 /* !! */  = eu.ds;
                if (true) ** GOTO lbl62
                block36: while (true) {
                    v6 /* !! */  = (long)(v7 - eu.bpry("bptb", bpsh(int ), (int)8));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 40297111: {
                            v7 = eu.bpry("bptc", bpsh(int ), (int)9);
                            continue block36;
                        }
                        case 342449077: {
                            v7 = eu.bpry("bptd", bpsh(int ), (int)10);
                            continue block36;
                        }
                        case 562871802: {
                            break block36;
                        }
                        case 2021125214: {
                            v7 = eu.bpry("bpte", bpsh(int ), (int)11);
                            continue block36;
                        }
                    }
                    break;
                }
                v8 = var0_3.ircInChat;
                v9 /* !! */  = eu.ds;
                if (true) ** GOTO lbl79
                block37: while (true) {
                    v9 /* !! */  = (long)(eu.bpry("bptg", bpsh(int ), (int)13) - eu.bpry("bptf", bpsh(int ), (int)12));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1039497507: {
                            continue block37;
                        }
                        case 562871802: {
                            break block37;
                        }
                    }
                    break;
                }
                if (!v8.isValue()) ** GOTO lbl90
                if (var1_2) ** GOTO lbl34
                v10 = eu.bpry("bpth", bpru(int ), (int)16);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl93
lbl90:
                // 3 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v10 = eu.bpry("bpti", bpru(int ), (int)17);
lbl93:
                // 2 sources

                return (boolean)v10;
            }
            case 0: {
                var2_1 /* !! */  = (int)eu.bpry("bptj", bpru(int ), (int)18);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl99:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)eu.bpry("bptk", bpru(int ), (int)19);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl104:
            // 3 sources

            case 2: {
                do {
                    var2_1 /* !! */  = (int)eu.bpry("bptl", bpru(int ), (int)20);
                } while (!var3);
                throw null;
            }
            case 3: {
                do {
                    var2_1 /* !! */  = (int)eu.bpry("bptm", bpru(int ), (int)21);
                } while (!var3);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)eu.bpry("bptn", bpru(int ), (int)22);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl136
                    break;
                }
            }
            case 5: {
                var2_1 /* !! */  = (int)eu.bpry("bpto", bpru(int ), (int)23);
                if (!var3) ** GOTO lbl104
                throw null;
            }
lbl124:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)eu.bpry("bptp", bpru(int ), (int)24);
                if (!var3) break;
                throw null;
            }
            case 7: {
                var2_1 /* !! */  = (int)eu.bpry("bptq", bpru(int ), (int)25);
                if (!var3) ** GOTO lbl104
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)eu.bpry("bptr", bpru(int ), (int)26);
                if (!var3) ** GOTO lbl99
                throw null;
            }
lbl136:
            // 3 sources

            case 9: {
                var2_1 /* !! */  = (int)eu.bpry("bpts", bpru(int ), (int)27);
                if (!var3) break;
                throw null;
            }
lbl140:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)eu.bpry("bptt", bpru(int ), (int)28);
                if (!var3) ** GOTO lbl124
                throw null;
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)eu.bpry("bptu", bpru(int ), (int)29);
        ** while (!var3)
lbl147:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bpru(int n2) {
        return bprv[n2] ^ bprx[n2];
    }
}

