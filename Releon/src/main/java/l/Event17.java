package l;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.InputUtil.Type;

public class Event17 implements Helper41, Helper160 {
   private final Screen screen;
   private final Type type;
   private final int key;
   private final int action;

   public Event17(Screen var1, Type var2, int var3, int var4) {
      this.screen = var1;
      this.type = var2;
      this.key = var3;
      this.action = var4;
   }

   public boolean method3903(int var1) {
      return this.method3904(var1, mc.currentScreen == null);
   }

   public boolean method3904(int var1, boolean var2) {
      return this.key == var1 && this.action == 1 && var2;
   }

   public boolean method3905(int var1) {
      return this.method3906(var1, mc.currentScreen == null);
   }

   public boolean method3906(int var1, boolean var2) {
      return this.key == var1 && this.action == 0 && var2;
   }

   public Screen method3907() {
      return this.screen;
   }

   public Type method3908() {
      return this.type;
   }

   public int method3909() {
      return this.key;
   }

   public int method3910() {
      return this.action;
   }
}
