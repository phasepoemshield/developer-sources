/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10444$class_10445
 *  net.minecraft.class_11687
 *  net.minecraft.class_12249
 *  net.minecraft.class_1799
 *  net.minecraft.class_1921
 *  net.minecraft.class_310
 *  net.minecraft.class_4583
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4720
 *  net.minecraft.class_4722
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_777
 *  net.minecraft.class_7837
 *  net.minecraft.class_811
 *  net.minecraft.class_918
 *  net.minecraft.class_9848
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.holdmylua.source.mixin.render;

import com.holdmylua.source.global.DispatcherStorage;
import com.holdmylua.source.global.GlobalsStorage;
import com.holdmylua.source.global.item_model.ItemModelContext;
import com.holdmylua.source.global.item_model.ItemModelStorage;
import com.holdmylua.source.lua_runtime.ModelScriptCache;
import com.holdmylua.source.lua_runtime.ScriptHolder;
import java.util.List;
import net.minecraft.class_10444;
import net.minecraft.class_11687;
import net.minecraft.class_12249;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_4583;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4720;
import net.minecraft.class_4722;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_777;
import net.minecraft.class_7837;
import net.minecraft.class_811;
import net.minecraft.class_918;
import net.minecraft.class_9848;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_11687.class})
public abstract class ItemRendererMixin {
    @Unique
    private static int getTint(int[] tints, int index) {
        return index >= 0 && index < tints.length ? tints[index] : -1;
    }

    @Unique
    private static boolean useTranslucentGlint(class_1921 renderLayer) {
        return class_310.method_29611() && renderLayer == class_4722.method_29382();
    }

    @Redirect(method={"method_73010"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_918;method_62476(Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;II[ILjava/util/List;Lnet/minecraft/class_1921;Lnet/minecraft/class_10444$class_10445;)V"))
    private static void render(class_811 displayContext, class_4587 matrices, class_4597 vertexConsumers, int light, int overlay, int[] tints, List<class_777> quads, class_1921 layer, class_10444.class_10445 glint) {
        class_4588 vertexConsumer;
        if (glint == class_10444.class_10445.field_55343) {
            class_4587.class_4665 entry = matrices.method_23760().method_56822();
            if (displayContext == class_811.field_4317) {
                class_7837.method_46414((Matrix4f)entry.method_23761(), (float)0.5f);
            } else if (displayContext.method_29998()) {
                class_7837.method_46414((Matrix4f)entry.method_23761(), (float)0.75f);
            }
            vertexConsumer = ItemRendererMixin.getSpecialItemGlintConsumer(vertexConsumers, layer, entry);
        } else {
            vertexConsumer = class_918.method_23181((class_4597)vertexConsumers, (class_1921)layer, (boolean)true, (glint != class_10444.class_10445.field_55341 ? 1 : 0) != 0);
        }
        ItemRendererMixin.customRenderBakedQuads(matrices, vertexConsumer, quads, tints, light, overlay, displayContext);
    }

    @Unique
    private static void customRenderBakedQuads(class_4587 matrices, class_4588 vertexConsumer, List<class_777> quads, int[] tints, int light, int overlay, class_811 displayContext) {
        class_746 player = class_310.method_1551().field_1724;
        int index = 0;
        if ((displayContext == class_811.field_4323 || displayContext == class_811.field_4320) && class_310.method_1551().method_1561().field_4692.method_31044().method_31034() && player == class_310.method_1551().field_1724) {
            ItemModelContext context = ItemModelStorage.get();
            class_1799 renderedItem = DispatcherStorage.getRenderedItem();
            ScriptHolder.itemModelCache.executeModel(context, renderedItem, (class_742)player, GlobalsStorage.modelPartAnimator);
            for (ModelScriptCache cache : ScriptHolder.itemModelAddonsCache) {
                cache.executeModel(context, renderedItem, (class_742)player, GlobalsStorage.modelPartAnimator);
            }
        }
        for (class_777 bakedQuad : quads) {
            float j;
            float h;
            float g;
            float f;
            if (bakedQuad.method_3360()) {
                int i = ItemRendererMixin.getTint(tints, bakedQuad.comp_3722());
                f = (float)class_9848.method_61320((int)i) / 255.0f;
                g = (float)class_9848.method_61327((int)i) / 255.0f;
                h = (float)class_9848.method_61329((int)i) / 255.0f;
                j = (float)class_9848.method_61331((int)i) / 255.0f;
            } else {
                f = 1.0f;
                g = 1.0f;
                h = 1.0f;
                j = 1.0f;
            }
            matrices.method_22903();
            GlobalsStorage.modelPartAnimator.applyPoses(index, matrices);
            class_4587.class_4665 entry = matrices.method_23760();
            vertexConsumer.method_22919(entry, bakedQuad, g, h, j, f, light, overlay);
            matrices.method_22909();
            ++index;
        }
        GlobalsStorage.modelPartAnimator.clear();
    }

    @Unique
    private static class_4588 getSpecialItemGlintConsumer(class_4597 consumers, class_1921 layer, class_4587.class_4665 matrix) {
        return class_4720.method_24037((class_4588)new class_4583(consumers.method_73477(ItemRendererMixin.useTranslucentGlint(layer) ? class_12249.method_75993() : class_12249.method_75995()), matrix, 0.0078125f), (class_4588)consumers.method_73477(layer));
    }
}

