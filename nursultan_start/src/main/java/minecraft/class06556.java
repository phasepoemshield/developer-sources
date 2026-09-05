/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10621
 *  com.google.common.collect.Maps
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class04206
 *  minecraft.class04995
 *  minecraft.class08208
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10621;
import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Iterator;
import java.util.Map;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class04206;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class08208;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06556 {
    public final Map<class01894, class10621> N = Maps.newHashMap();
    public int y;

    public class01894 y(class06584 class065842) {
        class08208 class082082 = (class08208)class065842.method_58694(class02484.Y);
        class01894 class018942 = class04206.B.y((Object)class065842.B());
        if (class082082 == null) {
            return class018942;
        }
        return class082082.L().orElse(class018942);
    }

    protected void y(class01894 class018942, int n) {
    }

    protected void y(class01894 class018942) {
    }

    public void N(class01894 class018942, int n) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N.put(class018942, new class10621(this.y, this.y + n));
        this.y(class018942, n);
    }

    public void N(class01894 class018942) {
        this.N.remove(class018942);
        this.y(class018942);
    }

    private void N(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfo.cancel();
        }
    }

    public boolean N(class06584 class065842) {
        return this.N(class065842, 0.0f) > 0.0f;
    }

    public float N(class06584 class065842, float f) {
        class01894 class018942 = this.y(class065842);
        class10621 class106212 = this.N.get(class018942);
        if (class106212 != null) {
            float f2 = class106212.y() - class106212.N();
            return class04995.N((float)(((float)class106212.y() - ((float)this.y + f)) / f2), (float)0.0f, (float)1.0f);
        }
        return 0.0f;
    }

    public void N() {
        ++this.y;
        if (!this.N.isEmpty()) {
            Iterator<Map.Entry<class01894, class10621>> var1 = this.N.entrySet().iterator();
            while (var1.hasNext()) {
                Map.Entry<class01894, class10621> entry = var1.next();
                if (entry.getValue().y() > this.y) continue;
                var1.remove();
                this.y(entry.getKey());
            }
        }
    }

    public void N(class06584 class065842, int n) {
        this.N(this.y(class065842), n);
    }
}

