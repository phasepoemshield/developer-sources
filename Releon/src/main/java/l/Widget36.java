package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.gui.DrawContext;

public class Widget36 extends Widget35 {
   private final List<Helper296> components = new ArrayList<>();
   private final Widget26 hueComponent;
   private final Widget31 saturationComponent;
   private final Widget38 alphaComponent;
   private final Widget32 colorEditorComponent;
   private final Widget28 colorPresetComponent;

   public Widget36(Setting7 var1) {
      this.components
         .addAll(
            Arrays.asList(
               this.hueComponent = new Widget26(var1),
               this.saturationComponent = new Widget31(var1),
               this.alphaComponent = new Widget38(var1),
               this.colorEditorComponent = new Widget32(var1),
               this.colorPresetComponent = new Widget28(var1)
            )
         );
   }

   @Override
   public void method284(DrawContext var1, int var2, int var3, float var4) {
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.x, this.y + 10.0F, this.width, this.height - 10.0F)
            .method826(6.0F)
            .method835(2.0F)
            .method834(1.0F)
            .method839(Helper133.method1167())
            .method823(Helper133.method1154())
            .method840()
      );
      this.alphaComponent.method294(this.x, this.y);
      this.hueComponent.method294(this.x, this.y);
      this.saturationComponent.method294(this.x, this.y);
      this.colorEditorComponent.method294(this.x, this.y);
      this.height = ((Widget28)this.colorPresetComponent.method294(this.x, this.y)).method3967() - 40.0F;
      this.components.forEach(var4x -> var4x.method246(var1, var2, var3, var4));
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      this.method4826(Helper147.method1224(var1, var3, this.x, this.y, this.width, 17.0));
      this.components.forEach(var5x -> var5x.method247(var1, var3, var5));
      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      this.components.forEach(var6 -> var6.method249(var1, var3, var5));
      return super.method249(var1, var3, var5);
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      this.components.forEach(var5x -> var5x.method248(var1, var3, var5));
      return super.method248(var1, var3, var5);
   }
}
