package fun.wonderful.client.modules.impl.render.base.implement;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.font.ReplaceSymbols;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import net.minecraft.world.GameMode;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.scoreboard.Team;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.PlayerListEntry;

public class StaffList
extends InterfaceProcessing {
    private static final int HUD_TEXT_COLOR = ColorUtils.rgb(227, 227, 227);
    private static final int HUD_SEPARATOR_COLOR = ColorUtils.rgba(185, 185, 185, 110);
    private static final float HUD_RADIUS = 3.0f;
    private final MinecraftClient mc = MinecraftClient.getInstance();
    private final Map<String, StaffData> staffDataCache = new LinkedHashMap<String, StaffData>();
    private final Map<String, Float> staffAnimations = new HashMap<String, Float>();
    private final Set<String> activeStaff = new HashSet<String>();
    private final Pattern namePattern = Pattern.compile("^\\w{3,16}$");
    private final Set<String> validStaffPrefixes = new HashSet<String>();
    private static final Set<Character> STAFF_RW_SYMBOLS = new HashSet<Character>(Arrays.asList(Character.valueOf('ꔉ'), Character.valueOf('ꔓ'), Character.valueOf('ꔗ'), Character.valueOf('ꔡ'), Character.valueOf('ꔥ'), Character.valueOf('ꔩ'), Character.valueOf('ꔳ'), Character.valueOf('ꔷ'), Character.valueOf('ꔁ'), Character.valueOf('ꔅ')));
    private final AnimationUtils widthAnimation = new AnimationUtils(60.0f, 10.5f, Easings.QUAD_OUT);
    private float staffAnimatedHeight = 18.0f;
    private long lastStaffUpdate = 0L;
    private final List<String> visiblePlayers = new ArrayList<String>();
    private final Set<String> animationScratch = new HashSet<String>();
    private Font font10;
    private Font font12;
    private Font font14;
    private Font iconFont;

    public StaffList(Draggable draggable) {
        super(draggable);
        this.validStaffPrefixes.addAll(Arrays.asList("supp", "ꜱupp", "mod", "der", "adm", "wne", "мод", "помо", "адм", "владе", "отри", "таф", "taf", "curat", "курато", "dev", "раз", "сапп", "yt", "ютуб", "стажер", "сотрудник", "media"));
    }

    private void initFonts() {
        if (this.font10 == null) {
            this.font10 = Fonts.getFont("sf_regular", 11);
            this.font12 = Fonts.getFont("sf_regular", 13);
            this.font14 = Fonts.getFont("sf_regular", 15);
            this.iconFont = Fonts.getFont("wonderful", 13);
        }
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        if (this.mc.player == null || this.mc.world == null) {
            return;
        }
        this.initFonts();
        long currentTime = System.currentTimeMillis();
        if (currentTime - this.lastStaffUpdate > 500L) {
            this.updateStaffCache();
            this.lastStaffUpdate = currentTime;
        }
        this.updateAnimations();
        this.renderDefaultStyle(eventRender);
        super.onRender(eventRender);
    }

    private boolean matchesStaffPrefix(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return false;
        }
        for (char c2 : prefix.toCharArray()) {
            if (!STAFF_RW_SYMBOLS.contains(Character.valueOf(c2))) continue;
            return true;
        }
        String lower = prefix.toLowerCase(Locale.ROOT);
        for (String p2 : this.validStaffPrefixes) {
            if (!lower.contains(p2)) continue;
            return true;
        }
        return false;
    }

    private List<PrefixSegment> parsePrefix(Text prefix) {
        ArrayList<PrefixSegment> segments = new ArrayList<PrefixSegment>();
        prefix.visit((style, string) -> {
            if (string == null || string.isEmpty()) {
                return Optional.empty();
            }
            this.appendPrefixSegments(segments, string, style.getColor() != null ? style.getColor().getRgb() : 0xFFFFFF);
            return Optional.empty();
        }, Style.EMPTY);
        return segments;
    }

    private void appendPrefixSegments(List<PrefixSegment> segments, String text, int baseColor) {
        int currentColor = baseColor;
        StringBuilder chunk = new StringBuilder();
        int chunkColor = currentColor;
        int offset = 0;
        while (offset < text.length()) {
            int codePoint = text.codePointAt(offset);
            int charCount = Character.charCount(codePoint);
            if (codePoint == 167 && offset + charCount < text.length()) {
                this.flushPrefixSegment(segments, chunk, chunkColor);
                char code = Character.toLowerCase(text.charAt(offset + charCount));
                Integer mappedColor = this.sectionColorToRgb(code);
                chunkColor = currentColor = mappedColor != null ? mappedColor : (code == 'r' ? baseColor : currentColor);
                offset += charCount + 1;
                continue;
            }
            String replacement = ReplaceSymbols.replaceCodePoint(codePoint);
            if (replacement != null) {
                this.flushPrefixSegment(segments, chunk, chunkColor);
                int totalChars = Math.max(1, replacement.length());
                for (int i2 = 0; i2 < replacement.length(); ++i2) {
                    int replacementColor = ReplaceSymbols.getGradientColorForReplacement(codePoint, i2, totalChars, 1.0f, currentColor);
                    if (chunk.length() > 0 && chunkColor != replacementColor) {
                        this.flushPrefixSegment(segments, chunk, chunkColor);
                    }
                    chunkColor = replacementColor;
                    chunk.append(replacement.charAt(i2));
                }
                offset += charCount;
                continue;
            }
            if (chunk.length() > 0 && chunkColor != currentColor) {
                this.flushPrefixSegment(segments, chunk, chunkColor);
            }
            chunkColor = currentColor;
            chunk.appendCodePoint(codePoint);
            offset += charCount;
        }
        this.flushPrefixSegment(segments, chunk, chunkColor);
    }

    private void flushPrefixSegment(List<PrefixSegment> segments, StringBuilder chunk, int color) {
        if (chunk.isEmpty()) {
            return;
        }
        String text = chunk.toString();
        PrefixSegment seg = new PrefixSegment(text, color);
        seg.width12 = this.font12.getWidth(text);
        seg.width14 = this.font14.getWidth(text);
        segments.add(seg);
        chunk.setLength(0);
    }

    private Integer sectionColorToRgb(char code) {
        return switch (code) {
            case '0' -> 0;
            case '1' -> 170;
            case '2' -> 43520;
            case '3' -> 43690;
            case '4' -> 0xAA0000;
            case '5' -> 0xAA00AA;
            case '6' -> 0xFFAA00;
            case '7' -> 0xAAAAAA;
            case '8' -> 0x555555;
            case '9' -> 0x5555FF;
            case 'a' -> 0x55FF55;
            case 'b' -> 0x55FFFF;
            case 'c' -> 0xFF5555;
            case 'd' -> 0xFF55FF;
            case 'e' -> 0xFFFF55;
            case 'f' -> 0xFFFFFF;
            default -> null;
        };
    }

    private void updateStaffCache() {
        this.activeStaff.clear();
        String selfName = this.mc.player.getName().getString();
        for (Team team : this.mc.world.getScoreboard().getTeams()) {
            Text prefixText;
            String prefixStr;
            boolean matchesPrefix;
            Collection<String> players = team.getPlayerList();
            if (players.isEmpty() || !(matchesPrefix = this.matchesStaffPrefix(prefixStr = (prefixText = team.getPrefix()).getString()))) continue;
            for (String name : players) {
                if (!this.namePattern.matcher(name).matches() || name.equals(selfName) || this.activeStaff.contains(name)) continue;
                PlayerListEntry info = this.mc.getNetworkHandler().getPlayerListEntry(name);
                boolean vanish = info == null;
                boolean isGM3 = info != null && info.getGameMode() == GameMode.SPECTATOR;
                this.activeStaff.add(name);
                String status = vanish ? "VANISH" : (isGM3 ? "GM3" : "ONLINE");
                StaffData existing = this.staffDataCache.get(name);
                if (existing == null) {
                    existing = new StaffData(status);
                    this.staffDataCache.put(name, existing);
                }
                existing.status = status;
                existing.segments = this.getStaffPrefixSegments(name, info, prefixText);
                this.calculateWidths(existing, name);
            }
        }
        for (String staffName : Wonderful.INSTANCE.staffStorage.getStaffs()) {
            if (staffName.equals(selfName) || !this.namePattern.matcher(staffName).matches() || this.activeStaff.contains(staffName)) continue;
            this.activeStaff.add(staffName);
            PlayerListEntry info = this.mc.getNetworkHandler().getPlayerListEntry(staffName);
            String status = info == null ? "VANISH" : (info.getGameMode() == GameMode.SPECTATOR ? "GM3" : "ONLINE");
            List<PrefixSegment> prefixSegments = this.getStaffPrefixSegments(staffName, info, null);
            StaffData existing = this.staffDataCache.get(staffName);
            if (existing == null) {
                existing = new StaffData(status);
                this.staffDataCache.put(staffName, existing);
            }
            existing.status = status;
            existing.segments = prefixSegments;
            this.calculateWidths(existing, staffName);
        }
    }

    private List<PrefixSegment> getStaffPrefixSegments(String name, PlayerListEntry info, Text fallbackPrefix) {
        if (fallbackPrefix != null && !fallbackPrefix.getString().isEmpty()) {
            return this.parsePrefix(fallbackPrefix);
        }
        Team team = this.mc.world.getScoreboard().getScoreHolderTeam(name);
        if (team != null && team.getPrefix() != null && !team.getPrefix().getString().isEmpty()) {
            return this.parsePrefix(team.getPrefix());
        }
        if (info != null && info.getDisplayName() != null) {
            return this.parsePrefixBeforeName(info.getDisplayName(), name);
        }
        return new ArrayList<PrefixSegment>();
    }

    private List<PrefixSegment> parsePrefixBeforeName(Text displayName, String name) {
        ArrayList segments = new ArrayList();
        boolean[] foundName = new boolean[]{false};
        displayName.visit((style, string) -> {
            String prefixPart;
            if (foundName[0] || string == null || string.isEmpty()) {
                return Optional.empty();
            }
            int nameIndex = this.indexOfIgnoreCase(string, name);
            String string2 = prefixPart = nameIndex >= 0 ? string.substring(0, nameIndex) : string;
            if (!prefixPart.isEmpty()) {
                this.appendPrefixSegments(segments, prefixPart, style.getColor() != null ? style.getColor().getRgb() : 0xFFFFFF);
            }
            if (nameIndex >= 0) {
                foundName[0] = true;
            }
            return Optional.empty();
        }, Style.EMPTY);
        return foundName[0] ? segments : new ArrayList();
    }

    private int indexOfIgnoreCase(String text, String search) {
        if (text == null || search == null || search.isEmpty()) {
            return -1;
        }
        int limit = text.length() - search.length();
        for (int i2 = 0; i2 <= limit; ++i2) {
            if (!text.regionMatches(true, i2, search, 0, search.length())) continue;
            return i2;
        }
        return -1;
    }

    private void calculateWidths(StaffData data, String name) {
        data.prefixWidth12 = 0.0f;
        data.prefixWidth14 = 0.0f;
        for (PrefixSegment seg : data.segments) {
            data.prefixWidth12 += seg.width12;
            data.prefixWidth14 += seg.width14;
        }
        data.nameWidth12 = this.font12.getWidth(name);
        data.nameWidth14 = this.font14.getWidth(name + " >> ");
    }

    private void updateAnimations() {
        float lerpSpeed = 0.1f;
        this.animationScratch.clear();
        this.animationScratch.addAll(this.staffAnimations.keySet());
        this.animationScratch.addAll(this.activeStaff);
        for (String playerName : this.animationScratch) {
            boolean isActive = this.activeStaff.contains(playerName);
            float targetAnim = isActive ? 1.0f : 0.0f;
            float currentAnim = this.staffAnimations.getOrDefault(playerName, Float.valueOf(0.0f)).floatValue();
            currentAnim += (targetAnim - currentAnim) * lerpSpeed;
            this.staffAnimations.put(playerName, Float.valueOf(currentAnim));
        }
        Iterator<Map.Entry<String, Float>> animIt = this.staffAnimations.entrySet().iterator();
        while (animIt.hasNext()) {
            Map.Entry<String, Float> entry = animIt.next();
            if (!(entry.getValue().floatValue() < 0.01f) || this.activeStaff.contains(entry.getKey())) continue;
            animIt.remove();
            this.staffDataCache.remove(entry.getKey());
        }
    }

    private List<String> getVisiblePlayers() {
        this.visiblePlayers.clear();
        for (Map.Entry<String, Float> entry : this.staffAnimations.entrySet()) {
            if (!(entry.getValue().floatValue() > 0.01f)) continue;
            this.visiblePlayers.add(entry.getKey());
        }
        Collections.sort(this.visiblePlayers);
        return this.visiblePlayers;
    }

    private float getStatusBoxWidth() {
        return 12.0f;
    }

    private void renderDefaultStyle(EventRender.Default eventRender) {
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        MatrixStack matrices = eventRender.getContext().getMatrices();
        int colorTheme = !Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow") ? Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0] : ColorUtils.getThemeColor();
        List<String> visiblePlayers = this.getVisiblePlayers();
        float maxWidth = 60.0f;
        float headerHeight = 16.0f;
        float itemHeight = 12.0f;
        float padding = 5.0f;
        float statusPadding = 4.0f;
        maxWidth = Math.max(maxWidth, padding + this.font14.getWidth("Spectators") + 18.0f + padding);
        for (String playerName : visiblePlayers) {
            StaffData data = this.staffDataCache.get(playerName);
            if (data == null) continue;
            float statusBoxW = this.getStatusBoxWidth();
            float f2 = data.prefixWidth12 > 0.0f ? 2.0f : 0.0f;
            float prefixGap = f2;
            float totalW = padding + data.prefixWidth12 + prefixGap + data.nameWidth12 + statusPadding + statusBoxW + padding;
            if (!(totalW > maxWidth)) continue;
            maxWidth = totalW;
        }
        this.widthAnimation.update(maxWidth);
        float width = this.widthAnimation.getValue();
        float separatorX = x2 + 0.5f;
        float separatorY = y2 + 15.35f;
        float separatorWidth = width - 1.0f;
        float contentHeight = 0.0f;
        for (String playerName : visiblePlayers) {
            contentHeight += itemHeight * this.staffAnimations.getOrDefault(playerName, Float.valueOf(0.0f)).floatValue();
        }
        float targetHeight = visiblePlayers.isEmpty() ? headerHeight : headerHeight + contentHeight + 4.0f;
        this.staffAnimatedHeight += (targetHeight - this.staffAnimatedHeight) * 0.12f;
        float height = this.staffAnimatedHeight;
        this.drawFigmaPanel(matrices, x2, y2, width, height, colorTheme);
        this.font14.draw(matrices, "Spectators", x2 + 5.0f, y2 + 6.0f, HUD_TEXT_COLOR);
        this.iconFont.draw(matrices, "E", x2 + width - 13.0f, y2 + 6.8f, colorTheme);
        if (!visiblePlayers.isEmpty()) {
            this.drawHeaderSeparator(matrices, separatorX, separatorY, separatorWidth);
        }
        float offsetY = 19.5f;
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(x2, y2, width, height);
        for (String playerName : visiblePlayers) {
            StaffData data;
            float anim = this.staffAnimations.getOrDefault(playerName, Float.valueOf(0.0f)).floatValue();
            if (anim <= 0.01f || (data = this.staffDataCache.get(playerName)) == null) continue;
            int alpha = (int)(255.0f * anim);
            float yOffset = -5.0f * (1.0f - anim);
            float textX = x2 + padding + 0.9f;
            float textY = y2 + offsetY + 2.0f + yOffset;
            textX = this.drawPrefixSegments(matrices, data.segments, textX, textY, alpha);
            if (data.prefixWidth12 > 0.0f) {
                textX += 2.0f;
            }
            this.font12.draw(matrices, playerName, textX, textY, ColorUtils.setAlphaColor(HUD_TEXT_COLOR, alpha));
            float statusBoxWidth = this.getStatusBoxWidth();
            float statusBoxX = x2 + width - statusBoxWidth - padding + 0.3f;
            float statusBoxY = y2 + offsetY + -0.4f + yOffset;
            float statusCenterX = statusBoxX + statusBoxWidth * 0.65f;
            float statusCenterY = statusBoxY + 4.35f;
            this.drawSpectatorDot(matrices, statusCenterX, statusCenterY, data.status, colorTheme, alpha);
            offsetY += itemHeight * anim;
        }
        ScissorUtils.pop();
        ScissorUtils.unset();
        this.draggable.setWidth(width);
        this.draggable.setHeight(height);
    }

    private float drawPrefixSegments(MatrixStack matrices, List<PrefixSegment> segments, float x2, float y2, int alpha) {
        float drawX = x2;
        for (PrefixSegment segment : segments) {
            int color = ColorUtils.setAlphaColor(segment.color, alpha);
            this.font12.draw(matrices, segment.text, drawX, y2, color);
            drawX += segment.width12;
        }
        return drawX;
    }

    private void drawSpectatorDot(MatrixStack matrices, float centerX, float centerY, String status, int themeColor, int alpha) {
        int baseColor = switch (status) {
            case "ONLINE" -> 0x55FF55;
            case "GM3" -> 0xFFFF55;
            case "VANISH" -> 0xFF5555;
            default -> themeColor;
        };
        boolean primary = !"ONLINE".equals(status);
        int outerColor = ColorUtils.setAlphaColor(baseColor, (int)((float)alpha * (primary ? 1.0f : 0.62f)));
        int innerColor = ColorUtils.setAlphaColor(ColorUtils.darken(baseColor, primary ? 0.55f : 0.35f), (int)((float)alpha * (primary ? 0.68f : 0.48f)));
        RenderUtils.drawRoundCircle(matrices, centerX, centerY, 7.3f, outerColor);
        RenderUtils.drawRoundCircle(matrices, centerX, centerY, 4.8f, innerColor);
    }

    private void drawFigmaPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor) {
        int topColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.15f), 255);
        int bottomColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.05f), 255);
        RenderUtils.drawGradientRect(matrices, x2, y2, width, height, 3.0f, topColor, bottomColor);
    }

    private void drawHeaderSeparator(MatrixStack matrices, float x2, float y2, float width) {
        float snappedY = Math.round(y2);
        RenderUtils.drawRoundedRect(matrices, x2, snappedY, width, 0.6f, 0.0f, HUD_SEPARATOR_COLOR);
    }

    private static class PrefixSegment {
        final String text;
        final int color;
        float width12;
        float width14;

        PrefixSegment(String text, int color) {
            this.text = text;
            this.color = color;
        }
    }

    private static class StaffData {
        String status;
        List<PrefixSegment> segments;
        float prefixWidth12;
        float prefixWidth14;
        float nameWidth12;
        float nameWidth14;

        StaffData(String status) {
            this.status = status;
            this.segments = new ArrayList<PrefixSegment>();
        }
    }
}