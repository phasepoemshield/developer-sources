package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33;

public class class11735 implements class11741 {
   class11735() {
   }

   @Override
   public int N(int var1, int var2, ByteBuffer var3) {
      int var4 = GL33.glGenTextures();
      if (var4 == 0) {
         return 0;
      } else {
         int var5 = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var4);
         GlStateManager._texParameter(3553, 10240, 9729);
         GlStateManager._texParameter(3553, 10241, 9729);
         GlStateManager._texParameter(3553, 10242, 33071);
         GlStateManager._texParameter(3553, 10243, 33071);
         GlStateManager._pixelStore(3314, 0);
         GlStateManager._pixelStore(3316, 0);
         GlStateManager._pixelStore(3315, 0);
         GlStateManager._pixelStore(3317, 1);
         GL33.glTexImage2D(3553, 0, 32856, var1, var2, 0, 6408, 5121, var3);
         GlStateManager._bindTexture(var5);
         return var4;
      }
   }

   @Override
   public int N() {
      int var1 = GL33.glGenTextures();
      if (var1 == 0) {
         return 0;
      } else {
         int var2 = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var1);
         GlStateManager._texParameter(3553, 10240, 9729);
         GlStateManager._texParameter(3553, 10241, 9729);
         GlStateManager._texParameter(3553, 10242, 33071);
         GlStateManager._texParameter(3553, 10243, 33071);
         GlStateManager._texParameter(3553, 32882, 33071);
         GlStateManager._texParameter(3553, 36418, 1);
         GlStateManager._texParameter(3553, 36419, 1);
         GlStateManager._texParameter(3553, 36420, 1);
         GlStateManager._texParameter(3553, 36421, 6403);
         GlStateManager._bindTexture(var2);
         return var1;
      }
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, ByteBuffer var9) {
      int var10 = GL33.glGetInteger(32873);
      GlStateManager._bindTexture(var1);
      GlStateManager._pixelStore(3314, 0);
      GlStateManager._pixelStore(3316, 0);
      GlStateManager._pixelStore(3315, 0);
      GlStateManager._pixelStore(3317, 1);
      if (var8) {
         GL33.glTexImage2D(3553, 0, 33321, var6, var7, 0, 6403, 5121, var9);
      } else {
         GL12.glTexSubImage2D(3553, 0, var2, var3, var4, var5, 6403, 5121, var9);
      }

      GlStateManager._bindTexture(var10);
   }
}
