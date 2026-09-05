/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01099
 *  minecraft.class07209
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 */
package minecraft;

import minecraft.class01099;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;

public class class00553
implements class01099,
WrappedBlockEntityTickInvokerAccessor {
    private class01099 N;

    class00553(class01099 class010992) {
        this.N = class010992;
    }

    public String toString() {
        return String.valueOf(this.N) + " <wrapped>";
    }

    void N(class01099 class010992) {
        this.N = class010992;
    }

    public /* synthetic */ void callSetWrapped(class01099 class010992) {
        this.N(class010992);
    }

    public /* synthetic */ class01099 getWrapped() {
        return this.N;
    }

    public String method_31706() {
        return this.N.method_31706();
    }

    public class07209 method_31705() {
        return this.N.method_31705();
    }

    public boolean method_31704() {
        return this.N.method_31704();
    }

    public void method_31703() {
        this.N.method_31703();
    }
}

