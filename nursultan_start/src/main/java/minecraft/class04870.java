/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02263
 *  minecraft.class06251
 *  minecraft.class06262
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class01894;
import minecraft.class02263;
import minecraft.class04841;
import minecraft.class04866;
import minecraft.class06251;
import minecraft.class06262;
import org.jspecify.annotations.Nullable;

final class class04870
extends Record {
    private final class04841 id;
    private final class02263 filter;
    final Either<CompletableFuture<Optional<class06262>>, class01894> result;

    public Either<CompletableFuture<Optional<class06262>>, class01894> L() {
        return this.result;
    }

    class04870(class04841 class048412, class02263 class022632, Either<CompletableFuture<Optional<class06262>>, class01894> either) {
        this.id = class048412;
        this.filter = class022632;
        this.result = either;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04870.class, "id;filter;result", "id", "filter", "result"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04870.class, "id;filter;result", "id", "filter", "result"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04870.class, "id;filter;result", "id", "filter", "result"}, this);
    }

    public class02263 y() {
        return this.filter;
    }

    public class04841 N() {
        return this.id;
    }

    private class06251 N(class06251 class062512) {
        return new class06251(class062512.N(), this.filter.N(class062512.y()));
    }

    public Optional<List<class06251>> N(Function<class01894, @Nullable List<class06251>> function) {
        return (Optional)this.result.map(completableFuture -> ((Optional)completableFuture.join()).map(class062622 -> List.of(new class06251(class062622, this.filter))), class018942 -> {
            List list = (List)function.apply((class01894)class018942);
            if (list == null) {
                class04866.N.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", class018942, (Object)this.id);
                return Optional.empty();
            }
            return Optional.of(list.stream().map(this::N).toList());
        });
    }
}

