package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;

public class Helper392 extends Event3 {
   public Box box;
   public Entity entity;

   public Box getBox() {
      return this.box;
   }

   public Entity method3963() {
      return this.entity;
   }

   public void setBox(Box var1) {
      this.box = var1;
   }

   public void method3964(Entity var1) {
      this.entity = var1;
   }

   public Helper392(Box var1, Entity var2) {
      this.box = var1;
      this.entity = var2;
   }
}
