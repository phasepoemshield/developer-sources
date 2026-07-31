package sg.mx;

import java.util.Map;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import ru.destra.misc.ItemCooldownInventory;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ItemCooldownManager.class)
public abstract class MixinCooldownTracker implements ItemCooldownInventory {
   @Final
   @Shadow
   private Map<Identifier, ?> entries;
   @Shadow
   private int tick;
   private static final float Мя;
   private static final float М6;

   @Shadow
   public abstract Identifier getGroup(ItemStack var1);

   @Unique
   @Override
   public float getCooldownSeconds(Item var1, float var2) {
      Identifier var3 = this.getGroup(var1.getDefaultStack());
      Object var4 = this.entries.get(var3);
      if (var4 == null) {
         return 0.0F;
      } else {
         int var5 = ((CooldownAccessor)var4).getStartTime();
         int var6 = ((CooldownAccessor)var4).getEndTime();
         if (var4 != null) {
            float var7 = Мя;
            float var8 = var6 - (this.tick + var2);
            return MathHelper.clamp(var8 / var7, 0.0F, var6 / М6);
         } else {
            return 0.0F;
         }
      }
   }

   static {
      VMBridge.identifyClass(MixinCooldownTracker.class, "l8Vfs4uh");
   }
}
