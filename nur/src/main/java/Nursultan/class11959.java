package Nursultan;

import io.netty.util.AttributeKey;
import java.util.HashMap;
import java.util.Map;

public enum class11959 {
   AUTH,
   PLAY;

   public static AttributeKey staticFields_0045a7f96127f3825b996192bc44fb844_2 = AttributeKey.valueOf("protocol");
   public static AttributeKey staticFields_0045a7f96127f3825b996192bc44fb844_3 = AttributeKey.valueOf("protocolVersion");
   public static Map staticFields_0045a7f96127f3825b996192bc44fb844_4 = new HashMap();
   public Map fields_0045a7f96127f3825b996192bc44fb844_0;

   private static void L() {
      AUTH = null;
      PLAY = null;
      staticFields_0045a7f96127f3825b996192bc44fb844_2 = null;
      staticFields_0045a7f96127f3825b996192bc44fb844_3 = null;
      staticFields_0045a7f96127f3825b996192bc44fb844_4 = null;
   }

   private class11959(class11977 var3) {
      this.R();
      this.fields_0045a7f96127f3825b996192bc44fb844_0 = (Map)var3.N_0;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      N();
      class11977 var64 = new class11977();
      class11943 var66 = new class11943<class09268>().N(0, class09288.class, class09288::new);
      class11977 var67 = var64.N(class11964.SERVER_TO_CLIENT, var66.N(1, class09302.class, class09302::new));
      class11943 var68 = new class11943();
      AUTH = new class11959(var67.N(class11964.CLIENT_TO_SERVER, var68.N(0, class11954.class, class11954::new)));
      class11977 var69 = new class11977();
      class11943 var86 = new class11943<class09263>()
         .N(0, class09270.class, class09270::new)
         .N(1, class09280.class, class09280::new)
         .N(2, class09298.class, class09298::new)
         .N(3, class09271.class, class09271::new)
         .N(4, class09255.class, class09255::new)
         .N(5, class09273.class, class09273::new)
         .N(6, class09289.class, class09289::new)
         .N(7, class09266.class, class09266::new)
         .N(8, class09278.class, class09278::new)
         .N(9, class09286.class, class09286::new)
         .N(10, class09257.class, class09257::new)
         .N(11, class09290.class, class09290::new)
         .N(12, class09296.class, class09296::new)
         .N(13, class09274.class, class09274::new)
         .N(14, class09283.class, class09283::new)
         .N(15, class09256.class, class09256::new);
      class11977 var87 = var69.N(class11964.SERVER_TO_CLIENT, var86.N(16, class09299.class, class09299::new, 16));
      class11943 var105 = new class11943<class09276>()
         .N(0, class11958.class, class11958::new)
         .N(1, class11986.class, class11986::new)
         .N(2, class11975.class, class11975::new)
         .N(3, class11974.class, class11974::new)
         .N(4, class11978.class, class11978::new)
         .N(5, class11984.class, class11984::new)
         .N(6, class11945.class, class11945::new)
         .N(7, class11968.class, class11968::new)
         .N(8, class11987.class, class11987::new)
         .N(9, class11983.class, class11983::new)
         .N(10, class11953.class, class11953::new)
         .N(11, class11955.class, class11955::new)
         .N(12, class11971.class, class11971::new)
         .N(13, class11963.class, class11963::new)
         .N(14, class11967.class, class11967::new)
         .N(15, class11948.class, class11948::new)
         .N(16, class11957.class, class11957::new);
      PLAY = new class11959(var87.N(class11964.CLIENT_TO_SERVER, var105.N(17, class11947.class, class11947::new, 16)));
      class11959[] var106 = values();
      var106[0]
         .fields_0045a7f96127f3825b996192bc44fb844_0
         .forEach(
            (var1, var2) -> var2.N()
                  .forEach(
                     var1x -> {
                        if (staticFields_0045a7f96127f3825b996192bc44fb844_4.containsKey(var1x)
                           && staticFields_0045a7f96127f3825b996192bc44fb844_4.get(var1x) != var0) {
                           throw new IllegalStateException(
                              "Packet "
                                 + var1x
                                 + " is already assigned to protocol "
                                 + staticFields_0045a7f96127f3825b996192bc44fb844_4.get(var1x)
                                 + " - can't reassign to "
                                 + var0
                           );
                        } else {
                           staticFields_0045a7f96127f3825b996192bc44fb844_4.put(var1x, var0);
                        }
                     }
                  )
         );
      var106[1]
         .fields_0045a7f96127f3825b996192bc44fb844_0
         .forEach(
            (var1, var2) -> var2.N()
                  .forEach(
                     var1x -> {
                        if (staticFields_0045a7f96127f3825b996192bc44fb844_4.containsKey(var1x)
                           && staticFields_0045a7f96127f3825b996192bc44fb844_4.get(var1x) != var0) {
                           throw new IllegalStateException(
                              "Packet "
                                 + var1x
                                 + " is already assigned to protocol "
                                 + staticFields_0045a7f96127f3825b996192bc44fb844_4.get(var1x)
                                 + " - can't reassign to "
                                 + var0
                           );
                        } else {
                           staticFields_0045a7f96127f3825b996192bc44fb844_4.put(var1x, var0);
                        }
                     }
                  )
         );
   }

   public Integer N(class11964 var1, class11951<?> var2) {
      return ((class11943)this.fields_0045a7f96127f3825b996192bc44fb844_0.get(var1)).N(var2.getClass());
   }

   public boolean N(class11964 var1, class11951<?> var2, int var3) {
      return ((class11943)this.fields_0045a7f96127f3825b996192bc44fb844_0.get(var1)).N(var2.getClass(), var3);
   }

   public static class11959 N(class11951<?> var0) {
      return (class11959)staticFields_0045a7f96127f3825b996192bc44fb844_4.get(var0.getClass());
   }

   private static void N() {
   }

   public class11951<?> N(class11964 var1, int var2, int var3) {
      return ((class11943)this.fields_0045a7f96127f3825b996192bc44fb844_0.get(var1)).N(var2, var3);
   }

   private void R() {
   }
}
