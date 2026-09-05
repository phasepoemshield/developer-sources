/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  dev.isxander.yacl3.mixin.OptionInstanceAccessor
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05220
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06478
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import dev.isxander.yacl3.mixin.OptionInstanceAccessor;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class04344;
import minecraft.class04355;
import minecraft.class04363;
import minecraft.class04380;
import minecraft.class05220;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06478;
import org.slf4j.Logger;

public class class04370<T>
implements OptionInstanceAccessor {
    private static final Logger field_37862 = LogUtils.getLogger();
    public static final class04380<Boolean> field_38278 = new class04380(ImmutableList.of((Object)Boolean.TRUE, (Object)Boolean.FALSE), Codec.BOOL);
    public static final class04363<Boolean> field_41333 = (class003922, bl) -> bl != false ? class05220.y : class05220.L;
    private final class04355<T> field_37863;
    final Function<T, class00392> field_37864;
    private final class04344<T> field_37865;
    private final Codec<T> field_38279;
    private final T field_37866;
    private final Consumer<T> field_37867;
    final class00392 field_38280;
    private T field_37868;

    public static class04370<Boolean> method_41749(String string, class04355<Boolean> class043552, boolean bl2) {
        return class04370.method_41750(string, class043552, bl2, bl -> {});
    }

    public static class04370<Boolean> method_42402(String string, boolean bl2) {
        return class04370.method_41750(string, class04370.method_42399(), bl2, bl -> {});
    }

    public class06478 method_18520(class05630 class056302, int n, int n2, int n3) {
        return this.method_47603(class056302, n, n2, n3, object -> {});
    }

    public /* synthetic */ Object getInitialValue() {
        return this.field_37866;
    }

    public class04344<T> method_41754() {
        return this.field_37865;
    }

    public Codec<T> method_42404() {
        return this.field_38279;
    }

    public class06478 method_47603(class05630 class056302, int n, int n2, int n3, Consumer<T> consumer) {
        return this.field_37865.N(this.field_37863, class056302, n, n2, n3, consumer).apply(this);
    }

    public class06478 method_57701(class05630 class056302) {
        return this.method_18520(class056302, 0, 0, 150);
    }

    public class04370(String string, class04355<T> class043552, class04363<T> class043632, class04344<T> class043442, Codec<T> codec, T t, Consumer<T> consumer) {
        this.field_38280 = class00392.L((String)string);
        this.field_37863 = class043552;
        this.field_37864 = object -> class043632.toString(this.field_38280, object);
        this.field_37865 = class043442;
        this.field_38279 = codec;
        this.field_37866 = t;
        this.field_37867 = consumer;
        this.field_37868 = this.field_37866;
    }

    public class04370(String string, class04355<T> class043552, class04363<T> class043632, class04344<T> class043442, T t, Consumer<T> consumer) {
        this(string, class043552, class043632, class043442, class043442.y(), t, consumer);
    }

    public String toString() {
        return this.field_38280.getString();
    }

    public static class04370<Boolean> method_41751(String string, boolean bl, Consumer<Boolean> consumer) {
        return class04370.method_41750(string, class04370.method_42399(), bl, consumer);
    }

    public static <T> class04355<T> method_42399() {
        return object -> null;
    }

    public void method_41748(T t) {
        Object object = this.field_37865.u(t).orElseGet(() -> {
            field_37862.error("Illegal option value {} for {}", t, (Object)this.field_38280.getString());
            return this.field_37866;
        });
        if (!class06202.Nq().r()) {
            this.field_37868 = object;
            return;
        }
        if (!Objects.equals(this.field_37868, object)) {
            this.field_37868 = object;
            this.field_37867.accept(this.field_37868);
        }
    }

    public T method_41753() {
        return this.field_37868;
    }

    public static class04370<Boolean> method_47604(String string, class04355<Boolean> class043552, class04363<Boolean> class043632, boolean bl, Consumer<Boolean> consumer) {
        return new class04370<Boolean>(string, class043552, class043632, field_38278, bl, consumer);
    }

    public static class04370<Boolean> method_41750(String string, class04355<Boolean> class043552, boolean bl, Consumer<Boolean> consumer) {
        return class04370.method_47604(string, class043552, field_41333, bl, consumer);
    }

    public static <T> class04355<T> method_42717(class00392 class003922) {
        return object -> class04141.N((class00392)class003922);
    }
}

