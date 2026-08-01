package fun.nexisdlc.ui.hud;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.brigadier.suggestion.Suggestion;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.commands.commands.CommandDispatcher;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.gif.GifTexture;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.mixins.accessors.ChatHudAccessor;
import fun.nexisdlc.mixins.accessors.ChatHudLineVisibleAccessor;
import fun.nexisdlc.mixins.accessors.ChatInputSuggestorAccessor;
import fun.nexisdlc.mixins.accessors.ChatScreenAccessor;
import fun.nexisdlc.mixins.accessors.SuggestionWindowAccessor;
import fun.nexisdlc.mixins.accessors.TextFieldWidgetAccessor;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.impl.render.Interface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.player.SkinTextures;
import net.minecraft.client.util.math.Rect2i;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.awt.Color;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class CustomChatHud {
    private static final String ELEMENT_NAME = "Кастомный чат";
    private static final float BASE_X = 4f;
    private static final float BASE_BOTTOM_MARGIN = 28f;
    private static final float PANEL_PADDING_X = 6f;
    private static final float PANEL_PADDING_Y = 3f;
    private static final float PANEL_GAP = 2f;
    private static final float FONT_SIZE = 14f;
    private static final float ROUNDING = 4f;
    private static final float STYLE_SCALE = 1.3f;
    private static final float INPUT_FONT_SIZE = 13f;
    private static final float INPUT_HEIGHT = 20f;
    private static final float INPUT_PADDING_X = 8f;
    private static final float INPUT_MARGIN = 4f;
    private static final float CARET_WIDTH = 1.5f;
    private static final float SELECTION_RADIUS = 4f;
    private static final float HEAD_SIZE = 12f;
    private static final float HEAD_GAP = 5f;
    private static final float SUGGESTION_MAX_VISIBLE = 8f;
    private static final long APPEAR_ANIMATION_MS = 220L;
    private static final long CHAT_VISIBILITY_ANIMATION_MS = 180L;
    private static final float APPEAR_OFFSET_X = 12f;
    private static final float CHAT_OPEN_OFFSET_Y = 10f;
    private static final float INPUT_MIN_WIDTH = 2f;
    private static final Identifier IRC_GIF = Identifier.of("nexis", "gif/avatar.gif");
    private static final HttpClient SKIN_HTTP_CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(6))
            .build();
    private static final Map<String, ChatAnimationState> LINE_ANIMATIONS = new HashMap<>();
    private static final Map<String, CachedSkin> SKIN_CACHE = new ConcurrentHashMap<>();

    private static ChatHud activeChatHud;
    private static final VisibilityAnimation CHAT_VISIBILITY = new VisibilityAnimation();

    public static boolean shouldUseCustomChat() {
        FunctionManager manager = Nexis.getFunctionManager();
        if (manager == null || manager.getAnInterface() == null || !manager.getAnInterface().isState()) {
            return false;
        }

        BooleanSetting setting = findElementSetting(ELEMENT_NAME);
        return setting != null && setting.get();
    }

    private static BooleanSetting findElementSetting(String name) {
        if (Interface.elements == null || name == null || name.isBlank()) {
            return null;
        }

        BooleanSetting exact = Interface.elements.getByName(name);
        if (exact != null) {
            return exact;
        }

        String mojibake = new String(name.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        BooleanSetting encoded = Interface.elements.getByName(mojibake);
        if (encoded != null) {
            return encoded;
        }

        for (BooleanSetting setting : Interface.elements.get()) {
            if (setting == null || setting.getName() == null) {
                continue;
            }

            String settingName = setting.getName();
            if (settingName.equalsIgnoreCase(name) || settingName.equalsIgnoreCase(mojibake)) {
                return setting;
            }
        }

        return null;
    }

    public static void markActive(ChatHud chatHud) {
        activeChatHud = chatHud;
    }

    @EventHandler
    public void onRender(EventRender.Screen.Hud event) {
        if (!shouldUseCustomChat()) {
            activeChatHud = null;
            return;
        }

        MinecraftClient mc = MinecraftClient.getInstance();
        ChatHud chatHud = activeChatHud != null ? activeChatHud : mc != null && mc.inGameHud != null ? mc.inGameHud.getChatHud() : null;
        if (mc == null || chatHud == null || mc.options.hudHidden) {
            return;
        }

        CHAT_VISIBILITY.update(mc.currentScreen instanceof ChatScreen);
        render(event.getRenderer(), chatHud, mc.inGameHud.getTicks(), event.getViewportHeight());
    }

    @EventHandler
    public void onRenderGui(EventRender.Screen.Gui event) {
        if (!shouldUseCustomChat()) {
            return;
        }

        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || !(mc.currentScreen instanceof ChatScreen chatScreen)) {
            return;
        }

        CHAT_VISIBILITY.update(true);
        TextFieldWidget textField = ((TextFieldWidgetProvider) chatScreen).nexis$getChatField();
        if (textField == null || !textField.isVisible()) {
            return;
        }

        renderInput(event.getRenderer(), textField, event.getViewportWidth(), event.getViewportHeight());
        renderSuggestions(event.getRenderer(), chatScreen, event.getViewportHeight());
    }

    private static void render(Renderer2D renderer, ChatHud chatHud, int currentTick, int viewportHeight) {
        if (ChatOverlayState.hideChatInfo) {
            return;
        }
        
        ChatHudAccessor accessor = (ChatHudAccessor) chatHud;
        List<ChatHudLine.Visible> visibleMessages = accessor.getVisibleMessages();
        if (visibleMessages == null || visibleMessages.isEmpty()) {
            return;
        }

        int visibleLineCount = accessor.invokeGetVisibleLineCount();
        int scrolledLines = accessor.getScrolledLines();
        if (visibleLineCount <= 0 || scrolledLines >= visibleMessages.size()) {
            return;
        }

        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        float lineHeight = Math.max(14f, accessor.invokeGetLineHeight() * STYLE_SCALE + 4f);
        float chatScale = Math.max(0.1f, (float) accessor.invokeGetChatScale()) * STYLE_SCALE;
        boolean focused = accessor.invokeIsChatFocused();
        float openProgress = CHAT_VISIBILITY.get();
        int maxIndex = Math.min(visibleMessages.size(), scrolledLines + visibleLineCount);
        long now = System.currentTimeMillis();

        List<RenderedLine> lines = new ArrayList<>();
        Map<String, Boolean> seen = new HashMap<>();
        float maxTextWidth = 0f;

        for (int index = scrolledLines; index < maxIndex; index++) {
            ChatHudLine.Visible line = visibleMessages.get(index);
            ChatHudLineVisibleAccessor visibleAccessor = (ChatHudLineVisibleAccessor) (Object) line;
            Text text = orderedTextToText(visibleAccessor.getContent());
            String rawMessage = text.getString();
            if (rawMessage.isBlank()) {
                continue;
            }

            int age = currentTick - visibleAccessor.getAddedTime();
            float vanillaAlpha = focused ? 1f : getMessageOpacityMultiplier(age);
            if (vanillaAlpha <= 0.03f) {
                continue;
            }

            String lineKey = visibleAccessor.getAddedTime() + "|" + rawMessage;
            seen.put(lineKey, Boolean.TRUE);
            ChatAnimationState animation = LINE_ANIMATIONS.computeIfAbsent(lineKey, ignored -> new ChatAnimationState(now));
            float appear = animation.appearProgress(now);
            float alpha = vanillaAlpha * appear;
            if (alpha <= 0.03f) {
                continue;
            }

            ChatAvatar avatar = resolveAvatar(mc(), rawMessage);
            float headWidth = avatar != null ? HEAD_SIZE + HEAD_GAP : 0f;
            float width = renderer.measureText(font, text, FONT_SIZE).width + headWidth;
            maxTextWidth = Math.max(maxTextWidth, width);
            lines.add(new RenderedLine(text, alpha, avatar, appear, visibleAccessor.getAddedTime()));
        }

        cleanupAnimations(seen, now);
        if (lines.isEmpty()) {
            return;
        }

        Collections.reverse(lines);

        Map<Integer, Boolean> avatarShownByMessage = new HashMap<>();
        for (int i = 0; i < lines.size(); i++) {
            RenderedLine line = lines.get(i);
            if (line.avatar() == null) {
                continue;
            }

            if (avatarShownByMessage.putIfAbsent(line.addedTime(), Boolean.TRUE) != null) {
                lines.set(i, line.withAvatar(null));
            }
        }

        float maxPanelWidth = accessor.invokeGetWidth() * STYLE_SCALE + HEAD_SIZE + HEAD_GAP + 20f;
        float panelWidth = Math.min(maxPanelWidth, maxTextWidth + PANEL_PADDING_X * 2f + APPEAR_OFFSET_X + 16f);

        float dynamicPanelHeight = PANEL_PADDING_Y * 2f;
        for (RenderedLine line : lines) {
            dynamicPanelHeight += (lineHeight + PANEL_GAP) * line.alpha();
        }
        float panelHeight = dynamicPanelHeight;

        float scaledBottomMargin = BASE_BOTTOM_MARGIN + openProgress * (INPUT_HEIGHT + INPUT_MARGIN * 2f + 2f);
        float panelY = viewportHeight - scaledBottomMargin - panelHeight * chatScale;
        float animatedPanelY = panelY + (1f - openProgress) * CHAT_OPEN_OFFSET_Y;
        int rounding = Interface.getHudRoundedInt(ROUNDING) * 2;

        renderer.pushScale(chatScale, chatScale);
        renderer.pushTranslation(BASE_X / chatScale, animatedPanelY / chatScale);
        try {
            float panelAlpha = focused ? openProgress : 1f;
            renderer.blur(0f, 0f, panelWidth, panelHeight, rounding, panelAlpha);
            renderer.rect(0f, 0f, panelWidth, panelHeight, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.92f * panelAlpha));
            renderer.rectOutline(0f, 0f, panelWidth, panelHeight, rounding, ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.12f * panelAlpha), 1f);

            float y = PANEL_PADDING_Y;
            for (RenderedLine line : lines) {
                float lineAlpha = line.alpha();
                float effectiveLineHeight = lineHeight * lineAlpha;
                int textColor = ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), lineAlpha);
                int lineBackgroundColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.48f * panelAlpha * lineAlpha);
                int lineOutlineColor = ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.07f * panelAlpha * lineAlpha);
                float contentX = PANEL_PADDING_X + 2f + (1f - line.appearProgress()) * APPEAR_OFFSET_X;
                float lineBackgroundX = Math.max(0f, contentX - 4f);
                float lineBackgroundWidth = Math.max(0f, panelWidth - lineBackgroundX - PANEL_PADDING_X + 1f);

                if (line.avatar() != null) {
                    drawAvatar(renderer, line.avatar(), contentX, y + Math.max(0f, (effectiveLineHeight - HEAD_SIZE) * 0.5f), lineAlpha);
                    contentX += HEAD_SIZE + HEAD_GAP;
                }

                float textMaxWidth = Math.max(1f, panelWidth - contentX - PANEL_PADDING_X);
                renderer.pushClipRect((int)Math.floor(contentX), (int)Math.floor(y), (int)Math.ceil(textMaxWidth), (int)Math.ceil(effectiveLineHeight));
                renderer.text(font, contentX, y + centeredTextY(font, effectiveLineHeight, FONT_SIZE), FONT_SIZE, line.text(), textColor);
                renderer.popClipRect();
                y += effectiveLineHeight + PANEL_GAP * lineAlpha;
            }
        } finally {
            renderer.popTransform();
            renderer.popTransform();
        }
    }

    private static float getMessageOpacityMultiplier(int age) {
        double progress = 1.0D - (double) age / 200.0D;
        progress = Math.max(0.0D, Math.min(1.0D, progress * 10.0D));
        return (float) (progress * progress);
    }

    private static void renderInput(Renderer2D renderer, TextFieldWidget textField, int viewportWidth, int viewportHeight) {
        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        float inputFontSize = INPUT_FONT_SIZE * STYLE_SCALE;
        float inputHeight = INPUT_HEIGHT * STYLE_SCALE;
        float inputPaddingX = INPUT_PADDING_X * STYLE_SCALE;
        float inputMargin = INPUT_MARGIN * STYLE_SCALE;
        float caretWidth = CARET_WIDTH * STYLE_SCALE;
        float selectionRadius = SELECTION_RADIUS * STYLE_SCALE;
        boolean hideChatInfo = ChatOverlayState.hideChatInfo;

        TextFieldWidgetAccessor accessor = (TextFieldWidgetAccessor) textField;
        String fullText = textField.getText();
        int firstCharacterIndex = Math.max(0, accessor.getFirstCharacterIndex());
        int cursor = Math.max(0, Math.min(fullText.length(), textField.getCursor()));
        int selectionStart = Math.max(0, Math.min(fullText.length(), accessor.getSelectionStart()));
        int selectionEnd = Math.max(0, Math.min(fullText.length(), accessor.getSelectionEnd()));
        int selectionMin = Math.min(selectionStart, selectionEnd);
        int selectionMax = Math.max(selectionStart, selectionEnd);

        String visibleText = firstCharacterIndex >= fullText.length() ? "" : fullText.substring(firstCharacterIndex);
        String beforeCursor = fullText.substring(firstCharacterIndex, Math.max(firstCharacterIndex, cursor));
        String beforeSelection = fullText.substring(firstCharacterIndex, Math.max(firstCharacterIndex, selectionMin));
        String selectedText = selectionMin >= selectionMax ? "" : fullText.substring(selectionMin, selectionMax);
        float contentWidth = renderer.measureText(font, Text.literal(visibleText.isEmpty() || hideChatInfo ? " " : visibleText), inputFontSize).width;
        float desiredWidth = contentWidth + inputPaddingX * 2f + 2f * STYLE_SCALE;
        float width = Math.max(INPUT_MIN_WIDTH * STYLE_SCALE, Math.min(viewportWidth - inputMargin * 2f, desiredWidth));
        float x = inputMargin;
        float y = viewportHeight - inputHeight - inputMargin;
        float height = inputHeight;
        int rounding = Interface.getHudRoundedInt(6f * STYLE_SCALE) ;
        float visibility = CHAT_VISIBILITY.get();
        float animatedY = y + (1f - visibility) * CHAT_OPEN_OFFSET_Y;

        renderer.blur(x, animatedY, width, height, rounding, visibility);
        renderer.rect(x, animatedY, width, height, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.94f * visibility));
        renderer.rectOutline(x, animatedY, width, height, rounding, ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.10f * visibility), 1f);

        float textX = x + inputPaddingX;
        float textY = animatedY + centeredTextY(font, height, inputFontSize);

        if (!hideChatInfo && selectionMin != selectionMax) {
            float selectionX = textX + renderer.measureText(font, Text.literal(beforeSelection), inputFontSize).width;
            float selectionWidth = renderer.measureText(font, Text.literal(selectedText), inputFontSize).width;
            if (selectionWidth > 0f) {
                renderer.rect(
                        selectionX - 1f,
                        animatedY + 2f * STYLE_SCALE,
                        selectionWidth + 2f,
                        height - 4f * STYLE_SCALE,
                        selectionRadius,
                        ClientColors.applyAlpha(new Color(90, 140, 255).getRGB(), 0.28f * visibility)
                );
            }
        }

        if (!hideChatInfo && !visibleText.isEmpty()) {
            String prefix = CommandDispatcher.prefix;
            int prefixLen = prefix.length();
            if (fullText.startsWith(prefix) && firstCharacterIndex < prefixLen) {
                String visiblePrefix = prefix.substring(firstCharacterIndex);
                float prefixW = renderer.measureText(font, Text.literal(visiblePrefix), inputFontSize).width;
                renderer.text(font, textX, textY, inputFontSize, Text.literal(visiblePrefix), ClientColors.applyAlpha(ClientColors.ICON.getRGB(), visibility));
                String rest = visibleText.substring(visiblePrefix.length());
                if (!rest.isEmpty()) {
                    renderer.text(font, textX + prefixW, textY, inputFontSize, Text.literal(rest), ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), visibility));
                }
            } else {
                renderer.text(font, textX, textY, inputFontSize, Text.literal(visibleText), ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), visibility));
            }
        }

        if (!hideChatInfo && textField.isFocused() && ((MinecraftClient.getInstance().inGameHud.getTicks() / 6) & 1) == 0) {
            float caretX = textX + renderer.measureText(font, Text.literal(beforeCursor), inputFontSize).width;
            renderer.rect(caretX, animatedY + 2f * STYLE_SCALE, caretWidth, height - 4f * STYLE_SCALE, 0f, ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), visibility));
        }
    }

    private static void renderSuggestions(Renderer2D renderer, ChatScreen chatScreen, float viewportHeight) {
        if (ChatOverlayState.hideChatInfo) {
            return;
        }

        ChatInputSuggestor suggestor = ((ChatScreenAccessor) chatScreen).getChatInputSuggestor();
        if (suggestor == null) {
            return;
        }

        ChatInputSuggestorAccessor accessor = (ChatInputSuggestorAccessor) suggestor;
        ChatInputSuggestor.SuggestionWindow window = accessor.getWindow();
        if (window == null) {
            return;
        }

        SuggestionWindowAccessor windowAccessor = (SuggestionWindowAccessor) window;
        List<Suggestion> suggestions = windowAccessor.getSuggestions();
        Rect2i area = windowAccessor.getArea();
        if (suggestions == null || suggestions.isEmpty() || area == null) {
            return;
        }

        FontObject font = FontRegistry.SF_SEMIBOLD != null ? FontRegistry.SF_SEMIBOLD : FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }

        int selection = windowAccessor.getSelection();
        int startIndex = windowAccessor.getInWindowIndex();
        int endIndex = Math.min(suggestions.size(), startIndex + (int) SUGGESTION_MAX_VISIBLE);

        float inputFontSize = INPUT_FONT_SIZE * STYLE_SCALE;
        float maxTextWidth = 0f;
        for (int i = startIndex; i < endIndex; i++) {
            Suggestion suggestion = suggestions.get(i);
            float textWidth = renderer.measureText(font, Text.literal(suggestion.getText()), inputFontSize).width;
            maxTextWidth = Math.max(maxTextWidth, textWidth);
        }

        float paddingHorizontal = 12f * STYLE_SCALE;
        float calculatedWidth = maxTextWidth + paddingHorizontal;
        float x = area.getX();
        float width = Math.max(calculatedWidth, area.getWidth());
        float rowHeight = 14f * STYLE_SCALE;
        float height = Math.max(0f, (endIndex - startIndex) * rowHeight + 4f * STYLE_SCALE);
        float y = viewportHeight - height - 24f * STYLE_SCALE;
        int rounding = Interface.getHudRoundedInt(4f * STYLE_SCALE);
        float visibility = CHAT_VISIBILITY.get();
        float animatedY = y + (1f - visibility) * CHAT_OPEN_OFFSET_Y;

        renderer.blur(x, animatedY, width, height, rounding, visibility);
        renderer.rect(x, animatedY, width, height, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.96f * visibility));
        renderer.rectOutline(x, animatedY, width, height, rounding, ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.10f * visibility), 1f);

        float drawY = animatedY + 2f * STYLE_SCALE;
        for (int i = startIndex; i < endIndex; i++) {
            Suggestion suggestion = suggestions.get(i);
            boolean selected = i == selection;
            if (selected) {
                renderer.rect(x + 2f * STYLE_SCALE, drawY, width - 4f * STYLE_SCALE, rowHeight, 3f * STYLE_SCALE,
                        ClientColors.applyAlpha(ClientColors.ICON.getRGB(), 0.5f * visibility));
            }

            renderer.text(
                    font,
                    x + 6f * STYLE_SCALE,
                    drawY + centeredTextY(font, rowHeight, inputFontSize),
                    inputFontSize,
                    Text.literal(suggestion.getText()),
                    selected
                            ? ClientColors.applyAlpha(Color.WHITE.getRGB(), visibility)
                            : ClientColors.applyAlpha(ClientColors.TEXT.getRGB(), visibility)
            );
            drawY += rowHeight;
        }
    }

    private static float centeredTextY(FontObject font, float height, float size) {
        return FontRegistry.centeredBaselineOffset(font, 'H', size) + height * 0.5f;
    }

    private static void drawAvatar(Renderer2D renderer, ChatAvatar avatar, float x, float y, float alpha) {
        if (avatar == null) {
            return;
        }

        try {
            if (avatar.ircGif()) {
                Identifier gifFrame = getIrcGifFrame();
                if (gifFrame == null) {
                    return;
                }
                renderer.drawTextureRounded(gifFrame, x, y, HEAD_SIZE, HEAD_SIZE, ClientColors.applyAlpha(0xFFFFFFFF, alpha), 4f);
                return;
            }

            Identifier texture = avatar.texture();
            if (texture == null) {
                return;
            }

            int tint = ClientColors.applyAlpha(0xFFFFFFFF, alpha);
            float u0 = 8f / 64f;
            float v0 = 8f / 64f;
            float u1 = 16f / 64f;
            float v1 = 16f / 64f;
            float hatU0 = 40f / 64f;
            float hatV0 = 8f / 64f;
            float hatU1 = 48f / 64f;
            float hatV1 = 16f / 64f;

            renderer.drawTextureRegionRounded(texture, x, y, HEAD_SIZE, HEAD_SIZE, u0, v0, u1, v1, tint, 4f);
            if (avatar.showHat()) {
                renderer.drawTextureRegionRounded(texture, x, y, HEAD_SIZE, HEAD_SIZE, hatU0, hatV0, hatU1, hatV1, tint, 4f);
            }
        } catch (Throwable ignored) {
        }
    }

    private static MinecraftClient mc() {
        return MinecraftClient.getInstance();
    }

    private static ChatAvatar resolveAvatar(MinecraftClient mc, String rawMessage) {
        if (isIrcMessage(rawMessage)) {
            return new ChatAvatar(null, false, true);
        }

        PlayerListEntry sender = findSender(mc, rawMessage);
        if (sender != null && sender.getSkinTextures() != null && sender.getSkinTextures().body().texturePath() != null) {
            return new ChatAvatar(sender.getSkinTextures().body().texturePath(), sender.shouldShowHat(), false);
        }

        String nickname = extractLeadingNickname(rawMessage);
        if (nickname == null) {
            return null;
        }

        CachedSkin cached = SKIN_CACHE.computeIfAbsent(nickname.toLowerCase(Locale.ROOT), ignored -> {
            CachedSkin skin = new CachedSkin();
            requestSkinLoad(nickname, skin);
            return skin;
        });
        if (cached.texture != null) {
            return new ChatAvatar(cached.texture, cached.showHat, false);
        }
        if (!cached.loading && !cached.failed) {
            requestSkinLoad(nickname, cached);
        }
        return null;
    }

    private static PlayerListEntry findSender(MinecraftClient mc, String rawMessage) {
        if (mc == null || mc.getNetworkHandler() == null || rawMessage == null || rawMessage.isBlank()) {
            return null;
        }

        String extractedNickname = extractLeadingNickname(rawMessage);
        if (extractedNickname != null) {
            for (PlayerListEntry entry : mc.getNetworkHandler().getPlayerList()) {
                if (entry == null || entry.getProfile() == null || entry.getProfile().name() == null) {
                    continue;
                }
                if (entry.getProfile().name().equalsIgnoreCase(extractedNickname)) {
                    return entry;
                }
            }
        }

        String normalized = normalizeMessage(rawMessage);
        if (normalized.isEmpty()) {
            return null;
        }

        PlayerListEntry best = null;
        int bestLength = -1;
        for (PlayerListEntry entry : mc.getNetworkHandler().getPlayerList()) {
            if (entry == null || entry.getProfile() == null || entry.getProfile().name() == null) {
                continue;
            }

            String profileName = entry.getProfile().name();
            String displayName = entry.getDisplayName() != null ? normalizeMessage(entry.getDisplayName().getString()) : profileName;
            int matchLength = matchPlayerName(normalized, profileName, displayName);
            if (matchLength > bestLength) {
                bestLength = matchLength;
                best = entry;
            }
        }

        return bestLength > 0 ? best : null;
    }

    private static int matchPlayerName(String message, String profileName, String displayName) {
        int best = 0;
        if (containsLeadingName(message, profileName)) {
            best = Math.max(best, profileName.length());
        }
        if (displayName != null && containsLeadingName(message, displayName)) {
            best = Math.max(best, displayName.length());
        }
        return best;
    }

    private static boolean containsLeadingName(String message, String name) {
        if (name == null || name.isBlank()) {
            return false;
        }

        String normalizedName = normalizeMessage(name);
        if (normalizedName.isEmpty()) {
            return false;
        }

        String lowerMessage = message.toLowerCase(Locale.ROOT);
        String lowerName = normalizedName.toLowerCase(Locale.ROOT);
        int limit = Math.min(lowerMessage.length(), 48);
        for (int i = 0; i <= limit - lowerName.length(); i++) {
            if (!lowerMessage.regionMatches(i, lowerName, 0, lowerName.length())) {
                continue;
            }

            boolean startOk = i == 0 || !isNicknameChar(lowerMessage.charAt(i - 1));
            boolean endOk = i + lowerName.length() >= lowerMessage.length() || !isNicknameChar(lowerMessage.charAt(i + lowerName.length()));
            if (startOk && endOk) {
                return true;
            }
        }
        return false;
    }

    private static String normalizeMessage(String input) {
        if (input == null || input.isBlank()) {
            return "";
        }

        return input
                .replace('\u00A0', ' ')
                .replaceAll("^[\\s<\\[\\(Р’В»РІР‚С”]+", "")
                .trim();
    }

    private static String extractLeadingNickname(String input) {
        if (input == null || input.isBlank()) {
            return null;
        }

        String normalized = normalizeMessage(input);
        if (normalized.isEmpty()) {
            return null;
        }

        int limit = Math.min(normalized.length(), 72);
        String best = null;
        for (int i = 0; i < limit; i++) {
            if (!isNicknameChar(normalized.charAt(i))) {
                continue;
            }

            int end = i + 1;
            while (end < limit && isNicknameChar(normalized.charAt(end))) {
                end++;
            }

            String token = normalized.substring(i, end);
            if (isLikelyNickname(token)) {
                best = token;
            }
            i = end;
        }
        return best;
    }

    private static boolean isNicknameChar(char ch) {
        return (ch >= 'a' && ch <= 'z')
                || (ch >= 'A' && ch <= 'Z')
                || (ch >= '0' && ch <= '9')
                || ch == '_';
    }

    private static boolean isLikelyNickname(String token) {
        if (token == null || token.length() < 3 || token.length() > 16) {
            return false;
        }
        return !token.chars().allMatch(Character::isDigit);
    }

    private static boolean isIrcMessage(String rawMessage) {
        String normalized = normalizeMessage(rawMessage).toLowerCase(Locale.ROOT);
        return normalized.startsWith("irc chat");
    }

    private static Identifier getIrcGifFrame() {
        GifTexture gif = GifTexture.getCached(IRC_GIF);
        if (gif == null || gif.getCurrentFrame() == null) {
            GifTexture.queueLoad(IRC_GIF);
            return null;
        }
        return gif.getCurrentFrame();
    }

    private static void cleanupAnimations(Map<String, Boolean> seen, long now) {
        LINE_ANIMATIONS.entrySet().removeIf(entry -> !seen.containsKey(entry.getKey()) && now - entry.getValue().createdAt() > 5000L);
    }

    private static void requestSkinLoad(String nickname, CachedSkin cache) {
        if (cache.loading) {
            return;
        }

        cache.loading = true;
        CompletableFuture.supplyAsync(() -> loadSkinTexture(nickname), Util.getMainWorkerExecutor())
                .whenComplete((result, throwable) -> {
                    MinecraftClient client = MinecraftClient.getInstance();
                    if (client == null) {
                        cache.loading = false;
                        cache.failed = true;
                        return;
                    }

                    client.execute(() -> {
                        cache.loading = false;
                        if (throwable != null || result == null || result.texture() == null) {
                            cache.failed = true;
                            return;
                        }

                        cache.failed = false;
                        cache.texture = result.texture();
                        cache.showHat = result.showHat();
                        try {
                            if (client.getTextureManager() != null) {
                                client.getTextureManager().getTexture(result.texture());
                            }
                        } catch (Throwable ignored) {
                        }
                    });
                });
    }

    private static SkinLookupResult loadSkinTexture(String nickname) {
        try {
            UUID uuid = resolveUuidByNameAny(nickname);
            if (uuid == null) {
                return null;
            }

            MinecraftClient client = MinecraftClient.getInstance();
            if (client == null || client.getSkinProvider() == null) {
                return null;
            }

            GameProfile profile = new GameProfile(uuid, nickname);
            TextureProperty property = resolveTextureProperty(uuid);
            if (property != null && property.value() != null && !property.value().isBlank()) {
                if (property.signature() != null && !property.signature().isBlank()) {
                    profile.properties().put("textures", new Property("textures", property.value(), property.signature()));
                } else {
                    profile.properties().put("textures", new Property("textures", property.value()));
                }
            }

            Optional<SkinTextures> textures = client.getSkinProvider()
                    .fetchSkinTextures(profile)
                    .get(10, TimeUnit.SECONDS);
            if (textures.isEmpty() || textures.get().body().texturePath() == null) {
                return null;
            }

            return new SkinLookupResult(textures.get().body().texturePath(), true);
        } catch (Exception ignored) {
            return null;
        }
    }

    private static UUID resolveUuidByNameAny(String nickname) throws IOException, InterruptedException {
        UUID mojang = resolveUuidByNameMojang(nickname);
        if (mojang != null) {
            return mojang;
        }
        return resolveUuidByNameAshcon(nickname);
    }

    private static UUID resolveUuidByNameMojang(String nickname) throws IOException, InterruptedException {
        String encoded = URLEncoder.encode(nickname, StandardCharsets.UTF_8);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.mojang.com/users/profiles/minecraft/" + encoded))
                .header("Accept", "application/json")
                .timeout(Duration.ofSeconds(6))
                .GET()
                .build();

        HttpResponse<String> response = SKIN_HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (response.statusCode() != 200) {
            return null;
        }

        JsonObject object = JsonParser.parseString(response.body()).getAsJsonObject();
        if (!object.has("id")) {
            return null;
        }

        String rawId = object.get("id").getAsString();
        if (rawId.length() != 32) {
            return null;
        }

        String uuid = rawId.substring(0, 8) + "-" + rawId.substring(8, 12) + "-" + rawId.substring(12, 16) + "-"
                + rawId.substring(16, 20) + "-" + rawId.substring(20, 32);
        return UUID.fromString(uuid);
    }

    private static UUID resolveUuidByNameAshcon(String nickname) throws IOException, InterruptedException {
        String encoded = URLEncoder.encode(nickname, StandardCharsets.UTF_8);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.ashcon.app/mojang/v2/user/" + encoded))
                .header("Accept", "application/json")
                .timeout(Duration.ofSeconds(6))
                .GET()
                .build();

        HttpResponse<String> response = SKIN_HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (response.statusCode() != 200) {
            return null;
        }

        JsonObject object = JsonParser.parseString(response.body()).getAsJsonObject();
        if (!object.has("uuid")) {
            return null;
        }

        String raw = object.get("uuid").getAsString();
        return raw == null || raw.isBlank() ? null : UUID.fromString(raw);
    }

    private static TextureProperty resolveTextureProperty(UUID uuid) throws IOException, InterruptedException {
        String rawUuid = uuid.toString().replace("-", "");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://sessionserver.mojang.com/session/minecraft/profile/" + rawUuid + "?unsigned=false"))
                .header("Accept", "application/json")
                .timeout(Duration.ofSeconds(6))
                .GET()
                .build();

        HttpResponse<String> response = SKIN_HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (response.statusCode() != 200) {
            return null;
        }

        JsonObject object = JsonParser.parseString(response.body()).getAsJsonObject();
        if (!object.has("properties")) {
            return null;
        }

        JsonArray properties = object.getAsJsonArray("properties");
        for (int i = 0; i < properties.size(); i++) {
            JsonObject property = properties.get(i).getAsJsonObject();
            if (!property.has("name") || !"textures".equals(property.get("name").getAsString())) {
                continue;
            }

            String value = property.has("value") ? property.get("value").getAsString() : null;
            String signature = property.has("signature") ? property.get("signature").getAsString() : null;
            return new TextureProperty(value, signature);
        }
        return null;
    }

    private static Text orderedTextToText(OrderedText orderedText) {
        MutableText result = Text.empty();
        if (orderedText == null) {
            return result;
        }

        StringBuilder builder = new StringBuilder();
        Style[] currentStyle = new Style[]{Style.EMPTY};

        orderedText.accept((index, style, codePoint) -> {
            Style resolvedStyle = style == null ? Style.EMPTY : style;
            if (!resolvedStyle.equals(currentStyle[0]) && builder.length() > 0) {
                result.append(Text.literal(builder.toString()).setStyle(currentStyle[0]));
                builder.setLength(0);
            }
            currentStyle[0] = resolvedStyle;
            builder.appendCodePoint(codePoint);
            return true;
        });

        if (builder.length() > 0) {
            result.append(Text.literal(builder.toString()).setStyle(currentStyle[0]));
        }
        return result;
    }

    private record ChatAnimationState(long createdAt) {
        private float appearProgress(long now) {
            float t = Math.max(0f, Math.min(1f, (float) (now - createdAt) / APPEAR_ANIMATION_MS));
            return 1f - (float) Math.pow(1f - t, 3);
        }
    }

    private static final class VisibilityAnimation {
        private float value;
        private float startValue;
        private float targetValue;
        private long startTime;

        private void update(boolean visible) {
            float target = visible ? 1f : 0f;
            if (target == targetValue && (visible || value <= 0f)) {
                value = compute(System.currentTimeMillis());
                return;
            }

            float current = compute(System.currentTimeMillis());
            if (target != targetValue) {
                startValue = current;
                targetValue = target;
                startTime = System.currentTimeMillis();
            }
            value = current;
        }

        private float get() {
            value = compute(System.currentTimeMillis());
            return value;
        }

        private float compute(long now) {
            if (startTime == 0L) {
                return targetValue;
            }

            float t = Math.max(0f, Math.min(1f, (float) (now - startTime) / CHAT_VISIBILITY_ANIMATION_MS));
            float eased = 1f - (float) Math.pow(1f - t, 3);
            return startValue + (targetValue - startValue) * eased;
        }
    }

    private static final class CachedSkin {
        private volatile Identifier texture;
        private volatile boolean showHat;
        private volatile boolean loading;
        private volatile boolean failed;
    }

    private record TextureProperty(String value, String signature) {
    }

    private record SkinLookupResult(Identifier texture, boolean showHat) {
    }

    private record ChatAvatar(Identifier texture, boolean showHat, boolean ircGif) {
    }

    private record RenderedLine(Text text, float alpha, ChatAvatar avatar, float appearProgress, int addedTime) {
        private RenderedLine withAvatar(ChatAvatar avatar) {
            return new RenderedLine(text, alpha, avatar, appearProgress, addedTime);
        }
    }

    public interface TextFieldWidgetProvider {
        TextFieldWidget nexis$getChatField();
    }
}
