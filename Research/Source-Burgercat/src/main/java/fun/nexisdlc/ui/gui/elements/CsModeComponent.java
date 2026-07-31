package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public final class CsModeComponent extends CsSettingComponent<ModeSetting> {
    private final List<SimpleLinearAnimation> selAnims = new ArrayList<>();
    private final List<SimpleLinearAnimation> hovAnims = new ArrayList<>();
    private final List<SimpleLinearAnimation> pressAnims = new ArrayList<>();
    private final List<Chip> chips = new ArrayList<>();
    private int lastPressedIndex = -1;
    private long lastPressMs = 0L;

    CsModeComponent(ModeSetting setting, float width) {
        super(setting, width, 47f);
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        layout(x, y);
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        drawAnimatedSettingText(render, rowX, y + 11.5f, rowW, 13.5f,
                setting.getName(), withAlpha(COLOR_NAME, alpha));

        if (lastPressedIndex >= 0 && System.currentTimeMillis() - lastPressMs > 240L) {
            if (lastPressedIndex < pressAnims.size()) pressAnims.get(lastPressedIndex).hide();
            lastPressedIndex = -1;
        }

        for (int i = 0; i < chips.size(); i++) {
            while (selAnims.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(395);
                a.setEasing(Easings.EASE_OUT_BACK);
                selAnims.add(a);
            }
            while (hovAnims.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(395);
                a.setEasing(Easings.EASE_OUT_CUBIC);
                hovAnims.add(a);
            }
            while (pressAnims.size() <= i) {
                SimpleLinearAnimation a = new SimpleLinearAnimation(435);
                a.setEasing(Easings.EASE_OUT_CUBIC);
                pressAnims.add(a);
            }
            Chip chip = chips.get(i);
            SimpleLinearAnimation sel = selAnims.get(i);
            SimpleLinearAnimation hov = hovAnims.get(i);
            SimpleLinearAnimation press = pressAnims.get(i);
            boolean isSel = setting.strings[i].equalsIgnoreCase(setting.get());
            if (isSel) sel.show();
            else sel.hide();
            boolean isHov = hovered(mouseX, mouseY, chip.x(), chip.y(), chip.w(), chip.h());
            if (isHov) {
                CursorHelper.setHand();
                hov.show();
            } else {
                hov.hide();
            }
            float sp = sel.getProgress();
            float hp = hov.getProgress();
            float pp = press.getProgress();

            float scaleBoost = 1f + 0.05f * hp - 0.07f * pp;
            float cx = chip.x() + chip.w() * 0.5f;
            float cy = chip.y() + chip.h() * 0.5f;
            float cw = chip.w() * scaleBoost;
            float ch = chip.h() * scaleBoost;
            float drawX = cx - cw * 0.5f;
            float drawY = cy - ch * 0.5f;

            int bg = blend(withAlpha(0xFFFFFF, (int) (alpha * (0.10f + 0.06f * hp))),
                    scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.92f)), sp);
            int textCol = blend(withAlpha(COLOR_SECONDARY, alpha), withAlpha(0xFFFFFF, alpha), sp);
            render.rect(drawX, drawY, cw, ch, 7f, bg);
            String label = setting.strings[i];
            float textSize = 13f * scaleBoost;
            render.text(FontRegistry.SF_MEDIUM, drawX + (cw - textWidth(label, textSize)) * 0.5f,
                    centeredTextBaseline(drawY, ch, textSize), textSize, label, textCol);
        }
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        if (button != GLFW.GLFW_MOUSE_BUTTON_LEFT) return;
        layout(x, y);
        for (int i = 0; i < chips.size(); i++) {
            Chip chip = chips.get(i);
            if (hovered(mx, my, chip.x(), chip.y(), chip.w(), chip.h())) {
                setting.set(setting.strings[i]);
                while (pressAnims.size() <= i) {
                    SimpleLinearAnimation a = new SimpleLinearAnimation(435);
                    a.setEasing(Easings.EASE_OUT_CUBIC);
                    pressAnims.add(a);
                }
                SimpleLinearAnimation press = pressAnims.get(i);
                press.setDuration(180);
                press.show();
                press.setDuration(435);
                lastPressedIndex = i;
                lastPressMs = System.currentTimeMillis();
                return;
            }
        }
    }

    private void layout(float x, float y) {
        chips.clear();
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float chipH = 22f;
        float chipY = y + 22f;
        float chipX = rowX;
        float right = rowX + rowW;
        for (int i = 0; i < setting.strings.length; i++) {
            String value = setting.strings[i];
            float chipW = Math.max(38f, textWidth(value, 13f) + 20f);
            chipW = Math.min(chipW, rowW);
            if (chipX > rowX && chipX + chipW > right) {
                chipX = rowX;
                chipY += chipH + 5f;
            }
            chips.add(new Chip(chipX, chipY, chipW, chipH));
            chipX += chipW + 6f;
        }
        height = Math.max(47f, chipY + chipH - y + 5f);
    }
}
