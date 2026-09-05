/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04155
 *  minecraft.class04177
 *  minecraft.class04271
 *  minecraft.class07844
 *  net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload
 *  net.fabricmc.fabric.impl.networking.payload.PayloadHelper
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04155;
import minecraft.class04177;
import minecraft.class04271;
import minecraft.class07844;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload;
import net.fabricmc.fabric.impl.networking.payload.PayloadHelper;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class07812
extends Record
implements class00381<class07844> {
    private final int transactionId;
    private final class04155 payload;
    public static final class02362<class00667, class07812> N = class00381.N(class07812::N, class07812::new);
    private static final int u = 0x100000;

    private class07812(class00667 class006672) {
        this(class006672.E(), class07812.N(class006672.T(), class006672));
    }

    public class07812(int n, class04155 class041552) {
        this.transactionId = n;
        this.payload = class041552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07812.class, "transactionId;payload", "transactionId", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07812.class, "transactionId;payload", "transactionId", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07812.class, "transactionId;payload", "transactionId", "payload"}, this);
    }

    private static class04177 y(class01894 class018942, class00667 class006672) {
        int n = class006672.readableBytes();
        if (n < 0 || n > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
        class006672.skipBytes(n);
        return new class04177(class018942);
    }

    public class04155 y() {
        return this.payload;
    }

    private static class04155 N(class01894 class018942, class00667 class006672) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class07812.N(class018942, class006672, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04155)callbackInfoReturnable.getReturnValue();
        }
        return class07812.y(class018942, class006672);
    }

    private static void N(class01894 class018942, class00667 class006672, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)new PacketByteBufLoginQueryRequestPayload(class018942, PayloadHelper.read((class00667)class006672, (int)u)));
    }

    private void N(class00667 class006672) {
        class006672.L(this.transactionId);
        class006672.N(this.payload.comp_1571());
        this.payload.method_52296(class006672);
    }

    public void method_65081(class07844 class078442) {
        class078442.N(this);
    }

    public int N() {
        return this.transactionId;
    }

    public class02897<class07812> method_65080() {
        return class04271.N;
    }
}

