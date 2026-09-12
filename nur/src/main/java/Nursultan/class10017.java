package Nursultan;

import java.util.Objects;

public final class class10017 {
   private static final int N = 259;
   private static final int y = 261;
   private static final int L = 257;
   private static final int u = 335;
   private static final int i = 263;
   private static final int R = 262;
   private static final int M = 268;
   private static final int B = 269;
   private final class09781 Z;
   private final class10062 z;

   private boolean L(class10021 var1) {
      String var2 = class10027.N(this.Z.N().N());
      return var2.isEmpty() ? true : this.N(var1, var2);
   }

   private static boolean M(class10021 var0) {
      return var0 != null && var0.y() == class10049.INPUT;
   }

   public class10017(class09781 var1) {
      this.Z = Objects.requireNonNull(var1, "context");
      this.z = class10062.N(var1);
   }

   private boolean i(class10021 var1) {
      String var2 = var1.B();
      boolean var3 = this.z.y(var1);
      this.y(var1, var2);
      return var3;
   }

   private boolean u(class10021 var1) {
      String var2 = var1.B();
      boolean var3 = this.z.N(var1);
      this.y(var1, var2);
      return var3;
   }

   private boolean y(class10021 var1) {
      this.N(var1);
      class10041 var2 = this.z.i(var1);
      if (!var2.N() && var1.B().isEmpty()) {
         return true;
      } else {
         if (!var2.N()) {
            this.z.L(var1);
         }

         return this.i(var1);
      }
   }

   private void y(class10021 var1, String var2) {
      String var3 = var1.B();
      if (!var2.equals(var3)) {
         class09863.N(new class09844(class09867.INPUT, var1, var2, var3));
      }
   }

   public boolean y(class10021 var1, int var2) {
      if (!M(var1)) {
         return false;
      } else {
         return switch (var2) {
            case 65, 97 -> this.z.L(var1);
            case 67, 99 -> this.N(var1);
            case 86, 118 -> this.L(var1);
            case 88, 120 -> this.y(var1);
            default -> false;
         };
      }
   }

   public boolean N(class10021 var1, int var2, class09857 var3, boolean var4) {
      if (!M(var1)) {
         return false;
      } else {
         boolean var5 = var3 != null && var3.y();

         return switch (var2) {
            case 257, 335 -> this.R(var1);
            case 259 -> this.u(var1);
            case 261 -> this.i(var1);
            case 262 -> this.z.y(var1, var5);
            case 263 -> this.z.N(var1, var5);
            case 268 -> this.z.L(var1, var5);
            case 269 -> this.z.u(var1, var5);
            default -> false;
         };
      }
   }

   private boolean N(class10021 var1) {
      class10041 var2 = this.z.i(var1);
      String var3 = var1.B();
      if (!var2.N()) {
         this.Z.N().N(var3);
      } else {
         this.Z.N().N(var3.substring(var2.R(), var2.M()));
      }

      return true;
   }

   public boolean N(class10021 var1, int var2) {
      if (M(var1) && Character.isValidCodePoint(var2) && !Character.isISOControl(var2)) {
         String var3 = class10027.N(new String(Character.toChars(var2)));
         return var3.isEmpty() ? false : this.N(var1, var3);
      } else {
         return false;
      }
   }

   private boolean N(class10021 var1, String var2) {
      String var3 = var1.B();
      boolean var4 = this.z.N(var1, var2);
      this.y(var1, var3);
      return var4;
   }

   private boolean R(class10021 var1) {
      class09863.N(new class09844(class09867.CHANGE, var1, var1.B(), var1.B()));
      return true;
   }
}
