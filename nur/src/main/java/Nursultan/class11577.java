package Nursultan;

import java.util.List;
import minecraft.class06570;
import minecraft.class07209;
import org.joml.Vector3d;
import org.joml.Vector3i;

public class class11577 {
   public Object N_0;

   private void L() {
   }

   public class11577(class11576 var1) {
      this.L();
      this.N_0 = var1;
   }

   static {
      N();
   }

   private boolean y(List<class11556> var1, Vector3i var2, Vector3i var3) {
      int var4 = var3.x + var2.x / 2;
      int var5 = var3.y + var2.y / 2;
      int var6 = var3.z + var2.z / 2;
      return var1.stream().filter(var3x -> {
         class07209 var4x = var3x.N();
         return var4x.method_10263() == var4 && var4x.method_10264() == var5 && var4x.method_10260() == var6;
      }).anyMatch(var0 -> !var0.y().P());
   }

   public void N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      for (class11565 var5 : (List)class11557.L_0) {
         if (var5.N(var1)) {
            this.N(var1, var5, var2, var3);
            break;
         }
      }
   }

   private void N(List<class11556> var1, class11579 var2, Vector3i var3, Vector3i var4) {
      Vector3i var5 = var4.sub(var3, new Vector3i());
      if (var5.x == var5.z && var5.y >= 3 && !this.y(var1, var5, var3)) {
         Vector3d var6 = new Vector3d(var5);
         Vector3d var7 = new Vector3d(var3);
         Vector3d var8 = var6.mul(0.5).add(var7).add(0.5, 0.5, 0.5);
         ((class11576)this.N_0).N(new class11563(class06570.TW.E(), var2, new Vector3d(var8.x, var8.y, var8.z), class11938.j().y() + var2.y()));
      }
   }

   private static void N() {
   }
}
