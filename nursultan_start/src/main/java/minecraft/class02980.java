/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00190
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01057
 *  minecraft.class01061
 *  minecraft.class01603
 *  minecraft.class01611
 *  minecraft.class01622
 *  minecraft.class01626
 *  minecraft.class01894
 *  minecraft.class02298
 *  minecraft.class04173
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00190;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01061;
import minecraft.class01603;
import minecraft.class01611;
import minecraft.class01622;
import minecraft.class01626;
import minecraft.class01894;
import minecraft.class02298;
import minecraft.class02962;
import minecraft.class04173;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public abstract class class02980
implements class01057 {
    private static Logger N = LogUtils.getLogger();
    public static final String y = "vanilla";
    public static final String L = "tests";
    public static final class02298 u = class02298.N((String)"core");
    private final class01603 i;
    private final class01611 R;
    private final class01894 M;
    private final class04173 B;

    public class01611 L() {
        return this.R;
    }

    public class02980(class01603 class016032, class01611 class016112, class01894 class018942, class04173 class041732) {
        this.i = class016032;
        this.R = class016112;
        this.M = class018942;
        this.B = class041732;
    }

    protected static class01061 y(class01622 class016222) {
        return new class02962(class016222);
    }

    protected abstract @Nullable class01055 N(String var1, class01061 var2, class00392 var3);

    private void N(Consumer consumer, CallbackInfo callbackInfo) {
        if (this instanceof class00190) {
            ModResourcePackCreator.CLIENT_RESOURCE_PACK_PROVIDER.method_14453(consumer);
        }
    }

    protected abstract @Nullable class01055 N(class01622 var1);

    protected abstract class00392 N(String var1);

    private void N(Consumer<class01055> consumer) {
        HashMap<String, Function> hashMap = new HashMap<String, Function>();
        this.N(hashMap::put);
        hashMap.forEach((string, function) -> {
            class01055 class010552 = (class01055)function.apply(string);
            if (class010552 != null) {
                consumer.accept(class010552);
            }
        });
    }

    private static String N(Path path) {
        return StringUtils.removeEnd((String)path.getFileName().toString(), (String)".zip");
    }

    protected void N(@Nullable Path path2, BiConsumer<String, Function<String, @Nullable class01055>> biConsumer) {
        if (path2 != null && Files.isDirectory(path2, new LinkOption[0])) {
            try {
                class01626.N((Path)path2, (class04173)this.B, (T path, U class010612) -> biConsumer.accept(class02980.N(path), string -> this.N((String)string, (class01061)class010612, this.N((String)string))));
            }
            catch (IOException iOException) {
                N.warn("Failed to discover packs in {}", (Object)path2, (Object)iOException);
            }
        }
    }

    protected void N(BiConsumer<String, Function<String, class01055>> biConsumer) {
        this.R.N(this.i, this.M, (T path) -> this.N((Path)path, biConsumer));
    }

    public void method_14453(Consumer<class01055> consumer) {
        class01055 class010552 = this.N((class01622)this.R);
        if (class010552 != null) {
            consumer.accept(class010552);
        }
        this.N(consumer);
        this.N(consumer, null);
    }
}

