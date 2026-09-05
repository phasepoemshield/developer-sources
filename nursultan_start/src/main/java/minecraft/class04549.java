/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viafabricplus.injection.access.base.IServerData
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00606
 *  minecraft.class00642
 *  minecraft.class02570
 *  minecraft.class02796
 *  minecraft.class03420
 *  minecraft.class04584
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07806
 *  minecraft.class07832
 *  minecraft.class07834
 *  minecraft.class07839
 *  minecraft.class07846
 *  minecraft.class08774
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00606;
import minecraft.class00642;
import minecraft.class02570;
import minecraft.class02796;
import minecraft.class03420;
import minecraft.class04568;
import minecraft.class04584;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07806;
import minecraft.class07832;
import minecraft.class07834;
import minecraft.class07839;
import minecraft.class07846;
import minecraft.class08774;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class04549
implements class07834 {
    private boolean Z;
    private boolean z;
    private long U;
    final /* synthetic */ class00642 N;
    final /* synthetic */ class04568 y;
    final /* synthetic */ Runnable L;
    final /* synthetic */ Runnable u;
    final /* synthetic */ InetSocketAddress i;
    final /* synthetic */ class03420 R;
    final /* synthetic */ class00606 M;
    final /* synthetic */ class04584 B;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class04549(class04584 class045842, class00642 class006422, class04568 class045682, Runnable runnable, Runnable runnable2, InetSocketAddress inetSocketAddress, class03420 class034202, class00606 class006062) {
        this.B = class045842;
        this.N = class006422;
        this.y = class045682;
        this.L = runnable;
        this.u = runnable2;
        this.i = inetSocketAddress;
        this.R = class034202;
        this.M = class006062;
    }

    private void N(class07846 class078462, CallbackInfo callbackInfo) {
        class00642 class006422 = this.N;
        if (class006422 instanceof IConnection) {
            IConnection iConnection = (IConnection)class006422;
            ((IServerData)this.y).viaFabricPlus$setTranslatingVersion(iConnection.viaFabricPlus$getTargetVersion());
        }
    }

    private void N(CallbackInfo callbackInfo) {
        ProtocolVersion protocolVersion = ((IConnection)this.N).viaFabricPlus$getTargetVersion();
        if (protocolVersion != null && protocolVersion.getVersion() == this.y.M) {
            this.y.M = class07529.L();
        }
    }

    public void N(class07832 class078322) {
        long l = this.U;
        long l2 = class07536.L();
        this.y.R = l2 - l;
        this.N.method_10747((class00392)class00392.L((String)"multiplayer.status.finished"));
        this.u.run();
    }

    public void N(class07846 class078462) {
        this.N(class078462, null);
        if (this.z) {
            this.N.method_10747((class00392)class00392.L((String)"multiplayer.status.unrequested"));
            return;
        }
        this.z = true;
        class07806 class078062 = class078462.N();
        this.y.u = class078062.N();
        class078062.L().ifPresentOrElse(class078082 -> {
            class045682.B = class00392.y((String)class078082.y());
            class045682.M = class078082.L();
        }, () -> {
            class045682.B = class00392.L((String)"multiplayer.status.old");
            class045682.M = 0;
        });
        class078062.y().ifPresentOrElse(class078372 -> {
            class045682.L = class04584.N((int)class078372.y(), (int)class078372.N());
            class045682.i = class078372;
            if (!class078372.L().isEmpty()) {
                ArrayList<class00392> arrayList = new ArrayList<class00392>(class078372.L().size());
                for (class08774 class087742 : class078372.L()) {
                    class05216 class052162 = class087742.equals((Object)class02796.M) ? class00392.L((String)"multiplayer.status.anonymous_player") : class00392.y((String)class087742.y());
                    arrayList.add((class00392)class052162);
                }
                if (class078372.L().size() < class078372.y()) {
                    arrayList.add((class00392)class00392.N((String)"multiplayer.status.and_more", (Object[])new Object[]{class078372.y() - class078372.L().size()}));
                }
                class045682.Z = arrayList;
            } else {
                class045682.Z = List.of();
            }
        }, () -> {
            class045682.L = class00392.L((String)"multiplayer.status.unknown").N(class06541.field_1063);
        });
        class078062.u().ifPresent(class078242 -> {
            if (!Arrays.equals(class078242.N(), this.y.L())) {
                this.y.N(class04568.y(class078242.N()));
                this.L.run();
            }
        });
        this.U = class07536.L();
        this.N.method_10743((class00381)new class07839(this.U));
        this.N((CallbackInfo)null);
        this.Z = true;
    }

    public boolean method_48106() {
        return this.N.method_10758();
    }

    public void method_10839(class02570 class025702) {
        if (!this.Z) {
            this.B.N(class025702.N(), this.y);
            this.B.N(this.i, this.R, this.y, this.M);
        }
    }
}

