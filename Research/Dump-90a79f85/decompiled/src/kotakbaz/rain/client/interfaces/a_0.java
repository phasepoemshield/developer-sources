/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.interfaces;

import kotlin.Metadata;

/*
 * Renamed from kotakbaz.rain.client.interfaces.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\fJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\tJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\f\u00a8\u0006\u0011\u00c0\u0006\u0003"}, d2={"Lkotakbaz/rain/client/interfaces/IFunctionalWidget;", "", "", "mouseX", "mouseY", "", "partialTicks", "", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "vertical", "onMouseScroll", "onKeyPress", "rain-visuals"})
public interface a_0 {
    default public void render(int n, int n2, float f2) {
    }

    default public void onMouseClick(int n, int n2, int n3) {
    }

    default public void onMouseRelease(int n, int n2, int n3) {
    }

    default public void onMouseScroll(int n, int n2, float f2) {
    }

    default public void onKeyPress(int n, int n2, int n3) {
    }

    public static /* synthetic */ void access$render$jd(a_0 a_02, int n, int n2, float f2) {
        a_02.render(n, n2, f2);
    }

    public static /* synthetic */ void access$onMouseClick$jd(a_0 a_02, int n, int n2, int n3) {
        a_02.onMouseClick(n, n2, n3);
    }

    public static /* synthetic */ void access$onMouseRelease$jd(a_0 a_02, int n, int n2, int n3) {
        a_02.onMouseRelease(n, n2, n3);
    }

    public static /* synthetic */ void access$onMouseScroll$jd(a_0 a_02, int n, int n2, float f2) {
        a_02.onMouseScroll(n, n2, f2);
    }

    public static /* synthetic */ void access$onKeyPress$jd(a_0 a_02, int n, int n2, int n3) {
        a_02.onKeyPress(n, n2, n3);
    }
}

