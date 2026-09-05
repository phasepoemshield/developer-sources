/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02678
 *  minecraft.class02695
 */
package net.fabricmc.fabric.api.transfer.v1.storage;

import java.util.Objects;
import minecraft.class02678;
import minecraft.class02695;

public interface TransferVariant<O> {
    default public TransferVariant<O> withComponentChanges(class02678 class026782) {
        throw new UnsupportedOperationException("withComponentChanges is not supported by this TransferVariant");
    }

    public boolean isBlank();

    public O getObject();

    default public boolean hasComponents() {
        return !this.getComponents().u();
    }

    public class02695 getComponentMap();

    public class02678 getComponents();

    default public boolean componentsMatch(class02678 class026782) {
        return Objects.equals(this.getComponents(), class026782);
    }

    default public boolean isOf(O o) {
        return this.getObject() == o;
    }
}

