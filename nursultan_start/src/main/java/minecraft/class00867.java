/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05952
 */
package minecraft;

import java.util.Optional;
import minecraft.class00866;
import minecraft.class05952;

public class class00867
implements class05952 {
    private Optional<Boolean> N = Optional.empty();
    private Optional<Boolean> y = Optional.empty();

    public class00867 y(boolean bl) {
        this.y = Optional.of(bl);
        return this;
    }

    public class00866 build() {
        return new class00866(this.N, this.y);
    }

    public class00867 N(boolean bl) {
        this.N = Optional.of(bl);
        return this;
    }
}

