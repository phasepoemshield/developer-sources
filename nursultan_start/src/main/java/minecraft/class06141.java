/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class04643
 *  minecraft.class06244
 *  minecraft.class08700
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class04643;
import minecraft.class06244;
import minecraft.class08700;

public interface class06141
extends class01081 {
    public void method_14491(class01089 var1);

    default public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        class01089 class010892 = class010732.N();
        return class010802.N((Object)class06244.field_17274).thenRunAsync(() -> {
            class04643 class046432 = class08700.N();
            class046432.N("listener");
            this.method_14491(class010892);
            class046432.L();
        }, executor2);
    }
}

