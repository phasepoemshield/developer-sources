/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;

final class hr$TrajectoryCandidate {
    private final class_243 landingPos;
    private static int[] fk;
    private final double distanceToTarget;
    private static final long d = 1809418290076330342L;
    private final float pitch;
    public static final int b;
    private final int ticks;
    private static int[] fj;

    static {
        fj = new int[7];
        fk = new int[7];
        hr$TrajectoryCandidate.ft();
        hr$TrajectoryCandidate.fu();
    }

    private static /* synthetic */ int fi(int n2) {
        return fj[n2] ^ fk[n2];
    }

    public static /* synthetic */ CallSite fl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ft() {
        hr$TrajectoryCandidate.fj[0] = -410550424;
        hr$TrajectoryCandidate.fj[1] = 2014706507;
        hr$TrajectoryCandidate.fj[2] = -1830416161;
        hr$TrajectoryCandidate.fj[3] = 220589524;
        hr$TrajectoryCandidate.fj[4] = -1580397676;
        hr$TrajectoryCandidate.fj[5] = -414409981;
        hr$TrajectoryCandidate.fj[6] = -630788359;
    }

    private static /* synthetic */ void fu() {
        hr$TrajectoryCandidate.fk[0] = -410550423;
        hr$TrajectoryCandidate.fk[1] = 2014706506;
        hr$TrajectoryCandidate.fk[2] = -1830416167;
        hr$TrajectoryCandidate.fk[3] = 220589526;
        hr$TrajectoryCandidate.fk[4] = -1580397679;
        hr$TrajectoryCandidate.fk[5] = -414409981;
        hr$TrajectoryCandidate.fk[6] = -630788356;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hr$TrajectoryCandidate(float var1_1, double var2_2, int var4_3, class_243 var5_4) {
        var7_5 /* !! */  = hr$TrajectoryCandidate.b;
        super();
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.pitch = var1_1;
                this.distanceToTarget = var2_2;
                this.ticks = var4_3;
                this.landingPos = var5_4;
                return;
            }
lbl11:
            // 3 sources

            case 0: {
                var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fm", fi(int ), (int)0);
                ** GOTO lbl18
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fn", fi(int ), (int)1);
                    ** GOTO lbl25
                    break;
                }
            }
lbl18:
            // 2 sources

            case 2: {
                while (true) {
                    var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fo", fi(int ), (int)2);
                }
            }
            case 3: {
                var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fp", fi(int ), (int)3);
                ** GOTO lbl11
            }
lbl25:
            // 2 sources

            case 4: {
                var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fq", fi(int ), (int)4);
            }
            case 5: {
                var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fr", fi(int ), (int)5);
                ** GOTO lbl11
            }
            case 6: 
        }
        var7_5 /* !! */  = (int)hr$TrajectoryCandidate.fl("fs", fi(int ), (int)6);
        ** while (true)
    }
}

