/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class ef$HeadParticle {
    private float age;
    private static int[] cyvc;
    private float y;
    private static int[] cyvb;
    private final float endX;
    private float alpha;
    private final float endY;
    private static final long gt = 8142936808799464813L;
    private final float lifetime;
    public static final int b;
    private float x;

    private static /* synthetic */ void cyvm() {
        ef$HeadParticle.cyvb[0] = 1442682128;
        ef$HeadParticle.cyvb[1] = -383544229;
        ef$HeadParticle.cyvb[2] = -1125081183;
        ef$HeadParticle.cyvb[3] = -1067901357;
        ef$HeadParticle.cyvb[4] = 861032718;
        ef$HeadParticle.cyvb[5] = 1663312149;
        ef$HeadParticle.cyvb[6] = 455130124;
        ef$HeadParticle.cyvb[7] = -190927619;
    }

    static {
        cyvb = new int[8];
        cyvc = new int[8];
        ef$HeadParticle.cyvm();
        ef$HeadParticle.cyvn();
    }

    private static /* synthetic */ void cyvn() {
        ef$HeadParticle.cyvc[0] = 1442682128;
        ef$HeadParticle.cyvc[1] = -383544231;
        ef$HeadParticle.cyvc[2] = -1125081178;
        ef$HeadParticle.cyvc[3] = -1067901360;
        ef$HeadParticle.cyvc[4] = 861032715;
        ef$HeadParticle.cyvc[5] = 1663312149;
        ef$HeadParticle.cyvc[6] = 455130124;
        ef$HeadParticle.cyvc[7] = -190927622;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ef$HeadParticle(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var7_6 /* !! */  = ef$HeadParticle.b;
        super();
        this.x = var1_1;
        this.y = var2_2;
        this.endX = var3_3;
        this.endY = var4_4;
        this.lifetime = var5_5;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyve", cyva(int ), (int)0);
                ** GOTO lbl22
            }
lbl15:
            // 2 sources

            case 1: {
                while (true) {
                    var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvf", cyva(int ), (int)1);
                }
            }
            case 2: {
                var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvg", cyva(int ), (int)2);
                ** GOTO lbl12
            }
lbl22:
            // 4 sources

            case 3: {
                var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvh", cyva(int ), (int)3);
                ** GOTO lbl28
            }
            case 4: {
                var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvi", cyva(int ), (int)4);
                ** GOTO lbl22
            }
lbl28:
            // 2 sources

            case 5: {
                var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvj", cyva(int ), (int)5);
                ** GOTO lbl15
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvk", cyva(int ), (int)6);
                    ** GOTO lbl22
                    break;
                }
            }
            case 7: 
        }
        var7_6 /* !! */  = (int)ef$HeadParticle.cyvd("cyvl", cyva(int ), (int)7);
        ** while (true)
    }

    public static /* synthetic */ CallSite cyvd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int cyva(int n2) {
        return cyvb[n2] ^ cyvc[n2];
    }
}

