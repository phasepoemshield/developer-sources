package Nursultan;

public enum class09759 {
   LINEAR,
   EASE,
   EASE_IN,
   EASE_OUT,
   EASE_IN_OUT,
   EASE_OUT_QUINT,
   STEP_START,
   STEP_END;

   public float N(float var1) {
      float var2 = class09693.N(var1);

      return switch (this) {
         case LINEAR -> var2;
         case EASE -> var2 * var2 * (3.0F - 2.0F * var2);
         case EASE_IN -> var2 * var2;
         case EASE_OUT -> 1.0F - (1.0F - var2) * (1.0F - var2);
         case EASE_IN_OUT -> var2 < 0.5F ? 2.0F * var2 * var2 : 1.0F - 2.0F * (1.0F - var2) * (1.0F - var2);
         case EASE_OUT_QUINT -> {
            float var3 = 1.0F - var2;
            yield 1.0F - var3 * var3 * var3 * var3 * var3;
         }
         case STEP_START -> var2 <= 0.0F ? 0.0F : 1.0F;
         case STEP_END -> var2 < 1.0F ? 0.0F : 1.0F;
      };
   }
}
