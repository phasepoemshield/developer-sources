/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01101
 *  minecraft.class01102
 *  minecraft.class01104
 *  minecraft.class01113
 *  minecraft.class01135
 *  minecraft.class01296
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07209
 *  net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection
 *  net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper
 *  net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package Nursultan;

import minecraft.class01101;
import minecraft.class01102;
import minecraft.class01104;
import minecraft.class01113;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection;
import net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09441<T>
implements class01113,
ToggleableMovementTracker {
    private final T L;
    private long u;
    private class01101<T> i;
    final /* synthetic */ class01104 y;
    private int R;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09441(class01104 class011042, class01135 class011352, long l, class01101 class011012) {
        this.y = class011042;
        this.L = class011352;
        this.u = l;
        this.i = class011012;
        this.N(class011042, class011352, l, class011012, null);
    }

    private void y(CallbackInfo callbackInfo) {
        this.y();
    }

    private void y() {
        if (this.R != 0) {
            ((EntityMovementTrackerSection)this.i).lithium$trackEntityMovement(this.R, ((class07049)this.L).method_73183().N());
        }
    }

    private void N(CallbackInfo callbackInfo) {
        this.y();
    }

    private void N(class07062 class070622, CallbackInfo callbackInfo) {
        this.y();
    }

    public void N() {
        long l = class01296.L((class07209)this.L.method_24515());
        if (l != this.u) {
            class01102 class011022 = this.i.L();
            if (!this.i.y(this.L)) {
                class01104.N.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.L, class01296.N((long)this.u), l});
            }
            this.y.N(this.u, this.i);
            class01101 class011012 = this.y.u.L(l);
            class011012.N(this.L);
            this.y(null);
            this.i = class011012;
            this.u = l;
            this.N(class011022, class011012.L());
        }
        this.N((CallbackInfo)null);
    }

    private void N(class01102 class011022, class01102 class011023) {
        class01102 class011024;
        class01102 class011025 = class01104.N(this.L, (class01102)class011022);
        if (class011025 == (class011024 = class01104.N(this.L, (class01102)class011023))) {
            if (class011024.y()) {
                this.y.L.N(this.L);
            }
            return;
        }
        boolean bl = class011025.y();
        boolean bl2 = class011024.y();
        if (bl && !bl2) {
            this.y.i(this.L);
        } else if (!bl && bl2) {
            this.y.u(this.L);
        }
        boolean bl3 = class011025.N();
        boolean bl4 = class011024.N();
        if (bl3 && !bl4) {
            this.y.L(this.L);
        } else if (!bl3 && bl4) {
            this.y.y(this.L);
        }
        if (bl2) {
            this.y.L.N(this.L);
        }
    }

    public void N(class07062 class070622) {
        class01102 class011022;
        this.N(class070622, null);
        if (!this.i.y(this.L)) {
            class01104.N.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.L, class01296.N((long)this.u), class070622});
        }
        if ((class011022 = class01104.N(this.L, (class01102)this.i.L())).N()) {
            this.y.L(this.L);
        }
        if (class011022.y()) {
            this.y.i(this.L);
        }
        if (class070622.N()) {
            this.y.L.R(this.L);
        }
        this.y.y.remove(this.L.method_5667());
        this.L.method_31744(N);
        this.y.N(this.u, this.i);
    }

    private void N(class01104 class011042, class01135 class011352, long l, class01101 class011012, CallbackInfo callbackInfo) {
        this.R = MovementTrackerHelper.getNotificationMask((class07049)((class07049)this.L));
        this.y();
    }

    public int lithium$setNotificationMask(int n) {
        int n2 = this.R;
        this.R = n;
        return n2;
    }
}

