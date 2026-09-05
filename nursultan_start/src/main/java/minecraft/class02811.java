/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
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

import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02831;
import minecraft.class02836;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public record class02811() implements class02831
{
    static final class02811 L = new class02811();
    static final MapCodec<class02811> u = MapCodec.unit((Object)L);
    static final class02362<class04247, class02811> i = class02362.N((Object)L);

    @Override
    public class02836 L() {
        return class02836.field_59740;
    }

    @Override
    public void N(Consumer<class00392> consumer, @Nullable class08036 class080362, class03556<class07468> class035562, class07471 class074712) {
    }
}

