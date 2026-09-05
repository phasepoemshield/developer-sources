/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04227
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class05281
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import minecraft.class03129;
import minecraft.class04227;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class05281;
import minecraft.class05946;
import minecraft.class06069;

public final class class03120
extends Record
implements class03129 {
    private final class05946<class05281> alias;
    private final class04540<class05946<class05281>> targets;
    static MapCodec<class03120> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.yv).fieldOf("alias").forGetter(class03120::L), (App)class04540.y((Codec)class05946.N((class05946)class04227.yv)).fieldOf("targets").forGetter(class03120::u)).apply(instance, class03120::new));

    public class05946<class05281> L() {
        return this.alias;
    }

    public class03120(class05946<class05281> class059462, class04540<class05946<class05281>> class045402) {
        this.alias = class059462;
        this.targets = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03120.class, "alias;targets", "alias", "targets"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03120.class, "alias;targets", "alias", "targets"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03120.class, "alias;targets", "alias", "targets"}, this);
    }

    public class04540<class05946<class05281>> u() {
        return this.targets;
    }

    public MapCodec<class03120> y() {
        return N;
    }

    @Override
    public void N(class06069 class060692, BiConsumer<class05946<class05281>, class05946<class05281>> biConsumer) {
        this.targets.N(class060692).ifPresent(class059462 -> biConsumer.accept(this.alias, (class05946<class05281>)class059462));
    }

    @Override
    public Stream<class05946<class05281>> N() {
        return this.targets.u().stream().map(class04523::N);
    }
}

