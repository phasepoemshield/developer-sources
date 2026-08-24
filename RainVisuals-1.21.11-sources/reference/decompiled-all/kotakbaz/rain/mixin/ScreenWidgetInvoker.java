package kotakbaz.rain.mixin;

import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

// $VF: Compiled from ScreenWidgetInvoker.java
@Mixin(Screen.class)
public interface ScreenWidgetInvoker {
   @Invoker("method_37066")
   void rain$invokeRemoveWidget(Element var1);
}
