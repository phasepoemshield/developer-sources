/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class04993
 *  minecraft.class04994
 *  minecraft.class05015
 *  minecraft.class05028
 *  minecraft.class05029
 *  minecraft.class05035
 *  minecraft.class05474
 *  minecraft.class07209
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class04993;
import minecraft.class04994;
import minecraft.class05015;
import minecraft.class05028;
import minecraft.class05029;
import minecraft.class05035;
import minecraft.class05474;
import minecraft.class05785;
import minecraft.class07209;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05795
implements class05029 {
    public static final int y = 1;
    public static final class05795 L = new class05795();
    protected final class05474 u;
    private final @Nullable class05015<?, ?> N;
    private final @Nullable class05015<?, ?> i;

    public int L() {
        return this.u.method_32890() + 2;
    }

    public class05795(class00538 class005382, boolean bl, boolean bl2) {
        this.u = class005382.i();
        this.N = bl ? new class05028(class005382) : null;
        this.i = bl2 ? new class05785(class005382) : null;
    }

    private class05795() {
        this.u = class05474.L((int)0, (int)0);
        this.N = null;
        this.i = null;
    }

    public int i() {
        return this.u() + this.L();
    }

    public int u() {
        return this.u.method_32891() - 1;
    }

    public void y(class07321 class073212, boolean bl) {
        if (this.N != null) {
            this.N.y(class073212, bl);
        }
        if (this.i != null) {
            this.i.y(class073212, bl);
        }
    }

    public class04993 y(class00772 class007722, class01296 class012962) {
        if (class007722 == class00772.field_9282) {
            if (this.N != null) {
                return this.N.L(class012962.W());
            }
        } else if (this.i != null) {
            return this.i.L(class012962.W());
        }
        return class04993.field_44724;
    }

    public void y(class07321 class073212) {
        if (this.N != null) {
            this.N.y(class073212);
        }
        if (this.i != null) {
            this.i.y(class073212);
        }
    }

    public int N() {
        int n = 0;
        if (this.N != null) {
            n += this.N.N();
        }
        if (this.i != null) {
            n += this.i.N();
        }
        int n2 = n;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, n2);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return n2;
    }

    public boolean N(long l) {
        return this.N == null || this.N.R.U(l) && (this.i == null || this.i.R.U(l));
    }

    public void N(class01296 class012962, boolean bl) {
        if (this.N != null) {
            this.N.N(class012962, bl);
        }
        if (this.i != null) {
            this.i.N(class012962, bl);
        }
    }

    public void N(class07209 class072092) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class072092, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (this.N != null) {
            this.N.N(class072092);
        }
        if (this.i != null) {
            this.i.N(class072092);
        }
    }

    public void N(class07209 class072092, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().renderSettings.lightUpdates) {
            callbackInfo.cancel();
        }
    }

    public void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (!SodiumExtraClientMod.options().renderSettings.lightUpdates) {
            callbackInfoReturnable.setReturnValue((Object)0);
        }
    }

    public class05035 N(class00772 class007722) {
        if (class007722 == class00772.field_9282) {
            if (this.N == null) {
                return class04994.field_15812;
            }
            return this.N;
        }
        if (this.i == null) {
            return class04994.field_15812;
        }
        return this.i;
    }

    public String N(class00772 class007722, class01296 class012962) {
        if (class007722 == class00772.field_9282) {
            if (this.N != null) {
                return this.N.y(class012962.W());
            }
        } else if (this.i != null) {
            return this.i.y(class012962.W());
        }
        return "n/a";
    }

    public void N(class00772 class007722, class01296 class012962, @Nullable class00536 class005362) {
        if (class007722 == class00772.field_9282) {
            if (this.N != null) {
                this.N.N(class012962.W(), class005362);
            }
        } else if (this.i != null) {
            this.i.N(class012962.W(), class005362);
        }
    }

    public void N(class07321 class073212, boolean bl) {
        if (this.N != null) {
            this.N.N(class073212, bl);
        }
        if (this.i != null) {
            this.i.N(class073212, bl);
        }
    }

    public int N(class07209 class072092, int n) {
        int n2 = this.i == null ? 0 : this.i.L(class072092) - n;
        return Math.max(this.N == null ? 0 : this.N.L(class072092), n2);
    }

    public boolean au_() {
        if (this.i != null && this.i.au_()) {
            return true;
        }
        return this.N != null && this.N.au_();
    }
}

