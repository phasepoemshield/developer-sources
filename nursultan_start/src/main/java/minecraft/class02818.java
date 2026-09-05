/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10013
 *  Nursultan.class10015
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10013;
import Nursultan.class10015;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public interface class02818<T> {
    public @Nullable T y(@Nullable T var1);

    public @Nullable String y();

    public <E extends Throwable> T y(Supplier<E> var1) throws E;

    public <R> class02818<R> N_11(Function<T, R> var1);

    public class02818<T> N_36(Consumer<T> var1);

    public static <T> class02818<T> N(T t) {
        return new class10015(t);
    }

    public static <T> class02818<T> N(String string) {
        return class02818.N(() -> string);
    }

    public static <T> class02818<T> N(Supplier<String> supplier) {
        return new class10013(supplier);
    }

    public boolean N();

    public static <R> @Nullable R N(class02818<? extends R> class028182, @Nullable R r) {
        R r2 = class028182.y((R)null);
        return r2 != null ? r2 : (R)r;
    }
}

