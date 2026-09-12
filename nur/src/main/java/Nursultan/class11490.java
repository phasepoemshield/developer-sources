package Nursultan;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;

public abstract class class11490<T> extends class11488 {
   public static Object y_0 = LogManager.getLogger(String.class);

   public abstract void L(T var1);

   private static void L() {
   }

   private static void M() {
      y_0 = null;
   }

   public class11490(String var1, int var2, class09378 var3) {
      super(var1, var2, var3);
   }

   static {
      L();
      y();
      M();
   }

   public void y(T var1, T var2) {
      this.y((T)var1);
      this.L((T)var2);
   }

   public abstract void y(T var1);

   private static void y() {
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      int var3 = var2.unpackArrayHeader();
      HashMap var4 = new HashMap(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         try {
            ImmutableValue var6 = var2.unpackValue();
            Object var7 = this.N(var1, var6.asArrayValue());
            if (var7 != null) {
               var4.put(this.N((T)var7), var7);
            }
         } catch (Exception var8) {
            ((Logger)y_0).warn("Skipped corrupt record #{} in {}: {}", var5, this.u(), var8.getMessage());
         }
      }

      List var9 = this.N();
      Map var10 = var9.stream().collect(Collectors.toMap(this::N, var0 -> var0, (var0, var1x) -> var1x, () -> new HashMap(var9.size())));
      var9.stream().filter(var2x -> !var4.containsKey(this.N((T)var2x))).forEach(this::y);
      var4.forEach((var2x, var3x) -> {
         Object var4x = var10.get(var2x);
         if (var4x == null) {
            this.L((T)var3x);
         } else if (!this.N((T)var4x, (T)var3x)) {
            this.y((T)var4x, (T)var3x);
         }
      });
   }

   public abstract void N(MessageBufferPacker var1, T var2) throws IOException;

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      List var2 = this.N();
      var1.packArrayHeader(var2.size());

      for (Object var4 : var2) {
         this.N(var1, (T)var4);
      }
   }

   public abstract T N(int var1, ArrayValue var2) throws Exception;

   public abstract Object N(T var1);

   public abstract boolean N(T var1, T var2);

   public abstract List<T> N();

   @Override
   public boolean d_() {
      return this.N().isEmpty();
   }
}
