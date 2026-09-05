/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09565
 *  Nursultan.class11359
 *  Nursultan.class11361
 *  Nursultan.class11938
 *  baritone.api.BaritoneAPI
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.event.events.ChatEvent
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00623
 *  minecraft.class00625
 *  minecraft.class00626
 *  minecraft.class00627
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class00669
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01294
 *  minecraft.class01295
 *  minecraft.class01299
 *  minecraft.class01321
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03249
 *  minecraft.class03251
 *  minecraft.class03255
 *  minecraft.class03256
 *  minecraft.class03386
 *  minecraft.class03425
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03448
 *  minecraft.class03457
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04664
 *  minecraft.class04897
 *  minecraft.class05306
 *  minecraft.class05630
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06274
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class06497
 *  minecraft.class06524
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class06601
 *  minecraft.class07080
 *  minecraft.class07299
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07686
 *  minecraft.class08036
 *  minecraft.class08394
 *  minecraft.class09036
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterBackground
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterInit
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeInit
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.impl.client.screen.ButtonList
 *  net.fabricmc.fabric.impl.client.screen.ScreenEventFactory
 *  net.fabricmc.fabric.impl.client.screen.ScreenExtensions
 *  net.fabricmc.fabric.mixin.screen.ScreenAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  ru.fiw.proxyserver.mixin.ScreenAccessor
 */
package minecraft;

