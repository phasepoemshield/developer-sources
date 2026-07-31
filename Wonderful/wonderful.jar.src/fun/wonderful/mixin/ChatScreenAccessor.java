package fun.wonderful.mixin;

import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ChatScreen.class})
public interface ChatScreenAccessor {
    @Accessor(value="chatField")
    public TextFieldWidget wonderful$getChatField();
}