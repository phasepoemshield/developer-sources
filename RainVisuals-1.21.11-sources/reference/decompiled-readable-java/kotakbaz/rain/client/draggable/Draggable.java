/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.Window
 */
package kotakbaz.rain.client.draggable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Collection;
import kotakbaz.rain.client.draggable.HudAlignment;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062b\u064c;
import oxxxde.\u062d\u0644;
import oxxxde.\u0636\u0634;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u0002\u0010\u000bJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b%\u0010\u0003J?\u0010(\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b(\u0010)R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010$\"\u0004\b,\u0010-R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b.\u0010$\"\u0004\b/\u0010-R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@BX\u0087.\u00a2\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u0010*R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u0010*R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u0010*R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010*R\u0016\u00107\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R$\u00109\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b9\u00108\u001a\u0004\b:\u0010\u001cR$\u0010;\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b;\u00108\u001a\u0004\b;\u0010\u001cR\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b&\u0010*\u001a\u0004\b<\u0010$\"\u0004\b=\u0010-R\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010*\u001a\u0004\b>\u0010$\"\u0004\b?\u0010-R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@BX\u0086.\u00a2\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010E\u00a8\u0006G"}, d2={"Loxxxde/\u0638\u0630;", "", "<init>", "()V", "Loxxxde/\u062f\u0650;", "module", "", "name", "", "initialXVal", "initialYVal", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;FF)V", "", "onDraw", "x", "y", "snapTo", "(FF)V", "lockHorizontalCenter", "()Lkotakbaz/rain/client/draggable/Draggable;", "restoreTo", "", "button", "action", "onClick", "(II)V", "", "isHovering", "()Z", "mouseX", "()I", "mouseY", "value", "roundToHalf", "(F)F", "centeredX", "()F", "clampTarget", "width", "height", "hovered", "(FFFFFF)Z", "F", "getX", "setX", "(F)V", "getY", "setY", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "targetX", "targetY", "offsetX", "offsetY", "horizontalCenterLocked", "Z", "hasStoredPosition", "getHasStoredPosition", "isDragging", "getWidth", "setWidth", "getHeight", "setHeight", "Loxxxde/\u062f\u0650;", "getModule", "()Lkotakbaz/rain/module/Module;", "Loxxxde/\u0633\u0637;", "xAnimation", "Loxxxde/\u0633\u0637;", "yAnimation", "rain-visuals"})
public final class Draggable {
    private float width;
    private Module module;
    @SerializedName(value="y")
    @Expose
    private float y;
    private float targetY;
    private boolean hasStoredPosition;
    private float targetX;
    @Expose
    @SerializedName(value="x")
    private float x;
    private float height;
    private float offsetX;
    private boolean horizontalCenterLocked;
    @NotNull
    private final AnimationUtil yAnimation;
    private float offsetY;
    private boolean isDragging;
    @NotNull
    private final AnimationUtil xAnimation;
    @SerializedName(value="name")
    @Expose
    private String name;

    public final void setX(float f) {
        this.x = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public final void onDraw() {
        if (this.isDragging) {
            float requestedX = this.horizontalCenterLocked ? this.centeredX() : (float)this.mouseX() - this.offsetX;
            HudAlignment.Pos pos = \u0636\u0634.INSTANCE.snap(this, requestedX, (float)this.mouseY() - this.offsetY);
            this.targetX = this.horizontalCenterLocked ? this.centeredX() : pos.getX();
            this.targetY = pos.getY();
            this.clampTarget();
        } else if (this.horizontalCenterLocked) {
            this.targetX = this.centeredX();
            this.clampTarget();
        }
        this.xAnimation.update();
        this.yAnimation.update();
        this.xAnimation.run(this.targetX, 70L, Easing.SINE_OUT);
        this.yAnimation.run(this.targetY, 70L, Easing.SINE_OUT);
        this.x = this.roundToHalf(this.xAnimation.get());
        this.y = this.roundToHalf(this.yAnimation.get());
    }

    @NotNull
    public final String getName() {
        String string = this.name;
        if (string != null) {
            return string;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        return null;
    }

    public final boolean isHovering() {
        return this.hovered(this.mouseX(), this.mouseY(), this.x, this.y, this.width, this.height);
    }

    public final float getHeight() {
        return this.height;
    }

    public final void setY(float f) {
        this.y = f;
    }

    private final void clampTarget() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return;
        }
        MinecraftClient client = minecraftClient;
        Window window = client.getWindow();
        if (window == null) {
            return;
        }
        Window window2 = window;
        float margin = 3.0f;
        float screenWidth = window2.getScaledWidth();
        float screenHeight = window2.getScaledHeight();
        if (this.targetX < margin) {
            this.targetX = margin;
        }
        if (this.targetY < margin) {
            this.targetY = margin;
        }
        if (this.targetX + this.width > screenWidth - margin) {
            this.targetX = screenWidth - this.width - margin;
        }
        if (this.targetY + this.height > screenHeight - margin) {
            this.targetY = screenHeight - this.height - margin;
        }
    }

