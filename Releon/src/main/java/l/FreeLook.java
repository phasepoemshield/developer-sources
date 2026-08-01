package l;

import net.minecraft.client.option.Perspective;
import net.minecraft.util.math.MathHelper;

public class FreeLook extends Helper242 {
   private Perspective perspective;
   private Helper336 angle;
   public static Setting9 freeLookSetting = new Setting9("Свободный обзор", "Клавиша для свободного обзора");

   public FreeLook() {
      super("FreeLook", "Free Look", Helper269.RENDER);
      this.setup(new Helper264[]{freeLookSetting});
      this.angle = null;
   }

   @Helper104
   public void method2716(Event17 var1) {
      if (var1.method3903(freeLookSetting.getKey())) {
         this.perspective = mc.options.getPerspective();
         if (this.angle == null) {
            this.angle = Helper349.method3473();
         }
      }
   }

   @Helper104
   public void method2717(Helper437 var1) {
      if (Helper38.method543(freeLookSetting)) {
         if (mc.options.getPerspective().isFirstPerson()) {
            mc.options.setPerspective(Perspective.THIRD_PERSON_BACK);
         }

         if (this.angle == null) {
            this.angle = Helper349.method3473();
         }
      } else if (this.perspective != null) {
         mc.options.setPerspective(this.perspective);
         this.perspective = null;
         this.angle = null;
      }
   }

   @Helper104
   public void method2718(Helper384 var1) {
      if (Helper38.method543(freeLookSetting)) {
         if (this.angle == null) {
            this.angle = Helper349.method3473();
         }

         this.angle.method3335(this.angle.method3333() + var1.method3889() * 0.15F);
         this.angle.method3336(MathHelper.clamp(this.angle.method3334() + var1.method3890() * 0.15F, -90.0F, 90.0F));
         var1.method582();
      } else {
         this.angle = null;
      }
   }

   @Helper104
   public void method2719(Helper378 var1) {
      if (Helper38.method543(freeLookSetting) && this.angle != null) {
         var1.method3743(this.angle);
         var1.method582();
      }
   }
}
