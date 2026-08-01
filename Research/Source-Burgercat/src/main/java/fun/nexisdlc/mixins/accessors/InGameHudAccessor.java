package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.item.ItemStack;

@Mixin(InGameHud.class)
public interface InGameHudAccessor {
    @Accessor("overlayMessage")
    Text getOverlayMessage();

    @Accessor("overlayRemaining")
    int getOverlayRemaining();

    @Accessor("overlayTinted")
    boolean isOverlayTinted();

    @Accessor("heldItemTooltipFade")
    int getHeldItemTooltipFade();

    @Accessor("currentStack")
    ItemStack getCurrentStack();

    @Accessor("titleRemainTicks")
    int getTitleRemainTicks();

    @Accessor("title")
    Text getTitle();

    @Accessor("subtitle")
    Text getSubtitle();

    @Accessor("titleFadeInTicks")
    int getTitleFadeInTicks();

    @Accessor("titleStayTicks")
    int getTitleStayTicks();

    @Accessor("titleFadeOutTicks")
    int getTitleFadeOutTicks();
}
