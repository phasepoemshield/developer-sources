/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.UserApiService
 *  minecraft.class04450
 *  minecraft.class04471
 *  minecraft.class04771
 */
package minecraft;

import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class02049;
import minecraft.class04450;
import minecraft.class04471;
import minecraft.class04771;

public interface class02051 {
    public static final class02051 N = new class02049();

    public boolean y();

    public CompletableFuture<Optional<class04450>> N();

    public static class02051 N(UserApiService userApiService, class04771 class047712, Path path) {
        return new class04471(userApiService, class047712.y(), path);
    }
}

