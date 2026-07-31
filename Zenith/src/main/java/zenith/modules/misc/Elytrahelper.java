// Module: ElytraHelper
// Category: misc
// Original class: Elytrahelper
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.Hand;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Items;

@ModuleInfo(
   name = "ElytraHelper",
   description = "Помощник для элитр",
   category = Category.MISC
)
public final class Elytrahelper extends Module {
   public static final Elytrahelper lIIIlIlllII1I1Il1I1IlI = new Elytrahelper();
   private final BindSetting III1l1llIlll1l1II1Il1l1lIlllI = new BindSetting(
      "module.elytraHelper.elytraSetting", "module.elytraHelper.elytraSetting.desc"
   );
   private final BindSetting llI1111lI1l1IIlllII1I11l1II = new BindSetting(
      "module.elytraHelper.fireworkSetting", "module.elytraHelper.fireworkSetting.desc"
   );
   private final BooleanSetting Il1I11Il11I1IIIlI111IlI1 = new BooleanSetting(
      "module.elytraHelper.startSetting", "module.elytraHelper.startSetting.desc", false
   );
   private final BooleanSetting III1l1llI1lII1IlIl1I1II = new BooleanSetting(
      "module.elytraHelper.sprintSetting", "module.elytraHelper.sprintSetting.desc", false, this.Il1I11Il11I1IIIlI111IlI1::Spider
   );
   private final BooleanSetting IllIIlIll11IIl11ll1I = new BooleanSetting(
      "module.elytraHelper.onlyHotBar", "module.elytraHelper.onlyHotBar.desc", false
   );

   @Override
   public void onEnable() {
      TextHolder.EventImpl_27("Скорость больше с вкл спринтом + надо быть на версии 1.21.1 и ниже но на хв банит");
      super.l11l1lII();
   }

   private Elytrahelper() {
   }

   @EventTarget
   public void EventImpl_24(PlayerInputHolder ili11i1il11) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.isAlive() && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
         if (ZenithClient.getInstance().ModuleHolder().floatHolder_8()
            && this.Il1I11Il11I1IIIlI111IlI1.Spider()
            && Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)) {
            if (l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()) {
               ili11i1il11.ZenithInternal021(true);
            } else if (!l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
               if (this.III1l1llI1lII1IlIl1I1II.Spider()
                  && l11I1I1ll1Illll1I1l1111l1II.player.canSprint()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.horizontalCollision
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isBlind()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
                  && !l11I1I1ll1Illll1I1l1111l1II.player.isSubmergedInWater()) {
                  l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(true);
               }

               ili11i1il11.ZenithInternal021(!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump());
            } else if (l11I1I1ll1Illll1I1l1111l1II.player.isGliding() && l11I1I1ll1Illll1I1l1111l1II.player.horizontalCollision) {
               ili11i1il11.StringHolder_8(
                  new PlayerInput(
                     false,
                     ili11i1il11.Netherwartfarm().backward(),
                     ili11i1il11.Netherwartfarm().left(),
                     ili11i1il11.Netherwartfarm().right(),
                     ili11i1il11.Netherwartfarm().jump(),
                     ili11i1il11.Netherwartfarm().sneak(),
                     ili11i1il11.Netherwartfarm().sprint()
                  )
               );
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (i111liliill1iii1iiii1.StringHolder_5(this.III1l1llIlll1l1II1Il1l1lIlllI.Elytramotion())) {
         this.IIIlIIIll1Ill1Il111l1();
      } else if (i111liliill1iii1iiii1.StringHolder_5(this.llI1111lI1l1IIlllII1I11l1II.Elytramotion())
         && l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
         ListHolder_5.StringHolder_8(Items.FIREWORK_ROCKET, Hand.OFF_HAND);
      }
   }

   public void IIIlIIIll1Ill1Il111l1() {
      Slot Slot = this.l111l1l1I11I1II1II1lIIIl();
      if (Slot != null) {
         ListHolder_5.StringHolder_8(Slot, 6, true, false);
      }
   }

   private Slot l111l1l1I11I1II1II1lIIIl() {
      return Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)
         ? ListHolder_5.StringHolder_8(
            List.of(Items.NETHERITE_CHESTPLATE, Items.DIAMOND_CHESTPLATE, Items.CHAINMAIL_CHESTPLATE, Items.IRON_CHESTPLATE, Items.GOLDEN_CHESTPLATE, Items.LEATHER_CHESTPLATE),
            Comparator.comparingInt(Slot -> Slot.id)
         )
         : ListHolder_5.StringHolder_8(
            l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler,
            Items.ELYTRA,
            Comparator.comparingInt(Slot -> Slot.id),
            Slot -> true
         );
   }

   public boolean II1lIII1I1111Il1ll11I1I1I1l1() {
      return this.IllIIlIll11IIl11ll1I.Spider();
   }
}
