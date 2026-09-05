/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10691
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_10691;
import net.minecraft.class_1799;
import ruhack.phobia.hj$PlayerPotionHit;

final class hj$TrackedSplashPotion {
    private class_1799 potion;
    protected static final long hp = 1118918527922014785L;
    private double z;
    private int age;
    private int missingTicks;
    private final Map<UUID, hj$PlayerPotionHit> hits;
    private double y;
    private final class_10691 entity;
    private static int[] dkhx = new int[11];
    public static final int b;
    private double x;
    private final int entityId;
    private static int[] dkhy;
    private final String throwerName;

    private static /* synthetic */ void dkil() {
        hj$TrackedSplashPotion.dkhx[0] = -2046663693;
        hj$TrackedSplashPotion.dkhx[1] = 443262222;
        hj$TrackedSplashPotion.dkhx[2] = -272697126;
        hj$TrackedSplashPotion.dkhx[3] = -1890582232;
        hj$TrackedSplashPotion.dkhx[4] = -1294298632;
        hj$TrackedSplashPotion.dkhx[5] = 1202648960;
        hj$TrackedSplashPotion.dkhx[6] = -525902945;
        hj$TrackedSplashPotion.dkhx[7] = -1147145592;
        hj$TrackedSplashPotion.dkhx[8] = -1366739818;
        hj$TrackedSplashPotion.dkhx[9] = -1456149608;
        hj$TrackedSplashPotion.dkhx[10] = 1617301899;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hj$TrackedSplashPotion(int var1_1, class_10691 var2_2, class_1799 var3_3, String var4_4, double var5_5, double var7_6, double var9_7) {
        var12_8 /* !! */  = hj$TrackedSplashPotion.b;
        if (var12_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.hits = new LinkedHashMap<UUID, hj$PlayerPotionHit>();
                this.entityId = var1_1;
                this.entity = var2_2;
                this.potion = var3_3;
                this.throwerName = var4_4;
                this.x = var5_5;
                this.y = var7_6;
                this.z = var9_7;
                return;
            }
lbl15:
            // 4 sources

            case 0: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkia", dkhw(int ), (int)0);
                ** GOTO lbl42
            }
lbl18:
            // 2 sources

            case 1: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkib", dkhw(int ), (int)1);
                ** GOTO lbl38
            }
            case 2: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkic", dkhw(int ), (int)2);
                break;
            }
            case 3: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkid", dkhw(int ), (int)3);
                ** GOTO lbl15
            }
            case 4: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkie", dkhw(int ), (int)4);
                ** GOTO lbl42
            }
            case 5: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkif", dkhw(int ), (int)5);
                ** GOTO lbl15
            }
            case 6: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkig", dkhw(int ), (int)6);
                break;
            }
            case 7: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkih", dkhw(int ), (int)7);
            }
lbl38:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkii", dkhw(int ), (int)8);
                    ** GOTO lbl18
                    break;
                }
            }
lbl42:
            // 3 sources

            case 9: {
                var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkij", dkhw(int ), (int)9);
                ** GOTO lbl15
            }
            case 10: 
        }
        var12_8 /* !! */  = (int)hj$TrackedSplashPotion.dkhz("dkik", dkhw(int ), (int)10);
        ** while (true)
    }

    static {
        dkhy = new int[11];
        hj$TrackedSplashPotion.dkil();
        hj$TrackedSplashPotion.dkim();
    }

    public static /* synthetic */ CallSite dkhz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dkim() {
        hj$TrackedSplashPotion.dkhy[0] = -2046663693;
        hj$TrackedSplashPotion.dkhy[1] = 443262220;
        hj$TrackedSplashPotion.dkhy[2] = -272697134;
        hj$TrackedSplashPotion.dkhy[3] = -1890582232;
        hj$TrackedSplashPotion.dkhy[4] = -1294298639;
        hj$TrackedSplashPotion.dkhy[5] = 1202648962;
        hj$TrackedSplashPotion.dkhy[6] = -525902946;
        hj$TrackedSplashPotion.dkhy[7] = -1147145590;
        hj$TrackedSplashPotion.dkhy[8] = -1366739818;
        hj$TrackedSplashPotion.dkhy[9] = -1456149608;
        hj$TrackedSplashPotion.dkhy[10] = 1617301900;
    }

    private static /* synthetic */ int dkhw(int n2) {
        return dkhx[n2] ^ dkhy[n2];
    }
}

