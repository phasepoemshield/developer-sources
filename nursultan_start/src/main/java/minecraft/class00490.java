/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01762
 *  minecraft.class01788
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class00488;
import minecraft.class01762;
import minecraft.class01788;
import org.jspecify.annotations.Nullable;

public class class00490
implements class01788 {
    private int N;
    private boolean y = true;
    private @Nullable class00392 L;
    private @Nullable class01762 u;

    public boolean L() {
        return this.y;
    }

    public class00490() {
    }

    public class00490(class00488 class004882) {
        this.N = class004882.N();
        this.y = class004882.y();
        this.L = class004882.L().orElse(null);
        this.u = class004882.u().orElse(null);
    }

    public @Nullable class01762 i() {
        return this.u;
    }

    public @Nullable class00392 u() {
        return this.L;
    }

    public int y() {
        return this.N;
    }

    public void N(@Nullable class00392 class003922) {
        this.L = class003922;
    }

    public void N(@Nullable class01762 class017622) {
        this.u = class017622;
    }

    public void N(boolean bl) {
        this.y = bl;
    }

    public void N(int n) {
        this.N = n;
    }

    public class00488 N() {
        return new class00488(this.N, this.y, Optional.ofNullable(this.L), Optional.ofNullable(this.u));
    }
}

