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
import ruhack.phobia.nj;

public final class fd
extends ds {
    private static int[] aysn = new int[13];
    protected static final long cr = -3802151503178065479L;
    private static long[] ayta;
    public static final boolean c;
    public static final boolean a;
    private static long[] aytc;
    public static final int b;
    private static int[] ayso;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public fd() {
        block7: {
            var2_1 /* !! */  = fd.b;
            if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super("NoSpherePlace", "\u0417\u0430\u043f\u0440\u0435\u0449\u0430\u0435\u0442 \u0441\u0442\u0430\u0432\u0438\u0442\u044c \u0433\u043e\u043b\u043e\u0432\u044b \u0438\u0433\u0440\u043e\u043a\u043e\u0432 \u043d\u0430 \u0431\u043b\u043e\u043a\u0438", du.MISC);
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        break block7;
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 1;
                        var2_1 /* !! */  = (int)fd.aysq("ayss", aysl(int ), (int)0);
                        break;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_1 /* !! */  = (int)fd.aysq("ayst", aysl(int ), (int)1);
        }
        var2_1 /* !! */  = (int)fd.aysq("aysx", aysl(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void ayuf() {
        fd.ayta[0] = 3875064094230425854L;
        fd.ayta[1] = -7080634664587447770L;
        fd.ayta[2] = -8057570796909920805L;
        fd.ayta[3] = -3283209211120306860L;
        fd.ayta[4] = 7796525209353149448L;
        fd.ayta[5] = -5193986108906905799L;
        fd.ayta[6] = 8211282559014610045L;
    }

    public static /* synthetic */ CallSite aysq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int aysl(int n2) {
        return aysn[n2] ^ ayso[n2];
    }

    private static /* synthetic */ void ayuc() {
        fd.ayso[0] = -1658367006;
        fd.ayso[1] = 126691199;
        fd.ayso[2] = 1869791380;
        fd.ayso[3] = -1213714256;
        fd.ayso[4] = -814056445;
        fd.ayso[5] = 1566835574;
        fd.ayso[6] = 556997716;
        fd.ayso[7] = 1565540439;
        fd.ayso[8] = -796810988;
        fd.ayso[9] = 1293236058;
        fd.ayso[10] = -661545672;
        fd.ayso[11] = 1898921777;
        fd.ayso[12] = 1482233959;
    }

    private static /* synthetic */ void ayui() {
        fd.aytc[0] = 9013647213321704059L;
        fd.aytc[1] = 8659557510546399069L;
        fd.aytc[2] = 1477622597963766367L;
        fd.aytc[3] = 2831195838806206909L;
        fd.aytc[4] = -5886869095584987243L;
        fd.aytc[5] = 2323814305621738610L;
        fd.aytc[6] = -5898973082385378915L;
    }

    private static /* synthetic */ long aysz(int n2) {
        return ayta[n2] ^ aytc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static fd getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fd.cr - fd.aysq("aytd", aysz(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fd.aysq("ayte", aysl(int ), (int)3)) break;
            v0 /* !! */  = (long)fd.aysq("aytg", aysl(int ), (int)4);
        }
        var2 = fd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fd.cr - fd.aysq("ayti", aysz(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fd.aysq("aytj", aysl(int ), (int)5)) break;
            v1 /* !! */  = (long)fd.aysq("aytk", aysl(int ), (int)6);
        }
        var1_1 = fd.b;
        v2 /* !! */  = fd.cr;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - fd.aysq("aytl", aysz(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2051166741: {
                    v3 = fd.aysq("aytm", aysz(int ), (int)3);
                    continue block8;
                }
                case -907247341: {
                    v3 = fd.aysq("aytn", aysz(int ), (int)4);
                    continue block8;
                }
                case 1054513593: {
                    break block8;
                }
                case 2016955862: {
                    v3 = fd.aysq("aytq", aysz(int ), (int)5);
                    continue block8;
                }
            }
            break;
        }
        var0_2 = fd.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fd.cr - fd.aysq("aytr", aysz(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fd.aysq("ayts", aysl(int ), (int)7)) break;
            v4 /* !! */  = (long)fd.aysq("aytt", aysl(int ), (int)8);
        }
        return nj.get(fd.class);
    }

    private static /* synthetic */ void ayub() {
        fd.aysn[0] = -1658367008;
        fd.aysn[1] = 126691197;
        fd.aysn[2] = 1869791381;
        fd.aysn[3] = 1213714255;
        fd.aysn[4] = -1375858851;
        fd.aysn[5] = -1566835575;
        fd.aysn[6] = 1221846706;
        fd.aysn[7] = -1565540440;
        fd.aysn[8] = 1170641724;
        fd.aysn[9] = 1293236057;
        fd.aysn[10] = -661545670;
        fd.aysn[11] = 1898921779;
        fd.aysn[12] = 1482233956;
    }

    static {
        ayso = new int[13];
        fd.ayub();
        fd.ayuc();
        ayta = new long[7];
        aytc = new long[7];
        fd.ayuf();
        fd.ayui();
    }
}

