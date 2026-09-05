/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06069
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixin.EndFlashAccess
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06069;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.EndFlashAccess;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00917
implements EndFlashAccess {
    public static final int N = 30;
    private static final int y = 600;
    private static final int L = 200;
    private static final int u = 100;
    private static final int i = 380;
    private long R;
    private int M;
    private int B;
    private float Z;
    private float z;
    private float U;
    private float E;
    private static final float W = 1.0f;

    private float L(long l) {
        long l2 = l % 600L;
        if (l2 < (long)this.M || l2 > (long)(this.M + this.B)) {
            return 0.0f;
        }
        return class04995.m((double)((float)(l2 - (long)this.M) * (float)Math.PI / (float)this.B));
    }

    public boolean L() {
        return this.Z > 0.0f && this.z <= 0.0f;
    }

    public float y() {
        return this.E;
    }

    private void y(long l) {
        long l2 = l / 600L;
        if (l2 != this.R) {
            class06069 class060692 = class06069.y((long)l2);
            class060692.z();
            this.M = class04995.y((class06069)class060692, (int)0, (int)200);
            this.B = class04995.y((class06069)class060692, (int)100, (int)Math.min(380, 600 - this.M));
            this.U = class04995.y((class06069)class060692, (float)-60.0f, (float)10.0f);
            this.E = class04995.y((class06069)class060692, (float)-180.0f, (float)180.0f);
            this.R = l2;
        }
    }

    private void N(long l, CallbackInfo callbackInfo, long l2, class06069 class060692) {
        if (Iris.getCurrentPack().isPresent()) {
            callbackInfo.cancel();
            this.U = -class04995.y((class06069)class060692, (float)1.0f, (float)60.0f);
            this.E = class04995.y((class06069)class060692, (float)-180.0f, (float)180.0f);
            this.R = l2;
        }
    }

    public void N(long l) {
        this.y(l);
        this.z = this.Z;
        this.Z = this.L(l);
    }

    public float N(float f) {
        return class04995.B((float)f, (float)this.z, (float)this.Z);
    }

    public float N() {
        return this.U;
    }

    public /* synthetic */ void setXAngle(float f) {
        this.U = f;
    }

    public /* synthetic */ void setYAngle(float f) {
        this.E = f;
    }
}

