/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06338
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02827;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06338;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;

public final class class02813
extends Record
implements class02694 {
    private final int flightDuration;
    private final List<class02827> explosions;
    public static final int N = 256;
    public static final Codec<class02813> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.s.optionalFieldOf("flight_duration", (Object)0).forGetter(class02813::N), (App)class02827.L.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(class02813::y)).apply(instance, class02813::new));
    public static final class02362<ByteBuf, class02813> L = class02362.N((class02362)class02389.B, class02813::N, (class02362)class02827.u.N_33(class02389.L((int)256)), class02813::y, class02813::new);

    public class02813(int n, List<class02827> list) {
        if (list.size() > 256) {
            throw new IllegalArgumentException("Got " + list.size() + " explosions, but maximum is 256");
        }
        this.flightDuration = n;
        this.explosions = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02813.class, "flightDuration;explosions", "flightDuration", "explosions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02813.class, "flightDuration;explosions", "flightDuration", "explosions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02813.class, "flightDuration;explosions", "flightDuration", "explosions"}, this);
    }

    public List<class02827> y() {
        return this.explosions;
    }

    private static void N(Consumer<class00392> consumer, class02827 class028272, int n) {
        class05216 class052162 = class028272.N().N();
        if (n == 1) {
            consumer.accept((class00392)class00392.N((String)"item.minecraft.firework_rocket.single_star", (Object[])new Object[]{class052162}).N(class06541.field_1080));
        } else {
            consumer.accept((class00392)class00392.N((String)"item.minecraft.firework_rocket.multiple_stars", (Object[])new Object[]{n, class052162}).N(class06541.field_1080));
        }
        class028272.N(class003922 -> consumer.accept((class00392)class00392.y((String)"  ").y(class003922)));
    }

    public int N() {
        return this.flightDuration;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        if (this.flightDuration > 0) {
            consumer.accept((class00392)class00392.L((String)"item.minecraft.firework_rocket.flight").y(class05220.l).i(String.valueOf(this.flightDuration)).N(class06541.field_1080));
        }
        class02827 class028272 = null;
        int n = 0;
        for (class02827 class028273 : this.explosions) {
            if (class028272 == null) {
                class028272 = class028273;
                n = 1;
                continue;
            }
            if (class028272.equals((Object)class028273)) {
                ++n;
                continue;
            }
            class02813.N(consumer, class028272, n);
            class028272 = class028273;
            n = 1;
        }
        if (class028272 != null) {
            class02813.N(consumer, class028272, n);
        }
    }
}

