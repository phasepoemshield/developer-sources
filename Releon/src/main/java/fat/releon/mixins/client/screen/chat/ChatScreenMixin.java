package fat.releon.mixins.client.screen.chat;

import fat.releon.Releon;
import java.util.Collections;
import java.util.List;
import l.Helper119;
import l.Helper160;
import l.Hud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ChatScreen.class})
public class ChatScreenMixin extends Screen implements Helper160 {
   @Unique
   private static List<Helper119> draggables() {
      Releon var0 = Releon.method71();
      if (var0 != null && var0.method26() != null) {
         List<Helper119> var1 = var0.method26().method788();
         return var1 == null ? Collections.emptyList() : var1;
      } else {
         return Collections.emptyList();
      }
   }

   protected ChatScreenMixin() {
      super(Text.empty());
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void onRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      Hud var6 = Hud.method1824();
      List<Helper119> var7 = draggables();
      var7.stream()
         .filter(var1x -> var1x.method971(var6, var1x) && var1x.method985())
         .reduce((var0, var1x) -> var1x)
         .ifPresent(var5x -> var7.forEach(var5xx -> {
            if (var5x == var5xx) {
               var5xx.method555(var1, var2, var3, var4);
            }
         }));
   }

   @Inject(
      method = {"mouseClicked"},
      at = {@At("TAIL")}
   )
   private void onMouseClicked(double var1, double var3, int var5, CallbackInfoReturnable<Boolean> var6) {
      List<Helper119> var7 = draggables();
      var7.forEach(var5x -> var5x.method557(var1, var3, var5));
   }

   @Override
   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      List<Helper119> var6 = draggables();
      var6.forEach(var5 -> var5.method558(mouseX, mouseY, button));
      return super.mouseReleased(mouseX, mouseY, button);
   }
}
