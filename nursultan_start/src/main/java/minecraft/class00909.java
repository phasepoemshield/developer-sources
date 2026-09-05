/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Either
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;

public interface class00909 {
    public Optional<GameProfile> N(String var1);

    public Optional<GameProfile> N(UUID var1);

    default public Optional<GameProfile> N(Either<String, UUID> either) {
        return (Optional)either.map(this::N, this::N);
    }
}

