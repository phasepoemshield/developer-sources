/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00638
 *  minecraft.class02897
 *  minecraft.class03242
 *  minecraft.class03253
 *  minecraft.class03257
 *  minecraft.class03260
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00381;
import minecraft.class00638;
import minecraft.class02897;
import minecraft.class03242;
import minecraft.class03253;
import minecraft.class03257;
import minecraft.class03260;
import org.jspecify.annotations.Nullable;

public interface class03276 {
    public static final int N = 4096;

    public static <T extends class00638, P extends class03260<? super T>> class03276 N(class02897<P> class028972, Function<Iterable<class00381<? super T>>, P> function, class03242<? super T> class032422) {
        return new class03253(class028972, class032422, function);
    }

    public void N(class00381<?> var1, Consumer<class00381<?>> var2);

    public @Nullable class03257 N(class00381<?> var1);
}

