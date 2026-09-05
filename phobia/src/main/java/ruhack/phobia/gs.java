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

public class gs
extends ds {
    private static int[] cyuf;
    public static final boolean a;
    private static int[] cyue;
    public static final int b;
    private static long[] cytw;
    static final long gs = 4083277941885484852L;
    public static final boolean c;
    private static long[] cytx;

    static {
        cyue = new int[11];
        cyuf = new int[11];
        ruhack.phobia.gs.cyuw();
        ruhack.phobia.gs.cyux();
        cytw = new long[9];
        cytx = new long[9];
        ruhack.phobia.gs.cyuy();
        ruhack.phobia.gs.cyuz();
    }

    private static /* synthetic */ long cytv(int n2) {
        return cytw[n2] ^ cytx[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public gs() {
        block6: {
            int n2 = b;
            boolean bl2 = a;
            super("NoInteract", "\u041d\u0435 \u0434\u0430\u0435\u0442 \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u043e\u0432\u0430\u0442\u044c \u0441 \u0431\u043b\u043e\u043a\u0430\u043c\u0438", du.PLAYER);
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    break block6;
                }
                case 1: {
                    CallSite callSite = ruhack.phobia.gs.cyty("cyuu", cyud(int ), (int)9);
                    break;
                }
                case 2: 
            }
            CallSite callSite = ruhack.phobia.gs.cyty("cyuv", cyud(int ), (int)10);
        }
        while (true) {
            CallSite callSite = ruhack.phobia.gs.cyty("cyut", cyud(int ), (int)8);
        }
    }

    private static /* synthetic */ void cyuy() {
        ruhack.phobia.gs.cytw[0] = -3125331504349724245L;
        ruhack.phobia.gs.cytw[1] = 1314492540899462717L;
        ruhack.phobia.gs.cytw[2] = -6217913555378877899L;
        ruhack.phobia.gs.cytw[3] = 3010431334843673738L;
        ruhack.phobia.gs.cytw[4] = 6154032921198787704L;
        ruhack.phobia.gs.cytw[5] = -8793887822941061328L;
        ruhack.phobia.gs.cytw[6] = -8304160635783728112L;
        ruhack.phobia.gs.cytw[7] = 6149360066718383323L;
        ruhack.phobia.gs.cytw[8] = -6777857385818887553L;
    }

    public static /* synthetic */ CallSite cyty(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cyuw() {
        ruhack.phobia.gs.cyue[0] = 1269120493;
        ruhack.phobia.gs.cyue[1] = -615927191;
        ruhack.phobia.gs.cyue[2] = -1340200;
        ruhack.phobia.gs.cyue[3] = -563457485;
        ruhack.phobia.gs.cyue[4] = -1110717329;
        ruhack.phobia.gs.cyue[5] = 828653046;
        ruhack.phobia.gs.cyue[6] = -269237639;
        ruhack.phobia.gs.cyue[7] = -532546613;
        ruhack.phobia.gs.cyue[8] = -123523586;
        ruhack.phobia.gs.cyue[9] = -872299350;
        ruhack.phobia.gs.cyue[10] = -1642372631;
    }

    private static /* synthetic */ void cyuz() {
        ruhack.phobia.gs.cytx[0] = -7258135739306385220L;
        ruhack.phobia.gs.cytx[1] = 6234726951734131755L;
        ruhack.phobia.gs.cytx[2] = 2047390141029841688L;
        ruhack.phobia.gs.cytx[3] = -785354029127830624L;
        ruhack.phobia.gs.cytx[4] = 5670281674088746938L;
        ruhack.phobia.gs.cytx[5] = -4217613979267449193L;
        ruhack.phobia.gs.cytx[6] = -998143691146965727L;
        ruhack.phobia.gs.cytx[7] = 3104263218314865882L;
        ruhack.phobia.gs.cytx[8] = 6519646593020459336L;
    }

    private static /* synthetic */ void cyux() {
        ruhack.phobia.gs.cyuf[0] = 1269120492;
        ruhack.phobia.gs.cyuf[1] = -1891429457;
        ruhack.phobia.gs.cyuf[2] = -1340199;
        ruhack.phobia.gs.cyuf[3] = -129072842;
        ruhack.phobia.gs.cyuf[4] = -1110717332;
        ruhack.phobia.gs.cyuf[5] = 828653046;
        ruhack.phobia.gs.cyuf[6] = -269237638;
        ruhack.phobia.gs.cyuf[7] = -532546616;
        ruhack.phobia.gs.cyuf[8] = -123523585;
        ruhack.phobia.gs.cyuf[9] = -872299349;
        ruhack.phobia.gs.cyuf[10] = -1642372631;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gs getInstance() {
        v0 /* !! */  = ruhack.phobia.gs.gs;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ruhack.phobia.gs.cyty("cytz", cytv(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 931060733: {
                    v1 = ruhack.phobia.gs.cyty("cyua", cytv(int ), (int)1);
                    continue block17;
                }
                case 987279078: {
                    v1 = ruhack.phobia.gs.cyty("cyub", cytv(int ), (int)2);
                    continue block17;
                }
                case 1833287476: {
                    break block17;
                }
            }
            break;
        }
        var2 = ruhack.phobia.gs.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ruhack.phobia.gs.gs - ruhack.phobia.gs.cyty("cyuc", cytv(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ruhack.phobia.gs.cyty("cyug", cyud(int ), (int)0)) break;
            v2 /* !! */  = (long)ruhack.phobia.gs.cyty("cyuh", cyud(int ), (int)1);
        }
        var1_1 /* !! */  = ruhack.phobia.gs.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ruhack.phobia.gs.gs - ruhack.phobia.gs.cyty("cyui", cytv(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ruhack.phobia.gs.cyty("cyuj", cyud(int ), (int)2)) break;
            v3 /* !! */  = (long)ruhack.phobia.gs.cyty("cyuk", cyud(int ), (int)3);
        }
        var0_2 = ruhack.phobia.gs.a;
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
                v4 /* !! */  = ruhack.phobia.gs.gs;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ruhack.phobia.gs.cyty("cyul", cytv(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2125215342: {
                            v5 = ruhack.phobia.gs.cyty("cyum", cytv(int ), (int)6);
                            continue block21;
                        }
                        case 1048620521: {
                            v5 = ruhack.phobia.gs.cyty("cyun", cytv(int ), (int)7);
                            continue block21;
                        }
                        case 1514742773: {
                            v5 = ruhack.phobia.gs.cyty("cyuo", cytv(int ), (int)8);
                            continue block21;
                        }
                        case 1833287476: {
                            break block21;
                        }
                    }
                    break;
                }
                return nj.get(gs.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)ruhack.phobia.gs.cyty("cyup", cyud(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl59:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)ruhack.phobia.gs.cyty("cyuq", cyud(int ), (int)5);
                if (!var2) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ruhack.phobia.gs.cyty("cyur", cyud(int ), (int)6);
                    if (!var2) ** GOTO lbl59
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ruhack.phobia.gs.cyty("cyus", cyud(int ), (int)7);
        ** while (!var2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int cyud(int n2) {
        return cyue[n2] ^ cyuf[n2];
    }
}

