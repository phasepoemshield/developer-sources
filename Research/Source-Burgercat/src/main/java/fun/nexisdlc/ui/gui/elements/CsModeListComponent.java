package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class CsModeListComponent extends CsSettingComponent<ModeListSetting> {
    public static CsModeListComponent openDropdown = null;

    private final SimpleLinearAnimation expandAnim = new SimpleLinearAnimation(260);
    private final List<SimpleLinearAnimation> itemHover = new ArrayList<>();
    private final List<SimpleLinearAnimation> itemAppear = new ArrayList<>();
    private final List<SimpleLinearAnimation> itemToggle = new ArrayList<>();
    private final List<SimpleLinearAnimation> itemTextColor = new ArrayList<>();
    private final List<SimpleLinearAnimation> itemPress = new ArrayList<>();
    private long expandStart = 0L;

    private static final float HEADER_H = 20f;
    private static final float BUTTON_GAP = 7f;
    private static final float BUTTON_H = 29f;
    private static final float ITEM_H = 26f;
    private static final float ITEM_GAP = 3f;
    private static final float DROPDOWN_PAD = 5f;
    private static final float DROPDOWN_INNER_PAD = 5f;
    private static final float HOVER_EXPAND = 0.8f;

    CsModeListComponent(ModeListSetting setting, float width) {
        super(setting, width, HEADER_H + BUTTON_GAP + BUTTON_H);
        expandAnim.setEasing(Easings.EASE_OUT_QUART);
    }

    public boolean isExpanded() {
        return openDropdown == this;
    }

    public void setExpanded(boolean v) {
        if (v) {
            if (openDropdown != null && openDropdown != this) openDropdown.setExpanded(false);
            openDropdown = this;
            expandStart = System.currentTimeMillis();
            for (SimpleLinearAnimation a : itemHover) {
                a.setDuration(0);
                a.hide();
                a.setDuration(220);
            }
            for (SimpleLinearAnimation a : itemAppear) {
                a.setDuration(0);
                a.hide();
                a.setDuration(280);
            }
            for (SimpleLinearAnimation a : itemPress) {
                a.setDuration(0);
                a.hide();
                a.setDuration(320);
            }
        } else if (openDropdown == this) {
            openDropdown = null;
        }
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        boolean expanded = isExpanded();
        if (expanded) expandAnim.show();
        else expandAnim.hide();

        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        drawAnimatedSettingText(render, rowX, y + 12f, rowW, 13.5f,
                setting.getName(), withAlpha(COLOR_NAME, alpha));

        float btnY = y + HEADER_H + BUTTON_GAP;
        boolean hovBtn = hovered(mouseX, mouseY, rowX, btnY, rowW, BUTTON_H);
        if (hovBtn) {
            CursorHelper.setHand();
            hoverAnimation.show();
        } else {
            hoverAnimation.hide();
        }
        float hp = hoverAnimation.getProgress();
        int btnBg = withAlpha(0xFFFFFF, (int) (alpha * (0.08f + 0.04f * hp)));
        render.rect(rowX, btnY, rowW, BUTTON_H, 7f, btnBg);

        String valueText = currentValueText();
        float chevW = 15f;
        float chevInset = 9f;
        float valueAvail = rowW - chevW - chevInset - 22f;
        int valueCol = valueText.equals("None")
                ? withAlpha(COLOR_VALUE, alpha)
                : withAlpha(COLOR_SECONDARY, alpha);
        drawAnimatedSettingText(render, rowX + 11f, centeredTextBaseline(btnY, BUTTON_H, 13f),
                valueAvail, 13f, valueText, valueCol);

        float chevX = rowX + rowW - chevW - chevInset;
        float chevY = btnY + BUTTON_H * 0.5f;
        float expandP = expandAnim.getProgress();
        drawChevron(render, chevX + chevW * 0.5f, chevY, expandP, withAlpha(0xE6E8F0, alpha));

        float dropdownH = dropdownHeight();
        height = HEADER_H + BUTTON_GAP + BUTTON_H + (dropdownH + DROPDOWN_PAD) * expandP;

        if (expandP > 0.01f) {
            drawDropdown(render, rowX, btnY + BUTTON_H + DROPDOWN_PAD, rowW,
                    mouseX, mouseY, alpha, expandP);
        }
    }

    private String currentValueText() {
        String joined = setting.get().stream()
                .filter(BooleanSetting::get)
                .map(Setting::getName)
                .collect(Collectors.joining(", "));
        return joined.isEmpty() ? "None" : joined;
    }

    private float dropdownHeight() {
        int n = setting.get().size();
        if (n <= 0) return ITEM_H;
        return DROPDOWN_INNER_PAD * 2f + n * ITEM_H + (n - 1) * ITEM_GAP;
    }

    private void drawChevron(Renderer2D render, float cx, float cy, float openP, int color) {
        float arm = 4.5f;
        float thick = 2f;
        float dir = 1f - openP * 2f;
        float tipY = cy + dir * 2f;
        float baseY = tipY - dir * arm;
        int steps = 7;
        for (int i = 0; i < steps; i++) {
            float t = i / (float) (steps - 1);
            float ox = arm * (1f - t);
            float yy = baseY + (tipY - baseY) * t;
            render.rect(cx - ox - thick * 0.5f, yy - thick * 0.5f, thick, thick, 0f, color);
            render.rect(cx + ox - thick * 0.5f, yy - thick * 0.5f, thick, thick, 0f, color);
        }
    }

    private float itemTopAt(int i, float baseY, float[] slides) {
        return baseY + i * (ITEM_H + ITEM_GAP) + slides[i];
    }

    private void drawDropdown(Renderer2D render, float x, float y, float w, int mouseX, int mouseY, int alpha, float progress) {
        List<BooleanSetting> items = setting.get();
        int n = items.size();
        if (n <= 0) return;

        float ddH = dropdownHeight();
        int containerAlpha = (int) (alpha * progress);
        int containerBg = withAlpha(0xFFFFFF, (int) (containerAlpha * 0.05f));
        render.rect(x, y, w, ddH, 7f, containerBg);

        long elapsed = System.currentTimeMillis() - expandStart;
        float baseY = y + DROPDOWN_INNER_PAD;
        float innerX = x + DROPDOWN_INNER_PAD;
        float innerW = w - DROPDOWN_INNER_PAD * 2f;

        render.pushClipRect((int) Math.floor(x), (int) Math.floor(y),
                (int) Math.ceil(w) + 1, (int) Math.ceil(ddH) + 1);

        float[] slides = new float[n];
        float[] appearAlphas = new float[n];
        float[] toggles = new float[n];
        float[] textColors = new float[n];
        float[] hovers = new float[n];
        float[] presses = new float[n];
        int[] itemAs = new int[n];

        for (int i = 0; i < n; i++) {
            while (itemHover.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(220);
                a.setEasing(Easings.EASE_OUT_CUBIC);
                itemHover.add(a);
            }
            while (itemAppear.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(280);
                a.setEasing(Easings.EASE_OUT_QUART);
                itemAppear.add(a);
            }
            while (itemToggle.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(240);
                a.setEasing(Easings.EASE_OUT_CUBIC);
                itemToggle.add(a);
            }
            while (itemTextColor.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(340);
                a.setEasing(Easings.EASE_OUT_CUBIC);
                itemTextColor.add(a);
            }
            while (itemPress.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(320);
                a.setEasing(Easings.EASE_OUT_CUBIC);
                itemPress.add(a);
            }
            SimpleLinearAnimation app = itemAppear.get(i);
            if (isExpanded()) {
                long delay = i * 35L;
                if (elapsed >= delay) app.show();
            } else {
                app.hide();
            }
            appearAlphas[i] = app.getProgress();
            slides[i] = (1f - appearAlphas[i]) * 10f;

            BooleanSetting item = items.get(i);
            SimpleLinearAnimation tog = itemToggle.get(i);
            SimpleLinearAnimation textColor = itemTextColor.get(i);
            if (item.get()) {
                tog.show();
                textColor.show();
            } else {
                tog.hide();
                textColor.hide();
            }
            toggles[i] = tog.getProgress();
            textColors[i] = textColor.getProgress();

            itemAs[i] = (int) (alpha * progress * Math.max(0.05f, appearAlphas[i]));
        }

        boolean[] hoveredFlags = new boolean[n];
        for (int i = 0; i < n; i++) {
            SimpleLinearAnimation hov = itemHover.get(i);
            SimpleLinearAnimation press = itemPress.get(i);
            float itemTop = itemTopAt(i, baseY, slides);
            float hitExpand = HOVER_EXPAND * hov.getProgress();
            float hitY = itemTop - hitExpand * 0.5f - press.getProgress() * 0.5f;
            float hitH = ITEM_H + hitExpand;
            boolean isHov = hovered(mouseX, mouseY, innerX, hitY, innerW, hitH);
            hoveredFlags[i] = isHov;
            if (isHov) {
                CursorHelper.setHand();
                hov.show();
            } else {
                hov.hide();
                press.hide();
            }
            hovers[i] = hov.getProgress();
            presses[i] = press.getProgress();
        }

        for (int k = 0; k < n; k++) {
            float itemTop = itemTopAt(k, baseY, slides);
            int itemA = itemAs[k];
            float hpItem = hovers[k];
            float pressP = presses[k];
            float toggleP = toggles[k];
            float textColorP = textColors[k];
            BooleanSetting item = items.get(k);

            float expand = HOVER_EXPAND * hpItem;
            float drawY = itemTop - expand * 0.5f - pressP * 0.5f;
            float drawH = ITEM_H + expand;
            float itemScale = drawH / ITEM_H;

            float boxW = 20f;
            float boxH = 16f;
            float boxX = innerX + 7f;
            float boxY = drawY + (drawH - boxH) * 0.5f;
            int boxOff = withAlpha(0xFFFFFF, (int) (itemA * 0.14f));
            int boxOn = scaleAlpha(ClientColors.ICON.getRGB(), itemA);
            render.rect(boxX, boxY, boxW, boxH, 5f, blend(boxOff, boxOn, toggleP));
            if (toggleP > 0.05f) {
                drawCheckMark(render, boxX, boxY, boxW, boxH, withAlpha(0xFFFFFF, (int) (itemA * toggleP)), toggleP, 2f);
            }

            int textCol = blend(withAlpha(COLOR_SECONDARY, itemA),
                    scaleAlpha(ClientColors.ICON.getRGB(), itemA), textColorP);
            float textShift = hpItem * 2f;
            float textSize = 13f * itemScale;
            drawAnimatedSettingText(render, boxX + boxW + 9f + textShift,
                    centeredTextBaseline(drawY, drawH, textSize),
                    innerW - (boxW + 26f) - textShift, textSize, item.getName(), textCol);
        }

        render.popClipRect();
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) return;
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float btnY = y + HEADER_H + BUTTON_GAP;
        if (hovered(mx, my, rowX, btnY, rowW, BUTTON_H)) {
            setExpanded(!isExpanded());
            return;
        }
        if (!isExpanded()) return;
        float ddY = btnY + BUTTON_H + DROPDOWN_PAD;
        float innerX = rowX + DROPDOWN_INNER_PAD;
        float innerW = rowW - DROPDOWN_INNER_PAD * 2f;
        float baseY = ddY + DROPDOWN_INNER_PAD;
        List<BooleanSetting> items = setting.get();
        float ddH = dropdownHeight();
        boolean insideDropdown = hovered(mx, my, rowX, ddY, rowW, ddH);
        for (int i = 0; i < items.size(); i++) {
            float itemTop = baseY + i * (ITEM_H + ITEM_GAP);
            float hoverP = i < itemHover.size() ? itemHover.get(i).getProgress() : 0f;
            float pressP = i < itemPress.size() ? itemPress.get(i).getProgress() : 0f;
            float hitExpand = HOVER_EXPAND * hoverP;
            float hitY = itemTop - hitExpand * 0.5f - pressP * 0.5f;
            float hitH = ITEM_H + hitExpand;
            if (hovered(mx, my, innerX, hitY, innerW, hitH)) {
                while (itemPress.size() <= i) {
                    SimpleLinearAnimation a = new SimpleLinearAnimation(320);
                    a.setEasing(Easings.EASE_OUT_CUBIC);
                    itemPress.add(a);
                }
                SimpleLinearAnimation press = itemPress.get(i);
                press.setDuration(160);
                press.show();
                press.setDuration(320);
                BooleanSetting it = items.get(i);
                it.set(!it.get());
                return;
            }
        }
        if (!insideDropdown) setExpanded(false);
    }
}
