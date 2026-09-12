package Nursultan;

import java.util.Objects;

final class class09812 {
   class10021 N(class09798 var1) {
      Objects.requireNonNull(var1, "spec");
      class10049 var2 = var1.y();
      class10021 var3 = new class10021(var1.N(), var2);
      class10018.N(var3, class09817.N(var1));
      class09793<class09904> var4 = class09817.y(var1);
      if (var4 != null) {
         var4.N(var3);
      }

      var3.N(var1.R());
      var3.N(var1.i());

      for (class09816 var6 : var1.u()) {
         var3.N(var6.N(), var6.y(), var6.L());
      }

      if (var2 == class10049.TEXT) {
         var3.N(var1.M());
      }

      if (var2 == class10049.INPUT) {
         var3.N(var1.M());
         var3.y(var1.B());
      }

      if (var2 == class10049.TEXTURE) {
         var3.L(var1.Z());
      }

      if (var2 == class10049.CANVAS && var1.z() != null) {
         var3.N(var1.z());
      }

      for (class09798 var8 : var1.L()) {
         var3.N(this.N(var8));
      }

      return var3;
   }
}
