/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05338
 *  minecraft.class05952
 */
package minecraft;

import java.util.Optional;
import minecraft.class01405;
import minecraft.class05338;
import minecraft.class05952;

public class class01397
implements class05952 {
    private Optional<Long> N = Optional.empty();
    private final class05338 y;

    public class01397(class05338 class053382) {
        this.y = class053382;
    }

    public class01397 N(long l) {
        this.N = Optional.of(l);
        return this;
    }

    public class01405 build() {
        return new class01405(this.N, this.y);
    }
}

