package Nursultan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class class09936 {
   private static final class09936 N = new class09936(List.of(), 0, List.of());
   private final List<class09935> y;
   private final int L;
   private final List<String> u;

   public int L() {
      return this.L;
   }

   private class09936(List<class09935> var1, int var2, List<String> var3) {
      this.y = var1;
      this.L = var2;
      this.u = var3 == null ? List.of() : List.copyOf(var3);
   }

   public List<String> i() {
      return this.u;
   }

   public List<class09924> u() {
      if (this.y.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(this.L);
         N(this.y, var1);
         return var1;
      }
   }

   public List<class09935> y() {
      return this.y;
   }

   public static class09936 N(List<class09935> var0, int var1, List<String> var2) {
      return var0 != null && !var0.isEmpty() && var1 > 0 ? new class09936(var0, var1, var2) : new class09936(List.of(), 0, var2);
   }

   private static void N(List<class09935> var0, List<class09924> var1) {
      for (class09935 var10000 : var0) {
         Objects.requireNonNull(var10000);
         Object var4 = var10000;
         switch (var4) {
            case class09909 var6:
               var1.add(var6.N());
               break;
            case class09919 var7:
               N(((class09919)var4).M(), var1);
               break;
            case class09903 var8:
               N(((class09903)var4).i(), var1);
               break;
            case class09934 var9:
               N(((class09934)var4).y(), var1);
               break;
            case class09922 var10:
               N(((class09922)var4).L(), var1);
               break;
            case class09899 var11:
               N(((class09899)var4).y(), var1);
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   public static class09936 N() {
      return N;
   }
}
