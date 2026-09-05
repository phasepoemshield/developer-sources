/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04185
 *  minecraft.class04191
 *  minecraft.class04271
 *  net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse
 *  net.fabricmc.fabric.impl.networking.payload.PayloadHelper
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04185;
import minecraft.class04191;
import minecraft.class04271;
import minecraft.class07845;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse;
import net.fabricmc.fabric.impl.networking.payload.PayloadHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class07847
extends Record
implements class00381<class07845> {
    private final int transactionId;
    private final @Nullable class04191 payload;
    public static final class02362<class00667, class07847> N = class00381.N(class07847::L, class07847::N);
    private static final int u = 0x100000;

    private void L(class00667 class006673) {
        class006673.L(this.transactionId);
        class006673.N((Object)this.payload, (class006672, class041912) -> class041912.method_52295(class006672));
    }

    public class07847(int n, @Nullable class04191 class041912) {
        this.transactionId = n;
        this.payload = class041912;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07847.class, "transactionId;payload", "transactionId", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07847.class, "transactionId;payload", "transactionId", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07847.class, "transactionId;payload", "transactionId", "payload"}, this);
    }

    private static class04191 y(class00667 class006672) {
        int n = class006672.readableBytes();
        if (n < 0 || n > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
        class006672.skipBytes(n);
        return class04185.N;
    }

    public @Nullable class04191 y() {
        return this.payload;
    }

    public void method_65081(class07845 class078452) {
        class078452.N(this);
    }

    private static class07847 N(class00667 class006672) {
        int n = class006672.E();
        return new class07847(n, class07847.N(n, class006672));
    }

    private static void N(int n, class00667 class006672, CallbackInfoReturnable callbackInfoReturnable) {
        if (!class006672.readBoolean()) {
            callbackInfoReturnable.setReturnValue(null);
            return;
        }
        callbackInfoReturnable.setReturnValue((Object)new PacketByteBufLoginQueryResponse(PayloadHelper.read((class00667)class006672, (int)u)));
    }

    private static class04191 N(int n, class00667 class006672) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class07847.N(n, class006672, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04191)callbackInfoReturnable.getReturnValue();
        }
        return class07847.y(class006672);
    }

    public int N() {
        return this.transactionId;
    }

    public class02897<class07847> method_65080() {
        return class04271.R;
    }
}

