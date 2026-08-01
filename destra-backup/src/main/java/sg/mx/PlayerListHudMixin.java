package sg.mx;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.destra.core.DestraClient;
import ru.destra.font.FontManager;
import ru.destra.font.FontRenderer;
import ru.destra.module.SocialsModule;
import ru.destra.render.GuiRenderUtil;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(PlayerListHud.class)
public class PlayerListHudMixin {
   private static final float шюЛ;
   private static final String шюИ;
   private static final float шюв;
   private static final float шюю;

   @Redirect(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I")
   )
   public int drawRedirect(DrawContext var1, TextRenderer var2, Text var3, int var4, int var5, int var6) {
      int var7 = var4;
      boolean var8 = false;
      DestraClient var9 = DestraClient.getInstance();
      if (var9 != null && var9.getModuleManager() != null) {
         if (var9.getModuleManager().socials.Д()) {
            SocialsModule var10 = var9.getModuleManager().socials;
            String var11 = this.extractCleanNickname(Formatting.strip(var3.getString()));
            if (!var11.isEmpty() && var10.socialsConnection.isUserOnline(var11)) {
               var8 = true;
               var7 += 10;
            }
         }

         int var12 = var1.drawTextWithShadow(var2, var3, var7, var5, var6);
         if (var8) {
            var1.getMatrices().push();
            var1.getMatrices().translate(0.0F, 0.0F, шюЛ);
            GuiRenderUtil.drawTextWithScale(var1, (FontRenderer)FontManager.destraFont.get(), шюИ, var4, var5, -1, шюв, шюю);
            var1.getMatrices().pop();
         }

         return var12;
      } else {
         return var1.drawTextWithShadow(var2, var3, var4, var5, var6);
      }
   }

   private String extractCleanNickname(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         String var2 = var1.trim();
         StringBuilder var3 = new StringBuilder(16);
         StringBuilder var4 = new StringBuilder(16);

         for (int var5 = 0; var5 < var2.length(); var5++) {
            char var6 = var2.charAt(var5);
            if (Character.isLetterOrDigit(var6) || var6 == '_') {
               var4.append(var6);
            } else if (var4.length() > 0) {
               if (var4.length() > var3.length() && this.containsLetter(var4)) {
                  var3.setLength(0);
                  var3.append(var4);
               }

               var4.setLength(0);
            }
         }

         if (var4.length() > 0 && var4.length() > var3.length() && this.containsLetter(var4)) {
            var3.setLength(0);
            var3.append(var4);
         }

         return var3.toString();
      } else {
         return "";
      }
   }

   private boolean containsLetter(CharSequence var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         if (Character.isLetter(var1.charAt(var2))) {
            return true;
         }
      }

      return false;
   }

   static {
      VMBridge.identifyClass(PlayerListHudMixin.class, "k94f2GF6");
   }
}
