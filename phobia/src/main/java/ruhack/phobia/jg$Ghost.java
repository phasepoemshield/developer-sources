/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10055
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_10055;
import net.minecraft.class_243;

final class jg$Ghost {
    private final class_243 position;
    private static int[] eoli = new int[6];
    private final int targetId;
    private final long createdNanos;
    private static int[] eolj = new int[6];
    public static final long lb = 3056877107594965064L;
    private class_10055 frozenState;
    public static final int b;

    private static /* synthetic */ int eolh(int n2) {
        return eoli[n2] ^ eolj[n2];
    }

    static {
        jg$Ghost.eolr();
        jg$Ghost.eols();
    }

    private static /* synthetic */ void eols() {
        jg$Ghost.eolj[0] = -1547103651;
        jg$Ghost.eolj[1] = -1660714650;
        jg$Ghost.eolj[2] = 1213086827;
        jg$Ghost.eolj[3] = -965994359;
        jg$Ghost.eolj[4] = 2011638876;
        jg$Ghost.eolj[5] = -1984400518;
    }

    private static /* synthetic */ void eolr() {
        jg$Ghost.eoli[0] = -1547103650;
        jg$Ghost.eoli[1] = -1660714650;
        jg$Ghost.eoli[2] = 1213086824;
        jg$Ghost.eoli[3] = -965994357;
        jg$Ghost.eoli[4] = 2011638873;
        jg$Ghost.eoli[5] = -1984400513;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jg$Ghost(int var1_1, class_243 var2_2, long var3_3) {
        var6_4 /* !! */  = jg$Ghost.b;
        super();
        this.targetId = var1_1;
        this.position = var2_2;
        this.createdNanos = var3_3;
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                var6_4 /* !! */  = (int)jg$Ghost.eolk("eoll", eolh(int ), (int)0);
                ** GOTO lbl25
            }
            case 1: {
                while (true) {
                    var6_4 /* !! */  = (int)jg$Ghost.eolk("eolm", eolh(int ), (int)1);
                }
            }
            case 2: {
                while (true) {
                    var6_4 /* !! */  = (int)jg$Ghost.eolk("eoln", eolh(int ), (int)2);
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)jg$Ghost.eolk("eolo", eolh(int ), (int)3);
                    ** GOTO lbl10
                    break;
                }
            }
lbl25:
            // 2 sources

            case 4: {
                var6_4 /* !! */  = (int)jg$Ghost.eolk("eolp", eolh(int ), (int)4);
            }
            case 5: 
        }
        var6_4 /* !! */  = (int)jg$Ghost.eolk("eolq", eolh(int ), (int)5);
        ** while (true)
    }

    public static /* synthetic */ CallSite eolk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

