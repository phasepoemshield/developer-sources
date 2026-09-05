/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00392
 *  minecraft.class00909
 *  minecraft.class01653
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00909;
import minecraft.class01653;
import minecraft.class02666;
import minecraft.class02677;
import minecraft.class02689;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import minecraft.class07536;

public final class class02686
extends class02689 {
    private static final class00392 i = class00392.L((String)"component.profile.dynamic").N(class06541.field_1080);
    private final Either<String, UUID> R;

    class02686(Either<String, UUID> either, class01653 class016532) {
        super(class02689.N(either.left(), either.right(), PropertyMap.EMPTY), class016532);
        this.R = either;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof class02686)) return false;
        class02686 class026862 = (class02686)object;
        if (!this.R.equals(class026862.R)) return false;
        if (!this.u.equals((Object)class026862.u)) return false;
        return true;
    }

    public int hashCode() {
        int n = 31 + this.R.hashCode();
        n = 31 * n + this.u.hashCode();
        return n;
    }

    @Override
    public Optional<String> u() {
        return this.R.left();
    }

    @Override
    protected Either<GameProfile, class02677> N() {
        return Either.right((Object)((Object)new class02677(this.R.left(), this.R.right(), PropertyMap.EMPTY)));
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        consumer.accept(i);
    }

    @Override
    public CompletableFuture<GameProfile> N(class00909 class009092) {
        return CompletableFuture.supplyAsync(() -> class009092.N(this.R).orElse(this.L), (Executor)class07536.z());
    }
}

