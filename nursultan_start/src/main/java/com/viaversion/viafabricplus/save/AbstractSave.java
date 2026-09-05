/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 */
package com.viaversion.viafabricplus.save;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public abstract class AbstractSave {
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final Path path;

    public AbstractSave(String name) {
        this.path = ViaFabricPlusImpl.INSTANCE.getPath().resolve(name + ".json");
    }

    public void init() {
        if (Files.exists(this.path, new LinkOption[0])) {
            try (BufferedReader reader = Files.newBufferedReader(this.path);){
                JsonObject object = (JsonObject)GSON.fromJson((Reader)reader, JsonObject.class);
                if (object != null) {
                    this.read(object);
                } else {
                    ViaFabricPlusImpl.INSTANCE.getLogger().error("The file {} is empty!", (Object)this.path.getFileName());
                }
            }
            catch (Exception e) {
                ViaFabricPlusImpl.INSTANCE.getLogger().error("Failed to read file: {}!", (Object)this.path.getFileName(), (Object)e);
            }
        }
    }

    public void save() {
        try (BufferedWriter writer = Files.newBufferedWriter(this.path, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);){
            JsonObject object = new JsonObject();
            this.write(object);
            GSON.toJson((JsonElement)object, (Appendable)writer);
        }
        catch (Exception e) {
            ViaFabricPlusImpl.INSTANCE.getLogger().error("Failed to write file: {}!", (Object)this.path.getFileName(), (Object)e);
        }
    }

    public abstract void write(JsonObject var1);

    public abstract void read(JsonObject var1);

    public void postInit() {
    }

    public Path getPath() {
        return this.path;
    }
}

