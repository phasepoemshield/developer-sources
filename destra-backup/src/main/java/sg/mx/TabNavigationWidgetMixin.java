package sg.mx;

import java.util.function.Function;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.TabNavigationWidget;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ru.destra.gui.ScreenManager;

@Mixin(TabNavigationWidget.class)
public abstract class TabNavigationWidgetMixin {
   @Redirect(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTexture(Ljava/util/function/Function;Lnet/minecraft/util/Identifier;IIFFIIII)V")
   )
   private void destra$skipVanillaTabSeparators(
      DrawContext var1,
      Function<Identifier, RenderLayer> var2,
      Identifier var3,
      int var4,
      int var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      int var11
   ) {
      if (!ScreenManager.isCurrentScreenManaged()) {
         var1.drawTexture(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }
}
