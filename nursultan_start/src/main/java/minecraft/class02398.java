/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import minecraft.class02362;

class class02398<B, L, R>
implements class02362<B, Either<L, R>> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ class02362 y;

    class02398(class02362 class023622, class02362 class023623) {
        this.N = class023622;
        this.y = class023623;
    }

    public void encode(B b, Either<L, R> either) {
        either.ifLeft(object -> {
            b.writeBoolean(true);
            this.N.encode(b, object);
        }).ifRight(object -> {
            b.writeBoolean(false);
            this.y.encode(b, object);
        });
    }

    public Either<L, R> decode(B b) {
        if (b.readBoolean()) {
            return Either.left((Object)this.N.decode(b));
        }
        return Either.right((Object)this.y.decode(b));
    }
}

