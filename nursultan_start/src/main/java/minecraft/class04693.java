/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00093
 *  minecraft.class00109
 *  minecraft.class00232
 *  minecraft.class00392
 *  minecraft.class02252
 *  minecraft.class03723
 *  minecraft.class04708
 *  minecraft.class04722
 *  minecraft.class04731
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05098
 *  minecraft.class05107
 *  minecraft.class05111
 *  minecraft.class05129
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06307
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import minecraft.class00093;
import minecraft.class00109;
import minecraft.class00232;
import minecraft.class00392;
import minecraft.class02252;
import minecraft.class03723;
import minecraft.class04702;
import minecraft.class04708;
import minecraft.class04722;
import minecraft.class04731;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05098;
import minecraft.class05107;
import minecraft.class05111;
import minecraft.class05129;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06307;
import org.slf4j.Logger;

public class class04693
extends class05129 {
    private static final class00392 y = class00392.L((String)"multiplayer.applyingPack");
    private static final Logger L = LogUtils.getLogger();
    private static final class00392 u = class00392.L((String)"mco.connect.connecting");
    private final class04981 i;
    private final class05096 R;

    public class04693(class05096 class050962, class04981 class049812) {
        this.R = class050962;
        this.i = class049812;
    }

    public void run() {
        class00093 class000932;
        try {
            class000932 = this.R();
        }
        catch (CancellationException cancellationException) {
            L.info("User aborted connecting to realms");
            return;
        }
        catch (class05097 class050972) {
            switch (class050972.N.N()) {
                case 6002: {
                    class04693.N((class05096)new class04731(this.R, this.i));
                    return;
                }
                case 6006: {
                    boolean bl = class06202.Nq().y(this.i.B);
                    class04693.N((class05096)(bl ? new class05107(this.R, this.i.y, this.i.z()) : new class04702((class00392)class00392.L((String)"mco.brokenworld.nonowner.title"), (class00392)class00392.L((String)"mco.brokenworld.nonowner.error"), this.R)));
                    return;
                }
            }
            this.N(class050972);
            L.error("Couldn't connect to world", (Throwable)class050972);
            return;
        }
        catch (TimeoutException timeoutException) {
            this.N((class00392)class00392.L((String)"mco.errorMessage.connectionFailure"));
            return;
        }
        catch (Exception exception) {
            L.error("Couldn't connect to world", (Throwable)exception);
            this.N(exception);
            return;
        }
        if (class000932.N() == null) {
            this.N((class00392)class00392.L((String)"mco.errorMessage.connectionFailure"));
            return;
        }
        boolean bl = class000932.y() != null && class000932.L() != null;
        class04708 class047082 = bl ? this.N(class000932, class04693.N(this.i), this::N) : this.N(class000932);
        class04693.N((class05096)class047082);
    }

    private CompletableFuture<?> N(class00093 class000932, UUID uUID) {
        try {
            if (class000932.y() == null) {
                return CompletableFuture.failedFuture(new IllegalStateException("resourcePackUrl was null"));
            }
            if (class000932.L() == null) {
                return CompletableFuture.failedFuture(new IllegalStateException("resourcePackHash was null"));
            }
            class00232 class002322 = class06202.Nq().yL();
            CompletableFuture var4 = class002322.y(uUID);
            class002322.M();
            class002322.N(uUID, new URL(class000932.y()), class000932.L());
            return var4;
        }
        catch (Exception exception) {
            return CompletableFuture.failedFuture(exception);
        }
    }

    private class03723 N(class00093 class000932, UUID uUID, Function<class00093, class05096> function) {
        class05216 class052162 = class00392.L((String)"mco.configure.world.resourcepack.question");
        return class02252.N((class05096)this.R, (class00392)class052162, class037232 -> {
            class04693.N((class05096)new class06307(y));
            ((CompletableFuture)this.N(class000932, uUID).thenRun(() -> class04693.N((class05096)((class05096)function.apply(class000932))))).exceptionally(throwable -> {
                class06202.Nq().yL().Z();
                L.error("Failed to download resource pack from {}", (Object)class000932, throwable);
                class04693.N((class05096)new class04702((class00392)class00392.L((String)"mco.download.resourcePack.fail"), this.R));
                return null;
            });
        });
    }

    private static UUID N(class04981 class049812) {
        if (class049812.b != null) {
            return UUID.nameUUIDFromBytes(("minigame:" + class049812.b).getBytes(StandardCharsets.UTF_8));
        }
        return UUID.nameUUIDFromBytes(("realms:" + Objects.requireNonNullElse(class049812.u, "") + ":" + class049812.T).getBytes(StandardCharsets.UTF_8));
    }

    public class00392 N() {
        return u;
    }

    public class04708 N(class00093 class000932) {
        return new class00109(this.R, class000932, (class05129)new class04722(this.R, this.i, class000932));
    }

    private class00093 R() throws class05097, TimeoutException, CancellationException {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 40; ++i) {
            if (this.y()) {
                throw new CancellationException();
            }
            try {
                return class051112.y(this.i.y);
            }
            catch (class05098 class050982) {
                class04693.N((long)class050982.L);
                continue;
            }
        }
        throw new TimeoutException();
    }
}

