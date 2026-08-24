package kotakbaz.rain.mixin;

import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// $VF: Compiled from TextFieldWidgetAccessor.java
@Mixin(TextFieldWidget.class)
public interface TextFieldWidgetAccessor {
   @Accessor("field_2103")
   int rain$getFirstCharacterIndex();
}
