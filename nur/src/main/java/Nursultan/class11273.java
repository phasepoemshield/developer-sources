package Nursultan;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07070;
import minecraft.class07713;
import minecraft.class08036;

public class class11273 extends class11045<class08036> {
   public static Object y_0 = Codec.STRING.optionalFieldOf("don-item");
   public static Object y_1 = Codec.STRING.optionalFieldOf("minecraft:don-item");
   public static Object y_2 = class02837.L.optionalFieldOf("PublicBukkitValues");

   public class11273(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      N();
      i();
   }

   private String B(String var1) {
      if (var1.startsWith("sphere-")) {
         String var2 = var1.substring(var1.indexOf(45) + 1).toUpperCase();
         return class06541.field_1080 + " [" + class06541.field_1061 + var2 + class06541.field_1080 + "]" + class06541.field_1070;
      } else {
         return "";
      }
   }

   private static void i() {
      y_0 = null;
      y_1 = null;
      y_2 = null;
   }

   public class05216 L(class08036 var1) {
      class05216 var2 = super.L(var1);
      if (((class11535)((EntityESP)super.N_0).L_3).U()) {
         for (class07070 var6 : class07070.values()) {
            String var7 = this.N(var1.method_61420(var6));
            if (!var7.isEmpty()) {
               var2.i(var7);
            }
         }
      }

      if (var1 instanceof class11814 var8 && var8.dataManager().y().N()) {
         var2.i(this.R());
      }

      return var2;
   }

   @Override
   public boolean test(class07049 var1) {
      return class11791.B()
         .and(class11791.N().or(var1x -> var1 instanceof class11814 && ((class11814)var1).dataManager().y().N()))
         .and(class11791.E().negate())
         .and(class11791.z().negate())
         .and(class11791.y().negate())
         .and((class11786)((EntityESP)super.N_0).M_3)
         .and((class11785)((EntityESP)super.N_0).M_2)
         .and((class11793)((EntityESP)super.N_0).i_0)
         .test(var1);
   }

   private String N(class06584 var1) {
      class02837 var2 = (class02837)var1.y().method_58694(class02484.y);
      if (var2 == null) {
         return "";
      } else {
         Optional var3 = (Optional)((MapCodec)y_0).codec().parse(class07713.N, var2.y()).getOrThrow();
         if (var3.isPresent()) {
            return this.B((String)var3.get());
         } else {
            Optional var4 = (Optional)((MapCodec)y_2).codec().parse(class07713.N, var2.y()).getOrThrow();
            if (var4.isPresent()) {
               Optional var5 = (Optional)((MapCodec)y_1).codec().parse(class07713.N, ((class02837)var4.get()).y()).getOrThrow();
               if (var5.isPresent()) {
                  return this.B((String)var5.get());
               }
            }

            return "";
         }
      }
   }

   public int u(class08036 var1) {
      return !var1.method_5767() && !var1.method_21751() ? super.u(var1) : -1434451968;
   }

   private static void N() {
   }

   private String R() {
      return class06541.field_1080 + " [" + class06541.field_1061 + "DORMANT" + class06541.field_1080 + "]" + class06541.field_1070;
   }
}
