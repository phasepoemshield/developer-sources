/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05441
 *  minecraft.class05457
 *  minecraft.class08122
 */
package net.fabricmc.fabric.api.loot.v2;

import java.util.Collection;
import java.util.function.Consumer;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05441;
import minecraft.class05457;
import minecraft.class08122;

@Deprecated
public interface FabricLootTableBuilder {
    @Deprecated
    public static class05062 copyOf(class05074 class050742) {
        return net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder.copyOf(class050742);
    }

    @Deprecated
    default public class05062 apply(Collection<? extends class08122> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05062 apply(class08122 class081222) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05062 pool(class05441 class054412) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05062 pools(Collection<? extends class05441> collection) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Deprecated
    default public class05062 modifyPools(Consumer<? super class05457> consumer) {
        throw new UnsupportedOperationException("Implemented via mixin");
    }
}

