/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class01099
 *  minecraft.class01118
 *  minecraft.class04643
 *  minecraft.class04763
 *  minecraft.class04782
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07878
 *  minecraft.class08055
 *  minecraft.class08057
 *  minecraft.class08072
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache
 *  net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce
 */
package Nursultan;

import com.mojang.logging.LogUtils;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class01099;
import minecraft.class01118;
import minecraft.class04643;
import minecraft.class04763;
import minecraft.class04782;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07878;
import minecraft.class08055;
import minecraft.class08057;
import minecraft.class08072;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce;

public class class09372<T extends class00394>
implements class01099,
WorldBorderListenerOnce {
    private final T y;
    private final class01118<T> L;
    private boolean u;
    final /* synthetic */ class00570 N;
    private byte i = 0;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09372(class00570 class005702, class00394 class003942, class01118 class011182) {
        this.N = class005702;
        this.y = class003942;
        this.L = class011182;
    }

    public String toString() {
        return "Level ticker for " + this.method_31706() + "@" + String.valueOf(this.method_31705());
    }

    private boolean y(class00570 class005702, class07209 class072092) {
        if (this.N()) {
            class07299 class072992 = this.N.J();
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                return this.N.g().N(class04763.field_44856) && class047822.method_37116(class07321.N((class07209)class072092));
            }
            return true;
        }
        return false;
    }

    private void y() {
        boolean bl;
        this.i = 1;
        class08057 class080572 = this.N.J().method_8621();
        class080572.N((class08055)this);
        boolean bl2 = bl = class080572.y() == class08072.field_12753;
        if (class080572.N(this.method_31705())) {
            if (bl || class080572.y() == class08072.field_12754) {
                this.i = (byte)(this.i | 6);
            }
        } else if (bl || class080572.y() == class08072.field_12756) {
            this.i = (byte)(this.i | 2);
        }
    }

    private class00500 N(class00570 class005702, class07209 class072092) {
        return this.y.w();
    }

    private boolean N() {
        byte by;
        if (this.i == 0) {
            this.y();
        }
        if (((by = this.i) & 3) == 3) {
            return (by & 4) != 0;
        }
        return this.N.J().method_8621().N(this.method_31705());
    }

    private boolean N(class00404 class004042, class00500 class005002) {
        return ((SupportCache)this.y).lithium$isSupported();
    }

    public String method_31706() {
        return class00404.method_11033((class00404)this.y.O()).toString();
    }

    public class07209 method_31705() {
        return this.y.d();
    }

    public boolean method_31704() {
        return this.y.k();
    }

    public void method_31703() {
        class07209 class072092;
        class07209 class072093;
        class00570 class005702;
        if (!this.y.k() && this.y.l() && this.y(class005702 = this.N, class072093 = (class072092 = this.y.d()))) {
            try {
                class04643 class046432 = class08700.N();
                class046432.N(this::method_31706);
                class072093 = class072092;
                class005702 = this.N;
                class00500 class005002 = this.N(class005702, class072093);
                class072093 = class005002;
                class00404 var5 = this.y.O();
                if (this.N(var5, (class00500)class072093)) {
                    this.L.tick(this.N.m, this.y.d(), class005002, this.y);
                    this.u = false;
                } else if (!this.u) {
                    this.u = true;
                    class00570.W.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::method_31706), LogUtils.defer(this::method_31705), class005002});
                }
                class046432.L();
            }
            catch (Throwable throwable) {
                class07080 class070802 = class07080.N((Throwable)throwable, (String)"Ticking block entity");
                class07074 class070742 = class070802.N("Block entity being ticked");
                this.y.N(class070742);
                throw new class07878(class070802);
            }
        }
    }

    public void lithium$onWorldBorderShapeChange(class08057 class080572) {
        this.i = 0;
    }
}

