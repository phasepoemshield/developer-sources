/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08033
 *  minecraft.class08051
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08033;
import minecraft.class08051;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07343
implements class00381<class08051> {
    public static final class02362<class00667, class07343> N = class00381.N(class07343::N, class07343::new);
    private static final int y = 2;
    private final boolean L;
    private class08033 u;

    public class07343(class08033 class080332) {
        this.L = class080332.y;
        this.N(class080332, null);
    }

    private class07343(class00667 class006672) {
        byte by = class006672.readByte();
        this.L = (by & 2) != 0;
    }

    public boolean N() {
        return this.L;
    }

    private void N(class08033 class080332, CallbackInfo callbackInfo) {
        this.u = class080332;
    }

    private class00667 N(class00667 class006672, int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            if (this.u.N) {
                n |= 1;
            }
            if (this.u.L) {
                n |= 4;
            }
            if (this.u.u) {
                n |= 8;
            }
        }
        return class006672.writeByte(n);
    }

    private void N(class00667 class006672) {
        int n = 0;
        if (this.L) {
            n = (byte)(n | 2);
        }
        int n2 = n;
        class00667 class006673 = class006672;
        this.N(class006673, n2);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12083(this);
    }

    public class02897<class07343> method_65080() {
        return class04248.yh;
    }
}

