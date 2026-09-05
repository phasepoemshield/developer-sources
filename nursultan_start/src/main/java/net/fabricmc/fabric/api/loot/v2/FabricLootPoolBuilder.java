/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04129
 *  minecraft.class05441
 *  minecraft.class05457
 *  minecraft.class05957
 *  minecraft.class08122
 */
package net.fabricmc.fabric.api.loot.v2;

import java.util.Collection;
import minecraft.class04129;
import minecraft.class05441;
import minecraft.class05457;
import minecraft.class05957;
import minecraft.class08122;

@Deprecated
public interface FabricLootPoolBuilder {
    @Deprecated
    public static class05457 copyOf(class05441 class054412) {
        return net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder.copyOf(class054412);
    }

    @Deprecated
    default public class05457 apply(class08122 class081222) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05457 apply(Collection<? extends class08122> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05457 with(class04129 class041292) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05457 with(Collection<? extends class04129> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05457 conditionally(class05957 class059572) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05457 conditionally(Collection<? extends class05957> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

