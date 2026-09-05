/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class05946;

public final class class02204<T>
extends Record {
    private final Either<class03556<T>, class05946<T>> contents;

    public class02204(class03556<T> class035562) {
        this(Either.left(class035562));
    }

    public class02204(Either<class03556<T>, class05946<T>> either) {
        this.contents = either;
    }

    public class02204(class05946<T> class059462) {
        this(Either.right(class059462));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02204.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02204.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02204.class, "contents", "contents"}, this);
    }

    public Either<class03556<T>, class05946<T>> y() {
        return this.contents;
    }

    public static <T> Codec<class02204<T>> N(class05946<class00751<T>> class059463, Codec<class03556<T>> codec) {
        return Codec.either(codec, (Codec)class05946.N(class059463).comapFlatMap(class059462 -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity())).xmap(class02204::new, class02204::y);
    }

    public Optional<class05946<T>> N() {
        return (Optional)this.contents.map(class03556::i, Optional::of);
    }

    public Optional<T> N(class00751<T> class007512) {
        return (Optional)this.contents.map(class035562 -> Optional.of(class035562.N()), arg_0 -> class007512.M(arg_0));
    }

    public static <T> class02362<class04247, class02204<T>> N(class05946<class00751<T>> class059462, class02362<class04247, class03556<T>> class023622) {
        return class02362.N((class02362)class02389.N(class023622, (class02362)class05946.y(class059462)), class02204::y, class02204::new);
    }

    public Optional<class03556<T>> N(class01929 class019292) {
        return (Optional)this.contents.map(Optional::of, class059462 -> class019292.u(class059462).map(class035292 -> class035292));
    }
}

