package zenith.zov.client.screens.nlgui.cosmetics;

import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.BufferUtils;

public final class CosmeticAvatarImageCache {
   private static final String AVATAR_PNG = "avatar.png";
   private static final String CACHE_NAMESPACE = "zenith";
   private static final String CACHE_PREFIX = "cosmetic_avatar/";
   private static final Map<String, Identifier> pathToId = new ConcurrentHashMap<>();

   private CosmeticAvatarImageCache() {
   }

   public static Identifier getAvatarTextureId(Path path) {
      if (path != null && Files.isDirectory(path)) {
         Path path1 = path.resolve("avatar.png");
         if (!Files.isRegularFile(path1)) {
            return null;
         } else {
            String s = path.normalize().toAbsolutePath().toString();
            Identifier Identifierx = pathToId.get(s);
            if (Identifierx != null) {
               return Identifierx;
            } else {
               Identifier Identifierx = loadAndRegister(path1, s);
               if (Identifierx != null) {
                  pathToId.put(s, Identifierx);
               }

               return Identifierx;
            }
         }
      } else {
         return null;
      }
   }

   private static Identifier loadAndRegister(Path path, String s) {
      try {
         Identifier Identifier = Identifier.of("zenith", "cosmetic_avatar/" + Integer.toHexString(s.hashCode()));
         byte[] abyte = Files.readAllBytes(path);
         ByteBuffer bytebuffer = BufferUtils.createByteBuffer(abyte.length).put(abyte);
         bytebuffer.flip();
         NativeImageBackedTexture NativeImageBackedTexture = new NativeImageBackedTexture(NativeImage.read(bytebuffer));
         MinecraftClient.getInstance().execute(() -> MinecraftClient.getInstance().getTextureManager().registerTexture(Identifier, NativeImageBackedTexture));
         return Identifier;
      } catch (Exception exception) {
         return null;
      }
   }

   public static void clear() {
      MinecraftClient MinecraftClient = MinecraftClient.getInstance();
      if (MinecraftClient != null && MinecraftClient.getTextureManager() != null) {
         for (Identifier Identifier : pathToId.values()) {
            try {
               MinecraftClient.getTextureManager().destroyTexture(Identifier);
            } catch (Exception exception) {
            }
         }

         pathToId.clear();
      }
   }
}
