package l;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class NoPush extends Helper242 {
   private final Setting8 ignoreSetting = new Setting8("Игнорировать", "Разрешает выбранные вами действия")
      .method2585("Water", "Block", "Entity", "World Border", "Powder Snow", "Berry");

   public NoPush() {
      super("NoPush", "Anti Push", Helper269.PLAYER);
      this.setup(new Helper264[]{this.ignoreSetting});
   }

   @Helper104
   public void method2076(Helper369 var1) {
      switch (var1.method3645()) {
         case COLLISION:
            var1.method1613(this.ignoreSetting.method2588("Entity"));
            break;
         case WATER:
            var1.method1613(this.ignoreSetting.method2588("Water"));
            break;
         case BLOCK:
            var1.method1613(this.ignoreSetting.method2588("Block"));
            break;
         case WORLD_BORDER:
            var1.method1613(this.ignoreSetting.method2588("World Border"));
      }
   }

   @Helper104
   public void method2077(Helper388 var1) {
      Block var2 = var1.method3912();
      if (var2.equals(Blocks.POWDER_SNOW)) {
         var1.method1613(this.ignoreSetting.method2588("Powder Snow"));
      } else if (var2.equals(Blocks.SWEET_BERRY_BUSH)) {
         var1.method1613(this.ignoreSetting.method2588("Berry"));
      }
   }
}
