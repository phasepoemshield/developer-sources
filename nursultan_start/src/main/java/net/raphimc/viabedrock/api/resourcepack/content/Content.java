/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.util.GsonUtil
 *  net.raphimc.viabedrock.api.resourcepack.content.Content$LazyImage
 */
package net.raphimc.viabedrock.api.resourcepack.content;

import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.util.GsonUtil;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;
import net.raphimc.viabedrock.api.resourcepack.content.Content;
import net.raphimc.viabedrock.api.util.JsonUtil;

public abstract class Content {
    private final Map<String, Map<String, String>> langCache = new HashMap<String, Map<String, String>>();

    public String getString(String path) {
        byte[] bytes = this.get(path);
        if (bytes == null) {
            return null;
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public List<String> getLines(String path) {
        String string = this.getString(path);
        if (string == null) {
            return null;
        }
        return List.of(string.split("\\n"));
    }

    public abstract byte[] get(String var1);

    public abstract boolean put(String var1, byte[] var2);

    public abstract boolean contains(String var1);

    public void copyFrom(Content content, String sourcePath, String targetPath) {
        this.put(targetPath, content.get(sourcePath));
    }

    public boolean putString(String path, String string) {
        return this.put(path, string.getBytes(StandardCharsets.UTF_8));
    }

    public byte[] toZip() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0x400000);
        ZipOutputStream zipOutputStream = new ZipOutputStream(baos);
        for (String path : this.getFilesDeep("", "")) {
            ZipEntry entry = new ZipEntry(path);
            entry.setTime(0L);
            zipOutputStream.putNextEntry(entry);
            zipOutputStream.write(this.get(path));
            zipOutputStream.closeEntry();
        }
        zipOutputStream.close();
        return baos.toByteArray();
    }

    public JsonObject getSortedJson(String path) {
        return JsonUtil.sort(this.getJson(path), Comparator.naturalOrder());
    }

    public abstract List<String> getFilesDeep(String var1, String var2);

    public abstract List<String> getFilesShallow(String var1, String var2);

    public boolean putPngImage(String path, BufferedImage image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write((RenderedImage)image, "png", baos);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return this.put(path, baos.toByteArray());
    }

    public boolean putPngImage(String path, LazyImage image) {
        return this.put(path, image.getPngBytes());
    }

    public LazyImage getShortnameImage(String path) {
        return this.getImage(this.getFullPath(path, "png", "jpg"));
    }

    public boolean putJson(String path, JsonObject json) {
        return this.putString(path, GsonUtil.getGson().toJson((JsonElement)json));
    }

    public Map<String, String> getLang(String path) {
        return this.langCache.computeIfAbsent(path, k -> {
            List<String> lines = this.getLines((String)k);
            return Collections.unmodifiableMap(lines.stream().filter(line -> !line.startsWith("##")).filter(line -> line.contains("=")).map(line -> line.contains("##") ? line.substring(0, line.indexOf("##")) : line).map(String::trim).map(line -> line.split("=", 2)).collect(Collectors.toMap(parts -> parts[0], parts -> parts[1], (o, n) -> n)));
        });
    }

    public JsonObject getJson(String path) {
        String string = this.getString(path);
        if (string == null) {
            return null;
        }
        return (JsonObject)GsonUtil.getGson().fromJson(string.trim(), JsonObject.class);
    }

    public boolean putLines(String path, List<String> lines) {
        return this.putString(path, String.join((CharSequence)"\\n", lines));
    }

    public String getFullPath(String shortNamePath, String ... extensions) {
        if (this.contains(shortNamePath)) {
            return shortNamePath;
        }
        for (String extension : extensions) {
            String path = shortNamePath + "." + extension;
            if (!this.contains(path)) continue;
            return path;
        }
        return null;
    }

    public LazyImage getImage(String path) {
        boolean isJpg;
        byte[] bytes = this.get(path);
        if (bytes == null) {
            return null;
        }
        boolean isPng = bytes.length > 8 && bytes[0] == -119 && bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71 && bytes[4] == 13 && bytes[5] == 10 && bytes[6] == 26 && bytes[7] == 10;
        boolean bl = isJpg = bytes.length > 2 && bytes[0] == -1 && bytes[1] == -40 && bytes[2] == -1;
        if (!isPng && !isJpg) {
            return null;
        }
        return new LazyImage(bytes, isPng ? "png" : "jpg");
    }
}

