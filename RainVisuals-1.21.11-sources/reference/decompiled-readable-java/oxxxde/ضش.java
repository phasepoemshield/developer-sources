/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.ChatScreen
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import java.awt.Color;
import java.util.Collection;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.draggable.HudAlignment;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.display.BasicRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.minecraft.client.gui.screen.ChatScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u064c;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u063a;
import oxxxde.\u0648;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002-.B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0003J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010+\u00a8\u0006/"}, d2={"Loxxxde/\u0636\u0634;", "", "<init>", "()V", "Loxxxde/\u0638\u0630;", "drag", "", "x", "y", "Loxxxde/\u062f\u0622;", "snap", "(Lkotakbaz/rain/client/draggable/Draggable;FF)Lkotakbaz/rain/client/draggable/HudAlignment$Pos;", "", "render", "pos", "size", "", "vertical", "Loxxxde/\u0631\u064b;", "snapAxis", "(FFZ)Lkotakbaz/rain/client/draggable/HudAlignment$Axis;", "w", "h", "a", "line", "(FFFFF)V", "width", "height", "hint", "(FFF)V", "clearGuides", "altDown", "()Z", "SNAP", "F", "Loxxxde/\u0631\u064a;", "alpha", "Loxxxde/\u0631\u064a;", "active", "Loxxxde/\u0638\u0630;", "free", "Z", "guideX", "Ljava/lang/Float;", "guideY", "Pos", "Axis", "rain-visuals"})
public final class \u0636\u0634 {
    @Nullable
    private static Float guideX;
    @Nullable
    private static Draggable active;
    @Nullable
    private static Float guideY;
    @NotNull
    private static final AnimationUtil alpha;
    @NotNull
    public static final \u0636\u0634 INSTANCE;
    private static final float SNAP = 5.0f;
    private static boolean free;

