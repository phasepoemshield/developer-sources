/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00263
 *  minecraft.class05946
 *  minecraft.class06156
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.recipe.v1.FabricRecipeManager
 *  net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes
 *  net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl
 *  net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter
 */
package minecraft;

import java.util.Map;
import minecraft.class00263;
import minecraft.class00272;
import minecraft.class00279;
import minecraft.class05946;
import minecraft.class06156;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.recipe.v1.FabricRecipeManager;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl;
import net.fabricmc.fabric.impl.recipe.sync.client.SynchronizedClientRecipesSetter;

@Environment(value=EnvType.CLIENT)
public class class00290
implements class00272,
FabricRecipeManager,
SynchronizedClientRecipesSetter {
    private final Map<class05946<class00263>, class00263> N;
    private final class00279<class06156> y;
    private SynchronizedRecipes L = SynchronizedRecipesImpl.EMPTY;

    public class00290(Map<class05946<class00263>, class00263> map, class00279<class06156> class002792) {
        this.N = map;
        this.y = class002792;
    }

    @Override
    public class00279<class06156> N() {
        return this.y;
    }

    @Override
    public class00263 N(class05946<class00263> class059462) {
        return this.N.getOrDefault(class059462, class00263.z);
    }

    public SynchronizedRecipes getSynchronizedRecipes() {
        return this.L;
    }

    public void fabric_setSynchronizedClientRecipes(SynchronizedRecipes synchronizedRecipes) {
        this.L = synchronizedRecipes;
    }
}

