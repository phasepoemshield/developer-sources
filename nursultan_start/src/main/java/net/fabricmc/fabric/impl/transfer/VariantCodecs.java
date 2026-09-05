/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02509
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant
 */
package net.fabricmc.fabric.impl.transfer;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02509;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06584;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantImpl;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl;

public class VariantCodecs {
    private static final Codec<ItemVariant> UNVALIDATED_ITEM_CODEC = RecordCodecBuilder.create(instance -> instance.group((App)class04206.B.b().fieldOf("item").forGetter(ItemVariant::getRegistryEntry), (App)class02678.y.optionalFieldOf("components", (Object)class02678.N).forGetter(TransferVariant::getComponents)).apply((Applicative)instance, ItemVariantImpl::of));
    public static final Codec<ItemVariant> ITEM_CODEC = UNVALIDATED_ITEM_CODEC.validate(VariantCodecs::validateComponents);
    public static final class02362<class04247, ItemVariant> ITEM_PACKET_CODEC = class02362.N((class02362)class02389.y((class05946)class04227.F), ItemVariant::getRegistryEntry, (class02362)class02678.L, TransferVariant::getComponents, ItemVariantImpl::of);
    public static final Codec<FluidVariant> FLUID_CODEC = RecordCodecBuilder.create(instance -> instance.group((App)class04206.L.b().fieldOf("fluid").forGetter(FluidVariant::getRegistryEntry), (App)class02678.y.optionalFieldOf("components", (Object)class02678.N).forGetter(TransferVariant::getComponents)).apply((Applicative)instance, FluidVariantImpl::of));
    public static final class02362<class04247, FluidVariant> FLUID_PACKET_CODEC = class02362.N((class02362)class02389.y((class05946)class04227.e), FluidVariant::getRegistryEntry, (class02362)class02678.L, TransferVariant::getComponents, FluidVariantImpl::of);

    private static DataResult<ItemVariant> validateComponents(ItemVariant itemVariant) {
        return class06584.N((class02695)class02509.N((class02695)itemVariant.getItem().R(), (class02678)itemVariant.getComponents())).map(class062442 -> itemVariant);
    }
}

