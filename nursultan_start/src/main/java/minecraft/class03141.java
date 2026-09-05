/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04227
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import minecraft.class03129;
import minecraft.class04227;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class06069;

public final class class03141
extends Record
implements class03129 {
    private final class05946<class05281> alias;
    private final class05946<class05281> target;
    static MapCodec<class03141> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.yv).fieldOf("alias").forGetter(class03141::L), (App)class05946.N((class05946)class04227.yv).fieldOf("target").forGetter(class03141::u)).apply(instance, class03141::new));

    public class05946<class05281> L() {
        return this.alias;
    }

    public class03141(class05946<class05281> class059462, class05946<class05281> class059463) {
        this.alias = class059462;
        this.target = class059463;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03141.class, "alias;target", "alias", "target"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03141.class, "alias;target", "alias", "target"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03141.class, "alias;target", "alias", "target"}, this);
    }

    public class05946<class05281> u() {
        return this.target;
    }

    public MapCodec<class03141> y() {
        return N;
    }

    @Override
    public Stream<class05946<class05281>> N() {
        return Stream.of(this.target);
    }

    @Override
    public void N(class06069 class060692, BiConsumer<class05946<class05281>, class05946<class05281>> biConsumer) {
        biConsumer.accept(this.alias, this.target);
    }
}

