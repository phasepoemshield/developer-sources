package fun.nexisdlc.mixins.render;

import fun.nexisdlc.mixins.accessors.BossBarHudAccessor;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.UUID;

@Mixin(targets = "net.minecraft.client.gui.hud.BossBarHud$1")
public class BossBarHudConsumerMixin {
    @Shadow(aliases = {"field_29071", "this$0"})
    @Final
    private BossBarHud field_29071;

    @Inject(method = "updateProgress", at = @At("HEAD"), cancellable = true)
    private void nexis$guardMissingBossBarProgress(UUID uuid, float percent, CallbackInfo ci) {
        if (getBossBarMap().get(uuid) == null) {
            ci.cancel();
        }
    }

    @Inject(method = "updateName", at = @At("HEAD"), cancellable = true)
    private void nexis$guardMissingBossBarName(UUID uuid, Text name, CallbackInfo ci) {
        if (getBossBarMap().get(uuid) == null) {
            ci.cancel();
        }
    }

    @Inject(method = "updateStyle", at = @At("HEAD"), cancellable = true)
    private void nexis$guardMissingBossBarStyle(UUID uuid, BossBar.Color color, BossBar.Style style, CallbackInfo ci) {
        ClientBossBar bar = getBossBarMap().get(uuid);
        if (bar == null) {
            ci.cancel();
        }
    }

    @Inject(method = "updateProperties", at = @At("HEAD"), cancellable = true)
    private void nexis$guardMissingBossBarProperties(UUID uuid, boolean darkenSky, boolean dragonMusic, boolean thickenFog, CallbackInfo ci) {
        ClientBossBar bar = getBossBarMap().get(uuid);
        if (bar == null) {
            ci.cancel();
        }
    }

    private Map<UUID, ClientBossBar> getBossBarMap() {
        return ((BossBarHudAccessor) field_29071).getBossBars();
    }
}