import Nursultan.class09565;
import Nursultan.class11359;
import Nursultan.class11361;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.event.events.ChatEvent;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.lang.runtime.SwitchBootstraps;
import java.net.URI;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00623;
import minecraft.class00625;
import minecraft.class00626;
import minecraft.class00627;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class00669;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01294;
import minecraft.class01295;
import minecraft.class01299;
import minecraft.class01321;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03249;
import minecraft.class03251;
import minecraft.class03255;
import minecraft.class03256;
import minecraft.class03386;
import minecraft.class03425;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03448;
import minecraft.class03457;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04664;
import minecraft.class04897;
import minecraft.class05075;
import minecraft.class05117;
import minecraft.class05306;
import minecraft.class05630;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06274;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class06497;
import minecraft.class06524;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class06601;
import minecraft.class07080;
import minecraft.class07299;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07686;
import minecraft.class08036;
import minecraft.class08394;
import minecraft.class09036;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.client.screen.ButtonList;
import net.fabricmc.fabric.impl.client.screen.ScreenEventFactory;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;
import net.fabricmc.fabric.mixin.screen.ScreenAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public abstract class class05096
extends class04664
implements class01294,
ScreenExtensions,
ScreenAccessor,
ru.fiw.proxyserver.mixin.ScreenAccessor {
    private static final Logger field_22782 = LogUtils.getLogger();
    private static final class00392 field_33814 = class00392.L((String)"narrator.screen.usage");
    public static final class01894 field_49511 = class01894.y((String)"textures/gui/menu_background.png");
    public static final class01894 field_49895 = class01894.y((String)"textures/gui/header_separator.png");
    public static final class01894 field_49896 = class01894.y((String)"textures/gui/footer_separator.png");
    private static final class01894 field_49894 = class01894.y((String)"textures/gui/inworld_menu_background.png");
    public static final class01894 field_49897 = class01894.y((String)"textures/gui/inworld_header_separator.png");
    public static final class01894 field_49898 = class01894.y((String)"textures/gui/inworld_footer_separator.png");
    protected static final float field_60460 = 2000.0f;
    public final class00392 field_22785;
    private final List<class04654> field_22786 = Lists.newArrayList();
    private final List<class03434> field_33815 = Lists.newArrayList();
    public final class06202 field_22787;
    private boolean field_42156;
    public int field_22789;
    public int field_22790;
    private final List<class01294> field_33816 = Lists.newArrayList();
    public final class01590 field_22793;
    private static final long field_33817;
    private static final long field_33818;
    private static final long field_33819 = 750L;
    private static final long field_33820 = 200L;
    private static final long field_33821 = 200L;
    private final class03425 field_33822 = new class03425();
    private long field_33823 = Long.MIN_VALUE;
    private long field_33824 = Long.MAX_VALUE;
    protected @Nullable class06366<class01299> field_52252;
    private @Nullable class03434 field_33813;
    protected final Executor field_44944;
    private ButtonList fabricButtons;
    private Event removeEvent;
    private Event beforeTickEvent;
    private Event afterTickEvent;
    private Event beforeRenderEvent;
    private Event afterBackgroundEvent;
    private Event afterRenderEvent;
    private Event allowKeyPressEvent;
    private Event beforeKeyPressEvent;
    private Event afterKeyPressEvent;
    private Event allowKeyReleaseEvent;
    private Event beforeKeyReleaseEvent;
    private Event afterKeyReleaseEvent;
    private Event allowMouseClickEvent;
    private Event beforeMouseClickEvent;
    private Event afterMouseClickEvent;
    private Event allowMouseReleaseEvent;
    private Event beforeMouseReleaseEvent;
    private Event afterMouseReleaseEvent;
    private Event allowMouseDragEvent;
    private Event beforeMouseDragEvent;
    private Event afterMouseDragEvent;
    private Event allowMouseScrollEvent;
    private Event beforeMouseScrollEvent;
    private Event afterMouseScrollEvent;

    public /* synthetic */ List getChildren() {
        return this.field_22786;
    }

    public class00392 method_25440() {
        return this.field_22785;
    }

    public class05096(class00392 class003922) {
        this(class06202.Nq(), (class01590)class06202.Nq().i_3, class003922);
    }

    protected class05096(class06202 class062022, class01590 class015902, class00392 class003922) {
        this.field_22787 = class062022;
        this.field_22793 = class015902;
        this.field_22785 = class003922;
        this.field_44944 = runnable -> class062022.execute(() -> {
            if ((class05096)((Object)((Object)((Object)class062022.v_3))) == this) {
                runnable.run();
            }
        });
    }

    public @Nullable class05075 method_50024() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static void method_71999(class00647 class006472, class06202 class062022, @Nullable class05096 class050962) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class05096.handler$zzp000$baritone$handleCustomClickEvent(class006472, class062022, class050962, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class04453 class044532 = Objects.requireNonNull((class04453)class062022.T_4, "Player not available");
        class00647 class006473 = class006472;
        Objects.requireNonNull(class006473);
        class00647 class006474 = class006473;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00625.class, class00626.class, class00669.class}, (Object)class006474, (int)n)) {
            case 0: {
                String string2;
                try {
                    String string;
                    string2 = string = ((class00625)class006474).y();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                class05096.method_71844(class044532, string2, class050962);
                return;
            }
            case 1: {
                class00626 class006262 = (class00626)class006474;
                ((class01683)class044532.y_0).N(class006262.y(), class050962);
                return;
            }
            case 2: {
                class00669 class006692 = (class00669)class006474;
                ((class01683)class044532.y_0).N((class00381)new class09036(class006692.y(), class006692.L()));
                if ((class05096)((Object)class062022.v_3) == class050962) return;
                class062022.N(class050962);
                return;
            }
        }
        class05096.method_71847(class006472, class062022, class050962);
    }

    public void method_25426() {
    }

    public void method_37064(boolean bl) {
        if (this.method_37073()) {
            this.method_37065(bl);
        }
    }

    private void method_37058(long l) {
        this.method_72802(class07536.L() + l);
    }

    protected void method_41843() {
        this.method_37067();
        this.method_48267();
        this.method_25426();
        this.method_56131();
    }

    public final void method_25423(int n, int n2) {
        this.m_handler$bbg000$fabric_screen_api_v1$beforeInitScreen_47(n, n2, null);
        this.field_22789 = n;
        this.field_22790 = n2;
        if (!this.field_42156) {
            this.method_25426();
            this.method_56131();
        } else {
            this.method_48640();
        }
        this.field_42156 = true;
        this.method_37064(false);
        if (this.field_22787.Nc().y()) {
            this.method_72802(Long.MAX_VALUE);
        } else {
            this.method_37058(field_33817);
        }
        this.m_handler$bbg000$fabric_screen_api_v1$afterInitScreen_51(n, n2, null);
    }

    protected void method_71536(float f) {
        for (class04654 class046542 : this.method_25396()) {
            if (!(class046542 instanceof class06478)) continue;
            ((class06478)class046542).method_25350(f);
        }
    }

    public List<? extends class04654> method_25396() {
        return this.field_22786;
    }

    public void method_49589() {
    }

    protected static boolean method_71843(class06202 class062022, @Nullable class05096 class050962, URI uRI) {
        if (!((Boolean)((class05630)class062022.i_7).h().method_41753()).booleanValue()) {
            return false;
        }
        if (((Boolean)((class05630)class062022.i_7).r().method_41753()).booleanValue()) {
            class062022.N((class05096)new class01321(bl -> {
                if (bl) {
                    class07536.m().N(uRI);
                }
                class062022.N(class050962);
            }, uRI.toString(), false));
        } else {
            class07536.m().N(uRI);
        }
        return true;
    }

    private class02116 method_48264(class03249 class032492) {
        return new class02116(class032492);
    }

    protected void method_48263(class02106 class021062) {
        this.method_48267();
        class021062.N(true);
    }

    protected void method_56131() {
        class03251 class032512;
        class02106 class021062;
        if (this.field_22787.Nc().y() && (class021062 = super.method_48205((class02089)(class032512 = new class03251(true)))) != null) {
            this.method_48263(class021062);
        }
    }

    protected <T extends class04654 & class03434> T method_25429(T t) {
        this.field_22786.add(t);
        this.field_33815.add(t);
        return t;
    }

    public final void method_47413(class01054 class010542, int n, int n2, float f) {
        class010542.L();
        this.method_25420(class010542, n, n2, f);
        this.m_handler$bbg000$fabric_screen_api_v1$renderWithTooltip_49(class010542, n, n2, f, null);
        class010542.L();
        this.method_25394(class010542, n, n2, f);
        class010542.M();
    }

    protected void method_48265(class04654 class046542) {
        class02106 class021062 = class02106.N((class01295)this, (class02106)class046542.method_48205((class02089)new class09565()));
        if (class021062 != null) {
            this.method_48263(class021062);
        }
    }

    public boolean method_25422() {
        return true;
    }

    public <T extends class04654 & class01294> T method_37063(T t) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.m_handler$ede000$viafabricplus_visuals$removeRecipeBook_46(t, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (T)((class04654)callbackInfoReturnable.getReturnValue());
        }
        this.field_33816.add(t);
        return this.method_25429(t);
    }

    public boolean method_25404(class06601 class066012) {
        class02116 class021162;
        if (class066012.i() && this.method_25422()) {
            this.method_25419();
            return true;
        }
        if (super.method_25404(class066012)) {
            return true;
        }
        switch (class066012.v()) {
            case 263: {
                class02116 class021163 = this.method_48264(class03249.field_41828);
                break;
            }
            case 262: {
                class02116 class021163 = this.method_48264(class03249.field_41829);
                break;
            }
            case 265: {
                class02116 class021163 = this.method_48264(class03249.field_41826);
                break;
            }
            case 264: {
                class02116 class021163 = this.method_48264(class03249.field_41827);
                break;
            }
            case 258: {
                class02116 class021163 = this.method_48266(!class066012.W());
                break;
            }
            default: {
                class02116 class021163 = class021162 = null;
            }
        }
        if (class021162 != null) {
            class02106 class021062 = super.method_48205((class02089)class021162);
            if (class021062 == null && class021162 instanceof class03251) {
                this.method_48267();
                class021062 = super.method_48205((class02089)class021162);
            }
            if (class021062 != null) {
                this.method_48263(class021062);
            }
        }
        return false;
    }

    protected void method_25415(String string, boolean bl) {
    }

    protected static void method_71844(class04453 class044532, String string, @Nullable class05096 class050962) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class05096.handler$ebd000$viafabricplus$changeCommandHandling(class044532, string, class050962, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        ((class01683)class044532.y_0).N(class07686.N((String)string), class050962);
    }

    /*
     * Loose catch block
     */
    public static void method_71847(class00647 class006472, class06202 class062022, @Nullable class05096 class050962) {
        block12: {
            class00647 class006473 = class006472;
            Objects.requireNonNull(class006473);
            class00647 class006474 = class006473;
            int n = 0;
            if ((switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00652.class, class00623.class, class00640.class, class00627.class}, (Object)class006474, (int)n)) {
                case 0 -> {
                    URI uRI;
                    URI uRI2 = uRI = ((class00652)class006474).y();
                    class05096.method_71843(class062022, class050962, uRI2);
                    yield false;
                }
                case 1 -> {
                    class00623 class006232 = (class00623)class006474;
                    class07536.m().N(class006232.y());
                    yield true;
                }
                case 2 -> {
                    String string;
                    String string2 = string = ((class00640)class006474).y();
                    if (class050962 != null) {
                        class050962.method_25415(string2, true);
                    }
                    yield true;
                }
                case 3 -> {
                    class00627 class006272 = (class00627)class006474;
                    String string = class006272.y();
                    ((class06197)class062022.L_3).N(string);
                    yield true;
                }
                default -> {
                    field_22782.error("Don't know how to handle {}", (Object)class006472);
                    yield true;
                }
            }) && (class05096)((Object)class062022.v_3) != class050962) {
                class062022.N(class050962);
            }
            break block12;
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
        }
    }

    public void method_48640() {
        this.method_41843();
    }

    private class03251 method_48266(boolean bl) {
        return new class03251(bl);
    }

    public static List<class00392> method_25408(class06202 class062022, class06584 class065842) {
        return class05096.redirect$cic000$nursultan$redirectGetTooltipFromItem(class065842, class06591.N((class07299)((class03448)class062022.T_3)), (class08036)((class04453)class062022.T_4), (class06497)(((class05630)class062022.i_7).W ? class06524.y : class06524.N));
    }

    public void method_25393() {
    }

    public boolean method_73150() {
        return false;
    }

    public void method_37066(class04654 class046542) {
        if (class046542 instanceof class01294) {
            this.field_33816.remove((class01294)class046542);
        }
        if (class046542 instanceof class03434) {
            this.field_33815.remove((class03434)class046542);
        }
        if (this.method_25399() == class046542) {
            this.method_48267();
        }
        this.field_22786.remove(class046542);
    }

    protected void method_37067() {
        this.field_33816.clear();
        this.field_22786.clear();
        this.field_33815.clear();
    }

    public void method_25432() {
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        if (this.method_73150()) {
            this.method_52752(class010542);
        } else {
            if ((class03448)this.field_22787.T_3 == null) {
                this.method_57728(class010542, f);
            }
            this.method_57734(class010542);
            this.method_57735(class010542);
        }
        ((class01056)this.field_22787.i_6).y();
    }

    public void method_48267() {
        class02106 class021062 = this.B();
        if (class021062 != null) {
            class021062.N(false);
        }
    }

    protected <T extends class01294> T method_37060(T t) {
        this.field_33816.add(t);
        return t;
    }

    public void method_52752(class01054 class010542) {
        class010542.N(0, 0, this.field_22789, this.field_22790, -1072689136, -804253680);
    }

    protected void method_57728(class01054 class010542, float f) {
        ((class03386)this.field_22787.i_5).n().N(class010542, this.field_22789, this.field_22790, this.method_72798());
    }

    protected void method_57734(class01054 class010542) {
        if ((float)((class05630)this.field_22787.i_7).l() >= 1.0f) {
            class010542.u();
        }
    }

    private void method_72802(long l) {
        this.field_33823 = l;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        Iterator<class01294> var5 = this.field_33816.iterator();
        while (var5.hasNext()) {
            var5.next().method_25394(class010542, n, n2, f);
        }
    }

    public void method_25419() {
        this.handler$cic000$nursultan$onClose(null);
        this.field_22787.N(null);
    }

    public boolean method_25421() {
        return true;
    }

    public void method_37070() {
        this.method_37059(200L, true);
    }

    protected void method_57735(class01054 class010542) {
        this.method_57736(class010542, 0, 0, this.field_22789, this.field_22790);
    }

    public void method_37068() {
        this.method_37059(750L, false);
    }

    protected boolean method_25414(String string, int n, int n2) {
        int n3 = string.indexOf(58);
        int n4 = string.indexOf(47);
        if (n == 58) {
            return (n4 == -1 || n2 <= n4) && n3 == -1;
        }
        if (n == 47) {
            return n2 > n3;
        }
        return n == 95 || n == 45 || n >= 97 && n <= 122 || n >= 48 && n <= 57 || n == 46;
    }

    private void method_37059(long l, boolean bl) {
        this.field_33824 = class07536.L() + l;
        if (bl) {
            this.field_33823 = Long.MIN_VALUE;
        }
    }

    public void method_37069() {
        this.method_37059(200L, true);
    }

    protected void method_37062(class03428 class034282) {
        class034282.N(class03457.field_33788, this.method_25435());
        if (this.method_48262()) {
            class034282.N(class03457.field_33791, field_33814);
        }
        this.method_37056(class034282);
    }

    public static void method_57737(class01054 class010542, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4) {
        int n5 = 32;
        class010542.N(class08394.Na, class018942, n, n2, f, f2, n3, n4, 32, 32);
    }

    public void method_25410(int n, int n2) {
        this.m_handler$bbg000$fabric_screen_api_v1$beforeResizeScreen_50(n, n2, null);
        this.field_22789 = n;
        this.field_22790 = n2;
        this.method_48640();
        this.m_handler$bbg000$fabric_screen_api_v1$afterResizeScreen_48(n, n2, null);
    }

    public void method_29638(List<Path> list) {
    }

    public static @Nullable class05117 method_37061(List<? extends class03434> list, @Nullable class03434 class034342) {
        class05117 class051172 = null;
        class05117 class051173 = null;
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            class03434 class034343 = list.get(i);
            class03432 class034322 = class034343.method_37018();
            if (class034322.N()) {
                if (class034343 == class034342) {
                    class051173 = new class05117(class034343, i, class034322);
                    continue;
                }
                return new class05117(class034343, i, class034322);
            }
            if (class034322.compareTo((Enum)(class051172 != null ? class051172.L() : class03432.field_33784)) <= 0) continue;
            class051172 = new class05117(class034343, i, class034322);
        }
        return class051172 != null ? class051172 : class051173;
    }

    protected void method_57736(class01054 class010542, int n, int n2, int n3, int n4) {
        class05096.method_57737(class010542, (class03448)this.field_22787.T_3 == null ? field_49511 : field_49894, n, n2, 0.0f, 0.0f, n3, n4);
    }

    public class01590 method_64506() {
        return this.field_22793;
    }

    public boolean method_64507() {
        return false;
    }

    public boolean method_73339() {
        return this.method_25422();
    }

    public void method_61040(boolean bl) {
        if (bl) {
            this.method_37059(field_33818, false);
        }
        if (this.field_52252 != null) {
            this.field_52252.N((Object)((class01299)((class05630)this.field_22787.i_7).NV().method_41753()));
        }
    }

    public class03255 method_48202() {
        return new class03255(0, 0, this.field_22789, this.field_22790);
    }

    private void method_37065(boolean bl) {
        this.field_33822.N(this::method_37062);
        String string = this.field_33822.N(!bl);
        if (!string.isEmpty()) {
            this.field_22787.NT().N(string);
        }
    }

    protected boolean method_72798() {
        return true;
    }

    protected boolean method_48262() {
        return true;
    }

    private boolean method_37073() {
        return class07529.G || this.field_22787.NT().N();
    }

    protected class00392 method_53870() {
        return class00392.L((String)"narration.component_list.usage");
    }

    public boolean method_25405(double d, double d2) {
        return true;
    }

    public boolean method_73217() {
        return this.method_25421();
    }

    public void method_65027(class07080 class070802) {
        class070802.N("Affected screen", 1).N("Screen name", () -> ((Object)((Object)this)).getClass().getCanonicalName());
    }

    public void method_37071() {
        long l;
        if (this.method_37073() && (l = class07536.L()) > this.field_33824 && l > this.field_33823) {
            this.method_37065(true);
            this.field_33824 = Long.MAX_VALUE;
        }
    }

    protected void method_37056(class03428 class034282) {
        List list = this.field_33815.stream().flatMap(class034342 -> class034342.e_().stream()).filter(class03434::method_37303).sorted(Comparator.comparingInt(class03256::method_48590)).toList();
        class05117 class051172 = class05096.method_37061(list, this.field_33813);
        if (class051172 != null) {
            if (class051172.L().N()) {
                this.field_33813 = class051172.N();
            }
            if (list.size() > 1) {
                class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.screen", (Object[])new Object[]{class051172.y() + 1, list.size()}));
                if (class051172.L() == class03432.field_33786) {
                    class034282.N(class03457.field_33791, this.method_53870());
                }
            }
            class051172.N().method_37020(class034282.N());
        }
    }

    public /* synthetic */ List getSelectables() {
        return this.field_33815;
    }

    public /* synthetic */ List getDrawables() {
        return this.field_33816;
    }

    public List fabric_getButtons() {
        if (this.fabricButtons == null) {
            this.fabricButtons = new ButtonList(this.field_33816, this.field_33815, this.field_22786);
        }
        return this.fabricButtons;
    }

    private void m_handler$ede000$viafabricplus_visuals$removeRecipeBook_46(class04654 class046542, CallbackInfoReturnable callbackInfoReturnable) {
        if (class046542 instanceof class04897 && ((class04897)class046542).field_45356 == class05306.N) {
            boolean bl = this instanceof class06274;
            if (VisualSettings.INSTANCE.hideFurnaceRecipeBook.isEnabled() && bl) {
                callbackInfoReturnable.setReturnValue((Object)class046542);
            } else if (VisualSettings.INSTANCE.hideCraftingRecipeBook.isEnabled() && !bl) {
                callbackInfoReturnable.setReturnValue((Object)class046542);
            }
        }
    }

    private static List redirect$cic000$nursultan$redirectGetTooltipFromItem(class06584 class065842, class06591 class065912, class08036 class080362, class06497 class064972) {
        class06202 class062022 = class06202.Nq();
        class11361 class113612 = class11361.N((List)class065842.N(class06591.N((class07299)((class03448)class062022.T_3)), (class08036)((class04453)class062022.T_4), (class06497)(((class05630)class062022.i_7).W ? class06497.y : class06497.N)), (class06584)class065842);
        class11938.L().L((Object)class113612);
        return class113612.N();
    }

    private void m_handler$bbg000$fabric_screen_api_v1$beforeInitScreen_47(int n, int n2, CallbackInfo callbackInfo) {
        this.beforeInit(n, n2);
    }

    private void m_handler$bbg000$fabric_screen_api_v1$afterResizeScreen_48(int n, int n2, CallbackInfo callbackInfo) {
        this.afterInit(n, n2);
    }

    public final void m_handler$bbg000$fabric_screen_api_v1$renderWithTooltip_49(class01054 class010542, int n, int n2, float f, CallbackInfo callbackInfo) {
        ((ScreenEvents.AfterBackground)ScreenEvents.afterBackground((class05096)this).invoker()).afterBackground(this, class010542, n, n2, f);
    }

    private void m_handler$bbg000$fabric_screen_api_v1$beforeResizeScreen_50(int n, int n2, CallbackInfo callbackInfo) {
        this.beforeInit(n, n2);
    }

    private void m_handler$bbg000$fabric_screen_api_v1$afterInitScreen_51(int n, int n2, CallbackInfo callbackInfo) {
        this.afterInit(n, n2);
    }

    public class00392 method_25435() {
        return this.method_25440();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void handler$zzp000$baritone$handleCustomClickEvent(class00647 class006472, class06202 class062022, class05096 class050962, CallbackInfo callbackInfo) {
        String string;
        if (class006472 == null) {
            return;
        }
        if (!(class006472 instanceof class00625)) return;
        class00625 class006252 = (class00625)class006472;
        try {
            String string2;
            string = string2 = class006252.y();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        if (!string.startsWith(IBaritoneChatControl.FORCE_COMMAND_PREFIX)) {
            return;
        }
        class006252 = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (class006252 != null) {
            class006252.getGameEventHandler().onSendChatMessage(new ChatEvent(string));
        }
        callbackInfo.cancel();
    }

    private static void handler$ebd000$viafabricplus$changeCommandHandling(class04453 class044532, String string, class05096 class050962, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4)) {
            return;
        }
        if (!string.startsWith("/")) {
            callbackInfo.cancel();
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19)) {
                ((class01683)class044532.y_0).L(string);
            }
        }
    }

    private Event ensureEventsAreInitialized(Event event) {
        if (event == null) {
            throw new IllegalStateException(String.format("[fabric-screen-api-v1] The current screen (%s) has not been correctly initialised, please send this crash log to the mod author. This is usually caused by calling setScreen on the wrong thread.", ((Object)((Object)this)).getClass().getName()));
        }
        return event;
    }

    public Event fabric_getBeforeTickEvent() {
        return this.ensureEventsAreInitialized(this.beforeTickEvent);
    }

    public Event fabric_getAfterRenderEvent() {
        return this.ensureEventsAreInitialized(this.afterRenderEvent);
    }

    public Event fabric_getRemoveEvent() {
        return this.ensureEventsAreInitialized(this.removeEvent);
    }

    public Event fabric_getAfterTickEvent() {
        return this.ensureEventsAreInitialized(this.afterTickEvent);
    }

    private void afterInit(int n, int n2) {
        ((ScreenEvents.AfterInit)ScreenEvents.AFTER_INIT.invoker()).afterInit(class06202.Nq(), this, n, n2);
    }

    private void beforeInit(int n, int n2) {
        this.fabricButtons = null;
        this.removeEvent = ScreenEventFactory.createRemoveEvent();
        this.beforeRenderEvent = ScreenEventFactory.createBeforeRenderEvent();
        this.afterBackgroundEvent = ScreenEventFactory.createAfterBackgroundEvent();
        this.afterRenderEvent = ScreenEventFactory.createAfterRenderEvent();
        this.beforeTickEvent = ScreenEventFactory.createBeforeTickEvent();
        this.afterTickEvent = ScreenEventFactory.createAfterTickEvent();
        this.allowKeyPressEvent = ScreenEventFactory.createAllowKeyPressEvent();
        this.beforeKeyPressEvent = ScreenEventFactory.createBeforeKeyPressEvent();
        this.afterKeyPressEvent = ScreenEventFactory.createAfterKeyPressEvent();
        this.allowKeyReleaseEvent = ScreenEventFactory.createAllowKeyReleaseEvent();
        this.beforeKeyReleaseEvent = ScreenEventFactory.createBeforeKeyReleaseEvent();
        this.afterKeyReleaseEvent = ScreenEventFactory.createAfterKeyReleaseEvent();
        this.allowMouseClickEvent = ScreenEventFactory.createAllowMouseClickEvent();
        this.beforeMouseClickEvent = ScreenEventFactory.createBeforeMouseClickEvent();
        this.afterMouseClickEvent = ScreenEventFactory.createAfterMouseClickEvent();
        this.allowMouseReleaseEvent = ScreenEventFactory.createAllowMouseReleaseEvent();
        this.beforeMouseReleaseEvent = ScreenEventFactory.createBeforeMouseReleaseEvent();
        this.afterMouseReleaseEvent = ScreenEventFactory.createAfterMouseReleaseEvent();
        this.allowMouseDragEvent = ScreenEventFactory.createAllowMouseDragEvent();
        this.beforeMouseDragEvent = ScreenEventFactory.createBeforeMouseDragEvent();
        this.afterMouseDragEvent = ScreenEventFactory.createAfterMouseDragEvent();
        this.allowMouseScrollEvent = ScreenEventFactory.createAllowMouseScrollEvent();
        this.beforeMouseScrollEvent = ScreenEventFactory.createBeforeMouseScrollEvent();
        this.afterMouseScrollEvent = ScreenEventFactory.createAfterMouseScrollEvent();
        ((ScreenEvents.BeforeInit)ScreenEvents.BEFORE_INIT.invoker()).beforeInit(class06202.Nq(), this, n, n2);
    }

    public /* synthetic */ class06202 getClient() {
        return this.field_22787;
    }

    private void handler$cic000$nursultan$onClose(CallbackInfo callbackInfo) {
        class11359 class113592 = class11359.N();
        class11938.L().L((Object)class113592);
    }

    public Event fabric_getAfterBackgroundEvent() {
        return this.ensureEventsAreInitialized(this.afterBackgroundEvent);
    }

    public Event fabric_getBeforeMouseDragEvent() {
        return this.ensureEventsAreInitialized(this.beforeMouseDragEvent);
    }

    public Event fabric_getAllowKeyReleaseEvent() {
        return this.ensureEventsAreInitialized(this.allowKeyReleaseEvent);
    }

    public Event fabric_getAllowMouseReleaseEvent() {
        return this.ensureEventsAreInitialized(this.allowMouseReleaseEvent);
    }

    public Event fabric_getAfterMouseScrollEvent() {
        return this.ensureEventsAreInitialized(this.afterMouseScrollEvent);
    }

    public Event fabric_getAfterMouseClickEvent() {
        return this.ensureEventsAreInitialized(this.afterMouseClickEvent);
    }

    public Event fabric_getAllowKeyPressEvent() {
        return this.ensureEventsAreInitialized(this.allowKeyPressEvent);
    }

    public Event fabric_getBeforeKeyPressEvent() {
        return this.ensureEventsAreInitialized(this.beforeKeyPressEvent);
    }

    public Event fabric_getBeforeKeyReleaseEvent() {
        return this.ensureEventsAreInitialized(this.beforeKeyReleaseEvent);
    }

    public Event fabric_getAfterKeyReleaseEvent() {
        return this.ensureEventsAreInitialized(this.afterKeyReleaseEvent);
    }

    public Event fabric_getAfterMouseReleaseEvent() {
        return this.ensureEventsAreInitialized(this.afterMouseReleaseEvent);
    }

    public Event fabric_getAfterMouseDragEvent() {
        return this.ensureEventsAreInitialized(this.afterMouseDragEvent);
    }

    public Event fabric_getAllowMouseClickEvent() {
        return this.ensureEventsAreInitialized(this.allowMouseClickEvent);
    }

    public Event fabric_getAfterKeyPressEvent() {
        return this.ensureEventsAreInitialized(this.afterKeyPressEvent);
    }

    public Event fabric_getBeforeMouseClickEvent() {
        return this.ensureEventsAreInitialized(this.beforeMouseClickEvent);
    }

    public Event fabric_getAllowMouseScrollEvent() {
        return this.ensureEventsAreInitialized(this.allowMouseScrollEvent);
    }

    public Event fabric_getBeforeMouseScrollEvent() {
        return this.ensureEventsAreInitialized(this.beforeMouseScrollEvent);
    }

    public Event fabric_getBeforeRenderEvent() {
        return this.ensureEventsAreInitialized(this.beforeRenderEvent);
    }

    public Event fabric_getBeforeMouseReleaseEvent() {
        return this.ensureEventsAreInitialized(this.beforeMouseReleaseEvent);
    }

    public Event fabric_getAllowMouseDragEvent() {
        return this.ensureEventsAreInitialized(this.allowMouseDragEvent);
    }

    static {
        field_33818 = field_33817 = TimeUnit.SECONDS.toMillis(2L);
    }
}

