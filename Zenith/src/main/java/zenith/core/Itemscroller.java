package zenith;

import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;

@ModuleInfo(
   name = "ItemScroller",
   description = "Перемещение преметов без задержки",
   category = Category.MISC
)
public final class Itemscroller extends Module {
   public static final Itemscroller IIIIlI1Il1llIl1I1ll1llI1l = new Itemscroller();
   private final NumberSetting IIII1I1I1IllllIIlIlIII11 = new NumberSetting(
      "module.itemScroller.scrollerSetting", 100.0F, 0.0F, 200.0F, 10.0F, "module.itemScroller.scrollerSetting.desc", "ms"
   );
   private final TimerUtil l1lllllII11I1I1III1II = new TimerUtil();

   private Itemscroller() {
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_28 liilll1lii1lil1iiii1ii1i) {
      Slot Slot = liilll1lii1lil1iiii1ii1i.Entityesp();
      SlotActionType SlotActionType = ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.options.dropKey.getDefaultKey())
         ? SlotActionType.THROW
         : (ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.options.attackKey.getDefaultKey()) ? SlotActionType.QUICK_MOVE : null);
      if (this.l111ll11I1I1I()
         && ZenithClient.getInstance().ModuleHolder().floatHolder_8()
         && !this.II1llIl1I1Il1lII1I11()
         && Slot != null
         && Slot.hasStack()
         && SlotActionType != null
         && this.l1lllllII11I1I1III1II.ZenithInternal042((double)this.IIII1I1I1IllllIIlIlIII11.lll1lI1llll1IIllIIIII1lll())) {
         GetSlotIdHandler ill1i11lii11111li1ii1l = new GetSlotIdHandler(
            l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId, Slot.id, SlotActionType.equals(SlotActionType.THROW) ? 1 : 0, SlotActionType
         );
         EventBus.StringHolder_8((Event)ill1i11lii11111li1ii1l);
         if (!ill1i11lii11111li1ii1l.Event()) {
            l11I1I1ll1Illll1I1l1111l1II.interactionManager
               .clickSlot(
                  l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId,
                  Slot.id,
                  SlotActionType.equals(SlotActionType.THROW) ? 1 : 0,
                  SlotActionType,
                  l11I1I1ll1Illll1I1l1111l1II.player
               );
         }
      }
   }

   @EventTarget
   public void StringHolder_8(GetSlotIdHandler ill1i11lii11111li1ii1l) {
      int i = ill1i11lii11111li1ii1l.getSlotId();
      if (i >= 0 && i <= l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots.size()) {
         Slot Slot = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getSlot(i);
         Item Item = Slot.getStack().getItem();
         if (Item != null
            && ZenithClient.getInstance().ModuleHolder().floatHolder_8()
            && l11I1I1ll1Illll1I1l1111l1II.currentScreen != null
            && this.II1llIl1I1Il1lII1I11()
            && ill1i11lii11111li1ii1l.Shulkerjump() != SlotActionType.THROW
            && ill1i11lii11111li1ii1l.Shulkerjump() != SlotActionType.SWAP
            && this.l1lllllII11I1I1III1II.ZenithInternal042(100.0)) {
            ListHolder_5.lIll11III1IllI()
               .filter(Slot -> Slotx.getStack().getItem().equals(Item) && Slotx.inventory.equals(Slot.inventory))
               .forEach(
                  Slot -> {
                     GetSlotIdHandler ill1i11lii11111li1ii1l2 = new GetSlotIdHandler(
                        l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId, Slotx.id, 1, ill1i11lii11111li1ii1l.Shulkerjump()
                     );
                     EventBus.StringHolder_8((Event)ill1i11lii11111li1ii1l2);
                     if (!ill1i11lii11111li1ii1l2.Event()) {
                        l11I1I1ll1Illll1I1l1111l1II.interactionManager
                           .clickSlot(
                              l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId,
                              Slotx.id,
                              1,
                              ill1i11lii11111li1ii1l.Shulkerjump(),
                              l11I1I1ll1Illll1I1l1111l1II.player
                           );
                     }
                  }
               );
         }
      }
   }

   private boolean l111ll11I1I1I() {
      return ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.options.sneakKey.getDefaultKey());
   }

   private boolean II1llIl1I1Il1lII1I11() {
      return ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.options.sprintKey.getDefaultKey());
   }
}
