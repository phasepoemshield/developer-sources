/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  minecraft.class00189
 *  minecraft.class00392
 *  minecraft.class01631
 *  minecraft.class02131
 *  minecraft.class03448
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07648
 *  minecraft.class07923
 *  minecraft.class07949
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00189;
import minecraft.class00392;
import minecraft.class01631;
import minecraft.class02131;
import minecraft.class03448;
import minecraft.class06602;
import minecraft.class06618;
import minecraft.class06622;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07648;
import minecraft.class07923;
import minecraft.class07949;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06603
extends class06622
implements class06618 {
    private static final Logger R = LogUtils.getLogger();
    public static final class01631 i = class00189.N((GameProfile)class06622.L.y());
    private final class06602 M = new class06602();
    private @Nullable CompletableFuture<Optional<class01631>> B;
    private class01631 Z = i;
    private final class07949 W;

    private void L() {
        if (this.B != null) {
            CompletableFuture<Optional<class01631>> completableFuture = this.B;
            this.B = null;
            completableFuture.cancel(false);
        }
        this.B = this.W.L(this.N()).thenApply(optional -> optional.map(class07923::y));
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (class021312.equals((Object)N)) {
            this.L();
        }
    }

    public void method_5773() {
        super.method_5773();
        this.M.N(this.method_73189(), this.method_18798());
        if (this.B != null && this.B.isDone()) {
            try {
                this.B.get().ifPresent(this::N);
                this.B = null;
            }
            catch (Exception exception) {
                R.error("Error when trying to look up skin", (Throwable)exception);
            }
        }
    }

    public class06603(class07299 class072992, class07949 class079492) {
        super(class072992);
        this.W = class079492;
    }

    @Override
    public class06602 B() {
        return this.M;
    }

    @Override
    public class01631 Z() {
        return this.Z;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public @Nullable class00392 z() {
        return this.y();
    }

    @Override
    public @Nullable class07648 y(boolean bl) {
        return null;
    }

    public static void N(class07949 class079492) {
        class06622.u = (class070782, class072992) -> class072992 instanceof class03448 ? new class06603(class072992, class079492) : new class06622((class07078<class06622>)class070782, class072992);
    }

    private void N(class01631 class016312) {
        this.Z = class016312;
    }
}

