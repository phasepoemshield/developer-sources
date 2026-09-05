/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01124
 *  minecraft.class01128
 *  minecraft.class01129
 *  minecraft.class01131
 *  minecraft.class01135
 *  minecraft.class04197
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.UUID;
import java.util.function.Consumer;
import minecraft.class00734;
import minecraft.class01124;
import minecraft.class01128;
import minecraft.class01129;
import minecraft.class01131;
import minecraft.class01135;
import minecraft.class04197;
import org.jspecify.annotations.Nullable;

public class class01103<T extends class01135>
implements class01124<T> {
    private final class01131<T> N;
    private final class01129<T> y;

    public class01103(class01131<T> class011312, class01129<T> class011292) {
        this.N = class011312;
        this.y = class011292;
    }

    public <U extends T> void N(class01128<T, U> class011282, class04197<U> class041972) {
        this.N.N(class011282, class041972);
    }

    public void N(class00734 class007342, Consumer<T> consumer) {
        this.y.y(class007342, class04197.N(consumer));
    }

    public <U extends T> void N(class01128<T, U> class011282, class00734 class007342, class04197<U> class041972) {
        this.y.N(class011282, class007342, class041972);
    }

    public Iterable<T> N() {
        return this.N.N();
    }

    public @Nullable T N(UUID uUID) {
        return (T)this.N.N(uUID);
    }

    public @Nullable T N(int n) {
        return (T)this.N.N(n);
    }
}

