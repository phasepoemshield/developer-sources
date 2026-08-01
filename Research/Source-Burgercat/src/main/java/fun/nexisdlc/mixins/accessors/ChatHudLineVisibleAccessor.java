package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ChatHudLine.Visible.class)
public interface ChatHudLineVisibleAccessor {
    @Accessor("content")
    OrderedText getContent();

    @Accessor("addedTime")
    int getAddedTime();
}
