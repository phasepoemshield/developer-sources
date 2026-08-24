/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.layout;

import kotakbaz.rain.ui.menu.layout.CategorySlot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\bN\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010 \u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b/\u0010-J\u0088\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u00020\u000bH\u00d6\u0081\u0004\u00a2\u0006\u0004\b5\u0010+J\u0011\u00107\u001a\u000206H\u00d6\u0081\u0004\u00a2\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bF\u0010-R\u0017\u0010\u0010\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bG\u0010-R\u0011\u0010I\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bH\u0010\"R\u0011\u0010K\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010\"R\u0011\u0010M\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bL\u0010\"R\u0011\u0010O\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bN\u0010\"R\u0011\u0010Q\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bP\u0010\"R\u0011\u0010S\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bR\u0010\"R\u0011\u0010U\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bT\u0010\"R\u0011\u0010W\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bV\u0010\"R\u0011\u0010Y\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bX\u0010\"R\u0011\u0010[\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010\"R\u0011\u0010]\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\\\u0010\"R\u0011\u0010_\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b^\u0010\"R\u0011\u0010a\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b`\u0010\"R\u0011\u0010c\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bb\u0010\"R\u0011\u0010e\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bd\u0010\"R\u0011\u0010g\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bf\u0010\"R\u0011\u0010i\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bh\u0010\"R\u0011\u0010k\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\bj\u0010+R\u0011\u0010m\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bl\u0010\"R\u0011\u0010o\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bn\u0010\"R\u0011\u0010q\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bp\u0010\"R\u0011\u0010s\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\br\u0010\"R\u0011\u0010u\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bt\u0010\"R\u0011\u0010w\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bv\u0010\"R\u0011\u0010y\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bx\u0010\"R\u0011\u0010{\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bz\u0010\"R\u0011\u0010}\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b|\u0010\"R\u0011\u0010\u007f\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b~\u0010\"R\u0013\u0010\u0081\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\"R\u0013\u0010\u0083\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\"\u00a8\u0006\u0084\u0001"}, d2={"Loxxxde/\u0632\u0652;", "", "", "x", "y", "width", "height", "panelWidth", "uiPadding", "topBarHeight", "sidebarPadding", "", "sidebarItemCount", "", "configMode", "pointsMode", "configCloudMode", "<init>", "(FFFFFFFFIZZZ)V", "index", "padding", "Loxxxde/\u0637\u0633;", "categorySlot", "(IF)Lkotakbaz/rain/ui/menu/layout/CategorySlot;", "sidebarSlotSize", "(F)F", "mouseX", "mouseY", "isInsideTopBarSearchInput", "(FF)Z", "isInsideTopBarFolderAction", "isInsideTopBarConfigAuxAction", "isInsideTopBarConfigCreateAction", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "()Z", "component11", "component12", "copy", "(FFFFFFFFIZZZ)Lkotakbaz/rain/ui/menu/layout/MenuLayout;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getWidth", "getHeight", "getPanelWidth", "getUiPadding", "getTopBarHeight", "getSidebarPadding", "I", "getSidebarItemCount", "Z", "getConfigMode", "getPointsMode", "getConfigCloudMode", "getRadius", "radius", "getContentInset", "contentInset", "getModuleStartOffset", "moduleStartOffset", "getHeaderHeight", "headerHeight", "getLogoSize", "logoSize", "getLogoY", "logoY", "getAvatarSize", "avatarSize", "getAvatarX", "avatarX", "getAvatarY", "avatarY", "getContentLeft", "contentLeft", "getContentRight", "contentRight", "getContentWidth", "contentWidth", "getTopBarY", "topBarY", "getTopBarGap", "topBarGap", "getTopBarSearchWidthFactor", "topBarSearchWidthFactor", "getTopBarInfoX", "topBarInfoX", "getTopBarSearchWidth", "topBarSearchWidth", "getTopBarConfigButtonCount", "topBarConfigButtonCount", "getTopBarConfigButtonSize", "topBarConfigButtonSize", "getTopBarInfoToActionsGap", "topBarInfoToActionsGap", "getTopBarConfigButtonsGap", "topBarConfigButtonsGap", "getTopBarInfoWidth", "topBarInfoWidth", "getTopBarConfigCreateButtonX", "topBarConfigCreateButtonX", "getTopBarConfigAuxButtonX", "topBarConfigAuxButtonX", "getTopBarFolderButtonX", "topBarFolderButtonX", "getTopBarFolderButtonY", "topBarFolderButtonY", "getTopBarSearchX", "topBarSearchX", "getScrollBarX", "scrollBarX", "getScrollBarY", "scrollBarY", "getScrollBarHeight", "scrollBarHeight", "rain-visuals"})
public final class MenuLayout {
    private final boolean configCloudMode;
    private final float width;
    private final float topBarHeight;
    private final float y;
    private final float x;
    private final boolean pointsMode;
    private final int sidebarItemCount;
    private final float panelWidth;
    private final float uiPadding;
    private final float height;
    private final boolean configMode;
    private final float sidebarPadding;

