package Nursultan;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseRelease;

public class class09676 implements ClientModInitializer {
   public void onInitializeClient() {
      class09678.N();
      ScreenEvents.BEFORE_INIT.register((BeforeInit)(var0, var1, var2, var3) -> {
         ScreenMouseEvents.allowMouseClick(var1).register((AllowMouseClick)(var1x, var2x) -> {
            class09690 var3x = class09690.N(var2x.v());
            return var3x != null ? !class09678.N(var1, var2x.n(), var2x.t(), var3x) : true;
         });
         ScreenMouseEvents.allowMouseRelease(var1).register((AllowMouseRelease)(var1x, var2x) -> {
            class09690 var3x = class09690.N(var2x.v());
            return var3x != null ? !class09678.y(var1, var2x.n(), var2x.t(), var3x) : true;
         });
         ScreenMouseEvents.afterMouseScroll(var1).register((AfterMouseScroll)(var1x, var2x, var4, var6, var8, var10) -> class09678.N(var1, var2x, var4, var8));
      });
   }
}
