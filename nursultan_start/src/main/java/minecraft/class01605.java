/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00941
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01583
 *  org.joml.Matrix4f
 */
package minecraft;

import minecraft.class00941;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01583;
import minecraft.class01609;
import org.joml.Matrix4f;

class class01605
implements class01609 {
    final /* synthetic */ class01407 N;
    final /* synthetic */ class01583 y;
    final /* synthetic */ Matrix4f L;
    final /* synthetic */ int u;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01605(class01407 class014072, class01583 class015832, Matrix4f matrix4f, int n) {
        this.N = class014072;
        this.y = class015832;
        this.L = matrix4f;
        this.u = n;
    }

    private void y(class00941 class009412) {
        class01391 class013912 = this.N.method_73477(class009412.N(this.y));
        class009412.N(this.L, class013912, this.u, false);
    }

    @Override
    public void N(class00941 class009412) {
        this.y(class009412);
    }
}

