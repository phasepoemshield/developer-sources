/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Structure
 */
package ruhack.phobia;

import com.sun.jna.Structure;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;

public class pk
extends Structure {
    public String username;
    private static long[] kymd;
    public String avatar;
    public static final long tj = 744756681224868583L;
    private static long[] kymc;
    public String userId;
    private static int[] kymh;
    public static final int b;
    private static int[] kymi;
    @Deprecated
    public String discriminator;
    public static final boolean a;
    public static final boolean c;

    public static /* synthetic */ CallSite kyme(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int kymg(int n2) {
        return kymh[n2] ^ kymi[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected List<String> getFieldOrder() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pk.tj - pk.kyme("kymf", kymb(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pk.kyme("kymj", kymg(int ), (int)0)) break;
            v0 /* !! */  = (long)pk.kyme("kymk", kymg(int ), (int)1);
        }
        var3_1 = pk.c;
        v1 /* !! */  = pk.tj;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(pk.kyme("kymm", kymb(int ), (int)2) - pk.kyme("kyml", kymb(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1080316046: {
                    continue block15;
                }
                case 1954665191: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = pk.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = pk.tj - pk.kyme("kymn", kymb(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pk.kyme("kymo", kymg(int ), (int)2)) break;
            v2 /* !! */  = (long)pk.kyme("kymp", kymg(int ), (int)3);
        }
        var1_3 = pk.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 = new String[]{"userId", "username", "discriminator", "avatar"};
                v4 /* !! */  = pk.tj;
                if (true) ** GOTO lbl39
                block18: while (true) {
                    v4 /* !! */  = (long)(pk.kyme("kymr", kymb(int ), (int)5) - pk.kyme("kymq", kymb(int ), (int)4));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 676033257: {
                            continue block18;
                        }
                        case 1954665191: {
                            break block18;
                        }
                    }
                    break;
                }
                return Arrays.asList(v3);
            }
lbl45:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)pk.kyme("kyms", kymg(int ), (int)4);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                var2_2 /* !! */  = (int)pk.kyme("kymt", kymg(int ), (int)5);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
lbl54:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)pk.kyme("kymu", kymg(int ), (int)6);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)pk.kyme("kymv", kymg(int ), (int)7);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kymy() {
        pk.kymc[0] = -9042083321163219069L;
        pk.kymc[1] = -3659772643889202124L;
        pk.kymc[2] = -6011221302093475777L;
        pk.kymc[3] = 4674189124235048059L;
        pk.kymc[4] = -6889685940002324194L;
        pk.kymc[5] = -4232018313572774306L;
    }

    static {
        kymh = new int[8];
        kymi = new int[8];
        pk.kymw();
        pk.kymx();
        kymc = new long[6];
        kymd = new long[6];
        pk.kymy();
        pk.kymz();
    }

    public pk() {
    }

    private static /* synthetic */ void kymw() {
        pk.kymh[0] = -1435262837;
        pk.kymh[1] = 1822535904;
        pk.kymh[2] = 1484448745;
        pk.kymh[3] = -1439661255;
        pk.kymh[4] = 99642965;
        pk.kymh[5] = -1200222333;
        pk.kymh[6] = 166805180;
        pk.kymh[7] = -707279835;
    }

    private static /* synthetic */ void kymx() {
        pk.kymi[0] = -1435262838;
        pk.kymi[1] = -857202431;
        pk.kymi[2] = -1484448746;
        pk.kymi[3] = -1087463152;
        pk.kymi[4] = 99642964;
        pk.kymi[5] = -1200222336;
        pk.kymi[6] = 166805182;
        pk.kymi[7] = -707279835;
    }

    private static /* synthetic */ long kymb(int n2) {
        return kymc[n2] ^ kymd[n2];
    }

    private static /* synthetic */ void kymz() {
        pk.kymd[0] = -8499151180497011971L;
        pk.kymd[1] = 7458992124954757636L;
        pk.kymd[2] = 8296142820920464450L;
        pk.kymd[3] = 5970624826597937762L;
        pk.kymd[4] = 8576296023953489423L;
        pk.kymd[5] = -105539438795175356L;
    }
}

