/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 */
package me.shedaniel.autoconfig.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.ConfigSerializer;
import me.shedaniel.autoconfig.serializer.ConfigSerializer$SerializationException;
import me.shedaniel.autoconfig.util.Utils;

public class GsonConfigSerializer<T extends ConfigData>
implements ConfigSerializer<T> {
    private Config definition;
    private Class<T> configClass;
    private Gson gson;

    @Override
    public T deserialize() throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        if (Files.exists(path, new LinkOption[0])) {
            try {
                BufferedReader bufferedReader = Files.newBufferedReader(path);
                ConfigData configData = (ConfigData)this.gson.fromJson((Reader)bufferedReader, this.configClass);
                bufferedReader.close();
                return (T)configData;
            }
            catch (JsonParseException | IOException throwable) {
                throw new ConfigSerializer$SerializationException(throwable);
            }
        }
        return this.createDefault();
    }

    public GsonConfigSerializer(Config config, Class<T> clazz, Gson gson) {
        this.definition = config;
        this.configClass = clazz;
        this.gson = gson;
    }

    public GsonConfigSerializer(Config config, Class<T> clazz) {
        this(config, clazz, new GsonBuilder().setPrettyPrinting().create());
    }

    @Override
    public void serialize(T t) throws ConfigSerializer$SerializationException {
        Path path = this.getConfigPath();
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);
            this.gson.toJson(t, (Appendable)bufferedWriter);
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            throw new ConfigSerializer$SerializationException(iOException);
        }
    }

    @Override
    public T createDefault() {
        return (T)((ConfigData)Utils.constructUnsafely(this.configClass));
    }

    private Path getConfigPath() {
        return Utils.getConfigFolder().resolve(this.definition.name() + ".json");
    }
}

