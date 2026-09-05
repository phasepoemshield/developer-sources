/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  net.raphimc.viabedrock.ViaBedrock
 */
package net.raphimc.viabedrock.api.resourcepack;

import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.resourcepack.content.Content;
import net.raphimc.viabedrock.api.resourcepack.content.ZipContent;

public class ResourcePack {
    private static final byte[] CONTENTS_JSON_ENCRYPTION_VERSION = new byte[]{0, 0, 0, 0};
    private static final byte[] CONTENTS_JSON_ENCRYPTION_MAGIC = new byte[]{-4, -71, -49, -101};
    private static final Set<String> UNENCRYPTED_FILES = Set.of("manifest.json", "pack_manifest.json", "pack_icon.png", "pack_icon.jpg", "README.txt");
    private final Key key;
    private final String name;
    private final Content content;

    public ResourcePack(Content content) {
        try {
            List<String> files;
            if (!content.contains("manifest.json") && !content.contains("pack_manifest.json") && (files = content.getFilesDeep("", "")).size() == 1 && files.get(0).endsWith(".zip")) {
                content = new ZipContent(content.get(files.get(0)));
            }
            if (!content.contains("manifest.json") && !content.contains("pack_manifest.json")) {
                throw new IllegalStateException("Missing manifest.json");
            }
            JsonObject manifestJson = content.contains("manifest.json") ? content.getJson("manifest.json") : content.getJson("pack_manifest.json");
            int formatVersion = manifestJson.get("format_version").getAsInt();
            if (formatVersion < 1 || formatVersion > 3) {
                throw new IllegalStateException("Unsupported format version: " + formatVersion);
            }
            JsonObject headerObj = manifestJson.getAsJsonObject("header");
            UUID id = UUID.fromString(headerObj.get("uuid").getAsString());
            String version = formatVersion >= 3 ? headerObj.get("version").getAsString() : StreamSupport.stream(headerObj.getAsJsonArray("version").spliterator(), false).map(JsonElement::getAsString).collect(Collectors.joining("."));
            this.key = new Key(id, version);
            this.name = headerObj.get("name").getAsString();
            this.content = content;
        }
        catch (Throwable e) {
            throw new RuntimeException("Failed to parse resource pack", e);
        }
    }

    public void decryptContent(byte[] contentKey, String expectedContentId) {
        try {
            if (!this.content.contains("contents.json")) {
                throw new IllegalStateException("Missing contents.json");
            }
            DataInputStream contents = new DataInputStream(new ByteArrayInputStream(this.content.get("contents.json")));
            contents.mark(256);
            byte[] version = contents.readNBytes(4);
            if (!Arrays.equals(version, CONTENTS_JSON_ENCRYPTION_VERSION)) {
                throw new IllegalStateException("contents.json version mismatch: " + Arrays.toString(version) + " != " + Arrays.toString(CONTENTS_JSON_ENCRYPTION_VERSION));
            }
            byte[] magic = contents.readNBytes(4);
            if (!Arrays.equals(magic, CONTENTS_JSON_ENCRYPTION_MAGIC)) {
                throw new IllegalStateException("contents.json magic mismatch: " + Arrays.toString(magic) + " != " + Arrays.toString(CONTENTS_JSON_ENCRYPTION_MAGIC));
            }
            contents.skipNBytes(8L);
            String contentId = new String(contents.readNBytes(contents.readUnsignedByte()), StandardCharsets.UTF_8);
            if (!contentId.equalsIgnoreCase(expectedContentId)) {
                throw new IllegalStateException("contents.json content id mismatch: " + contentId + " != " + expectedContentId);
            }
            contents.reset();
            contents.skipNBytes(256L);
            Cipher aesCfb8 = Cipher.getInstance("AES/CFB8/NoPadding");
            aesCfb8.init(2, (java.security.Key)new SecretKeySpec(contentKey, "AES"), new IvParameterSpec(Arrays.copyOfRange(contentKey, 0, 16)));
            this.content.put("contents.json", aesCfb8.doFinal(contents.readAllBytes()));
            JsonObject contentsJson = this.content.getJson("contents.json");
            JsonArray contentArray = contentsJson.getAsJsonArray("content");
            for (JsonElement element : contentArray) {
                JsonObject contentItem = element.getAsJsonObject();
                if (!contentItem.has("key") || contentItem.get("key").isJsonNull()) continue;
                String path = contentItem.get("path").getAsString();
                if (!this.content.contains(path)) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing resource pack file: " + path);
                    continue;
                }
                if (UNENCRYPTED_FILES.contains(path)) continue;
                byte[] key = contentItem.get("key").getAsString().getBytes(StandardCharsets.ISO_8859_1);
                aesCfb8.init(2, (java.security.Key)new SecretKeySpec(key, "AES"), new IvParameterSpec(Arrays.copyOfRange(key, 0, 16)));
                this.content.put(path, aesCfb8.doFinal(this.content.get(path)));
            }
        }
        catch (Throwable e) {
            throw new RuntimeException("Failed to decrypt content", e);
        }
    }

    public boolean isContentEncrypted() {
        try {
            if (!this.content.contains("contents.json")) {
                return false;
            }
            DataInputStream contents = new DataInputStream(new ByteArrayInputStream(this.content.get("contents.json")));
            byte[] version = contents.readNBytes(4);
            if (!Arrays.equals(version, CONTENTS_JSON_ENCRYPTION_VERSION)) {
                return false;
            }
            byte[] magic = contents.readNBytes(4);
            return Arrays.equals(magic, CONTENTS_JSON_ENCRYPTION_MAGIC);
        }
        catch (Throwable e) {
            return false;
        }
    }

    public Key key() {
        return this.key;
    }

    public UUID id() {
        return this.key.id();
    }

    public String version() {
        return this.key.version();
    }

    public String name() {
        return this.name;
    }

    public Content content() {
        return this.content;
    }

    public record Key(UUID id, String version) {
        public static Key fromString(String s) {
            String[] parts = s.split("_", 2);
            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid resource pack key: " + s);
            }
            return new Key(UUID.fromString(parts[0]), parts[1]);
        }

        public String toString() {
            return String.valueOf(this.id) + "_" + this.version;
        }
    }
}

