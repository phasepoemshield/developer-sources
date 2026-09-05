/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07438;

public class class05550
extends class05765<class07438> {
    private final class05378<Integer> N;

    protected void L(class04782 class047822, class07438 class074382, long l) {
        Optional<Integer> var5 = this.y(class074382);
        class074382.method_18868().N(this.N, (Object)(var5.get() - 1));
    }

    public class05550(class05378<Integer> class053782) {
        super((Map)ImmutableMap.of(class053782, (Object)class05367.field_18456));
        this.N = class053782;
    }

    protected void y(class04782 class047822, class07438 class074382, long l) {
        class074382.method_18868().y(this.N);
    }

    private Optional<Integer> y(class07438 class074382) {
        return class074382.method_18868().L(this.N);
    }

    protected boolean N(long l) {
        return false;
    }

    protected boolean N(class04782 class047822, class07438 class074382, long l) {
        Optional<Integer> var5 = this.y(class074382);
        return var5.isPresent() && var5.get() > 0;
    }
}

