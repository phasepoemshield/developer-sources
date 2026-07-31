/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.layout;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.ui.menu.layout.CategorySlot;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\bM\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\r\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b.\u0010-J~\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b2\u00103J\u0011\u00104\u001a\u00020\u000bH\u00d6\u0081\u0004\u00a2\u0006\u0004\b4\u0010+J\u0011\u00106\u001a\u000205H\u00d6\u0081\u0004\u00a2\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bE\u0010-R\u0011\u0010G\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bF\u0010\"R\u0011\u0010I\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bH\u0010\"R\u0011\u0010K\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010\"R\u0011\u0010M\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bL\u0010\"R\u0011\u0010O\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bN\u0010\"R\u0011\u0010Q\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bP\u0010\"R\u0011\u0010S\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bR\u0010\"R\u0011\u0010U\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bT\u0010\"R\u0011\u0010W\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bV\u0010\"R\u0011\u0010Y\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bX\u0010\"R\u0011\u0010[\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010\"R\u0011\u0010]\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\\\u0010\"R\u0011\u0010_\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b^\u0010\"R\u0011\u0010a\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b`\u0010\"R\u0011\u0010c\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bb\u0010\"R\u0011\u0010e\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bd\u0010\"R\u0011\u0010g\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bf\u0010\"R\u0011\u0010i\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bh\u0010\"R\u0011\u0010k\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bj\u0010\"R\u0011\u0010m\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bl\u0010\"R\u0011\u0010o\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bn\u0010\"R\u0011\u0010q\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bp\u0010\"R\u0011\u0010s\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\br\u0010\"R\u0011\u0010u\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bt\u0010\"R\u0011\u0010w\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bv\u0010\"R\u0011\u0010y\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bx\u0010\"R\u0011\u0010{\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\bz\u0010\"R\u0011\u0010}\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b|\u0010\"R\u0011\u0010\u007f\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b~\u0010\"R\u0013\u0010\u0081\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\"\u00a8\u0006\u0082\u0001"}, d2={"Lkotakbaz/rain/ui/menu/layout/MenuLayout;", "", "", "x", "y", "width", "height", "panelWidth", "uiPadding", "topBarHeight", "sidebarPadding", "", "sidebarItemCount", "", "configMode", "pointsMode", "<init>", "(FFFFFFFFIZZ)V", "index", "padding", "Lkotakbaz/rain/ui/menu/layout/CategorySlot;", "categorySlot", "(IF)Lkotakbaz/rain/ui/menu/layout/CategorySlot;", "sidebarSlotSize", "(F)F", "mouseX", "mouseY", "hasActionButton", "isInsideTopBarSearchInput", "(FFZ)Z", "isInsideTopBarSearchAction", "(FF)Z", "isInsideTopBarFolderAction", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "()Z", "component11", "copy", "(FFFFFFFFIZZ)Lkotakbaz/rain/ui/menu/layout/MenuLayout;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "F", "getX", "getY", "getWidth", "getHeight", "getPanelWidth", "getUiPadding", "getTopBarHeight", "getSidebarPadding", "I", "getSidebarItemCount", "Z", "getConfigMode", "getPointsMode", "getRadius", "radius", "getContentInset", "contentInset", "getModuleStartOffset", "moduleStartOffset", "getHeaderHeight", "headerHeight", "getLogoSize", "logoSize", "getLogoY", "logoY", "getAvatarSize", "avatarSize", "getAvatarX", "avatarX", "getAvatarY", "avatarY", "getContentLeft", "contentLeft", "getContentRight", "contentRight", "getContentWidth", "contentWidth", "getTopBarY", "topBarY", "getTopBarGap", "topBarGap", "getTopBarSearchWidthFactor", "topBarSearchWidthFactor", "getTopBarInfoX", "topBarInfoX", "getTopBarSearchWidth", "topBarSearchWidth", "getTopBarFolderButtonSize", "topBarFolderButtonSize", "getTopBarInfoToFolderGap", "topBarInfoToFolderGap", "getTopBarFolderToSearchGap", "topBarFolderToSearchGap", "getTopBarInfoWidth", "topBarInfoWidth", "getTopBarFolderButtonX", "topBarFolderButtonX", "getTopBarFolderButtonY", "topBarFolderButtonY", "getTopBarSearchX", "topBarSearchX", "getTopBarSearchActionSize", "topBarSearchActionSize", "getTopBarSearchActionX", "topBarSearchActionX", "getTopBarSearchActionY", "topBarSearchActionY", "getScrollBarX", "scrollBarX", "getScrollBarY", "scrollBarY", "getScrollBarHeight", "scrollBarHeight", "rain-visuals"})
public final class MenuLayout {
    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final float panelWidth;
    private final float uiPadding;
    private final float topBarHeight;
    private final float sidebarPadding;
    private final int sidebarItemCount;
    private final boolean configMode;
    private final boolean pointsMode;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public MenuLayout(float x2, float y, float width2, float height, float panelWidth2, float uiPadding, float topBarHeight, float sidebarPadding, int sidebarItemCount, boolean configMode, boolean pointsMode) {
        this.x = x2;
        this.y = y;
        this.width = width2;
        this.height = height;
        this.panelWidth = panelWidth2;
        this.uiPadding = uiPadding;
        this.topBarHeight = topBarHeight;
        this.sidebarPadding = sidebarPadding;
        this.sidebarItemCount = sidebarItemCount;
        this.configMode = configMode;
        this.pointsMode = pointsMode;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPanelWidth() {
        return this.panelWidth;
    }

    public final float getUiPadding() {
        return this.uiPadding;
    }

    public final float getTopBarHeight() {
        return this.topBarHeight;
    }

    public final float getSidebarPadding() {
        return this.sidebarPadding;
    }

    public final int getSidebarItemCount() {
        return this.sidebarItemCount;
    }

    public final boolean getConfigMode() {
        return this.configMode;
    }

    public final boolean getPointsMode() {
        return this.pointsMode;
    }

    public final float getRadius() {
        return this.height * 0.04f;
    }

    public final float getContentInset() {
        return this.panelWidth / 5.0f;
    }

    public final float getModuleStartOffset() {
        return this.getContentInset() + this.topBarHeight + this.uiPadding;
    }

    public final float getHeaderHeight() {
        return this.panelWidth;
    }

    public final float getLogoSize() {
        return this.sidebarSlotSize(this.sidebarPadding) * 0.47f;
    }

    public final float getLogoY() {
        return this.y + (this.getHeaderHeight() * 0.5f - this.getLogoSize() * 0.5f) + this.uiPadding * -0.3f;
    }

    public final float getAvatarSize() {
        return this.sidebarItemCount > 0 ? this.sidebarSlotSize(this.sidebarPadding) * 0.84f : 0.0f;
    }

    public final float getAvatarX() {
        return this.x + (this.panelWidth - this.getAvatarSize()) * 0.5f;
    }

    public final float getAvatarY() {
        return this.y + this.height - this.uiPadding - this.getAvatarSize() - 5.0f;
    }

    public final float getContentLeft() {
        return this.x + this.panelWidth + this.uiPadding;
    }

    public final float getContentRight() {
        return this.x + this.width - this.panelWidth / 3.0f;
    }

    public final float getContentWidth() {
        return RangesKt.coerceAtLeast(this.getContentRight() - this.getContentLeft(), 0.0f);
    }

    public final float getTopBarY() {
        return this.y + this.getContentInset();
    }

    public final float getTopBarGap() {
        return this.uiPadding;
    }

    public final float getTopBarSearchWidthFactor() {
        return 0.36666667f;
    }

    public final float getTopBarInfoX() {
        return this.getContentLeft();
    }

    public final float getTopBarSearchWidth() {
        return RangesKt.coerceIn(this.getContentWidth() * this.getTopBarSearchWidthFactor(), 0.0f, this.getContentWidth());
    }

    public final float getTopBarFolderButtonSize() {
        return this.configMode && this.getTopBarSearchWidth() > 0.0f && this.getTopBarSearchWidth() < this.getContentWidth() ? this.topBarHeight : 0.0f;
    }

    public final float getTopBarInfoToFolderGap() {
        return this.getTopBarFolderButtonSize() > 0.0f ? this.getTopBarGap() : 0.0f;
    }

    public final float getTopBarFolderToSearchGap() {
        return this.getTopBarFolderButtonSize() > 0.0f ? this.getTopBarGap() : (this.getTopBarSearchWidth() <= 0.0f || this.getTopBarSearchWidth() >= this.getContentWidth() ? 0.0f : this.getTopBarGap());
    }

    public final float getTopBarInfoWidth() {
        return RangesKt.coerceAtLeast(this.getContentWidth() - this.getTopBarSearchWidth() - this.getTopBarFolderButtonSize() - this.getTopBarInfoToFolderGap() - this.getTopBarFolderToSearchGap(), 0.0f);
    }

    public final float getTopBarFolderButtonX() {
        return this.getTopBarInfoX() + this.getTopBarInfoWidth() + this.getTopBarInfoToFolderGap();
    }

    public final float getTopBarFolderButtonY() {
        return this.getTopBarY();
    }

    public final float getTopBarSearchX() {
        return this.getTopBarFolderButtonSize() > 0.0f ? this.getTopBarFolderButtonX() + this.getTopBarFolderButtonSize() + this.getTopBarFolderToSearchGap() : this.getTopBarInfoX() + this.getTopBarInfoWidth() + this.getTopBarFolderToSearchGap();
    }

    public final float getTopBarSearchActionSize() {
        return RangesKt.coerceAtLeast(this.topBarHeight - this.uiPadding * 2.2f, 0.0f);
    }

    public final float getTopBarSearchActionX() {
        return this.getTopBarSearchX() + this.getTopBarSearchWidth() - this.uiPadding - this.getTopBarSearchActionSize();
    }

    public final float getTopBarSearchActionY() {
        return this.getTopBarY() + (this.topBarHeight - this.getTopBarSearchActionSize()) * 0.5f;
    }

    public final float getScrollBarX() {
        return this.x + this.width - this.uiPadding * 2.0f;
    }

    public final float getScrollBarY() {
        return this.y + this.getModuleStartOffset();
    }

    public final float getScrollBarHeight() {
        return this.height - this.getModuleStartOffset() - this.uiPadding * 2.0f;
    }

    @NotNull
    public final CategorySlot categorySlot(int index, float padding) {
        float f2 = RangesKt.coerceAtLeast(padding, 0.0f);
        float f3 = this.sidebarSlotSize(f2);
        float f4 = f3 * 0.93f + f2;
        return new CategorySlot(this.x + (this.panelWidth - f3) * 0.5f, this.y + this.getHeaderHeight() + this.uiPadding * -0.3f + f2 + (float)index * f4, f3);
    }

    private final float sidebarSlotSize(float padding) {
        float f2 = RangesKt.coerceAtLeast(padding, 0.0f);
        float f3 = RangesKt.coerceAtLeast(this.panelWidth - 12.0f, 0.0f);
        if (this.sidebarItemCount <= 0) {
            return f3;
        }
        int n2 = C[0];
        n2 ^= C[1];
        float f4 = RangesKt.coerceAtLeast(this.height - this.getHeaderHeight() - f2 * (float)(this.sidebarItemCount + (n2 ^= C[2])), 0.0f);
        return Math.min(f3, f4 / ((float)this.sidebarItemCount + 0.84f));
    }

    public final boolean isInsideTopBarSearchInput(float mouseX, float mouseY, boolean hasActionButton) {
        int n2;
        float f2;
        if (this.getTopBarSearchWidth() <= 0.0f || this.topBarHeight <= 0.0f) {
            boolean bl = C[3];
            bl ^= C[4];
            return bl += C[5];
        }
        if (mouseY < this.getTopBarY() || mouseY > this.getTopBarY() + this.topBarHeight) {
            boolean bl = C[6];
            bl -= C[7];
            return bl ^= C[8];
        }
        float f3 = f2 = hasActionButton ? this.getTopBarSearchActionX() - this.uiPadding : this.getTopBarSearchX() + this.getTopBarSearchWidth();
        if (this.getTopBarSearchX() <= mouseX) {
            if (mouseX <= f2) {
                int n3 = C[9];
                n3 += C[10];
                n2 = n3 ^= C[11];
            } else {
                int n4 = C[12];
                n4 -= C[13];
                n2 = n4 -= C[14];
            }
        } else {
            int n5 = C[15];
            n5 -= C[16];
            n2 = n5 ^= C[17];
        }
        return n2 != 0;
    }

    public final boolean isInsideTopBarSearchAction(float mouseX, float mouseY) {
        int n2;
        if (this.getTopBarSearchActionSize() <= 0.0f) {
            boolean bl = C[18];
            bl -= C[19];
            return bl += C[20];
        }
        if (mouseX >= this.getTopBarSearchX() && mouseX <= this.getTopBarSearchX() + this.getTopBarSearchWidth() && mouseX >= this.getTopBarSearchActionX() && mouseX <= this.getTopBarSearchActionX() + this.getTopBarSearchActionSize() && mouseY >= this.getTopBarY() && mouseY <= this.getTopBarY() + this.topBarHeight && mouseY >= this.getTopBarSearchActionY() && mouseY <= this.getTopBarSearchActionY() + this.getTopBarSearchActionSize()) {
            int n3 = C[21];
            n3 ^= C[22];
            n2 = n3 ^= C[23];
        } else {
            int n4 = C[24];
            n4 -= C[25];
            n2 = n4 += C[26];
        }
        return n2 != 0;
    }

    public final boolean isInsideTopBarFolderAction(float mouseX, float mouseY) {
        int n2;
        if (this.getTopBarFolderButtonSize() <= 0.0f) {
            boolean bl = C[27];
            bl ^= C[28];
            return bl ^= C[29];
        }
        if (mouseX >= this.getTopBarFolderButtonX() && mouseX <= this.getTopBarFolderButtonX() + this.getTopBarFolderButtonSize() && mouseY >= this.getTopBarFolderButtonY() && mouseY <= this.getTopBarFolderButtonY() + this.topBarHeight) {
            int n3 = C[30];
            n3 ^= C[31];
            n2 = n3 -= C[32];
        } else {
            int n4 = C[33];
            n4 += C[34];
            n2 = n4 -= C[35];
        }
        return n2 != 0;
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final float component3() {
        return this.width;
    }

    public final float component4() {
        return this.height;
    }

    public final float component5() {
        return this.panelWidth;
    }

    public final float component6() {
        return this.uiPadding;
    }

    public final float component7() {
        return this.topBarHeight;
    }

    public final float component8() {
        return this.sidebarPadding;
    }

    public final int component9() {
        return this.sidebarItemCount;
    }

    public final boolean component10() {
        return this.configMode;
    }

    public final boolean component11() {
        return this.pointsMode;
    }

    @NotNull
    public final MenuLayout copy(float x2, float y, float width2, float height, float panelWidth2, float uiPadding, float topBarHeight, float sidebarPadding, int sidebarItemCount, boolean configMode, boolean pointsMode) {
        return new MenuLayout(x2, y, width2, height, panelWidth2, uiPadding, topBarHeight, sidebarPadding, sidebarItemCount, configMode, pointsMode);
    }

    public static /* synthetic */ MenuLayout copy$default(MenuLayout menuLayout, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n2, boolean bl, boolean bl2, int n3, Object object) {
        int n4 = C[36];
        n4 ^= C[37];
        if ((n3 & (n4 += C[38])) != 0) {
            f2 = menuLayout.x;
        }
        int n5 = C[39];
        n5 -= C[40];
        if ((n3 & (n5 += C[41])) != 0) {
            f3 = menuLayout.y;
        }
        int n6 = C[42];
        n6 -= C[43];
        if ((n3 & (n6 += C[44])) != 0) {
            f4 = menuLayout.width;
        }
        int n7 = C[45];
        n7 -= C[46];
        if ((n3 & (n7 -= C[47])) != 0) {
            f5 = menuLayout.height;
        }
        int n8 = C[48];
        n8 -= C[49];
        if ((n3 & (n8 ^= C[50])) != 0) {
            f6 = menuLayout.panelWidth;
        }
        int n9 = C[51];
        n9 += C[52];
        if ((n3 & (n9 -= C[53])) != 0) {
            f7 = menuLayout.uiPadding;
        }
        int n10 = C[54];
        n10 -= C[55];
        if ((n3 & (n10 += C[56])) != 0) {
            f8 = menuLayout.topBarHeight;
        }
        int n11 = C[57];
        n11 += C[58];
        if ((n3 & (n11 -= C[59])) != 0) {
            f9 = menuLayout.sidebarPadding;
        }
        int n12 = C[60];
        n12 += C[61];
        if ((n3 & (n12 += C[62])) != 0) {
            n2 = menuLayout.sidebarItemCount;
        }
        int n13 = C[63];
        n13 ^= C[64];
        if ((n3 & (n13 ^= C[65])) != 0) {
            bl = menuLayout.configMode;
        }
        int n14 = C[66];
        n14 += C[67];
        if ((n3 & (n14 ^= C[68])) != 0) {
            bl2 = menuLayout.pointsMode;
        }
        return menuLayout.copy(f2, f3, f4, f5, f6, f7, f8, f9, n2, bl, bl2);
    }

    @NotNull
    public String toString() {
        long l2 = -2411796903655976143L;
        long l3 = 7338010707592545983L;
        long l4 = 8843875177142717247L;
        int n2 = C[69];
        n2 += C[70];
        long l5 = l3;
        int n3 = C[72];
        n3 -= C[73];
        long l6 = l3 = l5 ^ ((long)this.pointsMode << (n2 += C[71]) ^ l5) & -1L << (n3 += C[74]);
        int n4 = C[75];
        n4 += C[76];
        l3 = l6 ^ ((long)this.configMode ^ l6) & -1L >>> (n4 ^= C[77]);
        int n5 = C[78];
        n5 += C[79];
        long l7 = l4;
        int n6 = C[81];
        n6 -= C[82];
        l4 = l7 ^ ((long)this.sidebarItemCount << (n5 -= C[80]) ^ l7) & -1L << (n6 -= C[83]);
        float f2 = this.sidebarPadding;
        float f3 = this.topBarHeight;
        float f4 = this.uiPadding;
        float f5 = this.panelWidth;
        float f6 = this.height;
        float f7 = this.width;
        float f8 = this.y;
        float f9 = this.x;
        int n7 = C[84];
        n7 ^= C[85];
        n7 += C[86];
        int n8 = C[87];
        n8 -= C[88];
        n8 += C[89];
        int n9 = C[90];
        n9 -= C[91];
        n9 ^= C[92];
        int n10 = C[93];
        n10 ^= C[94];
        n10 ^= C[95];
        int n11 = C[96];
        n11 ^= C[97];
        n11 -= C[98];
        int n12 = C[99];
        n12 ^= C[100];
        n12 ^= C[101];
        int n13 = C[102];
        n13 -= C[103];
        n13 -= C[104];
        int n14 = C[105];
        n14 ^= C[106];
        n14 -= C[107];
        int n15 = C[108];
        n15 -= C[109];
        n15 ^= C[110];
        int n16 = C[111];
        n16 += C[112];
        n16 -= C[113];
        int n17 = C[114];
        n17 ^= C[115];
        n17 -= C[116];
        int n18 = C[117];
        n18 -= C[118];
        n18 -= C[119];
        int n19 = C[120];
        n19 += C[121];
        n19 -= C[122];
        int n20 = C[123];
        n20 -= C[124];
        n20 -= C[125];
        int n21 = C[126];
        n21 += C[127];
        int n22 = C[129];
        n22 -= C[130];
        int n23 = C[132];
        n23 -= C[133];
        return (String)a[n7] + f9 + (String)a[n8] + f8 + (String)a[n9] + f7 + (String)a[n10] + f6 + (String)a[n11] + f5 + (String)a[n12] + f4 + (String)a[n13] + f3 + ((String)a[n14] + (String)a[n15] + (String)a[n16]) + f2 + ((String)a[n17] + (String)a[n18]) + (int)(l4 >>> n19) + (String)a[n20] + (boolean)l3 + (String)a[n21 += C[128]] + (boolean)(l3 >>> (n22 -= C[131])) + (String)a[n23 += C[134]];
    }

    public int hashCode() {
        long l2 = 413096446845833188L;
        long l3 = -665756384718575186L;
        long l4 = 2835528618965410611L;
        long l5 = 7880003885043323225L;
        long l6 = 580455844754457238L;
        long l7 = -3083978690515096210L;
        long l8 = 2161977902709064768L;
        long l9 = 8917019079297390504L;
        long l10 = 2948799457586284033L;
        long l11 = -7926187319156347452L;
        long l12 = -9195897186482716197L;
        int n2 = C[135];
        n2 ^= C[136];
        long l13 = l12;
        int n3 = C[138];
        n3 += C[139];
        l12 = l13 ^ ((long)Float.hashCode(this.x) << (n2 ^= C[137]) ^ l13) & -1L << (n3 ^= C[140]);
        int n4 = C[141];
        n4 ^= C[142];
        n4 -= C[143];
        int n5 = C[144];
        n5 -= C[145];
        n5 -= C[146];
        int n6 = C[147];
        n6 += C[148];
        long l14 = l12;
        int n7 = C[150];
        n7 += C[151];
        l12 = l14 ^ ((long)((int)(l12 >>> n4) * n5 + Float.hashCode(this.y)) << (n6 += C[149]) ^ l14) & -1L << (n7 += C[152]);
        int n8 = C[153];
        n8 ^= C[154];
        n8 ^= C[155];
        int n9 = C[156];
        n9 ^= C[157];
        n9 ^= C[158];
        int n10 = C[159];
        n10 -= C[160];
        long l15 = l12;
        int n11 = C[162];
        n11 += C[163];
        l12 = l15 ^ ((long)((int)(l12 >>> n8) * n9 + Float.hashCode(this.width)) << (n10 -= C[161]) ^ l15) & -1L << (n11 -= C[164]);
        int n12 = C[165];
        n12 += C[166];
        n12 += C[167];
        int n13 = C[168];
        n13 += C[169];
        n13 += C[170];
        int n14 = C[171];
        n14 -= C[172];
        long l16 = l12;
        int n15 = C[174];
        n15 += C[175];
        l12 = l16 ^ ((long)((int)(l12 >>> n12) * n13 + Float.hashCode(this.height)) << (n14 += C[173]) ^ l16) & -1L << (n15 += C[176]);
        int n16 = C[177];
        n16 ^= C[178];
        n16 -= C[179];
        int n17 = C[180];
        n17 += C[181];
        n17 ^= C[182];
        int n18 = C[183];
        n18 ^= C[184];
        long l17 = l12;
        int n19 = C[186];
        n19 ^= C[187];
        l12 = l17 ^ ((long)((int)(l12 >>> n16) * n17 + Float.hashCode(this.panelWidth)) << (n18 -= C[185]) ^ l17) & -1L << (n19 ^= C[188]);
        int n20 = C[189];
        n20 += C[190];
        n20 += C[191];
        int n21 = C[192];
        n21 += C[193];
        n21 ^= C[194];
        int n22 = C[195];
        n22 -= C[196];
        long l18 = l12;
        int n23 = C[198];
        n23 ^= C[199];
        l12 = l18 ^ ((long)((int)(l12 >>> n20) * n21 + Float.hashCode(this.uiPadding)) << (n22 ^= C[197]) ^ l18) & -1L << (n23 += C[200]);
        int n24 = C[201];
        n24 += C[202];
        n24 -= C[203];
        int n25 = C[204];
        n25 -= C[205];
        n25 -= C[206];
        int n26 = C[207];
        n26 -= C[208];
        long l19 = l12;
        int n27 = C[210];
        n27 ^= C[211];
        l12 = l19 ^ ((long)((int)(l12 >>> n24) * n25 + Float.hashCode(this.topBarHeight)) << (n26 -= C[209]) ^ l19) & -1L << (n27 -= C[212]);
        int n28 = C[213];
        n28 ^= C[214];
        n28 += C[215];
        int n29 = C[216];
        n29 ^= C[217];
        n29 += C[218];
        int n30 = C[219];
        n30 += C[220];
        long l20 = l12;
        int n31 = C[222];
        n31 -= C[223];
        l12 = l20 ^ ((long)((int)(l12 >>> n28) * n29 + Float.hashCode(this.sidebarPadding)) << (n30 += C[221]) ^ l20) & -1L << (n31 -= C[224]);
        int n32 = C[225];
        n32 -= C[226];
        n32 ^= C[227];
        int n33 = C[228];
        n33 -= C[229];
        n33 ^= C[230];
        int n34 = C[231];
        n34 += C[232];
        long l21 = l12;
        int n35 = C[234];
        n35 -= C[235];
        l12 = l21 ^ ((long)((int)(l12 >>> n32) * n33 + Integer.hashCode(this.sidebarItemCount)) << (n34 -= C[233]) ^ l21) & -1L << (n35 += C[236]);
        int n36 = C[237];
        n36 += C[238];
        n36 ^= C[239];
        int n37 = C[240];
        n37 += C[241];
        n37 ^= C[242];
        int n38 = C[243];
        n38 -= C[244];
        long l22 = l12;
        int n39 = C[246];
        n39 += C[247];
        l12 = l22 ^ ((long)((int)(l12 >>> n36) * n37 + Boolean.hashCode(this.configMode)) << (n38 ^= C[245]) ^ l22) & -1L << (n39 -= C[248]);
        int n40 = C[249];
        n40 -= C[250];
        n40 -= C[251];
        int n41 = C[252];
        n41 -= C[253];
        n41 += C[254];
        int n42 = C[255];
        n42 += C[256];
        long l23 = l12;
        int n43 = C[258];
        n43 ^= C[259];
        l12 = l23 ^ ((long)((int)(l12 >>> n40) * n41 + Boolean.hashCode(this.pointsMode)) << (n42 ^= C[257]) ^ l23) & -1L << (n43 += C[260]);
        int n44 = C[261];
        n44 -= C[262];
        return (int)(l12 >>> (n44 += C[263]));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            boolean bl = C[264];
            bl ^= C[265];
            return bl += C[266];
        }
        if (!(other instanceof MenuLayout)) {
            boolean bl = C[267];
            bl -= C[268];
            return bl -= C[269];
        }
        MenuLayout menuLayout = (MenuLayout)other;
        if (Float.compare(this.x, menuLayout.x) != 0) {
            boolean bl = C[270];
            bl ^= C[271];
            return bl += C[272];
        }
        if (Float.compare(this.y, menuLayout.y) != 0) {
            boolean bl = C[273];
            bl -= C[274];
            return bl -= C[275];
        }
        if (Float.compare(this.width, menuLayout.width) != 0) {
            boolean bl = C[276];
            bl += C[277];
            return bl -= C[278];
        }
        if (Float.compare(this.height, menuLayout.height) != 0) {
            boolean bl = C[279];
            bl -= C[280];
            return bl += C[281];
        }
        if (Float.compare(this.panelWidth, menuLayout.panelWidth) != 0) {
            boolean bl = C[282];
            bl += C[283];
            return bl -= C[284];
        }
        if (Float.compare(this.uiPadding, menuLayout.uiPadding) != 0) {
            boolean bl = C[285];
            bl -= C[286];
            return bl ^= C[287];
        }
        if (Float.compare(this.topBarHeight, menuLayout.topBarHeight) != 0) {
            boolean bl = C[288];
            bl += C[289];
            return bl -= C[290];
        }
        if (Float.compare(this.sidebarPadding, menuLayout.sidebarPadding) != 0) {
            boolean bl = C[291];
            bl -= C[292];
            return bl ^= C[293];
        }
        if (this.sidebarItemCount != menuLayout.sidebarItemCount) {
            boolean bl = C[294];
            bl += C[295];
            return bl -= C[296];
        }
        if (this.configMode != menuLayout.configMode) {
            boolean bl = C[297];
            bl ^= C[298];
            return bl += C[299];
        }
        if (this.pointsMode != menuLayout.pointsMode) {
            boolean bl = C[300];
            bl -= C[301];
            return bl -= C[302];
        }
        boolean bl = C[303];
        bl -= C[304];
        return bl += C[305];
    }

    static {
        MenuLayout.b();
        long l2 = 3227051691996662317L;
        long l3 = -2839800916686792746L;
        long l4 = 1346680029998683129L;
        long l5 = -3936339290427121392L;
        long l6 = 3460162063379044888L;
        long l7 = 6965212310986186775L;
        long l8 = -2240026039671509558L;
        long l9 = 72146246044099195L;
        long l10 = -3764441499294617519L;
        long l11 = 8019030971550853021L;
        long l12 = 6785910540447893480L;
        long l13 = -2908564214569951027L;
        long l14 = 5010507273374330867L;
        long l15 = 8219172304887438996L;
        int n2 = C[306];
        n2 += C[307];
        a = new Object[n2 -= C[308]];
        long l16 = l15;
        int n3 = C[309];
        n3 -= C[310];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[311]);
        Object[] objectArray = new Object[C[312]];
        objectArray[MenuLayout.C[313]] = A;
        objectArray[MenuLayout.C[314]] = C[315];
        int n4 = C[316];
        Object object = MenuLayout.A()[C[317]];
        if (object == null) {
            char[] cArray = "\u16b7\u16d7\u1a14\u16e5\u1709\u1a11\u1703\u16d6\u16ba\u19f6\u16b7\u16ff\u1a21\u16b8\u1706\u1a0f\u16f1\u19f8\u16fd\u1a12\u164c\u163d\u19fa\u1a2c\u1a2c\u19f5\u1a29\u1647\u16f4\u1703\u1a14\u1704\u1a0f\u1a14\u16d1\u16f3\u16e5\u1a12\u16da\u16b7\u16d8\u16ba\u16b7\u1a1e\u1a29\u1705\u1a23\u16f2\u163e\u1a2a\u164c\u1649\u1a23\u16d8\u1648\u1a25\u1a28\u164c\u16da\u164c\u1a24\u1a0f\u1a29\u1a28\u1a28\u16b7\u1648\u1a29\u1701\u1a0f\u1a10\u164c\u16f2\u1a25\u1704\u16f4\u1a2a\u16cf\u1a26\u1a27\u16ef\u1a2c\u1a29\u1a29\u1a13\u16d8\u1a26\u19f5\u1a27\u164c\u1705\u1a1d\u16e5\u16b8\u1a23\u16e6\u1a24\u1701\u1a13\u1a14\u16d5\u1630\u16d8\u1a23\u16d5\u1a2c\u16ba\u16d6\u1706\u1a25\u1a29\u1a26\u16f3\u16d3\u19f8\u1a1d\u1709\u16f1\u16e6\u16d4\u16dc\u16b7\u1a26\u16b7\u164b\u1a12\u16ef\u19f7\u16cf\u1703\u1a24\u1704\u19f7\u1a25\u1a1d\u1a0f\u1a1f\u1a29\u1a27\u16cf\u16b8\u1647\u1649\u164a\u1a12\u163d\u1a1f\u1a10\u16b8\u16f4\u1a14\u1a28\u1630\u19f5\u1705\u1a21\u1a13\u1a2c\u1705\u1648\u164a\u16d6\u1a1f\u1a26\u1703\u1a1f\u1703\u1a2b\u1649\u163e\u1a25\u1a23\u16ef\u1706\u19f7\u164c\u19f8\u19f6\u1a21\u16f1\u19f7\u1709\u1a12\u19f6\u1706\u164b\u16ba\u164b\u19f7\u1a2b\u1704\u16dc\u16d1\u16ef\u16f1\u1703\u1a11\u164a\u16b7\u16b8\u16fd\u16da\u1a1e\u1706\u19f7\u1a23\u1a24\u16e6\u1a25\u1a2a\u1a27\u16d1\u16f1\u16d2\u1a14\u1a27\u16dc\u1a1f\u19f7\u19f6\u1630\u19fc\u1a10\u16ba\u1a26\u1705\u1a13\u1a1d\u19f7\u1630\u1a1e\u1709\u1a13\u16ef\u1a27\u16cf\u1a29\u19fc\u1703\u1a24\u16d3\u16d3\u1a2c\u1a1e\u1a2c\u1701\u16cf\u16f1\u16d6\u19fc\u164c\u19fc\u16f4\u1630\u1a12\u1a13".toCharArray();
            for (int i2 = C[318]; i2 < C[319]; ++i2) {
                int n5 = cArray[i2];
                n5 += C[320];
                n5 += C[321];
                n5 ^= C[322];
                n5 -= C[323];
                n5 -= C[324];
                n5 += C[325];
                n5 ^= C[326];
                n5 += C[327];
                n5 += C[328];
                n5 -= C[329];
                cArray[i2] = (char)(n5 ^= C[330]);
            }
            object = MenuLayout.A()[MenuLayout.C[331]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)MenuLayout.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[332];
        n6 -= C[333];
        l6 = l17 ^ (0xA700000000L ^ l17) & -1L << (n6 -= C[334]);
        long l18 = l13;
        int n7 = C[335];
        n7 += C[336];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[337]);
        while (true) {
            int n8 = C[338];
            n8 += C[339];
            if ((int)l13 >= (int)(l6 >>> (n8 -= C[340]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[341];
            n10 ^= C[342];
            int n11 = C[344];
            n11 ^= C[345];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[343])) & -1L >>> (n11 += C[346]);
            long l20 = l9;
            int n12 = C[347];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[348]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[349];
            n14 ^= C[350];
            int n15 = C[352];
            n15 += C[353];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[351])) & -1L >>> (n15 ^= C[354]);
            int n16 = C[355];
            n16 -= C[356];
            long l22 = l10;
            int n17 = C[358];
            n17 += C[359];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= C[357]) ^ l22) & -1L << (n17 += C[360]);
            int n18 = C[361];
            n18 -= C[362];
            n18 += C[363];
            int n19 = C[364];
            n19 += C[365];
            long l23 = l12;
            int n20 = C[367];
            n20 ^= C[368];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[366]))) ^ l23) & -1L >>> (n20 -= C[369]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[370];
            n21 += C[371];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[372]);
            while (true) {
                int n22 = C[373];
                n22 -= C[374];
                if ((int)(l14 >>> (n22 += C[375])) >= (int)l12) break;
                int n23 = C[376];
                n23 ^= C[377];
                int n24 = C[379];
                n24 -= C[380];
                cArray2[(int)(l14 >>> (n23 ^= MenuLayout.C[378]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[381]))];
                l14 += 0x100000000L;
            }
            int n25 = C[382];
            n25 += C[383];
            int n26 = (int)(l15 >>> (n25 ^= C[384]));
            l15 += 0x100000000L;
            MenuLayout.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[385];
            n27 -= C[386];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[387]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[388]];
        String string = (String)object[C[389]];
        object = object[C[390]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[391]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[392]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[394] ^ C[395]];
                byArray[MenuLayout.C[396] ^ MenuLayout.C[397]] = C[398] ^ C[399];
                byArray[0x9110 ^ 0x911E] = 0xFFFF6ECC ^ 0x911E;
                byArray[0x8E6D ^ 0x8E66] = 0xFFFF71A2 ^ 0x8E66;
                byArray[0x7108 ^ 0x710E] = 0xFFFF8EB4 ^ 0x710E;
                byArray[0x2F05 ^ 0x2F0A] = 0xFFFFD0A7 ^ 0x2F0A;
                byArray[0xCB55 ^ 0xCB5D] = 0xFFFF349B ^ 0xCB5D;
                byArray[0x104B8 ^ 0x104BA] = 0xFFFEFB05 ^ 0x104BA;
                byArray[0x5812 ^ 0x5813] = 0x5822 ^ 0x5813;
                byArray[0xA299 ^ 0xA29A] = 0xA2CE ^ 0xA29A;
                byArray[0x75B5 ^ 0x75B8] = 0x75B4 ^ 0x75B8;
                byArray[0x3D1F ^ 0x3D18] = 0x3D63 ^ 0x3D18;
                byArray[0xC073 ^ 0xC07F] = 0xFFFF3FA1 ^ 0xC07F;
                byArray[0x5577 ^ 0x557D] = 0x5550 ^ 0x557D;
                byArray[0x4DB5 ^ 0x4DB1] = 0xFFFFB258 ^ 0x4DB1;
                byArray[0xD9A0 ^ 0xD9A9] = 0xD9C3 ^ 0xD9A9;
                byArray[0x14A9 ^ 0x14AC] = 0xFFFFEB04 ^ 0x14AC;
                objectArray2[MenuLayout.C[393]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (b == null) {
                byte[] byArray2 = new byte[0x3627 ^ 0x3607];
                byArray2[0x9FAF ^ 0x9FBC] = 0xFFFF6018 ^ 0x9FBC;
                byArray2[0x7533 ^ 0x7524] = 0xFFFF8AD7 ^ 0x7524;
                byArray2[0x7A1C ^ 0x7A10] = 0x7A6B ^ 0x7A10;
                byArray2[0x286B ^ 0x286C] = 0x2802 ^ 0x286C;
                byArray2[0xB95F ^ 0xB950] = 0xFFFF469D ^ 0xB950;
                byArray2[0xF16 ^ 0xF04] = 0xFFFFF0F3 ^ 0xF04;
                byArray2[0xF700 ^ 0xF705] = 0xFFFF08A2 ^ 0xF705;
                byArray2[0x10CDF ^ 0x10CD9] = 0x10CE0 ^ 0x10CD9;
                byArray2[0x87CD ^ 0x87CC] = 0xFFFF783C ^ 0x87CC;
                byArray2[0x3120 ^ 0x3123] = 0x311E ^ 0x3123;
                byArray2[0xBB7C ^ 0xBB68] = 0xBB49 ^ 0xBB68;
                byArray2[0xAF4D ^ 0xAF46] = 0xFFFF50C5 ^ 0xAF46;
                byArray2[0x6579 ^ 0x6574] = 0x6560 ^ 0x6574;
                byArray2[0x7B9B ^ 0x7B9B] = 0xFFFF845F ^ 0x7B9B;
                byArray2[0x38DC ^ 0x38D4] = 0x38EE ^ 0x38D4;
                byArray2[0x4A43 ^ 0x4A59] = 0xFFFFB5F9 ^ 0x4A59;
                byArray2[0x93AD ^ 0x93A4] = 0xFFFF6C47 ^ 0x93A4;
                byArray2[0xD080 ^ 0xD084] = 0xD0F0 ^ 0xD084;
                byArray2[0xAE ^ 0xAC] = 0xFFFFFF1A ^ 0xAC;
                byArray2[0xBAD9 ^ 0xBACF] = 0xBAD6 ^ 0xBACF;
                byArray2[0x2F2 ^ 0x2FC] = 0x2E9 ^ 0x2FC;
                byArray2[0xF34B ^ 0xF357] = 0xF354 ^ 0xF357;
                byArray2[0x6B70 ^ 0x6B68] = 0x6B2D ^ 0x6B68;
                byArray2[0x24AA ^ 0x24B3] = 0xFFFFDB62 ^ 0x24B3;
                byArray2[0xB285 ^ 0xB295] = 0xFFFF4D0F ^ 0xB295;
                byArray2[0x4A5F ^ 0x4A42] = 0xFFFFB5C2 ^ 0x4A42;
                byArray2[0x5A90 ^ 0x5A8E] = 0x5AF1 ^ 0x5A8E;
                byArray2[0x450E ^ 0x451F] = 0xFFFFBAAA ^ 0x451F;
                byArray2[0x2BFC ^ 0x2BE7] = 0xFFFFD45B ^ 0x2BE7;
                byArray2[0x49A3 ^ 0x49BC] = 0xFFFFB641 ^ 0x49BC;
                byArray2[0x4A77 ^ 0x4A7D] = 0xFFFFB5B3 ^ 0x4A7D;
                byArray2[0x537A ^ 0x536F] = 0xFFFFACEB ^ 0x536F;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = MenuLayout.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u71b0\u7196\u71b3\u718c\u7182\u7086\u71a7\u71b5\u717c\u71b8\u7198\u71a1\u719d\u71bb\u71ab\u7198\u70fd\u70ed".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xB50;
                        n3 -= 7953;
                        n3 += 47860;
                        n3 ^= 0x9F85;
                        n3 += 29781;
                        n3 ^= 0xE517;
                        n3 += 1353;
                        n3 -= 35147;
                        n3 -= 32796;
                        n3 -= 45164;
                        n3 ^= 0xBF8C;
                        cArray[i2] = (char)(n3 -= 56126);
                    }
                    object4 = MenuLayout.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[0] = -89;
                byArray4[10] = -51;
                byArray4[11] = 100;
                byArray4[4] = -15;
                byArray4[8] = 0;
                byArray4[13] = -1;
                byArray4[1] = 121;
                byArray4[15] = 84;
                byArray4[5] = -75;
                byArray4[7] = 41;
                byArray4[12] = 100;
                byArray4[6] = -14;
                byArray4[14] = -66;
                byArray4[2] = -92;
                byArray4[3] = -114;
                byArray4[9] = -41;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = MenuLayout.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u365b\u37a7\u37ad".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0x22A3;
                        n4 -= 52899;
                        n4 -= 4388;
                        n4 -= 57483;
                        n4 -= 57519;
                        n4 += 52241;
                        n4 += 45105;
                        n4 += 43412;
                        n4 -= 1717;
                        n4 ^= 0xBD3A;
                        n4 += 17211;
                        n4 ^= 0xEDD;
                        cArray[i3] = (char)(n4 -= 32575);
                    }
                    object5 = MenuLayout.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = MenuLayout.A()[3];
            if (object6 == null) {
                char[] cArray = "\u8d68\u8d6c\u8d5a\u8bf6\u8d6a\u8d6d\u8d6a\u8bf6\u8d43\u8d52\u8d6a\u8d5a\u8bfc\u8d43\u8d48\u8d47\u8d47\u8db0\u8db9\u8d4e".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 43841;
                    n5 ^= 0x50C2;
                    n5 += 20162;
                    n5 += 35938;
                    n5 += 32199;
                    n5 += 13194;
                    n5 += 53995;
                    n5 -= 39889;
                    n5 ^= 0xBCF5;
                    n5 += 48534;
                    n5 -= 12855;
                    n5 += 2328;
                    n5 ^= 0xF879;
                    cArray[i4] = (char)(n5 ^= 0xD3BE);
                }
                object6 = MenuLayout.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x2AF ^ 0x33F];
        MenuLayout.C[0xC6E1 ^ 0xC6EB] = 0xFFFF3917 ^ 0xC6EB;
        MenuLayout.C[0xC6AA ^ 0xC7D7] = 0xC7A1 ^ 0xC7D7;
        MenuLayout.C[0xE29A ^ 0xE2CA] = 0xE28D ^ 0xE2CA;
        MenuLayout.C[0x36E ^ 0x20D] = 0x28F ^ 0x20D;
        MenuLayout.C[0x104CA ^ 0x10433] = 0xFFFEFBCF ^ 0x10433;
        MenuLayout.C[0x4E71 ^ 0x4F09] = 0x4F2E ^ 0x4F09;
        MenuLayout.C[0x944D ^ 0x956B] = 0x9509 ^ 0x956B;
        MenuLayout.C[0x77CB ^ 0x779A] = 0x778E ^ 0x779A;
        MenuLayout.C[0xE961 ^ 0xE9D9] = 0xE9A9 ^ 0xE9D9;
        MenuLayout.C[0x485 ^ 0x4CD] = 0x42F ^ 0x4CD;
        MenuLayout.C[0xBFF1 ^ 0xBEC7] = 0xBEF1 ^ 0xBEC7;
        MenuLayout.C[0xB14C ^ 0xB1B6] = 0xFFFF4E5C ^ 0xB1B6;
        MenuLayout.C[0x940 ^ 0x95C] = 0x90F ^ 0x95C;
        MenuLayout.C[0x1100 ^ 0x1080] = 0xFFFFEF7E ^ 0x1080;
        MenuLayout.C[0x6ACB ^ 0x6B89] = 0xA59F ^ 0x6B89;
        MenuLayout.C[0xD172 ^ 0xD059] = 0xD00F ^ 0xD059;
        MenuLayout.C[0xD7FF ^ 0xD75B] = 0xFFFF28A9 ^ 0xD75B;
        MenuLayout.C[0x53E8 ^ 0x53A9] = 0x53CB ^ 0x53A9;
        MenuLayout.C[0x7677 ^ 0x760C] = 0xFFFF89FC ^ 0x760C;
        MenuLayout.C[0xDE17 ^ 0xDF18] = 0xFFFF20F3 ^ 0xDF18;
        MenuLayout.C[0x3BB9 ^ 0x3A37] = 0xFFFF2935 ^ 0x3A37;
        MenuLayout.C[0x4C91 ^ 0x4DF9] = 0xFFFFB27F ^ 0x4DF9;
        MenuLayout.C[0xC41A ^ 0xC591] = 0xBC90 ^ 0xC591;
        MenuLayout.C[0xECF4 ^ 0xECCC] = 0xFFFF132D ^ 0xECCC;
        MenuLayout.C[0x3FB6 ^ 0x3E86] = 0xFFFFC122 ^ 0x3E86;
        MenuLayout.C[0x46C6 ^ 0x463B] = 0x464B ^ 0x463B;
        MenuLayout.C[0xEEE8 ^ 0xEFA6] = 0xFFFF1005 ^ 0xEFA6;
        MenuLayout.C[0xC3ED ^ 0xC3C8] = 0xFFFF3C4B ^ 0xC3C8;
        MenuLayout.C[0x6C62 ^ 0x6D24] = 0x9D4C ^ 0x6D24;
        MenuLayout.C[0xB771 ^ 0xB722] = 0xB70B ^ 0xB722;
        MenuLayout.C[0x4832 ^ 0x4959] = 0x4934 ^ 0x4959;
        MenuLayout.C[0x105F9 ^ 0x1059B] = 0xFFFEFA5C ^ 0x1059B;
        MenuLayout.C[0xC4 ^ 0xE4] = 0xDA ^ 0xE4;
        MenuLayout.C[0xED9F ^ 0xECCD] = 0xEC06 ^ 0xECCD;
        MenuLayout.C[0x9BBC ^ 0x9B35] = 0x9B1B ^ 0x9B35;
        MenuLayout.C[0xD89A ^ 0xD98E] = 0xFFFF2679 ^ 0xD98E;
        MenuLayout.C[0x2A6E ^ 0x2A27] = 0x2A63 ^ 0x2A27;
        MenuLayout.C[0x857F ^ 0x85EB] = 0x85FA ^ 0x85EB;
        MenuLayout.C[0x4E3A ^ 0x4EBF] = 0xFFFFB112 ^ 0x4EBF;
        MenuLayout.C[0x5440 ^ 0x5486] = 0x54ED ^ 0x5486;
        MenuLayout.C[0xDF92 ^ 0xDEBB] = 0xFFFF2161 ^ 0xDEBB;
        MenuLayout.C[0x942E ^ 0x949F] = 0xFFFF6B20 ^ 0x949F;
        MenuLayout.C[0x7562 ^ 0x756F] = 0x7578 ^ 0x756F;
        MenuLayout.C[0xD30 ^ 0xDA3] = 0xD86 ^ 0xDA3;
        MenuLayout.C[0xF804 ^ 0xF865] = 0xFFFF079A ^ 0xF865;
        MenuLayout.C[0x7197 ^ 0x711F] = 0xFFFF8EF4 ^ 0x711F;
        MenuLayout.C[0x4201 ^ 0x426B] = 0x421B ^ 0x426B;
        MenuLayout.C[0x10282 ^ 0x1029D] = 0x10296 ^ 0x1029D;
        MenuLayout.C[0xA995 ^ 0xA813] = 0xA813 ^ 0xA813;
        MenuLayout.C[0x3E9A ^ 0x3E3F] = 0x3E2D ^ 0x3E3F;
        MenuLayout.C[0xD89F ^ 0xD874] = 0xD870 ^ 0xD874;
        MenuLayout.C[0x6912 ^ 0x6876] = 0x6811 ^ 0x6876;
        MenuLayout.C[0x3637 ^ 0x36B4] = 0x369B ^ 0x36B4;
        MenuLayout.C[0x8A8B ^ 0x8A4C] = 0xFFFF75D0 ^ 0x8A4C;
        MenuLayout.C[0xE949 ^ 0xE97D] = 0xE92E ^ 0xE97D;
        MenuLayout.C[0x9763 ^ 0x966E] = 0xFFFF69DC ^ 0x966E;
        MenuLayout.C[0x58B5 ^ 0x58E0] = 0x58A3 ^ 0x58E0;
        MenuLayout.C[0x6AF6 ^ 0x6A21] = 0x6A48 ^ 0x6A21;
        MenuLayout.C[0x44A8 ^ 0x4588] = 0x4528 ^ 0x4588;
        MenuLayout.C[0x1089E ^ 0x108B4] = 0x108B2 ^ 0x108B4;
        MenuLayout.C[0x6543 ^ 0x65A4] = 0xFFFF9A54 ^ 0x65A4;
        MenuLayout.C[0x49A0 ^ 0x48E8] = 0x4A63 ^ 0x48E8;
        MenuLayout.C[0x5753 ^ 0x5658] = 0x5650 ^ 0x5658;
        MenuLayout.C[0x43F1 ^ 0x43E0] = 0xFFFFBC72 ^ 0x43E0;
        MenuLayout.C[0xB102 ^ 0xB031] = 0xB066 ^ 0xB031;
        MenuLayout.C[0x1415 ^ 0x14CC] = 0x14DC ^ 0x14CC;
        MenuLayout.C[0xC9CE ^ 0xC94C] = 0xFFFF36F2 ^ 0xC94C;
        MenuLayout.C[0xF34B ^ 0xF27E] = 0xF2FA ^ 0xF27E;
        MenuLayout.C[0x34DA ^ 0x34A7] = 0x34F2 ^ 0x34A7;
        MenuLayout.C[0x8887 ^ 0x8991] = 0xFFFF7641 ^ 0x8991;
        MenuLayout.C[0xC1D ^ 0xC67] = 0xC79 ^ 0xC67;
        MenuLayout.C[0x6F6A ^ 0x6E58] = 0xFFFF91AB ^ 0x6E58;
        MenuLayout.C[0x6943 ^ 0x687F] = 0x687D ^ 0x687F;
        MenuLayout.C[0x51EB ^ 0x509B] = 0x50FC ^ 0x509B;
        MenuLayout.C[0xC2A ^ 0xD44] = 0xFFFFF297 ^ 0xD44;
        MenuLayout.C[0xDD3D ^ 0xDDA0] = 0xDD9D ^ 0xDDA0;
        MenuLayout.C[0xA3FA ^ 0xA3D6] = 0xFFFF5C50 ^ 0xA3D6;
        MenuLayout.C[0xE697 ^ 0xE6CC] = 0xFFFF1962 ^ 0xE6CC;
        MenuLayout.C[0x1B46 ^ 0x1B4A] = 0x1B7B ^ 0x1B4A;
        MenuLayout.C[0xC2E6 ^ 0xC235] = 0xC250 ^ 0xC235;
        MenuLayout.C[0xE321 ^ 0xE2AC] = 0xE45 ^ 0xE2AC;
        MenuLayout.C[0x57D1 ^ 0x5787] = 0xFFFFA873 ^ 0x5787;
        MenuLayout.C[0x6540 ^ 0x6514] = 0x6547 ^ 0x6514;
        MenuLayout.C[0x10A58 ^ 0x10AA9] = 0x10A9A ^ 0x10AA9;
        MenuLayout.C[0xA3F5 ^ 0xA38B] = 0xFFFF5CE7 ^ 0xA38B;
        MenuLayout.C[0x15EB ^ 0x152B] = 0xFFFFEAC0 ^ 0x152B;
        MenuLayout.C[0x97B6 ^ 0x979F] = 0xFFFF6848 ^ 0x979F;
        MenuLayout.C[0xD5E5 ^ 0xD526] = 0xFFFF2A92 ^ 0xD526;
        MenuLayout.C[0x614B ^ 0x6108] = 0xFFFF9ED7 ^ 0x6108;
        MenuLayout.C[0xFEA9 ^ 0xFE74] = 0xFFFF01F7 ^ 0xFE74;
        MenuLayout.C[0xC8F4 ^ 0xC820] = 0xC866 ^ 0xC820;
        MenuLayout.C[0x1E51 ^ 0x1EAD] = 0x1ED2 ^ 0x1EAD;
        MenuLayout.C[0x6A71 ^ 0x6AE9] = 0x6A81 ^ 0x6AE9;
        MenuLayout.C[0x66BF ^ 0x6626] = 0xFFFF99BA ^ 0x6626;
        MenuLayout.C[0x4A48 ^ 0x4A20] = 0xFFFFB5E3 ^ 0x4A20;
        MenuLayout.C[0xF1DC ^ 0xF156] = 0xF138 ^ 0xF156;
        MenuLayout.C[0x6D32 ^ 0x6DD1] = 0xFFFF9240 ^ 0x6DD1;
        MenuLayout.C[0xB895 ^ 0xB99D] = 0xB994 ^ 0xB99D;
        MenuLayout.C[0x65A2 ^ 0x65EE] = 0xFFFF9A12 ^ 0x65EE;
        MenuLayout.C[0xCF50 ^ 0xCFE7] = 0xCF89 ^ 0xCFE7;
        MenuLayout.C[0x829B ^ 0x825E] = 0xFFFF7DDA ^ 0x825E;
        MenuLayout.C[0xC3BF ^ 0xC315] = 0xFFFF3C81 ^ 0xC315;
        MenuLayout.C[0x5A70 ^ 0x5A47] = 0x5A47 ^ 0x5A47;
        MenuLayout.C[0x5A9B ^ 0x5A55] = 0x5A29 ^ 0x5A55;
        MenuLayout.C[0x9D3 ^ 0x92B] = 0x91D ^ 0x92B;
        MenuLayout.C[0xB6F3 ^ 0xB6E9] = 0xB680 ^ 0xB6E9;
        MenuLayout.C[0x7A56 ^ 0x7A3F] = 0x7A79 ^ 0x7A3F;
        MenuLayout.C[0xCFDA ^ 0xCFB5] = 0xCF0F ^ 0xCFB5;
        MenuLayout.C[0x1CF ^ 0xDA] = 0xFFFFFF03 ^ 0xDA;
        MenuLayout.C[0x53EF ^ 0x53A0] = 0x53C2 ^ 0x53A0;
        MenuLayout.C[0x23FB ^ 0x233A] = 0xFFFFDCC6 ^ 0x233A;
        MenuLayout.C[0x6B39 ^ 0x6B73] = 0xFFFF94F1 ^ 0x6B73;
        MenuLayout.C[0x503 ^ 0x5B8] = 0xFFFFFA25 ^ 0x5B8;
        MenuLayout.C[0x4FC5 ^ 0x4FE1] = 0xFFFFB003 ^ 0x4FE1;
        MenuLayout.C[0xA4DA ^ 0xA5B0] = 0xA5A9 ^ 0xA5B0;
        MenuLayout.C[0x4558 ^ 0x447A] = 0x4447 ^ 0x447A;
        MenuLayout.C[0x1FCD ^ 0x1ECB] = 0xFFFFE109 ^ 0x1ECB;
        MenuLayout.C[0x97B0 ^ 0x97B8] = 0x97FC ^ 0x97B8;
        MenuLayout.C[0xEDF0 ^ 0xEDE3] = 0xEDD7 ^ 0xEDE3;
        MenuLayout.C[0x8489 ^ 0x8428] = 0xFFFF7B9E ^ 0x8428;
        MenuLayout.C[0x5908 ^ 0x5806] = 0x5815 ^ 0x5806;
        MenuLayout.C[0x7664 ^ 0x76CD] = 0xFFFF8948 ^ 0x76CD;
        MenuLayout.C[0x685D ^ 0x692A] = 0x6964 ^ 0x692A;
        MenuLayout.C[0x61DB ^ 0x609C] = 0x9B05 ^ 0x609C;
        MenuLayout.C[0xAE2F ^ 0xAEFA] = 0xFFFF513C ^ 0xAEFA;
        MenuLayout.C[0x62A1 ^ 0x621B] = 0x623A ^ 0x621B;
        MenuLayout.C[0x5B54 ^ 0x5B10] = 0xFFFFA4D6 ^ 0x5B10;
        MenuLayout.C[0xA14A ^ 0xA0C3] = 0xA0C3 ^ 0xA0C3;
        MenuLayout.C[0x5796 ^ 0x5703] = 0xFFFFA8E9 ^ 0x5703;
        MenuLayout.C[0xEF69 ^ 0xEFE6] = 0xEFFD ^ 0xEFE6;
        MenuLayout.C[0x45AD ^ 0x4590] = 0xFFFFBA0B ^ 0x4590;
        MenuLayout.C[0x9D41 ^ 0x9D07] = 0xFFFF62A3 ^ 0x9D07;
        MenuLayout.C[0xBC55 ^ 0xBC55] = 0xBC72 ^ 0xBC55;
        MenuLayout.C[0x49B1 ^ 0x4990] = 0x49E3 ^ 0x4990;
        MenuLayout.C[0xC8D1 ^ 0xC9EF] = 0xC9EF ^ 0xC9EF;
        MenuLayout.C[0x58AB ^ 0x5888] = 0x58A7 ^ 0x5888;
        MenuLayout.C[0x3FA2 ^ 0x3F3E] = 0xFFFFC08C ^ 0x3F3E;
        MenuLayout.C[0x1F38 ^ 0x1E02] = 0x1E03 ^ 0x1E02;
        MenuLayout.C[0x5C32 ^ 0x5D7F] = 0xFFFFA2AA ^ 0x5D7F;
        MenuLayout.C[0xD8A2 ^ 0xD840] = 0xD819 ^ 0xD840;
        MenuLayout.C[0x8B8E ^ 0x8BA3] = 0x8BB5 ^ 0x8BA3;
        MenuLayout.C[0xF042 ^ 0xF060] = 0xFFFF0FDC ^ 0xF060;
        MenuLayout.C[0xF462 ^ 0xF430] = 0xFFFF0BFB ^ 0xF430;
        MenuLayout.C[0x1DD ^ 0xA9] = 0xFFFFFF51 ^ 0xA9;
        MenuLayout.C[0xB1E8 ^ 0xB104] = 0xB17F ^ 0xB104;
        MenuLayout.C[0x4D18 ^ 0x4C51] = 0xC02A ^ 0x4C51;
        MenuLayout.C[0xC86F ^ 0xC8C2] = 0xC8EA ^ 0xC8C2;
        MenuLayout.C[0x82D6 ^ 0x8244] = 0x821B ^ 0x8244;
        MenuLayout.C[0xA293 ^ 0xA381] = 0xFFFF5C06 ^ 0xA381;
        MenuLayout.C[0x449A ^ 0x4469] = 0x444A ^ 0x4469;
        MenuLayout.C[0x89B5 ^ 0x88C9] = 0x88E9 ^ 0x88C9;
        MenuLayout.C[0x355E ^ 0x347D] = 0xFFFFCB8C ^ 0x347D;
        MenuLayout.C[0x1E27 ^ 0x1F6D] = 0x7983 ^ 0x1F6D;
        MenuLayout.C[0x10953 ^ 0x10844] = 0x1085F ^ 0x10844;
        MenuLayout.C[0x656D ^ 0x64EA] = 0x64EB ^ 0x64EA;
        MenuLayout.C[0x97F3 ^ 0x96EB] = 0x96F8 ^ 0x96EB;
        MenuLayout.C[0xA972 ^ 0xA825] = 0xFFFF57C3 ^ 0xA825;
        MenuLayout.C[0x400D ^ 0x40D2] = 0x4080 ^ 0x40D2;
        MenuLayout.C[0xB194 ^ 0xB0CB] = 0xFFFF4F28 ^ 0xB0CB;
        MenuLayout.C[0xBB94 ^ 0xBAAD] = 0xBAAD ^ 0xBAAD;
        MenuLayout.C[0x198A ^ 0x1983] = 0x19C8 ^ 0x1983;
        MenuLayout.C[0xB582 ^ 0xB5E4] = 0xFFFF4A31 ^ 0xB5E4;
        MenuLayout.C[0xD989 ^ 0xD9F1] = 0xD9BA ^ 0xD9F1;
        MenuLayout.C[0xB08F ^ 0xB1D7] = 0xB1E8 ^ 0xB1D7;
        MenuLayout.C[0xEB6F ^ 0xEB50] = 0xFFFF169C ^ 0xEB50;
        MenuLayout.C[0x50A0 ^ 0x51C9] = 0xFFFFAE75 ^ 0x51C9;
        MenuLayout.C[0xBE85 ^ 0xBE4D] = 0xBE64 ^ 0xBE4D;
        MenuLayout.C[0xFE6B ^ 0xFE7D] = 0xFFFF01DA ^ 0xFE7D;
        MenuLayout.C[0x5F49 ^ 0x5EC5] = 0xB22C ^ 0x5EC5;
        MenuLayout.C[0xA399 ^ 0xA392] = 0xA3D4 ^ 0xA392;
        MenuLayout.C[0x377F ^ 0x361A] = 0x3621 ^ 0x361A;
        MenuLayout.C[0x3292 ^ 0x327B] = 0x3254 ^ 0x327B;
        MenuLayout.C[0x4905 ^ 0x4824] = 0xFFFFB7B9 ^ 0x4824;
        MenuLayout.C[0xE609 ^ 0xE6DB] = 0xE6D8 ^ 0xE6DB;
        MenuLayout.C[0xF135 ^ 0xF12E] = 0xF157 ^ 0xF12E;
        MenuLayout.C[0x98BE ^ 0x99FE] = 0x9ACE ^ 0x99FE;
        MenuLayout.C[0xD5B5 ^ 0xD5F5] = 0xFFFF2A5B ^ 0xD5F5;
        MenuLayout.C[0x1C78 ^ 0x1C5E] = 0xFFFFE3FE ^ 0x1C5E;
        MenuLayout.C[0x35E5 ^ 0x35D4] = 0xFFFFCA7F ^ 0x35D4;
        MenuLayout.C[0x686F ^ 0x6909] = 0x69DA ^ 0x6909;
        MenuLayout.C[0x70E2 ^ 0x70EC] = 0x70F6 ^ 0x70EC;
        MenuLayout.C[0xF115 ^ 0xF19B] = 0xF1AD ^ 0xF19B;
        MenuLayout.C[0xE1D5 ^ 0xE154] = 0xE159 ^ 0xE154;
        MenuLayout.C[0x814 ^ 0x8B7] = 0x8AB ^ 0x8B7;
        MenuLayout.C[0xF66D ^ 0xF64A] = 0xF625 ^ 0xF64A;
        MenuLayout.C[0xBF88 ^ 0xBFFC] = 0xBFB8 ^ 0xBFFC;
        MenuLayout.C[0x5E3C ^ 0x5E8A] = 0xFFFFA151 ^ 0x5E8A;
        MenuLayout.C[0x10598 ^ 0x105C7] = 0x105F2 ^ 0x105C7;
        MenuLayout.C[0xCB2D ^ 0xCA2F] = 0xCA71 ^ 0xCA2F;
        MenuLayout.C[0x5B2C ^ 0x5B62] = 0x5B67 ^ 0x5B62;
        MenuLayout.C[0x1F48 ^ 0x1FA8] = 0x1F82 ^ 0x1FA8;
        MenuLayout.C[0xDE29 ^ 0xDE86] = 0xDEF2 ^ 0xDE86;
        MenuLayout.C[0x7527 ^ 0x7540] = 0x7546 ^ 0x7540;
        MenuLayout.C[0x10F7C ^ 0x10E41] = 0x10E41 ^ 0x10E41;
        MenuLayout.C[0x42A0 ^ 0x4250] = 0x4253 ^ 0x4250;
        MenuLayout.C[0xA1A0 ^ 0xA022] = 0xFFFF5F8F ^ 0xA022;
        MenuLayout.C[0x1D9B ^ 0x1D74] = 0x1D51 ^ 0x1D74;
        MenuLayout.C[0x3443 ^ 0x3470] = 0x3462 ^ 0x3470;
        MenuLayout.C[0xC337 ^ 0xC23D] = 0xFFFF3DFC ^ 0xC23D;
        MenuLayout.C[0xC613 ^ 0xC6D8] = 0xC692 ^ 0xC6D8;
        MenuLayout.C[0xC6D ^ 0xD72] = 0xD2B ^ 0xD72;
        MenuLayout.C[0xC5D4 ^ 0xC495] = 0x9E36 ^ 0xC495;
        MenuLayout.C[0xD2CB ^ 0xD204] = 0xD229 ^ 0xD204;
        MenuLayout.C[0xBE14 ^ 0xBE94] = 0xBEDB ^ 0xBE94;
        MenuLayout.C[0x594F ^ 0x59E1] = 0x59F6 ^ 0x59E1;
        MenuLayout.C[0x2C89 ^ 0x2CC2] = 0xFFFFD30A ^ 0x2CC2;
        MenuLayout.C[0x9306 ^ 0x933D] = 0x9300 ^ 0x933D;
        MenuLayout.C[0x447D ^ 0x4538] = 0x67BF ^ 0x4538;
        MenuLayout.C[0x7587 ^ 0x75EA] = 0xFFFF8A57 ^ 0x75EA;
        MenuLayout.C[0xA423 ^ 0xA575] = 0xA556 ^ 0xA575;
        MenuLayout.C[0xF04F ^ 0xF0E3] = 0xF0A0 ^ 0xF0E3;
        MenuLayout.C[0x836F ^ 0x8243] = 0x8254 ^ 0x8243;
        MenuLayout.C[0x1216 ^ 0x1272] = 0x1270 ^ 0x1272;
        MenuLayout.C[0x6592 ^ 0x64EC] = 0xFFFF9B33 ^ 0x64EC;
        MenuLayout.C[0x2EF4 ^ 0x2E6E] = 0x2E5A ^ 0x2E6E;
        MenuLayout.C[0xDF46 ^ 0xDF68] = 0xDF2A ^ 0xDF68;
        MenuLayout.C[0x83C9 ^ 0x837A] = 0xFFFF7CAD ^ 0x837A;
        MenuLayout.C[0x6108 ^ 0x6012] = 0xFFFF9FA2 ^ 0x6012;
        MenuLayout.C[0x43C2 ^ 0x42CB] = 0x4282 ^ 0x42CB;
        MenuLayout.C[0xC7AD ^ 0xC760] = 0xC756 ^ 0xC760;
        MenuLayout.C[0x5FC1 ^ 0x5F34] = 0x5F2A ^ 0x5F34;
        MenuLayout.C[0x10010 ^ 0x100B6] = 0x10091 ^ 0x100B6;
        MenuLayout.C[0x5FD6 ^ 0x5EC7] = 0xFFFFA1FF ^ 0x5EC7;
        MenuLayout.C[0x8799 ^ 0x86BC] = 0xFFFF790C ^ 0x86BC;
        MenuLayout.C[0x1439 ^ 0x1463] = 0xFFFFEBE4 ^ 0x1463;
        MenuLayout.C[0xA830 ^ 0xA806] = 0xA859 ^ 0xA806;
        MenuLayout.C[0xE75D ^ 0xE743] = 0xE777 ^ 0xE743;
        MenuLayout.C[0x6E3B ^ 0x6E01] = 0x6E0B ^ 0x6E01;
        MenuLayout.C[0x5F29 ^ 0x5FAE] = 0xFFFFA04B ^ 0x5FAE;
        MenuLayout.C[0x10088 ^ 0x101FA] = 0xFFFEFE1D ^ 0x101FA;
        MenuLayout.C[0x8AB ^ 0x9C4] = 0x9B6 ^ 0x9C4;
        MenuLayout.C[0xB3CB ^ 0xB301] = 0xFFFF4C8E ^ 0xB301;
        MenuLayout.C[0x1423 ^ 0x14D8] = 0xFFFFEB2A ^ 0x14D8;
        MenuLayout.C[0x6BD5 ^ 0x6B7E] = 0x6B45 ^ 0x6B7E;
        MenuLayout.C[0x9341 ^ 0x9330] = 0x934E ^ 0x9330;
        MenuLayout.C[0x37D3 ^ 0x37DC] = 0xFFFFC87A ^ 0x37DC;
        MenuLayout.C[0x35AE ^ 0x359E] = 0xFFFFCAEA ^ 0x359E;
        MenuLayout.C[0xEF7E ^ 0xEE2B] = 0xFFFF11EF ^ 0xEE2B;
        MenuLayout.C[0x9FC8 ^ 0x9F85] = 0xFFFF6061 ^ 0x9F85;
        MenuLayout.C[0x2B1E ^ 0x2A1F] = 0x2A02 ^ 0x2A1F;
        MenuLayout.C[0x7E03 ^ 0x7F59] = 0xFFFF80FE ^ 0x7F59;
        MenuLayout.C[0x6D12 ^ 0x6D0F] = 0x6D25 ^ 0x6D0F;
        MenuLayout.C[0xACFC ^ 0xAC5C] = 0xFFFF53A2 ^ 0xAC5C;
        MenuLayout.C[0xBE3A ^ 0xBF2A] = 0xBF22 ^ 0xBF2A;
        MenuLayout.C[0x2B4F ^ 0x2A52] = 0x2ADF ^ 0x2A52;
        MenuLayout.C[0x946B ^ 0x9419] = 0x941C ^ 0x9419;
        MenuLayout.C[0xCB97 ^ 0xCBD5] = 0xFFFF3032 ^ 0xCBD5;
        MenuLayout.C[0x6817 ^ 0x6930] = 0xFFFF96FA ^ 0x6930;
        MenuLayout.C[0x1044 ^ 0x111F] = 0x113A ^ 0x111F;
        MenuLayout.C[0xDEF8 ^ 0xDEFB] = 0xFFFF2157 ^ 0xDEFB;
        MenuLayout.C[0x69D1 ^ 0x695D] = 0x6931 ^ 0x695D;
        MenuLayout.C[0x10818 ^ 0x108DA] = 0xFFFEF722 ^ 0x108DA;
        MenuLayout.C[0xF39B ^ 0xF2D4] = 0xFFFF0D77 ^ 0xF2D4;
        MenuLayout.C[0xD7F0 ^ 0xD6CB] = 0xD6CB ^ 0xD6CB;
        MenuLayout.C[0xF52D ^ 0xF440] = 0xF451 ^ 0xF440;
        MenuLayout.C[0x9B0A ^ 0x9BB6] = 0xFFFF642A ^ 0x9BB6;
        MenuLayout.C[0xFD53 ^ 0xFD43] = 0xFD57 ^ 0xFD43;
        MenuLayout.C[0x9C99 ^ 0x9DA1] = 0x9DA2 ^ 0x9DA1;
        MenuLayout.C[0x1DF0 ^ 0x1D15] = 0xFFFFE2E6 ^ 0x1D15;
        MenuLayout.C[0xCDA2 ^ 0xCC2D] = 0x20C4 ^ 0xCC2D;
        MenuLayout.C[0x4548 ^ 0x443E] = 0x447E ^ 0x443E;
        MenuLayout.C[0x252E ^ 0x254D] = 0xFFFFDA8C ^ 0x254D;
        MenuLayout.C[0x3D9A ^ 0x3DB1] = 0xFFFFC239 ^ 0x3DB1;
        MenuLayout.C[0x4935 ^ 0x49EE] = 0x4940 ^ 0x49EE;
        MenuLayout.C[0x6440 ^ 0x6439] = 0xFFFF9BCA ^ 0x6439;
        MenuLayout.C[0x11C9 ^ 0x10D7] = 0x10E3 ^ 0x10D7;
        MenuLayout.C[0xDA13 ^ 0xDB43] = 0xDB30 ^ 0xDB43;
        MenuLayout.C[0x20F6 ^ 0x204B] = 0x20F4 ^ 0x204B;
        MenuLayout.C[0xD295 ^ 0xD2C8] = 0xD288 ^ 0xD2C8;
        MenuLayout.C[0x81AF ^ 0x802E] = 0xFFFF7FC4 ^ 0x802E;
        MenuLayout.C[0x6B03 ^ 0x6A2C] = 0xFFFF95FE ^ 0x6A2C;
        MenuLayout.C[0xE31B ^ 0xE3C1] = 0xE3FA ^ 0xE3C1;
        MenuLayout.C[0x1871 ^ 0x1904] = 0x1916 ^ 0x1904;
        MenuLayout.C[0xFD34 ^ 0xFC2D] = 0xFFFF03D5 ^ 0xFC2D;
        MenuLayout.C[0x9CE1 ^ 0x9C15] = 0xFFFF63F0 ^ 0x9C15;
        MenuLayout.C[0x71E ^ 0x77B] = 0xFFFFF8B0 ^ 0x77B;
        MenuLayout.C[0x107F4 ^ 0x106EF] = 0x106CD ^ 0x106EF;
        MenuLayout.C[0x15E9 ^ 0x14C3] = 0x14B3 ^ 0x14C3;
        MenuLayout.C[0xFE86 ^ 0xFED1] = 0xFFFF0138 ^ 0xFED1;
        MenuLayout.C[0x463B ^ 0x47B8] = 0xFFFFB85B ^ 0x47B8;
        MenuLayout.C[0x7418 ^ 0x74EE] = 0x74DD ^ 0x74EE;
        MenuLayout.C[0x937C ^ 0x927C] = 0xFFFF6DD9 ^ 0x927C;
        MenuLayout.C[0xC545 ^ 0xC41B] = 0xC423 ^ 0xC41B;
        MenuLayout.C[0x1260 ^ 0x132B] = 0x132B ^ 0x132B;
        MenuLayout.C[0xAD24 ^ 0xADF5] = 0xFFFF5268 ^ 0xADF5;
        MenuLayout.C[0xC29 ^ 0xD78] = 0xD4E ^ 0xD78;
        MenuLayout.C[0xABB ^ 0xA20] = 0xFFFFF5A8 ^ 0xA20;
        MenuLayout.C[0xB270 ^ 0xB235] = 0xB2AF ^ 0xB235;
        MenuLayout.C[0xE389 ^ 0xE2F8] = 0xFFFF1D0D ^ 0xE2F8;
        MenuLayout.C[0x5826 ^ 0x58B1] = 0x58A2 ^ 0x58B1;
        MenuLayout.C[0x542A ^ 0x5473] = 0xFFFFABDB ^ 0x5473;
        MenuLayout.C[0x7C9 ^ 0x643] = 0x7F52 ^ 0x643;
        MenuLayout.C[0xF616 ^ 0xF727] = 0xFFFF08F4 ^ 0xF727;
        MenuLayout.C[0x8E1A ^ 0x8F06] = 0xFFFF70D4 ^ 0x8F06;
        MenuLayout.C[0xE694 ^ 0xE675] = 0xE67F ^ 0xE675;
        MenuLayout.C[0x186A ^ 0x1801] = 0x182A ^ 0x1801;
        MenuLayout.C[0x3500 ^ 0x342D] = 0x345B ^ 0x342D;
        MenuLayout.C[0x3EDD ^ 0x3E43] = 0xFFFFC1D3 ^ 0x3E43;
        MenuLayout.C[0xF0BB ^ 0xF1DA] = 0xF181 ^ 0xF1DA;
        MenuLayout.C[0x9461 ^ 0x949E] = 0x9406 ^ 0x949E;
        MenuLayout.C[0xF341 ^ 0xF3AB] = 0xFFFF0C02 ^ 0xF3AB;
        MenuLayout.C[0xCA72 ^ 0xCB76] = 0xCB0C ^ 0xCB76;
        MenuLayout.C[0x78CA ^ 0x7894] = 0x78E7 ^ 0x7894;
        MenuLayout.C[0xCB40 ^ 0xCA33] = 0xCA72 ^ 0xCA33;
        MenuLayout.C[0xC8BA ^ 0xC818] = 0xFFFF37EE ^ 0xC818;
        MenuLayout.C[0xA383 ^ 0xA2B4] = 0xA29A ^ 0xA2B4;
        MenuLayout.C[0x18CA ^ 0x18CE] = 0x188E ^ 0x18CE;
        MenuLayout.C[0x849E ^ 0x8460] = 0x8470 ^ 0x8460;
        MenuLayout.C[0x3976 ^ 0x3948] = 0xFFFFC6AC ^ 0x3948;
        MenuLayout.C[0xB5B5 ^ 0xB551] = 0xFFFF4A9E ^ 0xB551;
        MenuLayout.C[0x4911 ^ 0x4917] = 0x49A0 ^ 0x4917;
        MenuLayout.C[0x571F ^ 0x565C] = 0xA8DA ^ 0x565C;
        MenuLayout.C[0xAC35 ^ 0xAC37] = 0xAC52 ^ 0xAC37;
        MenuLayout.C[0x28F3 ^ 0x2885] = 0xFFFFD76F ^ 0x2885;
        MenuLayout.C[0x343C ^ 0x3414] = 0x3450 ^ 0x3414;
        MenuLayout.C[0x5CE1 ^ 0x5C6A] = 0xFFFFA3B4 ^ 0x5C6A;
        MenuLayout.C[0x4ECD ^ 0x4F9E] = 0xFFFFB04C ^ 0x4F9E;
        MenuLayout.C[0x669 ^ 0x684] = 0x6FD ^ 0x684;
        MenuLayout.C[0xB9ED ^ 0xB8D2] = 0xB9D2 ^ 0xB8D2;
        MenuLayout.C[0x1484 ^ 0x1476] = 0x145F ^ 0x1476;
        MenuLayout.C[0x8164 ^ 0x81F4] = 0x8122 ^ 0x81F4;
        MenuLayout.C[0x5A3 ^ 0x4DA] = 0x4B3 ^ 0x4DA;
        MenuLayout.C[0xFE19 ^ 0xFE69] = 0xFFFF01AF ^ 0xFE69;
        MenuLayout.C[0x5673 ^ 0x572A] = 0x576C ^ 0x572A;
        MenuLayout.C[0x5698 ^ 0x56B7] = 0xFFFFA97B ^ 0x56B7;
        MenuLayout.C[0x471F ^ 0x476A] = 0x4768 ^ 0x476A;
        MenuLayout.C[0xFFC7 ^ 0xFEBD] = 0xFED3 ^ 0xFEBD;
        MenuLayout.C[0xE77E ^ 0xE7F8] = 0xE7E3 ^ 0xE7F8;
        MenuLayout.C[0x52F2 ^ 0x52EA] = 0xFFFFADD8 ^ 0x52EA;
        MenuLayout.C[0x3968 ^ 0x3908] = 0x393D ^ 0x3908;
        MenuLayout.C[0x9111 ^ 0x906E] = 0xFFFF6F91 ^ 0x906E;
        MenuLayout.C[0x3870 ^ 0x389E] = 0xFFFFC712 ^ 0x389E;
        MenuLayout.C[0xCA20 ^ 0xCA25] = 0xCA31 ^ 0xCA25;
        MenuLayout.C[0x7930 ^ 0x7947] = 0x795F ^ 0x7947;
        MenuLayout.C[0xDF6F ^ 0xDE68] = 0xFFFF2188 ^ 0xDE68;
        MenuLayout.C[0x981B ^ 0x98EC] = 0x98CF ^ 0x98EC;
        MenuLayout.C[0x2570 ^ 0x25E1] = 0x25B9 ^ 0x25E1;
        MenuLayout.C[0x345B ^ 0x34FC] = 0xFFFFCB1B ^ 0x34FC;
        MenuLayout.C[0x7F31 ^ 0x7E6D] = 0xFFFF8196 ^ 0x7E6D;
        MenuLayout.C[0xECB7 ^ 0xEDBB] = 0xEDED ^ 0xEDBB;
        MenuLayout.C[0x9F49 ^ 0x9F7B] = 0xFFFF60A2 ^ 0x9F7B;
        MenuLayout.C[0x81BC ^ 0x81D0] = 0xFFFF7E06 ^ 0x81D0;
        MenuLayout.C[0x3EBB ^ 0x3E77] = 0x3EA6 ^ 0x3E77;
        MenuLayout.C[0x65EC ^ 0x64C2] = 0xFFFF9B63 ^ 0x64C2;
        MenuLayout.C[0x263A ^ 0x262D] = 0x2601 ^ 0x262D;
        MenuLayout.C[0xFB55 ^ 0xFA71] = 0xFA30 ^ 0xFA71;
        MenuLayout.C[0x3770 ^ 0x37B9] = 0x3762 ^ 0x37B9;
        MenuLayout.C[0xEE30 ^ 0xEF74] = 0x3623 ^ 0xEF74;
        MenuLayout.C[0xD2AB ^ 0xD24D] = 0xFFFF2D8E ^ 0xD24D;
        MenuLayout.C[0x2C20 ^ 0x2D23] = 0xFFFFD2DB ^ 0x2D23;
        MenuLayout.C[0xDE41 ^ 0xDEFF] = 0xFFFF2120 ^ 0xDEFF;
        MenuLayout.C[0x104C1 ^ 0x10595] = 0x105E8 ^ 0x10595;
        MenuLayout.C[0xBC23 ^ 0xBC96] = 0xBC85 ^ 0xBC96;
        MenuLayout.C[0xE830 ^ 0xE8EE] = 0xE872 ^ 0xE8EE;
        MenuLayout.C[0xB0B6 ^ 0xB06E] = 0xFFFF4F9A ^ 0xB06E;
        MenuLayout.C[0x3311 ^ 0x3303] = 0x335A ^ 0x3303;
        MenuLayout.C[0x6D65 ^ 0x6DD1] = 0xFFFF9260 ^ 0x6DD1;
        MenuLayout.C[0x1FF1 ^ 0x1FCD] = 0x1E4C ^ 0x1FCD;
        MenuLayout.C[0x105BF ^ 0x105BE] = 0x105FF ^ 0x105BE;
        MenuLayout.C[0x5978 ^ 0x581F] = 0xFFFFA7D8 ^ 0x581F;
        MenuLayout.C[0xC9E1 ^ 0xC8E4] = 0xC8E6 ^ 0xC8E4;
        MenuLayout.C[0xF793 ^ 0xF72C] = 0xFFFF08AE ^ 0xF72C;
        MenuLayout.C[0x3263 ^ 0x325A] = 0x32E9 ^ 0x325A;
        MenuLayout.C[0x879E ^ 0x871A] = 0xFFFF7886 ^ 0x871A;
        MenuLayout.C[0x4017 ^ 0x40D3] = 0x40C3 ^ 0x40D3;
        MenuLayout.C[0xBA9E ^ 0xBBFE] = 0xFFFF4479 ^ 0xBBFE;
        MenuLayout.C[0x1EF7 ^ 0x1E47] = 0xFFFFE1D2 ^ 0x1E47;
        MenuLayout.C[0x5F59 ^ 0x5F40] = 0xFFFFA0DB ^ 0x5F40;
        MenuLayout.C[0xFB83 ^ 0xFB3A] = 0xFFFF04C4 ^ 0xFB3A;
        MenuLayout.C[0xE129 ^ 0xE001] = 0xE02D ^ 0xE001;
        MenuLayout.C[0xF479 ^ 0xF4A5] = 0xFFFF0B4A ^ 0xF4A5;
        MenuLayout.C[0x6450 ^ 0x6532] = 0xFFFF9AF0 ^ 0x6532;
        MenuLayout.C[0xE7C6 ^ 0xE76E] = 0xE668 ^ 0xE76E;
        MenuLayout.C[0xA8F9 ^ 0xA8BE] = 0xFFFF575C ^ 0xA8BE;
        MenuLayout.C[0x9548 ^ 0x957D] = 0x9538 ^ 0x957D;
        MenuLayout.C[0x10738 ^ 0x106BD] = 0x106BF ^ 0x106BD;
        MenuLayout.C[0x3357 ^ 0x3339] = 0x332D ^ 0x3339;
        MenuLayout.C[0x351C ^ 0x3544] = 0xFFFFCACE ^ 0x3544;
        MenuLayout.C[0xCCB9 ^ 0xCC0B] = 0xCC43 ^ 0xCC0B;
        MenuLayout.C[0x91DD ^ 0x90CE] = 0xFFFF6F7F ^ 0x90CE;
        MenuLayout.C[0xBFF2 ^ 0xBF8E] = 0xFFFF4003 ^ 0xBF8E;
        MenuLayout.C[0x605E ^ 0x608E] = 0x60FE ^ 0x608E;
        MenuLayout.C[0x1011 ^ 0x1016] = 0x1065 ^ 0x1016;
        MenuLayout.C[0x9077 ^ 0x912A] = 0xFFFF6EF0 ^ 0x912A;
        MenuLayout.C[0x10B8F ^ 0x10BFC] = 0x10BBC ^ 0x10BFC;
        MenuLayout.C[0xBB86 ^ 0xBAFD] = 0xBA4B ^ 0xBAFD;
        MenuLayout.C[0x45A ^ 0x536] = 0x50A ^ 0x536;
        MenuLayout.C[0x3405 ^ 0x347A] = 0x3430 ^ 0x347A;
        MenuLayout.C[0xD962 ^ 0xD82E] = 0xFFFF27B6 ^ 0xD82E;
        MenuLayout.C[0xB2A4 ^ 0xB232] = 0xFFFF4D97 ^ 0xB232;
        MenuLayout.C[0xDA21 ^ 0xDB15] = 0xDB2E ^ 0xDB15;
        MenuLayout.C[0xDF48 ^ 0xDEC0] = 0xDEC1 ^ 0xDEC0;
        MenuLayout.C[0xD88A ^ 0xD89E] = 0xFFFF2745 ^ 0xD89E;
        MenuLayout.C[0xB9E8 ^ 0xB900] = 0xB95F ^ 0xB900;
        MenuLayout.C[0x289A ^ 0x284C] = 0x283D ^ 0x284C;
        MenuLayout.C[0x7766 ^ 0x773A] = 0xFFFF88EA ^ 0x773A;
        MenuLayout.C[0x8022 ^ 0x81A6] = 0x81A7 ^ 0x81A6;
        MenuLayout.C[0x3F8E ^ 0x3F9B] = 0xFFFFC011 ^ 0x3F9B;
        MenuLayout.C[0x31FD ^ 0x3162] = 0xFFFFCEB6 ^ 0x3162;
        MenuLayout.C[0x54FF ^ 0x5472] = 0x547F ^ 0x5472;
    }
}

