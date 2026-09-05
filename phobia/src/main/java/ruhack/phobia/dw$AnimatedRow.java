/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.dw$Row;

final class dw$AnimatedRow {
    private static int[] dkua = new int[4];
    protected static final long hu = 3769559407329584016L;
    private static int[] dkub = new int[4];
    private float progress;
    public static final int b;
    private dw.Row row;

    private static /* synthetic */ int dktz(int n2) {
        return dkua[n2] ^ dkub[n2];
    }

    static {
        dw$AnimatedRow.dkuh();
        dw$AnimatedRow.dkui();
    }

    public static /* synthetic */ CallSite dkuc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dkui() {
        dw$AnimatedRow.dkub[0] = -228681662;
        dw$AnimatedRow.dkub[1] = -1574269684;
        dw$AnimatedRow.dkub[2] = 982593954;
        dw$AnimatedRow.dkub[3] = -220443573;
    }

    private static /* synthetic */ void dkuh() {
        dw$AnimatedRow.dkua[0] = -228681664;
        dw$AnimatedRow.dkua[1] = -1574269683;
        dw$AnimatedRow.dkua[2] = 982593952;
        dw$AnimatedRow.dkua[3] = -220443574;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private dw$AnimatedRow(dw.Row var1_1) {
        block8: {
            var3_2 /* !! */  = dw$AnimatedRow.b;
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block6: do {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        this.row = var1_1;
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)dw$AnimatedRow.dkuc("dkuf", dktz(int ), (int)2);
                        cfr_temp_0 = 1;
                        continue block6;
                    }
                    case 3: {
                        break block8;
                    }
lbl18:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 1;
                        var3_2 /* !! */  = (int)dw$AnimatedRow.dkuc("dkud", dktz(int ), (int)0);
                        break;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_2 /* !! */  = (int)dw$AnimatedRow.dkuc("dkue", dktz(int ), (int)1);
        }
        var3_2 /* !! */  = (int)dw$AnimatedRow.dkuc("dkug", dktz(int ), (int)3);
        ** while (true)
    }
}

