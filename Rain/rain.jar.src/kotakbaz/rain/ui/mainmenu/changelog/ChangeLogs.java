/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.mainmenu.changelog;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.ScissorUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.mainmenu.changelog.ChangeLogItem;
import kotakbaz.rain.ui.mainmenu.changelog.ChangeLogVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\u0003J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b!\u0010\"J?\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b)\u0010*J?\u0010+\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b+\u0010*J7\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b.\u0010/J7\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b0\u0010/J1\u00105\u001a\u00020 2\u0006\u0010'\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0002\u00a2\u0006\u0004\b5\u00106R$\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000407j\b\u0012\u0004\u0012\u00020\u0004`88\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010<\u00a8\u0006>"}, d2={"Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogs;", "", "<init>", "()V", "Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogVersion;", "version", "add", "(Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogVersion;)Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogs;", "", "render", "", "mouseX", "mouseY", "verticalAmount", "", "onScroll", "(DDD)Z", "", "contentHeight", "()F", "contentTop", "viewHeight", "scrollMin", "drawScrollBar", "(FFFF)V", "contains", "(FF)Z", "Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;", "item", "", "itemIcon", "(Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;)Ljava/lang/String;", "Ljava/awt/Color;", "itemColor", "(Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;)Ljava/awt/Color;", "x", "y", "w", "h", "r", "color", "card", "(FFFFFLjava/awt/Color;)V", "rect", "s", "size", "text", "(Ljava/lang/String;FFFLjava/awt/Color;)V", "iconText", "", "g", "b", "a", "rgba", "(IIII)Ljava/awt/Color;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "logs", "Ljava/util/ArrayList;", "scroll", "F", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nChangeLogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeLogs.kt\nkotakbaz/rain/ui/mainmenu/changelog/ChangeLogs\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1915#2:155\n1915#2,2:156\n1916#2:158\n1915#2,2:159\n*S KotlinDebug\n*F\n+ 1 ChangeLogs.kt\nkotakbaz/rain/ui/mainmenu/changelog/ChangeLogs\n*L\n55#1:155\n60#1:156,2\n55#1:158\n87#1:159,2\n*E\n"})
public final class ChangeLogs {
    @NotNull
    private static final Companion Companion;
    @NotNull
    private final ArrayList<ChangeLogVersion> logs = new ArrayList();
    private float scroll;
    @Deprecated
    public static final float X = 24.0f;
    @Deprecated
    public static final float Y = 24.0f;
    @Deprecated
    public static final float WIDTH = 192.0f;
    @Deprecated
    public static final float HEIGHT = 130.0f;
    @Deprecated
    public static final float GAP = 5.0f;
    @Deprecated
    public static final float CARD_BORDER = 0.33f;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public ChangeLogs() {
        int n2 = C[0];
        n2 ^= C[1];
        n2 += C[2];
        int n3 = C[3];
        n3 -= C[4];
        ChangeLogItem[] changeLogItemArray = new ChangeLogItem[n3 += C[5]];
        int n4 = C[6];
        n4 ^= C[7];
        int n5 = C[9];
        n5 -= C[10];
        int n6 = C[12];
        n6 -= C[13];
        changeLogItemArray[n4 -= ChangeLogs.C[8]] = new ChangeLogItem((String)a[n5 -= C[11]], (String)a[n6 ^= C[14]]);
        int n7 = C[15];
        n7 -= C[16];
        n7 ^= C[17];
        int n8 = C[18];
        n8 ^= C[19];
        int n9 = C[21];
        n9 ^= C[22];
        int n10 = C[24];
        n10 -= C[25];
        changeLogItemArray[n7] = new ChangeLogItem((String)a[n8 += C[20]], (String)a[n9 -= C[23]] + (String)a[n10 -= C[26]]);
        int n11 = C[27];
        n11 -= C[28];
        n11 -= C[29];
        int n12 = C[30];
        n12 -= C[31];
        int n13 = C[33];
        n13 += C[34];
        int n14 = C[36];
        n14 ^= C[37];
        changeLogItemArray[n11] = new ChangeLogItem((String)a[n12 ^= C[32]], (String)a[n13 -= C[35]] + (String)a[n14 -= C[38]]);
        this.add(new ChangeLogVersion((String)a[n2], changeLogItemArray));
    }

    @NotNull
    public final ChangeLogs add(@NotNull ChangeLogVersion version) {
        int n2 = C[39];
        n2 += C[40];
        Intrinsics.checkNotNullParameter(version, (String)a[n2 += C[41]]);
        ((Collection)this.logs).add(version);
        return this;
    }

