/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09435
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 *  minecraft.class02796
 *  minecraft.class08774
 */
package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.UUID;
import minecraft.class01067;
import minecraft.class01077;
import minecraft.class01087;
import minecraft.class02796;
import minecraft.class08774;

class class01085
implements ProfileLookupCallback {
    final /* synthetic */ class02796 N;
    final /* synthetic */ class01077 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01085(class02796 class027962, class01077 class010772) {
        this.N = class027962;
        this.y = class010772;
    }

    public void onProfileLookupSucceeded(String string, UUID uUID) {
        class08774 class087742 = new class08774(uUID, string);
        this.N.Nf().R().N(class087742);
        this.y.N(new class01087(class087742, this.N.T(), false));
    }

    public void onProfileLookupFailed(String string, Exception exception) {
        class01067.N.warn("Could not lookup oplist entry for {}", (Object)string, (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new class09435("Could not request user " + string + " from backend systems", (Throwable)exception);
        }
    }
}

