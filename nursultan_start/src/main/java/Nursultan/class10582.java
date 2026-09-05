/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class06506
 *  minecraft.class06510
 *  minecraft.class06511
 *  minecraft.class06525
 *  minecraft.class06581
 *  minecraft.class06586
 *  minecraft.class07310
 *  net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder
 *  net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder$BuildCallback
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package Nursultan;

import Nursultan.class10583;
import java.util.ArrayList;
import java.util.List;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class06506;
import minecraft.class06510;
import minecraft.class06511;
import minecraft.class06525;
import minecraft.class06581;
import minecraft.class06586;
import minecraft.class07310;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class10582
implements FabricBrewingRecipeRegistryBuilder {
    private final List<class06510> N = new ArrayList<class06510>();
    private final List<class10583<class06525>> y = new ArrayList<class10583<class06525>>();
    private final List<class10583<class06581>> L = new ArrayList<class10583<class06581>>();
    private final class03767 u;

    public class10582(class03767 class037672) {
        this.u = class037672;
    }

    private static void y(class06581 class065812) {
        if (!(class065812 instanceof class06586)) {
            throw new IllegalArgumentException("Expected a potion, got: " + String.valueOf(class04206.B.y((Object)class065812)));
        }
    }

    public class06511 N() {
        this.N((CallbackInfoReturnable)null);
        return new class06511(List.copyOf(this.N), List.copyOf(this.y), List.copyOf(this.L));
    }

    public void N(class06581 class065812, class03556<class06525> class035562) {
        if (((class06525)class035562.N()).N(this.u)) {
            this.N((class03556<class06525>)class06506.N, class065812, (class03556<class06525>)class06506.y);
            this.N((class03556<class06525>)class06506.u, class065812, class035562);
        }
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        ((FabricBrewingRecipeRegistryBuilder.BuildCallback)FabricBrewingRecipeRegistryBuilder.BUILD.invoker()).build(this);
    }

    public void N(class06581 class065812, class06581 class065813, class06581 class065814) {
        if (!(class065812.N(this.u) && class065813.N(this.u) && class065814.N(this.u))) {
            return;
        }
        class10582.y(class065812);
        class10582.y(class065814);
        this.L.add(new class10583(class065812.i(), class06510.method_8101((class07310)class065813), class065814.i()));
    }

    public void N(class06581 class065812) {
        if (!class065812.N(this.u)) {
            return;
        }
        class10582.y(class065812);
        this.N.add(class06510.method_8101((class07310)class065812));
    }

    public void N(class03556<class06525> class035562, class06581 class065812, class03556<class06525> class035563) {
        if (((class06525)class035562.N()).N(this.u) && class065812.N(this.u) && ((class06525)class035563.N()).N(this.u)) {
            this.y.add(new class10583<class06525>(class035562, class06510.method_8101((class07310)class065812), class035563));
        }
    }

    public void registerPotionRecipe(class03556 class035562, class06510 class065102, class03556 class035563) {
        if (((class06525)class035562.N()).N(this.u) && ((class06525)class035563.N()).N(this.u)) {
            this.y.add(new class10583(class035562, class065102, class035563));
        }
    }

    public void registerItemRecipe(class06581 class065812, class06510 class065102, class06581 class065813) {
        if (class065812.N(this.u) && class065813.N(this.u)) {
            class10582.y(class065812);
            class10582.y(class065813);
            this.L.add(new class10583(class065812.i(), class065102, class065813.i()));
        }
    }

    public void registerRecipes(class06510 class065102, class03556 class035562) {
        if (((class06525)class035562.N()).N(this.u)) {
            this.registerPotionRecipe(class06506.N, class065102, class06506.y);
            this.registerPotionRecipe(class06506.u, class065102, class035562);
        }
    }

    public class03767 getEnabledFeatures() {
        return this.u;
    }
}

