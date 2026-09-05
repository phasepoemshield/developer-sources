/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 */
package me.flashyreese.mods.sodiumextra.client.config;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$AnimationSettings;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$DetailSettings;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$ExtraSettings;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$ParticleSettings;
import me.flashyreese.mods.sodiumextra.client.config.SodiumExtraGameOptions$RenderSettings;
import me.flashyreese.mods.sodiumextra.common.util.IdentifierSerializer;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;

public class SodiumExtraGameOptions
implements StorageEventHandler {
    private static final Gson gson = new GsonBuilder().registerTypeAdapter(class01894.class, (Object)new IdentifierSerializer()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().excludeFieldsWithModifiers(new int[]{2}).create();
    public final SodiumExtraGameOptions$AnimationSettings animationSettings = new SodiumExtraGameOptions$AnimationSettings();
    public final SodiumExtraGameOptions$ParticleSettings particleSettings = new SodiumExtraGameOptions$ParticleSettings();
    public final SodiumExtraGameOptions$DetailSettings detailSettings = new SodiumExtraGameOptions$DetailSettings();
    public final SodiumExtraGameOptions$RenderSettings renderSettings = new SodiumExtraGameOptions$RenderSettings();
    public final SodiumExtraGameOptions$ExtraSettings extraSettings = new SodiumExtraGameOptions$ExtraSettings();
    private File file;

    public void writeChanges() {
        File file = this.file.getParentFile();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new RuntimeException("Could not create parent directories");
            }
        } else if (!file.isDirectory()) {
            throw new RuntimeException("The parent file is not a directory");
        }
        try (FileWriter fileWriter = new FileWriter(this.file);){
            gson.toJson((Object)this, (Appendable)fileWriter);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Could not save configuration file", iOException);
        }
    }

    public static SodiumExtraGameOptions load(File file) {
        SodiumExtraGameOptions sodiumExtraGameOptions;
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file);){
                sodiumExtraGameOptions = (SodiumExtraGameOptions)gson.fromJson((Reader)fileReader, SodiumExtraGameOptions.class);
            }
            catch (Exception exception) {
                SodiumExtraClientMod.logger().error("Could not parse config, falling back to defaults!", (Throwable)exception);
                sodiumExtraGameOptions = new SodiumExtraGameOptions();
            }
        } else {
            sodiumExtraGameOptions = new SodiumExtraGameOptions();
        }
        sodiumExtraGameOptions.file = file;
        sodiumExtraGameOptions.writeChanges();
        return sodiumExtraGameOptions;
    }

    public void afterSave() {
        this.writeChanges();
    }
}

