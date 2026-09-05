/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02002
 *  minecraft.class02968
 *  minecraft.class03643
 *  minecraft.class04995
 *  minecraft.class08280
 *  minecraft.class08393
 *  minecraft.class08500
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02002;
import minecraft.class02968;
import minecraft.class03643;
import minecraft.class04995;
import minecraft.class08280;
import minecraft.class08393;
import minecraft.class08500;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface class01640 {
    public static final Logger N = LogUtils.getLogger();

    public static class01640 N(Set<class02968<?>> set) {
        return (class018942, class010792) -> {
            InputStream inputStream;
            List var5;
            Optional var4;
            Optional var3;
            class03643 class036432;
            try {
                class036432 = class010792.method_14481();
                var3 = class036432.N(class08393.y);
                var4 = class036432.N(class08500.i);
                var5 = class036432.N((Collection)set);
            }
            catch (Exception exception) {
                N.error("Unable to parse metadata from {}", (Object)class018942, (Object)exception);
                return null;
            }
            try {
                inputStream = class010792.method_14482();
                try {
                    class036432 = class08280.N((InputStream)inputStream);
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
            catch (IOException iOException) {
                N.error("Using missing texture, unable to load {}", (Object)class018942, (Object)iOException);
                return null;
            }
            if (var3.isPresent()) {
                inputStream = ((class08393)var3.get()).N(class036432.N(), class036432.y());
                if (!class04995.u((int)class036432.N(), (int)inputStream.N()) || !class04995.u((int)class036432.y(), (int)inputStream.y())) {
                    N.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{class018942, class036432.N(), class036432.y(), inputStream.N(), inputStream.y()});
                    class036432.close();
                    return null;
                }
            } else {
                inputStream = new class02002(class036432.N(), class036432.y());
            }
            return new class01991(class018942, (class02002)inputStream, (class08280)class036432, var3, var5, var4);
        };
    }

    public @Nullable class01991 loadSprite(class01894 var1, class01079 var2);
}

