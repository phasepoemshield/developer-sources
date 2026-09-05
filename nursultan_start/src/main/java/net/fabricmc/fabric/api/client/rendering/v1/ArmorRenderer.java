/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01188
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class06271
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07310
 *  minecraft.class07311
 *  minecraft.class07438
 *  minecraft.class07926
 *  minecraft.class08141
 *  minecraft.class08388
 *  minecraft.class08467
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import com.mojang.datafixers.util.Pair;
import minecraft.class01188;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class06271;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07310;
import minecraft.class07311;
import minecraft.class07438;
import minecraft.class07926;
import minecraft.class08141;
import minecraft.class08388;
import minecraft.class08467;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer$Factory;
import net.fabricmc.fabric.api.client.rendering.v1.TransformCopyingModel;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ArmorRenderer {
    public static void register(ArmorRenderer$Factory armorRenderer$Factory, class07310 ... class07310Array) {
        ArmorRendererRegistryImpl.register((ArmorRenderer$Factory)armorRenderer$Factory, (class07310[])class07310Array);
    }

    public static void register(ArmorRenderer armorRenderer, class07310 ... class07310Array) {
        ArmorRendererRegistryImpl.register((ArmorRenderer)armorRenderer, (class07310[])class07310Array);
    }

    default public boolean shouldRenderDefaultHeadItem(class07438 class074382, class06584 class065842) {
        return true;
    }

    public void render(class01421 var1, class01237 var2, class06584 var3, class08467 var4, class07085 var5, int var6, class01188<class08467> var7);

    public static <S, D> void submitTransformCopyingModel(class06271<? super S> class062712, S s, class06271<? super D> class062713, D d, boolean bl, class07926 class079262, class01421 class014212, class07311 class073112, int n, int n2, int n3, @Nullable class08388 class083882, int n4, @Nullable class08141 class081412) {
        class079262.N(TransformCopyingModel.create(class062712, class062713, bl), (Object)Pair.of(s, d), class014212, class073112, n, n2, n3, class083882, n4, class081412);
    }

    public static <S, D> void submitTransformCopyingModel(class06271<? super S> class062712, S s, class06271<? super D> class062713, D d, boolean bl, class07926 class079262, class01421 class014212, class07311 class073112, int n, int n2, int n3, @Nullable class08141 class081412) {
        class079262.N(TransformCopyingModel.create(class062712, class062713, bl), (Object)Pair.of(s, d), class014212, class073112, n, n2, n3, class081412);
    }
}

