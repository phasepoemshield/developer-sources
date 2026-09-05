/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09435
 *  com.mojang.authlib.ProfileLookupCallback
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 *  minecraft.class05623
 *  minecraft.class08774
 */
package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;
import minecraft.class01067;
import minecraft.class05623;
import minecraft.class08774;

class class01075
implements ProfileLookupCallback {
    final /* synthetic */ class05623 N;
    final /* synthetic */ File y;
    final /* synthetic */ File L;
    final /* synthetic */ File u;
    final /* synthetic */ String[] i;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01075(class05623 class056232, File file, File file2, File file3, String[] stringArray) {
        this.N = class056232;
        this.y = file;
        this.L = file2;
        this.u = file3;
        this.i = stringArray;
    }

    private void N(File file, String string, String string2) {
        File file2 = new File(this.u, string + ".dat");
        File file3 = new File(file, string2 + ".dat");
        class01067.N(file);
        if (!file2.renameTo(file3)) {
            throw new class09435("Could not convert file for " + string);
        }
    }

    private String N(String string) {
        String string2 = null;
        for (String string3 : this.i) {
            if (string3 == null || !string3.equalsIgnoreCase(string)) continue;
            string2 = string3;
            break;
        }
        if (string2 == null) {
            throw new class09435("Could not find the filename for " + string + " anymore");
        }
        return string2;
    }

    public void onProfileLookupSucceeded(String string, UUID uUID) {
        class08774 class087742 = new class08774(uUID, string);
        this.N.Nf().R().N(class087742);
        this.N(this.y, this.N(string), uUID.toString());
    }

    public void onProfileLookupFailed(String string, Exception exception) {
        class01067.N.warn("Could not lookup user uuid for {}", (Object)string, (Object)exception);
        if (!(exception instanceof ProfileNotFoundException)) {
            throw new class09435("Could not request user " + string + " from backend systems", (Throwable)exception);
        }
        String string2 = this.N(string);
        this.N(this.L, string2, string2);
    }
}

