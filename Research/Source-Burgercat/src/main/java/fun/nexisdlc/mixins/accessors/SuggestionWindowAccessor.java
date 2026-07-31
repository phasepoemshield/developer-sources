package fun.nexisdlc.mixins.accessors;

import com.mojang.brigadier.suggestion.Suggestion;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.util.math.Rect2i;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(ChatInputSuggestor.SuggestionWindow.class)
public interface SuggestionWindowAccessor {
    @Accessor("area")
    Rect2i getArea();

    @Accessor("suggestions")
    List<Suggestion> getSuggestions();

    @Accessor("inWindowIndex")
    int getInWindowIndex();

    @Accessor("selection")
    int getSelection();
}
