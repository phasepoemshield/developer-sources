/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.api.resourcepack.content;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.raphimc.viabedrock.api.resourcepack.content.Content;

public class InMemoryContent
extends Content {
    protected final Map<String, byte[]> content = new HashMap<String, byte[]>();

    public int size() {
        return this.content.size();
    }

    @Override
    public byte[] get(String path) {
        return this.content.get(path);
    }

    @Override
    public boolean put(String path, byte[] data) {
        return this.content.put(path, data) != null;
    }

    @Override
    public boolean contains(String path) {
        return this.content.containsKey(path);
    }

    @Override
    public List<String> getFilesDeep(String path, String extension) {
        return this.content.keySet().stream().filter(file -> file.startsWith(path) && file.endsWith(extension)).collect(Collectors.toList());
    }

    @Override
    public List<String> getFilesShallow(String path, String extension) {
        return this.content.keySet().stream().filter(file -> file.startsWith(path) && !file.substring(path.length()).contains("/") && file.endsWith(extension)).collect(Collectors.toList());
    }
}

