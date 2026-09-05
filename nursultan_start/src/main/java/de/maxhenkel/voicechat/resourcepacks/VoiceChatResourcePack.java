/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  de.maxhenkel.voicechat.Voicechat
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01061
 *  minecraft.class01078
 *  minecraft.class01090
 *  minecraft.class01283
 *  minecraft.class01593
 *  minecraft.class01598
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02268
 *  minecraft.class03652
 *  minecraft.class07529
 *  minecraft.class08735
 */
package de.maxhenkel.voicechat.resourcepacks;

import com.google.common.collect.ImmutableSet;
import de.maxhenkel.voicechat.Voicechat;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01593;
import minecraft.class01598;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02268;
import minecraft.class03652;
import minecraft.class07529;
import minecraft.class08735;

public class VoiceChatResourcePack
extends class01598
implements class01061 {
    public VoiceChatResourcePack(String string, class00392 class003922) {
        super(new class02267(string, class003922, class01283.L, Optional.empty()));
    }

    @Nullable
    private InputStream get(String string) {
        return Voicechat.class.getResourceAsStream(this.getPath() + string);
    }

    @Nullable
    private class03652<InputStream> getResource(String string) {
        InputStream inputStream = this.get(string);
        if (inputStream == null) {
            return null;
        }
        return () -> inputStream;
    }

    public void close() {
    }

    private String getPath() {
        return "/packs/" + this.method_14409() + "/";
    }

    private static String convertPath(Path path) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < path.getNameCount(); ++i) {
            stringBuilder.append(path.getName(i));
            if (i >= path.getNameCount() - 1) continue;
            stringBuilder.append("/");
        }
        return stringBuilder.toString();
    }

    public class01622 method_52424(class02267 class022672) {
        return this;
    }

    public class01622 method_52425(class02267 class022672, class01078 class010782) {
        return this;
    }

    public class01055 toPack() {
        class08735 class087352 = class07529.y().method_70592(class01603.field_14188);
        class01078 class010782 = class01055.N((class02267)this.method_56926(), (class01061)this, (class08735)class087352, (class01603)class01603.field_14188);
        if (class010782 == null) {
            throw new IllegalStateException("Could not find builtin resource pack info");
        }
        return class01055.N((class02267)this.method_56926(), (class01061)this, (class01603)class01603.field_14188, (class02268)new class02268(false, class01090.field_14280, false));
    }

    @Nullable
    public class03652<InputStream> method_14410(String ... stringArray) {
        return this.getResource(String.join((CharSequence)"/", stringArray));
    }

    public Set<String> method_14406(class01603 class016032) {
        if (class016032 == class01603.field_14188) {
            return ImmutableSet.of((Object)"voicechat");
        }
        return ImmutableSet.of();
    }

    @Nullable
    public class03652<InputStream> method_14405(class01603 class016032, class01894 class018942) {
        return this.method_14410(class016032.N(), class018942.y(), class018942.N());
    }

    public void method_14408(class01603 class016032, String string, String string2, class01593 class015932) {
        try {
            URL uRL = Voicechat.class.getResource(this.getPath());
            if (uRL == null) {
                return;
            }
            Path path3 = Paths.get(uRL.toURI()).resolve(class016032.N()).resolve(string);
            Path path4 = path3.resolve(string2);
            if (!Files.exists(path4, new LinkOption[0])) {
                return;
            }
            try (Stream<Path> stream = Files.walk(path4, new FileVisitOption[0]);){
                stream.filter(path -> !Files.isDirectory(path, new LinkOption[0])).forEach(path2 -> {
                    class01894 class018942 = class01894.N((String)string, (String)VoiceChatResourcePack.convertPath(path2).substring(VoiceChatResourcePack.convertPath(path3).length() + 1));
                    class015932.accept((Object)class018942, this.method_14405(class016032, class018942));
                });
            }
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to list builtin pack resources", new Object[]{exception});
        }
    }
}

