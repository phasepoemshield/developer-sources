/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01883
 *  minecraft.class03434
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04897
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class06428
 *  minecraft.class06541
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  page.langeweile.ok_zoomer.config.OkZoomerConfigManager
 *  page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen
 *  page.langeweile.ok_zoomer.mixin.common.key_binds.AbstractSelectionListAccessor
 *  page.langeweile.ok_zoomer.mixin.common.key_binds.KeyBindsListAccessor
 *  page.langeweile.ok_zoomer.utils.ModUtils
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01388;
import minecraft.class01402;
import minecraft.class01590;
import minecraft.class01883;
import minecraft.class03434;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04897;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class06428;
import minecraft.class06541;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;
import page.langeweile.ok_zoomer.mixin.common.key_binds.AbstractSelectionListAccessor;
import page.langeweile.ok_zoomer.mixin.common.key_binds.KeyBindsListAccessor;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class class01409
extends class01388 {
    public static final class00392 N = class00392.L((String)"controls.reset");
    private static final int L = 10;
    private final class06428 u;
    private final class00392 i;
    private final class05362 R;
    private final class05362 M;
    private boolean B = false;
    final /* synthetic */ class01402 y;
    private static final class01883 Z = new class01883(ModUtils.id((String)"key_binds/settings"), ModUtils.id((String)"key_binds/settings_selected"));
    private class05362 z;

    class01409(class01402 class014022, class06428 class064282, class00392 class003922) {
        this.y = class014022;
        this.u = class064282;
        this.i = class003922;
        this.R = class05362.method_46430((class00392)class003922, class053622 -> {
            this.y.N.N = class064282;
            this.y.y();
        }).N(0, 0, 75, 20).N(supplier -> {
            if (class064282.W()) {
                return class00392.N((String)"narrator.controls.unbound", (Object[])new Object[]{class003922});
            }
            return class00392.N((String)"narrator.controls.bound", (Object[])new Object[]{class003922, supplier.get()});
        }).N();
        this.M = class05362.method_46430((class00392)N, class053622 -> {
            class064282.y(class064282.E());
            this.y.y();
        }).N(0, 0, 50, 20).N(supplier -> class00392.N((String)"narrator.controls.reset", (Object[])new Object[]{class003922})).N();
        this.N();
        this.N(class014022, class064282, class003922, null);
    }

    private void N(class01402 class014022, class06428 class064282, class00392 class003922, CallbackInfo callbackInfo) {
        if (class064282.U().equals("key.ok_zoomer.zoom") && ((Boolean)OkZoomerConfigManager.CONFIG.tweaks.showSettingsOnKey.value()).booleanValue()) {
            this.z = new class04897(0, 0, 20, 20, Z, class053622 -> ((AbstractSelectionListAccessor)this.y).getMinecraft().N((class05096)new OkZoomerConfigScreen((class05096)((KeyBindsListAccessor)this.y).getKeyBindsScreen())), (class00392)class00392.N((String)"key.ok_zoomer.settings", (Object[])new Object[]{this.i}));
        }
    }

    private void N(class01054 class010542, int n, int n2, boolean bl, float f, CallbackInfo callbackInfo) {
        if (this.z != null) {
            this.z.y(this.R.method_46426() - 25, this.method_73382() - 2);
            this.z.method_25394(class010542, n, n2, f);
        }
    }

    private ImmutableList N(Object object, Object object2, Operation operation) {
        if (this.z != null) {
            return ImmutableList.of((Object)this.z, (Object)object, (Object)object2);
        }
        return (ImmutableList)operation.call(new Object[]{object, object2});
    }

    @Override
    protected void N() {
        this.R.method_25355(this.u.m());
        this.M.field_22763 = !this.u.P();
        this.B = false;
        class05216 class052162 = class00392.i();
        if (!this.u.W()) {
            for (class06428 class064282 : ((class05630)class01402.R((class01402)this.y).i_7).Nn) {
                if (class064282 == this.u || !this.u.y(class064282) || class064282.P() && this.u.P()) continue;
                if (this.B) {
                    class052162.i(", ");
                }
                this.B = true;
                class052162.y((class00392)class00392.L((String)class064282.U()));
            }
        }
        if (this.B) {
            this.R.method_25355((class00392)class00392.y((String)"[ ").y((class00392)this.R.method_25369().L().N(class06541.field_1068)).i(" ]").N(class06541.field_1054));
            this.R.method_47400(class04141.N((class00392)class00392.N((String)"controls.keybinds.duplicateKeybinds", (Object[])new Object[]{class052162})));
        } else {
            this.R.method_47400(null);
        }
        if (this.y.N.N == this.u) {
            this.R.method_25355((class00392)class00392.y((String)"> ").y((class00392)this.R.method_25369().L().N(new class06541[]{class06541.field_1068, class06541.field_1073})).i(" <").N(class06541.field_1054));
        }
    }

    public List<? extends class04654> method_25396() {
        class05362 class053622 = this.M;
        class05362 class053623 = this.R;
        return this.N(class053623, class053622, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.lang.Object, java.lang.Object]");
            return ImmutableList.of((Object)objectArray[0], (Object)objectArray[1]);
        });
    }

    public List<? extends class03434> method_37025() {
        class05362 class053622 = this.M;
        class05362 class053623 = this.R;
        return this.N(class053623, class053622, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.lang.Object, java.lang.Object]");
            return ImmutableList.of((Object)objectArray[0], (Object)objectArray[1]);
        });
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = class01402.L(this.y) - this.M.method_25368() - 10;
        int n4 = this.method_73382() - 2;
        this.M.y(n3, n4);
        this.M.method_25394(class010542, n, n2, f);
        int n5 = n3 - 5 - this.R.method_25368();
        this.R.y(n5, n4);
        this.R.method_25394(class010542, n, n2, f);
        class01590 class015902 = (class01590)class01402.u((class01402)this.y).i_3;
        int n6 = this.method_73380();
        int n7 = this.method_73385();
        Objects.requireNonNull((class01590)class01402.i((class01402)this.y).i_3);
        int n8 = n7 - 4;
        this.N(class010542, n, n2, bl, f, null);
        class010542.y(class015902, this.i, n6, n8, -1);
        if (this.B) {
            int n9 = 3;
            int n10 = this.R.method_46426() - 6;
            class010542.N(n10, this.method_73382() - 1, n10 + 3, this.method_73386(), -256);
        }
    }
}

