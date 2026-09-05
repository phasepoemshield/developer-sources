/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00388
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04439
 *  minecraft.class04891
 *  minecraft.class04922
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06911
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07304
 *  minecraft.class07468
 *  minecraft.class07536
 *  minecraft.class08326
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import minecraft.class00388;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04439;
import minecraft.class04891;
import minecraft.class04922;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06911;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07304;
import minecraft.class07468;
import minecraft.class07536;
import minecraft.class08326;

@FunctionalInterface
public interface FabricLanguageProvider$TranslationBuilder {
    default public void add(class01894 class018942, String string) {
        this.add(class018942.u(), string);
    }

    default public void add(class07084 class070842, String string) {
        this.add(class070842.R(), string);
    }

    default public void add(class04922<?> class049222, String string) {
        this.add("stat_type." + class04206.G.y(class049222).toString().replace(':', '.'), string);
    }

    default public void add(class03556<class07468> class035562, String string) {
        this.add(((class07468)class035562.N()).L(), string);
    }

    default public void add(class03530<?> class035302, String string) {
        this.add(class035302.getTranslationKey(), string);
    }

    default public void add(class04891 class048912, String string) {
        this.add(class07536.N((String)"subtitles", (class01894)class048912.N()), string);
    }

    default public void add(Path path) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(path);){
            JsonObject jsonObject = class08326.N((Reader)bufferedReader).getAsJsonObject();
            for (String string : jsonObject.keySet()) {
                this.add(string, jsonObject.get(string).getAsString());
            }
        }
    }

    default public void add(class06581 class065812, String string) {
        this.add(class065812.z(), string);
    }

    public void add(String var1, String var2);

    default public void add(class05946<class06911> class059462, String string) {
        class06911 class069112 = (class06911)class04206.Nz.B(class059462);
        class04439 class044392 = class069112.N().method_10851();
        if (class044392 instanceof class00388) {
            class00388 class003882 = (class00388)class044392;
            this.add(class003882.y(), string);
            return;
        }
        throw new UnsupportedOperationException("Cannot add language entry for ItemGroup (%s) as the display name is not translatable.".formatted(new Object[]{class069112.N().getString()}));
    }

    default public void add(class07078<?> class070782, String string) {
        this.add(class070782.R(), string);
    }

    default public void add(class00891 class008912, String string) {
        this.add(class008912.w(), string);
    }

    default public void addEnchantment(class05946<class07304> class059462, String string) {
        this.add(class07536.N((String)"enchantment", (class01894)class059462.N()), string);
    }
}

