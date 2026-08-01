package zenith;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.client.network.AbstractClientPlayerEntity;

public class EventImpl_23 implements Event {
   private AbstractClientPlayerEntity lllIl1Ill1lll1llllIlII;
   private ItemStack ll1I11lIl1lI1lll1;
   private Hand IlI1IlI1lIIlll1;

   public AbstractClientPlayerEntity Jumpcircle() {
      return this.lllIl1Ill1lll1llllIlII;
   }

   public ItemStack Killeffect() {
      return this.ll1I11lIl1lI1lll1;
   }

   public Hand Menu() {
      return this.IlI1IlI1lIIlll1;
   }

   public void StringHolder_8(AbstractClientPlayerEntity AbstractClientPlayerEntity) {
      this.lllIl1Ill1lll1llllIlII = AbstractClientPlayerEntity;
   }

   public void ZenithInternal095(ItemStack ItemStack) {
      this.ll1I11lIl1lI1lll1 = ItemStack;
   }

   public void StringHolder_8(Hand Hand) {
      this.IlI1IlI1lIIlll1 = Hand;
   }

   public EventImpl_23(AbstractClientPlayerEntity AbstractClientPlayerEntity, ItemStack ItemStack, Hand Hand) {
      this.lllIl1Ill1lll1llllIlII = AbstractClientPlayerEntity;
      this.ll1I11lIl1lI1lll1 = ItemStack;
      this.IlI1IlI1lIIlll1 = Hand;
   }
}
