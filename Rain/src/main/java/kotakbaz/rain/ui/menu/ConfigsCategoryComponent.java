/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.menu;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.ScissorUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.config.ConfigInfo;
import kotakbaz.rain.config.ConfigManager;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.api.UIComponent;
import kotakbaz.rain.ui.menu.ConfigContentArea;
import kotakbaz.rain.ui.menu.ConfigEntryComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u0015J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0003\u00a2\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0003\u00a2\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0003\u00a2\u0006\u0004\b'\u0010%J\u0019\u0010)\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020 H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b+\u0010%J\u001f\u0010,\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u00101R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`48\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u00101R\u0016\u0010D\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u00101\u00a8\u0006E"}, d2={"Lkotakbaz/rain/ui/menu/ConfigsCategoryComponent;", "Lkotakbaz/rain/ui/api/UIComponent;", "Lkotakbaz/rain/ui/api/PipelinedRender;", "", "panelWidth", "contentTopOffset", "<init>", "(FF)V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "resetScroll", "()V", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "onKeyPress", "vertical", "onMouseScroll", "scrollWheel", "(F)V", "progress", "", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "forceRefresh", "syncEntries", "(Z)V", "contentHeight", "insideContent", "(FF)Z", "Lkotakbaz/rain/ui/menu/ConfigContentArea;", "contentArea", "()Lkotakbaz/rain/ui/menu/ConfigContentArea;", "F", "Ljava/util/ArrayList;", "Lkotakbaz/rain/ui/menu/ConfigEntryComponent;", "Lkotlin/collections/ArrayList;", "configEntries", "Ljava/util/ArrayList;", "", "Lkotakbaz/rain/config/ConfigInfo;", "configs", "Ljava/util/List;", "", "selectedConfigName", "Ljava/lang/String;", "configStateVersion", "I", "Lkotakbaz/rain/client/util/other/ScrollUtil;", "scroll", "Lkotakbaz/rain/client/util/other/ScrollUtil;", "cachedTotalHeight", "cachedViewHeight", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nConfigsCategoryComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigsCategoryComponent.kt\nkotakbaz/rain/ui/menu/ConfigsCategoryComponent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1915#2:179\n1916#2:181\n1915#2,2:182\n1586#2:184\n1661#2,3:185\n1#3:180\n*S KotlinDebug\n*F\n+ 1 ConfigsCategoryComponent.kt\nkotakbaz/rain/ui/menu/ConfigsCategoryComponent\n*L\n49#1:179\n49#1:181\n73#1:182,2\n128#1:184\n128#1:185,3\n*E\n"})
public final class ConfigsCategoryComponent
extends UIComponent
implements PipelinedRender {
    private final float panelWidth;
    private final float contentTopOffset;
    @NotNull
    private final ArrayList<ConfigEntryComponent> configEntries;
    @NotNull
    private List<ConfigInfo> configs;
    @Nullable
    private String selectedConfigName;
    private int configStateVersion;
    @NotNull
    private ScrollUtil scroll;
    private float cachedTotalHeight;
    private float cachedViewHeight;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public ConfigsCategoryComponent(float panelWidth2, float contentTopOffset) {
        this.panelWidth = panelWidth2;
        this.contentTopOffset = contentTopOffset;
        this.configEntries = new ArrayList();
        this.configs = CollectionsKt.emptyList();
        this.selectedConfigName = ConfigManager.INSTANCE.getSelectedVisibleConfigName();
        int n2 = C[0];
        n2 += C[1];
        this.configStateVersion = n2 += C[2];
        int n3 = C[3];
        n3 ^= C[4];
        this.scroll = new ScrollUtil(0.0f, n3 ^= C[5], null);
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    public final void resetScroll() {
        int n2 = C[6];
        n2 ^= C[7];
        this.scroll = new ScrollUtil(0.0f, n2 -= C[8], null);
        boolean bl = C[9];
        bl -= C[10];
        this.syncEntries(bl -= C[11]);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        long l2 = -7563108842475787859L;
        long l3 = -9015274287378195925L;
        long l4 = 6295257968435678676L;
        super.render(mouseX, mouseY, partialTicks);
        boolean bl = C[12];
        bl ^= C[13];
        int n2 = C[15];
        n2 ^= C[16];
        ConfigsCategoryComponent.syncEntries$default(this, bl -= C[14], n2 ^= C[17], null);
        ConfigContentArea configContentArea = this.contentArea();
        this.cachedTotalHeight = this.contentHeight();
        this.cachedViewHeight = configContentArea.getHeight();
        this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0f));
        this.scroll.update();
        float f2 = this.scroll.value();
        ScissorUtil.INSTANCE.start(configContentArea.getLeft(), configContentArea.getTop(), configContentArea.getWidth(), configContentArea.getHeight());
        float f3 = 0.0f;
        f3 = configContentArea.getTop() - f2;
        float f4 = configContentArea.getTop() + configContentArea.getHeight();
        Iterable iterable = this.configEntries;
        long l5 = l2;
        int n3 = C[18];
        n3 ^= C[19];
        l2 = l5 ^ (0L ^ l5) & -1L << (n3 ^= C[20]);
        for (Object t2 : iterable) {
            int n4;
            int n5;
            ConfigEntryComponent configEntryComponent = (ConfigEntryComponent)t2;
            long l6 = l2;
            int n6 = C[21];
            n6 ^= C[22];
            l2 = l6 ^ (0L ^ l6) & -1L >>> (n6 -= C[23]);
            float f5 = configEntryComponent.getDefaultHeight();
            float f6 = f3 + f5;
            if (f6 > configContentArea.getTop() && f3 < f4) {
                int n7 = C[24];
                n7 ^= C[25];
                n5 = n7 ^= C[26];
            } else {
                int n8 = C[27];
                n8 += C[28];
                n5 = n8 -= C[29];
            }
            int n9 = C[30];
            n9 -= C[31];
            long l7 = l4;
            int n10 = C[33];
            n10 ^= C[34];
            l4 = l7 ^ ((long)n5 << (n9 ^= C[32]) ^ l7) & -1L << (n10 ^= C[35]);
            configEntryComponent.setAlpha(this.getAlpha());
            configEntryComponent.setX(configContentArea.getLeft());
            configEntryComponent.setY(f3);
            configEntryComponent.setWidth(configContentArea.getWidth());
            configEntryComponent.setHeight(f5);
            ConfigEntryComponent configEntryComponent2 = configEntryComponent;
            if (this.selectedConfigName != null) {
                String string;
                ConfigEntryComponent configEntryComponent3 = configEntryComponent2;
                long l8 = l3;
                int n11 = C[36];
                n11 ^= C[37];
                l3 = l8 ^ (0L ^ l8) & -1L >>> (n11 -= C[38]);
                boolean bl2 = C[39];
                bl2 ^= C[40];
                configEntryComponent2 = configEntryComponent3;
                int n12 = C[42];
                n12 ^= C[43];
                if (Boolean.valueOf(StringsKt.equals(configEntryComponent.getConfigName(), string, bl2 -= C[41])) == (n12 ^= C[44])) {
                    int n13 = C[45];
                    n13 ^= C[46];
                    n4 = n13 -= C[47];
                } else {
                    int n14 = C[48];
                    n14 -= C[49];
                    n4 = n14 -= C[50];
                }
            } else {
                int n15 = C[51];
                n15 -= C[52];
                n4 = n15 ^= C[53];
            }
            configEntryComponent2.setSelected(n4 != 0);
            int n16 = C[54];
            n16 += C[55];
            if ((int)(l4 >>> (n16 += C[56])) != 0) {
                configEntryComponent.render(mouseX, mouseY, partialTicks);
            }
            f3 += f5 + this.getPadding();
        }
        ScissorUtil.INSTANCE.end();
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        long l2 = -9106925674215575800L;
        super.onMouseClick(mouseX, mouseY, button);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        Iterable iterable = this.configEntries;
        long l3 = l2;
        int n2 = C[57];
        n2 ^= C[58];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += C[59]);
        for (Object t2 : iterable) {
            ConfigEntryComponent configEntryComponent = (ConfigEntryComponent)t2;
            long l4 = l2;
            int n3 = C[60];
            n3 ^= C[61];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 += C[62]);
            configEntryComponent.onMouseClick(mouseX, mouseY, button);
        }
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        super.onMouseRelease(mouseX, mouseY, button);
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        this.scrollWheel(vertical);
    }

    public final void scrollWheel(float vertical) {
        this.scroll.scroll(vertical * 2.5f);
    }

    public final void setScrollProgress(float progress2, boolean instant) {
        float f2 = this.scroll.max();
        if (f2 <= 0.0f) {
            this.scroll.setValue(0.0f).setTargetValue(0.0f);
            return;
        }
        float f3 = -f2 * RangesKt.coerceIn(progress2, 0.0f, 1.0f);
        this.scroll.setTargetValue(f3);
        if (instant) {
            this.scroll.setValue(f3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void setScrollProgress$default(ConfigsCategoryComponent configsCategoryComponent, float f2, boolean bl, int n2, Object object) {
        int n3;
        void var3_4;
        int n4 = C[63];
        n4 += C[64];
        if ((var3_4 & (n4 += C[65])) != 0) {
            int n5 = C[66];
            n5 -= C[67];
            n3 = n5 -= C[68];
        }
        configsCategoryComponent.setScrollProgress(f2, n3 != 0);
    }

    public final float scrollOffsetValue() {
        return this.scroll.value();
    }

    public final float scrollContentHeight() {
        return this.cachedTotalHeight;
    }

    public final float scrollViewHeight() {
        return this.cachedViewHeight;
    }

    private final void syncEntries(boolean forceRefresh) {
        int n2;
        long l2 = -9023129055906814059L;
        long l3 = 7292266557383752920L;
        long l4 = 4326601633091128502L;
        long l5 = -8230955432824263341L;
        if (forceRefresh) {
            ConfigManager.INSTANCE.refreshVisibleConfigsNow();
        }
        int n3 = C[69];
        n3 += C[70];
        long l6 = l2;
        int n4 = C[72];
        n4 ^= C[73];
        l2 = l6 ^ ((long)ConfigManager.INSTANCE.getStateVersion() << (n3 -= C[71]) ^ l6) & -1L << (n4 ^= C[74]);
        if (!forceRefresh) {
            int n5 = C[75];
            n5 -= C[76];
            if ((int)(l2 >>> (n5 -= C[77])) == this.configStateVersion) {
                return;
            }
        }
        String string = ConfigManager.INSTANCE.getSelectedVisibleConfigName();
        List<ConfigInfo> list = ConfigManager.INSTANCE.getVisibleConfigs();
        if (!Intrinsics.areEqual(list, this.configs)) {
            int n6 = C[78];
            n6 ^= C[79];
            n2 = n6 += C[80];
        } else {
            int n7 = C[81];
            n7 += C[82];
            n2 = n7 ^= C[83];
        }
        int n8 = C[84];
        n8 += C[85];
        long l7 = l3;
        int n9 = C[87];
        n9 += C[88];
        l3 = l7 ^ ((long)n2 << (n8 += C[86]) ^ l7) & -1L << (n9 ^= C[89]);
        this.selectedConfigName = string;
        int n10 = C[90];
        n10 += C[91];
        if ((int)(l3 >>> (n10 -= C[92])) != 0) {
            this.configs = list;
            this.configEntries.clear();
            Iterable iterable = list;
            ArrayList<ConfigEntryComponent> arrayList = this.configEntries;
            long l8 = l4;
            int n11 = C[93];
            n11 ^= C[94];
            l4 = l8 ^ (0L ^ l8) & -1L << (n11 ^= C[95]);
            Iterable iterable2 = iterable;
            int n12 = C[96];
            n12 ^= C[97];
            Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, n12 += C[98]));
            long l9 = l4;
            int n13 = C[99];
            n13 += C[100];
            l4 = l9 ^ (0L ^ l9) & -1L >>> (n13 += C[101]);
            for (Object t2 : iterable2) {
                ConfigInfo configInfo = (ConfigInfo)t2;
                Collection collection2 = collection;
                long l10 = l5;
                int n14 = C[102];
                n14 += C[103];
                l5 = l10 ^ (0L ^ l10) & -1L << (n14 += C[104]);
                collection2.add(new ConfigEntryComponent(configInfo.getName(), configInfo.getAuthor(), arg_0 -> ConfigsCategoryComponent.syncEntries$lambda$0$0(this, arg_0), arg_0 -> ConfigsCategoryComponent.syncEntries$lambda$0$1(this, arg_0)));
            }
            arrayList.addAll((List)collection);
        }
        this.configStateVersion = ConfigManager.INSTANCE.getStateVersion();
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ void syncEntries$default(ConfigsCategoryComponent configsCategoryComponent, boolean bl, int n2, Object object) {
        int n3;
        void var2_3;
        int n4 = C[105];
        n4 ^= C[106];
        if ((var2_3 & (n4 ^= C[107])) != 0) {
            int n5 = C[108];
            n5 ^= C[109];
            n3 = n5 += C[110];
        }
        configsCategoryComponent.syncEntries(n3 != 0);
    }

    private final float contentHeight() {
        long l2 = -3376983340202666776L;
        if (this.configEntries.isEmpty()) {
            return 0.0f;
        }
        Iterable iterable = this.configEntries;
        double d2 = 0.0;
        for (Object t2 : iterable) {
            ConfigEntryComponent configEntryComponent = (ConfigEntryComponent)t2;
            double d3 = d2;
            long l3 = l2;
            int n2 = C[111];
            n2 ^= C[112];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 += C[113]);
            double d4 = configEntryComponent.getDefaultHeight() + this.getPadding();
            d2 = d3 + d4;
        }
        return (float)d2 - this.getPadding();
    }

    private final boolean insideContent(float mouseX, float mouseY) {
        int n2;
        ConfigContentArea configContentArea = this.contentArea();
        if (mouseX >= configContentArea.getLeft() && mouseX <= configContentArea.getLeft() + configContentArea.getWidth() && mouseY >= configContentArea.getTop() && mouseY <= configContentArea.getTop() + configContentArea.getHeight()) {
            int n3 = C[114];
            n3 -= C[115];
            n2 = n3 ^= C[116];
        } else {
            int n4 = C[117];
            n4 += C[118];
            n2 = n4 ^= C[119];
        }
        return n2 != 0;
    }

    private final ConfigContentArea contentArea() {
        float f2 = this.getX() + this.panelWidth + this.getPadding();
        float f3 = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float f4 = this.getY() + this.contentTopOffset;
        float f5 = RangesKt.coerceAtLeast(f3 - f2, 0.0f);
        float f6 = RangesKt.coerceAtLeast(this.getY() + this.getHeight() - f4 - this.getPadding(), 0.0f);
        return new ConfigContentArea(f2, f4, f5, f6);
    }

    private static final Unit syncEntries$lambda$0$0(ConfigsCategoryComponent this$0, String selectedConfig) {
        int n2 = C[120];
        n2 += C[121];
        Intrinsics.checkNotNullParameter(selectedConfig, (String)a[n2 -= C[122]]);
        if (ConfigManager.INSTANCE.load(selectedConfig)) {
            boolean bl = C[123];
            bl += C[124];
            int n3 = C[126];
            n3 ^= C[127];
            ConfigsCategoryComponent.syncEntries$default(this$0, bl ^= C[125], n3 -= C[128], null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit syncEntries$lambda$0$1(ConfigsCategoryComponent this$0, String selectedConfig) {
        int n2 = C[129];
        n2 ^= C[130];
        Intrinsics.checkNotNullParameter(selectedConfig, (String)a[n2 ^= C[131]]);
        if (ConfigManager.INSTANCE.remove(selectedConfig)) {
            boolean bl = C[132];
            bl += C[133];
            int n3 = C[135];
            n3 ^= C[136];
            ConfigsCategoryComponent.syncEntries$default(this$0, bl ^= C[134], n3 -= C[137], null);
        }
        return Unit.INSTANCE;
    }

    static {
        ConfigsCategoryComponent.b();
        long l2 = -8821287161056222160L;
        long l3 = 8531003922129192252L;
        long l4 = 5670558894615615926L;
        long l5 = -5984891723422007595L;
        long l6 = -2205416702309299566L;
        long l7 = 3911553353955140831L;
        long l8 = -7406525457011715861L;
        long l9 = 133476477808864703L;
        long l10 = 6073285452029754035L;
        long l11 = -3152840751207869557L;
        long l12 = -6519325111384346304L;
        long l13 = -5009728225224271940L;
        long l14 = 4680907626034333210L;
        long l15 = 3079257452549082658L;
        int n2 = C[138];
        n2 ^= C[139];
        a = new Object[n2 += C[140]];
        long l16 = l15;
        int n3 = C[141];
        n3 ^= C[142];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[143]);
        Object[] objectArray = new Object[C[144]];
        objectArray[ConfigsCategoryComponent.C[145]] = A;
        objectArray[ConfigsCategoryComponent.C[146]] = C[147];
        int n4 = C[148];
        Object object = ConfigsCategoryComponent.A()[C[149]];
        if (object == null) {
            char[] cArray = "\ue359\ue356\ue382\ue371\ue35e\ue37c\ue383\ue37d\ue34a\ue4a7\ue357\ue4a6\ue347\ue35e\ue34c\ue380\ue377\ue37d\ue347\ue4a3\ue37c\ue38c\ue4af\ue376\ue358\ue351\ue371\ue357\ue345\ue4af\ue384\ue371\ue371\ue4a0\ue35e\ue4a0\ue4a4\ue385\ue38b\ue374\ue37c\ue387\ue371\ue354\ue351\ue380\ue379\ue4a8\ue354\ue346\ue358\ue351\ue4af\ue4a3\ue4a7\ue4a3\ue382\ue38c\ue358\ue4a8\ue358\ue37d\ue385\ue384\ue38a\ue4a4\ue359\ue34b\ue341\ue35d\ue4a8\ue357\ue34b\ue375\ue4a5\ue378\ue382\ue35e\ue35e\ue383\ue37c\ue37f\ue4a8\ue382\ue4a5\ue34a\ue370\ue370".toCharArray();
            for (int i2 = C[150]; i2 < C[151]; ++i2) {
                int n5 = cArray[i2];
                n5 += C[152];
                n5 ^= C[153];
                n5 ^= C[154];
                n5 -= C[155];
                n5 ^= C[156];
                n5 += C[157];
                n5 -= C[158];
                n5 += C[159];
                n5 += C[160];
                n5 += C[161];
                n5 -= C[162];
                cArray[i2] = (char)(n5 += C[163]);
            }
            object = ConfigsCategoryComponent.A()[ConfigsCategoryComponent.C[164]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ConfigsCategoryComponent.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[165];
        n6 += C[166];
        l6 = l17 ^ (0x2000000000L ^ l17) & -1L << (n6 += C[167]);
        long l18 = l13;
        int n7 = C[168];
        n7 += C[169];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= C[170]);
        while (true) {
            int n8 = C[171];
            n8 -= C[172];
            if ((int)l13 >= (int)(l6 >>> (n8 -= C[173]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[174];
            n10 -= C[175];
            int n11 = C[177];
            n11 ^= C[178];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[176])) & -1L >>> (n11 += C[179]);
            long l20 = l9;
            int n12 = C[180];
            n12 ^= C[181];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[182]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[183];
            n14 -= C[184];
            int n15 = C[186];
            n15 ^= C[187];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[185])) & -1L >>> (n15 ^= C[188]);
            int n16 = C[189];
            n16 ^= C[190];
            long l22 = l10;
            int n17 = C[192];
            n17 += C[193];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[191]) ^ l22) & -1L << (n17 += C[194]);
            int n18 = C[195];
            n18 ^= C[196];
            n18 += C[197];
            int n19 = C[198];
            n19 += C[199];
            long l23 = l12;
            int n20 = C[201];
            n20 -= C[202];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[200]))) ^ l23) & -1L >>> (n20 ^= C[203]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[204];
            n21 += C[205];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[206]);
            while (true) {
                int n22 = C[207];
                n22 -= C[208];
                if ((int)(l14 >>> (n22 -= C[209])) >= (int)l12) break;
                int n23 = C[210];
                n23 += C[211];
                int n24 = C[213];
                n24 ^= C[214];
                cArray2[(int)(l14 >>> (n23 -= ConfigsCategoryComponent.C[212]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[215]))];
                l14 += 0x100000000L;
            }
            int n25 = C[216];
            n25 += C[217];
            int n26 = (int)(l15 >>> (n25 += C[218]));
            l15 += 0x100000000L;
            ConfigsCategoryComponent.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[219];
            n27 += C[220];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[221]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[222]];
        String string = (String)object[C[223]];
        object = object[C[224]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[225]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[226]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[228] ^ C[229]];
                byArray[ConfigsCategoryComponent.C[230] ^ ConfigsCategoryComponent.C[231]] = C[232] ^ C[233];
                byArray[ConfigsCategoryComponent.C[234] ^ ConfigsCategoryComponent.C[235]] = C[236] ^ C[237];
                byArray[ConfigsCategoryComponent.C[238] ^ ConfigsCategoryComponent.C[239]] = C[240] ^ C[241];
                byArray[ConfigsCategoryComponent.C[242] ^ ConfigsCategoryComponent.C[243]] = C[244] ^ C[245];
                byArray[ConfigsCategoryComponent.C[246] ^ ConfigsCategoryComponent.C[247]] = C[248] ^ C[249];
                byArray[ConfigsCategoryComponent.C[250] ^ ConfigsCategoryComponent.C[251]] = C[252] ^ C[253];
                byArray[ConfigsCategoryComponent.C[254] ^ ConfigsCategoryComponent.C[255]] = C[256] ^ C[257];
                byArray[ConfigsCategoryComponent.C[258] ^ ConfigsCategoryComponent.C[259]] = C[260] ^ C[261];
                byArray[ConfigsCategoryComponent.C[262] ^ ConfigsCategoryComponent.C[263]] = C[264] ^ C[265];
                byArray[ConfigsCategoryComponent.C[266] ^ ConfigsCategoryComponent.C[267]] = C[268] ^ C[269];
                byArray[ConfigsCategoryComponent.C[270] ^ ConfigsCategoryComponent.C[271]] = C[272] ^ C[273];
                byArray[ConfigsCategoryComponent.C[274] ^ ConfigsCategoryComponent.C[275]] = C[276] ^ C[277];
                byArray[ConfigsCategoryComponent.C[278] ^ ConfigsCategoryComponent.C[279]] = C[280] ^ C[281];
                byArray[ConfigsCategoryComponent.C[282] ^ ConfigsCategoryComponent.C[283]] = C[284] ^ C[285];
                byArray[ConfigsCategoryComponent.C[286] ^ ConfigsCategoryComponent.C[287]] = C[288] ^ C[289];
                byArray[ConfigsCategoryComponent.C[290] ^ ConfigsCategoryComponent.C[291]] = C[292] ^ C[293];
                objectArray2[ConfigsCategoryComponent.C[227]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[294]];
            if (b == null) {
                byte[] byArray2 = new byte[C[295] ^ C[296]];
                byArray2[ConfigsCategoryComponent.C[297] ^ ConfigsCategoryComponent.C[298]] = C[299] ^ C[300];
                byArray2[ConfigsCategoryComponent.C[301] ^ ConfigsCategoryComponent.C[302]] = C[303] ^ C[304];
                byArray2[ConfigsCategoryComponent.C[305] ^ ConfigsCategoryComponent.C[306]] = C[307] ^ C[308];
                byArray2[ConfigsCategoryComponent.C[309] ^ ConfigsCategoryComponent.C[310]] = C[311] ^ C[312];
                byArray2[ConfigsCategoryComponent.C[313] ^ ConfigsCategoryComponent.C[314]] = C[315] ^ C[316];
                byArray2[ConfigsCategoryComponent.C[317] ^ ConfigsCategoryComponent.C[318]] = C[319] ^ C[320];
                byArray2[ConfigsCategoryComponent.C[321] ^ ConfigsCategoryComponent.C[322]] = C[323] ^ C[324];
                byArray2[ConfigsCategoryComponent.C[325] ^ ConfigsCategoryComponent.C[326]] = C[327] ^ C[328];
                byArray2[ConfigsCategoryComponent.C[329] ^ ConfigsCategoryComponent.C[330]] = C[331] ^ C[332];
                byArray2[ConfigsCategoryComponent.C[333] ^ ConfigsCategoryComponent.C[334]] = C[335] ^ C[336];
                byArray2[ConfigsCategoryComponent.C[337] ^ ConfigsCategoryComponent.C[338]] = C[339] ^ C[340];
                byArray2[ConfigsCategoryComponent.C[341] ^ ConfigsCategoryComponent.C[342]] = C[343] ^ C[344];
                byArray2[ConfigsCategoryComponent.C[345] ^ ConfigsCategoryComponent.C[346]] = C[347] ^ C[348];
                byArray2[ConfigsCategoryComponent.C[349] ^ ConfigsCategoryComponent.C[350]] = C[351] ^ C[352];
                byArray2[ConfigsCategoryComponent.C[353] ^ ConfigsCategoryComponent.C[354]] = C[355] ^ C[356];
                byArray2[ConfigsCategoryComponent.C[357] ^ ConfigsCategoryComponent.C[358]] = C[359] ^ C[360];
                byArray2[ConfigsCategoryComponent.C[361] ^ ConfigsCategoryComponent.C[362]] = C[363] ^ C[364];
                byArray2[ConfigsCategoryComponent.C[365] ^ ConfigsCategoryComponent.C[366]] = C[367] ^ C[368];
                byArray2[ConfigsCategoryComponent.C[369] ^ ConfigsCategoryComponent.C[370]] = C[371] ^ C[372];
                byArray2[ConfigsCategoryComponent.C[373] ^ ConfigsCategoryComponent.C[374]] = C[375] ^ C[376];
                byArray2[ConfigsCategoryComponent.C[377] ^ ConfigsCategoryComponent.C[378]] = C[379] ^ C[380];
                byArray2[ConfigsCategoryComponent.C[381] ^ ConfigsCategoryComponent.C[382]] = C[383] ^ C[384];
                byArray2[ConfigsCategoryComponent.C[385] ^ ConfigsCategoryComponent.C[386]] = C[387] ^ C[388];
                byArray2[ConfigsCategoryComponent.C[389] ^ ConfigsCategoryComponent.C[390]] = C[391] ^ C[392];
                byArray2[ConfigsCategoryComponent.C[393] ^ ConfigsCategoryComponent.C[394]] = C[395] ^ C[396];
                byArray2[ConfigsCategoryComponent.C[397] ^ ConfigsCategoryComponent.C[398]] = C[399] ^ 0xE461;
                byArray2[0x655A ^ 0x654F] = 0x6571 ^ 0x654F;
                byArray2[0x5DDE ^ 0x5DD6] = 0xFFFFA270 ^ 0x5DD6;
                byArray2[0xDD03 ^ 0xDD19] = 0xDD24 ^ 0xDD19;
                byArray2[0xC200 ^ 0xC217] = 0xFFFF3DE7 ^ 0xC217;
                byArray2[0x59CD ^ 0x59DB] = 0x59EF ^ 0x59DB;
                byArray2[0xD0F2 ^ 0xD0F8] = 0xD0EB ^ 0xD0F8;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ConfigsCategoryComponent.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u9f8d\u9f7b\u9f74\u9f79\u9f77\ua42b\u9f88\ua056\ua069\ua055\u9f75\u9f92\ua05e\ua05c\u9f8c\u9f75\u9f7e\ua42e".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 9969;
                        n3 -= 20098;
                        n3 ^= 0xB863;
                        n3 += 9060;
                        n3 ^= 0xF4A5;
                        n3 ^= 0x7946;
                        n3 += 11385;
                        n3 -= 22329;
                        n3 += 41754;
                        n3 -= 61421;
                        n3 -= 50989;
                        cArray[i2] = (char)(n3 ^= 0xF92E);
                    }
                    object4 = ConfigsCategoryComponent.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[4] = -44;
                byArray4[14] = -20;
                byArray4[13] = -48;
                byArray4[11] = -20;
                byArray4[15] = 11;
                byArray4[7] = -35;
                byArray4[5] = -70;
                byArray4[2] = 38;
                byArray4[9] = 17;
                byArray4[12] = -99;
                byArray4[0] = 93;
                byArray4[8] = -10;
                byArray4[1] = -117;
                byArray4[6] = -98;
                byArray4[3] = -40;
                byArray4[10] = -34;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ConfigsCategoryComponent.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ue625\ue629\ue617".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 22032;
                        n4 -= 56913;
                        n4 ^= 0x3BF1;
                        n4 -= 46596;
                        n4 -= 13236;
                        n4 -= 21157;
                        n4 += 8165;
                        n4 += 60695;
                        n4 -= 30408;
                        n4 += 18825;
                        n4 -= 25161;
                        cArray[i3] = (char)(n4 -= 42731);
                    }
                    object5 = ConfigsCategoryComponent.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ConfigsCategoryComponent.A()[3];
            if (object6 == null) {
                char[] cArray = "\u3e2f\u3e2b\u3e3d\u3b21\u3e2d\u3e2e\u3e2d\u3b21\u3e40\u3e45\u3e2d\u3e3d\u3b9b\u3e40\u3e4f\u3e4c\u3e4c\u3e47\u3de2\u3e49".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 41185;
                    n5 ^= 0xF6C1;
                    n5 -= 30115;
                    n5 -= 43491;
                    n5 ^= 0xACA7;
                    n5 ^= 0x8F29;
                    n5 += 1900;
                    n5 += 50252;
                    n5 += 63692;
                    n5 -= 8973;
                    n5 += 655;
                    n5 -= 58739;
                    cArray[i4] = (char)(n5 -= 11737);
                }
                object6 = ConfigsCategoryComponent.A()[3] = new String(cArray);
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
        C = new int[0xEB94 ^ 0xEA04];
        ConfigsCategoryComponent.C[0xEE02 ^ 0xEEE3] = 0xEEE2 ^ 0xEEE3;
        ConfigsCategoryComponent.C[0x12B0 ^ 0x1213] = 0x656D ^ 0x1213;
        ConfigsCategoryComponent.C[0x98C4 ^ 0x982D] = 0x1621 ^ 0x982D;
        ConfigsCategoryComponent.C[0x1315 ^ 0x13BE] = 0x133A ^ 0x13BE;
        ConfigsCategoryComponent.C[0x35F2 ^ 0x3497] = 0x68C2 ^ 0x3497;
        ConfigsCategoryComponent.C[0xD1C8 ^ 0xD0D9] = 0x7FC1 ^ 0xD0D9;
        ConfigsCategoryComponent.C[0xD29C ^ 0xD2A9] = 0xFFFF2D6D ^ 0xD2A9;
        ConfigsCategoryComponent.C[0xE7EA ^ 0xE74A] = 0xAC31 ^ 0xE74A;
        ConfigsCategoryComponent.C[0xD648 ^ 0xD64D] = 0xD671 ^ 0xD64D;
        ConfigsCategoryComponent.C[0x4EE ^ 0x5C2] = 0xC9F3 ^ 0x5C2;
        ConfigsCategoryComponent.C[0xB643 ^ 0xB6F2] = 0xB690 ^ 0xB6F2;
        ConfigsCategoryComponent.C[0xD90A ^ 0xD9B7] = 0xD9AD ^ 0xD9B7;
        ConfigsCategoryComponent.C[0x58FB ^ 0x5893] = 0x588F ^ 0x5893;
        ConfigsCategoryComponent.C[0x7062 ^ 0x7061] = 0x7068 ^ 0x7061;
        ConfigsCategoryComponent.C[0x4E93 ^ 0x4FE1] = 0x558A ^ 0x4FE1;
        ConfigsCategoryComponent.C[0x2B61 ^ 0x2B27] = 0x2B55 ^ 0x2B27;
        ConfigsCategoryComponent.C[0xB688 ^ 0xB6FB] = 0xB6FE ^ 0xB6FB;
        ConfigsCategoryComponent.C[0x5B89 ^ 0x5B54] = 0xFFFFA4F5 ^ 0x5B54;
        ConfigsCategoryComponent.C[0x34CB ^ 0x35A0] = 0xFFFEC212 ^ 0x35A0;
        ConfigsCategoryComponent.C[0x7E87 ^ 0x7FC9] = 0xD193 ^ 0x7FC9;
        ConfigsCategoryComponent.C[0x1799 ^ 0x169D] = 0xFFFF15D1 ^ 0x169D;
        ConfigsCategoryComponent.C[0xCE89 ^ 0xCE43] = 0xFFFF31CF ^ 0xCE43;
        ConfigsCategoryComponent.C[0x10D03 ^ 0x10DB3] = 0x10DA8 ^ 0x10DB3;
        ConfigsCategoryComponent.C[0x4A54 ^ 0x4A7D] = 0xFFFFB58E ^ 0x4A7D;
        ConfigsCategoryComponent.C[0x34F0 ^ 0x35FA] = 0x1101 ^ 0x35FA;
        ConfigsCategoryComponent.C[0xD2EB ^ 0xD265] = 0xFFFF2DA3 ^ 0xD265;
        ConfigsCategoryComponent.C[0x6382 ^ 0x62AC] = 0xD84E ^ 0x62AC;
        ConfigsCategoryComponent.C[0x1A62 ^ 0x1B71] = 0x15D ^ 0x1B71;
        ConfigsCategoryComponent.C[0xD4AF ^ 0xD484] = 0xD4D8 ^ 0xD484;
        ConfigsCategoryComponent.C[0xE4F6 ^ 0xE42A] = 0xFFFF1BB8 ^ 0xE42A;
        ConfigsCategoryComponent.C[0x639D ^ 0x62A8] = 0xE11D ^ 0x62A8;
        ConfigsCategoryComponent.C[0x656A ^ 0x643D] = 0xFFFFD593 ^ 0x643D;
        ConfigsCategoryComponent.C[0xD496 ^ 0xD48E] = 0xD492 ^ 0xD48E;
        ConfigsCategoryComponent.C[0xEC67 ^ 0xEC39] = 0xEC13 ^ 0xEC39;
        ConfigsCategoryComponent.C[0x5932 ^ 0x5935] = 0x594F ^ 0x5935;
        ConfigsCategoryComponent.C[0xD9AA ^ 0xD8F8] = 0xB3C6 ^ 0xD8F8;
        ConfigsCategoryComponent.C[0x8FEC ^ 0x8EE1] = 0xAA14 ^ 0x8EE1;
        ConfigsCategoryComponent.C[0xD458 ^ 0xD534] = 0x1DD45 ^ 0xD534;
        ConfigsCategoryComponent.C[0x6B92 ^ 0x6AA3] = 0x6504 ^ 0x6AA3;
        ConfigsCategoryComponent.C[0xE208 ^ 0xE292] = 0x1850 ^ 0xE292;
        ConfigsCategoryComponent.C[0x1BAF ^ 0x1B81] = 0xFFFFE42A ^ 0x1B81;
        ConfigsCategoryComponent.C[0xC6CC ^ 0xC6A3] = 0xFFFF393E ^ 0xC6A3;
        ConfigsCategoryComponent.C[0x91C6 ^ 0x918F] = 0x91CC ^ 0x918F;
        ConfigsCategoryComponent.C[0x3D9C ^ 0x3DA5] = 0x3DFF ^ 0x3DA5;
        ConfigsCategoryComponent.C[0xCD98 ^ 0xCC82] = 0xEFA3 ^ 0xCC82;
        ConfigsCategoryComponent.C[0x7F9B ^ 0x7F1D] = 0xFFFF80B7 ^ 0x7F1D;
        ConfigsCategoryComponent.C[0xF36D ^ 0xF379] = 0xF305 ^ 0xF379;
        ConfigsCategoryComponent.C[0xCA07 ^ 0xCB87] = 0x37FD ^ 0xCB87;
        ConfigsCategoryComponent.C[0x4922 ^ 0x4865] = 0xFFFFBF06 ^ 0x4865;
        ConfigsCategoryComponent.C[0x3FD7 ^ 0x3F21] = 0x7373 ^ 0x3F21;
        ConfigsCategoryComponent.C[0x105E5 ^ 0x10568] = 0xFFFEFA80 ^ 0x10568;
        ConfigsCategoryComponent.C[0x54B5 ^ 0x546C] = 0xFFFFABA0 ^ 0x546C;
        ConfigsCategoryComponent.C[0x803E ^ 0x81B8] = 0x8758 ^ 0x81B8;
        ConfigsCategoryComponent.C[0x6B41 ^ 0x6A6E] = 0xFFFF2F00 ^ 0x6A6E;
        ConfigsCategoryComponent.C[0xC902 ^ 0xC87F] = 0x3401 ^ 0xC87F;
        ConfigsCategoryComponent.C[0x1725 ^ 0x17CA] = 0xBF58 ^ 0x17CA;
        ConfigsCategoryComponent.C[0x336D ^ 0x3219] = 0x2872 ^ 0x3219;
        ConfigsCategoryComponent.C[0x33EE ^ 0x32BD] = 0x599E ^ 0x32BD;
        ConfigsCategoryComponent.C[0xE800 ^ 0xE8A9] = 0xFFFF1773 ^ 0xE8A9;
        ConfigsCategoryComponent.C[0xB2C2 ^ 0xB222] = 0xB222 ^ 0xB222;
        ConfigsCategoryComponent.C[0x354E ^ 0x350E] = 0xFFFFCAD1 ^ 0x350E;
        ConfigsCategoryComponent.C[0xC31D ^ 0xC27A] = 0x9E48 ^ 0xC27A;
        ConfigsCategoryComponent.C[0x3FE6 ^ 0x3F0B] = 0xB459 ^ 0x3F0B;
        ConfigsCategoryComponent.C[0x122C ^ 0x1223] = 0xFFFFEDB1 ^ 0x1223;
        ConfigsCategoryComponent.C[0x33CE ^ 0x33DC] = 0xFFFFCC09 ^ 0x33DC;
        ConfigsCategoryComponent.C[0x87C1 ^ 0x87BB] = 0xFFFF786E ^ 0x87BB;
        ConfigsCategoryComponent.C[0x3851 ^ 0x3904] = 0x7710 ^ 0x3904;
        ConfigsCategoryComponent.C[0xEA7A ^ 0xEB1A] = 0x4F ^ 0xEB1A;
        ConfigsCategoryComponent.C[0x38E9 ^ 0x383E] = 0xFFFFC7DA ^ 0x383E;
        ConfigsCategoryComponent.C[0x2261 ^ 0x2347] = 0x2347 ^ 0x2347;
        ConfigsCategoryComponent.C[0xF26 ^ 0xF9F] = 0xFFFFF06B ^ 0xF9F;
        ConfigsCategoryComponent.C[0x2CE0 ^ 0x2D9A] = 0xA238 ^ 0x2D9A;
        ConfigsCategoryComponent.C[0x73B6 ^ 0x73BB] = 0xFFFF8C26 ^ 0x73BB;
        ConfigsCategoryComponent.C[0x301C ^ 0x3138] = 0xFA29 ^ 0x3138;
        ConfigsCategoryComponent.C[0x92B3 ^ 0x924C] = 0xF4D8 ^ 0x924C;
        ConfigsCategoryComponent.C[0xF3B1 ^ 0xF2AC] = 0xD18F ^ 0xF2AC;
        ConfigsCategoryComponent.C[0xCFDD ^ 0xCEAA] = 0xCF6E ^ 0xCEAA;
        ConfigsCategoryComponent.C[0xCAC1 ^ 0xCAFD] = 0xFFFF3549 ^ 0xCAFD;
        ConfigsCategoryComponent.C[0x2A36 ^ 0x2A62] = 0x2AD5 ^ 0x2A62;
        ConfigsCategoryComponent.C[0x5FCB ^ 0x5FB2] = 0xFFFFA06F ^ 0x5FB2;
        ConfigsCategoryComponent.C[0x584 ^ 0x4BD] = 0x7A6E ^ 0x4BD;
        ConfigsCategoryComponent.C[0x4EDD ^ 0x4E45] = 0x42B5 ^ 0x4E45;
        ConfigsCategoryComponent.C[0xAC9A ^ 0xADE2] = 0xAC4C ^ 0xADE2;
        ConfigsCategoryComponent.C[0x1D0A ^ 0x1DB8] = 0xFFFFE272 ^ 0x1DB8;
        ConfigsCategoryComponent.C[0x8753 ^ 0x87D3] = 0xFFFF7854 ^ 0x87D3;
        ConfigsCategoryComponent.C[0x78DC ^ 0x7840] = 0x6993 ^ 0x7840;
        ConfigsCategoryComponent.C[0x48BB ^ 0x481C] = 0xFFFFB789 ^ 0x481C;
        ConfigsCategoryComponent.C[0xB07A ^ 0xB145] = 0x94D1 ^ 0xB145;
        ConfigsCategoryComponent.C[0x30CE ^ 0x30D4] = 0xFFFFCF26 ^ 0x30D4;
        ConfigsCategoryComponent.C[0x6F68 ^ 0x6F29] = 0x6F79 ^ 0x6F29;
        ConfigsCategoryComponent.C[0x3B59 ^ 0x3B89] = 0x3BF7 ^ 0x3B89;
        ConfigsCategoryComponent.C[0x246C ^ 0x2454] = 0x244F ^ 0x2454;
        ConfigsCategoryComponent.C[0x5ED8 ^ 0x5E00] = 0xFFFFA1EE ^ 0x5E00;
        ConfigsCategoryComponent.C[0x3DA0 ^ 0x3CDB] = 0xB375 ^ 0x3CDB;
        ConfigsCategoryComponent.C[0x52ED ^ 0x536C] = 0x9D78 ^ 0x536C;
        ConfigsCategoryComponent.C[0xB4A ^ 0xB9F] = 0xBDD ^ 0xB9F;
        ConfigsCategoryComponent.C[0x2FD1 ^ 0x2ECE] = 0xD485 ^ 0x2ECE;
        ConfigsCategoryComponent.C[0x4E6F ^ 0x4E0A] = 0x4E64 ^ 0x4E0A;
        ConfigsCategoryComponent.C[0x1FD4 ^ 0x1F9E] = 0x1FB8 ^ 0x1F9E;
        ConfigsCategoryComponent.C[0xD753 ^ 0xD7A4] = 0x9BFA ^ 0xD7A4;
        ConfigsCategoryComponent.C[0x943C ^ 0x9539] = 0x69F6 ^ 0x9539;
        ConfigsCategoryComponent.C[0x4676 ^ 0x4766] = 0xE818 ^ 0x4766;
        ConfigsCategoryComponent.C[0xF413 ^ 0xF4AC] = 0xF4F1 ^ 0xF4AC;
        ConfigsCategoryComponent.C[0xD9D2 ^ 0xD890] = 0x93DF ^ 0xD890;
        ConfigsCategoryComponent.C[0x7441 ^ 0x7484] = 0xFFFF8B56 ^ 0x7484;
        ConfigsCategoryComponent.C[0xA8C3 ^ 0xA83F] = 0x49BE ^ 0xA83F;
        ConfigsCategoryComponent.C[0x61C1 ^ 0x60BD] = 0xEF1F ^ 0x60BD;
        ConfigsCategoryComponent.C[0xC553 ^ 0xC458] = 0xE0AD ^ 0xC458;
        ConfigsCategoryComponent.C[0xBC2A ^ 0xBC0D] = 0xBC55 ^ 0xBC0D;
        ConfigsCategoryComponent.C[0xABFE ^ 0xAB9C] = 0xFFFF542B ^ 0xAB9C;
        ConfigsCategoryComponent.C[0x3A45 ^ 0x3AE3] = 0x3AF6 ^ 0x3AE3;
        ConfigsCategoryComponent.C[0xB2DE ^ 0xB227] = 0xFE79 ^ 0xB227;
        ConfigsCategoryComponent.C[0x7837 ^ 0x786C] = 0x784B ^ 0x786C;
        ConfigsCategoryComponent.C[0xDF14 ^ 0xDF95] = 0xFFFF206B ^ 0xDF95;
        ConfigsCategoryComponent.C[0xF333 ^ 0xF3AE] = 0xBA57 ^ 0xF3AE;
        ConfigsCategoryComponent.C[0xA62E ^ 0xA644] = 0xA625 ^ 0xA644;
        ConfigsCategoryComponent.C[0x7182 ^ 0x71DD] = 0x7187 ^ 0x71DD;
        ConfigsCategoryComponent.C[0x38E7 ^ 0x386E] = 0x3835 ^ 0x386E;
        ConfigsCategoryComponent.C[0x16A2 ^ 0x17E6] = 0x5CA9 ^ 0x17E6;
        ConfigsCategoryComponent.C[0x9666 ^ 0x9657] = 0x9600 ^ 0x9657;
        ConfigsCategoryComponent.C[0x9D0B ^ 0x9C78] = 0x8667 ^ 0x9C78;
        ConfigsCategoryComponent.C[0x2448 ^ 0x24EA] = 0xDB44 ^ 0x24EA;
        ConfigsCategoryComponent.C[0xD11A ^ 0xD1FE] = 0x6D95 ^ 0xD1FE;
        ConfigsCategoryComponent.C[0x40A3 ^ 0x4182] = 0xBBC9 ^ 0x4182;
        ConfigsCategoryComponent.C[0x17FC ^ 0x16DC] = 0xFFFF1358 ^ 0x16DC;
        ConfigsCategoryComponent.C[0xC48E ^ 0xC582] = 0xE149 ^ 0xC582;
        ConfigsCategoryComponent.C[0xFD87 ^ 0xFD94] = 0xFFFF021D ^ 0xFD94;
        ConfigsCategoryComponent.C[0x8D78 ^ 0x8D08] = 0xFFFF72EE ^ 0x8D08;
        ConfigsCategoryComponent.C[0x1C8B ^ 0x1CC6] = 0x1CC0 ^ 0x1CC6;
        ConfigsCategoryComponent.C[0x18A4 ^ 0x192C] = 0x1FCC ^ 0x192C;
        ConfigsCategoryComponent.C[0x2647 ^ 0x269D] = 0x26FB ^ 0x269D;
        ConfigsCategoryComponent.C[0x1E01 ^ 0x1E62] = 0x1E45 ^ 0x1E62;
        ConfigsCategoryComponent.C[0xC7E2 ^ 0xC725] = 0xC706 ^ 0xC725;
        ConfigsCategoryComponent.C[0x102D4 ^ 0x1026C] = 0xFFFEFDB3 ^ 0x1026C;
        ConfigsCategoryComponent.C[0x39EF ^ 0x39F2] = 0x39E0 ^ 0x39F2;
        ConfigsCategoryComponent.C[0x50F8 ^ 0x51E0] = 0xB334 ^ 0x51E0;
        ConfigsCategoryComponent.C[0x3B47 ^ 0x3BD6] = 0x3BD6 ^ 0x3BD6;
        ConfigsCategoryComponent.C[0xE3AD ^ 0xE3F4] = 0xE3CE ^ 0xE3F4;
        ConfigsCategoryComponent.C[0x10D04 ^ 0x10D1A] = 0xFFFEF25B ^ 0x10D1A;
        ConfigsCategoryComponent.C[0x2933 ^ 0x29A6] = 0x29A6 ^ 0x29A6;
        ConfigsCategoryComponent.C[0xC58 ^ 0xD70] = 0x98DF ^ 0xD70;
        ConfigsCategoryComponent.C[0x10F60 ^ 0x10EE4] = 0x1C0FC ^ 0x10EE4;
        ConfigsCategoryComponent.C[0x4567 ^ 0x455D] = 0x455F ^ 0x455D;
        ConfigsCategoryComponent.C[0x58E8 ^ 0x586D] = 0xFFFFA7B0 ^ 0x586D;
        ConfigsCategoryComponent.C[0x5120 ^ 0x5028] = 0xFFFEA703 ^ 0x5028;
        ConfigsCategoryComponent.C[0x793E ^ 0x79FA] = 0x79D0 ^ 0x79FA;
        ConfigsCategoryComponent.C[0xE668 ^ 0xE70B] = 0xFFFF7716 ^ 0xE70B;
        ConfigsCategoryComponent.C[0x6346 ^ 0x6333] = 0xFFFF9CC4 ^ 0x6333;
        ConfigsCategoryComponent.C[0xBA2A ^ 0xBA43] = 0xFFFF45F8 ^ 0xBA43;
        ConfigsCategoryComponent.C[0xD4A5 ^ 0xD5FC] = 0x1D40E ^ 0xD5FC;
        ConfigsCategoryComponent.C[0x4A76 ^ 0x4AB5] = 0x4AA1 ^ 0x4AB5;
        ConfigsCategoryComponent.C[0xE816 ^ 0xE994] = 0x278C ^ 0xE994;
        ConfigsCategoryComponent.C[0xA02E ^ 0xA165] = 0x1F0C ^ 0xA165;
        ConfigsCategoryComponent.C[0x6DD1 ^ 0x6D07] = 0xFFFF9281 ^ 0x6D07;
        ConfigsCategoryComponent.C[0x7686 ^ 0x77AB] = 0xCD59 ^ 0x77AB;
        ConfigsCategoryComponent.C[0xCF1E ^ 0xCE60] = 0x321A ^ 0xCE60;
        ConfigsCategoryComponent.C[0x23CE ^ 0x231F] = 0xFFFFDCDF ^ 0x231F;
        ConfigsCategoryComponent.C[0xD44C ^ 0xD459] = 0xD449 ^ 0xD459;
        ConfigsCategoryComponent.C[0x4AB9 ^ 0x4BAE] = 0xA90D ^ 0x4BAE;
        ConfigsCategoryComponent.C[0x32DC ^ 0x33E6] = 0x4D30 ^ 0x33E6;
        ConfigsCategoryComponent.C[0xBB99 ^ 0xBB9F] = 0xFFFF4451 ^ 0xBB9F;
        ConfigsCategoryComponent.C[0x97E3 ^ 0x96D7] = 0x997B ^ 0x96D7;
        ConfigsCategoryComponent.C[0xAFE7 ^ 0xAF4B] = 0xAF6A ^ 0xAF4B;
        ConfigsCategoryComponent.C[0x961D ^ 0x972B] = 0x1490 ^ 0x972B;
        ConfigsCategoryComponent.C[0x61CF ^ 0x6143] = 0xFFFF9EF6 ^ 0x6143;
        ConfigsCategoryComponent.C[0x35B1 ^ 0x354B] = 0xD4E5 ^ 0x354B;
        ConfigsCategoryComponent.C[0x419B ^ 0x408F] = 0x5AF9 ^ 0x408F;
        ConfigsCategoryComponent.C[0xFBA0 ^ 0xFBDD] = 0xFFFF041D ^ 0xFBDD;
        ConfigsCategoryComponent.C[0x797E ^ 0x79CD] = 0x79B5 ^ 0x79CD;
        ConfigsCategoryComponent.C[0xF22A ^ 0xF37C] = 0xBD69 ^ 0xF37C;
        ConfigsCategoryComponent.C[0x878 ^ 0x8C4] = 0xFFFFF707 ^ 0x8C4;
        ConfigsCategoryComponent.C[0xC1A ^ 0xD93] = 0xA7D8 ^ 0xD93;
        ConfigsCategoryComponent.C[0x1AC4 ^ 0x1A36] = 0xCF30 ^ 0x1A36;
        ConfigsCategoryComponent.C[0x4F6F ^ 0x4F6B] = 0x4F5F ^ 0x4F6B;
        ConfigsCategoryComponent.C[0x5786 ^ 0x571D] = 0x840E ^ 0x571D;
        ConfigsCategoryComponent.C[0xEEC8 ^ 0xEE7E] = 0xFFFF1187 ^ 0xEE7E;
        ConfigsCategoryComponent.C[0x53AA ^ 0x5300] = 0xFFFFACE7 ^ 0x5300;
        ConfigsCategoryComponent.C[0x68C6 ^ 0x69EC] = 0xA5DD ^ 0x69EC;
        ConfigsCategoryComponent.C[0x10133 ^ 0x1004A] = 0x18FEF ^ 0x1004A;
        ConfigsCategoryComponent.C[0x4C2 ^ 0x5A8] = 0x10DD9 ^ 0x5A8;
        ConfigsCategoryComponent.C[0x5D8A ^ 0x5CD2] = 0x12C7 ^ 0x5CD2;
        ConfigsCategoryComponent.C[0x2018 ^ 0x2034] = 0x203B ^ 0x2034;
        ConfigsCategoryComponent.C[0x10894 ^ 0x10859] = 0x10832 ^ 0x10859;
        ConfigsCategoryComponent.C[0xD4F0 ^ 0xD5AF] = 0xFFFFC17C ^ 0xD5AF;
        ConfigsCategoryComponent.C[0xCDBC ^ 0xCDF7] = 0xCD6B ^ 0xCDF7;
        ConfigsCategoryComponent.C[0x4384 ^ 0x437A] = 0x25ED ^ 0x437A;
        ConfigsCategoryComponent.C[0xF69B ^ 0xF789] = 0xEDA3 ^ 0xF789;
        ConfigsCategoryComponent.C[0x82F3 ^ 0x82B7] = 0xFFFF7D30 ^ 0x82B7;
        ConfigsCategoryComponent.C[0x56A5 ^ 0x57A7] = 0xAB62 ^ 0x57A7;
        ConfigsCategoryComponent.C[0xF5E ^ 0xE18] = 0x6DC ^ 0xE18;
        ConfigsCategoryComponent.C[0xBAE0 ^ 0xBA45] = 0xBA33 ^ 0xBA45;
        ConfigsCategoryComponent.C[0xF49E ^ 0xF597] = 0x1FD19 ^ 0xF597;
        ConfigsCategoryComponent.C[0x54B3 ^ 0x549B] = 0xFFFFAB37 ^ 0x549B;
        ConfigsCategoryComponent.C[0x69F ^ 0x6BF] = 0xFFFFF92D ^ 0x6BF;
        ConfigsCategoryComponent.C[0xD64E ^ 0xD6AB] = 0x6AD0 ^ 0xD6AB;
        ConfigsCategoryComponent.C[0x5017 ^ 0x514A] = 0xBA12 ^ 0x514A;
        ConfigsCategoryComponent.C[0x107F6 ^ 0x107E9] = 0xFFFEF866 ^ 0x107E9;
        ConfigsCategoryComponent.C[0x4D1A ^ 0x4D2A] = 0x4D55 ^ 0x4D2A;
        ConfigsCategoryComponent.C[0xD19D ^ 0xD1FC] = 0xD1B4 ^ 0xD1FC;
        ConfigsCategoryComponent.C[0xA415 ^ 0xA550] = 0xAD89 ^ 0xA550;
        ConfigsCategoryComponent.C[0x208F ^ 0x2099] = 0xFFFFDF40 ^ 0x2099;
        ConfigsCategoryComponent.C[0x1733 ^ 0x17B4] = 0x17A1 ^ 0x17B4;
        ConfigsCategoryComponent.C[0x3F8E ^ 0x3EDA] = 0x55E4 ^ 0x3EDA;
        ConfigsCategoryComponent.C[0x3994 ^ 0x389B] = 0x9783 ^ 0x389B;
        ConfigsCategoryComponent.C[0xC360 ^ 0xC250] = 0x78B2 ^ 0xC250;
        ConfigsCategoryComponent.C[0x8654 ^ 0x8605] = 0x86B0 ^ 0x8605;
        ConfigsCategoryComponent.C[0xD945 ^ 0xD912] = 0xD90B ^ 0xD912;
        ConfigsCategoryComponent.C[0x8367 ^ 0x824C] = 0xFFFFB1E4 ^ 0x824C;
        ConfigsCategoryComponent.C[0xE84C ^ 0xE892] = 0xE893 ^ 0xE892;
        ConfigsCategoryComponent.C[0x58F6 ^ 0x59BE] = 0x517A ^ 0x59BE;
        ConfigsCategoryComponent.C[0x777D ^ 0x777C] = 0xFFFF889F ^ 0x777C;
        ConfigsCategoryComponent.C[0xA529 ^ 0xA42E] = 0x1ACA0 ^ 0xA42E;
        ConfigsCategoryComponent.C[0x817F ^ 0x8047] = 0x3FC ^ 0x8047;
        ConfigsCategoryComponent.C[0xA81C ^ 0xA85B] = 0xFFFF57F8 ^ 0xA85B;
        ConfigsCategoryComponent.C[0x1A1C ^ 0x1A53] = 0x1A33 ^ 0x1A53;
        ConfigsCategoryComponent.C[0xE393 ^ 0xE2A0] = 0xED51 ^ 0xE2A0;
        ConfigsCategoryComponent.C[0x98FA ^ 0x9854] = 0x9846 ^ 0x9854;
        ConfigsCategoryComponent.C[0x3C66 ^ 0x3C96] = 0x9402 ^ 0x3C96;
        ConfigsCategoryComponent.C[0x3E88 ^ 0x3EDB] = 0x3EA6 ^ 0x3EDB;
        ConfigsCategoryComponent.C[0xD6F2 ^ 0xD65D] = 0xFFFF29AB ^ 0xD65D;
        ConfigsCategoryComponent.C[0x3748 ^ 0x37DB] = 0x37DB ^ 0x37DB;
        ConfigsCategoryComponent.C[0x1154 ^ 0x11BA] = 0xB92F ^ 0x11BA;
        ConfigsCategoryComponent.C[0x8A38 ^ 0x8AEA] = 0xFFFF7531 ^ 0x8AEA;
        ConfigsCategoryComponent.C[0xD35A ^ 0xD356] = 0xFFFF2CE6 ^ 0xD356;
        ConfigsCategoryComponent.C[0x9715 ^ 0x9709] = 0xFFFF68C7 ^ 0x9709;
        ConfigsCategoryComponent.C[0x4F1F ^ 0x4F88] = 0x4FD0 ^ 0x4F88;
        ConfigsCategoryComponent.C[0x10746 ^ 0x10663] = 0x1CD4B ^ 0x10663;
        ConfigsCategoryComponent.C[0xC72B ^ 0xC7E4] = 0xC7BA ^ 0xC7E4;
        ConfigsCategoryComponent.C[0x1078B ^ 0x10688] = 0x1FA47 ^ 0x10688;
        ConfigsCategoryComponent.C[0x598E ^ 0x588F] = 0x3E1B ^ 0x588F;
        ConfigsCategoryComponent.C[0xFE78 ^ 0xFF63] = 0xDC40 ^ 0xFF63;
        ConfigsCategoryComponent.C[0xD0CA ^ 0xD049] = 0xFFFF2F85 ^ 0xD049;
        ConfigsCategoryComponent.C[0x5DAE ^ 0x5CF2] = 0x15D03 ^ 0x5CF2;
        ConfigsCategoryComponent.C[0x10FC9 ^ 0x10EA6] = 0xFFFFF97B ^ 0x10EA6;
        ConfigsCategoryComponent.C[0xD5C2 ^ 0xD529] = 0x5E7B ^ 0xD529;
        ConfigsCategoryComponent.C[0xCE82 ^ 0xCEFE] = 0xFFFF3116 ^ 0xCEFE;
        ConfigsCategoryComponent.C[0x66FB ^ 0x6770] = 0xCD6A ^ 0x6770;
        ConfigsCategoryComponent.C[0xADA2 ^ 0xACC0] = 0xC324 ^ 0xACC0;
        ConfigsCategoryComponent.C[0x216B ^ 0x206B] = 0x46B2 ^ 0x206B;
        ConfigsCategoryComponent.C[0x24F4 ^ 0x2476] = 0x2444 ^ 0x2476;
        ConfigsCategoryComponent.C[0x10DEF ^ 0x10D89] = 0xFFFEF23B ^ 0x10D89;
        ConfigsCategoryComponent.C[0xA232 ^ 0xA288] = 0xFFFF5D2E ^ 0xA288;
        ConfigsCategoryComponent.C[0x35F ^ 0x3AA] = 0xD6A1 ^ 0x3AA;
        ConfigsCategoryComponent.C[0xCD3F ^ 0xCD49] = 0xFFFF32B6 ^ 0xCD49;
        ConfigsCategoryComponent.C[0x6ADE ^ 0x6BB6] = 0x37FF ^ 0x6BB6;
        ConfigsCategoryComponent.C[0x8B97 ^ 0x8AD6] = 0xC199 ^ 0x8AD6;
        ConfigsCategoryComponent.C[0x8F72 ^ 0x8F00] = 0x8F53 ^ 0x8F00;
        ConfigsCategoryComponent.C[0xC53A ^ 0xC532] = 0xFFFF3A81 ^ 0xC532;
        ConfigsCategoryComponent.C[0x3BE0 ^ 0x3A86] = 0x66CF ^ 0x3A86;
        ConfigsCategoryComponent.C[0x9873 ^ 0x9856] = 0xFFFF67E9 ^ 0x9856;
        ConfigsCategoryComponent.C[0xFDD1 ^ 0xFDF2] = 0xFFFF0210 ^ 0xFDF2;
        ConfigsCategoryComponent.C[0x191B ^ 0x184A] = 0x737B ^ 0x184A;
        ConfigsCategoryComponent.C[0x5C94 ^ 0x5CF8] = 0xFFFFA337 ^ 0x5CF8;
        ConfigsCategoryComponent.C[0xA18F ^ 0xA0FA] = 0xA156 ^ 0xA0FA;
        ConfigsCategoryComponent.C[0xEBC9 ^ 0xEA92] = 0xFFFE14C6 ^ 0xEA92;
        ConfigsCategoryComponent.C[0x8379 ^ 0x8395] = 0xFFFFF756 ^ 0x8395;
        ConfigsCategoryComponent.C[0x7234 ^ 0x7278] = 0x720E ^ 0x7278;
        ConfigsCategoryComponent.C[0xFBAA ^ 0xFBE4] = 0xFBB9 ^ 0xFBE4;
        ConfigsCategoryComponent.C[0xC23A ^ 0xC205] = 0xFFFF3DD6 ^ 0xC205;
        ConfigsCategoryComponent.C[0xECA8 ^ 0xED93] = 0xFFFF6CBA ^ 0xED93;
        ConfigsCategoryComponent.C[0x10ACC ^ 0x10B8C] = 0x12E47 ^ 0x10B8C;
        ConfigsCategoryComponent.C[0xE6A9 ^ 0xE7E4] = 0x49A1 ^ 0xE7E4;
        ConfigsCategoryComponent.C[0xFA55 ^ 0xFA5C] = 0xFA54 ^ 0xFA5C;
        ConfigsCategoryComponent.C[0xA69C ^ 0xA64F] = 0xFFFF5982 ^ 0xA64F;
        ConfigsCategoryComponent.C[0xA660 ^ 0xA66B] = 0xA66F ^ 0xA66B;
        ConfigsCategoryComponent.C[0x551 ^ 0x56A] = 0xFFFFFAA2 ^ 0x56A;
        ConfigsCategoryComponent.C[0xE738 ^ 0xE7F9] = 0xFFFF184C ^ 0xE7F9;
        ConfigsCategoryComponent.C[0x4A39 ^ 0x4AF1] = 0x4AEA ^ 0x4AF1;
        ConfigsCategoryComponent.C[0xBB82 ^ 0xBBA4] = 0xBB8F ^ 0xBBA4;
        ConfigsCategoryComponent.C[0x23FF ^ 0x23AA] = 0xFFFFDC0C ^ 0x23AA;
        ConfigsCategoryComponent.C[0xFF31 ^ 0xFF13] = 0xFFFF00E4 ^ 0xFF13;
        ConfigsCategoryComponent.C[0xBE74 ^ 0xBE65] = 0xBE2F ^ 0xBE65;
        ConfigsCategoryComponent.C[0x1D95 ^ 0x1CFB] = 0x11481 ^ 0x1CFB;
        ConfigsCategoryComponent.C[0xA258 ^ 0xA364] = 0xDDB2 ^ 0xA364;
        ConfigsCategoryComponent.C[0xB270 ^ 0xB292] = 0xB293 ^ 0xB292;
        ConfigsCategoryComponent.C[0xE640 ^ 0xE6A7] = 0x68AB ^ 0xE6A7;
        ConfigsCategoryComponent.C[0xB948 ^ 0xB9D1] = 0x7D81 ^ 0xB9D1;
        ConfigsCategoryComponent.C[0xDFD5 ^ 0xDF15] = 0xDFFC ^ 0xDF15;
        ConfigsCategoryComponent.C[0xAC73 ^ 0xACFB] = 0xACB2 ^ 0xACFB;
        ConfigsCategoryComponent.C[0x10358 ^ 0x1036A] = 0x10342 ^ 0x1036A;
        ConfigsCategoryComponent.C[0xF26B ^ 0xF37D] = 0x11DF ^ 0xF37D;
        ConfigsCategoryComponent.C[0xCF75 ^ 0xCFD4] = 0x2B88 ^ 0xCFD4;
        ConfigsCategoryComponent.C[0x84E6 ^ 0x8499] = 0x849A ^ 0x8499;
        ConfigsCategoryComponent.C[0x3DD0 ^ 0x3D24] = 0xFFFF1783 ^ 0x3D24;
        ConfigsCategoryComponent.C[0x201F ^ 0x2022] = 0xFFFFDFAE ^ 0x2022;
        ConfigsCategoryComponent.C[0xE5AB ^ 0xE5C6] = 0xE5D0 ^ 0xE5C6;
        ConfigsCategoryComponent.C[0xBBC9 ^ 0xBB3A] = 0x6E31 ^ 0xBB3A;
        ConfigsCategoryComponent.C[0xABAD ^ 0xAADD] = 0x1A2A7 ^ 0xAADD;
        ConfigsCategoryComponent.C[0xB2A5 ^ 0xB243] = 0x3C47 ^ 0xB243;
        ConfigsCategoryComponent.C[0xD749 ^ 0xD70C] = 0xFFFF285D ^ 0xD70C;
        ConfigsCategoryComponent.C[0x1925 ^ 0x19D4] = 0xB146 ^ 0x19D4;
        ConfigsCategoryComponent.C[0x10355 ^ 0x1037F] = 0x1032D ^ 0x1037F;
        ConfigsCategoryComponent.C[0x6886 ^ 0x68B1] = 0xFFFF974E ^ 0x68B1;
        ConfigsCategoryComponent.C[0xFE0D ^ 0xFF5D] = 0x5107 ^ 0xFF5D;
        ConfigsCategoryComponent.C[0x1265 ^ 0x128D] = 0x9CBB ^ 0x128D;
        ConfigsCategoryComponent.C[0x54CF ^ 0x5541] = 0xB120 ^ 0x5541;
        ConfigsCategoryComponent.C[0x3CB2 ^ 0x3D8C] = 0x1847 ^ 0x3D8C;
        ConfigsCategoryComponent.C[0x22A3 ^ 0x226D] = 0xFFFFDDCC ^ 0x226D;
        ConfigsCategoryComponent.C[0xA3D5 ^ 0xA256] = 0x6C1A ^ 0xA256;
        ConfigsCategoryComponent.C[0xEE1F ^ 0xEE0F] = 0xFFFF11D6 ^ 0xEE0F;
        ConfigsCategoryComponent.C[0xACFE ^ 0xAC6A] = 0xAC68 ^ 0xAC6A;
        ConfigsCategoryComponent.C[0x6B52 ^ 0x6B94] = 0xFFFF9476 ^ 0x6B94;
        ConfigsCategoryComponent.C[0x7E47 ^ 0x7F19] = 0x944C ^ 0x7F19;
        ConfigsCategoryComponent.C[0xEFBC ^ 0xEFFF] = 0xFFFF1060 ^ 0xEFFF;
        ConfigsCategoryComponent.C[0x1956 ^ 0x1941] = 0xFFFFE6E8 ^ 0x1941;
        ConfigsCategoryComponent.C[0xE955 ^ 0xE9E1] = 0xFFFF1656 ^ 0xE9E1;
        ConfigsCategoryComponent.C[0x6893 ^ 0x685F] = 0x684B ^ 0x685F;
        ConfigsCategoryComponent.C[0x4C72 ^ 0x4D40] = 0x42EC ^ 0x4D40;
        ConfigsCategoryComponent.C[0x10961 ^ 0x109C5] = 0x109C5 ^ 0x109C5;
        ConfigsCategoryComponent.C[0x51E0 ^ 0x51E2] = 0x51FC ^ 0x51E2;
        ConfigsCategoryComponent.C[0xB75F ^ 0xB610] = 0xFFFFE786 ^ 0xB610;
        ConfigsCategoryComponent.C[0x9006 ^ 0x90FD] = 0x7157 ^ 0x90FD;
        ConfigsCategoryComponent.C[0xEDD2 ^ 0xEDB5] = 0xEDE7 ^ 0xEDB5;
        ConfigsCategoryComponent.C[0x6F75 ^ 0x6E03] = 0x6FAD ^ 0x6E03;
        ConfigsCategoryComponent.C[0x5551 ^ 0x5503] = 0xFFFFAACB ^ 0x5503;
        ConfigsCategoryComponent.C[0x9C90 ^ 0x9CD2] = 0xFFFF63F4 ^ 0x9CD2;
        ConfigsCategoryComponent.C[0xF8C0 ^ 0xF9D9] = 0x1B7A ^ 0xF9D9;
        ConfigsCategoryComponent.C[0x10AF2 ^ 0x10ACC] = 0xFFFEF524 ^ 0x10ACC;
        ConfigsCategoryComponent.C[0x6400 ^ 0x654A] = 0xDB75 ^ 0x654A;
        ConfigsCategoryComponent.C[0x3A14 ^ 0x3ADF] = 0xFFFFC513 ^ 0x3ADF;
        ConfigsCategoryComponent.C[0xFA90 ^ 0xFA27] = 0xFFFF05F3 ^ 0xFA27;
        ConfigsCategoryComponent.C[0x98FC ^ 0x9873] = 0x987D ^ 0x9873;
        ConfigsCategoryComponent.C[0xFCFE ^ 0xFC95] = 0xFFFF034E ^ 0xFC95;
        ConfigsCategoryComponent.C[0xC45D ^ 0xC46B] = 0xC46D ^ 0xC46B;
        ConfigsCategoryComponent.C[0x7F1B ^ 0x7FB6] = 0x7FF5 ^ 0x7FB6;
        ConfigsCategoryComponent.C[0x7EBB ^ 0x7EDB] = 0x7EC0 ^ 0x7EDB;
        ConfigsCategoryComponent.C[0xBBD8 ^ 0xBAA9] = 0xA0C4 ^ 0xBAA9;
        ConfigsCategoryComponent.C[0x5389 ^ 0x53FE] = 0xFFFFAC08 ^ 0x53FE;
        ConfigsCategoryComponent.C[0x32F3 ^ 0x3219] = 0xB940 ^ 0x3219;
        ConfigsCategoryComponent.C[0x374 ^ 0x2F8] = 0xA8AB ^ 0x2F8;
        ConfigsCategoryComponent.C[0x778F ^ 0x76AC] = 0xBD84 ^ 0x76AC;
        ConfigsCategoryComponent.C[0xFE8B ^ 0xFFA2] = 0x3382 ^ 0xFFA2;
        ConfigsCategoryComponent.C[0x92EB ^ 0x92B3] = 0x92B2 ^ 0x92B3;
        ConfigsCategoryComponent.C[0xBCC6 ^ 0xBC56] = 0xBC55 ^ 0xBC56;
        ConfigsCategoryComponent.C[0x9FD ^ 0x882] = 0xF4FD ^ 0x882;
        ConfigsCategoryComponent.C[0x3F24 ^ 0x3F05] = 0x3F30 ^ 0x3F05;
        ConfigsCategoryComponent.C[0x514E ^ 0x51E6] = 0x51CB ^ 0x51E6;
        ConfigsCategoryComponent.C[0xBCB7 ^ 0xBC75] = 0xFFFF43F7 ^ 0xBC75;
        ConfigsCategoryComponent.C[0x1719 ^ 0x1655] = 0xA86A ^ 0x1655;
        ConfigsCategoryComponent.C[0x7A0A ^ 0x7A56] = 0x7A6F ^ 0x7A56;
        ConfigsCategoryComponent.C[0xD66C ^ 0xD68F] = 0xD68F ^ 0xD68F;
        ConfigsCategoryComponent.C[0xE151 ^ 0xE120] = 0xFFFF1E85 ^ 0xE120;
        ConfigsCategoryComponent.C[0x5C75 ^ 0x5C1B] = 0x5C3C ^ 0x5C1B;
        ConfigsCategoryComponent.C[0x5DB0 ^ 0x5DCB] = 0xFFFFA213 ^ 0x5DCB;
        ConfigsCategoryComponent.C[0xA8A9 ^ 0xA9E0] = 0x17D6 ^ 0xA9E0;
        ConfigsCategoryComponent.C[0x8732 ^ 0x8610] = 0x4D37 ^ 0x8610;
        ConfigsCategoryComponent.C[0x4CE4 ^ 0x4C60] = 0xFFFFB3AD ^ 0x4C60;
        ConfigsCategoryComponent.C[0xABCD ^ 0xAAA9] = 0xC54D ^ 0xAAA9;
        ConfigsCategoryComponent.C[0x90BA ^ 0x9031] = 0xFFFF6FEC ^ 0x9031;
        ConfigsCategoryComponent.C[0x4221 ^ 0x422B] = 0x4228 ^ 0x422B;
        ConfigsCategoryComponent.C[0x1091B ^ 0x109D2] = 0xFFFEF6AA ^ 0x109D2;
        ConfigsCategoryComponent.C[0xED76 ^ 0xEC68] = 0x1626 ^ 0xEC68;
        ConfigsCategoryComponent.C[0x10F47 ^ 0x10EC8] = 0xFFFE1509 ^ 0x10EC8;
        ConfigsCategoryComponent.C[0xE1A1 ^ 0xE1C5] = 0xFFFF1E4E ^ 0xE1C5;
        ConfigsCategoryComponent.C[0x409D ^ 0x4060] = 0xA1CA ^ 0x4060;
        ConfigsCategoryComponent.C[0x85DC ^ 0x85F1] = 0x859C ^ 0x85F1;
        ConfigsCategoryComponent.C[0x434E ^ 0x425B] = 0x5877 ^ 0x425B;
        ConfigsCategoryComponent.C[0x1E99 ^ 0x1F85] = 0x3CF8 ^ 0x1F85;
        ConfigsCategoryComponent.C[0x3704 ^ 0x379A] = 0x15A3 ^ 0x379A;
        ConfigsCategoryComponent.C[0x1E9E ^ 0x1FF3] = 0x1179A ^ 0x1FF3;
        ConfigsCategoryComponent.C[0xA016 ^ 0xA068] = 0xFFFF5FE3 ^ 0xA068;
        ConfigsCategoryComponent.C[0x291C ^ 0x2964] = 0xFFFFD69D ^ 0x2964;
        ConfigsCategoryComponent.C[0xEBA6 ^ 0xEAA8] = 0x45B9 ^ 0xEAA8;
        ConfigsCategoryComponent.C[0x36D1 ^ 0x3664] = 0xFFFFC9CA ^ 0x3664;
        ConfigsCategoryComponent.C[0x17C ^ 0x148] = 0xFFFFFEA0 ^ 0x148;
        ConfigsCategoryComponent.C[0x52BE ^ 0x5383] = 0x7653 ^ 0x5383;
        ConfigsCategoryComponent.C[0x7AA1 ^ 0x7B26] = 0xFFFF827E ^ 0x7B26;
        ConfigsCategoryComponent.C[0x241F ^ 0x2442] = 0x2412 ^ 0x2442;
        ConfigsCategoryComponent.C[0x7480 ^ 0x7454] = 0xFFFF8BDC ^ 0x7454;
        ConfigsCategoryComponent.C[0x126D ^ 0x123D] = 0xFFFFEDF9 ^ 0x123D;
        ConfigsCategoryComponent.C[0xD2E0 ^ 0xD294] = 0xD2DB ^ 0xD294;
        ConfigsCategoryComponent.C[0x10031 ^ 0x101BC] = 0x1E5C9 ^ 0x101BC;
        ConfigsCategoryComponent.C[0x8E3D ^ 0x8F3B] = 0x187B5 ^ 0x8F3B;
        ConfigsCategoryComponent.C[0xA7E3 ^ 0xA68A] = 0x1AEE2 ^ 0xA68A;
        ConfigsCategoryComponent.C[0xED2E ^ 0xED78] = 0xFFFF12BB ^ 0xED78;
        ConfigsCategoryComponent.C[0x75B8 ^ 0x7432] = 0xDE61 ^ 0x7432;
        ConfigsCategoryComponent.C[0xDB12 ^ 0xDA73] = 0xB589 ^ 0xDA73;
        ConfigsCategoryComponent.C[0xAF7D ^ 0xAF7D] = 0x7FFF5082 ^ 0xAF7D;
        ConfigsCategoryComponent.C[0x82E3 ^ 0x83D4] = 0x4C ^ 0x83D4;
        ConfigsCategoryComponent.C[0x1E98 ^ 0x1E47] = 0x1E45 ^ 0x1E47;
        ConfigsCategoryComponent.C[0xB098 ^ 0xB1BF] = 0x2430 ^ 0xB1BF;
        ConfigsCategoryComponent.C[0xFA12 ^ 0xFA21] = 0xFFFF058D ^ 0xFA21;
        ConfigsCategoryComponent.C[0xA8E1 ^ 0xA86B] = 0xFFFF57FB ^ 0xA86B;
        ConfigsCategoryComponent.C[0x6359 ^ 0x6311] = 0x6354 ^ 0x6311;
        ConfigsCategoryComponent.C[0xC602 ^ 0xC62D] = 0xFFFF39E8 ^ 0xC62D;
        ConfigsCategoryComponent.C[0xFCCA ^ 0xFC90] = 0xFCA2 ^ 0xFC90;
        ConfigsCategoryComponent.C[0xAEE ^ 0xBAD] = 0x40CC ^ 0xBAD;
        ConfigsCategoryComponent.C[0xFDCE ^ 0xFD70] = 0xFD17 ^ 0xFD70;
        ConfigsCategoryComponent.C[0x42A7 ^ 0x4231] = 0x4231 ^ 0x4231;
        ConfigsCategoryComponent.C[0x10E53 ^ 0x10E48] = 0x10E0C ^ 0x10E48;
        ConfigsCategoryComponent.C[0x31C1 ^ 0x311A] = 0x31F7 ^ 0x311A;
        ConfigsCategoryComponent.C[0xB2BD ^ 0xB206] = 0xB243 ^ 0xB206;
        ConfigsCategoryComponent.C[0xC944 ^ 0xC81E] = 0x1C9EF ^ 0xC81E;
        ConfigsCategoryComponent.C[0xD832 ^ 0xD8AD] = 0x9E67 ^ 0xD8AD;
        ConfigsCategoryComponent.C[0x262 ^ 0x27B] = 0xFFFFFD94 ^ 0x27B;
        ConfigsCategoryComponent.C[0x7622 ^ 0x76DA] = 0xFFFFC57E ^ 0x76DA;
        ConfigsCategoryComponent.C[0x4A0D ^ 0x4A29] = 0xFFFFB5DD ^ 0x4A29;
        ConfigsCategoryComponent.C[0x5F22 ^ 0x5FB0] = 0x5FB1 ^ 0x5FB0;
        ConfigsCategoryComponent.C[0x9450 ^ 0x95D5] = 0x9327 ^ 0x95D5;
        ConfigsCategoryComponent.C[0x46B ^ 0x465] = 0x448 ^ 0x465;
    }
}

