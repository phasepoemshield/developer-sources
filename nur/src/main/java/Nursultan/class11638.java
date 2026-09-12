package Nursultan;

import java.util.function.UnaryOperator;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11638 implements class09785<Vector2f> {
   public Object N_0;
   public Object N_1;

   public class11638(class09785 var1, Vector2f var2) {
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   @Override
   public void y() {
      ((class09785)this.N_0).y();
   }

   @Override
   public void N(UnaryOperator<Vector2f> var1) {
      this.N(var1.apply(this.L()));
   }

   public Vector2f L() {
      Vector4f var1 = (Vector4f)((class09785)this.N_0).L();
      return var1 == null ? null : ((Vector2f)this.N_1).set(var1.z, var1.w);
   }

   public void N(Vector2f var1) {
      Vector4f var2 = (Vector4f)((class09785)this.N_0).L();
      if (var2 == null) {
         var2 = new Vector4f();
      }

      var2.set(var1.x, var1.y, var1.x, var1.y);
      ((class09785)this.N_0).N(var2);
   }

   private void R() {
   }
}
