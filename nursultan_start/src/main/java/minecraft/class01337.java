/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01140
 *  minecraft.class03341
 *  minecraft.class03780
 *  minecraft.class05904
 *  minecraft.class06260
 *  minecraft.class07267
 *  minecraft.class07751
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01140;
import minecraft.class03341;
import minecraft.class03780;
import minecraft.class05904;
import minecraft.class06260;
import minecraft.class07267;
import minecraft.class07751;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class01337
extends class03780 {
    public static final float N = 62.500004f;
    public static final float y = 0.9765628f;
    private static final Vector3f i = new Vector3f(0.9765628f, 0.9765628f, 0.9765628f);
    private @Nullable class06260 R;

    public class01337(class07267 class072672, boolean bl, boolean bl2) {
        super(class072672, bl, bl2);
    }

    protected Vector3f y() {
        return i;
    }

    protected void N(class01054 class010542) {
        if (this.R == null) {
            return;
        }
        int n = this.field_22789 / 2;
        int n2 = n - 48;
        int n3 = 66;
        int n4 = n + 48;
        int n5 = 168;
        class010542.N(this.R, 62.500004f, this.u, n2, 66, n4, 168);
    }

    protected float N() {
        return 90.0f;
    }

    public void method_25426() {
        super.method_25426();
        boolean bl = this.L.w().i() instanceof class07751;
        this.R = class03341.N((class01140)this.field_22787.yt(), (class05904)this.u, (boolean)bl);
    }
}

