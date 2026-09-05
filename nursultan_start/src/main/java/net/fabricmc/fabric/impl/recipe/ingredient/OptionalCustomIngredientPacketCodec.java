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
 */
package net.fabricmc.fabric.impl.recipe.ingredient;

import java.util.Optional;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06510;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPacketCodec;

public class OptionalCustomIngredientPacketCodec
implements class02362<class04247, Optional<class06510>> {
    private final class02362<class04247, Optional<class06510>> fallback;

    public OptionalCustomIngredientPacketCodec(class02362<class04247, Optional<class06510>> class023622) {
        this.fallback = class023622;
    }

    public Optional<class06510> decode(class04247 class042472) {
        int n = class042472.readerIndex();
        if (class042472.E() != -1) {
            class042472.readerIndex(n);
            return (Optional)this.fallback.decode((Object)class042472);
        }
        class01894 class018942 = class042472.T();
        CustomIngredientSerializer customIngredientSerializer = CustomIngredientSerializer.get((class01894)class018942);
        if (customIngredientSerializer == null) {
            throw new IllegalArgumentException("Cannot deserialize custom ingredient of unknown type " + String.valueOf(class018942));
        }
        return Optional.of(((CustomIngredient)customIngredientSerializer.getPacketCodec().decode((Object)class042472)).toVanilla());
    }

    public void encode(class04247 class042472, Optional<class06510> optional) {
        if (optional.isEmpty()) {
            this.fallback.encode((Object)class042472, optional);
            return;
        }
        CustomIngredient customIngredient = optional.get().getCustomIngredient();
        if (CustomIngredientPacketCodec.shouldEncodeFallback(customIngredient)) {
            this.fallback.encode((Object)class042472, optional);
            return;
        }
        class042472.L(-1);
        class042472.N(customIngredient.getSerializer().getIdentifier());
        class02362 class023622 = customIngredient.getSerializer().getPacketCodec();
        class023622.encode((Object)class042472, (Object)customIngredient);
    }
}

