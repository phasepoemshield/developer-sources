package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.CyclingButtonWidget;
import net.minecraft.client.gui.widget.LockButtonWidget;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.animation.AnimationValue;
import ru.destra.animation.EasingType;
import ru.destra.core.DestraClient;
import ru.destra.gui.GuiDrawHelper;
import ru.destra.gui.ScreenManager;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(PressableWidget.class)
public abstract class PressableWidgetMixin extends ClickableWidget {
   @Unique
   private AnimationValue destra$hoverAnimation;

   protected PressableWidgetMixin(int var1, int var2, int var3, int var4, Text var5) {
      super(var1, var2, var3, var4, var5);
      this.destra$hoverAnimation = new AnimationValue(EasingType.LINEAR, 250L);
   }

   @Inject(method = "renderWidget", at = @At("HEAD"), cancellable = true)
   private void destra$renderCustomButton(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.destra$hoverAnimation == null) {
         this.destra$hoverAnimation = new AnimationValue(EasingType.LINEAR, 250L);
      }
      if (DestraClient.getInstance() != null && DestraClient.getInstance().getTheme2DManager() != null) {
         PressableWidgetMixin var6 = this;
         if (var6 instanceof ButtonWidget || var6 instanceof CyclingButtonWidget) {
            if (!(var6 instanceof LockButtonWidget)) {
               MinecraftClient var7 = MinecraftClient.getInstance();
               if (var7 != null && var7.currentScreen != null) {
                  if (ScreenManager.isCurrentScreenManaged()) {
                     this.destra$hoverAnimation.animateTo(this.active && this.isHovered() ? 1.0 : 0.0);
                     GuiDrawHelper.м(
                        var1,
                        this.getX(),
                        this.getY(),
                        this.getWidth(),
                        this.getHeight(),
                        this.getMessage().getString(),
                        (float)this.destra$hoverAnimation.currentValue,
                        this.active,
                        this.alpha
                     );
                     var5.cancel();
                  }
               }
            }
         }
      }
   }

   static {
      VMBridge.identifyClass(PressableWidgetMixin.class, "F5GEVutK");
   }
}
