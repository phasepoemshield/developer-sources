/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.mouse_sensitivity.MouseSensitivity1_13_2
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04370
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 */
package minecraft;

import com.viaversion.viafabricplus.features.mouse_sensitivity.MouseSensitivity1_13_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Arrays;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04370;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;

public class class05709
extends class05914 {
    private static final class00392 N = class00392.L((String)"options.mouse_settings.title");

    public class05709(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, N);
    }

    private static class04370<?>[] N(class05630 class056302) {
        return new class04370[]{class056302.u(), class056302.Nm(), class056302.p(), class056302.NM(), class056302.Ni(), class056302.NR(), class056302.A()};
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) && this.field_51824.y(this.field_21336.u()).method_49606()) {
            class010542.N(this.field_22793, class00392.N((String)("<=1.13.2 Sensitivity: " + MouseSensitivity1_13_2.get1_13SliderValue((float)((Double)this.field_21336.u().method_41753()).floatValue()).valueInt() + "%")), n, n2);
        }
    }

    protected void method_60325() {
        if (class04655.N()) {
            this.field_51824.N((class04370[])Stream.concat(Arrays.stream(class05709.N(this.field_21336)), Stream.of(this.field_21336.F())).toArray(class04370[]::new));
        } else {
            this.field_51824.N(class05709.N(this.field_21336));
        }
    }
}

