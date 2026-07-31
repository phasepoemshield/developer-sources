/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.interfaces.IBindable;
import kotakbaz.rain.client.interfaces.IState;
import kotakbaz.rain.client.sound.RainSoundEvents;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.module.modules.render.ClientColorModule;
import kotakbaz.rain.module.setting.B;
import kotakbaz.rain.module.setting.ClientColorSetting;
import kotakbaz.rain.module.setting.ModSetting;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n\u00a2\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010!\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b#\u0010\"J\u001d\u0010$\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b$\u0010\"J\u001d\u0010%\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b*\u0010\u0012J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b,\u0010\u0010J!\u0010/\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\nH\u0004\u00a2\u0006\u0004\b/\u00100J9\u00106\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010-\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0004\u00a2\u0006\u0004\b6\u00107J/\u0010<\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003082\b\b\u0002\u0010:\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\b<\u0010=J/\u0010?\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003082\b\b\u0002\u0010:\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\b?\u0010@J+\u0010C\u001a\u00020B2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020E2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\bF\u0010GJ!\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020HH\u0004\u00a2\u0006\u0004\bJ\u0010KJ-\u0010O\u001a\u00020N2\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020H2\b\b\u0002\u0010M\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\bO\u0010PJ-\u0010T\u001a\u00020S2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u0002012\b\b\u0002\u0010R\u001a\u000201H\u0004\u00a2\u0006\u0004\bT\u0010UR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\b\\\u0010XR\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010]R\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bc\u0010bR!\u0010f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030e0d8\u0006\u00a2\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\u00a8\u0006j"}, d2={"Lkotakbaz/rain/module/Module;", "Lkotakbaz/rain/client/interfaces/IState;", "Lkotakbaz/rain/client/interfaces/IBindable;", "", "name", "Lkotakbaz/rain/client/extensions/Category;", "category", "desc", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;)V", "", "isEnabled", "()Z", "value", "", "setEnabled", "(Z)V", "syncEnabledState", "()V", "toggle", "superDisable", "superEnable", "", "getKey", "()I", "setKey", "(I)V", "onKey", "isPreferredEnabled", "isAvailable", "isVisibleInGui", "Lkotlin/Function0;", "condition", "setVisibleInGui", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "addVisibleInGuiCondition", "setAvailable", "addAvailabilityCondition", "canToggle", "canBind", "onBindAttempt", "onDisable", "onEnable", "enabled", "playToggleSound", "default", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "boolean", "(Ljava/lang/String;Z)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "", "min", "max", "step", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "slider", "(Ljava/lang/String;FFFF)Lkotakbaz/rain/module/setting/settings/SliderSetting;", "", "modes", "defaultIndex", "Lkotakbaz/rain/module/setting/ModeSetting;", "mode", "(Ljava/lang/String;Ljava/util/List;I)Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/ModSetting;", "mod", "(Ljava/lang/String;Ljava/util/List;I)Lkotakbaz/rain/module/setting/ModSetting;", "maxLength", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "text", "(Ljava/lang/String;Ljava/lang/String;I)Lkotakbaz/rain/module/setting/settings/TextSetting;", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "bind", "(Ljava/lang/String;I)Lkotakbaz/rain/module/setting/settings/BindSetting;", "Ljava/awt/Color;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "color", "(Ljava/lang/String;Ljava/awt/Color;)Lkotakbaz/rain/module/setting/settings/ColorSetting;", "colorName", "clientColorName", "Lkotakbaz/rain/module/setting/ClientColorSetting;", "clientColor", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;)Lkotakbaz/rain/module/setting/ClientColorSetting;", "x", "y", "Lkotakbaz/rain/client/draggable/Draggable;", "draggable", "(Ljava/lang/String;FF)Lkotakbaz/rain/client/draggable/Draggable;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotakbaz/rain/client/extensions/Category;", "getCategory", "()Lkotakbaz/rain/client/extensions/Category;", "getDesc", "Z", "preferredEnabled", "key", "I", "visibleInGui", "Lkotlin/jvm/functions/Function0;", "available", "", "Lkotakbaz/rain/module/setting/Setting;", "settings", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\nkotakbaz/rain/module/Module\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public class Module
implements IState,
IBindable {
    @NotNull
    private final String name;
    @NotNull
    private final Category category;
    @NotNull
    private final String desc;
    private boolean enabled;
    private boolean preferredEnabled;
    private int key;
    @NotNull
    private Function0<Boolean> visibleInGui;
    @NotNull
    private Function0<Boolean> available;
    @NotNull
    private final List<B<?>> settings;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public Module(@NotNull String name, @NotNull Category category, @NotNull String desc) {
        int n2 = C[0];
        n2 += C[1];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 -= C[2]]);
        int n3 = C[3];
        n3 ^= C[4];
        Intrinsics.checkNotNullParameter(category, (String)a[n3 += C[5]]);
        int n4 = C[6];
        n4 -= C[7];
        Intrinsics.checkNotNullParameter(desc, (String)a[n4 += C[8]]);
        this.name = name;
        this.category = category;
        this.desc = desc;
        int n5 = C[9];
        n5 ^= C[10];
        this.key = n5 += C[11];
        this.visibleInGui = Module::visibleInGui$lambda$0;
        this.available = Module::available$lambda$0;
        this.settings = new ArrayList();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final List<B<?>> getSettings() {
        return this.settings;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void setEnabled(boolean value2) {
        this.preferredEnabled = value2;
        this.syncEnabledState();
    }

    public final void syncEnabledState() {
        int n2;
        long l2 = -7463985815423009486L;
        long l3 = -2828622317341885665L;
        if (this.preferredEnabled && this.isAvailable()) {
            int n3 = C[12];
            n3 += C[13];
            n2 = n3 -= C[14];
        } else {
            int n4 = C[15];
            n4 += C[16];
            n2 = n4 ^= C[17];
        }
        int n5 = C[18];
        n5 -= C[19];
        long l4 = l3;
        int n6 = C[21];
        n6 -= C[22];
        l3 = l4 ^ ((long)n2 << (n5 += C[20]) ^ l4) & -1L << (n6 -= C[23]);
        int n7 = C[24];
        n7 -= C[25];
        if ((int)(l3 >>> (n7 -= C[26])) == this.enabled) {
            return;
        }
        int n8 = C[27];
        n8 -= C[28];
        this.enabled = (int)(l3 >>> (n8 ^= C[29]));
        int n9 = C[30];
        n9 ^= C[31];
        if ((int)(l3 >>> (n9 -= C[32])) != 0) {
            this.superEnable();
            this.onEnable();
            boolean bl = C[33];
            bl ^= C[34];
            this.playToggleSound(bl -= C[35]);
        } else {
            this.superDisable();
            this.onDisable();
            boolean bl = C[36];
            bl -= C[37];
            this.playToggleSound(bl += C[38]);
        }
    }

    @Override
    public void toggle() {
        boolean bl;
        if (!this.preferredEnabled) {
            boolean bl2 = C[39];
            bl2 += C[40];
            bl = bl2 ^= C[41];
        } else {
            boolean bl3 = C[42];
            bl3 += C[43];
            bl = bl3 += C[44];
        }
        this.setEnabled(bl);
    }

    private final void superDisable() {
        EventManager.INSTANCE.unregister(this);
    }

    private final void superEnable() {
        EventManager.INSTANCE.register(this);
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public void setKey(int value2) {
        if (this.key == value2) {
            return;
        }
        this.key = value2;
    }

    @Override
    public void onKey() {
        if (!(this.canBind() && this.canToggle() && this.isAvailable())) {
            return;
        }
        this.toggle();
    }

    public final boolean isPreferredEnabled() {
        return this.preferredEnabled;
    }

    public final boolean isAvailable() {
        return this.available.invoke();
    }

    public final boolean isVisibleInGui() {
        return this.visibleInGui.invoke();
    }

    @NotNull
    public Module setVisibleInGui(@NotNull Function0<Boolean> condition) {
        int n2 = C[45];
        n2 -= C[46];
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 += C[47]]);
        this.visibleInGui = condition;
        return this;
    }

    @NotNull
    public Module addVisibleInGuiCondition(@NotNull Function0<Boolean> condition) {
        int n2 = C[48];
        n2 -= C[49];
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 ^= C[50]]);
        Function0<Boolean> function0 = this.visibleInGui;
        this.visibleInGui = () -> Module.addVisibleInGuiCondition$lambda$0(function0, condition);
        return this;
    }

    @NotNull
    public Module setAvailable(@NotNull Function0<Boolean> condition) {
        int n2 = C[51];
        n2 ^= C[52];
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 -= C[53]]);
        this.available = condition;
        this.syncEnabledState();
        return this;
    }

    @NotNull
    public Module addAvailabilityCondition(@NotNull Function0<Boolean> condition) {
        int n2 = C[54];
        n2 -= C[55];
        Intrinsics.checkNotNullParameter(condition, (String)a[n2 ^= C[56]]);
        Function0<Boolean> function0 = this.available;
        this.available = () -> Module.addAvailabilityCondition$lambda$0(function0, condition);
        this.syncEnabledState();
        return this;
    }

    public boolean canToggle() {
        boolean bl = C[57];
        bl -= C[58];
        return bl += C[59];
    }

    public boolean canBind() {
        boolean bl = C[60];
        bl += C[61];
        return bl += C[62];
    }

    public void onBindAttempt() {
    }

    public void onDisable() {
    }

    public void onEnable() {
    }

    private final void playToggleSound(boolean enabled) {
        if (kotakbaz.rain.client.extensions.b.getMc().player == null) {
            return;
        }
        kotakbaz.rain.client.extensions.b.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.master((SoundEvent)(enabled ? RainSoundEvents.INSTANCE.getMODULE_ENABLE() : RainSoundEvents.INSTANCE.getMODULE_DISABLE()), (float)1.0f, (float)1.0f));
    }

    @NotNull
    protected final BooleanSetting cfr_renamed_0(@NotNull String name, boolean bl) {
        long l2 = 8188960090689066237L;
        int n2 = C[63];
        n2 -= C[64];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 ^= C[65]]);
        BooleanSetting booleanSetting = new BooleanSetting(name, bl);
        List<B<?>> list = this.settings;
        Setting setting = booleanSetting;
        long l3 = l2;
        int n3 = C[66];
        n3 -= C[67];
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= C[68]);
        list.add((B<?>)((Object)setting));
        return booleanSetting;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ BooleanSetting boolean$default(Module module, String string, boolean bl, int n2, Object object) {
        int n3;
        void var3_4;
        void var4_5;
        if (var4_5 != null) {
            int n4 = C[69];
            n4 -= C[70];
            int n5 = C[72];
            n5 -= C[73];
            throw new UnsupportedOperationException((String)a[n4 -= C[71]] + (String)a[n5 -= C[74]]);
        }
        int n6 = C[75];
        n6 -= C[76];
        if ((var3_4 & (n6 -= C[77])) != 0) {
            int n7 = C[78];
            n7 ^= C[79];
            n3 = n7 -= C[80];
        }
        return module.cfr_renamed_0(string, n3 != 0);
    }

    @NotNull
    protected final SliderSetting slider(@NotNull String name, float f2, float min, float max, float step) {
        long l2 = 2683804965646241877L;
        int n2 = C[81];
        n2 -= C[82];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 -= C[83]]);
        SliderSetting sliderSetting = new SliderSetting(name, f2, min, max, step);
        List<B<?>> list = this.settings;
        Setting setting = sliderSetting;
        long l3 = l2;
        int n3 = C[84];
        n3 += C[85];
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= C[86]);
        list.add((B<?>)((Object)setting));
        return sliderSetting;
    }

    public static /* synthetic */ SliderSetting slider$default(Module module, String string, float f2, float f3, float f4, float f5, int n2, Object object) {
        if (object != null) {
            int n3 = C[87];
            n3 -= C[88];
            int n4 = C[90];
            n4 ^= C[91];
            throw new UnsupportedOperationException((String)a[n3 -= C[89]] + (String)a[n4 -= C[92]]);
        }
        int n5 = C[93];
        n5 ^= C[94];
        if ((n2 & (n5 ^= C[95])) != 0) {
            f5 = 0.0f;
        }
        return module.slider(string, f2, f3, f4, f5);
    }

    @NotNull
    protected final ModeSetting mode(@NotNull String name, @NotNull List<String> modes, int defaultIndex) {
        long l2 = -6074893960776269671L;
        int n2 = C[96];
        n2 -= C[97];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 -= C[98]]);
        int n3 = C[99];
        n3 -= C[100];
        Intrinsics.checkNotNullParameter(modes, (String)a[n3 -= C[101]]);
        ModeSetting modeSetting = new ModeSetting(name, modes, defaultIndex);
        List<B<?>> list = this.settings;
        Setting setting = modeSetting;
        long l3 = l2;
        int n4 = C[102];
        n4 -= C[103];
        l2 = l3 ^ (0L ^ l3) & -1L << (n4 ^= C[104]);
        list.add((B<?>)((Object)setting));
        return modeSetting;
    }

    public static /* synthetic */ ModeSetting mode$default(Module module, String string, List list, int n2, int n3, Object object) {
        if (object != null) {
            int n4 = C[105];
            n4 -= C[106];
            int n5 = C[108];
            n5 += C[109];
            throw new UnsupportedOperationException((String)a[n4 ^= C[107]] + (String)a[n5 ^= C[110]]);
        }
        int n6 = C[111];
        n6 ^= C[112];
        if ((n3 & (n6 += C[113])) != 0) {
            int n7 = C[114];
            n7 ^= C[115];
            n2 = n7 += C[116];
        }
        return module.mode(string, list, n2);
    }

    @NotNull
    protected final ModSetting mod(@NotNull String name, @NotNull List<String> modes, int defaultIndex) {
        long l2 = 253829035554551729L;
        int n2 = C[117];
        n2 ^= C[118];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 ^= C[119]]);
        int n3 = C[120];
        n3 -= C[121];
        Intrinsics.checkNotNullParameter(modes, (String)a[n3 -= C[122]]);
        ModSetting modSetting = new ModSetting(name, modes, defaultIndex);
        List<B<?>> list = this.settings;
        Setting setting = modSetting;
        long l3 = l2;
        int n4 = C[123];
        n4 += C[124];
        l2 = l3 ^ (0L ^ l3) & -1L << (n4 ^= C[125]);
        list.add((B<?>)((Object)setting));
        return modSetting;
    }

    public static /* synthetic */ ModSetting mod$default(Module module, String string, List list, int n2, int n3, Object object) {
        if (object != null) {
            int n4 = C[126];
            n4 += C[127];
            int n5 = C[129];
            n5 += C[130];
            throw new UnsupportedOperationException((String)a[n4 ^= C[128]] + (String)a[n5 -= C[131]]);
        }
        int n6 = C[132];
        n6 -= C[133];
        if ((n3 & (n6 -= C[134])) != 0) {
            int n7 = C[135];
            n7 ^= C[136];
            n2 = n7 ^= C[137];
        }
        return module.mod(string, list, n2);
    }

    @NotNull
    protected final TextSetting text(@NotNull String name, @NotNull String string, int maxLength) {
        long l2 = -6688202655946389523L;
        int n2 = C[138];
        n2 ^= C[139];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 ^= C[140]]);
        int n3 = C[141];
        n3 ^= C[142];
        Intrinsics.checkNotNullParameter(string, (String)a[n3 ^= C[143]]);
        TextSetting textSetting = new TextSetting(name, string, maxLength);
        List<B<?>> list = this.settings;
        Setting setting = textSetting;
        long l3 = l2;
        int n4 = C[144];
        n4 -= C[145];
        l2 = l3 ^ (0L ^ l3) & -1L << (n4 -= C[146]);
        list.add((B<?>)((Object)setting));
        return textSetting;
    }

    public static /* synthetic */ TextSetting text$default(Module module, String string, String string2, int n2, int n3, Object object) {
        if (object != null) {
            int n4 = C[147];
            n4 ^= C[148];
            int n5 = C[150];
            n5 += C[151];
            throw new UnsupportedOperationException((String)a[n4 -= C[149]] + (String)a[n5 -= C[152]]);
        }
        int n6 = C[153];
        n6 += C[154];
        if ((n3 & (n6 += C[155])) != 0) {
            string2 = "";
        }
        int n7 = C[156];
        n7 -= C[157];
        if ((n3 & (n7 += C[158])) != 0) {
            int n8 = C[159];
            n8 -= C[160];
            n2 = n8 ^= C[161];
        }
        return module.text(string, string2, n2);
    }

    @NotNull
    protected final BindSetting bind(@NotNull String name, int n2) {
        long l2 = -5439085265277674899L;
        int n3 = C[162];
        n3 += C[163];
        Intrinsics.checkNotNullParameter(name, (String)a[n3 -= C[164]]);
        BindSetting bindSetting = new BindSetting(name, n2);
        List<B<?>> list = this.settings;
        Setting setting = bindSetting;
        long l3 = l2;
        int n4 = C[165];
        n4 += C[166];
        l2 = l3 ^ (0L ^ l3) & -1L << (n4 -= C[167]);
        list.add((B<?>)((Object)setting));
        return bindSetting;
    }

    public static /* synthetic */ BindSetting bind$default(Module module, String string, int n2, int n3, Object object) {
        if (object != null) {
            int n4 = C[168];
            n4 ^= C[169];
            int n5 = C[171];
            n5 += C[172];
            throw new UnsupportedOperationException((String)a[n4 += C[170]] + (String)a[n5 ^= C[173]]);
        }
        int n6 = C[174];
        n6 -= C[175];
        if ((n3 & (n6 ^= C[176])) != 0) {
            int n7 = C[177];
            n7 ^= C[178];
            n2 = n7 -= C[179];
        }
        return module.bind(string, n2);
    }

    @NotNull
    protected final ColorSetting color(@NotNull String name, @NotNull Color color) {
        long l2 = -4885681974370899920L;
        int n2 = C[180];
        n2 ^= C[181];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 += C[182]]);
        int n3 = C[183];
        n3 += C[184];
        Intrinsics.checkNotNullParameter(color, (String)a[n3 += C[185]]);
        ColorSetting colorSetting = new ColorSetting(name, color);
        List<B<?>> list = this.settings;
        Setting setting = colorSetting;
        long l3 = l2;
        int n4 = C[186];
        n4 ^= C[187];
        l2 = l3 ^ (0L ^ l3) & -1L << (n4 ^= C[188]);
        list.add((B<?>)((Object)setting));
        return colorSetting;
    }

    public static /* synthetic */ ColorSetting color$default(Module module, String string, Color color, int n2, Object object) {
        if (object != null) {
            int n3 = C[189];
            n3 += C[190];
            int n4 = C[192];
            n4 += C[193];
            throw new UnsupportedOperationException((String)a[n3 += C[191]] + (String)a[n4 ^= C[194]]);
        }
        int n5 = C[195];
        n5 ^= C[196];
        if ((n2 & (n5 ^= C[197])) != 0) {
            Color color2 = Color.WHITE;
            int n6 = C[198];
            n6 -= C[199];
            Intrinsics.checkNotNullExpressionValue(color2, (String)a[n6 += C[200]]);
            color = color2;
        }
        return module.color(string, color);
    }

    @NotNull
    protected final ClientColorSetting clientColor(@NotNull String colorName, @NotNull Color color, @NotNull String clientColorName) {
        int n2 = C[201];
        n2 -= C[202];
        Intrinsics.checkNotNullParameter(colorName, (String)a[n2 -= C[203]]);
        int n3 = C[204];
        n3 += C[205];
        Intrinsics.checkNotNullParameter(color, (String)a[n3 ^= C[206]]);
        int n4 = C[207];
        n4 -= C[208];
        Intrinsics.checkNotNullParameter(clientColorName, (String)a[n4 += C[209]]);
        boolean bl = C[210];
        bl ^= C[211];
        int n5 = C[213];
        n5 += C[214];
        Setting setting = Module.boolean$default(this, clientColorName, bl ^= C[212], n5 ^= C[215], null).setVisible(Module::clientColor$lambda$0);
        Setting setting2 = this.color(colorName, color).setVisible(() -> Module.clientColor$lambda$1((BooleanSetting)setting));
        return new ClientColorSetting((BooleanSetting)setting, (ColorSetting)setting2);
    }

    public static /* synthetic */ ClientColorSetting clientColor$default(Module module, String string, Color color, String string2, int n2, Object object) {
        if (object != null) {
            int n3 = C[216];
            n3 += C[217];
            int n4 = C[219];
            n4 ^= C[220];
            throw new UnsupportedOperationException((String)a[n3 -= C[218]] + (String)a[n4 += C[221]]);
        }
        int n5 = C[222];
        n5 -= C[223];
        if ((n2 & (n5 += C[224])) != 0) {
            int n6 = C[225];
            n6 ^= C[226];
            string = (String)a[n6 += C[227]];
        }
        int n7 = C[228];
        n7 ^= C[229];
        if ((n2 & (n7 += C[230])) != 0) {
            Color color2 = Color.WHITE;
            int n8 = C[231];
            n8 ^= C[232];
            Intrinsics.checkNotNullExpressionValue(color2, (String)a[n8 += C[233]]);
            color = color2;
        }
        int n9 = C[234];
        n9 += C[235];
        if ((n2 & (n9 -= C[236])) != 0) {
            int n10 = C[237];
            n10 ^= C[238];
            string2 = (String)a[n10 ^= C[239]];
        }
        return module.clientColor(string, color, string2);
    }

    @NotNull
    protected final c draggable(@NotNull String name, float x2, float y) {
        int n2 = C[240];
        n2 += C[241];
        Intrinsics.checkNotNullParameter(name, (String)a[n2 += C[242]]);
        return D.INSTANCE.create(this, name, x2, y);
    }

    public static /* synthetic */ c draggable$default(Module module, String string, float f2, float f3, int n2, Object object) {
        if (object != null) {
            int n3 = C[243];
            n3 ^= C[244];
            int n4 = C[246];
            n4 += C[247];
            throw new UnsupportedOperationException((String)a[n3 += C[245]] + (String)a[n4 -= C[248]]);
        }
        int n5 = C[249];
        n5 += C[250];
        if ((n2 & (n5 ^= C[251])) != 0) {
            string = module.name;
        }
        int n6 = C[252];
        n6 ^= C[253];
        if ((n2 & (n6 ^= C[254])) != 0) {
            f2 = 20.0f;
        }
        int n7 = C[255];
        n7 ^= C[256];
        if ((n2 & (n7 -= C[257])) != 0) {
            f3 = 20.0f;
        }
        return module.draggable(string, f2, f3);
    }

    private static final boolean visibleInGui$lambda$0() {
        boolean bl = C[258];
        bl ^= C[259];
        return bl -= C[260];
    }

    private static final boolean available$lambda$0() {
        boolean bl = C[261];
        bl ^= C[262];
        return bl ^= C[263];
    }

    private static final boolean addVisibleInGuiCondition$lambda$0(Function0 $previous, Function0 $condition) {
        int n2;
        if (((Boolean)$previous.invoke()).booleanValue() && ((Boolean)$condition.invoke()).booleanValue()) {
            int n3 = C[264];
            n3 ^= C[265];
            n2 = n3 ^= C[266];
        } else {
            int n4 = C[267];
            n4 += C[268];
            n2 = n4 ^= C[269];
        }
        return n2 != 0;
    }

    private static final boolean addAvailabilityCondition$lambda$0(Function0 $previous, Function0 $condition) {
        int n2;
        if (((Boolean)$previous.invoke()).booleanValue() && ((Boolean)$condition.invoke()).booleanValue()) {
            int n3 = C[270];
            n3 += C[271];
            n2 = n3 ^= C[272];
        } else {
            int n4 = C[273];
            n4 ^= C[274];
            n2 = n4 -= C[275];
        }
        return n2 != 0;
    }

    private static final boolean clientColor$lambda$0() {
        return ClientColorModule.INSTANCE.isEnabled();
    }

    private static final boolean clientColor$lambda$1(BooleanSetting $clientColorToggle) {
        int n2;
        if (!ClientColorModule.INSTANCE.isEnabled() || !((Boolean)$clientColorToggle.getValue()).booleanValue()) {
            int n3 = C[276];
            n3 += C[277];
            n2 = n3 -= C[278];
        } else {
            int n4 = C[279];
            n4 -= C[280];
            n2 = n4 -= C[281];
        }
        return n2 != 0;
    }

    static {
        Module.b();
        long l2 = 2243976407097098603L;
        long l3 = 8257173282470170080L;
        long l4 = -4563095205719465404L;
        long l5 = 1456654289448466936L;
        long l6 = -4131868689147778656L;
        long l7 = 5574250026115614305L;
        long l8 = 443180120001287879L;
        long l9 = 7543917216148536744L;
        long l10 = -4966981464460821384L;
        long l11 = 9030570780338551280L;
        long l12 = -7697705150070621447L;
        long l13 = -46241376518045910L;
        long l14 = 8148440395317938031L;
        long l15 = 5042310826225484932L;
        int n2 = C[282];
        n2 += C[283];
        a = new Object[n2 -= C[284]];
        long l16 = l15;
        int n3 = C[285];
        n3 ^= C[286];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= C[287]);
        Object[] objectArray = new Object[C[288]];
        objectArray[Module.C[289]] = A;
        objectArray[Module.C[290]] = C[291];
        int n4 = C[292];
        Object object = Module.A()[C[293]];
        if (object == null) {
            char[] cArray = "\u691c\u6bfb\u6916\u691a\u6c02\u6bf7\u6c00\u6bac\u6baa\u68bc\u6917\u68b0\u68b7\u68b6\u6920\u6bab\u68ba\u6922\u68cd\u6bf9\u691a\u68c3\u6c14\u691b\u691e\u691d\u691a\u691a\u68b7\u68b7\u6bac\u68ae\u68ba\u68c9\u6c10\u6c02\u6bf7\u6bfa\u6bfd\u6922\u68c5\u6baa\u68b7\u6bfb\u6925\u6ba9\u6baa\u6916\u6920\u691b\u6bfb\u68bd\u6bfc\u6ba9\u6924\u6bb5\u68cc\u6bf8\u68d5\u6bf9\u691e\u6922\u6bfd\u6baa\u68ce\u6bf7\u6bac\u68b6\u68c3\u68cf\u68bd\u6bfb\u6c0f\u6c14\u6925\u68c9\u6bf7\u6c10\u6c14\u691f\u6c04\u6bf8\u68d0\u68b9\u691a\u691b\u68b4\u68af\u6921\u6c03\u6923\u68ce\u68ca\u68af\u6c14\u68b0\u691d\u6baa\u6bfd\u68b9\u68ce\u6bf8\u6919\u6bfd\u68af\u6921\u691e\u6bfc\u6bf7\u68bc\u68b7\u6923\u691f\u68ae\u68cc\u6925\u68ce\u68d0\u6c02\u68cb\u68ba\u68cd\u6917\u6c04\u6920\u68cd\u6ba9\u6bfc\u6bf8\u6922\u68b0\u691c\u6bfb\u6c0e\u6925\u6bf7\u6917\u6baa\u68b4\u68af\u68cd\u6c10\u691f\u6c14\u6bfa\u6baa\u6c03\u68ae\u6923\u6bfd\u691e\u68b9\u6bfa\u68c5\u68cf\u6c03\u691a\u68bd\u6c01\u6c04\u68b4\u68cd\u6c01\u6c03\u68ce\u6c01\u6c04\u6c0e\u6925\u68bb\u6c01\u68c3\u6916\u6c04\u6bf8\u6bb5\u68ce\u6924\u68ba\u6ba9\u6bad\u68cb\u68b0\u6bfc\u6920\u6ba9\u68b4\u6baa\u68b6\u6916\u68cc\u6c0f\u68c5\u68bd\u6bf8\u6925\u6c04\u6bfe\u6bff\u6bf6\u6918\u6bfe\u6923\u68b6\u6bff\u6bb5\u6bfd\u6c0f\u6bfa\u68ae\u68cf\u691f\u6bf7\u6bac\u6922\u6bac\u6c05\u68cc\u68b4\u6baa\u6baa\u6bfe\u68b9\u68b4\u6925\u6bf9\u6c05\u68ba\u691d\u6bb5\u6bac\u68b6\u6c05\u6bf8\u68cc\u6bf9\u6c00\u6925\u6c02\u6bff\u68b4\u6bf8\u68b4\u6c0f\u68bb\u68b0\u68bd\u68bc\u6ba9\u6bf6\u6c0e\u6c04\u68ba\u68cc\u6c02\u6bab\u6918\u6bf9\u6c0f\u68b0\u6bfe\u6bfe\u68c5\u691f\u6bfd\u68cf\u6920\u6919\u68bb\u691b\u68cc\u6c0e\u6bf7\u6bad\u68bd\u68c3\u6916\u6921\u6bfc\u6bfa\u68b6\u6ba9\u691e\u68cc\u6920\u68d0\u68af\u68cd\u6925\u68ba\u68cb\u6bff\u6bfe\u68b0\u691f\u68b7\u6baa\u68cf\u68cf\u68b9\u691e\u6923\u68c9\u6c14\u68b6\u68c3\u6bfc\u68b6\u6bac\u6c0e\u68bd\u6baa\u6922\u6c05\u6c02\u68b9\u6c03\u6c10\u6916\u6bf7\u6923\u691d\u68b6\u68b7\u6bf6\u6c00\u6c14\u691c\u6bfd\u6bf6\u6bff\u68bb\u68cc\u68c9\u6bfc\u68b6\u6bab\u6c05\u6923\u6bac\u6c02\u6c00\u691e\u6c0f\u6bff\u691e\u6c0f\u6c04\u6c01\u6bf9\u6918\u6bff\u6916\u6c04\u68bc\u6924\u6c05\u6bf6\u6bf9\u68ae\u6918\u68c5\u68bd\u6bac\u6920\u6baa\u6924\u68cf\u68af\u68c9\u6bad\u68b9\u68bb\u68cc\u6920\u691b\u6bf8\u6bfc\u6c04\u68bb\u68cb\u6924\u691f\u68ce\u6c0f\u6baa\u691a\u6918\u6c04\u691b\u68cb\u68ca\u68cb\u6bfc\u68cd\u6918\u691e\u68d5\u68d0\u6c10\u6923\u68c3\u68d5\u68ae\u68c5\u6bfa\u6bfb\u68d5\u6bf9\u691f\u68d0\u6c14\u691b\u68ca\u6bb5\u6917\u6c04\u6917\u68b6\u691a\u6bf7\u6c05\u68b0\u6bfc\u6921\u6bfa\u6c10\u68ca\u68ce\u68bb\u6bfc\u68b4\u6bf6\u6bf6\u6c05\u68c5\u6921\u691e\u6919\u6923\u68d0\u68ca\u691c\u68bb\u6922\u6922\u68b0\u6917\u691d\u6c0e\u6bfe\u68cb\u6924\u6baa\u6922\u68bb\u68b4\u6baa\u691b\u6bf9\u68bb\u6bab\u6921\u68ba\u6bfc\u691a\u68ca\u6bad\u68cc\u691e\u6c05\u6bb5\u6bff\u6c14\u6bfd\u68b7\u68cb\u68b9\u6c10\u6bfa\u68d5\u68d5\u691e\u6c00\u6bfb\u68b6\u6bfe\u68d0\u6bfa\u68ae\u68ce\u68b9\u6917\u6c0f\u6c10\u68bc\u691e\u68ca\u6921\u6bf9\u6c05\u6c0f\u68ca\u6bfe\u6c01\u6c01\u6bf9\u6bf9\u6c0e\u6bad\u6919\u691d\u68b7\u6bf6\u6bfc\u6916\u6bac\u6bfd\u691c\u68b9\u6920\u6bfe\u6bab\u68cc\u691f\u6bfb\u6916\u68ce\u691d\u6bb5\u6bfd\u6bfd\u6925\u6918\u6bfb\u6c05\u68c3\u6920\u6c14\u6bac\u68cb\u68c9\u68af\u6bac\u6920\u6916\u6917\u68c3\u68c9\u6bfb\u68b6\u6917\u6c0f\u68b6\u6c00\u68ae\u691f\u6c04\u68cb\u6c14\u68ba\u6920\u6ba9\u691a\u691f\u68cc\u68bc\u6bab\u68b9\u68c3\u6bfa\u6bab\u68b7\u6c03\u6925\u68ba\u6bfc\u68d0\u6bfa\u6bf8\u691f\u68c5\u68ca\u6920\u6bb5\u6c04\u68d0\u6bf8\u68ba\u6922\u6916\u6bfa\u68ae\u6c00\u6917\u6921\u6bad\u68cf\u691c\u68ca\u691f\u6bff\u6925\u68bb\u6c01\u68cc\u6bad\u6bb5\u6bf9\u6ba9\u6baa\u6c00\u68ca\u6ba9\u6bfb\u691c\u6bfd\u6bf9\u6bb5\u6919\u68ba\u68cd\u68b9\u6c01\u68b4\u6917\u6bfc\u68ba\u6bfb\u68b4\u68d0\u68c9\u6916\u6c14\u6bff\u68cd\u6924\u6c0e\u6bf7\u68b0\u6c00\u6bac\u6c0f\u68bb\u6bfe\u6c14\u6bf9\u6921\u6bad\u68ae\u6c03\u6916\u68b0\u6c00\u6c14\u6c14\u6bad\u6c03\u6bad\u68cc\u6c05\u6916\u691b\u68af\u6c01\u6c00\u6c10\u68ae\u6925\u6c14\u68bc\u6c01\u6bad\u68b0\u68b4\u6921\u6920\u6bff\u6c10\u691d\u68b7\u68b9\u691c\u68b7\u68bc\u6bad\u68d5\u6bad\u6bac\u6bac\u6923\u68c9\u68cd\u6917\u6920\u6bad\u68b7\u6bfd\u68c9\u6c03\u6917\u68c3\u68b7\u68cb\u6bb5\u6bfd\u68c3\u68ce\u68ae\u68b7\u68bb\u68ae\u6c01\u6bfe\u68b6\u691f\u68bb\u6c04\u68c3\u6c02\u6925\u68c3\u6bb5\u68b7\u6c04\u691b\u6bfb\u6bad\u6916\u68cb\u6c02\u6bad\u6bf7\u68b7\u6bf6\u6c04\u691e\u6c10\u6bfc\u6922\u6c00\u68ba\u68ca\u68ce\u68ca\u6ba9\u691c\u691f\u68cd\u6919\u6916\u68d0\u6917\u68cc\u68cd\u6bfa\u691b\u6bff\u6bf8\u6c10\u68bd\u6920\u68bc\u6bfe\u6bab\u68ca\u6924\u691a\u68b6\u68af\u68ba\u6bb5\u68ca\u6c03\u6ba9\u691e\u6c0f\u691e\u6c14\u6baa\u6c10\u68ca\u68cd\u68bd\u68c9\u68c3\u6c10\u691c\u68b7\u6bfb\u6c03\u68b4\u6918\u6bac\u68bd\u6bf6\u6bab\u6c0f\u6c03\u68bc\u6922\u6c03\u68c3\u691b\u6921\u68ba\u6bac\u6bfa\u68cb\u68b6\u68ce\u6bf7\u6917\u68cd\u68b7\u691f\u691c\u6bac\u68c5\u68b6\u6922\u6c00\u691a\u68bd\u6bfc\u68d5\u6bfa\u691f\u691d\u6919\u6bfb\u691e\u6c04\u68cf\u6bfb\u68b0\u68c9\u68d5\u6918\u68c5\u68c9\u68d5\u68b4\u6c05\u6919\u68b7\u6c01\u68ca\u6c14\u68cd\u6bf8\u6920\u691e\u6bf8\u6bfe\u6bf7\u68ca\u68b6\u6c01\u68cb\u691d\u68cf\u68cd\u6bfc\u691d\u68cd\u68bb\u68bc\u68cb\u68cb\u68bb\u68b6\u6bfd\u68c9\u6921\u6c14\u6c01\u6919\u68cf\u691e\u68ca\u68c9\u6c02\u68cc\u6917\u6bac\u6c02\u6c05\u68b6\u68cc\u68c5\u68af\u6916\u6916\u6922\u691e\u68c9\u6c0e\u6c0e\u68b7\u68ce\u68ba\u6c0f\u6baa\u68cf\u6bad\u68d0\u6ba9\u6919\u6c03\u6bfd\u6924\u68d0\u6c0f\u691b\u68bd\u68b9\u68bc\u6917\u68cc\u6ba9\u68d5\u6bfa\u6920\u68bb\u6918\u68cb\u6c10\u68b4\u68cd\u6baa\u6c10\u6bfb\u68b4\u691a\u6bff\u6bf7\u6bf6\u68af\u6c05\u691b\u68b0\u6bfc\u68bd\u68b9\u6bf8\u68bb\u68bb\u6924\u6bfc\u6c0f\u6917\u6bf7\u691e\u6c04\u68b0\u6919\u68c9\u68bc\u6c03\u6bab\u68cb\u6918\u6916\u68bd\u6bfb\u6924\u6bac\u6c01\u6c00\u68af\u68cb\u6bfe\u6bac\u6bfe\u6922\u6bad\u6922\u68cc\u68ce\u6921\u6bf9\u68b9\u6c04\u6921\u68cf\u6c10\u68b0\u68cf\u68bc\u6918\u6bab\u68b9\u68b4\u68cf\u6bf9\u6c03\u691f\u691d\u691d\u6bab\u68b4\u6c01\u68b0\u6c02\u691d\u6bff\u691c\u6bfc\u6bfc\u68cf\u68ba\u691f\u6c03\u6bf9\u6bfd\u68bc\u6bad\u68b4\u6bf7\u6bfe\u68ba\u691b\u6c0e\u68d5\u691c\u68b6\u6ba9\u6923\u6bad\u691f\u691c\u68c9\u6bf6\u6bf9\u691d\u6918\u6c0e\u6c10\u6bf6\u6bfe\u691d\u6c10\u6bfc\u6bf9\u6bf7\u6921\u68bd\u6baa\u6bf6\u6c14\u68b7\u6bab\u68bc\u6bfa\u6bf9\u6920\u691d\u68cf\u6bfd\u68c3\u6c03\u68b0\u6918\u691f\u68cb\u68cd\u6917\u691c\u6bac\u6bf7\u691b\u6baa\u68d5\u68cd\u68ce\u6c01\u6c00\u6ba9\u6924\u68b6\u6918\u68b4\u6bfd\u6c0f\u68bb\u6924\u6c05\u6bf7\u68bc\u6c04\u6bac\u6925\u6bfb\u6bff\u68c5\u6bf6\u68d0\u6917\u6c02\u6924\u68b6\u6c03\u68af\u6bac\u6922\u68b7\u68ce\u6917\u6bf6\u6924\u68ae\u68c3\u68c3\u68cc\u68cc\u68c3\u6c14\u6ba9\u6bfe\u6925\u68cd\u6bab\u691b\u68bb\u68bd\u68d0\u6921\u691b\u68c9\u6925\u6bad\u6c04\u6923\u6c10\u6921\u68d5\u6bac\u6924\u6bf7\u6bb5\u6919\u68c3\u6c14\u68c3\u6c10\u6bac\u6c0e\u68ba\u691d\u68b6\u68c3\u6c0f\u6bf9\u68cb\u68c3\u6c14\u68b0\u6923\u68b4\u6c04\u6bf9\u68c5\u68c9\u691b\u68cc\u6bff\u6c00\u68b7\u6c0f\u6baa\u6c05\u6bfa\u68b7\u6916\u68ae\u6c04\u6c03\u6bfc\u6bfe\u6bfd\u6bac\u6bf7\u6c10\u6c03\u6bfc\u6921\u6c10\u691a\u68ca\u68af\u6919\u68b0\u6bab\u6bff\u6bab\u68c3\u6bf7\u6918\u691f\u68bb\u691b\u6922\u691e\u6c01\u6ba9\u691b\u6baa\u6ba9\u68c9\u68c3\u68c5\u691b\u6c14\u6bff\u68ae\u6c14\u6922\u68d5\u6c0e\u6c03\u6923\u6c02\u6c00\u691a\u6c03\u68cd\u6919\u68cb\u6bfb\u68b4\u6c14\u6bab\u6c03\u6baa\u6c0f\u68ba\u6918\u691d\u68b4\u6bac\u6c04\u6916\u6bfb\u6c05\u6bfd\u68ba\u68bb\u6920\u68b4\u6918\u6916\u691d\u6917\u68d5\u6baa\u68bb\u68c5\u68cd\u68ca\u68d0\u68cc\u6924\u68d5\u68d0\u6920\u6917\u6bad\u68d0\u6924\u691d\u6c0f\u6bab\u6bab\u68b9\u68b6\u68d5\u6917\u68b4\u68c5\u6bab\u6924\u6c0f\u68ba\u6bfa\u68cd\u6bf6\u6c0e\u6ba9\u68cd\u6c0f\u68ca\u6c00\u6c00\u6baa\u6ba9\u6920\u6bf8\u68c5\u6bac\u68d5\u6922\u6920\u6bac\u691a\u68c9\u691d\u6c04\u6bfc\u6c14\u691c\u6c05\u6c0e\u6923\u6bac\u68b9\u6c03\u6bfc\u6c0e\u6c14\u6c0f\u68cb\u6bab\u6c0f\u6c10\u6c10\u6bf6\u6bfa\u68d0\u691f\u691a\u6c01\u6bfe\u68b9\u6916\u6920\u691c\u68ca\u6916\u6bf9\u68c5\u6c0e\u6921\u6c01\u691c\u68cd\u6916\u6916\u6c04\u6c00\u68cb\u6bb5\u6c0e\u6bfb\u68bd\u6925\u6c00\u68ae\u6c01\u6bfa\u6920\u6bf8\u6bfc\u6923\u691e\u6bff\u68d1\u68d1".toCharArray();
            for (int i2 = C[294]; i2 < C[295]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[296];
                n5 -= C[297];
                n5 += C[298];
                n5 -= C[299];
                n5 -= C[300];
                n5 += C[301];
                n5 ^= C[302];
                n5 -= C[303];
                n5 ^= C[304];
                n5 ^= C[305];
                n5 += C[306];
                n5 ^= C[307];
                cArray[i2] = (char)(n5 += C[308]);
            }
            object = Module.A()[Module.C[309]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)Module.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[310];
        n6 += C[311];
        l6 = l17 ^ (0x3D600000000L ^ l17) & -1L << (n6 += C[312]);
        long l18 = l13;
        int n7 = C[313];
        n7 += C[314];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[315]);
        while (true) {
            int n8 = C[316];
            n8 += C[317];
            if ((int)l13 >= (int)(l6 >>> (n8 += C[318]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[319];
            n10 ^= C[320];
            int n11 = C[322];
            n11 ^= C[323];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[321])) & -1L >>> (n11 ^= C[324]);
            long l20 = l9;
            int n12 = C[325];
            n12 += C[326];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[327]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[328];
            n14 -= C[329];
            int n15 = C[331];
            n15 ^= C[332];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[330])) & -1L >>> (n15 += C[333]);
            int n16 = C[334];
            n16 ^= C[335];
            long l22 = l10;
            int n17 = C[337];
            n17 ^= C[338];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += C[336]) ^ l22) & -1L << (n17 += C[339]);
            int n18 = C[340];
            n18 -= C[341];
            n18 -= C[342];
            int n19 = C[343];
            n19 -= C[344];
            long l23 = l12;
            int n20 = C[346];
            n20 ^= C[347];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= C[345]))) ^ l23) & -1L >>> (n20 += C[348]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[349];
            n21 -= C[350];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[351]);
            while (true) {
                int n22 = C[352];
                n22 ^= C[353];
                if ((int)(l14 >>> (n22 -= C[354])) >= (int)l12) break;
                int n23 = C[355];
                n23 += C[356];
                int n24 = C[358];
                n24 -= C[359];
                cArray2[(int)(l14 >>> (n23 -= Module.C[357]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[360]))];
                l14 += 0x100000000L;
            }
            int n25 = C[361];
            n25 ^= C[362];
            int n26 = (int)(l15 >>> (n25 += C[363]));
            l15 += 0x100000000L;
            Module.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[364];
            n27 += C[365];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[366]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[367]];
        String string = (String)object[C[368]];
        object = object[C[369]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[370]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[371]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[373] ^ C[374]];
                byArray[Module.C[375] ^ Module.C[376]] = C[377] ^ C[378];
                byArray[Module.C[379] ^ Module.C[380]] = C[381] ^ C[382];
                byArray[Module.C[383] ^ Module.C[384]] = C[385] ^ C[386];
                byArray[Module.C[387] ^ Module.C[388]] = C[389] ^ C[390];
                byArray[Module.C[391] ^ Module.C[392]] = C[393] ^ C[394];
                byArray[Module.C[395] ^ Module.C[396]] = C[397] ^ C[398];
                byArray[Module.C[399] ^ 0x104CA] = 0xFFFEFB4F ^ 0x104CA;
                byArray[0xD4AE ^ 0xD4A7] = 0xD4C3 ^ 0xD4A7;
                byArray[0x8440 ^ 0x8444] = 0xFFFF7BE3 ^ 0x8444;
                byArray[0x374D ^ 0x374C] = 0xFFFFC8EA ^ 0x374C;
                byArray[0xF388 ^ 0xF38A] = 0xF3CF ^ 0xF38A;
                byArray[0x7C1A ^ 0x7C17] = 0xFFFF83D9 ^ 0x7C17;
                byArray[0x680B ^ 0x6804] = 0xFFFF97F8 ^ 0x6804;
                byArray[0xDEDA ^ 0xDED6] = 0xDE9B ^ 0xDED6;
                byArray[0x2CF ^ 0x2C7] = 0x281 ^ 0x2C7;
                byArray[0x4FA8 ^ 0x4FAD] = 0xFFFFB031 ^ 0x4FAD;
                objectArray2[Module.C[372]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (b == null) {
                byte[] byArray2 = new byte[0x3C51 ^ 0x3C71];
                byArray2[0xB67E ^ 0xB66C] = 0xB652 ^ 0xB66C;
                byArray2[0x3931 ^ 0x393E] = 0x396D ^ 0x393E;
                byArray2[0xC991 ^ 0xC99B] = 0xFFFF3609 ^ 0xC99B;
                byArray2[0x7A95 ^ 0x7A99] = 0xFFFF851F ^ 0x7A99;
                byArray2[0xBA68 ^ 0xBA74] = 0xBA2F ^ 0xBA74;
                byArray2[0xA340 ^ 0xA341] = 0xA33F ^ 0xA341;
                byArray2[0xE176 ^ 0xE175] = 0xE138 ^ 0xE175;
                byArray2[0x789E ^ 0x7899] = 0x78BE ^ 0x7899;
                byArray2[0xB55A ^ 0xB544] = 0xB50E ^ 0xB544;
                byArray2[0x995 ^ 0x98D] = 0xFFFFF63A ^ 0x98D;
                byArray2[0xF723 ^ 0xF728] = 0xF75A ^ 0xF728;
                byArray2[0x41EF ^ 0x41FC] = 0xFFFFBE01 ^ 0x41FC;
                byArray2[0xB50D ^ 0xB509] = 0xFFFF4AF6 ^ 0xB509;
                byArray2[0x9ECA ^ 0x9ED7] = 0xFFFF6118 ^ 0x9ED7;
                byArray2[0xA34C ^ 0xA35A] = 0xFFFF5CF2 ^ 0xA35A;
                byArray2[0x8EFF ^ 0x8EE5] = 0x8ECA ^ 0x8EE5;
                byArray2[0x8189 ^ 0x818B] = 0x81B7 ^ 0x818B;
                byArray2[0x9F37 ^ 0x9F28] = 0x9F0F ^ 0x9F28;
                byArray2[0xF8BD ^ 0xF8B5] = 0xF882 ^ 0xF8B5;
                byArray2[0x90B2 ^ 0x90A6] = 0x9085 ^ 0x90A6;
                byArray2[0x3E92 ^ 0x3E92] = 0x3EDA ^ 0x3E92;
                byArray2[0xB0B8 ^ 0xB0A8] = 0xFFFF4F0A ^ 0xB0A8;
                byArray2[0x3F17 ^ 0x3F00] = 0xFFFFC0AA ^ 0x3F00;
                byArray2[0x1156 ^ 0x115B] = 0xFFFFEE89 ^ 0x115B;
                byArray2[0x105EA ^ 0x105E3] = 0x105D8 ^ 0x105E3;
                byArray2[0xFEDE ^ 0xFEC7] = 0xFFFF014A ^ 0xFEC7;
                byArray2[0x1958 ^ 0x194D] = 0x1971 ^ 0x194D;
                byArray2[0xE17B ^ 0xE17E] = 0xE17F ^ 0xE17E;
                byArray2[0xEE90 ^ 0xEE81] = 0xFFFF1152 ^ 0xEE81;
                byArray2[0xF91E ^ 0xF905] = 0xFFFF06E7 ^ 0xF905;
                byArray2[0x1E55 ^ 0x1E5B] = 0xFFFFE193 ^ 0x1E5B;
                byArray2[0x646B ^ 0x646D] = 0xFFFF9B89 ^ 0x646D;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = Module.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u863d\u862b\u8634\u8629\u8637\u80db\u8638\u8696\u8699\u8695\u8635\u8692\u868e\u868c\u863c\u8635\u862e\u80de".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xB800;
                        n3 += 41184;
                        n3 ^= 0x1A40;
                        n3 += 59136;
                        n3 += 37409;
                        n3 ^= 0xD0C6;
                        n3 ^= 0x2DE8;
                        n3 ^= 0x4CE;
                        n3 -= 56656;
                        n3 += 33047;
                        n3 -= 6168;
                        n3 ^= 0x2978;
                        n3 += 44089;
                        cArray[i2] = (char)(n3 ^= 0x263E);
                    }
                    object4 = Module.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[5] = -106;
                byArray4[11] = 63;
                byArray4[9] = -45;
                byArray4[4] = -31;
                byArray4[1] = -30;
                byArray4[6] = -31;
                byArray4[12] = 47;
                byArray4[7] = 86;
                byArray4[15] = 37;
                byArray4[0] = -33;
                byArray4[8] = -31;
                byArray4[3] = 123;
                byArray4[13] = 36;
                byArray4[10] = 10;
                byArray4[14] = 81;
                byArray4[2] = 122;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 28, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = Module.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u6b95\u6b71\u6b67".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 36032;
                        n4 += 61154;
                        n4 -= 45059;
                        n4 ^= 0xB686;
                        n4 += 61352;
                        n4 -= 43181;
                        n4 += 5713;
                        n4 ^= 0x1D13;
                        n4 -= 37652;
                        n4 ^= 0x3635;
                        n4 -= 56599;
                        n4 ^= 0x2977;
                        n4 += 6136;
                        n4 ^= 0x937A;
                        n4 ^= 0x14FE;
                        cArray[i3] = (char)(n4 ^= 0x91DF);
                    }
                    object5 = Module.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = Module.A()[3];
            if (object6 == null) {
                char[] cArray = "\udc2a\udc4e\udc7c\udc18\udc2c\udc2d\udc2c\udc18\udc7b\udc44\udc2c\udc7c\udcbe\udc7b\udc0a\udc2f\udc2f\udc22\udfd9\udc20".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x3FE4;
                    n5 ^= 0x3DCC;
                    n5 -= 45196;
                    n5 += 50734;
                    n5 -= 28431;
                    n5 ^= 0xF1D0;
                    n5 -= 14993;
                    n5 -= 56467;
                    n5 -= 46293;
                    n5 ^= 0xB075;
                    n5 ^= 0x7A7B;
                    n5 += 9597;
                    n5 ^= 0xDA9F;
                    cArray[i4] = (char)(n5 -= 20959);
                }
                object6 = Module.A()[3] = new String(cArray);
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
        C = new int[0x7276 ^ 0x73E6];
        Module.C[0xACFC ^ 0xACB3] = 0xFFFF537C ^ 0xACB3;
        Module.C[0xEF5F ^ 0xEF25] = 0xFFFF10E6 ^ 0xEF25;
        Module.C[0x1514 ^ 0x1584] = 0x1549 ^ 0x1584;
        Module.C[0x4D4D ^ 0x4C08] = 0x4C07 ^ 0x4C08;
        Module.C[0xF4BF ^ 0xF5CF] = 0xF5CD ^ 0xF5CF;
        Module.C[0xE951 ^ 0xE9F1] = 0xE992 ^ 0xE9F1;
        Module.C[0x5F71 ^ 0x5F1D] = 0x5F14 ^ 0x5F1D;
        Module.C[0x1084F ^ 0x1093D] = 0x1093C ^ 0x1093D;
        Module.C[0x535F ^ 0x521C] = 0xFFFFADFB ^ 0x521C;
        Module.C[0x8742 ^ 0x8626] = 0xFFFF7983 ^ 0x8626;
        Module.C[0xF64F ^ 0xF6D8] = 0xFFFF090C ^ 0xF6D8;
        Module.C[0xA759 ^ 0xA72C] = 0xA764 ^ 0xA72C;
        Module.C[0x10A15 ^ 0x10A81] = 0xFFFEF516 ^ 0x10A81;
        Module.C[0xF780 ^ 0xF68F] = 0xF6AF ^ 0xF68F;
        Module.C[0x83E5 ^ 0x83EE] = 0x8385 ^ 0x83EE;
        Module.C[0x945C ^ 0x9487] = 0x9486 ^ 0x9487;
        Module.C[0xB551 ^ 0xB588] = 0xB58D ^ 0xB588;
        Module.C[0xCC87 ^ 0xCCE6] = 0xFFFF3379 ^ 0xCCE6;
        Module.C[0x1490 ^ 0x145F] = 0x1439 ^ 0x145F;
        Module.C[0x72D6 ^ 0x73FF] = 0x7EBD ^ 0x73FF;
        Module.C[0x824D ^ 0x82CC] = 0xFFFF7D54 ^ 0x82CC;
        Module.C[0xE7FD ^ 0xE68B] = 0x5F76 ^ 0xE68B;
        Module.C[0x8EC9 ^ 0x8F45] = 0x7D35 ^ 0x8F45;
        Module.C[0xFB5F ^ 0xFB58] = 0xFB58 ^ 0xFB58;
        Module.C[0xC45D ^ 0xC405] = 0xC470 ^ 0xC405;
        Module.C[0xDF45 ^ 0xDE09] = 0xDE29 ^ 0xDE09;
        Module.C[0xF51C ^ 0xF542] = 0xFFFF0A9C ^ 0xF542;
        Module.C[0x76F5 ^ 0x77DD] = 0x7BBC ^ 0x77DD;
        Module.C[0x545F ^ 0x557F] = 0x557C ^ 0x557F;
        Module.C[0xDFC7 ^ 0xDF11] = 0xDF66 ^ 0xDF11;
        Module.C[0x4FD3 ^ 0x4E95] = 0xFFFFB17D ^ 0x4E95;
        Module.C[0x607B ^ 0x609B] = 0x60AF ^ 0x609B;
        Module.C[0x7DD0 ^ 0x7D49] = 0xFFFF821D ^ 0x7D49;
        Module.C[0xF4FA ^ 0xF4E5] = 0xFFFF0B1B ^ 0xF4E5;
        Module.C[0xA1D8 ^ 0xA1E4] = 0xFFFF5E2C ^ 0xA1E4;
        Module.C[0x306 ^ 0x305] = 0xFFFFFCB7 ^ 0x305;
        Module.C[0xCDFE ^ 0xCD8C] = 0xCDFC ^ 0xCD8C;
        Module.C[0x101D5 ^ 0x100FB] = 0x1E5CB ^ 0x100FB;
        Module.C[0x10FFD ^ 0x10ED1] = 0x1B5DE ^ 0x10ED1;
        Module.C[0x5786 ^ 0x5754] = 0xFFFFA8AF ^ 0x5754;
        Module.C[0x4DDF ^ 0x4D1C] = 0xFFFFB2AC ^ 0x4D1C;
        Module.C[0x96C3 ^ 0x97FD] = 0xFFFF6818 ^ 0x97FD;
        Module.C[0x689B ^ 0x69D6] = 0xFFFF964A ^ 0x69D6;
        Module.C[0x4CD6 ^ 0x4DE7] = 0x6432 ^ 0x4DE7;
        Module.C[0x66B ^ 0x738] = 0x760 ^ 0x738;
        Module.C[0xEE7F ^ 0xEF06] = 0xFFFF1E88 ^ 0xEF06;
        Module.C[0x21AD ^ 0x2196] = 0x218B ^ 0x2196;
        Module.C[0x381B ^ 0x3860] = 0x3871 ^ 0x3860;
        Module.C[0x4DE0 ^ 0x4DED] = 0xFFFFB22B ^ 0x4DED;
        Module.C[0x9AC4 ^ 0x9A29] = 0xFFFF65B0 ^ 0x9A29;
        Module.C[0xAA08 ^ 0xAA8A] = 0xAAF9 ^ 0xAA8A;
        Module.C[0xDAEA ^ 0xDAE2] = 0xFFFF2507 ^ 0xDAE2;
        Module.C[0xAD1F ^ 0xADF6] = 0xAD8F ^ 0xADF6;
        Module.C[0xEEC ^ 0xE26] = 0xFFFFF1B8 ^ 0xE26;
        Module.C[0xB8BD ^ 0xB93B] = 0x5DE8 ^ 0xB93B;
        Module.C[0x1A10 ^ 0x1A32] = 0xFFFFE5FF ^ 0x1A32;
        Module.C[0xEB67 ^ 0xEBFA] = 0xFFFF141D ^ 0xEBFA;
        Module.C[0x7647 ^ 0x76A4] = 0xFFFF897E ^ 0x76A4;
        Module.C[0x6994 ^ 0x69AB] = 0xFFFF963B ^ 0x69AB;
        Module.C[0x8665 ^ 0x8719] = 0xA8D0 ^ 0x8719;
        Module.C[0x97D9 ^ 0x9764] = 0x977D ^ 0x9764;
        Module.C[0xA0A6 ^ 0xA1A0] = 0xFFFF5E2F ^ 0xA1A0;
        Module.C[0x102F6 ^ 0x1029D] = 0x10287 ^ 0x1029D;
        Module.C[0x6283 ^ 0x63BA] = 0x637E ^ 0x63BA;
        Module.C[0x3BCE ^ 0x3B8E] = 0xFFFFC460 ^ 0x3B8E;
        Module.C[0xA0D3 ^ 0xA042] = 0xA001 ^ 0xA042;
        Module.C[0xDC6B ^ 0xDC91] = 0xFFFF2359 ^ 0xDC91;
        Module.C[0xEA4C ^ 0xEB06] = 0xEB0D ^ 0xEB06;
        Module.C[0x5F3B ^ 0x5E7F] = 0xFFFFA189 ^ 0x5E7F;
        Module.C[0x9632 ^ 0x96FE] = 0xFFFF6924 ^ 0x96FE;
        Module.C[0x102DB ^ 0x102E1] = 0x102C0 ^ 0x102E1;
        Module.C[0x601 ^ 0x71D] = 0x76A ^ 0x71D;
        Module.C[0x716C ^ 0x7076] = 0x705B ^ 0x7076;
        Module.C[0xD662 ^ 0xD627] = 0xFFFF29D0 ^ 0xD627;
        Module.C[0x106FE ^ 0x106EF] = 0xFFFEF907 ^ 0x106EF;
        Module.C[0xECB3 ^ 0xEDB4] = 0xFFFF1260 ^ 0xEDB4;
        Module.C[0x8A8E ^ 0x8A10] = 0xFFFF7592 ^ 0x8A10;
        Module.C[0xC2FF ^ 0xC2E7] = 0xC2EC ^ 0xC2E7;
        Module.C[0x10319 ^ 0x10273] = 0x1023F ^ 0x10273;
        Module.C[0x77D2 ^ 0x7758] = 0xFFFF8883 ^ 0x7758;
        Module.C[0x7E38 ^ 0x7F7F] = 0x7F56 ^ 0x7F7F;
        Module.C[0x5A4E ^ 0x5B2B] = 0x5B04 ^ 0x5B2B;
        Module.C[0xAD5B ^ 0xAD41] = 0xAD6F ^ 0xAD41;
        Module.C[0x8B03 ^ 0x8BCA] = 0xFFFF744B ^ 0x8BCA;
        Module.C[0x3A01 ^ 0x3ABE] = 0xFFFFC52B ^ 0x3ABE;
        Module.C[0x5765 ^ 0x5673] = 0x566A ^ 0x5673;
        Module.C[0x7DA8 ^ 0x7D6A] = 0x7D79 ^ 0x7D6A;
        Module.C[0x2877 ^ 0x2803] = 0x284C ^ 0x2803;
        Module.C[0xC3F5 ^ 0xC3D0] = 0xC3D4 ^ 0xC3D0;
        Module.C[0xE25 ^ 0xE4B] = 0xFFFFF1FE ^ 0xE4B;
        Module.C[0xC4C5 ^ 0xC5D0] = 0xFFFF3A49 ^ 0xC5D0;
        Module.C[0x7BAB ^ 0x7B84] = 0x7BEF ^ 0x7B84;
        Module.C[0x503C ^ 0x5051] = 0xFFFFAFDF ^ 0x5051;
        Module.C[0x498A ^ 0x495F] = 0xFFFFB68A ^ 0x495F;
        Module.C[0xD7DC ^ 0xD7EE] = 0xFFFF2827 ^ 0xD7EE;
        Module.C[0xA97A ^ 0xA83A] = 0xA848 ^ 0xA83A;
        Module.C[0x97A4 ^ 0x97B0] = 0xFFFF6800 ^ 0x97B0;
        Module.C[0xB04 ^ 0xA20] = 0xA22 ^ 0xA20;
        Module.C[0x2D8D ^ 0x2CE1] = 0x2C96 ^ 0x2CE1;
        Module.C[0x655 ^ 0x660] = 0x639 ^ 0x660;
        Module.C[0x629B ^ 0x626C] = 0xFFFF9DA9 ^ 0x626C;
        Module.C[0x645E ^ 0x6451] = 0xFFFF9BF3 ^ 0x6451;
        Module.C[0xE85A ^ 0xE8EE] = 0xE8D3 ^ 0xE8EE;
        Module.C[0x402A ^ 0x411A] = 0xB28 ^ 0x411A;
        Module.C[0xCBD3 ^ 0xCB41] = 0xCB2B ^ 0xCB41;
        Module.C[0x208F ^ 0x2004] = 0x2060 ^ 0x2004;
        Module.C[0xC9EE ^ 0xC8B1] = 0xFFFF3713 ^ 0xC8B1;
        Module.C[0x5E19 ^ 0x5EDE] = 0x5EE9 ^ 0x5EDE;
        Module.C[0x1D49 ^ 0x1DF7] = 0x1D8F ^ 0x1DF7;
        Module.C[0xBCE9 ^ 0xBC0B] = 0xFFFF4396 ^ 0xBC0B;
        Module.C[0xA332 ^ 0xA343] = 0xFFFF5CD3 ^ 0xA343;
        Module.C[0xC06B ^ 0xC00C] = 0xFFFF3FF1 ^ 0xC00C;
        Module.C[0xD3B0 ^ 0xD2A8] = 0xFFFF2D33 ^ 0xD2A8;
        Module.C[0xE84A ^ 0xE85A] = 0xE81C ^ 0xE85A;
        Module.C[0xE6E7 ^ 0xE7F5] = 0xFFFF1868 ^ 0xE7F5;
        Module.C[0x6C11 ^ 0x6CCF] = 0xFFFF9300 ^ 0x6CCF;
        Module.C[0x4971 ^ 0x49EE] = 0x490C ^ 0x49EE;
        Module.C[0xCB6D ^ 0xCB27] = 0xCB72 ^ 0xCB27;
        Module.C[0x5495 ^ 0x55E1] = 0x55E1 ^ 0x55E1;
        Module.C[0xE817 ^ 0xE89A] = 0xFFFF1734 ^ 0xE89A;
        Module.C[0x4D7A ^ 0x4C21] = 0x4C06 ^ 0x4C21;
        Module.C[0x10B0A ^ 0x10B83] = 0xFFFEF460 ^ 0x10B83;
        Module.C[0xF178 ^ 0xF184] = 0xF181 ^ 0xF184;
        Module.C[0xFE51 ^ 0xFEB0] = 0xFFFF0164 ^ 0xFEB0;
        Module.C[0x389C ^ 0x39CB] = 0xFFFFC625 ^ 0x39CB;
        Module.C[0xFB0A ^ 0xFA6C] = 0xFA63 ^ 0xFA6C;
        Module.C[0x44FD ^ 0x4413] = 0xFFFFBBDD ^ 0x4413;
        Module.C[0x9E94 ^ 0x9EB3] = 0x9E92 ^ 0x9EB3;
        Module.C[0xD685 ^ 0xD627] = 0xD6E5 ^ 0xD627;
        Module.C[0xD8A2 ^ 0xD995] = 0xD9B6 ^ 0xD995;
        Module.C[0x361E ^ 0x3757] = 0x3774 ^ 0x3757;
        Module.C[0x2D2F ^ 0x2C32] = 0x2C21 ^ 0x2C32;
        Module.C[0x7531 ^ 0x7465] = 0x7424 ^ 0x7465;
        Module.C[0xF482 ^ 0xF458] = 0xFFFF0BEB ^ 0xF458;
        Module.C[0x517A ^ 0x5127] = 0xFFFFAE91 ^ 0x5127;
        Module.C[0xADC ^ 0xA2E] = 0xFFFFF5A3 ^ 0xA2E;
        Module.C[0x407A ^ 0x401C] = 0x403B ^ 0x401C;
        Module.C[0x2A6E ^ 0x2A42] = 0xFFFFD5D2 ^ 0x2A42;
        Module.C[0xCEEC ^ 0xCE4D] = 0xCE02 ^ 0xCE4D;
        Module.C[0xACCD ^ 0xAC1D] = 0xAC01 ^ 0xAC1D;
        Module.C[0xF281 ^ 0xF3DC] = 0xF36D ^ 0xF3DC;
        Module.C[0xA373 ^ 0xA35D] = 0xFFFF5CE6 ^ 0xA35D;
        Module.C[0x2960 ^ 0x287F] = 0xFFFFD78E ^ 0x287F;
        Module.C[0xB678 ^ 0xB6DC] = 0xB68B ^ 0xB6DC;
        Module.C[0xFFC2 ^ 0xFF80] = 0xFFA0 ^ 0xFF80;
        Module.C[0xAB5C ^ 0xABF5] = 0xABB4 ^ 0xABF5;
        Module.C[0xA779 ^ 0xA7E3] = 0xA786 ^ 0xA7E3;
        Module.C[0x6671 ^ 0x6667] = 0xFFFF9999 ^ 0x6667;
        Module.C[0xA28A ^ 0xA3ED] = 0xFFFF5C13 ^ 0xA3ED;
        Module.C[0xB39E ^ 0xB2A4] = 0xFFFF4D23 ^ 0xB2A4;
        Module.C[0x3B07 ^ 0x3B07] = 0x3B4F ^ 0x3B07;
        Module.C[0xABBD ^ 0xAB57] = 0xFFFF54C1 ^ 0xAB57;
        Module.C[0x1029A ^ 0x1028F] = 0xFFFEFD7E ^ 0x1028F;
        Module.C[0xDE49 ^ 0xDE0D] = 0xFFFF21CD ^ 0xDE0D;
        Module.C[0xCC31 ^ 0xCC77] = 0xFFFF33F9 ^ 0xCC77;
        Module.C[0x90 ^ 0xE7] = 0xEC ^ 0xE7;
        Module.C[0x108A0 ^ 0x108C9] = 0xFFFEF71F ^ 0x108C9;
        Module.C[0x7F67 ^ 0x7FCA] = 0xFFFF803C ^ 0x7FCA;
        Module.C[0x530B ^ 0x523D] = 0xFFFFAD9E ^ 0x523D;
        Module.C[0xCEC3 ^ 0xCF4B] = 0x1CF14 ^ 0xCF4B;
        Module.C[0xC947 ^ 0xC9C1] = 0xFFFF3679 ^ 0xC9C1;
        Module.C[0xB006 ^ 0xB107] = 0xB149 ^ 0xB107;
        Module.C[0x109DC ^ 0x109C7] = 0xFFFEF6A7 ^ 0x109C7;
        Module.C[0xF32E ^ 0xF328] = 0xF30A ^ 0xF328;
        Module.C[0x4AC8 ^ 0x4BFD] = 0x4BFD ^ 0x4BFD;
        Module.C[0x685 ^ 0x6C2] = 0x697 ^ 0x6C2;
        Module.C[0x6809 ^ 0x68BE] = 0x68AA ^ 0x68BE;
        Module.C[0x8D9F ^ 0x8D7A] = 0xFFFF7281 ^ 0x8D7A;
        Module.C[0xEA27 ^ 0xEA34] = 0xFFFF1583 ^ 0xEA34;
        Module.C[0xD82A ^ 0xD85C] = 0xD80A ^ 0xD85C;
        Module.C[0xE4EC ^ 0xE43B] = 0xE475 ^ 0xE43B;
        Module.C[0x2DFD ^ 0x2CFF] = 0xFFFFD366 ^ 0x2CFF;
        Module.C[0xCA30 ^ 0xCA4F] = 0xFFFF35F6 ^ 0xCA4F;
        Module.C[0xFCA4 ^ 0xFD8E] = 0x3627 ^ 0xFD8E;
        Module.C[0x1160 ^ 0x11D3] = 0xFFFFEE59 ^ 0x11D3;
        Module.C[0xDDB9 ^ 0xDCBA] = 0xDCC1 ^ 0xDCBA;
        Module.C[0x3A7D ^ 0x3B5A] = 0x3E02 ^ 0x3B5A;
        Module.C[0x1D43 ^ 0x1C3B] = 0x1264 ^ 0x1C3B;
        Module.C[0xBB8E ^ 0xBB3B] = 0xBB2A ^ 0xBB3B;
        Module.C[0x5443 ^ 0x549E] = 0xFFFFAB6E ^ 0x549E;
        Module.C[0x10A6F ^ 0x10BE8] = 0xBB7 ^ 0x10BE8;
        Module.C[0x21F0 ^ 0x2153] = 0xFFFFDEEC ^ 0x2153;
        Module.C[0x3DD6 ^ 0x3CC1] = 0xFFFFC319 ^ 0x3CC1;
        Module.C[0xC5F5 ^ 0xC535] = 0xC52C ^ 0xC535;
        Module.C[0x7A9B ^ 0x7A21] = 0x7A48 ^ 0x7A21;
        Module.C[0x7AFC ^ 0x7B89] = 0xC264 ^ 0x7B89;
        Module.C[0x23D1 ^ 0x22C5] = 0x2244 ^ 0x22C5;
        Module.C[0xA1B0 ^ 0xA1FB] = 0xA166 ^ 0xA1FB;
        Module.C[0x8BB5 ^ 0x8AEC] = 0xFFFF757D ^ 0x8AEC;
        Module.C[0xB168 ^ 0xB060] = 0xB032 ^ 0xB060;
        Module.C[0x5BE1 ^ 0x5AC3] = 0x5AC2 ^ 0x5AC3;
        Module.C[0xFCEC ^ 0xFC79] = 0xFFFF039C ^ 0xFC79;
        Module.C[0x10A89 ^ 0x10A85] = 0x10AC2 ^ 0x10A85;
        Module.C[0xBC69 ^ 0xBD0B] = 0xBD2E ^ 0xBD0B;
        Module.C[0x2512 ^ 0x2517] = 0x2548 ^ 0x2517;
        Module.C[0xCC51 ^ 0xCC39] = 0xCC33 ^ 0xCC39;
        Module.C[0xBB4D ^ 0xBA48] = 0xBA12 ^ 0xBA48;
        Module.C[0x3EE7 ^ 0x3E57] = 0x3E4E ^ 0x3E57;
        Module.C[0xE0D9 ^ 0xE0FF] = 0xE0D4 ^ 0xE0FF;
        Module.C[0x728C ^ 0x73DD] = 0x73BC ^ 0x73DD;
        Module.C[0xCD1F ^ 0xCD16] = 0xFFFF32D1 ^ 0xCD16;
        Module.C[0xFE59 ^ 0xFED7] = 0xFE80 ^ 0xFED7;
        Module.C[0x9BF ^ 0x8A6] = 0x89B ^ 0x8A6;
        Module.C[0x942F ^ 0x9497] = 0xFFFF6B38 ^ 0x9497;
        Module.C[0x8B0 ^ 0x8C9] = 0x89B ^ 0x8C9;
        Module.C[0x1AC5 ^ 0x1B48] = 0xE92D ^ 0x1B48;
        Module.C[0x71BE ^ 0x718F] = 0x718C ^ 0x718F;
        Module.C[0x6464 ^ 0x6450] = 0x6442 ^ 0x6450;
        Module.C[0x7FEC ^ 0x7F64] = 0xFFFF809D ^ 0x7F64;
        Module.C[0x5C21 ^ 0x5CD7] = 0x5CA3 ^ 0x5CD7;
        Module.C[0x49C2 ^ 0x48AD] = 0x48AC ^ 0x48AD;
        Module.C[0xC23 ^ 0xD6C] = 0xFFFFF282 ^ 0xD6C;
        Module.C[0x5D1D ^ 0x5C9D] = 0x5B5 ^ 0x5C9D;
        Module.C[0x107CA ^ 0x1073F] = 0x10705 ^ 0x1073F;
        Module.C[0x28F3 ^ 0x2972] = 0xFFFF8FF6 ^ 0x2972;
        Module.C[0x719 ^ 0x7BC] = 0xFFFFF84E ^ 0x7BC;
        Module.C[0xC715 ^ 0xC7AC] = 0xC7F6 ^ 0xC7AC;
        Module.C[0xCD4D ^ 0xCD28] = 0xFFFF32DA ^ 0xCD28;
        Module.C[0x50CB ^ 0x5087] = 0x50E3 ^ 0x5087;
        Module.C[0xCA21 ^ 0xCB63] = 0xCB52 ^ 0xCB63;
        Module.C[0xF48D ^ 0xF593] = 0xF591 ^ 0xF593;
        Module.C[0x100C5 ^ 0x1014A] = 0x586 ^ 0x1014A;
        Module.C[0x8130 ^ 0x8030] = 0x8003 ^ 0x8030;
        Module.C[0x546F ^ 0x54D9] = 0xFFFFAB01 ^ 0x54D9;
        Module.C[0x9EE3 ^ 0x9E10] = 0x9E76 ^ 0x9E10;
        Module.C[0x4C79 ^ 0x4D52] = 0x78BE ^ 0x4D52;
        Module.C[0x56B1 ^ 0x5600] = 0x5636 ^ 0x5600;
        Module.C[0x90A5 ^ 0x9081] = 0xFFFF6F58 ^ 0x9081;
        Module.C[0x1784 ^ 0x16D8] = 0x16D2 ^ 0x16D8;
        Module.C[0xA21B ^ 0xA2C8] = 0xFFFF5D44 ^ 0xA2C8;
        Module.C[0xB7C7 ^ 0xB738] = 0xB759 ^ 0xB738;
        Module.C[0xB0DB ^ 0xB070] = 0xFFFF4FDD ^ 0xB070;
        Module.C[0x109BB ^ 0x109E8] = 0xFFFEF61D ^ 0x109E8;
        Module.C[0x77C ^ 0x72A] = 0xFFFFF8EA ^ 0x72A;
        Module.C[0x1FFA ^ 0x1F79] = 0xFFFFE09B ^ 0x1F79;
        Module.C[0x3557 ^ 0x3553] = 0x3558 ^ 0x3553;
        Module.C[0x10367 ^ 0x102E3] = 0x1E630 ^ 0x102E3;
        Module.C[0xA586 ^ 0xA51E] = 0xA550 ^ 0xA51E;
        Module.C[0x2808 ^ 0x2933] = 0xFFFFD6E6 ^ 0x2933;
        Module.C[0x8E7D ^ 0x8ECF] = 0xFFFF7170 ^ 0x8ECF;
        Module.C[0xF4A3 ^ 0xF4FA] = 0xF4F6 ^ 0xF4FA;
        Module.C[0xF4FB ^ 0xF4AE] = 0xF495 ^ 0xF4AE;
        Module.C[0x247A ^ 0x251A] = 0xFFFFDAC4 ^ 0x251A;
        Module.C[0x6DBB ^ 0x6DEA] = 0x6DF7 ^ 0x6DEA;
        Module.C[0xA90B ^ 0xA959] = 0xA95D ^ 0xA959;
        Module.C[0x1A2B ^ 0x1B1F] = 0xC841 ^ 0x1B1F;
        Module.C[0x564E ^ 0x57CC] = 0xEE4 ^ 0x57CC;
        Module.C[0xC78A ^ 0xC725] = 0xFFFF38FB ^ 0xC725;
        Module.C[0x158C ^ 0x14FF] = 0x14FE ^ 0x14FF;
        Module.C[0x3976 ^ 0x3905] = 0xFFFFC6C4 ^ 0x3905;
        Module.C[0x8489 ^ 0x84C0] = 0xFFFF7B0E ^ 0x84C0;
        Module.C[0xCF0B ^ 0xCFCA] = 0xCFCA ^ 0xCFCA;
        Module.C[0x2044 ^ 0x211C] = 0x2121 ^ 0x211C;
        Module.C[0xF8EF ^ 0xF893] = 0xF882 ^ 0xF893;
        Module.C[0x540F ^ 0x54FF] = 0x54AF ^ 0x54FF;
        Module.C[0x550E ^ 0x5576] = 0x5550 ^ 0x5576;
        Module.C[0x5FB9 ^ 0x5F22] = 0x5F6B ^ 0x5F22;
        Module.C[0xDAEE ^ 0xDBFF] = 0xFFFF2416 ^ 0xDBFF;
        Module.C[0xA58F ^ 0xA4F0] = 0xFDDF ^ 0xA4F0;
        Module.C[0xFC17 ^ 0xFD99] = 0xFE9 ^ 0xFD99;
        Module.C[0x9D38 ^ 0x9D26] = 0xFFFF62ED ^ 0x9D26;
        Module.C[0x62D9 ^ 0x6291] = 0x62D2 ^ 0x6291;
        Module.C[0x3528 ^ 0x344B] = 0x34E1 ^ 0x344B;
        Module.C[0x7F4E ^ 0x7F83] = 0xFFFF805C ^ 0x7F83;
        Module.C[0x6ED2 ^ 0x6E14] = 0x6E7D ^ 0x6E14;
        Module.C[0x3D3B ^ 0x3D87] = 0xFFFFC276 ^ 0x3D87;
        Module.C[0x2786 ^ 0x26F7] = 0x26F7 ^ 0x26F7;
        Module.C[0x6D96 ^ 0x6D94] = 0x6D8C ^ 0x6D94;
        Module.C[0x15F7 ^ 0x155F] = 0x1513 ^ 0x155F;
        Module.C[0x5839 ^ 0x5978] = 0xFFFFA6D1 ^ 0x5978;
        Module.C[0x1ED9 ^ 0x1F8B] = 0xFFFFE022 ^ 0x1F8B;
        Module.C[0xC21F ^ 0xC29F] = 0xC2B0 ^ 0xC29F;
        Module.C[0xC73C ^ 0xC70C] = 0xFFFF38C1 ^ 0xC70C;
        Module.C[0x9261 ^ 0x925C] = 0x924E ^ 0x925C;
        Module.C[0x8F89 ^ 0x8F1A] = 0x8F71 ^ 0x8F1A;
        Module.C[0x7296 ^ 0x727A] = 0xFFFF8DDC ^ 0x727A;
        Module.C[0x10D8 ^ 0x11F7] = 0xDA07 ^ 0x11F7;
        Module.C[0x1025B ^ 0x10310] = 0x103B4 ^ 0x10310;
        Module.C[0x5C07 ^ 0x5D22] = 0x5D22 ^ 0x5D22;
        Module.C[0xCC9 ^ 0xC6F] = 0xC2F ^ 0xC6F;
        Module.C[0x12AD ^ 0x1286] = 0xFFFFED4A ^ 0x1286;
        Module.C[0x3671 ^ 0x3646] = 0xFFFFC9CF ^ 0x3646;
        Module.C[0x3659 ^ 0x36D6] = 0xFFFFC934 ^ 0x36D6;
        Module.C[0x546C ^ 0x5438] = 0xFFFFAB9D ^ 0x5438;
        Module.C[0xDBD ^ 0xDA1] = 0xFFFFF229 ^ 0xDA1;
        Module.C[0x9DC0 ^ 0x9D18] = 0xFFFF62D8 ^ 0x9D18;
        Module.C[0xFDB9 ^ 0xFD47] = 0xFFFF029E ^ 0xFD47;
        Module.C[0x1C54 ^ 0x1C19] = 0x1C2E ^ 0x1C19;
        Module.C[0x1009D ^ 0x100F9] = 0xFFFEFF1C ^ 0x100F9;
        Module.C[0xF5FA ^ 0xF515] = 0xF563 ^ 0xF515;
        Module.C[0xD7FB ^ 0xD71D] = 0xD745 ^ 0xD71D;
        Module.C[0x6B01 ^ 0x6A88] = 0x16AE5 ^ 0x6A88;
        Module.C[0x100EC ^ 0x10192] = 0x12E5B ^ 0x10192;
        Module.C[0x54EC ^ 0x5417] = 0x542E ^ 0x5417;
        Module.C[0xDC1C ^ 0xDC98] = 0xDCB4 ^ 0xDC98;
        Module.C[0x3869 ^ 0x3933] = 0x3902 ^ 0x3933;
        Module.C[0xEA7B ^ 0xEABE] = 0xFFFF151F ^ 0xEABE;
        Module.C[0x9D33 ^ 0x9DC7] = 0xFFFF624A ^ 0x9DC7;
        Module.C[0x10036 ^ 0x1010A] = 0xFFFEFEDC ^ 0x1010A;
        Module.C[0x552C ^ 0x5505] = 0xFFFFAAA7 ^ 0x5505;
        Module.C[0xF875 ^ 0xF856] = 0xFFFF0795 ^ 0xF856;
        Module.C[0x2292 ^ 0x2399] = 0xFFFFDCC7 ^ 0x2399;
        Module.C[0xFA5A ^ 0xFA00] = 0xFA06 ^ 0xFA00;
        Module.C[0x508E ^ 0x50F3] = 0x50F1 ^ 0x50F3;
        Module.C[0x7356 ^ 0x739D] = 0xFFFF8C21 ^ 0x739D;
        Module.C[0x1F50 ^ 0x1FDC] = 0xFFFFE065 ^ 0x1FDC;
        Module.C[0x3B9 ^ 0x37D] = 0x36E ^ 0x37D;
        Module.C[0x102A3 ^ 0x103CE] = 0xFFFEFC45 ^ 0x103CE;
        Module.C[0x648C ^ 0x65E7] = 0x65FA ^ 0x65E7;
        Module.C[0x8CAA ^ 0x8C42] = 0x8C76 ^ 0x8C42;
        Module.C[0xC6AB ^ 0xC6F4] = 0xC68C ^ 0xC6F4;
        Module.C[0x634E ^ 0x6273] = 0x6216 ^ 0x6273;
        Module.C[0x50E7 ^ 0x51EA] = 0xFFFFAE54 ^ 0x51EA;
        Module.C[0xD721 ^ 0xD7CA] = 0xD7DE ^ 0xD7CA;
        Module.C[0x994E ^ 0x9818] = 0x987D ^ 0x9818;
        Module.C[0xC6B3 ^ 0xC6AE] = 0xFFFF3956 ^ 0xC6AE;
        Module.C[0xF4E2 ^ 0xF4AC] = 0xF4B3 ^ 0xF4AC;
        Module.C[0x546B ^ 0x543C] = 0x54AC ^ 0x543C;
        Module.C[0x79D9 ^ 0x78B8] = 0xFFFF8723 ^ 0x78B8;
        Module.C[0x3333 ^ 0x3220] = 0x3254 ^ 0x3220;
        Module.C[0x106C1 ^ 0x10791] = 0xFFFEF812 ^ 0x10791;
        Module.C[0xA606 ^ 0xA6A1] = 0xA6B3 ^ 0xA6A1;
        Module.C[0x277C ^ 0x27B4] = 0xFFFFD862 ^ 0x27B4;
        Module.C[0x68F8 ^ 0x69F4] = 0x6994 ^ 0x69F4;
        Module.C[0xAC8 ^ 0xBBF] = 0x5EA ^ 0xBBF;
        Module.C[0xCED6 ^ 0xCFAC] = 0xC1F3 ^ 0xCFAC;
        Module.C[0xF6C8 ^ 0xF742] = 0x1F71D ^ 0xF742;
        Module.C[0x43F6 ^ 0x42CE] = 0x4294 ^ 0x42CE;
        Module.C[0x7546 ^ 0x7475] = 0xB109 ^ 0x7475;
        Module.C[0xC253 ^ 0xC279] = 0xC2DD ^ 0xC279;
        Module.C[0x1A83 ^ 0x1BA5] = 0x1BA5 ^ 0x1BA5;
        Module.C[0x373F ^ 0x3755] = 0xFFFFC898 ^ 0x3755;
        Module.C[0x3238 ^ 0x33BB] = 0xD763 ^ 0x33BB;
        Module.C[0x3240 ^ 0x32FB] = 0xFFFFCD43 ^ 0x32FB;
        Module.C[0x5B04 ^ 0x5B3C] = 0x5B44 ^ 0x5B3C;
        Module.C[0x751B ^ 0x7400] = 0x7476 ^ 0x7400;
        Module.C[0x17F3 ^ 0x175F] = 0x176C ^ 0x175F;
        Module.C[0x102F4 ^ 0x102C2] = 0xFFFEFD1B ^ 0x102C2;
        Module.C[0x2EEF ^ 0x2F87] = 0x2FB6 ^ 0x2F87;
        Module.C[0x4863 ^ 0x48BF] = 0x48A2 ^ 0x48BF;
        Module.C[0xB1FF ^ 0xB190] = 0xFFFF4E4B ^ 0xB190;
        Module.C[0x108E ^ 0x10EC] = 0xFFFFEF64 ^ 0x10EC;
        Module.C[0xF32D ^ 0xF200] = 0xA04F ^ 0xF200;
        Module.C[0x775F ^ 0x767E] = 0x767E ^ 0x767E;
        Module.C[0x6CF7 ^ 0x6D72] = 0xFFFF765E ^ 0x6D72;
        Module.C[0xE084 ^ 0xE018] = 0xE071 ^ 0xE018;
        Module.C[0x827 ^ 0x8F6] = 0xFFFFF717 ^ 0x8F6;
        Module.C[0xAC2B ^ 0xAD25] = 0xFFFF52B1 ^ 0xAD25;
        Module.C[0x222C ^ 0x2286] = 0x2289 ^ 0x2286;
        Module.C[0x18E6 ^ 0x19D4] = 0x2303 ^ 0x19D4;
        Module.C[0x596A ^ 0x59A4] = 0xFFFFA604 ^ 0x59A4;
        Module.C[0xAE75 ^ 0xAE05] = 0xFFFF51AA ^ 0xAE05;
        Module.C[0x68BA ^ 0x69B3] = 0x69A3 ^ 0x69B3;
        Module.C[0x5951 ^ 0x580F] = 0x583C ^ 0x580F;
        Module.C[0x1FED ^ 0x1F43] = 0xFFFFE0BA ^ 0x1F43;
        Module.C[0x27B5 ^ 0x26B1] = 0xFFFFD950 ^ 0x26B1;
        Module.C[0x3CA0 ^ 0x3C9E] = 0x3CB9 ^ 0x3C9E;
        Module.C[0x7564 ^ 0x75BB] = 0x75B9 ^ 0x75BB;
        Module.C[0x9912 ^ 0x9921] = 0x996D ^ 0x9921;
        Module.C[0xDAC5 ^ 0xDA3C] = 0xDA4C ^ 0xDA3C;
        Module.C[0xB6B2 ^ 0xB637] = 0xB647 ^ 0xB637;
        Module.C[0x27D7 ^ 0x2794] = 0x27D4 ^ 0x2794;
        Module.C[0x1F5C ^ 0x1E14] = 0x1E0D ^ 0x1E14;
        Module.C[0x323B ^ 0x336E] = 0xFFFFCCA2 ^ 0x336E;
        Module.C[0x2085 ^ 0x207D] = 0x2056 ^ 0x207D;
        Module.C[0x3594 ^ 0x359E] = 0x35CD ^ 0x359E;
        Module.C[0x1456 ^ 0x14B2] = 0x14E3 ^ 0x14B2;
        Module.C[0x95F5 ^ 0x9512] = 0xFFFF6A83 ^ 0x9512;
        Module.C[0x7929 ^ 0x7927] = 0x792B ^ 0x7927;
        Module.C[0x8649 ^ 0x87C2] = 0x75BC ^ 0x87C2;
        Module.C[0x1F44 ^ 0x1F18] = 0xFFFFE0F2 ^ 0x1F18;
        Module.C[0x2B3E ^ 0x2B07] = 0x2B02 ^ 0x2B07;
        Module.C[0xDE59 ^ 0xDE09] = 0xFFFF21D9 ^ 0xDE09;
        Module.C[0x80FB ^ 0x81B5] = 0xFFFF7EC6 ^ 0x81B5;
        Module.C[0x76E ^ 0x746] = 0xFFFFF8C4 ^ 0x746;
        Module.C[0x840B ^ 0x849D] = 0x8409 ^ 0x849D;
        Module.C[0x5196 ^ 0x51D7] = 0xFFFFAE75 ^ 0x51D7;
        Module.C[0x3615 ^ 0x372A] = 0x3700 ^ 0x372A;
        Module.C[0xE1A5 ^ 0xE1FE] = 0xFFFF1E02 ^ 0xE1FE;
        Module.C[0xD1A0 ^ 0xD0DB] = 0xFF11 ^ 0xD0DB;
        Module.C[0x764F ^ 0x7631] = 0x765A ^ 0x7631;
        Module.C[0x2F86 ^ 0x2F87] = 0xFFFFD068 ^ 0x2F87;
        Module.C[0x4D42 ^ 0x4C48] = 0x4C0B ^ 0x4C48;
        Module.C[0xE193 ^ 0xE114] = 0xE10E ^ 0xE114;
        Module.C[0x9EEC ^ 0x9F82] = 0x9F9C ^ 0x9F82;
        Module.C[0x11FD ^ 0x1094] = 0x10DB ^ 0x1094;
        Module.C[0x826B ^ 0x8348] = 0x8348 ^ 0x8348;
        Module.C[0xB5F3 ^ 0xB5E4] = 0xFFFF4A37 ^ 0xB5E4;
        Module.C[0x981A ^ 0x9879] = 0xFFFF67A0 ^ 0x9879;
        Module.C[0x7339 ^ 0x73ED] = 0x739A ^ 0x73ED;
        Module.C[0xCA16 ^ 0xCAEB] = 0xFFFF3535 ^ 0xCAEB;
        Module.C[0x77E ^ 0x75F] = 0x756 ^ 0x75F;
        Module.C[0xBEDD ^ 0xBE2C] = 0xBE1C ^ 0xBE2C;
        Module.C[0xA622 ^ 0xA60F] = 0xFFFF595E ^ 0xA60F;
        Module.C[0x1A00 ^ 0x1B10] = 0xFFFFE4A5 ^ 0x1B10;
        Module.C[0xA7A6 ^ 0xA7B4] = 0xA793 ^ 0xA7B4;
        Module.C[0x5981 ^ 0x58FC] = 0xFFFF88B3 ^ 0x58FC;
        Module.C[0xC8A5 ^ 0xC8BC] = 0xFFFF3701 ^ 0xC8BC;
        Module.C[0x1322 ^ 0x1302] = 0x1317 ^ 0x1302;
        Module.C[0x107D3 ^ 0x107B3] = 0xFFFEF883 ^ 0x107B3;
    }
}

