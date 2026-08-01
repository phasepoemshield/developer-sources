// Module: AntiBot
// Category: combat
// Original class: Antibot
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "AntiBot",
   category = Category.COMBAT,
   description = ""
)
public final class Antibot extends Module {
   public static final Antibot IlI1ll1l11IlllI111lIlIll111llI = new Antibot();
   private final List<PlayerEntity> I1II1IlI1I1ll1l1I11I1ll1 = new ArrayList<>();
   private final longHolder lllII1l1IlI1l = new longHolder();

   private Antibot() {
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (this.lllII1l1IlI1l.HostnameVerifierImpl(10000L) && !this.I1II1IlI1I1ll1l1I11I1ll1.isEmpty()) {
            this.I1II1IlI1I1ll1l1I11I1ll1.clear();
            this.lllII1l1IlI1l.reset();
         }

         for (PlayerEntity PlayerEntity : l11I1I1ll1Illll1I1l1111l1II.world.getPlayers()) {
            if (PlayerEntity != null
               && PlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
               && this.Event(PlayerEntity)
               && !this.I1II1IlI1I1ll1l1I11I1ll1.contains(PlayerEntity)) {
               this.I1II1IlI1I1ll1l1I11I1ll1.add(PlayerEntity);
            }
         }
      }
   }

   private boolean Event(PlayerEntity PlayerEntity) {
      return this.EventBus(PlayerEntity, 3).getItem() == Items.LEATHER_HELMET
            && this.EventTarget(PlayerEntity, 3)
            && !this.EventBus(PlayerEntity, 3).hasEnchantments()
         || this.EventBus(PlayerEntity, 2).getItem() == Items.LEATHER_CHESTPLATE
            && this.EventTarget(PlayerEntity, 2)
            && !this.EventBus(PlayerEntity, 2).hasEnchantments()
         || this.EventBus(PlayerEntity, 1).getItem() == Items.LEATHER_LEGGINGS
            && this.EventTarget(PlayerEntity, 1)
            && !this.EventBus(PlayerEntity, 1).hasEnchantments()
         || this.EventBus(PlayerEntity, 0).getItem() == Items.LEATHER_BOOTS
            && this.EventTarget(PlayerEntity, 0)
            && !this.EventBus(PlayerEntity, 0).hasEnchantments()
         || this.EventBus(PlayerEntity, 2).getItem() == Items.IRON_CHESTPLATE && !this.EventBus(PlayerEntity, 2).hasEnchantments()
         || this.EventBus(PlayerEntity, 1).getItem() == Items.IRON_LEGGINGS && !this.EventBus(PlayerEntity, 1).hasEnchantments();
   }

   private ItemStack EventBus(PlayerEntity PlayerEntity, int i) {
      return PlayerEntity.getInventory().getArmorStack(i);
   }

   private boolean EventTarget(PlayerEntity PlayerEntity, int i) {
      return !this.EventBus(PlayerEntity, i).contains(DataComponentTypes.DYED_COLOR);
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      if (!this.I1II1IlI1I1ll1l1I11I1ll1.isEmpty()) {
         this.I1II1IlI1I1ll1l1I11I1ll1.clear();
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      if (!this.I1II1IlI1I1ll1l1I11I1ll1.isEmpty()) {
         this.I1II1IlI1I1ll1l1I11I1ll1.clear();
      }
   }

   public boolean EventImpl_24(PlayerEntity PlayerEntity) {
      return this.I1II1IlI1I1ll1l1I11I1ll1.contains(PlayerEntity);
   }
}
