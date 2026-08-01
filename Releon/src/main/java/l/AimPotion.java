package l;

import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class AimPotion extends Helper242 {
   Setting2 slider = new Setting2("Дистанция", "Дистанция наводки").method2086(6.0F).method2078(0.0F, 20.0F);

   public AimPotion() {
      super("AimPotion", "Aim Potion", Helper269.COMBAT);
      this.setup(new Helper264[]{this.slider});
   }

   public static void method4046() {
   }

   public static void method4047() {
   }

   public static boolean method4048() {
      return false;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         ItemStack var2 = mc.player.getMainHandStack();
         if (this.method4049(var2)) {
            Optional var3 = mc.world
               .getEntitiesByClass(LivingEntity.class, mc.player.getBoundingBox().expand(this.slider.method2082()), this::method4051)
               .stream()
               .min(Comparator.comparingDouble(var0 -> mc.player.squaredDistanceTo(var0)));
            if (var3.isEmpty()) {
               return;
            }

            LivingEntity var4 = (LivingEntity)var3.get();
            Helper351.INSTANCE
               .method3502(Helper349.method3469(var4.getEyePos().subtract(mc.player.getEyePos())), Helper334.DEFAULT, Helper153.HIGH_IMPORTANCE_1, this);
         }
      }
   }

   private boolean method4049(ItemStack var1) {
      if (!var1.isOf(Items.SPLASH_POTION)) {
         return false;
      } else {
         String var2 = "Снотворное, Зелье Радиации";
         String var3 = this.method4050(var1.getName().getString());

         for (String var7 : var2.split(",")) {
            String var8 = this.method4050(var7);
            if (!var8.isEmpty() && var3.contains(var8)) {
               return true;
            }
         }

         return false;
      }
   }

   private String method4050(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT).trim();
   }

   private boolean method4051(LivingEntity var1) {
      if (mc.player != null && var1 != null && var1 != mc.player && var1.isAlive()) {
         return var1 instanceof PlayerEntity var2 && Helper309.method3075(var2)
            ? false
            : mc.player.squaredDistanceTo(var1) <= this.slider.method2082() * this.slider.method2082();
      } else {
         return false;
      }
   }

   @Override
   public void deactivate() {
      Helper351.INSTANCE.method3509();
      super.deactivate();
   }
}
