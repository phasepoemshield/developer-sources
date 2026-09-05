/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03802
 *  minecraft.class03824
 *  minecraft.class03849
 */
package minecraft;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class00232;
import minecraft.class03802;
import minecraft.class03824;
import minecraft.class03849;

class class00221
implements class03802 {
    final /* synthetic */ class03802 N;
    final /* synthetic */ UUID y;
    final /* synthetic */ CompletableFuture L;
    final /* synthetic */ class00232 u;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00221(class00232 class002322, class03802 class038022, UUID uUID, CompletableFuture completableFuture) {
        this.u = class002322;
        this.N = class038022;
        this.y = uUID;
        this.L = completableFuture;
    }

    public void N(UUID uUID, class03849 class038492) {
        this.N.N(uUID, class038492);
    }

    public void N(UUID uUID, class03824 class038242) {
        if (this.y.equals(uUID)) {
            this.u.u = this.N;
            if (class038242 == class03824.field_47624) {
                this.L.complete(null);
            } else {
                this.L.completeExceptionally(new IllegalStateException("Failed to apply pack " + String.valueOf(uUID) + ", reason: " + String.valueOf(class038242)));
            }
        }
        this.N.N(uUID, class038242);
    }
}

