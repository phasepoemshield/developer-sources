/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  minecraft.class00700
 *  minecraft.class01487
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00700;
import minecraft.class01487;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public final class class02592 {
    public static final Codec<class02592> N = Codec.xor((Codec)class01487.N.fieldOf("UUID").codec(), (Codec)class07209.field_25064).xmap(class02592::new, class025922 -> {
        class07049 class070492 = class025922.L;
        if (class070492 instanceof class00700) {
            return Either.right((Object)((class00700)class070492).s());
        }
        if (class025922.L != null) {
            return Either.left((Object)class025922.L.method_5667());
        }
        return Objects.requireNonNull(class025922.u, "Invalid LeashData had no attachment");
    });
    int y;
    public @Nullable class07049 L;
    public @Nullable Either<UUID, class07209> u;
    public double i;

    class02592(int n) {
        this.y = n;
    }

    class02592(class07049 class070492) {
        this.L = class070492;
    }

    private class02592(Either<UUID, class07209> either) {
        this.u = either;
    }

    public void N(class07049 class070492) {
        this.L = class070492;
        this.u = null;
        this.y = 0;
    }
}

