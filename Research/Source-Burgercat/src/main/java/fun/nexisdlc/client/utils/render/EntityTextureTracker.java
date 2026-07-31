package fun.nexisdlc.client.utils.render;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.AssetInfo;
import net.minecraft.util.Identifier;

public final class EntityTextureTracker {
    public static NativeImage getEntityTexture(LivingEntity entity) {
        return null;
    }

    public static Identifier get(LivingEntity entity) {
        if (entity instanceof AbstractClientPlayerEntity player) {
            AssetInfo.TextureAsset skinAsset = player.getSkin().body();
            return skinAsset != null ? skinAsset.texturePath() : null;
        }
        return null;
    }
}
