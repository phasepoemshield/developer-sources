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
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_1291;
import net.minecraft.class_6880;
import ruhack.phobia.hj$ReceivedPotionEffect;

final class hj$PlayerPotionHit {
    private static int[] rio;
    private final String playerName;
    protected static final long ay = 1194994005964095229L;
    public static final int b;
    private final Map<class_6880<class_1291>, hj.ReceivedPotionEffect> effects;
    private static int[] rin;

    private static /* synthetic */ void rje() {
        hj$PlayerPotionHit.rin[0] = 1364520595;
        hj$PlayerPotionHit.rin[1] = 1552916479;
        hj$PlayerPotionHit.rin[2] = -1184239858;
        hj$PlayerPotionHit.rin[3] = 1294148159;
        hj$PlayerPotionHit.rin[4] = 60926604;
    }

    public static /* synthetic */ CallSite rip(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void rjh() {
        hj$PlayerPotionHit.rio[0] = 1364520593;
        hj$PlayerPotionHit.rio[1] = 1552916475;
        hj$PlayerPotionHit.rio[2] = -1184239857;
        hj$PlayerPotionHit.rio[3] = 1294148155;
        hj$PlayerPotionHit.rio[4] = 60926605;
    }

    private static /* synthetic */ int rim(int n2) {
        return rin[n2] ^ rio[n2];
    }

    static {
        rin = new int[5];
        rio = new int[5];
        hj$PlayerPotionHit.rje();
        hj$PlayerPotionHit.rjh();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hj$PlayerPotionHit(String var1_1) {
        var3_2 /* !! */  = hj$PlayerPotionHit.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.effects = new LinkedHashMap<class_6880<class_1291>, hj.ReceivedPotionEffect>();
                this.playerName = var1_1;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)hj$PlayerPotionHit.rip("ris", rim(int ), (int)0);
                break;
            }
            case 1: {
                var3_2 /* !! */  = (int)hj$PlayerPotionHit.rip("rit", rim(int ), (int)1);
                ** GOTO lbl9
            }
lbl15:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)hj$PlayerPotionHit.rip("rix", rim(int ), (int)2);
                break;
            }
            case 3: {
                var3_2 /* !! */  = (int)hj$PlayerPotionHit.rip("riz", rim(int ), (int)3);
                ** GOTO lbl15
            }
            case 4: 
        }
        while (true) {
            var3_2 /* !! */  = (int)hj$PlayerPotionHit.rip("rjb", rim(int ), (int)4);
        }
    }
}

