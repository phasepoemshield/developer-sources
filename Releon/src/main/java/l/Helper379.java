package l;

import net.minecraft.util.PlayerInput;

public class Helper379 extends Event3 {
   private PlayerInput input;

   public void method3760(boolean var1) {
      this.input = new PlayerInput(
         this.input.forward(), this.input.backward(), this.input.left(), this.input.right(), var1, this.input.sneak(), this.input.sprint()
      );
   }

   public void method3761(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.input = new PlayerInput(var1, var2, var3, var4, this.input.jump(), this.input.sneak(), this.input.sprint());
   }

   public void method3762(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.input = new PlayerInput(var1, var2, var3, var4, var7, var5, var6);
   }

   public void method3763(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.input = new PlayerInput(var1, var2, var3, var4, this.input.jump(), this.input.sneak(), this.input.sprint());
   }

   public void method3764(boolean var1) {
      this.input = new PlayerInput(
         this.input.forward(), this.input.backward(), this.input.left(), this.input.right(), this.input.jump(), var1, this.input.sprint()
      );
   }

   public void method3765(boolean var1) {
      this.input = new PlayerInput(
         this.input.forward(), this.input.backward(), this.input.left(), this.input.right(), this.input.jump(), this.input.sneak(), var1
      );
   }

   public void method3766() {
      this.input = new PlayerInput(false, false, false, false, false, false, false);
   }

   public int method3767() {
      return this.input.forward() ? 1 : (this.input.backward() ? -1 : 0);
   }

   public float method3768() {
      return this.input.left() ? 1.0F : (this.input.right() ? -1.0F : 0.0F);
   }

   public float method3769() {
      return this.input.forward() ? 1.0F : (this.input.backward() ? -1.0F : 0.0F);
   }

   public float method3770() {
      return this.input.left() ? 1.0F : (this.input.right() ? -1.0F : 0.0F);
   }

   public boolean method3771() {
      return this.input.jump();
   }

   public boolean method3772() {
      return this.input.sneak();
   }

   public void method3773(float var1) {
      boolean var2 = var1 > 0.0F;
      boolean var3 = var1 < 0.0F;
      this.input = new PlayerInput(var2, var3, this.input.left(), this.input.right(), this.input.jump(), this.input.sneak(), this.input.sprint());
   }

   public void method3774(float var1) {
      boolean var2 = var1 > 0.0F;
      boolean var3 = var1 < 0.0F;
      this.input = new PlayerInput(this.input.forward(), this.input.backward(), var2, var3, this.input.jump(), this.input.sneak(), this.input.sprint());
   }

   public void method3775(boolean var1) {
      this.method3760(var1);
   }

   public PlayerInput method3776() {
      return this.input;
   }

   public void method3777(PlayerInput var1) {
      this.input = var1;
   }

   public Helper379(PlayerInput var1) {
      this.input = var1;
   }
}
