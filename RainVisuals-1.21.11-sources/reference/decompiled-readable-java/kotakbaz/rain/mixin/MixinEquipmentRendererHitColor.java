/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.RenderLayers
 *  net.minecraft.client.render.TexturedRenderLayers
 *  net.minecraft.client.render.entity.equipment.EquipmentRenderer
 *  net.minecraft.util.Identifier
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import oxxxde.\u0628\u0627;
import oxxxde.\u0631\u0625;
import oxxxde.\u0635\u064b;

@Mixin(value={EquipmentRenderer.class})
public class MixinEquipmentRendererHitColor
implements \u0635\u064b {
    @Unique
    private int rain$overlayCoords = OverlayTexture.DEFAULT_UV;

    @WrapOperation(method={"method_64078"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_12249;method_75966(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1921;")})
    private RenderLayer rain$replaceArmorLayer(Identifier texture, Operation<RenderLayer> original) {
        return this.rain$shouldColorArmor() ? RenderLayers.entityCutoutNoCull((Identifier)texture) : (RenderLayer)original.call(new Object[]{texture});
    }

    @Unique
    private boolean rain$shouldColorArmor() {
        return \u0631\u0625.INSTANCE.isEnabled() && \u0631\u0625.INSTANCE.shouldColorArmor();
    }

    @WrapOperation(method={"method_64078"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4722;method_48480(Z)Lnet/minecraft/class_1921;")})
    private RenderLayer rain$replaceTrimLayer(boolean decal, Operation<RenderLayer> original) {
        if (!this.rain$shouldColorArmor()) {
            return (RenderLayer)original.call(new Object[]{decal});
        }
        return decal ? RenderLayers.entityCutoutNoCullZOffset((Identifier)TexturedRenderLayers.ARMOR_TRIMS_ATLAS_TEXTURE) : RenderLayers.entityCutoutNoCull((Identifier)TexturedRenderLayers.ARMOR_TRIMS_ATLAS_TEXTURE);
    }

    @Unique
    private int rain$resolveOverlay(int original) {
        return this.rain$shouldColorArmor() ? \u0628\u0627.resolveArmorOverlay(original) : original;
    }

    @Override
    public void rain$setOverlayCoords(int overlayCoords) {
        this.rain$overlayCoords = overlayCoords;
    }

    @ModifyArg(method={"method_64078"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11785;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"), index=5)
    private int rain$replaceArmorOverlay(int overlay) {
        return this.rain$resolveOverlay(overlay);
    }
}