    private final void line(float x, float y, float w, float h, float a2) {
        BasicRectRenderer basicRectRenderer = \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.HUD_RECT);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        basicRectRenderer.color(\u0628\u062d.INSTANCE.setAlpha(color, 0.55f * a2)).round(0.0f).draw(x, y, w, h);
    }

    /*
     * WARNING - void declaration
     */
    public final void render() {
        void var1_13;
        void var2_2;
        void var4_7;
        void var3_5;
        Draggable draggable;
        if (\u0636\u0643.getMc().currentScreen instanceof ChatScreen) {
            Object v2;
            block8: {
                Collection<Draggable> collection = \u062b\u064c.INSTANCE.getDraggables().values();
                Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
                Iterable $this$firstOrNull$iv = collection;
                boolean $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    void var5_8;
                    Draggable it = (Draggable)element$iv;
                    boolean bl = false;
                    boolean bl2 = it.isDragging() && it.getModule().isEnabled();
                    if (!bl2) continue;
                    v2 = var5_8;
                    break block8;
                }
                v2 = null;
            }
            draggable = v2;
        } else {
            draggable = null;
        }
        Draggable dragging = draggable;
        \u0628\u0641 $i$f$firstOrNull = \u0628\u0641.INSTANCE;
        float a2 = alpha.animate(dragging != null ? 1.0f : 0.0f, 120.0f, new \u0648($i$f$firstOrNull));
        if (a2 <= 0.01f) {
            return;
        }
        float width = \u0636\u0643.getMc().getWindow().getScaledWidth();
        float height = \u0636\u0643.getMc().getWindow().getScaledHeight();
        if (!free) {
            Float f = guideX;
            if (f != null) {
                float it = ((Number)f).floatValue();
                boolean bl = false;
                INSTANCE.line(it, 0.0f, 1.0f, height, a2);
            }
            Float f2 = guideY;
            if (f2 != null) {
                void var7_12;
                float it = ((Number)f2).floatValue();
                boolean bl = false;
                INSTANCE.line(0.0f, (float)var7_12, width, 1.0f, a2);
            }
        }
        this.hint((float)var3_5, (float)var4_7, (float)var2_2);
        if (var1_13 == null) {
            active = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final HudAlignment.Axis snapAxis(float pos, float size, boolean vertical) {
        int screen = vertical ? \u0636\u0643.getMc().getWindow().getScaledWidth() : \u0636\u0643.getMc().getWindow().getScaledHeight();
        Ref.FloatRef best = new Ref.FloatRef();
        best.element = 5.0f;
        Ref.FloatRef delta = new Ref.FloatRef();
        Ref.ObjectRef<Float> guide = new Ref.ObjectRef<Float>();
        \u0636\u0634.snapAxis$test(pos, size, best, delta, guide, (float)screen / 2.0f);
        Collection<Draggable> collection = \u062b\u064c.INSTANCE.getDraggables().values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$forEach$iv = collection;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var15_15;
            void var14_14;
            Draggable it = (Draggable)element$iv;
            boolean bl = false;
            if (it == active || !it.getModule().isEnabled()) continue;
            if (it.getWidth() <= 0.0f) continue;
            if (it.getHeight() <= 0.0f) continue;
            float p = vertical ? it.getX() : it.getY();
            float s = vertical ? it.getWidth() : it.getHeight();
            \u0636\u0634.snapAxis$test(pos, size, best, delta, guide, p);
            \u0636\u0634.snapAxis$test(pos, size, best, delta, guide, p + s / 2.0f);
            \u0636\u0634.snapAxis$test(pos, size, best, delta, guide, (float)(var14_14 + var15_15));
        }
        return new HudAlignment.Axis(pos + delta.element, (Float)guide.element);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean altDown() {
        long handle = \u0636\u0643.getMc().getWindow().getHandle();
        if (GLFW.glfwGetKey((long)handle, (int)342) == 1) return true;
        if (GLFW.glfwGetKey((long)handle, (int)346) != 1) return false;
        return true;
    }

    private final void clearGuides() {
        guideX = null;
        guideY = null;
    }

    private final void hint(float width, float height, float a2) {
        String text = free ? "\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u043e\u0435 \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0435\u043d\u0438\u0435" : "\u0417\u0430\u0436\u043c\u0438\u0442\u0435 ALT \u0434\u043b\u044f \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e\u0433\u043e \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0435\u043d\u0438\u044f";
        float size = \u0637\u063a.INSTANCE.scaled(7.5f);
        float padX = \u0637\u063a.INSTANCE.scaled(8.0f);
        float padY = \u0637\u063a.INSTANCE.scaled(4.5f);
        float textW = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), text, size, 0.0f, 4, null);
        float boxW = textW + padX * 2.0f;
        float boxH = size + padY * 2.0f;
        float x = width / 2.0f - boxW / 2.0f;
        float y = height - 40.0f - boxH - \u0637\u063a.INSTANCE.scaled(18.0f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(\u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), 0.82f * a2)).mix(0.9f).round(boxH / 2.0f).draw(x, y, boxW, boxH);
        \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(size).color(\u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), a2)).drawText(text, x + padX, y + padY - \u0637\u063a.INSTANCE.scaled(0.6f));
    }

    private \u0636\u0634() {
    }

    private static final void snapAxis$test$anchor(float $target, Ref.FloatRef best, Ref.FloatRef delta, Ref.ObjectRef<Float> guide, float value) {
        float dist = Math.abs(value - $target);
        if (dist < best.element) {
            best.element = dist;
            delta.element = $target - value;
            guide.element = Float.valueOf($target);
        }
    }

    @NotNull
    public final HudAlignment.Pos snap(@NotNull Draggable drag, float x, float y) {
        block3: {
            HudAlignment.Pos pos;
            block2: {
                Intrinsics.checkNotNullParameter(drag, "drag");
                active = drag;
                free = this.altDown();
                if (free) break block2;
                if (drag.getWidth() <= 0.0f) break block2;
                if (!(drag.getHeight() <= 0.0f)) break block3;
            }
            HudAlignment.Pos it = pos = new HudAlignment.Pos(x, y);
            boolean bl = false;
            INSTANCE.clearGuides();
            return pos;
        }
        HudAlignment.Axis sx = this.snapAxis(x, drag.getWidth(), true);
        HudAlignment.Axis sy = this.snapAxis(y, drag.getHeight(), false);
        guideX = sx.getGuide();
        guideY = sy.getGuide();
        return new HudAlignment.Pos(sx.getPos(), sy.getPos());
    }

    /*
     * WARNING - void declaration
     */
    private static final void snapAxis$test(float $pos, float $size, Ref.FloatRef best, Ref.FloatRef delta, Ref.ObjectRef<Float> guide, float target) {
        void var1_1;
        float f;
        \u0636\u0634.snapAxis$test$anchor(target, best, delta, guide, $pos);
        \u0636\u0634.snapAxis$test$anchor(target, best, delta, guide, $pos + $size / 2.0f);
        \u0636\u0634.snapAxis$test$anchor(target, best, delta, guide, f + var1_1);
    }

    static {
        INSTANCE = new \u0636\u0634();
        alpha = new AnimationUtil(0.0f, 1, null);
    }
}

