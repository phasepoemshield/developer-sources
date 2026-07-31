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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.ScissorUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.ModuleManager;
import kotakbaz.rain.ui.api.UIComponent;
import kotakbaz.rain.ui.menu.ContentArea;
import kotakbaz.rain.ui.menu.MenuStyle;
import kotakbaz.rain.ui.menu.ModuleComponent;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u0015J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0004\u00a2\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004\u00a2\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0004\u00a2\u0006\u0004\b'\u0010%J\r\u0010(\u001a\u00020\u0004\u00a2\u0006\u0004\b(\u0010%J]\u00101\u001a\u00020\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002\u00a2\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b5\u0010\u000fJ/\u0010:\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0)H\u0002\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b?\u0010\u000fJ\u000f\u0010@\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0002\u00a2\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020<0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR$\u0010O\u001a\u0012\u0012\u0004\u0012\u00020*0Mj\b\u0012\u0004\u0012\u00020*`N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020*0Mj\b\u0012\u0004\u0012\u00020*`N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010JR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bX\u0010JR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010V\u00a8\u0006Z"}, d2={"Lkotakbaz/rain/ui/menu/CategoryComponent;", "Lkotakbaz/rain/ui/api/UIComponent;", "Lkotakbaz/rain/client/extensions/Category;", "category", "", "panelWidth", "contentTopOffset", "<init>", "(Lkotakbaz/rain/client/extensions/Category;FF)V", "", "query", "", "setSearchQuery", "(Ljava/lang/String;)V", "resetScroll", "()V", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "onKeyPress", "vertical", "onMouseScroll", "scrollWheel", "(F)V", "progress", "", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "scrollMaxValue", "", "Lkotakbaz/rain/ui/menu/ModuleComponent;", "list", "startX", "startY", "width", "clipTop", "clipBottom", "renderColumn", "(Ljava/util/List;FFFFFIIF)V", "columnHeight", "(Ljava/util/List;)F", "rebuildColumns", "contentLeft", "contentTop", "contentWidth", "contentHeight", "renderEmptyState", "(FFFF)V", "Lkotakbaz/rain/module/Module;", "filteredModules", "()Ljava/util/List;", "refreshVisibleModulesIfNeeded", "currentModuleSignature", "()Ljava/lang/String;", "insideContent", "(FF)Z", "Lkotakbaz/rain/ui/menu/ContentArea;", "contentArea", "()Lkotakbaz/rain/ui/menu/ContentArea;", "Lkotakbaz/rain/client/extensions/Category;", "getCategory", "()Lkotakbaz/rain/client/extensions/Category;", "F", "categoryModules", "Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "leftColumn", "Ljava/util/ArrayList;", "rightColumn", "Lkotakbaz/rain/client/util/other/ScrollUtil;", "scroll", "Lkotakbaz/rain/client/util/other/ScrollUtil;", "normalizedSearch", "Ljava/lang/String;", "cachedTotalHeight", "cachedViewHeight", "lastModuleSignature", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nCategoryComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryComponent.kt\nkotakbaz/rain/ui/menu/CategoryComponent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n777#2:248\n873#2,2:249\n1915#2,2:251\n1915#2,2:253\n1915#2,2:255\n1915#2,2:257\n1915#2,2:259\n1915#2,2:261\n1915#2,2:263\n1915#2,2:266\n777#2:268\n873#2,2:269\n777#2:271\n873#2,2:272\n1#3:265\n*S KotlinDebug\n*F\n+ 1 CategoryComponent.kt\nkotakbaz/rain/ui/menu/CategoryComponent\n*L\n17#1:248\n17#1:249,2\n82#1:251,2\n83#1:253,2\n88#1:255,2\n89#1:257,2\n95#1:259,2\n96#1:261,2\n140#1:263,2\n171#1:266,2\n201#1:268\n201#1:269,2\n203#1:271\n203#1:272,2\n*E\n"})
public final class CategoryComponent
extends UIComponent {
    @NotNull
    private final Category category;
    private final float panelWidth;
    private final float contentTopOffset;
    @NotNull
    private final List<Module> categoryModules;
    @NotNull
    private final ArrayList<ModuleComponent> leftColumn;
    @NotNull
    private final ArrayList<ModuleComponent> rightColumn;
    @NotNull
    private ScrollUtil scroll;
    @NotNull
    private String normalizedSearch;
    private float cachedTotalHeight;
    private float cachedViewHeight;
    @NotNull
    private String lastModuleSignature;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public CategoryComponent(@NotNull Category category, float panelWidth2, float contentTopOffset) {
        long l2 = -6221905425363594028L;
        long l3 = -308344084841103634L;
        int n2 = C[0];
        n2 -= C[1];
        Intrinsics.checkNotNullParameter(category, (String)a[n2 ^= C[2]]);
        this.category = category;
        this.panelWidth = panelWidth2;
        this.contentTopOffset = contentTopOffset;
        Iterable iterable = ModuleManager.INSTANCE.getModules();
        CategoryComponent categoryComponent = this;
        long l4 = l3;
        int n3 = C[3];
        n3 -= C[4];
        l3 = l4 ^ (0L ^ l4) & -1L << (n3 += C[5]);
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList();
        long l5 = l3;
        int n4 = C[6];
        n4 ^= C[7];
        l3 = l5 ^ (0L ^ l5) & -1L >>> (n4 -= C[8]);
        for (Object t2 : iterable2) {
            Module module = (Module)t2;
            long l6 = l2;
            int n5 = C[9];
            n5 += C[10];
            l2 = l6 ^ (0L ^ l6) & -1L << (n5 -= C[11]);
            if (!Intrinsics.areEqual(module.getCategory(), this.category)) continue;
            collection.add(t2);
        }
        categoryComponent.categoryModules = (List)collection;
        this.leftColumn = new ArrayList();
        this.rightColumn = new ArrayList();
        int n6 = C[12];
        n6 -= C[13];
        this.scroll = new ScrollUtil(0.0f, n6 += C[14], null);
        this.normalizedSearch = "";
        this.lastModuleSignature = "";
        this.rebuildColumns();
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    public final void setSearchQuery(@NotNull String query) {
        int n2 = C[15];
        n2 -= C[16];
        Intrinsics.checkNotNullParameter(query, (String)a[n2 += C[17]]);
        String string = ((Object)StringsKt.trim((CharSequence)query)).toString().toLowerCase(Locale.ROOT);
        int n3 = C[18];
        n3 ^= C[19];
        int n4 = C[21];
        n4 += C[22];
        Intrinsics.checkNotNullExpressionValue(string, (String)a[n3 ^= C[20]] + (String)a[n4 -= C[23]]);
        String string2 = string;
        if (Intrinsics.areEqual(string2, this.normalizedSearch)) {
            return;
        }
        this.normalizedSearch = string2;
        this.rebuildColumns();
        int n5 = C[24];
        n5 ^= C[25];
        this.scroll = new ScrollUtil(0.0f, n5 += C[26], null);
    }

    public final void resetScroll() {
        int n2 = C[27];
        n2 ^= C[28];
        this.scroll = new ScrollUtil(0.0f, n2 += C[29], null);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        float f2;
        super.render(mouseX, mouseY, partialTicks);
        this.refreshVisibleModulesIfNeeded();
        ContentArea contentArea = this.contentArea();
        float f3 = contentArea.getLeft();
        float f4 = contentArea.getTop();
        float f5 = contentArea.getWidth();
        float f6 = contentArea.getHeight();
        float f7 = this.getPadding();
        float f8 = RangesKt.coerceAtLeast((f5 - f7) * 0.5f, 0.0f);
        float f9 = this.columnHeight((List<ModuleComponent>)this.leftColumn);
        float f10 = this.columnHeight((List<ModuleComponent>)this.rightColumn);
        this.cachedTotalHeight = f2 = Math.max(f9, f10);
        this.cachedViewHeight = f6;
        if (this.leftColumn.isEmpty() && this.rightColumn.isEmpty()) {
            this.renderEmptyState(f3, f4, f5, f6);
            return;
        }
        this.scroll.setMax(RangesKt.coerceAtLeast(f2 - f6, 0.0f));
        this.scroll.update();
        float f11 = this.scroll.value();
        ScissorUtil.INSTANCE.start(f3, f4, f5, f6);
        float f12 = f4 + f6;
        this.renderColumn((List<ModuleComponent>)this.leftColumn, f3, f4 - f11, f8, f4, f12, mouseX, mouseY, partialTicks);
        this.renderColumn((List<ModuleComponent>)this.rightColumn, f3 + f8 + f7, f4 - f11, f8, f4, f12, mouseX, mouseY, partialTicks);
        ScissorUtil.INSTANCE.end();
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        ModuleComponent moduleComponent;
        long l2 = -3438198598824501820L;
        long l3 = -4559210422034515886L;
        super.onMouseClick(mouseX, mouseY, button);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        Iterable iterable = this.leftColumn;
        long l4 = l3;
        int n2 = C[30];
        n2 -= C[31];
        l3 = l4 ^ (0L ^ l4) & -1L << (n2 ^= C[32]);
        for (Object t2 : iterable) {
            moduleComponent = (ModuleComponent)t2;
            long l5 = l3;
            int n3 = C[33];
            n3 ^= C[34];
            l3 = l5 ^ (0L ^ l5) & -1L >>> (n3 ^= C[35]);
            moduleComponent.onMouseClick(mouseX, mouseY, button);
        }
        iterable = this.rightColumn;
        long l6 = l3;
        int n4 = C[36];
        n4 += C[37];
        l3 = l6 ^ (0L ^ l6) & -1L << (n4 ^= C[38]);
        for (Object t2 : iterable) {
            moduleComponent = (ModuleComponent)t2;
            long l7 = l3;
            int n5 = C[39];
            n5 += C[40];
            l3 = l7 ^ (0L ^ l7) & -1L >>> (n5 += C[41]);
            moduleComponent.onMouseClick(mouseX, mouseY, button);
        }
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        ModuleComponent moduleComponent;
        long l2 = -8902181511542805712L;
        long l3 = 4688212674567804692L;
        super.onMouseRelease(mouseX, mouseY, button);
        Iterable iterable = this.leftColumn;
        long l4 = l3;
        int n2 = C[42];
        n2 += C[43];
        l3 = l4 ^ (0L ^ l4) & -1L << (n2 -= C[44]);
        for (Object t2 : iterable) {
            moduleComponent = (ModuleComponent)t2;
            long l5 = l3;
            int n3 = C[45];
            n3 ^= C[46];
            l3 = l5 ^ (0L ^ l5) & -1L >>> (n3 ^= C[47]);
            moduleComponent.onMouseRelease(mouseX, mouseY, button);
        }
        iterable = this.rightColumn;
        long l6 = l3;
        int n4 = C[48];
        n4 -= C[49];
        l3 = l6 ^ (0L ^ l6) & -1L << (n4 += C[50]);
        for (Object t2 : iterable) {
            moduleComponent = (ModuleComponent)t2;
            long l7 = l3;
            int n5 = C[51];
            n5 -= C[52];
            l3 = l7 ^ (0L ^ l7) & -1L >>> (n5 += C[53]);
            moduleComponent.onMouseRelease(mouseX, mouseY, button);
        }
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        ModuleComponent moduleComponent;
        long l2 = 2585261360492866099L;
        long l3 = 771604382087095189L;
        super.onKeyPress(mouseX, mouseY, button);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        Iterable iterable = this.leftColumn;
        long l4 = l3;
        int n2 = C[54];
        n2 -= C[55];
        l3 = l4 ^ (0L ^ l4) & -1L << (n2 -= C[56]);
        for (Object t2 : iterable) {
            moduleComponent = (ModuleComponent)t2;
            long l5 = l3;
            int n3 = C[57];
            n3 -= C[58];
            l3 = l5 ^ (0L ^ l5) & -1L >>> (n3 ^= C[59]);
            moduleComponent.onKeyPress(mouseX, mouseY, button);
        }
        iterable = this.rightColumn;
        long l6 = l3;
        int n4 = C[60];
        n4 ^= C[61];
        l3 = l6 ^ (0L ^ l6) & -1L << (n4 ^= C[62]);
        for (Object t2 : iterable) {
            moduleComponent = (ModuleComponent)t2;
            long l7 = l3;
            int n5 = C[63];
            n5 -= C[64];
            l3 = l7 ^ (0L ^ l7) & -1L >>> (n5 += C[65]);
            moduleComponent.onKeyPress(mouseX, mouseY, button);
        }
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
    public static /* synthetic */ void setScrollProgress$default(CategoryComponent categoryComponent, float f2, boolean bl, int n2, Object object) {
        int n3;
        void var3_4;
        int n4 = C[66];
        n4 += C[67];
        if ((var3_4 & (n4 ^= C[68])) != 0) {
            int n5 = C[69];
            n5 += C[70];
            n3 = n5 += C[71];
        }
        categoryComponent.setScrollProgress(f2, n3 != 0);
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

    public final float scrollMaxValue() {
        return this.scroll.max();
    }

    private final void renderColumn(List<ModuleComponent> list, float startX, float startY, float width2, float clipTop, float clipBottom, int mouseX, int mouseY, float partialTicks) {
        long l2 = 4016373468894501529L;
        long l3 = 5973062953616347707L;
        float f2 = 0.0f;
        f2 = startY;
        Iterable iterable = list;
        long l4 = l2;
        int n2 = C[72];
        n2 += C[73];
        l2 = l4 ^ (0L ^ l4) & -1L << (n2 -= C[74]);
        for (Object t2 : iterable) {
            int n3;
            ModuleComponent moduleComponent = (ModuleComponent)t2;
            long l5 = l2;
            int n4 = C[75];
            n4 -= C[76];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n4 += C[77]);
            float f3 = moduleComponent.getDefaultHeight();
            float f4 = f2 + f3;
            if (f4 > clipTop && f2 < clipBottom) {
                int n5 = C[78];
                n5 += C[79];
                n3 = n5 -= C[80];
            } else {
                int n6 = C[81];
                n6 += C[82];
                n3 = n6 -= C[83];
            }
            int n7 = C[84];
            n7 += C[85];
            long l6 = l3;
            int n8 = C[87];
            n8 += C[88];
            l3 = l6 ^ ((long)n3 << (n7 ^= C[86]) ^ l6) & -1L << (n8 -= C[89]);
            moduleComponent.setAlpha(this.getAlpha());
            moduleComponent.setX(startX);
            moduleComponent.setY(f2);
            moduleComponent.setWidth(width2);
            moduleComponent.setHeight(f3);
            int n9 = C[90];
            n9 += C[91];
            if ((int)(l3 >>> (n9 -= C[92])) != 0) {
                moduleComponent.render(mouseX, mouseY, partialTicks);
            }
            f2 += f3 + this.getPadding();
        }
    }

    private final float columnHeight(List<ModuleComponent> list) {
        long l2 = -3720050289864999207L;
        if (list.isEmpty()) {
            return 0.0f;
        }
        Iterable iterable = list;
        double d2 = 0.0;
        for (Object t2 : iterable) {
            ModuleComponent moduleComponent = (ModuleComponent)t2;
            double d3 = d2;
            long l3 = l2;
            int n2 = C[93];
            n2 += C[94];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 += C[95]);
            double d4 = moduleComponent.getDefaultHeight() + this.getPadding();
            d2 = d3 + d4;
        }
        return (float)d2 - this.getPadding();
    }

    private final void rebuildColumns() {
        long l2 = 647762593130280584L;
        this.leftColumn.clear();
        this.rightColumn.clear();
        float f2 = 0.0f;
        float f3 = 0.0f;
        Iterable iterable = this.filteredModules();
        long l3 = l2;
        int n2 = C[96];
        n2 ^= C[97];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += C[98]);
        for (Object t2 : iterable) {
            Module module = (Module)t2;
            long l4 = l2;
            int n3 = C[99];
            n3 += C[100];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 ^= C[101]);
            ModuleComponent moduleComponent = new ModuleComponent(module);
            if (f2 <= f3) {
                this.leftColumn.add(moduleComponent);
                f2 += moduleComponent.getDefaultHeight() + this.getPadding();
                continue;
            }
            this.rightColumn.add(moduleComponent);
            f3 += moduleComponent.getDefaultHeight() + this.getPadding();
        }
        this.lastModuleSignature = this.currentModuleSignature();
    }

    private final void renderEmptyState(float contentLeft, float contentTop, float contentWidth, float contentHeight) {
        if (contentWidth <= 0.0f || contentHeight <= 0.0f) {
            return;
        }
        float f2 = 12.0f;
        int n2 = C[102];
        n2 ^= C[103];
        n2 -= C[104];
        int n3 = C[105];
        n3 -= C[106];
        int n4 = C[108];
        n4 -= C[109];
        int n5 = C[111];
        n5 ^= C[112];
        E.drawCenteredText$default(Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.GUI_TEXT), (String)a[n2] + (String)a[n3 ^= C[107]] + (String)a[n4 -= C[110]], contentLeft + contentWidth * 0.45f, contentTop + (contentHeight - f2) * 0.45f, f2, MenuStyle.INSTANCE.value(this.getAlpha() * 0.5f), 0.0f, n5 ^= C[113], null);
    }

    /*
     * Unable to fully structure code
     */
    private final List<Module> filteredModules() {
        block5: {
            block4: {
                var10_1 = -6244773318314911935L;
                var12_2 = 4040183581767111528L;
                var14_3 = 1366231437614455923L;
                if (!StringsKt.isBlank(this.normalizedSearch)) break block4;
                var1_4 = this.categoryModules;
                v0 = var12_2;
                var17_6 = CategoryComponent.C[114];
                var17_6 -= CategoryComponent.C[115];
                var12_2 = v0 ^ (0L ^ v0) & -1L >>> (var17_6 -= CategoryComponent.C[116]);
                var3_7 = var1_4;
                var4_9 = new ArrayList<E>();
                v1 = var14_3;
                var19_11 = CategoryComponent.C[117];
                var19_11 ^= CategoryComponent.C[118];
                var14_3 = v1 ^ (0L ^ v1) & -1L << (var19_11 += CategoryComponent.C[119]);
                for (T var7_14 : var3_7) {
                    var8_16 = (Module)var7_14;
                    v2 = var14_3;
                    var21_18 = CategoryComponent.C[120];
                    var21_18 += CategoryComponent.C[121];
                    var14_3 = v2 ^ (0L ^ v2) & -1L >>> (var21_18 -= CategoryComponent.C[122]);
                    if (!var8_16.isVisibleInGui()) continue;
                    var4_9.add(var7_14);
                }
                v3 = (List)var4_9;
                break block5;
            }
            var1_5 = this.categoryModules;
            v4 = var12_2;
            var23_19 = CategoryComponent.C[123];
            var23_19 ^= CategoryComponent.C[124];
            var12_2 = v4 ^ (0L ^ v4) & -1L >>> (var23_19 ^= CategoryComponent.C[125]);
            var3_8 = var1_5;
            var4_10 = new ArrayList<E>();
            v5 = var14_3;
            var25_20 = CategoryComponent.C[126];
            var25_20 -= CategoryComponent.C[127];
            var14_3 = v5 ^ (0L ^ v5) & -1L << (var25_20 ^= CategoryComponent.C[128]);
            for (T var7_15 : var3_8) {
                var8_17 = (Module)var7_15;
                v6 = var14_3;
                var27_29 = CategoryComponent.C[129];
                var27_29 += CategoryComponent.C[130];
                var14_3 = v6 ^ (0L ^ v6) & -1L >>> (var27_29 ^= CategoryComponent.C[131]);
                if (!var8_17.isVisibleInGui()) ** GOTO lbl-1000
                v7 = var8_17.getName().toLowerCase(Locale.ROOT);
                var29_30 = CategoryComponent.C[132];
                var29_30 ^= CategoryComponent.C[133];
                var31_31 = CategoryComponent.C[135];
                var31_31 ^= CategoryComponent.C[136];
                Intrinsics.checkNotNullExpressionValue(v7, (String)CategoryComponent.a[var29_30 -= CategoryComponent.C[134]] + (String)CategoryComponent.a[var31_31 ^= CategoryComponent.C[137]]);
                var33_21 = CategoryComponent.C[138];
                var33_21 ^= CategoryComponent.C[139];
                var35_22 = CategoryComponent.C[141];
                var35_22 -= CategoryComponent.C[142];
                if (StringsKt.contains$default((CharSequence)v7, this.normalizedSearch, var33_21 += CategoryComponent.C[140], var35_22 -= CategoryComponent.C[143], null)) ** GOTO lbl-1000
                v8 = var8_17.getDesc().toLowerCase(Locale.ROOT);
                var37_23 = CategoryComponent.C[144];
                var37_23 ^= CategoryComponent.C[145];
                var39_24 = CategoryComponent.C[147];
                var39_24 -= CategoryComponent.C[148];
                Intrinsics.checkNotNullExpressionValue(v8, (String)CategoryComponent.a[var37_23 -= CategoryComponent.C[146]] + (String)CategoryComponent.a[var39_24 += CategoryComponent.C[149]]);
                var41_25 = CategoryComponent.C[150];
                var41_25 += CategoryComponent.C[151];
                var43_26 = CategoryComponent.C[153];
                var43_26 -= CategoryComponent.C[154];
                if (StringsKt.contains$default((CharSequence)v8, this.normalizedSearch, var41_25 -= CategoryComponent.C[152], var43_26 += CategoryComponent.C[155], null)) lbl-1000:
                // 2 sources

                {
                    var45_27 = CategoryComponent.C[156];
                    var45_27 ^= CategoryComponent.C[157];
                    v9 = var45_27 ^= CategoryComponent.C[158];
                } else lbl-1000:
                // 2 sources

                {
                    var47_28 = CategoryComponent.C[159];
                    var47_28 += CategoryComponent.C[160];
                    v9 = var47_28 += CategoryComponent.C[161];
                }
                if (v9 == 0) continue;
                var4_10.add(var7_15);
            }
            v3 = (List)var4_10;
        }
        return v3;
    }

    private final void refreshVisibleModulesIfNeeded() {
        String string = this.currentModuleSignature();
        if (Intrinsics.areEqual(string, this.lastModuleSignature)) {
            return;
        }
        this.rebuildColumns();
        int n2 = C[162];
        n2 ^= C[163];
        this.scroll = new ScrollUtil(0.0f, n2 += C[164], null);
    }

    private final String currentModuleSignature() {
        int n2 = C[165];
        n2 -= C[166];
        int n3 = C[168];
        n3 ^= C[169];
        int n4 = C[171];
        n4 -= C[172];
        return CollectionsKt.joinToString$default(this.filteredModules(), (String)a[n2 += C[167]], null, null, n3 -= C[170], null, CategoryComponent::currentModuleSignature$lambda$0, n4 += C[173], null);
    }

    private final boolean insideContent(float mouseX, float mouseY) {
        int n2;
        ContentArea contentArea = this.contentArea();
        if (mouseX >= contentArea.getLeft() && mouseX <= contentArea.getLeft() + contentArea.getWidth() && mouseY >= contentArea.getTop() && mouseY <= contentArea.getTop() + contentArea.getHeight()) {
            int n3 = C[174];
            n3 -= C[175];
            n2 = n3 -= C[176];
        } else {
            int n4 = C[177];
            n4 += C[178];
            n2 = n4 ^= C[179];
        }
        return n2 != 0;
    }

    private final ContentArea contentArea() {
        float f2 = this.getX() + this.panelWidth + this.getPadding();
        float f3 = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float f4 = this.getY() + this.contentTopOffset;
        float f5 = RangesKt.coerceAtLeast(f3 - f2, 0.0f);
        float f6 = RangesKt.coerceAtLeast(this.getY() + this.getHeight() - f4 - this.getPadding(), 0.0f);
        return new ContentArea(f2, f4, f5, f6);
    }

    private static final CharSequence currentModuleSignature$lambda$0(Module it) {
        int n2 = C[180];
        n2 += C[181];
        Intrinsics.checkNotNullParameter(it, (String)a[n2 += C[182]]);
        return it.getName();
    }

    static {
        CategoryComponent.b();
        long l2 = 5436489038006049993L;
        long l3 = -691855566048269041L;
        long l4 = -3794635756289130896L;
        long l5 = 5136422358270649009L;
        long l6 = 5288250763672091658L;
        long l7 = 781498341500682781L;
        long l8 = 3719232406743694977L;
        long l9 = -878123525557110087L;
        long l10 = 4432046947244909201L;
        long l11 = 8417566200924252475L;
        long l12 = -4262972454920790886L;
        long l13 = -516240520617815646L;
        long l14 = -5732498815184517705L;
        long l15 = 3633225927134053481L;
        int n2 = C[183];
        n2 -= C[184];
        a = new Object[n2 ^= C[185]];
        long l16 = l15;
        int n3 = C[186];
        n3 += C[187];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[188]);
        Object[] objectArray = new Object[C[189]];
        objectArray[CategoryComponent.C[190]] = A;
        objectArray[CategoryComponent.C[191]] = C[192];
        int n4 = C[193];
        Object object = CategoryComponent.A()[C[194]];
        if (object == null) {
            char[] cArray = "\u96b8\u989c\u98a0\u98a3\u9883\u989a\u98a3\u9898\u98a3\u96b8\u96b7\u989f\u96c6\u96b5\u988c\u98a1\u96ac\u986d\u96ae\u987c\u9878\u96b8\u989e\u987d\u96b5\u96bb\u9872\u9898\u96b0\u9875\u989a\u9879\u96b0\u96c7\u96af\u986e\u986c\u96bb\u96b2\u98a6\u9891\u9894\u9881\u987d\u98a6\u9898\u96b0\u9896\u9890\u9898\u96bb\u96c7\u9871\u986f\u98a7\u98a0\u986d\u9880\u988e\u98a1\u9896\u989b\u9890\u9883\u96ba\u986c\u9899\u9873\u98a3\u96b4\u9894\u989e\u988f\u9881\u9891\u96c7\u9898\u9894\u9896\u96c6\u96af\u987f\u9899\u96b6\u96ae\u9891\u9881\u98a3\u98a7\u9871\u9883\u989d\u98a2\u9892\u9883\u9890\u986f\u9890\u9896\u96b9\u98a6\u9893\u9887\u96b9\u9887\u96b6\u98a1\u9870\u987f\u96b2\u988e\u986d\u988c\u989f\u989b\u987d\u98a7\u96b3\u98a2\u989c\u96b1\u9873\u9872\u96b0\u9897\u9897\u988e\u989d\u9875\u96c7\u96bb\u988e\u96c7\u986c\u96b4\u96b3\u96b2\u9870\u96c7\u9892\u989c\u96ad\u96b9\u96b5\u9878\u96b4\u986f\u96c7\u9879\u9887\u9899\u9895\u987e\u9893\u987e\u988d\u9892\u989d\u9878\u989c\u96bb\u9892\u9899\u9895\u9878\u98a1\u9890\u986e\u9871\u9878\u9894\u9875\u986d\u96c6\u989d\u98a0\u987d\u986d\u989d\u988e\u98a6\u96b6\u987f\u98a3\u986e\u96af\u96b7\u96b5\u96b4\u986f\u96ad\u98a2".toCharArray();
            for (int i2 = C[195]; i2 < C[196]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[197];
                n5 -= C[198];
                n5 -= C[199];
                n5 -= C[200];
                n5 ^= C[201];
                n5 -= C[202];
                n5 -= C[203];
                n5 += C[204];
                n5 -= C[205];
                n5 -= C[206];
                n5 -= C[207];
                n5 ^= C[208];
                n5 ^= C[209];
                cArray[i2] = (char)(n5 += C[210]);
            }
            object = CategoryComponent.A()[CategoryComponent.C[211]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)CategoryComponent.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[212];
        n6 -= C[213];
        l6 = l17 ^ (0x6F00000000L ^ l17) & -1L << (n6 ^= C[214]);
        long l18 = l13;
        int n7 = C[215];
        n7 += C[216];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[217]);
        while (true) {
            int n8 = C[218];
            n8 ^= C[219];
            if ((int)l13 >= (int)(l6 >>> (n8 -= C[220]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[221];
            n10 -= C[222];
            int n11 = C[224];
            n11 += C[225];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= C[223])) & -1L >>> (n11 -= C[226]);
            long l20 = l9;
            int n12 = C[227];
            n12 -= C[228];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[229]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[230];
            n14 ^= C[231];
            int n15 = C[233];
            n15 += C[234];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[232])) & -1L >>> (n15 -= C[235]);
            int n16 = C[236];
            n16 -= C[237];
            long l22 = l10;
            int n17 = C[239];
            n17 ^= C[240];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[238]) ^ l22) & -1L << (n17 ^= C[241]);
            int n18 = C[242];
            n18 ^= C[243];
            n18 -= C[244];
            int n19 = C[245];
            n19 ^= C[246];
            long l23 = l12;
            int n20 = C[248];
            n20 ^= C[249];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[247]))) ^ l23) & -1L >>> (n20 -= C[250]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[251];
            n21 ^= C[252];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[253]);
            while (true) {
                int n22 = C[254];
                n22 += C[255];
                if ((int)(l14 >>> (n22 -= C[256])) >= (int)l12) break;
                int n23 = C[257];
                n23 += C[258];
                int n24 = C[260];
                n24 += C[261];
                cArray2[(int)(l14 >>> (n23 += CategoryComponent.C[259]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[262]))];
                l14 += 0x100000000L;
            }
            int n25 = C[263];
            n25 -= C[264];
            int n26 = (int)(l15 >>> (n25 -= C[265]));
            l15 += 0x100000000L;
            CategoryComponent.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[266];
            n27 += C[267];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[268]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[269]];
        String string = (String)object[C[270]];
        object = object[C[271]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[272]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[273]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[275] ^ C[276]];
                byArray[CategoryComponent.C[277] ^ CategoryComponent.C[278]] = C[279] ^ C[280];
                byArray[CategoryComponent.C[281] ^ CategoryComponent.C[282]] = C[283] ^ C[284];
                byArray[CategoryComponent.C[285] ^ CategoryComponent.C[286]] = C[287] ^ C[288];
                byArray[CategoryComponent.C[289] ^ CategoryComponent.C[290]] = C[291] ^ C[292];
                byArray[CategoryComponent.C[293] ^ CategoryComponent.C[294]] = C[295] ^ C[296];
                byArray[CategoryComponent.C[297] ^ CategoryComponent.C[298]] = C[299] ^ C[300];
                byArray[CategoryComponent.C[301] ^ CategoryComponent.C[302]] = C[303] ^ C[304];
                byArray[CategoryComponent.C[305] ^ CategoryComponent.C[306]] = C[307] ^ C[308];
                byArray[CategoryComponent.C[309] ^ CategoryComponent.C[310]] = C[311] ^ C[312];
                byArray[CategoryComponent.C[313] ^ CategoryComponent.C[314]] = C[315] ^ C[316];
                byArray[CategoryComponent.C[317] ^ CategoryComponent.C[318]] = C[319] ^ C[320];
                byArray[CategoryComponent.C[321] ^ CategoryComponent.C[322]] = C[323] ^ C[324];
                byArray[CategoryComponent.C[325] ^ CategoryComponent.C[326]] = C[327] ^ C[328];
                byArray[CategoryComponent.C[329] ^ CategoryComponent.C[330]] = C[331] ^ C[332];
                byArray[CategoryComponent.C[333] ^ CategoryComponent.C[334]] = C[335] ^ C[336];
                byArray[CategoryComponent.C[337] ^ CategoryComponent.C[338]] = C[339] ^ C[340];
                objectArray2[CategoryComponent.C[274]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[341]];
            if (b == null) {
                byte[] byArray2 = new byte[C[342] ^ C[343]];
                byArray2[CategoryComponent.C[344] ^ CategoryComponent.C[345]] = C[346] ^ C[347];
                byArray2[CategoryComponent.C[348] ^ CategoryComponent.C[349]] = C[350] ^ C[351];
                byArray2[CategoryComponent.C[352] ^ CategoryComponent.C[353]] = C[354] ^ C[355];
                byArray2[CategoryComponent.C[356] ^ CategoryComponent.C[357]] = C[358] ^ C[359];
                byArray2[CategoryComponent.C[360] ^ CategoryComponent.C[361]] = C[362] ^ C[363];
                byArray2[CategoryComponent.C[364] ^ CategoryComponent.C[365]] = C[366] ^ C[367];
                byArray2[CategoryComponent.C[368] ^ CategoryComponent.C[369]] = C[370] ^ C[371];
                byArray2[CategoryComponent.C[372] ^ CategoryComponent.C[373]] = C[374] ^ C[375];
                byArray2[CategoryComponent.C[376] ^ CategoryComponent.C[377]] = C[378] ^ C[379];
                byArray2[CategoryComponent.C[380] ^ CategoryComponent.C[381]] = C[382] ^ C[383];
                byArray2[CategoryComponent.C[384] ^ CategoryComponent.C[385]] = C[386] ^ C[387];
                byArray2[CategoryComponent.C[388] ^ CategoryComponent.C[389]] = C[390] ^ C[391];
                byArray2[CategoryComponent.C[392] ^ CategoryComponent.C[393]] = C[394] ^ C[395];
                byArray2[CategoryComponent.C[396] ^ CategoryComponent.C[397]] = C[398] ^ C[399];
                byArray2[0xF7BC ^ 0xF7BB] = 0xFFFF0873 ^ 0xF7BB;
                byArray2[0x27CE ^ 0x27D8] = 0xFFFFD817 ^ 0x27D8;
                byArray2[0x7E8B ^ 0x7E88] = 0x7E91 ^ 0x7E88;
                byArray2[0xF902 ^ 0xF917] = 0xFFFF0685 ^ 0xF917;
                byArray2[0xC2CB ^ 0xC2CE] = 0xFFFF3D04 ^ 0xC2CE;
                byArray2[0x3D00 ^ 0x3D0A] = 0xFFFFC2BA ^ 0x3D0A;
                byArray2[0x46E7 ^ 0x46E7] = 0x46AE ^ 0x46E7;
                byArray2[0x1033B ^ 0x10330] = 0xFFFEFCA9 ^ 0x10330;
                byArray2[0x5FE4 ^ 0x5FEB] = 0x5FF2 ^ 0x5FEB;
                byArray2[0x87C3 ^ 0x87D1] = 0x8780 ^ 0x87D1;
                byArray2[0xD19E ^ 0xD190] = 0xD1DD ^ 0xD190;
                byArray2[0xECB1 ^ 0xECAF] = 0xECD3 ^ 0xECAF;
                byArray2[0x8752 ^ 0x874A] = 0x875C ^ 0x874A;
                byArray2[0x52ED ^ 0x52FD] = 0xFFFFAD12 ^ 0x52FD;
                byArray2[0x1630 ^ 0x1629] = 0x161A ^ 0x1629;
                byArray2[0xC53F ^ 0xC536] = 0xFFFF3ACE ^ 0xC536;
                byArray2[0xE2C3 ^ 0xE2DC] = 0xE2A4 ^ 0xE2DC;
                byArray2[0x17F1 ^ 0x17EC] = 0x17AD ^ 0x17EC;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = CategoryComponent.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ua292\ua28c\ua2a5\ua29e\ua298\ua2bc\ua269\ua27b\ua14e\ua27a\ua29a\ua277\ua2e3\ua26d\ua29d\ua29a\ua283\ua2b3".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 4226;
                        n3 -= 62530;
                        n3 -= 11300;
                        n3 ^= 0xF344;
                        n3 += 32134;
                        n3 ^= 0xB07;
                        n3 ^= 0x3227;
                        n3 ^= 0x2808;
                        n3 += 16266;
                        n3 -= 54347;
                        n3 -= 49579;
                        n3 += 35852;
                        n3 += 10641;
                        cArray[i2] = (char)(n3 -= 28733);
                    }
                    object4 = CategoryComponent.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[8] = 94;
                byArray4[9] = 51;
                byArray4[11] = 66;
                byArray4[0] = -33;
                byArray4[12] = -70;
                byArray4[5] = 61;
                byArray4[4] = 44;
                byArray4[3] = -12;
                byArray4[10] = 35;
                byArray4[13] = 35;
                byArray4[7] = 104;
                byArray4[14] = 43;
                byArray4[1] = -121;
                byArray4[15] = 55;
                byArray4[6] = -46;
                byArray4[2] = -127;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 13, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = CategoryComponent.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u488a\u487e\u48bc".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 30257;
                        n4 += 41491;
                        n4 ^= 0x77A4;
                        n4 ^= 0xE866;
                        n4 ^= 0x6628;
                        n4 -= 62075;
                        n4 += 65084;
                        n4 ^= 0xA20C;
                        n4 -= 58157;
                        n4 ^= 0x1DDE;
                        cArray[i3] = (char)(n4 -= 17791);
                    }
                    object5 = CategoryComponent.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = CategoryComponent.A()[3];
            if (object6 == null) {
                char[] cArray = "\u5e32\u5e3e\u5e44\u5e58\u5e34\u5e3d\u5e34\u5e58\u5e43\u5e4c\u5e34\u5e44\u5dee\u5e43\u5f92\u5f9f\u5f9f\u5e2a\u5f91\u5fa0".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 21760;
                    n5 += 30249;
                    n5 -= 50186;
                    n5 ^= 0x4B4B;
                    n5 += 61294;
                    n5 -= 36079;
                    n5 -= 3857;
                    n5 += 9396;
                    n5 -= 35956;
                    n5 += 54901;
                    n5 -= 41622;
                    n5 ^= 0x3739;
                    cArray[i4] = (char)(n5 ^= 0x7ADF);
                }
                object6 = CategoryComponent.A()[3] = new String(cArray);
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
        C = new int[0x8FC2 ^ 0x8E52];
        CategoryComponent.C[0x1EFF ^ 0x1E65] = 0x1E72 ^ 0x1E65;
        CategoryComponent.C[0x482A ^ 0x4977] = 0xE591 ^ 0x4977;
        CategoryComponent.C[0x45AC ^ 0x4585] = 0x45BF ^ 0x4585;
        CategoryComponent.C[0x68CF ^ 0x68B7] = 0x68FB ^ 0x68B7;
        CategoryComponent.C[0x262D ^ 0x26CD] = 0xFFFFD94D ^ 0x26CD;
        CategoryComponent.C[0x550A ^ 0x555C] = 0x5576 ^ 0x555C;
        CategoryComponent.C[0xEA07 ^ 0xEB3D] = 0x60B8 ^ 0xEB3D;
        CategoryComponent.C[0x2BD7 ^ 0x2B34] = 0x2B3C ^ 0x2B34;
        CategoryComponent.C[0x4D7A ^ 0x4D87] = 0xFFFFB233 ^ 0x4D87;
        CategoryComponent.C[0x9FAB ^ 0x9FC1] = 0xFFFF6023 ^ 0x9FC1;
        CategoryComponent.C[0x575E ^ 0x578D] = 0x578D ^ 0x578D;
        CategoryComponent.C[0x2318 ^ 0x2374] = 0x2365 ^ 0x2374;
        CategoryComponent.C[0x9769 ^ 0x9620] = 0x1EDC ^ 0x9620;
        CategoryComponent.C[0x61DA ^ 0x6055] = 0x2930 ^ 0x6055;
        CategoryComponent.C[0xF2D4 ^ 0xF2C0] = 0xFFFF0D71 ^ 0xF2C0;
        CategoryComponent.C[0xA4A ^ 0xA48] = 0xA36 ^ 0xA48;
        CategoryComponent.C[0xD4E2 ^ 0xD457] = 0xFFFF2B9E ^ 0xD457;
        CategoryComponent.C[0x5E09 ^ 0x5ED9] = 0x5EC7 ^ 0x5ED9;
        CategoryComponent.C[0x2AC9 ^ 0x2B85] = 0xA372 ^ 0x2B85;
        CategoryComponent.C[0xBF15 ^ 0xBFA1] = 0xBFBA ^ 0xBFA1;
        CategoryComponent.C[0x1E3A ^ 0x1E9F] = 0x1E1E ^ 0x1E9F;
        CategoryComponent.C[0xD93C ^ 0xD84B] = 0xAF58 ^ 0xD84B;
        CategoryComponent.C[0x7E7 ^ 0x747] = 0x756 ^ 0x747;
        CategoryComponent.C[0xD4C8 ^ 0xD467] = 0xFFFF2B8F ^ 0xD467;
        CategoryComponent.C[0xFAA ^ 0xF14] = 0xF14 ^ 0xF14;
        CategoryComponent.C[0x791A ^ 0x7836] = 0x4F ^ 0x7836;
        CategoryComponent.C[0x1A12 ^ 0x1B0E] = 0x8B66 ^ 0x1B0E;
        CategoryComponent.C[0x6B23 ^ 0x6A48] = 0xC9B4 ^ 0x6A48;
        CategoryComponent.C[0xA7C4 ^ 0xA790] = 0xFFFF5852 ^ 0xA790;
        CategoryComponent.C[0x4110 ^ 0x413C] = 0xFFFFBE9C ^ 0x413C;
        CategoryComponent.C[0x3C0E ^ 0x3D55] = 0x9E44 ^ 0x3D55;
        CategoryComponent.C[0x9456 ^ 0x945B] = 0xFFFF6BF8 ^ 0x945B;
        CategoryComponent.C[0x6F70 ^ 0x6F84] = 0xFFFF9071 ^ 0x6F84;
        CategoryComponent.C[0x7CF5 ^ 0x7D77] = 0xB845 ^ 0x7D77;
        CategoryComponent.C[0x7C5A ^ 0x7CA2] = 0x7CCC ^ 0x7CA2;
        CategoryComponent.C[0xD87F ^ 0xD923] = 0x75C9 ^ 0xD923;
        CategoryComponent.C[0x7DC9 ^ 0x7CA1] = 0xDF59 ^ 0x7CA1;
        CategoryComponent.C[0x5C63 ^ 0x5D53] = 0xC17D ^ 0x5D53;
        CategoryComponent.C[0xAE21 ^ 0xAED2] = 0xAEB0 ^ 0xAED2;
        CategoryComponent.C[0xE2AA ^ 0xE3AE] = 0xFFFF1C4E ^ 0xE3AE;
        CategoryComponent.C[0x8102 ^ 0x8035] = 0xB45 ^ 0x8035;
        CategoryComponent.C[0x1045D ^ 0x10476] = 0xFFFEFBF7 ^ 0x10476;
        CategoryComponent.C[0x2654 ^ 0x26AA] = 0xFFFFD913 ^ 0x26AA;
        CategoryComponent.C[0xDA48 ^ 0xDB12] = 0xFFFF8790 ^ 0xDB12;
        CategoryComponent.C[0x10A38 ^ 0x10AD2] = 0x10AB5 ^ 0x10AD2;
        CategoryComponent.C[0xA815 ^ 0xA8AC] = 0xFFFF571C ^ 0xA8AC;
        CategoryComponent.C[0x31B6 ^ 0x3141] = 0xFFFFCEE1 ^ 0x3141;
        CategoryComponent.C[0xE0A0 ^ 0xE09F] = 0xE080 ^ 0xE09F;
        CategoryComponent.C[0x9F27 ^ 0x9F19] = 0x9F2E ^ 0x9F19;
        CategoryComponent.C[0xDC50 ^ 0xDCDF] = 0xDCC8 ^ 0xDCDF;
        CategoryComponent.C[0x43EA ^ 0x43E0] = 0x43D5 ^ 0x43E0;
        CategoryComponent.C[0xAB52 ^ 0xAB1E] = 0xAB2A ^ 0xAB1E;
        CategoryComponent.C[0x99EB ^ 0x99CA] = 0x998E ^ 0x99CA;
        CategoryComponent.C[0x6861 ^ 0x6876] = 0x683D ^ 0x6876;
        CategoryComponent.C[0xCCB3 ^ 0xCC4F] = 0xFFFF33A1 ^ 0xCC4F;
        CategoryComponent.C[0xB0EC ^ 0xB0E5] = 0xB0EC ^ 0xB0E5;
        CategoryComponent.C[0x2926 ^ 0x2928] = 0x2976 ^ 0x2928;
        CategoryComponent.C[0xDB3E ^ 0xDA54] = 0xFFFF8678 ^ 0xDA54;
        CategoryComponent.C[0xDE81 ^ 0xDE48] = 0xA342 ^ 0xDE48;
        CategoryComponent.C[0x4620 ^ 0x4750] = 0x6FDF ^ 0x4750;
        CategoryComponent.C[0x382F ^ 0x3906] = 0x417C ^ 0x3906;
        CategoryComponent.C[0xC006 ^ 0xC079] = 0xFFFF3FE7 ^ 0xC079;
        CategoryComponent.C[0x2889 ^ 0x280D] = 0xFFFFD7B5 ^ 0x280D;
        CategoryComponent.C[0xC679 ^ 0xC6DB] = 0xC6BF ^ 0xC6DB;
        CategoryComponent.C[0x3586 ^ 0x34AD] = 0xFFFFB377 ^ 0x34AD;
        CategoryComponent.C[0x1070C ^ 0x107A1] = 0xFFFEF820 ^ 0x107A1;
        CategoryComponent.C[0x4838 ^ 0x4805] = 0x4823 ^ 0x4805;
        CategoryComponent.C[0xAC81 ^ 0xACB2] = 0xAC13 ^ 0xACB2;
        CategoryComponent.C[0x6E82 ^ 0x6ECD] = 0xFFFF9124 ^ 0x6ECD;
        CategoryComponent.C[0xA402 ^ 0xA434] = 0xA427 ^ 0xA434;
        CategoryComponent.C[0xE198 ^ 0xE176] = 0xFFFF1EAE ^ 0xE176;
        CategoryComponent.C[0xD026 ^ 0xD03B] = 0xFFFF2FEA ^ 0xD03B;
        CategoryComponent.C[0xF3E2 ^ 0xF3D9] = 0xF3CE ^ 0xF3D9;
        CategoryComponent.C[0x984F ^ 0x984E] = 0xFFFF67B8 ^ 0x984E;
        CategoryComponent.C[0x51A0 ^ 0x51E4] = 0xFFFFAE1C ^ 0x51E4;
        CategoryComponent.C[0xB4E2 ^ 0xB586] = 0x9AE1 ^ 0xB586;
        CategoryComponent.C[0x71B7 ^ 0x71CC] = 0x7197 ^ 0x71CC;
        CategoryComponent.C[0x19D6 ^ 0x1984] = 0xFFFFE63F ^ 0x1984;
        CategoryComponent.C[0x2EE1 ^ 0x2E95] = 0xFFFFD155 ^ 0x2E95;
        CategoryComponent.C[0xEB55 ^ 0xEB5D] = 0xEB53 ^ 0xEB5D;
        CategoryComponent.C[0xDF8 ^ 0xD42] = 0xFFFFF2F8 ^ 0xD42;
        CategoryComponent.C[0xE58A ^ 0xE58E] = 0xE5AE ^ 0xE58E;
        CategoryComponent.C[0xC9A ^ 0xC99] = 0xC02 ^ 0xC99;
        CategoryComponent.C[0x5D19 ^ 0x5D29] = 0x5D33 ^ 0x5D29;
        CategoryComponent.C[0xA6DD ^ 0xA759] = 0xB647 ^ 0xA759;
        CategoryComponent.C[0xBD8F ^ 0xBD14] = 0xFFFF4290 ^ 0xBD14;
        CategoryComponent.C[0x8FA9 ^ 0x8ECA] = 0x3C10 ^ 0x8ECA;
        CategoryComponent.C[0xC8F5 ^ 0xC9DD] = 0xE7F5 ^ 0xC9DD;
        CategoryComponent.C[0xEF88 ^ 0xEF94] = 0xEF95 ^ 0xEF94;
        CategoryComponent.C[0x243B ^ 0x2411] = 0x242E ^ 0x2411;
        CategoryComponent.C[0x105E3 ^ 0x1057F] = 0x10567 ^ 0x1057F;
        CategoryComponent.C[0xB7BF ^ 0xB757] = 0xB719 ^ 0xB757;
        CategoryComponent.C[0xC7C9 ^ 0xC7BC] = 0xFFFF382A ^ 0xC7BC;
        CategoryComponent.C[0x9A6A ^ 0x9B2D] = 0xC8BF ^ 0x9B2D;
        CategoryComponent.C[0xF32C ^ 0xF393] = 0xF392 ^ 0xF393;
        CategoryComponent.C[0xF8D2 ^ 0xF8A5] = 0xFFFF0700 ^ 0xF8A5;
        CategoryComponent.C[0x51D4 ^ 0x5181] = 0x51C9 ^ 0x5181;
        CategoryComponent.C[0x9A0A ^ 0x9AA6] = 0x9AC0 ^ 0x9AA6;
        CategoryComponent.C[0x102A5 ^ 0x102EF] = 0x102D6 ^ 0x102EF;
        CategoryComponent.C[0x5399 ^ 0x53EF] = 0xFFFFAC02 ^ 0x53EF;
        CategoryComponent.C[0x67B9 ^ 0x67F4] = 0x67FB ^ 0x67F4;
        CategoryComponent.C[0x3B9C ^ 0x3A84] = 0xA60A ^ 0x3A84;
        CategoryComponent.C[0x26A ^ 0x353] = 0x88D7 ^ 0x353;
        CategoryComponent.C[0x4A6 ^ 0x4C8] = 0x4A4 ^ 0x4C8;
        CategoryComponent.C[0xC39C ^ 0xC2D7] = 0x4A1B ^ 0xC2D7;
        CategoryComponent.C[0xE704 ^ 0xE621] = 0xC80B ^ 0xE621;
        CategoryComponent.C[0x10ABD ^ 0x10A38] = 0xFFFEF5FD ^ 0x10A38;
        CategoryComponent.C[0x10BD5 ^ 0x10AF8] = 0x196D8 ^ 0x10AF8;
        CategoryComponent.C[0xE5 ^ 0x9F] = 0xFFFFFF47 ^ 0x9F;
        CategoryComponent.C[0xD921 ^ 0xD95F] = 0xFFFF26FE ^ 0xD95F;
        CategoryComponent.C[0x1E4F ^ 0x1F0C] = 0x11CB ^ 0x1F0C;
        CategoryComponent.C[0xE5CD ^ 0xE54D] = 0xE56E ^ 0xE54D;
        CategoryComponent.C[0xE09D ^ 0xE0F8] = 0xE0DF ^ 0xE0F8;
        CategoryComponent.C[0xD0D5 ^ 0xD0E1] = 0xD0B3 ^ 0xD0E1;
        CategoryComponent.C[0x980E ^ 0x9888] = 0x98F5 ^ 0x9888;
        CategoryComponent.C[0x7419 ^ 0x74DF] = 0xEF3E ^ 0x74DF;
        CategoryComponent.C[0x6F0 ^ 0x6F6] = 0xFFFFF97A ^ 0x6F6;
        CategoryComponent.C[0x9CD6 ^ 0x9D56] = 0x5846 ^ 0x9D56;
        CategoryComponent.C[0x5178 ^ 0x5040] = 0xDB1C ^ 0x5040;
        CategoryComponent.C[0xC182 ^ 0xC139] = 0xC178 ^ 0xC139;
        CategoryComponent.C[0xA6EB ^ 0xA7E2] = 0xA7C1 ^ 0xA7E2;
        CategoryComponent.C[0xBD11 ^ 0xBDCF] = 0xFFFF420A ^ 0xBDCF;
        CategoryComponent.C[0xBE5E ^ 0xBE7A] = 0xBE7B ^ 0xBE7A;
        CategoryComponent.C[0x5D23 ^ 0x5D23] = 0x5D51 ^ 0x5D23;
        CategoryComponent.C[0x37A2 ^ 0x36B8] = 0xA6D0 ^ 0x36B8;
        CategoryComponent.C[0x6123 ^ 0x6192] = 0xFFFF9E4A ^ 0x6192;
        CategoryComponent.C[0x10B17 ^ 0x10A9C] = 0x19162 ^ 0x10A9C;
        CategoryComponent.C[0x7DBC ^ 0x7C88] = 0x6E46 ^ 0x7C88;
        CategoryComponent.C[0xB2EC ^ 0xB26E] = 0xB25A ^ 0xB26E;
        CategoryComponent.C[0x4A85 ^ 0x4A8E] = 0x4A90 ^ 0x4A8E;
        CategoryComponent.C[0x320B ^ 0x329F] = 0xFFFFCD34 ^ 0x329F;
        CategoryComponent.C[0x352C ^ 0x35E3] = 0x53BE ^ 0x35E3;
        CategoryComponent.C[0xF43A ^ 0xF55F] = 0xDA35 ^ 0xF55F;
        CategoryComponent.C[0x9F8D ^ 0x9FC8] = 0xFFFF60A5 ^ 0x9FC8;
        CategoryComponent.C[0x10238 ^ 0x1035A] = 0xFFFE4E04 ^ 0x1035A;
        CategoryComponent.C[0x9F38 ^ 0x9F45] = 0xFFFF6097 ^ 0x9F45;
        CategoryComponent.C[0x4C98 ^ 0x4DF4] = 0xEF74 ^ 0x4DF4;
        CategoryComponent.C[0x1CA5 ^ 0x1DBC] = 0x8DD9 ^ 0x1DBC;
        CategoryComponent.C[0xBD84 ^ 0xBD92] = 0xBDF0 ^ 0xBD92;
        CategoryComponent.C[0xA2C5 ^ 0xA34B] = 0xFFFF1593 ^ 0xA34B;
        CategoryComponent.C[0x9A9A ^ 0x9A8A] = 0x9A8E ^ 0x9A8A;
        CategoryComponent.C[0x3DE2 ^ 0x3CC1] = 0x33CD ^ 0x3CC1;
        CategoryComponent.C[0x1A18 ^ 0x1AF3] = 0x1AA8 ^ 0x1AF3;
        CategoryComponent.C[0x6560 ^ 0x653F] = 0x6522 ^ 0x653F;
        CategoryComponent.C[0x24D0 ^ 0x25E2] = 0x372C ^ 0x25E2;
        CategoryComponent.C[0xFF4 ^ 0xFE7] = 0xFFFFF020 ^ 0xFE7;
        CategoryComponent.C[0x65A7 ^ 0x64DB] = 0xD005 ^ 0x64DB;
        CategoryComponent.C[0x334E ^ 0x3230] = 0xFFFF7929 ^ 0x3230;
        CategoryComponent.C[0x1D77 ^ 0x1DDD] = 0x1DBF ^ 0x1DDD;
        CategoryComponent.C[0xE759 ^ 0xE7F7] = 0xFFFF185C ^ 0xE7F7;
        CategoryComponent.C[0xC7D1 ^ 0xC7C4] = 0xFFFF3834 ^ 0xC7C4;
        CategoryComponent.C[0x3E6E ^ 0x3ED6] = 0x3E8E ^ 0x3ED6;
        CategoryComponent.C[0xC68 ^ 0xD4C] = 0x209 ^ 0xD4C;
        CategoryComponent.C[0x1A7E ^ 0x1AC2] = 0xFFFFE519 ^ 0x1AC2;
        CategoryComponent.C[0x1E8B ^ 0x1E43] = 0x3CC4 ^ 0x1E43;
        CategoryComponent.C[0xCC12 ^ 0xCD09] = 0x5D68 ^ 0xCD09;
        CategoryComponent.C[0x861B ^ 0x869A] = 0x86BB ^ 0x869A;
        CategoryComponent.C[0xD028 ^ 0xD13A] = 0xD13A ^ 0xD13A;
        CategoryComponent.C[0xA970 ^ 0xA80D] = 0x1CC9 ^ 0xA80D;
        CategoryComponent.C[0x10159 ^ 0x10110] = 0xFFFEFEFA ^ 0x10110;
        CategoryComponent.C[0x7D0D ^ 0x7C1C] = 0x7C1D ^ 0x7C1C;
        CategoryComponent.C[0x5EC ^ 0x538] = 0xFFFFFA25 ^ 0x538;
        CategoryComponent.C[0x444B ^ 0x44B1] = 0xFFFFBB71 ^ 0x44B1;
        CategoryComponent.C[0x6AE3 ^ 0x6A21] = 0x6A21 ^ 0x6A21;
        CategoryComponent.C[0x224B ^ 0x237D] = 0xA821 ^ 0x237D;
        CategoryComponent.C[0xA600 ^ 0xA66F] = 0xFFFF59E1 ^ 0xA66F;
        CategoryComponent.C[0x14CD ^ 0x143C] = 0x1420 ^ 0x143C;
        CategoryComponent.C[0x12D4 ^ 0x129A] = 0xFFFFED4A ^ 0x129A;
        CategoryComponent.C[0xE33D ^ 0xE3AC] = 0xFFFF1C61 ^ 0xE3AC;
        CategoryComponent.C[0xEE5A ^ 0xEF5D] = 0xEF18 ^ 0xEF5D;
        CategoryComponent.C[0x10EE4 ^ 0x10E28] = 0x1C165 ^ 0x10E28;
        CategoryComponent.C[0xD7D4 ^ 0xD75E] = 0xFFFF28BE ^ 0xD75E;
        CategoryComponent.C[0xA1C2 ^ 0xA15F] = 0xFFFF5EA5 ^ 0xA15F;
        CategoryComponent.C[0x7E67 ^ 0x7E40] = 0xFFFF81C4 ^ 0x7E40;
        CategoryComponent.C[0xC8EF ^ 0xC8B3] = 0xC8ED ^ 0xC8B3;
        CategoryComponent.C[0xDD18 ^ 0xDD8A] = 0xDD82 ^ 0xDD8A;
        CategoryComponent.C[0xEB73 ^ 0xEBDA] = 0xEBFB ^ 0xEBDA;
        CategoryComponent.C[0x9E7A ^ 0x9E54] = 0x9E12 ^ 0x9E54;
        CategoryComponent.C[0x10383 ^ 0x103A6] = 0x1039F ^ 0x103A6;
        CategoryComponent.C[0xE999 ^ 0xE813] = 0xFFFF8C33 ^ 0xE813;
        CategoryComponent.C[0x10075 ^ 0x1016B] = 0x1D38F ^ 0x1016B;
        CategoryComponent.C[0xBB21 ^ 0xBBF3] = 0x746C ^ 0xBBF3;
        CategoryComponent.C[0x9C99 ^ 0x9D10] = 0x6EE ^ 0x9D10;
        CategoryComponent.C[0xCCF4 ^ 0xCDB4] = 0xC942 ^ 0xCDB4;
        CategoryComponent.C[0x9CF8 ^ 0x9DF3] = 0x9DD1 ^ 0x9DF3;
        CategoryComponent.C[0xD664 ^ 0xD717] = 0xFF9A ^ 0xD717;
        CategoryComponent.C[0xD9EB ^ 0xD8DA] = 0xCA1B ^ 0xD8DA;
        CategoryComponent.C[0x7DC7 ^ 0x7D61] = 0x7D76 ^ 0x7D61;
        CategoryComponent.C[0xF319 ^ 0xF217] = 0xF215 ^ 0xF217;
        CategoryComponent.C[0x9D5F ^ 0x9D9E] = 0x9D9C ^ 0x9D9E;
        CategoryComponent.C[0x3832 ^ 0x38EB] = 0xFFFFC70B ^ 0x38EB;
        CategoryComponent.C[0x737B ^ 0x731C] = 0x737F ^ 0x731C;
        CategoryComponent.C[0x5970 ^ 0x59E5] = 0x59D2 ^ 0x59E5;
        CategoryComponent.C[0xA88C ^ 0xA8E1] = 0xFFFF577E ^ 0xA8E1;
        CategoryComponent.C[0x264C ^ 0x266E] = 0xFFFFD9C9 ^ 0x266E;
        CategoryComponent.C[0x84E2 ^ 0x84B8] = 0x8419 ^ 0x84B8;
        CategoryComponent.C[0xEC85 ^ 0xEDF1] = 0x9AE3 ^ 0xEDF1;
        CategoryComponent.C[0xF16F ^ 0xF14F] = 0xFFFF0EFA ^ 0xF14F;
        CategoryComponent.C[0xCBA8 ^ 0xCACE] = 0xFFFF1A61 ^ 0xCACE;
        CategoryComponent.C[0x8C35 ^ 0x8D71] = 0x83BB ^ 0x8D71;
        CategoryComponent.C[0xFC87 ^ 0xFD84] = 0xFFFF021E ^ 0xFD84;
        CategoryComponent.C[0xEBA9 ^ 0xEAA9] = 0xFFFF1562 ^ 0xEAA9;
        CategoryComponent.C[0x9992 ^ 0x9997] = 0xFFFF6632 ^ 0x9997;
        CategoryComponent.C[0x102C9 ^ 0x10215] = 0x10222 ^ 0x10215;
        CategoryComponent.C[0x981A ^ 0x986B] = 0x986C ^ 0x986B;
        CategoryComponent.C[0x3970 ^ 0x3918] = 0x3975 ^ 0x3918;
        CategoryComponent.C[0x3773 ^ 0x36F5] = 0xFFFFD843 ^ 0x36F5;
        CategoryComponent.C[0x9886 ^ 0x9822] = 0xFFFF6792 ^ 0x9822;
        CategoryComponent.C[0x3D44 ^ 0x3DA3] = 0xFFFFC208 ^ 0x3DA3;
        CategoryComponent.C[0x2DAA ^ 0x2DF4] = 0xFFFFD220 ^ 0x2DF4;
        CategoryComponent.C[0xB63E ^ 0xB7B9] = 0xA6B6 ^ 0xB7B9;
        CategoryComponent.C[0xD896 ^ 0xD9F6] = 0x6B37 ^ 0xD9F6;
        CategoryComponent.C[0x9E3A ^ 0x9E6D] = 0x9E2C ^ 0x9E6D;
        CategoryComponent.C[0xA878 ^ 0xA839] = 0xA806 ^ 0xA839;
        CategoryComponent.C[0x4995 ^ 0x4943] = 0xFFFFB6ED ^ 0x4943;
        CategoryComponent.C[0x921 ^ 0x81D] = 0x8398 ^ 0x81D;
        CategoryComponent.C[0xF0E7 ^ 0xF1C1] = 0xDFE9 ^ 0xF1C1;
        CategoryComponent.C[0xB792 ^ 0xB7D5] = 0xB7F8 ^ 0xB7D5;
        CategoryComponent.C[0xD139 ^ 0xD1E8] = 0x8877 ^ 0xD1E8;
        CategoryComponent.C[0xD68F ^ 0xD70C] = 0x1208 ^ 0xD70C;
        CategoryComponent.C[0xC70E ^ 0xC66F] = 0x74B5 ^ 0xC66F;
        CategoryComponent.C[0xCB6B ^ 0xCA63] = 0xCA61 ^ 0xCA63;
        CategoryComponent.C[0xA07D ^ 0xA0E2] = 0xFFFF5F91 ^ 0xA0E2;
        CategoryComponent.C[0x588C ^ 0x58EE] = 0xFFFFA77A ^ 0x58EE;
        CategoryComponent.C[0xA76E ^ 0xA638] = 0xCB17 ^ 0xA638;
        CategoryComponent.C[0xF28D ^ 0xF292] = 0xFFFF0D7D ^ 0xF292;
        CategoryComponent.C[0xA656 ^ 0xA6F7] = 0xA68B ^ 0xA6F7;
        CategoryComponent.C[0x67CE ^ 0x66C4] = 0x66EE ^ 0x66C4;
        CategoryComponent.C[0x83E ^ 0x807] = 0x89B ^ 0x807;
        CategoryComponent.C[0x5670 ^ 0x562D] = 0x5602 ^ 0x562D;
        CategoryComponent.C[0xC65A ^ 0xC644] = 0xFFFF39C0 ^ 0xC644;
        CategoryComponent.C[0xAA66 ^ 0xAB67] = 0xABE5 ^ 0xAB67;
        CategoryComponent.C[0xBBFA ^ 0xBA8F] = 0xCD9C ^ 0xBA8F;
        CategoryComponent.C[0x1030D ^ 0x1024F] = 0x10C85 ^ 0x1024F;
        CategoryComponent.C[0x860E ^ 0x875C] = 0xB836 ^ 0x875C;
        CategoryComponent.C[0xA504 ^ 0xA42B] = 0x3863 ^ 0xA42B;
        CategoryComponent.C[0xD0F4 ^ 0xD001] = 0xFFFF2F7E ^ 0xD001;
        CategoryComponent.C[0xF740 ^ 0xF7A1] = 0xF7E2 ^ 0xF7A1;
        CategoryComponent.C[0xDB2E ^ 0xDB57] = 0xFFFF24FB ^ 0xDB57;
        CategoryComponent.C[0x1F ^ 0xC2] = 0xFFFFFF57 ^ 0xC2;
        CategoryComponent.C[0x18F4 ^ 0x19C7] = 0xB6C ^ 0x19C7;
        CategoryComponent.C[0x28F5 ^ 0x283E] = 0x92F3 ^ 0x283E;
        CategoryComponent.C[0x10C3 ^ 0x1186] = 0x420F ^ 0x1186;
        CategoryComponent.C[0x348A ^ 0x34E3] = 0xFFFFCB64 ^ 0x34E3;
        CategoryComponent.C[0x1EA7 ^ 0x1E14] = 0xFFFFE1B3 ^ 0x1E14;
        CategoryComponent.C[0xD541 ^ 0xD533] = 0xFFFF2AAA ^ 0xD533;
        CategoryComponent.C[0xAA70 ^ 0xAAE9] = 0xAA7C ^ 0xAAE9;
        CategoryComponent.C[0x1135 ^ 0x11CE] = 0x11F4 ^ 0x11CE;
        CategoryComponent.C[0xE77F ^ 0xE7AA] = 0xFFFF1825 ^ 0xE7AA;
        CategoryComponent.C[0x7243 ^ 0x7287] = 0x7247 ^ 0x7287;
        CategoryComponent.C[0xC20C ^ 0xC377] = 0x54C5 ^ 0xC377;
        CategoryComponent.C[0x80D9 ^ 0x8154] = 0xC831 ^ 0x8154;
        CategoryComponent.C[0xAD93 ^ 0xAD82] = 0xFFFF5215 ^ 0xAD82;
        CategoryComponent.C[0xED44 ^ 0xED7C] = 0xFFFF12EC ^ 0xED7C;
        CategoryComponent.C[0x823A ^ 0x8259] = 0xFFFF7DEF ^ 0x8259;
        CategoryComponent.C[0x1DE6 ^ 0x1CB1] = 0x71BE ^ 0x1CB1;
        CategoryComponent.C[0xBBE4 ^ 0xBBCC] = 0xBBAE ^ 0xBBCC;
        CategoryComponent.C[0xF645 ^ 0xF666] = 0xFFFF09A5 ^ 0xF666;
        CategoryComponent.C[0xD6F9 ^ 0xD7EA] = 0x60F5 ^ 0xD7EA;
        CategoryComponent.C[0xB6FF ^ 0xB7AB] = 0x88C1 ^ 0xB7AB;
        CategoryComponent.C[0x105EA ^ 0x104B2] = 0x1A7BF ^ 0x104B2;
        CategoryComponent.C[0xB3C7 ^ 0xB30A] = 0xBEDC ^ 0xB30A;
        CategoryComponent.C[0x10079 ^ 0x10032] = 0x10077 ^ 0x10032;
        CategoryComponent.C[0x7E00 ^ 0x7E51] = 0x7E44 ^ 0x7E51;
        CategoryComponent.C[0x5352 ^ 0x522B] = 0xC599 ^ 0x522B;
        CategoryComponent.C[0xEB6D ^ 0xEB62] = 0xEB13 ^ 0xEB62;
        CategoryComponent.C[0x558D ^ 0x54C2] = 0xA0F6 ^ 0x54C2;
        CategoryComponent.C[0xACCB ^ 0xAC42] = 0xAC0F ^ 0xAC42;
        CategoryComponent.C[0x10D42 ^ 0x10D00] = 0x10D60 ^ 0x10D00;
        CategoryComponent.C[0x1AFE ^ 0x1A72] = 0x1A58 ^ 0x1A72;
        CategoryComponent.C[0x10E79 ^ 0x10E43] = 0x10E26 ^ 0x10E43;
        CategoryComponent.C[0xFC1F ^ 0xFD67] = 0x6AC2 ^ 0xFD67;
        CategoryComponent.C[0xE2C0 ^ 0xE217] = 0xFFFF1D6D ^ 0xE217;
        CategoryComponent.C[0x804A ^ 0x81CB] = 0x44CF ^ 0x81CB;
        CategoryComponent.C[0xCD56 ^ 0xCDA0] = 0xFFFF325F ^ 0xCDA0;
        CategoryComponent.C[0x432 ^ 0x46B] = 0x421 ^ 0x46B;
        CategoryComponent.C[0x65FE ^ 0x65C9] = 0x65AA ^ 0x65C9;
        CategoryComponent.C[0xF2B0 ^ 0xF2AB] = 0xF29A ^ 0xF2AB;
        CategoryComponent.C[0x3649 ^ 0x3692] = 0x3697 ^ 0x3692;
        CategoryComponent.C[0x1A4E ^ 0x1A16] = 0x1A3F ^ 0x1A16;
        CategoryComponent.C[0x3E27 ^ 0x3E3E] = 0xFFFFC1F8 ^ 0x3E3E;
        CategoryComponent.C[0x10EFF ^ 0x10EF8] = 0xFFFEF15A ^ 0x10EF8;
        CategoryComponent.C[0xA5E7 ^ 0xA491] = 0xD398 ^ 0xA491;
        CategoryComponent.C[0x1F18 ^ 0x1E07] = 0xFFFF333B ^ 0x1E07;
        CategoryComponent.C[0xF4B8 ^ 0xF5AE] = 0x6920 ^ 0xF5AE;
        CategoryComponent.C[0xB259 ^ 0xB2E9] = 0xFFFF4D2B ^ 0xB2E9;
        CategoryComponent.C[0x74EF ^ 0x74DD] = 0x74E2 ^ 0x74DD;
        CategoryComponent.C[0x1959 ^ 0x1800] = 0xBB11 ^ 0x1800;
        CategoryComponent.C[0xBB1 ^ 0xABD] = 0xFFFFF569 ^ 0xABD;
        CategoryComponent.C[0xBE18 ^ 0xBE93] = 0xBEA5 ^ 0xBE93;
        CategoryComponent.C[0x5D1C ^ 0x5D92] = 0xFFFFA27C ^ 0x5D92;
        CategoryComponent.C[0x1609 ^ 0x175A] = 0xFFFFD7A4 ^ 0x175A;
        CategoryComponent.C[0x1A1 ^ 0x29] = 0x9BDF ^ 0x29;
        CategoryComponent.C[0x7622 ^ 0x76AF] = 0x76A8 ^ 0x76AF;
        CategoryComponent.C[0x38F2 ^ 0x38B2] = 0x388C ^ 0x38B2;
        CategoryComponent.C[0x10D34 ^ 0x10D9F] = 0x10C9C ^ 0x10D9F;
        CategoryComponent.C[0x17BF ^ 0x17DE] = 0xFFFFE837 ^ 0x17DE;
        CategoryComponent.C[0xDBA0 ^ 0xDAF5] = 0xDAF5 ^ 0xDAF5;
        CategoryComponent.C[0x749B ^ 0x758B] = 0x758A ^ 0x758B;
        CategoryComponent.C[0x26E6 ^ 0x2680] = 0x269B ^ 0x2680;
        CategoryComponent.C[0x8E1B ^ 0x8F74] = 0x2DE7 ^ 0x8F74;
        CategoryComponent.C[0x93F0 ^ 0x92E5] = 0xE6D ^ 0x92E5;
        CategoryComponent.C[0x36E6 ^ 0x37C7] = 0x388E ^ 0x37C7;
        CategoryComponent.C[0xCF67 ^ 0xCE16] = 0xE69B ^ 0xCE16;
        CategoryComponent.C[0x8E94 ^ 0x8E8C] = 0x8EDC ^ 0x8E8C;
        CategoryComponent.C[0x85C8 ^ 0x8489] = 0x8A4B ^ 0x8489;
        CategoryComponent.C[0x9D4 ^ 0x987] = 0xFFFFF657 ^ 0x987;
        CategoryComponent.C[0x15B8 ^ 0x1526] = 0xFFFFEAC5 ^ 0x1526;
        CategoryComponent.C[0x1F35 ^ 0x1F09] = 0x1F38 ^ 0x1F09;
        CategoryComponent.C[0xDB94 ^ 0xDBC4] = 0xFFFF247C ^ 0xDBC4;
        CategoryComponent.C[0xF13B ^ 0xF036] = 0xF037 ^ 0xF036;
        CategoryComponent.C[0xC6E1 ^ 0xC7A7] = 0x942B ^ 0xC7A7;
        CategoryComponent.C[0xD266 ^ 0xD2D0] = 0xD2CD ^ 0xD2D0;
        CategoryComponent.C[0x99DE ^ 0x995D] = 0x9928 ^ 0x995D;
        CategoryComponent.C[0xB7E3 ^ 0xB6B2] = 0x89D8 ^ 0xB6B2;
        CategoryComponent.C[0x51B7 ^ 0x5097] = 0x8273 ^ 0x5097;
        CategoryComponent.C[0x1A34 ^ 0x1A05] = 0x1A3C ^ 0x1A05;
        CategoryComponent.C[0x4528 ^ 0x4595] = 0x4596 ^ 0x4595;
        CategoryComponent.C[0xECBE ^ 0xECE5] = 0xFFFF1338 ^ 0xECE5;
        CategoryComponent.C[0x2733 ^ 0x2679] = 0xAE8E ^ 0x2679;
        CategoryComponent.C[0x100DA ^ 0x101F0] = 0x17989 ^ 0x101F0;
        CategoryComponent.C[0x468 ^ 0x567] = 0x567 ^ 0x567;
        CategoryComponent.C[0x5791 ^ 0x5783] = 0x57FF ^ 0x5783;
        CategoryComponent.C[0x592F ^ 0x5841] = 0xFFFF057A ^ 0x5841;
        CategoryComponent.C[0x2582 ^ 0x2542] = 0x2542 ^ 0x2542;
        CategoryComponent.C[0xEF1D ^ 0xEE1F] = 0xEE1B ^ 0xEE1F;
        CategoryComponent.C[0x1BD0 ^ 0x1AF2] = 0x15B7 ^ 0x1AF2;
        CategoryComponent.C[0xA4FD ^ 0xA425] = 0xA463 ^ 0xA425;
        CategoryComponent.C[0xD378 ^ 0xD3E8] = 0xFFFF2C2E ^ 0xD3E8;
        CategoryComponent.C[0xCEEF ^ 0xCEDA] = 0xFFFF310B ^ 0xCEDA;
        CategoryComponent.C[0xF8FC ^ 0xF818] = 0xFFFF0784 ^ 0xF818;
        CategoryComponent.C[0x8F90 ^ 0x8E87] = 0xFFFFEDFF ^ 0x8E87;
        CategoryComponent.C[0x5DCA ^ 0x5D38] = 0x5D5F ^ 0x5D38;
        CategoryComponent.C[0xA629 ^ 0xA740] = 0x4BC ^ 0xA740;
        CategoryComponent.C[0x10926 ^ 0x109B0] = 0xFFFEF6C4 ^ 0x109B0;
        CategoryComponent.C[0x60C6 ^ 0x604E] = 0x6037 ^ 0x604E;
        CategoryComponent.C[0xADDD ^ 0xAC93] = 0x58DF ^ 0xAC93;
        CategoryComponent.C[0x3206 ^ 0x32E9] = 0xFFFFCD1C ^ 0x32E9;
        CategoryComponent.C[0x573A ^ 0x57C5] = 0x57F7 ^ 0x57C5;
        CategoryComponent.C[0x102D ^ 0x1112] = 0xFFFFEA28 ^ 0x1112;
        CategoryComponent.C[0xCA7A ^ 0xCB25] = 0x67C3 ^ 0xCB25;
        CategoryComponent.C[0xF9A ^ 0xFD9] = 0xFFFFF043 ^ 0xFD9;
        CategoryComponent.C[0x9367 ^ 0x938E] = 0x939A ^ 0x938E;
        CategoryComponent.C[0x63C6 ^ 0x6365] = 0x6350 ^ 0x6365;
        CategoryComponent.C[0xA287 ^ 0xA261] = 0xFFFF5D85 ^ 0xA261;
        CategoryComponent.C[0x1091F ^ 0x10822] = 0x10CD3 ^ 0x10822;
        CategoryComponent.C[0x10E10 ^ 0x10ECA] = 0x10E98 ^ 0x10ECA;
        CategoryComponent.C[0x2D98 ^ 0x2DEB] = 0xFFFFD252 ^ 0x2DEB;
        CategoryComponent.C[0x5765 ^ 0x574A] = 0xFFFFA8FD ^ 0x574A;
        CategoryComponent.C[0xFFF0 ^ 0xFED7] = 0xFFFF2F13 ^ 0xFED7;
        CategoryComponent.C[0x9D39 ^ 0x9C46] = 0x2882 ^ 0x9C46;
        CategoryComponent.C[0x6965 ^ 0x6995] = 0xFFFF965C ^ 0x6995;
        CategoryComponent.C[0xC8D0 ^ 0xC9E5] = 0x42B3 ^ 0xC9E5;
        CategoryComponent.C[0xC3E1 ^ 0xC2A9] = 0x9125 ^ 0xC2A9;
        CategoryComponent.C[0x2EB4 ^ 0x2FCE] = 0xFFFF47C3 ^ 0x2FCE;
        CategoryComponent.C[0xF656 ^ 0xF62A] = 0xFFFF0983 ^ 0xF62A;
        CategoryComponent.C[0xC7A7 ^ 0xC734] = 0xFFFF3848 ^ 0xC734;
        CategoryComponent.C[0xBB30 ^ 0xBBB7] = 0xBB8A ^ 0xBBB7;
        CategoryComponent.C[0xE195 ^ 0xE15F] = 0xDE74 ^ 0xE15F;
        CategoryComponent.C[0xC646 ^ 0xC6EE] = 0xC6AD ^ 0xC6EE;
        CategoryComponent.C[0xB8A9 ^ 0xB88F] = 0xB895 ^ 0xB88F;
        CategoryComponent.C[0x72D3 ^ 0x735F] = 0x3A3C ^ 0x735F;
        CategoryComponent.C[0x7AA7 ^ 0x7BD5] = 0x5349 ^ 0x7BD5;
        CategoryComponent.C[0x27ED ^ 0x277A] = 0x271F ^ 0x277A;
        CategoryComponent.C[0x94EA ^ 0x9407] = 0xFFFF6BC9 ^ 0x9407;
        CategoryComponent.C[0xBE65 ^ 0xBE15] = 0xFFFF41BC ^ 0xBE15;
        CategoryComponent.C[0x6C07 ^ 0x6C63] = 0x6C32 ^ 0x6C63;
        CategoryComponent.C[0x1031E ^ 0x10253] = 0x1F61B ^ 0x10253;
        CategoryComponent.C[0xD773 ^ 0xD713] = 0xFFFF2876 ^ 0xD713;
        CategoryComponent.C[0xA7C1 ^ 0xA789] = 0xA7E6 ^ 0xA789;
        CategoryComponent.C[0x7E26 ^ 0x7E2A] = 0xFFFF816C ^ 0x7E2A;
        CategoryComponent.C[0x948E ^ 0x9429] = 0xFFFF6B8B ^ 0x9429;
        CategoryComponent.C[0xF9C5 ^ 0xF8EB] = 0x64C5 ^ 0xF8EB;
        CategoryComponent.C[0xBDD ^ 0xA8D] = 0xFEC1 ^ 0xA8D;
        CategoryComponent.C[0x2190 ^ 0x2096] = 0x20C3 ^ 0x2096;
        CategoryComponent.C[0xD5B7 ^ 0xD500] = 0xD515 ^ 0xD500;
        CategoryComponent.C[0x5F2A ^ 0x5E14] = 0x5AE2 ^ 0x5E14;
        CategoryComponent.C[0x107E5 ^ 0x106DE] = 0xFFFE72D9 ^ 0x106DE;
        CategoryComponent.C[0x5B52 ^ 0x5B97] = 0xD176 ^ 0x5B97;
        CategoryComponent.C[0x7AD9 ^ 0x7BDC] = 0xFFFF8437 ^ 0x7BDC;
        CategoryComponent.C[0xD2BB ^ 0xD296] = 0xFFFF2D47 ^ 0xD296;
        CategoryComponent.C[0xA430 ^ 0xA557] = 0x8A3D ^ 0xA557;
        CategoryComponent.C[0x4D8 ^ 0x421] = 0xFFFFFBAF ^ 0x421;
        CategoryComponent.C[0x4948 ^ 0x49AA] = 0xFFFFB609 ^ 0x49AA;
        CategoryComponent.C[0xBA3B ^ 0xBAE4] = 0xFFFF4535 ^ 0xBAE4;
        CategoryComponent.C[0x7640 ^ 0x768E] = 0xE56 ^ 0x768E;
        CategoryComponent.C[0x128B ^ 0x12CD] = 0x12AB ^ 0x12CD;
        CategoryComponent.C[0x21A1 ^ 0x20BC] = 0xF251 ^ 0x20BC;
        CategoryComponent.C[0xD9C2 ^ 0xD927] = 0xD96B ^ 0xD927;
        CategoryComponent.C[0xE0E5 ^ 0xE1BB] = 0x4D1B ^ 0xE1BB;
        CategoryComponent.C[0xAB7E ^ 0xAA13] = 0x880 ^ 0xAA13;
        CategoryComponent.C[0x31F4 ^ 0x3133] = 0x6050 ^ 0x3133;
        CategoryComponent.C[0x7B42 ^ 0x7B81] = 0x7B81 ^ 0x7B81;
        CategoryComponent.C[0x6E9E ^ 0x6E72] = 0xFFFF91B4 ^ 0x6E72;
        CategoryComponent.C[0x3BD5 ^ 0x3A50] = 0x2B5F ^ 0x3A50;
        CategoryComponent.C[0xF798 ^ 0xF7F3] = 0xFFFF0853 ^ 0xF7F3;
        CategoryComponent.C[0x7E6C ^ 0x7EF4] = 0xFFFF812D ^ 0x7EF4;
        CategoryComponent.C[0x265D ^ 0x2749] = 0x9046 ^ 0x2749;
        CategoryComponent.C[0xEDFE ^ 0xED4C] = 0xFFFF1283 ^ 0xED4C;
        CategoryComponent.C[0xBBFD ^ 0xBBE7] = 0xBB8C ^ 0xBBE7;
    }
}

