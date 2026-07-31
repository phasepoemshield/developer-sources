package l;

import net.minecraft.client.render.VertexConsumer;

public final class Helper283 {
   private static final ThreadLocal<Helper282> STATE = ThreadLocal.<Helper282>withInitial(Helper282::new);

   private Helper283() {
   }

   public static void method2776(float var0, float var1, float var2, float var3) {
      Helper282 var4 = STATE.get();
      var4.depth++;
      var4.red = method2780(var0);
      var4.green = method2780(var1);
      var4.blue = method2780(var2);
      var4.alpha = method2780(var3);
   }

   public static void method2777() {
      Helper282 var0 = STATE.get();
      if (var0.depth > 0) {
         var0.depth--;
      }

      if (var0.depth <= 0) {
         var0.depth = 0;
         var0.red = 1.0F;
         var0.green = 1.0F;
         var0.blue = 1.0F;
         var0.alpha = 1.0F;
      }
   }

   public static boolean method2778() {
      return STATE.get().depth > 0;
   }

   public static VertexConsumer method2779(VertexConsumer var0) {
      return (VertexConsumer)(method2778() ? new Helper281(var0, STATE.get()) : var0);
   }

   private static float method2780(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }
}
