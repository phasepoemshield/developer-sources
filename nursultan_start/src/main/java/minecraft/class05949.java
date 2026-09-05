/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10548
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class00869
 *  minecraft.class01054
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07282
 *  minecraft.class07310
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10548;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00392;
import minecraft.class00869;
import minecraft.class01054;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07282;
import minecraft.class07310;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class05949
extends Enum<class05949> {
    public static final /* enum */ class05949 field_24576 = new class05949((class00392)class00392.L((String)"gameMode.creative"), class07282.field_9220, new class06584((class07310)class00869.Z));
    public static final /* enum */ class05949 field_24577 = new class05949((class00392)class00392.L((String)"gameMode.survival"), class07282.field_9215, new class06584((class07310)class06570.To));
    public static final /* enum */ class05949 field_24578 = new class05949((class00392)class00392.L((String)"gameMode.adventure"), class07282.field_9216, new class06584((class07310)class06570.Gt));
    public static final /* enum */ class05949 field_24579 = new class05949((class00392)class00392.L((String)"gameMode.spectator"), class07282.field_9219, new class06584((class07310)class06570.nG));
    static final class05949[] field_24580;
    private static final int field_32317 = 16;
    private static final int field_32316 = 5;
    final class00392 field_24581;
    final class07282 field_60755;
    private final class06584 field_24583;
    private static final /* synthetic */ class05949[] field_24584;

    private class05949(class00392 class003922, class07282 class072822, class06584 class065842) {
        this.field_24581 = class003922;
        this.field_60755 = class072822;
        this.field_24583 = class065842;
    }

    static {
        field_24584 = class05949.y();
        field_24580 = class05949.values();
    }

    public static class05949[] values() {
        return (class05949[])field_24584.clone();
    }

    public static class05949 valueOf(String string) {
        return Enum.valueOf(class05949.class, string);
    }

    private static /* synthetic */ class05949[] y() {
        return new class05949[]{field_24576, field_24577, field_24578, field_24579};
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            switch (class10548.N[this.ordinal()]) {
                case 1: {
                    callbackInfoReturnable.setReturnValue((Object)field_24577);
                    break;
                }
                case 2: {
                    if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
                        callbackInfoReturnable.setReturnValue((Object)field_24576);
                        break;
                    }
                    callbackInfoReturnable.setReturnValue((Object)field_24578);
                    break;
                }
                case 3: {
                    callbackInfoReturnable.setReturnValue((Object)field_24576);
                }
            }
        }
    }

    static class05949 N(class07282 class072822) {
        return switch (class072822) {
            default -> throw new MatchException(null, null);
            case class07282.field_9219 -> field_24579;
            case class07282.field_9215 -> field_24577;
            case class07282.field_9220 -> field_24576;
            case class07282.field_9216 -> field_24578;
        };
    }

    class05949 N() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class05949)((Object)callbackInfoReturnable.getReturnValue());
        }
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> field_24577;
            case 1 -> field_24578;
            case 2 -> field_24579;
            case 3 -> field_24576;
        };
    }

    void N(class01054 class010542, int n, int n2) {
        class010542.N(this.field_24583, n, n2);
    }
}

