package Nursultan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02695;
import minecraft.class02837;
import minecraft.class02848;
import minecraft.class02854;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06517;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06918;
import minecraft.class07027;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07085;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class08209;
import minecraft.class08725;

public class class11929 {
   private static String[] y;
   public static Object N_0 = class06202.Nq();

   public static List<class00392> L(class06584 var0) {
      class02848 var1 = (class02848)var0.y().method_58694(class02484.W);
      return var1 == null ? Collections.emptyList() : var1.N().stream().filter(var0x -> !var0x.getString().isBlank()).toList();
   }

   private static void L() {
   }

   public static float M(class06584 var0) {
      return (float)(var0.s() - var0.P()) / (float)var0.s() * 100.0F;
   }

   private class11929() {
      throw new UnsupportedOperationException(y[0]);
   }

   static {
      N();
      u();
      L();
   }

   public static class06517 B(class06584 var0) {
      return (class06517)var0.a_(class02484.h, class06517.N);
   }

   public static int Z(class06584 var0) {
      int var1 = 1;
      var1 = N(var1, class04206.B.N(var0.B()));
      return N(var1, N(var0.w() != null ? var0.w().getString() : (!var0.k().getString().isEmpty() ? var0.k().getString() : var0.B().z())));
   }

   public static List<class06584> i(class06584 var0) {
      if (!y(var0)) {
         return Collections.emptyList();
      } else {
         class02854 var1 = (class02854)var0.y().method_58694(class02484.NG);
         if (var1 == null) {
            return Collections.emptyList();
         } else {
            return var1.y().allMatch(class06584::R) ? Collections.emptyList() : var1.y().toList();
         }
      }
   }

   public static boolean U(class06584 var0) {
      return var0.B().R().N(class02484.d);
   }

   public static int z(class06584 var0) {
      class08209 var1 = (class08209)var0.method_58694(class02484.w);
      return var1 != null ? var1.N() : 0;
   }

   public static boolean u(class06584 var0) {
      return var0.y().N(class02484.O) || var0.y().N(class02484.g);
   }

   private static void u() {
      y = new String[1];
      y[0] = "This is a utility class and cannot be instantiated";
   }

   public static boolean y(class06584 var0) {
      class06581 var2 = var0.B();
      return var2 instanceof class06918 && ((class06918)var2).L() instanceof class07027;
   }

   public static List<String> E(class06584 var0) {
      class02848 var1 = (class02848)var0.y().method_58694(class02484.W);
      return var1 == null ? Collections.emptyList() : var1.N().stream().<String>map(class00392::getString).filter(var0x -> !var0x.isBlank()).toList();
   }

   public static int N(class06584 var0, class05946<class07304> var1) {
      class03556<class07304> var2 = N(var1);
      return var2 == null ? 0 : class07323.N(var2, var0);
   }

   public static class03556<class07304> N(class05946<class07304> var0) {
      return (class03556<class07304>)((class04453)((class06202)N_0).T_4).method_56673().L(class04227.yR).N(var0).orElse(null);
   }

   public static boolean N(class06584 var0, class07085 var1) {
      class08725 var2 = (class08725)var0.method_58694(class02484.o);
      return var2 != null && var2.y() == var1;
   }

   @SafeVarargs
   public static boolean N(class06584 var0, class03556<class07084>... var1) {
      class06517 var2 = B(var0);
      return Arrays.stream(var1).allMatch(var1x -> {
         Iterator<class07055> var2x = var2.N().iterator();

         while (var2x.hasNext()) {
            if (var2x.next().L().N(var1x)) {
               return true;
            }
         }

         return false;
      });
   }

   private static void N() {
   }

   private static int N(int var0, int var1) {
      return var0 * 31 + var1;
   }

   public static int N(class06584 var0) {
      if (var0.R()) {
         return 0;
      } else {
         float var1 = 0.0F;
         if ((class04453)((class06202)N_0).T_4 != null) {
            var1 = ((class04453)((class06202)N_0).T_4).method_7357().N(var0, 0.0F);
         }

         int var2 = R(var0);
         var2 = N(var2, var0.c());
         var2 = N(var2, Float.floatToIntBits(var1));
         return N(var2, var0.P());
      }
   }

   private static int N(Object var0) {
      return var0 == null ? 0 : var0.hashCode();
   }

   public static boolean N(class06584 var0, String var1) {
      if (var0.R()) {
         return false;
      } else {
         class02837 var2 = (class02837)var0.y().method_58694(class02484.y);
         return var2 == null ? false : var2.y().y(var1);
      }
   }

   public static class00891 N(String var0) {
      return (class00891)class04206.i.N(class01894.y(var0));
   }

   public static int R(class06584 var0) {
      class02695 var1 = var0.y();
      int var2 = 1;
      var2 = N(var2, class04206.B.N(var0.B()));
      var2 = N(var2, N(var1.method_58694(class02484.E)));
      var2 = N(var2, N(var1.method_58694(class02484.j)));
      var2 = N(var2, N(var1.method_58694(class02484.F)));
      var2 = N(var2, N(var1.method_58694(class02484.Nn)));
      var2 = N(var2, N(var1.method_58694(class02484.y)));
      var2 = N(var2, N(var1.method_58694(class02484.Nv)));
      var2 = N(var2, N(var1.method_58694(class02484.Nu)));
      var2 = N(var2, N(var1.method_58694(class02484.Nt)));
      var2 = N(var2, N(var1.method_58694(class02484.h)));
      var2 = N(var2, N(var1.method_58694(class02484.Nb)));
      var2 = N(var2, N(var1.method_58694(class02484.f)));
      var2 = N(var2, N(var1.method_58694(class02484.C)));
      var2 = N(var2, N(var1.method_58694(class02484.S)));
      var2 = N(var2, N(var1.method_58694(class02484.A)));
      var2 = N(var2, N(var1.method_58694(class02484.NZ)));
      var2 = N(var2, N(var1.method_58694(class02484.NP)));
      var2 = N(var2, N(var1.method_58694(class02484.x)));
      var2 = N(var2, N(var1.method_58694(class02484.D)));
      var2 = N(var2, N(var1.method_58694(class02484.Ns)));
      var2 = N(var2, N(var1.method_58694(class02484.NR)));
      var2 = N(var2, N(var1.method_58694(class02484.NM)));
      return N(var2, N(var0.Q() ? 1 : 0));
   }
}
