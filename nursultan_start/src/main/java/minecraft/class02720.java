/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06497
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06497;
import minecraft.class06591;

public final class class02720
extends Record
implements class02694 {
    private final class05946<class05074> lootTable;
    private final long seed;
    private static final class00392 u = class00392.L((String)"item.container.loot_table.unknown");
    public static final Codec<class02720> N = RecordCodecBuilder.create(instance -> instance.group((App)class05074.N.fieldOf("loot_table").forGetter(class02720::N), (App)Codec.LONG.optionalFieldOf("seed", (Object)0L).forGetter(class02720::y)).apply(instance, class02720::new));

    public class02720(class05946<class05074> class059462, long l) {
        this.lootTable = class059462;
        this.seed = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02720.class, "lootTable;seed", "lootTable", "seed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02720.class, "lootTable;seed", "lootTable", "seed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02720.class, "lootTable;seed", "lootTable", "seed"}, this);
    }

    public long y() {
        return this.seed;
    }

    public class05946<class05074> N() {
        return this.lootTable;
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        consumer.accept(u);
    }
}

