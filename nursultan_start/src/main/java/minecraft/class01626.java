/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01057
 *  minecraft.class01061
 *  minecraft.class01090
 *  minecraft.class01283
 *  minecraft.class02267
 *  minecraft.class02268
 *  minecraft.class04151
 *  minecraft.class04173
 *  minecraft.class06290
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01057;
import minecraft.class01061;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01586;
import minecraft.class01603;
import minecraft.class02267;
import minecraft.class02268;
import minecraft.class04151;
import minecraft.class04173;
import minecraft.class06290;
import org.slf4j.Logger;

public class class01626
implements class01057 {
    static final Logger N = LogUtils.getLogger();
    private static final class02268 L = new class02268(false, class01090.field_14280, false);
    private final Path u;
    private final class01603 i;
    public final class01283 y;
    private final class04173 R;

    public class01626(Path path, class01603 class016032, class01283 class012832, class04173 class041732) {
        this.u = path;
        this.i = class016032;
        this.y = class012832;
        this.R = class041732;
    }

    private class02267 y(Path path) {
        String string = class01626.N(path);
        return new class02267("file/" + string, (class00392)class00392.y((String)string), this.y, Optional.empty());
    }

    public static void N(Path path, class04173 class041732, BiConsumer<Path, class01061> biConsumer) throws IOException {
        class01586 class015862 = new class01586(class041732);
        try (DirectoryStream<Path> var4 = Files.newDirectoryStream(path);){
            for (Path path2 : var4) {
                try {
                    ArrayList arrayList = new ArrayList();
                    class01061 class010612 = (class01061)class015862.N(path2, arrayList);
                    if (!arrayList.isEmpty()) {
                        N.warn("Ignoring potential pack entry: {}", (Object)class04151.N((Path)path2, arrayList));
                        continue;
                    }
                    if (class010612 != null) {
                        biConsumer.accept(path2, class010612);
                        continue;
                    }
                    N.info("Found non-pack entry '{}', ignoring", (Object)path2);
                }
                catch (IOException iOException) {
                    N.warn("Failed to read properties of '{}', ignoring", (Object)path2, (Object)iOException);
                }
            }
        }
    }

    private static String N(Path path) {
        return path.getFileName().toString();
    }

    public void method_14453(Consumer<class01055> consumer) {
        try {
            class06290.L((Path)this.u);
            class01626.N(this.u, this.R, (path, class010612) -> {
                class01055 class010552 = class01055.N((class02267)this.y((Path)path), (class01061)class010612, (class01603)this.i, (class02268)L);
                if (class010552 != null) {
                    consumer.accept(class010552);
                }
            });
        }
        catch (IOException iOException) {
            N.warn("Failed to list packs in {}", (Object)this.u, (Object)iOException);
        }
    }
}

