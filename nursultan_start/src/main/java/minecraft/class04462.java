/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11385
 *  Nursultan.class11938
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class04474
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07109
 *  minecraft.class08687
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11385;
import Nursultan.class11938;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class04474;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07109;
import minecraft.class08687;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04462
extends class04474 {
    private final class05630 N;

    public class04462(class05630 class056302) {
        this.N = class056302;
    }

    private void N(CallbackInfo callbackInfo) {
        class11385 class113852 = class11385.N((boolean)this.field_54155.N(), (boolean)this.field_54155.y(), (boolean)this.field_54155.L(), (boolean)this.field_54155.u(), (boolean)this.field_54155.i(), (boolean)this.field_54155.R(), (boolean)this.field_54155.M());
        class11938.L().L((Object)class113852);
        this.field_54155 = class113852.z();
        ((class05630)class06202.Nq().i_7).k.N(this.field_54155.M());
    }

    private class07109 N(class07109 class071092) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return class071092;
        }
        return class071092.N();
    }

    public static float N(boolean bl, boolean bl2) {
        if (bl == bl2) {
            return 0.0f;
        }
        return bl ? 1.0f : -1.0f;
    }

    public void method_3129() {
        this.field_54155 = new class08687(this.N.n.R(), this.N.G.R(), this.N.t.R(), this.N.l.R(), this.N.d.R(), this.N.w.R(), this.N.k.R());
        this.N((CallbackInfo)null);
        float f = class04462.N(this.field_54155.N(), this.field_54155.y());
        float f2 = class04462.N(this.field_54155.L(), this.field_54155.u());
        class07109 class071092 = new class07109(f2, f);
        this.field_55868 = this.N(class071092);
    }
}

