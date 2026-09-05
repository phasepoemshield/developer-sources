/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09678
 *  Nursultan.class09690
 *  Nursultan.class10565
 *  Nursultan.class11286
 *  Nursultan.class11376
 *  Nursultan.class11381
 *  Nursultan.class11388
 *  Nursultan.class11389
 *  Nursultan.class11399
 *  Nursultan.class11938
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalDoubleRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef
 *  com.viaversion.viafabricplus.features.mouse_sensitivity.MouseSensitivity1_13_2
 *  com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  de.maxhenkel.voicechat.events.InputEvents
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$MouseEvent
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01590
 *  minecraft.class02111
 *  minecraft.class02419
 *  minecraft.class02742
 *  minecraft.class04370
 *  minecraft.class04453
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class04671
 *  minecraft.class04674
 *  minecraft.class04995
 *  minecraft.class05016
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06132
 *  minecraft.class06428
 *  minecraft.class06595
 *  minecraft.class06604
 *  minecraft.class06613
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07536
 *  minecraft.class07878
 *  minecraft.class08044
 *  minecraft.class08764
 *  minecraft.class08844
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseScroll
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseScroll
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseScroll
 *  org.joml.Vector2i
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFWDropCallback
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes
 *  page.langeweile.ok_zoomer.config.ConfigEnums$ZoomModes
 *  page.langeweile.ok_zoomer.config.OkZoomerConfigManager
 *  page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds
 *  page.langeweile.ok_zoomer.utils.ZoomUtils
 *  page.langeweile.ok_zoomer.zoom.Zoom
 */
package minecraft;

import Nursultan.class09678;
import Nursultan.class09690;
import Nursultan.class10565;
import Nursultan.class11286;
import Nursultan.class11376;
import Nursultan.class11381;
import Nursultan.class11388;
import Nursultan.class11389;
import Nursultan.class11399;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalDoubleRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef;
import com.viaversion.viafabricplus.features.mouse_sensitivity.MouseSensitivity1_13_2;
import com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.maxhenkel.voicechat.events.InputEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01590;
import minecraft.class02111;
import minecraft.class02419;
import minecraft.class02742;
import minecraft.class04370;
import minecraft.class04453;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class04671;
import minecraft.class04674;
import minecraft.class04995;
import minecraft.class05016;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06132;
import minecraft.class06194;
import minecraft.class06202;
import minecraft.class06428;
import minecraft.class06595;
import minecraft.class06604;
import minecraft.class06613;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07536;
import minecraft.class07878;
import minecraft.class08044;
import minecraft.class08764;
import minecraft.class08844;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import page.langeweile.ok_zoomer.config.ConfigEnums;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

