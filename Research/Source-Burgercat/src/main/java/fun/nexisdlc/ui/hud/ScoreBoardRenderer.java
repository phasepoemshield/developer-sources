package fun.nexisdlc.ui.hud;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.client.utils.render.other.SidebarEntry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.render.NoRender;
import fun.nexisdlc.modules.impl.utils.StreamerMode;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;

import java.awt.*;
import java.util.Comparator;

public class ScoreBoardRenderer implements IMinecraft {
    private static final float TEXT_SIZE = 18f;
    private static final float ROW_HEIGHT = 18f;
    private static final float TITLE_HEIGHT = 20f;

    static DrawContext dcontext;
    static ScoreboardObjective objective1;
    static TextRenderer textRenderer1;
    static Comparator<ScoreboardEntry> SCOREBOARD_ENTRY_COMPARATOR1;

    @EventHandler
    public void render(EventRender.Screen.Hud event) {
        if (Nexis.getFunctionManager().getAnInterface() != null &&
                !Interface.elements.getByName("Кастом скорборд").get()) {
            return;
        }
        if (mc.world == null || mc.player == null || mc.options.hudHidden) return;

        Scoreboard scoreboard = mc.world.getScoreboard();
        ScoreboardObjective currentSidebarObjective = null;

        Team team = scoreboard.getScoreHolderTeam(mc.player.getNameForScoreboard());
        if (team != null) {
            var slot = net.minecraft.scoreboard.ScoreboardDisplaySlot.fromFormatting(team.getColor());
            if (slot != null) {
                currentSidebarObjective = scoreboard.getObjectiveForSlot(slot);
            }
        }

        if (currentSidebarObjective == null) {
            currentSidebarObjective = scoreboard.getObjectiveForSlot(net.minecraft.scoreboard.ScoreboardDisplaySlot.SIDEBAR);
        }

        if (currentSidebarObjective == null) {
            objective1 = null;
            return;
        }

        objective1 = currentSidebarObjective;
        if (textRenderer1 == null) textRenderer1 = mc.textRenderer;

        boolean hideScores = NoRender.isEnabled("Цифры в скорборде"); // <-- фикс

        var renderer = event.getRenderer();
        FontObject font = getFont();
        if (font == null) return;

        var numberFormat = objective1.getNumberFormatOr(StyledNumberFormat.RED);

        var sidebarEntriesList = scoreboard.getScoreboardEntries(objective1).stream()
                .filter(score -> !score.hidden())
                .sorted(SCOREBOARD_ENTRY_COMPARATOR1 != null ? SCOREBOARD_ENTRY_COMPARATOR1 :
                        Comparator.comparing(ScoreboardEntry::value).reversed())
                .limit(15L)
                .toList();

        if (sidebarEntriesList.isEmpty()) return;

        SidebarEntry[] sidebarEntries = sidebarEntriesList.stream()
                .map(scoreboardEntry -> {
                    Team t = scoreboard.getScoreHolderTeam(scoreboardEntry.owner());
                    Text text = scoreboardEntry.name();
                    Text decoratedName = processScoreboardText(Team.decorateName(t, text));
                    Text formattedScore = hideScores ? Text.empty() : processScoreboardText(scoreboardEntry.formatted(numberFormat));
                    int scoreWidth = hideScores ? 0 : Math.round(measureText(renderer, font, formattedScore) * 0.5f);
                    return new SidebarEntry(decoratedName, formattedScore, scoreWidth);
                })
                .toArray(SidebarEntry[]::new);

        float rawWidth = (float) mc.getWindow().getWidth();
        float rawHeight = (float) mc.getWindow().getHeight();
        float logicWidth = rawWidth / 2.0f;
        float logicHeight = rawHeight / 2.0f;

        Text titleText = processScoreboardText(objective1.getDisplayName());
        int titleWidth = Math.round(measureText(renderer, font, titleText) * 0.5f);
        int maxWidth = titleWidth;
        int separatorWidth = Math.round(measureText(renderer, font, Text.literal(": ")) * 0.5f);

        for (SidebarEntry entry : sidebarEntries) {
            int entryFullWidth = Math.round(measureText(renderer, font, entry.name) * 0.5f)
                    + (!hideScores && entry.scoreWidth > 0 ? separatorWidth + entry.scoreWidth : 0);
            maxWidth = Math.max(maxWidth, entryFullWidth);
        }

        int m = sidebarEntries.length;
        float o = logicHeight / 2f + (m * 9) / 3f;
        float q = logicWidth - maxWidth - 3;
        float r = logicWidth - 3 + 2;
        float u = o - m * 9;

        var color = new Color(0, 0, 0, 110);
        int alpha = MathHelper.clamp(color.getAlpha() + 50, 0, 255);
        int s = new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).getRGB();
        int t = new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha).getRGB();

        if (!ClientContainer.isHide()) {
            float spacing = 3;
            float boardWidth = spacing + r - (q - 2);
            float bodyHeight = spacing + o - (u - 1);
            int rounding = 9;
            renderer.rect((q - 2) * 2 - spacing, (u - 10) * 2 - (spacing / 2) - 4.65f, boardWidth * 2, 12 * 2, rounding, rounding, 0, 0, t);
            renderer.rect((q - 2) * 2 - spacing, (u - 1) * 2 - (spacing / 2), boardWidth * 2, bodyHeight * 2, 0, 0, rounding, rounding, s);
        }

        renderCustomText(renderer, font, titleText, sidebarEntries, hideScores, maxWidth, q, r, o, u);
    }

    public static void render(DrawContext context, ScoreboardObjective objective, TextRenderer textRenderer, Comparator<ScoreboardEntry> SCOREBOARD_ENTRY_COMPARATOR) {
        dcontext = context;
        objective1 = objective;
        textRenderer1 = textRenderer;
        SCOREBOARD_ENTRY_COMPARATOR1 = SCOREBOARD_ENTRY_COMPARATOR;

        boolean hideScores = NoRender.isEnabled("Цифры в скорборде"); // <-- фикс

        float rawWidth = (float) mc.getWindow().getWidth();
        float rawHeight = (float) mc.getWindow().getHeight();
        float logicWidth = rawWidth / 2.0f;
        float logicHeight = rawHeight / 2.0f;

        Scoreboard scoreboard = objective.getScoreboard();
        NumberFormat numberFormat = objective.getNumberFormatOr(StyledNumberFormat.RED);

        SidebarEntry[] sidebarEntries = scoreboard.getScoreboardEntries(objective).stream()
                .filter(score -> !score.hidden())
                .sorted(SCOREBOARD_ENTRY_COMPARATOR)
                .limit(15L)
                .map(scoreboardEntry -> {
                    Team team = scoreboard.getScoreHolderTeam(scoreboardEntry.owner());
                    Text text = scoreboardEntry.name();
                    Text decoratedName = processScoreboardText(Team.decorateName(team, text));
                    Text formattedScore = hideScores ? Text.empty() : processScoreboardText(scoreboardEntry.formatted(numberFormat));
                    int scoreWidth = hideScores ? 0 : textRenderer.getWidth(formattedScore);
                    return new SidebarEntry(decoratedName, formattedScore, scoreWidth);
                })
                .toArray(SidebarEntry[]::new);

        int maxWidth = textRenderer.getWidth(objective.getDisplayName());
        int separatorWidth = textRenderer.getWidth(": ");
        for (SidebarEntry entry : sidebarEntries) {
            int entryWidth = textRenderer.getWidth(entry.name)
                    + (!hideScores && entry.scoreWidth > 0 ? separatorWidth + entry.scoreWidth : 0);
            maxWidth = Math.max(maxWidth, entryWidth);
        }

        int m = sidebarEntries.length;
        float o = logicHeight / 2f + (m * 9) / 3f;
        float q = logicWidth - maxWidth - 3;
        float r = logicWidth - 3 + 2;
        float u = o - m * 9;

        context.getMatrices().pushMatrix();
        float currentScale = (float) mc.getWindow().getScaleFactor();
        context.getMatrices().scale(2.0f / currentScale, 2.0f / currentScale);

        if (ClientContainer.isHide()) {
            context.fill((int) q - 2, (int) u - 10, (int) r, (int) u - 1, mc.options.getTextBackgroundColor(0.4F));
            context.fill((int) q - 2, (int) u - 1, (int) r, (int) o, mc.options.getTextBackgroundColor(0.3F));
        }

        context.getMatrices().popMatrix();
    }

    private static void renderCustomText(Renderer2D renderer, FontObject font, Text title, SidebarEntry[] entries,
                                         boolean hideScores, int maxWidth, float q, float r, float o, float u) {
        float titleX = q * 2f + (maxWidth * 2f - measureText(renderer, font, title)) * 0.5f;
        float titleY = (u - 12f) * 2f + centeredTextY(font, TITLE_HEIGHT, TEXT_SIZE);
        renderer.text(font, titleX, titleY, TEXT_SIZE, title, -1);

        int count = entries.length;
        for (int i = 0; i < count; ++i) {
            SidebarEntry entry = entries[i];
            float rowY = (o - (count - i) * 9f) * 2f;
            float textY = rowY + centeredTextY(font, ROW_HEIGHT, TEXT_SIZE);

            renderer.text(font, q * 2f, textY, TEXT_SIZE, entry.name, -1);

            if (!hideScores) {
                float scoreX = r * 2f - measureText(renderer, font, entry.score);
                renderer.text(font, scoreX, textY, TEXT_SIZE, entry.score, -1);
            }
        }
    }

    private static FontObject getFont() {
        return FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
    }

    private static float measureText(Renderer2D renderer, FontObject font, Text text) {
        return renderer.measureText(font, text, TEXT_SIZE).width;
    }

    private static float centeredTextY(FontObject font, float height, float size) {
        return FontRegistry.centeredBaselineOffset(font, 'H', size) + height * 0.5f;
    }

    private static Text processScoreboardText(Text text) {
        if (text == null) {
            return Text.empty();
        }

        MutableText cleaned = Text.empty();
        text.visit((style, part) -> {
            String stripped = applyStreamerMode(stripSectionCodes(part));
            if (!stripped.isEmpty()) {
                cleaned.append(Text.literal(stripped).setStyle(style == null ? Style.EMPTY : style));
            }
            return java.util.Optional.empty();
        }, Style.EMPTY);
        return cleaned;
    }

    private static String applyStreamerMode(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StreamerMode streamerMode = Nexis.getFunctionManager() != null
                ? Nexis.getFunctionManager().getStreamerMode()
                : null;
        if (streamerMode == null || !streamerMode.isState()) {
            return input;
        }

        String result = input;

        if (streamerMode.nameProtect.get() && mc != null && mc.getSession() != null) {
            String username = mc.getSession().getUsername();
            if (username != null && !username.isEmpty()) {
                result = result.replace(username, streamerMode.nameProtectName.get());
            }
        }

        if (streamerMode.nameProtect.get() && streamerMode.nameProtectReplaceFriendNicknames.get()) {
            for (var friend : Nexis.getInstance().getFriendStorage().getFriends()) {
                String friendName = friend.getName();
                if (friendName != null && !friendName.isEmpty()) {
                    result = result.replace(friendName, streamerMode.nameProtectName.get());
                }
            }
        }

        return result;
    }

    private static String stripSectionCodes(String input) {
        if (input == null || input.indexOf('\u00A7') < 0) {
            return input == null ? "" : input;
        }

        StringBuilder result = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '\u00A7') {
                if (i + 1 < input.length()) {
                    i++;
                }
                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }
}
