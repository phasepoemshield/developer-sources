/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class08961
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00341;
import minecraft.class00373;
import minecraft.class00377;
import minecraft.class03448;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public abstract class class00343 {
    private final boolean N;

    public static class00373 L() {
        return new class00341();
    }

    public class00343(boolean bl) {
        this.N = bl;
    }

    public boolean y() {
        return this.N;
    }

    public static class00373 y(float f) {
        return new class00377(f);
    }

    protected abstract float N(class06584 var1, class03448 var2, int var3, class08961 var4);

    protected class00373 N(float f) {
        return this.N ? class00343.y(f) : class00343.L();
    }

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class07299 class072992;
        if (class089612 == null) {
            class089612 = class065842.K();
        }
        if (class089612 == null) {
            return 0.0f;
        }
        if (class034482 == null && (class072992 = class089612.method_73183()) instanceof class03448) {
            class034482 = (class03448)class072992;
        }
        if (class034482 == null) {
            return 0.0f;
        }
        return this.N(class065842, class034482, n, class089612);
    }
}

