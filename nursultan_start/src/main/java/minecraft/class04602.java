/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class08280
 *  minecraft.class08829
 *  minecraft.class08918
 *  minecraft.class08923
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import minecraft.class01894;
import minecraft.class04637;
import minecraft.class06202;
import minecraft.class08280;
import minecraft.class08829;
import minecraft.class08918;
import minecraft.class08923;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class class04602 {
    private static final Map<String, class04637> N = Maps.newHashMap();
    private static final Logger y = LogUtils.getLogger();
    private static final class01894 L = class01894.y((String)"textures/gui/presets/isles.png");

    private static class01894 y(String string, String string2) {
        class04637 class046372 = N.get(string);
        if (class046372 != null && class046372.N().equals(string2)) {
            return class046372.y();
        }
        class08280 class082802 = class04602.N(string2);
        if (class082802 == null) {
            class01894 class018942 = class08923.L();
            N.put(string, new class04637(string2, class018942));
            return class018942;
        }
        class01894 class018943 = class01894.N((String)"realms", (String)("dynamic/" + string));
        class06202.Nq().NO().N(class018943, (class08918)new class08829(() -> ((class01894)class018943).toString(), class082802));
        N.put(string, new class04637(string2, class018943));
        return class018943;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static @Nullable class08280 N(String string) {
        byte[] byArray = Base64.getDecoder().decode(string);
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)byArray.length);
        try {
            class08280 class082802 = class08280.N((ByteBuffer)byteBuffer.put(byArray).flip());
            return class082802;
        }
        catch (IOException iOException) {
            y.warn("Failed to load world image: {}", (Object)string, (Object)iOException);
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
        return null;
    }

    public static class01894 N(String string, @Nullable String string2) {
        if (string2 == null) {
            return L;
        }
        return class04602.y(string, string2);
    }
}

