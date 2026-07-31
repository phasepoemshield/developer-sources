package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Stack;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class Helper140 implements Helper160 {
   private final Helper97<Helper139> scissorPool = new Helper97<Helper139>(Helper139::new);
   private final Stack<Helper139> scissorStack = new Stack<>();

   public Helper140() {
   }

   public void method1209(Matrix4f var1, float var2, float var3, float var4, float var5) {
      Helper139 var6 = this.scissorPool.method909();
      Vector3f var7 = var1.transformPosition(var2, var3, 0.0F, new Vector3f());
      Vector3f var8 = var1.getScale(new Vector3f()).mul(var4, var5, 0.0F);
      var6.method1206(var7.x, var7.y, var8.x, var8.y);
      if (!this.scissorStack.isEmpty()) {
         Helper139 var9 = this.scissorStack.peek();
         var6.method1207(var9);
      }

      this.scissorStack.push(var6);
      this.method1211(var6);
   }

   public void method1210() {
      if (!this.scissorStack.isEmpty()) {
         this.scissorPool.method910(this.scissorStack.pop());
         if (this.scissorStack.isEmpty()) {
            RenderSystem.disableScissor();
         } else {
            this.method1211(this.scissorStack.peek());
         }
      }
   }

   private void method1211(Helper139 var1) {
      int var2 = (int)window.getScaleFactor();
      int var3 = var1.x * var2;
      int var4 = window.getHeight() - (var1.y * var2 + var1.height * var2);
      int var5 = var1.width * var2;
      int var6 = var1.height * var2;
      RenderSystem.enableScissor(var3, var4, var5, var6);
   }
}
