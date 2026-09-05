/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00576
 *  minecraft.class00587
 *  minecraft.class00607
 *  minecraft.class00619
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$AttributesContext
 */
package net.fabricmc.fabric.impl.biome.modification;

import minecraft.class00576;
import minecraft.class00587;
import minecraft.class00607;
import minecraft.class00619;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;

class BiomeModificationContextImpl$AttributesContextImpl
implements BiomeModificationContext.AttributesContext {
    final /* synthetic */ BiomeModificationContextImpl this$0;

    BiomeModificationContextImpl$AttributesContextImpl(BiomeModificationContextImpl biomeModificationContextImpl) {
        this.this$0 = biomeModificationContextImpl;
    }

    public void addAll(class00587 class005872) {
        class00576 class005762 = class00587.N().N(this.this$0.biome.R());
        class005762.N(class005872);
        this.this$0.biome.z = class005762.N();
    }

    public <T> void set(class00607<T> class006072, T t) {
        class00576 class005762 = class00587.N().N(this.this$0.biome.R());
        class005762.N(class006072, t);
        this.this$0.biome.z = class005762.N();
    }

    public <T, M> void setModifier(class00607<T> class006072, class00619<T, M> class006192, M m) {
        class00576 class005762 = class00587.N().N(this.this$0.biome.R());
        class005762.N(class006072, class006192, m);
        this.this$0.biome.z = class005762.N();
    }
}

