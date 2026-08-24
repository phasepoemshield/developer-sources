package moscow.rockstar.ui.mainmenu;

import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.module.visuals.Interface;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.game.cursor.CursorType;
import moscow.rockstar.util.game.cursor.CursorUtility;
import moscow.rockstar.util.render.obj.Rect;

import static moscow.rockstar.util.interfaces.IMinecraft.mc;

public class CustomButton extends Rect {
    private final String icon;
    private final float iconSize;
    private final Runnable onClick;
    private final ColorRGBA backgroundColor = new ColorRGBA(58.0f, 58.0f, 58.0f);
    private final Animation activeAnim = new Animation(400L, 0.0f, Easing.BAKEK);
    private final Animation hoverAnim = new Animation(300L, 0.0f, Easing.FIGMA_EASE_IN_OUT);

    public void draw(UIContext context) {
        if (this.hovered(context.getMouseX(), context.getMouseY()) && this.activeAnim.getValue() == 1.0f) {
            CursorUtility.set(CursorType.HAND);
        }
        this.hoverAnim.update(this.hovered(context.getMouseX(), context.getMouseY()) && this.activeAnim.getValue() == 1.0f);

        if (mc.world == null) {
            Rockstar.getInstance().getModuleManager().getModule(Interface.class)
                    .getLiquidGlassAnim().update(Interface.glassSelected());
        }

        float alpha = this.activeAnim.getValue();
        float hover = this.hoverAnim.getValue();
        float radius = Math.min(this.width, this.height) / 2.0f;
        BorderRadius br = BorderRadius.all(radius);

        if (Interface.showGlass()) {
            context.drawLiquidGlass(this.x - 1.0f, this.y - 1.0f,
                    this.width + 2.0f, this.height + 2.0f,
                    7.0f, 0.08f, br,
                    ColorRGBA.WHITE.withAlpha(255.0f * alpha));
            context.drawRoundedRect(this.x, this.y, this.width, this.height, br,
                    this.backgroundColor.withAlpha(255.0f * (0.15f * alpha + 0.15f * hover)));
        } else {
            context.drawRoundedRect(this.x, this.y, this.width, this.height, br,
                    this.backgroundColor.withAlpha(255.0f * (0.33f * alpha + 0.2f * hover)));
        }

        context.drawTexture(Rockstar.id(this.icon),
                this.x + (this.width - this.iconSize) / 2.0f,
                this.y + (this.height - this.iconSize) / 2.0f,
                this.iconSize, this.iconSize,
                ColorRGBA.WHITE.withAlpha(255.0f * alpha));
    }

    public void click(double mouseX, double mouseY, int button) {
        if (this.hovered(mouseX, mouseY) && button == 0 && this.activeAnim.getValue() == 1.0f) {
            this.onClick.run();
        }
    }

    @Generated
    public CustomButton(String icon, float iconSize, Runnable onClick) {
        this.icon = icon;
        this.iconSize = iconSize;
        this.onClick = onClick;
    }

    @Generated
    public Animation getActiveAnim() {
        return this.activeAnim;
    }
}
