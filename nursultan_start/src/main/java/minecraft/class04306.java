/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00753
 *  minecraft.class00763
 *  minecraft.class07209
 *  minecraft.class07321
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00753;
import minecraft.class00763;
import minecraft.class04309;
import minecraft.class04332;
import minecraft.class07209;
import minecraft.class07321;

public final class class04306<T>
extends Record {
    private final T type;
    private final class07209 pos;
    private final int delay;
    private final class00763 priority;
    public static final Hash.Strategy<class04306<?>> N = new class04332();

    public int L() {
        return this.delay;
    }

    public class04306(T t, class07209 class072092, int n, class00763 class007632) {
        this.type = t;
        this.pos = class072092;
        this.delay = n;
        this.priority = class007632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04306.class, "type;pos;delay;priority", "type", "pos", "delay", "priority"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04306.class, "type;pos;delay;priority", "type", "pos", "delay", "priority"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04306.class, "type;pos;delay;priority", "type", "pos", "delay", "priority"}, this);
    }

    public class00763 u() {
        return this.priority;
    }

    public class07209 y() {
        return this.pos;
    }

    public T N() {
        return this.type;
    }

    public static <T> class04306<T> N(T t, class07209 class072092) {
        return new class04306<T>(t, class072092, 0, class00763.field_9314);
    }

    public static <T> List<class04306<T>> N(List<class04306<T>> list, class07321 class073212) {
        long l = class073212.y();
        return list.stream().filter(class043062 -> class07321.N((class07209)class043062.y()) == l).toList();
    }

    public class04309<T> N(long l, long l2) {
        return new class04309<T>(this.type, this.pos, l + (long)this.delay, this.priority, l2);
    }

    public static <T> Codec<class04306<T>> N(Codec<T> codec) {
        MapCodec mapCodec = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("x").forGetter(class00753::method_10263), (App)Codec.INT.fieldOf("y").forGetter(class00753::method_10264), (App)Codec.INT.fieldOf("z").forGetter(class00753::method_10260)).apply(instance, class07209::new));
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("i").forGetter(class04306::N), (App)mapCodec.forGetter(class04306::y), (App)Codec.INT.fieldOf("t").forGetter(class04306::L), (App)class00763.field_56697.fieldOf("p").forGetter(class04306::u)).apply((Applicative)instance, class04306::new));
    }
}

