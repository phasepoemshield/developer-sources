/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.Config$Builder
 *  org.quiltmc.config.api.Config$UpdateCallback
 *  org.quiltmc.config.api.exceptions.ConfigParseException
 *  org.quiltmc.config.api.metadata.MetadataType
 *  org.quiltmc.config.api.metadata.MetadataType$Builder
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl.builders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.exceptions.ConfigParseException;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.ConfigImpl;
import org.quiltmc.config.impl.builders.SectionBuilderImpl;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.tree.Trie;
import org.quiltmc.config.impl.util.ConfigsImpl;
import org.quiltmc.config.impl.values.ValueKeyImpl;
import org.quiltmc.config.implementor_api.ConfigEnvironment;

public final class ConfigBuilderImpl
implements Config.Builder {
    private final ConfigEnvironment environment;
    private final String familyId;
    private final String id;
    private final Path path;
    private final Map metadata = new LinkedHashMap();
    private final List callbacks = new ArrayList();
    final Trie values = new Trie();
    private String format;

    public Config.Builder metadata(MetadataType metadataType, Consumer consumer) {
        MetadataType metadataType3 = metadataType;
        consumer.accept((MetadataType.Builder)this.metadata.computeIfAbsent(metadataType3, metadataType2 -> metadataType3.newBuilder()));
        return this;
    }

    public Config.Builder callback(Config.UpdateCallback updateCallback) {
        ConfigBuilderImpl configBuilderImpl = this;
        configBuilderImpl.callbacks.add(updateCallback);
        return configBuilderImpl;
    }

    public ConfigBuilderImpl(ConfigEnvironment configEnvironment, String string, String string2, Path path) {
        this.environment = configEnvironment;
        this.familyId = string;
        this.id = string2;
        this.path = path;
        this.format = configEnvironment.getDefaultFormat();
    }

    public Config.Builder format(String string) {
        this.format = string;
        return this;
    }

    public Config.Builder field(TrackedValue trackedValue) {
        ConfigBuilderImpl configBuilderImpl = this;
        configBuilderImpl.values.put((Iterable)trackedValue.key(), (ValueTreeNode)trackedValue);
        return configBuilderImpl;
    }

    public ConfigImpl build() {
        ConfigImpl configImpl;
        Iterator iterator;
        LinkedHashMap<MetadataType, Object> linkedHashMap;
        LinkedHashMap<MetadataType, Object> linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap<MetadataType, Object>();
        for (Map.Entry object2 : ((ConfigBuilderImpl)((Object)iterator)).metadata.entrySet()) {
            linkedHashMap2.put((MetadataType)object2.getKey(), ((MetadataType.Builder)object2.getValue()).build());
        }
        ConfigImpl configImpl2 = configImpl;
        ConfigBuilderImpl configBuilderImpl = iterator;
        ConfigBuilderImpl configBuilderImpl2 = iterator;
        iterator = configBuilderImpl2.environment;
        String string = configBuilderImpl2.id;
        Path path = configBuilderImpl2.path;
        String string2 = configBuilderImpl2.familyId;
        List list = configBuilderImpl2.callbacks;
        Trie trie = configBuilderImpl2.values;
        String string3 = configBuilderImpl2.format;
        configImpl2((ConfigEnvironment)((Object)iterator), string, path, linkedHashMap2, string2, list, trie, string3);
        ConfigsImpl.put(configBuilderImpl.familyId, configImpl2);
        iterator = configImpl.values().iterator();
        while (iterator.hasNext()) {
            ((TrackedValueImpl)((TrackedValue)iterator.next())).setConfig(configImpl2);
        }
        Object object = configImpl2;
        ConfigBuilderImpl.doInitialSerialization((ConfigImpl)object);
        return object;
    }

    public Config.Builder section(String object, Consumer object2) {
        SectionBuilderImpl sectionBuilderImpl;
        ValueKeyImpl valueKeyImpl;
        ConfigBuilderImpl configBuilderImpl = this;
        Consumer consumer = object2;
        object2 = valueKeyImpl;
        valueKeyImpl = new ValueKeyImpl((String)object, new String[0]);
        object = sectionBuilderImpl;
        consumer.accept(new SectionBuilderImpl((ValueKey)object2, this));
        configBuilderImpl.values.put((Iterable)object2, (SectionBuilderImpl)object);
        return configBuilderImpl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void doInitialSerialization(ConfigImpl var0) {
        block9: {
            block10: {
                var1_3 = var0.getEnvironment();
                var2_4 = var1_3.getActualSerializer(var0.getDefaultFileType());
                var3_5 = var1_3.getSerializer(var0.getDefaultFileType());
                v0 = var1_3.getSaveDir().resolve(var0.family()).resolve(var0.savePath());
                var1_3 = v0.resolve(var0.id() + "." + var2_4.getFileExtension());
                var4_6 = v0.resolve(var0.id() + "." + var3_5.getFileExtension());
                Files.createDirectories(var4_6.getParent(), new FileAttribute[0]);
                {
                    catch (IOException var0_1) {
                        throw new ConfigParseException((Throwable)var0_1);
                    }
                }
                if (var2_4 == var3_5) ** GOTO lbl15
                if (Files.exists((Path)var1_3, new LinkOption[0])) break block10;
lbl15:
                // 2 sources

                if (Files.exists(var4_6, new LinkOption[0])) {
                    var3_5.deserialize((Config)var0, Files.newInputStream(var4_6, new OpenOption[0]));
                    break block9;
                }
            }
            if (!Files.exists((Path)var1_3, new LinkOption[0])) break block9;
            v1 = var1_3;
            var2_4.deserialize((Config)var0, Files.newInputStream((Path)var1_3, new OpenOption[0]));
            try {
                Files.delete((Path)v1);
            }
            catch (IOException var0_2) {
                throw new ConfigParseException((Throwable)var0_2);
            }
        }
        var3_5.serialize((Config)var0, Files.newOutputStream(var4_6, new OpenOption[0]));
    }
}

