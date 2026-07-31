package sky.core.util.render;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

public final class TextureUtil {
    private static final Map<Identifier, int[]> sizeCache = new HashMap<>();

    private TextureUtil() {
    }

    public static int[] getSize(Identifier texture) {
        return sizeCache.computeIfAbsent(texture, TextureUtil::loadSize);
    }

    public static float nativeHudWidth(Identifier texture) {
        return getSize(texture)[0] / ScreenScale.getScale();
    }

    public static float nativeHudHeight(Identifier texture) {
        return getSize(texture)[1] / ScreenScale.getScale();
    }

    private static int[] loadSize(Identifier texture) {
        MinecraftClient client = MinecraftClient.getInstance();
        try {
            Resource resource = client.getResourceManager().getResource(texture).orElseThrow();
            try (NativeImage image = NativeImage.read(resource.getInputStream())) {
                return new int[]{image.getWidth(), image.getHeight()};
            }
        } catch (IOException exception) {
            return new int[]{16, 16};
        }
    }
}
