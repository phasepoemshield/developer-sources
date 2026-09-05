/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07086;

public class class07052 {
    private static final float N = -72000.0f;
    private static final float y = 1440000.0f;
    private static final float L = 3600000.0f;
    private final class07086 u;
    private final float i;

    public boolean L() {
        return this.i >= (float)class07086.field_5807.ordinal();
    }

    public class07052(class07086 class070862, long l, long l2, float f) {
        this.u = class070862;
        this.i = this.N(class070862, l, l2, f);
    }

    public float u() {
        if (this.i < 2.0f) {
            return 0.0f;
        }
        if (this.i > 4.0f) {
            return 1.0f;
        }
        return (this.i - 2.0f) / 2.0f;
    }

    public float y() {
        return this.i;
    }

    private float N(class07086 class070862, long l, long l2, float f) {
        if (class070862 == class07086.field_5801) {
            return 0.0f;
        }
        boolean bl = class070862 == class07086.field_5807;
        float f2 = 0.75f;
        float f3 = class04995.N((float)(((float)l + -72000.0f) / 1440000.0f), (float)0.0f, (float)1.0f) * 0.25f;
        f2 += f3;
        float f4 = 0.0f;
        f4 += class04995.N((float)((float)l2 / 3600000.0f), (float)0.0f, (float)1.0f) * (bl ? 1.0f : 0.75f);
        f4 += class04995.N((float)(f * 0.25f), (float)0.0f, (float)f3);
        if (class070862 == class07086.field_5805) {
            f4 *= 0.5f;
        }
        return (float)class070862.N() * (f2 += f4);
    }

    public boolean N(float f) {
        return this.i > f;
    }

    public class07086 N() {
        return this.u;
    }
}

