/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 */
package net.fabricmc.fabric.impl.recipe.sync;

import java.util.List;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncPayloadS2C$Entry;

public record RecipeSyncPayloadS2C(List<RecipeSyncPayloadS2C$Entry> entries) implements class01659
{
    public static final class02362<class04247, RecipeSyncPayloadS2C> CODEC = RecipeSyncPayloadS2C$Entry.CODEC.N_33(class02389.N()).N_10(RecipeSyncPayloadS2C::new, RecipeSyncPayloadS2C::entries);
    public static final class01666<RecipeSyncPayloadS2C> ID = new class01666(class01894.N((String)"fabric", (String)"recipe_sync"));

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

