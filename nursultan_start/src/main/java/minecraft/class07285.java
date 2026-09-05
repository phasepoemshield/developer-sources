/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class03734
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import minecraft.class03734;
import org.jspecify.annotations.Nullable;

public class class07285 {
    private final class03734 N;
    private final @Nullable class07285 y;
    private final @Nullable class07285 L;
    private final int u;
    private final List<class07285> i = Lists.newArrayList();
    private class07285 R;
    private @Nullable class07285 M;
    private int B;
    private float Z;
    private float z;
    private float U;
    private float E;

    private @Nullable class07285 L() {
        if (this.M != null) {
            return this.M;
        }
        if (!this.i.isEmpty()) {
            return this.i.get(0);
        }
        return null;
    }

    public class07285(class03734 class037342, @Nullable class07285 class072852, @Nullable class07285 class072853, int n, int n2) {
        if (class037342.N().L().isEmpty()) {
            throw new IllegalArgumentException("Can't position an invisible advancement!");
        }
        this.N = class037342;
        this.y = class072852;
        this.L = class072853;
        this.u = n;
        this.R = this;
        this.B = n2;
        this.Z = -1.0f;
        class07285 class072854 = null;
        for (class03734 class037343 : class037342.i()) {
            class072854 = this.N(class037343, class072854);
        }
    }

    private void i() {
        this.N.N().L().ifPresent(class065132 -> class065132.N((float)this.B, this.Z));
        if (!this.i.isEmpty()) {
            Iterator<class07285> var1 = this.i.iterator();
            while (var1.hasNext()) {
                var1.next().i();
            }
        }
    }

    private @Nullable class07285 u() {
        if (this.M != null) {
            return this.M;
        }
        if (!this.i.isEmpty()) {
            return this.i.get(this.i.size() - 1);
        }
        return null;
    }

    private void y() {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = this.i.size() - 1; i >= 0; --i) {
            class07285 class072852 = this.i.get(i);
            class072852.Z += f;
            class072852.z += f;
            f += class072852.E + (f2 += class072852.U);
        }
    }

    private @Nullable class07285 N(class03734 class037342, @Nullable class07285 class072852) {
        if (class037342.N().L().isPresent()) {
            class072852 = new class07285(class037342, this, class072852, this.i.size() + 1, this.B + 1);
            this.i.add(class072852);
        } else {
            for (class03734 class037343 : class037342.i()) {
                class072852 = this.N(class037343, class072852);
            }
        }
        return class072852;
    }

    private class07285 N(class07285 class072852, class07285 class072853) {
        if (this.R != null && class072852.y.i.contains(this.R)) {
            return this.R;
        }
        return class072853;
    }

    private void N(class07285 class072852, float f) {
        float f2 = class072852.u - this.u;
        if (f2 != 0.0f) {
            class072852.U -= f / f2;
            this.U += f / f2;
        }
        class072852.E += f;
        class072852.Z += f;
        class072852.z += f;
    }

    public static void N(class03734 class037342) {
        if (class037342.N().L().isEmpty()) {
            throw new IllegalArgumentException("Can't position children of an invisible root!");
        }
        class07285 class072852 = new class07285(class037342, null, null, 1, 0);
        class072852.N();
        float f = class072852.N(0.0f, 0, class072852.Z);
        if (f < 0.0f) {
            class072852.N(-f);
        }
        class072852.i();
    }

    private void N(float f) {
        this.Z += f;
        Iterator<class07285> var2 = this.i.iterator();
        while (var2.hasNext()) {
            var2.next().N(f);
        }
    }

    private float N(float f, int n, float f2) {
        this.Z += f;
        this.B = n;
        if (this.Z < f2) {
            f2 = this.Z;
        }
        Iterator<class07285> var4 = this.i.iterator();
        while (var4.hasNext()) {
            f2 = var4.next().N(f + this.z, n + 1, f2);
        }
        return f2;
    }

    private void N() {
        if (this.i.isEmpty()) {
            this.Z = this.L != null ? this.L.Z + 1.0f : 0.0f;
            return;
        }
        class07285 class072852 = null;
        for (class07285 class072853 : this.i) {
            class072853.N();
            class072852 = class072853.N(class072852 == null ? class072853 : class072852);
        }
        this.y();
        float f = (this.i.get((int)0).Z + this.i.get((int)(this.i.size() - 1)).Z) / 2.0f;
        if (this.L != null) {
            this.Z = this.L.Z + 1.0f;
            this.z = this.Z - f;
        } else {
            this.Z = f;
        }
    }

    private class07285 N(class07285 class072852) {
        if (this.L == null) {
            return class072852;
        }
        class07285 class072853 = this;
        class07285 class072854 = this;
        class07285 class072855 = this.L;
        class07285 class072856 = this.y.i.get(0);
        float f = this.z;
        float f2 = this.z;
        float f3 = class072855.z;
        float f4 = class072856.z;
        while (class072855.u() != null && class072853.L() != null) {
            class072855 = class072855.u();
            class072853 = class072853.L();
            class072856 = class072856.L();
            class072854 = class072854.u();
            class072854.R = this;
            float f5 = class072855.Z + f3 - (class072853.Z + f) + 1.0f;
            if (f5 > 0.0f) {
                class072855.N(this, class072852).N(this, f5);
                f += f5;
                f2 += f5;
            }
            f3 += class072855.z;
            f += class072853.z;
            f4 += class072856.z;
            f2 += class072854.z;
        }
        if (class072855.u() != null && class072854.u() == null) {
            class072854.M = class072855.u();
            class072854.z += f3 - f2;
        } else {
            if (class072853.L() != null && class072856.L() == null) {
                class072856.M = class072853.L();
                class072856.z += f - f4;
            }
            class072852 = this;
        }
        return class072852;
    }
}

