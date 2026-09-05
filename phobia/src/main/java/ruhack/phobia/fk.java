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

public class fk
extends ds {
    public static final boolean a;
    private static int[] htcl;
    public static final int b;
    private static fk instance;
    private static long[] htcu;
    private static int[] htcm;
    protected static final long ow = -5917317990736852919L;
    public static final boolean c;
    private static long[] htct;

    private static /* synthetic */ int htck(int n2) {
        return htcl[n2] ^ htcm[n2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public fk() {
        int n2 = b;
        super("Scoreboard Health", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 scoreboard \u0434\u043b\u044f \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u044f \u0438\u0433\u0440\u043e\u043a\u043e\u0432", du.MISC);
        instance = this;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                CallSite callSite = fk.htcn("htco", htck(int ), (int)0);
                break;
            }
            case 1: {
                CallSite callSite = fk.htcn("htcp", htck(int ), (int)1);
                break;
            }
            case 2: {
                CallSite callSite = fk.htcn("htcq", htck(int ), (int)2);
            }
            case 3: 
        }
        while (true) {
            CallSite callSite = fk.htcn("htcr", htck(int ), (int)3);
        }
    }

    private static /* synthetic */ void hteb() {
        fk.htcm[0] = -1673372214;
        fk.htcm[1] = -2054050594;
        fk.htcm[2] = 204338160;
        fk.htcm[3] = -1153974113;
        fk.htcm[4] = 1371744764;
        fk.htcm[5] = -1709396238;
        fk.htcm[6] = 91729734;
        fk.htcm[7] = -1061496050;
        fk.htcm[8] = 1492351045;
        fk.htcm[9] = -839430017;
        fk.htcm[10] = 1463263990;
        fk.htcm[11] = -541889380;
        fk.htcm[12] = 623744207;
        fk.htcm[13] = -783290145;
        fk.htcm[14] = 502325437;
        fk.htcm[15] = 818644965;
        fk.htcm[16] = -1273791443;
        fk.htcm[17] = -2026636049;
        fk.htcm[18] = 839073852;
        fk.htcm[19] = 792191481;
        fk.htcm[20] = -1062910033;
        fk.htcm[21] = 938092422;
        fk.htcm[22] = -2062374720;
        fk.htcm[23] = 355812295;
    }

    private static /* synthetic */ void htea() {
        fk.htcl[0] = -1673372215;
        fk.htcl[1] = -2054050596;
        fk.htcl[2] = 204338161;
        fk.htcl[3] = -1153974114;
        fk.htcl[4] = -1371744765;
        fk.htcl[5] = 711865313;
        fk.htcl[6] = -91729735;
        fk.htcl[7] = -376981059;
        fk.htcl[8] = 1492351044;
        fk.htcl[9] = 839430016;
        fk.htcl[10] = -1237913140;
        fk.htcl[11] = -541889379;
        fk.htcl[12] = 767713442;
        fk.htcl[13] = -783290146;
        fk.htcl[14] = 502325437;
        fk.htcl[15] = 818644960;
        fk.htcl[16] = -1273791451;
        fk.htcl[17] = -2026636052;
        fk.htcl[18] = 839073850;
        fk.htcl[19] = 792191482;
        fk.htcl[20] = -1062910034;
        fk.htcl[21] = 938092417;
        fk.htcl[22] = -2062374716;
        fk.htcl[23] = 355812294;
    }

    private static /* synthetic */ void htec() {
        fk.htct[0] = 5739509636072931966L;
        fk.htct[1] = 7979162232694786737L;
        fk.htct[2] = 6804271749296043100L;
        fk.htct[3] = -6680136469114587813L;
        fk.htct[4] = 5046357283809616691L;
        fk.htct[5] = -1387108852296581091L;
        fk.htct[6] = 1926063814660965925L;
        fk.htct[7] = -7835445593481125982L;
        fk.htct[8] = -2366742954711212702L;
        fk.htct[9] = 8408863074600293217L;
        fk.htct[10] = -4760341182588653518L;
    }

    public static /* synthetic */ CallSite htcn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        htcl = new int[24];
        htcm = new int[24];
        fk.htea();
        fk.hteb();
        htct = new long[11];
        htcu = new long[11];
        fk.htec();
        fk.hted();
    }

    private static /* synthetic */ long htcs(int n2) {
        return htct[n2] ^ htcu[n2];
    }

    private static /* synthetic */ void hted() {
        fk.htcu[0] = -7596367029555248009L;
        fk.htcu[1] = 6943969484563728798L;
        fk.htcu[2] = 6875817049058509125L;
        fk.htcu[3] = 2278470037892764424L;
        fk.htcu[4] = -5435575322815696365L;
        fk.htcu[5] = -3439794123889732112L;
        fk.htcu[6] = 3030667628294400577L;
        fk.htcu[7] = 6113461333327490857L;
        fk.htcu[8] = -5817725337189126628L;
        fk.htcu[9] = -8252126304193450593L;
        fk.htcu[10] = 2205732076806520272L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean enabled() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fk.ow - fk.htcn("htcv", htcs(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fk.htcn("htcw", htck(int ), (int)4)) break;
            v0 /* !! */  = (long)fk.htcn("htcx", htck(int ), (int)5);
        }
        var2 = fk.c;
        v1 /* !! */  = fk.ow;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - fk.htcn("htcy", htcs(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2095445943: {
                    break block23;
                }
                case -1795895482: {
                    v2 = fk.htcn("htcz", htcs(int ), (int)2);
                    continue block23;
                }
                case 1217835815: {
                    v2 = fk.htcn("htda", htcs(int ), (int)3);
                    continue block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = fk.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fk.ow - fk.htcn("htdb", htcs(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fk.htcn("htdc", htck(int ), (int)6)) break;
                    v3 /* !! */  = (long)fk.htcn("htdd", htck(int ), (int)7);
                }
                var0_2 = fk.a;
                if (var2) {
                    throw null;
lbl34:
                    // 4 sources

                    return (boolean)fk.htcn("htde", htck(int ), (int)8);
                }
                if (var0_2 || var0_2) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fk.ow - fk.htcn("htdf", htcs(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fk.htcn("htdg", htck(int ), (int)9)) break;
                    v4 /* !! */  = (long)fk.htcn("htdh", htck(int ), (int)10);
                }
                if (fk.instance == null) ** GOTO lbl73
                if (var0_2) ** GOTO lbl34
                v5 /* !! */  = fk.ow;
                if (true) ** GOTO lbl49
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - fk.htcn("htdi", htcs(int ), (int)6));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2124008049: {
                            v6 = fk.htcn("htdj", htcs(int ), (int)7);
                            continue block27;
                        }
                        case -2095445943: {
                            break block27;
                        }
                        case -333834600: {
                            v6 = fk.htcn("htdk", htcs(int ), (int)8);
                            continue block27;
                        }
                        case 1229563860: {
                            v6 = fk.htcn("htdl", htcs(int ), (int)9);
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = fk.ow - fk.htcn("htdm", htcs(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == fk.htcn("htdn", htck(int ), (int)11)) break;
                    v7 /* !! */  = (long)fk.htcn("htdo", htck(int ), (int)12);
                }
                if (!fk.instance.isState()) ** GOTO lbl73
                if (var0_2) ** GOTO lbl34
                v8 = fk.htcn("htdp", htck(int ), (int)13);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl76
lbl73:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                v8 = fk.htcn("htdq", htck(int ), (int)14);
lbl76:
                // 2 sources

                return (boolean)v8;
            }
            case 0: {
                var1_1 /* !! */  = (int)fk.htcn("htdr", htck(int ), (int)15);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl82:
            // 2 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)fk.htcn("htds", htck(int ), (int)16);
                } while (!var2);
                throw null;
            }
lbl87:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)fk.htcn("htdt", htck(int ), (int)17);
                if (!var2) break;
                throw null;
            }
lbl91:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)fk.htcn("htdu", htck(int ), (int)18);
                if (!var2) ** GOTO lbl87
                throw null;
            }
lbl95:
            // 3 sources

            case 4: {
                var1_1 /* !! */  = (int)fk.htcn("htdv", htck(int ), (int)19);
                if (!var2) ** GOTO lbl82
                throw null;
            }
lbl99:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)fk.htcn("htdw", htck(int ), (int)20);
                if (!var2) ** GOTO lbl95
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)fk.htcn("htdx", htck(int ), (int)21);
                if (!var2) ** GOTO lbl99
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)fk.htcn("htdy", htck(int ), (int)22);
                if (!var2) ** GOTO lbl91
                throw null;
            }
            case 8: 
        }
        do {
            var1_1 /* !! */  = (int)fk.htcn("htdz", htck(int ), (int)23);
        } while (!var2);
        throw null;
    }
}

