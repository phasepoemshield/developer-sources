/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00909
 *  minecraft.class01487
 *  minecraft.class01653
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06338
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class00909;
import minecraft.class01487;
import minecraft.class01653;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02677;
import minecraft.class02686;
import minecraft.class02694;
import minecraft.class02697;
import minecraft.class06338;
import minecraft.class07536;

public abstract sealed class class02689
implements class02694
permits class02697, class02686 {
    private static final Codec<class02689> i = RecordCodecBuilder.create(instance -> instance.group((App)Codec.mapEither((MapCodec)class06338.e, class02677.i).forGetter(class02689::N), (App)class01653.R.forGetter(class02689::L)).apply(instance, class02689::N));
    public static final Codec<class02689> N = Codec.withAlternative(i, (Codec)class06338.K, class02689::N);
    public static final class02362<ByteBuf, class02689> y = class02362.N((class02362)class02389.N((class02362)class02389.k, class02677.R), class02689::N, (class02362)class01653.M, class02689::L, class02689::N);
    protected final GameProfile L;
    protected final class01653 u;

    public class01653 L() {
        return this.u;
    }

    public class02689(GameProfile gameProfile, class01653 class016532) {
        this.L = gameProfile;
        this.u = class016532;
    }

    public abstract Optional<String> u();

    public GameProfile y() {
        return this.L;
    }

    private static class02689 N(Either<GameProfile, class02677> either, class01653 class016532) {
        return (class02689)either.map(gameProfile -> new class02697((Either<GameProfile, class02677>)Either.left((Object)gameProfile), class016532), class026772 -> {
            if (!class026772.L().isEmpty() || class026772.y().isPresent() == class026772.N().isPresent()) {
                return new class02697((Either<GameProfile, class02677>)Either.right((Object)class026772), class016532);
            }
            return class026772.N().map(string -> new class02686((Either<String, UUID>)Either.left((Object)string), class016532)).orElseGet(() -> new class02686((Either<String, UUID>)Either.right((Object)class026772.y().get()), class016532));
        });
    }

    public static class02689 N(GameProfile gameProfile) {
        return new class02697((Either<GameProfile, class02677>)Either.left((Object)gameProfile), class01653.i);
    }

    public static class02689 N(String string) {
        return new class02686((Either<String, UUID>)Either.left((Object)string), class01653.i);
    }

    public static class02689 N(UUID uUID) {
        return new class02686((Either<String, UUID>)Either.right((Object)uUID), class01653.i);
    }

    protected abstract Either<GameProfile, class02677> N();

    public abstract CompletableFuture<GameProfile> N(class00909 var1);

    static GameProfile N(Optional<String> optional, Optional<UUID> optional2, PropertyMap propertyMap) {
        String string = optional.orElse("");
        UUID uUID = optional2.orElseGet(() -> optional.map(class01487::N).orElse(class07536.R));
        return new GameProfile(uUID, string, propertyMap);
    }
}

