package Nursultan;

import java.util.Iterator;
import java.util.List;
import minecraft.class07209;
import org.joml.Vector3i;

public class class11588 extends class11547 {
   public class11588(String var1, int var2) {
      super(var1, var2);
   }

   private boolean N(List<class11556> var1, Vector3i var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;

      for (int var9 = 0; var9 <= var4; var9++) {
         for (int var10 = 0; var10 <= var3; var10++) {
            int var11 = var2.x + var9 * var6 + var5;
            int var12 = var2.y + var10;
            int var13 = var2.z + var9;
            int var14 = var13 + var7;
            Iterator var15 = var1.iterator();

            while (var15.hasNext()) {
               class07209 var17 = ((class11556)var15.next()).N();
               if (var17.method_10263() == var11 && var17.method_10264() == var12 && (var17.method_10260() == var13 || var17.method_10260() == var14)) {
                  var8++;
               }
            }
         }
      }

      return var8 == var1.size();
   }

   @Override
   public boolean N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      return this.N(var1, var2, var3.y, var3.x, var3.x, -1, 1)
         || this.N(var1, var2, var3.y, var3.x, 0, 1, 1)
         || this.N(var1, var2, var3.y, var3.x, var3.x, -1, -1)
         || this.N(var1, var2, var3.y, var3.x, 0, 1, -1);
   }
}
