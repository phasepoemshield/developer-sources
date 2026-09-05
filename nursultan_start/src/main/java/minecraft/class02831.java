/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02808;
import minecraft.class02811;
import minecraft.class02836;
import minecraft.class02846;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public interface class02831 {
    public static final Codec<class02831> N = class02836.field_59742.dispatch("type", class02831::L, class028362 -> class028362.field_59747);
    public static final class02362<class04247, class02831> y = class02836.field_59744.N().y(class02831::L, class02836::y);

    public class02836 L();

    public static class02831 y() {
        return class02811.L;
    }

    public static class02831 N() {
        return class02846.L;
    }

    public void N(Consumer<class00392> var1, @Nullable class08036 var2, class03556<class07468> var3, class07471 var4);

    public static class02831 N(class00392 class003922) {
        return new class02808(class003922);
    }
}

