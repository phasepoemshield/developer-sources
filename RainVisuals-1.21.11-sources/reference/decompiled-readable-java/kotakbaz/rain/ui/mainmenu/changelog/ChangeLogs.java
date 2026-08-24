/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.mainmenu.changelog;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.ui.mainmenu.changelog.ChangeLogItem;
import kotakbaz.rain.ui.mainmenu.changelog.ChangeLogVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062c\u0650;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0636\u0629;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\u0003J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b!\u0010\"J?\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b)\u0010*J?\u0010+\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b+\u0010*J7\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b.\u0010/J7\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b0\u0010/J1\u00105\u001a\u00020 2\u0006\u0010'\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0002\u00a2\u0006\u0004\b5\u00106R$\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000407j\b\u0012\u0004\u0012\u00020\u0004`88\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010<\u00a8\u0006>"}, d2={"Loxxxde/\u0628\u063a;", "", "<init>", "()V", "Loxxxde/\u062d\u0638;", "version", "add", "(Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogVersion;)Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogs;", "", "render", "", "mouseX", "mouseY", "verticalAmount", "", "onScroll", "(DDD)Z", "", "contentHeight", "()F", "contentTop", "viewHeight", "scrollMin", "drawScrollBar", "(FFFF)V", "contains", "(FF)Z", "Loxxxde/\u062f\u0627;", "item", "", "itemIcon", "(Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;)Ljava/lang/String;", "Ljava/awt/Color;", "itemColor", "(Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;)Ljava/awt/Color;", "x", "y", "w", "h", "r", "color", "card", "(FFFFFLjava/awt/Color;)V", "rect", "s", "size", "text", "(Ljava/lang/String;FFFLjava/awt/Color;)V", "iconText", "", "g", "b", "a", "rgba", "(IIII)Ljava/awt/Color;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "logs", "Ljava/util/ArrayList;", "scroll", "F", "Companion", "rain-visuals"})
public final class ChangeLogs {
    @NotNull
    private final ArrayList<ChangeLogVersion> logs = new ArrayList();
    @Deprecated
    public static final float WIDTH = 192.0f;
    @Deprecated
    public static final float Y = 24.0f;
    @Deprecated
    public static final float X = 24.0f;
    @Deprecated
    public static final float GAP = 5.0f;
    private float scroll;
    @Deprecated
    public static final float HEIGHT = 130.0f;
    @NotNull
    private static final \u0636\u0629 Companion = new \u0636\u0629(null);
    @Deprecated
    public static final float CARD_BORDER = 0.33f;

    public final boolean onScroll(double mouseX, double mouseY, double verticalAmount) {
        if (!this.contains((float)mouseX, (float)mouseY)) {
            return false;
        }
        float viewHeight = 92.5f;
        float scrollMin = Math.min(0.0f, viewHeight - this.contentHeight());
        if (scrollMin >= 0.0f) {
            return false;
        }
        this.scroll = RangesKt.coerceIn(this.scroll + (float)verticalAmount * 10.0f, scrollMin, 0.0f);
        return true;
    }

    private final boolean contains(float mouseX, float mouseY) {
        return mouseX >= 24.0f && mouseX <= 216.0f && mouseY >= 24.0f && mouseY <= 154.0f;
    }

    /*
     * WARNING - void declaration
     */
    public final void render() {
        this.card(24.0f, 24.0f, 192.0f, 130.0f, 7.0f, this.rgba(12, 12, 12, 220));
        this.iconText("l", 32.0f, 32.0f, 5.0f, ChangeLogs.rgba$default(this, 154, 154, 154, 0, 8, null));
        this.text("Recent Updates", 41.0f, 31.25f, 6.0f, ChangeLogs.rgba$default(this, 154, 154, 154, 0, 8, null));
        float contentTop = 49.0f;
        float contentHeight = this.contentHeight();
        float viewHeight = 92.5f;
        float scrollMin = Math.min(0.0f, viewHeight - contentHeight);
        this.scroll = RangesKt.coerceIn(this.scroll, scrollMin, 0.0f);
        this.drawScrollBar(contentTop, viewHeight, contentHeight, scrollMin);
        float yPos = 0.0f;
        yPos = contentTop + this.scroll;
        \u062c\u0650.INSTANCE.start(24.0f, contentTop, 192.0f, viewHeight);
        Iterable $this$forEach$iv = this.logs;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            ChangeLogVersion version = (ChangeLogVersion)element$iv;
            boolean bl = false;
            Color color = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color, "WHITE");
            this.rect(31.75f, yPos + 2.75f - 0.25f, 2.5f, 2.5f, 1.25f, color);
            this.text(version.getVersion(), 38.0f, yPos - 0.5f, 6.2f, ChangeLogs.rgba$default(this, 220, 220, 220, 0, 8, null));
            yPos += 14.0f;
            Iterable $this$forEach$iv2 = version.getItems();
            boolean $i$f$forEach2 = false;
            for (Object element$iv2 : $this$forEach$iv2) {
                void var18_18;
                ChangeLogItem item = (ChangeLogItem)element$iv2;
                boolean bl2 = false;
                Color itemColor = this.itemColor(item);
                this.iconText(this.itemIcon(item), 31.25f, yPos - 0.6f, 5.3f, itemColor);
                this.text(item.getText(), 41.0f, yPos - 0.1f, 6.1f, (Color)var18_18);
                yPos += 12.0f;
            }
            this.rect(29.0f, yPos += 7.5f, 172.0f, 0.5f, 0.0f, ChangeLogs.rgba$default(this, 35, 35, 35, 0, 8, null));
            float f = yPos + 10.0f;
        }
        \u062c\u0650.INSTANCE.end();
    }

    private final void card(float x, float y, float w, float h, float r, Color color) {
        this.rect(x, y, w, h, r, this.rgba(255, 255, 255, 20));
        this.rect(x + 0.33f, y + 0.33f, w - 0.66f, h - 0.66f, RangesKt.coerceAtLeast(r - 0.33f, 0.0f), color);
    }

    private final String itemIcon(ChangeLogItem item) {
        String string = item.getType();
        return Intrinsics.areEqual(string, "+") ? "h" : (Intrinsics.areEqual(string, "-") ? "i" : "l");
    }

    private final Color itemColor(ChangeLogItem item) {
        Color color;
        if (Intrinsics.areEqual(item.getType(), "-")) {
            color = ChangeLogs.rgba$default(this, 120, 120, 120, 0, 8, null);
        } else {
            Color color2 = Color.WHITE;
            color = color2;
            Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
        }
        return color;
    }

    public ChangeLogs() {
        ChangeLogItem[] changeLogItemArray = new ChangeLogItem[3];
        changeLogItemArray[0] = new ChangeLogItem("+", "Click GUI style");
        changeLogItemArray[1] = new ChangeLogItem("+", "Old main menu background");
        changeLogItemArray[2] = new ChangeLogItem("-", "Account button removed");
        this.add(new ChangeLogVersion("Latest", changeLogItemArray));
    }

    private final void drawScrollBar(float contentTop, float viewHeight, float contentHeight, float scrollMin) {
        if (contentHeight <= viewHeight) {
            return;
        }
        float barX = 208.5f;
        float barWidth = 1.0f;
        float ratio = viewHeight / contentHeight;
        float handleHeight = Math.max(25.0f, viewHeight * ratio);
        float scrollPercent = scrollMin == 0.0f ? 0.0f : this.scroll / scrollMin;
        float handleOffset = (viewHeight - handleHeight) * scrollPercent;
        this.rect(barX, contentTop, barWidth, viewHeight, 2.0f, ChangeLogs.rgba$default(this, 20, 20, 20, 0, 8, null));
        this.rect(barX, contentTop + handleOffset, barWidth, handleHeight, 3.0f, ChangeLogs.rgba$default(this, 45, 45, 45, 0, 8, null));
    }

    private final void text(String s, float x, float y, float size, Color color) {
        \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT).size(size).color(color).drawText(s, x, y);
    }

    private final void iconText(String s, float x, float y, float size, Color color) {
        \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.GUI_TEXT).size(size).color(color).drawText(s, x, y);
    }

    static /* synthetic */ Color rgba$default(ChangeLogs changeLogs, int n, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 8) != 0) {
            n4 = 255;
        }
        return changeLogs.rgba(n, n2, n3, n4);
    }

    private final void rect(float x, float y, float w, float h, float r, Color color) {
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.GUI_RECT).round(r).color(color).draw(x, y, w, h);
    }

    private final Color rgba(int r, int g, int b2, int a2) {
        return new Color(r, g, b2, a2);
    }

    @NotNull
    public final ChangeLogs add(@NotNull ChangeLogVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        ((Collection)this.logs).add(version);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private final float contentHeight() {
        void var1_1;
        float height = 0.0f;
        Iterable $this$forEach$iv = this.logs;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            ChangeLogVersion version = (ChangeLogVersion)element$iv;
            boolean bl = false;
            height += 14.0f;
            height += (float)version.getItems().size() * 12.0f;
            height += 17.5f;
        }
        return (float)var1_1;
    }
}

