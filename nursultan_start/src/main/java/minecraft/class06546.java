/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class05410
 *  minecraft.class07438
 *  minecraft.class07610
 *  minecraft.class08044
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class05410;
import minecraft.class07438;
import minecraft.class07610;
import minecraft.class08044;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public abstract class class06546<T extends class07610>
extends class01463<T> {
    protected final int N;
    protected float y;
    protected float L;
    protected class07438 u;

    protected abstract @Nullable class01894 L();

    public class06546(T t, class08044 class080442, class00392 class003922, int n, class07438 class074382) {
        super(t, class080442, class003922);
        this.N = n;
        this.u = class074382;
    }

    protected abstract boolean i();

    protected abstract class01894 y();

    protected void y(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, this.y(), n, n2, 18, 18);
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, this.N(), n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        if (this.N > 0 && this.L() != null) {
            class010542.N(class08394.Na, this.L(), 90, 54, 0, 0, n3 + 79, n4 + 17, this.N * 18, 54);
        }
        if (this.i()) {
            this.y(class010542, n3 + 7, n4 + 35 - 18);
        }
        if (this.R()) {
            this.y(class010542, n3 + 7, n4 + 35);
        }
        class05410.N((class01054)class010542, (int)(n3 + 26), (int)(n4 + 18), (int)(n3 + 78), (int)(n4 + 70), (int)17, (float)0.25f, (float)this.y, (float)this.L, (class07438)this.u);
    }

    protected abstract class01894 N();

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.y = n;
        this.L = n2;
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }

    protected abstract boolean R();
}

