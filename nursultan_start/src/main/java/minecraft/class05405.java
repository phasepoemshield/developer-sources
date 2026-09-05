/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00606
 *  minecraft.class00642
 *  minecraft.class02270
 *  minecraft.class03371
 *  minecraft.class03415
 *  minecraft.class03464
 *  minecraft.class03826
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05435
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07816
 *  minecraft.class07844
 */
package minecraft;

import java.net.InetSocketAddress;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00606;
import minecraft.class00642;
import minecraft.class02270;
import minecraft.class03371;
import minecraft.class03415;
import minecraft.class03464;
import minecraft.class03826;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05364;
import minecraft.class05384;
import minecraft.class05435;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07816;
import minecraft.class07844;

class class05405
extends Thread {
    final /* synthetic */ String N;
    final /* synthetic */ int y;
    final /* synthetic */ class06202 L;
    final /* synthetic */ class04981 u;
    final /* synthetic */ class05435 i;

    class05405(class05435 class054352, String string, String string2, int n, class06202 class062022, class04981 class049812) {
        this.i = class054352;
        this.N = string2;
        this.y = n;
        this.L = class062022;
        this.u = class049812;
        super(string);
    }

    @Override
    public void run() {
        InetSocketAddress inetSocketAddress = null;
        try {
            inetSocketAddress = new InetSocketAddress(this.N, this.y);
            if (this.i.L) {
                return;
            }
            this.i.u = class00642.method_10753((InetSocketAddress)inetSocketAddress, (class00606)class00606.N((boolean)((class05630)this.L.i_7).NC()), (class02270)this.L.ND().U());
            if (this.i.L) {
                return;
            }
            class03464 class034642 = new class03464(this.i.u, this.L, this.u.L(this.N), this.i.y, false, null, class003922 -> {}, new class05384(), null);
            if (this.u.z()) {
                class034642.N(this.u.b);
            }
            if (this.i.L) {
                return;
            }
            this.i.u.method_52902(this.N, this.y, (class07844)class034642);
            if (this.i.L) {
                return;
            }
            this.i.u.method_10743((class00381)new class07816(this.L.Ny().L(), this.L.Ny().y()));
            this.L.N(class03415.N((class04981)this.u));
            this.L.Nl().N(class03371.field_44570, String.valueOf(this.u.y), Objects.requireNonNullElse(this.u.u, "unknown"));
            this.L.yL().N(this.i.u, class03826.field_47648);
        }
        catch (Exception exception) {
            Object object;
            this.L.yL().Z();
            if (this.i.L) {
                return;
            }
            class05435.N.error("Couldn't connect to world", (Throwable)exception);
            String string = exception.toString();
            if (inetSocketAddress != null) {
                object = String.valueOf(inetSocketAddress) + ":" + this.y;
                string = string.replaceAll((String)object, "");
            }
            object = new class05364(this.i.y, (class00392)class00392.L((String)"mco.connect.failed"), (class00392)class00392.N((String)"disconnect.genericReason", (Object[])new Object[]{string}), class05220.U);
            this.L.execute(() -> class05405.N(this.L, (class05364)((Object)object)));
        }
    }

    private static /* synthetic */ void N(class06202 class062022, class05364 class053642) {
        class062022.N((class05096)class053642);
    }
}

