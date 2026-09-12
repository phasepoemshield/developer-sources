package Nursultan;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00496;
import minecraft.class02484;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06937;

public class class11428 extends class11807<Notifications> {
   public Object y_0;
   public static Object L_0;
   public static Object L_1;

   private void L() {
   }

   private static void M() {
      L_0 = 10000L;
      L_1 = 4000L;
   }

   public class11428(Notifications var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.L();
      this.y_0 = new HashMap();
   }

   static {
      N();
      M();
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void y(Object var1) {
      this.L();
      Objects.requireNonNull(var1);
      Object var2;
      switch (var1) {
         case class10990 var8 when ((class10990)var2).u() instanceof class00496 var5:
            this.N((class00496)var5);
            break;
         case class10996 var6:
            ((Map)this.y_0).entrySet().removeIf(var0 -> System.currentTimeMillis() - (Long)var0.getValue() > 10000L);
            break;
      }
   }

   private static void N() {
   }

   private void N(class00496 var1) {
      this.L();
      if (var1.N() == 0 && (class04453)((class06202)super.N_0).T_4 != null) {
         class06584 var2 = var1.L();
         int var3 = var1.y();
         class06937 var4 = ((class04453)((class06202)super.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(var3);
         if (var4.R() && var2.W()) {
            class06581 var5 = var2.B();
            float var6 = class11929.M(var2);
            if (!(var6 < 0.0F) && !(var6 > 7.0F)) {
               class06584 var7 = var4.i();
               if (var7.W() && var7.P() < var2.P()) {
                  long var8 = System.currentTimeMillis();
                  Long var10 = (Long)((Map)this.y_0).get(var3);
                  if (var10 == null || var8 - var10 >= 10000L) {
                     ((Map)this.y_0).put(var3, var8);
                     if (var3 > 4 && var3 < 9 && var5.R().N(class02484.o)) {
                        N(var2, "item-almost-break");
                     } else if (((class04453)((class06202)super.N_0).T_4).method_31548().N() + 36 == var3) {
                        class06584 var11 = ((class04453)((class06202)super.N_0).T_4).method_6047();
                        if (!var11.R()) {
                           N(var11, "item-in-hand-almost-break");
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static void N(class06584 var0, String var1) {
      class11938.g().i().L().N(new class11869(var0.t())).N(new class11857(class12020.N(var1))).N(4000L).N();
   }
}
