/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu.render;

import java.awt.Color;
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
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.MenuStyle;
import kotakbaz.rain.ui.menu.layout.MenuLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018JQ\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u001b\u00a8\u0006\u001c"}, d2={"Lkotakbaz/rain/ui/menu/render/MenuTopBarRenderer;", "", "Lkotakbaz/rain/ui/api/PipelinedRender;", "pipelines", "<init>", "(Lkotakbaz/rain/ui/api/PipelinedRender;)V", "Lkotakbaz/rain/ui/menu/layout/MenuLayout;", "layout", "Lkotakbaz/rain/client/extensions/Category;", "currentCategory", "", "inputText", "", "inputFocused", "inputSelected", "", "uiScale", "configMode", "configActionEnabled", "alpha", "", "render", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;ZZFZZF)V", "renderCategorySection", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;FF)V", "renderSearchSection", "(Lkotakbaz/rain/ui/menu/layout/MenuLayout;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;ZZZZF)V", "Lkotakbaz/rain/ui/api/PipelinedRender;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nMenuTopBarRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuTopBarRenderer.kt\nkotakbaz/rain/ui/menu/render/MenuTopBarRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class MenuTopBarRenderer {
    @NotNull
    private final PipelinedRender pipelines;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public MenuTopBarRenderer(@NotNull PipelinedRender pipelines) {
        int n2 = C[0];
        n2 -= C[1];
        Intrinsics.checkNotNullParameter(pipelines, (String)a[n2 += C[2]]);
        this.pipelines = pipelines;
    }

    public final void render(@NotNull MenuLayout layout, @Nullable Category currentCategory, @NotNull String inputText, boolean inputFocused, boolean inputSelected, float uiScale, boolean configMode, boolean configActionEnabled, float alpha2) {
        int n2 = C[3];
        n2 += C[4];
        Intrinsics.checkNotNullParameter(layout, (String)a[n2 ^= C[5]]);
        int n3 = C[6];
        n3 ^= C[7];
        Intrinsics.checkNotNullParameter(inputText, (String)a[n3 += C[8]]);
        this.renderCategorySection(layout, currentCategory, uiScale, alpha2);
        this.renderSearchSection(layout, currentCategory, inputText, inputFocused, inputSelected, configMode, configActionEnabled, alpha2);
    }

    private final void renderCategorySection(MenuLayout layout, Category currentCategory, float uiScale, float alpha2) {
        block1: {
            long l2 = -2878739748604006912L;
            if (layout.getTopBarInfoWidth() <= 0.0f) {
                return;
            }
            RenderUtils.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(4.0f).color(MenuStyle.INSTANCE.surface(0.01f * alpha2)).border(1.0f, MenuStyle.INSTANCE.surface(0.06f * alpha2)).draw(layout.getTopBarInfoX(), layout.getTopBarY(), layout.getTopBarInfoWidth(), layout.getTopBarHeight());
            Category category = currentCategory;
            if (category == null) break block1;
            Category category2 = category;
            long l3 = l2;
            int n2 = C[9];
            n2 -= C[10];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 -= C[11]);
            float f2 = layout.getTopBarHeight() * 0.35f;
            float f3 = layout.getTopBarHeight() * 0.25f;
            float f4 = layout.getTopBarInfoX() + layout.getUiPadding() * 1.5f;
            float f5 = layout.getTopBarY() + (layout.getTopBarHeight() - f2) * 0.5f;
            int n3 = C[12];
            n3 ^= C[13];
            float f6 = E.getWidth$default(Font.INSTANCE.getICON(), category2.getIcon(), f2, 0.0f, n3 -= C[14], null);
            float f7 = f4 + f6 + layout.getUiPadding();
            float f8 = layout.getTopBarY() + (layout.getTopBarHeight() - f3) * 0.46f;
            float f9 = layout.getTopBarInfoX() + layout.getTopBarInfoWidth() - layout.getUiPadding() * 1.5f;
            float f10 = RangesKt.coerceAtLeast(uiScale, 0.01f);
            float f11 = RangesKt.coerceAtLeast(layout.getTopBarInfoWidth() * 0.05f, 6.0f);
            float f12 = f7 + layout.getUiPadding() + f11;
            float f13 = RangesKt.coerceAtLeast(f9 - f12, 0.0f);
            float f14 = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(layout.getTopBarInfoWidth() * 0.34f, 0.0f), f13);
            float f15 = RangesKt.coerceIn((f10 - 0.75f) / 0.35f, 0.0f, 1.0f);
            float f16 = f14 + (f13 - f14) * f15;
            float f17 = RangesKt.coerceAtLeast(f9 - f16, f12);
            Color color = MenuStyle.INSTANCE.title(0.86f * alpha2);
            Color color2 = MenuStyle.INSTANCE.value(0.4f * alpha2);
            E e2 = Font.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline());
            int n4 = C[15];
            n4 ^= C[16];
            int n5 = C[18];
            n5 -= C[19];
            E.drawText$default(Font.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), category2.getIcon(), f4, f5, f2, MenuStyle.INSTANCE.icon(0.86f * alpha2), 0.0f, 0.0f, 0.0f, n4 += C[17], 0.0f, n5 -= C[20], null);
            int n6 = C[21];
            n6 += C[22];
            int n7 = C[24];
            n7 += C[25];
            E.drawText$default(Font.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), category2.getName(), f7, f8, f3, color, 0.0f, 0.0f, 0.0f, n6 += C[23], 0.0f, n7 += C[26], null);
            int n8 = C[27];
            n8 -= C[28];
            float f18 = E.getWidth$default(e2, category2.getDesc(), f3, 0.0f, n8 ^= C[29], null);
            float f19 = f17 + f16 - f18;
            e2.resetFade();
            int n9 = C[30];
            n9 += C[31];
            int n10 = C[33];
            n10 ^= C[34];
            E.drawText$default(e2, category2.getDesc(), f19, f8, f3, color2, 0.0f, 0.0f, 0.0f, n9 -= C[32], 0.0f, n10 += C[35], null);
        }
    }

    private final void renderSearchSection(MenuLayout layout, Category currentCategory, String inputText, boolean inputFocused, boolean inputSelected, boolean configMode, boolean configActionEnabled, float alpha2) {
        int n2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        long l2;
        block22: {
            Object object;
            block24: {
                block23: {
                    int n3;
                    Object object2;
                    long l3;
                    block21: {
                        float f7;
                        Object object3;
                        Object object4;
                        l3 = 5830359327507817850L;
                        l2 = 1414634356207342760L;
                        if (configMode && layout.getTopBarFolderButtonSize() > 0.0f) {
                            RenderUtils.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(4.0f).color(MenuStyle.INSTANCE.surface(0.01f * alpha2)).border(1.0f, MenuStyle.INSTANCE.surface(0.07f * alpha2)).draw(layout.getTopBarFolderButtonX(), layout.getTopBarFolderButtonY(), layout.getTopBarFolderButtonSize(), layout.getTopBarHeight());
                            f6 = layout.getTopBarHeight() * 0.34f;
                            f5 = layout.getTopBarFolderButtonX() + layout.getTopBarFolderButtonSize() * 0.5f;
                            f4 = layout.getTopBarFolderButtonY() + (layout.getTopBarHeight() - f6) * 0.5f - 0.1f;
                            int n4 = C[36];
                            n4 ^= C[37];
                            int n5 = C[39];
                            n5 -= C[40];
                            E.drawCenteredText$default(Font.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), (String)a[n4 ^= C[38]], f5, f4, f6, MenuStyle.INSTANCE.icon(0.8f * alpha2), 0.0f, n5 += C[41], null);
                        }
                        if (layout.getTopBarSearchWidth() <= 0.0f) {
                            return;
                        }
                        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(4.0f).color(MenuStyle.INSTANCE.surface(0.01f * alpha2)).border(1.0f, MenuStyle.INSTANCE.surface(0.07f * alpha2)).draw(layout.getTopBarSearchX(), layout.getTopBarY(), layout.getTopBarSearchWidth(), layout.getTopBarHeight());
                        f6 = layout.getTopBarHeight() * 0.24f;
                        f5 = layout.getTopBarSearchX() + layout.getUiPadding() * 1.3f;
                        f4 = layout.getTopBarY() + (layout.getTopBarHeight() - f6) * 0.46f;
                        if (configMode) {
                            int n6 = C[42];
                            n6 ^= C[43];
                            int n7 = C[45];
                            n7 -= C[46];
                            object4 = (String)a[n6 ^= C[44]] + (String)a[n7 ^= C[47]];
                        } else {
                            object4 = currentCategory;
                            if (object4 == null || (object4 = ((Category)object4).getSearchPlaceholder()) == null) {
                                int n8 = C[48];
                                n8 -= C[49];
                                object4 = (String)a[n8 -= C[50]];
                            }
                        }
                        Object object5 = object4;
                        Object object6 = inputText;
                        if (StringsKt.isBlank((CharSequence)object6)) {
                            long l4 = l3;
                            int n9 = C[51];
                            n9 -= C[52];
                            l3 = l4 ^ (0L ^ l4) & -1L << (n9 -= C[53]);
                            if (inputFocused) {
                                int n10 = C[54];
                                n10 -= C[55];
                                object3 = (String)a[n10 -= C[56]];
                            } else {
                                object3 = object5;
                            }
                        } else {
                            object3 = object6;
                        }
                        String string = (String)object3;
                        object6 = StringsKt.isBlank(inputText) ? MenuStyle.INSTANCE.value(0.45f * alpha2) : MenuStyle.INSTANCE.title(0.76f * alpha2);
                        int n11 = C[57];
                        n11 ^= C[58];
                        f3 = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), string, f6, 0.0f, n11 -= C[59], null);
                        if (inputSelected) {
                            int n12;
                            if (((CharSequence)inputText).length() > 0) {
                                int n13 = C[60];
                                n13 -= C[61];
                                n12 = n13 ^= C[62];
                            } else {
                                int n14 = C[63];
                                n14 ^= C[64];
                                n12 = n14 ^= C[65];
                            }
                            if (n12 != 0) {
                                f7 = RangesKt.coerceAtMost(f6 + 6.0f, layout.getTopBarHeight() - 6.0f);
                                f2 = layout.getTopBarY() + (layout.getTopBarHeight() - f7) * 0.5f;
                                RenderUtils.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).round(3.0f).color(MenuStyle.INSTANCE.surface(0.16f * alpha2)).draw(f5 - 2.0f, f2, f3 + 4.0f, f7);
                            }
                        }
                        int n15 = C[66];
                        n15 -= C[67];
                        int n16 = C[69];
                        n16 += C[70];
                        E.drawText$default(Font.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), string, f5, f4, f6, (Color)object6, 0.0f, 0.0f, 0.0f, n15 += C[68], 0.0f, n16 ^= C[71], null);
                        if (!configMode) break block21;
                        RenderUtils.INSTANCE.getBASIC_RECT().priority(this.pipelines.rectPipeline()).color(configActionEnabled ? MenuStyle.INSTANCE.surface(0.42f * alpha2) : MenuStyle.INSTANCE.surface(0.18f * alpha2)).round(4.0f).draw(layout.getTopBarSearchActionX(), layout.getTopBarSearchActionY(), layout.getTopBarSearchActionSize(), layout.getTopBarSearchActionSize());
                        f7 = f6 * 1.2f;
                        int n17 = C[72];
                        n17 ^= C[73];
                        int n18 = C[75];
                        n18 -= C[76];
                        f2 = layout.getTopBarSearchActionX() + (layout.getTopBarSearchActionSize() - E.getWidth$default(Font.INSTANCE.getICON(), (String)a[n17 ^= C[74]], f7, 0.0f, n18 += C[77], null)) * 0.585f;
                        float f8 = layout.getTopBarSearchActionY() + (layout.getTopBarSearchActionSize() - Font.INSTANCE.getICON().getHeight(f7)) * 0.53f;
                        int n19 = C[78];
                        n19 += C[79];
                        String string2 = (String)a[n19 -= C[80]];
                        int n20 = C[81];
                        n20 += C[82];
                        int n21 = C[84];
                        n21 ^= C[85];
                        E.drawText$default(Font.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), string2, f2, f8, f7, configActionEnabled ? MenuStyle.INSTANCE.title(alpha2) : MenuStyle.INSTANCE.value(alpha2), 0.0f, 0.0f, 0.0f, n20 += C[83], 0.0f, n21 += C[86], null);
                        break block22;
                    }
                    object = currentCategory;
                    if (object == null || (object = ((Category)object).getSearchFieldIcon()) == null) break block23;
                    Object object7 = object2 = object;
                    long l5 = l3;
                    int n22 = C[87];
                    n22 -= C[88];
                    l3 = l5 ^ (0L ^ l5) & -1L >>> (n22 ^= C[89]);
                    if (!StringsKt.isBlank((CharSequence)object7)) {
                        int n23 = C[90];
                        n23 ^= C[91];
                        n3 = n23 += C[92];
                    } else {
                        int n24 = C[93];
                        n24 -= C[94];
                        n3 = n24 ^= C[95];
                    }
                    if ((object = n3 != 0 ? object2 : null) != null) break block24;
                }
                int n25 = C[96];
                n25 += C[97];
                object = (String)a[n25 ^= C[98]];
            }
            Object object8 = object;
            int n26 = C[99];
            n26 -= C[100];
            int n27 = C[102];
            n27 ^= C[103];
            E.drawText$default(Font.INSTANCE.getICON().priority(this.pipelines.iconsPipeline()), (String)object8, layout.getTopBarSearchX() + layout.getTopBarSearchWidth() - layout.getUiPadding() * 2.7f, f4 + 1.0f, f6, MenuStyle.INSTANCE.icon(0.45f * alpha2), 0.0f, 0.0f, 0.0f, n26 ^= C[101], 0.0f, n27 ^= C[104], null);
        }
        if (inputFocused && !inputSelected && System.currentTimeMillis() / 450L % 2L == 0L) {
            int n28 = C[105];
            n28 += C[106];
            n2 = n28 ^= C[107];
        } else {
            int n29 = C[108];
            n29 -= C[109];
            n2 = n29 ^= C[110];
        }
        int n30 = C[111];
        n30 ^= C[112];
        long l6 = l2;
        int n31 = C[114];
        n31 += C[115];
        l2 = l6 ^ ((long)n2 << (n30 ^= C[113]) ^ l6) & -1L << (n31 ^= C[116]);
        int n32 = C[117];
        n32 ^= C[118];
        if ((int)(l2 >>> (n32 += C[119])) == 0) {
            return;
        }
        f2 = f5 + f3 + 1.0f;
        int n33 = C[120];
        n33 += C[121];
        int n34 = C[123];
        n34 -= C[124];
        int n35 = C[126];
        n35 -= C[127];
        E.drawText$default(Font.INSTANCE.getGS_MEDIUM().priority(this.pipelines.textPipeline()), (String)a[n33 ^= C[122]], f2, f4, f6, MenuStyle.INSTANCE.title(0.86f * alpha2), 0.0f, 0.0f, 0.0f, n34 -= C[125], 0.0f, n35 -= C[128], null);
    }

    static {
        MenuTopBarRenderer.b();
        long l2 = -3426053012668376885L;
        long l3 = -2372921644613010558L;
        long l4 = -1346175857390562079L;
        long l5 = 6990376334670048809L;
        long l6 = -963920697507702219L;
        long l7 = -6123808649092623400L;
        long l8 = -3203037199432949834L;
        long l9 = -980347892768522651L;
        long l10 = -6734694697242215205L;
        long l11 = -725938447081835410L;
        long l12 = 1745736836752531702L;
        long l13 = 1285143255970998993L;
        long l14 = 706634357429382096L;
        long l15 = 439867697459700065L;
        int n2 = C[129];
        n2 -= C[130];
        a = new Object[n2 += C[131]];
        long l16 = l15;
        int n3 = C[132];
        n3 += C[133];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[134]);
        Object[] objectArray = new Object[C[135]];
        objectArray[MenuTopBarRenderer.C[136]] = A;
        objectArray[MenuTopBarRenderer.C[137]] = C[138];
        int n4 = C[139];
        Object object = MenuTopBarRenderer.A()[C[140]];
        if (object == null) {
            char[] cArray = "\u8565\u859d\u8580\u85a2\u84df\u8599\u857e\u859b\u852c\u8588\u8587\u856a\u858b\u84dd\u8536\u8539\u8593\u8597\u8567\u8594\u859d\u8533\u8587\u8599\u8597\u852b\u8539\u852c\u8581\u8536\u859b\u852b\u85a2\u857f\u8556\u8597\u8556\u85a2\u859e\u84e0\u8556\u8536\u8533\u84dc\u852e\u84e2\u859e\u84e2\u85a0\u8596\u8529\u8588\u859a\u857f\u859e\u857f\u8596\u857c\u8530\u8590\u852b\u8590\u8569\u8537\u8580\u8530\u8538\u8585\u8556\u8536\u8593\u853a\u84de\u8536\u8589\u853a\u8537\u8596\u857f\u8595\u858d\u8598\u84e1\u858c\u859c\u8534\u852b\u8597\u84e1\u853a\u856a\u852c\u8588\u857f\u857f\u8588\u8569\u859c\u84e0\u8536\u852e\u84db\u8538\u8585\u857e\u859d\u8590\u857c\u8536\u8581\u8539\u852d\u8588\u8581\u8590\u8594\u8587\u8538\u8529\u8587\u857e\u84db\u857f\u8589\u8588\u8593\u8528\u8581\u8538\u8588\u858b\u8598\u8569\u856a\u8599\u8595\u8594\u85a0\u8535\u8585\u8537\u857d\u8529\u8565\u859b\u8535\u859d\u8529\u84e2\u852c\u85a0\u859c\u857e\u8581\u8536\u84de\u8567\u8595\u8527\u8581\u85a2\u8581\u859e\u857f\u8530\u8533\u84df\u8581\u8538\u8597\u84de\u8524".toCharArray();
            for (int i2 = C[141]; i2 < C[142]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[143];
                n5 -= C[144];
                n5 ^= C[145];
                n5 ^= C[146];
                n5 ^= C[147];
                n5 -= C[148];
                n5 += C[149];
                n5 += C[150];
                n5 += C[151];
                n5 ^= C[152];
                cArray[i2] = (char)(n5 += C[153]);
            }
            object = MenuTopBarRenderer.A()[MenuTopBarRenderer.C[154]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)MenuTopBarRenderer.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[155];
        n6 += C[156];
        l6 = l17 ^ (0x4F00000000L ^ l17) & -1L << (n6 -= C[157]);
        long l18 = l13;
        int n7 = C[158];
        n7 ^= C[159];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[160]);
        while (true) {
            int n8 = C[161];
            n8 -= C[162];
            if ((int)l13 >= (int)(l6 >>> (n8 += C[163]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[164];
            n10 ^= C[165];
            int n11 = C[167];
            n11 += C[168];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[166])) & -1L >>> (n11 += C[169]);
            long l20 = l9;
            int n12 = C[170];
            n12 += C[171];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[172]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[173];
            n14 += C[174];
            int n15 = C[176];
            n15 ^= C[177];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[175])) & -1L >>> (n15 -= C[178]);
            int n16 = C[179];
            n16 += C[180];
            long l22 = l10;
            int n17 = C[182];
            n17 ^= C[183];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[181]) ^ l22) & -1L << (n17 += C[184]);
            int n18 = C[185];
            n18 -= C[186];
            n18 ^= C[187];
            int n19 = C[188];
            n19 ^= C[189];
            long l23 = l12;
            int n20 = C[191];
            n20 -= C[192];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[190]))) ^ l23) & -1L >>> (n20 ^= C[193]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[194];
            n21 ^= C[195];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[196]);
            while (true) {
                int n22 = C[197];
                n22 += C[198];
                if ((int)(l14 >>> (n22 += C[199])) >= (int)l12) break;
                int n23 = C[200];
                n23 -= C[201];
                int n24 = C[203];
                n24 -= C[204];
                cArray2[(int)(l14 >>> (n23 -= MenuTopBarRenderer.C[202]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[205]))];
                l14 += 0x100000000L;
            }
            int n25 = C[206];
            n25 += C[207];
            int n26 = (int)(l15 >>> (n25 -= C[208]));
            l15 += 0x100000000L;
            MenuTopBarRenderer.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[209];
            n27 += C[210];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= C[211]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[212]];
        String string = (String)object[C[213]];
        object = object[C[214]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[215]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[216]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[218] ^ C[219]];
                byArray[MenuTopBarRenderer.C[220] ^ MenuTopBarRenderer.C[221]] = C[222] ^ C[223];
                byArray[MenuTopBarRenderer.C[224] ^ MenuTopBarRenderer.C[225]] = C[226] ^ C[227];
                byArray[MenuTopBarRenderer.C[228] ^ MenuTopBarRenderer.C[229]] = C[230] ^ C[231];
                byArray[MenuTopBarRenderer.C[232] ^ MenuTopBarRenderer.C[233]] = C[234] ^ C[235];
                byArray[MenuTopBarRenderer.C[236] ^ MenuTopBarRenderer.C[237]] = C[238] ^ C[239];
                byArray[MenuTopBarRenderer.C[240] ^ MenuTopBarRenderer.C[241]] = C[242] ^ C[243];
                byArray[MenuTopBarRenderer.C[244] ^ MenuTopBarRenderer.C[245]] = C[246] ^ C[247];
                byArray[MenuTopBarRenderer.C[248] ^ MenuTopBarRenderer.C[249]] = C[250] ^ C[251];
                byArray[MenuTopBarRenderer.C[252] ^ MenuTopBarRenderer.C[253]] = C[254] ^ C[255];
                byArray[MenuTopBarRenderer.C[256] ^ MenuTopBarRenderer.C[257]] = C[258] ^ C[259];
                byArray[MenuTopBarRenderer.C[260] ^ MenuTopBarRenderer.C[261]] = C[262] ^ C[263];
                byArray[MenuTopBarRenderer.C[264] ^ MenuTopBarRenderer.C[265]] = C[266] ^ C[267];
                byArray[MenuTopBarRenderer.C[268] ^ MenuTopBarRenderer.C[269]] = C[270] ^ C[271];
                byArray[MenuTopBarRenderer.C[272] ^ MenuTopBarRenderer.C[273]] = C[274] ^ C[275];
                byArray[MenuTopBarRenderer.C[276] ^ MenuTopBarRenderer.C[277]] = C[278] ^ C[279];
                byArray[MenuTopBarRenderer.C[280] ^ MenuTopBarRenderer.C[281]] = C[282] ^ C[283];
                objectArray2[MenuTopBarRenderer.C[217]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[284]];
            if (b == null) {
                byte[] byArray2 = new byte[C[285] ^ C[286]];
                byArray2[MenuTopBarRenderer.C[287] ^ MenuTopBarRenderer.C[288]] = C[289] ^ C[290];
                byArray2[MenuTopBarRenderer.C[291] ^ MenuTopBarRenderer.C[292]] = C[293] ^ C[294];
                byArray2[MenuTopBarRenderer.C[295] ^ MenuTopBarRenderer.C[296]] = C[297] ^ C[298];
                byArray2[MenuTopBarRenderer.C[299] ^ MenuTopBarRenderer.C[300]] = C[301] ^ C[302];
                byArray2[MenuTopBarRenderer.C[303] ^ MenuTopBarRenderer.C[304]] = C[305] ^ C[306];
                byArray2[MenuTopBarRenderer.C[307] ^ MenuTopBarRenderer.C[308]] = C[309] ^ C[310];
                byArray2[MenuTopBarRenderer.C[311] ^ MenuTopBarRenderer.C[312]] = C[313] ^ C[314];
                byArray2[MenuTopBarRenderer.C[315] ^ MenuTopBarRenderer.C[316]] = C[317] ^ C[318];
                byArray2[MenuTopBarRenderer.C[319] ^ MenuTopBarRenderer.C[320]] = C[321] ^ C[322];
                byArray2[MenuTopBarRenderer.C[323] ^ MenuTopBarRenderer.C[324]] = C[325] ^ C[326];
                byArray2[MenuTopBarRenderer.C[327] ^ MenuTopBarRenderer.C[328]] = C[329] ^ C[330];
                byArray2[MenuTopBarRenderer.C[331] ^ MenuTopBarRenderer.C[332]] = C[333] ^ C[334];
                byArray2[MenuTopBarRenderer.C[335] ^ MenuTopBarRenderer.C[336]] = C[337] ^ C[338];
                byArray2[MenuTopBarRenderer.C[339] ^ MenuTopBarRenderer.C[340]] = C[341] ^ C[342];
                byArray2[MenuTopBarRenderer.C[343] ^ MenuTopBarRenderer.C[344]] = C[345] ^ C[346];
                byArray2[MenuTopBarRenderer.C[347] ^ MenuTopBarRenderer.C[348]] = C[349] ^ C[350];
                byArray2[MenuTopBarRenderer.C[351] ^ MenuTopBarRenderer.C[352]] = C[353] ^ C[354];
                byArray2[MenuTopBarRenderer.C[355] ^ MenuTopBarRenderer.C[356]] = C[357] ^ C[358];
                byArray2[MenuTopBarRenderer.C[359] ^ MenuTopBarRenderer.C[360]] = C[361] ^ C[362];
                byArray2[MenuTopBarRenderer.C[363] ^ MenuTopBarRenderer.C[364]] = C[365] ^ C[366];
                byArray2[MenuTopBarRenderer.C[367] ^ MenuTopBarRenderer.C[368]] = C[369] ^ C[370];
                byArray2[MenuTopBarRenderer.C[371] ^ MenuTopBarRenderer.C[372]] = C[373] ^ C[374];
                byArray2[MenuTopBarRenderer.C[375] ^ MenuTopBarRenderer.C[376]] = C[377] ^ C[378];
                byArray2[MenuTopBarRenderer.C[379] ^ MenuTopBarRenderer.C[380]] = C[381] ^ C[382];
                byArray2[MenuTopBarRenderer.C[383] ^ MenuTopBarRenderer.C[384]] = C[385] ^ C[386];
                byArray2[MenuTopBarRenderer.C[387] ^ MenuTopBarRenderer.C[388]] = C[389] ^ C[390];
                byArray2[MenuTopBarRenderer.C[391] ^ MenuTopBarRenderer.C[392]] = C[393] ^ C[394];
                byArray2[MenuTopBarRenderer.C[395] ^ MenuTopBarRenderer.C[396]] = C[397] ^ C[398];
                byArray2[MenuTopBarRenderer.C[399] ^ 0xB545] = 0xFFFF4AD7 ^ 0xB545;
                byArray2[0xF768 ^ 0xF774] = 0xF76A ^ 0xF774;
                byArray2[0x593D ^ 0x592E] = 0xFFFFA6D2 ^ 0x592E;
                byArray2[0xA7BB ^ 0xA7B1] = 0xA7B3 ^ 0xA7B1;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = MenuTopBarRenderer.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u3a4d\u3a67\u3a52\u3a69\u3a63\u3a77\u3a96\u3a70\u3ab9\u3a85\u3a65\u3a6c\u3a88\u3a8a\u3a9a\u3a65\u3a68\u3a78".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 7093;
                        n3 ^= 0x977;
                        n3 += 5352;
                        n3 ^= 0xB449;
                        n3 ^= 0xA72B;
                        n3 += 49099;
                        n3 += 38971;
                        n3 -= 5245;
                        n3 -= 23469;
                        n3 -= 37933;
                        cArray[i2] = (char)(n3 -= 47774);
                    }
                    object4 = MenuTopBarRenderer.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[15] = -127;
                byArray4[6] = -97;
                byArray4[7] = 32;
                byArray4[12] = -104;
                byArray4[3] = -66;
                byArray4[8] = 56;
                byArray4[11] = -16;
                byArray4[1] = -15;
                byArray4[5] = 126;
                byArray4[14] = -46;
                byArray4[4] = 110;
                byArray4[9] = 107;
                byArray4[2] = -88;
                byArray4[10] = -29;
                byArray4[0] = 48;
                byArray4[13] = 105;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 10, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = MenuTopBarRenderer.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u27ef\u292b\u2939".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 37600;
                        n4 += 57088;
                        n4 += 9858;
                        n4 -= 3110;
                        n4 ^= 0x1F4D;
                        n4 += 17647;
                        n4 -= 37910;
                        n4 ^= 0x69A;
                        n4 ^= 0xF8FB;
                        n4 += 30811;
                        n4 -= 28955;
                        n4 -= 65020;
                        cArray[i3] = (char)(n4 += 14175);
                    }
                    object5 = MenuTopBarRenderer.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = MenuTopBarRenderer.A()[3];
            if (object6 == null) {
                char[] cArray = "\u23e5\u23f1\u23f7\u239b\u23e7\u23e6\u23e7\u239b\u23f4\u23ef\u23e7\u23f7\u23e1\u23f4\u23c5\u23d0\u23d0\u23cd\u23da\u23d3".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xB5C3;
                    n5 ^= 0xDF23;
                    n5 += 52100;
                    n5 ^= 0x2AC4;
                    n5 -= 64393;
                    n5 += 940;
                    n5 -= 58862;
                    n5 -= 52305;
                    n5 -= 29873;
                    n5 -= 42705;
                    n5 += 5267;
                    n5 += 37656;
                    cArray[i4] = (char)(n5 -= 8217);
                }
                object6 = MenuTopBarRenderer.A()[3] = new String(cArray);
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
        C = new int[0xC528 ^ 0xC4B8];
        MenuTopBarRenderer.C[0xAEFF ^ 0xAE5D] = 0xFFFF51F7 ^ 0xAE5D;
        MenuTopBarRenderer.C[0xDA4C ^ 0xDA0A] = 0xDA2B ^ 0xDA0A;
        MenuTopBarRenderer.C[0xDBE0 ^ 0xDB16] = 0xFFFF90B9 ^ 0xDB16;
        MenuTopBarRenderer.C[0xB6A6 ^ 0xB698] = 0xB6A1 ^ 0xB698;
        MenuTopBarRenderer.C[0xD924 ^ 0xD997] = 0xFFFF26DE ^ 0xD997;
        MenuTopBarRenderer.C[0x5E77 ^ 0x5E64] = 0x5E77 ^ 0x5E64;
        MenuTopBarRenderer.C[0xA43E ^ 0xA465] = 0xA417 ^ 0xA465;
        MenuTopBarRenderer.C[0xBC83 ^ 0xBCD0] = 0xBCCB ^ 0xBCD0;
        MenuTopBarRenderer.C[0x2579 ^ 0x255C] = 0xFFFFDAC1 ^ 0x255C;
        MenuTopBarRenderer.C[0x533F ^ 0x525D] = 0xF3B3 ^ 0x525D;
        MenuTopBarRenderer.C[0x7EF5 ^ 0x7E42] = 0xFFFF81BF ^ 0x7E42;
        MenuTopBarRenderer.C[0xF2A2 ^ 0xF2BB] = 0xFFFF0D74 ^ 0xF2BB;
        MenuTopBarRenderer.C[0xA71A ^ 0xA72D] = 0xA75D ^ 0xA72D;
        MenuTopBarRenderer.C[0xC01B ^ 0xC15F] = 0x16AA ^ 0xC15F;
        MenuTopBarRenderer.C[0xB366 ^ 0xB3F7] = 0x7431 ^ 0xB3F7;
        MenuTopBarRenderer.C[0xA637 ^ 0xA632] = 0xA679 ^ 0xA632;
        MenuTopBarRenderer.C[0x4A55 ^ 0x4AC3] = 0x50BF ^ 0x4AC3;
        MenuTopBarRenderer.C[0x985C ^ 0x9972] = 0x7794 ^ 0x9972;
        MenuTopBarRenderer.C[0x2F8C ^ 0x2E09] = 0xFFFF346D ^ 0x2E09;
        MenuTopBarRenderer.C[0xF0B5 ^ 0xF001] = 0xF07B ^ 0xF001;
        MenuTopBarRenderer.C[0x56E7 ^ 0x569D] = 0xFFFFA949 ^ 0x569D;
        MenuTopBarRenderer.C[0x8CD9 ^ 0x8CD9] = 0xFFFF7301 ^ 0x8CD9;
        MenuTopBarRenderer.C[0x1D55 ^ 0x1C16] = 0xCBE3 ^ 0x1C16;
        MenuTopBarRenderer.C[0xE53 ^ 0xEDC] = 0x11DD ^ 0xEDC;
        MenuTopBarRenderer.C[0xF540 ^ 0xF563] = 0xFFFF0ABA ^ 0xF563;
        MenuTopBarRenderer.C[0x7BC8 ^ 0x7AEF] = 0xC42 ^ 0x7AEF;
        MenuTopBarRenderer.C[0x98A5 ^ 0x98EB] = 0x987C ^ 0x98EB;
        MenuTopBarRenderer.C[0xC1C ^ 0xD7C] = 0xAC92 ^ 0xD7C;
        MenuTopBarRenderer.C[0xAE35 ^ 0xAF7C] = 0x56C0 ^ 0xAF7C;
        MenuTopBarRenderer.C[0x1D78 ^ 0x1D14] = 0xFFFFE280 ^ 0x1D14;
        MenuTopBarRenderer.C[0xC4D2 ^ 0xC434] = 0x1241 ^ 0xC434;
        MenuTopBarRenderer.C[0x197 ^ 0x1AE] = 0xFFFFFE6F ^ 0x1AE;
        MenuTopBarRenderer.C[0x2E26 ^ 0x2F17] = 0xFFFF4218 ^ 0x2F17;
        MenuTopBarRenderer.C[0x5AAD ^ 0x5A0D] = 0x5A6A ^ 0x5A0D;
        MenuTopBarRenderer.C[0xC4D0 ^ 0xC5B4] = 0x6E58 ^ 0xC5B4;
        MenuTopBarRenderer.C[0x6DB8 ^ 0x6DE2] = 0x6D8B ^ 0x6DE2;
        MenuTopBarRenderer.C[0xD3D ^ 0xC73] = 0x8377 ^ 0xC73;
        MenuTopBarRenderer.C[0x8B12 ^ 0x8B09] = 0xFFFF7489 ^ 0x8B09;
        MenuTopBarRenderer.C[0x7796 ^ 0x76FC] = 0x7605 ^ 0x76FC;
        MenuTopBarRenderer.C[0xCB3A ^ 0xCBB6] = 0xCBB6 ^ 0xCBB6;
        MenuTopBarRenderer.C[0x1F70 ^ 0x1E3A] = 0xE7C6 ^ 0x1E3A;
        MenuTopBarRenderer.C[0x101D3 ^ 0x1008B] = 0x13C0F ^ 0x1008B;
        MenuTopBarRenderer.C[0x48C1 ^ 0x48CE] = 0x48A6 ^ 0x48CE;
        MenuTopBarRenderer.C[0xECC9 ^ 0xED9F] = 0x3C07 ^ 0xED9F;
        MenuTopBarRenderer.C[0x375F ^ 0x3638] = 0x36D0 ^ 0x3638;
        MenuTopBarRenderer.C[0xA528 ^ 0xA532] = 0xA572 ^ 0xA532;
        MenuTopBarRenderer.C[0xD3C0 ^ 0xD355] = 0x8B0E ^ 0xD355;
        MenuTopBarRenderer.C[0x106B6 ^ 0x1078B] = 0x1BF53 ^ 0x1078B;
        MenuTopBarRenderer.C[0xFA2E ^ 0xFAB6] = 0xE9AB ^ 0xFAB6;
        MenuTopBarRenderer.C[0xFB11 ^ 0xFB75] = 0xFB33 ^ 0xFB75;
        MenuTopBarRenderer.C[0xF0E0 ^ 0xF022] = 0xF01C ^ 0xF022;
        MenuTopBarRenderer.C[0xF575 ^ 0xF5B3] = 0xFFFF0A0B ^ 0xF5B3;
        MenuTopBarRenderer.C[0x490 ^ 0x47F] = 0x6051 ^ 0x47F;
        MenuTopBarRenderer.C[0xDE15 ^ 0xDEB8] = 0xFFFF2154 ^ 0xDEB8;
        MenuTopBarRenderer.C[0x4F33 ^ 0x4FCC] = 0x14DC2 ^ 0x4FCC;
        MenuTopBarRenderer.C[0xE00E ^ 0xE08D] = 0xE099 ^ 0xE08D;
        MenuTopBarRenderer.C[0xA03D ^ 0xA079] = 0xA017 ^ 0xA079;
        MenuTopBarRenderer.C[0xFB12 ^ 0xFA1C] = 0xFFFF6D59 ^ 0xFA1C;
        MenuTopBarRenderer.C[0xB98D ^ 0xB91E] = 0xA334 ^ 0xB91E;
        MenuTopBarRenderer.C[0xC715 ^ 0xC773] = 0xFFFF3B42 ^ 0xC773;
        MenuTopBarRenderer.C[0x9D4D ^ 0x9DCD] = 0xFFFF6268 ^ 0x9DCD;
        MenuTopBarRenderer.C[0x8EB7 ^ 0x8FF8] = 0x7747 ^ 0x8FF8;
        MenuTopBarRenderer.C[0xC909 ^ 0xC96C] = 0xFFFF36A8 ^ 0xC96C;
        MenuTopBarRenderer.C[0x9E5D ^ 0x9E82] = 0x6751 ^ 0x9E82;
        MenuTopBarRenderer.C[0x4A77 ^ 0x4B69] = 0x8C2A ^ 0x4B69;
        MenuTopBarRenderer.C[0xE038 ^ 0xE108] = 0x73C5 ^ 0xE108;
        MenuTopBarRenderer.C[0x6150 ^ 0x6161] = 0xFFFF9EF6 ^ 0x6161;
        MenuTopBarRenderer.C[0xA7F2 ^ 0xA79B] = 0xFFFF5810 ^ 0xA79B;
        MenuTopBarRenderer.C[0xD007 ^ 0xD064] = 0xD06E ^ 0xD064;
        MenuTopBarRenderer.C[0x105B2 ^ 0x105ED] = 0x105B2 ^ 0x105ED;
        MenuTopBarRenderer.C[0xA2AF ^ 0xA3D6] = 0xFFFF872C ^ 0xA3D6;
        MenuTopBarRenderer.C[0x3D7D ^ 0x3C3B] = 0xEBCE ^ 0x3C3B;
        MenuTopBarRenderer.C[0x8E17 ^ 0x8F63] = 0x792B ^ 0x8F63;
        MenuTopBarRenderer.C[0xC65A ^ 0xC646] = 0xFFFF398F ^ 0xC646;
        MenuTopBarRenderer.C[0xD631 ^ 0xD6FA] = 0xD6E5 ^ 0xD6FA;
        MenuTopBarRenderer.C[0x4761 ^ 0x479D] = 0x14593 ^ 0x479D;
        MenuTopBarRenderer.C[0x853F ^ 0x8599] = 0x85BA ^ 0x8599;
        MenuTopBarRenderer.C[0xDF58 ^ 0xDFA3] = 0x450B ^ 0xDFA3;
        MenuTopBarRenderer.C[0x5050 ^ 0x51DD] = 0x1587D ^ 0x51DD;
        MenuTopBarRenderer.C[0x9C04 ^ 0x9C1C] = 0x9FCD ^ 0x9C1C;
        MenuTopBarRenderer.C[0x68E3 ^ 0x69E8] = 0xC598 ^ 0x69E8;
        MenuTopBarRenderer.C[0xDDCE ^ 0xDC47] = 0xE649 ^ 0xDC47;
        MenuTopBarRenderer.C[0x3DA2 ^ 0x3D43] = 0x9452 ^ 0x3D43;
        MenuTopBarRenderer.C[0xF638 ^ 0xF6B3] = 0xF6B1 ^ 0xF6B3;
        MenuTopBarRenderer.C[0x33D7 ^ 0x32AA] = 0xEB62 ^ 0x32AA;
        MenuTopBarRenderer.C[0x8F1E ^ 0x8F5F] = 0xFFFF70A8 ^ 0x8F5F;
        MenuTopBarRenderer.C[0x4DCF ^ 0x4D03] = 0x4D64 ^ 0x4D03;
        MenuTopBarRenderer.C[0xC53 ^ 0xC5F] = 0xFFFFF3B4 ^ 0xC5F;
        MenuTopBarRenderer.C[0xD58A ^ 0xD58B] = 0xFFFF2A70 ^ 0xD58B;
        MenuTopBarRenderer.C[0x71DB ^ 0x70C7] = 0x70C7 ^ 0x70C7;
        MenuTopBarRenderer.C[0xE7C ^ 0xE37] = 0xFFFFF1E5 ^ 0xE37;
        MenuTopBarRenderer.C[0xCE09 ^ 0xCF64] = 0xB024 ^ 0xCF64;
        MenuTopBarRenderer.C[0xD11F ^ 0xD1A6] = 0xD1A1 ^ 0xD1A6;
        MenuTopBarRenderer.C[0x8D21 ^ 0x8C36] = 0xF0E5 ^ 0x8C36;
        MenuTopBarRenderer.C[0xF8FF ^ 0xF8A7] = 0xFFFF0741 ^ 0xF8A7;
        MenuTopBarRenderer.C[0xD596 ^ 0xD4C6] = 0x2C69 ^ 0xD4C6;
        MenuTopBarRenderer.C[0x10537 ^ 0x10594] = 0x105EE ^ 0x10594;
        MenuTopBarRenderer.C[0x21B9 ^ 0x2176] = 0xFFFFDE82 ^ 0x2176;
        MenuTopBarRenderer.C[0x23F0 ^ 0x23F7] = 0xFFFFDC5F ^ 0x23F7;
        MenuTopBarRenderer.C[0x3EEA ^ 0x3E50] = 0x3E67 ^ 0x3E50;
        MenuTopBarRenderer.C[0x40D4 ^ 0x40C3] = 0xFFFFBF0A ^ 0x40C3;
        MenuTopBarRenderer.C[0xE0E7 ^ 0xE184] = 0x4A70 ^ 0xE184;
        MenuTopBarRenderer.C[0x6C1C ^ 0x6C7E] = 0xFFFF93EC ^ 0x6C7E;
        MenuTopBarRenderer.C[0x105CC ^ 0x1053F] = 0x13536 ^ 0x1053F;
        MenuTopBarRenderer.C[0xCFFA ^ 0xCF83] = 0xFFFF301B ^ 0xCF83;
        MenuTopBarRenderer.C[0x10E36 ^ 0x10F23] = 0x173F0 ^ 0x10F23;
        MenuTopBarRenderer.C[0xF847 ^ 0xF913] = 0x288B ^ 0xF913;
        MenuTopBarRenderer.C[0x520C ^ 0x526C] = 0xFFFFAD9A ^ 0x526C;
        MenuTopBarRenderer.C[0x6975 ^ 0x6803] = 0x9E4B ^ 0x6803;
        MenuTopBarRenderer.C[0x7D64 ^ 0x7C3E] = 0x40BA ^ 0x7C3E;
        MenuTopBarRenderer.C[0x4FDF ^ 0x4F9F] = 0x4FFC ^ 0x4F9F;
        MenuTopBarRenderer.C[0x660C ^ 0x6755] = 0xFFFFA45C ^ 0x6755;
        MenuTopBarRenderer.C[0xAEC8 ^ 0xAE9A] = 0xFFFF511F ^ 0xAE9A;
        MenuTopBarRenderer.C[0xF20D ^ 0xF361] = 0x8C50 ^ 0xF361;
        MenuTopBarRenderer.C[0x1815 ^ 0x1897] = 0xFFFFE729 ^ 0x1897;
        MenuTopBarRenderer.C[0xC3C6 ^ 0xC2A9] = 0x2E1A ^ 0xC2A9;
        MenuTopBarRenderer.C[0x4BF1 ^ 0x4BDD] = 0x4BE2 ^ 0x4BDD;
        MenuTopBarRenderer.C[0x10154 ^ 0x101E8] = 0x101B5 ^ 0x101E8;
        MenuTopBarRenderer.C[0x9CE6 ^ 0x9C3D] = 0x4AB8 ^ 0x9C3D;
        MenuTopBarRenderer.C[0xF3A5 ^ 0xF354] = 0xC35D ^ 0xF354;
        MenuTopBarRenderer.C[0xB6A9 ^ 0xB63E] = 0x4E02 ^ 0xB63E;
        MenuTopBarRenderer.C[0x10968 ^ 0x10935] = 0x109B3 ^ 0x10935;
        MenuTopBarRenderer.C[0x992B ^ 0x98AA] = 0xFFFFE28D ^ 0x98AA;
        MenuTopBarRenderer.C[0x51A4 ^ 0x51A2] = 0xFFFFAE24 ^ 0x51A2;
        MenuTopBarRenderer.C[0xBFF2 ^ 0xBF20] = 0xFFFF408A ^ 0xBF20;
        MenuTopBarRenderer.C[0x7C60 ^ 0x7C2C] = 0x7C6F ^ 0x7C2C;
        MenuTopBarRenderer.C[0x2878 ^ 0x2933] = 0xA635 ^ 0x2933;
        MenuTopBarRenderer.C[0x8E75 ^ 0x8EB1] = 0x8E98 ^ 0x8EB1;
        MenuTopBarRenderer.C[0x104F9 ^ 0x104A0] = 0xFFFEFB34 ^ 0x104A0;
        MenuTopBarRenderer.C[0x3D3 ^ 0x2BD] = 0x7D8C ^ 0x2BD;
        MenuTopBarRenderer.C[0x892B ^ 0x8985] = 0x89B4 ^ 0x8985;
        MenuTopBarRenderer.C[0x5C9F ^ 0x5C51] = 0x5C0A ^ 0x5C51;
        MenuTopBarRenderer.C[0x947E ^ 0x947A] = 0x942D ^ 0x947A;
        MenuTopBarRenderer.C[0xD3FC ^ 0xD375] = 0xD374 ^ 0xD375;
        MenuTopBarRenderer.C[0xDFD ^ 0xD61] = 0xD6B ^ 0xD61;
        MenuTopBarRenderer.C[0x6067 ^ 0x60A0] = 0x60BB ^ 0x60A0;
        MenuTopBarRenderer.C[0x9D98 ^ 0x9D74] = 0xF957 ^ 0x9D74;
        MenuTopBarRenderer.C[0x10084 ^ 0x101E5] = 0xFFFE5F85 ^ 0x101E5;
        MenuTopBarRenderer.C[0x448E ^ 0x450D] = 0xA0F1 ^ 0x450D;
        MenuTopBarRenderer.C[0x84B4 ^ 0x8499] = 0x8497 ^ 0x8499;
        MenuTopBarRenderer.C[0x8E1C ^ 0x8F35] = 0xF98A ^ 0x8F35;
        MenuTopBarRenderer.C[0x3CC3 ^ 0x3C1A] = 0x3C1A ^ 0x3C1A;
        MenuTopBarRenderer.C[0xD647 ^ 0xD66D] = 0xD669 ^ 0xD66D;
        MenuTopBarRenderer.C[0x6030 ^ 0x609A] = 0x60A3 ^ 0x609A;
        MenuTopBarRenderer.C[0x9563 ^ 0x9518] = 0x953E ^ 0x9518;
        MenuTopBarRenderer.C[0x66C ^ 0x73B] = 0x3BA6 ^ 0x73B;
        MenuTopBarRenderer.C[0xE028 ^ 0xE0DD] = 0x5485 ^ 0xE0DD;
        MenuTopBarRenderer.C[0x63BD ^ 0x62BB] = 0xCC5D ^ 0x62BB;
        MenuTopBarRenderer.C[0x3BF6 ^ 0x3B3B] = 0xFFFFC4A3 ^ 0x3B3B;
        MenuTopBarRenderer.C[0xCA91 ^ 0xCAEC] = 0xFFFF3518 ^ 0xCAEC;
        MenuTopBarRenderer.C[0x9CEA ^ 0x9DAA] = 0x1995D ^ 0x9DAA;
        MenuTopBarRenderer.C[0x10427 ^ 0x10451] = 0xFFFEFBB5 ^ 0x10451;
        MenuTopBarRenderer.C[0x791D ^ 0x782F] = 0xEAE2 ^ 0x782F;
        MenuTopBarRenderer.C[0xCBB1 ^ 0xCB65] = 0xCB64 ^ 0xCB65;
        MenuTopBarRenderer.C[0xF018 ^ 0xF023] = 0xF039 ^ 0xF023;
        MenuTopBarRenderer.C[0x1745 ^ 0x163A] = 0x939C ^ 0x163A;
        MenuTopBarRenderer.C[0xDFE9 ^ 0xDF3E] = 0xDF3F ^ 0xDF3E;
        MenuTopBarRenderer.C[0x8C75 ^ 0x8D78] = 0xE5D1 ^ 0x8D78;
        MenuTopBarRenderer.C[0x35DC ^ 0x3504] = 0x3505 ^ 0x3504;
        MenuTopBarRenderer.C[0xC6CE ^ 0xC7B2] = 0x1E4F ^ 0xC7B2;
        MenuTopBarRenderer.C[0x95A1 ^ 0x94A1] = 0x705D ^ 0x94A1;
        MenuTopBarRenderer.C[0x7565 ^ 0x751A] = 0x7512 ^ 0x751A;
        MenuTopBarRenderer.C[0x3442 ^ 0x3415] = 0xFFFFCB8F ^ 0x3415;
        MenuTopBarRenderer.C[0xAB97 ^ 0xAA1C] = 0x1A3B8 ^ 0xAA1C;
        MenuTopBarRenderer.C[0x64EF ^ 0x65F4] = 0x819A ^ 0x65F4;
        MenuTopBarRenderer.C[0x10B22 ^ 0x10A4B] = 0xFFFEF547 ^ 0x10A4B;
        MenuTopBarRenderer.C[0xAD0F ^ 0xADC5] = 0xADBE ^ 0xADC5;
        MenuTopBarRenderer.C[0xE3CC ^ 0xE3BD] = 0xE391 ^ 0xE3BD;
        MenuTopBarRenderer.C[0x7646 ^ 0x7747] = 0x93BA ^ 0x7747;
        MenuTopBarRenderer.C[0xACC0 ^ 0xAC28] = 0xF169 ^ 0xAC28;
        MenuTopBarRenderer.C[0x5821 ^ 0x5819] = 0xFFFFA7F5 ^ 0x5819;
        MenuTopBarRenderer.C[0x5F33 ^ 0x5F94] = 0x5F12 ^ 0x5F94;
        MenuTopBarRenderer.C[0xE78D ^ 0xE799] = 0xFFFF183C ^ 0xE799;
        MenuTopBarRenderer.C[0x9DCB ^ 0x9C89] = 0x1987E ^ 0x9C89;
        MenuTopBarRenderer.C[0x8DE3 ^ 0x8D35] = 0x8D35 ^ 0x8D35;
        MenuTopBarRenderer.C[0xB26B ^ 0xB3EC] = 0x8998 ^ 0xB3EC;
        MenuTopBarRenderer.C[0x3255 ^ 0x330E] = 0xCF96 ^ 0x330E;
        MenuTopBarRenderer.C[0x5D02 ^ 0x5C45] = 0xA5AE ^ 0x5C45;
        MenuTopBarRenderer.C[0x56EA ^ 0x5762] = 0x6D09 ^ 0x5762;
        MenuTopBarRenderer.C[0x20D8 ^ 0x21AF] = 0xFAC7 ^ 0x21AF;
        MenuTopBarRenderer.C[0x10211 ^ 0x10318] = 0x1AF68 ^ 0x10318;
        MenuTopBarRenderer.C[0x2FCB ^ 0x2EFC] = 0xFE3C ^ 0x2EFC;
        MenuTopBarRenderer.C[0x5DC ^ 0x50F] = 0x509 ^ 0x50F;
        MenuTopBarRenderer.C[0x5062 ^ 0x50EA] = 0x50EA ^ 0x50EA;
        MenuTopBarRenderer.C[0x87ED ^ 0x872D] = 0xFFFF78A7 ^ 0x872D;
        MenuTopBarRenderer.C[0x2F91 ^ 0x2F9B] = 0x2FFA ^ 0x2F9B;
        MenuTopBarRenderer.C[0x18C8 ^ 0x19ED] = 0xFFFF842E ^ 0x19ED;
        MenuTopBarRenderer.C[0x4FF9 ^ 0x4F8E] = 0xFFFFB02C ^ 0x4F8E;
        MenuTopBarRenderer.C[0x9C84 ^ 0x9DC1] = 0xFFFFB5F7 ^ 0x9DC1;
        MenuTopBarRenderer.C[0x3573 ^ 0x3467] = 0x48BA ^ 0x3467;
        MenuTopBarRenderer.C[0xBA0D ^ 0xBABB] = 0xBAA1 ^ 0xBABB;
        MenuTopBarRenderer.C[0x8DD ^ 0x9D5] = 0xA5A1 ^ 0x9D5;
        MenuTopBarRenderer.C[0xDED1 ^ 0xDFFC] = 0x3117 ^ 0xDFFC;
        MenuTopBarRenderer.C[0x8A62 ^ 0x8A54] = 0x8A30 ^ 0x8A54;
        MenuTopBarRenderer.C[0xB603 ^ 0xB63E] = 0xB61B ^ 0xB63E;
        MenuTopBarRenderer.C[0xA02B ^ 0xA005] = 0xFFFF5FE0 ^ 0xA005;
        MenuTopBarRenderer.C[0xFC5F ^ 0xFDD9] = 0x1823 ^ 0xFDD9;
        MenuTopBarRenderer.C[0xF7F1 ^ 0xF782] = 0xFFFF082A ^ 0xF782;
        MenuTopBarRenderer.C[0xD5FF ^ 0xD50B] = 0x6155 ^ 0xD50B;
        MenuTopBarRenderer.C[0xC635 ^ 0xC6AE] = 0xC6A7 ^ 0xC6AE;
        MenuTopBarRenderer.C[0xCAC3 ^ 0xCA71] = 0xFFFF35F8 ^ 0xCA71;
        MenuTopBarRenderer.C[0x4033 ^ 0x4079] = 0xFFFFBFA4 ^ 0x4079;
        MenuTopBarRenderer.C[0xE28 ^ 0xE18] = 0xFFFFF17E ^ 0xE18;
        MenuTopBarRenderer.C[0x1563 ^ 0x145B] = 0xC48D ^ 0x145B;
        MenuTopBarRenderer.C[0xF3CD ^ 0xF3BF] = 0xFFFF0C42 ^ 0xF3BF;
        MenuTopBarRenderer.C[0x8FAA ^ 0x8FDF] = 0xFFFF7045 ^ 0x8FDF;
        MenuTopBarRenderer.C[0x95E2 ^ 0x9588] = 0x95CD ^ 0x9588;
        MenuTopBarRenderer.C[0x10933 ^ 0x109D7] = 0x1DFF0 ^ 0x109D7;
        MenuTopBarRenderer.C[0x96BE ^ 0x97CD] = 0x618D ^ 0x97CD;
        MenuTopBarRenderer.C[0x10BA2 ^ 0x10A9C] = 0x1B215 ^ 0x10A9C;
        MenuTopBarRenderer.C[0xA3E1 ^ 0xA3DB] = 0xFFFF5C04 ^ 0xA3DB;
        MenuTopBarRenderer.C[0x900A ^ 0x904F] = 0xFFFF6BA8 ^ 0x904F;
        MenuTopBarRenderer.C[0x748F ^ 0x74FB] = 0xFFFF8B7E ^ 0x74FB;
        MenuTopBarRenderer.C[0x9054 ^ 0x90D1] = 0xFFFF6F57 ^ 0x90D1;
        MenuTopBarRenderer.C[0x2569 ^ 0x2508] = 0xFFFFDA94 ^ 0x2508;
        MenuTopBarRenderer.C[0x5749 ^ 0x5621] = 0x56D8 ^ 0x5621;
        MenuTopBarRenderer.C[0xA010 ^ 0xA132] = 0x9A84 ^ 0xA132;
        MenuTopBarRenderer.C[0x4714 ^ 0x47C1] = 0x47C3 ^ 0x47C1;
        MenuTopBarRenderer.C[0x80A3 ^ 0x812F] = 0x18888 ^ 0x812F;
        MenuTopBarRenderer.C[0x102FB ^ 0x10219] = 0x1AB67 ^ 0x10219;
        MenuTopBarRenderer.C[0x3A4A ^ 0x3ACE] = 0x3A85 ^ 0x3ACE;
        MenuTopBarRenderer.C[0x4885 ^ 0x48D4] = 0x48B4 ^ 0x48D4;
        MenuTopBarRenderer.C[0xE4F9 ^ 0xE5C2] = 0x5D5E ^ 0xE5C2;
        MenuTopBarRenderer.C[0xC0AC ^ 0xC1A9] = 0x6F73 ^ 0xC1A9;
        MenuTopBarRenderer.C[0x1D18 ^ 0x1DFB] = 0xB4EA ^ 0x1DFB;
        MenuTopBarRenderer.C[0x7DD ^ 0x775] = 0xFFFFF8AF ^ 0x775;
        MenuTopBarRenderer.C[0xE1E0 ^ 0xE123] = 0xE114 ^ 0xE123;
        MenuTopBarRenderer.C[0xD279 ^ 0xD35A] = 0xB13F ^ 0xD35A;
        MenuTopBarRenderer.C[0x5760 ^ 0x57BD] = 0xAE6E ^ 0x57BD;
        MenuTopBarRenderer.C[0x49C0 ^ 0x489C] = 0xB41E ^ 0x489C;
        MenuTopBarRenderer.C[0x2D01 ^ 0x2D13] = 0x2E8B ^ 0x2D13;
        MenuTopBarRenderer.C[0x4151 ^ 0x4129] = 0x4112 ^ 0x4129;
        MenuTopBarRenderer.C[0xA1E6 ^ 0xA136] = 0xA119 ^ 0xA136;
        MenuTopBarRenderer.C[0x1C86 ^ 0x1DE3] = 0xB611 ^ 0x1DE3;
        MenuTopBarRenderer.C[0x29D3 ^ 0x2859] = 0x1232 ^ 0x2859;
        MenuTopBarRenderer.C[0xD6D1 ^ 0xD7CC] = 0x10AF ^ 0xD7CC;
        MenuTopBarRenderer.C[0x1231 ^ 0x12E0] = 0x129C ^ 0x12E0;
        MenuTopBarRenderer.C[0xEB02 ^ 0xEB6F] = 0xEB6D ^ 0xEB6F;
        MenuTopBarRenderer.C[0x9988 ^ 0x9976] = 0x19B60 ^ 0x9976;
        MenuTopBarRenderer.C[0xAD88 ^ 0xAC91] = 0x48FF ^ 0xAC91;
        MenuTopBarRenderer.C[0xEC26 ^ 0xEC28] = 0xFFFF13C2 ^ 0xEC28;
        MenuTopBarRenderer.C[0x509A ^ 0x519E] = 0xFF4B ^ 0x519E;
        MenuTopBarRenderer.C[0x6C2E ^ 0x6CA3] = 0x6CA3 ^ 0x6CA3;
        MenuTopBarRenderer.C[0xAFD7 ^ 0xAF59] = 0xAFF5 ^ 0xAF59;
        MenuTopBarRenderer.C[0x7E0B ^ 0x7ED7] = 0x870E ^ 0x7ED7;
        MenuTopBarRenderer.C[0x10A24 ^ 0x10A6C] = 0x10A7A ^ 0x10A6C;
        MenuTopBarRenderer.C[0xE096 ^ 0xE0BD] = 0xE08F ^ 0xE0BD;
        MenuTopBarRenderer.C[0xBB7E ^ 0xBB84] = 0x2154 ^ 0xBB84;
        MenuTopBarRenderer.C[0xF798 ^ 0xF7DA] = 0xFFFF08C2 ^ 0xF7DA;
        MenuTopBarRenderer.C[0xF1D2 ^ 0xF16F] = 0xFFFF0EC7 ^ 0xF16F;
        MenuTopBarRenderer.C[0xC9D2 ^ 0xC96A] = 0xC953 ^ 0xC96A;
        MenuTopBarRenderer.C[0xD84F ^ 0xD948] = 0x7792 ^ 0xD948;
        MenuTopBarRenderer.C[0x2BEA ^ 0x2ADC] = 0x3149 ^ 0x2ADC;
        MenuTopBarRenderer.C[0x39B3 ^ 0x38FF] = 0xB7FB ^ 0x38FF;
        MenuTopBarRenderer.C[0xC185 ^ 0xC0F5] = 0x2C48 ^ 0xC0F5;
        MenuTopBarRenderer.C[0x3E7A ^ 0x3F0F] = 0xFFFF36D5 ^ 0x3F0F;
        MenuTopBarRenderer.C[0x99F6 ^ 0x991C] = 0xC422 ^ 0x991C;
        MenuTopBarRenderer.C[0xDA1B ^ 0xDA04] = 0xDA47 ^ 0xDA04;
        MenuTopBarRenderer.C[0x3F7B ^ 0x3E05] = 0xE7F8 ^ 0x3E05;
        MenuTopBarRenderer.C[0xC40A ^ 0xC495] = 0xC4D3 ^ 0xC495;
        MenuTopBarRenderer.C[0x1DA7 ^ 0x1DAF] = 0xFFFFE27C ^ 0x1DAF;
        MenuTopBarRenderer.C[0x5575 ^ 0x55C0] = 0xFFFFAA63 ^ 0x55C0;
        MenuTopBarRenderer.C[0xB663 ^ 0xB61D] = 0xB590 ^ 0xB61D;
        MenuTopBarRenderer.C[0xC46C ^ 0xC4D7] = 0xFFFF3B17 ^ 0xC4D7;
        MenuTopBarRenderer.C[0x4E33 ^ 0x4EFA] = 0xFFFFB146 ^ 0x4EFA;
        MenuTopBarRenderer.C[0xFEF2 ^ 0xFFF0] = 0x1B0D ^ 0xFFF0;
        MenuTopBarRenderer.C[0xC5FC ^ 0xC5C0] = 0xC59D ^ 0xC5C0;
        MenuTopBarRenderer.C[0x8FFB ^ 0x8EE4] = 0xB55B ^ 0x8EE4;
        MenuTopBarRenderer.C[0x1B30 ^ 0x1B94] = 0xFFFFE42B ^ 0x1B94;
        MenuTopBarRenderer.C[0x5FE6 ^ 0x5F8D] = 0xFFFFA05C ^ 0x5F8D;
        MenuTopBarRenderer.C[0xBBFD ^ 0xBBDC] = 0xFFFF4014 ^ 0xBBDC;
        MenuTopBarRenderer.C[0x38D7 ^ 0x38DE] = 0x38FA ^ 0x38DE;
        MenuTopBarRenderer.C[0x1A99 ^ 0x1A84] = 0xFFFFE537 ^ 0x1A84;
        MenuTopBarRenderer.C[0xEB2C ^ 0xEA1F] = 0xF18D ^ 0xEA1F;
        MenuTopBarRenderer.C[0xADF3 ^ 0xAC89] = 0x77FF ^ 0xAC89;
        MenuTopBarRenderer.C[0x6F07 ^ 0x6FCF] = 0x6F98 ^ 0x6FCF;
        MenuTopBarRenderer.C[0x4322 ^ 0x43B8] = 0x43B8 ^ 0x43B8;
        MenuTopBarRenderer.C[0xCE6C ^ 0xCF1E] = 0x23A3 ^ 0xCF1E;
        MenuTopBarRenderer.C[0x121D ^ 0x134F] = 0xEBE0 ^ 0x134F;
        MenuTopBarRenderer.C[0x6397 ^ 0x62DF] = 0x9B23 ^ 0x62DF;
        MenuTopBarRenderer.C[0xEC5 ^ 0xFEF] = 0x794F ^ 0xFEF;
        MenuTopBarRenderer.C[0x77DD ^ 0x76E2] = 0x17219 ^ 0x76E2;
        MenuTopBarRenderer.C[0xA878 ^ 0xA85E] = 0xFFFF57F2 ^ 0xA85E;
        MenuTopBarRenderer.C[0x6DA2 ^ 0x6D86] = 0x6DB3 ^ 0x6D86;
        MenuTopBarRenderer.C[0x8DB3 ^ 0x8DB8] = 0xFFFF721B ^ 0x8DB8;
        MenuTopBarRenderer.C[0xCCCB ^ 0xCDE0] = 0x231D ^ 0xCDE0;
        MenuTopBarRenderer.C[0xAE87 ^ 0xAEA0] = 0xAEAD ^ 0xAEA0;
        MenuTopBarRenderer.C[0xE6D4 ^ 0xE6F6] = 0xFFFF1939 ^ 0xE6F6;
        MenuTopBarRenderer.C[0x25DF ^ 0x248A] = 0xFFFF0A80 ^ 0x248A;
        MenuTopBarRenderer.C[0x94DC ^ 0x9493] = 0xFFFF6B2C ^ 0x9493;
        MenuTopBarRenderer.C[0xCAB2 ^ 0xCA2B] = 0x39C5 ^ 0xCA2B;
        MenuTopBarRenderer.C[0x2C16 ^ 0x2D1C] = 0x8145 ^ 0x2D1C;
        MenuTopBarRenderer.C[0x81A8 ^ 0x815A] = 0xB10A ^ 0x815A;
        MenuTopBarRenderer.C[0x10CD0 ^ 0x10C60] = 0xFFFEF3F9 ^ 0x10C60;
        MenuTopBarRenderer.C[0x990B ^ 0x987A] = 0x74EC ^ 0x987A;
        MenuTopBarRenderer.C[0x50E ^ 0x590] = 0x591 ^ 0x590;
        MenuTopBarRenderer.C[0x37A ^ 0x35A] = 0xFFFFFCF3 ^ 0x35A;
        MenuTopBarRenderer.C[0xBD2D ^ 0xBDC0] = 0xD9EE ^ 0xBDC0;
        MenuTopBarRenderer.C[0x1060D ^ 0x10734] = 0xFFFE2821 ^ 0x10734;
        MenuTopBarRenderer.C[0xDA0D ^ 0xDAE4] = 0x87A2 ^ 0xDAE4;
        MenuTopBarRenderer.C[0x7D98 ^ 0x7C94] = 0x1436 ^ 0x7C94;
        MenuTopBarRenderer.C[0xCF21 ^ 0xCE72] = 0x1FEE ^ 0xCE72;
        MenuTopBarRenderer.C[0x328D ^ 0x3232] = 0xFFFFCD7E ^ 0x3232;
        MenuTopBarRenderer.C[0x36E5 ^ 0x3664] = 0xFFFFC9D2 ^ 0x3664;
        MenuTopBarRenderer.C[0xF97 ^ 0xEC6] = 0xFFFF09A0 ^ 0xEC6;
        MenuTopBarRenderer.C[0xC891 ^ 0xC803] = 0xA854 ^ 0xC803;
        MenuTopBarRenderer.C[0xF1C2 ^ 0xF1C0] = 0xF1E8 ^ 0xF1C0;
        MenuTopBarRenderer.C[0xA8C2 ^ 0xA9BA] = 0x72CC ^ 0xA9BA;
        MenuTopBarRenderer.C[0x10929 ^ 0x10815] = 0x1B09C ^ 0x10815;
        MenuTopBarRenderer.C[0x91C1 ^ 0x9186] = 0xFFFF6E6E ^ 0x9186;
        MenuTopBarRenderer.C[0xA43 ^ 0xA3F] = 0xA0D ^ 0xA3F;
        MenuTopBarRenderer.C[0xC772 ^ 0xC6F0] = 0x4344 ^ 0xC6F0;
        MenuTopBarRenderer.C[0x9FF7 ^ 0x9FE2] = 0x9F6E ^ 0x9FE2;
        MenuTopBarRenderer.C[0xC7BA ^ 0xC715] = 0xFFFF38F1 ^ 0xC715;
        MenuTopBarRenderer.C[0xBDA3 ^ 0xBDCB] = 0xFFFF4239 ^ 0xBDCB;
        MenuTopBarRenderer.C[0x59F1 ^ 0x59E1] = 0xFFFFA61C ^ 0x59E1;
        MenuTopBarRenderer.C[0xD97 ^ 0xD3C] = 0xD2E ^ 0xD3C;
        MenuTopBarRenderer.C[0x1661 ^ 0x1662] = 0xFFFFE988 ^ 0x1662;
        MenuTopBarRenderer.C[0xC272 ^ 0xC32C] = 0x3FAE ^ 0xC32C;
        MenuTopBarRenderer.C[0xCBCE ^ 0xCB3E] = 0xFB3B ^ 0xCB3E;
        MenuTopBarRenderer.C[0xF8B7 ^ 0xF885] = 0xFFFF0741 ^ 0xF885;
        MenuTopBarRenderer.C[0x10BB9 ^ 0x10B3E] = 0x10B3D ^ 0x10B3E;
        MenuTopBarRenderer.C[0x40D0 ^ 0x402D] = 0x14223 ^ 0x402D;
        MenuTopBarRenderer.C[0x2E74 ^ 0x2F50] = 0x4D3A ^ 0x2F50;
        MenuTopBarRenderer.C[0xF814 ^ 0xF83C] = 0xF826 ^ 0xF83C;
        MenuTopBarRenderer.C[0x189C ^ 0x19B4] = 0x6F14 ^ 0x19B4;
        MenuTopBarRenderer.C[0xD36F ^ 0xD340] = 0xD36B ^ 0xD340;
        MenuTopBarRenderer.C[0x6089 ^ 0x6098] = 0x60F3 ^ 0x6098;
        MenuTopBarRenderer.C[0x4C2E ^ 0x4C41] = 0xFFFFB38B ^ 0x4C41;
        MenuTopBarRenderer.C[0x5A48 ^ 0x5B47] = 0x33EE ^ 0x5B47;
        MenuTopBarRenderer.C[0x7CCA ^ 0x7DEB] = 0x4603 ^ 0x7DEB;
        MenuTopBarRenderer.C[0x8FFA ^ 0x8EF9] = 0x6A04 ^ 0x8EF9;
        MenuTopBarRenderer.C[0xC198 ^ 0xC082] = 0x24B2 ^ 0xC082;
        MenuTopBarRenderer.C[0x43F ^ 0x4E1] = 0xFD1C ^ 0x4E1;
        MenuTopBarRenderer.C[0x6F07 ^ 0x6E88] = 0xDBC8 ^ 0x6E88;
        MenuTopBarRenderer.C[0x2A74 ^ 0x2B52] = 0x4938 ^ 0x2B52;
        MenuTopBarRenderer.C[0x8B2C ^ 0x8BDB] = 0x3F83 ^ 0x8BDB;
        MenuTopBarRenderer.C[0xCEF7 ^ 0xCEC8] = 0xFFFF315C ^ 0xCEC8;
        MenuTopBarRenderer.C[0x766C ^ 0x76CD] = 0xFFFF899D ^ 0x76CD;
        MenuTopBarRenderer.C[0x494 ^ 0x4A0] = 0x4D4 ^ 0x4A0;
        MenuTopBarRenderer.C[0x33D5 ^ 0x3348] = 0xFFFFCCBB ^ 0x3348;
        MenuTopBarRenderer.C[0x4E1A ^ 0x4E44] = 0x4E63 ^ 0x4E44;
        MenuTopBarRenderer.C[0x1E4F ^ 0x1EC5] = 0x1EC5 ^ 0x1EC5;
        MenuTopBarRenderer.C[0xE126 ^ 0xE006] = 0xDBB0 ^ 0xE006;
        MenuTopBarRenderer.C[0x5930 ^ 0x597D] = 0x5908 ^ 0x597D;
        MenuTopBarRenderer.C[0xD251 ^ 0xD3D5] = 0x362F ^ 0xD3D5;
        MenuTopBarRenderer.C[0x54C6 ^ 0x5546] = 0xD0F2 ^ 0x5546;
        MenuTopBarRenderer.C[0x6F9A ^ 0x6F1C] = 0x6F53 ^ 0x6F1C;
        MenuTopBarRenderer.C[0x3E8A ^ 0x3FF1] = 0xE611 ^ 0x3FF1;
        MenuTopBarRenderer.C[0xE437 ^ 0xE503] = 0xFE96 ^ 0xE503;
        MenuTopBarRenderer.C[0xD76 ^ 0xD98] = 0xFFFF9655 ^ 0xD98;
        MenuTopBarRenderer.C[0xD3D1 ^ 0xD378] = 0xFFFF2CB8 ^ 0xD378;
        MenuTopBarRenderer.C[0x6CF6 ^ 0x6DAB] = 0x910F ^ 0x6DAB;
        MenuTopBarRenderer.C[0x5799 ^ 0x5689] = 0xCC7A ^ 0x5689;
        MenuTopBarRenderer.C[0x3DBB ^ 0x3D7A] = 0xFFFFC298 ^ 0x3D7A;
        MenuTopBarRenderer.C[0x7A53 ^ 0x7A7A] = 0x7A57 ^ 0x7A7A;
        MenuTopBarRenderer.C[0xBB6C ^ 0xBBF8] = 0x7E03 ^ 0xBBF8;
        MenuTopBarRenderer.C[0x8B9E ^ 0x8B5B] = 0x8B16 ^ 0x8B5B;
        MenuTopBarRenderer.C[0x9D31 ^ 0x9D8F] = 0x9DA4 ^ 0x9D8F;
        MenuTopBarRenderer.C[0xAECF ^ 0xAF90] = 0xE6A ^ 0xAF90;
        MenuTopBarRenderer.C[0x6975 ^ 0x6905] = 0xFFFF96C3 ^ 0x6905;
        MenuTopBarRenderer.C[0x4E32 ^ 0x4E66] = 0x4D5C ^ 0x4E66;
        MenuTopBarRenderer.C[0x7C8E ^ 0x7C90] = 0xFFFF83F6 ^ 0x7C90;
        MenuTopBarRenderer.C[0x8EA4 ^ 0x8FE5] = 0xFFFE7489 ^ 0x8FE5;
        MenuTopBarRenderer.C[0xC8BC ^ 0xC857] = 0x9511 ^ 0xC857;
        MenuTopBarRenderer.C[0x3335 ^ 0x33A5] = 0xAD07 ^ 0x33A5;
        MenuTopBarRenderer.C[0xC41A ^ 0xC50C] = 0xB9E8 ^ 0xC50C;
        MenuTopBarRenderer.C[0x641F ^ 0x64F8] = 0xB2DC ^ 0x64F8;
        MenuTopBarRenderer.C[0xB78 ^ 0xB31] = 0xFFFFF4FC ^ 0xB31;
        MenuTopBarRenderer.C[0x1AD1 ^ 0x1AE2] = 0x1AAB ^ 0x1AE2;
        MenuTopBarRenderer.C[0x3A04 ^ 0x3A51] = 0x3A13 ^ 0x3A51;
        MenuTopBarRenderer.C[0x79A0 ^ 0x78B3] = 0xE245 ^ 0x78B3;
        MenuTopBarRenderer.C[0xE075 ^ 0xE01B] = 0xFFFF1F89 ^ 0xE01B;
        MenuTopBarRenderer.C[0x3F15 ^ 0x3F45] = 0x3F16 ^ 0x3F45;
        MenuTopBarRenderer.C[0xD0FA ^ 0xD0AC] = 0xD0C4 ^ 0xD0AC;
        MenuTopBarRenderer.C[0x8E65 ^ 0x8E80] = 0x58A4 ^ 0x8E80;
        MenuTopBarRenderer.C[0x7EC8 ^ 0x7FAE] = 0xD442 ^ 0x7FAE;
        MenuTopBarRenderer.C[0xC7ED ^ 0xC7D8] = 0xFFFF386D ^ 0xC7D8;
        MenuTopBarRenderer.C[0x1825 ^ 0x18DD] = 0x827C ^ 0x18DD;
        MenuTopBarRenderer.C[0xC0BC ^ 0xC186] = 0x1150 ^ 0xC186;
        MenuTopBarRenderer.C[0xBFF3 ^ 0xBFFE] = 0xBFFB ^ 0xBFFE;
        MenuTopBarRenderer.C[0x10FB4 ^ 0x10F05] = 0x10F35 ^ 0x10F05;
        MenuTopBarRenderer.C[0x75AF ^ 0x74E2] = 0xFB99 ^ 0x74E2;
        MenuTopBarRenderer.C[0x4A5F ^ 0x4A38] = 0x4A1B ^ 0x4A38;
        MenuTopBarRenderer.C[0xA077 ^ 0xA1F9] = 0x1A85E ^ 0xA1F9;
        MenuTopBarRenderer.C[0xC958 ^ 0xC9FD] = 0xC99C ^ 0xC9FD;
        MenuTopBarRenderer.C[0x5D4B ^ 0x5D08] = 0xFFFFA28E ^ 0x5D08;
        MenuTopBarRenderer.C[0xBCC9 ^ 0xBDD1] = 0x59BD ^ 0xBDD1;
        MenuTopBarRenderer.C[0xC554 ^ 0xC5B4] = 0x6CAD ^ 0xC5B4;
        MenuTopBarRenderer.C[0x1003E ^ 0x10092] = 0x100B9 ^ 0x10092;
        MenuTopBarRenderer.C[0x6632 ^ 0x671D] = 0xF5D1 ^ 0x671D;
        MenuTopBarRenderer.C[0x4FEC ^ 0x4EFD] = 0xD40B ^ 0x4EFD;
        MenuTopBarRenderer.C[0x223C ^ 0x2310] = 0xCDF6 ^ 0x2310;
        MenuTopBarRenderer.C[0xAF9F ^ 0xAFC3] = 0xFFFF5025 ^ 0xAFC3;
        MenuTopBarRenderer.C[0x2178 ^ 0x21A2] = 0xF737 ^ 0x21A2;
        MenuTopBarRenderer.C[0xECD ^ 0xFF8] = 0xFFFFEBA0 ^ 0xFF8;
        MenuTopBarRenderer.C[0xC017 ^ 0xC0EE] = 0x5A46 ^ 0xC0EE;
        MenuTopBarRenderer.C[0x2AAD ^ 0x2ABB] = 0xFFFFD510 ^ 0x2ABB;
        MenuTopBarRenderer.C[0x267D ^ 0x2716] = 0x582C ^ 0x2716;
        MenuTopBarRenderer.C[0x431D ^ 0x420F] = 0xFFFF2754 ^ 0x420F;
    }
}

