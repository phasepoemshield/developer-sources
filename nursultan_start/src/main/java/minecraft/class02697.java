/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00392
 *  minecraft.class00909
 *  minecraft.class01653
 *  minecraft.class06497
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00909;
import minecraft.class01653;
import minecraft.class02666;
import minecraft.class02677;
import minecraft.class02689;
import minecraft.class06497;
import minecraft.class06591;

public final class class02697
extends class02689 {
    public static final class02697 i = new class02697((Either<GameProfile, class02677>)Either.right((Object)((Object)class02677.u)), class01653.i);
    private final Either<GameProfile, class02677> R;

    class02697(Either<GameProfile, class02677> either, class01653 class016532) {
        super((GameProfile)either.map(gameProfile -> gameProfile, class02677::u), class016532);
        this.R = either;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof class02697)) return false;
        class02697 class026972 = (class02697)object;
        if (!this.R.equals(class026972.R)) return false;
        if (!this.u.equals((Object)class026972.u)) return false;
        return true;
    }

    public int hashCode() {
        int n = 31 + this.R.hashCode();
        n = 31 * n + this.u.hashCode();
        return n;
    }

    @Override
    public Optional<String> u() {
        return (Optional)this.R.map(gameProfile -> Optional.of(gameProfile.name()), class026772 -> class026772.N());
    }

    @Override
    public CompletableFuture<GameProfile> N(class00909 class009092) {
        return CompletableFuture.completedFuture(this.L);
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
    }

    @Override
    protected Either<GameProfile, class02677> N() {
        return this.R;
    }
}

