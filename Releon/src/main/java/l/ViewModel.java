package l;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.CrossbowItem;
import net.minecraft.util.Hand;

public class ViewModel extends Helper242 {
   private final Setting2 mainHandXSetting = new Setting2("Основная рука X", "Настройка значения X для основной руки")
      .method2086(0.0F)
      .method2078(-1.0F, 1.0F);
   private final Setting2 mainHandYSetting = new Setting2("Основная рука Y", "Настройка значения Y для основной руки")
      .method2086(0.0F)
      .method2078(-1.0F, 1.0F);
   private final Setting2 mainHandZSetting = new Setting2("Основная рука Z", "Настройка значения Z для основной руки")
      .method2086(0.0F)
      .method2078(-2.5F, 2.5F);
   private final Setting2 offHandXSetting = new Setting2("Второстепенная рука X", "Настройка значения X для второстепенной руки")
      .method2086(0.0F)
      .method2078(-1.0F, 1.0F);
   private final Setting2 offHandYSetting = new Setting2("Второстепенная рука Y", "Настройка значения Y для второстепенной руки")
      .method2086(0.0F)
      .method2078(-1.0F, 1.0F);
   private final Setting2 offHandZSetting = new Setting2("Второстепенная рука Z", "Настройка значения Z для второстепенной руки")
      .method2086(0.0F)
      .method2078(-2.5F, 2.5F);

   public ViewModel() {
      super("ViewModel", "View Model", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.mainHandXSetting, this.mainHandYSetting, this.mainHandZSetting, this.offHandXSetting, this.offHandYSetting, this.offHandZSetting
         }
      );
   }

   @Helper104
   public void method2371(Event30 var1) {
      Hand var2 = var1.method4630();
      if (!var2.equals(Hand.MAIN_HAND) || !(var1.method4629().getItem() instanceof CrossbowItem)) {
         MatrixStack var3 = var1.method4628();
         if (var2.equals(Hand.MAIN_HAND)) {
            var3.translate(this.mainHandXSetting.method2082(), this.mainHandYSetting.method2082(), this.mainHandZSetting.method2082());
         } else {
            var3.translate(this.offHandXSetting.method2082(), this.offHandYSetting.method2082(), this.offHandZSetting.method2082());
         }
      }
   }
}
