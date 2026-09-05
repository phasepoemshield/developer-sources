/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1087
 *  net.minecraft.class_10889
 *  net.minecraft.class_11659
 *  net.minecraft.class_12249
 *  net.minecraft.class_1920
 *  net.minecraft.class_1921
 *  net.minecraft.class_2350
 *  net.minecraft.class_2464
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_324
 *  net.minecraft.class_4587
 *  net.minecraft.class_4608
 *  net.minecraft.class_4722
 *  net.minecraft.class_5819
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 *  net.minecraft.class_765
 *  net.minecraft.class_776
 *  net.minecraft.class_777
 *  net.minecraft.class_811
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 */
package com.holdmylua.source.mixin.render;

import com.holdmylua.source.access.AlternateBlockRenderer;
import net.minecraft.class_1087;
import net.minecraft.class_10889;
import net.minecraft.class_11659;
import net.minecraft.class_12249;
import net.minecraft.class_1920;
import net.minecraft.class_1921;
import net.minecraft.class_2350;
import net.minecraft.class_2464;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_324;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_4722;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_765;
import net.minecraft.class_776;
import net.minecraft.class_777;
import net.minecraft.class_811;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_776.class})
public abstract class BlockRenderManagerMixin
implements AlternateBlockRenderer {
    @Shadow
    @Final
    private class_324 field_20987;

    @Shadow
    public abstract class_1087 method_3349(class_2680 var1);

    @Override
    @Unique
    public void renderSingleBlockWithEmission(class_2680 blockState, class_4587 poseStack, class_11659 queue, int combinedLight, class_638 world, class_742 player) {
        class_2464 renderShape = blockState.method_26217();
        if (renderShape == class_2464.field_11455) {
            return;
        }
        combinedLight = class_765.method_62228((int)combinedLight, (int)blockState.method_26213());
        class_1087 blockStateModel = this.method_3349(blockState);
        int tint = this.field_20987.method_1697(blockState, (class_1920)world, player.method_24515(), 0);
        float r = (float)(tint >> 16 & 0xFF) / 255.0f;
        float g = (float)(tint >> 8 & 0xFF) / 255.0f;
        float b = (float)(tint & 0xFF) / 255.0f;
        for (class_10889 blockModelPart : blockStateModel.method_68512(class_5819.method_43049((long)42L))) {
            for (class_2350 direction : class_2350.values()) {
                for (class_777 bakedQuad : blockModelPart.method_68509(direction)) {
                    this.hmi$renderBakedQuad(bakedQuad, poseStack, queue, r, g, b, combinedLight, blockState);
                }
            }
            for (class_777 bakedQuad : blockModelPart.method_68509(null)) {
                this.hmi$renderBakedQuad(bakedQuad, poseStack, queue, r, g, b, combinedLight, blockState);
            }
        }
        class_310.method_1551().method_1554().method_65756().method_65535(blockState.method_26204(), class_811.field_4315, poseStack, queue, combinedLight, class_4608.field_21444, 0);
    }

    @Unique
    private void hmi$renderBakedQuad(class_777 bakedQuad, class_4587 poseStack, class_11659 queue, float r, float g, float b, int combinedLight, class_2680 blockState) {
        if (bakedQuad.method_3360()) {
            r = Math.clamp((float)r, (float)0.0f, (float)1.0f);
            g = Math.clamp((float)g, (float)0.0f, (float)1.0f);
            b = Math.clamp((float)b, (float)0.0f, (float)1.0f);
        } else {
            r = 1.0f;
            g = 1.0f;
            b = 1.0f;
        }
        class_1921 usedLayer = bakedQuad.comp_3725() && blockState.method_26213() == 0 ? class_4722.method_76545() : class_12249.method_75972();
        float finalR = r;
        float finalG = g;
        float finalB = b;
        queue.method_73483(poseStack, usedLayer, (matricesEntry, consumer) -> consumer.method_22920(matricesEntry, bakedQuad, new float[]{1.0f, 1.0f, 1.0f, 1.0f}, finalR, finalG, finalB, 1.0f, new int[]{combinedLight, combinedLight, combinedLight, combinedLight}, class_4608.field_21444));
    }
}

