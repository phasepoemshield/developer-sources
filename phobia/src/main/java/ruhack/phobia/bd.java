/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.az;
import ruhack.phobia.bb;

public abstract class bd
implements bb,
az {
    private static int[] dwzm;
    public static final int b;
    private static int[] dwzl;
    public static final boolean c;
    private static long[] dxao;
    private final byte type;
    public static final boolean a;
    static final long jn = -3905131554900522076L;
    private static long[] dxan;

    static {
        dwzl = new int[13];
        dwzm = new int[13];
        bd.dxbm();
        bd.dxbp();
        dxan = new long[9];
        dxao = new long[9];
        bd.dxbu();
        bd.dxby();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected bd(byte var1_1) {
        var3_2 /* !! */  = bd.b;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.type = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)bd.dwzu("dwzy", dwzk(int ), (int)0);
            }
lbl10:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)bd.dwzu("dxab", dwzk(int ), (int)1);
                break;
            }
            case 2: {
                var3_2 /* !! */  = (int)bd.dwzu("dxac", dwzk(int ), (int)2);
                ** GOTO lbl10
            }
            case 3: 
        }
        while (true) {
            var3_2 /* !! */  = (int)bd.dwzu("dxae", dwzk(int ), (int)3);
        }
    }

    private static /* synthetic */ void dxbu() {
        bd.dxan[0] = 5392029507252796277L;
        bd.dxan[1] = -2197697009412184744L;
        bd.dxan[2] = 3150177780076882040L;
        bd.dxan[3] = 1344164055927271651L;
        bd.dxan[4] = 7309359723858804581L;
        bd.dxan[5] = 5779922498553763781L;
        bd.dxan[6] = -5525460854593881737L;
        bd.dxan[7] = 1729656855867793464L;
        bd.dxan[8] = 8306341957871819044L;
    }

    public static /* synthetic */ CallSite dwzu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public byte getType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bd.jn - bd.dwzu("dxap", dxaf(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == bd.dwzu("dxaq", dwzk(int ), (int)4)) break;
            v0 /* !! */  = (long)bd.dwzu("dxav", dwzk(int ), (int)5);
        }
        var3_1 = bd.c;
        v1 /* !! */  = bd.jn;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - bd.dwzu("dxaw", dxaf(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2063840348: {
                    break block18;
                }
                case -1136136401: {
                    v2 = bd.dwzu("dxax", dxaf(int ), (int)2);
                    continue block18;
                }
                case 1037814321: {
                    v2 = bd.dwzu("dxay", dxaf(int ), (int)3);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = bd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = bd.jn - bd.dwzu("dxaz", dxaf(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == bd.dwzu("dxba", dwzk(int ), (int)6)) break;
            v3 /* !! */  = (long)bd.dwzu("dxbb", dwzk(int ), (int)7);
        }
        var1_3 = bd.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (byte)bd.dwzu("dxbc", dwzk(int ), (int)8);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = bd.jn;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - bd.dwzu("dxbd", dxaf(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2063840348: {
                            break block21;
                        }
                        case -770683147: {
                            v5 = bd.dwzu("dxbe", dxaf(int ), (int)6);
                            continue block21;
                        }
                        case 409033421: {
                            v5 = bd.dwzu("dxbf", dxaf(int ), (int)7);
                            continue block21;
                        }
                        case 721311722: {
                            v5 = bd.dwzu("dxbg", dxaf(int ), (int)8);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.type;
            }
            case 0: {
                var2_2 /* !! */  = (int)bd.dwzu("dxbh", dwzk(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
            }
lbl58:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)bd.dwzu("dxbi", dwzk(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)bd.dwzu("dxbj", dwzk(int ), (int)11);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)bd.dwzu("dxbk", dwzk(int ), (int)12);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int dwzk(int n2) {
        return dwzl[n2] ^ dwzm[n2];
    }

    private static /* synthetic */ void dxbm() {
        bd.dwzl[0] = -1721465825;
        bd.dwzl[1] = 647600635;
        bd.dwzl[2] = 1033479599;
        bd.dwzl[3] = -566325257;
        bd.dwzl[4] = 448347476;
        bd.dwzl[5] = -1244097804;
        bd.dwzl[6] = 2049098849;
        bd.dwzl[7] = -678136133;
        bd.dwzl[8] = -744810238;
        bd.dwzl[9] = -1850444857;
        bd.dwzl[10] = 1263780276;
        bd.dwzl[11] = -828919796;
        bd.dwzl[12] = -696905515;
    }

    private static /* synthetic */ void dxby() {
        bd.dxao[0] = -2298873772045187712L;
        bd.dxao[1] = -6405424362708392985L;
        bd.dxao[2] = 8948276373666762120L;
        bd.dxao[3] = 8079105139540137167L;
        bd.dxao[4] = 1536962363503663470L;
        bd.dxao[5] = -5490672480058028426L;
        bd.dxao[6] = -1237449511843530812L;
        bd.dxao[7] = 1563668885311711164L;
        bd.dxao[8] = 5716396543472124824L;
    }

    private static /* synthetic */ long dxaf(int n2) {
        return dxan[n2] ^ dxao[n2];
    }

    private static /* synthetic */ void dxbp() {
        bd.dwzm[0] = -1721465826;
        bd.dwzm[1] = 647600633;
        bd.dwzm[2] = 1033479598;
        bd.dwzm[3] = -566325259;
        bd.dwzm[4] = 448347477;
        bd.dwzm[5] = 1437006227;
        bd.dwzm[6] = -2049098850;
        bd.dwzm[7] = -1132019339;
        bd.dwzm[8] = -744810125;
        bd.dwzm[9] = -1850444859;
        bd.dwzm[10] = 1263780278;
        bd.dwzm[11] = -828919793;
        bd.dwzm[12] = -696905513;
    }
}

