/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class02042
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import minecraft.class02042;
import minecraft.class03530;
import minecraft.class03550;
import minecraft.class03556;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03552<T>
extends class03550<T> {
    private final class02042<T> y;
    private final class03530<T> L;
    public @Nullable List<class03556<T>> N;

    @Override
    public boolean L() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.N != null;
    }

    @Override
    protected List<class03556<T>> M() {
        this.N((CallbackInfoReturnable)null);
        if (this.N == null) {
            throw new IllegalStateException("Trying to access unbound tag '" + String.valueOf(this.L) + "' from registry " + String.valueOf(this.y));
        }
        return this.N;
    }

    public class03552(class02042<T> class020422, class03530<T> class035302) {
        this.y = class020422;
        this.L = class035302;
    }

    public String toString() {
        return "NamedSet(" + String.valueOf(this.L) + ")[" + String.valueOf(this.N) + "]";
    }

    public class03530<T> B() {
        return this.L;
    }

    @Override
    public Optional<class03530<T>> i() {
        return Optional.of(this.L);
    }

    @Override
    public Either<class03530<T>, List<class03556<T>>> u() {
        return Either.left(this.L);
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    public void y(List<class03556<T>> list) {
        this.N = List.copyOf(list);
    }

    @Override
    public boolean N(class03556<T> class035562) {
        return class035562.N(this.L);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) && this.N == null) {
            this.y(List.of());
        }
    }

    @Override
    public boolean N(class02042<T> class020422) {
        return this.y.N(class020422);
    }
}

