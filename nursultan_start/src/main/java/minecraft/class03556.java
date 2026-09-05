/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10213
 *  com.mojang.datafixers.util.Either
 *  minecraft.class01894
 *  minecraft.class02042
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class10213;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02042;
import minecraft.class03530;
import minecraft.class03535;
import minecraft.class05946;

public interface class03556<T> {
    public Stream<class03530<T>> L();

    default public String M() {
        return this.i().map(class059462 -> class059462.N().toString()).orElse("[unregistered]");
    }

    public Optional<class05946<T>> i();

    public Either<class05946<T>, T> u();

    public boolean y();

    public boolean N(class01894 var1);

    public T N();

    public boolean N(class02042<T> var1);

    public static <T> class03556<T> N(T t) {
        return new class10213(t);
    }

    public boolean N(class03530<T> var1);

    @Deprecated
    public boolean N(class03556<T> var1);

    public boolean N(Predicate<class05946<T>> var1);

    public boolean N(class05946<T> var1);

    public class03535 R();
}

