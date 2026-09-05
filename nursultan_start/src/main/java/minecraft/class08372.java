/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01067
 *  minecraft.class01487
 *  minecraft.class02362
 *  minecraft.class02796
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08607
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01067;
import minecraft.class01487;
import minecraft.class02362;
import minecraft.class02796;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08607;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public final class class08372<StoredEntityType extends class08636> {
    private static final Codec<? extends class08372<?>> N = class01487.N.xmap(class08372::new, class08372::L);
    private static final class02362<ByteBuf, ? extends class08372<?>> y = class01487.M.N_10(class08372::new, class08372::L);
    private Either<UUID, StoredEntityType> L;

    public UUID L() {
        return (UUID)this.L.map(uUID -> uUID, class08636::method_5667);
    }

    public static @Nullable class08036 L(@Nullable class08372<class08036> class083722, class07299 class072992) {
        return class08372.N(class083722, class072992, class08036.class);
    }

    private class08372(UUID uUID) {
        this.L = Either.left((Object)uUID);
    }

    private class08372(StoredEntityType StoredEntityType) {
        this.L = Either.right(StoredEntityType);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class08372)) return false;
        class08372 class083722 = (class08372)object;
        if (!this.L().equals(class083722.L())) return false;
        return true;
    }

    public int hashCode() {
        return this.L().hashCode();
    }

    public boolean y(StoredEntityType StoredEntityType) {
        return this.L().equals(StoredEntityType.method_5667());
    }

    public static <Type extends class08636> class02362<ByteBuf, class08372<Type>> y() {
        return y;
    }

    public static @Nullable class07438 y(@Nullable class08372<class07438> class083722, class07299 class072992) {
        return class08372.N(class083722, class072992, class07438.class);
    }

    public static <StoredEntityType extends class08636> @Nullable class08372<StoredEntityType> N(class08299 class082992, String string) {
        return class082992.N(string, class08372.N()).orElse(null);
    }

    public static <StoredEntityType extends class08636> @Nullable class08372<StoredEntityType> N(class08299 class082992, String string2, class07299 class072992) {
        Optional var3 = class082992.N(string2, class01487.N);
        if (var3.isPresent()) {
            return class08372.N((UUID)var3.get());
        }
        return class082992.M(string2).map(string -> class01067.N((class02796)class072992.method_8503(), (String)string)).map(class08372::new).orElse(null);
    }

    public static <Type extends class08636> Codec<class08372<Type>> N() {
        return N;
    }

    private @Nullable StoredEntityType N(@Nullable class08636 class086362, Class<StoredEntityType> clazz) {
        if (class086362 != null && clazz.isAssignableFrom(class086362.getClass())) {
            return (StoredEntityType)((class08636)clazz.cast(class086362));
        }
        return null;
    }

    public @Nullable StoredEntityType N(class07299 class072992, Class<StoredEntityType> clazz) {
        if (class08036.class.isAssignableFrom(clazz)) {
            return this.N((class08607<class08636>)((class08607)arg_0 -> ((class07299)class072992).method_73285(arg_0)), clazz);
        }
        return this.N((class08607<class08636>)((class08607)arg_0 -> ((class07299)class072992).method_73284(arg_0)), clazz);
    }

    public @Nullable StoredEntityType N(class08607<? extends class08636> class086072, Class<StoredEntityType> clazz) {
        StoredEntityType StoredEntityType;
        Object object;
        Optional optional = this.L.right();
        if (optional.isPresent()) {
            object = (class08636)optional.get();
            if (object.method_31481()) {
                this.L = Either.left((Object)object.method_5667());
            } else {
                return (StoredEntityType)object;
            }
        }
        if (((Optional)(object = this.L.left())).isPresent() && (StoredEntityType = this.N(class086072.lookup((UUID)((Optional)object).get()), clazz)) != null && !StoredEntityType.method_31481()) {
            this.L = Either.right(StoredEntityType);
            return StoredEntityType;
        }
        return null;
    }

    public static <T extends class08636> class08372<T> N(UUID uUID) {
        return new class08372(uUID);
    }

    public static <T extends class08636> @Nullable class08372<T> N(@Nullable T t) {
        return t != null ? new class08372<T>(t) : null;
    }

    public static @Nullable class07049 N(@Nullable class08372<class07049> class083722, class07299 class072992) {
        return class08372.N(class083722, class072992, class07049.class);
    }

    public static <StoredEntityType extends class08636> @Nullable StoredEntityType N(@Nullable class08372<StoredEntityType> class083722, class07299 class072992, Class<StoredEntityType> clazz) {
        return class083722 != null ? (StoredEntityType)class083722.N(class072992, clazz) : null;
    }

    public static void N(@Nullable class08372<?> class083722, class08329 class083292, String string) {
        if (class083722 != null) {
            class083722.N(class083292, string);
        }
    }

    public void N(class08329 class083292, String string) {
        class083292.N(string, class01487.N, this.L());
    }
}

