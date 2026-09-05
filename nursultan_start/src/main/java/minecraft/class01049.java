/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09435
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 *  minecraft.class02796
 *  minecraft.class05142
 *  minecraft.class05152
 *  minecraft.class08774
 */
package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.UUID;
import minecraft.class01067;
import minecraft.class02796;
import minecraft.class05142;
import minecraft.class05152;
import minecraft.class08774;

class class01049
implements ProfileLookupCallback {
    final /* synthetic */ class02796 N;
    final /* synthetic */ class05152 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01049(class02796 class027962, class05152 class051522) {
        this.N = class027962;
        this.y = class051522;
    }

    public void onProfileLookupSucceeded(String string, UUID uUID) {
        class08774 class087742 = new class08774(uUID, string);
        this.N.Nf().R().N(class087742);
        this.y.N(new class05142(class087742));
    }

    public void onProfileLookupFailed(String string, Exception exception) {
        class01067.N.warn("Could not lookup user whitelist entry for {}", (Object)string, (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new class09435("Could not request user " + string + " from backend systems", (Throwable)exception);
        }
    }
}

