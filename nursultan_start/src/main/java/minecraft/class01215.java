/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01894
 *  minecraft.class06338
 *  minecraft.class06359
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01208;
import minecraft.class01894;
import minecraft.class06338;
import minecraft.class06359;

public class class01215 {
    private static final Codec<class01215> field_39266 = RecordCodecBuilder.create(instance -> instance.group((App)class06338.k.fieldOf("id").forGetter(class01215::method_43936), (App)Codec.BOOL.optionalFieldOf("required", (Object)true).forGetter(class012152 -> class012152.field_39268)).apply(instance, class01215::new));
    public static final Codec<class01215> field_39265 = Codec.either((Codec)class06338.k, field_39266).xmap(either -> (class01215)either.map(class063592 -> new class01215((class06359)class063592, true), class012152 -> class012152), class012152 -> class012152.field_39268 ? Either.left((Object)class012152.method_43936()) : Either.right((Object)class012152));
    public final class01894 field_15584;
    public final boolean field_39267;
    public final boolean field_39268;

    public void method_32831(Consumer<class01894> consumer) {
        if (this.field_39267 && this.field_39268) {
            consumer.accept(this.field_15584);
        }
    }

    private class06359 method_43936() {
        return new class06359(this.field_15584, this.field_39267);
    }

    public <T> boolean method_26790(class01208<T> class012082, Consumer<T> consumer) {
        if (this.field_39267) {
            Collection<T> collection = class012082.method_43949(this.field_15584);
            if (collection == null) {
                return !this.field_39268;
            }
            collection.forEach(consumer);
        } else {
            T t = class012082.method_43948(this.field_15584, this.field_39268);
            if (t == null) {
                return !this.field_39268;
            }
            consumer.accept(t);
        }
        return true;
    }

    public void method_43944(Consumer<class01894> consumer) {
        if (this.field_39267 && !this.field_39268) {
            consumer.accept(this.field_15584);
        }
    }

    private class01215(class06359 class063592, boolean bl) {
        this.field_15584 = class063592.N();
        this.field_39267 = class063592.y();
        this.field_39268 = bl;
    }

    public class01215(class01894 class018942, boolean bl, boolean bl2) {
        this.field_15584 = class018942;
        this.field_39267 = bl;
        this.field_39268 = bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.field_39267) {
            stringBuilder.append('#');
        }
        stringBuilder.append(this.field_15584);
        if (!this.field_39268) {
            stringBuilder.append('?');
        }
        return stringBuilder.toString();
    }

    public static class01215 method_43937(class01894 class018942) {
        return new class01215(class018942, false, true);
    }

    public static class01215 method_43947(class01894 class018942) {
        return new class01215(class018942, true, false);
    }

    public static class01215 method_43945(class01894 class018942) {
        return new class01215(class018942, true, true);
    }

    public static class01215 method_43942(class01894 class018942) {
        return new class01215(class018942, false, false);
    }

    public boolean method_32832(Predicate<class01894> predicate, Predicate<class01894> predicate2) {
        return !this.field_39268 || (this.field_39267 ? predicate2 : predicate).test(this.field_15584);
    }
}