    public final float getSidebarPadding() {
        return this.sidebarPadding;
    }

    public final float getModuleStartOffset() {
        return this.getContentInset() + this.topBarHeight + this.uiPadding;
    }

    public final boolean component11() {
        return this.pointsMode;
    }

    public final float getTopBarConfigAuxButtonX() {
        return this.getTopBarConfigCreateButtonX() + this.getTopBarConfigButtonSize() + this.getTopBarConfigButtonsGap();
    }

    public final float getContentInset() {
        return this.panelWidth / 5.0f;
    }

    public final int component9() {
        return this.sidebarItemCount;
    }

    @NotNull
    public final CategorySlot categorySlot(int index, float padding) {
        float safePadding = RangesKt.coerceAtLeast(padding, 0.0f);
        float size = this.sidebarSlotSize(safePadding);
        float step = size * 0.93f + safePadding;
        return new CategorySlot(this.x + (this.panelWidth - size) * 0.5f, this.y + this.getHeaderHeight() + this.uiPadding * -0.3f + safePadding + (float)index * step, size);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final float getTopBarInfoToActionsGap() {
        if (!(this.getTopBarConfigButtonSize() > 0.0f)) {
            if (!(this.getTopBarSearchWidth() > 0.0f)) return 0.0f;
            if (!(this.getTopBarSearchWidth() < this.getContentWidth())) return 0.0f;
        }
        float f = this.getTopBarGap();
        return f;
    }

    public final boolean getConfigCloudMode() {
        return this.configCloudMode;
    }

    public final float getTopBarSearchWidthFactor() {
        return 0.36666667f;
    }

    public final float getTopBarInfoX() {
        return this.getContentLeft();
    }

    public final float getContentLeft() {
        return this.x + this.panelWidth + this.uiPadding;
    }

    public final float getScrollBarY() {
        return this.y + this.getModuleStartOffset();
    }

    public final float getTopBarHeight() {
        return this.topBarHeight;
    }

    public final float getScrollBarHeight() {
        return this.height - this.getModuleStartOffset() - this.uiPadding * 2.0f;
    }

    public final float getLogoSize() {
        return this.sidebarSlotSize(this.sidebarPadding) * 0.47f;
    }

    private final float sidebarSlotSize(float padding) {
        float safePadding = RangesKt.coerceAtLeast(padding, 0.0f);
        float baseSize = RangesKt.coerceAtLeast(this.panelWidth - 12.0f, 0.0f);
        if (this.sidebarItemCount <= 0) {
            return baseSize;
        }
        float availableHeight = RangesKt.coerceAtLeast(this.height - this.getHeaderHeight() - safePadding * (float)(this.sidebarItemCount + 3), 0.0f);
        return Math.min(baseSize, availableHeight / ((float)this.sidebarItemCount + 0.84f));
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final float getScrollBarX() {
        return this.x + this.width - this.uiPadding * 2.0f;
    }

    public final boolean component10() {
        return this.configMode;
    }

    public int hashCode() {
        int result = Float.hashCode(this.x);
        result = result * 31 + Float.hashCode(this.y);
        result = result * 31 + Float.hashCode(this.width);
        result = result * 31 + Float.hashCode(this.height);
        result = result * 31 + Float.hashCode(this.panelWidth);
        result = result * 31 + Float.hashCode(this.uiPadding);
        result = result * 31 + Float.hashCode(this.topBarHeight);
        result = result * 31 + Float.hashCode(this.sidebarPadding);
        result = result * 31 + Integer.hashCode(this.sidebarItemCount);
        result = result * 31 + Boolean.hashCode(this.configMode);
        result = result * 31 + Boolean.hashCode(this.pointsMode);
        result = result * 31 + Boolean.hashCode(this.configCloudMode);
        return result;
    }

    public MenuLayout(float x, float y, float width, float height, float panelWidth, float uiPadding, float topBarHeight, float sidebarPadding, int sidebarItemCount, boolean configMode, boolean pointsMode, boolean configCloudMode) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.panelWidth = panelWidth;
        this.uiPadding = uiPadding;
        this.topBarHeight = topBarHeight;
        this.sidebarPadding = sidebarPadding;
        this.sidebarItemCount = sidebarItemCount;
        this.configMode = configMode;
        this.pointsMode = pointsMode;
        this.configCloudMode = configCloudMode;
    }

    public final float getContentWidth() {
        return RangesKt.coerceAtLeast(this.getContentRight() - this.getContentLeft(), 0.0f);
    }

    public final float component7() {
        return this.topBarHeight;
    }

    public final float getUiPadding() {
        return this.uiPadding;
    }

    public final float getLogoY() {
        return this.y + (this.getHeaderHeight() * 0.5f - this.getLogoSize() * 0.5f) + this.uiPadding * -0.3f;
    }

    public final float getHeaderHeight() {
        return this.panelWidth;
    }

    public final float getPanelWidth() {
        return this.panelWidth;
    }

    public final boolean isInsideTopBarSearchInput(float mouseX, float mouseY) {
        block9: {
            block8: {
                block7: {
                    block6: {
                        if (this.getTopBarSearchWidth() <= 0.0f) break block6;
                        if (!(this.topBarHeight <= 0.0f)) break block7;
                    }
                    return false;
                }
                if (mouseY < this.getTopBarY()) break block8;
                if (!(mouseY > this.getTopBarY() + this.topBarHeight)) break block9;
            }
            return false;
        }
        float f = this.getTopBarSearchX();
        return mouseX <= this.getTopBarSearchX() + this.getTopBarSearchWidth() ? f <= mouseX : false;
    }

    public final float component4() {
        return this.height;
    }

    public final float getTopBarInfoWidth() {
        return this.configMode ? RangesKt.coerceAtLeast(this.getContentWidth() - this.getTopBarConfigButtonSize() * (float)this.getTopBarConfigButtonCount() - this.getTopBarInfoToActionsGap() - this.getTopBarConfigButtonsGap() * (float)RangesKt.coerceAtLeast(this.getTopBarConfigButtonCount() - 1, 0), 0.0f) : RangesKt.coerceAtLeast(this.getContentWidth() - this.getTopBarSearchWidth() - this.getTopBarInfoToActionsGap(), 0.0f);
    }

    public final boolean getPointsMode() {
        return this.pointsMode;
    }

    public final boolean isInsideTopBarConfigAuxAction(float mouseX, float mouseY) {
        if (this.getTopBarConfigButtonSize() <= 0.0f) {
            return false;
        }
        return mouseX >= this.getTopBarConfigAuxButtonX() && mouseX <= this.getTopBarConfigAuxButtonX() + this.getTopBarConfigButtonSize() && mouseY >= this.getTopBarY() && mouseY <= this.getTopBarY() + this.topBarHeight;
    }

    public final boolean getConfigMode() {
        return this.configMode;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isInsideTopBarFolderAction(float mouseX, float mouseY) {
        if (this.getTopBarConfigButtonSize() <= 0.0f) {
            return false;
        }
        return mouseX >= this.getTopBarFolderButtonX() && mouseX <= this.getTopBarFolderButtonX() + this.getTopBarConfigButtonSize() && mouseY >= this.getTopBarFolderButtonY() && mouseY <= this.getTopBarFolderButtonY() + this.topBarHeight;
    }

    public final float getAvatarY() {
        return this.y + this.height - this.uiPadding - this.getAvatarSize() - 5.0f;
    }

    public final float getX() {
        return this.x;
    }

    public static /* synthetic */ MenuLayout copy$default(MenuLayout menuLayout, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, boolean bl, boolean bl2, boolean bl3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            f = menuLayout.x;
        }
        if ((n2 & 2) != 0) {
            f2 = menuLayout.y;
        }
        if ((n2 & 4) != 0) {
            f3 = menuLayout.width;
        }
        if ((n2 & 8) != 0) {
            f4 = menuLayout.height;
        }
        if ((n2 & 0x10) != 0) {
            f5 = menuLayout.panelWidth;
        }
        if ((n2 & 0x20) != 0) {
            f6 = menuLayout.uiPadding;
        }
        if ((n2 & 0x40) != 0) {
            f7 = menuLayout.topBarHeight;
        }
        if ((n2 & 0x80) != 0) {
            f8 = menuLayout.sidebarPadding;
        }
        if ((n2 & 0x100) != 0) {
            n = menuLayout.sidebarItemCount;
        }
        if ((n2 & 0x200) != 0) {
            bl = menuLayout.configMode;
        }
        if ((n2 & 0x400) != 0) {
            bl2 = menuLayout.pointsMode;
        }
        if ((n2 & 0x800) != 0) {
            bl3 = menuLayout.configCloudMode;
        }
        return menuLayout.copy(f, f2, f3, f4, f5, f6, f7, f8, n, bl, bl2, bl3);
    }

    public final int getTopBarConfigButtonCount() {
        return !this.configMode ? 0 : 2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuLayout)) {
            return false;
        }
        MenuLayout menuLayout = (MenuLayout)other;
        if (Float.compare(this.x, menuLayout.x) != 0) {
            return false;
        }
        if (Float.compare(this.y, menuLayout.y) != 0) {
            return false;
        }
        if (Float.compare(this.width, menuLayout.width) != 0) {
            return false;
        }
        if (Float.compare(this.height, menuLayout.height) != 0) {
            return false;
        }
        if (Float.compare(this.panelWidth, menuLayout.panelWidth) != 0) {
            return false;
        }
        if (Float.compare(this.uiPadding, menuLayout.uiPadding) != 0) {
            return false;
        }
        if (Float.compare(this.topBarHeight, menuLayout.topBarHeight) != 0) {
            return false;
        }
        if (Float.compare(this.sidebarPadding, menuLayout.sidebarPadding) != 0) {
            return false;
        }
        if (this.sidebarItemCount != menuLayout.sidebarItemCount) {
            return false;
        }
        if (this.configMode != menuLayout.configMode) {
            return false;
        }
        if (this.pointsMode != menuLayout.pointsMode) {
            return false;
        }
        if (this.configCloudMode != menuLayout.configCloudMode) {
            return false;
        }
        return true;
    }

    public final float getY() {
        return this.y;
    }

    public final int getSidebarItemCount() {
        return this.sidebarItemCount;
    }

    public final float getTopBarConfigButtonsGap() {
        return this.getTopBarConfigButtonSize() > 0.0f ? this.getTopBarGap() : 0.0f;
    }

    public final float getTopBarSearchWidth() {
        return this.configMode ? 0.0f : RangesKt.coerceIn(this.getContentWidth() * this.getTopBarSearchWidthFactor(), 0.0f, this.getContentWidth());
    }

    public final float getHeight() {
        return this.height;
    }

    public final float component5() {
        return this.panelWidth;
    }

    public final float getContentRight() {
        return this.x + this.width - this.panelWidth / 3.0f;
    }

    public final float getTopBarFolderButtonY() {
        return this.getTopBarY();
    }

    public final float getRadius() {
        return this.height * 0.04f;
    }

    public final boolean component12() {
        return this.configCloudMode;
    }

    public final float component3() {
        return this.width;
    }

    public final float getTopBarGap() {
        return this.uiPadding;
    }

    public final float component6() {
        return this.uiPadding;
    }

    public final float getAvatarX() {
        return this.x + (this.panelWidth - this.getAvatarSize()) * 0.5f;
    }

    public final float getTopBarFolderButtonX() {
        return this.getTopBarConfigAuxButtonX();
    }

    @NotNull
    public final MenuLayout copy(float x, float y, float width, float height, float panelWidth, float uiPadding, float topBarHeight, float sidebarPadding, int sidebarItemCount, boolean configMode, boolean pointsMode, boolean configCloudMode) {
        return new MenuLayout(x, y, width, height, panelWidth, uiPadding, topBarHeight, sidebarPadding, sidebarItemCount, configMode, pointsMode, configCloudMode);
    }

    public /* synthetic */ MenuLayout(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, boolean bl, boolean bl2, boolean bl3, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x800) != 0) {
            bl3 = false;
        }
        this(f, f2, f3, f4, f5, f6, f7, f8, n, bl, bl2, bl3);
    }

    public final float getTopBarConfigCreateButtonX() {
        return this.getTopBarInfoX() + this.getTopBarInfoWidth() + this.getTopBarInfoToActionsGap();
    }

    @NotNull
    public String toString() {
        return "MenuLayout(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", panelWidth=" + this.panelWidth + ", uiPadding=" + this.uiPadding + ", topBarHeight=" + this.topBarHeight + ", sidebarPadding=" + this.sidebarPadding + ", sidebarItemCount=" + this.sidebarItemCount + ", configMode=" + this.configMode + ", pointsMode=" + this.pointsMode + ", configCloudMode=" + this.configCloudMode + ")";
    }

    public final boolean isInsideTopBarConfigCreateAction(float mouseX, float mouseY) {
        if (this.getTopBarConfigButtonSize() <= 0.0f) {
            return false;
        }
        return mouseX >= this.getTopBarConfigCreateButtonX() && mouseX <= this.getTopBarConfigCreateButtonX() + this.getTopBarConfigButtonSize() && mouseY >= this.getTopBarY() && mouseY <= this.getTopBarY() + this.topBarHeight;
    }

    public final float getTopBarSearchX() {
        return this.getTopBarInfoX() + this.getTopBarInfoWidth() + this.getTopBarInfoToActionsGap();
    }

    public final float getAvatarSize() {
        return this.sidebarItemCount > 0 ? this.sidebarSlotSize(this.sidebarPadding) * 0.84f : 0.0f;
    }

    public final float getTopBarY() {
        return this.y + this.getContentInset();
    }

    public final float component8() {
        return this.sidebarPadding;
    }

    public final float getTopBarConfigButtonSize() {
        return this.configMode && this.getContentWidth() >= this.topBarHeight * (float)this.getTopBarConfigButtonCount() + this.getTopBarGap() * (float)this.getTopBarConfigButtonCount() ? this.topBarHeight : 0.0f;
    }
}

