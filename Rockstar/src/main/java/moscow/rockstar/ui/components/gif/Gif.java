package moscow.rockstar.ui.components.gif;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.CustomComponent;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.interfaces.IMinecraft;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.NativeImage.Format;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

public class Gif extends CustomComponent implements IMinecraft {
   private final int frameCount;
   private int currentFrame = 0;
   private long lastFrameTime = 0L;
   private final GifDecoder gifDecoder = new GifDecoder();
   private final HashMap<Integer, Integer> frameDurations = new HashMap<>();
   private NativeImageBackedTexture dynamicTexture;
   private final Identifier dynamicTextureId;
   private float alpha = 1.0F;
   private final NativeImage sharedImage;

   public Gif(Identifier gifIdentifier, float x, float y, float width, float height) {
      super(x, y, width, height);

      try {
         Resource gifResource = mc.getResourceManager().getResourceOrThrow(gifIdentifier);
         this.gifDecoder.read(gifResource.getInputStream());
      } catch (Exception var12) {
         throw new RuntimeException("Failed to load GIF: " + var12.getMessage(), var12);
      }

      this.frameCount = this.gifDecoder.getFrameCount();

      for (int i = 0; i < this.frameCount; i++) {
         // GifDecoder delay is in centiseconds; drive animation in milliseconds.
         int delayCs = this.gifDecoder.getDelay(i);
         int delayMs = delayCs <= 0 ? 16 : delayCs * 10;
         this.frameDurations.put(i, delayMs);
      }

      // Start from a frame where the stroke is already visible (frame 0 is empty black).
      this.currentFrame = Math.min(40, Math.max(0, this.frameCount - 1));
      BufferedImage firstFrame = this.gifDecoder.getFrame(this.currentFrame);
      int imgWidth = firstFrame.getWidth();
      int imgHeight = firstFrame.getHeight();
      this.sharedImage = new NativeImage(Format.RGBA, imgWidth, imgHeight, false);

      for (int y1 = 0; y1 < imgHeight; y1++) {
         for (int x1 = 0; x1 < imgWidth; x1++) {
            int argb = firstFrame.getRGB(x1, y1);
            this.sharedImage.setColorArgb(x1, y1, argb);
         }
      }

      this.dynamicTexture = new NativeImageBackedTexture(this.sharedImage);
      this.dynamicTextureId = Rockstar.id("gif_texture/" + gifIdentifier.getPath().replace(':', '_'));
      mc.getTextureManager().registerTexture(this.dynamicTextureId, this.dynamicTexture);
      this.dynamicTexture.upload();
   }

   private void updateFrame(int frameIndex) {
      BufferedImage frame = this.gifDecoder.getFrame(frameIndex);

      for (int y = 0; y < frame.getHeight(); y++) {
         for (int x = 0; x < frame.getWidth(); x++) {
            int argb = frame.getRGB(x, y);
            this.sharedImage.setColorArgb(x, y, argb);
         }
      }

      this.dynamicTexture.upload();
   }

   @Override
   public void update(UIContext context) {
      long currentTime = System.currentTimeMillis();
      if (currentTime - this.lastFrameTime > this.frameDurations.get(this.currentFrame).intValue()) {
         this.lastFrameTime = currentTime;
         this.currentFrame = (this.currentFrame + 1) % this.frameCount;
         this.updateFrame(this.currentFrame);
      }
   }

   @Override
   protected void renderComponent(UIContext context) {
      context.drawTexture(this.dynamicTextureId, this.x, this.y, this.width, this.height, Colors.WHITE.mulAlpha(this.alpha));
   }

   public void dispose() {
      if (this.dynamicTexture != null) {
         mc.getTextureManager().destroyTexture(this.dynamicTextureId);
         this.dynamicTexture.close();
         this.dynamicTexture = null;
      }
   }

   @Generated
   public void setAlpha(float alpha) {
      this.alpha = alpha;
   }
}
