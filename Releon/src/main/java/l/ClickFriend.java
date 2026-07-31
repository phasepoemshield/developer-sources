package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;

public class ClickFriend extends Helper242 {
   private final Setting9 friendBind = new Setting9("Добавить друга", "Добавить/удалить друга");

   public ClickFriend() {
      super("ClickFriend", "Click Friend", Helper269.MISC);
      this.setup(new Helper264[]{this.friendBind});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void method3667(Event17 var1) {
      if (var1.method3903(this.friendBind.getKey()) && mc.crosshairTarget instanceof EntityHitResult var2 && var2.getEntity() instanceof PlayerEntity var3) {
         if (Helper309.method3075(var3)) {
            Helper309.method3073(var3);
         } else {
            Helper309.method3071(var3);
         }
      }
   }
}
