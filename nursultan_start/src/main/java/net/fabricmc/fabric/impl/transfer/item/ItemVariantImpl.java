/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class03556
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.item;

import java.util.Objects;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class03556;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantCache;
import org.jspecify.annotations.Nullable;

public class ItemVariantImpl
implements ItemVariant {
    private final class06581 item;
    private final class02678 components;
    private final int hashCode;
    private volatile @Nullable class06584 cachedStack = null;

    public ItemVariant withComponentChanges(class02678 class026782) {
        return ItemVariantImpl.of(this.item, TransferApiImpl.mergeChanges(this.getComponents(), class026782));
    }

    public ItemVariantImpl(class06581 class065812, class02678 class026782) {
        this.item = class065812;
        this.components = class026782;
        this.hashCode = Objects.hash(class065812, class026782);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ItemVariantImpl itemVariantImpl = (ItemVariantImpl)object;
        return this.hashCode == itemVariantImpl.hashCode && this.item == itemVariantImpl.item && this.componentsMatch(itemVariantImpl.components);
    }

    public String toString() {
        return "ItemVariant{item=" + String.valueOf(this.item) + ", components=" + String.valueOf(this.components) + "}";
    }

    public int hashCode() {
        return this.hashCode;
    }

    public boolean isBlank() {
        return this.item == class06570.N;
    }

    public static ItemVariant of(class06581 class065812, class02678 class026782) {
        Objects.requireNonNull(class065812, "Item may not be null.");
        Objects.requireNonNull(class026782, "Components may not be null.");
        if (class026782.u() || class065812 == class06570.N) {
            return ((ItemVariantCache)class065812).fabric_getCachedItemVariant();
        }
        return new ItemVariantImpl(class065812, class026782);
    }

    public static ItemVariant of(class03556<class06581> class035562, class02678 class026782) {
        return ItemVariantImpl.of((class06581)class035562.N(), class026782);
    }

    public class06581 getObject() {
        return this.item;
    }

    public class06584 getCachedStack() {
        class06584 class065842 = this.cachedStack;
        if (class065842 == null) {
            this.cachedStack = class065842 = this.toStack();
        }
        return class065842;
    }

    public class02695 getComponentMap() {
        return this.getCachedStack().y();
    }

    public @Nullable class02678 getComponents() {
        return this.components;
    }
}

