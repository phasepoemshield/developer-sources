/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  net.fabricmc.fabric.impl.transfer.VariantCodecs
 *  net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl
 */
package net.fabricmc.fabric.api.transfer.v1.item;

import com.mojang.serialization.Codec;
import java.util.Objects;
import minecraft.class02362;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.impl.transfer.VariantCodecs;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl;

public interface ItemVariant
extends TransferVariant<class06581> {
    public static final Codec<ItemVariant> CODEC = VariantCodecs.ITEM_CODEC;
    public static final class02362<class04247, ItemVariant> PACKET_CODEC = VariantCodecs.ITEM_PACKET_CODEC;

    public ItemVariant withComponentChanges(class02678 var1);

    default public boolean matches(class06584 class065842) {
        return this.isOf(class065842.B()) && Objects.equals(class065842.u(), this.getComponents());
    }

    public static ItemVariant of(class06584 class065842) {
        return ItemVariant.of((class07310)class065842.B(), class065842.u());
    }

    public static ItemVariant of(class07310 class073102, class02678 class026782) {
        return ItemVariantImpl.of((class06581)class073102.B(), (class02678)class026782);
    }

    public static ItemVariant of(class07310 class073102) {
        return ItemVariant.of(class073102, class02678.N);
    }

    default public class06581 getItem() {
        return (class06581)this.getObject();
    }

    default public class03556<class06581> getRegistryEntry() {
        return this.getItem().i();
    }

    default public class06584 toStack(int n) {
        if (this.isBlank()) {
            return class06584.E;
        }
        return new class06584(this.getRegistryEntry(), n, this.getComponents());
    }

    default public class06584 toStack() {
        return this.toStack(1);
    }

    public static ItemVariant blank() {
        return ItemVariant.of((class07310)class06570.N);
    }
}

