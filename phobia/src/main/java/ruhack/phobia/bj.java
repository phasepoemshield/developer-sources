/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import ruhack.phobia.az;

public class bj
implements az {
    private final class_1297 target;
    private static final long ji = 8257599664706669880L;
    private static int[] dvxw;
    private static long[] dvxk;
    private static long[] dvxh;
    public static final int b;
    public static final boolean c;
    public static final boolean a;
    private static int[] dvxo;

    static {
        dvxo = new int[15];
        dvxw = new int[15];
        bj.dvzj();
        bj.dvzm();
        dvxh = new long[4];
        dvxk = new long[4];
        bj.dvzt();
        bj.dwaa();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public bj(class_1297 var1_1) {
        var3_2 /* !! */  = bj.b;
        var2_3 = bj.a;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.target = var1_1;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)bj.dvxl("dvzd", dvxn(int ), (int)12);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)bj.dvxl("dvzf", dvxn(int ), (int)13);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)bj.dvxl("dvzg", dvxn(int ), (int)14);
        ** while (true)
    }

    public static /* synthetic */ CallSite dvxl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dvzj() {
        bj.dvxo[0] = -274578622;
        bj.dvxo[1] = 1382713830;
        bj.dvxo[2] = -312719074;
        bj.dvxo[3] = 1924049914;
        bj.dvxo[4] = -919444670;
        bj.dvxo[5] = 125020283;
        bj.dvxo[6] = -1573858732;
        bj.dvxo[7] = 1492266112;
        bj.dvxo[8] = 872011318;
        bj.dvxo[9] = -1653057278;
        bj.dvxo[10] = -923783020;
        bj.dvxo[11] = -801201318;
        bj.dvxo[12] = -1727847195;
        bj.dvxo[13] = -244011058;
        bj.dvxo[14] = -624862540;
    }

    private static /* synthetic */ int dvxn(int n2) {
        return dvxo[n2] ^ dvxw[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public class_1297 getTarget() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ji - bj.dvxl("dvxm", dvxc(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == bj.dvxl("dvxx", dvxn(int ), (int)0)) break;
            object = bj.dvxl("dvxy", dvxn(int ), (int)1);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ji - bj.dvxl("dvya", dvxc(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == bj.dvxl("dvyc", dvxn(int ), (int)2)) break;
            object = bj.dvxl("dvyd", dvxn(int ), (int)3);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ji - bj.dvxl("dvye", dvxc(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == bj.dvxl("dvyk", dvxn(int ), (int)4)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = bj.dvxl("dvym", dvxn(int ), (int)5);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ji - bj.dvxl("dvyp", dvxc(int ), (int)3)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == bj.dvxl("dvyq", dvxn(int ), (int)6)) {
                return this.target;
            }
            object = bj.dvxl("dvys", dvxn(int ), (int)7);
        }
    }

    private static /* synthetic */ void dwaa() {
        bj.dvxk[0] = -7410164263960801736L;
        bj.dvxk[1] = -7778032415890432864L;
        bj.dvxk[2] = 6546149626731687343L;
        bj.dvxk[3] = 4115937370668829366L;
    }

    private static /* synthetic */ void dvzm() {
        bj.dvxw[0] = -274578621;
        bj.dvxw[1] = -519313351;
        bj.dvxw[2] = -312719073;
        bj.dvxw[3] = -1060060645;
        bj.dvxw[4] = 919444669;
        bj.dvxw[5] = -1403823280;
        bj.dvxw[6] = -1573858731;
        bj.dvxw[7] = 338695398;
        bj.dvxw[8] = 872011317;
        bj.dvxw[9] = -1653057277;
        bj.dvxw[10] = -923783018;
        bj.dvxw[11] = -801201319;
        bj.dvxw[12] = -1727847193;
        bj.dvxw[13] = -244011058;
        bj.dvxw[14] = -624862538;
    }

    private static /* synthetic */ void dvzt() {
        bj.dvxh[0] = -4939483655021981914L;
        bj.dvxh[1] = -7863462636058747323L;
        bj.dvxh[2] = 2632289394170003615L;
        bj.dvxh[3] = 6527775204391699460L;
    }

    private static /* synthetic */ long dvxc(int n2) {
        return dvxh[n2] ^ dvxk[n2];
    }
}

