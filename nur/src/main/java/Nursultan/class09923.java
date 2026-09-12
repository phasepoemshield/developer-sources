package Nursultan;

import java.util.List;
import java.util.Objects;

public final class class09923 {
   private class09923() {
   }

   public static void N(List<class09935> var0, class09911 var1) {
      int var2 = 0;

      for (int var3 = var0.size(); var2 < var3; var2++) {
         N((class09935)var0.get(var2), var1);
      }
   }

   private static void N(class09935 var0, class09911 var1) {
      Objects.requireNonNull(var0);
      switch (var0) {
         case class09909 var4:
            var1.N(var4.N());
            break;
         case class09919 var5:
            var1.N(var5.N(), var5.y(), var5.L(), var5.u(), var5.i(), var5.R());
            N(var5.M(), var1);
            var1.R();
            break;
         case class09903 var6:
            var1.N(var6.N(), var6.y(), var6.L(), var6.u());
            N(var6.i(), var1);
            var1.M();
            break;
         case class09934 var7:
            var1.N(var7.N());
            N(var7.y(), var1);
            var1.u();
            break;
         case class09922 var8:
            if (var1.N(var8.N(), var8.y())) {
               N(var8.L(), var1);
               var1.N(var8.y());
            }
            break;
         case class09899 var9:
            var1.N(var9.N());
            N(var9.y(), var1);
            var1.i();
            break;
         default:
            throw new MatchException(null, null);
      }
   }
}
