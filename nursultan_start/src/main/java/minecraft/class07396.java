/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class07536
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class04770;
import minecraft.class07403;
import minecraft.class07536;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;

public interface class07396 {
    public @Nullable class04770 L(String var1);

    public Optional<class08774> L(UUID var1);

    public Optional<class08774> y(UUID var1);

    public List<class04770> y(String var1);

    public Optional<class04770> y(Optional<UUID> var1, Optional<String> var2);

    public void N(class04770 var1, class07403 var2);

    public List<class04770> N();

    public Optional<class08774> N(String var1);

    public @Nullable class04770 N(UUID var1);

    default public CompletableFuture<Optional<class08774>> N(Optional<UUID> optional, Optional<String> optional2) {
        if (optional.isPresent()) {
            Optional<class08774> var3 = this.L(optional.get());
            if (var3.isPresent()) {
                return CompletableFuture.completedFuture(var3);
            }
            return CompletableFuture.supplyAsync(() -> this.y((UUID)optional.get()), (Executor)class07536.z());
        }
        if (optional2.isPresent()) {
            return CompletableFuture.supplyAsync(() -> this.N((String)optional2.get()), (Executor)class07536.z());
        }
        return CompletableFuture.completedFuture(Optional.empty());
    }
}

