package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07261;
import org.joml.Vector3i;

public class class11585 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;

   public class11585(AnarchyHelper var1, class11576 var2) {
      this.Z();
      this.N_0 = class06202.Nq();
      this.N_1 = new ArrayList();
      this.N_4 = class11524.N(var1, "structure-detector", true);
      this.N_2 = new class11577(var2);
      this.N_3 = new class11586(var2);
   }

   private void Z() {
   }

   public void y() {
      ((List)this.N_1).clear();
   }

   public void N() {
      if (((class11507)this.N_4).i() && !((List)this.N_1).isEmpty()) {
         class11560 var1 = this.R();
         ((class11577)this.N_2).N((List<class11556>)this.N_1, var1.N(), var1.y());
         ((class11586)this.N_3).N((List<class11556>)this.N_1, var1.N(), var1.y());
         ((List)this.N_1).clear();
      }
   }

   public void N(class10990 var1) {
      if (((class11507)this.N_4).i()) {
         if (var1.u() instanceof class07261 var2) {
            ((class06202)this.N_0)
               .execute(
                  () -> var2.N(
                        (var1xx, var2x) -> {
                           if (!var2x.P()
                              && ((class04453)((class06202)this.N_0).T_4)
                                    .method_5649((double)var1xx.method_10263(), (double)var1xx.method_10264(), (double)var1xx.method_10260())
                                 < 25600.0) {
                              ((List)this.N_1).add(new class11556(new class07209(var1xx), var2x));
                           }
                        }
                     )
               );
         }
      }
   }

   private class11560 R() {
      Vector3i var1 = new Vector3i(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
      Vector3i var2 = new Vector3i(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      Iterator var3 = ((List)this.N_1).iterator();

      while (var3.hasNext()) {
         class07209 var5 = ((class11556)var3.next()).N();
         var1.x = Math.min(var1.x, var5.method_10263());
         var1.y = Math.min(var1.y, var5.method_10264());
         var1.z = Math.min(var1.z, var5.method_10260());
         var2.x = Math.max(var2.x, var5.method_10263());
         var2.y = Math.max(var2.y, var5.method_10264());
         var2.z = Math.max(var2.z, var5.method_10260());
      }

      return new class11560(var1, var2);
   }
}
