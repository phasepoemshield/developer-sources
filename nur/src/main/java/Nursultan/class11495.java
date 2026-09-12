package Nursultan;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;

public class class11495 extends class11490<class09250> {
   public static Object N_0;
   public static Object N_1;

   public Object L(class09250 var1) {
      return var1.R();
   }

   public class11495(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      B();
   }

   private static void B() {
      N_0 = 0;
      N_1 = 1;
   }

   public class09250 N(int var1, ArrayValue var2) {
      if (var2.get(0).asIntegerValue().asInt() == 0) {
         String var11 = var2.get(1).asStringValue().asString();
         long var12 = var2.get(2).asIntegerValue().asLong();
         boolean var13 = var2.get(3).asBooleanValue().getBoolean();
         boolean var14 = var2.get(4).asBooleanValue().getBoolean();
         UUID var15 = var14 ? new UUID(var2.get(5).asIntegerValue().asLong(), var2.get(6).asIntegerValue().asLong()) : null;
         boolean var16 = var2.get(7).asBooleanValue().getBoolean();
         return new class09250(new class11991(var11, var15, var13), var16, var12);
      } else {
         String var4 = var2.get(1).asStringValue().asString();
         long var5 = var2.get(2).asIntegerValue().asLong();
         UUID var7 = new UUID(var2.get(3).asIntegerValue().asLong(), var2.get(4).asIntegerValue().asLong());
         boolean var8 = var2.get(5).asBooleanValue().getBoolean();
         byte[] var9 = var2.get(6).asBinaryValue().asByteArray();
         boolean var10 = var2.get(7).asBooleanValue().getBoolean();
         return new class09250(new class11166(var8, var7, var4, var9), var10, var5);
      }
   }

   public void y(class09250 var1) {
      class11938.s().y(var1);
   }

   public void N(MessageBufferPacker var1, class09250 var2) throws IOException {
      class11776 var3 = var2.i();
      if (var3 instanceof class11991 var6) {
         UUID var7 = var6.i();
         var1.packArrayHeader(8);
         var1.packInt(0);
         var1.packString(var6.u());
         var1.packLong(var2.M());
         var1.packBoolean(var6.R());
         var1.packBoolean(var7 != null);
         var1.packLong(var7 != null ? var7.getMostSignificantBits() : 0L);
         var1.packLong(var7 != null ? var7.getLeastSignificantBits() : 0L);
         var1.packBoolean(var2.y());
      } else {
         class11166 var4 = (class11166)var3;
         byte[] var5 = var4.R();
         var1.packArrayHeader(8);
         var1.packInt(1);
         var1.packString(var4.u());
         var1.packLong(var2.M());
         var1.packLong(var4.y().getMostSignificantBits());
         var1.packLong(var4.y().getLeastSignificantBits());
         var1.packBoolean(var4.i());
         var1.packBinaryHeader(var5.length);
         var1.writePayload(var5);
         var1.packBoolean(var2.y());
      }
   }

   public void N(class09250 var1) {
      class11938.s().N(var1);
   }

   public boolean N(class09250 var1, class09250 var2) {
      return var1.L() == var2.L() && var1.u().equals(var2.u()) && var1.M() == var2.M() && var1.y() == var2.y();
   }

   @Override
   public List<class09250> N() {
      return class11938.s().u();
   }
}
