/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class07209
 *  minecraft.class07290
 *  net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class07209;
import minecraft.class07290;
import net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate;

public interface ExtendedBlockEntityType<T extends class00394> {
    public BlockEntityRenderPredicate<T>[] sodium$getRenderPredicates();

    public static <T extends class00394> boolean removeRenderPredicate(class00404<T> class004042, BlockEntityRenderPredicate<T> blockEntityRenderPredicate) {
        return ((ExtendedBlockEntityType)class004042).sodium$removeRenderPredicate(blockEntityRenderPredicate);
    }

    public void sodium$addRenderPredicate(BlockEntityRenderPredicate<T> var1);

    public static <T extends class00394> boolean shouldRender(class00404<? extends T> class004042, class07290 class072902, class07209 class072092, T t) {
        BlockEntityRenderPredicate<T>[] blockEntityRenderPredicateArray = ((ExtendedBlockEntityType)class004042).sodium$getRenderPredicates();
        for (int i = 0; i < blockEntityRenderPredicateArray.length; ++i) {
            if (blockEntityRenderPredicateArray[i].shouldRender(class072902, class072092, t)) continue;
            return false;
        }
        return true;
    }

    public static <T extends class00394> void addRenderPredicate(class00404<T> class004042, BlockEntityRenderPredicate<T> blockEntityRenderPredicate) {
        ((ExtendedBlockEntityType)class004042).sodium$addRenderPredicate(blockEntityRenderPredicate);
    }

    public boolean sodium$removeRenderPredicate(BlockEntityRenderPredicate<T> var1);
}

