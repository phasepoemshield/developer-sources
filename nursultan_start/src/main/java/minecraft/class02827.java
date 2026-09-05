/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06563
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02835;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06563;
import minecraft.class06591;

public final class class02827
extends Record
implements class02694 {
    private final class02835 shape;
    private final IntList colors;
    private final IntList fadeColors;
    private final boolean hasTrail;
    private final boolean hasTwinkle;
    public static final class02827 N = new class02827(class02835.field_7976, IntList.of(), IntList.of(), false, false);
    public static final Codec<IntList> y = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
    public static final Codec<class02827> L = RecordCodecBuilder.create(instance -> instance.group((App)class02835.field_49322.fieldOf("shape").forGetter(class02827::N), (App)y.optionalFieldOf("colors", (Object)IntList.of()).forGetter(class02827::y), (App)y.optionalFieldOf("fade_colors", (Object)IntList.of()).forGetter(class02827::L), (App)Codec.BOOL.optionalFieldOf("has_trail", (Object)false).forGetter(class02827::u), (App)Codec.BOOL.optionalFieldOf("has_twinkle", (Object)false).forGetter(class02827::i)).apply(instance, class02827::new));
    private static final class02362<ByteBuf, IntList> z = class02389.M.N_33(class02389.N()).N_10(IntArrayList::new, ArrayList::new);
    public static final class02362<ByteBuf, class02827> u = class02362.N(class02835.field_49321, class02827::N, z, class02827::y, z, class02827::L, (class02362)class02389.y, class02827::u, (class02362)class02389.y, class02827::i, class02827::new);
    private static final class00392 U = class00392.L((String)"item.minecraft.firework_star.custom_color");

    public IntList L() {
        return this.fadeColors;
    }

    public class02827(class02835 class028352, IntList intList, IntList intList2, boolean bl, boolean bl2) {
        this.shape = class028352;
        this.colors = intList;
        this.fadeColors = intList2;
        this.hasTrail = bl;
        this.hasTwinkle = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02827.class, "shape;colors;fadeColors;hasTrail;hasTwinkle", "shape", "colors", "fadeColors", "hasTrail", "hasTwinkle"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02827.class, "shape;colors;fadeColors;hasTrail;hasTwinkle", "shape", "colors", "fadeColors", "hasTrail", "hasTwinkle"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02827.class, "shape;colors;fadeColors;hasTrail;hasTwinkle", "shape", "colors", "fadeColors", "hasTrail", "hasTwinkle"}, this);
    }

    public boolean i() {
        return this.hasTwinkle;
    }

    public boolean u() {
        return this.hasTrail;
    }

    public IntList y() {
        return this.colors;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        consumer.accept((class00392)this.shape.N().N(class06541.field_1080));
        this.N(consumer);
    }

    private static class00392 N(class05216 class052162, IntList intList) {
        for (int i = 0; i < intList.size(); ++i) {
            if (i > 0) {
                class052162.i(", ");
            }
            class052162.y(class02827.N(intList.getInt(i)));
        }
        return class052162;
    }

    private static class00392 N(int n) {
        class06563 class065632 = class06563.y((int)n);
        if (class065632 == null) {
            return U;
        }
        return class00392.L((String)("item.minecraft.firework_star." + class065632.y()));
    }

    public class02827 N(IntList intList) {
        return new class02827(this.shape, this.colors, (IntList)new IntArrayList(intList), this.hasTrail, this.hasTwinkle);
    }

    public void N(Consumer<class00392> consumer) {
        if (!this.colors.isEmpty()) {
            consumer.accept(class02827.N(class00392.i().N(class06541.field_1080), this.colors));
        }
        if (!this.fadeColors.isEmpty()) {
            consumer.accept(class02827.N(class00392.L((String)"item.minecraft.firework_star.fade_to").y(class05220.l).N(class06541.field_1080), this.fadeColors));
        }
        if (this.hasTrail) {
            consumer.accept((class00392)class00392.L((String)"item.minecraft.firework_star.trail").N(class06541.field_1080));
        }
        if (this.hasTwinkle) {
            consumer.accept((class00392)class00392.L((String)"item.minecraft.firework_star.flicker").N(class06541.field_1080));
        }
    }

    public class02835 N() {
        return this.shape;
    }
}

