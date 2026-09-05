/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02472;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import org.jspecify.annotations.Nullable;

public interface class02477<T> {
    public static final Codec<class02477<?>> N = Codec.lazyInitialized(() -> class04206.NW.T());
    public static final class02362<class04247, class02477<?>> y = class02362.N_32(class023622 -> class02389.N((class05946)class04227.b));
    public static final Codec<class02477<?>> L = N.validate(class024772 -> class024772.u() ? DataResult.error(() -> "Encountered transient component " + String.valueOf(class04206.NW.y(class024772))) : DataResult.success((Object)class024772));
    public static final Codec<Map<class02477<?>, Object>> u = Codec.dispatchedMap(L, class02477::L);

    default public Codec<T> L() {
        Codec<T> codec = this.y();
        if (codec == null) {
            throw new IllegalStateException(String.valueOf(this) + " is not a persistent component");
        }
        return codec;
    }

    public boolean i();

    default public boolean u() {
        return this.y() == null;
    }

    public @Nullable Codec<T> y();

    public static <T> class02472<T> N() {
        return new class02472();
    }

    public class02362<? super class04247, T> R();
}

