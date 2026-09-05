/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Serializer
 */
package org.quiltmc.config.implementor_api;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.quiltmc.config.api.Serializer;

public class ConfigEnvironment {
    private final Map serializers;
    private final Path saveFolder;
    private final String defaultFileFormat;
    private final String globalSerializer;

    public Serializer registerSerializer(Serializer serializer) {
        return this.serializers.put(serializer.getFileExtension(), serializer);
    }

    public ConfigEnvironment(Path path, Serializer serializer, Serializer ... serializerArray) {
        this(path, (String)null, serializer, serializerArray);
    }

    public ConfigEnvironment(Path path, String string, Serializer serializer, Serializer ... serializerArray) {
        HashMap<String, Serializer> hashMap;
        HashMap<String, Serializer> hashMap2;
        HashMap<String, Serializer> hashMap3 = hashMap2 = hashMap;
        hashMap3();
        this.serializers = hashMap3;
        hashMap.put(serializer.getFileExtension(), serializer);
        this.defaultFileFormat = serializer.getFileExtension();
        for (Serializer serializer2 : serializerArray) {
            this.serializers.put(serializer2.getFileExtension(), serializer2);
        }
        ConfigEnvironment configEnvironment = this;
        configEnvironment.saveFolder = path;
        configEnvironment.globalSerializer = string;
    }

    public Path getSaveDir() {
        return this.saveFolder;
    }

    public Serializer getSerializer(String string) {
        String string2 = this.globalSerializer;
        if (string2 != null) {
            string = string2;
        }
        return this.getActualSerializer(string);
    }

    public Serializer getActualSerializer(String string) {
        if (this.serializers.containsKey(string)) {
            return (Serializer)this.serializers.get(string);
        }
        throw new RuntimeException("No serializer registered for extension '." + string + "'");
    }

    public String getGlobalFormat() {
        return this.globalSerializer;
    }

    public String getDefaultFormat() {
        return this.defaultFileFormat;
    }
}

