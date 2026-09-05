/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;

public abstract class class04404
extends class05848 {
    protected final class06143 N;
    private float y;
    private float L;
    private float u;
    private boolean i;

    protected class04404(class03448 class034482, double d, double d2, double d3, class06143 class061432, float f) {
        super(class034482, d, d2, d3, class061432.method_74304());
        this.field_28786 = 0.91f;
        this.field_3844 = f;
        this.N = class061432;
    }

    public void y(int n) {
        this.y = (float)((n & 0xFF0000) >> 16) / 255.0f;
        this.L = (float)((n & 0xFF00) >> 8) / 255.0f;
        this.u = (float)((n & 0xFF) >> 0) / 255.0f;
        this.i = true;
    }

    public void N(int n) {
        float f = (float)((n & 0xFF0000) >> 16) / 255.0f;
        float f2 = (float)((n & 0xFF00) >> 8) / 255.0f;
        float f3 = (float)((n & 0xFF) >> 0) / 255.0f;
        float f4 = 1.0f;
        this.method_74305(f * 1.0f, f2 * 1.0f, f3 * 1.0f);
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public int method_3068(float f) {
        return 0xF000F0;
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.N);
        if (this.field_3866 > this.field_3847 / 2) {
            this.method_74308(1.0f - ((float)this.field_3866 - (float)(this.field_3847 / 2)) / (float)this.field_3847);
            if (this.i) {
                this.field_62633 += (this.y - this.field_62633) * 0.2f;
                this.field_62634 += (this.L - this.field_62634) * 0.2f;
                this.field_62635 += (this.u - this.field_62635) * 0.2f;
            }
        }
    }
}

