package oxxxde;

import java.nio.ByteBuffer;

// $VF: Compiled from GlController.java
public interface ضّ {
   void pixelStore(int var1, int var2);

   void texParameter(int var1, int var2, int var3);

   void bindTexture(int var1);

   void texSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

   void deleteTexture(int var1);

   void texParameter(int var1, int var2, float var3);

   void run(Runnable var1);

   int genTexId();

   void texImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ByteBuffer var9);
}
