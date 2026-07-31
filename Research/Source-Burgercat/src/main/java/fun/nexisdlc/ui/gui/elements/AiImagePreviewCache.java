package fun.nexisdlc.ui.gui.elements;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.util.Identifier;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public final class AiImagePreviewCache {
    private static final int MAX_CACHE_SIZE = 32;
    private static final AtomicInteger COUNTER = new AtomicInteger();

    private static final Map<Integer, Entry> ENTRIES = new LinkedHashMap<>(16, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, AiImagePreviewCache.Entry> eldest) {
            if (size() > MAX_CACHE_SIZE) {
                disposeEntry(eldest.getValue());
                return true;
            }
            return false;
        }
    };

    private static final Map<Integer, Boolean> DECODING = new ConcurrentHashMap<>();

    private AiImagePreviewCache() {}

    public static Entry get(byte[] bytes) {
        if (bytes == null || bytes.length == 0) return null;
        int key = Arrays.hashCode(bytes);
        Entry e = ENTRIES.get(key);
        if (e != null) return e;
        if (DECODING.putIfAbsent(key, Boolean.TRUE) != null) return null;
        scheduleDecode(key, bytes);
        return null;
    }

    private static void scheduleDecode(int key, byte[] bytes) {
        Thread t = new Thread(() -> {
            try {
                NativeImage img;
                try {
                    img = NativeImage.read(new ByteArrayInputStream(bytes));
                } catch (Exception primaryError) {
                    byte[] pngBytes = convertToPngBytes(bytes);
                    if (pngBytes == null) {
                        DECODING.remove(key);
                        return;
                    }
                    img = NativeImage.read(new ByteArrayInputStream(pngBytes));
                }
                final NativeImage finalImg = img;
                int w = img.getWidth();
                int h = img.getHeight();
                MinecraftClient.getInstance().execute(() -> {
                    try {
                        TextureManager tm = MinecraftClient.getInstance().getTextureManager();
                        Identifier id = Identifier.of("nexis", "ai_preview_" + COUNTER.getAndIncrement());
                        Supplier<String> nameSup = id::toString;
                        NativeImageBackedTexture tex = new NativeImageBackedTexture(nameSup, finalImg);
                        tm.registerTexture(id, tex);
                        ENTRIES.put(key, new Entry(id, tex, w, h));
                    } catch (Exception ex) {
                        try { finalImg.close(); } catch (Exception ignored) {}
                    } finally {
                        DECODING.remove(key);
                    }
                });
            } catch (Exception ex) {
                DECODING.remove(key);
            }
        }, "AiPreviewDecode");
        t.setDaemon(true);
        t.start();
    }

    private static byte[] convertToPngBytes(byte[] src) {
        try {
            BufferedImage source = ImageIO.read(new ByteArrayInputStream(src));
            if (source == null) return null;
            BufferedImage rgba = source;
            if (source.getType() != BufferedImage.TYPE_INT_ARGB) {
                rgba = new BufferedImage(source.getWidth(), source.getHeight(), BufferedImage.TYPE_INT_ARGB);
                rgba.getGraphics().drawImage(source, 0, 0, null);
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ImageIO.write(rgba, "png", out);
            return out.toByteArray();
        } catch (Exception ex) {
            return null;
        }
    }

    private static void disposeEntry(Entry e) {
        if (e == null) return;
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            if (mc != null && mc.getTextureManager() != null) {
                mc.getTextureManager().destroyTexture(e.id);
            }
            if (e.texture != null) e.texture.close();
        } catch (Exception ignored) {}
    }

    public static final class Entry {
        public final Identifier id;
        public final NativeImageBackedTexture texture;
        public final int width;
        public final int height;

        Entry(Identifier id, NativeImageBackedTexture texture, int width, int height) {
            this.id = id;
            this.texture = texture;
            this.width = width;
            this.height = height;
        }
    }
}
