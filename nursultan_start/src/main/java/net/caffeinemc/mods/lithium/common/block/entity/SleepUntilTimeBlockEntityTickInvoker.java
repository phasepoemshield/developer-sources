/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class01099
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.block.entity;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class01099;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;

public record SleepUntilTimeBlockEntityTickInvoker(class00394 sleepingBlockEntity, long sleepUntilTickExclusive, class01099 delegate) implements class01099
{
    public String method_31706() {
        return class00404.method_11033((class00404)this.sleepingBlockEntity.O()).toString();
    }

    public class07209 method_31705() {
        return this.sleepingBlockEntity.d();
    }

    public boolean method_31704() {
        return this.sleepingBlockEntity.k();
    }

    public void method_31703() {
        long l = this.sleepingBlockEntity.G().N();
        if (l >= this.sleepUntilTickExclusive) {
            ((SleepingBlockEntity)this.sleepingBlockEntity).setTicker(this.delegate);
            this.delegate.method_31703();
        }
    }
}

