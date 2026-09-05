/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Unit
 *  minecraft.class04782
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Unit;
import minecraft.class04118;
import minecraft.class04140;
import minecraft.class04782;
import org.jspecify.annotations.Nullable;

public class class04121<E>
implements class04140<E, Unit> {
    final /* synthetic */ class04118 N;

    public class04121(class04118 class041182) {
        this.N = class041182;
    }

    @Override
    public @Nullable Unit N(class04782 class047822, E e, long l) {
        return this.N.trigger(class047822, e, l) ? Unit.INSTANCE : null;
    }

    @Override
    public String N() {
        return "T[" + String.valueOf(this.N) + "]";
    }
}

