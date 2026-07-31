/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import java.awt.Color;
import kotakbaz.rain.client.util.color.a_0;
import kotakbaz.rain.module.modules.hud.container.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/ui/menu/MenuStyle;", "", "<init>", "()V", "", "alpha", "Ljava/awt/Color;", "panel", "(F)Ljava/awt/Color;", "surface", "title", "value", "icon", "BLUR_MIX", "F", "getPanelBase", "()Ljava/awt/Color;", "panelBase", "getSurfaceBase", "surfaceBase", "getTitleBase", "titleBase", "getValueBase", "valueBase", "getIconBase", "iconBase", "rain-visuals"})
public final class MenuStyle {
    @NotNull
    public static final MenuStyle INSTANCE;
    public static final float BLUR_MIX = 0.95f;
    public static int[] A;

    private MenuStyle() {
        super();
    }

    @NotNull
    public final Color getPanelBase() {
        return e.INSTANCE.getPANEL_COLOR();
    }

    @NotNull
    public final Color getSurfaceBase() {
        return e.INSTANCE.getHEADER_COLOR();
    }

    @NotNull
    public final Color getTitleBase() {
        return e.INSTANCE.getTITLE_COLOR();
    }

    @NotNull
    public final Color getValueBase() {
        return e.INSTANCE.getVALUE_COLOR();
    }

    @NotNull
    public final Color getIconBase() {
        return e.INSTANCE.getICON_COLOR();
    }

    @NotNull
    public final Color panel(float f2) {
        return a_0.INSTANCE.setAlpha(this.getPanelBase(), f2);
    }

    public static /* synthetic */ Color panel$default(MenuStyle menuStyle, float f2, int n, Object object) {
        int n2 = A[0];
        n2 ^= A[1];
        if ((n & (n2 += A[2])) != 0) {
            f2 = (float)menuStyle.getPanelBase().getAlpha() / 255.0f;
        }
        return menuStyle.panel(f2);
    }

    @NotNull
    public final Color surface(float f2) {
        return a_0.INSTANCE.setAlpha(this.getSurfaceBase(), f2);
    }

    public static /* synthetic */ Color surface$default(MenuStyle menuStyle, float f2, int n, Object object) {
        int n2 = A[3];
        n2 -= A[4];
        if ((n & (n2 ^= A[5])) != 0) {
            f2 = ((float)menuStyle.getSurfaceBase().getAlpha() + 5.0f) / 255.0f;
        }
        return menuStyle.surface(f2);
    }

    @NotNull
    public final Color title(float f2) {
        return a_0.INSTANCE.setAlpha(this.getTitleBase(), f2);
    }

    public static /* synthetic */ Color title$default(MenuStyle menuStyle, float f2, int n, Object object) {
        int n2 = A[6];
        n2 ^= A[7];
        if ((n & (n2 ^= A[8])) != 0) {
            f2 = (float)menuStyle.getTitleBase().getAlpha() / 255.0f;
        }
        return menuStyle.title(f2);
    }

    @NotNull
    public final Color value(float f2) {
        return a_0.INSTANCE.setAlpha(this.getValueBase(), f2);
    }

    public static /* synthetic */ Color value$default(MenuStyle menuStyle, float f2, int n, Object object) {
        int n2 = A[9];
        n2 -= A[10];
        if ((n & (n2 -= A[11])) != 0) {
            f2 = (float)menuStyle.getValueBase().getAlpha() / 255.0f;
        }
        return menuStyle.value(f2);
    }

    @NotNull
    public final Color icon(float f2) {
        return a_0.INSTANCE.setAlpha(this.getIconBase(), f2);
    }

    public static /* synthetic */ Color icon$default(MenuStyle menuStyle, float f2, int n, Object object) {
        int n2 = A[12];
        n2 -= A[13];
        if ((n & (n2 -= A[14])) != 0) {
            f2 = (float)menuStyle.getIconBase().getAlpha() / 255.0f;
        }
        return menuStyle.icon(f2);
    }

    static {
        MenuStyle.a();
        INSTANCE = new MenuStyle();
    }

    public static void a() {
        A = new int[0xFAA7 ^ 0xFAA8];
        MenuStyle.A[0x765 ^ 0x762] = 0x75A ^ 0x762;
        MenuStyle.A[0x16F7 ^ 0x16F6] = 0xFFFFE93B ^ 0x16F6;
        MenuStyle.A[0x7B88 ^ 0x7B8C] = 0xFFFF8404 ^ 0x7B8C;
        MenuStyle.A[0xDF0A ^ 0xDF03] = 0xFFFF2077 ^ 0xDF03;
        MenuStyle.A[0xB68D ^ 0xB680] = 0xFFFF496C ^ 0xB680;
        MenuStyle.A[0xB180 ^ 0xB18A] = 0xFFFF4E10 ^ 0xB18A;
        MenuStyle.A[0xBB51 ^ 0xBB5F] = 0xFFFF44C4 ^ 0xBB5F;
        MenuStyle.A[0xC452 ^ 0xC454] = 0xFFFF3BFA ^ 0xC454;
        MenuStyle.A[0x1F9E ^ 0x1F9B] = 0xFFFFE049 ^ 0x1F9B;
        MenuStyle.A[0x3774 ^ 0x377C] = 0xFFFFC8EB ^ 0x377C;
        MenuStyle.A[0xB06B ^ 0xB069] = 0xB052 ^ 0xB069;
        MenuStyle.A[0xF5B5 ^ 0xF5B5] = 0xF5BE ^ 0xF5B5;
        MenuStyle.A[0x1805 ^ 0x1806] = 0xFFFFE75D ^ 0x1806;
        MenuStyle.A[0xB96B ^ 0xB967] = 0xFFFF46EF ^ 0xB967;
        MenuStyle.A[0x2E2 ^ 0x2E9] = 0xFFFFFD30 ^ 0x2E9;
    }
}

