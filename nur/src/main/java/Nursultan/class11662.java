package Nursultan;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormatElement.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class08523;
import minecraft.class08852;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08865;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;

public class class11662 extends class08865 {
   private final Map<VertexFormat, class08861> N = new HashMap<>();
   private final class08859 y;
   private final boolean L;

   public class11662(class08859 var1) {
      this.y = var1;
      if ("Mesa".equals(GlStateManager._getString(7936))) {
         String var2 = GlStateManager._getString(7938);
         this.L = var2.contains("25.0.0") || var2.contains("25.0.1") || var2.contains("25.0.2");
      } else {
         this.L = false;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(VertexFormat var1, @Nullable class08523 var2) {
      class08861 var3 = this.N.get(var1);
      if (var3 != null) {
         GlStateManager._glBindVertexArray(var3.N);
         if (var2 != null && var3.L != var2) {
            if (this.L && var3.L != null && var3.L.u == var2.u) {
               ARBVertexAttribBinding.glBindVertexBuffer(0, 0, 0L, 0);
            }

            ARBVertexAttribBinding.glBindVertexBuffer(0, var2.u, 0L, var1.getVertexSize());
            var3.L = var2;
         }
      } else {
         int var4 = GlStateManager._glGenVertexArrays();
         GlStateManager._glBindVertexArray(var4);
         if (var2 != null) {
            List<VertexFormatElement> var5 = var1.getElements();

            for (int var6 = 0; var6 < var5.size(); var6++) {
               VertexFormatElement var7 = var5.get(var6);
               GlStateManager._enableVertexAttribArray(var6);
               switch (class08852.N[var7.usage().ordinal()]) {
                  case 1:
                  case 2:
                  case 3:
                     if (var7.type() == Type.FLOAT) {
                        ARBVertexAttribBinding.glVertexAttribFormat(var6, var7.count(), GlConst.toGl(var7.type()), false, var1.getOffset(var7));
                     } else {
                        ARBVertexAttribBinding.glVertexAttribIFormat(var6, var7.count(), GlConst.toGl(var7.type()), var1.getOffset(var7));
                     }
                     break;
                  case 4:
                  case 5:
                     ARBVertexAttribBinding.glVertexAttribFormat(var6, var7.count(), GlConst.toGl(var7.type()), true, var1.getOffset(var7));
               }

               ARBVertexAttribBinding.glVertexAttribBinding(var6, 0);
            }
         }

         if (var2 != null) {
            ARBVertexAttribBinding.glBindVertexBuffer(0, var2.u, 0L, var1.getVertexSize());
         }

         class08861 var8 = new class08861(var4, var1, var2);
         this.y.N(var8);
         this.N.put(var1, var8);
      }
   }
}
