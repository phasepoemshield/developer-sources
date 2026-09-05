/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01061
 *  minecraft.class01090
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class01611
 *  minecraft.class01612
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02268
 *  minecraft.class02298
 *  minecraft.class02955
 *  minecraft.class02968
 *  minecraft.class02980
 *  minecraft.class02997
 *  minecraft.class04173
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01061;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01611;
import minecraft.class01612;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02268;
import minecraft.class02298;
import minecraft.class02955;
import minecraft.class02968;
import minecraft.class02980;
import minecraft.class02997;
import minecraft.class04173;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public class class00190
extends class02980 {
    private static final class01612 i = new class01612((class00392)class00392.L((String)"resourcePack.vanilla.description"), class07529.y().method_70592(class01603.field_14188).N());
    private static final class02955 R = class02955.N((class02968)class01612.N, (Object)i);
    public static final String N = "high_contrast";
    private static final Map<String, class00392> M = Map.of("programmer_art", class00392.L((String)"resourcePack.programmer_art.name"), "high_contrast", class00392.L((String)"resourcePack.high_contrast.name"));
    private static final class02267 B = new class02267("vanilla", (class00392)class00392.L((String)"resourcePack.vanilla.name"), class01283.L, Optional.of(class02980.u));
    private static final class02268 Z = new class02268(true, class01090.field_14281, false);
    private static final class02268 z = new class02268(false, class01090.field_14280, false);
    private static final class01894 U = class01894.y((String)"resourcepacks");
    private final @Nullable Path E;

    public class00190(Path path, class04173 class041732) {
        super(class01603.field_14188, class00190.y(path), U, class041732);
        this.E = this.N(path);
    }

    private static class01611 y(Path path) {
        return new class02997().N(R).N(new String[]{"minecraft", "realms"}).y().N().N(class01603.field_14188, path).N(B);
    }

    protected @Nullable class01055 N(String string, class01061 class010612, class00392 class003922) {
        return class01055.N((class02267)class00190.N(string, class003922), (class01061)class010612, (class01603)class01603.field_14188, (class02268)z);
    }

    protected void N(BiConsumer<String, Function<String, class01055>> biConsumer) {
        super.N(biConsumer);
        if (this.E != null) {
            this.N(this.E, biConsumer);
        }
    }

    protected class00392 N(String string) {
        class00392 class003922 = M.get(string);
        return class003922 != null ? class003922 : class00392.y((String)string);
    }

    protected @Nullable class01055 N(class01622 class016222) {
        return class01055.N((class02267)B, (class01061)class00190.y((class01622)class016222), (class01603)class01603.field_14188, (class02268)Z);
    }

    private static class02267 N(String string, class00392 class003922) {
        return new class02267(string, class003922, class01283.L, Optional.of(class02298.N((String)string)));
    }

    private @Nullable Path N(Path path) {
        Path path2;
        if (class07529.ND && path.getFileSystem() == FileSystems.getDefault() && Files.isDirectory(path2 = path.getParent().resolve("resourcepacks"), new LinkOption[0])) {
            return path2;
        }
        return null;
    }
}

