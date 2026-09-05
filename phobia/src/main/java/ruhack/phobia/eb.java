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
import ruhack.phobia.dy;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.nj;

public final class eb
extends ds {
    public static final int b;
    public final kf backgroundStyle;
    protected static final long fi = 2887395108032338250L;
    public final ke interfaceSettings;
    private static int[] cbup;
    private static int[] cbuo;
    public static final boolean a;
    private static long[] cbva;
    private static long[] cbuz;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static eb getInstance() {
        v0 /* !! */  = eb.fi;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(v1 - eb.cbuq("cbvb", cbuy(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1496349958: {
                    v1 = eb.cbuq("cbvc", cbuy(int ), (int)1);
                    continue block10;
                }
                case 853948512: {
                    v1 = eb.cbuq("cbvd", cbuy(int ), (int)2);
                    continue block10;
                }
                case 2088229194: {
                    break block10;
                }
            }
            break;
        }
        var2 = eb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = eb.fi - eb.cbuq("cbve", cbuy(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == eb.cbuq("cbvf", cbun(int ), (int)7)) break;
            v2 /* !! */  = (long)eb.cbuq("cbvg", cbun(int ), (int)8);
        }
        var1_1 = eb.b;
        v3 /* !! */  = eb.fi;
        if (true) ** GOTO lbl26
        block12: while (true) {
            v3 /* !! */  = (long)(v4 - eb.cbuq("cbvh", cbuy(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1781643851: {
                    v4 = eb.cbuq("cbvi", cbuy(int ), (int)5);
                    continue block12;
                }
                case 255980521: {
                    v4 = eb.cbuq("cbvj", cbuy(int ), (int)6);
                    continue block12;
                }
                case 2088229194: {
                    break block12;
                }
            }
            break;
        }
        var0_2 = eb.a;
        if (var2) {
            throw null;
lbl38:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl41:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = eb.fi - eb.cbuq("cbvk", cbuy(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == eb.cbuq("cbvl", cbun(int ), (int)9)) break;
            v5 /* !! */  = (long)eb.cbuq("cbvm", cbun(int ), (int)10);
        }
        return nj.get(eb.class);
    }

    private static /* synthetic */ void cbvt() {
        eb.cbuz[0] = 6189316839748181940L;
        eb.cbuz[1] = 2665048207078020809L;
        eb.cbuz[2] = 2071618434189488092L;
        eb.cbuz[3] = -392225570630988917L;
        eb.cbuz[4] = -2345486919699820170L;
        eb.cbuz[5] = -6250578611707494042L;
        eb.cbuz[6] = 3006581704501626430L;
        eb.cbuz[7] = -3604138430095502712L;
    }

    private static /* synthetic */ int cbun(int n2) {
        return cbuo[n2] ^ cbup[n2];
    }

    public static /* synthetic */ CallSite cbuq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public eb() {
        var3_1 /* !! */  = eb.b;
        super("Interface", "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 HUD \u0438 \u0444\u043e\u043d\u0430", du.DISPLAY);
        if (var3_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var1_2 = dy.getInstance();
                this.interfaceSettings = var1_2.interfaceSettings;
                this.backgroundStyle = var1_2.backgroundStyle;
                this.settings(new jx[]{this.interfaceSettings, this.backgroundStyle});
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                var3_1 /* !! */  = (int)eb.cbuq("cbur", cbun(int ), (int)0);
                ** GOTO lbl23
            }
            case 1: {
                var3_1 /* !! */  = (int)eb.cbuq("cbus", cbun(int ), (int)1);
                ** GOTO lbl26
            }
            case 2: {
                var3_1 /* !! */  = (int)eb.cbuq("cbut", cbun(int ), (int)2);
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_1 /* !! */  = (int)eb.cbuq("cbuu", cbun(int ), (int)3);
                    break block0;
                    break;
                }
            }
lbl23:
            // 2 sources

            case 4: {
                var3_1 /* !! */  = (int)eb.cbuq("cbuv", cbun(int ), (int)4);
                ** GOTO lbl11
            }
lbl26:
            // 2 sources

            case 5: {
                var3_1 /* !! */  = (int)eb.cbuq("cbuw", cbun(int ), (int)5);
            }
            case 6: 
        }
        var3_1 /* !! */  = (int)eb.cbuq("cbux", cbun(int ), (int)6);
        ** while (true)
    }

    private static /* synthetic */ long cbuy(int n2) {
        return cbuz[n2] ^ cbva[n2];
    }

    private static /* synthetic */ void cbvr() {
        eb.cbuo[0] = -1645670294;
        eb.cbuo[1] = 650405857;
        eb.cbuo[2] = -685564165;
        eb.cbuo[3] = 225527071;
        eb.cbuo[4] = -2032439634;
        eb.cbuo[5] = -1201254100;
        eb.cbuo[6] = -20523752;
        eb.cbuo[7] = -732163403;
        eb.cbuo[8] = 202317196;
        eb.cbuo[9] = -1993681899;
        eb.cbuo[10] = -955551662;
        eb.cbuo[11] = -1962259461;
        eb.cbuo[12] = 671998413;
        eb.cbuo[13] = 1675661361;
        eb.cbuo[14] = 197914324;
    }

    private static /* synthetic */ void cbvu() {
        eb.cbva[0] = -7599418072773620526L;
        eb.cbva[1] = -5514794985426453723L;
        eb.cbva[2] = 7035978592687984093L;
        eb.cbva[3] = 2169034445029443471L;
        eb.cbva[4] = -3204031551197018905L;
        eb.cbva[5] = 7628966631809453556L;
        eb.cbva[6] = -8658569262029809008L;
        eb.cbva[7] = 3432937050022453493L;
    }

    private static /* synthetic */ void cbvs() {
        eb.cbup[0] = -1645670293;
        eb.cbup[1] = 650405857;
        eb.cbup[2] = -685564168;
        eb.cbup[3] = 225527066;
        eb.cbup[4] = -2032439635;
        eb.cbup[5] = -1201254097;
        eb.cbup[6] = -20523748;
        eb.cbup[7] = -732163404;
        eb.cbup[8] = 534573016;
        eb.cbup[9] = -1993681900;
        eb.cbup[10] = 1709432259;
        eb.cbup[11] = -1962259462;
        eb.cbup[12] = 671998412;
        eb.cbup[13] = 1675661363;
        eb.cbup[14] = 197914327;
    }

    static {
        cbuo = new int[15];
        cbup = new int[15];
        eb.cbvr();
        eb.cbvs();
        cbuz = new long[8];
        cbva = new long[8];
        eb.cbvt();
        eb.cbvu();
    }
}