    public final void render() {
        long l2 = -8607747156546909484L;
        long l3 = -3343470870298515453L;
        int n2 = C[42];
        n2 += C[43];
        n2 -= C[44];
        int n3 = C[45];
        n3 ^= C[46];
        int n4 = C[48];
        n4 += C[49];
        int n5 = C[51];
        n5 -= C[52];
        this.card(24.0f, 24.0f, 192.0f, 130.0f, 7.0f, this.rgba(n2, n3 -= C[47], n4 ^= C[50], n5 ^= C[53]));
        int n6 = C[54];
        n6 -= C[55];
        n6 ^= C[56];
        int n7 = C[57];
        n7 -= C[58];
        n7 += C[59];
        int n8 = C[60];
        n8 -= C[61];
        n8 ^= C[62];
        int n9 = C[63];
        n9 -= C[64];
        int n10 = C[66];
        n10 ^= C[67];
        int n11 = C[69];
        n11 -= C[70];
        this.iconText((String)a[n6], 32.0f, 32.0f, 5.0f, ChangeLogs.rgba$default(this, n7, n8, n9 ^= C[65], n10 -= C[68], n11 += C[71], null));
        int n12 = C[72];
        n12 += C[73];
        n12 += C[74];
        int n13 = C[75];
        n13 ^= C[76];
        n13 ^= C[77];
        int n14 = C[78];
        n14 ^= C[79];
        n14 += C[80];
        int n15 = C[81];
        n15 ^= C[82];
        int n16 = C[84];
        n16 ^= C[85];
        int n17 = C[87];
        n17 += C[88];
        this.text((String)a[n12], 41.0f, 31.25f, 6.0f, ChangeLogs.rgba$default(this, n13, n14, n15 ^= C[83], n16 += C[86], n17 += C[89], null));
        float f2 = 49.0f;
        float f3 = this.contentHeight();
        float f4 = 92.5f;
        float f5 = Math.min(0.0f, f4 - f3);
        this.scroll = RangesKt.coerceIn(this.scroll, f5, 0.0f);
        this.drawScrollBar(f2, f4, f3, f5);
        float f6 = 0.0f;
        f6 = f2 + this.scroll;
        ScissorUtil.INSTANCE.start(24.0f, f2, 192.0f, f4);
        Iterable iterable = this.logs;
        long l4 = l2;
        int n18 = C[90];
        n18 -= C[91];
        l2 = l4 ^ (0L ^ l4) & -1L << (n18 ^= C[92]);
        for (Object t2 : iterable) {
            ChangeLogVersion changeLogVersion = (ChangeLogVersion)t2;
            long l5 = l2;
            int n19 = C[93];
            n19 += C[94];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n19 -= C[95]);
            Color color = Color.WHITE;
            int n20 = C[96];
            n20 -= C[97];
            Intrinsics.checkNotNullExpressionValue(color, (String)a[n20 ^= C[98]]);
            this.rect(31.75f, f6 + 2.75f - 0.25f, 2.5f, 2.5f, 1.25f, color);
            int n21 = C[99];
            n21 += C[100];
            n21 += C[101];
            int n22 = C[102];
            n22 ^= C[103];
            n22 ^= C[104];
            int n23 = C[105];
            n23 += C[106];
            int n24 = C[108];
            n24 += C[109];
            int n25 = C[111];
            n25 += C[112];
            this.text(changeLogVersion.getVersion(), 38.0f, f6 - 0.5f, 6.2f, ChangeLogs.rgba$default(this, n21, n22, n23 -= C[107], n24 += C[110], n25 += C[113], null));
            f6 += 14.0f;
            Iterable iterable2 = changeLogVersion.getItems();
            long l6 = l3;
            int n26 = C[114];
            n26 -= C[115];
            l3 = l6 ^ (0L ^ l6) & -1L << (n26 -= C[116]);
            for (Object t3 : iterable2) {
                ChangeLogItem changeLogItem = (ChangeLogItem)t3;
                long l7 = l3;
                int n27 = C[117];
                n27 ^= C[118];
                l3 = l7 ^ (0L ^ l7) & -1L >>> (n27 ^= C[119]);
                Color color2 = this.itemColor(changeLogItem);
                this.iconText(this.itemIcon(changeLogItem), 31.25f, f6 - 0.6f, 5.3f, color2);
                this.text(changeLogItem.getText(), 41.0f, f6 - 0.1f, 6.1f, color2);
                f6 += 12.0f;
            }
            f6 += 7.5f;
            int n28 = C[120];
            n28 -= C[121];
            n28 -= C[122];
            int n29 = C[123];
            n29 += C[124];
            n29 ^= C[125];
            int n30 = C[126];
            n30 ^= C[127];
            int n31 = C[129];
            n31 -= C[130];
            int n32 = C[132];
            n32 -= C[133];
            this.rect(29.0f, f6, 172.0f, 0.5f, 0.0f, ChangeLogs.rgba$default(this, n28, n29, n30 ^= C[128], n31 -= C[131], n32 += C[134], null));
            f6 += 10.0f;
        }
        ScissorUtil.INSTANCE.end();
    }

    public final boolean onScroll(double mouseX, double mouseY, double verticalAmount) {
        if (!this.contains((float)mouseX, (float)mouseY)) {
            boolean bl = C[135];
            bl += C[136];
            return bl += C[137];
        }
        float f2 = 92.5f;
        float f3 = Math.min(0.0f, f2 - this.contentHeight());
        if (f3 >= 0.0f) {
            boolean bl = C[138];
            bl -= C[139];
            return bl += C[140];
        }
        this.scroll = RangesKt.coerceIn(this.scroll + (float)verticalAmount * 10.0f, f3, 0.0f);
        boolean bl = C[141];
        bl -= C[142];
        return bl -= C[143];
    }

    private final float contentHeight() {
        long l2 = 4045092247515669485L;
        float f2 = 0.0f;
        Iterable iterable = this.logs;
        long l3 = l2;
        int n2 = C[144];
        n2 += C[145];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += C[146]);
        for (Object t2 : iterable) {
            ChangeLogVersion changeLogVersion = (ChangeLogVersion)t2;
            long l4 = l2;
            int n3 = C[147];
            n3 ^= C[148];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 -= C[149]);
            f2 += 14.0f;
            f2 += (float)changeLogVersion.getItems().size() * 12.0f;
            f2 += 17.5f;
        }
        return f2;
    }

    private final void drawScrollBar(float contentTop, float viewHeight, float contentHeight, float scrollMin) {
        int n2;
        if (contentHeight <= viewHeight) {
            return;
        }
        float f2 = 208.5f;
        float f3 = 1.0f;
        float f4 = viewHeight / contentHeight;
        float f5 = Math.max(25.0f, viewHeight * f4);
        if (scrollMin == 0.0f) {
            int n3 = C[150];
            n3 -= C[151];
            n2 = n3 ^= C[152];
        } else {
            int n4 = C[153];
            n4 += C[154];
            n2 = n4 += C[155];
        }
        float f6 = n2 != 0 ? 0.0f : this.scroll / scrollMin;
        float f7 = (viewHeight - f5) * f6;
        int n5 = C[156];
        n5 ^= C[157];
        n5 += C[158];
        int n6 = C[159];
        n6 ^= C[160];
        n6 ^= C[161];
        int n7 = C[162];
        n7 -= C[163];
        int n8 = C[165];
        n8 += C[166];
        int n9 = C[168];
        n9 -= C[169];
        this.rect(f2, contentTop, f3, viewHeight, 2.0f, ChangeLogs.rgba$default(this, n5, n6, n7 ^= C[164], n8 ^= C[167], n9 -= C[170], null));
        int n10 = C[171];
        n10 += C[172];
        n10 += C[173];
        int n11 = C[174];
        n11 ^= C[175];
        n11 -= C[176];
        int n12 = C[177];
        n12 += C[178];
        int n13 = C[180];
        n13 += C[181];
        int n14 = C[183];
        n14 ^= C[184];
        this.rect(f2, contentTop + f7, f3, f5, 3.0f, ChangeLogs.rgba$default(this, n10, n11, n12 -= C[179], n13 ^= C[182], n14 += C[185], null));
    }

    private final boolean contains(float mouseX, float mouseY) {
        int n2;
        if (mouseX >= 24.0f && mouseX <= 216.0f && mouseY >= 24.0f && mouseY <= 154.0f) {
            int n3 = C[186];
            n3 += C[187];
            n2 = n3 -= C[188];
        } else {
            int n4 = C[189];
            n4 ^= C[190];
            n2 = n4 ^= C[191];
        }
        return n2 != 0;
    }

    private final String itemIcon(ChangeLogItem item) {
        String string;
        String string2 = item.getType();
        int n2 = C[192];
        n2 += C[193];
        if (Intrinsics.areEqual(string2, (String)a[n2 += C[194]])) {
            int n3 = C[195];
            n3 ^= C[196];
            string = (String)a[n3 += C[197]];
        } else {
            int n4 = C[198];
            n4 += C[199];
            if (Intrinsics.areEqual(string2, (String)a[n4 -= C[200]])) {
                int n5 = C[201];
                n5 += C[202];
                string = (String)a[n5 ^= C[203]];
            } else {
                int n6 = C[204];
                n6 ^= C[205];
                string = (String)a[n6 ^= C[206]];
            }
        }
        return string;
    }

    private final Color itemColor(ChangeLogItem item) {
        Color color;
        int n2 = C[207];
        n2 -= C[208];
        if (Intrinsics.areEqual(item.getType(), (String)a[n2 ^= C[209]])) {
            int n3 = C[210];
            n3 += C[211];
            n3 -= C[212];
            int n4 = C[213];
            n4 -= C[214];
            n4 -= C[215];
            int n5 = C[216];
            n5 -= C[217];
            int n6 = C[219];
            n6 += C[220];
            int n7 = C[222];
            n7 += C[223];
            color = ChangeLogs.rgba$default(this, n3, n4, n5 ^= C[218], n6 ^= C[221], n7 -= C[224], null);
        } else {
            Color color2 = Color.WHITE;
            color = color2;
            int n8 = C[225];
            n8 -= C[226];
            Intrinsics.checkNotNullExpressionValue(color2, (String)a[n8 -= C[227]]);
        }
        return color;
    }

    private final void card(float x2, float y, float w, float h2, float r, Color color) {
        int n2 = C[228];
        n2 -= C[229];
        n2 -= C[230];
        int n3 = C[231];
        n3 += C[232];
        int n4 = C[234];
        n4 ^= C[235];
        int n5 = C[237];
        n5 ^= C[238];
        this.rect(x2, y, w, h2, r, this.rgba(n2, n3 += C[233], n4 -= C[236], n5 += C[239]));
        this.rect(x2 + 0.33f, y + 0.33f, w - 0.66f, h2 - 0.66f, RangesKt.coerceAtLeast(r - 0.33f, 0.0f), color);
    }

    private final void rect(float x2, float y, float w, float h2, float r, Color color) {
        RenderUtils.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.GUI_RECT).round(r).color(color).draw(x2, y, w, h2);
    }

    private final void text(String s2, float x2, float y, float size, Color color) {
        Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT).size(size).color(color).drawText(s2, x2, y);
    }

    private final void iconText(String s2, float x2, float y, float size, Color color) {
        Font.INSTANCE.getICON().priority(ClientRenderPipeline.GUI_TEXT).size(size).color(color).drawText(s2, x2, y);
    }

    private final Color rgba(int r, int g2, int b2, int a2) {
        return new Color(r, g2, b2, a2);
    }

    static /* synthetic */ Color rgba$default(ChangeLogs changeLogs, int n2, int n3, int n4, int n5, int n6, Object object) {
        int n7 = C[240];
        n7 ^= C[241];
        if ((n6 & (n7 += C[242])) != 0) {
            int n8 = C[243];
            n8 ^= C[244];
            n5 = n8 -= C[245];
        }
        return changeLogs.rgba(n2, n3, n4, n5);
    }

    static {
        ChangeLogs.b();
        long l2 = 2525206032901700613L;
        long l3 = -8272143172913275593L;
        long l4 = -985654084062174880L;
        long l5 = -1486906203333792665L;
        long l6 = 3227305672000091657L;
        long l7 = 8834091385224046741L;
        long l8 = -5809398900406851030L;
        long l9 = 808851053451244851L;
        long l10 = 2747798229277238838L;
        long l11 = 1331758135571277882L;
        long l12 = 7264867422729731646L;
        long l13 = 1662282799127535525L;
        long l14 = 6575015588591683203L;
        long l15 = 4362263924038400546L;
        int n2 = C[246];
        n2 ^= C[247];
        a = new Object[n2 += C[248]];
        long l16 = l15;
        int n3 = C[249];
        n3 -= C[250];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[251]);
        Object[] objectArray = new Object[C[252]];
        objectArray[ChangeLogs.C[253]] = A;
        objectArray[ChangeLogs.C[254]] = C[255];
        int n4 = C[256];
        Object object = ChangeLogs.A()[C[257]];
        if (object == null) {
            char[] cArray = "\u7673\u765d\u766a\u7682\u7652\u7662\u765a\u7585\u767e\u7667\u766b\u767b\u7678\u764b\u7663\u765f\u765a\u759c\u759c\u764b\u7588\u7589\u7587\u7654\u7587\u7675\u7658\u7645\u7593\u7674\u7653\u759d\u759d\u7645\u7677\u759c\u767d\u767d\u7682\u7645\u7652\u7674\u7648\u7589\u7586\u7588\u7584\u7585\u7658\u766a\u767a\u765b\u7657\u7656\u765c\u7588\u766a\u767d\u7653\u7655\u7664\u7674\u767b\u7681\u7678\u7652\u7656\u758b\u7682\u764a\u765e\u765f\u75a1\u765b\u7664\u765b\u7660\u767f\u7593\u7588\u7656\u7662\u7674\u766a\u759c\u766a\u767c\u7678\u75a1\u7669\u7659\u7645\u765c\u7593\u764a\u766a\u7653\u767a\u7653\u7647\u7654\u7645\u7655\u7584\u765d\u7677\u7675\u7678\u7678\u75a1\u7676\u7585\u7672\u7679\u7656\u7660\u7653\u7674\u7661\u7585\u765b\u7673\u7661\u7673\u7661\u766b\u7683\u7587\u758a\u7669\u7674\u765c\u7678\u7663\u7653\u75a1\u7664\u7588\u765e\u7657\u765c\u7666\u7672\u765e\u7644\u7669\u7593\u7664\u7672\u765b\u7665\u7657\u759d\u7647\u7676\u7585\u7588\u758b\u7593\u7652\u7675\u7668\u7648\u7659\u758a\u7593\u7660\u7656\u767e\u7644\u765d\u7672\u767e\u7658\u7664\u7652\u7661\u767c\u7674\u767e\u7587\u767f\u765e\u7587\u766b\u765d\u765b\u7673\u7679\u7661\u7589\u7663\u7653\u7668\u7674\u7645\u7680\u765f\u7677\u7659\u766a\u7666\u766b\u7584\u7664\u7652\u764a\u767f\u7587\u764a\u765d\u7655\u7681\u766b\u7680\u7584\u767f\u7662\u7648\u75a1\u7593\u7649\u7667\u7682\u765e\u7667\u7644\u7668\u7665\u7656\u7674\u7646\u7587\u767a\u767f\u758f".toCharArray();
            for (int i2 = C[258]; i2 < C[259]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[260];
                n5 += C[261];
                n5 -= C[262];
                n5 ^= C[263];
                n5 ^= C[264];
                n5 += C[265];
                n5 -= C[266];
                n5 ^= C[267];
                n5 ^= C[268];
                n5 ^= C[269];
                n5 += C[270];
                n5 -= C[271];
                cArray[i2] = (char)(n5 -= C[272]);
            }
            object = ChangeLogs.A()[ChangeLogs.C[273]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ChangeLogs.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[274];
        n6 ^= C[275];
        l6 = l17 ^ (0x9400000000L ^ l17) & -1L << (n6 -= C[276]);
        long l18 = l13;
        int n7 = C[277];
        n7 -= C[278];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[279]);
        while (true) {
            int n8 = C[280];
            n8 += C[281];
            if ((int)l13 >= (int)(l6 >>> (n8 -= C[282]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[283];
            n10 += C[284];
            int n11 = C[286];
            n11 += C[287];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[285])) & -1L >>> (n11 ^= C[288]);
            long l20 = l9;
            int n12 = C[289];
            n12 -= C[290];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[291]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[292];
            n14 += C[293];
            int n15 = C[295];
            n15 ^= C[296];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= C[294])) & -1L >>> (n15 ^= C[297]);
            int n16 = C[298];
            n16 -= C[299];
            long l22 = l10;
            int n17 = C[301];
            n17 ^= C[302];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += C[300]) ^ l22) & -1L << (n17 += C[303]);
            int n18 = C[304];
            n18 ^= C[305];
            n18 += C[306];
            int n19 = C[307];
            n19 += C[308];
            long l23 = l12;
            int n20 = C[310];
            n20 ^= C[311];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[309]))) ^ l23) & -1L >>> (n20 ^= C[312]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[313];
            n21 -= C[314];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[315]);
            while (true) {
                int n22 = C[316];
                n22 ^= C[317];
                if ((int)(l14 >>> (n22 += C[318])) >= (int)l12) break;
                int n23 = C[319];
                n23 ^= C[320];
                int n24 = C[322];
                n24 ^= C[323];
                cArray2[(int)(l14 >>> (n23 += ChangeLogs.C[321]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[324]))];
                l14 += 0x100000000L;
            }
            int n25 = C[325];
            n25 += C[326];
            int n26 = (int)(l15 >>> (n25 ^= C[327]));
            l15 += 0x100000000L;
            ChangeLogs.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[328];
            n27 += C[329];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[330]);
        }
        Companion = new Companion(null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[331]];
        String string = (String)object[C[332]];
        object = object[C[333]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[334]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[335]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[337] ^ C[338]];
                byArray[ChangeLogs.C[339] ^ ChangeLogs.C[340]] = C[341] ^ C[342];
                byArray[ChangeLogs.C[343] ^ ChangeLogs.C[344]] = C[345] ^ C[346];
                byArray[ChangeLogs.C[347] ^ ChangeLogs.C[348]] = C[349] ^ C[350];
                byArray[ChangeLogs.C[351] ^ ChangeLogs.C[352]] = C[353] ^ C[354];
                byArray[ChangeLogs.C[355] ^ ChangeLogs.C[356]] = C[357] ^ C[358];
                byArray[ChangeLogs.C[359] ^ ChangeLogs.C[360]] = C[361] ^ C[362];
                byArray[ChangeLogs.C[363] ^ ChangeLogs.C[364]] = C[365] ^ C[366];
                byArray[ChangeLogs.C[367] ^ ChangeLogs.C[368]] = C[369] ^ C[370];
                byArray[ChangeLogs.C[371] ^ ChangeLogs.C[372]] = C[373] ^ C[374];
                byArray[ChangeLogs.C[375] ^ ChangeLogs.C[376]] = C[377] ^ C[378];
                byArray[ChangeLogs.C[379] ^ ChangeLogs.C[380]] = C[381] ^ C[382];
                byArray[ChangeLogs.C[383] ^ ChangeLogs.C[384]] = C[385] ^ C[386];
                byArray[ChangeLogs.C[387] ^ ChangeLogs.C[388]] = C[389] ^ C[390];
                byArray[ChangeLogs.C[391] ^ ChangeLogs.C[392]] = C[393] ^ C[394];
                byArray[ChangeLogs.C[395] ^ ChangeLogs.C[396]] = C[397] ^ C[398];
                byArray[ChangeLogs.C[399] ^ 0x21F4] = 0x21C2 ^ 0x21F4;
                objectArray2[ChangeLogs.C[336]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (b == null) {
                byte[] byArray2 = new byte[0x1073D ^ 0x1071D];
                byArray2[0x784E ^ 0x7859] = 0x786A ^ 0x7859;
                byArray2[0xD559 ^ 0xD554] = 0xD56D ^ 0xD554;
                byArray2[0xD677 ^ 0xD67D] = 0xFFFF29AA ^ 0xD67D;
                byArray2[0x10A59 ^ 0x10A50] = 0xFFFEF58A ^ 0x10A50;
                byArray2[0xF2C2 ^ 0xF2CA] = 0xF2C8 ^ 0xF2CA;
                byArray2[0xAE6 ^ 0xAEA] = 0xFFFFF52F ^ 0xAEA;
                byArray2[0x6A6F ^ 0x6A6A] = 0xFFFF958F ^ 0x6A6A;
                byArray2[0x999B ^ 0x9988] = 0x99B2 ^ 0x9988;
                byArray2[0xA529 ^ 0xA526] = 0xA529 ^ 0xA526;
                byArray2[0x4B5C ^ 0x4B52] = 0xFFFFB4C2 ^ 0x4B52;
                byArray2[0xFB52 ^ 0xFB40] = 0xFFFF04E8 ^ 0xFB40;
                byArray2[0xC645 ^ 0xC650] = 0xFFFF39B2 ^ 0xC650;
                byArray2[0x10E0E ^ 0x10E0E] = 0xFFFEF1A8 ^ 0x10E0E;
                byArray2[0xC6C ^ 0xC6F] = 0xFFFFF3BD ^ 0xC6F;
                byArray2[0x10938 ^ 0x1093A] = 0xFFFEF6C5 ^ 0x1093A;
                byArray2[0x9466 ^ 0x9470] = 0xFFFF6BBA ^ 0x9470;
                byArray2[0xEC5F ^ 0xEC54] = 0xFFFF13DC ^ 0xEC54;
                byArray2[0xF65B ^ 0xF647] = 0xFFFF098C ^ 0xF647;
                byArray2[0x89D1 ^ 0x89CE] = 0xFFFF7673 ^ 0x89CE;
                byArray2[0x2E92 ^ 0x2E8F] = 0xFFFFD17E ^ 0x2E8F;
                byArray2[0xFF2B ^ 0xFF3F] = 0xFFFF00B6 ^ 0xFF3F;
                byArray2[0x9FC4 ^ 0x9FD4] = 0xFFFF6052 ^ 0x9FD4;
                byArray2[0x8E31 ^ 0x8E2F] = 0x8E32 ^ 0x8E2F;
                byArray2[0x2070 ^ 0x206A] = 0x2038 ^ 0x206A;
                byArray2[0x936A ^ 0x9373] = 0xFFFF6CCB ^ 0x9373;
                byArray2[0xCE0D ^ 0xCE0B] = 0xCE1A ^ 0xCE0B;
                byArray2[0x6534 ^ 0x6525] = 0x6504 ^ 0x6525;
                byArray2[0x5FB3 ^ 0x5FB4] = 0xFFFFA06F ^ 0x5FB4;
                byArray2[0xA03 ^ 0xA02] = 0xA25 ^ 0xA02;
                byArray2[0x9B09 ^ 0x9B11] = 0x9B4D ^ 0x9B11;
                byArray2[0x1B10 ^ 0x1B14] = 0x1B1B ^ 0x1B14;
                byArray2[0x1442 ^ 0x1459] = 0x1444 ^ 0x1459;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ChangeLogs.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uf745\uf73f\uf746\uf741\uf74b\uf72f\u049a\u04ac\u0471\u049d\uf73d\u04a8\u0484\u049e\u048e\uf73d\u04a4\uf754".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 6659;
                        n3 ^= 0x6434;
                        n3 ^= 0x72B7;
                        n3 += 34040;
                        n3 ^= 0x6FFB;
                        n3 += 14940;
                        n3 += 11148;
                        n3 ^= 0xF66C;
                        n3 ^= 0x365C;
                        n3 -= 7517;
                        n3 ^= 0xC96D;
                        cArray[i2] = (char)(n3 -= 41614);
                    }
                    object4 = ChangeLogs.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[14] = 22;
                byArray4[8] = 97;
                byArray4[7] = 99;
                byArray4[4] = 94;
                byArray4[0] = 91;
                byArray4[6] = 15;
                byArray4[5] = -105;
                byArray4[1] = 16;
                byArray4[12] = -3;
                byArray4[15] = -24;
                byArray4[2] = 117;
                byArray4[9] = -72;
                byArray4[3] = -108;
                byArray4[11] = -112;
                byArray4[10] = -50;
                byArray4[13] = -68;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 24, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ChangeLogs.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uc55e\uc56a\uc56c".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 40611;
                        n4 += 30278;
                        n4 += 37127;
                        n4 += 490;
                        n4 += 59532;
                        n4 -= 46477;
                        n4 += 34003;
                        n4 ^= 0xBCB3;
                        n4 ^= 0xDB4;
                        n4 += 57560;
                        n4 += 27739;
                        n4 -= 38302;
                        cArray[i3] = (char)(n4 += 46239);
                    }
                    object5 = ChangeLogs.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ChangeLogs.A()[3];
            if (object6 == null) {
                char[] cArray = "\u8275\u8279\u82c7\u82a3\u8277\u827a\u8277\u82a3\u82c8\u827f\u8277\u82c7\u82a9\u82c8\u8295\u829c\u829c\u829d\u8266\u829b".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 46704;
                    n5 -= 18033;
                    n5 ^= 0xA0A1;
                    n5 += 43699;
                    n5 ^= 0xC804;
                    n5 ^= 0x77E5;
                    n5 += 2821;
                    n5 += 18614;
                    n5 += 26652;
                    n5 -= 43949;
                    cArray[i4] = (char)(n5 += 32782);
                }
                object6 = ChangeLogs.A()[3] = new String(cArray);
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
        C = new int[0xD2CE ^ 0xD35E];
        ChangeLogs.C[0x324A ^ 0x3227] = 0x3276 ^ 0x3227;
        ChangeLogs.C[0xEC62 ^ 0xEC86] = 0xEDD8 ^ 0xEC86;
        ChangeLogs.C[0x4A08 ^ 0x4B43] = 0x4B42 ^ 0x4B43;
        ChangeLogs.C[0x55C2 ^ 0x55B0] = 0x553A ^ 0x55B0;
        ChangeLogs.C[0x592B ^ 0x597C] = 0x59D8 ^ 0x597C;
        ChangeLogs.C[0xF79B ^ 0xF6C0] = 0x786C ^ 0xF6C0;
        ChangeLogs.C[0x2357 ^ 0x2398] = 0xFFFFDC16 ^ 0x2398;
        ChangeLogs.C[0xE89A ^ 0xE8E3] = 0xE8E7 ^ 0xE8E3;
        ChangeLogs.C[0x64F4 ^ 0x6585] = 0x214D ^ 0x6585;
        ChangeLogs.C[0xF871 ^ 0xF883] = 0xF89D ^ 0xF883;
        ChangeLogs.C[0xE513 ^ 0xE404] = 0xE469 ^ 0xE404;
        ChangeLogs.C[0xF4A4 ^ 0xF52C] = 0x706 ^ 0xF52C;
        ChangeLogs.C[0x10B3 ^ 0x11D1] = 0x1CC2 ^ 0x11D1;
        ChangeLogs.C[0x459A ^ 0x44A2] = 0xFFFFBB44 ^ 0x44A2;
        ChangeLogs.C[0x7E8A ^ 0x7E71] = 0xFFFF81C6 ^ 0x7E71;
        ChangeLogs.C[0x1D3C ^ 0x1DB5] = 0xFFFFE246 ^ 0x1DB5;
        ChangeLogs.C[0x569 ^ 0x591] = 0xFFFFFA40 ^ 0x591;
        ChangeLogs.C[0xF8D9 ^ 0xF873] = 0xFFFF0792 ^ 0xF873;
        ChangeLogs.C[0x8B65 ^ 0x8B14] = 0x8B7C ^ 0x8B14;
        ChangeLogs.C[0x82BA ^ 0x8208] = 0x8211 ^ 0x8208;
        ChangeLogs.C[0x8020 ^ 0x8129] = 0x855D ^ 0x8129;
        ChangeLogs.C[0x41F5 ^ 0x4183] = 0xFFFFBE7E ^ 0x4183;
        ChangeLogs.C[0xAD51 ^ 0xADE9] = 0xFFFF5236 ^ 0xADE9;
        ChangeLogs.C[0xEDA1 ^ 0xED9E] = 0xED74 ^ 0xED9E;
        ChangeLogs.C[0xB2 ^ 0x91] = 0xE4 ^ 0x91;
        ChangeLogs.C[0xC982 ^ 0xC959] = 0xFFFF3688 ^ 0xC959;
        ChangeLogs.C[0xD79E ^ 0xD6B4] = 0xD69B ^ 0xD6B4;
        ChangeLogs.C[0x3786 ^ 0x379D] = 0xFFFFC817 ^ 0x379D;
        ChangeLogs.C[0xB7CC ^ 0xB770] = 0xB706 ^ 0xB770;
        ChangeLogs.C[0xDD05 ^ 0xDD98] = 0xDDB8 ^ 0xDD98;
        ChangeLogs.C[0x7A93 ^ 0x7B85] = 0xFFFF8476 ^ 0x7B85;
        ChangeLogs.C[0xE46C ^ 0xE534] = 0xE2D6 ^ 0xE534;
        ChangeLogs.C[0xAD93 ^ 0xAD7E] = 0xAD31 ^ 0xAD7E;
        ChangeLogs.C[0x4BAB ^ 0x4B91] = 0xFFFFB425 ^ 0x4B91;
        ChangeLogs.C[0x2F75 ^ 0x2E7F] = 0x6FEB ^ 0x2E7F;
        ChangeLogs.C[0x8693 ^ 0x8619] = 0x8656 ^ 0x8619;
        ChangeLogs.C[0x67FC ^ 0x67EB] = 0x67A7 ^ 0x67EB;
        ChangeLogs.C[0xD620 ^ 0xD717] = 0xD776 ^ 0xD717;
        ChangeLogs.C[0x523C ^ 0x5324] = 0x532A ^ 0x5324;
        ChangeLogs.C[0x122D ^ 0x1232] = 0xFFFFED90 ^ 0x1232;
        ChangeLogs.C[0x986B ^ 0x9850] = 0xFFFF67F1 ^ 0x9850;
        ChangeLogs.C[0x10623 ^ 0x107A2] = 0x1698A ^ 0x107A2;
        ChangeLogs.C[0x10038 ^ 0x10052] = 0x10048 ^ 0x10052;
        ChangeLogs.C[0x6F08 ^ 0x6FDA] = 0x6ECE ^ 0x6FDA;
        ChangeLogs.C[0x6607 ^ 0x6626] = 0x669C ^ 0x6626;
        ChangeLogs.C[0x50D0 ^ 0x500C] = 0x502C ^ 0x500C;
        ChangeLogs.C[0xE2CA ^ 0xE3CE] = 0x1AAC ^ 0xE3CE;
        ChangeLogs.C[0x6826 ^ 0x6853] = 0x6812 ^ 0x6853;
        ChangeLogs.C[0xFA3 ^ 0xF44] = 0xF2C ^ 0xF44;
        ChangeLogs.C[0x44CA ^ 0x4487] = 0x44AE ^ 0x4487;
        ChangeLogs.C[0x716B ^ 0x71AA] = 0x71FC ^ 0x71AA;
        ChangeLogs.C[0xFB9D ^ 0xFB3A] = 0xFFFF048F ^ 0xFB3A;
        ChangeLogs.C[0x77E7 ^ 0x77A9] = 0x7764 ^ 0x77A9;
        ChangeLogs.C[0xB05 ^ 0xBB2] = 0xB90 ^ 0xBB2;
        ChangeLogs.C[0x2278 ^ 0x22D0] = 0x22E4 ^ 0x22D0;
        ChangeLogs.C[0x6C7 ^ 0x602] = 0x661 ^ 0x602;
        ChangeLogs.C[0x6338 ^ 0x623D] = 0x719E ^ 0x623D;
        ChangeLogs.C[0xCA7E ^ 0xCB63] = 0xCB09 ^ 0xCB63;
        ChangeLogs.C[0x10CFA ^ 0x10C38] = 0xFFFEF39F ^ 0x10C38;
        ChangeLogs.C[0xB8BA ^ 0xB9E3] = 0xFFFF4199 ^ 0xB9E3;
        ChangeLogs.C[0x332A ^ 0x33E1] = 0x33EF ^ 0x33E1;
        ChangeLogs.C[0x7849 ^ 0x795D] = 0xFFFF86FC ^ 0x795D;
        ChangeLogs.C[0x5DD6 ^ 0x5CE9] = 0x5C86 ^ 0x5CE9;
        ChangeLogs.C[0xBB1A ^ 0xBA94] = 0x968 ^ 0xBA94;
        ChangeLogs.C[0xA893 ^ 0xA81D] = 0xA81F ^ 0xA81D;
        ChangeLogs.C[0x9015 ^ 0x90CD] = 0xFFFF6F87 ^ 0x90CD;
        ChangeLogs.C[0xE2DE ^ 0xE2FC] = 0xFFFF1D41 ^ 0xE2FC;
        ChangeLogs.C[0x2433 ^ 0x2425] = 0xFFFFDBB3 ^ 0x2425;
        ChangeLogs.C[0x6C01 ^ 0x6CAE] = 0x6C9C ^ 0x6CAE;
        ChangeLogs.C[0xD175 ^ 0xD01A] = 0x94F9 ^ 0xD01A;
        ChangeLogs.C[0xC6F4 ^ 0xC63A] = 0xC605 ^ 0xC63A;
        ChangeLogs.C[0x8EEC ^ 0x8E56] = 0x8E55 ^ 0x8E56;
        ChangeLogs.C[0x89D3 ^ 0x89F7] = 0xFFFF7625 ^ 0x89F7;
        ChangeLogs.C[0x202D ^ 0x213C] = 0x213C ^ 0x213C;
        ChangeLogs.C[0x693B ^ 0x6962] = 0xFFFF96D4 ^ 0x6962;
        ChangeLogs.C[0x8260 ^ 0x836D] = 0xE910 ^ 0x836D;
        ChangeLogs.C[0x88F9 ^ 0x89BA] = 0xFFFF7605 ^ 0x89BA;
        ChangeLogs.C[0x7988 ^ 0x78F7] = 0x16D6 ^ 0x78F7;
        ChangeLogs.C[0x8FFE ^ 0x8EB9] = 0xFFFF713F ^ 0x8EB9;
        ChangeLogs.C[0x9A2F ^ 0x9AAB] = 0x9AD6 ^ 0x9AAB;
        ChangeLogs.C[0x5941 ^ 0x592E] = 0xFFFFA612 ^ 0x592E;
        ChangeLogs.C[0x9B27 ^ 0x9B5B] = 0x9B69 ^ 0x9B5B;
        ChangeLogs.C[0x472F ^ 0x474A] = 0x473F ^ 0x474A;
        ChangeLogs.C[0x92C5 ^ 0x93B3] = 0x1F84 ^ 0x93B3;
        ChangeLogs.C[0xAE7B ^ 0xAF4E] = 0xAF55 ^ 0xAF4E;
        ChangeLogs.C[0xE58 ^ 0xE04] = 0xE5F ^ 0xE04;
        ChangeLogs.C[0xB471 ^ 0xB525] = 0xFC9E ^ 0xB525;
        ChangeLogs.C[0xE395 ^ 0xE385] = 0xE383 ^ 0xE385;
        ChangeLogs.C[0x193B ^ 0x182B] = 0x8514 ^ 0x182B;
        ChangeLogs.C[0xB695 ^ 0xB7F6] = 0x9F9D ^ 0xB7F6;
        ChangeLogs.C[0x78E2 ^ 0x7892] = 0x78F6 ^ 0x7892;
        ChangeLogs.C[0xBF24 ^ 0xBFAB] = 0xFFFF4069 ^ 0xBFAB;
        ChangeLogs.C[0x7CF1 ^ 0x7D97] = 0x55FA ^ 0x7D97;
        ChangeLogs.C[0x28C0 ^ 0x2800] = 0x2816 ^ 0x2800;
        ChangeLogs.C[0xAE80 ^ 0xAE84] = 0xFFFF5139 ^ 0xAE84;
        ChangeLogs.C[0x2F57 ^ 0x2E32] = 0x661 ^ 0x2E32;
        ChangeLogs.C[0xFB67 ^ 0xFBFB] = 0xFBE7 ^ 0xFBFB;
        ChangeLogs.C[0x4B14 ^ 0x4B12] = 0x4B7B ^ 0x4B12;
        ChangeLogs.C[0xEDE4 ^ 0xED3A] = 0xED16 ^ 0xED3A;
        ChangeLogs.C[0x3342 ^ 0x33C4] = 0xFFFFCC70 ^ 0x33C4;
        ChangeLogs.C[0xE546 ^ 0xE4CD] = 0x573A ^ 0xE4CD;
        ChangeLogs.C[0x78B9 ^ 0x7982] = 0xFFFF8630 ^ 0x7982;
        ChangeLogs.C[0x4B1B ^ 0x4B3B] = 0x4B15 ^ 0x4B3B;
        ChangeLogs.C[0xD50B ^ 0xD54E] = 0xD51C ^ 0xD54E;
        ChangeLogs.C[0x57C8 ^ 0x5740] = 0xFFFFA8AF ^ 0x5740;
        ChangeLogs.C[0xE84F ^ 0xE8C4] = 0xE8A5 ^ 0xE8C4;
        ChangeLogs.C[0xBA96 ^ 0xBBB1] = 0xFFFF4434 ^ 0xBBB1;
        ChangeLogs.C[0xE751 ^ 0xE65E] = 0x180 ^ 0xE65E;
        ChangeLogs.C[0xE304 ^ 0xE23D] = 0xFFFF1DA2 ^ 0xE23D;
        ChangeLogs.C[0xB3A ^ 0xBFE] = 0xBFE ^ 0xBFE;
        ChangeLogs.C[0xA529 ^ 0xA430] = 0xFFFF5B9E ^ 0xA430;
        ChangeLogs.C[0xA9F8 ^ 0xA9AA] = 0xA9EE ^ 0xA9AA;
        ChangeLogs.C[0x7506 ^ 0x75B5] = 0xFFFF8A20 ^ 0x75B5;
        ChangeLogs.C[0xE80A ^ 0xE895] = 0xFFFF173F ^ 0xE895;
        ChangeLogs.C[0x88B9 ^ 0x8995] = 0x89F9 ^ 0x8995;
        ChangeLogs.C[0x6437 ^ 0x644F] = 0xFFFF9BBD ^ 0x644F;
        ChangeLogs.C[0xD9BC ^ 0xD98D] = 0xFFFF2667 ^ 0xD98D;
        ChangeLogs.C[0x8F41 ^ 0x8E08] = 0xFFFF71A0 ^ 0x8E08;
        ChangeLogs.C[0xF5C1 ^ 0xF582] = 0xF5B6 ^ 0xF582;
        ChangeLogs.C[0xB23B ^ 0xB28B] = 0xFFFF4D7B ^ 0xB28B;
        ChangeLogs.C[0x5497 ^ 0x549C] = 0xFFFFAB4C ^ 0x549C;
        ChangeLogs.C[0xAFC9 ^ 0xAED7] = 0xAE46 ^ 0xAED7;
        ChangeLogs.C[0xE190 ^ 0xE019] = 0xFFFFEDD3 ^ 0xE019;
        ChangeLogs.C[0x79BA ^ 0x7944] = 0x7945 ^ 0x7944;
        ChangeLogs.C[0x2E1 ^ 0x275] = 0xFFFFFDC0 ^ 0x275;
        ChangeLogs.C[0xA386 ^ 0xA2FA] = 0xC44 ^ 0xA2FA;
        ChangeLogs.C[0x4490 ^ 0x4424] = 0xFFFFBBE3 ^ 0x4424;
        ChangeLogs.C[0x10DEB ^ 0x10C98] = 0x180A1 ^ 0x10C98;
        ChangeLogs.C[0xA96D ^ 0xA853] = 0xFFFF57B0 ^ 0xA853;
        ChangeLogs.C[0x1261 ^ 0x12B4] = 0x1246 ^ 0x12B4;
        ChangeLogs.C[0x6586 ^ 0x64FE] = 0xC54A ^ 0x64FE;
        ChangeLogs.C[0x669A ^ 0x67C5] = 0x6ADA ^ 0x67C5;
        ChangeLogs.C[0x6364 ^ 0x6319] = 0x6364 ^ 0x6319;
        ChangeLogs.C[0x6151 ^ 0x6050] = 0x6050 ^ 0x6050;
        ChangeLogs.C[0xD1E8 ^ 0xD0C9] = 0xFFFF2F1E ^ 0xD0C9;
        ChangeLogs.C[0x7959 ^ 0x79C7] = 0xFFFF861F ^ 0x79C7;
        ChangeLogs.C[0xD8D5 ^ 0xD9A8] = 0x7742 ^ 0xD9A8;
        ChangeLogs.C[0xBC64 ^ 0xBCC6] = 0xBC9D ^ 0xBCC6;
        ChangeLogs.C[0x2C36 ^ 0x2CEC] = 0xFFFFD335 ^ 0x2CEC;
        ChangeLogs.C[0x509D ^ 0x51E7] = 0xF053 ^ 0x51E7;
        ChangeLogs.C[0x242F ^ 0x257E] = 0x12630 ^ 0x257E;
        ChangeLogs.C[0x6DB ^ 0x75E] = 0xFFFFCD96 ^ 0x75E;
        ChangeLogs.C[0x257A ^ 0x25DB] = 0x25C6 ^ 0x25DB;
        ChangeLogs.C[0x2B33 ^ 0x2BB6] = 0x2B9F ^ 0x2BB6;
        ChangeLogs.C[0x49AF ^ 0x4970] = 0xFFFFB6ED ^ 0x4970;
        ChangeLogs.C[0x10994 ^ 0x10978] = 0xFFFEF6DB ^ 0x10978;
        ChangeLogs.C[0x5CD6 ^ 0x5C55] = 0x5C22 ^ 0x5C55;
        ChangeLogs.C[0x1943 ^ 0x1966] = 0x1953 ^ 0x1966;
        ChangeLogs.C[0x27C1 ^ 0x26E7] = 0x26B0 ^ 0x26E7;
        ChangeLogs.C[0x3649 ^ 0x3641] = 0x3668 ^ 0x3641;
        ChangeLogs.C[0xB27A ^ 0xB2BC] = 0xB231 ^ 0xB2BC;
        ChangeLogs.C[0x5A4A ^ 0x5B65] = 0x5B6D ^ 0x5B65;
        ChangeLogs.C[0x1039C ^ 0x103F5] = 0x10397 ^ 0x103F5;
        ChangeLogs.C[0xA9F6 ^ 0xA99A] = 0xFFFF5630 ^ 0xA99A;
        ChangeLogs.C[0x3A01 ^ 0x3A97] = 0x3ACF ^ 0x3A97;
        ChangeLogs.C[0xE68 ^ 0xF63] = 0xC1F4 ^ 0xF63;
        ChangeLogs.C[0x9B2F ^ 0x9A4F] = 0x975C ^ 0x9A4F;
        ChangeLogs.C[0xA68D ^ 0xA7AE] = 0xFFFF5865 ^ 0xA7AE;
        ChangeLogs.C[0xDD5 ^ 0xC85] = 0xC85 ^ 0xC85;
        ChangeLogs.C[0xDAAF ^ 0xDABE] = 0xDA95 ^ 0xDABE;
        ChangeLogs.C[0x20B5 ^ 0x20B4] = 0xFFFFDF76 ^ 0x20B4;
        ChangeLogs.C[0x2FF2 ^ 0x2F26] = 0x2F4F ^ 0x2F26;
        ChangeLogs.C[0x3A26 ^ 0x3BA0] = 0xED1 ^ 0x3BA0;
        ChangeLogs.C[0x3028 ^ 0x3002] = 0x30DB ^ 0x3002;
        ChangeLogs.C[0xA19E ^ 0xA161] = 0xA161 ^ 0xA161;
        ChangeLogs.C[0x10E10 ^ 0x10F12] = 0x10F12 ^ 0x10F12;
        ChangeLogs.C[0x18F9 ^ 0x187E] = 0x1860 ^ 0x187E;
        ChangeLogs.C[0xE6EB ^ 0xE7C5] = 0xE781 ^ 0xE7C5;
        ChangeLogs.C[0x6501 ^ 0x6598] = 0x65BD ^ 0x6598;
        ChangeLogs.C[0x712C ^ 0x7068] = 0xFFFF8F93 ^ 0x7068;
        ChangeLogs.C[0xD250 ^ 0xD277] = 0xD25F ^ 0xD277;
        ChangeLogs.C[0x2753 ^ 0x27F5] = 0xFFFFD80A ^ 0x27F5;
        ChangeLogs.C[0xF0A5 ^ 0xF00B] = 0xF024 ^ 0xF00B;
        ChangeLogs.C[0xC6EF ^ 0xC6C7] = 0xFFFF3971 ^ 0xC6C7;
        ChangeLogs.C[0xB7F8 ^ 0xB79E] = 0xB729 ^ 0xB79E;
        ChangeLogs.C[0xFC2D ^ 0xFCB6] = 0xFFFF031C ^ 0xFCB6;
        ChangeLogs.C[0x25ED ^ 0x254D] = 0xFFFFDAEE ^ 0x254D;
        ChangeLogs.C[0x17F2 ^ 0x16CE] = 0x16EB ^ 0x16CE;
        ChangeLogs.C[0x1075F ^ 0x107CC] = 0x107CB ^ 0x107CC;
        ChangeLogs.C[0xAF90 ^ 0xAFD0] = 0xAF83 ^ 0xAFD0;
        ChangeLogs.C[0x2843 ^ 0x295F] = 0xFFFFD6BA ^ 0x295F;
        ChangeLogs.C[0x117A ^ 0x107D] = 0xF9DB ^ 0x107D;
        ChangeLogs.C[0xD8E1 ^ 0xD84D] = 0xFFFF27A9 ^ 0xD84D;
        ChangeLogs.C[0x215E ^ 0x2027] = 0x81C7 ^ 0x2027;
        ChangeLogs.C[0xF8FF ^ 0xF9DA] = 0xFFFF0655 ^ 0xF9DA;
        ChangeLogs.C[0xB05A ^ 0xB077] = 0xFFFF4F92 ^ 0xB077;
        ChangeLogs.C[0x178B ^ 0x16A6] = 0x16FA ^ 0x16A6;
        ChangeLogs.C[0xE9B5 ^ 0xE8B6] = 0xE85A ^ 0xE8B6;
        ChangeLogs.C[0x1992 ^ 0x18A0] = 0x18B9 ^ 0x18A0;
        ChangeLogs.C[0x47B9 ^ 0x47A7] = 0xFFFFB86E ^ 0x47A7;
        ChangeLogs.C[0xE14B ^ 0xE0C1] = 0x12EB ^ 0xE0C1;
        ChangeLogs.C[0xEC65 ^ 0xED4E] = 0xED35 ^ 0xED4E;
        ChangeLogs.C[0xD1F3 ^ 0xD100] = 0xD187 ^ 0xD100;
        ChangeLogs.C[0x3567 ^ 0x344E] = 0x3473 ^ 0x344E;
        ChangeLogs.C[2 ^ 0xD5] = 0xDB ^ 0xD5;
        ChangeLogs.C[0xA34B ^ 0xA353] = 0xFFFF5CCF ^ 0xA353;
        ChangeLogs.C[0x32B5 ^ 0x32E4] = 0x321E ^ 0x32E4;
        ChangeLogs.C[0xA906 ^ 0xA800] = 0x64C5 ^ 0xA800;
        ChangeLogs.C[0x9204 ^ 0x92A1] = 0xFFFF6D17 ^ 0x92A1;
        ChangeLogs.C[0x39E0 ^ 0x39CE] = 0x39C5 ^ 0x39CE;
        ChangeLogs.C[0x4197 ^ 0x41AF] = 0xFFFFBE27 ^ 0x41AF;
        ChangeLogs.C[0x10F30 ^ 0x10E70] = 0xFFFEF1FB ^ 0x10E70;
        ChangeLogs.C[0x10CC5 ^ 0x10D89] = 0x10D8B ^ 0x10D89;
        ChangeLogs.C[0xEC54 ^ 0xECE5] = 0xFFFF134C ^ 0xECE5;
        ChangeLogs.C[0xD91B ^ 0xD817] = 0x718A ^ 0xD817;
        ChangeLogs.C[0x2805 ^ 0x2892] = 0xFFFFD74B ^ 0x2892;
        ChangeLogs.C[0x6798 ^ 0x67CC] = 0x67DE ^ 0x67CC;
        ChangeLogs.C[0xF2C8 ^ 0xF387] = 0xF386 ^ 0xF387;
        ChangeLogs.C[0x54E2 ^ 0x54F6] = 0x54C8 ^ 0x54F6;
        ChangeLogs.C[0x195F ^ 0x194A] = 0xFFFFE688 ^ 0x194A;
        ChangeLogs.C[0x712C ^ 0x714E] = 0xFFFF8EAA ^ 0x714E;
        ChangeLogs.C[0x4672 ^ 0x4694] = 0x4699 ^ 0x4694;
        ChangeLogs.C[0xE623 ^ 0xE77F] = 0x69D1 ^ 0xE77F;
        ChangeLogs.C[0x48B3 ^ 0x488D] = 0x4890 ^ 0x488D;
        ChangeLogs.C[0x849 ^ 0x922] = 0x4790 ^ 0x922;
        ChangeLogs.C[0x95C9 ^ 0x95B6] = 0xFFFF6A48 ^ 0x95B6;
        ChangeLogs.C[0x5635 ^ 0x5651] = 0xFFFFA99C ^ 0x5651;
        ChangeLogs.C[0x2D56 ^ 0x2D0D] = 0xFFFFD2F8 ^ 0x2D0D;
        ChangeLogs.C[0xBD96 ^ 0xBC1B] = 0xFFFFF050 ^ 0xBC1B;
        ChangeLogs.C[0x2FC0 ^ 0x2FDD] = 0xFFFFD05B ^ 0x2FDD;
        ChangeLogs.C[0x9C ^ 0xAF] = 0xFFFFFF33 ^ 0xAF;
        ChangeLogs.C[0xDB99 ^ 0xDBAF] = 0xFFFF2463 ^ 0xDBAF;
        ChangeLogs.C[0x388D ^ 0x38ED] = 0xFFFFC763 ^ 0x38ED;
        ChangeLogs.C[0x63D6 ^ 0x633C] = 0xFFFF9C0D ^ 0x633C;
        ChangeLogs.C[0x6932 ^ 0x686C] = 0xE6C2 ^ 0x686C;
        ChangeLogs.C[0x8412 ^ 0x8509] = 0xFFFF7ABB ^ 0x8509;
        ChangeLogs.C[0xDD1 ^ 0xD50] = 0xDFE ^ 0xD50;
        ChangeLogs.C[0x1476 ^ 0x1521] = 0x12C0 ^ 0x1521;
        ChangeLogs.C[0x898F ^ 0x897E] = 0x897E ^ 0x897E;
        ChangeLogs.C[0xE1E6 ^ 0xE1E9] = 0xE1D9 ^ 0xE1E9;
        ChangeLogs.C[0x6EDE ^ 0x6E75] = 0x6E58 ^ 0x6E75;
        ChangeLogs.C[0xC7A8 ^ 0xC7BA] = 0xFFFF380B ^ 0xC7BA;
        ChangeLogs.C[0x85A ^ 0x820] = 0xFFFFF7EB ^ 0x820;
        ChangeLogs.C[0xB4BA ^ 0xB58C] = 0xFFFF4A2B ^ 0xB58C;
        ChangeLogs.C[0x1D99 ^ 0x1CCB] = 0x11F95 ^ 0x1CCB;
        ChangeLogs.C[0x88FF ^ 0x8846] = 0x884D ^ 0x8846;
        ChangeLogs.C[0x10678 ^ 0x106D1] = 0x1069A ^ 0x106D1;
        ChangeLogs.C[0x4F11 ^ 0x4E9D] = 0xFD61 ^ 0x4E9D;
        ChangeLogs.C[0x1EB ^ 0x16B] = 0x135 ^ 0x16B;
        ChangeLogs.C[0x1E55 ^ 0x1F1F] = 0xFFFFE0BF ^ 0x1F1F;
        ChangeLogs.C[0xBEA8 ^ 0xBF27] = 0x9ED2 ^ 0xBF27;
        ChangeLogs.C[0x1FBA ^ 0x1F1E] = 0x1F03 ^ 0x1F1E;
        ChangeLogs.C[0x1226 ^ 0x1285] = 0x12D7 ^ 0x1285;
        ChangeLogs.C[0xA238 ^ 0xA2EE] = 0xA282 ^ 0xA2EE;
        ChangeLogs.C[0xC697 ^ 0xC6AB] = 0xC648 ^ 0xC6AB;
        ChangeLogs.C[0xA32B ^ 0xA245] = 0xECFF ^ 0xA245;
        ChangeLogs.C[0x94F1 ^ 0x946B] = 0x945A ^ 0x946B;
        ChangeLogs.C[0x2E9 ^ 0x20B] = 0xFFFFFDBE ^ 0x20B;
        ChangeLogs.C[0x467C ^ 0x46FE] = 0x46C9 ^ 0x46FE;
        ChangeLogs.C[0xBB3C ^ 0xBA23] = 0xFFFF45BC ^ 0xBA23;
        ChangeLogs.C[0xD167 ^ 0xD12F] = 0xD148 ^ 0xD12F;
        ChangeLogs.C[0x424A ^ 0x432B] = 0x4E43 ^ 0x432B;
        ChangeLogs.C[0x17B8 ^ 0x168B] = 0x16D8 ^ 0x168B;
        ChangeLogs.C[0xABA4 ^ 0xABA9] = 0xABCD ^ 0xABA9;
        ChangeLogs.C[0xF2E ^ 0xE50] = 0xA0EE ^ 0xE50;
        ChangeLogs.C[0x2E8 ^ 0x2EF] = 0x2AF ^ 0x2EF;
        ChangeLogs.C[0xA190 ^ 0xA0A1] = 0xFFFF5F3F ^ 0xA0A1;
        ChangeLogs.C[0xE2CB ^ 0xE218] = 0xFFFF1DD5 ^ 0xE218;
        ChangeLogs.C[0x53 ^ 0xE8] = 0x9C ^ 0xE8;
        ChangeLogs.C[0x7CAA ^ 0x7C50] = 0x7C07 ^ 0x7C50;
        ChangeLogs.C[0x2E3E ^ 0x2F73] = 0x2F73 ^ 0x2F73;
        ChangeLogs.C[0x9BA2 ^ 0x9AD9] = 0x3462 ^ 0x9AD9;
        ChangeLogs.C[0xEAE4 ^ 0xEA05] = 0xEA1C ^ 0xEA05;
        ChangeLogs.C[0x10A54 ^ 0x10A18] = 0x10A49 ^ 0x10A18;
        ChangeLogs.C[0x9651 ^ 0x9626] = 0xFFFF69BA ^ 0x9626;
        ChangeLogs.C[0x392E ^ 0x392D] = 0xFFFFC6FD ^ 0x392D;
        ChangeLogs.C[0x511C ^ 0x507B] = 0x644 ^ 0x507B;
        ChangeLogs.C[0xF4F2 ^ 0xF4B9] = 0xF45B ^ 0xF4B9;
        ChangeLogs.C[0x35B5 ^ 0x34E8] = 0xFFFF4588 ^ 0x34E8;
        ChangeLogs.C[0x3281 ^ 0x323C] = 0xFFFFCD98 ^ 0x323C;
        ChangeLogs.C[0xCB29 ^ 0xCB19] = 0xCB0B ^ 0xCB19;
        ChangeLogs.C[0x47B2 ^ 0x476B] = 0xFFFFB8C2 ^ 0x476B;
        ChangeLogs.C[0x545C ^ 0x552E] = 0x11C7 ^ 0x552E;
        ChangeLogs.C[0x594C ^ 0x59A4] = 0x5984 ^ 0x59A4;
        ChangeLogs.C[0x9EFC ^ 0x9EE6] = 0x9EEB ^ 0x9EE6;
        ChangeLogs.C[0x1056B ^ 0x10582] = 0x105F5 ^ 0x10582;
        ChangeLogs.C[0x9151 ^ 0x9079] = 0xFFFF6FE1 ^ 0x9079;
        ChangeLogs.C[0xD7F9 ^ 0xD70F] = 0xD77A ^ 0xD70F;
        ChangeLogs.C[0x7245 ^ 0x7307] = 0xFFFF8C9D ^ 0x7307;
        ChangeLogs.C[0xCD3C ^ 0xCD39] = 0xFFFF32C9 ^ 0xCD39;
        ChangeLogs.C[0xEBF6 ^ 0xEBC4] = 0xFFFF1434 ^ 0xEBC4;
        ChangeLogs.C[0xA3E7 ^ 0xA3BD] = 0xA3CD ^ 0xA3BD;
        ChangeLogs.C[0x7344 ^ 0x7300] = 0xFFFF8CE9 ^ 0x7300;
        ChangeLogs.C[0xA2FC ^ 0xA2F6] = 0xFFFF5D60 ^ 0xA2F6;
        ChangeLogs.C[0x927D ^ 0x93FE] = 0xA680 ^ 0x93FE;
        ChangeLogs.C[0xEFF1 ^ 0xEEFF] = 0xE5C1 ^ 0xEEFF;
        ChangeLogs.C[0xE3CC ^ 0xE35C] = 0xE381 ^ 0xE35C;
        ChangeLogs.C[0x6EAF ^ 0x6EFA] = 0x6EE7 ^ 0x6EFA;
        ChangeLogs.C[0x7DF3 ^ 0x7DF3] = 0xFFFF8258 ^ 0x7DF3;
        ChangeLogs.C[0xC1CA ^ 0xC147] = 0xFFFF3E82 ^ 0xC147;
        ChangeLogs.C[0x5A3 ^ 0x4F6] = 0x4D40 ^ 0x4F6;
        ChangeLogs.C[0x1033E ^ 0x10378] = 0x10301 ^ 0x10378;
        ChangeLogs.C[0xD484 ^ 0xD4AD] = 0xD480 ^ 0xD4AD;
        ChangeLogs.C[0xB340 ^ 0xB216] = 0xFBAD ^ 0xB216;
        ChangeLogs.C[0xD26C ^ 0xD255] = 0xD2F8 ^ 0xD255;
        ChangeLogs.C[0x7DE0 ^ 0x7CDA] = 0xFFFF8317 ^ 0x7CDA;
        ChangeLogs.C[0x5D6C ^ 0x5D40] = 0x5D1B ^ 0x5D40;
        ChangeLogs.C[0xFDF8 ^ 0xFD34] = 0xFFFF02F7 ^ 0xFD34;
        ChangeLogs.C[0x7B34 ^ 0x7B81] = 0xFFFF843E ^ 0x7B81;
        ChangeLogs.C[0x729E ^ 0x73DB] = 0xFFFF8C54 ^ 0x73DB;
        ChangeLogs.C[0x6145 ^ 0x6163] = 0xFFFF9EB5 ^ 0x6163;
        ChangeLogs.C[0xE8EA ^ 0xE847] = 0xE85B ^ 0xE847;
        ChangeLogs.C[0xAF2C ^ 0xAE59] = 0x2238 ^ 0xAE59;
        ChangeLogs.C[0xDB5 ^ 0xD27] = 0xFFFFF292 ^ 0xD27;
        ChangeLogs.C[0x1052C ^ 0x105FD] = 0xFFFEFA0C ^ 0x105FD;
        ChangeLogs.C[0x66D2 ^ 0x661F] = 0xFFFF99ED ^ 0x661F;
        ChangeLogs.C[0x6384 ^ 0x62EC] = 0x34D7 ^ 0x62EC;
        ChangeLogs.C[0x9B40 ^ 0x9BFE] = 0xFFFF6416 ^ 0x9BFE;
        ChangeLogs.C[0xBFDA ^ 0xBF13] = 0xFFFF40CA ^ 0xBF13;
        ChangeLogs.C[0xB513 ^ 0xB5F8] = 0xFFFF4A6B ^ 0xB5F8;
        ChangeLogs.C[0xFE3B ^ 0xFF68] = 0xB6D4 ^ 0xFF68;
        ChangeLogs.C[0x83C8 ^ 0x83CA] = 0xFFFF7C6B ^ 0x83CA;
        ChangeLogs.C[0xD001 ^ 0xD0F6] = 0xD0C0 ^ 0xD0F6;
        ChangeLogs.C[0x85F7 ^ 0x85A8] = 0xFFFF7A0B ^ 0x85A8;
        ChangeLogs.C[0x5683 ^ 0x568D] = 0x56F5 ^ 0x568D;
        ChangeLogs.C[0xA93C ^ 0xA818] = 0xA8DF ^ 0xA818;
        ChangeLogs.C[0x8C7D ^ 0x8D68] = 0x8D28 ^ 0x8D68;
        ChangeLogs.C[0x986B ^ 0x992A] = 0x9916 ^ 0x992A;
        ChangeLogs.C[0xE186 ^ 0xE1F2] = 0xE1AA ^ 0xE1F2;
        ChangeLogs.C[0x99A9 ^ 0x99B0] = 0xFFFF663A ^ 0x99B0;
        ChangeLogs.C[0x4BD8 ^ 0x4A58] = 0x2479 ^ 0x4A58;
        ChangeLogs.C[0x2DE4 ^ 0x2D39] = 0xFFFFD2C8 ^ 0x2D39;
        ChangeLogs.C[0x590F ^ 0x588D] = 0x36AC ^ 0x588D;
        ChangeLogs.C[0x52F ^ 0x56D] = 0xFFFFFAB0 ^ 0x56D;
        ChangeLogs.C[0x17AD ^ 0x16AD] = 0x16AF ^ 0x16AD;
        ChangeLogs.C[0x4F15 ^ 0x4F28] = 0x4F74 ^ 0x4F28;
        ChangeLogs.C[0x2E7E ^ 0x2E23] = 0x2E3C ^ 0x2E23;
        ChangeLogs.C[0x5B72 ^ 0x5BE3] = 0xFFFFA46D ^ 0x5BE3;
        ChangeLogs.C[0xAB73 ^ 0xABB9] = 0xAB8D ^ 0xABB9;
        ChangeLogs.C[0x86D4 ^ 0x87B9] = 0xFFFF36A5 ^ 0x87B9;
        ChangeLogs.C[0x1094E ^ 0x10824] = 0x15E1F ^ 0x10824;
        ChangeLogs.C[0x1062F ^ 0x1061B] = 0x1064F ^ 0x1061B;
        ChangeLogs.C[0x105FC ^ 0x104B2] = 0x104B3 ^ 0x104B2;
        ChangeLogs.C[0xA18 ^ 0xA63] = 0xA4F ^ 0xA63;
        ChangeLogs.C[0xF5B2 ^ 0xF54F] = 0xF54F ^ 0xF54F;
        ChangeLogs.C[0x504F ^ 0x5019] = 0xFFFFAFE8 ^ 0x5019;
        ChangeLogs.C[0xB233 ^ 0xB3B7] = 0x86C6 ^ 0xB3B7;
        ChangeLogs.C[0x2574 ^ 0x253E] = 0xFFFFDAD2 ^ 0x253E;
        ChangeLogs.C[0xA8FF ^ 0xA8A7] = 0xFFFF5709 ^ 0xA8A7;
        ChangeLogs.C[0xA66A ^ 0xA609] = 0xA693 ^ 0xA609;
        ChangeLogs.C[0xB8F7 ^ 0xB9BF] = 0xFFFF4667 ^ 0xB9BF;
        ChangeLogs.C[0x813B ^ 0x81CE] = 0xFFFF7E6C ^ 0x81CE;
        ChangeLogs.C[0x7F6F ^ 0x7F81] = 0xFFFF802E ^ 0x7F81;
        ChangeLogs.C[0x485D ^ 0x4955] = 0xD773 ^ 0x4955;
        ChangeLogs.C[0x356C ^ 0x3400] = 0x7ABA ^ 0x3400;
        ChangeLogs.C[0xBB54 ^ 0xBB58] = 0xBBBA ^ 0xBB58;
        ChangeLogs.C[0x23C5 ^ 0x230D] = 0x231A ^ 0x230D;
        ChangeLogs.C[0x2772 ^ 0x264F] = 0x2657 ^ 0x264F;
        ChangeLogs.C[0xA7A3 ^ 0xA7F3] = 0xFFFF5832 ^ 0xA7F3;
        ChangeLogs.C[0x4F2D ^ 0x4FD1] = 0x4FD2 ^ 0x4FD1;
        ChangeLogs.C[0x89E9 ^ 0x8909] = 0xFFFF76C8 ^ 0x8909;
        ChangeLogs.C[0xCE1F ^ 0xCE8A] = 0xFFFF3118 ^ 0xCE8A;
        ChangeLogs.C[0x64C5 ^ 0x65B2] = 0xC40B ^ 0x65B2;
        ChangeLogs.C[0x956A ^ 0x941A] = 0xD0F3 ^ 0x941A;
        ChangeLogs.C[0xE9DD ^ 0xE91A] = 0xFFFF1683 ^ 0xE91A;
        ChangeLogs.C[0xBB91 ^ 0xBBF6] = 0xBBF0 ^ 0xBBF6;
        ChangeLogs.C[0xB837 ^ 0xB818] = 0xFFFF47FA ^ 0xB818;
        ChangeLogs.C[0x91B2 ^ 0x9086] = 0xFFFF6F6E ^ 0x9086;
        ChangeLogs.C[0x10FA2 ^ 0x10EE4] = 0x10EF3 ^ 0x10EE4;
        ChangeLogs.C[0xB95C ^ 0xB90F] = 0xB92B ^ 0xB90F;
        ChangeLogs.C[0xEDBB ^ 0xEDC5] = 0xFFFF1246 ^ 0xEDC5;
        ChangeLogs.C[0x5B18 ^ 0x5B57] = 0x5B43 ^ 0x5B57;
        ChangeLogs.C[0x1714 ^ 0x1707] = 0x1775 ^ 0x1707;
        ChangeLogs.C[0x2478 ^ 0x250C] = 0xA93B ^ 0x250C;
        ChangeLogs.C[0x1038 ^ 0x1031] = 0xFFFFEF43 ^ 0x1031;
        ChangeLogs.C[0x92A4 ^ 0x9323] = 0x6100 ^ 0x9323;
        ChangeLogs.C[0x5E77 ^ 0x5F55] = 0xFFFFA0B9 ^ 0x5F55;
        ChangeLogs.C[0x2D9C ^ 0x2DF7] = 0xFFFFD257 ^ 0x2DF7;
        ChangeLogs.C[0x8413 ^ 0x8500] = 0xFFFF7AEA ^ 0x8500;
        ChangeLogs.C[0x4CA8 ^ 0x4CC9] = 0xFFFFB36C ^ 0x4CC9;
        ChangeLogs.C[0xEB49 ^ 0xEBA6] = 0xEB92 ^ 0xEBA6;
        ChangeLogs.C[0x2449 ^ 0x2417] = 0xFFFFDBB3 ^ 0x2417;
        ChangeLogs.C[0x6CF6 ^ 0x6C9E] = 0x6CF3 ^ 0x6C9E;
        ChangeLogs.C[0x8DFC ^ 0x8D8F] = 0x8D9D ^ 0x8D8F;
        ChangeLogs.C[0xF176 ^ 0xF141] = 0xF101 ^ 0xF141;
        ChangeLogs.C[0xE3DF ^ 0xE2B6] = 0xB4BE ^ 0xE2B6;
        ChangeLogs.C[0x52EF ^ 0x5250] = 0x521C ^ 0x5250;
        ChangeLogs.C[0x6957 ^ 0x69A7] = 0xFFFF964D ^ 0x69A7;
        ChangeLogs.C[0xDCE8 ^ 0xDC64] = 0xDC76 ^ 0xDC64;
        ChangeLogs.C[0x4DF3 ^ 0x4CC3] = 0x4CAA ^ 0x4CC3;
        ChangeLogs.C[0x211A ^ 0x2040] = 0x27A2 ^ 0x2040;
        ChangeLogs.C[0x3E79 ^ 0x3E65] = 0x3E67 ^ 0x3E65;
        ChangeLogs.C[0xC412 ^ 0xC500] = 0xC52B ^ 0xC500;
        ChangeLogs.C[0x3830 ^ 0x385E] = 0x385B ^ 0x385E;
        ChangeLogs.C[0x30A9 ^ 0x30E8] = 0x30E5 ^ 0x30E8;
        ChangeLogs.C[0x64FA ^ 0x6403] = 0xFFFF9BED ^ 0x6403;
        ChangeLogs.C[0x8E12 ^ 0x8EE6] = 0x8EC0 ^ 0x8EE6;
        ChangeLogs.C[0xE2D1 ^ 0xE232] = 0xE26F ^ 0xE232;
        ChangeLogs.C[0x3777 ^ 0x37C1] = 0xFFFFC847 ^ 0x37C1;
        ChangeLogs.C[0x9A25 ^ 0x9A62] = 0x9A4D ^ 0x9A62;
        ChangeLogs.C[0x1D11 ^ 0x1D3A] = 0xFFFFE2B4 ^ 0x1D3A;
        ChangeLogs.C[0x2E4E ^ 0x2F6E] = 0x2F7E ^ 0x2F6E;
        ChangeLogs.C[0xFDC7 ^ 0xFD5F] = 0xFD21 ^ 0xFD5F;
        ChangeLogs.C[0x6CFF ^ 0x6C3C] = 0xFFFF9393 ^ 0x6C3C;
        ChangeLogs.C[0x34D9 ^ 0x3409] = 0xFFFFCB94 ^ 0x3409;
        ChangeLogs.C[0xDBC3 ^ 0xDB8A] = 0xFFFF2437 ^ 0xDB8A;
        ChangeLogs.C[0x2F0D ^ 0x2E69] = 0x604 ^ 0x2E69;
        ChangeLogs.C[0x67A ^ 0x64F] = 0xFFFFF9DB ^ 0x64F;
        ChangeLogs.C[0x2993 ^ 0x2976] = 0x2924 ^ 0x2976;
        ChangeLogs.C[0xC069 ^ 0xC173] = 0xFFFF3EEF ^ 0xC173;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0006\u00a8\u0006\f"}, d2={"Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogs$Companion;", "", "<init>", "()V", "", "X", "F", "Y", "WIDTH", "HEIGHT", "GAP", "CARD_BORDER", "rain-visuals"})
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

