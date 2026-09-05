/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  minecraft.class00719
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class02770
 *  minecraft.class06290
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Set;
import minecraft.class00719;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class02770;
import minecraft.class06290;
import minecraft.class08212;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;

class class08210
extends class02770 {
    private final Set<class01894> L = new ObjectArraySet();
    final /* synthetic */ class01894 N;
    final /* synthetic */ Map y;

    class08210(class01894 class018942, Map map) {
        this.N = class018942;
        this.y = map;
    }

    public @Nullable String N(boolean bl, String string) {
        String string3;
        block11: {
            class01894 class018942;
            try {
                class018942 = bl ? this.N.N(string2 -> class06290.u((String)(string2 + string))) : class01894.N((String)string).R("shaders/include/");
            }
            catch (class00719 class007192) {
                class08212.N.error("Malformed GLSL import {}: {}", (Object)string, (Object)class007192.getMessage());
                return "#error " + class007192.getMessage();
            }
            if (!this.L.add(class018942)) {
                return null;
            }
            BufferedReader bufferedReader = ((class01079)this.y.get(class018942)).method_43039();
            try {
                string3 = IOUtils.toString((Reader)bufferedReader);
                if (bufferedReader == null) break block11;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            ((Reader)bufferedReader).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    class08212.N.error("Could not open GLSL import {}: {}", (Object)class018942, (Object)iOException.getMessage());
                    return "#error " + iOException.getMessage();
                }
            }
            ((Reader)bufferedReader).close();
        }
        return string3;
    }
}

