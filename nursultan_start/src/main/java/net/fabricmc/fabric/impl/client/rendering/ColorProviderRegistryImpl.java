/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01587
 *  minecraft.class04750
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class00891;
import minecraft.class01587;
import minecraft.class04750;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl$1;
import net.fabricmc.fabric.impl.client.rendering.ColorProviderRegistryImpl$ColorMapperHolder;

@Environment(value=EnvType.CLIENT)
public abstract class ColorProviderRegistryImpl<T, Provider, Underlying>
implements ColorProviderRegistry<T, Provider> {
    public static final ColorProviderRegistryImpl<class00891, class04750, class01587> BLOCK = new ColorProviderRegistryImpl$1();
    private Underlying colorMap;
    private Map<T, Provider> tempMappers = new IdentityHashMap<T, Provider>();

    public Provider get(T t) {
        return this.colorMap == null ? null : (Provider)((ColorProviderRegistryImpl$ColorMapperHolder)this.colorMap).get(t);
    }

    public void initialize(Underlying Underlying) {
        if (this.colorMap != null) {
            if (this.colorMap != Underlying) {
                throw new IllegalStateException("Cannot set colorMap twice");
            }
            return;
        }
        this.colorMap = Underlying;
        for (Map.Entry<T, Provider> entry : this.tempMappers.entrySet()) {
            this.registerUnderlying(Underlying, entry.getValue(), entry.getKey());
        }
        this.tempMappers = null;
    }

    @SafeVarargs
    public final void register(Provider Provider, T ... TArray) {
        if (this.colorMap != null) {
            for (T t : TArray) {
                this.registerUnderlying(this.colorMap, Provider, t);
            }
        } else {
            for (T t : TArray) {
                this.tempMappers.put(t, Provider);
            }
        }
    }

    abstract void registerUnderlying(Underlying var1, Provider var2, T var3);
}

