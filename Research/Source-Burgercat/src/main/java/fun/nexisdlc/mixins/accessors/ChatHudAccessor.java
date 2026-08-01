package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(ChatHud.class)
public interface ChatHudAccessor {
    @Accessor("messages")
    List<ChatHudLine> getMessages();

    @Accessor("visibleMessages")
    List<ChatHudLine.Visible> getVisibleMessages();

    @Accessor("scrolledLines")
    int getScrolledLines();

    @Invoker("refresh")
    void invokeRefresh();

    @Invoker("getVisibleLineCount")
    int invokeGetVisibleLineCount();

    @Invoker("getWidth")
    int invokeGetWidth();

    @Invoker("getLineHeight")
    int invokeGetLineHeight();

    @Invoker("getChatScale")
    double invokeGetChatScale();

    @Invoker("isChatFocused")
    boolean invokeIsChatFocused();
}
