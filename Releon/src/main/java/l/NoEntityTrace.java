package l;

import net.minecraft.item.SwordItem;

public class NoEntityTrace extends Helper242 {
   private final Setting3 noSword = new Setting3("Без меча", "Не работает с мечом в руке").method2201(true);

   public NoEntityTrace() {
      super("NoEntityTrace", "No Entity Trace", Helper269.PLAYER);
      this.setup(new Helper264[]{this.noSword});
   }

   public static NoEntityTrace method2315() {
      return Helper222.method1979(NoEntityTrace.class);
   }

   public boolean method2316() {
      return this.isState() && (!(mc.player.getMainHandStack().getItem() instanceof SwordItem) || !this.noSword.method2200());
   }
}
