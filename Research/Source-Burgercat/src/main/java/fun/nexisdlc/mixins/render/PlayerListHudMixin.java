package fun.nexisdlc.mixins.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.modules.impl.utils.ClientHide;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(PlayerListHud.class)
public class PlayerListHudMixin {

    @Unique
    private PlayerListEntry nexis$currentEntry = null;

    @Unique
    private int nexis$plateLeft;

    @Unique
    private int nexis$plateRight;

    @ModifyVariable(
            method = "render",
            at = @At(value = "STORE", ordinal = 1),
            ordinal = 0
    )
    private PlayerListEntry nexis$capturePlayerListEntry(PlayerListEntry entry) {
        nexis$currentEntry = entry;
        return entry;
    }

    @Redirect(
            method = "render",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V",
                    ordinal = 2
            )
    )
    private void nexis$capturePlate(DrawContext context, int x1, int y1, int x2, int y2, int color) {
        nexis$plateLeft = x1;
        nexis$plateRight = x2;
        context.fill(x1, y1, x2, y2, color);
    }

    @Redirect(
            method = "render",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)V"
            )
    )
    private void nexis$drawPlayerNameWithHighlight(DrawContext context, TextRenderer textRenderer, Text text, int x, int y, int color) {
        if (nexis$currentEntry != null && !ClientHide.unhooked && mc.player != null) {
            String name = nexis$currentEntry.getProfile().name();
            boolean isSelf = mc.player.getUuid().equals(nexis$currentEntry.getProfile().id());
            boolean isFriend = Nexis.getInstance().getFriendStorage().isFriend(name);
            if (isSelf || isFriend) {
                int index = Math.abs(name.hashCode() % 360);
                int rectColor;
                if (isSelf) {
                    int base = ClientColors.ICON.getRGB();
                    int grad = ColorUtils.fade(4, index, base, ColorUtils.darken(base, 0.31f));
                    rectColor = ColorUtils.injectAlpha(grad, 200);
                } else {
                    var friendColor = ColorUtils.rgb(0, 255, 0);
                    int grad = ColorUtils.fade(4, index, friendColor, ColorUtils.darken(friendColor, 0.31f));
                    rectColor = ColorUtils.injectAlpha(grad, 200);
                }
                context.fill(nexis$plateLeft, y - 1, nexis$plateRight, y + 9, rectColor);
            }
        }
        context.drawTextWithShadow(textRenderer, text, x, y, color);
    }
}