/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02263
 *  minecraft.class03511
 *  minecraft.class06251
 *  minecraft.class06254
 *  minecraft.class06262
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02263;
import minecraft.class03511;
import minecraft.class04841;
import minecraft.class04870;
import minecraft.class06251;
import minecraft.class06254;
import minecraft.class06262;

final class class04859
extends Record
implements class03511<class01894> {
    final class01894 fontId;
    private final List<class04870> builders;
    private final Set<class01894> dependencies;

    public Set<class01894> L() {
        return this.dependencies;
    }

    public class04859(class01894 class018942) {
        this(class018942, new ArrayList<class04870>(), new HashSet<class01894>());
    }

    private class04859(class01894 class018942, List<class04870> list, Set<class01894> set) {
        this.fontId = class018942;
        this.builders = list;
        this.dependencies = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04859.class, "fontId;builders;dependencies", "fontId", "builders", "dependencies"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04859.class, "fontId;builders;dependencies", "fontId", "builders", "dependencies"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04859.class, "fontId;builders;dependencies", "fontId", "builders", "dependencies"}, this);
    }

    public Stream<CompletableFuture<Optional<class06262>>> u() {
        return this.builders.stream().flatMap(class048702 -> class048702.L().left().stream());
    }

    public List<class04870> y() {
        return this.builders;
    }

    public void y(Consumer<class01894> consumer) {
    }

    public void N(class04841 class048412, class02263 class022632, CompletableFuture<Optional<class06262>> completableFuture) {
        this.builders.add(new class04870(class048412, class022632, (Either<CompletableFuture<Optional<class06262>>, class01894>)Either.left(completableFuture)));
    }

    public void N(class04841 class048412, class02263 class022632, class06254 class062542) {
        this.builders.add(new class04870(class048412, class022632, (Either<CompletableFuture<Optional<class06262>>, class01894>)Either.right((Object)class062542.N())));
        this.dependencies.add(class062542.N());
    }

    public class01894 N() {
        return this.fontId;
    }

    public Optional<List<class06251>> N(Function<class01894, List<class06251>> function) {
        ArrayList arrayList = new ArrayList();
        Iterator<class04870> var3 = this.builders.iterator();
        while (var3.hasNext()) {
            Optional<List<class06251>> var5 = var3.next().N(function);
            if (var5.isPresent()) {
                arrayList.addAll(var5.get());
                continue;
            }
            return Optional.empty();
        }
        return Optional.of(arrayList);
    }

    public void N(Consumer<class01894> consumer) {
        this.dependencies.forEach(consumer);
    }
}

