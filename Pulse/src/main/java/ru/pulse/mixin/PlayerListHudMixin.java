package ru.pulse.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import pulse.render.icons.IconTextureRegistry;
import pulse.modules.utilities.StreamerMode;
import pulse.module.ModuleRegistry;
import pulse.player.PulsePlayerTracker;

@Mixin({PlayerListHud.class})
public class PlayerListHudMixin {

    @Shadow
    @Final
    private MinecraftClient client;

    @Shadow
    private Text header;

    @Unique
    private static final Logger PULSE_LOG = LogManager.getLogger("PulseTab");

    @Unique
    private static final int ICON_SIZE = 8;

    @Unique
    private static final int ICON_PADDING = 2;

    @Unique
    private final Set<String> tabNames = new HashSet();

    @Unique
    private int tabNamesTick = -1;

    @Unique
    private Set<String> getTabNames() {
        if (1273930702 - this.tabNamesTick > 20) {
            this.tabNamesTick = 1273930702;
            this.tabNames.clear();
            if (this.client.player != null && this.client.player.networkHandler != null) {
                for (PlayerListEntry PlayerListEntryVar : this.client.player.networkHandler.getListedPlayerListEntries()) {
                    if (PlayerListEntryVar.getProfile() != null && PlayerListEntryVar.getProfile().getName() != null) {
                        this.tabNames.add(PlayerListEntryVar.getProfile().getName());
                    }
                }
            }
        }
        return this.tabNames;
    }

    @Redirect(method = {"render"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"))
    private int redirectDrawText(DrawContext DrawContextVar, TextRenderer TextRendererVar, Text TextVar, int i, int i2, int i3) {
        String string = TextVar.getString();
        PULSE_LOG.debug("[tab draw] x={} y={} raw=\"{}\"", Integer.valueOf(i), Integer.valueOf(i2), string);
        String strFindPulsePlayer = findPulsePlayer(string);
        if (strFindPulsePlayer == null) {
            return DrawContextVar.drawTextWithShadow(TextRendererVar, TextVar, i, i2, i3);
        }
        PULSE_LOG.debug("[tab] Drawing icon for {} at x={} y={}", strFindPulsePlayer, Integer.valueOf(i), Integer.valueOf(i2));
        renderLogo(DrawContextVar, i, i2);
        return DrawContextVar.drawTextWithShadow(TextRendererVar, TextVar, i + ICON_SIZE + ICON_PADDING, i2, i3);
    }

    @Unique
    private String findPulsePlayer(String str) {
        if (str == null || str.isBlank()) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : getTabNames()) {
            if (str2.length() >= 3 && lowerCase.contains(str2.toLowerCase()) && PulsePlayerTracker.get().has(str2)) {
                return str2;
            }
        }
        return null;
    }

    @Redirect(method = {"render"}, at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/hud/PlayerListHud;header:Lnet/minecraft/text/Text;", opcode = 180))
    private Text getModifiedHeader(PlayerListHud PlayerListHudVar) {
        StreamerMode streamerMode = ModuleRegistry.STREAMER_MODE;
        if (!streamerMode.k() || !streamerMode.hideServerNumber.k().booleanValue() || this.header == null || !this.header.getString().contains("Анархия-")) {
            return this.header;
        }
        try {
            MinecraftClient MinecraftClientVarGetInstance = MinecraftClient.getInstance();
            return Text.Serialization.fromJson(Text.Serialization.toJsonString(this.header, MinecraftClientVarGetInstance.getNetworkHandler().getRegistryManager()).replaceAll("Анархия-\\d+", "Анархия-***"), MinecraftClientVarGetInstance.getNetworkHandler().getRegistryManager());
        } catch (Exception e) {
            return Text.literal(this.header.getString().replaceAll("Анархия-\\d+", "Анархия-***"));
        }
    }

    @Unique
    private void renderLogo(DrawContext DrawContextVar, int i, int i2) {
        Identifier IdentifierVar = IconTextureRegistry.get(IconTextureRegistry.LOGO);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX);
        RenderSystem.setShaderTexture(0, IdentifierVar);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        DrawContextVar.drawTexture(RenderLayer::getGuiTextured, IdentifierVar, i, i2, 0.0f, 0.0f, ICON_SIZE, ICON_SIZE, ICON_SIZE, ICON_SIZE);
        RenderSystem.disableBlend();
    }
}
