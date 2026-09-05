/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04995
 *  minecraft.class06685
 *  minecraft.class06687
 *  minecraft.class06702
 *  minecraft.class07536
 */
package minecraft;

import java.util.UUID;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class06685;
import minecraft.class06687;
import minecraft.class06702;
import minecraft.class07536;

public class class01206
extends class06687 {
    private static final long z = 100L;
    protected float B;
    protected long Z;

    public float L() {
        return class04995.B((float)class04995.N((float)((float)(class07536.L() - this.Z) / 100.0f), (float)0.0f, (float)1.0f), (float)this.y, (float)this.B);
    }

    public class01206(UUID uUID, class00392 class003922, float f, class06685 class066852, class06702 class067022, boolean bl, boolean bl2, boolean bl3) {
        super(uUID, class003922, class066852, class067022);
        this.B = f;
        this.y = f;
        this.Z = class07536.L();
        this.N(bl);
        this.y(bl2);
        this.L(bl3);
    }

    public void N(float f) {
        this.y = this.L();
        this.B = f;
        this.Z = class07536.L();
    }
}

