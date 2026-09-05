/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ec$BindRow;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ec$AnimatedBindRow {
    public static final int b;
    private static int[] b;
    private ec.BindRow row;
    private static int[] c;
    private float progress;
    public static final long b = 294991555478791279L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ec$AnimatedBindRow(ec.BindRow var1_1) {
        var3_2 /* !! */  = ec$AnimatedBindRow.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.row = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)ec$AnimatedBindRow.d("e", a(int ), (int)0);
            }
lbl10:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ec$AnimatedBindRow.d("f", a(int ), (int)1);
                    break block0;
                    break;
                }
            }
            case 2: {
                var3_2 /* !! */  = (int)ec$AnimatedBindRow.d("g", a(int ), (int)2);
                ** GOTO lbl10
            }
            case 3: 
        }
        var3_2 /* !! */  = (int)ec$AnimatedBindRow.d("h", a(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ int a(int n2) {
        return b[n2] ^ c[n2];
    }

    public static /* synthetic */ CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void i() {
        ec$AnimatedBindRow.b[0] = -1425622270;
        ec$AnimatedBindRow.b[1] = 1844184966;
        ec$AnimatedBindRow.b[2] = 2085804862;
        ec$AnimatedBindRow.b[3] = -82004872;
    }

    static {
        b = new int[4];
        c = new int[4];
        ec$AnimatedBindRow.i();
        ec$AnimatedBindRow.j();
    }

    private static /* synthetic */ void j() {
        ec$AnimatedBindRow.c[0] = -1425622271;
        ec$AnimatedBindRow.c[1] = 1844184964;
        ec$AnimatedBindRow.c[2] = 2085804863;
        ec$AnimatedBindRow.c[3] = -82004871;
    }
}

