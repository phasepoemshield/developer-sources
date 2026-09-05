/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00753
 *  minecraft.class01203
 *  minecraft.class01224
 *  minecraft.class01228
 *  minecraft.class01894
 *  minecraft.class02610
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04336
 *  minecraft.class04861
 *  minecraft.class04869
 *  minecraft.class04872
 *  minecraft.class04881
 *  minecraft.class05057
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05483
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00753;
import minecraft.class01203;
import minecraft.class01224;
import minecraft.class01228;
import minecraft.class01894;
import minecraft.class02610;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04336;
import minecraft.class04861;
import minecraft.class04869;
import minecraft.class04872;
import minecraft.class04881;
import minecraft.class05057;
import minecraft.class05163;
import minecraft.class05246;
import minecraft.class05267;
import minecraft.class05324;
import minecraft.class05483;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public abstract class class05248 {
    public static final Codec<class05248> i = class04206.NM.T().dispatch("element_type", class05248::N, class05267::codec);
    private static final class03556<class05483> N = class03556.N((Object)new class05483(List.of()));
    private volatile @Nullable class05246 y;

    public class05246 M() {
        class05246 class052462 = this.y;
        if (class052462 == null) {
            throw new IllegalStateException();
        }
        return class052462;
    }

    public class05248(class05246 class052462) {
        this.y = class052462;
    }

    public int B() {
        return 1;
    }

    public static Function<class05246, class04869> Z() {
        return class052462 -> class04869.y;
    }

    public static Function<class05246, class04872> y(String string) {
        return class052462 -> new class04872(Either.left((Object)class01894.N((String)string)), N, class052462, Optional.empty());
    }

    public static Function<class05246, class04881> y(List<Function<class05246, ? extends class05248>> list) {
        return class052462 -> new class04881(list.stream().map(function -> (class05248)function.apply(class052462)).collect(Collectors.toList()), class052462);
    }

    public static Function<class05246, class04872> y(String string, class03556<class05483> class035562) {
        return class052462 -> new class04872(Either.left((Object)class01894.N((String)string)), class035562, class052462, Optional.empty());
    }

    public abstract class00753 N(class01224 var1, class06993 var2);

    public abstract List<class01203> N(class01224 var1, class07209 var2, class06993 var3, class06069 var4);

    public abstract class05163 N(class01224 var1, class07209 var2, class06993 var3);

    public abstract class05267<?> N();

    public void N(class07284 class072842, class01228 class012282, class07209 class072092, class06993 class069932, class06069 class060692, class05163 class051632) {
    }

    public static Function<class05246, class05057> N(String string, class03556<class05483> class035562) {
        return class052462 -> new class05057(Either.left((Object)class01894.N((String)string)), class035562, class052462, Optional.empty());
    }

    public static Function<class05246, class05057> N(String string) {
        return class052462 -> new class05057(Either.left((Object)class01894.N((String)string)), N, class052462, Optional.empty());
    }

    public class05248 N(class05246 class052462) {
        this.y = class052462;
        return this;
    }

    public abstract boolean N(class01224 var1, class05974 var2, class05324 var3, class08088 var4, class07209 var5, class07209 var6, class06993 var7, class05163 var8, class06069 var9, class02610 var10, boolean var11);

    public static Function<class05246, class04861> N(class03556<class04336> class035562) {
        return class052462 -> new class04861(class035562, class052462);
    }

    public static Function<class05246, class04872> N(String string, class03556<class05483> class035562, class02610 class026102) {
        return class052462 -> new class04872(Either.left((Object)class01894.N((String)string)), class035562, class052462, Optional.of(class026102));
    }

    public static Function<class05246, class04872> N(String string, class02610 class026102) {
        return class052462 -> new class04872(Either.left((Object)class01894.N((String)string)), N, class052462, Optional.of(class026102));
    }

    protected static <E extends class05248> RecordCodecBuilder<E, class05246> R() {
        return class05246.field_24956.fieldOf("projection").forGetter(class05248::M);
    }
}

