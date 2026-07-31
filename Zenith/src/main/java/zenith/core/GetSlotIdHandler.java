package zenith;

import net.minecraft.screen.slot.SlotActionType;

public class GetSlotIdHandler extends EventImpl_21 {
   private int ll1Ill11IIlIIl1Il111I1II;
   private int slotId;
   private int IIlIlIIIIlIII11lllI1IllIll1lII;
   private SlotActionType Il111IllIIlIIIIIlIIl1Il;

   public int Noweb() {
      return this.ll1Ill11IIlIIl1Il111I1II;
   }

   public int getSlotId() {
      return this.slotId;
   }

   public int Elytratarget() {
      return this.IIlIlIIIIlIII11lllI1IllIll1lII;
   }

   public SlotActionType Shulkerjump() {
      return this.Il111IllIIlIIIIIlIIl1Il;
   }

   public void ZenithInternal070(int i) {
      this.ll1Ill11IIlIIl1Il111I1II = i;
   }

   public void setSlotId(int i) {
      this.slotId = i;
   }

   public void longHolder_6(int i) {
      this.IIlIlIIIIlIII11lllI1IllIll1lII = i;
   }

   public void StringHolder_8(SlotActionType SlotActionType) {
      this.Il111IllIIlIIIIIlIIl1Il = SlotActionType;
   }

   public GetSlotIdHandler(int i, int j, int k, SlotActionType SlotActionType) {
      this.ll1Ill11IIlIIl1Il111I1II = i;
      this.slotId = j;
      this.IIlIlIIIIlIII11lllI1IllIll1lII = k;
      this.Il111IllIIlIIIIIlIIl1Il = SlotActionType;
   }
}
