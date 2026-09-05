/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.ProfileLookupCallback
 *  minecraft.class02796
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;
import java.util.UUID;
import minecraft.class01067;
import minecraft.class02796;
import minecraft.class08774;

class class01046
implements ProfileLookupCallback {
    final /* synthetic */ class02796 N;
    final /* synthetic */ List y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01046(class02796 class027962, List list) {
        this.N = class027962;
        this.y = list;
    }

    public void onProfileLookupSucceeded(String string, UUID uUID) {
        class08774 class087742 = new class08774(uUID, string);
        this.N.Nf().R().N(class087742);
        this.y.add(class087742);
    }

    public void onProfileLookupFailed(String string, Exception exception) {
        class01067.N.warn("Could not lookup user whitelist entry for {}", (Object)string, (Object)exception);
    }
}

