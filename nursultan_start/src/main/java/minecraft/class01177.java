/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01487
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import minecraft.class01182;
import minecraft.class01190;
import minecraft.class01487;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;

public class class01177
implements class01190 {
    public static final MapCodec<class01177> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01487.N.fieldOf("source_entity").forGetter(class01177::y), (App)Codec.FLOAT.fieldOf("y_offset").orElse((Object)Float.valueOf(0.0f)).forGetter(class011772 -> Float.valueOf(class011772.R))).apply(instance, (uUID, f) -> new class01177((Either<class07049, Either<UUID, Integer>>)Either.right((Object)Either.left((Object)uUID)), f.floatValue())));
    public static final class02362<ByteBuf, class01177> y = class02362.N((class02362)class02389.B, class01177::L, (class02362)class02389.E, class011772 -> Float.valueOf(class011772.R), (n, f) -> new class01177((Either<class07049, Either<UUID, Integer>>)Either.right((Object)Either.right((Object)n)), f.floatValue()));
    private Either<class07049, Either<UUID, Integer>> i;
    private final float R;

    private int L() {
        return (Integer)this.i.map(class07049::method_5628, either -> (Integer)either.map(uUID -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
        }, Function.identity()));
    }

    public class01177(class07049 class070492, float f) {
        this((Either<class07049, Either<UUID, Integer>>)Either.left((Object)class070492), f);
    }

    private class01177(Either<class07049, Either<UUID, Integer>> either, float f) {
        this.i = either;
        this.R = f;
    }

    private void y(class07299 class072992) {
        ((Optional)this.i.map(Optional::of, either -> Optional.ofNullable((class07049)either.map(uUID -> class072992 instanceof class04782 ? ((class04782)class072992).method_66347(uUID) : null, arg_0 -> ((class07299)class072992).method_8469(arg_0))))).ifPresent(class070492 -> {
            this.i = Either.left((Object)class070492);
        });
    }

    public UUID y() {
        return (UUID)this.i.map(class07049::method_5667, either -> (UUID)either.map(Function.identity(), n -> {
            throw new RuntimeException("Unable to get entityId from uuid");
        }));
    }

    @Override
    public Optional<class06889> N(class07299 class072992) {
        if (this.i.left().isEmpty()) {
            this.y(class072992);
        }
        return this.i.left().map(class070492 -> class070492.method_73189().y(0.0, (double)this.R, 0.0));
    }

    public class01182<class01177> N() {
        return class01182.y;
    }
}

