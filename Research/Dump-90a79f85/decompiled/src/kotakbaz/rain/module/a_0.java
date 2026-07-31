/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_3414
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
import kotakbaz.rain.client.draggable.c_0;
import kotakbaz.rain.client.sound.a;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.setting.A;
import kotakbaz.rain.module.setting.B;
import kotakbaz.rain.module.setting.settings.b_0;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_3414;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from kotakbaz.rain.module.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\n\u00a2\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n\u00a2\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010!\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b#\u0010\"J\u001d\u0010$\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b$\u0010\"J\u001d\u0010%\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016\u00a2\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b*\u0010\u0012J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b,\u0010\u0010J!\u0010/\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\nH\u0004\u00a2\u0006\u0004\b/\u00100J9\u00106\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010-\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0004\u00a2\u0006\u0004\b6\u00107J/\u0010<\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003082\b\b\u0002\u0010:\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\b<\u0010=J/\u0010?\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003082\b\b\u0002\u0010:\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\b?\u0010@J+\u0010C\u001a\u00020B2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020E2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u0016H\u0004\u00a2\u0006\u0004\bF\u0010GJ!\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020HH\u0004\u00a2\u0006\u0004\bJ\u0010KJ-\u0010O\u001a\u00020N2\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020H2\b\b\u0002\u0010M\u001a\u00020\u0003H\u0004\u00a2\u0006\u0004\bO\u0010PJ-\u0010T\u001a\u00020S2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u0002012\b\b\u0002\u0010R\u001a\u000201H\u0004\u00a2\u0006\u0004\bT\u0010UR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\b\\\u0010XR\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010]R\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bc\u0010bR!\u0010f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030e0d8\u0006\u00a2\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\u00a8\u0006j"}, d2={"Lkotakbaz/rain/module/Module;", "Lkotakbaz/rain/client/interfaces/IState;", "Lkotakbaz/rain/client/interfaces/IBindable;", "", "name", "Lkotakbaz/rain/client/extensions/Category;", "category", "desc", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/client/extensions/Category;Ljava/lang/String;)V", "", "isEnabled", "()Z", "value", "", "setEnabled", "(Z)V", "syncEnabledState", "()V", "toggle", "superDisable", "superEnable", "", "getKey", "()I", "setKey", "(I)V", "onKey", "isPreferredEnabled", "isAvailable", "isVisibleInGui", "Lkotlin/Function0;", "condition", "setVisibleInGui", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/Module;", "addVisibleInGuiCondition", "setAvailable", "addAvailabilityCondition", "canToggle", "canBind", "onBindAttempt", "onDisable", "onEnable", "enabled", "playToggleSound", "default", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "boolean", "(Ljava/lang/String;Z)Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "", "min", "max", "step", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "slider", "(Ljava/lang/String;FFFF)Lkotakbaz/rain/module/setting/settings/SliderSetting;", "", "modes", "defaultIndex", "Lkotakbaz/rain/module/setting/ModeSetting;", "mode", "(Ljava/lang/String;Ljava/util/List;I)Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/ModSetting;", "mod", "(Ljava/lang/String;Ljava/util/List;I)Lkotakbaz/rain/module/setting/ModSetting;", "maxLength", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "text", "(Ljava/lang/String;Ljava/lang/String;I)Lkotakbaz/rain/module/setting/settings/TextSetting;", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "bind", "(Ljava/lang/String;I)Lkotakbaz/rain/module/setting/settings/BindSetting;", "Ljava/awt/Color;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "color", "(Ljava/lang/String;Ljava/awt/Color;)Lkotakbaz/rain/module/setting/settings/ColorSetting;", "colorName", "clientColorName", "Lkotakbaz/rain/module/setting/ClientColorSetting;", "clientColor", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;)Lkotakbaz/rain/module/setting/ClientColorSetting;", "x", "y", "Lkotakbaz/rain/client/draggable/Draggable;", "draggable", "(Ljava/lang/String;FF)Lkotakbaz/rain/client/draggable/Draggable;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotakbaz/rain/client/extensions/Category;", "getCategory", "()Lkotakbaz/rain/client/extensions/Category;", "getDesc", "Z", "preferredEnabled", "key", "I", "visibleInGui", "Lkotlin/jvm/functions/Function0;", "available", "", "Lkotakbaz/rain/module/setting/Setting;", "settings", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\nkotakbaz/rain/module/Module\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public class a_0
implements kotakbaz.rain.client.interfaces.B,
kotakbaz.rain.client.interfaces.b_0 {
    @NotNull
    private final String name;
    @NotNull
    private final kotakbaz.rain.client.extensions.B category;
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

    public a_0(@NotNull String string, @NotNull kotakbaz.rain.client.extensions.B b2, @NotNull String string2) {
        int n = C[0];
        n += C[1];
        Intrinsics.checkNotNullParameter(string, (String)a[n -= C[2]]);
        int n2 = C[3];
        n2 ^= C[4];
        Intrinsics.checkNotNullParameter(b2, (String)a[n2 += C[5]]);
        int n3 = C[6];
        n3 -= C[7];
        Intrinsics.checkNotNullParameter(string2, (String)a[n3 += C[8]]);
        super();
        this.name = string;
        this.category = b2;
        this.desc = string2;
        int n4 = C[9];
        n4 ^= C[10];
        this.key = n4 += C[11];
        this.visibleInGui = a_0::visibleInGui$lambda$0;
        this.available = a_0::available$lambda$0;
        this.settings = new ArrayList();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final kotakbaz.rain.client.extensions.B getCategory() {
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
    public void setEnabled(boolean bl) {
        this.preferredEnabled = bl;
        this.syncEnabledState();
    }

    public final void syncEnabledState() {
        int n;
        long l = -7463985815423009486L;
        long l2 = -2828622317341885665L;
        if (this.preferredEnabled && this.isAvailable()) {
            int n2 = C[12];
            n2 += C[13];
            n = n2 -= C[14];
        } else {
            int n3 = C[15];
            n3 += C[16];
            n = n3 ^= C[17];
        }
        int n4 = C[18];
        n4 -= C[19];
        long l3 = l2;
        int n5 = C[21];
        n5 -= C[22];
        l2 = l3 ^ ((long)n << (n4 += C[20]) ^ l3) & -1L << (n5 -= C[23]);
        int n6 = C[24];
        n6 -= C[25];
        if ((int)(l2 >>> (n6 -= C[26])) == this.enabled) {
            return;
        }
        int n7 = C[27];
        n7 -= C[28];
        this.enabled = (int)(l2 >>> (n7 ^= C[29]));
        int n8 = C[30];
        n8 ^= C[31];
        if ((int)(l2 >>> (n8 -= C[32])) != 0) {
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
        kotakbaz.rain.event.a.INSTANCE.unregister(this);
    }

    private final void superEnable() {
        kotakbaz.rain.event.a.INSTANCE.register(this);
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public void setKey(int n) {
        if (this.key == n) {
            return;
        }
        this.key = n;
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
    public a_0 setVisibleInGui(@NotNull Function0<Boolean> function0) {
        int n = C[45];
        n -= C[46];
        Intrinsics.checkNotNullParameter(function0, (String)a[n += C[47]]);
        this.visibleInGui = function0;
        return this;
    }

    @NotNull
    public a_0 addVisibleInGuiCondition(@NotNull Function0<Boolean> function0) {
        int n = C[48];
        n -= C[49];
        Intrinsics.checkNotNullParameter(function0, (String)a[n ^= C[50]]);
        Function0<Boolean> function02 = this.visibleInGui;
        this.visibleInGui = () -> a_0.addVisibleInGuiCondition$lambda$0(function02, function0);
        return this;
    }

    @NotNull
    public a_0 setAvailable(@NotNull Function0<Boolean> function0) {
        int n = C[51];
        n ^= C[52];
        Intrinsics.checkNotNullParameter(function0, (String)a[n -= C[53]]);
        this.available = function0;
        this.syncEnabledState();
        return this;
    }

    @NotNull
    public a_0 addAvailabilityCondition(@NotNull Function0<Boolean> function0) {
        int n = C[54];
        n -= C[55];
        Intrinsics.checkNotNullParameter(function0, (String)a[n ^= C[56]]);
        Function0<Boolean> function02 = this.available;
        this.available = () -> a_0.addAvailabilityCondition$lambda$0(function02, function0);
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

    private final void playToggleSound(boolean bl) {
        if (kotakbaz.rain.client.extensions.b_0.getMc().field_1724 == null) {
            return;
        }
        kotakbaz.rain.client.extensions.b_0.getMc().method_1483().method_4873((class_1113)class_1109.method_4757((class_3414)(bl ? kotakbaz.rain.client.sound.a.INSTANCE.getMODULE_ENABLE() : kotakbaz.rain.client.sound.a.INSTANCE.getMODULE_DISABLE()), (float)1.0f, (float)1.0f));
    }

    @NotNull
    protected final c boolean(@NotNull String string, boolean bl) {
        long l = 8188960090689066237L;
        int n = C[63];
        n -= C[64];
        Intrinsics.checkNotNullParameter(string, (String)a[n ^= C[65]]);
        c c2 = new c(string, bl);
        List<B<?>> list = this.settings;
        B b2 = c2;
        long l2 = l;
        int n2 = C[66];
        n2 -= C[67];
        l = l2 ^ (0L ^ l2) & -1L << (n2 ^= C[68]);
        list.add(b2);
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ c boolean$default(a_0 a_02, String string, boolean bl, int n, Object object) {
        int n2;
        void var3_4;
        void var4_5;
        if (var4_5 != null) {
            int n3 = C[69];
            n3 -= C[70];
            int n4 = C[72];
            n4 -= C[73];
            throw new UnsupportedOperationException((String)a[n3 -= C[71]] + (String)a[n4 -= C[74]]);
        }
        int n5 = C[75];
        n5 -= C[76];
        if ((var3_4 & (n5 -= C[77])) != 0) {
            int n6 = C[78];
            n6 ^= C[79];
            n2 = n6 -= C[80];
        }
        return a_02.boolean(string, n2 != 0);
    }

    @NotNull
    protected final kotakbaz.rain.module.setting.settings.a_0 slider(@NotNull String string, float f2, float f3, float f4, float f5) {
        long l = 2683804965646241877L;
        int n = C[81];
        n -= C[82];
        Intrinsics.checkNotNullParameter(string, (String)a[n -= C[83]]);
        kotakbaz.rain.module.setting.settings.a_0 a_02 = new kotakbaz.rain.module.setting.settings.a_0(string, f2, f3, f4, f5);
        List<B<?>> list = this.settings;
        B b2 = a_02;
        long l2 = l;
        int n2 = C[84];
        n2 += C[85];
        l = l2 ^ (0L ^ l2) & -1L << (n2 ^= C[86]);
        list.add(b2);
        return a_02;
    }

    public static /* synthetic */ kotakbaz.rain.module.setting.settings.a_0 slider$default(a_0 a_02, String string, float f2, float f3, float f4, float f5, int n, Object object) {
        if (object != null) {
            int n2 = C[87];
            n2 -= C[88];
            int n3 = C[90];
            n3 ^= C[91];
            throw new UnsupportedOperationException((String)a[n2 -= C[89]] + (String)a[n3 -= C[92]]);
        }
        int n4 = C[93];
        n4 ^= C[94];
        if ((n & (n4 ^= C[95])) != 0) {
            f5 = 0.0f;
        }
        return a_02.slider(string, f2, f3, f4, f5);
    }

    @NotNull
    protected final kotakbaz.rain.module.setting.c mode(@NotNull String string, @NotNull List<String> list, int n) {
        long l = -6074893960776269671L;
        int n2 = C[96];
        n2 -= C[97];
        Intrinsics.checkNotNullParameter(string, (String)a[n2 -= C[98]]);
        int n3 = C[99];
        n3 -= C[100];
        Intrinsics.checkNotNullParameter(list, (String)a[n3 -= C[101]]);
        kotakbaz.rain.module.setting.c c2 = new kotakbaz.rain.module.setting.c(string, list, n);
        List<B<?>> list2 = this.settings;
        B b2 = c2;
        long l2 = l;
        int n4 = C[102];
        n4 -= C[103];
        l = l2 ^ (0L ^ l2) & -1L << (n4 ^= C[104]);
        list2.add(b2);
        return c2;
    }

    public static /* synthetic */ kotakbaz.rain.module.setting.c mode$default(a_0 a_02, String string, List list, int n, int n2, Object object) {
        if (object != null) {
            int n3 = C[105];
            n3 -= C[106];
            int n4 = C[108];
            n4 += C[109];
            throw new UnsupportedOperationException((String)a[n3 ^= C[107]] + (String)a[n4 ^= C[110]]);
        }
        int n5 = C[111];
        n5 ^= C[112];
        if ((n2 & (n5 += C[113])) != 0) {
            int n6 = C[114];
            n6 ^= C[115];
            n = n6 += C[116];
        }
        return a_02.mode(string, list, n);
    }

    @NotNull
    protected final A mod(@NotNull String string, @NotNull List<String> list, int n) {
        long l = 253829035554551729L;
        int n2 = C[117];
        n2 ^= C[118];
        Intrinsics.checkNotNullParameter(string, (String)a[n2 ^= C[119]]);
        int n3 = C[120];
        n3 -= C[121];
        Intrinsics.checkNotNullParameter(list, (String)a[n3 -= C[122]]);
        A a2 = new A(string, list, n);
        List<B<?>> list2 = this.settings;
        B b2 = a2;
        long l2 = l;
        int n4 = C[123];
        n4 += C[124];
        l = l2 ^ (0L ^ l2) & -1L << (n4 ^= C[125]);
        list2.add(b2);
        return a2;
    }

    public static /* synthetic */ A mod$default(a_0 a_02, String string, List list, int n, int n2, Object object) {
        if (object != null) {
            int n3 = C[126];
            n3 += C[127];
            int n4 = C[129];
            n4 += C[130];
            throw new UnsupportedOperationException((String)a[n3 ^= C[128]] + (String)a[n4 -= C[131]]);
        }
        int n5 = C[132];
        n5 -= C[133];
        if ((n2 & (n5 -= C[134])) != 0) {
            int n6 = C[135];
            n6 ^= C[136];
            n = n6 ^= C[137];
        }
        return a_02.mod(string, list, n);
    }

    @NotNull
    protected final kotakbaz.rain.module.setting.settings.A text(@NotNull String string, @NotNull String string2, int n) {
        long l = -6688202655946389523L;
        int n2 = C[138];
        n2 ^= C[139];
        Intrinsics.checkNotNullParameter(string, (String)a[n2 ^= C[140]]);
        int n3 = C[141];
        n3 ^= C[142];
        Intrinsics.checkNotNullParameter(string2, (String)a[n3 ^= C[143]]);
        kotakbaz.rain.module.setting.settings.A a2 = new kotakbaz.rain.module.setting.settings.A(string, string2, n);
        List<B<?>> list = this.settings;
        B b2 = a2;
        long l2 = l;
        int n4 = C[144];
        n4 -= C[145];
        l = l2 ^ (0L ^ l2) & -1L << (n4 -= C[146]);
        list.add(b2);
        return a2;
    }

    public static /* synthetic */ kotakbaz.rain.module.setting.settings.A text$default(a_0 a_02, String string, String string2, int n, int n2, Object object) {
        if (object != null) {
            int n3 = C[147];
            n3 ^= C[148];
            int n4 = C[150];
            n4 += C[151];
            throw new UnsupportedOperationException((String)a[n3 -= C[149]] + (String)a[n4 -= C[152]]);
        }
        int n5 = C[153];
        n5 += C[154];
        if ((n2 & (n5 += C[155])) != 0) {
            string2 = "";
        }
        int n6 = C[156];
        n6 -= C[157];
        if ((n2 & (n6 += C[158])) != 0) {
            int n7 = C[159];
            n7 -= C[160];
            n = n7 ^= C[161];
        }
        return a_02.text(string, string2, n);
    }

    @NotNull
    protected final b_0 bind(@NotNull String string, int n) {
        long l = -5439085265277674899L;
        int n2 = C[162];
        n2 += C[163];
        Intrinsics.checkNotNullParameter(string, (String)a[n2 -= C[164]]);
        b_0 b_02 = new b_0(string, n);
        List<B<?>> list = this.settings;
        B b2 = b_02;
        long l2 = l;
        int n3 = C[165];
        n3 += C[166];
        l = l2 ^ (0L ^ l2) & -1L << (n3 -= C[167]);
        list.add(b2);
        return b_02;
    }

    public static /* synthetic */ b_0 bind$default(a_0 a_02, String string, int n, int n2, Object object) {
        if (object != null) {
            int n3 = C[168];
            n3 ^= C[169];
            int n4 = C[171];
            n4 += C[172];
            throw new UnsupportedOperationException((String)a[n3 += C[170]] + (String)a[n4 ^= C[173]]);
        }
        int n5 = C[174];
        n5 -= C[175];
        if ((n2 & (n5 ^= C[176])) != 0) {
            int n6 = C[177];
            n6 ^= C[178];
            n = n6 -= C[179];
        }
        return a_02.bind(string, n);
    }

    @NotNull
    protected final kotakbaz.rain.module.setting.settings.B color(@NotNull String string, @NotNull Color color) {
        long l = -4885681974370899920L;
        int n = C[180];
        n ^= C[181];
        Intrinsics.checkNotNullParameter(string, (String)a[n += C[182]]);
        int n2 = C[183];
        n2 += C[184];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 += C[185]]);
        kotakbaz.rain.module.setting.settings.B b2 = new kotakbaz.rain.module.setting.settings.B(string, color);
        List<B<?>> list = this.settings;
        B b3 = b2;
        long l2 = l;
        int n3 = C[186];
        n3 ^= C[187];
        l = l2 ^ (0L ^ l2) & -1L << (n3 ^= C[188]);
        list.add(b3);
        return b2;
    }

    public static /* synthetic */ kotakbaz.rain.module.setting.settings.B color$default(a_0 a_02, String string, Color color, int n, Object object) {
        if (object != null) {
            int n2 = C[189];
            n2 += C[190];
            int n3 = C[192];
            n3 += C[193];
            throw new UnsupportedOperationException((String)a[n2 += C[191]] + (String)a[n3 ^= C[194]]);
        }
        int n4 = C[195];
        n4 ^= C[196];
        if ((n & (n4 ^= C[197])) != 0) {
            Color color2 = Color.WHITE;
            int n5 = C[198];
            n5 -= C[199];
            Intrinsics.checkNotNullExpressionValue(color2, (String)a[n5 += C[200]]);
            color = color2;
        }
        return a_02.color(string, color);
    }

    @NotNull
    protected final kotakbaz.rain.module.setting.b_0 clientColor(@NotNull String string, @NotNull Color color, @NotNull String string2) {
        int n = C[201];
        n -= C[202];
        Intrinsics.checkNotNullParameter(string, (String)a[n -= C[203]]);
        int n2 = C[204];
        n2 += C[205];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 ^= C[206]]);
        int n3 = C[207];
        n3 -= C[208];
        Intrinsics.checkNotNullParameter(string2, (String)a[n3 += C[209]]);
        boolean bl = C[210];
        bl ^= C[211];
        int n4 = C[213];
        n4 += C[214];
        B b2 = a_0.boolean$default(this, string2, bl ^= C[212], n4 ^= C[215], null).setVisible(a_0::clientColor$lambda$0);
        B b3 = this.color(string, color).setVisible(() -> a_0.clientColor$lambda$1((c)b2));
        return new kotakbaz.rain.module.setting.b_0((c)b2, (kotakbaz.rain.module.setting.settings.B)b3);
    }

    public static /* synthetic */ kotakbaz.rain.module.setting.b_0 clientColor$default(a_0 a_02, String string, Color color, String string2, int n, Object object) {
        if (object != null) {
            int n2 = C[216];
            n2 += C[217];
            int n3 = C[219];
            n3 ^= C[220];
            throw new UnsupportedOperationException((String)a[n2 -= C[218]] + (String)a[n3 += C[221]]);
        }
        int n4 = C[222];
        n4 -= C[223];
        if ((n & (n4 += C[224])) != 0) {
            int n5 = C[225];
            n5 ^= C[226];
            string = (String)a[n5 += C[227]];
        }
        int n6 = C[228];
        n6 ^= C[229];
        if ((n & (n6 += C[230])) != 0) {
            Color color2 = Color.WHITE;
            int n7 = C[231];
            n7 ^= C[232];
            Intrinsics.checkNotNullExpressionValue(color2, (String)a[n7 += C[233]]);
            color = color2;
        }
        int n8 = C[234];
        n8 += C[235];
        if ((n & (n8 -= C[236])) != 0) {
            int n9 = C[237];
            n9 ^= C[238];
            string2 = (String)a[n9 ^= C[239]];
        }
        return a_02.clientColor(string, color, string2);
    }

    @NotNull
    protected final c_0 draggable(@NotNull String string, float f2, float f3) {
        int n = C[240];
        n += C[241];
        Intrinsics.checkNotNullParameter(string, (String)a[n += C[242]]);
        return D.INSTANCE.create(this, string, f2, f3);
    }

    public static /* synthetic */ c_0 draggable$default(a_0 a_02, String string, float f2, float f3, int n, Object object) {
        if (object != null) {
            int n2 = C[243];
            n2 ^= C[244];
            int n3 = C[246];
            n3 += C[247];
            throw new UnsupportedOperationException((String)a[n2 += C[245]] + (String)a[n3 -= C[248]]);
        }
        int n4 = C[249];
        n4 += C[250];
        if ((n & (n4 ^= C[251])) != 0) {
            string = a_02.name;
        }
        int n5 = C[252];
        n5 ^= C[253];
        if ((n & (n5 ^= C[254])) != 0) {
            f2 = 20.0f;
        }
        int n6 = C[255];
        n6 ^= C[256];
        if ((n & (n6 -= C[257])) != 0) {
            f3 = 20.0f;
        }
        return a_02.draggable(string, f2, f3);
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

    private static final boolean addVisibleInGuiCondition$lambda$0(Function0 function0, Function0 function02) {
        int n;
        if (((Boolean)function0.invoke()).booleanValue() && ((Boolean)function02.invoke()).booleanValue()) {
            int n2 = C[264];
            n2 ^= C[265];
            n = n2 ^= C[266];
        } else {
            int n3 = C[267];
            n3 += C[268];
            n = n3 ^= C[269];
        }
        return n != 0;
    }

    private static final boolean addAvailabilityCondition$lambda$0(Function0 function0, Function0 function02) {
        int n;
        if (((Boolean)function0.invoke()).booleanValue() && ((Boolean)function02.invoke()).booleanValue()) {
            int n2 = C[270];
            n2 += C[271];
            n = n2 ^= C[272];
        } else {
            int n3 = C[273];
            n3 ^= C[274];
            n = n3 -= C[275];
        }
        return n != 0;
    }

    private static final boolean clientColor$lambda$0() {
        return P.INSTANCE.isEnabled();
    }

    private static final boolean clientColor$lambda$1(c c2) {
        int n;
        if (!P.INSTANCE.isEnabled() || !((Boolean)c2.getValue()).booleanValue()) {
            int n2 = C[276];
            n2 += C[277];
            n = n2 -= C[278];
        } else {
            int n3 = C[279];
            n3 -= C[280];
            n = n3 -= C[281];
        }
        return n != 0;
    }

    static {
        a_0.b();
        long l = 2243976407097098603L;
        long l2 = 8257173282470170080L;
        long l3 = -4563095205719465404L;
        long l4 = 1456654289448466936L;
        long l5 = -4131868689147778656L;
        long l6 = 5574250026115614305L;
        long l7 = 443180120001287879L;
        long l8 = 7543917216148536744L;
        long l9 = -4966981464460821384L;
        long l10 = 9030570780338551280L;
        long l11 = -7697705150070621447L;
        long l12 = -46241376518045910L;
        long l13 = 8148440395317938031L;
        long l14 = 5042310826225484932L;
        int n = C[282];
        n += C[283];
        a = new Object[n -= C[284]];
        long l15 = l14;
        int n2 = C[285];
        n2 ^= C[286];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= C[287]);
        Object[] objectArray = new Object[C[288]];
        objectArray[a_0.C[289]] = A;
        objectArray[a_0.C[290]] = C[291];
        int n3 = C[292];
        Object object = a_0.A()[C[293]];
        if (object == null) {
            char[] cArray = "\u691c\u6bfb\u6916\u691a\u6c02\u6bf7\u6c00\u6bac\u6baa\u68bc\u6917\u68b0\u68b7\u68b6\u6920\u6bab\u68ba\u6922\u68cd\u6bf9\u691a\u68c3\u6c14\u691b\u691e\u691d\u691a\u691a\u68b7\u68b7\u6bac\u68ae\u68ba\u68c9\u6c10\u6c02\u6bf7\u6bfa\u6bfd\u6922\u68c5\u6baa\u68b7\u6bfb\u6925\u6ba9\u6baa\u6916\u6920\u691b\u6bfb\u68bd\u6bfc\u6ba9\u6924\u6bb5\u68cc\u6bf8\u68d5\u6bf9\u691e\u6922\u6bfd\u6baa\u68ce\u6bf7\u6bac\u68b6\u68c3\u68cf\u68bd\u6bfb\u6c0f\u6c14\u6925\u68c9\u6bf7\u6c10\u6c14\u691f\u6c04\u6bf8\u68d0\u68b9\u691a\u691b\u68b4\u68af\u6921\u6c03\u6923\u68ce\u68ca\u68af\u6c14\u68b0\u691d\u6baa\u6bfd\u68b9\u68ce\u6bf8\u6919\u6bfd\u68af\u6921\u691e\u6bfc\u6bf7\u68bc\u68b7\u6923\u691f\u68ae\u68cc\u6925\u68ce\u68d0\u6c02\u68cb\u68ba\u68cd\u6917\u6c04\u6920\u68cd\u6ba9\u6bfc\u6bf8\u6922\u68b0\u691c\u6bfb\u6c0e\u6925\u6bf7\u6917\u6baa\u68b4\u68af\u68cd\u6c10\u691f\u6c14\u6bfa\u6baa\u6c03\u68ae\u6923\u6bfd\u691e\u68b9\u6bfa\u68c5\u68cf\u6c03\u691a\u68bd\u6c01\u6c04\u68b4\u68cd\u6c01\u6c03\u68ce\u6c01\u6c04\u6c0e\u6925\u68bb\u6c01\u68c3\u6916\u6c04\u6bf8\u6bb5\u68ce\u6924\u68ba\u6ba9\u6bad\u68cb\u68b0\u6bfc\u6920\u6ba9\u68b4\u6baa\u68b6\u6916\u68cc\u6c0f\u68c5\u68bd\u6bf8\u6925\u6c04\u6bfe\u6bff\u6bf6\u6918\u6bfe\u6923\u68b6\u6bff\u6bb5\u6bfd\u6c0f\u6bfa\u68ae\u68cf\u691f\u6bf7\u6bac\u6922\u6bac\u6c05\u68cc\u68b4\u6baa\u6baa\u6bfe\u68b9\u68b4\u6925\u6bf9\u6c05\u68ba\u691d\u6bb5\u6bac\u68b6\u6c05\u6bf8\u68cc\u6bf9\u6c00\u6925\u6c02\u6bff\u68b4\u6bf8\u68b4\u6c0f\u68bb\u68b0\u68bd\u68bc\u6ba9\u6bf6\u6c0e\u6c04\u68ba\u68cc\u6c02\u6bab\u6918\u6bf9\u6c0f\u68b0\u6bfe\u6bfe\u68c5\u691f\u6bfd\u68cf\u6920\u6919\u68bb\u691b\u68cc\u6c0e\u6bf7\u6bad\u68bd\u68c3\u6916\u6921\u6bfc\u6bfa\u68b6\u6ba9\u691e\u68cc\u6920\u68d0\u68af\u68cd\u6925\u68ba\u68cb\u6bff\u6bfe\u68b0\u691f\u68b7\u6baa\u68cf\u68cf\u68b9\u691e\u6923\u68c9\u6c14\u68b6\u68c3\u6bfc\u68b6\u6bac\u6c0e\u68bd\u6baa\u6922\u6c05\u6c02\u68b9\u6c03\u6c10\u6916\u6bf7\u6923\u691d\u68b6\u68b7\u6bf6\u6c00\u6c14\u691c\u6bfd\u6bf6\u6bff\u68bb\u68cc\u68c9\u6bfc\u68b6\u6bab\u6c05\u6923\u6bac\u6c02\u6c00\u691e\u6c0f\u6bff\u691e\u6c0f\u6c04\u6c01\u6bf9\u6918\u6bff\u6916\u6c04\u68bc\u6924\u6c05\u6bf6\u6bf9\u68ae\u6918\u68c5\u68bd\u6bac\u6920\u6baa\u6924\u68cf\u68af\u68c9\u6bad\u68b9\u68bb\u68cc\u6920\u691b\u6bf8\u6bfc\u6c04\u68bb\u68cb\u6924\u691f\u68ce\u6c0f\u6baa\u691a\u6918\u6c04\u691b\u68cb\u68ca\u68cb\u6bfc\u68cd\u6918\u691e\u68d5\u68d0\u6c10\u6923\u68c3\u68d5\u68ae\u68c5\u6bfa\u6bfb\u68d5\u6bf9\u691f\u68d0\u6c14\u691b\u68ca\u6bb5\u6917\u6c04\u6917\u68b6\u691a\u6bf7\u6c05\u68b0\u6bfc\u6921\u6bfa\u6c10\u68ca\u68ce\u68bb\u6bfc\u68b4\u6bf6\u6bf6\u6c05\u68c5\u6921\u691e\u6919\u6923\u68d0\u68ca\u691c\u68bb\u6922\u6922\u68b0\u6917\u691d\u6c0e\u6bfe\u68cb\u6924\u6baa\u6922\u68bb\u68b4\u6baa\u691b\u6bf9\u68bb\u6bab\u6921\u68ba\u6bfc\u691a\u68ca\u6bad\u68cc\u691e\u6c05\u6bb5\u6bff\u6c14\u6bfd\u68b7\u68cb\u68b9\u6c10\u6bfa\u68d5\u68d5\u691e\u6c00\u6bfb\u68b6\u6bfe\u68d0\u6bfa\u68ae\u68ce\u68b9\u6917\u6c0f\u6c10\u68bc\u691e\u68ca\u6921\u6bf9\u6c05\u6c0f\u68ca\u6bfe\u6c01\u6c01\u6bf9\u6bf9\u6c0e\u6bad\u6919\u691d\u68b7\u6bf6\u6bfc\u6916\u6bac\u6bfd\u691c\u68b9\u6920\u6bfe\u6bab\u68cc\u691f\u6bfb\u6916\u68ce\u691d\u6bb5\u6bfd\u6bfd\u6925\u6918\u6bfb\u6c05\u68c3\u6920\u6c14\u6bac\u68cb\u68c9\u68af\u6bac\u6920\u6916\u6917\u68c3\u68c9\u6bfb\u68b6\u6917\u6c0f\u68b6\u6c00\u68ae\u691f\u6c04\u68cb\u6c14\u68ba\u6920\u6ba9\u691a\u691f\u68cc\u68bc\u6bab\u68b9\u68c3\u6bfa\u6bab\u68b7\u6c03\u6925\u68ba\u6bfc\u68d0\u6bfa\u6bf8\u691f\u68c5\u68ca\u6920\u6bb5\u6c04\u68d0\u6bf8\u68ba\u6922\u6916\u6bfa\u68ae\u6c00\u6917\u6921\u6bad\u68cf\u691c\u68ca\u691f\u6bff\u6925\u68bb\u6c01\u68cc\u6bad\u6bb5\u6bf9\u6ba9\u6baa\u6c00\u68ca\u6ba9\u6bfb\u691c\u6bfd\u6bf9\u6bb5\u6919\u68ba\u68cd\u68b9\u6c01\u68b4\u6917\u6bfc\u68ba\u6bfb\u68b4\u68d0\u68c9\u6916\u6c14\u6bff\u68cd\u6924\u6c0e\u6bf7\u68b0\u6c00\u6bac\u6c0f\u68bb\u6bfe\u6c14\u6bf9\u6921\u6bad\u68ae\u6c03\u6916\u68b0\u6c00\u6c14\u6c14\u6bad\u6c03\u6bad\u68cc\u6c05\u6916\u691b\u68af\u6c01\u6c00\u6c10\u68ae\u6925\u6c14\u68bc\u6c01\u6bad\u68b0\u68b4\u6921\u6920\u6bff\u6c10\u691d\u68b7\u68b9\u691c\u68b7\u68bc\u6bad\u68d5\u6bad\u6bac\u6bac\u6923\u68c9\u68cd\u6917\u6920\u6bad\u68b7\u6bfd\u68c9\u6c03\u6917\u68c3\u68b7\u68cb\u6bb5\u6bfd\u68c3\u68ce\u68ae\u68b7\u68bb\u68ae\u6c01\u6bfe\u68b6\u691f\u68bb\u6c04\u68c3\u6c02\u6925\u68c3\u6bb5\u68b7\u6c04\u691b\u6bfb\u6bad\u6916\u68cb\u6c02\u6bad\u6bf7\u68b7\u6bf6\u6c04\u691e\u6c10\u6bfc\u6922\u6c00\u68ba\u68ca\u68ce\u68ca\u6ba9\u691c\u691f\u68cd\u6919\u6916\u68d0\u6917\u68cc\u68cd\u6bfa\u691b\u6bff\u6bf8\u6c10\u68bd\u6920\u68bc\u6bfe\u6bab\u68ca\u6924\u691a\u68b6\u68af\u68ba\u6bb5\u68ca\u6c03\u6ba9\u691e\u6c0f\u691e\u6c14\u6baa\u6c10\u68ca\u68cd\u68bd\u68c9\u68c3\u6c10\u691c\u68b7\u6bfb\u6c03\u68b4\u6918\u6bac\u68bd\u6bf6\u6bab\u6c0f\u6c03\u68bc\u6922\u6c03\u68c3\u691b\u6921\u68ba\u6bac\u6bfa\u68cb\u68b6\u68ce\u6bf7\u6917\u68cd\u68b7\u691f\u691c\u6bac\u68c5\u68b6\u6922\u6c00\u691a\u68bd\u6bfc\u68d5\u6bfa\u691f\u691d\u6919\u6bfb\u691e\u6c04\u68cf\u6bfb\u68b0\u68c9\u68d5\u6918\u68c5\u68c9\u68d5\u68b4\u6c05\u6919\u68b7\u6c01\u68ca\u6c14\u68cd\u6bf8\u6920\u691e\u6bf8\u6bfe\u6bf7\u68ca\u68b6\u6c01\u68cb\u691d\u68cf\u68cd\u6bfc\u691d\u68cd\u68bb\u68bc\u68cb\u68cb\u68bb\u68b6\u6bfd\u68c9\u6921\u6c14\u6c01\u6919\u68cf\u691e\u68ca\u68c9\u6c02\u68cc\u6917\u6bac\u6c02\u6c05\u68b6\u68cc\u68c5\u68af\u6916\u6916\u6922\u691e\u68c9\u6c0e\u6c0e\u68b7\u68ce\u68ba\u6c0f\u6baa\u68cf\u6bad\u68d0\u6ba9\u6919\u6c03\u6bfd\u6924\u68d0\u6c0f\u691b\u68bd\u68b9\u68bc\u6917\u68cc\u6ba9\u68d5\u6bfa\u6920\u68bb\u6918\u68cb\u6c10\u68b4\u68cd\u6baa\u6c10\u6bfb\u68b4\u691a\u6bff\u6bf7\u6bf6\u68af\u6c05\u691b\u68b0\u6bfc\u68bd\u68b9\u6bf8\u68bb\u68bb\u6924\u6bfc\u6c0f\u6917\u6bf7\u691e\u6c04\u68b0\u6919\u68c9\u68bc\u6c03\u6bab\u68cb\u6918\u6916\u68bd\u6bfb\u6924\u6bac\u6c01\u6c00\u68af\u68cb\u6bfe\u6bac\u6bfe\u6922\u6bad\u6922\u68cc\u68ce\u6921\u6bf9\u68b9\u6c04\u6921\u68cf\u6c10\u68b0\u68cf\u68bc\u6918\u6bab\u68b9\u68b4\u68cf\u6bf9\u6c03\u691f\u691d\u691d\u6bab\u68b4\u6c01\u68b0\u6c02\u691d\u6bff\u691c\u6bfc\u6bfc\u68cf\u68ba\u691f\u6c03\u6bf9\u6bfd\u68bc\u6bad\u68b4\u6bf7\u6bfe\u68ba\u691b\u6c0e\u68d5\u691c\u68b6\u6ba9\u6923\u6bad\u691f\u691c\u68c9\u6bf6\u6bf9\u691d\u6918\u6c0e\u6c10\u6bf6\u6bfe\u691d\u6c10\u6bfc\u6bf9\u6bf7\u6921\u68bd\u6baa\u6bf6\u6c14\u68b7\u6bab\u68bc\u6bfa\u6bf9\u6920\u691d\u68cf\u6bfd\u68c3\u6c03\u68b0\u6918\u691f\u68cb\u68cd\u6917\u691c\u6bac\u6bf7\u691b\u6baa\u68d5\u68cd\u68ce\u6c01\u6c00\u6ba9\u6924\u68b6\u6918\u68b4\u6bfd\u6c0f\u68bb\u6924\u6c05\u6bf7\u68bc\u6c04\u6bac\u6925\u6bfb\u6bff\u68c5\u6bf6\u68d0\u6917\u6c02\u6924\u68b6\u6c03\u68af\u6bac\u6922\u68b7\u68ce\u6917\u6bf6\u6924\u68ae\u68c3\u68c3\u68cc\u68cc\u68c3\u6c14\u6ba9\u6bfe\u6925\u68cd\u6bab\u691b\u68bb\u68bd\u68d0\u6921\u691b\u68c9\u6925\u6bad\u6c04\u6923\u6c10\u6921\u68d5\u6bac\u6924\u6bf7\u6bb5\u6919\u68c3\u6c14\u68c3\u6c10\u6bac\u6c0e\u68ba\u691d\u68b6\u68c3\u6c0f\u6bf9\u68cb\u68c3\u6c14\u68b0\u6923\u68b4\u6c04\u6bf9\u68c5\u68c9\u691b\u68cc\u6bff\u6c00\u68b7\u6c0f\u6baa\u6c05\u6bfa\u68b7\u6916\u68ae\u6c04\u6c03\u6bfc\u6bfe\u6bfd\u6bac\u6bf7\u6c10\u6c03\u6bfc\u6921\u6c10\u691a\u68ca\u68af\u6919\u68b0\u6bab\u6bff\u6bab\u68c3\u6bf7\u6918\u691f\u68bb\u691b\u6922\u691e\u6c01\u6ba9\u691b\u6baa\u6ba9\u68c9\u68c3\u68c5\u691b\u6c14\u6bff\u68ae\u6c14\u6922\u68d5\u6c0e\u6c03\u6923\u6c02\u6c00\u691a\u6c03\u68cd\u6919\u68cb\u6bfb\u68b4\u6c14\u6bab\u6c03\u6baa\u6c0f\u68ba\u6918\u691d\u68b4\u6bac\u6c04\u6916\u6bfb\u6c05\u6bfd\u68ba\u68bb\u6920\u68b4\u6918\u6916\u691d\u6917\u68d5\u6baa\u68bb\u68c5\u68cd\u68ca\u68d0\u68cc\u6924\u68d5\u68d0\u6920\u6917\u6bad\u68d0\u6924\u691d\u6c0f\u6bab\u6bab\u68b9\u68b6\u68d5\u6917\u68b4\u68c5\u6bab\u6924\u6c0f\u68ba\u6bfa\u68cd\u6bf6\u6c0e\u6ba9\u68cd\u6c0f\u68ca\u6c00\u6c00\u6baa\u6ba9\u6920\u6bf8\u68c5\u6bac\u68d5\u6922\u6920\u6bac\u691a\u68c9\u691d\u6c04\u6bfc\u6c14\u691c\u6c05\u6c0e\u6923\u6bac\u68b9\u6c03\u6bfc\u6c0e\u6c14\u6c0f\u68cb\u6bab\u6c0f\u6c10\u6c10\u6bf6\u6bfa\u68d0\u691f\u691a\u6c01\u6bfe\u68b9\u6916\u6920\u691c\u68ca\u6916\u6bf9\u68c5\u6c0e\u6921\u6c01\u691c\u68cd\u6916\u6916\u6c04\u6c00\u68cb\u6bb5\u6c0e\u6bfb\u68bd\u6925\u6c00\u68ae\u6c01\u6bfa\u6920\u6bf8\u6bfc\u6923\u691e\u6bff\u68d1\u68d1".toCharArray();
            for (int i2 = C[294]; i2 < C[295]; ++i2) {
                int n4 = cArray[i2];
                n4 -= C[296];
                n4 -= C[297];
                n4 += C[298];
                n4 -= C[299];
                n4 -= C[300];
                n4 += C[301];
                n4 ^= C[302];
                n4 -= C[303];
                n4 ^= C[304];
                n4 ^= C[305];
                n4 += C[306];
                n4 ^= C[307];
                cArray[i2] = (char)(n4 += C[308]);
            }
            object = a_0.A()[a_0.C[309]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[310];
        n5 += C[311];
        l5 = l16 ^ (0x3D600000000L ^ l16) & -1L << (n5 += C[312]);
        long l17 = l12;
        int n6 = C[313];
        n6 += C[314];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += C[315]);
        while (true) {
            int n7 = C[316];
            n7 += C[317];
            if ((int)l12 >= (int)(l5 >>> (n7 += C[318]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[319];
            n9 ^= C[320];
            int n10 = C[322];
            n10 ^= C[323];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += C[321])) & -1L >>> (n10 ^= C[324]);
            long l19 = l8;
            int n11 = C[325];
            n11 += C[326];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += C[327]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[328];
            n13 -= C[329];
            int n14 = C[331];
            n14 ^= C[332];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += C[330])) & -1L >>> (n14 += C[333]);
            int n15 = C[334];
            n15 ^= C[335];
            long l21 = l9;
            int n16 = C[337];
            n16 ^= C[338];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += C[336]) ^ l21) & -1L << (n16 += C[339]);
            int n17 = C[340];
            n17 -= C[341];
            n17 -= C[342];
            int n18 = C[343];
            n18 -= C[344];
            long l22 = l11;
            int n19 = C[346];
            n19 ^= C[347];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= C[345]))) ^ l22) & -1L >>> (n19 += C[348]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[349];
            n20 -= C[350];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += C[351]);
            while (true) {
                int n21 = C[352];
                n21 ^= C[353];
                if ((int)(l13 >>> (n21 -= C[354])) >= (int)l11) break;
                int n22 = C[355];
                n22 += C[356];
                int n23 = C[358];
                n23 -= C[359];
                cArray2[(int)(l13 >>> (n22 -= a_0.C[357]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= C[360]))];
                l13 += 0x100000000L;
            }
            int n24 = C[361];
            n24 ^= C[362];
            int n25 = (int)(l14 >>> (n24 += C[363]));
            l14 += 0x100000000L;
            a_0.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[364];
            n26 += C[365];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += C[366]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[367]];
        String string = (String)object[C[368]];
        object = object[C[369]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[370]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[371]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[373] ^ C[374]];
                byArray[a_0.C[375] ^ a_0.C[376]] = C[377] ^ C[378];
                byArray[a_0.C[379] ^ a_0.C[380]] = C[381] ^ C[382];
                byArray[a_0.C[383] ^ a_0.C[384]] = C[385] ^ C[386];
                byArray[a_0.C[387] ^ a_0.C[388]] = C[389] ^ C[390];
                byArray[a_0.C[391] ^ a_0.C[392]] = C[393] ^ C[394];
                byArray[a_0.C[395] ^ a_0.C[396]] = C[397] ^ C[398];
                byArray[a_0.C[399] ^ 0x104CA] = 0xFFFEFB4F ^ 0x104CA;
                byArray[0xD4AE ^ 0xD4A7] = 0xD4C3 ^ 0xD4A7;
                byArray[0x8440 ^ 0x8444] = 0xFFFF7BE3 ^ 0x8444;
                byArray[0x374D ^ 0x374C] = 0xFFFFC8EA ^ 0x374C;
                byArray[0xF388 ^ 0xF38A] = 0xF3CF ^ 0xF38A;
                byArray[0x7C1A ^ 0x7C17] = 0xFFFF83D9 ^ 0x7C17;
                byArray[0x680B ^ 0x6804] = 0xFFFF97F8 ^ 0x6804;
                byArray[0xDEDA ^ 0xDED6] = 0xDE9B ^ 0xDED6;
                byArray[0x2CF ^ 0x2C7] = 0x281 ^ 0x2C7;
                byArray[0x4FA8 ^ 0x4FAD] = 0xFFFFB031 ^ 0x4FAD;
                objectArray2[a_0.C[372]] = byArray;
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
                Object object4 = a_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u863d\u862b\u8634\u8629\u8637\u80db\u8638\u8696\u8699\u8695\u8635\u8692\u868e\u868c\u863c\u8635\u862e\u80de".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= 0xB800;
                        n2 += 41184;
                        n2 ^= 0x1A40;
                        n2 += 59136;
                        n2 += 37409;
                        n2 ^= 0xD0C6;
                        n2 ^= 0x2DE8;
                        n2 ^= 0x4CE;
                        n2 -= 56656;
                        n2 += 33047;
                        n2 -= 6168;
                        n2 ^= 0x2978;
                        n2 += 44089;
                        cArray[i2] = (char)(n2 ^= 0x263E);
                    }
                    object4 = a_0.A()[1] = new String(cArray);
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
                Object object5 = a_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u6b95\u6b71\u6b67".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 36032;
                        n3 += 61154;
                        n3 -= 45059;
                        n3 ^= 0xB686;
                        n3 += 61352;
                        n3 -= 43181;
                        n3 += 5713;
                        n3 ^= 0x1D13;
                        n3 -= 37652;
                        n3 ^= 0x3635;
                        n3 -= 56599;
                        n3 ^= 0x2977;
                        n3 += 6136;
                        n3 ^= 0x937A;
                        n3 ^= 0x14FE;
                        cArray[i3] = (char)(n3 ^= 0x91DF);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\udc2a\udc4e\udc7c\udc18\udc2c\udc2d\udc2c\udc18\udc7b\udc44\udc2c\udc7c\udcbe\udc7b\udc0a\udc2f\udc2f\udc22\udfd9\udc20".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0x3FE4;
                    n4 ^= 0x3DCC;
                    n4 -= 45196;
                    n4 += 50734;
                    n4 -= 28431;
                    n4 ^= 0xF1D0;
                    n4 -= 14993;
                    n4 -= 56467;
                    n4 -= 46293;
                    n4 ^= 0xB075;
                    n4 ^= 0x7A7B;
                    n4 += 9597;
                    n4 ^= 0xDA9F;
                    cArray[i4] = (char)(n4 -= 20959);
                }
                object6 = a_0.A()[3] = new String(cArray);
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
        a_0.C[0xACFC ^ 0xACB3] = 0xFFFF537C ^ 0xACB3;
        a_0.C[0xEF5F ^ 0xEF25] = 0xFFFF10E6 ^ 0xEF25;
        a_0.C[0x1514 ^ 0x1584] = 0x1549 ^ 0x1584;
        a_0.C[0x4D4D ^ 0x4C08] = 0x4C07 ^ 0x4C08;
        a_0.C[0xF4BF ^ 0xF5CF] = 0xF5CD ^ 0xF5CF;
        a_0.C[0xE951 ^ 0xE9F1] = 0xE992 ^ 0xE9F1;
        a_0.C[0x5F71 ^ 0x5F1D] = 0x5F14 ^ 0x5F1D;
        a_0.C[0x1084F ^ 0x1093D] = 0x1093C ^ 0x1093D;
        a_0.C[0x535F ^ 0x521C] = 0xFFFFADFB ^ 0x521C;
        a_0.C[0x8742 ^ 0x8626] = 0xFFFF7983 ^ 0x8626;
        a_0.C[0xF64F ^ 0xF6D8] = 0xFFFF090C ^ 0xF6D8;
        a_0.C[0xA759 ^ 0xA72C] = 0xA764 ^ 0xA72C;
        a_0.C[0x10A15 ^ 0x10A81] = 0xFFFEF516 ^ 0x10A81;
        a_0.C[0xF780 ^ 0xF68F] = 0xF6AF ^ 0xF68F;
        a_0.C[0x83E5 ^ 0x83EE] = 0x8385 ^ 0x83EE;
        a_0.C[0x945C ^ 0x9487] = 0x9486 ^ 0x9487;
        a_0.C[0xB551 ^ 0xB588] = 0xB58D ^ 0xB588;
        a_0.C[0xCC87 ^ 0xCCE6] = 0xFFFF3379 ^ 0xCCE6;
        a_0.C[0x1490 ^ 0x145F] = 0x1439 ^ 0x145F;
        a_0.C[0x72D6 ^ 0x73FF] = 0x7EBD ^ 0x73FF;
        a_0.C[0x824D ^ 0x82CC] = 0xFFFF7D54 ^ 0x82CC;
        a_0.C[0xE7FD ^ 0xE68B] = 0x5F76 ^ 0xE68B;
        a_0.C[0x8EC9 ^ 0x8F45] = 0x7D35 ^ 0x8F45;
        a_0.C[0xFB5F ^ 0xFB58] = 0xFB58 ^ 0xFB58;
        a_0.C[0xC45D ^ 0xC405] = 0xC470 ^ 0xC405;
        a_0.C[0xDF45 ^ 0xDE09] = 0xDE29 ^ 0xDE09;
        a_0.C[0xF51C ^ 0xF542] = 0xFFFF0A9C ^ 0xF542;
        a_0.C[0x76F5 ^ 0x77DD] = 0x7BBC ^ 0x77DD;
        a_0.C[0x545F ^ 0x557F] = 0x557C ^ 0x557F;
        a_0.C[0xDFC7 ^ 0xDF11] = 0xDF66 ^ 0xDF11;
        a_0.C[0x4FD3 ^ 0x4E95] = 0xFFFFB17D ^ 0x4E95;
        a_0.C[0x607B ^ 0x609B] = 0x60AF ^ 0x609B;
        a_0.C[0x7DD0 ^ 0x7D49] = 0xFFFF821D ^ 0x7D49;
        a_0.C[0xF4FA ^ 0xF4E5] = 0xFFFF0B1B ^ 0xF4E5;
        a_0.C[0xA1D8 ^ 0xA1E4] = 0xFFFF5E2C ^ 0xA1E4;
        a_0.C[0x306 ^ 0x305] = 0xFFFFFCB7 ^ 0x305;
        a_0.C[0xCDFE ^ 0xCD8C] = 0xCDFC ^ 0xCD8C;
        a_0.C[0x101D5 ^ 0x100FB] = 0x1E5CB ^ 0x100FB;
        a_0.C[0x10FFD ^ 0x10ED1] = 0x1B5DE ^ 0x10ED1;
        a_0.C[0x5786 ^ 0x5754] = 0xFFFFA8AF ^ 0x5754;
        a_0.C[0x4DDF ^ 0x4D1C] = 0xFFFFB2AC ^ 0x4D1C;
        a_0.C[0x96C3 ^ 0x97FD] = 0xFFFF6818 ^ 0x97FD;
        a_0.C[0x689B ^ 0x69D6] = 0xFFFF964A ^ 0x69D6;
        a_0.C[0x4CD6 ^ 0x4DE7] = 0x6432 ^ 0x4DE7;
        a_0.C[0x66B ^ 0x738] = 0x760 ^ 0x738;
        a_0.C[0xEE7F ^ 0xEF06] = 0xFFFF1E88 ^ 0xEF06;
        a_0.C[0x21AD ^ 0x2196] = 0x218B ^ 0x2196;
        a_0.C[0x381B ^ 0x3860] = 0x3871 ^ 0x3860;
        a_0.C[0x4DE0 ^ 0x4DED] = 0xFFFFB22B ^ 0x4DED;
        a_0.C[0x9AC4 ^ 0x9A29] = 0xFFFF65B0 ^ 0x9A29;
        a_0.C[0xAA08 ^ 0xAA8A] = 0xAAF9 ^ 0xAA8A;
        a_0.C[0xDAEA ^ 0xDAE2] = 0xFFFF2507 ^ 0xDAE2;
        a_0.C[0xAD1F ^ 0xADF6] = 0xAD8F ^ 0xADF6;
        a_0.C[0xEEC ^ 0xE26] = 0xFFFFF1B8 ^ 0xE26;
        a_0.C[0xB8BD ^ 0xB93B] = 0x5DE8 ^ 0xB93B;
        a_0.C[0x1A10 ^ 0x1A32] = 0xFFFFE5FF ^ 0x1A32;
        a_0.C[0xEB67 ^ 0xEBFA] = 0xFFFF141D ^ 0xEBFA;
        a_0.C[0x7647 ^ 0x76A4] = 0xFFFF897E ^ 0x76A4;
        a_0.C[0x6994 ^ 0x69AB] = 0xFFFF963B ^ 0x69AB;
        a_0.C[0x8665 ^ 0x8719] = 0xA8D0 ^ 0x8719;
        a_0.C[0x97D9 ^ 0x9764] = 0x977D ^ 0x9764;
        a_0.C[0xA0A6 ^ 0xA1A0] = 0xFFFF5E2F ^ 0xA1A0;
        a_0.C[0x102F6 ^ 0x1029D] = 0x10287 ^ 0x1029D;
        a_0.C[0x6283 ^ 0x63BA] = 0x637E ^ 0x63BA;
        a_0.C[0x3BCE ^ 0x3B8E] = 0xFFFFC460 ^ 0x3B8E;
        a_0.C[0xA0D3 ^ 0xA042] = 0xA001 ^ 0xA042;
        a_0.C[0xDC6B ^ 0xDC91] = 0xFFFF2359 ^ 0xDC91;
        a_0.C[0xEA4C ^ 0xEB06] = 0xEB0D ^ 0xEB06;
        a_0.C[0x5F3B ^ 0x5E7F] = 0xFFFFA189 ^ 0x5E7F;
        a_0.C[0x9632 ^ 0x96FE] = 0xFFFF6924 ^ 0x96FE;
        a_0.C[0x102DB ^ 0x102E1] = 0x102C0 ^ 0x102E1;
        a_0.C[0x601 ^ 0x71D] = 0x76A ^ 0x71D;
        a_0.C[0x716C ^ 0x7076] = 0x705B ^ 0x7076;
        a_0.C[0xD662 ^ 0xD627] = 0xFFFF29D0 ^ 0xD627;
        a_0.C[0x106FE ^ 0x106EF] = 0xFFFEF907 ^ 0x106EF;
        a_0.C[0xECB3 ^ 0xEDB4] = 0xFFFF1260 ^ 0xEDB4;
        a_0.C[0x8A8E ^ 0x8A10] = 0xFFFF7592 ^ 0x8A10;
        a_0.C[0xC2FF ^ 0xC2E7] = 0xC2EC ^ 0xC2E7;
        a_0.C[0x10319 ^ 0x10273] = 0x1023F ^ 0x10273;
        a_0.C[0x77D2 ^ 0x7758] = 0xFFFF8883 ^ 0x7758;
        a_0.C[0x7E38 ^ 0x7F7F] = 0x7F56 ^ 0x7F7F;
        a_0.C[0x5A4E ^ 0x5B2B] = 0x5B04 ^ 0x5B2B;
        a_0.C[0xAD5B ^ 0xAD41] = 0xAD6F ^ 0xAD41;
        a_0.C[0x8B03 ^ 0x8BCA] = 0xFFFF744B ^ 0x8BCA;
        a_0.C[0x3A01 ^ 0x3ABE] = 0xFFFFC52B ^ 0x3ABE;
        a_0.C[0x5765 ^ 0x5673] = 0x566A ^ 0x5673;
        a_0.C[0x7DA8 ^ 0x7D6A] = 0x7D79 ^ 0x7D6A;
        a_0.C[0x2877 ^ 0x2803] = 0x284C ^ 0x2803;
        a_0.C[0xC3F5 ^ 0xC3D0] = 0xC3D4 ^ 0xC3D0;
        a_0.C[0xE25 ^ 0xE4B] = 0xFFFFF1FE ^ 0xE4B;
        a_0.C[0xC4C5 ^ 0xC5D0] = 0xFFFF3A49 ^ 0xC5D0;
        a_0.C[0x7BAB ^ 0x7B84] = 0x7BEF ^ 0x7B84;
        a_0.C[0x503C ^ 0x5051] = 0xFFFFAFDF ^ 0x5051;
        a_0.C[0x498A ^ 0x495F] = 0xFFFFB68A ^ 0x495F;
        a_0.C[0xD7DC ^ 0xD7EE] = 0xFFFF2827 ^ 0xD7EE;
        a_0.C[0xA97A ^ 0xA83A] = 0xA848 ^ 0xA83A;
        a_0.C[0x97A4 ^ 0x97B0] = 0xFFFF6800 ^ 0x97B0;
        a_0.C[0xB04 ^ 0xA20] = 0xA22 ^ 0xA20;
        a_0.C[0x2D8D ^ 0x2CE1] = 0x2C96 ^ 0x2CE1;
        a_0.C[0x655 ^ 0x660] = 0x639 ^ 0x660;
        a_0.C[0x629B ^ 0x626C] = 0xFFFF9DA9 ^ 0x626C;
        a_0.C[0x645E ^ 0x6451] = 0xFFFF9BF3 ^ 0x6451;
        a_0.C[0xE85A ^ 0xE8EE] = 0xE8D3 ^ 0xE8EE;
        a_0.C[0x402A ^ 0x411A] = 0xB28 ^ 0x411A;
        a_0.C[0xCBD3 ^ 0xCB41] = 0xCB2B ^ 0xCB41;
        a_0.C[0x208F ^ 0x2004] = 0x2060 ^ 0x2004;
        a_0.C[0xC9EE ^ 0xC8B1] = 0xFFFF3713 ^ 0xC8B1;
        a_0.C[0x5E19 ^ 0x5EDE] = 0x5EE9 ^ 0x5EDE;
        a_0.C[0x1D49 ^ 0x1DF7] = 0x1D8F ^ 0x1DF7;
        a_0.C[0xBCE9 ^ 0xBC0B] = 0xFFFF4396 ^ 0xBC0B;
        a_0.C[0xA332 ^ 0xA343] = 0xFFFF5CD3 ^ 0xA343;
        a_0.C[0xC06B ^ 0xC00C] = 0xFFFF3FF1 ^ 0xC00C;
        a_0.C[0xD3B0 ^ 0xD2A8] = 0xFFFF2D33 ^ 0xD2A8;
        a_0.C[0xE84A ^ 0xE85A] = 0xE81C ^ 0xE85A;
        a_0.C[0xE6E7 ^ 0xE7F5] = 0xFFFF1868 ^ 0xE7F5;
        a_0.C[0x6C11 ^ 0x6CCF] = 0xFFFF9300 ^ 0x6CCF;
        a_0.C[0x4971 ^ 0x49EE] = 0x490C ^ 0x49EE;
        a_0.C[0xCB6D ^ 0xCB27] = 0xCB72 ^ 0xCB27;
        a_0.C[0x5495 ^ 0x55E1] = 0x55E1 ^ 0x55E1;
        a_0.C[0xE817 ^ 0xE89A] = 0xFFFF1734 ^ 0xE89A;
        a_0.C[0x4D7A ^ 0x4C21] = 0x4C06 ^ 0x4C21;
        a_0.C[0x10B0A ^ 0x10B83] = 0xFFFEF460 ^ 0x10B83;
        a_0.C[0xF178 ^ 0xF184] = 0xF181 ^ 0xF184;
        a_0.C[0xFE51 ^ 0xFEB0] = 0xFFFF0164 ^ 0xFEB0;
        a_0.C[0x389C ^ 0x39CB] = 0xFFFFC625 ^ 0x39CB;
        a_0.C[0xFB0A ^ 0xFA6C] = 0xFA63 ^ 0xFA6C;
        a_0.C[0x44FD ^ 0x4413] = 0xFFFFBBDD ^ 0x4413;
        a_0.C[0x9E94 ^ 0x9EB3] = 0x9E92 ^ 0x9EB3;
        a_0.C[0xD685 ^ 0xD627] = 0xD6E5 ^ 0xD627;
        a_0.C[0xD8A2 ^ 0xD995] = 0xD9B6 ^ 0xD995;
        a_0.C[0x361E ^ 0x3757] = 0x3774 ^ 0x3757;
        a_0.C[0x2D2F ^ 0x2C32] = 0x2C21 ^ 0x2C32;
        a_0.C[0x7531 ^ 0x7465] = 0x7424 ^ 0x7465;
        a_0.C[0xF482 ^ 0xF458] = 0xFFFF0BEB ^ 0xF458;
        a_0.C[0x517A ^ 0x5127] = 0xFFFFAE91 ^ 0x5127;
        a_0.C[0xADC ^ 0xA2E] = 0xFFFFF5A3 ^ 0xA2E;
        a_0.C[0x407A ^ 0x401C] = 0x403B ^ 0x401C;
        a_0.C[0x2A6E ^ 0x2A42] = 0xFFFFD5D2 ^ 0x2A42;
        a_0.C[0xCEEC ^ 0xCE4D] = 0xCE02 ^ 0xCE4D;
        a_0.C[0xACCD ^ 0xAC1D] = 0xAC01 ^ 0xAC1D;
        a_0.C[0xF281 ^ 0xF3DC] = 0xF36D ^ 0xF3DC;
        a_0.C[0xA373 ^ 0xA35D] = 0xFFFF5CE6 ^ 0xA35D;
        a_0.C[0x2960 ^ 0x287F] = 0xFFFFD78E ^ 0x287F;
        a_0.C[0xB678 ^ 0xB6DC] = 0xB68B ^ 0xB6DC;
        a_0.C[0xFFC2 ^ 0xFF80] = 0xFFA0 ^ 0xFF80;
        a_0.C[0xAB5C ^ 0xABF5] = 0xABB4 ^ 0xABF5;
        a_0.C[0xA779 ^ 0xA7E3] = 0xA786 ^ 0xA7E3;
        a_0.C[0x6671 ^ 0x6667] = 0xFFFF9999 ^ 0x6667;
        a_0.C[0xA28A ^ 0xA3ED] = 0xFFFF5C13 ^ 0xA3ED;
        a_0.C[0xB39E ^ 0xB2A4] = 0xFFFF4D23 ^ 0xB2A4;
        a_0.C[0x3B07 ^ 0x3B07] = 0x3B4F ^ 0x3B07;
        a_0.C[0xABBD ^ 0xAB57] = 0xFFFF54C1 ^ 0xAB57;
        a_0.C[0x1029A ^ 0x1028F] = 0xFFFEFD7E ^ 0x1028F;
        a_0.C[0xDE49 ^ 0xDE0D] = 0xFFFF21CD ^ 0xDE0D;
        a_0.C[0xCC31 ^ 0xCC77] = 0xFFFF33F9 ^ 0xCC77;
        a_0.C[0x90 ^ 0xE7] = 0xEC ^ 0xE7;
        a_0.C[0x108A0 ^ 0x108C9] = 0xFFFEF71F ^ 0x108C9;
        a_0.C[0x7F67 ^ 0x7FCA] = 0xFFFF803C ^ 0x7FCA;
        a_0.C[0x530B ^ 0x523D] = 0xFFFFAD9E ^ 0x523D;
        a_0.C[0xCEC3 ^ 0xCF4B] = 0x1CF14 ^ 0xCF4B;
        a_0.C[0xC947 ^ 0xC9C1] = 0xFFFF3679 ^ 0xC9C1;
        a_0.C[0xB006 ^ 0xB107] = 0xB149 ^ 0xB107;
        a_0.C[0x109DC ^ 0x109C7] = 0xFFFEF6A7 ^ 0x109C7;
        a_0.C[0xF32E ^ 0xF328] = 0xF30A ^ 0xF328;
        a_0.C[0x4AC8 ^ 0x4BFD] = 0x4BFD ^ 0x4BFD;
        a_0.C[0x685 ^ 0x6C2] = 0x697 ^ 0x6C2;
        a_0.C[0x6809 ^ 0x68BE] = 0x68AA ^ 0x68BE;
        a_0.C[0x8D9F ^ 0x8D7A] = 0xFFFF7281 ^ 0x8D7A;
        a_0.C[0xEA27 ^ 0xEA34] = 0xFFFF1583 ^ 0xEA34;
        a_0.C[0xD82A ^ 0xD85C] = 0xD80A ^ 0xD85C;
        a_0.C[0xE4EC ^ 0xE43B] = 0xE475 ^ 0xE43B;
        a_0.C[0x2DFD ^ 0x2CFF] = 0xFFFFD366 ^ 0x2CFF;
        a_0.C[0xCA30 ^ 0xCA4F] = 0xFFFF35F6 ^ 0xCA4F;
        a_0.C[0xFCA4 ^ 0xFD8E] = 0x3627 ^ 0xFD8E;
        a_0.C[0x1160 ^ 0x11D3] = 0xFFFFEE59 ^ 0x11D3;
        a_0.C[0xDDB9 ^ 0xDCBA] = 0xDCC1 ^ 0xDCBA;
        a_0.C[0x3A7D ^ 0x3B5A] = 0x3E02 ^ 0x3B5A;
        a_0.C[0x1D43 ^ 0x1C3B] = 0x1264 ^ 0x1C3B;
        a_0.C[0xBB8E ^ 0xBB3B] = 0xBB2A ^ 0xBB3B;
        a_0.C[0x5443 ^ 0x549E] = 0xFFFFAB6E ^ 0x549E;
        a_0.C[0x10A6F ^ 0x10BE8] = 0xBB7 ^ 0x10BE8;
        a_0.C[0x21F0 ^ 0x2153] = 0xFFFFDEEC ^ 0x2153;
        a_0.C[0x3DD6 ^ 0x3CC1] = 0xFFFFC319 ^ 0x3CC1;
        a_0.C[0xC5F5 ^ 0xC535] = 0xC52C ^ 0xC535;
        a_0.C[0x7A9B ^ 0x7A21] = 0x7A48 ^ 0x7A21;
        a_0.C[0x7AFC ^ 0x7B89] = 0xC264 ^ 0x7B89;
        a_0.C[0x23D1 ^ 0x22C5] = 0x2244 ^ 0x22C5;
        a_0.C[0xA1B0 ^ 0xA1FB] = 0xA166 ^ 0xA1FB;
        a_0.C[0x8BB5 ^ 0x8AEC] = 0xFFFF757D ^ 0x8AEC;
        a_0.C[0xB168 ^ 0xB060] = 0xB032 ^ 0xB060;
        a_0.C[0x5BE1 ^ 0x5AC3] = 0x5AC2 ^ 0x5AC3;
        a_0.C[0xFCEC ^ 0xFC79] = 0xFFFF039C ^ 0xFC79;
        a_0.C[0x10A89 ^ 0x10A85] = 0x10AC2 ^ 0x10A85;
        a_0.C[0xBC69 ^ 0xBD0B] = 0xBD2E ^ 0xBD0B;
        a_0.C[0x2512 ^ 0x2517] = 0x2548 ^ 0x2517;
        a_0.C[0xCC51 ^ 0xCC39] = 0xCC33 ^ 0xCC39;
        a_0.C[0xBB4D ^ 0xBA48] = 0xBA12 ^ 0xBA48;
        a_0.C[0x3EE7 ^ 0x3E57] = 0x3E4E ^ 0x3E57;
        a_0.C[0xE0D9 ^ 0xE0FF] = 0xE0D4 ^ 0xE0FF;
        a_0.C[0x728C ^ 0x73DD] = 0x73BC ^ 0x73DD;
        a_0.C[0xCD1F ^ 0xCD16] = 0xFFFF32D1 ^ 0xCD16;
        a_0.C[0xFE59 ^ 0xFED7] = 0xFE80 ^ 0xFED7;
        a_0.C[0x9BF ^ 0x8A6] = 0x89B ^ 0x8A6;
        a_0.C[0x942F ^ 0x9497] = 0xFFFF6B38 ^ 0x9497;
        a_0.C[0x8B0 ^ 0x8C9] = 0x89B ^ 0x8C9;
        a_0.C[0x1AC5 ^ 0x1B48] = 0xE92D ^ 0x1B48;
        a_0.C[0x71BE ^ 0x718F] = 0x718C ^ 0x718F;
        a_0.C[0x6464 ^ 0x6450] = 0x6442 ^ 0x6450;
        a_0.C[0x7FEC ^ 0x7F64] = 0xFFFF809D ^ 0x7F64;
        a_0.C[0x5C21 ^ 0x5CD7] = 0x5CA3 ^ 0x5CD7;
        a_0.C[0x49C2 ^ 0x48AD] = 0x48AC ^ 0x48AD;
        a_0.C[0xC23 ^ 0xD6C] = 0xFFFFF282 ^ 0xD6C;
        a_0.C[0x5D1D ^ 0x5C9D] = 0x5B5 ^ 0x5C9D;
        a_0.C[0x107CA ^ 0x1073F] = 0x10705 ^ 0x1073F;
        a_0.C[0x28F3 ^ 0x2972] = 0xFFFF8FF6 ^ 0x2972;
        a_0.C[0x719 ^ 0x7BC] = 0xFFFFF84E ^ 0x7BC;
        a_0.C[0xC715 ^ 0xC7AC] = 0xC7F6 ^ 0xC7AC;
        a_0.C[0xCD4D ^ 0xCD28] = 0xFFFF32DA ^ 0xCD28;
        a_0.C[0x50CB ^ 0x5087] = 0x50E3 ^ 0x5087;
        a_0.C[0xCA21 ^ 0xCB63] = 0xCB52 ^ 0xCB63;
        a_0.C[0xF48D ^ 0xF593] = 0xF591 ^ 0xF593;
        a_0.C[0x100C5 ^ 0x1014A] = 0x586 ^ 0x1014A;
        a_0.C[0x8130 ^ 0x8030] = 0x8003 ^ 0x8030;
        a_0.C[0x546F ^ 0x54D9] = 0xFFFFAB01 ^ 0x54D9;
        a_0.C[0x9EE3 ^ 0x9E10] = 0x9E76 ^ 0x9E10;
        a_0.C[0x4C79 ^ 0x4D52] = 0x78BE ^ 0x4D52;
        a_0.C[0x56B1 ^ 0x5600] = 0x5636 ^ 0x5600;
        a_0.C[0x90A5 ^ 0x9081] = 0xFFFF6F58 ^ 0x9081;
        a_0.C[0x1784 ^ 0x16D8] = 0x16D2 ^ 0x16D8;
        a_0.C[0xA21B ^ 0xA2C8] = 0xFFFF5D44 ^ 0xA2C8;
        a_0.C[0xB7C7 ^ 0xB738] = 0xB759 ^ 0xB738;
        a_0.C[0xB0DB ^ 0xB070] = 0xFFFF4FDD ^ 0xB070;
        a_0.C[0x109BB ^ 0x109E8] = 0xFFFEF61D ^ 0x109E8;
        a_0.C[0x77C ^ 0x72A] = 0xFFFFF8EA ^ 0x72A;
        a_0.C[0x1FFA ^ 0x1F79] = 0xFFFFE09B ^ 0x1F79;
        a_0.C[0x3557 ^ 0x3553] = 0x3558 ^ 0x3553;
        a_0.C[0x10367 ^ 0x102E3] = 0x1E630 ^ 0x102E3;
        a_0.C[0xA586 ^ 0xA51E] = 0xA550 ^ 0xA51E;
        a_0.C[0x2808 ^ 0x2933] = 0xFFFFD6E6 ^ 0x2933;
        a_0.C[0x8E7D ^ 0x8ECF] = 0xFFFF7170 ^ 0x8ECF;
        a_0.C[0xF4A3 ^ 0xF4FA] = 0xF4F6 ^ 0xF4FA;
        a_0.C[0xF4FB ^ 0xF4AE] = 0xF495 ^ 0xF4AE;
        a_0.C[0x247A ^ 0x251A] = 0xFFFFDAC4 ^ 0x251A;
        a_0.C[0x6DBB ^ 0x6DEA] = 0x6DF7 ^ 0x6DEA;
        a_0.C[0xA90B ^ 0xA959] = 0xA95D ^ 0xA959;
        a_0.C[0x1A2B ^ 0x1B1F] = 0xC841 ^ 0x1B1F;
        a_0.C[0x564E ^ 0x57CC] = 0xEE4 ^ 0x57CC;
        a_0.C[0xC78A ^ 0xC725] = 0xFFFF38FB ^ 0xC725;
        a_0.C[0x158C ^ 0x14FF] = 0x14FE ^ 0x14FF;
        a_0.C[0x3976 ^ 0x3905] = 0xFFFFC6C4 ^ 0x3905;
        a_0.C[0x8489 ^ 0x84C0] = 0xFFFF7B0E ^ 0x84C0;
        a_0.C[0xCF0B ^ 0xCFCA] = 0xCFCA ^ 0xCFCA;
        a_0.C[0x2044 ^ 0x211C] = 0x2121 ^ 0x211C;
        a_0.C[0xF8EF ^ 0xF893] = 0xF882 ^ 0xF893;
        a_0.C[0x540F ^ 0x54FF] = 0x54AF ^ 0x54FF;
        a_0.C[0x550E ^ 0x5576] = 0x5550 ^ 0x5576;
        a_0.C[0x5FB9 ^ 0x5F22] = 0x5F6B ^ 0x5F22;
        a_0.C[0xDAEE ^ 0xDBFF] = 0xFFFF2416 ^ 0xDBFF;
        a_0.C[0xA58F ^ 0xA4F0] = 0xFDDF ^ 0xA4F0;
        a_0.C[0xFC17 ^ 0xFD99] = 0xFE9 ^ 0xFD99;
        a_0.C[0x9D38 ^ 0x9D26] = 0xFFFF62ED ^ 0x9D26;
        a_0.C[0x62D9 ^ 0x6291] = 0x62D2 ^ 0x6291;
        a_0.C[0x3528 ^ 0x344B] = 0x34E1 ^ 0x344B;
        a_0.C[0x7F4E ^ 0x7F83] = 0xFFFF805C ^ 0x7F83;
        a_0.C[0x6ED2 ^ 0x6E14] = 0x6E7D ^ 0x6E14;
        a_0.C[0x3D3B ^ 0x3D87] = 0xFFFFC276 ^ 0x3D87;
        a_0.C[0x2786 ^ 0x26F7] = 0x26F7 ^ 0x26F7;
        a_0.C[0x6D96 ^ 0x6D94] = 0x6D8C ^ 0x6D94;
        a_0.C[0x15F7 ^ 0x155F] = 0x1513 ^ 0x155F;
        a_0.C[0x5839 ^ 0x5978] = 0xFFFFA6D1 ^ 0x5978;
        a_0.C[0x1ED9 ^ 0x1F8B] = 0xFFFFE022 ^ 0x1F8B;
        a_0.C[0xC21F ^ 0xC29F] = 0xC2B0 ^ 0xC29F;
        a_0.C[0xC73C ^ 0xC70C] = 0xFFFF38C1 ^ 0xC70C;
        a_0.C[0x9261 ^ 0x925C] = 0x924E ^ 0x925C;
        a_0.C[0x8F89 ^ 0x8F1A] = 0x8F71 ^ 0x8F1A;
        a_0.C[0x7296 ^ 0x727A] = 0xFFFF8DDC ^ 0x727A;
        a_0.C[0x10D8 ^ 0x11F7] = 0xDA07 ^ 0x11F7;
        a_0.C[0x1025B ^ 0x10310] = 0x103B4 ^ 0x10310;
        a_0.C[0x5C07 ^ 0x5D22] = 0x5D22 ^ 0x5D22;
        a_0.C[0xCC9 ^ 0xC6F] = 0xC2F ^ 0xC6F;
        a_0.C[0x12AD ^ 0x1286] = 0xFFFFED4A ^ 0x1286;
        a_0.C[0x3671 ^ 0x3646] = 0xFFFFC9CF ^ 0x3646;
        a_0.C[0x3659 ^ 0x36D6] = 0xFFFFC934 ^ 0x36D6;
        a_0.C[0x546C ^ 0x5438] = 0xFFFFAB9D ^ 0x5438;
        a_0.C[0xDBD ^ 0xDA1] = 0xFFFFF229 ^ 0xDA1;
        a_0.C[0x9DC0 ^ 0x9D18] = 0xFFFF62D8 ^ 0x9D18;
        a_0.C[0xFDB9 ^ 0xFD47] = 0xFFFF029E ^ 0xFD47;
        a_0.C[0x1C54 ^ 0x1C19] = 0x1C2E ^ 0x1C19;
        a_0.C[0x1009D ^ 0x100F9] = 0xFFFEFF1C ^ 0x100F9;
        a_0.C[0xF5FA ^ 0xF515] = 0xF563 ^ 0xF515;
        a_0.C[0xD7FB ^ 0xD71D] = 0xD745 ^ 0xD71D;
        a_0.C[0x6B01 ^ 0x6A88] = 0x16AE5 ^ 0x6A88;
        a_0.C[0x100EC ^ 0x10192] = 0x12E5B ^ 0x10192;
        a_0.C[0x54EC ^ 0x5417] = 0x542E ^ 0x5417;
        a_0.C[0xDC1C ^ 0xDC98] = 0xDCB4 ^ 0xDC98;
        a_0.C[0x3869 ^ 0x3933] = 0x3902 ^ 0x3933;
        a_0.C[0xEA7B ^ 0xEABE] = 0xFFFF151F ^ 0xEABE;
        a_0.C[0x9D33 ^ 0x9DC7] = 0xFFFF624A ^ 0x9DC7;
        a_0.C[0x10036 ^ 0x1010A] = 0xFFFEFEDC ^ 0x1010A;
        a_0.C[0x552C ^ 0x5505] = 0xFFFFAAA7 ^ 0x5505;
        a_0.C[0xF875 ^ 0xF856] = 0xFFFF0795 ^ 0xF856;
        a_0.C[0x2292 ^ 0x2399] = 0xFFFFDCC7 ^ 0x2399;
        a_0.C[0xFA5A ^ 0xFA00] = 0xFA06 ^ 0xFA00;
        a_0.C[0x508E ^ 0x50F3] = 0x50F1 ^ 0x50F3;
        a_0.C[0x7356 ^ 0x739D] = 0xFFFF8C21 ^ 0x739D;
        a_0.C[0x1F50 ^ 0x1FDC] = 0xFFFFE065 ^ 0x1FDC;
        a_0.C[0x3B9 ^ 0x37D] = 0x36E ^ 0x37D;
        a_0.C[0x102A3 ^ 0x103CE] = 0xFFFEFC45 ^ 0x103CE;
        a_0.C[0x648C ^ 0x65E7] = 0x65FA ^ 0x65E7;
        a_0.C[0x8CAA ^ 0x8C42] = 0x8C76 ^ 0x8C42;
        a_0.C[0xC6AB ^ 0xC6F4] = 0xC68C ^ 0xC6F4;
        a_0.C[0x634E ^ 0x6273] = 0x6216 ^ 0x6273;
        a_0.C[0x50E7 ^ 0x51EA] = 0xFFFFAE54 ^ 0x51EA;
        a_0.C[0xD721 ^ 0xD7CA] = 0xD7DE ^ 0xD7CA;
        a_0.C[0x994E ^ 0x9818] = 0x987D ^ 0x9818;
        a_0.C[0xC6B3 ^ 0xC6AE] = 0xFFFF3956 ^ 0xC6AE;
        a_0.C[0xF4E2 ^ 0xF4AC] = 0xF4B3 ^ 0xF4AC;
        a_0.C[0x546B ^ 0x543C] = 0x54AC ^ 0x543C;
        a_0.C[0x79D9 ^ 0x78B8] = 0xFFFF8723 ^ 0x78B8;
        a_0.C[0x3333 ^ 0x3220] = 0x3254 ^ 0x3220;
        a_0.C[0x106C1 ^ 0x10791] = 0xFFFEF812 ^ 0x10791;
        a_0.C[0xA606 ^ 0xA6A1] = 0xA6B3 ^ 0xA6A1;
        a_0.C[0x277C ^ 0x27B4] = 0xFFFFD862 ^ 0x27B4;
        a_0.C[0x68F8 ^ 0x69F4] = 0x6994 ^ 0x69F4;
        a_0.C[0xAC8 ^ 0xBBF] = 0x5EA ^ 0xBBF;
        a_0.C[0xCED6 ^ 0xCFAC] = 0xC1F3 ^ 0xCFAC;
        a_0.C[0xF6C8 ^ 0xF742] = 0x1F71D ^ 0xF742;
        a_0.C[0x43F6 ^ 0x42CE] = 0x4294 ^ 0x42CE;
        a_0.C[0x7546 ^ 0x7475] = 0xB109 ^ 0x7475;
        a_0.C[0xC253 ^ 0xC279] = 0xC2DD ^ 0xC279;
        a_0.C[0x1A83 ^ 0x1BA5] = 0x1BA5 ^ 0x1BA5;
        a_0.C[0x373F ^ 0x3755] = 0xFFFFC898 ^ 0x3755;
        a_0.C[0x3238 ^ 0x33BB] = 0xD763 ^ 0x33BB;
        a_0.C[0x3240 ^ 0x32FB] = 0xFFFFCD43 ^ 0x32FB;
        a_0.C[0x5B04 ^ 0x5B3C] = 0x5B44 ^ 0x5B3C;
        a_0.C[0x751B ^ 0x7400] = 0x7476 ^ 0x7400;
        a_0.C[0x17F3 ^ 0x175F] = 0x176C ^ 0x175F;
        a_0.C[0x102F4 ^ 0x102C2] = 0xFFFEFD1B ^ 0x102C2;
        a_0.C[0x2EEF ^ 0x2F87] = 0x2FB6 ^ 0x2F87;
        a_0.C[0x4863 ^ 0x48BF] = 0x48A2 ^ 0x48BF;
        a_0.C[0xB1FF ^ 0xB190] = 0xFFFF4E4B ^ 0xB190;
        a_0.C[0x108E ^ 0x10EC] = 0xFFFFEF64 ^ 0x10EC;
        a_0.C[0xF32D ^ 0xF200] = 0xA04F ^ 0xF200;
        a_0.C[0x775F ^ 0x767E] = 0x767E ^ 0x767E;
        a_0.C[0x6CF7 ^ 0x6D72] = 0xFFFF765E ^ 0x6D72;
        a_0.C[0xE084 ^ 0xE018] = 0xE071 ^ 0xE018;
        a_0.C[0x827 ^ 0x8F6] = 0xFFFFF717 ^ 0x8F6;
        a_0.C[0xAC2B ^ 0xAD25] = 0xFFFF52B1 ^ 0xAD25;
        a_0.C[0x222C ^ 0x2286] = 0x2289 ^ 0x2286;
        a_0.C[0x18E6 ^ 0x19D4] = 0x2303 ^ 0x19D4;
        a_0.C[0x596A ^ 0x59A4] = 0xFFFFA604 ^ 0x59A4;
        a_0.C[0xAE75 ^ 0xAE05] = 0xFFFF51AA ^ 0xAE05;
        a_0.C[0x68BA ^ 0x69B3] = 0x69A3 ^ 0x69B3;
        a_0.C[0x5951 ^ 0x580F] = 0x583C ^ 0x580F;
        a_0.C[0x1FED ^ 0x1F43] = 0xFFFFE0BA ^ 0x1F43;
        a_0.C[0x27B5 ^ 0x26B1] = 0xFFFFD950 ^ 0x26B1;
        a_0.C[0x3CA0 ^ 0x3C9E] = 0x3CB9 ^ 0x3C9E;
        a_0.C[0x7564 ^ 0x75BB] = 0x75B9 ^ 0x75BB;
        a_0.C[0x9912 ^ 0x9921] = 0x996D ^ 0x9921;
        a_0.C[0xDAC5 ^ 0xDA3C] = 0xDA4C ^ 0xDA3C;
        a_0.C[0xB6B2 ^ 0xB637] = 0xB647 ^ 0xB637;
        a_0.C[0x27D7 ^ 0x2794] = 0x27D4 ^ 0x2794;
        a_0.C[0x1F5C ^ 0x1E14] = 0x1E0D ^ 0x1E14;
        a_0.C[0x323B ^ 0x336E] = 0xFFFFCCA2 ^ 0x336E;
        a_0.C[0x2085 ^ 0x207D] = 0x2056 ^ 0x207D;
        a_0.C[0x3594 ^ 0x359E] = 0x35CD ^ 0x359E;
        a_0.C[0x1456 ^ 0x14B2] = 0x14E3 ^ 0x14B2;
        a_0.C[0x95F5 ^ 0x9512] = 0xFFFF6A83 ^ 0x9512;
        a_0.C[0x7929 ^ 0x7927] = 0x792B ^ 0x7927;
        a_0.C[0x8649 ^ 0x87C2] = 0x75BC ^ 0x87C2;
        a_0.C[0x1F44 ^ 0x1F18] = 0xFFFFE0F2 ^ 0x1F18;
        a_0.C[0x2B3E ^ 0x2B07] = 0x2B02 ^ 0x2B07;
        a_0.C[0xDE59 ^ 0xDE09] = 0xFFFF21D9 ^ 0xDE09;
        a_0.C[0x80FB ^ 0x81B5] = 0xFFFF7EC6 ^ 0x81B5;
        a_0.C[0x76E ^ 0x746] = 0xFFFFF8C4 ^ 0x746;
        a_0.C[0x840B ^ 0x849D] = 0x8409 ^ 0x849D;
        a_0.C[0x5196 ^ 0x51D7] = 0xFFFFAE75 ^ 0x51D7;
        a_0.C[0x3615 ^ 0x372A] = 0x3700 ^ 0x372A;
        a_0.C[0xE1A5 ^ 0xE1FE] = 0xFFFF1E02 ^ 0xE1FE;
        a_0.C[0xD1A0 ^ 0xD0DB] = 0xFF11 ^ 0xD0DB;
        a_0.C[0x764F ^ 0x7631] = 0x765A ^ 0x7631;
        a_0.C[0x2F86 ^ 0x2F87] = 0xFFFFD068 ^ 0x2F87;
        a_0.C[0x4D42 ^ 0x4C48] = 0x4C0B ^ 0x4C48;
        a_0.C[0xE193 ^ 0xE114] = 0xE10E ^ 0xE114;
        a_0.C[0x9EEC ^ 0x9F82] = 0x9F9C ^ 0x9F82;
        a_0.C[0x11FD ^ 0x1094] = 0x10DB ^ 0x1094;
        a_0.C[0x826B ^ 0x8348] = 0x8348 ^ 0x8348;
        a_0.C[0xB5F3 ^ 0xB5E4] = 0xFFFF4A37 ^ 0xB5E4;
        a_0.C[0x981A ^ 0x9879] = 0xFFFF67A0 ^ 0x9879;
        a_0.C[0x7339 ^ 0x73ED] = 0x739A ^ 0x73ED;
        a_0.C[0xCA16 ^ 0xCAEB] = 0xFFFF3535 ^ 0xCAEB;
        a_0.C[0x77E ^ 0x75F] = 0x756 ^ 0x75F;
        a_0.C[0xBEDD ^ 0xBE2C] = 0xBE1C ^ 0xBE2C;
        a_0.C[0xA622 ^ 0xA60F] = 0xFFFF595E ^ 0xA60F;
        a_0.C[0x1A00 ^ 0x1B10] = 0xFFFFE4A5 ^ 0x1B10;
        a_0.C[0xA7A6 ^ 0xA7B4] = 0xA793 ^ 0xA7B4;
        a_0.C[0x5981 ^ 0x58FC] = 0xFFFF88B3 ^ 0x58FC;
        a_0.C[0xC8A5 ^ 0xC8BC] = 0xFFFF3701 ^ 0xC8BC;
        a_0.C[0x1322 ^ 0x1302] = 0x1317 ^ 0x1302;
        a_0.C[0x107D3 ^ 0x107B3] = 0xFFFEF883 ^ 0x107B3;
    }
}