    public final boolean getHasStoredPosition() {
        return this.hasStoredPosition;
    }

    private Draggable() {
        this.xAnimation = new AnimationUtil();
        this.yAnimation = new AnimationUtil();
    }

    public final void restoreTo(float x, float y) {
        this.snapTo(x, y);
        this.hasStoredPosition = true;
    }

    public final int mouseX() {
        return \u062d\u0644.INSTANCE.mouseX();
    }

    public final int mouseY() {
        return \u062d\u0644.INSTANCE.mouseY();
    }

    public final float getY() {
        return this.y;
    }

    @NotNull
    public final Draggable lockHorizontalCenter() {
        this.horizontalCenterLocked = true;
        return this;
    }

    private final boolean hovered(float mouseX, float mouseY, float x, float y, float width, float height) {
        return mouseX >= x && mouseY >= y && mouseX <= x + width && mouseY <= y + height;
    }

    private final float roundToHalf(float value) {
        return (float)Math.rint(value * 2.0f) / 2.0f;
    }

    public Draggable(@NotNull Module module, @NotNull String name, float initialXVal, float initialYVal) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(name, "name");
        this();
        this.module = module;
        this.name = name;
        this.snapTo(initialXVal, initialYVal);
    }

    private final float centeredX() {
        Window window = MinecraftClient.getInstance().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        Window window2 = window;
        return this.roundToHalf(((float)window2.getScaledWidth() - this.width) / 2.0f);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(int button, int action) {
        void var2_2;
        if (button == 0 && this.isHovering()) {
            if (action == 1) {
                boolean bl;
                block5: {
                    Collection<Draggable> collection = \u062b\u064c.INSTANCE.getDraggables().values();
                    Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
                    Iterable $this$any$iv = collection;
                    boolean $i$f$any = false;
                    if (((Collection)$this$any$iv).isEmpty()) {
                        bl = false;
                    } else {
                        for (Object element$iv : $this$any$iv) {
                            void var8_7;
                            Draggable it = (Draggable)element$iv;
                            boolean bl2 = false;
                            if (!var8_7.isDragging) continue;
                            bl = true;
                            break block5;
                        }
                        bl = false;
                    }
                }
                boolean anotherDragging = bl;
                if (anotherDragging) return;
                this.isDragging = true;
                this.offsetX = (float)this.mouseX() - this.x;
                this.offsetY = (float)this.mouseY() - this.y;
                return;
            }
        }
        if (button != 0) return;
        if (var2_2 != false) return;
        this.isDragging = false;
    }

    public final float getX() {
        return this.x;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final float getWidth() {
        return this.width;
    }

    @NotNull
    public final Module getModule() {
        Module module = this.module;
        if (module != null) {
            return module;
        }
        Intrinsics.throwUninitializedPropertyAccessException("module");
        return null;
    }

    public final void snapTo(float x, float y) {
        float snappedX = this.roundToHalf(x);
        float snappedY = this.roundToHalf(y);
        this.x = snappedX;
        this.y = snappedY;
        this.targetX = snappedX;
        this.targetY = snappedY;
        this.xAnimation.snap(snappedX);
        this.yAnimation.snap(snappedY);
    }

    public final void setHeight(float f) {
        this.height = f;
    }
}

