package fun.wonderful.mixin;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.SidebarEntry;
import fun.wonderful.api.utils.render.blur.BlurProgram;
import fun.wonderful.client.modules.impl.misc.NameProtect;
import java.util.Comparator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextColor;
import net.minecraft.text.StringVisitable;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={InGameHud.class})
public class InGameGuiMixin
implements QClient {
    private static final int DOMAIN_COLOR = 15557921;
    @Shadow
    @Final
    private MinecraftClient client;

    @Inject(method={"renderVignetteOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderVignetteOverlay(DrawContext context, Entity entity, CallbackInfo ci) {
        if (ModuleClass.noVignette.isEnable()) {
            ci.cancel();
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void render(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        BlurProgram.getInstance().beginFrame();
        if (EventInvoker.hasListeners(EventRender.Default.class)) {
            new EventRender.Default(context, tickCounter.getTickDelta(true)).call();
        }
    }

    @Shadow
    private PlayerEntity getCameraPlayer() {
        return null;
    }

    @Inject(method={"renderScoreboardSidebar"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$renderPatchedScoreboard(DrawContext drawContext, ScoreboardObjective objective, CallbackInfo ci) {
        int titleWidth;
        if (!this.wonderful$shouldPatchScoreboard()) {
            return;
        }
        Scoreboard scoreboard = objective.getScoreboard();
        NumberFormat numberFormat = objective.getNumberFormatOr((NumberFormat)StyledNumberFormat.RED);
        List<SidebarEntry> lines = scoreboard.getScoreboardEntries(objective).stream().filter(entry -> !entry.hidden()).sorted(Comparator.comparing(ScoreboardEntry::comp_2128).reversed().thenComparing(ScoreboardEntry::comp_2127, String.CASE_INSENSITIVE_ORDER)).limit(15L).map(entry -> {
            Team team = scoreboard.getScoreHolderTeam(entry.comp_2127());
            Text name = this.wonderful$patchText((Text)Team.decorateName((AbstractTeam)team, (Text)entry.name()));
            MutableText score = entry.formatted(numberFormat);
            int scoreWidth = this.client.textRenderer.getWidth((StringVisitable)score);
            return new SidebarEntry(name, (Text)score, scoreWidth);
        }).toList();
        Text title = this.wonderful$patchText(objective.getDisplayName());
        int maxWidth = titleWidth = this.client.textRenderer.getWidth((StringVisitable)title);
        int separatorWidth = this.client.textRenderer.getWidth(": ");
        for (SidebarEntry line : lines) {
            maxWidth = Math.max(maxWidth, this.client.textRenderer.getWidth((StringVisitable)line.name) + (line.scoreWidth > 0 ? separatorWidth + line.scoreWidth : 0));
        }
        int lineCount = lines.size();
        int totalHeight = lineCount * 9;
        int bottom = drawContext.getScaledWindowHeight() / 2 + totalHeight / 3;
        int left = drawContext.getScaledWindowWidth() - maxWidth - 3;
        int right = drawContext.getScaledWindowWidth() - 1;
        int bodyColor = this.client.options.getTextBackgroundColor(0.3f);
        int headerColor = this.client.options.getTextBackgroundColor(0.4f);
        int top = bottom - lineCount * 9;
        drawContext.fill(left - 2, top - 10, right, top - 1, headerColor);
        drawContext.fill(left - 2, top - 1, right, bottom, bodyColor);
        drawContext.drawText(this.client.textRenderer, title, left + maxWidth / 2 - titleWidth / 2, top - 9, -1, false);
        for (int index = 0; index < lineCount; ++index) {
            SidebarEntry line = lines.get(index);
            int y2 = bottom - (lineCount - index) * 9;
            drawContext.drawText(this.client.textRenderer, line.name, left, y2, -1, false);
            drawContext.drawText(this.client.textRenderer, line.score, right - line.scoreWidth, y2, -1, false);
        }
        ci.cancel();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean wonderful$shouldPatchScoreboard() {
        if (ModuleClass.INSTANCE == null) return false;
        if (ModuleClass.nameProtect == null) return false;
        if (!ModuleClass.nameProtect.isEnable()) return false;
        return true;
    }

    private Text wonderful$patchText(Text text) {
        NameProtect nameProtect = ModuleClass.nameProtect;
        Text patched = nameProtect.patchText(text);
        String patchedString = patched.getString();
        if (nameProtect.shouldHideGrief()) {
            if (patchedString.contains("Анархия-")) {
                patchedString = patchedString.replaceAll("Анархия-\\d+", "wonderfulclient.fun");
            }
            if (patchedString.contains("ГРИФ #")) {
                patchedString = patchedString.replaceAll("ГРИФ #\\d+", "wonderfulclient.fun");
            }
        }
        if (patchedString.equals(patched.getString())) {
            return patched;
        }
        return Text.literal((String)patchedString).setStyle(patched.getStyle().withColor(TextColor.fromRgb((int)15557921)));
    }
}