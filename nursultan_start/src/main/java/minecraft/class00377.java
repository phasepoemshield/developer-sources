/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class00373;
import minecraft.class04995;

class class00377
implements class00373 {
    private float y;
    private float L;
    private long u;
    final /* synthetic */ float N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00377(float f) {
        this.N = f;
    }

    @Override
    public void N(long l, float f) {
        this.u = l;
        float f2 = class04995.L((float)(f - this.y + 0.5f), (float)1.0f) - 0.5f;
        this.L += f2 * 0.1f;
        this.L *= this.N;
        this.y = class04995.L((float)(this.y + this.L), (float)1.0f);
    }

    @Override
    public boolean N(long l) {
        return this.u != l;
    }

    @Override
    public float N() {
        return this.y;
    }
}

