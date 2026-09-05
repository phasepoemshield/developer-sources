/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Objects;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02461;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class04247;
import org.jspecify.annotations.Nullable;

public class class02472<T> {
    private @Nullable Codec<T> N;
    private @Nullable class02362<? super class04247, T> y;
    private boolean L;
    private boolean u;

    public class02472<T> L() {
        this.u = true;
        return this;
    }

    public class02477<T> y() {
        class02362 class023622 = Objects.requireNonNullElseGet(this.y, () -> class02389.u(Objects.requireNonNull(this.N, "Missing Codec for component")));
        Codec codec = this.L && this.N != null ? class02484.N.N(this.N) : this.N;
        return new class02461(codec, class023622, this.u);
    }

    public class02472<T> N() {
        this.L = true;
        return this;
    }

    public class02472<T> N(Codec<T> codec) {
        this.N = codec;
        return this;
    }

    public class02472<T> N(class02362<? super class04247, T> class023622) {
        this.y = class023622;
        return this;
    }
}

