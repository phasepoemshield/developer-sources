/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.sound.SoundEvent
 */
package kotakbaz.rain.module;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import kotakbaz.rain.Rain;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.module.setting.ClientColorSetting;
import kotakbaz.rain.module.setting.ModSetting;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062b\u064c;
import oxxxde.\u0631\u0638;
import oxxxde.\u0632\u062f;
import oxxxde.\u0634\u0651;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u064f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n\u00a2\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010!\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b#\u0010\"J\u001d\u0010$\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b$\u0010\"J\u001d\u0010%\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b*\u0010\u0012J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b,\u0010\u0010J+\u00100\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\b0\u00101JC\u00107\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010-\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\b\b\u0002\u00105\u001a\u0002022\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\b7\u00108J9\u0010=\u001a\u00020<2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003092\b\b\u0002\u0010;\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\b=\u0010>J9\u0010@\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003092\b\b\u0002\u0010;\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\b@\u0010AJ5\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\bD\u0010EJ+\u0010G\u001a\u00020F2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\bG\u0010HJ+\u0010K\u001a\u00020J2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020I2\b\b\u0002\u0010.\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\bK\u0010LJ-\u0010P\u001a\u00020O2\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020I2\b\b\u0002\u0010N\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\bP\u0010QJ-\u0010U\u001a\u00020T2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010R\u001a\u0002022\b\b\u0002\u0010S\u001a\u000202H\u0004\u00a2\u0006\u0004\bU\u0010VR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010W\u001a\u0004\b]\u0010YR\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010^R\u0016\u0010_\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010`\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bb\u0010cR\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bd\u0010cR!\u0010g\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030f0e8\u0006\u00a2\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\u00a8\u0006k"}, d2={"Loxxxde/\u062f\u0650;", "Loxxxde/\u0634\u0651;", "Loxxxde/\u0638\u064f;", "", "name", "Loxxxde/\u0638\u0635;", "category", "desc", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;)V", "", "isEnabled", "()Z", "value", "", "setEnabled", "(Z)V", "syncEnabledState", "()V", "toggle", "superDisable", "superEnable", "", "getKey", "()I", "setKey", "(I)V", "onKey", "isPreferredEnabled", "isAvailable", "isVisibleInGui", "Lkotlin/Function0;", "condition", "setVisibleInGui", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "addVisibleInGuiCondition", "setAvailable", "addAvailabilityCondition", "canToggle", "canBind", "onBindAttempt", "onDisable", "onEnable", "enabled", "playToggleSound", "default", "configKey", "Loxxxde/\u062e\u0630;", "boolean", "(Ljava/lang/String;ZLjava/lang/String;)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "", "min", "max", "step", "Loxxxde/\u0637\u064f;", "slider", "(Ljava/lang/String;FFFFLjava/lang/String;)Lkotakbaz/rain/module/setting/settings/SliderSetting;", "", "modes", "defaultIndex", "Loxxxde/\u0638\u064a;", "mode", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)Lkotakbaz/rain/module/setting/ModeSetting;", "Loxxxde/\u0638\u064d;", "mod", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)Lkotakbaz/rain/module/setting/ModSetting;", "maxLength", "Loxxxde/\u0639\u062a;", "text", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lkotakbaz/rain/module/setting/settings/TextSetting;", "Loxxxde/\u0630\u064f;", "bind", "(Ljava/lang/String;ILjava/lang/String;)Lkotakbaz/rain/module/setting/settings/BindSetting;", "Ljava/awt/Color;", "Loxxxde/\u0631\u062a;", "color", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;)Lkotakbaz/rain/module/setting/settings/ColorSetting;", "colorName", "clientColorName", "Loxxxde/\u0637\u0628;", "clientColor", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;)Lkotakbaz/rain/module/setting/ClientColorSetting;", "x", "y", "Loxxxde/\u0638\u0630;", "draggable", "(Ljava/lang/String;FF)Lkotakbaz/rain/client/draggable/Draggable;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loxxxde/\u0638\u0635;", "getCategory", "()Lkotakbaz/rain/client/extensions/Category;", "getDesc", "Z", "preferredEnabled", "key", "I", "visibleInGui", "Lkotlin/jvm/functions/Function0;", "available", "", "Loxxxde/\u0631\u0641;", "settings", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "rain-visuals"})
public class Module
implements \u0634\u0651,
\u0638\u064f {
    @NotNull
    private final String desc;
    @NotNull
    private final Category category;
    @NotNull
    private Function0<Boolean> available;
    @NotNull
    private final List<Setting<?>> settings;
    private int key;
    @NotNull
    private Function0<Boolean> visibleInGui;
    private boolean preferredEnabled;
    private boolean enabled;
    @NotNull
    private final String name;

    public void onBindAttempt() {
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public static /* synthetic */ BindSetting bind$default(Module module, String string, int n, String string2, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((n2 & 2) != 0) {
            n = -1;
        }
        if ((n2 & 4) != 0) {
            string2 = string;
        }
        return module.bind(string, n, string2);
    }

    public Module(@NotNull String name, @NotNull Category category, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.name = name;
        this.category = category;
        this.desc = desc;
        this.key = -1;
        this.visibleInGui = Module::visibleInGui$lambda$0;
        this.available = Module::available$lambda$0;
        this.settings = new ArrayList();
    }

    @NotNull
    protected final BooleanSetting boolean(@NotNull String name, boolean bl, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        BooleanSetting booleanSetting = new BooleanSetting(name, bl, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = booleanSetting;
        boolean bl2 = false;
        list.add(p0);
        return booleanSetting;
    }

    public final boolean isVisibleInGui() {
        return this.visibleInGui.invoke();
    }

    public static /* synthetic */ ColorSetting color$default(Module module, String string, Color color, String string2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: color");
        }
        if ((n & 2) != 0) {
            Color color2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
            color = color2;
        }
        if ((n & 4) != 0) {
            string2 = string;
        }
        return module.color(string, color, string2);
    }

    @NotNull
    protected final ModSetting mod(@NotNull String name, @NotNull List<String> modes, int defaultIndex, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        ModSetting modSetting = new ModSetting(name, modes, defaultIndex, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = modSetting;
        boolean bl = false;
        list.add(p0);
        return modSetting;
    }

    @Override
    public void setKey(int value) {
        if (this.key == value) {
            return;
        }
        this.key = value;
        Rain.INSTANCE.requestSave();
    }

    @NotNull
    public Module setVisibleInGui(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.visibleInGui = condition;
        return this;
    }

    private static final boolean clientColor$lambda$1(BooleanSetting $clientColorToggle) {
        return !\u0638\u062b.INSTANCE.isEnabled() || !((Boolean)$clientColorToggle.getValue()).booleanValue();
    }

    @NotNull
    public Module addAvailabilityCondition(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Function0<Boolean> previous = this.available;
        this.available = () -> Module.addAvailabilityCondition$lambda$0(previous, condition);
        this.syncEnabledState();
        return this;
    }

    private final void superDisable() {
        \u0631\u0638.INSTANCE.unregister(this);
    }

    @NotNull
    protected final BindSetting bind(@NotNull String name, int n, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        BindSetting bindSetting = new BindSetting(name, n, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = bindSetting;
        boolean bl = false;
        list.add(p0);
        return bindSetting;
    }

    private static final boolean addVisibleInGuiCondition$lambda$0(Function0 $previous, Function0 $condition) {
        return ((Boolean)$previous.invoke()).booleanValue() && ((Boolean)$condition.invoke()).booleanValue();
    }

    private final void playToggleSound(boolean enabled) {
        if (\u0636\u0643.getMc().player == null) {
            return;
        }
        \u0636\u0643.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.ui((SoundEvent)(enabled ? \u0632\u062f.INSTANCE.getMODULE_ENABLE() : \u0632\u062f.INSTANCE.getMODULE_DISABLE()), (float)1.0f, (float)1.0f));
    }

    @NotNull
    protected final ColorSetting color(@NotNull String name, @NotNull Color color, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "default");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        ColorSetting colorSetting = new ColorSetting(name, color, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = colorSetting;
        boolean bl = false;
        list.add(p0);
        return colorSetting;
    }

    @Override
    public void onKey() {
        if (!(this.canBind() && this.canToggle() && this.isAvailable())) {
            return;
        }
        this.toggle();
        RainMainMenuScreen$Link.INSTANCE.showModuleState(this, this.isEnabled());
    }

    private static final boolean visibleInGui$lambda$0() {
        return true;
    }

    private static final boolean available$lambda$0() {
        return true;
    }

    @NotNull
    public Module addVisibleInGuiCondition(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Function0<Boolean> previous = this.visibleInGui;
        this.visibleInGui = () -> Module.addVisibleInGuiCondition$lambda$0(previous, condition);
        return this;
    }

    public static /* synthetic */ ClientColorSetting clientColor$default(Module module, String string, Color color, String string2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clientColor");
        }
        if ((n & 1) != 0) {
            string = "Color";
        }
        if ((n & 2) != 0) {
            Color color2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
            color = color2;
        }
        if ((n & 4) != 0) {
            string2 = "Client Color";
        }
        return module.clientColor(string, color, string2);
    }

    public void onEnable() {
    }

    @NotNull
    protected final TextSetting text(@NotNull String name, @NotNull String string, int maxLength, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(string, "default");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        TextSetting textSetting = new TextSetting(name, string, maxLength, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = textSetting;
        boolean bl = false;
        list.add(p0);
        return textSetting;
    }

    @NotNull
    public final List<Setting<?>> getSettings() {
        return this.settings;
    }

    public static /* synthetic */ ModeSetting mode$default(Module module, String string, List list, int n, String string2, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mode");
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        if ((n2 & 8) != 0) {
            string2 = string;
        }
        return module.mode(string, list, n, string2);
    }

    public final boolean isAvailable() {
        return this.available.invoke();
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    protected final ClientColorSetting clientColor(@NotNull String colorName, @NotNull Color color, @NotNull String clientColorName) {
        void var5_5;
        void var4_4;
        Intrinsics.checkNotNullParameter(colorName, "colorName");
        Intrinsics.checkNotNullParameter(color, "default");
        Intrinsics.checkNotNullParameter(clientColorName, "clientColorName");
        Setting clientColorToggle = Module.boolean$default(this, clientColorName, false, null, 6, null).setVisible(Module::clientColor$lambda$0);
        Setting customColor = Module.color$default(this, colorName, color, null, 4, null).setVisible(() -> Module.clientColor$lambda$1((BooleanSetting)clientColorToggle));
        return new ClientColorSetting((BooleanSetting)var4_4, (ColorSetting)var5_5);
    }

    @Override
    public void toggle() {
        this.setEnabled(!this.preferredEnabled);
    }

    private final void superEnable() {
        \u0631\u0638.INSTANCE.register(this);
    }

    public static /* synthetic */ SliderSetting slider$default(Module module, String string, float f, float f2, float f3, float f4, String string2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slider");
        }
        if ((n & 0x10) != 0) {
            f4 = 0.0f;
        }
        if ((n & 0x20) != 0) {
            string2 = string;
        }
        return module.slider(string, f, f2, f3, f4, string2);
    }

    @NotNull
    protected final Draggable draggable(@NotNull String name, float x, float y) {
        Intrinsics.checkNotNullParameter(name, "name");
        return \u062b\u064c.INSTANCE.create(this, name, x, y);
    }

    public boolean canBind() {
        return true;
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @NotNull
    public Module setAvailable(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.available = condition;
        this.syncEnabledState();
        return this;
    }

    public static /* synthetic */ BooleanSetting boolean$default(Module module, String string, boolean bl, String string2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boolean");
        }
        if ((n & 2) != 0) {
            bl = false;
        }
        if ((n & 4) != 0) {
            string2 = string;
        }
        return module.boolean(string, bl, string2);
    }

    public static /* synthetic */ Draggable draggable$default(Module module, String string, float f, float f2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draggable");
        }
        if ((n & 1) != 0) {
            string = module.name;
        }
        if ((n & 2) != 0) {
            f = 20.0f;
        }
        if ((n & 4) != 0) {
            f2 = 20.0f;
        }
        return module.draggable(string, f, f2);
    }

    @NotNull
    protected final SliderSetting slider(@NotNull String name, float f, float min, float max, float step, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        SliderSetting sliderSetting = new SliderSetting(name, f, min, max, step, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = sliderSetting;
        boolean bl = false;
        list.add(p0);
        return sliderSetting;
    }

    public boolean canToggle() {
        return true;
    }

    public void onDisable() {
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    public static /* synthetic */ ModSetting mod$default(Module module, String string, List list, int n, String string2, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mod");
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        if ((n2 & 8) != 0) {
            string2 = string;
        }
        return module.mod(string, list, n, string2);
    }

    @Override
    public void setEnabled(boolean value) {
        if (this.preferredEnabled == value) {
            return;
        }
        this.preferredEnabled = value;
        this.syncEnabledState();
        Rain.INSTANCE.requestSave();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    private static final boolean addAvailabilityCondition$lambda$0(Function0 $previous, Function0 $condition) {
        return ((Boolean)$previous.invoke()).booleanValue() && ((Boolean)$condition.invoke()).booleanValue();
    }

    @NotNull
    protected final ModeSetting mode(@NotNull String name, @NotNull List<String> modes, int defaultIndex, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        ModeSetting modeSetting = new ModeSetting(name, modes, defaultIndex, configKey);
        List<Setting<?>> list = this.settings;
        Setting p0 = modeSetting;
        boolean bl = false;
        list.add(p0);
        return modeSetting;
    }

    public final boolean isPreferredEnabled() {
        return this.preferredEnabled;
    }

    public static /* synthetic */ TextSetting text$default(Module module, String string, String string2, int n, String string3, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: text");
        }
        if ((n2 & 2) != 0) {
            string2 = "";
        }
        if ((n2 & 4) != 0) {
            n = 48;
        }
        if ((n2 & 8) != 0) {
            string3 = string;
        }
        return module.text(string, string2, n, string3);
    }

    public final void syncEnabledState() {
        boolean shouldBeEnabled = this.preferredEnabled && this.isAvailable();
        if (shouldBeEnabled == this.enabled) {
            return;
        }
        this.enabled = shouldBeEnabled;
        if (shouldBeEnabled) {
            this.superEnable();
            this.onEnable();
            this.playToggleSound(true);
        } else {
            this.superDisable();
            this.onDisable();
            this.playToggleSound(false);
        }
    }

    private static final boolean clientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}