@Environment(value=EnvType.CLIENT)
public class class06220
implements IMouseKeyboardHandlers {
    private static Logger L = LoggerFactory.getLogger((String)"minecraft.class06220");
    public static final long N = 250L;
    private final class06202 u;
    private boolean i;
    private boolean R;
    private boolean M;
    private double B;
    private double Z;
    private @Nullable class06194 z;
    protected int y;
    private int U;
    private @Nullable class06595 E = null;
    private boolean W = true;
    private int m;
    private double P;
    private final class05016 s;
    private final class05016 T;
    private double b;
    private double j;
    private final class02419 v;
    private double n;
    private boolean t;
    private final Queue G = new ConcurrentLinkedQueue();

    private void L(long l, class06595 class065952, int n, CallbackInfo callbackInfo) {
        ((ClientCompatibilityManager.MouseEvent)InputEvents.MOUSE_KEY.invoker()).onMouseEvent(class065952, n);
    }

    public boolean L() {
        return this.R;
    }

    public double L(class08844 class088442) {
        return class06220.y(class088442, this.Z);
    }

    public void M() {
        this.W = true;
    }

    public class06220(class06202 class062022) {
        this.s = new class05016();
        this.T = new class05016();
        this.n = Double.MIN_VALUE;
        this.u = class062022;
        this.v = new class02419();
    }

    public boolean B() {
        return this.t;
    }

    public void Z() {
        if (!this.u.y()) {
            return;
        }
        if (this.t) {
            return;
        }
        if (class06604.u) {
            class06428.N();
        }
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.t = true;
        this.B = this.u.Nt().W() / 2;
        this.Z = this.u.Nt().m() / 2;
        class04655.N((class08844)this.u.Nt(), (int)212995, (double)this.B, (double)this.Z);
        this.u.N((class05096)null);
        this.u.M_5 = 10000;
        this.W = true;
    }

    public double i() {
        return this.B;
    }

    public void U() {
        this.W = true;
    }

    public void z() {
        if (!this.t) {
            return;
        }
        this.t = false;
        this.B = this.u.Nt().W() / 2;
        this.Z = this.u.Nt().m() / 2;
        class04655.N((class08844)this.u.Nt(), (int)212993, (double)this.B, (double)this.Z);
    }

    public boolean u() {
        return this.M;
    }

    private void y(long l, class06595 class065952, int n, CallbackInfo callbackInfo) {
        if (((Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.zoomScrolling.value()).booleanValue()) {
            if (OkZoomerConfigManager.CONFIG.controls.zoomMode.value() == ConfigEnums.ZoomModes.PERSISTENT && !ZoomKeyBinds.ZOOM_KEY.R()) {
                return;
            }
            if (class065952.v() == 2 && n == 1 && Zoom.isZooming() && ((Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.resetZoomWithMouse.value()).booleanValue()) {
                ZoomUtils.resetZoomDivisor((boolean)true);
                callbackInfo.cancel();
            }
        }
    }

    private boolean y(class05096 class050962, class06613 class066132, double d, double d2, Operation operation) {
        class09690 class096902 = class09690.N((int)class066132.v());
        if (class096902 != null && class09678.L((class05096)class050962, (double)class066132.n(), (double)class066132.t(), (class09690)class096902)) {
            return true;
        }
        return (Boolean)operation.call(new Object[]{class050962, class066132, d, d2});
    }

    public boolean y() {
        return this.i;
    }

    private void y(long l, double d, double d2) {
        if (l != this.u.Nt().B()) {
            return;
        }
        if (this.W) {
            this.B = d;
            this.Z = d2;
            this.W = false;
            return;
        }
        if (this.u.y()) {
            this.b += d - this.B;
            this.j += d2 - this.Z;
        }
        this.B = d;
        this.Z = d2;
    }

    public double y(class08844 class088442) {
        return class06220.N(class088442, this.B);
    }

    public static double y(class08844 class088442, double d) {
        return d * (double)class088442.s() / (double)class088442.m();
    }

    public Queue viaFabricPlus$getPendingScreenEvents() {
        return this.G;
    }

    private void N(CallbackInfo callbackInfo, int n) {
        if (n != 0 && ((Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.zoomScrolling.value()).booleanValue()) {
            if (((ConfigEnums.ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).equals((Object)ConfigEnums.ZoomModes.PERSISTENT) && !ZoomKeyBinds.ZOOM_KEY.R()) {
                return;
            }
            if (Zoom.isZooming()) {
                ZoomUtils.changeZoomDivisor((n > 0 ? 1 : 0) != 0);
                callbackInfo.cancel();
            }
        }
    }

    private void N(double d, CallbackInfo callbackInfo, LocalDoubleRef localDoubleRef, LocalDoubleRef localDoubleRef2, LocalDoubleRef localDoubleRef3) {
        if (Zoom.isModifierActive()) {
            double d2 = localDoubleRef3.get();
            double d3 = Zoom.getTransitionMode().getInternalMultiplier();
            localDoubleRef.set(Zoom.getMouseModifier().applyXModifier(localDoubleRef.get(), d2, d, d3));
            localDoubleRef2.set(Zoom.getMouseModifier().applyYModifier(localDoubleRef2.get(), d2, d, d3));
        }
    }

    private void N(class06202 class062022, Runnable runnable) {
        if (this.u.NE() != null && (class05096)this.u.v_3 != null && DebugSettings.INSTANCE.executeInputsSynchronously.isEnabled()) {
            this.G.offer(runnable);
        } else {
            class062022.execute(runnable);
        }
    }

    private void N(class08044 class080442, int n, Operation operation) {
        class11399 class113992 = class11399.N((int)n);
        class11938.L().L((Object)class113992);
        if (class113992.y()) {
            operation.call(new Object[]{class080442, class080442.N()});
            return;
        }
        operation.call(new Object[]{class080442, class113992.L()});
    }

    private void N(double d, CallbackInfo callbackInfo, double d2, LocalDoubleRef localDoubleRef) {
        localDoubleRef.set(d2);
    }

    public void N(class08844 class088442) {
        class04655.N((class08844)class088442, (l, d, d2) -> this.u.execute(() -> this.y(l, d, d2)), (l, n, n2, n3) -> {
            class06595 class065952 = new class06595(n, n3);
            Runnable runnable = () -> this.N(l, class065952, n2);
            class06202 class062022 = this.u;
            this.N(class062022, runnable);
        }, (l, d, d2) -> {
            Runnable runnable = () -> this.N(l, d, d2);
            class06202 class062022 = this.u;
            this.N(class062022, runnable);
        }, (l, n, l2) -> {
            int n2;
            ArrayList<Path> arrayList = new ArrayList<Path>(n);
            int n3 = 0;
            for (n2 = 0; n2 < n; ++n2) {
                String string = GLFWDropCallback.getName((long)l2, (int)n2);
                try {
                    arrayList.add(Paths.get(string, new String[0]));
                    continue;
                }
                catch (InvalidPathException invalidPathException) {
                    ++n3;
                    L.error("Failed to parse path '{}'", (Object)string, (Object)invalidPathException);
                }
            }
            if (!arrayList.isEmpty()) {
                n2 = n3;
                this.u.execute(() -> this.N(l, arrayList, n2));
            }
        });
    }

    private boolean N(boolean bl) {
        block3: {
            switch (class10565.N[((ConfigEnums.SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()).ordinal()]) {
                case 1: 
                case 2: {
                    break;
                }
                default: {
                    break block3;
                }
            }
            return false;
        }
        return bl;
    }

    public void N(class07074 class070742, class08844 class088442) {
        class070742.N("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%f, %f). Absolute: (%f, %f)", class06220.N(class088442, this.B), class06220.y(class088442, this.Z), this.B, this.Z));
        class070742.N("Screen size", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", class088442.P(), class088442.s(), class088442.U(), class088442.E(), class088442.j()));
    }

    private class06595 N(class06595 class065952, boolean bl) {
        if (class06604.L && class065952.v() == 0) {
            if (bl) {
                if ((class065952.y() & 2) == 2) {
                    ++this.U;
                    return new class06595(1, class065952.y());
                }
            } else if (this.U > 0) {
                --this.U;
                return new class06595(1, class065952.y());
            }
        }
        return class065952;
    }

    private void N(long l, class06595 class065952, int n) {
        class06595 class065953;
        boolean bl;
        block27: {
            this.L(l, class065952, n, null);
            class08844 class088442 = this.u.Nt();
            if (l != class088442.B()) {
                return;
            }
            this.u.NG().u();
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(l, class065952, n, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            if ((class05096)this.u.v_3 != null) {
                this.u.N(class02111.field_41778);
            }
            bl = n == 1;
            class065953 = this.N(class065952, bl);
            if (bl) {
                if (((Boolean)((class05630)this.u.i_7).Nm().method_41753()).booleanValue() && this.m++ > 0) {
                    return;
                }
                this.E = class065953;
                this.P = class04674.y();
            } else if (this.E != null) {
                if (((Boolean)((class05630)this.u.i_7).Nm().method_41753()).booleanValue() && --this.m > 0) {
                    return;
                }
                this.E = null;
            }
            if (this.u.NZ() == null) {
                if ((class05096)this.u.v_3 == null) {
                    if (!this.t && bl) {
                        this.Z();
                    }
                } else {
                    double d = this.y(class088442);
                    double d2 = this.L(class088442);
                    class05096 class050962 = (class05096)this.u.v_3;
                    class06613 class066132 = new class06613(d, d2, class065953);
                    if (bl) {
                        class050962.method_37069();
                        try {
                            boolean bl2;
                            long l2 = class07536.L();
                            boolean bl3 = bl2 = this.z != null && l2 - this.z.N() < 250L && this.z.y() == class050962 && this.y == class066132.v();
                            class06613 class066133 = class066132;
                            class05096 class050963 = class050962;
                            if (this.N(class050963, class066133, bl3, objectArray -> {
                                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_437, net.minecraft.class_11909, boolean]");
                                Object[] objectArray2 = objectArray;
                                return ((class05096)objectArray[0]).method_25402((class06613)objectArray2[1], ((Boolean)objectArray2[2]).booleanValue());
                            })) {
                                this.z = new class06194(l2, class050962);
                                this.y = class065953.v();
                                return;
                            }
                            break block27;
                        }
                        catch (Throwable throwable) {
                            class07080 class070802 = class07080.N((Throwable)throwable, (String)"mouseClicked event handler");
                            class050962.method_65027(class070802);
                            class07074 class070742 = class070802.N("Mouse");
                            this.N(class070742, class088442);
                            class070742.N("Button", (Object)class066132.v());
                            throw new class07878(class070802);
                        }
                    }
                    try {
                        class06613 class066134 = class066132;
                        class05096 class050964 = class050962;
                        if (this.N(class050964, class066134, objectArray -> {
                            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_437, net.minecraft.class_11909]");
                            return ((class05096)objectArray[0]).method_25406((class06613)objectArray[1]);
                        })) {
                            return;
                        }
                    }
                    catch (Throwable throwable) {
                        class07080 class070803 = class07080.N((Throwable)throwable, (String)"mouseReleased event handler");
                        class050962.method_65027(class070803);
                        class07074 class070743 = class070803.N("Mouse");
                        this.N(class070743, class088442);
                        class070743.N("Button", (Object)class066132.v());
                        throw new class07878(class070803);
                    }
                }
            }
        }
        if ((class05096)this.u.v_3 == null && this.u.NZ() == null) {
            if (class065953.v() == 0) {
                this.i = bl;
            } else if (class065953.v() == 2) {
                this.R = bl;
            } else if (class065953.v() == 1) {
                this.M = bl;
            }
            class04671 class046712 = class04648.field_1672.N(class065953.v());
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.y(l, class065952, n, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class06428.N((class04671)class046712, (boolean)bl);
            if (bl) {
                class06428.N((class04671)class046712);
            }
        }
    }

    private Object N(class04370 class043702, Operation operation) {
        Double d = (Double)operation.call(new Object[]{class043702});
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            return (double)MouseSensitivity1_13_2.get1_13SliderValue((float)d.floatValue()).keyFloat();
        }
        return d;
    }

    private void N(long l, List<Path> list, int n) {
        this.u.NG().u();
        if ((class05096)this.u.v_3 != null) {
            ((class05096)this.u.v_3).method_29638(list);
        }
        if (n > 0) {
            class06132.N((class06202)this.u, (int)n);
        }
    }

    private void N(long l, double d, double d2) {
        if (l == this.u.Nt().B()) {
            class02742 class027422 = this.u.NG();
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(l, d, d2, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class027422.u();
            boolean bl = (Boolean)((class05630)this.u.i_7).NM().method_41753();
            double d3 = (Double)((class05630)this.u.i_7).p().method_41753();
            double d4 = (bl ? Math.signum(d) : d) * d3;
            double d5 = (bl ? Math.signum(d2) : d2) * d3;
            if (this.u.NZ() == null) {
                if ((class05096)this.u.v_3 != null) {
                    double d6 = this.y(this.u.Nt());
                    double d7 = this.L(this.u.Nt());
                    double d8 = d5;
                    double d9 = d4;
                    double d10 = d7;
                    double d11 = d6;
                    class05096 class050962 = (class05096)this.u.v_3;
                    this.N(class050962, d11, d10, d9, d8, objectArray -> {
                        WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[net.minecraft.class_437, double, double, double, double]");
                        return ((class05096)objectArray[0]).method_25401(((Double)objectArray[1]).doubleValue(), ((Double)objectArray[2]).doubleValue(), ((Double)objectArray[3]).doubleValue(), ((Double)objectArray[4]).doubleValue());
                    });
                    ((class05096)this.u.v_3).method_37069();
                } else if ((class04453)this.u.T_4 != null) {
                    Vector2i vector2i = this.v.N(d4, d5);
                    if (vector2i.x == 0 && vector2i.y == 0) {
                        return;
                    }
                    int n = vector2i.y == 0 ? -vector2i.x : vector2i.y;
                    class04453 class044532 = (class04453)this.u.T_4;
                    CallbackInfo callbackInfo2 = new CallbackInfo("", true);
                    this.N(callbackInfo2, n);
                    if (callbackInfo2.isCancelled()) {
                        return;
                    }
                    if (class044532.method_7325()) {
                        if (((class01056)this.u.i_6).B().N()) {
                            ((class01056)this.u.i_6).B().y(-n);
                        } else {
                            float f = class04995.N((float)(((class04453)this.u.T_4).method_31549().N() + (float)vector2i.y * 0.005f), (float)0.0f, (float)0.2f);
                            ((class04453)this.u.T_4).method_31549().N(f);
                        }
                    } else {
                        class08044 class080442 = ((class04453)this.u.T_4).method_31548();
                        int n2 = class02419.N((double)n, (int)class080442.N(), (int)class08044.L());
                        class08044 class080443 = class080442;
                        this.N(class080443, n2, objectArray -> {
                            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1661, int]");
                            ((class08044)objectArray[0]).N(((Integer)objectArray[1]).intValue());
                            return null;
                        });
                    }
                }
            }
        }
    }

    private void N(double d) {
        double d2;
        double d3;
        LocalDoubleRefImpl localDoubleRefImpl = new LocalDoubleRefImpl();
        localDoubleRefImpl.init(0.0);
        class04370 class043702 = ((class05630)this.u.i_7).u();
        double d4 = (Double)this.N(class043702, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_7172]");
            return ((class04370)objectArray[0]).method_41753();
        }) * (double)0.6f + (double)0.2f;
        double d5 = d4 * d4 * d4;
        double d6 = d5 * 8.0;
        class05630 class056302 = (class05630)this.u.i_7;
        this.N(d, null, d6, (LocalDoubleRef)localDoubleRefImpl);
        if (class056302.Nd) {
            double d7 = this.s.N(this.b * d6, d * d6);
            double d8 = this.T.N(this.j * d6, d * d6);
            d3 = d7;
            d2 = d8;
        } else if (((class05630)this.u.i_7).NS().N() && this.N(((class04453)this.u.T_4).method_31550())) {
            this.s.N();
            this.T.N();
            d3 = this.b * d5;
            d2 = this.j * d5;
        } else {
            this.s.N();
            this.T.N();
            d3 = this.b * d6;
            d2 = this.j * d6;
        }
        class08764 class087642 = this.u.yT();
        double d9 = d3;
        double d10 = d2;
        LocalDoubleRefImpl localDoubleRefImpl2 = new LocalDoubleRefImpl();
        LocalDoubleRefImpl localDoubleRefImpl3 = new LocalDoubleRefImpl();
        localDoubleRefImpl2.init(d3);
        localDoubleRefImpl3.init(d2);
        this.N(d, null, (LocalDoubleRef)localDoubleRefImpl2, (LocalDoubleRef)localDoubleRefImpl3, (LocalDoubleRef)localDoubleRefImpl);
        d2 = localDoubleRefImpl3.dispose();
        d3 = localDoubleRefImpl2.dispose();
        class087642.N(d9, d10);
        if ((class04453)this.u.T_4 != null) {
            ((class04453)this.u.T_4).method_5872((Boolean)((class05630)this.u.i_7).Ni().method_41753() != false ? -d3 : d3, (Boolean)((class05630)this.u.i_7).NR().method_41753() != false ? -d2 : d2);
        }
    }

    public static double N(class08844 class088442, double d) {
        return d * (double)class088442.P() / (double)class088442.W();
    }

    public void N() {
        double d = class04674.y();
        double d2 = d - this.n;
        this.n = d;
        if (this.u.y()) {
            boolean bl;
            class05096 class050962 = (class05096)this.u.v_3;
            boolean bl2 = bl = this.b != 0.0 || this.j != 0.0;
            if (bl) {
                this.u.NG().u();
            }
            if (class050962 != null && this.u.NZ() == null && bl) {
                class08844 class088442 = this.u.Nt();
                double d3 = this.y(class088442);
                double d4 = this.L(class088442);
                try {
                    class050962.method_16014(d3, d4);
                }
                catch (Throwable throwable) {
                    class07080 class070802 = class07080.N((Throwable)throwable, (String)"mouseMoved event handler");
                    class050962.method_65027(class070802);
                    class07074 class070742 = class070802.N("Mouse");
                    this.N(class070742, class088442);
                    throw new class07878(class070802);
                }
                if (this.E != null && this.P > 0.0) {
                    double d5 = class06220.N(class088442, this.b);
                    double d6 = class06220.y(class088442, this.j);
                    try {
                        double d7 = d6;
                        double d8 = d5;
                        class06613 class066132 = new class06613(d3, d4, this.E);
                        class05096 class050963 = class050962;
                        Operation operation = objectArray -> {
                            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_437, net.minecraft.class_11909, double, double]");
                            return ((class05096)objectArray[0]).method_25403((class06613)objectArray[1], ((Double)objectArray[2]).doubleValue(), ((Double)objectArray[3]).doubleValue());
                        };
                        this.y(class050963, class066132, d8, d7, objectArray -> {
                            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_437, net.minecraft.class_11909, double, double]");
                            return this.N((class05096)objectArray[0], (class06613)objectArray[1], (Double)objectArray[2], (Double)objectArray[3], operation);
                        });
                    }
                    catch (Throwable throwable) {
                        class07080 class070803 = class07080.N((Throwable)throwable, (String)"mouseDragged event handler");
                        class050962.method_65027(class070803);
                        class07074 class070743 = class070803.N("Mouse");
                        this.N(class070743, class088442);
                        throw new class07878(class070803);
                    }
                }
                class050962.method_37068();
            }
            if (this.B() && (class04453)this.u.T_4 != null) {
                this.N(d2);
            }
        }
        this.b = 0.0;
        this.j = 0.0;
    }

    private boolean N(class05096 class050962, class06613 class066132, boolean bl, Operation operation) {
        if (class050962 != null) {
            if (!((ScreenMouseEvents.AllowMouseClick)ScreenMouseEvents.allowMouseClick((class05096)class050962).invoker()).allowMouseClick(class050962, class066132)) {
                return true;
            }
            ((ScreenMouseEvents.BeforeMouseClick)ScreenMouseEvents.beforeMouseClick((class05096)class050962).invoker()).beforeMouseClick(class050962, class066132);
        }
        boolean bl2 = (Boolean)operation.call(new Object[]{class050962, class066132, bl});
        if (class050962 != null) {
            bl2 |= ((ScreenMouseEvents.AfterMouseClick)ScreenMouseEvents.afterMouseClick((class05096)class050962).invoker()).afterMouseClick(class050962, class066132, bl2);
        }
        return bl2;
    }

    public void N(class01590 class015902, class01054 class010542) {
        class08844 class088442 = this.u.Nt();
        double d = this.y(class088442);
        double d2 = this.L(class088442) - 8.0;
        String string = String.format(Locale.ROOT, "%.0f,%.0f", d, d2);
        class010542.y(class015902, string, (int)d, (int)d2, -1);
    }

    private boolean N(class05096 class050962, double d, double d2, double d3, double d4, Operation operation) {
        if (class050962 != null) {
            if (!((ScreenMouseEvents.AllowMouseScroll)ScreenMouseEvents.allowMouseScroll((class05096)class050962).invoker()).allowMouseScroll(class050962, d, d2, d3, d4)) {
                return true;
            }
            ((ScreenMouseEvents.BeforeMouseScroll)ScreenMouseEvents.beforeMouseScroll((class05096)class050962).invoker()).beforeMouseScroll(class050962, d, d2, d3, d4);
        }
        boolean bl = (Boolean)operation.call(new Object[]{class050962, d, d2, d3, d4});
        if (class050962 != null) {
            bl |= ((ScreenMouseEvents.AfterMouseScroll)ScreenMouseEvents.afterMouseScroll((class05096)class050962).invoker()).afterMouseScroll(class050962, d, d2, d3, d4, bl);
        }
        return bl;
    }

    private void N(long l, class06595 class065952, int n, CallbackInfo callbackInfo) {
        class11389 class113892 = class11389.N((int)class065952.v(), (int)class065952.y(), (int)0, (class11286)class11286.N((int)n), (class11381)class11381.MOUSE);
        class11938.L().L((Object)class113892);
        if (class113892.y()) {
            callbackInfo.cancel();
        }
    }

    private void N(long l, double d, double d2, CallbackInfo callbackInfo) {
        class11376 class113762 = class11376.N((double)d2, (double)d);
        class11938.L().L((Object)class113762);
        if (class113762.y()) {
            callbackInfo.cancel();
        }
    }

    private void N(CallbackInfo callbackInfo) {
        class11388 class113882 = class11388.L();
        class11938.L().L((Object)class113882);
        if (class113882.y()) {
            callbackInfo.cancel();
        }
    }

    private boolean N(class05096 class050962, class06613 class066132, double d, double d2, Operation operation) {
        if (class050962 != null) {
            if (!((ScreenMouseEvents.AllowMouseDrag)ScreenMouseEvents.allowMouseDrag((class05096)class050962).invoker()).allowMouseDrag(class050962, class066132, d, d2)) {
                return true;
            }
            ((ScreenMouseEvents.BeforeMouseDrag)ScreenMouseEvents.beforeMouseDrag((class05096)class050962).invoker()).beforeMouseDrag(class050962, class066132, d, d2);
        }
        boolean bl = (Boolean)operation.call(new Object[]{class050962, class066132, d, d2});
        if (class050962 != null) {
            bl |= ((ScreenMouseEvents.AfterMouseDrag)ScreenMouseEvents.afterMouseDrag((class05096)class050962).invoker()).afterMouseDrag(class050962, class066132, d, d2, bl);
        }
        return bl;
    }

    private boolean N(class05096 class050962, class06613 class066132, Operation operation) {
        if (class050962 != null) {
            if (!((ScreenMouseEvents.AllowMouseRelease)ScreenMouseEvents.allowMouseRelease((class05096)class050962).invoker()).allowMouseRelease(class050962, class066132)) {
                return true;
            }
            ((ScreenMouseEvents.BeforeMouseRelease)ScreenMouseEvents.beforeMouseRelease((class05096)class050962).invoker()).beforeMouseRelease(class050962, class066132);
        }
        boolean bl = (Boolean)operation.call(new Object[]{class050962, class066132});
        if (class050962 != null) {
            bl |= ((ScreenMouseEvents.AfterMouseRelease)ScreenMouseEvents.afterMouseRelease((class05096)class050962).invoker()).afterMouseRelease(class050962, class066132, bl);
        }
        return bl;
    }

    public double R() {
        return this.Z;
    }
}

