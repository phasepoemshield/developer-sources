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
import ruhack.phobia.bv;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kg;
import ruhack.phobia.nd;

public class jl
extends ds {
    private static int[] kqmy;
    public static final boolean c;
    private static long[] kqnj;
    public static final boolean a;
    protected static final long sw = -5325650559155045014L;
    private static long[] kqnk;
    private final kg alphaSetting;
    public static final int b;
    private static int[] kqmx;

    private static /* synthetic */ void kqou() {
        jl.kqmx[0] = -1194869397;
        jl.kqmx[1] = -105859820;
        jl.kqmx[2] = 1935836516;
        jl.kqmx[3] = 467208921;
        jl.kqmx[4] = -584985281;
        jl.kqmx[5] = 1948444810;
        jl.kqmx[6] = -449001817;
        jl.kqmx[7] = 380009830;
        jl.kqmx[8] = 1814565999;
        jl.kqmx[9] = 1566501975;
        jl.kqmx[10] = -1922873221;
        jl.kqmx[11] = 634976874;
        jl.kqmx[12] = -1536830601;
        jl.kqmx[13] = -692557141;
        jl.kqmx[14] = -1950151086;
        jl.kqmx[15] = -1176242827;
        jl.kqmx[16] = -2093393135;
        jl.kqmx[17] = 1789561974;
        jl.kqmx[18] = 67207407;
        jl.kqmx[19] = 1565019731;
        jl.kqmx[20] = -998393104;
        jl.kqmx[21] = -1093372942;
        jl.kqmx[22] = -334418639;
        jl.kqmx[23] = -1355402520;
        jl.kqmx[24] = -761452133;
    }

    static {
        kqmx = new int[25];
        kqmy = new int[25];
        jl.kqou();
        jl.kqov();
        kqnj = new long[17];
        kqnk = new long[17];
        jl.kqow();
        jl.kqox();
    }

    public static /* synthetic */ CallSite kqmz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float kqmw(int n2) {
        return Float.intBitsToFloat(kqmx[n2] ^ kqmy[n2]);
    }

    private static /* synthetic */ void kqox() {
        jl.kqnk[0] = 8919810852139967302L;
        jl.kqnk[1] = 7081087134399430561L;
        jl.kqnk[2] = -2898942573321419439L;
        jl.kqnk[3] = -8653342450289937668L;
        jl.kqnk[4] = -7018122175545262753L;
        jl.kqnk[5] = -8825318657305106767L;
        jl.kqnk[6] = 2391386756451357319L;
        jl.kqnk[7] = 7595795805512505953L;
        jl.kqnk[8] = -2329215345566022695L;
        jl.kqnk[9] = 6280965268123762937L;
        jl.kqnk[10] = -3290548817424881672L;
        jl.kqnk[11] = -5900155724483824630L;
        jl.kqnk[12] = 1258099508156210367L;
        jl.kqnk[13] = -8876687138330574203L;
        jl.kqnk[14] = -6713581248359111159L;
        jl.kqnk[15] = -5263082651646080630L;
        jl.kqnk[16] = -8146708165232533950L;
    }

    private static /* synthetic */ void kqow() {
        jl.kqnj[0] = -8446795636432865124L;
        jl.kqnj[1] = -5545527525729761835L;
        jl.kqnj[2] = 2462175046946412918L;
        jl.kqnj[3] = 2667874518215342885L;
        jl.kqnj[4] = -707812673031015512L;
        jl.kqnj[5] = -3009583613925011088L;
        jl.kqnj[6] = -3231564652656574031L;
        jl.kqnj[7] = 6913850384093985413L;
        jl.kqnj[8] = 4215358913654116806L;
        jl.kqnj[9] = 1396314991497778716L;
        jl.kqnj[10] = 1119304346640158628L;
        jl.kqnj[11] = 2893562849757458827L;
        jl.kqnj[12] = -7634457069827285617L;
        jl.kqnj[13] = 6142012418866152767L;
        jl.kqnj[14] = 1953133017539902437L;
        jl.kqnj[15] = -5828912548019878880L;
        jl.kqnj[16] = -8069566459487594212L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onEntityColor(bv var1_1) {
        v0 /* !! */  = jl.sw;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - jl.kqmz("kqnl", kqni(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -627246856: {
                    v1 = jl.kqmz("kqnm", kqni(int ), (int)1);
                    continue block30;
                }
                case 105892606: {
                    v1 = jl.kqmz("kqnn", kqni(int ), (int)2);
                    continue block30;
                }
                case 1874066794: {
                    break block30;
                }
            }
            break;
        }
        var4_2 = jl.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jl.sw - jl.kqmz("kqno", kqni(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jl.kqmz("kqnp", kqnc(int ), (int)7)) break;
            v2 /* !! */  = (long)jl.kqmz("kqnq", kqnc(int ), (int)8);
        }
        var3_3 /* !! */  = jl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jl.sw - jl.kqmz("kqnr", kqni(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jl.kqmz("kqns", kqnc(int ), (int)9)) break;
            v3 /* !! */  = (long)jl.kqmz("kqnt", kqnc(int ), (int)10);
        }
        var2_4 = jl.a;
        if (var4_2) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = jl.sw - jl.kqmz("kqnu", kqni(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jl.kqmz("kqnv", kqnc(int ), (int)11)) break;
            v4 /* !! */  = (long)jl.kqmz("kqnw", kqnc(int ), (int)12);
        }
        v5 = var1_1.getColor();
        v6 /* !! */  = jl.sw;
        if (true) ** GOTO lbl42
        block35: while (true) {
            v6 /* !! */  = (long)(jl.kqmz("kqny", kqni(int ), (int)7) - jl.kqmz("kqnx", kqni(int ), (int)6));
lbl42:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2017579752: {
                    continue block35;
                }
                case 1874066794: {
                    break block35;
                }
            }
            break;
        }
        v7 /* !! */  = jl.sw;
        if (true) ** GOTO lbl51
        block36: while (true) {
            v7 /* !! */  = (long)(v8 - jl.kqmz("kqnz", kqni(int ), (int)8));
lbl51:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1064907562: {
                    v8 = jl.kqmz("kqoa", kqni(int ), (int)9);
                    continue block36;
                }
                case -884081367: {
                    v8 = jl.kqmz("kqob", kqni(int ), (int)10);
                    continue block36;
                }
                case 1874066794: {
                    break block36;
                }
            }
            break;
        }
        v9 = this.alphaSetting.getValue();
        v10 /* !! */  = jl.sw;
        if (true) ** GOTO lbl65
        block37: while (true) {
            v10 /* !! */  = (long)(v11 - jl.kqmz("kqoc", kqni(int ), (int)11));
lbl65:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1908581924: {
                    v11 = jl.kqmz("kqod", kqni(int ), (int)12);
                    continue block37;
                }
                case -1762025823: {
                    v11 = jl.kqmz("kqoe", kqni(int ), (int)13);
                    continue block37;
                }
                case 325151576: {
                    v11 = jl.kqmz("kqof", kqni(int ), (int)14);
                    continue block37;
                }
                case 1874066794: {
                    break block37;
                }
            }
            break;
        }
        v12 = nd.multAlpha(v5, v9);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = jl.sw - jl.kqmz("kqog", kqni(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == jl.kqmz("kqoh", kqnc(int ), (int)13)) break;
            v13 /* !! */  = (long)jl.kqmz("kqoi", kqnc(int ), (int)14);
        }
        var1_1.setColor(v12);
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = jl.sw - jl.kqmz("kqoj", kqni(int ), (int)16)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == jl.kqmz("kqok", kqnc(int ), (int)15)) break;
            v14 /* !! */  = (long)jl.kqmz("kqol", kqnc(int ), (int)16);
        }
        var1_1.cancel();
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jl.kqmz("kqom", kqnc(int ), (int)17);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jl.kqmz("kqon", kqnc(int ), (int)18);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl121
                    break;
                }
            }
