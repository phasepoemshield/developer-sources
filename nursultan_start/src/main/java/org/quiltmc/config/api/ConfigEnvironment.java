/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.implementor_api.ConfigEnvironment
 */
package org.quiltmc.config.api;

import java.nio.file.Path;
import org.quiltmc.config.api.Serializer;

public final class ConfigEnvironment
extends org.quiltmc.config.implementor_api.ConfigEnvironment {
    public Serializer registerSerializer(Serializer serializer) {
        return super.registerSerializer(serializer);
    }

    public ConfigEnvironment(Path path, Serializer serializer, Serializer ... serializerArray) {
        this(path, (String)null, serializer, serializerArray);
    }

    public ConfigEnvironment(Path path, String string, Serializer serializer, Serializer ... serializerArray) {
        super(path, string, serializer, serializerArray);
    }

    public Path getSaveDir() {
        return super.getSaveDir();
    }

    public Serializer getSerializer(String string) {
        return super.getSerializer(string);
    }

    public Serializer getActualSerializer(String string) {
        return super.getActualSerializer(string);
    }

    public String getGlobalFormat() {
        return super.getGlobalFormat();
    }

    public String getDefaultFormat() {
        return super.getDefaultFormat();
    }
}

