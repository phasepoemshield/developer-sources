package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

// $VF: Compiled from heavy
public class اَ implements ضّ {
   public static final int GL_RGB = 6407;
   public static final int GL_RGBA = 6408;

   @Override
   public int genTexId() {
      return GlStateManager._genTexture();
   }

   @Override
   public void deleteTexture(int id) {
      GlStateManager._deleteTexture(id);
   }

   @Override
   public void bindTexture(int id) {
      GlStateManager._bindTexture(id);
   }

   @Override
   public void texImage2D(int target, int type, int internalformat, int border, int width, int level, int pixels, int height, ByteBuffer format) {
      GlStateManager._texImage2D(target, level, internalformat, width, height, border, format, type, pixels);
   }

   @Override
   public void texSubImage2D(int pixels, int target, int level, int format, int xoffset, int type, int yoffset, int width, long height) {
      GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
   }

   @Override
   public void texParameter(int pname, int param, float target) {
      GL11.glTexParameterf(target, pname, param);
   }

   @Override
   public void pixelStore(int param, int pname) {
      GlStateManager._pixelStore(pname, param);
   }

   @Override
   public void texParameter(int target, int param, int pname) {
      GlStateManager._texParameter(target, pname, param);
   }

   @Override
   public void run(Runnable runnable) {
      runnable.run();
   }
}
