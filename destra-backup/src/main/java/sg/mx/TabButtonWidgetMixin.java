package sg.mx;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.TabButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.animation.AnimationValue;
import ru.destra.animation.EasingType;
import ru.destra.gui.GuiDrawHelper;
import ru.destra.gui.ScreenManager;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(TabButtonWidget.class)
public abstract class TabButtonWidgetMixin extends ClickableWidget {
   @Unique
   private final AnimationValue destra$hoverAnimation;
   private static final long гТ;

   protected TabButtonWidgetMixin(int var1, int var2, int var3, int var4, Text var5) {
      super(var1, var2, var3, var4, var5);
      this.destra$hoverAnimation = new AnimationValue(EasingType.LINEAR, гТ);
   }

   @Shadow
   public abstract boolean isCurrentTab();

   @Inject(method = "renderWidget", at = @At("HEAD"), cancellable = true)
   private void destra$renderStyledTabButton(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (ScreenManager.isCurrentScreenManaged()) {
         this.destra$hoverAnimation.animateTo(this.active && this.isHovered() ? 1.0 : 0.0);
         GuiDrawHelper.м(
            var1,
            this.getX(),
            this.getY(),
            this.getWidth(),
            this.getHeight(),
            this.getMessage().getString(),
            this.isCurrentTab(),
            (float)this.destra$hoverAnimation.currentValue,
            this.active,
            this.alpha
         );
         var5.cancel();
      }
   }

   static {
      VMBridge.identifyClass(TabButtonWidgetMixin.class, "ZGi36yAp");
   }
}
