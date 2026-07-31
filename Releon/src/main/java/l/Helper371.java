package l;

import net.minecraft.screen.slot.SlotActionType;

public class Helper371 extends Event3 {
   private int windowId;
   private int slotId;
   private int button;
   private SlotActionType actionType;

   public int method3648() {
      return this.windowId;
   }

   public int method3649() {
      return this.slotId;
   }

   public int method3650() {
      return this.button;
   }

   public SlotActionType method3651() {
      return this.actionType;
   }

   public void method3652(int var1) {
      this.windowId = var1;
   }

   public void method3653(int var1) {
      this.slotId = var1;
   }

   public void method3654(int var1) {
      this.button = var1;
   }

   public void method3655(SlotActionType var1) {
      this.actionType = var1;
   }

   public Helper371(int var1, int var2, int var3, SlotActionType var4) {
      this.windowId = var1;
      this.slotId = var2;
      this.button = var3;
      this.actionType = var4;
   }
}
