package Nursultan;

import java.util.WeakHashMap;
import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class02998;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06586;
import minecraft.class06660;
import minecraft.class07050;
import minecraft.class08036;

public class class11572 extends class11590 {
   public Object y_0;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;

   private static void M() {
      L_0 = 8;
      L_1 = (byte)1;
      L_2 = (byte)0;
      L_3 = (byte)3;
      L_4 = (byte)2;
   }

   public class11572(UseTracker var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.i();
      this.y_0 = new WeakHashMap();
   }

   static {
      N();
      M();
   }

   private void i() {
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: One or more variable merging failures!
   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void y(Object var1) {
      this.i();
      switch (var1) {
         case null:
         default:
            break;
         case class11396 var28:
            if (((class11396)var1).N() instanceof class08036 var16) {
               ((WeakHashMap)this.y_0).remove(var16);
            }
            break;
         case class10990 var5:
            if (!(var5.u() instanceof class06660 var8)) {
               return;
            }

            class06660 var10000 = var8;

            int var10;
            label72: {
               label81: {
                  try {
                     var24 = var10000.N();
                  } catch (Throwable var15) {
                     var23 = var15;
                     boolean var10001 = false;
                     break label81;
                  }

                  var10 = var24;
                  var10000 = var8;

                  try {
                     var10000.y();
                     break label72;
                  } catch (Throwable var14) {
                     var23 = var14;
                     boolean var27 = false;
                  }
               }

               Throwable var2 = var23;
               throw new MatchException(var2.toString(), var2);
            }

            if ((class04453)((class06202)super.N_0).T_4 == null
               || ((class04453)((class06202)super.N_0).T_4).method_5628() == var10
               || !(((class03448)((class06202)super.N_0).T_3).method_8469(var10) instanceof class04477 var18)) {
               return;
            }

            int var20 = class11938.j().y();
            class11543 var22 = (class11543)((WeakHashMap)this.y_0).get(var18);

            Object var7;
            for (class02998<?> var12 : var7_1) {
               if (var12.N() == 8) {
                  byte var13 = (Byte)var12.L();
                  if (var22 != null) {
                     if (var20 - var22.y() >= 32) {
                        this.N(var18, var22, var13);
                     } else {
                        ((WeakHashMap)this.y_0).remove(var18);
                     }
                  }

                  this.N(var18, var13, var20);
               }
            }
      }
   }

   private boolean N(class06584 var1) {
      return !class11929.U(var1) && !(var1.B() instanceof class06586) && var1.B() != class06570.jT;
   }

   private void N(class04477 var1, class11543 var2, byte var3) {
      this.i();

      for (class07050 var7 : class07050.values()) {
         class06584 var8 = var1.method_5998(var7);
         class06584 var9 = var2.N();
         boolean var10 = var8.B() != class06570.nP || this.N(var9);
         if (!var10 || !this.N(var8)) {
            if (!var10) {
               var8 = var9;
            }

            if (var3 == (var7 == class07050.field_5808 ? 0 : 2)) {
               class06584 var11 = var8;
               class11923.N(() -> this.N((class08036)var1, var11));
               ((WeakHashMap)this.y_0).remove(var1);
               break;
            }
         }
      }
   }

   private static void N() {
   }

   private void N(class08036 var1, class06584 var2) {
      class00380 var3 = new class00380(var2);
      class05216 var4 = var1.method_5476().L();
      class00392 var5 = var2.B() instanceof class06586 ? var2.k() : var2.Y();
      Object var6 = class06541.N(var4.getString()).endsWith(" ") ? "" : " ";
      class05216 var7 = var4.i(class06541.field_1080 + var6 + class12020.N("food-used") + " ").y(var5).y(class00405.N.N(var3));
      class11303.N(new class11288((UseTracker)super.u_0), (class00392)var7);
   }

   private void N(class04477 var1, byte var2, int var3) {
      this.i();

      for (class07050 var7 : class07050.values()) {
         class06584 var8 = var1.method_5998(var7);
         if (!this.N(var8) && var2 == (var7 == class07050.field_5808 ? 1 : 3)) {
            ((WeakHashMap)this.y_0).put(var1, new class11543(var3, var8));
            break;
         }
      }
   }
}
