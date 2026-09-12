package Nursultan;

import java.util.List;
import minecraft.class06570;
import org.joml.Vector3d;
import org.joml.Vector3i;

public class class11586 {
   public Object N_0;

   public class11586(class11576 var1) {
      this.y();
      this.N_0 = var1;
   }

   private void y() {
   }

   private Vector3d N(List<class11556> var1, class11547 var2, Vector3i var3, Vector3i var4) {
      Vector3i var5 = var4.sub(var3, new Vector3i());
      if (var2.N(var1, var3, var5)) {
         Vector3d var6 = new Vector3d(var5);
         Vector3d var7 = new Vector3d(var3);
         return var6.mul(0.5).add(var7).add(0.5, 0.5, 0.5);
      } else {
         return null;
      }
   }

   private void N(class11579 var1, Vector3d var2) {
      ((class11576)this.N_0).N(new class11563(class06570.ny.E(), var1, new Vector3d(var2.x, var2.y, var2.z), class11938.j().y() + var1.y()));
   }

   public void N(List<class11556> var1, Vector3i var2, Vector3i var3) {
      for (class11547 var5 : (List)class11578.N_0) {
         if (var5.N(var1)) {
            Vector3d var6 = this.N(var1, var5, var2, var3);
            if (var6 != null) {
               this.N(var5, var6);
            }
         }
      }
   }
}
