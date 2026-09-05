/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06510
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import java.util.Set;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06510;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientSync;
import org.jspecify.annotations.Nullable;

public class CustomIngredientPacketCodec
implements class02362<class04247, class06510> {
    static final int PACKET_MARKER = -1;
    private final class02362<class04247, class06510> fallback;

    public CustomIngredientPacketCodec(class02362<class04247, class06510> class023622) {
        this.fallback = class023622;
    }

    public class06510 decode(class04247 class042472) {
        int n = class042472.readerIndex();
        if (class042472.E() != -1) {
            class042472.readerIndex(n);
            return (class06510)this.fallback.decode((Object)class042472);
        }
        class01894 class018942 = class042472.T();
        CustomIngredientSerializer customIngredientSerializer = CustomIngredientSerializer.get((class01894)class018942);
        if (customIngredientSerializer == null) {
            throw new IllegalArgumentException("Cannot deserialize custom ingredient of unknown type " + String.valueOf(class018942));
        }
        return ((CustomIngredient)customIngredientSerializer.getPacketCodec().decode((Object)class042472)).toVanilla();
    }

    public void encode(class04247 class042472, class06510 class065102) {
        CustomIngredient customIngredient = class065102.getCustomIngredient();
        if (CustomIngredientPacketCodec.shouldEncodeFallback(customIngredient)) {
            this.fallback.encode((Object)class042472, (Object)class065102);
            return;
        }
        class042472.L(-1);
        class042472.N(customIngredient.getSerializer().getIdentifier());
        class02362 class023622 = customIngredient.getSerializer().getPacketCodec();
        class023622.encode((Object)class042472, (Object)customIngredient);
    }

    static boolean shouldEncodeFallback(@Nullable CustomIngredient customIngredient) {
        if (customIngredient == null) {
            return true;
        }
        Set<class01894> set = CustomIngredientSync.CURRENT_SUPPORTED_INGREDIENTS.get();
        return set != null && !set.contains(customIngredient.getSerializer().getIdentifier());
    }
}

