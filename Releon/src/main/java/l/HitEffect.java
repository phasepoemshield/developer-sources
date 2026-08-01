package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.math.BlockPos;

public class HitEffect extends Helper242 {
   private final List<Helper213> waveEffects = new ArrayList<>();

   public static HitEffect method1822() {
      return Helper222.method1979(HitEffect.class);
   }

   public HitEffect() {
      super("HitEffect", "Hit Effect", Helper269.RENDER);
   }

   public void method1823(BlockPos var1) {
      if (mc.world != null) {
         this.waveEffects.add(new Helper213(this, var1, System.currentTimeMillis()));
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (!this.waveEffects.isEmpty() && mc.world != null) {
         Iterator var2 = this.waveEffects.iterator();

         while (var2.hasNext()) {
            Helper213 var3 = (Helper213)var2.next();
            if (var3.method1819()) {
               var2.remove();
            } else {
               var3.method1820();
            }
         }
      }
   }
}
