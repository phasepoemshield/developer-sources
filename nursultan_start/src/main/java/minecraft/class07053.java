/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;

class class07053 {
    private float N;
    private float y;

    private static boolean L(class07055 class070552) {
        return !class070552.N(((class07084)class070552.L().N()).u());
    }

    class07053() {
    }

    public void y(class07055 class070552) {
        int n;
        float f;
        this.y = this.N;
        boolean bl = class07053.L(class070552);
        float f2 = f = bl ? 1.0f : 0.0f;
        if (this.N == f) {
            return;
        }
        class07084 class070842 = (class07084)class070552.L().N();
        int n2 = n = bl ? class070842.y() : class070842.L();
        if (n == 0) {
            this.N = f;
        } else {
            float f3 = 1.0f / (float)n;
            this.N += class04995.N((float)(f - this.N), (float)(-f3), (float)f3);
        }
    }

    public void N(class07053 class070532) {
        this.N = class070532.N;
        this.y = class070532.y;
    }

    public void N(class07055 class070552) {
        this.y = this.N = class07053.L(class070552) ? 1.0f : 0.0f;
    }

    public float N(class07438 class074382, float f) {
        if (class074382.method_31481()) {
            this.y = this.N;
        }
        return class04995.B((float)f, (float)this.y, (float)this.N);
    }
}

