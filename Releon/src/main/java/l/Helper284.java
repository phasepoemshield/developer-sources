package l;

import java.util.Stack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;

public class Helper284 {
   private static final Helper284 INSTANCE = new Helper284();
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private final Stack<Screen> screenStack = new Stack<>();
   private boolean isRestoring = false;
   private boolean expectingContainer = false;

   private Helper284() {
   }

   public static Helper284 method2781() {
      return INSTANCE;
   }

   public void method2782(Screen var1) {
      if (var1 != null && !this.isRestoring) {
         this.screenStack.push(var1);
         this.expectingContainer = true;
      }
   }

   public void method2783(Screen var1) {
      if (mc.currentScreen != null && !this.isRestoring) {
         this.screenStack.push(mc.currentScreen);
      }

      mc.setScreen(var1);
   }

   public void method2784() {
      if (!this.screenStack.isEmpty()) {
         this.isRestoring = true;
         Screen var1 = this.screenStack.pop();
         mc.setScreen(var1);
         this.isRestoring = false;
      } else {
         mc.setScreen(null);
      }
   }

   public boolean method2785() {
      return !this.screenStack.isEmpty();
   }

   public int method2786() {
      return this.screenStack.size();
   }

   public void method2787() {
      this.screenStack.clear();
      this.isRestoring = false;
      this.expectingContainer = false;
   }

   public boolean method2788() {
      return this.isRestoring;
   }

   public boolean method2789() {
      return this.expectingContainer;
   }

   public void method2790(boolean var1) {
      this.expectingContainer = var1;
   }

   public Screen method2791() {
      return this.screenStack.isEmpty() ? null : this.screenStack.peek();
   }
}
