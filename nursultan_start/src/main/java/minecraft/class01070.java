/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09435
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 *  minecraft.class02796
 *  minecraft.class05157
 *  minecraft.class05170
 *  minecraft.class08774
 */
package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import minecraft.class01067;
import minecraft.class02796;
import minecraft.class05157;
import minecraft.class05170;
import minecraft.class08774;

class class01070
implements ProfileLookupCallback {
    final /* synthetic */ class02796 N;
    final /* synthetic */ Map y;
    final /* synthetic */ class05170 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01070(class02796 class027962, Map map, class05170 class051702) {
        this.N = class027962;
        this.y = map;
        this.L = class051702;
    }

    public void onProfileLookupSucceeded(String string, UUID uUID) {
        class08774 class087742 = new class08774(uUID, string);
        this.N.Nf().R().N(class087742);
        String[] stringArray = (String[])this.y.get(class087742.y().toLowerCase(Locale.ROOT));
        if (stringArray == null) {
            class01067.N.warn("Could not convert user banlist entry for {}", (Object)class087742.y());
            throw new class09435("Profile not in the conversionlist");
        }
        Date date = stringArray.length > 1 ? class01067.N(stringArray[1], null) : null;
        String string2 = stringArray.length > 2 ? stringArray[2] : null;
        Date date2 = stringArray.length > 3 ? class01067.N(stringArray[3], null) : null;
        String string3 = stringArray.length > 4 ? stringArray[4] : null;
        this.L.N(new class05157(class087742, date, string2, date2, string3));
    }

    public void onProfileLookupFailed(String string, Exception exception) {
        class01067.N.warn("Could not lookup user banlist entry for {}", (Object)string, (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new class09435("Could not request user " + string + " from backend systems", (Throwable)exception);
        }
    }
}

