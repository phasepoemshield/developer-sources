/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00941
 *  minecraft.class01609
 *  minecraft.class03255
 *  org.joml.Matrix3x2fc
 */
package minecraft;

import minecraft.class00941;
import minecraft.class01609;
import minecraft.class03255;
import minecraft.class08654;
import minecraft.class08659;
import org.joml.Matrix3x2fc;

class class08646
implements class01609 {
    final /* synthetic */ Matrix3x2fc N;
    final /* synthetic */ class03255 y;
    final /* synthetic */ class08659 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class08646(class08659 class086592, Matrix3x2fc matrix3x2fc, class03255 class032552) {
        this.L = class086592;
        this.N = matrix3x2fc;
        this.y = class032552;
    }

    private void y(class00941 class009412) {
        this.L.R.y(new class08654(this.N, class009412, this.y));
    }

    public void N(class00941 class009412) {
        this.y(class009412);
    }
}

