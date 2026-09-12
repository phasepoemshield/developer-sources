package Nursultan;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.Value;

public class class11530 {
   private static String[] L;

   private class11530() {
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      N();
   }

   public static void N(MessageBufferPacker var0, class11536<?> var1) throws IOException {
      Objects.requireNonNull(var1);
      switch (var1) {
         case class11507 var4:
            var0.packBoolean(var4.W());
            break;
         case class11504 var5:
            var0.packFloat(var5.W());
            break;
         case class11533 var6:
            var0.packString(var6.W());
            break;
         case class11527 var7:
            var0.packArrayHeader(2);
            var0.packInt(var7.W().L());
            var0.packInt(var7.L());
            break;
         case class11515 var8:
            var0.packInt(var8.W());
            break;
         case class11494 var15:
            var0.packArrayHeader(2);
            var0.packFloat(var15.N());
            var0.packFloat(var15.L());
            break;
         case class11517 var10:
            var0.packString(((class11535)var10.W()).E().N());
            break;
         case List var12:
            var0.packArrayHeader(var12.size());

            for (class11535 var14 : var12) {
               var0.packString(var14.E().N());
            }
            break;
         default:
            var0.packNil();
      }
   }

   private static void N() {
      L = new String[1];
      L[0] = "This is a utility class and cannot be instantiated";
   }

   public static void N(class11536<?> var0, Value var1) {
      Objects.requireNonNull(var0);
      switch (var0) {
         case class11507 var20:
            ((class11507)var0).N(Boolean.valueOf(var1.asBooleanValue().getBoolean()));
            break;
         case class11504 var21:
            ((class11504)var0).N(var1.asFloatValue().toFloat());
            break;
         case class11533 var22:
            ((class11533)var0).N(var1.asStringValue().asString());
            break;
         case class11527 var7:
            if (var1.isArrayValue()) {
               ArrayValue var15 = var1.asArrayValue();
               var7.N(class12002.y(var15.get(0).asIntegerValue().asInt()), var15.get(1).asIntegerValue().asInt());
            } else {
               var7.N(class12002.y(var1.asIntegerValue().asInt()), 0);
            }
            break;
         case class11515 var8:
            var8.N(Integer.valueOf(var1.asIntegerValue().asInt()));
            break;
         case class11525 var9:
            ArrayValue var16 = var1.asArrayValue();
            float var18 = var16.get(0).asFloatValue().toFloat();
            float var19 = var16.get(1).asFloatValue().toFloat();
            var9.N(new class11494(var18, var19));
            break;
         case class11517 var10:
            String var17 = var1.asStringValue().asString();
            var10.L().stream().filter(var1x -> var1x.E().N().equals(var17)).findFirst().ifPresent(var1x -> var10.y(var1x));
            break;
         case class11523 var11:
            HashSet var12 = new HashSet();

            for (Value var14 : var1.asArrayValue()) {
               var12.add(var14.asStringValue().asString());
            }

            var11.L().forEach(var2 -> var11.N(var2, var12.contains(var2.E().N())));
            return;
      }
   }
}
