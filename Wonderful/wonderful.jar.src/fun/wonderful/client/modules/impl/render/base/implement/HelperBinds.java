package fun.wonderful.client.modules.impl.render.base.implement;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.modules.impl.misc.ServerHelper;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemConvertible;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class HelperBinds
extends InterfaceProcessing {
    private final AnimationUtils widthAnimation = new AnimationUtils(80.0f, 10.5f, Easings.QUAD_OUT);

    public HelperBinds(Draggable draggable) {
        super(draggable);
    }

    private Font issue(int size) {
        return Fonts.getFont("sf_regular", size);
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        List<ServerHelper.HelperBind> binds = this.getVisibleBinds();
        if (binds.isEmpty()) {
            this.widthAnimation.update(0.0f);
            this.draggable.setWidth(0.0f);
            this.draggable.setHeight(0.0f);
            return;
        }
        this.DefaultStyle(eventRender, binds);
        super.onRender(eventRender);
    }

    private List<ServerHelper.HelperBind> getVisibleBinds() {
        ServerHelper serverHelper = ServerHelper.INSTANCE;
        ArrayList<ServerHelper.HelperBind> binds = new ArrayList<ServerHelper.HelperBind>();
        if (serverHelper == null) {
            return binds;
        }
        List<ServerHelper.HelperBind> helperBinds = serverHelper.getActiveHelperBinds();
        for (ServerHelper.HelperBind bind : helperBinds) {
            if (bind.bind().getKey() == -1) continue;
            binds.add(bind);
        }
        return binds;
    }

    private void DefaultStyle(EventRender.Default eventRender, List<ServerHelper.HelperBind> binds) {
        MatrixStack matrices = eventRender.getContext().getMatrices();
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        int colorTheme = this.getThemeColor();
        int fontSize = 13;
        Font keyFont = this.issue(fontSize);
        float height = 19.0f;
        float itemSize = 9.8f;
        float itemScale = 0.61f;
        float fontGap = 2.8f;
        float cellGap = 5.0f;
        float sidePadding = 6.0f;
        float width = this.getCompactWidth(binds, keyFont, itemSize, fontGap, cellGap, sidePadding, 60.0f);
        this.widthAnimation.update(width);
        float animatedWidth = this.widthAnimation.getValue();
        this.drawDefaultPanel(matrices, x2, y2, animatedWidth, height, colorTheme);
        if (binds.isEmpty()) {
            this.issue(12).draw(matrices, "Helper", x2 + 5.0f, y2 + 6.0f, ColorUtils.rgba(255, 255, 255, 255));
            this.draggable.setWidth(animatedWidth);
            this.draggable.setHeight(height);
            return;
        }
        this.drawCompactBinds(eventRender.getContext(), binds, keyFont, x2, y2, height, itemSize, itemScale, fontGap, cellGap, sidePadding, 8.2f);
        this.draggable.setWidth(animatedWidth);
        this.draggable.setHeight(height);
    }

    private float getCompactWidth(List<ServerHelper.HelperBind> binds, Font keyFont, float itemSize, float fontGap, float cellGap, float sidePadding, float emptyWidth) {
        if (binds.isEmpty()) {
            return emptyWidth;
        }
        float width = sidePadding * 2.0f;
        for (int i2 = 0; i2 < binds.size(); ++i2) {
            String keyName = KeyBoardUtils.getBindName(binds.get(i2).bind().getKey());
            width += itemSize + fontGap + keyFont.getWidth(keyName);
            if (i2 >= binds.size() - 1) continue;
            width += cellGap;
        }
        return width;
    }

    private void drawCompactBinds(DrawContext context, List<ServerHelper.HelperBind> binds, Font keyFont, float x2, float y2, float height, float itemSize, float itemScale, float fontGap, float cellGap, float sidePadding, float textOffsetY) {
        MatrixStack matrices = context.getMatrices();
        float offsetX = x2 + sidePadding;
        float itemY = y2 + (height - itemSize) * 0.5f;
        float textY = y2 + textOffsetY;
        for (int i2 = 0; i2 < binds.size(); ++i2) {
            ServerHelper.HelperBind bind = binds.get(i2);
            String keyName = KeyBoardUtils.getBindName(bind.bind().getKey());
            this.drawItemIcon(context, new ItemStack((ItemConvertible)bind.item()), offsetX, itemY, itemScale);
            keyFont.draw(matrices, keyName, offsetX + itemSize + fontGap, textY, ColorUtils.rgba(255, 255, 255, 255));
            offsetX += itemSize + fontGap + keyFont.getWidth(keyName);
            if (i2 >= binds.size() - 1) continue;
            offsetX += cellGap;
        }
    }

    private void drawItemIcon(DrawContext context, ItemStack stack, float x2, float y2, float scale) {
        MatrixStack matrices = context.getMatrices();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        matrices.push();
        matrices.translate(x2, y2, 0.0f);
        matrices.scale(scale, scale, 1.0f);
        context.drawItem(stack, 0, 0);
        matrices.pop();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableDepthTest();
    }

    private void drawDefaultPanel(MatrixStack matrices, float x2, float y2, float width, float height, int colorTheme) {
        RenderUtils.drawGradientRect(matrices, x2, y2, width, height, 3.0f, ColorUtils.setAlphaColor(ColorUtils.darken(colorTheme, 0.15f), 255), ColorUtils.setAlphaColor(ColorUtils.darken(colorTheme, 0.05f), 255));
        if (this.isUnusualRectType()) {
            RenderUtils.drawHudSquarePattern(matrices, x2, y2, width, height, colorTheme);
        }
    }

    private int getThemeColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }
}