lbl109:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)jl.kqmz("kqoo", kqnc(int ), (int)19);
                if (!var4_2) break;
                throw null;
            }
lbl113:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)jl.kqmz("kqop", kqnc(int ), (int)20);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)jl.kqmz("kqoq", kqnc(int ), (int)21);
                if (!var4_2) break;
                throw null;
            }
lbl121:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)jl.kqmz("kqor", kqnc(int ), (int)22);
                if (!var4_2) break;
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)jl.kqmz("kqos", kqnc(int ), (int)23);
                if (!var4_2) ** GOTO lbl109
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)jl.kqmz("kqot", kqnc(int ), (int)24);
        ** while (!var4_2)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int kqnc(int n2) {
        return kqmx[n2] ^ kqmy[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public jl() {
        var2_1 /* !! */  = jl.b;
        super("SeeInvisible", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0435\u0432\u0435\u0434\u0438\u043c\u044b\u0445 \u0438\u0433\u0440\u043e\u043a\u043e\u0432", du.RENDER);
        this.alphaSetting = new kg("\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430", (float)jl.kqmz("kqna", kqmw(int ), (int)0)).range((float)jl.kqmz("kqnb", kqmw(int ), (int)1), 1.0f);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.alphaSetting});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)jl.kqmz("kqnd", kqnc(int ), (int)2);
                ** GOTO lbl-1000
            }
            case 1: {
                var2_1 /* !! */  = (int)jl.kqmz("kqne", kqnc(int ), (int)3);
            }
            case 2: {
                ** GOTO lbl18
            }
            case 4: lbl-1000:
            // 2 sources

            {
                var2_1 /* !! */  = (int)jl.kqmz("kqnh", kqnc(int ), (int)6);
lbl18:
                // 2 sources

                var2_1 /* !! */  = (int)jl.kqmz("kqnf", kqnc(int ), (int)4);
            }
            case 3: 
        }
        while (true) {
            var2_1 /* !! */  = (int)jl.kqmz("kqng", kqnc(int ), (int)5);
        }
    }

    private static /* synthetic */ long kqni(int n2) {
        return kqnj[n2] ^ kqnk[n2];
    }

    private static /* synthetic */ void kqov() {
        jl.kqmy[0] = -2016952981;
        jl.kqmy[1] = -998475303;
        jl.kqmy[2] = 1935836512;
        jl.kqmy[3] = 467208920;
        jl.kqmy[4] = -584985285;
        jl.kqmy[5] = 1948444808;
        jl.kqmy[6] = -449001820;
        jl.kqmy[7] = 380009831;
        jl.kqmy[8] = -1046137461;
        jl.kqmy[9] = -1566501976;
        jl.kqmy[10] = 1033970585;
        jl.kqmy[11] = -634976875;
        jl.kqmy[12] = 1178487535;
        jl.kqmy[13] = 692557140;
        jl.kqmy[14] = 1360250466;
        jl.kqmy[15] = 1176242826;
        jl.kqmy[16] = 857140992;
        jl.kqmy[17] = 1789561974;
        jl.kqmy[18] = 67207403;
        jl.kqmy[19] = 1565019728;
        jl.kqmy[20] = -998393100;
        jl.kqmy[21] = -1093372940;
        jl.kqmy[22] = -334418636;
        jl.kqmy[23] = -1355402518;
        jl.kqmy[24] = -761452132;
    }
}

