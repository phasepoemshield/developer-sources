/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_4587;
import ruhack.phobia.az;

public class dj
implements az {
    private static int[] bycw;
    private static long[] bydd;
    private float partialTicks;
    public static final boolean a;
    protected static final long et = -7617412243602805137L;
    private static int[] bycv;
    public static final int b;
    public static final boolean c;
    private static long[] bydc;
    private class_4587 stack;

    private static /* synthetic */ void byem() {
        dj.bycw[0] = -1649133033;
        dj.bycw[1] = -1835134848;
        dj.bycw[2] = 1573157271;
        dj.bycw[3] = 1138057112;
        dj.bycw[4] = 153509816;
        dj.bycw[5] = 156612876;
        dj.bycw[6] = -1980693186;
        dj.bycw[7] = -785434144;
        dj.bycw[8] = -1675087021;
        dj.bycw[9] = 917242963;
        dj.bycw[10] = 1709706996;
        dj.bycw[11] = -258298739;
        dj.bycw[12] = -1857244259;
        dj.bycw[13] = 770782038;
        dj.bycw[14] = 1355149774;
        dj.bycw[15] = -2029379517;
        dj.bycw[16] = 1739612973;
        dj.bycw[17] = -1854584725;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dj(class_4587 var1_1, float var2_2) {
        var4_3 /* !! */  = dj.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.stack = var1_1;
                this.partialTicks = var2_2;
                return;
            }
lbl9:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)dj.bycx("bycy", bycu(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)dj.bycx("bycz", bycu(int ), (int)1);
                ** GOTO lbl9
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)dj.bycx("byda", bycu(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void byel() {
        dj.bycv[0] = -1649133033;
        dj.bycv[1] = -1835134846;
        dj.bycv[2] = 1573157269;
        dj.bycv[3] = -1138057113;
        dj.bycv[4] = -1950379857;
        dj.bycv[5] = -156612877;
        dj.bycv[6] = 954115466;
        dj.bycv[7] = 785434143;
        dj.bycv[8] = -802832924;
        dj.bycv[9] = 917242961;
        dj.bycv[10] = 1709706998;
        dj.bycv[11] = -258298738;
        dj.bycv[12] = -1857244259;
        dj.bycv[13] = 314020073;
        dj.bycv[14] = 1355149774;
        dj.bycv[15] = -2029379519;
        dj.bycv[16] = 1739612975;
        dj.bycv[17] = -1854584727;
    }

    private static /* synthetic */ int bycu(int n2) {
        return bycv[n2] ^ bycw[n2];
    }

    static {
        bycv = new int[18];
        bycw = new int[18];
        dj.byel();
        dj.byem();
        bydc = new long[17];
        bydd = new long[17];
        dj.byen();
        dj.byeo();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_4587 getStack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dj.et - dj.bycx("byde", bydb(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dj.bycx("bydf", bycu(int ), (int)3)) break;
            v0 /* !! */  = (long)dj.bycx("bydg", bycu(int ), (int)4);
        }
        var3_1 = dj.c;
        v1 /* !! */  = dj.et;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(dj.bycx("bydi", bydb(int ), (int)2) - dj.bycx("bydh", bydb(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 695922896: {
                    continue block11;
                }
                case 1482157679: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = dj.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = dj.et - dj.bycx("bydj", bydb(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == dj.bycx("bydk", bycu(int ), (int)5)) break;
                    v2 /* !! */  = (long)dj.bycx("bydl", bycu(int ), (int)6);
                }
                var1_3 = dj.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dj.et - dj.bycx("bydm", bydb(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dj.bycx("bydn", bycu(int ), (int)7)) break;
                    v3 /* !! */  = (long)dj.bycx("bydo", bycu(int ), (int)8);
                }
                return this.stack;
            }
lbl40:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dj.bycx("bydp", bycu(int ), (int)9);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl50
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)dj.bycx("bydq", bycu(int ), (int)10);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
lbl50:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)dj.bycx("bydr", bycu(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dj.bycx("byds", bycu(int ), (int)12);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bydb(int n2) {
        return bydc[n2] ^ bydd[n2];
    }

    private static /* synthetic */ void byen() {
        dj.bydc[0] = 8211008745012056472L;
        dj.bydc[1] = -647747673526263516L;
        dj.bydc[2] = 7186816492704149751L;
        dj.bydc[3] = -6164249493991991500L;
        dj.bydc[4] = -4382821003766423353L;
        dj.bydc[5] = 5970792265727728118L;
        dj.bydc[6] = -3266620282282645162L;
        dj.bydc[7] = -8124536589854135962L;
        dj.bydc[8] = 2162679327088756762L;
        dj.bydc[9] = -3383808066256172373L;
        dj.bydc[10] = 7454988868054034375L;
        dj.bydc[11] = -7184641180530217632L;
        dj.bydc[12] = 2819223540376952554L;
        dj.bydc[13] = -8954928140301648947L;
        dj.bydc[14] = 8048755976356663733L;
        dj.bydc[15] = -8908379634610117144L;
        dj.bydc[16] = -6447741150494261012L;
    }

    private static /* synthetic */ float byec(int n2) {
        return Float.intBitsToFloat(bycv[n2] ^ bycw[n2]);
    }

    public static /* synthetic */ CallSite bycx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void byeo() {
        dj.bydd[0] = 4839703335333431781L;
        dj.bydd[1] = 8573685133219735846L;
        dj.bydd[2] = 1178513719989687718L;
        dj.bydd[3] = 8874016788565849135L;
        dj.bydd[4] = -538551104337590330L;
        dj.bydd[5] = 5688496383130753566L;
        dj.bydd[6] = -9034109081361995792L;
        dj.bydd[7] = 5733482201183277910L;
        dj.bydd[8] = 2959938114181594800L;
        dj.bydd[9] = -3060119001683811346L;
        dj.bydd[10] = 2594958275993035907L;
        dj.bydd[11] = -2875441811795566770L;
        dj.bydd[12] = -3306733216519873207L;
        dj.bydd[13] = -6151359437463042297L;
        dj.bydd[14] = -5186466409545004109L;
        dj.bydd[15] = 3992577577427337830L;
        dj.bydd[16] = 1713007965207622118L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getPartialTicks() {
        v0 /* !! */  = dj.et;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - dj.bycx("bydt", bydb(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -974716176: {
                    v1 = dj.bycx("bydu", bydb(int ), (int)6);
                    continue block26;
                }
                case -451906213: {
                    v1 = dj.bycx("bydv", bydb(int ), (int)7);
                    continue block26;
                }
                case 1482157679: {
                    break block26;
                }
            }
            break;
        }
        var3_1 = dj.c;
        v2 /* !! */  = dj.et;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - dj.bycx("bydw", bydb(int ), (int)8));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1466560042: {
                    v3 = dj.bycx("bydx", bydb(int ), (int)9);
                    continue block27;
                }
                case -1068852881: {
                    v3 = dj.bycx("bydy", bydb(int ), (int)10);
                    continue block27;
                }
                case 1482157679: {
                    break block27;
                }
                case 1874706425: {
                    v3 = dj.bycx("bydz", bydb(int ), (int)11);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = dj.b;
        v4 /* !! */  = dj.et;
        if (true) ** GOTO lbl36
        block28: while (true) {
            v4 /* !! */  = (long)(dj.bycx("byeb", bydb(int ), (int)13) - dj.bycx("byea", bydb(int ), (int)12));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1482157679: {
                    break block28;
                }
                case 1624545604: {
                    continue block28;
                }
            }
            break;
        }
        var1_3 = dj.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)dj.bycx("byed", byec(int ), (int)13);
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block29;
                v5 /* !! */  = dj.et;
                if (true) ** GOTO lbl53
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - dj.bycx("byee", bydb(int ), (int)14));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 365683080: {
                            v6 = dj.bycx("byef", bydb(int ), (int)15);
                            continue block30;
                        }
                        case 1482157679: {
                            break block30;
                        }
                        case 2120431424: {
                            v6 = dj.bycx("byeg", bydb(int ), (int)16);
                            continue block30;
                        }
                    }
                    break;
                }
                return this.partialTicks;
                case 0: {
                    var2_2 /* !! */  = (int)dj.bycx("byeh", bycu(int ), (int)14);
                    if (!var3_1) break block29;
                    throw null;
                }
lbl67:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)dj.bycx("byei", bycu(int ), (int)15);
                    if (!var3_1) break block29;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)dj.bycx("byej", bycu(int ), (int)16);
                        if (!var3_1) ** GOTO lbl67
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dj.bycx("byek", bycu(int ), (int)17);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }
}

