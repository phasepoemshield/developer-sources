/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.dx$EffectRow;

final class dx$AnimatedEffectRow {
    private dx.EffectRow row;
    public static final int b;
    private float progress;
    private static int[] emir;
    private static final long kx = 4121386365917874530L;
    private static int[] emis;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dx$AnimatedEffectRow(dx.EffectRow var1_1) {
        var3_2 /* !! */  = dx$AnimatedEffectRow.b;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.row = var1_1;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dx$AnimatedEffectRow.emit("emiu", emiq(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)dx$AnimatedEffectRow.emit("emiv", emiq(int ), (int)1);
            }
            case 2: {
                var3_2 /* !! */  = (int)dx$AnimatedEffectRow.emit("emiw", emiq(int ), (int)2);
            }
            case 3: 
        }
        var3_2 /* !! */  = (int)dx$AnimatedEffectRow.emit("emix", emiq(int ), (int)3);
        ** while (true)
    }

    static {
        emir = new int[4];
        emis = new int[4];
        dx$AnimatedEffectRow.emiy();
        dx$AnimatedEffectRow.emiz();
    }

    private static /* synthetic */ void emiy() {
        dx$AnimatedEffectRow.emir[0] = -542030502;
        dx$AnimatedEffectRow.emir[1] = -957007612;
        dx$AnimatedEffectRow.emir[2] = 1796947889;
        dx$AnimatedEffectRow.emir[3] = -2083184987;
    }

    public static /* synthetic */ CallSite emit(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int emiq(int n2) {
        return emir[n2] ^ emis[n2];
    }

    private static /* synthetic */ void emiz() {
        dx$AnimatedEffectRow.emis[0] = -542030503;
        dx$AnimatedEffectRow.emis[1] = -957007609;
        dx$AnimatedEffectRow.emis[2] = 1796947891;
        dx$AnimatedEffectRow.emis[3] = -2083184987;
    }
}

