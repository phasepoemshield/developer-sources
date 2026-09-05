/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03291
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class03291;
import minecraft.class07209;

public final class class04780
extends Record {
    private final class07209 position;
    private final Either<Consumer<class03291>, class03291> generator;

    public Either<Consumer<class03291>, class03291> L() {
        return this.generator;
    }

    public class04780(class07209 class072092, Consumer<class03291> consumer) {
        this(class072092, (Either<Consumer<class03291>, class03291>)Either.left(consumer));
    }

    public class04780(class07209 class072092, Either<Consumer<class03291>, class03291> either) {
        this.position = class072092;
        this.generator = either;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04780.class, "position;generator", "position", "generator"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04780.class, "position;generator", "position", "generator"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04780.class, "position;generator", "position", "generator"}, this);
    }

    public class07209 y() {
        return this.position;
    }

    public class03291 N() {
        return (class03291)this.generator.map(consumer -> {
            class03291 class032912 = new class03291();
            consumer.accept(class032912);
            return class032912;
        }, class032912 -> class032912);
    }
}

