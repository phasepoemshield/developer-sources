/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.jr$CachedName;

final class jr$LivingTagLayout {
    private static int[] dsio = new int[4];
    private float equipOffset;
    private boolean friend;
    private float equipWidth;
    private float mainWidth;
    private float hpPanelWidth;
    private String hp;
    private float namePanelWidth;
    private static int[] dsip = new int[4];
    private int hpValue;
    private jr$CachedName resolvedName;
    private float totalHeight;
    static final long iy = -1376209921943926166L;
    private int equipCount;
    public static final int b;
    private float headerWidth;

    private static /* synthetic */ void dsiv() {
        jr$LivingTagLayout.dsio[0] = -643114629;
        jr$LivingTagLayout.dsio[1] = 1753056764;
        jr$LivingTagLayout.dsio[2] = -1305175515;
        jr$LivingTagLayout.dsio[3] = -1505708118;
    }

    public static /* synthetic */ CallSite dsiq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        jr$LivingTagLayout.dsiv();
        jr$LivingTagLayout.dsiw();
    }

    private static /* synthetic */ void dsiw() {
        jr$LivingTagLayout.dsip[0] = 1504369019;
        jr$LivingTagLayout.dsip[1] = 1753056766;
        jr$LivingTagLayout.dsip[2] = -1305175513;
        jr$LivingTagLayout.dsip[3] = -1505708118;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jr$LivingTagLayout() {
        var2_1 /* !! */  = jr$LivingTagLayout.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.hpValue = (int)jr$LivingTagLayout.dsiq("dsir", dsin(int ), (int)0);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)jr$LivingTagLayout.dsiq("dsis", dsin(int ), (int)1);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jr$LivingTagLayout.dsiq("dsit", dsin(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)jr$LivingTagLayout.dsiq("dsiu", dsin(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ int dsin(int n2) {
        return dsio[n2] ^ dsip[n2];
    }
}

