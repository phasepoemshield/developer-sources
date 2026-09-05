/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class04995;

public class class01142 {
    private boolean N;
    private float y;
    private float L;

    public void N(boolean bl) {
        this.N = bl;
    }

    public float N(float f) {
        return class04995.B((float)f, (float)this.L, (float)this.y);
    }

    public void N() {
        this.L = this.y;
        float f = 0.1f;
        if (!this.N && this.y > 0.0f) {
            this.y = Math.max(this.y - 0.1f, 0.0f);
        } else if (this.N && this.y < 1.0f) {
            this.y = Math.min(this.y + 0.1f, 1.0f);
        }
    }
}

