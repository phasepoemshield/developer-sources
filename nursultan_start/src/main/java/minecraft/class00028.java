/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09109
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class07438
 */
package minecraft;

import Nursultan.class09109;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import minecraft.class00058;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class07438;

public class class00028 {
    public static final Codec<class00028> N = RecordCodecBuilder.create(instance -> instance.group((App)class05946.N(class00058.N).fieldOf("style").forGetter(class000282 -> class000282.u), (App)class06338.E.optionalFieldOf("color").forGetter(class000282 -> class000282.i)).apply(instance, class00028::new));
    public static final class02362<ByteBuf, class00028> y = class02362.N((class02362)class05946.y(class00058.N), class000282 -> class000282.u, (class02362)class02389.N((class02362)class02389.Y), class000282 -> class000282.i, class00028::new);
    public static final class00028 L = new class00028();
    public class05946<class09109> u = class00058.y;
    public Optional<Integer> i = Optional.empty();

    public class00028() {
    }

    private class00028(class05946<class09109> class059462, Optional<Integer> optional) {
        this.u = class059462;
        this.i = optional;
    }

    private class05946<class09109> y() {
        return this.u != class00058.y ? this.u : class00058.y;
    }

    public class00028 N(class07438 class074382) {
        class05946<class09109> var2 = this.y();
        Optional<Integer> var3 = this.i.or(() -> Optional.ofNullable(class074382.method_5781()).map(class005022 -> class005022.P().i()).map(n -> n == 0 ? -13619152 : n));
        if (var2 == this.u && var3.isEmpty()) {
            return this;
        }
        return new class00028(var2, var3);
    }

    public void N(class00028 class000282) {
        this.i = class000282.i;
        this.u = class000282.u;
    }

    public boolean N() {
        return this.u != class00058.y || this.i.isPresent();
    }
}

