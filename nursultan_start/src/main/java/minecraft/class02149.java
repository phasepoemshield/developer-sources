/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class07438;

public abstract class class02149
extends class05355<class07438> {
    private Optional<class07438> L(class04782 class047822, class07438 class074382) {
        return this.N(class074382).flatMap(class040512 -> class040512.N(class074383 -> this.u(class047822, class074382, (class07438)class074383)));
    }

    protected abstract boolean u(class04782 var1, class07438 var2, class07438 var3);

    protected abstract class05378<class07438> y();

    protected void N(class04782 class047822, class07438 class074382) {
        class074382.method_18868().N(this.y(), this.L(class047822, class074382));
    }

    protected Optional<class04051> N(class07438 class074382) {
        return class074382.method_18868().L(class05378.B);
    }

    public Set<class05378<?>> N() {
        return ImmutableSet.of(this.y());
    }
}

