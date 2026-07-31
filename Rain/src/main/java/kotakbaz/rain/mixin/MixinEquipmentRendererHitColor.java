/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import kotakbaz.rain.client.render.hitcolor.A;
import kotakbaz.rain.module.modules.render.HitColorModule;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={EquipmentRenderer.class})
public class MixinEquipmentRendererHitColor
implements A {
    @Unique
    private int rain$overlayCoords = OverlayTexture.DEFAULT_UV;

    @WrapOperation(method={"method_64078"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1921;method_25448(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1921;")})
    private RenderLayer rain$replaceArmorLayer(Identifier texture, Operation<RenderLayer> original) {
        return this.rain$shouldColorArmor() ? RenderLayer.getEntityCutoutNoCull((Identifier)texture) : (RenderLayer)original.call(new Object[]{texture});
    }

    @WrapOperation(method={"method_64078"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4722;method_48480(Z)Lnet/minecraft/class_1921;")})
    private RenderLayer rain$replaceTrimLayer(boolean decal, Operation<RenderLayer> original) {
        if (!this.rain$shouldColorArmor()) {
            return (RenderLayer)original.call(new Object[]{decal});
        }
        return decal ? RenderLayer.getEntityCutoutNoCullZOffset((Identifier)TexturedRenderLayers.ARMOR_TRIMS_ATLAS_TEXTURE) : RenderLayer.getEntityCutoutNoCull((Identifier)TexturedRenderLayers.ARMOR_TRIMS_ATLAS_TEXTURE);
    }

    @ModifyArg(method={"method_64078"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_3879;method_62100(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;III)V"), index=3)
    private int rain$replaceArmorOverlay(int overlay) {
        return this.rain$resolveOverlay(overlay);
    }

    @ModifyArg(method={"method_64078"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_3879;method_60879(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;II)V"), index=3)
    private int rain$replaceTrimOverlay(int overlay) {
        return this.rain$resolveOverlay(overlay);
    }

    @Unique
    private boolean rain$shouldColorArmor() {
        return HitColorModule.INSTANCE.isEnabled() && HitColorModule.INSTANCE.shouldColorArmor();
    }

    @Unique
    private int rain$resolveOverlay(int original) {
        return this.rain$shouldColorArmor() ? this.rain$overlayCoords : original;
    }

    @Override
    public void rain$setOverlayCoords(int overlayCoords) {
        this.rain$overlayCoords = overlayCoords;
    }
}

