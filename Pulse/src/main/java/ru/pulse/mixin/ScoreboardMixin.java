package ru.pulse.mixin;

import net.minecraft.text.Text;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import pulse.modules.utilities.StreamerMode;
import pulse.client.MinecraftContext;
import pulse.module.ModuleRegistry;

@Mixin({InGameHud.class})
public class ScoreboardMixin implements MinecraftContext {
    @Redirect(method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/scoreboard/ScoreboardObjective;getDisplayName()Lnet/minecraft/text/Text;"))
    private Text hideScoreboardTitle(ScoreboardObjective ScoreboardObjectiveVar) {
        StreamerMode streamerMode = ModuleRegistry.STREAMER_MODE;
        if (streamerMode.k() && streamerMode.hideServerNumber.k().booleanValue()) {
            if (c == null || c.getCurrentServerEntry() == null) {
                return Text.literal("pulsevisuals.pro");
            }
            if (!c.getCurrentServerEntry().address.toLowerCase().contains("holyworld")) {
                return Text.literal("pulsevisuals.pro");
            }
        }
        return ScoreboardObjectiveVar.getDisplayName();
    }
}
