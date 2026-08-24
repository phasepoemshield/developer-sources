package kotakbaz.rain.mixin;

import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from GameMenuScreenAccessor.java
@Mixin(GameMenuScreen.class)
public interface GameMenuScreenAccessor {
   @Accessor("field_40792")
   ButtonWidget rain$getExitButton();
}
