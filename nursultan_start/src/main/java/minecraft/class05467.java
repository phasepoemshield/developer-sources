/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00868
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00868;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04206;
import minecraft.class05440;
import minecraft.class05465;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05467
extends class05465 {
    public static final MapCodec<class05467> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("candle").forGetter(class054672 -> class054672.B), (App)class05467.t()).apply(instance, class05467::new));
    public static final class06667 u = class05465.y;
    private static final class00494 i = class00389.N((class00494)class00891.y((double)2.0, (double)8.0, (double)14.0), (class00494)class00891.y((double)14.0, (double)0.0, (double)8.0));
    private static final Map<class05440, class05467> R = Maps.newHashMap();
    private static final Iterable<class06889> M = List.of(new class06889(8.0, 16.0, 8.0).L(0.0625));
    private final class05440 B;
    private static final class00494 Z;

    public class05467(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)u, (Comparable)Boolean.valueOf(false)));
        if (!(class008912 instanceof class05440)) {
            throw new IllegalArgumentException("Expected block to be of " + String.valueOf(class05440.class) + " was " + String.valueOf(class008912.getClass()));
        }
        class05440 class054402 = (class05440)class008912;
        R.put(class054402, this);
        this.B = class054402;
    }

    public static boolean v(class00500 class005002) {
        return class005002.N(class01210.yl, (T class013392) -> class013392.y((class08092)u) && (Boolean)class005002.L((class08092)u) == false);
    }

    @Override
    protected Iterable<class06889> U(class00500 class005002) {
        return M;
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return i;
        }
        return super.z(class005002);
    }

    public static class00500 N(class05440 class054402) {
        return R.get((Object)class054402).W();
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public MapCodec<class05467> N() {
        return L;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)Z);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u});
    }

    private static boolean N(class06183 class061832) {
        return class061832.y().B - (double)class061832.u().method_10264() > 0.5;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class07082 class070822 = class00868.N((class07284)class072992, (class07209)class072092, (class00500)class00869.ie.W(), (class08036)class080362);
        if (class070822.N()) {
            class05467.y((class00500)class005002, (class07299)class072992, (class07209)class072092);
        }
        return class070822;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (class065842.N(class06570.sf) || class065842.N(class06570.GZ)) {
            return class07082.i;
        }
        if (class05467.N(class061832) && class065842.R() && ((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class05467.N(class080362, class005002, (class07284)class072992, class072092);
            return class07082.N;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return i;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class00868.u;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class00869.ie);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10074()).B();
    }
}

