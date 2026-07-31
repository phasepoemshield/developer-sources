package fun.nexisdlc.client.utils.client.tweaks.crosshair;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public interface DrawContextFloatDrawTexture {
    default void nexis$drawGuiTexture(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height) {}
    default void nexis$drawGuiTexture(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height, boolean customRenderCulling) {
        nexis$drawGuiTexture(pipeline, texture, x, y, width, height);
    }
    default void nexis$drawGuiTextureColored(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height, int color, boolean customRenderCulling) {
        nexis$drawGuiTexture(pipeline, texture, x, y, width, height, customRenderCulling);
    }
    default void nexis$drawTextureDirect(RenderPipeline pipeline, Identifier texture, float x, float y, int width, int height, int color, boolean customRenderCulling) {
        nexis$drawGuiTextureColored(pipeline, texture, x, y, width, height, color, customRenderCulling);
    }
    default void nexis$drawItem(ItemStack stack, int x, int y, boolean customRenderCulling) {}
    default void nexis$drawItem(ItemStack stack, int x, int y, boolean customRenderCulling, String ignoredCullingOwnerKey) {
        nexis$drawItem(stack, x, y, customRenderCulling);
    }
}
