/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_6880
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1291;
import net.minecraft.class_6880;

final class hj$ReceivedPotionEffect {
    private final int receivedDuration;
    private static int[] deqr = new int[7];
    public static final int b;
    private final class_6880<class_1291> effectType;
    static final long hg = -4656654159576163733L;
    private static int[] deqt;
    private final int fullDuration;
    private final int amplifier;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hj$ReceivedPotionEffect(class_6880<class_1291> var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 /* !! */  = hj$ReceivedPotionEffect.b;
        super();
        this.effectType = var1_1;
        this.amplifier = var2_2;
        this.receivedDuration = var3_3;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.fullDuration = var4_4;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("deqw", deqp(int ), (int)0);
                break;
            }
lbl14:
            // 2 sources

            case 1: {
                var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("derd", deqp(int ), (int)1);
                ** GOTO lbl23
            }
            case 2: {
                var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("dere", deqp(int ), (int)2);
                ** GOTO lbl23
            }
            case 3: {
                var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("derf", deqp(int ), (int)3);
                ** GOTO lbl14
            }
lbl23:
            // 4 sources

            case 4: {
                var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("derg", deqp(int ), (int)4);
                break;
            }
            case 5: {
                var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("derh", deqp(int ), (int)5);
                ** GOTO lbl23
            }
            case 6: 
        }
        while (true) {
            var6_5 /* !! */  = (int)hj$ReceivedPotionEffect.deqv("deri", deqp(int ), (int)6);
        }
    }

    public static /* synthetic */ CallSite deqv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void derj() {
        hj$ReceivedPotionEffect.deqr[0] = -34261270;
        hj$ReceivedPotionEffect.deqr[1] = -699096058;
        hj$ReceivedPotionEffect.deqr[2] = 1288096454;
        hj$ReceivedPotionEffect.deqr[3] = 1356525563;
        hj$ReceivedPotionEffect.deqr[4] = -1869432092;
        hj$ReceivedPotionEffect.deqr[5] = 430912895;
        hj$ReceivedPotionEffect.deqr[6] = 560536954;
    }

    static {
        deqt = new int[7];
        hj$ReceivedPotionEffect.derj();
        hj$ReceivedPotionEffect.derq();
    }

    private static /* synthetic */ int deqp(int n2) {
        return deqr[n2] ^ deqt[n2];
    }

    private static /* synthetic */ void derq() {
        hj$ReceivedPotionEffect.deqt[0] = -34261271;
        hj$ReceivedPotionEffect.deqt[1] = -699096062;
        hj$ReceivedPotionEffect.deqt[2] = 1288096454;
        hj$ReceivedPotionEffect.deqt[3] = 1356525567;
        hj$ReceivedPotionEffect.deqt[4] = -1869432090;
        hj$ReceivedPotionEffect.deqt[5] = 430912894;
        hj$ReceivedPotionEffect.deqt[6] = 560536954;
    }
}

