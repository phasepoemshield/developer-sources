/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack;

import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import net.irisshaders.iris.Iris;

public class LanguageMap {
    private final Map<String, Map<String, String>> translationMaps = new HashMap<String, Map<String, String>>();

    public LanguageMap(Path path2) throws IOException {
        if (!Files.exists(path2, new LinkOption[0])) {
            return;
        }
        try (Stream<Path> stream = Files.list(path2);){
            stream.filter(path -> !Files.isDirectory(path, new LinkOption[0])).forEach(path -> {
                InputStreamReader inputStreamReader;
                String string = path.getFileName().toString().toLowerCase(Locale.ROOT);
                if (!string.endsWith(".lang")) {
                    return;
                }
                String string2 = string.substring(0, string.lastIndexOf("."));
                Properties properties = new Properties();
                try {
                    inputStreamReader = new InputStreamReader(Files.newInputStream(path, new OpenOption[0]), StandardCharsets.UTF_8);
                    try {
                        properties.load(inputStreamReader);
                    }
                    finally {
                        inputStreamReader.close();
                    }
                }
                catch (IOException iOException) {
                    Iris.logger.error("Failed to parse shader pack language file " + String.valueOf(path), (Throwable)iOException);
                }
                inputStreamReader = ImmutableMap.builder();
                properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(arg_0, arg_1) -> LanguageMap.lambda$new$1((ImmutableMap.Builder)inputStreamReader, arg_0, arg_1)));
                this.translationMaps.put(string2, (Map<String, String>)inputStreamReader.build());
            });
        }
    }

    public Set<String> getLanguages() {
        return Collections.unmodifiableSet(this.translationMaps.keySet());
    }

    private static /* synthetic */ void lambda$new$1(ImmutableMap.Builder builder, Object object, Object object2) {
        builder.put((Object)object.toString(), (Object)object2.toString());
    }

    public Map<String, String> getTranslations(String string) {
        return this.translationMaps.get(string);
    }
}

