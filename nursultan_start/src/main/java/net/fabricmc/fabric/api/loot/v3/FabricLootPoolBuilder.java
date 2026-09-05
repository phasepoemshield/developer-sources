/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04129
 *  minecraft.class05441
 *  minecraft.class05457
 *  minecraft.class05957
 *  minecraft.class08122
 *  net.fabricmc.fabric.mixin.loot.LootPoolAccessor
 */
package net.fabricmc.fabric.api.loot.v3;

import java.util.Collection;
import minecraft.class04129;
import minecraft.class05441;
import minecraft.class05457;
import minecraft.class05957;
import minecraft.class08122;
import net.fabricmc.fabric.mixin.loot.LootPoolAccessor;

public interface FabricLootPoolBuilder {
    public static class05457 copyOf(class05441 class054412) {
        LootPoolAccessor lootPoolAccessor = (LootPoolAccessor)class054412;
        return class05441.N().N(lootPoolAccessor.fabric_getRolls()).y(lootPoolAccessor.fabric_getBonusRolls()).with((Collection)lootPoolAccessor.fabric_getEntries()).conditionally((Collection)lootPoolAccessor.fabric_getConditions()).apply((Collection)lootPoolAccessor.fabric_getFunctions());
    }

    default public class05457 apply(class08122 class081222) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public class05457 apply(Collection<? extends class08122> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public class05457 with(class04129 class041292) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public class05457 with(Collection<? extends class04129> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public class05457 conditionally(class05957 class059572) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    default public class05457 conditionally(Collection<? extends class05957> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

